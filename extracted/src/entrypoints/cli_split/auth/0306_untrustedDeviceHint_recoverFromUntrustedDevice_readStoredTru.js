  __export(k5n, {
    untrustedDeviceHint: () => untrustedDeviceHint,
    recoverFromUntrustedDevice: () => recoverFromUntrustedDevice,
    readStoredTrustedDeviceToken: () => readStoredTrustedDeviceToken,
    isTrustedDeviceUnenrolled: () => isTrustedDeviceUnenrolled,
    isTrustedDeviceGateEnabled: () => isTrustedDeviceGateEnabled,
    isTrustedDeviceActiveForOrg: () => isTrustedDeviceActiveForOrg,
    isProactiveEnrollmentDisabled: () => isProactiveEnrollmentDisabled,
    getTrustedDeviceUnenrolledReason: () => getTrustedDeviceUnenrolledReason,
    getTrustedDeviceToken: () => getTrustedDeviceToken,
    getAttestationFilterPolicy: () => getAttestationFilterPolicy,
    enrollTrustedDeviceIfNeeded: () => enrollTrustedDeviceIfNeeded,
    enrollTrustedDevice: () => enrollTrustedDevice,
    clearTrustedDeviceTokenCache: () => clearTrustedDeviceTokenCache,
    clearTrustedDeviceToken: () => clearTrustedDeviceToken,
    _resetEnrollBackoffForTesting: () => _resetEnrollBackoffForTesting,
    PROACTIVE_ENROLLMENT_DISABLED_MESSAGE: () => "Your organization requires Trusted Devices for Remote Control, but enrollment is temporarily disabled. Please try again later, or contact your administrator."
  });
  function isProactiveEnrollmentDisabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_sessions_elevated_auth_disable_proactive_enrollment", false);
  }
  function p8p() {
    q$();
    return __toCommonJS(G6t);
  }
  function Swo() {
    Kc();
    return __toCommonJS(f$t);
  }
  function isTrustedDeviceGateEnabled() {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_sessions_elevated_auth_enforcement", false)) {
      return false;
    }
    return Swo().isPolicyAllowed("require_trusted_devices");
  }
  function isTrustedDeviceActiveForOrg() {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_sessions_elevated_auth_enforcement", false)) {
      return false;
    }
    return Swo().isPolicyEnforced("require_trusted_devices");
  }
  function getAttestationFilterPolicy() {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_attestation_enforce", false)) {
      return w5n;
    }
    if (!isTrustedDeviceActiveForOrg()) {
      return w5n;
    }
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_attestation_enforce_config", {});
    return P8a(t);
  }
  async function getTrustedDeviceToken() {
    if (!isTrustedDeviceGateEnabled()) {
      return;
    }
    return readStoredTrustedDeviceToken();
  }
  async function isTrustedDeviceUnenrolled() {
    if (!isTrustedDeviceActiveForOrg()) {
      return false;
    }
    if (await readStoredTrustedDeviceToken()) {
      return false;
    }
    return true;
  }
  async function getTrustedDeviceUnenrolledReason() {
    if (!(await isTrustedDeviceUnenrolled())) {
      return null;
    }
    if (isProactiveEnrollmentDisabled()) {
      return "Your organization requires Trusted Devices for Remote Control, but enrollment is temporarily disabled. Please try again later, or contact your administrator.";
    }
    return "Your organization requires Trusted Devices for Remote Control, but this device is not enrolled. Please run `/login` in Claude Code to enroll this device.";
  }
  function clearTrustedDeviceTokenCache() {
    readStoredTrustedDeviceToken.cache?.clear?.();
  }
  function _resetEnrollBackoffForTesting() {
    bwo = 0;
  }
  async function recoverFromUntrustedDevice(e) {
    if (!isTrustedDeviceGateEnabled()) {
      return;
    }
    clearTrustedDeviceTokenCache();
    let t = await getTrustedDeviceToken();
    if (!t || t === e) {
      if (Date.now() - bwo >= 300000) {
        bwo = Date.now();
        await enrollTrustedDevice({
          serverRequested: true
        });
        t = await getTrustedDeviceToken();
      }
    }
    if (!t || t === e) {
      return;
    }
    logForDebugging("[trusted-device] Token changed after untrusted_device 403 (cache bust or lazy enrollment); caller will retry");
    return t;
  }
  function untrustedDeviceHint() {
    if (isProactiveEnrollmentDisabled()) {
      return "Your organization requires Trusted Devices for Remote Control, but enrollment is temporarily disabled. Please try again later, or contact your administrator.";
    }
    return "this device is not enrolled as a trusted device; run /login to enroll";
  }
  async function enrollTrustedDeviceIfNeeded() {
    if (!(await isTrustedDeviceUnenrolled())) {
      return;
    }
    if (isProactiveEnrollmentDisabled()) {
      return;
    }
    logForDebugging("[trusted-device] Not enrolled, attempting lazy enrollment with OAuth token");
    await enrollTrustedDevice();
  }
  function clearTrustedDeviceToken() {
    no();
    let {
      isClaudeAISubscriber: e
    } = __toCommonJS(v2);
    if (!isFirstPartyProvider() || !e()) {
      return;
    }
    if (isProactiveEnrollmentDisabled()) {
      return;
    }
    readStoredTrustedDeviceToken.cache?.clear?.();
    yl().mutate(t => t.trustedDeviceToken ? {
      ...t,
      trustedDeviceToken: undefined
    } : t).catch(() => {});
  }
  async function enrollTrustedDevice({
    serverRequested: e = false
  } = {}) {
    no();
    let {
      isClaudeAISubscriber: t,
      getClaudeAIOAuthTokens: n,
      checkAndRefreshOAuthTokenIfNeeded: r
    } = __toCommonJS(v2);
    if (!isFirstPartyProvider() || !t()) {
      return;
    }
    try {
      if (!(await checkGate_CACHED_OR_BLOCKING("tengu_sessions_elevated_auth_enforcement"))) {
        logForDebugging(`[trusted-device] Gate ${"tengu_sessions_elevated_auth_enforcement"} is off, skipping enrollment`);
        return;
      }
      if (isProactiveEnrollmentDisabled()) {
        logForDebugging(`[trusted-device] Proactive enrollment disabled via ${"tengu_sessions_elevated_auth_disable_proactive_enrollment"}, skipping`);
        return;
      }
      if (process.env.CLAUDE_TRUSTED_DEVICE_TOKEN) {
        logForDebugging("[trusted-device] CLAUDE_TRUSTED_DEVICE_TOKEN env var is set, skipping enrollment (env var takes precedence)");
        return;
      }
      await p8p().waitForPolicyLimitsToLoad();
      let o = Swo();
      if (!(e ? o.isPolicyAllowed("require_trusted_devices") : o.isPolicyEnforced("require_trusted_devices"))) {
        logForDebugging(`[trusted-device] Org has not enabled ${"require_trusted_devices"}, skipping enrollment`);
        return;
      }
      if (Vi()) {
        logForDebugging("[trusted-device] Essential traffic only, skipping enrollment");
        return;
      }
      await r();
      let i = n()?.accessToken;
      if (!i) {
        logForDebugging("[trusted-device] No OAuth token, skipping enrollment");
        return;
      }
      let a = getOauthConfig().BASE_API_URL;
      let l;
      try {
        l = await NP.post(`${a}/api/auth/trusted_devices`, {
          display_name: `Claude Code on ${M8a.hostname()} \xB7 ${Wfn("linux")}`
        }, {
          headers: {
            Authorization: `Bearer ${i}`,
            "Content-Type": "application/json"
          },
          timeout: 1e4,
          validateStatus: u => u < 500
        });
      } catch (u) {
        logForDebugging(`[trusted-device] Enrollment request failed: ${he(u)}`);
        Ae("bridge_trusted_device_enroll", "request_failed");
        return;
      }
      if (l.status !== 200 && l.status !== 201) {
        logForDebugging(`[trusted-device] Enrollment failed ${l.status}: ${De(l.data).slice(0, 200)}`);
        Ae("bridge_trusted_device_enroll", "http_error");
        return;
      }
      let c = l.data?.device_token;
      if (!c || typeof c !== "string") {
        logForDebugging("[trusted-device] Enrollment response missing device_token field");
        Ae("bridge_trusted_device_enroll", "missing_token");
        return;
      }
      try {
        let u = await yl().mutate(d => ({
          ...d,
          trustedDeviceToken: c
        }));
        if (!u.success) {
          logForDebugging(`[trusted-device] Failed to persist token: ${u.warning ?? "unknown"}`);
          Ae("bridge_trusted_device_enroll", "storage_failed");
          return;
        }
        readStoredTrustedDeviceToken.cache?.clear?.();
        logForDebugging(`[trusted-device] Enrolled device_id=${l.data.device_id ?? "unknown"}`);
        Pe("bridge_trusted_device_enroll");
      } catch (u) {
        logForDebugging(`[trusted-device] Storage write failed: ${he(u)}`);
        Ae("bridge_trusted_device_enroll", "storage_failed");
      }
    } catch (o) {
      logForDebugging(`[trusted-device] Enrollment error: ${he(o)}`);
      Ae("bridge_trusted_device_enroll", "unexpected_error");
    }
  }
  var M8a;
  var bwo = 0;
  var readStoredTrustedDeviceToken;
  var CQ = __lazy(() => {
    Dp();
    Uc();
    ln();
    $n();
    je();
    dt();
    Ds();
    Cs();
    Wd();
    DW();
    k8e();
    M8a = require("os");
    readStoredTrustedDeviceToken = TEr(async () => {
      let e = process.env.CLAUDE_TRUSTED_DEVICE_TOKEN;
      if (e) {
        return e;
      }
      return (await yl().readAsync())?.trustedDeviceToken;
    });
  });
  function Ope(e) {
    L8a.add(e);
  }
  function F8a() {
    for (let e of L8a) {
      e();
    }
  }
  var L8a;
  var I8e = __lazy(() => {
    L8a = new Set();
  });
  function U8a(e) {
    if (Rwo.vZc(e)) {
      return false;
    }
    Rwo.add(e);
    return true;
  }
  var Rwo;
  var B8a = __lazy(() => {
    I8e();
    Rwo = new Set();
    Ope(() => Rwo.clear());
  });
  function P8e() {
    return wgt.useContext(xwo);
  }
  function mz(e, t, {
    enabled: n = true
  } = {}) {
    let r = P8e();
    wgt.useEffect(() => {
      if (!n || !r) {
        return;
      }
      if (U8a(e)) {
        t();
      }
    }, [n, r, e, t]);
  }
  var wgt;
  var xwo;
  var HEe = __lazy(() => {
    B8a();
    wgt = __toESM(ot(), 1);
    xwo = wgt.createContext(true);
  });
  async function H8a() {
    if (isClaudeAISubscriber()) {
      return null;
    }
    let e = await Gni();
    if (!e) {
      return null;
    }
    if (e.account.has_claude_max && !FX()) {
      return "Max";
    }
    if (e.account.has_claude_pro && !vha()) {
      return "Pro";
    }
    return null;
  }
  function j8a() {
    return (getGlobalConfig().seenNotifications?.[V6t] ?? 0) < 3;
  }
  function h8p() {
    saveGlobalConfig(e => {
      let t = e.seenNotifications ?? {};
      return {
        ...e,
        seenNotifications: {
          ...t,
          ["subscription-switch"]: (t["subscription-switch"] ?? 0) + 1
        }
      };
    });
    logEvent("tengu_switch_to_subscription_notice_shown", {});
  }
  function q8a(e) {
    let t = $8a.c(3);
    let {
      subscriptionType: n
    } = e;
    mz("subscription-switch", h8p);
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = z6t.jsxs(Text, {
        color: "text",
        dimColor: true,
        children: [" ", "\xB7 /login to activate"]
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = z6t.jsx(gXd, {
        children: z6t.jsxs(Text, {
          color: "suggestion",
          children: ["Use your existing Claude ", n, " plan with Claude Code", r]
        })
      });
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  var $8a;
  var z6t;
  var A5n = __lazy(() => {
    et();
    Ot();
    fqe();
    no();
    U9e();
    HEe();
    $8a = __toESM(pt(), 1);
    z6t = __toESM(ie(), 1);
  });
  async function Awo() {
    try {
      await withOAuth401Retry(async () => {
        let e = await _s.post("/api/oauth/account/grove_notice_viewed", {});
        if (!e.ok) {
          throw Error(`Failed to mark Grove notice viewed: ${e.reason}`);
        }
        return e;
      });
      Yoe.cache.clear?.();
      Pe("api_grove_notice_mark_viewed");
    } catch (e) {
      logForDebugging(`Failed to mark Grove notice viewed: ${e instanceof Error ? e.message : String(e)}`, {
        level: "error"
      });
      Ae("api_grove_notice_mark_viewed", "request_failed");
    }
  }
  async function I5n(e) {
    try {
      await withOAuth401Retry(async () => {
        let t = await _s.patch("/api/oauth/account/settings", {
          grove_enabled: e
        });
        if (!t.ok) {
          throw Error(`Failed to update Grove settings: ${t.reason}`);
        }
        return t;
      });
      Yoe.cache.clear?.();
      Pe("api_grove_settings_update");
    } catch (t) {
      logForDebugging(`updateGroveSettings failed: ${String(t)}`, {
        level: "error"
      });
      Ae("api_grove_settings_update", "request_failed");
    }
  }
  async function Cgt() {
    if (!isConsumerSubscriber()) {
      return false;
    }
    let e = getOauthAccountInfo()?.accountUuid;
    if (!e) {
      return false;
    }
    let n = getGlobalConfig().groveConfigCache?.[e];
    let r = Date.now();
    if (!n) {
      logForDebugging("Grove: No cache, fetching config in background (dialog skipped this session)");
      W8a(e);
      return false;
    }
    if (r - n.timestamp > 86400000) {
      logForDebugging("Grove: Cache stale, returning cached data and refreshing in background");
      W8a(e);
      return n.grove_enabled;
    }
    logForDebugging("Grove: Using fresh cached config");
    return n.grove_enabled;
  }
  async function W8a(e) {
    try {
      let t = await HNe();
      if (!t.success) {
        return;
      }
      let n = t.data.grove_enabled;
      let r = getGlobalConfig().groveConfigCache?.[e];
      if (r?.grove_enabled === n && Date.now() - r.timestamp <= 86400000) {
        return;
      }
      saveGlobalConfig(o => ({
        ...o,
        groveConfigCache: {
          ...o.groveConfigCache,
          [e]: {
            grove_enabled: n,
            timestamp: Date.now()
          }
        }
      }));
    } catch (t) {
      logForDebugging(`Grove: Failed to fetch and store config: ${t}`);
    }
  }
  function Iwo(e, t, n) {
    if (!e.success || !t.success) {
      return false;
    }
    let r = e.data;
    let o = t.data;
    if (r.grove_enabled !== null) {
      return false;
    }
    if (n) {
      return true;
    }
    if (!o.notice_is_grace_period) {
      return true;
    }
    let i = o.notice_reminder_frequency;
    if (i !== null && r.grove_notice_viewed_at) {
      let a = new Date(r.grove_notice_viewed_at).getTime();
      if (isNaN(a)) {
        Oe(Error(`Invalid grove_notice_viewed_at from API: ${r.grove_notice_viewed_at}`));
        return true;
      }
      return Math.floor((Date.now() - a) / 86400000) >= i;
    } else {
      let a = r.grove_notice_viewed_at;
      return a === null || a === undefined;
    }
  }
  async function z8a() {
    let [e, t] = await Promise.all([Yoe(), HNe()]);
    if (Iwo(e, t, false)) {
      let r = t.success ? t.data : null;
      if (logEvent("tengu_grove_print_viewed", {
        dismissable: r?.notice_is_grace_period
      }), r === null || r.notice_is_grace_period) {
        writeToStderr(`
An update to our Consumer Terms and Privacy Policy will take effect on October 8, 2025. Run \`claude\` to review the updated terms.

`);
        await Awo();
      } else {
        writeToStderr(`
[ACTION REQUIRED] An update to our Consumer Terms and Privacy Policy has taken effect on October 8, 2025. You must run \`claude\` to review the updated terms.

`);
        await gracefulShutdown(1);
      }
    }
  }
  var Yoe;
  var HNe;
  var Rgt = __lazy(() => {
    Ot();
    no();
    je();
    lm();
    OD();
    YA();
    Rn();
    ln();
    bg();
    Yoe = TEr(async () => {
      try {
        return {
          success: true,
          data: (await withOAuth401Retry(async () => {
            let t = await _s.get("/api/oauth/account/settings", {
              timeout: 3000
            });
            if (!t.ok) {
              throw Error(`Failed to get Grove settings: ${t.reason}`);
            }
            return t;
          })).data
        };
      } catch (e) {
        if (!(e instanceof Error) || !/data-residency|essential-traffic-only|no-auth/.test(e.message)) {
          logForDebugging(`Failed to fetch Grove settings: ${e}`, {
            level: "error"
          });
        }
        Yoe.cache.clear?.();
        return {
          success: false
        };
      }
    });
    HNe = TEr(async () => {
      try {
        let e = await withOAuth401Retry(async () => {
          let s = await _s.get("/api/claude_code_grove", {
            timeout: 3000
          });
          if (!s.ok) {
            throw Error(`Failed to fetch Grove notice config: ${s.reason}`);
          }
          return s;
        });
        let {
          grove_enabled: t,
          domain_excluded: n,
          notice_is_grace_period: r,
          notice_reminder_frequency: o
        } = e.data;
        return {
          success: true,
          data: {
            grove_enabled: t,
            domain_excluded: n ?? false,
            notice_is_grace_period: r ?? true,
            notice_reminder_frequency: o
          }
        };
      } catch (e) {
        logForDebugging(`Failed to fetch Grove notice config: ${e}`);
        return {
          success: false
        };
      }
    });
  });
  function Pwo(e) {
    if (Array.isArray(e)) {
      return e.map(Pwo);
    }
    if (e !== null && typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e).sort()) {
        t[n] = Pwo(e[n]);
      }
      return t;
    }
    return e;
  }
  function P5n(e) {
    let t = Pwo(e);
    let n = De(t);
    return `sha256:${K8a.createHash("sha256").update(n).digest("hex")}`;
  }
  var K8a;
  var Owo = __lazy(() => {
    K8a = require("crypto");
  });
  function Y8a(e) {
    Dwo = e;
  }
  async function xgt() {
    if (Dwo) {
      await Dwo();
    }
  }
  var Dwo = null;
  function mc(e) {
    let t = J8a.c(21);
    let {
      onConfirm: n,
      onCancel: r,
      confirmLabel: o,
      cancelLabel: s,
      cancelFirst: i,
      focus: a
    } = e;
    let l = o === undefined ? "Yes" : o;
    let c = s === undefined ? "No" : s;
    let u = i === undefined ? false : i;
    let d = a === undefined ? "confirm" : a;
    if (useIsScreenReaderEnabled()) {
      let S;
      if (t[0] !== c || t[1] !== l || t[2] !== r || t[3] !== n) {
        S = Mwo.jsx(IZi, {
          confirmLabel: l,
          cancelLabel: c,
          onConfirm: n,
          onCancel: r
        });
        t[0] = c;
        t[1] = l;
        t[2] = r;
        t[3] = n;
        t[4] = S;
      } else {
        S = t[4];
      }
      return S;
    }
    let m;
    if (t[5] !== l) {
      m = {
        label: l,
        value: "confirm"
      };
      t[5] = l;
      t[6] = m;
    } else {
      m = t[6];
    }
    let f = m;
    let h;
    if (t[7] !== c) {
      h = {
        label: c,
        value: "cancel"
      };
      t[7] = c;
      t[8] = h;
    } else {
      h = t[8];
    }
    let g = h;
    let y;
    if (t[9] !== g || t[10] !== u || t[11] !== f) {
      y = u ? [g, f] : [f, g];
      t[9] = g;
      t[10] = u;
      t[11] = f;
      t[12] = y;
    } else {
      y = t[12];
    }
    let _;
    if (t[13] !== r || t[14] !== n) {
      _ = S => S === "confirm" ? n() : r();
      t[13] = r;
      t[14] = n;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b;
    if (t[16] !== d || t[17] !== r || t[18] !== y || t[19] !== _) {
      b = Mwo.jsx(xr, {
        options: y,
        defaultFocusValue: d,
        onChange: _,
        onCancel: r
      });
      t[16] = d;
      t[17] = r;
      t[18] = y;
      t[19] = _;
      t[20] = b;
    } else {
      b = t[20];
    }
    return b;
  }
  var J8a;
  var Mwo;
  var b_ = __lazy(() => {
    et();
    rFn();
    $c();
    J8a = __toESM(pt(), 1);
    Mwo = __toESM(ie(), 1);
  });
  function Lw(e) {
    let t = X8a.c(2);
    let {
      children: n
    } = e;
    let {
      pending: r,
      keyName: o
    } = Eg();
    let s = r ? `Press ${o} again to exit` : n;
    let i;
    if (t[0] !== s) {
      i = Q8a.jsx(Text, {
        dimColor: true,
        children: s
      });
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    return i;
  }
  var X8a;
  var Q8a;
  var fz = __lazy(() => {
    mO();
    et();
    X8a = __toESM(pt(), 1);
    Q8a = __toESM(ie(), 1);
  });
  function qNe(e) {
    let t = Z8a.c(18);
    let {
      title: n,
      subtitle: r,
      color: o,
      requestSource: s,
      srPrefix: i
    } = e;
    let a = o === undefined ? "permission" : o;
    let l;
    e: switch (s?.type) {
      case "workflow-agent":
        {
          let h = s.workflowName;
          let g;
          if (t[0] !== h) {
            g = h !== undefined ? `from the "${truncate(h, 24, true)}" workflow` : "from a workflow";
            t[0] = h;
            t[1] = g;
          } else {
            g = t[1];
          }
          l = g;
          break e;
        }
      case "subagent":
        {
          let h = s.agentName;
          let g;
          if (t[2] !== h) {
            g = h !== undefined ? `from the ${truncate(h, 24, true)} agent` : "from a subagent";
            t[2] = h;
            t[3] = g;
          } else {
            g = t[3];
          }
          l = g;
        }
    }
    let c = i !== undefined ? `${i} ${n}` : undefined;
    let u;
    if (t[4] !== a || t[5] !== c || t[6] !== n) {
      u = jNe.jsx(Text, {
        "aria-label": c,
        bold: true,
        color: a,
        children: n
      });
      t[4] = a;
      t[5] = c;
      t[6] = n;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== l) {
      d = l !== undefined && jNe.jsxs(Text, {
        children: [jNe.jsx(Text, {
          dimColor: true,
          children: "\xB7 "
        }), l]
      });
      t[8] = l;
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] !== u || t[11] !== d) {
      p = jNe.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [u, d]
      });
      t[10] = u;
      t[11] = d;
      t[12] = p;
    } else {
      p = t[12];
    }
    let m;
    if (t[13] !== r) {
      m = r != null && (typeof r === "string" ? jNe.jsx(Text, {
        dimColor: true,
        wrap: "truncate-start",
        children: r
      }) : r);
      t[13] = r;
      t[14] = m;
    } else {
      m = t[14];
    }
    let f;
    if (t[15] !== p || t[16] !== m) {
      f = jNe.jsxs(gXd, {
        flexDirection: "column",
        children: [p, m]
      });
      t[15] = p;
      t[16] = m;
      t[17] = f;
    } else {
      f = t[17];
    }
    return f;
  }
  var Z8a;
  var jNe;
  var K6t = __lazy(() => {
    et();
    dI();
    Z8a = __toESM(pt(), 1);
    jNe = __toESM(ie(), 1);
  });
  function qm(e) {
    let t = eVa.c(15);
    let {
      title: n,
      subtitle: r,
      color: o,
      titleColor: s,
      innerPaddingX: i,
      requestSource: a,
      titleRight: l,
      children: c
    } = e;
    let u = o === undefined ? "permission" : o;
    let d = i === undefined ? 1 : i;
    let p;
    if (t[0] !== a || t[1] !== r || t[2] !== n || t[3] !== s) {
      p = O8e.jsx(qNe, {
        title: n,
        subtitle: r,
        color: s,
        requestSource: a,
        srPrefix: "Permission Required:"
      });
      t[0] = a;
      t[1] = r;
      t[2] = n;
      t[3] = s;
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] !== p || t[6] !== l) {
      m = O8e.jsx(gXd, {
        paddingX: 1,
        flexDirection: "column",
        children: O8e.jsxs(gXd, {
          justifyContent: "space-between",
          children: [p, l]
        })
      });
      t[5] = p;
      t[6] = l;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] !== c || t[9] !== d) {
      f = O8e.jsx(gXd, {
        flexDirection: "column",
        paddingX: d,
        children: c
      });
      t[8] = c;
      t[9] = d;
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== u || t[12] !== m || t[13] !== f) {
      h = O8e.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        borderColor: u,
        borderLeft: false,
        borderRight: false,
        borderBottom: false,
        marginTop: 1,
        children: [m, f]
      });
      t[11] = u;
      t[12] = m;
      t[13] = f;
      t[14] = h;
    } else {
      h = t[14];
    }
    return h;
  }
  var eVa;
  var O8e;
  var XI = __lazy(() => {
    et();
    K6t();
    eVa = __toESM(pt(), 1);
    O8e = __toESM(ie(), 1);
  });
  function kgt(e) {
    if (!e) {
      return {
        shellSettings: {},
        envVars: {},
        hasHooks: false,
        hasClaudeMd: false
      };
    }
    let t = {};
    for (let s of CPs) {
      let i = e[s];
      let a;
      if (typeof i === "string") {
        a = i;
      } else if (i !== null && typeof i === "object" && "command" in i && typeof i.command === "string") {
        a = i.command;
      }
      if (a !== undefined && a.length > 0) {
        t[s] = a;
      }
    }
    let n = {};
    if (e.env && typeof e.env === "object") {
      for (let [s, i] of Object.entries(e.env)) {
        if (i === undefined) {
          continue;
        }
        let a = String(i);
        if (a.length > 0 && !Int.vZc(s.toUpperCase())) {
          n[s] = a;
        }
      }
    }
    let r = e.hooks !== undefined && e.hooks !== null && typeof e.hooks === "object" && Object.keys(e.hooks).length > 0;
    let o = typeof e.claudeMd === "string" && e.claudeMd.length > 0;
    return {
      shellSettings: t,
      envVars: n,
      hasHooks: r,
      hooks: r ? e.hooks : undefined,
      hasClaudeMd: o,
      claudeMd: o ? e.claudeMd : undefined
    };
  }
  function O5n(e) {
    return Object.keys(e.shellSettings).length > 0 || Object.keys(e.envVars).length > 0 || e.hasHooks || e.hasClaudeMd;
  }
  function tVa(e, t) {
    let n = kgt(e);
    let r = kgt(t);
    if (!O5n(r)) {
      return false;
    }
    if (!O5n(n)) {
      return true;
    }
    let o = De({
      shellSettings: n.shellSettings,
      envVars: n.envVars,
      hooks: n.hooks,
      claudeMd: n.claudeMd
    });
    let s = De({
      shellSettings: r.shellSettings,
      envVars: r.envVars,
      hooks: r.hooks,
      claudeMd: r.claudeMd
    });
    return o !== s;
  }
  function nVa(e) {
    let t = [];
    for (let n of Object.keys(e.shellSettings)) {
      t.push(n);
    }
    for (let n of Object.keys(e.envVars)) {
      t.push(n);
    }
    if (e.hasHooks) {
      t.push("hooks");
    }
    if (e.hasClaudeMd) {
      t.push("claudeMd");
    }
    return t;
  }
  var Nwo = __lazy(() => {
    lW();
  });
  function D5n(e) {
    let t = rVa.c(20);
    let {
      settings: n,
      onAccept: r,
      onReject: o
    } = e;
    let s = kgt(n);
    let i = nVa(s);
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = {
        context: "Confirmation"
      };
      t[0] = a;
    } else {
      a = t[0];
    }
    uo("confirm:no", o, a);
    let l = qm;
    let c = "warning";
    let u = "warning";
    let d = "Managed settings require approval";
    let p = gXd;
    let m = "column";
    let f = 1;
    let h = 1;
    let g;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      g = PU.jsx(Text, {
        children: "Your organization has configured managed settings that could allow execution of arbitrary code or interception of your prompts and responses."
      });
      t[1] = g;
    } else {
      g = t[1];
    }
    let y = gXd;
    let _ = "column";
    let b;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      b = PU.jsx(Text, {
        dimColor: true,
        children: "Settings requiring approval:"
      });
      t[2] = b;
    } else {
      b = t[2];
    }
    let S = i.map(g8p);
    let E;
    if (t[3] !== y || t[4] !== b || t[5] !== S) {
      E = PU.jsxs(y, {
        flexDirection: _,
        children: [b, S]
      });
      t[3] = y;
      t[4] = b;
      t[5] = S;
      t[6] = E;
    } else {
      E = t[6];
    }
    let C;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      C = PU.jsx(Text, {
        children: "Only accept if you trust your organization's IT administration and expect these settings to be configured."
      });
      t[7] = C;
    } else {
      C = t[7];
    }
    let x;
    if (t[8] !== r || t[9] !== o) {
      x = PU.jsx(mc, {
        confirmLabel: "Yes, I trust these settings",
        cancelLabel: "No, exit Claude Code",
        onConfirm: r,
        onCancel: o
      });
      t[8] = r;
      t[9] = o;
      t[10] = x;
    } else {
      x = t[10];
    }
    let A;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      A = PU.jsx(Lw, {
        children: PU.jsxs(Hn, {
          children: [PU.jsx(xt, {
            chord: "enter",
            action: "confirm"
          }), PU.jsx(xt, {
            chord: "escape",
            action: "exit"
          })]
        })
      });
      t[11] = A;
    } else {
      A = t[11];
    }
    let k;
    if (t[12] !== p || t[13] !== E || t[14] !== x || t[15] !== g) {
      k = PU.jsxs(p, {
        flexDirection: m,
        gap: f,
        paddingTop: h,
        children: [g, E, C, x, A]
      });
      t[12] = p;
      t[13] = E;
      t[14] = x;
      t[15] = g;
      t[16] = k;
    } else {
      k = t[16];
    }
    let I;
    if (t[17] !== l || t[18] !== k) {
      I = PU.jsx(l, {
        color: c,
        titleColor: u,
        title: d,
        children: k
      });
      t[17] = l;
      t[18] = k;
      t[19] = I;
    } else {
      I = t[19];
    }
    return I;
  }
  function g8p(e, t) {
    return PU.jsx(gXd, {
      paddingLeft: 2,
      children: PU.jsxs(Text, {
        children: [PU.jsx(Text, {
          dimColor: true,
          children: "\xB7 "
        }), PU.jsx(Text, {
          children: e
        })]
      })
    }, t);
  }
  var rVa;
  var PU;
  var Lwo = __lazy(() => {
    et();
    Bs();
    Ai();
    b_();
    fz();
    bs();
    XI();
    Nwo();
    rVa = __toESM(pt(), 1);
    PU = __toESM(ie(), 1);
  });
  var Fwo;
  var oVa = __lazy(() => {
    Jlt();
    Fwo = class Fwo extends hre {
      action;
      sourceEvent;
      isChordCompletion;
      origin;
      constructor(e, t) {
        super("action", {
          bubbles: true,
          cancelable: true
        });
        this.action = e;
        this.sourceEvent = t?.sourceEvent ?? null;
        this.isChordCompletion = t?.isChordCompletion ?? false;
        this.origin = t?.origin ?? "single";
      }
      consume() {
        this.stopPropagation();
        this.sourceEvent?.preventDefault();
        this.sourceEvent?.stopImmediatePropagation();
      }
      get consumed() {
        return this._isPropagationStopped();
      }
    };
  });
  function D8e(e) {
    let t = e.startsWith("command:") ? "command:custom" : e;
    let n = Date.now();
    let r = sVa.get(t);
    if (r !== undefined && n - r < 1000) {
      return;
    }
    sVa.set(t, n);
    logEvent("tengu_keybinding_fired", {
      action_id: t
    });
  }
  var sVa;
  var iVa = __lazy(() => {
    Ot();
    sVa = new Map();
  });
  var $wo = {};
  __export($wo, {
    KeybindingSetup: () => KeybindingSetup,
    KeybindingRoot: () => KeybindingRoot,
    CHORD_TIMEOUT_MS: () => 1000
  });
  function KeybindingSetup(e) {
    let t = Bwo.c(4);
    let {
      children: n
    } = e;
    if (tE()) {
      let s;
      if (t[0] !== n) {
        s = WNe.jsx(WNe.Fragment, {
          children: n
        });
        t[0] = n;
        t[1] = s;
      } else {
        s = t[1];
      }
      return s;
    }
    let o;
    if (t[2] !== n) {
      o = WNe.jsx(_8p, {
        children: n
      });
      t[2] = n;
      t[3] = o;
    } else {
      o = t[3];
    }
    return o;
  }
  function _8p({
    children: e
  }) {
    let [{
      bindings: t
    }, n] = iA.useState(() => {
      let g = ajt(pq);
      logForDebugging(`[keybindings] KeybindingSetup initialized with ${g.bindings.length} bindings, ${g.warnings.length} warnings`);
      return g;
    });
    let r = useClock();
    let o = iA.useRef(null);
    let [s, i] = iA.useState(null);
    let a = iA.useRef(null);
    let l = iA.useRef(new Map());
    let c = iA.useRef(new Set());
    let u = iA.useRef(new Set());
    let [d] = iA.useState(VLn);
    let p = iA.useCallback(g => {
      c.current.add(g);
    }, []);
    let m = iA.useCallback(g => {
      c.current.delete(g);
    }, []);
    let f = iA.useCallback(() => {
      a.current?.();
      a.current = null;
    }, []);
    let h = iA.useCallback(g => {
      if (f(), g !== null) {
        a.current = r.setTimeout(() => {
          logForDebugging("[keybindings] Chord timeout - cancelling");
          o.current = null;
          i(null);
        }, 1000);
      }
      o.current = g;
      i(g);
    }, [f, r]);
    iA.useEffect(() => {
      Y7i(pq);
      let g = pq.changed.subscribe(y => {
        n(y);
        logForDebugging(`[keybindings] Reloaded: ${y.bindings.length} bindings, ${y.warnings.length} warnings`);
      });
      return () => {
        g();
        f();
      };
    }, [f]);
    return WNe.jsx(zLn, {
      bindings: t,
      pendingChordRef: o,
      pendingChord: s,
      setPendingChord: h,
      activeContexts: c.current,
      registerActiveContext: p,
      unregisterActiveContext: m,
      handlerRegistryRef: l,
      preDispatchRef: u,
      keyHandlerRegistry: d,
      children: WNe.jsx(KeybindingRoot, {
        bindings: t,
        pendingChordRef: o,
        setPendingChord: h,
        activeContexts: c.current,
        handlerRegistryRef: l,
        preDispatchRef: u,
        keyHandlerRegistry: d,
        children: e
      })
    });
  }
  function KeybindingRoot(e) {
    let t = Bwo.c(28);
    let {
      bindings: n,
      pendingChordRef: r,
      setPendingChord: o,
      activeContexts: s,
      handlerRegistryRef: i,
      preDispatchRef: a,
      keyHandlerRegistry: l,
      children: c
    } = e;
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = [];
      t[0] = u;
    } else {
      u = t[0];
    }
    let d = iA.useRef(u);
    let p = iA.useRef(null);
    let m = iA.useRef("legacy");
    let f;
    if (t[1] !== a) {
      f = (M, L, P, F) => {
        for (let H of a.current) {
          try {
            if (H(M, L, P) === true) {
              F();
              return true;
            }
          } catch (U) {
            Oe(U);
          }
        }
        return false;
      };
      t[1] = a;
      t[2] = f;
    } else {
      f = t[2];
    }
    let h = f;
    let g;
    if (t[3] !== s || t[4] !== n || t[5] !== i || t[6] !== r || t[7] !== h || t[8] !== o) {
      g = (M, L, P, F, H, U) => {
        let N = U === undefined ? false : U;
        let W = i.current;
        let j = new Set();
        if (W) {
          for (let Q of W.values()) {
            for (let Z of Q) {
              j.add(Z.context);
            }
          }
        }
        let z = [...j, ...s, "Global"];
        let V = r.current !== null;
        let K = ljt(M, z, n, r.current);
        e: switch (K.type) {
          case "chord_started":
            {
              m.current = "legacy";
              o(K.pending);
              H();
              return;
            }
          case "chord_cancelled":
            {
              o(null);
              H();
              return;
            }
          case "unbound":
            {
              if (o(null), V) {
                H();
                return;
              }
              break e;
            }
          case "match":
            {
              if (o(null), V) {
                let Q = W?.get(K.action);
                if (Q) {
                  for (let Z of Q) {
                    Z.handler();
                    D8e(K.action);
                    H();
                    break;
                  }
                }
                return;
              }
              break e;
            }
          case "none":
        }
        if (!W) {
          return;
        }
        if (!N && h(L, P, F, H)) {
          return;
        }
        let J = new Map();
        for (let Q of W.values()) {
          for (let Z of Q) {
            if (!Z.singleKey) {
              continue;
            }
            let ne = J.get(Z.context);
            if (ne === undefined) {
              let oe = ljt(M, [...s, Z.context, "Global"], n, null);
              ne = oe.type === "match" ? oe.action : null;
              J.set(Z.context, ne);
            }
            if (ne === Z.action) {
              if (Z.handler() !== false) {
                D8e(ne);
                H();
                return;
              }
            }
          }
        }
      };
      t[3] = s;
      t[4] = n;
      t[5] = i;
      t[6] = r;
      t[7] = h;
      t[8] = o;
      t[9] = g;
    } else {
      g = t[9];
    }
    let y = g;
    let _;
    if (t[10] !== n || t[11] !== i || t[12] !== l || t[13] !== y || t[14] !== r || t[15] !== h || t[16] !== o) {
      _ = (M, L, P, F, H, U) => {
        let N = l;
        let W = (J, Q) => {};
        if (N.swallowAll.size > 0) {
          W(null, true);
          U();
          return;
        }
        if (r.current !== null && m.current === "legacy") {
          W(null, false);
          y(L, P, F, H, U);
          return;
        }
        let j = T8p(M.target);
        let z = r.current !== null && m.current === "scopeChain";
        if (j.length === 0 && N.preemptiveScopes.size === 0 && !z) {
          W(null, false);
          y(L, P, F, H, U);
          return;
        }
        let V = M5n(M.target);
        if (N.preemptiveScopes.size > 0 && !z) {
          let J = [...N.preemptiveScopes.keys(), "Global"];
          let Q = B1n(L, J, n, null);
          if (Q.type === "match" && V) {
            if (Uwo(V, M, Q.action, false, M.type === "wheel" ? "wheel" : "single")) {
              W(Q.action, true);
              D8e(Q.action);
              return;
            }
          }
        }
        if (z) {
          let J = B1n(L, d.current, n, r.current);
          if (J.type === "chord_started") {
            m.current = "scopeChain";
            o(J.pending);
            U();
            W(null, true);
            return;
          }
          if (J.type === "match") {
            o(null);
            let Q = p.current;
            p.current = null;
            d.current = [];
            let Z = Q && V && gre(Q, Qlt(V)) ? Q : V;
            if (Z) {
              if (Uwo(Z, M, J.action, true, "chord")) {
                W(J.action, true);
                D8e(J.action);
                return;
              }
            }
            let ne = false;
            let oe = i.current?.get(J.action);
            if (oe) {
              for (let ee of oe) {
                ee.handler();
                D8e(J.action);
                U();
                ne = true;
                break;
              }
            }
            W(J.action, ne);
            return;
          }
          p.current = null;
          d.current = [];
          W(null, false);
          y(L, P, F, H, U);
          return;
        }
        let K = B1n(L, j, n, null);
        switch (K.type) {
          case "chord_started":
            {
              d.current = j;
              p.current = V ?? null;
              m.current = "scopeChain";
              o(K.pending);
              U();
              W(null, true);
              return;
            }
          case "match":
            {
              if (!V) {
                W(K.action, false);
                y(L, P, F, H, U);
                return;
              }
              if (h(P, F, H, U)) {
                o(null);
                W(K.action, true);
                return;
              }
              if (Uwo(V, M, K.action, false, M.type === "wheel" ? "wheel" : "single")) {
                o(null);
                W(K.action, true);
                D8e(K.action);
                return;
              }
              W(K.action, false);
              y(L, P, F, H, U, true);
              return;
            }
          case "unbound":
            {
              if (h(P, F, H, U)) {
                o(null);
                W(null, true);
                return;
              }
              o(null);
              W(null, false);
              return;
            }
          default:
            {
              W(null, false);
              y(L, P, F, H, U);
              return;
            }
        }
      };
      t[10] = n;
      t[11] = i;
      t[12] = l;
      t[13] = y;
      t[14] = r;
      t[15] = h;
      t[16] = o;
      t[17] = _;
    } else {
      _ = t[17];
    }
    let b = _;
    let S;
    if (t[18] !== b) {
      S = M => {
        let {
          input: L,
          key: P
        } = lZi(M);
        b(M, M, L, P, M.sequence, () => aVa(M));
      };
      t[18] = b;
      t[19] = S;
    } else {
      S = t[19];
    }
    let E = S;
    let C;
    if (t[20] !== b) {
      C = M => {
        if (S8p(M.target, M.currentTarget)) {
          return;
        }
        let L = {
          name: M.deltaY < 0 ? "wheelup" : "wheeldown",
          key: "",
          ctrl: M.ctrl,
          shift: M.shift,
          meta: M.meta,
          superKey: false
        };
        let P = {
          upArrow: false,
          downArrow: false,
          leftArrow: false,
          rightArrow: false,
          pageDown: false,
          pageUp: false,
          wheelUp: M.deltaY < 0,
          wheelDown: M.deltaY > 0,
          home: false,
          end: false,
          return: false,
          escape: false,
          tab: false,
          backspace: false,
          delete: false,
          ctrl: M.ctrl,
          shift: M.shift,
          meta: M.meta,
          super: false
        };
        b(M, L, "", P, "", () => aVa(M));
      };
      t[20] = b;
      t[21] = C;
    } else {
      C = t[21];
    }
    let x = C;
    let A = iA.useRef(null);
    let k;
    let I;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      k = () => {
        if (!A.current) {
          return;
        }
        let M = yre(A.current);
        let L = () => {
          let P = A.current;
          if (!P || M.activeElement === P) {
            return;
          }
          if (M.activeElement === null) {
            M.focus(P);
            return;
          }
          let F = P.parentNode;
          while (F) {
            if (F === M.activeElement) {
              M.focus(P);
              return;
            }
            F = F.parentNode;
          }
        };
        L();
        return M.subscribe(L);
      };
      I = [];
      t[22] = k;
      t[23] = I;
    } else {
      k = t[22];
      I = t[23];
    }
    iA.useLayoutEffect(k, I);
    let O;
    if (t[24] !== c || t[25] !== E || t[26] !== x) {
      O = WNe.jsx(oJd, {
        ref: A,
        keybindingScope: "Global",
        tabIndex: -1,
        flexDirection: "column",
        flexGrow: 1,
        onKeyDownCapture: E,
        onWheelCapture: x,
        children: c
      });
      t[24] = c;
      t[25] = E;
      t[26] = x;
      t[27] = O;
    } else {
      O = t[27];
    }
    return O;
  }
  function aVa(e) {
    e.preventDefault();
    e.stopImmediatePropagation();
  }
  function b8p(e) {
    return e !== null && "attributes" in e;
  }
  function M5n(e) {
    return b8p(e) ? e : undefined;
  }
  function S8p(e, t) {
    let n = M5n(e);
    let r = M5n(t);
    while (n && n !== r) {
      if (n._eventHandlers?.onWheel) {
        return true;
      }
      n = n.parentNode;
    }
    return false;
  }
  function T8p(e) {
    let t = [];
    let n = M5n(e);
    while (n) {
      let r = n.attributes.keybindingScope;
      if (typeof r === "string" && j7i(r)) {
        t.push(r);
      }
      n = n.parentNode;
    }
    return t;
  }
  function Uwo(e, t, n, r, o) {
    let s = new Fwo(n, {
      sourceEvent: t,
      isChordCompletion: r,
      origin: o
    });
    X8.dispatch(e, s);
    return s.consumed;
  }
  var Bwo;
  var iA;
  var WNe;
  var C9 = __lazy(() => {
    oVa();
    iSe();
    zWe();
    et();
    je();
    Rn();
    voo();
    yq();
    xre();
    BPe();
    O1n();
    iVa();
    Bwo = __toESM(pt(), 1);
    iA = __toESM(ot(), 1);
    WNe = __toESM(ie(), 1);
  });
  class Hwo {
    queue = [];
    waiters = [];
    changed = Si();
    _revision = 0;
    get length() {
      return this.queue.length;
    }
    get revision() {
      return this._revision;
    }
    send(e) {
      this._revision++;
      let t = this.waiters.findIndex(n => n.fn(e));
      if (t !== -1) {
        let n = this.waiters.splice(t, 1)[0];
        if (n) {
          n.resolve(e);
          this.notify();
          return;
        }
      }
      this.queue.push(e);
      this.notify();
    }
    poll(e = () => true) {
      let t = this.queue.findIndex(e);
      if (t === -1) {
        return;
      }
      return this.queue.splice(t, 1)[0];
    }
    receive(e = () => true) {
      let t = this.queue.findIndex(e);
      if (t !== -1) {
        let n = this.queue.splice(t, 1)[0];
        if (n) {
          this.notify();
          return Promise.resolve(n);
        }
      }
      return new Promise(n => {
        this.waiters.push({
          fn: e,
          resolve: n
        });
      });
    }
    subscribe = this.changed.subscribe;
    notify() {
      this.changed.emit();
    }
  }
  var uVa = __lazy(() => {
    ph();
  });
  function mVa(e) {
    let t = dVa.c(3);
    let {
      children: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = new Hwo();
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = r;
    let s;
    if (t[1] !== n) {
      s = hVa.jsx(pVa.Provider, {
        value: o,
        children: n
      });
      t[1] = n;
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  function fVa() {
    let e = N5n.useContext(pVa);
    if (!e) {
      throw Error("useMailbox must be used within a MailboxProvider");
    }
    return e;
  }
  var dVa;
  var N5n;
  var hVa;
  var pVa;
  var jwo = __lazy(() => {
    uVa();
    dVa = __toESM(pt(), 1);
    N5n = __toESM(ot(), 1);
    hVa = __toESM(ie(), 1);
    pVa = N5n.createContext(undefined);
  });
  function Agt(e) {
    let t = L5n.useRef(e);
    t.current = e;
    L5n.useEffect(() => fM.subscribe(n => {
      let r = getInitialSettings();
      t.current(n, r);
    }), []);
  }
  var L5n;
  var F5n = __lazy(() => {
    ode();
    L5n = __toESM(ot(), 1);
  });
  function E8p(e) {
    return M8e.join(gVa(), `${e}.json`);
  }
  function gVa() {
    let e = getSessionProjectDir() ?? ty(getOriginalCwd());
    return M8e.join(e, getSessionId(), "workflows");
  }
  function hz(e) {
    let t = getSessionProjectDir() ?? ty(getOriginalCwd());
    return M8e.join(t, getSessionId(), "subagents", "workflows", e);
  }
  async function yVa(e, t) {
    try {
      let n = {
        runId: e,
        timestamp: new Date().toISOString(),
        ...t
      };
      let r = E8p(e);
      await GNe.mkdir(M8e.dirname(r), {
        recursive: true,
        mode: 448
      });
      await GNe.writeFile(r, De(n), {
        encoding: "utf8",
        mode: 384
      });
    } catch (n) {
      logForDebugging(`Failed to write workflow snapshot ${e}: ${n instanceof Error ? n.message : n}`);
    }
  }
  async function _Va() {
    let e = gVa();
    let t;
    try {
      t = await GNe.readdir(e);
    } catch {
      return [];
    }
    let n = (await Promise.all(t.filter(r => r.endsWith(".json")).map(async r => {
      try {
        let o = await GNe.readFile(M8e.join(e, r), "utf8");
        let s = qt(o);
        let i = s.runId ?? r.replace(/\.json$/, "");
        return {
          runId: i,
          taskId: s.taskId ?? i,
          timestamp: s.timestamp ?? new Date(0).toISOString(),
          script: s.script ?? "",
          scriptPath: s.scriptPath,
          args: s.args,
          result: s.result,
          agentCount: s.agentCount ?? 0,
          logs: s.logs ?? [],
          durationMs: s.durationMs ?? 0,
          error: s.error,
          summary: s.summary,
          workflowName: s.workflowName,
          title: s.title,
          status: s.status ?? (s.error ? "failed" : "completed"),
          startTime: s.startTime ?? (Date.parse(s.timestamp ?? "") || 0),
          phases: s.phases,
          defaultModel: s.defaultModel,
          workflowProgress: s.workflowProgress ?? [],
          totalTokens: s.totalTokens ?? 0,
          totalToolCalls: s.totalToolCalls ?? 0
        };
      } catch (o) {
        logForDebugging(`Failed to parse workflow snapshot ${r}: ${o instanceof Error ? o.message : o}`);
        return null;
      }
    }))).filter(r => r !== null);
    n.sort((r, o) => o.startTime - r.startTime);
    return n;
  }
  var GNe;
  var M8e;
  var VNe = __lazy(() => {
    at();
    je();
    Fy();
    GNe = require("fs/promises");
    M8e = require("path");
  });
  var Kwo = {};