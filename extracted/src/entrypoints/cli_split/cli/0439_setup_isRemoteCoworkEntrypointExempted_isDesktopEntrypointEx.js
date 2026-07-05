  __export(mfr, {
    setup: () => setup,
    isRemoteCoworkEntrypointExempted: () => isRemoteCoworkEntrypointExempted,
    isDesktopEntrypointExempted: () => isDesktopEntrypointExempted
  });
  async function setup(e, t, n, r, o, s, i, a, l) {
    wn("info", "setup_started");
    let c = process.version.match(/^v(\d+)\./)?.[1];
    if (!c || parseInt(c) < 22) {
      console.error(_$u.bold.red("Error: Claude Code requires Node.js version 22 or higher."));
      process.exit(1);
    }
    if (i) {
      switchSession(i, "startup_custom_id");
    }
    if (!kd() || l !== undefined) {
      ;
    }
    if (process.env.CLAUDE_BG_BACKEND === "daemon") {
      let {
        startRendezvousServer: h
      } = await Promise.resolve().then(() => (w7e(), hrr));
      h();
    }
    if (await captureTeammateModeSnapshotIfEnabled(), !getIsNonInteractiveSession()) {
      if (isAgentSwarmsEnabled()) {
        let h = await Jbc();
        if (h.status === "restored") {
          console.log(_$u.yellow("Detected an interrupted iTerm2 setup. Your original settings have been restored. You may need to restart iTerm2 for the changes to take effect."));
        } else if (h.status === "failed") {
          console.error(_$u.red(`Failed to restore iTerm2 settings. Please manually restore your original settings with: defaults import com.googlecode.iterm2 ${h.backupPath}.`));
        }
      }
      try {
        let h = await dLn();
        if (h.status === "restored") {
          console.log(_$u.yellow("Detected an interrupted Terminal.app setup. Your original settings have been restored. You may need to restart Terminal.app for the changes to take effect."));
        } else if (h.status === "failed") {
          console.error(_$u.red(`Failed to restore Terminal.app settings. Please manually restore your original settings with: defaults import com.apple.Terminal ${h.backupPath}.`));
        }
      } catch (h) {
        Oe(h);
      }
    }
    try {
      By(e);
    } catch (h) {
      process.stderr.write(_$u.red(`Error: Can't access working directory ${_$u.bold(e)}: ${he(h)}
`));
      setBgExitCause("setcwd");
      process.exit(1);
    }
    let u = performance.now();
    if (Q3i(), au("setup_hooks_snapshot_ms", performance.now() - u, u), wn("info", "setup_hooks_captured", {
      duration_ms: Math.round(performance.now() - u)
    }), !getIsRemoteMode()) {
      let h = performance.now();
      nya(e);
      au("setup_file_watcher_ms", performance.now() - h, h);
    }
    let d = performance.now();
    if (r) {
      let h = hasWorktreeCreateHook();
      let g = await getIsGit();
      if (!h && !g) {
        process.stderr.write(_$u.red(`Error: Can only use --worktree in a git repository, but ${_$u.bold(e)} is not a git repository. Configure a WorktreeCreate hook in settings.json to use --worktree with other VCS systems.
`));
        process.exit(1);
      }
      let y = a ? `pr-${a}` : o ?? getPlanSlug();
      let _;
      if (g) {
        let S = findCanonicalGitRoot(Nt());
        if (!S) {
          process.stderr.write(_$u.red(`Error: Could not determine the main git repository root.
`));
          process.exit(1);
        }
        if (isLinkedWorktree(Nt())) {
          wn("info", "worktree_resolved_to_main_repo");
          process.chdir(S);
          By(S);
        }
        _ = s ? generateTmuxSessionName(S, worktreeBranchName(y)) : undefined;
      } else {
        _ = s ? generateTmuxSessionName(Nt(), worktreeBranchName(y)) : undefined;
      }
      let b;
      try {
        b = await createWorktreeForSession(getSessionId(), y, _, {
          prNumber: a,
          fromCwd: e
        });
      } catch (S) {
        process.stderr.write(_$u.red(`Error creating worktree: ${he(S)}
`));
        setBgExitCause("worktree_create");
        process.exit(1);
      }
      if (logEvent("tengu_worktree_created", {
        tmux_enabled: s
      }), s && _) {
        let S = await createTmuxSessionForWorktree(_, b.worktreePath);
        if (S.created) {
          console.log(_$u.green(`Created tmux session: ${_$u.bold(_)}
To attach: ${_$u.bold(`tmux attach -t ${_}`)}`));
        } else {
          console.error(_$u.yellow(`Warning: Failed to create tmux session: ${S.error}`));
        }
      }
      process.chdir(b.worktreePath);
      By(b.worktreePath);
      setOriginalCwd(Nt());
      setProjectRoot(Nt());
      saveWorktreeState(b);
      clearMemoryFileCaches();
      zIe();
      au("setup_worktree_ms", performance.now() - d, d);
    }
    if (wn("info", "setup_background_jobs_starting"), !kd()) {
      try {
        Gbc();
      } catch (h) {
        Oe(h);
      }
    }
    oze();
    wn("info", "setup_background_jobs_launched");
    profileCheckpoint("setup_before_prefetch");
    wn("info", "setup_prefetch_starting");
    let p = getIsNonInteractiveSession() && Me.CLAUDE_CODE_SYNC_PLUGIN_INSTALL || kd() || Ql();
    if (!p) {
      getCommands(getProjectRoot());
    }
    if (Promise.resolve().then(() => (Y9e(), Mpo)).then(h => {
      if (!p) {
        h.loadPluginHooks();
        h.setupPluginHookHotReload();
      }
    }), !kd()) {
      if (Promise.resolve().then(() => (zvo(), B5a)).then(h => h.registerSessionFileAccessHooks()), !getIsRemoteMode() && checkHasTrustDialogAccepted()) {
        Promise.resolve().then(() => (V3n(), G3n)).then(h => h.startMemoryWatcher());
      }
    }
    initSinks();
    logEvent("tengu_started", {});
    prefetchApiKeyFromApiKeyHelperIfSafe(getIsNonInteractiveSession());
    let m = (getInitialSettings() || {}).proxyAuthHelper;
    if (_setProxyAuthHelperConfig({
      helper: m,
      fromProjectOrLocal: getSettingsForSource("projectSettings")?.proxyAuthHelper === m || getSettingsForSource("localSettings")?.proxyAuthHelper === m,
      trustAccepted: checkHasTrustDialogAccepted
    }), prefetchProxyAuthFromHelperIfSafe(), profileCheckpoint("setup_after_prefetch"), !kd()) {
      let h = performance.now();
      await i7l(getGlobalConfig().lastReleaseNotesSeen);
      au("setup_release_notes_ms", performance.now() - h, h);
    }
    if (t === "bypassPermissions" || n) {
      if (typeof process.getuid === "function" && process.getuid() === 0 && process.env.IS_SANDBOX !== "1" && !Me.CLAUDE_CODE_BUBBLEWRAP) {
        console.error("--dangerously-skip-permissions cannot be used with root/sudo privileges for security reasons");
        process.exit(1);
      }
    }
    let f = getCurrentProjectConfig();
    if (f.lastCost !== undefined && f.lastDuration !== undefined) {
      logEvent("tengu_exit", {
        last_session_cost: f.lastCost,
        last_session_api_duration: f.lastAPIDuration,
        last_session_tool_duration: f.lastToolDuration,
        last_session_duration: f.lastDuration,
        last_session_lines_added: f.lastLinesAdded,
        last_session_lines_removed: f.lastLinesRemoved,
        last_session_total_input_tokens: f.lastTotalInputTokens,
        last_session_total_output_tokens: f.lastTotalOutputTokens,
        last_session_total_cache_creation_input_tokens: f.lastTotalCacheCreationInputTokens,
        last_session_total_cache_read_input_tokens: f.lastTotalCacheReadInputTokens,
        last_session_fps_average: f.lastFpsAverage,
        last_session_fps_low_1_pct: f.lastFpsLow1Pct,
        last_session_graceful_shutdown: f.lastGracefulShutdown ?? false,
        last_session_version_base: f.lastVersionBase ?? "unknown",
        last_session_id: br(f.lastSessionId),
        ...f.lastSessionMetrics
      });
    }
  }
  function isDesktopEntrypointExempted(e) {
    return false;
  }
  function isRemoteCoworkEntrypointExempted(e) {
    return false;
  }
  var ffr = __lazy(() => {
    Ot();
    B_();
    vo();
    LYe();
    U1();
    TJe();
    at();
    Bm();
    M7();
    TYo();
    D_();
    mE();
    Jro();
    no();
    bx();
    je();
    Zm();
    $A();
    pr();
    YW();
    gn();
    dt();
    na();
    q4t();
    lWe();
    i1();
    Xbc();
    Rn();
    qQ();
    xx();
    Fh();
    fa();
    H4();
    R3();
    iP();
  });
  var Zbc = {};