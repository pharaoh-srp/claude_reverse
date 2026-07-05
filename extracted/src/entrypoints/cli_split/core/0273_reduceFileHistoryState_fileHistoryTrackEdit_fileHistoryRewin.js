      e.debugMode = function () {
        o = false;
      };
      e.safeMode = function () {
        o = true;
      };
      e.versionString = "11.11.1";
      e.regex = {
        concat: p5e,
        lookahead: Uxa,
        either: bfo,
        optional: Rkp,
        anyNumberOfTimes: Ckp
      };
      for (let H in gjn) {
        if (typeof gjn[H] === "object") {
          Mxa(gjn[H]);
        }
      }
      Object.assign(e, gjn);
      return e;
    };
    var Qpt = Kxa({});
    Qpt.newInstance = () => Kxa({});
    Yxa.exports = Qpt;
    Qpt.HighlightJS = Qpt;
    Qpt.default = Qpt;
  });
  function Zpt() {
    if (Efo) {
      return Efo;
    }
    let e = Jxa();
    let t = "default" in e && e.default ? e.default : e;
    Rxa(t);
    Efo = t;
    return t;
  }
  function pAp(e) {
    return e.default ?? e;
  }
  function T$(e) {
    let t = Zpt();
    let n = e.toLowerCase();
    let r = Object.prototype.hasOwnProperty.call(fjn, n) ? n : Object.prototype.hasOwnProperty.call(hjn, n) ? hjn[n] : null;
    if (r !== null) {
      if (Qxa.vZc(r)) {
        return null;
      }
      if (!Xxa.vZc(r)) {
        let s = fjn[r];
        if (typeof s !== "function") {
          return null;
        }
        try {
          t.registerLanguage(r, pAp(s()));
        } catch (i) {
          Qxa.add(r);
          Oe(i);
          return null;
        }
        Xxa.add(r);
        for (let i of Cxa[r] ?? []) {
          T$(i);
        }
      }
      return r;
    }
    let o = t.getLanguage(n);
    if (!o) {
      return null;
    }
    if (!Zxa.vZc(o)) {
      Zxa.add(o);
      for (let s of mAp(o)) {
        if (s !== n) {
          T$(s);
        }
      }
    }
    return n;
  }
  function mAp(e) {
    let t = new Set();
    let n = new Set();
    function r(o) {
      if (o === null || typeof o !== "object" || n.vZc(o)) {
        return;
      }
      n.add(o);
      let s = o;
      for (let i of [s.subLanguage ?? []].flat()) {
        if (typeof i === "string") {
          t.add(i);
        }
      }
      for (let i of s.contains ?? []) {
        r(i);
      }
      r(s.starts);
      for (let i of s.variants ?? []) {
        r(i);
      }
    }
    r(e);
    return t;
  }
  var Efo = null;
  var Xxa;
  var Qxa;
  var Zxa;
  var vfo = __lazy(() => {
    SWt();
    mfo();
    Rn();
    Xxa = new Set();
    Qxa = new Set();
    Zxa = new WeakSet();
  });
  function hAp(e) {
    let t = e.replace(/^hljs-/, "");
    for (;;) {
      let n = fAp.get(t);
      if (n) {
        return n;
      }
      let r = t.lastIndexOf(".");
      if (r < 0) {
        return;
      }
      t = t.slice(0, r);
    }
  }
  function tka(e) {
    if (typeof e === "string") {
      return e;
    }
    let t = e.children.map(tka).join("");
    let n = e.scope ?? e.kind;
    let r = n ? hAp(n) : undefined;
    return r ? r(t) : t;
  }
  function gAp(e, t) {
    let n = t?.language;
    if (!n) {
      return e;
    }
    let r;
    try {
      let i = T$(n);
      if (!i) {
        return e;
      }
      r = Zpt().highlight(e, {
        language: i,
        ignoreIllegals: true
      });
    } catch {
      return e;
    }
    let o = r._emitter ?? r.emitter;
    let s = o?.rootNode ?? o?.root;
    if (!s || typeof s === "string") {
      return e;
    }
    return s.children.map(tka).join("");
  }
  function yAp(e) {
    return T$(e) !== null;
  }
  function GDe() {
    return _Ap;
  }
  async function m5e(e) {
    let t = eka.extname(e).slice(1);
    if (!t) {
      return "unknown";
    }
    let n = T$(t);
    if (!n) {
      return "unknown";
    }
    if (xxa(n)) {
      return "plugin";
    }
    return Zpt().getLanguage(n)?.name ?? "unknown";
  }
  var eka;
  var fAp;
  var _Ap;
  var f5e = __lazy(() => {
    vfo();
    SWt();
    eka = require("path");
    fAp = new Map(Object.entries({
      keyword: _$u.blue,
      built_in: _$u.cyan,
      type: _$u.cyan.dim,
      literal: _$u.blue,
      number: _$u.green,
      regexp: _$u.red,
      string: _$u.red,
      subst: _$u.reset,
      symbol: _$u.reset,
      class: _$u.blue,
      function: _$u.yellow,
      title: _$u.reset,
      "title.function": _$u.yellow,
      "title.class": _$u.blue,
      params: _$u.reset,
      comment: _$u.green,
      doctag: _$u.green,
      meta: _$u.grey,
      "meta-keyword": _$u.reset,
      "meta-string": _$u.reset,
      "meta.keyword": _$u.reset,
      "meta.string": _$u.reset,
      section: _$u.reset,
      tag: _$u.grey,
      name: _$u.blue,
      attr: _$u.cyan,
      attribute: _$u.reset,
      variable: _$u.reset,
      bullet: _$u.reset,
      code: _$u.reset,
      emphasis: _$u.italic,
      strong: _$u.bold,
      link: _$u.underline,
      quote: _$u.reset,
      addition: _$u.green,
      deletion: _$u.red
    }));
    _Ap = {
      highlight: gAp,
      supportsLanguage: yAp
    };
  });
  function wfo(e) {
    return bAp.includes(e);
  }
  async function Cfo(e, t, n, r) {
    let o;
    if (e.getPath && t) {
      let s = e.inputSchema.safeParse(t);
      if (s.success) {
        let i = e.getPath(s.data);
        if (i) {
          o = await m5e(i);
        }
      }
    }
    return {
      decision: n,
      source: r,
      tool_name: e.name,
      ...(o && {
        language: o
      })
    };
  }
  function SAp(e) {
    if (e.type === "classifier") {
      return "classifier";
    }
    switch (e.type) {
      case "hook":
        return "hook";
      case "user":
        return e.permanent ? "user_permanent" : "user_temporary";
      case "user_abort":
        return "user_abort";
      case "user_reject":
        return "user_reject";
      default:
        return "unknown";
    }
  }
  function emt(e, t, n) {
    return {
      messageID: br(e),
      toolName: qi(t),
      sandboxEnabled: SandboxManager.isSandboxingEnabled(),
      ...(n !== undefined && {
        waiting_for_user_permission_ms: n
      })
    };
  }
  function TAp(e, t, n) {
    let r = e.name === "Bash";
    if (!r && e.name !== "PowerShell") {
      return;
    }
    if (t === null || typeof t !== "object" || !("command" in t) || typeof t.command !== "string") {
      return;
    }
    let o = r ? oWe(t.command) : c5e(t.command);
    return {
      destructive_category: o ?? "none",
      destructive_target_scope: Xce(t.command, Nt(), o),
      git_destructive_target: sWe(t.command, o),
      permission_mode: n
    };
  }
  function EAp(e, t, n, r, o) {
    if (n === "config") {
      logEvent("tengu_tool_use_granted_in_config", {
        ...emt(t, e.name, undefined),
        ...o
      });
      Pe("permission_auto_approve_config");
      return;
    }
    if (n.type === "classifier") {
      logEvent("tengu_tool_use_granted_by_classifier", {
        ...emt(t, e.name, r),
        ...o
      });
      return;
    }
    switch (n.type) {
      case "user":
        logEvent(n.permanent ? "tengu_tool_use_granted_in_prompt_permanent" : "tengu_tool_use_granted_in_prompt_temporary", {
          ...emt(t, e.name, r),
          ...o
        });
        Pe("permission_user_grant");
        break;
      case "hook":
        logEvent("tengu_tool_use_granted_by_permission_hook", {
          ...emt(t, e.name, r),
          ...o,
          permanent: n.permanent
        });
        Pe("permission_auto_approve_hook");
        break;
      default:
        break;
    }
  }
  function vAp(e, t, n, r, o) {
    if (n === "config") {
      logEvent("tengu_tool_use_denied_in_config", {
        ...emt(t, e.name, undefined),
        ...o
      });
      Pe("permission_auto_deny_config");
      return;
    }
    logEvent("tengu_tool_use_rejected_in_prompt", {
      ...emt(t, e.name, r),
      ...o,
      ...(n.type === "hook" ? {
        isHook: true
      } : {
        hasFeedback: n.type === "user_reject" ? n.hasFeedback : false
      })
    });
    Pe(n.type === "hook" ? "permission_auto_deny_hook" : "permission_user_deny");
  }
  function rka(e, t, n) {
    let {
      tool: r,
      input: o,
      toolUseContext: s,
      messageId: i,
      toolUseID: a,
      permissionMode: l
    } = e;
    let {
      decision: c,
      source: u
    } = t;
    let d = n !== undefined ? Date.now() - n : undefined;
    let p = TAp(r, o, l);
    if (t.decision === "accept") {
      EAp(r, i, t.source, d, p);
    } else {
      vAp(r, i, t.source, d, p);
    }
    let m = u === "config" ? "config" : SAp(u);
    if (wfo(r.name)) {
      Cfo(r, o, c, m).then(h => getCodeEditToolDecisionCounter()?.add(1, h));
    }
    if (!s.toolDecisions) {
      s.toolDecisions = {};
    }
    s.toolDecisions[a] = {
      source: m,
      decision: c,
      timestamp: Date.now()
    };
    let f = J2t(r.name, o, r.userFacingName?.(undefined));
    su("tool_decision", {
      decision: c,
      source: m,
      tool_name: qi(r.name),
      tool_use_id: a,
      ...(Object.keys(f).length > 0 && {
        tool_parameters: De(f)
      })
    });
  }
  function oka(e, t, n) {
    if (t !== undefined && t !== "config") {
      if (t === "hook") {
        return "hook:PermissionRequest";
      }
      if (t === "classifier" && n?.type === "classifier") {
        return nka(n);
      }
      return t;
    }
    if (n === undefined) {
      return "unknown";
    }
    switch (n.type) {
      case "rule":
        return `rule:${n.rule.source}`;
      case "mode":
        return `mode:${n.mode}`;
      case "hook":
        return `hook:${ii(n.hookName, ":")}`;
      case "classifier":
        return nka(n);
      case "subcommandResults":
        {
          let r = new Set();
          for (let s of n.reasons.values()) {
            if (s.behavior === e && s.decisionReason !== undefined) {
              r.add(oka(e, undefined, s.decisionReason));
            }
          }
          let [o] = r;
          if (r.size === 1 && o !== undefined) {
            return o;
          }
          if (r.size > 1) {
            return `subcommands:${[...new Set([...r].map(i => ii(i, ":")))].sort().join("+")}`;
          }
          return "subcommandResults";
        }
      case "other":
        if (n.reason === "Auto-allowed with sandbox (autoAllowBashIfSandboxed enabled)") {
          return "sandboxAutoAllow";
        }
        if (n.reason === "Read-only command is allowed") {
          return "readOnlyCommand";
        }
        if (n.reason === "Auto mode classifier transcript exceeded context window \u2014 falling back to manual approval (try /compact to reduce conversation size)") {
          return "classifierTranscriptTooLong";
        }
        if (n.bashMissKind !== undefined) {
          return `bashMiss:${n.bashMissKind}`;
        }
        return "other";
      case "asyncAgent":
        if (n.reason === "ask rule on hook-rewritten input") {
          return "hookRewrittenInputAsk";
        }
        return n.type;
      case "safetyCheck":
        if (n.reason.startsWith("Denied by Bash prompt rule")) {
          return "bashPromptRule";
        }
        return n.type;
      case "permissionPromptTool":
      case "sandboxOverride":
      case "workingDir":
        return n.type;
      default:
        return "unknown";
    }
  }
  function nka(e) {
    return e.reason === "Classifier unavailable" ? `classifier:${e.classifier}:unavailable` : `classifier:${e.classifier}`;
  }
  function ska({
    toolName: e,
    isMcp: t,
    messageId: n,
    toolUseID: r,
    permissionMode: o,
    behavior: s,
    decisionReason: i,
    resolvedSource: a
  }) {
    return;
  }
  var bAp;
  var Rfo = __lazy(() => {
    Ot();
    Gu();
    at();
    ln();
    iWe();
    Kpt();
    f5e();
    vo();
    dw();
    Th();
    Zn();
    yS();
    bAp = ["Edit", "Write", "NotebookEdit"];
  });
  function CAp() {
    let e = process.env.CLAUDE_CODE_FILE_READ_MAX_OUTPUT_TOKENS;
    if (e) {
      let t = parseInt(e, 10);
      if (!isNaN(t) && t > 0) {
        return t;
      }
    }
    return;
  }
  var $de;
  var UTe;
  var h5e;
  var VDe = __lazy(() => {
    $n();
    Zl();
    $de = class $de extends Error {
      tokenCount;
      maxTokens;
      constructor(e, t) {
        super(`File content (${e} tokens) exceeds maximum allowed tokens (${t}). Use offset and limit parameters to read specific portions of the file, or search for specific content instead of reading the whole file.`);
        this.tokenCount = e;
        this.maxTokens = t;
        this.name = "MaxFileReadTokenExceededError";
      }
    };
    UTe = TEr(() => {
      let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_wren", {});
      let t = typeof e?.maxSizeBytes === "number" && Number.isFinite(e.maxSizeBytes) && e.maxSizeBytes > 0 ? e.maxSizeBytes : 262144;
      let r = CAp() ?? (typeof e?.maxTokens === "number" && Number.isFinite(e.maxTokens) && e.maxTokens > 0 ? e.maxTokens : 25000);
      let o = typeof e?.includeMaxSizeInPrompt === "boolean" ? e.includeMaxSizeInPrompt : undefined;
      let s = typeof e?.targetedRangeNudge === "boolean" ? e.targetedRangeNudge : undefined;
      return {
        maxSizeBytes: t,
        maxTokens: r,
        includeMaxSizeInPrompt: o,
        targetedRangeNudge: s
      };
    });
    h5e = TEr(() => getFeatureValue_CACHED_MAY_BE_STALE("tengu_tab_read_sep", false));
  });
  function ika() {
    return "MCP Wait For Servers";
  }
  function aka(e) {
    let t = e.servers?.join(", ");
    return t ? `Wait for MCP servers to connect: ${t}` : "Wait for pending MCP servers to connect";
  }
  function lka() {
    return (getMcpClientsFromAccessor() ?? []).filter(e => e.type === "pending").map(e => e.name);
  }
  function kfo(e) {
    if (P1() && CX(e)) {
      return false;
    }
    return lka().length > 0;
  }
  var xAp;
  var kAp;
  var cka;
  var Afo = __lazy(() => {
    at();
    Ot();
    ci();
    je();
    Eo();
    RX();
    xAp = we(() => v.object({
      servers: v.array(v.string()).optional().describe("Server names to wait for (default: all pending)")
    }));
    kAp = we(() => v.object({
      ready: v.boolean(),
      connected: v.array(v.string()),
      failed: v.array(v.string()),
      stillPending: v.array(v.string()),
      needsAuth: v.array(v.string()),
      disabled: v.array(v.string()),
      unknown: v.array(v.string())
    }));
    cka = Xs({
      isEnabled() {
        return kfo(getMainLoopModel());
      },
      isConcurrencySafe() {
        return false;
      },
      isReadOnly() {
        return true;
      },
      name: "WaitForMcpServers",
      maxResultSizeChars: 1e4,
      async description() {
        return uuo();
      },
      async prompt() {
        return uuo();
      },
      get inputSchema() {
        return xAp();
      },
      get outputSchema() {
        return kAp();
      },
      async checkPermissions(e) {
        return {
          behavior: "allow",
          updatedInput: e
        };
      },
      async call(e, t) {
        let {
          options: {
            refreshMcpClients: n,
            mcpClients: r
          },
          abortController: o,
          getMcp: s
        } = t;
        let i = () => n?.() ?? s?.().clients ?? r;
        let a = e.servers?.length ? e.servers : lka();
        let l = new Set(a.map(Bl));
        let c = () => i().filter(C => a.includes(C.name) || l.vZc(Bl(C.name)));
        let u = Date.now();
        let d = u + 5000;
        while (c().some(C => C.type === "pending") && Date.now() < d && !o.signal.aborted) {
          await sleep(50, o.signal);
        }
        let p = Date.now() - u;
        let m = c();
        let f = [];
        let h = [];
        let g = [];
        let y = [];
        let _ = [];
        for (let C of m) {
          switch (C.type) {
            case "connected":
              f.push(C.name);
              break;
            case "failed":
              h.push(C.name);
              break;
            case "pending":
              g.push(C.name);
              break;
            case "needs-auth":
              y.push(C.name);
              break;
            case "disabled":
              _.push(C.name);
              break;
            default:
          }
        }
        let b = new Set(m.map(C => Bl(C.name)));
        let S = a.filter(C => !b.vZc(Bl(C)));
        let E = g.length === 0 && h.length === 0 && y.length === 0 && _.length === 0 && S.length === 0;
        logForDebugging(`[WaitForMcpServers] waited=${p}ms connected=${f.join(",")} failed=${h.join(",")} pending=${g.join(",")} needsAuth=${y.join(",")} disabled=${_.join(",")} unknown=${S.join(",")}`);
        logEvent("tengu_mcp_pending_call", {
          requestedCount: a.length,
          connectedCount: f.length,
          failedCount: h.length,
          pendingCount: g.length,
          needsAuthCount: y.length,
          disabledCount: _.length,
          unknownCount: S.length,
          waitMs: p,
          matched: E,
          matchType: "wait",
          success: E
        });
        return {
          data: {
            ready: E,
            connected: f,
            failed: h,
            stillPending: g,
            needsAuth: y,
            disabled: _,
            unknown: S
          }
        };
      },
      renderToolUseMessage: aka,
      userFacingName: ika,
      mapToolResultToToolResultBlockParam(e, t) {
        let n = [`ready: ${e.ready}`, e.connected.length ? `Connected (their tools are now available \u2014 call them directly): ${e.connected.join(", ")}` : "", e.failed.length ? `Failed to connect: ${e.failed.join(", ")}` : "", e.stillPending.length ? `Still connecting (try again or proceed without): ${e.stillPending.join(", ")}` : "", e.needsAuth.length ? `Needs authentication (ask the user to run /mcp): ${e.needsAuth.join(", ")}` : "", e.disabled.length ? `Disabled (ask the user to enable via /mcp): ${e.disabled.join(", ")}` : "", e.unknown.length ? `Unknown (no MCP server with this name is configured): ${e.unknown.join(", ")}` : ""].filter(Boolean);
        return {
          type: "tool_result",
          tool_use_id: t,
          content: n.join(`
`),
          is_error: !e.ready
        };
      }
    });
  });
  function tmt(e, t) {
    let n = 0;
    let r = [];
    function o() {
      if (n < e) {
        n++;
        return Promise.resolve();
      }
      return new Promise(i => r.push(i));
    }
    function s() {
      let i = r.shift();
      if (i) {
        i();
      } else {
        n--;
      }
    }
    return async (...i) => {
      await o();
      try {
        return await t(...i);
      } finally {
        s();
      }
    };
  }
  async function bjn(e) {
    let t = Ifo.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = await AAp(e);
    Ifo.set(e, n);
    return n;
  }
  function Pfo(e) {
    Ifo.delete(e);
  }
  async function AAp(e) {
    let t = ef(e) ? process.env.GH_TOKEN || process.env.GITHUB_TOKEN : Ign(process.env.GH_HOST, e) ? process.env.GH_ENTERPRISE_TOKEN || process.env.GITHUB_ENTERPRISE_TOKEN : undefined;
    if (t) {
      return t;
    }
    if (!(await Qm("gh"))) {
      return null;
    }
    let {
      stdout: r,
      code: o
    } = await execFileNoThrow("gh", ["auth", "token", "--hostname", e], {
      timeout: 5000,
      preserveOutputOnError: false,
      env: {
        ...process.env,
        GH_TOKEN: "",
        GITHUB_TOKEN: "",
        GH_ENTERPRISE_TOKEN: "",
        GITHUB_ENTERPRISE_TOKEN: ""
      }
    });
    if (o !== 0) {
      return null;
    }
    let s = r.trim();
    return s.length > 0 ? s : null;
  }
  var Ifo;
  var Ofo = __lazy(() => {
    ji();
    fk();
    Ifo = new Map();
  });
  function gka(e, t) {
    if (e) {
      return "draft";
    }
    switch (t) {
      case "APPROVED":
        return "approved";
      case "CHANGES_REQUESTED":
        return "changes_requested";
      default:
        return "pending";
    }
  }
  async function yka() {
    if (!(await getIsGit())) {
      return null;
    }
    let [t, n] = await Promise.all([getBranch(), getDefaultBranch()]);
    if (t === n) {
      return null;
    }
    return (() => CWt() ? NAp(t) : IAp(n))();
  }
  function CWt() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_harbor_prism", false);
  }
  async function IAp(e) {
    let {
      stdout: t,
      code: n
    } = await execFileNoThrow("gh", ["pr", "view", "--json", "number,url,reviewDecision,isDraft,headRefName,state"], {
      timeout: 5000,
      preserveOutputOnError: false
    });
    if (n !== 0 || !t.trim()) {
      return null;
    }
    try {
      let r = qt(t);
      if (r.headRefName === e || r.headRefName === "main" || r.headRefName === "master") {
        return null;
      }
      if (r.state === "MERGED" || r.state === "CLOSED") {
        return null;
      }
      return {
        number: r.number,
        url: r.url,
        reviewState: gka(r.isDraft, r.reviewDecision)
      };
    } catch {
      return null;
    }
  }
  async function NAp(e) {
    if (Vi() || Tka()) {
      return null;
    }
    if (e === "main" || e === "master") {
      return null;
    }
    let t = await FAp();
    if (!t) {
      return null;
    }
    let n = await bjn(t.host);
    if (!n) {
      if (!ef(t.host) && !Ign(process.env.GH_HOST, t.host)) {
        return null;
      }
      Pfo(t.host);
      return "needs-auth";
    }
    let r = await BAp(t, n);
    if (Dfo?.branch !== e) {
      Dfo = {
        branch: e,
        etag: null,
        pr: null,
        reviewDecision: "",
        lastReviewFetchAt: 0,
        redirectedListUrl: null
      };
    }
    let o = Dfo;
    let s = oMt(t.host);
    let i = new URL(s).origin;
    let a = `${s}/repos/${r.owner}/${r.repo}/pulls?head=${encodeURIComponent(t.owner)}:${encodeURIComponent(e)}&state=open&per_page=1`;
    let l = false;
    try {
      let m = AbortSignal.timeout(5000);
      let f = {
        Authorization: `Bearer ${n}`,
        Accept: "application/vnd.github+json",
        "X-GitHub-Api-Version": "2022-11-28",
        "User-Agent": dg(),
        ...(o.etag && {
          "If-None-Match": o.etag
        })
      };
      let h = b => fetch(b, {
        ...getProxyFetchOptions({
          url: b
        }),
        keepalive: false,
        method: "GET",
        headers: f,
        redirect: "manual",
        signal: m
      });
      let g = await h(o.redirectedListUrl ?? a);
      let y = OAp.vZc(g.status) ? g.headers.get("location") : null;
      let _ = y ? new URL(y, a) : null;
      if (_?.origin === i) {
        o.redirectedListUrl = _.href;
        g = await h(_.href);
      }
      if (g.status === 304) {
        ;
      } else if (g.ok) {
        o.etag = g.headers.get("etag");
        l = true;
        let b = DAp().safeParse(await g.json());
        let S = b.success ? b.data[0] : undefined;
        if (S && o.pr?.number !== S.number) {
          o.reviewDecision = "";
        }
        o.pr = S ? {
          number: S.number,
          url: S.html_url,
          isDraft: S.draft
        } : null;
      } else {
        if (g.status === 401) {
          Pfo(t.host);
        } else if (g.status === 403 || g.status === 429) {
          ZAp(g);
        }
        Ae("github_pr_status_direct", g.status === 401 ? "unauthorized" : g.status === 403 || g.status === 429 ? "rate_limited" : "http_error", {
          http_status: String(g.status)
        });
        logForDebugging(`[ghPrStatus] REST list ${g.status} on ${t.host}`, {
          level: "debug"
        });
        return "fetch-failed";
      }
    } catch (m) {
      Ae("github_pr_status_direct", "fetch_threw", {
        error_name: U4(m) ?? "unknown",
        errno_code: gd(m) ?? gd(m?.cause) ?? ""
      });
      return "fetch-failed";
    }
    let c = o.pr;
    if (!c) {
      Pe("github_pr_status_direct");
      return null;
    }
    let u = o.reviewDecision;
    let d = false;
    if (l || Date.now() - o.lastReviewFetchAt >= 300000) {
      let m = await LAp({
        host: t.host,
        owner: r.owner,
        repo: r.repo
      }, n, c.number);
      if (m !== null) {
        if (u = m, o.pr?.number === c.number) {
          o.reviewDecision = m;
          o.lastReviewFetchAt = Date.now();
        }
      } else {
        d = true;
      }
    }
    if (d) {
      Et("github_pr_status_direct", "review_decision_unavailable");
    } else {
      Pe("github_pr_status_direct");
    }
    return {
      number: c.number,
      url: c.url,
      reviewState: gka(c.isDraft, u)
    };
  }
  async function LAp(e, t, n) {
    let r = NIs(e.host);
    let o = De({
      query: "query($o:String!,$r:String!,$n:Int!){repository(owner:$o,name:$r){pullRequest(number:$n){reviewDecision}}}",
      variables: {
        o: e.owner,
        r: e.repo,
        n
      }
    });
    try {
      let s = await fetch(r, {
        ...getProxyFetchOptions({
          url: r
        }),
        keepalive: false,
        method: "POST",
        headers: {
          Authorization: `Bearer ${t}`,
          "Content-Type": "application/json",
          "User-Agent": dg()
        },
        body: o,
        redirect: "error",
        signal: AbortSignal.timeout(5000)
      });
      if (!s.ok) {
        return null;
      }
      let i = MAp().safeParse(await s.json());
      return i.success ? i.data.data.repository?.pullRequest?.reviewDecision ?? "" : null;
    } catch {
      return null;
    }
  }
  async function FAp() {
    let e = await getRemoteUrl();
    return e ? bka(e) : null;
  }
  function bka(e) {
    let t = normalizeGitRemoteUrl(e);
    if (!t) {
      return null;
    }
    let n = t.split("/");
    if (n.length < 3) {
      return null;
    }
    let r = n[0];
    if (/^[\d.]+$/.test(r) || /^\[?[0-9a-f:]+\]?$/i.test(r)) {
      return null;
    }
    return {
      host: r,
      owner: n[1],
      repo: n[2]
    };
  }
  async function BAp(e, t) {
    let n = `${e.host}/${e.owner}/${e.repo}`;
    if (nmt?.forOrigin === n) {
      return nmt;
    }
    let r = await $Ap();
    let o = r ? bka(r) : null;
    if (o && o.host === e.host) {
      nmt = {
        forOrigin: n,
        owner: o.owner,
        repo: o.repo
      };
      return nmt;
    }
    let s = await HAp(e, t);
    nmt = {
      forOrigin: n,
      ...(s ?? {
        owner: e.owner,
        repo: e.repo
      })
    };
    return nmt;
  }
  async function $Ap() {
    let {
      stdout: e,
      code: t
    } = await execFileNoThrow("git", ["config", "--get", "remote.upstream.url"], {
      timeout: 2000,
      preserveOutputOnError: false
    });
    return t === 0 && e.trim() ? e.trim() : null;
  }
  async function HAp(e, t) {
    let r = `${oMt(e.host)}/repos/${e.owner}/${e.repo}`;
    try {
      let o = await fetch(r, {
        ...getProxyFetchOptions({
          url: r
        }),
        method: "GET",
        headers: {
          Authorization: `Bearer ${t}`,
          Accept: "application/vnd.github+json",
          "X-GitHub-Api-Version": "2022-11-28",
          "User-Agent": dg()
        },
        redirect: "error",
        signal: AbortSignal.timeout(5000)
      });
      if (!o.ok) {
        return null;
      }
      let s = UAp().safeParse(await o.json());
      let i = s.success ? s.data.parent : null;
      return i ? {
        owner: i.owner.login,
        repo: i.name
      } : null;
    } catch {
      return null;
    }
  }
  function Sjn(e) {
    switch (e.state) {
      case "MERGED":
        return "merged";
      case "CLOSED":
      case "DRAFT":
        return "inactive";
      case "OPEN":
        {
          if (e.checks.failed > 0 || e.review === "CHANGES_REQUESTED") {
            return "error";
          }
          if (e.checks.pending === 0 && e.review !== "REVIEW_REQUIRED") {
            return "success";
          }
          return "warning";
        }
    }
  }
  function jAp(e) {
    let t = 0;
    let n = 0;
    let r = 0;
    for (let o of e ?? []) {
      let s = (o.conclusion ?? o.state)?.toUpperCase();
      if (s === "SUCCESS" || s === "NEUTRAL" || s === "SKIPPED") {
        t++;
      } else if (s === "FAILURE" || s === "ERROR") {
        n++;
      } else if (s == null || s === "ACTION_REQUIRED" || s === "PENDING" || s === "EXPECTED" || o.status?.toUpperCase() !== "COMPLETED") {
        r++;
      } else {
        n++;
      }
    }
    return {
      passed: t,
      failed: n,
      pending: r
    };
  }
  function Nfo(e) {
    if (Vi() || Tka()) {
      return Promise.resolve(null);
    }
    return qAp(e).catch(() => null);
  }
  function Ska(e) {
    let t = e.match(WAp);
    if (!t) {
      return null;
    }
    return {
      url: e,
      host: t[1],
      owner: t[2],
      repo: t[3],
      num: Number(t[4])
    };
  }
  function RWt(e, t) {
    if (!t) {
      return e;
    }
    let n = Ska(e);
    if (!n) {
      return e;
    }
    return t.replaceAll("{host}", n.host).replaceAll("{owner}", n.owner).replaceAll("{repo}", n.repo).replaceAll("{number}", String(n.num)).replaceAll("{url}", e);
  }
  function GAp(e, t) {
    let n = 0;
    let r = 0;
    let o = 0;
    for (let {
      state: s,
      count: i
    } of e ?? []) {
      switch (s) {
        case "SUCCESS":
        case "NEUTRAL":
        case "SKIPPED":
          n += i;
          break;
        case "FAILURE":
        case "CANCELLED":
        case "TIMED_OUT":
        case "STALE":
        case "STARTUP_FAILURE":
          r += i;
          break;
        case "ACTION_REQUIRED":
        case "IN_PROGRESS":
        case "QUEUED":
        case "PENDING":
        case "WAITING":
        case "REQUESTED":
        case "COMPLETED":
          o += i;
          break;
        default:
          r += i;
      }
    }
    for (let {
      state: s,
      count: i
    } of t ?? []) {
      switch (s) {
        case "SUCCESS":
          n += i;
          break;
        case "FAILURE":
        case "ERROR":
          r += i;
          break;
        default:
          o += i;
      }
    }
    return {
      passed: n,
      failed: r,
      pending: o
    };
  }
  function VAp(e) {
    let t = e.commits.nodes[0]?.commit.statusCheckRollup ?? null;
    return {
      number: e.number,
      title: e.title,
      state: e.state === "MERGED" ? "MERGED" : e.state === "CLOSED" ? "CLOSED" : e.isDraft ? "DRAFT" : "OPEN",
      checks: GAp(t?.contexts?.checkRunCountsByState, t?.contexts?.statusContextCountsByState),
      review: e.reviewDecision === "APPROVED" || e.reviewDecision === "CHANGES_REQUESTED" || e.reviewDecision === "REVIEW_REQUIRED" ? e.reviewDecision : null,
      additions: e.additions,
      deletions: e.deletions
    };
  }
  function zAp(e) {
    return e !== null && typeof e === "object" && "number" in e && typeof e.number === "number" && "state" in e && typeof e.state === "string";
  }
  function KAp(e) {
    return e !== null && typeof e === "object" && !("cost" in e);
  }
  function uka(e, t) {
    let n = new Map();
    for (let r of e) {
      let o = t(r);
      let s = n.get(o);
      if (s) {
        s.push(r);
      } else {
        n.set(o, [r]);
      }
    }
    return n;
  }
  function Tka() {
    return Date.now() < rmt;
  }
  function ZAp(e) {
    let t = Number(e.headers.get("retry-after"));
    let n = Number(e.headers.get("x-ratelimit-reset"));
    rmt = Number.isFinite(t) && t > 0 ? Date.now() + t * 1000 : Number.isFinite(n) && n > 0 ? n * 1000 : Date.now() + 60000;
  }
  async function Eka(e) {
    let t = new Map();
    let n = [];
    let r = null;
    if (e.length === 0 || Vi() || Date.now() < rmt) {
      for (let a of e) {
        t.set(a, null);
      }
      return {
        statuses: t,
        rateLimit: r,
        unbatched: []
      };
    }
    let o = [];
    for (let a of e) {
      let l = Ska(a);
      if (l) {
        o.push(l);
      } else if (/\/pull\/\d+/.test(a)) {
        n.push(a);
      }
    }
    o.sort((a, l) => a.url.localeCompare(l.url));
    let s = [];
    for (let [a, l] of uka(o, c => c.host)) {
      for (let c = 0; c < l.length; c += 20) {
        s.push({
          host: a,
          chunk: l.slice(c, c + 20)
        });
      }
    }
    let i = tmt(6, async ({
      host: a,
      chunk: l
    }) => {
      if (Date.now() < rmt) {
        for (let _ of l) {
          t.set(_.url, null);
        }
        return;
      }
      let c = new Map();
      let d = [...uka(l, _ => `${_.owner}/${_.repo}`)].map(([_, b], S) => {
        let [E, C] = _.split("/");
        let x = b.map((A, k) => {
          let I = `p${S}_${k}`;
          c.set(I, A.url);
          return `${I}: pullRequest(number: ${A.num}) { ...pr }`;
        }).join(" ");
        return `r${S}: repository(owner:"${E}", name:"${C}") { ${x} }`;
      });
      let p = `${YAp}
query { rateLimit{cost remaining resetAt} ${d.join(" ")} }`;
      let {
        stdout: m,
        stderr: f,
        code: h
      } = await execFileNoThrow("gh", ["api", "graphql", "--hostname", a, "--cache", "30s", "-F", "query=@-"], {
        timeout: 15000,
        input: p,
        preserveOutputOnError: true
      });
      let g = null;
      if (m.trim()) {
        try {
          g = qt(m);
        } catch {
          g = null;
        }
      }
      if (!g?.data) {
        if (pka.test(f) || pka.test(m)) {
          rmt = Date.now() + 60000;
          logForDebugging(`[ghPrStatus] GitHub rate-limited on ${a}; backing off 60s`, {
            level: "warn"
          });
        } else {
          logForDebugging(`[ghPrStatus] batch query failed on ${a} (exit ${h}); keeping last-known`);
        }
        for (let _ of l) {
          t.set(_.url, null);
        }
        return;
      }
      let y = g.data.rateLimit;
      if (y) {
        if (!r || y.remaining < r.remaining) {
          r = y;
        }
        if (y.remaining < 50) {
          rmt = Date.parse(y.resetAt) || Date.now() + 60000;
        }
      }
      for (let [_, b] of Object.entries(g.data)) {
        if (!_.startsWith("r") || !KAp(b)) {
          continue;
        }
        for (let [S, E] of Object.entries(b)) {
          let C = c.get(S);
          if (!C) {
            continue;
          }
          t.set(C, zAp(E) ? VAp(E) : null);
        }
      }
      for (let _ of c.values()) {
        if (!t.vZc(_)) {
          t.set(_, null);
        }
      }
    });
    await Promise.all(s.map(i));
    return {
      statuses: t,
      rateLimit: r,
      unbatched: n
    };
  }
  function wka(e) {
    let t = {};
    for (let [r, o] of e) {
      if (o) {
        t[r] = o;
      }
    }
    let n = De(t);
    if (n === "{}" || n === mka) {
      return Promise.resolve();
    }
    mka = n;
    return Fm(vka(), n).catch(() => {});
  }
  async function Cka() {
    try {
      let e = await fka.readFile(vka(), "utf8");
      return new Map(Object.entries(qt(e)));
    } catch {
      return new Map();
    }
  }
  var fka;
  var hka;
  var g5e;
  var yoe;
  var OAp;
  var Dfo = null;
  var DAp;
  var MAp;
  var UAp;
  var nmt;
  var qAp;
  var WAp;
  var YAp = `fragment pr on PullRequest {
  number title state isDraft additions deletions
  reviewDecision
  commits(last:1){nodes{commit{statusCheckRollup{
    state
    contexts(first:0){
      checkRunCountsByState{state count}
      statusContextCountsByState{state count}
    }
  }}}}
}`;
  var pka;
  var rmt = 0;
  var mka = "";
  var vka = () => hka.join(er(), "gh-pr-status-cache.json");
  var omt = __lazy(() => {
    qg();
    ln();
    $n();
    BT();
    je();
    gn();
    dt();
    ji();
    na();
    Ofo();
    fk();
    nW();
    Wd();
    Fh();
    ph();
    fka = require("fs/promises");
    hka = require("path");
    g5e = Si();
    yoe = {
      disabled: false,
      badStreak: 0
    };
    OAp = new Set([301, 302, 307, 308]);
    DAp = we(() => Ke.array(Ke.object({
      number: Ke.number(),
      html_url: Ke.string(),
      draft: Ke.boolean()
    })));
    MAp = we(() => Ke.object({
      data: Ke.object({
        repository: Ke.object({
          pullRequest: Ke.object({
            reviewDecision: Ke.string().nullable()
          }).nullable()
        }).nullable()
      })
    }));
    UAp = we(() => Ke.object({
      parent: Ke.object({
        name: Ke.string(),
        owner: Ke.object({
          login: Ke.string()
        })
      }).nullish()
    }));
    qAp = vye(async e => {
      let {
        stdout: t,
        code: n
      } = await execFileNoThrow("gh", ["pr", "view", e, "--json", "number,title,state,isDraft,statusCheckRollup,reviewDecision,additions,deletions"], {
        timeout: 5000,
        preserveOutputOnError: false
      });
      if (n !== 0 || !t.trim()) {
        return null;
      }
      try {
        let r = qt(t);
        return {
          number: r.number,
          title: r.title,
          state: r.state === "MERGED" ? "MERGED" : r.state === "CLOSED" ? "CLOSED" : r.isDraft ? "DRAFT" : "OPEN",
          checks: jAp(r.statusCheckRollup),
          review: r.reviewDecision === "APPROVED" || r.reviewDecision === "CHANGES_REQUESTED" || r.reviewDecision === "REVIEW_REQUIRED" ? r.reviewDecision : null,
          additions: r.additions,
          deletions: r.deletions
        };
      } catch {
        return null;
      }
    }, 30000);
    WAp = /^https:\/\/([\w.-]+)\/([\w.-]+)\/([\w.-]+)\/pull\/(\d+)\b/;
    pka = /rate limit/i;
  });
  function smt(e, t = "") {
    return new RegExp(`\\bgit(?:\\s+-[cC]\\s+\\S+|\\s+--\\S+=\\S+)*\\s+${e}\\b${t}`);
  }
  function Rjn(e) {
    let t = e.match(Cjn);
    if (t?.[1] && t?.[2]) {
      return {
        prNumber: parseInt(t[2], 10),
        prUrl: t[0],
        prRepository: t[1]
      };
    }
    return null;
  }
  function Tjn(e) {
    let t = e.match(new RegExp(Cjn.source, "g"));
    return t ? Rjn(t.at(-1)) : null;
  }
  function Lfo(e) {
    return e.match(/\[[\w./-]+(?: \(root-commit\))? ([0-9a-f]+)\]/)?.[1];
  }
  function o0p(e) {
    return e.match(/^\s*[+\-*!= ]?\s*(?:\[new branch\]|\S+\.\.+\S+)\s+\S+\s*->\s*(\S+)/m)?.[1];
  }
  function s0p(e) {
    let t = e.match(/[Pp]ull request (?:\S+#)?#?(\d+)/);
    return t?.[1] ? parseInt(t[1], 10) : undefined;
  }
  function Rka(e, t) {
    let n = e.split(smt(t))[1];
    if (!n) {
      return;
    }
    for (let r of n.trim().split(/\s+/)) {
      if (/^(?:[\d*]*[<>]|[&|;])/.test(r)) {
        break;
      }
      if (r.startsWith("-")) {
        continue;
      }
      return r;
    }
    return;
  }
  function imt(e, t) {
    let n = {};
    let r = e0p.test(e);
    if (Aka.test(e) || r) {
      let s = Lfo(t);
      if (s) {
        n.commit = {
          sha: s,
          kind: r ? "cherry-picked" : /--amend\b/.test(e) ? "amended" : "committed"
        };
      }
    }
    if (vjn.test(e)) {
      let s = (e.split(vjn)[1] ?? "").split(/[&|;\n]/)[0] ?? "";
      if (!/(?:^|\s)(?:-n|--dry-run)(?=\s|$)/.test(s)) {
        let i = o0p(t);
        if (i) {
          n.push = {
            branch: i
          };
        }
      }
    }
    if (t0p.test(e) && /(Fast-forward|Merge made by)/.test(t)) {
      let s = Rka(e, "merge");
      if (s) {
        n.branch = {
          ref: s,
          action: "merged"
        };
      }
    }
    if (n0p.test(e) && /Successfully rebased/.test(t)) {
      let s = Rka(e, "rebase");
      if (s) {
        n.branch = {
          ref: s,
          action: "rebased"
        };
      }
    }
    let o = Ika.find(s => s.re.test(e))?.action;
    if (o === "merged") {
      if (/--disable-auto\b/.test(e)) {
        o = "auto-merge-disabled";
      } else if (/--auto\b/.test(e)) {
        o = "auto-merge-enabled";
      }
    } else if (o === "ready" && /--undo\b/.test(e)) {
      o = "draft";
    }
    if (o) {
      let s = Tjn(t);
      if (s) {
        n.pr = {
          number: s.prNumber,
          url: s.prUrl,
          action: o
        };
      } else {
        let i = s0p(t);
        if (i) {
          n.pr = {
            number: i,
            action: o
          };
        }
      }
    }
    return n;
  }
  function xjn(e, t, n) {
    if (t !== 0) {
      return;
    }
    if (Aka.test(e)) {
      if (logEvent("tengu_git_operation", {
        operation: "commit"
      }), e.match(/--amend\b/)) {
        logEvent("tengu_git_operation", {
          operation: "commit_amend"
        });
      }
      getCommitCounter()?.add(1);
    }
    if (vjn.test(e)) {
      logEvent("tengu_git_operation", {
        operation: "push"
      });
      g5e.emit();
    }
    let o = Ika.find(l => l.re.test(e));
    if (o) {
      logEvent("tengu_git_operation", {
        operation: o.op
      });
      g5e.emit();
    }
    if (o?.action === "merged" && !/(?:--auto|--disable-auto)\b/.test(e) || o?.action === "closed") {
      setSessionPrResolved(true);
    }
    if (o?.action === "created") {
      if (getPrCounter()?.add(1), n) {
        let l = Tjn(n);
        if (l) {
          Ejn(l);
        }
      }
    }
    let s = e.match(r0p);
    if (s?.[1]) {
      kka(s[1]).catch(() => {});
    } else if (vjn.test(e) && !o) {
      kka().catch(() => {});
    }
    if (e.match(/\bglab\s+mr\s+create\b/)) {
      if (logEvent("tengu_git_operation", {
        operation: "pr_create"
      }), getPrCounter()?.add(1), g5e.emit(), n) {
        let l = Tjn(n);
        if (l) {
          Ejn(l);
        }
      }
    }
    let i = e.match(/\bcurl\b/) && (e.match(/-X\s*POST\b/i) || e.match(/--request\s*=?\s*POST\b/i) || e.match(/\s-d\s/));
    let a = e.match(/https?:\/\/[^\s'"]*\/(pulls|pull-requests|merge[-_]requests)(?!\/\d)/i);
    if (i && a) {
      if (logEvent("tengu_git_operation", {
        operation: "pr_create"
      }), getPrCounter()?.add(1), g5e.emit(), n) {
        let l = Tjn(n);
        if (l) {
          Ejn(l);
        }
      }
    }
  }
  async function Ejn(e) {
    let [{
      linkSessionToPR: t
    }, {
      getSessionId: n
    }] = await Promise.all([Promise.resolve().then(() => (fa(), y5e)), Promise.resolve().then(() => (at(), dxe))]);
    let r = n();
    if (!r) {
      return;
    }
    await t(r, e.prNumber, e.prUrl, e.prRepository);
  }
  function Pka(e, t) {
    if (!i0p.test(e) || !a0p.test(t) || Date.now() < xka) {
      return;
    }
    xka = Date.now() + 60000;
    return "<system-reminder>GitHub API rate limit exceeded (5,000/hr shared across all tools and agents). Run `gh api rate_limit --jq .resources` and sleep until reset before further gh calls. If polling in a loop, use ScheduleWakeup instead of retrying.</system-reminder>";
  }
  async function kka(e) {
    let t = ["pr", "view", ...(e ? [e] : []), "--json", "url"];
    let {
      code: n,
      stdout: r
    } = await execFileNoThrow("gh", t, {
      timeout: 5000,
      preserveOutputOnError: false,
      useCwd: true
    });
    if (n !== 0) {
      return;
    }
    let o = qt(r)?.url;
    if (!o) {
      return;
    }
    let s = Rjn(o);
    if (s) {
      await Ejn(s);
    }
  }
  var Aka;
  var vjn;
  var e0p;
  var t0p;
  var n0p;
  var wjn;
  var r0p;
  var Ika;
  var Cjn;
  var i0p;
  var a0p;
  var xka = 0;
  var amt = __lazy(() => {
    at();
    Ot();
    ji();
    omt();
    Aka = smt("commit");
    vjn = smt("push");
    e0p = smt("cherry-pick");
    t0p = smt("merge", "(?!-)");
    n0p = smt("rebase");
    wjn = we(() => v.object({
      commit: v.object({
        sha: v.string(),
        kind: v.enum(["committed", "amended", "cherry-picked"])
      }).optional(),
      push: v.object({
        branch: v.string()
      }).optional(),
      branch: v.object({
        ref: v.string(),
        action: v.enum(["merged", "rebased"])
      }).optional(),
      pr: v.object({
        number: v.number(),
        url: v.string().optional(),
        action: v.enum(["created", "edited", "merged", "commented", "closed", "ready", "draft", "auto-merge-enabled", "auto-merge-disabled"])
      }).optional()
    }));
    r0p = /\bgh\s+pr\s+checkout\b[^&|;]*\s(\d+)(?=\s|$|[&|;])/;
    Ika = [{
      re: /\bgh\s+pr\s+create\b/,
      action: "created",
      op: "pr_create"
    }, {
      re: /\bgh\s+pr\s+edit\b/,
      action: "edited",
      op: "pr_edit"
    }, {
      re: /\bgh\s+pr\s+merge\b/,
      action: "merged",
      op: "pr_merge"
    }, {
      re: /\bgh\s+pr\s+comment\b/,
      action: "commented",
      op: "pr_comment"
    }, {
      re: /\bgh\s+pr\s+close\b/,
      action: "closed",
      op: "pr_close"
    }, {
      re: /\bgh\s+pr\s+ready\b/,
      action: "ready",
      op: "pr_ready"
    }];
    Cjn = /https?:\/\/[^/\s"]+\/([^\s"]+?)\/(?:pull|pull-requests|-\/merge_requests)\/(\d+)/;
    i0p = /(?:^|[;&|]|\b(?:then|do)\b)\s*gh\s+(?!auth\b|help\b|version\b|alias\b|completion\b|config\b)/;
    a0p = /API rate limit (?:already )?exceeded|exceeded a secondary rate limit|\bRATE_LIMITED\b/i;
  });
  function zDe(e, t) {
    if (t) {
      return e ? `agent:builtin:${e}` : "agent:default";
    }
    return e ? `agent:custom:${e}` : "agent:custom";
  }
  function xWt() {
    let t = getInitialSettings()?.outputStyle ?? "default";
    if (t === "default") {
      return "repl_main_thread";
    }
    return t in GX ? `repl_main_thread:outputStyle:${t}` : "repl_main_thread:outputStyle:custom";
  }
  var lmt = __lazy(() => {
    Kq();
  });
  function bM(e) {
    return e.name?.startsWith("mcp__") || e.isMcp === true;
  }
  function cmt(e) {
    return e.mcpInfo?.serverName ?? (e.name?.startsWith("mcp__") ? e.name.split("__")[1] : undefined);
  }
  function kjn(e) {
    let t = e.indexOf(`
`);
    let n = (t === -1 ? e : e.slice(0, t)).trim();
    if (!n.startsWith("#") || n.startsWith("#!")) {
      return;
    }
    if (t !== -1 && c0p(e.slice(t + 1))) {
      return;
    }
    let r = n.replace(/^#+\s*/, "");
    if (!r || u0p(r)) {
      return;
    }
    return r;
  }
  function c0p(e) {
    for (let t of e.split(`
`)) {
      let n = t.trim();
      if (n === "") {
        continue;
      }
      if (n.startsWith("#")) {
        continue;
      }
      return true;
    }
    return false;
  }
  function u0p(e) {
    for (let t = 0; t < e.length; t++) {
      let n = e.charCodeAt(t);
      if (n < 32 || n >= 127 && n <= 159) {
        return true;
      }
    }
    return false;
  }
  function d0p() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.enabled;
    return e === "enabled" || e === "disabled" || e === "opt-in" ? e : "opt-in";
  }
  function KDe(e, t, n) {
    return;
  }
  function Lka(e, t) {
    let n = e.find(r => r.name === "claude-vscode");
    if (n && n.type === "connected") {
      Nka = n;
      n.client.setNotificationHandler(Ufo(), async s => {
        let {
          eventName: i,
          eventData: a
        } = s.params;
        if (i === "tengu_feedback_survey_event") {
          t?.onFeedbackSurveyEvent?.(a);
          return;
        }
        logEvent(`tengu_vscode_${i}`, a);
      });
      let r = {
        tengu_vscode_review_upsell: getFeatureValue_CACHED_MAY_BE_STALE("tengu_vscode_review_upsell", false),
        tengu_vscode_onboarding: getFeatureValue_CACHED_MAY_BE_STALE("tengu_vscode_onboarding", false),
        tengu_quiet_fern: true,
        tengu_vscode_cc_auth: true,
        tengu_slate_ribbon: true,
        tengu_brick_follow: getFeatureValue_CACHED_MAY_BE_STALE("tengu_brick_follow", false),
        tengu_vellum_siding: getFeatureValue_CACHED_MAY_BE_STALE("tengu_vellum_siding", false),
        tengu_loggia_carousel: t?.refusalFallbackLaneEnabled ?? false,
        tengu_loggia_carousel_config: t?.refusalFallbackSettingToggleVisible ?? false,
        fable5_launch_show: t?.fable5LaunchShow ?? false,
        startup_announcement: t?.startupAnnouncement ?? false
      };
      let o = d0p();
      r.tengu_auto_mode_state = o === "opt-in" ? "enabled" : o;
      n.client.notification({
        method: "experiment_gates",
        params: {
          gates: r
        }
      }).catch(s => {
        logForDebugging(`[VSCode] Failed to send experiment_gates notification: ${s.message}`);
      });
    }
  }
  var Ufo;
  var Nka = null;
  var _5e = __lazy(() => {
    je();
    $n();
    Ot();
    Ufo = we(() => v.object({
      method: v.literal("log_event"),
      params: v.object({
        eventName: v.string(),
        eventData: v.object({}).passthrough()
      })
    }));
  });
  function Fka(e) {
    if (Bfo.vZc(e)) {
      return false;
    }
    Bfo.add(e);
    return true;
  }
  function $fo(e) {
    Bfo.delete(e);
  }
  var Bfo;
  var Hfo = __lazy(() => {
    Bfo = new Set();
  });
  function m0p() {
    return Wfo();
  }
  function f0p() {
    let e = Wfo();
    let t = Ajn.get(e);
    if (!t) {
      t = [];
      Ajn.set(e, t);
    }
    return t;
  }
  function h0p() {
    return Ajn.get(Wfo()) ?? null;
  }
  function b5e(e) {
    Bka = e;
  }
  function vw(e) {
    if (!getIsNonInteractiveSession() && !isReplBridgeActive()) {
      return;
    }
    let t = f0p();
    if (t.length >= 1000) {
      let n = t.findIndex(r => r.type !== "system" || r.subtype !== "task_started" && r.subtype !== "task_notification");
      if (n === -1) {
        t.shift();
      } else {
        t.splice(n, 1);
      }
    }
    t.push(e);
    Bka?.();
  }
  function VX() {
    let e = h0p();
    if (!e || e.length === 0) {
      return [];
    }
    return e.splice(0).map(n => ({
      ...n,
      uuid: jfo.randomUUID(),
      session_id: getSessionId()
    }));
  }
  function Gfo(e) {
    let t = Ajn.get(e);
    if (!t || t.length === 0) {
      return [];
    }
    return t.splice(0).map(n => ({
      ...n,
      uuid: jfo.randomUUID(),
      session_id: e
    }));
  }
  function zu(e, t, n) {
    if (!Fka(e)) {
      return;
    }
    vw({
      type: "system",
      subtype: "task_notification",
      task_id: e,
      tool_use_id: n?.toolUseId,
      status: t,
      output_file: n?.outputFile ?? "",
      summary: n?.summary ?? "",
      usage: n?.usage,
      ...(n?.skipTranscript !== undefined && {
        skip_transcript: n.skipTranscript
      })
    });
  }
  var jfo;
  var Wfo = () => "cli";
  var Ajn;
  var Bka = null;
  function $a(e) {
    return e.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
  }
  function Yd(e) {
    return $a(e).replaceAll('"', "&quot;").replaceAll("'", "&apos;");
  }
  function YDe(e, t) {
    return t.replace(new RegExp(`</(?=${e}(?:[>\\s/]|$))`, "gi"), "<\\/");
  }
  function umt(e) {
    return e.replace(g0p, t => $ka[t] ?? t);
  }
  function JDe(e) {
    return e.replace(y0p, t => _0p[t] ?? t);
  }
  var g0p;
  var $ka;
  var y0p;
  var _0p;
  var wx = __lazy(() => {
    g0p = /&(?:amp|lt|gt);/g;
    $ka = {
      "&amp;": "&",
      "&lt;": "<",
      "&gt;": ">"
    };
    y0p = /&(?:amp|lt|gt|quot|apos);/g;
    _0p = {
      ...$ka,
      "&quot;": '"',
      "&apos;": "'"
    };
  });
  function b0p(e, t, n) {
    let r = t.compactMetadata.preservedMessages;
    if (!r) {
      return null;
    }
    let o = (r.allUuids ?? r.uuids).map(s => e.find(i => i.uuid === s) ?? n?.find(i => i.uuid === s)).filter(s => s !== undefined).map(e5e);
    return o.length > 0 ? {
      preserved: o,
      anchorUuid: r.anchorUuid
    } : null;
  }
  function Hde(e, t, n, r) {
    if (SS(t)) {
      let o = b0p(e, t, r);
      if (o === null) {
        return null;
      }
      let s = new Set(o.preserved.map(a => a.uuid));
      let i = e.filter(a => !s.vZc(a.uuid));
      if (e.length = 0, e.push(...i), o.anchorUuid === t.uuid) {
        e.push(...o.preserved);
        return null;
      }
      return o;
    }
    if (n?.anchorUuid === t.uuid) {
      e.push(...n.preserved);
      return null;
    }
    return n;
  }
  var IWt = __lazy(() => {
    ro();
    t5e();
  });
  function T0p() {
    let e = Wka.randomBytes(8);
    let t = "s";
    for (let n = 0; n < 8; n++) {
      t += ("0123456789abcdefghijklmnopqrstuvwxyz")[e[n] % ("0123456789abcdefghijklmnopqrstuvwxyz").length];
    }
    return t;
  }
  function E0p(e, t, n, r) {
    let o = T0p();
    initTaskOutputAsSymlink(o, Ew(o));
    let s = r ?? createAbortController();
    let i = n ?? S0p;
    let a = {
      ...ww(o, "local_agent", e),
      type: "local_agent",
      status: "running",
      agentId: o,
      ownerAgentId: mainAgentId(),
      prompt: e,
      selectedAgent: i,
      agentType: "main-session",
      abortController: s,
      retrieved: false,
      lastReportedToolCount: 0,
      lastReportedTokenCount: 0,
      isBackgrounded: true,
      pendingMessages: [],
      retain: false,
      diskLoaded: false
    };
    logForDebugging(`[LocalMainSessionTask] Registering task ${o} with description: ${e}`);
    t.register(a);
    logForDebugging(`[LocalMainSessionTask] After registration, task ${o} exists in state: ${t.get(o) !== undefined}`);
    return {
      taskId: o,
      abortSignal: s.signal
    };
  }
  function jka(e, t, n) {
    let r = t ? "completed" : "failed";
    let o;
    let s;
    if (n.update(e, i => {
      if (i.status !== "running") {
        return i;
      }
      o = i.toolUseId;
      s = i.description;
      return {
        ...i,
        status: r,
        endTime: Date.now(),
        notified: true
      };
    }), n.updateTranscript(e, i => ({
      ...i,
      messages: i.messages.length ? [i.messages.at(-1)] : []
    })), evictTaskOutput(e), s === undefined) {
      return;
    }
    if (t) {
      Pe("task_main_session");
    } else {
      Ae("task_main_session", "task_main_session_failed");
    }
    zu(e, r, {
      toolUseId: o,
      summary: s
    });
  }
  function PWt(e) {
    if (typeof e !== "object" || e === null || !("type" in e) || !("agentType" in e)) {
      return false;
    }
    return e.type === "local_agent" && e.agentType === "main-session";
  }
  function Gka({
    messages: e,
    queryParams: t,
    description: n,
    taskRegistry: r,
    agentDefinition: o,
    setAppState: s
  }) {
    let {
      taskId: i,
      abortSignal: a
    } = E0p(n, r, o);
    recordSidechainTranscript(e, i).catch(u => logForDebugging(`bg-session initial transcript write failed: ${u}`));
    let l = t.toolUseContext.agentContext;
    let c = {
      agentId: i,
      parentAgentId: qY(l) ? undefined : l.agentId,
      agentType: "subagent",
      subagentName: "main-session",
      isBuiltIn: true,
      isAsync: true,
      isMainSession: true
    };
    p8(c, async () => {
      let u = [...e];
      let d = null;
      try {
        let p = [];
        let m = 0;
        let f = 0;
        let h = e.at(-1)?.uuid ?? null;
        for await (let g of _U({
          messages: u,
          ...t,
          toolUseContext: {
            ...t.toolUseContext,
            agentId: i,
            agentContext: c
          }
        })) {
          if (a.aborted) {
            let y = false;
            if (r.update(i, _ => (y = _.notified === true, y ? _ : {
              ..._,
              notified: true
            })), !y) {
              zu(i, "stopped", {
                summary: n
              });
            }
            return;
          }
          if (g.type === "progress" && g.data.type === "repl_tool_call" && g.data.phase === "start") {
            if (p.push({
              toolName: g.data.toolName,
              input: g.data.toolInput
            }), p.length > 5) {
              p.shift();
            }
            let y = p.at(-1);
            r.update(i, _ => {
              if (_.progress?.recentActivities?.at(-1) === y) {
                return _;
              }
              return {
                ..._,
                progress: {
                  tokenCount: f,
                  toolUseCount: m,
                  recentActivities: [...p]
                }
              };
            });
            continue;
          }
          if (g.type === "active_goal") {
            s?.(y => y.activeGoal === g.value ? y : {
              ...y,
              activeGoal: g.value
            });
            continue;
          }
          if (g.type !== "user" && g.type !== "assistant" && g.type !== "system") {
            continue;
          }
          if (u.push(g), d = Hde(u, g, d), recordSidechainTranscript([g], i, h).catch(y => logForDebugging(`bg-session transcript write failed: ${y}`)), h = g.uuid, g.type === "assistant") {
            for (let y of g.message.content) {
              if (y.type === "text") {
                f += xm(y.text);
              } else if (y.type === "tool_use") {
                if (m++, y.name === "REPL") {
                  continue;
                }
                let _ = {
                  toolName: y.name,
                  input: y.input
                };
                if (p.push(_), p.length > 5) {
                  p.shift();
                }
              }
            }
          }
          r.update(i, y => {
            let _ = y.progress;
            if (_?.tokenCount === f && _.toolUseCount === m) {
              return y;
            }
            return {
              ...y,
              progress: {
                tokenCount: f,
                toolUseCount: m,
                recentActivities: _?.toolUseCount === m ? _.recentActivities : [...p]
              }
            };
          });
          r.updateTranscript(i, y => y.messages === u ? y : {
            ...y,
            messages: u
          });
        }
        jka(i, true, r);
      } catch (p) {
        Oe($o(sr(p), "startBackgroundSession: query loop failed"));
        jka(i, false, r);
      } finally {
        if (d) {
          u.push(...d.preserved);
        }
      }
    });
    return i;
  }
  var Wka;
  var S0p;
  var Ijn = __lazy(() => {
    at();
    BTe();
    ln();
    IWt();
    aU();
    Cx();
    ZC();
    D_();
    Kp();
    _h();
    je();
    dt();
    Rn();
    Fy();
    fa();
    cE();
    Wka = require("crypto");
    S0p = {
      agentType: "main-session",
      whenToUse: "Main session query",
      source: "userSettings",
      getSystemPrompt: () => ""
    };
  });
  function Cw(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "local_bash";
  }
  function $Te(e, t) {
    let n;
    let r = false;
    if (t.update(e, o => {
      if (o.status !== "running" || !Cw(o)) {
        return o;
      }
      try {
        logForDebugging(`LocalShellTask ${e} kill requested`);
        o.shellCommand?.kill();
        o.shellCommand?.cleanup();
      } catch (s) {
        Oe(s);
      }
      if (o.cleanupTimeoutId) {
        clearTimeout(o.cleanupTimeoutId);
      }
      r = o.notified;
      n = {
        toolUseId: o.toolUseId,
        description: o.description
      };
      return {
        ...o,
        status: "killed",
        notified: true,
        shellCommand: null,
        cleanupTimeoutId: undefined,
        endTime: Date.now()
      };
    }), n && !r) {
      zu(e, "stopped", {
        toolUseId: n.toolUseId,
        summary: n.description
      });
    }
    evictTaskOutput(e);
  }
  function Vka(e, t) {
    for (let n of Object.values(t.all())) {
      if (n.status !== "running") {
        continue;
      }
      if (n.type === "local_bash") {
        if (n.isBackgrounded && n.agentId === e) {
          return true;
        }
      } else if (n.type === "monitor_mcp" || n.type === "monitor_ws") {
        if (n.agentId === e) {
          return true;
        }
      }
    }
    return false;
  }
  function zka(e, t) {
    for (let [n, r] of Object.entries(t.all())) {
      if (Cw(r) && r.agentId === e && r.status === "running") {
        logForDebugging(`killShellTasksForAgent: killing orphaned shell task ${n} (agent ${e} exiting)`);
        $Te(n, t);
      }
    }
    HDe(n => n.agentId === e);
  }
  var OWt = __lazy(() => {
    je();
    Rn();
    Rf();
    cE();
  });
  function Yka(e) {
    if (e === undefined) {
      return;
    }
    return parseInt(process.env.CLAUDE_SUBAGENT_BG_SHELL_MAX_MS || "", 10) || 3600000;
  }
  function A0p(e) {
    let t = e.trimEnd().split(`
`).pop() ?? "";
    return k0p.some(n => n.test(t));
  }
  function Vfo(e, t, n, r, o) {
    if (n === "monitor") {
      return () => {};
    }
    let s = getTaskOutputPath(e);
    let i = 0;
    let a = Date.now();
    let l = false;
    let c = setInterval(() => {
      Kka.stat(s).then(u => {
        if (u.size > i) {
          i = u.size;
          a = Date.now();
          return;
        }
        if (Date.now() - a < 45000) {
          return;
        }
        LA(s, 1024).then(({
          content: d
        }) => {
          if (l) {
            return;
          }
          if (!A0p(d)) {
            a = Date.now();
            return;
          }
          l = true;
          clearInterval(c);
          let p = r ? `
<${"tool-use-id"}>${r}</${"tool-use-id"}>` : "";
          let m = `${"Background command "}"${t}" appears to be waiting for interactive input`;
          let f = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>${p}
<${"output-file"}>${s}</${"output-file"}>
<${"summary"}>${$a(m)}</${"summary"}>
</${"task-notification"}>
Last output:
${d.trimEnd()}

The command is likely blocked on an interactive prompt. Stop this task and re-run with piped input (e.g., \`echo y | command\`) or a non-interactive flag if one exists.`;
          ud({
            value: f,
            mode: "task-notification",
            priority: "next",
            agentId: o ?? mainAgentId()
          });
          Pe("task_local_shell_stall_detected");
        }, () => {});
      }, () => {});
    }, 5000);
    c.unref();
    return () => {
      l = true;
      clearInterval(c);
    };
  }
  function MWt(e, t, n, r) {
    if (e === "monitor") {
      switch (n) {
        case "completed":
          return `Monitor "${t}" stream ended`;
        case "failed":
          return `Monitor "${t}" script failed${r !== undefined ? ` (exit ${r})` : ""}`;
        case "killed":
          return `Monitor "${t}" stopped`;
      }
    }
    switch (n) {
      case "completed":
        return `${"Background command "}"${t}" completed${r !== undefined ? ` (exit code ${r})` : ""}`;
      case "failed":
        return `${"Background command "}"${t}" failed${r !== undefined ? ` with exit code ${r}` : ""}`;
      case "killed":
        return `${"Background command "}"${t}" was stopped`;
    }
  }
  function NWt(e, t, n, r, o, s, i = "bash", a) {
    let l = false;
    if (o.update(e, m => {
      if (m.notified) {
        return m;
      }
      l = true;
      return {
        ...m,
        notified: true
      };
    }), !l) {
      return;
    }
    if (n === "completed") {
      Pe("task_local_shell");
    } else if (n === "failed") {
      Ae("task_local_shell", "task_local_shell_failed");
    }
    let c = MWt(i, t, n, r);
    let u = getTaskOutputPath(e);
    let d = s ? `
<${"tool-use-id"}>${s}</${"tool-use-id"}>` : "";
    let p = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>${d}
<${"output-file"}>${u}</${"output-file"}>
<${"status"}>${n}</${"status"}>
<${"summary"}>${$a(c)}</${"summary"}>
</${"task-notification"}>`;
    if (ud({
      value: p,
      mode: "task-notification",
      priority: "next",
      agentId: a ?? mainAgentId()
    }), a !== undefined) {
      zu(e, n === "killed" ? "stopped" : n, {
        toolUseId: s,
        summary: c,
        outputFile: u
      });
    }
  }
  function Jka(e, t, n, r, o, s) {
    _oe(s, `bash:${e}`, n);
    let i;
    if (s === undefined && !getIsNonInteractiveSession() && !Me.CLAUDE_CODE_DISABLE_BG_SHELL_PRESSURE_REAP) {
      let a = () => {
        let l = n.get(e);
        if (l?.status !== "running" || l.notified || Date.now() - getLastInteractionTime() < 1800000 || getMainLoopBusy() || S5e(n.all())) {
          return;
        }
        Pe("task_local_shell_pressure_reap");
        NWt(e, t, "killed", undefined, n, r, o, s);
        $Te(e, n);
      };
      process.on("memoryPressure", a);
      i = () => process.off("memoryPressure", a);
    }
    return () => {
      i?.();
      Yq(s, `bash:${e}`, n);
    };
  }
  async function XDe(e, t) {
    let {
      command: n,
      description: r,
      shellCommand: o,
      toolUseId: s,
      agentId: i,
      kind: a
    } = e;
    let {
      taskRegistry: l
    } = t;
    let {
      taskOutput: c
    } = o;
    let u = c.taskId;
    let d = {
      ...ww(u, "local_bash", r, s),
      type: "local_bash",
      status: "running",
      command: n,
      cwd: Nt(),
      completionStatusSentInAttachment: false,
      shellCommand: o,
      lastReportedTotalLines: 0,
      isBackgrounded: true,
      agentId: i,
      kind: a
    };
    l.register(d);
    let p = a !== "monitor" ? Jka(u, r, l, s, a, i) : undefined;
    o.background(u, {
      capMs: a !== "monitor" ? Yka(i) : undefined
    });
    let m = Vfo(u, r, a, s, i);
    o.result.then(async f => {
      m();
      await Fjn(o);
      let h = false;
      let g = DWt(f);
      l.update(u, y => {
        if (y.status === "killed") {
          h = true;
          return y;
        }
        if (y.notified) {
          return y;
        }
        return {
          ...y,
          status: g,
          result: {
            code: f.code,
            interrupted: f.interrupted
          },
          shellCommand: null,
          endTime: Date.now(),
          terminal: {
            summary: MWt(a, r, g, f.code),
            output_file: getTaskOutputPath(u)
          }
        };
      });
      NWt(u, r, h ? "killed" : g, f.code, l, s, a, i);
      p?.();
      evictTaskOutput(u);
    });
    return {
      taskId: u
    };
  }
  function Xka(e, t) {
    let {
      taskId: n,
      command: r,
      description: o,
      toolUseId: s,
      kind: i,
      agentId: a
    } = e;
    let l = {
      ...ww(n, "local_bash", o, s),
      type: "local_bash",
      status: "running",
      command: r,
      cwd: Nt(),
      completionStatusSentInAttachment: false,
      shellCommand: e.shellCommand,
      lastReportedTotalLines: e.lastReportedTotalLines,
      isBackgrounded: true,
      agentId: a !== undefined ? a : undefined,
      kind: i
    };
    t.register(l);
    e.shellCommand.result.then(async c => {
      await Fjn(e.shellCommand);
      let u = c.interrupted ? "killed" : "completed";
      t.update(n, m => m.notified ? m : {
        ...m,
        status: u,
        result: {
          code: c.code,
          interrupted: c.interrupted
        },
        shellCommand: null,
        endTime: Date.now(),
        terminal: {
          summary: MWt(i, o, u, c.code),
          output_file: getTaskOutputPath(n)
        }
      });
      let d = a !== undefined ? t.get(a) : undefined;
      let p = za(d) && (d.status === "running" || gT(d));
      NWt(n, o, u, c.code, t, s, i, p ? a : undefined);
      evictTaskOutput(n);
    });
  }
  function Ojn(e, t, n) {
    let {
      command: r,
      description: o,
      shellCommand: s,
      agentId: i
    } = e;
    let a = s.taskOutput.taskId;
    let l = {
      ...ww(a, "local_bash", o, n),
      type: "local_bash",
      status: "running",
      command: r,
      cwd: Nt(),
      completionStatusSentInAttachment: false,
      shellCommand: s,
      lastReportedTotalLines: 0,
      isBackgrounded: false,
      agentId: i
    };
    t.register(l);
    return a;
  }
  function Qka(e, t) {
    let n = t.get(e);
    if (!Cw(n) || n.isBackgrounded || !n.shellCommand) {
      return false;
    }
    let {
      shellCommand: r,
      description: o
    } = n;
    let {
      toolUseId: s,
      kind: i,
      agentId: a
    } = n;
    if (!r.background(e)) {
      return false;
    }
    t.update(e, c => {
      if (c.isBackgrounded) {
        return c;
      }
      return {
        ...c,
        isBackgrounded: true
      };
    });
    let l = Vfo(e, o, i, s, a);
    r.result.then(async c => {
      l();
      await Fjn(r);
      let u = false;
      let d = DWt(c);
      t.update(e, p => {
        if (p.status === "killed") {
          u = true;
          return p;
        }
        if (p.notified) {
          return p;
        }
        return {
          ...p,
          status: d,
          result: {
            code: c.code,
            interrupted: c.interrupted
          },
          shellCommand: null,
          endTime: Date.now(),
          terminal: {
            summary: MWt(i, o, d, c.code),
            output_file: getTaskOutputPath(e)
          }
        };
      });
      NWt(e, o, u ? "killed" : d, c.code, t, s, i, a);
      evictTaskOutput(e);
    });
    return true;
  }
  function zfo(e) {
    return Object.values(e.tasks).some(t => {
      if (Cw(t) && !t.isBackgrounded && t.shellCommand) {
        return true;
      }
      if (za(t) && !t.isBackgrounded && !PWt(t)) {
        return true;
      }
      return false;
    });
  }
  function QDe(e) {
    let t = e.all();
    let n = Object.keys(t).filter(o => {
      let s = t[o];
      return Cw(s) && !s.isBackgrounded && s.shellCommand;
    });
    for (let o of n) {
      Qka(o, e);
    }
    let r = Object.keys(t).filter(o => {
      let s = t[o];
      return za(s) && !s.isBackgrounded;
    });
    for (let o of r) {
      LWt(o, e);
    }
    Pe("task_local_shell_background_all");
  }
  function Djn(e, t) {
    for (let [n, r] of Object.entries(t.all())) {
      if (r.toolUseId !== e) {
        continue;
      }
      if (Cw(r) && !r.isBackgrounded && r.shellCommand) {
        return Qka(n, t);
      }
      if (za(r) && !r.isBackgrounded && !PWt(r)) {
        LWt(n, t);
        return true;
      }
      return false;
    }
    return false;
  }
  function Mjn(e, t, n, r, o) {
    let s = r.get(e);
    let i = s && Cw(s) ? s.agentId : undefined;
    if (!t.background(e, {
      capMs: Yka(i)
    })) {
      return false;
    }
    r.update(e, c => {
      if (c.isBackgrounded) {
        return c;
      }
      return {
        ...c,
        isBackgrounded: true
      };
    });
    let a = Vfo(e, n, undefined, o, i);
    let l = Jka(e, n, r, o, undefined, i);
    t.result.then(async c => {
      a();
      await Fjn(t);
      let u = false;
      let d = DWt(c);
      r.update(e, p => {
        if (p.status === "killed") {
          u = true;
          return p;
        }
        if (p.notified) {
          return p;
        }
        return {
          ...p,
          status: d,
          result: {
            code: c.code,
            interrupted: c.interrupted
          },
          shellCommand: null,
          endTime: Date.now(),
          terminal: {
            summary: MWt(undefined, n, d, c.code),
            output_file: getTaskOutputPath(e)
          }
        };
      });
      NWt(e, n, u ? "killed" : d, c.code, r, o, undefined, i);
      l();
      evictTaskOutput(e);
    });
    return true;
  }
  function Njn(e, t, n) {
    let r = false;
    if (n.update(e, o => {
      if (o.notified) {
        return o;
      }
      r = true;
      return {
        ...o,
        notified: true,
        status: DWt(t),
        result: {
          code: t.code,
          interrupted: t.interrupted
        },
        shellCommand: null,
        endTime: Date.now()
      };
    }), r) {
      let o = DWt(t);
      if (o === "completed") {
        Pe("task_local_shell");
      } else if (o === "failed") {
        Ae("task_local_shell", "task_local_shell_failed");
      }
    }
    return r;
  }
  function Ljn(e, t, n) {
    let r = n.get(e);
    if (!Cw(r) || r.isBackgrounded || r.notified) {
      return;
    }
    n.remove(e);
    zu(e, t, {
      toolUseId: r.toolUseId,
      summary: r.description
    });
  }
  function dmt(e) {
    if (e.interrupted) {
      return "stopped";
    }
    return e.code === 0 ? "completed" : "failed";
  }
  function DWt(e) {
    if (e.interrupted) {
      return "killed";
    }
    return e.code === 0 ? "completed" : "failed";
  }
  async function Fjn(e) {
    try {
      await e.taskOutput.flush();
      e.cleanup();
    } catch (t) {
      Oe(t);
    }
  }
  var Kka;
  var k0p;
  var Pjn;
  var zX = __lazy(() => {
    at();
    np();
    ln();
    Cx();
    D_();
    vo();
    d_();
    Rn();
    Rf();
    cE();
    wx();
    ry();
    Ijn();
    OWt();
    Kka = require("fs/promises");
    k0p = [/\(y\/n\)/i, /\[y\/n\]/i, /\(yes\/no\)/i, /\b(?:Do you|Would you|Shall I|Are you sure|Ready to)\b.*\? *$/i, /Press (any key|Enter)/i, /Continue\?/i, /Overwrite\?/i];
    Pjn = {
      name: "LocalShellTask",
      type: "local_bash",
      async kill(e, t) {
        $Te(e, t);
      }
    };
  });
  function D0p(e) {
    let t = e.slice(e.lastIndexOf("/") + 1).toLowerCase();
    return Zka.vZc(t) || Zka.vZc(t.replace(/\.(exe|bat|cmd|com)$/, "").replace(/(?<=[a-z])[\d.]+$/, ""));
  }
  function tAa(e) {
    let t = e.filter(r => !O0p.vZc(r.type));
    if (t.length !== 1 || t[0].type !== "command") {
      return false;
    }
    let n = false;
    for (let r of t[0].children) {
      if (r.type === "command_name") {
        continue;
      }
      if (n) {
        return false;
      }
      if (eAa.vZc(r.type) || r.type === "concatenation" && r.children.some(o => eAa.vZc(o.type))) {
        n = true;
        continue;
      }
      if (!N0p.vZc(r.type)) {
        return false;
      }
    }
    return true;
  }
  function Kfo(e) {
    if (e.type === "string") {
      return e.children.filter(t => t.type !== '"').map(Kfo).join("");
    }
    if (e.type === "concatenation") {
      return e.children.map(Kfo).join("");
    }
    return e.text;
  }
  function rAa(e) {
    if (!e) {
      return [];
    }
    if (e.length > 1e4) {
      return null;
    }
    let t = _O().parse(e);
    if (!t) {
      return null;
    }
    if (!tAa(t.children)) {
      return null;
    }
    let n = [];
    let r = /\$[({]|`|[<>]\(/;
    let o = false;
    let s = i => {
      if (i.type === "ERROR") {
        o = true;
        return;
      }
      if (i.type === "command_substitution" || i.type === "process_substitution") {
        if (!tAa(i.children)) {
          o = true;
          return;
        }
      }
      if (i.type === "string" && i.children.some(a => !M0p.vZc(a.type))) {
        o = true;
        return;
      }
      if (i.type === "concatenation" && i.children.some(a => a.type === "simple_expansion" || a.type === "$")) {
        o = true;
        return;
      }
      if (i.type === "expansion") {
        o = true;
        return;
      }
      if (i.type === "arithmetic_expansion") {
        o = true;
        return;
      }
      if (i.type === "raw_string" || i.type === "ansi_c_string") {
        o = true;
        return;
      }
      if (i.type === "regex" || i.type === "extglob_pattern" || i.type === "word") {
        if (r.test(i.text) || i.type === "word" && i.text.includes("\\")) {
          o = true;
        }
        return;
      }
      if (P0p.vZc(i.type)) {
        return;
      }
      if (i.type === "command") {
        let a = i.children.find(l => l.type === "command_name")?.children[0];
        if (a && (a.type !== "word" || !L0p.test(a.text) || D0p(a.text))) {
          o = true;
          return;
        }
        n.push(i.children.map(Kfo).join(" "));
      }
      for (let a of i.children) {
        s(a);
      }
    };
    s(t);
    return o ? null : n;
  }
  var nAa;
  var P0p;
  var O0p;
  var Zka;
  var M0p;
  var eAa;
  var N0p;
  var L0p;
  var oAa = __lazy(() => {
    noe();
    iTe();
    nAa = new Set(["&&", "||", "|", ";", "&", "|&", `
`]);
    P0p = new Set([...nAa, "comment", "string_content", "simple_expansion", "variable_name", "special_variable_name"]);
    O0p = new Set([...nAa, "comment", "$(", "`", "<(", ">(", ")"]);
    Zka = new Set([...E3t, ...g2n, ...Object.keys(Sco), ...Tco, ...h2n, ...C3t, "find", "jobs", "setpriv", "setarch", "linux32", "linux64", "arch", "xargs", "parallel", "su", "runuser", "pkexec", "chroot", "time", "command", "builtin", "noglob", "env", "nice", "nohup", "sudo", "doas", "stdbuf", "timeout", "bash", "sh", "zsh", "dash", "ksh", "fish", "ash", "mksh", "csh", "tcsh", "busybox", "python", "python2", "python3", "perl", "ruby", "node", "nodejs", "deno", "bun", "php", "lua", "awk", "gawk", "valgrind", "unbuffer", "rlwrap", "fakeroot", "fakechroot", "proot", "firejail", "caffeinate", "taskpolicy", "systemd-run", "expect", "socat", "screen", "tmux", "mawk", "nawk", "cmd", "powershell", "pwsh", "wsl"]);
    M0p = new Set(['"', "string_content", "command_substitution"]);
    eAa = new Set(["simple_expansion", "expansion", "command_substitution", "process_substitution"]);
    N0p = new Set(["word", "string", "concatenation", "number"]);
    L0p = /^[\w./+-]+$/;
  });
  function FWt(e, t) {
    if (!e.includes("<claude-code-hint")) {
      return {
        hints: [],
        stripped: e
      };
    }
    let n = H0p(t);
    let r = [];
    let o = e.replace(sAa, i => {
      let a = $0p(i);
      let l = Number(a.v);
      let c = a.type;
      let u = a.value;
      if (!F0p.vZc(l)) {
        logForDebugging(`[claudeCodeHints] dropped hint with unsupported v=${a.v}`);
        return "";
      }
      if (!c || !U0p.vZc(c)) {
        logForDebugging(`[claudeCodeHints] dropped hint with unsupported type=${c}`);
        return "";
      }
      if (!u) {
        logForDebugging("[claudeCodeHints] dropped hint with empty value");
        return "";
      }
      r.push({
        v: l,
        type: c,
        value: u,
        sourceCommand: n
      });
      return "";
    });
    let s = r.length > 0 || o !== e ? o.replace(/\n{3,}/g, `

`) : o;
    return {
      hints: r,
      stripped: s
    };
  }
  function Bjn(e) {
    if (!e.includes("<claude-code-hint")) {
      return e;
    }
    return e.replace(sAa, "").replace(/\n{3,}/g, `

`);
  }
  function $0p(e) {
    let t = {};
    for (let n of e.matchAll(B0p)) {
      t[n[1]] = n[2] ?? n[3] ?? "";
    }
    return t;
  }
  function H0p(e) {
    let t = e.trim();
    let n = t.search(/\s/);
    return n === -1 ? t : t.slice(0, n);
  }
  function lAa(e) {
    if (Yfo) {
      return;
    }
    Ujn = e;
    aAa();
  }
  function cAa() {
    if (Ujn !== null) {
      Ujn = null;
      aAa();
    }
  }
  function uAa() {
    Yfo = true;
  }
  function Jfo() {
    return Ujn;
  }
  function pAa() {
    return Yfo;
  }
  var F0p;
  var U0p;
  var sAa;
  var B0p;
  var Ujn = null;
  var Yfo = false;
  var iAa;
  var aAa;
  var dAa;
  var pmt = __lazy(() => {
    je();
    ph();
    F0p = new Set([1]);
    U0p = new Set(["plugin"]);
    sAa = /^[ \t]*<claude-code-hint\s+([^>]*?)\s*\/>[ \t]*$/gm;
    B0p = /(\w+)=(?:"([^"]*)"|([^\s/>]+))/g;
    iAa = Si();
    aAa = iAa.emit;
    dAa = iAa.subscribe;
  });
  function mAa(e) {
    let t = e.trim();
    let n = t.split(/\s+/)[0]?.toLowerCase();
    if (!n) {
      return;
    }
    if (n === "npx" || n === "bunx") {
      let r = t.split(/\s+/)[1]?.toLowerCase();
      if (r && r in Xfo) {
        return Xfo[r];
      }
    }
    return Xfo[n];
  }
  function fAa(e) {
    for (let {
      pattern: t,
      tool: n
    } of j0p) {
      if (t.test(e)) {
        return n;
      }
    }
    return;
  }
  var Xfo;
  var j0p;
  var Qfo = __lazy(() => {
    Xfo = {
      src: "sourcegraph",
      cody: "cody",
      aider: "aider",
      tabby: "tabby",
      tabnine: "tabnine",
      augment: "augment",
      pieces: "pieces",
      qodo: "qodo",
      aide: "aide",
      hound: "hound",
      seagoat: "seagoat",
      bloop: "bloop",
      gitloop: "gitloop",
      q: "amazon-q",
      gemini: "gemini"
    };
    j0p = [{
      pattern: /^sourcegraph$/i,
      tool: "sourcegraph"
    }, {
      pattern: /^cody$/i,
      tool: "cody"
    }, {
      pattern: /^openctx$/i,
      tool: "openctx"
    }, {
      pattern: /^aider$/i,
      tool: "aider"
    }, {
      pattern: /^continue$/i,
      tool: "continue"
    }, {
      pattern: /^github[-_]?copilot$/i,
      tool: "github-copilot"
    }, {
      pattern: /^copilot$/i,
      tool: "github-copilot"
    }, {
      pattern: /^cursor$/i,
      tool: "cursor"
    }, {
      pattern: /^tabby$/i,
      tool: "tabby"
    }, {
      pattern: /^codeium$/i,
      tool: "codeium"
    }, {
      pattern: /^tabnine$/i,
      tool: "tabnine"
    }, {
      pattern: /^augment[-_]?code$/i,
      tool: "augment"
    }, {
      pattern: /^augment$/i,
      tool: "augment"
    }, {
      pattern: /^windsurf$/i,
      tool: "windsurf"
    }, {
      pattern: /^aide$/i,
      tool: "aide"
    }, {
      pattern: /^codestory$/i,
      tool: "aide"
    }, {
      pattern: /^pieces$/i,
      tool: "pieces"
    }, {
      pattern: /^qodo$/i,
      tool: "qodo"
    }, {
      pattern: /^amazon[-_]?q$/i,
      tool: "amazon-q"
    }, {
      pattern: /^gemini[-_]?code[-_]?assist$/i,
      tool: "gemini"
    }, {
      pattern: /^gemini$/i,
      tool: "gemini"
    }, {
      pattern: /^hound$/i,
      tool: "hound"
    }, {
      pattern: /^seagoat$/i,
      tool: "seagoat"
    }, {
      pattern: /^bloop$/i,
      tool: "bloop"
    }, {
      pattern: /^gitloop$/i,
      tool: "gitloop"
    }, {
      pattern: /^claude[-_]?context$/i,
      tool: "claude-context"
    }, {
      pattern: /^code[-_]?index[-_]?mcp$/i,
      tool: "code-index-mcp"
    }, {
      pattern: /^code[-_]?index$/i,
      tool: "code-index-mcp"
    }, {
      pattern: /^local[-_]?code[-_]?search$/i,
      tool: "local-code-search"
    }, {
      pattern: /^codebase$/i,
      tool: "autodev-codebase"
    }, {
      pattern: /^autodev[-_]?codebase$/i,
      tool: "autodev-codebase"
    }, {
      pattern: /^code[-_]?context$/i,
      tool: "claude-context"
    }];
  });
  function hAa(e) {
    if (e === 9 || e === 10) {
      return false;
    }
    return e < 32 || e >= 127 && e <= 159;
  }
  function HTe(e) {
    for (let t = 0; t < e.length; t++) {
      if (hAa(e.charCodeAt(t))) {
        return false;
      }
    }
    return true;
  }
  function oR(e) {
    let t = "";
    for (let n = 0; n < e.length; n++) {
      t += hAa(e.charCodeAt(n)) ? "\uFFFD" : e[n];
    }
    return t;
  }
  var EAa = {};
  __export(EAa, {
    reduceFileHistoryState: () => reduceFileHistoryState,
    fileHistoryTrackEdit: () => fileHistoryTrackEdit,
    fileHistoryRewind: () => fileHistoryRewind,
    fileHistoryRestoreStateFromLog: () => fileHistoryRestoreStateFromLog,
    fileHistoryMakeSnapshot: () => fileHistoryMakeSnapshot,
    fileHistoryHasAnyChanges: () => fileHistoryHasAnyChanges,
    fileHistoryGetDiffStats: () => fileHistoryGetDiffStats,
    fileHistoryEnabled: () => fileHistoryEnabled,
    fileHistoryCanRestore: () => fileHistoryCanRestore,
    copyFileHistoryForResume: () => copyFileHistoryForResume,
    checkOriginFileChanged: () => checkOriginFileChanged
  });
  function reduceFileHistoryState(e, t) {
    switch (t.kind) {
      case "track":
        try {
          let n = e.snapshots.at(-1);
          if (!n) {
            return e;
          }
          let r = (e.trackSequence ?? 0) + 1;
          if (n.trackedFileBackups[t.trackingPath]) {
            return {
              ...e,
              trackSequence: r
            };
          }
          let o = e.trackedFiles.vZc(t.trackingPath) ? e.trackedFiles : new Set(e.trackedFiles).add(t.trackingPath);
          let s = {
            ...n,
            trackedFileBackups: {
              ...n.trackedFileBackups,
              [t.trackingPath]: t.backup
            }
          };
          let i = {
            ...e,
            snapshots: (() => {
              let a = e.snapshots.slice();
              a[a.length - 1] = s;
              return a;
            })(),
            trackedFiles: o,
            trackSequence: r
          };
          yAa(i);
          recordFileHistorySnapshot(t.messageId, s, true).catch(a => {
            Oe(Error(`FileHistory: Failed to record snapshot: ${a}`));
          });
          logEvent("tengu_file_history_track_edit_success", {
            isNewFile: t.isAddingFile,
            version: t.backup.version
          });
          logForDebugging(`FileHistory: Tracked file modification for ${t.filePath}`);
          return i;
        } catch (n) {
          Oe(n);
          logEvent("tengu_file_history_track_edit_failed", {});
          return e;
        }
      case "snapshot":
        try {
          let n = {
            ...t.trackedFileBackups
          };
          let r = e.snapshots.at(-1);
          if (r) {
            for (let l of e.trackedFiles) {
              if (l in n) {
                continue;
              }
              let c = r.trackedFileBackups[l];
              if (c) {
                n[l] = c;
              }
            }
          }
          let o = new Date();
          let s = {
            messageId: t.messageId,
            trackedFileBackups: n,
            timestamp: o
          };
          let i = [...e.snapshots, s];
          let a = {
            ...e,
            snapshots: i.length > 100 ? i.slice(-100) : i,
            snapshotSequence: (e.snapshotSequence ?? 0) + 1
          };
          yAa(a);
          J0p(e, a).catch(Oe);
          recordFileHistorySnapshot(t.messageId, s, false).catch(l => {
            Oe(Error(`FileHistory: Failed to record snapshot: ${l}`));
          });
          logForDebugging(`FileHistory: Added snapshot for ${t.messageId}, tracking ${e.trackedFiles.size} files`);
          logEvent("tengu_file_history_snapshot_success", {
            trackedFilesCount: e.trackedFiles.size,
            snapshotCount: a.snapshots.length
          });
          return a;
        } catch (n) {
          Oe(n);
          logEvent("tengu_file_history_snapshot_failed", {});
          return e;
        }
      case "touch":
        return {
          ...e,
          trackSequence: (e.trackSequence ?? 0) + 1
        };
    }
  }
  function fileHistoryEnabled() {
    if (va()) {
      return false;
    }
    if (getIsNonInteractiveSession()) {
      return q0p();
    }
    return uc("fileCheckpointingEnabled", true).value && !Me.CLAUDE_CODE_DISABLE_FILE_CHECKPOINTING;
  }
  function q0p() {
    return st(process.env.CLAUDE_CODE_ENABLE_SDK_FILE_CHECKPOINTING) && !Me.CLAUDE_CODE_DISABLE_FILE_CHECKPOINTING;
  }
  async function fileHistoryTrackEdit(e, t, n, r) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let o = TAa(n);
    let s = e();
    if (!s) {
      return;
    }
    let i = s.snapshots.at(-1);
    if (!i) {
      logForDebugging("FileHistory: Missing most recent snapshot", {
        level: "error"
      });
      logEvent("tengu_file_history_track_edit_failed", {});
      return;
    }
    if (i.trackedFileBackups[o]) {
      t({
        kind: "touch"
      });
      return;
    }
    let a;
    try {
      a = await SAa(n, 1);
    } catch (c) {
      logForDebugging(`FileHistory: failed to back up ${n}: ${c instanceof Error ? c.message : String(c)}`, {
        level: "error"
      });
      logEvent("tengu_file_history_track_edit_failed", {});
      return;
    }
    let l = a.backupFileName === null;
    t({
      kind: "track",
      trackingPath: o,
      filePath: n,
      backup: a,
      messageId: r,
      isAddingFile: l
    });
  }
  async function fileHistoryMakeSnapshot(e, t, n) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let r = e();
    if (!r) {
      return;
    }
    let o = {};
    let s = r.snapshots.at(-1);
    if (s) {
      logForDebugging(`FileHistory: Making snapshot for message ${n}`);
      await Promise.all(Array.from(r.trackedFiles, async i => {
        try {
          let a = HWt(i);
          let l = s.trackedFileBackups[i];
          let c = l ? l.version + 1 : 1;
          let u;
          try {
            u = await Ev.stat(a);
          } catch (d) {
            if (!fn(d)) {
              throw d;
            }
          }
          if (!u) {
            o[i] = {
              backupFileName: null,
              version: c,
              backupTime: new Date()
            };
            logEvent("tengu_file_history_backup_deleted_file", {
              version: c
            });
            logForDebugging(`FileHistory: Missing tracked file: ${i}`);
            return;
          }
          if (l && l.backupFileName !== null && !(await checkOriginFileChanged(a, l.backupFileName, u))) {
            o[i] = l;
            return;
          }
          o[i] = await SAa(a, c);
        } catch (a) {
          logForDebugging(`FileHistory: Failed to back up ${i}: ${a}`, {
            level: "error"
          });
          logEvent("tengu_file_history_backup_file_failed", {});
        }
      }));
    }
    t({
      kind: "snapshot",
      messageId: n,
      trackedFileBackups: o
    });
  }
  async function fileHistoryRewind(e, t) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let n = e();
    if (!n) {
      return;
    }
    let r = n.snapshots.findLast(o => o.messageId === t);
    if (!r) {
      throw Oe(Error(`FileHistory: Snapshot for ${t} not found`)), logEvent("tengu_file_history_rewind_failed", {
        trackedFilesCount: n.trackedFiles.size,
        snapshotFound: false
      }), Error("The selected snapshot was not found");
    }
    try {
      logForDebugging(`FileHistory: [Rewind] Rewinding to snapshot for ${t}`);
      let o = await G0p(n, r);
      logForDebugging(`FileHistory: [Rewind] Finished rewinding to ${t}`);
      logEvent("tengu_file_history_rewind_success", {
        trackedFilesCount: n.trackedFiles.size,
        filesChangedCount: o.length
      });
    } catch (o) {
      throw Oe(o), logEvent("tengu_file_history_rewind_failed", {
        trackedFilesCount: n.trackedFiles.size,
        snapshotFound: true
      }), o;
    }
  }
  function fileHistoryCanRestore(e, t) {
    if (!fileHistoryEnabled()) {
      return false;
    }
    return e.snapshots.some(n => n.messageId === t);
  }
  async function fileHistoryGetDiffStats(e, t) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let n = e.snapshots.findLast(a => a.messageId === t);
    if (!n) {
      return;
    }
    let r = await Promise.all(Array.from(e.trackedFiles, async a => {
      try {
        let l = HWt(a);
        let c = n.trackedFileBackups[a];
        let u = c ? c.backupFileName : Zfo(a, e);
        if (u === undefined) {
          logForDebugging("FileHistory: Error finding the backup file to apply", {
            level: "error"
          });
          logEvent("tengu_file_history_rewind_restore_file_failed", {
            dryRun: true
          });
          return null;
        }
        let d = await z0p(l, u === null ? undefined : u);
        if (d?.insertions || d?.deletions) {
          return {
            filePath: l,
            stats: d
          };
        }
        if (u === null && (await ad(l))) {
          return {
            filePath: l,
            stats: d
          };
        }
        return null;
      } catch (l) {
        Oe(l);
        logEvent("tengu_file_history_rewind_restore_file_failed", {
          dryRun: true
        });
        return null;
      }
    }));
    let o = [];
    let s = 0;
    let i = 0;
    for (let a of r) {
      if (!a) {
        continue;
      }
      o.push(a.filePath);
      s += a.stats?.insertions || 0;
      i += a.stats?.deletions || 0;
    }
    return {
      filesChanged: o,
      insertions: s,
      deletions: i
    };
  }
  async function fileHistoryHasAnyChanges(e, t) {
    if (!fileHistoryEnabled()) {
      return false;
    }
    let n = e.snapshots.findLast(r => r.messageId === t);
    if (!n) {
      return false;
    }
    for (let r of e.trackedFiles) {
      try {
        let o = HWt(r);
        let s = n.trackedFileBackups[r];
        let i = s ? s.backupFileName : Zfo(r, e);
        if (i === undefined) {
          continue;
        }
        if (i === null) {
          if (await ad(o)) {
            return true;
          }
          continue;
        }
        if (await checkOriginFileChanged(o, i)) {
          return true;
        }
      } catch (o) {
        Oe(o);
      }
    }
    return false;
  }
  async function G0p(e, t) {
    let n = [];
    for (let r of e.trackedFiles) {
      try {
        let o = HWt(r);
        let s = t.trackedFileBackups[r];
        let i = s ? s.backupFileName : Zfo(r, e);
        if (i === undefined) {
          logForDebugging("FileHistory: Error finding the backup file to apply", {
            level: "error"
          });
          logEvent("tengu_file_history_rewind_restore_file_failed", {
            dryRun: false
          });
          continue;
        }
        if (i === null) {
          try {
            await Ev.unlink(o);
            logForDebugging(`FileHistory: [Rewind] Deleted ${o}`);
            n.push(o);
          } catch (a) {
            if (!fn(a)) {
              throw a;
            }
          }
          continue;
        }
        if (await checkOriginFileChanged(o, i)) {
          await Y0p(o, i);
          logForDebugging(`FileHistory: [Rewind] Restored ${o} from ${i}`);
          n.push(o);
        }
      } catch (o) {
        logForDebugging(`FileHistory: [Rewind] Failed to restore ${r}: ${o instanceof Error ? o.message : String(o)}`, {
          level: "error"
        });
        logEvent("tengu_file_history_rewind_restore_file_failed", {
          dryRun: false
        });
      }
    }
    return n;
  }
  async function checkOriginFileChanged(e, t, n) {
    let r = T5e(t);
    let o = n ?? null;
    if (!o) {
      try {
        o = await Ev.stat(e);
      } catch (i) {
        if (!fn(i)) {
          return true;
        }
      }
    }
    let s = null;
    try {
      s = await Ev.stat(r);
    } catch (i) {
      if (!fn(i)) {
        return true;
      }
    }
    return V0p(o, s, async () => {
      try {
        let [i, a] = await Promise.all([Ev.readFile(e, "utf-8"), Ev.readFile(r, "utf-8")]);
        return i !== a;
      } catch {
        return true;
      }
    });
  }
  function V0p(e, t, n) {
    if (e === null !== (t === null)) {
      return true;
    }
    if (e === null || t === null) {
      return false;
    }
    if (e.mode !== t.mode || e.size !== t.size) {
      return true;
    }
    if (e.mtimeMs < t.mtimeMs) {
      return false;
    }
    return n();
  }
  async function z0p(e, t) {
    let n = [];
    let r = 0;
    let o = 0;
    try {
      let s = t ? T5e(t) : undefined;
      let [i, a] = await Promise.all([$jn(e), s ? $jn(s) : null]);
      if (i === null && a === null) {
        return {
          filesChanged: n,
          insertions: r,
          deletions: o
        };
      }
      n.push(e);
      kDe(i ?? "", a ?? "").forEach(c => {
        if (c.added) {
          r += c.count || 0;
        }
        if (c.removed) {
          o += c.count || 0;
        }
      });
    } catch (s) {
      Oe(Error(`FileHistory: Error generating diffStats: ${s}`));
    }
    return {
      filesChanged: n,
      insertions: r,
      deletions: o
    };
  }
  function K0p(e, t) {
    return `${_Aa.createHash("sha256").update(e).digest("hex").slice(0, 16)}@v${t}`;
  }
  function T5e(e, t) {
    let n = er();
    return BV.join(n, "file-history", t || getSessionId(), e);
  }
  async function SAa(e, t) {
    if (e === null) {
      return {
        backupFileName: null,
        version: t,
        backupTime: new Date()
      };
    }
    let n = K0p(e, t);
    let r = T5e(n);
    let o;
    try {
      o = await Ev.stat(e);
    } catch (s) {
      if (fn(s)) {
        return {
          backupFileName: null,
          version: t,
          backupTime: new Date()
        };
      }
      throw s;
    }
    try {
      await Ev.copyFile(e, r);
    } catch (s) {
      if (!fn(s)) {
        throw s;
      }
      await Ev.mkdir(BV.dirname(r), {
        recursive: true
      });
      await Ev.copyFile(e, r);
    }
    await Ev.chmod(r, o.mode);
    logEvent("tengu_file_history_backup_file_created", {
      version: t,
      fileSize: o.size
    });
    return {
      backupFileName: n,
      version: t,
      backupTime: new Date()
    };
  }
  async function Y0p(e, t) {
    let n = T5e(t);
    let r;
    try {
      r = await Ev.stat(n);
    } catch (o) {
      if (fn(o)) {
        logEvent("tengu_file_history_rewind_restore_file_failed", {});
        logForDebugging(`FileHistory: [Rewind] Backup file not found: ${n}`, {
          level: "error"
        });
        return;
      }
      throw o;
    }
    try {
      await Ev.copyFile(n, e);
    } catch (o) {
      if (!fn(o)) {
        throw o;
      }
      await Ev.mkdir(BV.dirname(e), {
        recursive: true
      });
      await Ev.copyFile(n, e);
    }
    await Ev.chmod(e, r.mode);
  }
  function Zfo(e, t) {
    for (let n of t.snapshots) {
      let r = n.trackedFileBackups[e];
      if (r !== undefined && r.version === 1) {
        return r.backupFileName;
      }
    }
    return;
  }
  function TAa(e) {
    if (!BV.isAbsolute(e)) {
      return e;
    }
    let t = getOriginalCwd();
    if (e.startsWith(t)) {
      return BV.relative(t, e);
    }
    return e;
  }
  function HWt(e) {
    if (BV.isAbsolute(e)) {
      return e;
    }
    return BV.join(getOriginalCwd(), e);
  }
  function fileHistoryRestoreStateFromLog(e, t) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let n = [];
    let r = new Set();
    for (let o of e) {
      let s = {};
      for (let [i, a] of Object.entries(o.trackedFileBackups)) {
        let l = TAa(i);
        r.add(l);
        s[l] = a;
      }
      n.push({
        ...o,
        trackedFileBackups: s
      });
    }
    t({
      snapshots: n,
      trackedFiles: r,
      snapshotSequence: n.length
    });
  }
  async function copyFileHistoryForResume(e, t) {
    if (!fileHistoryEnabled()) {
      return;
    }
    let n = e.fileHistorySnapshots;
    if (!n || e.messages.length === 0) {
      return;
    }
    let o = e.messages.at(-1)?.sessionId;
    if (!o) {
      Oe(Error("FileHistory: Failed to copy backups on restore (no previous session id)"));
      return;
    }
    let s = t ?? getSessionId();
    if (o === s) {
      logForDebugging(`FileHistory: No need to copy file history for resuming with same session id: ${s}`);
      return;
    }
    try {
      let i = BV.join(er(), "file-history", s);
      await Ev.mkdir(i, {
        recursive: true
      });
      let a = 0;
      if (await Promise.allSettled(n.map(async l => {
        let c = Object.values(l.trackedFileBackups).filter(p => p.backupFileName !== null);
        if (!(await Promise.allSettled(c.map(async ({
          backupFileName: p
        }) => {
          let m = T5e(p, o);
          let f = BV.join(i, p);
          try {
            await Ev.link(m, f);
          } catch (h) {
            let g = en(h);
            if (g === "EEXIST") {
              return;
            }
            if (g === "ENOENT") {
              throw logForDebugging(`FileHistory: Failed to copy backup ${p} on restore (backup file does not exist in ${o})`, {
                level: "error"
              }), h;
            }
            logForDebugging(`FileHistory: hard link failed (${g}), falling back to copy: ${m} -> ${f}`, {
              level: "error"
            });
            try {
              await Ev.copyFile(m, f);
            } catch (y) {
              if (Io(y)) {
                throw logForDebugging(`FileHistory: copy fallback failed for ${m}: ${y}`), y;
              }
              throw Oe(Error("FileHistory: Error copying over backup from previous session")), y;
            }
          }
          logForDebugging(`FileHistory: Copied backup ${p} from session ${o} to ${s}`);
        }))).some(p => p.status === "rejected")) {
          recordFileHistorySnapshot(l.messageId, l, false).catch(p => {
            Oe(Error("FileHistory: Failed to record copy backup snapshot"));
          });
        } else {
          a++;
        }
      })), a > 0) {
        logEvent("tengu_file_history_resume_copy_failed", {
          numSnapshots: n.length,
          failedSnapshots: a
        });
      }
    } catch (i) {
      if (Io(i)) {
        logForDebugging(`FileHistory: backup-dir mkdir failed for session ${s}: ${i}`);
        return;
      }
      Oe(i);
    }
  }
  async function J0p(e, t) {
    let n = e.snapshots.at(-1);
    let r = t.snapshots.at(-1);
    if (!r) {
      return;
    }
    for (let o of t.trackedFiles) {
      let s = HWt(o);
      let i = n?.trackedFileBackups[o];
      let a = r.trackedFileBackups[o];
      if (i?.backupFileName === a?.backupFileName && i?.version === a?.version) {
        continue;
      }
      let l = null;
      if (i?.backupFileName) {
        let u = T5e(i.backupFileName);
        l = await $jn(u);
      }
      let c = null;
      if (a?.backupFileName) {
        let u = T5e(a.backupFileName);
        c = await $jn(u);
      }
      if (l !== c) {
        KDe(s, l, c);
      }
    }
  }
  async function $jn(e) {
    try {
      return await Ev.readFile(e, "utf-8");
    } catch {
      return null;
    }
  }
  function yAa(e) {
    if (false) {
      console.error(bAa.inspect(e, false, 5));
    }
  }
  var _Aa;
  var Ev;
  var BV;
  var bAa;
  var Jq = __lazy(() => {
    V9e();
    at();
    ru();
    Ot();
    _5e();
    je();
    pr();
    gn();
    dt();
    Zl();
    Rn();
    fa();
    zg();
    _Aa = require("crypto");
    Ev = require("fs/promises");
    BV = require("path");
    bAa = require("util");
  });
  function CAa(e) {
    let t = qTe.posix.sep + e.split(qTe.sep).join(qTe.posix.sep).replace(/^\/+/, "");
    let n = qTe.basename(e).toLowerCase();
    let r = qTe.extname(e).toLowerCase();
    if (Q0p.vZc(n)) {
      return true;
    }
    if (vAa.vZc(r)) {
      return true;
    }
    let o = n.split(".");
    if (o.length > 2) {
      let s = "." + o.slice(-2).join(".");
      if (vAa.vZc(s)) {
        return true;
      }
    }
    for (let s of Z0p) {
      if (t.includes(s)) {
        return true;
      }
    }
    for (let s of eIp) {
      if (s.test(n)) {
        return true;
      }
    }
    return false;
  }
  async function RAa(e, t) {
    if (CAa(e)) {
      return true;
    }
    let n = `${t}\x00${e}`;
    let r = wAa.get(n);
    if (r !== undefined) {
      return r;
    }
    let o = await execFileNoThrowWithCwd(gitExe(), ["check-attr", "linguist-generated", "--", e], {
      cwd: t,
      timeout: 5000
    });
    let s = false;
    if (o.code === 0) {
      let i = o.stdout.trim().split(": ").pop()?.toLowerCase();
      s = i === "set" || i === "true";
    }
    wAa.set(n, s);
    return s;
  }
  var qTe;
  var Q0p;
  var vAa;
  var Z0p;
  var eIp;
  var wAa;
  var eho = __lazy(() => {
    ji();
    na();
    qTe = require("path");
    Q0p = new Set(["package-lock.json", "yarn.lock", "pnpm-lock.yaml", "bun.lockb", "bun.lock", "composer.lock", "gemfile.lock", "cargo.lock", "poetry.lock", "pipfile.lock", "shrinkwrap.json", "npm-shrinkwrap.json"]);
    vAa = new Set([".lock", ".min.js", ".min.css", ".min.html", ".bundle.js", ".bundle.css", ".generated.ts", ".generated.js", ".d.ts"]);
    Z0p = ["/dist/", "/build/", "/out/", "/output/", "/node_modules/", "/vendor/", "/vendored/", "/third_party/", "/third-party/", "/external/", "/.next/", "/.nuxt/", "/.svelte-kit/", "/coverage/", "/__pycache__/", "/.tox/", "/venv/", "/.venv/", "/target/release/", "/target/debug/", ".generated/", "/__snapshots__/"];
    eIp = [/^.*\.min\.[a-z]+$/i, /^.*-min\.[a-z]+$/i, /^.*\.bundle\.[a-z]+$/i, /^.*\.generated\.[a-z]+$/i, /^.*\.gen\.[a-z]+$/i, /^.*\.auto\.[a-z]+$/i, /^.*_generated\.[a-z]+$/i, /^.*_gen\.[a-z]+$/i, /^.*\.pb\.(go|js|ts|py|rb)$/i, /^.*_pb2?\.py$/i, /^.*\.pb\.h$/i, /^.*\.grpc\.[a-z]+$/i, /^.*\.swagger\.[a-z]+$/i, /^.*\.openapi\.[a-z]+$/i, /\.snap$/i];
    wAa = new Map();
  });
  function nho(e) {
    if (!/^https?:\/\//.test(e) && !/^ssh:\/\//.test(e) && !/^git@/.test(e)) {
      return false;
    }
    if (/[?#\\]/.test(ii(e.replace(/^(?:https?|ssh):\/\//, ""), "/"))) {
      return false;
    }
    let t = e.replace(/^https?:\/\//, "").replace(/^ssh:\/\//, "").replace(/^[^@/]+@/, "").replace(/\/$/, "");
    if (Me.CLAUDE_CODE_REMOTE && isLocalHost(ii(t, "/"))) {
      let n = normalizeGitRemoteUrl(e);
      if (n && !t.includes("@") && tIp.test(n)) {
        return xAa.includes(n);
      }
    }
    if (t.split("/").includes("..")) {
      return false;
    }
    return xAa.some(n => {
      if (!t.startsWith(n)) {
        return false;
      }
      let r = t.slice(n.length);
      return r === "" || r === ".git" || r.startsWith("/");
    });
  }
  function eMe() {
    let e = Nt();
    return findGitRoot(e) ?? getOriginalCwd();
  }
  function nIp(e) {
    return findCanonicalGitRoot(e) ?? e;
  }
  function PAa(e) {
    if (e.includes("fable-5")) {
      return "claude-fable-5";
    }
    if (e.includes("mythos-5")) {
      return "claude-mythos-5";
    }
    if (e.includes("opus-4-8")) {
      return "claude-opus-4-8";
    }
    if (e.includes("opus-4-7")) {
      return "claude-opus-4-7";
    }
    if (e.includes("opus-4-6")) {
      return "claude-opus-4-6";
    }
    if (e.includes("opus-4-5")) {
      return "claude-opus-4-5";
    }
    if (e.includes("opus-4-1")) {
      return "claude-opus-4-1";
    }
    if (e.includes("opus-4")) {
      return "claude-opus-4";
    }
    if (e.includes("sonnet-5")) {
      return "claude-sonnet-5";
    }
    if (e.includes("sonnet-4-6")) {
      return "claude-sonnet-4-6";
    }
    if (e.includes("sonnet-4-5")) {
      return "claude-sonnet-4-5";
    }
    if (e.includes("sonnet-4")) {
      return "claude-sonnet-4";
    }
    if (e.includes("sonnet-3-7")) {
      return "claude-sonnet-3-7";
    }
    if (e.includes("haiku-4-5")) {
      return "claude-haiku-4-5";
    }
    if (e.includes("haiku-3-5")) {
      return "claude-haiku-3-5";
    }
    return "claude";
  }
  function OAa() {
    return process.env.CLAUDE_CODE_ENTRYPOINT ?? "cli";
  }
  function rIp(e) {
    return AAa.createHash("sha256").update(e).digest("hex");
  }
  function jjn(e) {
    let t = zt();
    let n = eMe();
    if (!KX.isAbsolute(e)) {
      return e;
    }
    let r = e;
    let o = n;
    try {
      r = t.realpathSync(e);
    } catch {}
    try {
      o = t.realpathSync(n);
    } catch {}
    if (r.startsWith(o + KX.sep) || r === o) {
      return KX.relative(o, r).replaceAll(KX.sep, "/");
    }
    if (e.startsWith(n + KX.sep) || e === n) {
      return KX.relative(n, e).replaceAll(KX.sep, "/");
    }
    return e;
  }
  function fmt() {
    return {
      fileStates: new Map(),
      surface: OAa(),
      startingHeadSha: null,
      promptCount: 0,
      promptCountAtLastCommit: 0,
      permissionPromptCount: 0,
      permissionPromptCountAtLastCommit: 0,
      escapeCount: 0,
      escapeCountAtLastCommit: 0,
      verificationMethods: []
    };
  }
  function DAa(e, t, n, r, o) {
    let s = jjn(t);
    try {
      let i;
      if (n === "" || r === "") {
        i = n === "" ? r.length : n.length;
      } else {
        let c = Math.min(n.length, r.length);
        let u = 0;
        while (u < c && n[u] === r[u]) {
          u++;
        }
        let d = 0;
        while (d < c - u && n[n.length - 1 - d] === r[r.length - 1 - d]) {
          d++;
        }
        let p = n.length - u - d;
        let m = r.length - u - d;
        i = Math.max(p, m);
      }
      let l = e.get(s)?.claudeContribution ?? 0;
      return {
        contentHash: rIp(r),
        claudeContribution: l + i,
        mtime: o
      };
    } catch (i) {
      Oe(i);
      return null;
    }
  }
  function oIp(e, t, n, r, o, s = Date.now()) {
    let i = jjn(t);
    let a = DAa(e.fileStates, t, n, r, s);
    if (!a) {
      return e;
    }
    let l = new Map(e.fileStates);
    l.set(i, a);
    logForDebugging(`Attribution: Tracked ${a.claudeContribution} chars for ${i}`);
    return {
      ...e,
      fileStates: l
    };
  }
  function sIp(e, t) {
    let n = new Map(e.fileStates);
    for (let r of t) {
      let o = r.mtime ?? Date.now();
      if (r.type === "deleted") {
        let s = jjn(r.path);
        let a = n.get(s)?.claudeContribution ?? 0;
        let l = r.oldContent.length;
        n.set(s, {
          contentHash: "",
          claudeContribution: a + l,
          mtime: o
        });
        logForDebugging(`Attribution: Tracked deletion of ${s} (${l} chars removed, total contribution: ${a + l})`);
      } else {
        let s = DAa(n, r.path, r.oldContent, r.newContent, o);
        if (s) {
          let i = jjn(r.path);
          n.set(i, s);
          logForDebugging(`Attribution: Tracked ${s.claudeContribution} chars for ${i}`);
        }
      }
    }
    return {
      ...e,
      fileStates: n
    };
  }
  function Wjn(e, t) {
    switch (t.kind) {
      case "trackEdit":
        return oIp({
          ...e,
          surface: t.surface
        }, t.filePath, t.oldContent, t.newContent, t.userModified, t.mtime);
      case "trackBulk":
        return sIp({
          ...e,
          surface: t.surface
        }, t.changes);
      case "commitBoundary":
        return {
          ...e,
          promptCountAtLastCommit: t.promptCountAtLastCommit,
          permissionPromptCountAtLastCommit: t.permissionPromptCountAtLastCommit,
          escapeCountAtLastCommit: t.escapeCountAtLastCommit
        };
      case "incrementPermissionPrompt":
        return {
          ...e,
          permissionPromptCount: e.permissionPromptCount + 1
        };
      case "recordVerification":
        if (e.verificationMethods.includes(t.method)) {
          return e;
        }
        return {
          ...e,
          verificationMethods: [...e.verificationMethods, t.method]
        };
    }
  }
  async function rho(e, t, n = {
    staged: true
  }) {
    let r = eMe();
    let o = getSessionId();
    let s = {};
    let i = [];
    let a = new Set();
    let l = {};
    let c = 0;
    let u = 0;
    let d = new Map();
    for (let g of e) {
      a.add(g.surface);
      let y = g.fileStates instanceof Map ? g.fileStates : new Map(Object.entries(g.fileStates ?? {}));
      for (let [_, b] of y) {
        let S = d.get(_);
        if (S) {
          d.set(_, {
            ...b,
            claudeContribution: S.claudeContribution + b.claudeContribution
          });
        } else {
          d.set(_, b);
        }
      }
    }
    let p = await Promise.all(t.map(async g => {
      if (await RAa(g, r)) {
        return {
          type: "generated",
          file: g
        };
      }
      let y = KX.join(r, g);
      let _ = d.get(g);
      let b = e[0].surface;
      let S = 0;
      let E = 0;
      if (await iIp(g)) {
        if (_) {
          S = _.claudeContribution;
          E = 0;
        } else {
          let k = await kAa(g, n);
          E = k > 0 ? k : 100;
        }
      } else {
        try {
          let k = await IAa.stat(y);
          if (_) {
            S = _.claudeContribution;
            E = 0;
          } else {
            let I = await kAa(g, n);
            E = I > 0 ? I : k.size;
          }
        } catch {
          return null;
        }
      }
      S = Math.max(0, S);
      E = Math.max(0, E);
      let x = S + E;
      let A = x > 0 ? Math.round(S / x * 100) : 0;
      return {
        type: "file",
        file: g,
        claudeChars: S,
        humanChars: E,
        percent: A,
        surface: b
      };
    }));
    for (let g of p) {
      if (!g) {
        continue;
      }
      if (g.type === "generated") {
        i.push(g.file);
        continue;
      }
      s[g.file] = {
        claudeChars: g.claudeChars,
        humanChars: g.humanChars,
        percent: g.percent,
        surface: g.surface
      };
      c += g.claudeChars;
      u += g.humanChars;
      l[g.surface] = (l[g.surface] ?? 0) + g.claudeChars;
    }
    let m = c + u;
    let f = m > 0 ? Math.round(c / m * 100) : 0;
    let h = {};
    for (let [g, y] of Object.entries(l)) {
      let _ = m > 0 ? Math.round(y / m * 100) : 0;
      h[g] = {
        claudeChars: y,
        percent: _
      };
    }
    return {
      version: 1,
      summary: {
        claudePercent: f,
        claudeChars: c,
        humanChars: u,
        surfaces: Array.from(a)
      },
      files: s,
      surfaceBreakdown: h,
      excludedGenerated: i,
      sessions: [o]
    };
  }
  async function kAa(e, t = {
    staged: true
  }) {
    let n = eMe();
    try {
      let r = ["diff"];
      if (t.staged) {
        r.push("--cached");
      }
      r.push("--stat", "--", e);
      let o = await execFileNoThrowWithCwd(gitExe(), r, {
        cwd: n,
        timeout: 5000
      });
      if (o.code !== 0 || !o.stdout) {
        return 0;
      }
      let s = o.stdout.split(`
`).filter(Boolean);
      let i = 0;
      for (let a of s) {
        if (a.includes("file changed") || a.includes("files changed")) {
          let l = a.match(/(\d+) insertions?/);
          let c = a.match(/(\d+) deletions?/);
          let u = l ? parseInt(l[1], 10) : 0;
          let d = c ? parseInt(c[1], 10) : 0;
          i += (u + d) * 40;
        }
      }
      return i;
    } catch {
      return 0;
    }
  }
  async function iIp(e) {
    let t = eMe();
    try {
      let n = await execFileNoThrowWithCwd(gitExe(), ["diff", "--cached", "--name-status", "--", e], {
        cwd: t,
        timeout: 5000
      });
      if (n.code === 0 && n.stdout) {
        return n.stdout.trim().startsWith("D\t");
      }
    } catch {}
    return false;
  }
  var AAa;
  var IAa;
  var KX;
  var xAa;
  var tIp;
  var tho;
  var qjn;
  var HG = __lazy(() => {
    at();
    vo();
    je();
    d_();
    ji();
    eho();
    FP();
    na();
    Rn();
    Eo();
    Zn();
    AAa = require("crypto");
    IAa = require("fs/promises");
    KX = require("path");
    xAa = [];
    tIp = /^[a-z0-9.-]+(?::[0-9]+)?\/[a-z0-9._-]+\/[a-z0-9._-]+$/;
    tho = new Map();
    qjn = tnt(async e => {
      let t = nIp(e);
      let n = tho.get(t);
      if (n !== undefined) {
        return n === "internal";
      }
      let r = await getRemoteUrlForDir(e);
      if (!r) {
        tho.set(t, "none");
        return false;
      }
      let o = nho(r);
      tho.set(t, o ? "internal" : "external");
      return o;
    });
  });
  function Vjn() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.repoVisibility === true;
  }
  function FAa(e) {
    if (e === null) {
      return null;
    }
    return {
      repo: e.slug.replace(/[^a-zA-Z0-9._/-]/g, "").slice(0, 128),
      visibility: dIp(e)
    };
  }
  function zjn(e) {
    return;
  }
  function UAa(e) {
    return LAa.get(e);
  }
  function uIp(e, t) {
    if (e === null || t === null) {
      return e === t;
    }
    return e.slug === t.slug && e.host === t.host && e.visibility === t.visibility;
  }
  async function aho(e) {
    return;
  }
  function BAa(e) {
    if (iho?.vZc(e)) {
      return iho.get(e);
    }
    let t = findGitRoot(e) ?? "<no-git-root>";
    return sho.get(t);
  }
  function lho(e) {
    if (iho?.vZc(e)) {
      return e;
    }
    return findGitRoot(e) ?? "<no-git-root>";
  }
  function cho() {
    return lIp ?? Nt();
  }
  function dIp(e) {
    if (e.visibility !== "unknown") {
      return e.visibility;
    }
    return nho(`https://${e.host}/${e.slug}`) ? "private" : "unknown";
  }
  async function pIp(e) {
    let t = await detectCurrentRepositoryWithHost(e, {
      skipCache: true
    });
    if (!t) {
      return null;
    }
    let n = `${t.owner}/${t.name}`;
    let r = `${t.host}/${n}`;
    let o = NAa.get(r);
    if (o !== undefined) {
      return {
        slug: n,
        host: t.host,
        visibility: o
      };
    }
    let s = await mIp(t.host, t.owner, t.name);
    NAa.set(r, s);
    return {
      slug: n,
      host: t.host,
      visibility: s
    };
  }
  function WWt(e) {
    logEvent("tengu_auto_mode_repo_visibility_lookup_failed", {
      reason: e
    });
  }
  async function mIp(e, t, n) {
    if (!ef(e)) {
      WWt("non_github_host");
      return "unknown";
    }
    let r = `${oMt(e)}/repos/${encodeURIComponent(t)}/${encodeURIComponent(n)}`;
    if (Vi()) {
      WWt("essential_traffic_only");
      return "unknown";
    }
    try {
      let o = await bjn(e);
      let {
        data: s
      } = await externalHttp.get(r, {
        headers: {
          ...(o && {
            Authorization: `Bearer ${o}`
          }),
          Accept: "application/vnd.github+json",
          "X-GitHub-Api-Version": "2022-11-28",
          "User-Agent": dg()
        },
        timeout: 3000,
        signal: AbortSignal.timeout(3000),
        maxRedirects: 0
      });
      let i = cIp().safeParse(s);
      if (!i.success) {
        WWt("parse_error");
        return "unknown";
      }
      let a = i.data.visibility;
      if (a === "public") {
        return "public";
      }
      if (a === "private" || a === "internal") {
        return "private";
      }
      if (i.data.private === true) {
        return "private";
      }
      if (i.data.private === false) {
        return "public";
      }
      WWt("missing_fields");
      return "unknown";
    } catch {
      WWt("http_error");
      return "unknown";
    }
  }
  var NAa;
  var sho;
  var LAa;
  var iho;
  var lIp;
  var cIp;
  var oho;
  var Kjn = __lazy(() => {
    qg();
    $n();
    Ot();
    pk();
    HG();
    vo();
    bI();
    na();
    Wd();
    Ofo();
    fk();
    NAa = new Map();
    sho = new Map();
    LAa = new Map();
    cIp = we(() => Ke.object({
      visibility: Ke.enum(["public", "private", "internal"]).optional(),
      private: Ke.boolean().optional()
    }));
    oho = new Set();
  });
  function ES(e) {
    let t = fIp(e) ? e.manifest.displayName : e.displayName;
    return tMe(t) ?? e.name;
  }
  function tMe(e) {
    if (typeof e !== "string") {
      return;
    }
    return e.trim() ? e : undefined;
  }
  function fIp(e) {
    return "manifest" in e && typeof e.manifest === "object" && e.manifest !== null;
  }
  var zAa = {};