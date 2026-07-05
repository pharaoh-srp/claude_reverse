  __export(U2n, {
    isPublishToolEnabled: () => isPublishToolEnabled,
    isPlanArtifactEnabled: () => isPlanArtifactEnabled,
    isEnableArtifactUserControllable: () => isEnableArtifactUserControllable,
    isArtifactToolEnabled: () => isArtifactToolEnabled,
    isArtifactToolEligible: () => isArtifactToolEligible,
    isArtifactSdkDefaultOff: () => isArtifactSdkDefaultOff,
    isArtifactHardDisabled: () => isArtifactHardDisabled,
    isArtifactConfigurable: () => isArtifactConfigurable,
    isArtifactAdminAllowed: () => isArtifactAdminAllowed,
    getEnableArtifactPref: () => getEnableArtifactPref,
    getArtifactDefaultOn: () => getArtifactDefaultOn
  });
  function isArtifactHardDisabled() {
    return Me.CLAUDE_CODE_DISABLE_ARTIFACT || sI()?.settings.disableArtifact === true;
  }
  function isArtifactSdkDefaultOff() {
    let e = Me.CLAUDE_CODE_ENTRYPOINT;
    return Ktt() || e === "claude-code-github-action" || e === "mcp" || kDt() || Ahn();
  }
  function fpa() {
    if (!isClaudeAISubscriber()) {
      return false;
    }
    if (getAPIProvider() !== "firstParty") {
      return false;
    }
    let e = Me.CLAUDE_CODE_ENTRYPOINT;
    if (e === "local-agent" || e?.startsWith("claude-coworker")) {
      return false;
    }
    if (Vi()) {
      return false;
    }
    if (Pl(Me.CLAUDE_CODE_ARTIFACT)) {
      return false;
    }
    if (!st(Me.CLAUDE_CODE_ARTIFACT) && isArtifactSdkDefaultOff()) {
      return false;
    }
    return true;
  }
  function isArtifactToolEligible() {
    if (isArtifactHardDisabled()) {
      return false;
    }
    return fpa();
  }
  function gpa() {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth", false)) {
      return false;
    }
    return isArtifactAdminAllowed();
  }
  function isArtifactToolEnabled() {
    if (!isArtifactToolEligible()) {
      return false;
    }
    if (!gpa()) {
      return false;
    }
    return getEnableArtifactPref() ?? getArtifactDefaultOn();
  }
  function getEnableArtifactPref() {
    for (let e of ypa) {
      let t = getSettingsForSource(e)?.enableArtifact;
      if (t !== undefined) {
        return t;
      }
    }
    return;
  }
  function isEnableArtifactUserControllable() {
    for (let e of ypa) {
      if (e === "userSettings") {
        return true;
      }
      if (getSettingsForSource(e)?.enableArtifact !== undefined) {
        return false;
      }
    }
    return true;
  }
  function getArtifactDefaultOn() {
    return true;
  }
  function isArtifactConfigurable() {
    if (Me.CLAUDE_CODE_DISABLE_ARTIFACT) {
      return false;
    }
    return fpa() && gpa();
  }
  function isArtifactAdminAllowed() {
    let e = getSubscriptionType();
    if (e !== "team" && e !== "enterprise" && e !== "pro" && e !== "max" && e != null) {
      return false;
    }
    return isPolicyAllowed("allow_cobalt_plinth");
  }
  function isPlanArtifactEnabled() {
    return false;
  }
  function isPublishToolEnabled() {
    return isArtifactToolEnabled();
  }
  var ypa;
  var M1 = __lazy(() => {
    $n();
    Kc();
    no();
    $A();
    d_();
    gn();
    Ds();
    Wd();
    DA();
    ypa = ["policySettings", "flagSettings", "userSettings"];
  });
  function eR() {
    if (!st(process.env.CLAUDE_CODE_COORDINATOR_MODE)) {
      return false;
    }
    if (getIsInteractive() && !getIsRemoteMode() && !st(process.env.CLAUDE_CODE_REMOTE)) {
      return false;
    }
    return true;
  }
  var RV = __lazy(() => {
    at();
    gn();
  });
  var DG = {};