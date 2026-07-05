  __export(xgr, {
    startBackgroundHousekeeping: () => startBackgroundHousekeeping,
    isLastCleanupSentinelFresh: () => isLastCleanupSentinelFresh,
    _resetHousekeepingStartedForTesting: () => _resetHousekeepingStartedForTesting,
    TRANSCRIPT_HEARTBEAT_INTERVAL_MS: () => 3600000,
    STALE_CLEANUP_CATCHUP_DELAY_MS: () => 5000,
    DELAY_VERY_SLOW_OPERATIONS_THAT_HAPPEN_EVERY_SESSION: () => 600000
  });
  async function isLastCleanupSentinelFresh() {
    try {
      let e = await Rgr.stat(PQo.join(er(), ".last-cleanup"));
      return Date.now() - e.mtimeMs < 86400000;
    } catch {
      return false;
    }
  }
  function _resetHousekeepingStartedForTesting() {
    IQo = false;
  }
  async function startBackgroundHousekeeping() {
    if (IQo) {
      return;
    }
    IQo = true;
    {
      let {
        initExtractMemories: r
      } = await Promise.resolve().then(() => (nXt(), crr));
      r();
    }
    if (sLl(), E8l(), getIsInteractive()) {
      YAc();
      touchSessionTranscript();
      setInterval(touchSessionTranscript, 3600000).unref();
    }
    let e = true;
    let t = false;
    async function n() {
      if (getIsInteractive() && getLastInteractionTime() > Date.now() - 60000) {
        setTimeout(n, 600000).unref();
        return;
      }
      if (e) {
        if (!t) {
          if (t = true, await isLastCleanupSentinelFresh()) {
            setTimeout(n, 600000).unref();
            return;
          }
        }
        e = false;
        await FAc();
        await Rgr.writeFile(PQo.join(er(), ".last-cleanup"), new Date().toISOString()).catch(r => Zd(r) ? logForDebugging(`.last-cleanup write failed: ${r.code} ${r.message}`, {
          level: "error"
        }) : Oe(r));
      }
      if (getIsInteractive() && getLastInteractionTime() > Date.now() - 60000) {
        setTimeout(n, 600000).unref();
        return;
      }
      await Izt();
    }
    setTimeout(n, 5000).unref();
  }
  var Rgr;
  var PQo;
  var IQo = false;
  var ron = __lazy(() => {
    at();
    DBo();
    UAc();
    je();
    AQo();
    gn();
    dt();
    Rn();
    qQ();
    War();
    fa();
    Rgr = require("fs/promises");
    PQo = require("path");
  });
  function t0c(e) {
    let t = useIsScreenReaderEnabled();
    e0c.useEffect(() => {
      if (getIsRemoteMode()) {
        return;
      }
      let n = getCurrentProjectConfig();
      let r = X2t();
      if (n.lastGracefulShutdown !== false || n.lastVersionBase !== r) {
        saveCurrentProjectConfig(s => ({
          ...s,
          lastGracefulShutdown: false,
          lastVersionBase: r
        }));
      }
      let o = () => {
        if (lwn()) {
          let s = t ? "Cost: " : "";
          process.stdout.write(`
` + s + RMe() + `
`);
        }
        FGt(e?.());
      };
      process.on("exit", o);
      return () => {
        if (isShuttingDown()) {
          FGt(e?.());
        }
        process.off("exit", o);
      };
    }, [t]);
  }
  var e0c;
  var n0c = __lazy(() => {
    at();
    C$();
    DPe();
    Gu();
    vF();
    lm();
    e0c = __toESM(ot(), 1);
  });
  function DQo({
    children: e
  }) {
    let [t, n] = cD.useState(null);
    let [r, o] = cD.useState(null);
    let [s, i] = cD.useState(r0c);
    let a = cD.useRef(s);
    a.current = s;
    let {
      addNotification: l
    } = Fi();
    let c = useClock();
    let u = cD.useRef(null);
    cD.useEffect(() => () => {
      u.current?.();
    }, []);
    let d = cD.useCallback(f => {
      if (u.current?.(), u.current = null, f === null) {
        u.current = c.setTimeout(() => o(null), 500);
      } else {
        o(f);
      }
    }, [c]);
    let p = cD.useCallback((f, h, g = "tool_use", y) => {
      let _ = a.current.get(f) === h;
      if (i(b => {
        let S = new Map(b);
        if (_) {
          S.delete(f);
        } else {
          S.set(f, h);
        }
        return S;
      }), logEvent("tengu_message_rated", {
        ...y,
        message_uuid: br(f),
        sentiment: h,
        surface: g,
        cleared: _
      }), !_) {
        l({
          key: "message-rated",
          kind: "feedback",
          text: "thanks for improving claude!",
          color: "success",
          priority: "immediate"
        });
      }
    }, [l]);
    let m = isPolicyAllowed("allow_product_feedback");
    return gXe.jsx(BAf.Provider, {
      value: m ? p : null,
      children: gXe.jsx($Af.Provider, {
        value: s,
        children: gXe.jsx(jAf.Provider, {
          value: n,
          children: gXe.jsx(HAf.Provider, {
            value: t,
            children: gXe.jsx(WAf.Provider, {
              value: d,
              children: gXe.jsx(qAf.Provider, {
                value: r,
                children: e
              })
            })
          })
        })
      })
    });
  }
  var UAf;
  var cD;
  var gXe;
  var BAf;
  var r0c;
  var $Af;
  var HAf;
  var jAf;
  var qAf;
  var WAf;
  var o0c = __lazy(() => {
    Nd();
    et();
    Ot();
    B_();
    Kc();
    UAf = __toESM(pt(), 1);
    cD = __toESM(ot(), 1);
    gXe = __toESM(ie(), 1);
    BAf = cD.createContext(null);
    r0c = new Map();
    $Af = cD.createContext(r0c);
    HAf = cD.createContext(null);
    jAf = cD.createContext(null);
    qAf = cD.createContext(null);
    WAf = cD.createContext(null);
  });
  function a0c(e) {
    let t = s0c.c(3);
    let {
      agentId: n
    } = e;
    let r = lGa(n);
    let {
      columns: o
    } = Sr();
    let [, s] = i0c.useReducer(GAf, 0);
    if (useInterval(s, r ? 1000 : null), r === null) {
      return null;
    }
    let i;
    if (t[0] !== o || t[1] !== r) {
      i = MQo.jsx(gXd, {
        flexDirection: "row",
        marginTop: 1,
        width: "100%",
        children: MQo.jsx(pPo, {
          status: r,
          columns: o
        })
      });
      t[0] = o;
      t[1] = r;
      t[2] = i;
    } else {
      i = t[2];
    }
    return i;
  }
  function GAf(e) {
    return e + 1;
  }
  var s0c;
  var i0c;
  var MQo;
  var l0c = __lazy(() => {
    mPo();
    vpe();
    ki();
    et();
    s0c = __toESM(pt(), 1);
    i0c = __toESM(ot(), 1);
    MQo = __toESM(ie(), 1);
  });
  function u0c() {
    c0c.useEffect(() => {}, []);
  }
  var c0c;
  var d0c = __lazy(() => {
    gn();
    c0c = __toESM(ot(), 1);
  });
  function p0c(e, t) {
    let n = yXe.useRef(e ?? null);
    let r = yXe.useRef(!e);
    yXe.useEffect(() => {
      let o = n.current;
      if (!o) {
        return;
      }
      let s = false;
      o.then(i => {
        if (s) {
          return;
        }
        if (r.current = true, n.current = null, i.length > 0) {
          t(a => [...i, ...a]);
        }
      });
      return () => {
        s = true;
      };
    }, [t]);
    return yXe.useCallback(async () => {
      if (r.current || !n.current) {
        return;
      }
      let o = await n.current;
      if (r.current) {
        return;
      }
      if (r.current = true, n.current = null, o.length > 0) {
        t(s => [...o, ...s]);
      }
    }, [t]);
  }
  var yXe;
  var m0c = __lazy(() => {
    yXe = __toESM(ot(), 1);
  });
  function f0c() {
    let [e, t] = kgr.useState(() => {
      if (!isAnthropicAuthEnabled() || isClaudeAISubscriber()) {
        return "valid";
      }
      let {
        key: r,
        source: o
      } = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      if (r || o === "apiKeyHelper") {
        return "loading";
      }
      return "missing";
    });
    let n = kgr.useCallback(async () => {
      if (!isAnthropicAuthEnabled() || isClaudeAISubscriber()) {
        t("valid");
        Pe("auth_api_key_verify");
        return;
      }
      await getApiKeyFromApiKeyHelper(getIsNonInteractiveSession());
      let {
        key: r,
        source: o
      } = getAnthropicApiKeyWithSource();
      if (!r) {
        if (o === "apiKeyHelper") {
          t("error");
          Ae("auth_api_key_verify", "apikeyhelper_failed");
          return;
        }
        t("missing");
        Et("auth_api_key_verify", "missing");
        return;
      }
      try {
        let s = await jhc(r, false);
        if (t(s ? "valid" : "invalid"), s) {
          Pe("auth_api_key_verify");
        } else {
          Ae("auth_api_key_verify", "invalid");
        }
        return;
      } catch {
        t("error");
        Ae("auth_api_key_verify", "network_error");
        return;
      }
    }, []);
    return {
      status: e,
      reverify: n
    };
  }
  var kgr;
  var h0c = __lazy(() => {
    at();
    ln();
    aE();
    no();
    kgr = __toESM(ot(), 1);
  });
  var g0c = __lazy(() => {
    at();
    hd();
    vo();
    je();
    Cs();
    wj();
  });
  function NQo(e) {
    let t = y0c.c(37);
    let {
      screen: n,
      setScreen: r,
      showAllInTranscript: o,
      setShowAllInTranscript: s,
      messageCount: i,
      virtualScrollActive: a,
      searchBarOpen: l
    } = e;
    let c = l === undefined ? false : l;
    let u = bt(ZAf);
    let d = Lo();
    let {
      addNotification: p
    } = Fi();
    let m;
    if (t[0] !== u || t[1] !== d) {
      m = () => {
        logEvent("tengu_toggle_todos", {
          is_expanded: u === "tasks"
        });
        Pe("todo_toggle_panel");
        d(QAf);
      };
      t[0] = u;
      t[1] = d;
      t[2] = m;
    } else {
      m = t[2];
    }
    let f = m;
    let h = bt(XAf);
    let g;
    let y;
    if (t[3] !== d) {
      g = () => {
        D3();
        let {
          isBriefEnabled: K
        } = __toCommonJS(CZ);
        let J = () => {
          if (K()) {
            return;
          }
          d(JAf);
        };
        J();
        return onGrowthBookRefresh(J);
      };
      y = [d];
      t[3] = d;
      t[4] = g;
      t[5] = y;
    } else {
      g = t[4];
      y = t[5];
    }
    _0c.useEffect(g, y);
    let _;
    if (t[6] !== h || t[7] !== i || t[8] !== n || t[9] !== d || t[10] !== r || t[11] !== s || t[12] !== o) {
      _ = () => {
        D3();
        let {
          isBriefEnabled: K
        } = __toCommonJS(CZ);
        if (!K() && h && n !== "transcript") {
          d(YAf);
          return;
        }
        logEvent("tengu_toggle_transcript", {
          is_entering: n !== "transcript",
          show_all: o,
          message_count: i,
          open_dialog_count: Z3.getState().open.length
        });
        r(KAf);
        s(false);
      };
      t[6] = h;
      t[7] = i;
      t[8] = n;
      t[9] = d;
      t[10] = r;
      t[11] = s;
      t[12] = o;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b = _;
    let S;
    if (t[14] !== i || t[15] !== s || t[16] !== o) {
      S = () => {
        logEvent("tengu_transcript_toggle_show_all", {
          is_expanding: !o,
          message_count: i
        });
        s(zAf);
      };
      t[14] = i;
      t[15] = s;
      t[16] = o;
      t[17] = S;
    } else {
      S = t[17];
    }
    let E = S;
    let C;
    if (t[18] !== i || t[19] !== r || t[20] !== s || t[21] !== o) {
      C = () => {
        logEvent("tengu_transcript_exit", {
          show_all: o,
          message_count: i
        });
        r("prompt");
        s(false);
      };
      t[18] = i;
      t[19] = r;
      t[20] = s;
      t[21] = o;
      t[22] = C;
    } else {
      C = t[22];
    }
    let x = C;
    let A;
    if (t[23] !== h || t[24] !== d) {
      A = () => {
        D3();
        let {
          isBriefEnabled: K
        } = __toCommonJS(CZ);
        if (!K() && !h) {
          return;
        }
        let J = !h;
        logEvent("tengu_brief_mode_toggled", {
          enabled: J,
          gated: false,
          source: "keybinding"
        });
        d(Q => {
          if (Q.isBriefOnly === J) {
            return Q;
          }
          return {
            ...Q,
            isBriefOnly: J
          };
        });
      };
      t[23] = h;
      t[24] = d;
      t[25] = A;
    } else {
      A = t[25];
    }
    let k = A;
    let I;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      I = {
        context: "Global"
      };
      t[26] = I;
    } else {
      I = t[26];
    }
    uo("app:toggleTodos", f, I);
    let O;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      O = {
        context: "Global"
      };
      t[27] = O;
    } else {
      O = t[27];
    }
    uo("app:toggleTranscript", b, O);
    let M;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      M = {
        context: "Global"
      };
      t[28] = M;
    } else {
      M = t[28];
    }
    uo("app:toggleBrief", k, M);
    let L;
    if (t[29] !== p) {
      L = () => {};
      t[29] = p;
      t[30] = L;
    } else {
      L = t[30];
    }
    let P = L;
    let F;
    if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
      F = {
        context: "Global"
      };
      t[31] = F;
    } else {
      F = t[31];
    }
    uo("app:toggleTerminal", P, F);
    let H = VAf;
    let U;
    if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
      U = {
        context: "Global"
      };
      t[32] = U;
    } else {
      U = t[32];
    }
    uo("app:redraw", H, U);
    let N = n === "transcript";
    let W = N && !a;
    let j;
    if (t[33] !== W) {
      j = {
        context: "Transcript",
        isActive: W
      };
      t[33] = W;
      t[34] = j;
    } else {
      j = t[34];
    }
    uo("transcript:toggleShowAll", E, j);
    let z = N && !c;
    let V;
    if (t[35] !== z) {
      V = {
        context: "Transcript",
        isActive: z
      };
      t[35] = z;
      t[36] = V;
    } else {
      V = t[36];
    }
    uo("transcript:exit", x, V);
    return null;
  }
  function VAf() {
    rVd.get(process.stdout)?.forceRedraw();
  }
  function zAf(e) {
    return !e;
  }
  function KAf(e) {
    return e === "transcript" ? "prompt" : "transcript";
  }
  function YAf(e) {
    if (!e.isBriefOnly) {
      return e;
    }
    return {
      ...e,
      isBriefOnly: false
    };
  }
  function JAf(e) {
    if (!e.isBriefOnly) {
      return e;
    }
    return {
      ...e,
      isBriefOnly: false
    };
  }
  function XAf(e) {
    return e.isBriefOnly;
  }
  function QAf(e) {
    return {
      ...e,
      expandedView: e.expandedView === "tasks" ? "none" : "tasks"
    };
  }
  function ZAf(e) {
    return e.expandedView;
  }
  var y0c;
  var _0c;
  var b0c = __lazy(() => {
    Nd();
    FBe();
    Bs();
    ru();
    ln();
    $n();
    Ot();
    ho();
    g0c();
    y0c = __toESM(pt(), 1);
    _0c = __toESM(ot(), 1);
  });
  function LQo(e) {
    let t = S0c.c(8);
    let {
      onSubmit: n,
      isActive: r
    } = e;
    let o = tE();
    let s = TSe();
    let i;
    e: {
      if (!o) {
        let m;
        if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
          m = new Set();
          t[0] = m;
        } else {
          m = t[0];
        }
        i = m;
        break e;
      }
      let p;
      if (t[1] !== o.bindings) {
        p = new Set();
        for (let m of o.bindings) {
          if (m.action?.startsWith("command:")) {
            p.add(m.action);
          }
        }
        t[1] = o.bindings;
        t[2] = p;
      } else {
        p = t[2];
      }
      i = p;
    }
    let a = i;
    let l;
    if (t[3] !== a || t[4] !== n) {
      l = {};
      for (let p of a) {
        let m = p.slice(8);
        l[p] = () => {
          n(`/${m}`, e0f, {
            fromKeybinding: true
          });
        };
      }
      t[3] = a;
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c = l;
    let u = r && !s;
    let d;
    if (t[6] !== u) {
      d = {
        context: "Chat",
        isActive: u
      };
      t[6] = u;
      t[7] = d;
    } else {
      d = t[7];
    }
    jo(c, d);
    return null;
  }
  var S0c;
  var e0f;
  var T0c = __lazy(() => {
    px();
    yq();
    Bs();
    S0c = __toESM(pt(), 1);
    e0f = {
      setCursorOffset: () => {},
      clearBuffer: () => {},
      resetHistory: () => {}
    };
  });
  function FQo(e) {
    return za(e) && (e.status === "running" || gT(e)) || e.type === "in_process_teammate" && e.status === "running";
  }
  function n0f(e) {
    return FQo(e);
  }
  function UQo(e) {
    let {
      onCancel: t,
      onAgentsKilled: n,
      isMessageSelectorVisible: r,
      screen: o,
      abortSignal: s,
      isExternalLoading: i = false,
      popCommandFromQueue: a,
      isLocalJSXCommand: l,
      isInputOverlayActive: c,
      isVimEditing: u,
      inputMode: d,
      isInputEmpty: p,
      getInFlightMessageId: m
    } = e;
    let f = Ec();
    let h = Lo();
    let g = Rv();
    let y = Che().length;
    let {
      addNotification: _,
      removeNotification: b
    } = Fi();
    let S = XCe.useRef(0);
    let E = bt(V => V.viewSelectionMode);
    let C = bt(V => V.effortValue);
    let [, x] = XCe.useState(0);
    let A = tDe();
    let k = bt(V => Object.values(V.tasks).some(n0f));
    let I = XCe.useCallback(() => {
      let V = f.getState().tasks;
      let K = Object.entries(V).filter(([, Z]) => FQo(Z));
      if (K.length === 0) {
        return false;
      }
      for (let [Z, ne] of K) {
        if (_gt(Z, g), za(ne)) {
          rfe(Z, g);
        }
      }
      h8a(V, g, "user");
      for (let [Z, ne] of K) {
        if (ne.type === "in_process_teammate") {
          Uze(Z, g, h);
        }
      }
      let J = [];
      for (let [Z, ne] of K) {
        if (J.push(ne.description), ne.type !== "in_process_teammate") {
          zu(Z, "stopped", {
            toolUseId: ne.toolUseId,
            summary: ne.description
          });
        }
      }
      let Q = J.length === 1 ? `Background agent "${J[0]}" was stopped by the user.` : `${J.length} background agents were stopped by the user: ${J.map(Z => `"${Z}"`).join(", ")}.`;
      ud({
        agentId: mainAgentId(),
        value: Q,
        mode: "task-notification"
      });
      n();
      return true;
    }, [f, n, g, h]);
    let O = XCe.useCallback((V = false) => {
      let K = aO(getMainLoopModel(), C);
      let J = m?.();
      let Q = {
        source: "escape",
        streamMode: IEe().mode,
        ...(K && {
          effort_level: K
        }),
        ...(J && {
          message_id: br(J)
        })
      };
      if (M2n() > 0) {
        x(Z => Z + 1);
      }
      if (s !== undefined && !s.aborted || i) {
        logEvent("tengu_cancel", Q);
        t();
        return;
      }
      if (Ude()) {
        if (a) {
          a();
          return;
        }
      }
      if (!V && k) {
        if (I()) {
          logEvent("tengu_cancel", Q);
          return;
        }
      }
      logEvent("tengu_cancel", Q);
      t();
    }, [s, i, a, t, m, C, k, I, f, g, _]);
    let M = RZi();
    let L = s !== undefined && !s.aborted || i;
    let P = y > 0;
    let F = d !== undefined && d !== "prompt" && p;
    let H = E === "viewing-agent";
    let U = o !== "transcript" && !r && !l && !M && !c;
    let N = U && (L || P || A) && !F && !u && !H;
    let W = U && (L || P || A || k || H);
    uo("chat:cancel", () => O(true), {
      context: "Chat",
      isActive: N
    });
    let j = XCe.useCallback(() => {
      if (H) {
        let {
          viewingAgentTaskId: V,
          tasks: K
        } = f.getState();
        let J = V ? K[V] : undefined;
        if (xee(J)) {
          txt(J, g, h);
        }
        if (I5(h), L || P || A) {
          O(true);
        }
        return;
      }
      O();
    }, [H, f, g, h, L, P, A, O]);
    uo("app:interrupt", j, {
      context: "Global",
      isActive: W
    });
    let z = XCe.useCallback(() => {
      let V = f.getState().tasks;
      if (!Object.values(V).some(FQo)) {
        _({
          key: "kill-agents-none",
          kind: "feedback",
          text: "No background agents running",
          priority: "immediate",
          timeoutMs: 2000
        });
        return;
      }
      let J = Date.now();
      if (J - S.current <= 3000) {
        S.current = 0;
        b("kill-agents-confirm");
        let ne = aO(getMainLoopModel(), C);
        logEvent("tengu_cancel", {
          source: "kill_agents",
          ...(ne && {
            effort_level: ne
          })
        });
        yba();
        I();
        return;
      }
      S.current = J;
      let Z = dx("chat:killAgents", "Chat", "ctrl+x ctrl+k");
      _({
        key: "kill-agents-confirm",
        kind: "feedback",
        text: `Press ${Z} again to stop background agents`,
        priority: "immediate",
        timeoutMs: 3000
      });
    }, [f, _, b, I, C]);
    uo("chat:killAgents", z, {
      context: "Chat"
    });
    return null;
  }
  var XCe;
  var v0c = __lazy(() => {
    at();
    Ot();
    ho();
    _9();
    Fp();
    Eo();
    oxt();
    vpe();
    Nd();
    px();
    zRt();
    kre();
    Bs();
    bde();
    B_();
    Uhr();
    GUe();
    ry();
    e7e();
    Rf();
    Zn();
    aLe();
    XCe = __toESM(ot(), 1);
  });
  function w0c({
    inputOwnsEscape: e,
    isTranscriptScreen: t
  }) {
    let n = bt(l => l.tasks);
    let r = bt(l => l.viewSelectionMode);
    let o = bt(l => l.viewingAgentTaskId);
    let s = Lo();
    let i = Rv();
    return {
      handleKeyDown: l => {
        if (t) {
          return;
        }
        if (l.name === "escape" && r === "viewing-agent") {
          if (e) {
            return;
          }
          l.preventDefault();
          let c = o;
          if (c) {
            let u = n[c];
            if (RS(u) && u.status === "running") {
              aml(u);
              return;
            }
            if (za(u) && (u.status === "running" || gT(u))) {
              if (f8a(u.id, i)) {
                return;
              }
              txt(u, i, s);
              return;
            }
          }
          I5(s);
        }
      },
      handleKeyDownCapture: () => {}
    };
  }
  var C0c = __lazy(() => {
    ho();
    Uhr();
    GUe();
    _9();
    ry();
  });
  function R0c() {
    let e = getDynamicTeamContext();
    if (!e?.teamName || !e?.agentName) {
      logForDebugging("[Reconnection] computeInitialTeamContext: No teammate context set (not a teammate)");
      return;
    }
    let {
      teamName: t,
      agentId: n,
      agentName: r
    } = e;
    let o = readTeamFile(t);
    if (!o) {
      Oe($o(Error(`[computeInitialTeamContext] Could not read team file for ${t}`), "[computeInitialTeamContext] Could not read team file"));
      return;
    }
    let s = getTeamFilePath(t);
    let i = !n;
    logForDebugging(`[Reconnection] Computed initial team context for ${i ? "leader" : `teammate ${r}`} in team ${t}`);
    return {
      teamName: t,
      teamFilePath: s,
      leadAgentId: o.leadAgentId,
      selfAgentId: n,
      selfAgentName: r,
      isLeader: i,
      teammates: {}
    };
  }
  function x0c(e, t, n) {
    let r = readTeamFile(t);
    if (!r) {
      logForDebugging(`[initializeTeammateContextFromSession] Could not read team file for ${t} (agent: ${n}) \u2014 team may have been disbanded`, {
        level: "error"
      });
      return;
    }
    let o = r.members.find(a => a.name === n);
    if (!o) {
      logForDebugging(`[Reconnection] Member ${n} not found in team ${t} - may have been removed`);
    }
    let s = o?.agentId;
    let i = getTeamFilePath(t);
    e(a => ({
      ...a,
      teamContext: {
        teamName: t,
        teamFilePath: i,
        leadAgentId: r.leadAgentId,
        selfAgentId: s,
        selfAgentName: n,
        isLeader: false,
        teammates: {}
      }
    }));
    logForDebugging(`[Reconnection] Initialized agent context from session for ${n} in team ${t}`);
  }
  var BQo = __lazy(() => {
    je();
    dt();
    Rn();
    qp();
    UM();
  });
  function $Qo(e, t, n) {
    let {
      teamName: r,
      agentId: o,
      agentName: s
    } = n;
    let i = readTeamFile(r);
    if (!i) {
      logForDebugging(`[TeammateInit] Team file not found for team: ${r}`);
      return;
    }
    let a = i.leadAgentId;
    if (i.teamAllowedPaths && i.teamAllowedPaths.length > 0) {
      logForDebugging(`[TeammateInit] Found ${i.teamAllowedPaths.length} team-wide allowed path(s)`);
      for (let u of i.teamAllowedPaths) {
        let d = u.path.startsWith("/") ? `/${u.path}/**` : `${u.path}/**`;
        logForDebugging(`[TeammateInit] Applying team permission: ${u.toolName} allowed in ${u.path} (rule: ${d})`);
        e(p => ({
          ...p,
          toolPermissionContext: $y(p.toolPermissionContext, {
            type: "addRules",
            rules: [{
              toolName: u.toolName,
              ruleContent: d
            }],
            behavior: "allow",
            destination: "session"
          })
        }));
      }
    }
    let c = i.members.find(u => u.agentId === a)?.name || "team-lead";
    if (o === a) {
      logForDebugging("[TeammateInit] This agent is the team leader - skipping idle notification hook");
      return;
    }
    logForDebugging(`[TeammateInit] Registering Stop hook for teammate ${s} to notify leader ${c}`);
    WEl(e, t, "Stop", "", async (u, d) => {
      setMemberActive(r, s, false);
      let p = createIdleNotification(s, {
        idleReason: "available",
        summary: getLastPeerDmSummary(u)
      });
      await writeToMailbox(c, {
        from: s,
        text: De(p),
        timestamp: new Date().toISOString(),
        color: getTeammateColor()
      });
      logForDebugging(`[TeammateInit] Sent idle notification to leader ${c}`);
      return true;
    }, "Failed to send idle notification to team leader", {
      timeout: 1e4
    });
  }
  async function k0c(e, t, n) {
    if (n || !e || e.isLeader) {
      return;
    }
    let r = e.selfAgentName;
    if (!r) {
      return;
    }
    let o = Atr(t);
    if (o === undefined) {
      return;
    }
    setMemberActive(e.teamName, r, false);
    let i = (await readTeamFileAsync(e.teamName))?.members.find(l => l.agentId === e.leadAgentId)?.name || "team-lead";
    let a = createIdleNotification(r, {
      idleReason: "failed",
      failureReason: o,
      summary: getLastPeerDmSummary(t)
    });
    try {
      await writeToMailbox(i, {
        from: r,
        text: De(a),
        timestamp: new Date().toISOString(),
        color: getTeammateColor()
      });
    } catch (l) {
      logForDebugging(`[TeammateInit] Failed to send failed idle notification to team leader: ${he(l)}`, {
        level: "error"
      });
      return;
    }
    logForDebugging(`[TeammateInit] Sent failed idle notification to leader ${i}`);
  }
  var HQo = __lazy(() => {
    je();
    dt();
    pZ();
    ro();
    Zk();
    qp();
    uA();
    eL();
    UM();
  });
  function I0c(e, t, {
    enabled: n = true
  } = {}) {
    A0c.useEffect(() => {
      if (!n) {
        return;
      }
      if (isAgentSwarmsEnabled()) {
        let r = t?.[0];
        let o = r && "teamName" in r ? r.teamName : undefined;
        let s = r && "agentName" in r ? r.agentName : undefined;
        if (o && s) {
          x0c(e, o, s);
          let a = readTeamFile(o)?.members.find(l => l.name === s);
          if (a) {
            $Qo(e, getSessionId(), {
              teamName: o,
              agentId: a.agentId,
              agentName: s
            });
          }
        } else {
          let i = getDynamicTeamContext?.();
          if (i?.teamName && i?.agentId && i?.agentName) {
            $Qo(e, getSessionId(), {
              teamName: i.teamName,
              agentId: i.agentId,
              agentName: i.agentName
            });
          }
        }
      }
    }, [e, t, n]);
  }
  var A0c;
  var P0c = __lazy(() => {
    at();
    mE();
    BQo();
    UM();
    HQo();
    qp();
    A0c = __toESM(ot(), 1);
  });
  function O0c() {
    let e = Lo();
    let t = bt(c => c.viewingAgentTaskId);
    let n = bt(c => c.viewingAgentTaskId ? c.tasks[c.viewingAgentTaskId] : undefined);
    let r = n && RS(n) ? n : undefined;
    let o = r?.status;
    let s = r?.error;
    let i = n !== undefined;
    let a = Agr.useRef(undefined);
    if (za(n)) {
      a.current = n.parentAgentId;
    } else if (n !== undefined) {
      a.current = undefined;
    }
    let l = bt(c => a.current ? c.tasks[a.current] !== undefined : false);
    Agr.useEffect(() => {
      if (!t) {
        return;
      }
      if (!i) {
        let c = a.current;
        if (a.current = undefined, c && l) {
          iCe(c, e);
        } else {
          I5(e);
        }
        return;
      }
      if (!r) {
        return;
      }
      if (o === "killed" || o === "failed" || s || o !== "running" && o !== "completed" && o !== "pending") {
        I5(e);
        return;
      }
    }, [t, i, l, r, o, s, e]);
  }
  var Agr;
  var D0c = __lazy(() => {
    ho();
    GUe();
    ry();
    Agr = __toESM(ot(), 1);
  });
  async function M0c(e) {
    if (!isAgentSwarmsEnabled() || !qTt()) {
      return null;
    }
    let {
      ctx: t,
      description: n,
      updatedInput: r,
      suggestions: o
    } = e;
    let s = r ?? t.input;
    try {
      let i = () => t.toolUseContext.setAppState(l => ({
        ...l,
        pendingWorkerRequest: null
      }));
      let a = await new Promise(l => {
        let {
          resolve: c,
          claim: u
        } = Ler(l);
        let d = ftr({
          toolName: t.tool.name,
          toolUseId: t.toolUseID,
          input: s,
          description: n,
          permissionSuggestions: o
        });
        Rtr({
          requestId: d.id,
          toolUseId: t.toolUseID,
          onAllow(p, m, f, h) {
            if (!u()) {
              return;
            }
            i();
            let g = p && Object.keys(p).length > 0 ? p : s;
            c(t.handleUserAllow(g, m, f, undefined, h));
          },
          onReject(p, m) {
            if (!u()) {
              return;
            }
            i();
            t.logDecision({
              decision: "reject",
              source: {
                type: "user_reject",
                hasFeedback: !!p
              }
            });
            c(t.cancelAndAbort(p, undefined, m));
          }
        });
        htr(d);
        t.toolUseContext.setAppState(p => ({
          ...p,
          pendingWorkerRequest: {
            toolName: t.tool.name,
            toolUseId: t.toolUseID,
            description: n
          }
        }));
        t.toolUseContext.abortController.signal.addEventListener("abort", () => {
          if (!u()) {
            return;
          }
          i();
          t.logCancelled();
          c(t.cancelAndAbort(undefined, true));
        }, {
          once: true
        });
      });
      Pe("permission_swarm_forward");
      return a;
    } catch (i) {
      Ae("permission_swarm_forward", "permission_swarm_forward_failed");
      Oe(sr(i));
      return null;
    }
  }
  var N0c = __lazy(() => {
    ln();
    mE();
    dt();
    Rn();
    WTt();
    XTt();
    NYt();
  });
  function L0c(e, t) {
    return Nq.includes(e) ? De({
      command: t.command
    }) : De(t);
  }
  function r0f(e) {
    let t = F0c.c(9);
    let {
      recordDenial: n,
      getDenials: r,
      removeDenial: o
    } = iCt();
    let {
      addNotification: s
    } = Fi();
    let i = Lo();
    let a;
    if (t[0] !== i) {
      a = NDe(i);
      t[0] = i;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c;
    if (t[2] !== s || t[3] !== r || t[4] !== n || t[5] !== o || t[6] !== l || t[7] !== e) {
      c = async (u, d, p, m, f, h) => {
        let g;
        {
          let _ = r();
          if (_.length > 0) {
            let b = L0c(u.name, d);
            g = _.find(S => S.toolName === u.name && S.inputKey === b);
          }
        }
        let y = new Promise(_ => {
          let b = Fer(u, d, p, m, f, e, l);
          if (b.resolveIfAborted(_)) {
            return;
          }
          return (h !== undefined ? Promise.resolve(h) : hasPermissionsToUseToolWithSink(u, d, p, m, f, s, l)).then(async E => {
            if (E.behavior === "allow") {
              if (b.resolveIfAborted(_)) {
                return;
              }
              if (E.decisionReason?.type === "classifier" && E.decisionReason.classifier === "auto-mode") {
                Sya(l, f, E.decisionReason.reason);
              }
              b.logDecision({
                decision: "accept",
                source: "config"
              }, {
                input: E.updatedInput ?? d
              });
              _(b.buildAllow(E.updatedInput ?? d, {
                decisionReason: E.decisionReason
              }));
              return;
            }
            let C = p.getAppState();
            let x = getToolPermissionContext(p);
            let A = await u.description(d, {
              isNonInteractiveSession: p.options.isNonInteractiveSession,
              toolPermissionContext: x,
              tools: p.options.tools
            });
            if (b.resolveIfAborted(_)) {
              return;
            }
            switch (E.behavior) {
              case "deny":
                {
                  if (b.logDecision({
                    decision: "reject",
                    source: "config"
                  }), E.decisionReason?.type === "classifier" && E.decisionReason.classifier === "auto-mode") {
                    n({
                      toolName: u.name,
                      display: A,
                      inputKey: L0c(u.name, d),
                      reason: E.decisionReason.reason ?? "",
                      timestamp: Date.now()
                    });
                    let k = "";
                    if (k = E.decisionReason.reason ?? "", k.length > 80) {
                      k = `${k.slice(0, 79)}\u2026`;
                    }
                    s({
                      key: "auto-mode-denied",
                      kind: "warning",
                      priority: "immediate",
                      jsx: VBe.jsxs(VBe.Fragment, {
                        children: [VBe.jsxs(Text, {
                          color: "error",
                          children: [u.userFacingName(d).toLowerCase(), " denied by auto mode"]
                        }), k ? VBe.jsxs(Text, {
                          dimColor: true,
                          children: [" \xB7 ", k]
                        }) : null, VBe.jsx(Text, {
                          dimColor: true,
                          children: " \xB7 /permissions"
                        })]
                      })
                    });
                  }
                  _(E);
                  return;
                }
              case "ask":
                {
                  if (x.awaitAutomatedChecksBeforeDialog) {
                    let I = await CXn({
                      ctx: b,
                      updatedInput: E.updatedInput,
                      suggestions: E.suggestions,
                      permissionMode: x.mode
                    });
                    if (I) {
                      _(I);
                      return;
                    }
                  }
                  if (b.resolveIfAborted(_)) {
                    return;
                  }
                  let k = await M0c({
                    ctx: b,
                    description: A,
                    updatedInput: E.updatedInput,
                    suggestions: E.suggestions
                  });
                  if (k) {
                    _(k);
                    return;
                  }
                  return Ttr({
                    ctx: b,
                    description: A,
                    result: E,
                    awaitAutomatedChecksBeforeDialog: x.awaitAutomatedChecksBeforeDialog,
                    bridgeCallbacks: C.replBridgePermissionCallbacks,
                    channelCallbacks: C.channelPermissionCallbacks
                  }, _);
                }
            }
          }).catch(E => {
            if (E instanceof xc || E instanceof _f) {
              logForDebugging(`Permission check threw ${E.constructor.name} for tool=${u.name}: ${E.message}`);
              b.logCancelled();
              _(b.cancelAndAbort(undefined, true));
            } else {
              Oe($o(sr(E), "useCanUseTool permission flow failed"));
              _(b.cancelAndAbort(undefined, true));
            }
          }).finally(() => {
            LDe(l, f);
          });
        });
        if (g) {
          let _ = g;
          y.then(b => {
            if (b.behavior === "allow") {
              logEvent("tengu_auto_mode_subsequent_approval", {
                toolName: qi(u.name),
                msSinceDeny: Date.now() - _.timestamp,
                allowReasonType: b.decisionReason?.type == null ? undefined : b.decisionReason?.type
              });
              o(_);
            }
          });
        }
        return y;
      };
      t[2] = s;
      t[3] = r;
      t[4] = n;
      t[5] = o;
      t[6] = l;
      t[7] = e;
      t[8] = c;
    } else {
      c = t[8];
    }
    return c;
  }
  var F0c;
  var VBe;
  function o0f(e) {
    if (e?.startsWith("plugin")) {
      return "plugin hooks.json";
    }
    if (e?.startsWith("skill")) {
      return "SKILL.md";
    }
    return "settings.json";
  }
  function j0c(e) {
    if (e?.type === "rule" && e.rule.ruleBehavior === "ask") {
      return e.rule;
    }
    if (e?.type === "subcommandResults") {
      for (let t of e.reasons.values()) {
        if (t.behavior === "ask") {
          let n = j0c(t.decisionReason);
          if (n) {
            return n;
          }
        }
      }
    }
    return;
  }
  function jQo(e, t, n) {
    if (!e) {
      return null;
    }
    if (e.type === "classifier") {
      if (e.classifier === "auto-mode") {
        return {
          reasonString: `Auto mode classifier requires confirmation for this ${t}.
${e.reason}`,
          configString: undefined,
          themeColor: "error"
        };
      }
      return {
        reasonString: `Classifier ${_$u.bold(e.classifier)} requires confirmation for this ${t}.
${e.reason}`,
        configString: undefined
      };
    }
    if (e.type === "subcommandResults") {
      let r = j0c(e);
      if (r) {
        return jQo({
          type: "rule",
          rule: r
        }, t, n);
      }
      for (let o of e.reasons.values()) {
        if (o.behavior === "ask" || o.behavior === "passthrough") {
          let s = jQo(o.decisionReason, t, n);
          if (s) {
            return s;
          }
        }
      }
    }
    switch (e.type) {
      case "rule":
        {
          let r = _$u.bold(jp(e.rule.ruleValue));
          if (n === "auto" && e.rule.ruleBehavior === "ask" && e.rule.source !== "policySettings") {
            return {
              reasonString: `Ask rule ${r} overrides auto mode for this ${t}.`,
              configString: "/permissions to let auto mode decide"
            };
          }
          return {
            reasonString: `Permission rule ${r} requires confirmation for this ${t}.`,
            configString: e.rule.source === "policySettings" ? undefined : "/permissions to update rules"
          };
        }
      case "hook":
        {
          let r = e.reason ? `:
${e.reason}` : ".";
          let o = e.hookSource ? ` ${_$u.dim(`[${e.hookSource}]`)}` : "";
          return {
            reasonString: `Hook ${_$u.bold(e.hookName)} requires confirmation for this ${t}${r}${o}`,
            configString: `${o0f(e.hookSource)} to update hooks`
          };
        }
      case "safetyCheck":
      case "other":
        return {
          reasonString: e.reason,
          configString: undefined
        };
      case "workingDir":
        return {
          reasonString: e.reason,
          configString: "/permissions to update rules"
        };
      default:
        return null;
    }
  }
  function FH(e) {
    let t = H0c.c(12);
    let {
      permissionResult: n,
      toolType: r
    } = e;
    let o = bt(s0f);
    let s = n?.decisionReason;
    let i;
    if (t[0] !== o || t[1] !== s || t[2] !== r) {
      i = jQo(s, r, o);
      t[0] = o;
      t[1] = s;
      t[2] = r;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    if (!a) {
      return null;
    }
    let l = a.themeColor ?? (n?.decisionReason?.type === "hook" && o === "auto" ? "warning" : undefined);
    let c;
    if (t[4] !== a.reasonString || t[5] !== l) {
      c = l ? _Xe.jsx(Text, {
        color: l,
        children: a.reasonString
      }) : _Xe.jsx(Text, {
        children: _Xe.jsx(Ansi, {
          children: a.reasonString
        })
      });
      t[4] = a.reasonString;
      t[5] = l;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== a.configString) {
      u = a.configString && _Xe.jsx(Text, {
        dimColor: true,
        children: a.configString
      });
      t[7] = a.configString;
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] !== c || t[10] !== u) {
      d = _Xe.jsxs(gXd, {
        marginBottom: 1,
        flexDirection: "column",
        children: [c, u]
      });
      t[9] = c;
      t[10] = u;
      t[11] = d;
    } else {
      d = t[11];
    }
    return d;
  }
  function s0f(e) {
    return e.toolPermissionContext.mode;
  }
  var H0c;
  var _Xe;
  var QCe = __lazy(() => {
    et();
    ho();
    EC();
    IPe();
    H0c = __toESM(pt(), 1);
    _Xe = __toESM(ie(), 1);
  });
  function qQo(e, t) {
    let n = [{
      type: "setMode",
      mode: qA(e),
      destination: "session"
    }];
    if (jGt() && t && t.length > 0) {
      n.push({
        type: "addRules",
        rules: t.map(r => ({
          toolName: r.tool,
          ruleContent: KOa(r.prompt)
        })),
        behavior: "allow",
        destination: "session"
      });
    }
    return n;
  }
  function a0f(e, t, n) {
    if (isSessionPersistenceDisabled()) {
      return;
    }
    if (!n && getCurrentSessionTitle(getSessionId())) {
      return;
    }
    Dwt([In({
      content: e.slice(0, 1000)
    })], new AbortController().signal).then(async r => {
      if (!r || getCurrentSessionTitle(getSessionId())) {
        return;
      }
      let o = getSessionId();
      let s = wh();
      saveAiGeneratedTitle(o, r);
      await saveAgentName(o, r, s, "auto");
      t(i => {
        if (i.standaloneAgentContext?.name === r) {
          return i;
        }
        return {
          ...i,
          standaloneAgentContext: {
            ...i.standaloneAgentContext,
            name: r
          }
        };
      });
    }).catch(Oe);
  }
  function l0f({
    showClearContext: e,
    showUltraplan: t,
    showPublishArtifact: n,
    usedPercent: r,
    isAutoModeAvailable: o,
    isBypassPermissionsModeAvailable: s,
    onFeedbackChange: i
  }) {
    let a = [];
    let l = r !== null ? ` (${r}% used)` : "";
    if (e) {
      if (s) {
        a.push({
          label: `Yes, clear context${l} and bypass permissions`,
          value: "yes-bypass-permissions"
        });
      } else if (o) {
        a.push({
          label: `Yes, clear context${l} and use auto mode`,
          value: "yes-auto-clear-context"
        });
      } else {
        a.push({
          label: `Yes, clear context${l} and auto-accept edits`,
          value: "yes-accept-edits"
        });
      }
    }
    if (s) {
      a.push({
        label: "Yes, and bypass permissions",
        value: "yes-accept-edits-keep-context"
      });
    } else if (o) {
      a.push({
        label: "Yes, and use auto mode",
        value: "yes-resume-auto-mode"
      });
    } else {
      a.push({
        label: "Yes, auto-accept edits",
        value: "yes-accept-edits-keep-context"
      });
    }
    if (a.push({
      label: "Yes, manually approve edits",
      value: "yes-default-keep-context"
    }), n) {
      a.push({
        label: "Yes, and publish plan as artifact",
        value: "yes-publish-artifact"
      });
    }
    if (t) {
      a.push({
        label: "No, refine with Ultraplan on Claude Code on the web",
        value: "ultraplan"
      });
    }
    a.push({
      type: "input",
      label: "No, keep planning",
      value: "no",
      placeholder: "Tell Claude what to change",
      description: "shift+tab to approve with this feedback",
      onChange: i
    });
    return a;
  }
  function c0f(e, t) {
    if (!e) {
      return null;
    }
    let n = getRuntimeMainLoopModel({
      permissionMode: t,
      mainLoopModel: getMainLoopModel(),
      exceeds200kTokens: false
    });
    let r = iT(n, getSdkBetas());
    let {
      used: o
    } = eIn({
      input_tokens: e.input_tokens,
      cache_creation_input_tokens: e.cache_creation_input_tokens ?? 0,
      cache_read_input_tokens: e.cache_read_input_tokens ?? 0
    }, r);
    return o;
  }
  function Igr(e, t) {
    let {
      currentPlan: n,
      planEditedLocally: r,
      allowedPrompts: o,
      acceptFeedback: s,
      isBypassPermissionsModeAvailable: i,
      trimmedFeedback: a,
      hasImages: l,
      imageBlocks: c,
      showClearContext: u
    } = t;
    let d = r ? {
      plan: n
    } : {};
    if (e === "ultraplan") {
      return {
        behavior: "deny",
        feedback: "I'm sending this plan to Ultraplan to be refined remotely. Let me know it's been handed off and that a web link will appear here in a moment \u2014 I can use that to edit and iterate on the plan in the browser once the plan has been generated. I can continue to work here in the meantime; Claude Code will notify me when the cloud plan is ready for review, and I have the option to teleport the plan back here for implementation post-approval."
      };
    }
    if (u && (e === "yes-bypass-permissions" || e === "yes-accept-edits" || e === "yes-auto-clear-context")) {
      return {
        behavior: "deny"
      };
    }
    if (e === "yes-resume-auto-mode" && isAutoModeGateEnabled()) {
      return {
        behavior: "allow",
        updatedInput: d,
        permissionUpdates: [],
        feedback: s
      };
    }
    let f = e === "yes-accept-edits-keep-context" ? i ? "bypassPermissions" : "acceptEdits" : e === "yes-default-keep-context" || e === "yes-publish-artifact" ? "default" : e === "yes-resume-auto-mode" ? "default" : undefined;
    if (f !== undefined) {
      return {
        behavior: "allow",
        updatedInput: d,
        permissionUpdates: qQo(f, o),
        feedback: s
      };
    }
    if (e === "no") {
      if (!a && !l) {
        return null;
      }
      return {
        behavior: "deny",
        feedback: a || (l ? "(See attached image)" : undefined),
        contentBlocks: c && c.length > 0 ? c : undefined
      };
    }
    return null;
  }
  function W0c(e) {
    let t = q0c.c(111);
    let {
      payload: n,
      answer: r
    } = e;
    let o = bt(S0f);
    let s = Lo();
    let i = Ec();
    let {
      addNotification: a
    } = Fi();
    let [l, c] = GK.useState("");
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = {};
      t[0] = u;
    } else {
      u = t[0];
    }
    let [d, p] = GK.useState(u);
    let m = GK.useRef(0);
    let f = bt(b0f) ?? false;
    let h = bt(_0f);
    let g = bt(y0f);
    let y = dR();
    let _;
    if (t[1] !== g || t[2] !== h) {
      _ = zfe() && isPolicyAllowed("allow_remote_sessions") && !h && !g;
      t[1] = g;
      t[2] = h;
      t[3] = _;
    } else {
      _ = t[3];
    }
    let b = _;
    let {
      mode: S,
      isAutoModeAvailable: E,
      isBypassPermissionsModeAvailable: C
    } = o;
    let {
      plan: x,
      planFilePath: A,
      allowedPrompts: k,
      usage: I
    } = n;
    let O;
    if (t[4] !== x) {
      O = () => x && x.length > 0 ? x : "No plan found. Please write your plan to the plan file first.";
      t[4] = x;
      t[5] = O;
    } else {
      O = t[5];
    }
    let [M, L] = GK.useState(O);
    let P;
    if (t[6] !== x) {
      P = !x || x.trim() === "";
      t[6] = x;
      t[7] = P;
    } else {
      P = t[7];
    }
    let F = P;
    let H;
    if (t[8] !== F) {
      H = isPlanArtifactEnabled() && !F;
      t[8] = F;
      t[9] = H;
    } else {
      H = t[9];
    }
    let U = H;
    let N;
    if (t[10] !== E || t[11] !== C || t[12] !== S || t[13] !== f || t[14] !== U || t[15] !== b || t[16] !== I) {
      let Ce;
      if (t[18] !== E) {
        Ce = E && !RXo();
        t[18] = E;
        t[19] = Ce;
      } else {
        Ce = t[19];
      }
      N = l0f({
        showClearContext: f,
        showUltraplan: b,
        showPublishArtifact: U,
        usedPercent: f ? c0f(I, S) : null,
        isAutoModeAvailable: Ce,
        isBypassPermissionsModeAvailable: C,
        onFeedbackChange: c
      });
      t[10] = E;
      t[11] = C;
      t[12] = S;
      t[13] = f;
      t[14] = U;
      t[15] = b;
      t[16] = I;
      t[17] = N;
    } else {
      N = t[17];
    }
    let W = N;
    let [j, z] = GK.useState(false);
    let [V, K] = GK.useState(false);
    let J;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      J = () => z(false);
      t[20] = J;
    } else {
      J = t[20];
    }
    let Q;
    if (t[21] !== j) {
      Q = [j];
      t[21] = j;
      t[22] = Q;
    } else {
      Q = t[22];
    }
    useTimeout(J, j ? 5000 : null, Q);
    let Z;
    if (t[23] !== s) {
      Z = function (Fe, Xe, He, Gt, mt) {
        m.current = m.current + 1;
        let Dt = m.current;
        let jt = {
          id: Dt,
          type: "image",
          content: Fe,
          mediaType: Xe || "image/png",
          filename: He || "Pasted image",
          dimensions: Gt
        };
        LRt(jt, s);
        FRt(jt, s);
        p(bn => ({
          ...bn,
          [Dt]: jt
        }));
      };
      t[23] = s;
      t[24] = Z;
    } else {
      Z = t[24];
    }
    let ne = Z;
    let oe;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      oe = Ce => {
        p(Fe => {
          let Xe = {
            ...Fe
          };
          delete Xe[Ce];
          return Xe;
        });
      };
      t[25] = oe;
    } else {
      oe = t[25];
    }
    let ee = oe;
    let re;
    if (t[26] !== d) {
      re = Object.values(d).filter(g0f);
      t[26] = d;
      t[27] = re;
    } else {
      re = t[27];
    }
    let se = re;
    let ae = se.length > 0;
    let de = uut();
    let be = eFn();
    let fe = GK.useRef(null);
    let [me, Te] = GK.useState(0);
    let ue;
    if (t[28] !== me) {
      ue = () => {
        let Ce = fe.current ? $Xd(fe.current).height : 0;
        if (Ce !== me) {
          Te(Ce);
        }
      };
      t[28] = me;
      t[29] = ue;
    } else {
      ue = t[29];
    }
    GK.useLayoutEffect(ue);
    let ce;
    let le;
    if (t[30] !== be || t[31] !== me) {
      ce = () => {
        if (!be) {
          return;
        }
        be(me);
        return () => be(null);
      };
      le = [be, me];
      t[30] = be;
      t[31] = me;
      t[32] = ce;
      t[33] = le;
    } else {
      ce = t[32];
      le = t[33];
    }
    GK.useLayoutEffect(ce, le);
    let pe;
    if (t[34] === Symbol.for("react.memo_cache_sentinel")) {
      pe = {
        rows: 0,
        columns: 0
      };
      t[34] = pe;
    } else {
      pe = t[34];
    }
    let {
      rows: ve
    } = h_(pe);
    let _e = Sr();
    let xe = be !== null && de !== null;
    let ke = xe ? Math.max(1, ve - me) : Math.max(1, _e.rows - me - 4);
    let Ie;
    if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
      let Ce = v5();
      Ie = Ce ? S0(Ce) : null;
      t[35] = Ie;
    } else {
      Ie = t[35];
    }
    let Ue = Ie;
    let Ge;
    if (t[36] !== k || t[37] !== r || t[38] !== M || t[39] !== ae || t[40] !== se || t[41] !== C || t[42] !== y || t[43] !== V || t[44] !== l || t[45] !== s || t[46] !== f || t[47] !== i) {
      Ge = async function (Fe) {
        let Xe = l.trim();
        let He = Xe || undefined;
        if (Fe === "ultraplan") {
          logEvent("tengu_plan_exit", {
            planLengthChars: M.length,
            outcome: "ultraplan"
          });
          r(Igr(Fe, {
            currentPlan: M,
            planEditedLocally: V,
            allowedPrompts: k,
            acceptFeedback: He,
            isBypassPermissionsModeAvailable: C,
            trimmedFeedback: Xe,
            hasImages: ae,
            imageBlocks: undefined,
            showClearContext: f
          }));
          let bn = h0f;
          ben({
            arg: "",
            source: "exit_plan_mode",
            seedPlan: M,
            getAppState: i.getState,
            setAppState: i.setState,
            signal: new AbortController().signal,
            onStatusMessage: bn
          }).then(bn).catch(Oe);
          return;
        }
        let mt = Fe === "yes-accept-edits-keep-context" || Fe === "yes-default-keep-context" || Fe === "yes-publish-artifact" || Fe === "yes-resume-auto-mode";
        {
          let bn = (Fe === "yes-resume-auto-mode" || Fe === "yes-auto-clear-context") && isAutoModeGateEnabled();
          let Ct = mxt?.isAutoModeActive() ?? false;
          if (Fe !== "no" && !bn && Ct) {
            mxt?.setAutoModeActive(false);
            setNeedsAutoModeExitAttachment(true);
            s(f0f);
          }
        }
        if (Fe !== "no") {
          a0f(M, s, !mt);
        }
        if (f && (Fe === "yes-bypass-permissions" || Fe === "yes-accept-edits" || Fe === "yes-auto-clear-context")) {
          let bn = "default";
          if (Fe === "yes-bypass-permissions") {
            bn = "bypassPermissions";
          } else if (Fe === "yes-accept-edits") {
            bn = "acceptEdits";
          } else if (Fe === "yes-auto-clear-context" && isAutoModeGateEnabled()) {
            bn = "auto";
            mxt?.setAutoModeActive(true);
          }
          logEvent("tengu_plan_exit", {
            planLengthChars: M.length,
            outcome: Fe,
            clearContext: true,
            hasFeedback: !!He
          });
          ISe({
            from: "plan",
            to: bn,
            trigger: "exit_plan_mode"
          });
          let hn = `

If you need specific details from before exiting plan mode (like exact code snippets, error messages, or content you generated), read the full transcript at: ${wh()}`;
          let vn = isAgentSwarmsEnabled() ? `

If this plan can be broken down into multiple independent tasks, consider spawning named teammates with the ${"Agent"} tool (pass a \`name\`) to parallelize the work.` : "";
          let zn = He ? `

User feedback on this plan: ${He}` : "";
          s(Pn => ({
            ...Pn,
            initialMessage: {
              message: {
                ...In({
                  content: `Implement the following plan:

${M}${hn}${vn}${zn}`,
                  origin: {
                    kind: "auto-continuation"
                  }
                }),
                planContent: M
              },
              clearContext: true,
              mode: bn,
              allowedPrompts: k
            }
          }));
          setHasExitedPlanMode(true);
          r({
            behavior: "deny"
          });
          return;
        }
        if (Fe === "yes-resume-auto-mode" && isAutoModeGateEnabled()) {
          logEvent("tengu_plan_exit", {
            planLengthChars: M.length,
            outcome: Fe,
            clearContext: false,
            hasFeedback: !!He
          });
          setHasExitedPlanMode(true);
          setNeedsPlanModeExitAttachment(true);
          mxt?.setAutoModeActive(true);
          ISe({
            from: "plan",
            to: "auto",
            trigger: "exit_plan_mode"
          });
          s(m0f);
          r(Igr(Fe, {
            currentPlan: M,
            planEditedLocally: V,
            allowedPrompts: k,
            acceptFeedback: He,
            isBypassPermissionsModeAvailable: C,
            trimmedFeedback: Xe,
            hasImages: ae,
            imageBlocks: undefined,
            showClearContext: f
          }));
          return;
        }
        if (mt) {
          if (ISe({
            from: "plan",
            to: Fe === "yes-accept-edits-keep-context" ? C ? "bypassPermissions" : "acceptEdits" : "default",
            trigger: "exit_plan_mode"
          }), logEvent("tengu_plan_exit", {
            planLengthChars: M.length,
            outcome: Fe,
            clearContext: false,
            hasFeedback: !!He
          }), setHasExitedPlanMode(true), setNeedsPlanModeExitAttachment(true), r(Igr(Fe, {
            currentPlan: M,
            planEditedLocally: V,
            allowedPrompts: k,
            acceptFeedback: He,
            isBypassPermissionsModeAvailable: C,
            trimmedFeedback: Xe,
            hasImages: ae,
            imageBlocks: undefined,
            showClearContext: f
          })), Fe === "yes-publish-artifact" && isPlanArtifactEnabled() && M.trim()) {
            let Ct = p0f;
            publishPlanArtifact(M).then(hn => {
              if (hn.url) {
                Ct(`Published plan: ${hn.url}`);
              } else {
                logForDebugging(`plan artifact: publish returned ${hn.err}`);
                Ct("Couldn't publish plan \u2014 run /plan share to retry, or --debug for details.");
              }
            }).catch(Oe);
          }
          return;
        }
        if (Fe === "no") {
          if (!Xe && !ae) {
            return;
          }
          logEvent("tengu_plan_exit", {
            planLengthChars: M.length,
            outcome: "no"
          });
          let bn;
          if (ae) {
            bn = await Promise.all(se.map(async Ct => {
              let {
                block: hn
              } = await f1({
                data: Ct.content,
                mediaType: Ct.mediaType,
                limits: Yg(y)
              });
              return hn;
            }));
          }
          r(Igr(Fe, {
            currentPlan: M,
            planEditedLocally: V,
            allowedPrompts: k,
            acceptFeedback: He,
            isBypassPermissionsModeAvailable: C,
            trimmedFeedback: Xe,
            hasImages: ae,
            imageBlocks: bn,
            showClearContext: f
          }));
          return;
        }
      };
      t[36] = k;
      t[37] = r;
      t[38] = M;
      t[39] = ae;
      t[40] = se;
      t[41] = C;
      t[42] = y;
      t[43] = V;
      t[44] = l;
      t[45] = s;
      t[46] = f;
      t[47] = i;
      t[48] = Ge;
    } else {
      Ge = t[48];
    }
    let Be = Ge;
    let We;
    if (t[49] !== r || t[50] !== M.length) {
      We = () => {
        logEvent("tengu_plan_exit", {
          planLengthChars: M.length,
          outcome: "no"
        });
        r({
          behavior: "deny"
        });
      };
      t[49] = r;
      t[50] = M.length;
      t[51] = We;
    } else {
      We = t[51];
    }
    let Ze = We;
    let Tt;
    if (t[52] !== r || t[53] !== s) {
      Tt = function (Fe) {
        if (Fe === "yes") {
          if (logEvent("tengu_plan_exit", {
            planLengthChars: 0,
            outcome: "yes-default"
          }), mxt?.isAutoModeActive() ?? false) {
            mxt?.setAutoModeActive(false);
            setNeedsAutoModeExitAttachment(true);
            s(d0f);
          }
          setHasExitedPlanMode(true);
          setNeedsPlanModeExitAttachment(true);
          r({
            behavior: "allow",
            updatedInput: {},
            permissionUpdates: [{
              type: "setMode",
              mode: "default",
              destination: "session"
            }]
          });
          return;
        }
        logEvent("tengu_plan_exit", {
          planLengthChars: 0,
          outcome: "no"
        });
        r({
          behavior: "deny"
        });
      };
      t[52] = r;
      t[53] = s;
      t[54] = Tt;
    } else {
      Tt = t[54];
    }
    let kt = Tt;
    let Ye;
    if (t[55] !== a || t[56] !== M || t[57] !== Be || t[58] !== A || t[59] !== f) {
      Ye = Ce => {
        if (Ce.ctrl && Ce.key === "g") {
          Ce.preventDefault();
          logEvent("tengu_plan_external_editor_used", {});
          (async () => {
            if (A) {
              let Fe = await jwe(A);
              if (Fe.error) {
                a({
                  key: "external-editor-error",
                  kind: "warning",
                  text: Fe.error,
                  color: "warning",
                  priority: "high"
                });
              }
              if (Fe.content !== null) {
                if (Fe.content !== M) {
                  K(true);
                }
                L(Fe.content);
                z(true);
              }
            } else {
              let Fe = await KZ(M);
              if (Fe.error) {
                a({
                  key: "external-editor-error",
                  kind: "warning",
                  text: Fe.error,
                  color: "warning",
                  priority: "high"
                });
              }
              if (Fe.content !== null && Fe.content !== M) {
                L(Fe.content);
                z(true);
              }
            }
          })();
          return;
        }
        if (Ce.shift && Ce.key === "tab") {
          Ce.preventDefault();
          Be(f ? "yes-accept-edits" : "yes-accept-edits-keep-context");
          return;
        }
      };
      t[55] = a;
      t[56] = M;
      t[57] = Be;
      t[58] = A;
      t[59] = f;
      t[60] = Ye;
    } else {
      Ye = t[60];
    }
    let ht = Ye;
    if (F) {
      let Ce;
      if (t[61] === Symbol.for("react.memo_cache_sentinel")) {
        Ce = fy.jsx(Text, {
          children: "Claude wants to exit plan mode"
        });
        t[61] = Ce;
      } else {
        Ce = t[61];
      }
      let Fe;
      if (t[62] === Symbol.for("react.memo_cache_sentinel")) {
        Fe = {
          label: "Yes",
          value: "yes"
        };
        t[62] = Fe;
      } else {
        Fe = t[62];
      }
      let Xe;
      if (t[63] === Symbol.for("react.memo_cache_sentinel")) {
        Xe = [Fe, {
          label: "No",
          value: "no"
        }];
        t[63] = Xe;
      } else {
        Xe = t[63];
      }
      let He;
      if (t[64] !== kt) {
        He = () => kt("no");
        t[64] = kt;
        t[65] = He;
      } else {
        He = t[65];
      }
      let Gt;
      if (t[66] !== kt || t[67] !== He) {
        Gt = fy.jsxs(gXd, {
          flexDirection: "column",
          paddingX: 1,
          marginTop: 1,
          children: [Ce, fy.jsx(gXd, {
            marginTop: 1,
            children: fy.jsx(xr, {
              options: Xe,
              onChange: kt,
              onCancel: He
            })
          })]
        });
        t[66] = kt;
        t[67] = He;
        t[68] = Gt;
      } else {
        Gt = t[68];
      }
      let mt;
      if (t[69] !== n.requestSource || t[70] !== Gt) {
        mt = fy.jsx(qm, {
          color: "planMode",
          title: "Exit plan mode?",
          requestSource: n.requestSource,
          children: Gt
        });
        t[69] = n.requestSource;
        t[70] = Gt;
        t[71] = mt;
      } else {
        mt = t[71];
      }
      return mt;
    }
    let It = de ?? undefined;
    let Rt = xe ? ke : undefined;
    let wt;
    if (t[72] === Symbol.for("react.memo_cache_sentinel")) {
      wt = fy.jsx(gXd, {
        paddingX: 1,
        flexDirection: "column",
        children: fy.jsx(Text, {
          children: "Here is Claude's plan:"
        })
      });
      t[72] = wt;
    } else {
      wt = t[72];
    }
    let vt;
    if (t[73] !== M) {
      vt = fy.jsx(x3, {
        marginBottom: 1,
        children: fy.jsx(cy, {
          children: M
        })
      });
      t[73] = M;
      t[74] = vt;
    } else {
      vt = t[74];
    }
    let yt;
    if (t[75] !== n.permissionResult) {
      yt = fy.jsx(FH, {
        permissionResult: n.permissionResult,
        toolType: "tool"
      });
      t[75] = n.permissionResult;
      t[76] = yt;
    } else {
      yt = t[76];
    }
    let gt;
    if (t[77] !== k) {
      gt = jGt() && k && k.length > 0 && fy.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [fy.jsx(Text, {
          bold: true,
          children: "Requested permissions:"
        }), k.map(u0f)]
      });
      t[77] = k;
      t[78] = gt;
    } else {
      gt = t[78];
    }
    let Ft;
    if (t[79] !== yt || t[80] !== gt) {
      Ft = fy.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        children: [yt, gt]
      });
      t[79] = yt;
      t[80] = gt;
      t[81] = Ft;
    } else {
      Ft = t[81];
    }
    let on;
    if (t[82] !== vt || t[83] !== Ft) {
      on = fy.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [wt, vt, Ft]
      });
      t[82] = vt;
      t[83] = Ft;
      t[84] = on;
    } else {
      on = t[84];
    }
    let rn;
    if (t[85] !== n.requestSource || t[86] !== on) {
      rn = fy.jsx(qm, {
        color: "planMode",
        title: "Ready to code?",
        innerPaddingX: 0,
        requestSource: n.requestSource,
        children: on
      });
      t[85] = n.requestSource;
      t[86] = on;
      t[87] = rn;
    } else {
      rn = t[87];
    }
    let Sn;
    if (t[88] !== It || t[89] !== Rt || t[90] !== rn) {
      Sn = fy.jsx(B2m, {
        ref: It,
        flexDirection: "column",
        height: Rt,
        stickyScroll: false,
        children: rn
      });
      t[88] = It;
      t[89] = Rt;
      t[90] = rn;
      t[91] = Sn;
    } else {
      Sn = t[91];
    }
    let jn;
    if (t[92] === Symbol.for("react.memo_cache_sentinel")) {
      jn = fy.jsx(Text, {
        dimColor: true,
        children: "Claude has written up a plan and is ready to execute. Would you like to proceed?"
      });
      t[92] = jn;
    } else {
      jn = t[92];
    }
    let Xr;
    if (t[93] !== Be) {
      Xr = Ce => void Be(Ce);
      t[93] = Be;
      t[94] = Xr;
    } else {
      Xr = t[94];
    }
    let co;
    if (t[95] !== Ze || t[96] !== ne || t[97] !== W || t[98] !== d || t[99] !== Xr) {
      co = fy.jsx(gXd, {
        marginTop: 1,
        children: fy.jsx(xr, {
          options: W,
          onChange: Xr,
          onCancel: Ze,
          onImagePaste: ne,
          pastedContents: d,
          onRemoveImage: ee
        })
      });
      t[95] = Ze;
      t[96] = ne;
      t[97] = W;
      t[98] = d;
      t[99] = Xr;
      t[100] = co;
    } else {
      co = t[100];
    }
    let Yt;
    if (t[101] !== A || t[102] !== j) {
      Yt = Ue && fy.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginTop: 1,
        children: [fy.jsxs(Text, {
          dimColor: true,
          children: [fy.jsx(xt, {
            chord: "ctrl+g",
            action: "edit in"
          }), " "]
        }), fy.jsx(Text, {
          bold: true,
          dimColor: true,
          children: Ue
        }), A && fy.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", Pd(A)]
        }), j && fy.jsxs(fy.Fragment, {
          children: [fy.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          }), fy.jsxs(Text, {
            color: "success",
            children: [fy.jsx(Ps, {
              status: "success",
              withSpace: true
            }), "Plan saved!"]
          })]
        })]
      });
      t[101] = A;
      t[102] = j;
      t[103] = Yt;
    } else {
      Yt = t[103];
    }
    let Ee;
    if (t[104] !== co || t[105] !== Yt) {
      Ee = fy.jsxs(gXd, {
        ref: fe,
        flexDirection: "column",
        borderStyle: "round",
        borderColor: "planMode",
        borderLeft: false,
        borderRight: false,
        borderBottom: false,
        paddingX: 1,
        flexShrink: 0,
        children: [jn, co, Yt]
      });
      t[104] = co;
      t[105] = Yt;
      t[106] = Ee;
    } else {
      Ee = t[106];
    }
    let Re;
    if (t[107] !== ht || t[108] !== Sn || t[109] !== Ee) {
      Re = fy.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: ht,
        children: [Sn, Ee]
      });
      t[107] = ht;
      t[108] = Sn;
      t[109] = Ee;
      t[110] = Re;
    } else {
      Re = t[110];
    }
    return Re;
  }
  function u0f(e, t) {
    return fy.jsxs(Text, {
      dimColor: true,
      children: ["  ", "\xB7 ", e.tool, "(", "prompt:", " ", e.prompt, ")"]
    }, t);
  }
  function d0f(e) {
    return {
      ...e,
      toolPermissionContext: {
        ...restoreDangerousPermissions(e.toolPermissionContext),
        prePlanMode: undefined
      }
    };
  }
  function p0f(e) {
    return ud({
      agentId: mainAgentId(),
      value: e,
      mode: "task-notification"
    });
  }
  function m0f(e) {
    return {
      ...e,
      toolPermissionContext: stripDangerousPermissionsForAutoMode({
        ...e.toolPermissionContext,
        mode: "auto",
        prePlanMode: undefined
      })
    };
  }
  function f0f(e) {
    return {
      ...e,
      toolPermissionContext: {
        ...restoreDangerousPermissions(e.toolPermissionContext),
        prePlanMode: undefined
      }
    };
  }
  function h0f(e) {
    return ud({
      agentId: mainAgentId(),
      value: e,
      mode: "task-notification"
    });
  }
  function g0f(e) {
    return e.type === "image";
  }
  function y0f(e) {
    return e.ultraplanLaunching;
  }
  function _0f(e) {
    return e.ultraplanSessionUrl;
  }
  function b0f(e) {
    return e.settings.showClearContextOnPlanAccept;
  }
  function S0f(e) {
    return e.toolPermissionContext;
  }
  var q0c;
  var GK;
  var fy;
  var mxt;
  var WQo = __lazy(() => {
    at();
    at();
    klr();
    KYe();
    OS();
    Vze();
    bs();
    Vf();
    sH();
    XI();
    QCe();
    rE();
    Nd();
    nwe();
    G9o();
    iH();
    ki();
    et();
    Ot();
    Kc();
    ho();
    Sh();
    M1();
    mE();
    VT();
    je();
    SUe();
    Zl();
    bT();
    yG();
    URt();
    Rn();
    Rf();
    ro();
    JF();
    Eo();
    Hhr();
    HT();
    S_();
    Lfe();
    Fy();
    fa();
    yS();
    _en();
    q0c = __toESM(pt(), 1);
    GK = __toESM(ot(), 1);
    fy = __toESM(ie(), 1);
    nnc({
      isPlanArtifactEnabled: isPlanArtifactEnabled,
      publishPlanArtifact: publishPlanArtifact
    });
    mxt = (xse(), __toCommonJS(Fme));
  });
  function G0c() {
    T0f();
  }
  function V0c() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_xterm_atlas_reset", true);
    C9i(e);
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_basalt_meadow", false);
    if (e || t) {
      rHt(true);
    }
  }
  function T0f() {
    if (false) {
      return;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_basalt_meadow", false)) {
      if (!PWe) {
        rHt(false);
      }
      return;
    }
    rHt(true);
    let t = I9i();
    if (!t) {
      return;
    }
    let n = oHt();
    let r = peo();
    if (logEvent("tengu_render_glyph_cardinality", {
      stylepool_styles: t.size,
      stylepool_overflowed: t.overflowed,
      atlas_glyph_keys: n.atlasKeys,
      atlas_keys_saturated: n.saturated,
      term_program: E0f(),
      is_xtermjs: Rb(),
      session_age_bucket: v0f(getTotalDuration()),
      proactive_reset_count: r.count,
      proactive_reset_last_reason: r.lastReason
    }), P9i()) {
      Pe("render_stylepool");
    }
    if (t.overflowed && O9i()) {
      Et("render_stylepool", "cap_hit");
    }
  }
  function E0f() {
    if (process.env.CURSOR_TRACE_ID !== undefined) {
      return "cursor";
    }
    switch (process.env.TERM_PROGRAM) {
      case "vscode":
        return "vscode";
      case "iTerm.app":
        return "iterm";
      case "Apple_Terminal":
        return "apple_terminal";
      case "ghostty":
        return "ghostty";
      case "WezTerm":
        return "wezterm";
      case "tmux":
        return "tmux";
    }
    if (process.env.WT_SESSION !== undefined) {
      return "windows_terminal";
    }
    return "other";
  }
  function v0f(e) {
    let t = e / 60000;
    if (t < 5) {
      return "lt_5m";
    }
    if (t < 30) {
      return "5m_30m";
    }
    if (t < 120) {
      return "30m_2h";
    }
    if (t < 480) {
      return "2h_8h";
    }
    return "gt_8h";
  }
  var GQo = __lazy(() => {
    at();
    Llt();
    mT();
    ln();
    $n();
    Ot();
  });
  var Y0c = {};
  __export(Y0c, {
    renameRecordingForSession: () => renameRecordingForSession,
    installAsciicastRecorder: () => installAsciicastRecorder,
    getSessionRecordingPaths: () => getSessionRecordingPaths,
    getRecordFilePath: () => getRecordFilePath,
    flushAsciicastRecorder: () => flushAsciicastRecorder,
    _resetRecordingStateForTesting: () => _resetRecordingStateForTesting
  });
  function getRecordFilePath() {
    if (VK.filePath !== null) {
      return VK.filePath;
    }
    return null;
  }
  function _resetRecordingStateForTesting() {
    VK.filePath = null;
    VK.timestamp = 0;
  }
  function getSessionRecordingPaths() {
    let e = getSessionId();
    let t = t4.join(er(), "projects");
    let n = t4.join(t, $T(getOriginalCwd()));
    try {
      let r = zt().readdirSync(n);
      return (typeof r[0] === "string" ? r : r.map(i => i.name)).filter(i => i.startsWith(e) && i.endsWith(".cast")).sort().map(i => t4.join(n, i));
    } catch {
      return [];
    }
  }
  async function renameRecordingForSession() {
    let e = VK.filePath;
    if (!e || VK.timestamp === 0) {
      return;
    }
    let t = t4.join(er(), "projects");
    let n = t4.join(t, $T(getOriginalCwd()));
    let r = t4.join(n, `${getSessionId()}-${VK.timestamp}.cast`);
    if (e === r) {
      return;
    }
    await son?.flush();
    let o = t4.basename(e);
    let s = t4.basename(r);
    try {
      await Pgr.rename(e, r);
      VK.filePath = r;
      logForDebugging(`[asciicast] Renamed recording: ${o} \u2192 ${s}`);
    } catch {
      logForDebugging(`[asciicast] Failed to rename recording from ${o} to ${s}`);
    }
  }
  function z0c() {
    let e = process.stdout.columns || 80;
    let t = process.stdout.rows || 24;
    return {
      cols: e,
      rows: t
    };
  }
  async function flushAsciicastRecorder() {
    await son?.flush();
  }
  function installAsciicastRecorder() {
    let e = getRecordFilePath();
    if (!e) {
      return;
    }
    let {
      cols: t,
      rows: n
    } = z0c();
    let r = performance.now();
    let o = De({
      version: 2,
      width: t,
      height: n,
      timestamp: Math.floor(Date.now() / 1000),
      env: {
        SHELL: process.env.SHELL || "",
        TERM: process.env.TERM || ""
      }
    });
    try {
      zt().mkdirSync(t4.dirname(e));
    } catch {}
    zt().appendFileSync(e, o + `
`, {
      mode: 384
    });
    let s = Promise.resolve();
    let i = wZe({
      writeFn(c) {
        let u = VK.filePath;
        if (!u) {
          return;
        }
        s = s.then(() => Pgr.appendFile(u, c)).catch(() => {});
      },
      flushIntervalMs: 500,
      maxBufferSize: 50,
      maxBufferBytes: 10485760
    });
    let a = process.stdout.write.bind(process.stdout);
    process.stdout.write = function (c, u, d) {
      let p = (performance.now() - r) / 1000;
      let m = typeof c === "string" ? c : Buffer.from(c).toString("utf-8");
      if (i.write(De([p, "o", m]) + `
`), typeof u === "function") {
        return a(c, u);
      }
      return a(c, u, d);
    };
    function l() {
      let c = (performance.now() - r) / 1000;
      let {
        cols: u,
        rows: d
      } = z0c();
      i.write(De([c, "r", `${u}x${d}`]) + `
`);
    }
    process.stdout.on("resize", l);
    son = {
      async flush() {
        i.flush();
        await s;
      },
      async dispose() {
        i.dispose();
        await s;
        process.stdout.removeListener("resize", l);
        process.stdout.write = a;
      }
    };
    Ti(async () => {
      await son?.dispose();
      son = null;
    });
    logForDebugging(`[asciicast] Recording to ${e}`);
  }
  var Pgr;
  var t4;
  var VK;
  var son = null;
  var aon = __lazy(() => {
    at();
    $n();
    hd();
    je();
    gn();
    ku();
    Pgr = require("fs/promises");
    t4 = require("path");
    VK = {
      filePath: null,
      timestamp: 0
    };
  });
  function zBe(e) {
    if (e?.hooks && (!ZT("hooks") || Hbe(e.source))) {
      setMainThreadAgentHooks(e.hooks);
    } else {
      setMainThreadAgentHooks(undefined);
    }
  }
  var Ogr = __lazy(() => {
    at();
    IJ();
  });
  var VQo = {};
  __export(VQo, {
    restoreGoalFromTranscript: () => restoreGoalFromTranscript,
    findGoalToRestore: () => findGoalToRestore
  });
  function findGoalToRestore(e) {
    if (!e) {
      return null;
    }
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n?.type !== "attachment" || n.attachment.type !== "goal_status") {
        continue;
      }
      return n.attachment.met || n.attachment.failed ? null : n.attachment.condition;
    }
    return null;
  }
  function restoreGoalFromTranscript(e, t) {
    let n = findGoalToRestore(e);
    let r = n !== null ? kBo() : null;
    if (r !== null) {
      Et("goal_set", r.code);
    }
    if (n === null || r !== null) {
      t(o => o.activeGoal === undefined ? o : {
        ...o,
        activeGoal: undefined
      });
      return;
    }
    z7t(t, getSessionId(), "Stop", "", {
      type: "prompt",
      prompt: n
    });
    t(o => ({
      ...o,
      activeGoal: {
        condition: n,
        iterations: 0,
        setAt: Date.now(),
        tokensAtStart: getTotalOutputTokens()
      }
    }));
    logEvent("tengu_goal_restored_on_resume", {
      promptLength: n.length
    });
  }
  var zQo = __lazy(() => {
    at();
    ln();
    Ot();
    pZ();
    _7e();
  });
  function A0f(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n?.type !== "assistant") {
        continue;
      }
      let r = n.message.content.find(i => i.type === "tool_use" && i.name === "TodoWrite");
      if (!r || r.type !== "tool_use") {
        continue;
      }
      let o = r.input;
      if (o === null || typeof o !== "object") {
        return [];
      }
      let s = iLe().safeParse(o.todos);
      return s.success ? s.data : [];
    }
    return [];
  }
  function Z0c(e) {
    if (typeof e.resume !== "string" || e.forkSession || e.hasSessionIdFlag) {
      return false;
    }
    let t = kD(e.resume);
    if (!t) {
      return false;
    }
    switchSession(t, "resume");
    return true;
  }
  function lon(e, t) {
    if (e.fileHistorySnapshots && e.fileHistorySnapshots.length > 0) {
      fileHistoryRestoreStateFromLog(e.fileHistorySnapshots, n => {
        t(r => ({
          ...r,
          fileHistory: n
        }));
      });
    }
    if ((zQo(), __toCommonJS(VQo)).restoreGoalFromTranscript(e.messages, t), !sR() && e.messages && e.messages.length > 0) {
      let n = A0f(e.messages);
      if (n.length > 0) {
        let r = getSessionId();
        t(o => ({
          ...o,
          todos: {
            ...o.todos,
            [r]: n
          }
        }));
      }
    }
  }
  function I0f(e) {
    return;
  }
  function con(e, t) {
    if (!e && !t) {
      return;
    }
    return {
      name: e ?? "",
      color: t === "default" ? undefined : t
    };
  }
  function ZCe(e, t, n) {
    if (t) {
      return {
        agentDefinition: t,
        agentType: undefined
      };
    }
    if (!e) {
      setMainThreadAgentType(undefined);
      zBe(undefined);
      return {
        agentDefinition: undefined,
        agentType: undefined
      };
    }
    let r = n.activeAgents.find(o => o.agentType === e);
    if (!r) {
      logForDebugging(`Resumed session had agent "${e}" but it is no longer available. Using default behavior.`);
      setMainThreadAgentType(undefined);
      zBe(undefined);
      return {
        agentDefinition: undefined,
        agentType: undefined
      };
    }
    if (setMainThreadAgentType(r.agentType), zBe(r), !getMainLoopModelOverride() && r.model && r.model !== "inherit") {
      let o = parseUserSpecifiedModel(r.model);
      if (isExemptDefaultResolvingPick(o) || isModelAllowed(o)) {
        setMainLoopModelOverride(o);
      } else {
        logForDebugging(`Agent model "${r.model}" is not in the availableModels allowlist; keeping the session model`, {
          level: "warn"
        });
      }
    }
    return {
      agentDefinition: r,
      agentType: r.agentType
    };
  }
  async function P0f(e, t) {
    if (t || !e) {
      return;
    }
    let n = uF(e);
    if (n === "default" && e !== "default") {
      return;
    }
    if (n === "plan" || n === "bypassPermissions") {
      return;
    }
    if (n === "default") {
      {
        let {
          isAutoModeFromFallback: r
        } = await Promise.resolve().then(() => (xse(), Fme));
        if (r()) {
          return "default";
        }
      }
      return;
    }
    if (n === "auto") {
      let {
        isAutoModeGateEnabled: r
      } = await Promise.resolve().then(() => (S_(), UXn));
      if (!r()) {
        return;
      }
    }
    return n;
  }
  function KQo() {
    return Boolean(getMainLoopModelOverride() !== undefined || Me.ANTHROPIC_MODEL || Me.ANTHROPIC_DEFAULT_FABLE_MODEL || Me.ANTHROPIC_DEFAULT_OPUS_MODEL || Me.ANTHROPIC_DEFAULT_SONNET_MODEL || Me.ANTHROPIC_DEFAULT_HAIKU_MODEL || !usesFirstPartyModelIds());
  }
  function bXe(e, t, n, r = o => o()) {
    if (KQo()) {
      return;
    }
    let o = tIc(e, t);
    if (o.kind === "none") {
      return;
    }
    if (o.kind === "mode_dependent_setting") {
      r(() => logEvent("tengu_resume_model_restore", {
        outcome: "skipped_mode_dependent_setting",
        is_eap: false
      }));
      return;
    }
    if (o.kind === "declined") {
      r(() => logEvent("tengu_resume_model_restore", {
        outcome: "declined",
        decline_reason: o.reason == null ? undefined : o.reason,
        is_eap: cbe(o.model)
      }));
    }
    if (o.kind === "declined") {
      let s = t && normalizeModelStringForAPI(t) || "the default model";
      n?.(`Session model ${o.model} could not be restored (${O0f[o.reason]}) \u2014 using ${s} instead.`);
      return;
    }
    return o.model;
  }
  function eIc(e, t) {
    let n = tIc(e, t);
    return n.kind === "ok" ? n.model : undefined;
  }
  function D0f(e, t) {
    if (e === "opusplan") {
      return t.includes("opus") || t.includes("sonnet");
    }
    if (e === "haiku") {
      return t.includes("haiku") || t.includes("sonnet");
    }
    return false;
  }
  function tIc(e, t) {
    let n = new Set(Pni.map(getCanonicalName));
    let r = t ? parseUserSpecifiedModel(t) : undefined;
    let o = r ? normalizeModelStringForAPI(r) : undefined;
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (i?.type !== "assistant" || i.isMeta || i.message.model === "<synthetic>") {
        continue;
      }
      let a = i.message.model;
      let l = getUserSpecifiedModelSetting();
      if (isModeDependentModelSetting(l) && !cbe(a) && D0f(l, getCanonicalName(a))) {
        return {
          kind: "mode_dependent_setting"
        };
      }
      let c = !(n.vZc(getCanonicalName(a)) || cbe(a) || normalizeModelStringForAPI(a) === o) ? "unknown_family" : !isExemptDefaultResolvingPick(a) && !isModelAllowed(a) ? "not_allowed" : BCn(a) ? "retired" : undefined;
      if (c) {
        return {
          kind: "declined",
          model: a,
          reason: c
        };
      }
      if ((t && hg(t) || r !== undefined && hg(r)) && d8(a) && (normalizeModelStringForAPI(a) === o || t && getCanonicalName(parseUserSpecifiedModel(normalizeModelStringForAPI(t))) === getCanonicalName(a))) {
        return {
          kind: "ok",
          model: a + "[1m]"
        };
      }
      return {
        kind: "ok",
        model: a
      };
    }
    return {
      kind: "none"
    };
  }
  function M0f(e, t) {
    for (let n = e.length - 1; n >= 0; n--) {
      let r = e[n];
      if (r?.type === "system" && r.subtype === "model_refusal_fallback") {
        let o = normalizeModelStringForAPI(r.fallbackModel);
        let s = normalizeModelStringForAPI(t);
        return o === s || getCanonicalName(o) === getCanonicalName(s);
      }
    }
    return false;
  }
  function uon(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n?.type === "system" && n.subtype === "model_refusal_fallback") {
        n.neutralizedByFork = true;
      }
    }
  }
  function N0f(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n?.type === "system" && n.subtype === "model_refusal_fallback") {
        return n.neutralizedByFork === true ? {
          fallbackModel: n.fallbackModel
        } : undefined;
      }
    }
    return;
  }
  function Dgr(e, t) {
    logEvent("tengu_resume_model_restore", {
      outcome: e,
      is_eap: cbe(t)
    });
  }
  function X0c() {
    Promise.resolve().then(() => (x_t(), O0o)).then(e => e.fetchBootstrapData());
  }
  function SXe(e, t, n) {
    if (!M0f(e, t)) {
      setMainLoopModelOverride(t);
      X0c();
      Dgr("restored", t);
      return t;
    }
    if (n) {
      logEvent("tengu_refusal_fallback_resume_latch", {
        action: "fork_skip_restore"
      });
      Dgr("skipped_fork_fallback", t);
      return;
    }
    let r = N0f(e);
    if (r && normalizeModelStringForAPI(r.fallbackModel) === normalizeModelStringForAPI(t)) {
      logEvent("tengu_refusal_fallback_resume_latch", {
        action: "fork_neutralized_skip"
      });
      Dgr("skipped_fork_neutralized", t);
      return;
    }
    setMainLoopModelOverride(t);
    X0c();
    latchRefusalFallbackModel({
      fallbackModel: t,
      previousOverride: undefined,
      previousAppStateModel: getInitialMainLoopModel() ?? null,
      previousModelForSession: null
    });
    Dgr("restored", t);
    logEvent("tengu_refusal_fallback_resume_latch", {
      action: "relatch"
    });
    return t;
  }
  async function L0f(e, t, n, r) {
    if (!e) {
      return r;
    }
    getAgentDefinitionsWithOverrides.cache.clear?.();
    let o = await getAgentDefinitionsWithOverrides(t);
    return rebuildAgentDefinitions(o, [...o.allAgents, ...n]);
  }
  function don(e, t) {
    let n = getCurrentWorktreeSession();
    if (n) {
      saveWorktreeState(n);
      return;
    }
    if (!e) {
      if (e === null) {
        return;
      }
      if (!t || Nt() === t) {
        return;
      }
      try {
        process.chdir(t);
      } catch {
        return;
      }
      By(t);
      setOriginalCwd(Nt());
      clearMemoryFileCaches();
      cFe();
      getPlansDirectory.cache.clear?.();
      reanchorGitFileWatcher();
      getIsGit.cache.clear?.();
      vS()?.refreshGitBranch?.();
      return;
    }
    try {
      process.chdir(e.worktreePath);
    } catch {
      saveWorktreeState(null);
      return;
    }
    By(e.worktreePath);
    setOriginalCwd(Nt());
    restoreWorktreeSession(e);
    clearMemoryFileCaches();
    cFe();
    getPlansDirectory.cache.clear?.();
    reanchorGitFileWatcher();
    vS()?.refreshGitBranch?.();
  }
  function nIc(e) {
    let t = getCurrentWorktreeSession();
    if (!t) {
      return;
    }
    if (restoreWorktreeSession(null), clearMemoryFileCaches(), cFe(), getPlansDirectory.cache.clear?.(), t.worktreePath === e) {
      return;
    }
    try {
      process.chdir(t.originalCwd);
    } catch {
      return;
    }
    By(t.originalCwd);
    setOriginalCwd(Nt());
    reanchorGitFileWatcher();
    vS()?.refreshGitBranch?.();
  }
  async function Mgr(e, t, n) {
    let r;
    if (r = n.modeApi?.matchSessionMode(e.mode), r) {
      e.messages.push(wc(r, "warning"));
    }
    if (!t.forkSession) {
      let g = t.sessionIdOverride ?? e.sessionId;
      if (g) {
        switchSession(g, "resume", t.transcriptPath ? Q0c.dirname(t.transcriptPath) : null);
        await renameRecordingForSession();
        await resetSessionFilePointer();
        Jqn(g);
      }
    } else if (e.contentReplacements?.length) {
      await recordContentReplacement(e.contentReplacements);
    }
    if (restoreSessionMetadata(t.forkSession ? {
      ...e,
      worktreeSession: undefined,
      relocatedCwd: undefined,
      bridgeSessionId: undefined,
      bridgeLastSeq: undefined,
      bridgeDialogKinds: undefined
    } : e), !t.forkSession) {
      don(e.worktreeSession);
      adoptResumedSessionFile();
    }
    let {
      agentDefinition: o,
      agentType: s
    } = ZCe(e.agentSetting, n.mainThreadAgentDefinition, n.agentDefinitions);
    let i = await P0f(e.permissionMode, n.permissionModeCliSet);
    if (t.forkSession) {
      uon(e.messages);
    }
    let a = bXe(e.messages, n.initialState.mainLoopModel, g => e.messages.push(wc(g, "warning")));
    let l = a ? SXe(e.messages, a, t.forkSession) : undefined;
    let c;
    if (i) {
      let {
        transitionPermissionMode: g
      } = await Promise.resolve().then(() => (S_(), UXn));
      let y = n.initialState.toolPermissionContext;
      try {
        c = {
          ...g(y.mode, i, y),
          mode: i
        };
      } catch (_) {
        logForDebugging(`[sessionRestore] transitionPermissionMode rejected restored mode '${i}': ${_}`);
      }
    }
    saveMode(n.modeApi?.isCoordinatorMode() ? "coordinator" : "normal");
    let u = t.includeAttribution ? I0f(e) : undefined;
    let d = con(e.agentName, e.agentColor);
    let p = n.initialState.standaloneAgentContext ? {
      ...d,
      ...n.initialState.standaloneAgentContext
    } : d;
    GY(p?.name);
    let m = await L0f(!!r, n.currentCwd, n.cliAgents, n.agentDefinitions);
    let f = n.initialState.initialMessage;
    if (Me.CLAUDE_CODE_RESUME_INTERRUPTED_TURN && e.turnInterruptionState?.kind === "interrupted_prompt" && yU(e.turnInterruptionState.message.origin)) {
      logForDebugging("[sessionRestore] Auto-resuming interrupted turn for bg crash-respawn");
      removeInterruptedMessage(e.messages, e.turnInterruptionState.message);
      f = {
        message: e.turnInterruptionState.message
      };
    }
    let h = n.initialState;
    (zQo(), __toCommonJS(VQo)).restoreGoalFromTranscript(e.messages, g => {
      h = g(h);
    });
    return {
      messages: e.messages.filter(g => !(g.type === "system" && g.subtype === "bridge_status")),
      fileHistorySnapshots: e.fileHistorySnapshots,
      contentReplacements: e.contentReplacements,
      agentName: e.agentName,
      agentColor: e.agentColor === "default" ? undefined : e.agentColor,
      restoredAgentDef: o,
      initialState: {
        ...h,
        initialMessage: f,
        ...(!t.forkSession && e.bridgeSessionId && !(h.replBridgeEnabled && !h.replBridgeOutboundOnly) && {
          replBridgeEnabled: true,
          replBridgeOutboundOnly: false
        }),
        ...{},
        ...(s && {
          agent: s
        }),
        ...(l && {
          mainLoopModel: l
        }),
        ...(u && {
          attribution: u
        }),
        ...(p && {
          standaloneAgentContext: p
        }),
        ...(c && {
          toolPermissionContext: c
        }),
        agentDefinitions: m
      }
    };
  }
  var Q0c;
  var O0f;
  var TXe = __lazy(() => {
    at();
    x$();
    MBe();
    xJt();
    C$();
    Ot();
    kS();
    D_();
    aon();
    bx();
    HG();
    yd();
    VT();
    Pme();
    vo();
    je();
    pr();
    Jq();
    FP();
    na();
    S$();
    Ogr();
    ro();
    zN();
    nst();
    AI();
    Eo();
    YN();
    Ds();
    HT();
    xx();
    U1();
    fa();
    YI();
    cXn();
    GL();
    iP();
    Q0c = require("path");
    O0f = {
      unknown_family: "not a model this version of Claude Code recognizes",
      not_allowed: "not allowed by this account's model settings",
      retired: "retired"
    };
  });
  function F0f(e) {
    return e.type === "system" && e.subtype === "model_refusal_fallback";
  }
  function U0f(e, t) {
    if (e == null) {
      return false;
    }
    let n = normalizeModelStringForAPI(e);
    let r = normalizeModelStringForAPI(t);
    return n === r || getCanonicalName(n) === getCanonicalName(r);
  }
  function rIc(e) {
    let t = e.slicedMessages.filter(F0f);
    let n = t.at(-1);
    if (!n) {
      return;
    }
    let r = n.fallbackModel;
    let o = (() => {
      if (!e.firstParty) {
        return {
          action: "keep",
          reason: "not_first_party"
        };
      }
      if (!U0f(e.currentOverride, r)) {
        return {
          action: "keep",
          reason: "writer_mismatch"
        };
      }
      let s = eIc(e.keptMessages, e.initialModel);
      if (s != null) {
        return {
          action: "restore",
          value: s,
          restoredFrom: "transcript"
        };
      }
      if (e.initialModel != null) {
        return {
          action: "restore",
          value: e.initialModel,
          restoredFrom: "initial_model"
        };
      }
      return {
        action: "restore",
        value: null,
        restoredFrom: "settings_fallthrough"
      };
    })();
    return {
      bannersSliced: t.length,
      model: o,
      lastSlicedFallbackModel: r
    };
  }
  var oIc = __lazy(() => {
    Eo();
    TXe();
  });
  function Ngr(e, t) {
    if (t === undefined) {
      return;
    }
    for (let n of e) {
      if (n.type === "user" && n.uuid === t) {
        n.verifiedSlackHumanTurn = true;
      }
    }
  }
  function B0f() {
    gracefulShutdownSync(0);
  }
  async function Lgr(e) {
    let {
      helpers: t,
      queryGuard: n,
      isExternalLoading: r = false,
      commands: o,
      onInputChange: s,
      setPastedContents: i,
      setToolJSX: a,
      getToolUseContext: l,
      messages: c,
      mainLoopModel: u,
      ideSelection: d,
      setUserInputOnProcessing: p,
      setAbortController: m,
      onQuery: f,
      getAppState: h,
      setAppState: g,
      onBeforeQuery: y,
      canUseTool: _,
      queuedCommands: b,
      uuid: S,
      skipSlashCommands: E
    } = e;
    let {
      setCursorOffset: C,
      clearBuffer: x,
      resetHistory: A
    } = t;
    if (b?.length) {
      ZJt();
      await sIc({
        inputSource: "queued",
        queuedCommands: b,
        messages: c,
        mainLoopModel: u,
        ideSelection: d,
        querySource: e.querySource,
        commands: o,
        queryGuard: n,
        setToolJSX: a,
        getToolUseContext: l,
        setUserInputOnProcessing: p,
        setAbortController: m,
        onQuery: f,
        getAppState: h,
        setAppState: g,
        onBeforeQuery: y,
        resetHistory: A,
        canUseTool: _,
        onInputChange: s,
        deferSlashToEngine: e.deferSlashToEngine
      });
      return;
    }
    let k = e.input ?? "";
    let I = e.mode ?? "prompt";
    let O = e.pastedContents ?? {};
    let M = new Set(h1(k).map(j => j.id));
    let L = d_u(O, j => j.type !== "image" || M.vZc(j.id));
    let P = Object.values(L).some(D7e);
    if (k.trim() === "") {
      return;
    }
    if (I !== "bash" && !E && Kur.includes(k.trim())) {
      if (o.find(z => z.name === "exit")) {
        Lgr({
          ...e,
          input: "/exit"
        });
      } else {
        B0f();
      }
      return;
    }
    G0c();
    let F = nX(k, L);
    let H = h1(k).filter(j => L[j.id]?.type === "text");
    let U = H.length;
    let N = H.reduce((j, z) => j + (L[z.id]?.content.length ?? 0), 0);
    if (logEvent("tengu_paste_text", {
      pastedTextCount: U,
      pastedTextBytes: N
    }), !E && F.trim().startsWith("/")) {
      let j = F.trim();
      let {
        name: z,
        args: V
      } = iTt(j);
      let K = o.find(J => ALe(J, V) && isCommandEnabled(J) && (J.name === z || J.aliases?.includes(z) || getCommandName(J) === z));
      if (K && K.type === "local-jsx" && (n.isActive || r)) {
        logEvent("tengu_immediate_command_executed", {
          commandName: K.name
        });
        s("");
        C(0);
        i({});
        x();
        let J = l(c, [], createAbortController(), u);
        let Q = false;
        let Z = (ee, re) => {
          if (Q = true, a({
            jsx: null,
            shouldHidePromptInput: false,
            clearLocalJSX: true
          }), ee && re?.display !== "skip" && e.addNotification) {
            e.addNotification({
              key: `immediate-${K.name}`,
              kind: "feedback",
              text: ee,
              priority: "immediate"
            });
          }
          if (re?.nextInput) {
            if (re.submitNextInput) {
              __({
                agentId: mainAgentId(),
                value: re.nextInput,
                mode: "prompt",
                origin: {
                  kind: "auto-continuation"
                }
              });
            } else {
              s(re.nextInput);
            }
          }
        };
        let oe = await (await K.load()).call(Z, {
          ...J,
          isMidTurn: true
        }, V, z);
        if (oe && !Q) {
          a({
            jsx: oe,
            shouldHidePromptInput: false,
            isLocalJSXCommand: true,
            isImmediate: true
          });
        }
        return;
      }
    }
    if (n.isActive || r) {
      if (I !== "prompt" && I !== "bash") {
        Ae("prompt_queued", "mode_not_queueable");
        return;
      }
      if (e.hasInterruptibleToolInProgress) {
        logForDebugging(`[interrupt] Aborting current turn: streamMode=${e.streamMode}`);
        let j = aO(u, h().effortValue);
        logEvent("tengu_cancel", {
          source: "interrupt_on_submit",
          streamMode: e.streamMode == null ? undefined : e.streamMode,
          ...(j && {
            effort_level: j
          })
        });
        e.abortController?.abort(userAbortReason("interrupt"));
      }
      __({
        agentId: mainAgentId(),
        value: F.trim(),
        preExpansionValue: k.trim(),
        mode: I,
        pastedContents: P ? L : undefined,
        skipSlashCommands: E,
        suppressWorkflowKeyword: e.suppressWorkflowKeyword,
        inputSource: e.inputSource,
        uuid: S,
        origin: {
          kind: "human"
        }
      });
      Pe("prompt_queued");
      s("");
      C(0);
      i({});
      A();
      x();
      return;
    }
    ZJt();
    let W = {
      value: F,
      preExpansionValue: k,
      mode: I,
      pastedContents: P ? L : undefined,
      skipSlashCommands: E,
      suppressWorkflowKeyword: e.suppressWorkflowKeyword,
      uuid: S,
      agentId: mainAgentId(),
      origin: {
        kind: "human"
      }
    };
    Pe("prompt_submit");
    await sIc({
      inputSource: e.inputSource ?? "typed",
      queuedCommands: [W],
      messages: c,
      mainLoopModel: u,
      ideSelection: d,
      querySource: e.querySource,
      commands: o,
      queryGuard: n,
      setToolJSX: a,
      getToolUseContext: l,
      setUserInputOnProcessing: p,
      setAbortController: m,
      onQuery: f,
      getAppState: h,
      setAppState: g,
      onBeforeQuery: y,
      resetHistory: A,
      canUseTool: _,
      onInputChange: s,
      deferSlashToEngine: e.deferSlashToEngine
    });
  }
  async function sIc(e) {
    let {
      messages: t,
      mainLoopModel: n,
      ideSelection: r,
      querySource: o,
      queryGuard: s,
      setToolJSX: i,
      getToolUseContext: a,
      setUserInputOnProcessing: l,
      setAbortController: c,
      onQuery: u,
      getAppState: d,
      setAppState: p,
      onBeforeQuery: m,
      resetHistory: f,
      canUseTool: h,
      queuedCommands: g,
      inputSource: y
    } = e;
    let _ = createAbortController();
    c(_);
    function b() {
      return {
        ...a(t, [], _, n),
        deferSlashToEngine: e.deferSlashToEngine
      };
    }
    try {
      s.reserve();
      Qp("query_process_user_input_start");
      let S = [];
      let E = false;
      let C;
      let x;
      let A;
      let k;
      let I;
      let O;
      let M = g ?? [];
      let L = M[0]?.workload;
      let P = L !== undefined && M.every(N => N.workload === L) ? L : undefined;
      let F = Math.max(0, M.findIndex(N => N.mode !== "task-notification" && yU(N.origin) && !N.isMeta));
      let H = M[F]?.value;
      let U = typeof H === "string" ? H : H ? Tl(H, `
`) : "";
      await ZCn(P, () => iqn(U, async () => {
        let N = b();
        for (let W = 0; W < M.length; W++) {
          let j = M[W];
          let z = W === F;
          let V = j.origin ?? (j.mode === "task-notification" ? {
            kind: "task-notification"
          } : undefined);
          let K = j.isMeta || !BG(V) ? "system" : j.inputSource ?? y;
          let J = await BRt({
            input: j.value,
            preExpansionInput: j.preExpansionValue,
            promptSource: K,
            suppressWorkflowKeyword: j.suppressWorkflowKeyword,
            mode: j.mode,
            setToolJSX: i,
            context: N,
            pastedContents: j.pastedContents,
            messages: t,
            setUserInputOnProcessing: z ? l : undefined,
            isAlreadyProcessing: !z,
            querySource: o,
            canUseTool: h,
            uuid: j.uuid,
            ideSelection: z ? r : undefined,
            skipSlashCommands: j.skipSlashCommands,
            bridgeOrigin: j.bridgeOrigin,
            modelScheduledOrigin: j.modelScheduledOrigin,
            isMeta: j.isMeta,
            skipAttachments: !z,
            origin: V
          });
          if (V) {
            wmr(J.messages, V);
          }
          if (j.priority === "later") {
            for (let Q of J.messages) {
              if (Q.type === "user") {
                Q.queuePriority = "later";
              }
            }
          }
          if (j.verifiedSlackHumanTurn) {
            Ngr(J.messages, j.uuid);
          }
          if (S.push(...J.messages), J.engineDeferredSlash) {
            O = J.engineDeferredSlash;
          }
          if (z) {
            E = J.shouldQuery;
            C = J.allowedTools;
            x = J.model;
            A = J.effort;
            k = J.nextInput;
            I = J.submitNextInput;
          }
        }
        if (Qp("query_process_user_input_end"), fileHistoryEnabled()) {
          Qp("query_file_history_snapshot_start");
          S.filter(replayableUserMessagesFilter).forEach(W => {
            fileHistoryMakeSnapshot(() => d().fileHistory, j => p(z => {
              let V = reduceFileHistoryState(z.fileHistory, j);
              if (V === z.fileHistory) {
                return z;
              }
              return {
                ...z,
                fileHistory: V
              };
            }), W.uuid);
          });
          Qp("query_file_history_snapshot_end");
        }
        if (S.length) {
          f();
          i({
            jsx: null,
            shouldHidePromptInput: false,
            clearLocalJSX: true
          });
          let W = M[F];
          let j = W?.mode ?? "prompt";
          let z = W && typeof W.value === "string" ? W.value : undefined;
          let V = j === "prompt" || j === "bash" && E;
          let K = M.some(Q => Q.stopHookActive) ? true : undefined;
          let J = W?.clientPlatform;
          await u(S, _, E, C ?? [], x ? resolveSkillModelOverride(x, n) : n, V ? m : undefined, z, A, K, J, N.options?.activeSkill, O);
        } else {
          s.cancelReservation();
          i({
            jsx: null,
            shouldHidePromptInput: false,
            clearLocalJSX: true
          });
          f();
          c(null);
          Vde();
        }
        if (k) {
          if (I) {
            __({
              agentId: mainAgentId(),
              value: k,
              mode: "prompt",
              origin: {
                kind: "auto-continuation"
              }
            });
          } else {
            e.onInputChange(k);
          }
        }
      }));
    } finally {
      s.cancelReservation();
      l(undefined);
      Vde();
    }
  }
  var iIc = __lazy(() => {
    at();
    ln();
    Ot();
    Bm();
    rhr();
    gq();
    Kp();
    je();
    Fp();
    Eve();
    Jq();
    GQo();
    lm();
    S$();
    Rf();
    ro();
    Eo();
    DLe();
    Ufr();
    y7e();
    GG();
    xqe();
  });
  function aIc(e) {
    if (e.skipSlashCommands && e.origin?.kind === "peer") {
      return false;
    }
    if (typeof e.value === "string") {
      return e.value.trim().startsWith("/");
    }
    for (let t of e.value) {
      if (t.type === "text") {
        return t.text.trim().startsWith("/");
      }
    }
    return false;
  }
  function lIc({
    executeInput: e
  }) {
    let t = IJo(GI);
    if (!t) {
      return {
        processed: false
      };
    }
    if (aIc(t) || t.mode === "bash") {
      let s = [i5e(i => i === t)];
      $mo(s);
      e(s).finally(() => Hmo(s));
      return {
        processed: true
      };
    }
    let n = t.mode;
    let r = HDe(o => GI(o) && !aIc(o) && o.mode === n);
    if (r.length === 0) {
      return {
        processed: false
      };
    }
    $mo(r);
    e(r).finally(() => Hmo(r));
    return {
      processed: true
    };
  }
  var cIc = __lazy(() => {
    Qfr();
    Rf();
    Wpt();
  });
  function uIc({
    executeQueuedInput: e,
    hasActiveLocalJsxUI: t,
    queryGuard: n
  }) {
    let r = pon.useSyncExternalStore(n.subscribe, n.getSnapshot);
    let o = pon.useSyncExternalStore(LTe, Gpt);
    pon.useEffect(() => {
      if (r || n.isActive) {
        return;
      }
      if (t) {
        return;
      }
      if (o.length === 0) {
        return;
      }
      lIc({
        executeInput: e
      });
    }, [o, r, e, t, n]);
  }
  var pon;
  var dIc = __lazy(() => {
    Rf();
    cIc();
    pon = __toESM(ot(), 1);
  });
  function pIc(e, t) {
    if (!t || e.length === 0) {
      return [];
    }
    let n = new Map();
    let r = new Map();
    for (let o of e) {
      if (!o.agentId || o.mode !== "task-notification") {
        continue;
      }
      let s = n.get(o.agentId);
      if (!s) {
        let a = t[o.agentId];
        if (!j$(a) || !gT(a)) {
          continue;
        }
        s = a;
        n.set(o.agentId, s);
      }
      let i = r.get(o.agentId) ?? [];
      i.push(o);
      r.set(o.agentId, i);
    }
    return Array.from(r, ([o, s]) => ({
      agentId: o,
      prompt: s.map(i => typeof i.value === "string" ? i.value : "").filter(Boolean).join(`

`),
      consumedCommands: s
    }));
  }
  var mIc = __lazy(() => {
    ry();
  });
  function hIc(e) {
    let t = useClock();
    let n = fxt.useSyncExternalStore(LTe, Gpt);
    let r = bt(s => s.tasks);
    let o = fxt.useRef(new Set());
    fxt.useEffect(() => {
      if (n.length === 0) {
        return;
      }
      let s = pIc(n, r);
      if (s.length === 0) {
        return;
      }
      let i = [];
      let a = [];
      for (let c of s) {
        if (o.current.vZc(c.agentId)) {
          continue;
        }
        o.current.add(c.agentId);
        i.push(...c.consumedCommands);
        a.push(c);
      }
      if (i.length > 0) {
        hba(i);
      }
      let l = o.current;
      for (let c of a) {
        let u = t.setTimeout(() => $0f({
          agentId: c.agentId,
          inFlight: l
        }), 60000);
        e(c.agentId, c.prompt).catch(d => {
          if (d instanceof JU) {
            logForDebugging(`[wakeRouter] resume state error for ${c.agentId}: ${he(d)}`);
          } else {
            Oe(d);
          }
        }).finally(() => {
          u();
          l.delete(c.agentId);
        });
      }
    }, [n, r, e, t]);
  }
  function $0f(e) {
    logForDebugging(`[wakeRouter] dispatch for ${e.agentId} exceeded ${60000}ms; releasing inFlight reservation`, {
      level: "warn"
    });
    e.inFlight.delete(e.agentId);
  }
  var fxt;
  var gIc = __lazy(() => {
    et();
    ho();
    GJt();
    je();
    dt();
    Rn();
    Rf();
    mIc();
    fxt = __toESM(ot(), 1);
  });
  function yIc({
    taskRegistry: e,
    getToolUseContext: t,
    canUseTool: n,
    addNotification: r
  }) {
    let o = Fgr.useCallback(async s => {
      let i = m5n(s, e);
      if (i.length === 0) {
        return;
      }
      let [a, ...l] = i;
      for (let c of l) {
        C8e(s, c.text, e, {
          origin: c.origin,
          isMeta: c.isMeta
        });
      }
      try {
        await lfe({
          agentId: s,
          prompt: a.text,
          promptOrigin: a.origin,
          promptIsMeta: a.isMeta,
          toolUseContext: t(),
          canUseTool: n
        });
      } catch (c) {
        throw C8e(s, a.text, e, {
          origin: a.origin,
          isMeta: a.isMeta
        }), c;
      }
    }, [e, t, n]);
    Fgr.useEffect(() => s5n.subscribe(s => {
      o(s).catch(i => {
        if (i instanceof JU) {
          return;
        }
        Oe(i);
        r({
          key: `stranded-resume-failed-${s}`,
          kind: "warning",
          text: `Failed to deliver queued message to agent: ${he(i)}`,
          color: "error",
          priority: "low"
        });
      });
    }), [o, r]);
  }
  var Fgr;
  var _Ic = __lazy(() => {
    ry();
    dwo();
    GJt();
    dt();
    Rn();
    Fgr = __toESM(ot(), 1);
  });
  function bIc({
    isLoading: e,
    onSubmitMessage: t
  }) {
    let n = fVa();
    let r = KBe.useMemo(() => n.subscribe.bind(n), [n]);
    let o = KBe.useCallback(() => n.revision, [n]);
    let s = KBe.useSyncExternalStore(r, o);
    KBe.useEffect(() => {
      if (e) {
        return;
      }
      let i = n.poll();
      if (i) {
        t(i.content);
      }
    }, [e, s, n, t]);
  }
  var KBe;
  var SIc = __lazy(() => {
    jwo();
    KBe = __toESM(ot(), 1);
  });
  function Ugr(e, t) {
    switch (t.type) {
      case "append":
        return t.messages.length === 0 ? e : [...e, ...t.messages];
      case "replace-all":
        return t.messages;
      case "remove-by-uuid":
        {
          let n = e.findIndex(o => o.uuid === t.uuid);
          if (n === -1) {
            return e;
          }
          let r = e.slice();
          r.splice(n, 1);
          return r;
        }
      case "trim-to-last-boundary-and-append":
        return [...kg(e, {
          includeSnipped: t.includeSnipped,
          includeFolded: true
        }), t.message];
      case "replace-last-ephemeral-progress":
        {
          let n = e.at(-1);
          if (n?.type === "progress" && n.parentToolUseID === t.message.parentToolUseID && n.data.type === t.message.data.type) {
            return e.with(e.length - 1, t.message);
          }
          return [...e, t.message];
        }
      case "append-or-move-by-uuid":
        return aQn(e, t.message);
      case "trim-to-last-boundary-excluding-and-append":
        return [...kg(e, {
          includeSnipped: t.includeSnipped,
          includeFolded: true
        }).filter(n => !t.excludeUuids.vZc(n.uuid)), t.message];
      case "update":
        return t.updater(e);
    }
  }
  var YQo = __lazy(() => {
    ro();
  });
  function mon(e, t) {
    if (e && t && t.length > 0) {
      return gyp([...e, ...t], "name");
    }
    return e || [];
  }
  function EIc(e, t) {
    return TIc.useMemo(() => mon(e, t), [e, t]);
  }
  var TIc;
  var vIc = __lazy(() => {
    TIc = __toESM(ot(), 1);
  });
  var kIc = {};