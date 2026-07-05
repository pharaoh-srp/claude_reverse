  __export(T9e, {
    resolveLoopFileFire: () => resolveLoopFileFire,
    resolveLoopDefaultFire: () => resolveLoopDefaultFire,
    resolveAutonomousLoopFire: () => resolveAutonomousLoopFire,
    resetAutonomousLoopDelivered: () => resetAutonomousLoopDelivered,
    readLoopFile: () => readLoopFile,
    logAutonomousLoopActivation: () => logAutonomousLoopActivation,
    isLoopPersistentPreambleEnabled: () => isLoopPersistentPreambleEnabled,
    isLoopFileSentinel: () => isLoopFileSentinel,
    isLoopDefaultSentinel: () => isLoopDefaultSentinel,
    isLoopDefaultPromptEnabled: () => isLoopDefaultPromptEnabled,
    isAutonomousLoopSentinel: () => isAutonomousLoopSentinel,
    getAutonomousLoopPreamble: () => getAutonomousLoopPreamble,
    LOOP_FILE_SENTINEL: () => "<<loop.md>>",
    LOOP_FILE_DYNAMIC_SENTINEL: () => "<<loop.md-dynamic>>",
    Hco: () => Hco
  });
  function isLoopPersistentPreambleEnabled() {
    if (st(process.env.CLAUDE_CODE_LOOP_PERSISTENT)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_loop_persistent", false);
  }
  function getAutonomousLoopPreamble() {
    return isLoopPersistentPreambleEnabled() ? Oda : Hco;
  }
  function logAutonomousLoopActivation() {
    logEvent("tengu_kairos_loop_persistent_activated", {
      variant: isLoopPersistentPreambleEnabled()
    });
  }
  function H3t(e = false) {
    if (!ZOe()) {
      return "";
    }
    let n = !e && isLoopPersistentPreambleEnabled() ? "newly blocked on a decision you won't make alone, you're ending the loop" : "newly blocked on a decision you won't make alone, third straight tick with nothing to do, you're ending the loop";
    return `

Use ${"PushNotification"} when the loop can't move further without the user, or when something landed that they'd want to act on now: ${n}, or a major update arrived (CI went red, a review changes the plan). Progress you made yourself isn't a trigger \u2014 the transcript covers that. One ping per state, not per tick.`;
  }
  function Hda() {
    return `# Autonomous loop tick

Run the autonomous check using the loop instructions established earlier in this conversation. If you cannot find them, treat this as a no-op tick. The recurring cron will fire the next tick automatically \u2014 do not call ${"ScheduleWakeup"} from this tick.${H3t()}`;
  }
  function mgp() {
    return `# Autonomous loop tick (dynamic pacing)

Run the autonomous check using the loop instructions established earlier in this conversation. If you cannot find them, treat this as a no-op tick.

You scheduled this tick via the ${"ScheduleWakeup"} tool (not a recurring cron). To keep the loop alive, call ${"ScheduleWakeup"} again at the end of this turn with \`prompt\` set to the literal sentinel \`${"<<autonomous-loop-dynamic>>"}\` \u2014 otherwise the loop ends after this tick.${Kco}${H3t()}`;
  }
  function isLoopDefaultPromptEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_loop_prompt", false);
  }
  function isAutonomousLoopSentinel(e) {
    return e === "<<autonomous-loop>>" || e === "<<autonomous-loop-dynamic>>";
  }
  function resolveAutonomousLoopFire(e) {
    if (!isAutonomousLoopSentinel(e)) {
      return null;
    }
    if (!isLoopDefaultPromptEnabled()) {
      return null;
    }
    logAutonomousLoopActivation();
    let t = e === "<<autonomous-loop-dynamic>>" ? mgp() : Hda();
    if ($3t || Udt !== null) {
      return t;
    }
    $3t = true;
    return `${getAutonomousLoopPreamble()}

---

${t}`;
  }
  function fgp() {
    return `# /loop tick \u2014 loop.md tasks

Work the tasks from the loop.md contents established earlier in this conversation. If you cannot find them, treat this as a no-op tick. The recurring cron will fire the next tick automatically \u2014 do not call ${"ScheduleWakeup"} from this tick.${H3t(true)}`;
  }
  function hgp() {
    return `# /loop tick \u2014 loop.md tasks (dynamic pacing)

Work the tasks from the loop.md contents established earlier in this conversation. If you cannot find them, treat this as a no-op tick.

You scheduled this tick via the ${"ScheduleWakeup"} tool (not a recurring cron). To keep the loop alive, call ${"ScheduleWakeup"} again at the end of this turn with \`prompt\` set to the literal sentinel \`${"<<loop.md-dynamic>>"}\` \u2014 otherwise the loop ends after this tick.${Kco}${H3t(true)}`;
  }
  function ggp() {
    return `# /loop tick \u2014 loop.md absent (dynamic pacing)

loop.md is not currently present. Run the autonomous check using the loop instructions established earlier in this conversation.

You scheduled this tick via the ${"ScheduleWakeup"} tool (not a recurring cron). To keep the loop alive \u2014 and to pick up loop.md if it is recreated \u2014 call ${"ScheduleWakeup"} again at the end of this turn with \`prompt\` set to the literal sentinel \`${"<<loop.md-dynamic>>"}\` \u2014 otherwise the loop ends after this tick.${Kco}${H3t()}`;
  }
  function ygp(e) {
    if (e.length <= 25000) {
      return e;
    }
    let t = e.lastIndexOf(`
`, 25000);
    return `${e.slice(0, t > 0 ? t : 25000)}

> WARNING: loop.md was truncated to ${25000} bytes. Keep the task list concise.`;
  }
  function readLoopFile() {
    let e = [Gco.join(getProjectRoot(), ".claude", "loop.md"), Gco.join(er(), "loop.md")];
    for (let t of e) {
      let n;
      try {
        n = $da.readFileSync(t, "utf-8");
      } catch (o) {
        if (Io(o) || en(o) === "EISDIR") {
          continue;
        }
        throw o;
      }
      let r = n.trim();
      if (r.length === 0) {
        continue;
      }
      return {
        path: t,
        content: ygp(r)
      };
    }
    return null;
  }
  function isLoopFileSentinel(e) {
    return e === "<<loop.md>>" || e === "<<loop.md-dynamic>>";
  }
  function resolveLoopFileFire(e) {
    if (!isLoopFileSentinel(e)) {
      return null;
    }
    if (!isLoopDefaultPromptEnabled()) {
      return null;
    }
    let t = e === "<<loop.md-dynamic>>";
    let n = readLoopFile();
    if (n) {
      let o = t ? hgp() : fgp();
      if (Udt === n.content) {
        return o;
      }
      Udt = n.content;
      return `# /loop tick \u2014 tasks from ${n.path}

The user configured a loop-tasks file. Work through the tasks defined below; these are the instructions for this tick and every subsequent tick (the reminder on later fires refers back to this message).

---

${n.content}

---

${o}`;
    }
    logAutonomousLoopActivation();
    let r = t ? ggp() : Hda();
    if (Udt === "__autonomous_preamble__" || $3t) {
      return r;
    }
    Udt = "__autonomous_preamble__";
    $3t = true;
    return `${getAutonomousLoopPreamble()}

---

${r}`;
  }
  function isLoopDefaultSentinel(e) {
    return isAutonomousLoopSentinel(e) || isLoopFileSentinel(e);
  }
  function resolveLoopDefaultFire(e) {
    return resolveAutonomousLoopFire(e) ?? resolveLoopFileFire(e) ?? e;
  }
  function resetAutonomousLoopDelivered() {
    $3t = false;
    Udt = null;
  }
  var $da;
  var Gco;
  var Kco;
  var $3t = false;
  var Udt = null;
  function Bdt(e, t) {
    logEvent("tengu_loop_ended", {
      reason: e,
      ...t
    });
  }
  function pTe() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_loop_dynamic", false);
  }
  function W3t() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_loop_noop_fold", false);
  }
  function Cgp() {
    if (getIsNonInteractiveSession()) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_fold_tool", false);
  }
  function Vda() {
    let e = new Set();
    if (W3t()) {
      e.add("scheduled_task_fire");
    }
    if (Cgp()) {
      e.add("fold_boundary");
    }
    return e.size > 0 ? e : null;
  }
  function zda() {
    if (st(process.env.CLAUDE_CODE_LOOP_KEEPALIVE)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_loop_keepalive", false);
  }
  function Kda(e, t, n) {
    return Jda(e, t, {
      viaKeepalive: false,
      reason: n
    });
  }
  function Yda(e) {
    if (!pTe()) {
      Bdt("gate_off");
      return null;
    }
    if (getLoopConsecutiveKeepalives() >= 1) {
      logForDebugging("[loop] keepalive budget exhausted (model declined to reschedule twice) \u2014 ending loop");
      Bdt("model_stopped", {
        via_keepalive: true
      });
      return null;
    }
    return Jda(1200, e, {
      viaKeepalive: true
    });
  }
  function Jda(e, t, n) {
    let {
      viaKeepalive: r,
      reason: o
    } = n;
    if (!r) {
      setLoopConsecutiveKeepalives(0);
    }
    let s = Agp();
    let i = Date.now();
    let a = getLoopChainStartedAt(t);
    let l = a !== undefined && i > a.lastScheduledFor + 3600 * 1000;
    let c = a === undefined || l ? i : a.startedAt;
    let u = getCronJitterConfig().recurringMaxAgeMs;
    if (u > 0 && i - c >= u) {
      if (!a?.agedOut) {
        setLoopChainStartedAt(t, {
          startedAt: c,
          lastScheduledFor: i - (3600 - 60) * 1000,
          agedOut: true
        });
        logEvent("tengu_loop_dynamic_wakeup_aged_out", {
          loop_age_ms: i - c,
          max_age_ms: u
        });
        Bdt("aged_out", {
          via_keepalive: r
        });
        Et("loop_schedule_wakeup", "loop_wakeup_aged_out");
      }
      return null;
    }
    let {
      clamped: d,
      wasClamped: p,
      targetMs: m,
      createdAt: f,
      target: h
    } = Rgp(e);
    let g = `${h.getMinutes()} ${h.getHours()} * * *`;
    if (addSessionCronTask({
      id: kgp(),
      cron: g,
      prompt: t,
      createdAt: f,
      kind: "loop"
    }), setLoopChainStartedAt(t, {
      startedAt: c,
      lastScheduledFor: m
    }), setScheduledTasksEnabled(true), r) {
      setLoopConsecutiveKeepalives(getLoopConsecutiveKeepalives() + 1);
      logForDebugging(`[loop] keepalive armed (model did not reschedule): ${d}s fallback`);
      logEvent("tengu_loop_keepalive_fired", {
        clamped_delay_seconds: d,
        prompt_is_sentinel: Egp.isLoopDefaultSentinel(t)
      });
      Et("loop_schedule_wakeup", "model_no_reschedule");
      return {
        scheduledFor: m,
        clampedDelaySeconds: d,
        wasClamped: p
      };
    }
    logForDebugging(`[loop] dynamic wakeup scheduled: ${d}s${p ? ` (clamped from ${e}s)` : ""}${o !== undefined ? ` \u2014 ${o}` : ""}`);
    logEvent("tengu_loop_dynamic_wakeup_scheduled", {
      chosen_delay_seconds: Number.isFinite(e) ? e : 0,
      clamped_delay_seconds: d,
      was_clamped: p,
      reason_length: o?.length ?? 0,
      superseded_count: s
    });
    Pe("loop_schedule_wakeup");
    return {
      scheduledFor: m,
      clampedDelaySeconds: d,
      wasClamped: p
    };
  }
  function Rgp(e) {
    let t;
    if (Number.isNaN(e)) {
      t = 60;
    } else if (e === 1 / 0) {
      t = 3600;
    } else if (e === -1 / 0) {
      t = 60;
    } else {
      t = Math.round(e);
    }
    let n = Math.max(60, Math.min(3600, t));
    let r = !Number.isFinite(e) || t !== n;
    let o = Date.now();
    let s = o + n * 1000;
    let i = xgp(s);
    let a = getCronJitterConfig().cacheLeadMs;
    if (a > 0 && n * 1000 <= 300000) {
      let u = 300000 - a;
      while (i - o > u && i - 60000 >= o + 60 * 1000) {
        i -= 60000;
      }
    }
    let l = new Date(i);
    let c = s < i ? s : i - 1;
    return {
      clamped: n,
      wasClamped: r,
      targetMs: i,
      createdAt: c,
      target: l
    };
  }
  function xgp(e) {
    let t = new Date(e);
    if (t.getSeconds() > 0 || t.getMilliseconds() > 0) {
      t.setMinutes(t.getMinutes() + 1);
    }
    t.setSeconds(0, 0);
    return t.getTime();
  }
  function kgp() {
    return Math.floor(Math.random() * 4294967295).toString(16).padStart(8, "0");
  }
  function Agp() {
    let e = getSessionCronTasks().filter(t => t.kind === "loop").map(t => t.id);
    if (e.length === 0) {
      return 0;
    }
    return removeSessionCronTasks(e);
  }
  function tDe() {
    return getSessionCronTasks().some(e => e.kind === "loop");
  }
  function M2n() {
    let e = getSessionCronTasks().filter(n => n.kind === "loop");
    let t = getLoopTickInFlightPrompt();
    if (setLoopTickInFlightPrompt(null), setLoopConsecutiveKeepalives(0), e.length === 0 && t === null) {
      return 0;
    }
    removeSessionCronTasks(e.map(n => n.id));
    for (let n of e) {
      deleteLoopChainStartedAt(n.prompt);
    }
    if (t !== null) {
      deleteLoopChainStartedAt(t);
    }
    logForDebugging(`[loop/dynamic] cancelled ${e.length} pending loop wakeup(s) on user abort${t !== null ? " (tick in flight)" : ""}`);
    Bdt("user_abort", {
      loops_cancelled: e.length
    });
    Pe("loop_cancel_all");
    return e.length;
  }
  var Egp;
  var bde = __lazy(() => {
    at();
    ln();
    $n();
    Ot();
    U3t();
    vV();
    je();
    gn();
    Egp = (E9e(), __toCommonJS(T9e));
  });
  function Qco(e) {
    if (!e.startsWith("auto:")) {
      return null;
    }
    let t = e.slice(5);
    let n = parseInt(t, 10);
    if (isNaN(n)) {
      logForDebugging(`Invalid ENABLE_TOOL_SEARCH value "${e}": expected auto:N where N is a number.`);
      return null;
    }
    return Math.max(0, Math.min(100, n));
  }
  function Igp(e) {
    if (!e) {
      return false;
    }
    return e === "auto" || e.startsWith("auto:");
  }
  function G3t() {
    if (d4e()) {
      return "standard";
    }
    let e = process.env.ENABLE_TOOL_SEARCH;
    let t = e ? Qco(e) : null;
    if (t === 0) {
      return "tst";
    }
    if (t === 100) {
      return "standard";
    }
    if (Igp(e)) {
      return "tst-auto";
    }
    if (st(e)) {
      return "tst";
    }
    if (Pl(process.env.ENABLE_TOOL_SEARCH)) {
      return "standard";
    }
    return "tst";
  }
  function Ogp() {
    try {
      let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_tool_search_unsupported_models", null);
      if (Array.isArray(e)) {
        return e;
      }
    } catch {}
    return Pgp;
  }
  function Mgp(e) {
    if (e === null || Array.isArray(e) || typeof e !== "object") {
      return e;
    }
    let t = e;
    let n = getMainLoopModelOverride();
    let r = n !== undefined ? n : getInitialMainLoopModel();
    if (typeof r === "string") {
      let o = r.toLowerCase();
      for (let s of Object.keys(t)) {
        if (s !== "*" && s.length > 0 && o.includes(s.toLowerCase())) {
          return t[s];
        }
      }
    }
    return t["*"];
  }
  function Xda() {
    let e = new Set();
    try {
      let t = Mgp(getFeatureValue_CACHED_MAY_BE_STALE("tengu_non_deferrable_builtins", null));
      if (Array.isArray(t)) {
        for (let n of t) {
          if (typeof n === "string") {
            e.add(n);
          }
        }
      }
    } catch {}
    try {
      let t = getCachedClientData()?.non_deferrable_builtins;
      if (Array.isArray(t)) {
        for (let n of t) {
          if (typeof n === "string") {
            e.add(n);
          }
        }
      }
    } catch {}
    if (e.size === 0) {
      return Dgp;
    }
    return [...e];
  }
  function CX(e) {
    let t = e.toLowerCase();
    let n = Ogp();
    for (let r of n) {
      if (t.includes(r.toLowerCase())) {
        return false;
      }
    }
    return true;
  }
  function P1() {
    let e = G3t();
    if (e === "standard") {
      if (!nDe) {
        nDe = true;
        logForDebugging(`[ToolSearch:optimistic] mode=${e}, ENABLE_TOOL_SEARCH=${process.env.ENABLE_TOOL_SEARCH}, result=false`);
      }
      return false;
    }
    if (!process.env.ENABLE_TOOL_SEARCH && getAPIProvider() === "firstParty" && !isFirstPartyAnthropicBaseUrl()) {
      if (!nDe) {
        nDe = true;
        logForDebugging(`[ToolSearch:optimistic] disabled: ANTHROPIC_BASE_URL=${process.env.ANTHROPIC_BASE_URL} is not a first-party Anthropic host. Set ENABLE_TOOL_SEARCH=true (or auto / auto:N) if your proxy forwards tool_reference blocks.`);
      }
      return false;
    }
    if (!process.env.ENABLE_TOOL_SEARCH && getAPIProvider() === "vertex") {
      if (!nDe) {
        nDe = true;
        logForDebugging("[ToolSearch:optimistic] disabled: Vertex AI does not accept the tool-search beta header. Set ENABLE_TOOL_SEARCH=true to override.");
      }
      return false;
    }
    if (!nDe) {
      nDe = true;
      logForDebugging(`[ToolSearch:optimistic] mode=${e}, ENABLE_TOOL_SEARCH=${process.env.ENABLE_TOOL_SEARCH}, result=true`);
    }
    return true;
  }
  var Pgp;
  var Dgp;
  var nDe = false;
  var RX = __lazy(() => {
    at();
    $n();
    DC();
    je();
    gn();
    Ds();
    Pgp = ["claude-3-5-haiku", "claude-3-haiku"];
    Dgp = [];
  });
  var epa;
  var Zco;
  var tpa = `
Reserve this for decisions where the user's answer changes what you do next \u2014 not for choices with a conventional default or facts you can verify in the codebase yourself. In those cases pick the obvious option, mention it in your response, and proceed.
`;
  var cU = __lazy(() => {
    epa = {
      markdown: `
Preview feature:
Use the optional \`preview\` field on options when presenting concrete artifacts that users need to visually compare:
- ASCII mockups of UI layouts or components
- Code snippets showing different implementations
- Diagram variations
- Configuration examples

Preview content is rendered as markdown in a monospace box. Multi-line text with newlines is supported. When any option has a preview, the UI switches to a side-by-side layout with a vertical option list on the left and preview on the right. Do not use previews for simple preference questions where labels and descriptions suffice. Note: previews are only supported for single-select questions (not multiSelect).
`,
      html: `
Preview feature:
Use the optional \`preview\` field on options when presenting concrete artifacts that users need to visually compare:
- HTML mockups of UI layouts or components
- Formatted code snippets showing different implementations
- Visual comparisons or diagrams

Preview content must be a self-contained HTML fragment (no <html>/<body> wrapper, no <script> or <style> tags \u2014 use inline style attributes instead). Do not use previews for simple preference questions where labels and descriptions suffice. Note: previews are only supported for single-select questions (not multiSelect).
`
    };
    Zco = `Use this tool only when you are blocked on a decision that is genuinely the user's to make: one you cannot resolve from the request, the code, or sensible defaults.

Usage notes:
- Users will always be able to select "Other" to provide custom text input
- Use multiSelect: true to allow multiple answers to be selected for a question
- If you recommend a specific option, make that the first option in the list and add "(Recommended)" at the end of the label

Plan mode note: To switch into plan mode, use ${"EnterPlanMode"} (not this tool). Once in plan mode, use this tool to clarify requirements or choose between approaches BEFORE finalizing your plan. Do NOT use this tool to ask "Is my plan ready?", "Should I proceed?", or otherwise reference "the plan" in questions \u2014 the user cannot see the plan until you call ${"ExitPlanMode"} for approval.
`;
  });
  function euo() {
    let e = new Date();
    let t = e.getFullYear();
    let n = String(e.getMonth() + 1).padStart(2, "0");
    let r = String(e.getDate()).padStart(2, "0");
    return `${t}-${n}-${r}`;
  }
  function npa() {
    return new Date().toLocaleString("en-US", {
      month: "long",
      year: "numeric"
    });
  }
  var fTe;
  var v9e = __lazy(() => {
    fTe = TEr(euo);
  });
  function rpa(e) {
    let t = npa();
    if (_g(e)) {
      return `Search the web. Returns result blocks with titles and URLs. US-only.

- The current month is ${t} \u2014 use this when searching for recent information.
- \`allowed_domains\` / \`blocked_domains\` filter results.
- After answering from results, end with a "Sources:" list of the URLs you used as markdown links.`;
    }
    return `
- Allows Claude to search the web and use the results to inform responses
- Provides up-to-date information for current events and recent data
- Returns search result information formatted as search result blocks, including links as markdown hyperlinks
- Use this tool for accessing information beyond Claude's knowledge cutoff
- Searches are performed automatically within a single API call

CRITICAL REQUIREMENT - You MUST follow this:
  - After answering the user's question, you MUST include a "Sources:" section at the end of your response
  - In the Sources section, list all relevant URLs from the search results as markdown hyperlinks: [Title](URL)
  - This is MANDATORY - never skip including sources in your response
  - Example format:

    [Your answer here]

    Sources:
    - [Source Title 1](https://example.com/1)
    - [Source Title 2](https://example.com/2)

Usage notes:
  - Domain filtering is supported to include or block specific websites
  - Web search is only available in the US

IMPORTANT - Use the correct year in search queries:
  - The current month is ${t}. You MUST use this year when searching for recent information, documentation, or current events.
  - Example: If the user asks for "latest React docs", search for "React documentation" with the current year, NOT last year
`;
  }
  var Hdt = __lazy(() => {
    v9e();
    AI();
  });
  function tuo(e) {
    if (_g(e)) {
      return `Content search built on ripgrep. Prefer this over \`grep\`/\`rg\` via ${"Bash"} \u2014 results integrate with the permission UI and file links.

- Full regex syntax (e.g. "log.*Error", "function\\s+\\w+"). Ripgrep, not grep \u2014 escape literal braces (\`interface\\{\\}\`).
- Filter with \`glob\` (e.g. "**/*.tsx") or \`type\` (e.g. "js", "py", "rust").
- \`output_mode\`: "content" (matching lines), "files_with_matches" (paths only, default), or "count".
- \`multiline: true\` for patterns that span lines.`;
    }
    return `A powerful search tool built on ripgrep

  Usage:
  - ALWAYS use ${"Grep"} for search tasks. NEVER invoke \`grep\` or \`rg\` as a ${"Bash"} command. The ${"Grep"} tool has been optimized for correct permissions and access.
  - Supports full regex syntax (e.g., "log.*Error", "function\\s+\\w+")
  - Filter files with glob parameter (e.g., "*.js", "**/*.tsx") or type parameter (e.g., "js", "py", "rust")
  - Output modes: "content" shows matching lines, "files_with_matches" shows only file paths (default), "count" shows match counts
  - Use ${"Agent"} tool for open-ended searches requiring multiple rounds
  - Pattern syntax: Uses ripgrep (not grep) - literal braces need escaping (use \`interface\\{\\}\` to find \`interface{}\` in Go code)
  - Multiline matching: By default patterns match within single lines only. For cross-line patterns like \`struct \\{[\\s\\S]*?field\`, use \`multiline: true\`
`;
  }
  var _x = __lazy(() => {
    AI();
    Sh();
  });
  function uU() {
    let e = process.env.CLAUDE_CODE_USE_POWERSHELL_TOOL;
    if (Wt() !== "windows") {
      return st(e);
    }
    if (Pl(e)) {
      return false;
    }
    if (st(e)) {
      return true;
    }
    if (Cye() === null) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_ridge", false);
  }
  function Pu() {
    if (Wt() !== "windows") {
      return true;
    }
    return Cye() !== null;
  }
  function w9e() {
    return Pu() ? "bash" : "powershell";
  }
  var Nq;
  var Jf = __lazy(() => {
    $n();
    gn();
    Cs();
    wj();
    Nq = ["Bash", "PowerShell"];
  });
  function opa(e) {
    return "skill__" + e.replaceAll(":", "__").replace(/[^a-zA-Z0-9_-]/g, "_");
  }
  function apa(e) {
    return e.isNonInteractiveSession || e.isBgSession === true;
  }
  function N2n(e, t) {
    if (e?.type !== "tool_use" || e.name !== "StructuredOutput") {
      return null;
    }
    if (e.id !== undefined && t.vZc(e.id)) {
      return null;
    }
    let n = e.input;
    let r = n !== null && typeof n === "object" && "text" in n ? n.text : undefined;
    return typeof r === "string" && r.length > 0 ? r : null;
  }
  function jdt(e) {
    let t = spa.get(e);
    if (t) {
      return t;
    }
    let n = Fgp(e);
    spa.set(e, n);
    return n;
  }
  function Fgp(e) {
    try {
      let t = new ipa.Ajv({
        allErrors: true
      });
      if (!t.validateSchema(e)) {
        return {
          error: t.errorsText(t.errors)
        };
      }
      let r = t.compile(e);
      return {
        tool: {
          ...nuo,
          inputJSONSchema: e,
          async call(o) {
            if (!r(o)) {
              let i = r.errors?.map(l => `${l.instancePath || "root"}: ${l.message}`).join(", ");
              let a = r.errors?.map(l => l.keyword).join(",");
              throw new Po(`Output does not match required schema: ${i}`, `StructuredOutput schema mismatch: ${a ?? ""}`);
            }
            return {
              data: "Structured output provided successfully",
              structured_output: o,
              endsTurn: true
            };
          }
        }
      };
    } catch (t) {
      return {
        error: t instanceof Error ? t.message : String(t)
      };
    }
  }
  var ipa;
  var Ngp;
  var Lgp;
  var nuo;
  var spa;
  var O1 = __lazy(() => {
    ci();
    dt();
    ipa = __toESM(Vmn(), 1);
    Ngp = we(() => v.object({}).passthrough());
    Lgp = we(() => v.string().describe("Structured output tool result"));
    nuo = Xs({
      isMcp: false,
      isEnabled() {
        return true;
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      isOpenWorld() {
        return false;
      },
      name: "StructuredOutput",
      searchHint: "return the final response as structured JSON",
      maxResultSizeChars: 1e5,
      async description() {
        return "Return structured output in the requested format";
      },
      async prompt() {
        return "Use this tool to return your final response in the requested structured format. You MUST call this tool exactly once at the end of your response to provide the structured output.";
      },
      get inputSchema() {
        return Ngp();
      },
      get outputSchema() {
        return Lgp();
      },
      async call(e) {
        return {
          data: "Structured output provided successfully",
          structured_output: e,
          endsTurn: true
        };
      },
      async checkPermissions(e) {
        return {
          behavior: "allow",
          updatedInput: e
        };
      },
      renderToolUseMessage(e) {
        let t = Object.keys(e);
        if (t.length === 0) {
          return null;
        }
        if (t.length <= 3) {
          return t.map(n => `${n}: ${De(e[n])}`).join(", ");
        }
        return `${t.length} fields: ${t.slice(0, 3).join(", ")}\u2026`;
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: e
        };
      }
    });
    spa = new WeakMap();
  });
  function lpa() {
    return process.env.CLAUDE_REPL_VARIANT;
  }
  function z3t(e, t) {
    return (e ?? {})[t ?? "main"] !== undefined;
  }
  function zk() {
    if (!X4()) {
      return false;
    }
    if (Pl(process.env.CLAUDE_CODE_REPL)) {
      return false;
    }
    if (st(process.env.CLAUDE_CODE_REPL)) {
      return true;
    }
    let e = process.env.CLAUDE_CODE_ENTRYPOINT;
    if (e === "cli" || e === "remote") {
      return getFeatureValue_CACHED_MAY_BE_STALE("tengu_slate_harbor", false);
    }
    return false;
  }
  var qdt;
  var ZC = __lazy(() => {
    $n();
    gn();
    Tm();
    Fk();
    _x();
    qdt = new Set(["Read", "Glob", "Grep", "Bash", "PowerShell", "NotebookEdit"]);
  });
  var upa = {};
  __export(upa, {
    isKairosCronEnabled: () => isKairosCronEnabled,
    isDurableCronEnabled: () => isDurableCronEnabled,
    buildDurableParamDescription: () => buildDurableParamDescription,
    buildCronListPrompt: () => buildCronListPrompt,
    buildCronDeletePrompt: () => buildCronDeletePrompt,
    buildCronCreatePrompt: () => buildCronCreatePrompt,
    buildCronCreateDescription: () => buildCronCreateDescription,
    DEFAULT_MAX_AGE_DAYS: () => DEFAULT_MAX_AGE_DAYS,
    CRON_LIST_TOOL_NAME: () => "CronList",
    CRON_LIST_DESCRIPTION: () => "List scheduled cron jobs",
    CRON_DELETE_TOOL_NAME: () => "CronDelete",
    CRON_DELETE_DESCRIPTION: () => "Cancel a scheduled cron job by ID",
    CRON_CREATE_TOOL_NAME: () => "CronCreate"
  });
  function isKairosCronEnabled() {
    return !st(process.env.CLAUDE_CODE_DISABLE_CRON) && getFeatureValue_CACHED_WITH_REFRESH("tengu_kairos_cron", true, 300000);
  }
  function isDurableCronEnabled() {
    return getFeatureValue_CACHED_WITH_REFRESH("tengu_kairos_cron_durable", true, 300000);
  }
  function buildCronCreateDescription(e) {
    return e ? "Schedule a prompt to run at a future time \u2014 either recurring on a cron schedule, or once at a specific time. Pass durable: true to persist to .claude/scheduled_tasks.json; otherwise session-only." : "Schedule a prompt to run at a future time within this Claude session \u2014 either recurring on a cron schedule, or once at a specific time.";
  }
  function buildDurableParamDescription(e) {
    return e ? "true = persist to .claude/scheduled_tasks.json and survive restarts. false (default) = in-memory only, dies when this Claude session ends. Use true only when the user asks the task to survive across sessions." : "Has no effect \u2014 durable persistence is not available. All jobs are session-only (in-memory, gone when this Claude session ends).";
  }
  function buildCronCreatePrompt(e) {
    let t = e ? `## Durability

By default (durable: false) the job lives only in this Claude session \u2014 nothing is written to disk, and the job is gone when Claude exits. Pass durable: true to write to .claude/scheduled_tasks.json so the job survives restarts. Only use durable: true when the user explicitly asks for the task to persist ("keep doing this every day", "set this up permanently"). Most "remind me in 5 minutes" / "check back in an hour" requests should stay session-only.` : `## Session-only

Jobs live only in this Claude session \u2014 nothing is written to disk, and the job is gone when Claude exits.`;
    let n = e ? "Durable jobs persist to .claude/scheduled_tasks.json and survive session restarts \u2014 on next launch they resume automatically. One-shot durable tasks that were missed while the REPL was closed are surfaced for catch-up. Session-only jobs die with the process. " : "";
    return `Schedule a prompt to be enqueued at a future time. Use for both recurring schedules and one-shot reminders.

Uses standard 5-field cron in the user's local timezone: minute hour day-of-month month day-of-week. "0 9 * * *" means 9am local \u2014 no timezone conversion needed.

## One-shot tasks (recurring: false)

For "remind me at X" or "at <time>, do Y" requests \u2014 fire once then auto-delete.
Pin minute/hour/day-of-month/month to specific values:
  "remind me at 2:30pm today to check the deploy" \u2192 cron: "30 14 <today_dom> <today_month> *", recurring: false
  "tomorrow morning, run the smoke test" \u2192 cron: "57 8 <tomorrow_dom> <tomorrow_month> *", recurring: false

## Recurring jobs (recurring: true, the default)

For "every N minutes" / "every hour" / "weekdays at 9am" requests:
  "*/5 * * * *" (every 5 min), "0 * * * *" (hourly), "0 9 * * 1-5" (weekdays at 9am local)

## Avoid the :00 and :30 minute marks when the task allows it

Every user who asks for "9am" gets \`0 9\`, and every user who asks for "hourly" gets \`0 *\` \u2014 which means requests from across the planet land on the API at the same instant. When the user's request is approximate, pick a minute that is NOT 0 or 30:
  "every morning around 9" \u2192 "57 8 * * *" or "3 9 * * *" (not "0 9 * * *")
  "hourly" \u2192 "7 * * * *" (not "0 * * * *")
  "in an hour or so, remind me to..." \u2192 pick whatever minute you land on, don't round

Only use minute 0 or 30 when the user names that exact time and clearly means it ("at 9:00 sharp", "at half past", coordinating with a meeting). When in doubt, nudge a few minutes early or late \u2014 the user will not notice, and the fleet will.

${t}
${IG() ? `
## Not for live watching

${"CronCreate"} re-runs a prompt at fixed wall-clock intervals. To watch a log file, process, or command output and be notified the moment something changes, use the ${"Monitor"} tool instead \u2014 ${"Monitor"} streams events as they happen; cron polls on a schedule.
` : ""}
## Runtime behavior

Jobs only fire while the REPL is idle (not mid-query). ${n}The scheduler adds a small deterministic jitter on top of whatever you pick: recurring tasks fire up to 10% of their period late (max 15 min); one-shot tasks landing on :00 or :30 fire up to 90 s early. Picking an off-minute is still the bigger lever.

Recurring tasks auto-expire after ${DEFAULT_MAX_AGE_DAYS} days \u2014 they fire one final time, then are deleted. This bounds session lifetime. Tell the user about the ${DEFAULT_MAX_AGE_DAYS}-day limit when scheduling recurring jobs.

Returns a job ID you can pass to ${"CronDelete"}.`;
  }
  function buildCronDeletePrompt(e) {
    return e ? `Cancel a cron job previously scheduled with ${"CronCreate"}. Removes it from .claude/scheduled_tasks.json (durable jobs) or the in-memory session store (session-only jobs).` : `Cancel a cron job previously scheduled with ${"CronCreate"}. Removes it from the in-memory session store.`;
  }
  function buildCronListPrompt(e) {
    return e ? `List all cron jobs scheduled via ${"CronCreate"}, both durable (.claude/scheduled_tasks.json) and session-only.` : `List all cron jobs scheduled via ${"CronCreate"} in this session.`;
  }
  var DEFAULT_MAX_AGE_DAYS;
  var OG = __lazy(() => {
    $n();
    vV();
    gn();
    wX();
    DEFAULT_MAX_AGE_DAYS = EV.recurringMaxAgeMs / 86400000;
  });
  function uuo() {
    return ["Wait for MCP servers that are still connecting and whose tools are not", "yet in your tool list. Pass `servers` to wait for specific ones, or omit", "it to wait for all pending servers.", "", "If the user's request needs tools from a still-connecting server, call this", "tool to wait for it. Once it connects, its tools will be added to your tool", "list and you can use them directly. Returns ready=true when servers are", "ready, ready=false if they failed to connect, need authentication, or are", "disabled.", "", "You do not need to ask the user for confirmation to use this tool."].join(`
`);
  }
  function Ugp(e) {
    return new Set(["TaskOutput", "ExitPlanMode", "EnterPlanMode", "AskUserQuestion", "ConnectGitHub", "WaitForMcpServers", ...(e !== "ant" ? ["Workflow"] : []), "ScheduleWakeup"]);
  }
  function Bgp(e) {
    return new Set(["Read", "WebSearch", "TodoWrite", "Grep", "WebFetch", "Glob", ...Nq, "Edit", "Write", "NotebookEdit", "Skill", "StructuredOutput", "ToolSearch", "EnterWorktree", "ExitWorktree", "REPL", "Monitor", "TaskStop", "SendMessage", ...(e === "ant" ? ["Workflow"] : []), "Artifact"]);
  }
  var oDe;
  var duo;
  var Y3t;
  var dpa;
  var puo;
  var x9e = __lazy(() => {
    Sh();
    cU();
    wX();
    Tm();
    Hdt();
    _x();
    EX();
    Fk();
    Jf();
    Ay();
    mx();
    kX();
    O1();
    ZC();
    OG();
    ioe();
    t1();
    oDe = Ugp("external");
    duo = new Set([...oDe]);
    Y3t = Bgp("external");
    dpa = new Set(["TaskCreate", "TaskGet", "TaskList", "TaskUpdate", "SendMessage", "CronCreate", "CronDelete", "CronList"]);
    puo = new Set(["Agent", "TaskStop", "SendMessage", "StructuredOutput", "Workflow"]);
  });
  var U2n = {};