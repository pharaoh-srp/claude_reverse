  __export(OGt, {
    trackDatadogEvent: () => trackDatadogEvent,
    shutdownDatadog: () => shutdownDatadog,
    resetDatadogInit: () => resetDatadogInit,
    initializeDatadog: () => initializeDatadog,
    DATADOG_LOGS_ENDPOINT: () => "https://http-intake.logs.us5.datadoghq.com/api/v2/logs",
    DATADOG_CLIENT_TOKEN: () => "pubea5604404508cdd34afb69e6f42a05bc"
  });
  function e_c(e) {
    return e.replace(/[A-Z]/g, t => `_${t.toLowerCase()}`);
  }
  async function L7o() {
    if (Unn.length === 0) {
      return;
    }
    let e = Unn;
    Unn = [];
    try {
      await externalHttp.post("https://http-intake.logs.us5.datadoghq.com/api/v2/logs", e, {
        headers: {
          "Content-Type": "application/json",
          "DD-API-KEY": "pubea5604404508cdd34afb69e6f42a05bc"
        },
        timeout: 5000
      });
    } catch (t) {
      logForDebugging(`Failed to flush logs to Datadog: ${t}`, {
        level: "error"
      });
    }
  }
  function Xyf() {
    if (LCe) {
      return;
    }
    LCe = setTimeout(() => {
      LCe = null;
      L7o();
    }, e_f()).unref();
  }
  function resetDatadogInit() {
    initializeDatadog.cache?.clear?.();
    Bnn = null;
  }
  async function shutdownDatadog() {
    if (LCe) {
      clearTimeout(LCe);
      LCe = null;
    }
    await L7o();
  }
  async function trackDatadogEvent(e, t) {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    let n = Bnn;
    if (n === null) {
      n = await initializeDatadog();
    }
    if (!n || !Yyf.vZc(e)) {
      return;
    }
    try {
      let r = await QOn({
        model: t.model,
        betas: t.betas
      });
      let {
        envContext: o,
        head_sha: s,
        ...i
      } = r;
      let a = {
        ...i,
        ...o,
        ...t,
        userBucket: Zyf()
      };
      if (typeof a.toolName === "string" && a.toolName.startsWith("mcp__")) {
        a.toolName = "mcp";
      }
      if (typeof a.model === "string") {
        if (!a.model.toLowerCase().includes("claude")) {
          return;
        }
        let p = getCanonicalName(ca(a.model));
        a.model = p in vqe ? p : "other";
      }
      if (typeof a.version === "string") {
        a.version = a.version.replace(/^(\d+\.\d+\.\d+-dev\.\d{8})\.t\d+\.sha[a-f0-9]+$/, "$1");
      }
      if (a.status !== undefined && a.status !== null) {
        let p = String(a.status);
        a.http_status = p;
        let m = p.charAt(0);
        if (m >= "1" && m <= "5") {
          a.http_status_range = `${m}xx`;
        }
        delete a.status;
      }
      let c = a;
      let d = {
        ddsource: "nodejs",
        ddtags: [`event:${e}`, ...Jyf.filter(p => c[p] !== undefined && c[p] !== null).map(p => `${e_c(p)}:${c[p]}`)].join(","),
        message: e,
        service: "claude-code",
        hostname: "claude-code",
        env: "external"
      };
      for (let [p, m] of Object.entries(a)) {
        if (m !== undefined && m !== null) {
          d[e_c(p)] = m;
        }
      }
      if (Unn.push(d), Unn.length >= 100) {
        if (LCe) {
          clearTimeout(LCe);
          LCe = null;
        }
        L7o();
      } else {
        Xyf();
      }
    } catch (r) {
      Oe(r);
    }
  }
  function e_f() {
    return parseInt(process.env.CLAUDE_CODE_DATADOG_FLUSH_INTERVAL_MS || "", 10) || 15000;
  }
  var t_c;
  var Yyf;
  var Jyf;
  var Unn;
  var LCe = null;
  var Bnn = null;
  var initializeDatadog;
  var Zyf;
  var xJ = __lazy(() => {
    je();
    Rn();
    Tk();
    Eo();
    Ds();
    pk();
    KW();
    Gu();
    t_c = require("crypto");
    Yyf = new Set(["tengu_feature_ok", "tengu_feature_bad", "tengu_feature_sad", "chrome_bridge_connection_succeeded", "chrome_bridge_connection_failed", "chrome_bridge_disconnected", "chrome_bridge_tool_call_completed", "chrome_bridge_tool_call_error", "chrome_bridge_tool_call_started", "chrome_bridge_tool_call_timeout", "tengu_api_error", "tengu_api_fallback_last_resort", "tengu_api_success", "tengu_auto_mode_decision", "tengu_auto_mode_denial_limit_exceeded", "tengu_auto_mode_fallback_to_ask", "tengu_auto_mode_malformed_tool_input", "tengu_auto_mode_opt_in_dialog_accept", "tengu_auto_mode_opt_in_dialog_accept_default", "tengu_auto_mode_opt_in_dialog_decline", "tengu_auto_mode_opt_in_dialog_decline_dont_ask", "tengu_auto_mode_env_onboarding_accept", "tengu_auto_mode_env_onboarding_dismiss", "tengu_auto_mode_env_onboarding_later", "tengu_auto_mode_env_onboarding_shown", "tengu_auto_mode_opt_in_dialog_shown", "tengu_auto_mode_outcome", "tengu_auto_mode_subsequent_approval", "tengu_brief_mode_enabled", "tengu_brief_mode_toggled", "tengu_brief_send", "tengu_cancel", "tengu_compact_failed", "tengu_copper_lantern", "tengu_exit", "tengu_flicker", "tengu_headless_mcp_prewait", "tengu_init", "tengu_mcp_tools_refreshed_mid_turn", "tengu_model_fallback_triggered", "tengu_refusal_fallback_triggered", "tengu_refusal_fallback_prompt_shown", "tengu_refusal_fallback_prompt_choice", "tengu_refusal_fallback_setting_changed", "tengu_refusal_fallback_suppressed", "tengu_refusal_fallback_dialog_suppressed", "tengu_refusal_fallback_supersedes", "tengu_rotunda_pennant_applied", "tengu_rotunda_pennant_malformed", "tengu_rotunda_pennant_strip", "tengu_rotunda_pennant_credit_echoed", "tengu_rotunda_pennant_tools", "tengu_rotunda_pennant_chain_exhausted", "tengu_rotunda_pennant_esc", "tengu_refusal_retraction_evicted", "tengu_refusal_retraction_late_drop", "tengu_refusal_retraction_history_dropped", "tengu_refusal_retraction_orphan_tool_result", "tengu_refusal_retraction_truncation_harvest", "tengu_refusal_retraction_unauthenticated_signal", "tengu_oauth_error", "tengu_oauth_success", "tengu_oauth_token_refresh_failure", "tengu_oauth_token_refresh_success", "tengu_oauth_token_refresh_lock_acquiring", "tengu_oauth_token_refresh_lock_acquired", "tengu_oauth_token_refresh_starting", "tengu_oauth_token_refresh_completed", "tengu_oauth_token_refresh_lock_releasing", "tengu_oauth_token_refresh_lock_released", "tengu_ptl_surfaced_to_user", "tengu_query_error", "tengu_request_user_dialog_implicit_cancel", "tengu_request_user_dialog_late_answer", "tengu_request_user_dialog_requires_action", "tengu_request_user_dialog_response_ignored", "tengu_request_user_dialog_timeout", "tengu_review_remote_teleport_failed", "tengu_supported_dialog_kinds_restored", "tengu_schedule_offer_shown", "tengu_sdk_control_roundtrip", "tengu_sdk_init_handshake", "tengu_sdk_mcp_false_unavailable", "tengu_sdk_result", "tengu_sdk_schema_violation", "tengu_sdk_session_crash", "tengu_sdk_stall", "tengu_sdk_ttft", "tengu_session_file_read", "tengu_started", "tengu_tool_use_error", "tengu_tool_use_granted_in_prompt_permanent", "tengu_transcript_write_failed", "tengu_tool_use_granted_in_prompt_temporary", "tengu_tool_use_rejected_in_prompt", "tengu_tool_use_success", "tengu_bash_tool_command_executed", "tengu_bash_tool_command_failed", "tengu_uncaught_exception", "tengu_uncaught_exception_loop", "tengu_unhandled_rejection", "tengu_voice_recording_started", "tengu_voice_toggled", "tengu_vscode_sdk_stream_ended_no_result", "tengu_team_mem_sync_pull", "tengu_team_mem_sync_push", "tengu_team_mem_sync_started", "tengu_team_mem_entries_capped", "tengu_timer", "tengu_bg_adopt", "tengu_bg_agent_action", "tengu_bg_agent_dispatch", "tengu_bg_agent_terminal", "tengu_bg_attach", "tengu_bg_attach_first_frame", "tengu_bg_attach_legacy_autorespawn", "tengu_bg_attach_outcome", "tengu_bg_classify", "tengu_bg_daemon_cold_start_ask", "tengu_bg_daemon_cold_start_ask_answer", "tengu_bg_daemon_install", "tengu_bg_daemon_service_poll_fallthrough", "tengu_bg_daemon_service_stale_exec", "tengu_bg_daemon_spawn_failed", "tengu_bg_daemon_wmi_fallback", "tengu_bg_daemon_zombie_false_positive", "tengu_bg_daemon_zombie_restart", "tengu_bg_dispatch", "tengu_bg_dispatch_fallback", "tengu_bg_dispatch_low_mem", "tengu_bg_dispatch_rescued", "tengu_bg_dispatch_sigkill_escalate", "tengu_bg_dispatch_stale_drop", "tengu_bg_exec_no_lastline", "tengu_bg_killjob_ctrl_fallback", "tengu_bg_orphan_reap", "tengu_bg_proto_mismatch", "tengu_bg_pty_unavailable", "tengu_bg_respawn", "tengu_bg_respawn_exhausted", "tengu_bg_respawn_stale", "tengu_bg_respawn_unconfirmed_bail", "tengu_bg_retired", "tengu_bg_roster_parse_failed", "tengu_bg_skew_nudge", "tengu_bg_spare_claim", "tengu_bg_spare_claim_fail", "tengu_bg_spare_spawn", "tengu_bg_worker_exit", "tengu_bg_worker_spawn", "tengu_daemon_cold_start_prompt", "tengu_daemon_config_reload", "tengu_daemon_exit", "tengu_daemon_idle_exit", "tengu_daemon_install_prompt_answer", "tengu_daemon_lease", "tengu_daemon_peer_uid_reject", "tengu_daemon_self_restart_on_upgrade", "tengu_daemon_start", "tengu_daemon_startup_crash", "tengu_daemon_worker_crash", "tengu_daemon_worker_permanent_exit", "tengu_daemon_yield", "tengu_daemon_yield_takeover"]);
    Jyf = ["arch", "classifierModel", "classifierStage", "clientType", "decision", "entrypoint", "errorKind", "errorType", "failureKind", "fastPath", "sessionKind", "http_status_range", "http_status", "model", "op", "outcome", "platform", "provider", "reason", "coachMode", "server_reason", "server_type", "source", "subscriptionType", "toolName", "userBucket", "userType", "version", "versionBase", ...[]];
    Unn = [];
    initializeDatadog = TEr(async () => {
      if (Jj() || lji()) {
        Bnn = false;
        return false;
      }
      try {
        Bnn = true;
        return true;
      } catch (e) {
        Oe(e);
        Bnn = false;
        return false;
      }
    });
    Zyf = TEr(() => {
      let e = getOrCreateUserID();
      let t = t_c.createHash("sha256").update(e).digest("hex");
      return parseInt(t.slice(0, 8), 16) % 30;
    });
  });
  var eEo = {};