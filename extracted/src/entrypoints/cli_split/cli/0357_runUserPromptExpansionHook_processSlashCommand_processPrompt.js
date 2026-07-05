  __export(fbl, {
    REMOTE_CONTROL_DISCONNECTED_MSG: () => "Remote Control disconnected.",
    BRIDGE_SESSION_ENDED_DETAIL: () => "session ended",
    BRIDGE_LOGIN_INSTRUCTION: () => "Remote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.",
    BRIDGE_LOGIN_HINT: () => "/login",
    BRIDGE_LOGIN_ERROR: () => "Error: You must be logged in to use Remote Control.\n\nRemote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account."
  });
  function bKe() {
    let [e, t] = gQn.useReducer(n => n + 1, 0);
    gQn.useEffect(() => onGrowthBookRefresh(t), []);
    return e;
  }
  var gQn;
  var yQn = __lazy(() => {
    $n();
    gQn = __toESM(ot(), 1);
  });
  function _Qn(e, t) {
    for (let n of [e, t]) {
      if (n == null) {
        continue;
      }
      if (isExemptDefaultResolvingPick(n) || (isModelAllowedUnderActiveEnforcement(n) ?? isModelAllowed(n))) {
        return n;
      }
    }
    return getDefaultMainLoopModelSetting();
  }
  function MSt() {
    let e = bt(o => o.mainLoopModel);
    let t = bt(o => o.mainLoopModelForSession);
    let n = bKe();
    let r = K_();
    return KDo.useMemo(() => _Qn(t, e), [t, e, n, r]);
  }
  function dR() {
    let e = bt(o => o.mainLoopModel);
    let t = bt(o => o.mainLoopModelForSession);
    let n = bKe();
    let r = K_();
    return KDo.useMemo(() => parseUserSpecifiedModel(_Qn(t, e)), [t, e, n, r]);
  }
  var KDo;
  var iH = __lazy(() => {
    ho();
    Eo();
    YN();
    yQn();
    Qq();
    KDo = __toESM(ot(), 1);
  });
  function bQn() {
    setStartupPolicySnapshot(structuredClone(getSettingsForSource("policySettings")));
  }
  function SQn() {
    let e = getStartupPolicySnapshot();
    if (e === undefined) {
      return true;
    }
    return !Bun.deepEquals(e, getSettingsForSource("policySettings"));
  }
  var TQn = __lazy(() => {
    at();
  });
  function hbl() {
    YDo = false;
  }
  function gbl() {
    if (YDo) {
      return;
    }
    if (YDo = true, st(process.env.CLAUDE_CODE_USE_BEDROCK) || st(process.env.CLAUDE_CODE_USE_VERTEX) || st(process.env.CLAUDE_CODE_USE_FOUNDRY) || st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) || st(process.env.CLAUDE_CODE_USE_MANTLE) || getGatewayAuth()) {
      return;
    }
    if (process.env.HTTPS_PROXY || process.env.https_proxy || process.env.HTTP_PROXY || process.env.http_proxy || process.env.ANTHROPIC_UNIX_SOCKET || process.env.CLAUDE_CODE_CLIENT_CERT || process.env.CLAUDE_CODE_CLIENT_KEY) {
      return;
    }
    let e = process.env.ANTHROPIC_BASE_URL || getOauthConfig().BASE_API_URL;
    fetch(e, {
      method: "HEAD",
      signal: AbortSignal.timeout(1e4)
    }).catch(() => {});
  }
  var YDo = false;
  var JDo = __lazy(() => {
    at();
    Uc();
    gn();
  });
  function ybl() {
    XDo.clear();
  }
  async function x7t(e, t) {
    let n = e.trim();
    if (!n) {
      return {
        valid: false,
        error: "Model name cannot be empty"
      };
    }
    if (!isModelAllowed(n)) {
      return {
        valid: false,
        error: `Model '${n}' is not in the list of available models`
      };
    }
    if (!t?.forceServerProbe) {
      let r = n.toLowerCase();
      if (u_e.includes(r)) {
        return {
          valid: true
        };
      }
      if (n === process.env.ANTHROPIC_CUSTOM_MODEL_OPTION) {
        return {
          valid: true
        };
      }
      if (XDo.vZc(n)) {
        return {
          valid: true
        };
      }
    }
    try {
      await BU({
        model: n,
        max_tokens: 1,
        maxRetries: 0,
        querySource: "model_validation",
        messages: [{
          role: "user",
          content: [{
            type: "text",
            text: "Hi",
            cache_control: {
              type: "ephemeral"
            }
          }]
        }]
      });
      XDo.set(n, true);
      return {
        valid: true
      };
    } catch (r) {
      return uTm(r, n);
    }
  }
  function uTm(e, t) {
    if (e instanceof w$e) {
      let r = dTm(t);
      let o = r ? `. Try '${r}' instead` : "";
      return {
        valid: false,
        error: `Model '${t}' not found${o}`,
        notFound: true
      };
    }
    if (e instanceof Ho) {
      if (e instanceof v$e) {
        return {
          valid: false,
          error: "Authentication failed. Please check your API credentials."
        };
      }
      if (e instanceof ik) {
        return {
          valid: false,
          error: "Network error. Please check your internet connection."
        };
      }
      let r = e.error;
      if (r && typeof r === "object" && "type" in r && r.type === "not_found_error" && "message" in r && typeof r.message === "string" && r.message.includes("model:")) {
        return {
          valid: false,
          error: `Model '${t}' not found`,
          notFound: true
        };
      }
      return {
        valid: false,
        error: `API error: ${e.message}`
      };
    }
    return {
      valid: false,
      error: `Unable to validate model: ${e instanceof Error ? e.message : String(e)}`
    };
  }
  function dTm(e) {
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
  var XDo;
  var EQn = __lazy(() => {
    Tk();
    YN();
    Ds();
    xme();
    CN();
    d_();
    sne();
    XDo = new Map();
  });
  function vQn(e) {
    if (resetModelStrings(), I8(), ybl(), dqe.cache?.clear?.(), QAe.cache?.clear?.(), x8.cache?.clear?.(), clearAwsCredentialsCache(), clearGcpCredentialsCache(), hbl(), resetDatadogInit(), e === "firstParty") {
      refreshGrowthBookFeatures();
    }
  }
  var QDo = __lazy(() => {
    at();
    xJ();
    $n();
    JDo();
    no();
    DC();
    je();
    Hle();
    WBt();
    EQn();
  });
  async function A7t(e, t) {
    if (eMo) {
      return;
    }
    if (eMo = true, !e.isBypassPermissionsModeAvailable) {
      return;
    }
    if (!(await shouldDisableBypassPermissions())) {
      return;
    }
    t(r => createDisabledBypassPermissionsContext(r));
  }
  function _bl() {
    eMo = false;
  }
  function bbl() {
    let e = bt(n => n.toolPermissionContext);
    let t = Lo();
    k7t.useEffect(() => {
      if (getIsRemoteMode()) {
        return;
      }
      A7t(e, n => t(r => ({
        ...r,
        toolPermissionContext: n(r.toolPermissionContext)
      })));
    }, []);
  }
  async function I7t(e, t, n, r) {
    {
      if (tMo) {
        return;
      }
      tMo = true;
      let {
        updateContext: o,
        notification: s
      } = await verifyAutoModeGateAccess(e, n);
      if (t(i => {
        let a = o(i.toolPermissionContext);
        let l = a === i.toolPermissionContext ? i : {
          ...i,
          toolPermissionContext: a
        };
        if (!s || r) {
          return l;
        }
        return {
          ...l,
          notifications: {
            ...l.notifications,
            queue: [...l.notifications.queue, {
              key: "auto-mode-gate-notification",
              text: s,
              color: "warning",
              priority: "high"
            }]
          }
        };
      }), s && r) {
        r({
          key: "auto-mode-gate-notification",
          text: s,
          color: "warning",
          priority: "high"
        });
      }
    }
  }
  function nMo() {
    tMo = false;
  }
  function Sbl() {
    let e = bt(a => a.mainLoopModel);
    let t = bt(a => a.mainLoopModelForSession);
    let n = bt(a => a.fastMode);
    let r = Lo();
    let o = Ec();
    let {
      addNotification: s
    } = Fi();
    let i = k7t.useRef(true);
    k7t.useEffect(() => {
      if (getIsRemoteMode()) {
        return;
      }
      if (i.current) {
        i.current = false;
      } else {
        nMo();
      }
      I7t(o.getState().toolPermissionContext, r, n, s);
    }, [e, t, n]);
  }
  var k7t;
  var eMo = false;
  var tMo = false;
  var rMo = __lazy(() => {
    Nd();
    ho();
    at();
    S_();
    k7t = __toESM(ot(), 1);
  });
  var oMo = {};
  __export(oMo, {
    runPostLoginHooks: () => runPostLoginHooks,
    loginAutoContinueOptions: () => loginAutoContinueOptions,
    getLoginStartingMessage: () => getLoginStartingMessage,
    call: () => call_export2,
    Login: () => Login
  });
  async function runPostLoginHooks(e, t, n) {
    if (e.onChangeAPIKey(), e.applyMessageOp({
      type: "update",
      updater: sMo
    }), !t) {
      return {
        bridgeDisconnected: false,
        accountSwitched: false,
        relaunching: false
      };
    }
    if (resetCostState(), getAPIProvider() === "gateway") {
      if (!(await V8e()) || SQn()) {
        rVd.get(process.stdout)?.unmount();
        Promise.resolve().then(() => (bze(), _ze)).then(m => m.execRelaunch()).catch(m => Oe(sr(m)));
        return {
          bridgeDisconnected: false,
          accountSwitched: false,
          relaunching: true
        };
      }
      vQn("gateway");
      applyConfigEnvironmentVariables();
      getTenguSandboxGbConfig.cache?.clear?.();
    } else {
      V8e();
    }
    refreshPolicyLimits();
    _Ie();
    refreshGrowthBookAfterAuthChange();
    let r = n?.previousAccount;
    let o = getOauthAccountInfo();
    let s = r?.accountUuid !== undefined && r.accountUuid === o?.accountUuid && r.organizationUuid === o?.organizationUuid;
    let {
      replBridgeEnabled: i,
      replBridgeOutboundOnly: a,
      replBridgeError: l
    } = e.getAppState();
    let c = r?.accountUuid !== undefined && !s;
    let u = c && (i || l !== undefined);
    let d = c && i && !a;
    if (u) {
      logForDebugging("[bridge:repl] Account changed via /login \u2014 disconnecting Remote Control session");
      e.setAppState(m => ({
        ...m,
        replBridgeEnabled: false,
        replBridgeExplicit: false,
        replBridgeOutboundOnly: false,
        replBridgeError: undefined,
        notifications: ojt(m.notifications, G9)
      }));
    }
    if (s && (await readStoredTrustedDeviceToken())) {
      logForDebugging("[trusted-device] Same account+org re-login with existing token, skipping re-enrollment");
    } else {
      clearTrustedDeviceToken();
      let m = enrollTrustedDevice();
      if (n?.awaitEnrollment) {
        await m;
      }
    }
    _bl();
    let p = e.getAppState();
    A7t(getToolPermissionContext(e), e.setToolPermissionContext);
    nMo();
    I7t(getToolPermissionContext(e), e.setAppState, p.fastMode);
    e.setAppState(m => ({
      ...m,
      authVersion: m.authVersion + 1
    }));
    return {
      bridgeDisconnected: d,
      accountSwitched: c,
      relaunching: false
    };
  }
  function loginAutoContinueOptions(e, t) {
    if (t.accountSwitched || t.relaunching) {
      return;
    }
    let n = Yk(e.messages);
    if (n?.isApiErrorMessage && n.error === "authentication_failed") {
      return {
        display: "system",
        shouldQuery: true
      };
    }
    return;
  }
  function getLoginStartingMessage() {
    return process.env.CLAUDE_CODE_OAUTH_TOKEN ? "Warning: CLAUDE_CODE_OAUTH_TOKEN is set in your environment and will override this login token at runtime. After logging in, unset that variable for your new credentials to take effect." : undefined;
  }
  async function call_export2(e, t) {
    let n = getLoginStartingMessage();
    let r = getOauthAccountInfo();
    let o = r && {
      accountUuid: r.accountUuid,
      organizationUuid: r.organizationUuid
    };
    return SKe.jsx(Login, {
      startingMessage: n,
      onDone: async s => {
        let i = await runPostLoginHooks(t, s, {
          previousAccount: o
        });
        e(s ? i.bridgeDisconnected ? `Login successful. ${"Remote Control disconnected."}` : "Login successful" : "Login interrupted", s ? loginAutoContinueOptions(t, i) : undefined);
      }
    });
  }
  function Login(e) {
    let t = Tbl.c(21);
    let n = dR();
    let r = nE();
    let [o, s] = Ebl.useState(false);
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = () => s(true);
      t[0] = i;
    } else {
      i = t[0];
    }
    let a = i;
    let l;
    if (t[1] !== o || t[2] !== n || t[3] !== e) {
      l = () => e.onDone(o, n);
      t[1] = o;
      t[2] = n;
      t[3] = e;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      u = {
        context: "Settings"
      };
      t[5] = u;
    } else {
      u = t[5];
    }
    uo("confirm:no", c, u);
    let d = Eg();
    let p = o && !d.pending;
    let m;
    if (t[6] !== d.keyName || t[7] !== d.pending) {
      m = d.pending ? SKe.jsxs(Text, {
        children: ["Press ", d.keyName, " again to exit"]
      }) : SKe.jsx(Wr, {
        action: "confirm:no",
        context: "Settings",
        fallback: "Esc",
        description: "cancel"
      });
      t[6] = d.keyName;
      t[7] = d.pending;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f;
    if (t[9] !== n || t[10] !== e) {
      f = () => e.onDone(true, n);
      t[9] = n;
      t[10] = e;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h = r ? 1 : 2;
    let g;
    if (t[12] !== e.startingMessage || t[13] !== f || t[14] !== h) {
      g = SKe.jsx(ConsoleOAuthFlow, {
        onDone: f,
        onAuthSuccess: a,
        startingMessage: e.startingMessage,
        urlOutdent: h
      });
      t[12] = e.startingMessage;
      t[13] = f;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== c || t[17] !== p || t[18] !== m || t[19] !== g) {
      y = SKe.jsx(or, {
        title: "Login",
        onCancel: c,
        color: "permission",
        isCancelActive: false,
        hideInputGuide: p,
        inputGuide: m,
        children: g
      });
      t[16] = c;
      t[17] = p;
      t[18] = m;
      t[19] = g;
      t[20] = y;
    } else {
      y = t[20];
    }
    return y;
  }
  var Tbl;
  var Ebl;
  var SKe;
  var LSt = __lazy(() => {
    at();
    yse();
    CQ();
    Sd();
    bKt();
    Ii();
    oE();
    rE();
    Nd();
    mO();
    iH();
    et();
    Bs();
    $n();
    q$();
    z8e();
    TQn();
    QDo();
    no();
    Sl();
    je();
    dt();
    Rn();
    qEe();
    ro();
    Ds();
    rMo();
    Th();
    Bne();
    Tbl = __toESM(pt(), 1);
    Ebl = __toESM(ot(), 1);
    SKe = __toESM(ie(), 1);
  });
  async function wbl(e) {
    return vl("api_admin_request_create", async () => {
      let t = await _s.post("/api/oauth/organizations/:orgUUID/admin_requests", e, {
        auth: "teleport-org"
      });
      if (!t.ok) {
        throw Error(t.reason === "no-auth" ? t.detail : `admin_requests: ${t.reason}`);
      }
      return t.data;
    });
  }
  async function Cbl(e, t) {
    return vl("api_admin_request_list", async () => {
      let n = new URLSearchParams({
        request_type: e
      });
      for (let o of t) {
        n.append("statuses", o);
      }
      let r = await _s.get(`/api/oauth/organizations/:orgUUID/admin_requests/me?${n}`, {
        auth: "teleport-org"
      });
      if (!r.ok) {
        throw Error(r.reason === "no-auth" ? r.detail : `admin_requests/me: ${r.reason}`);
      }
      return r.data;
    });
  }
  async function Rbl(e) {
    return vl("api_admin_request_eligibility", async () => {
      let t = await _s.get(`/api/oauth/organizations/:orgUUID/admin_requests/eligibility?request_type=${e}`, {
        auth: "teleport-org"
      });
      if (!t.ok) {
        throw Error(t.reason === "no-auth" ? t.detail : `admin_requests/eligibility: ${t.reason}`);
      }
      return t.data;
    });
  }
  var xbl = __lazy(() => {
    ln();
    bg();
  });
  function kbl(e) {
    if (!NP.isAxiosError(e)) {
      return null;
    }
    let t = e.response?.status;
    if (typeof t !== "number" || t >= 500) {
      return null;
    }
    let n = e.response?.data;
    if (!n || typeof n !== "object") {
      return null;
    }
    let r = n;
    let o = r.error;
    if (o && typeof o === "object") {
      let s = o.message;
      if (typeof s === "string" && s.length > 0) {
        return s;
      }
    }
    for (let s of ["message", "detail"]) {
      let i = r[s];
      if (typeof i === "string" && i.length > 0) {
        return i;
      }
    }
    return null;
  }
  function D7t() {
    {
      let e = getSubscriptionType();
      let t = vI() !== null;
      let n = getFeatureValue_CACHED_MAY_BE_STALE("tengu_ember_latch", false) || t;
      let r = t || (e === "pro" || e === "max") && isOverageProvisioningAllowed() && !Vi();
      return n && r;
    }
    return false;
  }
  async function FSt(e = {
    openInBrowser: true
  }) {
    let t = getSubscriptionType();
    let n = t === "team" || t === "enterprise";
    if (!av() && n) {
      let s;
      try {
        s = (await Ide())?.extra_usage;
      } catch (i) {
        logForDebugging(`extra-usage: fetchUtilization failed, falling through to ask user: ${i}`, {
          level: "error"
        });
      }
      switch (s?.disabled_reason) {
        case "out_of_credits":
          return {
            type: "message",
            value: "Your organization is out of usage credits. Contact your admin to add more."
          };
        case "org_level_disabled_until":
        case "org_spend_cap_reached":
          return {
            type: "message",
            value: "Your organization's usage credit cap is reached for this period. Contact your admin to raise it."
          };
        default:
      }
      if (s?.is_enabled && s.monthly_limit === null) {
        return {
          type: "message",
          value: "Your organization already has unlimited usage credits. No request needed."
        };
      }
      try {
        if ((await Rbl("limit_increase"))?.is_allowed === false) {
          return {
            type: "message",
            value: "Contact your admin to manage usage credit settings."
          };
        }
      } catch (i) {
        logForDebugging(`Extra usage eligibility check failed: ${i}`, {
          level: "error"
        });
      }
      try {
        let i = await Cbl("limit_increase", ["pending", "dismissed"]);
        if (i && i.length > 0) {
          return {
            type: "message",
            value: "You've already sent a usage credit request to your admin."
          };
        }
      } catch (i) {
        logForDebugging(`Failed to fetch pending admin requests: ${i}`, {
          level: "error"
        });
      }
      try {
        await wbl({
          request_type: "limit_increase",
          details: null
        });
        return {
          type: "message",
          value: s?.is_enabled ? "Request sent to your admin to increase your usage credit limit." : "Request sent to your admin to turn on usage credits."
        };
      } catch (i) {
        let a = kbl(i);
        if (M_(i, l => kbl(l) !== null)) {
          logForDebugging(`Admin request rejected: ${a ?? he(i)}`, {
            level: "error"
          });
        } else {
          Oe(i);
        }
        if (a) {
          return {
            type: "message",
            value: a
          };
        }
      }
      return {
        type: "message",
        value: "Contact your admin to manage usage credit settings."
      };
    }
    let o = n ? "https://claude.ai/admin-settings/usage" : "https://claude.ai/settings/usage";
    if (!e.openInBrowser) {
      return {
        type: "browser-opened",
        url: o,
        opened: false
      };
    }
    try {
      let s = await Ac(o);
      return {
        type: "browser-opened",
        url: o,
        opened: s
      };
    } catch (s) {
      logForDebugging(`Failed to open browser for ${o}: ${s}`, {
        level: "error"
      });
      return {
        type: "message",
        value: `Couldn't open your browser. Visit ${o} to manage usage credits.`
      };
    }
  }
  var CQn = __lazy(() => {
    Dp();
    $n();
    xbl();
    ETe();
    jle();
    no();
    vF();
    ky();
    je();
    dt();
    Rn();
    Wd();
  });
  function oZ(e) {
    let t = iMo.c(26);
    let n;
    if (t[0] !== e) {
      n = e === undefined ? {} : e;
      t[0] = e;
      t[1] = n;
    } else {
      n = t[1];
    }
    let {
      pose: r
    } = n;
    let o = r === undefined ? "default" : r;
    if (useIsScreenReaderEnabled()) {
      return null;
    }
    if (Me.terminal === "Apple_Terminal") {
      let y;
      if (t[2] !== o) {
        y = WO.jsx(hTm, {
          pose: o
        });
        t[2] = o;
        t[3] = y;
      } else {
        y = t[3];
      }
      return y;
    }
    let i = mTm[o];
    let a;
    if (t[4] !== i.r1L) {
      a = WO.jsx(Text, {
        color: "clawd_body",
        children: i.r1L
      });
      t[4] = i.r1L;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== i.r1E) {
      l = WO.jsx(Text, {
        color: "clawd_body",
        backgroundColor: "clawd_background",
        children: i.r1E
      });
      t[6] = i.r1E;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== i.r1R) {
      c = WO.jsx(Text, {
        color: "clawd_body",
        children: i.r1R
      });
      t[8] = i.r1R;
      t[9] = c;
    } else {
      c = t[9];
    }
    let u;
    if (t[10] !== a || t[11] !== l || t[12] !== c) {
      u = WO.jsxs(Text, {
        children: [a, l, c]
      });
      t[10] = a;
      t[11] = l;
      t[12] = c;
      t[13] = u;
    } else {
      u = t[13];
    }
    let d;
    if (t[14] !== i.r2L) {
      d = WO.jsx(Text, {
        color: "clawd_body",
        children: i.r2L
      });
      t[14] = i.r2L;
      t[15] = d;
    } else {
      d = t[15];
    }
    let p;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      p = WO.jsx(Text, {
        color: "clawd_body",
        backgroundColor: "clawd_background",
        children: "\u2588\u2588\u2588\u2588\u2588"
      });
      t[16] = p;
    } else {
      p = t[16];
    }
    let m;
    if (t[17] !== i.r2R) {
      m = WO.jsx(Text, {
        color: "clawd_body",
        children: i.r2R
      });
      t[17] = i.r2R;
      t[18] = m;
    } else {
      m = t[18];
    }
    let f;
    if (t[19] !== d || t[20] !== m) {
      f = WO.jsxs(Text, {
        children: [d, p, m]
      });
      t[19] = d;
      t[20] = m;
      t[21] = f;
    } else {
      f = t[21];
    }
    let h;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      h = WO.jsxs(Text, {
        color: "clawd_body",
        children: ["  ", "\u2598\u2598 \u259D\u259D", "  "]
      });
      t[22] = h;
    } else {
      h = t[22];
    }
    let g;
    if (t[23] !== f || t[24] !== u) {
      g = WO.jsxs(gXd, {
        flexDirection: "column",
        flexShrink: 0,
        children: [u, f, h]
      });
      t[23] = f;
      t[24] = u;
      t[25] = g;
    } else {
      g = t[25];
    }
    return g;
  }
  function hTm(e) {
    let t = iMo.c(10);
    let {
      pose: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = WO.jsx(Text, {
        color: "clawd_body",
        children: "\u2597"
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = fTm[n];
    let s;
    if (t[1] !== o) {
      s = WO.jsx(Text, {
        color: "clawd_background",
        backgroundColor: "clawd_body",
        children: o
      });
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      i = WO.jsx(Text, {
        color: "clawd_body",
        children: "\u2596"
      });
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== s) {
      a = WO.jsxs(Text, {
        children: [r, s, i]
      });
      t[4] = s;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    let c;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      l = WO.jsx(Text, {
        backgroundColor: "clawd_body",
        children: " ".repeat(7)
      });
      c = WO.jsx(Text, {
        color: "clawd_body",
        children: "\u2598\u2598 \u259D\u259D"
      });
      t[6] = l;
      t[7] = c;
    } else {
      l = t[6];
      c = t[7];
    }
    let u;
    if (t[8] !== a) {
      u = WO.jsxs(gXd, {
        flexDirection: "column",
        alignItems: "center",
        children: [a, l, c]
      });
      t[8] = a;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  var iMo;
  var WO;
  var mTm;
  var fTm;
  var M7t = __lazy(() => {
    et();
    pr();
    iMo = __toESM(pt(), 1);
    WO = __toESM(ie(), 1);
    mTm = {
      default: {
        r1L: " \u2590",
        r1E: "\u259B\u2588\u2588\u2588\u259C",
        r1R: "\u258C",
        r2L: "\u259D\u259C",
        r2R: "\u259B\u2598"
      },
      "look-left": {
        r1L: " \u2590",
        r1E: "\u259F\u2588\u2588\u2588\u259F",
        r1R: "\u258C",
        r2L: "\u259D\u259C",
        r2R: "\u259B\u2598"
      },
      "look-right": {
        r1L: " \u2590",
        r1E: "\u2599\u2588\u2588\u2588\u2599",
        r1R: "\u258C",
        r2L: "\u259D\u259C",
        r2R: "\u259B\u2598"
      },
      "arms-up": {
        r1L: "\u2597\u259F",
        r1E: "\u259B\u2588\u2588\u2588\u259C",
        r1R: "\u2599\u2596",
        r2L: " \u259C",
        r2R: "\u259B "
      }
    };
    fTm = {
      default: " \u2597   \u2596 ",
      "look-left": " \u2598   \u2598 ",
      "look-right": " \u259D   \u259D ",
      "arms-up": " \u2597   \u2596 "
    };
  });
  function pR(e, t, n, r) {
    return Array.from({
      length: n
    }, () => ({
      pose: e,
      offset: t,
      x: r
    }));
  }
  function lMo(e) {
    return [{
      pose: "default",
      offset: 1,
      x: e,
      poof: "dot"
    }, {
      pose: "default",
      offset: 1,
      x: e,
      poof: "wave"
    }];
  }
  function yTm(e, t) {
    if (!t || e.length === 0) {
      return e;
    }
    let n = e[0];
    let r = n.x !== undefined && n.x !== 0 ? n : Mbl;
    let o = Math.max(1, Math.round(t / 60));
    return [...Array.from({
      length: o
    }, () => r), ...e];
  }
  function TKe(e) {
    let t = Obl.c(15);
    let n;
    if (t[0] !== e) {
      n = e === undefined ? {} : e;
      t[0] = e;
      t[1] = n;
    } else {
      n = t[1];
    }
    let {
      autoplay: r,
      sequence: o,
      delayMs: s,
      onComplete: i
    } = n;
    let a = r === undefined ? false : r;
    let {
      pose: l,
      bounceOffset: c,
      x: u,
      poof: d,
      onClick: p
    } = ETm(a, o, s, i);
    let m;
    if (t[2] !== l) {
      m = Wz.jsx(oZ, {
        pose: l
      });
      t[2] = l;
      t[3] = m;
    } else {
      m = t[3];
    }
    let f;
    if (t[4] !== c || t[5] !== m || t[6] !== u) {
      f = Wz.jsx(gXd, {
        marginTop: c,
        marginLeft: u,
        flexShrink: 0,
        children: m
      });
      t[4] = c;
      t[5] = m;
      t[6] = u;
      t[7] = f;
    } else {
      f = t[7];
    }
    let h;
    if (t[8] !== c || t[9] !== d) {
      h = d && c > 0 ? Wz.jsxs(Wz.Fragment, {
        children: [Wz.jsx(gXd, {
          position: "absolute",
          top: 3 - 1,
          left: 0,
          children: Wz.jsx(Text, {
            color: "inactive",
            children: Abl[d]
          })
        }), Wz.jsx(gXd, {
          position: "absolute",
          top: 3 - 1,
          right: 0,
          children: Wz.jsx(Text, {
            color: "inactive",
            children: Abl[d]
          })
        })]
      }) : null;
      t[8] = c;
      t[9] = d;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] !== p || t[12] !== f || t[13] !== h) {
      g = Wz.jsx(Decorative, {
        children: Wz.jsxs(gXd, {
          height: 3,
          width: 9,
          flexDirection: "column",
          flexShrink: 0,
          overflow: "hidden",
          onClick: p,
          children: [f, h]
        })
      });
      t[11] = p;
      t[12] = f;
      t[13] = h;
      t[14] = g;
    } else {
      g = t[14];
    }
    return g;
  }
  function ETm(e, t, n, r) {
    let o = useIsScreenReaderEnabled();
    let [s] = qme.useState(() => WC(getInitialSettings().prefersReducedMotion) || o);
    let i = (e || t !== undefined) && !s;
    let [a, l] = qme.useState(i ? 0 : -1);
    let c = qme.useRef(yTm(t ? Pbl[t] : e ? gTm : RQn, t ? n : undefined));
    let u = qme.useRef(r);
    u.current = r;
    let d = qme.useRef(!t);
    let p = useClock();
    qme.useEffect(() => {
      if (s) {
        u.current?.();
      }
    }, [s]);
    let m = () => {
      if (e || s || a !== -1 || !d.current) {
        return;
      }
      c.current = Ibl[Math.floor(Math.random() * Ibl.length)];
      l(0);
    };
    qme.useEffect(() => {
      if (a === -1) {
        return;
      }
      if (a >= c.current.length) {
        d.current = true;
        u.current?.();
        l(e && !t ? 0 : -1);
        return;
      }
      return p.setTimeout(() => l(_Tm), 60);
    }, [a, e, t, p]);
    let f = c.current;
    let h = t ? Pbl[t].at(-1) : Mbl;
    let g = a >= 0 && a < f.length ? f[a] : h;
    return {
      pose: g.pose,
      bounceOffset: g.offset,
      x: g.x ?? 0,
      poof: g.poof,
      onClick: m
    };
  }
  var Obl;
  var qme;
  var Wz;
  var Abl;
  var RQn;
  var Dbl;
  var gTm;
  var Ibl;
  var Mbl;
  var _Tm = e => e + 1;
  var bTm;
  var STm;
  var TTm;
  var Pbl;
  var cMo = __lazy(() => {
    et();
    Dre();
    M7t();
    Obl = __toESM(pt(), 1);
    qme = __toESM(ot(), 1);
    Wz = __toESM(ie(), 1);
    Abl = {
      dot: "\xB7",
      wave: "~"
    };
    RQn = [...lMo(), ...pR("arms-up", 0, 3), ...pR("default", 0, 1), ...lMo(), ...pR("arms-up", 0, 3), ...pR("default", 0, 1)];
    Dbl = [...pR("look-right", 0, 5), ...pR("look-left", 0, 5), ...pR("default", 0, 1)];
    gTm = [...pR("default", 0, 12), ...pR("look-right", 0, 5), ...pR("look-left", 0, 5)];
    Ibl = [RQn, Dbl];
    Mbl = {
      pose: "default",
      offset: 0
    };
    bTm = [...RQn, ...pR("default", 1, 3)];
    STm = [...pR("look-left", 0, 2), ...pR("look-right", 0, 2), ...pR("look-left", 0, 2), ...pR("arms-up", 0, 3), ...pR("default", 0, 1)];
    TTm = [...pR("default", 1, 1, -9), ...pR("arms-up", 0, 2, -6), ...pR("default", 0, 1, -6), ...pR("default", 1, 1, -6), ...pR("arms-up", 0, 2, -3), ...pR("default", 0, 1, -3), ...pR("default", 1, 1, -3), ...pR("arms-up", 0, 2, 0), ...lMo(0), ...pR("default", 0, 1, 0)];
    Pbl = {
      jump: RQn,
      look: Dbl,
      celebrate: bTm,
      skip: TTm,
      spin: STm
    };
  });
  function USt(e) {
    let t = e.toUpperCase();
    return vTm[t] ?? `${t} `;
  }
  function Ky(e, t, n = "precise") {
    let r = t.toUpperCase();
    let o = USt(r);
    if (wTm.vZc(r)) {
      return `${o}${Math.round(e)}`;
    }
    let s = e / 100;
    if (n === "whole") {
      return `${o}${Math.round(s)}`;
    }
    if (n === "fit" && s % 1 === 0) {
      return `${o}${s}`;
    }
    return `${o}${s.toFixed(2)}`;
  }
  var vTm;
  var wTm;
  var Wve = __lazy(() => {
    vTm = {
      USD: "$",
      EUR: "\u20AC",
      GBP: "\xA3",
      JPY: "\xA5",
      BRL: "R$",
      CAD: "CA$",
      AUD: "A$",
      NZD: "NZ$",
      SGD: "S$"
    };
    wTm = new Set(["JPY", "KRW", "VND"]);
  });
  var Hbl = {};
  __export(Hbl, {
    PlainAwait: () => PlainAwait,
    ExtraUsageDialog: () => ExtraUsageDialog
  });
  function Fbl() {
    if (isFableFamilyOrPinnedModel(getMainLoopModel()) && xde() && !kde()) {
      SDe();
    }
  }
  function ExtraUsageDialog(e) {
    let t = e5.c(8);
    let {
      onDone: n,
      initialStep: r,
      entryReason: o,
      onBeforePurchase: s,
      onPurchaseSuccess: i
    } = e;
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = {
        s: "loading"
      };
      t[0] = a;
    } else {
      a = t[0];
    }
    let [l, c] = xh.useState(a);
    let u;
    if (t[1] !== o || t[2] !== r || t[3] !== s || t[4] !== n || t[5] !== i || t[6] !== l) {
      u = ds.jsx(Act, {
        children: ds.jsx(ATm, {
          onDone: n,
          step: l,
          setStep: c,
          initialStep: r,
          entryReason: o,
          onBeforePurchase: s,
          onPurchaseSuccess: i
        })
      });
      t[1] = o;
      t[2] = r;
      t[3] = s;
      t[4] = n;
      t[5] = i;
      t[6] = l;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  function ATm({
    onDone: e,
    step: t,
    setStep: n,
    initialStep: r,
    entryReason: o,
    onBeforePurchase: s,
    onPurchaseSuccess: i
  }) {
    let [a, l] = xh.useState("USD");
    let [c, u] = xh.useState([]);
    let [d, p] = xh.useState();
    let m = xh.useRef(e);
    xh.useEffect(() => {
      m.current = e;
    });
    let f = xh.useCallback(async (x = true) => {
      if (x) {
        n({
          s: "loading"
        });
      }
      try {
        let A = vI();
        let k;
        if (A) {
          k = {
            is_enabled: A.isEnabled,
            monthly_limit: A.spendLimitCents,
            used_credits: A.usedCents,
            currency: A.currency,
            utilization: A.spendLimitCents && A.spendLimitCents > 0 ? A.usedCents / A.spendLimitCents * 100 : 0
          };
        }
        let [I, O, M, L] = await Promise.all([k ? Promise.resolve(null) : Ide(), fpt(), tga(), ega()]);
        l((L?.currency ?? O?.currency ?? "USD").toUpperCase());
        let P = L?.bundles ?? [];
        if (u(P.length > 0 ? P : Zha), p(L?.stripe_product_id), !k && I === null) {
          n({
            s: "error",
            msg: "Couldn't load usage credit status \u2014 try /login if your session expired."
          });
          return;
        }
        if (k ??= I?.extra_usage ?? {
          is_enabled: false,
          monthly_limit: null,
          used_credits: null,
          utilization: null
        }, r === "buy_select") {
          if (!M) {
            logEvent("tengu_extra_usage_inline_dialog_fallback_browser", {
              reason: "no_payment_method"
            });
            m.current(`No card on file \u2014 add a payment method at ${"https://claude.ai/settings/usage"}`);
            return;
          }
          n({
            s: "buy_select",
            pm: M
          });
          return;
        }
        if (!w$n(k)) {
          n({
            s: "not_enabled",
            pm: M
          });
          return;
        }
        n({
          s: "enabled",
          usage: k,
          balance: O,
          pm: M
        });
      } catch (A) {
        logForDebugging(`Failed to load extra usage status: ${A}`, {
          level: "error"
        });
        n({
          s: "error",
          msg: "Couldn't load usage credit status"
        });
      }
    }, [n, r]);
    xh.useEffect(() => {
      logEvent("tengu_extra_usage_inline_dialog_shown", {
        entry_reason: o ? o : undefined
      });
      f();
    }, [f, o]);
    function h(x) {
      logEvent("tengu_extra_usage_inline_dialog_cancel", {
        from_step: x
      });
      e(undefined, {
        display: "skip"
      });
    }
    function g() {
      logEvent("tengu_extra_usage_inline_dialog_enable_confirm", {});
      n({
        s: "enabling",
        work: q$n().then(async x => {
          if (logEvent("tengu_extra_usage_inline_dialog_enable_result", {
            success: x
          }), !x) {
            return false;
          }
          if (!vI()) {
            Fbl();
            saveGlobalConfig(A => {
              if (!A.oauthAccount) {
                return A;
              }
              if (A.oauthAccount.hasExtraUsageEnabled === true) {
                return A;
              }
              return {
                ...A,
                oauthAccount: {
                  ...A.oauthAccount,
                  hasExtraUsageEnabled: true
                }
              };
            });
          }
          await f(false);
          return true;
        })
      });
    }
    function y(x) {
      if (!x) {
        n({
          s: "error",
          msg: "Couldn't turn on usage credits"
        });
      }
    }
    function _(x, A) {
      switch (x) {
        case "continue":
          e("Continuing with usage credits");
          break;
        case "buy":
          if (!A.pm) {
            logEvent("tengu_extra_usage_inline_dialog_fallback_browser", {
              reason: "no_payment_method"
            });
            e(`No card on file \u2014 add a payment method at ${"https://claude.ai/settings/usage"}`);
          } else {
            n({
              s: "buy_select",
              pm: A.pm
            });
          }
          break;
        case "adjust":
          n({
            s: "adjust_limit",
            current: A.usage.monthly_limit
          });
          break;
        case "auto_reload":
          if (!A.pm) {
            logEvent("tengu_extra_usage_inline_dialog_fallback_browser", {
              reason: "no_payment_method"
            });
            e(`No card on file \u2014 add a payment method at ${"https://claude.ai/settings/usage"}`);
          } else {
            n({
              s: "auto_reload_config",
              current: A.balance?.auto_reload_settings,
              pm: A.pm
            });
          }
          break;
        case "manage":
          Ac("https://claude.ai/settings/usage");
          e(`Opening ${"https://claude.ai/settings/usage"}`);
          break;
      }
    }
    function b(x, A, k) {
      logEvent("tengu_extra_usage_inline_dialog_auto_reload", {
        enabled: x,
        threshold_cents: A,
        reload_to_cents: k,
        currency: a
      });
      let I = Qha(x, A, k, a);
      let O = x ? I.then(async M => {
        if (M) {
          await f(false);
        }
        return M;
      }) : I;
      n({
        s: "auto_reload_saving",
        enabled: x,
        work: O
      });
    }
    function S(x, A) {
      if (!x) {
        n({
          s: "error",
          msg: "Failed to update auto-reload"
        });
        return;
      }
      if (!A) {
        f();
      }
    }
    async function E(x, A) {
      if (logEvent("tengu_extra_usage_inline_dialog_buy_confirm", {
        amount_cents: x,
        preset: !!A,
        currency: a
      }), n({
        s: "buy_purchasing"
      }), s) {
        if (!(await s().catch(() => false))) {
          n({
            s: "error",
            msg: "Couldn't turn on usage credits \u2014 no charge was made."
          });
          return;
        }
      }
      let k = A?.local_credit_minor_units ?? x;
      try {
        let I = await nga(A?.id ? {
          kind: "bundle",
          bundle: A
        } : {
          kind: "custom",
          amountCents: x
        });
        if (I.payment_status === "success") {
          logEvent("tengu_extra_usage_inline_dialog_buy_result", {
            status: "success"
          });
          n({
            s: "buy_success",
            credit: k
          });
        } else if (I.payment_status === "pending_invoice" && I.purchase_id) {
          n({
            s: "buy_polling",
            purchaseId: I.purchase_id,
            credit: k
          });
        } else if (I.payment_status === "requires_action") {
          logEvent("tengu_extra_usage_inline_dialog_buy_result", {
            status: "3ds_fallback"
          });
          n({
            s: "error",
            msg: `Your card requires additional verification \u2014 this purchase was not completed. Try again at ${"https://claude.ai/settings/usage"}`
          });
        } else {
          n({
            s: "error",
            msg: "Unexpected purchase state"
          });
        }
      } catch (I) {
        let O = j$n(I);
        if (M_(I, M => j$n(M) !== null)) {
          logForDebugging(`Extra usage credit purchase failed: ${O ?? he(I)}`, {
            level: "error"
          });
        } else {
          Oe(I);
        }
        logEvent("tengu_extra_usage_inline_dialog_buy_result", {
          status: "failed"
        });
        n({
          s: "error",
          msg: O ? `Purchase failed: ${O}` : "Purchase failed"
        });
      }
    }
    async function C(x, A) {
      if (logEvent("tengu_extra_usage_inline_dialog_adjust_limit", {
        old_cents: A ?? undefined,
        new_cents: x ?? undefined,
        unlimited: x === null,
        currency: a
      }), n({
        s: "adjusting"
      }), !(await W$n(x, a)).ok) {
        n({
          s: "error",
          msg: "Failed to update spend limit"
        });
        return;
      }
      e(x === null ? "Monthly limit set to unlimited" : `Monthly limit updated to ${Ky(x, a, "whole")}`);
    }
    switch (t.s) {
      case "loading":
        return ds.jsx(gXd, {
          paddingTop: 1,
          children: ds.jsx(Xc, {
            message: "Loading usage credit status\u2026"
          })
        });
      case "enabling":
        return ds.jsx(Bbl, {
          message: "Turning on usage credits\u2026",
          work: t.work,
          onDone: y
        });
      case "adjusting":
        return ds.jsx(gXd, {
          paddingTop: 1,
          children: ds.jsx(Xc, {
            message: "Updating spend limit\u2026"
          })
        });
      case "auto_reload_saving":
        return t.enabled ? ds.jsx(Bbl, {
          message: "Turning on auto-reload\u2026",
          work: t.work,
          onDone: x => S(x, true)
        }) : ds.jsx(PlainAwait, {
          message: "Turning off auto-reload\u2026",
          work: t.work,
          onDone: x => S(x, false)
        });
      case "buy_purchasing":
        return ds.jsx($bl, {
          message: "Processing payment\u2026 (may take a few seconds)"
        });
      case "buy_success":
        {
          let x = `Added ${Ky(t.credit, a)} of usage credits`;
          return ds.jsx(VTm, {
            message: x,
            onDone: () => (Fbl(), i ? i(x) : e(x))
          });
        }
      case "buy_polling":
        return ds.jsx(GTm, {
          purchaseId: t.purchaseId,
          onSuccess: () => n({
            s: "buy_success",
            credit: t.credit
          }),
          onError: x => n({
            s: "error",
            msg: x
          })
        });
      case "not_enabled":
        return ds.jsx(PTm, {
          pm: t.pm,
          onConfirm: g,
          onCancel: () => h("not_enabled")
        });
      case "enabled":
        return ds.jsx(OTm, {
          step: t,
          currency: a,
          onAction: x => _(x, t),
          onCancel: () => h("enabled")
        });
      case "buy_select":
        return ds.jsx(DTm, {
          pm: t.pm,
          presets: c,
          currency: a,
          onConfirm: x => n({
            s: "buy_confirm",
            pm: t.pm,
            cents: x.local_price_minor_units,
            bundle: x
          }),
          onCustom: () => n({
            s: "buy_custom",
            pm: t.pm
          }),
          onCancel: () => r === "buy_select" ? h("buy_select") : void f()
        });
      case "buy_custom":
        return ds.jsx(LTm, {
          pm: t.pm,
          initialCents: t.cents,
          currency: a,
          onConfirm: x => n({
            s: "buy_confirm",
            pm: t.pm,
            cents: x
          }),
          onCancel: () => n({
            s: "buy_select",
            pm: t.pm
          })
        });
      case "buy_confirm":
        return ds.jsx(MTm, {
          pm: t.pm,
          cents: t.cents,
          bundle: t.bundle,
          currency: a,
          stripeProductId: d,
          onConfirm: () => E(t.cents, t.bundle),
          onCancel: () => n(t.bundle ? {
            s: "buy_select",
            pm: t.pm
          } : {
            s: "buy_custom",
            pm: t.pm,
            cents: t.cents
          })
        });
      case "adjust_limit":
        return ds.jsx(FTm, {
          current: t.current,
          currency: a,
          onConfirm: x => C(x, t.current),
          onCancel: () => void f()
        });
      case "auto_reload_config":
        return ds.jsx($Tm, {
          current: t.current,
          pm: t.pm,
          currency: a,
          onSave: (x, A) => b(true, x, A),
          onTurnOff: () => b(false),
          onCancel: () => void f()
        });
      case "error":
        return ds.jsx(ITm, {
          msg: t.msg,
          onClose: () => h("error")
        });
    }
  }
  function ITm(e) {
    let t = e5.c(9);
    let {
      msg: n,
      onClose: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = {
        "confirm:yes": () => {
          Ac("https://claude.ai/settings/usage");
          r();
        }
      };
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        context: "Confirmation"
      };
      t[2] = s;
    } else {
      s = t[2];
    }
    jo(o, s);
    let i;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      i = ds.jsxs(Hn, {
        children: [ds.jsx(xt, {
          chord: "enter",
          action: `open ${"https://claude.ai/settings/usage"}`
        }), ds.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      });
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== n) {
      a = ds.jsx(gXd, {
        flexDirection: "column",
        gap: 1,
        children: ds.jsx(Text, {
          color: "error",
          children: n
        })
      });
      t[4] = n;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== r || t[7] !== a) {
      l = ds.jsx(or, {
        title: "Usage credits",
        onCancel: r,
        color: "error",
        inputGuide: i,
        children: a
      });
      t[6] = r;
      t[7] = a;
      t[8] = l;
    } else {
      l = t[8];
    }
    return l;
  }
  function BSt(e) {
    return `${e.brand ?? e.type} \xB7\xB7\xB7\xB7${e.last4 ?? ""}`;
  }
  function PTm(e) {
    let t = e5.c(15);
    let {
      pm: n,
      onConfirm: r,
      onCancel: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = ds.jsx(Text, {
        children: "Keep using Claude when you hit a limit."
      });
      t[0] = s;
    } else {
      s = t[0];
    }
    let i;
    if (t[1] !== n) {
      i = n ? `Card on file: ${BSt(n)}` : `No card on file \u2014 add one at ${"https://claude.ai/settings/usage"} before buying.`;
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== i) {
      a = ds.jsx(Text, {
        dimColor: true,
        children: i
      });
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      l = ds.jsxs(Text, {
        dimColor: true,
        children: ["By turning on, you agree to turn on usage credits as defined in our Help Center article:", `
`, "https://support.claude.com/en/articles/12429409-extra-usage-for-paid-claude-plans"]
      });
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== o || t[7] !== r) {
      c = ds.jsx(mc, {
        confirmLabel: "Turn on",
        cancelLabel: "Cancel",
        onConfirm: r,
        onCancel: o
      });
      t[6] = o;
      t[7] = r;
      t[8] = c;
    } else {
      c = t[8];
    }
    let u;
    if (t[9] !== a || t[10] !== c) {
      u = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [s, a, l, c]
      });
      t[9] = a;
      t[10] = c;
      t[11] = u;
    } else {
      u = t[11];
    }
    let d;
    if (t[12] !== o || t[13] !== u) {
      d = ds.jsx(or, {
        title: "Turn on usage credits",
        onCancel: o,
        color: "suggestion",
        children: u
      });
      t[12] = o;
      t[13] = u;
      t[14] = d;
    } else {
      d = t[14];
    }
    return d;
  }
  function OTm(e) {
    let t = e5.c(52);
    let {
      step: n,
      currency: r,
      onAction: o,
      onCancel: s
    } = e;
    let {
      columns: i
    } = Sr();
    let a = Math.min(i - 6, 50);
    let {
      usage: l,
      balance: c
    } = n;
    let u;
    if (t[0] !== r || t[1] !== l.used_credits) {
      u = l.used_credits !== null ? Ky(l.used_credits, r) : "\u2014";
      t[0] = r;
      t[1] = l.used_credits;
      t[2] = u;
    } else {
      u = t[2];
    }
    let d = u;
    let p;
    if (t[3] !== r || t[4] !== l.monthly_limit) {
      p = l.monthly_limit !== null ? Ky(l.monthly_limit, r, "whole") : "Unlimited";
      t[3] = r;
      t[4] = l.monthly_limit;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m = p;
    let f;
    if (t[6] !== l.utilization) {
      f = l.utilization !== null ? Math.round(l.utilization) : 0;
      t[6] = l.utilization;
      t[7] = f;
    } else {
      f = t[7];
    }
    let h = f;
    let g;
    if (t[8] !== c || t[9] !== r) {
      g = c ? Ky(c.amount, r) : "\u2014";
      t[8] = c;
      t[9] = r;
      t[10] = g;
    } else {
      g = t[10];
    }
    let y = g;
    let _ = c?.auto_reload_settings?.enabled === true;
    let b;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      let Q = new Date();
      b = new Date(Q.getFullYear(), Q.getMonth() + 1, 1).toLocaleDateString("en-US", {
        month: "short",
        day: "numeric"
      });
      t[11] = b;
    } else {
      b = t[11];
    }
    let S = b;
    let E = l.is_enabled === false;
    let C = `${y} balance \xB7 auto-reload ${_ ? "on" : "off"}
`;
    let x;
    if (t[12] !== C) {
      x = {
        label: C,
        value: "auto_reload"
      };
      t[12] = C;
      t[13] = x;
    } else {
      x = t[13];
    }
    let A;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      A = {
        label: "Buy more",
        value: "buy"
      };
      t[14] = A;
    } else {
      A = t[14];
    }
    let k;
    if (t[15] !== E) {
      k = E ? [] : [{
        label: "Continue with usage credits",
        value: "continue"
      }];
      t[15] = E;
      t[16] = k;
    } else {
      k = t[16];
    }
    let I;
    let O;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      I = {
        label: "Adjust monthly limit",
        value: "adjust"
      };
      O = {
        label: "Manage on claude.ai",
        value: "manage"
      };
      t[17] = I;
      t[18] = O;
    } else {
      I = t[17];
      O = t[18];
    }
    let M;
    if (t[19] !== x || t[20] !== k) {
      M = [x, A, ...k, I, O];
      t[19] = x;
      t[20] = k;
      t[21] = M;
    } else {
      M = t[21];
    }
    let L = M;
    let P;
    if (t[22] !== E || t[23] !== l.disabled_reason) {
      P = E && ds.jsx(Text, {
        color: "warning",
        children: l.disabled_reason === "out_of_credits" ? "Out of usage credits \u2014 buy more below to keep going." : "You've hit your monthly limit \u2014 raise it below, or it resets next month."
      });
      t[22] = E;
      t[23] = l.disabled_reason;
      t[24] = P;
    } else {
      P = t[24];
    }
    let F;
    if (t[25] !== d) {
      F = ds.jsxs(Text, {
        children: [d, " spent"]
      });
      t[25] = d;
      t[26] = F;
    } else {
      F = t[26];
    }
    let H = h / 100;
    let U;
    if (t[27] !== H || t[28] !== a) {
      U = ds.jsx(e9, {
        ratio: H,
        width: a,
        fillColor: "rate_limit_fill",
        emptyColor: "rate_limit_empty"
      });
      t[27] = H;
      t[28] = a;
      t[29] = U;
    } else {
      U = t[29];
    }
    let N;
    if (t[30] !== h) {
      N = ds.jsxs(Text, {
        children: [h, "% used"]
      });
      t[30] = h;
      t[31] = N;
    } else {
      N = t[31];
    }
    let W;
    if (t[32] !== F || t[33] !== U || t[34] !== N) {
      W = ds.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [F, U, N]
      });
      t[32] = F;
      t[33] = U;
      t[34] = N;
      t[35] = W;
    } else {
      W = t[35];
    }
    let j;
    if (t[36] !== m) {
      j = ds.jsxs(Text, {
        dimColor: true,
        children: ["Resets ", S, " \xB7 ", m, " monthly limit"]
      });
      t[36] = m;
      t[37] = j;
    } else {
      j = t[37];
    }
    let z;
    if (t[38] !== W || t[39] !== j) {
      z = ds.jsxs(gXd, {
        flexDirection: "column",
        children: [W, j]
      });
      t[38] = W;
      t[39] = j;
      t[40] = z;
    } else {
      z = t[40];
    }
    let V;
    if (t[41] !== o || t[42] !== s || t[43] !== L) {
      V = ds.jsx(xr, {
        options: L,
        onChange: o,
        onCancel: s,
        visibleOptionCount: L.length
      });
      t[41] = o;
      t[42] = s;
      t[43] = L;
      t[44] = V;
    } else {
      V = t[44];
    }
    let K;
    if (t[45] !== P || t[46] !== z || t[47] !== V) {
      K = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [P, z, V]
      });
      t[45] = P;
      t[46] = z;
      t[47] = V;
      t[48] = K;
    } else {
      K = t[48];
    }
    let J;
    if (t[49] !== s || t[50] !== K) {
      J = ds.jsx(or, {
        title: "Usage credits",
        onCancel: s,
        color: "suggestion",
        children: K
      });
      t[49] = s;
      t[50] = K;
      t[51] = J;
    } else {
      J = t[51];
    }
    return J;
  }
  function DTm(e) {
    let t = e5.c(27);
    let {
      pm: n,
      presets: r,
      currency: o,
      onConfirm: s,
      onCustom: i,
      onCancel: a
    } = e;
    let l;
    if (t[0] !== o || t[1] !== r) {
      let _;
      if (t[3] !== o) {
        _ = (E, C) => {
          let x = E.credit_minor_units > 0 ? Math.round(E.discount_minor_units / E.credit_minor_units * 100) : 0;
          return {
            label: Ky(E.local_credit_minor_units, o, "fit"),
            description: x > 0 ? `Save ${x}%` : undefined,
            value: `p${C}`
          };
        };
        t[3] = o;
        t[4] = _;
      } else {
        _ = t[4];
      }
      let b;
      let S;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        b = {
          label: "Custom amount\u2026",
          value: "custom"
        };
        S = {
          label: "Cancel",
          value: "cancel"
        };
        t[5] = b;
        t[6] = S;
      } else {
        b = t[5];
        S = t[6];
      }
      l = [...r.map(_), b, S];
      t[0] = o;
      t[1] = r;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = l;
    let u;
    if (t[7] !== a || t[8] !== s || t[9] !== i || t[10] !== r) {
      u = function (b) {
        if (b === "custom") {
          return i();
        }
        if (b === "cancel") {
          return a();
        }
        let S = Number(b.slice(1));
        s(r[S]);
      };
      t[7] = a;
      t[8] = s;
      t[9] = i;
      t[10] = r;
      t[11] = u;
    } else {
      u = t[11];
    }
    let d = u;
    let p;
    if (t[12] !== n) {
      p = BSt(n);
      t[12] = n;
      t[13] = p;
    } else {
      p = t[13];
    }
    let m;
    if (t[14] !== p) {
      m = ds.jsxs(Text, {
        dimColor: true,
        children: ["Payment: ", p]
      });
      t[14] = p;
      t[15] = m;
    } else {
      m = t[15];
    }
    let f;
    if (t[16] !== d || t[17] !== a || t[18] !== c) {
      f = ds.jsx(xr, {
        options: c,
        onChange: d,
        onCancel: a,
        visibleOptionCount: c.length
      });
      t[16] = d;
      t[17] = a;
      t[18] = c;
      t[19] = f;
    } else {
      f = t[19];
    }
    let h;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      h = ds.jsx(Text, {
        dimColor: true,
        children: "By confirming, you allow Anthropic to charge your card in the amount above."
      });
      t[20] = h;
    } else {
      h = t[20];
    }
    let g;
    if (t[21] !== m || t[22] !== f) {
      g = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [m, f, h]
      });
      t[21] = m;
      t[22] = f;
      t[23] = g;
    } else {
      g = t[23];
    }
    let y;
    if (t[24] !== a || t[25] !== g) {
      y = ds.jsx(or, {
        title: "Buy usage credits",
        onCancel: a,
        color: "suggestion",
        children: g
      });
      t[24] = a;
      t[25] = g;
      t[26] = y;
    } else {
      y = t[26];
    }
    return y;
  }
  function EKe(e) {
    let t = e5.c(11);
    let {
      label: n,
      value: r,
      bold: o,
      dim: s
    } = e;
    let i;
    if (t[0] !== o || t[1] !== s || t[2] !== n) {
      i = ds.jsx(Text, {
        dimColor: s,
        bold: o,
        children: n
      });
      t[0] = o;
      t[1] = s;
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== o || t[5] !== s || t[6] !== r) {
      a = ds.jsx(Text, {
        dimColor: s,
        bold: o,
        children: r
      });
      t[4] = o;
      t[5] = s;
      t[6] = r;
      t[7] = a;
    } else {
      a = t[7];
    }
    let l;
    if (t[8] !== i || t[9] !== a) {
      l = ds.jsxs(gXd, {
        justifyContent: "space-between",
        children: [i, a]
      });
      t[8] = i;
      t[9] = a;
      t[10] = l;
    } else {
      l = t[10];
    }
    return l;
  }
  function MTm(e) {
    let t = e5.c(76);
    let {
      pm: n,
      cents: r,
      bundle: o,
      currency: s,
      stripeProductId: i,
      onConfirm: a,
      onCancel: l
    } = e;
    let c = o ? o.local_credit_minor_units : r;
    let u = c - r;
    let d;
    if (t[0] !== c || t[1] !== u) {
      d = c > 0 && u > 0 ? Math.round(u / c * 100) : 0;
      t[0] = c;
      t[1] = u;
      t[2] = d;
    } else {
      d = t[2];
    }
    let p = d;
    let [m, f] = xh.useState("loading");
    let h;
    let g;
    if (t[3] !== r || t[4] !== s || t[5] !== i) {
      h = () => {
        let re = true;
        rga(r, s, i).then(se => {
          if (re) {
            f(se);
          }
        });
        return () => {
          re = false;
        };
      };
      g = [r, s, i];
      t[3] = r;
      t[4] = s;
      t[5] = i;
      t[6] = h;
      t[7] = g;
    } else {
      h = t[6];
      g = t[7];
    }
    xh.useEffect(h, g);
    let y = m === "loading";
    let _ = m === null;
    let b = y || _ ? 0 : m.tax_minor_units;
    let S = r + b;
    let E;
    if (t[8] !== s || t[9] !== y || t[10] !== _ || t[11] !== S) {
      E = _ ? [{
        label: "Go back",
        value: "no"
      }] : [{
        label: y ? "Pay (calculating\u2026)" : `Pay ${Ky(S, s)} now`,
        value: "yes",
        disabled: y
      }, {
        label: "Go back",
        value: "no"
      }];
      t[8] = s;
      t[9] = y;
      t[10] = _;
      t[11] = S;
      t[12] = E;
    } else {
      E = t[12];
    }
    let C = E;
    let {
      columns: x
    } = Sr();
    let A = Math.max(0, Math.min(x - 6, 44));
    let k = y || _ ? "Tax" : m.tax_label ?? "Tax";
    let I;
    if (t[13] !== A) {
      I = "\u2500".repeat(A);
      t[13] = A;
      t[14] = I;
    } else {
      I = t[14];
    }
    let O;
    if (t[15] !== I) {
      O = ds.jsx(Text, {
        dimColor: true,
        children: I
      });
      t[15] = I;
      t[16] = O;
    } else {
      O = t[16];
    }
    let M = O;
    let L;
    if (t[17] !== c || t[18] !== s) {
      L = Ky(c, s);
      t[17] = c;
      t[18] = s;
      t[19] = L;
    } else {
      L = t[19];
    }
    let P;
    if (t[20] !== L) {
      P = ds.jsx(EKe, {
        label: "Subtotal",
        value: L
      });
      t[20] = L;
      t[21] = P;
    } else {
      P = t[21];
    }
    let F;
    if (t[22] !== r || t[23] !== s || t[24] !== u || t[25] !== p || t[26] !== M) {
      F = u > 0 && ds.jsxs(ds.Fragment, {
        children: [ds.jsx(EKe, {
          label: `Discount${p > 0 ? ` (${p}%)` : ""}`,
          value: `\u2212${Ky(u, s)}`
        }), M, ds.jsx(EKe, {
          label: "Subtotal after discount",
          value: Ky(r, s)
        })]
      });
      t[22] = r;
      t[23] = s;
      t[24] = u;
      t[25] = p;
      t[26] = M;
      t[27] = F;
    } else {
      F = t[27];
    }
    let H;
    if (t[28] !== s || t[29] !== m || t[30] !== k || t[31] !== y || t[32] !== _) {
      H = y ? ds.jsx(EKe, {
        label: k,
        value: "\u2026",
        dim: true
      }) : _ ? ds.jsx(EKe, {
        label: k,
        value: "\u2014",
        dim: true
      }) : ds.jsx(EKe, {
        label: `${k} (${NTm(m.tax_rate_pct)})`,
        value: Ky(m.tax_minor_units, s)
      });
      t[28] = s;
      t[29] = m;
      t[30] = k;
      t[31] = y;
      t[32] = _;
      t[33] = H;
    } else {
      H = t[33];
    }
    let U;
    if (t[34] !== s || t[35] !== y || t[36] !== _ || t[37] !== S) {
      U = y ? "\u2026" : _ ? "\u2014" : Ky(S, s);
      t[34] = s;
      t[35] = y;
      t[36] = _;
      t[37] = S;
      t[38] = U;
    } else {
      U = t[38];
    }
    let N;
    if (t[39] !== U) {
      N = ds.jsx(EKe, {
        label: "Total due",
        value: U,
        bold: true
      });
      t[39] = U;
      t[40] = N;
    } else {
      N = t[40];
    }
    let W;
    if (t[41] !== A || t[42] !== M || t[43] !== H || t[44] !== N || t[45] !== P || t[46] !== F) {
      W = ds.jsxs(gXd, {
        flexDirection: "column",
        width: A,
        children: [P, F, H, M, N]
      });
      t[41] = A;
      t[42] = M;
      t[43] = H;
      t[44] = N;
      t[45] = P;
      t[46] = F;
      t[47] = W;
    } else {
      W = t[47];
    }
    let j;
    if (t[48] === Symbol.for("react.memo_cache_sentinel")) {
      j = ds.jsx(Text, {
        children: "Payment "
      });
      t[48] = j;
    } else {
      j = t[48];
    }
    let z;
    if (t[49] !== n) {
      z = BSt(n);
      t[49] = n;
      t[50] = z;
    } else {
      z = t[50];
    }
    let V;
    if (t[51] !== z) {
      V = ds.jsx(Text, {
        dimColor: true,
        children: z
      });
      t[51] = z;
      t[52] = V;
    } else {
      V = t[52];
    }
    let K;
    if (t[53] !== A || t[54] !== V) {
      K = ds.jsxs(gXd, {
        width: A,
        children: [j, V]
      });
      t[53] = A;
      t[54] = V;
      t[55] = K;
    } else {
      K = t[55];
    }
    let J;
    if (t[56] !== _) {
      J = _ && ds.jsx(Text, {
        color: "warning",
        children: `Couldn't calculate tax. Try again, or buy at ${"https://claude.ai/settings/usage"}`
      });
      t[56] = _;
      t[57] = J;
    } else {
      J = t[57];
    }
    let Q;
    if (t[58] !== l || t[59] !== a) {
      Q = re => re === "yes" ? a() : l();
      t[58] = l;
      t[59] = a;
      t[60] = Q;
    } else {
      Q = t[60];
    }
    let Z;
    if (t[61] !== l || t[62] !== C || t[63] !== Q) {
      Z = ds.jsx(xr, {
        options: C,
        onChange: Q,
        onCancel: l,
        visibleOptionCount: 2
      });
      t[61] = l;
      t[62] = C;
      t[63] = Q;
      t[64] = Z;
    } else {
      Z = t[64];
    }
    let ne;
    if (t[65] !== _) {
      ne = !_ && ds.jsx(Text, {
        dimColor: true,
        children: "By confirming, you allow Anthropic to charge your card in the amount above."
      });
      t[65] = _;
      t[66] = ne;
    } else {
      ne = t[66];
    }
    let oe;
    if (t[67] !== W || t[68] !== K || t[69] !== J || t[70] !== Z || t[71] !== ne) {
      oe = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [W, K, J, Z, ne]
      });
      t[67] = W;
      t[68] = K;
      t[69] = J;
      t[70] = Z;
      t[71] = ne;
      t[72] = oe;
    } else {
      oe = t[72];
    }
    let ee;
    if (t[73] !== l || t[74] !== oe) {
      ee = ds.jsx(or, {
        title: "Buy usage credits",
        onCancel: l,
        color: "suggestion",
        children: oe
      });
      t[73] = l;
      t[74] = oe;
      t[75] = ee;
    } else {
      ee = t[75];
    }
    return ee;
  }
  function NTm(e) {
    return `${Number(e.toFixed(2))}%`;
  }
  function LTm(e) {
    let t = e5.c(9);
    let {
      pm: n,
      initialCents: r,
      currency: o,
      onConfirm: s,
      onCancel: i
    } = e;
    let a;
    if (t[0] !== n) {
      a = BSt(n);
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = `Payment: ${a}`;
    let c = r ? String(r / 100) : "75";
    let u = o === "USD" ? 500 : undefined;
    let d;
    if (t[2] !== o || t[3] !== i || t[4] !== s || t[5] !== l || t[6] !== c || t[7] !== u) {
      d = ds.jsx(WTm, {
        title: "Buy usage credits",
        subtitle: l,
        initial: c,
        minCents: u,
        currency: o,
        footer: "By confirming, you allow Anthropic to charge your card in the amount above.",
        onSubmit: s,
        onCancel: i
      });
      t[2] = o;
      t[3] = i;
      t[4] = s;
      t[5] = l;
      t[6] = c;
      t[7] = u;
      t[8] = d;
    } else {
      d = t[8];
    }
    return d;
  }
  function FTm(e) {
    let t = e5.c(45);
    let {
      current: n,
      currency: r,
      onConfirm: o,
      onCancel: s
    } = e;
    let {
      columns: i
    } = Sr();
    let a;
    if (t[0] !== n) {
      a = n !== null ? String(Math.round(n / 100)) : "150";
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let [c, u] = xh.useState(l);
    let [d, p] = xh.useState(l.length);
    let [m, f] = xh.useState(0);
    let h;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      h = ["set", "unlimited", "cancel"];
      t[2] = h;
    } else {
      h = t[2];
    }
    let g = h;
    let [y, _] = xh.useState(0);
    let b;
    if (t[3] !== c) {
      let ne;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        ne = /[^0-9.]/g;
        t[5] = ne;
      } else {
        ne = t[5];
      }
      b = c.replace(ne, "");
      t[3] = c;
      t[4] = b;
    } else {
      b = t[4];
    }
    let S = parseFloat(b);
    let E;
    if (t[6] !== S) {
      E = isNaN(S) ? 0 : Math.round(S * 100);
      t[6] = S;
      t[7] = E;
    } else {
      E = t[7];
    }
    let C = E;
    let x;
    if (t[8] !== y || t[9] !== C || t[10] !== s || t[11] !== o) {
      x = function () {
        let oe = g[y];
        if (oe === "set") {
          if (C <= 0) {
            return;
          }
          o(C);
        } else if (oe === "unlimited") {
          o(null);
        } else {
          s();
        }
      };
      t[8] = y;
      t[9] = C;
      t[10] = s;
      t[11] = o;
      t[12] = x;
    } else {
      x = t[12];
    }
    let A = x;
    let k;
    if (t[13] !== A || t[14] !== m) {
      k = function (oe) {
        if (oe.key === "tab") {
          oe.preventDefault();
          f(BTm);
          return;
        }
        if (m !== 1) {
          return;
        }
        if (oe.key === "up") {
          oe.preventDefault();
          f(0);
        } else if (oe.key === "down") {
          oe.preventDefault();
        } else if (oe.key === "left") {
          oe.preventDefault();
          _(UTm);
        } else if (oe.key === "right") {
          oe.preventDefault();
          _(ee => Math.min(g.length - 1, ee + 1));
        } else if (oe.key === "return") {
          oe.preventDefault();
          A();
        }
      };
      t[13] = A;
      t[14] = m;
      t[15] = k;
    } else {
      k = t[15];
    }
    let I = k;
    let O;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      O = {
        set: "Set limit",
        unlimited: "Set to unlimited",
        cancel: "Cancel"
      };
      t[16] = O;
    } else {
      O = t[16];
    }
    let M = O;
    let L;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      L = ds.jsx(Text, {
        children: "You can set a maximum amount you can spend on usage credits per month."
      });
      t[17] = L;
    } else {
      L = t[17];
    }
    let P = m === 0 ? "suggestion" : "inactive";
    let F;
    if (t[18] !== r) {
      F = USt(r);
      t[18] = r;
      t[19] = F;
    } else {
      F = t[19];
    }
    let H;
    if (t[20] !== F) {
      H = ds.jsx(Text, {
        children: F
      });
      t[20] = F;
      t[21] = H;
    } else {
      H = t[21];
    }
    let U;
    let N;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      U = () => f(1);
      N = () => f(1);
      t[22] = U;
      t[23] = N;
    } else {
      U = t[22];
      N = t[23];
    }
    let W = m === 0;
    let j = m === 0;
    let z;
    if (t[24] !== i || t[25] !== d || t[26] !== W || t[27] !== j || t[28] !== c) {
      z = ds.jsx(Dl, {
        value: c,
        onChange: u,
        onSubmit: U,
        onHistoryDown: N,
        disableCursorMovementForUpDownKeys: true,
        focus: W,
        showCursor: j,
        columns: i,
        cursorOffset: d,
        onChangeCursorOffset: p
      });
      t[24] = i;
      t[25] = d;
      t[26] = W;
      t[27] = j;
      t[28] = c;
      t[29] = z;
    } else {
      z = t[29];
    }
    let V;
    if (t[30] !== H || t[31] !== z || t[32] !== P) {
      V = ds.jsxs(gXd, {
        borderStyle: "single",
        borderColor: P,
        paddingX: 1,
        children: [H, z]
      });
      t[30] = H;
      t[31] = z;
      t[32] = P;
      t[33] = V;
    } else {
      V = t[33];
    }
    let K;
    if (t[34] === Symbol.for("react.memo_cache_sentinel")) {
      K = ds.jsx(Text, {
        dimColor: true,
        children: "This spend limit goes into effect immediately."
      });
      t[34] = K;
    } else {
      K = t[34];
    }
    let J;
    if (t[35] !== y || t[36] !== m) {
      J = ds.jsx(gXd, {
        flexDirection: "row",
        gap: 2,
        children: g.map((ne, oe) => ds.jsxs(Text, {
          color: m === 1 && y === oe ? "suggestion" : undefined,
          children: [m === 1 && y === oe ? vGd.pointer : " ", " ", M[ne]]
        }, ne))
      });
      t[35] = y;
      t[36] = m;
      t[37] = J;
    } else {
      J = t[37];
    }
    let Q;
    if (t[38] !== I || t[39] !== V || t[40] !== J) {
      Q = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: I,
        children: [L, V, K, J]
      });
      t[38] = I;
      t[39] = V;
      t[40] = J;
      t[41] = Q;
    } else {
      Q = t[41];
    }
    let Z;
    if (t[42] !== s || t[43] !== Q) {
      Z = ds.jsx(or, {
        title: "Set monthly spend limit",
        onCancel: s,
        color: "suggestion",
        children: Q
      });
      t[42] = s;
      t[43] = Q;
      t[44] = Z;
    } else {
      Z = t[44];
    }
    return Z;
  }
  function UTm(e) {
    return Math.max(0, e - 1);
  }
  function BTm(e) {
    return e === 0 ? 1 : 0;
  }
  function $Tm(e) {
    let t = e5.c(103);
    let {
      current: n,
      pm: r,
      currency: o,
      onSave: s,
      onTurnOff: i,
      onCancel: a
    } = e;
    let {
      columns: l
    } = Sr();
    let c = n?.enabled === true;
    let u;
    if (t[0] !== n) {
      u = n?.threshold_in_minor_units ? String(Math.round(n.threshold_in_minor_units / 100)) : "5";
      t[0] = n;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d = u;
    let p;
    if (t[2] !== n) {
      p = n?.reload_to_in_minor_units ? String(Math.round(n.reload_to_in_minor_units / 100)) : "15";
      t[2] = n;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m = p;
    let [f, h] = xh.useState(d);
    let [g, y] = xh.useState(m);
    let [_, b] = xh.useState(d.length);
    let [S, E] = xh.useState(m.length);
    let [C, x] = xh.useState(0);
    let A;
    if (t[4] !== c) {
      A = c ? ["save", "off", "cancel"] : ["save", "cancel"];
      t[4] = c;
      t[5] = A;
    } else {
      A = t[5];
    }
    let k = A;
    let [I, O] = xh.useState(0);
    let M;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      M = function (Sn) {
        let jn = parseFloat(Sn.replace(/[^0-9.]/g, ""));
        return isNaN(jn) || jn <= 0 ? 0 : Math.round(jn * 100);
      };
      t[6] = M;
    } else {
      M = t[6];
    }
    let L = M;
    let P;
    if (t[7] !== f) {
      P = L(f);
      t[7] = f;
      t[8] = P;
    } else {
      P = t[8];
    }
    let F = P;
    let H;
    if (t[9] !== g) {
      H = L(g);
      t[9] = g;
      t[10] = H;
    } else {
      H = t[10];
    }
    let U = H;
    let N;
    if (t[11] !== o || t[12] !== U || t[13] !== F) {
      N = F <= 0 || U <= 0 ? "Enter an amount" : U <= F ? "Reload-to must be above threshold" : o === "USD" && U - F < 1000 ? `Reload must be at least ${Ky(1000, o, "whole")} above threshold` : "";
      t[11] = o;
      t[12] = U;
      t[13] = F;
      t[14] = N;
    } else {
      N = t[14];
    }
    let W = N;
    let j = !W;
    let z;
    if (t[15] !== I || t[16] !== k || t[17] !== a || t[18] !== s || t[19] !== i || t[20] !== U || t[21] !== F || t[22] !== j) {
      z = function () {
        let Sn = k[I];
        if (Sn === "save") {
          if (!j) {
            return;
          }
          s(F, U);
        } else if (Sn === "off") {
          i();
        } else {
          a();
        }
      };
      t[15] = I;
      t[16] = k;
      t[17] = a;
      t[18] = s;
      t[19] = i;
      t[20] = U;
      t[21] = F;
      t[22] = j;
      t[23] = z;
    } else {
      z = t[23];
    }
    let V = z;
    let K;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      K = () => x(qTm);
      t[24] = K;
    } else {
      K = t[24];
    }
    let J = K;
    let Q;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      Q = () => x(jTm);
      t[25] = Q;
    } else {
      Q = t[25];
    }
    let Z = Q;
    let ne;
    if (t[26] !== V || t[27] !== k.length || t[28] !== C) {
      ne = function (Sn) {
        if (Sn.key === "tab") {
          if (Sn.preventDefault(), Sn.shift) {
            J();
          } else {
            Z();
          }
          return;
        }
        if (C !== 2) {
          return;
        }
        if (Sn.key === "up") {
          Sn.preventDefault();
          J();
        } else if (Sn.key === "down") {
          Sn.preventDefault();
        } else if (Sn.key === "left") {
          Sn.preventDefault();
          O(HTm);
        } else if (Sn.key === "right") {
          Sn.preventDefault();
          O(jn => Math.min(k.length - 1, jn + 1));
        } else if (Sn.key === "return") {
          Sn.preventDefault();
          V();
        }
      };
      t[26] = V;
      t[27] = k.length;
      t[28] = C;
      t[29] = ne;
    } else {
      ne = t[29];
    }
    let oe = ne;
    let ee = c ? "Agree and save" : "Agree and turn on";
    let re;
    if (t[30] !== ee) {
      re = {
        save: ee,
        off: "Turn off",
        cancel: "Cancel"
      };
      t[30] = ee;
      t[31] = re;
    } else {
      re = t[31];
    }
    let se = re;
    let ae;
    if (t[32] !== c) {
      ae = c && ds.jsx(Text, {
        color: "success",
        children: " \xB7 Currently on"
      });
      t[32] = c;
      t[33] = ae;
    } else {
      ae = t[33];
    }
    let de;
    if (t[34] !== ae) {
      de = ds.jsxs(Text, {
        children: ["Automatically buy more usage credits when your balance is low.", ae]
      });
      t[34] = ae;
      t[35] = de;
    } else {
      de = t[35];
    }
    let be;
    if (t[36] !== r) {
      be = BSt(r);
      t[36] = r;
      t[37] = be;
    } else {
      be = t[37];
    }
    let fe;
    if (t[38] !== be) {
      fe = ds.jsxs(Text, {
        dimColor: true,
        children: ["Card on file: ", be]
      });
      t[38] = be;
      t[39] = fe;
    } else {
      fe = t[39];
    }
    let me;
    if (t[40] === Symbol.for("react.memo_cache_sentinel")) {
      me = ds.jsx(Text, {
        dimColor: true,
        children: "When usage credit balance falls below:"
      });
      t[40] = me;
    } else {
      me = t[40];
    }
    let Te = C === 0 ? "suggestion" : "inactive";
    let ue;
    if (t[41] !== o) {
      ue = USt(o);
      t[41] = o;
      t[42] = ue;
    } else {
      ue = t[42];
    }
    let ce;
    if (t[43] !== ue) {
      ce = ds.jsx(Text, {
        children: ue
      });
      t[43] = ue;
      t[44] = ce;
    } else {
      ce = t[44];
    }
    let le;
    let pe;
    if (t[45] === Symbol.for("react.memo_cache_sentinel")) {
      le = () => x(1);
      pe = () => x(1);
      t[45] = le;
      t[46] = pe;
    } else {
      le = t[45];
      pe = t[46];
    }
    let ve = C === 0;
    let _e = C === 0;
    let xe;
    if (t[47] !== l || t[48] !== _ || t[49] !== ve || t[50] !== _e || t[51] !== f) {
      xe = ds.jsx(Dl, {
        value: f,
        onChange: h,
        onSubmit: le,
        onHistoryDown: pe,
        disableCursorMovementForUpDownKeys: true,
        focus: ve,
        showCursor: _e,
        columns: l,
        cursorOffset: _,
        onChangeCursorOffset: b
      });
      t[47] = l;
      t[48] = _;
      t[49] = ve;
      t[50] = _e;
      t[51] = f;
      t[52] = xe;
    } else {
      xe = t[52];
    }
    let ke;
    if (t[53] !== Te || t[54] !== ce || t[55] !== xe) {
      ke = ds.jsxs(gXd, {
        flexDirection: "column",
        children: [me, ds.jsxs(gXd, {
          borderStyle: "single",
          borderColor: Te,
          paddingX: 1,
          children: [ce, xe]
        })]
      });
      t[53] = Te;
      t[54] = ce;
      t[55] = xe;
      t[56] = ke;
    } else {
      ke = t[56];
    }
    let Ie;
    if (t[57] === Symbol.for("react.memo_cache_sentinel")) {
      Ie = ds.jsx(Text, {
        dimColor: true,
        children: "Reload balance to:"
      });
      t[57] = Ie;
    } else {
      Ie = t[57];
    }
    let Ue = C === 1 ? "suggestion" : "inactive";
    let Ge;
    if (t[58] !== o) {
      Ge = USt(o);
      t[58] = o;
      t[59] = Ge;
    } else {
      Ge = t[59];
    }
    let Be;
    if (t[60] !== Ge) {
      Be = ds.jsx(Text, {
        children: Ge
      });
      t[60] = Ge;
      t[61] = Be;
    } else {
      Be = t[61];
    }
    let We;
    let Ze;
    let Tt;
    if (t[62] === Symbol.for("react.memo_cache_sentinel")) {
      We = () => x(2);
      Ze = () => x(0);
      Tt = () => x(2);
      t[62] = We;
      t[63] = Ze;
      t[64] = Tt;
    } else {
      We = t[62];
      Ze = t[63];
      Tt = t[64];
    }
    let kt = C === 1;
    let Ye = C === 1;
    let ht;
    if (t[65] !== l || t[66] !== S || t[67] !== g || t[68] !== kt || t[69] !== Ye) {
      ht = ds.jsx(Dl, {
        value: g,
        onChange: y,
        onSubmit: We,
        onHistoryUp: Ze,
        onHistoryDown: Tt,
        disableCursorMovementForUpDownKeys: true,
        focus: kt,
        showCursor: Ye,
        columns: l,
        cursorOffset: S,
        onChangeCursorOffset: E
      });
      t[65] = l;
      t[66] = S;
      t[67] = g;
      t[68] = kt;
      t[69] = Ye;
      t[70] = ht;
    } else {
      ht = t[70];
    }
    let It;
    if (t[71] !== Ue || t[72] !== Be || t[73] !== ht) {
      It = ds.jsxs(gXd, {
        flexDirection: "column",
        children: [Ie, ds.jsxs(gXd, {
          borderStyle: "single",
          borderColor: Ue,
          paddingX: 1,
          children: [Be, ht]
        })]
      });
      t[71] = Ue;
      t[72] = Be;
      t[73] = ht;
      t[74] = It;
    } else {
      It = t[74];
    }
    let Rt;
    if (t[75] !== r) {
      Rt = BSt(r);
      t[75] = r;
      t[76] = Rt;
    } else {
      Rt = t[76];
    }
    let wt;
    if (t[77] !== Rt) {
      wt = ds.jsxs(Text, {
        dimColor: true,
        children: ["By selecting Agree, you authorize Anthropic to automatically charge", " ", Rt, " on a recurring basis whenever your balance reaches the threshold, per the Consumer Terms (", "https://www.anthropic.com/legal/consumer-terms", "). Turn off any time here or at ", "https://claude.ai/settings/usage", "."]
      });
      t[77] = Rt;
      t[78] = wt;
    } else {
      wt = t[78];
    }
    let vt;
    if (t[79] !== I || t[80] !== se || t[81] !== k || t[82] !== C) {
      vt = k.map((rn, Sn) => ds.jsxs(Text, {
        color: C === 2 && I === Sn ? "suggestion" : undefined,
        children: [C === 2 && I === Sn ? vGd.pointer : " ", " ", se[rn]]
      }, rn));
      t[79] = I;
      t[80] = se;
      t[81] = k;
      t[82] = C;
      t[83] = vt;
    } else {
      vt = t[83];
    }
    let yt;
    if (t[84] !== I || t[85] !== k || t[86] !== W || t[87] !== C) {
      yt = W && C === 2 && k[I] === "save" && ds.jsxs(Text, {
        color: "error",
        children: ["\xB7 ", W]
      });
      t[84] = I;
      t[85] = k;
      t[86] = W;
      t[87] = C;
      t[88] = yt;
    } else {
      yt = t[88];
    }
    let gt;
    if (t[89] !== vt || t[90] !== yt) {
      gt = ds.jsxs(gXd, {
        flexDirection: "row",
        gap: 2,
        children: [vt, yt]
      });
      t[89] = vt;
      t[90] = yt;
      t[91] = gt;
    } else {
      gt = t[91];
    }
    let Ft;
    if (t[92] !== oe || t[93] !== de || t[94] !== fe || t[95] !== ke || t[96] !== It || t[97] !== wt || t[98] !== gt) {
      Ft = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: oe,
        children: [de, fe, ke, It, wt, gt]
      });
      t[92] = oe;
      t[93] = de;
      t[94] = fe;
      t[95] = ke;
      t[96] = It;
      t[97] = wt;
      t[98] = gt;
      t[99] = Ft;
    } else {
      Ft = t[99];
    }
    let on;
    if (t[100] !== a || t[101] !== Ft) {
      on = ds.jsx(or, {
        title: "Auto-reload",
        onCancel: a,
        color: "suggestion",
        children: Ft
      });
      t[100] = a;
      t[101] = Ft;
      t[102] = on;
    } else {
      on = t[102];
    }
    return on;
  }
  function HTm(e) {
    return Math.max(0, e - 1);
  }
  function jTm(e) {
    return e === 2 ? 2 : e + 1;
  }
  function qTm(e) {
    return e === 0 ? 0 : e - 1;
  }
  function WTm(e) {
    let t = e5.c(39);
    let {
      title: n,
      subtitle: r,
      initial: o,
      minCents: s,
      currency: i,
      footer: a,
      onSubmit: l,
      onCancel: c
    } = e;
    let {
      columns: u
    } = Sr();
    let [d, p] = xh.useState(o);
    let [m, f] = xh.useState(o.length);
    let h;
    if (t[0] !== d) {
      let F;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        F = /[^0-9.]/g;
        t[2] = F;
      } else {
        F = t[2];
      }
      h = d.replace(F, "");
      t[0] = d;
      t[1] = h;
    } else {
      h = t[1];
    }
    let g = parseFloat(h);
    let y;
    if (t[3] !== g) {
      y = isNaN(g) ? 0 : Math.round(g * 100);
      t[3] = g;
      t[4] = y;
    } else {
      y = t[4];
    }
    let _ = y;
    let b = s !== undefined && _ > 0 && _ < s;
    let S;
    if (t[5] !== _ || t[6] !== l || t[7] !== b) {
      S = function () {
        if (_ <= 0 || b) {
          return;
        }
        l(_);
      };
      t[5] = _;
      t[6] = l;
      t[7] = b;
      t[8] = S;
    } else {
      S = t[8];
    }
    let E = S;
    let C;
    if (t[9] !== r) {
      C = ds.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[9] = r;
      t[10] = C;
    } else {
      C = t[10];
    }
    let x;
    if (t[11] !== i) {
      x = USt(i);
      t[11] = i;
      t[12] = x;
    } else {
      x = t[12];
    }
    let A;
    if (t[13] !== x) {
      A = ds.jsx(Text, {
        children: x
      });
      t[13] = x;
      t[14] = A;
    } else {
      A = t[14];
    }
    let k;
    if (t[15] !== u || t[16] !== m || t[17] !== c || t[18] !== E || t[19] !== d) {
      k = ds.jsx(Dl, {
        value: d,
        onChange: p,
        onSubmit: E,
        onExit: c,
        focus: true,
        showCursor: true,
        columns: u,
        cursorOffset: m,
        onChangeCursorOffset: f
      });
      t[15] = u;
      t[16] = m;
      t[17] = c;
      t[18] = E;
      t[19] = d;
      t[20] = k;
    } else {
      k = t[20];
    }
    let I;
    if (t[21] !== A || t[22] !== k) {
      I = ds.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [A, k]
      });
      t[21] = A;
      t[22] = k;
      t[23] = I;
    } else {
      I = t[23];
    }
    let O;
    if (t[24] !== a) {
      O = a && ds.jsx(Text, {
        dimColor: true,
        children: a
      });
      t[24] = a;
      t[25] = O;
    } else {
      O = t[25];
    }
    let M;
    if (t[26] !== i || t[27] !== s || t[28] !== b) {
      M = b && s !== undefined && ds.jsxs(Text, {
        color: "error",
        children: ["Minimum is ", Ky(s, i, "whole")]
      });
      t[26] = i;
      t[27] = s;
      t[28] = b;
      t[29] = M;
    } else {
      M = t[29];
    }
    let L;
    if (t[30] !== M || t[31] !== C || t[32] !== I || t[33] !== O) {
      L = ds.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [C, I, O, M]
      });
      t[30] = M;
      t[31] = C;
      t[32] = I;
      t[33] = O;
      t[34] = L;
    } else {
      L = t[34];
    }
    let P;
    if (t[35] !== c || t[36] !== L || t[37] !== n) {
      P = ds.jsx(or, {
        title: n,
        onCancel: c,
        color: "suggestion",
        children: L
      });
      t[35] = c;
      t[36] = L;
      t[37] = n;
      t[38] = P;
    } else {
      P = t[38];
    }
    return P;
  }
  function GTm({
    purchaseId: e,
    onSuccess: t,
    onError: n
  }) {
    let r = xh.useRef(0);
    let o = xh.useRef(t);
    o.current = t;
    let s = xh.useRef(n);
    s.current = n;
    let i = useClock();
    xh.useEffect(() => {
      let a = false;
      let l;
      function c(d) {
        logEvent("tengu_extra_usage_inline_dialog_buy_result", {
          status: d
        });
      }
      async function u() {
        if (a) {
          return;
        }
        let d = o.current;
        let p = s.current;
        if (r.current += 1, r.current > 30) {
          a = true;
          p("Purchase timed out \u2014 check claude.ai/settings/usage");
          return;
        }
        try {
          let m = await oga(e);
          if (a) {
            return;
          }
          if (m.status === "paid") {
            a = true;
            c("success");
            d();
          } else if (m.status === "failed") {
            a = true;
            c("failed");
            p("Payment failed");
          } else if (m.status === "action_needed") {
            a = true;
            c("3ds_fallback");
            p(`Your card requires additional verification \u2014 this purchase was not completed. Try again at ${"https://claude.ai/settings/usage"}`);
          } else {
            l = i.setTimeout(u, 2000);
          }
        } catch (m) {
          if (a) {
            return;
          }
          if (a = true, M_(m)) {
            logForDebugging(`Purchase status poll failed: ${he(m)}`, {
              level: "error"
            });
          } else {
            Oe(m);
          }
          p("Failed to check purchase status");
        }
      }
      u();
      return () => {
        a = true;
        l?.();
      };
    }, [i, e]);
    return ds.jsx($bl, {
      message: "Confirming payment\u2026 (may take a few seconds)"
    });
  }
  function $bl(e) {
    let t = e5.c(3);
    let {
      message: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = ds.jsx(TKe, {
        autoplay: true
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = ds.jsxs(gXd, {
        flexDirection: "row",
        gap: 2,
        alignItems: "center",
        paddingTop: 2,
        children: [r, ds.jsx(Text, {
          dimColor: true,
          children: n
        })]
      });
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function VTm(e) {
    let t = e5.c(7);
    let {
      message: n,
      onDone: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = ds.jsx(TKe, {
        sequence: "celebrate",
        onComplete: r
      });
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n) {
      s = ds.jsx(gXd, {
        marginTop: 1,
        children: ds.jsx(Text, {
          color: "success",
          children: n
        })
      });
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = ds.jsxs(gXd, {
        flexDirection: "row",
        gap: 2,
        alignItems: "center",
        paddingTop: 1,
        children: [o, s]
      });
      t[4] = o;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  function Bbl({
    message: e,
    work: t,
    onDone: n
  }) {
    let r = xh.useRef(null);
    let o = xh.useRef(false);
    let s = xh.useRef(false);
    let i = xh.useRef(n);
    i.current = n;
    let a = xh.useCallback(() => {
      if (s.current) {
        return;
      }
      if (r.current && o.current) {
        i.current(r.current.value);
      }
    }, []);
    xh.useEffect(() => (t.then(l => {
      r.current = {
        value: l
      };
      a();
    }).catch(l => {
      Oe(l);
      r.current = {
        value: false
      };
      a();
    }), () => {
      s.current = true;
    }), [t, a]);
    return ds.jsxs(gXd, {
      flexDirection: "row",
      gap: 2,
      alignItems: "center",
      paddingTop: 1,
      children: [ds.jsx(TKe, {
        sequence: "celebrate",
        onComplete: () => {
          o.current = true;
          a();
        }
      }), ds.jsx(gXd, {
        marginTop: 1,
        children: ds.jsx(Text, {
          dimColor: true,
          children: e
        })
      })]
    });
  }
  function PlainAwait({
    message: e,
    work: t,
    onDone: n
  }) {
    let r = xh.useRef(n);
    r.current = n;
    xh.useEffect(() => {
      let o = false;
      t.then(s => {
        if (!o) {
          r.current(s);
        }
      }).catch(s => {
        if (Oe(s), !o) {
          r.current(false);
        }
      });
      return () => {
        o = true;
      };
    }, [t]);
    return ds.jsx(gXd, {
      paddingTop: 1,
      children: ds.jsx(Xc, {
        message: e
      })
    });
  }
  var e5;
  var xh;
  var ds;
  var dMo = __lazy(() => {
    $c();
    Ai();
    b_();
    Ii();
    bs();
    Pv();
    LMe();
    C1n();
    cMo();
    q_();
    ki();
    et();
    Bs();
    Ot();
    hpt();
    ETe();
    jle();
    ky();
    Wve();
    je();
    dt();
    Rn();
    PV();
    Eo();
    e5 = __toESM(pt(), 1);
    xh = __toESM(ot(), 1);
    ds = __toESM(ie(), 1);
  });
  var mMo = {};
  __export(mMo, {
    call: () => call_export3
  });
  async function call_export3(e, t) {
    if (jbl && D7t()) {
      return pMo.jsx(jbl, {
        onDone: e
      });
    }
    let n = await FSt();
    if (n.type === "message") {
      e(n.value);
      return null;
    }
    let r = getSubscriptionType();
    if (r === "team" || r === "enterprise") {
      e(n.opened ? `Opened ${n.url} in your browser to manage usage credits for your organization.` : `Visit ${n.url} to manage usage credits for your organization.`);
      return null;
    }
    let o = getOauthAccountInfo();
    let s = o && {
      accountUuid: o.accountUuid,
      organizationUuid: o.organizationUuid
    };
    return pMo.jsx(Login, {
      startingMessage: "Starting new login following /usage-credits. Exit with Ctrl-C to use existing account.",
      onDone: async i => {
        let a = await runPostLoginHooks(t, i, {
          previousAccount: s
        });
        e(i ? a.bridgeDisconnected ? `Login successful. ${"Remote Control disconnected."}` : "Login successful" : "Login interrupted", i ? loginAutoContinueOptions(t, a) : undefined);
      }
    });
  }
  var pMo;
  var jbl;
  var F7t = __lazy(() => {
    no();
    LSt();
    CQn();
    pMo = __toESM(ie(), 1);
    jbl = (dMo(), __toCommonJS(Hbl)).ExtraUsageDialog;
  });
  var fMo = {};
  __export(fMo, {
    call: () => call_export4
  });
  async function call_export4() {
    let e = await FSt({
      openInBrowser: getIsNonInteractiveSession()
    });
    if (e.type === "message") {
      return {
        type: "text",
        value: e.value
      };
    }
    return {
      type: "text",
      value: e.opened ? `Browser opened to manage usage credits. If it didn't open, visit: ${e.url}` : `Visit ${e.url} to manage usage credits.`
    };
  }
  var hMo = __lazy(() => {
    at();
    CQn();
  });
  var gMo = {};
  __export(gMo, {
    callNonInteractive: () => callNonInteractive,
    call: () => call_export5
  });
  var AQn;
  var call_export5 = async (e, t) => {
    let {
      call: n
    } = await Promise.resolve().then(() => (F7t(), mMo));
    let o = await n((s, i) => e(s ? `${"/extra-usage is now /usage-credits"}

${s}` : "/extra-usage is now /usage-credits", i), t);
    if (o == null) {
      return o;
    }
    return AQn.jsxs(gXd, {
      flexDirection: "column",
      children: [AQn.jsx(Text, {
        dimColor: true,
        children: "/extra-usage is now /usage-credits"
      }), o]
    });
  };
  var callNonInteractive = async () => {
    let {
      call: e
    } = await Promise.resolve().then(() => (hMo(), fMo));
    let t = await e();
    return {
      type: "text",
      value: `${"/extra-usage is now /usage-credits"}

${t.value}`
    };
  };
  var yMo = __lazy(() => {
    et();
    AQn = __toESM(ie(), 1);
  });
  function $St() {
    if (Me.DISABLE_EXTRA_USAGE_COMMAND) {
      return false;
    }
    if (vI() !== null) {
      return true;
    }
    return isOverageProvisioningAllowed();
  }
  var Mse;
  var _Mo;
  var bMo;
  var SMo;
  var HSt = __lazy(() => {
    at();
    jle();
    no();
    pr();
    Mse = {
      type: "local-jsx",
      name: "usage-credits",
      description: "Configure usage credits to keep working when you hit a limit",
      isEnabled: () => $St() && !getIsNonInteractiveSession(),
      requires: {
        ink: true
      },
      load: () => Promise.resolve().then(() => (F7t(), mMo))
    };
    _Mo = {
      type: "local",
      name: "usage-credits",
      supportsNonInteractive: true,
      description: "Configure usage credits to keep working when you hit a limit",
      isEnabled: () => $St() && getIsNonInteractiveSession(),
      get isHidden() {
        return !getIsNonInteractiveSession();
      },
      load: () => Promise.resolve().then(() => (hMo(), fMo))
    };
    bMo = {
      type: "local-jsx",
      name: "extra-usage",
      description: "Renamed to /usage-credits",
      isHidden: true,
      isEnabled: () => $St() && !getIsNonInteractiveSession(),
      requires: {
        ink: true
      },
      load: () => Promise.resolve().then(() => (yMo(), gMo))
    };
    SMo = {
      type: "local",
      name: "extra-usage",
      supportsNonInteractive: true,
      description: "Renamed to /usage-credits",
      isHidden: true,
      isEnabled: () => $St() && getIsNonInteractiveSession(),
      load: () => Promise.resolve().then(() => (yMo(), gMo)).then(e => ({
        call: e.callNonInteractive
      }))
    };
  });
  function Wme() {
    let [e, t] = PQn.useState({
      ...g0
    });
    PQn.useEffect(() => {
      let n = r => {
        t({
          ...r
        });
      };
      wDe.add(n);
      return () => {
        wDe.delete(n);
      };
    }, []);
    return e;
  }
  var PQn;
  var jSt = __lazy(() => {
    pU();
    PQn = __toESM(ot(), 1);
  });
  function XTm({
    shouldShowUpsell: e,
    isMax20x: t,
    isExtraUsageCommandEnabled: n,
    shouldAutoOpenRateLimitOptionsMenu: r,
    isTeamOrEnterprise: o,
    hasBillingAccess: s,
    serverHidesUpgrade: i,
    serverHidesOverage: a,
    spendLimitNudgePath: l
  }) {
    if (!e) {
      return null;
    }
    if (r) {
      return "Opening your options\u2026";
    }
    if (l) {
      return "/usage-credits to adjust your monthly spend limit.";
    }
    let c = n && !a;
    if (t) {
      if (c) {
        return "/usage-credits to finish what you\u2019re working on.";
      }
      return "/login to switch to an API usage-billed account.";
    }
    if (o) {
      if (!c) {
        return "Your admin can enable extra usage at claude.ai/admin-settings/usage.";
      }
      if (s) {
        return "/usage-credits to finish what you\u2019re working on.";
      }
      return "/usage-credits to request more usage from your admin.";
    }
    if (i) {
      if (c) {
        return "/usage-credits to finish what you\u2019re working on.";
      }
      return null;
    }
    if (!c) {
      return "/upgrade to increase your usage limit.";
    }
    return "/upgrade or /usage-credits to finish what you\u2019re working on.";
  }
  function Wbl(e) {
    let t = qbl.c(32);
    let {
      text: n,
      onOpenRateLimitOptions: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = getSubscriptionType();
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = getRateLimitTier();
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l = s === "team" || s === "enterprise";
    let c = s === "max" && a === "default_claude_max_20x";
    let u;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      u = Pot() || isClaudeAISubscriber();
      t[2] = u;
    } else {
      u = t[2];
    }
    let d = u;
    let p = Wme();
    let m = p.upgradePaths;
    let f;
    if (t[3] !== m) {
      f = m !== undefined && !m.includes("upgrade_plan");
      t[3] = m;
      t[4] = f;
    } else {
      f = t[4];
    }
    let h = f;
    let g;
    if (t[5] !== m) {
      g = m !== undefined && !m.includes("overage");
      t[5] = m;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y = g;
    let _;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      _ = getFeatureValue_CACHED_MAY_BE_STALE("tengu_coral_beacon", false);
      t[7] = _;
    } else {
      _ = t[7];
    }
    let b = _;
    let S;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      S = FX();
      t[8] = S;
    } else {
      S = t[8];
    }
    let E = S;
    let C = b && !l && !E && !Me.DISABLE_UPGRADE_COMMAND;
    let x;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      x = Mse.isEnabled();
      t[9] = x;
    } else {
      x = t[9];
    }
    let A = x;
    let k;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      k = av();
      t[10] = k;
    } else {
      k = t[10];
    }
    let I = k;
    let O;
    if (t[11] !== m) {
      O = m !== undefined && (m.includes("upgrade_plan") && !E && !Me.DISABLE_UPGRADE_COMMAND && s !== "enterprise" || m.includes("overage") && A);
      t[11] = m;
      t[12] = O;
    } else {
      O = t[12];
    }
    let M = O;
    let L;
    if (t[13] !== p.overageDisabledReason) {
      L = getFeatureValue_CACHED_MAY_BE_STALE("tengu_pewter_summit", false) && !l && p.overageDisabledReason === "org_level_disabled_until" && I && A;
      t[13] = p.overageDisabledReason;
      t[14] = L;
    } else {
      L = t[14];
    }
    let P = L;
    let F = d && (m !== undefined ? M || C : !c || C);
    let [H, U] = OQn.useState("pending");
    let N = p.status === "rejected" && p.resetsAt !== undefined && !p.isUsingOverage;
    let W = p.rateLimitType === "seven_day_overage_included" || p.errorCode === "credits_required";
    let j = F && H === "pending" && N && !W && r;
    let z;
    let V;
    if (t[15] !== r || t[16] !== j) {
      z = () => {
        if (j) {
          U(r() ? "opened" : "blocked");
        }
      };
      V = [j, r];
      t[15] = r;
      t[16] = j;
      t[17] = z;
      t[18] = V;
    } else {
      z = t[17];
      V = t[18];
    }
    OQn.useEffect(z, V);
    let K;
    e: {
      if (W) {
        K = null;
        break e;
      }
      let se = !!j;
      let ae = h || E;
      let de;
      if (t[19] !== y || t[20] !== P || t[21] !== se || t[22] !== ae) {
        de = XTm({
          shouldShowUpsell: d,
          isMax20x: c,
          isExtraUsageCommandEnabled: A,
          shouldAutoOpenRateLimitOptionsMenu: se,
          isTeamOrEnterprise: l,
          hasBillingAccess: I,
          serverHidesUpgrade: ae,
          serverHidesOverage: y,
          spendLimitNudgePath: P
        });
        t[19] = y;
        t[20] = P;
        t[21] = se;
        t[22] = ae;
        t[23] = de;
      } else {
        de = t[23];
      }
      let be = de;
      if (!be) {
        K = null;
        break e;
      }
      let fe;
      if (t[24] !== be) {
        fe = qSt.jsx(Text, {
          dimColor: true,
          children: be
        });
        t[24] = be;
        t[25] = fe;
      } else {
        fe = t[25];
      }
      K = fe;
    }
    let J = K;
    let Q = P && N && !W;
    let Z = Q ? "You've hit your monthly spend limit." : n;
    let ne = Q ? "warning" : "error";
    let oe;
    if (t[26] !== Z || t[27] !== ne) {
      oe = qSt.jsx(Text, {
        color: ne,
        children: Z
      });
      t[26] = Z;
      t[27] = ne;
      t[28] = oe;
    } else {
      oe = t[28];
    }
    let ee = H === "opened" ? null : J;
    let re;
    if (t[29] !== oe || t[30] !== ee) {
      re = qSt.jsx(Vn, {
        children: qSt.jsxs(gXd, {
          flexDirection: "column",
          children: [oe, ee]
        })
      });
      t[29] = oe;
      t[30] = ee;
      t[31] = re;
    } else {
      re = t[31];
    }
    return re;
  }
  var qbl;
  var OQn;
  var qSt;
  var Gbl = __lazy(() => {
    HSt();
    et();
    $n();
    jSt();
    k4t();
    no();
    vF();
    pr();
    U9e();
    Wl();
    qbl = __toESM(pt(), 1);
    OQn = __toESM(ot(), 1);
    qSt = __toESM(ie(), 1);
  });
  function QTm() {
    let e = U7t.c(1);
    if (!DQn.use(imi())) {
      return null;
    }
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = vd.jsx(Text, {
        dimColor: true,
        children: "\xB7 Run in another terminal: security unlock-keychain"
      });
      e[0] = n;
    } else {
      n = e[0];
    }
    return n;
  }
  function ZTm() {
    let e = U7t.c(2);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = vd.jsx(Text, {
        color: "error",
        children: "Not logged in \xB7 Please run /login"
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    let n;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      n = vd.jsx(Vn, {
        children: vd.jsxs(gXd, {
          flexDirection: "column",
          children: [t, vd.jsx(DQn.Suspense, {
            fallback: null,
            children: vd.jsx(QTm, {})
          })]
        })
      });
      e[1] = n;
    } else {
      n = e[1];
    }
    return n;
  }
  function TMo(e) {
    let t = U7t.c(32);
    let {
      param: n,
      addMargin: r,
      shouldShowDot: o,
      verbose: s,
      onOpenRateLimitOptions: i
    } = e;
    let {
      text: a
    } = n;
    if (MQn(a)) {
      return null;
    }
    if (wha(a)) {
      let l;
      if (t[0] !== i || t[1] !== a) {
        l = vd.jsx(Wbl, {
          text: a,
          onOpenRateLimitOptions: i
        });
        t[0] = i;
        t[1] = a;
        t[2] = l;
      } else {
        l = t[2];
      }
      return l;
    }
    switch (a) {
      case "No response requested.":
        return null;
      case "Prompt is too long":
        {
          let l;
          if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
            l = hKe("warning");
            t[3] = l;
          } else {
            l = t[3];
          }
          let c = l;
          let u = Me.DISABLE_COMPACT ? "/clear to continue" : "/compact or /clear to continue";
          let d;
          if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
            d = vd.jsx(Vn, {
              height: 1,
              children: vd.jsxs(Text, {
                color: "error",
                children: ["Context limit reached \xB7 ", u, c ? ` \xB7 ${c}` : ""]
              })
            });
            t[4] = d;
          } else {
            d = t[4];
          }
          return d;
        }
      case "Credit balance is too low":
        {
          let l;
          if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Vn, {
              height: 1,
              children: vd.jsx(Text, {
                color: "error",
                children: "Credit balance too low \xB7 Add funds: https://platform.claude.com/settings/billing"
              })
            });
            t[5] = l;
          } else {
            l = t[5];
          }
          return l;
        }
      case "Not logged in \xB7 Please run /login":
        {
          let l;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(ZTm, {});
            t[6] = l;
          } else {
            l = t[6];
          }
          return l;
        }
      case "Invalid API key \xB7 Fix external API key":
        {
          let l;
          if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Vn, {
              height: 1,
              children: vd.jsx(Text, {
                color: "error",
                children: "Invalid API key \xB7 Fix external API key"
              })
            });
            t[7] = l;
          } else {
            l = t[7];
          }
          return l;
        }
      case "Your ANTHROPIC_API_KEY belongs to a disabled organization \xB7 Update or unset the environment variable":
      case "Your ANTHROPIC_API_KEY belongs to a disabled organization \xB7 Unset the environment variable to use your subscription instead":
      case "Authentication error \xB7 The gateway could not authenticate with its upstream provider \u2014 contact your gateway administrator":
        {
          let l;
          if (t[8] !== a) {
            l = vd.jsx(Vn, {
              children: vd.jsx(Text, {
                color: "error",
                children: a
              })
            });
            t[8] = a;
            t[9] = l;
          } else {
            l = t[9];
          }
          return l;
        }
      case "OAuth token revoked \xB7 Please run /login":
        {
          let l;
          if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Vn, {
              height: 1,
              children: vd.jsx(Text, {
                color: "error",
                children: "OAuth token revoked \xB7 Please run /login"
              })
            });
            t[10] = l;
          } else {
            l = t[10];
          }
          return l;
        }
      case "Request timed out":
        {
          let l;
          if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Vn, {
              height: 1,
              children: vd.jsxs(Text, {
                color: "error",
                children: ["Request timed out", process.env.API_TIMEOUT_MS && vd.jsxs(vd.Fragment, {
                  children: [" ", "(API_TIMEOUT_MS=", process.env.API_TIMEOUT_MS, "ms, try increasing it)"]
                })]
              })
            });
            t[11] = l;
          } else {
            l = t[11];
          }
          return l;
        }
      case "Opus is experiencing high load, please use /model to switch to Sonnet":
        {
          let l;
          if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Text, {
              color: "error",
              children: "We are experiencing high demand for Opus 4."
            });
            t[12] = l;
          } else {
            l = t[12];
          }
          let c;
          if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
            c = vd.jsx(Vn, {
              children: vd.jsxs(gXd, {
                flexDirection: "column",
                gap: 1,
                children: [l, vd.jsxs(Text, {
                  children: ["To continue immediately, use /model to switch to", " ", renderModelName(getDefaultSonnetModel()), " and continue coding."]
                })]
              })
            });
            t[13] = c;
          } else {
            c = t[13];
          }
          return c;
        }
      case "Fable is experiencing high load, please use /model to switch to Sonnet":
        {
          let l;
          if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Text, {
              color: "error",
              children: "We are experiencing high demand for Fable 5."
            });
            t[14] = l;
          } else {
            l = t[14];
          }
          let c;
          if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
            c = vd.jsx(Vn, {
              children: vd.jsxs(gXd, {
                flexDirection: "column",
                gap: 1,
                children: [l, vd.jsxs(Text, {
                  children: ["To continue immediately, use /model to switch to", " ", renderModelName(getDefaultSonnetModel()), " and continue coding."]
                })]
              })
            });
            t[15] = c;
          } else {
            c = t[15];
          }
          return c;
        }
      case "API Error: Request was aborted.":
        {
          let l;
          if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
            l = vd.jsx(Vn, {
              height: 1,
              children: vd.jsx(Hme, {})
            });
            t[16] = l;
          } else {
            l = t[16];
          }
          return l;
        }
      default:
        {
          if (a.startsWith(`${"Prompt is too long"} \xB7 `)) {
            let p;
            if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
              p = hKe("warning");
              t[17] = p;
            } else {
              p = t[17];
            }
            let m = p;
            let f;
            if (t[18] !== a) {
              f = vd.jsx(Vn, {
                children: vd.jsxs(Text, {
                  color: "error",
                  children: [a, " \xB7 /clear to start fresh", m ? ` \xB7 ${m}` : ""]
                })
              });
              t[18] = a;
              t[19] = f;
            } else {
              f = t[19];
            }
            return f;
          }
          if (mU(a)) {
            let p;
            if (t[20] !== r || t[21] !== a || t[22] !== s) {
              p = vd.jsx(eEm, {
                text: a,
                verbose: s,
                addMargin: r
              });
              t[20] = r;
              t[21] = a;
              t[22] = s;
              t[23] = p;
            } else {
              p = t[23];
            }
            return p;
          }
          let l = r ? 1 : 0;
          let c;
          if (t[24] !== o) {
            c = o && vd.jsx(NoSelect, {
              fromLeftEdge: true,
              minWidth: 2,
              children: vd.jsx(Text, {
                "aria-label": "claude:",
                color: "text",
                children: Tc
              })
            });
            t[24] = o;
            t[25] = c;
          } else {
            c = t[25];
          }
          let u;
          if (t[26] !== a) {
            u = vd.jsx(gXd, {
              flexDirection: "column",
              children: vd.jsx(cy, {
                children: a
              })
            });
            t[26] = a;
            t[27] = u;
          } else {
            u = t[27];
          }
          let d;
          if (t[28] !== l || t[29] !== c || t[30] !== u) {
            d = vd.jsxs(gXd, {
              alignItems: "flex-start",
              flexDirection: "row",
              marginTop: l,
              width: "100%",
              children: [c, u]
            });
            t[28] = l;
            t[29] = c;
            t[30] = u;
            t[31] = d;
          } else {
            d = t[31];
          }
          return d;
        }
    }
  }
  function eEm(e) {
    let t = U7t.c(23);
    let {
      text: n,
      verbose: r,
      addMargin: o
    } = e;
    let {
      columns: s
    } = Sr();
    let i = A7i();
    let a = n === "API Error" ? `${"API Error"}: Please wait a moment and try again.` : n;
    let l;
    let c;
    if (t[0] !== a || t[1] !== r) {
      let _ = a.trim();
      c = !r && _.length > 1000;
      l = c ? _.slice(0, 1000) + "\u2026" : _;
      t[0] = a;
      t[1] = r;
      t[2] = l;
      t[3] = c;
    } else {
      l = t[2];
      c = t[3];
    }
    let u = l;
    if (i) {
      let _;
      if (t[4] !== u) {
        _ = vd.jsx(gKe, {
          color: "warning",
          children: u
        });
        t[4] = u;
        t[5] = _;
      } else {
        _ = t[5];
      }
      let b;
      if (t[6] !== c) {
        b = c && vd.jsx(wv, {});
        t[6] = c;
        t[7] = b;
      } else {
        b = t[7];
      }
      let S;
      if (t[8] !== _ || t[9] !== b) {
        S = vd.jsxs(gXd, {
          flexDirection: "column",
          children: [_, b]
        });
        t[8] = _;
        t[9] = b;
        t[10] = S;
      } else {
        S = t[10];
      }
      return S;
    }
    let d = o ? 1 : 0;
    let p;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      p = vd.jsx(gXd, {
        minWidth: 2,
        children: vd.jsx(Text, {
          "aria-label": "error:",
          color: "warning",
          children: Tc
        })
      });
      t[11] = p;
    } else {
      p = t[11];
    }
    let m = s - 10;
    let f;
    if (t[12] !== u) {
      f = vd.jsx(gKe, {
        color: "warning",
        children: u
      });
      t[12] = u;
      t[13] = f;
    } else {
      f = t[13];
    }
    let h;
    if (t[14] !== c) {
      h = c && vd.jsx(wv, {});
      t[14] = c;
      t[15] = h;
    } else {
      h = t[15];
    }
    let g;
    if (t[16] !== m || t[17] !== f || t[18] !== h) {
      g = vd.jsxs(gXd, {
        flexDirection: "column",
        width: m,
        children: [f, h]
      });
      t[16] = m;
      t[17] = f;
      t[18] = h;
      t[19] = g;
    } else {
      g = t[19];
    }
    let y;
    if (t[20] !== d || t[21] !== g) {
      y = vd.jsxs(gXd, {
        flexDirection: "row",
        marginTop: d,
        width: "100%",
        children: [p, g]
      });
      t[20] = d;
      t[21] = g;
      t[22] = y;
    } else {
      y = t[22];
    }
    return y;
  }
  var U7t;
  var DQn;
  var vd;
  var zbl = __lazy(() => {
    A4t();
    Cde();
    wl();
    ki();
    et();
    vO();
    pr();
    ro();
    fQn();
    Eo();
    oGr();
    Xq();
    ISt();
    hQn();
    sH();
    Wl();
    Gbl();
    U7t = __toESM(pt(), 1);
    DQn = __toESM(ot(), 1);
    vd = __toESM(ie(), 1);
  });
  function NQn(e) {
    let t = Kbl.c(7);
    let {
      param: n,
      addMargin: r,
      isTranscriptMode: o,
      verbose: s
    } = e;
    let {
      thinking: i
    } = n;
    let a = r === undefined ? false : r;
    if (!i) {
      return null;
    }
    let l = o || s;
    let c = a ? 1 : 0;
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = ELe.jsx(gXd, {
        minWidth: 2,
        children: ELe.jsx(Text, {
          dimColor: true,
          italic: true,
          children: "\u2234"
        })
      });
      t[0] = u;
    } else {
      u = t[0];
    }
    let d;
    if (t[1] !== l || t[2] !== i) {
      d = ELe.jsx(gXd, {
        flexDirection: "column",
        flexGrow: 1,
        children: l ? ELe.jsx(cy, {
          dimColor: true,
          children: i.trim()
        }) : ELe.jsx(Text, {
          dimColor: true,
          italic: true,
          children: i.trim().replace(/\s+/g, " ")
        })
      });
      t[1] = l;
      t[2] = i;
      t[3] = d;
    } else {
      d = t[3];
    }
    let p;
    if (t[4] !== c || t[5] !== d) {
      p = ELe.jsxs(gXd, {
        flexDirection: "row",
        marginTop: c,
        width: "100%",
        children: [u, d]
      });
      t[4] = c;
      t[5] = d;
      t[6] = p;
    } else {
      p = t[6];
    }
    return p;
  }
  var Kbl;
  var ELe;
  var EMo = __lazy(() => {
    wl();
    et();
    sH();
    Kbl = __toESM(pt(), 1);
    ELe = __toESM(ie(), 1);
  });
  function Jbl(e) {
    if (!e.startsWith('{"code":"')) {
      return "";
    }
    let t = e.slice(('{"code":"').length);
    let n = [];
    for (let r = 0; r < t.length; r++) {
      let o = t[r];
      if (o === '"') {
        break;
      }
      if (o !== "\\") {
        n.push(o);
        continue;
      }
      let s = t[r + 1];
      if (s === undefined) {
        break;
      }
      if (r++, s === "n") {
        n.push(`
`);
      } else if (s === "t") {
        n.push("\t");
      } else if (s === "r") {
        n.push("\r");
      } else if (s === "u") {
        let i = t.slice(r + 1, r + 5);
        if (i.length < 4) {
          break;
        }
        n.push(String.fromCharCode(parseInt(i, 16)));
        r += 4;
      } else {
        n.push(s);
      }
    }
    return n.join("");
  }
  function LQn(e, t, n) {
    if (e.length <= t + n + 1) {
      return e.map(r => ({
        line: r
      }));
    }
    return [...e.slice(0, t).map(r => ({
      line: r
    })), {
      line: `\u2026 ${e.length - t - n} lines \u2026`,
      folded: true
    }, ...e.slice(-n).map(r => ({
      line: r
    }))];
  }
  function Xbl(e) {
    let t = new Set();
    let n = new Map();
    for (let r of e) {
      if (t.vZc(r.data.toolUseId)) {
        continue;
      }
      t.add(r.data.toolUseId);
      n.set(r.data.toolName, (n.get(r.data.toolName) ?? 0) + 1);
    }
    return [...n].map(([r, o]) => `${o} ${un(o, r, tEm(r))}`).join(", ");
  }
  function tEm(e) {
    return /(?:s|sh|ch|x|z)$/i.test(e) ? `${e}es` : `${e}s`;
  }
  function Qbl(e) {
    if (!e || typeof e !== "object") {
      return "";
    }
    let t = Object.values(e).find(n => typeof n === "string");
    if (typeof t !== "string") {
      return "";
    }
    return truncateToWidth(t.replace(/\s+/g, " "), 40);
  }
  function Zbl(e) {
    let t = e[0]?.timestamp;
    let n = e.at(-1)?.timestamp;
    if (!t || !n) {
      return "";
    }
    let r = Date.parse(n) - Date.parse(t);
    return Number.isFinite(r) && r >= 0 ? formatSecondsShort(r) : "";
  }
  var vMo = __lazy(() => {
    cs();
    Zn();
    dI();
  });
  function CMo() {
    wMo.clear();
  }
  function RMo(e, t, n) {
    if (!n || !kpe()) {
      return;
    }
    let r = wMo.get(e);
    if (!r) {
      r = {
        raw: "",
        flushedAt: 0
      };
      wMo.set(e, r);
    }
    if (r.raw.length < rEm) {
      r.raw += t;
    }
    let o = Date.now();
    if (o - r.flushedAt < 100) {
      return;
    }
    r.flushedAt = o;
    let s = Jbl(r.raw).slice(0, 8192);
    n(i => {
      let a = i.findIndex(l => l.index === e);
      if (a === -1 || i[a].contentBlock.name !== "REPL") {
        return i;
      }
      return i.with(a, {
        ...i[a],
        contentBlock: {
          ...i[a].contentBlock,
          input: {
            code: s
          }
        }
      });
    });
  }
  var rEm;
  var wMo;
  var xMo = __lazy(() => {
    ZC();
    vMo();
    mgt();
    rEm = 8192 * 2;
    wMo = new Map();
  });
  function iZ(e, t, n = 1000, r = 0, o) {
    let s = useClock();
    let i = () => formatDuration(Math.max(0, (o ?? Date.now()) - e - r));
    let a = FQn.useCallback(l => {
      if (!t) {
        return () => {};
      }
      let c;
      let u = () => {
        try {
          l();
        } finally {
          c = s.setTimeout(u, n);
        }
      };
      c = s.setTimeout(u, n);
      return () => c();
    }, [t, n, s]);
    return FQn.useSyncExternalStore(a, i, i);
  }
  var FQn;
  var WSt = __lazy(() => {
    et();
    cs();
    FQn = __toESM(ot(), 1);
  });
  function AMo(e) {
    let t = VSt.c(2);
    if (!kpe() || e.param.name !== "REPL") {
      return null;
    }
    let n;
    if (t[0] !== e) {
      n = Gw.jsx(sEm, {
        ...e
      });
      t[0] = e;
      t[1] = n;
    } else {
      n = t[1];
    }
    return n;
  }
  function sEm({
    param: e,
    isQueued: t,
    isResolved: n,
    isError: r,
    shouldAnimate: o,
    shouldShowDot: s,
    addMargin: i,
    progressMessagesForMessage: a,
    resultMsg: l
  }) {
    let c = n ? r ? "failed" : "done" : t ? "writing" : "running";
    let u = a.filter(h => h.data.type === "repl_tool_call");
    hEm(c, n);
    let d = GSt.useRef(Date.now()).current;
    let p = iZ(d, c === "running", 200);
    let m = typeof e.input.code === "string" ? e.input.code : "";
    let f = l?.type === "user" ? l.toolUseResult : undefined;
    return Gw.jsxs(gXd, {
      flexDirection: "column",
      marginTop: i ? 1 : 0,
      marginBottom: 1,
      width: "100%",
      children: [Gw.jsxs(gXd, {
        flexDirection: "row",
        children: [s && (t ? Gw.jsx(gXd, {
          minWidth: 2,
          children: Gw.jsx(Text, {
            dimColor: true,
            children: Tc
          })
        }) : Gw.jsx(Ose, {
          shouldAnimate: o,
          isUnresolved: !n,
          isError: r
        })), Gw.jsx(Text, {
          bold: true,
          children: "REPL"
        }), Gw.jsx(iEm, {
          state: c,
          elapsed: p,
          progress: u,
          error: f?.error
        })]
      }), Gw.jsx(lEm, {
        code: m,
        state: c,
        fold: c === "done" || c === "failed"
      }), c === "done" && f && Gw.jsx(uEm, {
        output: f
      }), c === "failed" && f?.error && Gw.jsx(pEm, {
        error: f.error
      })]
    });
  }
  function iEm(e) {
    let t = VSt.c(23);
    let {
      state: n,
      elapsed: r,
      progress: o,
      error: s
    } = e;
    let i;
    if (t[0] !== o) {
      i = Zbl(o);
      t[0] = o;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    switch (n) {
      case "writing":
        {
          let l;
          if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
            l = Gw.jsx(Text, {
              dimColor: true,
              children: "(Writing\u2026)"
            });
            t[2] = l;
          } else {
            l = t[2];
          }
          return l;
        }
      case "running":
        {
          let l;
          let c;
          if (t[3] !== o) {
            l = o.findLast(aEm);
            c = l ? Qbl(l.data.toolInput) : "";
            t[3] = o;
            t[4] = l;
            t[5] = c;
          } else {
            l = t[4];
            c = t[5];
          }
          let u = c;
          let d = l ? `Running ${l.data.toolName}(${u})\u2026` : "Running\u2026";
          let p;
          if (t[6] !== r || t[7] !== d) {
            p = Gw.jsxs(Text, {
              dimColor: true,
              children: ["(", d, " ", r, ")"]
            });
            t[6] = r;
            t[7] = d;
            t[8] = p;
          } else {
            p = t[8];
          }
          return p;
        }
      case "done":
        {
          let l;
          if (t[9] !== o) {
            l = Xbl(o);
            t[9] = o;
            t[10] = l;
          } else {
            l = t[10];
          }
          let c = l;
          let u = c ? `Ran ${c}` : "Done";
          let d;
          if (t[11] !== a || t[12] !== u) {
            d = [u, a].filter(Boolean);
            t[11] = a;
            t[12] = u;
            t[13] = d;
          } else {
            d = t[13];
          }
          let m = d.join(" \xB7 ");
          let f;
          if (t[14] !== m) {
            f = Gw.jsxs(Text, {
              dimColor: true,
              children: ["(", m, ")"]
            });
            t[14] = m;
            t[15] = f;
          } else {
            f = t[15];
          }
          return f;
        }
      case "failed":
        {
          let l;
          if (t[16] !== s) {
            l = s ? truncateToWidth(ii(s, ":"), 40) : "Failed";
            t[16] = s;
            t[17] = l;
          } else {
            l = t[17];
          }
          let u = l || "Failed";
          let d;
          if (t[18] !== a || t[19] !== u) {
            d = [u, a].filter(Boolean);
            t[18] = a;
            t[19] = u;
            t[20] = d;
          } else {
            d = t[20];
          }
          let m = d.join(" \xB7 ");
          let f;
          if (t[21] !== m) {
            f = Gw.jsxs(Text, {
              color: "error",
              children: ["(", m, ")"]
            });
            t[21] = m;
            t[22] = f;
          } else {
            f = t[22];
          }
          return f;
        }
    }
  }
  function aEm(e) {
    return e.data.phase === "start";
  }
  function lEm(e) {
    let t = VSt.c(12);
    let {
      code: n,
      state: r,
      fold: o
    } = e;
    let s;
    let i;
    let a;
    let l;
    if (t[0] !== n || t[1] !== o || t[2] !== r) {
      let u = n.split(`
`);
      let d = o ? LQn(u, 3, 2) : u.map(cEm);
      let p = r !== "running";
      s = gXd;
      i = "column";
      a = 1;
      l = d.map((m, f) => Gw.jsxs(gXd, {
        flexDirection: "row",
        children: [Gw.jsx(Text, {
          dimColor: true,
          children: "    "
        }), Gw.jsx(Text, {
          dimColor: p || m.folded,
          children: m.line
        }), r === "writing" && f === d.length - 1 && Gw.jsx(Text, {
          children: "\u258C"
        })]
      }, f));
      t[0] = n;
      t[1] = o;
      t[2] = r;
      t[3] = s;
      t[4] = i;
      t[5] = a;
      t[6] = l;
    } else {
      s = t[3];
      i = t[4];
      a = t[5];
      l = t[6];
    }
    let c;
    if (t[7] !== s || t[8] !== i || t[9] !== a || t[10] !== l) {
      c = Gw.jsx(s, {
        flexDirection: i,
        marginTop: a,
        children: l
      });
      t[7] = s;
      t[8] = i;
      t[9] = a;
      t[10] = l;
      t[11] = c;
    } else {
      c = t[11];
    }
    return c;
  }
  function cEm(e) {
    return {
      line: e
    };
  }
  function uEm(e) {
    let t = VSt.c(10);
    let {
      output: n
    } = e;
    let r;
    let o;
    let s;
    let i;
    if (t[0] !== n.result) {
      let l = fEm(n.result);
      let c = LQn(l.split(`
`), 6, 2);
      r = gXd;
      o = "column";
      s = 1;
      i = c.map(dEm);
      t[0] = n.result;
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
    let a;
    if (t[5] !== r || t[6] !== o || t[7] !== s || t[8] !== i) {
      a = Gw.jsx(r, {
        flexDirection: o,
        marginTop: s,
        children: i
      });
      t[5] = r;
      t[6] = o;
      t[7] = s;
      t[8] = i;
      t[9] = a;
    } else {
      a = t[9];
    }
    return a;
  }
  function dEm(e, t) {
    return Gw.jsxs(Text, {
      children: ["    ", e.line]
    }, t);
  }
  function pEm(e) {
    let t = VSt.c(10);
    let {
      error: n
    } = e;
    let r;
    let o;
    let s;
    let i;
    if (t[0] !== n) {
      let l = LQn(n.split(`
`), 8, 2);
      r = gXd;
      o = "column";
      s = 1;
      i = l.map(mEm);
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
    let a;
    if (t[5] !== r || t[6] !== o || t[7] !== s || t[8] !== i) {
      a = Gw.jsx(r, {
        flexDirection: o,
        marginTop: s,
        children: i
      });
      t[5] = r;
      t[6] = o;
      t[7] = s;
      t[8] = i;
      t[9] = a;
    } else {
      a = t[9];
    }
    return a;
  }
  function mEm(e, t) {
    return Gw.jsxs(Text, {
      color: "error",
      children: ["    ", e.line]
    }, t);
  }
  function fEm(e) {
    try {
      return tSl.inspect(e, {
        colors: false,
        depth: 3,
        customInspect: false
      });
    } catch {
      return "[non-serializable value]";
    }
  }
  function hEm(e, t) {
    let n = GSt.useRef(t).current;
    let r = GSt.useRef(new Set());
    GSt.useEffect(() => {
      if (n || r.current.vZc(e)) {
        return;
      }
      r.current.add(e);
      logEvent("tengu_repl_verbose_render", {
        state: e
      });
    }, [n, e]);
  }
  var VSt;
  var GSt;
  var tSl;
  var Gw;
  var nSl = __lazy(() => {
    OSt();
    wl();
    WSt();
    et();
    Ot();
    Zn();
    dI();
    ZC();
    vMo();
    mgt();
    VSt = __toESM(pt(), 1);
    GSt = __toESM(ot(), 1);
    tSl = require("util");
    Gw = __toESM(ie(), 1);
  });
  var rSl = __lazy(() => {
    mgt();
    xMo();
    nSl();
  });
  function oSl(e) {
    return fw(t => t.classifierApprovals.checking.vZc(e)) ?? false;
  }
  var sSl = __lazy(() => {
    ho();
  });
  var iSl;
  var vKe;
  var UQn = __lazy(() => {
    iSl = __toESM(ot(), 1);
    vKe = class vKe extends iSl.Component {
      constructor(e) {
        super(e);
        this.state = {
          hasError: false
        };
      }
      static getDerivedStateFromError() {
        return {
          hasError: true
        };
      }
      render() {
        if (this.state.hasError) {
          return null;
        }
        return this.props.children;
      }
    };
  });
  function BQn(e) {
    let t = aSl.c(22);
    let {
      hookEvent: n,
      lookups: r,
      toolUseID: o,
      isTranscriptMode: s
    } = e;
    let i;
    if (t[0] !== n || t[1] !== r.inProgressHookCounts || t[2] !== o) {
      i = r.inProgressHookCounts.get(o)?.get(n) ?? 0;
      t[0] = n;
      t[1] = r.inProgressHookCounts;
      t[2] = o;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l = r.resolvedHookCounts.get(o)?.get(n) ?? 0;
    if (a === 0) {
      return null;
    }
    if (n === "PreToolUse" || n === "PostToolUse") {
      if (s) {
        let f;
        if (t[4] !== a) {
          f = aZ.jsxs(Text, {
            dimColor: true,
            children: [a, " "]
          });
          t[4] = a;
          t[5] = f;
        } else {
          f = t[5];
        }
        let h;
        if (t[6] !== n) {
          h = aZ.jsx(Text, {
            dimColor: true,
            bold: true,
            children: n
          });
          t[6] = n;
          t[7] = h;
        } else {
          h = t[7];
        }
        let g = a === 1 ? " hook" : " hooks";
        let y;
        if (t[8] !== g) {
          y = aZ.jsxs(Text, {
            dimColor: true,
            children: [g, " ran"]
          });
          t[8] = g;
          t[9] = y;
        } else {
          y = t[9];
        }
        let _;
        if (t[10] !== f || t[11] !== h || t[12] !== y) {
          _ = aZ.jsx(Vn, {
            children: aZ.jsxs(gXd, {
              flexDirection: "row",
              children: [f, h, y]
            })
          });
          t[10] = f;
          t[11] = h;
          t[12] = y;
          t[13] = _;
        } else {
          _ = t[13];
        }
        return _;
      }
      return null;
    }
    if (l === a) {
      return null;
    }
    let c;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      c = aZ.jsx(Text, {
        dimColor: true,
        children: "Running "
      });
      t[14] = c;
    } else {
      c = t[14];
    }
    let u;
    if (t[15] !== n) {
      u = aZ.jsx(Text, {
        dimColor: true,
        bold: true,
        children: n
      });
      t[15] = n;
      t[16] = u;
    } else {
      u = t[16];
    }
    let d = a === 1 ? " hook\u2026" : " hooks\u2026";
    let p;
    if (t[17] !== d) {
      p = aZ.jsx(Text, {
        dimColor: true,
        children: d
      });
      t[17] = d;
      t[18] = p;
    } else {
      p = t[18];
    }
    let m;
    if (t[19] !== u || t[20] !== p) {
      m = aZ.jsx(Vn, {
        children: aZ.jsxs(gXd, {
          flexDirection: "row",
          children: [c, u, p]
        })
      });
      t[19] = u;
      t[20] = p;
      t[21] = m;
    } else {
      m = t[21];
    }
    return m;
  }
  var aSl;
  var aZ;
  var IMo = __lazy(() => {
    et();
    Wl();
    aSl = __toESM(pt(), 1);
    aZ = __toESM(ie(), 1);
  });
  function $Qn(e) {
    let t = lSl.c(7);
    let {
      content: n,
      addMargin: r
    } = e;
    let o = r ? 1 : 0;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = vLe.jsx(gXd, {
        minWidth: 2,
        children: vLe.jsx(Text, {
          dimColor: true,
          children: "\u203B"
        })
      });
      t[0] = s;
    } else {
      s = t[0];
    }
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = vLe.jsxs(Text, {
        dimColor: true,
        bold: true,
        children: ["recap:", " "]
      });
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== n) {
      a = vLe.jsxs(Text, {
        children: [i, vLe.jsx(Text, {
          dimColor: true,
          italic: true,
          children: n
        })]
      });
      t[2] = n;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== o || t[5] !== a) {
      l = vLe.jsxs(gXd, {
        flexDirection: "row",
        marginTop: o,
        width: "100%",
        children: [s, a]
      });
      t[4] = o;
      t[5] = a;
      t[6] = l;
    } else {
      l = t[6];
    }
    return l;
  }
  var lSl;
  var vLe;
  var PMo = __lazy(() => {
    wl();
    et();
    lSl = __toESM(pt(), 1);
    vLe = __toESM(ie(), 1);
  });
  function pSl(e) {
    let t = uSl.c(184);
    let {
      param: n,
      addMargin: r,
      tools: o,
      commands: s,
      verbose: i,
      inProgressToolUseIDs: a,
      progressMessagesForMessage: l,
      shouldAnimate: c,
      shouldShowDot: u,
      inProgressToolCallCount: d,
      lookups: p,
      isTranscriptMode: m
    } = e;
    let f = Sr();
    let [h] = useTheme();
    let g = fw(_Em);
    let y = oSl(n.id);
    let _ = fw(yEm);
    let b = fw(gEm);
    let S = _ === "auto" || _ === "plan" && b;
    let E = false;
    let C;
    if (t[0] !== n.input || t[1] !== n.name || t[2] !== o) {
      e: {
        if (!o) {
          let pe;
          if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
            pe = {
              notFound: "no-tools"
            };
            t[4] = pe;
          } else {
            pe = t[4];
          }
          C = pe;
          break e;
        }
        let ue = Cl(o, n.name);
        if (!ue) {
          let ve = n.name.startsWith("mcp__") || n.name.startsWith("skill__") || n.name.startsWith("eval_registered__") || n.name === "StructuredOutput" || n.name === "WebBrowser" || M3t.vZc(n.name) || wmt().vZc(n.name) || Cl(ilt() ?? [], n.name) !== undefined ? "expected-absent" : "unknown";
          let _e;
          if (t[5] !== ve) {
            _e = {
              notFound: ve
            };
            t[5] = ve;
            t[6] = _e;
          } else {
            _e = t[6];
          }
          C = _e;
          break e;
        }
        let ce = ue.inputSchema.safeParse(n.input);
        let le = ce.success ? ce.data : undefined;
        C = {
          tool: ue,
          input: ce,
          userFacingToolName: ue.userFacingName(le),
          userFacingToolNameBackgroundColor: ue.userFacingNameBackgroundColor?.(le),
          isTransparentWrapper: ue.isTransparentWrapper?.() ?? false
        };
      }
      t[0] = n.input;
      t[1] = n.name;
      t[2] = o;
      t[3] = C;
    } else {
      C = t[3];
    }
    let x = C;
    let A = "notFound" in x ? x.notFound : null;
    let k;
    let I;
    if (t[7] !== A || t[8] !== n.name) {
      k = () => {
        if (A === "no-tools") {
          Oe($o(Error(`Tools array is undefined for tool ${n.name}`), `Tools array is undefined (mcp=${n.name.startsWith("mcp__")})`));
        } else if (A === "expected-absent") {
          logForDebugging(`Tool ${n.name} not found in render-time tools`, {
            level: "error"
          });
        } else if (A === "unknown") {
          Oe($o(Error(`Tool ${n.name} not found`), "Tool not found"));
        }
      };
      I = [n.name, A];
      t[7] = A;
      t[8] = n.name;
      t[9] = k;
      t[10] = I;
    } else {
      k = t[9];
      I = t[10];
    }
    dSl.useEffect(k, I);
    let O;
    if (t[11] !== p.erroredToolUseIDs || t[12] !== n) {
      O = N2n(n, p.erroredToolUseIDs);
      t[11] = p.erroredToolUseIDs;
      t[12] = n;
      t[13] = O;
    } else {
      O = t[13];
    }
    let M = O;
    let L = M !== null;
    let P;
    let F;
    let H;
    let U;
    let N;
    let W;
    let j;
    let z;
    let V;
    let K;
    let J;
    let Q;
    let Z;
    let ne;
    let oe;
    let ee;
    let re;
    let se;
    let ae;
    let de;
    if (t[14] !== r || t[15] !== s || t[16] !== d || t[17] !== a || t[18] !== m || t[19] !== p || t[20] !== n || t[21] !== x || t[22] !== g?.toolUseId || t[23] !== l || t[24] !== M || t[25] !== c || t[26] !== u || t[27] !== L || t[28] !== f || t[29] !== h || t[30] !== o || t[31] !== i) {
      oe = Symbol.for("react.early_return_sentinel");
      e: {
        if (L) {
          oe = oP.jsx($Qn, {
            content: M,
            addMargin: r
          });
          break e;
        }
        let ue = "notFound" in x;
        if (t[52] !== r || t[53] !== s || t[54] !== d || t[55] !== a || t[56] !== m || t[57] !== p || t[58] !== n || t[59] !== x || t[60] !== g?.toolUseId || t[61] !== l || t[62] !== c || t[63] !== u || t[64] !== ue || t[65] !== f || t[66] !== h || t[67] !== o || t[68] !== i) {
          if (ue) {
            oe = null;
            break e;
          }
          let {
            tool: ce,
            input: le,
            userFacingToolName: pe,
            userFacingToolNameBackgroundColor: ve,
            isTransparentWrapper: _e
          } = x;
          if (de = ce, t[88] !== r || t[89] !== s || t[90] !== d || t[91] !== a || t[92] !== le || t[93] !== m || t[94] !== _e || t[95] !== p || t[96] !== n || t[97] !== g?.toolUseId || t[98] !== l || t[99] !== c || t[100] !== u || t[101] !== f || t[102] !== h || t[103] !== de || t[104] !== o || t[105] !== pe || t[106] !== ve || t[107] !== i) {
            N = p.resolvedToolUseIDs.vZc(n.id);
            U = !a.vZc(n.id) && !N;
            W = g?.toolUseId === n.id;
            let xe = p.toolResultByToolUseID.get(n.id);
            let ke = xe?.type === "user" ? xe.toolUseResult : undefined;
            if (_e) {
              let Ge = AMo({
                param: n,
                isQueued: U,
                isResolved: N,
                isError: p.erroredToolUseIDs.vZc(n.id),
                shouldAnimate: c,
                shouldShowDot: u,
                addMargin: r,
                progressMessagesForMessage: l,
                resultMsg: xe
              });
              if (Ge !== null) {
                oe = Ge;
                break e;
              }
              if (N) {
                oe = null;
                break e;
              }
              let Be;
              if (t[126] !== d || t[127] !== m || t[128] !== p || t[129] !== n.id || t[130] !== l || t[131] !== f || t[132] !== de || t[133] !== o || t[134] !== i) {
                Be = cSl(de, o, p, n.id, l, {
                  verbose: i,
                  inProgressToolCallCount: d,
                  isTranscriptMode: m
                }, f);
                t[126] = d;
                t[127] = m;
                t[128] = p;
                t[129] = n.id;
                t[130] = l;
                t[131] = f;
                t[132] = de;
                t[133] = o;
                t[134] = i;
                t[135] = Be;
              } else {
                Be = t[135];
              }
              oe = oP.jsx(gXd, {
                flexDirection: "column",
                width: "100%",
                children: Be
              });
              break e;
            }
            if (pe === "") {
              oe = null;
              break e;
            }
            let Ie;
            if (t[136] !== s || t[137] !== le.data || t[138] !== le.success || t[139] !== h || t[140] !== de || t[141] !== i) {
              Ie = le.success ? bEm(de, le.data, {
                theme: h,
                verbose: i,
                commands: s
              }) : null;
              t[136] = s;
              t[137] = le.data;
              t[138] = le.success;
              t[139] = h;
              t[140] = de;
              t[141] = i;
              t[142] = Ie;
            } else {
              Ie = t[142];
            }
            let Ue = Ie;
            if (Ue === null) {
              oe = null;
              break e;
            }
            if (H = gXd, J = "row", Q = "space-between", Z = r ? 1 : 0, ne = "100%", F = gXd, K = "column", P = gXd, ee = "row", re = "nowrap", se = an(pe) + (u ? 2 : 0), ae = u && (U ? oP.jsx(gXd, {
              minWidth: 2,
              children: oP.jsx(Text, {
                "aria-label": "tool:",
                dimColor: U,
                children: Tc
              })
            }) : oP.jsx(Ose, {
              shouldAnimate: c,
              isUnresolved: !N,
              isError: p.erroredToolUseIDs.vZc(n.id)
            })), t[143] !== pe || t[144] !== ve) {
              j = oP.jsx(gXd, {
                flexShrink: 0,
                children: oP.jsx(Mx, {
                  color: ve,
                  bold: true,
                  wrap: "truncate-end",
                  children: pe
                })
              });
              t[143] = pe;
              t[144] = ve;
              t[145] = j;
            } else {
              j = t[145];
            }
            if (t[146] !== Ue) {
              z = Ue !== "" && oP.jsx(gXd, {
                flexWrap: "nowrap",
                children: oP.jsxs(Text, {
                  children: ["(", Ue, ")"]
                })
              });
              t[146] = Ue;
              t[147] = z;
            } else {
              z = t[147];
            }
            V = le.success && de.renderToolUseTag && de.renderToolUseTag(le.data, {
              toolUseId: n.id,
              toolUseResult: ke,
              progressMessages: p.progressMessagesByToolUseID.get(n.id)
            });
            t[88] = r;
            t[89] = s;
            t[90] = d;
            t[91] = a;
            t[92] = le;
            t[93] = m;
            t[94] = _e;
            t[95] = p;
            t[96] = n;
            t[97] = g?.toolUseId;
            t[98] = l;
            t[99] = c;
            t[100] = u;
            t[101] = f;
            t[102] = h;
            t[103] = de;
            t[104] = o;
            t[105] = pe;
            t[106] = ve;
            t[107] = i;
            t[108] = P;
            t[109] = F;
            t[110] = H;
            t[111] = U;
            t[112] = N;
            t[113] = W;
            t[114] = j;
            t[115] = z;
            t[116] = V;
            t[117] = K;
            t[118] = J;
            t[119] = Q;
            t[120] = Z;
            t[121] = ne;
            t[122] = ee;
            t[123] = re;
            t[124] = se;
            t[125] = ae;
          } else {
            P = t[108];
            F = t[109];
            H = t[110];
            U = t[111];
            N = t[112];
            W = t[113];
            j = t[114];
            z = t[115];
            V = t[116];
            K = t[117];
            J = t[118];
            Q = t[119];
            Z = t[120];
            ne = t[121];
            ee = t[122];
            re = t[123];
            se = t[124];
            ae = t[125];
          }
          t[52] = r;
          t[53] = s;
          t[54] = d;
          t[55] = a;
          t[56] = m;
          t[57] = p;
          t[58] = n;
          t[59] = x;
          t[60] = g?.toolUseId;
          t[61] = l;
          t[62] = c;
          t[63] = u;
          t[64] = ue;
          t[65] = f;
          t[66] = h;
          t[67] = o;
          t[68] = i;
          t[69] = P;
          t[70] = F;
          t[71] = H;
          t[72] = U;
          t[73] = N;
          t[74] = W;
          t[75] = j;
          t[76] = z;
          t[77] = V;
          t[78] = K;
          t[79] = J;
          t[80] = Q;
          t[81] = Z;
          t[82] = ne;
          t[83] = ee;
          t[84] = re;
          t[85] = se;
          t[86] = ae;
          t[87] = de;
        } else {
          P = t[69];
          F = t[70];
          H = t[71];
          U = t[72];
          N = t[73];
          W = t[74];
          j = t[75];
          z = t[76];
          V = t[77];
          K = t[78];
          J = t[79];
          Q = t[80];
          Z = t[81];
          ne = t[82];
          ee = t[83];
          re = t[84];
          se = t[85];
          ae = t[86];
          de = t[87];
        }
      }
      t[14] = r;
      t[15] = s;
      t[16] = d;
      t[17] = a;
      t[18] = m;
      t[19] = p;
      t[20] = n;
      t[21] = x;
      t[22] = g?.toolUseId;
      t[23] = l;
      t[24] = M;
      t[25] = c;
      t[26] = u;
      t[27] = L;
      t[28] = f;
      t[29] = h;
      t[30] = o;
      t[31] = i;
      t[32] = P;
      t[33] = F;
      t[34] = H;
      t[35] = U;
      t[36] = N;
      t[37] = W;
      t[38] = j;
      t[39] = z;
      t[40] = V;
      t[41] = K;
      t[42] = J;
      t[43] = Q;
      t[44] = Z;
      t[45] = ne;
      t[46] = oe;
      t[47] = ee;
      t[48] = re;
      t[49] = se;
      t[50] = ae;
      t[51] = de;
    } else {
      P = t[32];
      F = t[33];
      H = t[34];
      U = t[35];
      N = t[36];
      W = t[37];
      j = t[38];
      z = t[39];
      V = t[40];
      K = t[41];
      J = t[42];
      Q = t[43];
      Z = t[44];
      ne = t[45];
      oe = t[46];
      ee = t[47];
      re = t[48];
      se = t[49];
      ae = t[50];
      de = t[51];
    }
    if (oe !== Symbol.for("react.early_return_sentinel")) {
      return oe;
    }
    let be;
    if (t[148] !== P || t[149] !== j || t[150] !== z || t[151] !== V || t[152] !== ee || t[153] !== re || t[154] !== se || t[155] !== ae) {
      be = oP.jsxs(P, {
        flexDirection: ee,
        flexWrap: re,
        minWidth: se,
        children: [ae, j, z, V]
      });
      t[148] = P;
      t[149] = j;
      t[150] = z;
      t[151] = V;
      t[152] = ee;
      t[153] = re;
      t[154] = se;
      t[155] = ae;
      t[156] = be;
    } else {
      be = t[156];
    }
    let fe;
    if (t[157] !== d || t[158] !== S || t[159] !== false || t[160] !== U || t[161] !== N || t[162] !== m || t[163] !== W || t[164] !== p || t[165] !== n.id || t[166] !== l || t[167] !== f || t[168] !== de || t[169] !== o || t[170] !== i) {
      fe = !N && (W ? oP.jsx(Vn, {
        height: 1,
        children: oP.jsx(Text, {
          dimColor: true,
          children: "Waiting for permission\u2026"
        })
      }) : U ? SEm(de) : cSl(de, o, p, n.id, l, {
        verbose: i,
        inProgressToolCallCount: d,
        isTranscriptMode: m
      }, f));
      t[157] = d;
      t[158] = S;
      t[159] = false;
      t[160] = U;
      t[161] = N;
      t[162] = m;
      t[163] = W;
      t[164] = p;
      t[165] = n.id;
      t[166] = l;
      t[167] = f;
      t[168] = de;
      t[169] = o;
      t[170] = i;
      t[171] = fe;
    } else {
      fe = t[171];
    }
    let me;
    if (t[172] !== F || t[173] !== K || t[174] !== be || t[175] !== fe) {
      me = oP.jsxs(F, {
        flexDirection: K,
        children: [be, fe]
      });
      t[172] = F;
      t[173] = K;
      t[174] = be;
      t[175] = fe;
      t[176] = me;
    } else {
      me = t[176];
    }
    let Te;
    if (t[177] !== H || t[178] !== J || t[179] !== Q || t[180] !== Z || t[181] !== ne || t[182] !== me) {
      Te = oP.jsx(H, {
        flexDirection: J,
        justifyContent: Q,
        marginTop: Z,
        width: ne,
        children: me
      });
      t[177] = H;
      t[178] = J;
      t[179] = Q;
      t[180] = Z;
      t[181] = ne;
      t[182] = me;
      t[183] = Te;
    } else {
      Te = t[183];
    }
    return Te;
  }
  function gEm(e) {
    return !!e.toolPermissionContext.strippedDangerousRules;
  }
  function yEm(e) {
    return e.toolPermissionContext.mode;
  }
  function _Em(e) {
    return e.pendingWorkerRequest;
  }
  function bEm(e, t, {
    theme: n,
    verbose: r,
    commands: o
  }) {
    let s = yle(t);
    if (s !== null) {
      return s;
    }
    try {
      return e.renderToolUseMessage(t, {
        theme: n,
        verbose: r,
        commands: o
      });
    } catch (i) {
      Oe($o(Error(`Error rendering tool use message for ${e.name}: ${i}`), `Error rendering tool use message (mcp=${e.name.startsWith("mcp__")})`));
      return "";
    }
  }
  function cSl(e, t, n, r, o, {
    verbose: s,
    inProgressToolCallCount: i,
    isTranscriptMode: a
  }, l) {
    let c = o.filter(u => u.data.type !== "hook_progress");
    try {
      let u = e.renderToolUseProgressMessage?.(c, {
        tools: t,
        verbose: s,
        terminalSize: l,
        inProgressToolCallCount: i ?? 1,
        isTranscriptMode: a
      }) ?? null;
      return oP.jsxs(oP.Fragment, {
        children: [oP.jsx(vKe, {
          children: oP.jsx(BQn, {
            hookEvent: "PreToolUse",
            lookups: n,
            toolUseID: r,
            verbose: s,
            isTranscriptMode: a
          })
        }), u]
      });
    } catch (u) {
      Oe($o(Error(`Error rendering tool use progress message for ${e.name}: ${u}`), `Error rendering tool use progress message (mcp=${e.name.startsWith("mcp__")})`));
      return null;
    }
  }
  function SEm(e) {
    try {
      return e.renderToolUseQueuedMessage?.();
    } catch (t) {
      Oe($o(Error(`Error rendering tool use queued message for ${e.name}: ${t}`), `Error rendering tool use queued message (mcp=${e.name.startsWith("mcp__")})`));
      return null;
    }
  }
  var uSl;
  var dSl;
  var oP;
  var mSl = __lazy(() => {
    ki();
    wl();
    Bco();
    bc();
    et();
    ho();
    ci();
    rSl();
    O1();
    sSl();
    je();
    jV();
    dt();
    Gd();
    Rn();
    qve();
    Wl();
    UQn();
    OSt();
    IMo();
    PMo();
    uSl = __toESM(pt(), 1);
    dSl = __toESM(ot(), 1);
    oP = __toESM(ie(), 1);
  });
  function HQn() {
    if (getIsNonInteractiveSession()) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_coordinator_panel", true);
  }
  var OMo = __lazy(() => {
    at();
    $n();
  });
  function Gz(e) {
    if (!e) {
      return "cyan_FOR_SUBAGENTS_ONLY";
    }
    let t = w3[e];
    if (t) {
      return t;
    }
    return `ansi:${e}`;
  }
  var wKe = __lazy(() => {
    $U();
  });
  function ySl(e) {
    let t = fSl.c(13);
    let {
      attachment: n,
      verbose: r,
      isTranscriptMode: o
    } = e;
    if (n.files.length === 0) {
      return null;
    }
    let s;
    if (t[0] !== n.files) {
      s = n.files.reduce(wEm, 0);
      t[0] = n.files;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a = n.files.length;
    if (r || o) {
      let l;
      if (t[2] !== n.files) {
        l = n.files.map(EEm);
        t[2] = n.files;
        t[3] = l;
      } else {
        l = t[3];
      }
      let c;
      if (t[4] !== l) {
        c = Vz.jsx(gXd, {
          flexDirection: "column",
          children: l
        });
        t[4] = l;
        t[5] = c;
      } else {
        c = t[5];
      }
      return c;
    } else {
      let l;
      if (t[6] !== i) {
        l = Vz.jsx(Text, {
          bold: true,
          children: i
        });
        t[6] = i;
        t[7] = l;
      } else {
        l = t[7];
      }
      let c = i === 1 ? "issue" : "issues";
      let u = a === 1 ? "file" : "files";
      let d;
      if (t[8] !== a || t[9] !== l || t[10] !== c || t[11] !== u) {
        d = Vz.jsx(Vn, {
          children: Vz.jsxs(Text, {
            dimColor: true,
            wrap: "wrap",
            children: ["Found ", l, " new diagnostic", " ", c, " in ", a, " ", u, " (ctrl+o to expand)"]
          })
        });
        t[8] = a;
        t[9] = l;
        t[10] = c;
        t[11] = u;
        t[12] = d;
      } else {
        d = t[12];
      }
      return d;
    }
  }
  function EEm(e, t) {
    return Vz.jsxs(gSl.Fragment, {
      children: [Vz.jsx(Vn, {
        children: Vz.jsxs(Text, {
          dimColor: true,
          wrap: "wrap",
          children: [Vz.jsx(Text, {
            bold: true,
            children: hSl.relative(Nt(), e.uri.replace("file://", "").replace("_claude_fs_right:", ""))
          }), " ", Vz.jsx(Text, {
            dimColor: true,
            children: e.uri.startsWith("file://") ? "(file://)" : e.uri.startsWith("_claude_fs_right:") ? "(claude_fs_right)" : `(${ii(e.uri, ":")})`
          }), ":"]
        })
      }), e.diagnostics.map(vEm)]
    }, t);
  }
  function vEm(e, t) {
    return Vz.jsx(Vn, {
      children: Vz.jsxs(Text, {
        dimColor: true,
        wrap: "wrap",
        children: ["  ", g9.getSeveritySymbol(e.severity), " [Line ", e.range.start.line + 1, ":", e.range.start.character + 1, "] ", e.message, e.code ? ` [${e.code}]` : "", e.source ? ` (${e.source})` : ""]
      })
    }, t);
  }
  function wEm(e, t) {
    return e + t.diagnostics.length;
  }
  var fSl;
  var hSl;
  var gSl;
  var Vz;
  var _Sl = __lazy(() => {
    et();
    K6e();
    vo();
    Zn();
    Wl();
    fSl = __toESM(pt(), 1);
    hSl = require("path");
    gSl = __toESM(ot(), 1);
    Vz = __toESM(ie(), 1);
  });
  function CEm(e) {
    let t = DMo.c(5);
    let {
      request: n
    } = e;
    let r = `Shutdown request from ${n.from}`;
    let o;
    if (t[0] !== n.reason) {
      o = n.reason && lZ.jsxs(Text, {
        children: ["Reason: ", n.reason]
      });
      t[0] = n.reason;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r || t[3] !== o) {
      s = lZ.jsx(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: lZ.jsx(_E, {
          color: "warning",
          title: r,
          children: o
        })
      });
      t[2] = r;
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function REm(e) {
    let t = DMo.c(6);
    let {
      response: n
    } = e;
    let r = `Shutdown rejected by ${n.from}`;
    let o;
    if (t[0] !== n.reason) {
      o = lZ.jsx(x3, {
        children: lZ.jsxs(Text, {
          children: ["Reason: ", n.reason]
        })
      });
      t[0] = n.reason;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = lZ.jsx(Text, {
        dimColor: true,
        children: "Teammate is continuing to work. You may request shutdown again later."
      });
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== r || t[4] !== o) {
      i = lZ.jsx(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: lZ.jsxs(_E, {
          color: "subtle",
          title: r,
          children: [o, s]
        })
      });
      t[3] = r;
      t[4] = o;
      t[5] = i;
    } else {
      i = t[5];
    }
    return i;
  }
  function bSl(e) {
    let t = parseFrameForDisplay(ShutdownRequestMessageSchema(), e);
    if (t) {
      return lZ.jsx(CEm, {
        request: t
      });
    }
    if (parseFrameForDisplay(ShutdownApprovedMessageSchema(), e)) {
      return null;
    }
    let n = parseFrameForDisplay(ShutdownRejectedMessageSchema(), e);
    if (n) {
      return lZ.jsx(REm, {
        response: n
      });
    }
    return null;
  }
  function SSl(e) {
    let t = parseFrameForDisplay(ShutdownRequestMessageSchema(), e);
    if (t) {
      return `[Shutdown Request from ${t.from}]${t.reason ? ` ${t.reason}` : ""}`;
    }
    let n = parseFrameForDisplay(ShutdownApprovedMessageSchema(), e);
    if (n) {
      return `[Shutdown Approved] ${n.from} is now exiting`;
    }
    let r = parseFrameForDisplay(ShutdownRejectedMessageSchema(), e);
    if (r) {
      return `[Shutdown Rejected] ${r.from}: ${r.reason}`;
    }
    return null;
  }
  var DMo;
  var lZ;
  var MMo = __lazy(() => {
    et();
    uA();
    Vze();
    Az();
    DMo = __toESM(pt(), 1);
    lZ = __toESM(ie(), 1);
  });
  function xEm(e) {
    let t = TSl.c(8);
    let {
      assignment: n
    } = e;
    let r = `Task #${n.taskId} assigned by ${n.assignedBy}`;
    let o;
    if (t[0] !== n.subject) {
      o = CKe.jsx(Text, {
        bold: true,
        children: n.subject
      });
      t[0] = n.subject;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n.description) {
      s = n.description && CKe.jsx(Text, {
        dimColor: true,
        children: n.description
      });
      t[2] = n.description;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== r || t[5] !== o || t[6] !== s) {
      i = CKe.jsx(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: CKe.jsxs(_E, {
          color: "cyan_FOR_SUBAGENTS_ONLY",
          title: r,
          children: [o, s]
        })
      });
      t[4] = r;
      t[5] = o;
      t[6] = s;
      t[7] = i;
    } else {
      i = t[7];
    }
    return i;
  }
  function jQn(e) {
    let t = isTaskAssignment(e);
    if (t) {
      return CKe.jsx(xEm, {
        assignment: t
      });
    }
    return null;
  }
  function ESl(e) {
    let t = isTaskAssignment(e);
    if (t) {
      return `[Task Assigned] #${t.taskId} - ${t.subject}`;
    }
    return null;
  }
  var TSl;
  var CKe;
  var qQn = __lazy(() => {
    et();
    uA();
    Az();
    TSl = __toESM(pt(), 1);
    CKe = __toESM(ie(), 1);
  });
  function kEm(e) {
    let t = NMo.c(8);
    let {
      request: n
    } = e;
    let r = `Plan Approval Request from ${n.from}`;
    let o;
    if (t[0] !== n.planContent) {
      o = HM.jsx(x3, {
        children: HM.jsx(cy, {
          stripPromptTags: false,
          children: n.planContent
        })
      });
      t[0] = n.planContent;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n.planFilePath) {
      s = HM.jsxs(Text, {
        dimColor: true,
        children: ["Plan file: ", n.planFilePath]
      });
      t[2] = n.planFilePath;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== r || t[5] !== o || t[6] !== s) {
      i = HM.jsx(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: HM.jsxs(_E, {
          color: "planMode",
          title: r,
          children: [o, s]
        })
      });
      t[4] = r;
      t[5] = o;
      t[6] = s;
      t[7] = i;
    } else {
      i = t[7];
    }
    return i;
  }
  function AEm(e) {
    let t = NMo.c(12);
    let {
      response: n,
      senderName: r
    } = e;
    if (n.approved) {
      let l = `\u2713 Plan Approved by ${r}`;
      let c;
      if (t[0] !== n.feedback) {
        c = n.feedback && HM.jsx(x3, {
          children: HM.jsxs(Text, {
            children: ["Feedback: ", n.feedback]
          })
        });
        t[0] = n.feedback;
        t[1] = c;
      } else {
        c = t[1];
      }
      let u;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        u = HM.jsx(Text, {
          children: "You can now proceed with implementation. Your plan mode restrictions have been lifted."
        });
        t[2] = u;
      } else {
        u = t[2];
      }
      let d;
      if (t[3] !== l || t[4] !== c) {
        d = HM.jsx(gXd, {
          flexDirection: "column",
          marginY: 1,
          children: HM.jsxs(_E, {
            color: "success",
            title: l,
            children: [c, u]
          })
        });
        t[3] = l;
        t[4] = c;
        t[5] = d;
      } else {
        d = t[5];
      }
      return d;
    }
    let o = `\u2717 Plan Rejected by ${r}`;
    let s;
    if (t[6] !== n.feedback) {
      s = n.feedback && HM.jsx(x3, {
        children: HM.jsxs(Text, {
          children: ["Feedback: ", n.feedback]
        })
      });
      t[6] = n.feedback;
      t[7] = s;
    } else {
      s = t[7];
    }
    let i;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      i = HM.jsx(Text, {
        dimColor: true,
        children: "Please revise your plan based on the feedback and call ExitPlanMode again."
      });
      t[8] = i;
    } else {
      i = t[8];
    }
    let a;
    if (t[9] !== o || t[10] !== s) {
      a = HM.jsx(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: HM.jsxs(_E, {
          color: "error",
          title: o,
          children: [s, i]
        })
      });
      t[9] = o;
      t[10] = s;
      t[11] = a;
    } else {
      a = t[11];
    }
    return a;
  }
  function WQn(e, t) {
    let n = parseFrameForDisplay(PlanApprovalRequestMessageSchema(), e);
    if (n) {
      return HM.jsx(kEm, {
        request: n
      });
    }
    let r = parseFrameForDisplay(PlanApprovalResponseMessageSchema(), e);
    if (r) {
      return HM.jsx(AEm, {
        response: r,
        senderName: t
      });
    }
    return null;
  }
  function IEm(e) {
    let t = parseFrameForDisplay(PlanApprovalRequestMessageSchema(), e);
    if (t) {
      return `[Plan Approval Request from ${t.from}]`;
    }
    let n = parseFrameForDisplay(PlanApprovalResponseMessageSchema(), e);
    if (n) {
      if (n.approved) {
        return n.feedback ? `[Plan Approved] ${n.feedback}` : "[Plan Approved] You can now proceed with implementation";
      } else {
        return `[Plan Rejected] ${n.feedback || "Please revise your plan"}`;
      }
    }
    return null;
  }
  function PEm(e) {
    let t = ["Agent idle"];
    if (e.completedTaskId) {
      let n = e.completedStatus || "completed";
      t.push(`Task ${e.completedTaskId} ${n}`);
    }
    if (e.summary) {
      t.push(`Last DM: ${e.summary}`);
    }
    return t.join(" \xB7 ");
  }
  function vSl(e) {
    let t = IEm(e);
    if (t) {
      return t;
    }
    let n = SSl(e);
    if (n) {
      return n;
    }
    let r = parseFrameForDisplay(IdleNotificationMessageSchema(), e);
    if (r) {
      return PEm(r);
    }
    let o = ESl(e);
    if (o) {
      return o;
    }
    let s = parseFrameForDisplay(TeammateTerminatedMessageSchema(), e);
    if (s) {
      return s.message;
    }
    return e;
  }
  var NMo;
  var HM;
  var LMo = __lazy(() => {
    sH();
    et();
    uA();
    Vze();
    Az();
    MMo();
    qQn();
    NMo = __toESM(pt(), 1);
    HM = __toESM(ie(), 1);
  });
  function GQn(e) {
    let t = wSl.c(12);
    let {
      imageId: n,
      addMargin: r
    } = e;
    let o = fw(m => n !== undefined ? m.storedImagePaths.get(n) ?? null : null) ?? null;
    let s = fw(m => n !== undefined ? m.imageDescriptions.get(n) ?? null : null) ?? null;
    let i = n ? `[Image #${n}]` : "[Image]";
    let a;
    if (t[0] !== o || t[1] !== i) {
      a = o && Hk() ? Gve.jsx(Link, {
        url: CSl.pathToFileURL(o).href,
        children: Gve.jsx(Text, {
          children: i
        })
      }) : Gve.jsx(Text, {
        children: i
      });
      t[0] = o;
      t[1] = i;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l = a;
    let c;
    if (t[3] !== s) {
      c = s ? Gve.jsxs(Text, {
        dimColor: true,
        children: [" ", s]
      }) : null;
      t[3] = s;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== l || t[6] !== c) {
      u = Gve.jsxs(Text, {
        children: [l, c]
      });
      t[5] = l;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = u;
    if (r) {
      let m;
      if (t[8] !== d) {
        m = Gve.jsx(gXd, {
          marginTop: 1,
          children: d
        });
        t[8] = d;
        t[9] = m;
      } else {
        m = t[9];
      }
      return m;
    }
    let p;
    if (t[10] !== d) {
      p = Gve.jsx(Vn, {
        children: d
      });
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    return p;
  }
  var wSl;
  var CSl;
  var Gve;
  var FMo = __lazy(() => {
    _ue();
    uG();
    et();
    ho();
    Wl();
    wSl = __toESM(pt(), 1);
    CSl = require("url");
    Gve = __toESM(ie(), 1);
  });
  function VQn(e) {
    if (e.startsWith(`<${"teammate-message"} `)) {
      return true;
    }
    return e.startsWith("Another Claude session sent a message") && e.startsWith(`<${"teammate-message"} `, e.indexOf(`
`) + 1);
  }
  function OEm(e) {
    for (let o of _Xn) {
      if (e.endsWith(o)) {
        e = e.slice(0, -o.length);
        break;
      }
    }
    for (let o of [`${"Another Claude session sent a message"} while you were working:
`, `${"Another Claude session sent a message"}:
`]) {
      if (e.startsWith(o) && e.startsWith(`<${"teammate-message"} `, o.length)) {
        e = e.slice(o.length);
        break;
      }
    }
    let t = new RegExp(`<${"teammate-message"}\\s+teammate_id="([^"]+)"(?:\\s+color="([^"]+)")?(?:\\s+summary="([^"]+)")?>\\n?`, "y");
    let n = [];
    let r = 0;
    while (r < e.length) {
      t.lastIndex = r;
      let o = t.exec(e);
      if (!o) {
        return {
          messages: n,
          unparsed: e.slice(r)
        };
      }
      let s = r + o[0].length;
      let i = -1;
      let a = e.length;
      for (let c = e.indexOf(UMo, s); c !== -1; c = e.indexOf(UMo, c + 1)) {
        let u = c + UMo.length;
        while (u < e.length && /\s/.test(e.charAt(u))) {
          u++;
        }
        if (t.lastIndex = u, u === e.length || t.test(e)) {
          i = c;
          a = u;
          break;
        }
      }
      if (i === -1) {
        i = e.length;
      }
      let l = e.slice(s, i).trim();
      n.push({
        teammateId: JDe(o[1] ?? ""),
        color: o[2] ? JDe(o[2]) : undefined,
        summary: o[3] ? JDe(o[3]) : undefined,
        content: l
      });
      r = a;
    }
    return {
      messages: n,
      unparsed: ""
    };
  }
  function DEm() {
    let e = zSt.c(7);
    let t = bt(MEm);
    let n = Ec();
    let r;
    if (e[0] !== t || e[1] !== n) {
      r = new Map();
      let i;
      if (e[3] !== n) {
        i = Object.values(n.getState().tasks);
        e[3] = n;
        e[4] = i;
      } else {
        i = e[4];
      }
      for (let a of i) {
        if (a.type === "in_process_teammate") {
          r.set(a.id, a.identity.agentName);
        }
      }
      for (let [a, l] of t) {
        r.set(l, a);
      }
      e[0] = t;
      e[1] = n;
      e[2] = r;
    } else {
      r = e[2];
    }
    let o = r;
    let s;
    if (e[5] !== o) {
      s = i => i === "leader" ? "leader" : o.get(i) ?? i;
      e[5] = o;
      e[6] = s;
    } else {
      s = e[6];
    }
    return s;
  }
  function MEm(e) {
    return e.agentNameRegistry;
  }
  function BMo(e) {
    let t = [];
    for (let n of e) {
      if (n.kind === "panel") {
        t.push(n);
        continue;
      }
      let r = t.at(-1);
      if (r && r.kind === "coalesced" && r.displayName === n.displayName) {
        r.count++;
      } else {
        t.push({
          kind: "coalesced",
          displayName: n.displayName,
          count: 1
        });
      }
    }
    return t;
  }
  function xSl(e) {
    let t = zSt.c(22);
    let {
      addMargin: n,
      param: r,
      verbose: o,
      isTranscriptMode: s
    } = e;
    let {
      text: i
    } = r;
    let a = DEm();
    let l = o || s;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    if (t[0] !== n || t[1] !== l || t[2] !== a || t[3] !== i) {
      f = Symbol.for("react.early_return_sentinel");
      e: {
        let {
          messages: _,
          unparsed: b
        } = OEm(i);
        let S = _.filter(FEm);
        if (h = b.trim(), S.length === 0 && !h) {
          f = null;
          break e;
        }
        let E;
        if (t[11] !== a) {
          E = (x, A) => {
            let k = Gz(x.color);
            let I = a(x.teammateId);
            let O = x.summary ? eg.jsxs(gXd, {
              children: [eg.jsxs(Text, {
                color: k,
                children: ["@ ", I, eg.jsx(Text, {
                  "aria-hidden": true,
                  children: vGd.pointer
                })]
              }), eg.jsxs(Text, {
                children: [" ", x.summary]
              })]
            }) : null;
            let M = WQn(x.content, I) ?? bSl(x.content) ?? jQn(x.content);
            if (M) {
              return {
                kind: "panel",
                node: eg.jsxs(RSl.Fragment, {
                  children: [O, M]
                }, A)
              };
            }
            let L = parseFrameForDisplay(IdleNotificationMessageSchema(), x.content);
            if (L && !x.summary) {
              return {
                kind: "panel",
                node: eg.jsx(jMo, {
                  displayName: I,
                  inkColor: k,
                  idleReason: L.idleReason,
                  failureReason: L.failureReason
                }, A)
              };
            }
            let P = parseFrameForDisplay(TaskCompletedMessageSchema(), x.content);
            if (P) {
              return {
                kind: "panel",
                node: eg.jsxs(gXd, {
                  flexDirection: "column",
                  marginTop: 1,
                  children: [eg.jsxs(gXd, {
                    children: [eg.jsxs(Text, {
                      color: k,
                      children: ["@ ", I, eg.jsx(Text, {
                        "aria-hidden": true,
                        children: vGd.pointer
                      })]
                    }), x.summary && eg.jsxs(Text, {
                      children: [" ", x.summary]
                    })]
                  }), eg.jsxs(Vn, {
                    children: [eg.jsx(Ps, {
                      status: "success"
                    }), eg.jsxs(Text, {
                      children: [" ", "Completed task #", P.taskId, P.taskSubject && eg.jsxs(Text, {
                        dimColor: true,
                        children: [" (", P.taskSubject, ")"]
                      })]
                    })]
                  })]
                }, A)
              };
            }
            return {
              kind: "text",
              displayName: I,
              inkColor: k,
              content: x.content,
              summary: x.summary
            };
          };
          t[11] = a;
          t[12] = E;
        } else {
          E = t[12];
        }
        let C = S.map(E);
        c = gXd;
        u = "column";
        d = n ? 1 : 0;
        p = "100%";
        m = l ? C.map(LEm) : BMo(C).map(NEm);
      }
      t[0] = n;
      t[1] = l;
      t[2] = a;
      t[3] = i;
      t[4] = c;
      t[5] = u;
      t[6] = d;
      t[7] = p;
      t[8] = m;
      t[9] = f;
      t[10] = h;
    } else {
      c = t[4];
      u = t[5];
      d = t[6];
      p = t[7];
      m = t[8];
      f = t[9];
      h = t[10];
    }
    if (f !== Symbol.for("react.early_return_sentinel")) {
      return f;
    }
    let g;
    if (t[13] !== h) {
      g = h && eg.jsx(gXd, {
        children: eg.jsx(Text, {
          children: h
        })
      });
      t[13] = h;
      t[14] = g;
    } else {
      g = t[14];
    }
    let y;
    if (t[15] !== c || t[16] !== u || t[17] !== d || t[18] !== p || t[19] !== m || t[20] !== g) {
      y = eg.jsxs(c, {
        flexDirection: u,
        marginTop: d,
        width: p,
        children: [m, g]
      });
      t[15] = c;
      t[16] = u;
      t[17] = d;
      t[18] = p;
      t[19] = m;
      t[20] = g;
      t[21] = y;
    } else {
      y = t[21];
    }
    return y;
  }
  function NEm(e, t) {
    return e.kind === "panel" ? e.node : eg.jsx(HMo, {
      displayName: e.displayName,
      count: e.count
    }, t);
  }
  function LEm(e, t) {
    return e.kind === "panel" ? e.node : eg.jsx($Mo, {
      displayName: e.displayName,
      inkColor: e.inkColor,
      content: e.content,
      summary: e.summary
    }, t);
  }
  function FEm(e) {
    if (e.summary) {
      return true;
    }
    if (parseFrameForDisplay(ShutdownApprovedMessageSchema(), e.content)) {
      return false;
    }
    if (parseFrameForDisplay(TeammateTerminatedMessageSchema(), e.content)) {
      return false;
    }
    return true;
  }
  function $Mo(e) {
    let t = zSt.c(14);
    let {
      displayName: n,
      inkColor: r,
      content: o,
      summary: s
    } = e;
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = eg.jsx(Text, {
        "aria-hidden": true,
        children: vGd.pointer
      });
      t[0] = i;
    } else {
      i = t[0];
    }
    let a;
    if (t[1] !== n || t[2] !== r) {
      a = eg.jsxs(Text, {
        color: r,
        children: ["@ ", n, i]
      });
      t[1] = n;
      t[2] = r;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== s) {
      l = s && eg.jsxs(Text, {
        children: [" ", s]
      });
      t[4] = s;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== a || t[7] !== l) {
      c = eg.jsxs(gXd, {
        children: [a, l]
      });
      t[6] = a;
      t[7] = l;
      t[8] = c;
    } else {
      c = t[8];
    }
    let u;
    if (t[9] !== o) {
      u = o && eg.jsx(gXd, {
        paddingLeft: 2,
        children: eg.jsx(cy, {
          stripPromptTags: false,
          children: o
        })
      });
      t[9] = o;
      t[10] = u;
    } else {
      u = t[10];
    }
    let d;
    if (t[11] !== c || t[12] !== u) {
      d = eg.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [c, u]
      });
      t[11] = c;
      t[12] = u;
      t[13] = d;
    } else {
      d = t[13];
    }
    return d;
  }
  function HMo(e) {
    let t = zSt.c(4);
    let {
      displayName: n,
      count: r
    } = e;
    let o = r === 1 ? "Message" : `${r} messages`;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = eg.jsx(wv, {});
      t[0] = s;
    } else {
      s = t[0];
    }
    let i;
    if (t[1] !== n || t[2] !== o) {
      i = eg.jsx(gXd, {
        marginTop: 1,
        children: eg.jsxs(Text, {
          dimColor: true,
          children: [vGd.pointerSmall, " ", o, " ", "from @", n, " ", s]
        })
      });
      t[1] = n;
      t[2] = o;
      t[3] = i;
    } else {
      i = t[3];
    }
    return i;
  }
  function jMo(e) {
    let t = zSt.c(15);
    let {
      displayName: n,
      inkColor: r,
      idleReason: o,
      failureReason: s
    } = e;
    let i = o === "failed" ? "error" : o === "interrupted" ? "warning" : "success";
    let a = o === "failed" ? "failed" : o === "interrupted" ? "was interrupted" : "finished";
    let l;
    if (t[0] !== s || t[1] !== o) {
      l = o === "failed" && s ? Ad(s).slice(0, 200) : undefined;
      t[0] = s;
      t[1] = o;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = l;
    let u;
    if (t[3] !== i) {
      u = eg.jsx(Text, {
        color: i,
        children: Tc
      });
      t[3] = i;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d;
    if (t[5] !== n || t[6] !== r) {
      d = eg.jsxs(Text, {
        color: r,
        bold: true,
        children: ["@", n]
      });
      t[5] = n;
      t[6] = r;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== c) {
      p = c && eg.jsxs(Text, {
        dimColor: true,
        children: [": ", c]
      });
      t[8] = c;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== a || t[11] !== u || t[12] !== d || t[13] !== p) {
      m = eg.jsx(gXd, {
        marginTop: 1,
        children: eg.jsxs(Text, {
          children: [u, " Teammate", " ", d, " ", a, p]
        })
      });
      t[10] = a;
      t[11] = u;
      t[12] = d;
      t[13] = p;
      t[14] = m;
    } else {
      m = t[14];
    }
    return m;
  }
  var zSt;
  var RSl;
  var eg;
  var UMo;
  var zQn = __lazy(() => {
    wl();
    zbt();
    np();
    et();
    ho();
    wKe();
    Zn();
    uA();
    wx();
    Xq();
    Vf();
    sH();
    Wl();
    LMo();
    MMo();
    qQn();
    zSt = __toESM(pt(), 1);
    RSl = __toESM(ot(), 1);
    eg = __toESM(ie(), 1);
    UMo = `</${"teammate-message"}>`;
  });
  function UEm(e) {
    switch (e) {
      case "completed":
        return "success";
      case "failed":
        return "error";
      case "killed":
        return "warning";
      default:
        return "text";
    }
  }
  function KQn(e) {
    let t = kSl.c(19);
    let {
      addMargin: n,
      param: r
    } = e;
    let {
      text: o
    } = r;
    let s;
    if (t[0] !== o) {
      s = Nl(o, "summary");
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    if (!i) {
      return null;
    }
    let a;
    if (t[2] !== o) {
      let _ = Nl(o, "status");
      a = UEm(_);
      t[2] = o;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l = a;
    let c;
    if (t[4] !== o) {
      c = Nl(o, "duration_ms");
      t[4] = o;
      t[5] = c;
    } else {
      c = t[5];
    }
    let u = Number(c);
    let d;
    if (t[6] !== u) {
      d = Number.isFinite(u) && u > 0 ? ` \xB7 ${formatDuration(u)}` : null;
      t[6] = u;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p = d;
    let m = n ? 1 : 0;
    let f;
    if (t[8] !== l) {
      f = KSt.jsx(Text, {
        color: l,
        children: Tc
      });
      t[8] = l;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== p) {
      h = p && KSt.jsx(Text, {
        dimColor: true,
        children: p
      });
      t[10] = p;
      t[11] = h;
    } else {
      h = t[11];
    }
    let g;
    if (t[12] !== i || t[13] !== f || t[14] !== h) {
      g = KSt.jsxs(Text, {
        children: [f, " ", i, h]
      });
      t[12] = i;
      t[13] = f;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== m || t[17] !== g) {
      y = KSt.jsx(gXd, {
        marginTop: m,
        children: g
      });
      t[16] = m;
      t[17] = g;
      t[18] = y;
    } else {
      y = t[18];
    }
    return y;
  }
  var kSl;
  var KSt;
  var qMo = __lazy(() => {
    wl();
    et();
    cs();
    ro();
    kSl = __toESM(pt(), 1);
    KSt = __toESM(ie(), 1);
  });
  function YQn(e) {
    let t = ASl.c(8);
    let {
      param: n,
      addMargin: r
    } = e;
    let {
      text: o
    } = n;
    let s;
    if (t[0] !== o) {
      s = Nl(o, "bash-input");
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    if (!i) {
      return null;
    }
    let a = r ? 1 : 0;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = B7t.jsx(Text, {
        color: "bashBorder",
        children: "! "
      });
      t[2] = l;
    } else {
      l = t[2];
    }
    let c;
    if (t[3] !== i) {
      c = B7t.jsx(Text, {
        color: "text",
        children: i
      });
      t[3] = i;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== c) {
      u = B7t.jsxs(gXd, {
        flexDirection: "row",
        marginTop: a,
        backgroundColor: "bashMessageBackgroundColor",
        paddingRight: 1,
        children: [l, c]
      });
      t[5] = a;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  var ASl;
  var B7t;
  var WMo = __lazy(() => {
    et();
    ro();
    ASl = __toESM(pt(), 1);
    B7t = __toESM(ie(), 1);
  });
  function PSl(e) {
    let t = ISl.c(10);
    let {
      content: n,
      verbose: r
    } = e;
    let o;
    if (t[0] !== n) {
      let d = Nl(n, "bash-stdout") ?? "";
      o = Nl(d, "persisted-output") ?? umt(d);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i;
    if (t[2] !== n) {
      i = umt(Nl(n, "bash-stderr") ?? "");
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== a || t[5] !== s) {
      l = {
        stdout: s,
        stderr: a
      };
      t[4] = a;
      t[5] = s;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c = !!r;
    let u;
    if (t[7] !== l || t[8] !== c) {
      u = OSl.jsx(e8e, {
        content: l,
        verbose: c
      });
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  var ISl;
  var OSl;
  var DSl = __lazy(() => {
    p9n();
    ro();
    wx();
    ISl = __toESM(pt(), 1);
    OSl = __toESM(ie(), 1);
  });
  function NSl(e) {
    let t = MSl.c(19);
    let {
      addMargin: n,
      param: r
    } = e;
    let {
      text: o
    } = r;
    let s;
    if (t[0] !== o) {
      s = Nl(o, "command-message");
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] !== o) {
      a = Nl(o, "command-args");
      t[2] = o;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l = a;
    let c = Nl(o, "skill-format") === "true";
    if (!i) {
      return null;
    }
    if (c) {
      let g = n ? 1 : 0;
      let y;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        y = Gme.jsxs(Text, {
          color: "subtle",
          children: [vGd.pointer, " "]
        });
        t[4] = y;
      } else {
        y = t[4];
      }
      let _;
      if (t[5] !== i) {
        _ = Gme.jsxs(Text, {
          children: [y, Gme.jsxs(Text, {
            color: "text",
            children: ["Skill(", i, ")"]
          })]
        });
        t[5] = i;
        t[6] = _;
      } else {
        _ = t[6];
      }
      let b;
      if (t[7] !== g || t[8] !== _) {
        b = Gme.jsx(gXd, {
          flexDirection: "column",
          marginTop: g,
          backgroundColor: "userMessageBackground",
          paddingRight: 1,
          children: _
        });
        t[7] = g;
        t[8] = _;
        t[9] = b;
      } else {
        b = t[9];
      }
      return b;
    }
    let u;
    if (t[10] !== l || t[11] !== i) {
      u = [i, l].filter(Boolean);
      t[10] = l;
      t[11] = i;
      t[12] = u;
    } else {
      u = t[12];
    }
    let d = `/${u.join(" ")}`;
    let p = n ? 1 : 0;
    let m;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      m = Gme.jsxs(Text, {
        color: "subtle",
        children: [vGd.pointer, " "]
      });
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== d) {
      f = Gme.jsxs(Text, {
        children: [m, Gme.jsx(Text, {
          color: "text",
          children: d
        })]
      });
      t[14] = d;
      t[15] = f;
    } else {
      f = t[15];
    }
    let h;
    if (t[16] !== p || t[17] !== f) {
      h = Gme.jsx(gXd, {
        flexDirection: "column",
        marginTop: p,
        backgroundColor: "userMessageBackground",
        paddingRight: 1,
        children: f
      });
      t[16] = p;
      t[17] = f;
      t[18] = h;
    } else {
      h = t[18];
    }
    return h;
  }
  var MSl;
  var Gme;
  var LSl = __lazy(() => {
    np();
    et();
    ro();
    MSl = __toESM(pt(), 1);
    Gme = __toESM(ie(), 1);
  });
  function USl(e) {
    let t = JQn.c(2);
    let {
      content: n
    } = e;
    let r;
    if (t[0] !== n) {
      let o = Nl(n, "local-command-stdout");
      let s = Nl(n, "local-command-stderr");
      if (r = [], o?.trim() && o.trim() !== "(no content)") {
        r.push(WU.jsx(FSl, {
          children: o.trim()
        }, "stdout"));
      }
      if (s?.trim()) {
        r.push(WU.jsx(FSl, {
          children: s.trim()
        }, "stderr"));
      }
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    if (r.length === 0) {
      return null;
    }
    return r;
  }
  function FSl(e) {
    let t = JQn.c(5);
    let {
      children: n
    } = e;
    if (n.startsWith(`${"\u25C7"} `) || n.startsWith(`${"\u25C6"} `)) {
      let s;
      if (t[0] !== n) {
        s = WU.jsx(BEm, {
          children: n
        });
        t[0] = n;
        t[1] = s;
      } else {
        s = t[1];
      }
      return s;
    }
    let r;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      r = WU.jsx(Text, {
        dimColor: true,
        children: "  \u23BF  "
      });
      t[2] = r;
    } else {
      r = t[2];
    }
    let o;
    if (t[3] !== n) {
      o = WU.jsxs(gXd, {
        flexDirection: "row",
        children: [r, WU.jsx(gXd, {
          flexDirection: "column",
          flexGrow: 1,
          children: WU.jsx(cy, {
            children: n
          })
        })]
      });
      t[3] = n;
      t[4] = o;
    } else {
      o = t[4];
    }
    return o;
  }
  function BEm(e) {
    let t = JQn.c(19);
    let {
      children: n
    } = e;
    let r = n[0];
    let o;
    let s;
    let i;
    if (t[0] !== n) {
      let f = n.indexOf(`
`);
      let h = f === -1 ? n.slice(2) : n.slice(2, f);
      s = f === -1 ? "" : n.slice(f + 1).trim();
      let g = h.indexOf(" \xB7 ");
      o = g === -1 ? h : h.slice(0, g);
      i = g === -1 ? "" : h.slice(g);
      t[0] = n;
      t[1] = o;
      t[2] = s;
      t[3] = i;
    } else {
      o = t[1];
      s = t[2];
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== r) {
      l = WU.jsxs(Text, {
        color: "background",
        children: [r, " "]
      });
      t[4] = r;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== o) {
      c = WU.jsx(Text, {
        bold: true,
        children: o
      });
      t[6] = o;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== a) {
      u = a && WU.jsx(Text, {
        dimColor: true,
        children: a
      });
      t[8] = a;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== l || t[11] !== c || t[12] !== u) {
      d = WU.jsxs(Text, {
        children: [l, c, u]
      });
      t[10] = l;
      t[11] = c;
      t[12] = u;
      t[13] = d;
    } else {
      d = t[13];
    }
    let p;
    if (t[14] !== s) {
      p = s && WU.jsxs(gXd, {
        flexDirection: "row",
        children: [WU.jsx(Text, {
          dimColor: true,
          children: "  \u23BF  "
        }), WU.jsx(Text, {
          dimColor: true,
          children: s
        })]
      });
      t[14] = s;
      t[15] = p;
    } else {
      p = t[15];
    }
    let m;
    if (t[16] !== d || t[17] !== p) {
      m = WU.jsxs(gXd, {
        flexDirection: "column",
        children: [d, p]
      });
      t[16] = d;
      t[17] = p;
      t[18] = m;
    } else {
      m = t[18];
    }
    return m;
  }
  var JQn;
  var WU;
  var BSl = __lazy(() => {
    wl();
    et();
    ro();
    sH();
    JQn = __toESM(pt(), 1);
    WU = __toESM(ie(), 1);
  });
  function $Em() {
    return yWp(["Got it.", "Good to know.", "Noted."]);
  }
  function HSl(e) {
    let t = $Sl.c(10);
    let {
      text: n,
      addMargin: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = Nl(n, "user-memory-input");
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = $Em();
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    if (!s) {
      return null;
    }
    let l = r ? 1 : 0;
    let c;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      c = wLe.jsx(Text, {
        color: "remember",
        backgroundColor: "memoryBackgroundColor",
        children: "#"
      });
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== s) {
      u = wLe.jsxs(gXd, {
        children: [c, wLe.jsxs(Text, {
          backgroundColor: "memoryBackgroundColor",
          color: "text",
          children: [" ", s, " "]
        })]
      });
      t[4] = s;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      d = wLe.jsx(Vn, {
        height: 1,
        children: wLe.jsx(Text, {
          dimColor: true,
          children: a
        })
      });
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] !== l || t[8] !== u) {
      p = wLe.jsxs(gXd, {
        flexDirection: "column",
        marginTop: l,
        width: "100%",
        children: [u, d]
      });
      t[7] = l;
      t[8] = u;
      t[9] = p;
    } else {
      p = t[9];
    }
    return p;
  }
  var $Sl;
  var wLe;
  var jSl = __lazy(() => {
    et();
    ro();
    Wl();
    $Sl = __toESM(pt(), 1);
    wLe = __toESM(ie(), 1);
  });
  function QQn(e) {
    let t = qSl.c(5);
    let {
      addMargin: n,
      planContent: r
    } = e;
    let o = n ? 1 : 0;
    let s;
    if (t[0] !== r) {
      s = XQn.jsx(_E, {
        color: "planMode",
        title: "Plan to implement",
        children: XQn.jsx(cy, {
          children: r
        })
      });
      t[0] = r;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== o || t[3] !== s) {
      i = XQn.jsx(gXd, {
        marginTop: o,
        children: s
      });
      t[2] = o;
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  var qSl;
  var XQn;
  var GMo = __lazy(() => {
    et();
    Az();
    sH();
    qSl = __toESM(pt(), 1);
    XQn = __toESM(ie(), 1);
  });
  function KSl() {
    return VSl.useContext(zSl);
  }
  function YSl(e) {
    let t = WSl.c(10);
    let {
      isFirst: n,
      useBriefLayout: r,
      selectionHighlight: o,
      children: s
    } = e;
    let i = r ? 0 : 2;
    let a = i * 2;
    let l;
    if (t[0] !== n || t[1] !== o || t[2] !== a) {
      l = {
        isQueued: true,
        isFirst: n,
        paddingWidth: a,
        selectionHighlight: o
      };
      t[0] = n;
      t[1] = o;
      t[2] = a;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = l;
    let u;
    if (t[4] !== s || t[5] !== i) {
      u = VMo.jsx(gXd, {
        paddingX: i,
        children: s
      });
      t[4] = s;
      t[5] = i;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] !== u || t[8] !== c) {
      d = VMo.jsx(zSl.Provider, {
        value: c,
        children: u
      });
      t[7] = u;
      t[8] = c;
      t[9] = d;
    } else {
      d = t[9];
    }
    return d;
  }
  var WSl;
  var GSl;
  var VSl;
  var VMo;
  var zSl;
  var zMo = __lazy(() => {
    et();
    WSl = __toESM(pt(), 1);
    GSl = __toESM(ot(), 1);
    VSl = __toESM(ot(), 1);
    VMo = __toESM(ie(), 1);
    zSl = GSl.createContext(undefined);
  });
  function ZQn(e, t = new Date()) {
    let n = new Date(e);
    if (Number.isNaN(n.getTime())) {
      return "";
    }
    let r = GEm();
    let o = JSl(t) - JSl(n);
    let s = Math.round(o / 86400000);
    if (s === 0) {
      return lun(r, jEm).format(n);
    }
    if (s > 0 && s < 7) {
      return lun(r, qEm).format(n);
    }
    return lun(r, WEm).format(n);
  }
  function GEm() {
    let e = process.env.LC_ALL || process.env.LC_TIME || process.env.LANG || "";
    if (KMo.vZc(e)) {
      return KMo.get(e);
    }
    let t = VEm(e);
    KMo.set(e, t);
    return t;
  }
  function VEm(e) {
    if (!e || e === "C" || e === "POSIX") {
      return;
    }
    let t = ii(ii(e, "."), "@");
    if (!t) {
      return;
    }
    let n = t.replaceAll("_", "-");
    try {
      new Intl.DateTimeFormat(n);
      return n;
    } catch {
      return;
    }
  }
  function JSl(e) {
    return new Date(e.getFullYear(), e.getMonth(), e.getDate()).getTime();
  }
  var jEm;
  var qEm;
  var WEm;
  var KMo;
  var YMo = __lazy(() => {
    PP();
    Zn();
    jEm = {
      hour: "numeric",
      minute: "2-digit"
    };
    qEm = {
      weekday: "long",
      hour: "numeric",
      minute: "2-digit"
    };
    WEm = {
      weekday: "long",
      month: "short",
      day: "numeric",
      hour: "numeric",
      minute: "2-digit"
    };
    KMo = new Map();
  });
  function QSl(e) {
    let t = eZn.c(28);
    let {
      text: n,
      useBriefLayout: r,
      timestamp: o
    } = e;
    let s = KSl();
    let i = s?.isQueued ?? false;
    let a = typeof n === "object";
    if (r) {
      let p;
      if (t[0] !== o) {
        p = o ? ZQn(o) : "";
        t[0] = o;
        t[1] = p;
      } else {
        p = t[1];
      }
      let m = p;
      let f = i ? "subtle" : "text";
      let h = s?.selectionHighlight === "on";
      let g;
      if (t[2] !== h) {
        g = h ? ET.jsxs(Text, {
          "aria-label": "selected:",
          color: "suggestion",
          children: [vGd.pointer, " "]
        }) : null;
        t[2] = h;
        t[3] = g;
      } else {
        g = t[3];
      }
      let y = h ? "suggestion" : i ? "subtle" : "briefLabelYou";
      let _;
      if (t[4] !== y) {
        _ = ET.jsx(Text, {
          color: y,
          children: "You"
        });
        t[4] = y;
        t[5] = _;
      } else {
        _ = t[5];
      }
      let b;
      if (t[6] !== m) {
        b = m ? ET.jsxs(Text, {
          dimColor: true,
          children: [" ", m]
        }) : null;
        t[6] = m;
        t[7] = b;
      } else {
        b = t[7];
      }
      let S;
      if (t[8] !== g || t[9] !== _ || t[10] !== b) {
        S = ET.jsxs(gXd, {
          flexDirection: "row",
          children: [g, _, b]
        });
        t[8] = g;
        t[9] = _;
        t[10] = b;
        t[11] = S;
      } else {
        S = t[11];
      }
      let E;
      if (t[12] !== n || t[13] !== f || t[14] !== a) {
        E = a ? ET.jsxs(ET.Fragment, {
          children: [ET.jsx(Text, {
            color: f,
            children: n.head
          }), ET.jsx(XSl, {
            hiddenLines: n.hiddenLines,
            indent: 2
          }), ET.jsx(Text, {
            color: f,
            children: n.tail
          })]
        }) : ET.jsx(Text, {
          color: f,
          children: n
        });
        t[12] = n;
        t[13] = f;
        t[14] = a;
        t[15] = E;
      } else {
        E = t[15];
      }
      let C;
      if (t[16] !== S || t[17] !== E) {
        C = ET.jsxs(gXd, {
          flexDirection: "column",
          paddingLeft: 2,
          children: [S, E]
        });
        t[16] = S;
        t[17] = E;
        t[18] = C;
      } else {
        C = t[18];
      }
      return C;
    }
    let l = 3 + (s?.paddingWidth ?? 0);
    let c;
    if (t[19] !== s?.selectionHighlight) {
      c = ET.jsx(gXd, {
        flexShrink: 0,
        children: s?.selectionHighlight === "off" ? ET.jsx(Text, {
          children: "  "
        }) : ET.jsxs(Text, {
          "aria-label": s?.selectionHighlight === "on" ? "selected:" : "you:",
          color: s?.selectionHighlight === "on" ? "suggestion" : "subtle",
          children: [vGd.pointer, " "]
        })
      });
      t[19] = s?.selectionHighlight;
      t[20] = c;
    } else {
      c = t[20];
    }
    let u;
    if (t[21] !== l || t[22] !== n || t[23] !== a) {
      u = a ? ET.jsxs(gXd, {
        flexDirection: "column",
        children: [ET.jsx(JMo, {
          text: n.head
        }), ET.jsx(XSl, {
          hiddenLines: n.hiddenLines,
          indent: l
        }), ET.jsx(JMo, {
          text: n.tail
        })]
      }) : ET.jsx(JMo, {
        text: n
      });
      t[21] = l;
      t[22] = n;
      t[23] = a;
      t[24] = u;
    } else {
      u = t[24];
    }
    let d;
    if (t[25] !== c || t[26] !== u) {
      d = ET.jsxs(gXd, {
        flexDirection: "row",
        children: [c, u]
      });
      t[25] = c;
      t[26] = u;
      t[27] = d;
    } else {
      d = t[27];
    }
    return d;
  }
  function XSl(e) {
    let t = eZn.c(3);
    let {
      hiddenLines: n,
      indent: r
    } = e;
    let o = `(${n} ${n === 1 ? "line" : "lines"} hidden)`;
    let s;
    if (t[0] !== r || t[1] !== o) {
      s = ET.jsx(mS, {
        title: o,
        titleAlign: "start",
        color: "subtle",
        padding: r
      });
      t[0] = r;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  function JMo(e) {
    let t = eZn.c(3);
    let {
      text: n
    } = e;
    let r;
    let o;
    if (t[0] !== n) {
      o = Symbol.for("react.early_return_sentinel");
      e: {
        let s = c4e() ? tIn(n) : [];
        if (s.length === 0) {
          o = ET.jsx(Text, {
            color: "text",
            children: n
          });
          break e;
        }
        let i = [];
        let a = 0;
        for (let l of s) {
          if (l.start > a) {
            i.push(ET.jsx(Text, {
              color: "text",
              children: n.slice(a, l.start)
            }, `plain-${a}`));
          }
          for (let c = l.start; c < l.end; c++) {
            i.push(ET.jsx(Text, {
              color: k8(c - l.start),
              children: n[c]
            }, `rb-${c}`));
          }
          a = l.end;
        }
        if (a < n.length) {
          i.push(ET.jsx(Text, {
            color: "text",
            children: n.slice(a)
          }, `plain-${a}`));
        }
        r = ET.jsx(Text, {
          children: i
        });
      }
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      r = t[1];
      o = t[2];
    }
    if (o !== Symbol.for("react.early_return_sentinel")) {
      return o;
    }
    return r;
  }
  var eZn;
  var ET;
  var ZSl = __lazy(() => {
    zMo();
    et();
    YMo();
    XN();
    oX();
    eZn = __toESM(pt(), 1);
    ET = __toESM(ie(), 1);
  });
  function nTl(e) {
    let t = tTl.c(23);
    let {
      addMargin: n,
      param: r,
      isTranscriptMode: o,
      timestamp: s
    } = e;
    let {
      text: i
    } = r;
    let a = bt(JEm);
    let l = bt(YEm);
    let c = Me.CLAUDE_CODE_BRIEF;
    let u;
    if (t[0] !== a || t[1] !== o || t[2] !== l) {
      u = getUserMsgOptIn() && (c || getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_brief", false)) && a && !o && !l;
      t[0] = a;
      t[1] = o;
      t[2] = l;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = u;
    let p;
    e: {
      if (i.length <= 1e4) {
        p = i;
        break e;
      }
      let S;
      if (t[4] !== i) {
        S = i.slice(0, 2500);
        t[4] = i;
        t[5] = S;
      } else {
        S = t[5];
      }
      let E = S;
      let C;
      let x;
      let A;
      if (t[6] !== i) {
        A = i.slice(-2500);
        C = Ru(i, `
`, 2500);
        x = Ru(A, `
`);
        t[6] = i;
        t[7] = C;
        t[8] = x;
        t[9] = A;
      } else {
        C = t[7];
        x = t[8];
        A = t[9];
      }
      let k = C - x;
      let I;
      if (t[10] !== E || t[11] !== k || t[12] !== A) {
        I = {
          head: E,
          hiddenLines: k,
          tail: A
        };
        t[10] = E;
        t[11] = k;
        t[12] = A;
        t[13] = I;
      } else {
        I = t[13];
      }
      p = I;
    }
    let m = p;
    if (!i) {
      Oe(Error("No content found in user prompt message"));
      return null;
    }
    let f = n ? 1 : 0;
    let h = d ? undefined : "userMessageBackground";
    let g = d ? 0 : 1;
    let y = d ? s : undefined;
    let _;
    if (t[14] !== m || t[15] !== y || t[16] !== d) {
      _ = XMo.jsx(QSl, {
        text: m,
        useBriefLayout: d,
        timestamp: y
      });
      t[14] = m;
      t[15] = y;
      t[16] = d;
      t[17] = _;
    } else {
      _ = t[17];
    }
    let b;
    if (t[18] !== f || t[19] !== h || t[20] !== g || t[21] !== _) {
      b = XMo.jsx(gXd, {
        flexDirection: "column",
        marginTop: f,
        backgroundColor: h,
        paddingRight: g,
        children: _
      });
      t[18] = f;
      t[19] = h;
      t[20] = g;
      t[21] = _;
      t[22] = b;
    } else {
      b = t[22];
    }
    return b;
  }
  function YEm(e) {
    return e.viewingAgentTaskId;
  }
  function JEm(e) {
    return e.isBriefOnly;
  }
  var tTl;
  var XMo;
  var rTl = __lazy(() => {
    at();
    et();
    $n();
    ho();
    pr();
    Rn();
    Zn();
    ZSl();
    tTl = __toESM(pt(), 1);
    XMo = __toESM(ie(), 1);
  });
  function XEm(e) {
    let t = [];
    let n = /<mcp-resource-update\s+server="([^"]+)"\s+uri="([^"]+)"[^>]*>(?:[\s\S]*?<reason>([^<]+)<\/reason>)?/g;
    let r;
    while ((r = n.exec(e)) !== null) {
      t.push({
        kind: "resource",
        server: r[1] ?? "",
        target: r[2] ?? "",
        reason: r[3]
      });
    }
    let o = /<mcp-polling-update\s+type="([^"]+)"\s+server="([^"]+)"\s+tool="([^"]+)"[^>]*>(?:[\s\S]*?<reason>([^<]+)<\/reason>)?/g;
    while ((r = o.exec(e)) !== null) {
      t.push({
        kind: "polling",
        server: r[2] ?? "",
        target: r[3] ?? "",
        reason: r[4]
      });
    }
    return t;
  }
  function QEm(e) {
    if (e.startsWith("file://")) {
      let t = e.slice(7);
      let n = t.split("/");
      return n[n.length - 1] || t;
    }
    if (e.length > 40) {
      return e.slice(0, 39) + "\u2026";
    }
    return e;
  }
  function sTl(e) {
    let t = oTl.c(12);
    let {
      addMargin: n,
      param: r
    } = e;
    let {
      text: o
    } = r;
    let s;
    let i;
    let a;
    let l;
    let c;
    if (t[0] !== n || t[1] !== o) {
      c = Symbol.for("react.early_return_sentinel");
      e: {
        let d = XEm(o);
        if (d.length === 0) {
          c = null;
          break e;
        }
        s = gXd;
        i = "column";
        a = n ? 1 : 0;
        l = d.map(ZEm);
      }
      t[0] = n;
      t[1] = o;
      t[2] = s;
      t[3] = i;
      t[4] = a;
      t[5] = l;
      t[6] = c;
    } else {
      s = t[2];
      i = t[3];
      a = t[4];
      l = t[5];
      c = t[6];
    }
    if (c !== Symbol.for("react.early_return_sentinel")) {
      return c;
    }
    let u;
    if (t[7] !== s || t[8] !== i || t[9] !== a || t[10] !== l) {
      u = Vve.jsx(s, {
        flexDirection: i,
        marginTop: a,
        children: l
      });
      t[7] = s;
      t[8] = i;
      t[9] = a;
      t[10] = l;
      t[11] = u;
    } else {
      u = t[11];
    }
    return u;
  }
  function ZEm(e, t) {
    return Vve.jsx(gXd, {
      children: Vve.jsxs(Text, {
        children: [Vve.jsx(Text, {
          color: "success",
          children: "\u21BB"
        }), " ", Vve.jsxs(Text, {
          dimColor: true,
          children: [e.server, ":"]
        }), " ", Vve.jsx(Text, {
          color: "suggestion",
          children: e.kind === "resource" ? QEm(e.target) : e.target
        }), e.reason && Vve.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", e.reason]
        })]
      })
    }, t);
  }
  var oTl;
  var Vve;
  var iTl = __lazy(() => {
    wl();
    et();
    oTl = __toESM(pt(), 1);
    Vve = __toESM(ie(), 1);
  });
  var cTl = {};
  __export(cTl, {
    UserChannelMessage: () => UserChannelMessage
  });
  function rvm(e) {
    let t = e.lastIndexOf(":");
    return t === -1 ? e : e.slice(t + 1);
  }
  function UserChannelMessage(e) {
    let t = lTl.c(36);
    let {
      addMargin: n,
      param: r
    } = e;
    let {
      text: o
    } = r;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    if (t[0] !== n || t[1] !== o) {
      f = Symbol.for("react.early_return_sentinel");
      e: {
        let b = o;
        let S = "";
        if (b.startsWith("A message arrived from ")) {
          let H = b.indexOf(`
`);
          if (H !== -1 && b.startsWith('<channel source="', H + 1)) {
            S = b.slice(0, H);
            b = b.slice(H + 1);
          }
        }
        let E = b.lastIndexOf(tZn) + tZn.length;
        if (E > tZn.length - 1) {
          let H = b.slice(E);
          if (nvm.includes(H)) {
            b = b.slice(0, E);
          }
        }
        let C = evm.exec(b);
        if (!C) {
          let H = n ? 1 : 0;
          let U;
          if (t[13] !== o) {
            U = o.trim();
            t[13] = o;
            t[14] = U;
          } else {
            U = t[14];
          }
          let N;
          if (t[15] !== U) {
            N = CLe.jsx(Text, {
              children: U
            });
            t[15] = U;
            t[16] = N;
          } else {
            N = t[16];
          }
          let W;
          if (t[17] !== N || t[18] !== H) {
            W = CLe.jsx(gXd, {
              marginTop: H,
              children: N
            });
            t[17] = N;
            t[18] = H;
            t[19] = W;
          } else {
            W = t[19];
          }
          f = W;
          break e;
        }
        let [x, A, k] = C;
        let I = A === undefined ? "" : A;
        let O = tvm.exec(k ?? "")?.[1];
        let M = JDe(I);
        if (S === `${"A message arrived from "}${M} while you were working:` || S === `${"A message arrived from "}${M}:`) {
          S = "";
        }
        let L = b.slice(x.length);
        let P = L.trimEnd();
        if (P.endsWith(aTl)) {
          L = P.slice(0, -aTl.length);
        }
        let F = `${S ? `${S} ` : ""}${L}`.trim().replace(/\s+/g, " ");
        if (h = truncateToWidth(F, 60), a = gXd, m = n ? 1 : 0, i = Text, t[20] === Symbol.for("react.memo_cache_sentinel")) {
          d = CLe.jsx(Text, {
            color: "suggestion",
            children: "\u2190"
          });
          t[20] = d;
        } else {
          d = t[20];
        }
        p = " ";
        s = Text;
        l = true;
        c = rvm(JDe(I));
        u = O ? ` \xB7 ${JDe(O)}` : "";
      }
      t[0] = n;
      t[1] = o;
      t[2] = s;
      t[3] = i;
      t[4] = a;
      t[5] = l;
      t[6] = c;
      t[7] = u;
      t[8] = d;
      t[9] = p;
      t[10] = m;
      t[11] = f;
      t[12] = h;
    } else {
      s = t[2];
      i = t[3];
      a = t[4];
      l = t[5];
      c = t[6];
      u = t[7];
      d = t[8];
      p = t[9];
      m = t[10];
      f = t[11];
      h = t[12];
    }
    if (f !== Symbol.for("react.early_return_sentinel")) {
      return f;
    }
    let g;
    if (t[21] !== s || t[22] !== l || t[23] !== c || t[24] !== u) {
      g = CLe.jsxs(s, {
        dimColor: l,
        children: [c, u, ":"]
      });
      t[21] = s;
      t[22] = l;
      t[23] = c;
      t[24] = u;
      t[25] = g;
    } else {
      g = t[25];
    }
    let y;
    if (t[26] !== i || t[27] !== d || t[28] !== p || t[29] !== g || t[30] !== h) {
      y = CLe.jsxs(i, {
        children: [d, p, g, " ", h]
      });
      t[26] = i;
      t[27] = d;
      t[28] = p;
      t[29] = g;
      t[30] = h;
      t[31] = y;
    } else {
      y = t[31];
    }
    let _;
    if (t[32] !== a || t[33] !== y || t[34] !== m) {
      _ = CLe.jsx(a, {
        marginTop: m,
        children: y
      });
      t[32] = a;
      t[33] = y;
      t[34] = m;
      t[35] = _;
    } else {
      _ = t[35];
    }
    return _;
  }
  var lTl;
  var CLe;
  var evm;
  var tZn;
  var aTl;
  var tvm;
  var nvm;
  var uTl = __lazy(() => {
    wl();
    np();
    et();
    cs();
    wx();
    lTl = __toESM(pt(), 1);
    CLe = __toESM(ie(), 1);
    evm = new RegExp(`^<${"channel"}\\s+source="([^"]*)"([^>]*)>\\n?`);
    tZn = `</${"channel"}>`;
    aTl = `
${tZn}`;
    tvm = /\buser="([^"]+)"/;
    nvm = [`

${Q4e(false)}${" After completing your current task, decide whether/how to respond."}`, `

${Q4e(false)}`, `

${Q4e(true)}${" After completing your current task, decide whether/how to respond."}`, `

${Q4e(true)}`];
  });
  var pTl = {};
  __export(pTl, {
    UserForkBoilerplateMessage: () => UserForkBoilerplateMessage
  });
  function UserForkBoilerplateMessage(e) {
    let t = dTl.c(8);
    let {
      addMargin: n,
      param: r
    } = e;
    let {
      text: o
    } = r;
    let s;
    if (t[0] !== o) {
      let d = o.replace(ivm, "");
      s = d.startsWith("Your directive: ") ? d.slice(("Your directive: ").length) : d;
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a = n ? 1 : 0;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = YSt.jsx(Text, {
        dimColor: true,
        children: "\u2442"
      });
      t[2] = l;
    } else {
      l = t[2];
    }
    let c;
    if (t[3] !== i) {
      c = YSt.jsx(gXd, {
        paddingLeft: 1,
        children: YSt.jsx(Text, {
          children: i
        })
      });
      t[3] = i;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== c) {
      u = YSt.jsxs(gXd, {
        marginTop: a,
        backgroundColor: "userMessageBackground",
        paddingRight: 1,
        children: [l, c]
      });
      t[5] = a;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  var dTl;
  var YSt;
  var ivm;
  var mTl = __lazy(() => {
    wl();
    np();
    et();
    dTl = __toESM(pt(), 1);
    YSt = __toESM(ie(), 1);
    ivm = new RegExp(`<${"fork-boilerplate"}>[\\s\\S]*?</${"fork-boilerplate"}>\\n*`);
  });
  function RKe(e) {
    let t = hTl.c(50);
    let {
      addMargin: n,
      param: r,
      verbose: o,
      planContent: s,
      isTranscriptMode: i,
      timestamp: a
    } = e;
    if (typeof r.text !== "string" || !r.text || r.text.trim() === "(no content)") {
      return null;
    }
    if (s) {
      let c;
      if (t[0] !== n || t[1] !== s) {
        c = k3.jsx(QQn, {
          addMargin: n,
          planContent: s
        });
        t[0] = n;
        t[1] = s;
        t[2] = c;
      } else {
        c = t[2];
      }
      return c;
    }
    if (isAgentSwarmsEnabled() && VQn(r.text)) {
      let c;
      if (t[3] !== n || t[4] !== i || t[5] !== r || t[6] !== o) {
        c = k3.jsx(xSl, {
          addMargin: n,
          param: r,
          verbose: o,
          isTranscriptMode: i
        });
        t[3] = n;
        t[4] = i;
        t[5] = r;
        t[6] = o;
        t[7] = c;
      } else {
        c = t[7];
      }
      return c;
    }
    if (r.text.startsWith('<channel source="') || r.text.startsWith("A message arrived from ") && r.text.startsWith('<channel source="', r.text.indexOf(`
`) + 1)) {
      let c;
      if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
        c = (uTl(), __toCommonJS(cTl));
        t[8] = c;
      } else {
        c = t[8];
      }
      let {
        UserChannelMessage: u
      } = c;
      let d;
      if (t[9] !== n || t[10] !== r) {
        d = k3.jsx(u, {
          addMargin: n,
          param: r
        });
        t[9] = n;
        t[10] = r;
        t[11] = d;
      } else {
        d = t[11];
      }
      return d;
    }
    if (Nl(r.text, "tick")) {
      return null;
    }
    if (r.text.includes(`<${"local-command-caveat"}>`)) {
      return null;
    }
    if (r.text.startsWith("<bash-stdout") || r.text.startsWith("<bash-stderr")) {
      let c;
      if (t[16] !== r.text || t[17] !== o) {
        c = k3.jsx(PSl, {
          content: r.text,
          verbose: o
        });
        t[16] = r.text;
        t[17] = o;
        t[18] = c;
      } else {
        c = t[18];
      }
      return c;
    }
    if (r.text.startsWith("<local-command-stdout") || r.text.startsWith("<local-command-stderr")) {
      let c;
      if (t[19] !== r.text) {
        c = k3.jsx(USl, {
          content: r.text
        });
        t[19] = r.text;
        t[20] = c;
      } else {
        c = t[20];
      }
      return c;
    }
    if (r.text === "[Request interrupted by user]" || r.text === "[Request interrupted by user for tool use]") {
      let c;
      if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
        c = k3.jsx(Vn, {
          height: 1,
          children: k3.jsx(Hme, {})
        });
        t[21] = c;
      } else {
        c = t[21];
      }
      return c;
    }
    if (r.text.includes("<bash-input>")) {
      let c;
      if (t[22] !== n || t[23] !== r) {
        c = k3.jsx(YQn, {
          addMargin: n,
          param: r
        });
        t[22] = n;
        t[23] = r;
        t[24] = c;
      } else {
        c = t[24];
      }
      return c;
    }
    if (r.text.includes(`<${"command-message"}>`)) {
      let c;
      if (t[25] !== n || t[26] !== r) {
        c = k3.jsx(NSl, {
          addMargin: n,
          param: r
        });
        t[25] = n;
        t[26] = r;
        t[27] = c;
      } else {
        c = t[27];
      }
      return c;
    }
    if (r.text.includes("<user-memory-input>")) {
      let c;
      if (t[28] !== n || t[29] !== r.text) {
        c = k3.jsx(HSl, {
          addMargin: n,
          text: r.text
        });
        t[28] = n;
        t[29] = r.text;
        t[30] = c;
      } else {
        c = t[30];
      }
      return c;
    }
    if (r.text.includes(`<${"task-notification"}`)) {
      let c;
      if (t[31] !== n || t[32] !== r) {
        c = k3.jsx(KQn, {
          addMargin: n,
          param: r
        });
        t[31] = n;
        t[32] = r;
        t[33] = c;
      } else {
        c = t[33];
      }
      return c;
    }
    if (r.text.includes("<mcp-resource-update") || r.text.includes("<mcp-polling-update")) {
      let c;
      if (t[34] !== n || t[35] !== r) {
        c = k3.jsx(sTl, {
          addMargin: n,
          param: r
        });
        t[34] = n;
        t[35] = r;
        t[36] = c;
      } else {
        c = t[36];
      }
      return c;
    }
    if (r.text.includes("<fork-boilerplate>")) {
      let c;
      if (t[37] === Symbol.for("react.memo_cache_sentinel")) {
        c = (mTl(), __toCommonJS(pTl));
        t[37] = c;
      } else {
        c = t[37];
      }
      let {
        UserForkBoilerplateMessage: u
      } = c;
      let d;
      if (t[38] !== n || t[39] !== r) {
        d = k3.jsx(u, {
          addMargin: n,
          param: r
        });
        t[38] = n;
        t[39] = r;
        t[40] = d;
      } else {
        d = t[40];
      }
      return d;
    }
    let l;
    if (t[45] !== n || t[46] !== i || t[47] !== r || t[48] !== a) {
      l = k3.jsx(nTl, {
        addMargin: n,
        param: r,
        isTranscriptMode: i,
        timestamp: a
      });
      t[45] = n;
      t[46] = i;
      t[47] = r;
      t[48] = a;
      t[49] = l;
    } else {
      l = t[49];
    }
    return l;
  }
  var hTl;
  var k3;
  var nZn = __lazy(() => {
    np();
    mE();
    ro();
    ISt();
    Wl();
    qMo();
    WMo();
    DSl();
    LSl();
    BSl();
    jSl();
    GMo();
    rTl();
    iTl();
    zQn();
    hTl = __toESM(pt(), 1);
    k3 = __toESM(ie(), 1);
  });
  function gTl(e) {
    let t = JSt.c(227);
    let {
      attachment: n,
      addMargin: r,
      verbose: o,
      isTranscriptMode: s
    } = e;
    if (isAgentSwarmsEnabled() && n.type === "teammate_mailbox") {
      let i = n.messages;
      let a;
      let l;
      let c;
      let u;
      if (t[0] !== n.messages || t[1] !== s || t[2] !== o) {
        u = Symbol.for("react.early_return_sentinel");
        e: {
          let p = i.filter(mvm);
          if (p.length === 0) {
            u = null;
            break e;
          }
          let m = p.map(pvm);
          let f = o || s;
          a = gXd;
          l = "column";
          c = f ? m.map(dvm) : BMo(m).map(uvm);
        }
        t[0] = n.messages;
        t[1] = s;
        t[2] = o;
        t[3] = a;
        t[4] = l;
        t[5] = c;
        t[6] = u;
      } else {
        a = t[3];
        l = t[4];
        c = t[5];
        u = t[6];
      }
      if (u !== Symbol.for("react.early_return_sentinel")) {
        return u;
      }
      let d;
      if (t[7] !== a || t[8] !== l || t[9] !== c) {
        d = Rs.jsx(a, {
          flexDirection: l,
          children: c
        });
        t[7] = a;
        t[8] = l;
        t[9] = c;
        t[10] = d;
      } else {
        d = t[10];
      }
      return d;
    }
    switch (n.type) {
      case "directory":
        {
          let i = n.displayPath + rZn.sep;
          let a;
          if (t[11] !== i) {
            a = Rs.jsxs(Vw, {
              children: ["Listed directory ", Rs.jsx(Text, {
                bold: true,
                children: i
              })]
            });
            t[11] = i;
            t[12] = a;
          } else {
            a = t[12];
          }
          return a;
        }
      case "file":
      case "already_read_file":
        {
          if (n.content.type === "notebook") {
            let c;
            if (t[13] !== n.displayPath) {
              c = Rs.jsx(Text, {
                bold: true,
                children: n.displayPath
              });
              t[13] = n.displayPath;
              t[14] = c;
            } else {
              c = t[14];
            }
            let u;
            if (t[15] !== n.content.file.cells.length || t[16] !== c) {
              u = Rs.jsxs(Vw, {
                children: ["Read ", c, " (", n.content.file.cells.length, " cells)"]
              });
              t[15] = n.content.file.cells.length;
              t[16] = c;
              t[17] = u;
            } else {
              u = t[17];
            }
            return u;
          }
          if (n.content.type === "file_unchanged") {
            let c;
            if (t[18] !== n.displayPath) {
              c = Rs.jsxs(Vw, {
                children: ["Read ", Rs.jsx(Text, {
                  bold: true,
                  children: n.displayPath
                }), " (unchanged)"]
              });
              t[18] = n.displayPath;
              t[19] = c;
            } else {
              c = t[19];
            }
            return c;
          }
          let i;
          if (t[20] !== n.displayPath) {
            i = Rs.jsx(Text, {
              bold: true,
              children: n.displayPath
            });
            t[20] = n.displayPath;
            t[21] = i;
          } else {
            i = t[21];
          }
          let a;
          if (t[22] !== n.content.file.numLines || t[23] !== n.content.file.originalSize || t[24] !== n.content.type || t[25] !== n.truncated) {
            a = n.content.type === "text" ? `${n.content.file.numLines}${n.truncated ? "+" : ""} lines` : formatFileSize(n.content.file.originalSize);
            t[22] = n.content.file.numLines;
            t[23] = n.content.file.originalSize;
            t[24] = n.content.type;
            t[25] = n.truncated;
            t[26] = a;
          } else {
            a = t[26];
          }
          let l;
          if (t[27] !== i || t[28] !== a) {
            l = Rs.jsxs(Vw, {
              children: ["Read ", i, " (", a, ")"]
            });
            t[27] = i;
            t[28] = a;
            t[29] = l;
          } else {
            l = t[29];
          }
          return l;
        }
      case "compact_file_reference":
        {
          let i;
          if (t[30] !== n.displayPath) {
            i = Rs.jsxs(Vw, {
              children: ["Referenced file ", Rs.jsx(Text, {
                bold: true,
                children: n.displayPath
              })]
            });
            t[30] = n.displayPath;
            t[31] = i;
          } else {
            i = t[31];
          }
          return i;
        }
      case "pdf_reference":
        {
          let i;
          if (t[32] !== n.displayPath) {
            i = Rs.jsx(Text, {
              bold: true,
              children: n.displayPath
            });
            t[32] = n.displayPath;
            t[33] = i;
          } else {
            i = t[33];
          }
          let a;
          if (t[34] !== n.pageCount || t[35] !== i) {
            a = Rs.jsxs(Vw, {
              children: ["Referenced PDF ", i, " (", n.pageCount, " pages)"]
            });
            t[34] = n.pageCount;
            t[35] = i;
            t[36] = a;
          } else {
            a = t[36];
          }
          return a;
        }
      case "selected_lines_in_ide":
        {
          let i;
          if (t[37] === Symbol.for("react.memo_cache_sentinel")) {
            i = Rs.jsx(Text, {
              "aria-hidden": true,
              children: "\u29C9 "
            });
            t[37] = i;
          } else {
            i = t[37];
          }
          let a = n.lineEnd - n.lineStart + 1;
          let l;
          if (t[38] !== a) {
            l = Rs.jsx(Text, {
              bold: true,
              children: a
            });
            t[38] = a;
            t[39] = l;
          } else {
            l = t[39];
          }
          let c;
          if (t[40] !== n.displayPath) {
            c = Rs.jsx(Text, {
              bold: true,
              children: n.displayPath
            });
            t[40] = n.displayPath;
            t[41] = c;
          } else {
            c = t[41];
          }
          let u;
          if (t[42] !== n.ideName || t[43] !== l || t[44] !== c) {
            u = Rs.jsxs(Vw, {
              children: [i, "Selected", " ", l, " ", "lines from ", c, " in", " ", n.ideName]
            });
            t[42] = n.ideName;
            t[43] = l;
            t[44] = c;
            t[45] = u;
          } else {
            u = t[45];
          }
          return u;
        }
      case "selected_lines_in_diff":
        {
          let i;
          if (t[46] === Symbol.for("react.memo_cache_sentinel")) {
            i = Rs.jsx(Text, {
              "aria-hidden": true,
              children: "\u29C9 "
            });
            t[46] = i;
          } else {
            i = t[46];
          }
          let a;
          if (t[47] !== n.lineCount) {
            a = Rs.jsx(Text, {
              bold: true,
              children: n.lineCount
            });
            t[47] = n.lineCount;
            t[48] = a;
          } else {
            a = t[48];
          }
          let l;
          if (t[49] !== n.lineCount) {
            l = un(n.lineCount, "line");
            t[49] = n.lineCount;
            t[50] = l;
          } else {
            l = t[50];
          }
          let c;
          if (t[51] !== a || t[52] !== l) {
            c = Rs.jsxs(Vw, {
              children: [i, "Selected", " ", a, " ", l, " from diff view"]
            });
            t[51] = a;
            t[52] = l;
            t[53] = c;
          } else {
            c = t[53];
          }
          return c;
        }
      case "nested_memory":
        {
          let i;
          if (t[54] !== n.displayPath) {
            i = Rs.jsxs(Vw, {
              children: ["Loaded ", Rs.jsx(Text, {
                bold: true,
                children: n.displayPath
              })]
            });
            t[54] = n.displayPath;
            t[55] = i;
          } else {
            i = t[55];
          }
          return i;
        }
      case "relevant_memories":
        {
          let i = r ? 1 : 0;
          let a;
          if (t[56] === Symbol.for("react.memo_cache_sentinel")) {
            a = Rs.jsx(gXd, {
              minWidth: 2
            });
            t[56] = a;
          } else {
            a = t[56];
          }
          let l;
          if (t[57] !== n.memories.length) {
            l = Rs.jsx(Text, {
              bold: true,
              children: n.memories.length
            });
            t[57] = n.memories.length;
            t[58] = l;
          } else {
            l = t[58];
          }
          let c = n.memories.length === 1 ? "memory" : "memories";
          let u;
          if (t[59] !== s) {
            u = !s && Rs.jsxs(Rs.Fragment, {
              children: [" ", Rs.jsx(wv, {})]
            });
            t[59] = s;
            t[60] = u;
          } else {
            u = t[60];
          }
          let d;
          if (t[61] !== l || t[62] !== c || t[63] !== u) {
            d = Rs.jsxs(gXd, {
              flexDirection: "row",
              children: [a, Rs.jsxs(Text, {
                dimColor: true,
                children: ["Recalled ", l, " ", c, u]
              })]
            });
            t[61] = l;
            t[62] = c;
            t[63] = u;
            t[64] = d;
          } else {
            d = t[64];
          }
          let p;
          if (t[65] !== n.memories || t[66] !== s || t[67] !== o) {
            p = (o || s) && n.memories.map(f => Rs.jsxs(gXd, {
              flexDirection: "column",
              children: [Rs.jsx(Vn, {
                children: Rs.jsx(Text, {
                  dimColor: true,
                  children: Rs.jsx(vM, {
                    filePath: f.path,
                    children: rZn.basename(f.path)
                  })
                })
              }), s && Rs.jsx(gXd, {
                paddingLeft: 5,
                children: Rs.jsx(Text, {
                  children: Rs.jsx(Ansi, {
                    children: f.content
                  })
                })
              })]
            }, f.path));
            t[65] = n.memories;
            t[66] = s;
            t[67] = o;
            t[68] = p;
          } else {
            p = t[68];
          }
          let m;
          if (t[69] !== i || t[70] !== d || t[71] !== p) {
            m = Rs.jsxs(gXd, {
              flexDirection: "column",
              marginTop: i,
              children: [d, p]
            });
            t[69] = i;
            t[70] = d;
            t[71] = p;
            t[72] = m;
          } else {
            m = t[72];
          }
          return m;
        }
      case "context_tip":
        {
          let {
            tip: i
          } = n;
          let a = r ? 1 : 0;
          let l = i.action && !i.tip.includes(i.action) ? ` \u2192 ${i.action}` : "";
          let c;
          if (t[73] !== l || t[74] !== i.tip) {
            c = Rs.jsx(Vn, {
              children: Rs.jsxs(Text, {
                dimColor: true,
                children: ["Tip: ", i.tip, l]
              })
            });
            t[73] = l;
            t[74] = i.tip;
            t[75] = c;
          } else {
            c = t[75];
          }
          let u;
          if (t[76] !== a || t[77] !== c) {
            u = Rs.jsx(gXd, {
              flexDirection: "column",
              marginTop: a,
              children: c
            });
            t[76] = a;
            t[77] = c;
            t[78] = u;
          } else {
            u = t[78];
          }
          return u;
        }
      case "dynamic_skill":
        {
          let i = n.skillNames.length;
          let a;
          if (t[79] !== i) {
            a = un(i, "skill");
            t[79] = i;
            t[80] = a;
          } else {
            a = t[80];
          }
          let l;
          if (t[81] !== i || t[82] !== a) {
            l = Rs.jsxs(Text, {
              bold: true,
              children: [i, " ", a]
            });
            t[81] = i;
            t[82] = a;
            t[83] = l;
          } else {
            l = t[83];
          }
          let c;
          if (t[84] !== n.displayPath) {
            c = Rs.jsx(Text, {
              bold: true,
              children: n.displayPath
            });
            t[84] = n.displayPath;
            t[85] = c;
          } else {
            c = t[85];
          }
          let u;
          if (t[86] !== l || t[87] !== c) {
            u = Rs.jsxs(Vw, {
              children: ["Loaded", " ", l, " ", "from ", c]
            });
            t[86] = l;
            t[87] = c;
            t[88] = u;
          } else {
            u = t[88];
          }
          return u;
        }
      case "skill_listing":
        {
          if (n.isInitial) {
            return null;
          }
          let i;
          if (t[89] !== n.skillCount) {
            i = Rs.jsx(Text, {
              bold: true,
              children: n.skillCount
            });
            t[89] = n.skillCount;
            t[90] = i;
          } else {
            i = t[90];
          }
          let a;
          if (t[91] !== n.skillCount) {
            a = un(n.skillCount, "skill");
            t[91] = n.skillCount;
            t[92] = a;
          } else {
            a = t[92];
          }
          let l;
          if (t[93] !== i || t[94] !== a) {
            l = Rs.jsxs(Vw, {
              children: [i, " ", a, " available"]
            });
            t[93] = i;
            t[94] = a;
            t[95] = l;
          } else {
            l = t[95];
          }
          return l;
        }
      case "agent_listing_delta":
        {
          if (n.isInitial || n.addedTypes.length === 0) {
            return null;
          }
          let i = n.addedTypes.length;
          let a;
          if (t[96] !== i) {
            a = Rs.jsx(Text, {
              bold: true,
              children: i
            });
            t[96] = i;
            t[97] = a;
          } else {
            a = t[97];
          }
          let l;
          if (t[98] !== i) {
            l = un(i, "type");
            t[98] = i;
            t[99] = l;
          } else {
            l = t[99];
          }
          let c;
          if (t[100] !== a || t[101] !== l) {
            c = Rs.jsxs(Vw, {
              children: [a, " agent ", l, " available"]
            });
            t[100] = a;
            t[101] = l;
            t[102] = c;
          } else {
            c = t[102];
          }
          return c;
        }
      case "queued_command":
        {
          let i;
          if (t[103] !== n.prompt) {
            i = typeof n.prompt === "string" ? n.prompt : cZ(n.prompt) || "";
            t[103] = n.prompt;
            t[104] = i;
          } else {
            i = t[104];
          }
          let a = i;
          let l = n.imagePasteIds && n.imagePasteIds.length > 0;
          let c;
          if (t[105] !== a) {
            c = {
              text: a,
              type: "text"
            };
            t[105] = a;
            t[106] = c;
          } else {
            c = t[106];
          }
          let u;
          if (t[107] !== r || t[108] !== s || t[109] !== c || t[110] !== o) {
            u = Rs.jsx(RKe, {
              addMargin: r,
              param: c,
              verbose: o,
              isTranscriptMode: s
            });
            t[107] = r;
            t[108] = s;
            t[109] = c;
            t[110] = o;
            t[111] = u;
          } else {
            u = t[111];
          }
          let d;
          if (t[112] !== n.imagePasteIds || t[113] !== l) {
            d = l && n.imagePasteIds?.map(cvm);
            t[112] = n.imagePasteIds;
            t[113] = l;
            t[114] = d;
          } else {
            d = t[114];
          }
          let p;
          if (t[115] !== u || t[116] !== d) {
            p = Rs.jsxs(gXd, {
              flexDirection: "column",
              children: [u, d]
            });
            t[115] = u;
            t[116] = d;
            t[117] = p;
          } else {
            p = t[117];
          }
          return p;
        }
      case "plan_file_reference":
        {
          let i;
          if (t[118] !== n.planFilePath) {
            i = Pd(n.planFilePath);
            t[118] = n.planFilePath;
            t[119] = i;
          } else {
            i = t[119];
          }
          let a;
          if (t[120] !== i) {
            a = Rs.jsxs(Vw, {
              children: ["Plan file referenced (", i, ")"]
            });
            t[120] = i;
            t[121] = a;
          } else {
            a = t[121];
          }
          return a;
        }
      case "invoked_skills":
        {
          if (n.skills.length === 0) {
            return null;
          }
          let i;
          if (t[122] !== n.skills) {
            i = n.skills.map(lvm).join(", ");
            t[122] = n.skills;
            t[123] = i;
          } else {
            i = t[123];
          }
          let a = i;
          let l;
          if (t[124] !== a) {
            l = Rs.jsxs(Vw, {
              children: ["Skills restored (", a, ")"]
            });
            t[124] = a;
            t[125] = l;
          } else {
            l = t[125];
          }
          return l;
        }
      case "diagnostics":
        {
          let i;
          if (t[126] !== n || t[127] !== s || t[128] !== o) {
            i = Rs.jsx(ySl, {
              attachment: n,
              verbose: o,
              isTranscriptMode: s
            });
            t[126] = n;
            t[127] = s;
            t[128] = o;
            t[129] = i;
          } else {
            i = t[129];
          }
          return i;
        }
      case "mcp_resource":
        {
          let i;
          if (t[130] !== n.name) {
            i = Rs.jsx(Text, {
              bold: true,
              children: n.name
            });
            t[130] = n.name;
            t[131] = i;
          } else {
            i = t[131];
          }
          let a;
          if (t[132] !== n.server || t[133] !== i) {
            a = Rs.jsxs(Vw, {
              children: ["Read MCP resource ", i, " from", " ", n.server]
            });
            t[132] = n.server;
            t[133] = i;
            t[134] = a;
          } else {
            a = t[134];
          }
          return a;
        }
      case "command_permissions":
        return null;
      case "async_hook_response":
        {
          if (n.hookEvent === "SessionStart" && !o) {
            return null;
          }
          if (!o && !s) {
            return null;
          }
          let i;
          if (t[135] !== n.hookEvent) {
            i = Rs.jsxs(Vw, {
              children: ["Async hook ", Rs.jsx(Text, {
                bold: true,
                children: n.hookEvent
              }), " completed"]
            });
            t[135] = n.hookEvent;
            t[136] = i;
          } else {
            i = t[136];
          }
          return i;
        }
      case "hook_blocking_error":
        {
          if (n.hookEvent === "Stop" || n.hookEvent === "SubagentStop") {
            return null;
          }
          let i;
          if (t[137] !== n.blockingError.blockingError) {
            i = n.blockingError.blockingError.trim();
            t[137] = n.blockingError.blockingError;
            t[138] = i;
          } else {
            i = t[138];
          }
          let a = i;
          let l;
          if (t[139] !== n.hookName) {
            l = Rs.jsxs(Vw, {
              color: "error",
              children: [n.hookName, " hook returned blocking error"]
            });
            t[139] = n.hookName;
            t[140] = l;
          } else {
            l = t[140];
          }
          let c;
          if (t[141] !== a) {
            c = a ? Rs.jsx(Vw, {
              color: "error",
              children: a
            }) : null;
            t[141] = a;
            t[142] = c;
          } else {
            c = t[142];
          }
          let u;
          if (t[143] !== l || t[144] !== c) {
            u = Rs.jsxs(Rs.Fragment, {
              children: [l, c]
            });
            t[143] = l;
            t[144] = c;
            t[145] = u;
          } else {
            u = t[145];
          }
          return u;
        }
      case "hook_non_blocking_error":
        {
          if (n.hookEvent === "Stop" || n.hookEvent === "SubagentStop") {
            return null;
          }
          let i;
          if (t[146] !== n.stderr || t[147] !== n.stdout) {
            i = gvm(n.stderr, n.stdout);
            t[146] = n.stderr;
            t[147] = n.stdout;
            t[148] = i;
          } else {
            i = t[148];
          }
          let a = i;
          let l;
          if (t[149] !== n.hookName) {
            l = Rs.jsxs(Vw, {
              color: "error",
              children: [n.hookName, " hook error"]
            });
            t[149] = n.hookName;
            t[150] = l;
          } else {
            l = t[150];
          }
          let c;
          if (t[151] !== a) {
            c = a ? Rs.jsx(Vw, {
              color: "error",
              children: a
            }) : null;
            t[151] = a;
            t[152] = c;
          } else {
            c = t[152];
          }
          let u;
          if (t[153] !== l || t[154] !== c) {
            u = Rs.jsxs(Rs.Fragment, {
              children: [l, c]
            });
            t[153] = l;
            t[154] = c;
            t[155] = u;
          } else {
            u = t[155];
          }
          return u;
        }
      case "hook_cancelled":
        {
          if (n.hookEvent !== "UserPromptSubmit" || !n.timedOut) {
            return null;
          }
          let i;
          if (t[156] !== n.timeoutMs) {
            i = n.timeoutMs ? n.timeoutMs < 1000 ? `${n.timeoutMs}ms` : `${Math.round(n.timeoutMs / 1000)}s` : undefined;
            t[156] = n.timeoutMs;
            t[157] = i;
          } else {
            i = t[157];
          }
          let a = i;
          let l = a !== undefined ? ` after ${a}` : "";
          let c;
          if (t[158] !== n.hookName || t[159] !== l) {
            c = Rs.jsxs(Vw, {
              color: "error",
              dimColor: false,
              children: [n.hookName, " hook timed out", l, ` \u2014 output discarded. Raise the hook's "timeout" to allow more time.`]
            });
            t[158] = n.hookName;
            t[159] = l;
            t[160] = c;
          } else {
            c = t[160];
          }
          return c;
        }
      case "hook_error_during_execution":
        {
          if (n.hookEvent === "Stop" || n.hookEvent === "SubagentStop") {
            return null;
          }
          let i;
          if (t[161] !== n.hookName) {
            i = Rs.jsxs(Vw, {
              children: [n.hookName, " hook warning"]
            });
            t[161] = n.hookName;
            t[162] = i;
          } else {
            i = t[162];
          }
          return i;
        }
      case "hook_success":
        return null;
      case "hook_stopped_continuation":
        {
          if (n.hookEvent === "Stop" || n.hookEvent === "SubagentStop") {
            return null;
          }
          let i;
          if (t[163] !== n.hookName || t[164] !== n.message) {
            i = Rs.jsxs(Vw, {
              color: "warning",
              children: [n.hookName, " hook stopped continuation: ", n.message]
            });
            t[163] = n.hookName;
            t[164] = n.message;
            t[165] = i;
          } else {
            i = t[165];
          }
          return i;
        }
      case "hook_deferred_tool":
        {
          let i;
          if (t[166] !== n.hookName || t[167] !== n.toolName) {
            i = Rs.jsxs(Vw, {
              color: "warning",
              children: [n.hookName, " deferred ", n.toolName, " \xB7 resume with -p --resume to continue"]
            });
            t[166] = n.hookName;
            t[167] = n.toolName;
            t[168] = i;
          } else {
            i = t[168];
          }
          return i;
        }
      case "goal_status":
        {
          if (n.sentinel) {
            return null;
          }
          let i = n.failed === true;
          let a;
          if (t[169] !== n.durationMs || t[170] !== n.iterations || t[171] !== n.met || t[172] !== n.tokens || t[173] !== i) {
            if (a = [], n.met || i) {
              if (n.durationMs !== undefined) {
                let C;
                if (t[175] !== n.durationMs) {
                  C = formatDuration(n.durationMs, {
                    mostSignificantOnly: true
                  });
                  t[175] = n.durationMs;
                  t[176] = C;
                } else {
                  C = t[176];
                }
                a.push(C);
              }
              if (n.iterations !== undefined) {
                let C = n.iterations;
                let x;
                if (t[177] !== n.iterations) {
                  x = un(n.iterations, "turn");
                  t[177] = n.iterations;
                  t[178] = x;
                } else {
                  x = t[178];
                }
                a.push(`${C} ${x}`);
              }
              if (n.tokens !== undefined) {
                let C;
                if (t[179] !== n.tokens) {
                  C = formatTokens(n.tokens);
                  t[179] = n.tokens;
                  t[180] = C;
                } else {
                  C = t[180];
                }
                a.push(`${C} tokens`);
              }
            }
            t[169] = n.durationMs;
            t[170] = n.iterations;
            t[171] = n.met;
            t[172] = n.tokens;
            t[173] = i;
            t[174] = a;
          } else {
            a = t[174];
          }
          let l = a.length > 0 ? ` (${a.join(" \xB7 ")})` : "";
          let c = i ? "error" : n.met ? "success" : "pending";
          let u;
          if (t[181] !== c) {
            u = Rs.jsx(Ps, {
              status: c,
              withSpace: true
            });
            t[181] = c;
            t[182] = u;
          } else {
            u = t[182];
          }
          let d = i ? "error" : undefined;
          let p = !n.met && !i;
          let m = i ? "Goal could not be achieved" : n.met ? "Goal achieved" : "Goal not yet met\u2026 continuing";
          let f;
          if (t[183] !== d || t[184] !== p || t[185] !== m) {
            f = Rs.jsx(Text, {
              color: d,
              dimColor: p,
              children: m
            });
            t[183] = d;
            t[184] = p;
            t[185] = m;
            t[186] = f;
          } else {
            f = t[186];
          }
          let h;
          if (t[187] !== l) {
            h = l ? Rs.jsx(Text, {
              dimColor: true,
              children: l
            }) : null;
            t[187] = l;
            t[188] = h;
          } else {
            h = t[188];
          }
          let g;
          if (t[189] !== o) {
            g = !o ? Rs.jsxs(Text, {
              children: [" ", Rs.jsx(wv, {})]
            }) : null;
            t[189] = o;
            t[190] = g;
          } else {
            g = t[190];
          }
          let y;
          if (t[191] !== u || t[192] !== f || t[193] !== h || t[194] !== g) {
            y = Rs.jsxs(Text, {
              children: [u, f, h, g]
            });
            t[191] = u;
            t[192] = f;
            t[193] = h;
            t[194] = g;
            t[195] = y;
          } else {
            y = t[195];
          }
          let _;
          if (t[196] !== n.reason || t[197] !== i) {
            _ = i && n.reason ? Rs.jsx(gXd, {
              paddingLeft: 2,
              children: Rs.jsx(Text, {
                dimColor: true,
                wrap: "wrap",
                children: n.reason
              })
            }) : null;
            t[196] = n.reason;
            t[197] = i;
            t[198] = _;
          } else {
            _ = t[198];
          }
          let b;
          if (t[199] !== n.condition || t[200] !== o) {
            b = o ? Rs.jsx(gXd, {
              paddingLeft: 2,
              children: Rs.jsxs(Text, {
                dimColor: true,
                wrap: "wrap",
                children: ["Goal: ", n.condition]
              })
            }) : null;
            t[199] = n.condition;
            t[200] = o;
            t[201] = b;
          } else {
            b = t[201];
          }
          let S;
          if (t[202] !== n.reason || t[203] !== i || t[204] !== o) {
            S = o && !i && n.reason ? Rs.jsx(gXd, {
              paddingLeft: 2,
              children: Rs.jsxs(Text, {
                dimColor: true,
                wrap: "wrap",
                children: ["Reason: ", n.reason]
              })
            }) : null;
            t[202] = n.reason;
            t[203] = i;
            t[204] = o;
            t[205] = S;
          } else {
            S = t[205];
          }
          let E;
          if (t[206] !== _ || t[207] !== b || t[208] !== S || t[209] !== y) {
            E = Rs.jsxs(gXd, {
              flexDirection: "column",
              marginTop: 1,
              children: [y, _, b, S]
            });
            t[206] = _;
            t[207] = b;
            t[208] = S;
            t[209] = y;
            t[210] = E;
          } else {
            E = t[210];
          }
          return E;
        }
      case "hook_system_message":
        {
          let i;
          if (t[211] !== n.content || t[212] !== n.hookName) {
            i = Rs.jsxs(Vw, {
              children: [n.hookName, " says: ", n.content]
            });
            t[211] = n.content;
            t[212] = n.hookName;
            t[213] = i;
          } else {
            i = t[213];
          }
          return i;
        }
      case "hook_permission_decision":
        {
          let i = n.decision === "allow" ? "Allowed" : "Denied";
          let a;
          if (t[214] !== n.hookEvent) {
            a = Rs.jsx(Text, {
              bold: true,
              children: n.hookEvent
            });
            t[214] = n.hookEvent;
            t[215] = a;
          } else {
            a = t[215];
          }
          let l;
          if (t[216] !== i || t[217] !== a) {
            l = Rs.jsxs(Vw, {
              children: [i, " by ", a, " hook"]
            });
            t[216] = i;
            t[217] = a;
            t[218] = l;
          } else {
            l = t[218];
          }
          return l;
        }
      case "task_status":
        {
          let i;
          if (t[219] !== n) {
            i = Rs.jsx(fvm, {
              attachment: n
            });
            t[219] = n;
            t[220] = i;
          } else {
            i = t[220];
          }
          return i;
        }
      case "teammate_shutdown_batch":
        {
          let i;
          if (t[221] === Symbol.for("react.memo_cache_sentinel")) {
            i = Rs.jsxs(Text, {
              "aria-hidden": true,
              dimColor: true,
              children: [Tc, " "]
            });
            t[221] = i;
          } else {
            i = t[221];
          }
          let a = n.count;
          let l;
          if (t[222] !== n.count) {
            l = un(n.count, "teammate");
            t[222] = n.count;
            t[223] = l;
          } else {
            l = t[223];
          }
          let c;
          if (t[224] !== n.count || t[225] !== l) {
            c = Rs.jsxs(gXd, {
              flexDirection: "row",
              width: "100%",
              marginTop: 1,
              children: [i, Rs.jsxs(Text, {
                dimColor: true,
                children: [a, " ", l, " shut down gracefully"]
              })]
            });
            t[224] = n.count;
            t[225] = l;
            t[226] = c;
          } else {
            c = t[226];
          }
          return c;
        }
      default:
        return null;
    }
  }
  function lvm(e) {
    return e.name;
  }
  function cvm(e) {
    return Rs.jsx(GQn, {
      imageId: e
    }, e);
  }
  function uvm(e, t) {
    return e.kind === "panel" ? e.node : Rs.jsx(HMo, {
      displayName: e.displayName,
      count: e.count
    }, t);
  }
  function dvm(e, t) {
    return e.kind === "panel" ? e.node : Rs.jsx($Mo, {
      displayName: e.displayName,
      inkColor: e.inkColor,
      content: e.content,
      summary: e.summary
    }, t);
  }
  function pvm(e, t) {
    let n = null;
    try {
      n = qt(e.text);
    } catch {}
    let r = Gz(e.color);
    let o = e.summary ? Rs.jsxs(gXd, {
      children: [Rs.jsxs(Text, {
        color: r,
        children: ["@", e.from, Rs.jsx(Text, {
          "aria-hidden": true,
          children: vGd.pointer
        })]
      }), Rs.jsxs(Text, {
        children: [" ", e.summary]
      })]
    }) : null;
    let s = jQn(e.text);
    if (s) {
      return {
        kind: "panel",
        node: Rs.jsxs(QMo.Fragment, {
          children: [o, s]
        }, t)
      };
    }
    let i = parseFrameForDisplay(IdleNotificationMessageSchema(), e.text);
    if (i && !e.summary) {
      return {
        kind: "panel",
        node: Rs.jsx(jMo, {
          displayName: e.from,
          inkColor: r,
          idleReason: i.idleReason,
          failureReason: i.failureReason
        }, t)
      };
    }
    let a = WQn(e.text, e.from);
    if (a) {
      return {
        kind: "panel",
        node: Rs.jsxs(QMo.Fragment, {
          children: [o, a]
        }, t)
      };
    }
    let c = n?.type === "idle_notification" || n?.type === "teammate_terminated" || n?.type === "shutdown_approved" ? e.text : vSl(e.text) ?? e.text;
    return {
      kind: "text",
      displayName: e.from,
      inkColor: r,
      content: c,
      summary: e.summary
    };
  }
  function mvm(e) {
    if (e.summary) {
      return true;
    }
    return !(parseFrameForDisplay(ShutdownApprovedMessageSchema(), e.text) || parseFrameForDisplay(TeammateTerminatedMessageSchema(), e.text));
  }
  function fvm(e) {
    let t = JSt.c(4);
    let {
      attachment: n
    } = e;
    if (HQn() && n.status === "killed") {
      return null;
    }
    if (isAgentSwarmsEnabled() && n.taskType === "in_process_teammate") {
      let o;
      if (t[0] !== n) {
        o = Rs.jsx(hvm, {
          attachment: n
        });
        t[0] = n;
        t[1] = o;
      } else {
        o = t[1];
      }
      return o;
    }
    let r;
    if (t[2] !== n) {
      r = Rs.jsx(yTl, {
        attachment: n
      });
      t[2] = n;
      t[3] = r;
    } else {
      r = t[3];
    }
    return r;
  }
  function yTl(e) {
    let t = JSt.c(6);
    let {
      attachment: n
    } = e;
    let r = n.status === "completed" ? "completed in background" : n.status === "killed" ? "stopped" : n.status === "running" ? "still running in background" : n.status;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = Rs.jsxs(Text, {
        "aria-hidden": true,
        dimColor: true,
        children: [Tc, " "]
      });
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== n.description) {
      s = Rs.jsx(Text, {
        bold: true,
        children: n.description
      });
      t[1] = n.description;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== r || t[4] !== s) {
      i = Rs.jsxs(gXd, {
        flexDirection: "row",
        width: "100%",
        marginTop: 1,
        children: [o, Rs.jsxs(Text, {
          dimColor: true,
          children: ['Task "', s, '" ', r]
        })]
      });
      t[3] = r;
      t[4] = s;
      t[5] = i;
    } else {
      i = t[5];
    }
    return i;
  }
  function hvm(e) {
    let t = JSt.c(13);
    let {
      attachment: n
    } = e;
    let r;
    if (t[0] !== n.taskId) {
      r = d => d.tasks[n.taskId];
      t[0] = n.taskId;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = bt(r);
    if (o?.type !== "in_process_teammate") {
      let d;
      if (t[2] !== n) {
        d = Rs.jsx(yTl, {
          attachment: n
        });
        t[2] = n;
        t[3] = d;
      } else {
        d = t[3];
      }
      return d;
    }
    let s;
    if (t[4] !== o.identity.color) {
      s = Gz(o.identity.color);
      t[4] = o.identity.color;
      t[5] = s;
    } else {
      s = t[5];
    }
    let i = s;
    let a = n.status === "completed" ? "shut down gracefully" : n.status;
    let l;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      l = Rs.jsxs(Text, {
        "aria-hidden": true,
        dimColor: true,
        children: [Tc, " "]
      });
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] !== i || t[8] !== o.identity.agentName) {
      c = Rs.jsxs(Text, {
        color: i,
        bold: true,
        dimColor: false,
        children: ["@", o.identity.agentName]
      });
      t[7] = i;
      t[8] = o.identity.agentName;
      t[9] = c;
    } else {
      c = t[9];
    }
    let u;
    if (t[10] !== a || t[11] !== c) {
      u = Rs.jsxs(gXd, {
        flexDirection: "row",
        width: "100%",
        marginTop: 1,
        children: [l, Rs.jsxs(Text, {
          dimColor: true,
          children: ["Teammate", " ", c, " ", a]
        })]
      });
      t[10] = a;
      t[11] = c;
      t[12] = u;
    } else {
      u = t[12];
    }
    return u;
  }
  function gvm(e, t) {
    let n = e?.trim() ? e : t?.trim() ? t : "";
    if (!n) {
      return "";
    }
    let r = ii(n, `

Expected schema:`).trim();
    let o = 0;
    let s = r.indexOf(`
`);
    while (s !== -1) {
      let a = r.slice(o, s).trim();
      if (a) {
        return a.length > 200 ? a.slice(0, 200) + "\u2026" : a;
      }
      o = s + 1;
      s = r.indexOf(`
`, o);
    }
    let i = r.slice(o).trim();
    return i.length > 200 ? i.slice(0, 200) + "\u2026" : i;
  }
  function Vw(e) {
    let t = JSt.c(4);
    let {
      dimColor: n,
      children: r,
      color: o
    } = e;
    let s = n === undefined ? true : n;
    let i;
    if (t[0] !== r || t[1] !== o || t[2] !== s) {
      i = Rs.jsx(gXd, {
        children: Rs.jsx(Vn, {
          children: Rs.jsx(Text, {
            color: o,
            dimColor: s,
            wrap: "wrap",
            children: r
          })
        })
      });
      t[0] = r;
      t[1] = o;
      t[2] = s;
      t[3] = i;
    } else {
      i = t[3];
    }
    return i;
  }
  var JSt;
  var rZn;
  var QMo;
  var Rs;
  var _Tl = __lazy(() => {
    Zl();
    cs();
    ro();
    wl();
    _ue();
    et();
    ho();
    OMo();
    mE();
    wKe();
    Zn();
    uA();
    Xq();
    _Sl();
    Vf();
    XTe();
    Wl();
    LMo();
    qQn();
    FMo();
    zQn();
    nZn();
    JSt = __toESM(pt(), 1);
    rZn = require("path");
    QMo = __toESM(ot(), 1);
    Rs = __toESM(ie(), 1);
  });
  function bTl(e, t) {
    let n = useClock();
    let [r, o] = XSt.useState(e);
    let s = XSt.useRef(e !== undefined ? Date.now() : 0);
    XSt.useEffect(() => {
      if (e !== undefined) {
        s.current = Date.now();
        o(e);
        return;
      }
      let i = t - (Date.now() - s.current);
      if (i <= 0) {
        o(undefined);
        return;
      }
      return n.setTimeout(() => o(undefined), i);
    }, [e, t, n]);
    return r;
  }
  var XSt;
  var STl = __lazy(() => {
    et();
    XSt = __toESM(ot(), 1);
  });
  function TTl(e, t) {
    let n = useClock();
    let [r, o] = QSt.useState(e);
    let s = QSt.useRef(0);
    QSt.useEffect(() => {
      let i = Date.now() - s.current;
      if (i >= t) {
        s.current = Date.now();
        o(e);
        return;
      }
      return n.setTimeout(() => {
        s.current = Date.now();
        o(e);
      }, t - i);
    }, [e, t, n]);
    return r;
  }
  var QSt;
  var ETl = __lazy(() => {
    et();
    QSt = __toESM(ot(), 1);
  });
  function RTl(e) {
    return (e.match(/[aeiou]/gi) ?? []).length;
  }
  function oZn(e) {
    let t = e.toLowerCase();
    if (Object.hasOwn(eTt, t)) {
      return eTt[t];
    }
    if (/ie$/i.test(e)) {
      return e.slice(0, -2) + "ying";
    }
    if (/[^eoy]e$/i.test(e)) {
      return e.slice(0, -1) + "ing";
    }
    if (CTl.test(e) && RTl(e) === 1) {
      return e + e.slice(-1) + "ing";
    }
    if (/c$/i.test(e)) {
      return e + "king";
    }
    return e + "ing";
  }
  function sZn(e) {
    let t = e.toLowerCase();
    if (Object.hasOwn(ZSt, t)) {
      return ZSt[t];
    }
    if (/e$/i.test(e)) {
      return e + "d";
    }
    if (/[^aeiou]y$/i.test(e)) {
      return e.slice(0, -1) + "ied";
    }
    if (CTl.test(e) && RTl(e) === 1) {
      return e + e.slice(-1) + "ed";
    }
    if (/c$/i.test(e)) {
      return e + "ked";
    }
    if (Object.hasOwn(eTt, t)) {
      return eTt[t].slice(0, -3) + "ed";
    }
    return e + "ed";
  }
  function ZMo(e, t) {
    return /^[A-Z]/.test(e) ? t.charAt(0).toUpperCase() + t.slice(1) : t;
  }
  function vTl(e) {
    if (e.length < 2 || e.length > 16) {
      return false;
    }
    if (!/^[A-Za-z]+$/.test(e)) {
      return false;
    }
    if (e === e.toUpperCase()) {
      return false;
    }
    let t = e.toLowerCase();
    if (eNo.vZc(t)) {
      return false;
    }
    if (Object.hasOwn(ZSt, t)) {
      return true;
    }
    if (/ing$/i.test(e) && e.length > 4) {
      return false;
    }
    if (/ed$/i.test(e) && !/eed$/i.test(e) && e.length > 3) {
      return false;
    }
    if (/s$/i.test(e) && !/(ss|us)$/i.test(e) && e.length > 3) {
      return false;
    }
    return yvm.test(e) || /y/i.test(e);
  }
  function iZn(e, t) {
    return e.replace(bvm, (n, r, o, s) => _vm.vZc(o) && !Svm.test(e.slice(s + n.length)) ? r + t(o) : n);
  }
  function xTl(e) {
    let t = e.trimStart();
    let n = e.slice(0, e.length - t.length);
    let r = /^(\S+)([\s\S]*)$/.exec(t);
    if (!r) {
      return;
    }
    let o = r[1];
    let s = r[2] ?? "";
    let i = Tvm.exec(o);
    if (i && i[2] !== undefined && vTl(i[2])) {
      let a = i[1];
      let l = i[2];
      let c = (a + l).toLowerCase();
      let u = l.toLowerCase();
      if (eNo.vZc(c) || eNo.vZc(u)) {
        return;
      }
      let d = (p, m) => a + "-" + ZMo(l, Object.hasOwn(p, c) ? p[c].slice(a.length) : m(l));
      return {
        running: n + d(eTt, oZn) + iZn(s, oZn),
        done: n + d(ZSt, sZn) + iZn(s, sZn),
        infinitive: n + o.toLowerCase() + s
      };
    }
    if (!vTl(o)) {
      return;
    }
    return {
      running: n + ZMo(o, oZn(o)) + iZn(s, oZn),
      done: n + ZMo(o, sZn(o)) + iZn(s, sZn),
      infinitive: n + o.charAt(0).toLowerCase() + o.slice(1) + s
    };
  }
  var yvm;
  var CTl;
  var ZSt;
  var eTt;
  var eNo;
  var wTl;
  var _vm;
  var bvm;
  var Svm;
  var Tvm;
  var kTl = __lazy(() => {
    yvm = /[aeiou]/i;
    CTl = /[^aeiou][aeiou][bcdfghjklmnpqrstvz]$/i;
    ZSt = {
      begin: "began",
      bind: "bound",
      bring: "brought",
      build: "built",
      buy: "bought",
      catch: "caught",
      choose: "chose",
      come: "came",
      cut: "cut",
      debug: "debugged",
      dig: "dug",
      do: "did",
      draw: "drew",
      feed: "fed",
      feel: "felt",
      fight: "fought",
      find: "found",
      fly: "flew",
      forget: "forgot",
      freeze: "froze",
      get: "got",
      give: "gave",
      go: "went",
      have: "had",
      hide: "hid",
      hit: "hit",
      hold: "held",
      input: "input",
      keep: "kept",
      know: "knew",
      lead: "led",
      leave: "left",
      let: "let",
      lose: "lost",
      make: "made",
      mean: "meant",
      meet: "met",
      override: "overrode",
      overwrite: "overwrote",
      pay: "paid",
      put: "put",
      quit: "quit",
      read: "read",
      rebuild: "rebuilt",
      redo: "redid",
      rerun: "reran",
      reset: "reset",
      rewrite: "rewrote",
      run: "ran",
      see: "saw",
      seek: "sought",
      send: "sent",
      set: "set",
      show: "showed",
      shut: "shut",
      sit: "sat",
      sleep: "slept",
      spend: "spent",
      spin: "spun",
      split: "split",
      spread: "spread",
      stand: "stood",
      sweep: "swept",
      sync: "synced",
      take: "took",
      teach: "taught",
      tear: "tore",
      tell: "told",
      think: "thought",
      throw: "threw",
      understand: "understood",
      undo: "undid",
      unset: "unset",
      win: "won",
      unwrap: "unwrapped",
      unzip: "unzipped",
      write: "wrote"
    };
    eTt = {
      begin: "beginning",
      commit: "committing",
      control: "controlling",
      debug: "debugging",
      emit: "emitting",
      equip: "equipping",
      forget: "forgetting",
      format: "formatting",
      input: "inputting",
      occur: "occurring",
      omit: "omitting",
      output: "outputting",
      permit: "permitting",
      prefer: "preferring",
      quit: "quitting",
      refer: "referring",
      rerun: "rerunning",
      reset: "resetting",
      screenshot: "screenshotting",
      snapshot: "snapshotting",
      submit: "submitting",
      sync: "syncing",
      transfer: "transferring",
      unset: "unsetting",
      unwrap: "unwrapping",
      unzip: "unzipping"
    };
    eNo = new Set([...Object.entries(ZSt).filter(([e, t]) => e !== t).map(([, e]) => e), "been", "broken", "chosen", "done", "drawn", "driven", "eaten", "fallen", "forgotten", "given", "gone", "grown", "hidden", "known", "ridden", "risen", "seen", "shown", "spoken", "taken", "thrown", "torn", "worn", "written"]);
    wTl = new Set(["output", "input", "lead", "feed", "spread", "set", "cut", "split", "hit", "let", "put", "quit", "shut", "read", "go", "make", "dig", "tear", "win", "fly", "spin", "control", "permit", "have", "hold", "keep", "mean", "feel", "do", "see", "know", "think", "understand"]);
    _vm = new Set([...Object.keys(ZSt).filter(e => !wTl.vZc(e)), ...Object.keys(eTt).filter(e => !wTl.vZc(e)), "add", "analyze", "append", "apply", "archive", "assert", "attempt", "autofix", "await", "benchmark", "bisect", "call", "capture", "check", "clone", "collect", "compare", "compile", "compute", "confirm", "connect", "convert", "copy", "count", "create", "curl", "decode", "delete", "deploy", "detect", "discard", "dismiss", "display", "download", "dump", "edit", "emit", "enable", "encode", "ensure", "enumerate", "evaluate", "execute", "expand", "expect", "export", "extract", "fetch", "fill", "filter", "fix", "flush", "focus", "follow", "generate", "grep", "identify", "ignore", "import", "include", "inject", "insert", "inspect", "install", "invoke", "kill", "launch", "lint", "list", "load", "locate", "loop", "measure", "merge", "monitor", "move", "navigate", "normalize", "parse", "patch", "pick", "ping", "pipe", "poll", "post", "prepare", "preview", "print", "probe", "profile", "prune", "publish", "pull", "push", "queue", "rebase", "recheck", "record", "recover", "redirect", "reduce", "refresh", "regenerate", "reinstall", "relaunch", "reload", "remove", "rename", "render", "reopen", "repeat", "replay", "reply", "report", "request", "resolve", "restart", "restore", "retry", "revert", "save", "scan", "screenshot", "scroll", "search", "select", "serialize", "serve", "settle", "skip", "snapshot", "sort", "spawn", "squash", "stage", "start", "stash", "stop", "strip", "summarize", "switch", "sync", "tail", "tally", "test", "toggle", "touch", "trace", "track", "trigger", "trim", "truncate", "try", "typecheck", "unblock", "uninstall", "unlink", "unmount", "unpack", "update", "upgrade", "upload", "validate", "verify", "visit", "wait", "walk", "warn", "wipe"]);
    bvm = /(?<![\w-])((?:(?:[Aa]nd|[Tt]hen)\s+)+)([a-z]{2,16})(?=$|[\s,;!?]|\.(?:\s|$))/g;
    Svm = /^(?:\s+\w+){0,2}\s+(?:is|are|was|were|has|have|do|does|did|will|would|should|can|could|passes|passed|fails|failed|exists|works|worked|succeeds|succeeded|stays|remains|looks|runs|ran|not|if|when|unless|whether)(?:n['\u2019]t)?\b/;
    Tvm = /^(re|un|de|pre|co|sub|over|out|mis|auto|post)-(.+)$/i;
  });
  function ITl(e, t) {
    if (!e || !t) {
      return null;
    }
    let n = e.kind === "cr" && false;
    return {
      prefix: "PR",
      label: `#${e.number}`,
      url: t,
      dedupUrl: e.url,
      color: wvm(e.reviewState)
    };
  }
  function wvm(e) {
    switch (e) {
      case "approved":
        return "success";
      case "changes_requested":
        return "error";
      case "pending":
        return "warning";
      case "merged":
        return "merged";
      default:
        return;
    }
  }
  function nNo(e, t, n) {
    return;
  }
  function PTl(e, t, n) {
    ATl.useEffect(() => {
      if (t === undefined) {
        return;
      }
      nNo(e, t, n === "cr");
    }, [e, t, n]);
  }
  var ATl;
  var rNo = __lazy(() => {
    uG();
    ln();
    je();
    pr();
    ATl = __toESM(ot(), 1);
  });
  function xKe(e) {
    let t = OTl.c(37);
    let {
      number: n,
      url: r,
      reviewState: o,
      bold: s,
      color: i,
      dimColor: a,
      inverse: l,
      underline: c,
      hidePrefix: u,
      kind: d
    } = e;
    let p = c === undefined ? true : c;
    let m = d === "cr" && false;
    let f = bt(Rvm);
    let h;
    if (t[0] !== m || t[1] !== f || t[2] !== r) {
      h = m ? r : RWt(r, f);
      t[0] = m;
      t[1] = f;
      t[2] = r;
      t[3] = h;
    } else {
      h = t[3];
    }
    let g = h;
    let y;
    let _;
    if (t[4] !== m || t[5] !== r || t[6] !== g) {
      y = () => {
        nNo(g, r, m);
      };
      _ = [g, r, m];
      t[4] = m;
      t[5] = r;
      t[6] = g;
      t[7] = y;
      t[8] = _;
    } else {
      y = t[7];
      _ = t[8];
    }
    DTl.useEffect(y, _);
    let b;
    if (t[9] !== i || t[10] !== o) {
      b = i ?? xvm(o);
      t[9] = i;
      t[10] = o;
      t[11] = b;
    } else {
      b = t[11];
    }
    let S = b;
    let E = !l && (a || !S && !s);
    let C;
    if (t[12] !== s || t[13] !== E || t[14] !== l || t[15] !== n || t[16] !== S) {
      C = Vme.jsxs(Text, {
        color: S,
        dimColor: E,
        bold: s,
        inverse: l,
        children: ["#", n]
      });
      t[12] = s;
      t[13] = E;
      t[14] = l;
      t[15] = n;
      t[16] = S;
      t[17] = C;
    } else {
      C = t[17];
    }
    let x = C;
    let A;
    if (t[18] !== s || t[19] !== a || t[20] !== u || t[21] !== m) {
      A = !u && Vme.jsxs(Vme.Fragment, {
        children: [Vme.jsx(Text, {
          dimColor: a || !s,
          children: "PR"
        }), " "]
      });
      t[18] = s;
      t[19] = a;
      t[20] = u;
      t[21] = m;
      t[22] = A;
    } else {
      A = t[22];
    }
    let k = !l && p;
    let I;
    if (t[23] !== s || t[24] !== E || t[25] !== l || t[26] !== n || t[27] !== S || t[28] !== k) {
      I = Vme.jsxs(Text, {
        color: S,
        dimColor: E,
        underline: k,
        bold: s,
        inverse: l,
        children: ["#", n]
      });
      t[23] = s;
      t[24] = E;
      t[25] = l;
      t[26] = n;
      t[27] = S;
      t[28] = k;
      t[29] = I;
    } else {
      I = t[29];
    }
    let O;
    if (t[30] !== x || t[31] !== I || t[32] !== g) {
      O = Vme.jsx(Link, {
        url: g,
        fallback: x,
        assumeSupport: false,
        children: I
      });
      t[30] = x;
      t[31] = I;
      t[32] = g;
      t[33] = O;
    } else {
      O = t[33];
    }
    let M;
    if (t[34] !== O || t[35] !== A) {
      M = Vme.jsxs(Text, {
        children: [A, O]
      });
      t[34] = O;
      t[35] = A;
      t[36] = M;
    } else {
      M = t[36];
    }
    return M;
  }
  function Rvm(e) {
    return e.settings?.prUrlTemplate;
  }
  function xvm(e) {
    switch (e) {
      case "approved":
        return "success";
      case "changes_requested":
        return "error";
      case "pending":
        return "warning";
      case "merged":
        return "merged";
      default:
        return;
    }
  }
  var OTl;
  var DTl;
  var Vme;
  var aZn = __lazy(() => {
    rNo();
    et();
    ho();
    omt();
    OTl = __toESM(pt(), 1);
    DTl = __toESM(ot(), 1);
    Vme = __toESM(ie(), 1);
  });
  function NTl(e) {
    return (e.teamMemorySearchCount ?? 0) > 0 || (e.teamMemoryReadCount ?? 0) > 0 || (e.teamMemoryWriteCount ?? 0) > 0;
  }
  function LTl(e) {
    let t = MTl.c(23);
    let {
      message: n,
      isActiveGroup: r,
      hasPrecedingParts: o
    } = e;
    let s = n.teamMemoryReadCount ?? 0;
    let i = n.teamMemorySearchCount ?? 0;
    let a = n.teamMemoryWriteCount ?? 0;
    if (s === 0 && i === 0 && a === 0) {
      return null;
    }
    let l;
    if (t[0] !== o || t[1] !== r || t[2] !== s || t[3] !== i || t[4] !== a) {
      let c = [];
      let u = o ? 1 : 0;
      if (s > 0) {
        let d = r ? u === 0 ? "Recalling" : "recalling" : u === 0 ? "Recalled" : "recalled";
        if (u > 0) {
          let h;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            h = zz.jsx(Text, {
              children: ", "
            }, "comma-tmr");
            t[6] = h;
          } else {
            h = t[6];
          }
          c.push(h);
        }
        let p;
        if (t[7] !== s) {
          p = zz.jsx(Text, {
            bold: true,
            children: s
          });
          t[7] = s;
          t[8] = p;
        } else {
          p = t[8];
        }
        let m = s === 1 ? "memory" : "memories";
        let f;
        if (t[9] !== p || t[10] !== m || t[11] !== d) {
          f = zz.jsxs(Text, {
            children: [d, " ", p, " team", " ", m]
          }, "team-mem-read");
          t[9] = p;
          t[10] = m;
          t[11] = d;
          t[12] = f;
        } else {
          f = t[12];
        }
        c.push(f);
        u++;
      }
      if (i > 0) {
        let d = r ? u === 0 ? "Searching" : "searching" : u === 0 ? "Searched" : "searched";
        if (u > 0) {
          let f;
          if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
            f = zz.jsx(Text, {
              children: ", "
            }, "comma-tms");
            t[13] = f;
          } else {
            f = t[13];
          }
          c.push(f);
        }
        let p = `${d} team memories`;
        let m;
        if (t[14] !== p) {
          m = zz.jsx(Text, {
            children: p
          }, "team-mem-search");
          t[14] = p;
          t[15] = m;
        } else {
          m = t[15];
        }
        c.push(m);
        u++;
      }
      if (a > 0) {
        let d = r ? u === 0 ? "Writing" : "writing" : u === 0 ? "Wrote" : "wrote";
        if (u > 0) {
          let h;
          if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
            h = zz.jsx(Text, {
              children: ", "
            }, "comma-tmw");
            t[16] = h;
          } else {
            h = t[16];
          }
          c.push(h);
        }
        let p;
        if (t[17] !== a) {
          p = zz.jsx(Text, {
            bold: true,
            children: a
          });
          t[17] = a;
          t[18] = p;
        } else {
          p = t[18];
        }
        let m = a === 1 ? "memory" : "memories";
        let f;
        if (t[19] !== p || t[20] !== m || t[21] !== d) {
          f = zz.jsxs(Text, {
            children: [d, " ", p, " team", " ", m]
          }, "team-mem-write");
          t[19] = p;
          t[20] = m;
          t[21] = d;
          t[22] = f;
        } else {
          f = t[22];
        }
        c.push(f);
      }
      l = zz.jsx(zz.Fragment, {
        children: c
      });
      t[0] = o;
      t[1] = r;
      t[2] = s;
      t[3] = i;
      t[4] = a;
      t[5] = l;
    } else {
      l = t[5];
    }
    return l;
  }
  var MTl;
  var zz;
  var FTl = __lazy(() => {
    et();
    MTl = __toESM(pt(), 1);
    zz = __toESM(ie(), 1);
  });
  function BTl() {
    let e = UTl.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = oNo.jsx(Vn, {
        height: 1,
        children: oNo.jsx(Text, {
          dimColor: true,
          children: "Tool use rejected"
        })
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var UTl;
  var oNo;
  var $Tl = __lazy(() => {
    et();
    Wl();
    UTl = __toESM(pt(), 1);
    oNo = __toESM(ie(), 1);
  });
  function lZn(e) {
    let t = HTl.c(19);
    let {
      progressMessagesForMessage: n,
      tool: r,
      tools: o,
      param: s,
      verbose: i,
      isTranscriptMode: a
    } = e;
    if (typeof s.content === "string" && s.content.includes("[Request interrupted by user for tool use]")) {
      let c;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        c = uZ.jsx(Vn, {
          height: 1,
          children: uZ.jsx(Hme, {})
        });
        t[0] = c;
      } else {
        c = t[0];
      }
      return c;
    }
    if (typeof s.content === "string" && s.content.startsWith(sNo)) {
      let c;
      if (t[1] !== s.content) {
        c = s.content.substring(sNo.length);
        t[1] = s.content;
        t[2] = c;
      } else {
        c = t[2];
      }
      let u = c;
      let d;
      if (t[3] !== u) {
        d = uZ.jsx(FXn, {
          plan: u
        });
        t[3] = u;
        t[4] = d;
      } else {
        d = t[4];
      }
      return d;
    }
    if (typeof s.content === "string" && s.content.startsWith(tTt)) {
      let c;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        c = uZ.jsx(BTl, {});
        t[5] = c;
      } else {
        c = t[5];
      }
      return c;
    }
    if (typeof s.content === "string" && cZn(s.content)) {
      let c;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        c = uZ.jsx(Link, {
          url: "https://code.claude.com/docs/s/claude-code-auto-mode"
        });
        t[6] = c;
      } else {
        c = t[6];
      }
      let u = c;
      {
        let p;
        if (t[7] !== s.content) {
          p = jTl(s.content);
          t[7] = s.content;
          t[8] = p;
        } else {
          p = t[8];
        }
        let m = p;
        if (m) {
          let f;
          if (t[9] !== m) {
            f = uZ.jsx(Vn, {
              children: uZ.jsxs(Text, {
                dimColor: true,
                children: ["Denied by auto mode classifier ", "\u2219", " ", m, " ", "\u2219", " see ", u]
              })
            });
            t[9] = m;
            t[10] = f;
          } else {
            f = t[10];
          }
          return f;
        }
      }
      let d;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        d = uZ.jsx(Vn, {
          children: uZ.jsxs(Text, {
            dimColor: true,
            children: ["Denied by auto mode classifier ", "\u2219", " see ", u]
          })
        });
        t[11] = d;
      } else {
        d = t[11];
      }
      return d;
    }
    let l;
    if (t[12] !== a || t[13] !== s.content || t[14] !== n || t[15] !== r || t[16] !== o || t[17] !== i) {
      l = r?.renderToolUseErrorMessage?.(s.content, {
        progressMessagesForMessage: VIe(n),
        tools: o,
        verbose: i,
        isTranscriptMode: a
      }) ?? uZ.jsx(Rw, {
        result: s.content,
        verbose: i
      });
      t[12] = a;
      t[13] = s.content;
      t[14] = n;
      t[15] = r;
      t[16] = o;
      t[17] = i;
      t[18] = l;
    } else {
      l = t[18];
    }
    return l;
  }
  var HTl;
  var uZ;
  var iNo = __lazy(() => {
    wl();
    et();
    ci();
    ro();
    KG();
    ISt();
    Wl();
    tDo();
    $Tl();
    HTl = __toESM(pt(), 1);
    uZ = __toESM(ie(), 1);
  });
  function Mvm(e) {
    let t = uZn.c(49);
    let {
      content: n,
      tools: r,
      lookups: o,
      inProgressToolUseIDs: s,
      shouldAnimate: i,
      theme: a
    } = e;
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    if (t[0] !== n.id || t[1] !== n.input || t[2] !== n.name || t[3] !== s || t[4] !== o || t[5] !== i || t[6] !== a || t[7] !== r) {
      y = Symbol.for("react.early_return_sentinel");
      e: {
        if (_ = Cl(r, n.name) ?? Cl(BEe(), n.name), !_ || _.isTransparentWrapper?.()) {
          y = null;
          break e;
        }
        let E;
        if (t[19] !== n.id || t[20] !== o.resolvedToolUseIDs) {
          E = o.resolvedToolUseIDs.vZc(n.id);
          t[19] = n.id;
          t[20] = o.resolvedToolUseIDs;
          t[21] = E;
        } else {
          E = t[21];
        }
        u = E;
        let C;
        if (t[22] !== n.id || t[23] !== o.erroredToolUseIDs) {
          C = o.erroredToolUseIDs.vZc(n.id);
          t[22] = n.id;
          t[23] = o.erroredToolUseIDs;
          t[24] = C;
        } else {
          C = t[24];
        }
        c = C;
        let x;
        if (t[25] !== n.id || t[26] !== s) {
          x = s.vZc(n.id);
          t[25] = n.id;
          t[26] = s;
          t[27] = x;
        } else {
          x = t[27];
        }
        let A = x;
        d = o.toolResultByToolUseID.get(n.id);
        let k = d?.type === "user" ? d.toolUseResult : undefined;
        let I = _.outputSchema?.safeParse(k);
        let O = I?.success ? I.data : undefined;
        let M = _.inputSchema.safeParse(n.input);
        let L = M.success ? M.data : undefined;
        let P = _.userFacingName(L);
        let F;
        if (t[28] !== n.input) {
          F = yle(n.input);
          t[28] = n.input;
          t[29] = F;
        } else {
          F = t[29];
        }
        let H = F;
        let U = H !== null ? H : L ? _.renderToolUseMessage(L, {
          theme: a,
          verbose: true
        }) : null;
        l = gXd;
        p = n.id;
        m = "column";
        f = 1;
        let N = i && A;
        let W = !u;
        let j;
        if (t[30] !== c || t[31] !== N || t[32] !== W) {
          j = $s.jsx(Ose, {
            shouldAnimate: N,
            isUnresolved: W,
            isError: c
          });
          t[30] = c;
          t[31] = N;
          t[32] = W;
          t[33] = j;
        } else {
          j = t[33];
        }
        h = $s.jsxs(gXd, {
          flexDirection: "row",
          children: [j, $s.jsxs(Text, {
            children: [$s.jsx(Text, {
              bold: true,
              children: P
            }), U && $s.jsxs(Text, {
              children: ["(", U, ")"]
            })]
          }), L && _.renderToolUseTag?.(L, {
            toolUseId: n.id,
            toolUseResult: k,
            progressMessages: o.progressMessagesByToolUseID.get(n.id)
          })]
        });
        g = u && !c && O !== undefined && $s.jsx(gXd, {
          children: _.renderToolResultMessage?.(O, [], {
            verbose: true,
            tools: r,
            theme: a
          })
        });
      }
      t[0] = n.id;
      t[1] = n.input;
      t[2] = n.name;
      t[3] = s;
      t[4] = o;
      t[5] = i;
      t[6] = a;
      t[7] = r;
      t[8] = l;
      t[9] = c;
      t[10] = u;
      t[11] = d;
      t[12] = p;
      t[13] = m;
      t[14] = f;
      t[15] = h;
      t[16] = g;
      t[17] = y;
      t[18] = _;
    } else {
      l = t[8];
      c = t[9];
      u = t[10];
      d = t[11];
      p = t[12];
      m = t[13];
      f = t[14];
      h = t[15];
      g = t[16];
      y = t[17];
      _ = t[18];
    }
    if (y !== Symbol.for("react.early_return_sentinel")) {
      return y;
    }
    let b;
    if (t[34] !== n.id || t[35] !== c || t[36] !== u || t[37] !== d || t[38] !== _ || t[39] !== r) {
      b = u && c && $s.jsx(Nvm, {
        toolUseID: n.id,
        resultMsg: d,
        tool: _,
        tools: r
      });
      t[34] = n.id;
      t[35] = c;
      t[36] = u;
      t[37] = d;
      t[38] = _;
      t[39] = r;
      t[40] = b;
    } else {
      b = t[40];
    }
    let S;
    if (t[41] !== l || t[42] !== p || t[43] !== m || t[44] !== f || t[45] !== h || t[46] !== g || t[47] !== b) {
      S = $s.jsxs(l, {
        flexDirection: m,
        marginTop: f,
        children: [h, g, b]
      }, p);
      t[41] = l;
      t[42] = p;
      t[43] = m;
      t[44] = f;
      t[45] = h;
      t[46] = g;
      t[47] = b;
      t[48] = S;
    } else {
      S = t[48];
    }
    return S;
  }
  function Nvm(e) {
    let t = uZn.c(11);
    let {
      toolUseID: n,
      resultMsg: r,
      tool: o,
      tools: s
    } = e;
    if (r?.type !== "user") {
      return null;
    }
    let i;
    let a;
    if (t[0] !== r.message.content || t[1] !== n) {
      let u;
      if (t[4] !== n) {
        u = d => d.type === "tool_result" && d.tool_use_id === n;
        t[4] = n;
        t[5] = u;
      } else {
        u = t[5];
      }
      i = r.message.content.find(u);
      a = i?.type !== "tool_result" || typeof i.content !== "string" || !cZn(i.content);
      t[0] = r.message.content;
      t[1] = n;
      t[2] = i;
      t[3] = a;
    } else {
      i = t[2];
      a = t[3];
    }
    if (a) {
      return null;
    }
    let l;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      l = [];
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] !== i || t[8] !== o || t[9] !== s) {
      c = $s.jsx(lZn, {
        param: i,
        tool: o,
        tools: s,
        verbose: true,
        progressMessagesForMessage: l,
        isTranscriptMode: true
      });
      t[7] = i;
      t[8] = o;
      t[9] = s;
      t[10] = c;
    } else {
      c = t[10];
    }
    return c;
  }
  function GTl({
    message: e,
    inProgressToolUseIDs: t,
    shouldAnimate: n,
    verbose: r,
    tools: o,
    lookups: s,
    isActiveGroup: i,
    addMargin: a = true
  }) {
    let {
      searchCount: l,
      readCount: c,
      listCount: u,
      replCount: d,
      memorySearchCount: p,
      memoryReadCount: m,
      memoryWriteCount: f,
      messages: h
    } = e;
    let [g] = useTheme();
    let {
      columns: y
    } = Sr();
    let _ = fgt(e);
    let b = _.some(ce => s.erroredToolUseIDs.vZc(ce));
    let S = p > 0 || m > 0 || f > 0;
    let E = NTl(e);
    let C = nTt.useRef(0);
    let x = nTt.useRef(0);
    let A = nTt.useRef(0);
    let k = nTt.useRef(0);
    let I = nTt.useRef(0);
    C.current = Math.max(C.current, c);
    x.current = Math.max(x.current, l);
    A.current = Math.max(A.current, u);
    k.current = Math.max(k.current, e.mcpCallCount ?? 0);
    I.current = Math.max(I.current, e.bashCount ?? 0);
    let O = e.foldedCount ?? 0;
    let M = e.otherToolCount ?? 0;
    let L = e.agentCount ?? 0;
    let P = e.editFileCount ?? 0;
    let F = e.frameCount ?? 0;
    let H = e.linesAdded ?? 0;
    let U = e.linesRemoved ?? 0;
    let N = C.current;
    let W = x.current;
    let j = A.current;
    let z = k.current;
    let V = e.gitOpBashCount ?? 0;
    let K = qs() ? Math.max(0, I.current - V) : 0;
    let J = e.thoughtForMs ?? 0;
    let Q = J > 0 || e.latestThinkingSummary !== undefined;
    let Z = W > 0 || N > 0 || j > 0 || d > 0 || z > 0 || K > 0 || V > 0 || M > 0 || L > 0 || P > 0 || F > 0 || Q;
    let ne = e.readFilePaths;
    let oe = e.searchArgs;
    let ee = e.latestDisplayHint;
    if (ee === undefined) {
      let ce = oe?.at(-1);
      let le = ce !== undefined ? `"${ce}"` : undefined;
      let pe = ne?.at(-1);
      ee = pe !== undefined ? Pd(pe) : le;
    }
    if (i) {
      for (let ce of _) {
        if (!t.vZc(ce)) {
          continue;
        }
        let le = s.progressMessagesByToolUseID.get(ce)?.at(-1)?.data;
        if (le?.type === "repl_tool_call" && (le.phase === "start" || le.phase === "executing")) {
          let pe = le.toolInput;
          ee = pe.file_path ?? (pe.pattern ? `"${pe.pattern}"` : undefined) ?? pe.command ?? le.toolName;
        } else if (le?.type === "mcp_progress") {
          let {
            progress: pe,
            total: ve,
            progressMessage: _e
          } = le;
          let xe = _e?.replace(/\s+/g, " ").trim() || undefined;
          let ke = xe && xe.length > 200 ? xe.slice(0, 199) + "\u2026" : xe;
          if (pe !== undefined && ve !== undefined && ve > 0) {
            let Ie = Math.round(Math.min(1, Math.max(0, pe / ve)) * 100);
            ee = ke ? `${ke} (${Ie}%)` : `${Ie}%`;
          } else if (ke) {
            ee = ke;
          } else if (pe !== undefined) {
            ee = `Processing\u2026 ${pe}`;
          }
        }
      }
    }
    let re = TTl(ee, 700);
    let se = bTl(i ? e.latestThinkingSummary : undefined, 3000);
    let ae = i && se !== undefined;
    let de = ae ? se : re;
    if (r) {
      let ce = [];
      for (let le of h) {
        if (le.type === "assistant") {
          ce.push(le);
        } else if (le.type === "grouped_tool_use") {
          ce.push(...le.messages);
        }
      }
      return $s.jsxs(gXd, {
        flexDirection: "column",
        children: [h.map(le => {
          let pe = le.type === "user" ? le.message.content[0] : null;
          if (pe?.type !== "text" || !pe.text.includes(`<${"task-notification"}`)) {
            return null;
          }
          return $s.jsx(gXd, {
            marginTop: 1,
            children: $s.jsx(KQn, {
              addMargin: false,
              param: {
                type: "text",
                text: pe.text
              }
            })
          }, le.uuid);
        }), ce.map(le => {
          let pe = le.message.content[0];
          if (pe?.type === "thinking" && pe.thinking) {
            return $s.jsx(gXd, {
              marginTop: 1,
              children: $s.jsx(NQn, {
                param: pe,
                addMargin: false,
                isTranscriptMode: true,
                verbose: true
              })
            }, le.uuid);
          }
          if (pe?.type !== "tool_use") {
            return null;
          }
          return $s.jsx(Mvm, {
            content: pe,
            tools: o,
            lookups: s,
            inProgressToolUseIDs: t,
            shouldAnimate: n,
            theme: g
          }, pe.id);
        }), e.hookInfos && e.hookInfos.length > 0 && $s.jsxs($s.Fragment, {
          children: [$s.jsxs(Text, {
            dimColor: true,
            children: [$s.jsx(Text, {
              "aria-hidden": true,
              children: "  \u23BF  "
            }), "Ran ", e.hookCount, " ", "PreToolUse ", e.hookCount === 1 ? "hook" : "hooks", " (", formatSecondsShort(e.hookTotalMs ?? 0), ")"]
          }), e.hookInfos.map((le, pe) => $s.jsxs(Text, {
            dimColor: true,
            children: [$s.jsx(Text, {
              "aria-hidden": true,
              children: "     \u23BF "
            }), le.command, " (", formatSecondsShort(le.durationMs ?? 0), ")"]
          }, `hook-${pe}`))]
        }), e.relevantMemories?.map(le => $s.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [$s.jsxs(Text, {
            dimColor: true,
            children: [$s.jsx(Text, {
              "aria-hidden": true,
              children: "  \u23BF  "
            }), "Recalled", " ", WTl.basename(le.path)]
          }), $s.jsx(gXd, {
            paddingLeft: 5,
            children: $s.jsx(Text, {
              children: $s.jsx(Ansi, {
                children: le.content
              })
            })
          })]
        }, le.path))]
      });
    }
    if (!S && !E && !Z) {
      return null;
    }
    let be = "";
    if (qs() && i) {
      let ce;
      let le = 0;
      for (let pe of _) {
        if (!t.vZc(pe)) {
          continue;
        }
        let ve = s.progressMessagesByToolUseID.get(pe)?.at(-1)?.data;
        if (ve?.type !== "bash_progress" && ve?.type !== "powershell_progress") {
          continue;
        }
        if (ce === undefined || ve.elapsedTimeSeconds > ce) {
          ce = ve.elapsedTimeSeconds;
          le = ve.totalLines;
        }
      }
      if (ce !== undefined && ce >= 2) {
        let pe = formatDuration(ce * 1000);
        be = le > 0 ? ` (${pe} \xB7 ${le} ${le === 1 ? "line" : "lines"})` : ` (${pe})`;
      }
    }
    let fe = [];
    if (Q) {
      let ce = i ? "Thinking" : "Thought";
      let le;
      if (i && qs()) {
        let pe = 0;
        for (let ve = h.length - 1; ve >= 0; ve--) {
          let _e = h[ve];
          if (_e?.type === "assistant" && _e.message.content[0]?.type === "thinking") {
            let xe = Date.parse(_e.timestamp);
            if (Number.isFinite(xe)) {
              pe = xe;
            }
            break;
          }
        }
        le = $s.jsx(Lvm, {
          baseMs: J,
          lastThinkingAtMs: pe
        });
      } else {
        le = $s.jsx(Text, {
          bold: true,
          children: formatDuration(Math.max(1000, J))
        });
      }
      fe.push($s.jsxs(Text, {
        children: [ce, " for ", le]
      }, "thought"));
    }
    if (P > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Editing" : "editing" : ce ? "Edited" : "edited";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-edit"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: P
        }), " ", P === 1 ? "file" : "files", " ", $s.jsx(d9, {
          added: H,
          removed: U
        })]
      }, "edit"));
    }
    function me(ce, le, pe) {
      let ve = fe.length === 0;
      if (!ve) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, `comma-${ce}`));
      }
      fe.push($s.jsxs(Text, {
        children: [ve ? le[0].toUpperCase() + le.slice(1) : le, pe != null && $s.jsxs($s.Fragment, {
          children: [" ", pe]
        })]
      }, ce));
    }
    if (qs() && e.commits?.length) {
      let ce = {
        committed: "committed",
        amended: "amended commit",
        "cherry-picked": "cherry-picked"
      };
      for (let le of ["committed", "amended", "cherry-picked"]) {
        let pe = e.commits.filter(ve => ve.kind === le).map(ve => ve.sha);
        if (pe.length) {
          me(le, ce[le], $s.jsx(Text, {
            bold: true,
            children: pe.join(", ")
          }));
        }
      }
    }
    if (qs() && e.pushes?.length) {
      let ce = Ro(e.pushes.map(le => le.branch));
      me("push", "pushed to", $s.jsx(Text, {
        bold: true,
        children: ce.join(", ")
      }));
    }
    if (qs() && e.branches?.length) {
      let ce = {
        merged: "merged",
        rebased: "rebased onto"
      };
      for (let le of e.branches) {
        me(`br-${le.action}-${le.ref}`, ce[le.action], $s.jsx(Text, {
          bold: true,
          children: le.ref
        }));
      }
    }
    if (qs() && e.prs?.length) {
      let ce = {
        created: "created",
        edited: "edited",
        merged: "merged",
        commented: "commented on",
        closed: "closed",
        ready: "marked ready",
        draft: "marked draft",
        "auto-merge-enabled": "enabled auto-merge on",
        "auto-merge-disabled": "disabled auto-merge on"
      };
      for (let le of e.prs) {
        me(`pr-${le.action}-${le.number}`, ce[le.action], le.url ? $s.jsx(xKe, {
          number: le.number,
          url: le.url,
          bold: true
        }) : $s.jsxs(Text, {
          bold: true,
          children: ["PR #", le.number]
        }));
      }
    }
    if (F > 0) {
      me("frame", i ? "publishing" : "published", null);
    }
    if (W > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Searching for" : "searching for" : ce ? "Searched for" : "searched for";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-s"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: W
        }), " ", W === 1 ? "pattern" : "patterns"]
      }, "search"));
    }
    if (N > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Reading" : "reading" : ce ? "Read" : "read";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-r"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: N
        }), " ", N === 1 ? "file" : "files"]
      }, "read"));
    }
    if (j > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Listing" : "listing" : ce ? "Listed" : "listed";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-l"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: j
        }), " ", j === 1 ? "directory" : "directories"]
      }, "list"));
    }
    if (d > 0) {
      let ce = i ? "REPL'ing" : "REPL'd";
      if (fe.length > 0) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-repl"));
      }
      fe.push($s.jsxs(Text, {
        children: [ce, " ", $s.jsx(Text, {
          bold: true,
          children: d
        }), " ", d === 1 ? "time" : "times"]
      }, "repl"));
    }
    if (z > 0) {
      let ce = e.mcpServerNames?.map(ve => ve.replace(/^claude\.ai /, "")).join(", ") || "MCP";
      let le = fe.length === 0;
      let pe = i ? le ? "Calling" : "calling" : le ? "Called" : "called";
      if (!le) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-mcp"));
      }
      fe.push($s.jsxs(Text, {
        children: [pe, " ", ce, z > 1 && $s.jsxs($s.Fragment, {
          children: [" ", $s.jsx(Text, {
            bold: true,
            children: z
          }), " times"]
        })]
      }, "mcp"));
    }
    if (L > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Running" : "running" : ce ? "Ran" : "ran";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-agent"));
      }
      let pe = $vm(e.messages);
      let ve = L === 1 && !pe ? e.agentDescriptions?.[0] : undefined;
      let _e = ve !== undefined ? xTl(ve) : undefined;
      fe.push($s.jsx(Text, {
        children: _e !== undefined ? $s.jsx(Text, {
          bold: true,
          children: Bvm(i ? _e.running : _e.done, ce)
        }) : ve !== undefined ? $s.jsxs($s.Fragment, {
          children: [le, " agent \xB7 ", $s.jsx(Text, {
            bold: true,
            children: ve
          })]
        }) : $s.jsxs($s.Fragment, {
          children: [le, " ", $s.jsx(Text, {
            bold: true,
            children: L
          }), " ", L === 1 ? "agent" : "agents"]
        })
      }, "agent"));
    }
    if (M > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Calling" : "calling" : ce ? "Called" : "called";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-other"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: M
        }), " ", M === 1 ? "tool" : "tools"]
      }, "other"));
    }
    if (qs() && K > 0) {
      let ce = fe.length === 0;
      let le = i ? ce ? "Running" : "running" : ce ? "Ran" : "ran";
      if (!ce) {
        fe.push($s.jsx(Text, {
          children: ", "
        }, "comma-bash"));
      }
      fe.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: K
        }), " shell", " ", K === 1 ? "command" : "commands"]
      }, "bash"));
    }
    let Te = fe.length > 0;
    let ue = [];
    if (m > 0) {
      let ce = !Te && ue.length === 0;
      let le = i ? ce ? "Recalling" : "recalling" : ce ? "Recalled" : "recalled";
      if (!ce) {
        ue.push($s.jsx(Text, {
          children: ", "
        }, "comma-mr"));
      }
      ue.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: m
        }), " ", m === 1 ? "memory" : "memories"]
      }, "mem-read"));
    }
    if (p > 0) {
      let ce = !Te && ue.length === 0;
      let le = i ? ce ? "Searching" : "searching" : ce ? "Searched" : "searched";
      if (!ce) {
        ue.push($s.jsx(Text, {
          children: ", "
        }, "comma-ms"));
      }
      ue.push($s.jsx(Text, {
        children: `${le} memories`
      }, "mem-search"));
    }
    if (f > 0) {
      let ce = !Te && ue.length === 0;
      let le = i ? ce ? "Writing" : "writing" : ce ? "Wrote" : "wrote";
      if (!ce) {
        ue.push($s.jsx(Text, {
          children: ", "
        }, "comma-mw"));
      }
      ue.push($s.jsxs(Text, {
        children: [le, " ", $s.jsx(Text, {
          bold: true,
          children: f
        }), " ", f === 1 ? "memory" : "memories"]
      }, "mem-write"));
    }
    return $s.jsxs(gXd, {
      flexDirection: "column",
      marginTop: a ? 1 : 0,
      children: [$s.jsxs(gXd, {
        flexDirection: "row",
        children: [i ? $s.jsx(Ose, {
          shouldAnimate: true,
          isUnresolved: true,
          isError: b
        }) : $s.jsx(gXd, {
          minWidth: 2
        }), $s.jsxs(Text, {
          dimColor: !i,
          children: [fe, ue, LTl({
            message: e,
            isActiveGroup: i,
            hasPrecedingParts: Te || ue.length > 0
          }), O > 0 && $s.jsxs(Text, {
            dimColor: true,
            children: [" ", "\xB7 folded ", O]
          }, "folded"), i && $s.jsx(Text, {
            children: "\u2026"
          }, "ellipsis"), " ", $s.jsx(wv, {})]
        })]
      }), i && de !== undefined && $s.jsxs(gXd, {
        flexDirection: "row",
        children: [$s.jsx(gXd, {
          width: 5,
          flexShrink: 0,
          children: $s.jsx(Text, {
            "aria-hidden": true,
            dimColor: true,
            children: "  \u23BF  "
          })
        }), $s.jsx(gXd, {
          flexDirection: "column",
          flexGrow: 1,
          children: ae ? $s.jsx(cy, {
            dimColor: true,
            italic: true,
            children: Uvm(de, y - 5, 10)
          }) : de.split(`
`).map((ce, le, pe) => $s.jsxs(Text, {
            dimColor: true,
            children: [ce, le === pe.length - 1 && be]
          }, `hint-${le}`))
        })]
      }), e.hookTotalMs !== undefined && e.hookTotalMs > 0 && $s.jsxs(Text, {
        dimColor: true,
        children: [$s.jsx(Text, {
          "aria-hidden": true,
          children: "  \u23BF  "
        }), "Ran ", e.hookCount, " PreToolUse", " ", e.hookCount === 1 ? "hook" : "hooks", " (", formatSecondsShort(e.hookTotalMs), ")"]
      }), i && e.pendingText && $s.jsxs(gXd, {
        flexDirection: "row",
        marginTop: 1,
        children: [$s.jsx(gXd, {
          width: 2,
          flexShrink: 0,
          children: $s.jsx(Text, {
            "aria-hidden": true,
            dimColor: true,
            children: Tc
          })
        }), $s.jsx(gXd, {
          flexDirection: "column",
          flexGrow: 1,
          children: $s.jsx(cy, {
            dimColor: true,
            children: e.pendingText
          })
        })]
      })]
    });
  }
  function Lvm(e) {
    let t = uZn.c(6);
    let {
      baseMs: n,
      lastThinkingAtMs: r
    } = e;
    let o = bt(Fvm);
    let s;
    if (t[0] !== o) {
      s = o ?? mainAgentId();
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = sGa(s);
    useAnimationFrame(i !== null ? 1000 : null);
    let a = i !== null ? n + Math.min(600000, Math.max(0, Date.now() - Math.max(i, r))) : n;
    let l = Math.max(1000, a);
    let c;
    if (t[2] !== l) {
      c = formatDuration(l);
      t[2] = l;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== c) {
      u = $s.jsx(Text, {
        bold: true,
        children: c
      });
      t[4] = c;
      t[5] = u;
    } else {
      u = t[5];
    }
    return u;
  }
  function Fvm(e) {
    return e.viewingAgentTaskId;
  }
  function Uvm(e, t, n) {
    if (t < 1) {
      return e;
    }
    let r = wrapText_export(e, t, "wrap").split(`
`);
    if (r.length <= n) {
      return e;
    }
    let o = r.slice(0, n).join("").replace(/\s+/g, " ").trim();
    while (o.length > 0 && Ru(wrapText_export(`${o}\u2026`, t, "wrap"), `
`) + 1 > n) {
      let s = o.length > 1 ? o.codePointAt(o.length - 2) : undefined;
      o = o.slice(0, s !== undefined && s > 65535 ? -2 : -1);
    }
    return `${o.trimEnd()}\u2026`;
  }
  function Bvm(e, t) {
    return t ? e : e.charAt(0).toLowerCase() + e.slice(1);
  }
  function $vm(e) {
    let t = new Set();
    let n = new Set();
    for (let s of e) {
      if (s.type !== "assistant") {
        continue;
      }
      for (let i of s.message.content) {
        if (i.type === "tool_use" && (i.name === "Agent" || i.name === "Task")) {
          if (t.add(i.id), i.input?.run_in_background !== false) {
            n.add(i.id);
          }
        }
      }
    }
    if (t.size === 0) {
      return false;
    }
    let r = new Set();
    let o = false;
    for (let s of e) {
      if (s.type !== "user" || !Array.isArray(s.message.content)) {
        continue;
      }
      let i = false;
      for (let l of s.message.content) {
        if (l.type === "tool_result" && t.vZc(l.tool_use_id)) {
          if (i = true, r.add(l.tool_use_id), l.is_error === true) {
            o = true;
          }
        }
      }
      if (!i) {
        continue;
      }
      let a = s.toolUseResult?.status;
      if (a === "async_launched" || a === "remote_launched" || a === "teammate_spawned") {
        o = true;
      }
    }
    if (o) {
      return true;
    }
    for (let s of n) {
      if (!r.vZc(s)) {
        return true;
      }
    }
    return false;
  }
  var uZn;
  var WTl;
  var nTt;
  var $s;
  var VTl = __lazy(() => {
    at();
    wl();
    np();
    STl();
    ETl();
    ki();
    xHt();
    et();
    kTl();
    ho();
    ci();
    Sh();
    D6t();
    FNe();
    Zl();
    cs();
    zp();
    Gd();
    ro();
    Zn();
    Xq();
    pNe();
    sH();
    aZn();
    vpe();
    OSt();
    EMo();
    FTl();
    qMo();
    iNo();
    uZn = __toESM(pt(), 1);
    WTl = require("path");
    nTt = __toESM(ot(), 1);
    $s = __toESM(ie(), 1);
  });
  function KTl() {
    let e = zTl.c(2);
    let t = Zu("app:toggleTranscript", "Global", "ctrl+o");
    let n;
    if (e[0] !== t) {
      n = dZn.jsx(gXd, {
        marginY: 1,
        children: dZn.jsxs(Text, {
          dimColor: true,
          children: ["\u273B Conversation compacted (", t, " for history)"]
        })
      });
      e[0] = t;
      e[1] = n;
    } else {
      n = e[1];
    }
    return n;
  }
  var zTl;
  var dZn;
  var YTl = __lazy(() => {
    et();
    c0();
    zTl = __toESM(pt(), 1);
    dZn = __toESM(ie(), 1);
  });
  function JTl({
    message: e,
    tools: t,
    lookups: n,
    inProgressToolUseIDs: r,
    shouldAnimate: o,
    addMargin: s
  }) {
    let i = Cl(t, e.toolName);
    if (!i?.renderGroupedToolUse) {
      return null;
    }
    let a = new Map();
    for (let u of e.results) {
      for (let d of u.message.content) {
        if (d.type === "tool_result") {
          a.set(d.tool_use_id, {
            param: d,
            output: u.toolUseResult
          });
        }
      }
    }
    let l = e.messages.map(u => {
      let d = u.message.content[0];
      let p = a.get(d.id);
      return {
        param: d,
        isResolved: n.resolvedToolUseIDs.vZc(d.id),
        isError: n.erroredToolUseIDs.vZc(d.id),
        isInProgress: r.vZc(d.id),
        progressMessages: VIe(n.progressMessagesByToolUseID.get(d.id) ?? []),
        result: p
      };
    });
    let c = l.some(u => u.isInProgress);
    return i.renderGroupedToolUse(l, {
      shouldAnimate: o && c,
      tools: t,
      addMargin: s
    });
  }
  var XTl = __lazy(() => {
    ci();
  });
  function pZn(e) {
    let t = QTl.c(33);
    let {
      children: n,
      color: r,
      bold: o
    } = e;
    let s = m1n();
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    if (t[0] !== o || t[1] !== n || t[2] !== r || t[3] !== s) {
      d = Symbol.for("react.early_return_sentinel");
      e: {
        let g;
        if (t[10] !== n) {
          g = y => {
            let {
              url: _,
              marker: b
            } = y;
            return {
              url: _,
              marker: b,
              index: n.indexOf(b)
            };
          };
          t[10] = n;
          t[11] = g;
        } else {
          g = t[11];
        }
        if (a = Hvm.map(g).find(jvm), !s || a === undefined) {
          let y;
          if (t[12] !== o || t[13] !== n || t[14] !== r) {
            y = rTt.jsx(gKe, {
              color: r,
              bold: o,
              children: n
            });
            t[12] = o;
            t[13] = n;
            t[14] = r;
            t[15] = y;
          } else {
            y = t[15];
          }
          d = y;
          break e;
        }
        i = Text;
        l = r;
        c = o;
        u = n.slice(0, a.index);
      }
      t[0] = o;
      t[1] = n;
      t[2] = r;
      t[3] = s;
      t[4] = i;
      t[5] = a;
      t[6] = l;
      t[7] = c;
      t[8] = u;
      t[9] = d;
    } else {
      i = t[4];
      a = t[5];
      l = t[6];
      c = t[7];
      u = t[8];
      d = t[9];
    }
    if (d !== Symbol.for("react.early_return_sentinel")) {
      return d;
    }
    let p;
    if (t[16] !== o || t[17] !== r) {
      p = rTt.jsx(Text, {
        color: r,
        bold: o,
        underline: true,
        children: "learn more"
      });
      t[16] = o;
      t[17] = r;
      t[18] = p;
    } else {
      p = t[18];
    }
    let m;
    if (t[19] !== a.url || t[20] !== p) {
      m = rTt.jsx(Link, {
        url: a.url,
        children: p
      });
      t[19] = a.url;
      t[20] = p;
      t[21] = m;
    } else {
      m = t[21];
    }
    let f;
    if (t[22] !== n || t[23] !== a.index || t[24] !== a.marker.length) {
      f = n.slice(a.index + a.marker.length);
      t[22] = n;
      t[23] = a.index;
      t[24] = a.marker.length;
      t[25] = f;
    } else {
      f = t[25];
    }
    let h;
    if (t[26] !== i || t[27] !== l || t[28] !== c || t[29] !== u || t[30] !== m || t[31] !== f) {
      h = rTt.jsxs(i, {
        color: l,
        bold: c,
        children: [u, m, f]
      });
      t[26] = i;
      t[27] = l;
      t[28] = c;
      t[29] = u;
      t[30] = m;
      t[31] = f;
      t[32] = h;
    } else {
      h = t[32];
    }
    return h;
  }
  function jvm(e) {
    let {
      index: t
    } = e;
    return t !== -1;
  }
  var QTl;
  var rTt;
  var Hvm;
  var aNo = __lazy(() => {
    uG();
    et();
    LX();
    hQn();
    QTl = __toESM(pt(), 1);
    rTt = __toESM(ie(), 1);
    Hvm = ["https://support.claude.com/en/articles/15363606", "https://support.claude.com/en/articles/8106465"].map(e => ({
      url: e,
      marker: `learn more: ${e}`
    }));
  });
  function ZTl(e) {
    let t = e.teamCount ?? 0;
    if (t === 0) {
      return null;
    }
    return {
      segment: `${t} team ${t === 1 ? "memory" : "memories"}`,
      count: t
    };
  }
  var eEl;
  var tEl = __lazy(() => {
    eEl = ["Baked", "Brewed", "Churned", "Cogitated", "Cooked", "Crunched", "Saut\xE9ed", "Worked"];
  });
  function $7t({
    tasks: e,
    queuedCommands: t = []
  }) {
    let n = new Set();
    let r = new Set();
    let o = s => {
      if (j$(s) && s.isBackgrounded) {
        n.add(s.id);
      } else if (s.type === "local_workflow") {
        r.add(s.id);
      }
    };
    for (let s of Object.values(e)) {
      if (s.status === "running" || Mw(s.status) && !s.notified) {
        o(s);
      }
    }
    for (let s of t) {
      if (s.mode !== "task-notification" || !GI(s) || s.taskId === undefined) {
        continue;
      }
      let i = e[s.taskId];
      if (i) {
        o(i);
      }
    }
    return {
      pendingAgents: n.size,
      pendingWorkflows: r.size
    };
  }
  function nEl({
    tasks: e,
    queuedCommands: t = [],
    turnDurationMs: n,
    turnStartTime: r,
    now: o,
    backgroundWaitStartTime: s
  }) {
    let {
      pendingAgents: i,
      pendingWorkflows: a
    } = $7t({
      tasks: e,
      queuedCommands: t
    });
    if (i > 0 || a > 0) {
      return {
        durationMs: n,
        pendingBackgroundAgentCount: i > 0 ? i : undefined,
        pendingWorkflowCount: a > 0 ? a : undefined,
        backgroundWaitStartTime: s ?? r
      };
    }
    return {
      durationMs: s !== null ? o - s : n,
      pendingBackgroundAgentCount: undefined,
      pendingWorkflowCount: undefined,
      backgroundWaitStartTime: null
    };
  }
  var mZn = __lazy(() => {
    Cx();
    ry();
    Wpt();
  });
  function oEl(e) {
    let t = RLe.c(56);
    let {
      message: n,
      addMargin: r,
      verbose: o,
      isTranscriptMode: s
    } = e;
    if (n.subtype === "turn_duration") {
      let p;
      if (t[0] !== r || t[1] !== n) {
        p = ra.jsx(Jvm, {
          message: n,
          addMargin: r
        });
        t[0] = r;
        t[1] = n;
        t[2] = p;
      } else {
        p = t[2];
      }
      return p;
    }
    if (n.subtype === "memory_saved") {
      let p = o || !!s;
      let m;
      if (t[3] !== r || t[4] !== n || t[5] !== p) {
        m = ra.jsx(Qvm, {
          message: n,
          addMargin: r,
          verbose: p
        });
        t[3] = r;
        t[4] = n;
        t[5] = p;
        t[6] = m;
      } else {
        m = t[6];
      }
      return m;
    }
    if (n.subtype === "away_summary") {
      let p;
      if (t[7] !== r || t[8] !== n.content) {
        p = ra.jsx($Qn, {
          content: n.content,
          addMargin: r
        });
        t[7] = r;
        t[8] = n.content;
        t[9] = p;
      } else {
        p = t[9];
      }
      return p;
    }
    if (n.subtype === "agents_killed") {
      let p = r ? 1 : 0;
      let m;
      let f;
      if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
        m = ra.jsx(gXd, {
          minWidth: 2,
          children: ra.jsx(Text, {
            color: "error",
            children: Tc
          })
        });
        f = ra.jsx(Text, {
          dimColor: true,
          children: "All background agents stopped"
        });
        t[10] = m;
        t[11] = f;
      } else {
        m = t[10];
        f = t[11];
      }
      let h;
      if (t[12] !== p) {
        h = ra.jsxs(gXd, {
          flexDirection: "row",
          marginTop: p,
          width: "100%",
          children: [m, f]
        });
        t[12] = p;
        t[13] = h;
      } else {
        h = t[13];
      }
      return h;
    }
    if (n.subtype === "thinking") {
      return null;
    }
    if (n.subtype === "model_refusal_no_fallback") {
      return null;
    }
    if (NX() && n.subtype === "model_refusal_fallback") {
      let p = r ? 1 : 0;
      let m;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        m = ra.jsx(gXd, {
          minWidth: 2,
          children: ra.jsx(Text, {
            color: "warning",
            children: Tc
          })
        });
        t[14] = m;
      } else {
        m = t[14];
      }
      let f;
      if (t[15] !== n.content) {
        f = ra.jsxs(gXd, {
          flexDirection: "row",
          width: "100%",
          children: [m, ra.jsx(pZn, {
            color: "warning",
            bold: true,
            children: n.content
          })]
        });
        t[15] = n.content;
        t[16] = f;
      } else {
        f = t[16];
      }
      let h;
      if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
        h = ra.jsxs(Text, {
          dimColor: true,
          children: ["  \u23BF  ", "Tip: You can configure model switch behavior in /config"]
        });
        t[17] = h;
      } else {
        h = t[17];
      }
      let g;
      if (t[18] !== p || t[19] !== f) {
        g = ra.jsxs(gXd, {
          flexDirection: "column",
          marginTop: p,
          width: "100%",
          children: [f, h]
        });
        t[18] = p;
        t[19] = f;
        t[20] = g;
      } else {
        g = t[20];
      }
      return g;
    }
    if (n.subtype === "model_fallback") {
      let p = n.trigger === "model_not_found" || n.trigger === "permission_denied";
      let m = r ? 1 : 0;
      let f;
      if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
        f = ra.jsx(gXd, {
          minWidth: 2,
          children: ra.jsx(Text, {
            color: "warning",
            children: Tc
          })
        });
        t[21] = f;
      } else {
        f = t[21];
      }
      let h;
      if (t[22] !== p || t[23] !== n.content) {
        h = ra.jsx(Text, {
          color: "warning",
          bold: p,
          wrap: "wrap",
          children: n.content
        });
        t[22] = p;
        t[23] = n.content;
        t[24] = h;
      } else {
        h = t[24];
      }
      let g;
      if (t[25] !== m || t[26] !== h) {
        g = ra.jsxs(gXd, {
          flexDirection: "row",
          marginTop: m,
          width: "100%",
          children: [f, h]
        });
        t[25] = m;
        t[26] = h;
        t[27] = g;
      } else {
        g = t[27];
      }
      return g;
    }
    if (n.subtype === "bridge_status") {
      let p;
      if (t[28] !== r || t[29] !== n) {
        p = ra.jsx(twm, {
          message: n,
          addMargin: r
        });
        t[28] = r;
        t[29] = n;
        t[30] = p;
      } else {
        p = t[30];
      }
      return p;
    }
    if (n.subtype === "scheduled_task_fire" || n.subtype === "fold_boundary") {
      let p = r ? 1 : 0;
      let m;
      if (t[31] !== n.content) {
        m = ra.jsxs(Text, {
          dimColor: true,
          children: ["\u273B", " ", n.content]
        });
        t[31] = n.content;
        t[32] = m;
      } else {
        m = t[32];
      }
      let f;
      if (t[33] !== p || t[34] !== m) {
        f = ra.jsx(gXd, {
          marginTop: p,
          width: "100%",
          children: m
        });
        t[33] = p;
        t[34] = m;
        t[35] = f;
      } else {
        f = t[35];
      }
      return f;
    }
    if (n.subtype === "permission_retry") {
      let p = r ? 1 : 0;
      let m;
      let f;
      if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
        m = ra.jsxs(Text, {
          dimColor: true,
          children: ["\u273B", " "]
        });
        f = ra.jsx(Text, {
          children: "Allowed "
        });
        t[36] = m;
        t[37] = f;
      } else {
        m = t[36];
        f = t[37];
      }
      let h;
      if (t[38] !== n.commands) {
        h = n.commands.join(", ");
        t[38] = n.commands;
        t[39] = h;
      } else {
        h = t[39];
      }
      let g;
      if (t[40] !== h) {
        g = ra.jsx(Text, {
          bold: true,
          children: h
        });
        t[40] = h;
        t[41] = g;
      } else {
        g = t[41];
      }
      let y;
      if (t[42] !== p || t[43] !== g) {
        y = ra.jsxs(gXd, {
          marginTop: p,
          width: "100%",
          children: [m, f, g]
        });
        t[42] = p;
        t[43] = g;
        t[44] = y;
      } else {
        y = t[44];
      }
      return y;
    }
    if (n.subtype !== "stop_hook_summary" && !o && n.level === "info") {
      return null;
    }
    if (n.subtype === "api_error") {
      return null;
    }
    if (n.subtype === "stop_hook_summary") {
      let p;
      if (t[45] !== r || t[46] !== s || t[47] !== n || t[48] !== o) {
        p = ra.jsx(Wvm, {
          message: n,
          addMargin: r,
          verbose: o,
          isTranscriptMode: s
        });
        t[45] = r;
        t[46] = s;
        t[47] = n;
        t[48] = o;
        t[49] = p;
      } else {
        p = t[49];
      }
      return p;
    }
    let a = n.content;
    if (typeof a !== "string") {
      return null;
    }
    let l = n.level !== "info";
    let c = n.level === "warning" ? "warning" : n.level === "notice" ? "inactive" : undefined;
    let u = n.level === "info";
    let d;
    if (t[50] !== r || t[51] !== a || t[52] !== l || t[53] !== c || t[54] !== u) {
      d = ra.jsx(gXd, {
        flexDirection: "row",
        width: "100%",
        children: ra.jsx(Yvm, {
          content: a,
          addMargin: r,
          dot: l,
          color: c,
          dimColor: u
        })
      });
      t[50] = r;
      t[51] = a;
      t[52] = l;
      t[53] = c;
      t[54] = u;
      t[55] = d;
    } else {
      d = t[55];
    }
    return d;
  }
  function Wvm(e) {
    let t = RLe.c(51);
    let {
      message: n,
      addMargin: r,
      verbose: o,
      isTranscriptMode: s
    } = e;
    let {
      hookCount: i,
      hookInfos: a,
      hookErrors: l,
      hookAdditionalContext: c,
      preventedContinuation: u,
      stopReason: d
    } = n;
    let p;
    if (t[0] !== c) {
      p = c === undefined ? [] : c;
      t[0] = c;
      t[1] = p;
    } else {
      p = t[1];
    }
    let m = p;
    let {
      columns: f
    } = Sr();
    let h;
    if (t[2] !== a || t[3] !== n.totalDurationMs) {
      h = n.totalDurationMs ?? a.reduce(Kvm, 0);
      t[2] = a;
      t[3] = n.totalDurationMs;
      t[4] = h;
    } else {
      h = t[4];
    }
    let g = h;
    if (l.length === 0 && m.length === 0 && !u && !n.hookLabel) {
      return null;
    }
    let y;
    if (t[5] !== g) {
      y = "";
      t[5] = g;
      t[6] = y;
    } else {
      y = t[6];
    }
    let _ = y;
    if (n.hookLabel) {
      let U = i === 1 ? "hook" : "hooks";
      let N;
      if (t[7] !== i || t[8] !== n.hookLabel || t[9] !== U || t[10] !== _) {
        N = ra.jsxs(Text, {
          dimColor: true,
          children: ["  \u23BF  ", "Ran ", i, " ", n.hookLabel, " ", U, _]
        });
        t[7] = i;
        t[8] = n.hookLabel;
        t[9] = U;
        t[10] = _;
        t[11] = N;
      } else {
        N = t[11];
      }
      let W;
      if (t[12] !== a || t[13] !== s) {
        W = s && a.map(zvm);
        t[12] = a;
        t[13] = s;
        t[14] = W;
      } else {
        W = t[14];
      }
      let j;
      if (t[15] !== N || t[16] !== W) {
        j = ra.jsxs(gXd, {
          flexDirection: "column",
          width: "100%",
          children: [N, W]
        });
        t[15] = N;
        t[16] = W;
        t[17] = j;
      } else {
        j = t[17];
      }
      return j;
    }
    let b = r ? 1 : 0;
    let S;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      S = ra.jsx(gXd, {
        minWidth: 2,
        children: ra.jsx(Text, {
          children: Tc
        })
      });
      t[18] = S;
    } else {
      S = t[18];
    }
    let E = f - 10;
    let C;
    if (t[19] !== i) {
      C = ra.jsx(Text, {
        bold: true,
        children: i
      });
      t[19] = i;
      t[20] = C;
    } else {
      C = t[20];
    }
    let x = n.hookLabel ?? "stop";
    let A = i === 1 ? "hook" : "hooks";
    let k;
    if (t[21] !== a || t[22] !== o) {
      k = !o && a.length > 0 && ra.jsxs(ra.Fragment, {
        children: [" ", ra.jsx(wv, {})]
      });
      t[21] = a;
      t[22] = o;
      t[23] = k;
    } else {
      k = t[23];
    }
    let I;
    if (t[24] !== A || t[25] !== k || t[26] !== C || t[27] !== x || t[28] !== _) {
      I = ra.jsxs(Text, {
        children: ["Ran ", C, " ", x, " ", A, _, k]
      });
      t[24] = A;
      t[25] = k;
      t[26] = C;
      t[27] = x;
      t[28] = _;
      t[29] = I;
    } else {
      I = t[29];
    }
    let O;
    if (t[30] !== a || t[31] !== o) {
      O = o && a.length > 0 && a.map(Vvm);
      t[30] = a;
      t[31] = o;
      t[32] = O;
    } else {
      O = t[32];
    }
    let M;
    if (t[33] !== u || t[34] !== d) {
      M = u && d && ra.jsxs(Text, {
        children: [ra.jsx(Text, {
          dimColor: true,
          children: "\u23BF \xA0"
        }), d]
      });
      t[33] = u;
      t[34] = d;
      t[35] = M;
    } else {
      M = t[35];
    }
    let L;
    if (t[36] !== l || t[37] !== n.hookLabel) {
      L = l.length > 0 && l.map((U, N) => ra.jsxs(Text, {
        children: [ra.jsx(Text, {
          dimColor: true,
          children: "\u23BF \xA0"
        }), n.hookLabel ?? "Stop", " hook error: ", U]
      }, N));
      t[36] = l;
      t[37] = n.hookLabel;
      t[38] = L;
    } else {
      L = t[38];
    }
    let P;
    if (t[39] !== m) {
      P = m.length > 0 && m.map(Gvm);
      t[39] = m;
      t[40] = P;
    } else {
      P = t[40];
    }
    let F;
    if (t[41] !== I || t[42] !== O || t[43] !== M || t[44] !== L || t[45] !== P || t[46] !== E) {
      F = ra.jsxs(gXd, {
        flexDirection: "column",
        width: E,
        children: [I, O, M, L, P]
      });
      t[41] = I;
      t[42] = O;
      t[43] = M;
      t[44] = L;
      t[45] = P;
      t[46] = E;
      t[47] = F;
    } else {
      F = t[47];
    }
    let H;
    if (t[48] !== F || t[49] !== b) {
      H = ra.jsxs(gXd, {
        flexDirection: "row",
        marginTop: b,
        width: "100%",
        children: [S, F]
      });
      t[48] = F;
      t[49] = b;
      t[50] = H;
    } else {
      H = t[50];
    }
    return H;
  }
  function Gvm(e, t) {
    return ra.jsxs(Text, {
      children: [ra.jsx(Text, {
        dimColor: true,
        children: "\u23BF \xA0"
      }), "Stop hook feedback: ", e]
    }, `feedback-${t}`);
  }
  function Vvm(e, t) {
    return ra.jsxs(Text, {
      dimColor: true,
      children: ["\u23BF \xA0", e.command === "prompt" ? `prompt: ${e.promptText || ""}` : e.command, ""]
    }, `cmd-${t}`);
  }
  function zvm(e, t) {
    return ra.jsxs(Text, {
      dimColor: true,
      children: ["     \u23BF ", e.command === "prompt" ? `prompt: ${e.promptText || ""}` : e.command, ""]
    }, `cmd-${t}`);
  }
  function Kvm(e, t) {
    return e + (t.durationMs ?? 0);
  }
  function Yvm(e) {
    let t = RLe.c(17);
    let {
      content: n,
      addMargin: r,
      dot: o,
      color: s,
      dimColor: i
    } = e;
    let {
      columns: a
    } = Sr();
    let l = r ? 1 : 0;
    let c;
    if (t[0] !== s || t[1] !== i || t[2] !== o) {
      c = o && ra.jsx(gXd, {
        minWidth: 2,
        children: ra.jsx(Text, {
          "aria-hidden": true,
          color: s,
          dimColor: i,
          children: Tc
        })
      });
      t[0] = s;
      t[1] = i;
      t[2] = o;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u = a - 10;
    let d;
    if (t[4] !== n) {
      d = n.trim();
      t[4] = n;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p;
    if (t[6] !== s || t[7] !== i || t[8] !== d) {
      p = ra.jsx(Text, {
        color: s,
        dimColor: i,
        wrap: "wrap",
        children: d
      });
      t[6] = s;
      t[7] = i;
      t[8] = d;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== u || t[11] !== p) {
      m = ra.jsx(gXd, {
        flexDirection: "column",
        width: u,
        children: p
      });
      t[10] = u;
      t[11] = p;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== l || t[14] !== c || t[15] !== m) {
      f = ra.jsxs(gXd, {
        flexDirection: "row",
        marginTop: l,
        width: "100%",
        children: [c, m]
      });
      t[13] = l;
      t[14] = c;
      t[15] = m;
      t[16] = f;
    } else {
      f = t[16];
    }
    return f;
  }
  function Jvm(e) {
    let t = RLe.c(37);
    let {
      message: n,
      addMargin: r
    } = e;
    let [o] = fZn.useState(Xvm);
    let s = Ec();
    let i;
    if (t[0] !== s) {
      i = () => {
        let z = s.getState().tasks ?? {};
        let V = Object.values(z).filter(kv);
        let K = $7t({
          tasks: z,
          queuedCommands: NV()
        });
        return {
          backgroundTaskSummary: V.length > 0 ? Pgt(V) : null,
          hasPendingAgents: K.pendingAgents > 0,
          hasPendingWorkflows: K.pendingWorkflows > 0
        };
      };
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let [a] = fZn.useState(i);
    let {
      backgroundTaskSummary: l,
      hasPendingAgents: c,
      hasPendingWorkflows: u
    } = a;
    let d;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      d = uc("showTurnDuration", true);
      t[2] = d;
    } else {
      d = t[2];
    }
    let p = d.value;
    let m;
    if (t[3] !== n.durationMs) {
      m = formatDuration(n.durationMs);
      t[3] = n.durationMs;
      t[4] = m;
    } else {
      m = t[4];
    }
    let f = m;
    let h = n.budgetLimit !== undefined;
    let g;
    e: {
      if (!h) {
        g = "";
        break e;
      }
      let {
        budgetTokens: z,
        budgetLimit: V
      } = n;
      let K;
      if (t[5] !== V || t[6] !== z) {
        K = z >= V ? `${formatNumber(z)} used (${formatNumber(V)} min ${vGd.tick})` : `${formatNumber(z)} / ${formatNumber(V)} (${Math.round(z / V * 100)}%)`;
        t[5] = V;
        t[6] = z;
        t[7] = K;
      } else {
        K = t[7];
      }
      let J = K;
      let Q = n.budgetNudges > 0 ? ` \xB7 ${n.budgetNudges} ${n.budgetNudges === 1 ? "nudge" : "nudges"}` : "";
      g = `${p ? " \xB7 " : ""}${J}${Q}`;
    }
    let y = g;
    let _ = n.briefHiddenCount ?? 0;
    let b = _ > 0 ? `${p || h ? " \xB7 " : ""}${_} ${_ === 1 ? "message" : "messages"} hidden (/focus to show)` : "";
    if (!p && !h && !b) {
      return null;
    }
    let S = c ? n.pendingBackgroundAgentCount ?? 0 : 0;
    let E = u ? n.pendingWorkflowCount ?? 0 : 0;
    let C = S > 0 || E > 0;
    let x;
    if (t[8] !== S) {
      x = S > 0 && ra.jsxs(Text, {
        children: [" ", ra.jsx(Text, {
          bold: true,
          dimColor: true,
          children: S
        }), ` background ${S === 1 ? "agent" : "agents"}`]
      });
      t[8] = S;
      t[9] = x;
    } else {
      x = t[9];
    }
    let A = S > 0 && E > 0 && " and";
    let k;
    if (t[10] !== E) {
      k = E > 0 && ra.jsxs(Text, {
        children: [" ", ra.jsx(Text, {
          bold: true,
          dimColor: true,
          children: E
        }), ` ${E === 1 ? "dynamic workflow" : "dynamic workflows"}`]
      });
      t[10] = E;
      t[11] = k;
    } else {
      k = t[11];
    }
    let I;
    if (t[12] !== x || t[13] !== A || t[14] !== k) {
      I = ra.jsxs(Text, {
        dimColor: true,
        children: ["Waiting for", x, A, k, " to finish"]
      });
      t[12] = x;
      t[13] = A;
      t[14] = k;
      t[15] = I;
    } else {
      I = t[15];
    }
    let O = I;
    let M = p && C;
    let L = r ? 1 : 0;
    let P;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      P = ra.jsx(gXd, {
        minWidth: 2,
        children: ra.jsx(Text, {
          "aria-hidden": true,
          dimColor: true,
          children: "\u273B"
        })
      });
      t[16] = P;
    } else {
      P = t[16];
    }
    let F;
    if (t[17] !== f || t[18] !== C || t[19] !== o || t[20] !== O) {
      F = p && (C ? O : ra.jsx(Text, {
        dimColor: true,
        children: `${o} for ${f}`
      }));
      t[17] = f;
      t[18] = C;
      t[19] = o;
      t[20] = O;
      t[21] = F;
    } else {
      F = t[21];
    }
    let H;
    if (t[22] !== y) {
      H = y && ra.jsx(Text, {
        dimColor: true,
        children: y
      });
      t[22] = y;
      t[23] = H;
    } else {
      H = t[23];
    }
    let U;
    if (t[24] !== b) {
      U = b && ra.jsx(Text, {
        dimColor: true,
        children: b
      });
      t[24] = b;
      t[25] = U;
    } else {
      U = t[25];
    }
    let N;
    if (t[26] !== l || t[27] !== M) {
      N = !M && l && ra.jsx(Text, {
        dimColor: true,
        children: ` \xB7 ${l} still running`
      });
      t[26] = l;
      t[27] = M;
      t[28] = N;
    } else {
      N = t[28];
    }
    let W;
    if (t[29] !== F || t[30] !== H || t[31] !== U || t[32] !== N) {
      W = ra.jsxs(Text, {
        children: [F, H, U, N]
      });
      t[29] = F;
      t[30] = H;
      t[31] = U;
      t[32] = N;
      t[33] = W;
    } else {
      W = t[33];
    }
    let j;
    if (t[34] !== L || t[35] !== W) {
      j = ra.jsxs(gXd, {
        flexDirection: "row",
        marginTop: L,
        width: "100%",
        children: [P, W]
      });
      t[34] = L;
      t[35] = W;
      t[36] = j;
    } else {
      j = t[36];
    }
    return j;
  }
  function Xvm() {
    return yWp(eEl) ?? "Worked";
  }
  function Qvm(e) {
    let t = RLe.c(16);
    let {
      message: n,
      addMargin: r,
      verbose: o
    } = e;
    let {
      writtenPaths: s
    } = n;
    let i;
    if (t[0] !== n) {
      i = ZTl(n);
      t[0] = n;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l = s.length - (a?.count ?? 0);
    let c = l > 0 ? `${l} ${l === 1 ? "memory" : "memories"}` : null;
    let u = a?.segment;
    let d;
    if (t[2] !== c || t[3] !== u) {
      d = [c, u].filter(Boolean);
      t[2] = c;
      t[3] = u;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p = d;
    let m = r ? 1 : 0;
    let f;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      f = ra.jsx(gXd, {
        minWidth: 2,
        children: ra.jsx(Text, {
          dimColor: true,
          children: Tc
        })
      });
      t[5] = f;
    } else {
      f = t[5];
    }
    let h = n.verb ?? "Saved";
    let g = p.join(" \xB7 ");
    let y;
    if (t[6] !== h || t[7] !== g) {
      y = ra.jsxs(gXd, {
        flexDirection: "row",
        children: [f, ra.jsxs(Text, {
          children: [h, " ", g]
        })]
      });
      t[6] = h;
      t[7] = g;
      t[8] = y;
    } else {
      y = t[8];
    }
    let _;
    if (t[9] !== o || t[10] !== s) {
      _ = o && s.map(Zvm);
      t[9] = o;
      t[10] = s;
      t[11] = _;
    } else {
      _ = t[11];
    }
    let b;
    if (t[12] !== _ || t[13] !== m || t[14] !== y) {
      b = ra.jsxs(gXd, {
        flexDirection: "column",
        marginTop: m,
        children: [y, _]
      });
      t[12] = _;
      t[13] = m;
      t[14] = y;
      t[15] = b;
    } else {
      b = t[15];
    }
    return b;
  }
  function Zvm(e) {
    return ra.jsx(ewm, {
      path: e
    }, e);
  }
  function ewm(e) {
    let t = RLe.c(16);
    let {
      path: n
    } = e;
    let [r, o] = fZn.useState(false);
    let s;
    if (t[0] !== n) {
      s = () => void NIn(n);
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    let a;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = () => o(true);
      a = () => o(false);
      t[2] = i;
      t[3] = a;
    } else {
      i = t[2];
      a = t[3];
    }
    let l = !r;
    let c;
    if (t[4] !== n) {
      c = rEl.basename(n);
      t[4] = n;
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== n || t[7] !== c) {
      u = ra.jsx(vM, {
        filePath: n,
        children: c
      });
      t[6] = n;
      t[7] = c;
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] !== r || t[10] !== l || t[11] !== u) {
      d = ra.jsx(Text, {
        dimColor: l,
        underline: r,
        children: u
      });
      t[9] = r;
      t[10] = l;
      t[11] = u;
      t[12] = d;
    } else {
      d = t[12];
    }
    let p;
    if (t[13] !== s || t[14] !== d) {
      p = ra.jsx(Vn, {
        children: ra.jsx(gXd, {
          onClick: s,
          onMouseEnter: i,
          onMouseLeave: a,
          children: d
        })
      });
      t[13] = s;
      t[14] = d;
      t[15] = p;
    } else {
      p = t[15];
    }
    return p;
  }
  function twm(e) {
    let t = RLe.c(13);
    let {
      message: n,
      addMargin: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = p => p.replBridgeConnected && !p.replBridgeOutboundOnly && p.replBridgeSessionUrl === n.url;
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    if (!bt(o)) {
      return null;
    }
    let i = r ? 1 : 0;
    let a;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = ra.jsx(gXd, {
        minWidth: 2
      });
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== n.url) {
      l = ra.jsxs(Text, {
        children: ["/remote-control is active", ra.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 Continue here, on your phone, or at ", ra.jsx(Link, {
            url: n.url,
            children: n.url
          })]
        })]
      });
      t[3] = n.url;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== n.upgradeNudge) {
      c = n.upgradeNudge && ra.jsxs(gXd, {
        flexDirection: "row",
        children: [ra.jsx(Text, {
          dimColor: true,
          children: "\u23BF  "
        }), ra.jsx(Text, {
          dimColor: true,
          children: n.upgradeNudge
        })]
      });
      t[5] = n.upgradeNudge;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== l || t[8] !== c) {
      u = ra.jsxs(gXd, {
        flexDirection: "column",
        children: [l, c]
      });
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== i || t[11] !== u) {
      d = ra.jsxs(gXd, {
        flexDirection: "row",
        marginTop: i,
        width: 999,
        children: [a, u]
      });
      t[10] = i;
      t[11] = u;
      t[12] = d;
    } else {
      d = t[12];
    }
    return d;
  }
  var RLe;
  var fZn;
  var rEl;
  var ra;
  var sEl = __lazy(() => {
    et();
    wl();
    Wl();
    PMo();
    XTe();
    aNo();
    ky();
    tEl();
    ki();
    cs();
    LX();
    zg();
    Xq();
    ho();
    j5n();
    Rf();
    mZn();
    RLe = __toESM(pt(), 1);
    fZn = __toESM(ot(), 1);
    rEl = require("path");
    ra = __toESM(ie(), 1);
  });
  function rwm(e) {
    let n = [...e].filter(o => {
      let s = o.codePointAt(0) ?? 0;
      if (s < 32 || s === 127) {
        return false;
      }
      if (s >= 128 && s <= 159) {
        return false;
      }
      if (s >= 8203 && s <= 8207 || s >= 8234 && s <= 8238 || s >= 8294 && s <= 8297 || s === 65279) {
        return false;
      }
      return true;
    }).join("").trim();
    return (n.length > 64 ? `${n.slice(0, 64)}\u2026` : n) || "agent";
  }
  function owm(e) {
    let t = e;
    let n = nwm.find(o => t.startsWith(o));
    if (n) {
      t = t.slice(n.length);
    }
    let r = t.lastIndexOf("</agent-message>") + ("</agent-message>").length;
    if (r > ("</agent-message>").length - 1) {
      let o = t.slice(r);
      if (_Xn.includes(o)) {
        t = t.slice(0, r);
      }
    }
    return t.replace(/^<agent-message[^>]*>\n/, "").replace(/\n<\/agent-message>$/, "");
  }
  function cNo(e) {
    let t = iEl.c(20);
    let {
      addMargin: n,
      param: r,
      fromName: o,
      isTranscriptMode: s
    } = e;
    let i;
    if (t[0] !== o) {
      i = rwm(o);
      t[0] = o;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l = typeof r.text === "string" ? r.text : "";
    let c = NI("app:toggleTranscript", "Global", "ctrl+o");
    if (!s) {
      let g = n ? 1 : 0;
      let y;
      if (t[2] !== c) {
        y = zve.jsx(xt, {
          chord: c,
          action: "expand",
          parens: true
        });
        t[2] = c;
        t[3] = y;
      } else {
        y = t[3];
      }
      let _;
      if (t[4] !== a || t[5] !== y) {
        _ = zve.jsxs(Text, {
          dimColor: true,
          children: [vGd.pointerSmall, " Message from ", a, " ", y]
        });
        t[4] = a;
        t[5] = y;
        t[6] = _;
      } else {
        _ = t[6];
      }
      let b;
      if (t[7] !== g || t[8] !== _) {
        b = zve.jsx(gXd, {
          marginTop: g,
          width: "100%",
          children: _
        });
        t[7] = g;
        t[8] = _;
        t[9] = b;
      } else {
        b = t[9];
      }
      return b;
    }
    let u = n ? 1 : 0;
    let d = `${vGd.pointerSmall} Message from ${a}`;
    let p;
    if (t[10] !== d) {
      p = zve.jsx(Text, {
        dimColor: true,
        children: d
      });
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== l) {
      m = owm(l);
      t[12] = l;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== m) {
      f = zve.jsx(gXd, {
        paddingLeft: 2,
        children: zve.jsx(Text, {
          wrap: "wrap",
          children: m
        })
      });
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    let h;
    if (t[16] !== u || t[17] !== p || t[18] !== f) {
      h = zve.jsxs(gXd, {
        flexDirection: "column",
        marginTop: u,
        width: "100%",
        children: [p, f]
      });
      t[16] = u;
      t[17] = p;
      t[18] = f;
      t[19] = h;
    } else {
      h = t[19];
    }
    return h;
  }
  var iEl;
  var zve;
  var nwm;
  var aEl = __lazy(() => {
    zbt();
    et();
    eOe();
    bs();
    iEl = __toESM(pt(), 1);
    zve = __toESM(ie(), 1);
    nwm = [`${"Another Claude session sent a message"} while you were working:
`, `${"Another Claude session sent a message"}:
`];
  });
  function cEl() {
    let e = lEl.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = uNo.jsx(Vn, {
        height: 1,
        children: uNo.jsx(Hme, {})
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var lEl;
  var uNo;
  var uEl = __lazy(() => {
    ISt();
    Wl();
    lEl = __toESM(pt(), 1);
    uNo = __toESM(ie(), 1);
  });
  function pEl(e) {
    let t = dEl.c(13);
    let {
      input: n,
      progressMessagesForMessage: r,
      style: o,
      tool: s,
      tools: i,
      verbose: a,
      isTranscriptMode: l
    } = e;
    let {
      columns: c
    } = Sr();
    let [u] = useTheme();
    if (!s || !s.renderToolUseRejectedMessage) {
      let f;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        f = hZn.jsx(jme, {});
        t[0] = f;
      } else {
        f = t[0];
      }
      return f;
    }
    let d = s.inputSchema;
    let p;
    let m;
    if (t[1] !== c || t[2] !== n || t[3] !== l || t[4] !== r || t[5] !== o || t[6] !== u || t[7] !== s || t[8] !== i || t[9] !== a) {
      m = Symbol.for("react.early_return_sentinel");
      e: {
        let f = d.safeParse(n);
        if (!f.success) {
          let h;
          if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
            h = hZn.jsx(jme, {});
            t[12] = h;
          } else {
            h = t[12];
          }
          m = h;
          break e;
        }
        p = s.renderToolUseRejectedMessage(f.data, {
          columns: c,
          messages: [],
          tools: i,
          verbose: a,
          progressMessagesForMessage: VIe(r),
          style: o,
          theme: u,
          isTranscriptMode: l
        }) ?? hZn.jsx(jme, {});
      }
      t[1] = c;
      t[2] = n;
      t[3] = l;
      t[4] = r;
      t[5] = o;
      t[6] = u;
      t[7] = s;
      t[8] = i;
      t[9] = a;
      t[10] = p;
      t[11] = m;
    } else {
      p = t[10];
      m = t[11];
    }
    if (m !== Symbol.for("react.early_return_sentinel")) {
      return m;
    }
    return p;
  }
  var dEl;
  var hZn;
  var mEl = __lazy(() => {
    ki();
    et();
    ci();
    R7t();
    dEl = __toESM(pt(), 1);
    hZn = __toESM(ie(), 1);
  });
  function hEl(e) {
    let t = fEl.c(42);
    let {
      message: n,
      lookups: r,
      toolUseID: o,
      progressMessagesForMessage: s,
      style: i,
      tool: a,
      tools: l,
      verbose: c,
      width: u,
      isTranscriptMode: d
    } = e;
    let [p] = useTheme();
    let m = bt(iwm);
    let f = Ec();
    let h;
    if (t[0] !== f || t[1] !== o) {
      h = () => bya(f.getState(), o);
      t[0] = f;
      t[1] = o;
      t[2] = h;
    } else {
      h = t[2];
    }
    let [g] = H7t.useState(h);
    let y;
    if (t[3] !== f || t[4] !== o) {
      y = () => Tya(f.getState(), o);
      t[3] = f;
      t[4] = o;
      t[5] = y;
    } else {
      y = t[5];
    }
    let [_] = H7t.useState(y);
    let b;
    if (t[6] !== f.setState || t[7] !== o) {
      b = () => {
        vya(NDe(f.setState), o);
      };
      t[6] = f.setState;
      t[7] = o;
      t[8] = b;
    } else {
      b = t[8];
    }
    let S;
    if (t[9] !== f || t[10] !== o) {
      S = [f, o];
      t[9] = f;
      t[10] = o;
      t[11] = S;
    } else {
      S = t[11];
    }
    if (H7t.useEffect(b, S), !n.toolUseResult || !a) {
      return null;
    }
    if (a.isTransparentWrapper?.()) {
      return null;
    }
    let E;
    let C;
    if (t[12] !== m || t[13] !== d || t[14] !== r || t[15] !== n.toolUseResult || t[16] !== s || t[17] !== i || t[18] !== p || t[19] !== a || t[20] !== o || t[21] !== l || t[22] !== c) {
      C = Symbol.for("react.early_return_sentinel");
      e: {
        let F = a.outputSchema?.safeParse(n.toolUseResult);
        if (F && !F.success) {
          C = null;
          break e;
        }
        let H = F?.data ?? n.toolUseResult;
        E = a.renderToolResultMessage?.(H, VIe(s), {
          style: i,
          theme: p,
          tools: l,
          verbose: c,
          isTranscriptMode: d,
          isBriefOnly: m,
          input: r.toolUseByToolUseID.get(o)?.input
        }) ?? null;
      }
      t[12] = m;
      t[13] = d;
      t[14] = r;
      t[15] = n.toolUseResult;
      t[16] = s;
      t[17] = i;
      t[18] = p;
      t[19] = a;
      t[20] = o;
      t[21] = l;
      t[22] = c;
      t[23] = E;
      t[24] = C;
    } else {
      E = t[23];
      C = t[24];
    }
    if (C !== Symbol.for("react.early_return_sentinel")) {
      return C;
    }
    let x = E;
    if (x === null) {
      return null;
    }
    let k = a.userFacingName(undefined) === "" ? undefined : u;
    let I;
    if (t[25] !== g) {
      I = null;
      t[25] = g;
      t[26] = I;
    } else {
      I = t[26];
    }
    let O;
    if (t[27] !== _) {
      O = _ && xLe.jsx(Vn, {
        height: 1,
        children: xLe.jsx(Text, {
          dimColor: true,
          children: "Allowed by auto mode classifier"
        })
      });
      t[27] = _;
      t[28] = O;
    } else {
      O = t[28];
    }
    let M;
    if (t[29] !== x || t[30] !== k || t[31] !== I || t[32] !== O) {
      M = xLe.jsxs(gXd, {
        flexDirection: "column",
        width: k,
        children: [x, I, O]
      });
      t[29] = x;
      t[30] = k;
      t[31] = I;
      t[32] = O;
      t[33] = M;
    } else {
      M = t[33];
    }
    let L;
    if (t[34] !== d || t[35] !== r || t[36] !== o || t[37] !== c) {
      L = xLe.jsx(vKe, {
        children: xLe.jsx(BQn, {
          hookEvent: "PostToolUse",
          lookups: r,
          toolUseID: o,
          verbose: c,
          isTranscriptMode: d
        })
      });
      t[34] = d;
      t[35] = r;
      t[36] = o;
      t[37] = c;
      t[38] = L;
    } else {
      L = t[38];
    }
    let P;
    if (t[39] !== M || t[40] !== L) {
      P = xLe.jsxs(gXd, {
        flexDirection: "column",
        children: [M, L]
      });
      t[39] = M;
      t[40] = L;
      t[41] = P;
    } else {
      P = t[41];
    }
    return P;
  }
  function iwm(e) {
    return e.isBriefOnly;
  }
  var fEl;
  var H7t;
  var xLe;
  var gEl = __lazy(() => {
    UQn();
    et();
    ho();
    ci();
    Wl();
    IMo();
    fEl = __toESM(pt(), 1);
    H7t = __toESM(ot(), 1);
    xLe = __toESM(ie(), 1);
  });
  function _El(e, t, n) {
    let r = yEl.c(7);
    let o;
    if (r[0] !== n.toolUseByToolUseID || r[1] !== e || r[2] !== t) {
      e: {
        let s = n.toolUseByToolUseID.get(e);
        if (!s) {
          o = null;
          break e;
        }
        let i = Cl(t, s.name);
        if (i) {
          o = {
            tool: i,
            toolUse: s
          };
          break e;
        }
        if (!awm.vZc(s.name)) {
          o = null;
          break e;
        }
        let a = Cl(ilt() ?? [], s.name);
        if (!a) {
          o = null;
          break e;
        }
        let l;
        if (r[4] !== a || r[5] !== s) {
          l = {
            tool: a,
            toolUse: s
          };
          r[4] = a;
          r[5] = s;
          r[6] = l;
        } else {
          l = r[6];
        }
        o = l;
      }
      r[0] = n.toolUseByToolUseID;
      r[1] = e;
      r[2] = t;
      r[3] = o;
    } else {
      o = r[3];
    }
    return o;
  }
  var yEl;
  var awm;
  var bEl = __lazy(() => {
    ci();
    k2();
    yEl = __toESM(pt(), 1);
    awm = new Set(["SendUserMessage"]);
  });
  function TEl(e) {
    let t = SEl.c(30);
    let {
      param: n,
      message: r,
      lookups: o,
      progressMessagesForMessage: s,
      style: i,
      tools: a,
      verbose: l,
      width: c,
      isTranscriptMode: u
    } = e;
    let d = _El(n.tool_use_id, a, o);
    if (!d) {
      return null;
    }
    let p;
    if (typeof n.content === "string" && n.content.startsWith("The user doesn't want to take this action right now. STOP what you are doing and wait for the user to tell you how to proceed.")) {
      let f;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        f = oTt.jsx(cEl, {});
        t[0] = f;
      } else {
        f = t[0];
      }
      p = f;
    } else if (typeof n.content === "string" && (n.content.startsWith("The user doesn't want to proceed with this tool use. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). STOP what you are doing and wait for the user to tell you how to proceed.") || n.content.startsWith(tTt) && d.tool?.renderToolUseRejectedMessage !== undefined) || n.content === "[Request interrupted by user for tool use]") {
      let f = d.toolUse.input;
      let h;
      if (t[1] !== u || t[2] !== o || t[3] !== s || t[4] !== i || t[5] !== f || t[6] !== d.tool || t[7] !== a || t[8] !== l) {
        h = oTt.jsx(pEl, {
          input: f,
          progressMessagesForMessage: s,
          tool: d.tool,
          tools: a,
          lookups: o,
          style: i,
          verbose: l,
          isTranscriptMode: u
        });
        t[1] = u;
        t[2] = o;
        t[3] = s;
        t[4] = i;
        t[5] = f;
        t[6] = d.tool;
        t[7] = a;
        t[8] = l;
        t[9] = h;
      } else {
        h = t[9];
      }
      p = h;
    } else if (n.is_error) {
      let f;
      if (t[10] !== u || t[11] !== n || t[12] !== s || t[13] !== d.tool || t[14] !== a || t[15] !== l) {
        f = oTt.jsx(lZn, {
          progressMessagesForMessage: s,
          tool: d.tool,
          tools: a,
          param: n,
          verbose: l,
          isTranscriptMode: u
        });
        t[10] = u;
        t[11] = n;
        t[12] = s;
        t[13] = d.tool;
        t[14] = a;
        t[15] = l;
        t[16] = f;
      } else {
        f = t[16];
      }
      p = f;
    } else {
      let f;
      if (t[17] !== u || t[18] !== o || t[19] !== r || t[20] !== s || t[21] !== i || t[22] !== d.tool || t[23] !== d.toolUse.id || t[24] !== a || t[25] !== l || t[26] !== c) {
        f = oTt.jsx(hEl, {
          message: r,
          lookups: o,
          toolUseID: d.toolUse.id,
          progressMessagesForMessage: s,
          style: i,
          tool: d.tool,
          tools: a,
          verbose: l,
          width: c,
          isTranscriptMode: u
        });
        t[17] = u;
        t[18] = o;
        t[19] = r;
        t[20] = s;
        t[21] = i;
        t[22] = d.tool;
        t[23] = d.toolUse.id;
        t[24] = a;
        t[25] = l;
        t[26] = c;
        t[27] = f;
      } else {
        f = t[27];
      }
      p = f;
    }
    let m;
    if (t[28] !== p) {
      m = oTt.jsx(gXd, {
        flexDirection: "column",
        children: p
      });
      t[28] = p;
      t[29] = m;
    } else {
      m = t[29];
    }
    return m;
  }
  var SEl;
  var oTt;
  var EEl = __lazy(() => {
    et();
    ro();
    uEl();
    iNo();
    mEl();
    gEl();
    bEl();
    SEl = __toESM(pt(), 1);
    oTt = __toESM(ie(), 1);
  });
  function cwm(e) {
    let t = gZn.c(120);
    let {
      message: n,
      lookups: r,
      containerWidth: o,
      addMargin: s,
      tools: i,
      commands: a,
      verbose: l,
      inProgressToolUseIDs: c,
      progressMessagesForMessage: u,
      shouldAnimate: d,
      shouldShowDot: p,
      style: m,
      width: f,
      isTranscriptMode: h,
      onOpenRateLimitOptions: g,
      isActiveCollapsedGroup: y,
      isUserContinuation: _,
      latestBashOutputUUID: b,
      disableDisplayOverride: S
    } = e;
    let E = _ === undefined ? false : _;
    switch (n.type) {
      case "attachment":
        {
          if (n.attachment.type === "queued_command" && n.attachment.origin?.kind === "peer" && n.attachment.origin.senderTaskId !== undefined) {
            let k = n.attachment.prompt;
            let I;
            if (t[0] !== k) {
              I = typeof k === "string" ? k : k.filter(dwm).map(uwm).join(`
`);
              t[0] = k;
              t[1] = I;
            } else {
              I = t[1];
            }
            let O = I;
            let M = o ?? "100%";
            let L;
            if (t[2] !== O) {
              L = {
                text: O,
                type: "text"
              };
              t[2] = O;
              t[3] = L;
            } else {
              L = t[3];
            }
            let P;
            if (t[4] !== s || t[5] !== h || t[6] !== n.attachment.origin.from || t[7] !== L) {
              P = vT.jsx(cNo, {
                addMargin: s,
                param: L,
                fromName: n.attachment.origin.from,
                isTranscriptMode: h
              });
              t[4] = s;
              t[5] = h;
              t[6] = n.attachment.origin.from;
              t[7] = L;
              t[8] = P;
            } else {
              P = t[8];
            }
            let F;
            if (t[9] !== M || t[10] !== P) {
              F = vT.jsx(gXd, {
                flexDirection: "column",
                width: M,
                children: P
              });
              t[9] = M;
              t[10] = P;
              t[11] = F;
            } else {
              F = t[11];
            }
            return F;
          }
          let C = o ?? "100%";
          let x;
          if (t[12] !== s || t[13] !== h || t[14] !== n.attachment || t[15] !== l) {
            x = vT.jsx(gTl, {
              addMargin: s,
              attachment: n.attachment,
              verbose: l,
              isTranscriptMode: h
            });
            t[12] = s;
            t[13] = h;
            t[14] = n.attachment;
            t[15] = l;
            t[16] = x;
          } else {
            x = t[16];
          }
          let A;
          if (t[17] !== C || t[18] !== x) {
            A = vT.jsx(gXd, {
              flexDirection: "column",
              width: C,
              children: x
            });
            t[17] = C;
            t[18] = x;
            t[19] = A;
          } else {
            A = t[19];
          }
          return A;
        }
      case "assistant":
        {
          let C;
          if (t[20] !== r.firstTextBlockUuidByMessageID || t[21] !== n.message.id) {
            C = r.firstTextBlockUuidByMessageID.get(n.message.id);
            t[20] = r.firstTextBlockUuidByMessageID;
            t[21] = n.message.id;
            t[22] = C;
          } else {
            C = t[22];
          }
          let x = C;
          let A = o ?? "100%";
          let k;
          if (t[23] !== s || t[24] !== a || t[25] !== S || t[26] !== x || t[27] !== c || t[28] !== h || t[29] !== r || t[30] !== n.advisorModel || t[31] !== n.message.content || t[32] !== n.message.id || t[33] !== n.uuid || t[34] !== g || t[35] !== u || t[36] !== d || t[37] !== p || t[38] !== i || t[39] !== l || t[40] !== f) {
            let O;
            if (t[42] !== s || t[43] !== a || t[44] !== S || t[45] !== x || t[46] !== c || t[47] !== h || t[48] !== r || t[49] !== n.advisorModel || t[50] !== n.message.id || t[51] !== n.uuid || t[52] !== g || t[53] !== u || t[54] !== d || t[55] !== p || t[56] !== i || t[57] !== l || t[58] !== f) {
              O = (M, L) => vT.jsx(mwm, {
                param: M,
                addMargin: s,
                tools: i,
                commands: a,
                verbose: l,
                inProgressToolUseIDs: c,
                progressMessagesForMessage: u,
                shouldAnimate: d,
                shouldShowDot: p,
                width: f,
                inProgressToolCallCount: c.size,
                isTranscriptMode: h,
                lookups: r,
                onOpenRateLimitOptions: g,
                advisorModel: n.advisorModel,
                messageUuid: n.uuid,
                apiMessageId: S ? undefined : n.message.id,
                isFirstTextBlock: x === undefined || x === n.uuid
              }, L);
              t[42] = s;
              t[43] = a;
              t[44] = S;
              t[45] = x;
              t[46] = c;
              t[47] = h;
              t[48] = r;
              t[49] = n.advisorModel;
              t[50] = n.message.id;
              t[51] = n.uuid;
              t[52] = g;
              t[53] = u;
              t[54] = d;
              t[55] = p;
              t[56] = i;
              t[57] = l;
              t[58] = f;
              t[59] = O;
            } else {
              O = t[59];
            }
            k = n.message.content.map(O);
            t[23] = s;
            t[24] = a;
            t[25] = S;
            t[26] = x;
            t[27] = c;
            t[28] = h;
            t[29] = r;
            t[30] = n.advisorModel;
            t[31] = n.message.content;
            t[32] = n.message.id;
            t[33] = n.uuid;
            t[34] = g;
            t[35] = u;
            t[36] = d;
            t[37] = p;
            t[38] = i;
            t[39] = l;
            t[40] = f;
            t[41] = k;
          } else {
            k = t[41];
          }
          let I;
          if (t[60] !== A || t[61] !== k) {
            I = vT.jsx(gXd, {
              flexDirection: "column",
              width: A,
              children: k
            });
            t[60] = A;
            t[61] = k;
            t[62] = I;
          } else {
            I = t[62];
          }
          return I;
        }
      case "user":
        {
          if (n.isCompactSummary) {
            let L = h ? "transcript" : "prompt";
            let P;
            if (t[63] !== n || t[64] !== L) {
              P = vT.jsx(ebl, {
                message: n,
                screen: L
              });
              t[63] = n;
              t[64] = L;
              t[65] = P;
            } else {
              P = t[65];
            }
            return P;
          }
          let C;
          if (t[66] !== n.imagePasteIds || t[67] !== n.message.content) {
            C = [];
            let L = 0;
            for (let P of n.message.content) {
              if (P.type === "image") {
                let F = n.imagePasteIds?.[L];
                L++;
                C.push(F ?? L);
              } else {
                C.push(L);
              }
            }
            t[66] = n.imagePasteIds;
            t[67] = n.message.content;
            t[68] = C;
          } else {
            C = t[68];
          }
          let x = b === n.uuid;
          let A = o ?? "100%";
          let k;
          if (t[69] !== s || t[70] !== C || t[71] !== h || t[72] !== E || t[73] !== r || t[74] !== n || t[75] !== u || t[76] !== m || t[77] !== i || t[78] !== l) {
            k = n.message.content.map((L, P) => vT.jsx(pwm, {
              message: n,
              addMargin: s,
              tools: i,
              progressMessagesForMessage: u,
              param: L,
              style: m,
              verbose: l,
              imageIndex: C[P],
              isUserContinuation: E,
              lookups: r,
              isTranscriptMode: h
            }, P));
            t[69] = s;
            t[70] = C;
            t[71] = h;
            t[72] = E;
            t[73] = r;
            t[74] = n;
            t[75] = u;
            t[76] = m;
            t[77] = i;
            t[78] = l;
            t[79] = k;
          } else {
            k = t[79];
          }
          let I;
          if (t[80] !== A || t[81] !== k) {
            I = vT.jsx(gXd, {
              flexDirection: "column",
              width: A,
              children: k
            });
            t[80] = A;
            t[81] = k;
            t[82] = I;
          } else {
            I = t[82];
          }
          let O = I;
          let M;
          if (t[83] !== O || t[84] !== x) {
            M = x ? vT.jsx(OPa, {
              children: O
            }) : O;
            t[83] = O;
            t[84] = x;
            t[85] = M;
          } else {
            M = t[85];
          }
          return M;
        }
      case "system":
        {
          if (n.subtype === "compact_boundary") {
            if (qs()) {
              return null;
            }
            let x;
            if (t[86] === Symbol.for("react.memo_cache_sentinel")) {
              x = vT.jsx(KTl, {});
              t[86] = x;
            } else {
              x = t[86];
            }
            return x;
          }
          if (n.subtype === "microcompact_boundary") {
            return null;
          }
          if (n.subtype === "read_divider") {
            let x;
            if (t[90] !== n.content) {
              x = vT.jsx(gXd, {
                marginTop: 1,
                width: "100%",
                children: vT.jsx(mS, {
                  title: n.content,
                  color: "inactive"
                })
              });
              t[90] = n.content;
              t[91] = x;
            } else {
              x = t[91];
            }
            return x;
          }
          if (n.subtype === "local_command") {
            let x;
            if (t[92] !== n.content) {
              x = {
                type: "text",
                text: n.content
              };
              t[92] = n.content;
              t[93] = x;
            } else {
              x = t[93];
            }
            let A;
            if (t[94] !== s || t[95] !== h || t[96] !== x || t[97] !== l) {
              A = vT.jsx(RKe, {
                addMargin: s,
                param: x,
                verbose: l,
                isTranscriptMode: h
              });
              t[94] = s;
              t[95] = h;
              t[96] = x;
              t[97] = l;
              t[98] = A;
            } else {
              A = t[98];
            }
            return A;
          }
          let C;
          if (t[99] !== s || t[100] !== h || t[101] !== n || t[102] !== l) {
            C = vT.jsx(oEl, {
              message: n,
              addMargin: s,
              verbose: l,
              isTranscriptMode: h
            });
            t[99] = s;
            t[100] = h;
            t[101] = n;
            t[102] = l;
            t[103] = C;
          } else {
            C = t[103];
          }
          return C;
        }
      case "grouped_tool_use":
        {
          let C;
          if (t[104] !== s || t[105] !== c || t[106] !== r || t[107] !== n || t[108] !== d || t[109] !== i) {
            C = vT.jsx(JTl, {
              message: n,
              tools: i,
              lookups: r,
              inProgressToolUseIDs: c,
              shouldAnimate: d,
              addMargin: s
            });
            t[104] = s;
            t[105] = c;
            t[106] = r;
            t[107] = n;
            t[108] = d;
            t[109] = i;
            t[110] = C;
          } else {
            C = t[110];
          }
          return C;
        }
      case "collapsed_read_search":
        {
          let C = l || h;
          let x;
          if (t[111] !== s || t[112] !== c || t[113] !== y || t[114] !== r || t[115] !== n || t[116] !== d || t[117] !== C || t[118] !== i) {
            x = vT.jsx(IM, {
              children: vT.jsx(GTl, {
                message: n,
                inProgressToolUseIDs: c,
                shouldAnimate: d,
                verbose: C,
                tools: i,
                lookups: r,
                isActiveGroup: y,
                addMargin: s
              })
            });
            t[111] = s;
            t[112] = c;
            t[113] = y;
            t[114] = r;
            t[115] = n;
            t[116] = d;
            t[117] = C;
            t[118] = i;
            t[119] = x;
          } else {
            x = t[119];
          }
          return x;
        }
    }
  }
  function uwm(e) {
    return e.text;
  }
  function dwm(e) {
    return e.type === "text";
  }
  function pwm(e) {
    let t = gZn.c(25);
    let {
      message: n,
      addMargin: r,
      tools: o,
      progressMessagesForMessage: s,
      param: i,
      style: a,
      verbose: l,
      imageIndex: c,
      isUserContinuation: u,
      lookups: d,
      isTranscriptMode: p
    } = e;
    let {
      columns: m
    } = Sr();
    switch (i.type) {
      case "text":
        {
          if (n.origin?.kind === "peer" && n.origin.senderTaskId !== undefined) {
            let h;
            if (t[0] !== r || t[1] !== p || t[2] !== n.origin.from || t[3] !== i) {
              h = vT.jsx(cNo, {
                addMargin: r,
                param: i,
                fromName: n.origin.from,
                isTranscriptMode: p
              });
              t[0] = r;
              t[1] = p;
              t[2] = n.origin.from;
              t[3] = i;
              t[4] = h;
            } else {
              h = t[4];
            }
            return h;
          }
          let f;
          if (t[5] !== r || t[6] !== p || t[7] !== n.planContent || t[8] !== n.timestamp || t[9] !== i || t[10] !== l) {
            f = vT.jsx(RKe, {
              addMargin: r,
              param: i,
              verbose: l,
              planContent: n.planContent,
              isTranscriptMode: p,
              timestamp: n.timestamp
            });
            t[5] = r;
            t[6] = p;
            t[7] = n.planContent;
            t[8] = n.timestamp;
            t[9] = i;
            t[10] = l;
            t[11] = f;
          } else {
            f = t[11];
          }
          return f;
        }
      case "image":
        {
          let f = r && !u;
          let h;
          if (t[12] !== c || t[13] !== f) {
            h = vT.jsx(GQn, {
              imageId: c,
              addMargin: f
            });
            t[12] = c;
            t[13] = f;
            t[14] = h;
          } else {
            h = t[14];
          }
          return h;
        }
      case "tool_result":
        {
          let f = m - 5;
          let h;
          if (t[15] !== p || t[16] !== d || t[17] !== n || t[18] !== i || t[19] !== s || t[20] !== a || t[21] !== f || t[22] !== o || t[23] !== l) {
            h = vT.jsx(TEl, {
              param: i,
              message: n,
              lookups: d,
              progressMessagesForMessage: s,
              style: a,
              tools: o,
              verbose: l,
              width: f,
              isTranscriptMode: p
            });
            t[15] = p;
            t[16] = d;
            t[17] = n;
            t[18] = i;
            t[19] = s;
            t[20] = a;
            t[21] = f;
            t[22] = o;
            t[23] = l;
            t[24] = h;
          } else {
            h = t[24];
          }
          return h;
        }
      default:
        return;
    }
  }
  function mwm(e) {
    let t = gZn.c(62);
    let {
      param: n,
      addMargin: r,
      tools: o,
      commands: s,
      verbose: i,
      inProgressToolUseIDs: a,
      progressMessagesForMessage: l,
      shouldAnimate: c,
      shouldShowDot: u,
      width: d,
      inProgressToolCallCount: p,
      isTranscriptMode: m,
      lookups: f,
      onOpenRateLimitOptions: h,
      advisorModel: g,
      messageUuid: y,
      apiMessageId: _,
      isFirstTextBlock: b
    } = e;
    let S;
    if (t[0] !== _ || t[1] !== n.type) {
      S = C => n.type === "text" && _ !== undefined ? C.displayedMessageContent[_] : undefined;
      t[0] = _;
      t[1] = n.type;
      t[2] = S;
    } else {
      S = t[2];
    }
    let E = fw(S);
    if (nq(n)) {
      return null;
    }
    switch (n.type) {
      case "tool_use":
        {
          let C;
          if (t[15] !== r || t[16] !== s || t[17] !== p || t[18] !== a || t[19] !== m || t[20] !== f || t[21] !== y || t[22] !== n || t[23] !== l || t[24] !== c || t[25] !== u || t[26] !== o || t[27] !== i) {
            C = vT.jsx(pSl, {
              param: n,
              addMargin: r,
              tools: o,
              commands: s,
              verbose: i,
              inProgressToolUseIDs: a,
              progressMessagesForMessage: l,
              shouldAnimate: c,
              shouldShowDot: u,
              inProgressToolCallCount: p,
              lookups: f,
              isTranscriptMode: m,
              messageUuid: y
            });
            t[15] = r;
            t[16] = s;
            t[17] = p;
            t[18] = a;
            t[19] = m;
            t[20] = f;
            t[21] = y;
            t[22] = n;
            t[23] = l;
            t[24] = c;
            t[25] = u;
            t[26] = o;
            t[27] = i;
            t[28] = C;
          } else {
            C = t[28];
          }
          return C;
        }
      case "text":
        {
          if (E !== undefined && !i) {
            if (!b) {
              return null;
            }
            let x;
            if (t[29] !== E) {
              x = {
                type: "text",
                text: E
              };
              t[29] = E;
              t[30] = x;
            } else {
              x = t[30];
            }
            let A;
            if (t[31] !== r || t[32] !== y || t[33] !== h || t[34] !== u || t[35] !== x || t[36] !== i || t[37] !== d) {
              A = vT.jsx(TMo, {
                param: x,
                addMargin: r,
                shouldShowDot: u,
                verbose: i,
                width: d,
                onOpenRateLimitOptions: h,
                messageUuid: y
              });
              t[31] = r;
              t[32] = y;
              t[33] = h;
              t[34] = u;
              t[35] = x;
              t[36] = i;
              t[37] = d;
              t[38] = A;
            } else {
              A = t[38];
            }
            return A;
          }
          let C;
          if (t[39] !== r || t[40] !== y || t[41] !== h || t[42] !== n || t[43] !== u || t[44] !== i || t[45] !== d) {
            C = vT.jsx(TMo, {
              param: n,
              addMargin: r,
              shouldShowDot: u,
              verbose: i,
              width: d,
              onOpenRateLimitOptions: h,
              messageUuid: y
            });
            t[39] = r;
            t[40] = y;
            t[41] = h;
            t[42] = n;
            t[43] = u;
            t[44] = i;
            t[45] = d;
            t[46] = C;
          } else {
            C = t[46];
          }
          return C;
        }
      case "redacted_thinking":
        {
          if (!m && !i) {
            return null;
          }
          let C;
          if (t[47] !== r) {
            C = vT.jsx(dbl, {
              addMargin: r
            });
            t[47] = r;
            t[48] = C;
          } else {
            C = t[48];
          }
          return C;
        }
      case "thinking":
        {
          if (!m && !i) {
            return null;
          }
          let C;
          if (t[49] !== r || t[50] !== m || t[51] !== n || t[52] !== i) {
            C = vT.jsx(NQn, {
              addMargin: r,
              param: n,
              isTranscriptMode: m,
              verbose: i
            });
            t[49] = r;
            t[50] = m;
            t[51] = n;
            t[52] = i;
            t[53] = C;
          } else {
            C = t[53];
          }
          return C;
        }
      case "server_tool_use":
      case "advisor_tool_result":
        {
          if (a5e(n)) {
            let C = i || m;
            let x;
            if (t[54] !== r || t[55] !== g || t[56] !== f.erroredToolUseIDs || t[57] !== f.resolvedToolUseIDs || t[58] !== n || t[59] !== c || t[60] !== C) {
              x = vT.jsx(lbl, {
                block: n,
                addMargin: r,
                resolvedToolUseIDs: f.resolvedToolUseIDs,
                erroredToolUseIDs: f.erroredToolUseIDs,
                shouldAnimate: c,
                verbose: C,
                advisorModel: g
              });
              t[54] = r;
              t[55] = g;
              t[56] = f.erroredToolUseIDs;
              t[57] = f.resolvedToolUseIDs;
              t[58] = n;
              t[59] = c;
              t[60] = C;
              t[61] = x;
            } else {
              x = t[61];
            }
            return x;
          }
          Oe(Error(`Unable to render server tool block: ${n.type}`));
          return null;
        }
      default:
        Oe(Error(`Unable to render message type: ${n.type}`));
        return null;
    }
  }
  function fwm(e, t) {
    if (e.message.uuid !== t.message.uuid) {
      return false;
    }
    if (e.verbose !== t.verbose) {
      return false;
    }
    let n = e.latestBashOutputUUID === e.message.uuid;
    let r = t.latestBashOutputUUID === t.message.uuid;
    if (n !== r) {
      return false;
    }
    if (e.isTranscriptMode !== t.isTranscriptMode) {
      return false;
    }
    if (e.containerWidth !== t.containerWidth) {
      return false;
    }
    if (e.isStatic && t.isStatic) {
      let o = e.message.type === "system" && e.message.subtype === "turn_duration" ? e.message.briefHiddenCount : undefined;
      let s = t.message.type === "system" && t.message.subtype === "turn_duration" ? t.message.briefHiddenCount : undefined;
      return o === s;
    }
    return false;
  }
  var gZn;
  var vEl;
  var vT;
  var dZ;
  var sTt = __lazy(() => {
    ki();
    et();
    ho();
    UV();
    zp();
    Rn();
    tbl();
    oX();
    cbl();
    pbl();
    zbl();
    EMo();
    mSl();
    _Tl();
    VTl();
    YTl();
    XTl();
    sEl();
    aEl();
    FMo();
    nZn();
    EEl();
    xEe();
    ogo();
    gZn = __toESM(pt(), 1);
    vEl = __toESM(ot(), 1);
    vT = __toESM(ie(), 1);
    dZ = vEl.memo(cwm, fwm);
  });
  function hwm() {
    return `${"You are an agent for Claude Code, Anthropic's official CLI for Claude. Given the user's message, you should use the tools available to complete the task. Complete the task fully\u2014don't gold-plate, but don't leave it half-done."} When you complete the task, respond with a concise report covering what was done and any key findings \u2014 the caller will relay this to the user, so it only needs the essentials.

${`Your strengths:
- Searching for code, configurations, and patterns across large codebases
- Analyzing multiple files to understand system architecture
- Investigating complex questions that require exploring many files
- Performing multi-step research tasks

Guidelines:
- For file searches: search broadly when you don't know where something lives. Use Read when you know the specific file path.
- For analysis: Start broad and narrow down. Use multiple search strategies if the first doesn't yield results.
- Be thorough: Check multiple locations, consider different naming conventions, look for related files.
- NEVER create files unless they're absolutely necessary for achieving your goal. ALWAYS prefer editing an existing file to creating a new one.
- NEVER proactively create documentation files (*.md) or README files. Only create documentation files if explicitly requested.`}`;
  }
  var Kve;
  var j7t = __lazy(() => {
    Kve = {
      agentType: "general-purpose",
      whenToUse: "General-purpose agent for researching complex questions, searching for code, and executing multi-step tasks. When you are searching for a keyword or file and are not confident that you will find the right match in the first few tries use this agent to perform the search for you.",
      tools: ["*"],
      source: "built-in",
      baseDir: "built-in",
      getSystemPrompt: hwm
    };
  });
  function A3(e) {
    if (!("message" in e)) {
      return false;
    }
    let t = e.message;
    return t != null && typeof t === "object" && "type" in t;
  }
  function xEl(e) {
    let t = e.data.message.message.content[0];
    return t?.type === "tool_use" || t?.type === "tool_result";
  }
  function kEl(e, t, n) {
    if (!A3(e.data)) {
      return null;
    }
    let r = e.data.message;
    if (r.type === "assistant") {
      return M6t(r.message.content[0], t);
    }
    if (r.type === "user") {
      let o = r.message.content[0];
      if (o?.type === "tool_result") {
        let s = n.get(o.tool_use_id);
        if (s) {
          return M6t(s, t);
        }
      }
    }
    return null;
  }
  function gwm(e, t, n) {
    return e.filter(l => A3(l.data) && l.data.message.type !== "user").map(l => ({
      type: "original",
      message: l
    }));
    function s(l) {
      if (o && (o.searchCount > 0 || o.readCount > 0 || o.replCount > 0)) {
        r.push({
          type: "summary",
          searchCount: o.searchCount,
          readCount: o.readCount,
          replCount: o.replCount,
          uuid: `summary-${o.startUuid}`,
          isActive: l
        });
      }
      o = null;
    }
  }
  function q7t(e) {
    let t = yZn.c(3);
    let {
      prompt: n,
      dim: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = ha.jsx(Text, {
        color: "success",
        bold: true,
        children: "Prompt:"
      });
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== n) {
      s = ha.jsxs(gXd, {
        flexDirection: "column",
        children: [o, ha.jsx(gXd, {
          paddingLeft: 2,
          children: ha.jsx(cy, {
            children: n
          })
        })]
      });
      t[1] = n;
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  function dNo(e) {
    let t = yZn.c(5);
    let {
      content: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = ha.jsx(Text, {
        color: "success",
        bold: true,
        children: "Response:"
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = n.map(bwm);
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== o) {
      s = ha.jsxs(gXd, {
        flexDirection: "column",
        children: [r, o]
      });
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function bwm(e, t) {
    return ha.jsx(gXd, {
      paddingLeft: 2,
      marginTop: t === 0 ? 0 : 1,
      children: ha.jsx(cy, {
        children: e.text
      })
    }, t);
  }
  function Swm(e) {
    let t = yZn.c(15);
    let {
      progressMessages: n,
      tools: r,
      verbose: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = G7t(n.filter(vwm).map(Ewm));
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let {
      lookups: i,
      inProgressToolUseIDs: a
    } = s;
    let l;
    if (t[2] !== i || t[3] !== a || t[4] !== n || t[5] !== r || t[6] !== o) {
      let u = n.filter(Twm);
      let d;
      if (t[8] !== i || t[9] !== a || t[10] !== r || t[11] !== o) {
        d = p => ha.jsx(Vn, {
          height: 1,
          children: ha.jsx(dZ, {
            message: p.data.message,
            lookups: i,
            addMargin: false,
            tools: r,
            commands: [],
            verbose: o,
            inProgressToolUseIDs: a,
            progressMessagesForMessage: [],
            shouldAnimate: false,
            shouldShowDot: false,
            isTranscriptMode: false,
            isStatic: true
          })
        }, p.uuid);
        t[8] = i;
        t[9] = a;
        t[10] = r;
        t[11] = o;
        t[12] = d;
      } else {
        d = t[12];
      }
      l = u.map(d);
      t[2] = i;
      t[3] = a;
      t[4] = n;
      t[5] = r;
      t[6] = o;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[13] !== l) {
      c = ha.jsx(ha.Fragment, {
        children: l
      });
      t[13] = l;
      t[14] = c;
    } else {
      c = t[14];
    }
    return c;
  }
  function Twm(e) {
    if (!A3(e.data)) {
      return false;
    }
    let t = e.data.message;
    if (t.type === "user" && t.toolUseResult === undefined) {
      return false;
    }
    return true;
  }
  function Ewm(e) {
    return e.data;
  }
  function vwm(e) {
    return A3(e.data);
  }
  function AEl(e, t, {
    tools: n,
    verbose: r,
    theme: o,
    isTranscriptMode: s = false
  }) {
    let i = e;
    if (i.status === "remote_launched") {
      return ha.jsx(gXd, {
        flexDirection: "column",
        children: ha.jsx(Vn, {
          height: 1,
          children: ha.jsxs(Text, {
            children: ["Cloud agent launched", " ", ha.jsxs(Text, {
              dimColor: true,
              children: ["\xB7 ", i.taskId, " \xB7 ", i.sessionUrl]
            })]
          })
        })
      });
    }
    if (e.status === "async_launched") {
      let {
        prompt: g
      } = e;
      return ha.jsxs(gXd, {
        flexDirection: "column",
        children: [ha.jsx(Vn, {
          height: 1,
          children: ha.jsxs(Text, {
            children: ["Backgrounded agent", !s && ha.jsxs(Text, {
              dimColor: true,
              children: [" (", ha.jsxs(Hn, {
                children: [ha.jsx(xt, {
                  chord: "down",
                  action: "manage"
                }), g && ha.jsx(Wr, {
                  action: "app:toggleTranscript",
                  context: "Global",
                  fallback: "ctrl+o",
                  description: "expand"
                })]
              }), ")"]
            })]
          })
        }), s && g && ha.jsx(Vn, {
          children: ha.jsx(q7t, {
            prompt: g,
            theme: o
          })
        })]
      });
    }
    if (e.status !== "completed") {
      return null;
    }
    let {
      totalDurationMs: a,
      totalToolUseCount: l,
      totalTokens: c,
      usage: u,
      content: d,
      prompt: p
    } = e;
    let f = `Done (${[l === 1 ? "1 tool use" : `${l} tool uses`, formatNumber(c) + " tokens", formatDuration(a)].join(" \xB7 ")})`;
    let h = ST({
      content: f,
      usage: {
        ...u,
        inference_geo: null,
        iterations: null,
        speed: null
      }
    });
    return ha.jsxs(gXd, {
      flexDirection: "column",
      children: [s && p && ha.jsx(Vn, {
        children: ha.jsx(q7t, {
          prompt: p,
          theme: o
        })
      }), s ? ha.jsx(_Gt, {
        children: ha.jsx(Swm, {
          progressMessages: t,
          tools: n,
          verbose: r
        })
      }) : null, s && d && d.length > 0 && ha.jsx(Vn, {
        children: ha.jsx(dNo, {
          content: d,
          theme: o
        })
      }), ha.jsx(Vn, {
        height: 1,
        children: ha.jsx(dZ, {
          message: h,
          lookups: Yve,
          addMargin: false,
          tools: n,
          commands: [],
          verbose: r,
          inProgressToolUseIDs: new Set(),
          progressMessagesForMessage: [],
          shouldAnimate: false,
          shouldShowDot: false,
          isTranscriptMode: false,
          isStatic: true
        })
      }), !s && ha.jsxs(Text, {
        dimColor: true,
        children: ["  ", ha.jsx(wv, {})]
      })]
    });
  }
  function IEl({
    description: e,
    prompt: t
  }) {
    if (!e || !t) {
      return null;
    }
    return e.replace(/\s+/g, " ").trim();
  }
  function wwm(e) {
    let t = e?.progressMessages?.findLast(o => o.data.type === "agent_progress" && typeof o.data.resolvedModel === "string");
    if (t) {
      return t.data.resolvedModel;
    }
    let n = e?.toolUseResult;
    if (!n || typeof n !== "object") {
      return;
    }
    let r = n;
    if (typeof r.resolvedModel === "string") {
      return r.resolvedModel;
    }
    if (r.status === "teammate_spawned" && typeof r.model === "string") {
      return parseUserSpecifiedModel(r.model);
    }
    return;
  }
  function PEl(e, t) {
    let n = [];
    if (e.model && e.model !== "inherit") {
      let r = wwm(t);
      if (r) {
        let o = getMainLoopModel();
        let s = parseUserSpecifiedModel(e.model);
        if (r !== o || s !== r) {
          n.push(ha.jsx(gXd, {
            flexWrap: "nowrap",
            marginLeft: 1,
            children: ha.jsx(Text, {
              dimColor: true,
              children: renderModelName(r)
            })
          }, "model"));
        }
      }
    }
    if (n.length === 0) {
      return null;
    }
    return ha.jsx(ha.Fragment, {
      children: n
    });
  }
  function kLe(e, {
    tools: t,
    verbose: n,
    terminalSize: r,
    inProgressToolCallCount: o,
    isTranscriptMode: s = false
  }) {
    if (!e.length) {
      return ha.jsx(Vn, {
        height: 1,
        children: ha.jsx(Text, {
          dimColor: true,
          children: "Initializing\u2026"
        })
      });
    }
    let i = (o ?? 1) * 9 + 7;
    let a = !s && r && r.rows && r.rows < i;
    let l = () => {
      let y = Bn(e, S => {
        if (!A3(S.data)) {
          return false;
        }
        return S.data.message.message.content.some(C => C.type === "tool_use");
      });
      let _ = e.findLast(S => A3(S.data) && S.data.message.type === "assistant");
      let b = null;
      if (_?.data.message.type === "assistant") {
        let S = _.data.message.message.usage;
        b = (S.cache_creation_input_tokens ?? 0) + (S.cache_read_input_tokens ?? 0) + S.input_tokens + S.output_tokens;
      }
      return {
        toolUseCount: y,
        tokens: b
      };
    };
    if (a) {
      let {
        toolUseCount: y,
        tokens: _
      } = l();
      return ha.jsx(Vn, {
        height: 1,
        children: ha.jsxs(Text, {
          dimColor: true,
          children: ["In progress\u2026 \xB7 ", ha.jsx(Text, {
            bold: true,
            children: y
          }), " tool", " ", y === 1 ? "use" : "uses", _ && ` \xB7 ${formatNumber(_)} tokens`, " \xB7", " ", ha.jsx(Wr, {
            action: "app:toggleTranscript",
            context: "Global",
            fallback: "ctrl+o",
            description: "expand",
            parens: true
          })]
        })
      });
    }
    let c = gwm(e, t, true);
    let u = s ? c : c.slice(-3);
    let d = s ? [] : c.slice(0, Math.max(0, c.length - 3));
    let p = Bn(d, y => {
      if (y.type === "summary") {
        return y.searchCount + y.readCount + y.replCount > 0;
      }
      let _ = y.message.data;
      if (!A3(_)) {
        return false;
      }
      return _.message.message.content.some(b => b.type === "tool_use");
    });
    let m = e[0]?.data;
    let f = m && A3(m) ? m.prompt : undefined;
    if (u.length === 0 && !(s && f)) {
      return ha.jsx(Vn, {
        height: 1,
        children: ha.jsx(Text, {
          dimColor: true,
          children: "Initializing\u2026"
        })
      });
    }
    let {
      lookups: h,
      inProgressToolUseIDs: g
    } = G7t(e.filter(y => A3(y.data)).map(y => y.data));
    return ha.jsx(Vn, {
      children: ha.jsxs(gXd, {
        flexDirection: "column",
        children: [ha.jsxs(_Gt, {
          children: [s && f && ha.jsx(gXd, {
            marginBottom: 1,
            children: ha.jsx(q7t, {
              prompt: f
            })
          }), u.map(y => {
            if (y.type === "summary") {
              let _ = n5n(y.searchCount, y.readCount, y.isActive, y.replCount);
              return ha.jsx(gXd, {
                height: 1,
                overflow: "hidden",
                children: ha.jsx(Text, {
                  dimColor: true,
                  children: _
                })
              }, y.uuid);
            }
            return ha.jsx(dZ, {
              message: y.message.data.message,
              lookups: h,
              addMargin: false,
              tools: t,
              commands: [],
              verbose: n,
              inProgressToolUseIDs: g,
              progressMessagesForMessage: [],
              shouldAnimate: false,
              shouldShowDot: false,
              style: "condensed",
              isTranscriptMode: false,
              isStatic: true
            }, y.message.uuid);
          })]
        }), ha.jsx(B1, {
          count: p,
          unit: "tool use",
          expandable: true
        })]
      })
    });
  }
  function OEl(e, {
    progressMessagesForMessage: t,
    tools: n,
    verbose: r,
    isTranscriptMode: o
  }) {
    return ha.jsxs(ha.Fragment, {
      children: [kLe(t, {
        tools: n,
        verbose: r,
        isTranscriptMode: o
      }), ha.jsx(jme, {})]
    });
  }
  function DEl(e, {
    progressMessagesForMessage: t,
    tools: n,
    verbose: r,
    isTranscriptMode: o
  }) {
    return ha.jsxs(ha.Fragment, {
      children: [kLe(t, {
        tools: n,
        verbose: r,
        isTranscriptMode: o
      }), ha.jsx(Rw, {
        result: e,
        verbose: r
      })]
    });
  }
  function Cwm(e) {
    let t = Bn(e, o => {
      if (!A3(o.data)) {
        return false;
      }
      let s = o.data.message;
      return s.type === "user" && s.message.content.some(i => i.type === "tool_result");
    });
    let n = e.findLast(o => A3(o.data) && o.data.message.type === "assistant");
    let r = null;
    if (n?.data.message.type === "assistant") {
      let o = n.data.message.message.usage;
      r = (o.cache_creation_input_tokens ?? 0) + (o.cache_read_input_tokens ?? 0) + o.input_tokens + o.output_tokens;
    }
    return {
      toolUseCount: t,
      tokens: r
    };
  }
  function MEl(e, t) {
    let {
      shouldAnimate: n,
      tools: r,
      addMargin: o = true
    } = t;
    let s = e.map(({
      param: p,
      isResolved: m,
      isError: f,
      progressMessages: h,
      result: g
    }) => {
      let y = Cwm(h);
      let _ = Rwm(h, r);
      let b = fNo().safeParse(p.input);
      let S = g?.output?.status === "teammate_spawned";
      let E;
      let C;
      let x;
      let A;
      let k;
      if (S && b.success && b.data.name) {
        E = `@${b.data.name}`;
        let F = b.data.subagent_type;
        C = REl(F) ? F : undefined;
        k = b.data.description?.replace(/\s+/g, " ").trim() || undefined;
        A = REl(F) ? pze(F) : undefined;
      } else {
        E = b.success ? pNo(b.data) : "Agent";
        C = b.success ? b.data.description?.replace(/\s+/g, " ").trim() || undefined : undefined;
        x = b.success ? mNo(b.data) : undefined;
        k = undefined;
      }
      let I = b.success && "run_in_background" in b.data && b.data.run_in_background === true;
      let O = g?.output?.status;
      let L = I || O === "async_launched" || O === "remote_launched" || S;
      let P = b.success ? b.data.name : undefined;
      return {
        id: p.id,
        agentType: E,
        description: C,
        toolUseCount: y.toolUseCount,
        tokens: y.tokens,
        isResolved: m,
        isError: f,
        isAsync: L,
        color: x,
        descriptionColor: A,
        lastToolInfo: _,
        taskDescription: k,
        name: P
      };
    });
    let i = e.some(p => !p.isResolved);
    let a = e.some(p => p.isError);
    let l = !i;
    let c = s.length > 0 && s.every(p => p.agentType === s[0]?.agentType);
    let u = c && s[0]?.agentType !== "Agent" ? s[0]?.agentType : null;
    let d = s.every(p => p.isAsync);
    return ha.jsxs(gXd, {
      flexDirection: "column",
      marginTop: o ? 1 : 0,
      children: [ha.jsxs(gXd, {
        flexDirection: "row",
        children: [ha.jsx(Ose, {
          shouldAnimate: n && i,
          isUnresolved: i,
          isError: a
        }), ha.jsxs(Text, {
          children: [l ? d ? ha.jsxs(ha.Fragment, {
            children: [ha.jsx(Text, {
              bold: true,
              children: e.length
            }), " background agents launched", " ", ha.jsx(Text, {
              dimColor: true,
              children: ha.jsx(xt, {
                chord: "down",
                action: "manage",
                parens: true
              })
            })]
          }) : ha.jsxs(ha.Fragment, {
            children: [ha.jsx(Text, {
              bold: true,
              children: e.length
            }), " ", u ? `${u} agents` : "agents", " finished"]
          }) : ha.jsxs(ha.Fragment, {
            children: ["Running ", ha.jsx(Text, {
              bold: true,
              children: e.length
            }), " ", u ? `${u} agents` : "agents", "\u2026"]
          }), " "]
        }), !d && ha.jsx(wv, {})]
      }), s.map((p, m) => ha.jsx(Y_l, {
        agentType: p.agentType,
        description: p.description,
        descriptionColor: p.descriptionColor,
        taskDescription: p.taskDescription,
        toolUseCount: p.toolUseCount,
        tokens: p.tokens,
        color: p.color,
        isLast: m === s.length - 1,
        isResolved: p.isResolved,
        isError: p.isError,
        isAsync: p.isAsync,
        shouldAnimate: n,
        lastToolInfo: p.lastToolInfo,
        hideType: c,
        name: p.name
      }, p.id))]
    });
  }
  function pNo(e) {
    if (e?.subagent_type && e.subagent_type !== Kve.agentType) {
      if (e.subagent_type === "worker") {
        return "Agent";
      }
      return e.subagent_type;
    }
    return "Agent";
  }
  function mNo(e) {
    if (!e?.subagent_type) {
      return;
    }
    return pze(e.subagent_type);
  }
  function Rwm(e, t) {
    let n = new Map();
    for (let i of e) {
      if (!A3(i.data)) {
        continue;
      }
      if (i.data.message.type === "assistant") {
        for (let a of i.data.message.message.content) {
          if (a.type === "tool_use") {
            n.set(a.id, a);
          }
        }
      }
    }
    let r = 0;
    let o = 0;
    for (let i = e.length - 1; i >= 0; i--) {
      let a = e[i];
      if (!A3(a.data)) {
        continue;
      }
      if (!xEl(a)) {
        continue;
      }
      let l = kEl(a, t, n);
      if (l && (l.isSearch || l.isRead)) {
        if (a.data.message.type === "user") {
          if (l.isSearch) {
            r++;
          } else if (l.isRead) {
            o++;
          }
        }
      } else {
        break;
      }
    }
    if (r + o >= 2) {
      return n5n(r, o, true);
    }
    let s = e.findLast(i => {
      if (!A3(i.data)) {
        return false;
      }
      let a = i.data.message;
      return a.type === "user" && a.message.content.some(l => l.type === "tool_result");
    });
    if (s?.data.message.type === "user") {
      let i = s.data.message.message.content.find(a => a.type === "tool_result");
      if (i?.type === "tool_result") {
        let a = n.get(i.tool_use_id);
        if (a) {
          let l = Cl(t, a.name);
          if (!l) {
            return a.name;
          }
          let c = a.input;
          let u = l.inputSchema.safeParse(c);
          let d = l.userFacingName(u.success ? u.data : undefined);
          if (l.getToolUseSummary) {
            let p = l.getToolUseSummary(u.success ? u.data : undefined);
            if (p) {
              return `${d}: ${p}`;
            }
          }
          return d;
        }
      }
    }
    return null;
  }
  function REl(e) {
    return !!e && e !== Kve.agentType && e !== "worker";
  }
  var yZn;
  var ha;
  var W7t = __lazy(() => {
    Sd();
    Xq();
    Ai();
    bs();
    YX();
    J_l();
    KG();
    R7t();
    sH();
    sTt();
    Wl();
    OSt();
    et();
    ci();
    FNe();
    cs();
    ro();
    Eo();
    hNo();
    $U();
    j7t();
    yZn = __toESM(pt(), 1);
    ha = __toESM(ie(), 1);
  });
  function getCommandName(e) {
    return e.userFacingName?.() ?? e.name;
  }
  function isCommandEnabled(e) {
    return e.isEnabled?.() ?? true;
  }
  function ALe(e, t) {
    let n = e?.immediate;
    return typeof n === "function" ? n(t) : n === true;
  }
  async function* executeUserPromptExpansionHooks(e, t, n, r, o, s, i) {
    let a = i.getAppState();
    let l = i.agentId ?? getSessionId();
    if (!hasHookForEvent("UserPromptExpansion", a, l)) {
      return;
    }
    let c = {
      ...createBaseHookInput(s),
      hook_event_name: "UserPromptExpansion",
      expansion_type: e,
      command_name: t,
      command_args: n,
      command_source: r,
      prompt: o
    };
    yield* executeHooks({
      hookInput: c,
      toolUseID: LEl.randomUUID(),
      signal: i.abortController.signal,
      timeoutMs: 600000,
      toolUseContext: i
    });
  }
  var LEl;
  var gNo = __lazy(() => {
    at();
    Sp();
    LEl = require("crypto");
  });
  function xwm(e, t) {
    return t.length < 2 ? e : Anu(e, GHp(t, 0, -1));
  }
  function Iwm(e, t) {
    t = Rnu(t, e);
    var n = -1;
    var r = t.length;
    if (!r) {
      return true;
    }
    while (++n < r) {
      var o = knu(t[n]);
      if (o === "__proto__" && !Awm.call(e, "__proto__")) {
        return false;
      }
      if ((o === "constructor" || o === "prototype") && n < r - 1) {
        return false;
      }
    }
    var s = xwm(e, t);
    return s == null || delete s[knu(_Gd(t))];
  }
  var kwm;
  var Awm;
  function Pwm(e) {
    return Qju(e) ? undefined : e;
  }
  var Nwm;
  function bZn(e, t) {
    if (e.type !== t.type) {
      return false;
    }
    let n = (r, o) => (r.if ?? "") === (o.if ?? "");
    switch (e.type) {
      case "command":
        {
          let r = w9e();
          return t.type === "command" && e.command === t.command && De(e.args ?? null) === De(t.args ?? null) && (e.shell ?? r) === (t.shell ?? r) && n(e, t);
        }
      case "prompt":
        return t.type === "prompt" && e.prompt === t.prompt && n(e, t);
      case "agent":
        return t.type === "agent" && e.prompt === t.prompt && n(e, t);
      case "http":
        return t.type === "http" && e.url === t.url && n(e, t);
      case "mcp_tool":
        return t.type === "mcp_tool" && e.server === t.server && e.tool === t.tool && De(e.input ?? {}) === De(t.input ?? {}) && n(e, t);
      case "function":
        return false;
    }
  }
  function z7t(e, t, n, r, o, s, i) {
    GEl(e, t, n, r, o, s, i);
  }
  function WEl(e, t, n, r, o, s, i) {
    let a = i?.id || `function-hook-${Date.now()}-${Math.random()}`;
    let l = {
      type: "function",
      id: a,
      timeout: i?.timeout || 5000,
      callback: o,
      errorMessage: s
    };
    GEl(e, t, n, r, l);
    return a;
  }
  function GEl(e, t, n, r, o, s, i) {
    e(a => {
      let l = a.sessionHooks.get(t) ?? {
        hooks: {}
      };
      let c = l.hooks[n] || [];
      let u = c.findIndex(m => m.matcher === r && m.skillRoot === i);
      let d;
      if (u >= 0) {
        d = [...c];
        let m = d[u];
        let f = o.type === "function" && o.id ? m.hooks.findIndex(g => g.hook.type === "function" && g.hook.id === o.id) : -1;
        let h = f >= 0 ? m.hooks.with(f, {
          hook: o,
          onHookSuccess: s
        }) : [...m.hooks, {
          hook: o,
          onHookSuccess: s
        }];
        d[u] = {
          matcher: m.matcher,
          skillRoot: m.skillRoot,
          hooks: h
        };
      } else {
        d = [...c, {
          matcher: r,
          skillRoot: i,
          hooks: [{
            hook: o,
            onHookSuccess: s
          }]
        }];
      }
      let p = {
        ...l.hooks,
        [n]: d
      };
      a.sessionHooks.set(t, {
        hooks: p
      });
      return a;
    });
    logForDebugging(`Added session hook for event ${n} in session ${t}`);
  }
  function yNo(e, t, n, r) {
    e(o => {
      let s = o.sessionHooks.get(t);
      if (!s) {
        return o;
      }
      let a = (s.hooks[n] || []).map(c => {
        let u = c.hooks.filter(d => !bZn(d.hook, r));
        return u.length > 0 ? {
          ...c,
          hooks: u
        } : null;
      }).filter(c => c !== null);
      let l = a.length > 0 ? {
        ...s.hooks,
        [n]: a
      } : {
        ...s.hooks
      };
      if (a.length === 0) {
        delete l[n];
      }
      o.sessionHooks.set(t, {
        ...s,
        hooks: l
      });
      return o;
    });
    logForDebugging(`Removed session hook for event ${n} in session ${t}`);
  }
  function qEl(e) {
    return e.map(t => ({
      matcher: t.matcher,
      skillRoot: t.skillRoot,
      hooks: t.hooks.map(n => n.hook).filter(n => n.type !== "function")
    }));
  }
  function ILe(e, t, n) {
    let r = e.sessionHooks.get(t);
    if (!r) {
      return new Map();
    }
    let o = new Map();
    if (n) {
      let s = r.hooks[n];
      if (s) {
        o.set(n, qEl(s));
      }
      return o;
    }
    for (let s of HOOK_EVENTS) {
      let i = r.hooks[s];
      if (i) {
        o.set(s, qEl(i));
      }
    }
    return o;
  }
  function VEl(e, t, n) {
    let r = e.sessionHooks.get(t);
    if (!r) {
      return new Map();
    }
    let o = new Map();
    let s = i => i.map(a => ({
      matcher: a.matcher,
      hooks: a.hooks.map(l => l.hook).filter(l => l.type === "function")
    })).filter(a => a.hooks.length > 0);
    if (n) {
      let i = r.hooks[n];
      if (i) {
        let a = s(i);
        if (a.length > 0) {
          o.set(n, a);
        }
      }
      return o;
    }
    for (let i of HOOK_EVENTS) {
      let a = r.hooks[i];
      if (a) {
        let l = s(a);
        if (l.length > 0) {
          o.set(i, l);
        }
      }
    }
    return o;
  }
  function zEl(e, t, n, r, o) {
    let s = e.sessionHooks.get(t);
    if (!s) {
      return;
    }
    let i = s.hooks[n];
    if (!i) {
      return;
    }
    for (let a of i) {
      if (a.matcher === r || r === "") {
        let l = a.hooks.find(c => bZn(c.hook, o));
        if (l) {
          return l;
        }
      }
    }
    return;
  }
  function _No(e, t) {
    e(n => (n.sessionHooks.delete(t), n));
    logForDebugging(`Cleared all session hooks for session ${t}`);
  }
  function AKe(e) {
    return {
      add(t, n, r, o, s) {
        z7t(e, t, n, r, o, undefined, s);
      },
      remove(t, n, r) {
        yNo(e, t, n, r);
      },
      clear(t) {
        _No(e, t);
      }
    };
  }
  var pZ = __lazy(() => {
    qte();
    je();
    Jf();
  });
  function KEl(e, t, n, r, o) {
    let s = 0;
    for (let i of HOOK_EVENTS) {
      let a = n[i];
      if (!a) {
        continue;
      }
      for (let l of a) {
        for (let c of l.hooks) {
          let u = c.once ? () => {
            logForDebugging(`Removing one-shot hook for event ${i} in skill '${r}'`);
            yNo(e, t, i, c);
          } : undefined;
          z7t(e, t, i, l.matcher || "", c, u, o);
          s++;
        }
      }
    }
    if (s > 0) {
      logForDebugging(`Registered ${s} hooks from skill '${r}'`);
    }
  }
  var YEl = __lazy(() => {
    qte();
    je();
    pZ();
  });
  function SZn(e, t, n = "replace") {
    e(r => {
      let o = r.alwaysDenyRules.command;
      let s = n === "union" ? Ro([...(o ?? []), ...t]) : [...t];
      if ((o?.length ?? 0) === s.length && (o ?? []).every((a, l) => a === s[l])) {
        return r;
      }
      return {
        ...r,
        alwaysDenyRules: {
          ...r.alwaysDenyRules,
          command: s.length > 0 ? s : undefined
        }
      };
    });
  }
  var bNo = () => {};
  function iTt(e) {
    let t = e.startsWith("/") ? e.slice(1) : e;
    let n = t.search(/\s/);
    if (n === -1) {
      return {
        name: t,
        args: ""
      };
    }
    return {
      name: t.slice(0, n),
      args: t.slice(n + 1).trim()
    };
  }
  function Jve(e) {
    let t = e.trim();
    if (!t.startsWith("/")) {
      return null;
    }
    let {
      name: n,
      args: r
    } = iTt(t);
    if (!n) {
      return null;
    }
    let o = "(MCP)";
    if (r === o) {
      return {
        commandName: `${n} ${o}`,
        args: "",
        isMcp: true
      };
    }
    if (r.startsWith(o) && /\s/.test(r.charAt(o.length))) {
      return {
        commandName: `${n} ${o}`,
        args: r.slice(o.length).trimStart(),
        isMcp: true
      };
    }
    return {
      commandName: n,
      args: r,
      isMcp: false
    };
  }
  var K7t = () => {};
  function Y7t(e, t) {
    if (!e.subcommands) {
      return;
    }
    let n = t.trimStart();
    let r = n.search(/\s/);
    let o = r === -1 ? n : n.slice(0, r);
    let s = o ? e.subcommands[o.toLowerCase()] : undefined;
    if (s === undefined) {
      return;
    }
    let i = r === -1 ? "" : n.slice(r + 1).trimStart();
    return {
      targetName: s,
      consumedToken: o,
      remainingArgs: i.replace(/(?:^|\s)--comment(?=\s|$)/g, "").trim()
    };
  }
  function XEl(e) {
    return Lwm.vZc(e) ? `/${e}` : null;
  }
  var Lwm;
  var C2b;
  var R2b;
  var TZn = __lazy(() => {
    Lwm = new Set(["verify", "code-review"]);
    C2b = [/^(?:bun|npm|yarn|pnpm|deno)\s+(?:run\s+)?test\b/, /^(?:\.\/)?(?:go|cargo|make|mvn|gradle|gradlew|dotnet|swift|mix|sbt|lein|rake|zig|bazel|nx|turbo)\s+test\b/, new RegExp(`^${"(?:\\./)?(?:(?:npx|bunx|uvx|uv\\s+run)\\s+)?"}(?:pytest|jest|vitest|rspec|phpunit|ctest)\\b`), /^(?:bun|npm|yarn|pnpm)\s+run\s+test:\S/];
    R2b = [/^(?:bun|npm|yarn|pnpm)\s+run\s+typecheck\b/, new RegExp(`^${"(?:\\./)?(?:(?:npx|bunx|uvx|uv\\s+run)\\s+)?"}(?:tsc|mypy)\\b`)];
  });
  function mZ() {
    let e = getDynamicConfig_CACHED_MAY_BE_STALE("tengu_lilac_loom", null);
    if (e === null || e === undefined) {
      return null;
    }
    if (IKe === null || IKe.raw !== e) {
      let n = Uwm().safeParse(e);
      if (!n.success) {
        logForDebugging(`Promo campaign payload failed validation: ${n.error.message}`, {
          level: "warn"
        });
      }
      IKe = n.success ? {
        raw: e,
        campaign: n.data,
        startsAtMs: Date.parse(n.data.startsAt),
        endsAtMs: Date.parse(n.data.endsAt)
      } : {
        raw: e,
        campaign: null,
        startsAtMs: 0,
        endsAtMs: 0
      };
    }
    if (IKe.campaign === null) {
      return null;
    }
    let t = Date.now();
    if (t < IKe.startsAtMs) {
      return null;
    }
    if (t > IKe.endsAtMs) {
      return null;
    }
    return IKe.campaign;
  }
  function wZn() {
    return mZ()?.command ?? null;
  }
  function Bwm(e) {
    if (!isClaudeAISubscriber()) {
      return "excluded";
    }
    let t = getSubscriptionType();
    if (!t) {
      return "excluded";
    }
    if (e.creditless) {
      return "viewer";
    }
    if (isConsumerSubscriber()) {
      return "claimant";
    }
    if (t === "team") {
      if (!getOauthAccountInfo()?.organizationRole) {
        return "excluded";
      }
      return av() ? "claimant" : "viewer";
    }
    return "excluded";
  }
  function J7t() {
    let e = mZ();
    if (!e) {
      return null;
    }
    let t = getOauthAccountInfo()?.organizationUuid;
    if (!t) {
      return null;
    }
    let n = Bwm(e);
    if (n === "excluded") {
      return null;
    }
    if (n === "claimant" && qwm(t, e.feature)) {
      return null;
    }
    return {
      campaign: e,
      orgId: t,
      audience: n
    };
  }
  function CZn(e) {
    let t = wZn();
    return t !== null && e === t;
  }
  function RZn(e) {
    return CZn(e) && PLe();
  }
  function PLe() {
    let e = J7t();
    if (!e || e.audience !== "claimant") {
      return false;
    }
    if (!e.campaign.command) {
      return false;
    }
    let t = vZn(e.orgId, e.campaign.feature);
    return t !== null && t.eligible && t.available;
  }
  function aTt() {
    let e = J7t();
    if (!e || e.audience !== "viewer") {
      return false;
    }
    if (!e.campaign.command) {
      return false;
    }
    return !Wwm(e.orgId, e.campaign.feature);
  }
  function Xve() {
    let e = mZ();
    let t = getOauthAccountInfo()?.organizationUuid;
    if (!e || !t) {
      return null;
    }
    let n = vZn(t, e.feature);
    if (!n || n.amount_minor_units === null || !n.currency) {
      return null;
    }
    return {
      amountMinorUnits: n.amount_minor_units,
      currency: n.currency
    };
  }
  function xZn() {
    SNo ??= $wm().catch(e => (logForDebugging(`FotW eligibility refresh failed: ${e}`, {
      level: "warn"
    }), null)).finally(() => {
      SNo = null;
    });
    return SNo;
  }
  async function $wm() {
    let e = J7t();
    if (!e || e.audience !== "claimant") {
      return null;
    }
    let {
      campaign: t,
      orgId: n
    } = e;
    if (vZn(n, t.feature) !== null) {
      return null;
    }
    let r;
    try {
      r = await _s.get(`/api/oauth/organizations/:orgUUID/overage_credit_grant?campaign=${"feature_of_the_week"}`, {
        auth: "teleport-org",
        timeout: 1e4,
        validateStatus: o => o < 500
      });
    } catch (o) {
      Et("api_fotw_eligibility_fetch", "request_failed");
      logForDebugging(`FotW eligibility fetch failed: ${o}`, {
        level: "warn"
      });
      return null;
    }
    if (!r.ok || r.status >= 400) {
      Et("api_fotw_eligibility_fetch", "unavailable");
      return null;
    }
    if (Pe("api_fotw_eligibility_fetch"), r.data.granted) {
      nvl(n, t.feature);
    }
    if (r.data.eligible && r.data.needs_payment_setup === true) {
      if (r.data.amount_minor_units == null || !r.data.currency) {
        return null;
      }
      return {
        amountMinorUnits: r.data.amount_minor_units,
        currency: r.data.currency
      };
    }
    if (vZn(n, t.feature) !== null) {
      return null;
    }
    ovl(n, t.feature, {
      available: r.data.available,
      eligible: r.data.eligible,
      granted: r.data.granted,
      amount_minor_units: r.data.amount_minor_units ?? null,
      currency: r.data.currency ?? null
    }, {
      onlyIfAbsent: true
    });
    return null;
  }
  function vZn(e, t) {
    let r = getGlobalConfig().fotwEligibilityCache?.[e]?.[t];
    if (!r) {
      return null;
    }
    if (Date.now() - r.timestamp > 86400000) {
      return null;
    }
    return r.info;
  }
  async function tvl(e) {
    if (!RZn(e)) {
      return {
        outcome: "skipped"
      };
    }
    let t = J7t();
    if (!t) {
      return {
        outcome: "skipped"
      };
    }
    let {
      campaign: n,
      orgId: r
    } = t;
    let o = Xve();
    let s;
    try {
      s = await _s.post("/api/oauth/organizations/:orgUUID/overage_credit_grant", {
        campaign: "feature_of_the_week",
        feature: n.feature,
        enable_overages: true
      }, {
        auth: "teleport-org",
        timeout: 60000,
        validateStatus: i => i < 500
      });
    } catch (i) {
      Ae("api_fotw_claim", "request_failed");
      logForDebugging(`FotW claim failed: ${i}`, {
        level: "warn"
      });
      return {
        outcome: "failed"
      };
    }
    if (!s.ok) {
      return {
        outcome: "failed"
      };
    }
    if (s.status >= 400) {
      if (jwm(s.data) === "Failed to grant credit") {
        Ae("api_fotw_claim", "grant_failed");
        return {
          outcome: "failed"
        };
      }
      Et("api_fotw_claim", "not_available");
      ovl(r, n.feature, {
        available: false,
        eligible: false,
        granted: false,
        amount_minor_units: null,
        currency: null
      });
      return {
        outcome: "not_available"
      };
    }
    if (!s.data.success) {
      Ae("api_fotw_claim", "grant_failed");
      return {
        outcome: "failed"
      };
    }
    Pe("api_fotw_claim");
    nvl(r, n.feature);
    return {
      outcome: "granted",
      amountMinorUnits: s.data.amount_minor_units ?? o?.amountMinorUnits ?? 0,
      currency: s.data.currency ?? o?.currency ?? "USD",
      expiresAt: s.data.expires_at ?? null
    };
  }
  function jwm(e) {
    let t = Hwm().safeParse(e);
    return t.success ? t.data.error.message : undefined;
  }
  function qwm(e, t) {
    let n = getGlobalConfig().fotwClaimedFeatures;
    return Boolean(n?.[e]?.includes(t));
  }
  function nvl(e, t) {
    saveGlobalConfig(n => {
      let r = n.fotwClaimedFeatures?.[e] ?? [];
      if (r.includes(t)) {
        return n;
      }
      return {
        ...n,
        fotwClaimedFeatures: {
          ...n.fotwClaimedFeatures,
          [e]: [...r, t]
        }
      };
    });
  }
  function Wwm(e, t) {
    let n = getGlobalConfig().fotwUpsellFulfilled;
    return Boolean(n?.[e]?.includes(t));
  }
  function rvl(e) {
    let t = J7t();
    if (!t || t.audience !== "viewer" || !CZn(e)) {
      return;
    }
    let {
      orgId: n,
      campaign: r
    } = t;
    saveGlobalConfig(o => {
      let s = o.fotwUpsellFulfilled?.[n] ?? [];
      if (s.includes(r.feature)) {
        return o;
      }
      return {
        ...o,
        fotwUpsellFulfilled: {
          ...o.fotwUpsellFulfilled,
          [n]: [...s, r.feature]
        }
      };
    });
  }
  function ovl(e, t, n, {
    onlyIfAbsent: r = false
  } = {}) {
    saveGlobalConfig(o => {
      let s = o.fotwEligibilityCache?.[e]?.[t];
      let i = s && Date.now() - s.timestamp <= 86400000;
      if (r && i) {
        return o;
      }
      if (s && s.info.available === n.available && s.info.eligible === n.eligible && s.info.granted === n.granted && s.info.amount_minor_units === n.amount_minor_units && s.info.currency === n.currency && i) {
        return o;
      }
      return {
        ...o,
        fotwEligibilityCache: {
          ...o.fotwEligibilityCache,
          [e]: {
            ...o.fotwEligibilityCache?.[e],
            [t]: {
              info: n,
              timestamp: Date.now()
            }
          }
        }
      };
    });
  }
  var QEl = () => Ke.string().refine(e => !Number.isNaN(Date.parse(e)) && /(z|[+-]\d{2}:?\d{2})$/i.test(e), "must be ISO 8601 with timezone, e.g. 2026-06-04T16:00:00Z");
  var EZn = () => Ke.string().optional().transform(e => e === "" ? undefined : e);
  var Uwm;
  var IKe = null;
  var SNo = null;
  var Hwm;
  var lTt = __lazy(() => {
    qg();
    no();
    vF();
    je();
    ln();
    $n();
    bg();
    Uwm = we(() => Ke.object({
      feature: Ke.string().min(1),
      command: Ke.string().optional().transform(e => e === "" ? undefined : e),
      startsAt: QEl(),
      endsAt: QEl(),
      hideCommandChip: Ke.boolean().optional(),
      creditless: Ke.boolean().optional(),
      titleLabel: EZn(),
      commandBlurb: EZn(),
      tipBlurb: EZn(),
      isTopPriorityAnnouncement: Ke.boolean().optional(),
      announcementLines: Ke.array(Ke.object({
        text: Ke.string(),
        style: Ke.enum(["bold", "dim"]).optional()
      })).optional().transform(e => {
        let t = e?.filter(n => n.text !== "");
        return t?.length ? t : undefined;
      }).catch(undefined),
      tips: Ke.array(Ke.string()).optional().transform(e => {
        let t = e?.filter(Boolean);
        return t?.length ? t : undefined;
      }).catch(undefined),
      redeemBy: EZn()
    }));
    Hwm = we(() => Ke.object({
      error: Ke.object({
        message: Ke.string()
      })
    }));
  });
  function ivl({
    commandName: e,
    agentId: t,
    isNonInteractiveSession: n,
    setAppState: r
  }) {
    if (t !== undefined || n) {
      return;
    }
    if (li()) {
      return;
    }
    rvl(e);
    let o = xZn();
    if (!CZn(e)) {
      return;
    }
    if (RZn(e)) {
      svl(e, r);
      return;
    }
    o.then(s => {
      if (RZn(e)) {
        svl(e, r);
        return;
      }
      if (!s) {
        return;
      }
      let i = wZn();
      if (!i) {
        return;
      }
      r(a => ({
        ...a,
        fotwClaim: {
          phase: "needs_payment_setup",
          command: i,
          amountMinorUnits: s.amountMinorUnits,
          currency: s.currency
        }
      }));
    });
  }
  function svl(e, t) {
    let n = wZn();
    let r = Xve();
    if (!n || !r) {
      return;
    }
    t(o => ({
      ...o,
      fotwClaim: {
        phase: "pending",
        command: n,
        amountMinorUnits: r.amountMinorUnits,
        currency: r.currency
      }
    }));
    tvl(e).catch(() => ({
      outcome: "failed"
    })).then(o => {
      t(s => {
        let i = s.fotwClaim;
        if (!i || i.command !== n) {
          return s;
        }
        if (o.outcome === "granted") {
          return {
            ...s,
            fotwClaim: {
              phase: "granted",
              command: i.command,
              amountMinorUnits: o.amountMinorUnits,
              currency: o.currency
            }
          };
        }
        return {
          ...s,
          fotwClaim: {
            ...i,
            phase: "failed"
          }
        };
      });
    });
  }
  var avl = __lazy(() => {
    lTt();
    yd();
  });
  var X7t = {};
  __export(X7t, {
    runUserPromptExpansionHook: () => runUserPromptExpansionHook,
    processSlashCommand: () => processSlashCommand,
    processPromptSlashCommand: () => processPromptSlashCommand,
    looksLikeCommand: () => looksLikeCommand,
    isSlashCommandBlockedByEndedByModel: () => isSlashCommandBlockedByEndedByModel,
    formatSkillLoadingMetadata: () => formatSkillLoadingMetadata
  });
  function isSlashCommandBlockedByEndedByModel(e, t) {
    if (!t) {
      return false;
    }
    return !(e && e.type !== "prompt" && Vwm.vZc(e.name));
  }
  async function Kwm(e, t, n, r, o, s, i = []) {
    let a = vN();
    let {
      sanitizedName: l,
      skillNameHash: c
    } = Iut({
      rawName: e.name,
      canonicalName: e.name,
      isMcp: e.loadedFrom === "mcp",
      isBuiltIn: builtInCommandNames().vZc(e.name),
      isBundled: e.source === "bundled",
      isOfficial: e.source === "plugin" && !!e.pluginInfo?.repository && BI(Yo(e.pluginInfo.repository).marketplace)
    });
    logEvent("tengu_slash_command_forked", {
      command_name: l,
      ...c,
      _PROTO_skill_name: e.name,
      invocation_trigger: "user-slash",
      ...OSe(e.source, e.loadedFrom, e.kind, e.createdBy),
      ...Xze(e.source, e.name),
      ...(e.pluginInfo && DSe(e.pluginInfo))
    });
    let {
      skillContent: u,
      modifiedGetAppState: d,
      contextLayers: p,
      baseAgent: m,
      promptMessages: f
    } = await prepareForkedCommandContext(e, t, n);
    let h = p.length > 0 ? [...(n.permissionLayers ?? []), ...p] : n.permissionLayers;
    f.push(...i);
    let g = e.getEffort?.(t) ?? e.effort;
    let y = g !== undefined ? {
      ...m,
      effort: g
    } : m;
    logForDebugging(`Executing forked slash command /${e.name} with agent ${y.agentType}`);
    let _ = [];
    let b = [];
    let S = `forked-command-${e.name}`;
    let E = 0;
    let C = I => (E++, {
      type: "progress",
      data: {
        message: I,
        type: "agent_progress",
        prompt: u,
        agentId: a,
        agentType: y.agentType,
        description: e.description
      },
      parentToolUseID: S,
      toolUseID: `${S}-${E}`,
      timestamp: new Date().toISOString(),
      uuid: cTt.randomUUID()
    });
    let x = () => {
      o({
        jsx: kLe(b, {
          tools: n.options.tools,
          verbose: false
        }),
        shouldHidePromptInput: false,
        shouldContinueAnimation: true,
        showSpinner: true
      });
      n.emitToolProgress?.({
        kind: "agent_progress",
        toolUseId: S,
        progressMessages: [...b]
      });
    };
    x();
    try {
      for await (let I of I3({
        agentDefinition: y,
        promptMessages: f,
        toolUseContext: {
          ...n,
          getAppState: d,
          permissionLayers: h
        },
        canUseTool: s,
        isAsync: false,
        querySource: "agent:custom",
        spawnedBySkill: attributionSkillName(e),
        model: e.model,
        availableTools: n.options.tools
      })) {
        if (I.type === "api_metrics" || I.type === "set_in_progress_tool_use_ids" || I.type === "spinner_mode") {
          continue;
        }
        _.push(I);
        let O = xS([I]);
        if (I.type === "assistant") {
          let M = l$n(I);
          if (M > 0) {
            n.onQueryEvent?.({
              type: "response_length",
              op: "add",
              delta: M
            });
          }
          let L = O[0];
          if (L && L.type === "assistant") {
            b.push(C(I));
            x();
          }
        }
        if (I.type === "user") {
          let M = O[0];
          if (M && M.type === "user") {
            b.push(C(M));
            x();
          }
        }
      }
    } finally {
      o(null);
      n.emitToolProgress?.({
        kind: "clear",
        toolUseId: S
      });
    }
    let A = extractResultText(_, "Command completed");
    logForDebugging(`Forked slash command /${e.name} completed with agent ${a}`);
    return {
      messages: [In({
        content: Kz({
          inputString: `/${getCommandName(e)} ${t}`.trim(),
          precedingInputBlocks: r
        })
      }), In({
        content: `<local-command-stdout>
${A}
</local-command-stdout>`
      })],
      shouldQuery: false,
      command: e,
      resultText: A
    };
  }
  function looksLikeCommand(e) {
    return !/[^a-zA-Z0-9:\-_]/.test(e);
  }
  async function processSlashCommand(e, t, n, r, o, s, i, a, l, c) {
    function u() {
      let Q = cTt.randomUUID();
      setPromptId(Q);
      let Z = aO(o.options.mainLoopModel, getEffortValue(o));
      logEvent("tengu_input_prompt", {
        ...(c && {
          prompt_source: c
        }),
        ...(Z && {
          effort_level: Z
        })
      });
      su("user_prompt", {
        prompt_length: String(e.length),
        prompt: tqt(e),
        "prompt.id": Q
      });
      return {
        messages: [In({
          content: Kz({
            inputString: e,
            precedingInputBlocks: t
          }),
          uuid: i,
          promptSource: c
        }), ...r],
        shouldQuery: true
      };
    }
    let d = Jve(e);
    if (!d) {
      if (logEvent("tengu_input_slash_missing", {}), o.options.isNonInteractiveSession) {
        return u();
      }
      Ae("cmd_dispatch", "cmd_parse_failed");
      let Q = "Commands are in the form `/command [args]`";
      return {
        messages: [Nse(), ...r, In({
          content: Kz({
            inputString: Q,
            precedingInputBlocks: t
          })
        })],
        shouldQuery: false,
        resultText: Q
      };
    }
    let {
      commandName: p,
      args: m
    } = d;
    let {
      isMcp: f
    } = d;
    let h = false;
    if (nA()) {
      let Q = w7t(p, o.options.commands);
      if (Q) {
        p = Q.commandName;
        m = Q.args;
      } else if (p.includes("://")) {
        h = true;
      }
    }
    let g = findCommand(p, o.options.commands);
    if (g && !isCommandEnabled(g)) {
      g = undefined;
    }
    if (!g && !f && m.trim()) {
      let Q = m.trimStart();
      let Z = Q.search(/\s/);
      let ne = Z === -1 ? Q : Q.slice(0, Z);
      let oe = `${p}:${ne}`;
      let ee = findCommand(oe, o.options.commands);
      if (ee) {
        g = ee;
        p = oe;
        m = Z === -1 ? "" : Q.slice(Z + 1).trimStart();
      }
    }
    let y;
    if (g && !isSkillOff(g)) {
      let Q = Y7t(g, m);
      if (Q) {
        let Z = findCommand(Q.targetName, o.options.commands);
        if (Z && isCommandEnabled(Z)) {
          g = Z;
          p = Q.targetName;
          m = Q.remainingArgs;
        } else if (g.name === "code-review") {
          let ne = lQn();
          if (ne) {
            y = wc(`${ne} Running a local review instead.`, "warning");
          }
        }
      }
    }
    let _ = builtInCommandNames().vZc(p);
    let b = g?.type === "prompt" && g.source === "bundled";
    let S = g?.type === "prompt" && g.source === "plugin" && !!g.pluginInfo?.repository && BI(Yo(g.pluginInfo.repository).marketplace);
    let E = f || g?.type === "prompt" && g.source === "mcp";
    if (!g) {
      let Q = false;
      try {
        await zt().stat(`/${p}`);
        Q = true;
      } catch {}
      if ((looksLikeCommand(p) || h) && !Q) {
        if (o.options.isNonInteractiveSession && builtInCommandNames().vZc(p)) {
          let oe = `/${p} isn't available in this environment.`;
          logEvent("tengu_input_slash_invalid", {
            input_length: p.length,
            had_suggestion: false
          });
          Ae("cmd_dispatch", "cmd_unavailable_headless");
          return {
            messages: [mR(`/${p}${m ? ` ${m}` : ""}`), mR(`<local-command-stdout>${oe}</local-command-stdout>`)],
            shouldQuery: false,
            resultText: oe
          };
        }
        let Z = hLe(p, o.options.commands.filter(oe => !oe.isHidden && !isSkillOff(oe) && isCommandEnabled(oe)).map(oe => ({
          name: getCommandName(oe),
          aliases: oe.aliases
        })), {
          maxEditDistance: 2
        });
        logEvent("tengu_input_slash_invalid", {
          input_length: p.length,
          is_mcp_template_unmatched: h,
          had_suggestion: Boolean(Z),
          suggestion_distance: Z ? cSt(p, Z) : undefined
        });
        Ae("cmd_dispatch", "cmd_unknown");
        let ne = Z ? `Unknown command: /${p}. Did you mean /${Z}?` : `Unknown command: /${p}`;
        if (o.options.isNonInteractiveSession) {
          return {
            messages: [...r, mR(`/${p}${m ? ` ${m}` : ""}`), mR(`<local-command-stdout>${ne}</local-command-stdout>`)],
            shouldQuery: false,
            resultText: ne
          };
        }
        return {
          messages: [...r, wc(ne, "warning"), ...(m ? [wc(`Args from unknown skill: ${m}`, "warning")] : [])],
          shouldQuery: false,
          resultText: ne
        };
      }
      return u();
    }
    let C = E || g.loadedFrom === "mcp" ? "mcp" : _ || g.type === "prompt" && (g.source === "bundled" || g.source === "builtin") ? "builtin" : "custom";
    let x = g.isSensitive && m.trim() ? `/${p} ***` : e;
    if (!(o.deferSlashToEngine?.(g) ?? false)) {
      let Q = cTt.randomUUID();
      setPromptId(Q);
      su("user_prompt", {
        prompt_length: String(x.length),
        prompt: tqt(x),
        "prompt.id": Q,
        command_name: C === "builtin" || bh() ? p : C,
        command_source: C
      });
    }
    let {
      messages: k,
      shouldQuery: I,
      allowedTools: O,
      disallowedTools: M,
      model: L,
      effort: P,
      command: F,
      resultText: H,
      nextInput: U,
      submitNextInput: N,
      engineDeferredSlash: W
    } = await Jwm(p, m, s, o, t, n, a, l, i);
    let {
      sanitizedName: j,
      skillNameHash: z
    } = Iut({
      rawName: p,
      canonicalName: F.name,
      isMcp: E || F.loadedFrom === "mcp",
      isBuiltIn: _,
      isBundled: b,
      isOfficial: S
    });
    if (k.length === 0) {
      let Q = {
        input: j,
        ...z
      };
      if (F.type === "prompt" && F.pluginInfo) {
        let {
          pluginManifest: Z,
          repository: ne
        } = F.pluginInfo;
        let {
          marketplace: oe
        } = Yo(ne);
        let ee = BI(oe);
        if (Q.plugin_repository = ee ? ne : "third-party", Q.plugin_name = ee ? Z.name : "third-party", ee && Z.version) {
          Q.plugin_version = uS(Z.version);
        }
        Object.assign(Q, DSe(F.pluginInfo));
      }
      logEvent("tengu_input_command", {
        ...Q,
        invocation_trigger: "user-slash",
        ...OSe(F.type === "prompt" ? F.source : undefined, F.loadedFrom, F.kind, F.type === "prompt" ? F.createdBy : undefined),
        ...Xze(F.type === "prompt" ? F.source : undefined, p),
        ...(F.type === "prompt" && {
          command_content_chars: F.contentLength
        }),
        ...(F.type === "prompt" && {
          _PROTO_skill_name: F.name
        }),
        ...false
      });
      return {
        messages: [],
        shouldQuery: false,
        model: L,
        nextInput: U,
        submitNextInput: N
      };
    }
    if (k.length === 2 && k[1].type === "user" && typeof k[1].message.content === "string" && k[1].message.content.startsWith("Unknown command:")) {
      if (!(e.startsWith("/var") || e.startsWith("/tmp") || e.startsWith("/private"))) {
        logEvent("tengu_input_slash_invalid", {
          input_length: p.length,
          had_suggestion: false
        });
        Ae("cmd_dispatch", "cmd_unknown");
      }
      return {
        messages: [Nse(), ...k],
        shouldQuery: I,
        allowedTools: O,
        disallowedTools: M,
        model: L
      };
    }
    if (!W) {
      Pe("cmd_dispatch");
    }
    let V = {
      input: j,
      ...z
    };
    if (F.type === "prompt" && F.pluginInfo) {
      let {
        pluginManifest: Q,
        repository: Z
      } = F.pluginInfo;
      let {
        marketplace: ne
      } = Yo(Z);
      let oe = BI(ne);
      if (V.plugin_repository = oe ? Z : "third-party", V.plugin_name = oe ? Q.name : "third-party", oe && Q.version) {
        V.plugin_version = uS(Q.version);
      }
      Object.assign(V, DSe(F.pluginInfo));
    }
    if (!W) {
      logEvent("tengu_input_command", {
        ...V,
        invocation_trigger: "user-slash",
        ...OSe(F.type === "prompt" ? F.source : undefined, F.loadedFrom, F.kind, F.type === "prompt" ? F.createdBy : undefined),
        ...Xze(F.type === "prompt" ? F.source : undefined, p),
        ...(F.type === "prompt" && {
          command_content_chars: F.contentLength
        }),
        ...(F.type === "prompt" && {
          _PROTO_skill_name: F.name
        }),
        ...false
      });
    }
    let K = k.length > 0 && k[0] && SS(k[0]);
    let J = I || k.every(Q => TNo(Q) || Q.type === "system" && Q.subtype === "informational" || Q.type === "user" && Q.isMeta) || K || W ? k : [Nse(), ...k];
    return {
      messages: y && I ? [...J, y] : J,
      shouldQuery: I,
      allowedTools: O,
      disallowedTools: M,
      model: L,
      effort: P,
      resultText: H,
      nextInput: U,
      submitNextInput: N,
      engineDeferredSlash: W
    };
  }
  async function Jwm(e, t, n, r, o, s, i, a, l) {
    let c = getCommand(e, r.options.commands);
    let u = Mhn(shippedCommandNames().vZc(e) ? e : "custom");
    if (!isCommandEnabled(c)) {
      Ae(u, "cmd_policy_disabled");
      let d = `/${e} isn't available in this session.`;
      if (r.options.isNonInteractiveSession) {
        return {
          messages: [mR(OLe(c, t)), mR(`<local-command-stdout>${d}</local-command-stdout>`)],
          shouldQuery: false,
          command: c,
          resultText: d
        };
      }
      return {
        messages: [wc(d, "warning")],
        shouldQuery: false,
        command: c,
        resultText: d
      };
    }
    if (isSkillOff(c)) {
      if (Ae(u, "cmd_skill_override_off"), r.options.isNonInteractiveSession) {
        let p = `Skill "${c.name}" is disabled via skillOverrides. Remove the override from your settings to run it.`;
        return {
          messages: [mR(OLe(c, t)), mR(`<local-command-stdout>${p}</local-command-stdout>`)],
          shouldQuery: false,
          command: c,
          resultText: p
        };
      }
      let d = `Skill "${c.name}" is disabled via skillOverrides. Re-enable it in /skills or remove the override from your settings to run it.`;
      return {
        messages: [wc(d, "warning"), ...(t ? [wc(`Args from disabled skill: ${t}`, "warning")] : [])],
        shouldQuery: false,
        command: c,
        resultText: d
      };
    }
    if (c.type === "prompt" && c.userInvocable !== false) {
      jXn(c.name);
    }
    if (c.type === "prompt" && c.pluginInfo) {
      Tq(c.pluginInfo.repository);
    }
    if (!r.deferSlashToEngine?.(c)) {
      ivl({
        commandName: c.name,
        agentId: r.agentId,
        isNonInteractiveSession: Boolean(r.options.isNonInteractiveSession),
        setAppState: r.setAppState
      });
    }
    if (c.userInvocable === false) {
      Ae(u, "cmd_not_user_invocable");
      return {
        messages: [In({
          content: Kz({
            inputString: `/${e}`,
            precedingInputBlocks: o
          })
        }), In({
          content: `This skill can only be invoked by Claude, not directly by users. Ask Claude to use the "${e}" skill for you.`
        })],
        shouldQuery: false,
        command: c
      };
    }
    if (c.type === "local-jsx" && r.options.isNonInteractiveSession) {
      Ae(u, "cmd_local_jsx_headless");
      let d = `/${getCommandName(c)} opens an interactive panel and isn't available in this environment. Run it from the Claude Code terminal instead.`;
      return {
        messages: [mR(OLe(c, t)), mR(`<local-command-stdout>${d}</local-command-stdout>`)],
        shouldQuery: false,
        command: c,
        resultText: d
      };
    }
    try {
      switch (c.type) {
        case "local-jsx":
          return new Promise(d => {
            let p = false;
            let m = (f, h) => {
              if (p = true, Pe(u), h?.display === "skip") {
                d({
                  messages: [],
                  shouldQuery: false,
                  command: c,
                  nextInput: h?.nextInput,
                  submitNextInput: h?.submitNextInput
                });
                return;
              }
              let g = (h?.metaMessages ?? []).map(_ => In({
                content: _,
                isMeta: true
              }));
              let y = qs() && typeof f === "string" && f.endsWith(" dismissed");
              d({
                messages: h?.display === "system" ? y ? g : [mR(OLe(c, t)), mR(`<local-command-stdout>${f}</local-command-stdout>`), ...g] : [In({
                  content: Kz({
                    inputString: OLe(c, t),
                    precedingInputBlocks: o
                  })
                }), f ? In({
                  content: `<local-command-stdout>${f}</local-command-stdout>`
                }) : In({
                  content: `<local-command-stdout>${"(no content)"}</local-command-stdout>`
                }), ...g],
                shouldQuery: h?.shouldQuery ?? false,
                command: c,
                nextInput: h?.nextInput,
                submitNextInput: h?.submitNextInput
              });
            };
            c.load().then(f => f.call(m, {
              ...r,
              canUseTool: a
            }, t, e)).then(f => {
              if (f == null) {
                return;
              }
              if (p) {
                return;
              }
              n({
                jsx: f,
                shouldHidePromptInput: true,
                showSpinner: false,
                isLocalJSXCommand: true,
                isImmediate: ALe(c, t)
              });
            }).catch(f => {
              if (Oe($o(sr(f), "local-jsx slash command threw")), Ae(u, "cmd_local_jsx_threw"), p) {
                return;
              }
              p = true;
              n({
                jsx: null,
                shouldHidePromptInput: false,
                clearLocalJSX: true
              });
              d({
                messages: [],
                shouldQuery: false,
                command: c
              });
            });
          });
        case "local":
          {
            if (r.deferSlashToEngine?.(c)) {
              let m = `/${getCommandName(c)} ${t}`.trim();
              let f = In({
                content: Kz({
                  inputString: m,
                  precedingInputBlocks: o
                })
              });
              return {
                messages: [f],
                shouldQuery: false,
                command: c,
                engineDeferredSlash: {
                  text: m,
                  messageUuid: f.uuid
                }
              };
            }
            let d = c.isSensitive && t.trim() ? "***" : t;
            let p = In({
              content: Kz({
                inputString: OLe(c, d),
                precedingInputBlocks: o
              })
            });
            try {
              let m = Nse();
              let h = await (await c.load()).call(t, r);
              if (Pe(u), h.type === "skip") {
                return {
                  messages: [],
                  shouldQuery: false,
                  command: c
                };
              }
              if (h.type === "compact") {
                let g = [m, p, ...(h.displayText ? [In({
                  content: `<local-command-stdout>${h.displayText}</local-command-stdout>`,
                  timestamp: new Date(Date.now() + 100).toISOString()
                })] : [])];
                let y = {
                  ...h.compactionResult,
                  messagesToKeep: [...h.compactionResult.messagesToKeep, ...g]
                };
                return {
                  messages: ATe(y),
                  shouldQuery: false,
                  command: c
                };
              }
              if (h.type === "query") {
                return {
                  messages: [p, In({
                    content: `<local-command-stdout>${h.value}</local-command-stdout>`
                  }), In({
                    content: h.prompt,
                    isMeta: true
                  })],
                  shouldQuery: true,
                  command: c,
                  resultText: h.value
                };
              }
              return {
                messages: [p, mR(`<local-command-stdout>${h.value}</local-command-stdout>`)],
                shouldQuery: false,
                command: c,
                resultText: h.value
              };
            } catch (m) {
              if (mg(m)) {
                logForDebugging(`local command aborted: ${m instanceof Error ? m.message : String(m)}`);
              } else {
                Oe($o(sr(m), "local slash command threw"));
              }
              Ae(u, "cmd_local_threw");
              return {
                messages: [p, mR(`<local-command-stderr>${String(m)}</local-command-stderr>`)],
                shouldQuery: false,
                command: c
              };
            }
          }
        case "prompt":
          {
            if (!(c.isMcp && c.loadedFrom !== "mcp")) {
              nqt(c.name, c, "user-slash");
            }
            try {
              let d = await runUserPromptExpansionHook(c, t, r);
              if ("blocked" in d) {
                Ae(u, "cmd_hook_blocked");
                return d.blocked;
              }
              if (c.getEffort?.(t) !== undefined && !r.options.isNonInteractiveSession) {
                eq();
              }
              if (c.context === "fork") {
                let m = await Kwm(c, t, r, o, n, a ?? hasPermissionsToUseTool, d.hookMessages);
                Pe(u);
                return m;
              }
              let p = await pvl(c, t, r, o, s, l, d.hookMessages);
              Pe(u);
              return p;
            } catch (d) {
              if (d instanceof xc) {
                Ae(u, "cmd_prompt_aborted");
                return {
                  messages: [In({
                    content: Kz({
                      inputString: OLe(c, t),
                      precedingInputBlocks: o
                    })
                  }), fZ({
                    toolUse: false
                  })],
                  shouldQuery: false,
                  command: c
                };
              }
              Ae(u, "cmd_prompt_threw");
              return {
                messages: [In({
                  content: Kz({
                    inputString: OLe(c, t),
                    precedingInputBlocks: o
                  })
                }), In({
                  content: `<local-command-stderr>${String(d)}</local-command-stderr>`
                })],
                shouldQuery: false,
                command: c
              };
            }
          }
      }
    } catch (d) {
      if (d instanceof O7) {
        Ae(u, "cmd_malformed");
        return {
          messages: [In({
            content: Kz({
              inputString: d.message,
              precedingInputBlocks: o
            })
          })],
          shouldQuery: false,
          command: c
        };
      }
      throw d;
    }
  }
  function OLe(e, t) {
    return NLe(getCommandName(e), t);
  }
  function formatSkillLoadingMetadata(e, t = "loading") {
    return [`<${"command-message"}>${e}</${"command-message"}>`, `<${"command-name"}>${e}</${"command-name"}>`, "<skill-format>true</skill-format>"].join(`
`);
  }
  function lvl(e, t) {
    return [`<${"command-message"}>${e}</${"command-message"}>`, `<${"command-name"}>/${e}</${"command-name"}>`, t ? `<command-args>${t}</command-args>` : null].filter(Boolean).join(`
`);
  }
  function cvl(e, t) {
    if (e.userInvocable !== false) {
      return lvl(e.name, t);
    }
    if (e.loadedFrom === "skills" || e.loadedFrom === "plugin" || e.loadedFrom === "mcp") {
      return formatSkillLoadingMetadata(e.name, e.progressMessage);
    }
    return lvl(e.name, t);
  }
  async function runUserPromptExpansionHook(e, t, n) {
    let r = [];
    let o = t ? `/${e.name} ${t}` : `/${e.name}`;
    for await (let s of executeUserPromptExpansionHooks(e.source === "mcp" ? "mcp_prompt" : "slash_command", e.name, t, e.source, o, getToolPermissionContext(n).mode, n)) {
      if (s.message?.type === "progress") {
        continue;
      }
      if (s.blockingError) {
        let i = `UserPromptExpansion operation blocked by hook:
${s.blockingError.blockingError}

Original prompt: ${o}`;
        return {
          blocked: {
            messages: [wc(i, "warning", undefined, true)],
            shouldQuery: false,
            resultText: i,
            command: e
          }
        };
      }
      if (s.preventContinuation) {
        let i = s.stopReason ? `Operation stopped by hook: ${s.stopReason}` : "Operation stopped by hook";
        return {
          blocked: {
            messages: [In({
              content: i
            }), wc(i, "warning", undefined, true)],
            shouldQuery: false,
            resultText: i,
            command: e
          }
        };
      }
      if (s.additionalContexts?.length) {
        r.push(createAttachmentMessage({
          type: "hook_additional_context",
          content: s.additionalContexts,
          hookName: "UserPromptExpansion",
          toolUseID: `hook-${cTt.randomUUID()}`,
          hookEvent: "UserPromptExpansion"
        }));
      }
      if (s.message && !(s.message.type === "attachment" && s.message.attachment.type === "hook_success" && s.message.attachment.content === "")) {
        r.push(s.message);
      }
    }
    return {
      hookMessages: r
    };
  }
  async function processPromptSlashCommand(e, t, n, r, o = []) {
    let s = findCommand(e, n);
    if (!s) {
      throw new O7(`Unknown command: ${e}`);
    }
    if (s.type !== "prompt") {
      throw Error(`Unexpected ${s.type} command. Expected 'prompt' command. Use /${e} directly in the main conversation.`);
    }
    return pvl(s, t, r, [], o);
  }
  async function pvl(e, t, n, r = [], o = [], s, i = []) {
    if (eR() && !n.agentId) {
      let _ = cvl(e, t);
      let b = [`Skill "/${e.name}" is available for workers.`];
      if (e.description) {
        b.push(`Description: ${e.description}`);
      }
      if (e.whenToUse) {
        b.push(`When to use: ${e.whenToUse}`);
      }
      let S = e.allowedTools ?? [];
      if (S.length > 0) {
        b.push(`This skill grants workers additional tool permissions: ${S.join(", ")}`);
      }
      b.push(`
Instruct a worker to use this skill by including "Use the /${e.name} skill" in your Agent prompt. The worker has access to the Skill tool and will receive the skill's content and permissions when it invokes it.`);
      let E = [{
        type: "text",
        text: b.join(`
`)
      }];
      return {
        messages: [In({
          content: _,
          uuid: s
        }), In({
          content: E,
          isMeta: true
        })],
        shouldQuery: true,
        disallowedTools: parseToolListFromCLI(e.disallowedTools ?? []),
        model: e.model,
        effort: e.getEffort?.(t) ?? e.effort,
        command: e
      };
    }
    let a = await e.getPromptForCommand(t, n);
    let l = !ZT("hooks") || Hbe(e.source);
    if (e.hooks && l) {
      let _ = getSessionId();
      KEl(n.setAppState, _, e.hooks, e.name, e.type === "prompt" ? e.skillRoot : undefined);
    }
    let c = e.source ? `${e.source}:${e.name}` : e.name;
    let u = a.filter(_ => _.type === "text").map(_ => _.text).join(`

`);
    addInvokedSkill(e.name, c, u, n.agentId ?? null);
    let d = XEl(e.name);
    if (d) {
      n.applyAttributionOp({
        kind: "recordVerification",
        method: d
      });
    }
    n.options.activeSkill = attributionSkillName(e);
    let p = cvl(e, t);
    let m = parseToolListFromCLI(e.allowedTools ?? []);
    let f = parseToolListFromCLI(e.disallowedTools ?? []);
    if (f.length > 0) {
      SZn(n.setToolPermissionContext, f, "union");
    }
    let h = o.length > 0 || r.length > 0 ? [...o, ...r, ...a] : a;
    let g = await WXn(getAttachmentMessages(a.filter(_ => _.type === "text").map(_ => _.text).join(" "), n, null, [], {
      now: () => new Date().toISOString(),
      uuid: () => cTt.randomUUID()
    }, n.messages, "repl_main_thread", {
      planSlugSeed: t
    }));
    return {
      messages: [In({
        content: p,
        uuid: s
      }), In({
        content: h,
        isMeta: true
      }), ...g, ...i, createAttachmentMessage({
        type: "command_permissions",
        allowedTools: m,
        model: e.model
      })],
      shouldQuery: true,
      allowedTools: m,
      disallowedTools: f,
      model: e.model,
      effort: e.getEffort?.(t) ?? e.effort,
      command: e
    };
  }
  var cTt;
  var Vwm;
  var DLe = __lazy(() => {
    at();
    Bm();
    at();
    bLe();
    np();
    RV();
    ln();
    Ot();
    Gu();
    Dde();
    Noe();
    ASt();
    g7t();
    Uve();
    W7t();
    rR();
    Sl();
    je();
    Fp();
    Eve();
    dt();
    CO();
    zp();
    Zze();
    gNo();
    YEl();
    Rn();
    ro();
    S_();
    oy();
    bNo();
    Kf();
    IJ();
    K7t();
    dV();
    Lve();
    yS();
    Wk();
    TO();
    GL();
    TZn();
    avl();
    cTt = require("crypto");
    Vwm = new Set(["clear", "resume", "help", "exit", "feedback"]);
  });
  async function Zwm(e, t, n) {
    if (!e.mcpServers?.length) {
      return {
        clients: t,
        agentClients: [],
        tools: [],
        cleanup: async () => {}
      };
    }
    await xgt();
    let r = Hbe(e.source);
    let o = null;
    if (ZT("mcp") && !r) {
      o = "strictPluginOnlyCustomization";
    } else if (getStrictMcpConfig() && e.source !== "flagSettings") {
      o = "--strict-mcp-config";
    } else if (Pc("mcpAgentFrontmatter")) {
      o = Ql() ? "--safe-mode" : "--bare";
    } else if (getIsRemoteMode()) {
      o = "remote mode";
    } else if (doesEnterpriseMcpConfigExist()) {
      o = "enterprise MCP config";
    }
    if (o) {
      logForDebugging(`[Agent: ${e.agentType}] Skipping frontmatter MCP servers: blocked by ${o} (agent source: ${e.source})`, {
        level: "warn"
      });
      n?.(e.mcpServers.flatMap(p => typeof p === "string" ? p : Object.keys(p)), o);
      return {
        clients: t,
        agentClients: [],
        tools: [],
        cleanup: async () => {}
      };
    }
    let s = [];
    let i = [];
    let a = await Promise.all(e.mcpServers.map(async p => {
      let m = null;
      let f;
      let h = false;
      if (typeof p === "string") {
        if (f = p, getStrictMcpConfig()) {
          logForDebugging(`[Agent: ${e.agentType}] MCP server '${p}' skipped: string specs resolve from disk config, which --strict-mcp-config ignores`, {
            level: "warn"
          });
          i.push(p);
          return null;
        }
        if (m = getMcpConfigByName(p), !m) {
          logForDebugging(`[Agent: ${e.agentType}] MCP server not found: ${p}`, {
            level: "warn"
          });
          return null;
        }
      } else {
        let b = Object.entries(p);
        if (b.length !== 1) {
          logForDebugging(`[Agent: ${e.agentType}] Invalid MCP server spec: expected exactly one key`, {
            level: "warn"
          });
          return null;
        }
        let [S, E] = b[0];
        if (wGe(S)) {
          logForDebugging(`[Agent: ${e.agentType}] Skipping reserved MCP server name '${S}' in frontmatter`, {
            level: "warn"
          });
          return null;
        }
        if (E.type === "sse-ide" || E.type === "ws-ide") {
          logForDebugging(`[Agent: ${e.agentType}] Skipping internal-only MCP transport '${E.type}' for '${S}' in frontmatter`, {
            level: "warn"
          });
          return null;
        }
        f = S;
        m = {
          ...E,
          scope: "dynamic"
        };
        h = true;
      }
      let {
        blocked: g
      } = filterMcpServersByPolicy({
        [f]: m
      });
      if (g.length > 0) {
        logForDebugging(`[Agent: ${e.agentType}] MCP server '${f}' blocked by managed settings MCP policy`, {
          level: "warn"
        });
        s.push(f);
        return null;
      }
      let y = await kM(f, m);
      let _ = [];
      if (y.type === "connected") {
        _ = await AM(y);
        logForDebugging(`[Agent: ${e.agentType}] Connected to MCP server '${f}' with ${_.length} tools`);
      } else {
        logForDebugging(`[Agent: ${e.agentType}] Failed to connect to MCP server '${f}': ${y.type}`, {
          level: "warn"
        });
      }
      return {
        client: y,
        tools: _,
        isNewlyCreated: h
      };
    }));
    if (i.length > 0) {
      n?.(i, "--strict-mcp-config");
    }
    if (s.length > 0) {
      n?.(s, "managed settings MCP policy");
    }
    let l = [];
    let c = [];
    let u = [];
    for (let p of a) {
      if (!p) {
        continue;
      }
      if (l.push(p.client), p.isNewlyCreated) {
        c.push(p.client);
      }
      u.push(...p.tools);
    }
    let d = async () => {
      for (let p of c) {
        if (p.type === "connected") {
          try {
            await p.cleanup();
          } catch (m) {
            logForDebugging(`[Agent: ${e.agentType}] Error cleaning up MCP server '${p.name}': ${m}`, {
              level: "warn"
            });
          }
        }
      }
    };
    return {
      clients: [...t, ...l],
      agentClients: l,
      tools: u,
      cleanup: d
    };
  }
  function eCm(e) {
    return e.type === "assistant" || e.type === "user" || e.type === "progress" || e.type === "system" && "subtype" in e && e.subtype === "compact_boundary";
  }
  function tCm(e) {
    logForDebugging(`Failed to record fork-context-ref: ${e}`);
  }
  function mvl(e) {
    logForDebugging(`Failed to record sidechain transcript: ${e}`);
  }
  function nCm(e) {
    logForDebugging(`Failed to write agent metadata: ${e}`);
  }
  async function* I3({
    agentDefinition: e,
    promptMessages: t,
    toolUseContext: n,
    canUseTool: r,
    isAsync: o,
    canShowPermissionPrompts: s,
    forkContextMessages: i,
    querySource: a,
    spawnedBySkill: l,
    override: c,
    model: u,
    maxTurns: d,
    preserveToolUseResults: p,
    availableTools: m,
    allowedTools: f,
    onCacheSafeParams: h,
    contentReplacementState: g,
    stickyBetas: y,
    useExactTools: _,
    worktreePath: b,
    worktreeBranch: S,
    cwd: E,
    spawnMode: C,
    description: x,
    name: A,
    toolUseId: k,
    transcriptSubdir: I,
    spawnedByWorkflowRunId: O,
    onQueryProgress: M,
    onMcpServersBlocked: L,
    onModelRestricted: P,
    isTeammate: F = false,
    teammateContext: H,
    recordedUuids: U,
    extraMetadata: N,
    requiresStructuredOutput: W
  }) {
    let j = getToolPermissionContext(n);
    let z = j.mode;
    let V = F ? n.rootToolSurface.mainLoopModel : getMainLoopModel_export(n);
    let K = vse(Hve(e, V), V, u, z, P);
    let J = c?.agentId ? c.agentId : vN();
    if (I) {
      pya(J, I);
    }
    if (VTe()) {
      let Dt = n.agentId ?? getSessionId();
      sqn(J, e.agentType, Dt);
    }
    let Q;
    let Z = i ? gDo(i) : [];
    let ne = [...Z, ...t];
    let oe = i !== undefined ? forkPointUuidOf(Z) : undefined;
    let ee = i !== undefined ? hTe(n.readFileState) : u$(5000);
    let [re, se] = await Promise.all([c?.userContext ?? iE(), c?.systemContext ?? Tv(n.options.cacheBreakerPhrase)]);
    let ae = e.omitClaudeMd && !c?.userContext;
    let {
      claudeMd: de,
      ...be
    } = re;
    let fe = ae ? be : re;
    let {
      gitStatus: me,
      ...Te
    } = se;
    let ue = e.agentType === "Explore" || e.agentType === "Plan" ? Te : se;
    let ce = myn(C, z);
    let le = ce ?? e.permissionMode;
    let pe;
    let ve;
    function _e(Dt) {
      if (Dt === pe && ve) {
        return ve;
      }
      pe = Dt;
      let jt = Dt;
      if (le && (ce || Dt.mode !== "bypassPermissions" && Dt.mode !== "acceptEdits" && Dt.mode !== "auto")) {
        jt = {
          ...jt,
          mode: le
        };
      }
      let bn = n.requestDialog !== undefined;
      let Ct = s !== undefined ? !s : le === "bubble" || bn ? false : o;
      if (Ct) {
        jt = {
          ...jt,
          shouldAvoidPermissionPrompts: true
        };
      }
      if (o && !Ct) {
        jt = {
          ...jt,
          awaitAutomatedChecksBeforeDialog: true
        };
      }
      if (f !== undefined) {
        jt = {
          ...jt,
          alwaysAllowRules: {
            cliArg: Dt.alwaysAllowRules.cliArg,
            ...(Dt.alwaysAllowRules.mcpServerPolicy && {
              mcpServerPolicy: Dt.alwaysAllowRules.mcpServerPolicy
            }),
            session: [...f]
          }
        };
      }
      if (b && !jt.additionalWorkingDirectories.vZc(b)) {
        jt = {
          ...jt,
          additionalWorkingDirectories: new Map([...jt.additionalWorkingDirectories, [b, {
            path: b,
            source: "session"
          }]])
        };
      }
      ve = jt;
      return jt;
    }
    let xe = () => {
      let Dt = n.getAppState();
      let jt = _e(Dt.toolPermissionContext);
      if (jt === Dt.toolPermissionContext) {
        return Dt;
      }
      return {
        ...Dt,
        toolPermissionContext: jt
      };
    };
    let ke = [{
      kind: "model",
      mainLoopModel: K
    }, ...(e.effort !== undefined ? [{
      kind: "effort",
      effort: e.effort
    }] : [])];
    let Ie = _ ? m : uKe(e, m, o, false, F, PW(c?.agentContext ?? n.agentContext)).resolvedTools;
    let Ue = !_ && N_l(F) ? Ie.filter(Dt => !M_l.vZc(Dt.name)) : Ie;
    let Ge = Array.from(j.additionalWorkingDirectories.keys());
    let Be = c?.systemPrompt ? c.systemPrompt : await oCm(e, n, K, Ge);
    let We = iCm(Be, _ ?? false);
    let Ze = !_ && st(process.env.CLAUDE_CODE_ENABLE_APPEND_SUBAGENT_PROMPT) && n.options.appendSubagentSystemPrompt ? [...We, n.options.appendSubagentSystemPrompt] : We;
    let Tt = c?.abortController ? c.abortController : o ? new AbortController() : n.abortController;
    let kt = [];
    for await (let Dt of executeSubagentStartHooks(J, e.agentType, Tt.signal, undefined, n.getAppState)) {
      if (Dt.additionalContexts && Dt.additionalContexts.length > 0) {
        kt.push(...Dt.additionalContexts);
      }
    }
    if (kt.length > 0) {
      let Dt = createAttachmentMessage({
        type: "hook_additional_context",
        content: kt,
        hookName: "SubagentStart",
        toolUseID: ENo.randomUUID(),
        hookEvent: "SubagentStart"
      });
      ne.push(Dt);
    }
    let Ye = !ZT("hooks") || Hbe(e.source);
    if (e.hooks && Ye) {
      zyl(n.sessionHooksRegistry, J, e.hooks, `agent '${e.agentType}'`, true);
    }
    let ht = e.skills ?? [];
    if (ht.length > 0) {
      let Dt = await getSkillToolCommands(getProjectRoot());
      let jt = [];
      for (let hn of ht) {
        let vn = aCm(hn, Dt, e);
        if (!vn) {
          logForDebugging(`[Agent: ${e.agentType}] Warning: Skill '${hn}' specified in frontmatter was not found`, {
            level: "warn"
          });
          continue;
        }
        let zn = getCommand(vn, Dt);
        if (zn.type !== "prompt") {
          logForDebugging(`[Agent: ${e.agentType}] Warning: Skill '${hn}' is not a prompt-based skill`, {
            level: "warn"
          });
          continue;
        }
        jt.push({
          skillName: hn,
          skill: zn
        });
      }
      let {
        formatSkillLoadingMetadata: bn
      } = await Promise.resolve().then(() => (DLe(), X7t));
      let Ct = await Promise.all(jt.map(async ({
        skillName: hn,
        skill: vn
      }) => ({
        skillName: hn,
        skill: vn,
        content: await vn.getPromptForCommand("", {
          ...n,
          options: {
            ...n.options,
            isSkillPreload: true
          }
        })
      })));
      for (let {
        skillName: hn,
        skill: vn,
        content: zn
      } of Ct) {
        logForDebugging(`[Agent: ${e.agentType}] Preloaded skill '${hn}'`);
        let Pn = bn(hn, vn.progressMessage);
        ne.push(In({
          content: [{
            type: "text",
            text: Pn
          }, ...zn],
          isMeta: true
        }));
      }
    }
    let {
      clients: It,
      agentClients: Rt,
      tools: wt,
      cleanup: vt
    } = await Zwm(e, n.options.mcpClients, L);
    let {
      isToolDisallowed: yt
    } = DDo(e.disallowedTools);
    let gt = wt.filter(Dt => !yt(Dt));
    let Ft = gt.length > 0 ? gyp([...Ue, ...gt], "name") : Ue;
    if (!_) {
      for (let Dt of getDeferredToolsDeltaAttachment(Ft, K, ne, {
        callSite: "attachments_subagent",
        querySource: a
      })) {
        ne.push(createAttachmentMessage(Dt));
      }
    }
    let on = {
      isNonInteractiveSession: _ ? n.options.isNonInteractiveSession : o ? true : n.options.isNonInteractiveSession ?? false,
      appendSystemPrompt: n.options.appendSystemPrompt,
      appendSubagentSystemPrompt: n.options.appendSubagentSystemPrompt,
      spawnedBySkill: l,
      tools: Ft,
      commands: [],
      debug: n.options.debug,
      verbose: n.options.verbose,
      mainLoopModel: K,
      fallbackModel: n.options.fallbackModel,
      thinkingConfig: XPi(n.options.thinkingConfig, {
        useExactTools: _ ?? false,
        forwardSubagentText: n.options.forwardSubagentText ?? false,
        isAsync: o,
        isNonInteractiveSession: getIsNonInteractiveSession(),
        sessionDisplayExplicit: getThinkingDisplayExplicit()
      }),
      mcpClients: It,
      refreshMcpClients: n.options.refreshMcpClients ? () => {
        let Dt = n.options.refreshMcpClients();
        return Rt.length > 0 ? [...Dt, ...Rt] : Dt;
      } : undefined,
      mcpResources: n.options.mcpResources,
      agentDefinitions: n.options.agentDefinitions,
      messageClientPlatform: n.options.messageClientPlatform,
      toolAliases: n.options.toolAliases,
      autoCompactWindow: n.options.autoCompactWindow,
      fastMode: n.options.fastMode,
      cacheBreakerPhrase: n.options.cacheBreakerPhrase,
      activeGoal: n.options.activeGoal,
      ultraplanSessionUrl: n.options.ultraplanSessionUrl,
      ...(_ && {
        querySource: a
      }),
      requiresStructuredOutput: W
    };
    let rn = createSubagentContext(n, {
      options: on,
      agentId: J,
      agentType: e.agentType,
      agentContext: c?.agentContext,
      spawnedByWorkflowRunId: O,
      teammateContext: H,
      messages: ne,
      readFileState: ee,
      abortController: Tt,
      getAppState: xe,
      permissionLayers: ke,
      shareSetAppState: !o,
      criticalSystemReminder_EXPERIMENTAL: e.criticalSystemReminder_EXPERIMENTAL,
      contentReplacementState: g
    });
    if (c?.replHydration) {
      rn.replHydration = c.replHydration;
    }
    if (c?.onRetryStatus) {
      rn.onRetryStatus = c.onRetryStatus;
    }
    if (c?.subscribeRetryWake) {
      rn.subscribeRetryWake = c.subscribeRetryWake;
    }
    if (b) {
      rn.agentWorktree = b;
    }
    {
      let Dt = ne.some(bn => bn.type === "attachment" && bn.attachment.type === "skill_listing");
      let jt = await getSkillListingAttachments(rn).catch(bn => (logForDebugging(`[Agent: ${e.agentType}] Failed to compute skill listing attachment: ${bn}`, {
        level: "error"
      }), []));
      if (!Dt) {
        for (let bn of jt) {
          ne.push(createAttachmentMessage(bn));
        }
      }
    }
    if (p) {
      rn.preserveToolUseResults = true;
    }
    let Sn = null;
    let jn = null;
    let Xr = y ?? (_ ? wN(n.stickyBetas ?? getStickyBetas()) : Cae());
    let co = rCm({
      stickyBetas: y,
      useExactTools: _,
      name: A,
      recordedUuids: U
    });
    if (h) {
      let Dt = [...ne];
      Sn = Dt;
      h({
        systemPrompt: Ze,
        userContext: fe,
        systemContext: ue,
        toolUseContext: rn,
        forkContextMessages: ne,
        stickyBetas: Xr
      }, () => Dt);
    }
    let Yt = ne;
    let Ee = null;
    if (U !== undefined) {
      let Dt = ne.findLastIndex(jt => U.vZc(jt.uuid));
      Yt = ne.slice(Dt + 1);
      Ee = Dt >= 0 ? ne[Dt].uuid : null;
    } else if (i !== undefined && i === n.messages && n.agentId === undefined) {
      let Dt = Z.at(-1)?.uuid;
      if (Dt !== undefined) {
        Yt = ne.slice(Z.length);
        recordForkContextRef({
          agentId: J,
          parentSessionId: getSessionId(),
          parentLastUuid: Dt,
          contextLength: Z.length
        }).catch(tCm);
      }
    }
    recordSidechainTranscript(Yt, J, Ee).catch(mvl);
    writeAgentMetadata(J, {
      agentType: e.agentType,
      ...(e.agentType === "fork" && {
        isFork: isBuiltInAgent(e)
      }),
      ...(b && {
        worktreePath: b
      }),
      ...(b && S && {
        worktreeBranch: S
      }),
      ...(E && {
        cwd: E
      }),
      ...(ce && {
        spawnMode: ce
      }),
      ...(x && {
        description: x
      }),
      ...(A && {
        name: A
      }),
      ...(k && {
        toolUseId: k
      }),
      ...(c?.agentContext !== undefined && {
        spawnDepth: PW(c.agentContext)
      }),
      ...N
    }).catch(nCm);
    let Re = Yt.at(-1)?.uuid ?? Ee;
    if (U) {
      for (let Dt of Yt) {
        U.add(Dt.uuid);
      }
    }
    let Ce = false;
    let Fe;
    let Xe = [];
    let He = {
      onSetStreamMode: Dt => Xe.push({
        type: "spinner_mode",
        mode: Dt
      }),
      onApiMetrics: Dt => {
        if (Dt.type !== "start" && Dt.type !== "end") {
          return;
        }
        if (Dt.type === "start") {
          Fe = ENo.randomUUID();
          Xe.push({
            type: "api_metrics",
            event: {
              type: "start",
              ttftMs: Dt.ttftMs,
              id: Fe
            }
          });
        } else if (Fe != null) {
          Xe.push({
            type: "api_metrics",
            event: {
              type: "end",
              outputTokens: Dt.outputTokens,
              id: Fe
            }
          });
          Fe = undefined;
        }
      }
    };
    let Gt = {
      isSubagent: true
    };
    let mt;
    try {
      Q = K0a({
        agentId: J,
        agentType: e.agentType,
        parentAgentId: n.agentId
      });
      for await (let Dt of _U({
        messages: ne,
        systemPrompt: Ze,
        userContext: fe,
        systemContext: ue,
        canUseTool: r,
        toolUseContext: rn,
        querySource: a,
        spawnedBySkill: l,
        maxTurns: d ?? e.maxTurns,
        forkPointUuid: oe,
        stickyBetas: Xr,
        evictCacheOnComplete: co
      })) {
        if (M?.(), tKe(Dt)) {
          CNo(Dt, He, Gt);
          yield* Xe;
          Xe.length = 0;
          continue;
        }
        if (Dt.type === "attachment" && "hookEvent" in Dt.attachment && Dt.attachment.hookEvent === "SubagentStop" || Dt.type === "progress" && Dt.data?.type === "hook_progress" && Dt.data.hookEvent === "SubagentStop") {
          Ce = true;
        }
        if (Dt.type === "system" && Dt.subtype === "api_error") {
          yield Dt;
          continue;
        }
        if (Dt.type === "set_in_progress_tool_use_ids") {
          if (Dt.op.action === "remove") {
            yield Dt;
          }
          continue;
        }
        if (Dt.type === "attachment") {
          if (Sn) {
            Sn.push(Dt);
            jn = Hde(Sn, Dt, jn);
          }
          if (Dt.attachment.type === "max_turns_reached") {
            logForDebugging(`[Agent: ${e.agentType}] Reached max turns limit (${Dt.attachment.maxTurns})`);
            break;
          }
          yield Dt;
          continue;
        }
        if (eCm(Dt)) {
          if (Dt.type !== "progress") {
            if (Sn) {
              Sn.push(Dt);
              jn = Hde(Sn, Dt, jn);
            }
          }
          if (await recordSidechainTranscript([Dt], J, Re).catch(mvl), Dt.type !== "progress") {
            Re = Dt.uuid;
            U?.add(Dt.uuid);
          }
          if (o && k && (Dt.type === "assistant" || Dt.type === "user")) {
            let jt = Oyl();
            if (jt) {
              for (let bn of xS([Dt])) {
                let Ct = tYt({
                  toolUseID: `agent_${J}`,
                  parentToolUseID: k,
                  data: {
                    message: bn,
                    type: "agent_progress",
                    prompt: "",
                    agentId: J,
                    agentType: e.agentType,
                    resolvedModel: K,
                    ...(x && {
                      description: x
                    })
                  }
                });
                for (let hn of pSt(Ct, Ft)) {
                  jt.write(hn).catch(vn => logForDebugging(`bg-subagent progress write failed: ${vn}`, {
                    level: "warn"
                  }));
                }
              }
            }
          }
          yield Dt;
        }
      }
      if (Ce = true, Tt.signal.aborted) {
        throw new xc();
      }
      if (isBuiltInAgent(e) && e.callback) {
        e.callback();
      }
    } catch (Dt) {
      throw mt = Dt, Dt;
    } finally {
      if (Sn && jn) {
        Sn.push(...jn.preserved);
        jn = null;
      }
      let Dt = o && Ce && !Tt.signal.aborted && (m8a(J, n.taskRegistry) || Vka(J, n.taskRegistry));
      let jt = [{
        name: "SubagentStop",
        run: async () => {
          if (Ce) {
            return;
          }
          try {
            for await (let bn of executeStopHooks(undefined, undefined, 5000, false, J, rn, undefined, e.agentType)) {
              ;
            }
          } catch (bn) {
            logForDebugging(`[runAgent] SubagentStop on interrupted query failed: ${bn}`);
          }
        }
      }, {
        name: "mcp",
        run: () => vt()
      }, {
        name: "sessionHooks",
        run: () => {
          if (e.hooks) {
            n.sessionHooksRegistry.clear(J);
          }
        }
      }, {
        name: "promptCacheTracking",
        run: () => {
          if (BX()) {
            Kga(J);
          }
        }
      }, {
        name: "propagateNestedMemory",
        run: () => {
          if (eR() && gI.CLAUDE_CODE_COORDINATOR_PROPAGATE_NESTED_MEMORY) {
            let bn = n.pendingNestedMemoryTriggers;
            if (!bn) {
              logForDebugging("propagateNestedMemory: parent context has no pendingNestedMemoryTriggers; skipping");
            } else {
              let Ct = `${t5.sep}.claude${t5.sep}worktrees${t5.sep}`;
              for (let hn of Object.keys(rn.loadedNestedMemoryPaths ?? {})) {
                if (!["CLAUDE.md", "CLAUDE.local.md"].includes(t5.basename(hn))) {
                  continue;
                }
                let vn = hn;
                let zn = hn.indexOf(Ct);
                if (zn >= 0) {
                  let Pn = hn.slice(0, zn);
                  let Lr = hn.slice(zn + Ct.length);
                  let ao = Lr.indexOf(t5.sep);
                  if (ao < 0) {
                    continue;
                  }
                  let Nn = Lr.slice(ao + 1);
                  vn = t5.join(Pn, Nn);
                  let Tr = t5.resolve(Pn);
                  if (!t5.resolve(vn).startsWith(Tr + t5.sep)) {
                    continue;
                  }
                } else if (b && hn.startsWith(b + t5.sep)) {
                  continue;
                }
                if (n.loadedNestedMemoryPaths?.[vn]) {
                  continue;
                }
                if (!bn.includes(vn)) {
                  bn.push(vn);
                }
              }
            }
          }
        }
      }, {
        name: "readFileState",
        run: () => rn.readFileState.clear()
      }, {
        name: "sentSkillNames",
        run: () => clearSentSkillNamesForAgent(J)
      }, {
        name: "initialMessages",
        run: () => {
          ne.length = 0;
        }
      }, {
        name: "liveMessages",
        run: () => {
          if (Sn) {
            Sn.length = 0;
          }
        }
      }, {
        name: "replHydrationSnapshot",
        run: () => {
          rn.replHydration = undefined;
        }
      }, {
        name: "perfetto",
        run: () => R5e(J)
      }, {
        name: "otelSubagentSpan",
        run: () => {
          let bn = Tt.signal.aborted;
          Y0a(Q, {
            success: mt === undefined && !bn,
            ...(mt !== undefined && !bn && {
              error: mt instanceof Error ? mt.message : String(mt)
            })
          });
        }
      }, {
        name: "transcriptSubdir",
        run: () => mya(J)
      }, {
        name: "todos",
        run: () => n.agentLifecycle.clearTodos(J)
      }, {
        name: "replContext",
        run: () => {
          let bn = n.getReplContexts()[J];
          if (bn) {
            bn.clearAllTimers();
            n.setReplContext(J, undefined);
          }
        }
      }, {
        name: "nonShellMonitors",
        keepaliveGated: true,
        run: () => {
          Wyl(J, n.taskRegistry);
        }
      }, {
        name: "shellTasks",
        keepaliveGated: true,
        run: () => zka(J, n.taskRegistry)
      }];
      for (let bn of jt) {
        if (Dt && bn.keepaliveGated) {
          continue;
        }
        try {
          await bn.run();
        } catch (Ct) {
          logForDebugging(`[runAgent cleanup] stage '${bn.name}' failed: ${Ct instanceof Error ? Ct.message : String(Ct)}`);
        }
      }
    }
  }
  function rCm({
    stickyBetas: e,
    useExactTools: t,
    name: n,
    recordedUuids: r
  }) {
    return e === undefined && !t && n === undefined && r === undefined;
  }
  function gDo(e) {
    let t = new Set();
    for (let n of e) {
      if (n?.type === "user") {
        let o = n.message.content;
        if (Array.isArray(o)) {
          for (let s of o) {
            if (s.type === "tool_result" && s.tool_use_id) {
              t.add(s.tool_use_id);
            }
          }
        }
      }
    }
    return e.filter(n => {
      if (n?.type === "assistant") {
        let o = n.message.content;
        if (Array.isArray(o)) {
          return !o.some(i => i.type === "tool_use" && i.id && !t.vZc(i.id));
        }
      }
      return true;
    });
  }
  async function oCm(e, t, n, r) {
    try {
      let o = e.getSystemPrompt({
        toolUseContext: t
      });
      return await Z7t([o], n, r);
    } catch (o) {
      return Z7t(["You are an agent for Claude Code, Anthropic's official CLI for Claude. Given the user's message, you should use the tools available to complete the task. Complete the task fully\u2014don't gold-plate, but don't leave it half-done. When you complete the task, respond with a concise report covering what was done and any key findings \u2014 the caller will relay this to the user, so it only needs the essentials."], n, r);
    }
  }
  function iCm(e, t) {
    if (t) {
      return e;
    }
    let n = OZn();
    if (n === null || e.some(r => r.includes("# Scratchpad Directory"))) {
      return e;
    }
    return [...e, n];
  }
  function aCm(e, t, n) {
    if (hasCommand(e, t)) {
      return e;
    }
    let r = ii(n.agentType, ":");
    if (r) {
      let i = `${r}:${e}`;
      if (hasCommand(i, t)) {
        return i;
      }
    }
    let o = `:${e}`;
    let s = t.find(i => i.name.endsWith(o));
    if (s) {
      return s.name;
    }
    return null;
  }
  async function fvl({
    agentId: e,
    removedWorktreePath: t,
    spawnMetadata: n
  }) {
    let r = await readAgentMetadata(e).catch(() => null);
    let o = r?.cwd && r.cwd !== t ? r.cwd : undefined;
    await writeAgentMetadata(e, {
      ...n,
      ...(o && {
        cwd: o
      }),
      ...(r?.stoppedByUser && {
        stoppedByUser: true
      })
    });
  }
  var ENo;
  var t5;
  var Uve = __lazy(() => {
    je();
    ro();
    mSt();
    at();
    Bm();
    dz();
    LG();
    RV();
    BTe();
    gWt();
    ADe();
    IWt();
    eA();
    Iw();
    yFn();
    ry();
    OWt();
    S7t();
    QXn();
    _h();
    rR();
    Sl();
    wb();
    pr();
    YW();
    gn();
    dt();
    Zl();
    qI();
    CO();
    Kyl();
    Sp();
    ro();
    Bbt();
    Bbe();
    HT();
    Fy();
    fa();
    IJ();
    Zn();
    Smt();
    GG();
    XN();
    GL();
    $ve();
    jve();
    iDe();
    kS();
    ENo = require("crypto");
    t5 = require("path");
  });
  function gvl(e, t) {
    if (!t) {
      return e;
    }
    return e.map(n => {
      if (n.type === "user") {
        return {
          ...n,
          sourceToolUseID: t
        };
      }
      return n;
    });
  }
  function yvl(e, t) {
    let n = e.message.content.find(r => r.type === "tool_use" && r.name === t);
    return n && n.type === "tool_use" ? n.id : undefined;
  }
  function Qz(e) {
    return Me.CLAUDE_CODE_DISABLE_BUNDLED_SKILLS || (e ?? getInitialSettings()).disableBundledSkills === true;
  }
  function DZn(e, t) {
    return e.type === "prompt" && e.source === "builtin" && Qz(t);
  }
  var LLe = __lazy(() => {
    pr();
  });
  function RNo(e, t) {
    let n = e.startsWith("/") ? e.substring(1) : e;
    if (n === t) {
      return true;
    }
    if (n.endsWith(":*") || n.endsWith(" *")) {
      let r = n.slice(0, -2);
      return t.startsWith(r);
    }
    return false;
  }
  function MZn(e, t) {
    let {
      commandName: n,
      userTypedThisTurn: r,
      isMainSession: o,
      permissionContext: s
    } = t;
    if (e.disableModelInvocation && !r) {
      return {
        reason: "disable_model_invocation",
        message: `Skill ${n} cannot be used with ${"Skill"} tool due to disable-model-invocation`,
        errorCode: 4
      };
    }
    if (o) {
      let a = getSessionSkillAllowlist();
      if (a !== undefined && filterSkillCommandsByAllowlist([e], a).length === 0) {
        return {
          reason: "not_allowlisted",
          message: `Skill ${n} is not in this session's skills allowlist`,
          errorCode: 8
        };
      }
    }
    let i = getSkillOverride(e);
    if (i === "off" || i === "user-invocable-only" && !r) {
      let a = getInitialSettings();
      let l = DZn(e, a);
      let c = a.skillOverrides?.[e.name];
      let u = c === "user-invocable-only" || c === "off";
      let d = "by the disableBundledSkills setting or CLAUDE_CODE_DISABLE_BUNDLED_SKILLS env var";
      return {
        reason: "override_disabled",
        message: `Skill ${n} is disabled for model invocation ${l ? u ? "by the disableBundledSkills setting or CLAUDE_CODE_DISABLE_BUNDLED_SKILLS env var, and by an explicit skillOverrides entry" : "by the disableBundledSkills setting or CLAUDE_CODE_DISABLE_BUNDLED_SKILLS env var" : "in skillOverrides settings"}`,
        errorCode: 7,
        killSwitchOnly: l && !u
      };
    }
    if (e.type !== "prompt") {
      let a = e.type === "local-jsx" ? "UI" : "built-in CLI";
      return {
        reason: "not_prompt_type",
        message: `${n} is a ${a} command, not a skill. Ask the user to run /${n} themselves \u2014 it cannot be invoked via the ${"Skill"} tool.`,
        errorCode: 5
      };
    }
    if (e.isMcp && e.loadedFrom !== "mcp") {
      return {
        reason: "mcp_prompt",
        message: `${n} is an MCP prompt, not a skill. Ask the user to run /${n} themselves \u2014 it cannot be invoked via the ${"Skill"} tool.`,
        errorCode: 12
      };
    }
    if (s !== undefined) {
      let a = getDenyRuleForTool(s, {
        name: "Skill"
      }) ?? getDenyRuleForTool(s, {
        name: opa(e.name)
      });
      if (a) {
        return {
          reason: "deny_rule",
          message: "Skill execution blocked by permission rules",
          errorCode: 11,
          rule: a
        };
      }
      let l = getRuleByContentsForToolName(s, "Skill", "deny");
      for (let [c, u] of l.entries()) {
        if (RNo(c, n)) {
          return {
            reason: "deny_rule",
            message: "Skill execution blocked by permission rules",
            errorCode: 11,
            rule: u
          };
        }
      }
    }
    return null;
  }
  var xNo = __lazy(() => {
    at();
    Bm();
    LLe();
    oy();
  });
  function _vl(e) {
    if ("status" in e && e.status === "forked") {
      return pA.jsx(Vn, {
        height: 1,
        children: pA.jsx(Text, {
          children: pA.jsx(Hn, {
            children: ["Done"]
          })
        })
      });
    }
    let t = ["Successfully loaded skill"];
    if ("allowedTools" in e && e.allowedTools && e.allowedTools.length > 0) {
      let n = e.allowedTools.length;
      t.push(`${n} ${un(n, "tool")} allowed`);
    }
    if ("model" in e && e.model) {
      t.push(e.model);
    }
    return pA.jsx(Vn, {
      height: 1,
      children: pA.jsx(Text, {
        children: pA.jsx(Hn, {
          children: t
        })
      })
    });
  }
  function bvl({
    skill: e
  }, {
    commands: t
  }) {
    if (!e) {
      return null;
    }
    let n = e.trim();
    let r = n.startsWith("/") ? n.substring(1) : n;
    let o = t?.find(a => a.name === r);
    let s = o?.loadedFrom === "commands_DEPRECATED" ? `/${r}` : r;
    let i = h7t(o?.type === "prompt" ? o.source : undefined, r);
    return i ? `${s} \xB7 by ${i}` : s;
  }
  function NZn(e, {
    tools: t,
    verbose: n
  }) {
    if (!e.length) {
      return pA.jsx(Vn, {
        height: 1,
        children: pA.jsx(Text, {
          dimColor: true,
          children: "Initializing\u2026"
        })
      });
    }
    let r = n ? e : e.slice(-3);
    let o = e.length - r.length;
    let {
      inProgressToolUseIDs: s
    } = G7t(e.map(i => i.data));
    return pA.jsx(Vn, {
      children: pA.jsxs(gXd, {
        flexDirection: "column",
        children: [pA.jsx(_Gt, {
          children: r.map(i => pA.jsx(gXd, {
            height: 1,
            overflow: "hidden",
            children: pA.jsx(dZ, {
              message: i.data.message,
              lookups: Yve,
              addMargin: false,
              tools: t,
              commands: [],
              verbose: n,
              inProgressToolUseIDs: s,
              progressMessagesForMessage: [],
              shouldAnimate: false,
              shouldShowDot: false,
              style: "condensed",
              isTranscriptMode: false,
              isStatic: true
            })
          }, i.uuid))
        }), pA.jsx(B1, {
          count: o,
          unit: "tool use"
        })]
      })
    });
  }
  function Svl(e, {
    progressMessagesForMessage: t,
    tools: n,
    verbose: r
  }) {
    return pA.jsxs(pA.Fragment, {
      children: [NZn(t, {
        tools: n,
        verbose: r
      }), pA.jsx(jme, {})]
    });
  }
  function Tvl(e, {
    progressMessagesForMessage: t,
    tools: n,
    verbose: r
  }) {
    return pA.jsxs(pA.Fragment, {
      children: [NZn(t, {
        tools: n,
        verbose: r
      }), pA.jsx(Rw, {
        result: e,
        verbose: r
      })]
    });
  }
  var pA;
  var Evl = __lazy(() => {
    Xq();
    KG();
    R7t();
    Ai();
    YX();
    sTt();
    Wl();
    et();
    g7t();
    ro();
    Zn();
    pA = __toESM(ie(), 1);
  });
  function uCm(e) {
    let t = new Map();
    for (let n of e) {
      let r = t.get(n.name);
      if (r === undefined || r.disableModelInvocation && !n.disableModelInvocation) {
        t.set(n.name, n);
      }
    }
    return [...t.values()];
  }
  async function kNo(e) {
    let t = e.getAppState().mcp.commands.filter(r => r.type === "prompt" && r.loadedFrom === "mcp");
    let n = await getCommands(getProjectRoot());
    return dropShadowedFallbackSkills(uCm([...n, ...t]));
  }
  function dCm(e, t) {
    if (t.agentId !== undefined) {
      return false;
    }
    let n = new RegExp(`(?<!\\S)/${FA(e)}(?=$|\\s)`);
    for (let r = t.messages.length - 1; r >= t.turnStartIndex; r--) {
      let o = t.messages[r];
      if (o.type !== "user" || o.isMeta) {
        continue;
      }
      let s = o.message.content;
      if (typeof s === "string") {
        if (s.includes(`<${"command-message"}>`)) {
          continue;
        }
      } else if (s.some(i => i.type === "tool_result")) {
        continue;
      }
      if (n.test(qO(o) ?? "")) {
        return true;
      }
    }
    return false;
  }
  async function pCm(e, t, n, r, o, s, i, a) {
    let l = Date.now();
    let c = vN();
    let u = builtInCommandNames().vZc(t);
    let d = vvl(e);
    let p = e.source === "bundled";
    let {
      sanitizedName: m,
      skillNameHash: f
    } = Iut({
      rawName: t,
      canonicalName: e.name,
      isMcp: e.loadedFrom === "mcp",
      isBuiltIn: u,
      isBundled: p,
      isOfficial: d
    });
    let h = r.queryTracking?.depth ?? 0;
    let g = h > 0 ? "nested-skill" : "claude-proactive";
    let y = r.agentId;
    logEvent("tengu_skill_tool_invocation", {
      command_name: m,
      _PROTO_skill_name: t,
      ...f,
      execution_context: "fork",
      invocation_trigger: g,
      query_depth: h,
      ...gso(i, i !== undefined && shippedCommandNames().vZc(i)),
      ...(y && {
        parent_agent_id: br(y)
      }),
      ...OSe(e.source, e.loadedFrom, e.kind, e.createdBy),
      ...Xze(e.source, t),
      attribution_shown: h7t(e.source, t) !== null,
      skill_content_chars: e.contentLength,
      ...false,
      ...(e.pluginInfo && {
        ...DSe(e.pluginInfo),
        plugin_name: d ? e.pluginInfo.pluginManifest.name : "third-party",
        plugin_repository: d ? e.pluginInfo.repository : "third-party"
      })
    });
    nqt(t, e, g);
    let {
      modifiedGetAppState: _,
      contextLayers: b,
      baseAgent: S,
      promptMessages: E,
      skillContent: C
    } = await prepareForkedCommandContext(e, n || "", r);
    let x = e.getEffort?.(n || "") ?? e.effort;
    let A = x !== undefined ? {
      ...S,
      effort: x
    } : S;
    let k = [];
    logForDebugging(`SkillTool executing forked skill ${t} with agent ${A.agentType}`);
    try {
      for await (let M of I3({
        agentDefinition: A,
        promptMessages: E,
        toolUseContext: {
          ...r,
          getAppState: _,
          permissionLayers: b.length > 0 ? [...(r.permissionLayers ?? []), ...b] : r.permissionLayers
        },
        canUseTool: o,
        isAsync: false,
        querySource: "agent:custom",
        spawnedBySkill: attributionSkillName(e),
        model: e.model,
        availableTools: r.options.tools,
        override: {
          agentId: c
        }
      })) {
        if (M.type === "api_metrics") {
          a?.(M);
          continue;
        }
        if (M.type === "set_in_progress_tool_use_ids" || M.type === "spinner_mode") {
          continue;
        }
        if (k.push(M), (M.type === "assistant" || M.type === "user") && a) {
          let L = xS([M]);
          for (let P of L) {
            if (P.message.content.some(H => H.type === "tool_use" || H.type === "tool_result")) {
              a({
                type: "progress",
                toolUseID: `skill_${s.message.id}`,
                data: {
                  message: P,
                  type: "skill_progress",
                  prompt: C,
                  agentId: c,
                  agentType: A.agentType,
                  description: e.description
                }
              });
            }
          }
        }
      }
      let I = extractResultText(k, "Skill execution completed");
      k.length = 0;
      let O = Date.now() - l;
      logForDebugging(`SkillTool forked skill ${t} completed in ${O}ms`);
      Pe("skill_invoke");
      return {
        data: {
          success: true,
          commandName: t,
          status: "forked",
          agentId: c,
          result: I
        }
      };
    } finally {
      clearInvokedSkillsForAgent(c);
    }
  }
  function gCm(e) {
    for (let t of Object.keys(e)) {
      if (hCm.vZc(t)) {
        continue;
      }
      let n = e[t];
      if (n === undefined || n === null) {
        continue;
      }
      if (Array.isArray(n) && n.length === 0) {
        continue;
      }
      if (typeof n === "object" && !Array.isArray(n) && Object.keys(n).length === 0) {
        continue;
      }
      return false;
    }
    return true;
  }
  function vvl(e) {
    if (e.source !== "plugin" || !e.pluginInfo?.repository) {
      return false;
    }
    return BI(Yo(e.pluginInfo.repository).marketplace);
  }
  var mCm;
  var fCm;
  var pTt;
  var hCm;
  var ANo = __lazy(() => {
    at();
    Bm();
    g7t();
    ci();
    Sl();
    je();
    oy();
    Kf();
    Wk();
    at();
    np();
    ln();
    Ot();
    y7t();
    CO();
    ro();
    Eo();
    Zn();
    dV();
    Lve();
    GL();
    Uve();
    _pt();
    xNo();
    uTe();
    Evl();
    B_();
    mCm = we(() => v.object({
      skill: v.string().describe("The name of a skill from the available-skills list. Do not guess names."),
      args: v.string().optional().describe("Optional arguments for the skill")
    }));
    fCm = we(() => {
      let e = v.object({
        success: v.boolean().describe("Whether the skill is valid"),
        commandName: v.string().describe("The name of the skill"),
        allowedTools: v.array(v.string()).optional().describe("Tools allowed by this skill"),
        model: v.string().optional().describe("Model override if specified"),
        status: v.literal("inline").optional().describe("Execution status")
      });
      let t = v.object({
        success: v.boolean().describe("Whether the skill completed successfully"),
        commandName: v.string().describe("The name of the skill"),
        status: v.literal("forked").describe("Execution status"),
        agentId: v.string().describe("The ID of the sub-agent that executed the skill"),
        result: v.string().describe("The result from the forked skill execution")
      });
      return v.union([e, t]);
    });
    pTt = Xs({
      name: "Skill",
      searchHint: "invoke a slash-command skill",
      isEnabled() {
        if (getDisableSlashCommands()) {
          return false;
        }
        return true;
      },
      maxResultSizeChars: 1e5,
      get inputSchema() {
        return mCm();
      },
      get outputSchema() {
        return fCm();
      },
      description: async ({
        skill: e
      }) => `Execute skill: ${e}`,
      prompt: async () => getPrompt(getProjectRoot()),
      toAutoClassifierInput: ({
        skill: e
      }) => e ?? "",
      async validateInput({
        skill: e
      }, t) {
        let n = e.trim();
        if (!n) {
          Ae("skill_invoke", "skill_invoke_empty_name");
          return {
            result: false,
            message: `Invalid skill format: ${e}`,
            errorCode: 1
          };
        }
        let r = n.startsWith("/");
        if (r) {
          logEvent("tengu_skill_tool_slash_prefix", {});
        }
        let o = r ? n.substring(1) : n;
        let s;
        if (gLe()) {
          let c = await HXn(o);
          if (!c.ok) {
            s = c.reason;
          }
        }
        let i = await kNo(t);
        let a = findCommand(o, i);
        if (s !== undefined && (!a || Ryl(a))) {
          Ae("skill_invoke", "skill_invoke_not_materialized");
          return {
            result: false,
            message: `Skill ${o} could not be downloaded (${s}). Proceed without it.`,
            errorCode: 10
          };
        }
        if (!a) {
          let c = hLe(o, i.map(u => ({
            name: getCommandName(u),
            aliases: u.aliases
          })), {
            maxEditDistance: 2
          });
          Ae("skill_invoke", "skill_invoke_not_found");
          return {
            result: false,
            message: c ? `Unknown skill: ${o}. Did you mean ${c}?` : `Unknown skill: ${o}`,
            errorCode: 2
          };
        }
        if (a.type === "prompt" && a.context === "fork" && t.options.spawnedBySkill === attributionSkillName(a)) {
          Ae("skill_invoke", "skill_invoke_fork_recursion");
          logEvent("tengu_skill_tool_fork_recursion_blocked", {});
          return {
            result: false,
            message: `Skill ${o} is already executing in this forked context \u2014 you are the subagent running it. Execute the instructions in the skill body directly instead of re-invoking the ${"Skill"} tool.`,
            errorCode: 9
          };
        }
        let l = MZn(a, {
          commandName: o,
          userTypedThisTurn: dCm(o, t),
          isMainSession: t.agentId === undefined,
          permissionContext: undefined
        });
        if (l !== null) {
          switch (l.reason) {
            case "disable_model_invocation":
              Ae("skill_invoke", "skill_invoke_model_disabled");
              break;
            case "not_allowlisted":
              Ae("skill_invoke", "skill_invoke_not_allowlisted");
              break;
            case "override_disabled":
              Ae("skill_invoke", l.killSwitchOnly ? "skill_invoke_bundled_skills_disabled" : "skill_invoke_override_disabled");
              break;
            case "not_prompt_type":
              Ae("skill_invoke", "skill_invoke_not_prompt_type");
              break;
            case "mcp_prompt":
              break;
            case "deny_rule":
              break;
          }
          return {
            result: false,
            message: l.message,
            errorCode: l.errorCode
          };
        }
        return {
          result: true
        };
      },
      async checkPermissions({
        skill: e,
        args: t
      }, n) {
        let r = e.trim();
        let o = r.startsWith("/") ? r.substring(1) : r;
        let s = getToolPermissionContext(n);
        let i = await kNo(n);
        let a = findCommand(o, i);
        let l = p => RNo(p, o);
        let c = getRuleByContentsForTool(s, pTt, "deny");
        for (let [p, m] of c.entries()) {
          if (l(p)) {
            return {
              behavior: "deny",
              message: "Skill execution blocked by permission rules",
              decisionReason: {
                type: "rule",
                rule: m
              }
            };
          }
        }
        let u = getRuleByContentsForTool(s, pTt, "allow");
        for (let [p, m] of u.entries()) {
          if (l(p)) {
            return {
              behavior: "allow",
              updatedInput: {
                skill: e,
                args: t
              },
              decisionReason: {
                type: "rule",
                rule: m
              }
            };
          }
        }
        if (a?.type === "prompt" && gCm(a)) {
          return {
            behavior: "allow",
            updatedInput: {
              skill: e,
              args: t
            },
            decisionReason: undefined
          };
        }
        let d = [{
          type: "addRules",
          rules: [{
            toolName: "Skill",
            ruleContent: o
          }],
          behavior: "allow",
          destination: "localSettings"
        }, {
          type: "addRules",
          rules: [{
            toolName: "Skill",
            ruleContent: `${o}:*`
          }],
          behavior: "allow",
          destination: "localSettings"
        }];
        return {
          behavior: "ask",
          message: `Execute skill: ${o}`,
          decisionReason: undefined,
          suggestions: d,
          updatedInput: {
            skill: e,
            args: t
          },
          metadata: a ? {
            command: a
          } : undefined
        };
      },
      async call({
        skill: e,
        args: t
      }, n, r, o, s) {
        let i = e.trim();
        let a = i.startsWith("/") ? i.substring(1) : i;
        let l = n.options.activeSkill;
        let c = l ?? n.options.spawnedBySkill;
        n.options.activeSkill = a;
        let u = await kNo(n);
        let d = findCommand(a, u);
        if (d) {
          n.options.activeSkill = attributionSkillName(d);
        }
        if (jXn(a), d?.type === "prompt" && d.pluginInfo) {
          Tq(d.pluginInfo.repository);
        }
        if (d?.type === "prompt" && d.context === "fork") {
          try {
            return await pCm(d, a, t, n, r, o, c, s);
          } finally {
            n.options.activeSkill = l;
          }
        }
        let {
          processPromptSlashCommand: p
        } = await Promise.resolve().then(() => (DLe(), X7t));
        let m = await p(a, t || "", u, n);
        if (!m.shouldQuery) {
          throw Ae("skill_invoke", "skill_invoke_process_failed"), Error("Command processing failed");
        }
        let f = m.allowedTools || [];
        let h = m.model;
        let g = m.effort;
        let y = builtInCommandNames().vZc(a);
        let _ = d?.type === "prompt" && d.source === "bundled";
        let b = d?.type === "prompt" && vvl(d);
        let {
          sanitizedName: S,
          skillNameHash: E
        } = Iut({
          rawName: a,
          canonicalName: d?.name ?? a,
          isMcp: d?.loadedFrom === "mcp",
          isBuiltIn: y,
          isBundled: _,
          isOfficial: b
        });
        let C = n.queryTracking?.depth ?? 0;
        let x = C > 0 ? "nested-skill" : "claude-proactive";
        let A = n.agentId;
        let k = d?.type === "prompt" ? d.source : undefined;
        logEvent("tengu_skill_tool_invocation", {
          command_name: S,
          _PROTO_skill_name: a,
          ...E,
          execution_context: "inline",
          invocation_trigger: x,
          query_depth: C,
          ...gso(c, c !== undefined && shippedCommandNames().vZc(c)),
          ...(A && {
            parent_agent_id: br(A)
          }),
          ...OSe(k, d?.loadedFrom, d?.kind, d?.type === "prompt" ? d.createdBy : undefined),
          ...Xze(k, a),
          attribution_shown: h7t(k, a) !== null,
          ...(d?.type === "prompt" && {
            skill_content_chars: d.contentLength
          }),
          ...false,
          ...(d?.type === "prompt" && d.pluginInfo && {
            ...DSe(d.pluginInfo),
            plugin_name: b ? d.pluginInfo.pluginManifest.name : "third-party",
            plugin_repository: b ? d.pluginInfo.repository : "third-party"
          })
        });
        nqt(a, d, x);
        let I = n.toolUseId ?? yvl(o, "Skill");
        let O = gvl(m.messages.filter(L => {
          if (L.type === "progress") {
            return false;
          }
          if (L.type === "user" && "message" in L) {
            let P = L.message.content;
            if (typeof P === "string" && P.includes(`<${"command-message"}>`)) {
              return false;
            }
          }
          return true;
        }), I);
        logForDebugging(`SkillTool returning ${O.length} newMessages for skill ${a}`);
        Pe("skill_invoke");
        let M = [];
        if (f.length > 0) {
          M.push({
            kind: "allowed_tools",
            allowedTools: f
          });
        }
        if (h) {
          M.push({
            kind: "model",
            mainLoopModel: resolveSkillModelOverride(h, n.options.mainLoopModel)
          });
        }
        if (g !== undefined) {
          M.push({
            kind: "effort",
            effort: g
          });
        }
        return {
          data: {
            success: true,
            commandName: a,
            allowedTools: f.length > 0 ? f : undefined,
            model: h
          },
          newMessages: O,
          ...(M.length > 0 && {
            contextLayers: M
          })
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        if ("status" in e && e.status === "forked") {
          return {
            type: "tool_result",
            tool_use_id: t,
            content: `Skill "${e.commandName}" completed (forked execution).

Result:
${e.result}`
          };
        }
        return {
          type: "tool_result",
          tool_use_id: t,
          content: `Launching skill: ${e.commandName}`
        };
      },
      renderToolResultMessage: _vl,
      renderToolUseMessage: bvl,
      renderToolUseProgressMessage: NZn,
      renderToolUseRejectedMessage: Svl,
      renderToolUseErrorMessage: Tvl
    });
    hCm = new Set(["type", "progressMessage", "contentLength", "contentHash", "argNames", "model", "effort", "source", "pluginInfo", "disableNonInteractive", "skillRoot", "context", "agent", "getPromptForCommand", "getEffort", "declaredFields", "createdBy", "fallback", "unqualifiedName", "urlTemplate", "name", "description", "hasUserSpecifiedDescription", "isEnabled", "isHidden", "aliases", "subcommands", "isMcp", "argumentHint", "whenToUse", "paths", "version", "disableModelInvocation", "userInvocable", "loadedFrom", "immediate", "userFacingName"]);
  });
  function nYt(e) {
    return new Po(De({
      error_type: "PROVENANCE_REQUIRED",
      source: "target",
      message: e ?? "URL not in provenance set. web_fetch can only retrieve URLs that appeared in a user message or a prior web_fetch result. Ask the user to include the URL in a message first."
    }), "web-fetch-ccr-proxy");
  }
  async function SCm(e) {
    let {
      tool: t,
      denial: n,
      prompt: r,
      context: o,
      canUseTool: s,
      parentMessage: i
    } = e;
    let a = getToolPermissionContext(o);
    if (a.mode === "bypassPermissions" || a.mode === "dontAsk" || a.shouldAvoidPermissionPrompts) {
      return {
        outcome: "suppressed_mode"
      };
    }
    if (Buffer.byteLength(n.url, "utf8") > 2048) {
      return {
        outcome: "suppressed_url_too_long"
      };
    }
    if ((await t.checkPermissions?.({
      url: n.url,
      prompt: r
    }, o))?.behavior === "deny") {
      return {
        outcome: "suppressed_deny_rule"
      };
    }
    let c = s(t, {
      url: n.url,
      prompt: r
    }, o, i, wvl.randomUUID(), {
      behavior: "ask",
      message: `${t.name} was denied by this session's URL provenance check. Approve to allow fetching this URL.`,
      suggestions: e.suggestions
    });
    let u;
    let d = new Promise(p => {
      u = setTimeout(m => m({
        type: "timed_out"
      }), e.promptTimeoutMs ?? 300000, p);
      u.unref?.();
    });
    try {
      let p = await Promise.race([c.then(m => ({
        type: "decision",
        decision: m
      })), d]);
      if (o.abortController.signal.aborted) {
        throw new xc();
      }
      if (p.type === "timed_out") {
        c.catch(() => {});
        return {
          outcome: "timed_out"
        };
      }
      if (p.decision.behavior === "allow") {
        return {
          outcome: "approved"
        };
      }
      return {
        outcome: "denied",
        denialMessage: p.decision.message || undefined
      };
    } finally {
      clearTimeout(u);
    }
  }
  async function Cvl(e) {
    let t = await SCm(e);
    if (t.outcome !== "approved") {
      throw e.onOutcome?.(t.outcome), t.outcome === "timed_out" ? nYt("The permission request for this URL was not answered in time. Ask the user to approve the fetch or include the URL in a message, then try again.") : nYt(t.denialMessage ?? e.denial.errorMessage);
    }
    let n;
    try {
      n = await e.refetch(e.denial.url);
    } catch (r) {
      if (r instanceof xc || e.context.abortController.signal.aborted) {
        throw r;
      }
      throw e.onOutcome?.("retry_failed"), r;
    }
    if (n !== null && typeof n === "object" && "type" in n && n.type === "provenance_denied") {
      throw e.onOutcome?.("retry_denied"), nYt(n.errorMessage);
    }
    e.onOutcome?.("approved");
    return n;
  }
  var wvl;
  var PNo = __lazy(() => {
    Sl();
    dt();
    wvl = require("crypto");
  });
  function Rvl({
    url: e,
    prompt: t
  }, {
    verbose: n
  }) {
    if (!e) {
      return null;
    }
    if (n) {
      return `url: "${e}"${n && t ? `, prompt: "${t}"` : ""}`;
    }
    return e;
  }
  function xvl() {
    return Zz.jsx(Vn, {
      height: 1,
      children: Zz.jsx(Text, {
        dimColor: true,
        children: "Fetching\u2026"
      })
    });
  }
  function kvl({
    bytes: e,
    code: t,
    codeText: n,
    result: r
  }, o, {
    verbose: s
  }) {
    let i = formatFileSize(e);
    if (s) {
      return Zz.jsxs(gXd, {
        flexDirection: "column",
        children: [Zz.jsx(Vn, {
          height: 1,
          children: Zz.jsxs(Text, {
            children: ["Received ", Zz.jsx(Text, {
              bold: true,
              children: i
            }), " (", t, " ", n, ")"]
          })
        }), Zz.jsx(gXd, {
          flexDirection: "column",
          children: Zz.jsx(Text, {
            children: r
          })
        })]
      });
    }
    return Zz.jsx(Vn, {
      height: 1,
      children: Zz.jsxs(Text, {
        children: ["Received ", Zz.jsx(Text, {
          bold: true,
          children: i
        }), " (", t, " ", n, ")"]
      })
    });
  }
  function ONo(e) {
    if (!e?.url) {
      return null;
    }
    return truncate(e.url, 50);
  }
  var Zz;
  var Avl = __lazy(() => {
    Wl();
    et();
    cs();
    Zz = __toESM(ie(), 1);
  });
  function rYt() {
    let e = Me.CLAUDE_CODE_SESSION_ID;
    if (e && (e.startsWith("cse_") || e.startsWith("session_"))) {
      return e;
    }
    return;
  }
  function Ivl() {
    if (getAPIProvider() !== "firstParty") {
      return false;
    }
    if (!Me.CLAUDE_CODE_WEBFETCH_USE_CCR_PROXY) {
      return false;
    }
    return !!rYt();
  }
  function ECm() {
    return `${(Me.ANTHROPIC_BASE_URL || "https://api.anthropic.com").replace(/\/+$/, "")}/v1/code/sessions/${encodeURIComponent(rYt())}/worker/web-fetch`;
  }
  async function Pvl(e, t) {
    let n = CIe();
    let r;
    try {
      r = await NP.post(ECm(), {
        url: e
      }, {
        signal: t,
        timeout: 40000,
        maxContentLength: 12582912,
        headers: {
          ...n,
          "Content-Type": "application/json",
          "anthropic-version": "2023-06-01"
        },
        validateStatus: () => true
      });
    } catch (s) {
      if (isCancel(s)) {
        throw new xc();
      }
      let i = s instanceof Error && "code" in s ? String(s.code) : undefined;
      logForDebugging(`ccr webfetch-proxy transport error: ${i}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: 502,
        errorType: "PROXY_TRANSPORT",
        errorMessage: `Request to the WebFetch proxy failed (${i ?? "transport error"}).`
      };
    }
    if (r.status !== 200) {
      let s = typeof r.data?.message === "string" ? r.data.message.slice(0, 200) : undefined;
      logForDebugging(`ccr webfetch-proxy returned HTTP ${r.status}${s ? `: ${s}` : ""}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: r.status,
        errorType: "PROXY_REJECTED",
        errorMessage: `The WebFetch proxy rejected the request (HTTP ${r.status}${s ? `: ${s}` : ""}).`
      };
    }
    let o = TCm().safeParse(r.data);
    if (!o.success) {
      logForDebugging(`ccr webfetch-proxy returned unparseable body: ${o.error.message}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: 502,
        errorType: "PROXY_BAD_RESPONSE",
        errorMessage: "The WebFetch proxy returned a malformed response."
      };
    }
    if (o.data.error) {
      logForDebugging(`ccr webfetch-proxy fetch error: ${o.data.error.error_type}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "target",
        statusCode: 502,
        errorType: o.data.error.error_type,
        errorMessage: o.data.error.error_message
      };
    }
    return {
      ok: true,
      content: o.data.text,
      contentType: o.data.content_type || "text/plain",
      destinationUrl: o.data.destination_url || undefined
    };
  }
  var TCm;
  var DNo = __lazy(() => {
    Dp();
    qg();
    je();
    d_();
    dt();
    Ds();
    e1();
    TCm = we(() => Ke.object({
      url: Ke.string().optional().default(""),
      destination_url: Ke.string().nullable().optional(),
      title: Ke.string().optional().default(""),
      text: Ke.string().optional().default(""),
      content_type: Ke.string().nullable().optional(),
      error: Ke.object({
        error_type: Ke.string(),
        error_message: Ke.string()
      }).nullable().optional()
    }));
  });
  function Ovl(e, t) {
    if (wCm.vZc(e)) {
      return true;
    }
    let n = CCm.get(e);
    if (n) {
      if (/%(25)*(2f|5c|2e)/i.test(t)) {
        return false;
      }
      for (let r of n) {
        if (t === r || t.startsWith(r + "/")) {
          return true;
        }
      }
    }
    return false;
  }
  var vCm;
  var wCm;
  var CCm;
  var Dvl = __lazy(() => {
    vCm = new Set(["platform.claude.com", "code.claude.com", "modelcontextprotocol.io", "github.com/anthropics", "agentskills.io", "docs.python.org", "en.cppreference.com", "docs.oracle.com", "learn.microsoft.com", "developer.mozilla.org", "go.dev", "pkg.go.dev", "www.php.net", "docs.swift.org", "kotlinlang.org", "ruby-doc.org", "doc.rust-lang.org", "www.typescriptlang.org", "react.dev", "angular.io", "vuejs.org", "nextjs.org", "expressjs.com", "nodejs.org", "bun.sh", "jquery.com", "getbootstrap.com", "tailwindcss.com", "d3js.org", "threejs.org", "redux.js.org", "webpack.js.org", "jestjs.io", "reactrouter.com", "docs.djangoproject.com", "flask.palletsprojects.com", "fastapi.tiangolo.com", "pandas.pydata.org", "numpy.org", "www.tensorflow.org", "pytorch.org", "scikit-learn.org", "matplotlib.org", "requests.readthedocs.io", "jupyter.org", "laravel.com", "symfony.com", "wordpress.org/documentation", "docs.spring.io", "hibernate.org", "tomcat.apache.org", "gradle.org", "maven.apache.org", "asp.net", "dotnet.microsoft.com", "blazor.net", "reactnative.dev", "docs.flutter.dev", "developer.apple.com", "developer.android.com", "keras.io", "spark.apache.org", "huggingface.co/docs", "www.kaggle.com/docs", "www.mongodb.com", "redis.io", "www.postgresql.org", "dev.mysql.com", "www.sqlite.org", "graphql.org", "prisma.io", "docs.getdbt.com", "docs.aws.amazon.com", "cloud.google.com", "learn.microsoft.com", "kubernetes.io", "www.docker.com", "www.terraform.io", "www.ansible.com", "vercel.com/docs", "docs.stripe.com", "docs.netlify.com", "devcenter.heroku.com", "dev.wix.com/docs", "cypress.io", "selenium.dev", "docs.unity.com", "docs.unrealengine.com", "git-scm.com", "nginx.org", "httpd.apache.org"]);
    ({
      HOSTNAME_ONLY: wCm,
      PATH_PREFIXES: CCm
    } = (() => {
      let e = new Set();
      let t = new Map();
      for (let n of vCm) {
        let r = n.indexOf("/");
        if (r === -1) {
          e.add(n);
        } else {
          let o = n.slice(0, r);
          let s = n.slice(r);
          let i = t.get(o);
          if (i) {
            i.push(s);
          } else {
            t.set(o, [s]);
          }
        }
      }
      return {
        HOSTNAME_ONLY: e,
        PATH_PREFIXES: t
      };
    })());
  });