  __export(Tgc, {
    isPlanModeSafeMcpTool: () => isPlanModeSafeMcpTool,
    isClaudePreviewMcpToolName: () => isClaudePreviewMcpToolName,
    isChromeMcpToolName: () => isChromeMcpToolName,
    isAutoModeFastPathExcludedTool: () => isAutoModeFastPathExcludedTool,
    isAutoModeAllowlistedTool: () => isAutoModeAllowlistedTool,
    _planModeSubsetContract: () => _planModeSubsetContract
  });
  function isChromeMcpToolName(e) {
    return hnn.some(t => e.startsWith(t));
  }
  function isClaudePreviewMcpToolName(e) {
    return e.startsWith("mcp__Claude_Preview__");
  }
  function pgc(e) {
    return ygc.vZc(String(e?.action));
  }
  function isAutoModeAllowlistedTool(e, t) {
    if (dhf.vZc(e)) {
      return true;
    }
    if (fgc.vZc(e)) {
      return true;
    }
    if (hgc.vZc(e)) {
      return pgc(t);
    }
    if (ggc.vZc(e)) {
      let n = t?.actions;
      if (!Array.isArray(n) || n.length === 0) {
        return false;
      }
      return n.every(pgc);
    }
    return false;
  }
  function mgc(e) {
    return Sgc.vZc(String(e?.action));
  }
  function isPlanModeSafeMcpTool(e, t) {
    if (bgc.vZc(e)) {
      return true;
    }
    if (hgc.vZc(e)) {
      return mgc(t);
    }
    if (ggc.vZc(e)) {
      let n = t?.actions;
      if (!Array.isArray(n) || n.length === 0) {
        return false;
      }
      return n.every(mgc);
    }
    return false;
  }
  function isAutoModeFastPathExcludedTool(e) {
    return hhf.vZc(e);
  }
  var uhf;
  var dhf;
  var hnn;
  var fgc;
  var hgc;
  var ggc;
  var ygc;
  var bgc;
  var Sgc;
  var _planModeSubsetContract;
  var hhf;
  var mmr = __lazy(() => {
    Sh();
    cU();
    Tm();
    Fk();
    _x();
    N6e();
    ioe();
    kX();
    wbt();
    uhf = [];
    dhf = new Set(["Read", "Grep", "Glob", "LSP", "ToolSearch", "ListMcpResourcesTool", "ReadMcpResourceTool", "ReadMcpResourceDirTool", "WaitForMcpServers", "ReportFindings", "TodoWrite", "TaskCreate", "TaskGet", "TaskUpdate", "TaskList", "TaskStop", "TaskOutput", "AskUserQuestion", "ConnectGitHub", "EnterPlanMode", "ExitPlanMode", "SendMessage", ...(null ? [null] : []), ...(null ? [null] : []), ...(null ? [null] : []), "ShowOnboardingRolePicker", ...(null ? [null] : []), ...uhf, "classify_result"]);
    hnn = ["mcp__claude-in-chrome__", "mcp__Claude_in_Chrome__", "mcp__Claude_Preview__"];
    fgc = new Set([...["find", "get_page_text", "gif_creator", "list_connected_browsers", "read_console_messages", "read_network_requests", "read_page", "resize_window", "select_browser", "shortcuts_list", "switch_browser", "tabs_close_mcp", "tabs_context_mcp"].flatMap(e => hnn.map(t => t + e)), ...["tabs_close", "tabs_context", "tabs_create", "tabs_select"].map(e => `mcp__Claude_Preview__${e}`)]);
    hgc = new Set(hnn.map(e => `${e}computer`));
    ggc = new Set(hnn.map(e => `${e}browser_batch`));
    ygc = new Set(["screenshot", "zoom", "wait", "get_page_text", "find", "scroll", "scroll_to", "hover", "mouse_move", "cursor_position", "left_click", "right_click", "middle_click", "double_click", "triple_click", "left_click_drag"]);
    bgc = new Set([...["find", "get_page_text", "list_connected_browsers", "read_console_messages", "read_network_requests", "read_page", "shortcuts_list", "tabs_context_mcp"].flatMap(e => hnn.map(t => t + e)), "mcp__Claude_Preview__tabs_context"]);
    Sgc = new Set(["screenshot", "wait", "get_page_text", "find", "cursor_position"]);
    _planModeSubsetContract = {
      CHROME_MCP_READONLY_TOOLS: bgc,
      CHROME_MCP_SAFE_TOOLS: fgc,
      CHROME_READONLY_SUBACTIONS: Sgc,
      CHROME_SAFE_SUBACTIONS: ygc
    };
    hhf = new Set(["Agent", "CronCreate", "RemoteTrigger", "ScheduleWakeup", ...(null ? [(null).SPAWN_LOCAL_TOOL_NAME, (null).REQUEUE_SESSION_TOOL_NAME] : [])]);
  });
  var A$l = {};
  __export(A$l, {
    toolAlwaysAllowedRule: () => toolAlwaysAllowedRule,
    syncPermissionRulesFromDisk: () => syncPermissionRulesFromDisk,
    sameTurnSiblingContextEnabledWithSource: () => sameTurnSiblingContextEnabledWithSource,
    permissionRuleSourceDisplayString: () => permissionRuleSourceDisplayString,
    isNonDeniableTool: () => isNonDeniableTool,
    hasPermissionsToUseToolWithSink: () => hasPermissionsToUseToolWithSink,
    hasPermissionsToUseTool: () => hasPermissionsToUseTool,
    guardHookUpdatedInput: () => guardHookUpdatedInput,
    getRuleByContentsForToolName: () => getRuleByContentsForToolName,
    getRuleByContentsForTool: () => getRuleByContentsForTool,
    getInputParamRule: () => getInputParamRule,
    getDenyRules: () => getDenyRules,
    getDenyRuleForTool: () => getDenyRuleForTool,
    getDenyRuleForAgent: () => getDenyRuleForAgent,
    getAskRules: () => getAskRules,
    getAskRuleForTool: () => getAskRuleForTool,
    getAllowRules: () => getAllowRules,
    findSafetyCheckReason: () => findSafetyCheckReason,
    filterDeniedAgents: () => filterDeniedAgents,
    deletePermissionRule: () => deletePermissionRule,
    createPermissionRequestMessage: () => createPermissionRequestMessage_export,
    checkRuleBasedPermissions: () => checkRuleBasedPermissions,
    applyPermissionRulesToPermissionContext: () => applyPermissionRulesToPermissionContext,
    PERMISSION_RULE_SOURCES: () => PERMISSION_RULE_SOURCES
  });
  function isNonDeniableTool(e) {
    return !e.mcpInfo && bhf.vZc(e.name);
  }
  function permissionRuleSourceDisplayString(e) {
    return iPs(e);
  }
  function fmr(e, t) {
    let n = e === "Bash";
    if (!n && e !== "PowerShell") {
      return;
    }
    if (t === null || typeof t !== "object" || !("command" in t) || typeof t.command !== "string") {
      return;
    }
    let r = n ? oWe(t.command) : c5e(t.command);
    return {
      destructive_category: r ?? "none",
      destructive_target_scope: Xce(t.command, Nt(), r),
      git_destructive_target: sWe(t.command, r)
    };
  }
  function wgc(e) {
    return e === "auto" || e === "plan" && (yhf?.isAutoModeActive() ?? false);
  }
  function getAllowRules(e) {
    if (wgc(e.mode)) {
      let t = e.alwaysAllowRules;
      let n = [];
      for (let r of PERMISSION_RULE_SOURCES) {
        let o = t[r];
        if (o === undefined) {
          continue;
        }
        for (let s of o) {
          let i = Nh(s);
          if (isDangerousClassifierPermission(i.toolName, i.ruleContent)) {
            continue;
          }
          n.push({
            source: r,
            ruleBehavior: "allow",
            ruleValue: i
          });
        }
      }
      return n;
    }
    return SKo(e.alwaysAllowRules, "allow");
  }
  function createPermissionRequestMessage_export(e, t) {
    if (t) {
      if (t.type === "classifier") {
        return `Classifier '${t.classifier}' requires approval for this ${e} command: ${t.reason}`;
      }
      switch (t.type) {
        case "hook":
          return t.reason ? `Hook '${t.hookName}' blocked this action: ${t.reason}` : `Hook '${t.hookName}' requires approval for this ${e} command`;
        case "rule":
          {
            let r = jp(t.rule.ruleValue);
            let o = permissionRuleSourceDisplayString(t.rule.source);
            return `Permission rule '${r}' from ${o} requires approval for this ${e} command`;
          }
        case "subcommandResults":
          {
            let r = [];
            for (let [o, s] of t.reasons) {
              if (s.behavior === "ask" || s.behavior === "passthrough") {
                if (e === "Bash") {
                  let {
                    commandWithoutRedirections: i,
                    redirections: a
                  } = tpe(o);
                  let l = a.length > 0 ? i : o;
                  r.push(l);
                } else {
                  r.push(o);
                }
              }
            }
            if (r.length > 0) {
              let o = r.length;
              return `This ${e} command contains multiple operations. The following ${un(o, "part")} ${un(o, "requires", "require")} approval: ${r.join(", ")}`;
            }
            return `This ${e} command contains multiple operations that require approval`;
          }
        case "permissionPromptTool":
          return `Tool '${t.permissionPromptToolName}' requires approval for this ${e} command`;
        case "sandboxOverride":
          return "Run outside of the sandbox";
        case "workingDir":
          return t.reason;
        case "safetyCheck":
        case "other":
          return t.reason;
        case "mode":
          return `Current permission mode (${mY(t.mode)}) requires approval for this ${e} command`;
        case "asyncAgent":
          return t.reason;
      }
    }
    return `Claude requested permissions to use ${e}, but you haven't granted it yet.`;
  }
  function SKo(e, t) {
    let n = [];
    for (let r of PERMISSION_RULE_SOURCES) {
      let o = e[r];
      if (o === undefined) {
        continue;
      }
      for (let s of o) {
        n.push({
          source: r,
          ruleBehavior: t,
          ruleValue: Nh(s)
        });
      }
    }
    return n;
  }
  function getDenyRules(e) {
    return SKo(e.alwaysDenyRules, "deny");
  }
  function getAskRules(e) {
    return SKo(e.alwaysAskRules, "ask");
  }
  function TKo(e, t, {
    proxyExpansion: n = false,
    globMatching: r = false,
    toolAliases: o
  } = {}) {
    if (t.ruleValue.ruleContent !== undefined) {
      return false;
    }
    let s = Wte(e);
    if (t.ruleValue.toolName === s) {
      return true;
    }
    if (n && xyn(t.ruleValue.toolName, o).includes(s)) {
      return true;
    }
    if (r && $ke(t.ruleValue.toolName) && X1r(t.ruleValue.toolName, s)) {
      return true;
    }
    let i = TI(t.ruleValue.toolName);
    let a = TI(s);
    return i !== null && a !== null && i.serverName === a.serverName && (i.toolName === undefined || i.toolName === "*" || a.toolName !== undefined && $ke(i.toolName) && X1r(i.toolName, a.toolName));
  }
  function toolAlwaysAllowedRule(e, t) {
    return getAllowRules(e).find(n => TKo(t, n)) || null;
  }
  function vKo(e) {
    return e.source !== "cliArg" && e.source !== "toolsNarrowing";
  }
  function getDenyRuleForTool(e, t) {
    if (isNonDeniableTool(t)) {
      return null;
    }
    return getDenyRules(e).find(n => TKo(t, n, {
      proxyExpansion: vKo(n),
      globMatching: true,
      toolAliases: e.toolAliases
    })) || null;
  }
  function getAskRuleForTool(e, t) {
    if (isNonDeniableTool(t)) {
      return null;
    }
    return getAskRules(e).find(n => TKo(t, n, {
      proxyExpansion: vKo(n),
      globMatching: true,
      toolAliases: e.toolAliases
    })) || null;
  }
  function getInputParamRule(e, t, n, r) {
    let o = Wte(t);
    for (let s of [o, ...kyn(o, e.toolAliases)]) {
      for (let [i, a] of getRuleByContentsForToolName(e, s, r)) {
        if (s !== o && !vKo(a)) {
          continue;
        }
        let l = i.indexOf(":");
        if (l <= 0) {
          continue;
        }
        let c = i.slice(0, l).trim();
        let u = i.slice(l + 1).trim();
        if (c === "" || u === "") {
          continue;
        }
        if (c === t.ruleContentField) {
          continue;
        }
        if (!Object.hasOwn(n, c)) {
          continue;
        }
        let d = n[c];
        if (d === undefined || d === null || typeof d === "object") {
          continue;
        }
        if (J1r(u, String(d).trim())) {
          return a;
        }
      }
    }
    return null;
  }
  function getDenyRuleForAgent(e, t, n) {
    return getDenyRules(e).find(r => r.ruleValue.toolName === t && r.ruleValue.ruleContent === n) || null;
  }
  function filterDeniedAgents(e, t, n) {
    let r = new Set();
    for (let o of getDenyRules(t)) {
      if (o.ruleValue.toolName === n && o.ruleValue.ruleContent !== undefined) {
        r.add(o.ruleValue.ruleContent);
      }
    }
    return e.filter(o => !r.vZc(o.agentType));
  }
  function getRuleByContentsForTool(e, t, n) {
    return getRuleByContentsForToolName(e, Wte(t), n);
  }
  function getRuleByContentsForToolName(e, t, n) {
    let r = new Map();
    let o = [];
    switch (n) {
      case "allow":
        o = getAllowRules(e);
        break;
      case "deny":
        o = getDenyRules(e);
        break;
      case "ask":
        o = getAskRules(e);
        break;
    }
    for (let s of o) {
      if (s.ruleValue.toolName === t && s.ruleValue.ruleContent !== undefined && s.ruleBehavior === n) {
        r.set(s.ruleValue.ruleContent, s);
      }
    }
    return r;
  }
  function guardHookUpdatedInput(e, t) {
    if (e?.behavior === "deny" || e?.behavior === "ask") {
      logForDebugging(`PermissionRequest hook allowed ${t} with updatedInput, but ${e.behavior} rule overrides: ${e.message}`);
      return e;
    }
    return null;
  }
  async function Shf(e, t, n, r, o, s) {
    try {
      for await (let i of executePermissionRequestHooks(e.name, n, t, r, o, s, r.abortController.signal)) {
        if (!i.permissionRequestResult) {
          continue;
        }
        let a = i.permissionRequestResult;
        if (a.behavior === "allow") {
          let l = a.updatedInput ?? t;
          if (a.updatedInput) {
            let c = guardHookUpdatedInput(await checkRuleBasedPermissions(e, l, {
              ...r,
              toolUseId: n
            }), e.name);
            if (c) {
              return c.behavior === "ask" ? {
                behavior: "deny",
                message: c.message,
                decisionReason: c.decisionReason ?? HOOK_REWRITE_HEADLESS_DENY_REASON
              } : c;
            }
          }
          if (a.updatedPermissions?.length) {
            let c = a.updatedPermissions;
            zV(c);
            r.setToolPermissionContext(u => Zq(u, c));
          }
          return {
            behavior: "allow",
            updatedInput: l,
            decisionReason: {
              type: "hook",
              hookName: "PermissionRequest"
            }
          };
        }
        if (a.behavior === "deny") {
          if (a.interrupt) {
            logForDebugging(`Hook interrupt: tool=${e.name} hookMessage=${a.message}`);
            r.abortController.abort();
          }
          return {
            behavior: "deny",
            message: a.message || "Permission denied by hook",
            decisionReason: {
              type: "hook",
              hookName: "PermissionRequest",
              reason: a.message
            }
          };
        }
      }
    } catch (i) {
      logForDebugging(`PermissionRequest hook failed for headless agent: ${sr(i).message}`, {
        level: "error"
      });
    }
    return null;
  }
  function Thf() {
    return sameTurnSiblingContextEnabledWithSource().value;
  }
  function sameTurnSiblingContextEnabledWithSource() {
    let e = gI.CLAUDE_CODE_AUTO_MODE_SIBLING_CONTEXT;
    if (e !== undefined) {
      return {
        value: e,
        src: "env"
      };
    }
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {});
    if (typeof t?.sameTurnSiblingContext === "boolean") {
      return {
        value: t.sameTurnSiblingContext,
        src: "gb"
      };
    }
    return {
      value: false,
      src: "default"
    };
  }
  function gRt(e, t) {
    if (e.localDenialTracking) {
      Object.assign(e.localDenialTracking, t);
    } else {
      e.setAppState(n => {
        if (n.denialTracking === t) {
          return n;
        }
        return {
          ...n,
          denialTracking: t
        };
      });
    }
  }
  function vhf(e, t, n, r, o, s) {
    if (!RFl(e)) {
      return null;
    }
    let i = e.totalDenials >= Rrr.maxTotal;
    let a = getToolPermissionContext(s).shouldAvoidPermissionPrompts;
    let l = e.totalDenials;
    let c = e.consecutiveDenials;
    let u = i ? `${l} actions were blocked this session. Please review the transcript before continuing.` : `${c} consecutive actions were blocked. Please review the transcript before continuing.`;
    if (logEvent("tengu_auto_mode_denial_limit_exceeded", {
      limit: i ? "total" : "consecutive",
      mode: a ? "headless" : "cli",
      messageID: n.message.id,
      consecutiveDenials: c,
      totalDenials: l,
      toolName: qi(r.name)
    }), a) {
      throw new xc("Agent aborted: too many classifier denials in headless mode");
    }
    if (logForDebugging(`Classifier denial limit exceeded, falling back to prompting: ${u}`, {
      level: "warn"
    }), i) {
      gRt(s, {
        ...e,
        totalDenials: 0,
        consecutiveDenials: 0
      });
    }
    let d = o.decisionReason?.type === "classifier" ? o.decisionReason.classifier : "auto-mode";
    return {
      ...o,
      decisionReason: {
        type: "classifier",
        classifier: d,
        reason: `${u}

Latest blocked action: ${t}`
      }
    };
  }
  function gmr(e) {
    if (e?.type === "rule" && e.rule.ruleBehavior === "ask") {
      return true;
    }
    if (e?.type === "subcommandResults") {
      for (let t of e.reasons.values()) {
        if (t.behavior === "ask" && gmr(t.decisionReason)) {
          return true;
        }
      }
    }
    return false;
  }
  function whf(e) {
    return e?.type === "rule" && e.rule.ruleBehavior === "ask" && e.rule.source === "mcpServerPolicy";
  }
  function Cgc(e) {
    return e?.type === "mode" && e.mode === "plan";
  }
  async function checkRuleBasedPermissions(e, t, n) {
    let r = getToolPermissionContext(n);
    let o = getDenyRuleForTool(r, e);
    if (o) {
      return {
        behavior: "deny",
        decisionReason: {
          type: "rule",
          rule: o
        },
        message: `Permission to use ${e.name} has been denied.`
      };
    }
    let s = getInputParamRule(r, e, t, "deny");
    if (s) {
      return {
        behavior: "deny",
        decisionReason: {
          type: "rule",
          rule: s
        },
        message: `Permission to use ${e.name} with ${s.ruleValue.ruleContent} has been denied.`
      };
    }
    let i = getAskRuleForTool(r, e);
    if (i) {
      if (!(e.name === "Bash" && SandboxManager.isSandboxingEnabled() && SandboxManager.isAutoAllowBashIfSandboxedEnabled() && $1(t))) {
        return {
          behavior: "ask",
          decisionReason: {
            type: "rule",
            rule: i
          },
          message: createPermissionRequestMessage_export(e.name)
        };
      }
    }
    let a = {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export(e.name)
    };
    try {
      let c = e.inputSchema.parse(t);
      a = await e.checkPermissions(c, n);
    } catch (c) {
      if (c instanceof xc || c instanceof _f) {
        throw c;
      }
      if (!mg(c)) {
        Oe(c);
      }
    }
    if (a?.behavior === "deny") {
      return a;
    }
    let l = getInputParamRule(r, e, t, "ask");
    if (l) {
      return {
        behavior: "ask",
        decisionReason: {
          type: "rule",
          rule: l
        },
        message: createPermissionRequestMessage_export(e.name)
      };
    }
    if (a?.behavior === "ask" && gmr(a.decisionReason)) {
      return a;
    }
    if (e.mcpInfo?.effectiveMaxPermission === "ask") {
      let c = {
        type: "other",
        reason: "Your organization requires approval for this tool"
      };
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(e.name, c),
        decisionReason: c
      };
    }
    if (a?.behavior === "ask" && (findSafetyCheckReason(a.decisionReason) || a.decisionReason?.type === "sandboxOverride")) {
      return a;
    }
    return null;
  }
  async function Chf(e, t, n, r) {
    if (n.abortController.signal.aborted) {
      throw new xc();
    }
    let o = getToolPermissionContext(n);
    let s = getDenyRuleForTool(o, e);
    if (s) {
      return {
        behavior: "deny",
        decisionReason: {
          type: "rule",
          rule: s
        },
        message: `Permission to use ${e.name} has been denied.`
      };
    }
    let i = getInputParamRule(o, e, t, "deny");
    if (i) {
      return {
        behavior: "deny",
        decisionReason: {
          type: "rule",
          rule: i
        },
        message: `Permission to use ${e.name} with ${i.ruleValue.ruleContent} has been denied.`
      };
    }
    let a = getAskRuleForTool(o, e);
    if (a) {
      let g = e.name === "Bash" && SandboxManager.isSandboxingEnabled() && SandboxManager.isAutoAllowBashIfSandboxedEnabled() && $1(t);
      let y = a.source === "mcpServerPolicy" && Me.CLAUDE_CODE_REMOTE && fNe(e, o) === "bypassPermissions" && getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_server_policy_bypass_exempt", true);
      if (!g && !y) {
        return {
          behavior: "ask",
          decisionReason: {
            type: "rule",
            rule: a
          },
          message: createPermissionRequestMessage_export(e.name)
        };
      }
    }
    let l = {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export(e.name)
    };
    try {
      let g = e.inputSchema.parse(t);
      if (l = await e.checkPermissions(g, n), e.mcpInfo && !e.isReadOnly(g) && l.behavior === "passthrough" && getToolPermissionContext(n).mode === "plan" && !isPlanModeSafeMcpTool(Wte(e), g)) {
        l = {
          behavior: "ask",
          message: `Cannot call ${e.name} while in plan mode.`,
          decisionReason: {
            type: "mode",
            mode: "plan"
          }
        };
      }
    } catch (g) {
      if (g instanceof xc || g instanceof _f) {
        throw g;
      }
      if (!mg(g)) {
        Oe(g);
      }
    }
    if (l?.behavior === "deny") {
      return l;
    }
    let c = getInputParamRule(o, e, t, "ask");
    if (c) {
      return {
        behavior: "ask",
        decisionReason: {
          type: "rule",
          rule: c
        },
        message: createPermissionRequestMessage_export(e.name)
      };
    }
    if (e.requiresUserInteraction?.() && l?.behavior === "ask") {
      return l;
    }
    if (l?.behavior === "ask" && gmr(l.decisionReason)) {
      return l;
    }
    if (e.mcpInfo?.effectiveMaxPermission === "ask") {
      let g = {
        type: "other",
        reason: "Your organization requires approval for this tool"
      };
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(e.name, g),
        decisionReason: g
      };
    }
    let u = getToolPermissionContext(n);
    let d = fNe(e, u);
    let p = d === "bypassPermissions" || d === "plan" && u.isBypassPermissionsModeAvailable;
    let m = p && l?.behavior === "ask" ? findSafetyCheckReason(l.decisionReason, g => g.reason.startsWith("Dangerous rm operation") || g.reason.startsWith("Dangerous rmdir operation")) : undefined;
    if (l?.behavior === "ask" && (m || !p && (findSafetyCheckReason(l.decisionReason) || l.decisionReason?.type === "sandboxOverride" || Cgc(l.decisionReason)))) {
      return l;
    }
    if (p) {
      return {
        behavior: "allow",
        updatedInput: Egc(l, t),
        decisionReason: {
          type: "mode",
          mode: d
        }
      };
    }
    let f = toolAlwaysAllowedRule(getToolPermissionContext(n), e);
    if (f && !(yRt.isChromeMcpToolName(Wte(e)) && (yRt.isClaudePreviewMcpToolName(Wte(e)) ? getToolPermissionContext(n).previewClassifierFloorEnabled === true : getToolPermissionContext(n).chromeClassifierFloorEnabled === true))) {
      return {
        behavior: "allow",
        updatedInput: Egc(l, t),
        decisionReason: {
          type: "rule",
          rule: f
        }
      };
    }
    let h = l.behavior === "passthrough" ? {
      ...l,
      behavior: "ask",
      message: createPermissionRequestMessage_export(e.name, l.decisionReason)
    } : l;
    if (h.behavior === "ask" && h.suggestions) {
      logForDebugging(`Permission suggestions for ${e.name}: ${De(h.suggestions, null, 2)}`);
    }
    return h;
  }
  async function deletePermissionRule({
    rule: e,
    initialContext: t,
    setToolPermissionContext: n
  }) {
    if (e.source === "policySettings" || e.source === "flagSettings" || e.source === "command") {
      throw Error("Cannot delete permission rules from read-only settings");
    }
    let r = $y(t, {
      type: "removeRules",
      rules: [e.ruleValue],
      behavior: e.ruleBehavior,
      destination: e.source
    });
    switch (e.source) {
      case "localSettings":
      case "userSettings":
      case "projectSettings":
        {
          eDa(e);
          break;
        }
      case "cliArg":
      case "session":
        break;
    }
    n(r);
  }
  function Rgc(e, t) {
    let n = new Map();
    for (let o of e) {
      let s = `${o.source}:${o.ruleBehavior}`;
      if (!n.vZc(s)) {
        n.set(s, []);
      }
      n.get(s).push(o.ruleValue);
    }
    let r = [];
    for (let [o, s] of n) {
      let [i, a] = o.split(":");
      r.push({
        type: t,
        rules: s,
        behavior: a,
        destination: i
      });
    }
    return r;
  }
  function applyPermissionRulesToPermissionContext(e, t) {
    let n = Rgc(t, "addRules");
    return Zq(e, n);
  }
  function syncPermissionRulesFromDisk(e, t) {
    let n = e;
    if (W5e()) {
      let o = [...sF, "cliArg", "session"];
      let s = ["allow", "deny", "ask"];
      for (let i of o) {
        for (let a of s) {
          n = $y(n, {
            type: "replaceRules",
            rules: [],
            behavior: a,
            destination: i
          });
        }
      }
    }
    for (let o of bC) {
      for (let s of ["allow", "deny", "ask"]) {
        n = $y(n, {
          type: "replaceRules",
          rules: [],
          behavior: s,
          destination: o
        });
      }
    }
    let r = Rgc(t, "replaceRules");
    return Zq(n, r);
  }
  function Egc(e, t) {
    return ("updatedInput" in e ? e.updatedInput : undefined) ?? t;
  }
  function findSafetyCheckReason(e, t = () => true) {
    if (!e) {
      return;
    }
    if (e.type === "safetyCheck") {
      return t(e) ? e : undefined;
    }
    if (e.type === "subcommandResults") {
      for (let n of e.reasons.values()) {
        let r = findSafetyCheckReason(n.decisionReason, t);
        if (r) {
          return r;
        }
      }
    }
    return;
  }
  var yRt;
  var yhf;
  var _hf;
  var PERMISSION_RULE_SOURCES;
  var bhf;
  var hasPermissionsToUseTool = async (e, t, n, r, o) => hasPermissionsToUseToolWithSink(e, t, n, r, o, undefined);
  var hasPermissionsToUseToolWithSink = async (e, t, n, r, o, s, i) => {
    let a = await Ehf(e, t, n, r, o, s, i);
    return a.behavior === "deny" ? {
      ...a,
      decideLocation: "pre-ask",
      ...false
    } : a;
  };
  var Ehf = async (e, t, n, r, o, s, i) => {
    let a = await Chf(e, t, {
      ...n,
      toolUseId: o
    }, s);
    if (a.behavior === "allow") {
      let l = n.getAppState();
      {
        let c = n.localDenialTracking ?? l.denialTracking;
        if (fNe(e, getToolPermissionContext(n)) === "auto" && c && c.consecutiveDenials > 0) {
          let u = _Xt(c);
          gRt(n, u);
        }
      }
      return a;
    }
    if (a.behavior === "ask") {
      let l = n.getAppState();
      let c = getToolPermissionContext(n);
      let u = fNe(e, c);
      let d = Wte(e);
      let p = yRt?.isChromeMcpToolName(d) ?? false;
      let m = yRt?.isClaudePreviewMcpToolName(d) === true ? c.previewClassifierFloorEnabled === true : c.chromeClassifierFloorEnabled === true;
      let f = a.metadata?.command?.chrome;
      let h = m && c.canAutoClassifierRun === true && p && (f?.domainAllowed === true || f?.hostHandlesOriginConsent === true || toolAlwaysAllowedRule(c, e) !== null);
      if (u === "dontAsk" && !h) {
        return {
          behavior: "deny",
          decisionReason: {
            type: "mode",
            mode: "dontAsk"
          },
          message: hmr(e.name)
        };
      }
      if (wgc(u) || h) {
        let _ = F => ({
          behavior: "allow",
          ...F
        });
        let b = findSafetyCheckReason(a.decisionReason, F => !F.classifierApprovable);
        let S = a.decisionReason?.type === "sandboxOverride";
        let E = gmr(a.decisionReason) && true && !(whf(a.decisionReason) && !(e.isDestructive?.(t) ?? false));
        let C = e.mcpInfo?.effectiveMaxPermission === "ask";
        let x = Cgc(a.decisionReason) && !isPlanModeSafeMcpTool(e.name, t);
        if (b || S || E || C || x) {
          if (c.shouldAvoidPermissionPrompts) {
            return {
              behavior: "deny",
              message: a.message,
              decisionReason: {
                type: "asyncAgent",
                reason: "Action requires interactive approval and permission prompts are not available in this context"
              }
            };
          }
          if (b || E || C || x) {
            logEvent("tengu_auto_mode_fallback_to_ask", {
              reason: b ? "safety_check" : E ? "ask_rule" : x ? "plan_mode_floor" : "org_ask_ceiling",
              toolName: qi(e.name)
            });
            return a;
          }
        }
        if (e.requiresUserInteraction?.() && a.behavior === "ask") {
          logEvent("tengu_auto_mode_fallback_to_ask", {
            reason: "requires_user_interaction",
            toolName: qi(e.name)
          });
          return a;
        }
        if (_hf?.workflowNeedsUsageConsentPrompt(e.name, n)) {
          logEvent("tengu_auto_mode_fallback_to_ask", {
            reason: "workflow_usage_consent",
            toolName: qi(e.name)
          });
          return a;
        }
        let A = n.localDenialTracking ?? l.denialTracking ?? xrr();
        if (e.name, "PowerShell", !yRt.isAutoModeFastPathExcludedTool(e.name) && !S) {
          try {
            let F = e.inputSchema.parse(t);
            let H = j => {
              let z = Nh(j);
              return !isDangerousClassifierPermission(z.toolName, z.ruleContent);
            };
            let U = Sbu(c.alwaysAllowRules, j => (j ?? []).filter(H));
            let N = n.permissionLayers?.map(j => j.kind === "allowed_tools" ? {
              ...j,
              allowedTools: j.allowedTools.filter(H)
            } : j);
            let W = await e.checkPermissions(F, {
              ...n,
              permissionLayers: N,
              getAppState: () => {
                let j = n.getAppState();
                return {
                  ...j,
                  toolPermissionContext: {
                    ...j.toolPermissionContext,
                    mode: "acceptEdits",
                    alwaysAllowRules: U
                  }
                };
              }
            });
            if (W.behavior === "allow") {
              let j = _Xt(A);
              gRt(n, j);
              logForDebugging(`Skipping auto mode classifier for ${e.name}: would be allowed in acceptEdits mode`);
              logEvent("tengu_auto_mode_decision", {
                decision: "allowed",
                toolName: qi(e.name),
                inProtectedNamespace: b6(),
                chromeAutomode: p,
                agentMsgId: r.message.id,
                confidence: "high",
                fastPath: "acceptEdits",
                ...fmr(e.name, t)
              });
              return _({
                updatedInput: W.updatedInput ?? t,
                decisionReason: {
                  type: "mode",
                  mode: "auto"
                }
              });
            }
          } catch (F) {
            if (F instanceof xc || F instanceof _f) {
              throw F;
            }
            if (!mg(F)) {
              Oe(F);
            }
            logEvent("tengu_auto_mode_decision", {
              decision: "fastpath_error",
              toolName: qi(e.name),
              inProtectedNamespace: b6(),
              chromeAutomode: p,
              agentMsgId: r.message.id,
              fastPath: "acceptEdits",
              error: F instanceof Error ? F.name : "unknown",
              ...fmr(e.name, t)
            });
          }
        }
        if (yRt.isAutoModeAllowlistedTool(e.name, t)) {
          let F = _Xt(A);
          gRt(n, F);
          logForDebugging(`Skipping auto mode classifier for ${e.name}: tool is on the safe allowlist`);
          yKo({
            tool: e.name,
            allowlisted: true,
            decision: "allowed",
            durationMs: 0
          });
          logEvent("tengu_auto_mode_decision", {
            decision: "allowed",
            toolName: qi(e.name),
            inProtectedNamespace: b6(),
            chromeAutomode: p,
            agentMsgId: r.message.id,
            confidence: "high",
            fastPath: "allowlist",
            ...fmr(e.name, t)
          });
          return _({
            updatedInput: a.updatedInput ?? t,
            decisionReason: {
              type: "mode",
              mode: "auto"
            }
          });
        }
        let k = Thf() ? n.sameTurnToolUses ?? [] : [];
        let I = sQn(e.name, t, o);
        Eya(i, o);
        let O;
        try {
          O = await CSt(k.length > 0 ? [...n.messages, ...k] : n.messages, I, n.options.tools, getToolPermissionContext(n), n.abortController.signal, {
            isSubagentLoop: isModelDrivenSession(n.agentId),
            recordPresumed: n.agentId === undefined
          });
        } finally {
          LDe(i, o);
        }
        let M = O.unavailable ? "unavailable" : O.shouldBlock ? "blocked" : "allowed";
        let L = O.usage && O.model ? wqe(O.model, O.usage) : undefined;
        if (yKo({
          tool: e.name,
          allowlisted: false,
          decision: M,
          classifierModel: O.model,
          inputTokens: O.usage?.inputTokens,
          outputTokens: O.usage?.outputTokens,
          cacheReadInputTokens: O.usage?.cacheReadInputTokens,
          cacheCreationInputTokens: O.usage?.cacheCreationInputTokens,
          durationMs: O.durationMs,
          costUSD: L,
          stage: O.stage
        }), logEvent("tengu_auto_mode_decision", {
          decision: M,
          toolName: qi(e.name),
          inProtectedNamespace: b6(),
          chromeAutomode: p,
          ...fmr(e.name, t),
          stripAllBashFlag: ILo(),
          originalDecisionReasonType: a.decisionReason?.type == null ? undefined : a.decisionReason?.type,
          agentMsgId: r.message.id,
          sameTurnSiblings: k.length,
          classifierModel: O.model,
          consecutiveDenials: O.shouldBlock ? A.consecutiveDenials + 1 : 0,
          totalDenials: O.shouldBlock ? A.totalDenials + 1 : A.totalDenials,
          classifierInputTokens: O.usage?.inputTokens,
          classifierOutputTokens: O.usage?.outputTokens,
          classifierCacheReadInputTokens: O.usage?.cacheReadInputTokens,
          classifierCacheCreationInputTokens: O.usage?.cacheCreationInputTokens,
          classifierDurationMs: O.durationMs,
          classifierSystemPromptLength: O.promptLengths?.systemPrompt,
          classifierToolCallsLength: O.promptLengths?.toolCalls,
          classifierUserPromptsLength: O.promptLengths?.userPrompts,
          sessionInputTokens: getTotalInputTokens(),
          sessionOutputTokens: getTotalOutputTokens(),
          sessionCacheReadInputTokens: getTotalCacheReadInputTokens(),
          sessionCacheCreationInputTokens: getTotalCacheCreationInputTokens(),
          classifierCostUSD: L,
          classifierStage: O.stage == null ? undefined : O.stage,
          classifierFailureMode: O.failureMode == null ? undefined : O.failureMode,
          classifierStage1InputTokens: O.stage1Usage?.inputTokens,
          classifierStage1OutputTokens: O.stage1Usage?.outputTokens,
          classifierStage1CacheReadInputTokens: O.stage1Usage?.cacheReadInputTokens,
          classifierStage1CacheCreationInputTokens: O.stage1Usage?.cacheCreationInputTokens,
          classifierStage1DurationMs: O.stage1DurationMs,
          classifierStage1RequestId: br(O.stage1RequestId),
          classifierStage1MsgId: br(O.stage1MsgId),
          classifierStage1CostUSD: O.stage1Usage && O.model ? wqe(O.model, O.stage1Usage) : undefined,
          classifierStage2InputTokens: O.stage2Usage?.inputTokens,
          classifierStage2OutputTokens: O.stage2Usage?.outputTokens,
          classifierStage2CacheReadInputTokens: O.stage2Usage?.cacheReadInputTokens,
          classifierStage2CacheCreationInputTokens: O.stage2Usage?.cacheCreationInputTokens,
          classifierStage2DurationMs: O.stage2DurationMs,
          classifierStage2RequestId: br(O.stage2RequestId),
          classifierStage2MsgId: br(O.stage2MsgId),
          classifierStage2CostUSD: O.stage2Usage && O.model ? wqe(O.model, O.stage2Usage) : undefined
        }), O.shouldBlock) {
          if (O.transcriptTooLong) {
            if (e.name === "Agent") {
              return {
                behavior: "allow",
                updatedInput: t,
                decisionReason: {
                  type: "mode",
                  mode: "auto"
                }
              };
            }
            if (c.shouldAvoidPermissionPrompts) {
              throw new xc("Agent aborted: auto mode classifier transcript exceeded context window in headless mode");
            }
            if (logForDebugging("Auto mode classifier transcript too long, falling back to normal permission handling", {
              level: "warn"
            }), logEvent("tengu_auto_mode_fallback_to_ask", {
              reason: "transcript_too_long",
              toolName: qi(e.name)
            }), u === "dontAsk") {
              return {
                behavior: "deny",
                decisionReason: {
                  type: "mode",
                  mode: "dontAsk"
                },
                message: hmr(e.name)
              };
            }
            return {
              ...a,
              decisionReason: {
                type: "other",
                reason: "Auto mode classifier transcript exceeded context window \u2014 falling back to manual approval (try /compact to reduce conversation size)"
              }
            };
          }
          if (O.unavailable) {
            logForDebugging("Auto mode classifier unavailable, denying with retry guidance (fail closed)", {
              level: "warn"
            });
            return {
              behavior: "deny",
              decisionReason: {
                type: "classifier",
                classifier: "auto-mode",
                reason: "Classifier unavailable"
              },
              message: Agc(e.name, O.model, O.httpStatus, O.errorKind)
            };
          }
          let F = CFl(A);
          gRt(n, F);
          logForDebugging(`Auto mode classifier blocked action: ${O.reason}`, {
            level: "warn"
          });
          let H = vhf(F, O.reason, r, e, a, n);
          if (H) {
            if (u === "dontAsk") {
              return {
                behavior: "deny",
                decisionReason: {
                  type: "mode",
                  mode: "dontAsk"
                },
                message: hmr(e.name)
              };
            }
            return H;
          }
          return {
            behavior: "deny",
            decisionReason: {
              type: "classifier",
              classifier: "auto-mode",
              reason: O.reason
            },
            message: kgc(O.reason)
          };
        }
        let P = _Xt(A);
        gRt(n, P);
        return _({
          updatedInput: a.updatedInput ?? t,
          decisionReason: {
            type: "classifier",
            classifier: "auto-mode",
            reason: O.reason
          }
        });
      }
      let g = getToolPermissionContext(n);
      if (g.shouldAvoidPermissionPrompts) {
        let y = await Shf(e, a.updatedInput ?? t, o, n, fNe(e, g), a.suggestions);
        if (y) {
          return y;
        }
        return {
          behavior: "deny",
          decisionReason: {
            type: "asyncAgent",
            reason: "Permission prompts are not available in this context"
          },
          message: xgc(e.name)
        };
      }
    }
    return a;
  };
  var oy = __lazy(() => {
    Uge();
    EI();
    Sh();
    iWe();
    X5e();
    Kpt();
    bU();
    je();
    dt();
    Rn();
    Th();
    nf();
    Zn();
    dmr();
    agc();
    Oer();
    mmr();
    _Gn();
    HT();
    Zk();
    EC();
    at();
    $n();
    Ot();
    Gu();
    B_();
    Sl();
    vo();
    d_();
    pr();
    gn();
    Sp();
    ro();
    qp();
    d2o();
    jz();
    yRt = (mmr(), __toCommonJS(Tgc));
    yhf = (xse(), __toCommonJS(Fme));
    _hf = (cFo(), __toCommonJS(lFo));
    PERMISSION_RULE_SOURCES = [...bC, "cliArg", "command", "session", "toolsNarrowing", "mcpServerPolicy"];
    bhf = new Set([]);
  });
  var UXn = {};