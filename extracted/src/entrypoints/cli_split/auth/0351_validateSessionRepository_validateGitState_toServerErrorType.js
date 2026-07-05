  __export(IKt, {
    validateSessionRepository: () => validateSessionRepository,
    validateGitState: () => validateGitState,
    toServerErrorType: () => toServerErrorType,
    toServerErrorReason: () => toServerErrorReason,
    teleportToRemoteWithErrorHandling: () => teleportToRemoteWithErrorHandling,
    teleportToRemote: () => teleportToRemote,
    teleportResumeCodeSession: () => teleportResumeCodeSession,
    teleportFromSessionsAPI: () => teleportFromSessionsAPI,
    subscribeRemoteSessionToPR: () => subscribeRemoteSessionToPR,
    processMessagesForTeleportResume: () => processMessagesForTeleportResume,
    pollRemoteSessionEvents: () => pollRemoteSessionEvents,
    interruptRemoteSession: () => interruptRemoteSession,
    checkOutTeleportedSessionBranch: () => checkOutTeleportedSessionBranch,
    awaitRemoteSessionResult: () => awaitRemoteSessionResult,
    archiveRemoteSession: () => archiveRemoteSession
  });
  function Bym(e) {
    if (e === null) {
      return wc("Session resumed", "suggestion");
    }
    let t = e instanceof eS ? e.formattedMessage : e.message;
    return wc(`Session resumed without branch: ${t}`, "warning");
  }
  function $ym() {
    return In({
      content: `This session is being continued from another machine. Application state may have changed. The updated working directory is ${getOriginalCwd()}`,
      isMeta: true
    });
  }
  async function jym(e, t) {
    let n = truncateToWidth(e, 75);
    let r = "claude/task";
    try {
      let o = Hym.replace("{description}", e);
      let i = (await RO({
        systemPrompt: [],
        userPrompt: o,
        outputFormat: {
          type: "json_schema",
          schema: {
            type: "object",
            properties: {
              title: {
                type: "string"
              },
              branch: {
                type: "string"
              }
            },
            required: ["title", "branch"],
            additionalProperties: false
          }
        },
        signal: t,
        options: {
          querySource: "teleport_generate_title",
          agents: [],
          isNonInteractiveSession: false,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          agentContext: ym()
        }
      })).message.content[0];
      if (i?.type !== "text") {
        return {
          title: n,
          branchName: "claude/task"
        };
      }
      let a = Ba(aW(i.text), false);
      let l = v.object({
        title: v.string(),
        branch: v.string()
      }).safeParse(a);
      if (l.success) {
        return {
          title: l.data.title || n,
          branchName: l.data.branch || "claude/task"
        };
      }
      return {
        title: n,
        branchName: "claude/task"
      };
    } catch (o) {
      logForDebugging(`Error generating title and branch: ${he(o)}`, {
        level: "error"
      });
      return {
        title: n,
        branchName: "claude/task"
      };
    }
  }
  async function validateGitState() {
    if (!(await getIsClean({
      ignoreUntracked: true
    }))) {
      throw logEvent("tengu_teleport_error_git_not_clean", {}), new eS("Git working directory is not clean. Please commit or stash your changes before using --teleport.", _$u.red(`Error: Git working directory is not clean. Please commit or stash your changes before using --teleport.
`));
    }
  }
  async function qym(e) {
    let t = e ? ["fetch", "origin", `${e}:${e}`] : ["fetch", "origin"];
    let n = fV();
    let {
      code: r,
      stderr: o
    } = await execFileNoThrow(gitExe(), t, {
      env: n
    });
    if (r !== 0) {
      if (e && o.includes("refspec")) {
        logForDebugging(`Specific branch fetch failed, trying to fetch ref: ${e}`);
        let {
          code: s,
          stderr: i
        } = await execFileNoThrow(gitExe(), ["fetch", "origin", e], {
          env: n
        });
        if (s !== 0) {
          logForDebugging(`Failed to fetch from remote origin: ${i}`, {
            level: "error"
          });
        }
      } else {
        logForDebugging(`Failed to fetch from remote origin: ${o}`, {
          level: "error"
        });
      }
    }
  }
  async function Wym(e) {
    let {
      code: t
    } = await execFileNoThrow(gitExe(), ["rev-parse", "--abbrev-ref", `${e}@{upstream}`]);
    if (t === 0) {
      logForDebugging(`Branch '${e}' already has upstream set`);
      return;
    }
    let {
      code: n
    } = await execFileNoThrow(gitExe(), ["rev-parse", "--verify", `origin/${e}`]);
    if (n === 0) {
      logForDebugging(`Setting upstream for '${e}' to 'origin/${e}'`);
      let {
        code: r,
        stderr: o
      } = await execFileNoThrow(gitExe(), ["branch", "--set-upstream-to", `origin/${e}`, e]);
      if (r !== 0) {
        logForDebugging(`Failed to set upstream for '${e}': ${o}`);
      } else {
        logForDebugging(`Successfully set upstream for '${e}'`);
      }
    } else {
      logForDebugging(`Remote branch 'origin/${e}' does not exist, skipping upstream setup`);
    }
  }
  async function Gym(e) {
    let {
      code: t,
      stderr: n
    } = await execFileNoThrow(gitExe(), ["checkout", e]);
    if (t !== 0) {
      logForDebugging(`Local checkout failed, trying to checkout from origin: ${n}`);
      let r = await execFileNoThrow(gitExe(), ["checkout", "-b", e, "--track", `origin/${e}`]);
      if (t = r.code, n = r.stderr, t !== 0) {
        logForDebugging(`Remote checkout with -b failed, trying without -b: ${n}`);
        let o = await execFileNoThrow(gitExe(), ["checkout", "--track", `origin/${e}`]);
        t = o.code;
        n = o.stderr;
      }
    }
    if (t !== 0) {
      throw logEvent("tengu_teleport_error_branch_checkout_failed", {}), new eS(`Failed to checkout branch '${e}': ${n}`, _$u.red(`Failed to checkout branch '${e}'
`));
    }
    await Wym(e);
  }
  async function sXn() {
    let {
      stdout: e
    } = await execFileNoThrow(gitExe(), ["branch", "--show-current"]);
    return e.trim();
  }
  function processMessagesForTeleportResume(e, t) {
    return [...deserializeMessages(e), $ym(), Bym(t)];
  }
  async function checkOutTeleportedSessionBranch(e) {
    try {
      let t = await sXn();
      if (logForDebugging(`Current branch before teleport: '${t}'`), e) {
        if (!wae(e)) {
          throw new eS(`Invalid branch name from cloud session: ${e}`, _$u.red(`Invalid branch name from cloud session
`));
        }
        logForDebugging(`Switching to branch '${e}'...`);
        await qym(e);
        await Gym(e);
        let r = await sXn();
        logForDebugging(`Branch after checkout: '${r}'`);
      } else {
        logForDebugging("No branch specified, staying on current branch");
      }
      return {
        branchName: await sXn(),
        branchError: null
      };
    } catch (t) {
      let n = await sXn();
      let r = sr(t);
      return {
        branchName: n,
        branchError: r
      };
    }
  }
  async function validateSessionRepository(e) {
    let t = await detectCurrentRepositoryWithHost();
    let n = t ? `${t.owner}/${t.name}` : null;
    let r = e.session_context.sources.find(c => c.type === "git_repository");
    if (!r?.url) {
      logForDebugging(n ? "Session has no associated repository, proceeding without validation" : "Session has no repo requirement and not in git directory, proceeding");
      return {
        status: "no_repo_required"
      };
    }
    let o = parseGitRemote(r.url);
    let s = o ? `${o.owner}/${o.name}` : parseGitHubRepository(r.url);
    if (!s) {
      return {
        status: "no_repo_required"
      };
    }
    if (logForDebugging(`Session is for repository: ${s}, current repo: ${n ?? "none"}`), !n) {
      return {
        status: "not_in_repo",
        sessionRepo: s,
        sessionHost: o?.host,
        currentRepo: null
      };
    }
    let i = c => c.replace(/:\d+$/, "");
    let a = n.toLowerCase() === s.toLowerCase();
    let l = !t || !o || i(t.host.toLowerCase()) === i(o.host.toLowerCase());
    if (a && l) {
      return {
        status: "match",
        sessionRepo: s,
        currentRepo: n
      };
    }
    return {
      status: "mismatch",
      sessionRepo: s,
      currentRepo: n,
      sessionHost: o?.host,
      currentHost: t?.host
    };
  }
  async function teleportResumeCodeSession(e, t) {
    if (!isFirstPartyProvider()) {
      throw Error("Cloud sessions are only available on the first-party Anthropic API provider.");
    }
    let n = policyDeniedReason("allow_remote_sessions", "Cloud sessions", "are");
    if (n) {
      throw new Po(n, "allow_remote_sessions policy denied");
    }
    logForDebugging(`Resuming code session ID: ${e}`);
    try {
      let r = getClaudeAIOAuthTokens()?.accessToken;
      if (!r) {
        throw logEvent("tengu_teleport_resume_error", {
          error_type: "no_access_token"
        }), Error("Claude Code web sessions require authentication with a Claude.ai account. API key authentication is not sufficient. Please run /login to authenticate, or check your authentication status with /status.");
      }
      let o = await getOrganizationUUID();
      if (!o) {
        throw logEvent("tengu_teleport_resume_error", {
          error_type: "no_org_uuid"
        }), Error("Unable to get organization UUID for constructing session URL");
      }
      t?.("validating");
      let s = await fetchSession(e);
      let i = await validateSessionRepository(s);
      switch (i.status) {
        case "match":
        case "no_repo_required":
          break;
        case "not_in_repo":
          {
            logEvent("tengu_teleport_error_repo_not_in_git_dir_sessions_api", {
              sessionId: br(e)
            });
            let a = i.sessionHost && !ef(i.sessionHost) ? `${i.sessionHost}/${i.sessionRepo}` : i.sessionRepo;
            throw new eS(`You must run claude --teleport ${e} from a checkout of ${a}.`, _$u.red(`You must run claude --teleport ${e} from a checkout of ${_$u.bold(a)}.
`));
          }
        case "mismatch":
          {
            logEvent("tengu_teleport_error_repo_mismatch_sessions_api", {
              sessionId: br(e)
            });
            let a = i.sessionHost && i.currentHost && i.sessionHost.replace(/:\d+$/, "").toLowerCase() !== i.currentHost.replace(/:\d+$/, "").toLowerCase();
            let l = a ? `${i.sessionHost}/${i.sessionRepo}` : i.sessionRepo;
            let c = a ? `${i.currentHost}/${i.currentRepo}` : i.currentRepo;
            throw new eS(`You must run claude --teleport ${e} from a checkout of ${l}.
This repo is ${c}.`, _$u.red(`You must run claude --teleport ${e} from a checkout of ${_$u.bold(l)}.
This repo is ${_$u.bold(c)}.
`));
          }
        case "error":
          throw new eS(i.errorMessage || "Failed to validate session repository", _$u.red(`Error: ${i.errorMessage || "Failed to validate session repository"}
`));
        default:
          {
            let a = i.status;
            throw Error(`Unhandled repo validation status: ${a}`);
          }
      }
      return await teleportFromSessionsAPI(e, o, r, t, s);
    } catch (r) {
      if (r instanceof eS) {
        throw r;
      }
      let o = sr(r);
      throw logForDebugging(`Failed to resume teleport session ${e}: ${o.message}`, {
        level: "error"
      }), logEvent("tengu_teleport_resume_error", {
        error_type: "resume_session_id_catch"
      }), new eS(o.message, _$u.red(`Error: ${o.message}
`));
    }
  }
  async function Vym(e, t) {
    let n = Chl(await PPo(), t);
    if (n.size > 0) {
      logEvent("tengu_teleport_errors_detected", {
        error_types: Array.from(n).join(","),
        errors_ignored: Array.from(t).join(",")
      });
      await new Promise(r => {
        e.render(iXn.jsx(AppStateProvider, {
          children: iXn.jsx(KeybindingSetup, {
            children: iXn.jsx(zJn, {
              errorsToIgnore: t,
              onComplete: () => {
                logEvent("tengu_teleport_errors_resolved", {
                  error_types: Array.from(n).join(",")
                });
                r();
              }
            })
          })
        }));
      });
    }
  }
  function Hhl(e, t, n, r) {
    if (logEvent("tengu_ccr_session_link", {
      ccr_session_id: e,
      source: t,
      create_endpoint: r.endpoint,
      grouped: r.grouped
    }), n.project && !getCurrentProjectConfig().hasUsedRemoteSession) {
      saveCurrentProjectConfig(o => o.hasUsedRemoteSession ? o : {
        ...o,
        hasUsedRemoteSession: true
      });
    }
    if (n.global && !getGlobalConfig().hasRemoteEnvironment) {
      saveGlobalConfig(o => o.hasRemoteEnvironment ? o : {
        ...o,
        hasRemoteEnvironment: true
      });
    }
  }
  function toServerErrorType(e) {
    if (typeof e !== "string" || e === "") {
      return;
    }
    switch (e) {
      case "authentication_error":
      case "invalid_request_error":
      case "permission_error":
      case "api_error":
      case "not_found_error":
      case "rate_limit_error":
      case "billing_error":
      case "overloaded_error":
      case "request_too_large":
        return e;
      default:
        return "other";
    }
  }
  function toServerErrorReason(e) {
    if (typeof e !== "string" || e === "") {
      return;
    }
    switch (e) {
      case "github_repo_access_denied":
      case "environment_not_found":
      case "monorepo_source_required":
      case "monorepo_env_required":
      case "model_not_available_for_org":
      case "invalid_set_model_request":
      case "org_storage_quota_exceeded":
      case "feature_disabled":
      case "invalid_id":
      case "public_grouping_hosted_only":
      case "public_grouping_requires_agent":
      case "public_grouping_default_agent_deleted":
      case "public_grouping_default_agent_invalid":
        return e;
      default:
        return "other";
    }
  }
  async function teleportToRemoteWithErrorHandling(e, t) {
    await Vym(e, new Set(["needsGitStash"]));
    let r;
    let o;
    let s;
    let i = await teleportToRemote({
      initialMessage: t.description,
      initialMessageUuid: t.descriptionUuid,
      signal: t.signal,
      source: t.source,
      branchName: t.branchName,
      explicitRef: t.explicitRef,
      permissionMode: t.permissionMode,
      environmentVariables: t.environmentVariables,
      poolId: t.poolId,
      correlationId: t.correlationId,
      sessionGroupingId: t.sessionGroupingId,
      allowBundle: true,
      onBundleFail: (a, l) => {
        switch (l) {
          case "env_create":
            r = "env_create_failed";
            break;
          case "bundle":
            r = "bundle_failed";
            break;
          default:
            {
              let c = l;
            }
        }
        o = a;
        process.stderr.write(`
${a}
`);
      },
      onCreateFail: (a, l, c) => {
        r = l;
        o = a;
        s = c;
        process.stderr.write(`
${a}
`);
      }
    });
    if (i) {
      return {
        ok: true,
        session: i
      };
    }
    return {
      ok: false,
      failReason: r ?? (t.signal.aborted ? "aborted" : "unknown"),
      failMessage: o,
      failDetail: s
    };
  }
  async function teleportFromSessionsAPI(e, t, n, r, o) {
    let s = Date.now();
    try {
      logForDebugging(`[teleport] Starting fetch for session: ${e}`);
      r?.("fetching_logs");
      let i = Date.now();
      let a;
      if (isPersistentRemoteSessionEnabled()) {
        let {
          readStoredTrustedDeviceToken: p
        } = await Promise.resolve().then(() => (CQ(), k5n));
        a = await p();
      }
      let l = await zfl(e, n, t, a);
      if (l === null) {
        logForDebugging("[teleport] v2 endpoint returned null, trying session-ingress");
        l = await Vfl(e, n, t);
      }
      if (logForDebugging(`[teleport] Session logs fetched in ${Date.now() - i}ms`), l === null) {
        throw Error("Failed to fetch session logs");
      }
      let c = Date.now();
      let u = l.filter(p => isTranscriptMessage(p) && !p.isSidechain);
      logForDebugging(`[teleport] Filtered ${l.length} entries to ${u.length} messages in ${Date.now() - c}ms`);
      r?.("fetching_branch");
      let d = o ? getBranchFromSession(o) : undefined;
      if (d) {
        logForDebugging(`[teleport] Found branch: ${d}`);
      }
      logForDebugging(`[teleport] Total teleportFromSessionsAPI time: ${Date.now() - s}ms`);
      return {
        log: u,
        branch: d
      };
    } catch (i) {
      if (i instanceof eS) {
        throw i;
      }
      let a = sr(i);
      if (NP.isAxiosError(i) && i.response?.status === 404) {
        throw logEvent("tengu_teleport_error_session_not_found_404", {
          sessionId: br(e)
        }), new eS(`${e} not found.
Run /status in Claude Code to check your account.`, `${e} not found.
${_$u.dim("Run /status in Claude Code to check your account.")}`);
      }
      throw Oe($o(sr(a), "Failed to fetch session from Sessions API")), Error(`Failed to fetch session from Sessions API: ${a.message}`);
    }
  }
  function lXn() {
    return getClaudeAIOAuthTokens()?.accessToken ?? (st(process.env.CLAUDE_CODE_REMOTE) ? process.env.CLAUDE_CODE_OAUTH_TOKEN || r8() || undefined : undefined);
  }
  async function pollRemoteSessionEvents(e, t = null, n) {
    if (!isFirstPartyProvider()) {
      throw Error("Cloud sessions are only available on the first-party Anthropic API provider.");
    }
    await checkAndRefreshOAuthTokenIfNeeded();
    let r = lXn();
    if (!r) {
      throw Error("No access token for polling");
    }
    let o = getOAuthHeaders(r);
    let s = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/events`;
    let i = 50;
    let a = [];
    let l = t;
    for (let p = 0; p < i; p++) {
      let m = await axiosGetWithRetry(s, {
        headers: o,
        params: {
          sort_order: "asc",
          ...(l && {
            cursor: l
          })
        },
        timeout: 30000
      });
      if (m.status !== 200) {
        throw Error(`Failed to fetch session events: ${m.statusText}`);
      }
      let f = m.data;
      if (!f?.data || !Array.isArray(f.data)) {
        throw Error("Invalid events response");
      }
      for (let h of f.data) {
        let g = h?.sequence_num;
        if (g !== undefined) {
          l = String(g);
        }
        let y = h?.payload;
        if (y && typeof y === "object" && "type" in y) {
          if (y.type === "env_manager_log" || y.type === "control_response") {
            continue;
          }
          if ("session_id" in y) {
            a.push(y);
          }
        }
      }
      if (!f.next_cursor) {
        break;
      }
    }
    if (n?.skipMetadata) {
      return {
        newEvents: a,
        lastEventId: l
      };
    }
    let c;
    let u;
    let d;
    try {
      let p = await fetchSession(e, {
        accessToken: r
      });
      c = getBranchFromSession(p);
      u = p.session_status;
    } catch (p) {
      d = he(p);
      logForDebugging(`teleport: failed to fetch session ${e} metadata: ${p}`, {
        level: "warn"
      });
    }
    return {
      newEvents: a,
      lastEventId: l,
      branch: c,
      sessionStatus: u,
      metadataFetchError: d
    };
  }
  async function awaitRemoteSessionResult(e, t) {
    if (!isFirstPartyProvider()) {
      throw Error("Cloud sessions are only available on the first-party Anthropic API provider.");
    }
    let n = 1000;
    let r = 1800000;
    let o = 5;
    let s = 10;
    let i = null;
    let a;
    let l;
    let c = 0;
    let u = 0;
    let d = 0;
    let p = false;
    let m = Date.now();
    while (Date.now() - m < r) {
      if (t?.aborted) {
        throw Error("Workflow aborted");
      }
      let g = await pollRemoteSessionEvents(e, i);
      i = g.lastEventId;
      for (let y of g.newEvents) {
        if (y.type === "assistant") {
          a = y;
          for (let _ of y.message.content) {
            if (_.type === "tool_use") {
              c++;
            }
          }
        } else if (y.type === "result") {
          l = y;
        }
      }
      if (g.sessionStatus === "archived") {
        p = true;
        break;
      }
      if (g.sessionStatus === "requires_action") {
        throw Error(`Cloud session ${e} entered 'requires_action' (likely a permission prompt) with no client to answer it. Ensure the cloud agent's allowed_tools cover what it needs, or set a permissive mode.`);
      }
      if (g.sessionStatus === undefined) {
        if (d++, d >= s) {
          throw Error(`Cloud session ${e}: fetchSession failed ${s} times in a row (last error: ${g.metadataFetchError ?? "unknown"}). Bailing instead of polling to the 30-min timeout.`);
        }
      } else {
        d = 0;
      }
      if (g.sessionStatus === "idle" && g.newEvents.length === 0) {
        if (u++, u >= o) {
          p = true;
          break;
        }
      } else {
        u = 0;
      }
      await sleep(n, t);
    }
    if (!p) {
      throw Error(`Cloud session ${e} timed out after ${r / 60000} min`);
    }
    let f = a && a.type === "assistant" ? Tl(a.message.content, `
`) : "";
    let h = l && l.type === "result" ? l : undefined;
    return {
      text: f,
      structuredOutput: h?.subtype === "success" ? h.structured_output : undefined,
      resultSubtype: h?.subtype,
      usage: h?.usage,
      totalCostUsd: h?.total_cost_usd,
      modelUsage: h?.modelUsage,
      numTurns: h?.num_turns,
      toolCalls: c
    };
  }
  function jhl(e) {
    let t = [];
    if (e.permissionMode) {
      t.push({
        type: "event",
        data: {
          type: "control_request",
          request_id: `set-mode-${Ize.randomUUID()}`,
          request: {
            subtype: "set_permission_mode",
            mode: e.permissionMode,
            ultraplan: e.ultraplan
          }
        }
      });
    }
    if (!getIsNonInteractiveSession() && alt()) {
      t.push({
        type: "event",
        data: {
          type: "control_request",
          request_id: `apply-flag-settings-${Ize.randomUUID()}`,
          request: {
            subtype: "apply_flag_settings",
            settings: {
              viewMode: "focus"
            }
          }
        }
      });
    }
    let n = QHn();
    if (n) {
      t.push({
        type: "event",
        data: {
          type: "control_request",
          request_id: `apply-flag-settings-${Ize.randomUUID()}`,
          request: {
            subtype: "apply_flag_settings",
            settings: {
              advisorModel: n
            }
          }
        }
      });
    }
    if (typeof e.initialMessage === "string" ? e.initialMessage : e.initialMessage && e.initialMessage.length > 0) {
      t.push({
        type: "event",
        data: {
          uuid: e.initialMessageUuid ?? Ize.randomUUID(),
          session_id: "",
          type: "user",
          parent_tool_use_id: null,
          message: {
            role: "user",
            content: e.initialMessage
          }
        }
      });
    }
    return t;
  }
  function zym(e) {
    if (typeof e === "string") {
      return e;
    }
    if (!e) {
      return "";
    }
    return e.filter(t => t.type === "text" && typeof t.text === "string").map(t => t.text).join(" ");
  }
  function qhl(e, t, n) {
    return {
      url: `${getOauthConfig().BASE_API_URL}${e === "v1alpha2" ? "/v1/code/sessions" : "/v1/sessions"}`,
      headers: {
        ...getOAuthHeaders(t),
        "x-organization-uuid": n,
        ...(e === "v1" && {
          "anthropic-beta": "ccr-byoc-2025-07-29"
        })
      }
    };
  }
  function Whl(e, t) {
    return e === "v1alpha2" ? t?.session : t;
  }
  async function teleportToRemote(e) {
    let {
      initialMessage: t,
      signal: n
    } = e;
    let r = e.cwd ?? Nt();
    let o = policyDeniedReason("allow_remote_sessions", "Cloud sessions", "are");
    if (o) {
      e.onCreateFail?.(o, "policy_denied");
      return null;
    }
    if (!isFirstPartyProvider()) {
      e.onCreateFail?.("Cloud sessions are only available on the first-party Anthropic API provider.", "not_first_party");
      return null;
    }
    try {
      if (e.sessionGroupingId) {
        e.onCreateFail?.(xhl(e) ? "--project requires the new session-create endpoint, which isn't enabled for your account yet \u2014 no session was created." : "--project cannot be used on a GitHub-PR-bound create; it has no Project input \u2014 no session was created.", "project_not_enabled", {
          endpoint: "v1"
        });
        return null;
      }
      await checkAndRefreshOAuthTokenIfNeeded();
      let i = lXn();
      if (!i) {
        let V = "Cloud sessions require a claude.ai login. Run /login to authenticate." + (st(process.env.CLAUDE_CODE_REMOTE) ? ` (in CCR: env=${process.env.CLAUDE_CODE_OAUTH_TOKEN ? "set" : "unset"}, fd=${process.env.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR ? "set" : "unset"})` : "");
        Oe(Error(V));
        e.onCreateFail?.(V, "no_access_token");
        return null;
      }
      let a = await getOrganizationUUID();
      if (!a) {
        let V = "Unable to get organization UUID for cloud session creation" + (st(process.env.CLAUDE_CODE_REMOTE) ? ` (in CCR: CLAUDE_CODE_ORGANIZATION_UUID=${process.env.CLAUDE_CODE_ORGANIZATION_UUID ? "set" : "unset"})` : "");
        Oe(Error(V));
        e.onCreateFail?.(V, "no_org_uuid");
        return null;
      }
      let l = {
        ...e.environmentVariables
      };
      if (delete l.CLAUDE_CODE_OAUTH_TOKEN, e.environmentId) {
        let {
          url: V,
          headers: K
        } = qhl("v1", i, a);
        let J = null;
        let Q = null;
        if (e.useBundle) {
          let se = await JPo({
            oauthToken: i,
            sessionId: getSessionId(),
            baseUrl: getOauthConfig().BASE_API_URL
          }, {
            signal: n,
            baseRef: e.bundleBaseRef
          });
          if (!se.success) {
            if (logForDebugging(`Bundle upload failed: ${se.error}`, {
              level: "error"
            }), se.failReason !== "too_large") {
              e.onBundleFail?.(se.error, "bundle");
            }
            return null;
          }
          Q = se.fileId;
          logEvent("tengu_teleport_bundle_mode", {
            size_bytes: se.bundleSizeBytes,
            scope: se.scope,
            has_wip: se.hasWip,
            reason: "explicit_env_bundle"
          });
        } else if (e.sourceUrl) {
          J = {
            type: "git_repository",
            url: e.sourceUrl,
            revision: e.branchName
          };
        } else {
          let se = await detectCurrentRepositoryWithHost();
          if (se) {
            J = {
              type: "git_repository",
              url: `https://${se.host}/${se.owner}/${se.name}`,
              revision: e.branchName
            };
          }
        }
        let Z = e.title || e.description || "Remote task";
        let ne = jhl({
          initialMessage: t,
          initialMessageUuid: e.initialMessageUuid,
          permissionMode: e.permissionMode,
          ultraplan: e.ultraplan
        });
        let oe = {
          title: Z,
          events: ne,
          session_context: {
            sources: J ? [J] : [],
            ...(Q && {
              seed_bundle_file_id: Q
            }),
            outcomes: [],
            environment_variables: l,
            ...(e.model && {
              model: e.model
            }),
            ...(e.appendSystemPrompt && {
              append_system_prompt: e.appendSystemPrompt
            }),
            ...(e.outputSchema && {
              output_schema: e.outputSchema
            }),
            ...(e.correlationId && {
              correlation_id: e.correlationId
            })
          },
          ...B6t(e.environmentId),
          ...(e.tags && {
            tags: e.tags
          })
        };
        logForDebugging(`[teleportToRemote] explicit env ${e.environmentId}, ${Object.keys(l).length} env vars, ${Q ? `bundle=${Q}` : `source=${J?.url ?? "none"}@${e.branchName ?? "default"}`}`);
        let ee = await NP.post(V, oe, {
          headers: K,
          signal: n,
          validateStatus: se => se < 500
        });
        if (ee.status !== 200 && ee.status !== 201) {
          let se = `CreateSession ${ee.status}: ${De(ee.data)}`;
          let ae = ee.data;
          if ([401, 403, 429].includes(ee.status) || ae?.error?.reason === "github_repo_access_denied") {
            logForDebugging(`[teleportToRemote] ${se}`, {
              level: "error"
            });
          } else {
            let de = be => be && /^[a-z][a-z0-9_]*$/.test(be) ? be : undefined;
            Oe(Error(`[type=${de(ae?.error?.type)},reason=${de(ae?.error?.reason)}] ${se}`));
          }
          e.onCreateFail?.(e.sessionGroupingId && KPo(e.sessionGroupingId, ae?.error) || ae?.error?.message || `${ee.status} ${ee.statusText || ""}`.trim(), "create_request_failed", {
            status: ee.status,
            serverType: toServerErrorType(ae?.error?.type),
            serverReason: toServerErrorReason(ae?.error?.reason),
            endpoint: "v1"
          });
          return null;
        }
        let re = Whl("v1", ee.data);
        if (!re || typeof re.id !== "string") {
          Oe($o(Error(`No session id in response: ${De(ee.data)}`), "CreateSession response missing session id"));
          e.onCreateFail?.("Server returned a malformed session response (no session id)", "malformed_response");
          return null;
        }
        Hhl(re.id, e.source, {
          project: false,
          global: false
        }, {
          endpoint: "v1",
          grouped: e.sessionGroupingId != null
        });
        return {
          id: re.id,
          title: re.title || Z
        };
      }
      let c = e.poolId ?? getInitialSettings()?.remote?.defaultEnvironmentId;
      let u = T5n(c);
      let d = e.title && e.reuseOutcomeBranch ? null : jym(e.description || zym(t) || "Background task", n);
      logForDebugging("[teleport] phase: env-select");
      let p = u ? [] : await Koe(i);
      if (!u && p.length === 0) {
        try {
          p = [await Tgt(undefined, n, i)];
          logForDebugging("[teleportToRemote] Auto-created default cloud env");
        } catch (V) {
          logForDebugging(`[teleportToRemote] auto-create env failed: ${he(V)}`, {
            level: "warn"
          });
          e.onBundleFail?.("Could not create a cloud environment. Set one up at https://claude.ai/code/onboarding?magic=env-setup", "env_create");
          return null;
        }
      }
      logForDebugging(`Available environments: ${p.map(V => `${V.environment_id} (${V.name}, ${V.kind})`).join(", ")}`);
      let m = c;
      let f = m ? p.find(V => V.environment_id === m) : undefined;
      let h = p.find(V => V.kind === "anthropic_cloud");
      if (!u && e.useDefaultEnvironment && !f && !h) {
        if (logForDebugging(`No configured default or anthropic_cloud in env list (${p.length} envs); retrying fetchEnvironments`), p = await Koe(i), f = m ? p.find(V => V.environment_id === m) : undefined, h = p.find(V => V.kind === "anthropic_cloud"), !f && !h) {
          let V = `No configured default or anthropic_cloud environment available after retry (got: ${p.map(K => `${K.name} (${K.kind})`).join(", ")}${m ? `; configured default ${m} not in list` : ""})`;
          logForDebugging(`[teleportToRemote] ${V}. Silent byoc fallthrough would launch into a dead env \u2014 fail fast instead.`, {
            level: "error"
          });
          e.onCreateFail?.(V, "no_default_env");
          return null;
        }
      }
      let g = u ? undefined : f || h || p.find(V => V.kind !== "bridge") || p[0];
      if (!g && !u) {
        Oe(Error("No environments available for session creation"));
        e.onCreateFail?.("No environments available for session creation", "no_environments");
        return null;
      }
      if (m && g) {
        let V = g.environment_id === m;
        logForDebugging(V ? `Using configured default environment: ${m}` : `Configured default environment ${m} not found, using first available`);
      }
      let y = u ? m : g.environment_id;
      logForDebugging(g ? `Selected environment: ${y} (${g.name}, ${g.kind})` : `Selected environment: ${y}`);
      let _ = null;
      let b = null;
      let S = null;
      if (e.sourceUrl) {
        _ = {
          type: "git_repository",
          url: e.sourceUrl,
          revision: e.branchName
        };
      }
      logForDebugging("[teleport] phase: branch-detect");
      let E = _ ? null : await detectCurrentRepositoryWithHost(e.cwd);
      let C;
      let x;
      if (d === null) {
        C = e.title;
        x = e.reuseOutcomeBranch;
      } else {
        let V = await d;
        C = e.title || V.title;
        x = e.reuseOutcomeBranch || V.branchName;
      }
      let A = false;
      let k = e.sourceUrl ? "explicit_source_url" : "no_git_at_all";
      let I = findGitRoot(r);
      let O = u || g?.kind === "byoc";
      let M = e.allowBundle && !O && st(process.env.CCR_FORCE_BUNDLE);
      let L = e.allowBundle && !O && I !== null && (st(process.env.CCR_ENABLE_BUNDLE) || (await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bundle_seed_enabled")));
      if (E && !M) {
        if (O) {
          A = true;
          k = "byoc_env_skip_preflight";
        } else if (ef(E.host)) {
          A = await x8e(E.owner, E.name, n);
          k = A ? "github_preflight_ok" : "github_preflight_failed";
        } else {
          A = true;
          k = "ghes_optimistic";
        }
      } else if (M) {
        k = "forced_bundle";
      } else if (I) {
        k = "no_github_remote";
      }
      if (!A && !L && E) {
        A = true;
      }
      if (A && E) {
        let {
          host: V,
          owner: K,
          name: J
        } = E;
        let Q = e.branchName ?? (await getDefaultBranch()) ?? undefined;
        logForDebugging(`[teleportToRemote] Git source: ${V}/${K}/${J}, revision: ${Q ?? "none"}`);
        _ = {
          type: "git_repository",
          url: `https://${V}/${K}/${J}`,
          revision: Q,
          ...(e.reuseOutcomeBranch && {
            allow_unrestricted_git_push: true
          })
        };
        b = {
          type: "git_repository",
          git_info: {
            type: "github",
            repo: `${K}/${J}`,
            branches: [x]
          }
        };
      }
      if (!_ && !O && e.explicitRef) {
        let V = M ? "CCR_FORCE_BUNDLE is set" : E ? "the GitHub App preflight did not pass" : "no GitHub remote was detected in this directory";
        let K = L ? "be seeded from your local working tree" : "start with an empty sandbox";
        e.onCreateFail?.(`--ref ${e.explicitRef} cannot be honored: ${V}, so the session would ${K} instead. ` + (E ? "Set up the GitHub integration at https://claude.ai/code, or " : "") + (L ? "drop --ref to seed from local HEAD." : "drop --ref to start with an empty sandbox."), "explicit_ref_no_git_source");
        return null;
      }
      if (!_ && L) {
        logForDebugging("[teleport] phase: bundle-upload");
        logForDebugging(`[teleportToRemote] Bundling (reason: ${k})`);
        let V = await JPo({
          oauthToken: i,
          sessionId: getSessionId(),
          baseUrl: getOauthConfig().BASE_API_URL
        }, {
          signal: n
        });
        if (!V.success) {
          logForDebugging(`Bundle upload failed: ${V.error}`, {
            level: "error"
          });
          let K = E ? ". Please setup GitHub on https://claude.ai/code" : "";
          let J;
          switch (V.failReason) {
            case "empty_repo":
              J = 'Repository has no commits \u2014 run `git add . && git commit -m "initial"` then retry';
              break;
            case "too_large":
              J = `Repo is too large to teleport${K}`;
              break;
            case "git_error":
              J = `Failed to create git bundle (${V.error})${K}`;
              break;
            case "stash_failed":
            case "no_changes":
              J = V.error;
              break;
            case undefined:
              J = `Bundle upload failed: ${V.error}${K}`;
              break;
            default:
              {
                let Q = V.failReason;
                J = `Bundle upload failed: ${V.error}`;
              }
          }
          e.onBundleFail?.(J, "bundle");
          return null;
        }
        S = V.fileId;
        logEvent("tengu_teleport_bundle_mode", {
          size_bytes: V.bundleSizeBytes,
          scope: V.scope,
          has_wip: V.hasWip,
          reason: k
        });
      }
      if (logEvent("tengu_teleport_source_decision", {
        reason: k,
        path: _ ? "github" : S ? "bundle" : "empty"
      }), !_ && !S) {
        if (O) {
          let V = `The selected environment "${g?.name ?? y}" requires a git source, but no GitHub remote was detected. Check that \`git remote get-url origin\` returns a GitHub URL.`;
          logForDebugging(`[teleportToRemote] ${V} (byoc env, sourceReason=${k})`, {
            level: "error"
          });
          e.onCreateFail?.(V, "byoc_no_git_source");
          return null;
        }
        logForDebugging("[teleportToRemote] No repository detected \u2014 session will have an empty sandbox");
      }
      let {
        url: P,
        headers: F
      } = qhl("v1", i, a);
      let H = e.ultraplan ? `ultraplan: ${C}` : C;
      let U = jhl({
        initialMessage: t,
        initialMessageUuid: e.initialMessageUuid,
        permissionMode: e.permissionMode,
        ultraplan: e.ultraplan
      });
      let N = {
        title: H,
        events: U,
        session_context: {
          sources: _ ? [_] : [],
          ...(S && {
            seed_bundle_file_id: S
          }),
          outcomes: b ? [b] : [],
          model: e.model ?? getMainLoopModel(),
          ...(e.reuseOutcomeBranch && {
            reuse_outcome_branches: true
          }),
          ...(e.githubPr && {
            github_pr: e.githubPr
          }),
          ...(Object.keys(l).length > 0 && {
            environment_variables: l
          }),
          ...(e.appendSystemPrompt && {
            append_system_prompt: e.appendSystemPrompt
          }),
          ...(e.outputSchema && {
            output_schema: e.outputSchema
          }),
          ...(e.correlationId && {
            correlation_id: e.correlationId
          })
        },
        ...B6t(y),
        ...(e.tags && {
          tags: e.tags
        })
      };
      logForDebugging(`Creating session with payload: ${De(N, null, 2)}`);
      logForDebugging("[teleport] phase: POST-sent");
      let W = await NP.post(P, N, {
        headers: F,
        signal: n,
        validateStatus: V => V < 500
      });
      if (logForDebugging(`[teleport] phase: POST-response status=${W.status}`), !(W.status === 200 || W.status === 201)) {
        let V = `API request failed with status ${W.status}: ${W.statusText}

Response data: ${De(W.data, null, 2)}`;
        let K = W.data;
        let J = K?.error?.type;
        let Q = K?.error?.reason;
        let Z = K?.error?.message;
        let ne = _ ? parseGitRemote(_.url) : null;
        let oe = ne ? `${ne.owner}/${ne.name}` : S ? "a seed bundle (no git source)" : _?.url ?? "no source";
        let ee = ne !== null && ef(ne.host) && ne.owner.toLowerCase() === "anthropics" && ne.name.toLowerCase() === "anthropic";
        let re = toServerErrorReason(Q);
        let se = typeof Z === "string" && Z.includes("source repository configuration is not permitted for this environment") || re === "monorepo_source_required" || re === "monorepo_env_required" || W.status === 400 && !Q && J === "invalid_request_error" && !O && _ !== null && !S && ee && typeof Z === "string" && /^the request was invalid\.?$/i.test(Z);
        if ([401, 403, 429].includes(W.status) || Q === "github_repo_access_denied" || se) {
          logForDebugging(V, {
            level: "error"
          });
        } else {
          let be = fe => fe && /^[a-z][a-z0-9_]*$/.test(fe) ? fe : undefined;
          Oe(Error(`[type=${be(J)},reason=${be(Q)},isByocEnv=${O},sentMonorepo=${ee}] ${V}`));
        }
        let ae = Z || `${W.status} ${W.statusText || ""}`.trim();
        if (se) {
          ae = ee ? `The source anthropics/anthropic requires a monorepo environment, but "${g?.name ?? y}" was selected. Configure a monorepo environment, or run from a different repository.` : `The selected environment "${g?.name ?? y}" only accepts the Anthropic monorepo (anthropics/anthropic), but the source was ${oe}. Run this from a monorepo checkout, or select a different environment.`;
        }
        let de = e.sessionGroupingId && KPo(e.sessionGroupingId, K?.error);
        e.onCreateFail?.(de || ae, "create_request_failed", {
          status: W.status,
          serverType: toServerErrorType(J),
          serverReason: re,
          endpoint: "v1"
        });
        return null;
      }
      let z = Whl("v1", W.data);
      if (!z || typeof z.id !== "string") {
        Oe($o(Error(`Cannot determine session ID from API response: ${De(W.data)}`), "CreateSession response missing session id"));
        e.onCreateFail?.("Server returned a malformed session response (no session id)", "malformed_response");
        return null;
      }
      logForDebugging(`Successfully created remote session: ${z.id}`);
      Hhl(z.id, e.source, {
        project: _ !== null && k !== "github_preflight_failed",
        global: S === null
      }, {
        endpoint: "v1",
        grouped: e.sessionGroupingId != null
      });
      return {
        id: z.id,
        title: z.title || H
      };
    } catch (s) {
      let i = sr(s);
      if (mg(s) || NP.isCancel(s)) {
        logForDebugging(`Remote session create aborted: ${i.message}`);
        return null;
      }
      let a = M_(s);
      if (a) {
        logForDebugging(`Remote session create failed (network): ${i.message}`, {
          level: "error"
        });
      } else {
        Oe($o(sr(i), "Remote session create failed"));
      }
      e.onCreateFail?.(`Cloud session create failed: ${i.message}`, a ? "network_error" : "exception");
      return null;
    }
  }
  async function archiveRemoteSession(e, t = 1e4) {
    if (!isFirstPartyProvider()) {
      logForDebugging(`[archiveRemoteSession] ${e} skipped: non-first-party provider`);
      return false;
    }
    let n = lXn();
    if (!n) {
      return false;
    }
    let r = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/archive`;
    try {
      let o = await NP.post(r, {}, {
        headers: getOAuthHeaders(n),
        timeout: t,
        validateStatus: s => s < 500
      });
      if (o.status === 200 || o.status === 409) {
        logForDebugging(`[archiveRemoteSession] archived ${e}`);
        return true;
      }
      logForDebugging(`[archiveRemoteSession] ${e} failed ${o.status}: ${De(o.data)}`);
      return false;
    } catch (o) {
      logForDebugging(`[archiveRemoteSession] ${e} failed: ${he(o)}`, {
        level: "error"
      });
      return false;
    }
  }
  async function interruptRemoteSession(e, t = 1e4) {
    if (!isFirstPartyProvider()) {
      logForDebugging(`[interruptRemoteSession] ${e} skipped: non-first-party provider`);
      return false;
    }
    let n = lXn();
    if (!n) {
      return false;
    }
    try {
      let r = toCompatSessionId(e);
      if (!/^session_[A-Za-z0-9_-]+$/.test(r)) {
        return false;
      }
      let o = await getOrganizationUUID();
      if (!o) {
        return false;
      }
      let {
        url: s,
        body: i
      } = v5n(getOauthConfig().BASE_API_URL, r, [{
        type: "control_request",
        request_id: Ize.randomUUID(),
        request: {
          subtype: "interrupt"
        },
        uuid: Ize.randomUUID()
      }], isCcrV2SendEventsEnabled());
      let a = await getTrustedDeviceToken();
      let l = await NP.post(s, i, {
        headers: {
          ...getOAuthHeaders(n),
          "anthropic-beta": "ccr-byoc-2025-07-29",
          "x-organization-uuid": o,
          ...(a && {
            "X-Trusted-Device-Token": a
          })
        },
        timeout: t,
        validateStatus: c => c < 500
      });
      if (l.status >= 200 && l.status < 300) {
        logForDebugging(`[interruptRemoteSession] interrupted ${e}`);
        return true;
      }
      logForDebugging(`[interruptRemoteSession] ${e} failed ${l.status}: ${De(l.data)}`);
      return false;
    } catch (r) {
      logForDebugging(`[interruptRemoteSession] ${e} failed: ${he(r)}`, {
        level: "error"
      });
      return false;
    }
  }
  function subscribeRemoteSessionToPR(e, t, n) {
    return F6t("subscribe", e, t, n, getOauthConfig().BASE_API_URL, () => getClaudeAIOAuthTokens()?.accessToken, getTrustedDeviceToken);
  }
  var Ize;
  var iXn;
  var Hym = `You are coming up with a succinct title and git branch name for a coding session based on the provided description. The title should be clear, concise, and accurately reflect the content of the coding task.
You should keep it short and simple, ideally no more than 6 words. Avoid using jargon or overly technical terms unless absolutely necessary. The title should be easy to understand for anyone reading it.
Use sentence case for the title (capitalize only the first word and proper nouns), not Title Case.

The branch name should be clear, concise, and accurately reflect the content of the coding task.
You should keep it short and simple, ideally no more than 4 words. The branch should always start with "claude/" and should be all lower case, with words separated by dashes.

Return a JSON object with "title" and "branch" fields.

Example 1: {"title": "Fix login button not working on mobile", "branch": "claude/fix-mobile-login-button"}
Example 2: {"title": "Update README with installation instructions", "branch": "claude/update-readme"}
Example 3: {"title": "Improve performance of data processing script", "branch": "claude/improve-data-processing"}

Here is the session description:
<description>{description}</description>
Please generate a title and branch name for this session.`;
  var FM = __lazy(() => {
    E7();
    Dp();
    at();
    $n();
    Ot();
    Kc();
    Ox();
    gwo();
    U6t();
    CQ();
    OPo();
    Uc();
    C9();
    B_();
    aE();
    YJn();
    qP();
    _3();
    UV();
    _h();
    no();
    Twn();
    UNe();
    Pme();
    vo();
    je();
    bI();
    gn();
    dt();
    ji();
    llt();
    cs();
    na();
    fk();
    Gd();
    Rn();
    ro();
    Eo();
    Ds();
    MGe();
    fa();
    NC();
    nXn();
    Ppe();
    XPo();
    Ize = require("crypto");
    iXn = __toESM(ie(), 1);
  });
  function Xym(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function Qym(e) {
    return typeof e === "string" && e.trim() !== "";
  }
  function PKt(e) {
    if (!Xym(e)) {
      return null;
    }
    let t = [];
    let n = {
      ...e
    };
    let r = [[Yym, "taskId"], [Jym, "activeForm"]];
    for (let [o, s] of r) {
      for (let i of o) {
        if (i in n && !(s in n) && Qym(n[i])) {
          n[s] = n[i];
          delete n[i];
          t.push(`alias_${i}`);
        }
      }
    }
    if (t.length === 0) {
      return null;
    }
    return {
      input: n,
      shapeClass: t.join("+")
    };
  }
  var Yym;
  var Jym;
  var oOo = __lazy(() => {
    Yym = ["id", "task_id"];
    Jym = ["active_form"];
  });
  var Zym;
  var e_m;
  var iLe;
  var cXn = __lazy(() => {
    Zym = we(() => v.enum(["pending", "in_progress", "completed"]));
    e_m = we(() => v.object({
      content: v.string().min(1, "Content cannot be empty"),
      status: Zym(),
      activeForm: v.string().min(1, "Active form cannot be empty")
    }));
    iLe = we(() => v.array(e_m()));
  });
  function Vhl(e) {
    let t = i_m(e);
    if (t.length > 0) {
      return t;
    }
    return n_m(e);
  }
  function n_m(e) {
    let t = e.findLast(o => o.type === "assistant" && !o.parent_tool_use_id && o.message.content.some(s => s.type === "tool_use" && s.name === "TodoWrite"));
    if (!t) {
      return [];
    }
    let n = t.message.content.find(o => o.type === "tool_use" && o.name === "TodoWrite")?.input;
    if (!n) {
      return [];
    }
    let r = t_m().safeParse(n);
    if (!r.success) {
      return [];
    }
    return r.data.todos;
  }
  function i_m(e) {
    let t = new Map();
    let n = new Map();
    for (let r of e) {
      if (r.type === "assistant") {
        if (r.parent_tool_use_id) {
          continue;
        }
        for (let o of r.message.content) {
          if (o.type !== "tool_use") {
            continue;
          }
          if (o.name === "TaskCreate") {
            let s = o_m().safeParse(o.input);
            if (!s.success) {
              continue;
            }
            t.set(o.id, {
              content: s.data.subject,
              activeForm: s.data.activeForm ?? s.data.subject,
              status: "pending"
            });
          } else if (o.name === "TaskUpdate") {
            let s = PKt(o.input);
            let i = s_m().safeParse(s?.input ?? o.input);
            if (!i.success) {
              continue;
            }
            let {
              taskId: a,
              status: l,
              subject: c,
              activeForm: u
            } = i.data;
            if (l === "deleted") {
              n.delete(a);
              continue;
            }
            let d = n.get(a);
            n.set(a, {
              content: c ?? d?.content ?? a,
              activeForm: u ?? d?.activeForm ?? c ?? a,
              status: l ?? d?.status ?? "pending"
            });
          }
        }
      } else if (r.type === "user") {
        let o = r.message.content;
        if (typeof o === "string") {
          continue;
        }
        for (let s of o) {
          if (s.type !== "tool_result") {
            continue;
          }
          let i = t.get(s.tool_use_id);
          if (!i) {
            continue;
          }
          if (s.is_error) {
            t.delete(s.tool_use_id);
            continue;
          }
          let a = "";
          if (typeof s.content === "string") {
            a = s.content;
          } else if (Array.isArray(s.content)) {
            a = Tl(s.content);
          }
          let l = a.match(r_m)?.[1];
          if (!l) {
            continue;
          }
          if (t.delete(s.tool_use_id), !n.vZc(l)) {
            n.set(l, i);
          }
        }
      }
    }
    return [...n.values(), ...t.values()];
  }
  var t_m;
  var r_m;
  var o_m;
  var s_m;
  var zhl = __lazy(() => {
    oOo();
    ro();
    cXn();
    t_m = we(() => v.object({
      todos: iLe()
    }));
    r_m = /^Task #(\S+) created successfully/;
    o_m = we(() => v.object({
      subject: v.string(),
      activeForm: v.string().optional()
    }));
    s_m = we(() => v.object({
      taskId: v.string(),
      status: v.enum(["pending", "in_progress", "completed", "deleted"]).optional(),
      subject: v.string().optional(),
      activeForm: v.string().optional()
    }));
  });
  function Khl(e) {
    let t = e.findIndex(i => i.type === "system" && i.subtype === "task_notification" && i.status !== undefined && typeof i.task_id === "string" && i.task_id.startsWith("w"));
    if (t === -1) {
      return null;
    }
    let n = -1;
    let r = -1;
    let o = 0;
    for (let i = 0; i < e.length; i++) {
      if (e[i].type === "result") {
        if (n === -1) {
          n = i;
        }
        r = i;
        o++;
      }
    }
    if (r <= t) {
      return null;
    }
    for (let i = r - 1; i > t; i--) {
      let a = e[i];
      if (a.type === "assistant") {
        let l = a.message.content.filter(c => c.type === "text").map(c => "text" in c ? c.text : "").join(`
`).trim();
        if (l) {
          return l;
        }
      }
    }
    if (t < n && o < 2) {
      return null;
    }
    let s = e[t];
    return s.type === "system" && s.subtype === "task_notification" ? s.summary ?? "Remote dynamic workflow completed" : "Remote dynamic workflow completed";
  }
  function l_m(e) {
    return a_m.includes(e ?? "");
  }
  async function u_m(e) {
    try {
      await writeRemoteAgentMetadata(e.taskId, e);
    } catch (t) {
      logForDebugging(`persistRemoteAgentMetadata failed: ${String(t)}`);
    }
  }
  async function kve(e) {
    try {
      await deleteRemoteAgentMetadata(e);
    } catch (t) {
      logForDebugging(`removeRemoteAgentMetadata failed: ${String(t)}`);
    }
  }
  async function Dme({
    allowBundle: e = false,
    cwd: t
  } = {}) {
    let n = await x8a({
      allowBundle: e,
      cwd: t
    });
    if (n.length > 0) {
      return {
        eligible: false,
        errors: n
      };
    }
    return {
      eligible: true
    };
  }
  function Ese(e) {
    switch (e.type) {
      case "not_logged_in":
        return "Please run /login and sign in with your Claude.ai account (not Console).";
      case "not_in_git_repo":
        return `Cloud agents require a git repository (checked: ${e.cwd}). Initialize git or run from a git repository.`;
      case "no_git_remote":
        return "Cloud agents require a GitHub remote. Add one with `git remote add origin REPO_URL`.";
      case "github_app_not_installed":
        return `The Claude GitHub app must be installed on this repository first.
${"https://github.com/apps/claude/installations/new"}`;
      case "policy_blocked":
        return "Cloud sessions are disabled by your organization's policy. Contact your organization admin to enable them.";
    }
  }
  function sOo(e, t, n, r, o) {
    if (!aOo(e, r)) {
      return;
    }
    if (n === "completed") {
      Pe("task_remote_agent");
    } else if (n === "failed") {
      Ae("task_remote_agent", "task_remote_agent_failed");
    }
    let s = n === "completed" ? "completed successfully" : n === "failed" ? "failed" : "was stopped";
    let i = o ? `
<${"tool-use-id"}>${o}</${"tool-use-id"}>` : "";
    let a = getTaskOutputPath(e);
    let l = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>${i}
<${"task-type"}>remote_agent</${"task-type"}>
<${"output-file"}>${a}</${"output-file"}>
<${"status"}>${n}</${"status"}>
<${"summary"}>Remote task "${t}" ${s}</${"summary"}>
</${"task-notification"}>`;
    ud({
      value: l,
      mode: "task-notification",
      agentId: mainAgentId(),
      priority: "next"
    });
  }
  function aOo(e, t) {
    let n = false;
    t.update(e, r => {
      if (r.notified) {
        return r;
      }
      n = true;
      return {
        ...r,
        notified: true
      };
    });
    return n;
  }
  function d_m(e) {
    for (let o = e.length - 1; o >= 0; o--) {
      let s = e[o];
      if (s?.type === "system" && (s.subtype === "hook_progress" || s.subtype === "hook_response")) {
        let i = Nl(s.stdout, "remote-review");
        if (i?.trim()) {
          return i.trim();
        }
      }
    }
    for (let o = e.length - 1; o >= 0; o--) {
      let s = e[o];
      if (s?.type !== "assistant") {
        continue;
      }
      let i = Tl(s.message.content, `
`);
      let a = Nl(i, "remote-review");
      if (a?.trim()) {
        return a.trim();
      }
    }
    let t = e.filter(o => o.type === "system" && (o.subtype === "hook_progress" || o.subtype === "hook_response")).map(o => o.stdout).join("");
    let n = Nl(t, "remote-review");
    if (n?.trim()) {
      return n.trim();
    }
    return e.filter(o => o.type === "assistant").map(o => Tl(o.message.content, `
`)).join(`
`).trim() || null;
  }
  function uXn(e) {
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (o?.type === "system" && (o.subtype === "hook_progress" || o.subtype === "hook_response")) {
        let s = Nl(o.stdout, "remote-review");
        if (s?.trim()) {
          return s.trim();
        }
      }
    }
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (o?.type !== "assistant") {
        continue;
      }
      let s = Tl(o.message.content, `
`);
      let i = Nl(s, "remote-review");
      if (i?.trim()) {
        return i.trim();
      }
    }
    let t = e.filter(r => r.type === "system" && (r.subtype === "hook_progress" || r.subtype === "hook_response")).map(r => r.stdout).join("");
    let n = Nl(t, "remote-review");
    if (n?.trim()) {
      return n.trim();
    }
    return null;
  }
  function p_m(e) {
    try {
      let t = qt(e);
      if (t && typeof t === "object" && !Array.isArray(t)) {
        let n = t.error;
        if (typeof n === "string") {
          return n;
        }
      }
    } catch {}
    return null;
  }
  function lOo(e) {
    try {
      let t = qt(e);
      return Array.isArray(t) ? t.length : undefined;
    } catch {
      return;
    }
  }
  function m_m(e, t, n, r) {
    if (!aOo(e, n)) {
      return;
    }
    let o = lOo(t);
    Pe("task_remote_agent", {
      remote_task_type: "ultrareview",
      ...(o !== undefined && {
        findings_count: o
      })
    });
    let i = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>
<${"task-type"}>remote_agent</${"task-type"}>
<${"status"}>completed</${"status"}>
<${"summary"}>Cloud review completed</${"summary"}>
</${"task-notification"}>
The cloud review produced the following findings:

${t}${r ? `

The user launched this review with --fix: apply these findings to the local working tree now. Skip findings that are wrong or not worth fixing, and run the relevant checks after.` : ""}`;
    ud({
      value: i,
      mode: "task-notification",
      agentId: mainAgentId(),
      priority: "next"
    });
  }
  function Yhl(e, t, n, r) {
    if (!aOo(e, n)) {
      return;
    }
    Ae("task_remote_agent", "task_remote_agent_review_failed", {
      remote_task_type: "ultrareview",
      reason: t
    });
    let o = r ? `: ${r.replace(/[<>]/g, "").slice(0, 200)}` : "";
    let s = iOo[t] + o;
    let i = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>
<${"task-type"}>remote_agent</${"task-type"}>
<${"status"}>failed</${"status"}>
<${"summary"}>Cloud review failed: ${s}</${"summary"}>
</${"task-notification"}>
Cloud review did not produce output (${s}). Tell the user to retry /code-review ultra, or use /review for a local review instead.`;
    ud({
      value: i,
      mode: "task-notification",
      agentId: mainAgentId(),
      priority: "next"
    });
  }
  function Ave(e) {
    let {
      remoteTaskType: t,
      session: n,
      command: r,
      context: o,
      toolUseId: s,
      isRemoteReview: i,
      applyFixesOnComplete: a,
      isUltraplan: l,
      isLongRunning: c,
      remoteTaskMetadata: u
    } = e;
    let d = TU("remote_agent");
    initTaskOutput(d);
    let p = {
      ...ww(d, "remote_agent", n.title, s),
      type: "remote_agent",
      remoteTaskType: t,
      status: "running",
      sessionId: n.id,
      command: r,
      title: n.title,
      todoList: [],
      log: [],
      isRemoteReview: i,
      applyFixesOnComplete: a,
      isUltraplan: l,
      isLongRunning: c,
      pollStartedAt: Date.now(),
      remoteTaskMetadata: u
    };
    o.taskRegistry.register(p);
    u_m({
      taskId: d,
      remoteTaskType: t,
      sessionId: n.id,
      title: n.title,
      command: r,
      spawnedAt: Date.now(),
      toolUseId: s,
      isUltraplan: l,
      isRemoteReview: i,
      applyFixesOnComplete: a,
      isLongRunning: c,
      remoteTaskMetadata: u
    });
    let m = Jhl(d, o);
    return {
      taskId: d,
      sessionId: n.id,
      cleanup: m
    };
  }
  async function OKt(e) {
    try {
      await vl("task_remote_agent_restore", () => f_m(e));
    } catch (t) {
      logForDebugging(`restoreRemoteAgentTasks failed: ${String(t)}`);
    }
  }
  async function f_m(e) {
    let t = await listRemoteAgentMetadata();
    if (t.length === 0) {
      return;
    }
    for (let n of t) {
      let r;
      try {
        r = (await fetchSession(n.sessionId)).session_status;
      } catch (s) {
        if (s instanceof Error && s.message.startsWith("Session not found:")) {
          logForDebugging(`restoreRemoteAgentTasks: dropping ${n.taskId} (404: ${String(s)})`);
          kve(n.taskId);
        } else {
          logForDebugging(`restoreRemoteAgentTasks: skipping ${n.taskId} (recoverable: ${String(s)})`);
        }
        continue;
      }
      if (r === "archived") {
        kve(n.taskId);
        continue;
      }
      let o = {
        ...ww(n.taskId, "remote_agent", n.title, n.toolUseId),
        type: "remote_agent",
        remoteTaskType: l_m(n.remoteTaskType) ? n.remoteTaskType : "remote-agent",
        status: "running",
        sessionId: n.sessionId,
        command: n.command,
        title: n.title,
        todoList: [],
        log: [],
        isRemoteReview: n.isRemoteReview,
        applyFixesOnComplete: n.applyFixesOnComplete,
        isUltraplan: n.isUltraplan,
        isLongRunning: n.isLongRunning,
        startTime: n.spawnedAt,
        pollStartedAt: Date.now(),
        remoteTaskMetadata: n.remoteTaskMetadata
      };
      e.taskRegistry.register(o);
      initTaskOutput(n.taskId);
      Jhl(n.taskId, e);
    }
  }
  function Jhl(e, t) {
    let n = true;
    let r = 1000;
    let o = 1800000;
    let s = 5;
    let i = 0;
    let a = null;
    let l = [];
    let c = null;
    let u = async () => {
      if (!n) {
        return;
      }
      try {
        let d = t.taskRegistry.get(e);
        if (!d || d.status !== "running") {
          return;
        }
        let p = await pollRemoteSessionEvents(d.sessionId, a);
        a = p.lastEventId;
        let m = p.newEvents.length > 0;
        if (m) {
          l = [...l, ...p.newEvents];
          let I = p.newEvents.map(O => {
            if (O.type === "assistant") {
              return O.message.content.filter(M => M.type === "text").map(M => "text" in M ? M.text : "").join(`
`);
            }
            return De(O);
          }).join(`
`);
          if (I) {
            appendTaskOutput(e, I + `
`);
          }
        }
        if (p.sessionStatus === "archived") {
          t.taskRegistry.update(e, I => I.status === "running" ? {
            ...I,
            status: "completed",
            endTime: Date.now(),
            terminal: {
              summary: d.title
            }
          } : I);
          sOo(e, d.title, "completed", t.taskRegistry, d.toolUseId);
          evictTaskOutput(e);
          kve(e);
          return;
        }
        let f = d.remoteTaskType === "remote-workflow" ? async () => Khl(l) : c_m.get(d.remoteTaskType);
        if (f) {
          let I = await f(d.remoteTaskMetadata);
          if (I !== null) {
            t.taskRegistry.update(e, O => O.status === "running" ? {
              ...O,
              status: "completed",
              endTime: Date.now(),
              terminal: {
                summary: I
              }
            } : O);
            sOo(e, I, "completed", t.taskRegistry, d.toolUseId);
            evictTaskOutput(e);
            kve(e);
            return;
          }
        }
        let h = d.isUltraplan || d.isLongRunning || f ? undefined : l.findLast(I => I.type === "result");
        if (d.isRemoteReview && m && c === null) {
          c = uXn(p.newEvents);
        }
        let g;
        if (d.isRemoteReview && m) {
          let I = `<${"remote-review-progress"}>`;
          let O = `</${"remote-review-progress"}>`;
          for (let M of p.newEvents) {
            if (M.type === "system" && (M.subtype === "hook_progress" || M.subtype === "hook_response")) {
              let L = M.stdout;
              let P = L.lastIndexOf(O);
              let F = P === -1 ? -1 : L.lastIndexOf(I, P);
              if (F !== -1 && P > F) {
                try {
                  let H = qt(L.slice(F + I.length, P));
                  g = {
                    stage: H.stage,
                    bugsFound: H.bugs_found ?? 0,
                    bugsVerified: H.bugs_verified ?? 0,
                    bugsRefuted: H.bugs_refuted ?? 0
                  };
                } catch {}
              }
            }
          }
        }
        let y = l.some(I => I.type === "assistant" || d.isRemoteReview && I.type === "system" && (I.subtype === "hook_progress" || I.subtype === "hook_response"));
        if (p.sessionStatus === "idle" && !m && y) {
          i++;
        } else {
          i = 0;
        }
        let _ = i >= s;
        let b = l.some(I => I.type === "system" && (I.subtype === "hook_started" || I.subtype === "hook_progress" || I.subtype === "hook_response") && I.hook_event === "SessionStart");
        let S = l.some(I => I.type === "assistant");
        let E = d.isRemoteReview && (c !== null || !b && _ && S);
        let C = d.isRemoteReview && Date.now() - d.pollStartedAt > o;
        let x = h ? h.subtype === "success" ? "completed" : "failed" : E || C ? "completed" : l.length > 0 ? "running" : "starting";
        let A = false;
        let k = d.isRemoteReview && (h || E || C);
        if (t.taskRegistry.update(e, I => {
          if (I.status !== "running") {
            A = true;
            return I;
          }
          if (!m && (x === "running" || x === "starting")) {
            return I;
          }
          return {
            ...I,
            status: x === "starting" || k ? "running" : x,
            log: l,
            todoList: m ? Vhl(l) : I.todoList,
            reviewProgress: g ?? I.reviewProgress,
            endTime: h || E || C ? Date.now() : undefined
          };
        }), A) {
          return;
        }
        if (h || E || C) {
          let I = h && h.subtype !== "success" ? "failed" : "completed";
          if (d.isRemoteReview) {
            let O = c ?? d_m(l);
            let M = O ? p_m(O) : null;
            if (O && I === "completed" && M === null) {
              t.taskRegistry.update(e, P => ({
                ...P,
                status: "completed",
                terminal: {
                  summary: "Cloud review completed"
                }
              }));
              m_m(e, O, t.taskRegistry, d.applyFixesOnComplete);
              evictTaskOutput(e);
              kve(e);
              return;
            }
            let L = M !== null ? "orchestrator_error" : h && h.subtype !== "success" ? "session_error" : C && !E ? "poll_timeout" : "no_review_output";
            t.taskRegistry.update(e, P => ({
              ...P,
              status: "failed",
              terminal: {
                summary: `Cloud review failed: ${iOo[L]}`
              }
            }));
            Yhl(e, L, t.taskRegistry, M ?? undefined);
            evictTaskOutput(e);
            kve(e);
            return;
          }
          sOo(e, d.title, I, t.taskRegistry, d.toolUseId);
          evictTaskOutput(e);
          kve(e);
          return;
        }
      } catch (d) {
        logForDebugging(`Remote session poll failed for task ${e}: ${String(d)}`, {
          level: "error"
        });
        i = 0;
        try {
          let p = t.taskRegistry.get(e);
          if (p?.isRemoteReview && p.status === "running" && Date.now() - p.pollStartedAt > o) {
            t.taskRegistry.update(e, m => ({
              ...m,
              status: "failed",
              endTime: Date.now(),
              terminal: {
                summary: `Cloud review failed: ${iOo.poll_timeout_after_api_error}`
              }
            }));
            Yhl(e, "poll_timeout_after_api_error", t.taskRegistry);
            evictTaskOutput(e);
            kve(e);
            return;
          }
        } catch {}
      }
      if (n) {
        setTimeout(u, r);
      }
    };
    u();
    return () => {
      n = false;
    };
  }
  function Mme(e) {
    return wS(e, process.env.SESSION_INGRESS_URL, {
      from: "cli"
    });
  }
  var a_m;
  var c_m;
  var iOo;
  var Oze;
  var tZ = __lazy(() => {
    at();
    U6t();
    np();
    ln();
    Ot();
    Cx();
    k8a();
    je();
    Rf();
    ro();
    fa();
    cE();
    NC();
    FM();
    zhl();
    a_m = ["remote-agent", "ultraplan", "ultrareview", "autofix-pr", "remote-workflow"];
    c_m = new Map();
    iOo = {
      session_error: "cloud session returned an error",
      poll_timeout: "cloud session exceeded 30 minutes",
      poll_timeout_after_api_error: "cloud session exceeded 30 minutes (API polls were failing)",
      no_review_output: "no review output \u2014 orchestrator may have exited early",
      orchestrator_error: "orchestrator reported an error",
      cancelled: "cancelled"
    };
    Oze = {
      name: "RemoteAgentTask",
      type: "remote_agent",
      async kill(e, t, n) {
        let r;
        let o;
        let s;
        let i = false;
        let a = false;
        let l = 0;
        let c = false;
        if (t.update(e, u => {
          if (u.status !== "running") {
            return u;
          }
          r = u.toolUseId;
          o = u.description;
          s = u.sessionId;
          i = u.isUltraplan ?? false;
          a = u.isRemoteReview ?? false;
          l = u.pollStartedAt;
          c = true;
          return {
            ...u,
            status: "killed",
            notified: true,
            endTime: Date.now()
          };
        }), c) {
          if (zu(e, "stopped", {
            toolUseId: r,
            summary: o
          }), s) {
            archiveRemoteSession(s).catch(u => logForDebugging(`RemoteAgentTask archive failed: ${String(u)}`));
          }
          if (a) {
            Ae("task_remote_agent", "task_remote_agent_review_failed", {
              remote_task_type: "ultrareview",
              reason: "cancelled"
            });
          }
          if (i) {
            logEvent("tengu_ultraplan_stopped", {
              duration_ms: Date.now() - l
            });
            n(u => u.ultraplanSessionUrl || u.ultraplanPendingChoice ? {
              ...u,
              ultraplanSessionUrl: undefined,
              ultraplanPendingChoice: undefined
            } : u);
          }
        }
        evictTaskOutput(e);
        kve(e);
        logForDebugging(`RemoteAgentTask ${e} killed, archiving session ${s ?? "unknown"}`);
      }
    };
  });
  function Xhl(e, t) {
    return `<${"agent-message"} from="${Yd(e)}">
${YDe("agent-message", t)}
</${"agent-message"}>`;
  }
  var Dze = __lazy(() => {
    np();
    wx();
  });
  var Qhl = {};