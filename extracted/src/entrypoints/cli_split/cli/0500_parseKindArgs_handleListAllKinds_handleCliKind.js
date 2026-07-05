  __export(fXc, {
    agentsCommandHandler: () => agentsCommandHandler
  });
  async function agentsCommandHandler(e) {
    if (e.json) {
      if (await ensureFleetGateHydrated(), !isAgentsFleetEnabled()) {
        fleetGateRejected("claude agents --json", undefined);
        return;
      }
      let {
        printAgentsJson: t
      } = await Promise.resolve().then(() => (dXc(), uXc));
      await t(e.cwd, e.all === true);
      W0();
    }
    if (process.stdout.isTTY) {
      if (await ensureFleetGateHydrated(), isAgentsFleetEnabled()) {
        let t = consumeAgentViewRelaunchMarker();
        logEvent("tengu_fleetview", {
          viaCommander: true,
          relaunch: t
        });
        let [{
          mountFleetViewWithComposerBack: n
        }, {
          applyFleetViewHostWindowsEnv: r
        }, {
          createRoot: o
        }, {
          getBaseRenderOptions: s
        }] = await Promise.all([Promise.resolve().then(() => (Non(), Mon)), Promise.resolve().then(() => (wxt(), xon)), Promise.resolve().then(() => (et(), fG)), Promise.resolve().then(() => (Qoe(), p6n))]);
        let {
          config: i
        } = Tan(process.argv.slice(2));
        r();
        Promise.resolve().then(() => (ron(), xgr)).then(f => f.startBackgroundHousekeeping());
        let a = {
          permissionMode: e.dangerouslySkipPermissions ? "bypassPermissions" : e.permissionMode,
          model: e.model,
          effort: e.effort,
          agent: e.agent,
          allowBypass: e.allowDangerouslySkipPermissions
        };
        let {
          refuseBypassUnderRoot: l,
          applyBypassPolicyGate: c,
          ensureAgentsBypassConsent: u
        } = await Promise.resolve().then(() => (iis(), sis));
        l(a);
        let d = c(a);
        let p = await o(s(false));
        await u(p, d);
        let m = {
          cwdFilter: e.cwd,
          dispatchExtraArgs: FQe(LQe(i, mXc.resolve)),
          dispatchDefaults: d
        };
        await n(p, m);
        await gracefulShutdown(0, "other", {
          suppressResumeHint: true
        });
        return;
      }
    }
    fleetGateRejected("claude agents", process.stdout.isTTY ? undefined : "requires an interactive terminal (stdout is not a TTY) \u2014 use 'claude agents --json' for a machine-readable listing");
  }
  var mXc;
  var hXc = __lazy(() => {
    Ot();
    lm();
    uT();
    SL();
    mXc = require("path");
  });
  var yXc = {};
  __export(yXc, {
    ultrareviewHandler: () => ultrareviewHandler
  });
  async function ultrareviewHandler(e, t) {
    let n = () => process.exit(130);
    process.once("SIGINT", n);
    await waitForPolicyLimitsToLoad();
    let r = policyDeniedReason("allow_remote_sessions", "Cloud sessions", "are");
    if (r) {
      if (policyDenyKind("allow_remote_sessions") === "cache_miss") {
        await GB("cli_ultrareview", "policy_cache_miss");
      } else {
        await ou("cli_ultrareview", "policy_disallowed");
      }
      return Ih(r);
    }
    await initializeGrowthBook().catch(() => {});
    let o = Number(t.timeout);
    let s = Number.isFinite(o) && o > 0 ? o : 30;
    let i = createAbortController();
    let a = await runUltrareviewHeadless(e, {
      confirm: true,
      skipTaskRegistration: true,
      invocation: "claude ultrareview",
      context: {
        abortController: i,
        taskRegistry: oht
      }
    });
    if (a.status !== "launched") {
      let m = a.status === "blocked" && a.actionUrl ? `
  \u2192 ${a.actionUrl}` : "";
      await ou("cli_ultrareview", "cli_ultrareview_launch_failed");
      return Ih(`Ultrareview could not launch: ${"message" in a ? a.message : a.body}${m}`);
    }
    kin(a.message);
    kin(`View live progress in the browser: ${a.sessionUrl}`);
    kin(`Waiting for findings (${getReviewDurationNote()})\u2026`);
    process.removeListener("SIGINT", n);
    process.once("SIGINT", () => {
      kin(`
Cancelled. The remote review is still running \u2014 view it at ${a.sessionUrl}`);
      process.exit(130);
    });
    let l;
    try {
      l = await S8f(a.sessionId, i.signal, s * 60 * 1000);
    } catch (m) {
      await ou("cli_ultrareview", "cli_ultrareview_poll_failed", {
        reason: m instanceof Ain ? m.reason : "poll_unknown"
      });
      return Ih(`Ultrareview failed: ${he(m)}
Session: ${a.sessionUrl}`);
    }
    let c = b8f(l);
    let u = c === "cloud session was archived before producing output" ? "session_archived" : "orchestrator_error";
    let d = lOo(l);
    let p = d !== undefined ? {
      findings_count: d
    } : undefined;
    if (t.json) {
      if (await F5(l + `
`), c) {
        await ou("cli_ultrareview", "cli_ultrareview_remote_error", {
          reason: u
        });
      } else {
        await nS("cli_ultrareview", p);
      }
      return bR(c ? 1 : 0);
    }
    if (c) {
      await ou("cli_ultrareview", "cli_ultrareview_remote_error", {
        reason: u
      });
      return Ih(`Review failed: ${c}
Session: ${a.sessionUrl}`);
    }
    await F5(E8f(l) + `
`);
    await nS("cli_ultrareview", p);
    return bR(0);
  }
  function b8f(e) {
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
  async function S8f(e, t, n) {
    let r = Date.now() + n;
    let o = null;
    let s = 0;
    let i = [];
    let a = "";
    while (Date.now() < r) {
      if (t.aborted) {
        throw Error("aborted");
      }
      try {
        let l = await pollRemoteSessionEvents(e, o);
        if (o = l.lastEventId, s = 0, l.sessionStatus === "archived") {
          if (l.newEvents.length > 0) {
            i.push(...l.newEvents);
          }
          return uXn(i) ?? `{"error":"${"cloud session was archived before producing output"}"}`;
        }
        if (l.newEvents.length > 0) {
          i.push(...l.newEvents);
          for (let u of l.newEvents) {
            if (u.type === "system" && (u.subtype === "hook_progress" || u.subtype === "hook_response")) {
              let d = T8f(u.stdout);
              if (d && d !== a) {
                a = d;
                kin(`  ${d}`);
              }
            }
          }
          let c = uXn(i);
          if (c) {
            return c;
          }
        }
      } catch (l) {
        if (t.aborted) {
          throw l;
        }
        if (!isTransientNetworkError(l)) {
          throw new Ain("poll_api_error", he(l));
        }
        if (++s >= 5) {
          throw new Ain("poll_connection_lost", "lost connection to the cloud session after repeated retries");
        }
      }
      await sleep(3000, t);
    }
    throw new Ain("poll_timeout", `cloud session exceeded ${Math.round(n / 60000)} minutes`);
  }
  function T8f(e) {
    let t = `<${"remote-review-progress"}>`;
    let n = `</${"remote-review-progress"}>`;
    let r = e.lastIndexOf(n);
    let o = r === -1 ? -1 : e.lastIndexOf(t, r);
    if (o === -1 || r <= o) {
      return null;
    }
    try {
      let s = qt(e.slice(o + t.length, r));
      let i = s.stage ?? "running";
      let a = s.bugs_found ?? 0;
      let l = s.bugs_verified ?? 0;
      let c = s.bugs_refuted ?? 0;
      return `${i} \u2014 ${a} found, ${l} verified, ${c} refuted`;
    } catch {
      return null;
    }
  }
  function E8f(e) {
    let t;
    try {
      t = qt(e);
    } catch {
      return e;
    }
    if (!Array.isArray(t) || t.length === 0) {
      return "Review complete \u2014 no findings.";
    }
    let n = t;
    let r = n.length;
    let o = [_$u.bold(`Review complete \u2014 ${r} ${un(r, "finding")}`), ""];
    for (let s of n) {
      let i = y8f[s.severity ?? "normal"] ?? "\uD83D\uDD34";
      let a = s.file_path ?? "?";
      let l = s.start_line ?? 0;
      let c = s.end_line ?? l;
      let u = l === c ? `${a}:${l}` : `${a}:${l}-${c}`;
      let d = (s.pr_comment ?? "").trim();
      let p = d.indexOf(`

`);
      let m = p === -1 ? d : d.slice(0, p);
      let f = p === -1 ? "" : d.slice(p + 2);
      if (o.push(`${i} ${_$u.bold(u)}`), m) {
        o.push(m);
      }
      if (f) {
        o.push("");
        o.push(f);
      }
      o.push("");
    }
    return o.join(`
`).trimEnd();
  }
  function kin(e) {
    process.stderr.write(_$u.dim(e) + `
`);
  }
  var Ain;
  var y8f;
  var _Xc = __lazy(() => {
    Jwt();
    bLe();
    np();
    ln();
    $n();
    q$();
    Kc();
    tZ();
    Kp();
    dt();
    Zn();
    _5t();
    NC();
    FM();
    SL();
    Ain = class Ain extends Error {
      reason;
      constructor(e, t) {
        super(t);
        this.reason = e;
        this.name = "PollFailure";
      }
    };
    y8f = {
      normal: "\uD83D\uDD34",
      nit: "\uD83D\uDFE1",
      pre_existing: "\uD83D\uDFE3"
    };
  });
  var KSr = {};
  __export(KSr, {
    autoModeDefaultsHandler: () => autoModeDefaultsHandler,
    autoModeCritiqueHandler: () => autoModeCritiqueHandler,
    autoModeConfigHandler: () => autoModeConfigHandler
  });
  async function bXc(e, t) {
    e.render(SRe.jsx(Q_, {
      children: SRe.jsx(Text, {
        children: De(t, null, 2)
      })
    }));
    await e.waitUntilExit();
  }
  async function autoModeDefaultsHandler(e) {
    Pe("cli_auto_mode_defaults");
    await bXc(e, wSt());
  }
  async function autoModeConfigHandler(e) {
    Pe("cli_auto_mode_config");
    await bXc(e, __l(getAutoModeConfig()));
  }
  async function autoModeCritiqueHandler(e, t) {
    let n = getAutoModeConfig();
    if (!(VSr(n?.allow) || VSr(n?.soft_deny) || VSr(n?.hard_deny) || VSr(n?.environment))) {
      e.render(SRe.jsx(Q_, {
        children: SRe.jsx(Text, {
          children: `No custom auto mode rules found.

Add rules to your settings file under autoMode.{allow, soft_deny, hard_deny, environment}.
Run \`claude auto-mode defaults\` to see the default rules for reference.`
        })
      }));
      await e.waitUntilExit();
      return;
    }
    let o = t.model ? parseUserSpecifiedModel(t.model) : getMainLoopModel();
    let s = wSt();
    let i = b_l();
    let a = zSr("allow", n?.allow ?? [], s.allow) + zSr("soft_deny", n?.soft_deny ?? [], s.soft_deny) + zSr("hard_deny", n?.hard_deny ?? [], s.hard_deny) + zSr("environment", n?.environment ?? [], s.environment);
    e.render(SRe.jsxs(Text, {
      children: ["Analyzing your auto mode rules\u2026", `

`]
    }));
    let l;
    try {
      let u = (await BU({
        querySource: "auto_mode_critique",
        model: o,
        system: C8f,
        skipSystemPromptPrefix: true,
        max_tokens: 4096,
        messages: [{
          role: "user",
          content: `Here is the full classifier system prompt that the auto mode classifier receives:

<classifier_system_prompt>
` + i + `
</classifier_system_prompt>

Here are the user's custom rules (each section header notes whether they replace or extend the defaults):

` + a + `
Please critique these custom rules.`
        }]
      })).content.find(d => d.type === "text");
      l = u?.type === "text" ? u.text : "No critique was generated. Please try again.";
    } catch (c) {
      Ae("cli_auto_mode_critique", "cli_auto_mode_critique_query_failed");
      e.unmount();
      return Es("Failed to analyze rules: " + he(c));
    }
    Pe("cli_auto_mode_critique");
    e.render(SRe.jsx(Q_, {
      children: SRe.jsx(Text, {
        children: l
      })
    }));
    await e.waitUntilExit();
  }
  function VSr(e) {
    return (e ?? []).some(t => t !== "$defaults");
  }
  function zSr(e, t, n) {
    let r = t.filter(a => a !== "$defaults");
    if (r.length === 0) {
      return "";
    }
    let o = t.length !== r.length;
    let s = r.map(a => "- " + a).join(`
`);
    let i = n.map(a => "- " + a).join(`
`);
    return "## " + e + (o ? ` (custom rules added alongside the defaults)
` : ` (custom rules replacing defaults)
`) + `Custom:
` + s + `

` + (o ? `Defaults also in effect:
` : `Defaults being replaced:
`) + i + `

`;
  }
  var SRe;
  var C8f = `You are an expert reviewer of auto mode classifier rules for Claude Code.

Claude Code has an "auto mode" that uses an AI classifier to decide whether tool calls should be auto-approved or require user confirmation. Users can write custom rules in four categories:

- **allow**: Actions the classifier should auto-approve
- **soft_deny**: Destructive/irreversible actions the classifier should block unless clear user intent authorizes them
- **hard_deny**: Security-boundary actions the classifier should block unconditionally (user intent does not clear these)
- **environment**: Context about the user's setup that helps the classifier make decisions

Your job is to critique the user's custom rules for clarity, completeness, and potential issues. The classifier is an LLM that reads these rules as part of its system prompt.

For each rule, evaluate:
1. **Clarity**: Is the rule unambiguous? Could the classifier misinterpret it?
2. **Completeness**: Are there gaps or edge cases the rule doesn't cover?
3. **Conflicts**: Do any of the rules conflict with each other?
4. **Actionability**: Is the rule specific enough for the classifier to act on?

Be concise and constructive. Only comment on rules that could be improved. If all rules look good, say so.`;
  var YSr = __lazy(() => {
    et();
    ln();
    dt();
    Eo();
    jz();
    xme();
    I1e();
    SL();
    SRe = __toESM(ie(), 1);
  });
  var EXc = {};
  __export(EXc, {
    update: () => update
  });
  async function update() {
    if (Me.DISABLE_UPDATES) {
      writeToStdout(`Updates are disabled by your administrator. Contact your IT team to get the latest version.
`);
      await gracefulShutdown(0);
    }
    logEvent("tengu_update_check", {});
    writeToStdout(`Current version: ${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}
`);
    let e = UZ();
    let t = wzt();
    let n = t ? t === "claude-code@latest" ? "latest" : "stable" : j_t() ? "stable" : e;
    let r = n === "rc" ? "slow" : n;
    writeToStdout(`Checking for updates to ${r} version...
`);
    logForDebugging("update: Starting update check");
    logForDebugging("update: Running diagnostic");
    let o = await ZVe();
    if (logForDebugging(`update: Installation type: ${o.installationType}`), logForDebugging(`update: Config install method: ${o.configInstallMethod}`), o.multipleInstallations.length > 1) {
      writeToStdout(`
`);
      writeToStdout(_$u.yellow("Warning: Multiple installations found") + `
`);
      for (let _ of o.multipleInstallations) {
        let b = o.installationType === _.type ? " (currently running)" : "";
        writeToStdout(`- ${_.type} at ${_.path}${b}
`);
      }
    }
    if (o.warnings.length > 0) {
      writeToStdout(`
`);
      for (let _ of o.warnings) {
        logForDebugging(`update: Warning detected: ${_.issue}`);
        logForDebugging(`update: Showing warning: ${_.issue}`);
        writeToStdout(_$u.yellow(`Warning: ${_.issue}
`));
        writeToStdout(_$u.bold(`Fix: ${_.fix.replaceAll("`", "")}
`));
      }
    }
    let s = getGlobalConfig();
    if (!s.installMethod && o.installationType !== "package-manager") {
      writeToStdout(`
`);
      writeToStdout(`Updating configuration to track installation method...
`);
      let _ = "unknown";
      switch (o.installationType) {
        case "npm-local":
          _ = "local";
          break;
        case "native":
          _ = "native";
          break;
        case "npm-global":
          _ = "global";
          break;
        default:
          _ = "unknown";
      }
      saveGlobalConfig(b => ({
        ...b,
        installMethod: _
      }));
      writeToStdout(`Installation method set to: ${_}
`);
    }
    if (o.installationType === "development") {
      writeToStdout(`
`);
      writeToStdout(_$u.yellow("Warning: Cannot update development build") + `
`);
      await gracefulShutdown(1);
    }
    if (o.installationType === "package-manager") {
      let _ = await QVe();
      if (writeToStdout(`
`), _ === "homebrew") {
        writeToStdout(`Claude is managed by Homebrew.
`);
        let b = `brew upgrade ${t ?? "claude-code"}`;
        let S = await lYn(t ?? "claude-code", n);
        if (S === null) {
          writeToStdout(`Could not check for updates (network check skipped or unavailable).
`);
          writeToStdout(`To update manually, run:
`);
          writeToStdout(_$u.bold(`  ${b}`) + `
`);
        } else if (!iO({
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, S)) {
          writeToStdout(`Update available: ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION} \u2192 ${S}
`);
          writeToStdout(`
`);
          writeToStdout(`To update, run:
`);
          writeToStdout(_$u.bold(`  ${b}`) + `
`);
        } else {
          writeToStdout(`Claude is up to date!
`);
        }
        if (t !== "claude-code@latest") {
          writeToStdout(`
`);
          writeToStdout(_$u.dim(`Tip: For more frequent updates, use the claude-code@latest cask:
`));
          writeToStdout(_$u.dim(`  brew uninstall --cask ${t ?? "claude-code"} && brew install --cask claude-code@latest`) + `
`);
        }
      } else if (_ === "winget") {
        writeToStdout(`Claude is managed by winget.
`);
        let b = await B_t(n);
        if (b && !iO({
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, b)) {
          writeToStdout(`Update available: ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION} \u2192 ${b}
`);
          writeToStdout(`
`);
          writeToStdout(`To update, run:
`);
          writeToStdout(_$u.bold("  winget upgrade Anthropic.ClaudeCode") + `
`);
        } else {
          writeToStdout(`Claude is up to date!
`);
        }
      } else if (_ === "apk") {
        writeToStdout(`Claude is managed by apk.
`);
        let b = await B_t(n);
        if (b && !iO({
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, b)) {
          writeToStdout(`Update available: ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION} \u2192 ${b}
`);
          writeToStdout(`
`);
          writeToStdout(`To update, run:
`);
          writeToStdout(_$u.bold("  apk upgrade claude-code") + `
`);
        } else {
          writeToStdout(`Claude is up to date!
`);
        }
      } else {
        writeToStdout(`Claude is managed by a package manager.
`);
        writeToStdout(`Please use your package manager to update.
`);
      }
      await gracefulShutdown(0);
    }
    if (s.installMethod && o.configInstallMethod !== "not set" && o.installationType !== "package-manager") {
      let {
        installationType: _,
        configInstallMethod: b
      } = o;
      let E = {
        "npm-local": "local",
        "npm-global": "global",
        native: "native",
        development: "development",
        unknown: "unknown"
      }[_] || _;
      if (E !== b && b !== "unknown") {
        writeToStdout(`
`);
        writeToStdout(_$u.yellow("Warning: Configuration mismatch") + `
`);
        writeToStdout(`Config expects: ${b} installation
`);
        writeToStdout(`Currently running: ${_}
`);
        writeToStdout(_$u.yellow(`Updating the ${_} installation you are currently using`) + `
`);
        saveGlobalConfig(C => ({
          ...C,
          installMethod: E
        }));
        writeToStdout(`Config updated to reflect current installation method: ${E}
`);
      }
    }
    if (o.installationType === "native") {
      if (logForDebugging("update: Detected native installation, using native updater"), getInitialSettings()?.minimumVersion || getSettingsForSource("policySettings")?.requiredMaximumVersion) {
        let _ = await Rzt(n).catch(() => null);
        let b = _ ? aYn(_) : null;
        if (_ && b) {
          writeToStdout(_$u.yellow(`The ${r} channel is at ${_}, which is ${b}. Staying on ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION}.`) + `
`);
          await gracefulShutdown(0);
        }
      }
      Rzt(n).then(_ => {
        if (_ && _ !== {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION) {
          writeToStdout(`Updating to ${_}...
`);
        }
      }).catch(() => {});
      try {
        let _ = await rze(n, false);
        if (_.lockFailed) {
          let b = _.lockHolderPid ? ` (PID ${_.lockHolderPid})` : "";
          writeToStdout(_$u.yellow(`Another Claude process${b} is currently running. Please try again in a moment.`) + `
`);
          await gracefulShutdown(0);
        }
        if (!_.latestVersion) {
          process.stderr.write(`Failed to check for updates
`);
          await gracefulShutdown(1);
        }
        if (_.wasUpdated && _.latestVersion !== {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION) {
          writeToStdout(_$u.green(`Successfully updated from ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION} to version ${_.latestVersion}`) + `
`);
          await Xro();
          await SXc(_.latestVersion);
        } else {
          writeToStdout(_$u.green(`Claude Code is up to date (${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION})`) + `
`);
        }
        await gracefulShutdown(0);
      } catch (_) {
        process.stderr.write(`Error: Failed to install native update
`);
        process.stderr.write(String(_) + `
`);
        process.stderr.write(`Try running "claude doctor" for diagnostics
`);
        await gracefulShutdown(1);
      }
    }
    if (s.installMethod !== "native") {
      await Pzt();
    }
    logForDebugging("update: Checking npm registry for latest version");
    logForDebugging(`update: Package URL: ${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL}`);
    let i = n === "stable" ? "stable" : "latest";
    let a = `npm view ${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL}@${i} version`;
    logForDebugging(`update: Running: ${a}`);
    let l = await B_t(n);
    if (logForDebugging(`update: Latest version from npm: ${l || "FAILED"}`), !l) {
      if (logForDebugging("update: Failed to get latest version from npm registry"), process.stderr.write(_$u.red("Failed to check for updates") + `
`), process.stderr.write(`Unable to fetch latest version from npm registry
`), process.stderr.write(`
`), process.stderr.write(`Possible causes:
`), process.stderr.write(`  \u2022 Network connectivity issues
`), process.stderr.write(`  \u2022 npm registry is unreachable
`), process.stderr.write(`  \u2022 Corporate proxy/firewall blocking npm
`), {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL && !{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL.startsWith("@anthropic")) {
        process.stderr.write(`  \u2022 Internal/development build not published to npm
`);
      }
      process.stderr.write(`
`);
      process.stderr.write(`Try:
`);
      process.stderr.write(`  \u2022 Check your internet connection
`);
      process.stderr.write(`  \u2022 Run with --debug flag for more details
`);
      let _ = {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL || "@anthropic-ai/claude-code";
      process.stderr.write(`  \u2022 Manually check: npm view ${_} version
`);
      process.stderr.write(`  \u2022 Check if you need to login: npm whoami
`);
      await gracefulShutdown(1);
    }
    let {
      maxVersion: c,
      forceDowngradeEnabled: u
    } = await JVe();
    let d = l;
    let p = false;
    if (u && c && F_t({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, c, "auto_updater")) {
      d = c;
      p = true;
    } else if (c && l && mv(l, c)) {
      logForDebugging(`update: maxVersion ${c} is set, capping update from ${l} to ${c}`);
      d = mv(c, {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION) ? c : {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION;
    }
    let m = d ? aYn(d) : null;
    if (d && m) {
      let _ = d === l ? `The ${r} channel is at ${d}` : `The update target is capped at ${d} by a server-side version policy`;
      writeToStdout(_$u.yellow(`${_}, which is ${m}. Staying on ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}.`) + `
`);
      await gracefulShutdown(0);
    }
    if (d === {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION) {
      writeToStdout(_$u.green(`Claude Code is up to date (${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION})`) + `
`);
      await gracefulShutdown(0);
    }
    if (!p && d && Vne(d, {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION)) {
      writeToStdout(_$u.yellow(`You're running ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}, which is newer than the ${r} channel's ${d}. Skipping update. To switch back to the channel version, run claude install ${d}.`) + `
`);
      await gracefulShutdown(0);
    }
    if (p) {
      logEvent("tengu_auto_updater_forced_downgrade", {
        from_version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        to_version: uS(d)
      });
      writeToStdout(_$u.yellow(`Downgrading to ${d} (current: ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}) \u2014 required by a server-side version policy.`) + `
`);
    } else {
      writeToStdout(`New version available: ${d} (current: ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION})
`);
    }
    writeToStdout(`Installing update...
`);
    let f = false;
    let h = "";
    switch (o.installationType) {
      case "npm-local":
        f = true;
        h = "local";
        break;
      case "npm-global":
        f = false;
        h = "global";
        break;
      case "unknown":
        {
          let _ = await VVe();
          f = _;
          h = _ ? "local" : "global";
          writeToStdout(_$u.yellow("Warning: Could not determine installation type") + `
`);
          writeToStdout(`Attempting ${h} update based on file detection...
`);
          break;
        }
      default:
        Ae("update_apply", "update_apply_unsupported_install_type");
        process.stderr.write(`Error: Cannot update ${o.installationType} installation
`);
        await gracefulShutdown(1);
    }
    writeToStdout(`Using ${h} installation update method...
`);
    logForDebugging(`update: Update method determined: ${h}`);
    logForDebugging(`update: useLocalUpdate: ${f}`);
    let g;
    let y;
    if (f) {
      logForDebugging("update: Calling installOrUpdateClaudePackage() for local update");
      g = await Szt(n, d);
    } else {
      logForDebugging("update: Calling installGlobalPackage() for global update");
      y = await vzt(d);
      g = y.status;
    }
    if (logForDebugging(`update: Installation status: ${g}`), g !== "in_progress") {
      await XVe({
        timestamp: new Date().toISOString(),
        path: f ? "npm-local" : "npm-global",
        outcome: g === "success" ? "success" : "failed",
        status: g,
        version_from: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        version_to: d,
        error_code: g === "install_failed" && $_t() ? "update_apply_restore_failed" : y?.failureHint === "windows_running_exe_lock" ? "update_apply_exe_locked" : null
      });
    }
    switch (g) {
      case "success":
        writeToStdout(_$u.green(p ? `Successfully downgraded from ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION} to version ${d}` : `Successfully updated from ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION} to version ${d}`) + `
`);
        await Xro();
        await SXc(d);
        break;
      case "no_permissions":
        if (process.stderr.write(`Error: Insufficient permissions to install update
`), f) {
          process.stderr.write(`Try manually updating with:
`);
          process.stderr.write(`  cd ~/.claude/local && npm update ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.PACKAGE_URL}
`);
        } else {
          process.stderr.write(`Try running with sudo or fix npm permissions
`);
          process.stderr.write(`Or consider using native installation with: claude install
`);
        }
        await gracefulShutdown(1);
        break;
      case "install_failed":
        {
          let _ = $_t();
          if (!_ && y?.failureHint === "windows_running_exe_lock") {
            process.stderr.write(`Error: Update failed because claude.exe is in use. Close other Claude Code sessions (including VS Code), then run claude update again, or run claude doctor.
`);
            await gracefulShutdown(1);
            break;
          }
          if (process.stderr.write(`Error: Failed to install update
`), _) {
            process.stderr.write(`Your Claude Code executable could not be restored after the failed update. It was preserved at ${_.preservedPath}
