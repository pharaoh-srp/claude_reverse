  __export(qYo, {
    resolveRoot: () => resolveRoot,
    pluginEvalInitHandler: () => pluginEvalInitHandler,
    pluginEvalHandler: () => pluginEvalHandler
  });
  async function resolveRoot(e) {
    if (e.includes(Nie.default.sep) || e.includes("/")) {
      return {
        kind: "path",
        root: e
      };
    }
    let t = L$o(e);
    if (!t && e.includes("@")) {
      return {
        kind: "path",
        root: e
      };
    }
    if (t && t.marketplace !== "skills-dir") {
      let i = Kw().plugins[e];
      if (!i || i.length === 0) {
        return {
          kind: "path",
          root: e
        };
      }
      return {
        kind: "plugin",
        root: (i.filter(gfe)[0] ?? i[0]).installPath,
        pluginId: e
      };
    }
    let r = (await loadSkillsAsPlugins()).plugins.find(i => i.name === (t ? t.name : e));
    if (t) {
      return r ? {
        kind: "plugin",
        root: r.path,
        pluginId: r.source
      } : {
        kind: "path",
        root: e
      };
    }
    let s = [...Object.keys(Kw().plugins).filter(i => L$o(i)?.name === e), ...(r ? [r.source] : [])];
    if (s.length === 0) {
      return {
        kind: "path",
        root: e
      };
    }
    if (s.length > 1) {
      return {
        kind: "ambiguous",
        matches: s
      };
    }
    if (r) {
      return {
        kind: "plugin",
        root: r.path,
        pluginId: r.source
      };
    }
    return resolveRoot(s[0]);
  }
  async function pluginEvalHandler(e, t) {
    let n = e ?? Nt();
    let r;
    if (e) {
      let l = await resolveRoot(e);
      if (l.kind === "ambiguous") {
        process.stderr.write(`Error: plugin name "${e}" is ambiguous \u2014 matches ${l.matches.join(", ")}. Specify the full plugin@marketplace identifier.
`);
        process.exit(1);
      }
      if (n = l.root, l.kind === "plugin") {
        r = l.pluginId;
      }
    }
    if (t.runs !== undefined && (!Number.isInteger(t.runs) || t.runs < 1)) {
      process.stderr.write(`Error: --runs must be a positive integer
`);
      process.exit(1);
    }
    if (t.threshold !== undefined && (!Number.isFinite(t.threshold) || t.threshold < 0 || t.threshold > 1)) {
      process.stderr.write(`Error: --threshold must be between 0 and 1
`);
      process.exit(1);
    }
    if (t.maxCostUsd !== undefined && (!Number.isFinite(t.maxCostUsd) || t.maxCostUsd < 0)) {
      process.stderr.write(`Error: --max-cost-usd must be a non-negative number
`);
      process.exit(1);
    }
    let o = new AbortController();
    let s = () => {
      if (!o.signal.aborted) {
        process.stderr.write(`
Interrupted \u2014 finishing up\u2026
`);
        o.abort();
      }
    };
    process.on("SIGINT", s);
    let i = t.ablation ?? (r ? "with-without" : "none");
    let a = t.noScaffold ?? true;
    if (t.noScaffold === false) {
      process.stderr.write(`Note: --scaffold runs each case's scaffold_script as you. Only use it on case files you (or your org) authored.
`);
    }
    try {
      let {
        report: l,
        exitCode: c,
        errors: u,
        root: d
      } = await LTc({
        rootPath: n,
        caseGlob: t.case,
        tags: t.tag,
        runs: t.runs,
        model: t.model,
        judgeModel: t.judgeModel,
        maxCostUsd: t.maxCostUsd,
        threshold: t.threshold ?? 1,
        allowTools: t.allowTools ?? [],
        noScaffold: a,
        keepTemp: t.keepTemp ?? false,
        keepFailedRuns: !t.json,
        verbose: t.verbose ?? false,
        ablation: i,
        onLine: h => {
          if (!t.json) {
            process.stderr.write(`${h}
`);
          }
        },
        signal: o.signal
      });
      if (l.cases.length === 0 && u.length === 0 && !l.partial && !o.signal.aborted) {
        let h = [...(t.case ? [`--case "${t.case}"`] : []), ...(t.tag ? t.tag.map(y => `--tag "${y}"`) : [])];
        let g = h.length > 0 ? ` matching ${h.join(" ")}` : "";
        if (process.stderr.write(`No eval cases found${g} under ${d}.
`), !t.json) {
          process.stderr.write(h.length > 0 ? `Run without ${h.length > 1 ? "the filters" : ii(h[0], " ")} to see all cases.
` : `A case is a directory under evals/ containing case.yaml or prompt.md.
` + (r ? "" : "Run `claude plugin eval init` for a guided interview, or `claude plugin eval init --bare <name>` to scaffold a blank case.\n"));
        } else {
          process.stdout.write(`${De(l, undefined, 2)}
`);
        }
        await GB("cli_plugin_eval", "no_cases");
        return bR(1);
      }
      let p = r ? Nt() : d;
      let m = t.outputDir ?? Nie.default.join(p, "evals", "results", l.started_at.replace(/[:.]/g, "-"));
      let f = De(l, undefined, 2);
      if (l.cases.length > 0 || u.length === 0) {
        try {
          await Lie.mkdir(m, {
            recursive: true
          });
          await Lie.writeFile(Nie.default.join(m, "aggregate-result.json"), f);
        } catch (h) {
          process.stderr.write(`warning: could not write results: ${String(h)}
`);
        }
      }
      if (t.json) {
        for (let h of u) {
          process.stderr.write(`\u2717 ${h.file}: ${h.error}
`);
        }
        if (u.length > 0) {
          process.stderr.write(`${u.length} case file(s) failed to parse
`);
        }
        await F5(`${f}
`);
      } else {
        if (await F5(`
${OTc(l)}
`), u.length > 0) {
          process.stdout.write(`
${u.length} case file(s) failed to parse \u2014 see above.
`);
        }
        if (l.cases.some(g => g.score < (t.threshold ?? 1) || g.runs.some(y => y.error)) && !t.keepTemp) {
          process.stdout.write(`
Re-run with --keep-temp to preserve each run's sandbox (workspace + trace.jsonl) for debugging.
`);
        }
      }
      if (o.signal.aborted) {
        await GB("cli_plugin_eval", "interrupted");
        return bR(130);
      }
      if (c === 0) {
        await nS("cli_plugin_eval");
      } else if (c === 2) {
        await GB("cli_plugin_eval", "cost_ceiling");
      } else {
        await ou("cli_plugin_eval", "cases_failed");
      }
      return bR(c);
    } catch (l) {
      await ou("cli_plugin_eval", "exception");
      process.stderr.write(`Error: ${l instanceof Error ? l.message : String(l)}
`);
      return bR(1);
    } finally {
      process.off("SIGINT", s);
    }
  }
  async function pluginEvalInitHandler(e, t = {}) {
    let n = Nt();
    let r = process.stdin.isTTY && process.stdout.isTTY;
    if (!t.bare && (t.forceInteractive || r)) {
      await STf(n, e);
      await bR(typeof process.exitCode === "number" ? process.exitCode : 0);
      return;
    }
    if (!e) {
      process.stderr.write(r ? `A case name is required for --bare. Run without --bare for the interview, which writes one case per input.
` : `A case name is required when no TTY is available (the interview needs an interactive terminal). Pass a name to write a blank template.
`);
      process.exit(1);
    }
    if (!_Tf.test(e)) {
      process.stderr.write(`Error: case name "${e}" is invalid \u2014 use letters, digits, '.', '_', '-' only (no '/', no '..')
`);
      process.exit(1);
    }
    if (!t.bare && !r) {
      process.stderr.write(`No TTY available \u2014 writing a blank template. Re-run in a terminal (or pass --interactive) for the authoring interview.
`);
    }
    let s = Nie.default.join(n, "evals", e);
    let i = Nie.default.join(s, "prompt.md");
    let a = Nie.default.join(s, "graders", "criteria.md");
    let l = false;
    try {
      await Lie.mkdir(Nie.default.dirname(s), {
        recursive: true
      });
      await Lie.mkdir(s);
      l = true;
      await Lie.mkdir(Nie.default.join(s, "graders"));
      await Lie.writeFile(i, gTf);
      await Lie.writeFile(a, yTf);
      process.stdout.write(`Created ${Nie.default.relative(n, i)} and ${Nie.default.relative(n, a)}
`);
      await nS("cli_plugin_eval_init");
      return bR(0);
    } catch (c) {
      if (l) {
        await Lie.rm(s, {
          recursive: true,
          force: true
        }).catch(() => {});
      }
      await ou("cli_plugin_eval_init", "write_failed");
      process.stderr.write(`Error: ${c instanceof Error ? c.message : String(c)}
`);
      return bR(1);
    }
  }
  async function STf(e, t) {
    let n = WSc(e, t);
    let r = process.execPath;
    let s = [...(rm() || !process.argv[1] ? [] : [process.argv[1]]), "--append-system-prompt", n, ...(doesEnterpriseMcpConfigExist() ? [] : ["--strict-mcp-config"]), "--", "Let's set up evals for this plugin."];
    let i = BTc.spawn(r, s, {
      cwd: e,
      stdio: "inherit"
    });
    let a = null;
    try {
      if ([a] = await $Tc.once(i, "close"), a === 0) {
        await nS("cli_plugin_eval_init_interactive");
      } else {
        await ou("cli_plugin_eval_init_interactive", "nonzero_exit");
      }
    } catch (l) {
      await ou("cli_plugin_eval_init_interactive", "spawn_failed");
      process.stderr.write(`Failed to start interview session: ${l instanceof Error ? l.message : String(l)}
`);
    }
    process.exitCode = typeof a === "number" ? a : 1;
  }
  var BTc;
  var $Tc;
  var Lie;
  var Nie;
  var gTf = `---
max_turns: 10
allowed_tools: [Read, Glob, Grep, Skill]
---

TODO: describe what the agent should do
`;
  var yTf = `---
type: llm
weight: 1
---

TODO: describe what a successful response looks like
`;
  var _Tf;
  var WYo = __lazy(() => {
    ln();
    UTc();
    HYo();
    Iw();
    vo();
    Qk();
    Kf();
    rie();
    xg();
    Zn();
    SL();
    BTc = require("child_process");
    $Tc = require("events");
    Lie = require("fs/promises");
    Nie = __toESM(require("path"));
    _Tf = /^[A-Za-z0-9][A-Za-z0-9._-]*$/;
  });
  function HTc(e) {
    let t = () => new ic("--cowork", "Use cowork_plugins directory").hideHelp();
    let n = e.command("plugin").alias("plugins").description("Manage Claude Code plugins").configureHelp($Ce());
    n.command("init <name>").alias("new").description("Scaffold a new plugin at ~/.claude/skills/<name>/ (auto-loads next session as <name>@skills-dir)").option("--description <text>", "Manifest description").option("--author <name>", "Author name (default: git config user.name)").option("--author-email <email>", "Author email (default: git config user.email)").option("--with <components...>", `Also scaffold: ${Jnn.join(", ")}`).option("-f, --force", "Overwrite an existing .claude-plugin/ at the target").action(async (s, i) => {
      let [{
        pluginInitHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("validate <path>").description("Validate a plugin or marketplace manifest").option("--strict", "Treat warnings as errors (exit 1). Use in CI to fail on unrecognized fields, missing metadata, and other issues that the runtime tolerates.").addOption(t()).action(async (s, i) => {
      let [{
        pluginValidateHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("tag [path]").description("Create a {name}--v{version} git tag for a plugin release, validating that plugin.json and any enclosing marketplace entry agree").option("--push", "Push the tag to --remote after creating it").option("--dry-run", "Print what would be tagged without creating it").option("-f, --force", "Skip the dirty-working-tree and tag-already-exists checks").option("-m, --message <msg>", "Tag annotation message (use %s for the version)").option("--remote <name>", "Remote to push to with --push", "origin").action(async (s, i) => {
      let [{
        pluginTagHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("list").description("List installed plugins").option("--json", "Output as JSON").option("--available", "Include available plugins from marketplaces (requires --json)").addOption(t()).action(async s => {
      let [{
        pluginListHandler: i
      }, {
        createSubcommandRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await i(a, s);
      W0();
    });
    {
      let s = () => {
        if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_walnut_spire", false)) {
          Es("`plugin eval` is currently in early access");
        }
      };
      n.command("eval [target]").description("Run eval cases (evals/**/case.yaml or evals/**/prompt.md + graders/*.md) against a plugin and report scored results. " + "Target is a path, a plugin name, or a `plugin@marketplace` id \u2014 installed and skills-dir plugins both resolve (and add a no-plugin baseline arm)").option("--case <glob>", "Filter cases by name glob").option("--tag <tag...>", "Filter cases by tag (repeatable)").option("--runs <n>", "Override per-case runs (default: case.runs ?? 3)").option("--model <model>", "Override model for all cases").option("--judge-model <model>", "Override LLM-grader model (default: haiku)").option("--max-cost-usd <usd>", "Optional hard cost ceiling; abort and report partial results if hit (exit 2). " + "Overrun is bounded to one agent run \u2014 when that run breaches, paid graders (llm/baseline) are skipped while free graders still score it. " + "Runs are already bounded by max_turns and timeout_seconds \u2014 only set this when you need a strict budget").option("--output-dir <dir>", "Directory for aggregate-result.json (default: ./evals/results/<timestamp>/)").option("--json", "Emit aggregate-result.json to stdout (for CI)").option("--threshold <0..1>", "Exit 1 if any case score is below this threshold (default: 1.0)").option("--allow-tools <tools...>", "Operator grant for gated tools (Bash, Write, Edit, WebFetch, mcp__*). Supports Tool(pattern:*) syntax").option("--scaffold", "Run each case's scaffold_script (runs author-supplied bash as you; off by default \u2014 only use on case files you authored)").option("--no-scaffold", "Explicitly skip scaffold_script").option("--ablation <mode>", "Run a no-plugin baseline arm and report the score delta (none | with-without; default: with-without when targeting a plugin by name (installed or skills-dir), none for a path)").option("--keep-temp", "Preserve scaffold dirs for debugging").option("--verbose", "Stream the trace as it runs").action(async (a, l) => {
        if (s(), l.ablation !== undefined && l.ablation !== "none" && l.ablation !== "with-without") {
          Es('--ablation must be "none" or "with-without"');
        }
        let {
          pluginEvalHandler: c
        } = await Promise.resolve().then(() => (WYo(), qYo));
        await c(a, {
          ...l,
          runs: l.runs ? parseInt(l.runs, 10) : undefined,
          maxCostUsd: l.maxCostUsd ? parseFloat(l.maxCostUsd) : undefined,
          threshold: l.threshold ? parseFloat(l.threshold) : undefined,
          noScaffold: l.scaffold === undefined ? undefined : !l.scaffold,
          ablation: l.ablation
        });
      }).command("init [name]").description("Author an eval suite under evals/ via an interview that sources inputs and designs graders. Use --bare <name> for a blank single-case template.").option("--bare", "Write a blank template (prompt.md + graders/criteria.md) instead of running the interview").addOption(new ic("-i, --interactive", "Force the interview (default when a TTY is available)").hideHelp()).addOption(new ic("--interview", "Alias for --interactive").hideHelp()).action(async (a, l) => {
        s();
        let {
          pluginEvalInitHandler: c
        } = await Promise.resolve().then(() => (WYo(), qYo));
        await c(a, {
          bare: l.bare,
          forceInteractive: l.interactive || l.interview
        });
        W0();
      });
    }
    n.command("details <name>").description("Show a plugin's component inventory and projected token cost").addOption(t()).action(async (s, i) => {
      let [{
        pluginDetailsHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(l, s, i);
      W0();
    });
    let o = n.command("marketplace").description("Manage Claude Code marketplaces").configureHelp($Ce());
    o.command("add <source>").description("Add a marketplace from a URL, path, or GitHub repo").addOption(t()).option("--sparse <paths...>", "Limit checkout to specific directories via git sparse-checkout (for monorepos). Example: --sparse .claude-plugin plugins").option("--scope <scope>", "Where to declare the marketplace: user (default), project, or local").action(async (s, i) => {
      let [{
        marketplaceAddHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    o.command("list").description("List all configured marketplaces").option("--json", "Output as JSON").addOption(t()).action(async s => {
      let [{
        marketplaceListHandler: i
      }, {
        createSubcommandRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await i(a, s);
      W0();
    });
    o.command("remove <name>").alias("rm").description("Remove a configured marketplace").option("--scope <scope>", "Remove the marketplace declaration from a specific settings scope: user, project, or local. Omit to remove it from every scope.").addOption(t()).action(async (s, i) => {
      let [{
        marketplaceRemoveHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
      W0();
    });
    o.command("update [name]").description("Update marketplace(s) from their source - updates all if no name specified").addOption(t()).action(async (s, i) => {
      let [{
        marketplaceUpdateHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("install <plugin>").alias("i").description("Install a plugin from available marketplaces (use plugin@marketplace for specific marketplace)").option("-s, --scope <scope>", "Installation scope: user, project, or local", "user").option("--config <key=value>", "Set a userConfig option declared in the plugin's manifest (repeatable). Values are validated against the schema and stored via the same path as the interactive /plugin configure flow.", (s, i = []) => [...i, s]).addOption(t()).action(async (s, i) => {
      let [{
        pluginInstallHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("uninstall <plugin>").alias("remove").alias("rm").description("Uninstall an installed plugin").option("-s, --scope <scope>", "Uninstall from scope: user, project, or local", "user").option("--keep-data", "Preserve the plugin's persistent data directory (~/.claude/plugins/data/{id}/)").option("--prune", "Also remove auto-installed dependencies that are no longer needed (requires -y in non-interactive contexts)").option("-y, --yes", "Skip the --prune confirmation prompt (required when stdin or stdout is not a TTY)").addOption(t()).action(async (s, i) => {
      let [{
        pluginUninstallHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("prune").alias("autoremove").description("Remove auto-installed dependencies that are no longer needed").option("-s, --scope <scope>", "Prune at scope: user, project, or local", "user").option("--dry-run", "List what would be removed without removing").option("-y, --yes", "Skip the confirmation prompt (required when stdin or stdout is not a TTY)").addOption(t()).action(async s => {
      let [{
        pluginPruneHandler: i
      }, {
        createSubcommandRoot: a
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await i(await a(), s);
    });
    n.command("enable <plugin>").description("Enable a disabled plugin").option("-s, --scope <scope>", `Installation scope: ${VALID_INSTALLABLE_SCOPES.join(", ")} (default: auto-detect)`).addOption(t()).action(async (s, i) => {
      let [{
        pluginEnableHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
      W0();
    });
    n.command("disable [plugin]").description("Disable an enabled plugin").option("-a, --all", "Disable all enabled plugins").option("-s, --scope <scope>", `Installation scope: ${VALID_INSTALLABLE_SCOPES.join(", ")} (default: auto-detect)`).addOption(t()).action(async (s, i) => {
      let [{
        pluginDisableHandler: a
      }, {
        createSubcommandRoot: l
      }] = await Promise.all([Promise.resolve().then(() => (NH(), MH)), Promise.resolve().then(() => (PE(), IE))]);
      await a(await l(), s, i);
    });
    n.command("update <plugin>").description("Update a plugin to the latest version (restart required to apply)").option("-s, --scope <scope>", `Installation scope: ${VALID_UPDATE_SCOPES.join(", ")} (default: user)`).addOption(t()).action(async (s, i) => {
      let {
        pluginUpdateHandler: a
      } = await Promise.resolve().then(() => (NH(), MH));
      await a(s, i);
    });
  }
  var jTc = __lazy(() => {
    efr();
    $n();
    AYo();
    IYo();
    SL();
    rfr();
  });
  function Qnn() {
    let e = getAPIProvider();
    if (e !== "firstParty") {
      return `Cloud sessions aren't available with ${THIRD_PARTY_PROVIDER_LABELS[e]}. They run on Anthropic's infrastructure and require an Anthropic account.`;
    }
    return policyDeniedReason("allow_remote_sessions", "Cloud sessions", "are");
  }
  var GYo = __lazy(() => {
    Kc();
    Ds();
  });
  function qTc(e) {
    let t;
    try {
      t = new URL(e);
    } catch {
      return `could not parse ${xfr(e)} as a URL`;
    }
    if (TTf.vZc(t.hostname)) {
      if (t.protocol !== "wss:" && t.protocol !== "https:") {
        return `scheme ${xfr(t.protocol)} is not permitted for host ${xfr(t.hostname)}; only wss:// and https:// are accepted`;
      }
      return null;
    }
    return `host ${xfr(t.hostname)} is not an approved Anthropic endpoint`;
  }
  var xfr = e => JSON.stringify(e);
  var TTf;
  var WTc = __lazy(() => {
    Uc();
    TTf = new Set(["api.anthropic.com", "api-staging.anthropic.com", ...ALLOWED_OAUTH_BASE_URLS.map(e => new URL(e).hostname)]);
  });
  function zYo() {
    return findGitRootRecheckingNegative(Nt()) !== null;
  }
  var MBe = __lazy(() => {
    ln();
    vo();
    na();
  });
  function GTc() {
    if (process.env.NODE_EXTRA_CA_CERTS) {
      return;
    }
    let e = ETf();
    if (e) {
      process.env.NODE_EXTRA_CA_CERTS = e;
      logForDebugging(`CA certs: Applied NODE_EXTRA_CA_CERTS from config to process.env: ${e}`);
    }
  }
  function ETf() {
    try {
      let t = getGlobalConfig()?.env;
      let r = (qf("userSettings") ? getSettingsForSource("userSettings") : undefined)?.env;
      logForDebugging(`CA certs: Config fallback - globalEnv keys: ${t ? Object.keys(t).join(",") : "none"}, settingsEnv keys: ${r ? Object.keys(r).join(",") : "none"}`);
      let o = r?.NODE_EXTRA_CA_CERTS || t?.NODE_EXTRA_CA_CERTS;
      if (o) {
        logForDebugging(`CA certs: Found NODE_EXTRA_CA_CERTS in config/settings: ${o}`);
      }
      return o;
    } catch (e) {
      logForDebugging(`CA certs: Config fallback failed: ${e}`, {
        level: "error"
      });
      return;
    }
  }
  var VTc = __lazy(() => {
    je();
    nf();
  });
  function zTc() {
    return;
  }
  var KTc = __lazy(() => {
    je();
  });
  async function ZTc(e, t) {
    let n = await xTf(e, t);
    if (n.startsWith("<")) {
      return n;
    }
    let r = await kTf(n);
    if (r === undefined) {
      return "<pid-not-found>";
    }
    let o;
    try {
      o = RTf(await NBe.readFile(`/proc/${r}/comm`, "utf8"));
    } catch {
      return "<comm-unreadable>";
    }
    return o.length > 0 ? o : "<comm-unreadable>";
  }
  function RTf(e) {
    return e.replace(/[^\x20-\x7e]|</g, "").slice(0, 64);
  }
  async function xTf(e, t) {
    let n = JTc(e);
    let r = JTc(t);
    let o = false;
    for (let s of ["/proc/net/tcp", "/proc/net/tcp6"]) {
      let i;
      try {
        i = await NBe.readFile(s, "utf8");
      } catch {
        continue;
      }
      o = true;
      for (let a of i.split(`
`)) {
        let l = a.trim().split(/\s+/);
        if (l.length < 10 || !l[1].endsWith(":" + n) || !l[2].endsWith(":" + r)) {
          continue;
        }
        let c = l[9];
        if (c !== "0") {
          return c;
        }
      }
    }
    return o ? "<inode-not-found>" : "<proc-net-unreadable>";
  }
  function JTc(e) {
    return e.toString(16).toUpperCase().padStart(4, "0");
  }
  async function kTf(e) {
    let t = `socket:[${e}]`;
    let n;
    try {
      n = await NBe.readdir("/proc");
    } catch {
      return;
    }
    let r = n.filter(l => /^\d+$/.test(l));
    let o = await Promise.all(r.map(l => NBe.readdir(`/proc/${l}/fd`).catch(() => [])));
    let s = [];
    for (let l = 0; l < r.length; l++) {
      for (let c of o[l]) {
        s.push({
          pid: r[l],
          fd: c
        });
      }
    }
    let a = (await Promise.all(s.map(l => NBe.readlink(`/proc/${l.pid}/fd/${l.fd}`).catch(() => "")))).indexOf(t);
    return a === -1 ? undefined : s[a].pid;
  }
  var NBe;
  var eEc = __lazy(() => {
    NBe = require("fs/promises");
  });
  function JYo(e) {
    let t = e.length;
    let n = [];
    let r = t;
    while (r > 127) {
      n.push(r & 127 | 128);
      r >>>= 7;
    }
    n.push(r);
    let o = new Uint8Array(1 + n.length + t);
    o[0] = 10;
    o.set(n, 1);
    o.set(e, 1 + n.length);
    return o;
  }
  function iEc(e, t = 0) {
    let n = [16, e];
    if (t !== 0) {
      n.push(24, t);
    }
    return new Uint8Array(n);
  }
  function KYo(e, t, n) {
    let r = 0;
    let o = 0;
    let s = t;
    while (s < e.length) {
      let i = e[s];
      if (r += (i & 127) * 2 ** o, s++, (i & 128) === 0) {
        return {
          value: r,
          next: s
        };
      }
      if (o += 7, o > n) {
        return null;
      }
    }
    return null;
  }
  function LTf(e) {
    let t = {
      data: e.subarray(0, 0),
      control: 0,
      version: 0
    };
    let n = 0;
    while (n < e.length) {
      let r = KYo(e, n, 63);
      if (!r) {
        return null;
      }
      let o = Math.floor(r.value / 8);
      let s = r.value & 7;
      switch (n = r.next, s) {
        case 0:
          {
            let i = KYo(e, n, 63);
            if (!i) {
              return null;
            }
            if (n = i.next, o === 2) {
              t.control = i.value;
            } else if (o === 3) {
              t.version = i.value;
            }
            break;
          }
        case 1:
          if (n + 8 > e.length) {
            return null;
          }
          n += 8;
          break;
        case 2:
          {
            let i = KYo(e, n, 28);
            if (!i) {
              return null;
            }
            if (n = i.next, n + i.value > e.length) {
              return null;
            }
            if (o === 1) {
              t.data = e.subarray(n, n + i.value);
            }
            n += i.value;
            break;
          }
        case 5:
          if (n + 4 > e.length) {
            return null;
          }
          n += 4;
          break;
        default:
          return null;
      }
    }
    return t;
  }
  function jCe(e, t, n, r) {
    if (e.failures.push({
      ts: new Date().toISOString(),
      kind: t,
      detail: n,
      host: r
    }), e.failures.length > 20) {
      e.failures.shift();
    }
  }
  function aEc(e, t, n, r, o) {
    e.write(`HTTP/1.1 ${t} ${n}\r
Content-Type: ${r}\r
Content-Length: ${Buffer.byteLength(o)}\r
Connection: close\r
\r
` + o);
  }
  function GJe(e, t, n, r) {
    aEc(e, t, n, "text/plain; charset=utf-8", `agent-proxy relay: ${r}
GET /__agentproxy/status on this proxy port shows proxy state and recent failures.
`);
  }
  function UTf(e, t, n) {
    return {
      connectBuf: Buffer.alloc(0),
      pending: [],
      pendingBytes: 0,
      wsOpen: false,
      established: false,
      closed: false,
      connectLine: "",
      clientProcess: "<pending>",
      wsAttempt: 0,
      paused: false,
      limits: e,
      pool: t,
      finSeen: false,
      localClosed: false,
      ctx: n
    };
  }
  async function lEc(e) {
    let t = "Basic " + Buffer.from(`${e.sessionId}:${e.token}`).toString("base64");
    let n = `Bearer ${e.token}`;
    let r = {
      ...MTf,
      ...e.limits
    };
    let o = BTf(e.wsUrl, t, n, r, {
      statusProvider: e.statusProvider,
      failures: []
    });
    logForDebugging(`[agent-proxy] relay listening on 127.0.0.1:${o.port}`);
    return o;
  }
  function BTf(e, t, n, r, o) {
    let s = [];
    let i = Bun.listen({
      hostname: "127.0.0.1",
      port: 0,
      socket: {
        open(a) {
          a.data = {
            ...UTf(r, s, o),
            writeBuf: [],
            endAfterDrain: false,
            destroyAfterDrain: false
          };
          ZTc(a.remotePort, a.localPort).catch(() => "<lookup-failed>").then(l => {
            a.data.clientProcess = l;
          });
        },
        data(a, l) {
          let c = a.data;
          if (c.closed) {
            return;
          }
          $Tf({
            write: d => {
              let p = typeof d === "string" ? Buffer.from(d, "utf8") : d;
              if (c.writeBuf.length > 0) {
                c.writeBuf.push(p);
                return;
              }
              let m = a.write(p);
              if (m < p.length) {
                c.writeBuf.push(p.subarray(m));
              }
            },
            end: () => {
              if (c.writeBuf.length > 0) {
                c.endAfterDrain = true;
                return;
              }
              a.end();
            },
            destroy: () => {
              if (c.writeBuf.length > 0) {
                c.destroyAfterDrain = true;
                return;
              }
              a.terminate();
            }
          }, c, l, e, t, n);
        },
        drain(a) {
          let l = a.data;
          while (l.writeBuf.length > 0) {
            let c = l.writeBuf[0];
            let u = a.write(c);
            if (u < c.length) {
              l.writeBuf[0] = c.subarray(u);
              return;
            }
            l.writeBuf.shift();
          }
          if (l.destroyAfterDrain) {
            l.destroyAfterDrain = false;
            a.terminate();
            return;
          }
          if (l.endAfterDrain) {
            l.endAfterDrain = false;
            a.end();
          }
        },
        close(a) {
          let l = a.data;
          if (uEc(l)) {
            return;
          }
          if (l.wsMeta?.v2 && l.established && !l.finSeen && !l.closed && !l.localClosed && l.ws?.readyState === WebSocket.OPEN) {
            l.localClosed = true;
            l.finCloseTimer = setTimeout(XTf, l.limits.finGraceMs, l);
            return;
          }
          qCe(l);
        },
        error(a, l) {
          logForDebugging(`[agent-proxy] client socket error: ${l.message}`);
          qCe(a.data);
        }
      }
    });
    return {
      port: i.port,
      stop: () => {
        GTf(s);
        i.stop(true);
      }
    };
  }
  function $Tf(e, t, n, r, o, s) {
    if (!t.ws) {
      if (t.connectBuf = Buffer.concat([t.connectBuf, n]), t.connectBuf[0] === 22) {
        logForDebugging("[agent-proxy] client sent TLS to the relay port (HTTPS_PROXY must be an http:// URL)", {
          level: "warn"
        });
        Ae("agent_proxy_request", "agent_proxy_request_tls_to_relay");
        jCe(t.ctx, "tls_to_relay", "client opened TLS to the relay port; HTTPS_PROXY must be an http:// URL pointing at this port");
        t.closed = true;
        e.end();
        return;
      }
      let i = t.connectBuf.indexOf(`\r
\r
`);
      if (i === -1) {
        if (t.connectBuf.length > 8192) {
          t.closed = true;
          GJe(e, 400, "Bad Request", "request headers exceeded 8 KiB before the end of the CONNECT request");
          e.end();
          Ae("agent_proxy_request", "agent_proxy_request_header_too_long");
          jCe(t.ctx, "header_too_long", "headers exceeded 8 KiB");
        }
        return;
      }
      let a = t.connectBuf.subarray(0, i).toString("utf8");
      let l = ii(a, `\r
`);
      if (!l.match(/^CONNECT\s+(\S+)\s+HTTP\/1\.[01]$/i)) {
        if (/^GET\s+\/__agentproxy\/status(\?\S*)?\s+HTTP\/1\.[01]$/i.test(l)) {
          let f = {
            ...(t.ctx.statusProvider?.() ?? {}),
            recentRelayFailures: t.ctx.failures
          };
          aEc(e, 200, "OK", "application/json", De(f, null, 2) + `
`);
          t.closed = true;
          e.end();
          return;
        }
        t.closed = true;
        GJe(e, 405, "Method Not Allowed", "this proxy only accepts HTTPS CONNECT tunnels. Plain-HTTP/absolute-form requests are not supported \u2014 common causes are axios releases before 1.16.1 (broken HTTPS proxy handling) or a tool configured with HTTP_PROXY pointing at this relay.");
        e.end();
        Ae("agent_proxy_request", "agent_proxy_request_not_connect");
        let [d = "", p = ""] = l.split(/\s+/);
        let m = d;
        try {
          let f = new URL(p);
          m = `${d} ${f.protocol}//${f.host}`;
        } catch {}
        jCe(t.ctx, "not_connect", `non-CONNECT request: ${m.slice(0, 120)}`);
        return;
      }
      let u = t.connectBuf.subarray(i + 4);
      if (u.length > 0) {
        rEc(e, t, Buffer.from(u));
      }
      t.connectBuf = Buffer.alloc(0);
      jTf(e, t, l, r, o, s);
      return;
    }
    if (!t.wsOpen || t.paused) {
      rEc(e, t, Buffer.from(n));
      return;
    }
    t.redialEligible = false;
    XYo(t.ws, n);
    cEc(t);
  }
  function rEc(e, t, n) {
    if (t.pending.push(n), t.pendingBytes += n.length, t.pendingBytes > t.limits.pendingBytesCap) {
      if (logForDebugging(`[agent-proxy] pending buffer cap (${t.limits.pendingBytesCap}) exceeded; aborting request`, {
        level: "warn"
      }), Ae("agent_proxy_request", "agent_proxy_request_pending_overflow"), t.closed = true, !t.established) {
        GJe(e, 502, "Bad Gateway", "too much request data buffered while the upstream tunnel was unavailable (pending buffer cap exceeded)");
        e.end();
        jCe(t.ctx, "pending_overflow", "pending buffer cap exceeded before the tunnel was established", t.connectLine.split(" ")[1]);
      } else if (t.wsMeta?.v2) {
        e.destroy();
      } else {
        e.end();
      }
      qCe(t);
    }
  }
  function cEc(e) {
    if (e.paused || !e.ws) {
      return;
    }
    if (e.ws.bufferedAmount > e.limits.sendHighWater) {
      e.paused = true;
      e.drainTimer = setInterval(HTf, e.limits.drainPollMs, e);
    }
  }
  function HTf(e) {
    let t = e.ws;
    if (!t || t.readyState !== WebSocket.OPEN || e.closed) {
      PRt(e);
      return;
    }
    if (t.bufferedAmount > e.limits.sendLowWater) {
      return;
    }
    while (e.pending.length > 0 && t.bufferedAmount <= e.limits.sendHighWater) {
      let n = e.pending.shift();
      e.pendingBytes -= n.length;
      e.redialEligible = false;
      XYo(t, n);
    }
    if (e.pending.length === 0) {
      e.paused = false;
      PRt(e);
    }
  }
  function PRt(e) {
    if (e.drainTimer) {
      clearInterval(e.drainTimer);
      e.drainTimer = undefined;
    }
  }
  function jTf(e, t, n, r, o, s) {
    t.connectLine = n;
    let i = qTf(t);
    if (i) {
      t.ws = i.ws;
      t.wsOpen = true;
      t.pinger = i.pinger;
      t.wsMeta = i.meta;
      let a = t.pending.slice();
      t.redialEligible = true;
      let l = false;
      let c = u => {
        if (l || t.closed) {
          return;
        }
        if (l = true, t.redialEligible = false, logForDebugging(`[agent-proxy] pooled ws failed before response (${u}); falling through to fresh dial`), t.openTimer) {
          clearTimeout(t.openTimer);
          t.openTimer = undefined;
        }
        if (t.pooledDeadline = undefined, t.pinger) {
          clearInterval(t.pinger);
          t.pinger = undefined;
        }
        i.ws.onopen = i.ws.onmessage = i.ws.onerror = i.ws.onclose = null;
        try {
          i.ws.close();
        } catch {}
        t.ws = undefined;
        t.wsOpen = false;
        t.wsMeta = undefined;
        PRt(t);
        t.paused = false;
        t.pending = [...a, ...t.pending];
        t.pendingBytes = t.pending.reduce((d, p) => d + p.length, 0);
        YYo(e, t, r, o, s);
      };
      t.pooledDeadline = () => {
        if (t.openTimer = undefined, t.closed || t.established) {
          return;
        }
        if (t.redialEligible) {
          c("pooled ws unresponsive");
          return;
        }
        t.closed = true;
        Ae("agent_proxy_request", "agent_proxy_request_ws_error");
        GJe(e, 502, "Bad Gateway", "the pooled tunnel to the CCR agent-proxy became unresponsive before a response was received");
        e.end();
        jCe(t.ctx, "ws_error", "pooled tunnel unresponsive before first response", t.connectLine.split(" ")[1]);
        qCe(t);
      };
      t.openTimer = setTimeout(JTf, t.limits.openTimeoutMs, t);
      dEc(e, t, i.ws, c);
      pEc(t, i.ws, o);
      return;
    }
    YYo(e, t, r, o, s);
  }
  function qTf(e) {
    let {
      pool: t,
      limits: n
    } = e;
    while (t.length > 0) {
      let r = t.pop();
      if (r.ws.readyState !== WebSocket.OPEN) {
        clearInterval(r.pinger);
        continue;
      }
      if (Date.now() - r.idleSince > n.poolIdleTtlMs || Date.now() - r.meta.openedAt > n.poolMaxAgeMs) {
        clearInterval(r.pinger);
        try {
          r.ws.close();
        } catch {}
        continue;
      }
      return r;
    }
    return;
  }
  function uEc(e) {
    let {
      ws: t,
      wsMeta: n
    } = e;
    if (!t || !n?.v2 || !e.finSeen || t.readyState !== WebSocket.OPEN || !e.established || e.closed || !e.pinger || e.pool.length >= e.limits.poolMax || Date.now() - n.openedAt > e.limits.poolMaxAgeMs) {
      return false;
    }
    PRt(e);
    t.onmessage = null;
    t.onerror = null;
    let r = e.pool;
    t.onclose = () => WTf(r, t);
    r.push({
      ws: t,
      pinger: e.pinger,
      idleSince: Date.now(),
      meta: n
    });
    e.ws = undefined;
    e.pinger = undefined;
    e.wsMeta = undefined;
    return true;
  }
  function WTf(e, t) {
    let n = e.findIndex(r => r.ws === t);
    if (n >= 0) {
      clearInterval(e[n].pinger);
      e.splice(n, 1);
    }
  }
  function GTf(e) {
    for (let t of e) {
      clearInterval(t.pinger);
      t.ws.onclose = null;
      try {
        t.ws.close();
      } catch {}
    }
    e.length = 0;
  }
  function dEc(e, t, n, r) {
    n.onmessage = o => {
      let s = o.data instanceof ArrayBuffer ? new Uint8Array(o.data) : new Uint8Array(Buffer.from(o.data));
      let i = LTf(s);
      if (!i) {
        return;
      }
      if (i.control !== 0) {
        VTf(e, t, n, i);
        return;
      }
      if (i.data.length > 0) {
        if (t.localClosed) {
          return;
        }
        if (!t.established) {
          t.established = true;
          let a = Buffer.from(i.data.subarray(0, 16)).toString("utf8").match(/^HTTP\/1\.[01] ([45]\d\d)/);
          if (a) {
            jCe(t.ctx, "connect_rejected", `gateway answered ${a[1]} to CONNECT (policy denial or upstream failure)`, t.connectLine.split(" ")[1]);
          }
          if (t.redialEligible = false, t.pooledDeadline) {
            if (t.openTimer) {
              clearTimeout(t.openTimer);
              t.openTimer = undefined;
            }
            t.pooledDeadline = undefined;
          }
          Pe("agent_proxy_request");
        }
        e.write(i.data);
      }
    };
    n.onerror = o => {
      let s = "message" in o ? String(o.message) : "websocket error";
      if (logForDebugging(`[agent-proxy] ws error: ${s}`), t.closed) {
        return;
      }
      if (r && t.redialEligible && !t.established) {
        r(`ws error: ${s}`);
        return;
      }
      if (t.closed = true, !t.established) {
        Ae("agent_proxy_request", "agent_proxy_request_ws_error");
        GJe(e, 502, "Bad Gateway", `the WebSocket tunnel to the CCR agent-proxy reported an error (${s.slice(0, 120)})`);
        e.end();
        jCe(t.ctx, "ws_error", `tunnel error before response: ${s.slice(0, 120)}`, t.connectLine.split(" ")[1]);
      } else if (t.wsMeta?.v2) {
        e.destroy();
      } else {
        e.end();
      }
      qCe(t);
    };
    n.onclose = () => {
      if (t.closed) {
        return;
      }
      if (r && t.redialEligible && !t.established) {
        r("closed before response");
        return;
      }
      if (t.closed = true, !t.established) {
        Ae("agent_proxy_request", "agent_proxy_request_ws_error");
        GJe(e, 502, "Bad Gateway", "the WebSocket tunnel to the CCR agent-proxy closed before a response was received");
        e.end();
        jCe(t.ctx, "ws_error", "tunnel closed before response", t.connectLine.split(" ")[1]);
      } else if (t.wsMeta?.v2) {
        e.destroy();
      } else {
        e.end();
      }
      qCe(t);
    };
  }
  function VTf(e, t, n, r) {
    if (r.control === 2) {
      if (t.wsMeta && r.version === 2) {
        t.wsMeta.v2 = true;
        logForDebugging("[agent-proxy] tunnel protocol v2 negotiated");
      }
      return;
    }
    if (!t.wsMeta?.v2) {
      return;
    }
    if (r.control === 3) {
      zTf(e, t, n);
      return;
    }
  }
  function zTf(e, t, n) {
    if (t.closed || t.finSeen) {
      return;
    }
    if (t.finSeen = true, t.finCloseTimer) {
      clearTimeout(t.finCloseTimer);
      t.finCloseTimer = undefined;
    }
    if (!t.localClosed) {
      e.end();
    }
    if (PRt(t), t.openTimer) {
      clearTimeout(t.openTimer);
      t.openTimer = undefined;
    }
    t.pooledDeadline = undefined;
    t.paused = false;
    t.pending = [];
    t.pendingBytes = 0;
    n.send(iEc(4));
    let r = uEc(t);
    if (t.closed = true, !r) {
      qCe(t);
    }
  }
  function pEc(e, t, n) {
    let r = `${e.connectLine}\r
Proxy-Authorization: ${n}\r
X-Agent-Proxy-Client-Process: ${e.clientProcess}\r
\r
`;
    t.send(JYo(Buffer.from(r, "utf8")));
    for (let o of e.pending) {
      XYo(t, o);
    }
    e.pending = [];
    e.pendingBytes = 0;
    cEc(e);
  }
  function YYo(e, t, n, r, o) {
    let s = {
      "Content-Type": "application/proto",
      Authorization: o
    };
    let i = new globalThis.WebSocket(n, {
      headers: s,
      proxy: getWebSocketProxyUrl(n),
      Aeu: getWebSocketTLSOptions() || undefined
    });
    i.binaryType = "arraybuffer";
    t.ws = i;
    t.wsOpen = false;
    t.wsMeta = undefined;
    let a = () => {
      i.onopen = i.onmessage = i.onerror = i.onclose = null;
      try {
        i.close();
      } catch {}
    };
    let l = c => {
      if (t.closed) {
        return;
      }
      if (t.openTimer) {
        clearTimeout(t.openTimer);
        t.openTimer = undefined;
      }
      if (a(), t.wsAttempt++, t.wsAttempt < t.limits.openMaxAttempts) {
        let u = t.limits.openBackoffBaseMs * 2 ** (t.wsAttempt - 1);
        logForDebugging(`[agent-proxy] ws open failed (${c}); retry ${t.wsAttempt}/${t.limits.openMaxAttempts - 1} in ${u}ms`);
        t.openTimer = setTimeout(YYo, u, e, t, n, r, o);
        return;
      }
      logForDebugging(`[agent-proxy] ws open failed (${c}); attempts exhausted`);
      t.closed = true;
      Ae("agent_proxy_request", "agent_proxy_request_ws_error");
      GJe(e, 502, "Bad Gateway", `could not open the WebSocket tunnel to the CCR agent-proxy (${c.slice(0, 120)}) after ${t.limits.openMaxAttempts} attempts`);
      e.end();
      jCe(t.ctx, "ws_open_failed", `tunnel open failed after ${t.limits.openMaxAttempts} attempts: ${c.slice(0, 120)}`, t.connectLine.split(" ")[1]);
      qCe(t);
    };
    t.failOrRetry = l;
    t.openTimer = setTimeout(YTf, t.limits.openTimeoutMs, t);
    i.onopen = () => {
      if (t.closed) {
        return;
      }
      if (t.openTimer) {
        clearTimeout(t.openTimer);
        t.openTimer = undefined;
      }
      t.failOrRetry = undefined;
      t.wsOpen = true;
      t.wsMeta = {
        v2: false,
        openedAt: Date.now()
      };
      dEc(e, t, i);
      i.send(iEc(1, 2));
      pEc(t, i, r);
      t.pinger = setInterval(KTf, 30000, i);
    };
    i.onerror = c => {
      let u = "message" in c ? String(c.message) : "websocket error";
      logForDebugging(`[agent-proxy] ws error: ${u}`);
      l(u);
    };
    i.onclose = () => l("closed before open");
  }
  function KTf(e) {
    if (e.readyState === WebSocket.OPEN) {
      e.send(JYo(new Uint8Array(0)));
    }
  }
  function YTf(e) {
    if (e.ws && e.ws.readyState === WebSocket.CONNECTING) {
      logForDebugging("[agent-proxy] ws open timeout");
      e.failOrRetry?.("handshake timeout");
    }
  }
  function JTf(e) {
    e.pooledDeadline?.();
  }
  function XTf(e) {
    if (e.finCloseTimer = undefined, e.finSeen || e.closed) {
      return;
    }
    qCe(e);
  }
  function XYo(e, t) {
    if (e.readyState !== WebSocket.OPEN) {
      return;
    }
    for (let n = 0; n < t.length; n += 524288) {
      let r = t.subarray(n, n + 524288);
      e.send(JYo(r));
    }
  }
  function qCe(e) {
    if (!e) {
      return;
    }
    if (e.closed = true, e.pinger) {
      clearInterval(e.pinger);
    }
    if (e.openTimer) {
      clearTimeout(e.openTimer);
      e.openTimer = undefined;
    }
    if (e.finCloseTimer) {
      clearTimeout(e.finCloseTimer);
      e.finCloseTimer = undefined;
    }
    if (PRt(e), e.pending = [], e.pendingBytes = 0, e.failOrRetry = undefined, e.redialEligible = false, e.pooledDeadline = undefined, e.ws && e.ws.readyState <= WebSocket.OPEN) {
      try {
        e.ws.close();
      } catch {}
    }
    e.ws = undefined;
  }
  var MTf;
  var mEc = __lazy(() => {
    ln();
    je();
    fW();
    Fh();
    Zn();
    eEc();
    MTf = {
      openTimeoutMs: 1e4,
      openMaxAttempts: 3,
      openBackoffBaseMs: 100,
      sendHighWater: 4194304,
      sendLowWater: 1048576,
      drainPollMs: 50,
      pendingBytesCap: 33554432,
      poolMax: 4,
      poolIdleTtlMs: 1e4,
      poolMaxAgeMs: 2700000,
      finGraceMs: 1500
    };
  });
  function yEc(e, t) {
    let n = t?.trim();
    if (n?.includes("javax.net.ssl.trustStore=")) {
      return n;
    }
    let r = `-Djavax.net.ssl.trustStore=${e} -Djavax.net.ssl.trustStorePassword=${"changeit"} -Djavax.net.ssl.trustStoreType=PKCS12`;
    return n ? `${r} ${n}` : r;
  }
  async function _Ec(e) {
    let t = [];
    let n = {
      failureCodes: t
    };
    let r = NK.join(e.stateDir, "agent-proxy-ca.crt");
    try {
      await vR.mkdir(e.stateDir, {
        recursive: true
      });
      await vR.writeFile(r, e.ccrCa, "utf8");
    } catch (i) {
      logForDebugging(`[agent-proxy] tool trust setup skipped: cannot write CA file: ${he(i)}`, {
        level: "warn"
      });
      Ae("agent_proxy_tool_trust", "ca_file_write_failed");
      return n;
    }
    let o = await hEc(e.keytoolBin, ZTf);
    let s = await hEc(e.certutilBin, () => Qm("certutil"));
    if (await Promise.all([(async () => {
      if (!o) {
        logForDebugging("[agent-proxy] no keytool found; skipping JVM truststore");
        return;
      }
      let i = await eEf(o, r, NK.join(e.stateDir, "java-truststore.p12"), t);
      if (!i) {
        return;
      }
      if (QTf.test(i)) {
        logForDebugging(`[agent-proxy] truststore path contains JVM-unsafe characters; not emitting JAVA_TOOL_OPTIONS: ${i}`, {
          level: "warn"
        });
        t.push("jvm_unsafe_truststore_path");
        return;
      }
      n.javaTrustStorePath = i;
      await tEf(i, e.bazelrcPath ?? "/etc/bazel.bazelrc", t);
    })(), (async () => {
      if (!s) {
        logForDebugging("[agent-proxy] certutil not found; skipping NSS trust for browsers");
        return;
      }
      await nEf(r, e.nssDbDirs ?? [NK.join(ZYo.homedir(), ".pki", "nssdb"), NK.join(boe(), "pki", "nssdb")], s, t);
    })(), rEf(e.caBundlePath, e.botoConfigPath ?? NK.join(ZYo.homedir(), ".boto"), t), oEf(e, e.profileDPath ?? "/etc/profile.d/ccr-agent-proxy-ca.sh", t).then(i => {
      n.profileDPath = i;
    })]), t.length === 0) {
      Pe("agent_proxy_tool_trust");
    } else {
      Et("agent_proxy_tool_trust", t[0]);
    }
    return n;
  }
  async function hEc(e, t) {
    if (e) {
      return vR.realpath(e).catch(() => {
        return;
      });
    }
    return (await t()) ?? undefined;
  }
  async function ZTf() {
    let e = [await Qm("keytool"), Me.JAVA_HOME ? NK.join(Me.JAVA_HOME, "bin", "keytool") : undefined];
    let t;
    for (let n of e) {
      if (!n) {
        continue;
      }
      let r = await vR.realpath(n).catch(() => {
        return;
      });
      if (!r) {
        continue;
      }
      if (t ??= r, await bEc(r)) {
        return r;
      }
    }
    return t;
  }
  async function bEc(e) {
    let t = NK.dirname(NK.dirname(e));
    for (let n of [NK.join(t, "lib", "security", "cacerts"), NK.join(t, "jre", "lib", "security", "cacerts")]) {
      let r = await vR.realpath(n).catch(() => {
        return;
      });
      if (r) {
        return r;
      }
    }
    return;
  }
  async function eEf(e, t, n, r) {
    let o = await bEc(e);
    if (!o) {
      logForDebugging(`[agent-proxy] no JDK cacerts found near ${e}; skipping JVM truststore`);
      r.push("jdk_cacerts_not_found");
      return;
    }
    let s = `${n}.tmp`;
    await vR.unlink(s).catch(() => {});
    let i = await ORt(e, ["-importkeystore", "-noprompt", "-srckeystore", o, "-srcstorepass", "changeit", "-destkeystore", s, "-deststoretype", "PKCS12", "-deststorepass", "changeit"]);
    if (!i.ok) {
      logForDebugging(`[agent-proxy] keytool importkeystore failed: ${i.detail}`, {
        level: "warn"
      });
      r.push("java_truststore_seed_failed");
      await vR.unlink(s).catch(() => {});
      return;
    }
    let a = await ORt(e, ["-importcert", "-noprompt", "-trustcacerts", "-alias", "ccr-agent-proxy", "-file", t, "-keystore", s, "-storetype", "PKCS12", "-storepass", "changeit"]);
    if (!a.ok) {
      logForDebugging(`[agent-proxy] keytool importcert failed: ${a.detail}`, {
        level: "warn"
      });
      r.push("java_truststore_import_failed");
      await vR.unlink(s).catch(() => {});
      return;
    }
    try {
      await vR.rename(s, n).catch(async () => {
        await vR.writeFile(n, await vR.readFile(s));
        await vR.unlink(s).catch(() => {});
      });
    } catch (l) {
      logForDebugging(`[agent-proxy] could not move JVM truststore into place: ${he(l)}`, {
        level: "warn"
      });
      r.push("java_truststore_publish_failed");
      return;
    }
    logForDebugging(`[agent-proxy] JVM truststore built at ${n}`);
    return n;
  }
  async function tEf(e, t, n) {
    let r = `${"# >>> ccr-agent-proxy (managed by Claude Code) >>>"}
# Bazel's repository downloader runs on its embedded JDK and ignores
# JAVA_TOOL_OPTIONS; carry the agent-proxy truststore via startup options.
startup --host_jvm_args=-Djavax.net.ssl.trustStore=${e} --host_jvm_args=-Djavax.net.ssl.trustStorePassword=${"changeit"} --host_jvm_args=-Djavax.net.ssl.trustStoreType=PKCS12
${"# <<< ccr-agent-proxy <<<"}
`;
    let o;
    try {
      o = await vR.readFile(t, "utf8");
    } catch (u) {
      if (!fn(u)) {
        logForDebugging(`[agent-proxy] could not read ${t}: ${he(u)}`);
        n.push("bazelrc_write_failed");
        return;
      }
      o = "";
    }
    let s = o.indexOf("# >>> ccr-agent-proxy (managed by Claude Code) >>>");
    let i = o.indexOf("# <<< ccr-agent-proxy <<<");
    let l = (s >= 0 && i > s ? o.slice(0, s) + o.slice(i + ("# <<< ccr-agent-proxy <<<").length).replace(/^\n/, "") : o).trimEnd();
    let c = l ? `${l}

${r}` : r;
    if (c === o) {
      return;
    }
    try {
      await vR.writeFile(t, c, "utf8");
      logForDebugging(`[agent-proxy] wrote Bazel trust block to ${t}`);
    } catch (u) {
      logForDebugging(`[agent-proxy] could not write ${t}: ${he(u)}`);
      n.push("bazelrc_write_failed");
    }
  }
  async function nEf(e, t, n, r) {
    for (let o of t) {
      if (!(await vR.mkdir(o, {
        recursive: true
      }).then(() => true, c => (logForDebugging(`[agent-proxy] could not create NSS dir ${o}: ${he(c)}`), false)))) {
        r.push("nss_add_failed");
        continue;
      }
      let i = `sql:${o}`;
      await ORt(n, ["-D", "-d", i, "-n", "ccr-agent-proxy"]);
      let a = ["-A", "-d", i, "-t", "C,,", "-n", "ccr-agent-proxy", "-i", e];
      let l = await ORt(n, a);
      if (!l.ok) {
        await ORt(n, ["-N", "--empty-password", "-d", i]);
        l = await ORt(n, a);
      }
      if (l.ok) {
        logForDebugging(`[agent-proxy] MITM CA added to NSS DB at ${o}`);
      } else {
        logForDebugging(`[agent-proxy] certutil -A failed for ${o}: ${l.detail}`);
        r.push("nss_add_failed");
      }
    }
  }
  async function rEf(e, t, n) {
    let r = `[Boto]
ca_certificates_file = ${e}
`;
    try {
      await vR.writeFile(t, r, {
        flag: "wx",
        mode: 420
      });
      logForDebugging(`[agent-proxy] wrote ${t} for gsutil trust`);
    } catch (o) {
      if (en(o) === "EEXIST") {
        return;
      }
      logForDebugging(`[agent-proxy] could not write ${t}: ${he(o)}`);
      n.push("boto_write_failed");
    }
  }
  async function oEf(e, t, n) {
    if (!e.hasSystemCa) {
      await vR.unlink(t).catch(() => {});
      return;
    }
    let r = ["# Managed by Claude Code (CCR agent-proxy). Re-exports CA-trust env", "# vars for login shells that start from a scrubbed environment. Each", "# export is set-if-absent so an explicit value in the shell wins.", "# HTTPS_PROXY is intentionally NOT set here: the relay port is", "# ephemeral and persisting it would break all HTTPS in login shells", "# once the relay process exits. Scrubbed login shells dial direct.", `if [ -r ${SEc(e.caBundlePath)} ]; then`];
    for (let s of [...JYt, ...XYt]) {
      r.push("  " + gEc(s, e.caBundlePath));
    }
    for (let [s, i] of Object.entries(YKe)) {
      r.push("  " + gEc(s, i));
    }
    r.push("fi");
    let o = r.join(`
`) + `
`;
    try {
      await vR.mkdir(NK.dirname(t), {
        recursive: true
      });
      await vR.writeFile(t, o, {
        mode: 420
      });
      logForDebugging(`[agent-proxy] wrote ${t} for login-shell trust`);
      return t;
    } catch (s) {
      logForDebugging(`[agent-proxy] could not write ${t}: ${he(s)}`);
      n.push("profile_d_write_failed");
      return;
    }
  }
  function gEc(e, t) {
    return `if [ -z "\${${e}:-}" ]; then ${e}=${SEc(t)}; fi; export ${e}`;
  }
  function SEc(e) {
    return `'${e.replace(/'/g, "'\\''")}'`;
  }
  async function ORt(e, t) {
    let n = await execFileNoThrow(e, t, {
      timeout: 20000,
      preserveOutputOnError: true,
      useCwd: false
    });
    if (n.code === 0) {
      return {
        ok: true,
        stdout: n.stdout,
        detail: ""
      };
    }
    return {
      ok: false,
      stdout: n.stdout,
      detail: `${n.error ?? `exit ${n.code}`} ${n.stderr.slice(0, 200)}`.trim()
    };
  }
  var vR;
  var ZYo;
  var NK;
  var QTf;
  var TEc = __lazy(() => {
    ln();
    je();
    pr();
    dt();
    ji();
    zTe();
    Itr();
    vR = require("fs/promises");
    ZYo = require("os");
    NK = require("path");
    QTf = /[\s'"]/;
  });
  var IEc = {};
  __export(IEc, {
    resetAgentProxyForTests: () => resetAgentProxyForTests,
    installIntoSystemTrust: () => installIntoSystemTrust,
    initAgentProxy: () => initAgentProxy,
    getAgentProxyEnv: () => getAgentProxyEnv,
    findSystemCaBundle: () => findSystemCaBundle,
    SESSION_TOKEN_PATH: () => "/run/ccr/session_token"
  });
  async function initAgentProxy(e) {
    let t = process.env.AGENT_PROXY_URL;
    let n = process.env.AGENT_PROXY_AUTH_TOKEN;
    if (Me.unset("AGENT_PROXY_URL"), Me.unset("AGENT_PROXY_AUTH_TOKEN"), !st(process.env.CLAUDE_CODE_REMOTE)) {
      return FS;
    }
    if (!Me.CCR_AGENT_PROXY_ENABLED) {
      return FS;
    }
    let r = process.env.CLAUDE_CODE_REMOTE_SESSION_ID;
    if (!r) {
      logForDebugging("[agent-proxy] CLAUDE_CODE_REMOTE_SESSION_ID unset; proxy disabled", {
        level: "warn"
      });
      Ae("agent_proxy_init", "agent_proxy_init_no_session_id");
      return FS;
    }
    let o = e?.tokenPath ?? "/run/ccr/session_token";
    let s = await pEf(o);
    let i = s.existed;
    let a = s.token;
    if (!a) {
      a = cT();
    }
    if (!a && !n) {
      logForDebugging("[agent-proxy] no session token; proxy disabled");
      Ae("agent_proxy_init", "agent_proxy_init_no_token");
      return FS;
    }
    logForDebugging(`[agent-proxy] token via ${i ? o : "sessionIngressAuth"}`);
    mEf();
    let l = t ?? e?.ccrBaseUrl ?? process.env.ANTHROPIC_BASE_URL ?? "https://api.anthropic.com";
    let c = e?.caBundlePath ?? WCe.join(tJo.homedir(), ".ccr", "ca-bundle.crt");
    let u = e?.systemCaPath ? await CL.readFile(e.systemCaPath, "utf8").catch(() => "") : await findSystemCaBundle();
    let d = await gEf(u, c);
    let p = await _Ef(l, d ? `${u}
${d}` : u, c);
    if (!p) {
      return FS;
    }
    await bEf(e?.awsConfigPath ?? WCe.join(tJo.homedir(), ".aws", "config"));
    try {
      let m = l.replace(/^http/, "ws") + "/v1/code/agent-proxy" + "/ws";
      let f = WCe.join(c, "..", "README.md");
      let h = await lEc({
        wsUrl: m,
        sessionId: r,
        token: n ?? a ?? "",
        statusProvider: () => ({
          ...FS,
          readmePath: f,
          gitConfigInjection: rJo(),
          gitSshRewrite: rJo() && REc()
        })
      });
      Ti(async () => h.stop());
      nJo = h;
      FS = {
        enabled: true,
        port: h.port,
        caBundlePath: c,
        hasSystemCa: u !== "",
        noProxy: t ? sEf : oJo,
        standalone: Boolean(t)
      };
      logForDebugging(`[agent-proxy] enabled on 127.0.0.1:${h.port}`);
      Pe("agent_proxy_init");
      let g = FS;
      if (x$t(eJo(c, undefined)), CL.writeFile(f, uEf(h.port, c), "utf8").then(() => {
        if (FS !== g) {
          return;
        }
        x$t(eJo(c, f));
      }).catch(y => {
        if (logForDebugging(`[agent-proxy] README write failed: ${y instanceof Error ? y.message : String(y)}`), FS !== g) {
          return;
        }
        x$t(eJo(c, undefined));
      }), cEf().then(y => {
        if (y.length > 0 && FS === g) {
          FS.gitConfigConflicts = y;
          logForDebugging(`[agent-proxy] git config may defeat proxy routing: ${y.join(", ")}`, {
            level: "warn"
          });
        }
      }).catch(() => {}), installIntoSystemTrust(p, e?.systemTrustTargets ?? yEf).catch(() => {}), e?.toolTrust !== false) {
        _Ec({
          ccrCa: p,
          caBundlePath: c,
          hasSystemCa: FS.hasSystemCa ?? false,
          stateDir: WCe.join(c, ".."),
          ...(e?.toolTrust ?? {})
        }).then(y => {
          if (FS !== g) {
            return;
          }
          if (y.javaTrustStorePath) {
            FS.javaTrustStorePath = y.javaTrustStorePath;
          }
          if (y.profileDPath) {
            let _ = y.profileDPath;
            Ti(() => CL.unlink(_).catch(() => {}));
          }
          if (y.failureCodes.length > 0) {
            FS.toolTrustFailureCodes = y.failureCodes;
          }
        }).catch(y => {
          logForDebugging(`[agent-proxy] tool trust setup failed: ${y instanceof Error ? y.message : String(y)}`, {
            level: "warn"
          });
          Et("agent_proxy_tool_trust", "setup_threw");
        });
      }
      if (i) {
        await CL.unlink(o).catch(() => {
          logForDebugging("[agent-proxy] token file unlink failed", {
            level: "warn"
          });
        });
      }
    } catch (m) {
      logForDebugging(`[agent-proxy] relay start failed: ${m instanceof Error ? m.message : String(m)}; proxy disabled`, {
        level: "warn"
      });
      Ae("agent_proxy_init", "agent_proxy_init_relay_start_failed");
    }
    return FS;
  }
  function getAgentProxyEnv() {
    if (!FS.enabled || !FS.port || !FS.caBundlePath) {
      if (process.env.HTTPS_PROXY && process.env.SSL_CERT_FILE) {
        let s = {};
        for (let i of ["HTTPS_PROXY", "https_proxy", "NO_PROXY", "no_proxy", ...QYt, ...Object.keys(YKe), "AWS_ACCESS_KEY_ID", "AWS_SECRET_ACCESS_KEY", "GH_TOKEN", "GITHUB_TOKEN", "CLOUDSDK_AUTH_ACCESS_TOKEN"]) {
          if (process.env[i]) {
            s[i] = process.env[i];
          }
        }
        return s;
      }
      return {};
    }
    let e = `http://127.0.0.1:${FS.port}`;
    let t = {
      HTTPS_PROXY: e,
      https_proxy: e,
      NO_PROXY: FS.noProxy,
      no_proxy: FS.noProxy
    };
    for (let s of JYt) {
      t[s] = FS.caBundlePath;
    }
    if (FS.hasSystemCa) {
      for (let s of XYt) {
        t[s] = FS.caBundlePath;
      }
      for (let [s, i] of Object.entries(YKe)) {
        if (process.env[s] === undefined) {
          t[s] = i;
        }
      }
    }
    if (FS.javaTrustStorePath) {
      t.JAVA_TOOL_OPTIONS = yEc(FS.javaTrustStorePath, Me.JAVA_TOOL_OPTIONS);
    }
    if (Me.GIT_TERMINAL_PROMPT === undefined) {
      t.GIT_TERMINAL_PROMPT = aqt.GIT_TERMINAL_PROMPT;
    }
    if (Me.GIT_ASKPASS === undefined) {
      t.GIT_ASKPASS = aqt.GIT_ASKPASS;
    }
    if (Me.GCM_INTERACTIVE === undefined) {
      t.GCM_INTERACTIVE = aqt.GCM_INTERACTIVE;
    }
    if (rJo()) {
      let s = [["credential.interactive", "false"]];
      if (REc()) {
        s.push([`url.https://${"github.com"}/.insteadOf`, `git@${"github.com"}:`], [`url.https://${"github.com"}/.insteadOf`, `ssh://git@${"github.com"}/`]);
      }
      Object.assign(t, wso(undefined, s));
    }
    if (!(process.env.GH_TOKEN || process.env.GITHUB_TOKEN)) {
      t.GH_TOKEN = "proxy-injected";
      t.GITHUB_TOKEN = "proxy-injected";
    }
    if (!(process.env.AWS_ACCESS_KEY_ID || process.env.AWS_SECRET_ACCESS_KEY || process.env.AWS_SESSION_TOKEN || process.env.AWS_PROFILE || process.env.AWS_SHARED_CREDENTIALS_FILE || process.env.AWS_CONFIG_FILE || process.env.AWS_WEB_IDENTITY_TOKEN_FILE || process.env.AWS_ROLE_ARN || process.env.AWS_CONTAINER_CREDENTIALS_RELATIVE_URI || process.env.AWS_CONTAINER_CREDENTIALS_FULL_URI)) {
      t.AWS_ACCESS_KEY_ID = "proxy-injected";
      t.AWS_SECRET_ACCESS_KEY = "proxy-injected";
    }
    if (!(process.env.CLOUDSDK_AUTH_ACCESS_TOKEN || process.env.GOOGLE_APPLICATION_CREDENTIALS)) {
      t.CLOUDSDK_AUTH_ACCESS_TOKEN = "proxy-injected";
    }
    return t;
  }
  function rJo() {
    return Me.GIT_CONFIG_COUNT === undefined;
  }
  function REc() {
    return !FS.standalone && Me.SSH_AUTH_SOCK === undefined && Me.GIT_SSH_COMMAND === undefined;
  }
  function eJo(e, t) {
    let n = t ? `see ${t} and ` : "";
    return `Outbound HTTPS goes through a pre-configured agent proxy (CA bundle: ${e}). If a tool fails TLS verification or gets 403/405/407 from the proxy, ${n}run curl -sS "$HTTPS_PROXY/__agentproxy/status" for per-tool fixes and proxy state; never disable TLS verification or unset HTTPS_PROXY.`;
  }
  async function cEf() {
    let e = new Set();
    let t = await Promise.all(["--global", "--system"].map(n => execFileNoThrow("git", ["config", n, "--list", "--name-only"], {
      timeout: 5000,
      preserveOutputOnError: true,
      useCwd: false
    })));
    for (let n of t) {
      if (n.code !== 0) {
        continue;
      }
      for (let [r, o] of lEf) {
        if (o.test(n.stdout)) {
          e.add(r);
        }
      }
    }
    return [...e];
  }
  function uEf(e, t) {
    let n = WCe.join(t, "..");
    let r = `http://127.0.0.1:${e}`;
    return `# Claude Code agent proxy

Outbound HTTPS from this session goes through a local proxy at ${r}
(set via HTTPS_PROXY) which tunnels to a policy-enforcing egress proxy. TLS is
re-terminated there, so every tool must trust the CA bundle at
${t}. The standard CA environment variables, the system trust
store (where possible), a JVM truststore, the Bazel system bazelrc, the
browser NSS store, and gsutil's boto config are already set up.

## Quick diagnosis

1. Run: curl -sS ${r}/__agentproxy/status
   It reports proxy state, which trust and git accommodations are active
   (javaTrustStorePath, toolTrustFailureCodes, gitSshRewrite,
   gitConfigConflicts), and the most recent proxy-side failures.
2. Find the failure class below and apply the matching fix; gitConfigConflicts
   codes map to the git section, toolTrustFailureCodes to the JVM section.
3. Never disable TLS verification, never unset HTTPS_PROXY, and do not retry
   organization policy denials (403/407) \u2014 report them instead.

## Failure classes and fixes

### "certificate verify failed" / "self-signed certificate in chain" / PKIX errors

The failing tool is not reading the pre-set CA configuration. In order:

- If the tool has a CA flag or env var, point it at ${t}
  (examples: --cacert, SSL_CERT_FILE, NODE_EXTRA_CA_CERTS, REQUESTS_CA_BUNDLE,
  AWS_CA_BUNDLE, DENO_CERT, CARGO_HTTP_CAINFO, PIP_CERT, GIT_SSL_CAINFO,
  BUNDLE_SSL_CA_CERT, HEX_CACERTS_PATH, NIX_SSL_CERT_FILE).
- Tool config files override environment variables. If one of these sets its
  own CA or disables verification, point it at the bundle instead:
  pip.conf "cert", npm "cafile" (npm config get cafile), ~/.curlrc "cacert",
  .wgetrc "ca_certificate", conda "ssl_verify", git "http.sslCAInfo",
  gradle.properties / MAVEN_OPTS "-Djavax.net.ssl.trustStore".
- JVM tools (Maven, Gradle, plain Java): when a JDK is present, a truststore
  is built at ${n}/java-truststore.p12 (password "changeit") and
  injected via JAVA_TOOL_OPTIONS \u2014 confirm javaTrustStorePath is set in the
  status output before pointing a build at it (toolTrustFailureCodes explains
  why it is missing). If the image or the build sets its own trustStore, that
  one wins \u2014 import the proxy CA into it with
  keytool -importcert -noprompt -alias ccr-agent-proxy -file ${n}/agent-proxy-ca.crt -keystore <their store>
  or point the build at the ready-made one. Bazel reads the managed block in
  /etc/bazel.bazelrc rather than JAVA_TOOL_OPTIONS.

### "405 Method Not Allowed" from the proxy

The tool sent a plain-HTTP (non-CONNECT) request: usually axios older than
1.16.1 (upgrade it) or a tool configured with HTTP_PROXY (unset HTTP_PROXY for
that tool \u2014 only HTTPS_PROXY is supported).

### 403 / 407 from the proxy

The destination host is not allowed by your organization's egress policy for
this session. Do not retry or route around it \u2014 report the blocked host.
Note: curl hides response bodies on failed CONNECTs; the status endpoint
records the reason.

### Tool ignores the proxy entirely (timeouts with no proxy error)

Some clients do not read HTTPS_PROXY: Node's built-in fetch (run that command
with NODE_USE_ENV_PROXY=1 on Node >= 22.21), aiohttp (pass trust_env=True),
Ruby bundler (reads only HTTP_PROXY, which this proxy does not serve),
hand-rolled Go dialers. Prefer the tool's own proxy option where one exists.

### git

SSH-form GitHub remotes (git@github.com:...) are rewritten to HTTPS
automatically unless this session has its own SSH setup or supplies its own
GIT_CONFIG_* (see gitSshRewrite in the status output). A gitconfig that sets
http.proxy / http.<url>.proxy (even empty), its own http.sslCAInfo, or an
https-to-ssh insteadOf makes git bypass the proxy or fail verification \u2014 the
status output's gitConfigConflicts codes name which of these were detected;
adjust those keys for this session if git times out.

### docker build / docker run

Processes inside containers cannot reach 127.0.0.1:${e} and do not trust
the CA. Workarounds: run builds with --network host, copy ${t}
into the build context and install it in an early layer, and pass proxy/CA
settings explicitly to the build.

### Not supported through the proxy (report, do not work around)

gRPC / HTTP/2-only APIs, WebSocket upgrades, client-mTLS, certificate-pinned
clients (e.g. Snowflake, ngrok), non-443 HTTPS ports, raw-TCP databases.

If a tool still cannot work through the proxy, report it to your
administrator or Anthropic support so the policy or tooling can be fixed.
`;
  }
  function resetAgentProxyForTests() {
    FS = {
      enabled: false,
      noProxy: oJo
    };
    x$t(undefined);
    nJo?.stop();
    nJo = undefined;
  }
  async function pEf(e) {
    try {
      return {
        existed: true,
        token: (await CL.readFile(e, "utf8")).trim() || null
      };
    } catch (t) {
      if (fn(t)) {
        return {
          existed: false,
          token: null
        };
      }
      logForDebugging(`[agent-proxy] token read failed: ${t instanceof Error ? t.message : String(t)}`, {
        level: "warn"
      });
      return {
        existed: false,
        token: null
      };
    }
  }
  function mEf() {
    try {
      let t = require("bun:ffi").dlopen("libc.so.6", {
        prctl: {
          args: ["int", "u64", "u64", "u64", "u64"],
          returns: "int"
        }
      });
      let n = 4;
      if (t.symbols.prctl(4, 0n, 0n, 0n, 0n) !== 0) {
        logForDebugging("[agent-proxy] prctl(PR_SET_DUMPABLE,0) returned nonzero", {
          level: "warn"
        });
      }
    } catch (e) {
      logForDebugging(`[agent-proxy] prctl unavailable: ${e instanceof Error ? e.message : String(e)}`, {
        level: "warn"
      });
    }
  }
  async function findSystemCaBundle(e = wEc) {
    for (let t of e) {
      try {
        return await CL.readFile(t, "utf8");
      } catch {}
    }
    return "";
  }
  async function gEf(e, t) {
    let n = new Set();
    let r = [];
    let o = e;
    for (let s of QYt) {
      let i = process.env[s]?.trim();
      if (!i || i === t || n.vZc(i) || wEc.includes(i)) {
        continue;
      }
      n.add(i);
      let a;
      try {
        let u = await CL.stat(i);
        if (!u.isFile() || u.size > 1048576) {
          continue;
        }
        a = await CL.readFile(i, "utf8");
      } catch (u) {
        if (!fn(u)) {
          logForDebugging(`[agent-proxy] could not read customer CA bundle from ${s}: ${u instanceof Error ? u.message : String(u)}`, {
            level: "warn"
          });
        }
        continue;
      }
      let l = a.match(hEf);
      if (!l) {
        continue;
      }
      let c = 0;
      for (let u of l) {
        if (o.includes(u)) {
          continue;
        }
        r.push(u);
        o += `
${u}`;
        c++;
      }
      if (c > 0) {
        logForDebugging(`[agent-proxy] folded ${c} customer CA cert(s) from ${s} into the relay bundle`);
      }
    }
    return r.join(`
`);
  }
  async function installIntoSystemTrust(e, t) {
    for (let {
      dir: n,
      name: r,
      refresh: o
    } of t) {
      try {
        await CL.writeFile(WCe.join(n, r), e, "utf8");
        let s = await new Promise(i => {
          EEc.execFile(o[0], o.slice(1), {
            timeout: 1e4,
            cwd: "/",
            windowsHide: true
          }, a => i(a ? fn(a) ? 127 : 1 : 0));
        });
        if (s === 0) {
          logForDebugging(`[agent-proxy] CA installed to system trust via ${o[0]}`);
          Pe("agent_proxy_system_trust");
          return;
        }
        logForDebugging(`[agent-proxy] ${o[0]} exited ${s}; falling back to env-var trust`, {
          level: "warn"
        });
      } catch (s) {
        if (fn(s)) {
          continue;
        }
        logForDebugging(`[agent-proxy] system trust install via ${n} failed: ${s instanceof Error ? s.message : String(s)}`, {
          level: "warn"
        });
      }
    }
    if (t.length > 0) {
      Et("agent_proxy_system_trust", "unavailable");
    }
  }
  async function _Ef(e, t, n) {
    let r = AbortSignal.timeout(5000);
    let o = "";
    for (let s = 0; s < 3; s++) {
      try {
        let i = await fetch(`${e}${"/v1/code/agent-proxy"}/ca-cert`, {
          signal: r
        });
        if (i.status >= 500) {
          o = `status ${i.status}`;
          continue;
        }
        if (!i.ok) {
          logForDebugging(`[agent-proxy] ca-cert fetch ${i.status}; proxy disabled`, {
            level: "warn"
          });
          Ae("agent_proxy_init", "agent_proxy_init_ca_http_error");
          return;
        }
        let a = await i.text();
        await CL.mkdir(WCe.join(n, ".."), {
          recursive: true
        });
        await CL.writeFile(n, t + `
` + a, "utf8");
        return a;
      } catch (i) {
        o = i instanceof Error ? i.message : String(i);
      }
    }
    logForDebugging(`[agent-proxy] ca-cert fetch exhausted (${o}); proxy disabled`, {
      level: "warn"
    });
    Ae("agent_proxy_init", "agent_proxy_init_ca_exhausted");
    return;
  }
  async function bEf(e) {
    try {
      await CL.mkdir(WCe.join(e, ".."), {
        recursive: true,
        mode: 448
      });
      await CL.writeFile(e, `[default]
s3 =
  payload_signing_enabled = false
`, {
        flag: "wx",
        mode: 384
      });
    } catch (t) {
      if (en(t) === "EEXIST") {
        return;
      }
      logForDebugging(`[agent-proxy] aws config write failed: ${t instanceof Error ? t.message : String(t)}`, {
        level: "warn"
      });
    }
  }
  var EEc;
  var CL;
  var tJo;
  var WCe;
  var wEc;
  var CEc;
  var oJo;
  var sEf;
  var FS;
  var nJo;
  var lEf;
  var hEf;
  var yEf;
  var PEc = __lazy(() => {
    ln();
    hd();
    je();
    pr();
    gn();
    dt();
    ji();
    fk();
    MGe();
    e1();
    Itr();
    mEc();
    TEc();
    EEc = require("child_process");
    CL = require("fs/promises");
    tJo = require("os");
    WCe = require("path");
    wEc = ["/etc/ssl/certs/ca-certificates.crt", "/etc/pki/tls/certs/ca-bundle.crt", "/etc/ssl/cert.pem"];
    CEc = ["localhost", "127.0.0.1", "::1", "127.0.0.0/8", "0.0.0.0/8", "::", "169.254.0.0/16", "anthropic.com", ".anthropic.com", "*.anthropic.com", "registry.npmjs.org", "jsr.io", "npm.jsr.io", "pypi.org", "files.pythonhosted.org", "index.crates.io", "proxy.golang.org", "host.docker.internal"];
    oJo = [...CEc, "10.0.0.0/8", "172.16.0.0/12", "192.168.0.0/16", "100.64.0.0/10", ".svc.cluster.local", "*.svc.cluster.local"].join(",");
    sEf = CEc.join(",");
    FS = {
      enabled: false,
      noProxy: oJo
    };
    lEf = [["git_http_proxy_configured", /^http\.(.+\.)?proxy$/m], ["git_ssl_cainfo_configured", /^http\.(.+\.)?sslcainfo$/m], ["git_https_to_ssh_insteadof_configured", /^url\.(git@|ssh:\/\/).*\.insteadof$/m]];
    hEf = /-----BEGIN CERTIFICATE-----[\s\S]*?-----END CERTIFICATE-----/g;
    yEf = [{
      dir: "/usr/local/share/ca-certificates",
      name: "ccr-agent-proxy.crt",
      refresh: ["update-ca-certificates"]
    }, {
      dir: "/etc/pki/ca-trust/source/anchors",
      name: "ccr-agent-proxy.crt",
      refresh: ["update-ca-trust", "extract"]
    }];
  });
  var DEc = {};
  __export(DEc, {
    showInvalidConfigDialog: () => showInvalidConfigDialog
  });
  function SEf(e) {
    let t = OEc.c(19);
    let {
      filePath: n,
      errorDescription: r,
      onExit: o,
      onReset: s
    } = e;
    let i;
    if (t[0] !== o || t[1] !== s) {
      i = h => {
        if (h === "exit") {
          o();
        } else {
          s();
        }
      };
      t[0] = o;
      t[1] = s;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== n) {
      l = LK.jsxs(Text, {
        children: ["The configuration file at ", LK.jsx(Text, {
          bold: true,
          children: n
        }), " contains invalid JSON."]
      });
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== r) {
      c = LK.jsx(Text, {
        children: r
      });
      t[5] = r;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== l || t[8] !== c) {
      u = LK.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [l, c]
      });
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      d = LK.jsx(Text, {
        bold: true,
        children: "Choose an option:"
      });
      t[10] = d;
    } else {
      d = t[10];
    }
    let p;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      p = [{
        label: "Exit and fix manually",
        value: "exit"
      }, {
        label: "Reset with default configuration",
        value: "reset"
      }];
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== a || t[13] !== o) {
      m = LK.jsxs(gXd, {
        flexDirection: "column",
        children: [d, LK.jsx(xr, {
          options: p,
          onChange: a,
          onCancel: o
        })]
      });
      t[12] = a;
      t[13] = o;
      t[14] = m;
    } else {
      m = t[14];
    }
    let f;
    if (t[15] !== o || t[16] !== u || t[17] !== m) {
      f = LK.jsxs(or, {
        title: "Configuration error",
        color: "error",
        onCancel: o,
        children: [u, m]
      });
      t[15] = o;
      t[16] = u;
      t[17] = m;
      t[18] = f;
    } else {
      f = t[18];
    }
    return f;
  }
  async function showInvalidConfigDialog({
    error: e
  }) {
    let t = {
      ...getBaseRenderOptions(false),
      theme: "dark"
    };
    await new Promise(async n => {
      let {
        unmount: r
      } = await render(LK.jsx(AppStateProvider, {
        children: LK.jsx(KeybindingSetup, {
          children: LK.jsx(SEf, {
            filePath: e.filePath,
            errorDescription: e.message,
            onExit: () => {
              r();
              n();
              process.exit(1);
            },
            onReset: () => {
              vxe(e.filePath, De(e.defaultConfig, null, 2), {
                flush: false,
                encoding: "utf8"
              });
              r();
              n();
              process.exit(0);
            }
          })
        })
      }), t);
    });
  }
  var OEc;
  var LK;
  var MEc = __lazy(() => {
    et();
    C9();
    _3();
    Qoe();
    OS();
    Ii();
    OEc = __toESM(pt(), 1);
    LK = __toESM(ie(), 1);
  });
  var NEc = {};
  __export(NEc, {
    initializeTelemetryAfterTrust: () => initializeTelemetryAfterTrust,
    init: () => init
  });
  function initializeTelemetryAfterTrust() {
    if (RCo()) {
      if (getIsNonInteractiveSession() && Tx()) {
        iJo().catch(e => {
          logForDebugging(`[3P telemetry] Eager telemetry init failed (beta tracing): ${he(e)}`, {
            level: "error"
          });
        });
      }
      logForDebugging("[3P telemetry] Waiting for remote managed settings before telemetry init");
      G8e().then(async () => {
        logForDebugging("[3P telemetry] Remote managed settings loaded, initializing telemetry");
        applyConfigEnvironmentVariables();
        await iJo();
      }).catch(e => {
        logForDebugging(`[3P telemetry] Telemetry init failed (remote settings path): ${he(e)}`, {
          level: "error"
        });
      });
    } else {
      iJo().catch(e => {
        logForDebugging(`[3P telemetry] Telemetry init failed: ${he(e)}`, {
          level: "error"
        });
      });
    }
  }
  async function iJo() {
    if (sJo) {
      return;
    }
    sJo = true;
    try {
      await wEf();
    } catch (e) {
      throw sJo = false, e;
    } finally {
      discardPendingOTelEvents();
    }
  }
  async function wEf() {
    let {
      initializeTelemetry: e
    } = await Promise.resolve().then(() => (k0o(), x0o));
    let t = await e();
    if (t) {
      setMeter(t, (r, o) => {
        let s = t?.createCounter(r, o);
        return {
          add(i, a = {}) {
            let c = {
              ...RGe(),
              ...a
            };
            s?.add(i, c);
          }
        };
      });
      getSessionCounter()?.add(1, {
        start_type: getSessionStartType()
      });
    }
  }
  var sJo = false;
  var init;
  var Afr = __lazy(() => {
    H4();
    at();
    at();
    at();
    Tpe();
    qP();
    q$();
    Kc();
    z8e();
    m8t();
    JDo();
    no();
    VTc();
    hd();
    je();
    bI();
    Zm();
    YW();
    gn();
    dt();
    lm();
    Rn();
    qEe();
    fW();
    wm();
    Cs();
    Fh();
    g7e();
    cMe();
    Jf();
    s1();
    kTe();
    xFn();
    KTc();
    wj();
    init = TEr(async () => {
      let e = Date.now();
      wn("info", "init_started");
      profileCheckpoint("init_function_start");
      try {
        let t = Date.now();
        enableConfigs();
        wn("info", "init_configs_enabled", {
          duration_ms: Date.now() - t
        });
        profileCheckpoint("init_configs_enabled");
        let n = Date.now();
        if (applySafeConfigEnvironmentVariables(), await assertScrubSandboxAvailable(), GTc(), await restoreGatewayAuth(), getGatewayAuth()) {
          q8e();
        }
        if (wn("info", "init_safe_env_vars_applied", {
          duration_ms: Date.now() - n
        }), profileCheckpoint("init_safe_env_vars_applied"), setupGracefulShutdown(), profileCheckpoint("init_after_graceful_shutdown"), Promise.all([Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => ($n(), aDn))]).then(([s, i]) => {
          s.initialize1PEventLogging();
          i.onGrowthBookRefresh(() => {
            s.reinitialize1PEventLoggingIfConfigChanged();
          });
        }), profileCheckpoint("init_after_1p_event_logging"), populateOAuthAccountInfoIfNeeded().catch(Oe), profileCheckpoint("init_after_oauth_populate"), tXr(), profileCheckpoint("init_after_jetbrains_detection"), detectCurrentRepository(), RCo()) {
          CCo();
        }
        if (isPolicyLimitsEligible()) {
          initializePolicyLimitsLoadingPromise();
        }
        profileCheckpoint("init_after_remote_settings_check");
        recordFirstStartTime();
        getOrCreateMachineID();
        let r = Date.now();
        logForDebugging("[init] configureGlobalMTLS starting");
        configureGlobalMTLS();
        wn("info", "init_mtls_configured", {
          duration_ms: Date.now() - r
        });
        logForDebugging("[init] configureGlobalMTLS complete");
        let o = Date.now();
        if (logForDebugging("[init] configureGlobalAgents starting"), configureGlobalAgents(), wn("info", "init_proxy_configured", {
          duration_ms: Date.now() - o
        }), logForDebugging("[init] configureGlobalAgents complete"), profileCheckpoint("init_network_configured"), gbl(), st(process.env.CLAUDE_CODE_REMOTE)) {
          try {
            let {
              initAgentProxy: s,
              getAgentProxyEnv: i
            } = await Promise.resolve().then(() => (PEc(), IEc));
            let {
              registerAgentProxyEnvFn: a
            } = await Promise.resolve().then(() => (s1(), R3i));
            a(i);
            await s();
          } catch (s) {
            logForDebugging(`[init] agent proxy init failed: ${s instanceof Error ? s.message : String(s)}; continuing without proxy`, {
              level: "warn"
            });
          }
        }
        if (zTc(), Xhn(), Wt() === "windows" && !Pu()) {
          if (!uU()) {
            console.error(`Claude Code on Windows requires a shell tool. Git Bash was not found and the PowerShell tool is disabled (CLAUDE_CODE_USE_POWERSHELL_TOOL=0).
  - Install Git for Windows: https://git-scm.com/downloads/win, or
  - Remove CLAUDE_CODE_USE_POWERSHELL_TOOL from your environment or settings.`);
            process.exit(1);
          }
          if ((await qV()) === null) {
            console.error(`Claude Code on Windows requires either Git for Windows (for bash) or PowerShell. Install one of:
  - Git for Windows: https://git-scm.com/downloads/win
  - PowerShell 7: https://aka.ms/powershell
Or set CLAUDE_CODE_GIT_BASH_PATH to your bash.exe location.`);
            process.exit(1);
          }
        }
        if (Ti(LWa), Ti(async () => {
          let {
            cleanupSessionTeams: s
          } = await Promise.resolve().then(() => (UM(), lgl));
          await s();
        }), isScratchpadEnabled()) {
          let s = Date.now();
          try {
            let i = await ensureScratchpadDir();
            wn("info", i === null ? "init_scratchpad_unavailable" : "init_scratchpad_created", {
              duration_ms: Date.now() - s
            });
          } catch (i) {
            logForDebugging(`init: ensureScratchpadDir failed: ${i}`, {
              level: "error"
            });
          }
        }
        onSessionSwitch(() => {
          if (isScratchpadEnabled()) {
            ensureScratchpadDir().catch(s => logForDebugging(`onSessionSwitch: ensureScratchpadDir failed: ${s}`, {
              level: "error"
            }));
          }
        });
        wn("info", "init_completed", {
          duration_ms: Date.now() - e
        });
        profileCheckpoint("init_function_end");
      } catch (t) {
        if (t instanceof PB) {
          if (getIsNonInteractiveSession()) {
            process.stderr.write(`Configuration error in ${t.filePath}: ${t.message}
`);
            gracefulShutdownSync(1);
            return;
          }
          return Promise.resolve().then(() => (MEc(), DEc)).then(n => n.showInvalidConfigDialog({
            error: t
          }));
        } else {
          throw t;
        }
      }
    });
  });
  function Ifr(e) {
    return e.map(t => {
      let n;
      if (t.config.type === "sse" || t.config.type === "http") {
        n = {
          type: t.config.type,
          url: t.config.url,
          headers: t.config.headers
        };
      } else if (t.config.type === "claudeai-proxy") {
        n = {
          type: "claudeai-proxy",
          url: t.config.url,
          id: t.config.id
        };
      } else if (t.config.type === "stdio" || t.config.type === undefined) {
        n = {
          type: "stdio",
          command: t.config.command,
          args: t.config.args
        };
      }
      return {
        name: t.name,
        status: t.type,
        config: n,
        scope: t.config.scope,
        serverInfo: t.type === "connected" ? t.serverInfo : undefined,
        error: t.type === "failed" ? t.error : undefined
      };
    });
  }
  var lJo = __lazy(() => {
    at();
    C$();
    JLe();
    dt();
    Rn();
    Ds();
  });
  var LEc = __lazy(() => {
    JLe();
    eKe();
    tnr();
    s7e();
    R$();
    dt();
    lJo();
  });
  function ern(e) {
    return e === "aborted_streaming" || e === "aborted_tools";
  }
  var FEc;
  var Pfr = __lazy(() => {
    FEc = ["blocking_limit", "rapid_refill_breaker", "prompt_too_long", "image_error", "model_error", "aborted_streaming", "aborted_tools", "stop_hook_prevented", "hook_stopped", "tool_deferred", "max_turns", "background_requested", "completed"];
  });
  function UEc(e) {
    return {
      commands: e.commands ?? [],
      agents: e.agents ?? [],
      output_style: e.outputStyle ?? "default",
      available_output_styles: e.availableOutputStyles ?? ["default"],
      models: e.models ?? [],
      ...(e.unavailableModels && e.unavailableModels.length > 0 && {
        unavailable_models: e.unavailableModels
      }),
      account: e.account ?? {
        apiProvider: "firstParty"
      },
      pid: e.pid ?? process.pid
    };
  }
  function Ofr(e) {
    if (e.length === 0) {
      return;
    }
    return {
      type: "system",
      subtype: "memory_recall",
      mode: "select",
      memories: e.map(t => ({
        path: t.path,
        scope: N5a(t.path) ?? "personal"
      })),
      uuid: BEc.randomUUID(),
      session_id: getSessionId()
    };
  }
  var BEc;
  var cJo = __lazy(() => {
    at();
    sgt();
    BEc = require("crypto");
  });
  function trn(e) {
    return e === "Agent" ? "Task" : e;
  }
  function MRt() {
    let e = getInitialSettings();
    let t;
    if (Vd()) {
      if (t = {
        auto: vf()
      }, uO()) {
        t.team = pw();
      }
    }
    let n;
    return {
      cwd: Nt(),
      sessionId: getSessionId(),
      apiKeySource: getApiKeySourceSafe(),
      betas: getSdkBetas(),
      outputStyle: e?.outputStyle ?? "default",
      analyticsDisabled: Jj(),
      productFeedbackDisabled: !isPolicyAllowed("allow_product_feedback"),
      memoryPaths: t,
      messagingSocketPath: n
    };
  }
  function NRt(e) {
    let t = {
      type: "system",
      subtype: "init",
      cwd: e.cwd,
      session_id: e.sessionId,
      tools: e.tools.map(n => trn(n.name)),
      mcp_servers: e.mcpClients.map(n => ({
        name: n.name,
        status: n.type
      })),
      model: e.model,
      permissionMode: e.permissionMode,
      slash_commands: e.commands.filter(n => n.userInvocable !== false).map(n => n.name),
      apiKeySource: e.apiKeySource,
      betas: e.betas,
      claude_code_version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      output_style: e.outputStyle,
      agents: e.agents.map(n => n.agentType),
      skills: e.skills.filter(n => n.userInvocable !== false).map(n => n.name),
      plugins: e.plugins.map(n => ({
        name: n.name,
        path: n.path,
        source: n.source
      })),
      ...(e.pluginErrors.length > 0 && {
        plugin_errors: e.pluginErrors.map(n => ({
          ...n
        }))
      }),
      ...(e.pluginWarnings.length > 0 && {
        plugin_warnings: e.pluginWarnings.map(n => ({
          ...n
        }))
      }),
      analytics_disabled: e.analyticsDisabled,
      product_feedback_disabled: e.productFeedbackDisabled,
      uuid: $Ec.randomUUID()
    };
    if (e.memoryPaths) {
      t.memory_paths = {
        ...e.memoryPaths
      };
    }
    t.fast_mode_state = e.fastModeState;
    return t;
  }
  function Dfr(e, t) {
    au("init_emit_ms", performance.now() - t, t);
    let n = mhl();
    if (n) {
      e.startup_timing = n;
    }
  }
  var $Ec;
  var nrn = __lazy(() => {
    at();
    Kq();
    Eb();
    a1();
    KW();
    Kc();
    Sh();
    no();
    vo();
    R3();
    $Ec = require("crypto");
  });
  var HEc = __lazy(() => {
    at();
    aE();
    ci();
    _h();
    Rn();
    ro();
    Eo();
  });
  function qEc() {
    return rrn.join(er(), "image-cache", getSessionId());
  }
  async function xEf() {
    let e = qEc();
    await Mfr.mkdir(e, {
      recursive: true
    });
  }
  function WEc(e, t) {
    let n = t.split("/")[1] || "png";
    return rrn.join(qEc(), `${e}.${n}`);
  }
  function LRt(e, t) {
    if (e.type !== "image") {
      return null;
    }
    let n = WEc(e.id, e.mediaType || "image/png");
    zEc(t, e.id, n);
    return n;
  }
  async function FRt(e, t) {
    let n = await VEc(e);
    if (n) {
      zEc(t, e.id, n);
    }
    return n;
  }
  async function GEc(e, t) {
    let n = new Map();
    for (let [r, o] of Object.entries(e)) {
      if (o.type === "image") {
        let s = await VEc(o);
        if (s) {
          n.set(Number(r), s);
        }
      }
    }
    if (n.size > 0) {
      t(r => {
        let o = r.storedImagePaths;
        for (let [s, i] of n) {
          o = KEc(o, s, i);
        }
        return o === r.storedImagePaths ? r : {
          ...r,
          storedImagePaths: o
        };
      });
    }
    return n;
  }
  async function VEc(e) {
    if (e.type !== "image") {
      return null;
    }
    try {
      await xEf();
      let t = WEc(e.id, e.mediaType || "image/png");
      let n = await Mfr.open(t, "w", 384);
      try {
        await n.writeFile(e.content, {
          encoding: "base64"
        });
        await n.datasync();
      } finally {
        await n.close();
      }
      logForDebugging(`Stored image ${e.id} to ${t}`);
      return t;
    } catch (t) {
      logForDebugging(`Failed to store image: ${t}`);
      return null;
    }
  }
  function zEc(e, t, n) {
    e(r => {
      let o = KEc(r.storedImagePaths, t, n);
      return o === r.storedImagePaths ? r : {
        ...r,
        storedImagePaths: o
      };
    });
  }
  function KEc(e, t, n) {
    if (e.get(t) === n) {
      return e;
    }
    let r = new Map(e);
    if (!r.vZc(t)) {
      while (r.size >= 200) {
        let o = r.keys().next().value;
        if (o === undefined) {
          break;
        }
        r.delete(o);
      }
    }
    r.set(t, n);
    return r;
  }
  async function YEc() {
    let e = zt();
    let t = rrn.join(er(), "image-cache");
    let n = getSessionId();
    try {
      let r;
      try {
        r = await e.readdir(t);
      } catch {
        return;
      }
      for (let o of r) {
        if (o.name === n) {
          continue;
        }
        let s = rrn.join(t, o.name);
        try {
          await e.rm(s, {
            recursive: true,
            force: true
          });
          logForDebugging(`Cleaned up old image cache: ${s}`);
        } catch {}
      }
      try {
        if ((await e.readdir(t)).length === 0) {
          await e.rmdir(t);
        }
      } catch {}
    } catch {}
  }
  var Mfr;
  var rrn;
  var URt = __lazy(() => {
    at();
    je();
    gn();
    Mfr = require("fs/promises");
    rrn = require("path");
  });
  function JEc(e, t, n, r, o, s, i, a, l, c, u) {
    let d = typeof e === "string" ? e : e.find(b => b.type === "text")?.text || "";
    let p = typeof e === "string" ? e : e.findLast(b => b.type === "text")?.text || "";
    if (p) {
      su("user_prompt", {
        prompt_length: String(p.length),
        prompt: tqt(p),
        "prompt.id": o
      });
    }
    let m = JLl(d);
    let f = XLl(d);
    let h = ZLl(d);
    let g = a ? null : getLastCancelledAPIMessageId();
    let y = a ? undefined : incrementPromptIndex();
    if (logEvent("tengu_input_prompt", {
      is_negative: m,
      is_keep_going: f,
      is_wakeup: h,
      prompt_index: y,
      prompt_length: p.length,
      ...(c && {
        prompt_source: c
      }),
      ...(l && {
        effort_level: l
      }),
      ...(g && {
        interrupted_message_id: br(g)
      })
    }), t.length > 0) {
      let b = typeof e === "string" ? e.trim() ? [{
        type: "text",
        text: e
      }] : [] : e;
      let S = In({
        content: [...b, ...t],
        uuid: s,
        imagePasteIds: n.length > 0 ? n : undefined,
        permissionMode: i,
        isMeta: a || undefined,
        promptSource: c,
        origin: u
      });
      if (u) {
        XKo(S, u);
      }
      return {
        messages: [S, ...r],
        shouldQuery: true
      };
    }
    let _ = In({
      content: e,
      uuid: s,
      permissionMode: i,
      isMeta: a || undefined,
      promptSource: c,
      origin: u
    });
    if (u) {
      XKo(_, u);
    }
    return {
      messages: [_, ...r],
      shouldQuery: true
    };
  }
  var XEc = __lazy(() => {
    at();
    Ot();
    B_();
    ro();
    yS();
    e2o();
  });
  function QEc({
    isNonInteractive: e,
    isMeta: t,
    callerSource: n
  }) {
    if (e) {
      return "sdk";
    }
    if (t) {
      return "system";
    }
    return n ?? "typed";
  }
  function srn(e) {
    let t = ZEc.c(8);
    let {
      input: n,
      progress: r,
      verbose: o
    } = e;
    let s = `<bash-input>${n}</bash-input>`;
    let i;
    if (t[0] !== s) {
      i = orn.jsx(YQn, {
        addMargin: false,
        param: {
          text: s,
          type: "text"
        }
      });
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== r || t[3] !== o) {
      a = r ? orn.jsx(Mht, {
        fullOutput: r.fullOutput,
        output: r.output,
        elapsedTimeSeconds: r.elapsedTimeSeconds,
        totalLines: r.totalLines,
        verbose: o
      }) : xl.renderToolUseProgressMessage?.([], {
        verbose: o,
        tools: [],
        terminalSize: undefined
      });
      t[2] = r;
      t[3] = o;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== i || t[6] !== a) {
      l = orn.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [i, a]
      });
      t[5] = i;
      t[6] = a;
      t[7] = l;
    } else {
      l = t[7];
    }
    return l;
  }
  var ZEc;
  var orn;
  var uJo = __lazy(() => {
    et();
    R$();
    WMo();
    a9n();
    ZEc = __toESM(pt(), 1);
    orn = __toESM(ie(), 1);
  });
  function Nfr() {
    let e = getInitialSettings().defaultShell;
    if (e === "bash" && !Pu()) {
      return "powershell";
    }
    if (e === "powershell" && !uU()) {
      return "bash";
    }
    return e ?? (Pu() ? "bash" : "powershell");
  }
  var dJo = __lazy(() => {
    Jf();
  });
  var evc = {};
  __export(evc, {
    processBashCommand: () => processBashCommand
  });
  async function processBashCommand(e, t, n, r) {
    let o = uU() && Nfr() === "powershell";
    let s = getInitialSettings().respondToBashCommands ?? true;
    logEvent("tengu_input_bash", {
      powershell: o,
      respond: s
    });
    let i = In({
      content: Kz({
        inputString: `<bash-input>${e}</bash-input>`,
        precedingInputBlocks: t
      })
    });
    let a;
    let l = pJo.randomUUID();
    let {
      emitToolProgress: c
    } = n;
    c?.({
      kind: "bash_mode_progress",
      toolUseId: l,
      input: e,
      progress: null,
      verbose: n.options.verbose
    });
    r({
      jsx: VJe.jsx(srn, {
        input: e,
        progress: null,
        verbose: n.options.verbose
      }),
      shouldHidePromptInput: false
    });
    try {
      let u = {
        ...n,
        toolUseId: `${l}:inner`,
        setToolJSX: E => {
          a = E?.jsx;
        }
      };
      let d = E => {
        if (E.type !== "progress") {
          return;
        }
        c?.({
          kind: "bash_mode_progress",
          toolUseId: l,
          input: e,
          progress: E.data,
          verbose: n.options.verbose
        });
        r({
          jsx: VJe.jsxs(VJe.Fragment, {
            children: [VJe.jsx(srn, {
              input: e,
              progress: E.data,
              verbose: n.options.verbose
            }), a]
          }),
          shouldHidePromptInput: false,
          showSpinner: false
        });
      };
      let p = null;
      if (o) {
        p = (h6t(), __toCommonJS(f6t)).PowerShellTool;
      }
      let m = p ?? xl;
      let h = (p ? await p.call({
        command: e,
        dangerouslyDisableSandbox: true
      }, u, undefined, undefined, d) : await xl.call({
        command: e,
        dangerouslyDisableSandbox: true
      }, u, undefined, undefined, d)).data;
      if (!h) {
        throw Error("No result received from shell command");
      }
      let g = h.stderr;
      let y = await xmt(m, {
        ...h,
        stderr: ""
      }, pJo.randomUUID());
      let _ = typeof y.content === "string" ? y.content : h.stdout;
      let b = _.startsWith("<persisted-output>") ? _ : $a(_);
      let S = s && !h.interrupted && !h.backgroundTaskId && !n.abortController.signal.aborted;
      return {
        messages: [...(S ? [] : [Nse()]), i, In({
          content: `<bash-stdout>${b}</bash-stdout><bash-stderr>${$a(g)}</bash-stderr>`
        })],
        shouldQuery: S
      };
    } catch (u) {
      if (u instanceof RN) {
        if (u.interrupted) {
          return {
            messages: [Nse(), i, fZ({
              toolUse: false
            })],
            shouldQuery: false
          };
        }
        let p = s && !n.abortController.signal.aborted;
        return {
          messages: [...(p ? [] : [Nse()]), i, In({
            content: `<bash-stdout>${$a(u.stdout)}</bash-stdout><bash-stderr>${$a(u.stderr)}</bash-stderr>`
          })],
          shouldQuery: p
        };
      }
      let d = s && !n.abortController.signal.aborted;
      return {
        messages: [...(d ? [] : [Nse()]), i, In({
          content: `<bash-stderr>Command failed: ${$a(he(u))}</bash-stderr>`
        })],
        shouldQuery: d
      };
    } finally {
      c?.({
        kind: "clear",
        toolUseId: l
      });
      r(null);
    }
  }
  var pJo;
  var VJe;
  var tvc = __lazy(() => {
    uJo();
    R$();
    Ot();
    dt();
    ro();
    dJo();
    Jf();
    zI();
    wx();
    pJo = require("crypto");
    VJe = __toESM(ie(), 1);
  });
  async function BRt({
    input: e,
    preExpansionInput: t,
    suppressWorkflowKeyword: n,
    mode: r,
    setToolJSX: o,
    context: s,
    pastedContents: i,
    ideSelection: a,
    messages: l,
    setUserInputOnProcessing: c,
    uuid: u,
    isAlreadyProcessing: d,
    querySource: p,
    canUseTool: m,
    skipSlashCommands: f,
    bridgeOrigin: h,
    modelScheduledOrigin: g,
    isMeta: y,
    skipAttachments: _,
    shouldQuery: b,
    promptSource: S,
    origin: E
  }) {
    let C = typeof e === "string" ? e : null;
    if (r === "prompt" && C !== null && !y) {
      c?.(C);
    }
    Qp("query_process_user_input_base_start");
    let x = await IEf(e, r, o, s, i, a, l, u, d, p, m, getToolPermissionContext(s).mode, f, h, g, y, _, t, S, n, E);
    if (Qp("query_process_user_input_base_end"), !d) {
      SZn(s.setToolPermissionContext, x.disallowedTools ?? []);
    }
    if (b === false) {
      x.shouldQuery = false;
    }
    if (!x.shouldQuery || r === "bash") {
      return x;
    }
    Qp("query_hooks_start");
    let A = cZ(e) || "";
    let k;
    let I = performance.now();
    for await (let O of executeUserPromptSubmitHooks(A, getToolPermissionContext(s).mode, s)) {
      if (O.message?.type === "progress") {
        continue;
      }
      if (O.blockingError) {
        let M = getUserPromptSubmitHookBlockingMessage(O.blockingError);
        let L = O.suppressOriginalPrompt ? M : `${M}

Original prompt: ${A}`;
        return {
          messages: [wc(L, "warning", undefined, true)],
          shouldQuery: false,
          resultText: L
        };
      }
      if (O.preventContinuation) {
        let M = O.stopReason ? `Operation stopped by hook: ${O.stopReason}` : "Operation stopped by hook";
        x.messages.push(In({
          content: M
        }), wc(M, "warning", undefined, true));
        x.shouldQuery = false;
        x.resultText = M;
        x.allowedTools = undefined;
        return x;
      }
      if (O.sessionTitle) {
        k = O.sessionTitle;
      }
      if (O.additionalContexts && O.additionalContexts.length > 0) {
        x.messages.push(createAttachmentMessage({
          type: "hook_additional_context",
          content: O.additionalContexts,
          hookName: "UserPromptSubmit",
          toolUseID: `hook-${Ffr.randomUUID()}`,
          hookEvent: "UserPromptSubmit"
        }));
      }
      if (O.message) {
        switch (O.message.attachment.type) {
          case "hook_success":
            if (!O.message.attachment.content) {
              break;
            }
            x.messages.push(O.message);
            break;
          default:
            x.messages.push(O.message);
            break;
        }
      }
    }
    if (au("prompt_submit_hooks_ms", performance.now() - I, I), k) {
      await applyHookSessionTitle(k);
    }
    Qp("query_hooks_end");
    return x;
  }
  async function IEf(e, t, n, r, o, s, i, a, l, c, u, d, p, m, f, h, g, y, _, b, S) {
    let E = QEc({
      isNonInteractive: r.options.isNonInteractiveSession,
      isMeta: h,
      callerSource: _
    });
    let C = null;
    let x = [];
    let A = [];
    let k = Yg(r.options.mainLoopModel);
    let I = e;
    if (typeof e === "string") {
      C = e;
    } else if (e.length > 0) {
      Qp("query_image_processing_start");
      let K = [];
      for (let Q of e) {
        if (Q.type === "image") {
          let Z = await qXi(Q, k);
          if (Z.dimensions) {
            let ne = Jct(Z.dimensions);
            if (ne) {
              A.push(ne);
            }
          }
          K.push(Z.block);
        } else {
          K.push(Q);
        }
      }
      I = K;
      Qp("query_image_processing_end");
      let J = K.at(-1);
      if (J?.type === "text") {
        C = J.text;
        x = K.slice(0, -1);
      } else {
        x = K;
      }
    }
    if (C === null && t !== "prompt") {
      throw Error(`Mode: ${t} requires a string input.`);
    }
    let O = o ? Object.values(o).filter(D7e) : [];
    let M = o ? await GEc(o, r.setAppState) : new Map();
    Qp("query_pasted_image_processing_start");
    let L = await Promise.all(O.map(async K => {
      logEvent("tengu_pasted_image_resize_attempt", {
        original_size_bytes: K.content.length
      });
      let J = await f1({
        data: K.content,
        mediaType: K.mediaType,
        limits: k
      });
      J.block.type;
      return {
        id: K.id,
        resized: J,
        originalDimensions: K.dimensions,
        sourcePath: K.sourcePath ?? M.get(K.id)
      };
    }));
    let P = [];
    let F = [];
    for (let {
      id: K,
      resized: J,
      originalDimensions: Q,
      sourcePath: Z
    } of L) {
      if (P.push(J.block), J.block.type !== "image") {
        continue;
      }
      if (F.push(K), J.dimensions) {
        let ne = Jct(J.dimensions, Z);
        if (ne) {
          A.push(ne);
        }
      } else if (Q) {
        let ne = Jct(Q, Z);
        if (ne) {
          A.push(ne);
        }
      } else if (Z) {
        A.push(`[Image source: ${Z}]`);
      }
    }
    Qp("query_pasted_image_processing_end");
    let H = p;
    let U = r;
    let N = C;
    if (m && C !== null && C.startsWith("/")) {
      let K = Jve(C);
      let J = K?.commandName;
      if (nA()) {
        if (J) {
          let Z = w7t(J, r.options.commands);
          if (Z) {
            J = Z.commandName;
          }
        }
      }
      let Q = J ? findCommand(J, r.options.commands) : undefined;
      if (Q) {
        let Z = K ? Y7t(Q, K.args) : undefined;
        let ne = Z ? findCommand(Z.targetName, r.options.commands) : undefined;
        let oe = Z && ne && isCommandEnabled(ne) ? {
          command: ne,
          consumedToken: Z.consumedToken,
          args: Z.remainingArgs
        } : undefined;
        let ee = oe ? oe.command : Q;
        if (isBridgeSafeCommand(ee)) {
          H = false;
        } else {
          let re = findBridgeFallback(ee);
          if (re) {
            H = false;
            N = oe ? `/${re.name}${oe.args ? ` ${oe.args}` : ""}` : C.replace(/^\/\S+/, `/${re.name}`);
            U = {
              ...r,
              options: {
                ...r.options,
                commands: [re, ...r.options.commands]
              }
            };
          } else {
            let se = oe ? `/${getCommandName(Q)} ${oe.consumedToken} isn't available over Remote Control.` : `/${getCommandName(ee)} isn't available over Remote Control.`;
            return {
              messages: [In({
                content: C,
                uuid: a,
                origin: S
              }), mR(`<local-command-stdout>${se}</local-command-stdout>`)],
              shouldQuery: false,
              resultText: se
            };
          }
        }
      }
    }
    if (f && !m && C !== null && C.startsWith("/")) {
      let K = Jve(C);
      let J = K?.commandName;
      if (nA()) {
        if (J) {
          let ne = w7t(J, r.options.commands);
          if (ne) {
            J = ne.commandName;
          }
        }
      }
      let Q = J ? findCommand(J, r.options.commands) : undefined;
      let Z = K?.args ?? "";
      if (!Q && J && K && !K.isMcp && Z.trim()) {
        let ne = Z.trimStart();
        let oe = ne.search(/\s/);
        let ee = oe === -1 ? ne : ne.slice(0, oe);
        let re = findCommand(`${J}:${ee}`, r.options.commands);
        if (re) {
          Q = re;
          Z = oe === -1 ? "" : ne.slice(oe + 1).trimStart();
        }
      }
      if (Q) {
        let ne = isSkillOff(Q) ? undefined : Y7t(Q, Z);
        let oe = ne ? findCommand(ne.targetName, r.options.commands) : undefined;
        let ee = ne && oe && isCommandEnabled(oe) ? oe : Q;
        if (MZn(ee, {
          commandName: ee.name,
          userTypedThisTurn: false,
          isMainSession: true,
          permissionContext: getToolPermissionContext(r)
        }) === null) {
          H = false;
        }
      }
    }
    if (zfe() && t === "prompt" && !r.options.isNonInteractiveSession && C !== null && !H && !C.startsWith("/") && !r.options.ultraplanSessionUrl && !r.getAppState().ultraplanLaunching && kUl(y ?? C)) {
      logEvent("tengu_ultraplan_keyword", {});
      let K = sor(C).trim();
      let {
        processSlashCommand: J
      } = await Promise.resolve().then(() => (DLe(), X7t));
      let Q = await J(`/ultraplan ${K}`, x, P, [], r, n, a, l, u, E);
      r.setAppState(Z => Z.ultraplanLaunchPending ? {
        ...Z,
        ultraplanLaunchPending: {
          ...Z.ultraplanLaunchPending,
          source: "keyword"
        }
      } : Z);
      return Lfr(Q, A);
    }
    if (C !== null && t === "bash") {
      let {
        processBashCommand: K
      } = await Promise.resolve().then(() => (tvc(), evc));
      return Lfr(await K(C, x, r, n), A);
    }
    let W = !g && (t !== "prompt" || H || !C?.startsWith("/"));
    let j = Ffr.randomUUID();
    setPromptId(j);
    let z = t === "prompt" && !h;
    Qp("query_attachment_loading_start");
    let V = W ? await WXn(getAttachmentMessages(C, r, s ?? null, [], {
      now: () => new Date().toISOString(),
      uuid: () => Ffr.randomUUID()
    }, i, c, {
      isRegularUserPrompt: z,
      preExpansionInput: y,
      suppressWorkflowKeyword: b
    })) : [];
    if (Qp("query_attachment_loading_end"), N !== null && !H && N.startsWith("/")) {
      let {
        processSlashCommand: K
      } = await Promise.resolve().then(() => (DLe(), X7t));
      let J = await K(N, x, P, V, U, n, a, l, u, E);
      return Lfr(J, A);
    }
    if (C !== null && t === "prompt") {
      let K = C.trim();
      let J = V.find(Q => Q.attachment.type === "agent_mention");
      if (J) {
        let Q = `@agent-${J.attachment.agentType}`;
        let Z = K === Q;
        let ne = K.startsWith(Q) && !Z;
        logEvent("tengu_subagent_at_mention", {
          is_subagent_only: Z,
          is_prefix: ne
        });
      }
    }
    return Lfr(JEc(I, P, F, V, j, a, d, h, aO(r.options.mainLoopModel, getEffortValue(r)), E, S), A);
  }
  function Lfr(e, t) {
    if (t.length > 0) {
      e.messages.push(In({
        content: t.map(n => ({
          type: "text",
          text: n
        })),
        isMeta: true
      }));
    }
    return e;
  }
  var Ffr;
  var Ufr = __lazy(() => {
    at();
    Ot();
    ro();
    Bm();
    Noe();
    ASt();
    xNo();
    rR();
    Sl();
    Fp();
    Zze();
    Sp();
    HEc();
    yG();
    URt();
    ro();
    JF();
    bNo();
    y7e();
    K7t();
    R3();
    _en();
    CXt();
    XEc();
    Ffr = require("crypto");
  });
  var rvc = {};
  __export(rvc, {
    readFileForRemote: () => readFileForRemote,
    REMOTE_READ_MAX_BYTES: () => 1e7
  });
  async function readFileForRemote(e, t, n, r = "utf-8") {
    let o = us(e);
    for (let a of fg(o)) {
      if (!xdt(a, n, "read").allowed) {
        throw Error(`read denied: ${e}`);
      }
    }
    let s = Math.min(t && t > 0 ? t : 1e6, 1e7);
    let i = await nvc.open(o, "r");
    try {
      let a = Buffer.alloc(s + 1);
      let {
        bytesRead: l
      } = await i.read(a, 0, s + 1, 0);
      let c = l > s;
      return {
        contents: a.subarray(0, Math.min(l, s)).toString(r === "base64" ? "base64" : "utf-8"),
        absPath: o,
        ...(c && {
          truncated: c
        }),
        ...(r === "base64" && {
          encoding: r
        })
      };
    } finally {
      await i.close();
    }
  }
  var nvc;
  var arn = __lazy(() => {
    ku();
    mde();
    nvc = require("fs/promises");
  });
  function mJo(e, t = "$") {
    let n = [];
    let r = new WeakSet();
    let o = new WeakSet();
    s(e, t);
    return n;
    function s(i, a) {
      if (i === null) {
        return;
      }
      let l = typeof i;
      if (l === "function") {
        n.push({
          path: a,
          kind: "function",
          preview: ovc(i)
        });
        return;
      }
      if (l === "symbol") {
        n.push({
          path: a,
          kind: "symbol",
          preview: String(i)
        });
        return;
      }
      if (l === "bigint") {
        n.push({
          path: a,
          kind: "bigint",
          preview: `${i}n`
        });
        return;
      }
      if (l !== "object") {
        return;
      }
      let c = i;
      if (r.vZc(c)) {
        n.push({
          path: a,
          kind: "circular",
          preview: "<circular>"
        });
        return;
      }
      if (o.vZc(c)) {
        return;
      }
      o.add(c);
      r.add(c);
      try {
        if (Array.isArray(c)) {
          for (let p = 0; p < c.length; p++) {
            s(c[p], `${a}[${p}]`);
          }
          return;
        }
        let u = Object.getPrototypeOf(c);
        if (!(u === null || u === Object.prototype || Object.getPrototypeOf(u) === null)) {
          if (n.push({
            path: a,
            kind: "class_instance",
            preview: ovc(c)
          }), ArrayBuffer.isView(c) || c instanceof ArrayBuffer) {
            return;
          }
        }
        for (let [p, m] of Object.entries(c)) {
          s(m, `${a}.${p}`);
        }
      } finally {
        r.delete(c);
      }
    }
  }
  function ovc(e) {
    try {
      if (typeof e === "function") {
        return `function ${e.name || "<anon>"}`;
      }
      let t = e?.constructor?.name;
      return t ? `<${t}>` : String(e);
    } catch {
      return "<unstringifiable>";
    }
  }
  var $fr;
  var svc = __lazy(() => {
    $fr = class $fr extends TypeError {
      violations;
      frameType;
      constructor(e, t) {
        let n = e[0];
        super(`[shoji] non-serializable value on the wire: ${e.length} hard violation(s); first: ${n.kind} ${n.preview} at ${n.path}. ` + "The wire cannot carry this \u2014 it must become data (an Input/Event/RPC/Handle) before it can cross the seam.");
        this.name = "WireViolationError";
        this.violations = e;
        this.frameType = t;
      }
    };
  });
  async function* MEf(e, t, n) {
    let r = t.messages.filter(l => l.uuid !== e.messageUuid);
    let {
      messages: o
    } = await BRt({
      input: e.text,
      mode: "prompt",
      setToolJSX: () => {},
      context: {
        ...t.toolUseContext,
        abortController: n,
        messages: r,
        canUseTool: t.canUseTool,
        setMessages: () => {},
        applyMessageOp: () => {},
        onChangeAPIKey: () => {},
        options: {
          ...t.toolUseContext.options,
          ideInstallationStatus: null,
          theme: "dark"
        }
      },
      messages: r,
      querySource: t.querySource
    });
    let i = o.find(SS)?.compactMetadata.preservedMessages;
    let a = new Set(i?.allUuids ?? i?.uuids ?? []);
    for (let l of o) {
      if (!a.vZc(l.uuid)) {
        yield l;
      }
    }
    return {
      reason: "completed"
    };
  }
  function qfr({
    run: e,
    queryParams: t,
    commands: n = [],
    models: r = [],
    unavailableModels: o = [],
    agents: s = [],
    account: i = {},
    outputStyle: a,
    availableOutputStyles: l,
    mcpServers: c = () => [],
    mcpDelegate: u,
    excludeDynamicSections: d,
    settings: p = DEf(),
    authDelegate: m,
    mcpAuthDelegate: f,
    ambient: h,
    tools: g = [],
    skills: y = [],
    plugins: _ = [],
    pluginErrors: b = [],
    pluginWarnings: S = [],
    initialModel: E,
    initialPermissionMode: C,
    fastModeState: x,
    hostOwnsPermissionMode: A = false
  }) {
    let k = UEc({
      commands: typeof n === "function" ? n() : n,
      models: typeof r === "function" ? r() : r,
      unavailableModels: typeof o === "function" ? o() : o,
      agents: typeof s === "function" ? s() : s,
      account: i,
      outputStyle: a,
      availableOutputStyles: l
    });
    let I = new Hq();
    let O = 0;
    let M = null;
    let L = null;
    let P = null;
    let F = null;
    let H = null;
    let U = getSessionId();
    let N = m0p();
    if (N !== U && N !== "cli") {
      logForDebugging(`[shoji-engine] sdkEventQueue push key '${N}' \u2260 engine sessionId '${U}' \u2014 host ALS wiring likely incorrect; enqueued SdkEvents will not drain here`);
    }
    let W = ce => ({
      ...ce,
      session_id: U,
      uuid: "uuid" in ce && typeof ce.uuid === "string" ? ce.uuid : Hfr.randomUUID()
    });
    let j = ce => typeof ce === "function" ? ce() : ce;
    let z = () => {
      let ce = j(h);
      if (!ce) {
        return null;
      }
      let le = typeof n === "function" ? n() : n;
      let pe = typeof s === "function" ? s() : s;
      return NRt({
        ...ce,
        sessionId: U,
        tools: g,
        mcpClients: c().map(ve => ({
          name: ve.name,
          type: ve.status
        })),
        model: L ?? j(E) ?? "",
        permissionMode: P ?? j(C) ?? "default",
        commands: le,
        agents: pe.map(ve => ({
          agentType: ve.name
        })),
        skills: y,
        plugins: _,
        pluginErrors: b,
        pluginWarnings: S,
        fastModeState: j(x) ?? "off"
      });
    };
    let V = false;
    let K = false;
    let J = 0;
    let Q = null;
    let Z = false;
    let ne = u$(5000);
    let oe = [];
    let ee = false;
    let re = [];
    let se = false;
    let ae = ce => {
      if (oe.length >= 1000) {
        if (oe.shift(), !ee) {
          ee = true;
          Oe(Error("[shoji-engine] pendingDenialFrames buffer is full; dropping oldest permission_denied advisory frames"));
        }
      }
      oe.push(ce);
    };
    function* de() {
      while (oe.length > 0) {
        let ce = oe.shift();
        logForDebugging(`[shoji-engine] yield ${ce.type}/${ce.subtype}`);
        yield W(ce);
      }
    }
    function* be() {
      yield* de();
      for (let ce of Gfo(U)) {
        logForDebugging(`[shoji-engine] yield sdk-queue system/${ce.subtype}`);
        yield W(ce);
      }
    }
    function* fe() {
      while (re.length > 0) {
        yield re.shift();
      }
    }
    let me = () => {
      if (!se) {
        return false;
      }
      let ce = Q?.toolUseContext?.getAppState;
      return ce !== undefined && Uht(ce()).some(le => RQ(le) && kv(le));
    };
    async function* Te() {
      V = false;
      let ce = z();
      if (ce) {
        logForDebugging("[shoji-engine] yield system/init (first)");
        yield W(ce);
      }
      for await (let le of I) {
        if (V) {
          V = false;
          let Re = z();
          if (Re) {
            logForDebugging("[shoji-engine] yield system/init (re-emit)");
            yield W(Re);
          }
        }
        yield* be();
        let pe = Date.now();
        let ve = {
          origin: le.origin,
          parent_tool_use_id: le.parent_tool_use_id,
          priority: le.priority,
          shouldQuery: le.shouldQuery,
          timestamp: le.timestamp
        };
        let _e;
        try {
          _e = await t(le);
        } catch (Re) {
          Oe(Re);
          yield* be();
          let Ce = {
            type: "result",
            subtype: "error_during_execution",
            is_error: true,
            errors: [`queryParams builder failed: ${he(Re)}`],
            duration_ms: Date.now() - pe,
            duration_api_ms: getTotalAPIDuration(),
            num_turns: 0,
            stop_reason: null,
            total_cost_usd: getTotalCostUSD(),
            usage: fJo(),
            modelUsage: getModelUsage(),
            permission_denials: [],
            uuid: Hfr.randomUUID(),
            session_id: U,
            fast_mode_state: j(x),
            ...ve
          };
          if (me()) {
            re.push(Ce);
          } else {
            yield* fe();
            yield Ce;
          }
          continue;
        }
        O++;
        Q = _e;
        let xe = new AbortController();
        M = xe;
        let ke = _e.toolUseContext?.abortController?.signal;
        let Ie = () => xe.abort(ke?.reason);
        if (ke?.aborted) {
          xe.abort(ke.reason);
        } else {
          ke?.addEventListener("abort", Ie, {
            once: true
          });
        }
        logForDebugging(`[shoji-engine] turn ${O} start`);
        let Ue = [];
        let Ge = (Re, Ce, Fe) => {
          if (Ue.some(Xe => Xe.tool_use_id === Ce)) {
            return;
          }
          Ue.push({
            tool_name: trn(Re.name),
            tool_use_id: Ce,
            tool_input: Fe
          });
        };
        let Be = _e.canUseTool;
        let We = async (Re, Ce, Fe, Xe, He, Gt) => {
          let mt = await Be(Re, Ce, Fe, Xe, He, Gt);
          if (mt.behavior !== "allow") {
            Ge(Re, He, Ce);
          }
          if (mt.behavior === "deny" && isPreAskDeny(mt)) {
            ae({
              type: "system",
              subtype: "permission_denied",
              tool_name: Re.name,
              tool_use_id: He,
              agent_id: Fe.agentId,
              decision_reason_type: mt.decisionReason?.type,
              decision_reason: pJt(mt.decisionReason),
              message: mt.message
            });
          }
          return mt;
        };
        if (ne.size > 0 && _e.toolUseContext?.readFileState) {
          for (let [Re, Ce] of ne.entries()) {
            let Fe = _e.toolUseContext.readFileState.get(Re);
            if (!Fe || Ce.timestamp > Fe.timestamp) {
              _e.toolUseContext.readFileState.set(Re, Ce);
            }
          }
          ne.clear();
        }
        let Ze = _e.engineDeferredSlash ? MEf(_e.engineDeferredSlash, _e, xe) : e({
          ..._e,
          canUseTool: We,
          keepPartialMessageOnAbort: true,
          toolUseContext: {
            ..._e.toolUseContext,
            abortController: xe,
            onPermissionDenial: Ge,
            permissionLayers: L !== null || !A && P !== null || F !== null || H !== null ? [...(_e.toolUseContext?.permissionLayers ?? []), ...(L !== null ? [{
              kind: "model",
              mainLoopModel: L
            }] : []), ...(!A && P !== null ? [{
              kind: "permission_mode",
              mode: P
            }] : []), ...(F !== null ? [{
              kind: "max_thinking_tokens",
              maxThinkingTokens: F
            }] : []), ...(H !== null ? [{
              kind: "flag_settings",
              settings: H
            }] : [])] : _e.toolUseContext?.permissionLayers
          }
        });
        let Tt = null;
        let kt = _e.engineDeferredSlash ? 0 : 1;
        let Ye = null;
        let ht = [];
        let It;
        let Rt = "";
        let wt = false;
        let vt = null;
        let yt = "";
        let gt = false;
        let Ft = [];
        let on = new Set();
        let rn = null;
        let Sn;
        let jn;
        try {
          let Re = await Ze.next();
          while (!Re.done) {
            let Ce = Re.value;
            try {
              let Fe = mJo(Ce, "output");
              if (Fe.length > 0 && !gt) {
                gt = true;
                Et("shoji_engine", "wire_violation", {
                  frame_type: Ce.type,
                  violation_kind: Fe[0].kind
                });
                Oe(new $fr(Fe, Ce.type));
              }
            } catch (Fe) {
              if (!gt) {
                gt = true;
                Et("shoji_engine", "wire_violation", {
                  frame_type: Ce.type,
                  violation_kind: "walker_threw"
                });
                Oe(Fe);
              }
            }
            if (Ce.type === "user") {
              if (!_e.engineDeferredSlash) {
                kt++;
              }
              ht.push(Ce);
              Rt = "";
              wt = false;
              vt = null;
              yt = "";
            } else if (Ce.type === "tombstone") {
              {
                let Fe = Ce.message?.uuid;
                let Xe = Fe !== undefined ? ht.findLastIndex(He => He.uuid === Fe) : ht.length - 1;
                if (Xe >= 0) {
                  ht.splice(Xe, 1);
                }
              }
              {
                let Fe = Ce.message;
                if (Fe?.type === "assistant") {
                  let Xe = Fe.message.content;
                  let He = Array.isArray(Xe) ? Xe.flatMap(Gt => Gt.type === "tool_use" && Gt.name === "StructuredOutput" ? [Gt.id] : []) : [];
                  if (He.length > 0) {
                    for (let mt of He) {
                      on.add(mt);
                    }
                    let Gt = mt => mt.toolUseID === undefined || He.includes(mt.toolUseID);
                    Ft = Ft.filter(mt => !Gt(mt));
                  }
                }
              }
              Rt = "";
              wt = false;
              vt = null;
              yt = "";
            } else if (Ce.type === "assistant") {
              if (rn ??= Date.now(), ht.push(Ce), Ce.message.stop_reason != null) {
                Ye = Ce.message.stop_reason;
              }
              wt = Ce.isApiErrorMessage === true;
              vt = Ce.apiErrorStatus ?? null;
              let Fe = _Gd(Ce.message.content);
              let Xe = Fe?.type === "text" ? Fe.text : "";
              if (wt) {
                yt = Xe;
                Rt = "";
              } else {
                Rt = bDe.vZc(Xe) ? "" : Xe;
              }
            } else if (Ce.type === "stream_event" && Ce.event.type === "message_delta" && Ce.event.delta.stop_reason != null) {
              Ye = Ce.event.delta.stop_reason;
            } else if (Ce.type === "attachment" && Ce.attachment.type === "structured_output") {
              if (!(Ce.attachment.toolUseID !== undefined ? on.vZc(Ce.attachment.toolUseID) : on.size > 0)) {
                Ft = [...Ft, {
                  toolUseID: Ce.attachment.toolUseID,
                  data: Ce.attachment.data
                }];
              }
            } else if (Ce.type === "attachment" && Ce.attachment.type === "max_turns_reached") {
              It = {
                turnCount: Ce.attachment.turnCount,
                maxTurns: Ce.attachment.maxTurns
              };
            } else if (Ce.type === "attachment" && Ce.attachment.type === "hook_deferred_tool") {
              Sn = {
                id: Ce.attachment.toolUseID,
                name: Ce.attachment.toolName,
                input: Ce.attachment.toolInput
              };
              Ye = "tool_deferred";
            }
            if (oe.length > 0) {
              yield* de();
            }
            if (logForDebugging(`[shoji-engine] yield ${Ce.type}/${"subtype" in Ce ? Ce.subtype : "-"}`), Ce.type === "notification") {
              let Fe = Ce.notification;
              yield W({
                type: "system",
                subtype: "notification",
                key: Fe.key,
                text: Fe.text,
                priority: Fe.priority,
                ...(Fe.color !== undefined && {
                  color: Fe.color
                }),
                ...(Fe.timeoutMs !== undefined && {
                  timeout_ms: Fe.timeoutMs
                })
              });
            } else if (Ce.type === "sdk_status") {
              yield W({
                type: "system",
                subtype: "status",
                status: Ce.status,
                ...(Ce.metadata?.compactResult !== undefined && {
                  compact_result: Ce.metadata.compactResult
                }),
                ...(Ce.metadata?.compactError !== undefined && {
                  compact_error: Ce.metadata.compactError
                })
              });
            } else if (Ce.type === "stream_request_start") {
              yield W({
                type: "system",
                subtype: "status",
                status: "requesting"
              });
            } else if (Ce.type === "system" && Ce.subtype === "compact_boundary") {
              yield W({
                type: "system",
                subtype: "compact_boundary",
                uuid: Ce.uuid,
                compact_metadata: tCt(Ce.compactMetadata),
                ...(Ce.logicalParentUuid !== undefined && {
                  logical_parent_uuid: Ce.logicalParentUuid
                })
              });
            } else if (Ce.type === "system" && Ce.subtype === "model_refusal_fallback") {
              yield W({
                type: "system",
                subtype: "model_refusal_fallback",
                uuid: Ce.uuid,
                trigger: Ce.trigger,
                direction: Ce.direction,
                original_model: Ce.originalModel,
                fallback_model: Ce.fallbackModel,
                request_id: Ce.requestId,
                api_refusal_category: Ce.apiRefusalCategory ?? null,
                api_refusal_explanation: Ce.apiRefusalExplanation ?? null,
                ...(Ce.retractedMessageUuids !== undefined && {
                  retracted_message_uuids: Ce.retractedMessageUuids
                }),
                refused_user_message_uuid: Ce.refusedUserMessageUuid ?? null,
                content: Ce.content
              });
            } else if (Ce.type === "system" && Ce.subtype === "model_refusal_no_fallback") {
              yield W({
                type: "system",
                subtype: "model_refusal_no_fallback",
                uuid: Ce.uuid,
                original_model: Ce.originalModel,
                request_id: Ce.requestId,
                api_refusal_category: Ce.apiRefusalCategory ?? null,
                api_refusal_explanation: Ce.apiRefusalExplanation ?? null,
                refused_user_message_uuid: Ce.refusedUserMessageUuid ?? null,
                content: Ce.content
              });
            } else if (Ce.type === "system" && Ce.subtype === "model_fallback") {
              yield W({
                type: "system",
                subtype: "model_fallback",
                uuid: Ce.uuid,
                trigger: Ce.trigger,
                original_model: Ce.originalModel,
                fallback_model: Ce.fallbackModel,
                content: Ce.content
              });
            } else if (Ce.type === "system" && Ce.subtype === "read_divider") {
              ;
            } else {
              yield W(Ce);
            }
            if (Ce.type === "system" && Ce.subtype === "api_error") {
              yield W({
                type: "system",
                subtype: "api_retry",
                attempt: Ce.retryAttempt,
                max_retries: Ce.maxRetries,
                retry_delay_ms: Ce.retryInMs,
                error_status: Ce.error.status ?? null,
                error: H$n(Ce.error)
              });
            }
            if (Ce.type === "attachment" && Ce.attachment.type === "relevant_memories") {
              let Fe = Ofr(Ce.attachment.memories);
              if (Fe) {
                let {
                  uuid: Xe,
                  session_id: He,
                  ...Gt
                } = Fe;
                yield W(Gt);
              }
            }
            if (Ce.type === "stream_event") {
              if (Ce.event.type === "content_block_start") {
                J = 0;
              } else if (Ce.event.type === "content_block_delta") {
                let {
                  delta: Fe
                } = Ce.event;
                if (Fe.type === "thinking_delta") {
                  let Xe;
                  if ("estimated_tokens" in Fe && typeof Fe.estimated_tokens === "number") {
                    Xe = Fe.estimated_tokens;
                  } else if (typeof Fe.thinking === "string" && Fe.thinking.length > 0) {
                    Xe = vnn(Fe.thinking);
                  }
                  if (Xe !== undefined) {
                    J += Xe;
                    yield W({
                      type: "system",
                      subtype: "thinking_tokens",
                      estimated_tokens: J,
                      estimated_tokens_delta: Xe
                    });
                    logForDebugging("[shoji-engine] yield-twin system/thinking_tokens");
                  }
                } else if (Fe.type === "signature_delta" && J > 0) {
                  let Xe = Math.ceil(L9e(Fe.signature.length) / 4);
                  if (Xe > J) {
                    let He = Xe - J;
                    J = Xe;
                    yield W({
                      type: "system",
                      subtype: "thinking_tokens",
                      estimated_tokens: J,
                      estimated_tokens_delta: He
                    });
                    logForDebugging("[shoji-engine] yield-twin system/thinking_tokens");
                  }
                }
              }
            }
            if (Ce.type === "system" && Ce.subtype === "local_command" && typeof Ce.content === "string" && (Ce.content.includes(`<${"local-command-stdout"}>`) || Ce.content.includes(`<${"local-command-stderr"}>`))) {
              yield W(Een(Ce.content, Ce.uuid));
              logForDebugging("[shoji-engine] yield-twin assistant (local_command)");
            }
            if (Ce.type === "progress" && (Ce.data.type === "bash_progress" || Ce.data.type === "powershell_progress")) {
              yield W({
                type: "tool_progress",
                tool_use_id: Ce.toolUseID,
                tool_name: Ce.data.type === "bash_progress" ? "Bash" : "PowerShell",
                parent_tool_use_id: Ce.parentToolUseID || null,
                elapsed_time_seconds: Ce.data.elapsedTimeSeconds,
                task_id: Ce.data.taskId
              });
              logForDebugging("[shoji-engine] yield-twin tool_progress");
            }
            if (Ce.type === "progress" && Ce.data.type === "repl_tool_call") {
              yield W({
                type: "tool_progress",
                tool_use_id: Ce.toolUseID,
                tool_name: "REPL",
                parent_tool_use_id: Ce.parentToolUseID || null,
                elapsed_time_seconds: 0,
                repl_call: {
                  inner_tool_name: Ce.data.toolName,
                  inner_tool_input: Ce.data.toolInput,
                  inner_tool_use_id: Ce.data.toolUseId,
                  phase: Ce.data.phase
                }
              });
              logForDebugging("[shoji-engine] yield-twin tool_progress repl_call");
            }
            for (let Fe of Gfo(U)) {
              logForDebugging(`[shoji-engine] yield sdk-queue system/${Fe.subtype}`);
              yield W(Fe);
            }
            Re = await Ze.next();
          }
          if (!gt) {
            Pe("shoji_engine");
          }
          jn = Re.value ? Re.value.reason : undefined;
        } catch (Re) {
          Tt = he(Re);
        } finally {
          await Ze.return(undefined).catch(() => {});
          ke?.removeEventListener("abort", Ie);
          let Re = fJo();
          logForDebugging(`[shoji-engine] turn ${O} end (turns=${kt} usage in=${Re.input_tokens} out=${Re.output_tokens} cost=$${getTotalCostUSD().toFixed(4)} api=${getTotalAPIDuration()}ms stop=${Ye} resultLen=${Rt.length})`);
        }
        let Xr = ht.at(-1) ?? {
          type: "user",
          message: le.message
        };
        let co = Tt !== null ? [Tt] : ern(jn) && Sn === undefined && !VXn(Xr, Ye) ? [`[ede_diagnostic] turn aborted (${jn}) stop_reason=${Ye}`] : null;
        if (Rt === "") {
          let Re = Ft.at(-1)?.data;
          if (Re !== undefined) {
            Rt = JSON.stringify(Re);
          }
        }
        let Yt = {
          duration_ms: Date.now() - pe,
          duration_api_ms: getTotalAPIDuration(),
          num_turns: kt,
          stop_reason: Ye,
          total_cost_usd: getTotalCostUSD(),
          usage: fJo(),
          modelUsage: getModelUsage(),
          permission_denials: Ue,
          uuid: Hfr.randomUUID(),
          session_id: U,
          terminal_reason: jn,
          fast_mode_state: j(x),
          ...ve
        };
        let Ee = Tt === null && Sn === undefined && It ? {
          type: "result",
          subtype: "error_max_turns",
          is_error: true,
          errors: [`Reached maximum number of turns (${It.maxTurns})`],
          ...Yt,
          num_turns: It.turnCount
        } : co !== null ? {
          type: "result",
          subtype: "error_during_execution",
          is_error: true,
          errors: co,
          ...Yt
        } : {
          type: "result",
          subtype: "success",
          is_error: wt,
          api_error_status: vt,
          result: wt ? yt : Rt,
          structured_output: Ft.at(-1)?.data,
          ttft_ms: !wt && rn !== null ? Math.max(0, rn - pe) : undefined,
          deferred_tool_use: Sn,
          ...Yt
        };
        if (yield* be(), me()) {
          re.push(Ee);
        } else {
          yield* fe();
          yield Ee;
        }
      }
      while (re.length > 0 && !M?.signal.aborted && me()) {
        yield* be();
        await sleep(100);
      }
      if (re.length > 0 && M?.signal.aborted && Q?.toolUseContext?.taskRegistry) {
        let {
          taskRegistry: le,
          setAppState: pe
        } = Q.toolUseContext;
        aJt({
          taskRegistry: le,
          setAppState: pe
        });
      }
      yield* be();
      yield* fe();
    }
    function ue(ce) {
      try {
        let le = mJo(ce, "input");
        if (le.length > 0 && !K) {
          K = true;
          Et("shoji_engine", "wire_violation", {
            frame_type: ce.type,
            violation_kind: le[0].kind
          });
          Oe(new $fr(le, ce.type));
        }
      } catch (le) {
        if (!K) {
          K = true;
          Et("shoji_engine", "wire_violation", {
            frame_type: ce.type,
            violation_kind: "walker_threw"
          });
          Oe(le);
        }
      }
      switch (ce.type) {
        case "turn":
          I.enqueue(ce);
          break;
        case "interrupt":
          M?.abort(ce.reason !== undefined ? new DOMException(ce.reason, "AbortError") : undefined);
          break;
        case "set_model":
          L = ce.model ?? null;
          V = true;
          logForDebugging(`[shoji-engine] send set_model model=${ce.model}`);
          break;
        case "set_permission_mode":
          {
            if (ce.mode === "bypassPermissions" && isBypassPermissionsModeDisabled()) {
              logForDebugging("[shoji-engine] set_permission_mode:bypassPermissions rejected \u2014 disabled by settings");
              break;
            }
            if (ce.mode === "auto" && !isAutoModeGateEnabled()) {
              logForDebugging("[shoji-engine] set_permission_mode:auto rejected \u2014 gate not enabled");
              break;
            }
            P = ce.mode;
            V = true;
            break;
          }
        case "set_max_thinking_tokens":
          F = ce.max_thinking_tokens;
          logForDebugging(`[shoji-engine] send set_max_thinking_tokens max=${ce.max_thinking_tokens}`);
          break;
        case "apply_flag_settings":
          H = {
            ...(H ?? {}),
            ...ce.settings
          };
          logForDebugging(`[shoji-engine] send apply_flag_settings keys=${Object.keys(ce.settings).join(",")}`);
          break;
        case "seed_read_state":
          ne.set(ce.path, ce.seed);
          logForDebugging(`[shoji-engine] send seed_read_state path=${ce.path}`);
          break;
      }
    }
    return Object.assign(Te(), {
      interrupt: async ce => ue({
        type: "interrupt",
        reason: ce
      }),
      setModel: async ce => ue({
        type: "set_model",
        model: ce
      }),
      setPermissionMode: async ce => ue({
        type: "set_permission_mode",
        mode: ce
      }),
      setMaxThinkingTokens: async ce => ue({
        type: "set_max_thinking_tokens",
        max_thinking_tokens: ce
      }),
      applyFlagSettings: ce => (ue({
        type: "apply_flag_settings",
        settings: ce
      }), Promise.resolve()),
      seedReadState: async (ce, le) => {
        try {
          let pe = us(ce);
          let ve = Math.floor((await jfr.stat(pe)).mtimeMs);
          if (ve <= le) {
            let _e = await jfr.readFile(pe, "utf-8");
            let xe = (_e.charCodeAt(0) === 65279 ? _e.slice(1) : _e).replaceAll(`\r
`, `
`);
            ue({
              type: "seed_read_state",
              path: pe,
              seed: {
                content: xe,
                timestamp: ve,
                offset: undefined,
                limit: undefined
              }
            });
          }
        } catch {}
      },
      turnCount: () => O,
      initializationResult: () => Promise.resolve(k),
      accountInfo: () => Promise.resolve(k.account),
      claudeAuthenticate: async ce => {
        if (!m) {
          throw Error("claudeAuthenticate: no authDelegate wired");
        }
        return m.authenticate(ce);
      },
      claudeOAuthCallback: async (ce, le) => {
        if (!m) {
          throw Error("claudeOAuthCallback: no authDelegate wired");
        }
        return m.oauthCallback(ce, le);
      },
      claudeOAuthWaitForCompletion: async () => {
        if (!m) {
          throw Error("claudeOAuthWaitForCompletion: no authDelegate wired");
        }
        return m.oauthWaitForCompletion();
      },
      supportedModels: () => Promise.resolve(typeof r === "function" ? r() : k.models),
      supportedCommands: () => Promise.resolve(typeof n === "function" ? n() : k.commands),
      supportedAgents: () => Promise.resolve(typeof s === "function" ? s() : k.agents),
      mcpServerStatus: () => Promise.resolve(c()),
      reconnectMcpServer: async ce => {
        if (!u) {
          throw Error(`reconnectMcpServer: no mcpDelegate wired (server: ${ce})`);
        }
        await u.reconnect(ce);
      },
      toggleMcpServer: async (ce, le) => {
        if (!u) {
          throw Error(`toggleMcpServer: no mcpDelegate wired (server: ${ce})`);
        }
        await u.toggle(ce, le);
      },
      setMcpServers: async ce => {
        if (!u) {
          throw Error(`setMcpServers: no mcpDelegate wired (${Object.keys(ce).length} server(s))`);
        }
        return u.setServers(ce);
      },
      reloadPlugins: async () => {
        if (!u) {
          throw Error("reloadPlugins: no mcpDelegate wired");
        }
        return u.reloadPlugins();
      },
      mcpAuthenticate: async (ce, le) => {
        if (!f) {
          throw Error(`mcpAuthenticate: no mcpAuthDelegate wired (server: ${ce})`);
        }
        return f.authenticate(ce, le);
      },
      mcpClearAuth: async ce => {
        if (!f) {
          throw Error(`mcpClearAuth: no mcpAuthDelegate wired (server: ${ce})`);
        }
        return f.clearAuth(ce);
      },
      mcpSubmitOAuthCallbackUrl: async (ce, le) => {
        if (!f) {
          throw Error(`mcpSubmitOAuthCallbackUrl: no mcpAuthDelegate wired (server: ${ce})`);
        }
        return f.submitOAuthCallbackUrl(ce, le);
      },
      getContextUsage: async () => {
        if (Q === null) {
          throw Error("getContextUsage: no turn received yet");
        }
        let {
          messages: ce,
          toolUseContext: le
        } = Q;
        return await collectContextData({
          messages: ce,
          getAppState: le.getAppState,
          getMcp: le.getMcp,
          options: {
            mainLoopModel: le.options.mainLoopModel,
            tools: le.options.tools,
            agentDefinitions: le.options.agentDefinitions,
            customSystemPrompt: le.options.customSystemPrompt,
            appendSystemPrompt: le.options.appendSystemPrompt,
            excludeDynamicSections: d
          }
        });
      },
      stopTask: async ce => {
        if (Q === null) {
          throw Error("stopTask: no turn received yet");
        }
        let {
          taskRegistry: le,
          setAppState: pe,
          getAppState: ve
        } = Q.toolUseContext;
        await iEt(ce, {
          taskRegistry: le,
          setAppState: pe,
          getAppState: ve,
          source: "user"
        });
      },
      backgroundTasks: async ce => {
        if (Q === null) {
          return !ce;
        }
        let {
          taskRegistry: le
        } = Q.toolUseContext;
        if (ce) {
          return Djn(ce, le);
        }
        QDe(le);
        return true;
      },
      getSettings: () => Promise.resolve(p),
      generateSessionTitle: async (ce, le) => {
        if (le?.persist) {
          Z = true;
        }
        let pe = (M && !M.signal.aborted ? M : new AbortController()).signal;
        let ve = await Sie(ce, pe);
        if (ve && le?.persist) {
          try {
            saveAiGeneratedTitle(getSessionId(), ve);
          } catch (_e) {
            if (Io(_e)) {
              logForDebugging(`saveAiGeneratedTitle failed: ${_e}`);
            } else {
              Oe(_e);
            }
          }
        }
        return ve;
      },
      messageRated: async ({
        messageUuid: ce,
        sentiment: le,
        surface: pe = "tool_use",
        cleared: ve = false
      }) => {
        if (isPolicyAllowed("allow_product_feedback")) {
          logEvent("tengu_message_rated", {
            message_uuid: br(ce),
            sentiment: le,
            surface: pe,
            cleared: ve
          });
        }
      },
      askSideQuestion: async ce => {
        let {
          getLastCacheSafeParams: le
        } = await Promise.resolve().then(() => (CO(), g2o));
        let pe = le();
        if (pe === null) {
          return null;
        }
        let {
          runSideQuestion: ve
        } = await Promise.resolve().then(() => (tQt(), h$l));
        let {
          createAbortController: _e
        } = await Promise.resolve().then(() => (Kp(), hdo));
        let xe = await ve({
          question: ce,
          cacheSafeParams: {
            ...pe,
            toolUseContext: {
              ...pe.toolUseContext,
              abortController: _e()
            }
          },
          threadHistory: false
        });
        return xe.response === null ? null : {
          response: xe.response,
          synthetic: xe.synthetic
        };
      },
      rewindFiles: async (ce, le) => {
        if (Q === null) {
          return {
            canRewind: false,
            error: "rewindFiles: no turn received yet"
          };
        }
        let {
          fileHistoryEnabled: pe,
          fileHistoryCanRestore: ve,
          fileHistoryGetDiffStats: _e,
          fileHistoryRewind: xe
        } = await Promise.resolve().then(() => (Jq(), EAa));
        let ke = Q.toolUseContext.getAppState();
        if (!pe()) {
          return {
            canRewind: false,
            error: "File rewinding is not enabled."
          };
        }
        if (!ve(ke.fileHistory, ce)) {
          return {
            canRewind: false,
            error: "No file checkpoint found for this message."
          };
        }
        if (le?.dryRun ?? false) {
          let Ie = await _e(ke.fileHistory, ce);
          return {
            canRewind: true,
            filesChanged: Ie?.filesChanged,
            insertions: Ie?.insertions,
            deletions: Ie?.deletions
          };
        }
        try {
          await xe(() => ke.fileHistory, ce);
        } catch (Ie) {
          return {
            canRewind: false,
            error: `Failed to rewind: ${he(Ie)}`
          };
        }
        return {
          canRewind: true
        };
      },
      submitFeedback: async (ce, le) => {
        let pe = ssr();
        if (pe) {
          return {
            feedback_id: null,
            unavailable_reason: pe
          };
        }
        if (Q === null) {
          return {
            feedback_id: null,
            unavailable_reason: "no turn received yet"
          };
        }
        let ve = await fvt({
          messages: Q.messages,
          description: ce,
          surface: le?.surface ?? "sdk"
        });
        return ve.success ? {
          feedback_id: ve.feedbackId
        } : {
          feedback_id: null,
          is_zdr_org: ve.isZdrOrg,
          failure_reason: ve.failureReason,
          status_code: ve.statusCode
        };
      },
      streamInput: async ce => {
        try {
          for await (let le of ce) {
            let {
              type: pe,
              ...ve
            } = le;
            ue({
              type: "turn",
              ...ve
            });
          }
        } finally {
          se = true;
          I.done();
        }
      },
      readFile: async (ce, le) => {
        if (Q === null) {
          return null;
        }
        try {
          return await readFileForRemote(ce, le?.maxBytes, Q.toolUseContext.getAppState().toolPermissionContext, le?.encoding);
        } catch {
          return null;
        }
      },
      launchUltrareview: async (ce, le) => {
        if (Q === null) {
          return {
            status: "error",
            message: "launchUltrareview: no turn received yet"
          };
        }
        let {
          runUltrareviewHeadless: pe
        } = await Promise.resolve().then(() => (Jwt(), xQl));
        let {
          createAbortController: ve
        } = await Promise.resolve().then(() => (Kp(), hdo));
        let {
          taskRegistry: _e
        } = Q.toolUseContext;
        return await pe(ce, {
          confirm: le?.confirm ?? false,
          context: {
            abortController: ve(),
            taskRegistry: _e
          }
        });
      },
      close: () => {
        se = true;
        I.done();
      }
    });
  }
  function fJo() {
    let e = Object.values(getModelUsage());
    let t = n => e.reduce((r, o) => r + n(o), 0);
    return {
      ...Hb,
      input_tokens: t(n => n.inputTokens),
      output_tokens: t(n => n.outputTokens),
      cache_read_input_tokens: t(n => n.cacheReadInputTokens),
      cache_creation_input_tokens: t(n => n.cacheCreationInputTokens),
      server_tool_use: {
        ...Hb.server_tool_use,
        web_search_requests: t(n => n.webSearchRequests)
      }
    };
  }
  function The() {
    return st(process.env.CLAUDE_CODE_SHOJI_ENGINE) || getFeatureValue_CACHED_MAY_BE_STALE("tengu_shoji_engine", false);
  }
  var Hfr;
  var jfr;
  var DEf = () => ({
    effective: {},
    sources: []
  });
  var Wfr = __lazy(() => {
    at();
    zQt();
    np();
    C$();
    Pfr();
    ln();
    $n();
    Ot();
    B_();
    JLe();
    vO();
    W7e();
    Kc();
    zX();
    e7e();
    ZC();
    O1();
    je();
    gn();
    dt();
    qI();
    Rn();
    VUe();
    cJo();
    nrn();
    ro();
    ku();
    Bbe();
    S_();
    Ufr();
    mSt();
    arn();
    fa();
    UYe();
    hDe();
    U$();
    svc();
    Hfr = require("crypto");
    jfr = require("fs/promises");
  });
  function cvc(e) {
    let t = avc.c(3);
    let {
      getFpsMetrics: n,
      children: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      o = dvc.jsx(lvc.Provider, {
        value: n,
        children: r
      });
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function uvc() {
    return Gfr.useContext(lvc);
  }
  var avc;
  var Gfr;
  var dvc;
  var lvc;
  var hJo = __lazy(() => {
    avc = __toESM(pt(), 1);
    Gfr = __toESM(ot(), 1);
    dvc = __toESM(ie(), 1);
    lvc = Gfr.createContext(undefined);
  });
  function gJo(e, t) {
    let n = t / 100 * (e.length - 1);
    let r = Math.floor(n);
    let o = Math.ceil(n);
    if (r === o) {
      return e[r];
    }
    return e[r] + (e[o] - e[r]) * (n - r);
  }
  function yJo() {
    let e = new Map();
    let t = new Map();
    let n = new Map();
    return {
      increment(r, o = 1) {
        e.set(r, (e.get(r) ?? 0) + o);
      },
      set(r, o) {
        e.set(r, o);
      },
      observe(r, o) {
        let s = t.get(r);
        if (!s) {
          s = {
            reservoir: [],
            count: 0,
            sum: 0,
            min: o,
            max: o
          };
          t.set(r, s);
        }
        if (s.count++, s.sum += o, o < s.min) {
          s.min = o;
        }
        if (o > s.max) {
          s.max = o;
        }
        if (s.reservoir.length < 1024) {
          s.reservoir.push(o);
        } else {
          let i = Math.floor(Math.random() * s.count);
          if (i < 1024) {
            s.reservoir[i] = o;
          }
        }
      },
      add(r, o) {
        let s = n.get(r);
        if (!s) {
          s = new Set();
          n.set(r, s);
        }
        s.add(o);
      },
      getAll() {
        let r = Object.fromEntries(e);
        for (let [o, s] of t) {
          if (s.count === 0) {
            continue;
          }
          r[`${o}_count`] = s.count;
          r[`${o}_min`] = s.min;
          r[`${o}_max`] = s.max;
          r[`${o}_avg`] = s.sum / s.count;
          let i = [...s.reservoir].sort((a, l) => a - l);
          r[`${o}_p50`] = gJo(i, 50);
          r[`${o}_p95`] = gJo(i, 95);
          r[`${o}_p99`] = gJo(i, 99);
        }
        for (let [o, s] of n) {
          r[o] = s.size;
        }
        return r;
      }
    };
  }
  function fvc(e) {
    let t = mvc.c(7);
    let {
      store: n,
      children: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = yJo();
      t[0] = o;
    } else {
      o = t[0];
    }
    let i = n ?? o;
    let a;
    let l;
    if (t[1] !== i) {
      a = () => {
        let u = () => {
          let d = i.getAll();
          if (Object.keys(d).length > 0) {
            saveCurrentProjectConfig(p => ({
              ...p,
              lastSessionMetrics: d
            }));
          }
        };
        process.on("exit", u);
        return () => {
          process.off("exit", u);
        };
      };
      l = [i];
      t[1] = i;
      t[2] = a;
      t[3] = l;
    } else {
      a = t[2];
      l = t[3];
    }
    lrn.useEffect(a, l);
    let c;
    if (t[4] !== r || t[5] !== i) {
      c = hvc.jsx(NEf.Provider, {
        value: i,
        children: r
      });
      t[4] = r;
      t[5] = i;
      t[6] = c;
    } else {
      c = t[6];
    }
    return c;
  }
  var mvc;
  var lrn;
  var hvc;
  var NEf;
  var _Jo = __lazy(() => {
    mvc = __toESM(pt(), 1);
    lrn = __toESM(ot(), 1);
    hvc = __toESM(ie(), 1);
    NEf = lrn.createContext(null);
  });
  var bJo = {};
  __export(bJo, {
    App: () => App_export
  });
  function App_export(e) {
    let t = gvc.c(11);
    let {
      getFpsMetrics: n,
      stats: r,
      initialState: o,
      children: s
    } = e;
    let i;
    if (t[0] !== s) {
      i = LBe.jsx(sjt, {
        children: LBe.jsx(Atc, {
          children: LBe.jsx(gQi, {
            children: LBe.jsx(Z4l, {
              children: s
            })
          })
        })
      });
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== o || t[3] !== i) {
      a = LBe.jsx(AppStateProvider, {
        initialState: o,
        onChangeAppState: HCe,
        children: i
      });
      t[2] = o;
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== r || t[6] !== a) {
      l = LBe.jsx(fvc, {
        store: r,
        children: a
      });
      t[5] = r;
      t[6] = a;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== n || t[9] !== l) {
      c = LBe.jsx(cvc, {
        getFpsMetrics: n,
        children: l
      });
      t[8] = n;
      t[9] = l;
      t[10] = c;
    } else {
      c = t[10];
    }
    return c;
  }
  var gvc;
  var LBe;
  var SJo = __lazy(() => {
    Aen();
    hJo();
    ELn();
    Nd();
    _Jo();
    _3();
    xRt();
    Air();
    gvc = __toESM(pt(), 1);
    LBe = __toESM(ie(), 1);
  });
  class yvc {
    pending = null;
    cancelScheduledFlush = null;
    scheduleTimeout;
    onFlush;
    flushIntervalMs;
    boundFlush;
    constructor({
      scheduleTimeout: e,
      onFlush: t,
      flushIntervalMs: n
    }) {
      this.scheduleTimeout = e;
      this.onFlush = t;
      this.flushIntervalMs = n;
      this.boundFlush = this.flush.bind(this);
    }
    apply(e) {
      let t = e(this.pending);
      if (t === null) {
        this.clear();
        return;
      }
      if (this.pending = t, this.cancelScheduledFlush === null) {
        this.cancelScheduledFlush = this.scheduleTimeout(this.boundFlush, this.flushIntervalMs);
      }
    }
    clear() {
      this.pending = null;
      this.dispose();
      this.onFlush(null);
    }
    peek() {
      return this.pending;
    }
    dispose() {
      if (this.cancelScheduledFlush !== null) {
        this.cancelScheduledFlush();
        this.cancelScheduledFlush = null;
      }
    }
    flush() {
      this.cancelScheduledFlush = null;
      this.onFlush(this.pending);
    }
  }
  function _vc({
    scheduleTimeout: e,
    onFlush: t,
    flushIntervalMs: n = 100
  }) {
    return new yvc({
      scheduleTimeout: e,
      onFlush: t,
      flushIntervalMs: n
    });
  }
  function Svc(e, t, n, r = logEvent) {
    if (!e.current) {
      return;
    }
    e.current = false;
    r(t, n());
  }
  async function FEf(e) {
    let {
      signal: t,
      executeCommand: n,
      getCommandLength: r,
      pendingResultLogRef: o,
      onResult: s,
      logFn: i = logEvent
    } = e;
    let a = r();
    try {
      let l = await n();
      if (t.aborted) {
        return;
      }
      if (s(l), l) {
        Svc(o, "tengu_status_line_result", () => {
          let c = l.split(`
`);
          let u = 0;
          for (let d of c) {
            let p = an(d);
            if (p > u) {
              u = p;
            }
          }
          return {
            char_length: l.length,
            visual_width: u,
            line_count: c.length,
            command_length: a
          };
        }, i);
      }
    } catch {}
  }
  function Tvc(e) {
    return V7e(e?.statusLine) !== undefined;
  }
  function UEf(e, t) {
    let n = eIn(e, t);
    return {
      total_input_tokens: e ? e.input_tokens + e.cache_creation_input_tokens + e.cache_read_input_tokens : 0,
      total_output_tokens: e?.output_tokens ?? 0,
      context_window_size: t,
      current_usage: e,
      used_percentage: n.used,
      remaining_percentage: n.remaining
    };
  }
  function BEf(e, t, n, r, o, s, i, a, l, c, u, d, p, m) {
    let f = getMainThreadAgentType();
    let h = getCurrentWorktreeSession();
    let g = getRuntimeMainLoopModel({
      permissionMode: e,
      mainLoopModel: i,
      exceeds200kTokens: t
    });
    let y = r?.outputStyle || "default";
    let _ = ept(o);
    let b = iT(g, getSdkBetas());
    let S = getSessionId();
    let E = getCurrentSessionTitle(S) ?? getCurrentSessionAiTitle(S);
    let C = $9e();
    let x = {
      ...(C.five_hour && {
        five_hour: {
          used_percentage: C.five_hour.utilization * 100,
          resets_at: C.five_hour.resets_at
        }
      }),
      ...(C.seven_day && {
        seven_day: {
          used_percentage: C.seven_day.utilization * 100,
          resets_at: C.seven_day.resets_at
        }
      })
    };
    return {
      ...createBaseHookInput(),
      cwd: d,
      ...(E && {
        session_name: E
      }),
      model: {
        id: g,
        display_name: renderModelName(g)
      },
      workspace: {
        current_dir: d,
        project_dir: getOriginalCwd(),
        added_dirs: s,
        ...(a && {
          git_worktree: a
        }),
        ...(l && {
          repo: l
        })
      },
      version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      output_style: {
        name: y
      },
      cost: {
        total_cost_usd: getTotalCostUSD(),
        total_duration_ms: getTotalDuration(),
        total_api_duration_ms: getTotalAPIDuration(),
        total_lines_added: getTotalLinesAdded(),
        total_lines_removed: getTotalLinesRemoved()
      },
      context_window: UEf(_, b),
      exceeds_200k_tokens: t,
      fast_mode: n,
      ...(sx(g) && {
        effort: {
          level: r1(g, p)
        }
      }),
      thinking: {
        enabled: m !== false
      },
      ...((x.five_hour || x.seven_day) && {
        rate_limits: x
      }),
      ...(mL() && {
        vim: {
          mode: u ?? "INSERT"
        }
      }),
      ...(f && {
        agent: {
          name: f
        }
      }),
      ...(Ul() !== null && {
        remote: {
          session_id: getSessionId()
        }
      }),
      ...(c && {
        pr: {
          number: c.number,
          url: c.url,
          ...(c.reviewState && {
            review_state: c.reviewState
          }),
          ...(c.kind && {
            kind: c.kind
          })
        }
      }),
      ...(h && {
        worktree: {
          name: h.worktreeName,
          path: h.worktreePath,
          branch: h.worktreeBranch,
          original_cwd: h.originalCwd,
          original_branch: h.originalBranch
        }
      })
    };
  }
  function TJo(e) {
    return Yk(e)?.uuid ?? null;
  }
  function $Ef({
    messagesRef: e,
    lastAssistantMessageId: t,
    tokenUsage: n,
    vimMode: r
  }) {
    let o = DE.useRef(undefined);
    let s = bt(V => V.toolPermissionContext.mode);
    let i = bt(V => V.toolPermissionContext.additionalWorkingDirectories);
    let a = bt(V => V.statusLineText);
    let l = Lo();
    let c = K_();
    let u = V7e(c?.statusLine);
    let d = dR();
    let p = bt(V => V.fastMode ?? false);
    let m = bt(V => V.effortValue);
    let f = bt(V => V.thinkingEnabled);
    let h = bt(V => V.prStatus);
    let g = DE.useRef(c);
    g.current = c;
    let y = DE.useRef(u);
    y.current = u;
    let _ = DE.useRef(r);
    _.current = r;
    let b = DE.useRef(s);
    b.current = s;
    let S = DE.useRef(i);
    S.current = i;
    let E = DE.useRef(d);
    E.current = d;
    let C = DE.useRef(p);
    C.current = p;
    let x = DE.useRef(m);
    x.current = m;
    let A = DE.useRef(f);
    A.current = f;
    let k = DE.useRef(h);
    k.current = h;
    let I = DE.useRef({
      messageId: null,
      tokenUsage: n,
      exceeds200kTokens: false,
      permissionMode: s,
      vimMode: r,
      mainLoopModel: d,
      fastMode: p,
      effortValue: m,
      thinkingEnabled: f,
      prStatus: h
    });
    let O = DE.useRef(true);
    let M = DE.useRef(true);
    let L = DE.useRef(true);
    let P = DE.useCallback(async () => {
      o.current?.abort();
      let V = new AbortController();
      o.current = V;
      let K = kg(e.current);
      let J = O.current;
      O.current = false;
      let Q = I.current.exceeds200kTokens;
      let Z = TJo(K);
      if (Z !== I.current.messageId) {
        Q = a$n(K);
        I.current.messageId = Z;
        I.current.exceeds200kTokens = Q;
      }
      let ne = Nt();
      let [oe, ee] = await Promise.all([getGitWorktreeName(ne), va() ? Promise.resolve(null) : getRemoteUrl()]);
      let re = ee ? parseGitRemote(ee) : null;
      await FEf({
        signal: V.signal,
        executeCommand: () => executeStatusLineCommand(BEf(b.current, Q, C.current, g.current, K, Array.from(S.current.keys()), E.current, oe, re, k.current, _.current, ne, x.current, A.current), V.signal, undefined, J),
        getCommandLength: () => y.current?.command.length,
        pendingResultLogRef: L,
        onResult: se => {
          l(ae => {
            if (ae.statusLineText === se) {
              return ae;
            }
            return {
              ...ae,
              statusLineText: se
            };
          });
        }
      });
    }, [e, l]);
    let F = useDebouncedCallback(() => {
      P();
    }, 300);
    DE.useEffect(() => {
      if (t !== I.current.messageId || n !== I.current.tokenUsage || s !== I.current.permissionMode || r !== I.current.vimMode || d !== I.current.mainLoopModel || p !== I.current.fastMode || m !== I.current.effortValue || f !== I.current.thinkingEnabled || h !== I.current.prStatus) {
        I.current.tokenUsage = n;
        I.current.permissionMode = s;
        I.current.vimMode = r;
        I.current.mainLoopModel = d;
        I.current.fastMode = p;
        I.current.effortValue = m;
        I.current.thinkingEnabled = f;
        I.current.prStatus = h;
        F();
      }
    }, [t, n, s, r, d, p, m, f, h, F]);
    let H = u?.refreshInterval;
    useInterval(F, H !== undefined ? Math.max(1, H) * 1000 : null);
    let U = u?.command;
    let N = DE.useRef(true);
    DE.useEffect(() => {
      if (N.current) {
        N.current = false;
        return;
      }
      O.current = true;
      M.current = true;
      L.current = true;
      P();
    }, [U, P]);
    let W = u;
    DE.useEffect(() => {
      if (!W) {
        return;
      }
      Svc(M, "tengu_status_line_mount", () => ({
        command_length: W.command.length,
        padding: W.padding
      }));
    }, [W]);
    let j = DE.useRef(false);
    DE.useEffect(() => {
      if (j.current) {
        return;
      }
      if (!W) {
        return;
      }
      if (j.current = true, c?.disableAllHooks === true) {
        logForDebugging("Status line is configured but disableAllHooks is true", {
          level: "warn"
        });
      }
      if (!checkHasTrustDialogAccepted()) {
        tD("statusline", 1);
        l(V => {
          if (V.setupIssues.statuslineIssueCount === 1) {
            return V;
          }
          return {
            ...V,
            setupIssues: {
              ...V.setupIssues,
              statuslineIssueCount: 1
            }
          };
        });
        logForDebugging("Status line command skipped: workspace trust not accepted", {
          level: "warn"
        });
      }
    }, [W, c?.disableAllHooks, l]);
    DE.useEffect(() => (P(), () => {
      o.current?.abort();
    }), []);
    let z = u?.padding ?? 0;
    return GCe.jsx(gXd, {
      paddingX: z,
      gap: 2,
      children: a ? GCe.jsx(HEf, {
        text: a
      }) : qs() ? GCe.jsx(Text, {
        children: " "
      }) : null
    });
  }
  function HEf(e) {
    let t = bvc.c(11);
    let {
      text: n
    } = e;
    let r;
    let o;
    let s;
    let i;
    if (t[0] !== n) {
      i = Symbol.for("react.early_return_sentinel");
      e: {
        let l = WEf(n);
        if (l.length === 1) {
          let c = GCe.jsx(Ansi, {
            children: n
          });
          let u;
          if (t[5] !== c) {
            u = GCe.jsx(Text, {
              dimColor: true,
              wrap: "truncate",
              children: c
            });
            t[5] = c;
            t[6] = u;
          } else {
            u = t[6];
          }
          i = u;
          break e;
        }
        r = gXd;
        o = "column";
        s = l.map(jEf);
      }
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
      t[4] = i;
    } else {
      r = t[1];
      o = t[2];
      s = t[3];
      i = t[4];
    }
    if (i !== Symbol.for("react.early_return_sentinel")) {
      return i;
    }
    let a;
    if (t[7] !== r || t[8] !== o || t[9] !== s) {
      a = GCe.jsx(r, {
        flexDirection: o,
        children: s
      });
      t[7] = r;
      t[8] = o;
      t[9] = s;
      t[10] = a;
    } else {
      a = t[10];
    }
    return a;
  }
  function jEf(e, t) {
    return GCe.jsx(Text, {
      dimColor: true,
      wrap: "truncate",
      children: GCe.jsx(Ansi, {
        children: e
      })
    }, t);
  }
  function WEf(e) {
    let t = e.split(`
`);
    if (t.length === 1) {
      return t;
    }
    let n = [t[0]];
    let r = "";
    for (let o = 1; o < t.length; o++) {
      r += (t[o - 1].match(qEf) ?? []).join("");
      n.push(r + t[o]);
    }
    return n;
  }
  var bvc;
  var DE;
  var GCe;
  var qEf;
  var Evc;
  var EJo = __lazy(() => {
    Ot();
    ho();
    at();
    Kq();
    C$();
    iH();
    Qq();
    bc();
    et();
    ru();
    pU();
    VT();
    vo();
    je();
    bI();
    Fp();
    zp();
    na();
    lQt();
    Sp();
    ro();
    Eo();
    fa();
    pK();
    TO();
    iP();
    oUe();
    bvc = __toESM(pt(), 1);
    DE = __toESM(ot(), 1);
    GCe = __toESM(ie(), 1);
    qEf = /\x1b\[[\d;]*m|\x1b\]8;[^\x07\x1b]*(?:\x07|\x1b\\)/g;
    Evc = DE.memo($Ef);
  });
  function vvc() {
    Vfr.useContext(oWi);
    let e = rVd.get(process.stdout);
    return Vfr.useMemo(() => {
      if (!e) {
        return {
          setQuery: () => {},
          scanElement: () => [],
          setPositions: () => {}
        };
      }
      return {
        setQuery: t => e.setSearchHighlight(t),
        scanElement: t => e.scanElementSubtree(t),
        setPositions: t => e.setSearchPositions(t)
      };
    }, [e]);
  }
  var Vfr;
  var wvc = __lazy(() => {
    Vfr = __toESM(ot(), 1);
  });
  function Rvc(e) {
    let t = Cvc.c(7);
    let {
      summary: n,
      carryOverCount: r,
      onConfirm: o,
      onCancel: s
    } = e;
    let i = r > 0 ? ` ${r} ${r === 1 ? "task carries" : "tasks carry"} over to the background session.` : "";
    let a = `${n} running \u2014 they will be stopped.${i}`;
    let l;
    if (t[0] !== s || t[1] !== o) {
      l = vJo.jsx(mc, {
        confirmLabel: "Background anyway (tasks will be stopped)",
        cancelLabel: "Stay",
        onConfirm: o,
        onCancel: s
      });
      t[0] = s;
      t[1] = o;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c;
    if (t[3] !== s || t[4] !== a || t[5] !== l) {
      c = vJo.jsx(or, {
        title: "Background this session?",
        subtitle: a,
        onCancel: s,
        children: l
      });
      t[3] = s;
      t[4] = a;
      t[5] = l;
      t[6] = c;
    } else {
      c = t[6];
    }
    return c;
  }
  var Cvc;
  var vJo;
  var xvc = __lazy(() => {
    b_();
    Ii();
    Cvc = __toESM(pt(), 1);
    vJo = __toESM(ie(), 1);
  });
  function Avc(e) {
    let t = kvc.c(7);
    let {
      onDone: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = zJe.jsxs(gXd, {
        flexDirection: "column",
        children: [zJe.jsx(Text, {
          children: "Learn more about how to monitor your spending:"
        }), zJe.jsx(Link, {
          url: "https://code.claude.com/docs/en/costs"
        })]
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      o = [{
        value: "ok",
        label: "Got it, thanks!"
      }];
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n) {
      s = zJe.jsx(xr, {
        options: o,
        onChange: n
      });
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== n || t[5] !== s) {
      i = zJe.jsxs(or, {
        title: "You've spent $5 on the Anthropic API this session.",
        onCancel: n,
        children: [r, s]
      });
      t[4] = n;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  var kvc;
  var zJe;
  var Ivc = __lazy(() => {
    et();
    OS();
    Ii();
    kvc = __toESM(pt(), 1);
    zJe = __toESM(ie(), 1);
  });
  function Ovc(e, t) {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_gleaming_fair", false)) {
      return null;
    }
    if (getGlobalConfig().resumeReturnDismissed) {
      return null;
    }
    let n = R7(process.env.CLAUDE_CODE_RESUME_THRESHOLD_MINUTES, 70);
    let r = R7(process.env.CLAUDE_CODE_RESUME_TOKEN_THRESHOLD, 1e5);
    let o = Date.now() - 60000;
    let s = e.findLast(l => (l.type === "user" || l.type === "assistant") && Date.parse(l.timestamp) < o)?.timestamp;
    if (!s) {
      return null;
    }
    let i = (Date.now() - Date.parse(s)) / 60000;
    if (i < n) {
      return null;
    }
    let a = t(e);
    if (a < r) {
      return null;
    }
    return {
      sessionAgeMinutes: i,
      estimatedTokens: a
    };
  }
  function Dvc(e) {
    let t = Pvc.c(16);
    let {
      sessionAgeMinutes: n,
      estimatedTokens: r,
      onDone: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = GEf(n);
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] !== r) {
      a = formatTokens(r);
      t[2] = r;
      t[3] = a;
    } else {
      a = t[3];
    }
    let c = `This session is ${i} old and ${a} tokens.`;
    let u;
    if (t[4] !== o) {
      u = () => o("dismiss");
      t[4] = o;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      d = $Rt.jsx(gXd, {
        flexDirection: "column",
        children: $Rt.jsx(Text, {
          children: "Resuming the full session will consume a substantial portion of your usage limits. We recommend resuming from a summary."
        })
      });
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        value: "compact",
        label: "Resume from summary (recommended)"
      };
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      m = {
        value: "continue",
        label: "Resume full session as-is"
      };
      t[8] = m;
    } else {
      m = t[8];
    }
    let f;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      f = [p, m, {
        value: "never",
        label: "Don't ask me again"
      }];
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== o) {
      h = $Rt.jsx(xr, {
        options: f,
        onChange: y => o(y)
      });
      t[10] = o;
      t[11] = h;
    } else {
      h = t[11];
    }
    let g;
    if (t[12] !== c || t[13] !== u || t[14] !== h) {
      g = $Rt.jsxs(or, {
        title: c,
        onCancel: u,
        children: [d, h]
      });
      t[12] = c;
      t[13] = u;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    return g;
  }
  function GEf(e) {
    if (e < 60) {
      return `${Math.floor(e)}m`;
    }
    let t = Math.floor(e / 60);
    if (t < 24) {
      let o = Math.floor(e % 60);
      return o === 0 ? `${t}h` : `${t}h ${o}m`;
    }
    let n = Math.floor(t / 24);
    let r = t % 24;
    return r === 0 ? `${n}d` : `${n}d ${r}h`;
  }
  var Pvc;
  var $Rt;
  var Mvc = __lazy(() => {
    et();
    $n();
    gn();
    cs();
    OS();
    Ii();
    Pvc = __toESM(pt(), 1);
    $Rt = __toESM(ie(), 1);
  });
  function Fvc() {
    if (KJe++, KJe === 1) {
      if (Fie !== null) {
        clearTimeout(Fie);
        Fie = null;
      }
      Hvc();
      QEf();
    }
  }
  function Uvc() {
    if (KJe > 0) {
      KJe--;
    }
    if (KJe === 0 && Fie === null) {
      Fie = setTimeout(() => {
        Fie = null;
        $vc();
        wJo();
      }, 30000);
      Fie.unref();
    }
  }
  function XEf() {
    if (KJe = 0, Fie !== null) {
      clearTimeout(Fie);
      Fie = null;
    }
    $vc();
    wJo();
  }
  function Bvc() {
    if (false) {
      return null;
    }
    let e = String(300);
    if (Wt() === "macos") {
      return ["caffeinate", ["-i", "-t", e]];
    }
    return null;
  }
  function QEf() {
    if (Bvc() === null) {
      return;
    }
    if (HRt !== null) {
      return;
    }
    HRt = setInterval(() => {
      if (KJe > 0 || Fie !== null) {
        logForDebugging("Restarting sleep inhibitor to maintain prevention");
        wJo();
        Hvc();
      }
    }, 240000);
    HRt.unref();
  }
  function $vc() {
    if (HRt !== null) {
      clearInterval(HRt);
      HRt = null;
    }
  }
  function Hvc() {
    let e = Bvc();
    if (e === null) {
      return;
    }
    if (z5 !== null) {
      return;
    }
    if (!Nvc) {
      Nvc = true;
      Ti(async () => {
        XEf();
      });
    }
    try {
      let [t, n] = e;
      z5 = Lvc.spawn(t, n, {
        stdio: "ignore",
        windowsHide: true
      });
      z5.unref();
      let r = z5;
      z5.on("error", o => {
        if (logForDebugging(`sleep inhibitor spawn error: ${o.message}`), z5 === r) {
          z5 = null;
        }
      });
      z5.on("exit", () => {
        if (z5 === r) {
          z5 = null;
        }
      });
      logForDebugging(`Started ${t} to prevent sleep`);
    } catch {
      z5 = null;
    }
  }
  function wJo() {
    if (z5 !== null) {
      let e = z5;
      z5 = null;
      try {
        e.kill("SIGKILL");
        logForDebugging("Stopped sleep inhibitor, allowing sleep");
      } catch {}
    }
  }
  var Lvc;
  var z5 = null;
  var HRt = null;
  var Fie = null;
  var KJe = 0;
  var Nvc = false;
  var jvc = __lazy(() => {
    hd();
    je();
    dt();
    Cs();
    Lvc = require("child_process");
  });
  class CJo {
    _status = "idle";
    _generation = 0;
    _changed = Si();
    reserve() {
      if (this._status !== "idle") {
        return false;
      }
      this._status = "dispatching";
      this._notify();
      return true;
    }
    cancelReservation() {
      if (this._status !== "dispatching") {
        return;
      }
      this._status = "idle";
      this._notify();
    }
    tryStart() {
      if (this._status === "running") {
        return null;
      }
      this._status = "running";
      ++this._generation;
      this._notify();
      return this._generation;
    }
    end(e) {
      if (this._generation !== e) {
        return false;
      }
      if (this._status !== "running") {
        return false;
      }
      this._status = "idle";
      this._notify();
      return true;
    }
    forceEnd() {
      if (this._status === "idle") {
        return;
      }
      this._status = "idle";
      ++this._generation;
      this._notify();
    }
    get isActive() {
      return this._status !== "idle";
    }
    get generation() {
      return this._generation;
    }
    subscribe = this._changed.subscribe;
    getSnapshot = () => this._status !== "idle";
    _notify() {
      setMainLoopBusy(this._status !== "idle");
      this._changed.emit();
    }
  }
  var qvc = __lazy(() => {
    at();
    ph();
  });
  function Wvc(e) {
    let t = false;
    Ehe.setState(n => {
      let r = n.open.filter(i => i.id !== e);
      if (r.length === n.open.length) {
        return n;
      }
      t = true;
      let o = n.open.at(-1)?.id === e;
      let s = r.at(-1);
      return {
        open: o && s ? [...r.slice(0, -1), {
          ...s,
          swappedAt: Date.now()
        }] : r
      };
    });
    return t;
  }
  function jRt() {
    return xJo.useSyncExternalStore(Ehe.subscribe, Gvc, Gvc);
  }
  function Gvc() {
    return Ehe.getState().open.at(-1) ?? null;
  }
  function YJe() {
    return xJo.useSyncExternalStore(Ehe.subscribe, Vvc, Vvc);
  }
  function Vvc() {
    return Ehe.getState().open.length > 0;
  }
  var xJo;
  var Ehe;
  var RJo;
  var Z3;
  var FBe = __lazy(() => {
    tre();
    ph();
    xJo = __toESM(ot(), 1);
    Ehe = dO({
      open: []
    });
    RJo = Si();
    Z3 = {
      getState: Ehe.getState,
      subscribe: Ehe.subscribe,
      onClosed: RJo.subscribe,
      open(e) {
        Ehe.setState(t => {
          if (e.queueBehind && t.open.length > 0) {
            return {
              open: [e, ...t.open]
            };
          }
          let n = t.open.length > 0 ? {
            ...e,
            swappedAt: Date.now()
          } : e;
          return {
            open: [...t.open, n]
          };
        });
      },
      update(e, t) {
        Ehe.setState(n => {
          let r = n.open.findIndex(s => s.id === e);
          if (r === -1) {
            return n;
          }
          let o = n.open.slice();
          o[r] = {
            ...n.open[r],
            payload: t
          };
          return {
            open: o
          };
        });
      },
      answer(e, t) {
        if (!Wvc(e)) {
          return;
        }
        RJo.emit({
          id: e,
          type: "answered",
          result: t
        });
      },
      dismiss(e) {
        if (!Wvc(e)) {
          return;
        }
        RJo.emit({
          id: e,
          type: "dismissed"
        });
      },
      _resetForTests() {
        Ehe.setState(() => ({
          open: []
        }));
      }
    };
  });
  function zvc(e) {
    let {
      sandboxHost: t,
      elicitationServer: n,
      workerSandboxHost: r
    } = e;
    let o = li();
    let s = ZEf[jRt()?.kind ?? ""];
    crn.useEffect(() => {
      if (!o) {
        return;
      }
      _Z.emit(t ? `allow network: ${t}` : null, "sandbox");
    }, [o, t]);
    crn.useEffect(() => {
      if (!o) {
        return;
      }
      _Z.emit(r ? `allow network: ${r}` : null, "worker-sandbox");
    }, [o, r]);
    crn.useEffect(() => {
      if (!o) {
        return;
      }
      _Z.emit(n ? `MCP input: ${n}` : null, "elicitation");
    }, [o, n]);
    crn.useEffect(() => {
      if (!o) {
        return;
      }
      _Z.emit(s ?? null, "dialog");
    }, [o, s]);
  }
  var crn;
  var ZEf;
  var Kvc = __lazy(() => {
    FBe();
    yd();
    OTt();
    crn = __toESM(ot(), 1);
    ZEf = {
      refusal_fallback_prompt: "choose: retry on fallback model or edit prompt",
      fable_overage_consent_prompt: "choose: continue Fable 5 on usage credits or switch models"
    };
  });
  function Jvc() {
    let e = jRt();
    let t = e?.kind === Wze.kind;
    Yvc.useEffect(() => {
      if (!li()) {
        $Et(null);
        return;
      }
      if (t && e) {
        let n = e.payload;
        $Et(r => {
          let o = r.trim();
          if (!o || o.startsWith("!") || o.startsWith("/")) {
            return false;
          }
          let s = n.questions[0];
          if (!s) {
            return false;
          }
          $Et(null);
          let a = s.options?.find(l => l.label.toLowerCase() === o.toLowerCase())?.label ?? o;
          Z3.answer(e.id, {
            behavior: "allow",
            updatedInput: {
              ...n.input,
              answers: {
                [s.question]: a
              }
            }
          });
          return true;
        });
        return () => $Et(null);
      }
      $Et(null);
    }, [e, t]);
  }
  var Yvc;
  var Xvc = __lazy(() => {
    RXn();
    FBe();
    yd();
    Yvc = __toESM(ot(), 1);
  });
  function Zvc(e) {
    let t = Qvc.c(8);
    let {
      name: n,
      color: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = Gz(r);
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i = `@${n}`;
    let a;
    if (t[2] !== n) {
      a = urn.jsxs(Text, {
        bold: true,
        children: ["@", n]
      });
      t[2] = n;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== s || t[5] !== i || t[6] !== a) {
      l = urn.jsx(gXd, {
        flexDirection: "row",
        gap: 1,
        children: urn.jsxs(Text, {
          "aria-label": i,
          color: s,
          children: [Tc, " ", a]
        })
      });
      t[4] = s;
      t[5] = i;
      t[6] = a;
      t[7] = l;
    } else {
      l = t[7];
    }
    return l;
  }
  var Qvc;
  var urn;
  var ewc = __lazy(() => {
    wl();
    et();
    wKe();
    Qvc = __toESM(pt(), 1);
    urn = __toESM(ie(), 1);
  });
  function kJo(e) {
    let t = twc.c(15);
    let {
      toolName: n,
      description: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = getTeamName();
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = getAgentName();
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = getTeammateColor();
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = l;
    let u;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = dB.jsxs(gXd, {
        children: [dB.jsx(Ed, {}), dB.jsxs(Text, {
          bold: true,
          color: "warning",
          children: [" ", "Waiting for team lead approval"]
        })]
      });
      t[3] = u;
    } else {
      u = t[3];
    }
    let d;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      d = a && c && dB.jsx(gXd, {
        marginBottom: 1,
        children: dB.jsx(Zvc, {
          name: a,
          color: c
        })
      });
      t[4] = d;
    } else {
      d = t[4];
    }
    let p;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      p = dB.jsx(Text, {
        dimColor: true,
        children: "Tool: "
      });
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] !== n) {
      m = dB.jsxs(gXd, {
        children: [p, dB.jsx(Text, {
          children: n
        })]
      });
      t[6] = n;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      f = dB.jsx(Text, {
        dimColor: true,
        children: "Action: "
      });
      t[8] = f;
    } else {
      f = t[8];
    }
    let h;
    if (t[9] !== r) {
      h = dB.jsxs(gXd, {
        children: [f, dB.jsx(Text, {
          children: r
        })]
      });
      t[9] = r;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      g = s && dB.jsx(gXd, {
        marginTop: 1,
        children: dB.jsxs(Text, {
          dimColor: true,
          children: ["Permission request sent to team ", '"', s, '"', " leader"]
        })
      });
      t[11] = g;
    } else {
      g = t[11];
    }
    let y;
    if (t[12] !== m || t[13] !== h) {
      y = dB.jsxs(_E, {
        color: "warning",
        children: [u, dB.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [d, m, h, g]
        })]
      });
      t[12] = m;
      t[13] = h;
      t[14] = y;
    } else {
      y = t[14];
    }
    return y;
  }
  var twc;
  var dB;
  var nwc = __lazy(() => {
    et();
    qp();
    Az();
    cA();
    ewc();
    twc = __toESM(pt(), 1);
    dB = __toESM(ie(), 1);
  });
  function VCe(e) {
    return mf(Lc(e).replace(/\s+/g, " ").trim(), 200);
  }
  function rwc(e) {
    let t = [];
    for (let n of Object.values(e)) {
      let r = tvf.vZc(n.status);
      switch (n.type) {
        case "local_agent":
        case "in_process_teammate":
          t.push({
            id: n.id,
            kind: "agent",
            label: VCe(n.description),
            startedAt: n.startTime,
            doneAt: n.endTime,
            failed: r || undefined
          });
          break;
        case "local_workflow":
          {
            let o = n.workflowProgress.filter(nvf);
            if (o.length === 0) {
              t.push({
                id: n.id,
                kind: "workflow",
                label: VCe(n.title ?? n.workflowName ?? n.description),
                startedAt: n.startTime,
                doneAt: n.endTime,
                failed: r || undefined
              });
              break;
            }
            for (let s of o) {
              t.push({
                id: s.agentId ?? `${n.id}:${s.index}`,
                kind: "workflow",
                label: VCe(s.label),
                group: s.phaseTitle,
                startedAt: s.startedAt ?? s.queuedAt ?? n.startTime,
                doneAt: s.state === "done" || s.state === "error" ? s.lastProgressAt ?? (s.startedAt !== undefined && s.durationMs !== undefined ? s.startedAt + s.durationMs : undefined) : undefined,
                failed: s.state === "error" || undefined
              });
            }
            break;
          }
        case "local_bash":
          t.push({
            id: n.id,
            kind: n.kind === "monitor" ? "monitor" : "shell",
            label: VCe(n.kind === "monitor" ? n.description : n.command),
            startedAt: n.startTime,
            doneAt: n.endTime,
            failed: r || n.result !== undefined && n.result.code !== 0 || undefined
          });
          break;
        case "monitor_mcp":
          t.push({
            id: n.id,
            kind: "monitor",
            label: VCe(n.description || `${n.server} \xB7 ${n.tool}`),
            startedAt: n.startTime,
            doneAt: n.endTime,
            failed: r || undefined
          });
          break;
        case "monitor_ws":
          t.push({
            id: n.id,
            kind: "monitor",
            label: VCe(n.description || n.url),
            startedAt: n.startTime,
            doneAt: n.endTime,
            failed: r || undefined
          });
          break;
        case "mcp_task":
          t.push({
            id: n.id,
            kind: "mcp",
            label: VCe(n.statusMessage ?? `${n.serverName} \xB7 ${n.toolName}`),
            startedAt: n.startTime,
            doneAt: n.endTime,
            failed: r || n.mcpStatus === "failed" || undefined
          });
          break;
        case "remote_agent":
        case "dream":
          break;
      }
    }
    return t;
  }
  function nvf(e) {
    return e.type === "workflow_agent";
  }
  function owc(e) {
    if (!e || e.length === 0) {
      return [];
    }
    return e.map(t => ({
      id: `todo:${ike(t.content).toString(36)}`,
      kind: "todo",
      label: VCe(t.status === "in_progress" ? t.activeForm : t.content),
      startedAt: t.status === "pending" ? undefined : 0,
      doneAt: t.status === "completed" ? 0 : undefined
    }));
  }
  function swc(e) {
    if (!e || e.length === 0) {
      return [];
    }
    return e.map(t => ({
      id: `todo:${t.id}`,
      kind: "todo",
      label: VCe(t.status === "in_progress" ? t.activeForm ?? t.subject : t.subject),
      startedAt: t.status === "pending" ? undefined : 0,
      doneAt: t.status === "completed" ? 0 : undefined
    }));
  }
  var tvf;
  var iwc = __lazy(() => {
    Kv();
    Qme();
    tvf = new Set(["failed", "cancelled", "killed", "error"]);
  });
  function awc(e, t = false, n = false) {
    let r = bt(p => p.teamContext);
    let o = vee.useRef(0);
    let s = vee.useRef(undefined);
    let i = vee.useRef(undefined);
    let a = vee.useRef(undefined);
    let l = vee.useRef(true);
    let c = vee.useRef(0);
    let u = vee.useRef(new Set());
    let d = vee.useRef(0);
    vee.useEffect(() => {
      (null)?.initSessionLog();
    }, []);
    vee.useEffect(() => {
      if (getCaps().transcriptSource === "ccr-api") {
        return;
      }
      if (t) {
        d.current = e.length;
        return;
      }
      let p = e[0]?.uuid;
      let m = o.current;
      let f = i.current === undefined;
      let h = m === 0 || e[m - 1]?.uuid === a.current || !l.current && m === e.length;
      let g = p !== undefined && !f && p === i.current && m <= e.length && h;
      let y = p !== undefined && !f && p === i.current && m > e.length;
      let _ = g ? m : 0;
      let b = g || f ? d.current : _;
      let S = transcriptCursorEnd(e, Math.max(_, b), n);
      if (!g) {
        d.current = S;
      }
      let E = e[S - 1];
      if (a.current = E?.uuid, l.current = E === undefined || isLoggableMessage(E), S === _) {
        return;
      }
      let C = _ === 0 && S === e.length ? e : e.slice(_, S);
      let x = g ? s.current : undefined;
      if (_ === 0) {
        u.current.clear();
      }
      collectReplIds(C, u.current);
      let A = ++c.current;
      let k = r?.selfAgentName;
      if (recordTranscript(C, isAgentSwarmsEnabled() && k ? {
        teamName: r?.teamName,
        agentName: k
      } : {}, x, u.current).then(I => {
        if (A !== c.current) {
          return;
        }
        if (I && !g) {
          s.current = I;
        }
      }), g || f || y) {
        let I = cleanMessagesForLogging(C, u.current).findLast(isChainParticipant);
        if (I) {
          s.current = I.uuid;
        }
      }
      o.current = S;
      i.current = p;
    }, [e, t, n, r?.teamName, r?.selfAgentName]);
  }
  var vee;
  var lwc = __lazy(() => {
    at();
    ho();
    mE();
    fa();
    vee = __toESM(ot(), 1);
  });
  function drn(e, t, n) {
    if (e === "now") {
      return e;
    }
    return t && ivf.vZc(t) || n && cvf.vZc(n) ? "later" : e;
  }
  function uvf() {
    return false;
  }
  function dvf() {
    return false;
  }
  function pvf(e, t) {
    return e !== undefined && avf.vZc(e) && t === "slack_human" && uvf();
  }
  function mvf(e, t) {
    return e === "claude-in-teams" && t === "teams_human" && dvf();
  }
  function prn(e, t) {
    return pvf(e, t) || mvf(e, t);
  }
  function mwc(e) {
    return e === "slack_human" || e === "teams_human";
  }
  function mrn(e, t) {
    if (e && e.kind !== "peer") {
      return e;
    }
    if (t && svf.vZc(t)) {
      return {
        kind: "task-notification"
      };
    }
    if (t && ovf.vZc(t)) {
      return {
        kind: "human"
      };
    }
    return;
  }
  function zfr(e) {
    return e.verifiedSlackHumanTurn === true && e.priority !== "now";
  }
  function fwc(e, t) {
    if (e === "now") {
      return e;
    }
    return t ? "later" : e;
  }
  function Kfr(e) {
    let r = e.trimStart();
    let o = false;
    while (r.startsWith("<system-reminder>")) {
      let i = r.indexOf("</system-reminder>");
      if (i < 0) {
        break;
      }
      r = r.slice(i + 18).trimStart();
      o = true;
    }
    let s = (o ? r : e).trimEnd();
    while (s.endsWith("</system-reminder>")) {
      let i = s.lastIndexOf(`
`);
      if (!(i < 0 ? s : s.slice(i + 1)).startsWith("<system-reminder>")) {
        break;
      }
      s = (i < 0 ? "" : s.slice(0, i)).trimEnd();
      o = true;
    }
    if (!o) {
      return e;
    }
    return s === "" ? e : s;
  }
  function AJo(e) {
    let t;
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r.type !== "text") {
        continue;
      }
      let o = Kfr(r.text);
      if (o === r.text) {
        continue;
      }
      t ??= [...e];
      t[n] = {
        ...r,
        text: o
      };
    }
    return t ?? e;
  }
  function Yfr(e) {
    if (e.type !== "user") {
      return;
    }
    let t = e.message?.content;
    if (!t) {
      return;
    }
    if (Array.isArray(t) && t.length === 0) {
      return;
    }
    let n = "uuid" in e && typeof e.uuid === "string" ? e.uuid : undefined;
    let r = "client_platform" in e && typeof e.client_platform === "string" ? e.client_platform : undefined;
    let o = "inbound_origin" in e && typeof e.inbound_origin === "string" ? e.inbound_origin : undefined;
    let s = Array.isArray(t) ? fvf(AJo(hvf(t))) : Kfr(t);
    if (Array.isArray(s) && s.length === 0) {
      return;
    }
    return {
      content: s,
      uuid: n,
      clientPlatform: r,
      inboundOrigin: o
    };
  }
  function hwc(e) {
    return;
  }
  function fvf(e) {
    if (!e.some(cwc)) {
      return e;
    }
    return e.filter(t => !cwc(t));
  }
  function cwc(e) {
    if (e.type !== "text") {
      return false;
    }
    return typeof e.text !== "string" || e.text.trim() === "";
  }
  function hvf(e) {
    if (!e.some(uwc)) {
      return e;
    }
    return e.map(t => {
      if (!uwc(t)) {
        return t;
      }
      let n = t.source;
      let r = typeof n.mediaType === "string" && n.mediaType ? n.mediaType : sLn(t.source.data);
      return {
        ...t,
        source: {
          type: "base64",
          media_type: r,
          data: t.source.data
        }
      };
    });
  }
  function uwc(e) {
    if (e.type !== "image" || e.source?.type !== "base64") {
      return false;
    }
    return !e.source.media_type;
  }
  var ovf;
  var svf;
  var ivf;
  var avf;
  var cvf;
  var Jfr = __lazy(() => {
    np();
    Ot();
    je();
    $A();
    ovf = new Set(["ios", "android", "web_claude_ai", "desktop_app"]);
    svf = new Set(["scheduled_trigger", "force_run_trigger", "github_webhook_trigger", "fire_routine", "pr_steward"]);
    ivf = new Set(["scheduled_trigger", "force_run_trigger", "fire_routine"]);
    avf = new Set(["claude-in-slack", "claude_in_slack"]);
    cvf = new Set(["trigger_fire", "plugin_fire"]);
  });
  function Xfr(e) {
    if (typeof e === "string") {
      return e.trim().startsWith("/");
    }
    for (let t of e) {
      if (t.type === "text") {
        return t.text.trim().startsWith("/");
      }
    }
    return false;
  }
  function frn(e, t, n) {
    if (Xfr(t)) {
      return "later";
    }
    if (e === "now") {
      return "now";
    }
    if (n) {
      return "later";
    }
    if (e !== undefined) {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_pencil_farmer", false) ? "next" : "later";
  }
  function gwc(e) {
    return e.verifiedSlackHumanTurn === true && e.priority === "later";
  }
  function hrn() {
    return LV(gwc) !== undefined || jmo(gwc);
  }
  function grn() {
    return LV(zfr) !== undefined || jmo(zfr);
  }
  function IJo(e) {
    let t = LV(e);
    if (!t || t.priority === "now") {
      return t;
    }
    return LV(n => e(n) && zfr(n)) ?? t;
  }
  function ywc(e) {
    let t = IJo(e);
    if (t === undefined) {
      return;
    }
    return i5e(n => n === t);
  }
  var Qfr = __lazy(() => {
    $n();
    Rf();
    Jfr();
  });
  async function _vf() {
    let e = Me.CLAUDE_CLIENT_PRESENCE_FILE;
    if (!e) {
      return false;
    }
    if (Rc(e) && !Pp(e)) {
      return false;
    }
    try {
      await _wc.stat(e);
      return true;
    } catch (t) {
      if (!fn(t)) {
        logForDebugging(`[presence] client-presence-marker stat failed: ${t}`);
      }
      return false;
    }
  }
  function bwc(e, t, n) {
    if (Vi()) {
      return yvf;
    }
    let r = {
      sessionId: e,
      baseUrl: t,
      getAuthHeaders: n
    };
    let o = null;
    let s = 0;
    let i = () => {
      let d = Date.now();
      s = d;
      o ??= new Date(d).toISOString();
      let p = `${r.baseUrl}/v1/code/sessions/${r.sessionId}/client/presence`;
      logForDebugging(`[presence] pulse \u2192 ${p}`);
      return NP.post(p, {
        client_id: gvf,
        connected_at: o
      }, {
        headers: {
          ...r.getAuthHeaders(),
          "anthropic-version": "2023-06-01",
          "anthropic-client-platform": getClientPlatform()
        },
        timeout: 5000,
        validateStatus: () => true
      }).then(m => {
        if (m.status >= 400) {
          logForDebugging(`[presence] pulse got ${m.status}`);
        }
      }, () => {});
    };
    let a = () => {
      if (getTerminalFocus() === false) {
        logForDebugging("[presence] pulse skipped (terminal blurred)");
        return;
      }
      if (Date.now() - s < 5000) {
        return;
      }
      i();
    };
    let l = onInteraction(a);
    let c = onTerminalFocusChange(() => {
      let d = getTerminalFocus();
      if (logForDebugging(`[presence] terminal focus \u2192 ${d === undefined ? "unknown" : d ? "focused" : "blurred"}`), d === true) {
        a();
      }
    });
    logForDebugging(`[presence] wired for session ${e}`);
    let u = false;
    return {
      teardown() {
        u = true;
        l?.();
        l = null;
        c?.();
        c = null;
        o = null;
      },
      pulseIfClientPresent() {
        if (u || Date.now() - s < 5000) {
          return;
        }
        _vf().then(d => {
          if (d && !u && Date.now() - s >= 5000) {
            logForDebugging("[presence] client-presence-marker active \u2192 pulse");
            i();
          }
        });
      }
    };
  }
  var _wc;
  var gvf;
  var yvf;
  var Swc = __lazy(() => {
    Dp();
    CAt();
    at();
    mm();
    je();
    pr();
    dt();
    YA();
    Wd();
    _wc = require("fs/promises");
    gvf = Zee.randomUUID();
    yvf = {
      teardown: () => {},
      pulseIfClientPresent: () => {}
    };
  });
  async function wwc(e, t, n) {
    let [r, o] = await Promise.all([t.readMain(), t.readSubagents()]);
    let s = new Set();
    for (let c of r?.events ?? []) {
      let u = c.payload.uuid;
      if (typeof u === "string") {
        s.add(u);
      }
    }
    for (let c of o?.events ?? []) {
      let u = c.payload.uuid;
      if (typeof u === "string") {
        s.add(u);
      }
    }
    logForDebugging(`[persistence-sync] Server has ${s.size} events since compaction`);
    let i = c => {
      logForDebugging(`[persistence-sync] Write failed: ${c}`);
    };
    let a = await Ewc(getTranscriptPathForSession(getSessionId()), s);
    for (let c of a) {
      e("transcript", c, {
        ...(SS(c) && {
          isCompaction: true,
          preservedEventIds: c.compactMetadata?.preservedMessages?.uuids
        })
      }).catch(i);
    }
    let l = 0;
    for (let {
      agentId: c,
      path: u
    } of await bvf(n)) {
      let d = await Ewc(u, s);
      for (let p of d) {
        e("transcript", p, {
          ...(SS(p) && {
            isCompaction: true,
            preservedEventIds: p.compactMetadata?.preservedMessages?.uuids
          }),
          agentId: c
        }).catch(i);
      }
      l += d.length;
    }
    logForDebugging(`[persistence-sync] Uploaded ${a.length} main + ${l} subagent entries`);
    return {
      uploadedMain: a.length,
      uploadedSubagents: l
    };
  }
  async function bvf(e) {
    let n = (await Promise.all(e.map(async a => {
      let l = Ew(a);
      try {
        let c = await vwc.stat(l);
        return {
          agentId: a,
          path: l,
          size: c.size,
          mtimeMs: c.mtimeMs
        };
      } catch {
        return null;
      }
    }))).filter(a => a !== null);
    let r = n.filter(a => a.size <= 5242880);
    let o = r.sort((a, l) => l.mtimeMs - a.mtimeMs).slice(0, 20);
    let s = n.length - r.length;
    let i = r.length - o.length;
    if (s > 0 || i > 0) {
      logForDebugging(`[persistence-sync] Subagent backfill capped: ${s} over ${5242880}B, ${i} beyond ${20}-agent limit (live stream unaffected)`);
    }
    return o;
  }
  async function Ewc(e, t) {
    let n = [];
    try {
      for await (let r of Jcn(e)) {
        let o;
        try {
          o = qt(r);
        } catch {
          continue;
        }
        if (!isSyncedTranscriptEntry(o)) {
          continue;
        }
        if (!t.vZc(o.uuid)) {
          n.push(o);
        }
        if (SS(o)) {
          break;
        }
      }
    } catch (r) {
      if (fn(r)) {
        return [];
      }
      throw r;
    }
    return n.reverse();
  }
  var vwc;
  var Cwc = __lazy(() => {
    at();
    je();
    dt();
    ro();
    Fy();
    fa();
    ZS();
    vwc = require("fs/promises");
  });
  class PJo {
    _active = false;
    _pending = [];
    get active() {
      return this._active;
    }
    get pendingCount() {
      return this._pending.length;
    }
    start() {
      this._active = true;
    }
    end() {
      this._active = false;
      return this._pending.splice(0);
    }
    enqueue(...e) {
      if (!this._active) {
        return false;
      }
      this._pending.push(...e);
      return true;
    }
    drop() {
      this._active = false;
      let e = this._pending.length;
      this._pending.length = 0;
      return e;
    }
    deactivate() {
      this._active = false;
    }
  }
  class yrn {
    pending = [];
    pendingAtClose = 0;
    draining = false;
    closed = false;
    backpressureResolvers = [];
    sleepResolve = null;
    flushResolvers = [];
    droppedBatches = 0;
    config;
    constructor(e) {
      this.config = e;
    }
    get droppedBatchCount() {
      return this.droppedBatches;
    }
    get pendingCount() {
      return this.closed ? this.pendingAtClose : this.pending.length;
    }
    async enqueue(e) {
      if (this.closed) {
        return;
      }
      let t = Array.isArray(e) ? e : [e];
      if (t.length === 0) {
        return;
      }
      while (this.pending.length + t.length > this.config.maxQueueSize && !this.closed) {
        await new Promise(n => {
          this.backpressureResolvers.push(n);
        });
      }
      if (this.closed) {
        return;
      }
      this.pending.push(...t);
      this.drain();
    }
    flush() {
      if (this.pending.length === 0 && !this.draining) {
        return Promise.resolve();
      }
      this.drain();
      return new Promise(e => {
        this.flushResolvers.push(e);
      });
    }
    close() {
      if (this.closed) {
        return;
      }
      this.closed = true;
      this.pendingAtClose = this.pending.length;
      this.pending = [];
      this.sleepResolve?.();
      this.sleepResolve = null;
      for (let e of this.backpressureResolvers) {
        e();
      }
      this.backpressureResolvers = [];
      for (let e of this.flushResolvers) {
        e();
      }
      this.flushResolvers = [];
    }
    async drain() {
      if (this.draining || this.closed) {
        return;
      }
      this.draining = true;
      let e = 0;
      try {
        while (this.pending.length > 0 && !this.closed) {
          let t = this.takeBatch();
          if (t.length === 0) {
            continue;
          }
          try {
            await this.config.send(t);
            e = 0;
          } catch (n) {
            if (e++, this.config.maxConsecutiveFailures !== undefined && e >= this.config.maxConsecutiveFailures) {
              this.droppedBatches++;
              this.config.onBatchDropped?.(t.length, e);
              e = 0;
              this.releaseBackpressure();
              continue;
            }
            this.pending = t.concat(this.pending);
            let r = n instanceof JJe ? n.retryAfterMs : undefined;
            await this.sleep(this.retryDelay(e, r));
            continue;
          }
          this.releaseBackpressure();
        }
      } finally {
        if (this.draining = false, this.pending.length === 0) {
          for (let t of this.flushResolvers) {
            t();
          }
          this.flushResolvers = [];
        }
      }
    }
    takeBatch() {
      let {
        maxBatchSize: e,
        maxBatchBytes: t
      } = this.config;
      if (t === undefined) {
        return this.pending.splice(0, e);
      }
      let n = 0;
      let r = 0;
      while (r < this.pending.length && r < e) {
        let o;
        try {
          o = Buffer.byteLength(De(this.pending[r]));
        } catch {
          this.pending.splice(r, 1);
          continue;
        }
        if (r > 0 && n + o > t) {
          break;
        }
        n += o;
        r++;
      }
      return this.pending.splice(0, r);
    }
    retryDelay(e, t) {
      let n = Math.random() * this.config.jitterMs;
      if (t !== undefined) {
        return Math.max(this.config.baseDelayMs, Math.min(t, this.config.maxDelayMs)) + n;
      }
      return Math.min(this.config.baseDelayMs * 2 ** (e - 1), this.config.maxDelayMs) + n;
    }
    releaseBackpressure() {
      let e = this.backpressureResolvers;
      this.backpressureResolvers = [];
      for (let t of e) {
        t();
      }
    }
    sleep(e) {
      return new Promise(t => {
        this.sleepResolve = t;
        setTimeout((n, r) => {
          n.sleepResolve = null;
          r();
        }, e, this, t);
      });
    }
  }
  var JJe;
  var Rwc = __lazy(() => {
    JJe = class JJe extends Error {
      retryAfterMs;
      constructor(e, t) {
        super(e);
        this.retryAfterMs = t;
      }
    };
  });
  class OJo {
    inflight = null;
    pending = null;
    closed = false;
    config;
    constructor(e) {
      this.config = e;
    }
    enqueue(e) {
      if (this.closed) {
        return;
      }
      this.pending = this.pending ? xwc(this.pending, e) : e;
      this.drain();
    }
    close() {
      this.closed = true;
      this.pending = null;
    }
    async flush() {
      while (!this.closed) {
        if (this.inflight) {
          await this.inflight;
        } else if (this.pending) {
          await this.drain();
        } else {
          return;
        }
      }
    }
    async drain() {
      if (this.inflight || this.closed) {
        return;
      }
      if (!this.pending) {
        return;
      }
      let e = this.pending;
      this.pending = null;
      this.inflight = this.sendWithRetry(e).then(() => {
        if (this.inflight = null, this.pending && !this.closed) {
          this.drain();
        }
      });
    }
    async sendWithRetry(e) {
      let t = e;
      let n = 0;
      while (!this.closed) {
        if (await this.config.send(t)) {
          return;
        }
        if (n++, await sleep(this.retryDelay(n)), this.pending && !this.closed) {
          t = xwc(t, this.pending);
          this.pending = null;
        }
      }
    }
    retryDelay(e) {
      let t = Math.min(this.config.baseDelayMs * 2 ** (e - 1), this.config.maxDelayMs);
      let n = Math.random() * this.config.jitterMs;
      return t + n;
    }
  }
  function xwc(e, t) {
    let n = {
      ...e
    };
    for (let [r, o] of Object.entries(t)) {
      if ((r === "external_metadata" || r === "internal_metadata") && n[r] && typeof n[r] === "object" && typeof o === "object" && o !== null) {
        n[r] = {
          ...n[r],
          ...o
        };
      } else {
        n[r] = o;
      }
    }
    return n;
  }
  var kwc = () => {};
  function UBe(e) {
    return e === 400 || e === 413 || e === 422;
  }
  function Iwc(e) {
    let t = en(e);
    if (t) {
      return t;
    }
    if (e && typeof e === "object" && "name" in e && typeof e.name === "string") {
      return e.name;
    }
    return;
  }
  function Pwc(e) {
    return e instanceof BBe && e.reason === "worker_register_failed" && !UBe(e.httpStatus);
  }
  class _rn {
    workerEpoch = 0;
    heartbeatIntervalMs;
    heartbeatJitterFraction;
    heartbeatTimer = null;
    heartbeatInFlight = false;
    closed = false;
    consecutiveAuthFailures = 0;
    consecutiveNotFound = 0;
    currentState = null;
    sessionBaseUrl;
    sessionId;
    streamEventBuffer = [];
    streamEventTimer = null;
    streamedEphemeralSinceLastAssistant = false;
    workerState;
    eventUploader;
    internalEventUploader;
    onInternalBatchAcked;
    deliveryUploader;
    pendingProcessingAcks = [];
    onEpochMismatch;
    getAuthHeaders;
    onDiagnostic;
    constructor(e, t, n) {
      if (this.onEpochMismatch = n?.onEpochMismatch ?? (() => {
        process.exit(1);
      }), this.heartbeatIntervalMs = n?.heartbeatIntervalMs ?? 20000, this.heartbeatJitterFraction = n?.heartbeatJitterFraction ?? 0, this.getAuthHeaders = n?.getAuthHeaders ?? CIe, this.onDiagnostic = n?.onDiagnostic, t.protocol !== "http:" && t.protocol !== "https:") {
        throw Error(`CCRClient: Expected http(s) URL, got ${t.protocol}`);
      }
      let r = t.pathname.replace(/\/$/, "");
      this.sessionBaseUrl = `${t.protocol}//${t.host}${r}`;
      this.sessionId = r.split("/").pop() || "";
      this.workerState = new OJo({
        send: async o => {
          let s = await this.request("put", "/worker", {
            worker_epoch: this.workerEpoch,
            ...o
          }, "PUT worker");
          if (s.ok) {
            return true;
          }
          if (UBe(s.status)) {
            wn("warn", "cli_worker_state_4xx_dropped", {
              status: s.status
            });
            return true;
          }
          return false;
        },
        baseDelayMs: 500,
        maxDelayMs: 30000,
        jitterMs: 500
      });
      this.eventUploader = new yrn({
        maxBatchSize: 100,
        maxBatchBytes: 10485760,
        maxQueueSize: 1e5,
        send: async o => {
          let s = await this.request("post", "/worker/events", {
            worker_epoch: this.workerEpoch,
            events: o
          }, "client events");
          if (s.ok) {
            return;
          }
          if (UBe(s.status)) {
            let i = o.filter(l => !l.ephemeral);
            let a = o.length - i.length;
            if (a > 0) {
              if (logForDebugging(`CCRClient: client event POST rejected (${s.status}) \u2014 dropping ${a} ephemeral event(s), retrying ${i.length} durable event(s)`, {
                level: "warn"
              }), Et("ccr_partial_messages", "ephemeral_dropped_on_4xx"), o.splice(0, o.length, ...i), i.length === 0) {
                return;
              }
              let l = await this.request("post", "/worker/events", {
                worker_epoch: this.workerEpoch,
                events: i
              }, "client events (durable retry)");
              if (l.ok) {
                return;
              }
              if (!UBe(l.status)) {
                throw new JJe("client event POST failed", l.retryAfterMs);
              }
            }
            if (i.length > 0) {
              this.droppedDurableEventBatches++;
            }
            wn("warn", "cli_worker_events_4xx_dropped", {
              status: s.status,
              count: i.length
            });
            return;
          }
          throw new JJe("client event POST failed", s.retryAfterMs);
        },
        baseDelayMs: 500,
        maxDelayMs: 30000,
        jitterMs: 500
      });
      this.internalEventUploader = new yrn({
        maxBatchSize: 100,
        maxBatchBytes: 10485760,
        maxQueueSize: 200,
        send: async o => {
          let s = await this.request("post", "/worker/internal-events", {
            worker_epoch: this.workerEpoch,
            events: o
          }, "internal events");
          if (s.ok) {
            Promise.resolve().then(() => this.onInternalBatchAcked?.(o)).catch(() => {});
            return;
          }
          if (UBe(s.status)) {
            wn("warn", "cli_worker_internal_events_4xx_dropped", {
              status: s.status,
              count: o.length
            });
            return;
          }
          throw new JJe("internal event POST failed", s.retryAfterMs);
        },
        baseDelayMs: 500,
        maxDelayMs: 30000,
        jitterMs: 500
      });
      this.deliveryUploader = new yrn({
        maxBatchSize: 64,
        maxQueueSize: 64,
        send: async o => {
          let s = await this.request("post", "/worker/events/delivery", {
            worker_epoch: this.workerEpoch,
            updates: o.map(i => ({
              event_id: i.eventId,
              status: i.status
            }))
          }, "delivery batch");
          if (s.ok) {
            return;
          }
          if (UBe(s.status)) {
            wn("warn", "cli_worker_delivery_4xx_dropped", {
              status: s.status,
              count: o.length
            });
            return;
          }
          throw new JJe("delivery POST failed", s.retryAfterMs);
        },
        baseDelayMs: 500,
        maxDelayMs: 30000,
        jitterMs: 500
      });
      e.setOnEvent(o => {
        this.reportDelivery(o.event_id, "received");
      });
    }
    async initialize(e) {
      let t = Date.now();
      if (Object.keys(this.getAuthHeaders()).length === 0) {
        throw new BBe("no_auth_headers");
      }
      if (e === undefined) {
        let c = process.env.CLAUDE_CODE_WORKER_EPOCH;
        e = c ? parseInt(c, 10) : NaN;
      }
      if (isNaN(e)) {
        throw new BBe("missing_epoch");
      }
      this.workerEpoch = e;
      let n = this.getWorkerState();
      await Promise.race([n.catch(() => null), sleep(1e4)]);
      let r = {
        ok: false
      };
      let o = new Set();
      let s = 10;
      let i = 0;
      for (let c = 1; c <= s; c++) {
        if (i = c, r = await this.request("put", "/worker", {
          worker_status: "idle",
          worker_epoch: this.workerEpoch,
          external_metadata: {
            pending_action: null,
            task_summary: null
          }
        }, "PUT worker (init)"), r.ok || this.closed) {
          break;
        }
        if (r.reason) {
          o.add(r.reason);
        }
        if (this.onDiagnostic?.(`PUT /worker failed (${r.reason ?? "unknown"}) attempt=${c}/${s}, ${Math.round((Date.now() - t) / 1000)}s elapsed`), UBe(r.status)) {
          break;
        }
        if (c < s) {
          let u = Math.min(500 * 2 ** (c - 1), 30000) + Math.random() * 500;
          await sleep(u);
        }
      }
      if (!r.ok) {
        if (!this.closed) {
          wn("error", "cli_worker_init_put_retries_exhausted");
          this.onDiagnostic?.(`PUT /worker retries exhausted: ${i} attempts over ${Math.round((Date.now() - t) / 1000)}s, errors=[${[...o].join(",") || "unknown"}]`);
        }
        throw new BBe("worker_register_failed", r.status);
      }
      this.currentState = "idle";
      this.startHeartbeat();
      S1l(() => {
        this.writeEvent({
          type: "keep_alive"
        });
      });
      logForDebugging(`CCRClient: initialized, epoch=${this.workerEpoch}`);
      wn("info", "cli_worker_lifecycle_initialized", {
        epoch: this.workerEpoch,
        duration_ms: Date.now() - t
      });
      let {
        metadata: a,
        durationMs: l
      } = await n;
      if (!this.closed) {
        wn("info", "cli_worker_state_restored", {
          duration_ms: l,
          had_state: a.external !== null || a.internal !== null
        });
      }
      return a;
    }
    async getWorkerState() {
      let e = Date.now();
      let t = this.getAuthHeaders();
      if (Object.keys(t).length === 0) {
        return {
          metadata: {
            external: null,
            internal: null
          },
          durationMs: 0
        };
      }
      let n = await this.getWithRetry(`${this.sessionBaseUrl}/worker`, t, "worker_state");
      return {
        metadata: {
          external: n?.worker?.external_metadata ?? null,
          internal: n?.worker?.internal_metadata ?? null
        },
        durationMs: Date.now() - e
      };
    }
    async request(e, t, n, r, {
      timeout: o = 1e4
    } = {}) {
      let s = this.getAuthHeaders();
      if (Object.keys(s).length === 0) {
        return {
          ok: false,
          reason: "no_auth_headers"
        };
      }
      let i = `${this.sessionBaseUrl}${t}`;
      try {
        let a = await fetch(i, {
          method: e.toUpperCase(),
          headers: {
            ...s,
            "Content-Type": "application/json",
            "anthropic-version": "2023-06-01",
            "anthropic-client-platform": getClientPlatform(),
            "User-Agent": dg()
          },
          body: De(n),
          signal: AbortSignal.timeout(o),
          ...getProxyFetchOptions({
            url: i
          })
        });
        if (a.body?.cancel(), a.ok) {
          this.consecutiveAuthFailures = 0;
          this.consecutiveNotFound = 0;
          return {
            ok: true
          };
        }
        if (a.status === 409) {
          this.handleEpochMismatch();
        }
        if (a.status === 404) {
          if (this.consecutiveNotFound++, this.consecutiveNotFound >= 3) {
            logForDebugging(`CCRClient: ${this.consecutiveNotFound} consecutive 404s \u2014 session gone, exiting`, {
              level: "error"
            });
            wn("error", "cli_worker_session_not_found");
            this.onDiagnostic?.(`${this.consecutiveNotFound} consecutive 404s on ${t} \u2014 session gone, exiting`);
            this.onEpochMismatch();
          }
        }
        if (a.status === 401 || a.status === 403) {
          let l = cT();
          let c = l ? H1t(l) : null;
          if (c !== null && c * 1000 < Date.now()) {
            logForDebugging(`CCRClient: session_token expired (exp=${new Date(c * 1000).toISOString()}) \u2014 no refresh was delivered, exiting`, {
              level: "error"
            });
            wn("error", "cli_worker_token_expired_no_refresh");
            this.onDiagnostic?.(`session_token expired (exp=${new Date(c * 1000).toISOString()}) \u2014 no refresh delivered, exiting`);
            this.onEpochMismatch();
          }
          if (this.consecutiveAuthFailures++, this.consecutiveAuthFailures >= 10) {
            logForDebugging(`CCRClient: ${this.consecutiveAuthFailures} consecutive auth failures with a valid-looking token \u2014 server-side auth unrecoverable, exiting`, {
              level: "error"
            });
            wn("error", "cli_worker_auth_failures_exhausted");
            this.onDiagnostic?.(`${this.consecutiveAuthFailures} consecutive auth failures (HTTP ${a.status}) with valid-looking token \u2014 exiting`);
            this.onEpochMismatch();
          }
        }
        if (logForDebugging(`CCRClient: ${r} returned ${a.status}`, {
          level: "warn"
        }), wn("warn", "cli_worker_request_failed", {
          method: e,
          path: t,
          status: a.status
        }), a.status === 429) {
          let l = a.headers.get("retry-after");
          let c = l ? parseInt(l, 10) : NaN;
          if (!isNaN(c) && c >= 0) {
            return {
              ok: false,
              retryAfterMs: c * 1000,
              status: a.status,
              reason: `http_${a.status}`
            };
          }
        }
        return {
          ok: false,
          status: a.status,
          reason: `http_${a.status}`
        };
      } catch (a) {
        logForDebugging(`CCRClient: ${r} failed: ${he(a)}`, {
          level: "warn"
        });
        wn("warn", "cli_worker_request_error", {
          method: e,
          path: t,
          error_code: Iwc(a)
        });
        return {
          ok: false,
          reason: `fetch_failed:${Iwc(a)}`
        };
      }
    }
    reportState(e, t) {
      if (e === this.currentState && !t) {
        return;
      }
      this.currentState = e;
      this.workerState.enqueue({
        worker_status: e,
        requires_action_details: t ? {
          tool_name: t.tool_name,
          display_tool_name: t.display_tool_name,
          action_description: t.action_description,
          raw_command: t.raw_command,
          request_id: t.request_id,
          tool_use_id: t.tool_use_id
        } : null
      });
    }
    reportMetadata(e) {
      this.workerState.enqueue({
        external_metadata: Cvf(e)
      });
    }
    reportInternalMetadata(e) {
      this.workerState.enqueue({
        internal_metadata: e
      });
    }
    handleEpochMismatch() {
      logForDebugging("CCRClient: Epoch mismatch (409), shutting down", {
        level: "error"
      });
      wn("error", "cli_worker_epoch_mismatch");
      this.onDiagnostic?.(`worker epoch mismatch (409), epoch=${this.workerEpoch} \u2014 superseded by a newer worker, exiting`);
      this.onEpochMismatch();
    }
    startHeartbeat() {
      this.stopHeartbeat();
      let e = () => {
        let n = this.heartbeatIntervalMs * this.heartbeatJitterFraction * (2 * Math.random() - 1);
        this.heartbeatTimer = setTimeout(t, this.heartbeatIntervalMs + n);
      };
      let t = () => {
        if (this.sendHeartbeat(), this.heartbeatTimer === null) {
          return;
        }
        e();
      };
      e();
    }
    stopHeartbeat() {
      if (this.heartbeatTimer) {
        clearTimeout(this.heartbeatTimer);
        this.heartbeatTimer = null;
      }
    }
    async sendHeartbeat() {
      if (this.heartbeatInFlight) {
        return;
      }
      this.heartbeatInFlight = true;
      try {
        if ((await this.request("post", "/worker/heartbeat", {
          session_id: this.sessionId,
          worker_epoch: this.workerEpoch
        }, "Heartbeat", {
          timeout: 5000
        })).ok) {
          logForDebugging("CCRClient: Heartbeat sent");
        }
      } finally {
        this.heartbeatInFlight = false;
      }
    }
    async writeEvent(e) {
      if (e.type === "stream_event") {
        if (this.streamEventBuffer.push(e), this.streamedEphemeralSinceLastAssistant = true, !this.streamEventTimer) {
          this.streamEventTimer = setTimeout(() => void this.flushStreamEventBuffer(), 100);
        }
        return;
      }
      if (await this.flushStreamEventBuffer(), e.type === "assistant" && this.streamedEphemeralSinceLastAssistant) {
        Pe("ccr_partial_messages");
        this.streamedEphemeralSinceLastAssistant = false;
      }
      await this.eventUploader.enqueue(this.toClientEvent(e));
    }
    toClientEvent(e) {
      let t = e;
      let n = t.historical === true;
      let r = e.type === "system" && t.subtype === "thinking_tokens";
      return {
        payload: {
          ...t,
          uuid: typeof t.uuid === "string" ? t.uuid : MJo.randomUUID()
        },
        ...(n && {
          historical: true
        }),
        ...(r && {
          ephemeral: true
        })
      };
    }
    async flushStreamEventBuffer() {
      if (this.streamEventTimer) {
        clearTimeout(this.streamEventTimer);
        this.streamEventTimer = null;
      }
      if (this.streamEventBuffer.length === 0) {
        return;
      }
      let e = this.streamEventBuffer;
      this.streamEventBuffer = [];
      let t = e.filter(n => {
        if (Buffer.byteLength(De(n)) <= 61440) {
          return true;
        }
        logForDebugging(`CCRClient: dropping oversize ephemeral stream_event (>${61440} bytes)`, {
          level: "warn"
        });
        Et("ccr_partial_messages", "oversize_ephemeral_skipped");
        return false;
      });
      await this.eventUploader.enqueue(t.map(n => ({
        payload: n,
        ephemeral: true
      })));
    }
    async writeInternalEvent(e, t, {
      isCompaction: n = false,
      agentId: r,
      preservedEventIds: o
    } = {}) {
      let s = o;
      if (s && s.length > 1536) {
        logEvent("tengu_ccr_preserved_event_ids_clamped", {
          originalCount: s.length,
          cap: 1536
        });
        s = s.slice(-1536);
      }
      let i = {
        payload: {
          type: e,
          ...t,
          uuid: typeof t.uuid === "string" ? t.uuid : MJo.randomUUID()
        },
        ...(n && {
          is_compaction: true
        }),
        ...(r && {
          session_agent_id: r
        }),
        ...(s?.length && {
          preserved_event_ids: s
        })
      };
      await this.internalEventUploader.enqueue(i);
    }
    flushInternalEvents() {
      return this.internalEventUploader.flush();
    }
    flushDeliveryAcks() {
      return this.deliveryUploader.flush();
    }
    async flush() {
      await this.flushStreamEventBuffer();
      return this.eventUploader.flush();
    }
    droppedDurableEventBatches = 0;
    get droppedDurableBatches() {
      return this.droppedDurableEventBatches;
    }
    async flushWorkerState() {
      return this.workerState.flush();
    }
    async readInternalEvents(e) {
      return this.paginatedGet("/worker/internal-events", {
        limit: "1000",
        ...(e && {
          after_event_id: e
        })
      }, "internal_events");
    }
    async readSubagentInternalEvents() {
      return this.paginatedGet("/worker/internal-events", {
        subagents: "true",
        limit: "1000"
      }, "subagent_events");
    }
    async paginatedGet(e, t, n) {
      let r = this.getAuthHeaders();
      if (Object.keys(r).length === 0) {
        return null;
      }
      let o = [];
      let s;
      let i = 0;
      let a = 0;
      let l = null;
      do {
        let c = new URL(`${this.sessionBaseUrl}${e}`);
        for (let [m, f] of Object.entries(t)) {
          c.searchParams.set(m, f);
        }
        if (s) {
          c.searchParams.set("cursor", s);
          c.searchParams.delete("after_event_id");
        }
        let u = !s && t.after_event_id !== undefined;
        let d;
        let p = await this.getWithRetry(c.toString(), r, n, m => {
          i++;
          l ??= m.headers.get("content-encoding");
          let f = m.headers.get("content-length");
          if (f !== null && a !== null) {
            a += Number(f);
          } else {
            a = null;
          }
        }, (m, f) => {
          if (!u) {
            return;
          }
          if (m === 400) {
            d = "rejected";
          } else if (f === "after_event_id_not_found") {
            d = "not-found";
          }
        });
        if (!p) {
          if (d) {
            logForDebugging(`CCRClient: after_event_id ${d === "rejected" ? "rejected by server (gate off)" : "not found (stale anchor)"} \u2014 refetching without anchor`, {
              level: "warn"
            });
            wn("warn", d === "rejected" ? "cli_worker_after_event_id_rejected" : "cli_worker_after_event_id_not_found", {
              context: n
            });
            let {
              after_event_id: m,
              ...f
            } = t;
            let h = await this.paginatedGet(e, f, n);
            if (!h) {
              return null;
            }
            return {
              ...h,
              anchorFallback: d
            };
          }
          return null;
        }
        o.push(...(p.data ?? []));
        s = p.next_cursor;
      } while (s);
      logForDebugging(`CCRClient: Read ${o.length} internal events from ${e}${t.subagents ? " (subagents)" : ""}`);
      return {
        events: o,
        stats: {
          pageCount: i,
          bytesReceived: a,
          contentEncoding: l ?? "none"
        }
      };
    }
    async getWithRetry(e, t, n, r, o) {
      for (let s = 1; s <= 10; s++) {
        let i;
        try {
          if (i = await fetch(e, {
            headers: {
              ...t,
              "anthropic-version": "2023-06-01",
              "anthropic-client-platform": getClientPlatform(),
              "User-Agent": dg()
            },
            signal: AbortSignal.timeout(30000),
            ...getProxyFetchOptions({
              url: e
            })
          }), i.ok) {
            let l = await i.json();
            r?.(i);
            return l;
          }
        } catch (l) {
          if (logForDebugging(`CCRClient: GET ${e} failed (attempt ${s}/10): ${he(l)}`, {
            level: "warn"
          }), s < 10) {
            let c = Math.min(500 * 2 ** (s - 1), 30000) + Math.random() * 500;
            await sleep(c);
          }
          continue;
        }
        let a;
        if (i.status === 404 && o) {
          try {
            let l = await i.json();
            if (typeof l?.error?.type === "string") {
              a = l.error.type;
            }
          } catch {}
        } else {
          i.body?.cancel();
        }
        if (i.status === 409) {
          this.handleEpochMismatch();
        }
        if (UBe(i.status) || a === "after_event_id_not_found") {
          logForDebugging(`CCRClient: GET ${e} returned ${i.status} \u2014 permanent, not retrying`, {
            level: "warn"
          });
          o?.(i.status, a);
          return null;
        }
        if (logForDebugging(`CCRClient: GET ${e} returned ${i.status} (attempt ${s}/10)`, {
          level: "warn"
        }), s < 10) {
          let l = Math.min(500 * 2 ** (s - 1), 30000) + Math.random() * 500;
          await sleep(l);
        }
      }
      logForDebugging("CCRClient: GET retries exhausted", {
        level: "error"
      });
      wn("error", "cli_worker_get_retries_exhausted", {
        context: n
      });
      return null;
    }
    reportDelivery(e, t) {
      if (t === "processing") {
        if (this.closed) {
          return;
        }
        if (this.pendingProcessingAcks.push(e) === 1) {
          queueMicrotask(() => {
            let n = this.pendingProcessingAcks;
            if (this.pendingProcessingAcks = [], this.closed || n.length === 0) {
              return;
            }
            this.request("post", "/worker/events/delivery", {
              worker_epoch: this.workerEpoch,
              updates: n.map(r => ({
                event_id: r,
                status: "processing"
              }))
            }, "processing ack");
          });
        }
        return;
      }
      this.deliveryUploader.enqueue({
        eventId: e,
        status: t
      });
    }
    getWorkerEpoch() {
      return this.workerEpoch;
    }
    get internalEventsPending() {
      return this.internalEventUploader.pendingCount;
    }
    close() {
      if (this.closed = true, this.stopHeartbeat(), T1l(), this.streamEventTimer) {
        clearTimeout(this.streamEventTimer);
        this.streamEventTimer = null;
      }
      this.streamEventBuffer = [];
      this.pendingProcessingAcks = [];
      this.workerState.close();
      this.eventUploader.close();
      this.internalEventUploader.close();
      this.deliveryUploader.close();
    }
  }
  function Cvf(e) {
    let t = e.post_turn_summary;
    if (!Rvf(t) || t.status_category !== "blocked") {
      return e;
    }
    return {
      ...e,
      post_turn_summary: {
        ...t,
        status_category: "need_input"
      }
    };
  }
  function Rvf(e) {
    return e !== null && typeof e === "object" && "status_category" in e && typeof e.status_category === "string";
  }
  var MJo;
  var BBe;
  var NJo = __lazy(() => {
    Aot();
    ln();
    Ot();
    je();
    Zm();
    dt();
    Fh();
    g7e();
    e1();
    Rwc();
    kwc();
    MJo = require("crypto");
    BBe = class BBe extends Error {
      reason;
      httpStatus;
      constructor(e, t) {
        super(`CCRClient init failed: ${e}`);
        this.reason = e;
        this.httpStatus = t;
      }
    };
  });
  function brn(e) {
    let t = [];
    let n = 0;
    let r;
    while ((r = e.indexOf(`

`, n)) !== -1) {
      let o = e.slice(n, r);
      if (n = r + 2, !o.trim()) {
        continue;
      }
      let s = {};
      let i = false;
      for (let a of o.split(`
`)) {
        if (a.startsWith(":")) {
          i = true;
          continue;
        }
        let l = a.indexOf(":");
        if (l === -1) {
          continue;
        }
        let c = a.slice(0, l);
        let u = a[l + 1] === " " ? a.slice(l + 2) : a.slice(l + 1);
        switch (c) {
          case "event":
            s.event = u;
            break;
          case "id":
            s.id = u;
            break;
          case "data":
            s.data = s.data ? s.data + `
` + u : u;
            break;
        }
      }
      if (s.data || i) {
        t.push(s);
      }
    }
    return {
      frames: t,
      remaining: e.slice(n)
    };
  }
  function Dvf() {
    return true;
  }
  function Mvf(e) {
    let t = e.pathname;
    if (t.endsWith("/stream")) {
      t = t.slice(0, -7);
    }
    return `${e.protocol}//${e.host}${t}`;
  }
  var Avf;
  var Ovf;
  var Trn;
  var LJo = __lazy(() => {
    Dp();
    je();
    Zm();
    dt();
    e1();
    R3();
    Avf = new Set([401, 403, 404]);
    Ovf = {
      stream: true
    };
    Trn = class Trn {
      url;
      state = "idle";
      onData;
      onCloseCallback;
      onEventCallback;
      eventFilter;
      onDiagnostic;
      headers;
      sessionId;
      refreshHeaders;
      getAuthHeaders;
      abortController = null;
      lastSequenceNum = 0;
      seenSequenceNums = new Set();
      reconnectAttempts = 0;
      reconnectStartTime = null;
      reconnectTimer = null;
      connectErrorsSeen = new Set();
      livenessTimer = null;
      postUrl;
      constructor(e, t = {}, n, r, o, s) {
        this.url = e;
        if (this.headers = t, this.sessionId = n, this.refreshHeaders = r, this.getAuthHeaders = s ?? CIe, this.postUrl = Mvf(e), o !== undefined && o > 0) {
          this.lastSequenceNum = o;
        }
        logForDebugging(`SSETransport: SSE URL = ${e.href}`);
        logForDebugging(`SSETransport: POST URL = ${this.postUrl}`);
        wn("info", "cli_sse_transport_initialized");
      }
      getLastSequenceNum() {
        return this.lastSequenceNum;
      }
      async connect() {
        if (this.state !== "idle" && this.state !== "reconnecting") {
          logForDebugging(`SSETransport: Cannot connect, current state is ${this.state}`, {
            level: "error"
          });
          wn("error", "cli_sse_connect_failed");
          return;
        }
        this.state = "reconnecting";
        let e = Date.now();
        let t = new URL(this.url.href);
        if (this.lastSequenceNum > 0) {
          t.searchParams.set("from_sequence_num", String(this.lastSequenceNum));
        }
        let n = this.getAuthHeaders();
        let r = {
          ...this.headers,
          ...n,
          Accept: "text/event-stream",
          "anthropic-version": "2023-06-01",
          "anthropic-client-platform": getClientPlatform(),
          "User-Agent": dg()
        };
        if (n.Cookie) {
          delete r.Authorization;
        }
        if (this.lastSequenceNum > 0) {
          r["Last-Event-ID"] = String(this.lastSequenceNum);
        }
        logForDebugging(`SSETransport: Opening ${t.href}`);
        wn("info", "cli_sse_connect_opening");
        this.abortController = new AbortController();
        try {
          let o = await fetch(t.href, {
            headers: r,
            signal: this.abortController.signal
          });
          if (!o.ok) {
            let i = Avf.vZc(o.status);
            if (logForDebugging(`SSETransport: HTTP ${o.status}${i ? " (permanent)" : ""}`, {
              level: "error"
            }), wn("error", "cli_sse_connect_http_error", {
              status: o.status
            }), this.connectErrorsSeen.add(`http_${o.status}`), this.diagConnectFailure(`HTTP ${o.status}${i ? " (permanent)" : ""}`, e), i) {
              this.state = "closed";
              this.onCloseCallback?.(o.status);
              return;
            }
            this.handleConnectionError();
            return;
          }
          if (!o.body) {
            logForDebugging("SSETransport: No response body");
            this.connectErrorsSeen.add("no_response_body");
            this.diagConnectFailure("no response body", e);
            this.handleConnectionError();
            return;
          }
          let s = Date.now() - e;
          if (logForDebugging("SSETransport: Connected"), wn("info", "cli_sse_connect_connected", {
            duration_ms: s
          }), this.reconnectAttempts === 0) {
            au("sse_connect_ms", s, e - performance.timeOrigin);
          }
          if (this.reconnectAttempts > 0) {
            let i = this.reconnectStartTime ? Math.round((Date.now() - this.reconnectStartTime) / 1000) : 0;
            this.onDiagnostic?.(`SSE reconnected after ${this.reconnectAttempts} attempt(s), ${i}s downtime` + (this.connectErrorsSeen.size > 0 ? `, errors=[${[...this.connectErrorsSeen].join(",")}]` : ""));
          } else {
            this.onDiagnostic?.(`SSE connected in ${s}ms`);
          }
          this.connectErrorsSeen.clear();
          this.state = "connected";
          this.reconnectAttempts = 0;
          this.reconnectStartTime = null;
          this.resetLivenessTimer();
          await this.readStream(o.body);
        } catch (o) {
          if (this.abortController?.signal.aborted) {
            return;
          }
          logForDebugging(`SSETransport: Connection error: ${he(o)}`, {
            level: "error"
          });
          wn("error", "cli_sse_connect_error");
          this.connectErrorsSeen.add("fetch_failed");
          this.diagConnectFailure(he(o), e);
          this.handleConnectionError();
        }
      }
      diagConnectFailure(e, t) {
        if (!this.onDiagnostic) {
          return;
        }
        let n = this.reconnectAttempts + 1;
        if (n > 3 && n % 10 !== 0) {
          return;
        }
        let r = Date.now() - t;
        let o = this.reconnectStartTime ? `, ${Math.round((Date.now() - this.reconnectStartTime) / 1000)}s reconnecting` : "";
        let s = this.connectErrorsSeen.size > 1 ? `, errors=[${[...this.connectErrorsSeen].join(",")}]` : "";
        this.onDiagnostic(`SSE connect failed (${e}) attempt=${n} took=${r}ms${o}${s}`);
      }
      async readStream(e) {
        let t = e.getReader();
        let n = new TextDecoder();
        let r = [];
        let o = false;
        try {
          while (true) {
            let {
              done: s,
              value: i
            } = await t.read();
            if (s) {
              break;
            }
            let a = n.oC(i, Ovf);
            if (!a) {
              continue;
            }
            let l = o && a[0] === `
` || a.includes(`

`);
            if (r.push(a), !l) {
              o = a.endsWith(`
`);
              continue;
            }
            let {
              frames: c,
              remaining: u
            } = brn(r.join(""));
            r = u ? [u] : [];
            o = u.endsWith(`
`);
            for (let d of c) {
              if (this.resetLivenessTimer(), d.id) {
                let p = parseInt(d.id, 10);
                if (!isNaN(p)) {
                  if (this.seenSequenceNums.vZc(p)) {
                    logForDebugging(`SSETransport: DUPLICATE frame seq=${p} (lastSequenceNum=${this.lastSequenceNum}, seenCount=${this.seenSequenceNums.size})`, {
                      level: "warn"
                    });
                    wn("warn", "cli_sse_duplicate_sequence");
                  } else if (this.seenSequenceNums.add(p), this.seenSequenceNums.size > 1000) {
                    let m = this.lastSequenceNum - 200;
                    for (let f of this.seenSequenceNums) {
                      if (f < m) {
                        this.seenSequenceNums.delete(f);
                      }
                    }
                  }
                  if (p > this.lastSequenceNum) {
                    this.lastSequenceNum = p;
                  }
                }
              }
              if (d.event && d.data) {
                this.handleSSEFrame(d.event, d.data);
              } else if (d.data) {
                logForDebugging("SSETransport: Frame has data: but no event: field \u2014 dropped", {
                  level: "warn"
                });
                wn("warn", "cli_sse_frame_missing_event_field");
              }
            }
          }
        } catch (s) {
          if (this.abortController?.signal.aborted) {
            return;
          }
          logForDebugging(`SSETransport: Stream read error: ${he(s)}`, {
            level: "error"
          });
          wn("error", "cli_sse_stream_read_error");
        } finally {
          t.releaseLock();
        }
        if (this.state !== "closing" && this.state !== "closed") {
          if (logForDebugging("SSETransport: Stream ended, reconnecting"), this.state === "connected") {
            this.connectErrorsSeen.add("stream_ended");
            this.onDiagnostic?.("SSE stream ended by server, reconnecting");
          }
          this.handleConnectionError();
        }
      }
      handleSSEFrame(e, t) {
        if (e !== "client_event") {
          logForDebugging(`SSETransport: Unexpected SSE event type '${e}' on worker stream`, {
            level: "warn"
          });
          wn("warn", "cli_sse_unexpected_event_type", {
            event_type: e
          });
          return;
        }
        let n;
        try {
          n = qt(t);
        } catch (o) {
          logForDebugging(`SSETransport: Failed to parse client_event data: ${he(o)}`, {
            level: "error"
          });
          return;
        }
        let r = n.payload;
        if (r && typeof r === "object" && "type" in r) {
          let o = this.sessionId ? ` session=${this.sessionId}` : "";
          let s = n.device_attestation_status ? ` attestation=${n.device_attestation_status}` : "";
          if (logForDebugging(`SSETransport: Event seq=${n.sequence_num} event_id=${n.event_id} event_type=${n.event_type} payload_type=${String(r.type)}${s}${o}`), wn("info", "cli_sse_message_received"), this.eventFilter?.(n)) {
            wn("warn", "cli_sse_event_filtered");
          } else {
            this.onData?.(De(r) + `
`);
          }
        } else {
          logForDebugging(`SSETransport: Ignoring client_event with no type in payload: event_id=${n.event_id}`);
        }
        this.onEventCallback?.(n);
      }
      handleConnectionError() {
        if (this.clearLivenessTimer(), this.state === "closing" || this.state === "closed") {
          return;
        }
        this.abortController?.abort();
        this.abortController = null;
        let e = Date.now();
        if (!this.reconnectStartTime) {
          this.reconnectStartTime = e;
        }
        let t = e - this.reconnectStartTime;
        if (this.reconnectTimer) {
          clearTimeout(this.reconnectTimer);
          this.reconnectTimer = null;
        }
        if (this.refreshHeaders) {
          let o = this.refreshHeaders();
          Object.assign(this.headers, o);
          logForDebugging("SSETransport: Refreshed headers for reconnect");
        }
        this.state = "reconnecting";
        this.reconnectAttempts++;
        let n = Math.min(1000 * Math.pow(2, this.reconnectAttempts - 1), 30000);
        let r = Math.max(0, n + n * 0.25 * (2 * Math.random() - 1));
        logForDebugging(`SSETransport: Reconnecting in ${Math.round(r)}ms (attempt ${this.reconnectAttempts}, ${Math.round(t / 1000)}s elapsed)`);
        wn("error", "cli_sse_reconnect_attempt", {
          reconnectAttempts: this.reconnectAttempts
        });
        this.reconnectTimer = setTimeout(() => {
          this.reconnectTimer = null;
          this.connect();
        }, r);
      }
      onLivenessTimeout = () => {
        this.livenessTimer = null;
        logForDebugging("SSETransport: Liveness timeout, reconnecting", {
          level: "error"
        });
        wn("error", "cli_sse_liveness_timeout");
        this.connectErrorsSeen.add("liveness_timeout");
        this.onDiagnostic?.(`SSE liveness timeout \u2014 no frame in ${45000 / 1000}s, reconnecting`);
        this.abortController?.abort();
        this.handleConnectionError();
      };
      resetLivenessTimer() {
        this.clearLivenessTimer();
        this.livenessTimer = setTimeout(this.onLivenessTimeout, 45000);
      }
      clearLivenessTimer() {
        if (this.livenessTimer) {
          clearTimeout(this.livenessTimer);
          this.livenessTimer = null;
        }
      }
      async write(e) {
        let t = this.getAuthHeaders();
        if (Object.keys(t).length === 0) {
          logForDebugging("SSETransport: No session token available for POST");
          wn("warn", "cli_sse_post_no_token");
          return;
        }
        let n = {
          ...t,
          "Content-Type": "application/json",
          "anthropic-version": "2023-06-01",
          "anthropic-client-platform": getClientPlatform(),
          "User-Agent": dg()
        };
        logForDebugging(`SSETransport: POST body keys=${Object.keys(e).join(",")}`);
        for (let r = 1; r <= 10; r++) {
          try {
            let s = await NP.post(this.postUrl, e, {
              headers: n,
              validateStatus: Dvf
            });
            if (s.status === 200 || s.status === 201) {
              logForDebugging(`SSETransport: POST success type=${e.type}`);
              return;
            }
            if (logForDebugging(`SSETransport: POST ${s.status} body=${De(s.data).slice(0, 200)}`), s.status >= 400 && s.status < 500 && s.status !== 429) {
              logForDebugging(`SSETransport: POST returned ${s.status} (client error), not retrying`);
              wn("warn", "cli_sse_post_client_error", {
                status: s.status
              });
              return;
            }
            logForDebugging(`SSETransport: POST returned ${s.status}, attempt ${r}/${10}`);
            wn("warn", "cli_sse_post_retryable_error", {
              status: s.status,
              attempt: r
            });
          } catch (s) {
            logForDebugging(`SSETransport: POST error: ${he(s)}, attempt ${r}/${10}`);
            wn("warn", "cli_sse_post_network_error", {
              attempt: r
            });
          }
          if (r === 10) {
            logForDebugging(`SSETransport: POST failed after ${10} attempts, continuing`);
            wn("warn", "cli_sse_post_retries_exhausted");
            return;
          }
          let o = Math.min(500 * Math.pow(2, r - 1), 8000);
          await sleep(o);
        }
      }
      isConnectedStatus() {
        return this.state === "connected";
      }
      isClosedStatus() {
        return this.state === "closed";
      }
      setOnData(e) {
        this.onData = e;
      }
      setOnClose(e) {
        this.onCloseCallback = e;
      }
      setOnEvent(e) {
        this.onEventCallback = e;
      }
      setOnDiagnostic(e) {
        this.onDiagnostic = e;
      }
      setEventFilter(e) {
        this.eventFilter = e;
      }
      close() {
        if (this.reconnectTimer) {
          clearTimeout(this.reconnectTimer);
          this.reconnectTimer = null;
        }
        this.clearLivenessTimer();
        this.state = "closing";
        this.abortController?.abort();
        this.abortController = null;
      }
      [Symbol.dispose]() {
        this.close();
      }
    };
  });
  function Dwc(e) {
    switch (e) {
      case undefined:
        return "no close code received";
      case 4090:
        return "this connection is no longer the active worker for the session (code 4090)";
      case 4091:
        return "transport init failed (code 4091)";
      case 4092:
        return "connection dropped \u2014 no close reason from server (code 4092)";
      case 401:
        return "auth token expired (code 401)";
      case 403:
        return "server rejected connection (code 403)";
      case 404:
        return "session not found on server (code 404)";
      case 1002:
        return "server rejected the connection handshake (code 1002)";
      case 4001:
        return "session expired or not found on server (code 4001)";
      case 4003:
        return "server rejected credentials (code 4003)";
      default:
        return `code ${e}`;
    }
  }
  async function FJo(e) {
    let {
      sessionUrl: t,
      ingressToken: n,
      sessionId: r,
      initialSequenceNum: o,
      getAuthToken: s
    } = e;
    let i;
    if (s) {
      i = () => {
        let h = s();
        if (!h) {
          return {};
        }
        return {
          Authorization: `Bearer ${h}`
        };
      };
    } else {
      xji(n);
    }
    let a = e.epoch ?? (await Pdr(t, n));
    logForDebugging(`[bridge:repl] CCR v2: worker sessionId=${r} epoch=${a}${e.epoch !== undefined ? " (from /bridge)" : " (via registerWorker)"}`);
    let l = new URL(t);
    l.pathname = l.pathname.replace(/\/$/, "") + "/worker/events/stream";
    let c = new Trn(l, {}, r, undefined, o, i);
    let u;
    let d = new _rn(c, new URL(t), {
      getAuthHeaders: i,
      heartbeatIntervalMs: e.heartbeatIntervalMs,
      heartbeatJitterFraction: e.heartbeatJitterFraction,
      onEpochMismatch: () => {
        logForDebugging("[bridge:repl] CCR v2: epoch superseded (409) \u2014 closing for poll-loop recovery");
        try {
          d.close();
          c.close();
          u?.(4090);
        } catch (h) {
          logForDebugging(`[bridge:repl] CCR v2: error during epoch-mismatch cleanup: ${he(h)}`, {
            level: "error"
          });
        }
        throw Error("epoch superseded");
      }
    });
    c.setOnEvent(h => {
      d.reportDelivery(h.event_id, "received");
      d.reportDelivery(h.event_id, "processed");
    });
    c.setEventFilter(C5n);
    let p;
    let m = false;
    let f = false;
    return {
      write(h) {
        return d.writeEvent(h);
      },
      async writeBatch(h) {
        for (let g of h) {
          if (f) {
            break;
          }
          await d.writeEvent(g);
        }
      },
      close() {
        f = true;
        d.close();
        c.close();
      },
      isConnectedStatus() {
        return m;
      },
      getStateLabel() {
        if (c.isClosedStatus()) {
          return "closed";
        }
        if (c.isConnectedStatus()) {
          return m ? "connected" : "init";
        }
        return "connecting";
      },
      setOnData(h) {
        c.setOnData(h);
      },
      setOnClose(h) {
        u = h;
        c.setOnClose(g => {
          d.close();
          h(g ?? 4092);
        });
      },
      setOnConnect(h) {
        p = h;
      },
      getLastSequenceNum() {
        return c.getLastSequenceNum();
      },
      getEpoch() {
        return a;
      },
      droppedBatchCount: 0,
      reportState(h, g) {
        d.reportState(h, g);
      },
      reportMetadata(h) {
        d.reportMetadata(h);
      },
      reportDelivery(h, g) {
        d.reportDelivery(h, g);
      },
      flush() {
        return d.flush();
      },
      getInternalEventWriter() {
        return (h, g, y) => d.writeInternalEvent(h, g, y);
      },
      getInternalEventReaders() {
        return {
          readMain: () => d.readInternalEvents(),
          readSubagents: () => d.readSubagentInternalEvents()
        };
      },
      connect() {
        if (!e.outboundOnly) {
          c.connect();
        }
        d.initialize(a).then(() => {
          m = true;
          logForDebugging(`[bridge:repl] v2 transport ready for writes (epoch=${a}, sse=${c.isConnectedStatus() ? "open" : "opening"})`);
          p?.();
        }, h => {
          logForDebugging(`[bridge:repl] CCR v2 initialize failed: ${he(h)}`, {
            level: "error"
          });
          d.close();
          c.close();
          u?.(4091);
        });
      }
    };
  }
  var Mwc = __lazy(() => {
    NJo();
    LJo();
    je();
    dt();
    e1();
    k8e();
    Odr();
  });
  function Nwc(e) {
    return {
      Authorization: `Bearer ${e}`,
      "Content-Type": "application/json",
      "anthropic-version": "2023-06-01",
      "User-Agent": dg()
    };
  }
  async function UJo(e, t, n, r, o, s, i, a) {
    let l = `${e}/v1/code/sessions`;
    let c = {
      cwd: i ?? Nt(),
      ...(a && {
        model: a
      })
    };
    if (s) {
      let {
        buildGitSessionContext: p
      } = await Promise.resolve().then(() => (NBo(), aLl));
      let {
        sources: m,
        outcomes: f
      } = await p(s.gitRepoUrl, s.branch, s.defaultBranch);
      if (m.length > 0 || f.length > 0) {
        c.sources = m;
        c.outcomes = f;
        c.reuse_outcome_branches = true;
      }
    }
    let u;
    try {
      u = await NP.post(l, {
        title: n,
        bridge: {},
        ...(o?.length && {
          tags: o
        }),
        config: c
      }, {
        headers: Nwc(t),
        timeout: r,
        validateStatus: p => p < 500
      });
    } catch (p) {
      logForDebugging(`[code-session] Session create request failed: ${he(p)}`);
      return null;
    }
    if (u.status !== 200 && u.status !== 201) {
      let p = vQ(u.data);
      logForDebugging(`[code-session] Session create failed ${u.status}${p ? `: ${p}` : ""}`);
      return null;
    }
    let d = u.data;
    if (!d || typeof d !== "object" || !("session" in d) || !d.session || typeof d.session !== "object" || !("id" in d.session) || typeof d.session.id !== "string" || !d.session.id.startsWith("cse_")) {
      logForDebugging(`[code-session] No session.id (cse_*) in response: ${De(d).slice(0, 200)}`);
      return null;
    }
    return d.session.id;
  }
  function qRt(e) {
    return e !== null && "terminal" in e;
  }
  function Lvf(e, t) {
    if (e !== null && typeof e === "object" && "error" in e && e.error !== null && typeof e.error === "object" && "resource" in e.error) {
      let n = e.error.resource;
      if (n === "untrusted_device" || n === "session_stale_relogin") {
        return n;
      }
      return;
    }
    if (t?.includes("trusted device")) {
      return "untrusted_device";
    }
    return;
  }
  async function BJo(e, t, n, r, o) {
    let s = `${t}/v1/code/sessions/${e}/bridge`;
    let i = Nwc(n);
    if (o) {
      i["X-Trusted-Device-Token"] = o;
    }
    let a;
    try {
      a = await NP.post(s, {}, {
        headers: i,
        timeout: r,
        validateStatus: d => d < 500
      });
    } catch (d) {
      logForDebugging(`[code-session] /bridge request failed: ${he(d)}`);
      return null;
    }
    if (a.status !== 200) {
      let d = vQ(a.data);
      if (logForDebugging(`[code-session] /bridge failed ${a.status}${d ? `: ${d}` : ""}`), a.status === 403) {
        let p = Lvf(a.data, d);
        if (p) {
          return {
            terminal: true,
            reason: p
          };
        }
      }
      return null;
    }
    let l = a.data;
    if (l === null || typeof l !== "object" || !("worker_jwt" in l) || typeof l.worker_jwt !== "string" || !("expires_in" in l) || typeof l.expires_in !== "number" || !("api_base_url" in l) || typeof l.api_base_url !== "string" || !("worker_epoch" in l)) {
      logForDebugging(`[code-session] /bridge response malformed (need worker_jwt, expires_in, api_base_url, worker_epoch): ${De(l).slice(0, 200)}`);
      return null;
    }
    let c = l.worker_epoch;
    let u = typeof c === "string" ? Number(c) : c;
    if (typeof u !== "number" || !Number.isFinite(u) || !Number.isSafeInteger(u)) {
      logForDebugging(`[code-session] /bridge worker_epoch invalid: ${De(c)}`);
      return null;
    }
    return {
      worker_jwt: l.worker_jwt,
      api_base_url: l.api_base_url,
      expires_in: l.expires_in,
      worker_epoch: u
    };
  }
  var $Jo = __lazy(() => {
    Dp();
    vo();
    je();
    dt();
    Ipe();
  });
  function Lwc(e) {
    return {
      Authorization: `Bearer ${e}`,
      "Content-Type": "application/json",
      "anthropic-version": "2023-06-01",
      "anthropic-client-platform": getClientPlatform(),
      "User-Agent": dg()
    };
  }
  async function Fwc(e) {
    let {
      baseUrl: t,
      orgUUID: n,
      title: r,
      getAccessToken: o,
      onAuth401: s,
      onReadFreshOAuthToken: i,
      onProactiveRefresh: a,
      toSDKMessages: l,
      initialHistoryCap: c,
      initialMessages: u,
      onInboundMessage: d,
      onUserMessage: p,
      onSessionEstablished: m,
      onBeforePushTriggeringState: f,
      onPermissionResponse: h,
      onInterrupt: g,
      getInitializeState: y,
      onDialogKindsDeclared: _,
      onSetModel: b,
      onSetMaxThinkingTokens: S,
      onSetPermissionMode: E,
      onRenameSession: C,
      onSetColor: x,
      onFileSuggestions: A,
      onReadFile: k,
      onGetContextUsage: I,
      onGetUsage: O,
      onMcpAuthenticate: M,
      onMcpOauthCallbackUrl: L,
      onMcpReconnect: P,
      onMcpStatus: F,
      onStateChange: H,
      outboundOnly: U,
      tags: N,
      gitRepoUrl: W = null,
      branch: j = "",
      onTransportPersistenceReady: z,
      onTransportPersistenceTeardown: V,
      reattachSessionId: K,
      reattachSequenceNum: J,
      livePreviewPorts: Q
    } = e;
    let Z = !!K;
    let ne = await Y6o();
    let oe = o();
    if (!oe) {
      logForDebugging("[remote-bridge] No OAuth token");
      Ae("bridge_connect", "bridge_connect_no_token");
      return null;
    }
    let ee = () => o() ?? oe;
    let {
      getOriginalCwd: re
    } = await Promise.resolve().then(() => (at(), dxe));
    let {
      getMainLoopModel: se
    } = await Promise.resolve().then(() => (Eo(), JCn));
    async function ae() {
      let Ee = await XJe(() => UJo(t, ee(), r, ne.http_timeout_ms, N, W ? {
        gitRepoUrl: W,
        branch: j
      } : undefined, re(), se()), "createCodeSession", ne);
      if (Ee) {
        logForDebugging(`[remote-bridge] Created session ${Ee}`);
        wn("info", "bridge_repl_v2_session_created");
      }
      return Ee;
    }
    let de;
    if (K) {
      de = K;
      logForDebugging(`[remote-bridge] Reattaching to session ${de}`);
      wn("info", "bridge_repl_v2_session_reattached");
      await XJe(() => Uvf(de, t, ee(), n, ne.http_timeout_ms), "unarchiveSession", ne);
    } else {
      let Ee = await ae();
      if (!Ee) {
        H?.("failed", "Session creation failed \u2014 see debug log");
        wQ("v2_session_create_failed", undefined, true);
        Ae("bridge_connect", "bridge_connect_session_create_failed");
        return null;
      }
      de = Ee;
    }
    let be = await XJe(() => vrn(de, t, ee(), ne.http_timeout_ms), "fetchRemoteCredentials", ne);
    if (Z && be === null) {
      logForDebugging(`[remote-bridge] Reattach to ${de} failed; falling back to fresh session`);
      wn("info", "bridge_repl_v2_reattach_fallback");
      let Ee = await ae();
      if (Ee) {
        de = Ee;
        Z = false;
        be = await XJe(() => vrn(de, t, ee(), ne.http_timeout_ms), "fetchRemoteCredentials (post-fallback)", ne);
      }
    }
    if (!be || qRt(be)) {
      let Ee = be ? HJo(be) : "Remote credentials fetch failed \u2014 see debug log";
      if (logForDebugging(`[remote-bridge] Creds failed; onStateChange ${H ? "set" : "UNSET"}, msg="${Ee}"`), H?.("failed", Ee), wQ(be ? `v2_remote_creds_${be.reason}` : "v2_remote_creds_failed", undefined, true), Ae("bridge_connect", "bridge_connect_creds_failed"), !Z) {
        wrn(de, t, ee(), n, ne.http_timeout_ms);
      }
      return null;
    }
    logForDebugging(`[remote-bridge] Fetched bridge credentials (expires_in=${be.expires_in}s)`);
    m?.(de);
    let fe = Rtn(be.api_base_url, de);
    logForDebugging(`[remote-bridge] v2 session URL: ${fe}`);
    let me;
    try {
      me = await FJo({
        sessionUrl: fe,
        ingressToken: be.worker_jwt,
        sessionId: de,
        epoch: be.worker_epoch,
        heartbeatIntervalMs: ne.heartbeat_interval_ms,
        heartbeatJitterFraction: ne.heartbeat_jitter_fraction,
        initialSequenceNum: Z ? J : undefined,
        getAuthToken: () => be.worker_jwt,
        outboundOnly: U
      });
    } catch (Ee) {
      if (logForDebugging(`[remote-bridge] v2 transport setup failed: ${he(Ee)}`, {
        level: "error"
      }), H?.("failed", `Transport setup failed: ${he(Ee)}`), wQ("v2_transport_setup_failed", undefined, true), Ae("bridge_connect", "bridge_connect_transport_failed"), !Z) {
        wrn(de, t, ee(), n, ne.http_timeout_ms);
      }
      return null;
    }
    logForDebugging(`[remote-bridge] v2 transport created (epoch=${be.worker_epoch})`);
    H?.("ready");
    let Te = null;
    let ue = new MCt(ne.uuid_dedup_buffer_size);
    let ce = new Set();
    if (u) {
      for (let Ee of u) {
        ce.add(Ee.uuid);
        ue.add(Ee.uuid);
      }
    }
    let le = new MCt(ne.uuid_dedup_buffer_size);
    let pe = new PJo();
    let ve = Z;
    let _e = false;
    let xe;
    let ke = false;
    let Ie = 0;
    let Ue = 3;
    let Ge = Z;
    let Be = (Ee, Re) => {
      if (f && (Ee === "requires_action" || Ee === "idle")) {
        f();
      }
      if (me.reportState(Ee, Re), Ee === "requires_action" && Re) {
        Ge = true;
        me.reportMetadata({
          pending_action: Re
        });
      } else if (Ge) {
        Ge = false;
        me.reportMetadata({
          pending_action: null
        });
      }
    };
    let We;
    let Ze;
    let Tt;
    if (W) {
      (async () => {
        let {
          parseGitRemote: Ee,
          parseGitHubRepository: Re
        } = await Promise.resolve().then(() => (bI(), iMt));
        let {
          addWatchedRepo: Ce,
          removeWatchedRepo: Fe,
          getCachedBranchForRepo: Xe,
          onRepoBranchChange: He
        } = await Promise.resolve().then(() => (FP(), OIs));
        let Gt = Ee(W);
        let mt = Gt ? `${Gt.owner}/${Gt.name}` : Re(W);
        if (!mt) {
          return;
        }
        let Dt = re();
        if (await Ce(Dt), _e) {
          Fe(Dt);
          return;
        }
        let jt;
        let bn = async () => {
          if (_e) {
            return;
          }
          let hn = re();
          if (hn !== Dt) {
            if (Fe(Dt), Dt = hn, await Ce(hn), _e) {
              Fe(hn);
              return;
            }
          }
          let vn = await Xe(hn);
          if (vn === undefined || vn === jt) {
            return;
          }
          jt = vn;
          me.reportMetadata({
            current_branches: {
              [mt]: vn
            }
          });
        };
        Ze = () => {
          jt = undefined;
        };
        Tt = () => void bn();
        let Ct = He(Tt);
        We = () => {
          Ct();
          Fe(Dt);
        };
        bn();
      })().catch(Ee => logForDebugging(`[remote-bridge] current_branches setup failed: ${he(Ee)}`));
    }
    let kt = new Map();
    let Ye = !p;
    let ht = "initial";
    let It;
    function Rt(Ee) {
      if (_e) {
        return;
      }
      logEvent("tengu_bridge_repl_connect_timeout", {
        v2: true,
        elapsed_ms: ne.connect_timeout_ms,
        cause: Ee
      });
      Ae("bridge_connect", "bridge_connect_timeout");
    }
    let wt = awn({
      refreshBufferMs: ne.token_refresh_buffer_ms,
      getAccessToken: async () => {
        let Ee = o();
        if (a) {
          await a();
        }
        return o() ?? Ee;
      },
      onRefresh: (Ee, Re) => {
        (async () => {
          if (ke || _e) {
            logForDebugging("[remote-bridge] Recovery already in flight, skipping proactive refresh");
            return;
          }
          ke = true;
          try {
            let Ce = await XJe(() => vrn(Ee, t, Re, ne.http_timeout_ms), "fetchRemoteCredentials (proactive)", ne);
            if (!Ce || _e) {
              return;
            }
            if (qRt(Ce)) {
              if (!_e) {
                H?.("failed", HJo(Ce));
              }
              return;
            }
            await yt(Ce, "proactive_refresh");
            logForDebugging("[remote-bridge] Transport rebuilt (proactive refresh)");
          } catch (Ce) {
            if (logForDebugging(`[remote-bridge] Proactive refresh rebuild failed: ${he(Ce)}`, {
              level: "error"
            }), wn("error", "bridge_repl_v2_proactive_refresh_failed"), !_e) {
              H?.("failed", `Refresh failed: ${he(Ce)}`);
            }
          } finally {
            ke = false;
          }
        })();
      },
      label: "remote"
    });
    wt.scheduleFromExpiresIn(de, be.expires_in);
    function vt() {
      me.setOnConnect(() => {
        if (clearTimeout(It), Ie = 0, logForDebugging("[remote-bridge] v2 transport connected"), wn("info", "bridge_repl_v2_transport_connected"), z) {
          let Ee = me.getInternalEventWriter?.();
          let Re = me.getInternalEventReaders?.();
          if (Ee && Re) {
            z(Ee, Re);
          }
        }
        if (logEvent("tengu_bridge_repl_ws_connected", {
          v2: true,
          cause: ht
        }), !ve && u && u.length > 0) {
          ve = true;
          let Ee = me;
          on(u).catch(Re => logForDebugging(`[remote-bridge] flushHistory failed: ${Re}`)).finally(() => {
            if (me !== Ee || _e || ke) {
              return;
            }
            Ft();
            H?.("connected");
          });
        } else if (!pe.active) {
          H?.("connected");
        }
      });
      me.setOnData(Ee => {
        Oic(Ee, ue, le, d, h ? Re => {
          if (h(Re)) {
            Be("running");
          }
        } : undefined, Re => Dic(Re, {
          transport: me,
          sessionId: de,
          onInterrupt: g,
          getInitializeState: y,
          onDialogKindsDeclared: _,
          onSetModel: b,
          onSetMaxThinkingTokens: S,
          onSetPermissionMode: E,
          onRenameSession: C,
          onSetColor: x,
          onFileSuggestions: A,
          onReadFile: k,
          onGetContextUsage: I,
          onGetUsage: O,
          onMcpAuthenticate: M,
          onMcpOauthCallbackUrl: L,
          onMcpReconnect: P,
          onMcpStatus: F,
          outboundOnly: U
        }));
      });
      me.setOnClose(Ee => {
        if (clearTimeout(It), _e) {
          return;
        }
        if (logForDebugging(`[remote-bridge] v2 transport closed (code=${Ee})`), logEvent("tengu_bridge_repl_ws_closed", {
          code: Ee,
          v2: true
        }), (Ee === 401 || Ee === 4091) && !ke) {
          if (Ie >= Ue) {
            logForDebugging(`[remote-bridge] ${Ee} recovery exhausted after ${Ie} attempts`, {
              level: "error"
            });
            H?.("failed", `Transport recovery exhausted (code ${Ee})`);
            return;
          }
          Ie++;
          gt(Ee);
          return;
        }
        H?.("failed", `Transport closed: ${Dwc(Ee)}`);
      });
    }
    async function yt(Ee, Re) {
      ht = Re;
      Ge = false;
      Ze?.();
      V?.();
      pe.start();
      try {
        let Ce = me.getLastSequenceNum();
        if (me.close(), me = await FJo({
          sessionUrl: Rtn(Ee.api_base_url, de),
          ingressToken: Ee.worker_jwt,
          sessionId: de,
          epoch: Ee.worker_epoch,
          heartbeatIntervalMs: ne.heartbeat_interval_ms,
          heartbeatJitterFraction: ne.heartbeat_jitter_fraction,
          initialSequenceNum: Ce,
          getAuthToken: () => Ee.worker_jwt,
          outboundOnly: U
        }), _e) {
          me.close();
          return;
        }
        vt();
        me.connect();
        Tt?.();
        It = setTimeout(Rt, ne.connect_timeout_ms, ht);
        wt.scheduleFromExpiresIn(de, Ee.expires_in);
        Te?.updateAccessToken(Ee.worker_jwt);
        Ft();
      } finally {
        pe.drop();
      }
    }
    async function gt(Ee) {
      if (ke) {
        return;
      }
      ke = true;
      pe.start();
      H?.("reconnecting", Ee === 401 ? "JWT expired \u2014 refreshing" : "CCR init failed \u2014 retrying");
      logForDebugging(`[remote-bridge] ${Ee} on transport \u2014 attempting credential refresh + rebuild`);
      try {
        let Re = o();
        let Ce = true;
        if (Ee === 401 && s) {
          Ce = await s(Re ?? "");
        }
        let Fe = o() ?? Re;
        if (!Fe || _e) {
          if (!_e) {
            H?.("failed", "JWT refresh failed: no OAuth token");
          }
          return;
        }
        let Xe = await XJe(() => vrn(de, t, Fe, ne.http_timeout_ms), "fetchRemoteCredentials (recovery)", ne);
        if (!Xe && !_e && Ee === 401 && s && !Ce) {
          let He = false;
          for (let Gt = 1; Gt <= ne.oauth_retry_max_attempts && !_e; Gt++) {
            H?.("reconnecting", `OAuth refresh failed \u2014 waiting for a fresh login (${Gt}/${ne.oauth_retry_max_attempts})`);
            let mt = ne.oauth_retry_base_delay_ms * 2 ** (Gt - 1);
            let Dt = mt * ne.init_retry_jitter_fraction * (2 * Math.random() - 1);
            if (await sleep(mt + Dt), _e) {
              return;
            }
            let jt = i ? await i() : (await s(Re ?? "")) ? o() : undefined;
            if (_e) {
              return;
            }
            let bn = jt !== undefined && jt !== (Re ?? "") ? jt : undefined;
            if (!bn) {
              continue;
            }
            He = true;
            Xe = await XJe(() => vrn(de, t, bn, ne.http_timeout_ms), "fetchRemoteCredentials (recovery re-poll)", ne);
            break;
          }
          if (!Xe && !He) {
            if (!_e) {
              H?.("failed", "OAuth token refresh failed \u2014 re-authenticate, then re-enable Remote Control");
            }
            return;
          }
        }
        if (!Xe || _e) {
          if (!_e) {
            H?.("failed", `JWT refresh failed after ${Ee}`);
          }
          return;
        }
        if (qRt(Xe)) {
          if (!_e) {
            H?.("failed", HJo(Xe));
          }
          return;
        }
        ve = Z;
        await yt(Xe, Ee === 401 ? "auth_401_recovery" : "init_4091_recovery");
        logForDebugging(`[remote-bridge] Transport rebuilt after ${Ee}`);
      } catch (Re) {
        if (logForDebugging(`[remote-bridge] ${Ee} recovery failed: ${he(Re)}`, {
          level: "error"
        }), wn("error", Ee === 401 ? "bridge_repl_v2_jwt_refresh_failed" : "bridge_repl_v2_4091_recovery_failed"), !_e) {
          H?.("failed", `Transport recovery failed (${Ee}): ${he(Re)}`);
        }
      } finally {
        ke = false;
        pe.drop();
      }
    }
    if (vt(), !Z && u && u.length > 0) {
      pe.start();
    }
    me.connect();
    It = setTimeout(Rt, ne.connect_timeout_ms, ht);
    function Ft() {
      let Ee = pe.end();
      if (Ee.length === 0) {
        return;
      }
      for (let Ce of Ee) {
        ue.add(Ce.uuid);
      }
      let Re = l(Ee).map(Ce => ({
        ...Ce,
        session_id: de
      }));
      if (Ee.some(Ce => Ce.type === "user")) {
        Be("running");
      }
      logForDebugging(`[remote-bridge] Drained ${Ee.length} queued message(s) after flush`);
      me.writeBatch(Re);
    }
    async function on(Ee) {
      let Re = Ee.filter(E6o);
      let Ce = c > 0 && Re.length > c ? Re.slice(-c) : Re;
      if (Ce.length < Re.length) {
        logForDebugging(`[remote-bridge] Capped initial flush: ${Re.length} -> ${Ce.length} (cap=${c})`);
      }
      let Fe = l(Ce).map(Xe => ({
        ...Xe,
        session_id: de,
        historical: true
      }));
      if (Fe.length === 0) {
        return;
      }
      if (Re.at(-1)?.type === "user") {
        Be("running");
      }
      logForDebugging(`[remote-bridge] Flushing ${Fe.length} history events`);
      await me.writeBatch(Fe);
    }
    let rn = false;
    let Sn;
    function jn(Ee) {
      if (Ee?.skipArchive) {
        rn = true;
      }
      if (Ee?.reason) {
        Sn = Ee.reason;
      }
      if (xe) {
        return xe;
      }
      _e = true;
      xe = Xr();
      return xe;
    }
    async function Xr() {
      if (We?.(), V?.(), Te?.stop(), wt.cancelAll(), clearTimeout(It), pe.drop(), Be("idle"), Sn !== undefined) {
        me.write(Mic(de, Sn));
      }
      if (me.write(v6o(de)), rn) {
        if (Sn !== undefined) {
          await Promise.race([me.flush(), sleep(300)]);
        }
        me.close();
        logForDebugging(`[remote-bridge] Teardown complete (skipArchive): session=${de}`);
        wn("info", "bridge_repl_v2_teardown");
        logEvent("tengu_bridge_repl_teardown", {
          v2: true,
          archive_status: "skipped_teleport",
          archive_ok: false
        });
        Yt();
        return;
      }
      let Ee = ne.teardown_archive_timeout_ms;
      let Re = Date.now();
      let Ce = o();
      let Fe = await wrn(de, t, Ce, n, Ee);
      let Xe = Ee - (Date.now() - Re);
      if (Fe === 401 && s && Xe >= 200) {
        try {
          await Promise.race([s(Ce ?? ""), sleep(Xe)]);
          Ce = o();
          Fe = await wrn(de, t, Ce, n, Math.max(1, Ee - (Date.now() - Re)));
        } catch (Gt) {
          logForDebugging(`[remote-bridge] Teardown 401 retry threw: ${he(Gt)}`, {
            level: "error"
          });
        }
      }
      if (Sn !== undefined) {
        await Promise.race([me.flush(), sleep(300)]);
      }
      me.close();
      let He = Fe === "no_token" ? "skipped_no_token" : Fe === "timeout" || Fe === "error" ? "network_error" : Fe >= 500 ? "server_5xx" : Fe >= 400 ? "server_4xx" : "ok";
      logForDebugging(`[remote-bridge] Torn down (archive=${Fe})`);
      wn("info", "bridge_repl_v2_teardown");
      logEvent("tengu_bridge_repl_teardown", {
        v2: true,
        archive_status: He,
        archive_ok: typeof Fe === "number" && Fe < 400,
        archive_http_status: typeof Fe === "number" ? Fe : undefined,
        archive_timeout: Fe === "timeout",
        archive_no_token: Fe === "no_token"
      });
      Yt();
    }
    logEvent("tengu_bridge_repl_started", {
      has_initial_messages: !!(u && u.length > 0),
      v2: true,
      expires_in_s: be.expires_in,
      inProtectedNamespace: b6(),
      ...VCt()
    });
    Pe("bridge_connect");
    let co = {
      bridgeSessionId: de,
      outboundOnly: U ?? false,
      environmentId: "",
      sessionIngressUrl: be.api_base_url,
      getLastSequenceNum: () => me.getLastSequenceNum(),
      flush: () => me.flush(),
      writeMessages(Ee) {
        let Re = Ee.filter(Fe => E6o(Fe) && !ce.vZc(Fe.uuid) && !ue.vZc(Fe.uuid));
        if (Re.length === 0) {
          return;
        }
        if (!Ye) {
          for (let Fe of Re) {
            let Xe = Pic(Fe);
            if (Xe !== undefined && p?.(Xe, de)) {
              Ye = true;
              break;
            }
          }
        }
        if (pe.enqueue(...Re)) {
          logForDebugging(`[remote-bridge] Queued ${Re.length} message(s) during flush`);
          return;
        }
        for (let Fe of Re) {
          ue.add(Fe.uuid);
        }
        let Ce = l(Re).map(Fe => ({
          ...Fe,
          session_id: de
        }));
        if (Re.some(Fe => Fe.type === "user")) {
          Be("running");
        }
        logForDebugging(`[remote-bridge] Sending ${Re.length} message(s)`);
        me.writeBatch(Ce);
      },
      reportMetadata(Ee) {
        me.reportMetadata(Ee);
      },
      refreshGitBranch() {
        Tt?.();
      },
      writeSdkMessages(Ee) {
        let Re = Ee.filter(Fe => !Fe.uuid || !ue.vZc(Fe.uuid));
        if (Re.length === 0) {
          return;
        }
        for (let Fe of Re) {
          if (Fe.uuid) {
            ue.add(Fe.uuid);
          }
        }
        let Ce = Re.map(Fe => ({
          ...Fe,
          session_id: de
        }));
        me.writeBatch(Ce);
      },
      sendControlRequest(Ee) {
        if (ke) {
          logForDebugging(`[remote-bridge] Dropping control_request during 401 recovery: ${Ee.request_id}`);
          return;
        }
        let Re = {
          ...Ee,
          session_id: de
        };
        let Ce = Ee.request;
        if (Ce.subtype === "can_use_tool") {
          let Fe;
          if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_requires_action_details", false)) {
            let Xe = Ce.tool_name === "Bash" || Ce.tool_name === "PowerShell";
            let He;
            if (Ce.tool_name === "AskUserQuestion") {
              let Dt = Array.isArray(Ce.input?.questions) ? Ce.input.questions : [];
              let jt = Dt[0];
              let bn = jt?.header || jt?.question;
              He = {
                label: "Question",
                body: bn ? bn + (Dt.length > 1 ? ` (+${Dt.length - 1} more)` : "") : "Tap to answer"
              };
            } else if (Ce.tool_name === "ExitPlanMode") {
              He = {
                label: "Plan",
                body: "Plan ready for review"
              };
            }
            let Gt = Xe && typeof Ce.input?.command === "string" ? Lc(Ce.input.command) : undefined;
            let mt = Xe && typeof Ce.input?.description === "string" ? Ce.input.description : undefined;
            Fe = {
              tool_name: Ce.tool_name,
              display_tool_name: He?.label ?? Ce.display_name ?? Ce.tool_name,
              action_description: He?.body ?? Lc(Ce.description || mt || Gt && truncate(Gt, 120) || ""),
              raw_command: He ? undefined : Gt,
              tool_use_id: Ce.tool_use_id,
              request_id: He ? "" : Ee.request_id,
              input: Ce.input
            };
          }
          Be("requires_action", Fe);
        }
        me.write(Re);
        logForDebugging(`[remote-bridge] Sent control_request request_id=${Ee.request_id}`);
      },
      sendControlResponse(Ee) {
        if (ke) {
          logForDebugging("[remote-bridge] Dropping control_response during 401 recovery");
          return;
        }
        let Re = {
          ...Ee,
          session_id: de
        };
        Be("running");
        me.write(Re);
        logForDebugging("[remote-bridge] Sent control_response");
      },
      sendControlCancelRequest(Ee) {
        if (ke) {
          logForDebugging(`[remote-bridge] Dropping control_cancel_request during 401 recovery: ${Ee}`);
          return;
        }
        let Re = {
          type: "control_cancel_request",
          request_id: Ee,
          session_id: de
        };
        Be("running");
        me.write(Re);
        logForDebugging(`[remote-bridge] Sent control_cancel_request request_id=${Ee}`);
      },
      sendResult() {
        if (ke) {
          logForDebugging("[remote-bridge] Dropping result during 401 recovery");
          return;
        }
        Be("idle");
        me.write(v6o(de));
        logForDebugging("[remote-bridge] Sent result");
      },
      async subscribePR(Ee, Re, Ce) {
        let Fe = `${Ee}#${Re}`;
        let Xe = kt.get(Fe);
        if (Ce) {
          kt.set(Fe, {
            agentId: Ce,
            repo: Ee,
            prNumber: Re
          });
        }
        let He = await F6t("subscribe", de, Ee, Re, t, o, getTrustedDeviceToken);
        if (!He.ok && Ce) {
          if (Xe) {
            kt.set(Fe, Xe);
          } else {
            kt.delete(Fe);
          }
        }
        return He;
      },
      async unsubscribePR(Ee, Re) {
        let Ce = await F6t("unsubscribe", de, Ee, Re, t, o, getTrustedDeviceToken);
        if (Ce.ok) {
          kt.delete(`${Ee}#${Re}`);
        }
        return Ce;
      },
      getPRWebhookTargets() {
        return [...kt.values()];
      },
      teardown: jn,
      async archive() {
        await wrn(de, t, o(), n, ne.teardown_archive_timeout_ms);
      },
      [Symbol.asyncDispose]() {
        return co.teardown({
          reason: "host_exit"
        });
      }
    };
    let Yt = Ti(co);
    return co;
  }
  async function XJe(e, t, n) {
    let r = n.init_retry_max_attempts;
    for (let o = 1; o <= r; o++) {
      let s = await e();
      if (s !== null) {
        return s;
      }
      if (o < r) {
        let i = n.init_retry_base_delay_ms * 2 ** (o - 1);
        let a = i * n.init_retry_jitter_fraction * (2 * Math.random() - 1);
        let l = Math.min(i + a, n.init_retry_max_delay_ms);
        logForDebugging(`[remote-bridge] ${t} failed (attempt ${o}/${r}), retrying in ${Math.round(l)}ms`);
        await sleep(l);
      }
    }
    return null;
  }
  function HJo(e) {
    switch (e.reason) {
      case "untrusted_device":
        return untrustedDeviceHint();
      case "session_stale_relogin":
        return "session expired for trusted-device check \u2014 run /login to re-authenticate";
    }
  }
  async function vrn(e, t, n, r) {
    let o = await getTrustedDeviceToken();
    let s = await BJo(e, t, n, r, o);
    if (qRt(s) && s.reason === "untrusted_device") {
      let i = await recoverFromUntrustedDevice(o);
      if (i) {
        s = (await BJo(e, t, n, r, i)) ?? s;
      }
    }
    if (!s) {
      return null;
    }
    if (qRt(s)) {
      if (s.reason === "untrusted_device" && !isTrustedDeviceGateEnabled()) {
        return null;
      }
      return s;
    }
    return getBridgeBaseUrlOverride() ? {
      ...s,
      api_base_url: t
    } : s;
  }
  async function wrn(e, t, n, r, o) {
    if (!n) {
      return "no_token";
    }
    let s = toCompatSessionId(e);
    try {
      let i = await NP.post(`${t}/v1/sessions/${s}/archive`, {}, {
        headers: {
          ...Lwc(n),
          "anthropic-beta": "ccr-byoc-2025-07-29",
          "x-organization-uuid": r
        },
        timeout: o,
        validateStatus: () => true
      });
      logForDebugging(`[remote-bridge] Archive ${s} status=${i.status}`);
      return i.status;
    } catch (i) {
      let a = he(i);
      logForDebugging(`[remote-bridge] Archive failed: ${a}`);
      return NP.isAxiosError(i) && i.code === "ECONNABORTED" ? "timeout" : "error";
    }
  }
  async function Uvf(e, t, n, r, o) {
    if (!n) {
      return true;
    }
    let s = toCompatSessionId(e);
    try {
      let i = await NP.post(`${t}/v1/sessions/${s}/unarchive`, {}, {
        headers: {
          ...Lwc(n),
          "anthropic-beta": "ccr-byoc-2025-07-29",
          "x-organization-uuid": r
        },
        timeout: o,
        validateStatus: () => true
      });
      logForDebugging(`[remote-bridge] Unarchive ${s} status=${i.status}`);
      let a = i.status < 300 || i.status === 409;
      if (wn("info", a ? "bridge_repl_v2_unarchive_ok" : "bridge_repl_v2_unarchive_failed"), a || i.status === 404 || i.status === 403) {
        return true;
      }
      return null;
    } catch (i) {
      logForDebugging(`[remote-bridge] Unarchive failed: ${he(i)}`);
      wn("info", "bridge_repl_v2_unarchive_failed");
      return null;
    }
  }
  var Uwc = __lazy(() => {
    Dp();
    ln();
    $n();
    Ot();
    Adr();
    cU();
    hd();
    je();
    Zm();
    gn();
    dt();
    Wd();
    Kv();
    dI();
    Ox();
    otn();
    Ipe();
    Aot();
    N8o();
    udr();
    Mwc();
    U6t();
    CQ();
    Odr();
    $Jo();
    wZ();
    $Jo();
  });
  var jJo = {};
  __export(jJo, {
    initReplBridge: () => initReplBridge
  });
  async function initReplBridge(e) {
    let {
      getToolPermissionContext: t,
      getTools: n,
      onInboundMessage: r,
      onPermissionResponse: o,
      onInterrupt: s,
      getInitializeState: i,
      onDialogKindsDeclared: a,
      onSetModel: l,
      onSetMaxThinkingTokens: c,
      onSetPermissionMode: u,
      onSetColor: d,
      onMcpAuthenticate: p,
      onMcpOauthCallbackUrl: m,
      onMcpReconnect: f,
      onMcpStatus: h,
      onGetContextUsage: g,
      onGetUsage: y,
      onStateChange: _,
      initialMessages: b,
      getMessages: S,
      initialName: E,
      outboundOnly: C,
      tags: x,
      reattachSessionId: A,
      reattachSequenceNum: k,
      enableSessionPersistence: I
    } = e ?? {};
    setCseShimGate(isCseShimEnabled);
    vgt(getAttestationFilterPolicy);
    let O = 0;
    let M = {
      onTransportPersistenceReady: (ue, ce) => {
        let le = ++O;
        (async () => {
          try {
            let pe = await pHn();
            await wwc(ue, ce, pe);
          } catch (pe) {
            logForDebugging(`[bridge:repl] Persistence sync failed: ${he(pe)}`, {
              level: "error"
            });
          }
          if (le !== O) {
            logForDebugging("[bridge:repl] Transport torn down during sync \u2014 skipping writer install");
            return;
          }
          setInternalEventWriter(ue);
          setInternalEventReader(ce.readMain, ce.readSubagents);
          logForDebugging("[bridge:repl] Session persistence enabled \u2014 transcript writer + hydrate readers registered");
        })();
      },
      onTransportPersistenceTeardown: () => {
        O++;
        clearInternalEventWriter();
      }
    };
    let L = process.env.CLAUDE_BRIDGE_REATTACH_SESSION;
    let P = L ?? A;
    let F = process.env.CLAUDE_BRIDGE_REATTACH_SEQ;
    if (L) {
      delete process.env.CLAUDE_BRIDGE_REATTACH_SESSION;
      delete process.env.CLAUDE_BRIDGE_REATTACH_SEQ;
      delete process.env.CLAUDE_BRIDGE_REATTACH_OUTBOUND_ONLY;
    }
    let H = L ? F ? Number.parseInt(F, 10) || undefined : undefined : k;
    if (!P) {
      let ue = getCurrentSessionBridge();
      if (ue) {
        P = ue.id;
        H = ue.seq;
        logForDebugging(`[bridge:repl] Reattaching to persisted bridge session ${ue.id} at seq ${ue.seq}`);
      }
    }
    let U = TCe(getCurrentSessionBridge()?.declaredDialogKinds);
    if (U.length > 0) {
      a?.(U, "restored");
    }
    if (!(await isBridgeEnabledBlocking())) {
      wQ("not_enabled", "[bridge:repl] Skipping: bridge not enabled");
      return null;
    }
    if (!getBridgeAccessToken()) {
      wQ("no_oauth", "[bridge:repl] Skipping: no OAuth tokens");
      _?.("failed", "/login");
      return null;
    }
    if (await waitForPolicyLimitsToLoad(), !isPolicyAllowed("allow_remote_control")) {
      wQ("policy_denied", "[bridge:repl] Skipping: allow_remote_control policy not allowed");
      _?.("failed", "disabled by your organization's policy");
      return null;
    }
    if (C && !isPolicyAllowed("allow_remote_sessions")) {
      wQ("policy_denied", "[bridge:repl] Skipping mirror: allow_remote_sessions policy not allowed");
      _?.("failed", "disabled by your organization's policy");
      return null;
    }
    if (!getBridgeTokenOverride()) {
      let ue = getGlobalConfig();
      if (ue.bridgeOauthDeadExpiresAt != null && (ue.bridgeOauthDeadFailCount ?? 0) >= 3 && getStoredOAuthTokenExpiresAt() === ue.bridgeOauthDeadExpiresAt) {
        logForDebugging(`[bridge:repl] Skipping: cross-process backoff (dead token seen ${ue.bridgeOauthDeadFailCount} times)`);
        return null;
      }
      await checkAndRefreshOAuthTokenIfNeeded();
      let ce = getStoredOAuthTokenExpiresAt();
      if (ce !== null && ce <= Date.now()) {
        wQ("oauth_expired_unrefreshable", "[bridge:repl] Skipping: OAuth token expired and refresh failed (re-login required)");
        _?.("failed", "/login");
        let le = ce;
        saveGlobalConfig(pe => ({
          ...pe,
          bridgeOauthDeadExpiresAt: le,
          bridgeOauthDeadFailCount: pe.bridgeOauthDeadExpiresAt === le ? (pe.bridgeOauthDeadFailCount ?? 0) + 1 : 1
        }));
        return null;
      }
    }
    let N = getBridgeBaseUrl();
    let W = `${getBridgeSessionNamePrefix()}-${cst()}`;
    let j = false;
    let z = false;
    if (E) {
      W = E;
      j = true;
      z = true;
    } else {
      let ue = getSessionId();
      let ce = ue ? getCurrentSessionTitle(ue) : undefined;
      let le = ue ? getCurrentSessionAiTitle(ue) : undefined;
      if (ce) {
        W = ce;
        j = true;
        z = true;
      } else if (le) {
        W = le;
        j = true;
      } else if (b && b.length > 0) {
        for (let pe = b.length - 1; pe >= 0; pe--) {
          let ve = b[pe];
          if (!qpt(ve) || Hse(ve)) {
            continue;
          }
          let _e = cZ(ve.message.content);
          if (!_e) {
            continue;
          }
          let xe = Hvf(_e);
          if (!xe) {
            continue;
          }
          W = xe;
          j = true;
          break;
        }
      }
    }
    let V = 0;
    let K;
    let J = 0;
    let Q;
    let Z = new Set([W]);
    let ne = (ue, ce, le) => {
      j = true;
      W = ue;
      Z.add(ue);
      logForDebugging(`[bridge:repl] derived title from message ${le}: ${ue}`);
      updateBridgeSessionTitle(ce, ue, {
        baseUrl: N,
        getAccessToken: getBridgeAccessToken
      }).catch(() => {});
    };
    let oe = (ue, ce) => {
      let le = ++J;
      let pe = V;
      Sie(ue, AbortSignal.timeout(15000)).then(async ve => {
        let _e = () => {
          let Ie = getCurrentSessionAiTitle(getSessionId());
          return Boolean(Ie && !Z.vZc(Ie));
        };
        let xe = () => le !== J || K !== ce || z || getCurrentSessionTitle(getSessionId()) || _e();
        if (!ve || xe()) {
          return;
        }
        let ke = await getBridgeSession(ce, {
          baseUrl: N,
          getAccessToken: getBridgeAccessToken
        }).catch(() => null);
        if (xe()) {
          return;
        }
        if (ke === null) {
          return;
        }
        if (ke.title && !Z.vZc(ke.title)) {
          Q = ce;
          return;
        }
        ne(ve, ce, pe);
      });
    };
    let ee = ue => {
      let ce = ue.trim();
      if (!ce) {
        return {
          ok: false,
          error: "title must be non-empty"
        };
      }
      W = ce;
      j = true;
      z = true;
      Z.add(ce);
      saveCustomTitle(getSessionId(), ce, undefined, "remote").catch(le => {
        logForDebugging(`saveCustomTitle: transcript append failed: ${he(le)}`);
      });
      return {
        ok: true
      };
    };
    let re = (ue, ce) => {
      if (z || Q === ce) {
        return true;
      }
      let le = getCurrentSessionTitle(getSessionId());
      if (le) {
        if (!Z.vZc(le)) {
          getBridgeSession(ce, {
            baseUrl: N,
            getAccessToken: getBridgeAccessToken
          }).catch(() => null).then(ve => {
            if (z || getCurrentSessionTitle(getSessionId()) !== le) {
              return;
            }
            if (ve === null) {
              return;
            }
            if (ve.title && !Z.vZc(ve.title)) {
              Q = ce;
              return;
            }
            ne(le, ce, V);
            z = true;
          });
        }
        return true;
      }
      let pe = getCurrentSessionAiTitle(getSessionId());
      if (pe && !Z.vZc(pe)) {
        let ve = V;
        getBridgeSession(ce, {
          baseUrl: N,
          getAccessToken: getBridgeAccessToken
        }).catch(() => null).then(_e => {
          if (z || getCurrentSessionTitle(getSessionId())) {
            return;
          }
          if (_e === null) {
            return;
          }
          if (_e.title && !Z.vZc(_e.title)) {
            Q = ce;
            return;
          }
          ne(pe, ce, ve);
        });
        return true;
      }
      if (K !== undefined && K !== ce) {
        V = 0;
      }
      if (K = ce, V++, V === 1 && !j) {
        oe(ue, ce);
      } else if (V === 3) {
        let ve = S?.();
        let _e = ve ? xlr(kg(ve)) : ue;
        oe(_e, ce);
      }
      return V >= 3;
    };
    let se = 200;
    let ae = await getOrganizationUUID();
    if (!ae) {
      wQ("no_org_uuid", "[bridge:repl] Skipping: no org UUID");
      _?.("failed", "/login");
      return null;
    }
    let de = await cdr();
    if (de) {
      wQ("version_too_old", `[bridge:repl] Skipping: ${de}`, true);
      _?.("failed", "run `claude update` to upgrade");
      return null;
    }
    let be = await getBranch();
    let fe = await getRemoteUrlForBridge();
    let me;
    let Te = await Fwc({
      reattachSessionId: P,
      reattachSequenceNum: H,
      baseUrl: N,
      orgUUID: ae,
      title: W,
      getAccessToken: getBridgeAccessToken,
      onAuth401: handleOAuth401Error,
      onReadFreshOAuthToken: readFreshOAuthAccessToken,
      onProactiveRefresh: async () => {
        await checkAndRefreshOAuthTokenIfNeeded();
      },
      toSDKMessages: ue => KZl(ue, n?.()),
      initialHistoryCap: se,
      initialMessages: b,
      gitRepoUrl: fe,
      branch: be,
      onInboundMessage: r,
      onUserMessage: re,
      onSessionEstablished: ue => {
        if (me?.teardown(), me = bwc(toInfraSessionId(ue), N, () => {
          let le = getBridgeAccessToken();
          if (!le) {
            return {};
          }
          return {
            Authorization: `Bearer ${le}`
          };
        }), _de() && !Vi()) {
          xjl();
        }
        let ce = getCurrentSessionAgentColor();
        if (ce && ce !== "default") {
          updateBridgeSessionColorTag(ue, ce, eb, {
            baseUrl: N,
            getAccessToken: getBridgeAccessToken
          });
        }
      },
      onBeforePushTriggeringState: () => me?.pulseIfClientPresent(),
      onPermissionResponse: o,
      onInterrupt: s,
      getInitializeState: i,
      onDialogKindsDeclared: a,
      onSetModel: l,
      onSetMaxThinkingTokens: c,
      onSetPermissionMode: u,
      onRenameSession: ee,
      onSetColor: d,
      async onFileSuggestions(ue) {
        return (await generateFileSuggestions(globalFileIndexCache, ue, true)).map(le => ({
          path: le.displayText
        }));
      },
      onReadFile: (ue, ce, le) => readFileForRemote(ue, ce, t?.() ?? tq(), le),
      onMcpAuthenticate: p,
      onMcpOauthCallbackUrl: m,
      onMcpReconnect: f,
      onMcpStatus: h,
      onGetContextUsage: g,
      onGetUsage: y,
      onStateChange: _,
      outboundOnly: C,
      tags: x,
      ...(I ? M : {})
    });
    return $vf(Te, () => me);
  }
  function $vf(e, t) {
    if (!e) {
      t()?.teardown();
      return null;
    }
    let n = e.teardown.bind(e);
    e.teardown = async r => {
      t()?.teardown();
      await n(r);
    };
    return e;
  }
  function Hvf(e) {
    let t = wtt(e);
    let r = (/^(.*?[.!?])\s/.exec(t)?.[1] ?? t).replace(/\s+/g, " ").trim();
    if (!r) {
      return;
    }
    return r.length > 50 ? r.slice(0, 50 - 1) + "\u2026" : r;
  }
  var qJo = __lazy(() => {
    at();
    yvt();
    Swc();
    kQt();
    qP();
    q$();
    Kc();
    ci();
    $U();
    soe();
    no();
    je();
    Ctt();
    dt();
    na();
    S$();
    VUe();
    ro();
    Wd();
    arn();
    Fy();
    fa();
    UYe();
    kqe();
    wZ();
    Ox();
    TFe();
    Ipe();
    k8e();
    Cwc();
    Uwc();
    udr();
    CQ();
  });
  var qwc = {};