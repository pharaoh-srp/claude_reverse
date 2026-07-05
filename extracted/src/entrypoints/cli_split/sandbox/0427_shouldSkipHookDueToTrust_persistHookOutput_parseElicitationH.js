  __export(TOa, {
    shouldSkipHookDueToTrust: () => shouldSkipHookDueToTrust,
    persistHookOutput: () => persistHookOutput,
    parseElicitationHookOutput: () => parseElicitationHookOutput,
    isPluginEligibleForCredentials: () => isPluginEligibleForCredentials,
    isBareMcpServerMatcher: () => isBareMcpServerMatcher,
    hasInstructionsLoadedHook: () => hasInstructionsLoadedHook,
    hasHookForEvent: () => hasHookForEvent,
    hasBlockingResult: () => hasBlockingResult,
    getUserPromptSubmitHookBlockingMessage: () => getUserPromptSubmitHookBlockingMessage,
    getTelemetryHookName: () => getTelemetryHookName,
    getTeammateIdleHookMessage: () => getTeammateIdleHookMessage,
    getTaskCreatedHookMessage: () => getTaskCreatedHookMessage,
    getTaskCompletedHookMessage: () => getTaskCompletedHookMessage,
    getStopHookMessage: () => getStopHookMessage,
    getSessionEndHookTimeoutMs: () => getSessionEndHookTimeoutMs,
    getPreToolHookBlockingMessage: () => getPreToolHookBlockingMessage,
    getPluginHookCounts: () => getPluginHookCounts,
    getMatchingHooks: () => getMatchingHooks,
    getAnthropicCredentialsForOfficialPluginHook: () => getAnthropicCredentialsForOfficialPluginHook,
    flushPendingAsyncRewakeHooks: () => flushPendingAsyncRewakeHooks,
    executeWorktreeRemoveHook: () => executeWorktreeRemoveHook,
    executeWorktreeCreateHook: () => executeWorktreeCreateHook,
    executeUserPromptSubmitHooks: () => executeUserPromptSubmitHooks,
    executeUserPromptExpansionHooks: () => executeUserPromptExpansionHooks,
    executeTeammateIdleHooks: () => executeTeammateIdleHooks,
    executeTaskCreatedHooks: () => executeTaskCreatedHooks,
    executeTaskCompletedHooks: () => executeTaskCompletedHooks,
    executeSubagentStartHooks: () => executeSubagentStartHooks,
    executeStopHooks: () => executeStopHooks,
    executeStopFailureHooks: () => executeStopFailureHooks,
    executeStatusLineCommand: () => executeStatusLineCommand,
    executeSetupHooks: () => executeSetupHooks,
    executeSessionStartHooks: () => executeSessionStartHooks,
    executeSessionEndHooks: () => executeSessionEndHooks,
    executePreToolHooks: () => executePreToolHooks,
    executePreCompactHooks: () => executePreCompactHooks,
    executePostToolUseFailureHooks: () => executePostToolUseFailureHooks,
    executePostToolHooks: () => executePostToolHooks,
    executePostToolBatchHooks: () => executePostToolBatchHooks,
    executePostCompactHooks: () => executePostCompactHooks,
    executePermissionRequestHooks: () => executePermissionRequestHooks,
    executePermissionDeniedHooks: () => executePermissionDeniedHooks,
    executeNotificationHooks: () => executeNotificationHooks,
    executeMessageDisplayHooks: () => executeMessageDisplayHooks,
    executeInstructionsLoadedHooks: () => executeInstructionsLoadedHooks,
    executeHooksOutsideREPL: () => executeHooksOutsideREPL,
    executeHooks: () => executeHooks,
    executeFileSuggestionCommand: () => executeFileSuggestionCommand,
    executeFileChangedHooks: () => executeFileChangedHooks,
    executeElicitationResultHooks: () => executeElicitationResultHooks,
    executeElicitationHooks: () => executeElicitationHooks,
    executeCwdChangedHooks: () => executeCwdChangedHooks,
    executeConfigChangeHooks: () => executeConfigChangeHooks,
    emitHookMetrics: () => emitHookMetrics,
    createBaseHookInput: () => createBaseHookInput,
    applyHookSessionTitle: () => applyHookSessionTitle,
    SESSION_END_HOOK_TIMEOUT_MS_DEFAULT: () => 1500,
    HOOK_EVENT_REGISTRY: () => HOOK_EVENT_REGISTRY,
    ASYNC_REWAKE_FLUSH_TIMEOUT_MS: () => 30000
  });
  function Nfc() {
    return pmf;
  }
  async function flushPendingAsyncRewakeHooks() {
    let e = Nfc();
    if (e.size === 0) {
      return;
    }
    let t = Promise.allSettled([...e]);
    await Promise.race([t, sleep(30000, undefined, {
      unref: true
    })]);
  }
  function getSessionEndHookTimeoutMs() {
    let e = process.env.CLAUDE_CODE_SESSIONEND_HOOKS_TIMEOUT_MS;
    let t = e ? parseInt(e, 10) : NaN;
    if (Number.isFinite(t) && t > 0) {
      return t;
    }
    let n = 0;
    let r = $_() ? [] : getMainThreadAgentHooks()?.SessionEnd ?? [];
    let o = [...(U2()?.SessionEnd ?? []), ...r];
    for (let s of o) {
      for (let i of s.hooks) {
        if (i.timeout && i.timeout * 1000 > n) {
          n = i.timeout * 1000;
        }
      }
    }
    return Math.max(1500, Math.min(n, 60000));
  }
  function Ofc({
    processId: e,
    hookId: t,
    shellCommand: n,
    asyncResponse: r,
    hookEvent: o,
    hookName: s,
    command: i,
    asyncRewake: a,
    rewakeMessage: l,
    rewakeSummary: c,
    pluginId: u
  }) {
    if (a) {
      let d = n.result.then(async m => {
        await new Promise(y => setImmediate(y));
        let f = await n.taskOutput.getStdout();
        let h = n.taskOutput.getStderr();
        n.cleanup();
        L0({
          hookId: t,
          hookName: s,
          hookEvent: o,
          output: f + h,
          stdout: f,
          stderr: h,
          exitCode: m.code,
          outcome: m.code === 0 ? "success" : "error"
        });
        let g;
        if (u) {
          for (let y of f.split(`
`)) {
            let _ = y.trim();
            if (!_.startsWith("{")) {
              continue;
            }
            try {
              let b = qt(_);
              if ("async" in b) {
                continue;
              }
              if (TL(b)) {
                if (emitHookMetrics(b.metrics, u, o), typeof b.rewakeSummary === "string" && b.rewakeSummary.trim() && Jpr(u)) {
                  g = b.rewakeSummary.trim().replace(/\s+/g, " ").slice(0, 300);
                }
              }
              break;
            } catch {}
          }
        }
        if (m.code === 2) {
          let y = `Stop hook blocking error from command "${s}":`;
          let _ = "Stop hook feedback";
          if (l !== undefined) {
            y = l;
          }
          if (g !== undefined) {
            _ = g;
          } else if (c !== undefined) {
            _ = c;
          }
          let b = gR(`${y} ${h || f}`);
          ud({
            value: `<${"task-notification"}>
<${"summary"}>${$a(_)}</${"summary"}>
</${"task-notification"}>
${b}`,
            mode: "task-notification",
            agentId: mainAgentId(),
            priority: "next",
            stopHookActive: true
          });
        }
      });
      let p = Nfc();
      p.add(d);
      d.finally(() => p.delete(d));
      return true;
    }
    if (!n.background(e, {
      skipSpill: true
    })) {
      return false;
    }
    vUl({
      processId: e,
      hookId: t,
      asyncResponse: r,
      hookEvent: o,
      hookName: s,
      command: i,
      shellCommand: n,
      pluginId: u
    });
    return true;
  }
  function shouldSkipHookDueToTrust() {
    return !isProjectScopeTrustAccepted();
  }
  function createBaseHookInput(e, t, n) {
    let r = t ?? getSessionId();
    let o = n?.agentType ?? getMainThreadAgentType();
    let s = n?.options?.mainLoopModel;
    let i = n?.getAppState?.().effortValue;
    for (let l of n?.permissionLayers ?? []) {
      if (l.kind === "effort" && l.effort !== undefined) {
        i = l.effort;
      }
    }
    let a = s && n?.getAppState && sx(s) ? {
      level: r1(s, i)
    } : undefined;
    return {
      session_id: r,
      transcript_path: getTranscriptPathForSession(r),
      cwd: Nt(),
      prompt_id: getPromptId() ?? undefined,
      permission_mode: e,
      agent_id: n?.agentId,
      agent_type: o,
      effort: a
    };
  }
  function Ffc(e) {
    let t = qt(e);
    let n = pRt().safeParse(t);
    if (n.success) {
      logForDebugging("Successfully parsed and validated hook JSON output");
      dfc(t, n.data);
      return {
        json: n.data
      };
    }
    let r = n.error.issues;
    let o = r[0];
    let s = o ? `${o.path.join(".") || "(root)"}: ${o.message}` : "unknown error";
    if (t && typeof t === "object" && "hookSpecificOutput" in t && t.hookSpecificOutput && typeof t.hookSpecificOutput === "object" && !Array.isArray(t.hookSpecificOutput) && !("hookEventName" in t.hookSpecificOutput)) {
      s = 'hookSpecificOutput is missing required field "hookEventName"';
    }
    let i = r.slice(1).map(a => `  - ${a.path.join(".") || "(root)"}: ${a.message}`).join(`
`);
    return {
      validationError: `Hook JSON output validation failed \u2014 ${s}${i ? `
` + i : ""}

The hook's output was: ${De(t, null, 2)}`
    };
  }
  async function persistHookOutput(e, t, n, r = 1e4) {
    if (e.length <= r) {
      return e;
    }
    let o = await gMe(e, `hook-${t}-${n}`);
    if (_Me(o)) {
      logEvent("tengu_hook_output_persisted", {
        source: n,
        originalSizeBytes: e.length,
        persistedSizeBytes: 0,
        truncatedFallback: true
      });
      return `${e.slice(0, r)}

[Hook ${n} truncated at ${r} chars \u2014 persist-to-disk failed: ${o.error}]`;
    }
    let s = yMe(o);
    logEvent("tengu_hook_output_persisted", {
      source: n,
      originalSizeBytes: o.originalSize,
      persistedSizeBytes: s.length,
      truncatedFallback: false
    });
    return s;
  }
  function Kpr(e) {
    let t = e.trim();
    if (!t.startsWith("{")) {
      logForDebugging("Hook output does not start with {, treating as plain text");
      return {
        plainText: e
      };
    }
    try {
      let n = Ffc(t);
      if ("json" in n) {
        return n;
      }
      let r = `${n.validationError}

Expected schema:
${De({
        continue: "boolean (optional)",
        suppressOutput: "boolean (optional)",
        stopReason: "string (optional)",
        decision: '"approve" | "block" (optional)',
        reason: "string (optional)",
        systemMessage: "string (optional)",
        terminalSequence: "string (optional)",
        permissionDecision: '"allow" | "deny" | "ask" (optional)',
        hookSpecificOutput: {
          "for PreToolUse": {
            hookEventName: '"PreToolUse"',
            permissionDecision: '"allow" | "deny" | "ask" | "defer" (optional)',
            permissionDecisionReason: "string (optional)",
            updatedInput: "object (optional) - Modified tool input to use"
          },
          "for UserPromptSubmit": {
            hookEventName: '"UserPromptSubmit"',
            additionalContext: "string (required)"
          },
          "for PostToolUse": {
            hookEventName: '"PostToolUse"',
            additionalContext: "string (optional)"
          },
          "for PostToolBatch": {
            hookEventName: '"PostToolBatch"',
            additionalContext: "string (optional)"
          },
          "for Stop / SubagentStop": {
            hookEventName: '"Stop" | "SubagentStop"',
            additionalContext: "string (optional) - Feedback for the model; the conversation continues so the model can act on it"
          }
        }
      }, null, 2)}`;
      logForDebugging(r);
      return {
        plainText: e,
        validationError: r
      };
    } catch (n) {
      logForDebugging(`Failed to parse hook output as JSON: ${n}`);
      return {
        plainText: e
      };
    }
  }
  function Ufc(e) {
    let t = e.trim();
    if (t === "") {
      let n = pRt().safeParse({});
      if (n.success) {
        logForDebugging("HTTP hook returned empty body, treating as empty JSON object");
        return {
          json: n.data
        };
      }
    }
    if (!t.startsWith("{")) {
      let n = `HTTP hook must return JSON, but got non-JSON response body: ${t.length > 200 ? t.slice(0, 200) + "\u2026" : t}`;
      logForDebugging(n);
      return {
        validationError: n
      };
    }
    try {
      let n = Ffc(t);
      if ("json" in n) {
        return n;
      }
      logForDebugging(n.validationError);
      return n;
    } catch (n) {
      let r = `HTTP hook must return valid JSON, but parsing failed: ${n}`;
      logForDebugging(r);
      return {
        validationError: r
      };
    }
  }
  function zpr({
    json: e,
    command: t,
    hookName: n,
    toolUseID: r,
    hookEvent: o,
    expectedHookEvent: s,
    stdout: i,
    stderr: a,
    exitCode: l,
    durationMs: c
  }) {
    let u = {};
    let d = e;
    if (d.continue === false) {
      if (u.preventContinuation = true, d.stopReason) {
        u.stopReason = d.stopReason;
      }
    }
    if (e.decision) {
      switch (e.decision) {
        case "approve":
          u.permissionBehavior = "allow";
          break;
        case "block":
          u.permissionBehavior = "deny";
          u.blockingError = {
            blockingError: e.reason || "Blocked by hook",
            command: t
          };
          break;
        default:
          throw Error(`Unknown hook decision type: ${e.decision}. Valid types are: approve, block`);
      }
    }
    if (e.systemMessage) {
      u.systemMessage = e.systemMessage;
    }
    if (e.terminalSequence) {
      let p = jWo(e.terminalSequence);
      if (p !== null) {
        u.terminalSequence = p;
      } else {
        logForDebugging(`Hook ${n} (${o}) returned a terminalSequence that was rejected by the allowlist (only OSC 0/1/2/9/99/777 and BEL are permitted, and OSC 9 bodies may not begin with a digit unless in the 9;4 progress form)`);
      }
    }
    if (e.hookSpecificOutput?.hookEventName === "PreToolUse" && e.hookSpecificOutput.permissionDecision) {
      switch (e.hookSpecificOutput.permissionDecision) {
        case "allow":
          u.permissionBehavior = "allow";
          break;
        case "deny":
          u.permissionBehavior = "deny";
          u.blockingError = {
            blockingError: e.reason || "Blocked by hook",
            command: t
          };
          break;
        case "ask":
          u.permissionBehavior = "ask";
          break;
        case "defer":
          u.permissionBehavior = "defer";
          break;
        default:
          throw Error(`Unknown hook permissionDecision type: ${e.hookSpecificOutput.permissionDecision}. Valid types are: allow, deny, ask, defer`);
      }
    }
    if (u.permissionBehavior !== undefined && e.reason !== undefined) {
      u.hookPermissionDecisionReason = e.reason;
    }
    if (e.hookSpecificOutput) {
      if (s && e.hookSpecificOutput.hookEventName !== s) {
        throw Error(`Hook returned incorrect event name: expected '${s}' but got '${e.hookSpecificOutput.hookEventName}'. Full stdout: ${De(e, null, 2)}`);
      }
      switch (e.hookSpecificOutput.hookEventName) {
        case "PreToolUse":
          if (e.hookSpecificOutput.permissionDecision) {
            switch (e.hookSpecificOutput.permissionDecision) {
              case "allow":
                u.permissionBehavior = "allow";
                break;
              case "deny":
                u.permissionBehavior = "deny";
                u.blockingError = {
                  blockingError: e.hookSpecificOutput.permissionDecisionReason || e.reason || "Blocked by hook",
                  command: t
                };
                break;
              case "ask":
                u.permissionBehavior = "ask";
                break;
              case "defer":
                u.permissionBehavior = "defer";
                break;
            }
          }
          if (u.hookPermissionDecisionReason = e.hookSpecificOutput.permissionDecisionReason, e.hookSpecificOutput.updatedInput) {
            u.updatedInput = e.hookSpecificOutput.updatedInput;
          }
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "UserPromptSubmit":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          u.sessionTitle = e.hookSpecificOutput.sessionTitle;
          u.suppressOriginalPrompt = e.hookSpecificOutput.suppressOriginalPrompt;
          break;
        case "UserPromptExpansion":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "SessionStart":
          if (u.additionalContext = e.hookSpecificOutput.additionalContext, u.initialUserMessage = e.hookSpecificOutput.initialUserMessage, u.sessionTitle = e.hookSpecificOutput.sessionTitle, "watchPaths" in e.hookSpecificOutput && e.hookSpecificOutput.watchPaths) {
            u.watchPaths = e.hookSpecificOutput.watchPaths;
          }
          u.reloadSkills = e.hookSpecificOutput.reloadSkills;
          break;
        case "Setup":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "SubagentStart":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "PostToolUse":
          if (u.additionalContext = e.hookSpecificOutput.additionalContext, e.hookSpecificOutput.updatedToolOutput !== undefined) {
            u.updatedToolOutput = e.hookSpecificOutput.updatedToolOutput;
          }
          if (e.hookSpecificOutput.updatedMCPToolOutput) {
            u.updatedMCPToolOutput = e.hookSpecificOutput.updatedMCPToolOutput;
          }
          break;
        case "PostToolUseFailure":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "PostToolBatch":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "Stop":
        case "SubagentStop":
          u.additionalContext = e.hookSpecificOutput.additionalContext;
          break;
        case "PermissionDenied":
          u.retry = e.hookSpecificOutput.retry;
          break;
        case "PermissionRequest":
          if (e.hookSpecificOutput.decision) {
            if (u.permissionRequestResult = e.hookSpecificOutput.decision, u.permissionBehavior = e.hookSpecificOutput.decision.behavior === "allow" ? "allow" : "deny", e.hookSpecificOutput.decision.behavior === "allow" && e.hookSpecificOutput.decision.updatedInput) {
              u.updatedInput = e.hookSpecificOutput.decision.updatedInput;
            }
          }
          break;
        case "Elicitation":
          if (e.hookSpecificOutput.action) {
            if (u.elicitationResponse = {
              action: e.hookSpecificOutput.action,
              content: e.hookSpecificOutput.content
            }, e.hookSpecificOutput.action === "decline") {
              u.blockingError = {
                blockingError: e.reason || "Elicitation denied by hook",
                command: t
              };
            }
          }
          break;
        case "ElicitationResult":
          if (e.hookSpecificOutput.action) {
            if (u.elicitationResultResponse = {
              action: e.hookSpecificOutput.action,
              content: e.hookSpecificOutput.content
            }, e.hookSpecificOutput.action === "decline") {
              u.blockingError = {
                blockingError: e.reason || "Elicitation result blocked by hook",
                command: t
              };
            }
          }
          break;
        case "MessageDisplay":
          u.displayContent = e.hookSpecificOutput.displayContent;
          break;
      }
    }
    return {
      ...u,
      message: u.blockingError ? createAttachmentMessage({
        type: "hook_blocking_error",
        hookName: n,
        toolUseID: r,
        hookEvent: o,
        blockingError: u.blockingError
      }) : createAttachmentMessage({
        type: "hook_success",
        hookName: n,
        toolUseID: r,
        hookEvent: o,
        content: "",
        stdout: i,
        stderr: a,
        exitCode: l,
        command: t,
        durationMs: c
      })
    };
  }
  async function Ypr(e, t, n, r, o, s, i, a, l, c, u, d) {
    let p = t === "SessionStart" || t === "Setup" || t === "SessionEnd";
    let m = Date.now();
    let f;
    let h = false;
    let g = Wt() === "windows";
    let y = e.shell ?? w9e();
    let _ = y === "powershell";
    let b = e.args !== undefined;
    if (b && /\s/.test(e.command) && !/[\\/]/.test(e.command)) {
      logForDebugging(`Hook command "${e.command}" has both "args" and whitespace in "command". Exec form treats "command" as a single executable name; move the rest into "args". Example: { "command": "node", "args": ["script.js"] }.`, {
        level: "warn"
      });
    }
    let S = g && !_ && !b ? Te => Te.replaceAll("\\", "/") : Te => Te;
    let E = getProjectRoot();
    let C = e.command;
    let x;
    if (!b && _) {
      if (C = wmf(C), /\$CLAUDE_PROJECT_DIR\b/.test(C)) {
        logForDebugging(`PowerShell hook command references $CLAUDE_PROJECT_DIR, which PowerShell reads as an undefined variable ($null). Use $env:CLAUDE_PROJECT_DIR or \${CLAUDE_PROJECT_DIR} instead. Command: ${C}`, {
          level: "warn"
        });
      }
    }
    for (let [Te, ue] of [["CLAUDE_PLUGIN_ROOT", l || u], ["CLAUDE_PLUGIN_DATA", l]]) {
      if (ue) {
        continue;
      }
      let ce = "${" + Te + "}";
      if (!e.command.includes(ce) && !e.args?.some(pe => pe.includes(ce))) {
        continue;
      }
      let le = mCe(e);
      throw Error(u ? `Hook command references \${${Te}} but only \${CLAUDE_PLUGIN_ROOT} is available for skill hooks (\${CLAUDE_PLUGIN_DATA} is plugin-only). Command: ${le}` : `Hook command references \${${Te}} but the hook is not associated with a plugin. This variable is only available in hooks defined in a plugin's hooks/hooks.json file, not in settings.json. Command: ${le}`);
    }
    if (l) {
      if (!(await ad(l))) {
        throw Error(`Plugin directory does not exist: ${l}` + (c ? ` (${c} \u2014 run /plugin to reinstall)` : ""));
      }
      if (c) {
        x = W1(c);
      }
      if (!b && x) {
        C = mEe(C, x);
      }
    }
    let A;
    if (e.args !== undefined) {
      let Te = l ?? u;
      let ue = l && c ? c : undefined;
      let ce = le => {
        if (!le.includes("${")) {
          return le;
        }
        if (le = le.replaceAll("${CLAUDE_PROJECT_DIR}", () => E), Te) {
          le = le.replaceAll("${CLAUDE_PLUGIN_ROOT}", () => Te);
        }
        if (ue) {
          le = le.replaceAll("${CLAUDE_PLUGIN_DATA}", () => lTe(ue));
        }
        if (x) {
          le = mEe(le, x);
        }
        return le;
      };
      A = [ce(e.command), e.args.map(ce)];
    }
    let k = mCe(e);
    if (g && !_ && !b) {
      C = Zhn(C);
    }
    let I = !_ && !b && process.env.CLAUDE_CODE_SHELL_PREFIX ? gqn(process.env.CLAUDE_CODE_SHELL_PREFIX, C) : C;
    let O = e.timeout ? e.timeout * 1000 : 600000;
    let M = {
      ...subprocessEnv(),
      ...vmt(o),
      CLAUDE_PROJECT_DIR: S(E)
    };
    let {
      columns: L,
      rows: P
    } = process.stdout;
    if (L) {
      M.COLUMNS = String(L);
    }
    if (P) {
      M.LINES = String(P);
    }
    if (l) {
      if (M.CLAUDE_PLUGIN_ROOT = S(l), c) {
        M.CLAUDE_PLUGIN_DATA = S(lTe(c));
      }
    }
    if (Object.assign(M, getAnthropicCredentialsForOfficialPluginHook(c)), x) {
      for (let [Te, ue] of Object.entries(x)) {
        let ce = Te.replace(/[^A-Za-z0-9_]/g, "_").toUpperCase();
        M[`CLAUDE_PLUGIN_OPTION_${ce}`] = String(ue);
      }
    }
    if (u) {
      M.CLAUDE_PLUGIN_ROOT = S(u);
    }
    if (!_ && (t === "SessionStart" || t === "Setup" || t === "CwdChanged" || t === "FileChanged") && a !== undefined) {
      M.CLAUDE_ENV_FILE = await Zga(t, a);
    }
    let F = Nt();
    let H = (await ad(F)) ? F : getOriginalCwd();
    if (H !== F) {
      logForDebugging(`Hooks: cwd ${F} not found, falling back to original cwd`, {
        level: "warn"
      });
    }
    let U = !g;
    let N;
    if (A) {
      N = Vpr.spawn(A[0], A[1], {
        env: M,
        cwd: H,
        detached: U,
        windowsHide: true
      });
    } else if (y === "powershell") {
      let Te = await qV();
      if (!Te) {
        throw Error(`Hook "${e.command}" has shell: 'powershell' but no PowerShell executable (pwsh or powershell) was found on PATH. Install PowerShell, or remove "shell": "powershell" to use bash.`);
      }
      N = Vpr.spawn(Te, gGt(I), {
        env: M,
        cwd: H,
        detached: U,
        windowsHide: true
      });
    } else {
      let Te = g ? Cye() : null;
      if (g && !Te) {
        throw Error(`Hook "${e.command}" requires bash but Git Bash was not found. Install Git for Windows (https://git-scm.com/downloads/win), or add "shell": "powershell" to this hook's config.`);
      }
      let ue = g ? Te : true;
      if (g && Te) {
        Qhn(M, Te);
      }
      N = Vpr.spawn(I, [], {
        env: M,
        cwd: H,
        shell: ue,
        detached: U,
        windowsHide: true
      });
    }
    let W = new Db(`hook_${N.pid}`, null);
    let j = Tqn(N, s, O, W);
    let z = false;
    let V = false;
    let K = !getIsNonInteractiveSession() || getHasStreamingInput();
    if ((e.async || e.asyncRewake && K) && !d) {
      let Te = `async_hook_${N.pid}`;
      logForDebugging(`Hooks: Config-based async hook, backgrounding process ${Te}`);
      let ue = le => {
        logForDebugging(`Async hook stdin write failed (${en(le) ?? le}); hook command likely exited without reading stdin`);
      };
      N.stdin.on("error", ue);
      try {
        N.stdin.write(r + `
`, "utf8");
        N.stdin.end();
      } catch (le) {
        ue(le);
      }
      if (V = true, Ofc({
        processId: Te,
        hookId: i,
        shellCommand: j,
        asyncResponse: {
          async: true,
          asyncTimeout: O
        },
        hookEvent: t,
        hookName: n,
        command: k,
        asyncRewake: e.asyncRewake,
        rewakeMessage: e.rewakeMessage,
        rewakeSummary: e.rewakeSummary,
        pluginId: c
      })) {
        return {
          stdout: "",
          stderr: "",
          output: "",
          status: 0,
          backgrounded: true
        };
      }
    }
    let J = "";
    let Q = "";
    let Z = "";
    N.stdout.setEncoding("utf8");
    N.stderr.setEncoding("utf8");
    let ne = false;
    let oe = null;
    let ee = new Promise(Te => {
      oe = Te;
    });
    N.stdout.on("data", Te => {
      if (J += Te, Z += Te, !ne) {
        let ue = Ad(J).trim();
        if (!ue.includes("}")) {
          return;
        }
        ne = true;
        logForDebugging(`Hooks: Checking first line for async: ${ue}`);
        try {
          let ce = qt(ue);
          if (logForDebugging(`Hooks: Parsed initial response: ${De(ce)}`), mhe(ce) && !d) {
            let le = `async_hook_${N.pid}`;
            if (logForDebugging(`Hooks: Detected async hook, backgrounding process ${le}`), Ofc({
              processId: le,
              hookId: i,
              shellCommand: j,
              asyncResponse: ce,
              hookEvent: t,
              hookName: n,
              command: k,
              pluginId: c
            })) {
              z = true;
              oe?.({
                stdout: J,
                stderr: Q,
                output: Z,
                status: 0
              });
            }
          } else if (mhe(ce) && d) {
            logForDebugging("Hooks: Detected async hook but forceSyncExecution is true, waiting for completion");
          } else {
            logForDebugging("Hooks: Initial response is not async, continuing normal processing");
          }
        } catch (ce) {
          logForDebugging(`Hooks: Failed to parse initial response as JSON: ${ce}`);
        }
      }
    });
    N.stderr.on("data", Te => {
      Q += Te;
      Z += Te;
    });
    let re = tor({
      hookId: i,
      hookName: n,
      hookEvent: t,
      getOutput: async () => ({
        stdout: J,
        stderr: Q,
        output: Z
      })
    });
    let se = new Promise(Te => {
      N.stdout.on("end", () => Te());
    });
    let ae = new Promise(Te => {
      N.stderr.on("end", () => Te());
    });
    let de = V ? Promise.resolve() : new Promise((Te, ue) => {
      N.stdin.on("error", ce => {
        ue(ce);
      });
      N.stdin.write(r + `
`, "utf8");
      N.stdin.end();
      Te();
    });
    let be = new Promise((Te, ue) => {
      N.on("error", ue);
    });
    let fe = false;
    N.on("exit", () => {
      if (!s.aborted) {
        fe = true;
      }
    });
    let me = new Promise(Te => {
      let ue = null;
      N.on("close", ce => {
        ue = ce ?? 1;
        Promise.all([se, ae]).then(() => {
          Te({
            stdout: J,
            stderr: Q,
            output: Z,
            status: ue,
            aborted: s.aborted && !fe
          });
        });
      });
    });
    try {
      if (p) {
        wn("info", "hook_spawn_started", {
          hook_event_name: t,
          index: a
        });
      }
      await Promise.race([de, be]);
      let Te = await Promise.race([ee, me, be]);
      f = Te.status;
      h = Te.aborted ?? false;
      return {
        ...Te,
        stdout: Bjn(Te.stdout),
        stderr: Bjn(Te.stderr),
        output: Bjn(Te.output)
      };
    } catch (Te) {
      let ue = en(Te);
      if (f = 1, ue === "EPIPE") {
        logForDebugging("EPIPE error while writing to hook stdin (hook command likely closed early)");
        let ce = "Hook command closed stdin before hook input was fully written (EPIPE)";
        return {
          stdout: "",
          stderr: ce,
          output: ce,
          status: 1
        };
      } else if (ue === "ABORT_ERR") {
        h = true;
        return {
          stdout: "",
          stderr: "Hook cancelled",
          output: "Hook cancelled",
          status: 1,
          aborted: true
        };
      } else {
        let ce = he(Te);
        logForDebugging(`Hook command failed to spawn (${n}): ${ce}`, {
          level: "error"
        });
        let le = `Error occurred while executing hook command: ${ce}`;
        return {
          stdout: "",
          stderr: le,
          output: le,
          status: 1,
          spawnFailed: true
        };
      }
    } finally {
      if (p) {
        wn("info", "hook_spawn_completed", {
          hook_event_name: t,
          index: a,
          duration_ms: Date.now() - m,
          exit_code: f,
          aborted: h
        });
      }
      if (re(), !z) {
        j.cleanup();
      }
    }
  }
  function isBareMcpServerMatcher(e) {
    if (!/^[a-zA-Z0-9_|, -]+$/.test(e)) {
      return false;
    }
    return e.split(/[|,]/).map(t => t.trim()).some(t => t.startsWith("mcp__") && !t.slice(5).includes("__"));
  }
  function gmf(e, t) {
    if (!t || !hmf.vZc(e)) {
      return;
    }
    let n = getBareMcpServerMatchersWarned();
    if (n.vZc(t) || !isBareMcpServerMatcher(t)) {
      return;
    }
    n.add(t);
    let r = t.split(/[|,]/).map(o => o.trim()).find(o => o.startsWith("mcp__") && !o.slice(5).includes("__")) ?? t;
    logForDebugging(`Hook matcher \`${r}\` matches no tool (it is compared as an exact string). To match all tools from this server, use \`${r}__.*\`. See CHANGELOG v2.1.195.`, {
      level: "warn"
    });
  }
  function ymf(e, t, n, r) {
    if (!t || t === "*") {
      return true;
    }
    if ((n ? /^[a-zA-Z0-9_|, -]+$/ : /^[a-zA-Z0-9_|]+$/).test(t)) {
      return t.split(n ? /[|,]/ : "|").map(i => i.trim()).filter(Boolean).flatMap(i => xyn(jD(i), r)).includes(e);
    }
    try {
      let s = new RegExp(t);
      if (s.test(e)) {
        return true;
      }
      for (let i of Cyn(e)) {
        if (s.test(i)) {
          return true;
        }
      }
      for (let i of kyn(e, r)) {
        if (s.test(i)) {
          return true;
        }
      }
      return false;
    } catch {
      logForDebugging(`Invalid regex pattern in hook matcher: ${t}`);
      return false;
    }
  }
  async function _mf(e, t) {
    if (e.hook_event_name !== "PreToolUse" && e.hook_event_name !== "PostToolUse" && e.hook_event_name !== "PostToolUseFailure" && e.hook_event_name !== "PermissionRequest" && e.hook_event_name !== "PermissionDenied") {
      return;
    }
    let n = jD(e.tool_name);
    let r = t && Cl(t, e.tool_name);
    let o = r?.inputSchema.safeParse(e.tool_input);
    let s = o?.success && r?.preparePermissionMatcher ? await r.preparePermissionMatcher(o.data) : undefined;
    return i => {
      let a = Nh(i);
      if (jD(a.toolName) !== n) {
        return false;
      }
      if (!a.ruleContent) {
        return true;
      }
      return s ? s(a.ruleContent) : false;
    };
  }
  function $fc(e) {
    return e.hook.type === "callback" && e.hook.internal === true;
  }
  function cnn(e, t) {
    return `${e.pluginRoot ?? e.skillRoot ?? ""}\x00${t}`;
  }
  function Jpr(e) {
    let t = e.lastIndexOf("@");
    if (t <= 0) {
      return false;
    }
    let n = e.slice(t + 1);
    if (Fke.vZc(n)) {
      return true;
    }
    return false;
  }
  function getPluginHookCounts(e) {
    let t = e.filter(r => r.pluginId);
    if (t.length === 0) {
      return;
    }
    let n = {};
    for (let r of t) {
      let o = Jpr(r.pluginId) ? r.pluginId : "third-party";
      n[o] = (n[o] || 0) + 1;
    }
    return n;
  }
  function isPluginEligibleForCredentials(e) {
    if (!Jpr(e)) {
      return false;
    }
    let t = e.lastIndexOf("@");
    let n = e.slice(0, t);
    return (getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_lattice", {}).plugins ?? []).includes(n);
  }
  function getAnthropicCredentialsForOfficialPluginHook(e) {
    if (!e || !isPluginEligibleForCredentials(e)) {
      return {};
    }
    if (!isFirstPartyProvider()) {
      return {};
    }
    if (Vi()) {
      return {};
    }
    if (process.env.ANTHROPIC_UNIX_SOCKET) {
      return {};
    }
    try {
      if (isClaudeAISubscriber()) {
        let n = getClaudeAIOAuthTokens()?.accessToken;
        return n ? {
          ANTHROPIC_AUTH_TOKEN: n
        } : {};
      }
      let t = getAnthropicApiKey();
      return t ? {
        ANTHROPIC_API_KEY: t
      } : {};
    } catch {
      return {};
    }
  }
  function emitHookMetrics(e, t, n) {
    if (!e || !t) {
      return;
    }
    if (!Jpr(t)) {
      return;
    }
    let r = Object.entries(e).slice(0, 20).filter(([, o]) => typeof o === "boolean" || typeof o === "number");
    logEvent("tengu_hook_plugin_metrics", {
      ...Object.fromEntries(r),
      pluginId: t,
      hookEvent: n
    });
    su("hook_plugin_metrics", {
      ...Object.fromEntries(r),
      plugin_id: t,
      hook_event: n
    });
  }
  function qfc(e) {
    let t = {};
    for (let n of e) {
      t[n.hook.type] = (t[n.hook.type] || 0) + 1;
    }
    return t;
  }
  function Smf(e, t, n) {
    let r = Pc("hooks");
    let o = r ? [] : [...(U2()?.[n] ?? [])];
    let s = $_();
    let i = s && !Ql() ? AJ() : null;
    if (!r && !s) {
      let l = getMainThreadAgentHooks()?.[n];
      if (l) {
        for (let c of l) {
          o.push(c);
        }
      }
    }
    let a = r ? undefined : getRegisteredHooks()?.[n];
    if (a) {
      for (let l of a) {
        if (s && "pluginRoot" in l && !i?.vZc(l.pluginId)) {
          continue;
        }
        o.push(l);
      }
    }
    if (!Zce() && e !== undefined) {
      let l = ILe(e, t, n).get(n);
      if (l) {
        for (let c of l) {
          o.push(c);
        }
      }
    }
    if (!Zce() && e !== undefined) {
      let l = VEl(e, t, n).get(n);
      if (l) {
        for (let c of l) {
          o.push(c);
        }
      }
    }
    return o;
  }
  function hasHookForEvent(e, t, n) {
    let r = U2()?.[e];
    if (r && r.length > 0) {
      return true;
    }
    if (!$_()) {
      let s = getMainThreadAgentHooks()?.[e];
      if (s && s.length > 0) {
        return true;
      }
    }
    let o = getRegisteredHooks()?.[e];
    if (o && o.length > 0) {
      return true;
    }
    if (t?.sessionHooks.get(n)?.hooks[e]) {
      return true;
    }
    return false;
  }
  async function getMatchingHooks(e, t, n, r, o) {
    try {
      let s = Smf(e, t, n);
      let i = undefined;
      switch (r.hook_event_name) {
        case "PreToolUse":
        case "PostToolUse":
        case "PostToolUseFailure":
        case "PermissionRequest":
        case "PermissionDenied":
          i = r.tool_name;
          break;
        case "UserPromptExpansion":
          i = r.command_name;
          break;
        case "SessionStart":
          i = r.source;
          break;
        case "Setup":
          i = r.trigger;
          break;
        case "PreCompact":
        case "PostCompact":
          i = r.trigger;
          break;
        case "Notification":
          i = r.notification_type;
          break;
        case "SessionEnd":
          i = r.reason;
          break;
        case "StopFailure":
          i = r.error;
          break;
        case "SubagentStart":
          i = r.agent_type;
          break;
        case "SubagentStop":
          i = r.agent_type;
          break;
        case "TeammateIdle":
        case "TaskCreated":
        case "TaskCompleted":
          break;
        case "Elicitation":
          i = r.mcp_server_name;
          break;
        case "ElicitationResult":
          i = r.mcp_server_name;
          break;
        case "ConfigChange":
          i = r.source;
          break;
        case "InstructionsLoaded":
          i = r.load_reason;
          break;
        case "FileChanged":
          i = Mfc.basename(r.file_path);
          break;
        default:
          break;
      }
      let a = fmf.vZc(r.hook_event_name);
      for (let A of s) {
        gmf(n, A.matcher);
      }
      logForDebugging(`Getting matching hook commands for ${n} with query: ${i}`, {
        level: "verbose"
      });
      logForDebugging(`Found ${s.length} hook matchers in settings`, {
        level: "verbose"
      });
      let l = e?.toolPermissionContext.toolAliases;
      let u = (i ? s.filter(A => !A.matcher || ymf(i, A.matcher, a, l)) : s).flatMap(A => {
        let k = "pluginRoot" in A ? A.pluginRoot : undefined;
        let I = "pluginId" in A ? A.pluginId : undefined;
        let O = "skillRoot" in A ? A.skillRoot : undefined;
        let M = k ? "pluginName" in A ? `plugin:${A.pluginName}` : "plugin" : O ? "skillName" in A ? `skill:${A.skillName}` : "skill" : "settings";
        let L = !A.matcher || A.matcher === "*" || A.matcher === ".*";
        return A.hooks.map(P => ({
          hook: P,
          pluginRoot: k,
          pluginId: I,
          skillRoot: O,
          hookSource: M,
          matcherIsMatchAll: L
        }));
      });
      if (u.every(A => A.hook.type === "callback" || A.hook.type === "function")) {
        return u;
      }
      let d = A => A.if ?? "";
      let p = Array.from(new Map(u.filter(A => A.hook.type === "command").map(A => [cnn(A, `${A.hook.shell ?? w9e()}\x00${A.hook.command}\x00${De(A.hook.args ?? null)}\x00${d(A.hook)}`), A])).values());
      let m = Array.from(new Map(u.filter(A => A.hook.type === "prompt").map(A => [cnn(A, `${A.hook.prompt}\x00${d(A.hook)}`), A])).values());
      let f = Array.from(new Map(u.filter(A => A.hook.type === "agent").map(A => [cnn(A, `${A.hook.prompt}\x00${d(A.hook)}`), A])).values());
      let h = Array.from(new Map(u.filter(A => A.hook.type === "http").map(A => [cnn(A, `${A.hook.url}\x00${d(A.hook)}`), A])).values());
      let g = Array.from(new Map(u.filter(A => A.hook.type === "mcp_tool").map(A => {
        let k = A.hook;
        return [cnn(A, `${k.server}\x00${k.tool}\x00${De(k.input ?? {})}\x00${d(k)}`), A];
      })).values());
      let y = u.filter(A => A.hook.type === "callback");
      let _ = u.filter(A => A.hook.type === "function");
      let b = [...p, ...m, ...f, ...h, ...g, ...y, ..._];
      let E = b.some(A => (A.hook.type === "command" || A.hook.type === "prompt" || A.hook.type === "agent" || A.hook.type === "http" || A.hook.type === "mcp_tool") && A.hook.if) ? await _mf(r, o) : undefined;
      let C = b.filter(A => {
        if (A.hook.type !== "command" && A.hook.type !== "prompt" && A.hook.type !== "agent" && A.hook.type !== "http" && A.hook.type !== "mcp_tool") {
          return true;
        }
        let k = A.hook.if;
        if (!k) {
          return true;
        }
        if (!E) {
          logForDebugging(`Hook if condition "${k}" cannot be evaluated for non-tool event ${r.hook_event_name}`);
          return false;
        }
        if (E(k)) {
          return true;
        }
        logForDebugging(`Skipping hook due to if condition "${k}" not matching`);
        return false;
      });
      let x = n === "SessionStart" || n === "Setup" ? C.filter(A => {
        if (A.hook.type === "http") {
          logForDebugging(`Skipping HTTP hook ${A.hook.url} \u2014 HTTP hooks are not supported for ${n}`);
          return false;
        }
        return true;
      }) : C;
      logForDebugging(`Matched ${x.length} unique hooks for query "${i || "no match query"}" (${u.length} before deduplication)`, {
        level: "verbose"
      });
      return x;
    } catch {
      return [];
    }
  }
  function getPreToolHookBlockingMessage(e, t) {
    return `${e} hook error: ${t.blockingError}`;
  }
  function getStopHookMessage(e) {
    return `Stop hook feedback:
${e.blockingError}`;
  }
  function getTeammateIdleHookMessage(e) {
    return `TeammateIdle hook feedback:
${e.blockingError}`;
  }
  function getTaskCreatedHookMessage(e) {
    return `TaskCreated hook feedback:
${e.blockingError}`;
  }
  function getTaskCompletedHookMessage(e) {
    return `TaskCompleted hook feedback:
${e.blockingError}`;
  }
  function getUserPromptSubmitHookBlockingMessage(e) {
    return `UserPromptSubmit operation blocked by hook:
${e.blockingError}`;
  }
  function Dfc(e, t) {
    let n = getSurfacedHookSpawnFailures();
    let r = `${e}:${t}`;
    if (n.vZc(r)) {
      return false;
    }
    n.add(r);
    return true;
  }
  async function* executeHooks({
    hookInput: e,
    extendedHookInput: t,
    toolUseID: n,
    matchQuery: r,
    signal: o,
    timeoutMs: s = Ep,
    toolUseContext: i,
    getAppState: a,
    messages: l,
    forceSyncExecution: c,
    suppressPerInvocationTelemetry: u
  }) {
    if (rq()) {
      return;
    }
    let d = e.hook_event_name;
    let p = r ? `${d}:${r}` : d;
    if (shouldSkipHookDueToTrust()) {
      logForDebugging(`Skipping ${p} hook execution - workspace trust not accepted`);
      return;
    }
    let m = i ? i.getAppState() : a?.();
    let f = i?.agentId ?? getSessionId();
    let h = await getMatchingHooks(m, f, d, e, i?.options?.tools);
    if (h.length === 0) {
      return;
    }
    if (o?.aborted) {
      return;
    }
    let g = h.filter(N => !$fc(N));
    if (g.length > 0) {
      if (!u) {
        let N = getPluginHookCounts(g);
        let W = qfc(g);
        let j = Bn(g, z => z.matcherIsMatchAll);
        logEvent("tengu_run_hook", {
          hookName: p,
          numCommands: g.length,
          numMatchAllMatchers: j,
          numSpecificMatchers: g.length - j,
          hookTypeCounts: De(W),
          ...(N && {
            pluginHookCounts: De(N)
          })
        });
      }
    } else {
      let N = Date.now();
      let W = i ? {
        getAppState: i.getAppState,
        applyAttributionOp: i.applyAttributionOp
      } : undefined;
      for (let [z, {
        hook: V
      }] of h.entries()) {
        if (V.type === "callback") {
          await V.callback(e, n, o, z, W);
        }
      }
      let j = Date.now() - N;
      getStatsStore()?.observe("hook_duration_ms", j);
      logEvent("tengu_repl_hook_finished", {
        hookName: p,
        numCommands: h.length,
        numSuccess: h.length,
        numBlocking: 0,
        numNonBlockingError: 0,
        numCancelled: 0,
        totalDurationMs: j
      });
      return;
    }
    let y = Tx() && bh();
    let _ = y || Gde() ? De(vmf(h)) : "[]";
    let b = getTelemetryHookName(d, r);
    if (!u) {
      su("hook_execution_start", {
        hook_event: d,
        hook_name: b,
        num_hooks: String(h.length),
        managed_only: String(Zce()),
        hook_source: Zce() ? "policySettings" : "merged",
        safe_mode: String(Ql()),
        ...(y && {
          hook_definitions: _
        })
      });
    }
    let S = u ? undefined : X0a(d, b, h.length, _);
    for (let {
      hook: N
    } of h) {
      yield {
        message: {
          type: "progress",
          data: {
            type: "hook_progress",
            hookEvent: d,
            hookName: p,
            command: RH(N),
            ...(N.type === "prompt" && {
              promptText: N.prompt
            }),
            ...("statusMessage" in N && N.statusMessage != null && {
              statusMessage: N.statusMessage
            })
          },
          parentToolUseID: n,
          toolUseID: n,
          timestamp: new Date().toISOString(),
          uuid: MJe.randomUUID()
        }
      };
    }
    let E = Date.now();
    let C;
    let x;
    function A(N) {
      if (C !== undefined) {
        return C;
      }
      try {
        return C = {
          ok: true,
          value: De(e)
        };
      } catch (W) {
        Oe($o(Error(`Failed to stringify hook ${p} input`, {
          cause: W
        }), "Failed to stringify hook input"));
        return C = {
          ok: false,
          error: W
        };
      }
    }
    let k = h.map(async function* ({
      hook: N,
      pluginRoot: W,
      pluginId: j,
      skillRoot: z
    }, V) {
      if (N.type === "callback") {
        let re = N.timeout ? N.timeout * 1000 : s;
        let {
          signal: se,
          cleanup: ae
        } = jO(o, {
          timeoutMs: re
        });
        yield Emf({
          toolUseID: n,
          hook: N,
          hookEvent: d,
          hookInput: e,
          signal: se,
          hookIndex: V,
          toolUseContext: i
        }).finally(ae);
        return;
      }
      if (N.type === "function") {
        if (!l) {
          yield {
            message: createAttachmentMessage({
              type: "hook_error_during_execution",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              content: "Messages not provided for function hook"
            }),
            outcome: "non_blocking_error",
            hook: N
          };
          return;
        }
        yield Tmf({
          hook: N,
          messages: l,
          hookName: p,
          toolUseID: n,
          hookEvent: d,
          timeoutMs: s,
          signal: o
        });
        return;
      }
      let K = N.timeout ? N.timeout * 1000 : s;
      let {
        signal: J,
        cleanup: Q
      } = jO(o, {
        timeoutMs: K
      });
      let Z = MJe.randomUUID();
      let ne = Date.now();
      let oe = RH(N);
      let ee = mCe(N);
      try {
        let re = A(j);
        if (!re.ok) {
          yield {
            message: createAttachmentMessage({
              type: "hook_error_during_execution",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              content: `Failed to prepare hook input: ${he(re.error)}`,
              command: oe,
              durationMs: Date.now() - ne
            }),
            outcome: "non_blocking_error",
            hook: N
          };
          Q();
          return;
        }
        let se = re.value;
        if (N.type === "prompt") {
          if (!i) {
            throw Error(`prompt-type hooks are not supported for ${d} events (no conversation context is available). Use a command-type hook instead.`);
          }
          if (i.agentId?.startsWith("hook-agent-")) {
            Q();
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: p,
                toolUseID: n,
                hookEvent: d
              }),
              outcome: "cancelled",
              hook: N
            };
            return;
          }
          let Te = await ofc(N, p, d, se, J, i, l, n);
          if (Te.message?.type === "attachment") {
            let ue = Te.message.attachment;
            if (ue.type === "hook_success" || ue.type === "hook_non_blocking_error") {
              ue.command = oe;
              ue.durationMs = Date.now() - ne;
            }
          }
          yield Te;
          Q?.();
          return;
        }
        if (N.type === "agent") {
          if (!i) {
            throw Error(`agent-type hooks are not supported for ${d} events (no conversation context is available). Use a command-type hook instead.`);
          }
          if (i.agentId?.startsWith("hook-agent-")) {
            Q();
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: p,
                toolUseID: n,
                hookEvent: d
              }),
              outcome: "cancelled",
              hook: N
            };
            return;
          }
          let Te = await afc(N, p, d, se, J, i, n, "agent_type" in e ? e.agent_type : undefined);
          if (Te.message?.type === "attachment") {
            let ue = Te.message.attachment;
            if (ue.type === "hook_success" || ue.type === "hook_non_blocking_error") {
              ue.command = oe;
              ue.durationMs = Date.now() - ne;
            }
          }
          yield Te;
          Q?.();
          return;
        }
        if (N.type === "http") {
          eor(Z, p, d);
          let Te = await Rzo(N, d, se, o, s);
          if (Q?.(), Te.aborted) {
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: "Hook cancelled",
              stdout: "",
              stderr: "",
              exitCode: undefined,
              outcome: "cancelled"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                timedOut: !o?.aborted,
                timeoutMs: N.timeout ? N.timeout * 1000 : s
              }),
              outcome: "cancelled",
              hook: N
            };
            return;
          }
          if (Te.error || !Te.ok) {
            let le = Te.error || `HTTP ${Te.statusCode} from ${N.url}`;
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: le,
              stdout: "",
              stderr: le,
              exitCode: Te.statusCode,
              outcome: "error"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_non_blocking_error",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                stderr: le,
                stdout: "",
                exitCode: Te.statusCode ?? 0
              }),
              outcome: "non_blocking_error",
              hook: N
            };
            return;
          }
          let {
            json: ue,
            validationError: ce
          } = Ufc(Te.body);
          if (ce) {
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: Te.body,
              stdout: Te.body,
              stderr: ce,
              exitCode: Te.statusCode,
              outcome: "error"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_non_blocking_error",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                stderr: ce,
                stdout: Te.body,
                exitCode: Te.statusCode ?? 0
              }),
              outcome: "non_blocking_error",
              hook: N
            };
            return;
          }
          if (ue && mhe(ue)) {
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: Te.body,
              stdout: Te.body,
              stderr: "",
              exitCode: Te.statusCode,
              outcome: "success"
            });
            yield {
              outcome: "success",
              hook: N
            };
            return;
          }
          if (ue) {
            let le = zpr({
              json: ue,
              command: N.url,
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              expectedHookEvent: d,
              stdout: Te.body,
              stderr: "",
              exitCode: Te.statusCode
            });
            emitHookMetrics(ue.metrics, j, d);
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: Te.body,
              stdout: Te.body,
              stderr: "",
              exitCode: Te.statusCode,
              outcome: "success"
            });
            yield {
              ...le,
              outcome: "success",
              hook: N
            };
            return;
          }
          return;
        }
        if (N.type === "mcp_tool") {
          eor(Z, p, d);
          let Te = await xzo(N, d, e, i?.options.mcpClients, o, s);
          if (Q?.(), Te.aborted) {
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: "Hook cancelled",
              stdout: "",
              stderr: "",
              exitCode: undefined,
              outcome: "cancelled"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                timedOut: !o?.aborted,
                timeoutMs: N.timeout ? N.timeout * 1000 : s
              }),
              outcome: "cancelled",
              hook: N
            };
            return;
          }
          if (Te.error || !Te.ok) {
            let le = Te.error || "MCP tool returned an error";
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: le,
              stdout: Te.body,
              stderr: le,
              exitCode: 1,
              outcome: "error"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_non_blocking_error",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                stderr: le,
                stdout: Te.body,
                exitCode: 1
              }),
              outcome: "non_blocking_error",
              hook: N
            };
            return;
          }
          let {
            json: ue,
            validationError: ce
          } = Kpr(Te.body);
          if (ce) {
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: Te.body,
              stdout: Te.body,
              stderr: ce,
              exitCode: 1,
              outcome: "error"
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_non_blocking_error",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                stderr: ce,
                stdout: Te.body,
                exitCode: 1
              }),
              outcome: "non_blocking_error",
              hook: N
            };
            return;
          }
          if (L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: Te.body,
            stdout: Te.body,
            stderr: "",
            exitCode: 0,
            outcome: "success"
          }), ue && TL(ue)) {
            let le = zpr({
              json: ue,
              command: oe,
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              expectedHookEvent: d,
              stdout: Te.body,
              stderr: "",
              exitCode: 0
            });
            emitHookMetrics(ue.metrics, j, d);
            yield {
              ...le,
              outcome: "success",
              hook: N
            };
            return;
          }
          yield {
            message: createAttachmentMessage({
              type: "hook_success",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              content: `${_$u.bold(p)} completed`,
              stdout: Te.body,
              stderr: "",
              command: oe,
              durationMs: Date.now() - ne
            }),
            outcome: "success",
            hook: N
          };
          return;
        }
        eor(Z, p, d);
        let ae = await Ypr(N, d, p, se, I5e(e), J, Z, V, W, j, z, c);
        Q?.();
        let de = Date.now() - ne;
        if (ae.backgrounded) {
          yield {
            outcome: "success",
            hook: N
          };
          return;
        }
        if (ae.aborted) {
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            outcome: "cancelled"
          });
          yield {
            message: createAttachmentMessage({
              type: "hook_cancelled",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              command: oe,
              durationMs: de,
              timedOut: !o?.aborted,
              timeoutMs: K
            }),
            outcome: "cancelled",
            hook: N
          };
          return;
        }
        let {
          json: be,
          plainText: fe,
          validationError: me
        } = Kpr(ae.stdout);
        if (me) {
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: me,
            exitCode: 1,
            outcome: "error"
          });
          yield {
            message: createAttachmentMessage({
              type: "hook_non_blocking_error",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              stderr: me,
              stdout: ae.stdout,
              exitCode: 1,
              command: oe,
              durationMs: de
            }),
            outcome: "non_blocking_error",
            hook: N
          };
          return;
        }
        if (be) {
          if (mhe(be)) {
            yield {
              outcome: "success",
              hook: N
            };
            return;
          }
          let Te = zpr({
            json: be,
            command: oe,
            hookName: p,
            toolUseID: n,
            hookEvent: d,
            expectedHookEvent: d,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            durationMs: de
          });
          if (emitHookMetrics(be.metrics, j, d), TL(be) && !be.suppressOutput && fe && ae.status === 0) {
            let ue = `${_$u.bold(p)} completed`;
            L0({
              hookId: Z,
              hookName: p,
              hookEvent: d,
              output: ae.output,
              stdout: ae.stdout,
              stderr: ae.stderr,
              exitCode: ae.status,
              outcome: "success"
            });
            yield {
              ...Te,
              message: Te.message || createAttachmentMessage({
                type: "hook_success",
                hookName: p,
                toolUseID: n,
                hookEvent: d,
                content: ue,
                stdout: ae.stdout,
                stderr: ae.stderr,
                exitCode: ae.status,
                command: oe,
                durationMs: de
              }),
              outcome: "success",
              hook: N
            };
            return;
          }
          if (ae.status === 2 && !Te.blockingError) {
            Te.blockingError = {
              blockingError: `[${ee}]: ${ae.stderr || "No stderr output"}`,
              command: ee
            };
          }
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            outcome: ae.status === 0 ? "success" : "error"
          });
          yield {
            ...Te,
            outcome: Te.blockingError ? "blocking" : "success",
            hook: N
          };
          return;
        }
        if (ae.status === 0) {
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            outcome: "success"
          });
          let Te = await persistHookOutput(ae.stdout.trim(), Z, "stdout");
          yield {
            message: createAttachmentMessage({
              type: "hook_success",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              content: Te,
              stdout: ae.stdout,
              stderr: ae.stderr,
              exitCode: ae.status,
              command: oe,
              durationMs: de
            }),
            outcome: "success",
            hook: N
          };
          return;
        }
        if (ae.status === 2 && (d === "Stop" || d === "SubagentStop" || d === "TaskCompleted" || d === "TeammateIdle" || j && d === "UserPromptSubmit") && !ae.stdout.trim() && /no such file|can't open/i.test(ae.stderr)) {
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            outcome: "error"
          });
          yield {
            message: createAttachmentMessage({
              type: "hook_non_blocking_error",
              hookName: p,
              toolUseID: n,
              hookEvent: d,
              stderr: `Hook script appears to be missing \u2014 "${ee}" exited 2 with: ${ae.stderr.trim()}. Treating as non-blocking. ` + (j ? `Run \`/plugin\` to reinstall '${j}' or remove it from settings.` : "If this is a plugin hook, check the plugin install (run /plugin)."),
              stdout: ae.stdout,
              exitCode: ae.status,
              command: oe,
              durationMs: de
            }),
            outcome: "non_blocking_error",
            hook: N
          };
          return;
        }
        if (ae.status === 2) {
          L0({
            hookId: Z,
            hookName: p,
            hookEvent: d,
            output: ae.output,
            stdout: ae.stdout,
            stderr: ae.stderr,
            exitCode: ae.status,
            outcome: "error"
          });
          yield {
            blockingError: {
              blockingError: `[${ee}]: ${ae.stderr || "No stderr output"}`,
              command: ee
            },
            outcome: "blocking",
            hook: N
          };
          return;
        }
        if (L0({
          hookId: Z,
          hookName: p,
          hookEvent: d,
          output: ae.output,
          stdout: ae.stdout,
          stderr: ae.stderr,
          exitCode: ae.status,
          outcome: "error"
        }), ae.spawnFailed && !Dfc(d, ee)) {
          yield {
            outcome: "non_blocking_error",
            hook: N
          };
          return;
        }
        yield {
          message: createAttachmentMessage({
            type: "hook_non_blocking_error",
            hookName: p,
            toolUseID: n,
            hookEvent: d,
            stderr: `Failed with non-blocking status code: ${ae.stderr.trim() || "No stderr output"}`,
            stdout: ae.stdout,
            exitCode: ae.status,
            command: oe,
            durationMs: de
          }),
          outcome: "non_blocking_error",
          hook: N
        };
        return;
      } catch (re) {
        Q?.();
        let se = re instanceof Error ? re.message : String(re);
        if (logForDebugging(`Hook failed to run (${p}): ${se}`, {
          level: "error"
        }), L0({
          hookId: Z,
          hookName: p,
          hookEvent: d,
          output: `Failed to run: ${se}`,
          stdout: "",
          stderr: `Failed to run: ${se}`,
          exitCode: 1,
          outcome: "error"
        }), !Dfc(d, ee)) {
          yield {
            outcome: "non_blocking_error",
            hook: N
          };
          return;
        }
        yield {
          message: createAttachmentMessage({
            type: "hook_non_blocking_error",
            hookName: p,
            toolUseID: n,
            hookEvent: d,
            stderr: `Failed to run: ${se}`,
            stdout: "",
            exitCode: 1,
            command: oe,
            durationMs: Date.now() - ne
          }),
          outcome: "non_blocking_error",
          hook: N
        };
        return;
      }
    });
    let I = {
      success: 0,
      blocking: 0,
      non_blocking_error: 0,
      cancelled: 0
    };
    let O = {
      additionalContextChars: 0,
      systemMessageChars: 0,
      initialUserMessageChars: 0,
      hookSuccessStdoutChars: 0
    };
    let M = new Map(h.map(N => [N.hook, N.pluginId]));
    let L = new Map();
    function P(N, W, j) {
      let z = M.get(N);
      if (!z || j === 0) {
        return;
      }
      let V = L.get(z);
      if (!V) {
        V = {
          additionalContextChars: 0,
          systemMessageChars: 0,
          initialUserMessageChars: 0,
          hookSuccessStdoutChars: 0
        };
        L.set(z, V);
      }
      V[W] += j;
    }
    let F = 0;
    let H;
    for await (let N of qXn(k)) {
      if (I[N.outcome]++, N.message?.type === "attachment" && N.message.attachment.type === "hook_success") {
        let j = N.message.attachment.stdout?.length ?? 0;
        O.hookSuccessStdoutChars += j;
        P(N.hook, "hookSuccessStdoutChars", j);
      }
      if (N.updatedToolOutput !== undefined) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) replaced tool output`);
        yield {
          updatedToolOutput: N.updatedToolOutput
        };
      }
      if (N.updatedMCPToolOutput !== undefined && N.updatedToolOutput === undefined) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) replaced tool output (updatedMCPToolOutput)`);
        yield {
          updatedMCPToolOutput: N.updatedMCPToolOutput
        };
      }
      if (N.displayContent !== undefined) {
        yield {
          displayContent: N.displayContent
        };
      }
      if (N.preventContinuation) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) requested preventContinuation`);
        yield {
          preventContinuation: true,
          stopReason: N.stopReason
        };
      }
      let W = N.hook?.type === "prompt" ? {
        hook: N.hook,
        stopReason: N.stopReason,
        impossible: N.impossible
      } : {};
      if (N.blockingError) {
        yield {
          blockingError: N.blockingError,
          suppressOriginalPrompt: N.suppressOriginalPrompt,
          ...W
        };
        H = "deny";
      }
      if (N.message) {
        yield {
          message: N.message,
          ...W
        };
      }
      if (F++, N.systemMessage) {
        O.systemMessageChars += N.systemMessage.length;
        P(N.hook, "systemMessageChars", N.systemMessage.length);
        let j = await persistHookOutput(N.systemMessage, `${n}-${F}`, "systemMessage");
        yield {
          message: createAttachmentMessage({
            type: "hook_system_message",
            content: j,
            hookName: p,
            toolUseID: n,
            hookEvent: d
          })
        };
      }
      if (N.terminalSequence) {
        qWo(N.terminalSequence);
      }
      if (N.additionalContext) {
        O.additionalContextChars += N.additionalContext.length;
        P(N.hook, "additionalContextChars", N.additionalContext.length);
        logForDebugging(`Hook ${d} (${RH(N.hook)}) provided additionalContext (${N.additionalContext.length} chars)`);
        yield {
          additionalContexts: [await persistHookOutput(N.additionalContext, `${n}-${F}`, "additionalContext")]
        };
      }
      if (N.initialUserMessage) {
        O.initialUserMessageChars += N.initialUserMessage.length;
        P(N.hook, "initialUserMessageChars", N.initialUserMessage.length);
        logForDebugging(`Hook ${d} (${RH(N.hook)}) provided initialUserMessage (${N.initialUserMessage.length} chars)`);
        yield {
          initialUserMessage: await persistHookOutput(N.initialUserMessage, `${n}-${F}`, "initialUserMessage")
        };
      }
      if (N.watchPaths && N.watchPaths.length > 0) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) provided ${N.watchPaths.length} watchPaths`);
        yield {
          watchPaths: N.watchPaths
        };
      }
      if (N.reloadSkills) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) requested reloadSkills`);
        yield {
          reloadSkills: true
        };
      }
      if (N.sessionTitle) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) provided sessionTitle (${[...N.sessionTitle].length} chars)`);
        yield {
          sessionTitle: N.sessionTitle
        };
      }
      if (N.permissionBehavior) {
        switch (logForDebugging(`Hook ${d} (${RH(N.hook)}) returned permissionDecision: ${N.permissionBehavior}${N.hookPermissionDecisionReason ? ` (reason: ${N.hookPermissionDecisionReason})` : ""}`), N.permissionBehavior) {
          case "deny":
            H = "deny";
            break;
          case "defer":
            if (H !== "deny") {
              H = "defer";
            }
            break;
          case "ask":
            if (H !== "deny" && H !== "defer") {
              H = "ask";
            }
            break;
          case "allow":
            if (!H) {
              H = "allow";
            }
            break;
          case "passthrough":
            break;
        }
      }
      if (N.permissionBehavior && H === N.permissionBehavior) {
        let j = N.updatedInput && (N.permissionBehavior === "allow" || N.permissionBehavior === "ask") ? N.updatedInput : undefined;
        if (j) {
          logForDebugging(`Hook ${d} (${RH(N.hook)}) modified tool input keys: [${Object.keys(j).join(", ")}]`);
        }
        yield {
          permissionBehavior: H,
          hookPermissionDecisionReason: N.hookPermissionDecisionReason,
          hookSource: h.find(z => z.hook === N.hook)?.hookSource,
          updatedInput: j
        };
      }
      if (N.updatedInput && N.permissionBehavior === undefined) {
        logForDebugging(`Hook ${d} (${RH(N.hook)}) modified tool input keys: [${Object.keys(N.updatedInput).join(", ")}]`);
        yield {
          updatedInput: N.updatedInput
        };
      }
      if (N.permissionRequestResult) {
        yield {
          permissionRequestResult: N.permissionRequestResult
        };
      }
      if (N.retry) {
        yield {
          retry: N.retry
        };
      }
      if (N.elicitationResponse) {
        yield {
          elicitationResponse: N.elicitationResponse
        };
      }
      if (N.elicitationResultResponse) {
        yield {
          elicitationResultResponse: N.elicitationResultResponse
        };
      }
      if (m && N.hook.type !== "callback") {
        let j = getSessionId();
        let V = zEl(m, j, d, r ?? "", N.hook);
        if (V?.onHookSuccess && N.outcome === "success") {
          try {
            V.onHookSuccess(N.hook, N);
          } catch (K) {
            Oe(Error("Session hook success callback failed", {
              cause: K
            }));
          }
        }
      }
    }
    let U = Date.now() - E;
    for (let N of new Set(M.values())) {
      if (N) {
        Tq(N);
      }
    }
    if (!u) {
      getStatsStore()?.observe("hook_duration_ms", U);
      for (let [N, W] of L) {
        let {
          name: j,
          marketplace: z
        } = Yo(N);
        logEvent("tengu_hook_plugin_injected", {
          hookName: p,
          ...pV(j, z),
          ...W
        });
      }
      if (logEvent("tengu_repl_hook_finished", {
        hookName: p,
        numCommands: h.length,
        numSuccess: I.success,
        numBlocking: I.blocking,
        numNonBlockingError: I.non_blocking_error,
        numCancelled: I.cancelled,
        totalDurationMs: U,
        ...O
      }), su("hook_execution_complete", {
        hook_event: d,
        hook_name: b,
        num_hooks: String(h.length),
        num_success: String(I.success),
        num_blocking: String(I.blocking),
        num_non_blocking_error: String(I.non_blocking_error),
        num_cancelled: String(I.cancelled),
        total_duration_ms: String(U),
        managed_only: String(Zce()),
        hook_source: Zce() ? "policySettings" : "merged",
        safe_mode: String(Ql()),
        ...(y && {
          hook_definitions: _
        })
      }), S) {
        Q0a(S, {
          numSuccess: I.success,
          numBlocking: I.blocking,
          numNonBlockingError: I.non_blocking_error,
          numCancelled: I.cancelled
        });
      }
      if (I.non_blocking_error > 0) {
        Ae(GHe(d), "hook_non_blocking_error");
      } else if (I.cancelled > 0) {
        Et(GHe(d), "hook_cancelled");
      } else {
        Pe(GHe(d));
      }
    }
  }
  function Gpr(e, t) {
    if (!e || !TL(e) || !e.terminalSequence) {
      return;
    }
    let n = jWo(e.terminalSequence);
    if (n !== null) {
      qWo(n);
    } else {
      logForDebugging(`Hook ${t} returned a terminalSequence that was rejected by the allowlist (only OSC 0/1/2/9/99/777 and BEL are permitted, and OSC 9 bodies may not begin with a digit unless in the 9;4 progress form)`);
    }
  }
  function hasBlockingResult(e) {
    return e.some(t => t.blocked);
  }
  async function executeHooksOutsideREPL({
    getAppState: e,
    hookInput: t,
    matchQuery: n,
    signal: r,
    timeoutMs: o = Ep
  }) {
    let s = t.hook_event_name;
    let i = n ? `${s}:${n}` : s;
    if (rq()) {
      logForDebugging(`Skipping hooks for ${i} due to 'disableAllHooks' managed setting`);
      return [];
    }
    if (shouldSkipHookDueToTrust()) {
      logForDebugging(`Skipping ${i} hook execution - workspace trust not accepted`);
      return [];
    }
    let a = e ? e() : undefined;
    let l = getSessionId();
    let c = await getMatchingHooks(a, l, s, t);
    if (c.length === 0) {
      return [];
    }
    if (r?.aborted) {
      return [];
    }
    let u = c.filter(h => !$fc(h));
    if (u.length > 0) {
      let h = getPluginHookCounts(u);
      let g = qfc(u);
      let y = Bn(u, _ => _.matcherIsMatchAll);
      logEvent("tengu_run_hook", {
        hookName: i,
        numCommands: u.length,
        numMatchAllMatchers: y,
        numSpecificMatchers: u.length - y,
        hookTypeCounts: De(g),
        ...(h && {
          pluginHookCounts: De(h)
        })
      });
    }
    let d;
    try {
      d = De(t);
    } catch (h) {
      Oe(h);
      Ae(GHe(s), "hook_input_stringify_failed");
      return [];
    }
    let p;
    let m = c.map(async ({
      hook: h,
      pluginRoot: g,
      pluginId: y,
      skillRoot: _
    }, b) => {
      if (h.type === "callback") {
        let A = h.timeout ? h.timeout * 1000 : o;
        let {
          signal: k,
          cleanup: I
        } = jO(r, {
          timeoutMs: A
        });
        try {
          let O = MJe.randomUUID();
          let M = await h.callback(t, O, k, b);
          if (I?.(), mhe(M)) {
            logForDebugging(`${i} [callback] returned async response, returning empty output`);
            return {
              command: "callback",
              succeeded: true,
              output: "",
              blocked: false
            };
          }
          let L = s === "WorktreeCreate" && TL(M) && M.hookSpecificOutput?.hookEventName === "WorktreeCreate" ? M.hookSpecificOutput.worktreePath : M.systemMessage || "";
          let P = TL(M) && M.decision === "block";
          Gpr(M, i);
          logForDebugging(`${i} [callback] completed successfully`);
          return {
            command: "callback",
            succeeded: true,
            output: L,
            blocked: P
          };
        } catch (O) {
          I?.();
          let M = O instanceof Error ? O.message : String(O);
          logForDebugging(`${i} [callback] failed to run: ${M}`, {
            level: "error"
          });
          p ??= "hook_callback_failed";
          return {
            command: "callback",
            succeeded: false,
            output: M,
            blocked: false
          };
        }
      }
      if (h.type === "prompt") {
        p ??= "hook_type_unsupported";
        return {
          command: h.prompt,
          succeeded: false,
          output: "Prompt stop hooks are not yet supported outside REPL",
          blocked: false
        };
      }
      if (h.type === "mcp_tool") {
        let A = `${h.server}/${h.tool}`;
        try {
          let k = await xzo(h, s, t, undefined, r, o);
          if (k.aborted) {
            p ??= "hook_cancelled";
            return {
              command: A,
              succeeded: false,
              output: "Hook cancelled",
              blocked: false
            };
          }
          if (k.error || !k.ok) {
            p ??= "hook_mcp_tool_failed";
            return {
              command: A,
              succeeded: false,
              output: k.error || "MCP tool returned an error",
              blocked: false
            };
          }
          let {
            json: I,
            validationError: O
          } = Kpr(k.body);
          if (O) {
            throw Error(O);
          }
          let M = I && TL(I) ? I : undefined;
          let L = M?.decision === "block";
          if (M) {
            emitHookMetrics(M.metrics, y, s);
          }
          Gpr(I, i);
          return {
            command: A,
            succeeded: true,
            output: L ? M?.reason || "" : k.body,
            blocked: L,
            watchPaths: M?.hookSpecificOutput && "watchPaths" in M.hookSpecificOutput ? M.hookSpecificOutput.watchPaths : undefined,
            systemMessage: M?.systemMessage
          };
        } catch (k) {
          let I = k instanceof Error ? k.message : String(k);
          logForDebugging(`${i} [${A}] failed to run: ${I}`, {
            level: "error"
          });
          p ??= "hook_mcp_exec_failed";
          return {
            command: A,
            succeeded: false,
            output: I,
            blocked: false
          };
        }
      }
      if (h.type === "agent") {
        p ??= "hook_type_unsupported";
        return {
          command: h.prompt,
          succeeded: false,
          output: "Agent stop hooks are not yet supported outside REPL",
          blocked: false
        };
      }
      if (h.type === "function") {
        Oe(Error(`Function hook reached executeHooksOutsideREPL for ${s}. Function hooks should only be used in REPL context (Stop hooks).`));
        p ??= "hook_type_unsupported";
        return {
          command: "function",
          succeeded: false,
          output: "Internal error: function hook executed outside REPL context",
          blocked: false
        };
      }
      if (h.type === "http") {
        try {
          let A = await Rzo(h, s, d, r, o);
          if (A.aborted) {
            logForDebugging(`${i} [${h.url}] cancelled`);
            p ??= "hook_cancelled";
            return {
              command: h.url,
              succeeded: false,
              output: "Hook cancelled",
              blocked: false
            };
          }
          if (A.error || !A.ok) {
            let L = A.error || `HTTP ${A.statusCode} from ${h.url}`;
            logForDebugging(`${i} [${h.url}] failed: ${L}`, {
              level: "error"
            });
            p ??= "hook_http_request_failed";
            return {
              command: h.url,
              succeeded: false,
              output: L,
              blocked: false
            };
          }
          let {
            json: k,
            validationError: I
          } = Ufc(A.body);
          if (I) {
            throw Error(I);
          }
          if (k && !mhe(k)) {
            logForDebugging(`Parsed JSON output from HTTP hook: ${De(k)}`, {
              level: "verbose"
            });
          }
          if (k && TL(k)) {
            emitHookMetrics(k.metrics, y, s);
          }
          Gpr(k, i);
          let O = k && TL(k) && k.decision === "block";
          let M = O ? k && TL(k) && k.reason || "" : s === "WorktreeCreate" ? k && TL(k) && k.hookSpecificOutput?.hookEventName === "WorktreeCreate" ? k.hookSpecificOutput.worktreePath : "" : A.body;
          return {
            command: h.url,
            succeeded: true,
            output: M,
            blocked: !!O
          };
        } catch (A) {
          let k = A instanceof Error ? A.message : String(A);
          logForDebugging(`${i} [${h.url}] failed to run: ${k}`, {
            level: "error"
          });
          p ??= "hook_http_exec_failed";
          return {
            command: h.url,
            succeeded: false,
            output: k,
            blocked: false
          };
        }
      }
      let S = h.timeout ? h.timeout * 1000 : o;
      let E = mCe(h);
      let {
        signal: C,
        cleanup: x
      } = jO(r, {
        timeoutMs: S
      });
      try {
        let A = await Ypr(h, s, i, d, I5e(t), C, MJe.randomUUID(), b, g, y, _);
        if (x?.(), A.aborted) {
          logForDebugging(`${i} [${E}] cancelled`);
          p ??= "hook_cancelled";
          return {
            command: E,
            succeeded: false,
            output: "Hook cancelled",
            blocked: false
          };
        }
        logForDebugging(`${i} [${E}] completed with status ${A.status}`);
        let {
          json: k,
          validationError: I
        } = Kpr(A.stdout);
        if (I) {
          throw Error(I);
        }
        if (k && !mhe(k)) {
          logForDebugging(`Parsed JSON output from hook: ${De(k)}`, {
            level: "verbose"
          });
        }
        if (k && TL(k)) {
          emitHookMetrics(k.metrics, y, s);
        }
        Gpr(k, i);
        let O = k && TL(k) && k.decision === "block";
        let M = A.status === 2 || !!O;
        let L = O ? k && TL(k) && k.reason || A.stderr || "" : A.status === 0 ? A.stdout || "" : A.stderr || "";
        let P = k && TL(k) && k.hookSpecificOutput && "watchPaths" in k.hookSpecificOutput ? k.hookSpecificOutput.watchPaths : undefined;
        let F = k && TL(k) ? k.systemMessage : undefined;
        if (A.status !== 0 && !M) {
          p ??= "hook_nonzero_exit";
        }
        return {
          command: E,
          succeeded: A.status === 0,
          output: L,
          blocked: M,
          watchPaths: P,
          systemMessage: F
        };
      } catch (A) {
        x?.();
        let k = A instanceof Error ? A.message : String(A);
        logForDebugging(`${i} [${E}] failed to run: ${k}`, {
          level: "error"
        });
        p ??= "hook_exec_failed";
        return {
          command: E,
          succeeded: false,
          output: k,
          blocked: false
        };
      }
    });
    let f = await Promise.all(m);
    if (p) {
      Ae(GHe(s), p);
    } else {
      Pe(GHe(s));
    }
    for (let h of new Set(c.map(g => g.pluginId))) {
      if (h) {
        Tq(h);
      }
    }
    return f;
  }
  function hasInstructionsLoadedHook() {
    let e = U2()?.InstructionsLoaded;
    if (e && e.length > 0) {
      return true;
    }
    if (!$_()) {
      let n = getMainThreadAgentHooks()?.InstructionsLoaded;
      if (n && n.length > 0) {
        return true;
      }
    }
    let t = getRegisteredHooks()?.InstructionsLoaded;
    if (t && t.length > 0) {
      return true;
    }
    return false;
  }
  function parseElicitationHookOutput(e, t) {
    if (e.blocked && !e.succeeded) {
      return {
        blockingError: {
          blockingError: e.output || "Elicitation blocked by hook",
          command: e.command
        }
      };
    }
    if (!e.output.trim()) {
      return {};
    }
    let n = e.output.trim();
    if (!n.startsWith("{")) {
      return {};
    }
    try {
      let r = pRt().parse(qt(n));
      if (mhe(r)) {
        return {};
      }
      if (!TL(r)) {
        return {};
      }
      if (r.decision === "block" || e.blocked) {
        return {
          blockingError: {
            blockingError: r.reason || "Elicitation blocked by hook",
            command: e.command
          }
        };
      }
      let o = r.hookSpecificOutput;
      if (!o || o.hookEventName !== t) {
        return {};
      }
      if (!o.action) {
        return {};
      }
      let i = {
        response: {
          action: o.action,
          content: o.content
        }
      };
      if (o.action === "decline") {
        i.blockingError = {
          blockingError: r.reason || (t === "Elicitation" ? "Elicitation denied by hook" : "Elicitation result blocked by hook"),
          command: e.command
        };
      }
      return i;
    } catch {
      return {};
    }
  }
  async function executeStatusLineCommand(e, t, n = 5000, r = false) {
    if (rq()) {
      return;
    }
    if (Pc("statusLine")) {
      return;
    }
    if (shouldSkipHookDueToTrust()) {
      logForDebugging("Skipping StatusLine command execution - workspace trust not accepted");
      return;
    }
    let o = V7e(getInitialSettings()?.statusLine);
    if (!o || o.type !== "command") {
      return;
    }
    let s = t || AbortSignal.timeout(n);
    try {
      let i = De(e);
      let a = await Ypr(o, "StatusLine", "statusLine", i, I5e(e), s, MJe.randomUUID());
      if (a.aborted) {
        return;
      }
      let l = a.stderr.trim();
      if (l) {
        logForDebugging(`StatusLine [${o.command}] stderr: ${l}`);
      }
      if (a.status === 0) {
        let c = a.stdout.trim().split(`
`).flatMap(u => u.trim() || []).join(`
`);
        if (c) {
          if (r) {
            logForDebugging(`StatusLine [${o.command}] completed with status ${a.status}`);
          }
          return c;
        }
      } else if (r) {
        logForDebugging(`StatusLine [${o.command}] completed with status ${a.status}`, {
          level: "warn"
        });
      }
      return;
    } catch (i) {
      logForDebugging(`Status hook failed: ${i}`, {
        level: "error"
      });
      return;
    }
  }
  async function executeFileSuggestionCommand(e, t, n = 5000) {
    if (rq()) {
      return [];
    }
    if (Pc("fileSuggestion")) {
      return [];
    }
    if (shouldSkipHookDueToTrust()) {
      logForDebugging("Skipping FileSuggestion command execution - workspace trust not accepted");
      return [];
    }
    let r = dsr(getInitialSettings()?.fileSuggestion);
    if (!r || r.type !== "command") {
      return [];
    }
    let o = t || AbortSignal.timeout(n);
    try {
      let s = De(e);
      let i = {
        type: "command",
        command: r.command
      };
      let a = await Ypr(i, "FileSuggestion", "FileSuggestion", s, I5e(e), o, MJe.randomUUID());
      if (a.aborted || a.status !== 0) {
        return [];
      }
      return a.stdout.split(`
`).map(l => l.trim()).filter(Boolean);
    } catch (s) {
      logForDebugging(`File suggestion helper failed: ${s}`, {
        level: "error"
      });
      return [];
    }
  }
  async function Tmf({
    hook: e,
    messages: t,
    hookName: n,
    toolUseID: r,
    hookEvent: o,
    timeoutMs: s,
    signal: i
  }) {
    let a = e.timeout ?? s;
    let {
      signal: l,
      cleanup: c
    } = jO(i, {
      timeoutMs: a
    });
    try {
      if (l.aborted) {
        c();
        return {
          outcome: "cancelled",
          hook: e
        };
      }
      let u = await new Promise((d, p) => {
        let m = () => p(Error("Function hook cancelled"));
        l.addEventListener("abort", m);
        Promise.resolve(e.callback(t, l)).then(f => {
          l.removeEventListener("abort", m);
          d(f);
        }).catch(f => {
          l.removeEventListener("abort", m);
          p(f);
        });
      });
      if (c(), u) {
        return {
          outcome: "success",
          hook: e
        };
      }
      return {
        blockingError: {
          blockingError: e.errorMessage,
          command: "function"
        },
        outcome: "blocking",
        hook: e
      };
    } catch (u) {
      if (c(), u instanceof Error && (u.message === "Function hook cancelled" || u.name === "AbortError")) {
        return {
          outcome: "cancelled",
          hook: e
        };
      }
      Oe(u);
      return {
        message: createAttachmentMessage({
          type: "hook_error_during_execution",
          hookName: n,
          toolUseID: r,
          hookEvent: o,
          content: u instanceof Error ? u.message : "Function hook execution error"
        }),
        outcome: "non_blocking_error",
        hook: e
      };
    }
  }
  async function Emf({
    toolUseID: e,
    hook: t,
    hookEvent: n,
    hookInput: r,
    signal: o,
    hookIndex: s,
    toolUseContext: i
  }) {
    let a = i ? {
      getAppState: i.getAppState,
      applyAttributionOp: i.applyAttributionOp
    } : undefined;
    let l = await t.callback(r, e, o, s, a);
    if (mhe(l)) {
      return {
        outcome: "success",
        hook: t
      };
    }
    return {
      ...zpr({
        json: l,
        command: "callback",
        hookName: `${n}:Callback`,
        toolUseID: e,
        hookEvent: n,
        expectedHookEvent: n,
        stdout: undefined,
        stderr: undefined,
        exitCode: undefined
      }),
      outcome: "success",
      hook: t
    };
  }
  function getTelemetryHookName(e, t) {
    if (!t) {
      return e;
    }
    if (bh()) {
      return `${e}:${t}`;
    }
    switch (e) {
      case "PreToolUse":
      case "PostToolUse":
      case "PostToolUseFailure":
      case "PermissionRequest":
      case "PermissionDenied":
        return `${e}:${qi(t)}`;
      case "Elicitation":
      case "ElicitationResult":
        return `${e}:mcp_server`;
      case "SubagentStart":
        return e;
      default:
        return `${e}:${t}`;
    }
  }
  function vmf(e) {
    return e.map(({
      hook: t
    }) => {
      if (t.type === "command") {
        return {
          type: "command",
          command: mCe(t)
        };
      } else if (t.type === "prompt") {
        return {
          type: "prompt",
          prompt: t.prompt
        };
      } else if (t.type === "http") {
        return {
          type: "http",
          command: t.url
        };
      } else if (t.type === "mcp_tool") {
        return {
          type: "mcp_tool",
          command: `${t.server}/${t.tool}`
        };
      } else if (t.type === "function") {
        return {
          type: "function",
          name: "function"
        };
      } else if (t.type === "callback") {
        return {
          type: "callback",
          name: "callback"
        };
      }
      return {
        type: "unknown"
      };
    });
  }
  function wmf(e) {
    for (let t of ["CLAUDE_PROJECT_DIR", "CLAUDE_PLUGIN_ROOT", "CLAUDE_PLUGIN_DATA"]) {
      e = e.replaceAll("${" + t + "}", () => "${env:" + t + "}");
    }
    return e;
  }
  var Mfc;
  var Vpr;
  var MJe;
  var pmf;
  var fmf;
  var hmf;
  var Sp = __lazy(() => {
    at();
    Zl();
    Eqn();
    w5e();
    vo();
    Bho();
    K9e();
    s1();
    lqn();
    pmt();
    Fp();
    Cs();
    Ds();
    Wd();
    wj();
    cMe();
    Jf();
    _qn();
    a9();
    k1();
    H8();
    at();
    lQt();
    i1();
    fa();
    Ot();
    ln();
    Gu();
    dV();
    yS();
    Wk();
    Kf();
    TC();
    $n();
    GG();
    vzo();
    zI();
    dCt();
    je();
    Zm();
    Zn();
    WWo();
    EC();
    dt();
    Rn();
    Bve();
    ror();
    Rf();
    ro();
    np();
    wx();
    nor();
    rR();
    no();
    Zze();
    ci();
    ifc();
    lfc();
    cfc();
    ufc();
    pZ();
    wb();
    gn();
    dt();
    pfc();
    Mfc = require("path");
    Vpr = require("child_process");
    MJe = require("crypto");
    Pfc();
    pmf = new Set();
    fmf = new Set(["PreToolUse", "PostToolUse", "PostToolUseFailure", "PermissionRequest", "PermissionDenied", "UserPromptExpansion", "SessionStart", "SessionEnd", "Setup", "PreCompact", "PostCompact", "Notification", "SubagentStart", "SubagentStop", "Elicitation", "ElicitationResult", "ConfigChange", "InstructionsLoaded"]);
    hmf = new Set(["PreToolUse", "PostToolUse", "PostToolUseFailure", "PermissionRequest", "PermissionDenied"]);
  });
  var ohc = {};