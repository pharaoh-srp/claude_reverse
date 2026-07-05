  __export(sis, {
    refuseBypassUnderRoot: () => refuseBypassUnderRoot,
    ensureAgentsBypassConsent: () => ensureAgentsBypassConsent,
    applyBypassPolicyGate: () => applyBypassPolicyGate
  });
  function ois(e) {
    return e?.permissionMode === "bypassPermissions" || e?.allowBypass === true;
  }
  function refuseBypassUnderRoot(e) {
    if (!ois(e)) {
      return;
    }
    if (nM.isRootOutsideDeliberateSandbox()) {
      console.error("--dangerously-skip-permissions cannot be used with root/sudo privileges for security reasons");
      process.exit(1);
    }
  }
  function applyBypassPolicyGate(e) {
    if (!e || !ois(e)) {
      return e;
    }
    let t = xQr();
    if (!t) {
      return e;
    }
    console.error(t);
    return {
      ...e,
      permissionMode: e.permissionMode === "bypassPermissions" ? undefined : e.permissionMode,
      allowBypass: undefined
    };
  }
  async function ensureAgentsBypassConsent(e, t) {
    if (!ois(t)) {
      return;
    }
    if (isBypassPermissionsModeDisabled()) {
      return;
    }
    if (hasSkipDangerousModePermissionPrompt() || getGlobalConfig().bypassPermissionsModeAccepted) {
      return;
    }
    let [{
      AppStateProvider: n
    }, {
      KeybindingSetup: r
    }, o] = await Promise.all([Promise.resolve().then(() => (_3(), bCo)), Promise.resolve().then(() => (C9(), $wo)), Promise.resolve().then(() => (Dts(), Ots))]);
    await new Promise(s => {
      e.render(GSr.jsx(n, {
        children: GSr.jsx(r, {
          children: GSr.jsx(o.BypassPermissionsModeDialog, {
            onAccept: s
          })
        })
      }));
    });
  }
  var GSr;
  var iis = __lazy(() => {
    YW();
    Bbe();
    GSr = __toESM(ie(), 1);
  });
  var fXc = {};