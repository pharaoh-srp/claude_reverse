  __export(JCn, {
    swapShrinksContextWindow: () => swapShrinksContextWindow,
    strip1mTag: () => strip1mTag,
    resolvesToDefaultModel: () => resolvesToDefaultModel,
    resolveSkillModelOverride: () => resolveSkillModelOverride,
    resolveModelAliasEnvFree: () => resolveModelAliasEnvFree,
    resetEnforcementWarnDedupForTests: () => resetEnforcementWarnDedupForTests,
    renderModelSetting: () => renderModelSetting,
    renderModelName: () => renderModelName,
    renderDefaultModelSetting: () => renderDefaultModelSetting,
    parseUserSpecifiedModel: () => parseUserSpecifiedModel,
    normalizeModelStringForAPI: () => normalizeModelStringForAPI,
    modelHasNative1MContext: () => modelHasNative1MContext,
    modelDisplayString: () => modelDisplayString,
    isWindowSilentDefaultPick: () => isWindowSilentDefaultPick,
    isPinnedFableModel: () => isPinnedFableModel,
    isOpus1mMergeEnabled: () => isOpus1mMergeEnabled,
    isNonCustomOpusModel: () => isNonCustomOpusModel,
    isNonCustomMythosModel: () => isNonCustomMythosModel,
    isNonCustomFableModel: () => isNonCustomFableModel,
    isMythosModelValue: () => isMythosModelValue,
    isMythosFamilyOrPinnedModel: () => isMythosFamilyOrPinnedModel,
    isMythosAvailable: () => isMythosAvailable,
    isModelDenied: () => isModelDenied,
    isModelAllowedUnderActiveEnforcement: () => isModelAllowedUnderActiveEnforcement,
    isModelAllowed: () => isModelAllowed,
    isModeDependentModelSetting: () => isModeDependentModelSetting,
    isLegacyOpusFirstParty: () => isLegacyOpusFirstParty,
    isLegacyModelRemapEnabled: () => isLegacyModelRemapEnabled,
    isFableModelValue: () => isFableModelValue,
    isFableFamilyOrPinnedModel: () => isFableFamilyOrPinnedModel,
    isFableAvailable: () => isFableAvailable,
    isExemptDefaultResolvingPick: () => isExemptDefaultResolvingPick,
    isDefaultModelEnforced: () => isDefaultModelEnforced,
    getUserSpecifiedModelSetting: () => getUserSpecifiedModelSetting,
    getSmallFastModel: () => getSmallFastModel,
    getRuntimeMainLoopModel: () => getRuntimeMainLoopModel,
    getResolvedOrgDefaultModel: () => getResolvedOrgDefaultModel,
    getPublicModelName: () => getPublicModelName,
    getPublicModelDisplayName: () => getPublicModelDisplayName,
    getOpusPricingSuffix: () => getOpusPricingSuffix,
    getModelUnavailabilityReason: () => getModelUnavailabilityReason,
    getModelSourceAnnotation: () => getModelSourceAnnotation,
    getModelEntitlementDenySet: () => getModelEntitlementDenySet,
    getMarketingNameForModel: () => getMarketingNameForModel,
    getMainLoopModel: () => getMainLoopModel,
    getFableDeclineFallbackModel: () => getFableDeclineFallbackModel,
    getEnforcedDefaultModel: () => getEnforcedDefaultModel,
    getDefaultSonnetModel: () => getDefaultSonnetModel,
    getDefaultOpusModel: () => getDefaultOpusModel,
    getDefaultMainLoopModelSetting: () => getDefaultMainLoopModelSetting,
    getDefaultMainLoopModel: () => getDefaultMainLoopModel,
    getDefaultHaikuModel: () => getDefaultHaikuModel,
    getDefaultFableModel: () => getDefaultFableModel,
    getClaudeAiUserDefaultModelDescription: () => getClaudeAiUserDefaultModelDescription,
    getClassifierOpusReroute: () => getClassifierOpusReroute,
    getCanonicalName: () => getCanonicalName,
    getBestModel: () => getBestModel,
    getAntRegistryContextWindow: () => getAntRegistryContextWindow,
    getActiveOpusLineupIds: () => getActiveOpusLineupIds,
    firstPartyNameToCanonical: () => firstPartyNameToCanonical,
    entitlementStepDownDefault: () => entitlementStepDownDefault,
    eligible1mSuffixTarget: () => eligible1mSuffixTarget,
    bytesPerTokenForModel: () => bytesPerTokenForModel,
    antRegistryGrants1M: () => antRegistryGrants1M,
    DEFAULT_MANTLE_OPUS_KEY: () => "opus47",
    DEFAULT_3P_SONNET_KEY: () => "sonnet45",
    DEFAULT_3P_OPUS_KEY: () => "opus46",
    DEFAULT_3P_HAIKU_KEY: () => "haiku45",
    DEFAULT_3P_FABLE_KEY: () => "fable5"
  });
  function getSmallFastModel() {
    if (process.env.ANTHROPIC_SMALL_FAST_MODEL) {
      return process.env.ANTHROPIC_SMALL_FAST_MODEL;
    }
    let e = getAPIProvider();
    let t = e === "firstParty" && (isFirstPartyAnthropicBaseUrl() || hasAnthropicDirectApiKey()) || e === "anthropicAws";
    if (!process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL && !t) {
      return getMainLoopModel();
    }
    return getDefaultHaikuModel();
  }
  function SWr(e, t) {
    return VN(e)?.family === t;
  }
  function isNonCustomFableModel(e) {
    return SWr(e, "fable");
  }
  function isNonCustomMythosModel(e) {
    return SWr(e, "mythos");
  }
  function swapShrinksContextWindow(e, t) {
    let n = getSdkBetas();
    return iT(t, n) < iT(e, n);
  }
  function isNonCustomOpusModel(e) {
    return SWr(e, "opus");
  }
  function getUserSpecifiedModelSetting() {
    let e;
    let t = getMainLoopModelOverride();
    if (t !== undefined) {
      e = t;
    } else {
      let n = getInitialMainLoopModel();
      e = n !== undefined ? n : process.env.ANTHROPIC_MODEL ?? getInitialSettings()?.model ?? undefined;
    }
    if (e && !isModelAllowed(e)) {
      return;
    }
    return e;
  }
  function getMainLoopModel() {
    let e = getUserSpecifiedModelSetting();
    if (e !== undefined && e !== null) {
      return parseUserSpecifiedModel(e);
    }
    return getDefaultMainLoopModel();
  }
  function getBestModel() {
    if (isFableAvailable()) {
      let e = getDefaultFableModel();
      if (_Wr) {
        return e;
      }
      _Wr = true;
      try {
        if (isModelAllowed(e)) {
          return e;
        }
      } finally {
        _Wr = false;
      }
    }
    return getDefaultOpusModel();
  }
  function isFableModelValue(e) {
    return e.includes("claude-fable-5");
  }
  function isMythosModelValue(e) {
    return e.includes("claude-mythos-5");
  }
  function isFableAvailable() {
    if (getAPIProvider() === "firstParty" && isFirstPartyAnthropicBaseUrl() && getAdditionalModelOptionsCache().some(t => t.disabled === true && typeof t.value === "string" && isFableModelValue(t.value))) {
      return false;
    }
    if (process.env.ANTHROPIC_DEFAULT_FABLE_MODEL) {
      return true;
    }
    let e = getAPIProvider();
    if (e !== "firstParty" && e !== "gateway") {
      return false;
    }
    if (e === "firstParty" && !isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    return getAdditionalModelOptionsCache().some(t => t.disabled !== true && typeof t.value === "string" && isFableModelValue(t.value));
  }
  function isMythosAvailable() {
    if (getAPIProvider() !== "firstParty" || !isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    return (getAdditionalModelOptionsCache() ?? []).some(e => e.disabled !== true && typeof e.value === "string" && isMythosModelValue(e.value));
  }
  function isPinnedFableModel(e) {
    let t = Me.ANTHROPIC_DEFAULT_FABLE_MODEL;
    if (!t) {
      return false;
    }
    return ca(e) === ca(t);
  }
  function isFableFamilyOrPinnedModel(e) {
    return ca(getCanonicalName(e)) === "claude-fable-5" || isPinnedFableModel(e);
  }
  function isMythosFamilyOrPinnedModel(e) {
    return ca(getCanonicalName(e)) === "claude-mythos-5";
  }
  function getClassifierOpusReroute(e) {
    let t = Me.ANTHROPIC_DEFAULT_OPUS_MODEL;
    if (t === undefined) {
      let r = rp();
      if (t = r.opus48, getAPIProvider() === "firstParty") {
        t = qqr.map(o => r[o]).find(o => isModelAllowed(o)) ?? r.opus48;
      }
    }
    let n = t;
    if ((hg(e) || modelHasNative1MContext(e)) && !hg(n) && !XCn(getCanonicalName(n))) {
      return n + "[1m]";
    }
    return n;
  }
  function getActiveOpusLineupIds() {
    let e = rp();
    return qqr.map(t => e[t]);
  }
  function getModelUnavailabilityReason(e, t) {
    if (getAPIProvider() !== "firstParty" || !isFirstPartyAnthropicBaseUrl()) {
      return null;
    }
    let n = Sk(e.toLowerCase().trim()) ? parseUserSpecifiedModel(e) : e;
    let r = t?.ignoreModelOverrides ? l => firstPartyNameToCanonical(ca(l.toLowerCase()).trim()) : Nvd;
    let o = r(e);
    let s = r(n);
    let i = getAdditionalModelOptionsCache().find(l => l.disabled === true && typeof l.value === "string" && (r(l.value) === o || r(l.value) === s));
    if (i) {
      return {
        reason: "disabled",
        description: i.description
      };
    }
    let a = t?.ignoreModelOverrides ? firstPartyNameToCanonical(n) : getCanonicalName(n);
    if (!isFableAvailable() && a === "claude-fable-5") {
      return {
        reason: "absent",
        displayName: getPublicModelDisplayName(n) ?? "That model"
      };
    }
    if (!isMythosAvailable() && isNonCustomMythosModel(a)) {
      return {
        reason: "absent",
        displayName: getPublicModelDisplayName(n) ?? "That model"
      };
    }
    return null;
  }
  function Nvd(e) {
    return getCanonicalName(ca(e.toLowerCase()).trim());
  }
  function Lvd(e) {
    return e.toLowerCase().includes("fable");
  }
  function getAntRegistryContextWindow(e) {
    return;
  }
  function antRegistryGrants1M(e) {
    return false;
  }
  function VCn(e, t, n = getAPIProvider()) {
    let r = hni(e, Uvd[n]);
    if (r === undefined) {
      return;
    }
    let o = VN(r)?.provider_ids.first_party;
    let s = o !== undefined ? Rot[o] : undefined;
    return s !== undefined ? t[s] : undefined;
  }
  function getDefaultFableModel() {
    let e = process.env.ANTHROPIC_DEFAULT_FABLE_MODEL || bWr();
    return isFirstPartyApiBackend() ? strip1mTag(e) : e;
  }
  function bWr(e = rp()) {
    let t = VCn("fable", e) ?? e.fable5;
    return isFirstPartyApiBackend() ? strip1mTag(t) : t;
  }
  function getDefaultOpusModel() {
    if (process.env.ANTHROPIC_DEFAULT_OPUS_MODEL) {
      return process.env.ANTHROPIC_DEFAULT_OPUS_MODEL;
    }
    return d0e();
  }
  function d0e(e = rp()) {
    return VCn("opus", e) ?? e.opus48;
  }
  function getDefaultSonnetModel() {
    if (process.env.ANTHROPIC_DEFAULT_SONNET_MODEL) {
      return process.env.ANTHROPIC_DEFAULT_SONNET_MODEL;
    }
    return WCn();
  }
  function WCn(e = rp()) {
    return VCn("sonnet", e) ?? e.sonnet46;
  }
  function getDefaultHaikuModel() {
    if (process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL) {
      return process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL;
    }
    return EWr();
  }
  function EWr(e = rp()) {
    return VCn("haiku", e) ?? e.haiku45;
  }
  function isModeDependentModelSetting(e) {
    return e === "opusplan" || e === "haiku";
  }
  function getRuntimeMainLoopModel(e) {
    let {
      permissionMode: t,
      mainLoopModel: n,
      exceeds200kTokens: r = false
    } = e;
    let o = getUserSpecifiedModelSetting();
    if ((o === "opusplan" || o === "opusplan[1m]") && t === "plan" && !r) {
      let a = o === "opusplan[1m]" || isOpus1mMergeEnabled() ? p2(getDefaultOpusModel()) : getDefaultOpusModel();
      if (!((isModelAllowedUnderActiveEnforcement(a) ?? isModelAllowed(a)) && !isModelDenied(a, getModelEntitlementDenySet()))) {
        if (!IF.vZc("Plan mode: the opusplan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead")) {
          IF.add("Plan mode: the opusplan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead");
          logForDebugging("Plan mode: the opusplan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead", {
            level: "warn"
          });
        }
        return parseUserSpecifiedModel(o);
      }
      return a;
    }
    if (getUserSpecifiedModelSetting() === "haiku" && t === "plan") {
      let i = getDefaultSonnetModel();
      if (!((isModelAllowedUnderActiveEnforcement(i) ?? isModelAllowed(i)) && !isModelDenied(i, getModelEntitlementDenySet()))) {
        if (!IF.vZc("Plan mode: the haiku plan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead")) {
          IF.add("Plan mode: the haiku plan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead");
          logForDebugging("Plan mode: the haiku plan upgrade model is not permitted by the org model restrictions (availableModels allowlist or model_access entitlement); planning uses the resting model instead", {
            level: "warn"
          });
        }
        return parseUserSpecifiedModel("haiku");
      }
      return i;
    }
    return n;
  }
  function p2(e) {
    return e.replace(/(\[1m\])+$/i, "") + "[1m]";
  }
  function getResolvedOrgDefaultModel() {
    let e = Jle();
    if (!e) {
      return null;
    }
    return rpi(e.name);
  }
  function rpi(e) {
    let t = getEnforcedDefaultModel(e, null) ?? e;
    let n = entitlementStepDownDefault(t) ?? t;
    return getModelUnavailabilityReason(n, {
      ignoreModelOverrides: true
    }) === null ? n : null;
  }
  function getDefaultMainLoopModelSetting() {
    let e = getResolvedOrgDefault();
    let t;
    if (e === undefined) {
      if (t = getResolvedOrgDefaultModel(), t !== null) {
        setResolvedOrgDefault(t);
      }
    } else if (e === null) {
      t = null;
    } else {
      t = rpi(e);
    }
    if (t !== null) {
      return t;
    }
    let {
      setting: n,
      envFamily: r,
      concreteBaseline: o
    } = vWr();
    let s = getEnforcedDefaultModel(n, r, o) ?? n;
    return entitlementStepDownDefault(s) ?? s;
  }
  function entitlementStepDownDefault(e) {
    let t = getModelEntitlementDenySet();
    if (t.size === 0 || !isModelDenied(e, t)) {
      return null;
    }
    let n = [{
      family: "opus",
      model: getDefaultOpusModel()
    }, {
      family: "sonnet",
      model: getDefaultSonnetModel()
    }, {
      family: "haiku",
      model: getDefaultHaikuModel()
    }];
    let r = getCanonicalName(parseUserSpecifiedModel(e));
    let o = n.findIndex(i => r.includes(i.family));
    let s = o !== -1 ? o : isFableFamilyOrPinnedModel(parseUserSpecifiedModel(e)) ? 0 : 1;
    for (let {
      family: i,
      model: a
    } of n.slice(s)) {
      if (isModelAllowed(a)) {
        return a;
      }
      let l = jCn(i);
      if (l !== null) {
        return l;
      }
    }
    return null;
  }
  function vWr() {
    if (isClaudeAISubscriber()) {
      if (isMaxSubscriber() || isTeamPremiumSubscriber() || isEnterprisePAYGSubscriber()) {
        return {
          setting: isOpus1mMergeEnabled() ? p2(getDefaultOpusModel()) : getDefaultOpusModel(),
          envFamily: "opus"
        };
      }
    } else if (usesFirstPartyModelIds()) {
      return {
        setting: isOpus1mMergeEnabled() ? p2(getDefaultOpusModel()) : getDefaultOpusModel(),
        envFamily: "opus"
      };
    }
    if (getAPIProvider() === "mantle") {
      return {
        setting: rp()["opus47"],
        envFamily: null,
        concreteBaseline: String(e0e()["opus47"])
      };
    }
    return {
      setting: getDefaultSonnetModel(),
      envFamily: "sonnet"
    };
  }
  function getEnforcedDefaultModel(e, t, n) {
    let r = getInitialSettings() || {};
    let o = r.availableModels;
    let s = r.enforceAvailableModels;
    let i = {};
    let a = opi();
    if (a.state === "refused") {
      return null;
    }
    let l = a.state === "inactive" && a.cascadeTrusted;
    if (a.state === "active") {
      o = a.allowlist;
      s = true;
      i = a.overridesMap;
    } else if (!a.cascadeTrusted) {
      return null;
    }
    if (!s) {
      return null;
    }
    if (l && Object.keys(i).length === 0 && r.modelOverrides) {
      i = r.modelOverrides;
    }
    if (!o || o.length === 0) {
      return null;
    }
    let c = {
      overridesMap: i,
      envFreeAliasResolution: true,
      allowlist: o
    };
    let u = x => {
      let A = firstPartyNameToCanonical(ca(x));
      for (let [k, I] of Object.entries(i)) {
        if (firstPartyNameToCanonical(ca(k)) === A) {
          return I;
        }
      }
      return;
    };
    let d = (x, A) => {
      let k = ca(x);
      if (A?.isConcreteEntry) {
        return x;
      }
      let I = u(k);
      if (!I?.trim()) {
        return x;
      }
      I = I.trim();
      {
        let O = ca(I).trim().toLowerCase();
        let M = hg(I);
        let L = Sk(O) ? qCn(O) : null;
        if (L !== null) {
          I = M ? p2(L) : L;
        } else {
          let P = O.startsWith("claude-") ? O : `claude-${O}`;
          if (isLegacyOpusFirstParty(P) && usesFirstPartyModelIds()) {
            let F = d0e(e0e());
            I = M ? p2(F) : F;
          }
        }
      }
      if (getModelUnavailabilityReason(ca(I), {
        ignoreModelOverrides: true
      }) !== null) {
        let O = `enforceAvailableModels: the managed modelOverrides target "${I}" is server-unavailable; using the unmapped candidate`;
        if (!IF.vZc(O)) {
          IF.add(O);
          logForDebugging(O, {
            level: "warn"
          });
        }
        return x;
      }
      if (k !== x) {
        return eligible1mSuffixTarget(I) ? p2(I) : strip1mTag(I);
      }
      if (hg(I) && !eligible1mSuffixTarget(I)) {
        return strip1mTag(I);
      }
      return I;
    };
    let p = null;
    let m = String(e);
    let f = ca(m.trim().toLowerCase());
    let h = hg(e);
    let g = f.startsWith("claude-") ? f : `claude-${f}`;
    let y = isLegacyOpusFirstParty(g) ? d0e(e0e()) : qCn(f);
    if (y !== null) {
      let A = f !== m.trim().toLowerCase() && eligible1mSuffixTarget(y) ? p2(y) : ca(y);
      let k = parseUserSpecifiedModel(m);
      if (ca(k) !== ca(y)) {
        p = A;
      }
      if (isModelAllowed(A, c)) {
        if (ca(k) !== ca(y)) {
          if (getModelUnavailabilityReason(A, {
            ignoreModelOverrides: true
          }) === null) {
            return d(A);
          }
        } else {
          return null;
        }
      }
    } else {
      let x = e0e();
      let A = Bvd(x);
      if (t !== undefined) {
        if (t !== null) {
          let k = A.find(([M]) => M === t);
          if (k === undefined) {
            throw Error(`steeringVarTable has no row for tier family "${t}"`);
          }
          let I = k[3];
          let O = I();
          if (typeof O === "string" && ca(O).toLowerCase() !== f) {
            let M = I();
            p = h && eligible1mSuffixTarget(M) ? p2(M) : M;
          }
        }
        if (t === null && n !== undefined && ca(n).toLowerCase() !== f) {
          p = n;
        }
      } else {
        let k = (() => {
          for (let [,, O, M] of A) {
            let L = M();
            if (typeof L === "string" && ca(L).toLowerCase() === f) {
              return O;
            }
          }
          return null;
        })();
        let I = A;
        for (let [, O, M, L] of I) {
          if (O === undefined || ca(O.trim().toLowerCase()) !== f) {
            continue;
          }
          if (k !== null && k <= M) {
            continue;
          }
          {
            let P = L();
            p = h && eligible1mSuffixTarget(P) ? p2(P) : P;
          }
          break;
        }
      }
      if (isModelAllowed(e, c)) {
        return null;
      }
    }
    let _ = [];
    for (let x of o) {
      let A = x.trim();
      if (!A) {
        continue;
      }
      let k = A.toLowerCase();
      let I = ca(k);
      let O = qCn(I);
      if (O !== null) {
        let j = k !== I && eligible1mSuffixTarget(O) ? p2(O) : O;
        if (tpi(j) && isModelAllowed(j, c)) {
          if (getModelUnavailabilityReason(j, {
            ignoreModelOverrides: true
          }) === null) {
            return d(j);
          }
          _.push(A);
        }
        continue;
      }
      let M = ca(k);
      let L = M.startsWith("claude-") ? M : `claude-${M}`;
      if (isLegacyOpusFirstParty(L) && usesFirstPartyModelIds()) {
        let W = d0e(e0e());
        let z = k !== M && eligible1mSuffixTarget(W) ? p2(W) : W;
        if (getModelUnavailabilityReason(z, {
          ignoreModelOverrides: true
        }) === null) {
          return d(z);
        }
        _.push(A);
        continue;
      }
      let P = getAPIProvider() !== "foundry" && !k.startsWith("claude-") && jvd.test(k);
      let F = P || getAPIProvider() !== "foundry" && k.startsWith("claude-");
      let H = parseUserSpecifiedModel(P ? `claude-${k}` : F ? k : A);
      let U = ca(H).toLowerCase();
      if (F && !/[-@]\d{8}$/.test(U) && firstPartyNameToCanonical(U) !== U) {
        continue;
      }
      if (!tpi(H)) {
        continue;
      }
      let N = !F || /[-@]\d{8}$/.test(U);
      if (isModelAllowed(H, c)) {
        if (getModelUnavailabilityReason(H, {
          ignoreModelOverrides: true
        }) === null) {
          let W = strip1mTag(H);
          if (W !== H) {
            return d(eligible1mSuffixTarget(H) ? H : W, {
              isConcreteEntry: N
            });
          }
          return d(H, {
            isConcreteEntry: N
          });
        }
        _.push(A);
      }
    }
    let b = p !== null ? u(p) : undefined;
    let S = b !== undefined && ca(b).trim().toLowerCase() === ca(e).trim().toLowerCase();
    let E = p !== null ? S ? "tier default is the admin-mapped value \u2014 pinning its canonical builtin (the policy mapping re-applies at the exit)" : "user steering detected \u2014 pinning the env-free tier builtin (policy-mapped if applicable)" : "keeping the tier default";
    let C = _.length > 0 ? `enforceAvailableModels: no availableModels entry survived; ${_.length} entr${_.length === 1 ? "y was" : "ies were"} allowed but skipped as server-unavailable (${_.join(", ")}); ${E}` : `enforceAvailableModels: no availableModels entry expands to an allowed model; ${E}`;
    if (!IF.vZc(C)) {
      IF.add(C);
      logForDebugging(C, {
        level: "warn"
      });
    }
    return p !== null ? d(p) : null;
  }
  function eligible1mSuffixTarget(e) {
    let t = strip1mTag(e).trim().toLowerCase();
    if (!t.startsWith("claude-")) {
      return true;
    }
    return !XCn(firstPartyNameToCanonical(t)) && (t.includes("opus") ? isOpus1mMergeEnabled() : true);
  }
  function Bvd(e) {
    return [["haiku", Me.ANTHROPIC_DEFAULT_HAIKU_MODEL, 0, () => EWr(e)], ["sonnet", Me.ANTHROPIC_DEFAULT_SONNET_MODEL, 1, () => WCn(e)], ["opus", Me.ANTHROPIC_DEFAULT_OPUS_MODEL, 2, () => d0e(e)]];
  }
  function opi() {
    try {
      let e = getFatalAdminPolicyLoadErrors();
      let t = getSettingsForSource("policySettings");
      let n = i => {
        if (!t || e.length === 0) {
          return;
        }
        let a = i ? "enforceAvailableModels: an admin policy source failed to load; enforcing the surviving admin tier (the failed source may carry a different policy \u2014 fix it to restore full coverage)" : "enforceAvailableModels: an admin policy source failed to load and the surviving admin tier carries no model policy \u2014 model enforcement is OFF; the failed source may have carried it";
        if (!IF.vZc(a)) {
          IF.add(a);
          logForDebugging(a, {
            level: "warn"
          });
        }
      };
      if (e.length > 0 && !hasSurvivingAdminPolicySource()) {
        if (!IF.vZc("enforceAvailableModels: a policy source exists but failed to load; refusing cascade-trust mode (model enforcement from user/project settings is disabled until the policy source is fixed)")) {
          IF.add("enforceAvailableModels: a policy source exists but failed to load; refusing cascade-trust mode (model enforcement from user/project settings is disabled until the policy source is fixed)");
          logForDebugging("enforceAvailableModels: a policy source exists but failed to load; refusing cascade-trust mode (model enforcement from user/project settings is disabled until the policy source is fixed)", {
            level: "warn"
          });
        }
        return {
          state: "refused"
        };
      }
      if (!t) {
        return {
          state: "inactive",
          cascadeTrusted: true
        };
      }
      let {
        availableModels: r,
        enforceAvailableModels: o,
        modelOverrides: s
      } = t;
      if (e.length === 0 && r === undefined && o === undefined && s === undefined && getPolicySettingsOrigin() === "hkcu") {
        return {
          state: "inactive",
          cascadeTrusted: true
        };
      }
      if (o && r === undefined) {
        if (!IF.vZc("enforceAvailableModels: the policy view sets the enforce flag but not availableModels; enforcement is disabled (the flag requires a policy-owned allowlist)")) {
          IF.add("enforceAvailableModels: the policy view sets the enforce flag but not availableModels; enforcement is disabled (the flag requires a policy-owned allowlist)");
          logForDebugging("enforceAvailableModels: the policy view sets the enforce flag but not availableModels; enforcement is disabled (the flag requires a policy-owned allowlist)", {
            level: "warn"
          });
        }
        n(false);
        return {
          state: "inactive",
          cascadeTrusted: false
        };
      }
      if (o !== true || r === undefined || r.length === 0) {
        n(false);
        return {
          state: "inactive",
          cascadeTrusted: false
        };
      }
      n(true);
      return {
        state: "active",
        allowlist: r,
        overridesMap: s ?? {}
      };
    } catch (e) {
      let t = `enforceAvailableModels: policy-tier settings read failed; refusing cascade-trust mode: ${e instanceof Error ? e.message : String(e)}`;
      if (!IF.vZc(t)) {
        IF.add(t);
        logForDebugging(t, {
          level: "warn"
        });
      }
      return {
        state: "refused"
      };
    }
  }
  function isModelAllowedUnderActiveEnforcement(e) {
    let t = opi();
    if (t.state === "refused") {
      return false;
    }
    if (t.state === "inactive") {
      return null;
    }
    let n = {
      allowlist: t.allowlist,
      overridesMap: t.overridesMap,
      envFreeAliasResolution: true
    };
    if (!isModelAllowed(e, n)) {
      return false;
    }
    let r = e.trim().toLowerCase();
    let o = /\[1m\]/i.test(r) ? ca(r).trim() : r;
    return !(Sk(o) || usesFirstPartyModelIds() && isLegacyOpusFirstParty(o)) || HCn(o, n);
  }
  function resetEnforcementWarnDedupForTests() {
    IF.clear();
  }
  function resolvesToDefaultModel(e) {
    return ca(parseUserSpecifiedModel(e)).toLowerCase() === ca(getDefaultMainLoopModel()).toLowerCase();
  }
  function isExemptDefaultResolvingPick(e) {
    let t = ca(e.trim().toLowerCase());
    if (isModeDependentModelSetting(t)) {
      return false;
    }
    if (t === "best") {
      return false;
    }
    return resolvesToDefaultModel(e);
  }
  function isWindowSilentDefaultPick(e) {
    if (!isExemptDefaultResolvingPick(e)) {
      return false;
    }
    let t = e.trim().toLowerCase();
    return parseUserSpecifiedModel(e).toLowerCase() === getDefaultMainLoopModel().toLowerCase() || Sk(t) && t === ca(t);
  }
  function resolveModelAliasEnvFree(e) {
    let t = ca(e);
    let n = qCn(t);
    if (n !== null) {
      return n.toLowerCase();
    }
    let r = t.startsWith("claude-") ? t : `claude-${t}`;
    if (usesFirstPartyModelIds() && isLegacyOpusFirstParty(r)) {
      return d0e(e0e()).toLowerCase();
    }
    return null;
  }
  function tpi(e) {
    let t = e.toLowerCase();
    if (Hvd.test(t)) {
      return true;
    }
    if (t.startsWith("arn:aws:bedrock:")) {
      return true;
    }
    if (getAPIProvider() === "foundry") {
      return true;
    }
    return false;
  }
  function qCn(e) {
    let t = e0e();
    switch (e) {
      case "opus":
        return d0e(t);
      case "sonnet":
        return WCn(t);
      case "haiku":
        return EWr(t);
      case "fable":
        return bWr(t);
      case "opusplan":
        return WCn(t);
      case "best":
        return isFableAvailable() ? bWr(t) : d0e(t);
      default:
        return null;
    }
  }
  function isDefaultModelEnforced() {
    let e = vWr();
    if (getEnforcedDefaultModel(e.setting, e.envFamily, e.concreteBaseline) !== null) {
      return true;
    }
    return entitlementStepDownDefault(e.setting) !== null;
  }
  function getDefaultMainLoopModel() {
    return parseUserSpecifiedModel(getDefaultMainLoopModelSetting());
  }
  function getFableDeclineFallbackModel() {
    let e = getDefaultMainLoopModel();
    if (!isFableFamilyOrPinnedModel(e)) {
      return e;
    }
    for (let t of [getDefaultOpusModel(), getDefaultSonnetModel(), getDefaultHaikuModel()]) {
      if (isFableFamilyOrPinnedModel(t)) {
        continue;
      }
      if (isModelAllowedUnderActiveEnforcement(t) ?? isModelAllowed(t)) {
        return t;
      }
    }
    return null;
  }
  function firstPartyNameToCanonical(e) {
    e = e.toLowerCase();
    let t = jqr(e);
    if (t !== undefined) {
      return t;
    }
    for (let n of Vrt) {
      if (n !== "us" && e.startsWith(`${n}.anthropic.`)) {
        let r = jqr(`us${e.slice(n.length)}`);
        if (r !== undefined) {
          return r;
        }
        break;
      }
    }
    if (e.includes("claude-fable-5")) {
      return "claude-fable-5";
    }
    if (e.includes("claude-mythos-5")) {
      return "claude-mythos-5";
    }
    if (e.includes("claude-opus-4-8")) {
      return "claude-opus-4-8";
    }
    if (e.includes("claude-opus-4-7")) {
      return "claude-opus-4-7";
    }
    if (e.includes("claude-opus-4-6")) {
      return "claude-opus-4-6";
    }
    if (e.includes("claude-opus-4-5")) {
      return "claude-opus-4-5";
    }
    if (e.includes("claude-opus-4-1")) {
      return "claude-opus-4-1";
    }
    if (/claude-opus-4(?!-\d(?!\d))/.test(e)) {
      return "claude-opus-4-0";
    }
    if (e.includes("claude-sonnet-5")) {
      return "claude-sonnet-5";
    }
    if (e.includes("claude-sonnet-4-6")) {
      return "claude-sonnet-4-6";
    }
    if (e.includes("claude-sonnet-4-5")) {
      return "claude-sonnet-4-5";
    }
    if (/claude-sonnet-4(?!-\d(?!\d))/.test(e)) {
      return "claude-sonnet-4-0";
    }
    if (e.includes("claude-haiku-4-5")) {
      return "claude-haiku-4-5";
    }
    if (e.includes("claude-3-7-sonnet")) {
      return "claude-3-7-sonnet";
    }
    if (e.includes("claude-3-5-sonnet")) {
      return "claude-3-5-sonnet";
    }
    if (e.includes("claude-3-5-haiku")) {
      return "claude-3-5-haiku";
    }
    if (e.includes("claude-3-opus")) {
      return "claude-3-opus";
    }
    if (e.includes("claude-3-sonnet")) {
      return "claude-3-sonnet";
    }
    if (e.includes("claude-3-haiku")) {
      return "claude-3-haiku";
    }
    return e.replace(/-\d{8}$/, "");
  }
  function getCanonicalName(e) {
    let t = kot(e);
    if (t !== e) {
      return firstPartyNameToCanonical(t);
    }
    if (e.includes("application-inference-profile")) {
      let n = getInferenceProfileBackingModelCached(normalizeModelStringForAPI(e));
      if (n) {
        return firstPartyNameToCanonical(n);
      }
    }
    return firstPartyNameToCanonical(t);
  }
  function bytesPerTokenForModel(e) {
    if (!e) {
      return 4;
    }
    let t = parseUserSpecifiedModel(e);
    let n = ca(getCanonicalName(t)).replace(/[._]/g, "-");
    return qvd.vZc(n) ? 4 : 3;
  }
  function getClaudeAiUserDefaultModelDescription(e = false) {
    let t = vWr();
    let n = getEnforcedDefaultModel(t.setting, t.envFamily, t.concreteBaseline);
    let r = n ?? t.setting;
    let s = entitlementStepDownDefault(r) ?? n;
    let i = getResolvedOrgDefaultModel();
    if (i !== null) {
      return `${getMarketingNameForModel(normalizeModelStringForAPI(i)) ?? renderModelName(i)} \xB7 Org default`;
    }
    if (s !== null) {
      return `${getMarketingNameForModel(normalizeModelStringForAPI(s)) ?? renderModelName(s)} \xB7 Set by your organization`;
    }
    if (isMaxSubscriber() || isTeamPremiumSubscriber() || isEnterprisePAYGSubscriber()) {
      let l = getDefaultOpusModel();
      let c = getMarketingNameForModel(normalizeModelStringForAPI(l)) ?? "Opus";
      let u = e && yh(l);
      if (isOpus1mMergeEnabled()) {
        return `${c} with 1M context \xB7 Best for everyday, complex tasks${u ? getOpusPricingSuffix(true, l) : ""}`;
      }
      return `${c} \xB7 Best for everyday, complex tasks${u ? getOpusPricingSuffix(true, l) : ""}`;
    }
    return `${getMarketingNameForModel(normalizeModelStringForAPI(getDefaultSonnetModel())) ?? "Sonnet"} \xB7 Efficient for routine tasks`;
  }
  function renderDefaultModelSetting(e) {
    if (e === "opusplan") {
      return "Opus in plan mode, else Sonnet";
    }
    return renderModelName(parseUserSpecifiedModel(e));
  }
  function getOpusPricingSuffix(e, t) {
    if (getAPIProvider() !== "firstParty") {
      return "";
    }
    let n = AF(tst(e, getCanonicalName(t)));
    return ` \xB7${e ? ` (${"\u21AF"})` : ""} ${n}`;
  }
  function isOpus1mMergeEnabled() {
    if (E_e() || isProSubscriber() || getAPIProvider() !== "firstParty") {
      return false;
    }
    if (isClaudeAISubscriber() && getSubscriptionType() === null) {
      return false;
    }
    return true;
  }
  function renderModelSetting(e) {
    if (e === "opusplan") {
      return "Opus Plan";
    }
    if (Sk(e)) {
      return renderModelName(parseUserSpecifiedModel(e));
    }
    return renderModelName(e);
  }
  function getModelSourceAnnotation() {
    if (getMainLoopModelOverride() !== undefined) {
      return "";
    }
    if (process.env.ANTHROPIC_MODEL) {
      return "";
    }
    switch (getEffectiveSettingSource("model")) {
      case "projectSettings":
        return ` (from ${getRelativeSettingsFilePathForSource("projectSettings")})`;
      case "policySettings":
        return " (from managed settings)";
      default:
        return "";
    }
  }
  function getPublicModelDisplayName(e) {
    let t = getCanonicalName(e);
    let n = VN(t);
    if (!n) {
      return null;
    }
    let r = e.endsWith("[1m]") && n.context?.supports_1m_suffix ? " (1M context)" : "";
    return n.display_name + r;
  }
  function renderModelName(e) {
    let t = normalizeModelStringForAPI(e);
    if (t8(t) === null) {
      let r = [...FCn(), ...getAdditionalModelOptionsCache()].find(o => typeof o.value === "string" && normalizeModelStringForAPI(o.value) === t);
      if (r?.label) {
        return r.label;
      }
    }
    let n = getPublicModelDisplayName(e);
    if (n) {
      return n;
    }
    return e;
  }
  function getPublicModelName(e) {
    let t = getPublicModelDisplayName(e);
    if (t) {
      return `Claude ${t}`;
    }
    return `Claude (${e})`;
  }
  function parseUserSpecifiedModel(e) {
    let t = e.trim();
    let n = t.toLowerCase();
    let r = hg(n);
    let o = r ? ca(n).trim() : n;
    if (Sk(o)) {
      switch (o) {
        case "fable":
          {
            let s = getDefaultFableModel();
            return s + (r && !isFirstPartyApiBackend() && !hg(s) ? "[1m]" : "");
          }
        case "opusplan":
          return r ? p2(getDefaultSonnetModel()) : getDefaultSonnetModel();
        case "sonnet":
          return r ? p2(getDefaultSonnetModel()) : getDefaultSonnetModel();
        case "haiku":
          return r ? p2(getDefaultHaikuModel()) : getDefaultHaikuModel();
        case "opus":
          return r ? p2(getDefaultOpusModel()) : getDefaultOpusModel();
        case "best":
          return getBestModel();
        default:
      }
    }
    if (usesFirstPartyModelIds() && isLegacyOpusFirstParty(o) && isLegacyModelRemapEnabled()) {
      return r ? p2(getDefaultOpusModel()) : getDefaultOpusModel();
    }
    if (r && isFirstPartyApiBackend() && Lvd(o) && modelHasNative1MContext(o)) {
      return t.replace(/(\[1m\])+$/i, "").trim();
    }
    if (r) {
      return t.replace(/(\[1m\])+$/i, "").trim() + "[1m]";
    }
    return t;
  }
  function resolveSkillModelOverride(e, t) {
    let n = parseUserSpecifiedModel(e);
    if (!isExemptDefaultResolvingPick(n) && !isModelAllowed(n)) {
      logForDebugging(`Skill/command model "${e}" is not in the availableModels allowlist; keeping the session model`, {
        level: "warn"
      });
      return t;
    }
    let r = hg(t) || modelHasNative1MContext(t) || antRegistryGrants1M(t);
    if (hg(e) || !r) {
      return e;
    }
    let o = parseUserSpecifiedModel(e);
    if (modelHasNative1MContext(o)) {
      return o;
    }
    if (antRegistryGrants1M(o)) {
      return o;
    }
    if (d8(o)) {
      return e + "[1m]";
    }
    return e;
  }
  function isLegacyOpusFirstParty(e) {
    return Wvd.includes(e);
  }
  function isLegacyModelRemapEnabled() {
    return !st(process.env.CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP);
  }
  function modelDisplayString(e) {
    if (e === null) {
      if (isClaudeAISubscriber()) {
        return `Default (${getClaudeAiUserDefaultModelDescription()})`;
      }
      return `Default (${getDefaultMainLoopModel()})`;
    }
    let t = parseUserSpecifiedModel(e);
    return e === t ? t : `${e} (${t})`;
  }
  function getMarketingNameForModel(e) {
    if (getAPIProvider() === "foundry") {
      return;
    }
    let t = getCanonicalName(e);
    let n = Vvd.get(t);
    if (n !== undefined) {
      return n;
    }
    let r = VN(t);
    if (!r) {
      return;
    }
    return e.toLowerCase().includes("[1m]") && Gvd.vZc(t) ? `${r.display_name} (1M context)` : r.display_name;
  }
  function normalizeModelStringForAPI(e) {
    return e.replace(/\[(1|2)m\]/gi, "");
  }
  function strip1mTag(e) {
    return e.replace(/\[1m\]/gi, "");
  }
  var _Wr = false;
  var Uvd;
  var IF;
  var Hvd;
  var jvd;
  var qvd;
  var Wvd;
  var Gvd;
  var Vvd;
  var Eo = __lazy(() => {
    at();
    no();
    VT();
    d_();
    gn();
    sne();
    sTn();
    Ds();
    GT();
    wl();
    zN();
    DY();
    UCn();
    YN();
    YN();
    Tk();
    je();
    Uvd = {
      firstParty: "first_party",
      bedrock: "bedrock",
      vertex: "vertex",
      foundry: "foundry",
      anthropicAws: "anthropic_aws",
      mantle: "mantle",
      gateway: "gateway"
    };
    IF = new Set();
    Hvd = new RegExp(`^((${Vrt.join("|")})\\.)?(anthropic\\.|claude-)`);
    jvd = /^[a-z]+-\d/;
    qvd = new Set(["claude-3-opus", "claude-3-sonnet", "claude-3-haiku", "claude-3-5-sonnet", "claude-3-5-haiku", "claude-3-7-sonnet", "claude-opus-4-0", "claude-opus-4-1", "claude-opus-4-5", "claude-opus-4-6", "claude-sonnet-4-0", "claude-sonnet-4-5", "claude-sonnet-4-6", "claude-haiku-4-5"]);
    Wvd = ["claude-opus-4-20250514", "claude-opus-4-1-20250805", "claude-opus-4-0", "claude-opus-4-1"];
    Gvd = new Set(["claude-opus-4-6", "claude-opus-4-7", "claude-opus-4-8", "claude-sonnet-4-0", "claude-sonnet-4-5", "claude-sonnet-4-6"]);
    Vvd = new Map([["claude-3-7-sonnet", "Claude 3.7 Sonnet"], ["claude-3-5-sonnet", "Claude 3.5 Sonnet"], ["claude-3-5-haiku", "Claude 3.5 Haiku"]]);
  });
  function p8(e, t) {
    return MLt.run(e, t);
  }
  function ym() {
    return {
      agentType: "main",
      agentId: getSessionId()
    };
  }
  function qY(e) {
    return e.agentType === "main";
  }
  function PW(e) {
    if (e.agentType === "main") {
      return 0;
    }
    return e.depth ?? 0;
  }
  function f0e(e) {
    return e.agentType === "subagent";
  }
  function RWr(e) {
    if (!f0e(e) || !e.subagentName) {
      return;
    }
    return e.isBuiltIn ? e.subagentName : "user-defined";
  }
  function Rqe(e) {
    try {
      if (!f0e(e)) {
        return {};
      }
      let t = RWr(e);
      if (t === undefined) {
        return {};
      }
      return {
        subagent_type: t,
        is_built_in_agent: e.isBuiltIn ?? false
      };
    } catch {
      return {};
    }
  }
  function xWr(e) {
    if (e.agentType === "main" || !e.invokingRequestId || e.invocationEmitted) {
      return;
    }
    e.invocationEmitted = true;
    return {
      invokingRequestId: e.invokingRequestId,
      invocationKind: e.invocationKind
    };
  }
  var ipi;
  var MLt;
  var _h = __lazy(() => {
    at();
    ipi = require("async_hooks");
    MLt = new ipi.AsyncLocalStorage();
  });
  function m8(e, t) {
    return `${e}@${t}`;
  }
  function kWr(e) {
    return e.replace(/%|[^\x20-\x7e]/gu, t => encodeURIComponent(t));
  }
  function NLt(e) {
    let t = e.indexOf("@");
    if (t === -1) {
      return null;
    }
    return {
      agentName: e.slice(0, t),
      teamName: e.slice(t + 1)
    };
  }
  function ast(e, t) {
    let n = Date.now();
    return `${e}-${n}@${t}`;
  }
  function QCn() {
    return lpi.getStore()?.workload;
  }
  function ZCn(e, t) {
    return lpi.run({
      workload: e
    }, t);
  }
  var api;
  var lpi;
  var xqe = __lazy(() => {
    api = require("async_hooks");
    lpi = new api.AsyncLocalStorage();
  });
  function eRn(e, t, n) {
    if (Pl(process.env.CLAUDE_CODE_ATTRIBUTION_HEADER)) {
      return "";
    }
    let r = `${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}.${e}`;
    let o = process.env.CLAUDE_CODE_ENTRYPOINT ?? "unknown";
    let s = getAPIProvider();
    let i = s === "firstParty" && isFirstPartyAnthropicBaseUrl() || s === "vertex" ? " cch=00000;" : "";
    let a = QCn();
    let l = a ? ` cc_workload=${a};` : "";
    let c = f0e(t) && !t.isMainSession ? " cc_is_subagent=true;" : "";
    let u = n && s === "firstParty" && isFirstPartyAnthropicBaseUrl() ? ` cc_prev_req=${n};` : "";
    let d = `x-anthropic-billing-header: cc_version=${r}; cc_entrypoint=${o};${i}${l}${c}${u}`;
    logForDebugging(`attribution header ${d}`);
    return d;
  }
  function cpi(e) {
    return e.anthropicAuthEnabled && Boolean(e.oauthScopes?.includes("user:inference"));
  }
  var tRn = __lazy(() => {
    Uc();
    _h();
    je();
    gn();
    Ds();
    xqe();
  });
  function br(e) {
    if (e == null) {
      return;
    }
    return /^[A-Za-z0-9_-]{1,128}$/.test(e) ? e : "nonconforming";
  }
  var B_ = () => {};
  function Kvd(e) {
    return upi.randomBytes(4).readUInt32BE(0) % e;
  }
  function LLt(e) {
    return e[Kvd(e.length)];
  }
  function nRn() {
    let e = LLt(dpi);
    let t = LLt(zvd);
    let n = LLt(ppi);
    return `${e}-${t}-${n}`;
  }
  function FLt(e, t = {}) {
    let {
      words: n = 4,
      maxLen: r = 40
    } = t;
    return e.replace(Yvd, " ").split(/\s+/).filter(Boolean).slice(0, n).join(" ").toLowerCase().replace(/[^a-z0-9]+/g, "-").slice(0, r).replace(/^-+|-+$/g, "");
  }
  function cst() {
    let e = LLt(dpi);
    let t = LLt(ppi);
    return `${e}-${t}`;
  }
  var upi;
  var dpi;
  var ppi;
  var zvd;
  var Yvd;
  var kqe = __lazy(() => {
    upi = require("crypto");
    dpi = ["abundant", "ancient", "bright", "calm", "cheerful", "clever", "cozy", "curious", "dapper", "dazzling", "deep", "delightful", "eager", "elegant", "enchanted", "fancy", "fluffy", "gentle", "gleaming", "golden", "graceful", "happy", "hidden", "humble", "jolly", "joyful", "keen", "kind", "lively", "lovely", "lucky", "luminous", "magical", "majestic", "mellow", "merry", "mighty", "misty", "noble", "peaceful", "playful", "polished", "precious", "proud", "quiet", "quirky", "radiant", "rosy", "serene", "shiny", "silly", "sleepy", "smooth", "snazzy", "snug", "snuggly", "soft", "sparkling", "spicy", "splendid", "sprightly", "starry", "steady", "sunny", "swift", "tender", "tidy", "toasty", "tranquil", "twinkly", "valiant", "vast", "velvet", "vivid", "warm", "whimsical", "wild", "wise", "witty", "wondrous", "zany", "zesty", "zippy", "breezy", "bubbly", "buzzing", "cheeky", "cosmic", "cozy", "crispy", "crystalline", "cuddly", "drifting", "dreamy", "effervescent", "ethereal", "fizzy", "flickering", "floating", "floofy", "fluttering", "foamy", "frolicking", "fuzzy", "giggly", "glimmering", "glistening", "glittery", "glowing", "goofy", "groovy", "harmonic", "hazy", "humming", "iridescent", "jaunty", "jazzy", "jiggly", "melodic", "moonlit", "mossy", "nifty", "peppy", "prancy", "purrfect", "purring", "quizzical", "rippling", "rustling", "shimmering", "shimmying", "snappy", "snoopy", "squishy", "swirling", "ticklish", "tingly", "twinkling", "velvety", "wiggly", "wobbly", "woolly", "zazzy", "abstract", "adaptive", "agile", "async", "atomic", "binary", "cached", "compiled", "composed", "compressed", "concurrent", "cryptic", "curried", "declarative", "delegated", "distributed", "dynamic", "eager", "elegant", "encapsulated", "enumerated", "eventual", "expressive", "federated", "functional", "generic", "greedy", "hashed", "idempotent", "immutable", "imperative", "indexed", "inherited", "iterative", "lazy", "lexical", "linear", "linked", "logical", "memoized", "modular", "mutable", "nested", "optimized", "parallel", "parsed", "partitioned", "piped", "polymorphic", "pure", "reactive", "recursive", "refactored", "reflective", "replicated", "resilient", "robust", "scalable", "sequential", "serialized", "sharded", "sorted", "staged", "stateful", "stateless", "streamed", "structured", "synchronous", "synthetic", "temporal", "transient", "typed", "unified", "validated", "vectorized", "virtual"];
    ppi = ["aurora", "avalanche", "blossom", "breeze", "brook", "bubble", "canyon", "cascade", "cloud", "clover", "comet", "coral", "cosmos", "creek", "crescent", "crystal", "dawn", "dewdrop", "dusk", "eclipse", "ember", "feather", "fern", "firefly", "flame", "flurry", "fog", "forest", "frost", "galaxy", "garden", "glacier", "glade", "grove", "harbor", "horizon", "island", "lagoon", "lake", "leaf", "lightning", "meadow", "meteor", "mist", "moon", "moonbeam", "mountain", "nebula", "nova", "ocean", "orbit", "pebble", "petal", "pine", "planet", "pond", "puddle", "quasar", "rain", "rainbow", "reef", "ripple", "river", "shore", "sky", "snowflake", "spark", "spring", "star", "stardust", "starlight", "storm", "stream", "summit", "sun", "sunbeam", "sunrise", "sunset", "thunder", "tide", "twilight", "valley", "volcano", "waterfall", "wave", "willow", "wind", "alpaca", "axolotl", "badger", "bear", "beaver", "bee", "bird", "bumblebee", "bunny", "cat", "chipmunk", "crab", "crane", "deer", "dolphin", "dove", "dragon", "dragonfly", "duckling", "eagle", "elephant", "falcon", "finch", "flamingo", "fox", "frog", "giraffe", "goose", "hamster", "hare", "hedgehog", "hippo", "hummingbird", "jellyfish", "kitten", "koala", "ladybug", "lark", "lemur", "llama", "lobster", "lynx", "manatee", "meerkat", "moth", "narwhal", "newt", "octopus", "otter", "owl", "panda", "parrot", "peacock", "pelican", "penguin", "phoenix", "piglet", "platypus", "pony", "porcupine", "puffin", "puppy", "quail", "quokka", "rabbit", "raccoon", "raven", "robin", "salamander", "seahorse", "seal", "sloth", "snail", "sparrow", "sphinx", "squid", "squirrel", "starfish", "swan", "tiger", "toucan", "turtle", "unicorn", "walrus", "whale", "wolf", "wombat", "wren", "yeti", "zebra", "acorn", "anchor", "balloon", "beacon", "biscuit", "blanket", "bonbon", "book", "boot", "cake", "candle", "candy", "castle", "charm", "clock", "cocoa", "cookie", "crayon", "crown", "cupcake", "donut", "dream", "fairy", "fiddle", "flask", "flute", "fountain", "gadget", "gem", "gizmo", "globe", "goblet", "hammock", "harp", "haven", "hearth", "honey", "journal", "kazoo", "kettle", "key", "kite", "lantern", "lemon", "lighthouse", "locket", "lollipop", "mango", "map", "marble", "marshmallow", "melody", "mitten", "mochi", "muffin", "music", "nest", "noodle", "oasis", "origami", "pancake", "parasol", "peach", "pearl", "pebble", "pie", "pillow", "pinwheel", "pixel", "pizza", "plum", "popcorn", "pretzel", "prism", "pudding", "pumpkin", "puzzle", "quiche", "quill", "quilt", "riddle", "rocket", "rose", "scone", "scroll", "shell", "sketch", "snowglobe", "sonnet", "sparkle", "spindle", "sprout", "sundae", "swing", "taco", "teacup", "teapot", "thimble", "toast", "token", "tome", "tower", "treasure", "treehouse", "trinket", "truffle", "tulip", "umbrella", "waffle", "wand", "whisper", "whistle", "widget", "wreath", "zephyr", "abelson", "adleman", "aho", "allen", "babbage", "bachman", "backus", "barto", "bengio", "bentley", "blum", "boole", "brooks", "catmull", "cerf", "cherny", "church", "clarke", "cocke", "codd", "conway", "cook", "corbato", "cray", "curry", "dahl", "diffie", "dijkstra", "dongarra", "eich", "emerson", "engelbart", "feigenbaum", "floyd", "gosling", "graham", "gray", "hamming", "hanrahan", "hartmanis", "hejlsberg", "hellman", "hennessy", "hickey", "hinton", "hoare", "hollerith", "hopcroft", "hopper", "iverson", "kahan", "kahn", "karp", "kay", "kernighan", "knuth", "kurzweil", "lamport", "lampson", "lecun", "lerdorf", "liskov", "lovelace", "matsumoto", "mccarthy", "metcalfe", "micali", "milner", "minsky", "moler", "moore", "naur", "neumann", "newell", "nygaard", "papert", "parnas", "pascal", "patterson", "pearl", "perlis", "pike", "pnueli", "rabin", "reddy", "ritchie", "rivest", "rossum", "russell", "scott", "sedgewick", "shamir", "shannon", "sifakis", "simon", "stallman", "stearns", "steele", "stonebraker", "stroustrup", "sutherland", "sutton", "tarjan", "thacker", "thompson", "torvalds", "turing", "ullman", "valiant", "wadler", "wall", "wigderson", "wilkes", "wilkinson", "wirth", "wozniak", "yao"];
    zvd = ["baking", "beaming", "booping", "bouncing", "brewing", "bubbling", "chasing", "churning", "coalescing", "conjuring", "cooking", "crafting", "crunching", "cuddling", "dancing", "dazzling", "discovering", "doodling", "dreaming", "drifting", "enchanting", "exploring", "finding", "floating", "fluttering", "foraging", "forging", "frolicking", "gathering", "giggling", "gliding", "greeting", "growing", "hatching", "herding", "honking", "hopping", "hugging", "humming", "imagining", "inventing", "jingling", "juggling", "jumping", "kindling", "knitting", "launching", "leaping", "mapping", "marinating", "meandering", "mixing", "moseying", "munching", "napping", "nibbling", "noodling", "orbiting", "painting", "percolating", "petting", "plotting", "pondering", "popping", "prancing", "purring", "puzzling", "questing", "riding", "roaming", "rolling", "sauteeing", "scribbling", "seeking", "shimmying", "singing", "skipping", "sleeping", "snacking", "sniffing", "snuggling", "soaring", "sparking", "spinning", "splashing", "sprouting", "squishing", "stargazing", "stirring", "strolling", "swimming", "swinging", "tickling", "tinkering", "toasting", "tumbling", "twirling", "waddling", "wandering", "watching", "weaving", "whistling", "wibbling", "wiggling", "wishing", "wobbling", "wondering", "yawning", "zooming"];
    Yvd = /\[(?:Pasted text #\d+(?: \+\d+ lines)?|Image #\d+|\.\.\.Truncated text #\d+ \+\d+ lines\.\.\.)\]/g;
  });
  function hpi(e) {
    return `${FLt(fpi.basename(e)) || "claude"}-${mpi.randomBytes(1).toString("hex")}`;
  }
  var mpi;
  var fpi;
  var gpi = __lazy(() => {
    kqe();
    mpi = require("crypto");
    fpi = require("path");
  });
  var ust = {};