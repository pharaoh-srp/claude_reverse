  __export(YIo, {
    resetDetectionCache: () => resetDetectionCache,
    listUserTmuxSessions: () => listUserTmuxSessions,
    isTmuxAvailable: () => isTmuxAvailable,
    isIt2CliAvailable: () => isIt2CliAvailable,
    isInsideTmuxSync: () => isInsideTmuxSync,
    isInsideTmux: () => isInsideTmux,
    isInITerm2: () => isInITerm2,
    getUserTmuxSocket: () => getUserTmuxSocket,
    getLeaderPaneId: () => getLeaderPaneId,
    getIt2Command: () => getIt2Command,
    IT2_COMMAND: () => "it2"
  });
  function isInsideTmuxSync() {
    return !!bbt;
  }
  async function listUserTmuxSessions() {
    if (!bbt) {
      return;
    }
    let e = ii(bbt, ",");
    if (!e) {
      return;
    }
    let {
      code: t,
      stdout: n
    } = await execFileNoThrow("tmux", ["-S", e, "list-sessions", "-F", "#{session_name}"], {
      useCwd: false,
      timeout: 2000
    });
    if (t !== 0) {
      return;
    }
    return n.split(`
`).filter(Boolean);
  }
  async function isInsideTmux() {
    if (nKt !== null) {
      return nKt;
    }
    nKt = !!bbt;
    return nKt;
  }
  function getLeaderPaneId() {
    return Yfm || null;
  }
  function getUserTmuxSocket() {
    if (!bbt) {
      return null;
    }
    return ii(bbt, ",") || null;
  }
  async function isTmuxAvailable() {
    return (await execFileNoThrow("tmux", ["-V"])).code === 0;
  }
  function isInITerm2() {
    if (rKt !== null) {
      return rKt;
    }
    let e = process.env.TERM_PROGRAM;
    let t = !!process.env.ITERM_SESSION_ID;
    let n = Me.terminal === "iTerm.app";
    rKt = e === "iTerm.app" || t || n;
    return rKt;
  }
  function getIt2Command() {
    return "it2";
  }
  async function isIt2CliAvailable() {
    let e = Me.SHELL || "/bin/zsh";
    let t = await execFileNoThrow(e, ["-lc", `command -v ${"it2"}`], {
      useCwd: false,
      timeout: 2000
    });
    let n = t.code === 0 ? t.stdout.split(`
`).map(i => i.trim()).filter(Boolean).at(-1) ?? "" : "";
    let r = async i => execFileNoThrow(i, ["session", "list"]);
    let o = n || "it2";
    let s = await r(o);
    if (n && s.code !== 0 && (s.code === 127 || /ENOENT/i.test(s.error ?? ""))) {
      o = "it2";
      s = await r(o);
    }
    if (s.code !== 0) {
      logForDebugging(`[isIt2CliAvailable] '${o} session list' failed (code=${s.code}): ${s.stderr || s.error || "no stderr"}. ` + (n ? "it2 was found on PATH \u2014 check that the iTerm2 Python API is enabled " + "(Preferences > General > Magic > Enable Python API)." : "it2 was not found on PATH (including login-shell PATH)."));
      return false;
    }
    zIo = o;
    return true;
  }
  function resetDetectionCache() {
    nKt = null;
    rKt = null;
    zIo = "it2";
  }
  var bbt;
  var Yfm;
  var nKt = null;
  var rKt = null;
  function Dpl() {
    return JIo.join(er(), "cache", "team-discovery.json");
  }
  async function ehm() {
    try {
      let e = await Tbt.readFile(Dpl(), "utf-8");
      let t = qt(e);
      if (t && typeof t === "object" && "fetchedAt" in t && typeof t.fetchedAt === "number") {
        return t;
      }
    } catch (e) {
      if (!fn(e)) {
        logForDebugging(`team-discovery: cache read failed: ${he(e)}`);
      }
    }
    return null;
  }
  async function thm(e) {
    try {
      await Tbt.mkdir(JIo.join(er(), "cache"), {
        recursive: true
      });
      await Tbt.writeFile(Dpl(), De(e), "utf-8");
    } catch (t) {
      logForDebugging(`team-discovery: cache write failed: ${he(t)}`);
    }
  }
  async function nhm() {
    try {
      let e = await _s.get("/api/claude_code/discovery/team_usage", {
        auth: "async",
        timeout: 5000,
        validateStatus: t => t === 200 || t === 403
      });
      if (!e.ok) {
        logForDebugging(`team-discovery: skipped (${e.reason})`);
        return null;
      }
      if (e.status === 403) {
        return null;
      }
      if (e.data.skills.length === 0 && e.data.mcp_servers.length === 0) {
        return null;
      }
      return e.data;
    } catch (e) {
      logForDebugging(`team-discovery: fetch failed: ${he(e)}`);
      return null;
    }
  }
  function Npl() {
    rhm().then(e => {
      Mpl = e;
    }).catch(() => {});
  }
  function Lpl() {
    return Mpl;
  }
  var Tbt;
  var JIo;
  var Mpl;
  var rhm;
  var Fpl = __lazy(() => {
    no();
    je();
    gn();
    dt();
    nW();
    $n();
    bg();
    Kc();
    Tbt = require("fs/promises");
    JIo = require("path");
    rhm = vye(async () => {
      if (!isPolicyAllowed("allow_team_discovery")) {
        return;
      }
      if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_team_discovery", false)) {
        return;
      }
      if (!isClaudeAISubscriber()) {
        return;
      }
      let e = await ehm();
      if (e && Date.now() - e.fetchedAt < 86400000) {
        return e.data ?? undefined;
      }
      let t = await nhm();
      await thm({
        fetchedAt: Date.now(),
        data: t
      });
      return t ?? undefined;
    }, 3600000);
  });
  function Ebt(e, t) {
    let n = getGlobalConfig().numStartups;
    saveGlobalConfig(r => {
      let o = r.tipsHistory ?? {};
      if (o[e] === n) {
        return r;
      }
      let s = r.tipLifetimeShownCounts ?? {};
      let i = {
        ...r,
        tipsHistory: {
          ...o,
          [e]: n
        },
        tipLifetimeShownCounts: {
          ...s,
          [e]: (s[e] ?? 0) + 1
        }
      };
      if (!t) {
        return i;
      }
      let a = r.pluginSuggestionShownCounts ?? {};
      return {
        ...i,
        pluginSuggestionShownCounts: {
          ...a,
          [t]: (a[t] ?? 0) + 1
        }
      };
    });
  }
  function yJn(e) {
    return getGlobalConfig().tipLifetimeShownCounts?.[e] ?? 0;
  }
  function Rme(e) {
    let t = getGlobalConfig();
    let n = t.tipsHistory?.[e];
    if (!n) {
      return 1 / 0;
    }
    return t.numStartups - n;
  }
  function Upl(e) {
    return getGlobalConfig().pluginSuggestionShownCounts?.[e] ?? 0;
  }
  function Bpl(e) {
    return getGlobalConfig().pluginSuggestionDiscoverShownCounts?.[e] ?? 0;
  }
  function $pl(e) {
    if (e.length === 0) {
      return;
    }
    saveGlobalConfig(t => {
      let n = t.pluginSuggestionDiscoverShownCounts ?? {};
      if (e.every(o => (n[o] ?? 0) > 0)) {
        return t;
      }
      let r = {
        ...n
      };
      for (let o of e) {
        r[o] = (r[o] ?? 0) + 1;
      }
      return {
        ...t,
        pluginSuggestionDiscoverShownCounts: r
      };
    });
  }
  var vbt = __lazy(() => {});
  function K1e(e, ...t) {
    let n = new Set(t);
    return e.messages.some(r => r.type === "assistant" && Array.isArray(r.message.content) && r.message.content.some(o => o.type === "tool_use" && n.vZc(o.name)));
  }
  function QIo(e) {
    return K1e(e, "Edit", "Write", "NotebookEdit");
  }
  function ohm(e) {
    return e.messages.some(t => t.type === "user" && !t.isMeta && Array.isArray(t.message.content) && t.message.content.some(n => n.type === "image"));
  }
  function bJn(e) {
    return Bn(e.messages, MTe);
  }
  function jpl(e) {
    let t = e.findLast(i => i.type === "assistant");
    if (t?.type !== "assistant") {
      return {
        thinking: 0,
        output: 0
      };
    }
    let n = t.message.id;
    let r = 0;
    for (let i of e) {
      if (i.type !== "assistant" || i.message.id !== n) {
        continue;
      }
      for (let a of i.message.content) {
        if (a.type === "text") {
          r += a.text.length;
        } else if (a.type === "tool_use") {
          r += De(a.input).length;
        }
      }
    }
    let o = Math.round(r / 4);
    let s = t.message.usage?.output_tokens ?? 0;
    return {
      thinking: Math.max(0, s - o),
      output: o
    };
  }
  function qpl(e, t) {
    if (t.size === 0) {
      return 0;
    }
    let n = new Set();
    let r = 0;
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (!i) {
        continue;
      }
      if (MTe(i)) {
        if (++r >= 10) {
          break;
        }
      } else if (i.type === "assistant" && Array.isArray(i.message.content)) {
        for (let a of i.message.content) {
          if (a.type !== "tool_use") {
            continue;
          }
          if (!a.input || typeof a.input !== "object") {
            continue;
          }
          if (!("file_path" in a.input)) {
            continue;
          }
          let l = a.input.file_path;
          if (typeof l === "string") {
            n.add(Hpl.normalize(l));
          }
        }
      }
    }
    let o = 0;
    for (let [s, i] of t.entries()) {
      if (!n.vZc(s)) {
        o += i.contentLength ?? i.content.length;
      }
    }
    return Math.round(o / 4);
  }
  function Wpl(e) {
    let t;
    for (let n = e.length - 1; n >= 0; n--) {
      let r = e[n];
      if (r && MTe(r)) {
        if (t === undefined) {
          t = r.timestamp;
        } else {
          return (Date.parse(t) - Date.parse(r.timestamp)) / 60000;
        }
      }
    }
    return 0;
  }
  function Gpl(e, t) {
    return SJn.filter(n => !t.vZc(n.id) && (n.when?.(e) ?? true));
  }
  var Hpl;
  var SJn;
  var ZIo = __lazy(() => {
    Ox();
    uT();
    Sh();
    Ay();
    mx();
    OG();
    EX();
    N2();
    no();
    gn();
    S$();
    $n();
    Hpl = require("path");
    SJn = [{
      id: "mcp-discovery",
      situation: `User pastes data from external systems into the conversation \u2014 database output, API responses, Slack messages, error logs from monitoring tools, issue tracker content. They are manually bridging Claude and an external service. Also matches when Claude says it cannot access something ("I don't have access to your database/Slack/Jira") and the user has to provide the data manually. IMPORTANT: Do NOT match this when the user pastes code for review or refactoring \u2014 that is normal Claude Code usage.`,
      feature: "MCP connects Claude directly to databases, APIs, Slack, GitHub, Sentry, and other services.",
      action: "/mcp",
      when: e => e.mcpClients.length === 0
    }, {
      id: "mcp-expand",
      situation: 'User already has MCP servers configured (see mcpServers in session_metadata) but is manually pasting data from a source those servers do not cover. They know MCP exists \u2014 they may not know it covers this service too. The configured servers are an eligibility signal only \u2014 the tip must name the service the user is manually bridging (e.g. "the GitHub MCP would let you query issues directly"), never cite their existing unrelated servers as justification.',
      feature: "You can add more MCP servers for services your current ones do not cover.",
      action: "/mcp",
      when: e => e.mcpClients.length >= 1
    }, {
      id: "mcp-cli-login",
      situation: 'An MCP server that needs authentication is failing \u2014 Claude or the MCP status shows it as unauthenticated / needs login / token expired \u2014 and the user is working over SSH or otherwise cannot complete the browser OAuth flow from this terminal. They may have tried /mcp and hit "could not open browser", or mention they are on a remote box. IMPORTANT: Do NOT match MCP errors unrelated to auth (server not found, bad config), or when the user is on a local desktop where the /mcp browser flow works.',
      feature: "`claude mcp login <name>` authenticates an MCP server from the CLI \u2014 add --no-browser to paste the callback URL manually over SSH.",
      action: "claude mcp login <name> --no-browser",
      when: e => !isRunningInRemoteEnvironment() && e.mcpClients.length >= 1
    }, {
      id: "web-docs-paste",
      situation: "User pastes a chunk of API documentation, a README, or a Stack Overflow answer from the web. The pasted content looks like prose documentation, usage examples, or Q&A-style text rather than their own project code. IMPORTANT: Do NOT match when the user pastes their own source code, local files, or terminal output.",
      feature: "Claude can fetch pages directly \u2014 just share the URL.",
      action: "Paste the URL instead of the page contents",
      when: e => e.toolNames.vZc("WebFetch")
    }, {
      id: "exploration-without-planning",
      situation: 'User asks Claude to "plan" a change or explore before editing, or Claude has read 10+ files understanding the codebase with no edits yet \u2014 and the user is not in plan mode.',
      feature: "Plan Mode lets Claude explore and analyze freely in read-only mode, then presents a plan for approval.",
      action: "Shift+Tab (cycle to Plan Mode)",
      when: e => e.permissionMode !== "plan" && !e.hasUsedPlanMode
    }, {
      id: "permission-fatigue",
      situation: "Claude has run many similar bash commands (npm/bun test, lint, build, etc.). Many sequential tool calls suggest manual approval of each one.",
      feature: "Permission rules let you auto-approve commands matching patterns you trust. Auto mode uses AI to approve safe operations.",
      action: "/permissions or Shift+Tab to auto mode",
      when: e => e.permissionMode === "default" || e.permissionMode === "acceptEdits"
    }, {
      id: "permission-param-match",
      situation: 'User has denied (or chosen "ask every time" for) the same tool-call pattern more than once while approving other calls of the same tool \u2014 e.g., rejecting Agent whenever it requests a specific model, or Bash whenever it wants to run in the background. They are manually filtering on a parameter value each time the prompt appears. IMPORTANT: Do NOT match a single one-off denial, or blanket denial of a tool regardless of parameters.',
      feature: "Deny and ask rules can match a tool input parameter \u2014 e.g., deny Agent(model:opus) or ask Bash(run_in_background:true) \u2014 so that specific pattern is auto-handled without prompting each time.",
      action: "/permissions, then add a Tool(param:value) deny or ask rule",
      when: e => e.permissionMode === "default" || e.permissionMode === "acceptEdits"
    }, {
      id: "undo-changes",
      situation: 'User expresses regret about changes Claude made. "That broke things," "undo that," "go back to before," or asking Claude to revert manually.',
      feature: "Claude automatically checkpoints every edit. You can restore conversation, code, or both to any previous state.",
      action: "Press Esc twice or type /rewind",
      when: QIo
    }, {
      id: "diff-request",
      situation: 'User asks "what did you change?", "show me the diff", "which files did you touch?", or "summarize your edits" after Claude has made edits. They want a summary of changes without scrolling back through the transcript.',
      feature: "/diff shows all uncommitted changes and per-turn diffs at a glance.",
      action: "/diff",
      when: e => K1e(e, "Edit", "Write", "NotebookEdit")
    }, {
      id: "correction-spiral",
      situation: 'User has corrected Claude multiple times in the current exchange. "No not like that," reverts, restarts, going back and forth without converging.',
      feature: "Starting fresh with a focused prompt is usually faster than correcting mid-stream when the conversation has gone off track.",
      action: "/clear",
      when: QIo
    }, {
      id: "image-description-friction",
      situation: 'User describes a visual problem in prose \u2014 "the button is misaligned", "the spacing looks off", "colors are wrong on dark mode", "this layout is broken" \u2014 without attaching an image. They are describing what something looks like rather than showing it, forcing Claude to guess at the actual appearance.',
      feature: "Claude reads images directly. A screenshot is worth a paragraph of description.",
      action: "Drag an image into the terminal or Ctrl+V to paste a screenshot",
      when: e => !ohm(e)
    }, {
      id: "long-running-wait",
      situation: "A test suite, build, or deployment just ran and took a long time. Bash command followed by extensive output, suggesting the user had to wait.",
      feature: "Long-running commands can be backgrounded so you can keep working while they run.",
      action: "Ctrl+B (next time a long command starts)",
      when: e => !e.hasUsedBackgroundTask && K1e(e, "Bash", "PowerShell")
    }, {
      id: "context-filling-up",
      situation: "The transcript is very long (many turns). Claude has read many files. The user mentions Claude forgetting something from earlier. turnCount in session metadata is high.",
      feature: "Compact keeps what matters and frees context. Clear starts completely fresh. Subagents can investigate without consuming main context.",
      action: "/compact or /clear",
      when: e => bJn(e) > 15
    }, {
      id: "code-review-before-ship",
      situation: `User is wrapping up a coding task after Claude made substantial edits. They mention committing, pushing, creating a PR, "looks good let's ship", "I think we're done", or ask Claude to commit the changes. The implementation work is finished and they are about to finalize.`,
      feature: "/code-review runs three review agents on your changes \u2014 reuse, quality, efficiency \u2014 and fixes what they find before you commit.",
      action: "/code-review",
      when: e => !e.hasUsedCodeReview && QIo(e)
    }, {
      id: "manual-polling",
      situation: 'User has asked Claude to check the same status multiple times across recent turns \u2014 "is the deploy done?", "check CI again", "any update on the build?", "check once more". They are manually polling. Also matches when the user says "keep checking until X" or "check every few minutes" and Claude ran the check just once \u2014 Claude cannot poll on its own without /loop. IMPORTANT: Do NOT match a single status check, or checks Claude runs as part of a larger task it is driving (e.g., running tests while implementing a feature).',
      feature: "/loop runs any prompt or slash command on a recurring schedule \u2014 set it once and Claude keeps checking.",
      action: "/loop 5m <check>",
      when: () => !isRunningInRemoteEnvironment() && isKairosCronEnabled()
    }, {
      id: "goal-iterate-until",
      situation: `User says "keep going until X", "don't stop until X", "continue until X", or "loop until X" \u2014 they want Claude to persist toward a stated end-state. Also matches when the user has typed "continue" or "keep going" two or more times in the current exchange to nudge Claude past where it stopped. The distinguishing signal is iteration toward a *condition*, not polling a status (that is manual-polling).`,
      feature: "/goal sets an objective \u2014 Claude checks it after every response and keeps working until it's met.",
      action: "/goal <condition>",
      when: e => !e.hasActiveGoal && !e.areAllHooksDisabled
    }, {
      id: "remote-scheduling",
      situation: 'User describes wanting a task to run on a recurring schedule even when they are not at their machine \u2014 "every morning email me a summary", "check CI every day at 9am and open a PR if X", "overnight while I sleep", "run this weekly", "while I am away". The distinguishing signal is the task should keep running without keeping Claude open locally. IMPORTANT: Do NOT match when the user wants a recurring check only during this session (/loop handles that), or a single one-off reminder.',
      feature: "/schedule creates cloud agents that run on a cron schedule \u2014 they keep running after you close the terminal, can open PRs, and can reach connected services.",
      action: "/schedule",
      when: e => !st(process.env.CLAUDE_CODE_REMOTE) && e.remoteSessionsAllowed && isClaudeAISubscriber() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_surreal_dali", false)
    }, {
      id: "hooks-automation",
      situation: 'User asks Claude to "always run lint after editing", "before committing always do X", "every time you edit a test, also run it" \u2014 automation patterns phrased as standing instructions. The user is teaching Claude a rule to follow on every matching tool event rather than asking for a one-off action.',
      feature: "Hooks run commands automatically on tool events \u2014 no need to remind Claude each time.",
      action: "/hooks",
      when: e => !e.hasConfiguredHooks
    }, {
      id: "config-key-value",
      situation: "User opens the /config panel (or asks how to change a setting) for a panel setting \u2014 model, theme, verbose, thinking, output style, editor, or similar \u2014 and navigates the menu to flip one toggle. They are using the interactive panel for something the inline syntax does in one line. IMPORTANT: Do NOT match edits to hooks, permissions, env, statusLine, or other structured settings.json keys \u2014 those are not /config key=value keys.",
      feature: "/config key=value sets panel settings (model, theme, verbose, output style, \u2026) inline \u2014 no need to open the panel.",
      action: "/config <key>=<value>"
    }, {
      id: "repeated-workflow",
      situation: "User has done the same multi-step task pattern more than once \u2014 deploy sequence, review checklist, test procedure, or other workflow described from scratch.",
      feature: "Custom skills turn repeatable workflows into slash commands. Write once, invoke with /name.",
      action: 'Ask Claude: "turn this workflow into a reusable skill"',
      when: e => !K1e(e, "Skill")
    }, {
      id: "outside-working-dir",
      situation: "Claude says a file or path is outside the working directory or not accessible, and the user has to work around it \u2014 pasting file contents manually, copying the file into cwd, or asking Claude to use cat via Bash instead of Read.",
      feature: "You can grant Claude access to additional directories without changing your current working directory.",
      action: "/add-dir <path>"
    }, {
      id: "parallel-investigation",
      situation: 'User asks Claude to investigate something broad ("find all places where we handle auth", "trace the data flow"). The request would require reading many files and the main conversation already has substantial context.',
      feature: "Subagents run in isolated context, keeping the main conversation clean.",
      action: 'Ask Claude to "use a subagent to investigate this"',
      when: e => e.toolNames.vZc("Agent")
    }, {
      id: "previous-session-reference",
      situation: `User mentions work from a previous session. "I was working on X yesterday" or "we discussed this before." Also matches when Claude says "I don't have context from our earlier conversation."`,
      feature: "Resume previous conversations with full context. Name sessions for easy retrieval.",
      action: "claude --continue or claude --resume",
      when: e => bJn(e) < 5
    }, {
      id: "at-mention-paths",
      situation: 'User has typed the same file path by hand in multiple turns (e.g. "src/components/foo/bar.tsx" appearing in two or more User messages), or Claude asked "which file do you mean" / "can you specify the path" and the user typed it out. The user is typing paths manually instead of using autocomplete. Do NOT match when paths already have an @ prefix \u2014 that means they are already using the feature.',
      feature: "Type @ in the prompt to fuzzy-search and autocomplete file paths \u2014 faster than typing and avoids typos.",
      action: "@ then start typing the filename"
    }, {
      id: "ide-copy-paste",
      situation: 'User mentions "in my editor", "in VS Code", "let me paste from my IDE", or pastes what looks like an editor selection with line numbers. They are manually bridging their editor and Claude.',
      feature: "The IDE extension shares your editor's context (open files, cursor, selection) automatically.",
      action: "/ide",
      when: e => !e.mcpClients.some(t => t.name === "ide")
    }, {
      id: "verbose-preference",
      situation: 'User has asked Claude to adjust its verbosity more than once \u2014 "be more concise", "shorter please", "too verbose", "less detail", or the opposite ("more detail", "explain more", "be thorough"). They keep restating a tone preference rather than getting it by default.',
      feature: "Output styles change Claude's default verbosity and tone persistently \u2014 set it once instead of repeating the request.",
      action: "/config (set output style)",
      when: e => !e.hasSetOutputStyle
    }, {
      id: "queue-while-working",
      situation: `After a long assistant turn with many tool calls, the user's next message is a correction or addition that did not depend on the final result \u2014 "actually, also do X", "wait, I meant Y", "oh and run Z too", "no, use the other file". They waited for Claude to finish before sending something they could have sent mid-turn. IMPORTANT: Do NOT match when the user's message clearly reacts to the final output (e.g. "that looks good" or a question about the result) \u2014 that is normal turn-taking.`,
      feature: "You can hit Enter while Claude is working to queue a follow-up or steer it mid-turn \u2014 no need to wait for it to finish.",
      action: "Hit Enter while Claude is working",
      when: e => e.promptQueueUseCount <= 3
    }, {
      id: "persistent-memory",
      situation: 'User restates a fact or preference about their project or setup that they have told Claude before \u2014 "as I mentioned", "like I said", "remember I use X", "I keep telling you" \u2014 or explicitly asks Claude to remember something for future sessions. They are trying to establish persistent context via conversation. IMPORTANT: Do NOT match tone/verbosity preferences (that is verbose-preference), per-tool-event rules (that is hooks-automation), or wanting to resume prior-session work (that is previous-session-reference).',
      feature: "# shortcut or /memory saves facts and preferences to CLAUDE.md so Claude remembers them across sessions.",
      action: "Type # to add a memory, or /memory to view and manage",
      when: e => !e.hasUserMemoryFile
    }, {
      id: "worktree-parallel-branches",
      situation: "User mentions switching branches to work on something else, stashing to change context, juggling multiple features at once, or wanting to run another Claude session on a different branch of the same repo. The friction is sequential branch-switching in one checkout.",
      feature: "Git worktrees give you multiple working directories from one repo \u2014 run a Claude session per branch without stashing or switching.",
      action: "git worktree add ../myrepo-feature <branch>",
      when: e => e.worktreeCount === 1
    }, {
      id: "push-notif-stepping-away",
      situation: `User says they will step away, check back later, or asks to be told when something finishes \u2014 "I'll check back in a bit", "ping me when done", "let me know when it's ready", "going to lunch, keep going" \u2014 after kicking off work that will take a while.`,
      feature: "Push notifications send a phone alert when long tasks finish, so you do not have to keep the terminal in view.",
      action: "Enable push notifications in /config",
      when: e => e.pushNotifEligible
    }, {
      id: "statusline-discovery",
      situation: `User asks about ambient session state that would normally be visible at a glance \u2014 current model, context window usage, total cost so far, working directory, git branch \u2014 and the answer appears in the assistant's prose. Also matches when the user repeatedly asks the same status-style question across turns ("which model is this again?", "how much have we spent?", "what branch am I on?").`,
      feature: "A custom status line displays model, cost, context %, cwd, git branch, and more beneath the input box \u2014 no need to ask.",
      action: "/statusline",
      when: e => !e.hasConfiguredStatusLine && !e.areAllHooksDisabled
    }, {
      id: "high-effort-low-yield",
      situation: "The most recent assistant response was short and direct \u2014 a brief answer, a small lookup, or a one-line confirmation \u2014 yet it was preceded by an extensive thinking block. The user is paying for deep reasoning on a question that did not need it.",
      feature: "Lower effort levels skip the heavy reasoning pass for routine turns and use far fewer tokens.",
      action: "/effort medium",
      when: e => e.subscriptionType === "pro" && (e.effort === "high" || e.effort === "xhigh" || e.effort === "max") && e.lastTurnOutputTokens > 0 && e.lastTurnOutputTokens < 500 && e.lastTurnThinkingTokens > 3 * e.lastTurnOutputTokens
    }, {
      id: "opus-on-pro-near-limit",
      situation: "The user is on a Pro plan, running Opus, and has burned through more than half of their usage window. They may not realize Opus consumes their limit roughly twice as fast as Sonnet for most tasks.",
      feature: "Sonnet 4.6 handles most coding tasks and uses your weekly limit roughly half as fast as Opus.",
      action: "/model",
      when: e => getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_heron", false) && e.subscriptionType === "pro" && e.model.toLowerCase().includes("opus") && (e.pctLimitUsed ?? 0) > 0.5
    }, {
      id: "large-context-stale-files",
      situation: "The conversation context has grown very large \u2014 hundreds of thousands of tokens \u2014 and much of it is files and tool output from earlier in the session that the current work no longer references.",
      feature: "/compact summarizes the older context so each turn stops re-sending stale files.",
      action: "/compact",
      when: e => getFeatureValue_CACHED_MAY_BE_STALE("tengu_slate_moth", false) && e.contextTokens > 300000 && e.staleFileTokens > 1e5
    }, {
      id: "pro-compact-threshold",
      situation: "The user is on a Pro plan, the conversation has grown past 200K tokens, and they have not configured a custom auto-compact window \u2014 they are running on the model default (typically the full context window or 1M). Each turn is re-sending more context than most coding sessions need.",
      feature: "Setting a 200K auto-compact window keeps sessions trimmed automatically \u2014 Claude summarizes earlier so each turn stays cheaper without manual /compact.",
      action: 'Set "autoCompactWindow": 200000 in settings.json',
      when: e => e.subscriptionType === "pro" && e.contextTokens > 200000 && e.autoCompactWindow === undefined
    }, {
      id: "side-question-during-work",
      situation: 'User asked an off-topic question mid-task \u2014 message starts with "btw", "quick question", "unrelated:", "side note:", or "real quick:". The transcript shows: many tool calls, then the tangential question, then Claude answered it. This IS friction even though Claude answered correctly \u2014 the side question consumed main-thread context and interrupted the task. Match this pattern; do not treat it as productive flow.',
      feature: "/btw asks a side question without interrupting the current work. Claude answers in a separate context and returns to what it was doing.",
      action: "/btw <question>",
      when: e => e.numStartups >= 50 && e.btwUseCount === 0
    }, {
      id: "background-agents-list",
      situation: `User mentions juggling many Claude sessions in parallel \u2014 "I have a bunch of tabs open", "running several of these at once", "lost track of which one", "this one can keep going while I do X", or says they will step away and check back on this session later. Also match when the user asks "which session was working on X?", "was this the tab where we did PR #N?", "where did we fix the Y bug?" \u2014 they are trying to recall what a session was about by asking inside it, which means they have lost the overview across sessions. The friction is overseeing many sessions, not coordinating between two of them (that is cross-session-coordination). Also match when the user kicks off long autonomous work and says "I'll come back to this" \u2014 they are treating the session as fire-and-forget.`,
      feature: "/bg detaches this session to run in the background, and `claude agents` shows every backgrounded session in one table with a status color \u2014 glance to see which ones need you, space to reply, enter to attach.",
      action: "/bg this session, then run `claude agents` in a new terminal",
      when: e => isAgentsFleetEnabled() && e.numStartups >= 50
    }, {
      id: "tmux-claude-agents",
      situation: "User is running Claude Code inside tmux with multiple tmux sessions active. They mention tmux panes/windows, switching between sessions, splitting work across terminals, or managing parallel workstreams by hand.",
      feature: "`claude agents` gives you one dashboard for background Claude sessions \u2014 launch, see status at a glance, and attach without juggling tmux panes yourself.",
      action: "run `claude agents` in a fresh terminal",
      when: e => isAgentsFleetEnabled() && (e.tmuxSessionCount ?? 0) > 1
    }, {
      id: "too-many-subagents",
      situation: 'Multiple subagents or background work are running and the user wants them stopped \u2014 "kill those", "stop the agents", confusion about what is still running.',
      feature: "Ctrl+X Ctrl+K stops all running agents and background work at once.",
      action: "Ctrl+X Ctrl+K",
      when: e => e.numStartups >= 50 && K1e(e, "Agent")
    }, {
      id: "workflow-orchestration",
      situation: "Claude spawned several subagents (multiple Agent tool calls) for a structured multi-stage task \u2014 fan-out research then verify each finding, parallel analysis across dimensions, or iterative spawning until a condition is met. The user is manually chaining subagents through individual requests when the orchestration has clear control flow. Do NOT match when only one or two subagents were used for simple delegation \u2014 that is normal Agent tool usage.",
      feature: "Dynamic workflows let Claude write a script that orchestrates many agents for you. Mention the keyword ultracode or ask Claude to use a workflow directly.",
      action: 'Add ultracode to your next big request, or say "use a workflow for this"',
      when: e => dT() && e.numStartups >= 50 && K1e(e, "Agent") && !K1e(e, "Workflow")
    }, {
      id: "workflow-size-control",
      situation: "A workflow ran this session (Workflow tool used) and it was large \u2014 many agents, long runtime, or heavy token use \u2014 or the user commented on a workflow's size, cost, speed, or token consumption. Do NOT match if no workflow ran this session, or if the workflow was small and the user expressed no concern.",
      feature: "You can control how big a workflow is just by prompting \u2014 ask for a small workflow or cap the number of agents.",
      action: 'Try "use a small workflow, 5 agents max"',
      when: e => dT() && K1e(e, "Workflow")
    }];
  });
  async function Ypl(e, t) {
    let n = () => {
      e.catch(() => {});
    };
    if (t.aborted) {
      throw n(), new _f();
    }
    let r = () => {};
    try {
      return await Promise.race([e, new Promise((o, s) => {
        r = () => s(new _f());
        t.addEventListener("abort", r, {
          once: true
        });
      })]);
    } catch (o) {
      throw n(), o;
    } finally {
      t.removeEventListener("abort", r);
    }
  }
  function TJn(e, t) {
    let n = e.find(r => r.type === "tool_use" && r.name === t);
    if (!n || n.type !== "tool_use") {
      return null;
    }
    return n;
  }
  function EJn(e, t) {
    let n = t.safeParse(e.input);
    if (!n.success) {
      return null;
    }
    return n.data;
  }
  var wbt = __lazy(() => {
    CN();
  });
  function ahm(e) {
    let t = e.find(r => r.type === "user" && !r.isMeta);
    if (!t) {
      return "";
    }
    let n = t.message.content;
    if (typeof n === "string") {
      return n;
    }
    if (Array.isArray(n)) {
      let r = n.find(o => o.type === "text");
      if (r && r.type === "text") {
        return r.text;
      }
    }
    return "";
  }
  function ePo(e, t) {
    let r = [4, 7, 20].map(i => e[i] || "0").join("");
    let o = `${"59cf53e54c78"}${r}${t}`;
    return Jpl.createHash("sha256").update(o).digest("hex").slice(0, 3);
  }
  function Xpl(e) {
    let t = ahm(e);
    return ePo(t, {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION);
  }
  var Jpl;
  var tPo = __lazy(() => {
    Jpl = require("crypto");
  });
  function lhm(e) {
    let t = e.find(o => o.role === "user");
    if (!t) {
      return "";
    }
    let n = t.content;
    if (typeof n === "string") {
      return n;
    }
    let r = n.find(o => o.type === "text");
    return r?.type === "text" ? r.text : "";
  }
  async function BU(e) {
    let {
      model: t,
      system: n,
      messages: r,
      tools: o,
      tool_choice: s,
      output_format: i,
      max_tokens: a = 1024,
      maxRetries: l = 2,
      timeout: c,
      signal: u,
      skipSystemPromptPrefix: d,
      temperature: p,
      thinking: m,
      stop_sequences: f,
      extraBodyParams: h,
      onFetchAttempt: g
    } = e;
    let y = ym();
    let _ = await R8({
      maxRetries: l,
      model: t,
      source: "side_query",
      agentContext: y,
      ...(g && {
        fetchOverride: (z, V) => (g(), globalThis.fetch(z, V))
      })
    });
    let b = [...A8(t)];
    let S = Boolean(i) && p4e(t) && Zle(t, "structured_outputs");
    if (S && !b.includes(ane)) {
      b.push(ane);
    }
    let E = lhm(r);
    let C = ePo(E, {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION);
    let x = eRn(C, y);
    let A = [x ? {
      type: "text",
      text: x
    } : null, ...(d ? [] : [{
      type: "text",
      text: FDn({
        isNonInteractive: false,
        hasAppendSystemPrompt: false
      })
    }]), ...(Array.isArray(n) ? n : n ? [{
      type: "text",
      text: n
    }] : [])].filter(z => z !== null);
    let k;
    if (m === false) {
      k = {
        type: "disabled"
      };
    } else if (m !== undefined) {
      k = {
        type: "enabled",
        budget_tokens: Math.min(m, a - 1)
      };
    }
    let I = dze(e.querySource) ? "1h" : undefined;
    if (I === "1h" && eO() && !b.includes(Tqe)) {
      b.push(Tqe);
    }
    let O = I ? A.map(z => Qpl(z, I)) : A;
    let M = I ? r.map(z => typeof z.content === "string" ? z : {
      ...z,
      content: z.content.map(V => Qpl(V, I))
    }) : r;
    let L = normalizeModelStringForAPI(t);
    let P = {
      model: L,
      max_tokens: a,
      system: O,
      messages: M,
      ...(o && {
        tools: o
      }),
      ...(s && {
        tool_choice: s
      }),
      ...(S && {
        output_config: {
          format: i
        }
      }),
      ...(p !== undefined && rIn(L) && {
        temperature: p
      }),
      ...(f && {
        stop_sequences: f
      }),
      ...(k && {
        thinking: k
      }),
      ...(b.length > 0 && {
        betas: kk(b)
      }),
      metadata: CDe(),
      ...h
    };
    if (eun(P)) {
      try {
        P = xN(P);
      } catch {}
      QZe(P);
      logEvent("tengu_lone_surrogate_sanitized", {
        source: "sideQuery",
        querySource: e.querySource
      });
    }
    let F = performance.now();
    let H = await _.beta.messages.create(P, {
      signal: u,
      ...(c !== undefined && {
        timeout: c
      })
    }).catch(z => {
      let V = bGr(z);
      if (V) {
        _Gr(t, V);
      }
      throw z;
    });
    let U = H._request_id ?? undefined;
    let N = performance.now();
    let W = Date.now();
    let j = getLastApiCompletionTimestamp();
    logEvent("tengu_api_success", {
      requestId: br(U),
      querySource: e.querySource,
      model: L,
      inputTokens: H.usage.input_tokens,
      outputTokens: H.usage.output_tokens,
      cachedInputTokens: H.usage.cache_read_input_tokens ?? 0,
      uncachedInputTokens: H.usage.cache_creation_input_tokens ?? 0,
      durationMsIncludingRetries: Math.max(0, Math.round(N - F)),
      stop_reason: (H.stop_reason == null ? undefined : H.stop_reason) ?? undefined,
      timeSinceLastApiCallMs: j !== null ? Math.max(0, Math.round(W - j)) : undefined,
      ...Xjt(e.querySource, o$(e.querySource, undefined, undefined))
    });
    setLastApiCompletionTimestamp(W);
    return H;
  }
  function Qpl(e, t) {
    if (!("cache_control" in e) || !e.cache_control || e.cache_control.ttl) {
      return e;
    }
    return {
      ...e,
      cache_control: {
        ...e.cache_control,
        ttl: t
      }
    };
  }
  var xme = __lazy(() => {
    at();
    KN();
    UDn();
    Ot();
    B_();
    aE();
    uIe();
    Tst();
    _h();
    DC();
    tRn();
    tPo();
    ASe();
    Eo();
    Zn();
  });
  function Zpl(e) {
    let t = e.replace(/[\x00-\x1f\x7f-\x9f]/g, "");
    return pC(t, 200);
  }
  function uhm(e) {
    return e.map(t => `## ${t.id}
Situation: ${t.situation}
Feature: ${t.feature}
Action: ${t.action}`).join(`

`);
  }
  function dhm(e) {
    return `You are watching someone use Claude Code. Occasionally \u2014 very occasionally \u2014 you may notice a moment where a brief suggestion would genuinely help them.

Your default output is: no tip. The user is working. They don't need interruption. Saying nothing is almost always correct.

Only speak up when ALL of these are true:
1. You see a clear PATTERN in the conversation (not a one-off moment)
2. There is a specific feature that would help with what they are experiencing
3. The user appears to NOT already know about the feature
4. The suggestion would feel helpful, not interrupting

When you do tip:
- Reference what the user is doing specifically. Not "did you know about X" but "you're doing Y, and X would help."
- 1-2 sentences maximum.
- Include a command or shortcut they can try.
- Only mention tools from session_metadata when they are directly relevant to the suggestion \u2014 an existing server that solves the problem, or team usage of the suggested tool. Never cite an unrelated configured server as evidence.
- Sound like a colleague who knows a useful trick \u2014 not a tutorial popup.

When to absolutely stay silent:
- User is in productive flow (getting things done smoothly)
- Conversation feels urgent or time-sensitive
- You are not confident the suggestion is relevant
- The current turn is routine work with no friction

The catalog below lists all tips. The user message includes <eligible_ids> \u2014 a subset pre-filtered for this user's experience level and local state (tips already shown, features not enabled, etc) \u2014 and <ineligible_ids>, the remainder that local state has already ruled out. Only pick a feature_id from eligible_ids. Picking an id from ineligible_ids is always wrong: that tip has been vetoed for a reason the transcript cannot show, and it will be discarded. Your job is to match situations within eligible_ids, not to second-guess whether a tip is too advanced. Use numStartups for tone: under 50, phrase as "you can X"; over 50, phrase as a peer pointing out a shortcut.

The strongest signal for a tip is when Claude said it CANNOT do something
that a feature would enable ("I don't have access to your database",
"I don't have context from our previous conversation"). These capability-gap
moments are the highest-value tips because the user just experienced the need.

When teamMcpServers or teamSkills appear in session_metadata, those are
tools the user's teammates already use \u2014 and they directly outrank a generic
suggestion. If a tip is about MCP or skills and team data is present, name
the specific tool and the count: "11 teammates use the Atlassian MCP \u2014 claude
mcp add atlassian" instead of "you can connect MCP servers". Only do this
when the team data actually matches the situation; do not pad an unrelated
tip with team stats.

<situations>
${uhm(e)}
</situations>

## Examples

Example 1 \u2014 tip (Claude says it lacks prior context):
Transcript: User: Can you continue the refactor from yesterday? Assistant: I don't have context from our earlier conversation \u2014 could you describe what we were working on?
numStartups: 8
Decision: has_tip=true, tip="Looks like you're picking up previous work \u2014 claude --resume lets you continue with full context.", feature_id="previous-session-reference", action="claude --resume"

Example 2 \u2014 no tip (user in productive flow):
Transcript: User: Fix the login validation. Assistant: [reads file, makes changes]. User: Great, now add tests.
numStartups: 30
Decision: has_tip=false. User is getting things done. No friction. No tip needed.

Example 3 \u2014 no tip (no situation matches):
Transcript: User: Use a subagent to explore the payment module. Assistant: [spawns agent]. User: Now /compact and let's refactor.
numStartups: 150
Decision: has_tip=false. Productive flow; nothing in the catalog describes this transcript.

Example 4 \u2014 tip (correction spiral):
Transcript: User: Refactor auth. Assistant: [makes changes]. User: No, keep the middleware. Assistant: [revises]. User: That's still wrong, I want both to work.
numStartups: 25
Decision: has_tip=true, tip="We've been going back and forth on this. Starting fresh with /clear and a more specific prompt usually converges faster.", feature_id="correction-spiral", action="/clear"`;
  }
  function rPo(e, t) {
    let n = ghm(t);
    let r = [];
    let o = new Map();
    let s = e.slice(-30);
    for (let i of s) {
      if ((i.type === "user" || i.type === "assistant") && i.isVirtual) {
        continue;
      }
      if (i.type === "user") {
        if (i.isMeta) {
          continue;
        }
        let a = i.message.content;
        if (typeof a === "string") {
          r.push(`User: ${aKt(a, 1000)}`);
        } else if (Array.isArray(a)) {
          for (let l of a) {
            if (l.type === "text") {
              r.push(`User: ${aKt(l.text, 1000)}`);
            } else if (l.type === "tool_result") {
              let c = typeof l.content === "string" ? l.content.length : Array.isArray(l.content) ? l.content.reduce((d, p) => d + (p.type === "text" ? p.text.length : 0), 0) : 0;
              let u = o.get(l.tool_use_id) ?? "tool";
              r.push(`[${u} result${l.is_error ? " (error)" : ""}: ${c} chars]`);
            }
          }
        }
      } else if (i.type === "system" && i.subtype === "local_command") {
        r.push(`User (local command): ${aKt(i.content, 300)}`);
      } else if (i.type === "assistant") {
        if (i.isMeta) {
          continue;
        }
        for (let a of i.message.content) {
          if (a.type === "text") {
            r.push(`Assistant: ${aKt(a.text, 300)}`);
          } else if (a.type === "tool_use") {
            o.set(a.id, a.name);
            r.push(`Assistant (tool call): ${a.name} ${hhm(a, n)}`);
          }
        }
      }
    }
    return r.join(`
`);
  }
  function aKt(e, t) {
    return e.length > t ? pC(e, t) + "\u2026" : e;
  }
  function hhm(e, t) {
    let n = t.get(e.name);
    let r = e.input ?? {};
    let o;
    if (n) {
      try {
        let s = n.toAutoClassifierInput(r) ?? r;
        o = typeof s === "string" ? s : De(s);
      } catch {
        o = De(r);
      }
    } else {
      o = De(r);
    }
    return aKt(o, 500);
  }
  function ghm(e) {
    let t = new Map();
    for (let n of e) {
      t.set(n.name, n);
      for (let r of n.aliases ?? []) {
        t.set(r, n);
      }
    }
    return t;
  }
  function yhm(e) {
    let t = [`numStartups: ${e.numStartups}`, `turnCount: ${e.turnCount}`];
    if (e.mcpServers.length > 0) {
      t.push(`mcpServers: ${e.mcpServers.join(", ")}`);
    }
    if (e.teamMcpServers.length > 0) {
      t.push(`teamMcpServers (used by teammates, count is users): ${e.teamMcpServers.map(n => `${n.name} (${n.userCount})`).join(", ")}`);
    }
    if (e.teamSkills.length > 0) {
      t.push(`teamSkills (used by teammates, count is users): ${e.teamSkills.map(n => `${n.name} (${n.userCount})`).join(", ")}`);
    }
    return `<session_metadata>
${t.join(`
`)}
</session_metadata>`;
  }
  function eml() {
    async function e(t, n, r, o, s) {
      let i = rPo(t, n);
      if (i.length === 0) {
        return iKt;
      }
      let a = o.map(d => d.id).join(",");
      let l = new Set(o.map(d => d.id));
      let c = SJn.filter(d => !l.vZc(d.id)).map(d => d.id).join(",");
      let u = Date.now();
      try {
        let d = await BU({
          model: getDefaultHaikuModel(),
          system: [{
            type: "text",
            text: dhm(SJn),
            cache_control: {
              type: "ephemeral"
            }
          }],
          skipSystemPromptPrefix: true,
          messages: [{
            role: "user",
            content: [{
              type: "text",
              text: `${yhm(r)}

<eligible_ids>${a}</eligible_ids>
<ineligible_ids>${c}</ineligible_ids>

<transcript>
${i}
</transcript>`
            }]
          }],
          tools: [mhm],
          tool_choice: {
            type: "tool",
            name: "emit_context_tip"
          },
          max_tokens: 512,
          temperature: 0,
          signal: s,
          querySource: "context_tip_classifier"
        });
        let p = Date.now() - u;
        let m = TJn(d.content, "emit_context_tip");
        if (!m) {
          logForDebugging("[context-tips] no tool_use block in response");
          Cbt({
            outcome: "parse_failure",
            durationMs: p,
            eligibleIds: a,
            usage: d.usage
          });
          Ae("tips_context_classify", "tips_context_classify_no_tool_use");
          return iKt;
        }
        let f = EJn(m, phm());
        if (!f) {
          logForDebugging("[context-tips] response failed schema parse");
          Cbt({
            outcome: "parse_failure",
            durationMs: p,
            eligibleIds: a,
            usage: d.usage
          });
          Ae("tips_context_classify", "tips_context_classify_parse_failed");
          return iKt;
        }
        let h = f.has_tip && f.tip && f.feature_id ? {
          tip: Zpl(f.tip),
          featureId: f.feature_id,
          action: f.action ? Zpl(f.action) : undefined
        } : undefined;
        let g = h && o.some(_ => _.id === h.featureId);
        Cbt({
          outcome: h ? g ? "tip" : "tip_ineligible" : "no_tip",
          featureId: f.feature_id ?? "none",
          classifierLogId: d.id,
          durationMs: p,
          eligibleIds: a,
          usage: d.usage
        });
        Pe("tips_context_classify");
        return g ? {
          tip: h,
          classifierLogId: d.id
        } : iKt;
      } catch (d) {
        let p = Date.now() - u;
        let m = he(d);
        logForDebugging(`[context-tips] classifier error: ${m}`);
        Cbt({
          outcome: "error",
          durationMs: p,
          eligibleIds: a,
          error: m
        });
        Ae("tips_context_classify", "tips_context_classify_request_failed");
        return iKt;
      }
    }
    return {
      classify: e
    };
  }
  function Cbt(e) {
    logEvent("tengu_context_tip_classifier_outcome", {
      outcome: e.outcome,
      ...(e.classifierLogId && {
        classifierLogId: e.classifierLogId
      }),
      ...(e.durationMs !== undefined && {
        durationMs: e.durationMs
      }),
      ...(e.eligibleIds && {
        eligibleIds: e.eligibleIds
      }),
      ...(e.featureId && {
        featureId: e.featureId
      }),
      ...(e.usage && {
        inputTokens: e.usage.input_tokens,
        cachedInputTokens: e.usage.cache_read_input_tokens ?? 0,
        outputTokens: e.usage.output_tokens
      }),
      ...(e.error && {
        error: e.error
      })
    });
  }
  var iKt;
  var phm;
  var mhm;
  var oPo = __lazy(() => {
    je();
    dt();
    Eo();
    wbt();
    xme();
    Zn();
    ln();
    Ot();
    ZIo();
    iKt = {};
    phm = we(() => v.object({
      has_tip: v.boolean(),
      tip: v.string().optional(),
      feature_id: v.string().optional(),
      action: v.string().optional()
    }));
    mhm = {
      name: "emit_context_tip",
      description: "Emit a contextual tip, or decline. Declining (has_tip: false) is the expected outcome most of the time.",
      input_schema: {
        type: "object",
        properties: {
          has_tip: {
            type: "boolean",
            description: "Whether to show a tip. false is the expected default."
          },
          tip: {
            type: "string",
            description: "1-2 sentence tip referencing what the user is doing. Only when has_tip is true."
          },
          feature_id: {
            type: "string",
            description: 'Situation ID from the catalog (e.g. "correction-spiral"). Only when has_tip is true.'
          },
          action: {
            type: "string",
            description: 'Command or shortcut to try (e.g. "/mcp"). Optional.'
          }
        },
        required: ["has_tip"]
      }
    };
  });
  function nml(e, t, n, r) {
    e.pending = {
      tip: t,
      classifierLogId: n,
      shownAtMessageCount: r
    };
  }
  function rml(e, t, n) {
    if (!e.pending) {
      return Promise.resolve();
    }
    if (t.length < e.pending.shownAtMessageCount) {
      e.pending = null;
      return Promise.resolve();
    }
    let r = t.slice(e.pending.shownAtMessageCount);
    if (r.length < 4) {
      return Promise.resolve();
    }
    let o = e.pending;
    e.pending = null;
    let s = o.tip.featureId;
    let i = o.classifierLogId;
    return Thm(r, n, o).catch(a => {
      let l = he(a);
      logForDebugging(`[context-tips] reception error: ${l}`);
      vJn({
        outcome: "error",
        featureId: s,
        classifierLogId: i,
        error: l
      });
      Ae("tips_context_reception_score", "tips_context_reception_request_failed");
    });
  }
  async function Thm(e, t, n) {
    let r = rPo(e, t);
    if (r.length === 0) {
      vJn({
        outcome: "no_transcript",
        featureId: n.tip.featureId,
        classifierLogId: n.classifierLogId
      });
      return;
    }
    let o = `<tip_shown>
Feature: ${n.tip.featureId}
Tip: ${n.tip.tip}
Suggested action: ${n.tip.action ?? "(none)"}
</tip_shown>`;
    let s = Date.now();
    let i = await BU({
      model: getDefaultHaikuModel(),
      system: [{
        type: "text",
        text: _hm,
        cache_control: {
          type: "ephemeral"
        }
      }],
      skipSystemPromptPrefix: true,
      messages: [{
        role: "user",
        content: [{
          type: "text",
          text: `${o}

<transcript_after_tip>
${r}
</transcript_after_tip>`
        }]
      }],
      tools: [bhm],
      tool_choice: {
        type: "tool",
        name: "rate_tip_reception"
      },
      max_tokens: 128,
      temperature: 0,
      signal: AbortSignal.timeout(1e4),
      querySource: "context_tip_reception"
    });
    let a = Date.now() - s;
    let l = TJn(i.content, "rate_tip_reception");
    let c = l && EJn(l, Shm());
    if (!c) {
      vJn({
        outcome: "parse_failure",
        featureId: n.tip.featureId,
        classifierLogId: n.classifierLogId,
        durationMs: a
      });
      Ae("tips_context_reception_score", "tips_context_reception_parse_failed");
      return;
    }
    logForDebugging(`[context-tips] reception: feature=${n.tip.featureId} acted_on=${c.acted_on} reception=${c.reception}`);
    vJn({
      outcome: "scored",
      featureId: n.tip.featureId,
      classifierLogId: n.classifierLogId,
      receptionClassifierLogId: i.id,
      actedOn: c.acted_on,
      reception: c.reception,
      durationMs: a,
      usage: i.usage
    });
    Pe("tips_context_reception_score");
  }
  function vJn(e) {
    logEvent("tengu_context_tip_reception", {
      outcome: e.outcome,
      featureId: e.featureId,
      ...(e.classifierLogId && {
        classifierLogId: e.classifierLogId
      }),
      ...(e.receptionClassifierLogId && {
        receptionClassifierLogId: e.receptionClassifierLogId
      }),
      ...(e.actedOn !== undefined && {
        actedOn: e.actedOn
      }),
      ...(e.reception && {
        reception: e.reception
      }),
      ...(e.durationMs !== undefined && {
        durationMs: e.durationMs
      }),
      ...(e.usage && {
        inputTokens: e.usage.input_tokens,
        cachedInputTokens: e.usage.cache_read_input_tokens ?? 0,
        outputTokens: e.usage.output_tokens
      }),
      ...(e.error && {
        error: e.error
      })
    });
  }
  var tml;
  var _hm = `You evaluate whether a tip shown to a Claude Code user was well-received.

You receive:
1. The tip that was shown (suggested feature + action)
2. A transcript of what happened AFTER the tip was shown

Rate two things:

acted_on \u2014 did the user try the suggested action?
- true: the user's next message or a later message used the suggested command/feature, or they asked about it
- false: no sign they tried it

reception \u2014 how was the tip received?
- "positive": user used the feature, thanked for the tip, or the suggestion clearly helped
- "neutral": user kept working without acknowledging the tip (most common \u2014 not a bad signal)
- "negative": user expressed frustration, the tip was clearly wrong for their situation, or they said to stop showing tips
- "unknown": transcript too short or ambiguous to judge

Be conservative: "neutral" is the expected default. Only mark "positive" or "negative" when the signal is clear.`;
  var bhm;
  var Shm;
  var oml = __lazy(() => {
    je();
    dt();
    Eo();
    wbt();
    xme();
    ln();
    Ot();
    oPo();
    tml = ["positive", "neutral", "negative", "unknown"];
    bhm = {
      name: "rate_tip_reception",
      description: "Rate how a context tip was received based on subsequent user behavior.",
      input_schema: {
        type: "object",
        properties: {
          acted_on: {
            type: "boolean",
            description: "Did the user try the suggested action?"
          },
          reception: {
            type: "string",
            enum: [...tml],
            description: "How was the tip received? neutral is the expected default."
          }
        },
        required: ["acted_on", "reception"]
      }
    };
    Shm = we(() => v.object({
      acted_on: v.boolean(),
      reception: v.enum(tml)
    }));
  });
  function lKt() {
    if (kd()) {
      return false;
    }
    if (!isPolicyAllowed("allow_context_tips")) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_quill", false);
  }
  async function iml(e, t, n, r, o) {
    if (!isPolicyAllowed("allow_context_tips")) {
      return Promise.resolve();
    }
    if (rml(e, r.messages, t), !lKt()) {
      return Promise.resolve();
    }
    if (getInitialSettings().spinnerTipsEnabled === false) {
      return Promise.resolve();
    }
    if (li() && getAttacherCaps() === null) {
      return Promise.resolve();
    }
    if (e.maxIdleGapMinutes = Math.max(e.maxIdleGapMinutes, Wpl(r.messages)), e.inFlight) {
      return Promise.resolve();
    }
    if (e.shownTipIds.size >= 3) {
      return Promise.resolve();
    }
    let s = bJn(r);
    if (s < 3) {
      return Promise.resolve();
    }
    if (s < e.lastAttemptTurn) {
      e.lastAttemptTurn = -1 / 0;
    }
    if (s - e.lastAttemptTurn < 5) {
      return Promise.resolve();
    }
    e.inFlight = true;
    let i = getSessionId();
    let a;
    try {
      let u = new Set(t.map(y => y.name));
      let d = jpl(r.messages);
      let p = Ob(r.messages);
      let [m, f, h] = await Promise.all([listUserTmuxSessions(), getWorktreeCount().catch(() => 0), Ys().stat(sml.join(er(), "CLAUDE.md")).then(() => true, () => false)]);
      let g = m && Bn(m, y => !y.startsWith("claude-bg-"));
      a = Gpl({
        ...r,
        toolNames: u,
        idleGapMinutes: e.maxIdleGapMinutes,
        contextTokens: p,
        subscriptionType: getSubscriptionType(),
        lastTurnThinkingTokens: d.thinking,
        lastTurnOutputTokens: d.output,
        tmuxSessionCount: g,
        worktreeCount: f,
        hasUserMemoryFile: h,
        staleFileTokens: p > 200000 ? qpl(r.messages, n) : 0
      }, {
        vZc: y => e.shownTipIds.vZc(y) || Rme(`ctx:${y}`) < 50
      });
    } catch (u) {
      e.inFlight = false;
      logForDebugging(`[context-tips] eligibility error: ${he(u)}`);
      Et("tips_context_show", "tips_context_show_eligibility_failed");
      return Promise.resolve();
    }
    if (a.length === 0) {
      e.inFlight = false;
      logForDebugging("[context-tips] no eligible entries, skipping");
      return Promise.resolve();
    }
    e.lastAttemptTurn = s;
    e.maxIdleGapMinutes = 0;
    logForDebugging(`[context-tips] classifier eligible, firing sideQuery (${a.length} entries)`);
    e.classifier ??= eml();
    let l = r.messages.length + 1;
    Npl();
    let c = Lpl();
    return e.classifier.classify(r.messages, t, {
      numStartups: r.numStartups,
      turnCount: s,
      mcpServers: r.mcpClients.map(u => u.name),
      teamMcpServers: (c?.mcp_servers ?? []).map(u => ({
        name: u.name,
        userCount: u.user_count
      })),
      teamSkills: (c?.skills ?? []).map(u => ({
        name: u.name,
        userCount: u.user_count
      }))
    }, a, AbortSignal.timeout(1e4)).then(({
      tip: u,
      classifierLogId: d
    }) => {
      if (!u) {
        return;
      }
      if (getSessionId() !== i) {
        logForDebugging("[context-tips] session changed mid-classify, dropping");
        return;
      }
      e.shownTipIds.add(u.featureId);
      Ebt(`ctx:${u.featureId}`);
      nml(e, u, d, l);
      logForDebugging(`[context-tips] showing tip: feature=${u.featureId}`);
      o(u);
      Pe("tips_context_show", {
        feature_id: br(u.featureId) ?? "unknown"
      });
    }).catch(u => {
      let d = he(u);
      logForDebugging(`[context-tips] classifier error: ${d}`);
      Cbt({
        outcome: "outer_error",
        error: d
      });
      Et("tips_context_show", "tips_context_show_outer_error");
    }).finally(() => {
      e.inFlight = false;
    });
  }
  var sml;
  var iPo = __lazy(() => {
    at();
    _b();
    no();
    yd();
    je();
    gn();
    dt();
    na();
    TO();
    ln();
    $n();
    B_();
    Kc();
    Fpl();
    vbt();
    ZIo();
    oPo();
    oml();
    sml = require("path");
  });
  var Pcb;
  var cKt = __lazy(() => {
    _b();
    hd();
    je();
    gn();
    dt();
    zg();
    Pcb = 15 * 60000;
  });
  class kme {
    activeOperations = new Set();
    lastUserActivityTime = 0;
    lastCLIRecordedTime;
    isCLIActive = false;
    USER_ACTIVITY_TIMEOUT_MS = 5000;
    getNow;
    getActiveTimeCounter;
    static instance = null;
    constructor(e) {
      this.getNow = e?.getNow ?? (() => Date.now());
      this.getActiveTimeCounter = e?.getActiveTimeCounter ?? getActiveTimeCounter;
      this.lastCLIRecordedTime = this.getNow();
    }
    static getInstance() {
      if (!kme.instance) {
        kme.instance = new kme();
      }
      return kme.instance;
    }
    static resetInstance() {
      kme.instance = null;
    }
    static createInstance(e) {
      kme.instance = new kme(e);
      return kme.instance;
    }
    recordUserActivity() {
      if (!this.isCLIActive && this.lastUserActivityTime !== 0) {
        let t = (this.getNow() - this.lastUserActivityTime) / 1000;
        if (t > 0) {
          let n = this.USER_ACTIVITY_TIMEOUT_MS / 1000;
          if (t < n) {
            let r = this.getActiveTimeCounter();
            if (r) {
              r.add(t, {
                type: "user"
              });
            }
          }
        }
      }
      this.lastUserActivityTime = this.getNow();
    }
    startCLIActivity(e) {
      if (this.activeOperations.vZc(e)) {
        this.endCLIActivity(e);
      }
      let t = this.activeOperations.size === 0;
      if (this.activeOperations.add(e), t) {
        this.isCLIActive = true;
        this.lastCLIRecordedTime = this.getNow();
      }
    }
    endCLIActivity(e) {
      if (this.activeOperations.delete(e), this.activeOperations.size === 0) {
        let t = this.getNow();
        let n = (t - this.lastCLIRecordedTime) / 1000;
        if (n > 0) {
          let r = this.getActiveTimeCounter();
          if (r) {
            r.add(n, {
              type: "cli"
            });
          }
        }
        this.lastCLIRecordedTime = t;
        this.isCLIActive = false;
      }
    }
    async trackOperation(e, t) {
      this.startCLIActivity(e);
      try {
        return await t();
      } finally {
        this.endCLIActivity(e);
      }
    }
    getActivityStates() {
      return {
        isUserActive: (this.getNow() - this.lastUserActivityTime) / 1000 < this.USER_ACTIVITY_TIMEOUT_MS / 1000,
        isCLIActive: this.isCLIActive,
        activeOperationCount: this.activeOperations.size
      };
    }
  }
  var XQ;
  var wJn = __lazy(() => {
    at();
    cKt();
    XQ = kme.getInstance();
  });
  function RS(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "in_process_teammate";
  }
  function vhm(e) {
    return e.status === "running" && !e.isIdle && e.currentWorkAbortController !== undefined;
  }
  function aml(e) {
    if (!vhm(e)) {
      return false;
    }
    e.currentWorkAbortController?.abort();
    return true;
  }
  function Y1e(e, t) {
    if (e === undefined || e.length === 0) {
      return [t];
    }
    if (e.length >= 50) {
      let n = e.slice(-(50 - 1));
      n.push(t);
      return n;
    }
    return [...e, t];
  }
  function lml(e, t) {
    let n = e === undefined || e.every(r => r.uuid !== t.uuid) ? e : e.filter(r => r.uuid !== t.uuid);
    return Y1e(n, t);
  }
  function cml(e) {
    return e !== undefined && eb.includes(e);
  }
  function Rbt(e) {
    return e.userOverride ?? e.agentDefinitionColor;
  }
  function pze(e) {
    if (e === "general-purpose") {
      return;
    }
    let n = getAgentColorMap().get(e);
    if (n && eb.includes(n)) {
      return w3[n];
    }
    return;
  }
  function xbt(e, t) {
    let n = getAgentColorMap();
    if (!t) {
      n.delete(e);
      return;
    }
    if (eb.includes(t)) {
      n.set(e, t);
    }
  }
  var eb;
  var w3;
  var $U = __lazy(() => {
    at();
    eb = ["red", "blue", "green", "yellow", "purple", "orange", "pink", "cyan"];
    w3 = {
      red: "red_FOR_SUBAGENTS_ONLY",
      blue: "blue_FOR_SUBAGENTS_ONLY",
      green: "green_FOR_SUBAGENTS_ONLY",
      yellow: "yellow_FOR_SUBAGENTS_ONLY",
      purple: "purple_FOR_SUBAGENTS_ONLY",
      orange: "orange_FOR_SUBAGENTS_ONLY",
      pink: "pink_FOR_SUBAGENTS_ONLY",
      cyan: "cyan_FOR_SUBAGENTS_ONLY"
    };
  });
  function uKt(e, t) {
    let n = parseInt(e.id, 10);
    let r = parseInt(t.id, 10);
    if (!isNaN(n) && !isNaN(r)) {
      return n - r;
    }
    return e.id.localeCompare(t.id);
  }
  function RJn({
    tasks: e,
    isStandalone: t = false
  }) {
    let n = bt(k => k.teamContext);
    let r = bt(k => k.tasks);
    let [, o] = mze.useState(0);
    let {
      rows: s,
      columns: i
    } = Sr();
    let a = useClock();
    let l = mze.useRef(new Map());
    let c = mze.useRef(null);
    if (c.current === null) {
      c.current = new Set(e.filter(k => k.status === "completed").map(k => k.id));
    }
    let u = s <= 10 ? 0 : Math.min(5, Math.max(3, s - 14));
    let d = new Set(e.filter(k => k.status === "completed").map(k => k.id));
    let p = Date.now();
    for (let k of d) {
      if (!c.current.vZc(k)) {
        l.current.set(k, p);
      }
    }
    for (let k of l.current.keys()) {
      if (!d.vZc(k)) {
        l.current.delete(k);
      }
    }
    if (c.current = d, mze.useEffect(() => {
      if (l.current.size === 0) {
        return;
      }
      let k = Date.now();
      let I = 1 / 0;
      for (let O of l.current.values()) {
        let M = O + 30000;
        if (M > k && M < I) {
          I = M;
        }
      }
      if (I === 1 / 0) {
        return;
      }
      return a.setTimeout(() => o(O => O + 1), I - k);
    }, [e, a]), !sR()) {
      return null;
    }
    if (e.length === 0) {
      return null;
    }
    let m = {};
    if (isAgentSwarmsEnabled() && n?.teammates) {
      for (let k of Object.values(n.teammates)) {
        if (k.color) {
          let I = w3[k.color];
          if (I) {
            m[k.name] = I;
          }
        }
      }
    }
    let f = {};
    let h = new Set();
    if (isAgentSwarmsEnabled()) {
      for (let k of Object.values(r)) {
        if (RS(k) && k.status === "running") {
          h.add(k.identity.agentName);
          h.add(k.identity.agentId);
          let I = k.progress?.recentActivities;
          let O = (I && r5n(I)) ?? k.progress?.lastActivity?.activityDescription;
          if (O) {
            f[k.identity.agentName] = O;
            f[k.identity.agentId] = O;
          }
        }
      }
    }
    let g = Bn(e, k => k.status === "completed");
    let y = Bn(e, k => k.status === "pending");
    let _ = e.length - g - y;
    let b = new Set(e.filter(k => k.status !== "completed").map(k => k.id));
    let S = e.length > u;
    let E;
    let C;
    if (S) {
      let k = [];
      let I = [];
      for (let P of e.filter(F => F.status === "completed")) {
        let F = l.current.get(P.id);
        if (F && p - F < 30000) {
          k.push(P);
        } else {
          I.push(P);
        }
      }
      k.sort(uKt);
      I.sort(uKt);
      let O = e.filter(P => P.status === "in_progress").sort(uKt);
      let M = e.filter(P => P.status === "pending").sort((P, F) => {
        let H = P.blockedBy.some(N => b.vZc(N));
        let U = F.blockedBy.some(N => b.vZc(N));
        if (H !== U) {
          return H ? 1 : -1;
        }
        return uKt(P, F);
      });
      let L = [...k, ...O, ...M, ...I];
      E = L.slice(0, u);
      C = L.slice(u);
    } else {
      E = [...e].sort(uKt);
      C = [];
    }
    let x = "";
    if (C.length > 0) {
      let k = [];
      let I = Bn(C, L => L.status === "pending");
      let O = Bn(C, L => L.status === "in_progress");
      let M = Bn(C, L => L.status === "completed");
      if (O > 0) {
        k.push(`${O} in progress`);
      }
      if (I > 0) {
        k.push(`${I} pending`);
      }
      if (M > 0) {
        k.push(`${M} completed`);
      }
      x = ` \u2026 +${k.join(", ")}`;
    }
    let A = qw.jsxs(qw.Fragment, {
      children: [E.map(k => qw.jsx(Chm, {
        task: k,
        ownerColor: k.owner ? m[k.owner] : undefined,
        openBlockers: k.blockedBy.filter(I => b.vZc(I)),
        activity: k.owner ? f[k.owner] : undefined,
        ownerActive: k.owner ? h.vZc(k.owner) : false,
        columns: i
      }, k.id)), u > 0 && x && qw.jsx(Text, {
        dimColor: true,
        children: x
      })]
    });
    if (t) {
      return qw.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        marginLeft: 2,
        children: [qw.jsx(gXd, {
          children: qw.jsxs(Text, {
            dimColor: true,
            children: [qw.jsx(Text, {
              bold: true,
              children: e.length
            }), " tasks (", qw.jsx(Text, {
              bold: true,
              children: g
            }), " done, ", _ > 0 && qw.jsxs(qw.Fragment, {
              children: [qw.jsx(Text, {
                bold: true,
                children: _
              }), " in progress, "]
            }), qw.jsx(Text, {
              bold: true,
              children: y
            }), " open)"]
          })
        }), A]
      });
    }
    return qw.jsx(gXd, {
      flexDirection: "column",
      children: A
    });
  }
  function whm(e) {
    switch (e) {
      case "completed":
        return {
          icon: vGd.tick,
          color: "success"
        };
      case "in_progress":
        return {
          icon: vGd.squareSmallFilled,
          color: "claude"
        };
      case "pending":
        return {
          icon: vGd.squareSmall,
          color: undefined
        };
    }
  }
  function Chm(e) {
    let t = dml.c(37);
    let {
      task: n,
      ownerColor: r,
      openBlockers: o,
      activity: s,
      ownerActive: i,
      columns: a
    } = e;
    let l = n.status === "completed";
    let c = n.status === "in_progress";
    let u = o.length > 0;
    let d;
    if (t[0] !== n.status) {
      d = whm(n.status);
      t[0] = n.status;
      t[1] = d;
    } else {
      d = t[1];
    }
    let {
      icon: p,
      color: m
    } = d;
    let f = c && !u && s;
    let h = a >= 60 && n.owner && i;
    let g;
    if (t[2] !== h || t[3] !== n.owner) {
      g = h ? an(` (@${n.owner})`) : 0;
      t[2] = h;
      t[3] = n.owner;
      t[4] = g;
    } else {
      g = t[4];
    }
    let y = g;
    let _ = Math.max(15, a - 15 - y);
    let b;
    if (t[5] !== _ || t[6] !== n.subject) {
      b = truncateToWidth(n.subject, _);
      t[5] = _;
      t[6] = n.subject;
      t[7] = b;
    } else {
      b = t[7];
    }
    let S = b;
    let E = Math.max(15, a - 15);
    let C;
    if (t[8] !== s || t[9] !== E) {
      C = s ? truncateToWidth(s, E) : undefined;
      t[8] = s;
      t[9] = E;
      t[10] = C;
    } else {
      C = t[10];
    }
    let x = C;
    let A;
    if (t[11] !== m || t[12] !== p) {
      A = qw.jsxs(Text, {
        color: m,
        children: [p, " "]
      });
      t[11] = m;
      t[12] = p;
      t[13] = A;
    } else {
      A = t[13];
    }
    let k = l || u;
    let I;
    if (t[14] !== S || t[15] !== l || t[16] !== c || t[17] !== k) {
      I = qw.jsx(Text, {
        bold: c,
        strikethrough: l,
        dimColor: k,
        children: S
      });
      t[14] = S;
      t[15] = l;
      t[16] = c;
      t[17] = k;
      t[18] = I;
    } else {
      I = t[18];
    }
    let O;
    if (t[19] !== r || t[20] !== h || t[21] !== n.owner) {
      O = h && qw.jsxs(Text, {
        dimColor: true,
        children: [" (", r ? qw.jsxs(Text, {
          color: r,
          children: ["@", n.owner]
        }) : `@${n.owner}`, ")"]
      });
      t[19] = r;
      t[20] = h;
      t[21] = n.owner;
      t[22] = O;
    } else {
      O = t[22];
    }
    let M;
    if (t[23] !== u || t[24] !== o) {
      M = u && qw.jsxs(Text, {
        dimColor: true,
        children: [" ", vGd.pointerSmall, " blocked by", " ", [...o].sort(xhm).map(Rhm).join(", ")]
      });
      t[23] = u;
      t[24] = o;
      t[25] = M;
    } else {
      M = t[25];
    }
    let L;
    if (t[26] !== A || t[27] !== I || t[28] !== O || t[29] !== M) {
      L = qw.jsxs(gXd, {
        children: [A, I, O, M]
      });
      t[26] = A;
      t[27] = I;
      t[28] = O;
      t[29] = M;
      t[30] = L;
    } else {
      L = t[30];
    }
    let P;
    if (t[31] !== x || t[32] !== f) {
      P = f && x && qw.jsx(gXd, {
        children: qw.jsxs(Text, {
          dimColor: true,
          children: ["  ", x, vGd.ellipsis]
        })
      });
      t[31] = x;
      t[32] = f;
      t[33] = P;
    } else {
      P = t[33];
    }
    let F;
    if (t[34] !== L || t[35] !== P) {
      F = qw.jsxs(gXd, {
        flexDirection: "column",
        children: [L, P]
      });
      t[34] = L;
      t[35] = P;
      t[36] = F;
    } else {
      F = t[36];
    }
    return F;
  }
  function Rhm(e) {
    return `#${e}`;
  }
  function xhm(e, t) {
    return parseInt(e, 10) - parseInt(t, 10);
  }
  var dml;
  var mze;
  var qw;
  var lPo = __lazy(() => {
    ki();
    bc();
    et();
    ho();
    $U();
    mE();
    FNe();
    cs();
    YI();
    IPe();
    dml = __toESM(pt(), 1);
    mze = __toESM(ot(), 1);
    qw = __toESM(ie(), 1);
  });
  class fml {
    #e = undefined;
    #t = false;
    #n = null;
    #r = null;
    #o = null;
    #l = null;
    #s = null;
    #a = null;
    #c = Si();
    #u = 0;
    #i = false;
    getSnapshot = () => this.#t ? undefined : this.#e;
    subscribe = e => {
      let t = this.#c.subscribe(e);
      if (this.#u++, !this.#i) {
        this.#i = true;
        this.#a = K5a(this.#f);
        this.#d();
      }
      let n = false;
      return () => {
        if (n) {
          return;
        }
        if (n = true, t(), this.#u--, this.#u === 0) {
          this.#b();
        }
      };
    };
    #p() {
      this.#c.emit();
    }
    #g(e) {
      if (e === this.#r && this.#n !== null) {
        return;
      }
      this.#n?.close();
      this.#n = null;
      this.#r = e;
      try {
        this.#n = mml.watch(e, this.#f);
        this.#n.unref();
      } catch {}
    }
    #f = () => {
      if (this.#l) {
        clearTimeout(this.#l);
      }
      this.#l = setTimeout(() => void this.#d(), 50);
      this.#l.unref();
    };
    refetch = () => this.#d();
    #d = async () => {
      let e = H$();
      this.#g(w9(e));
      let t = (await y3(e)).filter(o => !o.metadata?._internal);
      if (!this.#i) {
        return;
      }
      let n = t.some(o => o.status !== "completed");
      let r = !Lhm(this.#e, t);
      if (r) {
        this.#e = t;
      }
      if (n || t.length === 0) {
        this.#t = t.length === 0;
        this.#h();
      } else if (this.#o === null && !this.#t) {
        this.#o = setTimeout(this.#y.bind(this, e), 5000);
        this.#o.unref();
      }
      if (r) {
        this.#p();
      }
      if (this.#s) {
        clearTimeout(this.#s);
        this.#s = null;
      }
      if (n) {
        this.#s = setTimeout(this.#f, 5000);
        this.#s.unref();
      }
    };
    #y(e) {
      this.#o = null;
      let t = H$();
      if (t !== e) {
        return;
      }
      y3(t).then(async n => {
        if (n.length > 0 && n.every(o => o.status === "completed")) {
          await X5a(t);
          this.#e = [];
          this.#t = true;
        }
        this.#p();
      });
    }
    #h() {
      if (this.#o) {
        clearTimeout(this.#o);
        this.#o = null;
      }
    }
    #b() {
      if (this.#n?.close(), this.#n = null, this.#r = null, this.#a?.(), this.#a = null, this.#h(), this.#l) {
        clearTimeout(this.#l);
      }
      if (this.#s) {
        clearTimeout(this.#s);
      }
      this.#l = null;
      this.#s = null;
      this.#i = false;
    }
  }
  function Ohm() {
    return Phm ??= new fml();
  }
  function dKt() {
    let e = bt(r => r.teamContext);
    let n = sR() && !getIsRemoteMode() && (!e || isTeamLead(e)) ? Ohm() : null;
    return xJn.useSyncExternalStore(n ? n.subscribe : Mhm, n ? n.getSnapshot : Nhm);
  }
  function hml() {
    let e = dKt();
    let t = Lo();
    let n = e === undefined;
    xJn.useEffect(() => {
      if (!n) {
        return;
      }
      t(r => {
        if (r.expandedView !== "tasks") {
          return r;
        }
        return {
          ...r,
          expandedView: "none"
        };
      });
    }, [n, t]);
    return e;
  }
  function Lhm(e, t) {
    if (e === undefined || e.length !== t.length) {
      return false;
    }
    for (let n = 0; n < t.length; n++) {
      let r = e[n];
      let o = t[n];
      if (r.id !== o.id || r.status !== o.status || r.subject !== o.subject || r.activeForm !== o.activeForm || r.owner !== o.owner || r.description !== o.description || !pml(r.blockedBy, o.blockedBy) || !pml(r.blocks, o.blocks)) {
        return false;
      }
    }
    return true;
  }
  function pml(e, t) {
    if (e.length !== t.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      if (e[n] !== t[n]) {
        return false;
      }
    }
    return true;
  }
  var mml;
  var xJn;
  var Phm = null;
  var Dhm = () => {};
  var Mhm = () => Dhm;
  var Nhm = () => {
    return;
  };
  var kJn = __lazy(() => {
    at();
    ho();
    ph();
    YI();
    qp();
    mml = require("fs");
    xJn = __toESM(ot(), 1);
  });
  var Fhm;
  var Uhm;
  var gml = __lazy(() => {
    mT();
    et();
    Ore();
    Fhm = __toESM(pt(), 1);
    Uhm = __toESM(ie(), 1);
  });
  function pKt(e) {
    let t = yml.c(102);
    let {
      message: n,
      mode: r,
      messageColor: o,
      glimmerIndex: s,
      flashOpacity: i,
      shimmerColor: a,
      stalledIntensity: l,
      thinkingIntensity: c
    } = e;
    let u = l === undefined ? 0 : l;
    let d = c === undefined ? 0 : c;
    let p = useResolvedTheme();
    let m;
    if (t[0] !== n) {
      m = [];
      for (let {
        segment: P
      } of JS().segment(n)) {
        m.push({
          segment: P,
          width: an(P)
        });
      }
      t[0] = n;
      t[1] = m;
    } else {
      m = t[1];
    }
    let f;
    if (t[2] !== n) {
      f = an(n);
      t[2] = n;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h;
    if (t[4] !== m || t[5] !== f) {
      h = {
        segments: m,
        messageWidth: f
      };
      t[4] = m;
      t[5] = f;
      t[6] = h;
    } else {
      h = t[6];
    }
    let {
      segments: g,
      messageWidth: y
    } = h;
    if (!n) {
      return null;
    }
    if (u > 0) {
      let P = p[o];
      let F;
      if (t[7] !== P || t[8] !== n || t[9] !== u) {
        F = Symbol.for("react.early_return_sentinel");
        e: {
          let j = P ? Z2(P) : null;
          if (j) {
            let z = y1(j, Bhm, g1(u));
            let V = _1(z);
            let K;
            if (t[11] !== V || t[12] !== n) {
              K = Qh.jsx(Text, {
                color: V,
                children: n
              });
              t[11] = V;
              t[12] = n;
              t[13] = K;
            } else {
              K = t[13];
            }
            let J;
            if (t[14] !== V) {
              J = Qh.jsx(Text, {
                color: V,
                children: " "
              });
              t[14] = V;
              t[15] = J;
            } else {
              J = t[15];
            }
            let Q;
            if (t[16] !== K || t[17] !== J) {
              Q = Qh.jsxs(Qh.Fragment, {
                children: [K, J]
              });
              t[16] = K;
              t[17] = J;
              t[18] = Q;
            } else {
              Q = t[18];
            }
            F = Q;
            break e;
          }
        }
        t[7] = P;
        t[8] = n;
        t[9] = u;
        t[10] = F;
      } else {
        F = t[10];
      }
      if (F !== Symbol.for("react.early_return_sentinel")) {
        return F;
      }
      let H = u > 0.5 ? "error" : o;
      let U;
      if (t[19] !== H || t[20] !== n) {
        U = Qh.jsx(Text, {
          color: H,
          children: n
        });
        t[19] = H;
        t[20] = n;
        t[21] = U;
      } else {
        U = t[21];
      }
      let N;
      if (t[22] !== H) {
        N = Qh.jsx(Text, {
          color: H,
          children: " "
        });
        t[22] = H;
        t[23] = N;
      } else {
        N = t[23];
      }
      let W;
      if (t[24] !== U || t[25] !== N) {
        W = Qh.jsxs(Qh.Fragment, {
          children: [U, N]
        });
        t[24] = U;
        t[25] = N;
        t[26] = W;
      } else {
        W = t[26];
      }
      return W;
    }
    if (d > 0) {
      let P = p[o];
      let F;
      if (t[27] !== P || t[28] !== n || t[29] !== p.warning || t[30] !== d) {
        F = Symbol.for("react.early_return_sentinel");
        e: {
          let j = P ? Z2(P) : null;
          let z = Z2(p.warning);
          if (j && z) {
            let V = y1(j, z, g1(d));
            let K = _1(V);
            let J;
            if (t[32] !== K || t[33] !== n) {
              J = Qh.jsx(Text, {
                color: K,
                children: n
              });
              t[32] = K;
              t[33] = n;
              t[34] = J;
            } else {
              J = t[34];
            }
            let Q;
            if (t[35] !== K) {
              Q = Qh.jsx(Text, {
                color: K,
                children: " "
              });
              t[35] = K;
              t[36] = Q;
            } else {
              Q = t[36];
            }
            let Z;
            if (t[37] !== J || t[38] !== Q) {
              Z = Qh.jsxs(Qh.Fragment, {
                children: [J, Q]
              });
              t[37] = J;
              t[38] = Q;
              t[39] = Z;
            } else {
              Z = t[39];
            }
            F = Z;
            break e;
          }
        }
        t[27] = P;
        t[28] = n;
        t[29] = p.warning;
        t[30] = d;
        t[31] = F;
      } else {
        F = t[31];
      }
      if (F !== Symbol.for("react.early_return_sentinel")) {
        return F;
      }
      let H = d > 0.5 ? "warning" : o;
      let U;
      if (t[40] !== H || t[41] !== n) {
        U = Qh.jsx(Text, {
          color: H,
          children: n
        });
        t[40] = H;
        t[41] = n;
        t[42] = U;
      } else {
        U = t[42];
      }
      let N;
      if (t[43] !== H) {
        N = Qh.jsx(Text, {
          color: H,
          children: " "
        });
        t[43] = H;
        t[44] = N;
      } else {
        N = t[44];
      }
      let W;
      if (t[45] !== U || t[46] !== N) {
        W = Qh.jsxs(Qh.Fragment, {
          children: [U, N]
        });
        t[45] = U;
        t[46] = N;
        t[47] = W;
      } else {
        W = t[47];
      }
      return W;
    }
    if (r === "tool-use") {
      let P = p[o];
      let F = p[a];
      let H;
      if (t[48] !== P || t[49] !== i || t[50] !== n || t[51] !== o || t[52] !== F) {
        H = Symbol.for("react.early_return_sentinel");
        e: {
          let z = P ? Z2(P) : null;
          let V = F ? Z2(F) : null;
          if (z && V) {
            let K = y1(z, V, g1(i));
            let J = Qh.jsx(Text, {
              color: _1(K),
              children: n
            });
            let Q;
            if (t[54] !== o) {
              Q = Qh.jsx(Text, {
                color: o,
                children: " "
              });
              t[54] = o;
              t[55] = Q;
            } else {
              Q = t[55];
            }
            let Z;
            if (t[56] !== J || t[57] !== Q) {
              Z = Qh.jsxs(Qh.Fragment, {
                children: [J, Q]
              });
              t[56] = J;
              t[57] = Q;
              t[58] = Z;
            } else {
              Z = t[58];
            }
            H = Z;
            break e;
          }
        }
        t[48] = P;
        t[49] = i;
        t[50] = n;
        t[51] = o;
        t[52] = F;
        t[53] = H;
      } else {
        H = t[53];
      }
      if (H !== Symbol.for("react.early_return_sentinel")) {
        return H;
      }
      let U = i > 0.5 ? a : o;
      let N;
      if (t[59] !== U || t[60] !== n) {
        N = Qh.jsx(Text, {
          color: U,
          children: n
        });
        t[59] = U;
        t[60] = n;
        t[61] = N;
      } else {
        N = t[61];
      }
      let W;
      if (t[62] !== o) {
        W = Qh.jsx(Text, {
          color: o,
          children: " "
        });
        t[62] = o;
        t[63] = W;
      } else {
        W = t[63];
      }
      let j;
      if (t[64] !== N || t[65] !== W) {
        j = Qh.jsxs(Qh.Fragment, {
          children: [N, W]
        });
        t[64] = N;
        t[65] = W;
        t[66] = j;
      } else {
        j = t[66];
      }
      return j;
    }
    let _ = s - 1;
    let b = s + 1;
    if (_ >= y || b < 0) {
      let P;
      if (t[67] !== n || t[68] !== o) {
        P = Qh.jsx(Text, {
          color: o,
          children: n
        });
        t[67] = n;
        t[68] = o;
        t[69] = P;
      } else {
        P = t[69];
      }
      let F;
      if (t[70] !== o) {
        F = Qh.jsx(Text, {
          color: o,
          children: " "
        });
        t[70] = o;
        t[71] = F;
      } else {
        F = t[71];
      }
      let H;
      if (t[72] !== P || t[73] !== F) {
        H = Qh.jsxs(Qh.Fragment, {
          children: [P, F]
        });
        t[72] = P;
        t[73] = F;
        t[74] = H;
      } else {
        H = t[74];
      }
      return H;
    }
    let S = Math.max(0, _);
    let E = 0;
    let C = "";
    let x = "";
    let A = "";
    if (t[75] !== A || t[76] !== C || t[77] !== S || t[78] !== E || t[79] !== g || t[80] !== x || t[81] !== b) {
      for (let {
        segment: P,
        width: F
      } of g) {
        if (E + F <= S) {
          C = C + P;
        } else if (E > b) {
          A = A + P;
        } else {
          x = x + P;
        }
        E = E + F;
      }
      t[75] = A;
      t[76] = C;
      t[77] = S;
      t[78] = E;
      t[79] = g;
      t[80] = x;
      t[81] = b;
      t[82] = C;
      t[83] = A;
      t[84] = x;
      t[85] = E;
    } else {
      C = t[82];
      A = t[83];
      x = t[84];
      E = t[85];
    }
    let k;
    if (t[86] !== C || t[87] !== o) {
      k = C && Qh.jsx(Text, {
        color: o,
        children: C
      });
      t[86] = C;
      t[87] = o;
      t[88] = k;
    } else {
      k = t[88];
    }
    let I;
    if (t[89] !== x || t[90] !== a) {
      I = Qh.jsx(Text, {
        color: a,
        children: x
      });
      t[89] = x;
      t[90] = a;
      t[91] = I;
    } else {
      I = t[91];
    }
    let O;
    if (t[92] !== A || t[93] !== o) {
      O = A && Qh.jsx(Text, {
        color: o,
        children: A
      });
      t[92] = A;
      t[93] = o;
      t[94] = O;
    } else {
      O = t[94];
    }
    let M;
    if (t[95] !== o) {
      M = Qh.jsx(Text, {
        color: o,
        children: " "
      });
      t[95] = o;
      t[96] = M;
    } else {
      M = t[96];
    }
    let L;
    if (t[97] !== k || t[98] !== I || t[99] !== O || t[100] !== M) {
      L = Qh.jsxs(Qh.Fragment, {
        children: [k, I, O, M]
      });
      t[97] = k;
      t[98] = I;
      t[99] = O;
      t[100] = M;
      t[101] = L;
    } else {
      L = t[101];
    }
    return L;
  }
  var yml;
  var Qh;
  var Bhm;
  var AJn = __lazy(() => {
    bc();
    et();
    PP();
    Ore();
    yml = __toESM(pt(), 1);
    Qh = __toESM(ie(), 1);
    Bhm = {
      r: 171,
      g: 43,
      b: 63
    };
  });
  function J1e(e) {
    let t = Tml.c(34);
    let {
      frame: n,
      messageColor: r,
      stalledIntensity: o,
      thinkingIntensity: s,
      reducedMotion: i,
      time: a
    } = e;
    let l = o === undefined ? 0 : o;
    let c = s === undefined ? 0 : s;
    let u = i === undefined ? false : i;
    let d = a === undefined ? 0 : a;
    let p = useResolvedTheme();
    if (u) {
      let h = 1 - $Ln(d, 2000);
      let g = c > 0 ? "warning" : r;
      let y = p[g];
      let _;
      if (t[0] !== y || t[1] !== h || t[2] !== c) {
        _ = Symbol.for("react.early_return_sentinel");
        e: {
          let C = y ? Z2(y) : null;
          if (C) {
            let x = y1(C, jhm, 0.5);
            let A = y1(x, C, g1(h));
            let k = C3.jsx(Text, {
              color: _1(A),
              bold: c >= 0.5,
              children: "\u25CF"
            });
            let I;
            if (t[4] !== k) {
              I = C3.jsx(gXd, {
                "aria-hidden": true,
                flexWrap: "wrap",
                height: 1,
                width: 2,
                children: k
              });
              t[4] = k;
              t[5] = I;
            } else {
              I = t[5];
            }
            _ = I;
            break e;
          }
        }
        t[0] = y;
        t[1] = h;
        t[2] = c;
        t[3] = _;
      } else {
        _ = t[3];
      }
      if (_ !== Symbol.for("react.early_return_sentinel")) {
        return _;
      }
      let b = h < 0.5;
      let S = c >= 0.5;
      let E;
      if (t[6] !== g || t[7] !== b || t[8] !== S) {
        E = C3.jsx(gXd, {
          "aria-hidden": true,
          flexWrap: "wrap",
          height: 1,
          width: 2,
          children: C3.jsx(Text, {
            color: g,
            dimColor: b,
            bold: S,
            children: "\u25CF"
          })
        });
        t[6] = g;
        t[7] = b;
        t[8] = S;
        t[9] = E;
      } else {
        E = t[9];
      }
      return E;
    }
    let m = bml[n % bml.length];
    if (l > 0) {
      let h = p[r];
      let g;
      if (t[10] !== h || t[11] !== m || t[12] !== l) {
        g = Symbol.for("react.early_return_sentinel");
        e: {
          let b = h ? Z2(h) : null;
          if (b) {
            let S = y1(b, Hhm, g1(l));
            let E = C3.jsx(Text, {
              color: _1(S),
              children: m
            });
            let C;
            if (t[14] !== E) {
              C = C3.jsx(gXd, {
                "aria-hidden": true,
                flexWrap: "wrap",
                height: 1,
                width: 2,
                children: E
              });
              t[14] = E;
              t[15] = C;
            } else {
              C = t[15];
            }
            g = C;
            break e;
          }
        }
        t[10] = h;
        t[11] = m;
        t[12] = l;
        t[13] = g;
      } else {
        g = t[13];
      }
      if (g !== Symbol.for("react.early_return_sentinel")) {
        return g;
      }
      let y = l > 0.5 ? "error" : r;
      let _;
      if (t[16] !== y || t[17] !== m) {
        _ = C3.jsx(gXd, {
          "aria-hidden": true,
          flexWrap: "wrap",
          height: 1,
          width: 2,
          children: C3.jsx(Text, {
            color: y,
            children: m
          })
        });
        t[16] = y;
        t[17] = m;
        t[18] = _;
      } else {
        _ = t[18];
      }
      return _;
    }
    if (c > 0) {
      let h = p[r];
      let g;
      let y;
      if (t[19] !== h || t[20] !== m || t[21] !== p.warning || t[22] !== c) {
        y = Symbol.for("react.early_return_sentinel");
        e: {
          let S = h ? Z2(h) : null;
          let E = Z2(p.warning);
          if (g = c >= 0.5, S && E) {
            let C = y1(S, E, g1(c));
            let x = C3.jsx(Text, {
              bold: g,
              color: _1(C),
              children: m
            });
            let A;
            if (t[25] !== x) {
              A = C3.jsx(gXd, {
                "aria-hidden": true,
                flexWrap: "wrap",
                height: 1,
                width: 2,
                children: x
              });
              t[25] = x;
              t[26] = A;
            } else {
              A = t[26];
            }
            y = A;
            break e;
          }
        }
        t[19] = h;
        t[20] = m;
        t[21] = p.warning;
        t[22] = c;
        t[23] = g;
        t[24] = y;
      } else {
        g = t[23];
        y = t[24];
      }
      if (y !== Symbol.for("react.early_return_sentinel")) {
        return y;
      }
      let _ = c > 0.5 ? "warning" : r;
      let b;
      if (t[27] !== g || t[28] !== _ || t[29] !== m) {
        b = C3.jsx(gXd, {
          "aria-hidden": true,
          flexWrap: "wrap",
          height: 1,
          width: 2,
          children: C3.jsx(Text, {
            bold: g,
            color: _,
            children: m
          })
        });
        t[27] = g;
        t[28] = _;
        t[29] = m;
        t[30] = b;
      } else {
        b = t[30];
      }
      return b;
    }
    let f;
    if (t[31] !== r || t[32] !== m) {
      f = C3.jsx(gXd, {
        "aria-hidden": true,
        flexWrap: "wrap",
        height: 1,
        width: 2,
        children: C3.jsx(Text, {
          color: r,
          children: m
        })
      });
      t[31] = r;
      t[32] = m;
      t[33] = f;
    } else {
      f = t[33];
    }
    return f;
  }
  var Tml;
  var C3;
  var _ml;
  var bml;
  var Hhm;
  var jhm;
  var mKt = __lazy(() => {
    et();
    Ore();
    Tml = __toESM(pt(), 1);
    C3 = __toESM(ie(), 1);
    _ml = bSe();
    bml = [..._ml, ...[..._ml].reverse()];
    Hhm = {
      r: 171,
      g: 43,
      b: 63
    };
    jhm = {
      r: 0,
      g: 0,
      b: 0
    };
  });
  function fKt(e, t, n) {
    let r = e === "requesting" ? 50 : 200;
    let [o, s] = useAnimationFrame(n ? null : r);
    let i = Eml.useMemo(() => an(t), [t]);
    if (n) {
      return [o, -100];
    }
    let a = Math.floor(s / r);
    let l = i + 20;
    if (e === "requesting") {
      return [o, a % l - 10];
    }
    return [o, i + 10 - a % l];
  }
  var Eml;
  var IJn = __lazy(() => {
    bc();
    et();
    Eml = __toESM(ot(), 1);
  });
  function cPo(e, t, n = false, r = false) {
    let o = hKt.useRef(e);
    let s = hKt.useRef(t);
    let i = hKt.useRef(0);
    let a = hKt.useRef(e);
    if (t > s.current) {
      o.current = e;
      s.current = t;
      i.current = 0;
      a.current = e;
    }
    let l;
    if (n) {
      l = 0;
      o.current = e;
    } else {
      l = e - o.current;
    }
    let c = l > 1e4 && !n;
    let u = c ? Math.min((l - 1e4) / 1e4, 1) : 0;
    if (!r && (u > 0 || i.current > 0)) {
      let p = e - a.current;
      if (p >= 50) {
        let m = Math.floor(p / 50);
        let f = i.current;
        for (let h = 0; h < m; h++) {
          let g = u - f;
          if (Math.abs(g) < 0.01) {
            f = u;
            break;
          }
          f += g * 0.1;
        }
        i.current = f;
        a.current = e;
      }
    } else {
      i.current = u;
      a.current = e;
    }
    let d = r ? u : i.current;
    return {
      isStalled: c,
      stalledIntensity: d,
      timeSinceLastToken: l
    };
  }
  var hKt;
  var uPo = __lazy(() => {
    hKt = __toESM(ot(), 1);
  });
  var vml = __lazy(() => {
    gml();
    AJn();
    Pjt();
    mKt();
    IJn();
    uPo();
    Ore();
  });
  function wml(e) {
    let t = Math.max(0, e) / 1000;
    let n = 1 - Math.exp(-t / 90);
    return Math.min(95, Math.round(n * 100));
  }
  function Cml() {
    return {
      toolWindowStart: null,
      toolWindowEnd: null,
      thinkingBurstStart: null,
      wasThinking: false
    };
  }
  function Rml(e, t) {
    let {
      toolWindowStart: n,
      toolWindowEnd: r,
      thinkingBurstStart: o
    } = e;
    if (t.hasActiveTools) {
      if (n === null || r !== null) {
        n = t.now;
      }
      r = null;
    } else if (n !== null && r === null) {
      r = t.now;
    }
    if (!t.hasActiveTools && t.thinkingStatus !== null) {
      n = null;
      r = null;
    }
    if (t.isThinking) {
      if (!e.wasThinking) {
        o = t.now;
      }
    } else {
      o = null;
    }
    return {
      toolWindowStart: n,
      toolWindowEnd: r,
      thinkingBurstStart: o,
      wasThinking: t.isThinking
    };
  }
  function xml(e, t) {
    if (t.showToolCallTimer && t.hasActiveTools && e.toolWindowStart !== null) {
      let n = t.now - e.toolWindowStart;
      if (n >= 2000) {
        return {
          kind: "tool-running",
          toolMs: n
        };
      }
    }
    if (t.showToolCallTimer && !t.hasActiveTools && t.thinkingStatus === null && e.toolWindowStart !== null && e.toolWindowEnd !== null) {
      let n = e.toolWindowEnd - e.toolWindowStart;
      if (n >= 2000) {
        return {
          kind: "tool-done",
          toolMs: n
        };
      }
    }
    if (t.thinkingStatus === "thinking" && !t.hasActiveTools) {
      return {
        kind: "thinking",
        thinkingMs: e.thinkingBurstStart !== null ? t.now - e.thinkingBurstStart : 0
      };
    }
    if (typeof t.thinkingStatus === "number") {
      return {
        kind: "thought-for",
        thoughtMs: t.thinkingStatus
      };
    }
    return {
      kind: "none"
    };
  }
  function kml(e, t) {
    if (t.hasActiveTools) {
      return 0;
    }
    if (!t.isThinking || e.thinkingBurstStart === null) {
      return 0;
    }
    let n = t.now - e.thinkingBurstStart;
    return Math.min(Math.max((n - 1e4) / 1e4, 0), 1);
  }
  function ngm(e) {
    let t = $Ln(e, 2000);
    return Math.round(t * (bSe().length - 1));
  }
  function rgm(e) {
    if (e >= 45000) {
      return "almost done thinking";
    }
    if (e >= 30000) {
      return "thinking some more";
    }
    if (e >= 20000) {
      return "thinking more";
    }
    if (e >= 1e4) {
      return "still thinking";
    }
    return "thinking";
  }
  function ogm(e) {
    return g1((Math.sin(e / 1000 * Math.PI) + 1) / 2);
  }
  function sgm(e, t, n) {
    let r = (e - 3000) / 1000;
    let o = e < 3000 ? 0 : (Math.sin(r * Math.PI * 2 / 2) + 1) / 2;
    let s = y1(Yhm, Jhm, g1(o));
    return _1(n && t > 0 ? y1(s, n, g1(t)) : s);
  }
  function Oml({
    mode: e,
    reducedMotion: t,
    hasActiveTools: n,
    responseLengthRef: r,
    message: o,
    messageColor: s,
    shimmerColor: i,
    overrideColor: a,
    loadingStartTimeRef: l,
    totalPausedMsRef: c,
    pauseStartTimeRef: u,
    spinnerSuffix: d,
    verbose: p,
    columns: m,
    thinkingStatus: f,
    effortSuffix: h,
    isCompacting: g = false,
    compactingStartTime: y = null,
    showToolCallTimer: _ = false,
    retryStatus: b = null
  }) {
    let [S, E] = useAnimationFrame(t ? null : e === "requesting" ? 50 : 100);
    let C = useResolvedTheme();
    let x = Date.now();
    let k = u.current !== null ? u.current - l.current - c.current : x - l.current - c.current;
    let I = bse.useRef(Cml());
    let O = {
      now: x,
      isThinking: e === "thinking",
      hasActiveTools: n,
      thinkingStatus: f,
      showToolCallTimer: _
    };
    I.current = Rml(I.current, O);
    let M = xml(I.current, O);
    let L = kml(I.current, O);
    let P = r.current;
    let F = n || e === "thinking" || g;
    let {
      isStalled: H,
      stalledIntensity: U,
      timeSinceLastToken: N
    } = cPo(E, P, F, t);
    let W = bse.useRef(new Set());
    let j = bse.useRef(0);
    if (N === 0) {
      if (W.current.size > 0) {
        logEvent("tengu_spinner_stall_cleared", {
          max_stall_ms: Math.round(j.current),
          mode: e,
          override_color: a != null,
          response_length: P,
          thresholds_fired: W.current.size
        });
        W.current = new Set();
        j.current = 0;
      }
    } else {
      if (N > j.current) {
        j.current = N;
      }
      for (let jn of zhm) {
        if (N >= jn && !W.current.vZc(jn)) {
          W.current.add(jn);
          logEvent("tengu_spinner_stalled_ui", {
            threshold_ms: jn,
            mode: e,
            override_color: a != null,
            time_since_last_token_ms: Math.round(N),
            response_length: P,
            render_loop_dark: N - jn > 5000
          });
        }
      }
    }
    let z = t ? 0 : ngm(E);
    let V = e === "requesting" ? 50 : 200;
    let K = bse.useMemo(() => an(o), [o]);
    let J = K + 20;
    let Q = Math.floor(E / V);
    let Z = t ? -100 : H ? -100 : e === "requesting" ? Q % J - 10 : K + 10 - Q % J;
    let ne = t ? 0 : e === "tool-use" ? ogm(E) : 0;
    let oe = bse.useRef(P);
    let ee = bse.useRef(E);
    if (t) {
      oe.current = P;
      ee.current = E;
    } else {
      let jn = Math.floor((E - ee.current) / 50);
      if (jn > 0) {
        ee.current += jn * 50;
        for (let Xr = 0; Xr < jn; Xr++) {
          let co = P - oe.current;
          if (co <= 0) {
            break;
          }
          let Yt;
          if (co < 70) {
            Yt = 3;
          } else if (co < 200) {
            Yt = Math.max(8, Math.ceil(co * 0.15));
          } else {
            Yt = 50;
          }
          oe.current = Math.min(oe.current + Yt, P);
        }
      }
    }
    let re = oe.current;
    let se = Math.round(re / 4);
    let ae = bse.useRef(0);
    let de = bse.useRef(E);
    if (e !== "thinking" || n) {
      ae.current = 0;
      de.current = E;
    } else if (!t && (L > 0 || ae.current > 0)) {
      let jn = E - de.current;
      if (jn >= 50) {
        let Xr = Math.floor(jn / 50);
        let co = ae.current;
        for (let Yt = 0; Yt < Xr; Yt++) {
          let Ee = L - co;
          if (Math.abs(Ee) < 0.01) {
            co = L;
            break;
          }
          co += Ee * 0.1;
        }
        ae.current = co;
        de.current = E;
      }
    } else {
      ae.current = L;
      de.current = E;
    }
    let be = t ? L : ae.current;
    let fe = formatDuration(k);
    let me = an(fe);
    let Te = se;
    let ue = formatNumber(Te);
    let ce = `${vGd.arrowDown} ${ue} tokens`;
    let le = an(ce);
    let pe = M.kind === "thinking" ? rgm(M.thinkingMs) : "thinking";
    let ve;
    switch (M.kind) {
      case "tool-running":
        ve = `running tool for ${formatDuration(M.toolMs)}`;
        break;
      case "tool-done":
        ve = `ran tool for ${formatDuration(M.toolMs)}`;
        break;
      case "thinking":
        ve = `${pe}${h}`;
        break;
      case "thought-for":
        ve = `thought for ${Math.max(1, Math.round(M.thoughtMs / 1000))}s`;
        break;
      case "none":
        ve = null;
        break;
    }
    let _e = ve ? an(ve) : 0;
    let xe = bse.useRef(0);
    let ke = g && y !== null ? Math.max(xe.current, wml(x - y)) : null;
    xe.current = ke ?? 0;
    let Ie = ke !== null ? `${ke}%` : null;
    let Ue = Math.min(40, m - 2 - 6);
    let Ge = ke !== null && Ue >= 8;
    let Be = K + 2;
    let We = qhm;
    let Ze = ve !== null;
    let Tt = p || Ze || Te > 0 || k > 16000;
    let kt = m - Be - 5;
    let Ye = Ze && kt > _e;
    if (!Ye && Ze && M.kind === "thinking" && (h || pe !== "thinking")) {
      if (kt > Aml) {
        ve = "thinking";
        _e = Aml;
        Ye = true;
      }
    }
    let ht = Ye ? _e + We : 0;
    let It = Tt && kt > ht + me;
    let Rt = ht + (It ? me + We : 0);
    let wt = Tt && Te > 0 && kt > Rt + le;
    let vt = Ye && M.kind === "thinking" && !d && !It && !wt;
    let yt = be > 0 ? Z2(C.warning) : null;
    let gt = sgm(E, be, yt);
    let Ft = !yt && be > 0.5 ? "warning" : undefined;
    let on = be > 0 ? "warning" : undefined;
    let rn = [...(d ? [Vm.jsx(Text, {
      dimColor: true,
      children: d
    }, "suffix")] : []), ...(It ? [Vm.jsx(Text, {
      dimColor: true,
      children: fe
    }, "elapsedTime")] : []), ...(wt ? [Vm.jsxs(gXd, {
      flexDirection: "row",
      children: [Vm.jsx(igm, {
        mode: e
      }), Vm.jsxs(Text, {
        dimColor: true,
        children: [ue, " tokens"]
      })]
    }, "tokens")] : []), ...(Ye && ve ? [M.kind === "thinking" && !t ? Vm.jsx(Text, {
      color: Ft ?? gt,
      children: vt ? `(${ve})` : ve
    }, "thinking") : Vm.jsx(Text, {
      dimColor: !on,
      color: on,
      children: ve
    }, "thinking")] : [])];
    let Sn = rn.length > 0 ? vt ? Vm.jsx(Hn, {
      children: rn
    }) : Vm.jsxs(Vm.Fragment, {
      children: [Vm.jsx(Text, {
        dimColor: true,
        children: "("
      }), Vm.jsx(Hn, {
        children: rn
      }), Vm.jsx(Text, {
        dimColor: true,
        children: ")"
      })]
    }) : null;
    return Vm.jsxs(gXd, {
      ref: S,
      flexDirection: "column",
      width: "100%",
      children: [Vm.jsx(gXd, {
        flexDirection: "row",
        flexWrap: "wrap",
        marginTop: 1,
        width: "100%",
        children: b ? Vm.jsx(pPo, {
          status: b,
          columns: m
        }) : Vm.jsxs(Vm.Fragment, {
          children: [Vm.jsx(J1e, {
            frame: z,
            messageColor: s,
            stalledIntensity: a ? 0 : U,
            thinkingIntensity: a ? 0 : be,
            reducedMotion: t,
            time: E
          }), Vm.jsx(pKt, {
            message: o,
            mode: e,
            messageColor: s,
            glimmerIndex: Z,
            flashOpacity: ne,
            shimmerColor: i,
            stalledIntensity: a ? 0 : U,
            thinkingIntensity: a ? 0 : be
          }), Sn]
        })
      }), Ge && ke !== null && Vm.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginLeft: 2,
        width: "100%",
        children: [Vm.jsx(e9, {
          ratio: ke / 100,
          width: Ue,
          variant: "pill"
        }), Vm.jsx(Text, {
          dimColor: true,
          children: Ie
        })]
      })]
    });
  }
  function pPo(e) {
    let t = dPo.c(23);
    let {
      status: n,
      columns: r
    } = e;
    let o = Math.max(0, Math.ceil((n.deadline - Date.now()) / 1000)) * 1000;
    let s = o >= 300000;
    let i;
    if (t[0] !== o || t[1] !== s) {
      i = formatDuration(o, {
        mostSignificantOnly: s
      });
      t[0] = o;
      t[1] = s;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      l = Vm.jsx(gXd, {
        "aria-hidden": true,
        flexWrap: "wrap",
        height: 1,
        width: 2,
        children: Vm.jsx(Text, {
          color: "error",
          children: "\u273B"
        })
      });
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = l;
    if (n.kind === "stalled") {
      let x;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        x = Vm.jsx(Text, {
          color: "error",
          children: "Waiting for API response"
        });
        t[4] = x;
      } else {
        x = t[4];
      }
      let A;
      if (t[5] !== a) {
        A = Vm.jsxs(Vm.Fragment, {
          children: [c, Vm.jsxs(gXd, {
            flexShrink: 1,
            children: [x, Vm.jsxs(Text, {
              dimColor: true,
              children: [" \xB7 will retry in ", a, " \xB7 check your network"]
            })]
          })]
        });
        t[5] = a;
        t[6] = A;
      } else {
        A = t[6];
      }
      return A;
    }
    let u = n.error.rateLimits;
    let d;
    if (t[7] !== u) {
      d = u?.resetsAt ? ` (${formatResetTime(u.resetsAt)})` : "";
      t[7] = u;
      t[8] = d;
    } else {
      d = t[8];
    }
    let m = ` \xB7 Retrying in ${a}${d} \xB7 attempt ${n.attempt}/${n.maxRetries}`;
    let f = n.attempt >= Math.min(3, n.maxRetries) || n.error.isNetworkDown || n.error.connection?.isSSLError || u;
    let h;
    if (t[9] !== u || t[10] !== f || t[11] !== n.error.formatted) {
      let x = u?.rateLimitType ? Aha(u.rateLimitType) : "usage limit";
      h = !f ? "API error" : u ? `${x[0]?.toUpperCase()}${x.slice(1)} reached` : n.error.formatted;
      t[9] = u;
      t[10] = f;
      t[11] = n.error.formatted;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g = h;
    let y = Math.max(10, r - 2 - an(m) - 2);
    let _;
    if (t[13] !== y || t[14] !== g) {
      _ = truncateToWidth(g, y);
      t[13] = y;
      t[14] = g;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b = _;
    let S;
    if (t[16] !== b) {
      S = Vm.jsx(Text, {
        color: "error",
        children: b
      });
      t[16] = b;
      t[17] = S;
    } else {
      S = t[17];
    }
    let E;
    if (t[18] !== m) {
      E = Vm.jsx(Text, {
        dimColor: true,
        children: m
      });
      t[18] = m;
      t[19] = E;
    } else {
      E = t[19];
    }
    let C;
    if (t[20] !== S || t[21] !== E) {
      C = Vm.jsxs(Vm.Fragment, {
        children: [c, Vm.jsxs(gXd, {
          flexShrink: 1,
          children: [S, E]
        })]
      });
      t[20] = S;
      t[21] = E;
      t[22] = C;
    } else {
      C = t[22];
    }
    return C;
  }
  function igm(e) {
    let t = dPo.c(2);
    let {
      mode: n
    } = e;
    switch (n) {
      case "tool-input":
      case "tool-use":
      case "responding":
      case "thinking":
        {
          let r;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            r = Vm.jsx(gXd, {
              width: 2,
              children: Vm.jsx(Text, {
                "aria-hidden": true,
                dimColor: true,
                children: vGd.arrowDown
              })
            });
            t[0] = r;
          } else {
            r = t[0];
          }
          return r;
        }
      case "requesting":
        {
          let r;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            r = Vm.jsx(gXd, {
              width: 2,
              children: Vm.jsx(Text, {
                "aria-hidden": true,
                dimColor: true,
                children: vGd.arrowUp
              })
            });
            t[1] = r;
          } else {
            r = t[1];
          }
          return r;
        }
    }
  }
  var dPo;
  var bse;
  var Vm;
  var qhm;
  var Aml;
  var zhm;
  var Yhm;
  var Jhm;
  var mPo = __lazy(() => {
    wl();
    bc();
    et();
    Ot();
    pU();
    cs();
    dI();
    Ai();
    LMe();
    AJn();
    mKt();
    uPo();
    Ore();
    dPo = __toESM(pt(), 1);
    bse = __toESM(ot(), 1);
    Vm = __toESM(ie(), 1);
    qhm = an(" \xB7 ");
    Aml = an("thinking");
    zhm = [1e4, 45000, 300000];
    Yhm = {
      r: 153,
      g: 153,
      b: 153
    };
    Jhm = {
      r: 185,
      g: 185,
      b: 185
    };
  });
  function Nml(e) {
    let t = gKt.c(15);
    let {
      mode: n,
      overrideMessage: r,
      overrideColor: o,
      overrideShimmerColor: s,
      isCompacting: i,
      compactingHintText: a,
      compactingStartTime: l,
      turnEffort: c,
      retryStatus: u,
      defaultVerb: d
    } = oGa(e.agentId);
    let p = bt(cgm);
    let m = bt(lgm);
    let f = Me.CLAUDE_CODE_BRIEF;
    if (getUserMsgOptIn() && (f || getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_brief", false)) && p && !m) {
      let g;
      if (t[0] !== n || t[1] !== r) {
        g = Jp.jsx(dgm, {
          mode: n,
          overrideMessage: r
        });
        t[0] = n;
        t[1] = r;
        t[2] = g;
      } else {
        g = t[2];
      }
      return g;
    }
    let h;
    if (t[3] !== a || t[4] !== l || t[5] !== d || t[6] !== i || t[7] !== n || t[8] !== o || t[9] !== r || t[10] !== s || t[11] !== e || t[12] !== u || t[13] !== c) {
      h = Jp.jsx(ugm, {
        ...e,
        mode: n,
        overrideMessage: r,
        overrideColor: o,
        overrideShimmerColor: s,
        isCompacting: i,
        compactingHintText: a,
        compactingStartTime: l,
        turnEffort: c,
        retryStatus: u,
        defaultVerb: d
      });
      t[3] = a;
      t[4] = l;
      t[5] = d;
      t[6] = i;
      t[7] = n;
      t[8] = o;
      t[9] = r;
      t[10] = s;
      t[11] = e;
      t[12] = u;
      t[13] = c;
      t[14] = h;
    } else {
      h = t[14];
    }
    return h;
  }
  function lgm(e) {
    return e.viewingAgentTaskId;
  }
  function cgm(e) {
    return e.isBriefOnly;
  }
  function ugm({
    mode: e,
    loadingStartTimeRef: t,
    totalPausedMsRef: n,
    pauseStartTimeRef: r,
    responseLengthRef: o,
    overrideColor: s,
    overrideShimmerColor: i,
    overrideMessage: a,
    isCompacting: l,
    compactingHintText: c,
    compactingStartTime: u,
    spinnerSuffix: d,
    verbose: p,
    hasActiveTools: m = false,
    turnEffort: f,
    retryStatus: h,
    defaultVerb: g,
    agentId: y
  }) {
    let _ = K_();
    let b = useIsScreenReaderEnabled();
    let S = WC(_.prefersReducedMotion) || b;
    let E = bt(fe => fe.spinnerTip);
    let C = bt(fe => fe.expandedView) === "tasks";
    let {
      columns: x
    } = Sr();
    let A = dKt();
    let [k, I] = QQ.useState(null);
    let O = QQ.useRef(null);
    let M = QQ.useRef([]);
    let L = useClock();
    QQ.useEffect(() => {
      if (e === "thinking") {
        if (O.current === null) {
          for (let fe of M.current) {
            fe();
          }
          M.current = [];
          O.current = Date.now();
          I("thinking");
        }
      } else if (O.current !== null) {
        let fe = Date.now() - O.current;
        let me = Math.max(0, 2000 - fe);
        O.current = null;
        let Te = () => {
          I(fe);
          M.current.push(L.setTimeout(() => I(null), 2000));
        };
        if (me > 0) {
          M.current.push(L.setTimeout(Te, me));
        } else {
          Te();
        }
      }
    }, [e, L]);
    QQ.useEffect(() => () => {
      for (let fe of M.current) {
        fe();
      }
      M.current = [];
    }, []);
    let P = y === undefined || y === mainAgentId();
    let F = P ? A?.find(fe => fe.status !== "pending" && fe.status !== "completed") : undefined;
    let H = P ? _gm(A) : undefined;
    let [U] = QQ.useState(() => yWp(Lht()));
    let N = (a ?? F?.activeForm ?? F?.subject ?? (g || U)) + "\u2026";
    QQ.useEffect(() => {
      let fe = "spinner-" + e;
      XQ.startCLIActivity(fe);
      return () => {
        XQ.endCLIActivity(fe);
      };
    }, [e]);
    let W = bt(fe => fe.effortValue);
    let j = tlt(getMainLoopModel(), f ?? W);
    let z = r.current !== null ? r.current - t.current - n.current : Date.now() - t.current - n.current;
    let V = "claude";
    let K = "claudeShimmer";
    let J = s ?? V;
    let Q = i ?? K;
    let Z = getFeatureValue_CACHED_MAY_BE_STALE("tengu_shining_fractals", false);
    let ne = false;
    let oe = false;
    ne = lKt();
    oe = Boolean(process.env.CLAUDE_CODE_FORCE_TIP_ID);
    let ee = _.spinnerTipsEnabled !== false;
    let re = ee && z > 1800000;
    let se = ee && z > 30000 && !getGlobalConfig().btwUseCount;
    let ae = oe ? E : G1e(_.spinnerTipsOverride) ? E : ne ? undefined : re && !H ? "Use /clear to start fresh when switching topics and free up context" : se && !H ? "Use /btw to ask a quick side question without interrupting Claude's current work" : E;
    let de = null;
    let be;
    if (h?.kind === "retrying") {
      let fe = h.error.status === 529 || h.error.formatted.toLowerCase().includes("overload");
      let me = h.attempt >= Math.min(3, h.maxRetries);
      if (fe && me) {
        be = k$n().trim();
      }
    }
    return Jp.jsxs(gXd, {
      flexDirection: "column",
      width: "100%",
      alignItems: "flex-start",
      children: [Jp.jsx(Oml, {
        mode: e,
        reducedMotion: S,
        hasActiveTools: m,
        responseLengthRef: o,
        message: N,
        messageColor: J,
        shimmerColor: Q,
        overrideColor: s,
        loadingStartTimeRef: t,
        totalPausedMsRef: n,
        pauseStartTimeRef: r,
        spinnerSuffix: d,
        verbose: p,
        columns: x,
        thinkingStatus: k,
        effortSuffix: j,
        isCompacting: l,
        compactingStartTime: u,
        showToolCallTimer: Z,
        retryStatus: h
      }), P && C && A && A.length > 0 ? Jp.jsx(gXd, {
        width: "100%",
        flexDirection: "column",
        children: Jp.jsx(Vn, {
          children: Jp.jsx(RJn, {
            tasks: A
          })
        })
      }) : l && c ? Jp.jsx(gXd, {
        width: "100%",
        flexDirection: "column",
        children: Jp.jsx(Vn, {
          children: Jp.jsx(Text, {
            dimColor: true,
            children: c
          })
        })
      }) : h ? be ? Jp.jsx(gXd, {
        width: "100%",
        flexDirection: "column",
        children: Jp.jsx(Vn, {
          children: Jp.jsx(Text, {
            dimColor: true,
            children: be
          })
        })
      }) : null : H || ae || de ? Jp.jsxs(gXd, {
        width: "100%",
        flexDirection: "column",
        children: [de && Jp.jsx(Vn, {
          children: Jp.jsx(Text, {
            dimColor: true,
            children: de
          })
        }), (H || ae) && Jp.jsx(Vn, {
          children: Jp.jsx(Text, {
            dimColor: true,
            children: H ? `Next: ${H.subject}` : `Tip: ${ae}`
          })
        })]
      }) : null]
    });
  }
  function dgm(e) {
    let t = gKt.c(34);
    let {
      mode: n,
      overrideMessage: r
    } = e;
    let o = K_();
    let s = useIsScreenReaderEnabled();
    let i;
    if (t[0] !== s || t[1] !== o.prefersReducedMotion) {
      i = WC(o.prefersReducedMotion) || s;
      t[0] = s;
      t[1] = o.prefersReducedMotion;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let [l] = QQ.useState(fgm);
    let c = r ?? l;
    let u = bt(mgm);
    let d;
    let p;
    if (t[3] !== n) {
      d = () => {
        let N = "spinner-" + n;
        XQ.startCLIActivity(N);
        return () => {
          XQ.endCLIActivity(N);
        };
      };
      p = [n];
      t[3] = n;
      t[4] = d;
      t[5] = p;
    } else {
      d = t[4];
      p = t[5];
    }
    QQ.useEffect(d, p);
    let [, m] = useAnimationFrame(a ? null : 120);
    let f = bt(pgm);
    let h = u === "reconnecting" || u === "disconnected";
    let g = u === "reconnecting" ? "Reconnecting" : "Disconnected";
    let y = Math.floor(m / 300) % 3;
    let _;
    if (t[6] !== y || t[7] !== a) {
      _ = a ? "\u2026  " : ".".repeat(y + 1).padEnd(3);
      t[6] = y;
      t[7] = a;
      t[8] = _;
    } else {
      _ = t[8];
    }
    let b = _;
    let S;
    if (t[9] !== c) {
      S = an(c);
      t[9] = c;
      t[10] = S;
    } else {
      S = t[10];
    }
    let E = S;
    let C;
    if (t[11] !== a || t[12] !== h || t[13] !== m || t[14] !== c || t[15] !== E) {
      let N = a || h ? -100 : kpl(Math.floor(m / 150), E);
      C = uJn(c, N);
      t[11] = a;
      t[12] = h;
      t[13] = m;
      t[14] = c;
      t[15] = E;
      t[16] = C;
    } else {
      C = t[16];
    }
    let {
      before: x,
      shimmer: A,
      after: k
    } = C;
    let {
      columns: I
    } = Sr();
    let O = f > 0 ? `${f} in background` : "";
    let M;
    if (t[17] !== g || t[18] !== h || t[19] !== E) {
      M = h ? an(g) : E;
      t[17] = g;
      t[18] = h;
      t[19] = E;
      t[20] = M;
    } else {
      M = t[20];
    }
    let L = M + 3;
    let P = Math.max(1, I - 2 - L - an(O));
    let F;
    if (t[21] !== k || t[22] !== x || t[23] !== g || t[24] !== b || t[25] !== A || t[26] !== h) {
      F = h ? Jp.jsx(Text, {
        color: "error",
        children: g + b
      }) : Jp.jsxs(Jp.Fragment, {
        children: [x ? Jp.jsx(Text, {
          dimColor: true,
          children: x
        }) : null, A ? Jp.jsx(Text, {
          children: A
        }) : null, k ? Jp.jsx(Text, {
          dimColor: true,
          children: k
        }) : null, Jp.jsx(Text, {
          dimColor: true,
          children: b
        })]
      });
      t[21] = k;
      t[22] = x;
      t[23] = g;
      t[24] = b;
      t[25] = A;
      t[26] = h;
      t[27] = F;
    } else {
      F = t[27];
    }
    let H;
    if (t[28] !== P || t[29] !== O) {
      H = O ? Jp.jsxs(Jp.Fragment, {
        children: [Jp.jsx(Text, {
          children: " ".repeat(P)
        }), Jp.jsx(Text, {
          color: "subtle",
          children: O
        })]
      }) : null;
      t[28] = P;
      t[29] = O;
      t[30] = H;
    } else {
      H = t[30];
    }
    let U;
    if (t[31] !== F || t[32] !== H) {
      U = Jp.jsxs(gXd, {
        flexDirection: "row",
        width: "100%",
        marginTop: 1,
        paddingLeft: 2,
        children: [F, H]
      });
      t[31] = F;
      t[32] = H;
      t[33] = U;
    } else {
      U = t[33];
    }
    return U;
  }
  function pgm(e) {
    return Bn(Object.values(e.tasks), kv) + e.remoteBackgroundTaskCount;
  }
  function mgm(e) {
    return e.remoteConnectionStatus;
  }
  function fgm() {
    return yWp(Lht()) ?? "Working";
  }
  function Lml() {
    let e = gKt.c(9);
    let t = bt(ggm);
    let n = bt(hgm);
    let {
      columns: r
    } = Sr();
    let i = t === "reconnecting" || t === "disconnected" ? t === "reconnecting" ? "Reconnecting\u2026" : "Disconnected" : "";
    let a = n > 0 ? `${n} in background` : "";
    if (!i && !a) {
      let p;
      if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
        p = Jp.jsx(gXd, {
          height: 2
        });
        e[0] = p;
      } else {
        p = e[0];
      }
      return p;
    }
    let l = Math.max(1, r - 2 - an(i) - an(a));
    let c;
    if (e[1] !== i) {
      c = i ? Jp.jsx(Text, {
        color: "error",
        children: i
      }) : null;
      e[1] = i;
      e[2] = c;
    } else {
      c = e[2];
    }
    let u;
    if (e[3] !== l || e[4] !== a) {
      u = a ? Jp.jsxs(Jp.Fragment, {
        children: [Jp.jsx(Text, {
          children: " ".repeat(l)
        }), Jp.jsx(Text, {
          color: "subtle",
          children: a
        })]
      }) : null;
      e[3] = l;
      e[4] = a;
      e[5] = u;
    } else {
      u = e[5];
    }
    let d;
    if (e[6] !== c || e[7] !== u) {
      d = Jp.jsx(gXd, {
        marginTop: 1,
        paddingLeft: 2,
        children: Jp.jsxs(Text, {
          children: [c, u]
        })
      });
      e[6] = c;
      e[7] = u;
      e[8] = d;
    } else {
      d = e[8];
    }
    return d;
  }
  function hgm(e) {
    return Bn(Object.values(e.tasks), kv) + e.remoteBackgroundTaskCount;
  }
  function ggm(e) {
    return e.remoteConnectionStatus;
  }
  function Ed() {
    let e = gKt.c(8);
    let t = useIsScreenReaderEnabled();
    let n = WC(fw(ygm)) || t;
    let [r, o] = useAnimationFrame(n ? null : 120);
    if (n) {
      let c;
      if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
        c = Jp.jsx(Text, {
          color: "text",
          children: "\u25CF"
        });
        e[0] = c;
      } else {
        c = e[0];
      }
      let u;
      if (e[1] !== r) {
        u = Jp.jsx(gXd, {
          ref: r,
          "aria-hidden": true,
          flexWrap: "wrap",
          height: 1,
          width: 2,
          children: c
        });
        e[1] = r;
        e[2] = u;
      } else {
        u = e[2];
      }
      return u;
    }
    let s = Math.floor(o / 120) % Mml.length;
    let i = Mml[s];
    let a;
    if (e[3] !== i) {
      a = Jp.jsx(Text, {
        color: "text",
        children: i
      });
      e[3] = i;
      e[4] = a;
    } else {
      a = e[4];
    }
    let l;
    if (e[5] !== r || e[6] !== a) {
      l = Jp.jsx(gXd, {
        ref: r,
        "aria-hidden": true,
        flexWrap: "wrap",
        height: 1,
        width: 2,
        children: a
      });
      e[5] = r;
      e[6] = a;
      e[7] = l;
    } else {
      l = e[7];
    }
    return l;
  }
  function ygm(e) {
    return e.settings.prefersReducedMotion;
  }
  function Fml({
    entries: e,
    responseLength: t,
    event: n
  }) {
    if (n.type === "start") {
      e.push({
        id: n.id,
        ttftMs: n.ttftMs,
        firstTokenTime: Date.now(),
        lastTokenTime: Date.now(),
        responseLengthBaseline: t,
        endResponseLength: t
      });
      return t;
    }
    let r = n.id != null ? e.find(o => o.id === n.id) : e.findLast(o => o.id == null);
    if (!r) {
      return t;
    }
    if (n.type === "content_block_start") {
      r.thinkingTokenEstimate = 0;
      r.thinkingBlockBaseline = t;
      r.sawEstimatedTokensThisBlock = false;
      return t;
    }
    if (n.type === "thinking_progress") {
      if (r.sawEstimatedTokensThisBlock = true, r.thinkingTokenEstimate = (r.thinkingTokenEstimate ?? 0) + n.estimatedTokensDelta, r.outputTokens == null && n.id == null) {
        let o = r.thinkingBlockBaseline ?? r.responseLengthBaseline;
        return Math.max(t, o + r.thinkingTokenEstimate * 4);
      }
      return t;
    }
    if (n.type === "thinking_signature") {
      if (n.chars > 0 && r.outputTokens == null) {
        if (r.lastTokenTime = Date.now(), r.sawEstimatedTokensThisBlock) {
          r.thinkingTokenEstimate = Math.max(r.thinkingTokenEstimate ?? 0, Math.ceil(n.chars / 4));
          let s = r.thinkingBlockBaseline ?? r.responseLengthBaseline;
          let i = Math.max(t, s + r.thinkingTokenEstimate * 4);
          r.endResponseLength = i;
          return i;
        }
        let o = t + n.chars;
        r.endResponseLength = o;
        return o;
      }
      return t;
    }
    if (r.outputTokens = n.outputTokens, r.lastTokenTime = Date.now(), n.id == null) {
      return Math.max(t, r.responseLengthBaseline + n.outputTokens * 4);
    }
    return t;
  }
  function _gm(e) {
    if (!e) {
      return;
    }
    let t = e.filter(r => r.status === "pending");
    if (t.length === 0) {
      return;
    }
    let n = new Set(e.filter(r => r.status !== "completed").map(r => r.id));
    return t.find(r => !r.blockedBy.some(o => n.vZc(o))) ?? t[0];
  }
  var gKt;
  var QQ;
  var Jp;
  var Dml;
  var Mml;
  var cA = __lazy(() => {
    et();
    yse();
    at();
    $n();
    pr();
    Dre();
    iPo();
    cs();
    wJn();
    VEo();
    Wl();
    lPo();
    kJn();
    ho();
    ki();
    bc();
    vO();
    vml();
    vpe();
    mPo();
    Qq();
    Fp();
    Eo();
    at();
    et();
    gKt = __toESM(pt(), 1);
    QQ = __toESM(ot(), 1);
    Jp = __toESM(ie(), 1);
    Dml = bSe();
    Mml = [...Dml, ...[...Dml].reverse()];
  });
  function fPo(e) {
    let t = $le(e);
    let n = r => {
      let o = xa[r].bedrock;
      if (o === null) {
        throw Error("A DEFAULT_3P_*_KEY points at a model config with bedrock: null \u2014 Bedrock setup has no fallback id for that tier");
      }
      return {
        needle: xa[r].firstParty,
        fallback: ZAe(o, t)
      };
    };
    return {
      sonnet: n("sonnet45"),
      opus: n("opus46"),
      haiku: n("haiku45"),
      fable: n("fable5")
    };
  }
  async function Uml(e) {
    if (e.authMethod === "bearer") {
      return Tgm(e);
    }
    try {
      let t = await Bml(e);
      let r = {
        ...(await getAWSClientProxyConfig({
          url: `https://bedrock.${e.region}.amazonaws.com`
        })),
        region: e.region,
        ...(t && {
          credentials: t
        })