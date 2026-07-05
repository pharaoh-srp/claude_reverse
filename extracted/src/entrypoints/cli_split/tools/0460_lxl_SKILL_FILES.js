  __export(EMc, {
    lxl: () => JDc,
    SKILL_FILES: () => SKILL_FILES_export2
  });
  var wA = e => typeof e === "string" ? e : e.default;
  var jDf;
  var qDf;
  var WDf;
  var GDf;
  var VDf;
  var zDf;
  var KDf;
  var YDf;
  var JDf;
  var XDf;
  var QDf;
  var ZDf;
  var eMf;
  var tMf;
  var nMf;
  var rMf;
  var oMf;
  var sMf;
  var iMf;
  var aMf;
  var lMf;
  var cMf;
  var uMf;
  var SKILL_FILES_export2;
  function wMc() {
    return mMf ??= Promise.resolve().then(() => (vMc(), EMc));
  }
  function CMc() {
    Qc({
      name: "design-sync",
      menuDescription: "Push your design system components to claude.ai/design",
      description: 'Push a React design system to claude.ai/design. This runs a converter that bundles the real component code (from Storybook or a bare package) and uploads it. Use when the user runs /design-sync or says "sync my design system to Claude Design".',
      isEnabled: pFe,
      argumentHint: '[<project hint, e.g. "Acme DS">]',
      disableModelInvocation: true,
      userInvocable: true,
      files: () => wMc().then(e => e.SKILL_FILES),
      async getPromptForCommand(e) {
        let {
          lxl: t
        } = await wMc();
        let n = [sf(t).content.trimStart()];
        if (e?.trim()) {
          n.push(`## Hint

\`\`\`
${e.trim()}
\`\`\``);
        }
        return [{
          type: "text",
          text: n.join(`

`)
        }];
      }
    });
  }
  var mMf;
  var RMc = __lazy(() => {
    NJt();
    fv();
    x_();
  });
  function hMf() {
    return '# Fewer Permission Prompts\n\nLook through my transcripts\' MCP and bash tool calls, and based on those, make a prioritized list of patterns that I should add to my permission allowlist to reduce permission prompts. Focus on read-only commands.\n\nThe format for permissions is: `Bash(foo*)`, `Bash(foo)`, `Bash(foo bar *)`, `mcp__slack__slack_read_thread`, etc.\n\nThen, add these to the project `.claude/settings.json` under `permissions.allow`.\n\n## Steps\n\n1. **Locate transcripts.** Session transcripts live at `~/.claude/projects/<sanitized-cwd>/*.jsonl`. Each line is a JSON object. Tool calls appear as `assistant` messages with `message.content[]` entries of `type: "tool_use"`. The `name` field identifies the tool (e.g. `"Bash"`, `"mcp__slack__slack_read_thread"`); for Bash, `input.command` is the shell string.\n\n   Scan the recent transcripts across the user\'s projects dir \u2014 not just the current project \u2014 so the allowlist reflects their actual usage. Cap the scan at a reasonable number of recent sessions (e.g. 50 most-recently-modified JSONL files) so this stays fast.\n\n2. **Extract tool-call frequencies.**\n   - For `Bash` calls: parse `input.command`, take the leading command token (handling `sudo`, `timeout`, pipes, `&&`, env-var prefixes). Record the command + first subcommand pair (e.g. `git status`, `gh pr view`, `ls`, `cat`).\n   - For MCP calls: record the full tool name (e.g. `mcp__slack__slack_read_thread`).\n   - Count occurrences across the scanned transcripts.\n\n3. **Filter to read-only.** Keep only commands that don\'t mutate state. Examples of read-only: `ls`, `cat`, `pwd`, `git status`, `git log`, `git diff`, `git show`, `git branch`, `rg`, `grep`, `find`, `head`, `tail`, `wc`, `file`, `which`, `echo`, `date`, `gh pr view`, `gh pr list`, `gh pr diff`, `gh issue view`, `gh issue list`, `gh run list`, `gh run view`, `gh api` (GET), `bun run typecheck`, `bun run lint`, `bun run test` (for tests that don\'t mutate), `docker ps`, `docker logs`, `kubectl get`, `kubectl describe`, `ps`, `top`, `df`, `du`, `env`, `printenv`, any MCP tool with `read`/`get`/`list`/`search`/`view` in its name.\n\n   Drop anything that writes, deletes, renames, pushes, merges, installs, or runs a build/test that has side effects. When in doubt, leave it out.\n\n   **Never allowlist a pattern that grants arbitrary code execution.** A wildcard rule for any of these (e.g. `Bash(python3:*)`) is equivalent to allowing arbitrary code execution. This list is not exhaustive \u2014 apply the same rule to anything in the same category:\n   - Interpreters: `python`/`python3`, `node`, `bun`, `deno`, `ruby`, `perl`, `php`, `lua`, etc.\n   - Shells: `bash`, `sh`, `zsh`, `fish`, `eval`, `exec`, `ssh`, etc.\n   - Package runners: `npx`, `bunx`, `uvx`, `uv run`, etc.\n   - Task-runner wildcards: `npm run *`, `yarn run *`, `pnpm run *`, `bun run *`, `make *`, `just *`, `cargo run *`, `go run *`, etc. \u2014 an exact `Bash(bun run typecheck)` is fine, `Bash(bun run *)` is not\n   - `gh api *`, `docker run`/`exec`, `kubectl exec`, `sudo`, and similar\n\n4. **Drop commands Claude Code already auto-allows.** These don\'t need an allowlist entry \u2014 they never prompt. If you see any of these in the transcripts, skip them; don\'t suggest them to the user.\n\n   - **Always auto-allowed (any args):** `cal`, `uptime`, `cat`, `head`, `tail`, `wc`, `stat`, `strings`, `hexdump`, `od`, `nl`, `id`, `uname`, `free`, `df`, `du`, `locale`, `groups`, `nproc`, `basename`, `dirname`, `realpath`, `cut`, `paste`, `tr`, `column`, `tac`, `rev`, `fold`, `expand`, `unexpand`, `fmt`, `comm`, `cmp`, `numfmt`, `readlink`, `diff`, `true`, `false`, `sleep`, `which`, `type`, `expr`, `seq`, `tsort`, `pr`, `echo`, `ls`, `cd`.\n   - **Auto-allowed with zero args only:** `pwd`, `whoami`, `alias`.\n   - **Auto-allowed exact forms:** `claude -h`, `claude --help`, `node -v`, `node --version`, `python --version`, `python3 --version`, `ip addr`.\n   - **Auto-allowed with safe flags only (validated):** `xargs`, `file`, `sed` (read-only expressions), `sort`, `man`, `help`, `netstat`, `ps`, `base64`, `grep`, `egrep`, `fgrep`, `sha256sum`, `sha1sum`, `md5sum`, `tree`, `date`, `hostname`, `lsof`, `pgrep`, `tput`, `ss`, `fd`, `fdfind`, `aki`, `rg`, `jq`, `uniq`, `history`, `arch`, `ifconfig`, `pyright`, `find` (blocks `-delete`/`-exec`/`-execdir`/`-ok`/`-okdir`/`-fprint*`/`-fls`/`-files0-from`), `printf` (blocks any `-flag`), `test` (blocks `-v`/`-R`/`-a`/`-o`).\n   - **All git read-only subcommands:** `git status`, `git log`, `git diff`, `git show`, `git blame`, `git branch`, `git tag`, `git remote`, `git ls-files`, `git ls-remote`, `git config --get`, `git rev-parse`, `git describe`, `git stash list`, `git reflog`, `git shortlog`, `git cat-file`, `git for-each-ref`, `git worktree list`, etc.\n   - **All gh read-only subcommands:** `gh pr view`, `gh pr list`, `gh pr diff`, `gh pr checks`, `gh pr status`, `gh issue view`, `gh issue list`, `gh issue status`, `gh run view`, `gh run list`, `gh workflow list`, `gh workflow view`, `gh repo view`, `gh release view`, `gh release list`, `gh api` (GET), `gh auth status`, etc.\n   - **Docker read-only subcommands:** `docker ps`, `docker images`, `docker logs`, `docker inspect`.\n\n   Source of truth: `src/tools/BashTool/readOnlyValidation.ts` (`READONLY_COMMANDS`, `READONLY_NOARGS`, `READONLY_EXACT`, `COMMAND_ALLOWLIST`) and `src/utils/shell/readOnlyCommandValidation.ts` (`GIT_READ_ONLY_COMMANDS`, `GH_READ_ONLY_COMMANDS`, `DOCKER_READ_ONLY_COMMANDS`, `RIPGREP_READ_ONLY_COMMANDS`, `PYRIGHT_READ_ONLY_COMMANDS`). If the user is in this repo and you\'re unsure whether a command is covered, grep these files rather than guessing.\n\n5. **Pick the pattern form.** Use the narrowest pattern that still covers the observed usage:\n   - If the user runs many variants (`git log`, `git log --oneline`, `git log main..HEAD`): use `Bash(git log *)` \u2014 note the space before `*`, which is required for prefix matching to work correctly.\n   - If a single exact invocation is common: use `Bash(foo)` with no wildcard.\n   - For MCP: use the full tool name verbatim (no wildcard needed; they\'re already specific).\n   - Never widen a pattern to the point that it conflicts with the rules above (no arbitrary code execution, no mutation/side effects).\n\n6. **Prioritize.** Rank by count descending. Drop anything that appeared fewer than ~3 times \u2014 not worth the allowlist entry. Cap the list at the top ~20 so the user can skim it.\n\n7. **Present the prioritized list to the user** as a markdown table with columns: rank, pattern, count, one-line description. Example:\n\n   | # | Pattern | Count | Notes |\n   |---|---------|-------|-------|\n   | 1 | `Bash(git status *)` | 142 | repo status checks |\n   | 2 | `Bash(gh pr view *)` | 87 | PR inspection |\n   | 3 | `mcp__slack__slack_read_thread` | 54 | Slack thread reads |\n\n8. **Merge into `.claude/settings.json`** in the current project (not `~/.claude/settings.json`, not `.claude/settings.local.json`). Create the file if it doesn\'t exist. Preserve existing keys and existing entries in `permissions.allow`; de-duplicate against what\'s already there; don\'t remove anything; don\'t reorder unrelated fields.\n\n9. **Report back.** Tell the user what you added (count + a few examples), what was already in the allowlist, and what you skipped and why (e.g. "dropped `rm` and `git push` \u2014 not read-only; dropped `cat`/`ls`/`git status` \u2014 already auto-allowed, no rule needed").\n\nDo not add anything to `permissions.deny` or `permissions.ask`. Do not touch any other settings field.\n';
  }
  function xMc() {
    Qc({
      name: "fewer-permission-prompts",
      requires: {
        workspace: true
      },
      menuDescription: "Pre-approve safe read-only commands based on your usage",
      description: "Scan your transcripts for common read-only Bash and MCP tool calls, then add a prioritized allowlist to project .claude/settings.json to reduce permission prompts.",
      userInvocable: true,
      async getPromptForCommand(e) {
        let t = hMf();
        if (e) {
          t += `

## Additional instructions from the user

${e}`;
        }
        return [{
          type: "text",
          text: t
        }];
      }
    });
  }
  var kMc = __lazy(() => {
    x_();
  });
  function gMf() {
    return RZo(["Context", "Description"], Nct.map(e => [`\`${e}\``, q7i[e]]));
  }
  function yMf() {
    let e = {};
    for (let t of Mct) {
      for (let [n, r] of Object.entries(t.bindings)) {
        if (r) {
          if (!e[r]) {
            e[r] = {
              keys: [],
              context: t.context
            };
          }
          e[r].keys.push(n);
        }
      }
    }
    return RZo(["Action", "Default Key(s)", "Context"], sro.map(t => {
      let n = e[t];
      let r = n ? n.keys.map(s => `\`${s}\``).join(", ") : "(none)";
      let o = n ? n.context : _Mf(t);
      return [`\`${t}\``, r, o];
    }));
  }
  function _Mf(e) {
    let t = e.split(":")[0];
    return {
      app: "Global",
      history: "Global or Chat",
      chat: "Chat",
      autocomplete: "Autocomplete",
      confirm: "Confirmation",
      tabs: "Tabs",
      transcript: "Transcript",
      historySearch: "HistorySearch",
      task: "Task",
      theme: "ThemePicker",
      help: "Help",
      attachments: "Attachments",
      footer: "Footer",
      messageSelector: "MessageSelector",
      diff: "DiffDialog",
      modelPicker: "ModelPicker",
      select: "Select",
      permission: "Confirmation"
    }[t ?? ""] ?? "Unknown";
  }
  function bMf() {
    let e = [];
    e.push("### Non-rebindable (errors)");
    for (let t of ijt) {
      e.push(`- \`${t.key}\` \u2014 ${t.reason}`);
    }
    e.push("");
    e.push("### Terminal reserved (errors/warnings)");
    for (let t of rro) {
      e.push(`- \`${t.key}\` \u2014 ${t.reason} (${t.severity === "error" ? "will not work" : "may conflict"})`);
    }
    e.push("");
    e.push("### macOS reserved (errors)");
    for (let t of oro) {
      e.push(`- \`${t.key}\` \u2014 ${t.reason}`);
    }
    return e.join(`
`);
  }
  function AMc() {
    Qc({
      name: "keybindings-help",
      description: 'Use when the user wants to customize keyboard shortcuts, rebind keys, add chord bindings, or modify ~/.claude/keybindings.json. Examples: "rebind ctrl+s", "add a chord shortcut", "change the submit key", "customize keybindings".',
      allowedTools: ["Read"],
      userInvocable: false,
      isEnabled: oV,
      async getPromptForCommand(e) {
        let t = gMf();
        let n = yMf();
        let r = bMf();
        let o = [wMf, CMf, RMf, xMf, kMf, AMf, IMf, PMf, `## Reserved Shortcuts

${r}`, `## Available Contexts

${t}`, `## Available Actions

${n}`];
        if (e) {
          o.push(`## User Request

${e}`);
        }
        return [{
          type: "text",
          text: o.join(`

`)
        }];
      }
    });
  }
  function RZo(e, t) {
    let n = e.map(() => "---");
    return [`| ${e.join(" | ")} |`, `| ${n.join(" | ")} |`, ...t.map(r => `| ${r.join(" | ")} |`)].join(`
`);
  }
  var SMf;
  var TMf;
  var EMf;
  var vMf;
  var wMf;
  var CMf;
  var RMf;
  var xMf;
  var kMf;
  var AMf;
  var IMf;
  var PMf;
  var IMc = __lazy(() => {
    A1n();
    xre();
    P1n();
    O1n();
    x_();
    SMf = {
      $schema: "https://www.schemastore.org/claude-code-keybindings.json",
      $docs: "https://code.claude.com/docs/en/keybindings",
      bindings: [{
        context: "Chat",
        bindings: {
          "ctrl+e": "chat:externalEditor"
        }
      }]
    };
    TMf = {
      context: "Chat",
      bindings: {
        "ctrl+s": null
      }
    };
    EMf = {
      context: "Chat",
      bindings: {
        "ctrl+g": null,
        "ctrl+e": "chat:externalEditor"
      }
    };
    vMf = {
      context: "Global",
      bindings: {
        "ctrl+k ctrl+t": "app:toggleTodos"
      }
    };
    wMf = ["# Keybindings Skill", "", "Create or modify `~/.claude/keybindings.json` to customize keyboard shortcuts.", "", "## CRITICAL: Read Before Write", "", "**Always read `~/.claude/keybindings.json` first** (it may not exist yet). Merge changes with existing bindings \u2014 never replace the entire file.", "", "- Use **Edit** tool for modifications to existing files", "- Use **Write** tool only if the file does not exist yet"].join(`
`);
    CMf = ["## File Format", "", "```json", De(SMf, null, 2), "```", "", "Always include the `$schema` and `$docs` fields."].join(`
`);
    RMf = ["## Keystroke Syntax", "", "**Modifiers** (combine with `+`):", "- `ctrl` (alias: `control`)", "- `alt` (aliases: `opt`, `option`) \u2014 note: `alt` and `meta` are identical in terminals", "- `shift`", "- `meta` (aliases: `cmd`, `command`)", "", "**Special keys**: `escape`/`esc`, `enter`/`return`, `tab`, `space`, `backspace`, `delete`, `up`, `down`, `left`, `right`", "", "**Chords**: Space-separated keystrokes, e.g. `ctrl+k ctrl+s` (1-second timeout between keystrokes)", "", "**Examples**: `ctrl+shift+p`, `alt+enter`, `ctrl+k ctrl+n`"].join(`
`);
    xMf = ["## Unbinding Default Shortcuts", "", "Set a key to `null` to remove its default binding:", "", "```json", De(TMf, null, 2), "```"].join(`
`);
    kMf = ["## How User Bindings Interact with Defaults", "", "- User bindings are **additive** \u2014 they are appended after the default bindings", "- To **move** a binding to a different key: unbind the old key (`null`) AND add the new binding", "- A context only needs to appear in the user's file if they want to change something in that context"].join(`
`);
    AMf = ["## Common Patterns", "", "### Rebind a key", "To change the external editor shortcut from `ctrl+g` to `ctrl+e`:", "```json", De(EMf, null, 2), "```", "", "### Add a chord binding", "```json", De(vMf, null, 2), "```"].join(`
`);
    IMf = ["## Behavioral Rules", "", "1. Only include contexts the user wants to change (minimal overrides)", "2. Validate that actions and contexts are from the known lists below", "3. Warn the user proactively if they choose a key that conflicts with reserved shortcuts or common tools like tmux (`ctrl+b`) and screen (`ctrl+a`)", "4. When adding a new binding for an existing action, the new binding is additive (existing default still works unless explicitly unbound)", "5. To fully replace a default binding, unbind the old key AND add the new one"].join(`
`);
    PMf = ["## Validation with /doctor", "", 'The `/doctor` command includes a "Keybinding Configuration Issues" section that validates `~/.claude/keybindings.json`.', "", "### Common Issues and Fixes", "", RZo(["Issue", "Cause", "Fix"], [['`keybindings.json must have a "bindings" array`', "Missing wrapper object", 'Wrap bindings in `{ "bindings": [...] }`'], ['`"bindings" must be an array`', "`bindings` is not an array", 'Set `"bindings"` to an array: `[{ context: ..., bindings: ... }]`'], ['`Unknown context "X"`', "Typo or invalid context name", "Use exact context names from the Available Contexts table"], ['`Duplicate key "X" in Y bindings`', "Same key defined twice in one context", "Remove the duplicate; JSON uses only the last value"], ['`"X" may not work: ...`', "Key conflicts with terminal/OS reserved shortcut", "Choose a different key (see Reserved Shortcuts section)"], ['`Could not parse keystroke "X"`', "Invalid key syntax", "Check syntax: use `+` between modifiers, valid key names"], ['`Invalid action for "X"`', "Action value is not a string or null", 'Actions must be strings like `"app:help"` or `null` to unbind']]), "", "### Example /doctor Output", "", "```", "Keybinding Configuration Issues", "Location: ~/.claude/keybindings.json", '  \u2514 [Error] Unknown context "chat"', "    \u2192 Valid contexts: Global, Chat, Autocomplete, ...", '  \u2514 [Warning] "ctrl+c" may not work: Terminal interrupt (SIGINT)', "```", "", "**Errors** prevent bindings from working and must be fixed. **Warnings** indicate potential conflicts but the binding may still work."].join(`
`);
  });
  function OMc(e) {
    let t = 0;
    let n = "";
    while (t < e) {
      let r = 10 + Math.floor(Math.random() * 11);
      let o = 0;
      for (let s = 0; s < r && t < e; s++) {
        let i = PMc[Math.floor(Math.random() * PMc.length)];
        if (n += i, t++, o++, s === r - 1 || t >= e) {
          n += ". ";
        } else {
          n += " ";
        }
      }
      if (o > 0 && Math.random() < 0.2 && t < e) {
        n += `

`;
      }
    }
    return n.trim();
  }
  function DMc() {
    return;
  }
  var PMc;
  var MMc = __lazy(() => {
    x_();
    PMc = ["the", "a", "an", "I", "you", "he", "she", "it", "we", "they", "me", "him", "her", "us", "them", "my", "your", "his", "its", "our", "this", "that", "what", "who", "is", "are", "was", "were", "be", "been", "have", "has", "had", "do", "does", "did", "will", "would", "can", "could", "may", "might", "must", "shall", "should", "make", "made", "get", "got", "go", "went", "come", "came", "see", "saw", "know", "take", "think", "look", "want", "use", "find", "give", "tell", "work", "call", "try", "ask", "need", "feel", "seem", "leave", "put", "time", "year", "day", "way", "man", "thing", "life", "hand", "part", "place", "case", "point", "fact", "good", "new", "first", "last", "long", "great", "little", "own", "other", "old", "right", "big", "high", "small", "large", "next", "early", "young", "few", "public", "bad", "same", "able", "in", "on", "at", "to", "for", "of", "with", "from", "by", "about", "like", "through", "over", "before", "between", "under", "since", "without", "and", "or", "but", "if", "than", "because", "as", "until", "while", "so", "though", "both", "each", "when", "where", "why", "how", "not", "now", "just", "more", "also", "here", "there", "then", "only", "very", "well", "back", "still", "even", "much", "too", "such", "never", "again", "most", "once", "off", "away", "down", "out", "up", "test", "code", "data", "file", "line", "text", "word", "number", "system", "program", "set", "run", "value", "name", "type", "state", "end", "start"];
  });
  function OMf() {
    return uO() ? P$t : O$t;
  }
  function NMc() {
    Qc({
      name: "memory-types",
      description: "Full reference for the memory type taxonomy \u2014 what each type captures, when to save it, how to structure the body, with examples.",
      whenToUse: "Use before writing a memory file to choose the right `type:` frontmatter value and body structure.",
      userInvocable: false,
      isEnabled: () => Vd() && zQr(),
      async getPromptForCommand() {
        return [{
          type: "text",
          text: OMf().join(`
`)
        }];
      }
    });
  }
  var LMc = __lazy(() => {
    dWe();
    Eb();
    a1();
    x_();
  });
  function FMc() {
    return DMf ??= Promise.resolve().then(() => (fLo(), mLo));
  }
  function UMc() {
    Qc({
      name: "plan-artifact",
      menuDescription: "Publish a plan as a shareable Artifact",
      description: "Create or customize a shareable plan Artifact from an implementation plan, design doc, or RFC. Use when asked to publish a plan as an artifact, restyle or edit a plan artifact, or present a plan as a shareable page.",
      isEnabled: isPlanArtifactEnabled,
      userInvocable: true,
      files: () => FMc().then(e => e.SKILL_FILES),
      async getPromptForCommand(e) {
        let {
          lxl: t
        } = await FMc();
        let n = sf(t).content.trimStart();
        if (e.trim()) {
          n += `

## User Request

${e}`;
        }
        return [{
          type: "text",
          text: n
        }];
      }
    });
  }
  var DMf;
  var BMc = __lazy(() => {
    M1();
    fv();
    x_();
  });
  var NMf;
  var wyv;
  var $Mc = __lazy(() => {
    at();
    uTe();
    v6t();
    na();
    l8e();
    Q6e();
    ZWt();
    Jf();
    NNe();
    x_();
    NMf = ["git status *", "git log *", "git diff *", "git branch *", "git checkout -b *", "git push *", "gh pr create *", "gh pr view *"];
    wyv = NMf.flatMap(e => [`Bash(${e})`, `PowerShell(${e})`]);
  });
  function FMf() {
    return false;
  }
  function BMf(e) {
    return `Explain GitHub pull request \`${e}\`:
1. \`gh pr view ${e} --json title,body,author,baseRefName,headRefName,additions,deletions,changedFiles,labels\` for context
2. \`gh pr diff ${e}\` for the unified diff`;
  }
  function $Mf(e) {
    let [t = "", ...n] = e.trim().split(/\s+/);
    let r = t.replaceAll("`", "").replace(/^#/, "");
    let o = n.join(" ");
    return `${r === "" ? "No PR number was given \u2014 explain the current branch's pending PR:\n1. `git log --oneline @{upstream}..HEAD` for the commit list (fall back to `origin/main..HEAD` if no upstream)\n2. `git diff @{upstream}...HEAD` for the unified diff" : BMf(r)}
${o ? `
Additional guidance from the user: ${o}
` : ""}
## Goal

Produce a **shareable PR walkthrough artifact** \u2014 a self-contained HTML page a
reviewer can read before opening the diff to understand what this change does,
why it's being made, and where to focus attention. Pitch the writing at a
reviewer seeing this PR for the first time.

## Structure of the artifact

Write an HTML file and publish it with the ${"Artifact"} tool. Load
the \`${"artifact-design"}\` skill first and give the page a
utilitarian treatment.

1. **What and why** \u2014 two or three sentences: what this PR changes and the
   reason it's needed. If the PR body already says this well, reuse it.
2. **Before / After** \u2014 a short side-by-side showing the user-observable
   change (behavior, API shape, or output). Skip if the change has no
   observable surface.
3. **Tour of the diff** \u2014 one \`<details>\` block per logical piece of the
   change. Inside each: the relevant code snippet (trimmed), a plain-language
   explanation of what it does, and anything a reviewer should look closely
   at.
4. **What's not obvious from the diff** \u2014 context a reviewer needs that the
   diff alone doesn't show (why this approach over an alternative, what was
   tried and rejected, follow-ups intentionally left out).

End the page body with this line verbatim:

> ${"Paste this URL back into Claude Code to keep iterating on these findings."}

## Keep it honest

Describe what the diff *actually does* \u2014 trace it, don't infer from names. If
something in the PR is unclear to you, say so in section 4 rather than
guessing.
`;
  }
  function HMc() {
    Qc({
      name: "pr-explainer",
      menuDescription: "Generate a shareable walkthrough artifact for a PR",
      description: "Generate a shareable walkthrough artifact for a pull request \u2014 what changed, why, and a reviewer-oriented before/after narrative.",
      argumentHint: "[pr number]",
      isEnabled: FMf,
      userInvocable: true,
      async getPromptForCommand(e) {
        return [{
          type: "text",
          text: $Mf(e)
        }];
      }
    });
  }
  var jMc = __lazy(() => {
    t1();
    M1();
    x_();
    REt();
  });
  function qMc() {
    return;
  }
  var WMc = __lazy(() => {
    Eb();
    x_();
  });
  function GMc() {
    Qc({
      name: "simplify",
      menuDescription: "Clean up the changed code without changing behavior",
      description: "Review the changed code for reuse, simplification, efficiency, and altitude cleanups, then apply the fixes. Quality only \u2014 it does not hunt for bugs; use /code-review for that.",
      argumentHint: "[<target>]",
      userInvocable: true,
      async getPromptForCommand(e) {
        let t = e.trim();
        return [{
          type: "text",
          text: `${t ? `Review target: \`${t}\`

` : ""}${HMf}`
        }];
      }
    });
  }
  var HMf;
  var VMc = __lazy(() => {
    Sh();
    x_();
    HMf = `\`/simplify \u2192 4 cleanup agents in parallel \u2192 apply the fixes\`

You are improving the quality of the changed code, not hunting for bugs. Review
it for reuse, simplification, efficiency, and altitude issues, then fix what you
find. Do not look for correctness bugs \u2014 that is what \`/code-review\` is for.

${"## Phase 0 \u2014 Gather the diff\n\nRun `git diff @{upstream}...HEAD` (or `git diff main...HEAD` / `git diff HEAD~1`\nif there's no upstream) to get the unified diff under review. If there are\nuncommitted changes, or the range diff is empty, also run `git diff HEAD` and\ninclude the working-tree changes in scope \u2014 the review often runs before the\ncommit. If a PR number, branch name, or file path was passed as an argument,\nreview that target instead. Treat this diff as the review scope.\n"}
## Phase 1 \u2014 Review (4 cleanup agents in parallel)

Launch **4 independent review agents** via the ${"Agent"} tool, all in a
single message so they run concurrently. Pass each agent the diff and one of
the four angles below. Each returns its findings with \`file\`, \`line\`, a
one-line \`summary\`, and the concrete cost (what is duplicated, wasted, or
harder to maintain).

### Reuse

${wEt}
${yFe}
${_Fe}
${bFe}
## Phase 2 \u2014 Apply the fixes

Wait for all four agents to complete, dedup findings that point at the same
line or mechanism, and fix each remaining one directly. Skip any finding whose
fix would change intended behavior, require changes well outside the reviewed
diff, or that you judge to be a false positive \u2014 note the skip rather than
arguing with it. Finish with a brief summary of what was fixed and what was
skipped (or confirm the code was already clean).
`;
  });
  function jMf() {
    return `# Skillify {{userDescriptionBlock}}

You are capturing this session's repeatable process as a reusable skill.

Review the conversation above \u2014 it is your source material. Pay particular attention to the user's messages (how they steered and corrected the process) and the tools/commands that were actually used.

## Your Task

### Step 1: Analyze the Session

Before asking any questions, analyze the session to identify:
- What repeatable process was performed
- What the inputs/parameters were
- The distinct steps (in order)
- The success artifacts/criteria (e.g. not just "writing code," but "an open PR with CI fully passing") for each step
- Where the user corrected or steered you
- What tools and permissions were needed
- What agents were used
- What the goals and success artifacts were

### Step 2: Interview the User

You will use the AskUserQuestion to understand what the user wants to automate. Important notes:
- Use AskUserQuestion for ALL questions! Never ask questions via plain text.
- For each round, iterate as much as needed until the user is happy.
- The user always has a freeform "Other" option to type edits or feedback -- do NOT add your own "Needs tweaking" or "I'll provide edits" option. Just offer the substantive choices.

**Round 1: High level confirmation**
- Suggest a name and description for the skill based on your analysis. Ask the user to confirm or rename.
- Suggest high-level goal(s) and specific success criteria for the skill.

**Round 2: More details**
- Present the high-level steps you identified as a numbered list. Tell the user you will dig into the detail in the next round.
- If you think the skill will require arguments, suggest arguments based on what you observed. Make sure you understand what someone would need to provide.
- If it's not clear, ask if this skill should run inline (in the current conversation) or forked (as a sub-agent with its own context). Forked is better for self-contained tasks that don't need mid-process user input; inline is better when the user wants to steer mid-process.
- Ask where the skill should be saved. Suggest a default based on context (repo-specific workflows \u2192 repo, cross-repo personal workflows \u2192 user). Options:
  - **This repo** (\`.claude/skills/<name>/SKILL.md\`) \u2014 for workflows specific to this project
  - **Personal** (\`~/.claude/skills/<name>/SKILL.md\`) \u2014 follows you across all repos

**Round 3: Breaking down each step**
For each major step, if it's not glaringly obvious, ask:
- What does this step produce that later steps need? (data, artifacts, IDs)
- What proves that this step succeeded, and that we can move on?
- Should the user be asked to confirm before proceeding? (especially for irreversible actions like merging, sending messages, or destructive operations)
- Are any steps independent and could run in parallel? (e.g., posting to Slack and monitoring CI at the same time)
- How should the skill be executed? (e.g. always use a Task agent to conduct code review, or invoke an agent team for a set of concurrent steps)
- What are the hard constraints or hard preferences? Things that must or must not happen?

You may do multiple rounds of AskUserQuestion here, one round per step, especially if there are more than 3 steps or many clarification questions. Iterate as much as needed.

IMPORTANT: Pay special attention to places where the user corrected you during the session, to help inform your design.

**Round 4: Final questions**
- Confirm when this skill should be invoked, and suggest/confirm trigger phrases too. (e.g. For a cherrypick workflow you could say: Use when the user wants to cherry-pick a PR to a release branch. Examples: 'cherry-pick to release', 'CP this PR', 'hotfix.')
- You can also ask for any other gotchas or things to watch out for, if it's still unclear.

Stop interviewing once you have enough information. IMPORTANT: Don't over-ask for simple processes!

### Step 3: Write the SKILL.md

Create the skill directory and file at the location the user chose in Round 2.

Use this format:

\`\`\`markdown
---
name: {{skill-name}}
description: {{one-line description}}
allowed-tools:
  {{list of tool permission patterns observed during session}}
when_to_use: {{detailed description of when Claude should automatically invoke this skill, including trigger phrases and example user messages}}
argument-hint: "{{hint showing argument placeholders}}"
arguments:
  {{list of argument names}}
context: {{inline or fork -- omit for inline}}
---

# {{Skill Title}}
Description of skill

## Inputs
- \`$arg_name\`: Description of this input

## Goal
Clearly stated goal for this workflow. Best if you have clearly defined artifacts or criteria for completion.

## Steps

### 1. Step Name
What to do in this step. Be specific and actionable. Include commands when appropriate.

**Success criteria**: ALWAYS include this! This shows that the step is done and we can move on. Can be a list.

IMPORTANT: see the next section below for the per-step annotations you can optionally include for each step.

...
\`\`\`

**Per-step annotations**:
- **Success criteria** is REQUIRED on every step. This helps the model understand what the user expects from their workflow, and when it should have the confidence to move on.
- **Execution**: \`Direct\` (default), \`Task agent\` (straightforward subagents), \`Teammate\` (agent with true parallelism and inter-agent communication), or \`[human]\` (user does it). Only needs specifying if not Direct.
- **Artifacts**: Data this step produces that later steps need (e.g., PR number, commit SHA). Only include if later steps depend on it.
- **Human checkpoint**: When to pause and ask the user before proceeding. Include for irreversible actions (merging, sending messages), error judgment (merge conflicts), or output review.
- **Rules**: Hard rules for the workflow. User corrections during the reference session can be especially useful here.

**Step structure tips:**
- Steps that can run concurrently use sub-numbers: 3a, 3b
- Steps requiring the user to act get \`[human]\` in the title
- Keep simple skills simple -- a 2-step skill doesn't need annotations on every step

**Frontmatter rules:**
- \`allowed-tools\`: Minimum permissions needed (use patterns like \`Bash(gh *)\` not \`Bash\`)
- \`context\`: Only set \`context: fork\` for self-contained skills that don't need mid-process user input.
- \`when_to_use\` is CRITICAL -- tells the model when to auto-invoke. Start with "Use when..." and include trigger phrases. Example: "Use when the user wants to cherry-pick a PR to a release branch. Examples: 'cherry-pick to release', 'CP this PR', 'hotfix'."
- \`arguments\` and \`argument-hint\`: Only include if the skill takes parameters. Use \`$name\` in the body for substitution.

### Step 4: Confirm and Save

Before writing the file, output the complete SKILL.md content as a yaml code block in your response so the user can review it with proper syntax highlighting. Then ask for confirmation using AskUserQuestion with a simple question like "Does this SKILL.md look good to save?" \u2014 do NOT use the body field, keep the question concise.

After writing, tell the user:
- Where the skill was saved
- How to invoke it: \`/{{skill-name}} [arguments]\`
- That they can edit the SKILL.md directly to refine it
`;
  }
  function zMc() {
    return;
  }
  var KMc = __lazy(() => {
    x_();
  });
  function YMc() {
    return;
  }
  var JMc = __lazy(() => {
    x_();
  });
  function WMf() {
    let e = toJSONSchema($N(), {
      io: "input"
    });
    return De(e, null, 2);
  }
  function ZMc() {
    Qc({
      name: "update-config",
      menuDescription: "Change settings: hooks, permissions, environment variables",
      description: 'Use this skill to configure the Claude Code harness via settings.json. Automated behaviors ("from now on when X", "each time X", "whenever X", "before/after X") require hooks configured in settings.json - the harness executes these, not Claude, so memory/preferences cannot fulfill them. Also use for: permissions ("allow X", "add permission", "move permission to"), env vars ("set X=Y"), hook troubleshooting, or any changes to settings.json/settings.local.json files. Examples: "allow npm commands", "add bq permission to global settings", "move permission to user settings", "set DEBUG=true", "when claude stops show X". For simple settings like theme/model, suggest the /config command.',
      allowedTools: ["Read"],
      userInvocable: true,
      async getPromptForCommand(e) {
        if (e.startsWith("[hooks-only]")) {
          let r = e.slice(12).trim();
          let o = XMc + `

` + QMc;
          if (r) {
            o += `

## Task

${r}`;
          }
          return [{
            type: "text",
            text: o
          }];
        }
        let t = WMf();
        let n = VMf;
        if (n += `

## Full Settings JSON Schema

\`\`\`json
${t}
\`\`\``, e) {
          n += `

## User Request

${e}`;
        }
        return [{
          type: "text",
          text: n
        }];
      }
    });
  }
  var GMf = `## Settings File Locations

Choose the appropriate file based on scope:

| File | Scope | Git | Use For |
|------|-------|-----|---------|
| \`~/.claude/settings.json\` | Global | N/A | Personal preferences for all projects |
| \`.claude/settings.json\` | Project | Commit | Team-wide hooks, permissions, plugins |
| \`.claude/settings.local.json\` | Project | Gitignore | Personal overrides for this project |

Settings load in order: user \u2192 project \u2192 local (later overrides earlier).

## Settings Schema Reference

### Permissions
\`\`\`json
{
  "permissions": {
    "allow": ["Bash(npm *)", "Edit(.claude)", "Read"],
    "deny": ["Bash(rm -rf *)"],
    "ask": ["Write(/etc/*)"],
    "defaultMode": "default" | "plan" | "acceptEdits" | "dontAsk",
    "additionalDirectories": ["/extra/dir"]
  }
}
\`\`\`

**Permission Rule Syntax:**
- Exact match: \`"Bash(npm run test)"\`
- Prefix wildcard: \`"Bash(git *)"\` - matches \`git\`, \`git status\`, \`git commit\`, etc.
- Tool only: \`"Read"\` - allows all Read operations

### Environment Variables
\`\`\`json
{
  "env": {
    "DEBUG": "true",
    "MY_API_KEY": "value"
  }
}
\`\`\`

### Model & Agent
\`\`\`json
{
  "model": "sonnet",  // or "fable", "opus", "haiku", full model ID
  "agent": "agent-name",
  "alwaysThinkingEnabled": true
}
\`\`\`

### Attribution (Commits & PRs)
\`\`\`json
{
  "attribution": {
    "commit": "Custom commit trailer text",
    "pr": "Custom PR description text"
  }
}
\`\`\`
Set \`commit\` or \`pr\` to empty string \`""\` to hide that attribution.

### MCP Server Management
\`\`\`json
{
  "enableAllProjectMcpServers": true,
  "enabledMcpjsonServers": ["server1", "server2"],
  "disabledMcpjsonServers": ["blocked-server"]
}
\`\`\`

### Plugins
\`\`\`json
{
  "enabledPlugins": {
    "formatter@anthropic-tools": true
  }
}
\`\`\`
Plugin syntax: \`plugin-name@source\` where source is \`claude-code-marketplace\`, \`claude-plugins-official\`, or \`builtin\`.

### Other Settings
- \`language\`: Preferred response language (e.g., "japanese")
- \`cleanupPeriodDays\`: Days to keep transcripts before automatic cleanup (default: 30; minimum 1)
- \`respectGitignore\`: Whether to respect .gitignore (default: true)
- \`spinnerTipsEnabled\`: Show tips in spinner
- \`spinnerVerbs\`: Customize spinner verbs (\`{ "mode": "append" | "replace", "verbs": [...] }\`)
- \`spinnerTipsOverride\`: Override spinner tips (\`{ "excludeDefault": true, "tips": ["Custom tip"] }\`)
- \`syntaxHighlightingDisabled\`: Disable diff highlighting
`;
  var XMc = `## Hooks Configuration

Hooks run commands at specific points in Claude Code's lifecycle.

### Hook Structure
\`\`\`json
{
  "hooks": {
    "EVENT_NAME": [
      {
        "matcher": "ToolName|OtherTool",
        "hooks": [
          {
            "type": "command",
            "command": "your-command-here",
            "timeout": 60,
            "statusMessage": "Running..."
          }
        ]
      }
    ]
  }
}
\`\`\`

### Hook Events

| Event | Matcher | Purpose |
|-------|---------|---------|
| PermissionRequest | Tool name | Run before permission prompt |
| PreToolUse | Tool name | Run before tool, can block |
| PostToolUse | Tool name | Run after successful tool |
| PostToolUseFailure | Tool name | Run after tool fails |
| Notification | Notification type | Run on notifications |
| Stop | - | Run when Claude stops (including clear, resume, compact) |
| PreCompact | "manual"/"auto" | Before compaction |
| PostCompact | "manual"/"auto" | After compaction (receives summary) |
| UserPromptSubmit | - | When user submits |
| SessionStart | - | When session starts |

**Common tool matchers:** \`Bash\`, \`Write\`, \`Edit\`, \`Read\`, \`Glob\`, \`Grep\`

### Hook Types

**1. Command Hook** - Runs a shell command:
\`\`\`json
{ "type": "command", "command": "prettier --write $FILE", "timeout": 30 }
\`\`\`

**2. Prompt Hook** - Evaluates a condition with LLM:
\`\`\`json
{ "type": "prompt", "prompt": "Is this safe? $ARGUMENTS" }
\`\`\`
Only available for tool events: PreToolUse, PostToolUse, PermissionRequest.

**3. Agent Hook** - Runs an agent with tools:
\`\`\`json
{ "type": "agent", "prompt": "Verify tests pass: $ARGUMENTS" }
\`\`\`
Only available for tool events: PreToolUse, PostToolUse, PermissionRequest.

### Hook Input (stdin JSON)
\`\`\`json
{
  "session_id": "abc123",
  "tool_name": "Write",
  "tool_input": { "file_path": "/path/to/file.txt", "content": "..." },
  "tool_response": { "success": true }  // PostToolUse only
}
\`\`\`

### Hook JSON Output

Hooks can return JSON to control behavior:

\`\`\`json
{
  "systemMessage": "Warning shown to user in UI",
  "continue": false,
  "stopReason": "Message shown when blocking",
  "suppressOutput": false,
  "decision": "block",
  "reason": "Explanation for decision",
  "hookSpecificOutput": {
    "hookEventName": "PostToolUse",
    "additionalContext": "Context injected back to model"
  }
}
\`\`\`

**Fields:**
- \`systemMessage\` - Display a message to the user (all hooks)
- \`continue\` - Set to \`false\` to block/stop (default: true)
- \`stopReason\` - Message shown when \`continue\` is false
- \`suppressOutput\` - Hide stdout from transcript (default: false)
- \`decision\` - "block" for PostToolUse/Stop/UserPromptSubmit hooks (deprecated for PreToolUse, use hookSpecificOutput.permissionDecision instead)
- \`reason\` - Explanation for decision
- \`hookSpecificOutput\` - Event-specific output (must include \`hookEventName\`):
  - \`additionalContext\` - Text injected into model context
  - \`permissionDecision\` - "allow", "deny", or "ask" (PreToolUse only)
  - \`permissionDecisionReason\` - Reason for the permission decision (PreToolUse only)
  - \`updatedInput\` - Modified tool input (PreToolUse only)

### Common Patterns

**Auto-format after writes:**
\`\`\`json
{
  "hooks": {
    "PostToolUse": [{
      "matcher": "Write|Edit",
      "hooks": [{
        "type": "command",
        "command": "jq -r '.tool_response.filePath // .tool_input.file_path' | { read -r f; prettier --write \\"$f\\"; } 2>/dev/null || true"
      }]
    }]
  }
}
\`\`\`

**Log all bash commands:**
\`\`\`json
{
  "hooks": {
    "PreToolUse": [{
      "matcher": "Bash",
      "hooks": [{
        "type": "command",
        "command": "jq -r '.tool_input.command' >> ~/.claude/bash-log.txt"
      }]
    }]
  }
}
\`\`\`

**Stop hook that displays message to user:**

Command must output JSON with \`systemMessage\` field:
\`\`\`bash
# Example command that outputs: {"systemMessage": "Session complete!"}
echo '{"systemMessage": "Session complete!"}'
\`\`\`

**Run tests after code changes:**
\`\`\`json
{
  "hooks": {
    "PostToolUse": [{
      "matcher": "Write|Edit",
      "hooks": [{
        "type": "command",
        "command": "jq -r '.tool_input.file_path // .tool_response.filePath' | grep -E '\\\\.(ts|js)$' && npm test || true"
      }]
    }]
  }
}
\`\`\`
`;
  var QMc = `## Constructing a Hook (with verification)

Given an event, matcher, target file, and desired behavior, follow this flow. Each step catches a different failure class \u2014 a hook that silently does nothing is worse than no hook.

1. **Dedup check.** Read the target file. If a hook already exists on the same event+matcher, show the existing command and ask: keep it, replace it, or add alongside.

2. **Construct the command for THIS project \u2014 don't assume.** The hook receives JSON on stdin. Build a command that:
   - Extracts any needed payload safely \u2014 use \`jq -r\` into a quoted variable or \`{ read -r f; ... "$f"; }\`, NOT unquoted \`| xargs\` (splits on spaces)
   - Invokes the underlying tool the way this project runs it (npx/bunx/yarn/pnpm? Makefile target? globally-installed?)
   - Skips inputs the tool doesn't handle (formatters often have \`--ignore-unknown\`; if not, guard by extension)
   - Stays RAW for now \u2014 no \`|| true\`, no stderr suppression. You'll wrap it after the pipe-test passes.

3. **Pipe-test the raw command.** Synthesize the stdin payload the hook will receive and pipe it directly:
   - \`Pre|PostToolUse\` on \`Write|Edit\`: \`echo '{"tool_name":"Edit","tool_input":{"file_path":"<a real file from this repo>"}}' | <cmd>\`
   - \`Pre|PostToolUse\` on \`Bash\`: \`echo '{"tool_name":"Bash","tool_input":{"command":"ls"}}' | <cmd>\`
   - \`Stop\`/\`UserPromptSubmit\`/\`SessionStart\`: most commands don't read stdin, so \`echo '{}' | <cmd>\` suffices

   Check exit code AND side effect (file actually formatted, test actually ran). If it fails you get a real error \u2014 fix (wrong package manager? tool not installed? jq path wrong?) and retest. Once it works, wrap with \`2>/dev/null || true\` (unless the user wants a blocking check).

4. **Write the JSON.** Merge into the target file (schema shape in the "Hook Structure" section above). If this creates \`.claude/settings.local.json\` for the first time, add it to .gitignore \u2014 the Write tool doesn't auto-gitignore it.

5. **Validate syntax + schema in one shot:**

   \`jq -e '.hooks.<event>[] | select(.matcher == "<matcher>") | .hooks[] | select(.type == "command") | .command' <target-file>\`

   Exit 0 + prints your command = correct. Exit 4 = matcher doesn't match. Exit 5 = malformed JSON or wrong nesting. A broken settings.json silently disables ALL settings from that file \u2014 fix any pre-existing malformation too.

6. **Prove the hook fires** \u2014 only for \`Pre|PostToolUse\` on a matcher you can trigger in-turn (\`Write|Edit\` via Edit, \`Bash\` via Bash). \`Stop\`/\`UserPromptSubmit\`/\`SessionStart\` fire outside this turn \u2014 skip to step 7.

   For a **formatter** on \`PostToolUse\`/\`Write|Edit\`: introduce a detectable violation via Edit (two consecutive blank lines, bad indentation, missing semicolon \u2014 something this formatter corrects; NOT trailing whitespace, Edit strips that before writing), re-read, confirm the hook **fixed** it. For **anything else**: temporarily prefix the command in settings.json with \`echo "$(date) hook fired" >> /tmp/claude-hook-check.txt; \`, trigger the matching tool (Edit for \`Write|Edit\`, a harmless \`true\` for \`Bash\`), read the sentinel file.

   **Always clean up** \u2014 revert the violation, strip the sentinel prefix \u2014 whether the proof passed or failed.

   **If proof fails but pipe-test passed and \`jq -e\` passed**: the settings watcher isn't watching \`.claude/\` \u2014 it only watches directories that had a settings file when this session started. The hook is written correctly. Tell the user to open \`/hooks\` once (reloads config) or restart \u2014 you can't do this yourself; \`/hooks\` is a user UI menu and opening it ends this turn.

7. **Handoff.** Tell the user the hook is live (or needs \`/hooks\`/restart per the watcher caveat). Point them at \`/hooks\` to review, edit, or disable it later. The UI only shows "Ran N hooks" if a hook errors or is slow \u2014 silent success is invisible by design.
`;
  var VMf;
  var eNc = __lazy(() => {
    Rj();
    x_();
    VMf = `# Update Config Skill

Modify Claude Code configuration by updating settings.json files.

## When Hooks Are Required (Not Memory)

If the user wants something to happen automatically in response to an EVENT, they need a **hook** configured in settings.json. Memory/preferences cannot trigger automated actions.

**These require hooks:**
- "Before compacting, ask me what to preserve" \u2192 PreCompact hook
- "After writing files, run prettier" \u2192 PostToolUse hook with Write|Edit matcher
- "When I run bash commands, log them" \u2192 PreToolUse hook with Bash matcher
- "Always run tests after code changes" \u2192 PostToolUse hook

**Hook events:** PreToolUse, PostToolUse, PreCompact, PostCompact, Stop, Notification, SessionStart

## CRITICAL: Read Before Write

**Always read the existing settings file before making changes.** Merge new settings with existing ones - never replace the entire file.

## CRITICAL: Use AskUserQuestion for Ambiguity

When the user's request is ambiguous, use AskUserQuestion to clarify:
- Which settings file to modify (user/project/local)
- Whether to add to existing arrays or replace them
- Specific values when multiple options exist

## Decision: /config command vs Direct Edit

**Suggest the \`/config\` slash command** for these simple settings:
- \`theme\`, \`editorMode\`, \`verbose\`, \`model\`
- \`language\`, \`alwaysThinkingEnabled\`
- \`permissions.defaultMode\`

**Edit settings.json directly** for:
- Hooks (PreToolUse, PostToolUse, etc.)
- Complex permission rules (allow/deny arrays)
- Environment variables
- MCP server configuration
- Plugin configuration

## Workflow

1. **Clarify intent** - Ask if the request is ambiguous
2. **Read existing file** - Use Read tool on the target settings file
3. **Merge carefully** - Preserve existing settings, especially arrays
4. **Edit file** - Use Edit tool (if file doesn't exist, ask user to create it first)
5. **Confirm** - Tell user what was changed

## Merging Arrays (Important!)

When adding to permission arrays or hook arrays, **merge with existing**, don't replace:

**WRONG** (replaces existing permissions):
\`\`\`json
{ "permissions": { "allow": ["Bash(npm *)"] } }
\`\`\`

**RIGHT** (preserves existing + adds new):
\`\`\`json
{
  "permissions": {
    "allow": [
      "Bash(git *)",      // existing
      "Edit(.claude)",    // existing
      "Bash(npm *)"       // new
    ]
  }
}
\`\`\`

${GMf}

${XMc}

${QMc}

## Example Workflows

### Adding a Hook

User: "Format my code after Claude writes it"

1. **Clarify**: Which formatter? (prettier, gofmt, etc.)
2. **Read**: \`.claude/settings.json\` (or create if missing)
3. **Merge**: Add to existing hooks, don't replace
4. **Result**:
\`\`\`json
{
  "hooks": {
    "PostToolUse": [{
      "matcher": "Write|Edit",
      "hooks": [{
        "type": "command",
        "command": "jq -r '.tool_response.filePath // .tool_input.file_path' | { read -r f; prettier --write \\"$f\\"; } 2>/dev/null || true"
      }]
    }]
  }
}
\`\`\`

### Adding Permissions

User: "Allow npm commands without prompting"

1. **Read**: Existing permissions
2. **Merge**: Add \`Bash(npm *)\` to allow array
3. **Result**: Combined with existing allows

### Environment Variables

User: "Set DEBUG=true"

1. **Decide**: User settings (global) or project settings?
2. **Read**: Target file
3. **Merge**: Add to env object
\`\`\`json
{ "env": { "DEBUG": "true" } }
\`\`\`

## Common Mistakes to Avoid

1. **Replacing instead of merging** - Always preserve existing settings
2. **Wrong file** - Ask user if scope is unclear
3. **Invalid JSON** - Validate syntax after changes
4. **Forgetting to read first** - Always read before write

## Troubleshooting Hooks

If a hook isn't running:
1. **Check the settings file** - Read ~/.claude/settings.json or .claude/settings.json
2. **Verify JSON syntax** - Invalid JSON silently fails
3. **Check the matcher** - Does it match the tool name? (e.g., "Bash", "Write", "Edit")
4. **Check hook type** - Is it "command", "prompt", or "agent"?
5. **Test the command** - Run the hook command manually to see if it works
6. **Use --debug** - Run \`claude --debug\` to see hook execution logs
`;
  });
  var nNc = `# Verifying a CLI change

The handle is direct invocation. The evidence is stdout/stderr/exit code.

## Pattern

1. Build (if the CLI needs building)
2. Run with arguments that exercise the changed code
3. Capture output and exit code
4. Compare to expected

CLIs are usually the simplest to verify \u2014 no lifecycle, no ports.

## Worked example

**Diff:** adds a \`--json\` flag to the \`status\` subcommand. New flag
parsing in \`cmd/status.go\`, new output branch.

**Claim (commit msg):** "machine-readable status output."

**Inference:** \`tool status --json\` now exists, emits valid JSON with
the same fields the human output shows. \`tool status\` without the flag
is unchanged.

**Plan:**
1. Build
2. \`tool status\` \u2192 human output, same as before (non-regression)
3. \`tool status --json\` \u2192 valid JSON, parseable
4. JSON fields match human output fields

**Execute:**
\`\`\`bash
go build -o /tmp/tool ./cmd/tool

/tmp/tool status
# \u2192 Status: healthy
# \u2192 Uptime: 3h12m
# \u2192 Connections: 47

/tmp/tool status --json
# \u2192 {"status":"healthy","uptime_seconds":11520,"connections":47}

/tmp/tool status --json | jq -e .status
# \u2192 "healthy"
# (jq -e exits nonzero if the path is null/false \u2014 cheap validity check)

echo $?
# \u2192 0
\`\`\`

**Verdict:** PASS \u2014 flag works, JSON is valid, fields line up.

## What FAIL looks like

- \`unknown flag: --json\` \u2192 not wired up, or you're running a stale build
- Output isn't valid JSON (\`jq\` errors) \u2192 serialization bug
- \`tool status\` (no flag) changed \u2192 regression; the diff touched more
  than it should
- JSON has different field names than expected \u2192 claim/code mismatch,
  might be fine, note it

## Reading from stdin, destructive commands

If the CLI reads stdin \u2192 pipe in test data.
If it writes files / hits a network / deletes things \u2192 point it at a
tmp dir / a mock / a dry-run flag. If there's no safe mode and the
diff touches the destructive path, say so and verify what you can
around it.
`;
  var tNc = () => {};
  var oNc = `# Verifying a server/API change

The handle is \`curl\` (or equivalent). The evidence is the response.

## Pattern

1. Start the server (background, with a readiness poll \u2014 see below)
2. \`curl\` the route the diff touches, with inputs that hit the changed branch
3. Capture the full response (status + headers + body)
4. Compare to expected

## Lifecycle

If there's a run-skill it handles this. If not:

\`\`\`bash
<start-command> &> /tmp/server.log &
SERVER_PID=$!
for i in {1..30}; do curl -sf localhost:PORT/health >/dev/null && break; sleep 1; done
# ... your curls ...
kill $SERVER_PID
\`\`\`

No readiness endpoint? Poll the route you're about to test until it
stops returning connection-refused, then add a beat.

## Worked example

**Diff:** adds a \`Retry-After\` header to 429 responses in \`rateLimit.ts\`.
**Claim (PR body):** "clients can now back off correctly."

**Inference:** hitting the rate limit should now return \`Retry-After: <n>\`
in the response headers. It didn't before.

**Plan:**
1. Start server
2. Hit the rate-limited endpoint enough times to trigger 429
3. Check the 429 response has \`Retry-After\` header
4. Check the value is a positive integer

**Execute:**
\`\`\`bash
# trigger the limit \u2014 10 fast requests, limit is 5/sec per the diff
for i in {1..10}; do curl -s -o /dev/null -w "%{http_code}\\n" localhost:3000/api/thing; done
# \u2192 200 200 200 200 200 429 429 429 429 429

# capture the 429 headers
curl -si localhost:3000/api/thing | head -20
# \u2192 HTTP/1.1 429 Too Many Requests
# \u2192 Retry-After: 12
# \u2192 ...
\`\`\`

**Verdict:** PASS \u2014 \`Retry-After: 12\` present, positive integer.

## What FAIL looks like

- Header absent \u2192 the diff didn't take effect, or you're not actually
  hitting the 429 path (check the status code first)
- Header present but value is \`NaN\` / \`undefined\` / negative \u2192 the
  logic is wrong
- You got 200s all the way through \u2192 you never triggered the changed
  path. Tighten the request burst or check the rate limit config.
`;
  var rNc = () => {};
  var iNc = `---
name: verify
description: Verify that a code change actually does what it's supposed to by exercising it end-to-end and observing behavior \u2014 drive the affected flow, not just tests or typecheck. Run before committing nontrivial changes. Don't invoke it on a diff that only touches tests, docs, or other code with no runtime surface to drive (a change to product source always has one) \u2014 there's nothing to observe.
---

**Verification is runtime observation.** You build the app, run it,
drive it to where the changed code executes, and capture what you
see. That capture is your evidence. Nothing else is.

**Don't run tests. Don't typecheck.** Running them here proves you
can run CI \u2014 not that the change works. Not as a warm-up,
not "just to be sure," not as a regression sweep after. The time
goes to running the app instead.

**Don't import-and-call.** \`import { foo } from './src/...'\` then
\`console.log(foo(x))\` is a unit test you wrote. The function did what
the function does \u2014 you knew that from reading it. The app never ran.
Whatever calls \`foo\` in the real codebase ends at a CLI, a socket, or
a window. Go there.

## Find the change

The scope is what you're verifying \u2014 usually a diff, sometimes just
"does X work." In a git repo, establish the full range (a branch may
be many commits, or the change may still be uncommitted):

\`\`\`bash
git log --oneline @{u}..              # count commits (if upstream set)
git diff @{u}.. --stat                # full range, not HEAD~1
git diff origin/HEAD... --stat        # no upstream: committed vs base
git diff HEAD --stat                  # uncommitted: working tree vs HEAD
gh pr diff                            # if in a PR context
\`\`\`

State the commit count. Large diff truncating? Redirect to a file
then Read it. Repo but no diff from any of these \u2192 say so, stop.
**No repo \u2192 the scope is whatever the user named; ask if they
didn't.**

**The diff is ground truth. Any description is a claim about it.**
Read both. If they disagree, that's a finding.

## Surface

The surface is where a user \u2014 human or programmatic \u2014 meets the
change. That's where you observe.

| Change reaches | Surface | You |
|---|---|---|
| CLI / TUI | terminal | type the command, capture the pane \u2014 [example](examples/cli.md) |
| Server / API | socket | send the request, capture the response \u2014 [example](examples/server.md) |
| GUI | pixels | drive it under xvfb/Playwright, screenshot |
| Library | package boundary | sample code through the public export \u2014 \`import pkg\`, not \`import ./src/...\` |
| Prompt / agent config | the agent | run the agent, capture its behavior |
| CI workflow | Actions | dispatch it, read the run |

**Internal function? Not a surface.** Something in the repo calls it
and that caller ends at one of the rows above. Follow it there. A
bash security gate's surface isn't the function's return value \u2014 it's
the CLI prompting or auto-allowing when you type the command.

**No runtime surface at all** \u2014 docs-only, type declarations with no
emit, build config that produces no behavioral diff \u2014 report
**SKIP \u2014 no runtime surface: (reason).** Don't run tests to fill
the space.

**Tests in the diff are the author's evidence, not a surface.** CI
runs them. You'd be re-running CI. Tests-only PR \u2192 SKIP, one line.
Mixed src+tests \u2192 verify the src, ignore the test files. Reading a
test to learn what to check is fine \u2014 it's a spec. But then go run
the app. Checking that assertions match source is code review.

## Get a handle

**Check \`.claude/skills/\` first \u2014 even if you already know how to
build and run.** A matching \`verifier-*\` skill is the repo's
evidence-capture protocol: it wraps the session so a reviewer can
replay what you saw (recording, screenshots). Drive the surface
without it and you get a verdict with no replay.

Skills live at the repo root **and** in the package/app dirs the
diff touches \u2014 in a monorepo the unlock for \`apps/desktop/\` is
usually \`apps/desktop/.claude/skills/\`, not the root. Probe both:

\`\`\`bash
ls .claude/skills/                    # repo root
ls <touched-dir>/.claude/skills/      # each dir level the diff names
\`\`\`

- **\`verifier-*\` matching your surface** (CLI verifier for a CLI
  change, etc.) \u2192 invoke it with the Skill tool and follow its
  setup. Mismatched surface \u2192 skip that one, try the next. Stale
  verifier (fails on mechanics unrelated to the change) \u2192 ask the
  user whether to patch it; don't FAIL the change for verifier rot.
- **\`run-*\` but no matching verifier** \u2192 use its build/launch
  primitives as your handle.
- **Neither** \u2192 cold start from README/package.json/Makefile. Timebox
  ~15min. Stuck \u2192 BLOCKED with exactly where, plus a filled-in
  \`/run-skill-generator\` prompt. Got through \u2192 note the working
  build/launch recipe so it can become a \`verifier-*\` skill.

## Drive it

Smallest path that makes the changed code execute:

- Changed a flag? Run with it.
- Changed a handler? Hit that route.
- Changed error handling? Trigger the error.
- Changed an internal function? Find the CLI command / request / render
  that reaches it. Run that.

**Read your plan back before running.** If every step is build /
typecheck / run test file \u2014 you've planned a CI rerun, not a
verification. Find a step that reaches the surface or report BLOCKED.

**The verdict is table stakes. Your observations are the signal.**
A PASS with three sharp "hey, I noticed\u2026" lines is worth more than a
bare PASS. You're the only reviewer who actually *ran* the thing \u2014
anything that made you pause, work around, or go "huh" is information
the author doesn't have. Don't filter for "is this a bug." Filter for
"would I mention this if they were sitting next to me."

**End-to-end, through the real interface.** Pieces passing in
isolation doesn't mean the flow works \u2014 seams are where bugs hide.
If users click buttons, test by clicking buttons, not by curling the
API underneath.

**Destructive path?** If the change touches code that deletes,
publishes, sends, or writes outside the workspace and there's no
dry-run or safe target, don't drive it live. Verify what you can
around it and say which path you didn't exercise and why.

## Push on it

The claim checked out \u2014 that's the first half. Confirming is step
one, not the job. The description is what the author intended;
your value is what they didn't.

You know exactly what changed. Probe *around* it, at the same
surface you just drove:

- **New flag / option** \u2192 empty value, passed twice, combined with a
  conflicting flag, typo'd (does the error name it?)
- **New handler / route** \u2192 wrong method, malformed body, missing
  required field, oversized payload
- **Changed error path** \u2192 the adjacent errors it didn't touch \u2014
  did the refactor catch them too, or only the one in the diff?
- **Interactive / TUI** \u2192 Ctrl-C mid-op, resize the pane, paste
  garbage, rapid-fire the key, Esc at the wrong moment
- **State / persistence** \u2192 do it twice, do it with stale state
  underneath, do it in two sessions at once
- **Wander** \u2192 what's adjacent? What looked off while you were
  confirming? Go back to it.

These aren't a checklist \u2014 pick the ones the change points at. Stop
when you've covered the obvious adjacents or hit something worth a
\u26A0\uFE0F. A probe that finds nothing is still a step: "\uD83D\uDD0D passed \`--from ''\`
\u2192 clean \`error: --from requires a value\`, exit 2." That the author
didn't test it is exactly why it's worth knowing it holds.

Still not a test run. You're at the surface, typing what a user
would type wrong.

## Capture

Stdout, response bodies, screenshots, pane dumps. Captured output is
evidence; your memory isn't. Something unexpected? Don't route around
it \u2014 capture, note, decide if it's the change or the environment.
Unrelated breakage is a finding, not noise.

Shared process state (tmux, ports, lockfiles) \u2014 isolate. \`tmux -L
name\`, bind \`:0\`, \`mktemp -d\`. You share a namespace with your host.

## Report

Inline, final message:

\`\`\`
## Verification: <one-line what changed>

**Verdict:** PASS | FAIL | BLOCKED | SKIP

**Claim:** <what it's supposed to do \u2014 your read of the diff and/or
the stated claim; note any mismatch>

**Method:** <how you got a handle \u2014 which verifier/run-skill, or
cold start; what you launched>

### Steps

Each step is one thing you did to the **running app** and what it
showed. Build/install/checkout are setup, not steps. Test runs and
typecheck don't belong here \u2014 they're CI's output.

1. \u2705/\u274C/\u26A0\uFE0F/\uD83D\uDD0D <what you did to the running app> \u2192 <what you observed>
   <evidence: the app's own output \u2014 pane capture, response body,
   screenshot>

\uD83D\uDD0D marks a probe \u2014 a step off the claim's happy path, trying to
break it. At least one. A Steps list that's all \u2705 and no \uD83D\uDD0D is a
happy-path replay: still PASS, but you stopped at the first half.

**Screenshot / sample:** <the one frame a reviewer looks at to see
the feature \u2014 an image for GUI/TUI, code block for library/API;
omit for build/types-only>

### Findings
<Things you noticed. Not just bugs \u2014 friction, surprises, anything
a first-time user would trip on. "Took three tries to find the right
flag." "Error message on typo was unhelpful." "Default seems odd for
the common case." "Works, but slower than I expected." Lower the bar:
if it made you pause, it goes here. But the pause has to be yours,
from running the app \u2014 not from reading the PR page. A red CI check,
a review comment, someone else's bot: visible to anyone already, and
you relaying it isn't an observation. Claim/diff mismatch, pre-existing
breakage, and env notes also belong.

Each probe gets a line here even when it held \u2014 "\uD83D\uDD0D empty \`--from\`
\u2192 clean error" tells the author what *was* covered, which they
can't see from a bare PASS.

Lead with \u26A0\uFE0F for lines worth interrupting the reviewer for; plain
bullets are context. Empty is fine if nothing stuck out \u2014 but nothing
sticking out is itself rare.>
\`\`\`

**Evidence has to reach the reader.** A file path is only evidence
if the person reading the report can open it. If the \`SendUserFile\`
tool is in your toolset, you're on a remote surface where they
can't \u2014 send the screenshots and recordings with it and let the
report name what you sent. Without it, reference the path and keep
the evidence that matters inline \u2014 pane captures and response
bodies travel in the report; a bare path only works when the reader
shares your filesystem.

**Verdicts:**
- **PASS** \u2014 you ran the app, the change did what it should at its
  surface. Not: tests pass, builds clean, code looks right.
- **FAIL** \u2014 you ran it and it doesn't. Or it breaks something else.
  Or claim and diff disagree materially.
- **BLOCKED** \u2014 couldn't reach a state where the change is observable.
  Build broke, env missing a dep, handle wouldn't come up. Not a
  verdict on the change. Never report an approach blocked or
  impossible until you've enumerated the skills along the touched
  subtree \u2014 environment-specific unlocks (headless runners, login
  helpers, VM harnesses) usually live there. Say exactly where it
  stopped + \`/run-skill-generator\` prompt.
- **SKIP** \u2014 no runtime surface exists. Docs-only, types-only,
  tests-only. Nothing went wrong; there's just nothing here to run.
  One line why.

No partial pass. "3 of 4 passed" is FAIL until 4 passes or is
explained away.

**When in doubt, FAIL.** False PASS ships broken code; false FAIL
costs one more human look. Ambiguous output is FAIL with the raw
capture attached \u2014 don't interpret.
`;
  var sNc = () => {};
  var aNc = {};
  __export(aNc, {
    lxl: () => iNc,
    SKILL_FILES: () => SKILL_FILES_export3
  });
  var SKILL_FILES_export3;
  function cNc() {
    return QMf ??= Promise.resolve().then(() => (lNc(), aNc));
  }
  function uNc() {
    Qc({
      name: "verify",
      description: "Verify that a code change actually does what it's supposed to by exercising it end-to-end and observing behavior \u2014 drive the affected flow, not just tests or typecheck. Run before committing nontrivial changes. Don't invoke it on a diff that only touches tests, docs, or other code with no runtime surface to drive (a change to product source always has one) \u2014 there's nothing to observe.",
      userInvocable: true,
      files: () => cNc().then(e => e.SKILL_FILES),
      async getPromptForCommand(e) {
        let {
          lxl: t
        } = await cNc();
        let n = [sf(t).content.trimStart()];
        if (e) {
          n.push(`## User Request

${e}`);
        }
        return [{
          type: "text",
          text: n.join(`

`)
        }];
      }
    });
  }
  var QMf;
  var dNc = __lazy(() => {
    fv();
    x_();
  });
  var mNc = `# Anti-patterns \u2014 what goes wrong

Check every chart against this list. If your output matches an entry, it is wrong \u2014
fix it before shipping. These are real failure modes, each caught in shipping
dashboards.

## Color & encoding

**\u274C Dual-axis charts (two y-scales on one plot).**
Why it misleads: the alignment of the two scales is arbitrary, so the chart invents a
correlation that isn't in the data. Real example: an "Adoption" chart plotting Users
(0\u201330k) against Sessions (0\u2013800k) \u2014 a reviewer flagged it as looking "hallucinated."
\u2705 Do instead: two charts, small multiples, or index both series to a common base
(=100 at t0) on **one** axis.

**\u274C Recolor-on-filter.** Assigning colors by current rank, so filtering out a series
repaints the survivors.
Why: a reader who learned "Acme is blue" is now misled.
\u2705 Color follows the entity, not its row number. Survivors keep their hue.

**\u274C Cycling / generating hues past 8.** A 9th categorical color, generated or reused.
Why: indistinguishable from an existing slot under CVD; breaks the order check.
\u2705 Fold the tail into "Other," facet into small multiples, or use composite encoding.

**\u274C Eyeballing colorblind-safety.** "These look different enough."
\u2705 Run \`scripts/validate_palette.js\`. Adjacent \u0394E \u2265 12, or 8\u201312 WITH secondary encoding.

**\u274C A value-ramp on nominal categories.** Coloring each bar darker-where-bigger
when the categories have no natural order (products, teams, endpoints).
Why: it double-encodes bar length as hue, burns the only free channel on
information the chart already shows, and fails the categorical checks by design
(a ramp spans the lightness band and drops below the chroma floor).
\u2705 One series \u2192 one color (slot 1) for every bar. Ordered categories (funnel,
tiers, age bands) \u2192 the ordinal ramp, validated with \`--ordinal\`.

**\u274C Rainbow / non-neighbor sequential.** A multi-hue ramp for magnitude.
\u2705 One hue, light\u2192dark. (Analogous neighbors or semantic heat are the only multi-hue
sequential exceptions, always with a scale legend.)

**\u274C A hue at the diverging midpoint, or two cool hues as the two poles.**
Why: the midpoint must read as "nothing"; poles must read as opposite. blue\u2194aqua
fails this (both cool); blue\u2194red or blue\u2194orange succeed (warm/cool).
\u2705 Two hues that read as opposite + a neutral gray midpoint.

**\u274C Status color used for a non-status series** (or a series color used for status).
\u2705 Status tokens only when the color *means* good/bad; categorical when it's identity.

## Form

**\u274C Eight categorical hues when the story is one number.** The most common way a
chart misses its point.
\u2705 Emphasis (highlight one, gray the rest), or a stat tile / hero number.

**\u274C A one-bar bar chart, or a 2-slice pie.**
\u2705 A stat tile. The number is the chart.

**\u274C A donut/pie for comparing close values.**
\u2705 A bar, or the numbers. Part-to-whole at a glance only, \u2264 6 segments.

**\u274C More than ~7 color classes carrying meaning.**
\u2705 A table, or table + chart. Past ~7 bins, adjacent classes blur.

## Marks & chrome

**\u274C Thick saturated blocks, heavy gridlines, no breathing room.** Reads loud, even
childish, at scale.
\u2705 Thin marks, hairline recessive grid/axes, generous padding. Saturated fills are
for small marks and accents, never large blocks.

**\u274C Dashed gridlines or axis rules.** Dashing adds visual noise and reads as
"projection" or "threshold" when it's just a grid.
\u2705 Gridlines and axes are solid hairlines, one shade off the surface.

**\u274C A number on every data point.** A value beside every dot or segment is chaos and goes unread.
\u2705 A legend is always present for \u2265 2 series; direct-label *selectively* (the endpoint, the extreme, the one series that matters) and let the axis + tooltip carry the rest.

**\u274C A border drawn around marks to separate them.**
\u2705 A 2px surface gap between fills (stacked segments and adjacent bars alike) and a 2px surface ring (on overlapping markers).

**\u274C A label clipped by, or overflowing, a too-small bar or stacked segment** \u2014
including \`overflow: hidden\` cropping the first/last characters of an in-segment label.
\u2705 Only render a label inside a mark when it fits with padding; otherwise move it
outside the bar end, or drop it to the tooltip/legend (the value stays in the table view).

**\u274C A chart container whose fixed height excludes the x-axis band** \u2014 the plot
fits, the axis labels don't, so the card gets a tiny nested vertical scroll.
\u2705 Size the container to include the axis labels (plot height + x-axis band),
or let the container grow with its content instead of fixing a height.

**\u274C A display or serif face on the hero figure.** It reads as off-brand decoration.
\u2705 The hero figure uses the same sans as everything else.

**\u274C \`tabular-nums\` on a large standalone number.** Equal-width digits make \`121\`
look loose at display sizes.
\u2705 Proportional figures on hero and stat-tile values; \`tabular-nums\` only where
numbers align vertically (table rows, axis ticks).

**\u274C Texture on by default, or as decoration.** Dense angled fields are a vestibular
risk and read as noise on value scales.
\u2705 Texture is opt-in (a11y setting, print, forced-colors), 45\xB0/135\xB0 only, ordered on
value scales.

## Interaction & accessibility

**\u274C A tooltip as the only way to read a value.**
\u2705 Tooltips enhance, never gate \u2014 every value is also reachable via direct labels or
the table view; keyboard focus shows the same as hover.

**\u274C Pinpoint hover targets \u2014 an 8px scatter dot you must land on dead-center.**
\u2705 The hit area includes the 2px gap and meets a ~24px minimum; dense scatter uses a nearest-point / Voronoi layer.

**\u274C Per-chart filters, or filters inside a chart card.**
\u2705 One filter row above everything it scopes; all charts re-render against the same slice.

**\u274C Skeleton flash on refetch.**
\u2705 Hold the previous render at reduced opacity \u2014 no layout jump.

**\u274C No table view / color-only encoding on a continuous scale.**
\u2705 Every chart has a table-view twin (the WCAG-clean equivalent).
`;
  var pNc = () => {};
  var hNc = `# Choosing a form

Decide this **before** color. The data's job picks the form \u2014 and sometimes the
right form is not a chart.

## Is it even a chart?

| The data is\u2026 | Use | Not |
|---|---|---|
| A single current value (+ maybe a trend) | **Stat tile** (value + delta + sparkline) | A one-bar bar chart |
| A handful of headline numbers | **KPI row** of stat tiles | A grouped bar chart |
| The one number a dashboard leads with | **Hero figure** (\u226548px, sans) | \u2014 |
| A single ratio against a limit | **Meter** (same-ramp track) | A pie of 2 slices |
| More than ~7 classes that all carry meaning | A **table** (or table + chart) | More colors |

If a chart *is* right, pick the type by the job:

## The job \u2192 the type

| Job (what the reader must do) | Default form | Color job |
|---|---|---|
| Compare magnitude, low \u2192 high | bar / column; **heatmap** for a grid | sequential (one hue) |
| Trend over time | line; area for a single series | sequential or 1 categorical |
| Tell distinct series apart | grouped/stacked bar, multi-line | **categorical** |
| One series is the point, rest are context | **emphasis** (highlight one, gray the rest) | 1 hue + gray |
| Above/below a baseline; \u0394 to target | diverging bar, or line vs baseline | diverging |
| Part-to-whole | **stacked bar** (go horizontal for many / long-named categories) | categorical |
| Ordered-scale share (Likert, sentiment, agree\u2194disagree) | **diverging stacked bar**, centered on neutral | diverging |
| Before \u2192 after per item | dumbbell | 1 hue, 2 shades |

## The rules behind the table

- **Sequential is the safe default.** One hue, more-is-darker. It stays legible and
  consistent and is hard to misread. Reach for it unless the data's job is
  specifically *identity* or *polarity*.
- **Categorical is for when the series ARE the subject** \u2014 and it has a real cost:
  it can bury the one data point that actually matters. If the story is "this one
  went up," that's **emphasis**, not categorical.
- **Emphasis** = the most underused form. One series in the accent hue, the rest in
  the de-emphasis gray. Often the honest answer to "make this chart clearer."
- **Texture is an opt-in expression, not a default form.** It earns its place only
  for accessibility (full CVD), print/export, and \`forced-colors\`. Never decorative.
  \u2192 see \`marks-and-anatomy.md\`.

## Series-count ladder (categorical)

| Series | Treatment |
|---|---|
| 1\u20133 | color alone is comfortable for everyone; direct-label |
| 4 | the CVD floor enters \u2014 direct labels become mandatory, not a courtesy |
| 5\u20136 | soft cap; legend or small multiples |
| 7\u20138 | token ceiling; past it, fold the tail into "Other," facet into small multiples, or use composite encoding (hue \xD7 shape) |

Never solve "too many series" by generating more hues. A generated 9th hue is
indistinguishable from an existing one under CVD and breaks every check.
`;
  var fNc = () => {};
  var yNc = `# Color formula

Color is **not hand-picked**. Every chart color does exactly one of four jobs, and a
palette is legal only if it passes six checks. The checks are the product \u2014 they are
what makes a palette safe to change and what lets the same method run on any design
system's ramps.

## The four jobs

| Job | What it encodes | Structure |
|---|---|---|
| **Categorical** | identity (which series) | 8 hues, fixed order, assigned in sequence, never cycled |
| **Ordinal** | position in a sequence (funnel stage, tier, bucket) | one hue, monotone lightness steps; light end still \u2265 2:1 on surface |
| **Sequential** | magnitude (how much) | one hue, steps 100\u2192700, light\u2192dark; flips anchor in dark |
| **Diverging** | polarity (which side of a baseline) | two hues + a neutral gray midpoint; equal steps per arm |
| **Status** | state (good\u2192critical) | a small fixed scale, reserved meaning, always icon+label |

**Categorical or ordinal?** If swapping the category order would change the
meaning \u2014 funnel stages, size tiers (S/M/L), age bands, cohort buckets \u2014 it is
**ordinal** and takes a one-hue ramp so the reader sees the order in the color.
If swapping would not \u2014 product names, teams, regions, endpoints \u2014 it is
**nominal categorical** and each bar takes the *same* slot-1 hue (one series,
so no legend box \u2014 the title names it), or slots 1..N when there are N separate
series. Never color nominal bars by their value: that spends the identity channel
re-encoding what bar length already shows.

## The six checks

Every categorical color \u2014 current or proposed \u2014 must pass all six.

1. **Fixed hue anchors.** Eight families in a fixed order. The order is the
   CVD-safety mechanism; it never changes. *(structural \u2014 enforced, not measured)*
2. **Lightness band per mode.** OKLCH L \u2248 0.43\u20130.77 light; \u2248 0.48\u20130.67 dark. *(validator)*
3. **Chroma floor.** OKLCH C \u2265 ~0.10 \u2014 below it a hue reads as gray and stops doing
   identity work. *(validator)*
4. **CVD separation.** Machado-2009 \u0394E \u2265 12 target / \u2265 8 floor (floor legal only with
   secondary encoding), under protanopia & deuteranopia. *Adjacent* pairs for
   stacks/bars/lines (only neighbors touch \u2014 assignment never skips); **all pairs for
   scatter, bubble, choropleth, and small-multiples**, where any two marks can sit side
   by side \u2014 pass \`--pairs all\` there or a real collapse stays hidden. *(validator)*
5. **Contrast vs surface.** \u2265 3:1 for marks; conditionally relaxed where values are
   readable another way (visible labels or the table view). *(validator)*
6. **Documented palette only.** Every slot is a hex from the instance file
   (\`palette.md\` or its equivalent) \u2014 no eyeballed values. *(structural; for a
   customer's ramps, snap to nearest \u2014 below)*

## Run the checks \u2014 never eyeball them

\`\`\`
node scripts/validate_palette.js \\
  "#2a78d6,#1baf7a,#eda100,#008300,#4a3aa7,#e34948,#e87ba4,#eb6834" --mode light
\`\`\`

(\`scripts/\` is relative to this skill's base directory, shown at the top of the prompt.)

(or load it as \`<script type="module">\` in the chart's own page \u2014 it reads
\`data-palette\` off \`<body>\` and logs a \`console.table\` report)

Reports each computable check (2\u20135) with PASS / WARN / FAIL plus the worst CVD pair.
Exit 0 = no hard FAIL (WARN bands \u2014 floor-band CVD 8\u201312 and sub-3:1 contrast relief \u2014
still exit 0 and require secondary encoding); exit 1 on any FAIL. Run once per mode
(\`--mode dark --surface "#1a1a19"\`), and add
\`--pairs all\` for scatter / bubble / map / small-multiples charts (where any two marks
can be neighbors \u2014 the default adjacent check would hide a collapse). For an
**ordinal** ramp pass \`--ordinal\` \u2014 it switches to the ramp checks (monotone L,
adjacent \u0394L \u2265 0.06, light-end contrast \u2265 2.0:1, single hue) instead of the
categorical six.
A WARN on CVD (8\u201312 floor) is legal **only** if you also ship secondary encoding
(direct labels, gaps, or texture). A WARN on contrast is **not dismissable** \u2014 it
obligates a relief channel (visible direct labels or the table view); shipping the
sub-3:1 fill with neither is a fail.

**Scope \u2014 what the validator does and doesn't cover.** These six checks validate a
*categorical* palette (series identity). They do **not** judge a lone status/text
color or a sequential ramp. For a single status or text color, run a WCAG *text*-
contrast check (4.5:1 normal, 3:1 large) \u2014 \`validate_palette.js\` exports
\`contrast(a, b)\` for exactly this. For sequential/diverging, the check is lightness
monotonicity across the ramp, not adjacency CVD \u2014 running the categorical validator on
a sequential ramp **will FAIL by design** (it spans the band; steps sit close), which
is expected, not a real failure; don't "fix" a good ramp to satisfy it.

## Snap-to-passing (any design system)

Given a customer's ramps and a desired order:
1. For each slot, pick the step whose OKLCH L sits in the mode's band and C \u2265 floor.
2. Run the validator. For any adjacent pair below \u0394E 12, nudge one slot \xB1 a step
   (hold its hue, move its lightness) and re-run.
3. Repeat until the worst adjacent pair clears the floor. Function preserved, the
   customer's hues kept.

## Themes

The slot **order** is a separable, named choice \u2014 a *theme* \u2014 on the same hues and
the same six checks. Each design system names a default order and any alternates;
swapping themes tunes the mood without touching the method. A surface adopts one
theme and freezes it; never mix themes within a dashboard. (See \`palette.md\`.)

**Deriving an order when a system has no theme yet:** don't guess. Enumerate candidate
orderings of the system's hues, run the validator on each, and pick the one that
maximizes the *minimum adjacent* CVD \u0394E. (Seeding from a known-good order by hue-family
analogy, then optimizing, is fine \u2014 this is exactly how the default in
\`palette.md\` was derived.)

## Status is fixed

Status never follows the theme \u2014 it is a small fixed scale (good \u2192 warning \u2192 serious
\u2192 critical) with reserved meaning, on steps deliberately distinct from the categorical
slots so a status color never impersonates a series, and always paired with an
icon + label (on a light surface warning and serious sit below 3:1 by design \u2014
the pairing is the mitigation). (Exact steps in \`palette.md\`.) The collision rule: when a series *means* good/bad (error rate, pass/fail) it wears
status tokens; when it's just "series 4" it wears categorical \u2014 never both in one chart.
`;
  var gNc = () => {};
  var bNc = `# Components \u2014 the pieces a chart is made of

A chart is built from these parts, assembled in plain HTML/SVG. Tier 0 is the
foundation everything mounts on; the System tier is what makes the method
portable (and is, itself, this skill).

## Tier 0 \u2014 Foundations
- **Color roles** \u2014 categorical (8 \xD7 light/dark), sequential ramps, diverging pairs,
  status (4), de-emphasis / "Other", grayscale chart furniture (axis/grid/label/surface).
  Defined as CSS custom properties at the top of the HTML \u2014 see \`palette.md\`.
- **Texture fill** \u2014 the directional fill + 45\xB0/135\xB0 rotations.
- **Chart container** \u2014 a \`<figure>\` (or card \`<div>\`) that owns responsive
  sizing, title/caption, and the **table-view toggle** (the accessibility twin
  of every chart). **Any fixed height includes the x-axis band** (plot height
  + axis labels) so the card never gets a nested vertical scroll; prefer
  letting the container grow with its content.
- **Legend** (toggle-to-isolate, texture-aware swatches) \xB7 **Tooltip** \xB7 **Axis** \xB7 **Data label**.

## Tier 1 \u2014 The charts people ask for
- **Bar chart** \u2014 grouped + stacked, thin-bar default, horizontal + vertical.
- **Line chart** \u2014 multi-series, soft-fill area variant, accessibility markers.
- **Stat tile** \u2014 value + delta + optional sparkline (the figure contract).
- **Meter / progress track** \u2014 same-ramp tracks.

## Tier 2 \u2014 Rounding out the kit
- **Area chart** (stacked, band-edge = line) \xB7 **Sparkline** \xB7 **Heatmap**
- **Scale legend** (sequential / diverging) \xB7 **Chart filters / time range** \xB7 **Empty state**

## System tier \u2014 becomes the skill
- **Six-checks validator** \u2014 \`scripts/validate_palette.js\` (palette validation).
- **Theming engine** \u2014 snap a customer's ramps to passing values (color-formula.md).
- **Chart-type heuristic** \u2014 pick the form (choosing-a-form.md).
- **Table-view generator** \u2014 the WCAG-clean equivalent of any chart.

Notes: part-to-whole rides on the stacked bar chart; donut stays deprioritized.
Small multiples is a layout pattern over these, not a separate piece. Scatter
joins Tier 2 if scatter-heavy surfaces land.
`;
  var _Nc = () => {};
  var TNc = `# Interaction \u2014 tooltips & filters

An HTML chart is interactive by default \u2014 the hover layer is part of the deliverable,
not an upgrade. Omitting it is the exception (a bare stat tile), never the default.
Design it with the same care as the static render.

## Tooltips & hover

Tooltips **enhance, they never gate**: every value a tooltip shows is also reachable
without it, through direct labels or the table view. Same details on keyboard focus
as on hover.

- **The crosshair finds the X.** A vertical hairline tracks the pointer and snaps to
  the nearest data position. Readers aim at a date, never at a 2px line.
- **On bars and cells, the mark is the hit target.** No crosshair \u2014 each bar, segment,
  dot, or heat-cell carries its own \`pointermove\`/\`focus\` tooltip showing category and
  value, and the hovered mark lifts (slight lighten or outline) so the reader sees it respond.
- **One tooltip, every series.** The readout lists every series at that X \u2014 the
  pointer never has to land on a line or a fill to get a value.
- **Labels are untrusted data \u2014 use \`textContent\`.** Series and category names
  often come from CSV headers, tool output, or API responses. Insert them into
  tooltip/legend/table DOM with \`textContent\` or \`createTextNode\`, never via
  \`innerHTML\` string concatenation.
- **Values lead, labels follow.** In the tooltip the value is the Strong,
  high-contrast element and the series name is secondary \u2014 the legend's hierarchy
  inverted, because here the reader has the series and wants the number.
- **Line keys, not boxes.** Tooltip rows key their series with a short stroke of the
  series color; at tooltip density a filled box is data-weight ink doing a label's
  job. (Legends still mirror the mark: rect for bars/areas, line for lines.)
- **The hit target is bigger than the mark.** A mark's hover/focus area includes its
  2px surface gap and then some \u2014 never only the painted pixels. An 8px scatter dot is a
  pinpoint nobody hits reliably; give each point a transparent hit area of at least
  **24px**, or \u2014 for dense scatter \u2014 a nearest-point / Voronoi layer so the pointer only
  has to be *closest*, not dead-center. (The crosshair already does this for the X on
  line and bar charts; scatter and bubble need the per-point version.)
- **A value pushed off its mark lives in the tooltip.** When a label won't fit inside a
  small bar (see \`marks-and-anatomy.md\`), that bar's hit area carries the value on hover
  and focus \u2014 the tooltip is its overflow home, and the table view keeps it reachable
  without hovering at all.

## Filters & time ranges

Every monitoring dashboard needs the same controls. These are **standard UI, not
chart marks** \u2014 build them with ordinary HTML form controls styled to match the
chart chrome. Dataviz only adds composition rules:

- **One row, above the charts.** Filters sit in a single left-aligned row above the
  content they scope \u2014 never inside a chart card, never per-chart. If one chart needs
  its own range, it's a different dashboard.
- **Date range first.** It's the filter every reader reaches for; presets (today,
  last 7 / 30 / 90 days) before a custom range.
- **Filters scope everything below them.** Every chart, stat, and table re-renders
  against the same slice, so the numbers always agree.
- **Refetch keeps the frame.** While data reloads, charts hold their previous render
  at reduced opacity \u2014 no skeleton, no layout jump, no flash.

A good date picker lists presets as rows (nobody fights a calendar grid for "last 30
days"), marks selection with a 16px bold check, keeps hover a ghost wash so it never
competes with selection, and tucks the custom range behind a hairline in the footer.
(See \`palette.md\` for the reference spec.)
`;
  var SNc = () => {};
  var vNc = `# Marks & anatomy

The quiet, considered look is a few fixed specs plus two pieces of negative space.
The data is the only thing allowed to be loud.

## Mark specs (fixed across every chart)

| Mark | Spec |
|---|---|
| Bar / column | **\u2264 24px thick** (cap it \u2014 never fill the slot; let the band's leftover be air); **4px rounded data-end, square at the baseline**; grows from a single baseline |
| Line | **2px**, round join/cap |
| Marker / end-dot | **\u2265 8px** (r \u2265 4), filled with the series color |
| Area fill | the series hue at **~10% opacity** (a wash, never a saturated block) |
| Gridlines / axes | one-step-off-surface gray, **hairline (1px), solid** (never dashed), recessive |

## The two spacers (white doing the separating)

- **Surface gap.** A **2px gap** in the surface color separates touching marks \u2014 every
  segment of a stacked bar, and every adjacent (touching) bar, the same width. Keep it
  one consistent width across a stack; neighbors one step apart read distinct because of
  the gap, not a stroke drawn around them.
- **Surface ring.** Dots and end-markers carry a **2px ring in the surface color**,
  so they stay legible where they cross a line or overlap each other. The ring is part
  of the mark's hover/hit target, not just spacing \u2014 see \`interaction.md\` (small dots
  are easy to under-size for hover).

Never draw a border around a mark to separate it. The gap and the ring are the
mechanism; a stroke adds data-weight ink that isn't data.

## Labels & legend

A **legend is always present for two or more series** \u2014 the dependable identity
channel; never make the reader rely on color-matching alone. Direct labels then ride
the marks to *supplement* it. **A single series needs no legend box**: there is only
one color, so the chart's title or subtitle already says what is plotted. A box with
one swatch restates the title and costs space.

- **Label selectively \u2014 never a number on every point.** A value beside every dot or
  segment is chaos and goes unread. Label the endpoint, the extreme, or the one series
  the story is about; let the axis, the legend, and the tooltip/table carry the rest.
  Direct labels work *because* they are sparing \u2014 flood the chart and they stop working.
- **Direct labels before gridlines; gridlines before a second axis.**
- **A label that won't fit doesn't get clipped \u2014 measure first.** Only place a label
  *inside* a bar or stacked segment when the rendered text fits with comfortable
  padding on both sides. If it doesn't fit: for a whole bar/column, move the label
  outside the bar end (or to the tooltip if there's no room outside either); for an
  *interior* stacked segment (which has no free end),
  skip the inline label and let the legend + tooltip carry it. Either way the value
  stays in the table view, so nothing is gated. Never use \`overflow: hidden\` on the
  segment to "solve" it \u2014 that crops the first/last characters and is worse than no
  label. Text never overflows or is clipped by its own mark.
- Bars \u2192 value at the tip. Columns \u2192 value on the cap. Lines \u2192 value at the end.
- Y-axis ticks: round to clean numbers (0 / 1,000 / 2,000), thousands-comma'd; they
  carry the values you didn't directly label, so keep them unless every value is labeled.
- **Text never wears the data color.** Marks \u2014 bars, lines, dots, area fills \u2014 carry
  the series color; labels, values, legends, and axis text use **text tokens**
  (primary / secondary / muted). A light categorical hue (yellow, aqua) is illegible
  as text on the surface. Identity comes from the colored mark *beside* the text \u2014 a
  dot, a short line-key, a swatch \u2014 never from coloring the text itself. A label set
  *inside* a colored fill (a stacked segment, a map tile) is the one exception: pick
  white or ink by the fill's luminance so it always clears contrast.
- **When end-labels collide, don't stack them.** Direct end-labels work when series
  separate at the right edge. When lines converge, nudging labels apart vertically
  detaches them from their lines and reads as noise \u2014 instead use **leader lines**
  (a thin connector from label to line-end), facet into **small multiples**, or fall
  back to the legend + tooltip. Past ~4 converging series, small multiples is usually right.

## Figures \u2014 when the form is a number

- **Stat tile** contract: \`label\` (sentence case, no trailing colon) \xB7 \`value\` (Sans
  semibold, auto-compact: 1,284 / 12.9K / $4.2M) \xB7 \`delta\` (optional; signed,
  vs a named period; color = direction \xD7 whether up is good) \xB7 \`trend\` (optional;
  12-point sparkline in the de-emphasis hue, current period in the accent).
- **Meter:** the fill carries severity (accent \u2192 warning \u2192 danger); the unfilled
  track is a **lighter step of the same ramp** (blue-on-blue, etc.) so state reads
  across the whole bar.
- **Hero figure.** The single number a dashboard leads with, \u226548px, in the same
  sans as everything else (never a display or serif face \u2014 it reads as off-brand
  decoration). Exactly one per view.
- **Proportional figures for big numbers; tabular only in columns.** A large
  standalone value (hero figure, stat-tile value) uses the font's default
  proportional figures \u2014 \`tabular-nums\` gives every digit the width of a \`0\`, so a
  number like \`121\` looks loose at display sizes. Reserve
  \`font-variant-numeric: tabular-nums\` for columns of numbers that must align
  vertically (table rows, axis ticks).

## Texture \u2014 the backup channel (opt-in)

Where hue fails \u2014 full-severity CVD, grayscale print, \`forced-colors\` \u2014 texture
carries identity. One directional hand-drawn fill, used at **45\xB0 and its 135\xB0 mirror
only** (never horizontal/vertical \u2014 those read as gridlines/bars). Inked tone-on-tone
(a step from the fill's own ramp), equal loudness across slots. On value scales the
texture is *ordered* (rotation steps with magnitude; arm angle carries the diverging
sign) so it never misstates the value. Triggered by an accessibility setting, print,
or \`forced-colors\` \u2014 never on by default. (See \`palette.md\`.)
`;
  var ENc = () => {};
  var CNc = `# Reference palette

This is the **reference instance** of the data-viz method: every parameter the
method needs, filled in with a validated default palette. The rest of the skill
is system-agnostic \u2014 **to target your brand, substitute this file's values** and
re-run the validator. Nothing else changes.

## How to use these values

Everything below is plain hex. In an HTML chart, **define the slots you use as
CSS custom properties in a local \`<style>\` block** at the top of the file, then
reference them by role throughout \u2014 so the light/dark values swap in one place,
and the chart body is written against roles rather than raw hex:

\`\`\`css
.viz-root {
  --surface-1:      #fcfcfb;   /* chart surface */
  --text-primary:   #0b0b0b;
  --text-secondary: #52514e;
  --series-1:       #2a78d6;   /* categorical slot 1 */
  /* \u2026only the roles this chart uses */
}
@media (prefers-color-scheme: dark) {
  .viz-root {
    --surface-1:      #1a1a19;
    --text-primary:   #ffffff;
    --text-secondary: #c3c2b7;
    --series-1:       #3987e5;
  }
}
\`\`\`

## Categorical palette

Both modes are selected. The dark column is the same eight hues stepped for the
dark surface, not a separate palette:

| Slot | Hue | Light | Dark |
|------|-----|-------|------|
| 1 | blue | \`#2a78d6\` | \`#3987e5\` |
| 2 | aqua | \`#1baf7a\` | \`#199e70\` |
| 3 | yellow | \`#eda100\` | \`#c98500\` |
| 4 | green | \`#008300\` | \`#008300\` |
| 5 | violet | \`#4a3aa7\` | \`#9085e9\` |
| 6 | red | \`#e34948\` | \`#e66767\` |
| 7 | magenta | \`#e87ba4\` | \`#d55181\` |
| 8 | orange | \`#eb6834\` | \`#d95926\` |

Light-mode worst adjacent CVD \u0394E is 24.2 \u2014 well clear of the \u226512 target. Three
light-mode slots (aqua, yellow, magenta) sit below 3:1 contrast on the light
surface: the **relief rule** applies (ship visible direct labels or the table
view). The dark steps were chosen for the dark band (OKLCH L \u2248 0.48\u20130.67, \u2265 3:1
on the dark surface) and validated as a set \u2014 worst adjacent \u0394E 10.3, the floor
band, so four-plus series lean on direct labels or texture in dark mode too.

The slot **ordering** is the CVD-safety mechanism, not cosmetic \u2014 it was derived
by enumerating orderings and picking the one that maximizes the minimum adjacent
\u0394E (see \`color-formula.md\` \xA7 Themes). When you swap in your brand's hues, do the
same: run the validator on candidate orderings and keep the best.

## Sequential hue

Default single hue: **blue**, light\u2192dark. When two sequential contexts appear at
once, the second takes the next categorical slot's hue (aqua), each as its own
one-hue ramp.

| step | hex | step | hex | step | hex | step | hex |
|---|---|---|---|---|---|---|---|
| 100 | \`#cde2fb\` | 250 | \`#86b6ef\` | 400 | \`#3987e5\` | 550 | \`#1c5cab\` |
| 150 | \`#b7d3f6\` | 300 | \`#6da7ec\` | 450 | \`#2a78d6\` | 600 | \`#184f95\` |
| 200 | \`#9ec5f4\` | 350 | \`#5598e7\` | 500 | \`#256abf\` | 650 | \`#104281\` |
| | | | | | | 700 | \`#0d366b\` |

The full 100\u2192700 range is for **sequential** encoding (continuous magnitude \u2014
heatmaps, choropleths) where the lightest step means "near zero" and is allowed
to recede toward the surface. For an **ordinal** ramp (discrete ordered marks \u2014
funnel stages, tiers \u2014 validated with \`--ordinal\`), the step nearest the surface
must still clear 2:1: on light, start no lighter than **step 250** (\`#86b6ef\`,
2.06:1); on dark, go no darker than **step 600** (\`#184f95\`, 2.15:1).

## Diverging pair

**blue \u2194 red** \u2014 warm/cool poles that read as opposite. Neutral midpoint is gray
(light \`#f0efec\`, dark \`#383835\`). Equal step count per arm. (blue\u2194aqua was
rejected \u2014 both cool, the midpoint doesn't read as "nothing".)

## Status palette (fixed \u2014 never themed)

| role | hex | light-surface contrast | dark-surface contrast |
|---|---|---|---|
| good | \`#0ca30c\` | 3.27 | 5.19 |
| warning | \`#fab219\` | 1.79 | 9.49 |
| serious | \`#ec835a\` | 2.57 | 6.60 |
| critical | \`#d03b3b\` | 4.68 | 3.62 |

Dark: same four steps \u2014 all clear 3:1 on the dark surface (\`#1a1a19\`) and remain
distinct from the dark categorical slots. On the light surface, warning and
serious are sub-3:1 by design; the **icon + label** pairing is the mitigation, so
a status color never carries meaning alone. These steps are deliberately distinct
from the categorical slots so a status color never impersonates a series.

## Texture fill (the accessibility channel)

One hand-drawn **"Lines"** fill, used at **45\xB0 and its 135\xB0 mirror only**. Inked
tone-on-tone (a darker step of the fill's own ramp). On value scales it is
*ordered* (rotation steps with magnitude; arm angle carries the diverging sign).
Triggered by the accessibility setting, print, or \`forced-colors\` \u2014 never
decorative, never on by default.

## Surfaces (for the validator)

- Light chart surface: \`#fcfcfb\`
- Dark chart surface: \`#1a1a19\`

These are the validator's built-in defaults. **When you swap in your own
palette, re-run against your own surfaces:**
\`--surface <your-light> --mode light\` and \`--surface <your-dark> --mode dark\` \u2014
contrast and band results are only meaningful against the surface the chart
actually renders on.

## Chart chrome & ink

| Role | Light | Dark |
|---|---|---|
| Chart surface | \`#fcfcfb\` | \`#1a1a19\` |
| Page plane | \`#f9f9f7\` | \`#0d0d0d\` |
| Primary ink | \`#0b0b0b\` | \`#ffffff\` |
| Secondary ink | \`#52514e\` | \`#c3c2b7\` |
| Muted (axis/labels) | \`#898781\` | \`#898781\` |
| Gridline (hairline) | \`#e1e0d9\` | \`#2c2c2a\` |
| Baseline / axis | \`#c3c2b7\` | \`#383835\` |
| Delta \u2191 good (success text) | \`#006300\` | \`#0ca30c\` |
| Border (hairline ring) | \`rgba(11,11,11,0.10)\` | \`rgba(255,255,255,0.10)\` |

## Filter controls

Filters are standard UI, not chart components \u2014 the chart layer only adds the
composition rules in \`interaction.md\`. A date-range control is a list of preset
rows (today, last 7/30/90 days, month-to-date) with selection marked by a 16px
bold check, hover as a ghost wash, and custom range behind a hairline in the
footer. Dimension filters are a standard combobox.

## Typeface & figures

Everything \u2014 including the hero figure \u2014 stays in the system sans: \`system-ui,
-apple-system, "Segoe UI", sans-serif\`. No display or serif face anywhere. Large
standalone numbers (hero figure, stat-tile values) use the default proportional
figures; reserve \`font-variant-numeric: tabular-nums\` for columns that must align
vertically (table rows, axis ticks). Substitute your brand's UI sans here.
`;
  var wNc = () => {};
  var xNc = `---
name: Data Visualization
description: >
  Produce a chart, graph, dashboard, or any data visualization that reads as one
  system \u2014 elegant, accessible, and consistent in light and dark \u2014 BRAND-NEUTRAL,
  shipping a placeholder palette to swap for your own. Read this BEFORE generating
  ANY chart (bar, line, area, heatmap, scatter,
  sparkline, donut), choosing chart colors, building a stat tile / meter / KPI row,
  or laying out a dashboard. Teaches a design-system-AGNOSTIC method: a form
  heuristic, a color formula with a runnable validator, mark specs, and interaction
  rules. The method is invariant; a design system plugs in its own ramps and
  surfaces. A validated default palette is documented in \`references/palette.md\`
  \u2014 swap that file's values for your brand's. Triggers on: "chart", "graph", "plot", "data viz", "dashboard",
  "analytics", "visualize data", "categorical colors", "sequential / diverging
  palette", "stat tile", "sparkline", "heatmap", "legend", "axis", "tooltip",
  "chart colors", "color by series".
---

# Data Visualization

A chart is **read by people and executed by you**. This skill turns "make it look
good" into a procedure with checks, so the result is right by construction rather
than by taste.

**The method here is design-system-agnostic.** Nothing in the procedure, the form
heuristic, the six checks, or the mark specs is specific to one product. A design
system supplies a small set of *parameters* (its ramps, a categorical order, a
diverging pair, a status palette, a texture, its surfaces, its filter components);
the method consumes them unchanged. A **validated default palette** is the
reference instance, fully specified in \`references/palette.md\`. To target your
brand, read that file's structure and substitute its values \u2014 touch nothing else.

> The single most important habit: **the color part is computable, so compute it.**
> Never eyeball whether a palette is colorblind-safe \u2014 run \`scripts/validate_palette.js\`.

## The procedure \u2014 do these in order

Color comes LAST. Most bad charts pick colors first.

1. **Pick the form.** What is the data's job \u2014 magnitude, identity, polarity, a
   single headline, change-over-time? The job picks the chart type, and sometimes
   the answer is *not a chart* (a stat tile or hero number). \u2192 \`references/choosing-a-form.md\`
2. **Assign color by the job it does.** Categorical (identity), sequential
   (magnitude), diverging (polarity), or status (state) \u2014 each has one rule.
   Assign categorical hues in fixed order, never cycled. \u2192 \`references/color-formula.md\`
3. **VALIDATE the palette \u2014 run the script, don't reason about \u0394E.**
   \`node scripts/validate_palette.js "<hex,hex,\u2026>" --mode light\` (relative to
   this skill's base directory \u2014 or load it as \`<script type="module">\` in the
   chart's own page, where it reads
   \`data-palette\` off \`<body>\` and logs a \`console.table\` report). It returns
   pass/fail on the lightness band, chroma floor, adjacent-pair CVD separation,
   and contrast. Fix anything that FAILs before continuing. Re-run for
   \`--mode dark\` with that mode's surface.
4. **Apply mark specs & spacers.** Thin marks, 4px rounded data-ends anchored to
   the baseline, 2px lines, \u22658px markers, a 2px surface gap between fills (stacked
   segments and adjacent bars alike) and a 2px surface ring on overlapping marks,
   selective direct labels. \u2192 \`references/marks-and-anatomy.md\`
5. **Add the hover layer \u2014 by default.** An HTML/SVG chart *is* interactive; ship
   a crosshair+tooltip on line/area and a per-mark hover tooltip on bar/dot/cell.
   The only form that skips it is a bare stat tile with no plot. Hit targets bigger
   than the mark; filters in one row above the charts. \u2192 \`references/interaction.md\`
6. **Final accessibility pass.** For \u2265 2 series a legend is always present and \u2264 4
   are also direct-labeled (a single series needs no legend box \u2014 the title names
   it), so identity is never color-alone; a table view exists; dark mode is **selected** \u2014 its own
   steps from the same ramps, validated against the dark surface, not an automatic
   flip; texture is available for the CVD/print/forced-colors case.
7. **Render it and look at it.** The validator checks color, not layout \u2014 open or
   screenshot the output and eyeball it for label collisions, geometry, and overflow
   before calling it done.

Then check the result against **\`references/anti-patterns.md\`** \u2014 it is the catalog
of what goes wrong. If your chart matches an entry, it's wrong.

## Non-negotiables (true in every design system)

- **Assign categorical hues in fixed order, never cycled.** A 9th series is never a
  generated hue \u2014 it folds into "Other," small multiples, or composite encoding.
- **One axis.** Never a dual-axis chart (two y-scales). Two measures of different
  scale \u2192 two charts, small multiples, or indexed to a common base. *(This is the
  #1 chart mistake \u2014 see anti-patterns.)*
- **Color follows the entity, never its rank.** A filter that changes the series
  count must not repaint the survivors.
- **Sequential = one hue, light\u2192dark. Diverging = two hues + a neutral gray
  midpoint.** Never a rainbow; never a hue at the diverging midpoint.
- **Run the validator before shipping any categorical palette.** CVD \u2265 12 is the
  target; 8\u201312 is a floor that is legal ONLY with secondary encoding. A contrast WARN
  obligates visible labels or a table view \u2014 it is not dismissable.
- **Thin marks; a legend always present for \u2265 2 series (none for one), with
  selective direct labels (never a number on every point); recessive grid/axes.**
- **Text wears text tokens, never the series color** \u2014 values, labels, and legends
  stay in primary/secondary/muted ink; a colored mark beside them carries identity.
- **Status colors are reserved** (good/warning/serious/critical) and never reused
  for "series 4"; they ship with an icon + label, never color alone.

## Plugging in a design system

The method is invariant; only these parameters change per system. The reference
instance \u2014 every value filled in \u2014 is \`references/palette.md\`.

| Parameter | What the system provides |
|---|---|
| **Ramps** | the hue scales (named steps) the palette draws from |
| **Categorical theme** | the fixed hue order (a named theme); default + alternates |
| **Sequential hue** | the default single hue for magnitude |
| **Diverging pair** | two warm/cool poles + a neutral midpoint |
| **Status palette** | good / warning / serious / critical \u2014 steps distinct from categorical |
| **Texture fill** | one directional hand-drawn fill, used at 45\xB0 / 135\xB0 |
| **Surfaces** | light & dark chart-surface colors (the validator needs these) |
| **Filter controls** | date-range & dimension controls (behavioral spec in \`interaction.md\`) |

To onboard a new system: fill those rows, feed its ramps to the validator, and let
it snap each slot to the nearest passing step. Structure and rules stay as written.

## Reference files

| File | What it answers |
|------|-----------------|
| \`references/choosing-a-form.md\` | Which chart type / is it even a chart? |
| \`references/color-formula.md\` | The four jobs, the six checks, snap-to-passing |
| \`references/marks-and-anatomy.md\` | Mark specs, spacers, labels, figures, hero number |
| \`references/interaction.md\` | Tooltips & hover, filters & time ranges |
| \`references/components.md\` | The pieces a chart is made of \u2014 build each in plain HTML |
| \`references/anti-patterns.md\` | **What goes wrong \u2014 check every chart against this** |
| \`references/palette.md\` | **The reference palette instance** \u2014 every parameter, filled in; swap for your brand's |
| \`scripts/validate_palette.js\` | Runnable six-checks validator (run it; don't eyeball) |
`;
  var RNc = () => {};