`);
            process.stderr.write(`Rename it back to ${TXc.basename(_.originalPath)}, or reinstall with: npm i -g ${{
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.PACKAGE_URL}
`);
          } else if (f) {
            process.stderr.write(`Try manually updating with:
`);
            process.stderr.write(`  cd ~/.claude/local && npm update ${{
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.PACKAGE_URL}
`);
          } else {
            process.stderr.write(`Or consider using native installation with: claude install
`);
          }
          await gracefulShutdown(1);
          break;
        }
      case "in_progress":
        process.stderr.write(`Error: Another instance is currently performing an update
`);
        process.stderr.write(`Please wait and try again later
`);
        await gracefulShutdown(1);
        break;
    }
    await gracefulShutdown(0);
  }
  async function SXc(e) {
    if (await OWl(e)) {
      writeToStdout(_$u.dim(`${bgSupervisorNounCap()} will restart on the new version shortly; background jobs continue uninterrupted`) + `
`);
    }
  }
  var TXc;
  var vXc = __lazy(() => {
    uT();
    jZ();
    ln();
    Ot();
    Gu();
    uve();
    Qro();
    je();
    D1e();
    pr();
    lm();
    H_t();
    zVe();
    Z0o();
    qQ();
    pYn();
    OD();
    XFe();
    TXc = require("path");
  });
  var xXc = {};
  __export(xXc, {
    importConversationsHandler: () => importConversationsHandler,
    importConversations: () => importConversations
  });
  function Pin(e) {
    return e.replace(/[^a-zA-Z0-9._-]+/g, "_").slice(0, 128) || "file";
  }
  async function Iin(e, t) {
    return Uee.writeFile(e, t, {
      mode: 384,
      flag: "wx"
    }).then(() => true, n => {
      if (n.code !== "EEXIST") {
        throw n;
      }
      return false;
    });
  }
  function A8f(e) {
    return e.length >= 5 && e[0] === 37 && e[1] === 80 && e[2] === 68 && e[3] === 70 && e[4] === 45;
  }
  function I8f(e, t) {
    let n = e.content.find(s => s.type === "text")?.text ?? e.text;
    let r = (e.attachments ?? []).map(s => `

<file name="${s.file_name}">
${s.extracted_content}
</file>`).join("");
    return (t.length > 0 ? `${t.join(`
`)}
` : "") + n + r;
  }
  async function P8f(e, t, n, r) {
    let o = {
      parentUuid: e.parent_message_uuid ?? null,
      isSidechain: false,
      uuid: e.uuid,
      timestamp: e.created_at,
      cwd: t,
      userType: "external",
      sessionId: n,
      version: "claude-export-import"
    };
    if (e.sender === "human") {
      let i = [];
      let a = [];
      for (let u of e.files ?? []) {
        let d = r[u.file_uuid];
        if (!d) {
          continue;
        }
        let p = tX(Buffer.from(d));
        if (p) {
          try {
            let {
              block: m
            } = await f1({
              data: Buffer.from(d),
              mediaType: p,
              limits: iV
            });
            i.push(m);
          } catch {
            let m = `${u.file_uuid}-${Pin(u.file_name)}`;
            a.push(`@"${r6.join(t, "files", m)}"`);
          }
        } else if (A8f(d)) {
          i.push({
            type: "document",
            source: {
              type: "base64",
              media_type: "application/pdf",
              data: Buffer.from(d).toString("base64")
            }
          });
        } else {
          let m = `${u.file_uuid}-${Pin(u.file_name)}`;
          a.push(`@"${r6.join(t, "files", m)}"`);
        }
      }
      let l = I8f(e, a);
      let c = i.length > 0 ? l.trim().length > 0 ? [...i, {
        type: "text",
        text: l
      }] : i : l;
      return {
        ...o,
        type: "user",
        message: {
          role: "user",
          content: c
        }
      };
    }
    let s = e.content.filter(i => i.type === "text" && typeof i.text === "string").map(i => ({
      type: "text",
      text: i.text,
      citations: []
    }));
    return {
      ...o,
      type: "assistant",
      requestId: undefined,
      message: {
        id: e.uuid,
        type: "message",
        role: "assistant",
        model: "claude-export-import",
        content: s.length > 0 ? s : [{
          type: "text",
          text: e.text,
          citations: []
        }],
        container: null,
        context_management: null,
        stop_details: null,
        stop_reason: "end_turn",
        stop_sequence: null,
        usage: {
          input_tokens: 0,
          output_tokens: 0,
          cache_creation_input_tokens: 0,
          cache_read_input_tokens: 0,
          cache_creation: null,
          server_tool_use: null,
          service_tier: null,
          inference_geo: null,
          iterations: null,
          speed: null
        }
      }
    };
  }
  function O8f(e, t) {
    let n = [];
    if (e.conversations.length !== t.conversations + t.skipped) {
      n.push(`conversations: manifest=${e.conversations.length} imported=${t.conversations + t.skipped}`);
    }
    let r = e.conversations.reduce((s, i) => s + i.message_count, 0);
    if (r !== t.messages) {
      n.push(`messages: manifest=${r} imported=${t.messages}`);
    }
    if (e.projects.length !== t.projects) {
      n.push(`projects: manifest=${e.projects.length} imported=${t.projects}`);
    }
    let o = e.projects.reduce((s, i) => s + i.doc_count, 0);
    if (o !== t.docs) {
      n.push(`docs: manifest=${o} imported=${t.docs}`);
    }
    return n;
  }
  async function D8f(e) {
    let {
      size: t
    } = await Uee.stat(e);
    if (t > 1073741824) {
      throw Error(`export file is ${t} bytes; refusing to read more than ${1073741824}`);
    }
    if (!e.endsWith(".zip")) {
      return {
        ...qt(await Uee.readFile(e, "utf8")),
        files: {}
      };
    }
    let n = await dpe(await Uee.readFile(e));
    let r = new TextDecoder();
    let o = i => {
      let a = n[i];
      if (!a) {
        throw Error(`export zip missing ${i}`);
      }
      return qt(r.oC(a));
    };
    let s = {};
    for (let [i, a] of Object.entries(n)) {
      if (!i.startsWith("files/")) {
        continue;
      }
      let l = r6.basename(i);
      if (l.length === 0 || !CXc.test(l)) {
        continue;
      }
      s[l] = a;
    }
    return {
      manifest: o("manifest.json"),
      conversations: o("conversations.json"),
      projects: o("projects.json"),
      files: s
    };
  }
  async function importConversations(e, t) {
    let n = await D8f(e);
    let r = Cj(t.cwd);
    let o = {
      conversations: 0,
      skipped: 0,
      messages: 0,
      projects: 0,
      docs: 0,
      files: 0,
      manifestDiff: [],
      jsonlPaths: [],
      titles: [],
      projectList: n.projects.map(l => ({
        uuid: l.uuid,
        name: l.name,
        dirName: `${Dtn(l.name) || "project"}-${l.uuid}`
      })),
      conversationProjects: {}
    };
    if (!t.dryRun) {
      await Uee.mkdir(r, {
        recursive: true,
        mode: 448
      });
      await Uee.mkdir(r6.join(t.cwd, "projects"), {
        recursive: true,
        mode: 448
      });
      await Uee.mkdir(r6.join(t.cwd, "files"), {
        recursive: true,
        mode: 448
      });
    }
    let s = l => {
      let c = l.name.trim();
      if (c && c !== "New conversation") {
        return c;
      }
      return l.chat_messages.find(d => d.sender === "human")?.text.trim().slice(0, 60) || "Untitled";
    };
    let i = {};
    for (let l of n.conversations) {
      for (let c of l.chat_messages) {
        for (let u of c.files ?? []) {
          i[u.file_uuid] = u.file_name;
        }
      }
    }
    for (let l of n.conversations) {
      let c = xAt(l.uuid, "5f3a2c5e-6b8f-4b27-9c0e-2d7f1a9b3c44");
      let u = await Promise.all(l.chat_messages.map(m => P8f(m, t.cwd, c, n.files)));
      let d = u.map(m => De(m)).join(`
`) + (u.length ? `
` : "");
      let p = r6.join(r, `${c}.jsonl`);
      if (o.jsonlPaths.push(p), o.titles.push(s(l)), o.conversationProjects[c] = l.project_uuid ?? null, o.messages += u.length, !t.dryRun) {
        if (!(await Iin(p, d))) {
          o.skipped += 1;
          continue;
        }
      }
      o.conversations += 1;
    }
    let a = new Set();
    for (let l of n.projects) {
      let c = `${Dtn(l.name) || "project"}-${l.uuid}`;
      if (!CXc.test(c)) {
        continue;
      }
      let u = r6.join(t.cwd, "projects", c);
      if (!t.dryRun) {
        await Uee.mkdir(u, {
          recursive: true,
          mode: 448
        });
      }
      let d = l.prompt_template?.trim();
      if (d && !t.dryRun) {
        await Iin(r6.join(u, "CLAUDE.md"), d);
      }
      for (let p of l.docs) {
        let m = Pin(p.filename ?? "");
        let f = /[a-zA-Z0-9]/.test(m) ? m : "untitled.md";
        if (o.docs += 1, !t.dryRun) {
          await Iin(r6.join(u, f), p.content ?? "");
        }
      }
      for (let p of l.files ?? []) {
        let m = n.files[p.file_uuid];
        if (!m) {
          continue;
        }
        if (a.add(p.file_uuid), o.files += 1, !t.dryRun) {
          await Iin(r6.join(u, Pin(p.file_name)), m);
        }
      }
      o.projects += 1;
    }
    for (let [l, c] of Object.entries(n.files)) {
      if (a.vZc(l)) {
        continue;
      }
      let u = i[l];
      let d = u ? `${l}-${Pin(u)}` : l;
      if (!t.dryRun) {
        await Iin(r6.join(t.cwd, "files", d), c);
      }
      o.files += 1;
    }
    o.manifestDiff = O8f(n.manifest, o);
    return o;
  }
  async function importConversationsHandler(e, t) {
    if (!st(process.env.CLAUDE_IMPORT_CONVERSATIONS)) {
      return Es("import-conversations is not enabled");
    }
    if (!t.cwd) {
      return Es("--cwd is required");
    }
    let n = await YE(t.cwd);
    let r = await importConversations(e, {
      cwd: n,
      dryRun: t.dryRun
    });
    let o = t.dryRun ? "[dry-run] " : "";
    if (process.stdout.write(`${o}imported: conversations=${r.conversations} skipped=${r.skipped} messages=${r.messages} projects=${r.projects} docs=${r.docs} files=${r.files}
`), await new Promise(s => process.stdout.write(De({
      sessionIds: r.jsonlPaths.map(i => r6.basename(i, ".jsonl")),
      titles: r.titles,
      jsonlPaths: r.jsonlPaths,
      cwd: n,
      projects: r.projectList,
      conversationProjects: r.conversationProjects,
      counts: {
        conversations: r.conversations,
        projects: r.projects,
        files: r.files,
        docs: r.docs,
        skipped: r.skipped
      }
    }) + `
`, s)), r.manifestDiff.length > 0) {
      process.stderr.write(`manifest mismatch:
  ` + r.manifestDiff.join(`
  `) + `
`);
      process.exit(1);
    }
    process.exit(0);
  }
  var Uee;
  var r6;
  var CXc;
  var kXc = __lazy(() => {
    Q8o();
    Ire();
    w6e();
    gn();
    yG();
    ZS();
    GL();
    SL();
    Uee = require("fs/promises");
    r6 = require("path");
    CXc = /^[a-zA-Z0-9_-]+$/;
  });
  var XSr = {};
  __export(XSr, {
    startDeferredPrefetches: () => startDeferredPrefetches,
    main: () => main
  });
  function F8f() {
    try {
      let e = getSettingsForSource("policySettings");
      if (e) {
        let t = getManagedSettingsKeysForLogging(e);
        logEvent("tengu_managed_settings_loaded", {
          keyCount: t.length,
          keys: t.join(",")
        });
      }
    } catch {}
  }
  function U8f() {
    let e = X4();
    let t = process.execArgv.some(r => {
      if (e) {
        return /--inspect(-brk)?/.test(r);
      } else {
        return /--inspect(-brk)?|--debug(-brk)?/.test(r);
      }
    });
    let n = Me.NODE_OPTIONS && /--inspect(-brk)?|--debug(-brk)?/.test(Me.NODE_OPTIONS);
    try {
      return !!global.require("inspector").url() || t || n;
    } catch {
      return t || n;
    }
  }
  function PXc() {
    let e = parseUserSpecifiedModel(getInitialMainLoopModel() ?? getDefaultMainLoopModel());
    Y4c(Nt(), iT(e, getSdkBetas()), bytesPerTokenForModel(e));
    loadAllPluginsCacheOnly().then(async ({
      enabled: t,
      errors: n
    }) => {
      let r = II();
      fta(t, r);
      await Promise.all(t.map(async o => {
        if (!o.mcpServers) {
          let s = await Doe(o, []);
          if (s) {
            o.mcpServers = s;
          }
        }
        if (!o.lspServers) {
          let s = await Y6e(o, []);
          if (s) {
            o.lspServers = s;
          }
        }
      }));
      hta(t, r, fde());
      gta(n, r, {
        cacheOnly: true
      });
      V4c(t, r);
    }).catch(t => Oe($o(sr(t), "plugin session telemetry load failed")));
  }
  function B8f() {
    let e = getAutoModeConfig();
    let t = {
      allow: 0,
      soft_deny: 0,
      hard_deny: 0,
      environment: 0
    };
    let n = 0;
    for (let r of ["allow", "soft_deny", "hard_deny", "environment"]) {
      for (let o of e?.[r] ?? []) {
        if (o === "$defaults") {
          continue;
        }
        t[r] += Bn(o.split(`
`), s => s.trim().length > 0);
        n += Bn(o.split(/\s+/), Boolean);
      }
    }
    return {
      auto_mode_allow_rule_count: t.allow,
      auto_mode_soft_deny_rule_count: t.soft_deny,
      auto_mode_hard_deny_rule_count: t.hard_deny,
      auto_mode_environment_rule_count: t.environment,
      auto_mode_rule_word_count: n
    };
  }
  function $8f() {
    let e = {};
    if (process.env.NODE_EXTRA_CA_CERTS) {
      e.has_node_extra_ca_certs = true;
    }
    if (process.env.CLAUDE_CODE_CLIENT_CERT) {
      e.has_client_cert = true;
    }
    if (xZe("--use-system-ca")) {
      e.has_use_system_ca = true;
    }
    if (xZe("--use-openssl-ca")) {
      e.has_use_openssl_ca = true;
    }
    if (process.env.CLAUDE_CODE_CERT_STORE) {
      e.cert_store = process.env.CLAUDE_CODE_CERT_STORE;
    }
    return e;
  }
  async function H8f(e) {
    if (Jj()) {
      return;
    }
    let [t, n, r] = await Promise.all([getIsGit(), getWorktreeCount(), Jdr()]);
    let o = Eqc();
    let s = vqc(e);
    let i = wqc(getInitialSettings());
    logEvent("tengu_startup_telemetry", {
      is_git: t,
      worktree_count: n,
      gh_auth_status: r,
      sandbox_enabled: SandboxManager.isSandboxingEnabled(),
      are_unsandboxed_commands_allowed: SandboxManager.areUnsandboxedCommandsAllowed(),
      is_auto_bash_allowed_if_sandbox_enabled: SandboxManager.isAutoAllowBashIfSandboxedEnabled(),
      auto_updater_disabled: isAutoUpdaterDisabled(),
      prefers_reduced_motion: getInitialSettings().prefersReducedMotion ?? false,
      theme: uc("theme", "dark").value,
      set_env_var_count: o.length,
      set_env_vars: o.join(","),
      nondefault_setting_count: s.length,
      nondefault_settings: s.join(","),
      set_user_settings_count: i.length,
      set_user_settings: i.join(","),
      ...$8f(),
      ...B8f()
    });
  }
  function j8f() {
    if (iWc(), getGlobalConfig().migrationVersion !== 13) {
      nWc();
      oWc();
      CWc();
      yWc();
      lWc();
      bWc();
      pWc();
      eWc();
      fWc();
      TWc();
      uWc();
      vWc();
      saveGlobalConfig(e => e.migrationVersion === 13 ? e : {
        ...e,
        migrationVersion: 13
      });
    }
    o7l().catch(() => {});
  }
  function q8f() {
    if (getIsNonInteractiveSession()) {
      wn("info", "prefetch_system_context_non_interactive");
      Tv();
      return;
    }
    if (checkHasTrustDialogAccepted()) {
      wn("info", "prefetch_system_context_has_trust");
      Tv();
    } else {
      wn("info", "prefetch_system_context_skipped_no_trust");
    }
  }
  function startDeferredPrefetches() {
    if (st(process.env.CLAUDE_CODE_EXIT_AFTER_FIRST_RENDER) || kd()) {
      return;
    }
    if (BOi(), iE(), q8f(), Yyr(), st(process.env.CLAUDE_CODE_USE_BEDROCK) && !st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH)) {
      prefetchAwsCredentialsAndBedRockInfoIfSafe();
    }
    if (st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) && !st(process.env.CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH)) {
      prefetchAwsCredentialsAndBedRockInfoIfSafe();
    }
    if (st(process.env.CLAUDE_CODE_USE_MANTLE) && !st(process.env.CLAUDE_CODE_SKIP_MANTLE_AUTH)) {
      prefetchAwsCredentialsAndBedRockInfoIfSafe();
    }
    if (st(process.env.CLAUDE_CODE_USE_VERTEX) && !st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH)) {
      prefetchGcpCredentialsIfSafe();
    }
    if (GBn(Nt(), AbortSignal.timeout(3000), []), Lji(), HPi(), Kdi(), fM.initialize(), !kd() && !getIsRemoteMode() && !getDisableSlashCommands()) {
      gxt.initialize();
    }
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_drift_lantern", false)) {
      Promise.resolve().then(() => (UWc(), FWc)).then(e => e.startEventLoopStallDetector());
    }
    if (Ktt()) {
      Rji(Zji);
    }
  }
  async function main() {
    profileCheckpoint("main_function_start");
    xqc();
    process.on("exit", () => {
      K8f();
    });
    profileCheckpoint("main_warning_handler_initialized");
    let e = process.argv.indexOf("--handle-uri");
    if (e !== -1 && process.argv[e + 1]) {
      let c = Ean(process.argv);
      if (c) {
        console.error(c);
        process.exit(1);
      }
      let u = process.argv[e + 1];
      let {
        enableConfigs: d
      } = await Promise.resolve().then(() => (Jn(), bz));
      d();
      let {
        handleDeepLinkUri: p
      } = await Promise.resolve().then(() => (eGc(), ZWc));
      let m = await p(u);
      process.exit(m);
    }
    let t = process.argv.slice(2);
    let n = t.includes("-p") || t.includes("--print");
    let r = t.includes("--init-only");
    let o = t.some(c => c.startsWith("--sdk-url"));
    let s = n || r || o || !process.stdout.isTTY;
    if (s) {
      stopCapturingEarlyInput();
    }
    setIsInteractive(!s);
    lRs(s);
    setSessionStartType(cRs(t));
    van();
    let a = (() => {
      if (st(process.env.GITHUB_ACTIONS)) {
        return "github-action";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "sdk-ts") {
        return "sdk-typescript";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "sdk-py") {
        return "sdk-python";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "sdk-cli") {
        return "sdk-cli";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "claude-vscode") {
        return "claude-vscode";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent") {
        return "local-agent";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "claude-desktop") {
        return "claude-desktop";
      }
      let c = Me.CLAUDE_CODE_SESSION_ACCESS_TOKEN || Me.CLAUDE_CODE_WEBSOCKET_AUTH_FILE_DESCRIPTOR || Me.CLAUDE_SESSION_INGRESS_TOKEN_FILE;
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "remote" || c) {
        return "remote";
      }
      return "cli";
    })();
    setClientType(a);
    let l = process.env.CLAUDE_CODE_QUESTION_PREVIEW_FORMAT;
    if (l === "markdown" || l === "html") {
      setQuestionPreviewFormat(l);
    } else if (!a.startsWith("sdk-") && a !== "claude-desktop" && a !== "local-agent" && a !== "remote") {
      setQuestionPreviewFormat("markdown");
    }
    if (process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "bridge") {
      setSessionSource("remote-control");
    }
    profileCheckpoint("main_client_type_determined");
    eagerLoadSettings();
    profileCheckpoint("main_before_run");
    await V8f();
    profileCheckpoint("main_after_run");
  }
  async function G8f(e, t) {
    if (!process.stdin.isTTY && !process.argv.includes("mcp")) {
      if (t === "stream-json") {
        process.stdin.setEncoding("utf8");
        return iterateStreamUntilClose(process.stdin);
      }
      process.stdin.setEncoding("utf8");
      let n = "";
      let r = s => {
        if (n.length + s.length > 10485760) {
          process.stdin.off("data", r);
          return Es(`Error: piped stdin input exceeds ${10485760 / 1024 / 1024}MB. Pass large content as a file path in your prompt instead.`);
        }
        n += s;
      };
      process.stdin.on("data", r);
      let o = await peekForStdinData(process.stdin, 3000);
      if (process.stdin.off("data", r), o) {
        Y3("Warning: no stdin data received in 3s, proceeding without it. If piping from a slow command, redirect stdin explicitly: < /dev/null to skip, or wait longer.");
      }
      return [e, n].filter(Boolean).join(`
`);
    }
    return e;
  }
  async function V8f() {
    profileCheckpoint("run_function_start");
    let e = new _bc().configureHelp($Ce()).enablePositionalOptions();
    profileCheckpoint("run_commander_initialized");
    let t = false;
    e.hook("preAction", async (i, a) => {
      profileCheckpoint("preAction_start");
      let l = performance.now();
      if (await Promise.all([Vnt(), ensureKeychainPrefetchCompleted()]), profileCheckpoint("preAction_after_mdm"), await init(), profileCheckpoint("preAction_after_init"), await Ryc(), !Me.CLAUDE_CODE_DISABLE_TERMINAL_TITLE) {
        process.title = "claude";
      }
      let {
        initSinks: c
      } = await Promise.resolve().then(() => (TJe(), KCt));
      c();
      profileCheckpoint("preAction_after_sinks");
      let u = i.getOptionValue("pluginDir");
      if (Array.isArray(u) && u.length > 0 && u.every(g => typeof g === "string")) {
        setInlinePlugins(u);
        clearPluginCache("preAction: --plugin-dir inline plugins");
      }
      let d = i.getOptionValue("pluginDirNoMcp");
      if (Array.isArray(d) && d.length > 0 && d.every(g => typeof g === "string")) {
        setInlinePluginsNoMcp(d);
        clearPluginCache("preAction: --plugin-dir-no-mcp inline plugins");
      }
      let p = i.getOptionValue("pluginUrl");
      if (Array.isArray(p) && p.length > 0 && p.every(g => typeof g === "string")) {
        setInlinePluginUrls(p);
        clearPluginCache("preAction: --plugin-url inline plugins");
      }
      j8f();
      profileCheckpoint("preAction_after_migrations");
      let m = a.parent?.name() === "auth";
      if (getSettingsForSource("policySettings")?.forceRemoteSettingsRefresh && !m) {
        let g = await ACo(g6n);
        if (!g.valid) {
          return Es(g.message);
        }
      } else if (getAPIProvider() === "gateway" && !m) {
        if (!(await g6n())) {
          return Es(`Couldn't load settings from Cloud gateway ${getGatewayAuth()?.url ?? ""}. Check your network connection, or run \`claude auth login\` to re-authenticate.`);
        }
      } else {
        g6n();
      }
      let f = a === e && shouldAwaitPolicyLimitsOnStartup();
      loadPolicyLimits({
        startupAwaited: f
      });
      {
        let g = await Wyn(getBasePolicySettings(), getBasePolicySettingsOrigin());
        if (g) {
          return Es(g);
        }
        if (Rle()) {
          applySafeConfigEnvironmentVariables();
        }
        TLr.subscribe(() => {
          clearMemoryFileCaches();
          iE.cache.clear?.();
        });
      }
      if (areSideloadFlagsDisabledByPolicy()) {
        let g = [];
        let y = _ => Array.isArray(_) ? _.length > 0 : typeof _ === "string" && _.length > 0;
        for (let [_, b] of [["pluginDir", "--plugin-dir"], ["pluginDirNoMcp", "--plugin-dir-no-mcp"], ["pluginUrl", "--plugin-url"], ["agents", "--agents"]]) {
          if (y(i.getOptionValue(_)) || y(a.getOptionValue(_))) {
            g.push(b);
          }
        }
        if (g.length > 0) {
          return Es(sideloadFlagsBlockedMessage(g));
        }
      }
      let h = h_c(a);
      if (h) {
        return Es(h);
      }
      if (fM.subscribe(g => {
        if (g === "policySettings") {
          clearMemoryFileCaches();
          iE.cache.clear?.();
        }
      }), profileCheckpoint("preAction_after_remote_settings"), profileCheckpoint("preAction_after_settings_sync"), a === e && i.getOptionValue("worktree") === undefined && !Me.CLAUDE_CODE_SYNC_PLUGIN_INSTALL) {
        let g = i.getOptionValue("addDir");
        if (Array.isArray(g) && g.every(y => typeof y === "string")) {
          setAdditionalDirectoriesForClaudeMd(g);
        }
        loadAllPluginsCacheOnly().catch(() => {});
        t = true;
        profileCheckpoint("preAction_after_plugin_early_kick");
      }
      au("pre_action_ms", performance.now() - l, l);
      markStartupActionStarted(a === e);
    });
    e.name("claude").description("Claude Code - starts an interactive session by default, use -p/--print for non-interactive output").argument("[prompt]", "Your prompt", String).helpOption("-h, --help", "Display help for command").option("-d, --debug [filter]", 'Enable debug mode with optional category filtering (e.g., "api,hooks" or "!1p,!file")', i => true).addOption(new ic("-d2e, --debug-to-stderr", "(deprecated) Enable debug mode (to stderr)").argParser(Boolean).hideHelp().implies({
      debug: true
    })).option("--debug-file <path>", "Write debug logs to a specific file path (implicitly enables debug mode)", () => true).option("--verbose", "Override verbose mode setting from config", () => true).option("-p, --print", "Print response and exit (useful for pipes). Note: The workspace trust dialog is skipped when Claude is run in non-interactive mode (via -p, or when stdout is not a TTY, e.g. piped or redirected output). Only use this in directories you trust. Settings files that fail validation are silently ignored in this mode (no error dialog is shown).", () => true).option("--bare", "Minimal mode: skip hooks, LSP, plugin sync, attribution, auto-memory, background prefetches, keychain reads, and CLAUDE.md auto-discovery. Sets CLAUDE_CODE_SIMPLE=1. Anthropic auth is strictly ANTHROPIC_API_KEY or apiKeyHelper via --settings (OAuth and keychain are never read). 3P providers (Bedrock/Vertex/Foundry) use their own credentials. Skills still resolve via /skill-name. Explicitly provide context via: --system-prompt[-file], --append-system-prompt[-file], --add-dir (CLAUDE.md dirs), --mcp-config, --settings, --agents, --plugin-dir.", () => true).option("--safe-mode", "Start with all customizations (CLAUDE.md, skills, plugins, hooks, MCP servers, custom commands and agents, output styles, workflows, custom themes, keybindings, and more) disabled \u2014 useful for troubleshooting a broken configuration. Admin-managed (policy) settings still apply. Auth, model selection, built-in tools, and permissions work normally. Sets CLAUDE_CODE_SAFE_MODE=1.", () => true).addOption(new ic("--init", "Run Setup hooks with init trigger, then continue").hideHelp()).addOption(new ic("--init-only", "Run Setup and SessionStart:startup hooks, then exit").hideHelp()).addOption(new ic("--maintenance", "Run Setup hooks with maintenance trigger, then continue").hideHelp()).addOption(new ic("--output-format <format>", 'Output format (only works with --print): "text" (default), "json" (single result), or "stream-json" (realtime streaming)').choices(["text", "json", "stream-json"])).addOption(new ic("--json-schema <schema>", 'JSON Schema for structured output validation. Example: {"type":"object","properties":{"name":{"type":"string"}},"required":["name"]}').argParser(String)).option("--include-hook-events", "Include all hook lifecycle events in the output stream (only works with --output-format=stream-json)", () => true).option("--include-partial-messages", "Include partial message chunks as they arrive (only works with --print and --output-format=stream-json)", () => true).addOption(new ic("--session-mirror", "Emit transcript_mirror frames on stdout (SDK-internal; set by ProcessTransport when sessionStore is configured)").hideHelp()).addOption(new ic("--input-format <format>", 'Input format (only works with --print): "text" (default), or "stream-json" (realtime streaming input)').choices(["text", "stream-json"])).option("--dangerously-skip-permissions", "Bypass all permission checks. Recommended only for sandboxes with no internet access.", () => true).option("--allow-dangerously-skip-permissions", "Enable bypassing all permission checks as an option, without it being enabled by default. Recommended only for sandboxes with no internet access.", () => true).addOption(new ic("--thinking <mode>", "Thinking mode: enabled (equivalent to adaptive), disabled").choices(["enabled", "adaptive", "disabled"]).hideHelp()).addOption(new ic("--thinking-display <display>", "How thinking content appears in the response").choices(["summarized", "omitted"]).hideHelp()).addOption(new ic("--max-thinking-tokens <tokens>", "[DEPRECATED. Use --thinking instead for newer models] Maximum number of thinking tokens (only works with --print)").argParser(Number).hideHelp()).addOption(new ic("--max-turns <turns>", "Maximum number of agentic turns in non-interactive mode. This will early exit the conversation after the specified number of turns. (only works with --print)").argParser(Number).hideHelp()).addOption(new ic("--max-budget-usd <amount>", "Maximum dollar amount to spend on API calls (only works with --print)").argParser(i => {
      let a = Number(i);
      if (isNaN(a) || a <= 0) {
        throw Error("--max-budget-usd must be a positive number greater than 0");
      }
      return a;
    })).addOption(new ic("--task-budget <tokens>", "API-side task budget in tokens (output_config.task_budget)").argParser(i => {
      let a = Number(i);
      if (isNaN(a) || a <= 0 || !Number.isInteger(a)) {
        throw Error("--task-budget must be a positive integer");
      }
      return a;
    }).hideHelp()).option("--replay-user-messages", "Re-emit user messages from stdin back on stdout for acknowledgment (only works with --input-format=stream-json and --output-format=stream-json)", () => true).addOption(new ic("--prompt-suggestions [value]", "Enable prompt suggestions. In print/SDK mode, emits a prompt_suggestion message after each turn with a predicted next user prompt").choices(["true", "false", "1", "0", "yes", "no", "on", "off"]).preset("true").argParser(i => {
      if (!st(i) && !Pl(i)) {
        throw new ybc("Allowed choices are true, false, 1, 0, yes, no, on, off.");
      }
      return !Pl(i);
    })).addOption(new ic("--enable-auth-status", "Enable auth status messages in SDK mode").default(false).hideHelp()).option("--allowedTools, --allowed-tools <tools...>", 'Comma or space-separated list of tool names to allow (e.g. "Bash(git *) Edit")').option("--tools <tools...>", 'Specify the list of available tools from the built-in set. Use "" to disable all tools, "default" to use all tools, or specify tool names (e.g. "Bash,Edit,Read").').option("--disallowedTools, --disallowed-tools <tools...>", 'Comma or space-separated list of tool names to deny (e.g. "Bash(git *) Edit")').option("--mcp-config <configs...>", "Load MCP servers from JSON files or strings (space-separated)").addOption(new ic("--permission-prompt-tool <tool>", "MCP tool to use for permission prompts (only works with --print)").argParser(String).hideHelp()).addOption(new ic("--system-prompt <prompt>", "System prompt to use for the session").argParser(String)).addOption(new ic("--system-prompt-file <file>", "Read system prompt from a file").argParser(String).hideHelp()).addOption(new ic("--append-system-prompt <prompt>", "Append a system prompt to the default system prompt").argParser(String)).addOption(new ic("--append-system-prompt-file <file>", "Read system prompt from a file and append to the default system prompt").argParser(String).hideHelp()).addOption(new ic("--plan-mode-instructions <instructions>", "Custom workflow body for plan mode. Replaces the default code-implementation phases in the plan-mode system reminder; the read-only enforcement preamble and ExitPlanMode protocol footer are always kept.").argParser(String).hideHelp()).addOption(new ic("--exclude-dynamic-system-prompt-sections", "Move per-machine sections (cwd, env info, memory paths, git status) from the system prompt into the first user message. Improves cross-user prompt-cache reuse. Only applies with the default system prompt (ignored with --system-prompt).").default(false)).addOption(new ic("--permission-mode <mode>", "Permission mode to use for the session").argParser(String).choices(INTERNAL_PERMISSION_MODES)).option("-c, --continue", "Continue the most recent conversation in the current directory", () => true).option("-r, --resume [value]", "Resume a conversation by session ID, or open interactive picker with optional search term", i => i || true).option("--fork-session", "When resuming, create a new session ID instead of reusing the original (use with --resume or --continue)", () => true).addOption(new ic("--prefill <text>", "Pre-fill the prompt input with text without submitting it").hideHelp()).addOption(new ic("--deep-link-origin", "Signal that this session was launched from a deep link").hideHelp()).addOption(new ic("--deep-link-repo <slug>", "Repo slug the deep link ?repo= parameter resolved to the current cwd").hideHelp()).addOption(new ic("--deep-link-last-fetch <ms>", "FETCH_HEAD mtime in epoch ms, precomputed by the deep link trampoline").argParser(i => {
      let a = Number(i);
      return Number.isFinite(a) ? a : undefined;
    }).hideHelp()).addOption(new ic("--prefill-b64 <b64>", "Base64url-encoded --prefill value (deep-link shell-safe launch paths)").argParser(i => Buffer.from(i, "base64url").toString("utf8")).hideHelp()).addOption(new ic("--deep-link-cwd-b64 <b64>", "Base64url-encoded working directory (deep-link shell-safe launch paths)").argParser(i => Buffer.from(i, "base64url").toString("utf8")).hideHelp()).option("--from-pr [value]", "Resume a session linked to a PR by PR number/URL, or open interactive picker with optional search term", i => i || true).option("--no-session-persistence", "Disable session persistence - sessions will not be saved to disk and cannot be resumed (only works with --print)").addOption(new ic("--resume-session-at <message id>", "When resuming, only messages up to and including the assistant message with <message.id> (use with --resume in print mode)").argParser(String).hideHelp()).addOption(new ic("--reply-on-resume", "When resuming, immediately query if the loaded transcript ends in a user-role message (set by /background mid-turn so the fork continues the in-flight turn).").hideHelp()).addOption(new ic("--rewind-files <user-message-id>", "Restore files to state at the specified user message and exit (requires --resume)").hideHelp()).option("--model <model>", "Model for the current session. Provide an alias for the latest model (e.g. 'fable', 'opus', or 'sonnet') or a model's full name (e.g. 'claude-fable-5').").addOption(new ic("--effort <level>", `Effort level for the current session (${UC.join(", ")})`).argParser(i => {
      let {
        level: a,
        warning: l
      } = r3i(i);
      if (l !== undefined) {
        process.stderr.write(`Warning: ${l}
`);
      }
      return a;
    })).option("--agent <agent>", "Agent for the current session. Overrides the 'agent' setting.").option("--betas <betas...>", "Beta headers to include in API requests (API key users only)").option("--fallback-model <model>", "Enable automatic fallback to specified model(s) when the default model is overloaded or not available. Accepts a comma-separated list to try each in order. Re-tries the primary at the start of each user turn. (only works with --print)").addOption(new ic("--workload <tag>", "Workload tag for billing-header attribution (cc_workload). Process-scoped; set by SDK daemon callers that spawn subprocesses for cron work. (only works with --print)").hideHelp()).option("--settings <file-or-json>", "Path to a settings JSON file or a JSON string to load additional settings from").addOption(new ic("--managed-settings <json>", "Policy-tier settings JSON from a spawning parent process (SDK use only)").hideHelp()).option("--add-dir <directories...>", "Additional directories to allow tool access to").option("--ide", "Automatically connect to IDE on startup if exactly one valid IDE is available", () => true).option("--strict-mcp-config", "Only use MCP servers from --mcp-config, ignoring all other MCP configurations", () => true).option("--session-id <uuid>", "Use a specific session ID for the conversation (must be a valid UUID)").option("-n, --name <name>", "Set a display name for this session (shown in the prompt box, /resume picker, and terminal title)").option("--agents <json>", `JSON object defining custom agents (e.g. '{"reviewer": {"description": "Reviews code", "prompt": "You are a code reviewer"}}')`).option("--setting-sources <sources>", "Comma-separated list of setting sources to load (user, project, local).").option("--plugin-dir <path>", "Load a plugin from a directory or .zip for this session only (repeatable: --plugin-dir A --plugin-dir B.zip)", (i, a) => [...a, i], []).addOption(new ic("--plugin-dir-no-mcp <path>", "Like --plugin-dir but the engine will not read this plugin's .mcp.json (caller owns its MCP connections)").argParser((i, a) => [...a, i]).default([]).hideHelp()).option("--plugin-url <url>", "Fetch a plugin .zip from a URL for this session only (repeatable: --plugin-url A --plugin-url B)", (i, a) => [...a, ...i.split(/\s+/).filter(Boolean)], []).option("--disable-slash-commands", "Disable all skills", () => true).option("--chrome", "Enable Claude in Chrome integration").option("--no-chrome", "Disable Claude in Chrome integration").option("--file <specs...>", "File resources to download at startup. Format: file_id:relative_path (e.g., --file file_abc:doc.txt file_def:img.png)").action(async (i, a) => {
      if (profileCheckpoint("action_handler_start"), a.deepLinkOrigin && a.prefillB64 !== undefined && a.prefill === undefined) {
        try {
          a.prefill = wQo(a.prefillB64);
        } catch (Yn) {
          logForDebugging(`Ignoring invalid --prefill-b64: ${Yn instanceof Error ? Yn.message : Yn}`, {
            level: "error"
          });
        }
      }
      if (a.deepLinkOrigin && a.deepLinkCwdB64 !== undefined) {
        try {
          vQo(a.deepLinkCwdB64);
          process.chdir(a.deepLinkCwdB64);
          By(a.deepLinkCwdB64);
          setOriginalCwd(Nt());
          setProjectRoot(Nt());
          getProjectPathForConfig.cache?.clear?.();
          resetTrustDialogAcceptedCache();
          clearMemoryFileCaches();
          o_();
          clearPluginCache("deeplink: originalCwd changed");
          resetGitFileWatcher();
          zIe();
        } catch (Yn) {
          logForDebugging(`Ignoring invalid --deep-link-cwd-b64: ${Yn instanceof Error ? Yn.message : Yn}`, {
            level: "error"
          });
        }
      }
      if (a.bare) {
        process.env.CLAUDE_CODE_SIMPLE = "1";
      }
      if (Ql()) {
        process.env.CLAUDE_CODE_SAFE_MODE = "1";
        process.env.CLAUDE_CODE_DISABLE_CLAUDE_MDS = "1";
        Pe("startup_safe_mode");
      }
      let l;
      try {
        l = dus(a.maxTurns);
      } catch (Yn) {
        return Es(he(Yn));
      }
      if (i === "code") {
        logEvent("tengu_code_prompt_ignored", {});
        Y3("Tip: You can launch Claude Code with just `claude`");
        i = undefined;
      }
      if (i && typeof i === "string" && !/\s/.test(i) && i.length > 0) {
        if (logEvent("tengu_single_word_prompt", {
          length: i.length
        }), !a.print && !a.continue && !a.resume && /^[a-zA-Z][a-zA-Z-]*$/.test(i)) {
          await J8f(i, e);
        }
      }
      let c;
      if (isAgentSwarmsEnabled() && !getIsNonInteractiveSession() && !a.agentId) {
        try {
          let {
            initializeSessionTeam: Yn
          } = await Promise.resolve().then(() => (oGc(), rGc));
          c = await Yn();
        } catch (Yn) {
          Oe(Yn);
        }
      }
      if (!Jj()) {
        let Yn = Cqc(a, ks => e.getOptionValueSource(ks));
        logEvent("tengu_cli_flags", {
          flag_count: Yn.length,
          flags: Yn.join(",")
        });
      }
      let {
        debug: u = false,
        dangerouslySkipPermissions: d,
        allowDangerouslySkipPermissions: p = false,
        tools: m = [],
        allowedTools: f = [],
        disallowedTools: h = [],
        mcpConfig: g = [],
        permissionMode: y,
        addDir: _ = [],
        fallbackModel: b,
        betas: S = [],
        ide: E = false,
        sessionId: C,
        includeHookEvents: x,
        includePartialMessages: A,
        sessionMirror: k
      } = a;
      if (a.prefill) {
        seedEarlyInput(a.prefill);
      }
      let I;
      let O = a.agents;
      let M = a.agent;
      if (M) {
        process.env.CLAUDE_CODE_AGENT = M;
      }
      let {
        outputFormat: L,
        inputFormat: P
      } = a;
      let F = getInitialSettings().viewMode;
      let H = alt();
      let U = a.verbose ?? (F ? F === "verbose" : H ? false : uc("verbose", false).value);
      let N = a.print;
      let W = a.init ?? false;
      let j = a.initOnly ?? false;
      let z = a.maintenance ?? false;
      if (!N && process.stdout.isTTY && tM()) {
        console.log("[Accessible screen reader mode: on]");
      }
      let V = a.disableSlashCommands || false;
      setDisableSlashCommands(V);
      let K = undefined;
      let J = K === undefined ? getInitialSettings().autoCompactWindow : K === "auto" ? undefined : K;
      let Q = isWorktreeModeEnabled() ? a.worktree : undefined;
      let Z = typeof Q === "string" ? Q : undefined;
      let ne = Q !== undefined;
      let oe;
      if (Z) {
        let Yn = parsePRReference(Z);
        if (Yn !== null) {
          oe = Yn;
          Z = undefined;
        }
      }
      let ee = isWorktreeModeEnabled() && a.tmux === true;
      if (ee) {
        if (!ne) {
          return Es("Error: --tmux requires --worktree");
        }
        if (Wt() === "windows") {
          return Es("Error: --tmux is not supported on Windows");
        }
        if (!(await isTmuxAvailable_export())) {
          return Es(`Error: tmux is not installed.
${getTmuxInstallInstructions()}`);
        }
      }
      let re;
      if (isAgentSwarmsEnabled()) {
        let Yn = Y8f(a);
        re = Yn;
        let ks = Yn.agentId || Yn.agentName || Yn.teamName;
        let Ui = Yn.agentId && Yn.agentName && Yn.teamName;
        if (ks && !Ui) {
          return Es("Error: --agent-id, --agent-name, and --team-name must all be provided together");
        }
        if (Yn.agentId && Yn.agentName && Yn.teamName) {
          AXc().setDynamicTeamContext?.({
            agentId: Yn.agentId,
            agentName: Yn.agentName,
            teamName: Yn.teamName,
            color: Yn.agentColor,
            planModeRequired: Yn.planModeRequired ?? false,
            parentSessionId: Yn.parentSessionId
          });
        }
        if (Yn.teammateMode) {
          L8f().setCliTeammateModeOverride?.(Yn.teammateMode);
        }
      }
      let se = a.sdkUrl ?? undefined;
      let ae = A || st(process.env.CLAUDE_CODE_INCLUDE_PARTIAL_MESSAGES);
      if (x || st(process.env.CLAUDE_CODE_REMOTE)) {
        EUl(true);
      }
      if (se) {
        if (!P) {
          P = "stream-json";
        }
        if (!L) {
          L = "stream-json";
        }
        if (a.verbose === undefined) {
          U = true;
        }
        if (!a.print) {
          N = true;
        }
      }
      let de = a.teleport ?? null;
      let be = a.cloud ?? a.remote;
      let fe = be === true ? "" : be ?? null;
      let me = typeof be === "string" ? Vts(be) : null;
      let Te = null;
      let ue = false;
      let ce = null;
      let le = null;
      let pe;
      let ve = false;
      let _e = null;
      let xe = null;
      if (fe !== null) {
        let Yn = Csc({
          print: a.print,
          nonInteractive: getIsNonInteractiveSession(),
          continue: a.continue,
          resume: a.resume,
          fromPr: a.fromPr,
          hasTeleport: de !== null,
          hasConnect: Boolean(undefined?.url),
          hasSSH: Boolean(undefined?.host),
          hasAssistant: false,
          hasPool: Te !== null,
          hasProject: _e !== null,
          isCloudAttach: me !== null
        });
        if (Yn) {
          return Es(Yn);
        }
      }
      let ke = a.remoteControl ?? a.rc;
      let Ie = false;
      let Ue = typeof ke === "string" && ke.length > 0 ? ke : undefined;
      let Ge = a.remoteControlSessionNamePrefix;
      if (Ge) {
        process.env.CLAUDE_REMOTE_CONTROL_SESSION_NAME_PREFIX = Ge;
      }
      if (C) {
        if ((a.continue || a.resume) && !a.forkSession) {
          return Es("Error: --session-id can only be used with --continue or --resume if --fork-session is also specified.");
        }
        if (!se) {
          let Yn = kD(C);
          if (!Yn) {
            return Es("Error: Invalid session ID. Must be a valid UUID.");
          }
          if (!(a.forkSession && a.resume === Yn) && sessionIdExists(Yn)) {
            return Es(`Error: Session ID ${Yn} is already in use.`);
          }
        }
      }
      let Be = a.file;
      if (Be && Be.length > 0) {
        let Yn = cT();
        if (!Yn) {
          return Es("Error: Session token required for file downloads. CLAUDE_CODE_SESSION_ACCESS_TOKEN must be set.");
        }
        let ks = process.env.CLAUDE_CODE_REMOTE_SESSION_ID || getSessionId();
        let Ui = Fhl(Be);
        if (Ui.length > 0) {
          let Ca = {
            baseUrl: process.env.ANTHROPIC_BASE_URL || getOauthConfig().BASE_API_URL,
            oauthToken: Yn,
            sessionId: ks
          };
          I = Nhl(Ui, Ca);
        }
      }
      let We = getIsNonInteractiveSession();
      let Ze = b === a.model ? undefined : b;
      let Tt = a.systemPrompt;
      if (a.systemPromptFile) {
        if (a.systemPrompt) {
          return Es("Error: Cannot use both --system-prompt and --system-prompt-file. Please use only one.");
        }
        try {
          let Yn = TRe.resolve(a.systemPromptFile);
          Tt = await uis.readFile(Yn, "utf8");
        } catch (Yn) {
          if (en(Yn) === "ENOENT") {
            return Es(`Error: System prompt file not found: ${TRe.resolve(a.systemPromptFile)}`);
          }
          return Es(`Error reading system prompt file: ${he(Yn)}`);
        }
      }
      let kt = a.appendSystemPrompt;
      if (a.appendSystemPromptFile) {
        if (a.appendSystemPrompt) {
          return Es("Error: Cannot use both --append-system-prompt and --append-system-prompt-file. Please use only one.");
        }
        try {
          let Yn = TRe.resolve(a.appendSystemPromptFile);
          kt = await uis.readFile(Yn, "utf8");
        } catch (Yn) {
          if (en(Yn) === "ENOENT") {
            return Es(`Error: Append system prompt file not found: ${TRe.resolve(a.appendSystemPromptFile)}`);
          }
          return Es(`Error reading append system prompt file: ${he(Yn)}`);
        }
      }
      let {
        systemPrompt: Ye,
        appendSystemPrompt: ht
      } = f3i({
        cli: {
          systemPrompt: Tt,
          appendSystemPrompt: kt
        },
        env: process.env,
        settings: getInitialSettings()
      });
      if (isAgentSwarmsEnabled() && re?.agentId && re?.agentName && re?.teamName) {
        let Yn = N8f().TEAMMATE_SYSTEM_PROMPT_ADDENDUM;
        ht = ht ? `${ht}

${Yn}` : Yn;
      }
      let It = M ? getBuiltInAgents().find(Yn => Yn.agentType === M)?.permissionMode : undefined;
      let {
        mode: Rt,
        notification: wt
      } = initialPermissionModeFromCLI({
        permissionModeCli: y,
        dangerouslySkipPermissions: d,
        agentPermissionMode: It
      });
      if (setSessionBypassPermissionsMode(Rt === "bypassPermissions"), a.enableAutoMode || y === "auto" || It === "auto" || Rt === "auto" && !IXc?.isAutoModeFromFallback() || !y && isDefaultPermissionModeAuto()) {
        IXc?.setAutoModeFlagCli(true);
      }
      await G5({
        hasDynamicMcpConfig: Boolean(g && g.length > 0) || E,
        pluginStateReliable: t
      });
      let vt = {};
      if (g && g.length > 0) {
        let Yn = g.map(Ca => Ca.trim()).filter(Ca => Ca.length > 0);
        let ks = {};
        let Ui = [];
        for (let Ca of Yn) {
          let gc = null;
          let Je = [];
          let rt = Ba(Ca, false);
          if (rt) {
            let cn = parseMcpConfig({
              configObject: rt,
              filePath: "command line",
              expandVars: true,
              scope: "dynamic"
            });
            if (cn.config) {
              gc = cn.config.mcpServers;
            }
            Je = cn.errors;
          } else {
            let cn = TRe.resolve(Ca);
            let Gn = parseMcpConfigFromFilePath({
              filePath: cn,
              expandVars: true,
              scope: "dynamic"
            });
            if (Gn.config) {
              gc = Gn.config.mcpServers;
            }
            Je = Gn.errors;
          }
          if (gc) {
            if (ks = {
              ...ks,
              ...gc
            }, Je.length > 0) {
              logForDebugging(`--mcp-config: ${Je.length} entry warning(s): ${Je.map(cn => `${cn.path ? cn.path + ": " : ""}${cn.message}`).join("; ")}`, {
                level: "warn"
              });
            }
          } else {
            Ui.push(...Je);
          }
        }
        if (Ui.length > 0) {
          let Ca = Ui.map(gc => `${gc.path ? gc.path + ": " : ""}${gc.message}`).join(`
`);
          logForDebugging(`--mcp-config validation failed (${Ui.length} errors): ${Ca}`, {
            level: "error"
          });
          return Es(`Error: Invalid MCP configuration:
${Ca}`);
        }
        if (Object.keys(ks).length > 0) {
          if (areSideloadFlagsDisabledByPolicy() && !areMcpConfigsAllSdkType(ks)) {
            return Es(sideloadFlagsBlockedMessage(["--mcp-config"]));
          }
          let Ca = Sbu(ks, $r => ({
            ...$r,
            scope: "dynamic"
          }));
          let {
            allowed: gc,
            blocked: Je
          } = filterMcpServersByPolicy(Ca);
          if (Je.length > 0) {
            Y3(`Warning: MCP ${un(Je.length, "server")} blocked by enterprise policy: ${Je.join(", ")}`);
          }
          let {
            servers: rt,
            dropped: cn,
            reason: Gn
          } = Sqc(gc);
          if (cn.length > 0) {
            logForDebugging(`--mcp-config: ${un(cn.length, "server")} ignored in ${Gn}: ${cn.join(", ")}`, {
              level: "warn"
            });
          }
          vt = {
            ...vt,
            ...rt
          };
        }
      }
      let yt = a;
      setChromeFlagOverride(yt.chrome);
      let gt = shouldEnableClaudeInChrome(yt.chrome) && isClaudeAISubscriber();
      let Ft = isMcpServerDenied("claude-in-chrome", getClaudeInChromeMcpServerConfig());
      let on = doesEnterpriseMcpConfigExist() || Ft;
      let rn = !gt && !on && shouldAutoEnableClaudeInChrome();
      let Sn = gt && yt.chrome !== true && Me.CLAUDE_CODE_ENABLE_CFC !== true && on;
      let jn = gt && yt.chrome !== true && Me.CLAUDE_CODE_ENABLE_CFC !== true && Ql();
      if (Sn) {
        logForDebugging("[Claude in Chrome] Skipping chrome wiring: blocked by enterprise MCP config or managed deniedMcpServers policy");
      } else if (jn) {
        logForDebugging("[Claude in Chrome] Skipping chrome wiring: --safe-mode disables MCP");
      } else if (gt && Ft) {
        if (We) {
          logForDebugging(`[Claude in Chrome] MCP server blocked by enterprise policy: ${"claude-in-chrome"}`, {
            level: "warn"
          });
        } else {
          Y3(`Warning: MCP server blocked by enterprise policy: ${"claude-in-chrome"}`);
        }
      } else if (gt) {
        let Yn = Wt();
        try {
          logEvent("tengu_claude_in_chrome_setup", {
            platform: L8(Yn)
          });
          let {
            mcpConfig: ks,
            allowedTools: Ui,
            systemPrompt: Ca
          } = setupClaudeInChrome();
          if (vt = {
            ...vt,
            ...ks
          }, f.push(...Ui), Ca) {
            ht = ht ? `${Ca}

${ht}` : Ca;
          }
        } catch (ks) {
          logEvent("tengu_claude_in_chrome_setup_failed", {
            platform: L8(Yn)
          });
          logForDebugging(`[Claude in Chrome] Error: ${ks}`);
          Oe(ks);
          return Es("Error: Failed to run with Claude in Chrome.");
        }
      }
      let Xr = a;
      let co = a.strictMcpConfig || false;
      if (setStrictMcpConfig(co), setPermissionPromptToolName(se ? "stdio" : a.permissionPromptTool), setReplConfigArgv([...FQe(LQe({
        settings: typeof a.settings === "string" ? a.settings : undefined,
        pluginDir: getInlinePlugins(),
        pluginDirNoMcp: getInlinePluginsNoMcp(),
        addDir: _,
        mcpConfig: g,
        strictMcpConfig: co
      }, TRe.resolve)), ...(Ze ? ["--fallback-model", Ze] : []), ...(p ? ["--allow-dangerously-skip-permissions"] : []), ...(V ? ["--disable-slash-commands"] : []), ...(Xr.channels ?? []).flatMap(Yn => ["--channels", Yn])]), doesEnterpriseMcpConfigExist()) {
        if (co) {
          return Es("You cannot use --strict-mcp-config when an enterprise MCP config is present");
        }
        if (vt && !areMcpConfigsAllowedWithEnterpriseMcpConfig(vt)) {
          return Es("You cannot dynamically configure MCP servers when an enterprise MCP config is present");
        }
      }
      if (Wt() === "macos" && !getIsNonInteractiveSession() && SGn()) {
        try {
          let {
            setupComputerUseMCP: Yn
          } = await Promise.resolve().then(() => (lGc(), aGc));
          let {
            mcpConfig: ks,
            allowedTools: Ui
          } = Yn();
          vt = {
            ...vt,
            ...ks
          };
          f.push(...Ui);
        } catch (Yn) {
          logForDebugging(`[Computer Use MCP] Setup failed: ${he(Yn)}`);
        }
      }
      setAdditionalDirectoriesForClaudeMd(_);
      let Yt;
      let Ee = (Yn, ks) => {
        let Ui = [];
        let Ca = [];
        for (let gc of Yn) {
          if (gc.startsWith("plugin:")) {
            let Je = gc.slice(7);
            let rt = Je.indexOf("@");
            if (rt <= 0 || rt === Je.length - 1) {
              Ca.push(gc);
            } else {
              Ui.push({
                kind: "plugin",
                name: Je.slice(0, rt),
                marketplace: Je.slice(rt + 1)
              });
            }
          } else if (gc.startsWith("server:") && gc.length > 7) {
            Ui.push({
              kind: "server",
              name: gc.slice(7)
            });
          } else {
            Ca.push(gc);
          }
        }
        if (Ca.length > 0) {
          Es(`${ks} entries must be tagged: ${Ca.join(", ")}
` + `  plugin:<name>@<marketplace>  \u2014 plugin-provided channel (allowlist enforced)
` + "  server:<name>                \u2014 manually configured MCP server");
        }
        return Ui;
      };
      let Re = Xr.channels;
      let Ce = Xr.dangerouslyLoadDevelopmentChannels;
      let Fe = [];
      if (Re && Re.length > 0) {
        Fe = Ee(Re, "--channels");
        setAllowedChannels(Fe);
      }
      if (!We) {
        if (Ce && Ce.length > 0) {
          Yt = Ee(Ce, "--dangerously-load-development-channels");
        }
      }
      if (Fe.length > 0 || (Yt?.length ?? 0) > 0) {
        let Yn = ks => {
          let Ui = ks.flatMap(Ca => Ca.kind === "plugin" ? [`${Ca.name}@${Ca.marketplace}`] : []);
          return Ui.length > 0 ? Ui.sort().join(",") : undefined;
        };
        logEvent("tengu_mcp_channel_flags", {
          channels_count: Fe.length,
          dev_count: Yt?.length ?? 0,
          plugins: Yn(Fe),
          dev_plugins: Yn(Yt ?? [])
        });
      }
      if (m.length > 0) {
        D3();
        let {
          shouldToolsListOptInToBrief: Yn
        } = __toCommonJS(CZ);
        if (Yn(parseToolListFromCLI(m))) {
          setUserMsgOptIn(true);
        }
      }
      let Xe = performance.now();
      let He = await Oqc({
        allowedTools: f,
        disallowedTools: h,
        baseTools: m,
        permissionMode: Rt,
        allowDangerouslySkipPermissions: p,
        addDirs: _
      });
      let Gt = He.toolPermissionContext;
      let {
        warnings: mt,
        overlyBroadBashPermissions: Dt
      } = He;
      au("permission_context_ms", performance.now() - Xe, Xe);
      mt.forEach(Y3);
      Mll();
      let jt = We && !co && !shouldSkipClaudeAiFetchForEnterpriseLockdown() && !kd() ? iNe().then(Yn => {
        EWn();
        let {
          allowed: ks,
          blocked: Ui
        } = filterMcpServersByPolicy(Yn ?? {});
        if (Ui.length > 0) {
          Y3(`Warning: claude.ai MCP ${un(Ui.length, "server")} blocked by enterprise policy: ${Ui.join(", ")}`);
        }
        return ks;
      }) : Promise.resolve({});
      if (kWc({
        remote: fe,
        isNonInteractiveSession: We,
        isContinue: Boolean(a.continue),
        pendingAssistantChat: undefined,
        pendingConnectUrl: undefined?.url,
        pendingSSHHost: undefined?.host
      })) {
        setIsRemoteMode(true);
      }
      logForDebugging("[STARTUP] Loading MCP configs...");
      let bn = Date.now();
      let Ct;
      let hn = (co || kd() || getIsRemoteMode() ? Promise.resolve({
        servers: {}
      }) : getClaudeCodeMcpConfigs(vt)).then(Yn => (Ct = Date.now() - bn, Yn));
      let vn = checkHasTrustDialogAccepted();
      if (P && P !== "text" && P !== "stream-json") {
        return Es(`Error: Invalid input format "${P}".`);
      }
      if (P === "stream-json" && L !== "stream-json") {
        return Es("Error: --input-format=stream-json requires output-format=stream-json.");
      }
      if (P === "stream-json" && !getIsNonInteractiveSession()) {
        return Es("Error: --input-format=stream-json requires --print.");
      }
      if (se) {
        if (P !== "stream-json" || L !== "stream-json") {
          return Es("Error: --sdk-url requires both --input-format=stream-json and --output-format=stream-json.");
        }
        let Yn = qTc(se);
        if (Yn !== null) {
          await logEventAsync("tengu_sdk_url_host_rejected", {});
          return Ih(`Error: --sdk-url rejected: ${Yn}. This flag is reserved for Remote Control worker processes connecting to Anthropic's backend.`);
        }
        if (!st(process.env.CLAUDE_CODE_REMOTE)) {
          await waitForPolicyLimitsToLoad();
          let ks = policyDeniedReason("allow_remote_control", "Remote Control", "is");
          if (ks) {
            return Es(ks);
          }
          if (getSettingsWithErrors().settings.disableRemoteControl === true) {
            return Es("Error: Remote Control is disabled by your organization's policy (managed setting `disableRemoteControl`).");
          }
        }
      }
      if (a.replayUserMessages) {
        if (P !== "stream-json" || L !== "stream-json") {
          return Es("Error: --replay-user-messages requires both --input-format=stream-json and --output-format=stream-json.");
        }
      }
      if (a.promptSuggestions && (!We || L !== "stream-json")) {
        return Es("Error: --prompt-suggestions requires --print and --output-format=stream-json (prompt_suggestion messages are only surfaced in stream-json output).");
      }
      if (ae) {
        if (!We || L !== "stream-json") {
          if (A) {
            return Es("Error: --include-partial-messages requires --print and --output-format=stream-json.");
          }
          ae = false;
        }
      }
      if (a.sessionPersistence === false && !We) {
        return Es("Error: --no-session-persistence can only be used with --print mode.");
      }
      if (a.planModeInstructions && !We) {
        return Es("Error: --plan-mode-instructions can only be used with --print mode.");
      }
      let Pn = await G8f(i || "", P ?? "text");
      let Lr = typeof Pn === "string" ? Pn : null;
      profileCheckpoint("action_after_input_prompt");
      let ao;
      if (apa({
        isNonInteractiveSession: We,
        isBgSession: li()
      }) && a.jsonSchema) {
        try {
          ao = qt(a.jsonSchema);
        } catch (Yn) {
          return Es(`Error: --json-schema is not valid JSON: ${he(Yn)}`);
        }
        if (typeof ao !== "object" || ao === null || Array.isArray(ao)) {
          return Es("Error: --json-schema must be a JSON object");
        }
      }
      profileCheckpoint("action_before_setup");
      logForDebugging("[STARTUP] Running setup()...");
      let Nn = Date.now();
      let Tr = performance.now();
      let {
        setup: To
      } = await Promise.resolve().then(() => (ffr(), mfr));
      au("setup_import_ms", performance.now() - Tr, Tr);
      let wr = undefined;
      let Ut = Nt();
      if (process.env.CLAUDE_CODE_ENTRYPOINT !== "local-agent") {
        cyr();
        pyr();
      }
      let Wn = !!undefined?.host;
      if (getIsNonInteractiveSession()) {
        setSessionTrustAccepted(true);
      }
      if (shouldAwaitPolicyLimitsOnStartup()) {
        let Yn = performance.now();
        await withTimeout(waitForPolicyLimitsToLoad(), 5000, "policy_limits_cold_await").then(() => recordPolicyLimitsStartupAwaitResult("completed"), () => recordPolicyLimitsStartupAwaitResult("timed_out"));
        au("policy_limits_await_ms", performance.now() - Yn, Yn);
        profileCheckpoint("action_after_policy_limits_cold_await");
      }
      let Fr = To(Ut, Wn ? "default" : Rt, Wn ? false : p, ne, Z, ee, C ? kD(C) : undefined, oe, wr);
      let Is = ne ? null : getCommands(Ut);
      let _r = ne ? null : getAgentDefinitionsWithOverrides(Ut);
      Is?.catch(() => {});
      _r?.catch(() => {});
      let kn = performance.now();
      try {
        await Fr;
      } catch (Yn) {
        if (Yn instanceof Ucn) {
          return Es(Yn.message);
        }
        throw Yn;
      }
      au("setup_ms", performance.now() - kn, kn);
      logForDebugging(`[STARTUP] setup() completed in ${Date.now() - Nn}ms`);
      profileCheckpoint("action_after_setup");
      let Qn = !!a.replayUserMessages;
      if (getIsNonInteractiveSession()) {
        applyConfigEnvironmentVariables();
        Tv();
        iE();
        iwn();
      }
      let gi = a.name?.trim();
      if (gi) {
        cacheSessionTitle(gi);
        cacheAgentName(gi);
      }
      let Ks = a.model || process.env.ANTHROPIC_MODEL;
      let Fa = a.model === "default" ? getDefaultMainLoopModel() : a.model;
      let Hs = p3i({
        cli: {
          fallbackModel: Ze
        },
        env: process.env,
        settings: getInitialSettings()
      });
      let Ms = ne ? Nt() : Ut;
      if (is1PEventLoggingEnabled() && Object.keys(getGlobalConfig().cachedGrowthBookFeatures ?? {}).length === 0) {
        profileCheckpoint("before_growthbook_init");
        let Yn = performance.now();
        await withTimeout(initializeGrowthBook(), 1500, "gb-before-tools").catch(() => {});
        au("growthbook_init_ms", performance.now() - Yn, Yn);
        profileCheckpoint("after_growthbook_init");
      }
      let Ia = ne ? null : getCommands(Ms);
      if (Ia?.catch(() => {}), Rb() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_thicket", true)) {
        N9i(true);
      }
      logForDebugging("[STARTUP] Loading commands and agents...");
      let ec = Date.now();
      let Os = await Mqc({
        cwd: Ms,
        toolPermissionContext: Gt,
        applyCoordinatorFilter: true,
        agentsJson: O,
        agentSetting: M,
        commandsPromise: Ia,
        agentDefsPromise: _r,
        deferCommands: Nqc(We),
        onToolsLoaded: () => profileCheckpoint("action_tools_loaded")
      });
      au("tools_commands_load_ms", performance.now() - 0, 0);
      let {
        tools: Kn,
        mainThreadAgentDefinition: sn,
        commands: Ln
      } = Os;
      let {
        agentDefinitions: ct,
        cliAgents: Br,
        deferredCommandsPromise: Pr
      } = Os;
      if (M && !sn && P !== "stream-json" && M !== CLAUDE_AGENT.agentType && !a.resume && !a.continue && !Me.CLAUDE_BG_POST_CLEAR_RESPAWN) {
        let Yn = ct.activeAgents.map(ks => ks.agentType).join(", ");
        return Es(`--agent '${M}' not found. Available agents: ${Yn || "(none)"}`);
      }
      if (addStartupContext({
        tool_count: Kn.length,
        skill_count: Bn(Ln, isSkillToolCommand)
      }), Pr?.then(Yn => addStartupContext({
        skill_count: Bn(Yn, isSkillToolCommand)
      }), () => {}), loadAllPluginsCacheOnly().then(Yn => addStartupContext({
        plugin_count: Yn.enabled.length
      }), () => {}), !sn && isAgentSwarmsEnabled() && re?.agentId && re?.agentName && re?.teamName && re?.agentType) {
        let Yn = ct.activeAgents.find(ks => ks.agentType === re.agentType);
        if (Yn) {
          sn = Yn;
          setMainThreadAgentType(Yn.agentType);
        } else {
          logForDebugging(`[teammate] Custom agent ${re.agentType} not found in available agents`);
        }
      }
      let Vr = M ?? getSettingsAfterPluginLoad("agent");
      if (!sn && !M && Vr) {
        sn = hts(ct.activeAgents, Vr);
        setMainThreadAgentType(sn?.agentType);
      }
      logForDebugging(`[STARTUP] Commands and agents loaded in ${Date.now() - ec}ms`);
      profileCheckpoint("action_commands_loaded");
      let Xo;
      if (ao) {
        let Yn = jdt(ao);
        if ("tool" in Yn) {
          let ks = Yn.tool;
          if (li()) {
            let Ui = ks.call.bind(ks);
            ks = {
              ...ks,
              async call(Ca, gc, Je, rt, cn) {
                let Gn = await Ui(Ca, gc, Je, rt, cn);
                let {
                  stashBgStructuredResult: $r
                } = await Promise.resolve().then(() => (_rr(), yrr));
                $r(Ca);
                return Gn;
              }
            };
          }
          Xo = ks;
          Kn = [...Kn, ks];
          logEvent("tengu_structured_output_enabled", {
            schema_property_count: Object.keys(ao.properties || {}).length,
            has_required_fields: Boolean(ao.required)
          });
        } else {
          logEvent("tengu_structured_output_failure", {
            error: "Invalid JSON schema"
          });
        }
      }
      if (sn) {
        logEvent("tengu_agent_flag", {
          agentType: isBuiltInAgent(sn) ? sn.agentType : "custom",
          ...(M && {
            source: "cli"
          })
        });
      }
      if (sn?.agentType) {
        saveAgentSetting(sn.agentType);
      }
      if (We && sn && !isBuiltInAgent(sn)) {
        let Yn = sn.getSystemPrompt();
        if (Yn) {
          if (sn.appendSystemPrompt) {
            ht = ht ? `${Yn}

${ht}` : Yn;
          } else if (!Ye) {
            Ye = Yn;
          }
        }
      }
      if (sn?.initialPrompt) {
        let Yn = sn.initialPrompt;
        if (typeof Pn === "string") {
          Pn = Yn.includes("{{intent}}") ? Yn.split("{{intent}}").join(Pn) : Pn ? `${Yn}

${Pn}` : Yn;
        } else if (!Pn) {
          Pn = Yn;
        }
      }
      let qo;
      let ss;
      if (getIsNonInteractiveSession() && !Me.CLAUDE_CODE_SKIP_BEDROCK_AUTH && !Me.CLAUDE_CODE_SKIP_VERTEX_AUTH && !Me.CLAUDE_CODE_SKIP_MANTLE_AUTH) {
        try {
          let {
            apply3PDefaultFallbacks: Yn
          } = await Promise.resolve().then(() => (Rts(), Jqc));
          let {
            lines: ks,
            mantleOverride: Ui
          } = await Yn();
          ss = Ui;
          for (let Ca of ks) {
            process.stderr.write(`Warning: ${Ca}
`);
          }
        } catch (Yn) {
          Oe(Yn);
        }
      }
      let {
        effectiveModel: Ri,
        initialMainLoopModel: ya,
        resolvedInitialModel: fs,
        rawModelRequest: tc,
        restrictedModel: On
      } = P4c({
        userSpecifiedModel: Fa,
        agentModel: sn?.model
      });
      if (ss && Ri == null) {
        setMainLoopModelOverride(ss);
      }
      {
        let Yn = kDn(a.effort);
        let ks = t3i(Yn, fs);
        if (ks !== null) {
          if (L !== "json" && L !== "stream-json" && Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
            Y3(ks);
          } else {
            logForDebugging(`[effort] ${ks}`, {
              level: "warn"
            });
          }
        }
      }
      let lr;
      if (FV()) {
        let Yn = a.advisor;
        if (Yn) {
          if (logForDebugging(`[AdvisorTool] --advisor ${Yn}`), !jDe(fs)) {
            if (Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
              return Es(`Error: The model "${fs}" does not support the advisor tool.`);
            }
            logForDebugging(`[AdvisorTool] The model "${fs}" does not support the advisor tool.`, {
              level: "warn"
            });
          }
          let ks = normalizeModelStringForAPI(parseUserSpecifiedModel(Yn));
          if (!qDe(ks)) {
            if (Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
              return Es(`Error: The model "${Yn}" cannot be used as an advisor.`);
            }
            logForDebugging(`[AdvisorTool] The model "${Yn}" cannot be used as an advisor.`, {
              level: "warn"
            });
          }
          if (!l5e(fs, ks)) {
            let Ui = `"${Yn}" cannot advise "${fs}" (the advisor must be at least as capable as the main model). The advisor will not be used for the main model.`;
            if (Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
              Y3(Ui);
            } else {
              logForDebugging(`[AdvisorTool] ${Ui}`, {
                level: "warn"
              });
            }
          }
        }
        if (lr = Yn ?? QHn(), lr) {
          logForDebugging(`[AdvisorTool] Advisor model: ${lr}`);
        }
      }
      if (JSr(a), !getIsNonInteractiveSession() && !getUserMsgOptIn() && getInitialSettings().defaultView === "chat") {
        D3();
        let {
          isBriefEntitled: Yn
        } = __toCommonJS(CZ);
        if (Yn()) {
          setUserMsgOptIn(true);
        }
      }
      let Mn;
      let Un;
      let Er;
      let Or = false;
      let Y = null;
      let Se = hasSkipDangerousModePermissionPrompt();
      if (!We) {
        let Yn = f4c(false);
        Un = Yn.getFpsMetrics;
        Er = Yn.stats;
        let {
          createRoot: ks
        } = await Promise.resolve().then(() => (et(), fG));
        Mn = await ks(Yn.renderOptions);
        logEvent("tengu_timer", {
          event: "startup",
          durationMs: Math.round(process.uptime() * 1000),
          resumed: !!(a.resume || a.continue)
        });
        logForDebugging("[STARTUP] Running showSetupScreens()...");
        let Ui = Date.now();
        let Ca = false;
        let gc = shouldSuppressChromeOffer({
          isSSHPending: Wn,
          isRemoteMode: getIsRemoteMode(),
          hasTeleport: Boolean(de),
          isSafeMode: Ql(),
          permissionMode: Rt,
          isBypassPermissionsModeAvailable: Gt.isBypassPermissionsModeAvailable,
          teammateAgentId: re?.agentId
        });
        if ({
          onboardingShown: Or,
          mcpApprovalSkipWarning: Y,
          claudeInChromeAccepted: Ca
        } = await p4c(Mn, Wn ? "default" : Rt, Wn ? false : p, Ln, Sn || gt && Ft ? false : gt, Yt, gc ? false : rn), setOnboardingShownThisSession(Or), logForDebugging(`[STARTUP] showSetupScreens() completed in ${Date.now() - Ui}ms`), !vn && checkHasTrustDialogAccepted() && !co && !kd() && !getIsRemoteMode()) {
          let rt = Date.now();
          hn = getClaudeCodeMcpConfigs(vt).then(cn => (Ct = Date.now() - rt, cn));
        }
        if (Ca) {
          try {
            logEvent("tengu_claude_in_chrome_setup", {
              platform: L8(Wt())
            });
            let {
              mcpConfig: rt,
              systemPrompt: cn
            } = setupClaudeInChrome();
            if (vt = {
              ...vt,
              ...rt
            }, cn) {
              ht = ht ? `${cn}

${ht}` : cn;
            }
          } catch (rt) {
            logEvent("tengu_claude_in_chrome_setup_failed", {
              platform: L8(Wt())
            });
            Oe(rt);
            logForDebugging(`[Claude in Chrome] Error (startup offer): ${rt}`);
          }
          try {
            Ln = gyp([...Ln, ...(await getCommands(Ms))], "name");
          } catch (rt) {
            logForDebugging(`[Claude in Chrome] command refresh after accept failed: ${rt}`);
          }
        }
        if (ke !== undefined) {
          let rt;
          if (getIsRemoteMode()) {
            rt = "Remote Control is not available inside a cloud session.";
          } else if (de) {
            rt = "--teleport sessions start without Remote Control. Use /remote-control to enable it.";
          } else {
            let {
              getBridgeDisabledReason: cn
            } = await Promise.resolve().then(() => (Ox(), Lmr));
            rt = await cn();
          }
          if (Ie = rt === null, rt) {
            Y3(`${rt}
--rc flag ignored.`);
          } else {
            pdr();
          }
        }
        if (Or && i?.trim().toLowerCase() === "/login") {
          i = "";
        }
        if (Or) {
          if (getSettingsForSource("policySettings")?.forceRemoteSettingsRefresh) {
            let rt = await ACo(V8e);
            if (!rt.valid) {
              return await IL(Mn, rt.message);
            }
          } else if (getAPIProvider() === "gateway") {
            if (!(await V8e())) {
              return await IL(Mn, `Couldn't load settings from Cloud gateway ${getGatewayAuth()?.url ?? ""}. Check your network connection, or run \`claude auth login\` to re-authenticate.`);
            }
          } else {
            V8e();
          }
          if (getAPIProvider() === "gateway") {
            if (SQn()) {
              saveGlobalConfig(rt => ({
                ...rt,
                hasCompletedOnboarding: true,
                lastOnboardingVersion: {
                  ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
                  PACKAGE_URL: "@anthropic-ai/claude-code",
                  README_URL: "https://code.claude.com/docs/en/overview",
                  VERSION: "2.1.198",
                  FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
                  BUILD_TIME: "2026-07-01T06:09:31Z",
                  GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
                }.VERSION
              }));
              Mn.unmount();
              return await Promise.resolve().then(() => (bze(), _ze)).then(rt => rt.execRelaunch());
            }
            vQn("gateway");
            applyConfigEnvironmentVariables();
          }
          refreshPolicyLimits();
          _Ie();
          refreshGrowthBookAfterAuthChange();
          Promise.resolve().then(() => (CQ(), k5n)).then(rt => (rt.clearTrustedDeviceToken(), rt.enrollTrustedDevice()));
        }
        let Je = await validateForceLoginOrg();
        if (!Je.valid) {
          await IL(Mn, Je.message, () => flushAnalyticsSinks_export());
        }
      }
      if (process.exitCode !== undefined) {
        logForDebugging("Graceful shutdown initiated, skipping further initialization");
        return;
      }
      if (NWa(), !We) {
        let {
          errors: Yn
        } = getSettingsWithErrors();
        let ks = Yn.filter(Ui => !Ui.mcpErrorMetadata);
        if (ks.length > 0 && !j4c()) {
          q4c(ks);
        } else if (ks.length > 0) {
          if ((await R4c(Mn, {
            settingsErrors: ks,
            onExit: () => gracefulShutdownSync(1)
          })) === "fix") {
            let {
              buildFixPrompt: Ca
            } = await Promise.resolve().then(() => (tar(), n3o));
            let gc = Ca(null, null, ks, [], [], null, [], [], []);
            if (gc) {
              Pn = Pn ? `${gc}

${Pn}` : gc;
            }
          }
        }
      }
      let qe = getFeatureValue_CACHED_MAY_BE_STALE("tengu_cicada_nap_ms", 0);
      let Qe = getGlobalConfig().startupPrefetchedAt ?? 0;
      if (!(kd() || qe > 0 && Date.now() - Qe < qe)) {
        let Yn = Qe > 0 ? ` last ran ${Math.round((Date.now() - Qe) / 1000)}s ago` : "";
        if (logForDebugging(`Starting background startup prefetches${Yn}`), Dha().catch(ks => Oe(ks)), fetchBootstrapData(), vJl(), est(), qe > 0) {
          saveGlobalConfig(ks => ({
            ...ks,
            startupPrefetchedAt: Date.now()
          }));
        }
      } else {
        if (logForDebugging(`Skipping startup prefetches, last ran ${Math.round((Date.now() - Qe) / 1000)}s ago`), !kd() && !hasClientDataCacheSlot()) {
          fetchBootstrapData();
        }
        aWr();
      }
      if (!We) {
        Skc();
      }
      let {
        servers: nn
      } = await hn;
      if (logForDebugging(`[STARTUP] MCP configs resolved in ${Ct}ms (awaited at +${Date.now() - bn}ms)`), vt = zxt(vt, sn, {
        strictMcpConfig: co,
        onBlocked: Yn => Y3(`Warning: agent frontmatter MCP ${un(Yn.length, "server")} blocked by enterprise policy: ${Yn.join(", ")}`)
      }), Object.keys(vt).length > 0) {
        await G5({
          hasDynamicMcpConfig: true
        });
      }
      let {
        configs: qn,
        blocked: zr
      } = filterDynamicMcpServersByPolicy(vt);
      let {
        allowed: wo,
        blocked: Nr
      } = filterMcpServersByPolicy(nn);
      let pi = [...zr, ...Nr];
      if (pi.length > 0) {
        if (logForDebugging(`MCP ${un(pi.length, "server")} blocked by enterprise policy before prefetch: ${pi.join(", ")}`, {
          level: "warn"
        }), pi.includes("claude-in-chrome")) {
          markClaudeInChromeUnwired();
          Ln = Ln.filter(Yn => !(Yn.name === "claude-in-chrome" && Yn.type === "prompt" && Yn.source === "bundled"));
        }
      }
      let Dr = {
        ...wo,
        ...qn
      };
      let Us = {};
      let oa = {};
      for (let [Yn, ks] of Object.entries(Dr)) {
        let Ui = ks;
        if (Ui.type === "sdk") {
          Us[Yn] = Ui;
        } else {
          oa[Yn] = Ui;
        }
      }
      if (Me.CLAUDE_CODE_REMOTE && getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_startup_policy_seed", true)) {
        Gt = TOs(Gt, qn);
      }
      addStartupContext({
        mcp_server_count: Object.keys(Dr).length
      });
      profileCheckpoint("action_mcp_configs_loaded");
      let Du = Aqc({
        permissionMode: Rt,
        dangerouslySkipPermissionsPassed: d ?? false,
        modeIsBypass: Rt === "bypassPermissions",
        print: N ?? false
      });
      Z0c({
        resume: a.resume,
        forkSession: a.forkSession,
        hasSessionIdFlag: !!C
      });
      let nc = getIsRemoteMode() && Object.keys(vt).length > 0 ? [wc(`MCP ${un(Object.keys(vt).length, "server")} from --mcp-config/agent frontmatter ignored \u2014 MCP runs in the remote workspace: ${Object.keys(vt).join(", ")}`, "warning")] : [];
      let ju = We || getIsRemoteMode() ? Promise.resolve({
        clients: [],
        tools: [],
        commands: []
      }) : j5t(oa);
      let tm = We ? Promise.resolve({
        clients: [],
        tools: [],
        commands: []
      }) : jt.then(Yn => Object.keys(Yn).length > 0 ? j5t(Yn) : {
        clients: [],
        tools: [],
        commands: []
      });
      let Ym = Promise.all([ju, tm]).then(([Yn, ks]) => ({
        clients: [...Yn.clients, ...ks.clients],
        tools: gyp([...Yn.tools, ...ks.tools], "name"),
        commands: gyp([...Yn.commands, ...ks.commands], "name")
      }));
      zBe(sn);
      let um = j || W || z || We || a.continue || a.resume ? null : uRe({
        kind: "session-start",
        source: "startup",
        agentType: sn?.agentType,
        model: fs
      });
      let jv = [];
      Ym.catch(() => {});
      let ac = [];
      let id = [];
      let Qy = [];
      let jS = wce();
      let Dc = jS !== false ? {
        type: "adaptive"
      } : {
        type: "disabled"
      };
      if (a.thinking === "adaptive" || a.thinking === "enabled") {
        jS = true;
        Dc = {
          type: "adaptive"
        };
      } else if (a.thinking === "disabled") {
        jS = false;
        Dc = {
          type: "disabled"
        };
      } else {
        let Yn = process.env.MAX_THINKING_TOKENS ? parseInt(process.env.MAX_THINKING_TOKENS, 10) : a.maxThinkingTokens;
        if (Yn !== undefined) {
          if (Yn > 0) {
            jS = true;
            Dc = {
              type: "enabled",
              budgetTokens: Yn
            };
          } else if (Yn === 0) {
            jS = false;
            Dc = {
              type: "disabled"
            };
          }
        }
      }
      if (Dc.type !== "disabled") {
        let Yn = a.thinkingDisplay === "summarized" || a.thinkingDisplay === "omitted" ? a.thinkingDisplay : undefined;
        if (Yn) {
          setThinkingDisplayExplicit(true);
        }
        let ks = JPi({
          explicitDisplay: Yn,
          isNonInteractive: getIsNonInteractiveSession(),
          outputFormat: L ?? "text",
          verbose: U
        });
        if (ks) {
          Dc.display = ks;
        }
      }
      if (wn("info", "started", {
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        is_native_binary: rm()
      }), Ti(async () => {
        wn("info", "exited");
      }), z8f({
        onAntSandboxDetection: Du.updateContext,
        hasInitialPrompt: Boolean(i),
        hasStdin: Boolean(Pn),
        verbose: U,
        debug: u,
        print: N ?? false,
        outputFormat: L ?? "text",
        inputFormat: P ?? "text",
        numAllowedTools: f.length,
        numDisallowedTools: h.length,
        mcpClientCount: Object.keys(Dr).length,
        worktreeEnabled: ne,
        skipWebFetchPreflight: getInitialSettings().skipWebFetchPreflight,
        githubActionInputs: process.env.GITHUB_ACTION_INPUTS,
        dangerouslySkipPermissionsPassed: d ?? false,
        permissionMode: Rt,
        modeIsBypass: Rt === "bypassPermissions",
        allowDangerouslySkipPermissionsPassed: p,
        skipDangerousModePromptSetPreDialog: Se,
        systemPromptFlag: Ye ? a.systemPromptFile ? "file" : "flag" : undefined,
        appendSystemPromptFlag: a.appendSystemPrompt ? "flag" : a.appendSystemPromptFile ? "file" : undefined,
        thinkingConfig: Dc
      }), !getIsRemoteMode()) {
        fhc(oa, Gt);
      }
      if (qxl(Gt.alwaysAllowRules), kpt(null, "initialization"), F8f(), wpi().then(Yn => {
        if (!Yn) {
          return;
        }
        if (gi) {
          GY(gi);
        }
        GLt().then(ks => {
          if (ks >= 2) {
            logEvent("tengu_concurrent_sessions", {
              num_sessions: ks
            });
          }
        });
      }), kd()) {
        ;
      } else {
        N4c({
          deferToCleanup: We
        });
      }
      let Zy = j || W ? "init" : z ? "maintenance" : null;
      if (j) {
        applyConfigEnvironmentVariables();
        await uRe({
          kind: "setup",
          trigger: "init",
          forceSyncExecution: true
        });
        await uRe({
          kind: "session-start",
          source: "startup",
          forceSyncExecution: true
        });
        gracefulShutdownSync(0);
        return;
      }
      if (We) {
        if (me !== null) {
          let Pi = await validateForceLoginOrg();
          if (!Pi.valid) {
            return Ih(Pi.message);
          }
          await waitForPolicyLimitsToLoad();
          let Za = Qnn();
          if (Za) {
            return Ih(`Error: ${Za}`);
          }
          if (L === "stream-json") {
            return Es("Error: --cloud <session_id> does not support --output-format stream-json");
          }
          let Mu = typeof Pn === "string" && Pn.length > 0 ? Pn : null;
          if (Mu === null) {
            return Es("Error: non-interactive --cloud <session_id> requires a prompt (positional or stdin).");
          }
          logEvent("tengu_remote_send_headless", {
            entry_point: "cloud_attach_headless"
          });
          let wu = null;
          try {
            if ((await fetchSession(me)).session_status === "archived") {
              wu = `cloud session ${me} is archived and cannot accept new messages`;
            }
          } catch (hy) {
            wu = he(hy);
          }
          let Lf = wu !== null ? {
            ok: false,
            reason: wu
          } : await sendEventToRemoteSession(me, Mu);
          if (!Lf.ok) {
            if (await logEventAsync("tengu_remote_send_headless_error", {
              entry_point: "cloud_attach_headless"
            }), L === "json") {
              process.stdout.write(De({
                ok: false,
                session_id: me,
                error: Lf.reason
              }) + `
`);
            }
            return Ih(`Error: failed to send message to cloud session ${me}: ${Lf.reason}`);
          }
          await logEventAsync("tengu_remote_send_headless_success", {
            entry_point: "cloud_attach_headless"
          });
          let DT = wS(me, undefined, {
            from: "cli",
            m: "0"
          });
          if (L === "json") {
            process.stdout.write(De({
              ok: true,
              session_id: me,
              url: DT
            }) + `
`);
          } else {
            process.stdout.write(`Sent to cloud session.
`);
            process.stdout.write(`Session ID: ${me}
`);
            process.stdout.write(`View: ${DT}
`);
          }
          await gracefulShutdown(0);
          return;
        }
        if (L === "stream-json" || L === "json") {
          setHasFormattedOutput(true);
        }
        applyConfigEnvironmentVariables();
        initializeTelemetryAfterTrust();
        let Yn = (a.continue || a.resume || de) && !KQo() ? null : hWr(tc ?? fs);
        if (Yn && L !== "json" && L !== "stream-json") {
          Y3(Yn);
        }
        let ks = performance.now();
        let Ui = a.continue || a.resume || de || Zy ? undefined : uRe({
          kind: "session-start",
          source: "startup"
        }).then(Pi => (au("hooks_init_ms", performance.now() - ks, ks), Pi));
        Ui?.catch(() => {});
        profileCheckpoint("before_validateForceLoginOrg");
        let Ca = await validateForceLoginOrg();
        if (!Ca.valid) {
          pJe(Ca.message);
          await flushAnalyticsSinks_export();
          return Es();
        }
        let gc = V ? [] : Pr ? Pr.then(filterCommandsForHeadless) : filterCommandsForHeadless(Ln);
        if (gc instanceof Promise) {
          gc.catch(() => {});
        }
        let Je = getDefaultAppState();
        let rt = {
          ...Je,
          mainLoopModel: ya,
          mcp: {
            ...Je.mcp,
            clients: ac,
            commands: Qy,
            tools: id
          },
          toolPermissionContext: Gt,
          effortValue: kDn(a.effort),
          ultracode: pQr(a.effort),
          autoCompactWindow: J,
          ...(lc() && {
            fastMode: rWr(Ri ?? null)
          }),
          ...(FV() && lr && {
            advisorModel: lr
          }),
          ...(a.promptSuggestions !== undefined && {
            promptSuggestionEnabled: a.promptSuggestions && d6n()
          }),
          ...(c && {
            teamContext: c.teamContext,
            teammateColors: c.teammateColors
          })
        };
        let cn = new dsn();
        let Gn = dO(rt, Pi => HCe(Pi, cn));
        if (Ti(() => Z5n(Gn.getState().tasks)), e6n(Gn.setState), Gt.mode === "bypassPermissions" || p) {
          checkAndDisableBypassPermissions(Gt);
        }
        if (verifyAutoModeGateAccess(Gt, Gn.getState().fastMode).then(({
          updateContext: Pi
        }) => {
          Gn.setState(Za => {
            let Mu = Pi(Za.toolPermissionContext);
            if (Mu === Za.toolPermissionContext) {
              return Za;
            }
            return {
              ...Za,
              toolPermissionContext: Mu
            };
          });
        }), a.sessionPersistence === false) {
          setSessionPersistenceDisabled(true);
        }
        setSdkBetas(eOi(S));
        let $r = Z4c({
          regularMcpConfigs: oa,
          claudeaiConfigPromise: jt,
          state: {
            getClients: () => Gn.getState().mcp.clients,
            applyMcpUpdate: Pi => Gn.setState(Za => ({
              ...Za,
              mcp: Pi(Za.mcp)
            }))
          }
        });
        profileCheckpoint("before_connectMcp");
        let Ko = performance.now();
        if (await $r.connect(), au("mcp_connect_ms", performance.now() - Ko, Ko), profileCheckpoint("after_connectMcp_claudeai"), !kd()) {
          startDeferredPrefetches();
          Promise.resolve().then(() => (ron(), xgr)).then(Pi => Pi.startBackgroundHousekeeping());
        }
        PXc();
        profileCheckpoint("before_print_import");
        let {
          runHeadless: Sa
        } = await Promise.resolve().then(() => (E8c(), T8c));
        profileCheckpoint("after_print_import");
        Sa(Pn, () => Gn.getState(), Gn.setState, Gn.subscribe, gc, Kn, Us, ct.activeAgents, {
          continue: a.continue,
          resume: a.resume,
          verbose: U,
          outputFormat: L,
          jsonSchema: ao,
          permissionPromptToolName: a.permissionPromptTool,
          allowedTools: f,
          thinkingConfig: Dc,
          maxTurns: l,
          maxBudgetUsd: a.maxBudgetUsd,
          taskBudget: a.taskBudget ? {
            total: a.taskBudget
          } : undefined,
          systemPrompt: Ye,
          appendSystemPrompt: ht,
          planModeInstructions: a.planModeInstructions,
          appendSubagentSystemPrompt: undefined,
          excludeDynamicSections: a.excludeDynamicSystemPromptSections || undefined,
          userSpecifiedModel: Ri,
          restrictedStartupModel: On,
          fallbackModel: Hs,
          teleport: de,
          sdkUrl: se,
          replayUserMessages: Qn,
          includePartialMessages: ae,
          sessionMirror: k,
          forkSession: a.forkSession || false,
          resumeSessionAt: a.resumeSessionAt || undefined,
          rewindFiles: a.rewindFiles,
          enableAuthStatus: a.enableAuthStatus,
          promptSuggestions: a.promptSuggestions,
          agent: M,
          workload: a.workload,
          setupTrigger: Zy ?? undefined,
          configuredMcpServerCount: Object.keys(oa).length,
          sessionStartHooksPromise: Ui,
          sessionState: cn
        });
        return;
      }
      logEvent("tengu_startup_manual_model_config", {
        cli_flag: a.model,
        env_var: process.env.ANTHROPIC_MODEL,
        settings_file: (getInitialSettings() || {}).model,
        settings_source: getEffectiveSettingSource("model") == null ? undefined : getEffectiveSettingSource("model"),
        subscriptionType: getSubscriptionType() == null ? undefined : getSubscriptionType(),
        agent: Vr
      });
      let Ll = Xdi(tc ?? fs);
      let Mg = [];
      if (wt) {
        Mg.push({
          key: "permission-mode-notification",
          text: wt,
          priority: "high"
        });
      }
      if (Y) {
        Mg.push({
          key: Y.key,
          text: Y.text,
          color: "warning",
          priority: "high"
        });
      }
      let PR = Gt;
      if (!vn && checkHasTrustDialogAccepted()) {
        let Yn = Bmt();
        PR = cCo(uCo(syncPermissionRulesFromDisk(Gt, Yn), [], $mt()), Yn);
      }
      let $d = {
        ...PR,
        mode: isAgentSwarmsEnabled() && AXc().isPlanModeRequired() ? "plan" : PR.mode
      };
      let up = getUserMsgOptIn();
      let ta = !(getIsRemoteMode() || Boolean(de)) && !st(process.env.CLAUDE_CODE_REMOTE) && (Ie || getRemoteControlAtStartup());
      let db = false;
      let Nf = process.env.CLAUDE_BRIDGE_REATTACH_SESSION;
      let iC = st(process.env.CLAUDE_BRIDGE_REATTACH_OUTBOUND_ONLY);
      let Vb = undefined;
      let e_ = {
        settings: getInitialSettings(),
        tasks: {},
        transcripts: {},
        taskDecorations: {},
        ...((gi || Vb) && {
          standaloneAgentContext: {
            ...(gi && {
              name: gi
            }),
            prideGradient: Vb
          }
        }),
        agentNameRegistry: new Map(),
        agentTypesInvokedThisSession: new Set(),
        verbose: U ?? uc("verbose", false).value,
        showMessageTimestamps: uc("showMessageTimestamps", false).value,
        mainLoopModel: ya,
        mainLoopModelForSession: null,
        isBriefOnly: up,
        replTab: "convo",
        briefTranscript: U ? false : H,
        expandedView: getGlobalConfig().showExpandedTodos ? "tasks" : "none",
        coordinatorTaskIndex: -1,
        workflowFooterIndex: 0,
        viewSelectionMode: "none",
        queueEditIndex: null,
        footerSelection: null,
        footerLinks: [],
        toolPermissionContext: $d,
        agent: sn?.agentType,
        agentDefinitions: ct,
        skillTruncationStats: w2n(Ln.filter(isSkillToolCommand), iT(fs, getSdkBetas()), new Set(Ln.filter(Yn => getSkillOverride(Yn) === "name-only").map(Yn => Yn.name)), Yn => Nve(Yn.name), bytesPerTokenForModel(fs)),
        skillTools: [],
        mcp: {
          clients: [],
          tools: [],
          commands: [],
          resources: {},
          resourceTemplates: {},
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
          modelDeprecationWarning: Ll,
          modelRestrictedWarning: On ? {
            requested: On,
            effective: fs
          } : null,
          existingClaudeSubscription: null
        },
        statusLineText: undefined,
        prStatus: null,
        prNeedsAuth: false,
        remoteSessionUrl: undefined,
        remoteProject: undefined,
        remoteConnectionStatus: "connecting",
        remoteBootstrap: null,
        remoteBackgroundTaskCount: 0,
        hasRemoteReplyChannel: false,
        replBridgeEnabled: ta || db || Boolean(Nf) && !iC,
        replBridgeAutoOnByDefault: ta && !Ie && !Nf && getExplicitRemoteControlAtStartup() === undefined,
        replBridgeExplicit: Ie || Boolean(Nf) && !iC && !ta,
        replBridgeOutboundOnly: !ta && (Nf ? iC : db),
        replBridgeConnected: false,
        replBridgeSessionActive: false,
        replBridgeSkipNextArchive: false,
        replBridgeReconnecting: false,
        replBridgeConnectUrl: undefined,
        replBridgeSessionUrl: undefined,
        replBridgeEnvironmentId: undefined,
        replBridgeSessionId: undefined,
        replBridgeError: undefined,
        replBridgeInitialName: Ue,
        showRemoteCallout: false,
        notifications: {
          current: null,
          queue: Mg,
          pinned: []
        },
        autoUpdaterResult: null,
        frameUrls: {},
        elicitation: {
          queue: []
        },
        todos: {},
        replContexts: {},
        fileHistory: {
          snapshots: [],
          trackedFiles: new Set(),
          snapshotSequence: 0
        },
        attribution: fmt(),
        thinkingEnabled: jS,
        promptSuggestionEnabled: u6n(),
        awaySummaryEnabled: Fgt(),
        displayedMessageContent: {},
        sessionHooks: new Map(),
        inbox: {
          messages: []
        },
        promptSuggestion: {
          text: null,
          promptId: null,
          shownAt: 0,
          acceptedAt: 0,
          generationRequestId: null
        },
        workerSandboxPermissions: {
          queue: [],
          selectedIndex: 0
        },
        pendingMemoryUpdates: [],
        pendingWorkerRequest: null,
        pendingSandboxRequest: null,
        authVersion: 0,
        policyVersion: 0,
        initialMessage: Pn ? {
          message: In({
            content: String(Pn)
          })
        } : a.replyOnResume ? {
          replay: true
        } : null,
        effortValue: kDn(a.effort),
        ultracode: pQr(a.effort),
        cacheMissAckedAtOutputTokens: -1,
        autoCompactWindow: J,
        activeOverlays: new Set(),
        fastMode: rWr(fs),
        ...(FV() && lr && {
          advisorModel: lr
        }),
        teamContext: c?.teamContext ?? R0c?.(),
        teammateColors: c?.teammateColors ?? {
          assignments: new Map(),
          index: 0
        },
        storedImagePaths: new Map(),
        imageDescriptions: new Map(),
        classifierApprovals: {
          approvals: new Map(),
          checking: new Set()
        },
        webBrowser: __toCommonJS(_Co).getDefaultWebBrowserState()
      };
      if (Pn) {
        sut(String(Pn));
      }
      let Jx = Xo ? [...id, Xo] : id;
      saveGlobalConfig(Yn => ({
        ...Yn,
        numStartups: (Yn.numStartups ?? 0) + 1
      }));
      setImmediate(() => {
        H8f(getGlobalConfig());
        PXc();
      });
      let OR = null;
      let UE = false;
      let qS = OR && !UE ? OR.then(Yn => Yn.createSessionTurnUploader()).catch(() => null) : null;
      let J0 = OR && UE ? OR.then(Yn => Yn.createSessionTurnUploaderV2()).catch(() => null) : null;
      let TP = {
        debug: u,
        commands: [...Ln, ...Qy],
        initialTools: Jx,
        mcpClients: ac,
        autoConnectIdeFlag: E,
        mainThreadAgentDefinition: sn,
        disableSlashCommands: V,
        dynamicMcpConfig: vt,
        strictMcpConfig: co,
        systemPrompt: Ye,
        appendSystemPrompt: ht,
        thinkingConfig: Dc,
        ...(Hs && {
          fallbackModel: Hs
        }),
        ...(qS && {
          onTurnComplete: Yn => {
            qS.then(ks => ks?.(Yn));
          }
        }),
        ...(J0 && {
          onCaptureSnapshot: (Yn, ks) => {
            J0.then(Ui => Ui?.(Yn, ks));
          }
        })
      };
      let Xx = {
        modeApi: dis,
        mainThreadAgentDefinition: sn,
        agentDefinitions: ct,
        currentCwd: Ms,
        cliAgents: Br,
        initialState: e_,
        permissionModeCliSet: y !== undefined || Boolean(d)
      };
      if (a.continue) {
        let Yn = false;
        try {
          let ks = performance.now();
          let {
            clearSessionCaches: Ui
          } = await Promise.resolve().then(() => (z7e(), _vt));
          Ui();
          let Ca = await loadConversationForResume(undefined, undefined, {
            forkSession: !!a.forkSession,
            replyOnResume: !!a.replyOnResume
          });
          if (!Ca) {
            await logEventAsync("tengu_continue", {
              success: false
            });
            return await IL(Mn, "No conversation found to continue");
          }
          let gc = await Mgr(Ca, {
            forkSession: !!a.forkSession,
            includeAttribution: true,
            transcriptPath: Ca.fullPath
          }, Xx);
          if (gc.restoredAgentDef) {
            sn = gc.restoredAgentDef;
          }
          JSr(a);
          await cis(a);
          logEvent("tengu_continue", {
            success: true,
            resume_duration_ms: Math.round(performance.now() - ks)
          });
          Yn = true;
          let Je = zxt(vt, gc.restoredAgentDef ?? sn, {
            strictMcpConfig: co
          });
          if (Object.keys(Je).length > 0) {
            await G5({
              hasDynamicMcpConfig: true
            });
          }
          await launchRepl(Mn, {
            getFpsMetrics: Un,
            stats: Er,
            initialState: gc.initialState
          }, {
            ...TP,
            mainThreadAgentDefinition: gc.restoredAgentDef ?? sn,
            dynamicMcpConfig: Je,
            initialMessages: gc.messages,
            initialFileHistorySnapshots: gc.fileHistorySnapshots,
            initialContentReplacements: gc.contentReplacements,
            initialAgentName: gc.agentName,
            initialAgentColor: gc.agentColor
          }, NXe);
        } catch (ks) {
          if (!Yn) {
            await logEventAsync("tengu_continue", {
              success: false
            });
          }
          Oe($o(sr(ks), "continue/resume launchRepl failed"));
          await bR(1);
        }
      } else if (a.resume || a.fromPr || de || fe !== null) {
        let {
          clearSessionCaches: Yn
        } = await Promise.resolve().then(() => (z7e(), _vt));
        Yn();
        let ks = null;
        let Ui = undefined;
        let Ca = kD(a.resume);
        let gc = undefined;
        let Je = null;
        let rt = undefined;
        if (a.fromPr) {
          if (a.fromPr === true) {
            rt = true;
          } else if (typeof a.fromPr === "string") {
            rt = a.fromPr;
          }
        }
        if (a.resume && typeof a.resume === "string" && !Ca && !isTranscriptFileResumeArg(a.resume)) {
          let Gn = a.resume.trim();
          if (Gn) {
            let $r = await searchSessionsByCustomTitle(Gn, {
              exact: true
            });
            if ($r.length === 1) {
              Je = $r[0];
              Ca = getSessionIdFromLog(Je) ?? null;
            } else {
              gc = Gn;
            }
          }
        }
        if (fe !== null || de) {
          await waitForPolicyLimitsToLoad();
          let Gn = Qnn();
          if (Gn) {
            return await IL(Mn, `Error: ${Gn}`, () => gracefulShutdown(1));
          }
        }
        if (fe !== null) {
          let Gn = Vts(fe);
          let $r = Gn !== null ? toCompatSessionId(Gn) : null;
          if (ve && typeof Pn === "string" && Pn.length > 0) {
            fe = Pn;
          }
          let Ko = !$r && fe.length > 0;
          let Sa = Ko ? MXc.randomUUID() : undefined;
          let Pi = y ? uF(y) : undefined;
          let Za = Pi && Mnt(Pi) && Pi !== "bypassPermissions" ? Pi : undefined;
          let Mu = getFeatureValue_CACHED_MAY_BE_STALE("tengu_remote_backend", false);
          if ($r && !Mu) {
            return await IL(Mn, "Error: Attaching to an existing cloud session is not enabled for your account.", () => gracefulShutdown(1));
          }
          if (!Mu && !Ko && Te === null) {
            return await IL(Mn, `Error: --cloud requires a description.
Usage: claude --cloud "your task description"`, () => gracefulShutdown(1));
          }
          let wu;
          let Lf;
          if ($r) {
            logEvent("tengu_remote_attach_session", {
              session_id: $r
            });
            let {
              attachRemote: EB
            } = await Promise.resolve().then(() => (A8c(), k8c));
            try {
              await EB(Mn, $r, {
                initialStateOverride: e_,
                autoConnectIdeFlag: E,
                disableSlashCommands: V
              });
            } catch (t_) {
              return await IL(Mn, `Couldn't attach to cloud session: ${he(t_)}`, () => gracefulShutdown(1));
            }
            let [{
              mountFleetViewWithComposerBack: Ng
            }, {
              applyFleetViewHostWindowsEnv: Vc
            }, {
              createRoot: Il
            }] = await Promise.all([Promise.resolve().then(() => (Non(), Mon)), Promise.resolve().then(() => (wxt(), xon)), Promise.resolve().then(() => (et(), fG))]);
            Vc();
            process.env.CLAUDE_AGENTS_SELECT = remoteRowId($r);
            let WH = await Il(getBaseRenderOptions(false));
            await Ng(WH);
            return await gracefulShutdown(0);
          } else {
            logEvent("tengu_remote_create_session", {
              has_initial_prompt: String(Ko)
            });
            try {
              Lf = await prepareApiRequest();
            } catch (Il) {
              logForDebugging(`--remote auth setup failed: ${he(Il)}`, {
                level: "error"
              });
              return await IL(Mn, `Error: ${he(Il) || "Failed to authenticate"}`, () => gracefulShutdown(1));
            }
            process.stderr.write(_$u.dim("Creating remote session\u2026") + `
`);
            let EB = ce ?? (await getBranch());
            let Ng = await teleportToRemoteWithErrorHandling(Mn, {
              description: Ko ? fe : null,
              descriptionUuid: Sa,
              signal: new AbortController().signal,
              source: "remote",
              branchName: EB || undefined,
              explicitRef: ce ?? undefined,
              poolId: Te ?? undefined,
              correlationId: xe ?? undefined,
              sessionGroupingId: le ?? undefined,
              permissionMode: Za
            });
            if (!Ng.ok) {
              logEvent("tengu_remote_create_session_error", {
                error: Ng.failReason,
                ...(Ng.failDetail?.endpoint && {
                  create_endpoint: Ng.failDetail.endpoint
                }),
                ...(Ng.failDetail?.serverReason && {
                  server_reason: Ng.failDetail.serverReason
                })
              });
              return await IL(Mn, Ng.failMessage ? `Error: ${Ng.failMessage}` : "Error: Unable to create cloud session", () => gracefulShutdown(1));
            }
            let Vc = Ng.session;
            if (logEvent("tengu_remote_create_session_success", {
              session_id: Vc.id
            }), !Mu) {
              process.stdout.write(`Created cloud session: ${Vc.title}
`);
              process.stdout.write(`View: ${wS(Vc.id, undefined, {
                from: "cli",
                m: "0"
              })}
`);
              process.stdout.write(`Resume with: claude --teleport ${Vc.id}
`);
              await gracefulShutdown(0);
              process.exit(0);
            }
            wu = Vc.id;
          }
          setIsRemoteMode(true);
          switchSession(wu, "remote_attach");
          let {
            getClaudeAIOAuthTokens: DT,
            handleOAuth401Error: hy
          } = await Promise.resolve().then(() => (no(), v2));
          let TB = {
            sessionId: wu,
            getAccessToken: () => DT()?.accessToken ?? Lf.accessToken,
            orgUuid: Lf.orgUUID,
            onAuth401: hy,
            initialPromptUuid: Sa
          };
          let _D = wS(wu, undefined, {
            from: "cli",
            m: "0"
          });
          let bD = wc(`Cloud session active \xB7 code here or at ${_D}`, "info");
          let DL = Ko ? In({
            content: fe,
            uuid: Sa
          }) : null;
          let f4 = $r ? y ? "--permission-mode is ignored when attaching \u2014 the session keeps its current mode (shift+tab to change it)" : undefined : Pi && !Za ? `--permission-mode ${Pi} is not forwarded \u2014 the cloud session uses its default mode` : undefined;
          let n7 = {
            ...e_,
            initialMessage: AWc(Ko && (Te !== null && ue || ve), e_.initialMessage),
            remoteSessionUrl: _D,
            remoteProject: le ? {
              id: le,
              name: pe
            } : undefined,
            replTab: "convo",
            replBridgeEnabled: false,
            replBridgeOutboundOnly: false,
            replBridgeExplicit: false,
            ...(f4 && {
              notifications: {
                ...e_.notifications,
                current: null,
                queue: [...e_.notifications.queue, {
                  key: "remote-permission-mode-not-applied",
                  text: f4,
                  color: "warning",
                  priority: "high"
                }]
              }
            })
          };
          await launchRepl(Mn, {
            getFpsMetrics: Un,
            stats: Er,
            initialState: n7
          }, {
            debug: u,
            commands: Ln,
            initialTools: [],
            initialMessages: DL ? [...nc, bD, DL] : [...nc, bD],
            mcpClients: [],
            autoConnectIdeFlag: E,
            mainThreadAgentDefinition: sn,
            disableSlashCommands: V,
            remoteSessionConfig: TB,
            thinkingConfig: Dc
          }, NXe);
          return;
        } else if (de) {
          if (de === true || de === "") {
            logEvent("tengu_teleport_interactive_mode", {});
            logForDebugging("selectAndResumeTeleportTask: Starting teleport flow...");
            let Gn = await x4c(Mn);
            if (!Gn) {
              await gracefulShutdown(0);
              process.exit(0);
            }
            let {
              branchError: $r
            } = await checkOutTeleportedSessionBranch(Gn.branch);
            ks = processMessagesForTeleportResume(Gn.log, $r);
          } else if (typeof de === "string") {
            logEvent("tengu_teleport_resume_session", {
              mode: "direct"
            });
            try {
              let Gn = await fetchSession(de);
              let $r = await validateSessionRepository(Gn);
              if ($r.status === "mismatch" || $r.status === "not_in_repo") {
                let Pi = $r.sessionRepo;
                if (Pi) {
                  let Za = O_r(Pi);
                  let Mu = await D_r(Za);
                  if (Mu.length > 0) {
                    let wu = await k4c(Mn, {
                      targetRepo: Pi,
                      initialPaths: Mu
                    });
                    if (wu) {
                      process.chdir(wu);
                      By(wu);
                      setOriginalCwd(wu);
                    } else {
                      await gracefulShutdown(0);
                    }
                  } else {
                    throw new eS(`You must run claude --teleport ${de} from a checkout of ${Pi}.`, _$u.red(`You must run claude --teleport ${de} from a checkout of ${_$u.bold(Pi)}.
`));
                  }
                }
              } else if ($r.status === "error") {
                throw new eS($r.errorMessage || "Failed to validate session", _$u.red(`Error: ${$r.errorMessage || "Failed to validate session"}
`));
              }
              await validateGitState();
              let {
                teleportWithProgress: Ko
              } = await Promise.resolve().then(() => (N8c(), M8c));
              let Sa = await Ko(Mn, de);
              setTeleportedSessionInfo({
                sessionId: de
              });
              ks = Sa.messages;
            } catch (Gn) {
              let $r = Gn instanceof eS;
              if (!$r) {
                Oe($o(sr(Gn), "teleport direct resume failed"));
              }
              await IL(Mn, $r ? Gn.message : he(Gn), () => gracefulShutdown(1));
            }
          }
        }
        if (isAgentsFleetEnabled() || typeof a.resume === "string" && isTranscriptFileResumeArg(a.resume)) {
          if (a.resume && typeof a.resume === "string" && !Ca) {
            let $r = null?.parseCcshareId(a.resume);
            if (isTranscriptFileResumeArg(a.resume)) {
              let Ko = kD(TRe.basename(a.resume, ".jsonl"));
              if (Ko && !a.forkSession) {
                let Pi = await findLiveNonInteractiveSession(Ko);
                if (Pi) {
                  return await IL(Mn, `Session ${Ko} is currently running as a background agent (${Pi.kind}). Use \`claude agents\` to find and attach to it, or add --fork-session to branch off a copy.`);
                }
              }
              let Sa = "load_error";
              try {
                let Pi = performance.now();
                let Za = await loadTranscriptFromFile(a.resume);
                let Mu = await loadConversationForResume(Za, undefined, {
                  forkSession: !!a.forkSession,
                  replyOnResume: !!a.replyOnResume
                });
                if (Mu) {
                  if (Sa = "processing_error", Ui = await Mgr(Mu, {
                    forkSession: !!a.forkSession,
                    sessionIdOverride: Ko ?? undefined,
                    transcriptPath: Mu.fullPath
                  }, Xx), Ui.restoredAgentDef) {
                    sn = Ui.restoredAgentDef;
                  }
                  logEvent("tengu_session_resumed", {
                    entrypoint: "file",
                    success: true,
                    resume_duration_ms: Math.round(performance.now() - Pi)
                  });
                } else {
                  logEvent("tengu_session_resumed", {
                    entrypoint: "file",
                    success: false,
                    failure_reason: "not_found_explicit_id"
                  });
                }
              } catch (Pi) {
                logEvent("tengu_session_resumed", {
                  entrypoint: "file",
                  success: false,
                  failure_reason: Sa,
                  error_name: sr(Pi).name,
                  error_code: Pi instanceof TranscriptFileFormatError ? Pi.code : gd(Pi)?.toLowerCase() ?? "other"
                });
                Oe(Pi);
                await IL(Mn, `Unable to load transcript from file: ${a.resume}`, () => gracefulShutdown(1));
              }
            }
          }
        }
        if (Ca) {
          let Gn = Ca;
          if (!a.forkSession) {
            let Ko = await findLiveNonInteractiveSession(Gn);
            if (Ko) {
              return await IL(Mn, `Session ${Gn} is currently running as a background agent (${Ko.kind}). Use \`claude agents\` to find and attach to it, or add --fork-session to branch off a copy.`);
            }
          }
          let $r = "load_error";
          try {
            let Ko = performance.now();
            let Sa = await loadConversationForResume(Je ?? Gn, undefined, {
              forkSession: !!a.forkSession,
              replyOnResume: !!a.replyOnResume
            });
            if (!Sa) {
              logEvent("tengu_session_resumed", {
                entrypoint: "cli_flag",
                success: false,
                failure_reason: "not_found_explicit_id"
              });
              let Za = `No conversation found with session ID: ${Gn}`;
              logForDebugging(Za, {
                level: "error"
              });
              return await IL(Mn, Za, () => gracefulShutdown(1));
            }
            $r = "processing_error";
            let Pi = Je?.fullPath ?? Sa.fullPath;
            if (Ui = await Mgr(Sa, {
              forkSession: !!a.forkSession,
              sessionIdOverride: Gn,
              transcriptPath: Pi
            }, Xx), Ui.restoredAgentDef) {
              sn = Ui.restoredAgentDef;
            }
            logEvent("tengu_session_resumed", {
              entrypoint: "cli_flag",
              success: true,
              resume_duration_ms: Math.round(performance.now() - Ko)
            });
          } catch (Ko) {
            logEvent("tengu_session_resumed", {
              entrypoint: "cli_flag",
              success: false,
              failure_reason: $r,
              error_name: sr(Ko).name
            });
            Oe(Ko);
            await IL(Mn, `Failed to resume session ${Gn}`);
          }
        }
        if (I) {
          try {
            let Gn = await I;
            let $r = Bn(Gn, Ko => !Ko.success);
            if ($r > 0) {
              Y3(`Warning: ${$r}/${Gn.length} file(s) failed to download.`);
            }
          } catch (Gn) {
            return await IL(Mn, `Error downloading files: ${he(Gn)}`);
          }
        }
        let cn = Ui ?? (Array.isArray(ks) ? {
          messages: ks,
          fileHistorySnapshots: undefined,
          agentName: undefined,
          agentColor: undefined,
          restoredAgentDef: sn,
          initialState: e_,
          contentReplacements: undefined
        } : undefined);
        if (cn) {
          JSr(a);
          await cis(a);
          let Gn = zxt(vt, cn.restoredAgentDef ?? sn, {
            strictMcpConfig: co
          });
          if (Object.keys(Gn).length > 0) {
            await G5({
              hasDynamicMcpConfig: true
            });
          }
          await launchRepl(Mn, {
            getFpsMetrics: Un,
            stats: Er,
            initialState: cn.initialState
          }, {
            ...TP,
            mainThreadAgentDefinition: cn.restoredAgentDef ?? sn,
            dynamicMcpConfig: Gn,
            initialMessages: cn.messages,
            initialFileHistorySnapshots: cn.fileHistorySnapshots,
            initialContentReplacements: cn.contentReplacements,
            initialAgentName: cn.agentName,
            initialAgentColor: cn.agentColor
          }, NXe);
        } else {
          await A4c(Mn, {
            getFpsMetrics: Un,
            stats: Er,
            initialState: e_
          }, vve(getOriginalCwd()), {
            ...TP,
            initialSearchQuery: gc,
            forkSession: a.forkSession,
            filterByPr: rt
          });
        }
      } else {
        let Yn = um && jv.length === 0 ? um : undefined;
        if (profileCheckpoint("action_after_hooks"), JSr(a), await cis(a), saveMode(dis?.isCoordinatorMode() ? "coordinator" : "normal"), a.deepLinkOrigin) {
          if (logEvent("tengu_deep_link_opened", {
            has_prefill: Boolean(a.prefill),
            has_repo: Boolean(a.deepLinkRepo)
          }), logForDebugging(bxc({
            cwd: Nt(),
            prefillLength: a.prefill?.length,
            repo: a.deepLinkRepo,
            lastFetch: a.deepLinkLastFetch !== undefined ? new Date(a.deepLinkLastFetch) : undefined
          }), {
            level: "info"
          }), a.prefill) {
            bwe({
              type: "deep-link",
              prefillLength: a.prefill.length
            });
          }
        } else if (a.prefill) {
          bwe({
            type: "prefill",
            prefillLength: a.prefill.length
          });
        }
        let ks = jv.length > 0 ? jv : undefined;
        await launchRepl(Mn, {
          getFpsMetrics: Un,
          stats: Er,
          initialState: e_
        }, {
          ...TP,
          initialMessages: ks,
          pendingHookMessages: Yn
        }, NXe);
      }
    }).version(`${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION} (Claude Code)${ej()}`, "-v, --version", "Output the version number");
    e.option("-w, --worktree [name]", "Create a new git worktree for this session (optionally specify a name)");
    e.option("--tmux", "Create a tmux session for the worktree (requires --worktree). Uses iTerm2 native panes when available; use --tmux=classic for traditional tmux.");
    e.addOption(new ic("--advisor <model>", "Enable the server-side advisor tool with the specified model (alias or full ID).").hideHelp());
    e.addOption(new ic("--enable-auto-mode", "(deprecated) Opt in to auto mode").hideHelp());
    e.addOption(new ic("--bg, --background", "Start the session as a background agent and return immediately (manage with `claude agents`)"));
    e.addOption(new ic("--brief", "Enable SendUserMessage tool for agent-to-user communication"));
    e.addOption(new ic("--ax-screen-reader", "Render screen-reader friendly output (flat text, no decorative borders or animations)."));
    e.addOption(new ic("--channels <servers...>", "MCP servers whose channel notifications (inbound push) should register this session. Space-separated server names.").hideHelp());
    e.addOption(new ic("--dangerously-load-development-channels <servers...>", "Load channel servers not on the approved allowlist. For local channel development only. Shows a confirmation dialog at startup.").hideHelp());
    e.addOption(new ic("--agent-id <id>", "Teammate agent ID").hideHelp());
    e.addOption(new ic("--agent-name <name>", "Teammate display name").hideHelp());
    e.addOption(new ic("--team-name <name>", "Team name for teammate coordination").hideHelp());
    e.addOption(new ic("--agent-color <color>", "Teammate UI color").hideHelp());
    e.addOption(new ic("--plan-mode-required", "Require plan mode before implementation").hideHelp());
    e.addOption(new ic("--parent-session-id <id>", "Parent session ID for analytics correlation").hideHelp());
    e.addOption(new ic("--teammate-mode <mode>", 'How to spawn teammates: "tmux", "iterm2", "in-process", or "auto"').choices(["auto", "tmux", "iterm2", "in-process"]).hideHelp());
    e.addOption(new ic("--agent-type <type>", "Custom agent type for this teammate").hideHelp());
    e.addOption(new ic("--sdk-url <url>", "Use remote WebSocket endpoint for SDK I/O streaming (only with -p and stream-json format)").hideHelp());
    e.addOption(new ic("--teleport [session]", "Resume a teleport session, optionally specify session ID").hideHelp());
    e.addOption(new ic("--cloud [description|session_id|url]", "Create a cloud session with the given description, or attach to an existing one by session ID or claude.ai/code URL").hideHelp());
    e.addOption(new ic("--remote [description|session_id|url]", "Deprecated alias for --cloud").hideHelp());
    e.addOption(new ic("--remote-control [name]", "Start an interactive session with Remote Control enabled (optionally named)").argParser(i => i || true));
    e.addOption(new ic("--rc [name]", "Alias for --remote-control").argParser(i => i || true).hideHelp());
    e.option("--remote-control-session-name-prefix <prefix>", "Prefix for auto-generated Remote Control session names (default: hostname)");
    profileCheckpoint("run_main_options_built");
    let n = process.argv.includes("-p") || process.argv.includes("--print");
    let r = process.argv.some(i => i.startsWith("cc://") || i.startsWith("cc+unix://"));
    if (n && !r) {
      profileCheckpoint("run_before_parse");
      await e.parseAsync(process.argv);
      profileCheckpoint("run_after_parse");
      return e;
    }
    e.command("gateway").description("Run the enterprise auth/telemetry gateway").requiredOption("--config <path>", "Path to gateway YAML config").action(async ({
      config: i
    }) => {
      try {
        let {
          startGateway: a
        } = await Promise.resolve().then(() => (ZJc(), QJc));
        await a(i);
      } catch (a) {
        process.stderr.write(`claude gateway: ${a instanceof Error ? a.message : String(a)}
`);
        process.exit(1);
      }
    });
    ASc(e);
    let o = e.command("auth").description("Manage authentication").configureHelp($Ce());
    if (o.command("login").description("Sign in to your Anthropic account").option("--email <email>", "Pre-populate email address on the login page").option("--sso", "Force SSO login flow").option("--console", "Use Anthropic Console (API usage billing) instead of Claude subscription").option("--claudeai", "Use Claude subscription (default)").action(async ({
      email: i,
      sso: a,
      console: l,
      claudeai: c
    }) => {
      let {
        authLogin: u
      } = await Promise.resolve().then(() => (V_t(), CYn));
      await u({
        email: i,
        sso: a,
        console: l,
        claudeai: c
      });
    }), o.command("status").description("Show authentication status").option("--json", "Output as JSON (default)").option("--text", "Output as human-readable text").action(async i => {
      let [{
        authStatus: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (V_t(), CYn)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), i);
    }), o.command("logout").description("Log out from your Anthropic account").action(async () => {
      let [{
        authLogout: i
      }, {
        createSubcommandRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (V_t(), CYn)), Promise.resolve().then(() => (PE(), IE))]);
      await i(await a());
      process.exit(0);
    }), e.command("project").description("Manage Claude Code project state").configureHelp($Ce()).command("purge [path]").description("Delete all Claude Code state for a project (transcripts, tasks, file history, config entry)").option("--dry-run", "List what would be deleted without deleting anything").option("-y, --yes", "Skip confirmation prompt").option("-i, --interactive", "Prompt for each item before deleting").option("--all", "Purge state for every project (mutually exclusive with [path])").action(async (i, a) => {
      let {
        purgeProjectHandler: l
      } = await Promise.resolve().then(() => (aXc(), iXc));
      await l(i, a);
    }), HTc(e), e.command("setup-token").description("Set up a long-lived authentication token (requires Claude subscription)").action(async () => {
      let [{
        setupTokenHandler: i
      }, {
        createRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (PE(), IE)), Promise.resolve().then(() => (et(), fG))]);
      let l = await a(getBaseRenderOptions(false));
      await i(l);
    }), e.command("agents").description("Manage background agents").allowExcessArguments(false).option("--setting-sources <sources>", "Comma-separated list of setting sources to load (user, project, local).").option("--cwd <path>", "Show only background sessions started under <path>").option("--add-dir <directory>", "Additional directory to allow tool access to in dispatched sessions (repeatable)").option("--plugin-dir <path>", "Load plugins from specified directory for the agent view and dispatched sessions (repeatable)").addOption(new ic("--plugin-dir-no-mcp <path>", "Like --plugin-dir but the engine will not read this plugin's .mcp.json").hideHelp()).option("--settings <file-or-json>", "Settings file or JSON string to apply to the agent view and dispatched sessions").option("--mcp-config <config>", "MCP server configuration to apply to dispatched sessions (repeatable)").option("--strict-mcp-config", "Only use MCP servers from --mcp-config in dispatched sessions").option("--permission-mode <mode>", "Default permission mode for sessions dispatched from agent view").option("--dangerously-skip-permissions", "Alias for --permission-mode bypassPermissions").option("--allow-dangerously-skip-permissions", "Make bypass-permissions mode available to dispatched sessions without defaulting to it").option("--model <model>", "Default model for sessions dispatched from agent view").option("--effort <level>", "Default effort level for sessions dispatched from agent view").option("--agent <agent>", "Default agent for sessions dispatched from agent view. Overrides the 'agent' setting.").option("--json", "Print active sessions as a JSON array and exit (for scripting; does not require a TTY)").option("--all", "With --json: include completed sessions (the full agent view list)").action(async i => {
      let {
        agentsCommandHandler: a
      } = await Promise.resolve().then(() => (hXc(), fXc));
      await a(i);
    }), e.command("ultrareview [target]").description("Run a cloud-hosted multi-agent code review of the current branch (or a PR number / base branch) and print the findings").option("--json", "Print the raw bugs.json payload instead of formatted findings").option("--timeout <minutes>", "Maximum minutes to wait for the review to finish (default: 30)").action(async (i, a) => {
      let {
        ultrareviewHandler: l
      } = await Promise.resolve().then(() => (_Xc(), yXc));
      await l(i ?? "", a);
      process.exit(0);
    }), getAutoModeEnabledStateIfCached() !== "disabled") {
      let i = e.command("auto-mode").description("Inspect auto mode classifier configuration");
      i.command("defaults").description("Print the default auto mode environment, allow, soft_deny, and hard_deny rules as JSON").action(async () => {
        let [{
          autoModeDefaultsHandler: a
        }, {
          createSubcommandRoot: l
        }] = await Promise.all([Promise.resolve().then(() => (YSr(), KSr)), Promise.resolve().then(() => (PE(), IE))]);
        await a(await l());
        process.exit(0);
      });
      i.command("config").description("Print the effective auto mode config as JSON: your settings where set, defaults otherwise").action(async () => {
        let [{
          autoModeConfigHandler: a
        }, {
          createSubcommandRoot: l
        }] = await Promise.all([Promise.resolve().then(() => (YSr(), KSr)), Promise.resolve().then(() => (PE(), IE))]);
        await a(await l());
        process.exit(0);
      });
      i.command("critique").description("Get AI feedback on your custom auto mode rules").option("--model <model>", "Override which model is used").action(async a => {
        let [{
          autoModeCritiqueHandler: l
        }, {
          createSubcommandRoot: c
        }] = await Promise.all([Promise.resolve().then(() => (YSr(), KSr)), Promise.resolve().then(() => (PE(), IE))]);
        await l(await c(), a);
        process.exit();
      });
    }
    e.command("remote-control", {
      hidden: true
    }).alias("rc").description("Control local sessions from claude.ai/code or the Claude mobile app").action(async () => {
      let {
        bridgeMain: i
      } = await Promise.resolve().then(() => (Ldr(), Ndr));
      await i(process.argv.slice(3));
    });
    e.command("doctor").description("Check the health of your Claude Code auto-updater. Note: The workspace trust dialog is skipped and stdio servers from .mcp.json are spawned for health checks. Only use this command in directories you trust.").action(async () => {
      let [{
        doctorHandler: i
      }, {
        createRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (PE(), IE)), Promise.resolve().then(() => (et(), fG))]);
      let l = await a(getBaseRenderOptions(false));
      await i(l);
    });
    e.command("update").alias("upgrade").description("Check for updates and install if available").action(async () => {
      let {
        update: i
      } = await Promise.resolve().then(() => (vXc(), EXc));
      await i();
    });
    e.command("install [target]").description("Install Claude Code native build. Use [target] to specify version (stable, latest, or specific version)").option("--force", "Force installation even if already installed").action(async (i, a) => {
      let {
        installHandler: l
      } = await Promise.resolve().then(() => (PE(), IE));
      await l(i, a);
    });
    e.command("import-conversations <exportPath>", {
      hidden: true
    }).option("--cwd <dir>", "Archive directory the imported sessions anchor to").option("--dry-run", "Parse and verify manifest without writing files").action(async (i, a) => {
      let {
        importConversationsHandler: l
      } = await Promise.resolve().then(() => (kXc(), xXc));
      await l(i, a);
    });
    profileCheckpoint("run_before_parse");
    await e.parseAsync(process.argv);
    profileCheckpoint("run_after_parse");
    profileCheckpoint("main_after_run");
    profileReport();
    return e;
  }
  async function z8f({
    onAntSandboxDetection: e,
    hasInitialPrompt: t,
    hasStdin: n,
    verbose: r,
    debug: o,
    print: s,
    outputFormat: i,
    inputFormat: a,
    numAllowedTools: l,
    numDisallowedTools: c,
    mcpClientCount: u,
    worktreeEnabled: d,
    skipWebFetchPreflight: p,
    githubActionInputs: m,
    dangerouslySkipPermissionsPassed: f,
    permissionMode: h,
    modeIsBypass: g,
    allowDangerouslySkipPermissionsPassed: y,
    skipDangerousModePromptSetPreDialog: _,
    systemPromptFlag: b,
    appendSystemPromptFlag: S,
    thinkingConfig: E
  }) {
    try {
      let C = wGi();
      let x;
      let A;
      let k = {};
      let I = {
        entrypoint: "claude",
        hasInitialPrompt: t,
        hasStdin: n,
        verbose: r,
        debug: o,
        debugToStderr: isDebugToStdErr(),
        print: s,
        outputFormat: i,
        inputFormat: a,
        numAllowedTools: l,
        numDisallowedTools: c,
        mcpClientCount: u,
        worktree: d,
        skipWebFetchPreflight: p,
        githubActionInputsPresent: m !== undefined,
        githubActionInputsLength: m?.length,
        dangerouslySkipPermissionsPassed: f,
        permissionMode: h,
        modeIsBypass: g,
        inProtectedNamespace: b6(),
        ...VCt(),
        ...x,
        apiKeySource: getAnthropicApiKeyWithSourceSafe({
          skipRetrievingKeyFromApiKeyHelper: true
        }).source,
        allowDangerouslySkipPermissionsPassed: y,
        thinkingType: E.type,
        ...(b && {
          systemPromptFlag: b
        }),
        ...(S && {
          appendSystemPromptFlag: S
        }),
        ...(C && {
          noFlickerEnvVar: C
        }),
        rendererEntryPath: tPe(),
        ...k,
        is_simple: kd() || undefined,
        is_safe_mode: Ql() || undefined,
        is_coordinator: dis?.isCoordinatorMode() ? true : undefined,
        autoUpdatesChannel: getInitialSettings().autoUpdatesChannel ?? "latest",
        ...{}
      };
      logEvent("tengu_init", I);
    } catch (C) {
      Oe(C);
    }
  }
  async function cis(e) {}
  function JSr(e) {
    let t = e.brief;
    let n = Me.CLAUDE_CODE_BRIEF;
    if (!t && !n) {
      return;
    }
    D3();
    let {
      isBriefEntitled: r
    } = __toCommonJS(CZ);
    let o = r();
    if (o) {
      setUserMsgOptIn(true);
    }
    logEvent("tengu_brief_mode_enabled", {
      enabled: o,
      gated: !o,
      source: n ? "env" : "flag"
    });
  }
  function K8f() {
    (process.stderr.isTTY ? process.stderr : process.stdout.isTTY ? process.stdout : undefined)?.write(WF);
  }
  function Y8f(e) {
    if (typeof e !== "object" || e === null) {
      return {};
    }
    let t = e;
    let n = t.teammateMode;
    return {
      agentId: typeof t.agentId === "string" ? t.agentId : undefined,
      agentName: typeof t.agentName === "string" ? t.agentName : undefined,
      teamName: typeof t.teamName === "string" ? t.teamName : undefined,
      agentColor: typeof t.agentColor === "string" ? t.agentColor : undefined,
      planModeRequired: typeof t.planModeRequired === "boolean" ? t.planModeRequired : undefined,
      parentSessionId: typeof t.parentSessionId === "string" ? t.parentSessionId : undefined,
      teammateMode: n === "auto" || n === "tmux" || n === "iterm2" || n === "in-process" ? n : undefined,
      agentType: typeof t.agentType === "string" ? t.agentType : undefined
    };
  }
  async function J8f(e, t) {
    let n = t.commands.filter(s => !("_hidden" in s && s._hidden)).flatMap(s => [s.name(), ...s.aliases()]);
    let r = e.toLowerCase();
    let o = r !== e && n.includes(r) ? r : hLe(r, n.map(s => ({
      name: s
    })));
    if (!o) {
      return;
    }
    await logEventAsync("tengu_unknown_command_suggestion", {});
    process.stderr.write([_$u.red(vGd.cross) + ` unknown command "${e}"`, _$u.dim(`  ${cF.last} `) + "Did you mean " + _$u.bold(`claude ${o}`) + "?", "", _$u.dim("Run ") + _$u.dim.bold("claude --help") + _$u.dim(" to list commands, or ") + _$u.dim.bold(`claude -p "${e}"`) + _$u.dim(" to send as a prompt."), ""].join(`
`));
    await bR(1);
  }
  var MXc;
  var uis;
  var TRe;
  var AXc = () => (qp(), __toCommonJS(UWr));
  var N8f = () => __toCommonJS(t0l);
  var L8f = () => (YNe(), __toCommonJS(hCo));
  var dis;
  var IXc;
  var usn = __lazy(() => {
    Fat();
    H4();
    R3();
    $yn();
    _st();
    efr();
    uT();
    rfr();
    ISc();
    jTc();
    SL();
    GYo();
    WTc();
    MBe();
    ufe();
    E$t();
    wl();
    Uc();
    LG();
    Afr();
    gq();
    pts();
    BF();
    $n();
    Gu();
    x_t();
    oXn();
    t7o();
    HYe();
    d$();
    Tqc();
    mXr();
    q$();
    Kc();
    z8e();
    UCt();
    O1();
    TQn();
    QDo();
    UV();
    mE();
    aon();
    no();
    cPe();
    Fp();
    YW();
    GT();
    Rqc();
    qEe();
    ro();
    Cs();
    Wd();
    Qoe();
    B7o();
    D8();
    e1();
    ode();
    zg();
    Bgr();
    BQo();
    kqc();
    KW();
    ln();
    $n();
    Ot();
    Adr();
    Iqc();
    Dqc();
    Lqc();
    at();
    gts();
    Bm();
    I4c();
    J8();
    mT();
    qJ();
    Lts();
    pU();
    eA();
    EI();
    OZo();
    O4c();
    Jor();
    G$o();
    kS();
    S9e();
    _pt();
    Fts();
    uve();
    b1();
    Gwe();
    bx();
    VT();
    Pme();
    zhr();
    vgr();
    $A();
    pr();
    gn();
    tQo();
    llt();
    zp();
    TKt();
    FP();
    na();
    yVo();
    i1();
    Gd();
    Rn();
    Ogr();
    nst();
    Eo();
    sne();
    Ds();
    M4c();
    HT();
    S_();
    oy();
    jz();
    q5t();
    H8();
    sNe();
    k1();
    L4c();
    Xk();
    eoe();
    fa();
    l6n();
    Hts();
    W4c();
    Kke();
    xje();
    DA();
    Lve();
    z4c();
    Wk();
    J4c();
    GL();
    X4c();
    dHn();
    l9();
    Iw();
    RRt();
    Bes();
    sCo();
    GEt();
    hd();
    HG();
    cht();
    yd();
    vo();
    je();
    dt();
    lm();
    nor();
    UCn();
    h7r();
    Mer();
    OD();
    U1();
    TXe();
    Zn();
    Gts();
    at();
    tWc();
    rWc();
    sWc();
    aWc();
    cWc();
    dWc();
    mWc();
    hWc();
    gWc();
    _Wc();
    SWc();
    EWc();
    wWc();
    RWc();
    IWc();
    OWc();
    $8e();
    Tpe();
    Ugt();
    j8e();
    xRt();
    tre();
    D_();
    DC();
    Zm();
    dw();
    osn();
    xg();
    t6n();
    LYe();
    Th();
    Q_r();
    NC();
    nXn();
    Ppe();
    MWc();
    FM();
    XN();
    Bne();
    iP();
    MXc = require("crypto");
    uis = require("fs/promises");
    TRe = require("path");
    process.env.NoDefaultCurrentDirectoryInExePath = "1";
    profileCheckpoint("main_tsx_entry");
    au("node_boot_ms", process.uptime() * 1000, 0);
    ihl();
    startMdmRawRead();
    startKeychainPrefetch();
    dis = (N1(), __toCommonJS(DG));
    IXc = (xse(), __toCommonJS(Fme));
    profileCheckpoint("main_tsx_imports_loaded");
    if (U8f()) {
      process.exit(1);
    }
  });
  var FXc = {};
  __export(FXc, {
    spawnSpare: () => spawnSpare,
    runBgSpare: () => runBgSpare,
    reapOrphanSpares: () => reapOrphanSpares,
    claimSpare: () => claimSpare
  });
  async function runBgSpare(e) {
    let t = e[0];
    if (!t) {
      process.stderr.write(`[bg-spare] missing claim sock path
`);
      process.exit(2);
    }
    let n = await Q8f();
    let r = Promise.resolve().then(() => (usn(), XSr));
    let o = () => {
      try {
        LXc.unlinkSync(t);
      } catch {}
    };
    let s = () => {
      o();
      process.exit(0);
    };
    let i = d => {
      o();
      process.stderr.write(`[bg-spare] uncaughtException: ${he(d)}
`);
      setBgExitCause("spare_uncaught");
      process.exit(1);
    };
    let a = process.ppid;
    let l = setInterval((d, p) => {
      if (process.ppid !== d) {
        p();
        process.exit(0);
      }
    }, 2000, a, o);
    l.unref();
    for (let d of ["SIGTERM", "SIGHUP", "SIGINT"]) {
      process.on(d, s);
    }
    process.on("uncaughtException", i);
    let c = () => {
      clearInterval(l);
      for (let d of ["SIGTERM", "SIGHUP", "SIGINT"]) {
        process.off(d, s);
      }
      process.off("uncaughtException", i);
    };
    let u;
    try {
      u = await Kmr(t, undefined, n);
    } catch (d) {
      o();
      process.stderr.write(`[bg-spare] claim recv failed: ${he(d)}
`);
      setBgExitCause("spare_claim_recv");
      process.exit(1);
    }
    c();
    try {
      await r;
      await Ymr(u, r);
    } catch (d) {
      let p = gd(d) ?? U4(d) ?? "Error";
      throw setBgExitCause("spare_postclaim:" + p, u.env.CLAUDE_JOB_DIR), process.stderr.write(`[bg-spare] post-claim init failed: ${he(d)}
`), d;
    }
  }
  async function Q8f() {
    let e = Me.CLAUDE_BG_CLAIM_AUTH;
    delete process.env.CLAUDE_BG_CLAIM_AUTH;
    let t = Me.CLAUDE_BG_SOCKET_TOKENS_PATH;
    if (delete process.env.CLAUDE_BG_SOCKET_TOKENS_PATH, !t) {
      return e;
    }
    let n = await UEt(t);
    if (await mN.unlink(t).catch(() => {}), !n?.claimAuth) {
      logForDebugging("[bg-spare] tokens file unreadable; claim gate degraded", {
        level: "warn"
      });
    }
    return n?.claimAuth ?? e;
  }
  async function spawnSpare(e) {
    if (Wt() === "windows") {
      return null;
    }
    return vl("daemon_bg_spare_refill", async () => {
      let t = QSr.randomBytes(4).toString("hex");
      let n = $Wl(t);
      let r = HWl(t);
      let o = QSr.randomBytes(16).toString("hex");
      let s = QSr.randomBytes(16).toString("hex");
      await mN.mkdir(GZ(), {
        recursive: true,
        mode: 448
      }).catch(() => {});
      let i = await K7o(`spare-${t}`, {
        ptyAuth: o,
        claimAuth: s
      });
      await mN.unlink(n).catch(() => {});
      await mN.unlink(r).catch(() => {});
      let [a, ...l] = rVf();
      let c = await mN.open(ZO(n), "w").catch(() => null);
      let u;
      try {
        u = Bun.spawn([a, ...l, "--bg-pty-host", n, "200", "50", "--", a, ...l, "--bg-spare", r], {
          cwd: GZ(),
          env: Z8f(i ? {
            tokensPath: i
          } : {
            ptyAuth: o,
            claimAuth: s
          }),
          stdio: ["ignore", "ignore", c?.fd ?? "ignore"],
          detached: true,
          windowsHide: true
        });
        u.unref();
      } catch (p) {
        if (i) {
          mN.unlink(i).catch(() => {});
        }
        throw p;
      } finally {
        await c?.close().catch(() => {});
      }
      let d = {
        hostPid: u.pid,
        ptySock: n,
        claimSock: r,
        ptyAuth: o,
        claimAuth: s,
        startedAt: Date.now(),
        cliVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        dispose() {
          try {
            u.kill("SIGTERM");
          } catch {}
        }
      };
      u.exited.then(async () => {
        if (mN.unlink(n).catch(() => {}), mN.unlink(r).catch(() => {}), i) {
          mN.unlink(i).catch(() => {});
        }
        let p = ((await t0(ZO(n), 1048576)) ?? "").slice(0, 2000).trim();
        if (p.length > 0) {
          logForDebugging(`bg spare host pid=${u.pid} exit stderr:
${p}`, {
            level: "warn"
          });
        }
        mN.unlink(ZO(n)).catch(() => {});
        mN.unlink(JM(n)).catch(() => {});
        e.onExit();
      });
      e.log(`bg spare spawned host pid=${u.pid}`);
      return d;
    });
  }
  function Z8f(e) {
    let t = {
      ...process.env
    };
    for (let n of Hnn) {
      delete t[n];
    }
    if (eyn(t)) {
      let n = t.CLAUDE_CODE_HOST_AUTH_ENV_VAR;
      if (n) {
        delete t[n];
      }
      for (let r of uY) {
        delete t[r];
      }
    } else if (t.ANTHROPIC_BASE_URL) {
      delete t.ANTHROPIC_AUTH_TOKEN;
    }
    for (let n of Y7o) {
      delete t[n];
    }
    for (let n of Object.keys(t)) {
      if (SMt.some(r => n.startsWith(r))) {
        delete t[n];
      }
    }
    if (Wt() === "macos") {
      delete t.CLAUDE_CODE_OAUTH_TOKEN;
    }
    Object.assign(t, {
      CLAUDE_CODE_SESSION_KIND: "bg",
      CLAUDE_BG_BACKEND: "daemon",
      FORCE_COLOR: "3",
      COLORTERM: "truecolor",
      BROWSER: "true",
      ...("tokensPath" in e ? {
        CLAUDE_BG_SOCKET_TOKENS_PATH: e.tokensPath
      } : {
        CLAUDE_BG_PTY_AUTH: e.ptyAuth,
        CLAUDE_BG_CLAIM_AUTH: e.claimAuth
      })
    });
    return t;
  }
  function claimSpare(e, t, n, r) {
    let o = PK.claim(e, {
      pid: t.hostPid,
      ptySockPath: t.ptySock,
      spawnPty: n,
      getAuthSnapshot: r,
      ptyAuth: t.ptyAuth
    });
    z7o(e.short, She(e) ? undefined : r?.()).then(s => tVf(t.claimSock, eVf(e, s, o.socketAuth(), t.claimAuth))).catch(s => {
      logEvent("tengu_bg_sendclaim_failed", {
        short: e.short,
        errno: gd(s),
        error: he(s).slice(0, 100)
      });
      logForDebugging(`[bg-spare] send-claim failed: ${he(s)}`, {
        level: "warn"
      });
      let i = eTr.connect(t.ptySock);
      i.on("error", () => {});
      i.once("connect", () => {
        i.write(YO({
          t: "kill",
          sig: "SIGTERM"
        }));
        i.end();
      });
    });
    return o;
  }
  function eVf(e, t, n, r) {
    let {
      env: o,
      argv: s
    } = PK.buildClaimFrame(e, t, n);
    return {
      cwd: e.cwd,
      env: o,
      argv: s,
      sessionId: e.sessionId,
      auth: r
    };
  }
  async function tVf(e, t) {
    let n = Date.now();
    let r = 5000;
    for (let o = 0;; o++) {
      if (Date.now() - n > 5000) {
        throw Error("send-claim timeout");
      }
      try {
        await nVf(e, t);
        return;
      } catch (s) {
        let i = en(s);
        if (!(i === "ENOENT" || i === "ECONNREFUSED") || o >= NXc.length) {
          throw s;
        }
        await sleep(NXc[o] ?? 500);
      }
    }
  }
  function nVf(e, t) {
    return new Promise((n, r) => {
      let o = eTr.connect(e);
      o.once("error", r);
      o.once("connect", () => {
        o.end(De(t) + `
`, () => n());
      });
    });
  }
  async function reapOrphanSpares(e, t) {
    if (Wt() === "windows") {
      return;
    }
    let n = new Set();
    for (let s of e.values()) {
      let i = s.rosterEntry().ptySock;
      if (i) {
        n.add(i);
      }
    }
    let r = await mN.readdir(GZ()).catch(() => []);
    let o = 0;
    for (let s of r) {
      if (!s.endsWith(".pty.sock")) {
        continue;
      }
      let i = ZSr.join(GZ(), s);
      if (n.vZc(i)) {
        continue;
      }
      o++;
      let a = eTr.connect(i);
      a.on("error", () => {
        mN.unlink(i).catch(() => {});
      });
      a.once("connect", () => {
        a.resume();
        a.write(YO({
          t: "kill",
          sig: "SIGTERM"
        }));
        a.end();
        setTimeout(l => l.destroy(), 2000, a).unref();
      });
    }
    for (let s of r) {
      let i = [".err", ".late", ".err.read"].find(a => s.endsWith(`.pty.sock${a}`));
      if (i) {
        let a = s.slice(0, -i.length);
        if (!r.includes(a)) {
          mN.unlink(ZSr.join(GZ(), s)).catch(() => {});
        }
      }
      if (s.endsWith(".claim.sock")) {
        mN.unlink(ZSr.join(GZ(), s)).catch(() => {});
      }
    }
    if (o) {
      t(`bg orphan-spare reap: ${o}`);
    }
  }
  function rVf() {
    return rm() ? [process.execPath] : [process.execPath, process.argv[1]];
  }
  var QSr;
  var LXc;
  var mN;
  var eTr;
  var ZSr;
  var NXc;
  var his = __lazy(() => {
    ln();
    Ot();
    je();
    pr();
    dt();
    n1();
    lW();
    Cs();
    j7o();
    Qmr();
    uP();
    X7e();
    BEt();
    M7();
    QSr = require("crypto");
    LXc = require("fs");
    mN = require("fs/promises");
    eTr = require("net");
    ZSr = require("path");
    NXc = [50, 100, 150, 200, 250, 300, 400, 500, 500, 500];
  });
  var HXc = {};
  __export(HXc, {
    runPreload: () => runPreload,
    PRELOAD_CLAIM_SOCK: () => "/home/claude/.claude/remote/spare.sock",
    CCR_SESSION_SCOPED_ENV_VARS: () => CCR_SESSION_SCOPED_ENV_VARS
  });
  async function runPreload(e) {
    let t = e[0] || "/home/claude/.claude/remote/spare.sock";
    let n = `${t}.pid`;
    let r = Promise.resolve().then(() => (usn(), XSr));
    for (let l of CCR_SESSION_SCOPED_ENV_VARS) {
      delete process.env[l];
    }
    try {
      lQe.mkdirSync(UXc.dirname(t), {
        recursive: true,
        mode: 448
      });
      lQe.unlinkSync(t);
    } catch {}
    let o = () => {
      for (let l of [t, n]) {
        try {
          lQe.unlinkSync(l);
        } catch {}
      }
    };
    let s = () => {
      o();
      process.exit(0);
    };
    let i = l => {
      o();
      process.stderr.write(`[preload] uncaughtException: ${he(l)}
`);
      process.exit(1);
    };
    for (let l of ["SIGTERM", "SIGHUP", "SIGINT"]) {
      process.on(l, s);
    }
    process.on("uncaughtException", i);
    let a;
    try {
      a = await Kmr(t, () => {
        lQe.writeFileSync(n, String(process.pid), {
          mode: 384
        });
      });
    } catch (l) {
      o();
      process.stderr.write(`[preload] claim recv failed: ${he(l)}
`);
      process.exit(1);
    }
    for (let l of ["SIGTERM", "SIGHUP", "SIGINT"]) {
      process.off(l, s);
    }
    process.off("uncaughtException", i);
    o();
    await r;
    await Ymr(a, r);
  }
  var lQe;
  var UXc;
  var CCR_SESSION_SCOPED_ENV_VARS;
  var jXc = __lazy(() => {
    dt();
    j7o();
    lQe = require("fs");
    UXc = require("path");
    CCR_SESSION_SCOPED_ENV_VARS = ["CLAUDE_CODE_SESSION_ACCESS_TOKEN", "CLAUDE_CODE_WORKER_EPOCH", "CLAUDE_CODE_RESUME_INTERRUPTED_TURN", "CLAUDE_CODE_RESUME_PROMPT", "CLAUDE_CODE_SESSION_ID", "CLAUDE_CODE_REMOTE_SESSION_ID", "CLAUDE_CODE_BASE_REF", "CLAUDE_CODE_BASE_REFS", "CLAUDE_CODE_REPO_CHECKOUTS", "CLAUDE_CODE_DIAGNOSTICS_FILE", "CLAUDE_SESSION_INGRESS_TOKEN_FILE", "CLAUDECODE", "CLAUDE_CODE_CHILD_SESSION", "CLAUDE_RUNNER_ACTIVITY_FD"];
  });
  async function cQe(e, t) {
    await qH.mkdir(Hqo(), {
      recursive: true,
      mode: 448
    }).catch(() => {});
    await qH.rename(e, ERe.join(Hqo(), ERe.basename(e))).catch(() => qH.unlink(e).catch(() => {}));
    logForDebugging(`[bg-dispatch] rejected ${ERe.basename(e)}: ${t}`, {
      level: "warn"
    });
    logEvent("tengu_bg_dispatch_rejected", {
      reason: t.slice(0, 100)
    });
  }
  async function WXc(e, t) {
    let n;
    try {
      n = await qH.lstat(e);
    } catch (a) {
      if (fn(a)) {
        return;
      }
      Ae("daemon_bg_dispatch_ingest", "read_failed");
      return cQe(e, gd(a) ?? "unknown");
    }
    if (n.isSymbolicLink()) {
      Ae("daemon_bg_dispatch_ingest", "symlink");
      return cQe(e, "symlink");
    }
    if (!n.isFile()) {
      Ae("daemon_bg_dispatch_ingest", "not_a_file");
      logForDebugging(`[bg-dispatch] removed non-regular ${ERe.basename(e)}`, {
        level: "warn"
      });
      await qH.rm(e, {
        recursive: true,
        force: true
      }).catch(() => {});
      return;
    }
    if (n.size > 262144) {
      Ae("daemon_bg_dispatch_ingest", "oversized");
      return cQe(e, `oversized (${n.size} bytes)`);
    }
    let r;
    try {
      r = await qH.readFile(e, "utf8");
    } catch (a) {
      if (fn(a)) {
        return;
      }
      Ae("daemon_bg_dispatch_ingest", "read_failed");
      return cQe(e, gd(a) ?? "unknown");
    }
    let o;
    let s = true;
    try {
      o = qt(r);
    } catch {
      o = undefined;
      s = false;
    }
    let i;
    try {
      i = bsr().safeParse(o);
    } catch {
      Ae("daemon_bg_dispatch_ingest", "transform_throw");
      return cQe(e, "transform_throw");
    }
    if (!i.success) {
      Ae("daemon_bg_dispatch_ingest", s ? "schema" : "bad_json");
      return cQe(e, "schema");
    }
    if (Date.now() - i.data.createdAt > 86400000) {
      Ae("daemon_bg_dispatch_ingest", "stale");
      return cQe(e, "stale");
    }
    t(i.data);
    Pe("daemon_bg_dispatch_ingest");
    await qH.unlink(e).catch(() => {});
  }
  async function aVf(e) {
    let t;
    try {
      t = await qH.readdir(fYe());
    } catch (n) {
      if (fn(n)) {
        return;
      }
      throw n;
    }
    for (let n of t) {
      if (n.startsWith(".") || GXc(n) || n === "rejected") {
        continue;
      }
      await WXc(ERe.join(fYe(), n), e);
    }
  }
  function GXc(e) {
    return e.endsWith(".tmp") || e.includes(".tmp.");
  }
  async function VXc(e) {
    return vl("daemon_bg_watcher_start", () => lVf(e));
  }
  async function lVf(e) {
    await qH.mkdir(fYe(), {
      recursive: true,
      mode: 448
    }).catch(() => {});
    let t = Wt();
    let n = t === "macos";
    let r = jF.watch(fYe(), {
      ignoreInitial: true,
      depth: 0,
      usePolling: n,
      interval: 100,
      ignored: o => GXc(ERe.basename(o)) || ERe.basename(o) === "rejected",
      ...(t === "windows" && {
        awaitWriteFinish: {
          stabilityThreshold: 50,
          pollInterval: 20
        }
      })
    });
    r.on("add", o => {
      WXc(o, e).catch(s => logForDebugging(`[bg-dispatch] ${s}`, {
        level: "error"
      }));
    });
    r.on("error", o => {
      logForDebugging(`[bg-dispatch] watcher error: ${o}`, {
        level: "error"
      });
      logEvent("tengu_bg_dispatch_watcher_failed", {
        errno: gd(o) ?? "unknown"
      });
    });
    await withTimeout(qXc.once(r, "ready"), 5000, "chokidar ready").catch(o => logForDebugging(`[bg-dispatch] watcher ready wait: ${o}`));
    await aVf(e).catch(o => {
      logForDebugging(`[bg-dispatch] cold-start drain: ${o}`, {
        level: "error"
      });
      logEvent("tengu_bg_dispatch_watcher_failed", {
        errno: gd(o) ?? "unknown"
      });
    });
    return {
      close: () => r.close()
    };
  }
  var qXc;
  var qH;
  var ERe;
  var zXc = __lazy(() => {
    oue();
    ln();
    Ot();
    je();
    dt();
    Cs();
    uP();
    pL();
    qXc = require("events");
    qH = require("fs/promises");
    ERe = require("path");
  });
  async function YXc(e, t = {}) {
    let n;
    let r;
    let o = new Map();
    let s = async () => {
      let i = new Set();
      let a = t.spawnPty ?? V7o();
      let l = t.onKeepAliveChange ?? (() => {});
      let c = false;
      let u = false;
      let d = null;
      let p = false;
      let m = false;
      let f = t.spawnPty === undefined;
      let h = () => {
        if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_spare_enable", true)) {
          if (d) {
            d.dispose();
            d = null;
          }
          return;
        }
        if (iJe()) {
          if (d) {
            d.dispose();
            d = null;
          }
          return;
        }
        if (!m || d || p || c || !u || !a || !f || Wt() === "windows") {
          return;
        }
        p = true;
        let H = null;
        let U = false;
        spawnSpare({
          log: e,
          onExit: () => {
            if (H === null) {
              U = true;
              return;
            }
            if (d === H) {
              if (d = null, Date.now() - H.startedAt >= 2000) {
                h();
              }
            }
          }
        }).then(N => {
          if (H = N, !N || c || U) {
            N?.dispose();
            return;
          }
          d = N;
          logEvent("tengu_bg_spare_spawn", {});
        }).catch(N => {
          if (Zd(N)) {
            logForDebugging(`bg-spare spawn failed: ${en(N)} ${N.message}`, {
              level: "warn"
            });
            return;
          }
          Oe(N);
        }).finally(() => {
          p = false;
        });
      };
      let g = async (H, U = 0, N) => {
        if (c) {
          return "closed";
        }
        m = true;
        let W = false;
        if (She(H) && !o.vZc(H.short)) {
          try {
            await Bd.mkdir(tZt(), {
              recursive: true,
              mode: 448
            });
            await Bd.writeFile(Dfe(H.short), "");
            W = true;
          } catch (K) {
            Oe(K);
            Ae("daemon_bg_session_create", "host_tombstone_write");
            return "dropped";
          }
        }
        let j = o.get(H.short);
        if (j) {
          if ((j.isKilling || j.isRetiring || j.record.outcome) && U < 30) {
            if (U === 15 && (j.isKilling || j.isRetiring)) {
              logEvent("tengu_bg_dispatch_sigkill_escalate", {});
              j.kill("SIGKILL");
            }
            await sleep(100);
            return g(H, U + 1, N);
          }
          let K = j.isKilling || j.isRetiring || j.record.outcome;
          if (W && !She(j.dispatch)) {
            await Bd.unlink(Dfe(H.short)).catch(() => {});
          }
          if (e(K ? `bg: dispatch ${H.short} dropped \u2014 retry budget exhausted (handle still settling)` : `bg: dup dispatch ${H.short} dropped (existing handle still live)`), K) {
            Ae("daemon_bg_session_create", "dup_retry_exhausted");
            return "dropped";
          }
          Pe("daemon_bg_session_create");
          return "dup-live";
        }
        if (!She(H)) {
          Bd.unlink(Dfe(H.short)).catch(() => {});
        }
        let z = iJe();
        if (z && o.size > 0) {
          let K = Math.round(KXc.freemem() / 1024 / 1024);
          e(`bg: low memory (${K}MB free) \u2014 retiring settled workers before spawning ${H.short}`);
          logEvent("tengu_bg_dispatch_low_mem", {
            free_mb: K,
            handles: o.size
          });
          TGe().catch(J => (Oe(J), new Set())).then(J => {
            for (let Q of o.values()) {
              Q.retireIfSettled(60000, J).catch(Z => Oe(Z));
            }
          });
        }
        if (H.source === "spare" && z) {
          e(`bg: low memory \u2014 skipping spare dispatch ${H.short}`);
          return "dropped";
        }
        if (d && !N && H.launch.mode !== "exec" && d.cliVersion === {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION && getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_spare_enable", true)) {
          let K = d;
          d = null;
          try {
            let J = claimSpare(H, K, a, t.getAuthSnapshot);
            o.set(H.short, J);
            _is(o, J, l, i, e);
            l();
            logEvent("tengu_bg_spare_claim", {
              age_ms: Date.now() - K.startedAt
            });
            e(`bg claimed-spare ${H.short} (${H.source})`);
            Pe("daemon_bg_session_create");
            h();
            return "claimed";
          } catch (J) {
            let Q = en(J);
            let Z = Q === "ENOENT" ? "enoent" : Q === "ECONNREFUSED" ? "econnrefused" : J instanceof Error ? "error" : "unknown";
            logEvent("tengu_bg_spare_claim_fail", {
              reason: Z
            });
            K.dispose();
          }
        }
        let V = PK.spawn(H, a, t.getAuthSnapshot, N ? {
          afterUpgrade: N
        } : undefined);
        o.set(H.short, V);
        _is(o, V, l, i, e);
        l();
        h();
        e(`bg spawned ${H.short} (${H.source})`);
        Pe("daemon_bg_session_create");
        return "spawned";
      };
      let y = (H = "SIGTERM") => {
        let U = 0;
        for (let N of o.values()) {
          if (!N.record.outcome) {
            N.kill(H);
            U++;
          }
        }
        return U;
      };
      await Uir();
      await UWl();
      let _ = await ysc(o, g, t.onNudge ?? (async () => false), H => {
        let U = H ? y("SIGTERM") : 0;
        t.onShutdown?.();
        return U;
      }, () => u, t.onYield ?? (() => false));
      n = _;
      e(`bg: control socket bound at ${B0(T5())}`);
      _.onLeaseChange.subscribe(l);
      _.onLeaseChange.subscribe(() => {
        if (_.leaseCount() > 0 && !m) {
          m = true;
          h();
        }
      });
      await Promise.all(Wt() === "windows" ? [Bd.mkdir(_Ue(), {
        recursive: true
      }).catch(() => {})] : [Bd.mkdir(jqo(), {
        recursive: true,
        mode: 448
      }).catch(() => {}), Bd.mkdir(zvt(), {
        recursive: true,
        mode: 448
      }).catch(() => {})]);
      BWl();
      let b = await j3();
      let S = 0;
      let E = 0;
      let C = 0;
      if (await Promise.all(Object.entries(b.workers).map(async ([H, U]) => {
        let N;
        try {
          N = await PK.adopt(H, U, a, t.getAuthSnapshot);
        } catch (W) {
          Oe(Gvt(W));
          E++;
          return;
        }
        if (!N && U.procStart === undefined && U.ptySock && (await Pur(U.ptySock))) {
          U.procStart = await getProcessStartTimeAsync(U.pid);
          try {
            N = await PK.adopt(H, U, a, t.getAuthSnapshot);
          } catch (W) {
            Oe(Gvt(W));
            N = null;
          }
          N ??= PK.unverified(H, U);
        }
        if (N) {
          o.set(H, N);
          _is(o, N, l, i, e);
          S++;
        } else if (U.pendingRespawn === "upgrade") {
          C++;
          logEvent("tengu_bg_adopt_upgrade_respawn", {});
          g(U.dispatch, 0, true).catch(W => Oe(W));
        } else {
          E++;
          let W = await Iur(U.ptySock, U.dispatch);
          let j = W ?? {
            state: "failed",
            detail: "process gone while supervisor was down"
          };
          if (EGe(H, j.state, j.detail, {
            midWork: !W
          }), Bd.unlink(nZt(H)).catch(() => {}), Wt() === "windows") {
            Bd.unlink(Bwe(H)).catch(() => {});
            Bd.unlink(ZO(cP(H))).catch(() => {});
            Bd.unlink(JM(cP(H))).catch(() => {});
            Bd.unlink(VZ(U.ptySock ?? cP(H))).catch(() => {});
          } else if (Bd.unlink(eZt(H)).catch(() => {}), Bd.unlink(U.rendezvousSock).catch(() => {}), U.ptySock) {
            Bd.unlink(U.ptySock).catch(() => {});
            Bd.unlink(ZO(U.ptySock)).catch(() => {});
            Bd.unlink(JM(U.ptySock)).catch(() => {});
            Bd.unlink(VZ(U.ptySock)).catch(() => {});
            try {
              process.kill(U.pid, 0);
            } catch {
              sigtermThenKill([-U.pid]);
            }
          }
        }
      })), S + E + C > 0) {
        if (e(`bg adopt: adopted=${S} respawned=${C} dead=${E}`), logEvent("tengu_bg_adopt", {
          adopted: S,
          respawned: C,
          dead: E
        }), E === 0) {
          Pe("daemon_bg_adopt");
        } else if (S > 0 || C > 0) {
          Et("daemon_bg_adopt", "partial");
        } else {
          Ae("daemon_bg_adopt", "all_workers_dead");
        }
      }
      let x = await HZ().catch(() => null);
      let A = x?.pid === process.pid;
      let I = !(x !== null && x.pid !== process.pid) && !(t.isShuttingDown?.() ?? false);
      if (!A) {
        e(`bg: skipped post-adopt sweeps + roster rewrite \u2014 daemon.lock is ${x ? `held by pid ${x.pid}` : "absent"} (yield/handover in flight)`);
      }
      if (A && !b.parseFailed) {
        dVf(o, e);
      }
      if (A && !b.parseFailed) {
        await reapOrphanSpares(o, e);
      }
      if (A) {
        await Kvt(H => {
          H.workers = {};
          for (let [U, N] of o) {
            H.workers[U] = N.rosterEntry();
          }
        }).catch(H => Oe(H));
      }
      let O = I ? await VXc(H => void g(H).catch(U => Oe(U))) : null;
      if (r = O ?? undefined, u = I, l(), I && o.size > 0) {
        m = true;
      }
      h();
      let M = Date.now();
      let L = false;
      let P = setInterval(async (H, U) => {
        if (L) {
          return;
        }
        L = true;
        try {
          await F(H, U);
        } finally {
          L = false;
        }
      }, 60000, o, h);
      async function F(H, U) {
        {
          let N = Date.now();
          let W = N - M - 60000;
          if (M = N, W > 60000) {
            for (let Z of H.values()) {
              Z.shiftGraceClocksForward(W);
            }
            U();
            return;
          }
          let j = iJe();
          let z = j ? 60000 : 3600000;
          let V = j ? 60000 : usc();
          let K = await TGe().catch(Z => (Oe(Z), new Set()));
          for (let Z of H.values()) {
            if (K.vZc(Z.dispatch.short)) {
              Z.respawnIfIdleStale(K).catch(ne => Oe(ne));
            }
          }
          let J = await Promise.all([...H.values()].map(Z => Z.retireIfSettled(z, K, V).then(ne => ne.retired).catch(ne => (Oe(ne), false))));
          let Q = Bn(J, Z => Z);
          if (j && Q === 0 && iJe()) {
            let Z = [...H.values()].filter(ne => K.vZc(ne.dispatch.short));
            if (Z.length > 0) {
              e("bg: low memory persists after shedding non-pinned \u2014 retiring pinned settled workers as a last resort");
              logEvent("tengu_bg_retire_pinned_low_mem", {});
              for (let ne of Z) {
                ne.retireIfSettled(z, uVf, V).catch(oe => Oe(oe));
              }
            }
          }
          if (!j && Eur()) {
            let Z = getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_prewarm_per_sweep", 3);
            let ne = 12;
            for (let oe of H.values()) {
              if (Z <= 0 || ne <= 0) {
                break;
              }
              if (K.vZc(oe.dispatch.short)) {
                continue;
              }
              if (oe.isBooting) {
                Z--;
                continue;
              }
              if (!oe.record.cliVersion || oe.record.cliVersion === {
                ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
                PACKAGE_URL: "@anthropic-ai/claude-code",
                README_URL: "https://code.claude.com/docs/en/overview",
                VERSION: "2.1.198",
                FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
                BUILD_TIME: "2026-07-01T06:09:31Z",
                GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
              }.VERSION) {
                continue;
              }
              if ((await oe.respawnIfIdleStale(undefined, "prewarm").catch(re => (Oe(re), {
                respawned: false
              }))).respawned) {
                Z--;
              } else {
                ne--;
              }
            }
          }
          U();
        }
      }
      P.unref();
      return {
        handles: o,
        dispatch: H => void g(H).catch(U => Oe(U)),
        leaseCount: _.leaseCount,
        liveHandleCount: () => {
          let H = 0;
          for (let U of o.values()) {
            if (!U.record.outcome) {
              H++;
            }
          }
          return H;
        },
        pendingSettleWrites: () => i.size,
        killAll: y,
        close: async H => {
          let U = H?.displaced ?? false;
          if (c = true, clearInterval(P), d) {
            d.dispose();
            d = null;
          }
          await Promise.all([O?.close().catch(() => {}), _.close({
            skipUnlink: U || H?.skipPathCleanup
          }).catch(() => {})]);
          for (let N of o.values()) {
            N.stop();
          }
          if (await Promise.allSettled([...i]), !U && o.size === 0 && !b.parseFailed && !H?.skipPathCleanup && Wt() !== "windows") {
            await Bd.rm(Pfe(), {
              recursive: true,
              force: true
            }).catch(() => {});
          }
        }
      };
    };
    try {
      return await vl("daemon_bg_manager_start", s, i => gd(i)?.toLowerCase() ?? "error");
    } catch (i) {
      for (let l of o.values()) {
        l.stop();
      }
      await r?.close().catch(() => {});
      let a = await HZ().catch(() => null);
      throw await n?.close(a?.pid === process.pid ? undefined : {
        skipUnlink: true
      }).catch(() => {}), i;
    }
  }
  function _is(e, t, n, r, o) {
    let s = i => {
      r.add(i);
      i.finally(() => r.delete(i));
    };
    t.onSettle.subscribe(i => {
      o(`bg settled ${t.record.short} (${i})`);
      let a = dc(t.record.short);
      let l = i === "done" ? "done" : i === "killed" ? "stopped" : "failed";
      let c = t.record.detail;
      if (t.shouldDeleteJobDir) {
        s(Bd.rm(a, {
          recursive: true,
          force: true
        }).catch(d => Oe(d)));
      } else if (i === "killed" && t.isHandoffKill) {
        logEvent("tengu_bg_handoff_settle", {
          jobSessionId: br(t.record.sessionId)
        });
      } else {
        s(Zi(a).then(d => {
          if (d ? Xg(d) && !(i === "crashed" && d.state === "failed") || i === "done" && d.state === "blocked" && t.dispatch.launch.mode !== "exec" : i !== "crashed" || t.dispatch.source === "spare") {
            if (!d && t.dispatch.source === "spare") {
              return Bd.access(bis.join(a, "state.json")).then(() => {
                return;
              }, f => en(f) === "ENOENT" ? Bd.rm(a, {
                recursive: true,
                force: true
              }).catch(h => Oe(h)) : undefined);
            }
            return;
          }
          let p = new Date().toISOString();
          let m = d ?? {
            state: "working",
            detail: "",
            tempo: "active",
            output: null,
            children: null,
            linkScanOffset: 0,
            template: t.dispatch.launch.mode === "exec" ? "exec" : t.dispatch.agent ?? t.dispatch.routine ?? "bg",
            routine: t.dispatch.routine,
            respawnFlags: oOe([...t.dispatch.respawnFlags]),
            intent: t.record.intent,
            name: t.record.name,
            sessionId: t.record.sessionId,
            cwd: t.record.cwd,
            worktreePath: t.dispatch.worktree?.path ?? t.record.worktreePath,
            createdAt: new Date(t.dispatch.createdAt).toISOString(),
            updatedAt: p,
            firstTerminalAt: null,
            backend: "daemon"
          };
          return ip(a, {
            ...m,
            state: l,
            detail: l === "stopped" ? "stopped" : (c || m.detail).replace(/; respawning$/, ""),
            tempo: "idle",
            inFlight: undefined,
            needs: undefined,
            block: undefined,
            updatedAt: p,
            firstTerminalAt: m.firstTerminalAt ?? p
          });
        }).catch(d => Oe(d)));
      }
      s(Kvt(d => {
        delete d.workers[t.record.short];
      }).catch(d => Oe(d)));
      s(Bd.unlink(nZt(t.record.short)).catch(() => {}));
      let u = t.rosterEntry();
      if (Wt() === "windows") {
        s(Bd.unlink(Bwe(t.record.short)).catch(() => {}));
        s(Bd.unlink(ZO(cP(t.record.short))).catch(() => {}));
        s(Bd.unlink(JM(cP(t.record.short))).catch(() => {}));
        s(Bd.unlink(VZ(u.ptySock ?? cP(t.record.short))).catch(() => {}));
      } else if (s(Bd.unlink(eZt(t.record.short)).catch(() => {})), s(Bd.unlink(u.rendezvousSock).catch(() => {})), u.ptySock) {
        s(Bd.unlink(u.ptySock).catch(() => {}));
        s(Bd.unlink(ZO(u.ptySock)).catch(() => {}));
        s(Bd.unlink(JM(u.ptySock)).catch(() => {}));
        s(Bd.unlink(VZ(u.ptySock)).catch(() => {}));
      }
      if (t.dispatch.launch.mode === "exec" && i !== "killed") {
        n();
        setTimeout((p, m, f) => {
          if (p.get(m) === f) {
            p.delete(m);
          }
        }, 300000, e, t.record.short, t).unref();
        return;
      }
      e.delete(t.record.short);
      n();
    });
    t.onState.subscribe(i => {
      if (i.pid) {
        Kvt(a => {
          a.workers[t.record.short] = t.rosterEntry();
        }).catch(a => Oe(a));
      }
      if (i.state === "crashed" || i.state === "resuming") {
        let a = i.state;
        let l = t.record.detail;
        let c = a === "crashed" ? "idle" : "active";
        let u = dc(t.record.short);
        Zi(u).then(d => {
          if (t.record.outcome || !d || Xg(d) || d.state === "blocked" || d.tempo === "blocked") {
            return;
          }
          if (a === "resuming" && d.state !== "crashed") {
            return;
          }
          return ip(u, {
            ...d,
            state: a,
            detail: l,
            tempo: c,
            inFlight: undefined,
            updatedAt: new Date().toISOString()
          });
        }).catch(d => Oe(d));
      }
    });
  }
  async function dVf(e, t) {
    let n = Wt() === "windows";
    let [r, o] = n ? [_Ue(), ".pid"] : [zvt(), ".sock"];
    let s = await Bd.readdir(r).catch(() => []);
    let i = new Set(s.filter(l => l.endsWith(o)));
    let a = 0;
    for (let l of s) {
      if (!l.endsWith(o)) {
        let p = (n ? [".err", ".late", ".err.read"] : [".err", ".late", ".exec-exit", ".err.read"]).find(m => l.endsWith(n ? m : `.sock${m}`));
        if (p) {
          let m = l.slice(0, -p.length);
          let f = n ? m.lastIndexOf("-pty-") : -1;
          let h = n ? f >= 0 ? `${m.slice(f + 5)}.pid` : "" : m;
          if (h && !i.vZc(h)) {
            Bd.unlink(bis.join(r, l)).catch(() => {});
          }
        }
        continue;
      }
      let c = l.slice(0, -o.length);
      if (e.vZc(c)) {
        continue;
      }
      a++;
      let u = Bwe(c);
      uJe(cP(c)).then(d => {
        let p = ZO(cP(c));
        let m = JM(cP(c));
        let f = VZ(cP(c));
        if (!n) {
          EGe(c, "failed", "reaped (roster gap)");
          Bd.unlink(m).catch(() => {});
          Bd.unlink(f).catch(() => {});
          return;
        }
        if (d) {
          EGe(c, "failed", "reaped (roster gap)");
          Bd.unlink(u).catch(() => {});
          Bd.unlink(p).catch(() => {});
          Bd.unlink(m).catch(() => {});
          Bd.unlink(f).catch(() => {});
          return;
        }
        t0(u, 4096).then(h => {
          if (h === null) {
            return;
          }
          if (!isProcessRunning(Number(h))) {
            EGe(c, "failed", "reaped (roster gap)");
            Bd.unlink(u).catch(() => {});
            Bd.unlink(p).catch(() => {});
            Bd.unlink(m).catch(() => {});
            Bd.unlink(f).catch(() => {});
          }
        }).catch(() => {});
      });
    }
    if (a) {
      t(`bg orphan-reap: ${a} roster-less pty host(s)`);
      logEvent("tengu_bg_orphan_reap", {
        reaped: a
      });
    }
  }
  var Bd;
  var KXc;
  var bis;
  var uVf;
  var JXc = __lazy(() => {
    SGe();
    zf();
    ln();
    $n();
    Ot();
    B_();
    je();
    dt();
    n1();
    Tb();
    Rn();
    Cs();
    jZ();
    Qmr();
    D5o();
    zXc();
    q5o();
    vur();
    uP();
    bCt();
    hYe();
    his();
    Bd = require("fs/promises");
    KXc = require("os");
    bis = require("path");
    uVf = new Set();
  });
  async function ZXc(e) {
    let t = process.stdout.isTTY;
    let n = await P2e.stat(e).then(s => s.size).catch(() => 0);
    if (n > 10485760) {
      await Eis(e);
      n = 0;
    }
    let r = Sis(e);
    let o = false;
    return {
      write(s, i) {
        let a = `[${new Date().toISOString()}] [${s}] ${Lc(i)}
`;
        if (n += Buffer.byteLength(a), r.write(a), t) {
          process.stdout.write(a);
        }
        if (n > 10485760 && !o) {
          o = true;
          let l = r;
          (async () => {
            if (Wt() === "windows") {
              await Tis(l);
              await Eis(e);
              r = Sis(e);
            } else {
              await Eis(e);
              r = Sis(e);
              await Tis(l);
            }
            n = 0;
            o = false;
          })().catch(() => {
            o = false;
          });
        }
      },
      close() {
        return Tis(r);
      }
    };
  }
  function Sis(e) {
    let t = QXc.createWriteStream(e, {
      flags: "a"
    });
    t.on("error", () => {});
    return t;
  }
  function Tis(e) {
    return new Promise(t => e.end(() => t()));
  }
  async function Eis(e) {
    let t = `${e}.1`;
    try {
      await P2e.rename(e, t);
    } catch (n) {
      if (fn(n)) {
        return;
      }
      await P2e.unlink(t).catch(() => {});
      await P2e.rename(e, t).catch(() => P2e.unlink(e).catch(() => {}));
    }
  }
  var QXc;
  var P2e;
  var eQc = __lazy(() => {
    dt();
    Cs();
    Kv();
    QXc = require("fs");
    P2e = require("fs/promises");
  });
  function nQc(e) {
    return Math.round(e * (0.5 + Math.random()));
  }
  function gVf(e) {
    return nQc(Math.min(1000 * 2 ** e, 300000));
  }
  class tTr {
    id;
    kind;
    config;
    invocation;
    logger;
    authManager;
    onStateChange;
    child = null;
    spawnedAt = 0;
    stopping = false;
    consecutiveCrashes = 0;
    backoffTimer = null;
    exitPromise = null;
    constructor(e, t, n, r, o, s, i) {
      this.id = e;
      this.kind = t;
      this.config = n;
      this.invocation = r;
      this.logger = o;
      this.authManager = s;
      this.onStateChange = i;
    }
    get status() {
      let e = this.child?.pid;
      return e !== undefined ? {
        pid: e,
        startedAt: this.spawnedAt
      } : null;
    }
    start(e = 0) {
      if (this.stopping = false, e > 0) {
        this.scheduleRespawn(e);
      } else {
        this.spawn();
      }
    }
    updateConfig(e) {
      this.config = e;
    }
    async stop() {
      if (this.stopping = true, this.backoffTimer) {
        clearTimeout(this.backoffTimer);
        this.backoffTimer = null;
      }
      let e = this.child;
      if (!e) {
        return;
      }
      let t = this.exitPromise;
      let n = false;
      if (typeof e.send === "function") {
        try {
          n = e.send({
            type: "shutdown"
          });
        } catch {}
      }
      if (Wt() !== "windows" || !n) {
        e.kill("SIGTERM");
      }
      let r = setTimeout(o => o.kill("SIGKILL"), 5000, e);
      if (r.unref(), t) {
        await t;
      }
      clearTimeout(r);
    }
    spawn() {
      let e = Date.now();
      this.spawnedAt = e;
      let t = tQc.spawn(this.invocation.cmd, [...this.invocation.prefixArgs, "--daemon-worker", this.kind], {
        stdio: this.authManager ? ["pipe", "pipe", "pipe", "ipc"] : ["pipe", "pipe", "pipe"],
        windowsHide: true
      });
      if (this.child = t, this.onStateChange?.(), t.stdin.on("error", s => {
        this.logger.write(this.id, `stdin write error: ${s.message}`);
      }), t.stdin.write(De({
        config: this.config,
        initialAccessToken: this.authManager?.getAccessToken()
      }) + `
`), t.stdin.end(), this.authManager) {
        this.authManager.attachWorker(t);
      }
      let n = vis.createInterface({
        input: t.stdout
      });
      n.on("line", s => this.logger.write(this.id, s));
      let r = vis.createInterface({
        input: t.stderr
      });
      r.on("line", s => this.logger.write(this.id, s));
      t.on("spawn", () => Pe("daemon_worker_spawn"));
      let o = false;
      this.exitPromise = new Promise(s => {
        let i = (a, l) => {
          if (o) {
            return;
          }
          if (o = true, n.close(), r.close(), this.child = null, this.onStateChange?.(), this.authManager) {
            this.authManager.detachWorker(t);
          }
          this.exitPromise = null;
          this.onExit(a, l, e);
          s();
        };
        t.on("exit", i);
        t.on("error", a => {
          if (this.logger.write(this.id, `spawn error: ${a.message}`), Ae("daemon_worker_spawn", fn(a) ? "daemon_worker_spawn_enoent" : "daemon_worker_spawn_error"), !fn(a)) {
            i(null, null);
            return;
          }
          VJn().then(l => {
            if (l && l !== this.invocation.cmd) {
              this.logger.write(this.id, `execPath gone (version GC?) \u2014 re-resolved to ${l}`);
              this.invocation = {
                cmd: l,
                prefixArgs: []
              };
              this.consecutiveCrashes = 0;
            }
            i(null, null);
          });
        });
      });
    }
    onExit(e, t, n) {
      if (this.stopping) {
        return;
      }
      let r = Date.now() - n;
      if (e === 75) {
        let s = nQc(30000);
        this.logger.write(this.id, `exited tempfail code=${e} uptime=${r}ms \u2014 retry in ${s}ms`);
        this.scheduleRespawn(s);
        return;
      }
      if (e === 78) {
        this.logger.write(this.id, `exited permanently code=${e} uptime=${r}ms \u2014 will not respawn`);
        logEvent("tengu_daemon_worker_permanent_exit", {
          exit_code: e ?? undefined,
          uptime_ms: r,
          worker_kind: this.kind
        });
        return;
      }
      if (e !== 0 || r < 60000) {
        this.consecutiveCrashes++;
        let s = gVf(this.consecutiveCrashes);
        this.logger.write(this.id, `exited code=${e} sig=${t} uptime=${r}ms consecutive=${this.consecutiveCrashes} backoff=${s}ms`);
        logEvent("tengu_daemon_worker_crash", {
          consecutive: this.consecutiveCrashes,
          exit_code: e ?? undefined,
          uptime_ms: r,
          worker_kind: this.kind
        });
        this.scheduleRespawn(s);
      } else {
        this.consecutiveCrashes = 0;
        this.logger.write(this.id, `exited code=${e} sig=${t} uptime=${r}ms (clean) \u2014 respawning`);
        this.spawn();
      }
    }
    scheduleRespawn(e) {
      if (this.backoffTimer) {
        clearTimeout(this.backoffTimer);
      }
      this.backoffTimer = setTimeout(() => {
        if (this.backoffTimer = null, !this.stopping) {
          this.spawn();
        }
      }, e);
      this.backoffTimer.unref();
    }
  }
  var tQc;
  var vis;
  var rQc = __lazy(() => {
    ln();
    Ot();
    dt();
    Cs();
    Sve();
    tQc = require("child_process");
    vis = require("readline");
  });
  function oQc(e) {
    return e === "heartbeat" || isDaemonWorkerRegistryEnabled();
  }
  function yVf(e) {
    let t = 0;
    for (let n of Object.keys(WORKER_KINDS)) {
      t += (e[n] ?? []).length;
    }
    return t;
  }
  async function sQc(e) {
    let {
      jsonPath: t,
      invocation: n,
      logger: r,
      authManager: o,
      watch: s = $dr
    } = e;
    let i = new Map();
    let a = J8o();
    function l() {
      let g = {};
      for (let [y, _] of i) {
        let b = _.status;
        if (b) {
          g[y] = b;
        }
      }
      klc(g);
    }
    let c = await vJe(t);
    if (c.ok) {
      a = c.config;
      for (let g of c.unknownKeys) {
        r.write("supervisor", `unknown config key '${g}' \u2014 upgrade claude?`);
      }
    } else {
      r.write("supervisor", `config load failed: ${c.error} \u2014 idling`);
    }
    await o.ready;
    let u = 0;
    for (let g of Object.keys(WORKER_KINDS)) {
      if (!oQc(g)) {
        continue;
      }
      let y = a[g] ?? [];
      for (let _ = 0; _ < y.length; _++) {
        let b = `${g}:${_}`;
        let S = new tTr(b, g, y[_], n, r, o, l);
        i.set(b, S);
        S.start(u++ * 2000);
        r.write("supervisor", `spawned ${b}`);
      }
    }
    l();
    let d = async () => {
      let g = await vJe(t);
      if (!g.ok) {
        r.write("supervisor", `config reload failed: ${g.error} \u2014 keeping last-good config`);
        return;
      }
      for (let b of g.unknownKeys) {
        r.write("supervisor", `unknown config key '${b}' \u2014 upgrade claude?`);
      }
      let y = Vuc(a, g.config);
      a = g.config;
      for (let b of y.stop) {
        let S = i.get(b);
        if (S) {
          await S.stop();
          i.delete(b);
          r.write("supervisor", `stopped ${b}`);
        }
      }
      for (let {
        id: b,
        config: S
      } of y.restart) {
        let E = i.get(b);
        if (E) {
          await E.stop();
          E.updateConfig(S);
          E.start();
          r.write("supervisor", `restarted ${b}`);
        }
      }
      let _ = 0;
      for (let {
        id: b,
        kind: S,
        config: E
      } of y.start) {
        if (!oQc(S)) {
          continue;
        }
        let C = new tTr(b, S, E, n, r, o, l);
        i.set(b, C);
        C.start(_++ * 2000);
        r.write("supervisor", `spawned ${b}`);
      }
      if (y.stop.length + y.start.length + y.restart.length > 0) {
        r.write("supervisor", `reload: stopped=${y.stop.length} started=${y.start.length} restarted=${y.restart.length}`);
        logEvent("tengu_daemon_config_reload", {
          stopped: y.stop.length,
          started: y.start.length,
          restarted: y.restart.length
        });
      }
    };
    let p = Promise.resolve();
    let m = s(t, () => {
      p = p.then(d).catch(g => Oe(g));
    });
    let f = false;
    function h() {
      if (f) {
        return;
      }
      f = true;
      m();
    }
    return {
      workerCount: () => yVf(a),
      hasOAuthConsumer: () => {
        for (let g of i.values()) {
          if (WORKER_KINDS[g.kind].needsOAuth) {
            return true;
          }
        }
        return false;
      },
      disposeWatcher: h,
      drainReloads: () => p,
      stop: async () => {
        h();
        await p;
        await Promise.all(Array.from(i.values()).map(g => g.stop()));
        await Alc();
      }
    };
  }
  var iQc = __lazy(() => {
    uT();
    Ot();
    Rn();
    Ptn();
    fdr();
    rQc();
    Itn();
  });
  async function aQc(e) {
    try {
      let t = await nTr.realpath(e);
      let n = await nTr.stat(t);
      return {
        target: t,
        mtimeMs: n.mtimeMs
      };
    } catch (t) {
      if (fn(t)) {
        return null;
      }
      throw t;
    }
  }
  function TVf(e, t) {
    if (e.target !== t.target) {
      return true;
    }
    return !GJn() && e.mtimeMs !== t.mtimeMs;
  }
  function EVf(e) {
    if (Zd(e) && e.syscall === "listen" && (e.code === "EADDRINUSE" || e.code === "EACCES")) {
      logForDebugging(`bg manager start failed (listen): ${e.code} ${e.message}`, {
        level: "warn"
      });
      return;
    }
    Oe(e);
  }
  async function cQc(e) {
    let {
      jsonPath: t,
      logPath: n,
      origin: r,
      spawnedBy: o,
      signal: s,
      watch: i = $dr,
      createAuth: a = uuc,
      staleCheckIntervalMs: l = _Vf,
      idleGraceMs: c = lQc,
      startupIdleGraceMs: u = SVf
    } = e;
    let d = await ZXc(n);
    d.write("supervisor", `\u2500\u2500\u2500 daemon start \u2500\u2500\u2500 version=${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION} pid=${process.pid} origin=${r}`);
    initializeGrowthBook();
    let p = await lP();
    let m = false;
    if (p && p.origin === "transient" && r !== "transient") {
      m = true;
      d.write("supervisor", `transient daemon running (pid=${p.pid}, origin=transient) \u2014 asking it to yield to origin=${r}`);
      let Z = await CT({
        proto: 1,
        op: "yield"
      });
      if (Z.ok && Z.op === "yield" && Z.yielding) {
        let ne = Date.now() + 5000;
        while (p && Date.now() < ne) {
          await sleep(100);
          p = await lP();
        }
        if (logEvent("tengu_daemon_yield_takeover", {
          ok: !p,
          new_origin: r
        }), p) {
          d.write("supervisor", "yield acked but lock still held after 5s \u2014 refusing to start");
        }
      } else {
        d.write("supervisor", Z.ok ? "existing daemon refused to yield (it reports origin!=transient)" : `existing daemon unreachable on control socket (${B0(Z.error)}); not taking over`);
      }
    }
    if (p) {
      let Z = m ? `origin=${p.origin ?? "unknown"}; asked it to yield but the handover failed (see above)` : r === "transient" ? `origin=${p.origin ?? "unknown"}; an on-demand daemon never displaces a running one` : `origin=${p.origin ?? "unknown"}; only a transient daemon can be displaced`;
      let ne = Wt() === "windows" ? `Stop it with \`taskkill /PID ${p.pid}\`, then retry.` : "Run `claude daemon stop` to stop it, then retry.";
      if (d.write("supervisor", `another daemon is already running (pid=${p.pid}, version=${p.version}, ${Z}). ${ne}`), m) {
        Et("daemon_start", "daemon_start_yield_failed");
      } else {
        Pe("daemon_start");
      }
      await d.close();
      return {
        upgradeDetected: false,
        exitCode: 1
      };
    }
    let f = eH({
      pinToCurrentBinary: true
    });
    let h = GJn() ? Nqo() : f.prefixArgs[0] ?? f.cmd;
    let g = await aQc(h).catch(Z => {
      if (Zd(Z)) {
        logForDebugging(`binaryIdentity(${h}) failed at startup: ${Z.code}`, {
          level: "error"
        });
      } else {
        Oe(Z);
      }
      return null;
    });
    let y = {
      pid: process.pid,
      version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      jsonPath: t,
      logPath: n,
      startedAt: Date.now(),
      origin: r,
      spawnedBy: o,
      procStart: await getProcessStartTimeAsync(process.pid),
      launchTarget: g?.target
    };
    let _ = await AWl(y);
    if (!_) {
      let Z = await HZ();
      if (Z) {
        let oe = false;
        try {
          process.kill(Z.pid, 0);
          oe = (await Pqo(Z.pid)) && (await isSameProcessAsync(Z.pid, Z.procStart));
        } catch (ee) {
          if (en(ee) !== "ESRCH") {
            oe = true;
          }
        }
        if (oe) {
          d.write("supervisor", `another daemon won the lock race (pid=${Z.pid}) \u2014 exiting`);
          Pe("daemon_start");
          await d.close();
          return {
            upgradeDetected: false,
            exitCode: 1
          };
        }
        _ = await Dir(y);
      } else {
        _ = await Dir(y);
      }
      if (!_) {
        d.write("supervisor", "another daemon won the lock race \u2014 exiting");
        Pe("daemon_start");
        await d.close();
        return {
          upgradeDetected: false,
          exitCode: 1
        };
      }
      await sleep(100);
      let ne = await HZ().catch(() => y);
      if (!ne || ne.pid !== y.pid || ne.startedAt !== y.startedAt) {
        if (d.write("supervisor", `another daemon won the lock race (lock now ${ne ? `held by pid=${ne.pid}` : "gone"}) \u2014 exiting`), ne) {
          Pe("daemon_start");
        } else {
          Et("daemon_start", "lock_vanished_after_replace");
        }
        await d.close();
        return {
          upgradeDetected: false,
          exitCode: 1
        };
      }
    }
    let b = null;
    let S = a(s, Z => d.write("supervisor", Z), () => b?.hasOAuthConsumer() ?? false);
    let E = false;
    let C = false;
    let x = false;
    let A = false;
    let k = false;
    let I = false;
    let O = null;
    let M = () => {
      if (r !== "transient") {
        return false;
      }
      if (!A) {
        A = true;
        d.write("supervisor", "yielding to a foreground/service daemon \u2014 bg workers will be re-adopted");
        logEvent("tengu_daemon_yield", {});
        O?.();
      }
      return true;
    };
    let L = async () => {
      if (E || !g) {
        return E;
      }
      let Z;
      try {
        Z = await aQc(h);
      } catch (ne) {
        if (Zd(ne)) {
          logForDebugging(`binaryIdentity(${h}) poll failed: ${ne.code}`, {
            level: "error"
          });
        } else {
          Oe(ne);
        }
        return false;
      }
      if (s.aborted || x) {
        return false;
      }
      if (Z !== null && !TVf(g, Z)) {
        return false;
      }
      if (E = true, Z === null) {
        d.write("supervisor", `binary at ${h} was deleted (was ${g.target}) \u2014 exiting for upgrade`);
      } else {
        let ne = g.target === Z.target ? "mtime changed" : `${g.target} \u2192 ${Z.target}`;
        d.write("supervisor", `binary at ${h} changed (${ne}) \u2014 self-restarting for upgrade`);
      }
      O?.();
      return true;
    };
    let P = {
      manager: null
    };
    let F = null;
    let H = false;
    let U = false;
    let N = () => (P.manager?.leaseCount() ?? 0) + (P.manager?.liveHandleCount() ?? 0);
    let W = () => {
      if (r !== "transient") {
        return;
      }
      if (H || E || C || A || k || s.aborted) {
        return;
      }
      if (N() > 0) {
        if (U = true, F) {
          clearTimeout(F);
          F = null;
        }
        return;
      }
      if (F) {
        return;
      }
      let Z = U ? c : u;
      F = setTimeout(() => {
        if (F = null, N() > 0) {
          U = true;
          return;
        }
        if (s.aborted || E) {
          return;
        }
        H = true;
        let ne = b?.workerCount() ?? 0;
        d.write("supervisor", `idle ${Math.round(Z / 1000)}s with no clients \u2014 exiting` + (ne > 0 ? ` (stopping ${ne} configured workers)` : ""));
        logEvent("tengu_daemon_idle_exit", {
          grace_ms: Z,
          never_had_client: !U,
          cfg_workers: ne
        });
        O?.();
      }, Z);
    };
    S.ready.then(() => YXc(Z => d.write("bg", Z), {
      getAuthSnapshot: r === "service" ? () => S.getAuthSnapshot() : undefined,
      onNudge: L,
      onShutdown: () => {
        C = true;
        d.write("supervisor", "shutdown requested via control socket");
        O?.();
      },
      onYield: M,
      onKeepAliveChange: W,
      isShuttingDown: () => s.aborted || A || C || H || E || x || I
    })).then(Z => {
      if (s.aborted || A || C || H || E || x || I) {
        if (x) {
          Z.killAll("SIGTERM");
        }
        return void Z.close({
          skipPathCleanup: true
        }).catch(oe => Oe(Gvt(oe)));
      }
      P.manager = Z;
      W();
    }).catch(Z => {
      if (EVf(Gvt(Z)), s.aborted || A || C || H || E || x || I) {
        return;
      }
      let ne = en(Z);
      let oe = `${ne ? `[${ne}] ` : ""}${B0(sr(Z).message.replace(/\s*\n\s*/g, " "))}`;
      if (r === "service") {
        d.write("supervisor", `bg manager failed to start: ${oe} \u2014 control pipe unavailable; bg sessions disabled (registry workers keep running)`);
        IWl(y).catch(Oe);
        return;
      }
      d.write("supervisor", `bg manager failed to start: ${oe} \u2014 control pipe unavailable; exiting`);
      process.stderr.write(`bg manager failed to start: ${oe}
`);
      k = true;
      O?.();
    });
    b = await sQc({
      jsonPath: t,
      invocation: f,
      logger: d,
      authManager: S,
      watch: i
    });
    let j = b.workerCount();
    if (d.write("supervisor", `workers=${j}`), j > 0) {
      d.write("supervisor", "daemon.json has configured workers but they do not pin the supervisor \u2014 they stop when the last client lease and bg job are gone");
    }
    logEvent("tengu_daemon_start", {
      worker_kinds: Object.keys(WORKER_KINDS).length,
      worker_count: j,
      origin: r
    });
    Pe("daemon_start");
    W();
    let z = null;
    try {
      await new Promise(Z => {
        if (O = Z, s.aborted || E || H || C || A || k) {
          return void Z();
        }
        if (s.addEventListener("abort", () => Z(), {
          once: true
        }), !g) {
          d.write("supervisor", `binary identity unresolvable at ${h}; upgrade polling disabled`);
        }
        z = setInterval(() => {
          if (s.aborted || E || x || A) {
            if (z) {
              clearInterval(z);
              z = null;
            }
            return;
          }
          if (L(), r === "service" && isDaemonServiceRecalled()) {
            x = true;
            d.write("supervisor", "service recall flag set \u2014 draining workers and uninstalling service");
            O?.();
          }
          if (r === "transient" && !A) {
            HZ().then(ne => {
              if (ne && ne.pid !== y.pid && !A && !s.aborted) {
                I = true;
                A = true;
                d.write("supervisor", `lockfile now held by pid=${ne.pid} \u2014 displaced, yielding`);
                logEvent("tengu_daemon_yield", {
                  displaced: true,
                  displaced_by_pid: ne.pid
                });
                O?.();
              }
            }).catch(() => {});
          }
        }, l);
      });
    } finally {
      if (O = null, z) {
        clearInterval(z);
        z = null;
      }
      if (F) {
        clearTimeout(F);
        F = null;
      }
    }
    if (E) {
      logEvent("tengu_daemon_self_restart_on_upgrade", {});
    }
    if (x) {
      logEvent("tengu_copper_lantern", {});
    }
    let V = E ? "upgrade" : x ? "service_recall" : I ? "displaced" : A ? "yield" : C ? "shutdown_op" : H ? "idle_exit" : k ? "bg_manager_failed" : s.aborted ? "signal" : "unknown";
    let K = Date.now() - y.startedAt;
    if (d.write("supervisor", `shutting down (cause=${V}, uptime=${Math.round(K / 1000)}s, leases=${P.manager?.leaseCount() ?? -1}, live_workers=${P.manager?.liveHandleCount() ?? -1})`), logEvent("tengu_daemon_exit", {
      cause: V,
      uptime_ms: K,
      lease_count: P.manager?.leaseCount() ?? -1,
      live_handles: P.manager?.liveHandleCount() ?? -1,
      ever_had_keep_alive: U,
      origin: r
    }), b.disposeWatcher(), await b.drainReloads(), !I && r === "transient") {
      let Z = await HZ().catch(() => null);
      I = Z !== null && Z.pid !== y.pid;
    }
    let J = false;
    let Q = async () => {
      if (J) {
        return;
      }
      J = true;
      let Z = await HZ();
      if (Z && Z.pid === y.pid && Z.startedAt === y.startedAt) {
        await PWl();
      }
    };
    if (A) {
      await P.manager?.close({
        displaced: I
      });
      P.manager = null;
    }
    if (H || x || A || k) {
      if (await Q(), x) {
        if (P.manager?.killAll("SIGTERM"), !P.manager) {
          let Z = await j3({
            silent: true
          }).catch(() => null);
          for (let ne of Object.values(Z?.workers ?? {})) {
            if (ne.pid > 0) {
              await z5o(ne.pid, ne.procStart).catch(() => false);
            }
          }
        }
      }
    }
    if (await Promise.all([P.manager?.close({
      displaced: I
    }), b.stop()]), await Q(), x) {
      await qvt();
    }
    await d.close();
    S.dispose();
    return {
      upgradeDetected: E,
      exitCode: k ? 1 : 0
    };
  }
  var nTr;
  var SVf;
  var uQc = __lazy(() => {
    uT();
    ln();
    $n();
    Ot();
    je();
    dt();
    Tb();
    Rn();
    Cs();
    Sve();
    P8o();
    Mfe();
    aJe();
    JXc();
    uP();
    pL();
    bCt();
    hYe();
    Ptn();
    jZ();
    eQc();
    iQc();
    yUe();
    Itn();
    nTr = require("fs/promises");
    SVf = 45000 + 5000;
  });
  var xis = {};
  __export(xis, {
    parseKindArgs: () => parseKindArgs,
    handleListAllKinds: () => handleListAllKinds,
    handleCliKind: () => handleCliKind
  });
  function Bee(e) {
    process.stdout.write(e + `
`);
  }
  function vVf(e) {
    process.stderr.write(e + `
`);
  }
  function yD(e) {
    vVf(e);
    process.exit(1);
  }
  function parseKindArgs(e, t) {
    let n;
    let r = new Map();
    let o = false;
    let s = -1;
    for (let c = 0; c < t.length; c++) {
      let u = t[c];
      if (!u.startsWith("-")) {
        s = c;
        break;
      }
      if (u !== "--json" && u.startsWith("--") && !u.includes("=")) {
        c++;
      }
    }
    let i = s === -1 ? undefined : t[s];
    let a;
    if (i === undefined || i === "list") {
      a = "list";
    } else if (i === "add" || i === "remove") {
      a = i;
    } else {
      yD(`unknown action '${i}' \u2014 expected: claude daemon ${e} <add|remove|list>`);
    }
    let l = s === -1 ? t : [...t.slice(0, s), ...t.slice(s + 1)];
    for (let c = 0; c < l.length; c++) {
      let u = l[c];
      if (u === "--json") {
        o = true;
      } else if (u.startsWith("--")) {
        let d = u.indexOf("=");
        let p = d !== -1 ? u.slice(2, d) : u.slice(2);
        if (p === "add" || p === "remove") {
          yD(`'${u}' is no longer supported \u2014 use: claude daemon ${e} <add|remove|list>`);
        }
        r.set(p, d !== -1 ? u.slice(d + 1) : l[++c] ?? "");
      } else if (a === "remove" && n === undefined) {
        n = u;
      } else {
        yD(`unknown option '${u}' \u2014 expected: claude daemon ${e} <add|remove|list>`);
      }
    }
    return {
      action: a,
      removeTarget: n,
      flags: r,
      json: o
    };
  }
  async function rTr() {
    if (!(await WZ())) {
      yD("daemon service is not installed (service install is disabled in this version; the daemon runs on demand)");
    }
  }
  async function Cis(e) {
    let t = await vJe(e);
    if (!t.ok) {
      yD(t.error);
    }
    return t.config;
  }
  async function wVf(e) {
    let t = await Cis(e);
    let n = [];
    let r = t.remoteControl ?? [];
    for (let s of r) {
      n.push({
        kind: "remote-control",
        dir: s.dir,
        name: s.name ?? tae.basename(s.dir),
        spawnMode: s.spawnMode ?? "same-dir"
      });
    }
    let o = await GCt(e);
    for (let s of o) {
      n.push({
        kind: "scheduled",
        id: s.id,
        dir: s.directory,
        enabled: s.enabled,
        cron: s.cron
      });
    }
    return n;
  }
  function Ris(e) {
    if (e.length === 0) {
      Bee("(no entries)");
      return;
    }
    let t = ["kind", "name/id", "dir", "extra"];
    let n = e.map(s => [s.kind, s.id ?? s.name ?? "", s.dir, s.kind === "scheduled" ? `${s.cron ?? ""}${s.enabled === false ? " (disabled)" : ""}` : s.kind === "remote-control" ? s.spawnMode ?? "" : ""]);
    let r = t.map((s, i) => Math.max(s.length, ...n.map(a => a[i].length)));
    let o = s => s.map((i, a) => i.padEnd(r[a])).join("  ");
    Bee(o(t));
    Bee(r.map(s => "-".repeat(s)).join("  "));
    for (let s of n) {
      Bee(o(s));
    }
  }
  async function CVf(e, t) {
    if (e.action === "list") {
      let b = await GCt(t);
      if (e.json) {
        Bee(De(b, null, 2));
        return;
      }
      let S = b.map(E => ({
        kind: "scheduled",
        id: E.id,
        dir: E.directory,
        enabled: E.enabled,
        cron: E.cron
      }));
      Ris(S);
      return;
    }
    if (e.action === "remove") {
      if (!e.removeTarget) {
        yD("usage: claude daemon scheduled remove <task-id>");
      }
      if (await rTr(), !(await Etn(e.removeTarget, t))) {
        yD(`No scheduled task with id "${e.removeTarget}"`);
      }
      Bee(`removed ${e.removeTarget}`);
      return;
    }
    if (await rTr(), e.flags.vZc("id") && !e.flags.get("id")) {
      yD("--id requires a non-empty value");
    }
    if (e.flags.vZc("model") && !e.flags.get("model")) {
      yD("--model requires a non-empty value");
    }
    function n(b) {
      return WCt.includes(b);
    }
    if (e.flags.vZc("permission-mode") && !n(e.flags.get("permission-mode") ?? "")) {
      yD(`--permission-mode must be one of ${WCt.join(", ")}`);
    }
    let r = e.flags.get("prompt");
    let o = e.flags.get("id");
    let s = e.flags.get("dir");
    let i = tae.resolve(s ?? Nt());
    if (!o && !r) {
      yD("--prompt is required (or pass --id to update an existing task)");
    }
    let a = o ?? RVf(i, r);
    let c = (await GCt(t)).find(b => b.id === a);
    let u = r ?? c?.prompt;
    let d = e.flags.get("cron") ?? c?.cron;
    if (!u) {
      yD("--prompt is required");
    }
    if (!d) {
      yD("--cron is required");
    }
    let p = Ddt(d);
    if (p.error !== undefined) {
      yD(`invalid --cron '${d}': ${p.error}`);
    }
    let m = p.cron;
    let f = s ? tae.resolve(s) : c?.directory ?? tae.resolve(Nt());
    let h = e.flags.get("permission-mode") ?? c?.permissionMode ?? "dontAsk";
    let g = e.flags.get("model") ?? c?.model ?? undefined;
    let {
      isPathTrusted: y
    } = await Promise.resolve().then(() => (Jn(), bz));
    if (!y(f)) {
      yD(`${f} is not a trusted directory \u2014 run \`claude\` there once and accept the trust dialog.`);
    }
    let _ = {
      ...(c && {
        enabled: c.enabled,
        runTimeoutMinutes: c.runTimeoutMinutes,
        maxQueued: c.maxQueued
      }),
      id: a,
      cron: m,
      prompt: u,
      directory: f,
      permissionMode: h,
      ...(g && {
        model: g
      })
    };
    if (await Ttn(_, t), c) {
      Bee(`updated scheduled task '${a}'`);
    } else {
      Bee(`added scheduled task '${a}'`);
    }
  }
  function RVf(e, t) {
    let n = i => i.toLowerCase().replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "").slice(0, 40);
    let r = n(tae.basename(e));
    let o = n(t.split(/\s+/).slice(0, 4).join(" "));
    return [r, o].filter(Boolean).join("-") || "task";
  }
  async function xVf(e, t) {
    if (e.action === "list") {
      let l = (await Cis(t)).remoteControl ?? [];
      if (e.json) {
        Bee(De(l, null, 2));
        return;
      }
      Ris(l.map(c => ({
        kind: "remote-control",
        dir: c.dir,
        name: c.name ?? tae.basename(c.dir),
        spawnMode: c.spawnMode ?? "same-dir"
      })));
      return;
    }
    if (e.action === "remove") {
      if (!e.removeTarget) {
        yD("usage: claude daemon remote-control remove <name-or-dir>");
      }
      await rTr();
      let a = await kVf(e.removeTarget, t);
      await Udr(a, t);
      Bee(`removed ${a}`);
      return;
    }
    await rTr();
    let n = await YE(tae.resolve(e.flags.get("dir") ?? Nt()));
    let {
      isPathTrusted: r
    } = await Promise.resolve().then(() => (Jn(), bz));
    if (!r(n)) {
      yD(`${n} is not a trusted directory \u2014 run \`claude\` there once and accept the trust dialog.`);
    }
    let o = e.flags.get("name");
    let s = e.flags.get("spawn-mode");
    if (s !== undefined && s !== "same-dir" && s !== "worktree") {
      yD(`--spawn-mode must be same-dir or worktree, got '${s}'`);
    }
    let i = await Fdr({
      dir: n,
      name: o,
      spawnMode: s
    }, t);
    Bee(`${i} remote-control server for ${n}`);
  }
  async function kVf(e, t) {
    let r = (await Cis(t)).remoteControl ?? [];
    let o = r.filter(a => (a.name ?? tae.basename(a.dir)) === e);
    if (o.length === 1) {
      return o[0].dir;
    }
    if (o.length > 1) {
      yD(`ambiguous: multiple remote-control servers match name '${e}'. Use a dir instead.`);
    }
    let s = await YE(tae.resolve(e));
    let i = [];
    for (let a of r) {
      if ((await YE(a.dir)) === s) {
        i.push(a);
      }
    }
    if (i.length >= 1) {
      return i[0].dir;
    }
    yD(`no remote-control server matched '${e}'`);
  }
  async function handleListAllKinds(e, t = S5()) {
    let n = await wVf(t);
    if (e) {
      Bee(De(n, null, 2));
      return;
    }
    Ris(n);
  }
  async function handleCliKind(e, t, n = S5()) {
    let r = parseKindArgs(e, t);
    if (e === "scheduled") {
      return CVf(r, n);
    }
    return xVf(r, n);
  }
  var tae;
  var kis = __lazy(() => {
    vX();
    vo();
    ZS();
    Ptn();
    hUe();
    yUe();
    Bdr();
    vtn();
    tae = require("path");
  });
  var _Qc = {};