    if (Object.values(u).some(O => O.type !== "sdk")) {
      await G5({
        hasDynamicMcpConfig: true
      });
    }
    let {
      allowed: d,
      blocked: p
    } = filterMcpServersByPolicy(u);
    let m = {};
    for (let O of p) {
      m[O] = "Blocked by enterprise policy (allowedMcpServers/deniedMcpServers)";
    }
    let f = s === "plugin_install_diff" || s === "plugins_sync" || s === "reload_plugins";
    let h = d;
    if (rsn() && !f) {
      h = d_u(d, O => O.type === "sdk");
      for (let O of Object.keys(d)) {
        if (!Object.hasOwn(h, O)) {
          m[O] = "Ignored in hermetic mode (not declared in user config)";
        }
      }
    }
    let g = {};
    let y = {};
    for (let [O, M] of Object.entries(h)) {
      if (M.type === "sdk") {
        g[O] = M;
      } else {
        y[O] = M;
      }
    }
    let _ = new Set(Object.keys(t.configs));
    let b = new Set(Object.keys(g));
    let S = [];
    let E = [];
    let C = {
      ...t.configs
    };
    let x = [...t.clients];
    let A = [...t.tools];
    let k = [...t.commands];
    for (let O of _) {
      if (!b.vZc(O)) {
        let M = x.find(P => P.name === O);
        if (M && M.type === "connected") {
          await M.cleanup();
        }
        x = x.filter(P => P.name !== O);
        let L = `mcp__${O}__`;
        A = A.filter(P => !P.name.startsWith(L));
        k = k.filter(P => !u3(P, O));
        delete C[O];
        E.push(O);
      }
    }
    for (let [O, M] of Object.entries(g)) {
      if (!_.vZc(O)) {
        C[O] = M;
        let L = {
          type: "pending",
          name: O,
          config: {
            ...M,
            scope: "dynamic"
          }
        };
        x = [...x, L];
        S.push(O);
      }
    }
    let I = await reconcileMcpServers(y, n, r, o, s, i, a);
    return {
      response: {
        added: [...S, ...I.response.added],
        removed: [...E, ...I.response.removed],
        errors: {
          ...c,
          ...m,
          ...I.response.errors
        }
      },
      newSdkState: {
        configs: C,
        clients: x,
        tools: A,
        commands: k
      },
      newDynamicState: I.newState,
      sdkServersChanged: S.length > 0 || E.length > 0,
      deferredSettle: I.deferredSettle
    };
  }
  async function reconcileMcpServers(e, t, n, r, o = "unknown", s = false, i = false) {
    let a = new Set(Object.keys(t.configs));
    let l = new Set(Object.keys(e));
    let c = [...a].filter(W => !l.vZc(W));
    let u = [...l].filter(W => !a.vZc(W));
    let p = [...a].filter(W => l.vZc(W)).filter(W => {
      let j = t.configs[W];
      let z = e[W];
      if (!j || !z) {
        return true;
      }
      let V = toScopedConfig(z);
      if (!V6e(j, V)) {
        dn(W, `reconcileMcpServers: config changed, will replace (caller=${o})`);
        return true;
      }
      return false;
    });
    logEvent("tengu_mcp_reconcile", {
      caller: o,
      desiredCount: l.size,
      currentCount: a.size,
      toRemoveCount: c.length,
      toAddCount: u.length,
      toReplaceCount: p.length
    });
    let m = [];
    let f = [];
    let h = {};
    let g = [...t.clients];
    let y = [...t.tools];
    for (let W of [...c, ...p]) {
      let j = g.find(K => K.name === W) ?? r?.().mcp.clients.find(K => K.name === W);
      let z = t.configs[W];
      if (z) {
        if (j?.type === "connected") {
          try {
            await j.cleanup();
          } catch (K) {
            logForDebugging(`MCP client cleanup failed for ${W}: ${K}`, {
              level: "error"
            });
          }
        }
        await Ow(W, z);
      }
      let V = `mcp__${W}__`;
      if (y = y.filter(K => !K.name.startsWith(V)), g = g.filter(K => K.name !== W), c.includes(W)) {
        m.push(W);
      }
    }
    let _ = [...u, ...p];
    let b = [tQ, fQ].some(W => y.some(j => bl(j, W.name)) || (r?.().mcp.tools ?? []).some(j => bl(j, W.name)));
    let S = async W => {
      let j = e[W];
      if (!j) {
        return null;
      }
      if (j.type === "sdk") {
        return {
          name: W,
          added: true,
          client: null,
          tools: [],
          error: null,
          fetched: null
        };
      }
      let z = toScopedConfig(j);
      try {
        let V = await kM(W, z);
        let K = [];
        let J = null;
        if (V.type === "connected") {
          if (K = await AM(V), V.capabilities?.resources && !b) {
            b = true;
            K = [...K, tQ, fQ, _Ee];
          }
          try {
            let [Z, ne] = await Promise.all([yQ(V), n3(V)]);
            J = {
              name: W,
              cmds: Z,
              res: ne
            };
          } catch (Z) {
            Oe(Z);
          }
        }
        let Q = V.type === "failed" ? V.error || "Connection failed" : null;
        return {
          name: W,
          added: true,
          client: V,
          tools: K,
          error: Q,
          fetched: J
        };
      } catch (V) {
        let K = sr(V);
        Oe(K);
        return {
          name: W,
          added: false,
          client: null,
          tools: [],
          error: K.message,
          fetched: null
        };
      }
    };
    let E = W => {
      let j = e[W];
      return !j || B5t(toScopedConfig(j));
    };
    let x = s ? new Map() : await (() => Promise.all([uV(_.filter(E), S, {
      concurrency: ght()
    }), uV(_.filter(W => !E(W)), S, {
      concurrency: PGn()
    })]).then(([W, j]) => new Map([...W, ...j].filter(z => z !== null).map(z => [z.name, z]))))();
    let A = s ? _.map(W => ({
      type: "pending",
      name: W,
      config: toScopedConfig(e[W])
    })) : [];
    if (g.push(...A), s) {
      f.push(..._);
    }
    let k = [...A];
    let I = [];
    let O = [];
    for (let W of _) {
      let j = x.get(W);
      if (!j) {
        continue;
      }
      if (j.client) {
        g.push(j.client);
        k.push(j.client);
      }
      if (y.push(...j.tools), I.push(...j.tools), j.error) {
        h[j.name] = j.error;
      }
      if (j.added) {
        f.push(j.name);
      }
      if (j.fetched) {
        O.push(j.fetched);
      }
    }
    let M = {};
    for (let W of l) {
      let j = e[W];
      if (j) {
        M[W] = toScopedConfig(j);
      }
    }
    let {
      allow: L,
      deny: P,
      ask: F
    } = i ? K1r(e) : {
      allow: [],
      deny: [],
      ask: []
    };
    let H = {
      clients: g,
      tools: y,
      configs: M
    };
    let U = new Set([...c, ...p, ...k.map(W => W.name)]);
    n(W => {
      let j = W.mcp.tools.filter(ee => {
        for (let re of U) {
          if (ee.name.startsWith(`mcp__${re}__`)) {
            return false;
          }
        }
        return true;
      });
      let z = W.mcp.clients.filter(ee => !U.vZc(ee.name));
      let V = W.mcp.commands.filter(ee => {
        for (let re of U) {
          if (u3(ee, re)) {
            return false;
          }
        }
        return true;
      });
      let K = W.toolPermissionContext;
      let J = (ee, re) => {
        let se = ee.mcpServerPolicy ?? [];
        if (re.length === se.length && re.every((ae, de) => ae === se[de])) {
          return ee;
        }
        if (re.length === 0) {
          let {
            mcpServerPolicy: ae,
            ...de
          } = ee;
          return de;
        }
        return {
          ...ee,
          mcpServerPolicy: re
        };
      };
      let Q = i ? J(K.alwaysAllowRules, L) : K.alwaysAllowRules;
      let Z = i ? J(K.alwaysDenyRules, P) : K.alwaysDenyRules;
      let ne = i ? J(K.alwaysAskRules, F) : K.alwaysAskRules;
      let oe = Q === K.alwaysAllowRules && Z === K.alwaysDenyRules && ne === K.alwaysAskRules ? K : {
        ...K,
        alwaysAllowRules: Q,
        alwaysDenyRules: Z,
        alwaysAskRules: ne
      };
      if (U.size === 0 && oe === K) {
        return W;
      }
      return {
        ...W,
        mcp: {
          ...W.mcp,
          tools: [...j, ...I],
          clients: [...z, ...k],
          commands: gyp([...V, ...O.flatMap(ee => ee.cmds)], "name"),
          resources: {
            ...Nwm(W.mcp.resources, [...U]),
            ...Object.fromEntries(O.map(ee => [ee.name, ee.res]))
          }
        },
        toolPermissionContext: oe
      };
    });
    let N;
    if (s && _.length > 0) {
      let W = () => {};
      N = new Promise(Z => {
        W = Z;
      });
      let j = [];
      let z = [];
      let V = Object.fromEntries(_.map(Z => [Z, toScopedConfig(e[Z])]));
      let K = {
        getClients: () => r?.().mcp.clients ?? [],
        applyMcpUpdate: Z => n(ne => ({
          ...ne,
          mcp: Z(ne.mcp)
        }))
      };
      let J = async Z => {
        let ne = await S(Z);
        let oe = V[Z];
        let ee = ne?.client ?? {
          type: "failed",
          name: Z,
          config: oe,
          error: ne?.error ?? "Connection failed"
        };
        if (X_r(K, {
          client: ee,
          tools: ne?.tools ?? [],
          commands: ne?.fetched?.cmds ?? []
        }), ne?.fetched) {
          let re = ne.fetched.res;
          K.applyMcpUpdate(se => {
            let ae = se.clients.find(de => de.name === Z);
            if (!ae || !V6e(ae.config, oe)) {
              return se;
            }
            return {
              ...se,
              resources: {
                ...se.resources,
                [Z]: re
              }
            };
          });
        }
        j.push(ee);
        z.push(...(ne?.tools ?? []));
      };
      let Q = () => {
        Promise.all([uV(_.filter(E), J, {
          concurrency: ght()
        }), uV(_.filter(Z => !E(Z)), J, {
          concurrency: PGn()
        })]).catch(Z => {
          Oe(Z);
          let ne = new Set(_);
          K.applyMcpUpdate(oe => ({
            ...oe,
            clients: oe.clients.map(ee => ee.type === "pending" && ne.vZc(ee.name) && V6e(ee.config, V[ee.name]) ? {
              type: "failed",
              name: ee.name,
              config: ee.config,
              error: he(Z)
            } : ee)
          }));
        }).finally(() => {
          W({
            clients: j,
            tools: z
          });
          Wts(V, K).catch(Z => Oe(Z));
        });
      };
      setImmediate(Q);
    }
    return {
      response: {
        added: f,
        removed: m,
        errors: h
      },
      newState: H,
      deferredSettle: N
    };
  }
  function mergeMcpClientLists(...e) {
    return gyp(e.flat(), "name");
  }
  function J6c(e, t) {
    if (e === null) {
      return t !== undefined && wce() ? {
        type: "adaptive",
        display: t
      } : undefined;
    }
    if (e === 0) {
      return {
        type: "disabled"
      };
    }
    return {
      type: "enabled",
      budgetTokens: e,
      display: t
    };
  }
  function J4f(e) {
    let t = e instanceof Ho;
    let n = t ? $$n(e) : Ynr(e);
    let r = t && typeof e.status === "number" ? e.status : undefined;
    let o = e instanceof Error && e.cause !== undefined ? Ynr(e.cause) : undefined;
    return {
      error_name: n,
      api_error_status: r,
      cause_name: o
    };
  }
  var WXe;
  var qXe;
  var jhe;
  var Kx;
  var q6c;
  var u2e;
  var L4f;
  var F4f;
  var W6c;
  var U4f;
  var B4f;
  var G6c = `<system-reminder>
You are running in non-interactive mode and cannot return a response to the user until your team is shut down.

You MUST shut down your team before preparing your final response:
1. Use requestShutdown to ask each team member to shut down gracefully
2. Wait for shutdown approvals
3. Use the cleanup operation to clean up the team
4. Only then provide your final response to the user

The user cannot receive your response until the team is completely shut down.
</system-reminder>

Shut down your team and prepare your final response for the user.`;
  var Isn;
  var gbr;
  var PARKED_PERMISSION_ANSWER_WAIT_MS;
  var E8c = __lazy(() => {
    at();
    l5o();
    xGc();
    y7t();
    sns();
    z8e();
    vns();
    dw();
    wns();
    D5c();
    Bm();
    F5c();
    jM();
    fon();
    Ot();
    B_();
    $n();
    dGo();
    Ox();
    vO();
    W7e();
    eKe();
    CN();
    je();
    Zm();
    ci();
    kS();
    $ve();
    Rf();
    Wpt();
    Q_r();
    B5c();
    xRt();
    Rn();
    OD();
    yXt();
    Pme();
    qKe();
    MTt();
    Kf();
    Zze();
    n4n();
    ypt();
    mWt();
    LX();
    q5c();
    qI();
    ku();
    mSt();
    Zes();
    M1();
    W5c();
    K5c();
    ror();
    lm();
    hd();
    J5c();
    vo();
    mts();
    GYo();
    q$();
    Kc();
    Ire();
    yse();
    Qfr();
    Jfr();
    WJo();
    _Gn();
    oy();
    Q5c();
    Gd();
    Sns();
    Kp();
    Bve();
    UYe();
    Ydr();
    tQt();
    Jwt();
    DDe();
    gts();
    Kq();
    ode();
    l6n();
    UV();
    GT();
    S_();
    Ugt();
    CO();
    $8e();
    no();
    vF();
    $A();
    GVe();
    V_t();
    Ds();
    ICn();
    at();
    llt();
    Gts();
    O1();
    i4n();
    GWn();
    KWn();
    sln();
    fa();
    HG();
    _Zo();
    Yjt();
    eA();
    D6e();
    Iw();
    RRt();
    Moe();
    aGn();
    Sp();
    EI();
    G1();
    n6c();
    Ans();
    _5e();
    Iw();
    l9();
    Rgt();
    VUe();
    ro();
    zQt();
    HQt();
    np();
    wx();
    pU();
    Eo();
    YN();
    STe();
    Fp();
    XN();
    DC();
    sne();
    at();
    GG();
    wJn();
    xqe();
    Jq();
    t6n();
    TXe();
    Th();
    Zk();
    bx();
    LG();
    ODe();
    wm();
    dWt();
    H4();
    R3();
    y7e();
    D_();
    Eve();
    S$();
    Ogr();
    o6c();
    Bgr();
    Bm();
    rR();
    kS();
    pr();
    gn();
    a6c();
    dur();
    xg();
    RX();
    qp();
    uA();
    UM();
    YI();
    U$();
    ves();
    tZ();
    ges();
    zX();
    e7e();
    l6c();
    d6c();
    h6c();
    $n();
    dt();
    s7e();
    Fat();
    Eb();
    C$();
    WXe = require("fs/promises");
    qXe = require("path");
    jhe = require("process");
    Kx = require("crypto");
    q6c = (r6n(), __toCommonJS(iCo));
    u2e = (N1(), __toCommonJS(DG));
    L4f = (ats(), __toCommonJS(Zjc));
    F4f = (U3t(), __toCommonJS(Ada));
    W6c = (OG(), __toCommonJS(upa));
    U4f = (E9e(), __toCommonJS(T9e));
    B4f = (nXt(), __toCommonJS(crr));
    Isn = new Set();
    gbr = [];
    PARKED_PERMISSION_ANSWER_WAIT_MS = Me.CLAUDE_CODE_PARKED_PERMISSION_WAIT_MS ?? 2000;
  });
  var nrs = {};