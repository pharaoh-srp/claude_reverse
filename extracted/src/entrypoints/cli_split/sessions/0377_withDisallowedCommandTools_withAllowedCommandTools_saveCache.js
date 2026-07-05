  __export(S7e, {
    updateBridgeSessionTitle: () => updateBridgeSessionTitle,
    updateBridgeSessionColorTag: () => updateBridgeSessionColorTag,
    getBridgeSession: () => getBridgeSession,
    createBridgeSession: () => createBridgeSession,
    archiveBridgeSession: () => archiveBridgeSession,
    SESSION_COLOR_TAG_PREFIX: () => "color:"
  });
  async function createBridgeSession({
    environmentId: e,
    title: t,
    events: n,
    gitRepoUrl: r,
    branch: o,
    signal: s,
    baseUrl: i,
    getAccessToken: a,
    permissionMode: l,
    tags: c
  }) {
    let {
      getClaudeAIOAuthTokens: u
    } = await Promise.resolve().then(() => (no(), v2));
    let {
      getOrganizationUUID: d
    } = await Promise.resolve().then(() => (qP(), Dot));
    let {
      getOauthConfig: p
    } = await Promise.resolve().then(() => (Uc(), JOt));
    let {
      getOAuthHeaders: m
    } = await Promise.resolve().then(() => (NC(), jce));
    let {
      getMainLoopModel: f
    } = await Promise.resolve().then(() => (Eo(), JCn));
    let {
      getOriginalCwd: h
    } = await Promise.resolve().then(() => (at(), dxe));
    let {
      default: g
    } = await Promise.resolve().then(() => (Dp(), CDt));
    let {
      isFirstPartyProvider: y
    } = await Promise.resolve().then(() => (Ds(), Oni));
    if (!y()) {
      logForDebugging("[bridge] Session create skipped on non-firstParty provider");
      Ae("bridge_session_create", "bridge_session_create_3p_provider");
      return null;
    }
    let _ = a?.() ?? u()?.accessToken;
    if (!_) {
      logForDebugging("[bridge] No access token for session creation");
      Ae("bridge_session_create", "bridge_session_create_no_token");
      return null;
    }
    let b = await d();
    if (!b) {
      logForDebugging("[bridge] No org UUID for session creation");
      Ae("bridge_session_create", "bridge_session_create_no_org");
      return null;
    }
    let {
      sources: S,
      outcomes: E
    } = await buildGitSessionContext(r, o);
    let C = {
      ...(t !== undefined && {
        title: t
      }),
      events: n,
      session_context: {
        sources: S,
        outcomes: E,
        model: f(),
        cwd: h(),
        reuse_outcome_branches: true
      },
      ...B6t(e),
      source: "remote-control",
      ...(l && {
        permission_mode: l
      }),
      ...(c?.length && {
        tags: c
      })
    };
    let x = {
      ...m(_),
      "anthropic-beta": "ccr-byoc-2025-07-29",
      "x-organization-uuid": b
    };
    let A = `${i ?? p().BASE_API_URL}/v1/sessions`;
    let k;
    try {
      k = await g.post(A, C, {
        headers: x,
        signal: s,
        validateStatus: M => M < 500
      });
    } catch (M) {
      logForDebugging(`[bridge] Session creation request failed: ${he(M)}`);
      Ae("bridge_session_create", "bridge_session_create_request_failed");
      return null;
    }
    if (!(k.status === 200 || k.status === 201)) {
      let M = vQ(k.data);
      logForDebugging(`[bridge] Session creation failed with status ${k.status}${M ? `: ${M}` : ""}`);
      Ae("bridge_session_create", "bridge_session_create_http_error");
      return null;
    }
    let O = k.data;
    if (!O || typeof O !== "object" || !("id" in O) || typeof O.id !== "string") {
      logForDebugging("[bridge] No session ID in response");
      Ae("bridge_session_create", "bridge_session_create_bad_response");
      return null;
    }
    Pe("bridge_session_create");
    return O.id;
  }
  async function getBridgeSession(e, t) {
    let {
      getClaudeAIOAuthTokens: n
    } = await Promise.resolve().then(() => (no(), v2));
    let {
      getOrganizationUUID: r
    } = await Promise.resolve().then(() => (qP(), Dot));
    let {
      getOauthConfig: o
    } = await Promise.resolve().then(() => (Uc(), JOt));
    let {
      getOAuthHeaders: s
    } = await Promise.resolve().then(() => (NC(), jce));
    let {
      default: i
    } = await Promise.resolve().then(() => (Dp(), CDt));
    let a = t?.getAccessToken?.() ?? n()?.accessToken;
    if (!a) {
      logForDebugging("[bridge] No access token for session fetch");
      Ae("bridge_session_get", "bridge_session_get_no_token");
      return null;
    }
    let l = await r();
    if (!l) {
      logForDebugging("[bridge] No org UUID for session fetch");
      Ae("bridge_session_get", "bridge_session_get_no_org");
      return null;
    }
    let c = {
      ...s(a),
      "anthropic-beta": "ccr-byoc-2025-07-29",
      "x-organization-uuid": l
    };
    let u = toCompatSessionId(e);
    let d = `${t?.baseUrl ?? o().BASE_API_URL}/v1/sessions/${u}`;
    logForDebugging(`[bridge] Fetching session ${u}`);
    let p;
    try {
      p = await i.get(d, {
        headers: c,
        timeout: 1e4,
        validateStatus: m => m < 500
      });
    } catch (m) {
      logForDebugging(`[bridge] Session fetch request failed: ${he(m)}`);
      Ae("bridge_session_get", "bridge_session_get_request_failed");
      return null;
    }
    if (p.status !== 200) {
      let m = vQ(p.data);
      logForDebugging(`[bridge] Session fetch failed with status ${p.status}${m ? `: ${m}` : ""}`);
      Ae("bridge_session_get", "bridge_session_get_http_error");
      return null;
    }
    Pe("bridge_session_get");
    return p.data;
  }
  async function archiveBridgeSession(e, t) {
    let {
      getClaudeAIOAuthTokens: n
    } = await Promise.resolve().then(() => (no(), v2));
    let {
      getOrganizationUUID: r
    } = await Promise.resolve().then(() => (qP(), Dot));
    let {
      getOauthConfig: o
    } = await Promise.resolve().then(() => (Uc(), JOt));
    let {
      getOAuthHeaders: s
    } = await Promise.resolve().then(() => (NC(), jce));
    let {
      default: i
    } = await Promise.resolve().then(() => (Dp(), CDt));
    let a = t?.getAccessToken?.() ?? n()?.accessToken;
    if (!a) {
      logForDebugging("[bridge] No access token for session archive");
      return;
    }
    let l = await r();
    if (!l) {
      logForDebugging("[bridge] No org UUID for session archive");
      return;
    }
    let c = {
      ...s(a),
      "anthropic-beta": "ccr-byoc-2025-07-29",
      "x-organization-uuid": l
    };
    let u = `${t?.baseUrl ?? o().BASE_API_URL}/v1/sessions/${e}/archive`;
    logForDebugging(`[bridge] Archiving session ${e}`);
    let d = await i.post(u, {}, {
      headers: c,
      timeout: t?.timeoutMs ?? 1e4,
      validateStatus: p => p < 500
    });
    if (d.status === 200) {
      logForDebugging(`[bridge] Session ${e} archived successfully`);
      Pe("bridge_session_archive");
    } else {
      let p = vQ(d.data);
      logForDebugging(`[bridge] Session archive failed with status ${d.status}${p ? `: ${p}` : ""}`);
      Ae("bridge_session_archive", "bridge_session_archive_http_error");
    }
  }
  async function lLl(e, t, n, r) {
    let {
      getClaudeAIOAuthTokens: o
    } = await Promise.resolve().then(() => (no(), v2));
    let {
      getOrganizationUUID: s
    } = await Promise.resolve().then(() => (qP(), Dot));
    let {
      getOauthConfig: i
    } = await Promise.resolve().then(() => (Uc(), JOt));
    let {
      getOAuthHeaders: a
    } = await Promise.resolve().then(() => (NC(), jce));
    let {
      default: l
    } = await Promise.resolve().then(() => (Dp(), CDt));
    let c = r?.getAccessToken?.() ?? o()?.accessToken;
    if (!c) {
      logForDebugging(`[bridge] No access token for session ${n} update`);
      return;
    }
    let u = await s();
    if (!u) {
      logForDebugging(`[bridge] No org UUID for session ${n} update`);
      return;
    }
    let d = {
      ...a(c),
      "anthropic-beta": "ccr-byoc-2025-07-29",
      "x-organization-uuid": u
    };
    let p = toCompatSessionId(e);
    let m = `${r?.baseUrl ?? i().BASE_API_URL}/v1/sessions/${p}`;
    logForDebugging(`[bridge] Updating session ${n}: ${p}`);
    try {
      let f = await l.patch(m, t, {
        headers: d,
        timeout: 1e4,
        validateStatus: h => h < 500
      });
      if (f.status === 200) {
        logForDebugging(`[bridge] Session ${n} updated successfully`);
        Pe("bridge_session_patch");
      } else {
        let h = vQ(f.data);
        logForDebugging(`[bridge] Session ${n} update failed with status ${f.status}${h ? `: ${h}` : ""}`);
        Et("bridge_session_patch", "bridge_session_patch_http_error");
      }
    } catch (f) {
      logForDebugging(`[bridge] Session ${n} update request failed: ${he(f)}`);
      Ae("bridge_session_patch", "bridge_session_patch_request_failed");
    }
  }
  async function updateBridgeSessionTitle(e, t, n) {
    return lLl(e, {
      title: t
    }, "title", n);
  }
  async function updateBridgeSessionColorTag(e, t, n, r) {
    let o = t === "default";
    let s = n.filter(a => o || a !== t).map(a => "color:" + a);
    let i = o ? undefined : ["color:" + t];
    return lLl(e, {
      add_tags: i,
      remove_tags: s
    }, "color tag", r);
  }
  var TFe = __lazy(() => {
    ln();
    je();
    dt();
    Ppe();
    Ipe();
    NBo();
  });
  async function _we(e, t) {
    let n = getSessionId();
    let r = getMaterializedSessionFile() ?? wh();
    if (t === "user" || t === "hook") {
      await saveCustomTitle(n, e, r, t);
    } else {
      saveAiGeneratedTitle(n, e);
    }
    let o = vS()?.bridgeSessionId;
    if (o) {
      let i = getBridgeTokenOverride();
      Promise.resolve().then(() => (TFe(), S7e)).then(({
        updateBridgeSessionTitle: a
      }) => a(o, e, {
        baseUrl: getBridgeBaseUrlOverride(),
        getAccessToken: i ? () => i : undefined
      }).catch(() => {}));
    }
    await saveAgentName(n, e, r, t);
    let s = Ul();
    if (s?.kind === "ccr" && s.sessionId) {
      let i = s.sessionId;
      Promise.resolve().then(() => (NC(), jce)).then(({
        updateSessionTitle: a
      }) => a(i, e));
    }
    await GY(e);
  }
  var oXt = __lazy(() => {
    at();
    wZ();
    x$();
    ru();
    yd();
    Fy();
    fa();
  });
  function prr() {
    return sXt.useSyncExternalStore(rK.subscribe, () => rK.getState().value);
  }
  function cLl() {
    return sXt.useSyncExternalStore(rK.subscribe, () => rK.getState().value === "");
  }
  function E7e() {
    return rK.getState().value;
  }
  function LEt(e) {
    rK.setState(t => {
      if (t.value === e) {
        return t;
      }
      if (t.launchWarning !== null && t.value !== "" && e === "") {
        return {
          ...t,
          value: e,
          launchWarning: null
        };
      }
      return {
        ...t,
        value: e
      };
    });
  }
  function FEt() {
    return sXt.useSyncExternalStore(rK.subscribe, () => rK.getState().active);
  }
  function BBo(e) {
    rK.setState(t => t.active === e ? t : {
      ...t,
      active: e
    });
  }
  function uLl() {
    return sXt.useSyncExternalStore(rK.subscribe, () => rK.getState().launchWarning);
  }
  function dLl() {
    return rK.getState().launchWarning;
  }
  function bwe(e) {
    rK.setState(t => t.launchWarning?.type === e.type && t.launchWarning.prefillLength === e.prefillLength ? t : {
      ...t,
      launchWarning: e
    });
  }
  var sXt;
  var rK;
  var ufe = __lazy(() => {
    tre();
    sXt = __toESM(ot(), 1);
    rK = dO({
      value: "",
      active: false,
      launchWarning: null
    });
  });
  async function UEt(e) {
    try {
      let t = qt(await mLl.readFile(e, "utf8"));
      if (t === null || typeof t !== "object") {
        return;
      }
      let n = {};
      if ("rvAuth" in t && typeof t.rvAuth === "string") {
        n.rvAuth = t.rvAuth;
      }
      if ("ptyAuth" in t && typeof t.ptyAuth === "string") {
        n.ptyAuth = t.ptyAuth;
      }
      if ("claimAuth" in t && typeof t.claimAuth === "string") {
        n.claimAuth = t.claimAuth;
      }
      return n;
    } catch {
      return;
    }
  }
  function Vse(e, t) {
    if (typeof e !== "string" || !t || e.length === 0) {
      return false;
    }
    let n = Buffer.from(e);
    let r = Buffer.from(t);
    if (n.length !== r.length) {
      return false;
    }
    return pLl.timingSafeEqual(n, r);
  }
  var pLl;
  var mLl;
  var BEt = __lazy(() => {
    pLl = require("crypto");
    mLl = require("fs/promises");
  });
  function $Et(e) {
    fLl = e;
  }
  function hLl(e) {
    return fLl?.(e) ?? false;
  }
  var fLl = null;
  var hrr = {};
  __export(hrr, {
    stopRendezvousServer: () => stopRendezvousServer,
    startRendezvousServer: () => startRendezvousServer,
    sendRv: () => sendRv,
    markStartupDialogBlocked: () => markStartupDialogBlocked,
    markReplayNoOp: () => markReplayNoOp,
    disarmStartupWedgeWatchdog: () => disarmStartupWedgeWatchdog,
    clearStartupDialogBlocked: () => clearStartupDialogBlocked
  });
  function _Ll() {
    if ($Bo === undefined) {
      delete process.env.BROWSER;
    } else {
      process.env.BROWSER = $Bo;
    }
  }
  async function startRendezvousServer() {
    let e = Me.CLAUDE_BG_RENDEZVOUS_SOCK;
    if (!e || Swe) {
      return;
    }
    $Bo = Me.BROWSER;
    delete process.env.CLAUDE_BG_RENDEZVOUS_SOCK;
    HEt = Me.CLAUDE_BG_RV_AUTH;
    delete process.env.CLAUDE_BG_RV_AUTH;
    let t = Me.CLAUDE_BG_SOCKET_TOKENS_PATH;
    if (delete process.env.CLAUDE_BG_SOCKET_TOKENS_PATH, t) {
      let n = await UEt(t);
      if (n?.rvAuth) {
        HEt = n.rvAuth;
      }
      await jEt.unlink(t).catch(() => {});
    }
    await jEt.unlink(e).catch(() => {});
    Swe = gLl.createServer(n => {
      AZ?.destroy();
      AZ = n;
      mrr = false;
      H1m().catch(s => {
        if (!fn(s)) {
          lf(s);
        }
      });
      z1m().catch(() => {});
      n.on("error", () => n.destroy());
      n.once("close", () => {
        if (AZ === n) {
          AZ = undefined;
        }
      });
      let r = "";
      let o = new yLl.StringDecoder("utf8");
      n.on("data", s => {
        r += o.write(s);
        let i;
        while ((i = r.indexOf(`
`)) >= 0) {
          let a = r.slice(0, i);
          if (r = r.slice(i + 1), a) {
            $1m(a);
          }
        }
        if (r.length > 1048576) {
          r = "";
          n.destroy();
        }
      });
    });
    Swe.on("error", n => logForDebugging(`[bg-rv] server error: ${String(n)}`, {
      level: "warn"
    }));
    Swe.listen(e);
    Swe.unref();
    iXt = setInterval(() => sendRv({
      type: "heartbeat"
    }), 30000);
    iXt.unref();
  }
  function stopRendezvousServer() {
    if (iXt) {
      clearInterval(iXt);
      iXt = undefined;
    }
    if (clearTimeout(v7e), v7e = undefined, lXt = false, AZ?.destroy(), AZ = undefined, mrr = false, HEt = undefined, Swe) {
      _Ll();
    }
    Swe?.close();
    Swe = undefined;
  }
  function sendRv(e) {
    if (!AZ || AZ.destroyed) {
      return false;
    }
    try {
      AZ.write(De(e) + `
`);
      return true;
    } catch {
      return false;
    }
  }
  function $1m(e) {
    let t;
    try {
      t = qt(e);
    } catch {
      return;
    }
    if (!t || typeof t !== "object") {
      return;
    }
    if ("role" in t) {
      if (HEt && "auth" in t && Vse(t.auth, HEt)) {
        mrr = true;
      }
      return;
    }
    let n = t;
    if (HEt && !mrr && n.type !== "repaint") {
      if (logForDebugging(`[bg-rv] dropped ${typeof n.type === "string" ? n.type : "unknown"} from un-authed connection`, {
        level: "warn"
      }), n.type === "reply") {
        sendRv({
          type: "reply-rejected"
        });
      }
      return;
    }
    if (n.type === "shutdown") {
      sendRv({
        type: "shutting-down"
      });
      let r = vS();
      let o = [];
      let s = Me.CLAUDE_JOB_DIR;
      if (s) {
        o.push(V1m(s).catch(() => {}));
      }
      if (r) {
        let i = r.getLastSequenceNum();
        r.teardown({
          skipArchive: true
        }).catch(() => {});
        let a = Me.CLAUDE_JOB_DIR;
        if (a && i > 0) {
          o.push(K1m(a, i).catch(() => {}));
        }
      }
      o.push(RZe());
      Promise.race([Promise.all(o), sleep(5000)]).finally(() => {
        process.exit(0);
      });
      return;
    }
    if (n.type === "repaint") {
      if (!rVd.get(process.stdout)?.forceRedraw({
        flushReact: true
      })) {
        process.stdout.write(o0 + gv + `
  \x1B[2mSession can't redraw right now \u2014 Ctrl+Z to detach\x1B[0m
`);
      }
      sendRv({
        type: "repaint-done"
      });
      return;
    }
    if (n.type === "attacher-caps") {
      if (setAttacherCaps(n.caps), F9i(n.caps?.colorLevel), !n.caps) {
        _Ll();
      } else if (typeof n.caps.browser === "string") {
        process.env.BROWSER = n.caps.browser;
      } else {
        delete process.env.BROWSER;
      }
      if (n.caps?.systemTheme) {
        TMn(n.caps.systemTheme);
      }
      return;
    }
    if (n.type === "reply" && typeof n.text === "string") {
      if (hLl(n.text)) {
        logForDebugging(`[bg-rv] peer reply answered question: ${n.text.slice(0, 80)}`);
        return;
      }
      let r = a0(n.text);
      __({
        agentId: mainAgentId(),
        mode: r,
        value: J2(n.text),
        priority: "next",
        origin: {
          kind: "human"
        }
      });
      logForDebugging(`[bg-rv] enqueued reply: ${n.text.slice(0, 80)}`);
    }
  }
  async function bLl(e) {
    for (let t = 0; !rVd.vZc(process.stdout); t++) {
      if (t >= 60 || AZ !== e) {
        return false;
      }
      await sleep(500);
    }
    return true;
  }
  async function H1m() {
    let e = Me.CLAUDE_JOB_DIR;
    if (!e) {
      return;
    }
    if (!(await bLl(AZ))) {
      return;
    }
    let t = await Zi(e);
    if (!t) {
      return;
    }
    if (t.state === "working" && t.detail === "starting\u2026") {
      j1m(e);
    }
    if (!yut.includes(t.state)) {
      return;
    }
    if (t.tempo === "blocked") {
      return;
    }
    await ip(e, {
      ...t,
      state: "running",
      tempo: "idle",
      updatedAt: new Date().toISOString()
    });
    sendRv({
      type: "state",
      patch: {
        state: "running",
        tempo: "idle"
      }
    });
  }
  function j1m(e) {
    if (lXt) {
      return;
    }
    clearTimeout(v7e);
    let t = Me.CLAUDE_BG_STARTUP_WEDGE_MS || 45000;
    v7e = setTimeout(G1m, t, e);
    v7e.unref();
  }
  function disarmStartupWedgeWatchdog() {
    if (Swe === undefined) {
      return;
    }
    lXt = true;
    clearTimeout(v7e);
    v7e = undefined;
  }
  async function markStartupDialogBlocked(e) {
    let t = Me.CLAUDE_JOB_DIR;
    if (!t || lXt) {
      return;
    }
    let n = await Zi(t);
    if (!n || n.tempo === "blocked" && n.needs !== "send a prompt to start") {
      return;
    }
    let r = e ? `${"stuck on a startup dialog"} (${e})` : "stuck on a startup dialog";
    await ip(t, {
      ...n,
      tempo: "blocked",
      detail: r,
      needs: "open this session to continue setup",
      updatedAt: new Date().toISOString()
    });
    sendRv({
      type: "state",
      patch: {
        tempo: "blocked",
        detail: r,
        needs: "open this session to continue setup"
      }
    });
    return {
      tempo: n.tempo,
      needs: n.needs,
      detail: n.detail
    };
  }
  async function clearStartupDialogBlocked(e) {
    let t = Me.CLAUDE_JOB_DIR;
    if (!t) {
      return;
    }
    let n = await Zi(t);
    if (!n || n.tempo !== "blocked" || n.needs !== "open this session to continue setup") {
      return;
    }
    await ip(t, {
      ...n,
      ...e,
      updatedAt: new Date().toISOString()
    });
    sendRv({
      type: "state",
      patch: {
        tempo: e.tempo,
        needs: e.needs,
        detail: e.detail
      }
    });
  }
  async function markReplayNoOp() {
    let e = Me.CLAUDE_JOB_DIR;
    if (!e || Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return;
    }
    let t = await Zi(e);
    if (!t || t.state !== "working" || t.tempo !== "active") {
      return;
    }
    await ip(e, {
      ...t,
      tempo: "blocked",
      needs: "send a prompt to start",
      updatedAt: new Date().toISOString()
    });
    sendRv({
      type: "state",
      patch: {
        tempo: "blocked",
        needs: "send a prompt to start"
      }
    });
  }
  function G1m(e) {
    Zi(e).then(async t => {
      if (lXt || t?.state !== "working" || t.detail !== "starting\u2026" || t.tempo === "blocked") {
        return;
      }
      await ip(e, {
        ...t,
        tempo: "blocked",
        detail: "stuck on a startup dialog",
        needs: "open this session to continue setup",
        updatedAt: new Date().toISOString()
      });
      sendRv({
        type: "state",
        patch: {
          tempo: "blocked",
          detail: "stuck on a startup dialog",
          needs: "open this session to continue setup"
        }
      });
    }).catch(t => {
      if (!fn(t)) {
        lf(t);
      }
    });
  }
  async function V1m(e) {
    let t = E7e();
    if (!t) {
      return;
    }
    await jEt.writeFile(HBo.join(e, ".prompt-draft"), t.slice(0, 262144), {
      mode: 384
    });
  }
  async function z1m() {
    let e = Me.CLAUDE_JOB_DIR;
    if (!e) {
      return;
    }
    let t = HBo.join(e, ".prompt-draft");
    let n = await t0(t, 4 * 262144);
    if (n === null) {
      return;
    }
    if (await jEt.unlink(t).catch(() => {}), !n) {
      return;
    }
    if (!hasEarlyInput()) {
      seedEarlyInput(n);
    }
    if (!(await bLl(AZ))) {
      return;
    }
    if (E7e() === "") {
      LEt(n);
    }
  }
  async function K1m(e, t) {
    let n = await Zi(e);
    if (!n || n.bridgeSessionSeq === t) {
      return;
    }
    await ip(e, {
      ...n,
      bridgeSessionSeq: t,
      updatedAt: new Date().toISOString()
    });
  }
  var jEt;
  var gLl;
  var HBo;
  var yLl;
  var Swe;
  var AZ;
  var iXt;
  var v7e;
  var lXt = false;
  var HEt;
  var mrr = false;
  var $Bo;
  var w7e = __lazy(() => {
    at();
    at();
    x$();
    ufe();
    BEt();
    J8();
    c1();
    hd();
    je();
    cPe();
    pr();
    dt();
    n1();
    Rf();
    NJ();
    zf();
    jEt = require("fs/promises");
    gLl = require("net");
    HBo = require("path");
    yLl = require("string_decoder");
  });
  function ELl(e) {
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return "";
    }
    let n = new Set((process.env.CLAUDE_CODE_TERMINAL_MCP_TOOLS ?? "").split(",").map(r => r.trim()).filter(Boolean));
    if (n.size === 0) {
      return "";
    }
    return t.map(r => {
      if (r.type !== "tool_use" || !n.vZc(r.name)) {
        return "";
      }
      let s = r.input?.text;
      return typeof s === "string" ? s : "";
    }).filter(Boolean).join(`
`);
  }
  var yrr = {};
  __export(yrr, {
    worktreeOwnershipFields: () => worktreeOwnershipFields,
    summarizeToolCalls: () => summarizeToolCalls,
    stashBgStructuredResult: () => stashBgStructuredResult,
    setWorktreeOwnership: () => setWorktreeOwnership,
    setPermissionBlock: () => setPermissionBlock,
    scanLinkRecords: () => scanLinkRecords,
    markTurnActive: () => markTurnActive,
    markTurnAborted: () => markTurnAborted,
    markApiFailure: () => markApiFailure,
    findLatestRealUserAsk: () => findLatestRealUserAsk,
    ensurePermissionBridge: () => ensurePermissionBridge,
    createClassifierJobState: () => createClassifierJobState,
    classifyAndPushDebounced: () => classifyAndPushDebounced,
    classifyAndPush: () => classifyAndPush,
    classify: () => classify,
    captureLatestAsk: () => captureLatestAsk,
    captureIntent: () => captureIntent,
    LINK_SCAN_MAX_BYTES: () => 4194304
  });
  async function C7e(e, t, n) {
    if (await ip(e, t), Object.keys(n).length > 0) {
      sendRv({
        type: "state",
        patch: n
      });
    }
  }
  function stashBgStructuredResult(e) {
    CLl = e;
  }
  function createClassifierJobState() {
    return {
      prevState: "",
      prevStateSince: Date.now(),
      accumulatedOutputs: {},
      lastClassifyAt: 0,
      capturedIntent: "",
      inFlight: null,
      nameInFlight: false,
      dispatchEmitted: false,
      latestAsk: "",
      kicked: false,
      lastMsgCount: 0,
      permissionBridgeSubscribed: false,
      bridgeWriteChain: Promise.resolve(),
      lastEmittedDetail: "",
      lastResult: null
    };
  }
  function RLl() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_classifier_config", {
      useSmallFastModel: true,
      disableThinking: true
    });
  }
  function xLl() {
    if (RLl()?.useSmallFastModel) {
      return getSmallFastModel();
    }
    let e = getMainLoopModel();
    if (isFableFamilyOrPinnedModel(e) || isMythosFamilyOrPinnedModel(e)) {
      return getClassifierOpusReroute(e);
    }
    return e;
  }
  function kLl(e) {
    if (u4e(e)) {
      return [undefined, 2048];
    }
    if (RLl()?.disableThinking) {
      return [false, 0];
    }
    return [undefined, 2048];
  }
  function Q1m() {
    return process.argv.some(e => e === "-c" || e === "--continue" || e === "-r" || e === "--resume" || e.startsWith("--resume=") || e.startsWith("-r="));
  }
  function VBo(e) {
    let t = {};
    for (let n of e) {
      t[`surface_${n}`] = true;
    }
    return t;
  }
  function Z1m(e, t, n) {
    if (!li() || e.dispatchEmitted) {
      return;
    }
    if (e.dispatchEmitted = true, Q1m()) {
      return;
    }
    logEvent("tengu_bg_agent_dispatch", {
      agent: t,
      source: process.env.CLAUDE_BG_SOURCE ?? "shell",
      intentLength: e.capturedIntent.length,
      ...VBo(n)
    });
  }
  function captureIntent(e, t) {
    if (e.capturedIntent || !t) {
      return e.capturedIntent;
    }
    e.capturedIntent = wxe(Lc(zBo(t)), 500);
    return e.capturedIntent;
  }
  function findLatestRealUserAsk(e) {
    let t = e.findLast(n => n.type === "user" && !n.isMeta && typeof n.message.content === "string" && !IZ(n.message.content));
    return t?.type === "user" && typeof t.message.content === "string" ? t.message.content : undefined;
  }
  function captureLatestAsk(e, t) {
    if (!t) {
      return;
    }
    e.latestAsk = wxe(Lc(zBo(t)), 300);
  }
  function zBo(e) {
    let n = e.lastIndexOf("</system-reminder>");
    return (n >= 0 ? e.slice(n + 18) : e).trim();
  }
  function markTurnActive(e, t, n) {
    if (ensurePermissionBridge(e), disarmStartupWedgeWatchdog(), e.kicked) {
      return;
    }
    e.kicked = true;
    e.bridgeWriteChain = e.bridgeWriteChain.then(() => ALl(t, n)).catch(lf);
  }
  function classifyAndPushDebounced(e, t, n, r, o, s, i) {
    if (!e.kicked) {
      e.kicked = true;
      ALl(t).catch(lf);
    }
    let a = Date.now();
    if (a - e.lastClassifyAt < 15000) {
      return;
    }
    if (e.inFlight) {
      return;
    }
    e.lastClassifyAt = a;
    classifyAndPush(e, t, n, e.capturedIntent, r, o, s, i, true).catch(lf);
  }
  async function ALl(e, t) {
    let n = dc(e);
    let r = await Zi(n);
    if (!r) {
      return;
    }
    if (r.tempo === "active") {
      return;
    }
    if (Xg(r) && !t) {
      return;
    }
    let o = new Date().toISOString();
    let s = t ? mf(Lc(zBo(t)).replace(/\s+/g, " ").trim(), 800) : undefined;
    if (await C7e(n, {
      ...r,
      ...(s !== undefined && {
        detail: s
      }),
      tempo: "active",
      inFlight: Igt(),
      needs: undefined,
      block: undefined,
      suggestedReply: undefined,
      output: null,
      updatedAt: o
    }, {
      tempo: "active",
      needs: "",
      ...(s !== undefined && {
        detail: s
      })
    }), s) {
      EFe.appendFile(grr.join(n, "timeline.jsonl"), De({
        at: o,
        state: r.state,
        detail: s,
        text: ""
      }) + `
`, "utf-8").catch(lf);
    }
  }
  async function setPermissionBlock(e, t) {
    let n = dc(e);
    let r = t?.text ?? null;
    let o = await Zi(n);
    if (!o) {
      return;
    }
    if (r) {
      if (FI(o.state)) {
        return;
      }
      if (o.tempo === "blocked" && o.needs === r) {
        return;
      }
    } else if (o.tempo !== "blocked") {
      return;
    }
    let s = (await Zi(n)) ?? o;
    if (r) {
      if (FI(s.state)) {
        return;
      }
      if (s.tempo === "blocked" && s.needs === r) {
        return;
      }
    } else if (s.tempo !== "blocked") {
      return;
    }
    let i = r ? "blocked" : "active";
    await C7e(n, {
      ...s,
      tempo: i,
      inFlight: Igt(),
      needs: r ?? undefined,
      block: t?.questions ? {
        questions: t.questions
      } : undefined,
      suggestedReply: undefined,
      updatedAt: new Date().toISOString()
    }, {
      tempo: i,
      needs: r ?? ""
    });
  }
  async function setWorktreeOwnership(e, t) {
    let n = dc(e);
    let r = await Zi(n);
    if (!r) {
      return;
    }
    let o = worktreeOwnershipFields(t, r);
    if (o.worktreePath === r.worktreePath && o.worktreeBranch === r.worktreeBranch && o.worktreeHookBased === r.worktreeHookBased) {
      return;
    }
    await C7e(n, {
      ...r,
      ...o,
      updatedAt: new Date().toISOString()
    }, {});
  }
  function ensurePermissionBridge(e) {
    if (e.permissionBridgeSubscribed) {
      return;
    }
    e.permissionBridgeSubscribed = true;
    _Z.subscribe(t => {
      if (!Bj()) {
        return;
      }
      let n = fT();
      e.bridgeWriteChain = e.bridgeWriteChain.then(() => e.inFlight ?? undefined).catch(() => {}).then(() => setPermissionBlock(n, t).catch(r => {
        if (!fn(r)) {
          lf(r);
        }
      }));
    });
    worktreeStateSignal.subscribe(t => {
      if (!Bj()) {
        return;
      }
      let n = fT();
      e.bridgeWriteChain = e.bridgeWriteChain.then(() => e.inFlight ?? undefined).catch(() => {}).then(() => setWorktreeOwnership(n, t).catch(r => {
        if (!fn(r)) {
          lf(r);
        }
      }));
    });
  }
  async function DLl(e) {
    let t = getMaterializedSessionFile() ?? wh();
    let n = e.linkScanPath && e.linkScanPath !== t ? 0 : e.linkScanOffset ?? 0;
    let r = await scanLinkRecords(t, e.children ?? null, n);
    return {
      transcriptPath: t,
      prevOffset: n,
      scan: r
    };
  }
  function markTurnAborted(e, t) {
    e.kicked = false;
    let n = dc(t);
    e.bridgeWriteChain = e.bridgeWriteChain.then(() => e.inFlight ?? undefined).catch(() => {}).then(async () => {
      let r = await Zi(n);
      if (!r) {
        return;
      }
      let {
        transcriptPath: o,
        prevOffset: s,
        scan: i
      } = await DLl(r);
      let a = (await Zi(n)) ?? r;
      let l = a.tempo === "active";
      if (!l && i.linkScanOffset === s) {
        return;
      }
      await C7e(n, {
        ...a,
        ...(l && {
          tempo: "idle"
        }),
        children: i.children,
        linkScanOffset: i.linkScanOffset,
        linkScanPath: o,
        ...worktreeOwnershipFields(i.worktree, a),
        inFlight: Igt(),
        updatedAt: new Date().toISOString()
      }, l ? {
        tempo: "idle"
      } : {});
    }).catch(lf);
  }
  async function markApiFailure(e, t, n, r) {
    let o = Gxl(n, r);
    if (!o) {
      return;
    }
    let s = dc(t);
    let i = r.replace(/^Please run \/login \u00B7 /, "").replace(/^Failed to authenticate\. /, "").replace(/ \u00B7 Please run \/login$/, "").replace(/^Not logged in$/, "");
    let a = truncate(Lc(i.replace(/\s+/g, " ").trim()), 800);
    let l = `${o.needs}${a ? ` \xB7 ${a}` : ""}`;
    e.bridgeWriteChain = e.bridgeWriteChain.then(() => e.inFlight ?? undefined).catch(() => {}).then(async () => {
      let c = await Zi(s);
      if (!c || Xg(c)) {
        return;
      }
      let {
        transcriptPath: u,
        scan: d
      } = await DLl(c);
      let p = (await Zi(s)) ?? c;
      if (Xg(p)) {
        return;
      }
      let m = new Date().toISOString();
      let f = o.state === "failed" ? "idle" : "blocked";
      let h = o.state === "failed" ? undefined : l;
      await C7e(s, {
        ...p,
        state: o.state,
        detail: a,
        tempo: f,
        inFlight: Igt(),
        needs: h,
        block: undefined,
        children: d.children,
        linkScanOffset: d.linkScanOffset,
        linkScanPath: u,
        ...worktreeOwnershipFields(d.worktree, p),
        updatedAt: m,
        firstTerminalAt: o.state === "failed" && !p.firstTerminalAt ? m : p.firstTerminalAt
      }, {
        state: o.state,
        detail: a,
        tempo: f,
        needs: h ?? ""
      });
      EFe.appendFile(grr.join(s, "timeline.jsonl"), De({
        at: m,
        state: o.state,
        detail: a,
        text: a
      }) + `
`, "utf-8").catch(lf);
    }).catch(lf);
    await e.bridgeWriteChain;
    e.prevState = o.state;
    e.kicked = false;
  }
  async function cLm(e, t, n, r) {
    let o = await sX().catch(() => []);
    let s = new Set(o.filter(a => !FI(a.state.state) && a.state.name).map(a => a.state.name));
    let i = "";
    for (let a = 0; a < 3; a++) {
      let l = s.size > 0 ? `

Avoid these (already taken): ${[...s].join(", ")}` : "";
      let c = xLl();
      let [u, d] = kLl(c);
      let m = (await BU({
        querySource: "agent_namer",
        model: c,
        thinking: u,
        max_tokens: 32 + d,
        maxRetries: 1,
        skipSystemPromptPrefix: true,
        messages: [{
          role: "user",
          content: `2-4 word lowercase label for this job.
User: "${truncate(n, 300)}"${r ? `
Agent: "${truncate(r, 300)}"` : ""}

Include the MOST SPECIFIC identifier (component/file/feature). Skip generic
verbs like fix/add/update. Respond with ONLY the label.${l}`
        }]
      }).catch(() => null))?.content.find(f => f.type === "text");
      if (m?.type !== "text") {
        Et("job_name", "side_query_failed");
        return;
      }
      if (i = truncate(m.text.trim().toLowerCase(), 40), !i || lLm.test(i)) {
        Et("job_name", "degenerate_label");
        return;
      }
      if (!s.vZc(i)) {
        break;
      }
      s.add(i);
    }
    if (s.vZc(i)) {
      Et("job_name", "all_names_taken");
      return;
    }
    e.bridgeWriteChain = e.bridgeWriteChain.then(() => e.inFlight ?? undefined).catch(() => {}).then(async () => {
      let a = await Zi(t);
      if (!a) {
        Et("job_name", "state_gone_after_gen");
        return;
      }
      if (a.name) {
        Pe("job_name");
        return;
      }
      await C7e(t, {
        ...a,
        name: i,
        nameSource: "auto",
        updatedAt: new Date().toISOString()
      }, {
        name: i
      });
      _we(i, "auto").catch(Oe);
      Pe("job_name");
    }).catch(lf);
    await e.bridgeWriteChain;
  }
  async function classifyAndPush(e, t, n, r, o, s, i, a = new Set(), l = false) {
    Z1m(e, n, a);
    let c = e.inFlight;
    if (c) {
      await Promise.race([c.catch(lf), sleep(60000, undefined, {
        unref: true
      })]);
    }
    let u = dLm(e, t, n, r, o, s, i, a, l);
    e.inFlight = u;
    try {
      await u;
    } finally {
      if (e.inFlight === u) {
        e.inFlight = null;
      }
      e.kicked = false;
    }
  }
  function uLm(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t]?.message.content;
      if (!Array.isArray(n)) {
        continue;
      }
      let r;
      for (let o = n.length - 1; o >= 0; o--) {
        let s = n[o];
        if (s.type === "text") {
          let i = Lc(s.text).replace(/\s+/g, " ").trim();
          if (i.length > 8) {
            return mf(i, 800);
          }
        }
        if (s.type === "tool_use" && r === undefined) {
          let i = s.input;
          let l = (Array.isArray(i?.questions) && typeof i.questions[0]?.question === "string" ? i.questions[0].question : undefined) ?? (typeof i?.description === "string" ? i.description : "");
          r = l ? mf(Lc(l).replace(/\s+/g, " ").trim(), 800) : "";
        }
      }
      if (r !== undefined) {
        return r;
      }
    }
    return "";
  }
  async function dLm(e, t, n, r, o, s, i, a, l) {
    let c = dc(t);
    let u = await Zi(c);
    let d = o.length;
    if (u && FI(u.state) && u.tempo !== "active" && d === e.lastMsgCount) {
      return;
    }
    if (u && FI(u.state)) {
      e.prevState = "";
      e.prevStateSince = Date.parse(u.updatedAt) || Date.now();
    } else if (u && u.state !== e.prevState) {
      e.prevState = u.state;
      e.prevStateSince = Date.parse(u.updatedAt) || Date.now();
    }
    let p;
    let m = "";
    if (l) {
      if (u?.tempo === "blocked" || u?.state === "blocked") {
        return;
      }
      p = {
        state: "working",
        tempo: "active",
        detail: uLm(o),
        needs: undefined,
        output: {},
        source: "midturn"
      };
    } else {
      let H = e.lastMsgCount < d ? e.lastMsgCount : 0;
      let U = o.slice(H).filter(N => !N.isApiErrorMessage).map(N => UG(N) || ELl(N)).filter(Boolean).join(`

`);
      if (!U && d > H) {
        let N = u?.state || e.prevState || "working";
        p = {
          state: N,
          tempo: N === "blocked" ? "blocked" : "idle",
          detail: u?.detail ?? "",
          needs: N === "blocked" ? u?.needs ?? e.lastResult?.needs : undefined,
          output: {},
          source: "no-text-turn"
        };
      } else {
        m = Lc(U);
        p = await classify(m, e.prevState || "working", e.latestAsk, summarizeToolCalls(o), Math.round((Date.now() - e.prevStateSince) / 60000), i, a);
      }
    }
    if (!p) {
      return;
    }
    if (s) {
      if (FI(p.state)) {
        p.state = e.prevState || "working";
      }
      if (p.tempo === "idle" || p.tempo === "blocked") {
        p.tempo = "active";
      }
    } else if (!l && p.tempo === "active" && p.state === "working") {
      p.tempo = "idle";
    }
    if (p.state !== e.prevState) {
      e.prevState = p.state;
      e.prevStateSince = Date.now();
    }
    if (e.accumulatedOutputs = p.output, e.onClassified?.(p, l), !Bj()) {
      if (!l) {
        e.lastMsgCount = d;
      }
      if (dRn()) {
        await pRn({
          state: p.state,
          detail: p.detail,
          tempo: FI(p.state) ? "idle" : p.tempo,
          needs: p.tempo === "blocked" ? p.needs : undefined
        });
      }
      return;
    }
    let f = r || e.capturedIntent;
    let h = await Zi(c);
    if (h && Xg(h) && h.updatedAt !== u?.updatedAt) {
      return;
    }
    if (!l) {
      e.lastMsgCount = d;
    }
    if (!li() && fT() !== t) {
      return;
    }
    await EFe.mkdir(c, {
      recursive: true
    }).catch(lf);
    let g = getMaterializedSessionFile() ?? wh();
    let y = h?.linkScanPath && h.linkScanPath !== g ? 0 : h?.linkScanOffset ?? 0;
    let {
      children: _,
      linkScanOffset: b,
      worktree: S
    } = await scanLinkRecords(g, h?.children ?? null, y);
    let E = new Date().toISOString();
    let C = (await Zi(c)) ?? h;
    let x = t8t();
    let A = e8t(x.items) === e8t(C?.fan) ? C?.fan : x.items.length > 0 ? x.items : undefined;
    let k = Z6t(x.budget) === Z6t(C?.budget) ? C?.budget : x.budget;
    let I = C?.tempo === "blocked" && C.updatedAt !== u?.updatedAt;
    let O = FI(p.state) && !C?.firstTerminalAt;
    if (O) {
      logEvent("tengu_bg_agent_terminal", {
        agent: n,
        outcome: p.state,
        durationMs: C ? Date.now() - Date.parse(C.createdAt) : 0,
        classifySource: p.source == null ? undefined : p.source,
        ...VBo(a)
      });
    }
    let M = FI(p.state) ? "idle" : I ? "blocked" : p.tempo;
    let L = FI(p.state) ? undefined : I ? C?.needs : p.tempo === "blocked" ? p.needs : undefined;
    if (!l) {
      e.lastResult = {
        tempo: M,
        block: FI(p.state) || !I ? undefined : C?.block,
        needs: L
      };
    }
    await C7e(c, {
      state: p.state,
      detail: p.detail,
      tempo: M,
      inFlight: Igt(),
      fan: A,
      budget: k,
      tokens: Math.max(C?.tokens ?? 0, getTotalOutputTokens()),
      needs: L,
      block: FI(p.state) || !I ? undefined : C?.block,
      output: Object.keys(e.accumulatedOutputs).length > 0 ? e.accumulatedOutputs : null,
      structuredResult: CLl ?? C?.structuredResult,
      children: _,
      linkScanOffset: b,
      linkScanPath: g,
      template: n,
      routine: C?.routine,
      respawnFlags: C?.respawnFlags ?? [],
      intent: C?.intent ?? f,
      displayIntent: C?.displayIntent,
      initialPrompt: C?.initialPrompt,
      name: C?.name,
      nameSource: C?.nameSource,
      color: C?.color,
      sessionId: C?.sessionId ?? getSessionId(),
      resumeSessionId: getSessionId(),
      daemonShort: C?.daemonShort,
      cliVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      cwd: zoo() ?? C?.cwd ?? Nt(),
      ...worktreeOwnershipFields(S, C),
      originCwd: C?.worktreePath ? C.originCwd : zoo() ?? C?.originCwd,
      bridgeSessionId: C?.bridgeSessionId,
      bridgeOutboundOnly: C?.bridgeOutboundOnly,
      bridgeSessionSeq: C?.bridgeSessionSeq,
      queuedPrompt: C?.queuedPrompt,
      bgIsolation: C?.bgIsolation,
      providerEnv: C?.providerEnv,
      sessionPermissionRules: C?.sessionPermissionRules,
      memoryToggledOff: C?.memoryToggledOff,
      backend: C?.backend ?? "daemon",
      createdAt: C?.createdAt ?? E,
      updatedAt: E,
      firstTerminalAt: O ? E : C?.firstTerminalAt ?? null
    }, {
      state: p.state,
      detail: p.detail,
      tempo: M,
      needs: L ?? ""
    });
    EFe.appendFile(grr.join(c, "timeline.jsonl"), De({
      at: E,
      state: p.state,
      detail: p.detail,
      text: qge(m, 4000)
    }) + `
`, "utf-8").catch(lf);
    let P = h?.intent || f;
    if (!h?.name && P && i === "llm" && !e.nameInFlight) {
      let H = o.filter(W => !W.isApiErrorMessage).map(UG).find(Boolean);
      let U = H ? "" : summarizeToolCalls(o);
      let N = wxe(Lc(H ?? (U ? `[calling ${U}]` : "")), 500);
      e.nameInFlight = true;
      cLm(e, c, P, N).catch(lf).finally(() => {
        e.nameInFlight = false;
      });
    }
    let F = p.source ? p.branch && p.branch !== p.source ? `${p.source}/${p.branch}` : p.source : "?";
    logForDebugging(`[classifier] ${p.state} (${F}) \xB7 ${p.detail}${L ? ` \xB7 needs: ${L}` : ""}`);
  }
  function summarizeToolCalls(e) {
    let t = new Map();
    for (let n of e) {
      if (Array.isArray(n.message.content)) {
        for (let r of n.message.content) {
          if (r.type === "tool_use" && !pLm.vZc(r.name)) {
            t.set(r.name, (t.get(r.name) ?? 0) + 1);
          }
        }
      }
    }
    return [...t].sort((n, r) => r[1] - n[1]).slice(0, 5).map(([n, r]) => r > 1 ? `${n}\xD7${r}` : n).join(", ");
  }
  async function classify(e, t, n, r, o, s, i = new Set()) {
    let a = Date.now();
    let l = zxl(e);
    let c;
    let u = {
      input_tokens: 0,
      output_tokens: 0,
      cache_read_input_tokens: 0,
      cache_creation_input_tokens: 0
    };
    let d = 0;
    let p;
    if (l) {
      c = "preclassify";
      p = {
        ...DYt({}, t, l),
        source: c
      };
    } else if (s === "heuristic") {
      c = "heuristic";
      p = {
        ...DYt({}, t, OLo(e)),
        source: c
      };
    } else {
      let m = e.slice(-2000);
      let f = Yxl({
        tail: m,
        prev: t,
        latestAsk: n,
        toolSummary: r,
        minsInState: o
      });
      let h = Ase({
        ttl: dze("agent_classifier") ? "1h" : undefined,
        scope: mIe() ? "global" : undefined
      });
      let g = xLl();
      let [y, _] = kLl(g);
      c = "apiError";
      let b = null;
      for (let S = 0; S < 2 && !b; S++) {
        d = S + 1;
        let E;
        try {
          E = await BU({
            querySource: "agent_classifier",
            model: g,
            thinking: y,
            max_tokens: 1024 + _,
            maxRetries: 3,
            skipSystemPromptPrefix: true,
            system: [{
              type: "text",
              text: Kxl,
              cache_control: h
            }],
            messages: [{
              role: "user",
              content: S === 0 ? f : `${f}

Previous response was not valid JSON. Respond with ONLY the JSON object, nothing else.`
            }]
          });
        } catch (k) {
          logForDebugging(`[classifier] sideQuery failed: ${k}`);
          break;
        }
        c = "llm";
        let C = E.usage;
        if (C) {
          u.input_tokens += C.input_tokens;
          u.output_tokens += C.output_tokens;
          u.cache_read_input_tokens += C.cache_read_input_tokens ?? 0;
          u.cache_creation_input_tokens += C.cache_creation_input_tokens ?? 0;
        }
        let x = E.content.find(k => k.type === "text");
        let A = x?.type === "text" ? x.text.trim() : "";
        if (!A) {
          logForDebugging(`[classifier] no text block in response, types=${E.content.map(k => k.type).join(",")}`);
          continue;
        }
        b = Jxl(A);
      }
      p = b ? {
        ...DYt(b, t, null),
        source: "llm"
      } : {
        ...DYt({}, t, OLo(e)),
        source: "heuristic"
      };
    }
    logEvent("tengu_bg_classify", {
      path: c,
      engine: s,
      ...VBo(i),
      branch: l?.branch ?? (c === "heuristic" ? "heuristic" : "none"),
      closingShape: Vxl(e),
      prevState: t,
      newState: p?.state ?? "null",
      stateChanged: p !== null && p.state !== t,
      minsInPrevState: Math.round(o),
      durationMs: Date.now() - a,
      tailChars: e.length,
      ...(c === "llm" && {
        attempts: d,
        inputTokens: u.input_tokens,
        outputTokens: u.output_tokens,
        cacheReadInputTokens: u.cache_read_input_tokens,
        cacheCreationInputTokens: u.cache_creation_input_tokens
      })
    });
    return p;
  }
  function worktreeOwnershipFields(e, t) {
    if (e === undefined) {
      return {
        worktreePath: t?.worktreePath,
        worktreeBranch: t?.worktreeBranch,
        worktreeHookBased: t?.worktreeHookBased
      };
    }
    if (e === null || e.enteredExisting) {
      return {
        worktreePath: undefined,
        worktreeBranch: undefined,
        worktreeHookBased: undefined
      };
    }
    return {
      worktreePath: e.worktreePath,
      worktreeBranch: e.worktreeBranch,
      worktreeHookBased: e.hookBased
    };
  }
  async function scanLinkRecords(e, t, n) {
    let r;
    try {
      r = await EFe.open(e, "r");
    } catch {
      return {
        children: t,
        linkScanOffset: n
      };
    }
    let o = n;
    try {
      let {
        size: s
      } = await r.stat();
      if (s === n) {
        return {
          children: t,
          linkScanOffset: s
        };
      }
      if (o = s < n ? 0 : n, s - o > 4194304) {
        o = s - 4194304;
      }
      let i = Buffer.alloc(s - o);
      await r.read(i, 0, i.length, o);
      let a = i.lastIndexOf(10);
      if (a < 0) {
        return {
          children: t,
          linkScanOffset: o
        };
      }
      let l = i.toString("utf-8", 0, a);
      let c = new Map((t ?? []).map(d => [d.href, d]));
      let u;
      for (let d of l.split(`
`)) {
        let p = d.includes('"pr-link"');
        let m = d.includes('"worktree-state"');
        let f = false;
        if (f = d.includes('"frame-link"'), !p && !m && !f) {
          continue;
        }
        try {
          let h = qt(d);
          if (h.type === "pr-link" && h.prUrl) {
            c.set(h.prUrl, {
              id: String(h.prNumber ?? h.prUrl),
              href: h.prUrl,
              kind: "pr"
            });
          } else if (h.type === "worktree-state") {
            u = h.worktreeSession ?? null;
          } else if (h.type === "frame-link" && h.frameUrl && h.path) {
            let g = h.path.split(/[\\/]/).pop() ?? h.path;
            c.delete(h.frameUrl);
            c.set(h.frameUrl, {
              id: g,
              href: h.frameUrl,
              kind: "frame"
            });
          }
        } catch {}
      }
      return {
        children: c.size > 0 ? [...c.values()] : t,
        linkScanOffset: o + a + 1,
        worktree: u
      };
    } catch (s) {
      logForDebugging(`[classifier] scanLinkRecords error: ${s}`);
      return {
        children: t,
        linkScanOffset: o
      };
    } finally {
      await r.close().catch(Oe);
    }
  }
  var EFe;
  var grr;
  var CLl;
  var lLm;
  var pLm;
  var _rr = __lazy(() => {
    at();
    oXt();
    OTt();
    ln();
    $n();
    Ot();
    aE();
    wX();
    OG();
    ioe();
    DC();
    yd();
    vo();
    je();
    dt();
    cs();
    Rn();
    ro();
    kjt();
    Eo();
    Kv();
    Fy();
    fa();
    xme();
    Zn();
    XN();
    Qme();
    H5n();
    w7e();
    zf();
    EFe = require("fs/promises");
    grr = require("path");
    lLm = /^(unspecified|untitled|unnamed)\b|^(unknown|no) (request|task|job|input)\b/;
    pLm = new Set(["ScheduleWakeup", "CronCreate", "Monitor"]);
  });
  function ULl(e) {
    return e.findLastIndex(t => t.type === "user" && !t.isMeta && !PZ(t));
  }
  async function* JBo(e, t, n, r, o, s, i, a, l, c, u, d) {
    let p = d === "tool";
    let m = [...e, ...t, ...n];
    if (a.startsWith("repl_main_thread") || a === "sdk") {
      saveCacheSafeParams(createCacheSafeParams({
        messages: m,
        systemPrompt: r,
        userContext: o,
        systemContext: s,
        toolUseContext: i,
        querySource: a,
        stickyBetas: c
      }));
    }
    if (p || !li() && i.sessionState) {
      yield* BLl(u, [...e, ...t], t, i, a);
    }
    if (!i.agentId) {
      try {
        yield* $De(i);
      } catch {}
    }
    let f = Date.now();
    try {
      let h = executeStopHooks(getToolPermissionContext(i).mode, i.abortController.signal, undefined, l, i.agentId, i, m, i.agentType);
      let g = [];
      for await (let y of h) {
        if (y.message) {
          if (yield y.message, y.message.type === "attachment") {
            let _ = y.message.attachment;
            if ("hookEvent" in _ && (_.hookEvent === "Stop" || _.hookEvent === "SubagentStop")) {
              if (_.type === "hook_non_blocking_error") {
                g.push(_.stderr || `Exit code ${_.exitCode}`);
              } else if (_.type === "hook_error_during_execution") {
                g.push(_.content);
              }
            }
          }
        }
        if (y.blockingError || y.preventContinuation) {
          logForDebugging(`[end-turn] Stop hook block discarded (turn ended by ${d === "tool" ? "tool result" : d === "mcp_meta" ? "MCP end-turn" : "loop tick"}, no model re-invoke): ${y.blockingError?.blockingError ?? y.stopReason ?? "preventContinuation"}`);
        }
      }
      if (g.length > 0) {
        yield {
          type: "notification",
          notification: {
            key: "stop-hook-error",
            text: `Stop hook error occurred \xB7 ${dx("app:toggleTranscript", "Global", "ctrl+o")} to see`,
            priority: "immediate"
          }
        };
      }
    } catch (h) {
      logEvent("tengu_stop_hook_error", {
        duration: Date.now() - f,
        queryChainId: br(i.queryTracking?.chainId),
        queryDepth: i.queryTracking?.depth
      });
      yield wc(`Stop hook failed: ${he(h)}`, "warning");
    }
  }
  async function* BLl(e, t, n, r, o) {
    let s = uXt ? uXt.detectSurfaces() : null;
    let i = s ? uXt.sinksFor(s) : null;
    let a = i ? uXt.engineFor(i) : null;
    if (!e || !a || ZN(o) !== "main" || r.agentId) {
      return;
    }
    e.lastEmittedDetail = "";
    let l = r.getAppState().postTurnSummary;
    if (i.vZc("summary")) {
      yield {
        type: "post_turn_summary",
        value: null
      };
    }
    e.onClassified = (f, h) => {
      if (h || !i.vZc("summary")) {
        return;
      }
      if (f.source === "no-text-turn" && f.detail === "") {
        if (l) {
          r.setAppState(y => y.postTurnSummary === l ? y : {
            ...y,
            postTurnSummary: l
          });
          r.sessionState?.notifyMetadataChanged({
            post_turn_summary: l
          });
          vS()?.reportMetadata({
            post_turn_summary: l
          });
        }
        return;
      }
      let g = uXt.classifiedToPostTurnSummary(f);
      r.setAppState(y => y.postTurnSummary?.status_category === g.status_category && y.postTurnSummary.status_detail === g.status_detail ? y : {
        ...y,
        postTurnSummary: g
      });
      r.sessionState?.notifyMetadataChanged({
        post_turn_summary: g
      });
      vS()?.reportMetadata({
        post_turn_summary: g
      });
      vw({
        type: "system",
        subtype: "post_turn_summary",
        summarizes_uuid: n.at(-1)?.uuid ?? "",
        ...g
      });
    };
    let c = getMainThreadAgentType();
    let u = c ? r.options.agentDefinitions.activeAgents.find(f => f.agentType === c) : undefined;
    let d = t.filter(f => f.type === "assistant");
    let p = YBo.findLatestRealUserAsk(t);
    if (p) {
      YBo.captureLatestAsk(e, p);
    }
    let m = YBo.classifyAndPush(e, fT(), u?.agentType ?? "bg", "", d, S5e(r.taskRegistry.all()), a, s).catch(f => {
      logForDebugging(`[classifier] error: ${he(f)}`, {
        level: "error"
      });
    });
    if (li() || o === "sdk") {
      await withTimeout(m, 60000, "classifier write timed out").catch(() => {});
    }
  }
  async function* $Ll(e, t, n, r, o, s, i, a, l, c) {
    let u = Date.now();
    let d = {
      messages: [...e, ...t],
      systemPrompt: n,
      userContext: r,
      systemContext: o,
      toolUseContext: s,
      querySource: i,
      stickyBetas: l
    };
    if (i.startsWith("repl_main_thread") || i === "sdk") {
      saveCacheSafeParams(createCacheSafeParams(d));
    }
    if (yield* BLl(c, d.messages, t, s, i), !kd()) {
      if (!Pl(process.env.CLAUDE_CODE_ENABLE_PROMPT_SUGGESTION)) {
        cza(d, c?.lastResult);
      }
      if (!s.agentId && dDn()) {
        mLm.executeExtractMemories(d, s.appendSystemMessage);
      }
      if (!s.agentId) {
        iLl(d, s.appendSystemMessage);
      }
    }
    if (!s.agentId) {
      try {
        yield* $De(s);
      } catch {}
    }
    let p = null;
    if ((i.startsWith("repl_main_thread") || i === "sdk") && LLl.isBriefEnabled() && !st(process.env.DISABLE_BRIEF_MODE_STOP_HOOK) && !s.agentId && s.options.tools.some(y => bl(y, R7e.BRIEF_TOOL_NAME))) {
      try {
        let y = ULl(e);
        let _ = e.slice(y + 1);
        let S = _.some(C => C.type === "assistant" && C.message.content.some(x => x.type === "tool_use" && (x.name === R7e.BRIEF_TOOL_NAME || x.name === R7e.LEGACY_BRIEF_TOOL_NAME))) || t.some(C => C.message.content.some(x => x.type === "tool_use" && (x.name === R7e.BRIEF_TOOL_NAME || x.name === R7e.LEGACY_BRIEF_TOOL_NAME)));
        let E = !S && _.some(C => C.type === "user" && C.isMeta && typeof C.message.content === "string" && C.message.content.includes(R7e.BRIEF_ENFORCE_SENTINEL));
        if (!S && !E) {
          p = In({
            content: `${R7e.BRIEF_ENFORCE_SENTINEL} ${LLl.getBriefEnforceText()}`,
            isMeta: true
          });
          yield p;
        }
      } catch (y) {
        logForDebugging(`Brief mode enforcement failed: ${he(y)}`, {
          level: "error"
        });
      }
    }
    let m = null;
    let f = null;
    if (s.options.requiresStructuredOutput && ZN(i) !== "auxiliary") {
      try {
        let y = ULl(e);
        let _ = e.slice(y + 1);
        let b = qLl([..._, ...t], "StructuredOutput");
        let S = !b && _.some(E => E.type === "user" && E.isMeta && typeof E.message.content === "string" && E.message.content.includes("[structured-output-enforce]"));
        if (!b && !S) {
          f = In({
            content: `${"[structured-output-enforce]"} You MUST call the ${"StructuredOutput"} tool to complete this request. Call this tool now.`,
            isMeta: true
          });
          yield f;
        }
      } catch (y) {
        logForDebugging(`StructuredOutput enforcement failed: ${he(y)}`, {
          level: "error"
        });
      }
    }
    let h = false;
    let g;
    try {
      let y = [];
      if (p) {
        y.push(p);
      }
      if (m) {
        y.push(m);
      }
      if (f) {
        y.push(f);
      }
      let _ = s.getAppState();
      let b = getToolPermissionContext(s).mode;
      let S = _.activeGoal;
      if (S) {
        let F = s.taskRegistry.all();
        if (S5e(F) || Trr(F)) {
          if (g = IEt(_, getSessionId()).find(H => H.prompt === S.condition), g) {
            s.sessionHooksRegistry.remove(getSessionId(), "Stop", g);
            logForDebugging("[goal] evaluation deferred \u2014 background work still running");
          }
        }
      }
      let E = F => {
        if (!F) {
          return;
        }
        return (ILe(_, getSessionId(), "Stop").get("Stop") ?? []).flatMap(U => U.hooks).some(U => bZn(U, F)) ? F : undefined;
      };
      let C = executeStopHooks(b, s.abortController.signal, undefined, a, s.agentId, s, d.messages, s.agentType);
      let x = "";
      let A = 0;
      let k = false;
      let I = "";
      let O = false;
      let M = [];
      let L = [];
      let P = [];
      for await (let F of C) {
        if (F.message) {
          if (yield F.message, F.message.type === "progress" && F.message.toolUseID) {
            x = F.message.toolUseID;
            A++;
            let H = F.message.data;
            if (H.command) {
              P.push({
                command: H.command,
                promptText: H.promptText
              });
            }
          }
          if (F.message.type === "attachment") {
            let H = F.message.attachment;
            if ("hookEvent" in H && (H.hookEvent === "Stop" || H.hookEvent === "SubagentStop")) {
              if (H.type === "hook_non_blocking_error") {
                M.push(H.stderr || `Exit code ${H.exitCode}`);
                O = true;
              } else if (H.type === "hook_error_during_execution") {
                M.push(H.content);
                O = true;
              } else if (H.type === "hook_success") {
                if (H.stdout && H.stdout.trim() || H.stderr && H.stderr.trim()) {
                  O = true;
                }
                let U = E(F.hook);
                if (H.hookEvent === "Stop" && U) {
                  s.sessionHooksRegistry.remove(getSessionId(), "Stop", U);
                  let N = s.getAppState().activeGoal;
                  if (N?.condition === U.prompt) {
                    let W = N.iterations + 1;
                    let j = Date.now() - N.setAt;
                    let z = getTotalOutputTokens() - N.tokensAtStart;
                    if (yield {
                      type: "active_goal",
                      value: undefined
                    }, F.impossible) {
                      yield createAttachmentMessage({
                        type: "goal_status",
                        met: false,
                        failed: true,
                        condition: U.prompt,
                        reason: F.stopReason,
                        iterations: W,
                        durationMs: j,
                        tokens: z
                      });
                      logEvent("tengu_goal_failed", {
                        promptLength: U.prompt.length,
                        reasonLength: F.stopReason?.length ?? 0,
                        iterations: W,
                        durationMs: j,
                        tokens: z
                      });
                      Ae("goal_met", "impossible");
                    } else {
                      yield createAttachmentMessage({
                        type: "goal_status",
                        met: true,
                        condition: U.prompt,
                        reason: F.stopReason,
                        iterations: W,
                        durationMs: j,
                        tokens: z
                      });
                      logEvent("tengu_goal_achieved", {
                        promptLength: U.prompt.length,
                        iterations: W,
                        durationMs: j,
                        tokens: z
                      });
                      Pe("goal_met");
                      s.sessionState?.notifyMetadataChanged({
                        goal: {
                          condition: U.prompt,
                          set_at: N.setAt,
                          iterations: W,
                          last_reason: null,
                          met: true
                        }
                      });
                    }
                  }
                }
              }
              if ("durationMs" in H && "command" in H) {
                let U = P.find(N => N.command === H.command && N.durationMs === undefined);
                if (U) {
                  U.durationMs = H.durationMs;
                }
              }
            }
          }
        }
        if (F.blockingError) {
          let H = In({
            content: getStopHookMessage(F.blockingError),
            isMeta: true
          });
          y.push(H);
          yield H;
          O = true;
          let U = E(F.hook);
          let N = s.getAppState().activeGoal;
          if (U && N?.condition === U.prompt) {
            yield {
              type: "active_goal",
              value: {
                ...N,
                iterations: N.iterations + 1,
                lastReason: F.stopReason
              }
            };
            yield createAttachmentMessage({
              type: "goal_status",
              met: false,
              condition: U.prompt,
              reason: F.stopReason
            });
          } else {
            M.push(F.blockingError.blockingError);
          }
        }
        if (F.additionalContexts && F.additionalContexts.length > 0) {
          let H = s.agentId ? "SubagentStop" : "Stop";
          let U = createAttachmentMessage({
            type: "hook_additional_context",
            content: F.additionalContexts,
            hookName: H,
            toolUseID: x,
            hookEvent: H
          });
          y.push(U);
          yield U;
          O = true;
          L.push(...F.additionalContexts);
        }
        if (F.preventContinuation) {
          k = true;
          I = F.stopReason || "Stop hook prevented continuation";
          yield createAttachmentMessage({
            type: "hook_stopped_continuation",
            message: I,
            hookName: "Stop",
            toolUseID: x,
            hookEvent: "Stop"
          });
        }
        if (s.abortController.signal.aborted) {
          logEvent("tengu_pre_stop_hooks_cancelled", {
            queryChainId: br(s.queryTracking?.chainId),
            queryDepth: s.queryTracking?.depth
          });
          yield fZ({
            toolUse: false
          });
          return {
            blockingErrors: [],
            preventContinuation: true
          };
        }
      }
      if (A > 0) {
        if (yield jLl(A, P, M, k, I, O, "suggestion", x, undefined, undefined, L), M.length > 0) {
          let F = dx("app:toggleTranscript", "Global", "ctrl+o");
          if (!a) {
            yield {
              type: "notification",
              notification: {
                key: "stop-hook-error",
                text: `Stop hook error occurred \xB7 ${F} to see`,
                priority: "immediate"
              }
            };
          }
        }
      }
      if (k) {
        return {
          blockingErrors: [],
          preventContinuation: true
        };
      }
      if (y.length > 0) {
        return {
          blockingErrors: y,
          preventContinuation: false
        };
      }
      if (isTeammate()) {
        let F = getAgentName() ?? "";
        let H = getTeamName() ?? "";
        let U = [];
        let N = false;
        let W;
        let j = "";
        let z = H$();
        let K = (await y3(z)).filter(Q => Q.status === "in_progress" && Q.owner === F);
        for (let Q of K) {
          let Z = executeTaskCompletedHooks(Q.id, Q.subject, Q.description, F, H, b, s.abortController.signal, undefined, s);
          for await (let ne of Z) {
            if (ne.message) {
              if (ne.message.type === "progress" && ne.message.toolUseID) {
                j = ne.message.toolUseID;
              }
              yield ne.message;
            }
            if (ne.blockingError) {
              let oe = In({
                content: getTaskCompletedHookMessage(ne.blockingError),
                isMeta: true
              });
              U.push(oe);
              yield oe;
            }
            if (ne.preventContinuation) {
              N = true;
              W = ne.stopReason || "TaskCompleted hook prevented continuation";
              yield createAttachmentMessage({
                type: "hook_stopped_continuation",
                message: W,
                hookName: "TaskCompleted",
                toolUseID: j,
                hookEvent: "TaskCompleted"
              });
            }
            if (s.abortController.signal.aborted) {
              return {
                blockingErrors: [],
                preventContinuation: true
              };
            }
          }
        }
        let J = executeTeammateIdleHooks(F, H, b, s.abortController.signal, undefined, s);
        for await (let Q of J) {
          if (Q.message) {
            if (Q.message.type === "progress" && Q.message.toolUseID) {
              j = Q.message.toolUseID;
            }
            yield Q.message;
          }
          if (Q.blockingError) {
            let Z = In({
              content: getTeammateIdleHookMessage(Q.blockingError),
              isMeta: true
            });
            U.push(Z);
            yield Z;
          }
          if (Q.preventContinuation) {
            N = true;
            W = Q.stopReason || "TeammateIdle hook prevented continuation";
            yield createAttachmentMessage({
              type: "hook_stopped_continuation",
              message: W,
              hookName: "TeammateIdle",
              toolUseID: j,
              hookEvent: "TeammateIdle"
            });
          }
          if (s.abortController.signal.aborted) {
            return {
              blockingErrors: [],
              preventContinuation: true
            };
          }
        }
        if (N) {
          return {
            blockingErrors: [],
            preventContinuation: true
          };
        }
        if (U.length > 0) {
          return {
            blockingErrors: U,
            preventContinuation: false
          };
        }
      }
      return {
        blockingErrors: [],
        preventContinuation: false
      };
    } catch (y) {
      h = true;
      let _ = Date.now() - u;
      logEvent("tengu_stop_hook_error", {
        duration: _,
        queryChainId: br(s.queryTracking?.chainId),
        queryDepth: s.queryTracking?.depth
      });
      yield wc(`Stop hook failed: ${he(y)}`, "warning");
      let b = [];
      if (p) {
        b.push(p);
      }
      if (m) {
        b.push(m);
      }
      if (f) {
        b.push(f);
      }
      return {
        blockingErrors: b,
        preventContinuation: false
      };
    } finally {
      if (g) {
        s.sessionHooksRegistry.add(getSessionId(), "Stop", "", g);
      }
      if (h) {
        Ae("hook_stop_handler", "hook_stop_handler_failed");
      } else {
        Pe("hook_stop_handler");
      }
    }
  }
  var mLm;
  var YBo;
  var uXt;
  var LLl;
  var R7e;
  var HLl = __lazy(() => {
    at();
    _7e();
    kre();
    Eb();
    ln();
    Ot();
    Gu();
    Cx();
    ci();
    O1();
    rR();
    Lmo();
    je();
    dt();
    pZ();
    Sp();
    ro();
    YI();
    qp();
    at();
    x$();
    zf();
    DBo();
    Ugt();
    yd();
    Sl();
    gn();
    CO();
    mLm = (nXt(), __toCommonJS(crr));
    YBo = (_rr(), __toCommonJS(yrr));
    uXt = (r6n(), __toCommonJS(iCo));
    LLl = (D3(), __toCommonJS(CZ));
    R7e = (k2(), __toCommonJS(kIe));
  });
  function WLl() {
    return {
      sessionId: getSessionId(),
      gates: {
        emitToolUseSummaries: st(process.env.CLAUDE_CODE_EMIT_TOOL_USE_SUMMARIES),
        isAnt: false,
        fastModeEnabled: !st(process.env.CLAUDE_CODE_DISABLE_FAST_MODE)
      }
    };
  }
  var GLl = __lazy(() => {
    at();
    gn();
  });
  function zLl() {
    return {
      callModel: aEt,
      autocompact: ZBo,
      uuid: VLl.randomUUID,
      now: () => new Date().toISOString()
    };
  }
  var VLl;
  var KLl = __lazy(() => {
    aE();
    d$();
    VLl = require("crypto");
  });
  var fLm;
  var P_S;
  var Err = __lazy(() => {
    PP();
    fLm = /\b(?:use|spend)\s+(\d+(?:\.\d+)?)\s*(k|m|b)\s*tokens?\b/i;
    P_S = new RegExp(fLm.source, "gi");
  });
  var YLl = __lazy(() => {
    ln();
    Err();
  });
  function JLl(e) {
    let t = e.toLowerCase();
    return /\b(wtf|wth|ffs|omfg|shit(ty|tiest)?|dumbass|horrible|awful|piss(ed|ing)? off|piece of (shit|crap|junk)|what the (fuck|hell)|fucking? (broken|useless|terrible|awful|horrible)|fuck you|screw (this|you)|so frustrating|this sucks|damn it)\b/.test(t);
  }
  function XLl(e) {
    let t = e.toLowerCase().trim();
    if (t === "continue") {
      return true;
    }
    return /\b(keep going|go on)\b/.test(t);
  }
  function QLl(e) {
    let t = e.toLowerCase();
    return /\bgo to (sleep|bed)\b/.test(t);
  }
  function ZLl(e) {
    let t = e.trim();
    if (t.length > 40) {
      return false;
    }
    if (/^(\?+|\.{2,}|\u2026+)$/u.test(t)) {
      return true;
    }
    let n = t.toLowerCase().replace(/^[\u00BF\u00A1]+|[?!.\u00BF\u00A1\uFF1F\uFF01\u3002\u2026]+$/gu, "").trim();
    if (/^(hi+|hello+|he+y+|yo+)$/.test(n)) {
      return true;
    }
    return hLm.vZc(n);
  }
  var hLm;
  var e2o = __lazy(() => {
    hLm = new Set(["ping", "u there", "you there", "are you there", "r u there", "u here", "you here", "are you here", "you back", "are you back", "u back", "anyone there", "anybody there", "still there", "you still there", "are you still there", "still working", "you still working", "are you still working", "you stuck", "are you stuck", "u stuck", "\u5582", "\u5728\u5417", "\u5728\u55CE", "\u8FD8\u5728\u5417", "\u9084\u5728\u55CE", "\u5728\u4E0D\u5728", "\u3082\u3057\u3082\u3057", "\u304A\u3044", "\u304A\u30FC\u3044", "\u3044\u307E\u3059\u304B", "\uC5EC\uBCF4\uC138\uC694", "\uC57C", "\uC788\uC5B4\uC694", "hola", "oye", "est\xE1s ah\xED", "estas ahi", "sigues ah\xED", "sigues ahi", "oi", "ol\xE1", "ola", "al\xF4", "alo", "t\xE1 a\xED", "ta ai", "est\xE1 a\xED", "esta ai", "allo", "all\xF4", "salut", "coucou", "t'es l\xE0", "t'es la", "tu es l\xE0", "tu es la", "hallo", "bist du da", "noch da", "\u043F\u0440\u0438\u0432\u0435\u0442", "\u044D\u0439", "\u0430\u043B\u043B\u043E", "\u0442\u044B \u0442\u0443\u0442", "ciao", "ehi", "ci sei"]);
  });
  function eFl() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_malformed_tool_use_clean_retry", false);
  }
  function tFl(e) {
    let t = e.flatMap(n => n.message.content).findLast(n => n.type === "text")?.text ?? "";
    return gLm.test(t);
  }
  function nFl(e, t, n) {
    if (e > 0) {
      return "succeeded";
    }
    if (t === "tool_use" && !n) {
      return "gave_up";
    }
    if (t === "end_turn") {
      return "end_turn";
    }
    return "other";
  }
  var gLm;
  var rFl = __lazy(() => {
    $n();
    gLm = new RegExp("<antml:invoke\\b");
  });
  function SLm(e) {
    if (e === "<") {
      return "<";
    }
    if (e === " ") {
      return " ";
    }
    return "other";
  }
  function TLm(e) {
    for (let t of yLm) {
      if (e.includes(t)) {
        return t;
      }
    }
    return null;
  }
  function ELm(e) {
    let t = null;
    for (let s of oFl) {
      let i = e.indexOf(`

${s}`);
      if (i !== -1 && (t === null || i < t.index)) {
        t = {
          index: i,
          fragment: s
        };
      }
    }
    if (t === null) {
      let s = _Lm.exec(e);
      if (s !== null) {
        t = {
          index: s.index,
          fragment: s[1]
        };
      }
    }
    if (t === null) {
      return null;
    }
    let n = t.index + 2 + t.fragment.length;
    let r = e.slice(t.index, t.index + 200);
    let o = TLm(r);
    return {
      fragment: t.fragment,
      suffix: SLm(e[n]),
      looksFabricated: o !== null,
      tailMarker: o,
      matchIndex: t.index,
      tail: r
    };
  }
  function sFl(e) {
    for (let t of oFl) {
      if (t === e) {
        return t;
      }
    }
    return "catch_all";
  }
  function* vLm(e) {
    for (let t of e) {
      for (let n of t.message.content) {
        let r;
        let o;
        if (n.type === "text") {
          r = "text";
          o = n.text;
        } else if (n.type === "thinking") {
          r = "thinking";
          o = n.thinking;
        } else {
          continue;
        }
        let s = ELm(o);
        if (s === null) {
          continue;
        }
        if (sFl(s.fragment) === "catch_all" && s.suffix !== "<" && !s.looksFabricated) {
          continue;
        }
        yield {
          hit: s,
          blockType: r,
          message: t
        };
      }
    }
  }
  function iFl(e, t) {
    for (let {
      hit: n,
      blockType: r,
      message: o
    } of vLm(e)) {
      logEvent("tengu_fabricated_turn_candidate", {
        model: sm(t),
        matched_fragment: sFl(n.fragment),
        suffix: n.suffix,
        looks_fabricated: n.looksFabricated,
        tail_marker: n.tailMarker !== null ? n.tailMarker : undefined,
        block_type: r,
        tail_sha256: i3i.createHash("sha256").update(n.tail).digest("hex").slice(0, 12),
        request_id: br(o.requestId),
        message_id: br(o.message.id)
      });
    }
  }
  var oFl;
  var yLm;
  var _Lm;
  var aFl = __lazy(() => {
    Ot();
    Gu();
    B_();
    dw();
    oFl = ["um", "user", "Hmm", "User", "Benutzer", "Human", "usr", "usem", "Mensch", "usuario"];
    yLm = ["Human:", "Assistant:", "<dm ", "<system", "<tool_", "<function_"];
    _Lm = /\n\n(\p{L}{1,12})(?=[< ])/u;
  });
  function vFe() {
    if (t2o === undefined) {
      t2o = Twe?.().createClassifierJobState() ?? null;
    }
    return t2o;
  }
  function wLm() {
    let e = Me.CLAUDE_CODE_FABLE_BRIDGE_DIALOG_TIMEOUT_MS;
    return e !== undefined && e > 0 ? e : 60000;
  }
  function* CLm(e, t, n, r) {
    for (let o of e) {
      let s = o.message.content.filter(i => i.type === "tool_use");
      for (let i of s) {
        if (r?.vZc(i.id)) {
          continue;
        }
        yield In({
          content: [{
            type: "tool_result",
            content: t,
            is_error: true,
            tool_use_id: i.id
          }],
          toolUseResult: t,
          sourceToolAssistantUUID: o.uuid,
          now: n?.now,
          uuidFn: n?.uuid
        });
      }
    }
  }
  function pfe(e, t) {
    let n = vFe();
    if (!Twe || !n || !Bj() || !t.startsWith("repl_main_thread") || e.agentId) {
      return;
    }
    Twe().markTurnAborted(n, fT());
  }
  function pXt(e) {
    if (e.agentId) {
      return;
    }
    let t = unwrapAbortReason(e.abortController.signal.reason);
    if (t !== "user-cancel" && t !== "remote-cancel") {
      return;
    }
    return getLastCancelledAPIMessageId() ?? undefined;
  }
  function RLm(e) {
    let t = e.findLastIndex(r => r.type === "assistant");
    return e.slice(t + 1).findLast(selectableUserMessagesFilter)?.uuid ?? null;
  }
  async function* xLm({
    endTurnSource: e,
    messagesForQuery: t,
    assistantMessages: n,
    toolResults: r,
    toolUseBlocks: o,
    systemPrompt: s,
    userContext: i,
    systemContext: a,
    toolUseContext: l,
    updatedToolUseContext: c,
    querySource: u,
    stopHookActive: d,
    stickyBetas: p,
    queryChainIdForAnalytics: m,
    queryDepth: f,
    deps: h
  }) {
    try {
      if (logEvent("tengu_mcp_tool_result_ended_turn", {
        queryChainId: m,
        queryDepth: f,
        source: e
      }), e === "mcp_meta") {
        pfe(l, u);
      }
      let g = new Map();
      for (let y of r) {
        if (y.type === "user" && Array.isArray(y.message.content)) {
          for (let _ of y.message.content) {
            if (_.type === "tool_result") {
              g.set(_.tool_use_id, _.content);
            }
          }
        }
      }
      for await (let y of executePostToolBatchHooks(o.map(_ => ({
        tool_name: _.name,
        tool_input: _.input,
        tool_use_id: _.id,
        tool_response: g.get(_.id)
      })), `hook-${h.uuid()}`, c, getToolPermissionContext(c).mode, c.abortController.signal)) {
        if (y.message) {
          yield y.message;
        }
        if (y.blockingError || y.preventContinuation) {
          logForDebugging(`[end-turn] PostToolBatch block discarded (turn ended by ${e === "tool" ? "tool result" : "MCP end-turn"}, no model re-invoke): ${y.blockingError?.blockingError ?? y.stopReason ?? "preventContinuation"}`);
        }
      }
      if (c.abortController.signal.aborted) {
        if (!c.agentId) {
          try {
            yield* $De(c);
          } catch {}
        }
        if (c.abortController.signal.reason !== "interrupt") {
          yield fZ({
            toolUse: false,
            interruptedMessageId: pXt(c),
            now: h.now,
            uuidFn: h.uuid
          });
        }
      }
      yield* JBo(t, n, r, s, i, a, l, u, d, p, vFe(), e);
    } catch (g) {
      if (mg(g)) {
        return;
      }
      Oe(g);
    }
  }
  function dfe(e, t, n) {
    let r = vFe();
    if (!Twe || !r || !Bj() || !t.startsWith("repl_main_thread") || e.agentId) {
      return;
    }
    Twe().markApiFailure(r, fT(), n.error, UG(n) ?? n.errorDetails ?? "").catch(() => {});
  }
  function cFl(e) {
    return e?.type === "assistant" && e.apiError === "max_output_tokens";
  }
  function ALm(e, t) {
    let r = [typeof e === "string" ? e : Array.isArray(e) ? e.join(`

`) : undefined, t].filter(o => !!o);
    return r.length > 0 ? r.join(`

`) : undefined;
  }
  async function* _U(e) {
    let t = [];
    let n;
    try {
      n = yield* ILm(e, t);
    } finally {
      let r = e.toolUseContext.agentId;
      if (r) {
        vHn(r, "subagent_exit", e.querySource);
      }
    }
    for (let r of t) {
      yield {
        type: "command_lifecycle",
        uuid: r,
        state: "completed"
      };
    }
    switch (n.reason) {
      case "completed":
      case "stop_hook_prevented":
      case "hook_stopped":
      case "tool_deferred":
      case "max_turns":
      case "aborted_streaming":
      case "aborted_tools":
      case "background_requested":
        Pe("turn");
        break;
      case "blocking_limit":
      case "rapid_refill_breaker":
      case "prompt_too_long":
      case "image_error":
      case "model_error":
        Ae("turn", n.reason);
        break;
    }
    return n;
  }
  async function* ILm(e, t) {
    let {
      systemPrompt: n,
      userContext: r,
      systemContext: o,
      canUseTool: s,
      fallbackModel: i,
      querySource: a,
      spawnedBySkill: l,
      maxTurns: c,
      skipCacheWrite: u,
      evictCacheOnComplete: d,
      forkPointUuid: p
    } = e;
    let m = e.deps ?? zLl();
    let f = RLm(kg(e.messages));
    let h;
    let g = {
      messages: e.messages,
      toolUseContext: e.toolUseContext,
      maxOutputTokensOverride: e.maxOutputTokensOverride,
      compactTracking: undefined,
      stopHookActive: e.stopHookActive ?? false,
      stopHookBlockingCount: 0,
      maxOutputTokensRecoveryCount: 0,
      hasAttemptedReactiveCompact: false,
      thinkingOnlyNudged: false,
      turnCount: 1,
      pendingToolUseSummary: undefined,
      transition: undefined
    };
    let y = null;
    let _ = undefined;
    let b = WLl();
    using S = startRelevantMemoryPrefetch(g.messages, g.toolUseContext, a, {
      systemPrompt: n,
      userContext: r,
      systemContext: o
    });
    let E = false;
    let C = false;
    let x = false;
    let A;
    let k = false;
    let I = Array.isArray(i) ? i : i !== undefined ? [i] : [];
    let O = getMainLoopModel_export(e.toolUseContext);
    let M = [O, ...I.filter(j => j !== O)];
    let L = 0;
    let P;
    let F;
    let H = a.startsWith("repl_main_thread") || a === "sdk";
    let U = ZN(a);
    let N = e.stickyBetas ?? (U === "main" || U === undefined ? undefined : U === "subagent" ? Cae() : wN(getStickyBetas()));
    let W = U === "main" || U === undefined;
    while (true) {
      if (W && g.toolUseContext.shouldStopBeforeNextApiCall?.()) {
        return {
          reason: "background_requested"
        };
      }
      let {
        toolUseContext: j
      } = g;
      let {
        messages: z,
        compactTracking: V,
        maxOutputTokensRecoveryCount: K,
        hasAttemptedReactiveCompact: J,
        thinkingOnlyNudged: Q,
        maxOutputTokensOverride: Z,
        pendingToolUseSummary: ne,
        stopHookActive: oe,
        stopHookBlockingCount: ee,
        turnCount: re
      } = g;
      if (yield {
        type: "stream_request_start"
      }, Qp("query_fn_entry"), !j.agentId) {
        vx("query_started");
      }
      let se = j.queryTracking ? {
        chainId: j.queryTracking.chainId,
        depth: j.queryTracking.depth + 1
      } : {
        chainId: m.uuid(),
        depth: 0
      };
      let ae = se.chainId;
      j = {
        ...j,
        queryTracking: se
      };
      let de = [...kg(z)];
      let be = V;
      let fe = j.precomputeSourceKey !== undefined && be?.compacted !== true && !Z4t(a);
      let me = a.startsWith("agent:") || a.startsWith("repl_main_thread");
      de = await WIa(de, j.contentReplacementState, me ? He => void recordContentReplacement(He, j.agentId).catch(Oe) : undefined, new Set(j.options.tools.filter(He => !Number.isFinite(He.maxResultSizeChars)).map(He => He.name)));
      let Te = 0;
      Sga();
      let ue = uFl(n, o);
      Qp("query_autocompact_start");
      let ce = yield* m.autocompact(de, j, {
        systemPrompt: n,
        userContext: r,
        systemContext: o,
        toolUseContext: j,
        forkContextMessages: de,
        stickyBetas: N
      }, a, be, Te, rmo);
      if (Qp("query_autocompact_end"), ce.kind === "rapid_refill_breaker_tripped") {
        logEvent("tengu_auto_compact_rapid_refill_breaker", {
          consecutiveRapidRefills: be?.consecutiveRapidRefills ?? 0,
          turnsSincePreviousCompact: be?.turnCounter ?? -1,
          queryChainId: ae,
          queryDepth: se.depth
        });
        let He = Ml({
          content: "Autocompact is thrashing: the context refilled to the limit within 3 turns of the previous compact, 3 times in a row. A file being read or a tool output is likely too large for the context window. Try reading in smaller chunks, or use /clear to start fresh.",
          error: "invalid_request",
          now: m.now,
          uuid: m.uuid
        });
        yield He;
        dfe(j, a, He);
        return {
          reason: "rapid_refill_breaker"
        };
      }
      if (ce.kind === "compacted") {
        let {
          result: He,
          thresholdSource: Gt
        } = ce;
        let {
          preCompactTokenCount: mt,
          postCompactTokenCount: Dt,
          truePostCompactTokenCount: jt,
          compactionUsage: bn
        } = He;
        let Ct = aO(j.options.mainLoopModel, getEffortValue(j));
        if (logEvent("tengu_auto_compact_succeeded", {
          thresholdSource: Gt == null ? undefined : Gt,
          routedThroughReactive: ce.routedThroughReactive,
          originalMessageCount: z.length,
          compactedMessageCount: He.summaryMessages.length + He.attachments.length + He.hookResults.length,
          ...(Ct && {
            effort_level: Ct
          }),
          preCompactTokenCount: mt,
          postCompactTokenCount: Dt,
          truePostCompactTokenCount: jt,
          compactionInputTokens: bn?.input_tokens,
          compactionOutputTokens: bn?.output_tokens,
          compactionCacheReadTokens: bn?.cache_read_input_tokens ?? 0,
          compactionCacheCreationTokens: bn?.cache_creation_input_tokens ?? 0,
          compactionTotalTokens: bn ? bn.input_tokens + (bn.cache_creation_input_tokens ?? 0) + (bn.cache_read_input_tokens ?? 0) + bn.output_tokens : 0,
          queryChainId: ae,
          queryDepth: se.depth
        }), e.taskBudget) {
          let hn = ydo(de);
          _ = Math.max(0, (_ ?? e.taskBudget.total) - hn);
        }
        if (FTe() === "padded-countdown") {
          fWt(j.agentId ?? "main", L1(de));
        }
        be = cdo(m.uuid(), ce.consecutiveRapidRefills);
        for (let hn of r2o(He)) {
          yield hn;
        }
        de = ATe(He);
      } else if (ce.kind === "failed") {
        be = {
          ...(be ?? {
            compacted: false,
            turnId: "",
            turnCounter: 0
          }),
          consecutiveFailures: ce.consecutiveFailures
        };
      }
      let le = ce.kind === "compacted" || ce.kind === "failed";
      if (emo({
        autocompactRan: le,
        hasAttemptedReactiveCompact: J,
        lastTransitionReason: g.transition?.reason,
        isPreFirstCompactFork: fe,
        querySource: a,
        contextTokens: Ob(de, bytesPerTokenForModel(j.options.mainLoopModel)) - Te,
        model: j.options.mainLoopModel,
        autoCompactWindow: j.options.autoCompactWindow
      })) {
        if (U === "subagent") {
          Qpo(j.agentId, "subagent_estimate", Vg(a) ?? "");
        } else {
          tmo({
            querySource: a,
            messages: de,
            cacheSafeParams: {
              systemPrompt: n,
              userContext: r,
              systemContext: o,
              toolUseContext: j,
              forkContextMessages: de,
              stickyBetas: N
            },
            ...(a === "sdk" && {
              promptScan: o2o(de)
            })
          });
        }
      }
      j = {
        ...j,
        messages: de,
        turnStartIndex: DLm(de)
      };
      let pe = [];
      let ve = [];
      let _e = [];
      let xe = false;
      let ke = false;
      let Ie = null;
      Qp("query_setup_start");
      let Ue = new ywe(j.options.tools, s, j, m.now);
      function* Ge() {
        if (j.abortController.signal.aborted) {
          return;
        }
        for (let He of Ue.getCompletedResults()) {
          if ($z(He)) {
            yield He;
            continue;
          }
          if (He.message) {
            yield He.message;
            let Gt = sfo(He.message);
            if (Gt) {
              ke = Gt;
            }
            if (!mXt(He.message)) {
              let mt = EO([He.message], j.options.refreshTools?.() ?? j.options.tools, j.options.mainLoopModel);
              x4t(mt, Yg(j.options.mainLoopModel).maxBase64Size);
              ve.push(...mt.filter(Dt => Dt.type === "user"));
            }
          }
        }
      }
      let Be = j.getAppState();
      let We = getToolPermissionContext(j).mode;
      let Ze = We === "plan" && a$n(de);
      let Tt = getRuntimeMainLoopModel({
        permissionMode: We,
        mainLoopModel: P ?? F ?? M[L] ?? O,
        exceeds200kTokens: Ze
      });
      let kt = getRuntimeMainLoopModel({
        permissionMode: We,
        mainLoopModel: getMainLoopModel(),
        exceeds200kTokens: Ze
      });
      if (gpt(Tt, j.requestDialog)) {
        let He = "cancelled";
        let Gt = false;
        let mt = j.getAppState().replBridgeSessionActive === true;
        let Dt = aga({
          requestDialog: j.requestDialog,
          isMainThread: H
        }) && !(mt && hasFableBridgeDialogTimedOut()) && !j.abortController.signal.aborted;
        if (Dt && j.requestDialog) {
          if (mt) {
            let bn = new AbortController();
            let Ct = () => bn.abort();
            j.abortController.signal.addEventListener("abort", Ct, {
              once: true
            });
            setFableConsentDialogInteracted(false);
            let hn = setTimeout(vn => {
              if (hasFableConsentDialogInteracted()) {
                return;
              }
              Gt = true;
              setFableBridgeDialogTimedOut();
              Et("model_fable_consent", "bridge_dialog_timeout");
              vn.abort();
            }, wLm(), bn);
            try {
              He = await j.requestDialog(CTe, {
                overagesEnabled: TDe()
              }, {
                signal: bn.signal
              });
            } finally {
              clearTimeout(hn);
              j.abortController.signal.removeEventListener("abort", Ct);
            }
          } else {
            He = await j.requestDialog(CTe, {
              overagesEnabled: TDe()
            }, {
              signal: j.abortController.signal
            });
          }
        }
        let jt = He === "consent" && (await cga());
        if (!jt && j.abortController.signal.aborted) {
          let bn = unwrapAbortReason(j.abortController.signal.reason);
          if (bn !== "interrupt" && bn !== "refusal-fallback-edit") {
            yield fZ({
              toolUse: false,
              interruptedMessageId: pXt(j),
              now: m.now,
              uuidFn: m.uuid
            });
          }
          pfe(j, a);
          return {
            reason: "aborted_streaming"
          };
        }
        if (Dt && isSdkDialogHostActive()) {
          if (jt) {
            Pe("model_fable_consent");
          } else if (He === "consent") {
            Et("model_fable_consent", "overage_enable_deferred");
          } else if (He === "switch_default") {
            Ae("model_fable_consent", "declined");
          } else if (!Gt) {
            Et("model_fable_consent", "dismissed");
          }
        }
        if (!jt) {
          if (!Dt && H) {
            Et("model_fable_consent", "no_dialog_fallback");
          }
          let bn = getFableDeclineFallbackModel();
          if (bn === null) {
            if (H) {
              Ae("model_fable_consent", "no_allowed_fallback");
            }
            let vn = Ml({
              content: "Your model policy only allows Fable 5, which requires usage credits \xB7 /model to set it up",
              now: m.now,
              uuid: m.uuid
            });
            yield vn;
            dfe(j, a, vn);
            return {
              reason: "model_error",
              error: Error("Fable consent declined and the model policy allows no non-Fable fallback")
            };
          }
          let Ct = Tt;
          let hn = false;
          if (H) {
            if (He === "switch_default") {
              hn = lga(bn);
            }
            j.setAppState(vn => ({
              ...vn,
              mainLoopModel: bn,
              mainLoopModelForSession: null
            }));
            setMainLoopModelOverride(bn);
          }
          if (j.options = {
            ...j.options,
            mainLoopModel: bn
          }, Tt = bn, F = bn, H) {
            yield {
              type: "system",
              subtype: "model_consent_fallback",
              content: `Switched to ${renderModelName(bn)} ${hn ? "\u2014 now your default model" : "for this session"} \xB7 ${renderModelName(Ct)} requires usage credits \xB7 /model to change`,
              level: "warning",
              choice: He,
              originalModel: Ct,
              fallbackModel: bn,
              persistedAsDefault: hn,
              isMeta: false,
              timestamp: m.now(),
              uuid: m.uuid()
            };
          }
        }
      }
      Qp("query_setup_end");
      let Ye = b.gates.isAnt && ZN(a) !== "auxiliary" ? qba(j.agentId ?? b.sessionId) : undefined;
      let ht = false;
      let It = Sx() && DX() && !yDe(j.options.mainLoopModel, j.options.autoCompactWindow);
      if (ce.kind !== "compacted" && a !== "compact" && !It && !ht) {
        if (_De(Ob(de, bytesPerTokenForModel(j.options.mainLoopModel)) - Te, j.options.mainLoopModel, j.options.autoCompactWindow).level === "blocked") {
          if (!gDe(a)) {
            logEvent("tengu_ptl_surfaced_to_user", {
              reason: "blocking_limit",
              querySource: Vg(a),
              wasGatedByPriorAttempt: false,
              reactiveUnsupported: !DX()
            });
          }
          let mt = Ml({
            content: "Prompt is too long",
            error: "invalid_request",
            now: m.now,
            uuid: m.uuid
          });
          yield mt;
          dfe(j, a, mt);
          return {
            reason: "blocking_limit"
          };
        }
      }
      if (Twe && Bj() && a.startsWith("repl_main_thread") && !j.agentId) {
        let He = de.findLast(Gt => Gt.type === "user" && !Gt.isMeta && typeof Gt.message.content === "string");
        Twe().markTurnActive(vFe(), fT(), He?.type === "user" && typeof He.message.content === "string" && !IZ(He.message.content) ? He.message.content : undefined);
      }
      let Rt = true;
      let wt;
      let vt;
      let yt;
      Qp("query_api_loop_start");
      try {
        while (Rt) {
          Rt = false;
          let He = PLm(Tt, kt) || !Be.advisorModel || vba(Tt, Be.advisorModel) ? Be.advisorModel : undefined;
          if (Be.advisorModel && He === undefined) {
            logForDebugging(`[AdvisorTool] Skipping advisor - ${Be.advisorModel} cannot advise non-configured attempt model ${Tt} (configured: ${kt})`);
          }
          if (A !== undefined) {
            if (k) {
              A = undefined;
              k = false;
            } else {
              k = true;
            }
          }
          let Gt = [];
          let mt = pe.length;
          let Dt;
          let jt;
          let bn = [];
          let Ct;
          let hn = false;
          function* vn() {
            let Pn = Dt;
            if (Pn === undefined) {
              return 0;
            }
            let Lr = [];
            for (let ao = pe.length - 1; ao >= 0; ao--) {
              if (Pn.vZc(pe[ao].uuid)) {
                Lr.unshift(pe[ao]);
                pe.splice(ao, 1);
              }
            }
            bn.push(...Lr);
            for (let ao of Lr) {
              yield {
                type: "tombstone",
                message: ao
              };
            }
            return Lr.length;
          }
          function* zn() {
            let Pn = jt;
            if (Pn === undefined) {
              return;
            }
            if (bn.length > 0) {
              Pn.retractedMessageUuids = bn.flatMap(Lr => xS([Lr]).filter(Bme).map(ao => ao.uuid));
            }
            Pn.refusedUserMessageUuid = f;
            yield Pn;
            jt = undefined;
          }
          try {
            let Pn = false;
            let Lr = [];
            let ao = [];
            let Nn = fha();
            let Tr = getSdkDialogCapabilitySource();
            let To = j.getAppState().replBridgeSessionActive;
            let wr = Nn || To;
            let Ut = Oba({
              currentModel: Tt,
              alreadyUsed: E,
              declined: C,
              suppressionAlreadyLogged: x,
              requestDialog: j.requestDialog,
              isMainThread: H,
              consumerLacksDialogCapability: wr,
              sticky: N ?? getStickyBetas()
            });
            if (Ut.shouldLogSuppression) {
              x = true;
              logEvent("tengu_refusal_fallback_suppressed", {
                reason: j.requestDialog === undefined ? "no_dialog_host_setting_off" : Nn ? "no_consumer_capability_setting_off" : "remote_controlled_session_setting_off",
                capability_source: Tr
              });
            }
            let Wn = Ut.serverLane;
            let Fr = wt;
            wt = undefined;
            let Is = vt;
            vt = undefined;
            let _r = yt;
            yt = undefined;
            Qp("query_api_streaming_start");
            for await (let kn of I1l(m.callModel({
              messages: dFl(de, r),
              systemPrompt: ue,
              thinkingConfig: getThinkingConfig(j),
              tools: j.options.tools,
              signal: j.abortController.signal,
              options: {
                async getToolPermissionContext() {
                  return getToolPermissionContext(j);
                },
                model: Tt,
                ...(b.gates.fastModeEnabled && {
                  fastMode: j.options.fastMode
                }),
                toolChoice: undefined,
                isNonInteractiveSession: j.options.isNonInteractiveSession,
                fallbackModel: M[L + 1],
                refusalFallbackModel: !E && !C && Wn === undefined ? Ut.visibleModel : undefined,
                serverRefusalFallback: Wn,
                fallbackCreditCode: Fr,
                fallbackCreditMintModel: Is,
                fallbackCreditMintRequestId: _r,
                fallbackCreditLaneArmed: Ut.visibleModel !== undefined,
                onStreamingFallback: () => {
                  Pn = true;
                },
                onHintCleared: (Qn, gi) => {
                  Gt.push({
                    type: "hint_clears",
                    ids: [...Qn],
                    contentById: Object.fromEntries(gi)
                  });
                  for (let Ks of Jga(de, Qn)) {
                    j.readFileState.delete(us(Ks));
                  }
                  de = H4t(de, Qn, gi);
                },
                querySource: a,
                keepPartialMessageOnAbort: e.keepPartialMessageOnAbort,
                spawnedBySkill: l,
                activeSkill: j.options.activeSkill,
                activeMcpServer: j.options.activeMcpServer,
                activeMcpTool: j.options.activeMcpTool,
                messageClientPlatform: j.options.messageClientPlatform,
                agents: j.options.agentDefinitions.activeAgents,
                allowedAgentTypes: j.options.agentDefinitions.allowedAgentTypes,
                hasAppendSystemPrompt: !!j.options.appendSystemPrompt,
                userSystemPrompt: !j.agentId && Tx() ? ALm(j.options.customSystemPrompt, j.options.appendSystemPrompt) : undefined,
                maxOutputTokensOverride: Z,
                fetchOverride: Ye,
                mcpTools: Be.mcp.tools,
                promptTooLongIsHandled: true,
                hasPendingMcpServers: Be.mcp.clients.some(Qn => Qn.type === "pending"),
                queryTracking: se,
                effortValue: getEffortValue(j),
                advisorModel: He,
                skipCacheWrite: u,
                evictCacheOnComplete: d,
                forkPointUuid: p,
                stablePrefixUuid: h,
                stickyBetas: N,
                agentId: j.agentId,
                agentContext: j.agentContext,
                onRetryStatus: j.onRetryStatus,
                subscribeRetryWake: j.subscribeRetryWake,
                ...(e.taskBudget && {
                  taskBudget: {
                    total: e.taskBudget.total,
                    ...(_ !== undefined && {
                      remaining: _
                    })
                  }
                })
              }
            }), () => Ue)) {
              if (kn.type === "tool_drain_tick") {
                yield* Ge();
                continue;
              }
              if (Gt.length > 0) {
                yield* Gt;
                Gt.length = 0;
              }
              if (kn.type === "server_fallback") {
                {
                  let Ms = Dba(kn, {
                    isMainThread: H
                  });
                  if (logEvent("tengu_rotunda_pennant_applied", {
                    reason: Ms.telemetry.reason,
                    mid_stream: Ms.telemetry.midStream,
                    discarded_block_count: Ms.telemetry.discardedBlockCount,
                    tombstoned_had_tool_use: Ms.telemetry.tombstonedHadToolUse,
                    request_id_sha12: Ms.telemetry.requestId !== null ? i3i.createHash("sha256").update(Ms.telemetry.requestId).digest("hex").slice(0, 12) : undefined,
                    original_model_scope: Ms.telemetry.originalModelScope,
                    queryChainId: ae,
                    queryDepth: se.depth,
                    querySource: Vg(a) ?? "",
                    final_stop_reason: (Ms.telemetry.finalStopReason ?? undefined) == null ? undefined : Ms.telemetry.finalStopReason ?? undefined,
                    api_refusal_category: Ms.telemetry.apiRefusalCategory == null ? undefined : Ms.telemetry.apiRefusalCategory
                  }), Ms.userVisible) {
                    Pe("refusal_fallback");
                    let Ia = Tt;
                    let ec = Tt === kn.toModel;
                    if (!(isModelAllowedUnderActiveEnforcement(kn.toModel) ?? (isModelAllowed(kn.toModel) || isExemptDefaultResolvingPick(kn.toModel)))) {
                      logForDebugging(`Server refusal-fallback target "${kn.toModel}" is not in the availableModels allowlist; declining the swap`, {
                        level: "warn"
                      });
                      C = true;
                      let Kn = [];
                      for (let Br of kn.discardedMessages) {
                        let Pr = pe.findIndex(Vr => Vr.uuid === Br.uuid);
                        if (Pr !== -1) {
                          pe.splice(Pr, 1);
                        }
                        Kn.push(Br);
                      }
                      for (let Br = pe.length - 1; Br >= 0; Br--) {
                        let Pr = pe[Br];
                        if (Pr.message.model === kn.toModel) {
                          pe.splice(Br, 1);
                          Kn.push(Pr);
                        }
                      }
                      let sn = ve.slice();
                      ve.length = 0;
                      _e.length = 0;
                      Lr.length = 0;
                      xe = false;
                      ke = false;
                      let Ln = Ue.discardAndAbortInFlight(serverFallbackTombstoneAbortReason());
                      logEvent("tengu_rotunda_pennant_tools", {
                        lane: "decline",
                        aborted: Ln.aborted,
                        completed_before_event: Ln.completedBeforeEvent,
                        queued_never_started: Ln.queuedNeverStarted,
                        compensated_removes: Ln.toolUseIds.length
                      });
                      Ue = new ywe(j.options.tools, s, j, m.now);
                      for (let Br of Kn) {
                        yield {
                          type: "tombstone",
                          message: Br
                        };
                      }
                      for (let Br of sn) {
                        yield {
                          type: "tombstone",
                          message: Br
                        };
                      }
                      if (Ln.toolUseIds.length > 0) {
                        yield {
                          type: "set_in_progress_tool_use_ids",
                          op: {
                            action: "remove",
                            ids: Ln.toolUseIds
                          }
                        };
                      }
                      let ct = kn.reason === "refusal" ? q9e("refusal", {
                        type: "refusal",
                        category: kn.apiRefusalCategory ?? null,
                        explanation: null
                      }, kn.requestId, Tt) : Ml({
                        content: "The server routed this response to a model that is not in your organization\u2019s availableModels allowlist; the response was discarded.",
                        error: "invalid_request",
                        now: m.now,
                        uuid: m.uuid
                      });
                      if (ct) {
                        pe.push(ct);
                        yield ct;
                      }
                      break;
                    }
                    if (E = true, P = kn.toModel, Tt = kn.toModel, Ms.swapSession) {
                      let Kn = j.getAppState();
                      latchRefusalFallbackModel({
                        fallbackModel: kn.toModel,
                        previousOverride: getMainLoopModelOverride(),
                        previousAppStateModel: Kn.mainLoopModel,
                        previousModelForSession: Kn.mainLoopModelForSession
                      });
                      j.setAppState(sn => ({
                        ...sn,
                        mainLoopModel: kn.toModel,
                        mainLoopModelForSession: null
                      }));
                      setMainLoopModelOverride(kn.toModel);
                      j.options.mainLoopModel = kn.toModel;
                    }
                    if ((0).size > 0) {
                      for (let Kn = pe.length - 1; Kn >= 0; Kn--) {
                        if ((0).vZc(pe[Kn].uuid)) {
                          pe.splice(Kn, 1);
                        }
                      }
                    }
                    let Os = [];
                    if (Ms.tombstonedToolUse) {
                      let Kn = Ue.discardAndAbortInFlight(serverFallbackTombstoneAbortReason());
                      if (logEvent("tengu_rotunda_pennant_tools", {
                        lane: "accept",
                        aborted: Kn.aborted,
                        completed_before_event: Kn.completedBeforeEvent,
                        queued_never_started: Kn.queuedNeverStarted,
                        compensated_removes: Kn.toolUseIds.length
                      }), Os = [...ve], ve.length = 0, _e.length = 0, xe = false, ke = false, Ue = new ywe(j.options.tools, s, j, m.now), Kn.toolUseIds.length > 0) {
                        yield {
                          type: "set_in_progress_tool_use_ids",
                          op: {
                            action: "remove",
                            ids: Kn.toolUseIds
                          },
                          reason: "fallback_sweep"
                        };
                      }
                    }
                    if (kn.midStream) {
                      Dt = new Set(pe.slice(mt).map(sn => sn.uuid));
                      let Kn = kn.retainedText;
                      if (Kn !== undefined && Kn.length > 0) {
                        Ct = {
                          text: Kn,
                          originals: kn.retainedMessages ?? []
                        };
                      }
                    }
                    bn.push(...kn.discardedMessages, ...Os.filter(Kn => Kn.type !== "system"));
                    for (let Kn of kn.discardedMessages) {
                      yield {
                        type: "tombstone",
                        message: Kn,
                        displayOnly: true
                      };
                    }
                    for (let Kn of Os) {
                      yield {
                        type: "tombstone",
                        message: Kn,
                        displayOnly: true
                      };
                    }
                    if (Ct !== undefined) {
                      hn = true;
                      yield {
                        type: "refusal_continuation",
                        phase: "begin",
                        salvageText: Ct.text,
                        replacesUuids: Ct.originals.map(Kn => Kn.uuid)
                      };
                    }
                    if (Ms.showBanner && !ec) {
                      jt = Mba({
                        ...kn,
                        fromModel: Ia
                      }, {
                        timestamp: m.now(),
                        uuid: m.uuid()
                      });
                    }
                  }
                }
                continue;
              }
              if (kn.type === "refusal_no_fallback") {
                if (jt !== undefined) {
                  let Ms = yield* vn();
                  if (hn) {
                    hn = false;
                    Ct = undefined;
                    yield {
                      type: "refusal_continuation",
                      phase: "end"
                    };
                  }
                  logEvent("tengu_rotunda_pennant_chain_exhausted", {
                    swept_dangling_count: Ms,
                    queryChainId: ae,
                    queryDepth: se.depth,
                    querySource: Vg(a) ?? ""
                  });
                  yield* zn();
                }
                if (H) {
                  yield {
                    type: "system",
                    subtype: "model_refusal_no_fallback",
                    content: "",
                    level: "warning",
                    originalModel: kn.originalModel,
                    requestId: kn.requestId,
                    apiRefusalCategory: kn.apiRefusalCategory,
                    apiRefusalExplanation: kn.apiRefusalExplanation,
                    refusedUserMessageUuid: f,
                    isMeta: false,
                    timestamp: m.now(),
                    uuid: m.uuid()
                  };
                }
                continue;
              }
              if (kn.type === "fallback_request") {
                if (!E && !C && NX()) {
                  let Ms = hha({
                    requestDialog: j.requestDialog,
                    isMainThread: H,
                    consumerLacksDialogCapability: wr
                  });
                  let Ia = {
                    original_model: kn.originalModel,
                    fallback_model: kn.fallbackModel,
                    trigger: kn.trigger,
                    request_id: kn.requestId,
                    queryChainId: ae,
                    queryDepth: se.depth,
                    querySource: Vg(a),
                    api_refusal_category: kn.apiRefusalCategory ? spt(kn.apiRefusalCategory) : undefined,
                    has_api_refusal_explanation: Boolean(kn.apiRefusalExplanation)
                  };
                  let ec = [...pe, ...ve].flatMap(Ln => xS([Ln]).filter(Bme).map(ct => ct.uuid));
                  if (0) {
                    logEvent("tengu_refusal_fallback_dialog_suppressed", {
                      ...Ia,
                      reason: Nn ? "no_consumer_capability" : "remote_controlled_session",
                      capability_source: Tr,
                      retracted_wire_uuid_count: ec.length
                    });
                  }
                  let Os = 0 ? "cancelled" : "retry_fallback";
                  if (Ms === undefined && j.requestDialog) {
                    if (logEvent("tengu_refusal_fallback_prompt_shown", {
                      ...Ia,
                      capability_source: Tr,
                      retracted_wire_uuid_count: ec.length
                    }), Os = await j.requestDialog(WX, {
                      originalModel: kn.originalModel,
                      fallbackModel: kn.fallbackModel,
                      apiRefusalCategory: kn.apiRefusalCategory,
                      retractedMessageUuids: ec,
                      guidanceText: yha()
                    }, {
                      signal: j.abortController.signal
                    }), Os !== "cancelled") {
                      logEvent("tengu_refusal_fallback_prompt_choice", {
                        ...Ia,
                        choice: Os
                      });
                    }
                  }
                  if (Os !== "retry_fallback") {
                    if (C = true, kn.creditCode !== null) {
                      logEvent("tengu_fallback_credit_forfeited", {
                        reason: Os === "cancelled" ? "cancelled" : "dialog_declined",
                        mint_request_id: br(kn.requestId),
                        mint_model: sm(Tt)
                      });
                    }
                    for (let ct of pe) {
                      yield {
                        type: "tombstone",
                        message: ct
                      };
                    }
                    for (let ct of ve) {
                      yield {
                        type: "tombstone",
                        message: ct
                      };
                    }
                    pe.length = 0;
                    ve.length = 0;
                    _e.length = 0;
                    Lr.length = 0;
                    xe = false;
                    ke = false;
                    let Ln = yWt(Ue, "refusal_decline");
                    if (Ue = new ywe(j.options.tools, s, j, m.now), Ln) {
                      yield Ln;
                    }
                    if (Os === "edit_prompt") {
                      j.abortController.abort(userAbortReason("refusal-fallback-edit"));
                    }
                    if (Os === "cancelled" && !j.abortController.signal.aborted) {
                      let ct = q9e("refusal", {
                        type: "refusal",
                        category: kn.apiRefusalCategory ?? null,
                        explanation: kn.apiRefusalExplanation ?? null
                      }, kn.requestId, kn.originalModel);
                      if (ct) {
                        pe.push(ct);
                        yield ct;
                      }
                    }
                    break;
                  }
                  let Kn = pha(pe);
                  if (E = true, P = kn.fallbackModel, wt = kn.creditCode ?? undefined, vt = wt !== undefined ? Tt : undefined, yt = wt !== undefined ? kn.requestId ?? undefined : undefined, Tt = kn.fallbackModel, Rt = true, A = H && ec.length > 0 ? ec : undefined, k = false, H) {
                    let Ln = j.getAppState();
                    latchRefusalFallbackModel({
                      fallbackModel: kn.fallbackModel,
                      previousOverride: getMainLoopModelOverride(),
                      previousAppStateModel: Ln.mainLoopModel,
                      previousModelForSession: Ln.mainLoopModelForSession
                    });
                    j.setAppState(ct => ({
                      ...ct,
                      mainLoopModel: kn.fallbackModel,
                      mainLoopModelForSession: null
                    }));
                    setMainLoopModelOverride(kn.fallbackModel);
                    j.options.mainLoopModel = kn.fallbackModel;
                  }
                  Pe("refusal_fallback");
                  logEvent("tengu_refusal_fallback_triggered", {
                    ...Ia,
                    retracted_wire_uuid_count: ec.length,
                    prompt_skipped_reason: Ms == null ? undefined : Ms,
                    had_partial_text: Kn.partialTextChars > 0,
                    partial_text_chars: Kn.partialTextChars,
                    salvaged_tool_use_count: Kn.toolUseCount,
                    had_empty_input_tool_use: Kn.hadEmptyInputToolUse,
                    credit_minted: kn.creditCode !== null
                  });
                  for (let Ln of pe) {
                    yield {
                      type: "tombstone",
                      message: Ln
                    };
                  }
                  for (let Ln of ve) {
                    yield {
                      type: "tombstone",
                      message: Ln
                    };
                  }
                  pe.length = 0;
                  ve.length = 0;
                  _e.length = 0;
                  Lr.length = 0;
                  xe = false;
                  ke = false;
                  let sn = yWt(Ue, "refusal_retry");
                  if (Ue = new ywe(j.options.tools, s, j, m.now), sn) {
                    yield sn;
                  }
                  if (H) {
                    yield {
                      type: "system",
                      subtype: "model_refusal_fallback",
                      direction: "retry",
                      content: E$n(kn.originalModel, kn.fallbackModel, kn.apiRefusalCategory),
                      level: "warning",
                      trigger: kn.trigger,
                      originalModel: kn.originalModel,
                      fallbackModel: kn.fallbackModel,
                      requestId: kn.requestId,
                      apiRefusalCategory: kn.apiRefusalCategory,
                      apiRefusalExplanation: kn.apiRefusalExplanation,
                      retractedMessageUuids: ec,
                      refusedUserMessageUuid: f,
                      isMeta: false,
                      timestamp: m.now(),
                      uuid: m.uuid()
                    };
                  }
                } else {
                  let Ms = q9e("refusal", {
                    type: "refusal",
                    category: kn.apiRefusalCategory ?? null,
                    explanation: kn.apiRefusalExplanation ?? null
                  }, kn.requestId, kn.originalModel);
                  if (Ms) {
                    pe.push(Ms);
                    yield Ms;
                  }
                }
                break;
              }
              if (kn.type === "streaming_fallback_began") {
                Pn = true;
              }
              if (Pn) {
                for (let Ia of pe) {
                  yield {
                    type: "tombstone",
                    message: Ia
                  };
                }
                for (let Ia of ve) {
                  yield {
                    type: "tombstone",
                    message: Ia
                  };
                }
                logEvent("tengu_orphaned_messages_tombstoned", {
                  orphanedMessageCount: pe.length,
                  queryChainId: ae,
                  queryDepth: se.depth
                });
                pe.length = 0;
                ve.length = 0;
                _e.length = 0;
                Lr.length = 0;
                xe = false;
                ke = false;
                let Ms = yWt(Ue, "streaming_fallback");
                if (Ue = new ywe(j.options.tools, s, j, m.now), Ms) {
                  yield Ms;
                }
                Pn = false;
              }
              if (kn.type === "streaming_fallback_began") {
                continue;
              }
              let Qn = kn;
              let gi;
              let Ks = false;
              let Fa;
              if (kn.type === "assistant") {
                let Ms;
                for (let Ia = 0; Ia < kn.message.content.length; Ia++) {
                  let ec = kn.message.content[Ia];
                  if (ec.type === "tool_use" && typeof ec.input === "object" && ec.input !== null) {
                    if ((0)?.backfillObservableInput) {
                      let Os = ec.input;
                      let Kn = {
                        ...Os
                      };
                      if ((0).backfillObservableInput(Kn), Object.keys(Kn).some(Ln => !(Ln in Os))) {
                        Ms ??= [...kn.message.content];
                        Ms[Ia] = {
                          ...ec,
                          input: Kn
                        };
                      }
                    }
                  }
                }
                if (Ms) {
                  Qn = {
                    ...kn,
                    message: {
                      ...kn.message,
                      content: Ms
                    }
                  };
                  Lr.push({
                    src: kn.message,
                    dst: Qn.message
                  });
                }
              }
              if (Ct !== undefined && kn.type === "assistant" && !kn.isApiErrorMessage) {
                let Ms = Qn.type === "assistant" ? Qn : kn;
                let Ia = Ms.message.content;
                let ec = Ia.findIndex(Os => Os.type === "text");
                if (0 !== undefined && (0).type === "text" && (0).text.trim().length > 0) {
                  let Os = [...Ia];
                  Os[ec] = {
                    ...0,
                    text: Ct.text + (0).text
                  };
                  let Kn = {
                    ...Ms,
                    message: {
                      ...Ms.message,
                      content: Os
                    }
                  };
                  Lr.push({
                    src: kn.message,
                    dst: Kn.message
                  });
                  {
                    let sn = Ct.originals;
                    let Ln = new Set(sn.map(ct => ct.uuid));
                    for (let ct = pe.length - 1; ct >= 0; ct--) {
                      if (Ln.vZc(pe[ct].uuid)) {
                        pe.splice(ct, 1);
                      }
                    }
                    if (pe.push(Kn), Ks = true, Fa = sn, bn.push(...sn), H) {
                      Kn.supersedesUuids = sn.flatMap(ct => xS([ct]).filter(Bme).map(Br => Br.uuid));
                      logEvent("tengu_refusal_fallback_supersedes", {
                        lane: "server_stitch",
                        count: Kn.supersedesUuids.length
                      });
                    }
                    Dt = new Set([Kn.uuid]);
                    Ct = undefined;
                  }
                  Qn = Kn;
                  gi = Kn;
                }
              }
              if (kn.type === "stream_event" && kn.event.type === "message_delta") {
                Ie = kn.event.delta.stop_reason;
                for (let {
                  src: Ms,
                  dst: Ia
                } of Lr) {
                  Ia.usage = Ms.usage;
                  Ia.stop_reason = Ms.stop_reason;
                  Ia.stop_details = Ms.stop_details;
                }
                Lr.length = 0;
              }
              let Hs = false;
              if (Vya(kn)) {
                Hs = true;
              }
              if (amo(kn)) {
                Hs = true;
                ao.push(kn);
              }
              if (cFl(kn)) {
                Hs = true;
              }
              if (!Hs) {
                if (ao.length > 0) {
                  yield* ao;
                  ao.length = 0;
                }
                if (A !== undefined && Qn.type === "assistant" && !Qn.isApiErrorMessage && xS([Qn]).some(Bme)) {
                  let Ms = A;
                  A = undefined;
                  k = false;
                  Qn = {
                    ...Qn,
                    supersedesUuids: Ms
                  };
                  logEvent("tengu_refusal_fallback_supersedes", {
                    lane: "client_retry",
                    count: Ms.length
                  });
                }
                yield Qn;
              }
              if (kn.type === "assistant") {
                let Ms = gi ?? kn;
                if (!Ks) {
                  pe.push(Ms);
                }
                let Ia = Ms.message.content.filter(ec => ec.type === "tool_use");
                if (Ia.length > 0) {
                  _e.push(...Ia);
                  xe = true;
                }
                if (!j.abortController.signal.aborted) {
                  for (let ec of Ia) {
                    Ue.addTool(ec, Ms);
                  }
                }
              }
              if (Fa !== undefined) {
                let Ms = Fa;
                Fa = undefined;
                for (let Ia of Ms) {
                  yield {
                    type: "tombstone",
                    message: Ia,
                    displayOnly: true
                  };
                }
              }
              yield* Ge();
            }
            if (Qp("query_api_streaming_end"), Gt.length > 0) {
              yield* Gt;
              Gt.length = 0;
            }
            if (Dt !== undefined && (pe.at(-1)?.message.stop_reason ?? Ie) === "refusal") {
              yield* vn();
            }
            if (hn) {
              hn = false;
              Ct = undefined;
              yield {
                type: "refusal_continuation",
                phase: "end"
              };
            }
            yield* zn();
            {
              let kn = pe.at(-1);
              let Qn = kn ? uoe(kn) : undefined;
              if (Qn) {
                let gi = doe(Qn);
                if (emo({
                  autocompactRan: le,
                  hasAttemptedReactiveCompact: J,
                  lastTransitionReason: g.transition?.reason,
                  isPreFirstCompactFork: fe,
                  querySource: a,
                  contextTokens: gi,
                  model: j.options.mainLoopModel,
                  autoCompactWindow: j.options.autoCompactWindow
                })) {
                  if (U === "subagent" && _e.length === 0) {
                    Qpo(j.agentId, "subagent_final_turn", Vg(a) ?? "");
                  } else {
                    let Ks = Qn.input_tokens + (Qn.cache_creation_input_tokens ?? 0) + (Qn.cache_read_input_tokens ?? 0);
                    let Fa = Ob(de, bytesPerTokenForModel(j.options.mainLoopModel)) - Te;
                    tmo({
                      querySource: a,
                      messages: [...de, ...pe],
                      cacheSafeParams: {
                        systemPrompt: n,
                        userContext: r,
                        systemContext: o,
                        toolUseContext: j,
                        forkContextMessages: de,
                        stickyBetas: N
                      },
                      armTrigger: "api_response",
                      estimateGapTokens: Ks - Fa,
                      ...(a === "sdk" && {
                        promptScan: o2o([...de, ...pe])
                      })
                    });
                  }
                }
              }
            }
          } catch (Pn) {
            if (hn) {
              hn = false;
              Ct = undefined;
              yield {
                type: "refusal_continuation",
                phase: "end"
              };
            }
            if (yield* zn(), Gt.length > 0) {
              yield* Gt;
              Gt.length = 0;
            }
            let Lr = M[L + 1];
            if (Pn instanceof XU && Lr !== undefined) {
              L++;
              P = undefined;
              F = undefined;
              let ao = null;
              let Nn = false;
              let Tr = false;
              let To = false;
              while (L < M.length) {
                let Wn = M[L];
                let Fr = gpt(Wn, j.requestDialog);
                if (Fr) {
                  To = true;
                }
                let Is = Fr ? getFableDeclineFallbackModel() : Wn;
                if (Fr && Is !== null && a === "compact" && swapShrinksContextWindow(M[0], Is)) {
                  Is = null;
                }
                if (Is === Pn.originalModel) {
                  Tr = true;
                } else if (Is !== null) {
                  ao = Is;
                  Nn = Fr;
                  break;
                }
                L++;
              }
              let wr = ao === null && Tr && (Pn.reason === "overloaded" || Pn.reason === "server_error");
              if (wr) {
                ao = Pn.originalModel;
              }
              if (To && H) {
                Et("model_fable_consent", "chain_advance_substituted");
              }
              if (ao === null) {
                throw Pn.originalError ?? Pn;
              }
              if (Nn || wr) {
                F = ao;
              }
              Tt = ao;
              Rt = true;
              k = false;
              for (let Wn of pe) {
                yield {
                  type: "tombstone",
                  message: Wn
                };
              }
              for (let Wn of ve) {
                yield {
                  type: "tombstone",
                  message: Wn
                };
              }
              pe.length = 0;
              ve.length = 0;
              _e.length = 0;
              xe = false;
              ke = false;
              let Ut = yWt(Ue, "chain_advance");
              if (Ue = new ywe(j.options.tools, s, j, m.now), Ut) {
                yield Ut;
              }
              if (j.options.mainLoopModel = Tt, wr) {
                logForDebugging(`chain advance collapsed onto the failed model ${Tt}; re-dispatching in place with the full retry budget`);
                continue;
              }
              Pe("model_fallback");
              logEvent("tengu_model_fallback_triggered", {
                original_model: Pn.originalModel,
                fallback_model: Tt,
                chain_index: L,
                query_source: Vg(a),
                reason: Pn.reason,
                entrypoint: "cli",
                queryChainId: ae,
                queryDepth: se.depth
              });
              yield {
                type: "system",
                subtype: "model_fallback",
                content: Pn.reason === "model_not_found" || Pn.reason === "permission_denied" || Pn.reason === "model_blocked" ? `Switched to ${renderModelName(Tt)} because ${renderModelName(Pn.originalModel)} is not available` : OLm(Pn.reason, renderModelName(Pn.originalModel), renderModelName(Tt), Pn.originalError),
                level: "warning",
                trigger: Pn.reason,
                originalModel: Pn.originalModel,
                fallbackModel: Tt,
                isMeta: false,
                timestamp: m.now(),
                uuid: m.uuid()
              };
              continue;
            }
            throw Pn;
          }
        }
      } catch (He) {
        let Gt = He instanceof Error ? He.message : String(He);
        if (logEvent("tengu_query_error", {
          assistantMessages: pe.length,
          toolUses: pe.flatMap(jt => jt.message.content.filter(bn => bn.type === "tool_use")).length,
          queryChainId: ae,
          queryDepth: se.depth
        }), He instanceof ipt || He instanceof Y2) {
          logForDebugging(`Query image error: ${Gt}`, {
            level: "error"
          });
          let jt = Ml({
            content: He.message,
            error: "invalid_request",
            errorDetails: He.message,
            now: m.now,
            uuid: m.uuid
          });
          yield jt;
          dfe(j, a, jt);
          return {
            reason: "image_error"
          };
        }
        if (He instanceof XU && He.reason === "model_blocked") {
          let jt = Ml({
            content: `${renderModelName(He.originalModel)} is currently unavailable.`,
            error: "rate_limit",
            now: m.now,
            uuid: m.uuid
          });
          yield jt;
          dfe(j, a, jt);
          return {
            reason: "model_error",
            error: He
          };
        }
        Oe($o(sr(He), "queryLoop invariant broken"));
        let mt = new Set(ve.flatMap(jt => jt.type === "user" && Array.isArray(jt.message.content) ? jt.message.content.filter(bn => bn.type === "tool_result").map(bn => bn.tool_use_id) : []));
        yield* CLm(pe, Gt, m, mt);
        let Dt = Ml({
          content: Gt,
          now: m.now,
          uuid: m.uuid
        });
        yield Dt;
        dfe(j, a, Dt);
        logAntError("Query error", He);
        return {
          reason: "model_error",
          error: He
        };
      }
      if (pe.some(He => He.message.content.some(Gt => Gt.type === "text" && QLl(Gt.text)))) {
        logEvent("tengu_model_response_keyword_detected", {
          is_suggests_break: true,
          queryChainId: ae,
          queryDepth: se.depth
        });
      }
      if (pe.length > 0) {
        Uba([...de, ...pe], n, r, o, j, a);
      }
      if (j.abortController.signal.aborted) {
        for await (let He of Ue.getRemainingResults()) {
          if ($z(He)) {
            yield He;
            continue;
          }
          if (He.message) {
            yield He.message;
          }
        }
        if (!j.agentId) {
          try {
            yield* $De(j);
          } catch {}
        }
        if (!n2o.vZc(unwrapAbortReason(j.abortController.signal.reason))) {
          yield fZ({
            toolUse: false,
            interruptedMessageId: pXt(j),
            now: m.now,
            uuidFn: m.uuid
          });
        }
        pfe(j, a);
        return {
          reason: "aborted_streaming"
        };
      }
      if (ne) {
        let He = await ne;
        if (He) {
          yield He;
        }
      }
      if (g.transition?.reason === "malformed_tool_use_retry") {
        let He = pe.at(-1);
        logEvent("tengu_malformed_tool_use_retry_outcome", {
          model: sm(Tt),
          outcome: nFl(_e.length, He?.message.stop_reason ?? Ie, He?.isApiErrorMessage),
          clean_retry_enabled: g.transition.cleanRetry
        });
      }
      if (!xe) {
        let bn = function (vn) {
          for (let zn = vn.length - 1; zn >= 0; zn--) {
            let Pn = vn[zn];
            if (Pn.type === "user") {
              if (Pn.isMeta || PZ(Pn)) {
                continue;
              }
              return false;
            }
            if (Pn.type !== "assistant") {
              continue;
            }
            if (Pn.message.content.some(Lr => Lr.type === "tool_use" && Lr.name === "StructuredOutput")) {
              return true;
            }
          }
          return false;
        };
        let He = pe.at(-1);
        let Gt = He?.type === "assistant" && He.isApiErrorMessage && wTe(He);
        let Dt = !(null !== null && He?.type === "assistant" && (null).isToolUseDeniedMessage(He)) && amo(He);
        let jt = Gt || Dt ? {
          ...j,
          abortController: createRecoveryAbortController(j.abortController)
        } : j;
        if (Gt || Dt) {
          let vn = o$n(be);
          let {
            consecutiveRapidRefills: zn
          } = vn;
          if (!J && vn.action === "trip") {
            logEvent("tengu_auto_compact_rapid_refill_breaker", {
              consecutiveRapidRefills: be?.consecutiveRapidRefills ?? 0,
              turnsSincePreviousCompact: be?.turnCounter ?? -1,
              queryChainId: ae,
              queryDepth: se.depth,
              reactive: true
            });
            let Wn = Ml({
              content: "Autocompact is thrashing: the context refilled to the limit within 3 turns of the previous compact, 3 times in a row. A file being read or a tool output is likely too large for the context window. Try reading in smaller chunks, or use /clear to start fresh.",
              error: "invalid_request",
              now: m.now,
              uuid: m.uuid
            });
            yield Wn;
            dfe(j, a, Wn);
            return {
              reason: "rapid_refill_breaker"
            };
          }
          if (He && lmo({
            hasAttempted: J,
            querySource: a,
            aborted: j.abortController.signal.aborted
          }) && hya(de)) {
            let Wn = K4t(de);
            let Fr = Wn.length;
            let Is = Dt ? "image_error" : "prompt_too_long";
            let {
              actualTokens: _r,
              limitTokens: kn
            } = D4t(He.errorDetails ?? "");
            let Qn = nR(Wn.flat());
            let gi = _r !== undefined ? Math.max(0, _r - Qn) : undefined;
            logEvent("tengu_ptl_surfaced_to_user", {
              reason: Is,
              querySource: Vg(a),
              wasGatedByPriorAttempt: J,
              reactiveUnsupported: !DX(),
              precomputedKind: "not_consulted",
              compactionImpossible: true,
              totalGroups: Fr,
              overheadTokensEstimate: gi
            });
            let Ks = Is === "prompt_too_long" ? {
              ...Ml({
                content: Gha({
                  actualTokens: _r,
                  limitTokens: kn,
                  conversationTokensEstimate: Qn
                }),
                error: "invalid_request",
                errorDetails: He.errorDetails,
                now: m.now,
                uuid: m.uuid
              }),
              requestId: He.requestId,
              apiErrorStatus: He.apiErrorStatus
            } : He;
            yield Ks;
            executeStopFailureHooks(Ks, j);
            dfe(j, a, Ks);
            return {
              reason: Is
            };
          }
          let Pn = performance.now();
          let Lr = Gt && He ? dpt(He) : undefined;
          let {
            outcome: ao,
            swap: Nn,
            emittedEarlyCompactStart: Tr
          } = yield* Ydt((Wn, Fr, Is) => rmo({
            toolUseContext: Wn,
            messages: de,
            trigger: "ptl",
            isWithheld413: Gt,
            hasAttemptedReactiveCompact: J,
            borrowFrom: fe ? j.precomputeSourceKey : undefined,
            detectedAt: Pn,
            querySource: a
          }), jt);
          let {
            result: To
          } = yield* Ydt((Wn, Fr, Is) => CHn({
            hasAttempted: J,
            querySource: a,
            aborted: jt.abortController.signal.aborted,
            messages: de,
            cacheSafeParams: {
              systemPrompt: n,
              userContext: r,
              systemContext: o,
              toolUseContext: Wn,
              forkContextMessages: de,
              stickyBetas: N
            },
            precomputed: Nn,
            precomputeOutcome: ao,
            userWaitStartedAt: Pn,
            initialTokenGap: Lr
          }), jt);
          if (To) {
            if (e.taskBudget) {
              let Is = ydo(de);
              _ = Math.max(0, (_ ?? e.taskBudget.total) - Is);
            }
            if (FTe() === "padded-countdown") {
              fWt(j.agentId ?? "main", L1(de));
            }
            for (let Is of r2o(To)) {
              yield Is;
            }
            let Wn = ATe(To);
            be = cdo(m.uuid(), zn);
            g = {
              messages: Wn,
              toolUseContext: j,
              compactTracking: be,
              maxOutputTokensRecoveryCount: K,
              hasAttemptedReactiveCompact: Nn === undefined,
              thinkingOnlyNudged: Q,
              maxOutputTokensOverride: undefined,
              pendingToolUseSummary: undefined,
              stopHookActive: oe,
              stopHookBlockingCount: 0,
              turnCount: re,
              transition: {
                reason: Nn ? "precomputed_compact_swap" : "reactive_compact_retry"
              }
            };
            continue;
          }
          if (Tr) {
            yield {
              type: "compact_progress",
              event: {
                type: "compact_end"
              }
            };
            yield {
              type: "sdk_status",
              status: null
            };
          }
          let wr = Dt ? "image_error" : "prompt_too_long";
          let Ut = a === "compact" || gDe(a);
          if (!j.abortController.signal.aborted && !Ut) {
            logEvent("tengu_ptl_surfaced_to_user", {
              reason: wr,
              querySource: Vg(a),
              wasGatedByPriorAttempt: J,
              precomputedKind: ao.kind,
              precomputedFailureCause: (ao.kind === "failed" ? ao.failure.cause : undefined) == null ? undefined : ao.kind === "failed" ? ao.failure.cause : undefined,
              reactiveUnsupported: !DX()
            });
          }
          yield He;
          executeStopFailureHooks(He, j);
          dfe(j, a, He);
          return {
            reason: wr
          };
        }
        if (iFl(pe, Tt), cFl(He)) {
          if (K < 3) {
            let vn = In({
              content: "Output token limit hit. Resume directly \u2014 no apology, no recap of what you were doing. " + "Pick up mid-thought if that is where the cut happened. Break remaining work into smaller pieces.",
              isMeta: true,
              now: m.now,
              uuidFn: m.uuid
            });
            g = {
              messages: [...de, ...pe, vn],
              toolUseContext: j,
              compactTracking: be,
              maxOutputTokensRecoveryCount: K + 1,
              hasAttemptedReactiveCompact: J,
              thinkingOnlyNudged: Q,
              maxOutputTokensOverride: undefined,
              pendingToolUseSummary: undefined,
              stopHookActive: oe,
              stopHookBlockingCount: 0,
              turnCount: re,
              transition: {
                reason: "max_output_tokens_recovery",
                attempt: K + 1
              }
            };
            continue;
          }
          yield He;
        }
        if ((He?.message.stop_reason ?? Ie) === "tool_use" && _e.length === 0 && !He?.isApiErrorMessage) {
          let vn = g.transition?.reason !== "malformed_tool_use_retry";
          let zn = eFl();
          if (logEvent("tengu_malformed_tool_use_response", {
            will_retry: vn,
            model: Tt,
            text_has_leaked_invoke: tFl(pe),
            clean_retry_enabled: zn
          }), vn) {
            if (zn) {
              for (let ao of pe) {
                yield {
                  type: "tombstone",
                  message: ao
                };
              }
            }
            let Lr = In({
              content: zn ? "The previous response failed to produce a valid tool call. Please retry the tool call now." : "Your tool call was malformed and could not be parsed. Please retry.",
              isMeta: true,
              now: m.now,
              uuidFn: m.uuid
            });
            yield Lr;
            g = {
              messages: zn ? [...de, Lr] : [...de, ...pe, Lr],
              toolUseContext: j,
              compactTracking: be,
              maxOutputTokensRecoveryCount: 0,
              hasAttemptedReactiveCompact: false,
              maxOutputTokensOverride: undefined,
              pendingToolUseSummary: undefined,
              stopHookActive: oe,
              thinkingOnlyNudged: Q,
              stopHookBlockingCount: 0,
              turnCount: re,
              transition: {
                reason: "malformed_tool_use_retry",
                cleanRetry: zn
              }
            };
            continue;
          }
          let Pn = Ml({
            content: "The model's tool call could not be parsed (retry also failed).",
            now: m.now,
            uuid: m.uuid
          });
          yield Pn;
          executeStopFailureHooks(Pn, j);
          dfe(j, a, Pn);
          return {
            reason: "completed"
          };
        }
        let Ct = He?.message.stop_reason ?? Ie;
        if ((Ct === "end_turn" || Ct === "stop_sequence") && !He?.isApiErrorMessage && a !== "compact" && !gDe(a) && !Gba(de) && !pe.some(vn => vn.message.content.some(zn => zn.type === "text" && zn.text.trim().length > 0)) && !bn(de)) {
          if (!Q) {
            Et("query_thinking_only_response", "nudged");
            let vn = In({
              content: "[Your previous response had no visible output. Please continue and produce a user-visible response.]",
              isMeta: true,
              now: m.now,
              uuidFn: m.uuid
            });
            yield vn;
            g = {
              messages: [...de, vn],
              toolUseContext: j,
              compactTracking: be,
              maxOutputTokensRecoveryCount: K,
              hasAttemptedReactiveCompact: J,
              thinkingOnlyNudged: true,
              maxOutputTokensOverride: undefined,
              pendingToolUseSummary: undefined,
              stopHookActive: oe,
              stopHookBlockingCount: 0,
              turnCount: re,
              transition: {
                reason: "thinking_only_retry"
              }
            };
            continue;
          }
          Ae("query_thinking_only_response", "nudge_exhausted");
        } else if (Q) {
          Pe("query_thinking_only_response");
        }
        if (He?.isApiErrorMessage) {
          if (Twe && vFe() && Bj() && a.startsWith("repl_main_thread") && !j.agentId) {
            let vn = UG(He) ?? He.errorDetails ?? "";
            await Twe().markApiFailure(vFe(), fT(), He.error, vn);
          }
          executeStopFailureHooks(He, j);
          return {
            reason: "completed"
          };
        }
        let hn = yield* $Ll(de, pe, n, r, o, j, a, oe, N, vFe());
        if (ee > 0 && hn.blockingErrors.length === 0) {
          logEvent("tengu_stop_hook_block_count", {
            count: ee,
            is_subagent: Boolean(j.agentId),
            hit_max_turns: false,
            hit_cap: false
          });
        }
        if (hn.preventContinuation) {
          return {
            reason: "stop_hook_prevented"
          };
        }
        if (hn.blockingErrors.length > 0) {
          let vn = re + 1;
          let zn = ee + 1;
          if (c && vn > c) {
            logEvent("tengu_stop_hook_block_count", {
              count: zn,
              is_subagent: Boolean(j.agentId),
              hit_max_turns: true,
              hit_cap: false
            });
            yield createAttachmentMessage({
              type: "max_turns_reached",
              maxTurns: c,
              turnCount: vn
            }, m);
            return {
              reason: "max_turns",
              turnCount: vn
            };
          }
          let Pn = parseInt(process.env.CLAUDE_CODE_STOP_HOOK_BLOCK_CAP ?? "", 10);
          let Lr = Number.isNaN(Pn) ? 8 : Pn;
          if (Lr > 0 && zn > Lr) {
            logEvent("tengu_stop_hook_block_count", {
              count: zn,
              is_subagent: Boolean(j.agentId),
              hit_max_turns: false,
              hit_cap: true
            });
            yield wc(`A hook blocked the turn from ending ${zn} consecutive times \u2014 overriding and ending turn. ` + "For Stop/SubagentStop hooks, check stop_hook_active in the input and return success while it's true. Set CLAUDE_CODE_STOP_HOOK_BLOCK_CAP to raise this limit.", "warning");
            return {
              reason: "completed"
            };
          }
          g = {
            messages: [...de, ...pe, ...hn.blockingErrors],
            toolUseContext: j,
            compactTracking: be,
            maxOutputTokensRecoveryCount: 0,
            hasAttemptedReactiveCompact: J,
            maxOutputTokensOverride: undefined,
            pendingToolUseSummary: undefined,
            stopHookActive: true,
            thinkingOnlyNudged: Q,
            stopHookBlockingCount: zn,
            turnCount: vn,
            transition: {
              reason: "stop_hook_blocking"
            }
          };
          continue;
        }
        return {
          reason: "completed"
        };
      }
      let Ft = false;
      let on = false;
      let rn = j;
      Qp("query_tool_execution_start");
      let Sn = Ue.getRemainingResults();
      for await (let He of Sn) {
        if ($z(He)) {
          yield He;
          continue;
        }
        if (He.message) {
          if (yield He.message, He.message.type === "attachment" && He.message.attachment.type === "hook_stopped_continuation") {
            Ft = true;
          }
          if (He.message.type === "attachment" && He.message.attachment.type === "hook_deferred_tool") {
            on = true;
          }
          let Gt = sfo(He.message);
          if (Gt) {
            ke = Gt;
          }
          if (!mXt(He.message)) {
            let mt = EO([He.message], rn.options.refreshTools?.() ?? rn.options.tools, j.options.mainLoopModel);
            x4t(mt, Yg(j.options.mainLoopModel).maxBase64Size);
            ve.push(...mt.filter(Dt => Dt.type === "user"));
          }
        }
        if (He.newContext) {
          rn = {
            ...He.newContext,
            queryTracking: se
          };
        }
      }
      Qp("query_tool_execution_end");
      let jn;
      if (b.gates.emitToolUseSummaries && _e.length > 0 && !j.abortController.signal.aborted && !j.agentId) {
        let He = pe.at(-1);
        let Gt;
        if (He) {
          let jt = He.message.content.filter(bn => bn.type === "text");
          if (jt.length > 0) {
            let bn = jt.at(-1);
            if (bn && "text" in bn) {
              Gt = bn.text;
            }
          }
        }
        let mt = _e.map(jt => jt.id);
        let Dt = _e.map(jt => {
          let bn = ve.find(hn => hn.type === "user" && Array.isArray(hn.message.content) && hn.message.content.some(vn => vn.type === "tool_result" && vn.tool_use_id === jt.id));
          let Ct = bn?.type === "user" && Array.isArray(bn.message.content) ? bn.message.content.find(hn => hn.type === "tool_result" && hn.tool_use_id === jt.id) : undefined;
          return {
            name: jt.name,
            input: jt.input,
            output: Ct && "content" in Ct ? Ct.content : null
          };
        });
        jn = Yya({
          tools: Dt,
          signal: j.abortController.signal,
          isNonInteractiveSession: j.options.isNonInteractiveSession,
          lastAssistantText: Gt,
          agentContext: j.agentContext
        }).then(jt => {
          if (jt) {
            return pFl(jt, mt);
          }
          return null;
        }).catch(() => null);
      }
      if (j.abortController.signal.aborted) {
        if (!j.agentId) {
          try {
            yield* $De(j);
          } catch {}
        }
        if (!n2o.vZc(unwrapAbortReason(j.abortController.signal.reason))) {
          yield fZ({
            toolUse: true,
            interruptedMessageId: pXt(j),
            now: m.now,
            uuidFn: m.uuid
          });
        }
        let He = re + 1;
        if (c && He > c) {
          yield createAttachmentMessage({
            type: "max_turns_reached",
            maxTurns: c,
            turnCount: He
          }, m);
        }
        pfe(j, a);
        return {
          reason: "aborted_tools"
        };
      }
      if (on) {
        pfe(j, a);
        return {
          reason: "tool_deferred"
        };
      }
      if (Ft) {
        pfe(j, a);
        return {
          reason: "hook_stopped"
        };
      }
      if (ke) {
        yield* xLm({
          endTurnSource: ke,
          messagesForQuery: de,
          assistantMessages: pe,
          toolResults: ve,
          toolUseBlocks: _e,
          systemPrompt: n,
          userContext: r,
          systemContext: o,
          toolUseContext: j,
          updatedToolUseContext: rn,
          querySource: a,
          stopHookActive: oe,
          stickyBetas: N,
          queryChainIdForAnalytics: ae,
          queryDepth: se.depth,
          deps: m
        });
        return {
          reason: "completed"
        };
      }
      if (_e.length === 1 && _e[0].name === "ScheduleWakeup" && ube(getCanonicalName(j.options.mainLoopModel))) {
        let He = _e[0].input.prompt;
        if (getSessionCronTasks().some(Gt => Gt.kind === "loop" && Gt.prompt === He)) {
          logEvent("tengu_loop_dynamic_wakeup_ends_turn", {
            queryChainId: ae,
            queryDepth: se.depth
          });
          pfe(j, a);
          yield* JBo(de, pe, ve, n, r, o, j, a, oe, N, vFe());
          return {
            reason: "completed"
          };
        }
      }
      if (be?.compacted) {
        be.turnCounter++;
        logEvent("tengu_post_autocompact_turn", {
          turnId: be.turnId,
          turnCounter: be.turnCounter,
          queryChainId: ae,
          queryDepth: se.depth
        });
      }
      if (logEvent("tengu_query_before_attachments", {
        messagesForQueryCount: de.length,
        assistantMessagesCount: pe.length,
        toolResultsCount: ve.length,
        queryChainId: ae,
        queryDepth: se.depth
      }), hasHookForEvent("PostToolBatch", rn.getAppState(), rn.agentId ?? getSessionId())) {
        let He = `hook-${m.uuid()}`;
        let Gt = new Map();
        for (let jt of ve) {
          if (jt.type === "user" && Array.isArray(jt.message.content)) {
            for (let bn of jt.message.content) {
              if (bn.type === "tool_result") {
                Gt.set(bn.tool_use_id, bn.content);
              }
            }
          }
        }
        let mt = false;
        let Dt;
        for await (let jt of executePostToolBatchHooks(_e.map(bn => ({
          tool_name: bn.name,
          tool_input: bn.input,
          tool_use_id: bn.id,
          tool_response: Gt.get(bn.id)
        })), He, rn, getToolPermissionContext(rn).mode, rn.abortController.signal)) {
          if (jt.message && !(jt.message.type === "attachment" && jt.message.attachment.type === "hook_blocking_error")) {
            yield jt.message;
          }
          if (jt.additionalContexts && jt.additionalContexts.length > 0) {
            let bn = createAttachmentMessage({
              type: "hook_additional_context",
              content: jt.additionalContexts,
              hookName: "PostToolBatch",
              toolUseID: He,
              hookEvent: "PostToolBatch"
            }, m);
            yield bn;
            ve.push(bn);
          }
          if (jt.blockingError) {
            mt = true;
            Dt ??= jt.blockingError.blockingError;
          }
          if (jt.preventContinuation) {
            mt = true;
            Dt ??= jt.stopReason;
          }
        }
        if (rn.abortController.signal.aborted) {
          if (!rn.agentId) {
            try {
              yield* $De(rn);
            } catch {}
          }
          if (!n2o.vZc(unwrapAbortReason(rn.abortController.signal.reason))) {
            yield fZ({
              toolUse: false,
              interruptedMessageId: pXt(rn),
              now: m.now,
              uuidFn: m.uuid
            });
          }
          pfe(rn, a);
          return {
            reason: "aborted_tools"
          };
        }
        if (mt) {
          yield createAttachmentMessage({
            type: "hook_stopped_continuation",
            message: Dt || "Execution stopped by PostToolBatch hook",
            hookName: "PostToolBatch",
            toolUseID: He,
            hookEvent: "PostToolBatch"
          }, m);
          pfe(rn, a);
          return {
            reason: "hook_stopped"
          };
        }
      }
      let Xr = a.startsWith("repl_main_thread") || a === "sdk";
      let co = j.agentId;
      let Yt = j.messageQueue.getCommandsByMaxPriority("next").filter(He => {
        if (dba(He)) {
          return false;
        }
        if (Xr) {
          return GI(He);
        }
        return He.mode === "task-notification" && He.agentId === co;
      });
      for await (let He of getAttachmentMessages(null, rn, null, Yt, m, [...de, ...pe, ...ve], a)) {
        yield He;
        ve.push(He);
      }
      let Ee = Yt.filter(He => He.mode === "prompt" || He.mode === "task-notification");
      if (Ee.length > 0) {
        for (let He of Ee) {
          if (He.uuid) {
            t.push(He.uuid);
            yield {
              type: "command_lifecycle",
              uuid: He.uuid,
              state: "started"
            };
          }
        }
        j.messageQueue.remove(Ee);
      }
      if (S && S.settledAt !== null && S.consumedOnIteration === -1) {
        let He = filterDuplicateMemoryAttachments(await S.promise, j.readFileState);
        for (let Gt of He) {
          let mt = createAttachmentMessage(Gt, m);
          yield mt;
          ve.push(mt);
        }
        S.consumedOnIteration = re - 1;
      }
      let Re = Bn(ve, He => He.type === "attachment" && He.attachment.type === "edited_text_file");
      if (logEvent("tengu_query_after_attachments", {
        totalToolResultsCount: ve.length,
        fileChangeAttachmentCount: Re,
        queryChainId: ae,
        queryDepth: se.depth
      }), rn.options.refreshTools) {
        let He = rn.options.refreshTools();
        if (He !== rn.options.tools) {
          let Gt = Bn(rn.options.tools, Dt => !!Dt.mcpInfo);
          let mt = Bn(He, Dt => !!Dt.mcpInfo);
          if (Gt !== mt) {
            logEvent("tengu_mcp_tools_refreshed_mid_turn", {
              oldMcpCount: Gt,
              newMcpCount: mt,
              recovered: Gt === 0 && mt > 0
            });
          }
          rn = {
            ...rn,
            options: {
              ...rn.options,
              tools: He
            }
          };
        }
      }
      if (rn.options.refreshMcpClients) {
        let He = rn.options.refreshMcpClients();
        rn = {
          ...rn,
          options: {
            ...rn.options,
            mcpClients: He
          }
        };
      }
      let Ce = {
        ...rn,
        queryTracking: se
      };
      let Fe = re + 1;
      if (c && Fe > c) {
        yield createAttachmentMessage({
          type: "max_turns_reached",
          maxTurns: c,
          turnCount: Fe
        }, m);
        pfe(j, a);
        return {
          reason: "max_turns",
          turnCount: Fe
        };
      }
      Qp("query_recursive_call");
      g = {
        messages: [...de, ...pe, ...ve],
        toolUseContext: Ce,
        compactTracking: be,
        turnCount: Fe,
        maxOutputTokensRecoveryCount: 0,
        hasAttemptedReactiveCompact: false,
        thinkingOnlyNudged: false,
        pendingToolUseSummary: jn,
        maxOutputTokensOverride: undefined,
        stopHookActive: oe,
        stopHookBlockingCount: 0,
        transition: {
          reason: "next_turn"
        }
      };
    }
  }
  function PLm(e, t) {
    return getCanonicalName(parseUserSpecifiedModel(e)) === getCanonicalName(parseUserSpecifiedModel(t));
  }
  function OLm(e, t, n, r) {
    switch (e) {
      case "overloaded":
      case "server_error":
        return `Switched to ${n} due to high demand for ${t}`;
      case "last_resort":
        {
          let o = r instanceof Error ? r.message : r !== undefined ? String(r) : "";
          let s = o.length > 300 ? `${o.slice(0, 300)}\u2026` : o;
          return `Switched to ${n} because ${t} returned an error that could not be retried${s ? ` (${s})` : ""}`;
        }
    }
  }
  function DLm(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n.type === "user" && !n.isMeta && !n.toolUseResult && !n.isCompactSummary) {
        return t;
      }
    }
    return 0;
  }
  var Twe = () => (_rr(), __toCommonJS(yrr));
  var t2o;
  var n2o;
  var BTe = __lazy(() => {
    r6e();
    d$();
    Dde();
    Tpt();
    oHn();
    t5e();
    Bpo();
    wHn();
    Ot();
    ln();
    Gu();
    dw();
    v$n();
    yG();
    Fp();
    ci();
    dt();
    Rn();
    kTe();
    vO();
    je();
    YN();
    ro();
    IV();
    Jya();
    GEt();
    rR();
    Lmo();
    at();
    zf();
    yd();
    Rf();
    Wpt();
    dWt();
    Eo();
    UV();
    qBt();
    LX();
    rjn();
    mWt();
    ypt();
    PV();
    pr();
    JF();
    TO();
    hWt();
    Bba();
    Sp();
    gWt();
    afo();
    Vba();
    k1l();
    eKe();
    y7e();
    zI();
    fa();
    HLl();
    GLl();
    KLl();
    at();
    YLl();
    Kp();
    e2o();
    ku();
    ioe();
    O1();
    Sl();
    rFl();
    aFl();
    n2o = new Set(["interrupt", "refusal-fallback-edit"]);
  });
  function MLm(e) {
    if (e?.startsWith("file:")) {
      let t = e.slice(5);
      return t ? {
        mode: "file",
        dir: wrr.resolve(t)
      } : {
        mode: "disabled"
      };
    }
    return st(e) ? {
      mode: "inline"
    } : {
      mode: "disabled"
    };
  }
  function fFl() {
    let e = process.env.OTEL_LOG_RAW_API_BODIES;
    if (!vrr || vrr.raw !== e) {
      vrr = {
        raw: e,
        config: MLm(e)
      };
    }
    return vrr.config;
  }
  function hFl() {
    return fFl().mode !== "disabled";
  }
  async function NLm(e, t, n) {
    try {
      await hXt.writeFile(t, n);
    } catch (r) {
      if (!fn(r)) {
        throw r;
      }
      await hXt.mkdir(e, {
        recursive: true
      });
      await hXt.writeFile(t, n);
    }
  }
  function gFl(e, t, n) {
    let r = fFl();
    if (r.mode === "disabled") {
      return;
    }
    let o = De(t);
    if (r.mode === "file") {
      let i = e === "api_request_body" ? "request" : "response";
      let a = n.request_id ?? a2o.randomUUID();
      let l = /^[A-Za-z0-9_-]+$/.test(a) ? a : a2o.randomUUID();
      let c = wrr.join(r.dir, `${l}.${i}.json`);
      NLm(r.dir, c, o).catch(u => logForDebugging(`OTEL raw body file write failed: ${u}`, {
        level: "error"
      }));
      su(e, {
        body_ref: c,
        body_length: String(Buffer.byteLength(o)),
        ...n
      });
      return;
    }
    let s = o.length > 61440;
    su(e, {
      body: s ? o.slice(0, 61440) + `

[TRUNCATED - Content exceeds 60KB limit]` : o,
      body_length: String(o.length),
      ...(s && {
        body_truncated: "true"
      }),
      ...n
    });
  }
  function yFl(e) {
    return e.map(t => {
      if (t.type === "thinking") {
        return {
          ...t,
          thinking: "<REDACTED>"
        };
      }
      if (t.type === "redacted_thinking") {
        return {
          ...t,
          data: "<REDACTED>"
        };
      }
      return t;
    });
  }
  function LLm(e) {
    return {
      ...e,
      messages: e.messages.map(t => t.role === "assistant" && Array.isArray(t.content) ? {
        ...t,
        content: yFl(t.content)
      } : t)
    };
  }
  function Crr(e, t) {
    if (!hFl()) {
      return;
    }
    let n = LLm(e);
    gFl("api_request_body", n, {
      model: e.model,
      query_source: t
    });
  }
  function _Fl(e, t) {
    if (!hFl() || e.length === 0) {
      return;
    }
    let n = e.at(-1);
    let r = e.flatMap(s => s.message.content);
    let o = {
      ...n.message,
      content: yFl(r)
    };
    gFl("api_response_body", o, {
      model: t.model,
      query_source: t.querySource,
      request_id: t.requestId ?? undefined
    });
  }
  var a2o;
  var hXt;
  var wrr;
  var vrr;
  var l2o = __lazy(() => {
    je();
    gn();
    dt();
    yS();
    a2o = require("crypto");
    hXt = require("fs/promises");
    wrr = require("path");
  });
  function ULm(e) {
    if (e instanceof Ho) {
      let n = e.error?.error?.message;
      if (typeof n === "string" && n) {
        return n;
      }
    }
    return e instanceof Error ? e.message : String(e);
  }
  function SFl({
    headers: e,
    baseUrl: t
  }) {
    if (e) {
      let n = [];
      e.forEach((r, o) => n.push(o));
      for (let [r, {
        prefixes: o
      }] of Object.entries(BLm)) {
        if (o.some(s => n.some(i => i.startsWith(s)))) {
          return r;
        }
      }
    }
    if (t) {
      try {
        let n = new URL(t).hostname.toLowerCase();
        for (let [r, o] of Object.entries($Lm)) {
          if (o.some(s => n.endsWith(s))) {
            return r;
          }
        }
      } catch {}
    }
    return;
  }
  function HLm(e) {
    let t = Vge(e);
    return Rhn(t) ? t : i3i.createHash("sha256").update(t).digest("hex").slice(0, 12);
  }
  function c2o() {
    return {
      ...(process.env.ANTHROPIC_BASE_URL && {
        baseUrl: HLm(process.env.ANTHROPIC_BASE_URL)
      }),
      ...(process.env.ANTHROPIC_MODEL && {
        envModel: process.env.ANTHROPIC_MODEL
      }),
      ...(process.env.ANTHROPIC_SMALL_FAST_MODEL && {
        envSmallFastModel: process.env.ANTHROPIC_SMALL_FAST_MODEL
      })
    };
  }
  function TFl() {
    if (!{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.BUILD_TIME) {
      return;
    }
    let e = new Date({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.BUILD_TIME).getTime();
    if (isNaN(e)) {
      return;
    }
    return Math.floor((Date.now() - e) / 60000);
  }
  function EFl({
    model: e,
    messagesLength: t,
    temperature: n,
    betas: r,
    permissionMode: o,
    querySource: s,
    messageClientPlatform: i,
    queryTracking: a,
    thinkingType: l,
    effortValue: c,
    fastMode: u,
    previousRequestId: d
  }) {
    logEvent("tengu_api_query", {
      model: e,
      messagesLength: t,
      temperature: n,
      provider: getAPIProviderForAnalytics(),
      buildAgeMins: TFl(),
      ...(r?.length && {
        betas: r.join(",")
      }),
      permissionMode: o == null ? undefined : o,
      querySource: Vg(s),
      ...(i && {
        messageClientPlatform: i
      }),
      ...(a && {
        queryChainId: br(a.chainId),
        queryDepth: a.depth
      }),
      thinkingType: l == null ? undefined : l,
      effortValue: c == null ? undefined : c,
      fastMode: u,
      ...(d && {
        previousRequestId: br(d)
      }),
      ...c2o()
    });
  }
  function u2o({
    error: e,
    model: t,
    messageCount: n,
    messageTokens: r,
    durationMs: o,
    durationMsIncludingRetries: s,
    attempt: i,
    requestId: a,
    clientRequestId: l,
    didFallBackToNonStreaming: c,
    promptCategory: u,
    headers: d,
    queryTracking: p,
    querySource: m,
    messageClientPlatform: f,
    llmSpan: h,
    fastMode: g,
    previousRequestId: y,
    effort: _,
    attribution: b,
    promptTooLongIsHandled: S,
    agentContext: E
  }) {
    let C = SFl({
      headers: e instanceof Ho && e.headers ? e.headers : d,
      baseUrl: process.env.ANTHROPIC_BASE_URL
    });
    let x = ULm(e);
    let A = e instanceof Ho ? e.status : undefined;
    let k = A !== undefined ? String(A) : undefined;
    let I = $$n(e);
    let O = Vg(m);
    let M = S && I === "prompt_too_long";
    let L = f$(e);
    if (L) {
      let H = L.isSSLError ? " (SSL error)" : "";
      logForDebugging(`Connection error details: code=${L.code}${H}, message=${L.message}`, {
        level: "error"
      });
    }
    let P = M ? undefined : xWr(E);
    if (l) {
      logForDebugging(`API error x-client-request-id=${l} (give this to the API team for server-log lookup)`, {
        level: "error"
      });
    }
    if (!M) {
      if (I === "connection_error" || I === "server_overload" || I === "api_timeout" || I === "rate_limit") {
        logForDebugging(`API ${I} after retries: ${x}`, {
          level: "error"
        });
      } else if (I === "model_not_found") {
        logForDebugging(`API model not found: ${x}`, {
          level: "error"
        });
      } else if (I === "invalid_api_key") {
        logForDebugging(`API invalid_api_key: ${x}`, {
          level: "error"
        });
      } else if (I === "output_content_filtered") {
        logForDebugging(`API output_content_filtered: ${x}`, {
          level: "error"
        });
      } else if (I === "wif_credential_error") {
        logForDebugging(`API wif_credential_error: ${x}`, {
          level: "error"
        });
      } else if (I === "auth_error") {
        logForDebugging(`API auth_error: ${x}`, {
          level: "error"
        });
      } else {
        if (e && typeof e === "object" && !("telemetryMessage" in e)) {
          e.telemetryMessage = `API error: type=${I} status=${k ?? "none"}`;
        }
        Oe(e);
      }
      logEvent("tengu_api_error", {
        model: t,
        error: Gq(x),
        status: k,
        errorType: I,
        ...(_ && {
          effort_level: _
        }),
        messageCount: n,
        messageTokens: r,
        durationMs: o,
        durationMsIncludingRetries: s,
        attempt: i,
        provider: getAPIProviderForAnalytics(),
        requestId: br(a) || undefined,
        ...(P && {
          invokingRequestId: br(P.invokingRequestId),
          invocationKind: P.invocationKind == null ? undefined : P.invocationKind
        }),
        clientRequestId: br(l) || undefined,
        didFallBackToNonStreaming: c,
        ...(u && {
          promptCategory: u
        }),
        ...(C && {
          gateway: C
        }),
        ...(p && {
          queryChainId: br(p.chainId),
          queryDepth: p.depth
        }),
        ...(O && {
          querySource: O
        }),
        ...(f && {
          messageClientPlatform: f
        }),
        fastMode: g,
        ...(y && {
          previousRequestId: br(y)
        }),
        ...(b && Xjt(m, b)),
        ...(b?.attributionSkill && {
          _PROTO_skill_name: b.attributionSkill
        }),
        ...c2o()
      });
    }
    if (su("api_error", {
      model: t,
      error: x,
      ...(A !== undefined && {
        status_code: A
      }),
      duration_ms: o,
      attempt: i,
      request_id: a ?? undefined,
      speed: g ? "fast" : "normal",
      ...(O && {
        query_source: O
      }),
      ...(_ && {
        effort: _
      }),
      ...(b && Rut(m, b))
    }), i > 1) {
      su("api_retries_exhausted", {
        model: t,
        error: x,
        ...(A !== undefined && {
          status_code: A
        }),
        total_attempts: i,
        total_retry_duration_ms: s,
        speed: g ? "fast" : "normal",
        ...(O && {
          query_source: O
        }),
        ...(_ && {
          effort: _
        })
      });
    }
    Iho(h, {
      success: false,
      statusCode: k ? parseInt(k) : undefined,
      error: x,
      attempt: i,
      requestId: a ?? undefined,
      clientRequestId: c ? undefined : l
    });
    let F = M ? undefined : getTeleportedSessionInfo();
    if (F?.isTeleported && !F.hasLoggedFirstMessage) {
      logEvent("tengu_teleport_first_message_error", {
        session_id: br(F.sessionId),
        error_type: I
      });
      markFirstTeleportMessageLogged();
    }
  }
  function gXt({
    model: e,
    requestId: t,
    querySource: n,
    effort: r,
    fastMode: o,
    attempt: s,
    attribution: i,
    serverFallbackHop: a,
    stopDetails: l
  }) {
    let c = Vg(n);
    let u = l?.category;
    let d = u && jLm.vZc(u) ? u : null;
    su("api_refusal", {
      model: e,
      request_id: t,
      speed: o ? "fast" : "normal",
      attempt: s,
      server_fallback_hop: a,
      ...(c && {
        query_source: c
      }),
      ...(r && {
        effort: r
      }),
      ...(l !== undefined && {
        has_category: d !== null,
        has_explanation: Boolean(l?.explanation)
      }),
      ...(d && bh() && {
        category: d
      }),
      ...(i && Rut(n, i))
    });
  }
  function bFl(e) {
    let t = e.endsWith("==") ? 2 : e.endsWith("=") ? 1 : 0;
    return Math.floor(e.length * 3 / 4) - t;
  }
  function vFl(e, t) {
    let n = bytesPerTokenForModel(t);
    let r = (o, s) => {
      switch (s.type) {
        case "image":
          {
            if (o.imageBlockCount += 1, s.source.type !== "base64") {
              return o;
            }
            o.imageTotalBytes += bFl(s.source.data);
            let i = iGe(Buffer.from(s.source.data.slice(0, 87400), "base64"));
            if (i) {
              o.imageTotalPixels += i.width * i.height;
            }
            return o;
          }
        case "document":
          switch (o.documentBlockCount += 1, s.source.type) {
            case "base64":
              o.documentTotalBytes += bFl(s.source.data);
              return o;
            case "text":
              o.documentTotalBytes += s.source.data.length;
              return o;
            case "content":
              o.documentTotalBytes += typeof s.source.content === "string" ? s.source.content.length : s.source.content.reduce((i, a) => i + (a.type === "text" ? a.text.length : 0), 0);
              return o;
            default:
              return o;
          }
        case "text":
          o.inputTextCharLength += s.text.length;
          return o;
        case "thinking":
          o.inputTextCharLength += s.thinking.length;
          return o;
        case "redacted_thinking":
          o.inputTextCharLength += s.data.length;
          return o;
        case "tool_use":
        case "server_tool_use":
        case "mcp_tool_use":
          o.inputTextCharLength += s.name.length + De(s.input ?? {}).length;
          return o;
        case "tool_result":
        case "mcp_tool_result":
          {
            let i = s.content;
            if (typeof i === "string") {
              o.inputTextCharLength += i.length;
              return o;
            }
            return Array.isArray(i) ? i.reduce(r, o) : o;
          }
        default:
          o.inputTextCharLength += De(s).length;
          return o;
      }
    };
    return e.reduce((o, s) => {
      let i = s.message.content;
      if (o.estimatedInputTokens += XOe(i, n), typeof i === "string") {
        o.inputTextCharLength += i.length;
        return o;
      }
      for (let a of i) {
        r(o, a);
      }
      return o;
    }, {
      imageBlockCount: 0,
      imageTotalPixels: 0,
      imageTotalBytes: 0,
      documentBlockCount: 0,
      documentTotalBytes: 0,
      inputTextCharLength: 0,
      estimatedInputTokens: 0
    });
  }
  function WLm({
    model: e,
    preNormalizedModel: t,
    messageCount: n,
    messageTokens: r,
    usage: o,
    durationMs: s,
    durationMsIncludingRetries: i,
    attempt: a,
    ttftMs: l,
    requestId: c,
    firstAttemptRequestId: u,
    stopReason: d,
    costUSD: p,
    didFallBackToNonStreaming: m,
    querySource: f,
    messageClientPlatform: h,
    gateway: g,
    queryTracking: y,
    permissionMode: _,
    globalCacheStrategy: b,
    textContentLength: S,
    thinkingContentLength: E,
    toolUseContentLengths: C,
    connectorTextBlockCount: x,
    connectorTextContentLength: A,
    requestContentTelemetry: k,
    fastMode: I,
    previousRequestId: O,
    betas: M,
    attribution: L,
    agentContext: P
  }) {
    resetAuthFailureTracking();
    let F = getIsNonInteractiveSession();
    let H = consumePostCompaction();
    let U = process.argv.includes("-p") || process.argv.includes("--print");
    let N = Date.now();
    let W = getLastApiCompletionTimestamp();
    let j = W !== null ? Math.max(0, Math.round(N - W)) : undefined;
    let z = xWr(P);
    logEvent("tengu_api_success", {
      model: e,
      ...(t !== e && {
        preNormalizedModel: t
      }),
      ...(M?.length && {
        betas: M.join(",")
      }),
      messageCount: n,
      messageTokens: r,
      inputTokens: o.input_tokens,
      outputTokens: o.output_tokens,
      cachedInputTokens: o.cache_read_input_tokens ?? 0,
      uncachedInputTokens: o.cache_creation_input_tokens ?? 0,
      durationMs: s,
      durationMsIncludingRetries: i,
      attempt: a,
      ttftMs: l ?? undefined,
      buildAgeMins: TFl(),
      provider: getAPIProviderForAnalytics(),
      requestId: br(c) ?? undefined,
      ...(u && c && u !== c && {
        firstAttemptRequestId: br(u)
      }),
      ...(z && {
        invokingRequestId: br(z.invokingRequestId),
        invocationKind: z.invocationKind == null ? undefined : z.invocationKind
      }),
      stop_reason: (d == null ? undefined : d) ?? undefined,
      costUSD: p,
      didFallBackToNonStreaming: m,
      isNonInteractiveSession: F,
      print: U,
      isTTY: process.stdout.isTTY ?? false,
      querySource: Vg(f),
      ...(h && {
        messageClientPlatform: h
      }),
      ...(g && {
        gateway: g
      }),
      ...(y && {
        queryChainId: br(y.chainId),
        queryDepth: y.depth
      }),
      permissionMode: _ == null ? undefined : _,
      ...(b && {
        globalCacheStrategy: b
      }),
      ...(S !== undefined ? {
        textContentLength: S
      } : {}),
      ...(E !== undefined ? {
        thinkingContentLength: E
      } : {}),
      ...(C !== undefined ? {
        toolUseContentLengths: De(C)
      } : {}),
      ...(x !== undefined ? {
        connectorTextBlockCount: x
      } : {}),
      ...(A !== undefined ? {
        connectorTextContentLength: A
      } : {}),
      ...(k && {
        imageBlockCount: k.imageBlockCount,
        imageTotalPixels: k.imageTotalPixels,
        imageTotalBytes: k.imageTotalBytes,
        documentBlockCount: k.documentBlockCount,
        documentTotalBytes: k.documentTotalBytes,
        inputTextCharLength: k.inputTextCharLength,
        estimatedInputTokens: k.estimatedInputTokens
      }),
      fastMode: I,
      ...(O && {
        previousRequestId: br(O)
      }),
      ...(H && {
        isPostCompaction: H
      }),
      ...(L && Xjt(f, L)),
      ...(L?.attributionSkill && {
        _PROTO_skill_name: L.attributionSkill
      }),
      ...c2o(),
      timeSinceLastApiCallMs: j
    });
    setLastApiCompletionTimestamp(N);
  }
  function wFl({
    model: e,
    preNormalizedModel: t,
    start: n,
    startIncludingRetries: r,
    ttftMs: o,
    usage: s,
    attempt: i,
    messageCount: a,
    messageTokens: l,
    requestId: c,
    clientRequestId: u,
    firstAttemptRequestId: d,
    stopReason: p,
    didFallBackToNonStreaming: m,
    querySource: f,
    messageClientPlatform: h,
    headers: g,
    costUSD: y,
    queryTracking: _,
    permissionMode: b,
    newMessages: S,
    requestContentTelemetry: E,
    llmSpan: C,
    globalCacheStrategy: x,
    requestSetupMs: A,
    attemptStartTimes: k,
    fastMode: I,
    previousRequestId: O,
    betas: M,
    effort: L,
    attribution: P,
    agentContext: F
  }) {
    let H = SFl({
      headers: g,
      baseUrl: process.env.ANTHROPIC_BASE_URL
    });
    let U;
    let N;
    let W;
    let j;
    let z;
    if (S) {
      let ee = 0;
      let re = 0;
      let se = false;
      let ae = false;
      let de = {};
      let be = 0;
      let fe = 0;
      let me = false;
      for (let Te of S) {
        for (let ue of Te.message.content) {
          if (ue.type === "text") {
            ee += ue.text.length;
            me ||= FLm.test(ue.text);
          } else if (ue.type === "thinking") {
            re += ue.thinking.length;
            se = true;
          } else if (ue.type === "redacted_thinking") {
            se = true;
          } else if (ue.type === "tool_use" || ue.type === "server_tool_use" || ue.type === "mcp_tool_use") {
            let ce = De(ue.input).length;
            let le = qi(ue.name);
            de[le] = (de[le] ?? 0) + ce;
            ae = true;
          }
        }
      }
      if (me && !ae) {
        logEvent("tengu_schedule_offer_shown", {
          stop_reason: (p ?? undefined) == null ? undefined : p ?? undefined,
          querySource: Vg(f)
        });
      }
      U = ee;
      N = se ? re : undefined;
      W = ae ? de : undefined;
      j = be > 0 ? be : undefined;
      z = be > 0 ? fe : undefined;
    }
    let V = Math.max(0, Math.round(performance.now() - n));
    let K = Math.max(0, Math.round(performance.now() - r));
    addToTotalDurationState(K, V);
    WLm({
      model: e,
      preNormalizedModel: t,
      messageCount: a,
      messageTokens: l,
      usage: s,
      durationMs: V,
      durationMsIncludingRetries: K,
      attempt: i,
      ttftMs: o,
      requestId: c,
      firstAttemptRequestId: d,
      stopReason: p,
      costUSD: y,
      didFallBackToNonStreaming: m,
      querySource: f,
      messageClientPlatform: h,
      gateway: H,
      queryTracking: _,
      permissionMode: b,
      globalCacheStrategy: x,
      textContentLength: U,
      thinkingContentLength: N,
      toolUseContentLengths: W,
      connectorTextBlockCount: j,
      connectorTextContentLength: z,
      requestContentTelemetry: E,
      fastMode: I,
      previousRequestId: O,
      betas: M,
      attribution: P,
      agentContext: F
    });
    let J = Number.isFinite(y) ? y : 0;
    if (su("api_request", {
      model: e,
      input_tokens: s.input_tokens,
      output_tokens: s.output_tokens,
      cache_read_tokens: s.cache_read_input_tokens,
      cache_creation_tokens: s.cache_creation_input_tokens,
      cost_usd: J,
      cost_usd_micros: Math.round(J * 1e6),
      duration_ms: V,
      request_id: c ?? undefined,
      speed: I ? "fast" : "normal",
      query_source: Vg(f),
      ...(L && {
        effort: L
      }),
      ...(P && Rut(f, P))
    }), S) {
      let ee = S.flatMap(re => re.message.content.filter(se => se.type === "text").map(se => se.text)).join(`
`);
      if (ee) {
        su("assistant_response", {
          response_length: ee.length,
          response: pta() ? yM(ee).content : "<REDACTED>",
          request_id: c ?? undefined,
          model: e,
          query_source: Vg(f)
        });
      }
      _Fl(S, {
        model: e,
        querySource: f,
        requestId: c
      });
    }
    let Q;
    let Z;
    let ne;
    if (Tx() && S) {
      Q = S.flatMap(ee => ee.message.content.filter(re => re.type === "text").map(re => re.text)).join(`
`) || undefined;
      ne = S.some(ee => ee.message.content.some(re => re.type === "tool_use"));
    }
    Iho(C, {
      success: true,
      inputTokens: s.input_tokens,
      outputTokens: s.output_tokens,
      cacheReadTokens: s.cache_read_input_tokens,
      cacheCreationTokens: s.cache_creation_input_tokens,
      attempt: i,
      modelOutput: Q,
      thinkingOutput: Z,
      hasToolCall: ne,
      requestId: c ?? undefined,
      clientRequestId: u,
      stopReason: p ?? undefined,
      ttftMs: o ?? undefined,
      requestSetupMs: A,
      attemptStartTimes: k,
      traceresponse: m ? undefined : g?.get("traceresponse") ?? undefined
    });
    let oe = getTeleportedSessionInfo();
    if (oe?.isTeleported && !oe.hasLoggedFirstMessage) {
      logEvent("tengu_teleport_first_message_success", {
        session_id: br(oe.sessionId)
      });
      markFirstTeleportMessageLogged();
    }
  }
  var FLm;
  var BLm;
  var $Lm;
  var jLm;
  var yXt = __lazy(() => {
    CN();
    at();
    qtt();
    no();
    je();
    dw();
    Rn();
    ASe();
    Eo();
    Ds();
    Kv();
    kTe();
    yS();
    l2o();
    GG();
    _h();
    Ot();
    Gu();
    X9e();
    aU();
    JLe();
    vO();
    vTe();
    FLm = /\b(want me to|should i|shall i|i can|would you like me to)\b[^.!?\n]{0,100}`?\/schedule\b/i;
    BLm = {
      litellm: {
        prefixes: ["x-litellm-"]
      },
      helicone: {
        prefixes: ["helicone-"]
      },
      portkey: {
        prefixes: ["x-portkey-"]
      },
      "cloudflare-ai-gateway": {
        prefixes: ["cf-aig-"]
      },
      kong: {
        prefixes: ["x-kong-"]
      },
      braintrust: {
        prefixes: ["x-bt-"]
      }
    };
    $Lm = {
      databricks: [".cloud.databricks.com", ".azuredatabricks.net", ".gcp.databricks.com"]
    };
    jLm = new Set(["cyber", "bio", "frontier_llm", "reasoning_extraction"]);
  });
  function xrr() {
    return {
      consecutiveDenials: 0,
      totalDenials: 0
    };
  }
  function CFl(e) {
    return {
      ...e,
      consecutiveDenials: e.consecutiveDenials + 1,
      totalDenials: e.totalDenials + 1
    };
  }
  function _Xt(e) {
    if (e.consecutiveDenials === 0) {
      return e;
    }
    return {
      ...e,
      consecutiveDenials: 0
    };
  }
  function RFl(e) {
    return e.consecutiveDenials >= Rrr.maxConsecutive || e.totalDenials >= Rrr.maxTotal;
  }
  var Rrr;
  var d2o = __lazy(() => {
    Rrr = {
      maxConsecutive: 3,
      maxTotal: 20
    };
  });
  var g2o = {};
  __export(g2o, {
    withDisallowedCommandTools: () => withDisallowedCommandTools,
    withAllowedCommandTools: () => withAllowedCommandTools,
    saveCacheSafeParams: () => saveCacheSafeParams,
    runForkedAgent: () => runForkedAgent,
    prepareForkedCommandContext: () => prepareForkedCommandContext,
    isMainThreadCacheWarm: () => isMainThreadCacheWarm,
    getLastCacheSafeParams: () => getLastCacheSafeParams,
    forkPointUuidOf: () => forkPointUuidOf,
    extractResultText: () => extractResultText,
    createSubagentContext: () => createSubagentContext,
    createGetAppStateWithForkedToolScoping: () => createGetAppStateWithForkedToolScoping,
    createCacheSafeParams: () => createCacheSafeParams,
    FORKED_AGENT_DEFAULT_MAX_TURNS: () => 50,
    ASYNC_SHARED_APP_STATE_KEYS: () => ASYNC_SHARED_APP_STATE_KEYS
  });
  function saveCacheSafeParams(e) {
    k7e = e;
    m2o = e ? Date.now() : null;
    f2o = e ? getMainLoopModel() : null;
  }
  function getLastCacheSafeParams() {
    if (!k7e) {
      return null;
    }
    let e = getMainLoopModel();
    if (f2o === e) {
      return k7e;
    }
    return {
      ...k7e,
      toolUseContext: {
        ...k7e.toolUseContext,
        options: {
          ...k7e.toolUseContext.options,
          mainLoopModel: e
        }
      }
    };
  }
  function isMainThreadCacheWarm(e = Date.now()) {
    if (k7e === null || m2o === null) {
      return false;
    }
    if (f2o !== getMainLoopModel()) {
      return false;
    }
    let t = getLastMainThreadCacheTtlMs();
    if (t === null) {
      return false;
    }
    return e - m2o < t * 0.9;
  }
  function createCacheSafeParams(e) {
    return {
      systemPrompt: e.systemPrompt,
      userContext: e.userContext,
      systemContext: e.systemContext,
      toolUseContext: e.toolUseContext,
      forkContextMessages: e.messages,
      stickyBetas: e.stickyBetas
    };
  }
  function withAllowedCommandTools(e, t) {
    if (t.length === 0) {
      return e;
    }
    return {
      ...e,
      alwaysAllowRules: {
        ...e.alwaysAllowRules,
        command: Ro([...(e.alwaysAllowRules.command || []), ...t])
      }
    };
  }
  function withDisallowedCommandTools(e, t) {
    if (t.length === 0) {
      return e;
    }
    return {
      ...e,
      alwaysDenyRules: {
        ...e.alwaysDenyRules,
        command: Ro([...(e.alwaysDenyRules.command || []), ...t])
      }
    };
  }
  function createGetAppStateWithForkedToolScoping(e, t, n) {
    if (t.length === 0 && n.length === 0) {
      return e;
    }
    return () => {
      let r = e();
      return {
        ...r,
        toolPermissionContext: withDisallowedCommandTools(withAllowedCommandTools(r.toolPermissionContext, t), n)
      };
    };
  }
  async function prepareForkedCommandContext(e, t, n) {
    let o = (await e.getPromptForCommand(t, n)).map(m => m.type === "text" ? m.text : "").join(`
`);
    let s = parseToolListFromCLI(e.allowedTools ?? []);
    let i = parseToolListFromCLI(e.disallowedTools ?? []);
    let a = createGetAppStateWithForkedToolScoping(n.getAppState, s, i);
    let l = [...(s.length === 0 ? [] : [{
      kind: "allowed_tools",
      allowedTools: s
    }]), ...(i.length === 0 ? [] : [{
      kind: "disallowed_tools",
      disallowedTools: i
    }])];
    let c = e.agent ?? "general-purpose";
    let u = n.options.agentDefinitions.activeAgents;
    let d = u.find(m => m.agentType === c) ?? u.find(m => m.agentType === "general-purpose") ?? u[0];
    if (!d) {
      throw Error("No agent available for forked execution");
    }
    let p = [In({
      content: o,
      isMeta: true
    })];
    return {
      skillContent: o,
      modifiedGetAppState: a,
      contextLayers: l,
      baseAgent: d,
      promptMessages: p
    };
  }
  function extractResultText(e, t = "Execution completed") {
    let n = Yk(e);
    if (!n) {
      return t;
    }
    return Tl(n.message.content, `
`) || t;
  }
  function createSubagentContext(e, t) {
    let n = t?.abortController ?? (t?.shareAbortController ? e.abortController : createChildAbortController(e.abortController));
    let r = t?.getAppState ? t.getAppState : t?.shareAbortController ? e.getAppState : () => {
      let a = e.getAppState();
      if (a.toolPermissionContext.shouldAvoidPermissionPrompts) {
        return a;
      }
      return {
        ...a,
        toolPermissionContext: {
          ...a.toolPermissionContext,
          shouldAvoidPermissionPrompts: true
        }
      };
    };
    let o = t?.shareAbortController || t?.getAppState ? [] : [{
      kind: "avoid_prompts"
    }];
    let s = [...(e.permissionLayers ?? []), ...o, ...(t?.permissionLayers ?? [])];
    let i = t?.options ?? e.options;
    if (t?.options && t.options.tools !== e.options.tools) {
      let a = t.options.refreshTools !== undefined && t.options.refreshTools === e.options.refreshTools;
      let l = t.options.refreshMcpClients !== undefined && t.options.refreshMcpClients === e.options.refreshMcpClients;
      if (a || l) {
        i = {
          ...t.options,
          refreshTools: a ? undefined : t.options.refreshTools,
          refreshMcpClients: l ? undefined : t.options.refreshMcpClients
        };
      }
    }
    return {
      messageQueue: e.messageQueue,
      readFileState: hTe(t?.readFileState ?? e.readFileState),
      nestedMemoryAttachmentTriggers: [],
      loadedNestedMemoryPaths: {},
      pendingNestedMemoryTriggers: e.pendingNestedMemoryTriggers,
      sessionEnvVars: e.sessionEnvVars,
      dynamicSkillDirTriggers: [],
      memorySelector: xDe(),
      toolDecisions: undefined,
      contentReplacementState: t?.contentReplacementState ?? (e.contentReplacementState ? BIa(e.contentReplacementState) : undefined),
      abortController: n,
      getAppState: r,
      permissionLayers: s,
      setAppState: t?.shareSetAppState ? e.setAppState : a => e.setAppState(l => {
        let c = a(l);
        if (c === l) {
          return l;
        }
        let u = false;
        let d = {
          ...l
        };
        for (let p of ASYNC_SHARED_APP_STATE_KEYS) {
          if (c[p] !== l[p]) {
            Object.assign(d, {
              [p]: c[p]
            });
            u = true;
          }
        }
        return u ? d : l;
      }),
      setToolPermissionContext: t?.shareSetAppState ? e.setToolPermissionContext : () => {},
      getMcp: e.getMcp,
      getWebBrowser: e.getWebBrowser,
      isolationLatch: t?.isolationLatch ?? e.isolationLatch,
      taskRegistry: e.taskRegistry,
      sessionHooksRegistry: e.sessionHooksRegistry,
      getReplContexts: e.getReplContexts,
      setReplContext: e.setReplContext,
      setWebBrowserSlice: e.setWebBrowserSlice,
      setArtifactReadVersion: e.setArtifactReadVersion,
      agentLifecycle: e.agentLifecycle,
      teammateColors: e.teammateColors,
      rootToolSurface: e.rootToolSurface,
      localDenialTracking: t?.shareSetAppState ? e.localDenialTracking : xrr(),
      getFileHistoryState: () => {
        return;
      },
      applyFileHistoryOp: () => {},
      applyAttributionOp: e.applyAttributionOp,
      requestDialog: e.requestDialog,
      setToolJSX: undefined,
      onCompactEvent: undefined,
      onRetryStatus: undefined,
      options: i,
      messages: t?.messages ?? e.messages,
      turnStartIndex: 0,
      agentId: t?.agentId ?? vN(),
      agentType: t?.agentType,
      agentContext: t?.agentContext ?? e.agentContext,
      agentWorktree: e.agentWorktree,
      spawnedByWorkflowRunId: t?.spawnedByWorkflowRunId ?? e.spawnedByWorkflowRunId,
      precomputeSourceKey: t?.precomputeSourceKey,
      teammateContext: t?.teammateContext ?? e.teammateContext,
      queryTracking: {
        chainId: xFl.randomUUID(),
        depth: (e.queryTracking?.depth ?? -1) + 1
      },
      fileReadingLimits: e.fileReadingLimits,
      userModified: e.userModified,
      criticalSystemReminder_EXPERIMENTAL: t?.criticalSystemReminder_EXPERIMENTAL,
      requireCanUseTool: t?.requireCanUseTool
    };
  }
  function forkPointUuidOf(e) {
    let t = e.length - 1;
    let n = e[t];
    if (n?.type === "assistant") {
      let r = n.message.id;
      while (t > 0) {
        let o = e[t - 1];
        if (o?.type !== "assistant" || o.message.id !== r) {
          break;
        }
        t--;
      }
    }
    return e[t]?.uuid;
  }
  async function runForkedAgent({
    promptMessages: e,
    cacheSafeParams: t,
    canUseTool: n,
    querySource: r,
    forkLabel: o,
    overrides: s,
    maxOutputTokens: i,
    maxTurns: a,
    onMessage: l,
    skipTranscript: c,
    skipCacheWrite: u,
    fallbackModel: d
  }) {
    let p = Date.now();
    let m = [];
    let f = null;
    let h = {
      ...Hb
    };
    let {
      systemPrompt: g,
      userContext: y,
      systemContext: _,
      toolUseContext: b,
      forkContextMessages: S
    } = t;
    let E = createSubagentContext(b, {
      ...s,
      options: s?.options ?? (d !== undefined ? {
        ...b.options
      } : undefined),
      isolationLatch: s?.isolationLatch ?? {
        current: b.isolationLatch?.current ?? null,
        exemptServers: b.isolationLatch?.exemptServers
      },
      precomputeSourceKey: s?.precomputeSourceKey ?? b.agentId ?? "main"
    });
    let C = [...S, ...e];
    let x = forkPointUuidOf(S);
    let A = c ? undefined : vN(o);
    let k = null;
    if (A) {
      await recordSidechainTranscript(e, A).catch(L => logForDebugging(`Forked agent [${o}] failed to record initial transcript: ${L}`));
      k = e.at(-1)?.uuid ?? null;
    }
    let I = a ?? 50;
    let O = 0;
    try {
      for await (let L of _U({
        messages: C,
        systemPrompt: g,
        userContext: y,
        systemContext: _,
        canUseTool: n,
        toolUseContext: E,
        querySource: r,
        fallbackModel: d,
        maxOutputTokensOverride: i,
        maxTurns: I,
        skipCacheWrite: u,
        forkPointUuid: x,
        stickyBetas: t.stickyBetas ? wN(t.stickyBetas) : undefined
      })) {
        if (tKe(L)) {
          if (L.type === "stream_event" && L.event?.type === "message_delta" && L.event.usage) {
            let P = Kse({
              ...Hb
            }, L.event.usage);
            h = Irr(h, P);
          }
          continue;
        }
        if (Vyl(L)) {
          continue;
        }
        if (L.type === "assistant") {
          O++;
        }
        if (logForDebugging(`Forked agent [${o}] received message: type=${L.type}`), m.push(L), f = Hde(m, L, f, C), l?.(L), A && (L.type === "assistant" || L.type === "user" || L.type === "progress")) {
          if (await recordSidechainTranscript([L], A, k).catch(P => logForDebugging(`Forked agent [${o}] failed to record transcript: ${P}`)), L.type !== "progress") {
            k = L.uuid;
          }
        }
      }
    } finally {
      if (f) {
        m.push(...f.preserved);
      }
      E.readFileState.clear();
      C.length = 0;
    }
    logForDebugging(`Forked agent [${o}] finished: ${m.length} messages, types=[${m.map(L => L.type).join(", ")}], totalUsage: input=${h.input_tokens} output=${h.output_tokens} cacheRead=${h.cache_read_input_tokens} cacheCreate=${h.cache_creation_input_tokens}`);
    let M = Date.now() - p;
    if (a === undefined && O >= 50) {
      logEvent("tengu_forked_agent_default_turns_exceeded", {
        forkLabel: o,
        querySource: r,
        turnCount: O
      });
    }
    GLm({
      forkLabel: o,
      querySource: r,
      durationMs: M,
      messageCount: m.length,
      totalUsage: h,
      queryTracking: b.queryTracking
    });
    return {
      messages: m,
      totalUsage: h
    };
  }
  function GLm({
    forkLabel: e,
    querySource: t,
    durationMs: n,
    messageCount: r,
    totalUsage: o,
    queryTracking: s
  }) {
    let i = o.input_tokens + o.cache_creation_input_tokens + o.cache_read_input_tokens;
    let a = i > 0 ? o.cache_read_input_tokens / i : 0;
    logEvent("tengu_fork_agent_query", {
      forkLabel: e,
      querySource: t,
      durationMs: n,
      messageCount: r,
      inputTokens: o.input_tokens,
      outputTokens: o.output_tokens,
      cacheReadInputTokens: o.cache_read_input_tokens,
      cacheCreationInputTokens: o.cache_creation_input_tokens,
      serviceTier: o.service_tier,
      cacheCreationEphemeral1hTokens: o.cache_creation.ephemeral_1h_input_tokens,
      cacheCreationEphemeral5mTokens: o.cache_creation.ephemeral_5m_input_tokens,
      cacheHitRate: a,
      ...(s && {
        queryChainId: br(s.chainId),
        queryDepth: s.depth
      })
    });
  }
  var xFl;
  var k7e = null;
  var m2o = null;
  var f2o = null;
  var ASYNC_SHARED_APP_STATE_KEYS;
  var CO = __lazy(() => {
    at();
    BTe();
    Ot();
    B_();
    aE();
    yXt();
    IWt();
    QXn();
    Kp();
    je();
    qI();
    ro();
    Eo();
    d2o();
    S_();
    fa();
    zI();
    GL();
    xFl = require("crypto");
    ASYNC_SHARED_APP_STATE_KEYS = ["frameUrls"];
  });
  var IFl = {};