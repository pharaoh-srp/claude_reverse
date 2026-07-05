  __export(YOs, {
    startMdmRawRead: () => startMdmRawRead,
    getMdmRawReadPromise: () => getMdmRawReadPromise,
    fireRawRead: () => fireRawRead
  });
  function zOs(e, t) {
    return new Promise(n => {
      try {
        KOs.execFile(e, t, {
          encoding: "utf-8",
          timeout: 5000,
          windowsHide: true
        }, (r, o) => {
          n({
            stdout: o ?? "",
            code: r ? 1 : 0
          });
        });
      } catch {
        n({
          stdout: "",
          code: 1
        });
      }
    });
  }
  function fireRawRead() {
    return (async () => {
      if (bMt()) {
        let [e, t] = await Promise.all([zOs("/mnt/c/Windows/System32/reg.exe", ["query", "HKLM\\SOFTWARE\\Policies\\ClaudeCode", "/v", "Settings"]), zOs("/mnt/c/Windows/System32/reg.exe", ["query", "HKCU\\SOFTWARE\\Policies\\ClaudeCode", "/v", "Settings"])]);
        return {
          plistStdouts: null,
          hklmStdout: e.code === 0 ? e.stdout : null,
          hkcuStdout: t.code === 0 ? t.stdout : null
        };
      }
      return {
        plistStdouts: null,
        hklmStdout: null,
        hkcuStdout: null
      };
    })();
  }
  function startMdmRawRead() {
    if (pLr) {
      return;
    }
    pLr = fireRawRead();
  }
  function getMdmRawReadPromise() {
    return pLr;
  }
  var KOs;
  var pLr = null;
  var $yn = __lazy(() => {
    Ike();
    KOs = require("child_process");
  });
  function JGu() {
    if (Hyn) {
      return;
    }
    Hyn = (async () => {
      let e = Date.now();
      let t = getMdmRawReadPromise() ?? fireRawRead();
      let {
        mdm: n,
        hkcu: r,
        wslInherits: o
      } = tDs(await t);
      gLr = n;
      yLr = r;
      jyn = o;
      let s = Date.now() - e;
      if (logForDebugging(`MDM settings load completed in ${s}ms`), Object.keys(n.settings).length > 0) {
        logForDebugging(`MDM settings found: ${Object.keys(n.settings).join(", ")}`);
        try {
          wn("info", "mdm_settings_loaded", {
            duration_ms: s,
            key_count: Object.keys(n.settings).length,
            error_count: n.errors.length
          });
        } catch {}
      }
    })();
  }
  async function Vnt() {
    if (!Hyn) {
      JGu();
    }
    await Hyn;
  }
  function Cle() {
    return gLr ?? Vke;
  }
  function zke() {
    return yLr ?? Vke;
  }
  function Gte() {
    return jyn;
  }
  function ZOs(e, t, n) {
    gLr = e;
    yLr = t;
    jyn = n;
  }
  async function eDs() {
    let e = await fireRawRead();
    return tDs(e);
  }
  function hLr(e, t) {
    let n = Ba(e, false);
    if (!n || typeof n !== "object") {
      return {
        settings: {},
        errors: []
      };
    }
    let {
      settings: r,
      errors: o
    } = jke(n, t);
    return {
      settings: r ?? {},
      errors: o
    };
  }
  function JOs(e, t = "Settings") {
    let n = e.split(/\r?\n/);
    let r = t.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
    let o = new RegExp(`^\\s+${r}\\s+REG_(?:EXPAND_)?SZ\\s+(.*)$`, "i");
    for (let s of n) {
      let i = s.match(o);
      if (i && i[1]) {
        return i[1].trimEnd();
      }
    }
    return null;
  }
  function tDs(e) {
    let t = [];
    if (e.plistStdouts && e.plistStdouts.length > 0) {
      let {
        stdout: i,
        label: a
      } = e.plistStdouts[0];
      let l = hLr(i, a);
      let {
        wslInheritsWindowsSettings: c,
        ...u
      } = l.settings;
      if (Object.keys(u).length > 0) {
        return {
          mdm: l,
          hkcu: Vke,
          wslInherits: false
        };
      }
      t.push(...l.errors);
    }
    let n = null;
    if (e.hklmStdout) {
      let i = JOs(e.hklmStdout);
      if (i) {
        n = hLr(i, `Registry: ${"HKLM\\SOFTWARE\\Policies\\ClaudeCode"}\\${"Settings"}`);
      }
    }
    if (n) {
      t.push(...n.errors);
    }
    let r = t.length > 0 ? {
      settings: {},
      errors: t
    } : Vke;
    let o = bMt();
    let s = false;
    if (o) {
      if (s = n?.settings.wslInheritsWindowsSettings === true || QGu(), !s) {
        return {
          mdm: r,
          hkcu: Vke,
          wslInherits: false
        };
      }
    }
    if (n) {
      let {
        wslInheritsWindowsSettings: i,
        ...a
      } = n.settings;
      if (Object.keys(a).length > 0) {
        return {
          mdm: n,
          hkcu: Vke,
          wslInherits: s
        };
      }
    }
    if (XGu(s)) {
      return {
        mdm: r,
        hkcu: Vke,
        wslInherits: s
      };
    }
    if (e.hkcuStdout) {
      let i = JOs(e.hkcuStdout);
      if (i) {
        let a = hLr(i, `Registry: ${"HKCU\\SOFTWARE\\Policies\\ClaudeCode"}\\${"Settings"}`);
        if (!o || a.settings.wslInheritsWindowsSettings === true) {
          let {
            wslInheritsWindowsSettings: l,
            ...c
          } = a.settings;
          return {
            mdm: r,
            hkcu: {
              settings: c,
              errors: a.errors
            },
            wslInherits: s
          };
        }
        if (a.errors.length > 0) {
          return {
            mdm: r,
            hkcu: {
              settings: {},
              errors: a.errors
            },
            wslInherits: s
          };
        }
      }
    }
    return {
      mdm: r,
      hkcu: Vke,
      wslInherits: s
    };
  }
  function XGu(e) {
    if (e && QOs("/mnt/c/Program Files/ClaudeCode")) {
      return true;
    }
    return QOs(SI());
  }
  function XOs(e) {
    let t = xN(Ba(LP(e), false));
    if (!t || typeof t !== "object") {
      return false;
    }
    Nye(t, e);
    let {
      wslInheritsWindowsSettings: n,
      ...r
    } = t;
    return Object.keys(r).length > 0;
  }
  function _Lr() {
    if (!bMt() || !jyn) {
      return "";
    }
    let e = [];
    try {
      e.push(LP(wle.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.json")));
    } catch {
      e.push("");
    }
    try {
      let t = wle.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.d");
      let n = zt().readdirSync(t).filter(r => (r.isFile() || r.isSymbolicLink()) && r.name.endsWith(".json") && !r.name.startsWith(".")).map(r => r.name).sort();
      for (let r of n) {
        try {
          e.push(`${r}\x00${LP(wle.join(t, r))}`);
        } catch {
          e.push(`${r}\x00`);
        }
      }
    } catch {}
    return e.join("\x01");
  }
  function QGu() {
    function e(t) {
      try {
        let n = Ba(LP(t), false);
        return !!n && typeof n === "object" && "wslInheritsWindowsSettings" in n && n.wslInheritsWindowsSettings === true;
      } catch {
        return false;
      }
    }
    if (e(wle.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.json"))) {
      return true;
    }
    try {
      let t = wle.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.d");
      for (let n of zt().readdirSync(t)) {
        if ((n.isFile() || n.isSymbolicLink()) && n.name.endsWith(".json") && !n.name.startsWith(".") && e(wle.join(t, n.name))) {
          return true;
        }
      }
    } catch {}
    return false;
  }
  function QOs(e) {
    try {
      if (XOs(wle.join(e, "managed-settings.json"))) {
        return true;
      }
    } catch {}
    try {
      let t = wle.join(e, "managed-settings.d");
      let n = zt().readdirSync(t);
      for (let r of n) {
        if (!(r.isFile() || r.isSymbolicLink()) || !r.name.endsWith(".json") || r.name.startsWith(".")) {
          continue;
        }
        try {
          if (XOs(wle.join(t, r.name))) {
            return true;
          }
        } catch {}
      }
    } catch {}
    return false;
  }
  var wle;
  var Vke;
  var gLr = null;
  var yLr = null;
  var jyn = false;
  var Hyn = null;
  var Kke = __lazy(() => {
    je();
    Zm();
    KB();
    Gd();
    Bte();
    Gke();
    WMt();
    Ike();
    $yn();
    wle = require("path");
    Vke = Object.freeze({
      settings: {},
      errors: []
    });
  });
  var znt;
  var qyn = __lazy(() => {
    ph();
    znt = Si();
  });
  async function Wyn(e, t) {
    if (nDs) {
      return null;
    }
    nDs = true;
    let n = e?.policyHelper;
    if (!n) {
      return null;
    }
    if (t === null || !t9u.vZc(t)) {
      logForDebugging(`policyHelper ignored: delivered via non-admin source '${t ?? "unknown"}'`, {
        level: "warn"
      });
      return null;
    }
    let r = n9u(n.path);
    if (r) {
      Ae("settings_policy_helper", "bad_path");
      return `policyHelper failed: ${r}`;
    }
    let o = await aDs(n);
    if ("error" in o) {
      Ae("settings_policy_helper", o.code);
      return `policyHelper failed: ${o.error}`;
    }
    Lye = {
      config: n,
      output: o.output,
      warnings: o.warnings
    };
    o_();
    r9u(n);
    logForDebugging(`policyHelper applied (keys: ${Object.keys(o.output).join(",")})`, {
      level: "debug"
    });
    Pe("settings_policy_helper");
    return null;
  }
  function Gyn() {
    return Lye?.output.managedSettings ?? null;
  }
  function oDs() {
    return Lye?.output.claudeMd ?? null;
  }
  function sDs() {
    return Lye?.output.appendSystemPrompt ?? null;
  }
  function Rle() {
    return Lye !== null;
  }
  function iDs() {
    return Lye?.warnings ?? [];
  }
  async function aDs(e) {
    let t = e.timeoutMs ?? 1e4;
    let {
      stdout: n,
      stderr: r,
      code: o,
      error: s
    } = await execFileNoThrowWithCwd(e.path, [], {
      timeout: t,
      cwd: undefined,
      maxBuffer: 1048576 + 1,
      env: {
        ...process.env,
        CLAUDE_CODE_VERSION: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      }
    });
    if (r) {
      logForDebugging(`policyHelper stderr: ${r}`, {
        level: "debug"
      });
    }
    if (o !== 0) {
      return {
        error: `exited with code ${o}: ${r || n || s || ""}`,
        code: "exit_nonzero"
      };
    }
    if (Buffer.byteLength(n, "utf8") > 1048576) {
      return {
        error: `stdout exceeded ${1048576} bytes`,
        code: "oversize"
      };
    }
    let i = Ba(n, false);
    if (i === null || typeof i !== "object") {
      return {
        error: "stdout is not a JSON object",
        code: "parse_failed"
      };
    }
    let a = e9u().safeParse(i);
    if (!a.success) {
      return {
        error: `invalid envelope: ${a.error.message}`,
        code: "envelope_invalid"
      };
    }
    let l = {};
    let c = [];
    if (a.data.managedSettings !== undefined) {
      let u = xN(a.data.managedSettings);
      c = Nye(u, "policyHelper");
      for (let f of c) {
        logForDebugging(`policyHelper: ${f.message}`, {
          level: "warn"
        });
      }
      let d = $N().safeParse(u);
      if (!d.success) {
        return {
          error: `managedSettings rejected: ${d.error.message}`,
          code: "schema_rejected"
        };
      }
      let {
        policyHelper: p,
        ...m
      } = d.data;
      l.managedSettings = m;
    }
    if (a.data.claudeMd !== undefined) {
      l.claudeMd = a.data.claudeMd;
    }
    if (a.data.appendSystemPrompt !== undefined) {
      l.appendSystemPrompt = a.data.appendSystemPrompt;
    }
    return {
      output: l,
      warnings: c
    };
  }
  function n9u(e) {
    if (!rDs.isAbsolute(e)) {
      return `path must be absolute: ${e}`;
    }
    if (Wt() === "windows" && !e.toLowerCase().endsWith(".exe")) {
      return `path must end in .exe on Windows: ${e}`;
    }
    return null;
  }
  function r9u(e) {
    if (JMt) {
      clearInterval(JMt);
      JMt = null;
    }
    let t = e.refreshIntervalMs ?? 0;
    if (t <= 0) {
      return;
    }
    JMt = setInterval(n => {
      if (SLr) {
        return;
      }
      SLr = true;
      aDs(n).then(r => {
        if ("error" in r) {
          logForDebugging(`policyHelper refresh failed (retaining current policy): ${r.error}`, {
            level: "warn"
          });
          Et("settings_policy_helper", "refresh_failed");
          return;
        }
        if (Lye) {
          Lye.output = r.output;
          Lye.warnings = r.warnings;
          o_();
          try {
            znt.emit("policySettings");
            TLr.emit();
          } catch (o) {
            Oe(o);
          }
        }
      }).finally(() => {
        SLr = false;
      });
    }, t, e);
    JMt.unref?.();
  }
  var rDs;
  var TLr;
  var e9u;
  var Lye = null;
  var nDs = false;
  var JMt = null;
  var SLr = false;
  var t9u;
  var xje = __lazy(() => {
    ln();
    je();
    ji();
    Gd();
    Rn();
    Cs();
    ph();
    DA();
    qyn();
    Rj();
    WMt();
    rDs = require("path");
    TLr = Si();
    e9u = we(() => v.looseObject({
      managedSettings: v.unknown().optional(),
      claudeMd: v.string().optional(),
      appendSystemPrompt: v.string().optional()
    }));
    t9u = new Set(["plist", "hklm", "file"]);
  });
  var yY = {};
  __export(yY, {
    updateSettingsForSource: () => updateSettingsForSource,
    surfaceManagedSettingsErrorsHeadless: () => surfaceManagedSettingsErrorsHeadless,
    shouldIncludeParentTier: () => shouldIncludeParentTier,
    settingsMergeCustomizer: () => settingsMergeCustomizer,
    rawSettingsContainsKey: () => rawSettingsContainsKey,
    projectSettingsAliasesUserSettings: () => projectSettingsAliasesUserSettings,
    parseSettingsFileUncached: () => parseSettingsFileUncached,
    parseSettingsFile: () => parseSettingsFile,
    parseRemoteManagedSettings: () => parseRemoteManagedSettings,
    loadManagedFileSettingsFromDir: () => loadManagedFileSettingsFromDir,
    loadManagedFileSettings: () => loadManagedFileSettings,
    keepRestrictiveFromParent: () => keepRestrictiveFromParent,
    isAutoModeClassifyAllShellEnabled: () => isAutoModeClassifyAllShellEnabled,
    isAdminPolicyOrigin: () => isAdminPolicyOrigin,
    hasSurvivingAdminPolicySource: () => hasSurvivingAdminPolicySource,
    hasSkipWorkflowUsageWarning: () => hasSkipWorkflowUsageWarning,
    hasSkipDangerousModePermissionPrompt: () => hasSkipDangerousModePermissionPrompt,
    hasIsolatePeerMachines: () => hasIsolatePeerMachines,
    hasDisableClaudeAiConnectors: () => hasDisableClaudeAiConnectors,
    hasAutoModeOptIn: () => hasAutoModeOptIn,
    handleFileSystemError: () => handleFileSystemError,
    getUseAutoModeDuringPlan: () => getUseAutoModeDuringPlan,
    getInitialSettings: () => getInitialSettings,
    getSettingsWithSources: () => getSettingsWithSources,
    getSettingsWithErrors: () => getSettingsWithErrors,
    getSettingsRootPathForSource: () => getSettingsRootPathForSource,
    getSettingsForSource: () => getSettingsForSource,
    getSettingsFilePathForSource: () => getSettingsFilePathForSource,
    getSettingsAfterPluginLoad: () => getSettingsAfterPluginLoad,
    getSecuritySensitiveSetting: () => getSecuritySensitiveSetting,
    getRelativeSettingsFilePathForSource: () => getRelativeSettingsFilePathForSource,
    getPolicySettingsOrigin: () => getPolicySettingsOrigin,
    getPolicySettingsLoadErrors: () => getPolicySettingsLoadErrors,
    getManagedSettingsKeysForLogging: () => getManagedSettingsKeysForLogging,
    getManagedFileSettingsPresence: () => getManagedFileSettingsPresence,
    getLocalSettingsValidationErrors: () => getLocalSettingsValidationErrors,
    getInitialSettings: () => getInitialSettings,
    getFatalAdminPolicyLoadErrors: () => getFatalAdminPolicyLoadErrors,
    getEffectiveSettingSource: () => getEffectiveSettingSource,
    getBasePolicySettingsOrigin: () => getBasePolicySettingsOrigin,
    getBasePolicySettings: () => getBasePolicySettings,
    getAutoModeConfig: () => getAutoModeConfig,
    getAllPolicyTierSettings: () => getAllPolicyTierSettings,
    getAdminPolicyLoadErrors: () => getAdminPolicyLoadErrors,
    filterFatalPolicyErrors: () => filterFatalPolicyErrors
  });
  function xj() {
    let e = {
      cwd: getOriginalCwd(),
      allowedSources: getAllowedSettingSources(),
      parentManaged: getParentManagedSettings(),
      flagInline: getFlagSettingsInline(),
      flagPath: getFlagSettingsPath(),
      flagExpectedContent: getFlagSettingsExpectedContent(),
      coworkPlugins: getUseCoworkPlugins(),
      mdm: () => Cle(),
      hkcu: () => zke(),
      helper: () => Gyn(),
      helperWarnings: () => iDs(),
      wslInherits: () => Gte()
    };
    e.file = () => zMt(e);
    return e;
  }
  function getSettingsRootPathForSource(e) {
    return Lyn(e, xj());
  }
  function getSettingsFilePathForSource(e) {
    return Wke(e, xj());
  }
  function projectSettingsAliasesUserSettings() {
    let e = getSettingsFilePathForSource("projectSettings");
    let t = getSettingsFilePathForSource("userSettings");
    return !!e && !!t && gY.resolve(e) === gY.resolve(t);
  }
  function getLocalSettingsValidationErrors() {
    let e = getSettingsFilePathForSource("localSettings");
    if (!e) {
      return [];
    }
    return parseSettingsFile(e).errors;
  }
  function parseRemoteManagedSettings() {
    return qke(xj());
  }
  function loadManagedFileSettings() {
    return zMt(xj());
  }
  function getSettingsForSource(e) {
    return Uyn(e, xj());
  }
  function getAllPolicyTierSettings() {
    return qOs(xj());
  }
  function getInitialSettings() {
    return getSettingsWithErrors().settings || {};
  }
  function getSettingsWithSources() {
    o_();
    let e = [];
    for (let t of ew()) {
      let n = getSettingsForSource(t);
      if (n && Object.keys(n).length > 0) {
        e.push({
          source: t,
          settings: n
        });
      }
    }
    return {
      effective: getInitialSettings(),
      sources: e
    };
  }
  function getEffectiveSettingSource(e) {
    let t = ew();
    for (let n = t.length - 1; n >= 0; n--) {
      let r = t[n];
      if (getSettingsForSource(r)?.[e] !== undefined) {
        return r;
      }
    }
    return null;
  }
  function getSettingsWithErrors() {
    let e = sI();
    if (e !== null) {
      return e;
    }
    profileCheckpoint("loadSettingsFromDisk_start");
    let t = dLr(xj());
    profileCheckpoint("loadSettingsFromDisk_end");
    aln(t);
    return t;
  }
  function getManagedFileSettingsPresence() {
    let e = [SI()];
    if (Wt() === "wsl" && Gte()) {
      e.unshift("/mnt/c/Program Files/ClaudeCode");
    }
    for (let t of e) {
      let {
        settings: n
      } = parseSettingsFile(gY.join(t, "managed-settings.json"), undefined, true);
      let {
        wslInheritsWindowsSettings: r,
        ...o
      } = n ?? {};
      let s = Object.keys(o).length > 0;
      let i = false;
      try {
        let a = gY.join(t, "managed-settings.d");
        i = zt().readdirSync(a).some(l => {
          if (!(l.isFile() || l.isSymbolicLink()) || !l.name.endsWith(".json") || l.name.startsWith(".")) {
            return false;
          }
          let {
            settings: c
          } = parseSettingsFile(gY.join(a, l.name), undefined, true);
          let {
            wslInheritsWindowsSettings: u,
            ...d
          } = c ?? {};
          return Object.keys(d).length > 0;
        });
      } catch {}
      if (s || i) {
        return {
          hasBase: s,
          hasDropIns: i
        };
      }
    }
    return {
      hasBase: false,
      hasDropIns: false
    };
  }
  function s9u() {
    let e = Cle();
    return {
      settings: Object.keys(e.settings).length > 0 ? e.settings : null,
      errors: e.errors
    };
  }
  function getBasePolicySettings() {
    let e = xj();
    let {
      settings: t
    } = qke(e);
    if (t) {
      return t;
    }
    let {
      settings: n
    } = s9u();
    if (n) {
      return n;
    }
    let {
      settings: r
    } = loadManagedFileSettings();
    if (r) {
      return r;
    }
    let {
      settings: o
    } = Fyn(e);
    if (o) {
      return o;
    }
    let s = zke();
    return Object.keys(s.settings).length > 0 ? s.settings : null;
  }
  function getBasePolicySettingsOrigin() {
    let e = Byn({
      ...xj(),
      helper: undefined
    });
    return e === "helper" ? null : e;
  }
  function getPolicySettingsOrigin() {
    let e = xcs();
    if (e !== undefined) {
      return e.value;
    }
    let t = Rle() && Gyn() ? "helper" : getBasePolicySettingsOrigin();
    kcs(t);
    return t;
  }
  function getPolicySettingsLoadErrors() {
    let e = Tcs();
    if (e !== undefined) {
      return e;
    }
    let t = [];
    t.push(...qke(xj()).errors);
    t.push(...Cle().errors);
    t.push(...loadManagedFileSettings().errors);
    t.push(...Fyn(xj()).errors);
    t.push(...zke().errors);
    Ecs(t);
    return t;
  }
  function getAdminPolicyLoadErrors() {
    let e = vcs();
    if (e !== undefined) {
      return e;
    }
    let t = [];
    t.push(...qke(xj()).errors);
    t.push(...Cle().errors);
    t.push(...loadManagedFileSettings().errors);
    wcs(t);
    return t;
  }
  function getFatalAdminPolicyLoadErrors() {
    return filterFatalPolicyErrors(getAdminPolicyLoadErrors());
  }
  function filterFatalPolicyErrors(e) {
    return e.filter(t => t.severity !== "warning");
  }
  function hasSurvivingAdminPolicySource() {
    let e = Ccs();
    if (e !== undefined) {
      return e;
    }
    let t = r => r != null && Object.keys(r).length > 0;
    let n = Rle() && t(Gyn()) || t(qke(xj()).settings) || t(Cle().settings) || t(loadManagedFileSettings().settings);
    Rcs(n);
    return n;
  }
  function surfaceManagedSettingsErrorsHeadless() {
    let e = getPolicySettingsLoadErrors();
    if (e.length === 0) {
      return;
    }
    let t = e.some(o => o.severity !== "warning");
    let n = t ? "Managed settings failed to load; policies from the failed source are NOT in effect:" : "Managed settings contain invalid entries (remaining valid policies are still enforced):";
    let r = e.map(o => `  ${o.file ?? "managed settings"}${o.path ? ` (${o.path})` : ""}: ${o.message}`);
    process.stderr.write(`${n}
${r.join(`
`)}
`);
    logEvent("tengu_managed_settings_validation_errors", {
      error_count: e.length,
      remote_error_count: Bn(e, o => o.file === "remote managed settings"),
      fatal: t
    });
  }
  function updateSettingsForSource(e, t) {
    if (e === "policySettings" || e === "flagSettings") {
      return {
        error: null
      };
    }
    let n = getSettingsFilePathForSource(e);
    if (!n) {
      return {
        error: null
      };
    }
    try {
      zt().mkdirSync(gY.dirname(n));
      let r = uLr(e, xj());
      if (!r) {
        let i = null;
        try {
          i = LP(n);
        } catch (a) {
          if (!fn(a)) {
            throw a;
          }
        }
        if (i !== null) {
          let a = Ba(i, false);
          if (a === null) {
            logForDebugging(`updateSettingsForSource: invalid JSON in settings file at ${n}`, {
              level: "error"
            });
            return {
              error: Error(`Invalid JSON syntax in settings file at ${n}`)
            };
          }
          if (a && typeof a === "object") {
            r = a;
            logForDebugging(`Using raw settings from ${n} due to validation failure`);
          }
        }
      }
      let o = fqu(r || {}, t, (i, a, l, c) => {
        if (a === undefined && c && typeof l === "string") {
          delete c[l];
          return;
        }
        if (Array.isArray(a)) {
          return a;
        }
        return;
      });
      p1r(n);
      let s = gY.dirname(n) === getSettingsRootPathForSource("userSettings");
      if (HDt(n, De(o, null, 2) + `
`, {
        encoding: "utf-8",
        allowSymlink: e === "userSettings" || s,
        checkParentDir: (e === "projectSettings" || e === "localSettings") && !s,
        stagingDir: gY.join(gY.dirname(n), ".cc-writes")
      }), o_(), e === "localSettings") {
        Bgn(getRelativeSettingsFilePathForSource("localSettings"), getOriginalCwd()).then(i => {
          if (!i.written) {
            return;
          }
          if (i.effective) {
            Pe("gitignore_global_rule");
          } else if (i.reason === "already_tracked") {
            Et("gitignore_global_rule", i.reason);
          } else {
            Ae("gitignore_global_rule", i.reason ?? "write_ineffective");
          }
        });
      }
    } catch (r) {
      let o = Error(`Failed to read raw settings from ${n}: ${r}`);
      logForDebugging(o.message, {
        level: "error"
      });
      return {
        error: o
      };
    }
    try {
      getSettingsWithErrors();
    } catch (r) {
      Oe(r);
    }
    try {
      znt.emit(e);
    } catch (r) {
      for (let o of r instanceof AggregateError ? r.errors : [r]) {
        Oe(o);
      }
    }
    return {
      error: null
    };
  }
  function getManagedSettingsKeysForLogging(e) {
    let t = $N().strip().parse(e);
    let n = ["permissions", "sandbox", "hooks"];
    let r = [];
    let o = {
      permissions: new Set(["allow", "deny", "ask", "defaultMode", "disableBypassPermissionsMode", "disableAutoMode", "additionalDirectories"]),
      sandbox: new Set(["enabled", "failIfUnavailable", "allowUnsandboxedCommands", "network", "filesystem", "ignoreViolations", "excludedCommands", "autoAllowBashIfSandboxed", "enableWeakerNestedSandbox", "enableWeakerNetworkIsolation", "allowAppleEvents", "ripgrep"]),
      hooks: new Set(["PreToolUse", "PostToolUse", "Notification", "UserPromptSubmit", "UserPromptExpansion", "SessionStart", "SessionEnd", "Stop", "SubagentStop", "PreCompact", "PostCompact", "TeammateIdle", "TaskCreated", "TaskCompleted"])
    };
    for (let s of Object.keys(t)) {
      if (n.includes(s) && t[s] && typeof t[s] === "object") {
        let i = t[s];
        let a = o[s];
        if (a) {
          for (let l of Object.keys(i)) {
            if (a.vZc(l)) {
              r.push(`${s}.${l}`);
            }
          }
        }
      } else {
        r.push(s);
      }
    }
    return r.sort();
  }
  function getSettingsAfterPluginLoad(e) {
    if (!Lcs()) {
      logEvent("tengu_plugin_settings_premature_read", {
        key: e
      });
    }
    let {
      settings: t
    } = getSettingsWithErrors();
    return (t || {})[e];
  }
  function getSecuritySensitiveSetting(e) {
    let t = [];
    for (let n of ["policySettings", "flagSettings", "userSettings"]) {
      let r = getSettingsForSource(n)?.[e];
      if (r !== undefined) {
        t.push(r);
      }
    }
    return t;
  }
  function hasSkipDangerousModePermissionPrompt() {
    return !!(getSettingsForSource("userSettings")?.skipDangerousModePermissionPrompt || getSettingsForSource("localSettings")?.skipDangerousModePermissionPrompt || getSettingsForSource("flagSettings")?.skipDangerousModePermissionPrompt || getSettingsForSource("policySettings")?.skipDangerousModePermissionPrompt);
  }
  function hasSkipWorkflowUsageWarning() {
    return !!(getSettingsForSource("userSettings")?.skipWorkflowUsageWarning || getSettingsForSource("localSettings")?.skipWorkflowUsageWarning || getSettingsForSource("flagSettings")?.skipWorkflowUsageWarning || getSettingsForSource("policySettings")?.skipWorkflowUsageWarning);
  }
  function hasIsolatePeerMachines() {
    return ew().some(e => getSettingsForSource(e)?.isolatePeerMachines === true);
  }
  function hasDisableClaudeAiConnectors() {
    return ew().some(e => getSettingsForSource(e)?.disableClaudeAiConnectors === true);
  }
  function hasAutoModeOptIn() {
    return true;
  }
  function getUseAutoModeDuringPlan() {
    return getSettingsForSource("policySettings")?.useAutoModeDuringPlan !== false && getSettingsForSource("flagSettings")?.useAutoModeDuringPlan !== false && getSettingsForSource("userSettings")?.useAutoModeDuringPlan !== false && getSettingsForSource("localSettings")?.useAutoModeDuringPlan !== false;
  }
  function getAutoModeConfig() {
    {
      let e = a9u();
      let t = [];
      let n = [];
      let r = [];
      let o = [];
      let s = false;
      for (let i of uDs) {
        let a = getSettingsForSource(i);
        if (!a) {
          continue;
        }
        let l = e.safeParse(a.autoMode);
        if (l.success) {
          if (l.data.allow) {
            t.push(...l.data.allow);
          }
          if (l.data.soft_deny) {
            n.push(...l.data.soft_deny);
          }
          if (l.data.hard_deny) {
            r.push(...l.data.hard_deny);
          }
          if (l.data.environment) {
            o.push(...l.data.environment);
          }
        }
      }
      if (t.length > 0 || n.length > 0 || r.length > 0 || o.length > 0 || s) {
        return {
          ...(t.length > 0 && {
            allow: t
          }),
          ...(n.length > 0 && {
            soft_deny: n
          }),
          ...(r.length > 0 && {
            hard_deny: r
          }),
          ...(o.length > 0 && {
            environment: o
          }),
          ...{}
        };
      }
    }
    return;
  }
  function isAutoModeClassifyAllShellEnabled() {
    for (let e of uDs) {
      if (getSettingsForSource(e)?.autoMode?.classifyAllShell === true) {
        return true;
      }
    }
    return false;
  }
  function rawSettingsContainsKey(e) {
    let t = xj();
    for (let n of VMt(t)) {
      if (n === "policySettings") {
        continue;
      }
      if (n === "flagSettings" && t.flagExpectedContent !== undefined) {
        let o = Ba(t.flagExpectedContent, false);
        if (o && typeof o === "object" && e in o) {
          return true;
        }
        continue;
      }
      let r = Wke(n, t);
      if (!r) {
        continue;
      }
      try {
        let {
          resolvedPath: o
        } = qd(zt(), r);
        let s = LP(o);
        if (!s.trim()) {
          continue;
        }
        let i = Ba(s, false);
        if (i && typeof i === "object" && e in i) {
          return true;
        }
      } catch (o) {
        handleFileSystemError(o, r);
      }
    }
    return false;
  }
  var gY;
  var a9u;
  var uDs;