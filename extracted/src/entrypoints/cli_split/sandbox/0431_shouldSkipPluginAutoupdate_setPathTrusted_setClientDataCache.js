  __export(UXn, {
    verifyAutoModeGateAccess: () => verifyAutoModeGateAccess,
    transitionPlanAutoMode: () => transitionPlanAutoMode,
    transitionPermissionMode: () => transitionPermissionMode,
    stripDangerousPermissionsForAutoMode: () => stripDangerousPermissionsForAutoMode,
    shouldPlanUseAutoMode: () => shouldPlanUseAutoMode,
    shouldDisableBypassPermissions: () => shouldDisableBypassPermissions,
    setPermissionModeWithGuards: () => setPermissionModeWithGuards,
    restoreDangerousPermissions: () => restoreDangerousPermissions,
    removeDangerousPermissions: () => removeDangerousPermissions,
    prepareContextForPlanMode: () => prepareContextForPlanMode,
    parseToolListFromCLI: () => parseToolListFromCLI,
    parseBaseToolsFromCLI: () => parseBaseToolsFromCLI,
    isYoloEquivStripEnabledForEntrypoint: () => isYoloEquivStripEnabledForEntrypoint,
    isOverlyBroadPowerShellAllowRule: () => isOverlyBroadPowerShellAllowRule,
    isOverlyBroadBashAllowRule: () => isOverlyBroadBashAllowRule,
    isDefaultPermissionModeAuto: () => isDefaultPermissionModeAuto,
    isDangerousTaskPermission: () => isDangerousTaskPermission,
    isDangerousPowerShellPermission: () => isDangerousPowerShellPermission,
    isDangerousClassifierPermission: () => isDangerousClassifierPermission,
    isDangerousBashPermission: () => isDangerousBashPermission,
    isBypassPermissionsModeDisabled: () => isBypassPermissionsModeDisabled,
    isAutoModeGateEnabled: () => isAutoModeGateEnabled,
    initializeToolPermissionContext: () => initializeToolPermissionContext,
    initialPermissionModeFromCLI: () => initialPermissionModeFromCLI,
    hasAutoModeOptInAnySource: () => hasAutoModeOptInAnySource,
    getAutoModeUnavailableReason: () => getAutoModeUnavailableReason,
    getAutoModeUnavailableNotification: () => getAutoModeUnavailableNotification,
    getAutoModeEnabledStateWithSource: () => getAutoModeEnabledStateWithSource,
    getAutoModeEnabledStateIfCached: () => getAutoModeEnabledStateIfCached,
    getAutoModeEnabledState: () => getAutoModeEnabledState,
    findOverlyBroadPowerShellPermissions: () => findOverlyBroadPowerShellPermissions,
    findOverlyBroadBashPermissions: () => findOverlyBroadBashPermissions,
    findDangerousClassifierPermissions: () => findDangerousClassifierPermissions,
    createDisabledBypassPermissionsContext: () => createDisabledBypassPermissionsContext,
    checkAndDisableBypassPermissions: () => checkAndDisableBypassPermissions,
    antBuiltinDenyRules: () => antBuiltinDenyRules,
    activatePlanAutoMode: () => activatePlanAutoMode
  });
  function AKo(e) {
    if (bC.includes(e)) {
      let t = getSettingsFilePathForSource(e);
      if (t) {
        let n = Pgc.relative(Nt(), t);
        return n.length < t.length ? n : t;
      }
    }
    return e;
  }
  function findDangerousClassifierPermissions(e, t) {
    let n = [];
    for (let r of e) {
      if (r.ruleBehavior === "allow" && isDangerousClassifierPermission(r.ruleValue.toolName, r.ruleValue.ruleContent)) {
        let o = r.ruleValue.ruleContent ? `${r.ruleValue.toolName}(${r.ruleValue.ruleContent})` : `${r.ruleValue.toolName}(*)`;
        n.push({
          ruleValue: r.ruleValue,
          source: r.source,
          ruleDisplay: o,
          sourceDisplay: AKo(r.source)
        });
      }
    }
    for (let r of t) {
      let o = r.match(/^([^(]+)(?:\(([^)]*)\))?$/);
      if (o) {
        let s = o[1].trim();
        let i = o[2]?.trim();
        if (isDangerousClassifierPermission(s, i)) {
          n.push({
            ruleValue: {
              toolName: s,
              ruleContent: i
            },
            source: "cliArg",
            ruleDisplay: i ? r : `${s}(*)`,
            sourceDisplay: "--allowed-tools"
          });
        }
      }
    }
    return n;
  }
  function PKo(e) {
    return e === undefined || /^[\s*]+$/.test(e);
  }
  function xhf(e) {
    if (e.toolName === "PowerShell") {
      return "powershell";
    }
    let t = e.ruleContent;
    if (t === undefined || PKo(t)) {
      return "bare";
    }
    if (IYt(t, M9n)) {
      return "cluster";
    }
    if (IYt(t, D9n)) {
      return "network";
    }
    return "ace";
  }
  function isOverlyBroadBashAllowRule(e, t = false) {
    if (e.toolName !== "Bash") {
      return false;
    }
    let n = e.ruleContent;
    if (n === undefined || PKo(n)) {
      return true;
    }
    return t && IYt(n, Rhf);
  }
  function isOverlyBroadPowerShellAllowRule(e) {
    return e.toolName === "PowerShell" && PKo(e.ruleContent);
  }
  function isYoloEquivStripEnabledForEntrypoint() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_ant_yolo_equiv_strip_config", {});
    if (!e.enabled) {
      return false;
    }
    let t = Me.CLAUDE_CODE_ENTRYPOINT ?? "cli";
    if (e.includeEntrypoints) {
      return e.includeEntrypoints.includes(t);
    }
    return !(e.excludeEntrypoints ?? []).includes(t);
  }
  function findOverlyBroadBashPermissions(e, t, n = false) {
    let r = [];
    for (let o of e) {
      if (o.ruleBehavior === "allow" && isOverlyBroadBashAllowRule(o.ruleValue, n)) {
        r.push({
          ruleValue: o.ruleValue,
          source: o.source,
          ruleDisplay: o.ruleValue.ruleContent ? `${o.ruleValue.toolName}(${o.ruleValue.ruleContent})` : `${o.ruleValue.toolName}(*)`,
          sourceDisplay: AKo(o.source)
        });
      }
    }
    for (let o of t) {
      let s = Nh(o);
      if (isOverlyBroadBashAllowRule(s, n)) {
        r.push({
          ruleValue: s,
          source: "cliArg",
          ruleDisplay: s.ruleContent ? `${s.toolName}(${s.ruleContent})` : `${s.toolName}(*)`,
          sourceDisplay: "--allowed-tools"
        });
      }
    }
    return r;
  }
  function findOverlyBroadPowerShellPermissions(e, t) {
    let n = [];
    for (let r of e) {
      if (r.ruleBehavior === "allow" && isOverlyBroadPowerShellAllowRule(r.ruleValue)) {
        n.push({
          ruleValue: r.ruleValue,
          source: r.source,
          ruleDisplay: `${"PowerShell"}(*)`,
          sourceDisplay: AKo(r.source)
        });
      }
    }
    for (let r of t) {
      let o = Nh(r);
      if (isOverlyBroadPowerShellAllowRule(o)) {
        n.push({
          ruleValue: o,
          source: "cliArg",
          ruleDisplay: `${"PowerShell"}(*)`,
          sourceDisplay: "--allowed-tools"
        });
      }
    }
    return n;
  }
  function Ahf(e) {
    return sF.includes(e) || e === "session" || e === "cliArg";
  }
  function removeDangerousPermissions(e, t, n = false) {
    let r = new Map();
    for (let s of t) {
      if (!n && !Ahf(s.source)) {
        continue;
      }
      let i = s.source;
      let a = r.get(i) || [];
      a.push(s.ruleValue);
      r.set(i, a);
    }
    let o = e;
    for (let [s, i] of r) {
      o = $y(o, {
        type: "removeRules",
        rules: i,
        behavior: "allow",
        destination: s
      });
    }
    return o;
  }
  function stripDangerousPermissionsForAutoMode(e) {
    let t = [];
    for (let [o, s] of Object.entries(e.alwaysAllowRules)) {
      if (!s) {
        continue;
      }
      for (let i of s) {
        let a = Nh(i);
        t.push({
          source: o,
          ruleBehavior: "allow",
          ruleValue: a
        });
      }
    }
    let n = findDangerousClassifierPermissions(t, []);
    if (n.length === 0) {
      return e.strippedDangerousRules !== undefined ? e : {
        ...e,
        strippedDangerousRules: {}
      };
    }
    for (let o of n) {
      logForDebugging(`Ignoring dangerous permission ${o.ruleDisplay} from ${o.sourceDisplay} (bypasses classifier)`);
    }
    let r = {};
    for (let [o, s] of Object.entries(e.strippedDangerousRules ?? {})) {
      if (s) {
        r[o] = [...s];
      }
    }
    for (let o of n) {
      let s = jp(o.ruleValue);
      let i = r[o.source] ??= [];
      if (!i.includes(s)) {
        i.push(s);
      }
    }
    return {
      ...removeDangerousPermissions(e, n, true),
      strippedDangerousRules: r
    };
  }
  function restoreDangerousPermissions(e) {
    let t = e.strippedDangerousRules;
    if (!t) {
      return e;
    }
    let n = e;
    for (let [r, o] of Object.entries(t)) {
      if (!o || o.length === 0) {
        continue;
      }
      n = $y(n, {
        type: "addRules",
        rules: o.map(Nh),
        behavior: "allow",
        destination: r
      });
    }
    return {
      ...n,
      strippedDangerousRules: undefined
    };
  }
  function transitionPermissionMode(e, t, n, r) {
    if (e === t) {
      return n;
    }
    if (ISe({
      from: e,
      to: t,
      trigger: r
    }), handlePlanModeTransition(e, t), handleAutoModeTransition(e, t), e === "plan" && t !== "plan") {
      setHasExitedPlanMode(true);
    }
    {
      if (t === "plan" && e !== "plan") {
        return prepareContextForPlanMode(n);
      }
      let o = e === "auto" || e === "plan" && (EL?.isAutoModeActive() ?? false);
      let s = t === "auto";
      if (s && !o) {
        if (!isAutoModeGateEnabled()) {
          throw Error("Cannot transition to auto mode: gate is not enabled");
        }
        EL?.setAutoModeActive(true);
        n = stripDangerousPermissionsForAutoMode(n);
      } else if (o && !s) {
        EL?.setAutoModeActive(false);
        setNeedsAutoModeExitAttachment(true);
        n = restoreDangerousPermissions(n);
      }
    }
    if (e === "plan" && t !== "plan" && n.prePlanMode) {
      return {
        ...n,
        prePlanMode: undefined
      };
    }
    return n;
  }
  function setPermissionModeWithGuards(e, t, n, r) {
    if (e === "bypassPermissions") {
      if (isBypassPermissionsModeDisabled()) {
        return {
          ok: false,
          error: "Cannot set permission mode to bypassPermissions because it is disabled by settings or configuration"
        };
      }
      if (!t.isBypassPermissionsModeAvailable) {
        return {
          ok: false,
          error: "Cannot set permission mode to bypassPermissions because the session was not launched with --dangerously-skip-permissions"
        };
      }
    }
    if (e === "auto" && !isAutoModeGateEnabled()) {
      let o = getAutoModeUnavailableReason();
      return {
        ok: false,
        error: o ? `Cannot set permission mode to auto: ${getAutoModeUnavailableNotification(o)}` : "Cannot set permission mode to auto"
      };
    }
    n(o => {
      if (o.mode === e) {
        return o;
      }
      return {
        ...transitionPermissionMode(o.mode, e, o, r),
        mode: e
      };
    });
    setImmediate(() => {
      qIe.emit();
    });
    return {
      ok: true,
      mode: e
    };
  }
  function parseBaseToolsFromCLI(e) {
    let t = e.join(" ").trim();
    if (gBo(t)) {
      return yBo();
    }
    let r = parseToolListFromCLI(e);
    if (r.includes("preset:default")) {
      return N3().map(o => o.name).concat(r.filter(o => o !== "preset:default"));
    }
    return r;
  }
  function Ihf({
    processPwd: e,
    originalCwd: t
  }) {
    let {
      resolvedPath: n,
      isSymlink: r
    } = qd(zt(), e);
    return r ? n === Ogc.resolve(t) : false;
  }
  function initialPermissionModeFromCLI({
    permissionModeCli: e,
    dangerouslySkipPermissions: t,
    agentPermissionMode: n
  }) {
    if (isScrubEnabled()) {
      let o = t || e && e !== "default" || n && n !== "default";
      let s = "Permission mode forced to default \u2014 CLAUDE_CODE_SUBPROCESS_ENV_SCRUB is set " + "(allowed_non_write_users hardening). Declare allowedTools explicitly, or set CLAUDE_CODE_SUBPROCESS_ENV_SCRUB=0 to opt out.";
      if (o) {
        process.stderr.write(`\u26A0 ${s}
`);
      }
      return {
        mode: "default",
        notification: o ? s : undefined
      };
    }
    let r = d3i({
      cli: {
        permissionMode: e,
        dangerouslySkipPermissions: t,
        isNonInteractiveSession: getIsNonInteractiveSession()
      },
      env: {
        ...process.env,
        CLAUDE_CODE_SUBPROCESS_ENV_SCRUB: undefined
      },
      settings: getInitialSettings() || {},
      agentFrontmatter: n ? {
        permissionMode: n
      } : undefined
    });
    if (EL?.setAutoModeFromFallback(r.fromAutoFallback), r.mode === "auto") {
      EL?.setAutoModeActive(true);
    }
    return {
      mode: r.mode,
      notification: r.notification
    };
  }
  function parseToolListFromCLI(e) {
    if (e.length === 0) {
      return [];
    }
    let t = [];
    for (let n of e) {
      if (!n) {
        continue;
      }
      let r = "";
      let o = false;
      for (let s of n) {
        switch (s) {
          case "(":
            o = true;
            r += s;
            break;
          case ")":
            o = false;
            r += s;
            break;
          case ",":
            if (o) {
              r += s;
            } else {
              if (r.trim()) {
                t.push(r.trim());
              }
              r = "";
            }
            break;
          case " ":
            if (o) {
              r += s;
            } else if (r.trim()) {
              t.push(r.trim());
              r = "";
            }
            break;
          default:
            r += s;
        }
      }
      if (r.trim()) {
        t.push(r.trim());
      }
    }
    return t;
  }
  async function initializeToolPermissionContext({
    allowedToolsCli: e,
    disallowedToolsCli: t,
    baseToolsCli: n,
    permissionMode: r,
    allowDangerouslySkipPermissions: o,
    addDirs: s,
    bgSessionPermissionRules: i
  }) {
    let a = [];
    let l = parseToolListFromCLI(e).map(N => jp(Nh(N))).filter(N => {
      let W = Iyn(Nh(N).toolName);
      if (W) {
        a.push(`Ignoring --allowedTools rule "${N}": ${W.error}. ${W.suggestion}.`);
        return false;
      }
      return true;
    });
    let c = Ro([...parseToolListFromCLI(t), ...antBuiltinDenyRules()]);
    let u = !!n && n.length > 0 && gBo(n.join(" ").trim()) !== null;
    let d = n && !u ? parseToolListFromCLI(n).map(jD) : [];
    setSearchToolsOptIn(["Glob", "Grep"].some(N => d.includes(N) || l.some(W => Nh(W).toolName === N)));
    let p = [];
    if (n && n.length > 0) {
      let N = parseBaseToolsFromCLI(n);
      let W = new Set(N.map(jD));
      let z = (u ? yBo() : N3().map(V => V.name)).filter(V => !W.vZc(V));
      if (!u) {
        for (let V of ["PowerShell", "Glob", "Grep"]) {
          if (!W.vZc(V) && !z.includes(V)) {
            z.push(V);
          }
        }
      }
      p = z;
    }
    let m = new Map();
    let f = process.env.PWD;
    if (f && f !== getOriginalCwd() && Ihf({
      originalCwd: getOriginalCwd(),
      processPwd: f
    })) {
      m.set(f, {
        path: f,
        source: "session"
      });
    }
    let h = getFeatureValue_CACHED_MAY_BE_STALE("tengu_disable_bypass_permissions_mode", false);
    let y = (getInitialSettings() || {}).permissions?.disableBypassPermissionsMode === "disable";
    let _ = (r === "bypassPermissions" || o) && !h && !y;
    let b = Bmt();
    let S = [...c, ...p].map(Nh);
    let E = S.some(N => N.toolName === "Bash" && N.ruleContent === undefined);
    let x = S.some(N => N.toolName === "Bash") || b.some(N => N.ruleBehavior === "deny" && N.ruleValue.toolName === "Bash");
    let A = st(process.env.CLAUDE_CODE_USE_POWERSHELL_TOOL) || parseToolListFromCLI(n ?? []).map(jD).includes("PowerShell") || l.some(N => Nh(N).toolName === "PowerShell") || S.some(N => N.toolName === "PowerShell") || b.some(N => N.ruleValue.toolName === "PowerShell");
    if (Wt() === "windows" && Pu() && x && !A) {
      c = [...c, "PowerShell"];
    }
    let k = [];
    if (!st(process.env.CLAUDE_CODE_REMOTE) && process.env.CLAUDE_CODE_ENTRYPOINT !== "local-agent") {
      let N = [...findOverlyBroadBashPermissions(b, l, true), ...findOverlyBroadPowerShellPermissions(b, l)];
      if (N.length > 0) {
        let W = N.map(V => xhf(V.ruleValue));
        let j = false;
        let z = false;
        logEvent("tengu_ant_overly_broad_bash_detected", {
          count: N.length,
          categories: Ro(W).sort().join(","),
          yoloEquivEnabled: j,
          willStrip: k.length,
          entrypoint: Me.CLAUDE_CODE_ENTRYPOINT ?? "cli",
          ...false
        });
      }
    }
    let I = [];
    if (r === "auto") {
      I = findDangerousClassifierPermissions(b, l);
    }
    let O = applyPermissionRulesToPermissionContext({
      mode: r,
      additionalWorkingDirectories: m,
      alwaysAllowRules: {
        cliArg: l,
        ...(i && {
          session: i.allow
        })
      },
      alwaysDenyRules: {
        cliArg: c,
        ...(i && {
          session: i.deny
        }),
        ...(p.length > 0 && {
          toolsNarrowing: p
        })
      },
      alwaysAskRules: {},
      mcpPermissionModeOverrides: {},
      isBypassPermissionsModeAvailable: _,
      ...(N => ({
        isAutoModeAvailable: N,
        canAutoClassifierRun: N,
        chromeClassifierFloorEnabled: Me.CLAUDE_CHROME_CLASSIFIER_FLOOR ?? getFeatureValue_CACHED_MAY_BE_STALE("tengu_cowork_chrome_automode_default", false),
        previewClassifierFloorEnabled: Me.CLAUDE_PREVIEW_CLASSIFIER_FLOOR ?? false
      }))(isAutoModeGateEnabled()),
      isRemoteMode: Me.CLAUDE_CODE_REMOTE || getIsRemoteMode()
    }, b);
    let M = N3();
    let L = new Set([...M.map(N => N.name), "Bash", "PowerShell", "Glob", "Grep"]);
    let P = new Map([["Bash", "command"], ["PowerShell", "command"], ["Glob", "path"], ["Grep", "path"], ...M.filter(N => N.ruleContentField).map(N => [N.name, N.ruleContentField])]);
    for (let N of [...getDenyRules(O), ...getAskRules(O)]) {
      if (N.source === "toolsNarrowing" || N.source === "session") {
        continue;
      }
      let {
        toolName: W,
        ruleContent: j
      } = N.ruleValue;
      if ($ke(W) || W.includes("_") || Cyn(W).length > 0 || L.vZc(W)) {
        let z = P.get(W);
        if (z && j !== undefined) {
          let V = j.indexOf(":");
          if (V > 0 && j.slice(0, V).trim() === z) {
            a.push(`Permission ${N.ruleBehavior} rule "${jp(N.ruleValue)}" targets ${z} as a raw string and will not match \u2014 use ${W}(${"\u2026"}) for ${W}'s own matcher.`);
          }
        }
        continue;
      }
      a.push(`Permission ${N.ruleBehavior} rule "${jp(N.ruleValue)}" matches no known tool \u2014 check for typos.`);
    }
    let F = [...$mt().map(N => ({
      dir: N,
      destination: "localSettings"
    })), ...s.map(N => ({
      dir: N,
      destination: "cliArg"
    }))];
    let H = await Promise.all(F.map(async ({
      dir: N,
      destination: W
    }) => ({
      destination: W,
      result: await Ict(N, O)
    })));
    let U = new Map();
    for (let {
      result: N,
      destination: W
    } of H) {
      if (N.resultType === "success") {
        if (O = $y(O, {
          type: "addDirectories",
          directories: [N.absolutePath],
          destination: W
        }), W === "cliArg") {
          let j = s6n(N.absolutePath);
          if (j.length > 0) {
            U.set(N.absolutePath, j);
            let z = j.filter(V => V !== N.absolutePath);
            if (z.length > 0) {
              O = $y(O, {
                type: "addDirectories",
                directories: z,
                destination: W
              });
            }
          }
        }
      } else if (N.resultType !== "alreadyInWorkingDirectory" && N.resultType !== "pathNotFound") {
        a.push(Pct(N));
      }
    }
    if (U.size > 0) {
      O = {
        ...O,
        trustedNetworkDirectories: U
      };
    }
    return {
      toolPermissionContext: O,
      warnings: a,
      dangerousPermissions: I,
      overlyBroadBashPermissions: k
    };
  }
  function getAutoModeUnavailableNotification(e) {
    let t;
    switch (e) {
      case "settings":
        t = "auto mode disabled by settings";
        break;
      case "circuit-breaker":
        t = "auto mode is unavailable for your plan";
        break;
      case "provider":
        t = "auto mode requires CLAUDE_CODE_ENABLE_AUTO_MODE=1";
        break;
      case "model":
        t = "auto mode unavailable for this model";
        break;
    }
    return t;
  }
  async function verifyAutoModeGateAccess(e, t) {
    let n = await getDynamicConfig_BLOCKS_ON_INIT("tengu_auto_mode_config", {});
    let r = NKo(n?.enabled);
    let o = MKo();
    if (!(EL?.isAutoModeCircuitBroken() ?? false)) {
      EL?.setAutoModeCircuitBroken(r === "disabled" || o);
    }
    let s = getMainLoopModel();
    let i = !!n?.disableFastMode && (!!t || false);
    let a = dbe(s) && !i;
    let l = false;
    if (r !== "disabled" && !o && a) {
      l = r === "enabled" || hasAutoModeOptInAnySource() || e.mode === "auto" || e.prePlanMode === "auto";
    }
    let c = r !== "disabled" && !o && a;
    logForDebugging(`[auto-mode] verifyAutoModeGateAccess: enabledState=${r} disabledBySettings=${o} model=${s} modelSupported=${a} disableFastModeBreakerFires=${i} carouselAvailable=${l} canEnterAuto=${c}`);
    let u = EL?.getAutoModeFlagCli() ?? false;
    let d = (_, b) => {
      if (_.isAutoModeAvailable !== b) {
        logForDebugging(`[auto-mode] verifyAutoModeGateAccess setAvailable: ${_.isAutoModeAvailable} -> ${b}`);
      }
      return _.isAutoModeAvailable === b && _.canAutoClassifierRun === c ? _ : {
        ..._,
        isAutoModeAvailable: b,
        canAutoClassifierRun: c
      };
    };
    if (c) {
      return {
        updateContext: _ => {
          if (_.mode === "plan" && !_.prePlanMode) {
            let b = activatePlanAutoMode(_);
            if (b) {
              return d({
                ...b,
                prePlanMode: "default"
              }, l);
            }
          }
          return d(_, l);
        }
      };
    }
    let p;
    if (o) {
      p = "settings";
      logForDebugging("auto mode disabled: disableAutoMode in settings", {
        level: "warn"
      });
    } else if (r === "disabled") {
      p = "circuit-breaker";
      logForDebugging('auto mode disabled: tengu_auto_mode_config.enabled === "disabled" (circuit breaker)', {
        level: "warn"
      });
    } else if (!Yit(getAPIProvider())) {
      p = "provider";
      logForDebugging(`auto mode disabled: provider ${getAPIProvider()} requires the CLAUDE_CODE_ENABLE_AUTO_MODE opt-in`, {
        level: "warn"
      });
    } else {
      p = "model";
      logForDebugging(`auto mode disabled: model ${getMainLoopModel()} does not support auto mode`, {
        level: "warn"
      });
    }
    let m = getAutoModeUnavailableNotification(p);
    let f = _ => {
      let b = _.mode === "auto";
      logForDebugging(`[auto-mode] kickOutOfAutoIfNeeded applying: ctx.mode=${_.mode} ctx.prePlanMode=${_.prePlanMode} reason=${p}`);
      let S = _.mode === "plan" && (_.prePlanMode === "auto" || !!_.strippedDangerousRules);
      if (!b && !S) {
        return d(_, false);
      }
      if (b) {
        EL?.setAutoModeActive(false);
        setNeedsAutoModeExitAttachment(true);
        ISe({
          from: "auto",
          to: "default",
          trigger: "auto_gate_denied"
        });
        return {
          ...$y(restoreDangerousPermissions(_), {
            type: "setMode",
            mode: "default",
            destination: "session"
          }),
          isAutoModeAvailable: false,
          canAutoClassifierRun: false
        };
      }
      EL?.setAutoModeActive(false);
      setNeedsAutoModeExitAttachment(true);
      return {
        ...restoreDangerousPermissions(_),
        prePlanMode: _.prePlanMode === "auto" ? "default" : _.prePlanMode,
        isAutoModeAvailable: false,
        canAutoClassifierRun: false
      };
    };
    let h = e.mode === "auto";
    let g = e.mode === "plan" && (e.prePlanMode === "auto" || !!e.strippedDangerousRules);
    if (!(h || g || u)) {
      return {
        updateContext: f
      };
    }
    if (h || g) {
      return {
        updateContext: f,
        notification: m
      };
    }
    return {
      updateContext: f,
      notification: e.isAutoModeAvailable ? m : undefined
    };
  }
  function shouldDisableBypassPermissions() {
    return checkSecurityRestrictionGate("tengu_disable_bypass_permissions_mode");
  }
  function MKo() {
    let e = getInitialSettings() || {};
    return e.disableAutoMode === "disable" || e.permissions?.disableAutoMode === "disable";
  }
  function isAutoModeGateEnabled() {
    if (EL?.isAutoModeCircuitBroken() ?? false) {
      return false;
    }
    if (MKo()) {
      return false;
    }
    if (!dbe(getMainLoopModel())) {
      return false;
    }
    return true;
  }
  function getAutoModeUnavailableReason() {
    if (MKo()) {
      return "settings";
    }
    if (EL?.isAutoModeCircuitBroken() ?? false) {
      return "circuit-breaker";
    }
    if (!Yit(getAPIProvider())) {
      return "provider";
    }
    if (!dbe(getMainLoopModel())) {
      return "model";
    }
    return null;
  }
  function NKo(e) {
    if (e === "enabled" || e === "disabled" || e === "opt-in") {
      return e;
    }
    return "opt-in";
  }
  function getAutoModeEnabledState() {
    return getAutoModeEnabledStateWithSource().value;
  }
  function getAutoModeEnabledStateWithSource() {
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.enabled;
    let n = NKo(t);
    return {
      value: n,
      src: t === n ? "gb" : "default"
    };
  }
  function getAutoModeEnabledStateIfCached() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", Igc);
    if (e === Igc) {
      return;
    }
    return NKo(e?.enabled);
  }
  function hasAutoModeOptInAnySource() {
    if (EL?.getAutoModeFlagCli() ?? false) {
      return true;
    }
    return hasAutoModeOptIn();
  }
  function createDisabledBypassPermissionsContext(e) {
    let t = e;
    if (e.mode === "bypassPermissions") {
      t = $y(e, {
        type: "setMode",
        mode: "default",
        destination: "session"
      });
    }
    return {
      ...t,
      isBypassPermissionsModeAvailable: false
    };
  }
  async function checkAndDisableBypassPermissions(e) {
    if (!e.isBypassPermissionsModeAvailable) {
      return;
    }
    if (!(await shouldDisableBypassPermissions())) {
      return;
    }
    logForDebugging("bypassPermissions mode is being disabled by feature gate (async check)", {
      level: "warn"
    });
    gracefulShutdown(1, "bypass_permissions_disabled");
  }
  function isDefaultPermissionModeAuto() {
    return (getInitialSettings() || {}).permissions?.defaultMode === "auto";
  }
  function shouldPlanUseAutoMode() {
    return hasAutoModeOptIn() && isAutoModeGateEnabled() && getUseAutoModeDuringPlan();
  }
  function activatePlanAutoMode(e) {
    if (!shouldPlanUseAutoMode()) {
      return null;
    }
    EL?.setAutoModeActive(true);
    return stripDangerousPermissionsForAutoMode(e);
  }
  function prepareContextForPlanMode(e) {
    let t = e.mode;
    if (t === "plan") {
      return e;
    }
    if (t === "auto") {
      if (shouldPlanUseAutoMode()) {
        return {
          ...e,
          prePlanMode: "auto"
        };
      }
      EL?.setAutoModeActive(false);
      setNeedsAutoModeExitAttachment(true);
      return {
        ...restoreDangerousPermissions(e),
        prePlanMode: "auto"
      };
    }
    if (t !== "bypassPermissions") {
      let n = activatePlanAutoMode(e);
      if (n) {
        return {
          ...n,
          prePlanMode: t
        };
      }
    }
    logForDebugging(`[prepareContextForPlanMode] plain plan entry, prePlanMode=${t}`, {
      level: "info"
    });
    return {
      ...e,
      prePlanMode: t
    };
  }
  function transitionPlanAutoMode(e) {
    if (e.mode === "auto") {
      return stripDangerousPermissionsForAutoMode(e);
    }
    if (e.mode !== "plan") {
      return e;
    }
    if (!e.prePlanMode || e.prePlanMode === "bypassPermissions") {
      return e;
    }
    let t = shouldPlanUseAutoMode();
    let n = EL?.isAutoModeActive() ?? false;
    if (t && n) {
      return stripDangerousPermissionsForAutoMode(e);
    }
    if (!t && !n) {
      return e;
    }
    if (t) {
      EL?.setAutoModeActive(true);
      setNeedsAutoModeExitAttachment(false);
      return stripDangerousPermissionsForAutoMode(e);
    }
    EL?.setAutoModeActive(false);
    setNeedsAutoModeExitAttachment(true);
    return restoreDangerousPermissions(e);
  }
  var Pgc;
  var Ogc;
  var EL;
  var Rhf;
  var Igc;
  var S_ = __lazy(() => {
    at();
    E$t();
    v$t();
    vo();
    pr();
    YW();
    gn();
    nf();
    Pyn();
    s1();
    Bbe();
    oy();
    $n();
    R1n();
    Ot();
    Fk();
    _x();
    jM();
    DC();
    je();
    lm();
    Eo();
    Ds();
    Cs();
    Jf();
    yS();
    Oer();
    N9n();
    Zk();
    EC();
    aCo();
    dmr();
    dmr();
    Bbe();
    Pgc = require("path");
    Ogc = require("path");
    EL = (xse(), __toCommonJS(Fme));
    Rhf = [...dvo, ...D9n, ...M9n];
    Igc = Symbol("no-cached-auto-mode-config");
  });
  function Rpe(e, t = "Custom item") {
    let n = e.split(`
`);
    for (let r of n) {
      let o = r.trim();
      if (o) {
        let i = o.match(/^#+\s+(.+)$/)?.[1] ?? o;
        return i.length > 100 ? i.substring(0, 97) + "..." : i;
      }
    }
    return t;
  }
  function $gc(e) {
    if (e === undefined || e === null) {
      return null;
    }
    if (!e) {
      return [];
    }
    let t = [];
    if (typeof e === "string") {
      t = [e];
    } else if (Array.isArray(e)) {
      t = e.filter(r => typeof r === "string");
    }
    if (t.length === 0) {
      return [];
    }
    let n = parseToolListFromCLI(t);
    if (n.includes("*")) {
      return ["*"];
    }
    return n;
  }
  function qFe(e) {
    let t = $gc(e);
    if (t === null) {
      return e === undefined ? undefined : [];
    }
    if (t.includes("*")) {
      return;
    }
    return t;
  }
  function bQ(e) {
    let t = $gc(e);
    if (t === null) {
      return [];
    }
    return t;
  }
  async function Dhf(e) {
    try {
      let t = await W5.lstat(e, {
        bigint: true
      });
      if (t.dev === 0n && t.ino === 0n) {
        return null;
      }
      return `${t.dev}:${t.ino}`;
    } catch {
      return null;
    }
  }
  function Mhf(e) {
    let t = findGitRoot(e);
    let n = findGitRoot(getProjectRoot());
    if (!t || !n) {
      return t;
    }
    let r = findCanonicalGitRoot(e);
    if (r && yC(r) === yC(n)) {
      return t;
    }
    let o = yC(t);
    let s = yC(n);
    if (o !== s && o.startsWith(s + PH.sep)) {
      return n;
    }
    return t;
  }
  function uvt(e, t) {
    let n = r => r === undefined ? 1 / 0 : r.match(/[/\\]/g)?.length ?? 0;
    return n(e.baseDir) - n(t.baseDir);
  }
  function p8e(e, t) {
    let n = PH.resolve(Bgc.homedir()).normalize("NFC");
    let r = Mhf(t);
    let o = PH.resolve(t);
    let s = [];
    while (true) {
      if (yC(o) === yC(n)) {
        break;
      }
      let i = PH.join(o, ".claude", e);
      try {
        Ugc.statSync(i);
        s.push(i);
      } catch (l) {
        if (Io(l)) {
          ;
        } else if (en(l) === "ENFILE") {
          logForDebugging(`getProjectDirsUpToHome: stat ${i} hit ENFILE (system fd-table full); skipping`, {
            level: "error"
          });
        } else {
          throw l;
        }
      }
      if (r && yC(o) === yC(r)) {
        break;
      }
      let a = PH.dirname(o);
      if (a === o) {
        break;
      }
      o = a;
    }
    return s;
  }
  async function Nhf(e, t) {
    let n = [];
    let r = new Set();
    async function o(s) {
      if (t.aborted) {
        return;
      }
      try {
        let i = await W5.stat(s, {
          bigint: true
        });
        if (i.isDirectory()) {
          let a = i.dev !== undefined && i.ino !== undefined ? `${i.dev}:${i.ino}` : await W5.realpath(s);
          if (r.vZc(a)) {
            logForDebugging(`Skipping already visited directory (circular symlink): ${s}`);
            return;
          }
          r.add(a);
        }
      } catch (i) {
        let a = i instanceof Error ? i.message : String(i);
        logForDebugging(`Failed to stat directory ${s}: ${a}`);
        return;
      }
      try {
        let i = await W5.readdir(s, {
          withFileTypes: true
        });
        for (let a of i) {
          if (t.aborted) {
            break;
          }
          let l = PH.join(s, a.name);
          try {
            if (a.isSymbolicLink()) {
              try {
                let c = await W5.stat(l);
                if (c.isDirectory()) {
                  await o(l);
                } else if (c.isFile() && a.name.endsWith(".md")) {
                  n.push(l);
                }
              } catch (c) {
                let u = c instanceof Error ? c.message : String(c);
                logForDebugging(`Failed to follow symlink ${l}: ${u}`);
              }
            } else if (a.isDirectory()) {
              await o(l);
            } else if (a.isFile() && a.name.endsWith(".md")) {
              n.push(l);
            }
          } catch (c) {
            let u = c instanceof Error ? c.message : String(c);
            logForDebugging(`Failed to access ${l}: ${u}`);
          }
        }
      } catch (i) {
        let a = i instanceof Error ? i.message : String(i);
        logForDebugging(`Failed to read directory ${s}: ${a}`);
      }
    }
    await o(e);
    return n;
  }
  async function Kht(e) {
    let t = st("true");
    let n = AbortSignal.timeout(3000);
    let r = null;
    let o;
    try {
      o = t ? await Nhf(e, n) : await sde(["--files", "--hidden", "--follow", "--no-ignore", "--glob", "*.md"], e, n);
    } catch (i) {
      if (Io(i)) {
        return [];
      }
      if (i instanceof WBn) {
        logForDebugging(`loadMarkdownFilesFromDir: ripgrep timed out scanning ${e}`);
        return [];
      }
      throw i;
    }
    return (await Promise.all(o.map(async i => {
      try {
        let a = await $F({
          stat: W5.stat,
          readFile: W5.readFile
        }, i, 1048576);
        if (a === null) {
          logForDebugging(`loadMarkdownFilesFromDir: skipping ${i}: not a regular file or exceeds ${1048576} byte limit`);
          return null;
        }
        let {
          frontmatter: l,
          content: c
        } = sf(a, i, {
          normalizeKeys: true
        });
        return {
          filePath: i,
          frontmatter: l,
          content: c
        };
      } catch (a) {
        let l = a instanceof Error ? a.message : String(a);
        logForDebugging(`Failed to read/parse markdown file:  ${i}: ${l}`);
        return null;
      }
    }))).filter(i => i !== null);
  }
  var Ugc;
  var W5;
  var Bgc;
  var PH;
  var gHl;
  var E9;
  var v9 = __lazy(() => {
    Ot();
    at();
    je();
    gn();
    dt();
    Zl();
    fv();
    n1();
    na();
    S_();
    eoe();
    nf();
    Bte();
    IJ();
    Ugc = require("fs");
    W5 = require("fs/promises");
    Bgc = require("os");
    PH = require("path");
    gHl = ["commands", "agents", "output-styles", "skills", "workflows", "routines"];
    E9 = TEr(async function (e, t) {
      let n = Date.now();
      let r = PH.join(er(), e);
      let o = PH.join(SI(), ".claude", e);
      let s = p8e(e, t);
      let i = new Set(await Promise.all(s.map(async E => yC(await W5.realpath(E).catch(() => E)))));
      let a = e === "agents" ? Ro(await Promise.all(getAdditionalDirectoriesForClaudeMd().map(async E => {
        let C = PH.join(PH.resolve(E), ".claude", e);
        return await W5.realpath(C).catch(() => C);
      }))).filter(E => !i.vZc(yC(E))) : [];
      let l = findGitRoot(t);
      let c = findCanonicalGitRoot(t);
      if (l && c && c !== l) {
        let E = yC(PH.join(l, ".claude", e));
        if (!s.some(x => yC(x) === E)) {
          let x = PH.join(c, ".claude", e);
          if (!s.includes(x)) {
            s.push(x);
          }
        }
      }
      let [u, d, p, m] = await Promise.all([Kht(o).then(E => E.map(C => ({
        ...C,
        baseDir: o,
        source: "policySettings"
      }))), qf("userSettings") && !(e === "agents" && ZT("agents")) ? Kht(r).then(E => E.map(C => ({
        ...C,
        baseDir: r,
        source: "userSettings"
      }))) : Promise.resolve([]), qf("projectSettings") && !(e === "agents" && ZT("agents")) ? Promise.all(s.map(E => Kht(E).then(C => C.map(x => ({
        ...x,
        baseDir: E,
        source: "projectSettings"
      }))))) : Promise.resolve([]), qf("projectSettings") && !(e === "agents" && ZT("agents")) ? Promise.all(a.map(E => Kht(E).then(C => C.map(x => ({
        ...x,
        baseDir: E,
        source: "projectSettings",
        fromAdditionalDirectory: true
      }))))) : Promise.resolve([])]);
      let f = p.flat();
      let h = m.flat();
      let g = [...u, ...d, ...h, ...f];
      let y = await Promise.all(g.map(E => Dhf(E.filePath)));
      let _ = new Map();
      let b = [];
      for (let [E, C] of g.entries()) {
        let x = y[E] ?? null;
        if (x === null) {
          b.push(C);
          continue;
        }
        let A = _.get(x);
        if (A !== undefined) {
          logForDebugging(`Skipping duplicate file '${C.filePath}' from ${C.source} (same inode already loaded from ${A})`);
          continue;
        }
        _.set(x, C.source);
        b.push(C);
      }
      let S = g.length - b.length;
      if (S > 0) {
        logForDebugging(`Deduplicated ${S} files in ${e} (same inode via symlinks or hard links)`);
      }
      logEvent("tengu_dir_search", {
        durationMs: Date.now() - n,
        managedFilesFound: u.length,
        userFilesFound: d.length,
        projectFilesFound: f.length,
        projectDirsSearched: s.length,
        subdir: e
      });
      return b;
    }, (e, t) => `${e}:${t}`);
  });
  var Hgc;
  var jgc;
  var qgc = __lazy(() => {
    ln();
    je();
    fv();
    Rn();
    v9();
    yor();
    Hgc = require("path");
    jgc = TEr(async e => {
      try {
        let n = (await E9("output-styles", e)).map(({
          filePath: r,
          frontmatter: o,
          content: s,
          source: i,
          baseDir: a
        }) => {
          try {
            Z4e("output-style", o);
            let c = Hgc.basename(r).replace(/\.md$/, "");
            let u = (o.name != null ? String(o.name) : undefined) || c;
            let d = M2(o.description, c) ?? Rpe(s, `Custom ${c} output style`);
            let p = eWe(o["keep-coding-instructions"]);
            if (o["force-for-plugin"] !== undefined) {
              logForDebugging(`Output style "${u}" has force-for-plugin set, but this option only applies to plugin output styles. Ignoring.`, {
                level: "warn"
              });
            }
            return {
              name: u,
              description: d,
              prompt: s.trim(),
              source: i,
              baseDir: a,
              keepCodingInstructions: p
            };
          } catch (l) {
            Oe(l);
            return null;
          }
        }).filter(r => r !== null).sort(uvt);
        Pe("output_style_load");
        return n;
      } catch (t) {
        Et("output_style_load", "output_style_load_failed");
        logForDebugging(`Failed to load output styles: ${t instanceof Error ? t.message : String(t)}`, {
          level: "error"
        });
        return [];
      }
    });
  });
  function vBl() {
    Avt.cache?.clear?.();
  }
  async function por() {
    let e = await Avt(Nt());
    let t = Object.values(e).filter(s => s !== null && s.source === "plugin" && s.forceForPlugin === true);
    let n = t[0];
    if (n) {
      if (t.length > 1) {
        logForDebugging(`Multiple plugins have forced output styles: ${t.map(s => s.name).join(", ")}. Using: ${n.name}`, {
          level: "warn"
        });
      }
      logForDebugging(`Using forced plugin output style: ${n.name}`);
      return n;
    }
    let o = getInitialSettings()?.outputStyle || "default";
    return e[o] ?? null;
  }
  function Ggc() {
    let e = getInitialSettings()?.outputStyle;
    return e !== undefined && e !== "default";
  }
  function _mr() {
    return getInitialSettings()?.outputStyle || "default";
  }
  var Wgc;
  var Lhf = `The user chose continuous, autonomous execution. You should:

1. **Execute immediately** \u2014 Start implementing right away. Make reasonable assumptions and proceed on low-risk work.
2. **Minimize interruptions** \u2014 Prefer making reasonable assumptions over asking questions for routine decisions.
3. **Prefer action over planning** \u2014 Do not enter plan mode unless the user explicitly asks. When in doubt, start coding.
4. **Expect course corrections** \u2014 The user may provide suggestions or course corrections at any point; treat those as normal input.
5. **Do not take overly destructive actions** \u2014 This is not a license to destroy. Anything that deletes data or modifies shared or production systems still needs explicit user confirmation. If you reach such a decision point, ask and wait, or course correct to a safer method instead.
6. **Avoid data exfiltration** \u2014 Post even routine messages to chat platforms or work tickets only if the user has directed you to. You must not share secrets (e.g. credentials, internal documentation) unless the user has explicitly authorized both that specific secret and its destination.`;
  var GX;
  var Avt;
  var Kq = __lazy(() => {
    qgc();
    wb();
    vo();
    je();
    yor();
    Wk();
    Wgc = `
## Insights
In order to encourage learning, before and after writing code, always provide brief educational explanations about implementation choices using (with backticks):
"\`${vGd.star} Insight \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\`
[2-3 key educational points]
\`\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\`"

These insights should be included in the conversation, not in the codebase. You should generally focus on interesting insights that are specific to the codebase or the code you just wrote, rather than general programming concepts.`;
    GX = {
      ["default"]: null,
      Proactive: {
        name: "Proactive",
        source: "built-in",
        description: "Claude executes immediately, minimizes interruptions, and prefers action over planning",
        keepCodingInstructions: true,
        prompt: `You are an interactive CLI tool that helps users with software engineering tasks. You should work proactively and autonomously, executing immediately and minimizing interruptions.

# Proactive Style Active
${Lhf}`,
        turnReminder: "Execute autonomously, minimize interruptions, prefer action over planning."
      },
      Explanatory: {
        name: "Explanatory",
        source: "built-in",
        description: "Claude explains its implementation choices and codebase patterns",
        keepCodingInstructions: true,
        prompt: `You are an interactive CLI tool that helps users with software engineering tasks. In addition to software engineering tasks, you should provide educational insights about the codebase along the way.

You should be clear and educational, providing helpful explanations while remaining focused on the task. Balance educational content with task completion. When providing insights, you may exceed typical length constraints, but remain focused and relevant.

# Explanatory Style Active
${Wgc}`
      },
      Learning: {
        name: "Learning",
        source: "built-in",
        description: "Claude pauses and asks you to write small pieces of code for hands-on practice",
        keepCodingInstructions: true,
        prompt: `You are an interactive CLI tool that helps users with software engineering tasks. In addition to software engineering tasks, you should help users learn more about the codebase through hands-on practice and educational insights.

You should be collaborative and encouraging. Balance task completion with learning by requesting user input for meaningful design decisions while handling routine implementation yourself.   

# Learning Style Active
## Requesting Human Contributions
In order to encourage learning, ask the human to contribute 2-10 line code pieces when generating 20+ lines involving:
- Design decisions (error handling, data structures)
- Business logic with multiple valid approaches  
- Key algorithms or interface definitions

**TodoList Integration**: If using a TodoList for the overall task, include a specific todo item like "Request human input on [specific decision]" when planning to request human input. This ensures proper task tracking. Note: TodoList is not required for all tasks.

Example TodoList flow:
   \u2713 "Set up component structure with placeholder for logic"
   \u2713 "Request human collaboration on decision logic implementation"
   \u2713 "Integrate contribution and complete feature"

### Request Format
\`\`\`
${vGd.bullet} **Learn by Doing**
**Context:** [what's built and why this decision matters]
**Your Task:** [specific function/section in file, mention file and TODO(human) but do not include line numbers]
**Guidance:** [trade-offs and constraints to consider]
\`\`\`

### Key Guidelines
- Frame contributions as valuable design decisions, not busy work
- You must first add a TODO(human) section into the codebase with your editing tools before making the Learn by Doing request      
- Make sure there is one and only one TODO(human) section in the code
- Don't take any action or output anything after the Learn by Doing request. Wait for human implementation before proceeding.

### Example Requests

**Whole Function Example:**
\`\`\`
${vGd.bullet} **Learn by Doing**

**Context:** I've set up the hint feature UI with a button that triggers the hint system. The infrastructure is ready: when clicked, it calls selectHintCell() to determine which cell to hint, then highlights that cell with a yellow background and shows possible values. The hint system needs to decide which empty cell would be most helpful to reveal to the user.

**Your Task:** In sudoku.js, implement the selectHintCell(board) function. Look for TODO(human). This function should analyze the board and return {row, col} for the best cell to hint, or null if the puzzle is complete.

**Guidance:** Consider multiple strategies: prioritize cells with only one possible value (naked singles), or cells that appear in rows/columns/boxes with many filled cells. You could also consider a balanced approach that helps without making it too easy. The board parameter is a 9x9 array where 0 represents empty cells.
\`\`\`

**Partial Function Example:**
\`\`\`
${vGd.bullet} **Learn by Doing**

**Context:** I've built a file upload component that validates files before accepting them. The main validation logic is complete, but it needs specific handling for different file type categories in the switch statement.

**Your Task:** In upload.js, inside the validateFile() function's switch statement, implement the 'case "document":' branch. Look for TODO(human). This should validate document files (pdf, doc, docx).

**Guidance:** Consider checking file size limits (maybe 10MB for documents?), validating the file extension matches the MIME type, and returning {valid: boolean, error?: string}. The file object has properties: name, size, type.
\`\`\`

**Debugging Example:**
\`\`\`
${vGd.bullet} **Learn by Doing**

**Context:** The user reported that number inputs aren't working correctly in the calculator. I've identified the handleInput() function as the likely source, but need to understand what values are being processed.

**Your Task:** In calculator.js, inside the handleInput() function, add 2-3 console.log statements after the TODO(human) comment to help debug why number inputs fail.

**Guidance:** Consider logging: the raw input value, the parsed result, and any validation state. This will help us understand where the conversion breaks.
\`\`\`

### After Contributions
Share one insight connecting their code to broader patterns or system effects. Avoid praise or repetition.

## Insights
${Wgc}`
      }
    };
    Avt = TEr(async function (t) {
      if (Pc("outputStyles")) {
        return {
          ...GX
        };
      }
      let n = await jgc(t);
      let r = await m$o();
      let o = {
        ...GX
      };
      let s = n.filter(c => c.source === "policySettings");
      let i = n.filter(c => c.source === "userSettings");
      let a = n.filter(c => c.source === "projectSettings");
      let l = [r, i, a, s];
      gOe("outputStyle", [...Object.values(GX).filter(c => c !== null).map(c => ({
        name: c.name,
        source: c.source
      })), ...l.flat().map(c => ({
        name: c.name,
        source: c.source
      }))], {
        resolves: true
      });
      for (let c of l) {
        for (let u of c) {
          o[u.name] = {
            name: u.name,
            description: u.description,
            prompt: u.prompt,
            source: u.source,
            keepCodingInstructions: u.keepCodingInstructions,
            forceForPlugin: u.forceForPlugin
          };
        }
      }
      return o;
    });
  });
  function Vgc(e) {
    return `[SYSTEM NOTIFICATION - NOT USER INPUT]
This is an automated background-task event, NOT a message from the user.
Do NOT interpret this as user acknowledgement, confirmation, or response to any pending question.

${e}`;
  }
  function zgc() {
    if (process.env.CLAUDE_CODE_PLAN_V2_AGENT_COUNT) {
      let n = parseInt(process.env.CLAUDE_CODE_PLAN_V2_AGENT_COUNT, 10);
      if (!isNaN(n) && n > 0 && n <= 10) {
        return n;
      }
    }
    let e = getSubscriptionType();
    let t = getRateLimitTier();
    if (e === "max" && t === "default_claude_max_20x") {
      return 3;
    }
    if (e === "enterprise" || e === "team") {
      return 3;
    }
    return 1;
  }
  function Kgc() {
    if (process.env.CLAUDE_CODE_PLAN_V2_EXPLORE_AGENT_COUNT) {
      let e = parseInt(process.env.CLAUDE_CODE_PLAN_V2_EXPLORE_AGENT_COUNT, 10);
      if (!isNaN(e) && e > 0 && e <= 10) {
        return e;
      }
    }
    return 3;
  }
  var Ygc = __lazy(() => {
    no();
  });
  function Uhf() {
    uA();
    return __toCommonJS(IOo);
  }
  function VLe(e) {
    if (Vd() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_prism", false)) {
      return e + Bhf;
    }
    return e;
  }
  function xgc(e) {
    return `Permission to use ${e} has been denied. ${"IMPORTANT: You *may* attempt to accomplish this action using other tools that might naturally be used to accomplish this goal, e.g. using head instead of cat. But you *should not* attempt to work around this denial in malicious ways, e.g. do not use your ability to run tests to execute non-test actions. You should only try to work around this restriction in reasonable ways that do not attempt to bypass the intent behind this denial. If you believe this capability is essential to complete the user's request, STOP and explain to the user what you were trying to do and why you need this permission. Let the user decide how to proceed."}`;
  }
  function hmr(e) {
    return `Permission to use ${e} has been denied because Claude Code is running in don't ask mode. ${"IMPORTANT: You *may* attempt to accomplish this action using other tools that might naturally be used to accomplish this goal, e.g. using head instead of cat. But you *should not* attempt to work around this denial in malicious ways, e.g. do not use your ability to run tests to execute non-test actions. You should only try to work around this restriction in reasonable ways that do not attempt to bypass the intent behind this denial. If you believe this capability is essential to complete the user's request, STOP and explain to the user what you were trying to do and why you need this permission. Let the user decide how to proceed."}`;
  }
  function cZn(e) {
    return e.startsWith("Permission for this action was denied by the Claude Code auto mode classifier. Reason: ") || e.startsWith("Permission for this action has been denied. Reason: ");
  }
  function jTl(e) {
    if (!e.startsWith("Permission for this action was denied by the Claude Code auto mode classifier. Reason: ")) {
      return null;
    }
    let t = e.slice(("Permission for this action was denied by the Claude Code auto mode classifier. Reason: ").length);
    let n = t.indexOf(". If you have other tasks");
    if (n <= 0) {
      return null;
    }
    return t.slice(0, n);
  }
  function kgc(e) {
    let n = `${"Permission for this action was denied by the Claude Code auto mode classifier. Reason: "}${e}. If you have other tasks that don't depend on this action, continue working on those. ` + "IMPORTANT: You *may* attempt to accomplish this action using other tools that might naturally be used to accomplish this goal, e.g. using head instead of cat. But you *should not* attempt to work around this denial in malicious ways, e.g. do not use your ability to run tests to execute non-test actions. You should only try to work around this restriction in reasonable ways that do not attempt to bypass the intent behind this denial. If you believe this capability is essential to complete the user's request, STOP and explain to the user what you were trying to do and why you need this permission. Let the user decide how to proceed.";
    if (!aRs() || W5e()) {
      return n;
    }
    return `${n} ${"To allow this type of action in the future, the user can add a Bash permission rule to their settings."}`;
  }
  function ayc(e, t) {
    return "";
  }
  function Agc(e, t, n, r) {
    return `${t} is temporarily unavailable${ayc(n, r)}${", so auto mode cannot determine the safety of "}${e} right now. Wait briefly and then try this action again. If it keeps failing, continue with other tasks that don't require this action and come back to it later. Note: reading files, searching code, and other read-only operations do not require the classifier and can still be used.`;
  }
  function F_l(e, t, n) {
    return `Note: ${e ? `${e} (the safety classifier)` : "The safety classifier"} was unavailable${ayc(t, n)} when reviewing this subagent's work. Please carefully verify the subagent's actions and output before acting on them.`;
  }
  function Atr(e) {
    let t = e.findLast(r => r.type === "assistant");
    if (!t?.isApiErrorMessage) {
      return;
    }
    let n = UG(t);
    if (n && bDe.vZc(n)) {
      return;
    }
    return n ?? "API error";
  }
  function IZ(e) {
    return e.startsWith(`<${"local-command-stdout"}>`) || e.startsWith(`<${"command-message"}>`) || e.startsWith(`<${"command-name"}>`) || e.startsWith(`<${"bash-input"}>`) || e.startsWith(`<${"task-notification"}>`);
  }
  function Hse(e) {
    return e.type !== "progress" && e.type !== "attachment" && e.type !== "system" && Array.isArray(e.message.content) && e.message.content[0]?.type === "text" && bDe.vZc(e.message.content[0].text);
  }
  function selectableUserMessagesFilter(e) {
    if (!replayableUserMessagesFilter(e)) {
      return false;
    }
    if (e.origin && e.origin.kind !== "human") {
      return false;
    }
    return true;
  }
  function replayableUserMessagesFilter(e) {
    if (e.type !== "user") {
      return false;
    }
    if (Array.isArray(e.message.content) && e.message.content[0]?.type === "tool_result") {
      return false;
    }
    if (Hse(e)) {
      return false;
    }
    if (e.isMeta) {
      return false;
    }
    if (e.isCompactSummary || e.isVisibleInTranscriptOnly) {
      return false;
    }
    let t = qO(e)?.trim() ?? "";
    if (t.indexOf(`<${"local-command-stdout"}>`) !== -1 || t.indexOf(`<${"local-command-stderr"}>`) !== -1 || t.indexOf(`<${"bash-stdout"}>`) !== -1 || t.indexOf(`<${"bash-stderr"}>`) !== -1 || t.indexOf(`<${"task-notification"}>`) !== -1 || t.indexOf(`<${"tick"}>`) !== -1 || t.startsWith(`<${"teammate-message"} `) || t.startsWith("Another Claude session sent a message") && t.startsWith(`<${"teammate-message"} `, t.indexOf(`
`) + 1)) {
      return false;
    }
    return true;
  }
  function o2o(e) {
    let t = 0;
    let n = false;
    let r = true;
    for (let o of e) {
      if (o.type === "assistant") {
        r = true;
        continue;
      }
      if (o.type === "system" && (o.subtype === "compact_boundary" || false)) {
        n = true;
        continue;
      }
      if (o.type !== "user") {
        continue;
      }
      if (o.isCompactSummary) {
        n = true;
        continue;
      }
      if (o.isMeta) {
        continue;
      }
      if (o.toolUseResult || !selectableUserMessagesFilter(o)) {
        continue;
      }
      if (o.origin !== undefined && o.origin.kind !== "human") {
        continue;
      }
      if (r) {
        t++;
        r = false;
      }
    }
    return {
      userPromptCount: t,
      historyRewritten: n
    };
  }
  function BXl(e) {
    let n = e.trimStart();
    while (n.startsWith("<system-reminder>")) {
      let r = n.indexOf("</system-reminder>");
      if (r < 0) {
        break;
      }
      n = n.slice(r + 18).trimStart();
    }
    return n;
  }
  function mXt(e) {
    return (e.type === "user" || e.type === "assistant") && e.isVirtual === true;
  }
  function Snn(e) {
    return e.type === "assistant" && e.isApiErrorMessage === true && e.message.model === "<synthetic>";
  }
  function Yk(e) {
    return e.findLast(t => t.type === "assistant");
  }
  function vmr(e, t = 8, n = 65536) {
    let r = [];
    let o = 0;
    let s = false;
    for (let i = e.length - 1; i >= 0; i--) {
      let a = e[i];
      if (a.type === "assistant") {
        let l = Tl(a.message.content, `
`).trim();
        if (!l) {
          continue;
        }
        let c = Buffer.byteLength(l, "utf8");
        if (r.length >= t || r.length > 0 && o + c > n) {
          s = true;
          break;
        }
        r.push(l);
        o += c;
      } else if (a.type === "user") {
        let l = a.message.content;
        if (typeof l !== "string" && l.some(c => c.type === "tool_result")) {
          continue;
        }
        if (a.isMeta) {
          continue;
        }
        break;
      }
    }
    r.reverse();
    return {
      messages: r,
      capped: s
    };
  }
  function lyc({
    content: e,
    isApiErrorMessage: t = false,
    apiError: n,
    error: r,
    errorDetails: o,
    isVirtual: s,
    usage: i = {
      input_tokens: 0,
      output_tokens: 0,
      cache_creation_input_tokens: 0,
      cache_read_input_tokens: 0,
      server_tool_use: {
        web_search_requests: 0,
        web_fetch_requests: 0
      },
      service_tier: null,
      cache_creation: {
        ephemeral_1h_input_tokens: 0,
        ephemeral_5m_input_tokens: 0
      },
      inference_geo: null,
      iterations: null,
      speed: null
    },
    now: a = () => new Date().toISOString(),
    uuid: l = vL.randomUUID
  }) {
    return {
      type: "assistant",
      uuid: l(),
      timestamp: a(),
      message: {
        id: l(),
        container: null,
        model: "<synthetic>",
        role: "assistant",
        stop_details: null,
        stop_reason: "stop_sequence",
        stop_sequence: "",
        type: "message",
        usage: i,
        content: e,
        context_management: null
      },
      requestId: undefined,
      apiError: n,
      error: r,
      errorDetails: o,
      isApiErrorMessage: t,
      isVirtual: s
    };
  }
  function ST({
    content: e,
    usage: t,
    isVirtual: n,
    now: r,
    uuid: o
  }) {
    return lyc({
      content: typeof e === "string" ? [{
        type: "text",
        text: e === "" ? "(no content)" : e
      }] : e,
      usage: t,
      isVirtual: n,
      now: r,
      uuid: o
    });
  }
  function Ml({
    content: e,
    apiError: t,
    error: n,
    errorDetails: r,
    now: o,
    uuid: s
  }) {
    let i = lyc({
      content: [{
        type: "text",
        text: e === "" ? "(no content)" : e
      }],
      isApiErrorMessage: true,
      apiError: t,
      error: n,
      errorDetails: r,
      now: o,
      uuid: s
    });
    if (dyc(i)) {
      i.healsDistinctCarrier = true;
    }
    return i;
  }
  function In({
    content: e,
    isMeta: t,
    isVisibleInTranscriptOnly: n,
    isVirtual: r,
    isCompactSummary: o,
    summarizeMetadata: s,
    toolUseResult: i,
    toolDenialKind: a,
    mcpMeta: l,
    toolEndsTurn: c,
    uuid: u,
    timestamp: d,
    imagePasteIds: p,
    sourceToolAssistantUUID: m,
    permissionMode: f,
    origin: h,
    promptSource: g,
    interruptedMessageId: y,
    now: _,
    uuidFn: b
  }) {
    return {
      type: "user",
      message: {
        role: "user",
        content: e || "(no content)"
      },
      isMeta: t,
      isVisibleInTranscriptOnly: n,
      isVirtual: r,
      isCompactSummary: o,
      summarizeMetadata: s,
      uuid: u || (b ? b() : vL.randomUUID()),
      timestamp: d ?? (_ ? _() : new Date().toISOString()),
      toolUseResult: i,
      toolDenialKind: a,
      mcpMeta: l,
      toolEndsTurn: c,
      imagePasteIds: p,
      sourceToolAssistantUUID: m,
      permissionMode: f,
      origin: h,
      promptSource: g,
      interruptedMessageId: y
    };
  }
  function Kz({
    inputString: e,
    precedingInputBlocks: t
  }) {
    if (t.length === 0) {
      return e;
    }
    if (e.trim() === "") {
      return [...t];
    }
    return [...t, {
      text: e,
      type: "text"
    }];
  }
  function fZ({
    toolUse: e = false,
    interruptedMessageId: t,
    now: n,
    uuidFn: r
  }) {
    return In({
      content: [{
        type: "text",
        text: e ? "[Request interrupted by user for tool use]" : "[Request interrupted by user]"
      }],
      interruptedMessageId: t,
      now: n,
      uuidFn: r
    });
  }
  function Nse() {
    return In({
      content: `<${"local-command-caveat"}>Caveat: The messages below were generated by the user while running local commands. DO NOT respond to these messages or otherwise consider them in your response unless the user explicitly asks you to.</${"local-command-caveat"}>`,
      isMeta: true
    });
  }
  function NLe(e, t) {
    return `<${"command-name"}>/${e}</${"command-name"}>
            <${"command-message"}>${e}</${"command-message"}>
            <${"command-args"}>${t}</${"command-args"}>`;
  }
  function cyc(e, t) {
    return [Nse(), In({
      content: NLe("model", e)
    }), In({
      content: `${GKo}${t}</${"local-command-stdout"}>`
    })];
  }
  function tYt({
    toolUseID: e,
    parentToolUseID: t,
    data: n,
    now: r = () => new Date().toISOString(),
    uuid: o = vL.randomUUID
  }) {
    return {
      type: "progress",
      data: n,
      toolUseID: e,
      parentToolUseID: t,
      uuid: o(),
      timestamp: r()
    };
  }
  function Jnr(e) {
    return {
      type: "tool_result",
      content: "The user doesn't want to take this action right now. STOP what you are doing and wait for the user to tell you how to proceed.",
      is_error: true,
      tool_use_id: e
    };
  }
  function Nl(e, t) {
    if (!e.trim() || !t.trim()) {
      return null;
    }
    let n = FA(t);
    let r = new RegExp(`<${n}(?:\\s+[^>]*)?>([\\s\\S]*?)<\\/${n}>`, "gi");
    let o;
    let s = 0;
    let i = 0;
    let a = new RegExp(`<${n}(?:\\s+[^>]*?)?>`, "gi");
    let l = new RegExp(`<\\/${n}>`, "gi");
    while ((o = r.exec(e)) !== null) {
      let c = o[1];
      let u = e.slice(i, o.index);
      s = 0;
      a.lastIndex = 0;
      while (a.exec(u) !== null) {
        s++;
      }
      l.lastIndex = 0;
      while (l.exec(u) !== null) {
        s--;
      }
      if (s === 0 && c) {
        return c;
      }
      i = o.index + o[0].length;
    }
    return null;
  }
  function Bme(e) {
    if (e.type === "progress" || e.type === "attachment" || e.type === "system") {
      return true;
    }
    if (typeof e.message.content === "string") {
      return e.message.content.trim().length > 0;
    }
    if (e.message.content.length === 0) {
      return false;
    }
    if (e.message.content.length > 1) {
      return true;
    }
    if (e.message.content[0].type !== "text") {
      return true;
    }
    let t = e.message.content[0].text;
    if (typeof t !== "string") {
      return false;
    }
    return t.trim().length > 0 && t !== "(no content)" && t !== "[Request interrupted by user for tool use]";
  }
  function Vwt(e, t) {
    let n = t.toString(16).padStart(12, "0");
    return `${e.slice(0, 24)}${n}`;
  }
  function Enn(e) {
    if (e.type === "assistant") {
      return e.message.content.length > 1;
    }
    if (e.type === "user" && typeof e.message.content !== "string") {
      return e.message.content.length > 1;
    }
    return false;
  }
  function Whf(e) {
    return (e.type === "assistant" || e.type === "user") && !Enn(e);
  }
  function xS(e, t = false, n) {
    let r = t;
    let o = [];
    for (let s of e) {
      let i = r;
      let a = Whf(s) ? i : false;
      if (n) {
        let c = n.get(s);
        if (c && c.isNewChain === a) {
          if (s.type === "assistant" && c.normalized[0]?.type === "assistant" && c.normalized[0].message.stop_reason !== s.message.stop_reason) {
            for (let u of c.normalized) {
              if (u.type === "assistant") {
                u.message.stop_reason = s.message.stop_reason;
                u.message.stop_details = s.message.stop_details;
                u.message.usage = s.message.usage;
              }
            }
          }
          if (o.push(...c.normalized), Enn(s)) {
            r = true;
          }
          continue;
        }
      }
      let l = Ghf(s, i);
      if (n?.set(s, {
        isNewChain: a,
        normalized: l
      }), o.push(...l), Enn(s)) {
        r = true;
      }
    }
    return o;
  }
  function Ghf(e, t) {
    switch (e.type) {
      case "assistant":
        {
          let n = t || Enn(e);
          return e.message.content.map((r, o) => {
            let s = n ? Vwt(e.uuid, o) : e.uuid;
            return {
              type: "assistant",
              timestamp: e.timestamp,
              message: {
                ...e.message,
                content: [r],
                context_management: e.message.context_management ?? null
              },
              isMeta: e.isMeta,
              isVirtual: e.isVirtual,
              requestId: e.requestId,
              uuid: s,
              error: e.error,
              isApiErrorMessage: e.isApiErrorMessage,
              advisorModel: e.advisorModel,
              attributionAgent: e.attributionAgent,
              attributionSkill: e.attributionSkill,
              attributionPlugin: e.attributionPlugin,
              attributionMcpServer: e.attributionMcpServer,
              attributionMcpTool: e.attributionMcpTool
            };
          });
        }
      case "attachment":
        return [e];
      case "progress":
        return [e];
      case "system":
        return [e];
      case "user":
        {
          if (typeof e.message.content === "string") {
            let o = t ? Vwt(e.uuid, 0) : e.uuid;
            return [{
              ...e,
              uuid: o,
              message: {
                ...e.message,
                content: [{
                  type: "text",
                  text: e.message.content
                }]
              }
            }];
          }
          let n = t || Enn(e);
          let r = 0;
          return e.message.content.map((o, s) => {
            let i = o.type === "image";
            let a = i && e.imagePasteIds ? e.imagePasteIds[r] : undefined;
            if (i) {
              r++;
            }
            return {
              ...In({
                content: [o],
                toolUseResult: e.toolUseResult,
                mcpMeta: e.mcpMeta,
                isMeta: e.isMeta,
                isVisibleInTranscriptOnly: e.isVisibleInTranscriptOnly,
                isVirtual: e.isVirtual,
                timestamp: e.timestamp,
                imagePasteIds: a !== undefined ? [a] : undefined,
                origin: e.origin
              }),
              uuid: n ? Vwt(e.uuid, s) : e.uuid
            };
          });
        }
      default:
        return e;
    }
  }
  function Xgc(e) {
    return e.type === "assistant" && e.message.content.some(t => t.type === "tool_use");
  }
  function rLe(e) {
    return e.type === "user" && (Array.isArray(e.message.content) && e.message.content[0]?.type === "tool_result" || Boolean(e.toolUseResult));
  }
  function VXl(e, t) {
    let n = new Map();
    for (let s of e) {
      if (Xgc(s)) {
        let i = s.message.content[0]?.id;
        if (i) {
          if (!n.vZc(i)) {
            n.set(i, {
              toolUse: null,
              preHooks: [],
              toolResult: null,
              postHooks: []
            });
          }
          n.get(i).toolUse = s;
        }
        continue;
      }
      if (Tnn(s) && s.attachment.hookEvent === "PreToolUse") {
        let i = s.attachment.toolUseID;
        if (!n.vZc(i)) {
          n.set(i, {
            toolUse: null,
            preHooks: [],
            toolResult: null,
            postHooks: []
          });
        }
        n.get(i).preHooks.push(s);
        continue;
      }
      if (s.type === "user" && s.message.content[0]?.type === "tool_result") {
        let i = s.message.content[0].tool_use_id;
        if (!n.vZc(i)) {
          n.set(i, {
            toolUse: null,
            preHooks: [],
            toolResult: null,
            postHooks: []
          });
        }
        n.get(i).toolResult = s;
        continue;
      }
      if (Tnn(s) && s.attachment.hookEvent === "PostToolUse") {
        let i = s.attachment.toolUseID;
        if (!n.vZc(i)) {
          n.set(i, {
            toolUse: null,
            preHooks: [],
            toolResult: null,
            postHooks: []
          });
        }
        n.get(i).postHooks.push(s);
        continue;
      }
    }
    let r = [];
    let o = new Set();
    for (let s of e) {
      if (Xgc(s)) {
        let i = s.message.content[0]?.id;
        if (i && !o.vZc(i)) {
          o.add(i);
          let a = n.get(i);
          if (a && a.toolUse) {
            if (r.push(a.toolUse), r.push(...a.preHooks), a.toolResult) {
              r.push(a.toolResult);
            }
            r.push(...a.postHooks);
          }
        }
        continue;
      }
      if (Tnn(s) && (s.attachment.hookEvent === "PreToolUse" || s.attachment.hookEvent === "PostToolUse")) {
        continue;
      }
      if (s.type === "user" && s.message.content[0]?.type === "tool_result") {
        continue;
      }
      if (s.type === "system" && s.subtype === "api_error") {
        continue;
      }
      r.push(s);
    }
    for (let s of t) {
      r.push(s);
    }
    return r;
  }
  function Tnn(e) {
    return e.type === "attachment" && (e.attachment.type === "hook_blocking_error" || e.attachment.type === "hook_cancelled" || e.attachment.type === "hook_error_during_execution" || e.attachment.type === "hook_non_blocking_error" || e.attachment.type === "hook_success" || e.attachment.type === "hook_system_message" || e.attachment.type === "hook_additional_context" || e.attachment.type === "hook_stopped_continuation" || e.attachment.type === "hook_deferred_tool");
  }
  function zXl(e, t) {
    let n = new Map();
    let r = new Map();
    let o = new Map();
    for (let y of t) {
      if (y.type === "assistant") {
        let _ = y.message.id;
        let b = n.get(_);
        if (!b) {
          b = new Set();
          n.set(_, b);
        }
        for (let S of y.message.content) {
          if (S.type === "tool_use") {
            b.add(S.id);
            r.set(S.id, _);
            o.set(S.id, S);
          }
        }
      }
    }
    let s = new Map();
    for (let [y, _] of r) {
      s.set(y, n.get(_));
    }
    let i = new Map();
    let a = new Map();
    let l = new Map();
    let c = new Map();
    let u = new Map();
    let d = new Map();
    let p = new Set();
    let m = new Set();
    for (let y of e) {
      if (y.type === "progress") {
        let _ = y.parentToolUseID;
        let b = i.get(_);
        if (b) {
          b.push(y);
        } else {
          i.set(_, [y]);
        }
        if (y.data.type === "hook_progress") {
          let S = y.data.hookEvent;
          let E = a.get(_);
          if (!E) {
            E = new Map();
            a.set(_, E);
          }
          E.set(S, (E.get(S) ?? 0) + 1);
        }
      }
      if (y.type === "user") {
        for (let _ of y.message.content) {
          if (_.type === "tool_result") {
            if (c.set(_.tool_use_id, y), p.add(_.tool_use_id), _.is_error) {
              m.add(_.tool_use_id);
            }
          }
        }
      }
      if (y.type === "assistant") {
        for (let _ of y.message.content) {
          if (_.type === "tool_use") {
            u.set(_.id, y.uuid);
          }
          if (_.type === "text" && !d.vZc(y.message.id)) {
            d.set(y.message.id, y.uuid);
          }
          if ("tool_use_id" in _ && typeof _.tool_use_id === "string") {
            p.add(_.tool_use_id);
          }
          if (_.type === "advisor_tool_result") {
            if (_.content.type === "advisor_tool_result_error") {
              m.add(_.tool_use_id);
            }
          }
        }
      }
      if (Tnn(y)) {
        let _ = y.attachment.toolUseID;
        let b = y.attachment.hookEvent;
        let S = y.attachment.hookName;
        if (S !== undefined) {
          let E = l.get(_);
          if (!E) {
            E = new Map();
            l.set(_, E);
          }
          let C = E.get(b);
          if (!C) {
            C = new Set();
            E.set(b, C);
          }
          C.add(S);
        }
      }
    }
    let f = new Map();
    for (let [y, _] of l) {
      let b = new Map();
      for (let [S, E] of _) {
        b.set(S, E.size);
      }
      f.set(y, b);
    }
    let h = t.at(-1);
    let g = h?.type === "assistant" ? h.message.id : undefined;
    for (let y of e) {
      if (y.type !== "assistant") {
        continue;
      }
      if (y.message.id === g) {
        continue;
      }
      for (let _ of y.message.content) {
        if ((_.type === "server_tool_use" || _.type === "mcp_tool_use") && !p.vZc(_.id)) {
          let b = _.id;
          p.add(b);
          m.add(b);
        }
      }
    }
    return {
      siblingToolUseIDs: s,
      progressMessagesByToolUseID: i,
      inProgressHookCounts: a,
      resolvedHookCounts: f,
      toolResultByToolUseID: c,
      toolUseByToolUseID: o,
      assistantUuidByToolUseID: u,
      firstTextBlockUuidByMessageID: d,
      normalizedMessageCount: e.length,
      resolvedToolUseIDs: p,
      erroredToolUseIDs: m
    };
  }
  function G7t(e) {
    let t = new Map();
    let n = new Set();
    let r = new Set();
    let o = new Map();
    for (let {
      message: i
    } of e) {
      if (i.type === "assistant") {
        for (let a of i.message.content) {
          if (a.type === "tool_use") {
            t.set(a.id, a);
          }
        }
      } else if (i.type === "user") {
        for (let a of i.message.content) {
          if (a.type === "tool_result") {
            if (n.add(a.tool_use_id), o.set(a.tool_use_id, i), a.is_error) {
              r.add(a.tool_use_id);
            }
          }
        }
      }
    }
    let s = new Set();
    for (let i of t.keys()) {
      if (!n.vZc(i)) {
        s.add(i);
      }
    }
    return {
      lookups: {
        ...Yve,
        toolUseByToolUseID: t,
        resolvedToolUseIDs: n,
        erroredToolUseIDs: r,
        toolResultByToolUseID: o
      },
      inProgressToolUseIDs: s
    };
  }
  function GYl(e, t) {
    let n = eCe(e);
    if (!n) {
      return Vlr;
    }
    return t.siblingToolUseIDs.get(n) ?? Vlr;
  }
  function VYl(e, t) {
    let n = eCe(e);
    if (!n) {
      return [];
    }
    return t.progressMessagesByToolUseID.get(n) ?? [];
  }
  function KXl(e, t, n) {
    let r = n.inProgressHookCounts.get(e)?.get(t) ?? 0;
    let o = n.resolvedHookCounts.get(e)?.get(t) ?? 0;
    return r > o;
  }
  function YXl(e) {
    return new Set(e.filter(t => t.type === "assistant" && Array.isArray(t.message.content) && t.message.content[0]?.type === "tool_use").map(t => t.message.content[0].id));
  }
  function Vhf(e, t = false) {
    let n = false;
    for (let s = 0; s < e.length; s++) {
      let i = e[s];
      if (i.type === "attachment" || t && mXt(i)) {
        n = true;
        break;
      }
    }
    if (!n) {
      return e;
    }
    let r = [];
    let o = [];
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (i.type === "attachment") {
        o.push(i);
      } else {
        let a = i.type === "assistant" || i.type === "user" && Array.isArray(i.message.content) && i.message.content[0]?.type === "tool_result";
        let l = t && mXt(i);
        if (a && o.length > 0) {
          for (let c = 0; c < o.length; c++) {
            r.push(o[c]);
          }
          if (!l) {
            r.push(i);
          }
          o.length = 0;
        } else if (!l) {
          r.push(i);
        }
      }
    }
    for (let s = 0; s < o.length; s++) {
      r.push(o[s]);
    }
    r.reverse();
    return r;
  }
  function TNo(e) {
    return e.type === "system" && e.subtype === "local_command";
  }
  function zhf(e, t) {
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return e;
    }
    if (!n.some(o => o.type === "tool_result" && Array.isArray(o.content) && o.content.some(s => {
      if (!isToolReferenceBlock(s)) {
        return false;
      }
      let i = s.tool_name;
      return i && !t.vZc(jD(i));
    }))) {
      return e;
    }
    return {
      ...e,
      message: {
        ...e.message,
        content: n.map(o => {
          if (o.type !== "tool_result" || !Array.isArray(o.content)) {
            return o;
          }
          let s = o.content.filter(i => {
            if (!isToolReferenceBlock(i)) {
              return true;
            }
            let a = i.tool_name;
            if (!a) {
              return true;
            }
            let l = jD(a);
            let c = t.vZc(l);
            if (!c) {
              logForDebugging(`Filtering out tool_reference for unavailable tool: ${l}`, {
                level: "warn"
              });
            }
            return c;
          });
          if (s.length === 0) {
            return {
              ...o,
              content: [{
                type: "text",
                text: "[Tool references removed - tools no longer available]"
              }]
            };
          }
          return {
            ...o,
            content: s
          };
        })
      }
    };
  }
  function sKo(e) {
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return e;
    }
    if (!t.some(r => r.type === "tool_result" && Array.isArray(r.content) && r.content.some(isToolReferenceBlock))) {
      return e;
    }
    return {
      ...e,
      message: {
        ...e.message,
        content: t.map(r => {
          if (r.type !== "tool_result" || !Array.isArray(r.content)) {
            return r;
          }
          let o = r.content.filter(s => !isToolReferenceBlock(s));
          if (o.length === 0) {
            return {
              ...r,
              content: [{
                type: "text",
                text: "[Tool references removed - tool search not enabled]"
              }]
            };
          }
          return {
            ...r,
            content: o
          };
        })
      }
    };
  }
  function Vhc(e) {
    if (!e.message.content.some(n => n.type === "tool_use" && "caller" in n && n.caller !== null)) {
      return e;
    }
    return {
      ...e,
      message: {
        ...e.message,
        content: e.message.content.map(n => {
          if (n.type !== "tool_use") {
            return n;
          }
          return {
            type: "tool_use",
            id: n.id,
            name: n.name,
            input: n.input
          };
        })
      }
    };
  }
  function Khf(e) {
    return e.some(t => t.type === "tool_result" && Array.isArray(t.content) && t.content.some(isToolReferenceBlock));
  }
  function Yhf(e) {
    let t = e.message.content;
    if (typeof t === "string") {
      if (t.startsWith("<system-reminder>")) {
        return e;
      }
      return {
        ...e,
        message: {
          ...e.message,
          content: gR(t)
        }
      };
    }
    let n = false;
    let r = t.map(o => {
      if (o.type === "text" && !o.text.startsWith("<system-reminder>")) {
        n = true;
        return {
          ...o,
          text: gR(o.text)
        };
      }
      return o;
    });
    return n ? {
      ...e,
      message: {
        ...e.message,
        content: r
      }
    } : e;
  }
  function uyc(e) {
    return e.map(t => {
      if (t.type !== "user") {
        return t;
      }
      let n = t.message.content;
      if (!Array.isArray(n)) {
        return t;
      }
      if (!n.some(u => u.type === "tool_result")) {
        return t;
      }
      let o = [];
      let s = [];
      for (let u of n) {
        if (u.type === "text" && u.text.startsWith("<system-reminder>")) {
          o.push(u);
        } else {
          s.push(u);
        }
      }
      if (o.length === 0) {
        return t;
      }
      let i = s.findLastIndex(u => u.type === "tool_result");
      let a = s[i];
      let l = HKo(a, o);
      if (l === null) {
        return t;
      }
      let c = [...s.slice(0, i), l, ...s.slice(i + 1)];
      return {
        ...t,
        message: {
          ...t.message,
          content: c
        }
      };
    });
  }
  function Jhf(e) {
    let t;
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r.type !== "user") {
        continue;
      }
      let o = r.message.content;
      if (!Array.isArray(o)) {
        continue;
      }
      let s;
      for (let i = 0; i < o.length; i++) {
        let a = o[i];
        if (a.type !== "tool_result" || !a.is_error) {
          continue;
        }
        let l = a.content;
        if (!Array.isArray(l)) {
          continue;
        }
        if (l.every(d => d.type === "text")) {
          continue;
        }
        let c = l.filter(d => d.type === "text").map(d => d.text);
        let u = c.length > 0 ? [{
          type: "text",
          text: c.join(`

`)
        }] : [];
        if (!s) {
          s = o.slice();
        }
        s[i] = {
          ...a,
          content: u
        };
      }
      if (!s) {
        continue;
      }
      if (!t) {
        t = e.slice();
      }
      t[n] = {
        ...r,
        message: {
          ...r.message,
          content: s
        }
      };
    }
    return t ?? e;
  }
  function Xhf() {
    return {
      [Zdo()]: new Set(["document"]),
      [epo()]: new Set(["document"]),
      [tpo()]: new Set(["document"]),
      [A$n()]: new Set(["image"]),
      [npo()]: new Set(["document", "image"]),
      [mpt("image")]: new Set(["image"]),
      [mpt("document")]: new Set(["document"])
    };
  }
  function dyc(e) {
    if (!e.errorDetails) {
      return;
    }
    if (e.errorDetails.startsWith("{")) {
      return;
    }
    return Vha(e.errorDetails);
  }
  function $Ko(e, t) {
    if (e.type !== "user") {
      return false;
    }
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return false;
    }
    return n.some(r => t.vZc(r.type) || r.type === "tool_result" && Array.isArray(r.content) && r.content.some(o => t.vZc(o.type)));
  }
  function Qhf(e) {
    if (e.type !== "user") {
      return false;
    }
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return false;
    }
    return t.some(n => n.type === "tool_result" && n.content === "[Old tool result content cleared]");
  }
  function Zhf(e, t) {
    let n = new Set();
    if (e.type !== "user" || !Array.isArray(e.message.content)) {
      return n;
    }
    for (let r of e.message.content) {
      if (r.type !== "tool_result" || r.content !== "[Old tool result content cleared]") {
        continue;
      }
      let o = t.get(r.tool_use_id);
      if (o === undefined || o === "Read" || o.startsWith("mcp__")) {
        n.add("image");
        n.add("document");
      } else if (o === "Bash" || o === "PowerShell" || o === "WebBrowser" || o === "REPL") {
        n.add("image");
      }
    }
    return n;
  }
  function tgf(e, t) {
    let n = new Set();
    for (let r of Grr(e)) {
      let o = r.message.content;
      if (!Array.isArray(o)) {
        continue;
      }
      for (let s of o) {
        if (t.vZc(s.type)) {
          n.add(s.type);
        } else if (s.type === "tool_result" && Array.isArray(s.content)) {
          for (let i of s.content) {
            if (t.vZc(i.type)) {
              n.add(i.type);
            }
          }
        }
      }
    }
    return n;
  }
  function Qgc(e, t) {
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return e;
    }
    let r = false;
    let o = n.flatMap(s => {
      if (t.vZc(s.type)) {
        r = true;
        return [];
      }
      if (s.type === "tool_result" && Array.isArray(s.content)) {
        let i = s.content.filter(a => !t.vZc(a.type));
        if (i.length < s.content.length) {
          r = true;
          let a = i.length > 0 ? i : [{
            type: "text",
            text: "(media removed \u2014 rejected by API)"
          }];
          return [{
            ...s,
            content: a
          }];
        }
      }
      return [s];
    });
    if (o.length === 0) {
      return null;
    }
    if (!r) {
      return e;
    }
    return {
      ...e,
      message: {
        ...e.message,
        content: o
      }
    };
  }
  function EO(e, t = [], n) {
    let r = n !== undefined && nIn(n);
    let o = r ? new Map() : undefined;
    let s = new Set(t.map(I => I.name));
    let i = Vhf(e, true);
    let a;
    let l = new Map();
    let c = new Map();
    let u = 0;
    let d = 0;
    let p = false;
    let m;
    let f;
    for (let I = 0; I < i.length; I++) {
      let O = i[I];
      if (!Snn(O)) {
        p = false;
        continue;
      }
      if (!p) {
        p = true;
        d++;
      }
      let M = dyc(O) ?? (Array.isArray(O.message.content) && O.message.content[0]?.type === "text" ? (a ??= Xhf())[O.message.content[0].text] : undefined);
      if (!M) {
        continue;
      }
      for (let L = I - 1; L >= 0; L--) {
        let P = i[L];
        let F;
        if (O.healsDistinctCarrier) {
          if (P.type !== "user" && P.type !== "attachment") {
            continue;
          }
          let N = c.get(P.uuid);
          let W = N ? new Set([...M].filter(j => {
            let z = N.get(j);
            return z === undefined || z === d;
          })) : M;
          if (W.size === 0) {
            continue;
          }
          if (P.type === "attachment") {
            f ??= new Map();
            let j = f.get(P.uuid);
            if (j === undefined) {
              j = tgf(P.attachment, egf);
              f.set(P.uuid, j);
            }
            if (F = new Set([...W].filter(z => j.vZc(z))), F.size === 0) {
              continue;
            }
          } else if (!$Ko(P, W)) {
            if (!Qhf(P)) {
              continue;
            }
            if (m === undefined) {
              m = new Map();
              for (let K of i) {
                if (K.type !== "assistant" || !Array.isArray(K.message.content)) {
                  continue;
                }
                for (let J of K.message.content) {
                  if (J.type === "tool_use") {
                    m.set(J.id, J.name);
                  }
                }
              }
            }
            let j = Zhf(P, m);
            let z = [...W].filter(K => j.vZc(K));
            if (z.length === 0) {
              continue;
            }
            let V = c.get(P.uuid) ?? new Map();
            for (let K of z) {
              if (!V.vZc(K)) {
                V.set(K, d);
              }
            }
            c.set(P.uuid, V);
            break;
          } else {
            F = new Set([...W].filter(j => $Ko(P, new Set([j]))));
          }
        } else if (P.type !== "user" || !$Ko(P, M)) {
          if (Snn(P) || PZ(P) || P.type === "user" && P.isMeta) {
            continue;
          }
          break;
        } else {
          F = M;
        }
        let H = l.get(P.uuid);
        if (H) {
          for (let N of F) {
            H.add(N);
          }
        } else {
          l.set(P.uuid, new Set(F));
        }
        let U = c.get(P.uuid) ?? new Map();
        for (let N of F) {
          if (!U.vZc(N)) {
            U.set(N, O.healsDistinctCarrier ? d : 0);
          }
        }
        c.set(P.uuid, U);
        break;
      }
    }
    let h = [];
    let g = [];
    let y = false;
    function _() {
      if (g.length === 0) {
        return;
      }
      let I = g.join(`

`);
      g.length = 0;
      let O = _Gd(h);
      if (O?.type === "api_system") {
        O.message.content += `

${I}`;
      } else if (O?.type === "user") {
        y = true;
        h.push(ggf(I));
      } else {
        h.push(In({
          content: gR(I),
          isMeta: true
        }));
      }
    }
    for (let I of i) {
      if (I.type === "progress" || I.type === "system" && !TNo(I) || Snn(I)) {
        continue;
      }
      switch (I.type) {
        case "system":
          {
            let O = In({
              content: I.content,
              uuid: I.uuid,
              timestamp: I.timestamp
            });
            let M = _Gd(h);
            if (M?.type === "user") {
              h[h.length - 1] = Tmr(M, O);
              continue;
            }
            h.push(O);
            continue;
          }
        case "user":
          {
            let O = I;
            if (!P1()) {
              O = sKo(I);
            } else {
              O = zhf(I, s);
            }
            let M = l.get(O.uuid);
            if (M) {
              let F = Qgc(O, M);
              if (F === null) {
                continue;
              }
              O = F;
            }
            let L = O.message.content;
            if (Array.isArray(L) && !L.some(F => F.type === "text" && F.text.startsWith("Tool loaded.")) && Khf(L)) {
              O = {
                ...O,
                message: {
                  ...O.message,
                  content: [...L, {
                    type: "text",
                    text: "Tool loaded."
                  }]
                }
              };
            }
            if (o) {
              let F = hgf(O, o);
              if (F) {
                O = F.cleaned;
                g.push(...F.reminders);
              }
            }
            let P = _Gd(h);
            if (P?.type === "user") {
              h[h.length - 1] = Tmr(P, O);
              continue;
            }
            h.push(O);
            continue;
          }
        case "assistant":
          {
            let O = P1();
            let M = I.message.content;
            let L;
            for (let H = 0; H < M.length; H++) {
              let U = M[H];
              if (U.type !== "tool_use") {
                continue;
              }
              o?.set(U.id, U.name);
              let N = Cl(t, U.name);
              let W = N ? ghc(N, U.input) : U.input;
              let j = N?.name ?? U.name;
              if (O && W === U.input && j === U.name) {
                continue;
              }
              L ??= M.slice();
              L[H] = O ? {
                ...U,
                name: j,
                input: W
              } : {
                type: "tool_use",
                id: U.id,
                name: j,
                input: W
              };
            }
            let P = L ? {
              ...I,
              message: {
                ...I.message,
                content: L
              }
            } : I;
            let F = false;
            for (let H = h.length - 1; H >= 0; H--) {
              let U = h[H];
              if (U.type !== "assistant" && U.type !== "api_system" && !PZ(U)) {
                break;
              }
              if (U.type === "assistant") {
                if (U.message.id === P.message.id) {
                  h[H] = rgf(U, P);
                  F = true;
                  break;
                }
                continue;
              }
            }
            if (!F) {
              _();
              let H = P.message.content;
              let U = myc(H);
              h.push(U === H ? P : {
                ...P,
                message: {
                  ...P.message,
                  content: U
                }
              });
            }
            continue;
          }
        case "attachment":
          {
            let O = Grr(I.attachment);
            let M = l.get(I.uuid);
            if (M) {
              O = O.flatMap(F => {
                let H = Qgc(F, M);
                return H === null ? [] : [H];
              });
            }
            if (r) {
              let F = ygf(O);
              if (F !== null) {
                g.push(F);
                continue;
              }
            }
            let L = getFeatureValue_CACHED_MAY_BE_STALE("tengu_chair_sermon", false) ? O.map(Yhf) : O;
            let P = _Gd(h);
            if (P?.type === "user") {
              h[h.length - 1] = L.reduce((F, H) => ngf(F, H), P);
              continue;
            }
            h.push(...L);
            continue;
          }
      }
    }
    _();
    let S = kze(h);
    let E = Rgf(S);
    let C = xze(E);
    let x = xgf(C);
    let A;
    if (r) {
      A = y ? ogf(x) : x;
    } else if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_chair_sermon", false)) {
      A = uyc(fyc(x));
    } else {
      A = x;
    }
    return Jhf(A);
  }
  function ngf(e, t) {
    let n = Emr(e.message.content);
    let r = Emr(t.message.content);
    return {
      ...e,
      message: {
        ...e.message,
        content: hyc(igf(n, r))
      }
    };
  }
  function rgf(e, t) {
    let n = [...e.message.content, ...t.message.content].flatMap(i => {
      if (i.type !== "text" || typeof i.text === "string") {
        return [i];
      }
      logForDebugging(`mergeAssistantMessages: text block with non-string .text (id=${e.message.id}) \u2014 dropped`, {
        level: "warn"
      });
      return [];
    });
    let r = n.filter((i, a) => {
      if (i.type !== "text" || i.text.length === 0 || i.text.trim() !== "") {
        return true;
      }
      let l = n[a - 1]?.type;
      let c = n[a + 1]?.type;
      return (l === "thinking" || l === "redacted_thinking") && (c === "thinking" || c === "redacted_thinking");
    });
    let o = r.some(i => i.type !== "thinking" && i.type !== "redacted_thinking");
    let s = myc(o ? r : n);
    return {
      ...e,
      message: {
        ...e.message,
        content: s
      }
    };
  }
  function myc(e) {
    let t = a => e[a].type === "tool_use" || OQr(e[a]) && e[a + 1]?.type === "tool_use";
    let n = -1;
    let r = false;
    let o = false;
    let s = false;
    let i = false;
    for (let a = 0; a < e.length; a++) {
      let l = e[a].type;
      if (l === "tool_use") {
        if (n === -1) {
          n = a;
        }
        i = true;
      } else if (t(a)) {
        i = true;
      } else {
        if (n !== -1 && !OQr(e[a])) {
          r = true;
        }
        let c = l === "thinking" || l === "redacted_thinking";
        if (c && s && i) {
          o = true;
        }
        s = c;
        i = false;
      }
    }
    if (!r) {
      return e;
    }
    if (o) {
      logEvent("tengu_reorder_tool_uses_skipped_for_thinking", {
        contentLength: e.length,
        firstToolUseIdx: n
      });
      return e;
    }
    return [...e.filter((a, l) => !t(l)), ...e.filter((a, l) => t(l))];
  }
  function PZ(e) {
    if (e.type !== "user") {
      return false;
    }
    let t = e.message.content;
    if (typeof t === "string") {
      return false;
    }
    return t.some(n => n.type === "tool_result");
  }
  function Tmr(e, t) {
    let n = Emr(e.message.content);
    let r = Emr(t.message.content);
    return {
      ...e,
      uuid: e.isMeta ? t.uuid : e.uuid,
      message: {
        ...e.message,
        content: hyc(sgf(n, r))
      }
    };
  }
  function fyc(e) {
    let t = false;
    for (let r = 1; r < e.length; r++) {
      if (e[r].type === "user" && e[r - 1].type === "user") {
        t = true;
        break;
      }
    }
    if (!t) {
      return e;
    }
    let n = [];
    for (let r of e) {
      let o = n.at(-1);
      if (r.type === "user" && o?.type === "user") {
        n[n.length - 1] = Tmr(o, r);
      } else {
        n.push(r);
      }
    }
    return n;
  }
  function ogf(e) {
    let t;
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r.type !== "api_system") {
        t?.push(r);
        continue;
      }
      let o = t ? t.at(-1) : e[n - 1];
      let s = e[n + 1];
      if (o?.type === "api_system") {
        t ??= e.slice(0, n);
        o.message.content += `

${r.message.content}`;
        continue;
      }
      let i = o?.type === "user";
      let a = s === undefined || s.type === "assistant" || s.type === "api_system";
      if (i && a) {
        t?.push(r);
        continue;
      }
      t ??= e.slice(0, n);
      t.push(In({
        content: gR(r.message.content),
        isMeta: true
      }));
    }
    return t ? fyc(t) : e;
  }
  function hyc(e) {
    let t = [];
    let n = [];
    for (let r of e) {
      if (r.type === "tool_result") {
        t.push(r);
      } else {
        n.push(r);
      }
    }
    return [...t, ...n];
  }
  function Emr(e) {
    if (typeof e === "string") {
      return [{
        type: "text",
        text: e
      }];
    }
    return e;
  }
  function sgf(e, t) {
    let n = e.at(-1);
    let r = t[0];
    if (n?.type === "text" && r?.type === "text") {
      return [...e.slice(0, -1), {
        ...n,
        text: n.text + `
`
      }, ...t];
    }
    return [...e, ...t];
  }
  function HKo(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = e.content;
    if (Array.isArray(n) && n.some(isToolReferenceBlock)) {
      return null;
    }
    if (e.is_error) {
      if (t = t.filter(i => i.type === "text"), t.length === 0) {
        return e;
      }
    }
    if (t.every(i => i.type === "text") && (n === undefined || typeof n === "string")) {
      let i = [(n ?? "").trim(), ...t.map(a => a.text.trim())].filter(Boolean).join(`

`);
      return {
        ...e,
        content: i
      };
    }
    let o = n === undefined ? [] : typeof n === "string" ? n.trim() ? [{
      type: "text",
      text: n.trim()
    }] : [] : [...n];
    let s = [];
    for (let i of [...o, ...t]) {
      if (i.type === "text") {
        let a = i.text.trim();
        if (!a) {
          continue;
        }
        let l = s.at(-1);
        if (l?.type === "text") {
          s[s.length - 1] = {
            ...l,
            text: `${l.text}

${a}`
          };
        } else {
          s.push({
            type: "text",
            text: a
          });
        }
      } else {
        s.push(i);
      }
    }
    return {
      ...e,
      content: s
    };
  }
  function igf(e, t) {
    let n = _Gd(e);
    if (n?.type !== "tool_result") {
      return [...e, ...t];
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_chair_sermon", false)) {
      if (typeof n.content === "string" && t.every(i => i.type === "text")) {
        let i = e.slice();
        i[i.length - 1] = HKo(n, t);
        return i;
      }
      return [...e, ...t];
    }
    let r = t.filter(i => i.type !== "tool_result");
    let o = t.filter(i => i.type === "tool_result");
    if (r.length === 0) {
      return [...e, ...t];
    }
    let s = HKo(n, r);
    if (s === null) {
      return [...e, ...t];
    }
    return [...e.slice(0, -1), s, ...o];
  }
  function pnn(e, t, n, r) {
    if (!e) {
      return [];
    }
    return e.map(o => {
      switch (o.type) {
        case "tool_use":
          {
            if (typeof o.input !== "string" && !gZc(o.input)) {
              throw Error("Tool use input must be a string or object");
            }
            let s;
            if (typeof o.input === "string") {
              let i = Ba(o.input, false);
              if (i === null && o.input.trim() !== "null" && o.input.length > 0) {
                logEvent("tengu_tool_input_json_parse_fail", {
                  toolName: qi(o.name),
                  inputLen: o.input.length,
                  request_id: r?.requestId ?? "unknown",
                  messageID: r?.messageId ?? "unknown"
                });
                s = {
                  ["__unparsedToolInput"]: {
                    raw: pC(o.input, 2048),
                    len: o.input.length
                  }
                };
              } else {
                s = i ?? {};
              }
            } else {
              s = o.input;
            }
            if (typeof s === "object" && s !== null && !yje(s)) {
              let i = Cl(t, o.name);
              if (i) {
                try {
                  let a = omr(agf(s, i.inputSchema, i.inputJSONSchema));
                  s = a;
                  s = hhc(i, a, n);
                } catch (a) {
                  let l = `Error normalizing tool input (requestId=${r?.requestId ?? "unknown"}, messageId=${r?.messageId ?? "unknown"}): ${a}`;
                  if (a instanceof Error && a.name === "ZodError") {
                    logForDebugging(l, {
                      level: "error"
                    });
                  } else {
                    Oe(Error(l));
                  }
                }
              }
            }
            return {
              ...o,
              input: s
            };
          }
        case "text":
          if (o.text.trim().length === 0) {
            logEvent("tengu_model_whitespace_response", {
              length: o.text.length,
              request_id: r?.requestId ?? "unknown",
              messageID: r?.messageId ?? "unknown"
            });
          }
          return o;
        case "code_execution_tool_result":
        case "mcp_tool_use":
        case "mcp_tool_result":
        case "container_upload":
          return o;
        case "server_tool_use":
          if (typeof o.input === "string") {
            return {
              ...o,
              input: Ba(o.input, false) ?? {}
            };
          }
          return o;
        default:
          return o;
      }
    });
  }
  function Zgc(e) {
    return e === "array" || e === "object" || e === "integer" || e === "number" || e === "boolean";
  }
  function agf(e, t, n) {
    let r = e;
    let o = (i, a) => {
      let l = r[i];
      if (typeof l !== "string") {
        return;
      }
      let c = Ba(l, false);
      let u;
      switch (a) {
        case "array":
          u = Array.isArray(c);
          break;
        case "object":
          u = c !== null && typeof c === "object" && !Array.isArray(c);
          break;
        case "boolean":
          u = typeof c === "boolean";
          break;
        case "integer":
        case "number":
          u = typeof c === "number" && Number.isFinite(c) && String(c) === l && (a === "number" || Number.isInteger(c));
          break;
      }
      if (u) {
        if (r === e) {
          r = {
            ...e
          };
        }
        r[i] = c;
      }
    };
    let s = t._zod?.def;
    if (s?.type === "object" && s.shape) {
      for (let [i, a] of Object.entries(s.shape)) {
        let l = lgf(a._zod.def);
        if (Zgc(l)) {
          o(i, l);
        }
      }
    }
    if (n?.properties) {
      let i = n.$defs ?? n.definitions;
      for (let [a, l] of Object.entries(n.properties)) {
        let c = jKo(l, i);
        if (Zgc(c)) {
          o(a, c);
        }
      }
    }
    return r;
  }
  function jKo(e, t, n = new Set()) {
    if (n.size > 64 || n.vZc(e) || e === null || typeof e !== "object") {
      return;
    }
    n.add(e);
    let r = e;
    if (typeof r.type === "string") {
      return r.type;
    }
    let o = s => {
      let i;
      let a;
      let l = false;
      for (let c of s) {
        if (c === "array" || c === "object") {
          i ??= c;
        } else if (c === "string") {
          l = true;
        } else if (c !== undefined && c !== "null") {
          a ??= c;
        }
      }
      return i ?? (l ? "string" : a);
    };
    if (Array.isArray(r.type)) {
      let s = o(r.type.filter(i => typeof i === "string"));
      if (s !== undefined) {
        return s;
      }
    }
    if (typeof r.$ref === "string" && t) {
      let s = r.$ref.match(/^#\/(?:\$defs|definitions)\/([^/]+)$/);
      if (s && s[1]) {
        return jKo(t[s[1]], t, n);
      }
    }
    for (let s of [r.anyOf, r.oneOf]) {
      if (Array.isArray(s)) {
        let i = o(s.map(a => jKo(a, t, n)));
        if (i !== undefined) {
          return i;
        }
      }
    }
    return;
  }
  function lgf(e) {
    let t = e;
    while (t) {
      switch (t.type) {
        case "optional":
        case "nullable":
        case "default":
          if (!t.innerType) {
            return t.type;
          }
          t = t.innerType._zod.def;
          break;
        case "pipe":
          if (!t.in) {
            return t.type;
          }
          t = t.in._zod.def;
          break;
        default:
          return t.type;
      }
    }
    return "unknown";
  }
  function MQn(e) {
    return fLe(e).trim() === "" || e.trim() === "(no content)";
  }
  function fLe(e) {
    return e.replace(cgf, "").replace(/^\n+/, "");
  }
  function eCe(e) {
    switch (e.type) {
      case "attachment":
        if (Tnn(e)) {
          return e.attachment.toolUseID;
        }
        return null;
      case "assistant":
        if (e.message.content[0]?.type !== "tool_use") {
          return null;
        }
        return e.message.content[0].id;
      case "user":
        if (e.sourceToolUseID) {
          return e.sourceToolUseID;
        }
        if (e.message.content[0]?.type !== "tool_result") {
          return null;
        }
        return e.message.content[0].tool_use_id;
      case "progress":
        return e.toolUseID;
      case "system":
        return e.subtype === "informational" ? e.toolUseID ?? null : null;
    }
  }
  function Mbt(e, t, n) {
    let r = new Set();
    let o = new Set();
    for (let c of e) {
      if (c.type !== "user" && c.type !== "assistant") {
        continue;
      }
      let u = c.message.content;
      if (!Array.isArray(u)) {
        continue;
      }
      for (let d of u) {
        if (d.type === "tool_use") {
          r.add(d.id);
        }
        if (d.type === "tool_result") {
          o.add(d.tool_use_id);
        }
      }
    }
    let s = new Set([...r].filter(c => !o.vZc(c) && !t?.vZc(c)));
    if (s.size === 0) {
      return e;
    }
    if (n?.outSupersededToolUseIds) {
      for (let c = e.length - 1; c >= 0; c--) {
        let u = e[c];
        if (u.type === "system" || u.type === "progress" || u.type === "attachment") {
          continue;
        }
        if (u.type === "user") {
          let d = u.message.content;
          if (Array.isArray(d) && d.some(m => m.type === "tool_result")) {
            continue;
          }
          break;
        }
        if (u.type === "assistant" && Array.isArray(u.message.content)) {
          for (let d of u.message.content) {
            if (d.type === "tool_use" && s.vZc(d.id)) {
              n.outSupersededToolUseIds.add(d.id);
            }
          }
        }
      }
    }
    let i = new Set();
    let a = new Set();
    let l = e.filter(c => {
      if (c.type !== "assistant") {
        return true;
      }
      let u = c.message.content;
      if (!Array.isArray(u)) {
        return true;
      }
      let d = [];
      for (let p of u) {
        if (p.type === "tool_use") {
          d.push(p.id);
        }
      }
      if (d.length === 0) {
        return true;
      }
      if (d.every(p => s.vZc(p))) {
        if (n?.dropSiblingBlocks && c.message.id) {
          i.add(c.message.id);
        }
        return false;
      }
      if (n?.dropSiblingBlocks && c.message.id) {
        a.add(c.message.id);
      }
      return true;
    });
    for (let c of a) {
      i.delete(c);
    }
    if (!n?.dropSiblingBlocks || i.size === 0) {
      return l;
    }
    return l.filter(c => {
      if (c.type !== "assistant" || !c.message.id) {
        return true;
      }
      if (!i.vZc(c.message.id)) {
        return true;
      }
      let u = c.message.content;
      if (!Array.isArray(u)) {
        return true;
      }
      for (let d of u) {
        if (d.type === "tool_use") {
          return true;
        }
      }
      return false;
    });
  }
  function UG(e) {
    if (e.type !== "assistant") {
      return null;
    }
    if (Array.isArray(e.message.content)) {
      return e.message.content.map(t => {
        if (t.type === "text") {
          return t.text;
        }
        return "";
      }).filter(t => t !== "").join(`
`).trim() || null;
    }
    return null;
  }
  function qO(e) {
    if (e.type !== "user") {
      return null;
    }
    let t = e.message.content;
    return cZ(t);
  }
  function VKo(e) {
    let t = qO(e);
    if (t === null) {
      return null;
    }
    let n = Nl(t, "bash-input");
    if (n) {
      return {
        text: n,
        mode: "bash"
      };
    }
    let r = Nl(t, "command-name");
    if (r) {
      let o = Nl(t, "command-args") ?? "";
      return {
        text: `${r} ${o}`,
        mode: "prompt"
      };
    }
    return {
      text: RTs(t),
      mode: "prompt"
    };
  }
  function Tl(e, t = "") {
    return e.filter(n => n.type === "text").map(n => n.text).join(t);
  }
  function cZ(e) {
    if (typeof e === "string") {
      return e;
    }
    if (Array.isArray(e)) {
      return Tl(e, `
`).trim() || null;
    }
    return null;
  }
  function L9e(e) {
    return Math.round(e * 0.75);
  }
  function vnn(e) {
    return Math.ceil(e.length / 4);
  }
  function ugf(e) {
    return e.usage?.output_tokens ?? null;
  }
  function EBe(e, t) {
    let {
      onMessage: n,
      onTombstone: r,
      onStreamingThinking: o,
      onApiMetrics: s,
      onStreamingText: i
    } = t;
    if (!tKe(e)) {
      if (e.type === "tombstone") {
        r?.(e.message);
        return;
      }
      if (e.type === "tool_use_summary") {
        return;
      }
      if (e.type === "notification") {
        t.onNotification?.(e.notification);
        return;
      }
      if (e.type === "set_expanded_view") {
        t.onExpandedView?.(e.expandedView);
        return;
      }
      if (e.type === "post_turn_summary") {
        t.onPostTurnSummary?.(e.value);
        return;
      }
      if (e.type === "active_goal") {
        t.onActiveGoal?.(e.value);
        return;
      }
      if (e.type === "set_in_progress_tool_use_ids") {
        t.onInProgressToolUseIDs?.(e.op);
        return;
      }
      if (e.type === "conversation_reset") {
        t.onConversationReset?.(e.newConversationId);
        return;
      }
      if (e.type === "hint_clears") {
        t.onHintClears?.(e);
        return;
      }
      if (e.type === "refusal_continuation") {
        t.onRefusalContinuation?.(e);
        return;
      }
      if (e.type === "interruptible_tool_in_progress") {
        t.onInterruptibleToolInProgress?.(e.inProgress);
        return;
      }
      if (e.type === "api_metrics") {
        s?.(e.event);
        return;
      }
      if (e.type === "os_notification") {
        t.onOSNotification?.(e);
        return;
      }
      if (e.type === "open_message_selector") {
        return;
      }
      if (e.type === "apply_flag_settings") {
        t.onApplyFlagSettings?.(e.settings);
        return;
      }
      if (e.type === "command_lifecycle") {
        t.onCommandLifecycle?.(e.uuid, e.state);
        return;
      }
      if (e.type === "assistant") {
        let a = e.message.content.find(l => l.type === "thinking");
        if (a && a.type === "thinking") {
          o?.(() => ({
            thinking: a.thinking,
            isStreaming: false,
            streamingEndedAt: Date.now()
          }));
        }
      }
      if (e.type === "assistant") {
        t.displayTransform?.entryLanded(e);
      }
      i?.(() => null);
      n(e);
      return;
    }
    CNo(e, t);
  }
  function CNo(e, t, n) {
    let {
      onSetStreamMode: r,
      onApiMetrics: o,
      onUpdateLength: s,
      onStreamingToolUses: i,
      onStreamingText: a,
      onCompactEvent: l,
      onResponseLength: c,
      displayTransform: u
    } = t;
    if (Gyl(e)) {
      l?.(e);
      return;
    }
    if (e.type === "response_length") {
      c?.(e);
      return;
    }
    if (e.type === "stream_request_start") {
      r?.("requesting");
      return;
    }
    if (e.event.type === "ping") {
      return;
    }
    if (e.event.type === "message_start") {
      if (e.ttftMs != null) {
        o?.({
          type: "start",
          ttftMs: e.ttftMs,
          messageId: e.event.message.id
        });
      }
      i?.(d => d.length > 0 ? [] : d);
      CMo();
      a?.(d => d !== null ? null : d);
      u?.begin(e.event.message.id);
    }
    if (e.event.type === "message_stop") {
      u?.finalize();
      r?.("tool-use");
      i?.(() => []);
      return;
    }
    switch (e.event.type) {
      case "content_block_start":
        switch (o?.({
          type: "content_block_start"
        }), a?.(() => null), e.event.content_block.type) {
          case "thinking":
          case "redacted_thinking":
            r?.("thinking");
            return;
          case "text":
            r?.("responding");
            return;
          case "tool_use":
            {
              r?.("tool-input");
              let d = e.event.content_block;
              let p = e.event.index;
              try {
                if (JSON.stringify(d).length > 32768) {
                  return;
                }
              } catch {
                return;
              }
              i?.(m => {
                let f = m.findIndex(g => g.index === p);
                let h = {
                  index: p,
                  contentBlock: d
                };
                if (f !== -1) {
                  return m.with(f, h);
                }
                return m.length >= 256 ? m : [...m, h];
              });
              return;
            }
          case "server_tool_use":
          case "web_search_tool_result":
          case "code_execution_tool_result":
          case "mcp_tool_use":
          case "mcp_tool_result":
          case "container_upload":
          case "web_fetch_tool_result":
          case "bash_code_execution_tool_result":
          case "text_editor_code_execution_tool_result":
          case "tool_search_tool_result":
          case "advisor_tool_result":
          case "compaction":
            r?.("tool-input");
            return;
        }
        return;
      case "content_block_delta":
        switch (e.event.delta.type) {
          case "text_delta":
            {
              let d = e.event.delta.text;
              s?.(d.length);
              a?.(p => {
                let m = p?.length ?? 0;
                if (m >= 1e6) {
                  return p;
                }
                return (p ?? "") + d.slice(0, 1e6 - m);
              });
              u?.delta(d);
              return;
            }
          case "input_json_delta":
            {
              s?.(e.event.delta.partial_json.length);
              RMo(e.event.index, e.event.delta.partial_json, i);
              return;
            }
          case "thinking_delta":
            {
              let {
                delta: d
              } = e.event;
              if ("estimated_tokens" in d && typeof d.estimated_tokens === "number") {
                o?.({
                  type: "thinking_progress",
                  estimatedTokensDelta: d.estimated_tokens
                });
              } else if ("thinking" in d && typeof d.thinking === "string" && d.thinking.length > 0) {
                o?.({
                  type: "thinking_progress",
                  estimatedTokensDelta: vnn(d.thinking)
                });
              }
              return;
            }
          case "signature_delta":
            o?.({
              type: "thinking_signature",
              chars: L9e(e.event.delta.signature.length)
            });
            return;
          default:
            return;
        }
      case "content_block_stop":
        return;
      case "message_delta":
        {
          r?.("responding");
          let d = ugf(e.event);
          if (d != null) {
            o?.({
              type: "end",
              outputTokens: d
            });
          } else {
            logEvent("tengu_message_delta_usage_missing", {
              is_subagent: n?.isSubagent === true
            });
          }
          return;
        }
      default:
        r?.("responding");
        return;
    }
  }
  function gR(e) {
    return `<system-reminder>
${e}
</system-reminder>`;
  }
  function lsr(e) {
    return e.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r", "&#13;").replaceAll(`
`, "&#10;");
  }
  function gyc(e) {
    return e.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
  }
  function qKo(e) {
    let t = /^<system-reminder>\n?([\s\S]*?)\n?<\/system-reminder>$/.exec(e);
    return t ? t[1] : e;
  }
  function hgf(e, t) {
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return null;
    }
    let r;
    let o;
    for (let s = 0; s < n.length; s++) {
      let i = n[s];
      if (i.type !== "tool_result" || !Array.isArray(i.content)) {
        continue;
      }
      let a = t.get(i.tool_use_id);
      let l = a?.startsWith("mcp__") ? ii(a.slice(5), "__") : undefined;
      if (l === undefined || !mgf.vZc(l.toLowerCase().replace(/_/g, "-"))) {
        continue;
      }
      let c;
      for (let u = 0; u < i.content.length; u++) {
        let d = i.content[u];
        if (d.type === "text") {
          let p = d.text.trim();
          let m = qKo(p);
          if (m !== p && fgf.vZc(m)) {
            (r ??= []).push(m);
            c ??= i.content.slice(0, u);
            continue;
          }
        }
        c?.push(d);
      }
      if (c) {
        (o ??= n.slice())[s] = {
          ...i,
          content: c.length > 0 ? c : [{
            type: "text",
            text: "(no content)"
          }]
        };
      }
    }
    if (!r) {
      return null;
    }
    return {
      cleaned: {
        ...e,
        message: {
          ...e.message,
          content: o
        }
      },
      reminders: r
    };
  }
  function ggf(e) {
    return {
      type: "api_system",
      message: {
        role: "system",
        content: e
      },
      uuid: vL.randomUUID(),
      timestamp: new Date().toISOString()
    };
  }
  function ygf(e) {
    let t = [];
    for (let r of e) {
      let o = r.message.content;
      if (typeof o === "string") {
        t.push(qKo(o));
        continue;
      }
      for (let s of o) {
        if (s.type !== "text") {
          return null;
        }
        t.push(qKo(s.text));
      }
    }
    let n = t.join(`
`);
    return n.trim().length > 0 ? n : null;
  }
  function wp(e) {
    return e.map(t => {
      if (typeof t.message.content === "string") {
        return {
          ...t,
          message: {
            ...t.message,
            content: gR(t.message.content)
          }
        };
      } else if (Array.isArray(t.message.content)) {
        let n = t.message.content.map(r => {
          if (r.type === "text") {
            return {
              ...r,
              text: gR(r.text)
            };
          }
          return r;
        });
        return {
          ...t,
          message: {
            ...t.message,
            content: n
          }
        };
      }
      return t;
    });
  }
  function _gf(e) {
    if (e.isSubAgent) {
      return Egf(e);
    }
    if (e.reminderType === "sparse") {
      return Tgf(e);
    }
    return Sgf(e);
  }
  function nyc() {
    return `At the very end of your turn, once you have asked the user questions and are happy with your final plan file - you should always call ${qU.name} to indicate to the user that you are done planning.
This is critical - your turn should only end with either using the ${"AskUserQuestion"} tool OR calling ${qU.name}. Do not stop unless it's for these 2 reasons

**Important:** Use ${"AskUserQuestion"} ONLY to clarify requirements or choose between approaches. Use ${qU.name} to request plan approval. Do NOT ask about plan approval in any other way - no text questions, no AskUserQuestion. Phrases like "Is this plan okay?", "Should I proceed?", "How does this plan look?", "Any changes before we start?", or similar MUST use ${qU.name}.`;
  }
  function Sgf(e) {
    if (e.isSubAgent) {
      return [];
    }
    let t = e.planExists ? `A plan file already exists at ${e.planFilePath}. You can read it and make incremental edits using the ${iR.name} tool.` : `No plan file exists yet. You should create your plan at ${e.planFilePath} using the ${Nw.name} tool.`;
    if (e.customInstructions) {
      let l = `${"Plan mode is active. The user indicated that they do not want you to execute yet -- you MUST NOT make any edits (with the exception of the plan file mentioned below), run any non-readonly tools (including changing configs or making commits), or otherwise make any changes to the system. This supercedes any other instructions you have received."}

## Plan File Info:
${t}
You should build your plan incrementally by writing to or editing this file. NOTE that this is the only file you are allowed to edit - other than this you are only allowed to take READ-ONLY actions.

## Plan Workflow

${e.customInstructions}

### Call ${qU.name}
${nyc()}`;
      return wp([In({
        content: l,
        isMeta: true
      })]);
    }
    let n = zgc();
    let r = Kgc();
    let o = lvt();
    let s = o ? `### Phase 1: Initial Understanding
Goal: Gain a comprehensive understanding of the user's request by reading through code and asking them questions. Critical: In this phase you should only use the ${$me.agentType} subagent type.

1. Focus on understanding the user's request and the code associated with their request. Actively search for existing functions, utilities, and patterns that can be reused \u2014 avoid proposing new code when suitable implementations already exist.

2. **Launch up to ${r} ${$me.agentType} agents IN PARALLEL** (single message, multiple tool calls) to efficiently explore the codebase.
   - Use 1 agent when the task is isolated to known files, the user provided specific file paths, or you're making a small targeted change.
   - Use multiple agents when: the scope is uncertain, multiple areas of the codebase are involved, or you need to understand existing patterns before planning.
   - Quality over quantity - ${r} agents maximum, but you should try to use the minimum number of agents necessary (usually just 1)
   - If using multiple agents: Provide each agent with a specific search focus or area to explore. Example: One agent searches for existing implementations, another explores related components, a third investigating testing patterns` : `### Phase 1: Initial Understanding
Goal: Gain a comprehensive understanding of the user's request by reading through code and asking them questions.

1. Focus on understanding the user's request and the code associated with their request. Actively search for existing functions, utilities, and patterns that can be reused \u2014 avoid proposing new code when suitable implementations already exist.

2. Read and explore the relevant files directly to efficiently understand the codebase.`;
    let i = o ? `### Phase 2: Design
Goal: Design an implementation approach.

Launch ${Kor.agentType} agent(s) to design the implementation based on the user's intent and your exploration results from Phase 1.

You can launch up to ${n} agent(s) in parallel.

**Guidelines:**
- **Default**: Launch at least 1 Plan agent for most tasks - it helps validate your understanding and consider alternatives
- **Skip agents**: Only for truly trivial tasks (typo fixes, single-line changes, simple renames)
${n > 1 ? `- **Multiple agents**: Use up to ${n} agents for complex tasks that benefit from different perspectives

Examples of when to use multiple agents:
- The task touches multiple parts of the codebase
- It's a large refactor or architectural change
- There are many edge cases to consider
- You'd benefit from exploring different approaches

Example perspectives by task type:
- New feature: simplicity vs performance vs maintainability
- Bug fix: root cause vs workaround vs prevention
- Refactoring: minimal change vs clean architecture
` : ""}
In the agent prompt:
- Provide comprehensive background context from Phase 1 exploration including filenames and code path traces
- Describe requirements and constraints
- Request a detailed implementation plan` : `### Phase 2: Design
Goal: Design an implementation approach based on the user's intent and your exploration results from Phase 1.

- Provide comprehensive background context from Phase 1 exploration including filenames and code path traces
- Describe requirements and constraints
- Produce a detailed implementation plan`;
    let a = `${"Plan mode is active. The user indicated that they do not want you to execute yet -- you MUST NOT make any edits (with the exception of the plan file mentioned below), run any non-readonly tools (including changing configs or making commits), or otherwise make any changes to the system. This supercedes any other instructions you have received."}

## Plan File Info:
${t}
You should build your plan incrementally by writing to or editing this file. NOTE that this is the only file you are allowed to edit - other than this you are only allowed to take READ-ONLY actions.

## Plan Workflow

${s}

${i}

### Phase 3: Review
Goal: Review the plan(s) from Phase 2 and ensure alignment with the user's intentions.
1. Read the critical files you identified during exploration to deepen your understanding
2. Ensure that the plans align with the user's original request
3. Use ${"AskUserQuestion"} to clarify any remaining questions with the user

${bgf}

### Phase 5: Call ${qU.name}
${nyc()}

NOTE: At any point in time through this workflow you should feel free to ask the user questions or clarifications using the ${"AskUserQuestion"} tool. Don't make large assumptions about user intent. The goal is to present a well researched plan to the user, and tie any loose ends before implementation begins.`;
    return wp([In({
      content: a,
      isMeta: true
    })]);
  }
  function Tgf(e) {
    let t = e.customInstructions ? "Follow the plan workflow described earlier." : "Follow 5-phase workflow.";
    let n = `Plan mode still active (see full instructions earlier in conversation). Read-only except plan file (${e.planFilePath}). ${t} End turns with ${"AskUserQuestion"} (for clarifications) or ${qU.name} (for plan approval). Never ask about plan approval via text or AskUserQuestion.`;
    return wp([In({
      content: n,
      isMeta: true
    })]);
  }
  function Egf(e) {
    let n = `Plan mode is active. The user indicated that they do not want you to execute yet -- you MUST NOT make any edits, run any non-readonly tools (including changing configs or making commits), or otherwise make any changes to the system. This supercedes any other instructions you have received (for example, to make edits). Instead, you should:

## Plan File Info:
${e.planExists ? `A plan file already exists at ${e.planFilePath}. You can read it and make incremental edits using the ${iR.name} tool if you need to.` : `No plan file exists yet. You should create your plan at ${e.planFilePath} using the ${Nw.name} tool if you need to.`}
You should build your plan incrementally by writing to or editing this file. NOTE that this is the only file you are allowed to edit - other than this you are only allowed to take READ-ONLY actions.
Answer the user's query comprehensively, using the ${"AskUserQuestion"} tool if you need to ask the user clarifying questions. If you do use the ${"AskUserQuestion"}, make sure to ask all clarifying questions you need to fully understand the user's intent before proceeding.`;
    return wp([In({
      content: n,
      isMeta: true
    })]);
  }
  function oyc(e) {
    return e.length > 2000 ? e.substring(0, 2000) + `
... (truncated)` : e;
  }
  function Grr(e) {
    if (isAgentSwarmsEnabled()) {
      if (e.type === "teammate_mailbox") {
        return [In({
          content: Uhf().formatTeammateMessages(e.messages, {
            recipientIsLead: e.recipientIsLead ?? false
          }),
          isMeta: true
        })];
      }
      if (e.type === "team_context") {
        return [In({
          content: `<system-reminder>
# Team Coordination

You are a teammate in this session's agent team.

**Your Identity:**
- Name: ${e.agentName}

**Team Resources:**
- Team config: ${e.teamConfigPath}
- Task list: ${e.taskListPath}

**Team Leader:** The team lead's name is "team-lead". Send updates and completion notifications to them.

Read the team config to discover your teammates' names. Check the task list periodically. Create new tasks when work should be divided. Mark tasks resolved when complete.

**IMPORTANT:** Always refer to active teammates by their NAME (e.g., "team-lead", "analyzer", "researcher"). Use an \`agentId\` (format \`a...-...\`, from the spawn result) only to resume a background agent that has already completed. When messaging, use the name directly:

\`\`\`json
{
  "to": "team-lead",
  "message": "Your message here",
  "summary": "Brief 5-10 word preview"
}
\`\`\`
</system-reminder>`,
          isMeta: true
        })];
      }
    }
    if (e.type in syc) {
      return syc[e.type](e);
    }
    switch (e.type) {
      case "file":
        {
          let n = e.content;
          switch (n.type) {
            case "image":
              return wp([bnn(iy.name, {
                file_path: e.filename
              }), _nn(iy, n)]);
            case "text":
              return wp([bnn(iy.name, {
                file_path: e.filename
              }), _nn(iy, n), ...(e.truncated ? [In({
                content: `Note: The file ${e.filename} was too large and has been truncated to the first ${2000} lines. Don't tell the user about this truncation. Use ${iy.name} to read more of the file if you need.`,
                isMeta: true
              })] : [])]);
            case "notebook":
              return wp([bnn(iy.name, {
                file_path: e.filename
              }), _nn(iy, n)]);
            case "pdf":
              return wp([bnn(iy.name, {
                file_path: e.filename
              }), _nn(iy, n)]);
          }
          break;
        }
      case "invoked_skills":
        {
          if (e.skills.length === 0) {
            return [];
          }
          let n = e.skills.map(r => `### Skill: ${r.name}
Path: ${r.path}

${r.content}`).join(`

---

`);
          return wp([In({
            content: `The following skills were invoked EARLIER in this session (before the conversation was compacted), not on the current turn. They are shown here for context only so you remain aware of their guidelines.

IMPORTANT: Do NOT re-execute these skills or perform their one-time setup actions (e.g., scheduling, creating files) again. The "## Input" sections below reflect the original arguments from when each skill was first invoked \u2014 they are NOT the user's current message. Only continue to apply ongoing behavioral guidelines from these skills where still relevant.

${n}`,
            isMeta: true
          })]);
        }
      case "todo_reminder":
        {
          let n = e.content.map((o, s) => `${s + 1}. [${o.status}] ${o.content}`).join(`
`);
          let r = `The TodoWrite tool hasn't been used recently. If you're working on tasks that would benefit from tracking progress, consider using the TodoWrite tool to track progress. Also consider cleaning up the todo list if has become stale and no longer matches what you are working on. Only use it if it's relevant to the current work. This is just a gentle reminder - ignore if not applicable.
`;
          if (n.length > 0) {
            r += `

Here are the existing contents of your todo list:

[${n}]`;
          }
          return wp([In({
            content: r,
            isMeta: true
          })]);
        }
      case "task_reminder":
        {
          if (!sR()) {
            return [];
          }
          let n = e.content.map(o => `#${o.id}. [${o.status}] ${o.subject}`).join(`
`);
          let r = `The task tools haven't been used recently. If you're working on tasks that would benefit from tracking progress, consider using ${"TaskCreate"} to add new tasks and ${"TaskUpdate"} to update task status (set to in_progress when starting, completed when done). Also consider cleaning up the task list if it has become stale. Only use these if relevant to the current work. This is just a gentle reminder - ignore if not applicable.
`;
          if (n.length > 0) {
            r += `

Here are the existing tasks:

${n}`;
          }
          return wp([In({
            content: r,
            isMeta: true
          })]);
        }
      case "tool_search_usage_reminder":
        {
          let n = e.undiscoveredToolNames;
          if (n.length === 0) {
            return [];
          }
          let r = e.undiscoveredCount - n.length;
          let o = n.join(", ") + (r > 0 ? ` (+${r} more)` : "");
          return wp([In({
            content: `Some available tools' schemas are not loaded in this conversation yet: ${o}. Before concluding a capability is missing or building a workaround, use ${"ToolSearch"} to find and load relevant tools \u2014 keywords to search, or query "select:<name>[,<name>...]" for specific tools. Calling a tool before its schema is loaded will fail. This is just a gentle reminder - ignore if not applicable to the current work.`,
            isMeta: true
          })]);
        }
      case "relevant_memories":
        return wp(e.memories.map((r, o) => {
          let s = r.header ?? memoryHeader(r.path, r.mtimeMs);
          return In({
            content: `${o === 0 ? `Retrieved for possible relevance \u2014 use only if it actually applies to what the user asked.

` : ""}${s}

${r.content}`,
            isMeta: true
          });
        }));
      case "queued_command":
        {
          if (e.renderedByBatchHead) {
            return [];
          }
          let n = e.origin ?? (e.commandMode === "task-notification" ? {
            kind: "task-notification"
          } : undefined);
          let r = n !== undefined && !BG(n) || e.isMeta ? {
            isMeta: true
          } : {};
          if (e.batchedRelayPrompts) {
            let o = e.batchedRelayPrompts.join(`

`);
            return wp([In({
              content: `${JKo}${o}`,
              ...r,
              origin: n,
              uuid: e.source_uuid
            })]);
          }
          if (Array.isArray(e.prompt)) {
            let o = e.prompt.filter(a => a.type === "text").map(a => a.text).join(`
`);
            let s = e.prompt.filter(a => a.type === "image");
            let i = [{
              type: "text",
              text: aKe(o, n, {
                verifiedSlackHumanTurn: e.verifiedSlackHumanTurn
              })
            }, ...s];
            return wp([In({
              content: i,
              ...r,
              origin: n,
              uuid: e.source_uuid
            })]);
          }
          return wp([In({
            content: aKe(String(e.prompt), n, {
              verifiedSlackHumanTurn: e.verifiedSlackHumanTurn
            }),
            ...r,
            origin: n,
            uuid: e.source_uuid
          })]);
        }
      case "diagnostics":
        {
          if (e.files.length === 0) {
            return [];
          }
          return wp([In({
            content: g9.formatDiagnosticsBlock(e.files),
            isMeta: true
          })]);
        }
      case "plan_mode":
        return _gf(e);
      case "plan_mode_reentry":
        {
          let n = `## Re-entering Plan Mode

You are returning to plan mode after having previously exited it. A plan file exists at ${e.planFilePath} from your previous planning session.

**Before proceeding with any new planning, you should:**
1. Read the existing plan file to understand what was previously planned
2. Evaluate the user's current request against that plan
3. Decide how to proceed:
   - **Different task**: If the user's request is for a different task\u2014even if it's similar or related\u2014start fresh by overwriting the existing plan
   - **Same task, continuing**: If this is explicitly a continuation or refinement of the exact same task, modify the existing plan while cleaning up outdated or irrelevant sections
4. Continue on with the plan process and most importantly you should always edit the plan file one way or the other before calling ${qU.name}

Treat this as a fresh planning session. Do not assume the existing plan is relevant without evaluating it first.`;
          return wp([In({
            content: n,
            isMeta: true
          })]);
        }
      case "auto_mode":
        return wp([In({
          content: `## ${"Auto Mode Active"}

Bias toward working without stopping for clarifying questions \u2014 when you'd normally pause to check, make the reasonable call and keep going; they'll redirect you if needed. If the user, a skill, or the shape of the task suggests they want you to ask (with ${"AskUserQuestion"} or otherwise), do so. And even absent that signal, it's still fine to stop when you're genuinely blocked \u2014 unclear direction, missing input, a decision only they can make.

Before any command that could discard uncommitted work \u2014 \`git checkout\`/\`restore\`/\`reset\`/\`clean\`, \`rm -rf\` in the repo, restoring from a snapshot \u2014 run \`git status\` first and stash (with \`-u\` for untracked) or commit anything that's there.`,
          isMeta: true
        })]);
      case "mcp_resource":
        {
          let n = e.content;
          if (!n || !n.contents || n.contents.length === 0) {
            return wp([In({
              content: `<mcp-resource server="${e.server}" uri="${e.uri}">(No content)</mcp-resource>`,
              isMeta: true
            })]);
          }
          let r = [];
          for (let o of n.contents) {
            if (o && typeof o === "object") {
              if ("text" in o && typeof o.text === "string") {
                r.push({
                  type: "text",
                  text: "Full contents of resource:"
                }, {
                  type: "text",
                  text: o.text
                }, {
                  type: "text",
                  text: "Do NOT read this resource again unless you think it may have changed, since you already have the full contents."
                });
              } else if ("blob" in o) {
                let s = "mimeType" in o ? String(o.mimeType) : "application/octet-stream";
                r.push({
                  type: "text",
                  text: `[Binary content: ${s}]`
                });
              }
            }
          }
          if (r.length > 0) {
            return wp([In({
              content: r,
              isMeta: true
            })]);
          } else {
            dn(e.server, `No displayable content found in MCP resource ${e.uri}.`);
            return wp([In({
              content: `<mcp-resource server="${e.server}" uri="${e.uri}">(No displayable content)</mcp-resource>`,
              isMeta: true
            })]);
          }
        }
      case "task_status":
        {
          let n = e.status === "killed" ? "stopped" : e.status;
          if (e.status === "killed") {
            return [In({
              content: gR(`Task "${e.description}" (${e.taskId}) was stopped by the user.`),
              isMeta: true
            })];
          }
          if (e.status === "running") {
            let o = [`Background agent "${e.description}" (${e.taskId}) is still running.`];
            if (e.deltaSummary) {
              o.push(`Progress: ${e.deltaSummary}`);
            }
            if (e.outputFilePath) {
              o.push(`Do NOT spawn a duplicate. You will be notified when it completes. You can read partial output at ${e.outputFilePath} or send it a message with ${"SendMessage"}.`);
            } else {
              o.push(`Do NOT spawn a duplicate. You will be notified when it completes. You can check its progress with the ${"TaskOutput"} tool or send it a message with ${"SendMessage"}.`);
            }
            return [In({
              content: gR(o.join(" ")),
              isMeta: true
            })];
          }
          let r = [`Task ${e.taskId}`, `(type: ${e.taskType})`, `(status: ${n})`, `(description: ${e.description})`];
          if (e.deltaSummary) {
            r.push(`Delta: ${e.deltaSummary}`);
          }
          if (e.outputFilePath) {
            r.push(`Read the output file to retrieve the result: ${e.outputFilePath}`);
          } else {
            r.push(`You can check its output using the ${"TaskOutput"} tool.`);
          }
          return [In({
            content: gR(r.join(" ")),
            isMeta: true
          })];
        }
      case "async_hook_response":
        {
          let n = e.response;
          let r = [];
          if (n.systemMessage) {
            r.push(In({
              content: n.systemMessage,
              isMeta: true
            }));
          }
          if (n.hookSpecificOutput && "additionalContext" in n.hookSpecificOutput && n.hookSpecificOutput.additionalContext) {
            r.push(In({
              content: n.hookSpecificOutput.additionalContext,
              isMeta: true
            }));
          }
          return wp(r);
        }
      case "hook_success":
        if (e.hookEvent !== "SessionStart" && e.hookEvent !== "UserPromptSubmit" && e.hookEvent !== "UserPromptExpansion") {
          return [];
        }
        if (e.content === "") {
          return [];
        }
        return [In({
          content: gR(`${e.hookName} hook success: ${e.content}`),
          isMeta: true
        })];
      case "context_efficiency":
        return [];
      case "fold_nudge":
        return [];
      case "deferred_tools_delta":
        {
          let n = [];
          if (e.addedLines.length > 0) {
            n.push(`The following deferred tools are now available via ${"ToolSearch"}. Their schemas are NOT loaded \u2014 calling them directly will fail with InputValidationError. Use ${"ToolSearch"} with query "select:<name>[,<name>...]" to load tool schemas before calling them:
${e.addedLines.join(`
`)}`);
          }
          let r = e.readdedNames ?? [];
          if (r.length > 0) {
            n.push(`${r.length} deferred tool${r.length === 1 ? " is" : "s are"} available again (MCP server reconnected \u2014 names announced earlier in this conversation): ${summarizeByServerPrefix(r)}. Load via ${"ToolSearch"} as before.`);
          }
          if (e.removedNames.length > 0) {
            n.push(e.removedNames.length > 30 ? `${e.removedNames.length} deferred tools are no longer available (MCP server disconnected): ${summarizeByServerPrefix(e.removedNames)}. Do not search for them \u2014 ${"ToolSearch"} will return no match.` : `The following deferred tools are no longer available (their MCP server disconnected). Do not search for them \u2014 ${"ToolSearch"} will return no match:
${e.removedNames.join(`
`)}`);
            n.push("This is ambient context \u2014 do not narrate it to the user unless they ask or it is directly relevant to their request.");
          }
          let o = e.needsAuthMcpServers ?? [];
          if (o.length > 0) {
            let i = o.length > 30 ? `${o.slice(0, 30).join(", ")}, \u2026and ${o.length - 30} more` : o.join(`
`);
            n.push(`The following MCP servers require authentication before their tools can be used:
${i}

This session is non-interactive, so Claude cannot run the OAuth flow here. Tell the user that these servers need to be authorized \u2014 for claude.ai connectors, via their claude.ai connector settings; for other servers, via \`claude mcp\` or /mcp in an interactive session \u2014 and that the capability is unavailable until they do. Do not ask the user for authorization codes, tokens, or callback URLs.`);
          }
          let s = e.pendingMcpServers ?? [];
          if (s.length > 0) {
            let i = s.length > 30 ? `${s.slice(0, 30).join(", ")}, \u2026and ${s.length - 30} more` : s.join(`
`);
            n.push(`The following MCP servers are still connecting \u2014 their tools (typically named mcp__<server>__*) are not yet available but will appear shortly:
${i}

If the user's request might be served by one of these servers (even if they didn't name it explicitly), call ${"ToolSearch"} with a relevant keyword \u2014 ${"ToolSearch"} will wait for connecting servers and search their tools once available. Do not report a capability as unavailable without first searching.`);
          }
          if (n.length === 0) {
            return [];
          }
          return wp([In({
            content: n.join(`

`),
            isMeta: true
          })]);
        }
      case "agent_listing_delta":
        {
          let n = [];
          if (e.addedLines.length > 0) {
            let r = e.isInitial ? "Available agent types for the Agent tool:" : "New agent types are now available for the Agent tool:";
            n.push(`${r}
${e.addedLines.join(`
`)}`);
          }
          if (e.removedTypes.length > 0) {
            n.push(`The following agent types are no longer available:
${e.removedTypes.map(r => `- ${r}`).join(`
`)}`);
            n.push("This is ambient context \u2014 do not narrate it to the user unless they ask or it is directly relevant to their request.");
          }
          if (e.isInitial && e.showConcurrencyNote) {
            n.push("When you launch multiple agents for independent work, send them in a single message with multiple tool uses so they run concurrently.");
          }
          return wp([In({
            content: n.join(`

`),
            isMeta: true
          })]);
        }
      case "mcp_instructions_delta":
        {
          let n = [];
          let r = e.addedBlocks ?? [];
          if (r.length > 0) {
            n.push(`# MCP Server Instructions

The following MCP servers have provided instructions for how to use their tools and resources:

${r.join(`

`)}`);
          }
          if (e.removedNames.length > 0) {
            n.push(`The following MCP servers have disconnected. Their instructions above no longer apply:
${e.removedNames.join(`
`)}`);
            n.push("This is ambient context \u2014 do not narrate it to the user unless they ask or it is directly relevant to their request.");
          }
          return wp([In({
            content: n.join(`

`),
            isMeta: true
          })]);
        }
      case "memory_update":
        {
          let r = [`${wgf[e.source]} updated your memory directory: ${e.summary}`];
          if (e.paths.length > 0) {
            r.push(`Files changed: ${e.paths.join(", ")}`);
          }
          if (e.inContextPaths.length > 0) {
            r.push(`Your loaded copy of ${e.inContextPaths.join(", ")} is now stale relative to disk \u2014 Read it again if you need current contents.`);
          }
          r.push("This is ambient context \u2014 do not narrate it to the user unless they ask or it is directly relevant to their request.");
          return wp([In({
            content: r.join(`
`),
            isMeta: true
          })]);
        }
    }
    if (["autocheckpointing", "background_task_status", "todo", "task_progress", "ultramemory", "compaction_reminder", "current_session_memory", "thinking_reminder", "companion_intro", "pen_mode_enter", "pen_mode_exit", "ultrawork_request", "echo_activities", "verify_plan_reminder"].includes(e.type)) {
      return [];
    }
    logAntError("normalizeAttachmentForAPI", Error(`Unknown attachment type: ${e.type}`));
    return [];
  }
  function Imc(e) {
    if (typeof e !== "object" || e === null) {
      return e;
    }
    let t = e;
    if (typeof t.originalFile === "string" && t.originalFile.length > 1e4) {
      return {
        ...t,
        originalFile: null
      };
    }
    return e;
  }
  function yyc(e, t, n = 200) {
    let r = e.length - n;
    if (r <= 0) {
      return e;
    }
    let o = new Map();
    let s;
    for (let i = 0; i < e.length; i++) {
      let a = e[i];
      if (a.type === "assistant" && Array.isArray(a.message.content)) {
        for (let d of a.message.content) {
          if (d.type === "tool_use") {
            let p = Cl(t, d.name);
            if (p?.stripForStorage) {
              o.set(d.id, p);
            }
          }
        }
        continue;
      }
      if (i >= r || a.type !== "user" || a.isVirtual || a.toolUseResult == null || !Array.isArray(a.message.content)) {
        continue;
      }
      let l = a.message.content.find(d => d.type === "tool_result");
      let c = l && o.get(l.tool_use_id);
      if (!c?.stripForStorage) {
        continue;
      }
      let u = c.stripForStorage(a.toolUseResult);
      if (u === a.toolUseResult) {
        continue;
      }
      if (!s) {
        s = e.slice();
      }
      s[i] = {
        ...a,
        toolUseResult: u
      };
    }
    return s ?? e;
  }
  function _nn(e, t) {
    try {
      let n = e.mapToolResultToToolResultBlockParam(t, "1");
      if (Array.isArray(n.content) && n.content.some(o => o.type === "image")) {
        return In({
          content: n.content,
          isMeta: true
        });
      }
      let r = typeof n.content === "string" ? n.content : De(n.content);
      return In({
        content: `Result of calling the ${e.name} tool:
${r}`,
        isMeta: true
      });
    } catch {
      return In({
        content: `Result of calling the ${e.name} tool: Error`,
        isMeta: true
      });
    }
  }
  function bnn(e, t) {
    return In({
      content: `Called the ${e} tool with the following input: ${De(t)}`,
      isMeta: true
    });
  }
  function wc(e, t, n, r) {
    return {
      type: "system",
      subtype: "informational",
      content: e,
      isMeta: false,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      toolUseID: n,
      level: t,
      ...(r && {
        preventContinuation: r
      })
    };
  }
  function Ztc(e) {
    return {
      type: "system",
      subtype: "permission_retry",
      content: `Allowed ${e.join(", ")}`,
      commands: e,
      level: "info",
      isMeta: false,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID()
    };
  }
  function _yc(e, t) {
    return {
      type: "system",
      subtype: "bridge_status",
      content: `/remote-control is active \xB7 Continue here, on your phone, or at ${e}`,
      url: e,
      upgradeNudge: t,
      isMeta: false,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID()
    };
  }
  function wnn(e, t) {
    return {
      type: "system",
      subtype: "scheduled_task_fire",
      content: e,
      isMeta: false,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      ...(t?.cronKind && {
        cronKind: t.cronKind
      }),
      ...(t?.noOpStreak !== undefined && t.noOpStreak > 0 && {
        noOpStreak: t.noOpStreak,
        streakStartedAt: t.streakStartedAt
      }),
      ...(t?.foldedUuids?.length && {
        foldedUuids: t.foldedUuids
      })
    };
  }
  function jLl(e, t, n, r, o, s, i, a, l, c, u) {
    return {
      type: "system",
      subtype: "stop_hook_summary",
      hookCount: e,
      hookInfos: t,
      hookErrors: n,
      hookAdditionalContext: u,
      preventedContinuation: r,
      stopReason: o,
      hasOutput: s,
      level: i,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      toolUseID: a,
      hookLabel: l,
      totalDurationMs: c
    };
  }
  function v7t(e, t, n, r, o) {
    return {
      type: "system",
      subtype: "turn_duration",
      durationMs: e,
      budgetTokens: t?.tokens,
      budgetLimit: t?.limit,
      budgetNudges: t?.nudges,
      messageCount: n,
      pendingBackgroundAgentCount: r,
      pendingWorkflowCount: o,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      isMeta: false
    };
  }
  function byc(e) {
    return {
      type: "system",
      subtype: "away_summary",
      content: e,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      isMeta: false
    };
  }
  function drr(e) {
    return {
      type: "system",
      subtype: "memory_saved",
      writtenPaths: e,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      isMeta: false
    };
  }
  function Syc() {
    return {
      type: "system",
      subtype: "agents_killed",
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      isMeta: false
    };
  }
  function mR(e) {
    return {
      type: "system",
      subtype: "local_command",
      content: e,
      level: "info",
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      isMeta: false
    };
  }
  function eWt(e, t, n, r, o) {
    return {
      type: "system",
      subtype: "compact_boundary",
      content: "Conversation compacted",
      isMeta: false,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID(),
      level: "info",
      compactMetadata: {
        trigger: e,
        preTokens: t,
        userContext: r,
        messagesSummarized: o
      },
      ...(n && {
        logicalParentUuid: n
      })
    };
  }
  function mnn(e, t, n, r) {
    return {
      type: "system",
      subtype: "api_error",
      level: "error",
      error: e,
      retryInMs: t,
      retryAttempt: n,
      maxRetries: r,
      timestamp: new Date().toISOString(),
      uuid: vL.randomUUID()
    };
  }
  function SS(e) {
    return e?.type === "system" && e.subtype === "compact_boundary";
  }
  function rsr(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n && SS(n)) {
        return t;
      }
    }
    return -1;
  }
  function kg(e, t) {
    let n = rsr(e);
    return n === -1 ? e : e.slice(n);
  }
  function aQn(e, t) {
    if (e.findLastIndex(r => r.uuid === t.uuid) === -1) {
      return [...e, t];
    }
    return [...e.filter(r => r.uuid !== t.uuid), t];
  }
  function nK(e, t) {
    let n = typeof t === "boolean" ? t : false;
    if (e?.kind === "channel") {
      return true;
    }
    if (e?.kind === "peer") {
      if (e.senderTaskId !== undefined) {
        return true;
      }
      if (n) {
        return true;
      }
    }
    return false;
  }
  function JXl(e, t) {
    if (e.type !== "user") {
      return true;
    }
    if (e.isMeta) {
      if (nK(e.origin)) {
        return true;
      }
      return false;
    }
    if (e.isVisibleInTranscriptOnly && !t) {
      return false;
    }
    return true;
  }
  function mor(e) {
    if (e.type !== "assistant") {
      return false;
    }
    if (!Array.isArray(e.message.content)) {
      return false;
    }
    return e.message.content.every(t => t.type === "thinking" || t.type === "redacted_thinking");
  }
  function zKo(e, t, n) {
    let r = 0;
    for (let o of e) {
      if (!o) {
        continue;
      }
      if (o.type === "assistant" && Array.isArray(o.message.content)) {
        if (o.message.content.some(i => i.type === "tool_use" && i.name === t)) {
          if (r++, n && r >= n) {
            return r;
          }
        }
      }
    }
    return r;
  }
  function qLl(e, t) {
    let n;
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (!o) {
        continue;
      }
      if (o.type === "assistant" && Array.isArray(o.message.content)) {
        let s = o.message.content.find(i => i.type === "tool_use" && i.name === t);
        if (s) {
          n = s.id;
          break;
        }
      }
    }
    if (!n) {
      return false;
    }
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (!o) {
        continue;
      }
      if (o.type === "user" && Array.isArray(o.message.content)) {
        let s = o.message.content.find(i => i.type === "tool_result" && i.tool_use_id === n);
        if (s) {
          return s.is_error !== true;
        }
      }
    }
    return false;
  }
  function bXt(e) {
    return e.type === "thinking" || e.type === "redacted_thinking";
  }
  function Cgf(e) {
    if (e.type === "redacted_thinking") {
      return true;
    }
    if (e.type === "thinking" && "signature" in e && e.signature) {
      return true;
    }
    return false;
  }
  function Rgf(e) {
    let t = e.at(-1);
    if (!t || t.type !== "assistant") {
      return e;
    }
    let n = t.message.content;
    let r = n.at(-1);
    if (!r || !bXt(r)) {
      return e;
    }
    let o = n.length - 1;
    while (o >= 0) {
      let a = n[o];
      if (!a || !bXt(a)) {
        break;
      }
      o--;
    }
    logEvent("tengu_filtered_trailing_thinking_block", {
      messageUUID: br(t.uuid),
      blocksRemoved: n.length - o - 1,
      remainingBlocks: o + 1
    });
    let s = o < 0 ? [{
      type: "text",
      text: "[No message content]",
      citations: []
    }] : n.slice(0, o + 1);
    let i = [...e];
    i[e.length - 1] = {
      ...t,
      message: {
        ...t.message,
        content: s
      }
    };
    return i;
  }
  function iyc(e) {
    if (e.length === 0) {
      return false;
    }
    for (let t of e) {
      if (t.type !== "text") {
        return false;
      }
      let n = t.text?.trim();
      if (n !== undefined && n !== "" && n !== "(no content)") {
        return false;
      }
    }
    return true;
  }
  function xze(e) {
    let t = false;
    for (let s = 0; s < e.length; s++) {
      let i = e[s];
      if (i.type !== "assistant") {
        continue;
      }
      let a = i.message.content;
      if (!Array.isArray(a) || a.length === 0) {
        continue;
      }
      if (iyc(a)) {
        t = true;
        break;
      }
    }
    if (!t) {
      return e;
    }
    let n = new Set();
    for (let s of e) {
      if (s.type !== "assistant" || !s.message.id) {
        continue;
      }
      let i = s.message.content;
      if (!Array.isArray(i)) {
        continue;
      }
      if (i.some(a => {
        if (a.type === "thinking" || a.type === "redacted_thinking") {
          return false;
        }
        if (a.type !== "text") {
          return true;
        }
        let l = (a.text ?? "").trim();
        return l !== "" && l !== "(no content)";
      })) {
        n.add(s.message.id);
      }
    }
    let r = e.filter(s => {
      if (s.type !== "assistant") {
        return true;
      }
      if (n.vZc(s.message.id)) {
        return true;
      }
      let i = s.message.content;
      if (!Array.isArray(i) || i.length === 0) {
        return true;
      }
      if (iyc(i)) {
        logEvent("tengu_filtered_whitespace_only_assistant", {
          messageUUID: br(s.uuid)
        });
        return false;
      }
      return true;
    });
    let o = [];
    for (let s of r) {
      let i = o.at(-1);
      if (s.type === "user" && i?.type === "user") {
        o[o.length - 1] = Tmr(i, s);
      } else {
        o.push(s);
      }
    }
    return o;
  }
  function xgf(e) {
    let t;
    let n = e.length - 1;
    for (let r = 0; r < n; r++) {
      let o = e[r];
      if (o.type !== "assistant") {
        continue;
      }
      let s = o.message.content;
      if (!Array.isArray(s) || s.length > 0) {
        continue;
      }
      if (logEvent("tengu_fixed_empty_assistant_content", {
        messageUUID: br(o.uuid),
        messageIndex: r
      }), !t) {
        t = e.slice();
      }
      t[r] = {
        ...o,
        message: {
          ...o.message,
          content: [{
            type: "text",
            text: "(no content)",
            citations: []
          }]
        }
      };
    }
    return t ?? e;
  }
  function kze(e) {
    let t = new Set();
    for (let r of e) {
      if (r.type !== "assistant") {
        continue;
      }
      let o = r.message.content;
      if (!Array.isArray(o)) {
        continue;
      }
      if (o.some(i => i.type !== "thinking" && i.type !== "redacted_thinking") && r.message.id) {
        t.add(r.message.id);
      }
    }
    let n;
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (o.type !== "assistant") {
        n?.push(o);
        continue;
      }
      let s = o.message.content;
      if (!Array.isArray(s) || s.length === 0) {
        n?.push(o);
        continue;
      }
      if (!s.every(a => a.type === "thinking" || a.type === "redacted_thinking")) {
        n?.push(o);
        continue;
      }
      if (o.message.id && t.vZc(o.message.id)) {
        n?.push(o);
        continue;
      }
      if (logEvent("tengu_filtered_orphaned_thinking_message", {
        messageUUID: br(o.uuid),
        messageId: o.message.id,
        blockCount: s.length
      }), !n) {
        n = e.slice(0, r);
      }
    }
    return n ?? e;
  }
  function sMo(e, t = () => true) {
    if (!e.some(o => o.type === "assistant" && t(o))) {
      return e;
    }
    let n = false;
    let r = e.map(o => {
      if (o.type !== "assistant") {
        return o;
      }
      if (!t(o)) {
        return o;
      }
      let s = o.message.content;
      if (!Array.isArray(s)) {
        return o;
      }
      let i = s.filter(a => {
        if (Cgf(a)) {
          return false;
        }
        return true;
      });
      if (i.length === s.length) {
        return o;
      }
      n = true;
      return {
        ...o,
        message: {
          ...o.message,
          content: i
        }
      };
    });
    return n ? r : e;
  }
  function zhc(e, t) {
    return sMo(e, n => n.message.model !== "<synthetic>" && n.message.model !== t);
  }
  function Khc(e) {
    let t = false;
    let n = e.map(r => {
      if (r.type !== "assistant" || !Array.isArray(r.message.content)) {
        return r;
      }
      let o = r.message.content;
      let s = o.filter(a => a.type !== "thinking" && a.type !== "redacted_thinking");
      if (s.length === o.length) {
        return r;
      }
      t = true;
      let i = s.filter(a => a.type !== "text" || Boolean(a.text?.trim()));
      if (i.length === 0) {
        i.push({
          type: "text",
          text: "[Thinking removed]",
          citations: []
        });
      }
      return {
        ...r,
        message: {
          ...r.message,
          content: i
        }
      };
    });
    return t ? n : e;
  }
  function pFl(e, t) {
    return {
      type: "tool_use_summary",
      summary: e,
      precedingToolUseIds: t,
      uuid: vL.randomUUID(),
      timestamp: new Date().toISOString()
    };
  }
  function Yhc(e) {
    let t = [];
    let n = false;
    let r = new Set();
    for (let o = 0; o < e.length; o++) {
      let s = e[o];
      if (s.type !== "assistant") {
        if (s.type === "user" && Array.isArray(s.message.content) && t.at(-1)?.type !== "assistant") {
          let b = s.message.content.filter(S => !(typeof S === "object" && "type" in S && S.type === "tool_result"));
          if (b.length !== s.message.content.length) {
            n = true;
            let S = b.length > 0 ? b : t.length === 0 ? [{
              type: "text",
              text: "[Orphaned tool result removed due to conversation resume]"
            }] : null;
            if (S !== null) {
              t.push({
                ...s,
                message: {
                  ...s.message,
                  content: S
                }
              });
            }
            continue;
          }
        }
        t.push(s);
        continue;
      }
      let i = new Set();
      for (let b of s.message.content) {
        if ("tool_use_id" in b && typeof b.tool_use_id === "string") {
          i.add(b.tool_use_id);
        }
      }
      let a = new Set();
      let l = false;
      let c = s.message.content.flatMap((b, S, E) => {
        let C = false;
        if (b.type === "tool_use") {
          if (r.vZc(b.id)) {
            C = true;
          } else {
            r.add(b.id);
            a.add(b.id);
          }
        } else if ((b.type === "server_tool_use" || b.type === "mcp_tool_use") && !i.vZc(b.id)) {
          C = true;
        }
        if (!C) {
          return [b];
        }
        n = true;
        l = true;
        let x = E[S - 1]?.type;
        let A = E[S + 1]?.type;
        return (x === "thinking" || x === "redacted_thinking") && (A === "thinking" || A === "redacted_thinking") ? [{
          type: "text",
          text: "[Tool use removed]",
          citations: []
        }] : [];
      });
      if (c.length === 0) {
        c.push({
          type: "text",
          text: "[Tool use interrupted]",
          citations: []
        });
      }
      let u = l ? {
        ...s,
        message: {
          ...s.message,
          content: c
        }
      } : s;
      t.push(u);
      let d = [...a];
      let p = e[o + 1];
      let m = new Set();
      let f = false;
      if (p?.type === "user") {
        let b = p.message.content;
        if (Array.isArray(b)) {
          for (let S of b) {
            if (typeof S === "object" && "type" in S && S.type === "tool_result") {
              let E = S.tool_use_id;
              if (m.vZc(E)) {
                f = true;
              }
              m.add(E);
            }
          }
        }
      }
      let h = new Set(d);
      let g = d.filter(b => !m.vZc(b));
      let y = [...m].filter(b => !h.vZc(b));
      if (g.length === 0 && y.length === 0 && !f) {
        continue;
      }
      n = true;
      let _ = g.map(b => ({
        type: "tool_result",
        tool_use_id: b,
        content: $hf,
        is_error: true
      }));
      if (p?.type === "user") {
        let b = Array.isArray(p.message.content) ? p.message.content : [{
          type: "text",
          text: p.message.content
        }];
        if (y.length > 0 || f) {
          let E = new Set(y);
          let C = new Set();
          b = b.filter(x => {
            if (typeof x === "object" && "type" in x && x.type === "tool_result") {
              let A = x.tool_use_id;
              if (E.vZc(A)) {
                return false;
              }
              if (C.vZc(A)) {
                return false;
              }
              C.add(A);
            }
            return true;
          });
        }
        let S = [..._, ...b];
        if (S.length > 0) {
          let E = {
            ...p,
            message: {
              ...p.message,
              content: S
            }
          };
          o++;
          t.push(getFeatureValue_CACHED_MAY_BE_STALE("tengu_chair_sermon", false) ? uyc([E])[0] : E);
        } else {
          o++;
          t.push(In({
            content: "(no content)",
            isMeta: true
          }));
        }
      } else if (_.length > 0) {
        t.push(In({
          content: _,
          isMeta: true
        }));
      }
    }
    if (n) {
      let o = e.map((s, i) => {
        if (s.type === "assistant") {
          let a = s.message.content.filter(u => u.type === "tool_use").map(u => u.id);
          let l = s.message.content.filter(u => u.type === "server_tool_use" || u.type === "mcp_tool_use").map(u => u.id);
          let c = [`id=${s.message.id}`, `tool_uses=[${a.join(",")}]`];
          if (l.length > 0) {
            c.push(`server_tool_uses=[${l.join(",")}]`);
          }
          return `[${i}] assistant(${c.join(", ")})`;
        }
        if (s.type === "user" && Array.isArray(s.message.content)) {
          let a = s.message.content.filter(l => typeof l === "object" && "type" in l && l.type === "tool_result").map(l => l.tool_use_id);
          if (a.length > 0) {
            return `[${i}] user(tool_results=[${a.join(",")}])`;
          }
        }
        return `[${i}] ${s.type}`;
      });
      if (getStrictToolResultPairing()) {
        throw Error("ensureToolResultPairing: tool_use/tool_result pairing mismatch detected (strict mode). " + "Refusing to repair \u2014 would inject synthetic placeholders into model context. " + `Message structure: ${o.join("; ")}. See inc-4977.`);
      }
      logEvent("tengu_tool_result_pairing_repaired", {
        messageCount: e.length,
        repairedMessageCount: t.length,
        messageTypes: o.join("; ")
      });
      logForDebugging(`ensureToolResultPairing: repaired missing tool_result blocks (${e.length} -> ${t.length} messages). Message structure: ${o.join("; ")}`, {
        level: "error"
      });
    }
    return n ? t : e;
  }
  function kgf(e) {
    if (!e.some(r => r.type === "assistant" && r.message.content.some(o => a5e(o)))) {
      return e;
    }
    let t = false;
    let n = e.map(r => {
      if (r.type !== "assistant") {
        return r;
      }
      let o = r.message.content;
      let s = o.filter(i => !a5e(i));
      if (s.length === o.length) {
        return r;
      }
      if (t = true, s.length === 0 || s.every(i => i.type === "thinking" || i.type === "redacted_thinking" || i.type === "text" && (!i.text || !i.text.trim()))) {
        s.push({
          type: "text",
          text: "[Advisor response]",
          citations: []
        });
      }
      return {
        ...r,
        message: {
          ...r.message,
          content: s
        }
      };
    });
    return t ? n : e;
  }
  function iKo(e) {
    return kgf(e);
  }
  function amr(e) {
    return e.some(t => t.type === "assistant" && Array.isArray(t.message.content) && t.message.content.some(nq));
  }
  function Agf(e) {
    let t = e;
    let n = s => {
      if (typeof s !== "object" || s === null) {
        return;
      }
      let i = s.model;
      return typeof i === "string" && i.length > 0 && i.length <= 256 ? i : undefined;
    };
    let r = n(t.from);
    let o = n(t.to);
    return r !== undefined && o !== undefined ? {
      type: "fallback",
      from: {
        model: r
      },
      to: {
        model: o
      }
    } : undefined;
  }
  function M2o(e) {
    let t = n => n.role === "assistant" && Array.isArray(n.content) && n.content.some(r => r != null && nq(r));
    if (!e.some(t)) {
      return e;
    }
    return e.map(n => {
      if (!t(n)) {
        return n;
      }
      let r = n.content.filter(o => o == null || !nq(o));
      return {
        ...n,
        content: r.length > 0 ? r : [{
          type: "text",
          text: "(no content)"
        }]
      };
    });
  }
  function Jhc(e, t) {
    if (!amr(e)) {
      return e;
    }
    return e.map(n => {
      if (n.type !== "assistant" || !Array.isArray(n.message.content) || !n.message.content.some(nq)) {
        return n;
      }
      let r = n.message.content.flatMap(o => {
        if (!nq(o)) {
          return [o];
        }
        let s = t ? Agf(o) : undefined;
        return s !== undefined ? [s] : [];
      });
      return {
        ...n,
        message: {
          ...n.message,
          content: r.length > 0 ? r : [{
            type: "text",
            text: "(no content)",
            citations: []
          }]
        }
      };
    });
  }
  function aKe(e, t, n) {
    if (n?.verifiedSlackHumanTurn && BG(t)) {
      return `${YKo}${e}`;
    }
    switch (t?.kind) {
      case "task-notification":
        return Vgc(e);
      case "coordinator":
        return dgl(e);
      case "channel":
        return Igf(e, t.server, {
          midTurn: true
        });
      case "peer":
        return jKt(e, {
          midTurn: true
        });
      case "auto-continuation":
      case "human":
      case undefined:
        return `${KKo}${e}

IMPORTANT: After completing your current task, you MUST address the user's message above. Do not ignore it.`;
      default:
        {
          let r = t;
          return `[MESSAGE FROM NON-USER SOURCE - NOT USER INPUT]
${e}`;
        }
    }
  }
  function Igf(e, t, n) {
    let r = n.midTurn ? `${"A message arrived from "}${t} while you were working:` : `${"A message arrived from "}${t}:`;
    let o = n.midTurn ? " After completing your current task, decide whether/how to respond." : "";
    return `${r}
${e}

${Q4e(false)}${o}`;
  }
  function XKo(e, t) {
    let n;
    if (t.kind === "channel") {
      return;
    } else if (t.kind === "peer") {
      n = o => jKt(o, {
        midTurn: false
      });
    }
    if (!n) {
      return;
    }
    let r = e.message.content;
    if (typeof r === "string") {
      e.message.content = n(r);
    } else if (Array.isArray(r)) {
      if (t.kind === "peer") {
        let o = r[0];
        if (o?.type === "text") {
          o.text = n(o.text);
        } else {
          e.message.content = [{
            type: "text",
            text: n("")
          }, ...r];
        }
      } else {
        for (let o of r) {
          if (o.type === "text") {
            o.text = n(o.text);
          }
        }
      }
    }
  }
  function wmr(e, t) {
    if (yU(t)) {
      return;
    }
    for (let n of e) {
      if (n.type === "user" && n.origin === undefined) {
        n.origin = t;
      }
    }
  }
  var vL;
  var FJe;
  var Bhf = `

Note: The user's next message may contain a correction or preference. Pay close attention \u2014 if they explain what went wrong or how they'd prefer you to work, consider saving that to memory for future sessions.`;
  var tTt = `The user doesn't want to proceed with this tool use. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). To tell you how to proceed, the user said:
`;
  var Uer = `Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). The user said:
`;
  var sNo = `The agent proposed a plan that was rejected by the user. The user chose to stay in plan mode rather than proceed with implementation.

Rejected plan:
`;
  var bDe;
  var GKo;
  var Yve;
  var Vlr;
  var egf;
  var cgf;
  var mgf;
  var fgf;
  var bgf = `### Phase 4: Final Plan
Goal: Write your final plan to the plan file (the only file you can edit).
- Begin with a **Context** section: explain why this change is being made \u2014 the problem or need it addresses, what prompted it, and the intended outcome
- Include only your recommended approach, not all alternatives
- Ensure that the plan file is concise enough to scan quickly, but detailed enough to execute effectively
- Name the critical files to be modified. For changes that repeat a pattern across many files, describe the pattern once and list a few representative paths \u2014 do not enumerate every file or line number
- Reference existing functions and utilities you found that should be reused, with their file paths
- Include a verification section describing how to test the changes end-to-end (run the code, use MCP tools, run tests)`;
  var syc;
  var wgf;
  var KKo = `The user sent a new message while you were working:
`;
  var YKo = `A message arrived in the bound thread while you were working:
`;
  var JKo = `Messages arrived in the bound thread while you were working:
`;
  var ro = __lazy(() => {
    Ot();
    Gu();
    B_();
    Kq();
    zbt();
    Eb();
    $n();
    vO();
    hDo();
    Yor();
    QXn();
    UV();
    mE();
    rR();
    DC();
    $A();
    gn();
    cs();
    S$();
    jve();
    W$o();
    cU();
    R$();
    aSt();
    v8e();
    Tm();
    DEe();
    at();
    np();
    K6e();
    ci();
    LEe();
    ZC();
    GEt();
    je();
    Ctt();
    cs();
    Gd();
    Rn();
    EC();
    Ygc();
    Zn();
    YI();
    xMo();
    foe();
    RX();
    Cde();
    Cde();
    vL = require("crypto");
    FJe = require("path");
    bDe = new Set(["[Request interrupted by user]", "[Request interrupted by user for tool use]", "The user doesn't want to take this action right now. STOP what you are doing and wait for the user to tell you how to proceed.", "The user doesn't want to proceed with this tool use. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). STOP what you are doing and wait for the user to tell you how to proceed.", "No response requested."]);
    GKo = `<${"local-command-stdout"}>Set model to `;
    Yve = {
      siblingToolUseIDs: new Map(),
      progressMessagesByToolUseID: new Map(),
      inProgressHookCounts: new Map(),
      resolvedHookCounts: new Map(),
      toolResultByToolUseID: new Map(),
      assistantUuidByToolUseID: new Map(),
      firstTextBlockUuidByMessageID: new Map(),
      toolUseByToolUseID: new Map(),
      normalizedMessageCount: 0,
      resolvedToolUseIDs: new Set(),
      erroredToolUseIDs: new Set()
    };
    Vlr = Object.freeze(new Set());
    egf = new Set(["image", "document"]);
    cgf = /<(commit_analysis|context|function_analysis|pr_analysis)>.*?<\/\1>\n?/gs;
    mgf = new Set(["claude-in-chrome"]);
    fgf = new Set(["You used a single tool call this turn. Prefer browser_batch to execute multiple actions in one call \u2014 it is significantly faster. Batch your next sequence of clicks, types, navigations, and screenshots together."]);
    syc = {
      directory: e => wp([bnn(xl.name, {
        command: `ls ${Ja([e.path])}`,
        description: `Lists files in ${e.path}`
      }), _nn(xl, {
        stdout: e.content,
        stderr: "",
        interrupted: false
      })]),
      edited_text_file: e => wp([In({
        content: e.snippet === "" ? `Note: ${e.filename} was modified, either by the user or by a linter. This change was intentional, so make sure to take it into account as you proceed (ie. don't revert it unless the user asks you to). Don't tell the user this, since they are already aware. The diff was omitted because other modified files in this turn already exceeded the snippet budget; use the Read tool if you need the current content.` : `Note: ${e.filename} was modified, either by the user or by a linter. This change was intentional, so make sure to take it into account as you proceed (ie. don't revert it unless the user asks you to). Don't tell the user this, since they are already aware. Here are the relevant changes (shown with line numbers):
${e.snippet}`,
        isMeta: true
      })]),
      compact_file_reference: e => wp([In({
        content: `Note: ${e.filename} was read before the last conversation was summarized, but the contents are too large to include. Use ${iy.name} tool if you need to access it.`,
        isMeta: true
      })]),
      pdf_reference: e => wp([In({
        content: `PDF file: ${e.filename} (${e.pageCount} pages, ${formatFileSize(e.fileSize)}). This PDF is too large to read all at once. You MUST use the ${"Read"} tool with the pages parameter to read specific page ranges (e.g., pages: "1-5"). Do NOT call ${"Read"} without the pages parameter or it will fail. Start by reading the first few pages to understand the structure, then read more as needed. Maximum 20 pages per request.`,
        isMeta: true
      })]),
      selected_lines_in_ide: e => wp([In({
        content: `The user selected the lines ${e.lineStart} to ${e.lineEnd} from ${e.filename}:
${oyc(e.content)}

This may or may not be related to the current task.`,
        isMeta: true
      })]),
      selected_lines_in_diff: e => wp([In({
        content: `The user selected the following ${e.lineCount} ${e.lineCount === 1 ? "line" : "lines"} from the diff view${e.filePath ? ` (in ${e.filePath})` : ""}:
${oyc(e.content)}

This may or may not be related to the current task.`,
        isMeta: true
      })]),
      opened_file_in_ide: e => wp([In({
        content: `The user opened the file ${e.filename} in the IDE. This may or may not be related to the current task.`,
        isMeta: true
      })]),
      plan_file_reference: e => wp([In({
        content: `A plan file exists from plan mode at: ${e.planFilePath}

Plan contents:

${e.planContent}

If this plan is relevant to the current work and not already complete, continue working on it.`,
        isMeta: true
      })]),
      nested_memory: e => wp([In({
        content: `Contents of ${e.content.path}:

${e.content.content}`,
        isMeta: true
      })]),
      agent_mention: e => wp([In({
        content: `The user has expressed a desire to invoke the agent "${e.agentType}". Please invoke the agent appropriately, passing in the required context to it. `,
        isMeta: true
      })]),
      skill_listing: e => {
        if (!e.content) {
          return [];
        }
        return wp([In({
          content: `The following skills are available for use with the Skill tool:

${e.content}`,
          isMeta: true
        })]);
      },
      dynamic_skill: e => {
        let t = getProjectRoot();
        let n = t.endsWith(FJe.sep) ? t : t + FJe.sep;
        if (!e.skillDir || !FJe.isAbsolute(e.skillDir) || !e.skillDir.startsWith(n)) {
          return [];
        }
        let r = FJe.relative(t, e.skillDir);
        if (UNSAFE_DYNAMIC_SKILL_CHARS.test(r)) {
          return [];
        }
        let o = e.skillNames.filter(isSafeDynamicSkillName);
        if (o.length === 0) {
          return [];
        }
        return wp([In({
          content: `New skills discovered in ${r}, now available via the Skill tool:
${o.map(s => `- ${s}`).join(`
`)}`,
          isMeta: true
        })]);
      },
      output_style: e => {
        let t = GX[e.style];
        if (!t) {
          return [];
        }
        return wp([In({
          content: `${t.name} output style is active. ${e.turnReminder ?? "Remember to follow the specific guidelines for this style."}`,
          isMeta: true
        })]);
      },
      critical_system_reminder: e => wp([In({
        content: e.content,
        isMeta: true
      })]),
      plan_mode_exit: e => {
        let t = e.planExists ? ` The plan file is located at ${e.planFilePath} if you need to reference it.` : "";
        return wp([In({
          content: `## Exited Plan Mode

You have exited plan mode. You can now make edits, run tools, and take actions.${t}`,
          isMeta: true
        })]);
      },
      auto_mode_exit: () => wp([In({
        content: `## Exited Auto Mode

You have exited auto mode. The user may now want to interact more directly. You should ask clarifying questions when the approach is ambiguous rather than making assumptions.`,
        isMeta: true
      })]),
      token_usage: e => [In({
        content: gR(`Token usage: ${e.used}/${e.total}; ${e.remaining} remaining`),
        isMeta: true
      })],
      total_tokens_reminder: e => [In({
        content: gR(e.text),
        isMeta: true
      })],
      budget_usd: e => [In({
        content: gR(`USD budget: $${e.used}/$${e.total}; $${e.remaining} remaining`),
        isMeta: true
      })],
      output_token_usage: e => {
        let t = e.budget !== null ? `${formatNumber(e.turn)} / ${formatNumber(e.budget)}` : formatNumber(e.turn);
        return [In({
          content: gR(`Output tokens \u2014 turn: ${t} \xB7 session: ${formatNumber(e.session)}`),
          isMeta: true
        })];
      },
      hook_blocking_error: e => [In({
        content: gR(`${e.hookName} hook blocking error from command: "${e.blockingError.command}": ${e.blockingError.blockingError}`),
        isMeta: true
      })],
      hook_additional_context: e => {
        if (e.content.length === 0) {
          return [];
        }
        return [In({
          content: gR(`${e.hookName} hook additional context: ${e.content.join(`
`)}`),
          isMeta: true
        })];
      },
      hook_stopped_continuation: e => [In({
        content: gR(`${e.hookName} hook stopped continuation: ${e.message}`),
        isMeta: true
      })],
      date_change: e => wp([In({
        content: `The date has changed. Today's date is now ${e.newDate}. DO NOT mention this to the user explicitly because they are already aware.`,
        isMeta: true
      })]),
      ultrathink_effort: () => wp([In({
        content: 'The user included the keyword "ultrathink", requesting deeper reasoning on this turn. Reason as thoroughly as the task warrants.',
        isMeta: true
      })]),
      workflow_keyword_request: () => wp([In({
        content: 'The user included the keyword "ultracode", opting this turn into multi-agent orchestration \u2014 use the Workflow tool to fulfill the request.',
        isMeta: true
      })]),
      ultra_effort_enter: ({
        reminderType: e
      }) => wp([In({
        content: e === "full" ? "Ultracode is on: optimize for the most exhaustive, correct answer \u2014 not the fastest or cheapest. Use the Workflow tool on every substantive task; token cost is not a constraint. See the Workflow tool's **Ultracode** section and quality patterns. Solo only on conversational/trivial turns." : "Ultracode is still on \u2014 use the Workflow tool; see its Ultracode section.",
        isMeta: true
      })]),
      ultra_effort_exit: () => wp([In({
        content: "Ultracode is off \u2014 the Workflow tool's standard opt-in rule applies again.",
        isMeta: true
      })]),
      context_tip: () => [],
      already_read_file: () => [],
      command_permissions: () => [],
      edited_image_file: () => [],
      hook_cancelled: () => [],
      hook_error_during_execution: () => [],
      hook_non_blocking_error: () => [],
      hook_system_message: () => [],
      hook_permission_decision: () => [],
      hook_deferred_tool: () => [],
      goal_status: () => [],
      structured_output: () => [],
      max_turns_reached: () => [],
      teammate_shutdown_batch: () => []
    };
    wgf = {
      dream: "Background memory consolidation"
    };
  });
  function Cmr() {
    return Me.CLAUDE_CODE_HOST_AUTH_ENV_VAR || "ANTHROPIC_AUTH_TOKEN";
  }
  function e7o() {
    let e = getHostAuthTokenRefreshCallback();
    return !!e && (!(isFirstPartyProvider() && isFirstPartyAnthropicBaseUrl()) || e === ZKo);
  }
  async function Eyc() {
    let e = Me.CLAUDE_CODE_HOST_CREDS_FILE;
    if (!e || !Cyc.isAbsolute(e)) {
      return null;
    }
    let t;
    try {
      t = await wyc.open(e, "r");
      let n = await t.stat();
      if (n.size > 65536) {
        return null;
      }
      if (Wt() !== "windows") {
        if ((n.mode & 63) !== 0 || n.uid !== process.getuid?.()) {
          logForDebugging("ignoring CLAUDE_CODE_HOST_CREDS_FILE with group/other-readable mode or wrong owner", {
            level: "warn"
          });
          return null;
        }
      }
      let r = await t.readFile({
        encoding: "utf8"
      });
      let o = Ogf().safeParse(qt(r));
      if (!o.success || !Number.isFinite(o.data.procStart)) {
        return null;
      }
      let s = o.data;
      if (!isProcessRunning(s.pid)) {
        return null;
      }
      let i = await getProcessCreationTimeMsAsync(s.pid);
      if (i !== null && Math.abs(s.procStart - i) > 2000) {
        return null;
      }
      if (s.expiresAt !== null && s.expiresAt < Date.now()) {
        return null;
      }
      let a = {};
      for (let [l, c] of Object.entries(s.env)) {
        if (Pgf.vZc(l)) {
          a[l] = c;
        }
      }
      return {
        ...s,
        env: a
      };
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`readHostCredsFile failed: ${he(n)}`, {
          level: "warn"
        });
      }
      return null;
    } finally {
      await t?.close().catch(() => {});
    }
  }
  async function Ryc() {
    if (getHostAuthTokenRefreshCallback()) {
      return;
    }
    if (!Me.CLAUDE_CODE_HOST_CREDS_FILE || !st(Me.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return;
    }
    let e = await Eyc();
    if (e) {
      let t = new Map();
      let n = {};
      for (let [r, o] of Object.entries(e.env)) {
        if (QKo.vZc(r)) {
          process.env[r] = o;
          t.set(r, o);
        } else {
          n[r] = o;
        }
      }
      Cnn = t;
      vyc(n);
    } else {
      logForDebugging(`CLAUDE_CODE_HOST_CREDS_FILE is set (${Me.CLAUDE_CODE_HOST_CREDS_FILE}) but no usable host credentials were read`, {
        level: "warn"
      });
    }
    ZKo = async () => {
      let t = await Eyc();
      if (!t) {
        return null;
      }
      let n = {};
      for (let [r, o] of Object.entries(t.env)) {
        if (!QKo.vZc(r)) {
          n[r] = o;
        } else if (Cnn && Cnn.get(r) !== o) {
          logForDebugging(`host-creds refresh rejected: endpoint changed (${r})`, {
            level: "warn"
          });
          return null;
        }
      }
      if (!Cnn) {
        let r = new Map();
        for (let [o, s] of Object.entries(t.env)) {
          if (QKo.vZc(o)) {
            process.env[o] = s;
            r.set(o, s);
          }
        }
        Cnn = r;
      }
      vyc(n);
      return n[Cmr()] ?? null;
    };
    setHostAuthTokenRefreshCallback(ZKo);
  }
  function vyc(e) {
    for (let t of Tyc) {
      if (!(t in e)) {
        delete process.env[t];
      }
    }
    Object.assign(process.env, e);
    Tyc = new Set(Object.keys(e));
  }
  var wyc;
  var Cyc;
  var QKo;
  var Pgf;
  var Ogf;
  var ZKo = null;
  var Tyc;
  var Cnn = null;
  var t7o = __lazy(() => {
    at();
    je();
    pr();
    gn();
    dt();
    Tb();
    lW();
    Ds();
    Cs();
    qg();
    wyc = require("fs/promises");
    Cyc = require("path");
    QKo = new Set(_le);
    Pgf = new Set([...uY, ..._le.filter(e => e !== "_CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL"), "ANTHROPIC_CUSTOM_HEADERS", "CLAUDE_CODE_SKIP_VERTEX_AUTH"]);
    Ogf = we(() => {
      let e = Ke.union([Ke.number(), Ke.string()]).pipe(Ke.coerce.number());
      return Ke.object({
        env: Ke.record(Ke.string()),
        expiresAt: e.nullable().default(null),
        pid: Ke.number().int(),
        procStart: e
      });
    });
    Tyc = new Set();
  });
  function aKo(e) {
    if (e === undefined) {
      return true;
    }
    if (e.startsWith("agent:")) {
      return true;
    }
    return jgf.vZc(e);
  }
  function MCe() {
    return st(process.env.CLAUDE_CODE_RETRY_WATCHDOG);
  }
  function Oyc(e) {
    return DCe(e) || e instanceof Ho && e.status === 429;
  }
  function Rnn(e) {
    return st(process.env.CLAUDE_CODE_REMOTE) && e instanceof Ho && (e.status === 401 || e.status === 403);
  }
  function Wgf(e) {
    if (!(e instanceof ik)) {
      return false;
    }
    let t = f$(e);
    return t !== null && Ode.vZc(t.code);
  }
  async function* cmr(e, t, n) {
    let r = eyf(n);
    let o = {
      model: n.model,
      thinkingConfig: n.thinkingConfig,
      ...(lc() && {
        fastMode: n.fastMode
      })
    };
    let s = null;
    let i = n.initialConsecutive529Errors ?? 0;
    let a;
    let l = 0;
    let c = 0;
    let u = 0;
    let d = 0;
    let p = 0;
    let m;
    let f = new Set();
    let h = false;
    try {
      for (let g = 1; g <= r + 1; g++) {
        if (n.signal?.aborted) {
          throw new _f();
        }
        let y = Date.now();
        let _ = lc() ? o.fastMode && !zle() : false;
        try {
          let b = Wgf(a);
          if (b && getFeatureValue_CACHED_MAY_BE_STALE("tengu_disable_keepalive_on_econnreset", false)) {
            logForDebugging("Stale connection \u2014 disabling keep-alive for retry");
            disableKeepAlive();
          }
          if (s === null || a instanceof Ho && a.status === 401 || a instanceof Ho && a.status === 407 && getConfiguredProxyAuthHelper() || xnn(a) || Lyc(a, o.model) || Uyc(a) || b) {
            if (a instanceof Ho && a.status === 401 || xnn(a)) {
              if (!getAnthropicApiKey() && shouldUseWIFAuth()) {
                await invalidateWIFToken(s?.authToken);
              }
              if (m) {
                if (await handleOAuth401Error(m), getClaudeAIOAuthTokens()?.accessToken === m) {
                  if (getSdkOAuthTokenRefreshCallback() !== null || !Rnn(a) && ++d >= 2) {
                    throw Ae("api_request", "api_request_oauth_refresh_exhausted"), new rN(a, o);
                  }
                } else {
                  d = 0;
                }
              } else if (e7o()) {
                let E = process.env[Cmr()];
                let C = getHostAuthTokenRefreshCallback();
                let x = null;
                try {
                  x = await C();
                } catch (A) {
                  throw logForDebugging(`host getHostAuthToken callback failed: ${he(A)}`, {
                    level: "error"
                  }), Ae("host_auth_401_recovery", "host_auth_callback_failed"), new rN(a, o);
                }
                if (x && x !== E) {
                  process.env[Cmr()] = x;
                  p = 0;
                  Pe("host_auth_401_recovery");
                } else if (++p >= 2) {
                  throw Ae("host_auth_401_recovery", x === null ? "host_auth_callback_returned_null" : "host_auth_callback_returned_same_token"), new rN(a, o);
                }
              } else if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) && isFirstPartyProvider() && !shouldUseWIFAuth() && getAuthTokenSource().source !== "apiKeyHelper" && !Rnn(a)) {
                throw Ae("api_request", "api_request_host_managed_auth_fail"), new rN(a, o);
              }
            }
            s = await e();
            m = isAnthropicAuthEnabled() ? getClaudeAIOAuthTokens()?.accessToken : undefined;
          }
          let S = await t(s, g, o);
          Pe("api_request");
          return S;
        } catch (b) {
          if (b instanceof rN) {
            throw b;
          }
          if (b instanceof _f) {
            throw b;
          }
          a = b;
          logForDebugging(`API error (attempt ${g}/${r + 1}): ${b instanceof Ho ? `${b.status} ${b.message}` : he(b)}`, {
            level: "error"
          });
          let S = await n.onError?.(b);
          if (S && !f.vZc(S)) {
            f.add(S);
            g--;
            continue;
          }
          if ((Ayc(b) || Iyc(b) || !MCe() && Kgf(b)) && n.fallbackModel && n.fallbackModel !== n.model) {
            let O = Ayc(b) ? "model_not_found" : Iyc(b) ? "permission_denied" : "server_error";
            throw logEvent("tengu_api_model_not_found_fallback_triggered", {
              original_model: n.model,
              fallback_model: n.fallbackModel,
              provider: getAPIProviderForAnalytics(),
              reason: O
            }), new XU(n.model, n.fallbackModel, O, b);
          }
          if (_ && !MCe() && b instanceof Ho && (b.status === 429 || DCe(b))) {
            let O = b.headers?.get("anthropic-ratelimit-unified-overage-disabled-reason");
            if (O !== null && O !== undefined) {
              Fdi(O);
              o.fastMode = false;
              continue;
            }
            let M = oyf(b);
            if (M !== null && M < 20000) {
              await sleep(M, n.signal, {
                abortError: Rmr
              });
              continue;
            }
            let L = Math.max(M ?? 1800000, 600000);
            let P = DCe(b) ? "overloaded" : "rate_limit";
            if (Ddi(Date.now() + L, P), lc()) {
              o.fastMode = false;
            }
            continue;
          }
          if (_ && Nyc(b)) {
            Mdi();
            o.fastMode = false;
            continue;
          }
          if (DCe(b) && !aKo(n.querySource) && !MCe()) {
            throw logEvent("tengu_api_529_background_dropped", {
              query_source: n.querySource
            }), Ae("api_request", "api_request_overload_background_dropped"), new rN(b, o);
          }
          let E = getCanonicalName(n.model);
          if (DCe(b) && (process.env.FALLBACK_FOR_ALL_PRIMARY_MODELS || n.fallbackModel !== undefined || !isClaudeAISubscriber() && (isNonCustomOpusModel(E) || isNonCustomFableModel(E) || isNonCustomMythosModel(E)))) {
            if (i++, i >= 3) {
              if (n.fallbackModel) {
                throw logEvent("tengu_api_opus_fallback_triggered", {
                  original_model: n.model,
                  fallback_model: n.fallbackModel,
                  provider: getAPIProviderForAnalytics()
                }), Et("api_request", "api_request_fallback_triggered"), new XU(n.model, n.fallbackModel, "overloaded", b);
              }
              if (!process.env.IS_SANDBOX && !MCe()) {
                throw logEvent("tengu_api_custom_529_overloaded_error", {}), Ae("api_request", "api_request_overload_repeated"), new rN(Error("Repeated 529 Overloaded errors"), o);
              }
            }
          }
          let C = MCe() && Oyc(b);
          if (g > r && !C) {
            throw Ae("api_request", "api_request_retry_exhausted"), new rN(b, o);
          }
          if (Rnn(b)) {
            if (c >= 2) {
              throw Ae("api_request", "api_request_ccr_auth_exhausted"), new rN(b, o);
            }
            c++;
          }
          if (Fyc(b, o.model)) {
            if (u >= 2) {
              throw Ae("api_request", "api_request_aws_auth_exhausted"), new rN(b, o);
            }
            u++;
          }
          if (!(Ygf(b, o.model) || Xgf(b) || (await Qgf(b))) && (!(b instanceof Ho) || !Zgf(b))) {
            let O = b instanceof Ho && (b.status !== undefined && Vgf.vZc(b.status) && !(b.status === 404 && n.isNonStreamingRequest) || b.type === "billing_error" || zgf.some(M => M(b)));
            if (b instanceof Ho && b.status !== undefined && !O && n.fallbackModel && n.fallbackModel !== n.model) {
              let M = b.type;
              throw logEvent("tengu_api_fallback_last_resort", {
                status: b.status,
                errorType: Ggf.find(L => L === M) ?? "other",
                provider: getAPIProviderForAnalytics(),
                fastMode: o.fastMode ?? false
              }), Et("api_request", "api_request_last_resort_fallback"), new XU(n.model, n.fallbackModel, "last_resort", b);
            }
            throw Ae("api_request", "api_request_non_retryable"), new rN(b, o);
          }
          if (b instanceof Ho) {
            let O = Myc(b);
            if (O) {
              let {
                inputTokens: M,
                contextLimit: L
              } = O;
              let P = 1000;
              let F = Math.max(0, L - M - 1000);
              if (F < 3000) {
                throw Oe(Error(`availableContext ${F} is less than FLOOR_OUTPUT_TOKENS ${3000}`)), b;
              }
              let H = (o.thinkingConfig.type === "enabled" ? o.thinkingConfig.budgetTokens : 0) + 1;
              let U = Math.max(3000, F, H);
              o.maxTokensOverride = U;
              logEvent("tengu_max_tokens_context_overflow_adjustment", {
                inputTokens: M,
                contextLimit: L,
                adjustedMaxTokens: U,
                attempt: g
              });
              continue;
            }
          }
          let A = Dyc(b);
          let k;
          if (C && b instanceof Ho && b.status === 429) {
            l++;
            k = syf(b) ?? Math.min(YV(l, A, 300000), 21600000);
          } else if (C) {
            l++;
            k = Math.min(YV(l, A, 300000), 21600000);
          } else if (Rnn(b)) {
            k = 1000;
          } else if (k = YV(g, A), !MCe() && k > 60000) {
            throw logEvent("tengu_api_retry_after_too_long", {
              delayMs: k,
              status: b.status,
              provider: getAPIProviderForAnalytics()
            }), Ae("api_request", "api_request_retry_after_too_long"), new rN(b, o);
          }
          let I = C ? l : g;
          if (logEvent("tengu_api_retry", {
            attempt: I,
            delayMs: k,
            error: Gq(he(b)),
            status: b.status,
            provider: getAPIProviderForAnalytics(),
            attempt_duration_ms: Date.now() - y
          }), C) {
            if (k > 60000) {
              logEvent("tengu_api_persistent_retry_wait", {
                status: b.status,
                delayMs: k,
                attempt: I,
                provider: getAPIProviderForAnalytics()
              });
            }
            let O = k;
            while (O > 0) {
              if (n.signal?.aborted) {
                throw new _f();
              }
              if (b instanceof Ho) {
                let L = P4t(b);
                h = true;
                n.onRetryStatus?.({
                  kind: "retrying",
                  error: L,
                  attempt: I,
                  maxRetries: r,
                  retryInMs: O,
                  deadline: Date.now() + O
                });
                yield mnn(L, O, I, r);
              }
              let M = Math.min(O, 30000);
              if (await kyc(M, n)) {
                break;
              }
              O -= M;
            }
            if (g >= r) {
              g = r;
            }
          } else {
            if (b instanceof Ho) {
              let O = P4t(b);
              h = true;
              n.onRetryStatus?.({
                kind: "retrying",
                error: O,
                attempt: g,
                maxRetries: r,
                retryInMs: k,
                deadline: Date.now() + k
              });
              yield mnn(O, k, g, r);
            }
            await kyc(k, n);
          }
        }
      }
      throw Ae("api_request", "api_request_retry_exhausted"), new rN(a, o);
    } finally {
      if (h) {
        n.onRetryStatus?.(null);
      }
    }
  }
  async function kyc(e, t) {
    if (!t.subscribeRetryWake) {
      await sleep(e, t.signal, {
        abortError: Rmr
      });
      return false;
    }
    if (t.signal?.aborted) {
      throw Rmr();
    }
    let n = false;
    let r = new AbortController();
    let o = t.subscribeRetryWake(() => {
      n = true;
      r.abort();
    });
    let s = () => r.abort();
    t.signal?.addEventListener("abort", s, {
      once: true
    });
    try {
      if (await sleep(e, r.signal), t.signal?.aborted) {
        throw Rmr();
      }
      return n;
    } finally {
      o();
      t.signal?.removeEventListener("abort", s);
    }
  }
  function Dyc(e) {
    return (e.headers?.["retry-after"] || e.headers?.get?.("retry-after")) ?? null;
  }
  function YV(e, t, n = 32000) {
    let r = Math.min(500 * Math.pow(2, e - 1), n);
    let o = r + Math.random() * 0.25 * r;
    if (t) {
      let s = parseInt(t, 10);
      if (!isNaN(s)) {
        return Math.max(s * 1000, o);
      }
    }
    return o;
  }
  function Myc(e) {
    if (e.status !== 400 || !e.message) {
      return;
    }
    if (!M4t(e)) {
      return;
    }
    let t = /input length and `max_tokens` exceed context limit: (\d+) \+ (\d+) > (\d+)/;
    let n = e.message.match(t);
    if (!n || n.length !== 4) {
      return;
    }
    if (!n[1] || !n[2] || !n[3]) {
      Oe(Error("Unable to parse max_tokens from max_tokens exceed context limit error message"));
      return;
    }
    let r = parseInt(n[1], 10);
    let o = parseInt(n[2], 10);
    let s = parseInt(n[3], 10);
    if (isNaN(r) || isNaN(o) || isNaN(s)) {
      return;
    }
    return {
      inputTokens: r,
      maxTokens: o,
      contextLimit: s
    };
  }
  function Nyc(e) {
    if (!(e instanceof Ho)) {
      return false;
    }
    return e.status === 400 && (e.message?.includes("Fast mode is not enabled") ?? false);
  }
  function DCe(e) {
    if (!(e instanceof Ho)) {
      return false;
    }
    return e.status === 529 || (e.message?.includes('"type":"overloaded_error"') ?? false);
  }
  function Ayc(e) {
    if (!(e instanceof Ho) || e.status !== 404) {
      return false;
    }
    let t = e.message ?? "";
    return (e.type === "not_found_error" || t.includes('"type":"not_found_error"')) && t.includes("model:");
  }
  function Iyc(e) {
    if (!(e instanceof Ho) || e.status !== 403) {
      return false;
    }
    let t = e.message ?? "";
    return (e.type === "permission_error" || t.includes('"type":"permission_error"')) && t.includes("model:");
  }
  function Kgf(e) {
    return e instanceof Ho && e.status !== undefined && e.status >= 500 && e.status < 600 && e.status !== 529;
  }
  function xnn(e) {
    return e instanceof Ho && e.status === 403 && (e.message?.includes("OAuth token has been revoked") ?? false);
  }
  function Lyc(e, t) {
    if (st(process.env.CLAUDE_CODE_USE_BEDROCK) || st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) || st(process.env.CLAUDE_CODE_USE_MANTLE)) {
      if (Sdi(e) || e instanceof Ho && e.status === 403) {
        return true;
      }
    }
    return Fyc(e, t);
  }
  function Fyc(e, t) {
    if (!(e instanceof Ho) || e.status !== 401) {
      return false;
    }
    let n = getProviderForModel(t);
    return n === "anthropicAws" || n === "mantle";
  }
  function Ygf(e, t) {
    if (Lyc(e, t)) {
      clearAwsCredentialsCache();
      return true;
    }
    return false;
  }
  function Jgf(e) {
    if (!(e instanceof Error)) {
      return false;
    }
    let t = e.message;
    return t.includes("Could not load the default credentials") || t.includes("Could not refresh access token") || t.includes("invalid_grant");
  }
  function Uyc(e) {
    if (st(process.env.CLAUDE_CODE_USE_VERTEX)) {
      if (Jgf(e)) {
        return true;
      }
      if (e instanceof Ho && e.status === 401) {
        return true;
      }
    }
    return false;
  }
  function Xgf(e) {
    if (Uyc(e)) {
      clearGcpCredentialsCache();
      return true;
    }
    return false;
  }
  async function Qgf(e) {
    if (e instanceof WorkloadIdentityError && (e.statusCode === null || e.statusCode === 401 || e.statusCode >= 500)) {
      let t = await getWIFTokenCache().catch(() => null);
      if (t === null) {
        return false;
      }
      t.invalidate();
      return true;
    }
    return false;
  }
  function Zgf(e) {
    if (Eha(e)) {
      return false;
    }
    if (e.status === 429 && (e.error?.error?.details?.error_code === "credits_required" || e.message?.toLowerCase().includes("usage credits are required") || e.message?.toLowerCase().includes("extra usage is required"))) {
      let n = e.headers?.get("anthropic-ratelimit-unified-overage-disabled-reason");
      if (n !== "fetch_error" && n !== "org_level_disabled_until") {
        return false;
      }
    }
    if (MCe() && Oyc(e)) {
      return true;
    }
    if (Rnn(e)) {
      return true;
    }
    if (e.message?.includes('"type":"overloaded_error"')) {
      return true;
    }
    if (Myc(e)) {
      return true;
    }
    if (isAnthropicAuthEnabled() && getClaudeAIOAuthTokens()?.accessToken && (e.status === 401 || xnn(e))) {
      return true;
    }
    if (!getAnthropicApiKey() && shouldUseWIFAuth() && (e.status === 401 || xnn(e))) {
      return true;
    }
    if (e7o() && e.status === 401) {
      return true;
    }
    if (e.status === 407 && getConfiguredProxyAuthHelper()) {
      clearProxyAuthHelperCache(e.headers?.get("proxy-authenticate") ?? undefined);
      return true;
    }
    let t = e.headers?.get("x-should-retry");
    if (t === "true" && (!isClaudeAISubscriber() || isEnterpriseSubscriber())) {
      return true;
    }
    if (t === "false") {
      let n = e.status !== undefined && e.status >= 500;
      return false;
    }
    if (e instanceof ik) {
      return true;
    }
    if (!e.status) {
      return false;
    }
    if (e.status === 408) {
      return true;
    }
    if (e.status === 409) {
      return true;
    }
    if (e.status === 401) {
      clearApiKeyHelperCache();
      return true;
    }
    if (xnn(e)) {
      return true;
    }
    if (e.status === 429) {
      return !isClaudeAISubscriber() || isEnterpriseSubscriber();
    }
    if (e.status && e.status >= 500) {
      return true;
    }
    return false;
  }
  function lKo() {
    if (process.env.CLAUDE_CODE_MAX_RETRIES) {
      let e = parseInt(process.env.CLAUDE_CODE_MAX_RETRIES, 10);
      if (Number.isFinite(e) && e >= 0) {
        if (e > 15) {
          if (!Pyc) {
            Pyc = true;
            logForDebugging(`CLAUDE_CODE_MAX_RETRIES=${e} clamped to ${15}`, {
              level: "warn"
            });
          }
          return 15;
        }
        return e;
      }
    }
    return 10;
  }
  function eyf(e) {
    return e.maxRetries ?? lKo();
  }
  function oyf(e) {
    let t = Dyc(e);
    if (t) {
      let n = parseInt(t, 10);
      if (!isNaN(n)) {
        return n * 1000;
      }
    }
    return null;
  }
  function syf(e) {
    let t = e.headers?.get?.("anthropic-ratelimit-unified-reset");
    if (!t) {
      return null;
    }
    let n = Number(t);
    if (!Number.isFinite(n)) {
      return null;
    }
    let r = n * 1000 - Date.now();
    if (r <= 0) {
      return null;
    }
    return Math.min(r, 21600000);
  }
  var Rmr = () => new _f();
  var jgf;
  var rN;
  var Ggf;
  var Vgf;
  var zgf;
  var Pyc = false;
  var r6e = __lazy(() => {
    CN();
    lte();
    G4r();
    je();
    Rn();
    ro();
    Ds();
    at();
    no();
    gn();
    dt();
    GT();
    Eo();
    Fh();
    ln();
    $n();
    Ot();
    X9e();
    k4t();
    Hqe();
    vO();
    vTe();
    Prr();
    t7o();
    Prr();
    jgf = new Set(["repl_main_thread", "repl_main_thread:outputStyle:custom", "repl_main_thread:outputStyle:Proactive", "repl_main_thread:outputStyle:Explanatory", "repl_main_thread:outputStyle:Learning", "sdk", "agent:custom", "agent:default", "agent:builtin", "compact", "hook_agent", "hook_prompt", "side_question", "auto_mode", ...[]]);
    rN = class rN extends Error {
      originalError;
      retryContext;
      constructor(e, t) {
        let n = he(e);
        super(n);
        this.originalError = e;
        this.retryContext = t;
        if (this.name = "RetryError", e instanceof Error && e.stack) {
          this.stack = e.stack;
        }
      }
    };
    Ggf = ["invalid_request_error", "authentication_error", "billing_error", "permission_error", "not_found_error", "request_too_large", "rate_limit_error", "timeout_error", "api_error", "overloaded_error"];
    Vgf = new Set([401, 407, 429, 404, 403, 413]);
    zgf = [Kdo, M4t, Ydo, D$n, Nyc, N4t];
  });
  var G6t = {};
  __export(G6t, {
    waitForPolicyLimitsToLoad: () => waitForPolicyLimitsToLoad,
    stopBackgroundPolling: () => stopBackgroundPolling,
    startBackgroundPolling: () => startBackgroundPolling,
    shouldAwaitPolicyLimitsOnStartup: () => shouldAwaitPolicyLimitsOnStartup,
    refreshPolicyLimits: () => refreshPolicyLimits,
    recordPolicyLimitsStartupAwaitResult: () => recordPolicyLimitsStartupAwaitResult,
    logPolicyLimitsCacheStateAtFirstPrompt: () => logPolicyLimitsCacheStateAtFirstPrompt,
    loadPolicyLimits: () => loadPolicyLimits,
    initializePolicyLimitsLoadingPromise: () => initializePolicyLimitsLoadingPromise,
    clearPolicyLimitsCache: () => clearPolicyLimitsCache,
    _resetPolicyLimitsForTesting: () => _resetPolicyLimitsForTesting,
    POLICY_LIMITS_COLD_AWAIT_MS: () => 5000,
    FAIL_CLOSED_SHADOW_CACHE_TTL_MS: () => 86400000
  });
  function qyc() {
    try {
      return Math.max(0, Date.now() - Hyc.statSync(getCachePath()).mtimeMs);
    } catch {
      return;
    }
  }
  function recordPolicyLimitsStartupAwaitResult(e) {
    d7o = e;
  }
  function p7o() {
    if (stopBackgroundPolling(), setSessionCache(null), hhe?.(), BJe = null, hhe = null, UJe !== null) {
      clearTimeout(UJe);
      UJe = null;
    }
  }
  function _resetPolicyLimitsForTesting() {
    p7o();
    i7o = false;
    _Rt = "not_started";
    l7o = false;
    kmr = undefined;
    d7o = "not_awaited";
    a7o = false;
  }
  function initializePolicyLimitsLoadingPromise() {
    if (BJe) {
      return;
    }
    if (isPolicyLimitsEligible()) {
      BJe = new Promise(e => {
        hhe = e;
        UJe = setTimeout(t => {
          if (hhe === t) {
            logForDebugging("Policy limits: Loading promise timed out, resolving anyway");
            hhe();
            hhe = null;
          }
        }, 30000, e);
      });
    }
  }
  function uyf() {
    return `${getOauthConfig().BASE_API_URL}/api/claude_code/policy_limits`;
  }
  function c7o(e) {
    if (Array.isArray(e)) {
      return e.map(c7o);
    }
    if (e !== null && typeof e === "object") {
      let t = {};
      for (let [n, r] of Object.entries(e).sort(([o], [s]) => o.localeCompare(s))) {
        t[n] = c7o(r);
      }
      return t;
    }
    return e;
  }
  function dyf(e) {
    let t = c7o(e);
    let n = De(t);
    return `sha256:${$yc.createHash("sha256").update(n).digest("hex")}`;
  }
  function shouldAwaitPolicyLimitsOnStartup() {
    return isPolicyLimitsEligible() && loadCachedResponse() === null;
  }
  async function waitForPolicyLimitsToLoad() {
    if (BJe) {
      await BJe;
    }
  }
  function pyf() {
    let e = null;
    try {
      e = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      }).key;
    } catch {}
    if (!e && shouldUseWIFAuth()) {
      return "wif";
    }
    if (isClaudeAISubscriber() && getClaudeAIOAuthTokens()?.accessToken) {
      return "oauth";
    }
    return e ? "api_key" : "oauth";
  }
  async function myf(e) {
    let t = null;
    for (let n = 1; n <= 5 + 1; n++) {
      if (t = await fyf(e), t.attempts = n, t.success) {
        return t;
      }
      if (t.skipRetry) {
        return t;
      }
      if (n > 5) {
        return t;
      }
      let r = YV(n);
      logForDebugging(`Policy limits: Retry ${n}/${5} after ${r}ms`);
      await sleep(r);
    }
    return t;
  }
  async function fyf(e) {
    let t;
    try {
      t = await checkAndRefreshOAuthTokenIfNeededWithOutcome();
      let n = await getAuthHeadersAsync();
      if (n.error) {
        return {
          success: false,
          error: "Authentication required for policy limits",
          errorCode: "auth_failed",
          authUnavailableReason: n.reasonCode,
          tokenRefreshOutcome: t,
          skipRetry: true
        };
      }
      let r = uyf();
      let o = {
        ...n.headers,
        "User-Agent": dg()
      };
      if (e) {
        o["If-None-Match"] = `"${e}"`;
      }
      let s = await NP.get(r, {
        headers: o,
        timeout: 1e4,
        validateStatus: a => a === 200 || a === 304 || a === 404
      });
      if (s.status === 304) {
        logForDebugging("Policy limits: Using cached restrictions (304)");
        return {
          success: true,
          response: null,
          etag: e
        };
      }
      if (s.status === 404) {
        logForDebugging("Policy limits: No restrictions found (404)");
        return {
          success: true,
          response: QXr,
          etag: undefined
        };
      }
      let i = yDn().safeParse(s.data);
      if (!i.success) {
        let a = i.error.issues[0]?.path[0];
        let l = a === "restrictions" ? "restrictions" : a === "compliance_taints" ? "compliance_taints" : a === "defaults" ? "defaults" : a === undefined ? "root" : "other";
        let c = (s.headers["content-type"] ?? "").toString().toLowerCase();
        let u = c.includes("text/html") ? "html" : c.includes("application/json") || c.includes("text/json") ? "json" : c.includes("text/") ? "text" : "other";
        logForDebugging(`Policy limits: Invalid response format - field=${l} ct=${u} - ${i.error.message}`);
        return {
          success: false,
          error: "Invalid policy limits format",
          errorCode: "parse_failed",
          parseErrorField: l,
          parseErrorContentType: u
        };
      }
      logForDebugging("Policy limits: Fetched successfully");
      return {
        success: true,
        response: i.data
      };
    } catch (n) {
      let {
        kind: r,
        status: o,
        message: s
      } = YS(n);
      switch (logForDebugging(`Policy limits: fetch failed (${r}${o ? ` ${o}` : ""}) \u2014 ${s}`), r) {
        case "auth":
          return {
            success: false,
            error: "Not authorized for policy limits",
            errorCode: "auth_failed",
            httpStatus: o,
            tokenRefreshOutcome: t,
            skipRetry: true
          };
        case "timeout":
          return {
            success: false,
            error: "Policy limits request timeout",
            errorCode: "timeout"
          };
        case "network":
          return {
            success: false,
            error: "Cannot connect to server",
            errorCode: "network_error"
          };
        default:
          return {
            success: false,
            error: s,
            errorCode: "request_failed",
            httpStatus: o
          };
      }
    }
  }
  async function hyf(e) {
    try {
      let t = getCachePath();
      await $Je.writeFile(t, De(e, null, 2), {
        encoding: "utf-8",
        mode: 384
      });
      logForDebugging(`Policy limits: Saved to ${t}`);
    } catch (t) {
      if (logForDebugging(`Policy limits: Failed to save - ${t instanceof Error ? t.message : "unknown error"}`), !a7o) {
        a7o = true;
        logEvent("tengu_policy_limits_cache_write_failed", {
          errno: gyf(t)
        });
      }
    }
  }
  function gyf(e) {
    let t = en(e);
    switch (t) {
      case "EACCES":
      case "EPERM":
      case "EROFS":
      case "ENOSPC":
      case "EDQUOT":
      case "ENOENT":
      case "ENOTDIR":
      case "EMFILE":
      case "ENFILE":
      case "EBUSY":
        return t;
      default:
        return "other";
    }
  }
  async function Gyc(e, t = false) {
    let n = e === "policy_limits_load" && !l7o;
    if (n) {
      l7o = true;
    }
    if (!isPolicyLimitsEligible()) {
      return null;
    }
    if (n) {
      _Rt = "in_flight";
    }
    let r = loadCachedResponse();
    let o = qyc();
    if (r && !getSessionCache()) {
      setSessionCache(r);
    }
    let s = r ? dyf(r) : undefined;
    let i = pyf();
    let a = Date.now();
    try {
      let l = await myf(s);
      if (n) {
        _Rt = l.success ? "succeeded" : "failed";
        kmr = l.success ? undefined : l.errorCode ?? "request_failed";
      }
      let c = Date.now();
      if (logEvent("tengu_policy_limits_fetch", {
        duration_ms: c - a,
        ms_since_startup: c - Wyc,
        success: l.success,
        had_cache: r !== null,
        cache_age_ms: o,
        attempts: l.attempts,
        is_load: e === "policy_limits_load",
        awaited: t,
        auth_type: i,
        error_code: l.errorCode == null ? undefined : l.errorCode,
        token_source: getAuthTokenSource().source,
        auth_unavailable_reason: l.authUnavailableReason == null ? undefined : l.authUnavailableReason,
        token_refresh_outcome: i === "oauth" ? l.tokenRefreshOutcome == null ? undefined : l.tokenRefreshOutcome : undefined,
        http_status: l.httpStatus,
        parse_error_field: l.parseErrorField == null ? undefined : l.parseErrorField,
        parse_error_content_type: l.parseErrorContentType == null ? undefined : l.parseErrorContentType
      }), !l.success) {
        if (r) {
          logForDebugging("Policy limits: Using stale cache after fetch failure");
          setSessionCache(r);
          Et(e, "stale_cache_used");
          return r;
        }
        Ae(e, l.errorCode ?? "request_failed");
        return null;
      }
      if (l.response === null && r) {
        logForDebugging("Policy limits: Cache still valid (304 Not Modified)");
        setSessionCache(r);
        try {
          let d = new Date();
          await $Je.utimes(getCachePath(), d, d);
        } catch {}
        Pe(e);
        return r;
      }
      let u = l.response ?? QXr;
      setSessionCache(u);
      await hyf(u);
      logForDebugging(Object.keys(u.restrictions).length > 0 ? "Policy limits: Applied new restrictions successfully" : "Policy limits: No restrictions (cached empty)");
      Pe(e);
      return u;
    } catch {
      if (n && _Rt === "in_flight") {
        _Rt = "failed";
        kmr = "unexpected_error";
      }
      if (r) {
        logForDebugging("Policy limits: Using stale cache after error");
        setSessionCache(r);
        Et(e, "stale_cache_used");
        return r;
      }
      Ae(e, "unexpected_error");
      return null;
    }
  }
  function logPolicyLimitsCacheStateAtFirstPrompt() {
    if (i7o) {
      return;
    }
    i7o = true;
    let e = getPolicyLimitsIneligibleReason();
    let t = e === undefined;
    let n = e === "custom_base_url" ? getPolicyLimitsIneligibleReason({
      skipBaseUrlCheck: true
    }) === undefined : t;
    let r = getResponseFromCache() !== null;
    let o = t ? qyc() : undefined;
    let s = _Rt;
    let i = d7o;
    let a = kmr;
    let l = mgo();
    logEvent("tengu_policy_limits_cache_state_at_first_prompt", {
      eligible: t,
      ineligible_reason: e == null ? undefined : e,
      eligible_if_base_url_gate_removed: n,
      has_cache: r,
      cache_age_ms: o,
      would_fail_closed: t && (!r || (o ?? 1 / 0) > 86400000),
      ms_since_startup: Date.now() - Wyc,
      load_state: s,
      startup_fetch_error_code: a == null ? undefined : a,
      startup_await_result: i,
      error_reporting_gate: l
    });
  }
  async function loadPolicyLimits({
    startupAwaited: e = false
  } = {}) {
    if (isPolicyLimitsEligible() && !BJe) {
      BJe = new Promise(n => {
        hhe = n;
      });
    }
    let t = hhe;
    try {
      if (await Gyc("policy_limits_load", e), isPolicyLimitsEligible()) {
        startBackgroundPolling();
      }
    } finally {
      if (t) {
        if (t(), hhe === t) {
          if (hhe = null, UJe) {
            clearTimeout(UJe);
            UJe = null;
          }
        }
      }
    }
  }
  async function refreshPolicyLimits() {
    if (p7o(), initializePolicyLimitsLoadingPromise(), !isPolicyLimitsEligible()) {
      return;
    }
    try {
      await $Je.unlink(getCachePath());
    } catch {}
    await loadPolicyLimits();
    logForDebugging("Policy limits: Refreshed after auth change");
  }
  async function clearPolicyLimitsCache() {
    p7o();
    try {
      await $Je.unlink(getCachePath());
    } catch {}
  }
  async function yyf() {
    if (!isPolicyLimitsEligible()) {
      return;
    }
    let e = getSessionCache();
    let t = e ? De(e) : null;
    try {
      await Gyc("policy_limits_poll");
      let n = getSessionCache();
      if ((n ? De(n) : null) !== t) {
        logForDebugging("Policy limits: Changed during background poll");
      }
    } catch {}
  }
  function startBackgroundPolling() {
    if (xmr !== null) {
      return;
    }
    if (!isPolicyLimitsEligible()) {
      return;
    }
    if (xmr = _Dn(() => void yyf(), 3600000, {
      unref: true
    }), !Byc) {
      Byc = true;
      Ti(stopBackgroundPolling);
    }
  }
  function stopBackgroundPolling() {
    xmr?.[Symbol.dispose]();
    xmr = null;
  }
  var $yc;
  var Hyc;
  var $Je;
  var xmr = null;
  var Byc = false;
  var BJe = null;
  var hhe = null;
  var UJe = null;
  var i7o = false;
  var a7o = false;
  var Wyc;
  var _Rt = "not_started";
  var l7o = false;
  var kmr;
  var d7o = "not_awaited";
  var q$ = __lazy(() => {
    Dp();
    Uc();
    no();
    hd();
    je();
    dt();
    YA();
    ln();
    Ot();
    r6e();
    fgo();
    Kc();
    ZXr();
    $yc = require("crypto");
    Hyc = require("fs");
    $Je = require("fs/promises");
    Wyc = Date.now();
  });
  var Lmr = {};
  __export(Lmr, {
    isRunningInRemoteEnvironment: () => isRunningInRemoteEnvironment,
    isRemoteControlInternalEventsEnabled: () => isRemoteControlInternalEventsEnabled,
    isRemoteControlHardDisabled: () => isRemoteControlHardDisabled,
    isPreviewHmrEnabled: () => isPreviewHmrEnabled,
    isPolicyLimitsCacheLoaded: () => isPolicyLimitsCacheLoaded,
    isPersistentRemoteSessionEnabled: () => isPersistentRemoteSessionEnabled,
    isCseShimEnabled: () => isCseShimEnabled,
    isCcrV2SendEventsEnabled: () => isCcrV2SendEventsEnabled,
    isCcrMirrorEnabled: () => isCcrMirrorEnabled,
    isBridgeFirstParty: () => isBridgeFirstParty,
    isBridgeEnabledBlocking: () => isBridgeEnabledBlocking,
    isBridgeEnabled: () => isBridgeEnabled,
    hasBridgeEntitlement: () => hasBridgeEntitlement,
    getRemoteControlPolicyVerdict: () => getRemoteControlPolicyVerdict,
    getCcrAutoConnectDefault: () => getCcrAutoConnectDefault,
    getBridgeGrowthBookDebugLines: () => getBridgeGrowthBookDebugLines,
    getBridgeEntitlementBlocker: () => getBridgeEntitlementBlocker,
    getBridgeDoctorInfo: () => getBridgeDoctorInfo,
    getBridgeDisabledReason: () => getBridgeDisabledReason,
    getBridgeAuthDebugInfo: () => getBridgeAuthDebugInfo,
    describeAuthPrecedenceBlocker: () => describeAuthPrecedenceBlocker,
    checkBridgeMinVersion: () => checkBridgeMinVersion,
    applyRemoteControlToAppState: () => applyRemoteControlToAppState,
    applyAutoUploadSessionsToAppState: () => applyAutoUploadSessionsToAppState,
    _resetDiagnosticPolicyKickForTesting: () => _resetDiagnosticPolicyKickForTesting
  });
  function isBridgeFirstParty() {
    if (!isFirstPartyProvider()) {
      return false;
    }
    return !!Me.ANTHROPIC_UNIX_SOCKET || isActualFirstPartyAnthropicBaseUrl();
  }
  function hasBridgeEntitlement() {
    return isBridgeFirstParty() && SRt() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_ccr_bridge", false);
  }
  function getBridgeEntitlementBlocker() {
    if (hasBridgeEntitlement()) {
      return null;
    }
    if (!Mmr()) {
      return "not_signed_in";
    }
    if (!SRt()) {
      return "api_key_auth";
    }
    if (!Nmr()) {
      return "no_profile_scope";
    }
    return "not_in_rollout";
  }
  function Dmr() {
    return false;
  }
  function isRemoteControlHardDisabled() {
    return sI()?.settings.disableRemoteControl === true;
  }
  function isBridgeEnabled() {
    if (Dmr()) {
      return true;
    }
    if (isRemoteControlHardDisabled()) {
      return false;
    }
    return !isRunningInRemoteEnvironment() && hasBridgeEntitlement();
  }
  async function isBridgeEnabledBlocking() {
    if (Dmr()) {
      return true;
    }
    if (isRemoteControlHardDisabled()) {
      return false;
    }
    return isBridgeFirstParty() && !isRunningInRemoteEnvironment() && SRt() && (await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bridge"));
  }
  async function getBridgeDisabledReason() {
    if (Dmr()) {
      return null;
    }
    if (!isBridgeFirstParty()) {
      return "Remote Control is only available when using Claude via api.anthropic.com.";
    }
    if (isRunningInRemoteEnvironment()) {
      return "Remote Control is not available inside a cloud session.";
    }
    if (isRemoteControlHardDisabled()) {
      return "Remote Control is disabled by your organization's policy (managed setting `disableRemoteControl`).";
    }
    if (!Mmr()) {
      return "Remote Control requires a claude.ai subscription. Run `claude auth login` to sign in with your claude.ai account.";
    }
    if (!SRt()) {
      return describeAuthPrecedenceBlocker({
        prefix: "Remote Control requires claude.ai subscription auth.",
        suffix: "to use Remote Control."
      });
    }
    if (!Nmr()) {
      return "Remote Control requires a full-scope login token. Long-lived tokens (from `claude setup-token` or CLAUDE_CODE_OAUTH_TOKEN) are limited to inference-only for security reasons. Run `claude auth login` to use Remote Control.";
    }
    if (!g7o()?.organizationUuid) {
      return "Unable to determine your organization for Remote Control eligibility. Run `claude auth login` to refresh your account information.";
    }
    await Yyc();
    let e = getRemoteControlPolicyVerdict();
    if (e === "unavailable") {
      return "Couldn't verify your organization's Remote Control policy. Retry, or run `claude doctor` for details.";
    }
    if (e === "denied") {
      let t = Gle();
      if (t.length > 0) {
        return `Remote Control isn't available for your organization due to its compliance policy (${t.join(", ")}).`;
      }
      return "Remote Control is disabled by your organization's policy. Contact your organization admin for access.";
    }
    if (!isGrowthBookEnabled()) {
      let t = $fn();
      if (t) {
        return `Remote Control requires feature-flag evaluation, which is disabled because ${t} is set. Unset it (or run in a shell without it) to use Remote Control.`;
      }
      if (Me.DISABLE_GROWTHBOOK) {
        return "Remote Control requires feature-flag evaluation, which is disabled because DISABLE_GROWTHBOOK is set. Unset it (or run in a shell without it) to use Remote Control.";
      }
      return "Remote Control requires feature-flag evaluation, which is unavailable in this environment.";
    }
    if (!(await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bridge"))) {
      if (!hasFreshGrowthBookFeatures()) {
        if (refreshGrowthBookAfterAuthChange(), await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bridge")) {
          return null;
        }
        if (!hasFreshGrowthBookFeatures()) {
          return "Couldn't verify Remote Control eligibility \u2014 the feature-flag service was unreachable (offline or blocked). Retry, or run with `--debug` / `claude doctor` for details.";
        }
      }
      return "Remote Control is not yet enabled for your account. If you recently changed plans, run `claude auth logout` then `claude auth login` to refresh your entitlements, or `claude doctor` for details.";
    }
    return null;
  }
  function getBridgeAuthDebugInfo() {
    if (!isDebugMode()) {
      return "";
    }
    let e = t => t ? "set" : "unset";
    try {
      let t = getClaudeAIOAuthTokens();
      let n = ["CLAUDE_CODE_USE_BEDROCK", "CLAUDE_CODE_USE_VERTEX", "CLAUDE_CODE_USE_FOUNDRY", "CLAUDE_CODE_USE_ANTHROPIC_AWS", "CLAUDE_CODE_USE_MANTLE"].filter(r => st(process.env[r]));
      return ["", "[debug] Remote Control auth state:", `  isBareMode=${kd()}`, `  hasOAuthAccessToken=${!!t?.accessToken}`, `  oauthScopes=${t?.scopes?.join(",") ?? "none"}`, `  hasClaudeAIInferenceScope=${Mmr()}`, `  isClaudeAISubscriber=${SRt()}`, `  hasProfileScope=${Nmr()}`, `  oauthAccount.organizationUuid=${g7o()?.organizationUuid ? "set" : "unset"}`, `  ANTHROPIC_API_KEY=${e(process.env.ANTHROPIC_API_KEY)}`, `  ANTHROPIC_AUTH_TOKEN=${e(process.env.ANTHROPIC_AUTH_TOKEN)}`, `  apiKeyHelper=${getConfiguredApiKeyHelper() ? "set" : "unset"}`, `  CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR=${e(process.env.CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR)}`, `  CLAUDE_CODE_OAUTH_TOKEN=${e(process.env.CLAUDE_CODE_OAUTH_TOKEN)}`, `  ANTHROPIC_UNIX_SOCKET=${e(process.env.ANTHROPIC_UNIX_SOCKET)}`, `  3P env=${n.length ? n.join(",") : "none"}`, ...getBridgeGrowthBookDebugLines()].join(`
`);
    } catch (t) {
      return `
[debug] failed to collect auth state: ${t}`;
    }
  }
  function getBridgeGrowthBookDebugLines() {
    let e = r => r ? "set" : "unset";
    let t = getAllGrowthBookFeatures();
    let n = byf();
    return [`  isGrowthBookEnabled=${isGrowthBookEnabled()}`, `  telemetryDisabledBy=${$fn() ?? "none"}`, `  DISABLE_GROWTHBOOK=${e(process.env.DISABLE_GROWTHBOOK)}`, `  hasFreshGrowthBookFeatures=${hasFreshGrowthBookFeatures()}`, `  growthBookFeaturesLoaded=${Object.keys(t).length}`, `  growthBookLastFetched=${n ? `${Syf(Date.now() - n)} ago` : "never"}`, `  tengu_ccr_bridge=${String(t.tengu_ccr_bridge ?? "unset")}`];
  }
  async function getBridgeDoctorInfo() {
    if (isRunningInRemoteEnvironment() && !Dmr()) {
      return {
        disabledReason: null,
        inRemoteSession: true,
        checks: []
      };
    }
    refreshGrowthBookAfterAuthChange();
    await Yyc();
    let e = await getBridgeDisabledReason();
    let t = $fn() ?? (Me.DISABLE_GROWTHBOOK ? "DISABLE_GROWTHBOOK" : null);
    let n = isBridgeFirstParty();
    let r = !isRemoteControlHardDisabled();
    let o = Mmr();
    let s = SRt();
    let i = Nmr();
    let a = !!g7o()?.organizationUuid;
    let l = getRemoteControlPolicyVerdict();
    let c = isGrowthBookEnabled();
    let u = await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bridge");
    let d = hasFreshGrowthBookFeatures();
    let p = [{
      label: n ? "Connected to the Anthropic API (api.anthropic.com)" : "Not connected to the Anthropic API (api.anthropic.com)",
      ok: n
    }, {
      label: r ? "Not disabled by org policy (disableRemoteControl)" : "Disabled by org policy (disableRemoteControl)",
      ok: r
    }, {
      label: o ? "Signed in to claude.ai" : "Not signed in to claude.ai",
      ok: o
    }, {
      label: s ? "claude.ai subscription active" : "claude.ai subscription auth not active",
      ok: s
    }, {
      label: i ? "Sign-in includes the user:profile scope" : "Sign-in is missing the user:profile scope",
      ok: i
    }, {
      label: a ? "Organization resolved" : "Organization not resolved",
      ok: a
    }, {
      label: l === "allowed" ? "Org policy allows Remote Control (allow_remote_control)" : l === "unavailable" ? "Org policy could not be verified (allow_remote_control)" : "Org policy does not allow Remote Control (allow_remote_control)",
      ok: l === "allowed",
      detail: Gle().join(", ") || undefined
    }, {
      label: c ? "Feature-flag evaluation enabled" : "Feature-flag evaluation disabled",
      ok: c,
      detail: t ? `disabled by ${t}` : undefined
    }, {
      label: u ? "Remote Control rollout enabled for this account" : d ? "Remote Control rollout not enabled for this account" : "Remote Control rollout could not be verified for this account",
      ok: u,
      detail: d ? undefined : "no server response this session"
    }];
    return {
      disabledReason: e,
      inRemoteSession: false,
      checks: p
    };
  }
  function byf() {
    try {
      return getGlobalConfig().cachedGrowthBookFeaturesAt;
    } catch {
      return;
    }
  }
  function Syf(e) {
    let t = Math.round(e / 1000);
    if (t < 120) {
      return `${t}s`;
    }
    let n = Math.round(t / 60);
    if (n < 120) {
      return `${n}m`;
    }
    let r = Math.round(n / 60);
    if (r < 48) {
      return `${r}h`;
    }
    return `${Math.round(r / 24)}d`;
  }
  function describeAuthPrecedenceBlocker({
    prefix: e,
    suffix: t
  }) {
    try {
      let {
        source: n
      } = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      if (n === "ANTHROPIC_API_KEY") {
        return `${e} ANTHROPIC_API_KEY is set, so this session is using API-key auth \u2014 unset it (or run in a shell without it) ${t}`;
      }
      if (n === "apiKeyHelper") {
        return `${e} apiKeyHelper is configured, so this session is using API-key auth \u2014 unset it ${t}`;
      }
      if (process.env.ANTHROPIC_AUTH_TOKEN) {
        return `${e} ANTHROPIC_AUTH_TOKEN is set, so this session is using API-key auth \u2014 unset it (or run in a shell without it) ${t}`;
      }
      let {
        source: r
      } = getAuthTokenSource();
      let o = describeHowToDisableAuthTokenSource(r);
      if (r !== "none" && o) {
        return `${e} This session is using ${r} auth \u2014 ${o}`;
      }
      if (process.env.ANTHROPIC_UNIX_SOCKET) {
        return `${e} ANTHROPIC_UNIX_SOCKET is set (claude ssh remote), and the local proxy is API-key-authed.`;
      }
    } catch {}
    return `${e} Unset ANTHROPIC_API_KEY / apiKeyHelper / ANTHROPIC_AUTH_TOKEN ${t}`;
  }
  function Mmr() {
    try {
      return Boolean(getClaudeAIOAuthTokens()?.scopes?.includes("user:inference"));
    } catch {
      return false;
    }
  }
  function SRt() {
    try {
      return isClaudeAISubscriber();
    } catch {
      return false;
    }
  }
  function Nmr() {
    try {
      return hasProfileScope();
    } catch {
      return false;
    }
  }
  function g7o() {
    try {
      return getGlobalConfig().oauthAccount;
    } catch {
      return;
    }
  }
  function _resetDiagnosticPolicyKickForTesting() {
    bRt = undefined;
  }
  async function Yyc() {
    try {
      if (getResponseFromCache() !== null) {
        return;
      }
    } catch {}
    let e = await Promise.resolve().then(() => (q$(), G6t));
    if (e.initializePolicyLimitsLoadingPromise(), bRt === undefined) {
      let t = e.loadPolicyLimits();
      t.catch(() => {}).finally(() => {
        try {
          if (getResponseFromCache() === null) {
            bRt = undefined;
          }
        } catch {
          bRt = undefined;
        }
      });
      bRt = withTimeout(t, e.POLICY_LIMITS_COLD_AWAIT_MS, "bridge_diagnostic_policy_limits").catch(() => {});
    }
    await bRt;
  }
  function getRemoteControlPolicyVerdict() {
    try {
      return isPolicyAllowed("allow_remote_control") ? "allowed" : "denied";
    } catch {
      return "unavailable";
    }
  }
  function isPolicyLimitsCacheLoaded() {
    if (!isPolicyLimitsEligible()) {
      return true;
    }
    return getResponseFromCache() !== null;
  }
  function Eyf() {
    try {
      return sI()?.settings.autoUploadSessions ?? getGlobalConfig().autoUploadSessions;
    } catch {
      return;
    }
  }
  function isRunningInRemoteEnvironment() {
    return st(process.env.CLAUDE_CODE_REMOTE) || getIsRemoteMode();
  }
  function isCseShimEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_repl_v2_cse_shim_enabled", true);
  }
  function isCcrV2SendEventsEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ccr_v2_send_events_cli", false);
  }
  function checkBridgeMinVersion() {
    let e = getDynamicConfig_CACHED_MAY_BE_STALE("tengu_bridge_min_version", {
      minVersion: "0.0.0"
    });
    if (e.minVersion && Vne({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, e.minVersion)) {
      return `Your version of Claude Code (${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}) is too old for Remote Control.
Version ${e.minVersion} or higher is required. Run \`claude update\` to update.`;
    }
    return null;
  }
  function getCcrAutoConnectDefault() {
    if (isRunningInRemoteEnvironment()) {
      return false;
    }
    if (isPersistentRemoteSessionEnabled()) {
      return true;
    }
    let e = getPolicyDefault("remote_control_at_startup");
    if (e !== undefined) {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_harbor", false);
  }
  function isPersistentRemoteSessionEnabled() {
    return false;
  }
  function isRemoteControlInternalEventsEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_relay", false);
  }
  function isCcrMirrorEnabled() {
    return false;
  }
  function isPreviewHmrEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_vivid", false);
  }
  function applyRemoteControlToAppState(e, t) {
    if (e.replBridgeOutboundOnly && !t) {
      return e;
    }
    if (e.replBridgeEnabled === t && !e.replBridgeOutboundOnly) {
      return e;
    }
    return {
      ...e,
      replBridgeEnabled: t,
      replBridgeOutboundOnly: false
    };
  }
  function applyAutoUploadSessionsToAppState(e, t) {
    if (e.replBridgeEnabled && !e.replBridgeOutboundOnly) {
      return e;
    }
    if (e.replBridgeEnabled === t && e.replBridgeOutboundOnly === t) {
      return e;
    }
    return {
      ...e,
      replBridgeEnabled: t,
      replBridgeOutboundOnly: t
    };
  }
  var bRt;
  var Ox = __lazy(() => {
    at();
    Uc();
    $n();
    $Y();
    Kc();
    no();
    je();
    pr();
    gn();
    Ds();
    Wd();
    DA();
  });
  var bz = {};
  __export(bz, {
    shouldSkipPluginAutoupdate: () => shouldSkipPluginAutoupdate,
    setPathTrusted: () => setPathTrusted,
    setClientDataCacheKeyGetter: () => setClientDataCacheKeyGetter,
    saveGlobalConfig: () => saveGlobalConfig,
    saveCurrentProjectConfig: () => saveCurrentProjectConfig,
    resetTrustDialogAcceptedCache: () => resetTrustDialogAcceptedCache,
    resetLocalSettingsGitTrackedCache: () => resetLocalSettingsGitTrackedCache,
    recordFirstStartTime: () => recordFirstStartTime,
    isWorkspacePersistedTrusted: () => isWorkspacePersistedTrusted,
    isProjectScopeTrustAccepted: () => isProjectScopeTrustAccepted,
    isProjectConfigKey: () => isProjectConfigKey,
    isPathTrusted: () => isPathTrusted,
    isLocalSettingsGitTracked: () => isLocalSettingsGitTracked,
    isGlobalConfigKey: () => isGlobalConfigKey,
    isAutoUpdaterDisabled: () => isAutoUpdaterDisabled,
    hasClientDataCacheSlot: () => hasClientDataCacheSlot,
    getWorkspacePersistedTrustKey: () => getWorkspacePersistedTrustKey,
    getUserClaudeRulesDir: () => getUserClaudeRulesDir,
    getRemoteControlAtStartup: () => getRemoteControlAtStartup,
    getRawCurrentProjectConfigEntry: () => getRawCurrentProjectConfigEntry,
    getProjectPathForConfig: () => getProjectPathForConfig,
    getOrCreateUserID: () => getOrCreateUserID,
    getOrCreateMachineID: () => getOrCreateMachineID,
    getMemoryPath: () => getMemoryPath,
    getManagedClaudeRulesDir: () => getManagedClaudeRulesDir,
    getGlobalConfig: () => getGlobalConfig,
    getExplicitRemoteControlAtStartup: () => getExplicitRemoteControlAtStartup,
    getDaemonColdStart: () => getDaemonColdStart,
    getCustomApiKeyStatus: () => getCustomApiKeyStatus,
    getCurrentProjectConfig: () => getCurrentProjectConfig,
    getCachedClientData: () => getCachedClientData,
    getAutoUpdaterDisabledReason: () => getAutoUpdaterDisabledReason,
    formatAutoUpdaterDisabledReason: () => formatAutoUpdaterDisabledReason,
    enableConfigs: () => enableConfigs,
    deleteProjectConfig: () => deleteProjectConfig,
    deleteCurrentProjectConfigFields: () => deleteCurrentProjectConfigFields,
    checkHasTrustDialogAccepted: () => checkHasTrustDialogAccepted,
    ERt: () => ERt,
    _setGlobalConfigCacheForTesting: () => _setGlobalConfigCacheForTesting,
    Lnn: () => Lnn,
    _resetParseErrorDedupForTesting: () => _resetParseErrorDedupForTesting,
    x7o: () => x7o,
    Dnn: () => Dnn,
    TRt: () => TRt,
    A7o: () => A7o,
    _deleteCurrentProjectConfigFieldsForTesting: () => _deleteCurrentProjectConfigFieldsForTesting,
    Pyf: () => Pyf,
    PROJECT_CONFIG_KEYS: () => PROJECT_CONFIG_KEYS,
    NOTIFICATION_CHANNELS: () => NOTIFICATION_CHANNELS,
    GLOBAL_CONFIG_KEYS: () => GLOBAL_CONFIG_KEYS,
    EDITOR_MODES: () => EDITOR_MODES,
    DEFAULT_PROJECT_CONFIG: () => DEFAULT_PROJECT_CONFIG,
    DEFAULT_GLOBAL_CONFIG: () => DEFAULT_GLOBAL_CONFIG
  });
  function ghe() {
    return {
      numStartups: 0,
      installMethod: undefined,
      autoUpdates: undefined,
      theme: "dark",
      preferredNotifChannel: "auto",
      verbose: false,
      editorMode: "normal",
      autoCompactEnabled: true,
      autoScrollEnabled: true,
      showTurnDuration: true,
      externalEditorContext: false,
      showMessageTimestamps: false,
      hasSeenTasksHint: false,
      hasUsedStash: false,
      hasUsedBackgroundTask: false,
      queuedCommandUpHintCount: 0,
      diffTool: "auto",
      customApiKeyResponses: {
        approved: [],
        rejected: []
      },
      env: {},
      tipsHistory: {},
      memoryUsageCount: 0,
      promptQueueUseCount: 0,
      btwUseCount: 0,
      todoFeatureEnabled: true,
      showExpandedTodos: false,
      briefTranscript: false,
      messageIdleNotifThresholdMs: 60000,
      autoConnectIde: false,
      autoInstallIdeExtension: true,
      fileCheckpointingEnabled: true,
      terminalProgressBarEnabled: true,
      cachedDynamicConfigs: {},
      cachedGrowthBookFeatures: {},
      respectGitignore: true,
      copyFullResponse: false,
      unpinOpus47LaunchEffort: false,
      unpinOpus48LaunchEffort: false,
      unpinFable5LaunchEffort: false
    };
  }
  function isGlobalConfigKey(e) {
    return GLOBAL_CONFIG_KEYS.includes(e);
  }
  function resetTrustDialogAcceptedCache() {
    Qyc = false;
  }
  function checkHasTrustDialogAccepted() {
    return Qyc ||= Iyf();
  }
  function isProjectScopeTrustAccepted() {
    if (getIsNonInteractiveSession()) {
      return true;
    }
    return checkHasTrustDialogAccepted();
  }
  function isWorkspacePersistedTrusted() {
    let e = getWorkspacePersistedTrustKey();
    return getGlobalConfig().projects?.[e]?.hasTrustDialogAccepted === true;
  }
  function getWorkspacePersistedTrustKey() {
    let e = getOriginalCwd();
    return $6(findCanonicalGitRoot(e) ?? sb.resolve(e));
  }
  function isLocalSettingsGitTracked() {
    let e = getOriginalCwd();
    if (Fmr?.cwd === e) {
      return Fmr.value;
    }
    let t = Ayf();
    Fmr = {
      cwd: e,
      value: t
    };
    return t;
  }
  function resetLocalSettingsGitTrackedCache() {
    Fmr = undefined;
  }
  function Ayf() {
    let e = getOriginalCwd();
    let t = zt();
    for (let n of [sb.join(e, ".claude"), sb.join(e, ".claude", "settings.local.json")]) {
      try {
        if (t.lstatSync(n).isSymbolicLink()) {
          return true;
        }
      } catch (r) {
        if (!fn(r)) {
          return true;
        }
      }
    }
    try {
      t.lstatSync(sb.join(e, ".claude", ".git"));
      return true;
    } catch (n) {
      if (!fn(n)) {
        return true;
      }
    }
    try {
      let n = require("child_process");
      let o = (tje(), __toCommonJS(Aks)).resolveExecutableSafely("git");
      if (o === null) {
        return false;
      }
      let s = n.spawnSync(o, ["-c", "core.hooksPath=/dev/null", "-c", "core.fsmonitor=", "-C", e, "ls-files", "--error-unmatch", "--", ":(icase).claude/settings.local.json"], {
        cwd: e,
        encoding: "utf8",
        timeout: 2000,
        windowsHide: true,
        env: {
          ...process.env,
          GIT_LITERAL_PATHSPECS: ""
        }
      });
      if (s.signal !== null) {
        return true;
      }
      if (s.error && !fn(s.error)) {
        return true;
      }
      if (s.status === 128) {
        return true;
      }
      return s.status === 0;
    } catch {
      return false;
    }
  }
  function Iyf() {
    if (st(process.env.CLAUDE_CODE_SANDBOXED)) {
      return true;
    }
    if (getSessionTrustAccepted()) {
      return true;
    }
    if (li()) {
      return true;
    }
    let e = getGlobalConfig();
    let t = getProjectPathForConfig();
    if (e.projects?.[t]?.hasTrustDialogAccepted) {
      return true;
    }
    let r = $6(Nt());
    while (true) {
      if (e.projects?.[r]?.hasTrustDialogAccepted) {
        return true;
      }
      let s = $6(sb.resolve(r, ".."));
      if (s === r) {
        break;
      }
      r = s;
    }
    return false;
  }
  function isPathTrusted(e) {
    let t = getGlobalConfig();
    let n = $6(sb.resolve(e));
    while (true) {
      if (t.projects?.[n]?.hasTrustDialogAccepted) {
        return true;
      }
      let r = $6(sb.resolve(n, ".."));
      if (r === n) {
        return false;
      }
      n = r;
    }
  }
  function setPathTrusted(e) {
    let t = $6(sb.resolve(e));
    saveGlobalConfig(n => {
      if (n.projects?.[t]?.hasTrustDialogAccepted) {
        return n;
      }
      return {
        ...n,
        projects: {
          ...n.projects,
          [t]: {
            ...(n.projects?.[t] ?? DEFAULT_PROJECT_CONFIG),
            hasTrustDialogAccepted: true
          }
        }
      };
    });
  }
  function isProjectConfigKey(e) {
    return PROJECT_CONFIG_KEYS.includes(e);
  }
  function ERt(e) {
    let t = OH.config;
    if (!t) {
      return false;
    }
    let n = t.oauthAccount !== undefined && e.oauthAccount === undefined;
    let r = t.hasCompletedOnboarding === true && e.hasCompletedOnboarding !== true;
    return n || r;
  }
  function Dnn() {
    let e = TRt(hI(), ghe);
    if (Bmr && OH.config) {
      return {
        ...OH.config
      };
    }
    return e;
  }
  function saveGlobalConfig(e) {
    let t = null;
    try {
      if (Lnn(hI(), ghe, r => {
        let o = e(r);
        if (o === r) {
          return r;
        }
        t = wBe({
          ...o,
          projects: x7o(r.projects)
        });
        return t;
      }) && t) {
        Mnn(t);
      }
    } catch (n) {
      logForDebugging(`Failed to save config with lock: ${n}`, {
        level: "error"
      });
      let r = Dnn();
      if (ERt(r)) {
        logForDebugging("saveGlobalConfig fallback: re-read config is missing auth that cache has; refusing to write. See GH #3117.", {
          level: "error"
        });
        logEvent("tengu_config_auth_loss_prevented", {});
        return;
      }
      let o = e(r);
      if (o === r) {
        return;
      }
      t = wBe({
        ...o,
        projects: x7o(r.projects)
      });
      jmr(t, "save_global");
    }
  }
  function Dyf() {
    let e = Inn + Umr;
    if (e > 0) {
      logEvent("tengu_config_cache_stats", {
        cache_hits: Inn,
        cache_misses: Umr,
        hit_rate: Inn / e
      });
    }
    Inn = 0;
    Umr = 0;
  }
  function R7o(e) {
    if (delete e.showSpinnerTree, e.installMethod !== undefined) {
      return e;
    }
    let t = e;
    let n = "unknown";
    let r = e.autoUpdates ?? true;
    switch (t.autoUpdaterStatus) {
      case "migrated":
        n = "local";
        break;
      case "installed":
        n = "native";
        break;
      case "disabled":
        r = false;
        break;
      case "enabled":
      case "no_permissions":
      case "not_configured":
        n = "global";
        break;
      case undefined:
        break;
    }
    return {
      ...e,
      installMethod: n,
      autoUpdates: r
    };
  }
  function wBe(e) {
    let t = e;
    if (t.opus1mMergeNoticeSeenCount === undefined && t.voiceNoticeSeenCount === undefined && t.opus47LaunchSeenCount === undefined && t.opus48LaunchSeenCount === undefined && t.speculationEnabled === undefined) {
      return e;
    }
    let {
      opus1mMergeNoticeSeenCount: n,
      voiceNoticeSeenCount: r,
      opus47LaunchSeenCount: o,
      opus48LaunchSeenCount: s,
      speculationEnabled: i,
      ...a
    } = t;
    return a;
  }
  function x7o(e) {
    if (!e) {
      return e;
    }
    let t = {};
    let n = false;
    for (let [r, o] of Object.entries(e)) {
      if (!o || typeof o !== "object") {
        t[r] = o;
        continue;
      }
      let s = o;
      if (s.history !== undefined) {
        n = true;
        let {
          history: i,
          ...a
        } = s;
        t[r] = a;
      } else {
        t[r] = o;
      }
    }
    return n ? t : e;
  }
  function Nyf() {
    if (T7o) {
      return;
    }
    T7o = true;
    let e = hI();
    QDt(e, {
      interval: 1000,
      persistent: false
    }, t => {
      if (t.mtimeMs <= OH.mtime) {
        return;
      }
      zt().readFile(e, {
        encoding: "utf-8"
      }).then(n => {
        if (t.mtimeMs <= OH.mtime) {
          return;
        }
        let r = Ba(iW(n), false);
        if (r === null || typeof r !== "object") {
          return;
        }
        OH = {
          config: R7o({
            ...ghe(),
            ...r
          }),
          mtime: t.mtimeMs
        };
        vBe = {
          mtime: t.mtimeMs,
          size: t.size
        };
      }).catch(() => {});
    });
    Ti(async () => {
      Jyc.unwatchFile(e);
      T7o = false;
    });
  }
  function Mnn(e) {
    OH = {
      config: e,
      mtime: Date.now()
    };
    vBe = null;
  }
  function getGlobalConfig() {
    if (OH.config) {
      Inn++;
      return OH.config;
    }
    Umr++;
    try {
      let e = null;
      try {
        e = zt().statSync(hI());
      } catch {}
      let t = R7o(TRt(hI(), ghe));
      OH = {
        config: t,
        mtime: e?.mtimeMs ?? Date.now()
      };
      vBe = e ? {
        mtime: e.mtimeMs,
        size: e.size
      } : null;
      Nyf();
      return t;
    } catch {
      return R7o(TRt(hI(), ghe));
    }
  }
  function getExplicitRemoteControlAtStartup() {
    return sI()?.settings.remoteControlAtStartup ?? getGlobalConfig().remoteControlAtStartup;
  }
  function getRemoteControlAtStartup() {
    let e = getExplicitRemoteControlAtStartup();
    if (e !== undefined) {
      return e;
    }
    return (Ox(), __toCommonJS(Lmr)).getCcrAutoConnectDefault();
  }
  function getDaemonColdStart() {
    let e = process.env.CLAUDE_CODE_DAEMON_COLD_START;
    if (e === "transient" || e === "ask") {
      return e;
    }
    let t = sI()?.settings.daemonColdStart;
    if (t !== undefined) {
      return t;
    }
    return xyf?.daemonColdStartGbDefault() ?? "transient";
  }
  function getCustomApiKeyStatus(e) {
    let t = getGlobalConfig();
    if (t.customApiKeyResponses?.approved?.includes(e)) {
      return "approved";
    }
    if (t.customApiKeyResponses?.rejected?.includes(e)) {
      return "rejected";
    }
    return "new";
  }
  function jmr(e, t) {
    Mnn(e);
    let n = false;
    try {
      let r = hI();
      zt().mkdirSync(sb.dirname(r));
      let s = d_u(e, (i, a) => De(i) !== De(DEFAULT_GLOBAL_CONFIG[a]));
      HDt(r, De(s, null, 2), {
        encoding: "utf-8",
        mode: 384,
        allowSymlink: true
      });
      n = true;
    } catch (r) {
      logForDebugging(`Config fallback write also failed; continuing without persisting: ${r}`, {
        level: "error"
      });
    }
    logEvent("tengu_config_fallback_write", {
      caller: t,
      disk_ok: n
    });
    return n;
  }
  function Lnn(e, t, n) {
    let r = t();
    let o = sb.dirname(e);
    let s = zt();
    s.mkdirSync(o);
    let i;
    try {
      let a = `${e}.lock`;
      let l = Date.now();
      i = Zpi(e, {
        lockfilePath: a,
        onCompromised: f => {
          logForDebugging(`Config lock compromised: ${f}`, {
            level: "error"
          });
        }
      });
      let c = Date.now() - l;
      if (c > 100) {
        logForDebugging("Lock acquisition took longer than expected - another Claude instance may be running");
        logEvent("tengu_config_lock_contention", {
          lock_time_ms: c
        });
      }
      if (vBe && e === hI()) {
        try {
          let f = s.statSync(e);
          if (f.mtimeMs !== vBe.mtime || f.size !== vBe.size) {
            logEvent("tengu_config_stale_write", {
              read_mtime: vBe.mtime,
              write_mtime: f.mtimeMs,
              read_size: vBe.size,
              write_size: f.size
            });
          }
        } catch (f) {
          if (en(f) !== "ENOENT") {
            throw f;
          }
        }
      }
      let u = TRt(e, t);
      let d = false;
      if (e === hI()) {
        let f = OH.config;
        if (Bmr && f) {
          let h = 0;
          try {
            h = s.statSync(e).size;
          } catch {}
          logForDebugging("saveConfigWithLock: re-read hit a parse error; auto-repairing from cached config under lock. See GH #3117.", {
            level: "error"
          });
          logEvent("tengu_config_auto_repaired", {
            file_size_before: h,
            had_cached_auth: OH.config?.oauthAccount !== undefined || OH.config?.hasCompletedOnboarding === true
          });
          u = {
            ...f
          };
          d = true;
        } else if (ERt(u)) {
          logForDebugging("saveConfigWithLock: re-read config is missing auth that cache has; refusing to write to avoid wiping ~/.claude.json. See GH #3117.", {
            level: "error"
          });
          logEvent("tengu_config_auth_loss_prevented", {});
          return false;
        }
      }
      let p = n(u);
      if (p === u && !d) {
        return false;
      }
      let m = d_u(p, (f, h) => De(f) !== De(r[h]));
      try {
        let f = sb.basename(e);
        let h = P7o();
        try {
          s.mkdirSync(h);
        } catch (x) {
          if (en(x) !== "EEXIST") {
            throw x;
          }
        }
        let g = 60000;
        let y = s.readdirStringSync(h).filter(x => x.startsWith(`${f}.backup.`)).sort().reverse();
        let _ = y[0];
        let b = _ ? Number(_.split(".backup.").pop()) : 0;
        let S = !d && (Number.isNaN(b) || Date.now() - b >= g);
        if (S) {
          let x = sb.join(h, `${f}.backup.${Date.now()}`);
          s.copyFileSync(e, x);
        }
        let E = 5;
        let C = S ? s.readdirStringSync(h).filter(x => x.startsWith(`${f}.backup.`)).sort().reverse() : y;
        for (let x of C.slice(E)) {
          try {
            s.unlinkSync(sb.join(h, x));
          } catch {}
        }
      } catch (f) {
        if (en(f) !== "ENOENT") {
          logForDebugging(`Failed to backup config: ${f}`, {
            level: "error"
          });
        }
      }
      HDt(e, De(m, null, 2), {
        encoding: "utf-8",
        mode: 384,
        allowSymlink: true
      });
      return true;
    } finally {
      if (i) {
        i();
      }
    }
  }
  function enableConfigs() {
    if (k7o) {
      if (E7o !== null) {
        throw E7o;
      }
      return;
    }
    let e = Date.now();
    wn("info", "enable_configs_started");
    k7o = true;
    try {
      TRt(hI(), ghe, true);
    } catch (t) {
      throw E7o = t, t;
    }
    wn("info", "enable_configs_completed", {
      duration_ms: Date.now() - e
    });
  }
  function P7o() {
    return sb.join(er(), "backups");
  }
  function A7o(e) {
    let t = zt();
    let n = sb.basename(e);
    let r = P7o();
    try {
      let i = t.readdirStringSync(r).filter(a => a.startsWith(`${n}.backup.`)).sort().at(-1);
      if (i) {
        return sb.join(r, i);
      }
    } catch {}
    let o = sb.dirname(e);
    try {
      let i = t.readdirStringSync(o).filter(l => l.startsWith(`${n}.backup.`)).sort().at(-1);
      if (i) {
        return sb.join(o, i);
      }
      let a = `${e}.backup`;
      try {
        t.statSync(a);
        return a;
      } catch {}
    } catch {}
    return null;
  }
  function TRt(e, t, n) {
    if (!k7o) {
      throw Error("Config accessed before allowed.");
    }
    let r = zt();
    try {
      let o = r.readFileSync(e, {
        encoding: "utf-8"
      });
      try {
        let s = qt(iW(o));
        Bmr = false;
        return {
          ...t(),
          ...s
        };
      } catch (s) {
        let i = s instanceof Error ? s.message : String(s);
        throw new PB(i, e, t());
      }
    } catch (o) {
      let s = en(o);
      if (Bmr = o instanceof PB, s === "ENOENT") {
        let i = A7o(e);
        if (i) {
          process.stderr.write(`
Claude configuration file not found at: ${e}
A backup file exists at: ${i}
You can manually restore it by running: cp "${i}" "${e}"

`);
        }
        return t();
      }
      if (o instanceof PB && n) {
        throw o;
      }
      if (o instanceof PB) {
        logForDebugging(`Config file corrupted: ${o.message}`, {
          level: "error"
        });
        process.stderr.write(`
Claude configuration file at ${e} is corrupted: ${o.message}
`);
        let i = 0;
        try {
          let l = sb.basename(e);
          let c = P7o();
          r.mkdirSync(c);
          let u = r.readdirStringSync(c).filter(f => f.startsWith(`${l}.corrupted.`));
          let d;
          let p = false;
          let m = r.readFileSync(e, {
            encoding: "utf-8"
          });
          i = m.length;
          for (let f of u) {
            try {
              let h = r.readFileSync(sb.join(c, f), {
                encoding: "utf-8"
              });
              if (m === h) {
                p = true;
                break;
              }
            } catch {}
          }
          if (!p) {
            d = sb.join(c, `${l}.corrupted.${Date.now()}`);
            r.copyFileSync(e, d);
            logForDebugging(`Corrupted config backed up to: ${d}`, {
              level: "error"
            });
          }
          if (d) {
            process.stderr.write(`The corrupted file has been backed up to: ${d}
`);
          } else if (p) {
            process.stderr.write(`The corrupted file has already been backed up.
`);
          }
        } catch (l) {
          logForDebugging(`Could not back up corrupted config (${en(l) ?? l}); continuing.`, {
            level: "error"
          });
        }
        let a = A7o(e);
        if (!S7o && !C7o.vZc(e)) {
          C7o.add(e);
          S7o = true;
          try {
            let l = e === hI() ? OH.config : null;
            logEvent("tengu_config_parse_error", {
              file_size: i,
              had_cached_auth: l?.oauthAccount !== undefined || l?.hasCompletedOnboarding === true,
              has_timestamped_backup: a !== null
            });
          } finally {
            S7o = false;
          }
        }
        if (a) {
          process.stderr.write(`A backup file exists at: ${a}
You can manually restore it by running: cp "${a}" "${e}"

`);
        } else {
          process.stderr.write(`
`);
        }
      }
      return t();
    }
  }
  function getRawCurrentProjectConfigEntry() {
    return getGlobalConfig().projects?.[getProjectPathForConfig()];
  }
  function getCurrentProjectConfig() {
    let e = getProjectPathForConfig();
    let t = getGlobalConfig();
    if (!t.projects) {
      return DEFAULT_PROJECT_CONFIG;
    }
    let n = t.projects[e] ?? DEFAULT_PROJECT_CONFIG;
    if (typeof n.allowedTools === "string") {
      n.allowedTools = Ba(n.allowedTools) ?? [];
    }
    return n;
  }
  function saveCurrentProjectConfig(e) {
    let t = getProjectPathForConfig();
    let n = null;
    try {
      if (Lnn(hI(), ghe, o => {
        let s = o.projects?.[t] ?? DEFAULT_PROJECT_CONFIG;
        let i = e(s);
        if (i === s) {
          return o;
        }
        n = wBe({
          ...o,
          projects: {
            ...o.projects,
            [t]: i
          }
        });
        return n;
      }) && n) {
        Mnn(n);
      }
    } catch (r) {
      logForDebugging(`Failed to save config with lock: ${r}`, {
        level: "error"
      });
      let o = Dnn();
      if (ERt(o)) {
        logForDebugging("saveCurrentProjectConfig fallback: re-read config is missing auth that cache has; refusing to write. See GH #3117.", {
          level: "error"
        });
        logEvent("tengu_config_auth_loss_prevented", {});
        return;
      }
      let s = o.projects?.[t] ?? DEFAULT_PROJECT_CONFIG;
      let i = e(s);
      if (i === s) {
        return;
      }
      n = wBe({
        ...o,
        projects: {
          ...o.projects,
          [t]: i
        }
      });
      jmr(n, "save_project");
    }
  }
  function deleteProjectConfig(e) {
    let t = null;
    let n = null;
    try {
      let r = Lnn(hI(), ghe, o => {
        if (!o.projects?.[e]) {
          n = false;
          return o;
        }
        n = true;
        let {
          [e]: s,
          ...i
        } = o.projects;
        t = wBe({
          ...o,
          projects: i
        });
        return t;
      });
      if (r && t) {
        Mnn(t);
      }
      return r || n === false;
    } catch (r) {
      logForDebugging(`Failed to save config with lock: ${r}`, {
        level: "error"
      });
      let o = Dnn();
      if (ERt(o)) {
        logForDebugging("deleteProjectConfig fallback: re-read config is missing auth that cache has; refusing to write. See GH #3117.", {
          level: "error"
        });
        logEvent("tengu_config_auth_loss_prevented", {});
        return false;
      }
      if (!o.projects?.[e]) {
        return true;
      }
      let {
        [e]: s,
        ...i
      } = o.projects;
      t = wBe({
        ...o,
        projects: i
      });
      return jmr(t, "delete_project");
    }
  }
  function deleteCurrentProjectConfigFields(e) {
    return Zyc(e, {
      projectPath: getProjectPathForConfig,
      saveWithLock: t => Lnn(hI(), ghe, t),
      writeCache: Mnn,
      readConfigFallback: Dnn,
      wouldLoseAuth: ERt,
      fallbackSave: t => jmr(t, "delete_project_fields")
    });
  }
  function _deleteCurrentProjectConfigFieldsForTesting(e, t) {
    return Zyc(e, t);
  }
  function Zyc(e, t) {
    let n = a => {
      let l = {
        ...a
      };
      for (let c of e) {
        delete l[c];
      }
      return l;
    };
    let r = t.projectPath();
    let o = t.readConfigFallback().projects?.[r];
    if (!o || !e.some(a => a in o)) {
      return true;
    }
    let s = null;
    let i = null;
    try {
      let a = t.saveWithLock(l => {
        let c = l.projects?.[r];
        if (!c || !e.some(u => u in c)) {
          i = false;
          return l;
        }
        i = true;
        s = wBe({
          ...l,
          projects: {
            ...l.projects,
            [r]: n(c)
          }
        });
        return s;
      });
      if (a && s) {
        t.writeCache(s);
      }
      return a || i === false;
    } catch (a) {
      logForDebugging(`Failed to save config with lock: ${a}`, {
        level: "error"
      });
      let l = t.readConfigFallback();
      if (t.wouldLoseAuth(l)) {
        logForDebugging("deleteCurrentProjectConfigFields fallback: re-read config is missing auth that cache has; refusing to write. See GH #3117.", {
          level: "error"
        });
        logEvent("tengu_config_auth_loss_prevented", {});
        return false;
      }
      let c = l.projects?.[r];
      if (!c || !e.some(u => u in c)) {
        return true;
      }
      s = wBe({
        ...l,
        projects: {
          ...l.projects,
          [r]: n(c)
        }
      });
      return t.fallbackSave(s);
    }
  }
  function isAutoUpdaterDisabled() {
    return getAutoUpdaterDisabledReason() !== null;
  }
  function shouldSkipPluginAutoupdate() {
    return isAutoUpdaterDisabled() && !st(process.env.FORCE_AUTOUPDATE_PLUGINS);
  }
  function formatAutoUpdaterDisabledReason(e) {
    switch (e.type) {
      case "development":
        return "development build";
      case "env":
        return `set by env: ${e.envVar}`;
      case "config":
        return "config";
    }
  }
  function getAutoUpdaterDisabledReason() {
    if (Me.DISABLE_UPDATES) {
      return {
        type: "env",
        envVar: "DISABLE_UPDATES"
      };
    }
    if (Me.DISABLE_AUTOUPDATER) {
      return {
        type: "env",
        envVar: "DISABLE_AUTOUPDATER"
      };
    }
    let e = Rtt();
    if (e) {
      return {
        type: "env",
        envVar: e
      };
    }
    let t = getGlobalConfig();
    if (t.autoUpdates === false && (t.installMethod !== "native" || t.autoUpdatesProtectedForNative !== true)) {
      return {
        type: "config"
      };
    }
    return null;
  }
  function getOrCreateUserID() {
    let e = getGlobalConfig();
    if (e.userID) {
      return e.userID;
    }
    if (v7o) {
      return v7o;
    }
    let t = I7o.randomBytes(32).toString("hex");
    v7o = t;
    try {
      saveGlobalConfig(n => ({
        ...n,
        userID: t
      }));
    } catch (n) {
      logForDebugging(`getOrCreateUserID: could not persist userID: ${n}`, {
        level: "error"
      });
    }
    return t;
  }
  function getOrCreateMachineID() {
    let e = getGlobalConfig();
    if (e.machineID) {
      return e.machineID;
    }
    if (w7o) {
      return w7o;
    }
    let t = I7o.randomBytes(32).toString("hex");
    w7o = t;
    try {
      saveGlobalConfig(n => ({
        ...n,
        machineID: t
      }));
    } catch (n) {
      logForDebugging(`getOrCreateMachineID: could not persist machineID: ${n}`, {
        level: "error"
      });
    }
    return t;
  }
  function recordFirstStartTime() {
    if (!getGlobalConfig().firstStartTime) {
      let t = new Date().toISOString();
      saveGlobalConfig(n => ({
        ...n,
        firstStartTime: n.firstStartTime ?? t
      }));
    }
  }
  function getMemoryPath(e) {
    let t = getOriginalCwd();
    switch (e) {
      case "User":
        return sb.join(er(), "CLAUDE.md");
      case "Local":
        return sb.join(t, "CLAUDE.local.md");
      case "Project":
        return sb.join(t, "CLAUDE.md");
      case "Managed":
        return sb.join(SI(), "CLAUDE.md");
      case "AutoMem":
        return Obe();
    }
  }
  function getManagedClaudeRulesDir() {
    return sb.join(SI(), ".claude", "rules");
  }
  function getUserClaudeRulesDir() {
    return sb.join(er(), "rules");
  }
  function _resetParseErrorDedupForTesting() {
    C7o.clear();
  }
  function _setGlobalConfigCacheForTesting(e) {
    OH.config = e;
    OH.mtime = e ? Date.now() : 0;
  }
  function setClientDataCacheKeyGetter(e) {
    Pnn = e;
  }
  function getCachedClientData() {
    if (!Pnn) {
      return null;
    }
    let e = getGlobalConfig();
    let t = Pnn();
    let n = e.clientDataCacheSlots;
    if (n != null && Object.hasOwn(n, t)) {
      return Cqi(n, t);
    }
    let r = e.clientDataCache;
    return typeof r === "object" && r !== null ? r : null;
  }
  function hasClientDataCacheSlot() {
    if (!Pnn) {
      return false;
    }
    let e = getGlobalConfig().clientDataCacheSlots;
    return e != null && Object.hasOwn(e, Pnn());
  }
  var I7o;
  var Jyc;
  var sb;
  var xyf;
  var S7o = false;
  var C7o;
  var Bmr = false;
  var DEFAULT_PROJECT_CONFIG;
  var DEFAULT_GLOBAL_CONFIG;
  var GLOBAL_CONFIG_KEYS;
  var PROJECT_CONFIG_KEYS;
  var Qyc = false;
  var Fmr;
  var Pyf;
  var QSE;
  var OH;
  var vBe = null;
  var Inn = 0;
  var Umr = 0;
  var T7o = false;
  var k7o = false;
  var E7o = null;
  var getProjectPathForConfig;
  var v7o = null;
  var w7o = null;
  var Pnn = null;
  var OGt = {};