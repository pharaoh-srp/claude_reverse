  __export(hdo, {
    userAbortReason: () => userAbortReason,
    unwrapAbortReason: () => unwrapAbortReason,
    subagentParkAbortReason: () => subagentParkAbortReason,
    serverFallbackTombstoneAbortReason: () => serverFallbackTombstoneAbortReason,
    isUserInitiatedAbortReason: () => isUserInitiatedAbortReason,
    isUserAttributableAbortKind: () => isUserAttributableAbortKind,
    isSubagentParkAbort: () => isSubagentParkAbort,
    isServerFallbackDiscard: () => isServerFallbackDiscard,
    createRecoveryAbortController: () => createRecoveryAbortController,
    createChildAbortController: () => createChildAbortController,
    createAbortController: () => createAbortController,
    classifyAbortReasonForTelemetry: () => classifyAbortReasonForTelemetry,
    attachDetachableAbortRelay: () => attachDetachableAbortRelay,
    SUBAGENT_PARK_REASON: () => "subagent-park",
    SERVER_FALLBACK_TOMBSTONE_REASON: () => "server-fallback-tombstone",
    RECOVERY_ABORT_TIMEOUT_MS: () => 600000
  });
  function createAbortController(e = 50) {
    let t = new AbortController();
    ffa.setMaxListeners(e, t.signal);
    return t;
  }
  function rbp(e) {
    let t = this.deref();
    e.deref()?.abort(t?.signal.reason);
  }
  function obp(e) {
    let t = this.deref();
    let n = e.deref();
    if (t && n) {
      t.signal.removeEventListener("abort", n);
    }
  }
  function hfa(e, t, n) {
    let r = new WeakRef(t);
    let o = new WeakRef(e);
    if (e.signal.aborted) {
      n.call(o, r);
      return;
    }
    let s = n.bind(o, r);
    e.signal.addEventListener("abort", s, {
      once: true
    });
    sbp.register(t, {
      parentSignalRef: new WeakRef(e.signal),
      handler: s
    });
    t.signal.addEventListener("abort", obp.bind(o, new WeakRef(s)), {
      once: true
    });
  }
  function createChildAbortController(e, t) {
    let n = createAbortController(t);
    hfa(e, n, rbp);
    return n;
  }
  function attachDetachableAbortRelay(e, t) {
    if (e.signal.aborted) {
      t.abort(e.signal.reason);
      return () => {};
    }
    let n = () => t.abort(e.signal.reason);
    e.signal.addEventListener("abort", n, {
      once: true
    });
    return () => e.signal.removeEventListener("abort", n);
  }
  function userAbortReason(e) {
    return new DOMException(e, "AbortError");
  }
  function unwrapAbortReason(e) {
    return e instanceof DOMException && e.name === "AbortError" ? e.message : e;
  }
  function isUserInitiatedAbortReason(e) {
    return ibp.vZc(unwrapAbortReason(e));
  }
  function isServerFallbackDiscard(e) {
    return e.aborted && unwrapAbortReason(e.reason) === "server-fallback-tombstone";
  }
  function serverFallbackTombstoneAbortReason() {
    return new DOMException("server-fallback-tombstone", "AbortError");
  }
  function subagentParkAbortReason() {
    return new DOMException("subagent-park", "AbortError");
  }
  function isSubagentParkAbort(e) {
    return e.aborted && unwrapAbortReason(e.reason) === "subagent-park";
  }
  function classifyAbortReasonForTelemetry(e) {
    switch (unwrapAbortReason(e)) {
      case "user-cancel":
        return "user_cancel";
      case "remote-cancel":
        return "remote_cancel";
      case "interrupt":
        return "interrupt";
      case "background":
        return "background";
      case "recovery-timeout":
        return "recovery_timeout";
      case "server-fallback-tombstone":
        return "server_fallback_tombstone";
      default:
        return "turn_teardown";
    }
  }
  function isUserAttributableAbortKind(e) {
    switch (e) {
      case "user_cancel":
      case "remote_cancel":
      case "interrupt":
      case "background":
        return true;
      case "turn_teardown":
      case "recovery_timeout":
      case "server_fallback_tombstone":
        return false;
    }
  }
  function cbp(e) {
    let t = this.deref();
    if (!t || !isUserInitiatedAbortReason(t.signal.reason)) {
      return;
    }
    e.deref()?.abort(t.signal.reason);
  }
  function ubp(e) {
    e.deref()?.abort(userAbortReason("recovery-timeout"));
  }
  function createRecoveryAbortController(e, t = 600000) {
    let n = createAbortController();
    if (hfa(e, n, cbp), n.signal.aborted) {
      return n;
    }
    let r = setTimeout(ubp, t, new WeakRef(n));
    r.unref();
    n.signal.addEventListener("abort", clearTimeout.bind(undefined, r), {
      once: true
    });
    return n;
  }
  var ffa;
  var sbp;
  var ibp;
  var Kp = __lazy(() => {
    ffa = require("events");
    sbp = new FinalizationRegistry(({
      parentSignalRef: e,
      handler: t
    }) => {
      e.deref()?.removeEventListener("abort", t);
    });
    ibp = new Set(["user-cancel", "remote-cancel", "interrupt"]);
  });
  function T4t(e) {
    if (e.type !== "user") {
      return false;
    }
    let t = e.message?.content;
    if (typeof t === "string") {
      return yfa.some(n => t.startsWith(n));
    }
    if (!Array.isArray(t)) {
      return false;
    }
    return t.length > 0 && t.every(n => {
      let r = n.type === "text" ? n.text : n.type === "tool_result" && n.is_error === true ? n.content : undefined;
      return typeof r === "string" && yfa.some(o => r.startsWith(o));
    });
  }
  var yfa;
  var Cde = __lazy(() => {
    yfa = ["[Request interrupted by user]", "[Request interrupted by user for tool use]", "The user doesn't want to take this action right now. STOP what you are doing and wait for the user to tell you how to proceed."];
  });
  function uoe(e) {
    if (e?.type === "assistant" && "usage" in e.message && !(e.message.content[0]?.type === "text" && bDe.vZc(e.message.content[0].text)) && e.message.model !== "<synthetic>") {
      return e.message.usage;
    }
    return;
  }
  function gdo(e) {
    if (e?.type === "assistant" && "id" in e.message && e.message.model !== "<synthetic>") {
      return e.message.id;
    }
    return;
  }
  function doe(e) {
    return e.input_tokens + (e.cache_creation_input_tokens ?? 0) + (e.cache_read_input_tokens ?? 0) + e.output_tokens;
  }
  function L1(e) {
    let t = e.length - 1;
    while (t >= 0) {
      let n = e[t];
      let r = n ? uoe(n) : undefined;
      if (r) {
        return doe(r);
      }
      t--;
    }
    return 0;
  }
  function ydo(e) {
    let t = e.length - 1;
    while (t >= 0) {
      let n = e[t];
      let r = n ? uoe(n) : undefined;
      if (r) {
        let o = r.iterations;
        if (o && o.length > 0) {
          let s = o.at(-1);
          return s.input_tokens + s.output_tokens;
        }
        return r.input_tokens + r.output_tokens;
      }
      t--;
    }
    return 0;
  }
  function ept(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      let r = n ? uoe(n) : undefined;
      if (r) {
        return {
          input_tokens: r.input_tokens,
          output_tokens: r.output_tokens,
          cache_creation_input_tokens: r.cache_creation_input_tokens ?? 0,
          cache_read_input_tokens: r.cache_read_input_tokens ?? 0
        };
      }
    }
    return null;
  }
  function _fa(e, t) {
    let n = 0;
    for (let r of e) {
      let o = uoe(r);
      if (!o) {
        continue;
      }
      let s = gdo(r);
      if (!s || t.vZc(s)) {
        continue;
      }
      t.add(s);
      n += o.input_tokens + (o.cache_creation_input_tokens ?? 0) + o.output_tokens;
    }
    return n;
  }
  function _do(e) {
    let t = 0;
    for (let n of e) {
      if (n && SS(n)) {
        let {
          cumulativeDroppedTokens: r,
          preTokens: o,
          postTokens: s
        } = n.compactMetadata;
        let i = r ?? Math.max(0, o - (s ?? 0));
        if (i > t) {
          t = i;
        }
      }
    }
    return t;
  }
  function E4t(e, t) {
    let n = _do(t);
    let {
      preTokens: r,
      postTokens: o
    } = e.compactMetadata;
    e.compactMetadata.cumulativeDroppedTokens = n + Math.max(0, r - (o ?? 0));
  }
  function a$n(e) {
    let n = e.findLast(o => o.type === "assistant");
    if (!n) {
      return false;
    }
    let r = uoe(n);
    return r ? doe(r) > 200000 : false;
  }
  function l$n(e) {
    let t = 0;
    for (let n of e.message.content) {
      if (n.type === "text") {
        t += n.text.length;
      } else if (n.type === "thinking") {
        t += L9e(n.signature?.length ?? 0);
      } else if (n.type === "redacted_thinking") {
        t += n.data.length;
      } else if (n.type === "tool_use") {
        t += De(n.input).length;
      }
    }
    return t;
  }
  function Ob(e, t) {
    let n = bfa(e);
    if (!n) {
      return nR(e, t);
    }
    return doe(n.usage) + nR(e.slice(n.anchorIndex + 1), t);
  }
  function bfa(e) {
    let t = e.length - 1;
    while (t >= 0) {
      let n = e[t];
      let r = n ? uoe(n) : undefined;
      if (n && r) {
        let o = gdo(n);
        if (o) {
          let s = t - 1;
          while (s >= 0) {
            let i = e[s];
            let a = i ? gdo(i) : undefined;
            if (a === o) {
              t = s;
            } else if (a !== undefined) {
              break;
            }
            s--;
          }
        }
        return {
          usage: r,
          anchorIndex: t
        };
      }
      t--;
    }
    return null;
  }
  function Sfa(e, t) {
    let n = bfa(e);
    let r = n ? e.slice(n.anchorIndex + 1) : [...e];
    return nR(EO(r), t);
  }
  var TO = __lazy(() => {
    IV();
    ro();
  });
  function Tfa() {
    let e = getGlobalConfig().cachedExtraUsageDisabledReason;
    if (e === undefined) {
      return false;
    }
    if (e === null) {
      return true;
    }
    switch (e) {
      case "out_of_credits":
        return true;
      case "overage_not_provisioned":
      case "org_level_disabled":
      case "org_level_disabled_until":
      case "seat_tier_level_disabled":
      case "member_level_disabled":
      case "seat_tier_zero_credit_limit":
      case "group_zero_credit_limit":
      case "member_zero_credit_limit":
      case "org_service_level_disabled":
      case "no_limits_configured":
      case "fetch_error":
      case "unknown":
        return false;
      default:
        return false;
    }
  }
  function poe() {
    if (E_e()) {
      return false;
    }
    if (isClaudeAISubscriber()) {
      return Tfa();
    }
    return true;
  }
  function Rde() {
    if (E_e()) {
      return false;
    }
    if (isClaudeAISubscriber()) {
      return Tfa();
    }
    return true;
  }
  var c$n = __lazy(() => {
    no();
    VT();
  });
  function m$n(e) {
    let t = e.replace(/^(\d{4}-\d{2}-\d{2}) (?=\d{2}:)/, "$1T");
    let n = t.includes("T");
    let r = /(?:Z|[+-]\d{2}:?\d{2})$/i.test(t);
    return Date.parse(n && !r ? `${t}Z` : t);
  }
  function pbp() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_saffron_lattice", Efa);
    if (u$n === null || u$n.raw !== e) {
      let t = dbp().safeParse(e);
      u$n = {
        raw: e,
        parsed: t.success ? t.data : Efa
      };
    }
    return u$n.parsed;
  }
  function bdo(e) {
    if (!e) {
      return;
    }
    let t = m$n(e);
    if (Number.isNaN(t)) {
      return;
    }
    return new Date(t).toLocaleDateString("en-US", {
      month: "short",
      day: "numeric",
      timeZone: "UTC"
    });
  }
  function mbp(e) {
    if (e === undefined) {
      return false;
    }
    if (d$n === null || d$n.value !== e) {
      d$n = {
        value: e,
        ms: m$n(e)
      };
    }
    return Date.now() >= d$n.ms;
  }
  function _Te() {
    return xde() || isFableCreditsRequired();
  }
  function xde() {
    let e = pbp();
    if (e.enabled === false) {
      return false;
    }
    return e.overageConsentRequired === true || mbp(e.planLimitsEndDate);
  }
  function m$() {
    return getAPIProvider() !== "firstParty" || !isClaudeAISubscriber() || isEnterprisePAYGSubscriber() || getRateLimitTier() === "default_claude_zero";
  }
  function hbp() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_saffron_credits_only_tiers", vfa);
    if (p$n === null || p$n.raw !== e) {
      let t = fbp().safeParse(e);
      if (!t.success) {
        logForDebugging("tengu_saffron_credits_only_tiers: unparseable value, using default", {
          level: "warn"
        });
      }
      p$n = {
        raw: e,
        parsed: t.success ? t.data : vfa
      };
    }
    return p$n.parsed;
  }
  function gbp() {
    return getSubscriptionType() === "enterprise" && !isEnterprisePAYGSubscriber();
  }
  function kde() {
    if (gbp()) {
      return true;
    }
    let e = getSubscriptionType();
    if (e === null) {
      return false;
    }
    return hbp().includes(e);
  }
  function wfa() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_saffron_picker_dim", false);
  }
  function Cfa() {
    let e = getGlobalConfig().cachedExtraUsageDisabledReason;
    return e === "org_level_disabled" || e === "overage_not_provisioned";
  }
  function ybp() {
    let e = getGlobalConfig().cachedExtraUsageDisabledReason;
    return e === "overage_not_provisioned" || e === "org_level_disabled" || e === "out_of_credits";
  }
  function Rfa() {
    let e = getOauthAccountInfo();
    if (!e) {
      return null;
    }
    if (e.organizationUuid) {
      return e.organizationUuid;
    }
    return e.accountUuid ? `acct:${e.accountUuid}` : null;
  }
  function v4t() {
    if (Rfa() === null) {
      return hasFableConsentSessionFallback();
    }
    let e = getOauthAccountInfo();
    if (!e) {
      return hasFableConsentSessionFallback();
    }
    let t = getGlobalConfig().fableOverageConsentV2;
    return e.organizationUuid !== undefined && t?.[e.organizationUuid] === true || e.accountUuid !== undefined && t?.[`acct:${e.accountUuid}`] === true;
  }
  function _bp(e) {
    if (getGlobalConfig().fableOverageConsentV2?.[e] === true) {
      return;
    }
    saveGlobalConfig(t => ({
      ...t,
      fableOverageConsentV2: {
        ...t.fableOverageConsentV2,
        [e]: true
      }
    }));
  }
  function SDe() {
    let e = Rfa();
    if (e === null) {
      setFableConsentSessionFallback(true);
      return;
    }
    _bp(e);
  }
  function TDe() {
    let e = getGlobalConfig().cachedExtraUsageDisabledReason;
    if (e === undefined) {
      return false;
    }
    if (e === null) {
      return true;
    }
    return SLt(e);
  }
  function Sdo() {
    if (v4t() && TDe()) {
      return true;
    }
    if (m$()) {
      return true;
    }
    return !_Te();
  }
  function xfa(e) {
    if (!hasFreshGrowthBookFeatures()) {
      return false;
    }
    let t = getDynamicConfig_CACHED_MAY_BE_STALE("tengu-model-error-overrides", {});
    if (typeof t !== "object" || t === null) {
      return false;
    }
    let n = t[e];
    if (typeof n !== "object" || n === null) {
      return false;
    }
    let r = n.block;
    return typeof r === "string" && r.trim() !== "";
  }
  function w4t() {
    if (kde()) {
      return false;
    }
    return !Sdo();
  }
  function kfa() {
    if (kde()) {
      return false;
    }
    if (w4t()) {
      return true;
    }
    return _Te() && !m$() && ybp();
  }
  var dbp;
  var u$n = null;
  var Efa;
  var d$n = null;
  var fbp;
  var vfa;
  var p$n = null;
  var PV = __lazy(() => {
    qg();
    at();
    $n();
    no();
    je();
    GT();
    Ds();
    dbp = we(() => Ke.object({
      enabled: Ke.boolean().optional(),
      planLimitsEndDate: Ke.string().optional(),
      hideRateLimitsDescription: Ke.boolean().optional(),
      overageConsentRequired: Ke.boolean().optional()
    }));
    Efa = {};
    fbp = we(() => Ke.array(Ke.string()));
    vfa = ["enterprise"];
  });
  function Tdo() {
    let e = getCachedClientData()?.cedar_basin;
    if (typeof e !== "string" || e.trim() === "") {
      return;
    }
    let t = m$n(e);
    return Date.now() < t ? e : undefined;
  }
  var Afa = __lazy(() => {
    PV();
  });
  function bbp(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e) ? e : Edo;
  }
  function Pfa(e, t) {
    if (typeof t !== "string" || t === "") {
      return;
    }
    let n = bbp(e)[t];
    return typeof n === "object" && n !== null ? n : undefined;
  }
  async function Ofa(e) {
    let t = await getDynamicConfig_BLOCKS_ON_INIT("tengu-model-error-overrides", Edo);
    return Dfa(Pfa(t, e));
  }
  function Dfa(e) {
    return Nfa(e?.block);
  }
  function Mfa(e) {
    let t = Pfa(getDynamicConfig_CACHED_MAY_BE_STALE("tengu-model-error-overrides", Edo), e);
    let n = Dfa(t);
    if (n === null) {
      return null;
    }
    return Nfa(t?.pickerHint) ?? n;
  }
  function Nfa(e) {
    if (typeof e !== "string") {
      return null;
    }
    let t = e.trim();
    return t === "" ? null : t;
  }
  var Edo;
  var vdo = __lazy(() => {
    $n();
    Edo = {};
  });
  function Sbp() {
    if (isDefaultModelEnforced()) {
      return " \xB7 Set by your organization";
    }
    return Jle() && getResolvedOrgDefaultModel() !== null ? Kfa() : "";
  }
  function Kfa() {
    return " \xB7 Org default";
  }
  function f$n(e) {
    if (isClaudeAISubscriber()) {
      return {
        value: null,
        label: "Default (recommended)",
        description: getClaudeAiUserDefaultModelDescription(e)
      };
    }
    let t = !usesFirstPartyModelIds();
    let n = getDefaultMainLoopModelSetting();
    let r = e && yh(n);
    let o = t || isDefaultModelEnforced() || getResolvedOrgDefaultModel() !== null ? "" : r ? getOpusPricingSuffix(true, n) : ` \xB7 ${AF(Kle)}`;
    return {
      value: null,
      label: t ? "Default" : "Default (recommended)",
      description: `Use the default model (currently ${renderDefaultModelSetting(n)})${o}${Sbp()}`
    };
  }
  function _$n() {
    return !usesFirstPartyModelIds() || getAPIProvider() === "anthropicAws" || !isFirstPartyAnthropicBaseUrl();
  }
  function wdo() {
    return modelHasNative1MContext(getDefaultOpusModel());
  }
  function Cdo() {
    return modelHasNative1MContext(getDefaultSonnetModel());
  }
  function h$n() {
    return getCanonicalName(getDefaultSonnetModel()) === "claude-sonnet-5";
  }
  function Lfa() {
    let e = process.env.ANTHROPIC_DEFAULT_SONNET_MODEL;
    if (_$n() && e) {
      let t = hg(e);
      return {
        value: "sonnet",
        label: process.env.ANTHROPIC_DEFAULT_SONNET_MODEL_NAME ?? e,
        description: process.env.ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION ?? `Custom Sonnet model${t ? " (1M context)" : ""}`,
        descriptionForModel: `${process.env.ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION ?? `Custom Sonnet model${t ? " with 1M context" : ""}`} (${e})`
      };
    }
  }
  function g$n() {
    let e = !usesFirstPartyModelIds();
    let t = e ? rp().sonnet5 : h$n() ? "sonnet" : rp().sonnet5;
    let n = `Sonnet 5 \xB7 ${"Efficient for routine tasks"}`;
    let r;
    if (!e) {
      let o = bdo(Tdo());
      if (o !== undefined) {
        n += ` \xB7 $2/$10 per Mtok \xB7 promo through ${o}`;
        r = "$3/$15";
      } else {
        n += ` \xB7 ${AF(cne)}`;
      }
    }
    return {
      value: t,
      label: "Sonnet",
      description: n,
      ...(r !== undefined && {
        promoListPrice: r
      }),
      descriptionForModel: "Sonnet 5 - efficient for routine tasks. Generally recommended for most coding tasks"
    };
  }
  function Ffa() {
    return {
      value: !usesFirstPartyModelIds() ? rp().sonnet46 : "claude-sonnet-4-6",
      label: "Sonnet 4.6",
      description: "Sonnet 4.6 \xB7 Previous Sonnet version",
      descriptionForModel: "Sonnet 4.6 - previous Sonnet version"
    };
  }
  function Ufa() {
    let e = process.env.ANTHROPIC_DEFAULT_FABLE_MODEL;
    if (_$n() && e) {
      return {
        value: "fable",
        label: process.env.ANTHROPIC_DEFAULT_FABLE_MODEL_NAME ?? e,
        description: process.env.ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION ?? "Custom Fable model",
        descriptionForModel: `${process.env.ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION ?? "Custom Fable model"} (${e})`
      };
    }
  }
  function kdo() {
    let e = !usesFirstPartyModelIds();
    let t = `Fable 5 \xB7 ${"Most capable for your hardest and longest-running tasks"}`;
    if (!m$() && xde()) {
      t += " \xB7 Requires usage credits";
    }
    return {
      value: e ? rp().fable5 : "fable",
      label: "Fable",
      description: t,
      descriptionForModel: "Fable 5 - most capable for your hardest and longest-running tasks"
    };
  }
  function Bfa() {
    let e = process.env.ANTHROPIC_DEFAULT_OPUS_MODEL;
    if (_$n() && e) {
      let t = hg(e);
      return {
        value: "opus",
        label: process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_NAME ?? e,
        description: process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION ?? `Custom Opus model${t ? " (1M context)" : ""}`,
        descriptionForModel: `${process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION ?? `Custom Opus model${t ? " with 1M context" : ""}`} (${e})`
      };
    }
  }
  function Tbp() {
    return {
      value: rp().opus41,
      label: "Opus 4.1",
      description: "Opus 4.1 \xB7 Legacy",
      descriptionForModel: "Opus 4.1 - legacy version"
    };
  }
  function Ebp() {
    return {
      value: !usesFirstPartyModelIds() ? rp().opus46 : "claude-opus-4-6",
      label: "Opus 4.6",
      description: "Opus 4.6 \xB7 Legacy",
      descriptionForModel: "Opus 4.6 - previous Opus version"
    };
  }
  function vbp() {
    return {
      value: !usesFirstPartyModelIds() ? rp().opus47 : "claude-opus-4-7",
      label: "Opus 4.7",
      description: "Opus 4.7 \xB7 Legacy",
      descriptionForModel: "Opus 4.7 - previous Opus version"
    };
  }
  function Yfa(e = false) {
    let t = !usesFirstPartyModelIds();
    let n = getOpusPricingSuffix(e, "claude-opus-4-8");
    return {
      value: t ? rp().opus48 : "opus",
      label: "Opus",
      description: `Opus 4.8 \xB7 ${"Best for everyday, complex tasks"}${t ? "" : n}`,
      descriptionForModel: "Opus 4.8 - best for everyday, complex tasks"
    };
  }
  function $fa() {
    let e = !usesFirstPartyModelIds();
    return {
      value: e ? rp().sonnet46 + "[1m]" : "claude-sonnet-4-6[1m]",
      label: "Sonnet 4.6 (1M context)",
      description: `Sonnet 4.6 for long sessions${e ? "" : ` \xB7 ${AF(cne)}`}`,
      descriptionForModel: "Sonnet 4.6 with 1M context window - for long sessions with large codebases"
    };
  }
  function Rdo() {
    let e = {
      value: "sonnet[1m]",
      label: "Sonnet 5 (1M context)",
      descriptionForModel: "Sonnet 5 with 1M context window - for long sessions with large codebases"
    };
    if (isClaudeAISubscriber()) {
      return {
        ...e,
        description: "Sonnet 5 for long sessions"
      };
    }
    let t = bdo(Tdo());
    let n = t !== undefined ? `$2/$10 per Mtok \xB7 promo through ${t}` : AF(cne);
    return {
      ...e,
      description: `Sonnet 5 for long sessions \xB7 ${n}`,
      ...(t !== undefined && {
        promoListPrice: "$3/$15"
      })
    };
  }
  function wbp(e = false, t = true) {
    return {
      value: !usesFirstPartyModelIds() ? rp().opus46 + "[1m]" : "claude-opus-4-6[1m]",
      label: "Opus 4.6 (1M context)",
      description: `Opus 4.6 for long sessions${t ? getOpusPricingSuffix(e, "claude-opus-4-6") : ""}`,
      descriptionForModel: "Opus 4.6 with 1M context window - for long sessions with large codebases"
    };
  }
  function Cbp() {
    return {
      value: !usesFirstPartyModelIds() ? rp().opus47 + "[1m]" : "claude-opus-4-7[1m]",
      label: "Opus 4.7 (1M context)",
      description: "Opus 4.7 for long sessions",
      descriptionForModel: "Opus 4.7 with 1M context window - for long sessions with large codebases"
    };
  }
  function Hfa(e = false) {
    let t = !usesFirstPartyModelIds();
    let n = getOpusPricingSuffix(e, "claude-opus-4-8");
    return {
      value: t ? rp().opus48 + "[1m]" : "opus[1m]",
      label: "Opus (1M context)",
      description: `Opus 4.8 for long sessions${t ? "" : n}`,
      descriptionForModel: "Opus 4.8 with 1M context window - for long sessions with large codebases"
    };
  }
  function jfa() {
    let e = process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL;
    if (_$n() && e) {
      return {
        value: "haiku",
        label: process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME ?? e,
        description: process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION ?? "Custom Haiku model",
        descriptionForModel: `${process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION ?? "Custom Haiku model"} (${e})`
      };
    }
  }
  function Jfa() {
    let e = !usesFirstPartyModelIds();
    return {
      value: "haiku",
      label: "Haiku",
      description: `Haiku 4.5 \xB7 ${"Fastest for quick answers"}${e ? "" : ` \xB7 ${AF(cWr)}`}`,
      descriptionForModel: "Haiku 4.5 - fastest for quick answers. Lower cost but less capable than Sonnet 4.6."
    };
  }
  function Rbp() {
    return {
      value: "haiku",
      label: "Haiku",
      description: `Haiku 3.5 for simple tasks${!usesFirstPartyModelIds() ? "" : ` \xB7 ${AF(lWr)}`}`,
      descriptionForModel: "Haiku 3.5 - faster and lower cost, but less capable than Sonnet. Use for simple tasks."
    };
  }
  function xbp() {
    return getDefaultHaikuModel() === rp().haiku45 ? Jfa() : Rbp();
  }
  function Pdo() {
    if (getSubscriptionType() === "pro" && getFeatureValue_CACHED_MAY_BE_STALE("tengu_gypsum_kite", false)) {
      return " \xB7 ~2\xD7 usage vs Sonnet";
    }
    return "";
  }
  function Odo(e = false) {
    let t = !usesFirstPartyModelIds();
    return {
      value: "opus",
      label: "Opus",
      description: `Opus 4.8 \xB7 ${"Best for everyday, complex tasks"}${Pdo()}${t || !e ? "" : ` \xB7 ${AF(Kle)}`}`
    };
  }
  function qfa() {
    let e = !usesFirstPartyModelIds();
    let t = isClaudeAISubscriber() ? " \xB7 Draws from usage credits" : "";
    let n = t !== "" && !e;
    return {
      value: e ? rp().sonnet46 + "[1m]" : "claude-sonnet-4-6[1m]",
      label: "Sonnet 4.6 (1M context)",
      description: `Sonnet 4.6 with 1M context${t}${!n ? "" : ` \xB7 ${AF(cne)}`}`
    };
  }
  function Wfa() {
    let e = !usesFirstPartyModelIds();
    let t = isClaudeAISubscriber() ? " \xB7 Draws from usage credits" : "";
    let n = t !== "" && !e;
    return {
      value: "opus[1m]",
      label: "Opus (1M context)",
      description: `Opus 4.8 with 1M context${Pdo()}${t}${!n ? "" : ` \xB7 ${AF(Kle)}`}`
    };
  }
  function Xfa(e = false, t = false) {
    let n = !usesFirstPartyModelIds();
    let r = getOpusPricingSuffix(t, "claude-opus-4-8");
    return {
      value: n ? rp().opus48 + "[1m]" : "opus[1m]",
      label: "Opus (1M context)",
      description: `Opus 4.8 with 1M context \xB7 ${"Best for everyday, complex tasks"}${Pdo()}${n || !e ? "" : r}`,
      descriptionForModel: "Opus 4.8 with 1M context - best for everyday, complex tasks"
    };
  }
  function Qfa(e = false, t = false) {
    return {
      ...Xfa(e, t),
      label: "Opus"
    };
  }
  function Zfa() {
    return {
      value: "sonnet",
      label: "Sonnet",
      description: `${getMarketingNameForModel(normalizeModelStringForAPI(getDefaultSonnetModel())) ?? "Sonnet"} \xB7 ${"Efficient for routine tasks"}`
    };
  }
  function kbp() {
    return {
      value: "opusplan",
      label: "Opus Plan Mode",
      description: "Use Opus in plan mode, Sonnet otherwise"
    };
  }
  function xdo(e, t) {
    let n = Ado(getDefaultMainLoopModelSetting());
    if (n !== "opus" && n !== "sonnet") {
      return e;
    }
    let r = n === "opus" && isOpus1mMergeEnabled();
    if (e.some(i => i.value === n || r && i.value === `${n}[1m]`)) {
      return e;
    }
    let o = isClaudeAISubscriber();
    let s;
    if (n === "sonnet") {
      let i = getDefaultSonnetModel();
      if (getCanonicalName(i) === "claude-sonnet-5") {
        s = o ? Zfa() : g$n();
      } else {
        let a = getMarketingNameForModel(normalizeModelStringForAPI(i)) ?? "Sonnet";
        s = {
          value: "sonnet",
          label: "Sonnet",
          description: `${a} \xB7 ${"Efficient for routine tasks"}`,
          descriptionForModel: `${a} - efficient for routine tasks`
        };
      }
    } else if (r) {
      s = Qfa(!o, t);
    } else {
      let i = getDefaultOpusModel();
      if (getCanonicalName(i) === "claude-opus-4-8") {
        s = o ? Odo(false) : Yfa(t);
      } else {
        let a = getMarketingNameForModel(normalizeModelStringForAPI(i)) ?? "Opus";
        s = {
          value: "opus",
          label: "Opus",
          description: `${a} \xB7 ${"Best for everyday, complex tasks"}${o ? "" : getOpusPricingSuffix(t, i)}`,
          descriptionForModel: `${a} - best for everyday, complex tasks`
        };
      }
    }
    e.splice(e.findIndex(i => i.value === null) + 1, 0, s);
    return e;
  }
  function Abp(e = false) {
    if (isClaudeAISubscriber()) {
      if (isMaxSubscriber() || isTeamPremiumSubscriber() || isEnterprisePAYGSubscriber()) {
        let a = [f$n(e)];
        if (!isOpus1mMergeEnabled() && poe() && !wdo()) {
          a.push(Wfa());
        }
        if (a.push(Zfa()), Rde() && !Cdo()) {
          a.push(h$n() ? Rdo() : qfa());
        }
        a.push(Gfa);
        return xdo(a, e);
      }
      let i = [f$n(e)];
      if (Rde() && !Cdo()) {
        i.push(h$n() ? Rdo() : qfa());
      }
      if (isOpus1mMergeEnabled()) {
        i.push(Qfa());
      } else if (i.push(Odo(false)), poe() && !wdo()) {
        i.push(Wfa());
      }
      i.push(Gfa);
      return xdo(i, e);
    }
    if (usesFirstPartyModelIds()) {
      let i = [f$n(e)];
      let a = Bfa();
      if (a !== undefined) {
        i.push(a);
      } else if (!isOpus1mMergeEnabled() && poe() && !wdo()) {
        i.push(Hfa(e));
      }
      let l = Lfa();
      if (l !== undefined) {
        i.push(l);
      } else if (h$n()) {
        if (i.push(g$n()), Rde() && !Cdo()) {
          i.push(Rdo());
        }
      } else {
        if (moe("sonnet5")) {
          i.push(g$n());
        }
        if (i.push(Ffa()), Rde()) {
          i.push($fa());
        }
      }
      i.push(jfa() ?? Jfa());
      let c = Ufa();
      if (c !== undefined) {
        tpt(i, c);
      } else if (getAPIProvider() === "anthropicAws" && moe("fable5")) {
        tpt(i, kdo());
      }
      return xdo(i, e);
    }
    let t = [f$n(e)];
    let n = Lfa();
    if (n !== undefined) {
      t.push(n);
    } else {
      if (moe("sonnet5")) {
        t.push(g$n());
      }
      if (moe("sonnet46")) {
        if (t.push(Ffa()), Rde()) {
          t.push($fa());
        }
      }
    }
    let r = Bfa();
    if (r !== undefined) {
      t.push(r);
    } else {
      if (moe("opus41")) {
        t.push(Tbp());
      }
      if (moe("opus48")) {
        if (t.push(Yfa()), poe() && !modelHasNative1MContext(rp().opus48)) {
          t.push(Hfa());
        }
      }
      if (moe("opus47")) {
        if (t.push(vbp()), poe() && !modelHasNative1MContext(rp().opus47)) {
          t.push(Cbp());
        }
      }
      if (moe("opus46")) {
        if (t.push(Ebp()), poe()) {
          t.push(wbp(e));
        }
      }
    }
    let o = jfa();
    if (o !== undefined) {
      t.push(o);
    } else if (moe("haiku45") || moe("haiku35")) {
      t.push(xbp());
    }
    let s = Ufa();
    if (s !== undefined || moe("fable5")) {
      tpt(t, s ?? kdo());
    }
    return t;
  }
  function moe(e) {
    let t = xa[e];
    if (t[getAPIProvider()] !== null) {
      return true;
    }
    return Boolean(getInitialSettings().modelOverrides?.[t.firstParty]);
  }
  function eha(e) {
    let t = getMarketingNameForModel(e);
    if (!t) {
      return null;
    }
    let n = getCanonicalName(e);
    let r = null;
    if (n.includes("fable")) {
      r = {
        alias: "Fable",
        aliasModel: getDefaultFableModel(),
        slogan: "Most capable for your hardest and longest-running tasks"
      };
    } else if (n.includes("sonnet")) {
      r = {
        alias: "Sonnet",
        aliasModel: getDefaultSonnetModel(),
        slogan: "Efficient for routine tasks"
      };
    } else if (n.includes("opus")) {
      r = {
        alias: "Opus",
        aliasModel: getDefaultOpusModel(),
        slogan: "Best for everyday, complex tasks"
      };
    } else if (n.includes("haiku")) {
      r = {
        alias: "Haiku",
        aliasModel: getDefaultHaikuModel(),
        slogan: "Fastest for quick answers"
      };
    }
    if (!r) {
      return {
        value: e,
        label: t,
        description: `Custom model (${e})`
      };
    }
    let o = getMarketingNameForModel(r.aliasModel);
    let s = Object.values(xa).map(a => getCanonicalName(a.firstParty));
    let i = s.indexOf(n);
    if (o && i !== -1 && i < s.indexOf(getCanonicalName(r.aliasModel)) && isModelAllowed(r.aliasModel)) {
      return {
        value: e,
        label: t,
        description: `Newer version available \xB7 select ${r.alias} for ${o}`
      };
    }
    return {
      value: e,
      label: t,
      description: `${r.slogan} (${e})`
    };
  }
  function Ade(e = false) {
    return F9e(e).filter(t => !t.disabled);
  }
  function Ddo(e) {
    if (!Ibp.vZc(Me.CLAUDE_CODE_ENTRYPOINT ?? "")) {
      return [];
    }
    if (getAPIProvider() !== "firstParty") {
      return [];
    }
    if (!isFirstPartyAnthropicBaseUrl()) {
      return [];
    }
    return e.filter(t => t.disabled === true);
  }
  function b$n() {
    return Ddo(F9e());
  }
  function F9e(e = false) {
    let t = new Set();
    let n = Pbp(e).filter(d => {
      if (d.value === null) {
        return true;
      }
      if (t.vZc(d.value)) {
        logForDebugging(`model options: dropping duplicate row "${d.label}" (value ${d.value})`, {
          level: "warn"
        });
        return false;
      }
      t.add(d.value);
      return true;
    });
    let r = Jle();
    let o = getResolvedOrgDefaultModel();
    let s = o ? getCanonicalName(o) : null;
    let i = o ? /\[1m\]$/i.test(o) : false;
    let a = r && s ? n.map(d => {
      if (d.value === null || isModeDependentModelSetting(d.value)) {
        return d;
      }
      let p = parseUserSpecifiedModel(d.value);
      if (getCanonicalName(p) !== s || /\[1m\]$/i.test(p) !== i) {
        return d;
      }
      return {
        ...d,
        description: `${d.description}${Kfa()}`
      };
    }) : n;
    let c = Obp(a).map(d => {
      if (d.disabled === true) {
        return d;
      }
      try {
        let p = Mfa(getCanonicalName(d.value === null ? getDefaultMainLoopModel() : parseUserSpecifiedModel(d.value)));
        if (p !== null) {
          return {
            ...d,
            disabled: true,
            description: p
          };
        }
      } catch (p) {
        logForDebugging(`model-error-overrides picker hint failed: ${p}`, {
          level: "error"
        });
      }
      return d;
    });
    let u = c.filter(d => d.disabled === true);
    if (u.length === 0) {
      return c;
    }
    return [...c.filter(d => d.disabled !== true), ...u];
  }
  function Pbp(e) {
    let t = Abp(e);
    let n = process.env.ANTHROPIC_CUSTOM_MODEL_OPTION;
    if (n && !t.some(l => l.value === n)) {
      t.push({
        value: n,
        label: process.env.ANTHROPIC_CUSTOM_MODEL_OPTION_NAME ?? n,
        description: process.env.ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION ?? `Custom model (${n})`
      });
    }
    for (let l of FCn()) {
      if (!t.some(c => C4t(c, l))) {
        tpt(t, l);
      }
    }
    let r = getAPIProvider();
    if (r === "firstParty" || r === "gateway") {
      let l = r === "gateway" || isFirstPartyAnthropicBaseUrl();
      for (let c of getAdditionalModelOptionsCache()) {
        if (c.disabled && !l) {
          continue;
        }
        if (!t.some(u => C4t(u, c))) {
          tpt(t, c);
        }
      }
    }
    let {
      availableModels: o
    } = getInitialSettings() ?? {};
    if (o) {
      for (let l of o) {
        let c = l.trim();
        if (!c.startsWith("anthropic.") || t.some(u => u.value === c)) {
          continue;
        }
        t.push({
          value: c,
          label: c,
          description: "Custom model"
        });
      }
    }
    let s = null;
    let i = getUserSpecifiedModelSetting();
    let a = getInitialMainLoopModel();
    if (i !== undefined && i !== null) {
      s = i;
    } else if (a !== undefined && a !== null) {
      s = a;
    }
    if (s === null || t.some(l => l.value === s)) {
      return EDe(t);
    } else if (s === "opusplan") {
      return EDe([...t, kbp()]);
    } else if (npt(s)) {
      let l = {
        value: s,
        label: "",
        description: ""
      };
      let c = t.findIndex(u => C4t(u, l));
      if (c !== -1) {
        t[c] = {
          ...t[c],
          value: s
        };
      } else {
        tpt(t, {
          ...kdo(),
          value: s
        });
      }
      return EDe(t);
    } else if (s === "opus") {
      if (!usesFirstPartyModelIds()) {
        let l = getDefaultOpusModel();
        return EDe(t.map(c => c.value === l ? {
          ...c,
          value: "opus"
        } : c));
      }
      return EDe([...t.map(l => l.value === "opus[1m]" && l.label === "Opus" ? {
        ...l,
        label: "Opus (1M context)"
      } : l), Odo(false)]);
    } else if (s === "opus[1m]" && usesFirstPartyModelIds()) {
      return EDe([...t, Xfa(false)]);
    } else {
      let l = {
        value: s,
        label: "",
        description: ""
      };
      if (t.some(c => C4t(c, l))) {
        return EDe(t);
      }
      t.push(eha(s) ?? {
        value: s,
        label: s,
        description: "Custom model"
      });
      return EDe(t);
    }
  }
  function tha(e, t) {
    if (e.some(o => o.value === t)) {
      return t;
    }
    let n = {
      value: t,
      label: "",
      description: ""
    };
    let r = e.find(o => C4t(o, n));
    return typeof r?.value === "string" ? r.value : undefined;
  }
  function EDe(e) {
    if (!(getInitialSettings() || {}).availableModels && getModelEntitlementDenySet().size === 0) {
      return e;
    }
    let n = new Set();
    return e.flatMap(r => {
      if (r.value === null || isModelAllowed(r.value)) {
        return [r];
      }
      let o = ca(r.value);
      if (!s2(o) || !usesFirstPartyModelIds()) {
        return [];
      }
      let s = jCn(o);
      if (s === null) {
        return [];
      }
      let a = r.value !== o && eligible1mSuffixTarget(s) ? `${s}[1m]` : s;
      let l = getCanonicalName(s);
      let c = a !== s;
      if (n.vZc(a) || e.some(d => d !== r && d.value !== null && ca(d.value) !== d.value === c && getCanonicalName(ca(d.value)) === l && isModelAllowed(d.value))) {
        return [];
      }
      let u = eha(a);
      if (u === null) {
        return [];
      }
      n.add(a);
      return [u];
    });
  }
  function bTe(e) {
    return e.map(t => {
      let n = t.value === null ? "default" : t.value;
      let r = n === "default" ? getDefaultMainLoopModel() : parseUserSpecifiedModel(n);
      let o = sx(r);
      let s = Kit(r);
      let i = yh(t.value);
      let a = dbe(r);
      return {
        value: n,
        resolvedModel: r,
        displayName: t.label,
        description: t.description,
        ...(t.promoListPrice !== undefined && {
          promoListPrice: t.promoListPrice
        }),
        ...(o && {
          supportsEffort: true,
          supportedEffortLevels: UC.filter(l => {
            if (l === "max" && !BIe(r)) {
              return false;
            }
            if (l === "xhigh" && !Yne(r)) {
              return false;
            }
            return true;
          })
        }),
        ...(s && {
          supportsAdaptiveThinking: true
        }),
        ...(i && {
          supportsFastMode: true
        }),
        ...(a && {
          supportsAutoMode: true
        }),
        ...(t.disabled && {
          disabled: true
        })
      };
    });
  }
  function nha(e) {
    return {
      value: e.value === "default" ? null : Li(e.value),
      label: Li(e.displayName),
      description: Li(e.description),
      ...(e.disabled && {
        disabled: true
      })
    };
  }
  function C4t(e, t) {
    if (e.value === t.value) {
      return true;
    }
    if (typeof e.value !== "string" || typeof t.value !== "string") {
      return false;
    }
    if (Vfa(e.value) && Vfa(t.value)) {
      return true;
    }
    let n = parseUserSpecifiedModel(e.value);
    if (normalizeModelStringForAPI(n) !== normalizeModelStringForAPI(parseUserSpecifiedModel(t.value))) {
      return false;
    }
    return hg(e.value) === hg(t.value) || modelHasNative1MContext(n);
  }
  function npt(e) {
    return e === "fable" || e === "fable[1m]" || isFableModelValue(e);
  }
  function Vfa(e) {
    if (e === "fable" || e === "fable[1m]") {
      return true;
    }
    return /(?:^|\.)claude-fable-5(?:[-@]\d{8})?(?:-v\d+(?::\d+)?)?(?:\[[12]m\])?$/i.test(e);
  }
  function Obp(e) {
    if (!wfa() || m$() || av() || !Cfa() || !(_Te() || kde())) {
      return e;
    }
    return e.map(t => {
      if (t.disabled === true || typeof t.value !== "string" || !npt(t.value)) {
        return t;
      }
      let n = xde() ? "" : " \u2014 requires usage credits";
      return {
        ...t,
        disabled: true,
        label: "Fable (disabled)",
        description: `${t.description}${n}`
      };
    });
  }
  function tpt(e, t) {
    if (!(typeof t.value === "string" && npt(t.value))) {
      e.push(t);
      return;
    }
    let n = e.findIndex(s => s.value === null);
    if (n === -1) {
      e.splice(0, 0, t);
      return;
    }
    let r = Ado(getDefaultMainLoopModel());
    let o = n + 1;
    while (o < e.length) {
      let s = e[o]?.value;
      if (typeof s !== "string") {
        break;
      }
      if (r !== null && Ado(s) === r || npt(s)) {
        o++;
      } else {
        break;
      }
    }
    e.splice(o, 0, t);
  }
  function Ado(e) {
    let t = e.toLowerCase();
    if (t.includes("fable")) {
      return "fable";
    }
    if (t.includes("opus")) {
      return "opus";
    }
    if (t.includes("sonnet")) {
      return "sonnet";
    }
    if (t.includes("haiku")) {
      return "haiku";
    }
    return null;
  }
  var Gfa;
  var Ibp;
  var STe = __lazy(() => {
    at();
    pr();
    $n();
    no();
    vF();
    sne();
    GT();
    Fp();
    XN();
    DC();
    c$n();
    zN();
    je();
    PV();
    Afa();
    Ds();
    Tk();
    YN();
    Eo();
    VT();
    UCn();
    vdo();
    Gfa = {
      value: "haiku",
      label: "Haiku",
      description: `Haiku 4.5 \xB7 ${"Fastest for quick answers"}`
    };
    Ibp = new Set(["claude-vscode"]);
  });
  function NX() {
    return !Me.CLAUDE_CODE_DISABLE_REFUSAL_FALLBACK;
  }
  function rha() {
    return NX() && uc("switchModelsOnFlag", true).value && isFirstPartyApiBackend();
  }
  function TTe(e) {
    if (cbe(e)) {
      return "eap";
    }
    return "other";
  }
  function Dbp() {
    let e = Me.ANTHROPIC_DEFAULT_OPUS_MODEL;
    if (e) {
      let t = getCanonicalName(e);
      return t.replace(/\[1m\]$/, "").startsWith("claude-") && !isNonCustomOpusModel(t) ? undefined : e;
    }
    return Ade().map(t => t.value).filter(t => typeof t === "string" && t.length > 0).map(t => t.replace(/\[1m\]$/, "")).find(t => getCanonicalName(t).replace(/\[1m\]$/, "") === "claude-opus-4-8");
  }
  function oha(e) {
    return Mbp(iha(e));
  }
  function sha(e) {
    return iha(e) !== undefined;
  }
  function iha(e) {
    let t = getCanonicalName(e);
    if (zPi(t)) {
      return;
    }
    if (!jBt(t) && !ube(t) && !cbe(e) && !isPinnedFableModel(e)) {
      return;
    }
    if (!usesFirstPartyModelIds()) {
      return Dbp();
    }
    let n = getDefaultOpusModel();
    if (!isNonCustomOpusModel(getCanonicalName(n))) {
      return;
    }
    if (/\[1m\]/i.test(e)) {
      return n;
    }
    let r = strip1mTag(n);
    if (r !== n && swapShrinksContextWindow(e, r)) {
      return;
    }
    return r;
  }
  function Mbp(e) {
    if (e === undefined) {
      return;
    }
    let t = n => !isModelDenied(n, getModelEntitlementDenySet()) && (isModelAllowedUnderActiveEnforcement(n) ?? (isModelAllowed(n) || isExemptDefaultResolvingPick(n)));
    if (t(e)) {
      return e;
    }
    return getActiveOpusLineupIds().find(n => isNonCustomOpusModel(getCanonicalName(n)) && t(n));
  }
  function Nbp(e) {
    let t = getCanonicalName(e);
    return jBt(t) || npt(e) || isPinnedFableModel(e) || false;
  }
  function S$n(e) {
    return e != null && Nbp(e) ? "https://support.claude.com/en/articles/15363606" : "https://support.claude.com/en/articles/8106465";
  }
  function rpt(e) {
    return `Send feedback with /feedback or learn more: ${S$n(e)}`;
  }
  function aha(e) {
    let t = e?.match(/https:\/\/claude\.com\/form\/\S+/)?.[0].replace(/[.,;:!?)]+$/, "");
    return t != null && t.length <= 400 ? t : "https://claude.com/form/cyber-use-case";
  }
  function T$n() {
    return NX();
  }
  function opt(e) {
    return e === "cyber" || e === "bio";
  }
  function cha(e) {
    return e === "frontier_llm" || e === "reasoning_extraction";
  }
  function spt(e) {
    return opt(e) || cha(e) ? e : "other";
  }
  function Ldo(e) {
    return `${renderModelName(e)}'s safeguards flagged this message. The safeguards are intentionally broad right now and may flag safe and routine coding, cybersecurity, or biology work. These measures let us bring you Mythos-level capabilities sooner, and we're working to refine them.`;
  }
  function Fdo(e, t) {
    return cha(t) ? `${renderModelName(e)}'s safeguards flagged this message. This sometimes happens with safe, normal conversations.` : "This model's safeguards flagged this message. This sometimes happens with safe, normal conversations.";
  }
  function E$n(e, t, n) {
    let r = renderModelName(t);
    return `${opt(n) ? Ldo(e) : Fdo(e, n)} Switched to ${r}. ${rpt(e)}`;
  }
  function dha(e, t, n) {
    let r = renderModelName(t);
    return `${opt(n) ? Ldo(e) : Fdo(e, n)} Switched to ${r}. ${rpt(e)}`;
  }
  function $bp(e) {
    let t = e;
    if (t.length > 0 && !/[.!?\u2026\u3002\uFF01\uFF1F'")\]]$/.test(t)) {
      let n = Math.max(0, t.length - 48);
      let r = Math.max(t.lastIndexOf(" "), t.lastIndexOf(`
`), t.lastIndexOf("\t"));
      if (r > 0 && r >= n) {
        t = t.slice(0, r).trimEnd();
      }
    }
    return t.trimEnd();
  }
  function pha(e) {
    let t = e.flatMap(s => !s.isApiErrorMessage && Array.isArray(s.message.content) ? s.message.content : []);
    let n = $bp(t.flatMap(s => s.type === "text" ? [s.text] : []).join(`

`).trim());
    let r = t.flatMap(s => s.type === "tool_use" ? [s.input] : []);
    let o = r.some(s => typeof s === "object" && s !== null && Object.keys(s).length === 0 || yje(s));
    return {
      partialTextChars: n.length,
      toolUseCount: r.length,
      hadEmptyInputToolUse: o
    };
  }
  function mha({
    salvage: e,
    streamedText: t,
    serverRetainedUuids: n
  }) {
    if (e === null) {
      return t.trim().length > 0 ? {
        kind: "mint",
        text: t
      } : {
        kind: "none"
      };
    }
    if (n === null) {
      return {
        kind: "mint",
        text: e + t
      };
    }
    return t.trim().length > 0 ? {
      kind: "mint-replacing",
      text: e + t,
      replacesUuids: n
    } : {
      kind: "none"
    };
  }
  function fha() {
    return isSdkDialogHostActive() && !(getSdkSupportedDialogKinds() ?? []).includes("refusal_fallback_prompt");
  }
  function hha(e) {
    if (!e.isMainThread) {
      return "subagent";
    }
    if (e.requestDialog === undefined) {
      return "no_dialog_host";
    }
    if (uc("switchModelsOnFlag", true).value) {
      return "setting";
    }
    if (e.consumerLacksDialogCapability) {
      return "no_consumer_capability";
    }
    return;
  }
  function gha(e) {
    return e.isMainThread && (e.requestDialog === undefined || e.consumerLacksDialogCapability) && uc("switchModelsOnFlag", true).value === false;
  }
  function yha() {
    if (usesFirstPartyModelIds()) {
      return;
    }
    return "To enable automatic fallback on this provider, set `ANTHROPIC_DEFAULT_FABLE_MODEL` to your Fable 5 model ID and `ANTHROPIC_DEFAULT_OPUS_MODEL` to your Opus 4.8 model ID.";
  }
  function _ha(e, t) {
    return `${opt(t) ? Ldo(e) : Fdo(e, t)} ${rpt(e)}`;
  }
  function bha(e, t) {
    return {
      retry_fallback: `Switch to ${renderModelName(t)}`,
      edit_prompt: `Edit prompt and retry with ${renderModelName(e)}`
    };
  }
  var uha;
  var LX = __lazy(() => {
    at();
    pr();
    Gd();
    AI();
    qBt();
    Eo();
    STe();
    Ds();
    zg();
    uha = `They may flag safe, normal content as well. ${"These measures let us bring you Mythos-level capabilities sooner, and we're working to refine them."}`;
  });
  function Sha(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    if (!("type" in e) || e.type !== "image") {
      return false;
    }
    if (!("source" in e) || typeof e.source !== "object" || e.source === null) {
      return false;
    }
    let t = e.source;
    return "type" in t && t.type === "base64" && "data" in t && typeof t.data === "string";
  }
  function Hbp(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    if (!("type" in e) || e.type !== "tool_result") {
      return false;
    }
    return "content" in e && Array.isArray(e.content);
  }
  function Tha(e, t, n, r) {
    let o = e.source.data.length;
    if (o > n) {
      logEvent("tengu_image_api_validation_failed", {
        base64_size_bytes: o,
        max_bytes: n
      });
      r.push({
        index: t,
        size: o
      });
    }
  }
  function x4t(e, t) {
    let n = [];
    let r = 0;
    for (let o of e) {
      if (typeof o !== "object" || o === null) {
        continue;
      }
      if (!("type" in o) || o.type !== "user") {
        continue;
      }
      if (!("message" in o) || typeof o.message !== "object" || o.message === null) {
        continue;
      }
      let s = o.message;
      if (!("content" in s) || !Array.isArray(s.content)) {
        continue;
      }
      for (let i of s.content) {
        if (Sha(i)) {
          Tha(i, ++r, t, n);
          continue;
        }
        if (Hbp(i)) {
          for (let a of i.content) {
            if (Sha(a)) {
              Tha(a, ++r, t, n);
            }
          }
        }
      }
    }
    if (n.length > 0) {
      throw new ipt(n, t);
    }
  }
  var ipt;
  var v$n = __lazy(() => {
    Ot();
    cs();
    ipt = class ipt extends Error {
      constructor(e, t) {
        let n;
        let r = e[0];
        if (e.length === 1 && r) {
          n = `Image base64 size (${formatFileSize(r.size)}) exceeds API limit (${formatFileSize(t)}). Please resize the image before sending.`;
        } else {
          n = `${e.length} images exceed the API limit (${formatFileSize(t)}): ` + e.map(o => `Image ${o.index}: ${formatFileSize(o.size)}`).join(", ") + ". Please resize these images before sending.";
        }
        super(n);
        this.name = "ImageSizeError";
      }
    };
  });
  function Udo(e) {
    if (Pot()) {
      return jni(e);
    }
    return e;
  }
  function apt(e) {
    return e || Pot();
  }
  function Eha(e) {
    return Pot() && e.status === 429;
  }
  var k4t = __lazy(() => {
    CN();
    jle();
  });
  function FX() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_idle_amber_finch", false);
  }
  function vha() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_quiet_slate_wren", false);
  }
  var U9e = __lazy(() => {
    $n();
  });
  function w$n(e) {
    if (e?.is_enabled === true) {
      return true;
    }
    return SLt(e?.disabled_reason ?? null);
  }
  function vDe() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_usage_overage_included_models", []);
    return Array.isArray(e) ? e.filter(t => typeof t === "string") : [];
  }
  function lpt(e, t) {
    let n = t.map(r => r.toLowerCase());
    if (n.length === 0) {
      return [];
    }
    return (e ?? []).filter(r => r.kind === "weekly_scoped" && r.scope?.model && n.includes(r.scope.model.display_name.toLowerCase())).map(r => ({
      title: `Current week (${r.scope?.model?.display_name})`,
      limit: {
        utilization: r.percent,
        resets_at: r.resets_at
      }
    }));
  }
  async function Ide() {
    return vl("api_usage_fetch", async () => {
      if (!isClaudeAISubscriber() || !hasProfileScope()) {
        return {};
      }
      let e = 0;
      let t = await withOAuth401Retry(async () => {
        e++;
        logForDebugging(`fetchUtilization: GET /api/oauth/usage (attempt ${e})`);
        let n = await _s.get("/api/oauth/usage", {
          timeout: 5000,
          headers: {
            "Content-Type": "application/json"
          },
          refreshOAuth: true
        });
        if (!n.ok) {
          throw Error(`Auth error: ${n.reason === "no-auth" ? n.detail : n.reason}`);
        }
        return n;
      });
      logForDebugging(`fetchUtilization: 200 after ${e} attempt(s)${e > 1 ? " (401\u2192refresh\u2192retry succeeded)" : ""}`);
      return t.data;
    });
  }
  var ETe = __lazy(() => {
    no();
    je();
    GT();
    YA();
    ln();
    $n();
    bg();
  });
  function wha(e) {
    return qbp.some(t => e.startsWith(t));
  }
  function Cha(e, t) {
    if (e.isUsingOverage) {
      if (e.overageStatus === "allowed_warning") {
        return {
          message: `You're close to your ${i2() ? "usage limit" : "usage credit limit"}`,
          severity: "warning"
        };
      }
      return null;
    }
    if (e.status === "rejected") {
      return {
        message: Wbp(e, t),
        severity: "error"
      };
    }
    if (e.status === "allowed_warning") {
      if (e.utilization !== undefined && e.utilization < 0.7) {
        return null;
      }
      let r = getSubscriptionType();
      let o = r === "team" || r === "enterprise";
      let s = getOauthAccountInfo()?.hasExtraUsageEnabled === true;
      if (o && s && !av()) {
        return null;
      }
      let i = Vbp(e);
      if (i) {
        return {
          message: i,
          severity: "warning"
        };
      }
    }
    return null;
  }
  function $do(e, t) {
    let n = Cha(e, t);
    if (n && n.severity === "error") {
      return n.message;
    }
    return null;
  }
  function Hdo(e, t) {
    let n = Cha(e, t);
    if (n && n.severity === "warning") {
      return n.message;
    }
    return null;
  }
  function Wbp(e, t) {
    let n = i2();
    let r = av();
    let o = r ? "" : " \xB7 contact your admin to increase it";
    let s = e.resetsAt;
    let i = s ? formatResetTime(s, true) : undefined;
    let a = e.overageResetsAt ? formatResetTime(e.overageResetsAt, true) : undefined;
    let l = i ? ` \xB7 resets ${i}` : "";
    let c = Gbp(e, l, t);
    if (!n && e.overageDisabledReason && c && !Bdo.vZc(e.overageDisabledReason) && (e.rateLimitType === "seven_day_overage_included" || !(isFableFamilyOrPinnedModel(t) && _Te() && !m$()))) {
      return c;
    }
    if (!n && e.overageDisabledReason && Bdo.vZc(e.overageDisabledReason)) {
      let u = getSubscriptionType();
      if (u === "team" || u === "enterprise") {
        return UX("org's monthly spend limit", r ? " \xB7 run /usage-credits to raise it, or visit claude.ai/admin-settings/usage" : " \xB7 run /usage-credits to ask your admin for a higher limit", t);
      }
      return UX(r ? "monthly spend limit" : "org's monthly spend limit", r ? " \xB7 raise it at claude.ai/settings/usage" : " \xB7 ask your admin to raise it at claude.ai/settings/usage", t);
    }
    if (e.overageStatus === "rejected") {
      let u = "";
      if (s && e.overageResetsAt) {
        if (s < e.overageResetsAt) {
          u = ` \xB7 resets ${i}`;
        } else {
          u = ` \xB7 resets ${a}`;
        }
      } else if (i) {
        u = ` \xB7 resets ${i}`;
      } else if (a) {
        u = ` \xB7 resets ${a}`;
      }
      if (e.overageDisabledReason === "out_of_credits") {
        if (n) {
          return r ? "Your org is out of usage \xB7 add funds to continue" : "Your org is out of usage \xB7 contact your admin";
        }
        return `You're out of usage credits${u}`;
      }
      if (e.overageDisabledReason && Bdo.vZc(e.overageDisabledReason)) {
        let d = a ? ` \xB7 resets ${a}` : "";
        return UX("org's monthly usage limit", d, t);
      }
      if (e.overageDisabledReason === "seat_tier_level_disabled" || e.overageDisabledReason === "seat_tier_zero_credit_limit") {
        return `Your seat type doesn't include ${n ? "usage" : "usage credits"}`;
      }
      if (e.overageDisabledReason === "org_service_level_disabled") {
        return "This service is disabled for your org";
      }
      if (e.overageDisabledReason === "member_level_disabled" || e.overageDisabledReason === "member_zero_credit_limit") {
        return "Your usage allocation has been disabled by your admin \xB7 run /usage-credits to ask your admin for a higher limit";
      }
      if (e.overageDisabledReason === "group_zero_credit_limit") {
        return "Your group's usage limit is set to $0 \xB7 run /usage-credits to ask your admin for a higher limit";
      }
      if (n) {
        return UX("usage limit", o, t);
      }
      return UX("limit", u, t);
    }
    if (c) {
      return c;
    }
    if (n) {
      return UX("usage limit", o, t);
    }
    return UX("usage limit", l, t);
  }
  function Gbp(e, t, n) {
    if (e.rateLimitType === "seven_day_sonnet") {
      let r = getSubscriptionType();
      return UX(r === "pro" || r === "enterprise" ? "weekly limit" : "Sonnet limit", t, n);
    }
    if (e.rateLimitType === "seven_day_opus") {
      return UX("Opus limit", t, n);
    }
    if (e.rateLimitType === "seven_day_overage_included") {
      return UX("Fable 5 limit", t, n);
    }
    if (e.rateLimitType === "seven_day") {
      return UX("weekly limit", t, n);
    }
    if (e.rateLimitType === "five_hour") {
      return UX("session limit", t, n);
    }
    return null;
  }
  function Vbp(e) {
    let t = null;
    switch (e.rateLimitType) {
      case "seven_day":
        t = "weekly limit";
        break;
      case "five_hour":
        t = "session limit";
        break;
      case "seven_day_opus":
        t = "Opus limit";
        break;
      case "seven_day_sonnet":
        t = "Sonnet limit";
        break;
      case "seven_day_overage_included":
        t = "Fable 5 limit";
        break;
      case "overage":
        t = i2() ? "usage" : "usage credits";
        break;
      case undefined:
        return null;
    }
    let n = e.utilization ? Math.floor(e.utilization * 100) : undefined;
    let r = e.rateLimitType === "overage" && i2();
    let o = e.resetsAt && !r ? formatResetTime(e.resetsAt, true) : undefined;
    let s = zbp(e.rateLimitType);
    if (n && o) {
      let a = `You've used ${n}% of your ${t} \xB7 resets ${o}`;
      return s ? `${a} \xB7 ${s}` : a;
    }
    if (n) {
      let a = `You've used ${n}% of your ${t}`;
      return s ? `${a} \xB7 ${s}` : a;
    }
    if (e.rateLimitType === "overage") {
      t = i2() ? "usage limit" : "usage credit limit";
    }
    if (o) {
      let a = `Approaching ${t} \xB7 resets ${o}`;
      return s ? `${a} \xB7 ${s}` : a;
    }
    let i = `Approaching ${t}`;
    return s ? `${i} \xB7 ${s}` : i;
  }
  function zbp(e) {
    let t = getSubscriptionType();
    let n = getOauthAccountInfo()?.hasExtraUsageEnabled === true;
    let r = av();
    if (t === "team" || t === "enterprise") {
      if (!n && isOverageProvisioningAllowed()) {
        return r ? "Run /usage-credits to turn on extra usage for your org" : "Run /usage-credits to ask your admin for more";
      }
      if (n && e === "overage") {
        return r ? "Run /usage-credits to raise the cap" : "Run /usage-credits to ask your admin for more";
      }
      return null;
    }
    if (e === "five_hour" && (t === "pro" || t === "max") && !FX()) {
      return "/upgrade to keep using Claude Code";
    }
    return null;
  }
  function Rha(e) {
    if (!Kbp(e)) {
      return null;
    }
    if (!isOverageProvisioningAllowed() || Me.DISABLE_EXTRA_USAGE_COMMAND) {
      return "Switch models to keep working.";
    }
    if (!av()) {
      return "Switch models to keep working.";
    }
    return "Buy more to keep using Fable 5, or switch models to keep working.";
  }
  function Kbp(e) {
    return e !== null && isFableFamilyOrPinnedModel(parseUserSpecifiedModel(e)) && _Te() && !m$();
  }
  function xha(e, t, n) {
    if (getSubscriptionType() !== "pro") {
      return null;
    }
    if (e.rateLimitType !== "seven_day") {
      return null;
    }
    if (t.includes("fable")) {
      return {
        lever: "model",
        text: "try /model opus \xB7 more runway"
      };
    }
    if (t.includes("opus")) {
      return {
        lever: "model",
        text: "try /model sonnet \xB7 ~2\xD7 runway"
      };
    }
    if (!sx(t)) {
      return null;
    }
    let r = r1(t, n);
    if (r === "high" || r === "xhigh" || r === "max") {
      return {
        lever: "effort",
        text: "try /effort medium"
      };
    }
    return null;
  }
  function jdo(e, t) {
    let n = e.resetsAt ? formatResetTime(e.resetsAt, true) : "";
    let r = "";
    if (e.rateLimitType === "five_hour") {
      r = "session limit";
    } else if (e.rateLimitType === "seven_day") {
      r = "weekly limit";
    } else if (e.rateLimitType === "seven_day_opus") {
      r = "Opus limit";
    } else if (e.rateLimitType === "seven_day_sonnet") {
      let a = getSubscriptionType();
      r = a === "pro" || a === "enterprise" ? "weekly limit" : "Sonnet limit";
    }
    let o = i2();
    if (!r && !o && t) {
      let a = getPublicModelDisplayName(parseUserSpecifiedModel(t));
      if (a && vDe().includes(a)) {
        let l = n ? ` \xB7 Your ${a} limit resets ${n}` : "";
        return `Now using usage credits for ${a}${l}`;
      }
    }
    let s = o ? "your usage allocation" : "usage credits";
    if (!r) {
      return `Now using ${s}`;
    }
    let i = n && !o ? ` \xB7 Your ${r} resets ${n}` : "";
    return `You're now using ${s}${i}`;
  }
  function UX(e, t, n) {
    return `You've hit your ${e}${t}`;
  }
  var Bdo;
  var qbp;
  var A4t = __lazy(() => {
    no();
    vF();
    Fp();
    pr();
    cs();
    PV();
    Eo();
    U9e();
    $n();
    ETe();
    Bdo = new Set(["org_level_disabled_until", "org_spend_cap_reached"]);
    qbp = ["You've hit your", "You've reached your", "You've used", "You're now using usage credits", "You're close to", "You're out of usage credits", "Your org is out of usage \xB7 add funds to continue", "Your org is out of usage \xB7 contact your admin", "You're now using your usage allocation", "Now using your usage allocation", "Now using usage credits", "Your seat type doesn't include usage credits", "Your seat type doesn't include usage", "This service is disabled for your org", "Your usage allocation has been disabled by your admin", "Your group's usage limit is set to $0", "Fable 5 requires usage credits", "You're now using extra usage", "You're out of extra usage", "Now using extra usage", "Your seat type doesn't include extra usage"];
  });
  function Aha(e) {
    return Xbp[e] || e;
  }
  function Qbp(e, t) {
    let n = Date.now() / 1000;
    let r = e - t;
    let o = n - r;
    return Math.max(0, Math.min(1, o / t));
  }
  function Iha(e) {
    let t = e.headers?.get?.("anthropic-ratelimit-unified-representative-claim");
    let n = e.headers?.get?.("anthropic-ratelimit-unified-overage-status");
    if (!t && !n) {
      return null;
    }
    let r = {
      status: "rejected",
      unifiedRateLimitFallbackAvailable: false,
      isUsingOverage: false
    };
    let o = e.headers?.get?.("anthropic-ratelimit-unified-reset");
    if (o) {
      r.resetsAt = Number(o);
    }
    if (t) {
      r.rateLimitType = t;
    }
    if (n) {
      r.overageStatus = n;
    }
    let s = e.headers?.get?.("anthropic-ratelimit-unified-overage-reset");
    if (s) {
      r.overageResetsAt = Number(s);
    }
    let i = e.headers?.get?.("anthropic-ratelimit-unified-overage-disabled-reason");
    if (i) {
      r.overageDisabledReason = i;
    }
    return r;
  }
  function Pha(e) {
    if (e < kha) {
      return true;
    }
    kha = e;
    return false;
  }
  function $9e() {
    return B9e;
  }
  function Oha(e) {
    let t = {};
    for (let [n, r] of [["five_hour", "5h"], ["seven_day", "7d"], ["seven_day_overage_included", "7d_oi"], ["overage", "overage"]]) {
      let o = e.get(`anthropic-ratelimit-unified-${r}-utilization`);
      let s = e.get(`anthropic-ratelimit-unified-${r}-reset`);
      if (o !== null && s !== null) {
        t[n] = {
          utilization: Number(o),
          resets_at: Number(s)
        };
      }
    }
    return t;
  }
  function I4t(e) {
    let t = g0;
    if (g0 = e, wDe.forEach(r => r(e)), t.status === e.status && t.isUsingOverage === e.isUsingOverage) {
      return;
    }
    let n = Math.round((e.resetsAt ? e.resetsAt - Date.now() / 1000 : 0) / 3600 * 10) / 10;
    logEvent("tengu_claudeai_limits_status_changed", {
      status: e.status,
      previousStatus: t.status,
      rateLimitType: e.rateLimitType == null ? undefined : e.rateLimitType,
      isUsingOverage: e.isUsingOverage,
      unifiedRateLimitFallbackAvailable: e.unifiedRateLimitFallbackAvailable,
      hoursTillReset: n
    });
  }
  async function Zbp() {
    let e = getSmallFastModel();
    let t = await R8({
      maxRetries: 0,
      model: e,
      source: "quota_check",
      agentContext: ym()
    });
    let n = [{
      role: "user",
      content: "quota"
    }];
    let r = A8(e);
    return t.beta.messages.create({
      model: e,
      max_tokens: 1,
      messages: n,
      metadata: CDe(),
      ...(r.length > 0 && {
        betas: kk(r)
      })
    }).asResponse();
  }
  async function Dha() {
    if (Vi()) {
      return;
    }
    if (!apt(isClaudeAISubscriber())) {
      return;
    }
    if (getIsNonInteractiveSession()) {
      return;
    }
    try {
      let e = await Zbp();
      R$n(e.headers, getSmallFastModel());
    } catch (e) {
      if (e instanceof Ho) {
        x$n(e);
      }
    }
  }
  function eSp(e, t) {
    for (let [n, r] of Object.entries(Jbp)) {
      let o = e.get(`anthropic-ratelimit-unified-${n}-surpassed-threshold`);
      if (o !== null) {
        let s = e.get(`anthropic-ratelimit-unified-${n}-utilization`);
        let i = e.get(`anthropic-ratelimit-unified-${n}-reset`);
        let a = s ? Number(s) : undefined;
        return {
          status: "allowed_warning",
          resetsAt: i ? Number(i) : undefined,
          rateLimitType: r,
          utilization: a,
          unifiedRateLimitFallbackAvailable: t,
          isUsingOverage: false,
          surpassedThreshold: Number(o)
        };
      }
    }
    return null;
  }
  function tSp(e, t, n) {
    let {
      rateLimitType: r,
      claimAbbrev: o,
      windowSeconds: s,
      thresholds: i
    } = t;
    let a = e.get(`anthropic-ratelimit-unified-${o}-utilization`);
    let l = e.get(`anthropic-ratelimit-unified-${o}-reset`);
    if (a === null || l === null) {
      return null;
    }
    let c = Number(a);
    let u = Number(l);
    let d = Qbp(u, s);
    if (!i.some(m => c >= m.utilization && d <= m.timePct)) {
      return null;
    }
    return {
      status: "allowed_warning",
      resetsAt: u,
      rateLimitType: r,
      utilization: c,
      unifiedRateLimitFallbackAvailable: n,
      isUsingOverage: false
    };
  }
  function nSp(e, t) {
    let n = eSp(e, t);
    if (n) {
      return n;
    }
    for (let r of Ybp) {
      let o = tSp(e, r, t);
      if (o) {
        return o;
      }
    }
    return null;
  }
  function Mha(e) {
    let t = e.get("anthropic-ratelimit-unified-status") || "allowed";
    let n = e.get("anthropic-ratelimit-unified-reset");
    let r = n ? Number(n) : undefined;
    let o = e.get("anthropic-ratelimit-unified-fallback") === "available";
    let s = e.get("anthropic-ratelimit-unified-representative-claim");
    let i = e.get("anthropic-ratelimit-unified-overage-status");
    let a = e.get("anthropic-ratelimit-unified-overage-reset");
    let l = a ? Number(a) : undefined;
    let c = e.get("anthropic-ratelimit-unified-overage-disabled-reason");
    let u = e.get("anthropic-ratelimit-unified-overage-in-use") === "true";
    let d = e.get("anthropic-ratelimit-unified-upgrade-paths");
    let p = d ? d.split(",").map(E => E.trim()) : undefined;
    let m = e.get("anthropic-ratelimit-unified-overage-period-monthly-utilization");
    let f = m ? Number(m) : NaN;
    let h = Number.isFinite(f) ? {
      utilization: f
    } : undefined;
    let g = e.get("anthropic-ratelimit-unified-overage-period-channel-utilization");
    let y = g ? Number(g) : NaN;
    let _ = Number.isFinite(y) ? {
      utilization: y
    } : undefined;
    let b = t === "rejected" && (i === "allowed" || i === "allowed_warning");
    let S = t;
    if (t === "allowed" || t === "allowed_warning") {
      let E = nSp(e, o);
      if (E) {
        return {
          ...E,
          ...(p && {
            upgradePaths: p
          }),
          ...(u && {
            overageInUse: u
          }),
          ...(h && {
            overagePeriodMonthly: h
          }),
          ...(_ && {
            overagePeriodChannel: _
          })
        };
      }
      S = "allowed";
    }
    return {
      status: S,
      resetsAt: r,
      unifiedRateLimitFallbackAvailable: o,
      ...(s && {
        rateLimitType: s
      }),
      ...(i && {
        overageStatus: i
      }),
      ...(l && {
        overageResetsAt: l
      }),
      ...(c && {
        overageDisabledReason: c
      }),
      ...(p && {
        upgradePaths: p
      }),
      isUsingOverage: b,
      ...(u && {
        overageInUse: u
      }),
      ...(h && {
        overagePeriodMonthly: h
      }),
      ...(_ && {
        overagePeriodChannel: _
      })
    };
  }
  function qdo(e) {
    let t = e.error?.error?.details;
    if (t?.error_code !== "credits_required") {
      return {};
    }
    return {
      errorCode: "credits_required",
      ...(typeof t.disabled_reason === "string" && {
        overageDisabledReason: t.disabled_reason
      }),
      ...(typeof t.can_user_purchase_credits === "boolean" && {
        canUserPurchaseCredits: t.can_user_purchase_credits
      }),
      ...(typeof t.has_chargeable_saved_payment_method === "boolean" && {
        hasChargeableSavedPaymentMethod: t.has_chargeable_saved_payment_method
      })
    };
  }
  function cpt(e) {
    if (getGlobalConfig().cachedExtraUsageDisabledReason !== e) {
      saveGlobalConfig(t => ({
        ...t,
        cachedExtraUsageDisabledReason: e
      }));
    }
  }
  function Nha(e) {
    cpt(e.get("anthropic-ratelimit-unified-overage-disabled-reason") ?? null);
  }
  function R$n(e, t, n = false, r = Date.now()) {
    let o = isClaudeAISubscriber();
    if (!apt(o)) {
      if (B9e = {}, g0.status !== "allowed" || g0.resetsAt) {
        I4t({
          status: "allowed",
          unifiedRateLimitFallbackAvailable: false,
          isUsingOverage: false
        });
      }
      return;
    }
    let s = Udo(e);
    let i = Mha(s);
    if (Nha(s), !Pha(r)) {
      if (B9e = Oha(s), !gbu(g0, i)) {
        I4t(i);
      }
    }
    if (i.overageInUse === true) {
      if (!(i.isUsingOverage === true && i.rateLimitType !== "seven_day_overage_included") && !n && !i2() && isFableFamilyOrPinnedModel(t) && !m$() && !kde() && !v4t()) {
        setFableCreditsRequired(true);
      }
      C$n.forEach(l => l(t, i.isUsingOverage === true, n));
    }
  }
  function x$n(e, t = Date.now()) {
    if (!apt(isClaudeAISubscriber()) || e.status !== 429) {
      return;
    }
    try {
      let n = Pha(t);
      let r = g0.status;
      let o = g0.isUsingOverage;
      let s = B9e.five_hour?.utilization;
      let i = B9e.seven_day?.utilization;
      let a = B9e.overage?.utilization;
      let l = {
        ...g0
      };
      if (e.headers) {
        let u = Udo(e.headers);
        if (!n) {
          B9e = Oha(u);
        }
        l = Mha(u);
        Nha(u);
      }
      if (l.status = "rejected", Object.assign(l, qdo(e)), (r !== "rejected" || o) && !(r === "allowed" && !o && s === undefined && i === undefined && a === undefined)) {
        let u = l.rateLimitType === "five_hour" ? s : l.rateLimitType?.startsWith("seven_day") ? i : l.rateLimitType === "overage" ? a : Math.max(s ?? 0, i ?? 0, a ?? 0);
        if (u === undefined || u < 0.8) {
          logEvent("tengu_quota_mismatch", {
            priorStatus: r,
            priorIsUsingOverage: o,
            priorFiveHourUtilization: s,
            priorSevenDayUtilization: i,
            priorOverageUtilization: a,
            rateLimitType: (l.rateLimitType == null ? undefined : l.rateLimitType) ?? undefined,
            subscriptionType: (getSubscriptionType() == null ? undefined : getSubscriptionType()) ?? undefined,
            hadPriorUtilizationData: s !== undefined || i !== undefined || a !== undefined
          });
        }
      }
      if (!n && !gbu(g0, l)) {
        I4t(l);
      }
    } catch (n) {
      Oe(n);
    }
  }
  var Ybp;
  var Jbp;
  var Xbp;
  var g0;
  var kha = 0;
  var B9e;
  var wDe;
  var C$n;
  var pU = __lazy(() => {
    CN();
    at();
    KN();
    _h();
    no();
    DC();
    vF();
    Rn();
    PV();
    Eo();
    Wd();
    Ot();
    aE();
    uIe();
    k4t();
    A4t();
    Ybp = [{
      rateLimitType: "five_hour",
      claimAbbrev: "5h",
      windowSeconds: 18000,
      thresholds: [{
        utilization: 0.9,
        timePct: 0.72
      }]
    }, {
      rateLimitType: "seven_day",
      claimAbbrev: "7d",
      windowSeconds: 604800,
      thresholds: [{
        utilization: 0.75,
        timePct: 0.6
      }, {
        utilization: 0.5,
        timePct: 0.35
      }, {
        utilization: 0.25,
        timePct: 0.15
      }]
    }];
    Jbp = {
      "5h": "five_hour",
      "7d": "seven_day",
      "7d_oi": "seven_day_overage_included",
      overage: "overage"
    };
    Xbp = {
      five_hour: "session limit",
      seven_day: "weekly limit",
      seven_day_opus: "Opus limit",
      seven_day_sonnet: "Sonnet limit",
      seven_day_overage_included: "Fable 5 limit",
      overage: "usage credit limit"
    };
    g0 = {
      status: "allowed",
      unifiedRateLimitFallbackAvailable: false,
      isUsingOverage: false
    };
    B9e = {};
    wDe = new Set();
    C$n = new Set();
  });
  function Gdo(e) {
    return Ode.vZc(e) || Pde.vZc(e) ? e : "other";
  }
  function f$(e) {
    if (!e || typeof e !== "object") {
      return null;
    }
    let t = e;
    let n = 5;
    let r = 0;
    while (t && r < n) {
      if (t instanceof Error) {
        if ("code" in t && typeof t.code === "string") {
          let o = t.code;
          let s = rSp.vZc(o);
          return {
            code: o,
            message: t.message,
            isSSLError: s
          };
        }
        if (t.message.startsWith("The socket connection was closed unexpectedly")) {
          return {
            code: "ConnectionClosed",
            message: t.message,
            isSSLError: false
          };
        }
      }
      if (t instanceof Error && "cause" in t && t.cause !== t) {
        t = t.cause;
        r++;
      } else {
        break;
      }
    }
    return null;
  }
  function sSp(e) {
    let t = f$(e);
    return t !== null && Pde.vZc(t.code);
  }
  function RDe(e) {
    let t = f$(e);
    if (!t?.isSSLError) {
      return null;
    }
    return `SSL certificate error (${t.code}). If you are behind a corporate proxy or TLS-intercepting firewall, set NODE_EXTRA_CA_CERTS to your CA bundle path, or ask IT to allowlist *.anthropic.com. Run /doctor for details.`;
  }
  function Wdo(e) {
    if (e.includes("<!DOCTYPE html") || e.includes("<html")) {
      let t = e.match(/<title>([^<]+)<\/title>/);
      if (t && t[1]) {
        return t[1].trim();
      }
      return "";
    }
    return e;
  }
  function iSp(e) {
    let t = e.message;
    if (!t) {
      return "";
    }
    return Wdo(t);
  }
  function aSp(e) {
    return typeof e === "object" && e !== null && "error" in e && typeof e.error === "object" && e.error !== null;
  }
  function Lha(e) {
    if (!aSp(e)) {
      return null;
    }
    let n = e.error;
    let r = n?.error?.message;
    if (typeof r === "string" && r.length > 0) {
      let s = Wdo(r);
      if (s.length > 0) {
        return s;
      }
    }
    let o = n?.message;
    if (typeof o === "string" && o.length > 0) {
      let s = Wdo(o);
      if (s.length > 0) {
        return s;
      }
    }
    return null;
  }
  function upt(e) {
    let t = f$(e);
    if (t) {
      let {
        code: r,
        isSSLError: o
      } = t;
      if (r === "StreamSuspended") {
        return "Connection interrupted by system sleep";
      }
      if (r === "ETIMEDOUT") {
        return "Request timed out. Check your internet connection and proxy settings";
      }
      if (o) {
        switch (r) {
          case "UNABLE_TO_VERIFY_LEAF_SIGNATURE":
          case "UNABLE_TO_GET_ISSUER_CERT":
          case "UNABLE_TO_GET_ISSUER_CERT_LOCALLY":
            return "Unable to connect to API: SSL certificate verification failed. Check your proxy or corporate SSL certificates";
          case "CERT_HAS_EXPIRED":
            return "Unable to connect to API: SSL certificate has expired";
          case "CERT_REVOKED":
            return "Unable to connect to API: SSL certificate has been revoked";
          case "DEPTH_ZERO_SELF_SIGNED_CERT":
          case "SELF_SIGNED_CERT_IN_CHAIN":
            return "Unable to connect to API: Self-signed certificate detected. Check your proxy or corporate SSL certificates";
          case "ERR_TLS_CERT_ALTNAME_INVALID":
          case "HOSTNAME_MISMATCH":
            return "Unable to connect to API: SSL certificate hostname mismatch";
          case "CERT_NOT_YET_VALID":
            return "Unable to connect to API: SSL certificate is not yet valid";
          default:
            return `Unable to connect to API: SSL error (${r})`;
        }
      }
    }
    if (e.message === "Connection error.") {
      if (t?.code) {
        return `Unable to connect to API (${t.code})`;
      }
      return "Unable to connect to API. Check your internet connection";
    }
    if (!e.message) {
      return Lha(e) ?? `API error (status ${e.status ?? "unknown"})`;
    }
    if (e.message.includes('{"')) {
      let r = Lha(e);
      if (r) {
        return e.status ? `${e.status} ${r}` : r;
      }
    }
    let n = iSp(e);
    return n !== e.message && n.length > 0 ? n : e.message;
  }
  function P4t(e) {
    let t = s => e.headers?.get?.(s) ?? undefined;
    let n = t("anthropic-ratelimit-unified-representative-claim");
    let r = t("anthropic-ratelimit-unified-reset");
    let o = t("anthropic-ratelimit-unified-overage-status");
    return {
      message: e.message,
      status: e.status,
      requestId: e.requestID ?? undefined,
      formatted: upt(e),
      connection: f$(e),
      isNetworkDown: sSp(e),
      rateLimits: n || o ? {
        ...(n && {
          rateLimitType: n
        }),
        ...(r && {
          resetsAt: Number(r)
        })
      } : null
    };
  }
  function Fha({
    connDetails: e,
    isStaleConnection: t,
    isContextHintSse: n,
    streamIdleAborted: r
  }) {
    if (e?.code === "StreamSuspended") {
      return "stream_suspended";
    }
    if (t) {
      return "stale_connection";
    }
    if (n) {
      return "context_hint_sse";
    }
    if (r) {
      return "watchdog";
    }
    return "other";
  }
  var rSp;
  var Pde;
  var Ode;
  var vTe = __lazy(() => {
    rSp = new Set(["UNABLE_TO_VERIFY_LEAF_SIGNATURE", "UNABLE_TO_GET_ISSUER_CERT", "UNABLE_TO_GET_ISSUER_CERT_LOCALLY", "CERT_SIGNATURE_FAILURE", "CERT_NOT_YET_VALID", "CERT_HAS_EXPIRED", "CERT_REVOKED", "CERT_REJECTED", "CERT_UNTRUSTED", "DEPTH_ZERO_SELF_SIGNED_CERT", "SELF_SIGNED_CERT_IN_CHAIN", "CERT_CHAIN_TOO_LONG", "PATH_LENGTH_EXCEEDED", "ERR_TLS_CERT_ALTNAME_INVALID", "HOSTNAME_MISMATCH", "ERR_TLS_HANDSHAKE_TIMEOUT", "ERR_SSL_WRONG_VERSION_NUMBER", "ERR_SSL_DECRYPTION_FAILED_OR_BAD_RECORD_MAC"]);
    Pde = new Set(["ECONNREFUSED", "ConnectionRefused", "ENOTFOUND", "ENETUNREACH", "ENETDOWN", "EHOSTUNREACH", "EHOSTDOWN", "EAI_AGAIN", "FailedToOpenSocket"]);
    Ode = new Set(["ECONNRESET", "EPIPE", "ConnectionClosed", "ETIMEDOUT", "ECONNABORTED", "StreamSuspended"]);
  });
  function mU(e) {
    return e.startsWith("API Error") || e.startsWith(`Please run /login \xB7 ${"API Error"}`) || e.startsWith("AWS credentials expired or invalid") || e.startsWith("AWS authentication failed");
  }
  function wTe(e) {
    if (!e.isApiErrorMessage) {
      return false;
    }
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return false;
    }
    return t.some(n => n.type === "text" && n.text.startsWith("Prompt is too long"));
  }
  function D4t(e) {
    let t = e.match(/prompt is too long[^0-9]*(\d+)\s*tokens?\s*>\s*(\d+)/i);
    return {
      actualTokens: t ? parseInt(t[1], 10) : undefined,
      limitTokens: t ? parseInt(t[2], 10) : undefined
    };
  }
  function dpt(e) {
    if (!wTe(e) || !e.errorDetails) {
      return;
    }
    let {
      actualTokens: t,
      limitTokens: n
    } = D4t(e.errorDetails);
    if (t === undefined || n === undefined) {
      return;
    }
    let r = t - n;
    return r > 0 ? r : undefined;
  }
  function Gha(e) {
    let {
      actualTokens: t,
      limitTokens: n,
      conversationTokensEstimate: r
    } = e;
    if (t === undefined || n === undefined) {
      return `${"Prompt is too long"} \xB7 this conversation is a single ` + "exchange and cannot be compacted \u2014 the request size comes mostly " + "from system prompt, tool definitions, or attachments.";
    }
    if (r >= t * 0.8) {
      return `${"Prompt is too long"} \xB7 the request is ~${t} tokens (limit ${n}) and this conversation's own content is most of it. A single-exchange conversation cannot be compacted; start with less content (smaller files or pasted text).`;
    }
    return `${"Prompt is too long"} \xB7 the request is ~${t} tokens (limit ${n}) but this conversation is only ~${r} tokens \u2014 the rest is system prompt, ` + "tool definitions, and attachment content. A single-exchange conversation cannot be compacted; reduce attached files/tools or start with less context.";
  }
  function uSp(e) {
    return e.includes("request_too_large") || zdo(e) !== undefined;
  }
  function Vha(e) {
    if (e.includes("request_too_large") || e.toLowerCase().includes("too much media")) {
      return new Set(["document", "image"]);
    }
    let t = zdo(e);
    return t ? new Set([t.kind]) : undefined;
  }
  function zdo(e) {
    let t = e.match(/messages[.[](\d+)[\].]+content[.[](\d+)[\].]+(?:tool_result[.[]content[.[]\d+[\].]+)?(image|document|pdf)/);
    if (t) {
      return {
        messageIdx: Number(t[1]),
        contentIdx: Number(t[2]),
        kind: t[3] === "image" ? "image" : "document"
      };
    }
    let n = e.toLowerCase();
    if (dSp.some(r => n.includes(r))) {
      return {
        kind: "image"
      };
    }
    if (pSp.some(r => n.includes(r))) {
      return {
        kind: "document"
      };
    }
    return;
  }
  function I$n(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return;
    }
    return zdo(e.message);
  }
  function P$n(e) {
    return e.isApiErrorMessage === true && e.errorDetails !== undefined && uSp(e.errorDetails);
  }
  function Kdo(e) {
    return e instanceof Error && e.message.toLowerCase().includes("prompt is too long");
  }
  function M4t(e) {
    return e instanceof Error && e.message.toLowerCase().includes("input length and `max_tokens` exceed context limit");
  }
  function Ydo(e) {
    return e instanceof Error && e.message.toLowerCase().includes("credit balance is too low");
  }
  function D$n(e) {
    return e instanceof Error && e.message.toLowerCase().includes("organization has been disabled");
  }
  function k$n() {
    let e = getAPIProvider();
    if (e === "firstParty") {
      if (isFirstPartyAnthropicBaseUrl()) {
        return ` If it persists, check ${"https://status.claude.com"}.`;
      }
      let t = process.env.ANTHROPIC_BASE_URL ?? "";
      return ` If it persists, check your inference gateway (${URL.parse(t)?.host || t}).`;
    }
    if (e === "anthropicAws") {
      return ` If it persists, check ${"https://status.claude.com"}.`;
    }
    return ` If it persists, check your ${THIRD_PARTY_PROVIDER_LABELS[e]} service status.`;
  }
  function Zdo() {
    let e = `max ${100} pages, ${formatFileSize(20971520)}`;
    return getIsNonInteractiveSession() ? `PDF too large (${e}). Try reading the file a different way (e.g., extract text with pdftotext).` : `PDF too large (${e}). Double press esc to go back and try again, or use pdftotext to convert to text first.`;
  }
  function epo() {
    return getIsNonInteractiveSession() ? "PDF is password protected. Try using a CLI tool to extract or convert the PDF." : "PDF is password protected. Please double press esc to edit your message and try again.";
  }
  function tpo() {
    return getIsNonInteractiveSession() ? "The PDF file was not valid. Try converting it to text first (e.g., pdftotext)." : "The PDF file was not valid. Double press esc to go back and try again with a different file.";
  }
  function A$n() {
    return getIsNonInteractiveSession() ? "Image was too large. Try resizing the image or using a different approach." : "Image was too large. Double press esc to go back and try again with a smaller image.";
  }
  function npo() {
    let e = `max ${formatFileSize(33554432)}`;
    return getIsNonInteractiveSession() ? `Request too large (${e}). Try with a smaller file.` : `Request too large (${e}). Double press esc to go back and try with a smaller file.`;
  }
  function mpt(e) {
    let t = e === "document" ? "a document" : "an image";
    let n = getIsNonInteractiveSession() ? "Re-read the file with a different approach if you still need it." : "Double press esc to edit your message, or re-read the file if you still need it.";
    return `${"API Error"}: ${t} in the conversation could not be processed and was removed. ${n}`;
  }
  function _Sp() {
    return getIsNonInteractiveSession() ? "Your account does not have access to Claude. Please login again or contact your administrator." : "OAuth token revoked \xB7 Please run /login";
  }
  function bSp() {
    return "Your organization has disabled Claude subscription access for Claude Code \xB7 Use an Anthropic API key instead, or ask your admin to enable access";
  }
  function $ha() {
    return st(process.env.CLAUDE_CODE_REMOTE);
  }
  function SSp(e, t, n) {
    try {
      let r = -1;
      for (let u = 0; u < n.length; u++) {
        let d = n[u];
        if (!d) {
          continue;
        }
        let p = d.message.content;
        if (Array.isArray(p)) {
          for (let m of p) {
            if (m.type === "tool_use" && "id" in m && m.id === e) {
              r = u;
              break;
            }
          }
        }
        if (r !== -1) {
          break;
        }
      }
      let o = -1;
      for (let u = 0; u < t.length; u++) {
        let d = t[u];
        if (!d) {
          continue;
        }
        if (d.type === "assistant" && "message" in d) {
          let p = d.message.content;
          if (Array.isArray(p)) {
            for (let m of p) {
              if (m.type === "tool_use" && "id" in m && m.id === e) {
                o = u;
                break;
              }
            }
          }
        }
        if (o !== -1) {
          break;
        }
      }
      let s = [];
      for (let u = r + 1; u < n.length; u++) {
        let d = n[u];
        if (!d) {
          continue;
        }
        let p = d.message.content;
        if (Array.isArray(p)) {
          for (let m of p) {
            let f = d.message.role;
            if (m.type === "tool_use" && "id" in m) {
              s.push(`${f}:tool_use:${m.id}`);
            } else if (m.type === "tool_result" && "tool_use_id" in m) {
              s.push(`${f}:tool_result:${m.tool_use_id}`);
            } else if (m.type === "text") {
              s.push(`${f}:text`);
            } else if (m.type === "thinking") {
              s.push(`${f}:thinking`);
            } else if (m.type === "image") {
              s.push(`${f}:image`);
            } else {
              s.push(`${f}:${m.type}`);
            }
          }
        } else if (typeof p === "string") {
          s.push(`${d.message.role}:string_content`);
        }
      }
      let i = [];
      for (let u = o + 1; u < t.length; u++) {
        let d = t[u];
        if (!d) {
          continue;
        }
        switch (d.type) {
          case "user":
          case "assistant":
            {
              if ("message" in d) {
                let p = d.message.content;
                if (Array.isArray(p)) {
                  for (let m of p) {
                    let f = d.message.role;
                    if (m.type === "tool_use" && "id" in m) {
                      i.push(`${f}:tool_use:${m.id}`);
                    } else if (m.type === "tool_result" && "tool_use_id" in m) {
                      i.push(`${f}:tool_result:${m.tool_use_id}`);
                    } else if (m.type === "text") {
                      i.push(`${f}:text`);
                    } else if (m.type === "thinking") {
                      i.push(`${f}:thinking`);
                    } else if (m.type === "image") {
                      i.push(`${f}:image`);
                    } else {
                      i.push(`${f}:${m.type}`);
                    }
                  }
                } else if (typeof p === "string") {
                  i.push(`${d.message.role}:string_content`);
                }
              }
              break;
            }
          case "attachment":
            if ("attachment" in d) {
              i.push(`attachment:${d.attachment.type}`);
            }
            break;
          case "system":
            if ("subtype" in d) {
              i.push(`system:${d.subtype}`);
            }
            break;
          case "progress":
            if ("progress" in d && d.progress && typeof d.progress === "object" && "type" in d.progress) {
              i.push(`progress:${d.progress.type ?? "unknown"}`);
            } else {
              i.push("progress:unknown");
            }
            break;
        }
      }
      let a = u => {
        if (!u) {
          return "<none>";
        }
        let d = u.message.content;
        if (!Array.isArray(d)) {
          return `${u.message.role}:string`;
        }
        return `${u.message.role}:[${d.map(p => p.type === "tool_use" ? `tool_use:${p.id}` : p.type === "tool_result" ? `tool_result:${p.tool_use_id}` : p.type).join(",")}]`;
      };
      let l = 0;
      let c = 0;
      for (let u of n) {
        let d = u.message.content;
        if (!Array.isArray(d)) {
          continue;
        }
        for (let p of d) {
          if (p.type === "tool_use" && p.id === e) {
            l++;
          }
          if (p.type === "tool_result" && p.tool_use_id === e) {
            c++;
          }
        }
      }
      logEvent("tengu_tool_use_tool_result_mismatch_error", {
        toolUseId: br(e),
        normalizedSequence: s.join(", "),
        preNormalizedSequence: i.join(", "),
        normalizedMessageCount: n.length,
        originalMessageCount: t.length,
        normalizedToolUseIndex: r,
        originalToolUseIndex: o,
        offendingMessageBlocks: a(n[r]),
        followingMessageBlocks: r === -1 ? "<none>" : a(n[r + 1]),
        toolUseOccurrences: l,
        toolResultOccurrences: c
      });
    } catch (r) {}
  }
  function zha(e) {
    return typeof e === "object" && e !== null && "content" in e && "model" in e && "usage" in e && Array.isArray(e.content) && typeof e.model === "string" && typeof e.usage === "object";
  }
  function F$n(e) {
    return !!wI && e instanceof Ho && e.status === 400 && e.message.includes(wI.header) && e.message.includes("anthropic-beta");
  }
  function rpo(e) {
    return e instanceof Ho && e.status === 400 && (e.message.includes("Advisor tool result content could not be processed") || e.message.includes("found in advisor_tool_result blocks"));
  }
  function N4t(e) {
    return e instanceof Ho && e.status === 400 && e.message.includes("cannot be used as an advisor when the request model is");
  }
  function opo(e) {
    return e instanceof Ho && e.status === 400 && e.message.includes(g_e.header) && e.message.includes("anthropic-beta");
  }
  function spo(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return false;
    }
    let t = e.message;
    if (t.includes(h_e.header)) {
      return true;
    }
    return t.includes("evict_on_complete") && t.includes("beta");
  }
  function Kha(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return;
    }
    let t = e.message;
    if (t.includes("`server-side-fallback-") && t.includes("anthropic-beta")) {
      return "beta_header";
    }
    if (/does not support the `fallbacks?` parameter/.test(t)) {
      return "unsupported_primary";
    }
    if (/The `fallbacks?` parameter is not supported/.test(t)) {
      return "unsupported_primary";
    }
    if (t.includes("is not a valid fallback target for")) {
      return "invalid_target";
    }
    if (t.includes("`fallback` and `fallbacks` cannot both be set")) {
      return "param_shape";
    }
    if (/`fallbacks?(\[\d+\])?\.[a-z_]+`?/.test(t)) {
      return "param_shape";
    }
    if (/target model '[^']*' is not compatible with/.test(t)) {
      return "param_shape";
    }
    if (t.includes("server-side fallback is not supported")) {
      return "param_shape";
    }
    if (/\bfallbacks?\.(messages|stream|fallback)\b is not supported/.test(t)) {
      return "param_shape";
    }
    if (/\bfallbacks?(\[\d+\])?: unknown field/.test(t)) {
      return "param_shape";
    }
    if (t.includes("Extra inputs are not permitted") && /\bfallbacks?(\[\d+\])?((\.|\s*->\s*)\w+)*\s*:/.test(t)) {
      return "extra_forbidden";
    }
    return;
  }
  function Yha(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return;
    }
    let t = e.message;
    if (t.includes("fallback-credit-") && (t.includes("anthropic-beta") || t.includes("anthropic_beta"))) {
      return "credit_beta_header";
    }
    if (t.includes("fallback_credit_token: invalid or malformed")) {
      return "credit_malformed";
    }
    if (t.includes("fallback_credit_token: does not belong to this organization")) {
      return "credit_wrong_org";
    }
    if (t.includes("fallback_credit_token: has expired")) {
      return "credit_expired";
    }
    if (t.includes("fallback_credit_token: is not valid for model")) {
      return "credit_invalid_model";
    }
    if (t.includes("Extra inputs are not permitted") && /\bfallback_credit_token\s*:/.test(t)) {
      return "credit_extra_forbidden";
    }
    if (/\bfallback_credit_token\s*:/.test(t)) {
      return "credit_other";
    }
    return;
  }
  function U$n(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return false;
    }
    let t = e.message;
    if (t.includes(BY.header) && t.includes("anthropic-beta")) {
      return true;
    }
    if (t.includes("Unexpected role") && t.includes("input message role")) {
      return true;
    }
    return t.includes("not supported") && /role .{0,2}system/i.test(t);
  }
  function ipo(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return false;
    }
    let t = e.message.toLowerCase().replaceAll("`", "");
    if (t.includes("signature in thinking block")) {
      return true;
    }
    if (t.includes("thinking.signature") && t.includes("field required")) {
      return true;
    }
    return (t.includes("thinking block") || t.includes("redacted_thinking")) && (t.includes("cannot be modified") || t.includes("invalid signature"));
  }
  function apo(e) {
    if (!(e instanceof Ho) || e.status !== 400) {
      return null;
    }
    let t = /thinking\.type[^a-z]{1,8}(enabled|adaptive)[^]*?not supported/i.exec(e.message) ?? /\b(adaptive) thinking is not supported/i.exec(e.message);
    return t?.[1] ? t[1].toLowerCase() : null;
  }
  function B$n(e, t, n) {
    let r = ESp(e, t, n);
    if (e instanceof Ho && typeof e.status === "number") {
      r.apiErrorStatus = e.status;
    }
    let o = n?.requestId || (e instanceof Ho ? e.requestID || e.error?.request_id : undefined);
    if (o) {
      r.requestId = o;
    }
    return r;
  }
  function ESp(e, t, n) {
    if (e instanceof x7 || e instanceof ik && e.message.toLowerCase().includes("timeout")) {
      return Ml({
        content: "Request timed out",
        error: "server_error"
      });
    }
    if (e instanceof ipt || e instanceof Y2) {
      return Ml({
        content: A$n(),
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Error && e.message.includes("Opus is experiencing high load, please use /model to switch to Sonnet")) {
      return Ml({
        content: "Opus is experiencing high load, please use /model to switch to Sonnet",
        error: "rate_limit"
      });
    }
    if (e instanceof Error && e.message.includes("Fable is experiencing high load, please use /model to switch to Sonnet")) {
      return Ml({
        content: "Fable is experiencing high load, please use /model to switch to Sonnet",
        error: "rate_limit"
      });
    }
    if (e instanceof Ho && e.status === 429) {
      let s = apt(isClaudeAISubscriber());
      let i = Iha(e);
      let a = qdo(e);
      let l = s && isFableFamilyOrPinnedModel(t) && (i?.rateLimitType === "seven_day_overage_included" || a.errorCode === "credits_required");
      if (s && i && !l) {
        let f = $do(i, t);
        if (f) {
          return Ml({
            content: f,
            error: "rate_limit"
          });
        }
        return Ml({
          content: "No response requested.",
          error: "rate_limit"
        });
      }
      if (s && Vdo(e.message) && !isLongContext1mCreditsBlocked()) {
        setLongContext1mCreditsBlocked(true);
        logEvent("tengu_1m_credits_clamp_activated", {});
      }
      if (l) {
        let f = e.headers?.get?.("anthropic-ratelimit-unified-overage-disabled-reason") ?? a.overageDisabledReason ?? getGlobalConfig().cachedExtraUsageDisabledReason;
        let h = i?.rateLimitType === "seven_day_overage_included";
        return Ml({
          content: vSp(f, h),
          error: "rate_limit",
          errorDetails: e.message
        });
      }
      if (s && Vdo(e.message)) {
        let f = getIsNonInteractiveSession() ? "turn on usage credits at claude.ai/settings/usage, or use --model to switch to standard context" : "run /usage-credits to turn them on, or /model to switch to standard context";
        return Ml({
          content: `${"API Error"}: Usage credits required for 1M context \xB7 ${f}`,
          error: "rate_limit",
          errorDetails: e.message
        });
      }
      let c = e.message.replace(/^429\s+/, "");
      let u;
      try {
        let f = qt(c);
        let h = f?.error?.message ?? f?.message;
        if (typeof h === "string") {
          u = h;
        }
      } catch {}
      let d = u || c;
      if (s && e.headers?.get?.("anthropic-ratelimit-unified-overage-disabled-reason")) {
        return Ml({
          content: d,
          error: "rate_limit"
        });
      }
      let p = s ? "Server is temporarily limiting requests (not your usage limit)" : "Request rejected (429)";
      let m = `this may be a temporary capacity issue.${k$n()}`;
      return Ml({
        content: `${"API Error"}: ${p} \xB7 ${d || m}`,
        error: "rate_limit"
      });
    }
    if (Kdo(e) || M4t(e)) {
      return Ml({
        content: "Prompt is too long",
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Error && /maximum of \d+ PDF pages/.test(e.message)) {
      return Ml({
        content: Zdo(),
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Error && e.message.includes("The PDF specified is password protected")) {
      return Ml({
        content: epo(),
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Error && e.message.includes("The PDF specified was not valid")) {
      return Ml({
        content: tpo(),
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("image exceeds") && e.message.includes("maximum")) {
      return Ml({
        content: A$n(),
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("image dimensions exceed") && e.message.includes("many-image")) {
      return Ml({
        content: getIsNonInteractiveSession() ? "An image in the conversation exceeds the dimension limit for many-image requests (2000px). Start a new session with fewer images." : "An image in the conversation exceeds the dimension limit for many-image requests (2000px). Run /compact to remove old images from context, or start a new session.",
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (N4t(e)) {
      let s = getIsNonInteractiveSession() ? "change or unset the advisorModel setting (or the --advisor flag)" : "run /advisor to change or disable the advisor";
      return Ml({
        content: `${"API Error"}: ${e.message.replace(/^400\s+/, "")} \xB7 The configured advisor model is not compatible with this request model \u2014 ${s}`,
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    {
      let s = I$n(e);
      if (s && e instanceof Error) {
        return Ml({
          content: mpt(s.kind),
          error: "invalid_request",
          errorDetails: e.message
        });
      }
    }
    if (F$n(e)) {
      return Ml({
        content: "Auto mode is unavailable for your plan",
        error: "invalid_request"
      });
    }
    if (e instanceof Ho && e.status === 413) {
      if (e.message.toLowerCase().includes("context window")) {
        return Ml({
          content: "Prompt is too long",
          error: "invalid_request",
          errorDetails: e.message
        });
      }
      return Ml({
        content: npo(),
        error: "invalid_request",
        errorDetails: `request_too_large: ${e.message}`
      });
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("`tool_use` ids were found without `tool_result` blocks immediately after")) {
      if (n?.messages && n?.messagesForAPI) {
        let s = e.message.match(/toolu_[A-Za-z0-9_]+/);
        let i = s ? s[0] : null;
        if (i) {
          SSp(i, n.messages, n.messagesForAPI);
        }
      }
      {
        let i = getIsNonInteractiveSession() ? "" : " Run /rewind to recover the conversation.";
        return Ml({
          content: "API Error: 400 due to tool use concurrency issues." + i,
          error: "invalid_request"
        });
      }
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("unexpected `tool_use_id` found in `tool_result`")) {
      logEvent("tengu_unexpected_tool_result", {});
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("`tool_use` ids must be unique")) {
      logEvent("tengu_duplicate_tool_use_id", {});
      let s = getIsNonInteractiveSession() ? "" : " Run /rewind to recover the conversation.";
      return Ml({
        content: `API Error: 400 duplicate tool_use ID in conversation history.${s}`,
        error: "invalid_request",
        errorDetails: e.message
      });
    }
    if (isClaudeAISubscriber() && e instanceof Ho && e.status === 400 && e.message.toLowerCase().includes("invalid model name") && (isNonCustomOpusModel(getCanonicalName(t)) || t === "opus")) {
      return Ml({
        content: "Claude Opus is not available with the Claude Pro plan. If you have updated your subscription plan recently, run /logout and /login for the plan to take effect.",
        error: "invalid_request"
      });
    }
    if (Ydo(e)) {
      return Ml({
        content: "Credit balance is too low",
        error: "billing_error"
      });
    }
    if (e instanceof Ho && e.status === 400 && D$n(e)) {
      let {
        source: s
      } = getAnthropicApiKeyWithSource();
      if (s === "ANTHROPIC_API_KEY" && process.env.ANTHROPIC_API_KEY && !isClaudeAISubscriber()) {
        let i = hasStoredOAuthToken();
        return Ml({
          error: "invalid_request",
          content: i ? "Your ANTHROPIC_API_KEY belongs to a disabled organization \xB7 Unset the environment variable to use your subscription instead" : "Your ANTHROPIC_API_KEY belongs to a disabled organization \xB7 Update or unset the environment variable"
        });
      }
    }
    if (e instanceof Error && e.message.toLowerCase().includes("x-api-key")) {
      if ($ha()) {
        return Ml({
          error: "authentication_failed",
          content: "Authentication error \xB7 This may be a temporary network issue, please try again"
        });
      }
      if (getAPIProvider() === "gateway") {
        return Ml({
          error: "invalid_request",
          content: "Authentication error \xB7 The gateway could not authenticate with its upstream provider \u2014 contact your gateway administrator"
        });
      }
      let {
        source: s
      } = getAnthropicApiKeyWithSource();
      return Ml({
        error: "authentication_failed",
        content: s === "ANTHROPIC_API_KEY" || s === "apiKeyHelper" ? "Invalid API key \xB7 Fix external API key" : "Not logged in \xB7 Please run /login"
      });
    }
    if (e instanceof Ho && e.status === 403 && e.message.includes("OAuth token has been revoked")) {
      return Ml({
        error: "authentication_failed",
        content: _Sp()
      });
    }
    if (e instanceof Ho && (e.status === 401 || e.status === 403) && e.message.includes("OAuth authentication is currently not allowed for this organization")) {
      return Ml({
        error: "oauth_org_not_allowed",
        content: bSp()
      });
    }
    if (e instanceof Ho && e.status === 403 && e.message.toLowerCase().includes("api key authentication is disabled")) {
      let {
        source: s
      } = getAnthropicApiKeyWithSource();
      if (s === "ANTHROPIC_API_KEY" && Me.ANTHROPIC_API_KEY) {
        return Ml({
          error: "invalid_request",
          content: hasStoredOAuthToken() ? "Your organization has disabled API key authentication \xB7 Unset ANTHROPIC_API_KEY to use your claude.ai account instead" : "Your organization has disabled API key authentication \xB7 Unset ANTHROPIC_API_KEY and run /login to sign in with your claude.ai account"
        });
      }
      if (s === "apiKeyHelper") {
        return Ml({
          error: "invalid_request",
          content: "Your organization has disabled API key authentication \xB7 Unset the apiKeyHelper setting and run /login to sign in with your claude.ai account"
        });
      }
      if (s === "/login managed key") {
        return Ml({
          error: "authentication_failed",
          content: "Your organization has disabled API key authentication \xB7 Run /login to sign in with your claude.ai account"
        });
      }
    }
    if (e instanceof Ho && (e.status === 401 || e.status === 403)) {
      if ($ha()) {
        return Ml({
          error: "authentication_failed",
          content: "Authentication error \xB7 This may be a temporary network issue, please try again"
        });
      }
      let s = upt(e);
      let i = getAPIProvider();
      let a = (i === "bedrock" || i === "anthropicAws" || i === "mantle") && (!isAwsAuthRefreshFromProjectSettings() || isProjectScopeTrustAccepted()) ? getConfiguredAwsAuthRefresh() : undefined;
      if (a) {
        let l = getProviderForModel(t);
        let c = e.status === 401 && (l === "anthropicAws" || l === "mantle");
        let u = c ? "AWS credentials expired or invalid" : "AWS authentication failed";
        let d = c ? "" : " \xB7 if credentials are current, check AWS permissions and model access";
        return Ml({
          error: "authentication_failed",
          content: getIsNonInteractiveSession() ? `${u} \xB7 run \`${a}\` and retry${d} \xB7 ${"API Error"}: ${s}` : `${u} \xB7 run /login and select "${THIRD_PARTY_PROVIDER_LABELS.anthropicAws} \xB7 refresh credentials", or run \`${a}\` in another terminal${d} \xB7 ${"API Error"}: ${s}`
        });
      }
      return Ml({
        error: "authentication_failed",
        content: getIsNonInteractiveSession() ? `Failed to authenticate. ${"API Error"}: ${s}` : `Please run /login \xB7 ${"API Error"}: ${s}`
      });
    }
    if (st(process.env.CLAUDE_CODE_USE_BEDROCK) && e instanceof Error && e.message.toLowerCase().includes("model id")) {
      let s = Hha();
      let i = jha(t);
      return Ml({
        content: i ? `${"API Error"} (${t}): ${e.message}.${s ? ` Try ${s} to switch to ${i}.` : ` Try switching to ${i}.`}` : `${"API Error"} (${t}): ${e.message}.${s ? ` Run ${s} to pick a different model.` : ""}`,
        error: "model_not_found"
      });
    }
    if (e instanceof Ho && e.status === 404) {
      let s = Hha();
      let i = jha(t);
      return Ml({
        content: i ? `The model ${t} is not available on your ${getAPIProvider()} deployment. ${s ? `Try ${s} to switch to ${i}` : `Try switching to ${i}`}, or ask your admin to enable this model.` : `There's an issue with the selected model (${t}). It may not exist or you may not have access to it.${s ? ` Run ${s} to pick a different model.` : ""}`,
        error: "model_not_found"
      });
    }
    let r = k$n();
    if (e instanceof Error && e.message.includes("Repeated 529 Overloaded errors")) {
      return Ml({
        content: `${"API Error"}: ${"Repeated 529 Overloaded errors"}. The API is at capacity \u2014 this is usually temporary. Try again in a moment.${r}`,
        error: "server_error"
      });
    }
    if (e instanceof Ho && typeof e.status === "number" && e.status >= 500) {
      let s = upt(e).replace(/[.!?\u2026]+$/, "");
      return Ml({
        content: `${"API Error"}: ${s}. This is a server-side issue, usually temporary \u2014 try again in a moment.${r}`,
        error: "server_error"
      });
    }
    if (e instanceof ik) {
      return Ml({
        content: `${"API Error"}: ${upt(e)}`,
        error: "server_error"
      });
    }
    if (e instanceof Ho) {
      return Ml({
        content: `${"API Error"}: ${upt(e)}`,
        error: "unknown"
      });
    }
    let o = f$(e);
    if (o && (Ode.vZc(o.code) || Pde.vZc(o.code))) {
      return Ml({
        content: `${"API Error"}: Connection to the API was lost (${o.code}). This is usually temporary \u2014 try again.`,
        error: "server_error"
      });
    }
    if (e instanceof Error) {
      return Ml({
        content: `${"API Error"}: ${e.message}`,
        error: "unknown"
      });
    }
    return Ml({
      content: "API Error",
      error: "unknown"
    });
  }
  function Hha() {
    if (!getIsNonInteractiveSession()) {
      return "/model";
    }
    return NN() === "sdk-cli" ? "--model" : undefined;
  }
  function jha(e) {
    if (usesFirstPartyModelIds()) {
      return;
    }
    let t = e.toLowerCase();
    if (t.includes("fable-5") || t.includes("fable_5")) {
      return Me.ANTHROPIC_DEFAULT_OPUS_MODEL ?? rp().opus48;
    }
    if (t.includes("opus-4-8") || t.includes("opus_4_8")) {
      return rp().opus47;
    }
    if (t.includes("opus-4-7") || t.includes("opus_4_7")) {
      return rp().opus46;
    }
    if (t.includes("opus-4-6") || t.includes("opus_4_6")) {
      return rp().opus45;
    }
    if (t.includes("opus-4-5") || t.includes("opus_4_5")) {
      return rp().opus41;
    }
    if (t.includes("sonnet-5") || t.includes("sonnet_5")) {
      return rp().sonnet46;
    }
    if (t.includes("sonnet-4-6") || t.includes("sonnet_4_6")) {
      return rp().sonnet45;
    }
    if (t.includes("sonnet-4-5") || t.includes("sonnet_4_5")) {
      return rp().sonnet40;
    }
    return;
  }
  function $$n(e) {
    if (e instanceof Error && e.message === "Request was aborted.") {
      return "aborted";
    }
    if (e instanceof x7 || e instanceof ik && e.message.toLowerCase().includes("timeout") || e instanceof Error && e.message.startsWith("Stream idle timeout")) {
      return "api_timeout";
    }
    if (e instanceof Error && e.message.includes("Repeated 529 Overloaded errors")) {
      return "repeated_529";
    }
    if (e instanceof Error && (e.message.includes("Opus is experiencing high load, please use /model to switch to Sonnet") || e.message.includes("Fable is experiencing high load, please use /model to switch to Sonnet"))) {
      return "capacity_off_switch";
    }
    if (e instanceof Ho && e.status === 429) {
      return "rate_limit";
    }
    if (e instanceof Ho && (e.status === 529 || e.message?.includes('"type":"overloaded_error"'))) {
      return "server_overload";
    }
    if (e instanceof Error && (e.message.toLowerCase().includes(("Prompt is too long").toLowerCase()) || M4t(e))) {
      return "prompt_too_long";
    }
    if (e instanceof Error && /maximum of \d+ PDF pages/.test(e.message)) {
      return "pdf_too_large";
    }
    if (e instanceof Error && e.message.includes("The PDF specified is password protected")) {
      return "pdf_password_protected";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("image exceeds") && e.message.includes("maximum")) {
      return "image_too_large";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("image dimensions exceed") && e.message.includes("many-image")) {
      return "image_too_large";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("Could not process image")) {
      return "image_unprocessable";
    }
    if (e instanceof Ho && e.status === 413) {
      return e.message.toLowerCase().includes("context window") ? "prompt_too_long" : "request_too_large";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("`tool_use` ids were found without `tool_result` blocks immediately after")) {
      return "tool_use_mismatch";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("unexpected `tool_use_id` found in `tool_result`")) {
      return "unexpected_tool_result";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("`tool_use` ids must be unique")) {
      return "duplicate_tool_use_id";
    }
    if (e instanceof Ho && e.status === 400 && e.message.toLowerCase().includes("invalid model name")) {
      return "invalid_model";
    }
    if (e instanceof Ho && e.status === 404 && e.message.includes("not_found_error") && e.message.includes('"model: ')) {
      return "model_not_found";
    }
    if (e instanceof Ho && e.status === 400 && /invalid `?signature`? in `?thinking`? block/i.test(e.message)) {
      return "invalid_thinking_signature";
    }
    if (e instanceof Ho && e.status === 400 && (e.message.includes("text content blocks must be non-empty") || e.message.includes("text content blocks must contain non-whitespace text"))) {
      return "empty_text_block";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("diagnostics.previous_message_id")) {
      return "previous_message_id_invalid";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes(".tool_use_id") && e.message.includes("String should match pattern")) {
      return "tool_use_id_invalid";
    }
    if (e instanceof Ho && e.status === 400 && e.message.includes("Grammar compilation")) {
      return "grammar_compile_error";
    }
    if (e instanceof Ho && e.status === 400 && e.message.toLowerCase().includes("request body is not valid json")) {
      return "request_body_invalid_json";
    }
    if (e instanceof Error && e.message.toLowerCase().includes(("Credit balance is too low").toLowerCase())) {
      return "credit_balance_low";
    }
    if (e instanceof Error && (e.message.toLowerCase().includes("x-api-key") || e.message.toLowerCase().includes("not a valid api key for this workspace"))) {
      return "invalid_api_key";
    }
    if (e instanceof Ho && e.status === 403 && e.message.includes("OAuth token has been revoked")) {
      return "token_revoked";
    }
    if (e instanceof Ho && (e.status === 401 || e.status === 403) && e.message.includes("OAuth authentication is currently not allowed for this organization")) {
      return "oauth_org_not_allowed";
    }
    if (e instanceof Ho && (e.status === 401 || e.status === 403)) {
      return "auth_error";
    }
    if (st(process.env.CLAUDE_CODE_USE_BEDROCK) && e instanceof Error && e.message.toLowerCase().includes("model id")) {
      return "bedrock_model_access";
    }
    if (e instanceof Error && e.message.includes("Output blocked by content filtering policy")) {
      return "output_content_filtered";
    }
    if (e instanceof WorkloadIdentityError) {
      return "wif_credential_error";
    }
    if (e instanceof Error && e.message.toLowerCase().includes("domains are not accessible to our user agent")) {
      return "webfetch_domain_blocked";
    }
    if (e instanceof Error) {
      let n = e.message.toLowerCase();
      if (D$n(e)) {
        return "org_disabled";
      }
      if (n.includes("updated our consumer terms")) {
        return "terms_not_accepted";
      }
      if (n.includes("web search is not enabled for this organization") || /is not enabled for (this|your) organization/.test(n)) {
        return "feature_not_enabled_for_org";
      }
      if (/reached your specified[\w\s-]*?usage limits/.test(n)) {
        return "usage_cap_reached";
      }
    }
    if (U$n(e)) {
      return "system_role_unsupported";
    }
    if (e instanceof Ho && e.status === 400 && /`?(thinking|redacted_thinking)`?\s+(or\s+`?redacted_thinking`?\s+)?blocks?\s+.{0,60}cannot be modified/i.test(e.message)) {
      return "thinking_blocks_modified";
    }
    if (e instanceof Ho) {
      let n = e.status;
      if (n >= 500) {
        return "server_error";
      }
      if (n >= 400) {
        return "client_error";
      }
    }
    if (e instanceof ik) {
      if (f$(e)?.isSSLError) {
        return "ssl_cert_error";
      }
      return "connection_error";
    }
    let t = f$(e);
    if (t && (Ode.vZc(t.code) || Pde.vZc(t.code))) {
      return "connection_error";
    }
    return "unknown";
  }
  function H$n(e) {
    if (e.status === 529 || e.message?.includes('"type":"overloaded_error"')) {
      return "overloaded";
    }
    if (e.status === 429) {
      return "rate_limit";
    }
    if (e.status === 401 || e.status === 403) {
      return "authentication_failed";
    }
    if (e.status !== undefined && e.status >= 408) {
      return "server_error";
    }
    return "unknown";
  }
  function q9e(e, t, n, r) {
    if (e !== "refusal") {
      return;
    }
    let o = t?.explanation?.trimEnd() ?? null;
    logEvent("tengu_refusal_api_response", {
      has_explanation: Boolean(o),
      category: t?.category ? spt(t.category) : undefined,
      request_id: br(n) || undefined
    });
    let s = 400;
    let i = o && o.length > s ? o.slice(0, s).trimEnd() + "\u2026" : o;
    let a = i ? ` ${i}${/[.!?\u2026]$/.test(i) ? "" : "."}` : "";
    let l = r != null && sha(r) ? renderModelName(r) : undefined;
    let c;
    if (l !== undefined) {
      let p = getIsNonInteractiveSession();
      let m = p ? "Try rephrasing the request in a new session or change your model." : "Double press esc to edit your last message, or try a different model with /model.";
      let f = p ? `Learn more: ${S$n(r)}` : rpt(r);
      let h = opt(t?.category) ? `${l}'s safeguards flagged this message (https://www.anthropic.com/legal/aup). ${uha}` : `${l}'s safeguards flagged this message (https://www.anthropic.com/legal/aup). This sometimes happens with safe, normal conversations.`;
      c = `${"API Error"}: ${h} Claude Code can't respond to this request with ${l}.

${m}

${f}`;
    } else {
      let p = getIsNonInteractiveSession();
      let m = p ? "Try rephrasing the request in a new session or change your model." : "Please double press esc to edit your last message or start a new session for Claude Code to assist with a different task.";
      if (t?.category === "cyber" && usesFirstPartyModelIds()) {
        let f = p ? `Learn more: ${S$n(r)}` : rpt(r);
        let h = r != null ? renderModelName(r) : "This model";
        c = `${"API Error"}: ${h}'s safeguards flagged this message for a cybersecurity topic. If your work requires this access, you can apply for an exemption: ${aha(t.explanation)}

${m}

${f}`;
      } else {
        c = `${"API Error"}: Claude Code is unable to respond to this request, which appears to violate our Usage Policy (https://www.anthropic.com/legal/aup).${a} ` + m;
      }
    }
    let u = n ? `

Request ID: ${n}` : "";
    let d = Ml({
      content: c + u,
      error: "invalid_request"
    });
    d.requestId = n ?? undefined;
    d.message.stop_reason = "refusal";
    d.message.stop_details = t ?? null;
    return d;
  }
  function vSp(e, t) {
    let n = t ? "You've reached your Fable 5 limit." : "Fable 5 requires usage credits.";
    switch (e) {
      case "out_of_credits":
        return av() ? "You're out of usage credits. Run /usage-credits to keep using Fable 5 or /model to switch models." : "You're out of usage credits. /model to switch models.";
      case "org_spend_cap_reached":
      case "org_level_disabled_until":
        return av() ? "You've hit your monthly spend limit. Run /usage-credits to manage your limit and keep using Fable 5 or switch models to continue this chat." : "You've hit your monthly spend limit. /model to switch models.";
      case "org_level_disabled":
      case "org_service_level_disabled":
      case "seat_tier_level_disabled":
      case "seat_tier_zero_credit_limit":
      case "member_level_disabled":
      case "member_zero_credit_limit":
      case "group_zero_credit_limit":
        return av() ? `${n} Run /usage-credits to continue or switch models with /model.` : `${n} /model to switch models.`;
      default:
        return av() ? `${n} Run /usage-credits to continue or switch models with /model.` : `${n} /model to switch models.`;
    }
  }
  function Vdo(e) {
    return e.includes("Extra usage is required for long context") || e.includes("Usage credits are required for long context");
  }
  function Jha(e) {
    return isLongContext1mCreditsBlocked() && e.isApiErrorMessage === true && e.errorDetails !== undefined && Vdo(e.errorDetails);
  }
  var dSp;
  var pSp;
  var vO = __lazy(() => {
    CN();
    lte();
    KN();
    no();
    vF();
    ro();
    Eo();
    sne();
    Ds();
    LX();
    at();
    Ire();
    $A();
    pr();
    gn();
    cs();
    yG();
    v$n();
    Ot();
    B_();
    pU();
    k4t();
    vTe();
    dSp = ["could not process image", "image exceeds", "image dimensions exceed", "image does not match the provided media type", "image cannot be empty", "exceeds api limit", "images exceed the api limit", "unable to resize image", "unable to compress image", "image file is empty"];
    pSp = ["could not process pdf", "pdf pages", "the pdf specified was not valid", "the pdf specified is password protected", "pdf cannot be empty", "too much media"];
  });
  function j$n(e) {
    if (!isAxiosError(e)) {
      return null;
    }
    let n = e.response?.data?.error;
    if (n?.details?.error_visibility !== "user_facing") {
      return null;
    }
    return n.message ?? null;
  }
  async function q$n() {
    let e = vI();
    if (e) {
      e.isEnabled = true;
      await sleep(300);
      Pe("api_overage_enable");
      return true;
    }
    try {
      let t = await _s.post("/api/oauth/organizations/:orgUUID/setup_overage_billing", {
        org_monthly_spend_limit: 2000
      }, {
        auth: "teleport-org",
        timeout: 30000
      });
      if (!t.ok) {
        throw Error(`setup_overage_billing unavailable: ${t.reason}`);
      }
      let n = await _s.put("/api/oauth/organizations/:orgUUID/overage_spend_limit", {
        is_enabled: true
      }, {
        auth: "teleport-org"
      });
      if (!n.ok) {
        throw Error(`overage_spend_limit unavailable: ${n.reason}`);
      }
      Pe("api_overage_enable");
      return true;
    } catch (t) {
      if (L4t(t)) {
        logForDebugging(`overage setup failed: ${he(t)}`, {
          level: "error"
        });
      } else {
        Oe(t);
      }
      Ae("api_overage_enable", "request_failed");
      return false;
    }
  }
  async function W$n(e, t) {
    let n = vI();
    if (n) {
      n.spendLimitCents = e;
      await sleep(300);
      Pe("api_spend_limit_update");
      return {
        ok: true,
        disabledUntil: null,
        usedCredits: n.usedCents ?? 0
      };
    }
    try {
      let r = await _s.put("/api/oauth/organizations/:orgUUID/overage_spend_limit", {
        is_enabled: true,
        monthly_credit_limit: e,
        currency: t
      }, {
        auth: "teleport-org"
      });
      if (!r.ok) {
        throw Error(`overage_spend_limit unavailable: ${r.reason}`);
      }
      Pe("api_spend_limit_update");
      return {
        ok: true,
        disabledUntil: r.data?.disabled_until ?? null,
        usedCredits: r.data?.used_credits ?? null
      };
    } catch (r) {
      if (L4t(r)) {
        logForDebugging(`updateSpendLimit failed: ${he(r)}`, {
          level: "error"
        });
      } else {
        Oe(r);
      }
      Ae("api_spend_limit_update", "request_failed");
      return {
        ok: false,
        disabledUntil: null,
        usedCredits: null
      };
    }
  }
  async function Qha(e, t, n, r) {
    let o = vI();
    if (o) {
      o.autoReload = e;
      await sleep(300);
      Pe("api_auto_reload_update");
      return true;
    }
    try {
      let s = await _s.put("/api/oauth/organizations/:orgUUID/contracts/auto_reload_settings", {
        enabled: e,
        ...(t !== undefined && {
          threshold_in_minor_units: t
        }),
        ...(n !== undefined && {
          reload_to_in_minor_units: n
        }),
        currency: r
      }, {
        auth: "teleport-org",
        timeout: 30000
      });
      if (!s.ok) {
        throw Error(`auto_reload_settings unavailable: ${s.reason}`);
      }
      Pe("api_auto_reload_update");
      return true;
    } catch (s) {
      if (L4t(s)) {
        logForDebugging(`auto_reload_settings update failed: ${he(s)}`, {
          level: "error"
        });
      } else {
        Oe(s);
      }
      Ae("api_auto_reload_update", "request_failed");
      return false;
    }
  }
  async function fpt() {
    let e = vI();
    if (e) {
      Pe("api_prepaid_balance_fetch");
      return {
        amount: e.balanceCents,
        currency: e.currency,
        auto_reload_settings: {
          enabled: e.autoReload
        }
      };
    }
    try {
      let t = await _s.get("/api/oauth/organizations/:orgUUID/prepaid/credits", {
        auth: "teleport-org",
        timeout: 5000
      });
      if (!t.ok) {
        throw Error(`prepaid/credits unavailable: ${t.reason}`);
      }
      if (typeof t.data?.amount !== "number") {
        Et("api_prepaid_balance_fetch", "not_supported");
        return null;
      }
      Pe("api_prepaid_balance_fetch");
      return t.data;
    } catch (t) {
      if (L4t(t)) {
        logForDebugging(`prepaid balance fetch failed: ${he(t)}`, {
          level: "error"
        });
      } else {
        Oe(t);
      }
      Ae("api_prepaid_balance_fetch", "request_failed");
      return null;
    }
  }
  function Xha(e) {
    return e.map(([t, n], r) => {
      let o = Math.round(t * n / 100);
      return {
        id: `mock-${r}`,
        credit_minor_units: t,
        price_minor_units: t - o,
        discount_minor_units: o,
        local_credit_minor_units: t,
        local_price_minor_units: t - o
      };
    });
  }
  async function ega() {
    let e = vI();
    if (e) {
      Pe("api_bundles_fetch");
      return {
        bundles: wSp[e.bundlePreset ?? "default"],
        bundle_paid_this_month_minor_units: 0,
        bundle_monthly_cap_minor_units: null,
        purchases_reset_at: new Date().toISOString(),
        currency: e.currency,
        stripe_product_id: "prod_mock"
      };
    }
    try {
      let t = await _s.get("/api/oauth/organizations/:orgUUID/prepaid/bundles", {
        auth: "teleport-org",
        timeout: 5000
      });
      if (!t.ok) {
        throw Error(`prepaid/bundles unavailable: ${t.reason}`);
      }
      Pe("api_bundles_fetch");
      return t.data;
    } catch (t) {
      if (isAxiosError(t) && t.response?.status === 404) {
        Pe("api_bundles_fetch");
        return null;
      }
      if (L4t(t)) {
        logForDebugging(`getAvailableBundles failed: ${he(t)}`, {
          level: "error"
        });
      } else {
        Oe(t);
      }
      Et("api_bundles_fetch", "request_failed");
      return null;
    }
  }
  async function tga() {
    return vl("api_payment_method_fetch", async () => {
      let e = vI();
      if (e) {
        return e.paymentMethod;
      }
      let t = await _s.get("/api/oauth/organizations/:orgUUID/payment_method", {
        auth: "teleport-org",
        timeout: 5000
      });
      if (!t.ok) {
        throw Error(`payment_method unavailable: ${t.reason}`);
      }
      return t.data ?? null;
    });
  }
  async function nga(e) {
    return vl("api_credits_purchase", async () => {
      let t = vI();
      if (t) {
        if (await sleep(500), t.purchaseOutcome === "3ds") {
          return {
            payment_status: "requires_action",
            payment_intent_client_secret: "pi_mock_secret"
          };
        }
        if (t.purchaseOutcome === "poll") {
          t.pollCount = 0;
          return {
            payment_status: "pending_invoice",
            purchase_id: "mock-purchase-id"
          };
        }
        t.balanceCents += e.kind === "bundle" ? e.bundle.credit_minor_units : e.amountCents;
        return {
          payment_status: "success"
        };
      }
      let n = e.kind === "bundle" ? {
        amount: e.bundle.credit_minor_units,
        bundle_id: e.bundle.id,
        expected_price_minor_units: e.bundle.price_minor_units
      } : {
        amount: e.amountCents
      };
      let r = await _s.post("/api/oauth/organizations/:orgUUID/contracts/prepaid/credits", n, {
        auth: "teleport-org",
        timeout: 30000
      });
      if (!r.ok) {
        throw Error(`prepaid/credits purchase unavailable: ${r.reason}`);
      }
      return r.data;
    });
  }
  async function rga(e, t, n) {
    let r = vI();
    if (r) {
      if (r.taxBps === undefined) {
        Et("api_purchase_tax_preview", "no_rate");
        return null;
      }
      await sleep(200);
      Pe("api_purchase_tax_preview");
      return {
        tax_minor_units: Math.round(e * r.taxBps / 1e4),
        tax_rate_pct: r.taxBps / 100,
        tax_label: r.taxLabel ?? null
      };
    }
    if (!n) {
      Et("api_purchase_tax_preview", "no_product_id");
      return null;
    }
    try {
      let o = await _s.post("/api/oauth/organizations/:orgUUID/billing/tax_rate", {
        product_id: n,
        price: e,
        currency: t
      }, {
        auth: "teleport-org",
        timeout: 5000
      });
      if (!o.ok) {
        throw Error(`billing/tax_rate unavailable: ${o.reason}`);
      }
      let s = o.data.tax_rate;
      if (s == null) {
        Et("api_purchase_tax_preview", "no_rate");
        return null;
      }
      Pe("api_purchase_tax_preview");
      return {
        tax_minor_units: Math.round(e * s / 100),
        tax_rate_pct: s,
        tax_label: o.data.tax_label ?? null
      };
    } catch (o) {
      logForDebugging(`tax_rate preview unavailable: ${o}`);
      Ae("api_purchase_tax_preview", "request_failed");
      return null;
    }
  }
  async function oga(e) {
    let t = vI();
    if (t) {
      t.pollCount = (t.pollCount ?? 0) + 1;
      let r = t.pollCount >= 2 ? "paid" : "pending";
      return {
        purchase_id: e,
        status: r,
        stripe_payment_intent_client_secret: null
      };
    }
    let n = await _s.get(`/api/oauth/organizations/:orgUUID/prepaid/commits/${e}`, {
      auth: "teleport-org"
    });
    if (!n.ok) {
      throw Error(`prepaid/commits status unavailable: ${n.reason}`);
    }
    return n.data;
  }
  var L4t = e => M_(e, t => j$n(t) !== null || !isAxiosError(t));
  var Zha;
  var wSp;
  var hpt = __lazy(() => {
    je();
    dt();
    Rn();
    ln();
    pk();
    bg();
    jle();
    Zha = [2500, 5000, 7500, 15000].map(e => ({
      id: "",
      credit_minor_units: e,
      price_minor_units: e,
      discount_minor_units: 0,
      local_credit_minor_units: e,
      local_price_minor_units: e
    }));
    wSp = {
      default: Xha([[2500, 0], [5000, 0], [7500, 0], [15000, 0]]),
      discounted: Xha([[5000, 10], [25000, 20], [1e5, 30]])
    };
  });
  function sga(e) {
    return async function (n, r, o) {
      if (CSp(r)) {
        return xSp(e, n, r, o);
      }
      return RSp(e, n, r, o);
    };
  }
  function CSp(e) {
    return typeof e === "object" && e !== null && Symbol.asyncIterator in e;
  }
  async function RSp(e, t, n, r) {
    let o = t.payload().safeParse(n);
    if (!o.success) {
      return t.default;
    }
    let s;
    try {
      let {
        replied: a
      } = e.request({
        kind: t.kind,
        payload: o.data
      }, r);
      s = await a;
    } catch {
      return t.default;
    }
    if ("cancelled" in s) {
      return t.default;
    }
    let i = t.result().safeParse(s.result);
    return i.success ? i.data : t.default;
  }
  async function xSp(e, t, n, r) {
    let o = n[Symbol.asyncIterator]();
    let s = await o.next();
    if (s.done) {
      return t.default;
    }
    let i = t.payload().safeParse(s.value);
    if (!i.success) {
      o.return?.(undefined);
      return t.default;
    }
    let a = new AbortController();
    let l = () => a.abort();
    if (r?.signal) {
      if (r.signal.aborted) {
        a.abort();
      } else {
        r.signal.addEventListener("abort", l, {
          once: true
        });
      }
    }
    let {
      replied: c,
      update: u
    } = e.request({
      kind: t.kind,
      payload: i.data
    }, {
      signal: a.signal,
      queueBehind: r?.queueBehind
    });
    let d;
    (async () => {
      try {
        while (!a.signal.aborted) {
          let h = await o.next();
          if (h.done) {
            return;
          }
          if (a.signal.aborted) {
            return;
          }
          let g = t.payload().safeParse(h.value);
          if (!g.success) {
            continue;
          }
          u(g.data);
        }
      } catch (h) {
        d = h;
        a.abort();
      }
    })().catch(() => {});
    let m;
    try {
      m = await c;
    } finally {
      r?.signal?.removeEventListener("abort", l);
      o.return?.(undefined);
    }
    if (d !== undefined) {
      throw d;
    }
    if ("cancelled" in m) {
      return t.default;
    }
    let f = t.result().safeParse(m.result);
    return f.success ? f.data : t.default;
  }
  function iga(e) {
    if (e === undefined) {
      return false;
    }
    if (isSdkDialogHostActive() && !(getSdkSupportedDialogKinds() ?? []).includes(CTe.kind)) {
      return false;
    }
    return true;
  }
  function gpt(e, t) {
    return isFableFamilyOrPinnedModel(e) && !xfa(getCanonicalName(e)) && w4t() && iga(t);
  }
  function aga(e) {
    return e.isMainThread && iga(e.requestDialog);
  }
  function lga(e) {
    if (getMainLoopModelOverride() !== undefined) {
      return false;
    }
    if (Me.ANTHROPIC_MODEL) {
      return false;
    }
    if (getEffectiveSettingSource("model") !== "userSettings") {
      return false;
    }
    let t = getSettingsForSource("userSettings")?.model;
    if (t === undefined || !isFableFamilyOrPinnedModel(parseUserSpecifiedModel(t))) {
      return false;
    }
    updateSettingsForSource("userSettings", {
      model: e
    });
    return true;
  }
  async function G$n() {
    let e = vI();
    if (e) {
      cpt(e.isEnabled ? null : "overage_not_provisioned");
      return e.isEnabled ? "enabled" : "disabled";
    }
    let t = null;
    try {
      t = await Ide();
    } catch {
      return "unknown";
    }
    let n = t?.extra_usage;
    if (n?.is_enabled === true) {
      cpt(null);
      return "enabled";
    }
    if (w$n(n)) {
      cpt(n?.disabled_reason ?? null);
      return "blocked";
    }
    return n?.is_enabled === false ? "disabled" : "unknown";
  }
  async function cpo({
    skipLiveCheck: e = false
  } = {}) {
    if (!e) {
      let n = await G$n();
      if (n === "enabled" || n === "blocked") {
        return true;
      }
    }
    let t = await q$n();
    if (t) {
      cpt(null);
    }
    return t;
  }
  async function cga() {
    if (SDe(), !TDe()) {
      await G$n();
    }
    return Sdo();
  }
  var CTe;
  var ypt = __lazy(() => {
    at();
    hpt();
    ETe();
    pU();
    jle();
    pr();
    PV();
    Eo();
    CTe = {
      kind: "fable_overage_consent_prompt",
      payload: we(() => v.object({
        overagesEnabled: v.boolean(),
        balanceCents: v.number().nullable().optional(),
        currency: v.string().nullable().optional()
      })),
      result: we(() => v.enum(["consent", "switch_default", "cancelled"])),
      default: "cancelled"
    };
  });
  function xDe() {
    return {
      stateByDir: {},
      lastUsage: null
    };
  }
  function W9e(e) {
    if (!e) {
      return;
    }
    e.stateByDir = {};
    e.lastUsage = null;
  }
  function uga(e, t) {
    return e.stateByDir[t];
  }
  function dga(e, t, n, r, o) {
    let s = {
      memories: n,
      messages: [{
        role: "user",
        content: [{
          type: "text",
          text: `Available memories:
${r}`,
          ...(o && {
            cache_control: o
          })
        }]
      }]
    };
    e.stateByDir[t] = s;
    return s;
  }
  function pga(e, t, n, r) {
    let o = e.stateByDir[t];
    if (!o) {
      return;
    }
    e.stateByDir[t] = {
      ...o,
      messages: [...o.messages, {
        role: "user",
        content: [{
          type: "text",
          text: n
        }]
      }, {
        role: "assistant",
        content: [{
          type: "text",
          text: r
        }]
      }]
    };
  }
  function dpo() {
    return false;
  }
  var _pt = __lazy(() => {
    $n();
    gn();
    RX();
  });
  var _ga = {};