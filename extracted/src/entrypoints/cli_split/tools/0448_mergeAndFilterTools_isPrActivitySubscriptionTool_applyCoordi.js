  __export(kIc, {
    mergeAndFilterTools: () => mergeAndFilterTools,
    isPrActivitySubscriptionTool: () => isPrActivitySubscriptionTool,
    applyCoordinatorToolFilter: () => applyCoordinatorToolFilter
  });
  function isPrActivitySubscriptionTool(e) {
    return q0f.some(t => e.endsWith(t));
  }
  function wIc(e) {
    return e.mcpInfo?.serverInfoName === "claude-code-remote";
  }
  function applyCoordinatorToolFilter(e) {
    let t = JQo?.isCcrCoordinator() ?? false;
    let n = Me.CLAUDE_CODE_BRIEF;
    let r = new Set((process.env.CLAUDE_CODE_COORDINATOR_EXTRA_TOOLS ?? "").split(",").map(s => s.trim()).filter(Boolean));
    let o = t && e.some(s => bM(s) && !wIc(s)) && !e.some(isCoordinatorCommsMcpTool);
    if (o && !CIc) {
      CIc = true;
      Pe("coordinator_mcp_no_comms_role_fallback");
    }
    return e.filter(s => puo.vZc(s.name) || isPrActivitySubscriptionTool(s.name) || t && wIc(s) || isCoordinatorCommsMcpTool(s) || o && bM(s) || n && j0f.vZc(s.name) || r.vZc(s.name));
  }
  function mergeAndFilterTools(e, t, n) {
    let [r, o] = Abu(gyp([...e, ...t], "name"), bM);
    let s = (a, l) => a.name.localeCompare(l.name);
    let i = [...o.sort(s), ...r.sort(s)];
    if (JQo) {
      if (JQo.isCoordinatorMode()) {
        return applyCoordinatorToolFilter(i);
      }
    }
    return i;
  }
  var j0f;
  var q0f;
  var CIc = false;
  var JQo;
  var fon = __lazy(() => {
    x9e();
    ln();
    k2();
    Ubt();
    pr();
    j0f = new Set(["SendUserMessage", "SendUserFile"]);
    q0f = ["subscribe_pr_activity", "unsubscribe_pr_activity"];
    JQo = (N1(), __toCommonJS(DG));
  });
  function IIc(e, t, n) {
    let r = bt(i => i.replBridgeEnabled);
    let o = bt(i => i.replBridgeOutboundOnly);
    let s = bt(i => i.skillTools);
    setReplBridgeActive(r && !o);
    return AIc.useMemo(() => {
      let i = EZ(n, t, {
        skillTools: s
      });
      return mergeAndFilterTools(e, i, n.mode);
    }, [e, t, s, n, r, o]);
  }
  var AIc;
  var PIc = __lazy(() => {
    at();
    ho();
    jM();
    fon();
    AIc = __toESM(ot(), 1);
  });
  function G0f(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = new Set(e.map(getCommandName));
    let r = t.map(o => o.isMcp && n.vZc(getCommandName(o)) ? {
      ...o,
      isHidden: true
    } : o);
    return gyp([...e, ...r], "name");
  }
  function XQo(e, t) {
    return OIc.useMemo(() => G0f(e, t), [e, t]);
  }
  var OIc;
  var DIc = __lazy(() => {
    OIc = __toESM(ot(), 1);
  });
  async function Z0f() {
    let e = await c8e(getProjectRoot());
    let t = new Map();
    for (let n of e) {
      t.set(n.name, n.type === "prompt" ? n.contentHash ?? "" : "");
    }
    return t;
  }
  function eIf(e) {
    let t = e?.stabilityThreshold ?? 1000;
    let n = e?.pollInterval ?? 500;
    let r = e?.reloadDebounce ?? 300;
    let o = e?.chokidarInterval ?? 2000;
    let s = e?.getFingerprint ?? Z0f;
    let i = e?.now ?? Date.now;
    let a = e?.lastInteractionTime ?? getLastInteractionTime;
    let l = Si();
    let c = g$.subscribe(() => l.emit());
    let u = null;
    let d = null;
    let p = null;
    let m = false;
    let f = [];
    let h = new Set();
    let g = null;
    let y = false;
    let _ = false;
    let b = null;
    let S = null;
    async function E() {
      if (y || _) {
        return;
      }
      if (y = true, !b) {
        b = n5a(() => {
          clearCommandMemoizationCaches();
          l.emit();
        });
      }
      if (f = await tIf(), f.length === 0) {
        return;
      }
      g = await s().catch(() => null);
      logForDebugging(`Watching for changes in skill/command directories: ${f.join(", ")}...`);
      u = C(o);
      let O = u;
      if (await new Promise(M => O.once("ready", () => M())), true) {
        p = setInterval(x, 1e4);
        p.unref?.();
      }
      S = Ti(A);
    }
    function C(O) {
      let M = jF.watch(f, {
        persistent: true,
        ignoreInitial: true,
        depth: 2,
        awaitWriteFinish: {
          stabilityThreshold: t,
          pollInterval: n
        },
        ignored: (L, P) => {
          if (P && !P.isFile() && !P.isDirectory() && !P.isSymbolicLink()) {
            return true;
          }
          if (L.split(/[/\\]/).some(F => F === ".git")) {
            return true;
          }
          if (P?.isFile()) {
            return !L.endsWith(".md");
          }
          return false;
        },
        ignorePermissionErrors: true,
        usePolling: true,
        interval: O,
        binaryInterval: O,
        atomic: true
      });
      M.on("add", k);
      M.on("change", k);
      M.on("unlink", k);
      M.on("error", L => logForDebugging(`[skills] watcher error: ${he(L)}`, {
        level: "warn"
      }));
      return M;
    }
    function x() {
      if (_ || !u) {
        return;
      }
      let O = i() - a() > 60000;
      if (O === m) {
        return;
      }
      m = O;
      let M = O ? 30000 : o;
      if (logForDebugging(`[skills] ${O ? "idle" : "active"} \u2014 switching poll interval to ${M}ms`), u.close(), u = C(M), !O) {
        I("<skill-watcher-idle-wake>");
      }
    }
    function A() {
      if (_ = true, S) {
        S();
        S = null;
      }
      if (b) {
        b();
        b = null;
      }
      if (p) {
        clearInterval(p);
        p = null;
      }
      let O = Promise.resolve();
      if (u) {
        O = u.close();
        u = null;
      }
      if (d) {
        clearTimeout(d);
        d = null;
      }
      h.clear();
      c();
      l.clear();
      return O;
    }
    function k(O) {
      logForDebugging(`Detected skill change: ${O}`);
      logEvent("tengu_skill_file_changed", {
        source: "chokidar"
      });
      I(O);
    }
    function I(O) {
      if (h.add(O), d) {
        clearTimeout(d);
      }
      d = setTimeout(async () => {
        d = null;
        let M = [...h];
        h.clear();
        let L = M.length === 1 && M[0] === "<skill-watcher-idle-wake>";
        if (!L) {
          let H = M.find(N => N !== "<skill-watcher-idle-wake>") ?? M[0];
          let U = await executeConfigChangeHooks("skills", H);
          if (hasBlockingResult(U)) {
            logForDebugging(`ConfigChange hook blocked skill reload (${M.length} paths)`);
            return;
          }
        }
        d8e();
        let P = await s().catch(() => null);
        if (P === null) {
          clearCommandsCache();
          clearAgentDefinitionsCache();
          l.emit();
          return;
        }
        let F = g !== null && P.size === g.size && [...g].every(([H, U]) => P.get(H) === U);
        if (F && L) {
          clearAgentDefinitionsCache();
          return;
        }
        if (clearCommandsCache(), clearAgentDefinitionsCache(), F) {
          logForDebugging(`[skills] ${M.length} fs event(s) but skill list unchanged \u2014 skipping re-announce`);
        } else {
          if (g !== null) {
            let H = [...g].filter(([U, N]) => P.get(U) !== N).map(([U]) => U);
            if (H.length > 0) {
              evictSentSkillNames(H);
            }
          }
          g = P;
        }
        l.emit();
      }, r);
    }
    return {
      initialize: E,
      dispose: A,
      [Symbol.asyncDispose]: A,
      subscribe: l.subscribe,
      _checkIdleTransitionForTest: x
    };
  }
  async function tIf() {
    let e = zt();
    let t = [];
    let n = u8e("userSettings", "skills");
    if (n) {
      try {
        await e.stat(n);
        t.push(n);
      } catch {}
    }
    let r = u8e("userSettings", "commands");
    if (r) {
      try {
        await e.stat(r);
        t.push(r);
      } catch {}
    }
    let o = u8e("projectSettings", "skills");
    if (o) {
      try {
        let l = hxt.resolve(o);
        await e.stat(l);
        t.push(l);
      } catch {}
    }
    let s = u8e("projectSettings", "commands");
    if (s) {
      try {
        let l = hxt.resolve(s);
        await e.stat(l);
        t.push(l);
      } catch {}
    }
    let i = u8e("userSettings", "agents");
    if (i) {
      try {
        await e.stat(i);
        t.push(i);
      } catch {}
    }
    let a = u8e("projectSettings", "agents");
    if (a) {
      try {
        let l = hxt.resolve(a);
        await e.stat(l);
        t.push(l);
      } catch {}
    }
    for (let l of getAdditionalDirectoriesForClaudeMd()) {
      let c = hxt.join(l, ".claude", "skills");
      try {
        await e.stat(c);
        t.push(c);
      } catch {}
    }
    return t;
  }
  var hxt;
  var gxt;
  var Bgr = __lazy(() => {
    oue();
    at();
    Bm();
    Ot();
    T9();
    kS();
    rR();
    hd();
    je();
    dt();
    Sp();
    ph();
    ODe();
    hxt = __toESM(require("path"));
    gxt = eIf();
  });
  function NIc(e, t, n) {
    let r = vXe.useCallback(async () => {
      if (!e) {
        return;
      }
      try {
        clearCommandsCache();
        let s = await getCommands(e);
        if (t(s), n) {
          let i = await getAgentDefinitionsWithOverrides(e);
          n(i);
        }
      } catch (s) {
        if (s instanceof Error) {
          Oe(s);
        }
      }
    }, [e, t, n]);
    vXe.useEffect(() => gxt.subscribe(r), [r]);
    let o = vXe.useCallback(async () => {
      if (!e) {
        return;
      }
      try {
        clearCommandMemoizationCaches();
        let s = await getCommands(e);
        t(s);
      } catch (s) {
        if (s instanceof Error) {
          Oe(s);
        }
      }
    }, [e, t]);
    vXe.useEffect(() => onGrowthBookRefresh(o), [o]);
    vXe.useEffect(() => fM.subscribe(o), [o]);
  }
  var vXe;
  var LIc = __lazy(() => {
    Bm();
    $n();
    kS();
    Rn();
    ode();
    Bgr();
    vXe = __toESM(ot(), 1);
  });
  function rIf(e, t) {
    let n = t.manifest.userConfig ? W1(Poe(t)) : undefined;
    let r = o => {
      let s = Ooe(o, t);
      if (n) {
        s = mEe(s, n);
      }
      return Eoe(s).expanded;
    };
    return {
      name: e.name,
      command: r(e.command),
      description: e.description,
      when: e.when,
      pluginName: t.name,
      pluginRoot: t.path
    };
  }
  function oIf(e) {
    let t = [];
    let n = false;
    for (let r of e) {
      let o = r.monitors;
      if (!o) {
        continue;
      }
      for (let s of o) {
        try {
          t.push(rIf(s, r));
        } catch (i) {
          n = true;
          logForDebugging(`plugin ${r.name}: failed to resolve monitor "${s.name}": ${i}`, {
            level: "error"
          });
        }
      }
    }
    if (n) {
      Ae("plugin_load_monitors", "plugin_load_monitors_resolve_failed");
    } else {
      Pe("plugin_load_monitors");
    }
    return t;
  }
  function sIf(e, t, n = X9, r = pDo(10, 2000)) {
    let o = 0;
    function s() {
      if (o === 0) {
        return;
      }
      n(e.description, `[plugin monitor "${e.name}" suppressed ${o} events \u2014 output rate exceeded]`, t.id);
      o = 0;
    }
    return {
      onBatch: i => {
        if (!r.tryConsume()) {
          o++;
          return;
        }
        s();
        n(e.description, i, t.id);
      },
      onExit: s
    };
  }
  async function iIf(e, t) {
    if (rq()) {
      return;
    }
    if (shouldSkipHookDueToTrust()) {
      logForDebugging(`Skipping plugin monitor ${e.pluginName}:${e.name} - workspace trust not accepted`);
      return;
    }
    let n = {};
    let r = sIf(e, n);
    let o = dDo(r.onBatch);
    let s = await Kde(e.command, t.abortController.signal, w9e(), {
      preventCwdChanges: true,
      shouldUseSandbox: false,
      onStdout: o.onData
    });
    n.id = s.taskOutput.taskId;
    await XDe({
      command: e.command,
      description: e.description,
      shellCommand: s,
      toolUseId: undefined,
      agentId: undefined,
      kind: "monitor"
    }, t);
    s.result.then(() => {
      o.flush(true);
      r.onExit();
    });
    return n.id;
  }
  async function ZQo(e, t, n, r = iIf, o = nIf) {
    if (Pc("pluginMonitors")) {
      return;
    }
    if (!IG()) {
      return;
    }
    if (getIsNonInteractiveSession()) {
      return;
    }
    let s = false;
    for (let i of oIf(e)) {
      if (!t(i)) {
        continue;
      }
      let a = `${i.pluginName}:${i.name}`;
      if (o.vZc(a)) {
        continue;
      }
      o.add(a);
      try {
        if ((await r(i, n)) === undefined) {
          o.delete(a);
        }
      } catch (l) {
        o.delete(a);
        s = true;
        logForDebugging(`plugin monitor ${a}: failed to arm: ${l}`, {
          level: "error"
        });
      }
    }
    if (s) {
      Et("plugin_arm_monitor", "plugin_arm_monitor_failed");
    } else {
      Pe("plugin_arm_monitor");
    }
  }
  var nIf;
  var FIc = __lazy(() => {
    at();
    ln();
    zX();
    gSt();
    wX();
    wb();
    je();
    i1();
    Sp();
    U1();
    Jf();
    a9();
    nIf = new Set();
  });
  function BIc({
    enabled: e
  }) {
    let t = Ec();
    let n = Lo();
    let r = Rv();
    let o = bt(s => s.plugins.enabled);
    UIc.useEffect(() => {
      if (!e) {
        return;
      }
      let s = () => ({
        abortController: new AbortController(),
        taskRegistry: r
      });
      ZQo(o, i => i.when === "always", s());
      return sDo.subscribe(i => {
        ZQo(t.getState().plugins.enabled, a => a.when === `on-skill-invoke:${i}`, s());
      });
    }, [e, o, t, n, r]);
  }
  var UIc;
  var $Ic = __lazy(() => {
    ho();
    _9();
    FIc();
    Lve();
    UIc = __toESM(ot(), 1);
  });
  function jIc() {
    let e = HIc.c(14);
    let t = bt(aIf);
    if (!t) {
      return null;
    }
    let n;
    if (e[0] !== t.identity.color) {
      n = Gz(t.identity.color);
      e[0] = t.identity.color;
      e[1] = n;
    } else {
      n = e[1];
    }
    let r = n;
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = Phe.jsx(Text, {
        children: "Viewing "
      });
      e[2] = o;
    } else {
      o = e[2];
    }
    let s;
    if (e[3] !== r || e[4] !== t.identity.agentName) {
      s = Phe.jsxs(Text, {
        color: r,
        bold: true,
        children: ["@", t.identity.agentName]
      });
      e[3] = r;
      e[4] = t.identity.agentName;
      e[5] = s;
    } else {
      s = e[5];
    }
    let i;
    if (e[6] === Symbol.for("react.memo_cache_sentinel")) {
      i = Phe.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", Phe.jsx(xt, {
          chord: "escape",
          action: "return",
          format: {
            keyCase: "lower"
          }
        })]
      });
      e[6] = i;
    } else {
      i = e[6];
    }
    let a;
    if (e[7] !== s) {
      a = Phe.jsxs(gXd, {
        children: [o, s, i]
      });
      e[7] = s;
      e[8] = a;
    } else {
      a = e[8];
    }
    let l;
    if (e[9] !== t.prompt) {
      l = Phe.jsx(Text, {
        dimColor: true,
        children: t.prompt
      });
      e[9] = t.prompt;
      e[10] = l;
    } else {
      l = e[10];
    }
    let c;
    if (e[11] !== a || e[12] !== l) {
      c = Phe.jsx(IM, {
        children: Phe.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [a, l]
        })
      });
      e[11] = a;
      e[12] = l;
      e[13] = c;
    } else {
      c = e[13];
    }
    return c;
  }
  function aIf(e) {
    return kFe(e);
  }
  var HIc;
  var Phe;
  var qIc = __lazy(() => {
    et();
    ho();
    wXt();
    wKe();
    bs();
    xEe();
    HIc = __toESM(pt(), 1);
    Phe = __toESM(ie(), 1);
  });
  function WIc(e, t) {
    let n = hon.useRef(false);
    let r = hon.useRef(null);
    hon.useEffect(() => {
      let o = p9(e);
      if (r.current !== (o ?? null)) {
        n.current = false;
        r.current = o || null;
        t({
          lineCount: 0,
          lineStart: undefined,
          text: undefined,
          filePath: undefined
        });
      }
      if (n.current || !o) {
        return;
      }
      let s = i => {
        if (i.selection?.start && i.selection?.end) {
          let {
            start: a,
            end: l
          } = i.selection;
          let c = l.line - a.line + 1;
          if (l.character === 0) {
            c--;
          }
          let u = {
            lineCount: c,
            lineStart: a.line + 1,
            text: i.text,
            filePath: i.filePath
          };
          t(u);
        }
      };
      o.client.setNotificationHandler(lIf(), i => {
        if (r.current !== o) {
          return;
        }
        try {
          let a = i.params;
          if (a.selection && a.selection.start && a.selection.end) {
            s(a);
          } else if (a.text !== undefined) {
            s({
              selection: null,
              text: a.text,
              filePath: a.filePath
            });
          }
        } catch (a) {
          Oe(a);
        }
      });
      n.current = true;
    }, [e, t]);
  }
  var hon;
  var lIf;
  var GIc = __lazy(() => {
    Rn();
    bT();
    hon = __toESM(ot(), 1);
    lIf = we(() => v.object({
      method: v.literal("selection_changed"),
      params: v.object({
        selection: v.object({
          start: v.object({
            line: v.number(),
            character: v.number()
          }),
          end: v.object({
            line: v.number(),
            character: v.number()
          })
        }).nullable().optional(),
        text: v.string().optional(),
        filePath: v.string().optional()
      })
    }));
  });
  function VIc(e, t) {
    switch (e.kind) {
      case "background_hint":
        return gon.background_hint(e, t);
      case "bash_mode_progress":
        return gon.bash_mode_progress(e, t);
      case "it2_setup_prompt":
        return gon.it2_setup_prompt(e, t);
      case "computer_use_approval":
        return gon.computer_use_approval(e, t);
      case "agent_progress":
        return gon.agent_progress(e, t);
      default:
        {
          let n = e;
          return null;
        }
    }
  }
  var eZo;
  var gon;
  var zIc = __lazy(() => {
    uJo();
    W7t();
    s6t();
    eZo = __toESM(ie(), 1);
    gon = {
      background_hint: () => eZo.jsx(xNe, {}),
      bash_mode_progress: e => eZo.jsx(srn, {
        input: e.input,
        progress: e.progress,
        verbose: e.verbose
      }),
      agent_progress: (e, {
        tools: t,
        verbose: n
      }) => kLe(e.progressMessages, {
        tools: t,
        verbose: n
      }),
      it2_setup_prompt: () => null,
      computer_use_approval: () => null
    };
  });
  function KIc() {
    let e = Si();
    let t = Si();
    let n = Si();
    let r = new Map();
    let o = 0;
    return {
      subscribe: e.subscribe,
      onCancel: t.subscribe,
      onUpdate: n.subscribe,
      reply(s) {
        let i = r.get(s.id);
        if (!i) {
          return;
        }
        r.delete(s.id);
        i(s);
      },
      request({
        kind: s,
        payload: i
      }, a) {
        o += 1;
        let l = `dialog-${o}`;
        let {
          promise: c,
          resolve: u
        } = Promise.withResolvers();
        let d = a?.signal;
        if (d?.aborted) {
          queueMicrotask(() => u({
            id: l,
            cancelled: true
          }));
          return {
            id: l,
            replied: c,
            update: () => {}
          };
        }
        let p;
        if (r.set(l, m => {
          if (d && p) {
            d.removeEventListener("abort", p);
          }
          u(m);
        }), d) {
          p = () => {
            if (r.delete(l)) {
              u({
                id: l,
                cancelled: true
              });
              t.emit(l);
            }
          };
          d.addEventListener("abort", p, {
            once: true
          });
        }
        e.emit({
          id: l,
          kind: s,
          payload: i,
          queueBehind: a?.queueBehind
        });
        return {
          id: l,
          replied: c,
          update: m => {
            if (r.vZc(l)) {
              n.emit({
                id: l,
                payload: m
              });
            }
          }
        };
      }
    };
  }
  var YIc = __lazy(() => {
    ph();
  });
  function nZo(e) {
    tZo.setState(t => t.focus === e ? t : {
      focus: e
    });
  }
  function cIf() {
    return JIc.useSyncExternalStore(tZo.subscribe, () => tZo.getState().focus !== null);
  }
  function $gr() {
    let e = cIf();
    let t = FEt();
    return e ? "legacy-dialog" : t ? "typing" : null;
  }
  function XIc() {
    let e = YJe();
    let t = $gr();
    return !e ? "none" : t !== null ? "suppressed" : "visible";
  }
  function QIc() {
    let e = jRt();
    return $gr() !== null ? null : e;
  }
  var JIc;
  var tZo;
  var rZo = __lazy(() => {
    ufe();
    tre();
    FBe();
    JIc = __toESM(ot(), 1);
    tZo = dO({
      focus: null
    });
  });
  function tPc(e) {
    let t = Hgr.c(3);
    let {
      request: n,
      onDone: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      o = n.tccState ? AT.jsx(uIf, {
        tccState: n.tccState,
        onDone: () => r(ePc)
      }) : AT.jsx(pIf, {
        request: n,
        onDone: r
      });
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function uIf(e) {
    let t = Hgr.c(26);
    let {
      tccState: n,
      onDone: r
    } = e;
    let o;
    if (t[0] !== n.accessibility || t[1] !== n.screenRecording) {
      if (o = [], !n.accessibility) {
        let _;
        if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
          _ = {
            label: "Open System Settings \u2192 Accessibility",
            value: "open_accessibility"
          };
          t[3] = _;
        } else {
          _ = t[3];
        }
        o.push(_);
      }
      if (!n.screenRecording) {
        let _;
        if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
          _ = {
            label: "Open System Settings \u2192 Screen Recording",
            value: "open_screen_recording"
          };
          t[4] = _;
        } else {
          _ = t[4];
        }
        o.push(_);
      }
      let y;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        y = {
          label: "Try again",
          value: "retry"
        };
        t[5] = y;
      } else {
        y = t[5];
      }
      o.push(y);
      t[0] = n.accessibility;
      t[1] = n.screenRecording;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i;
    if (t[6] !== r) {
      i = function (_) {
        let b = Vq();
        switch (_) {
          case "open_accessibility":
            {
              b.tcc.requestAccessibility();
              execFileNoThrow("open", ["x-apple.systempreferences:com.apple.preference.security?Privacy_Accessibility"], {
                useCwd: false
              });
              return;
            }
          case "open_screen_recording":
            {
              b.tcc.requestScreenRecording();
              execFileNoThrow("open", ["x-apple.systempreferences:com.apple.preference.security?Privacy_ScreenCapture"], {
                useCwd: false
              });
              return;
            }
          case "retry":
            {
              r();
              return;
            }
        }
      };
      t[6] = r;
      t[7] = i;
    } else {
      i = t[7];
    }
    let a = i;
    let l = n.accessibility ? `${vGd.tick} granted` : `${vGd.cross} not granted`;
    let c;
    if (t[8] !== l) {
      c = AT.jsxs(Text, {
        children: ["Accessibility:", " ", l]
      });
      t[8] = l;
      t[9] = c;
    } else {
      c = t[9];
    }
    let u = n.screenRecording ? `${vGd.tick} granted` : `${vGd.cross} not granted`;
    let d;
    if (t[10] !== u) {
      d = AT.jsxs(Text, {
        children: ["Screen Recording:", " ", u]
      });
      t[10] = u;
      t[11] = d;
    } else {
      d = t[11];
    }
    let p;
    if (t[12] !== c || t[13] !== d) {
      p = AT.jsxs(gXd, {
        flexDirection: "column",
        children: [c, d]
      });
      t[12] = c;
      t[13] = d;
      t[14] = p;
    } else {
      p = t[14];
    }
    let m;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      m = AT.jsx(Text, {
        dimColor: true,
        children: 'Grant the missing permissions in System Settings, then select "Try again". macOS may require you to restart Claude Code after granting Screen Recording.'
      });
      t[15] = m;
    } else {
      m = t[15];
    }
    let f;
    if (t[16] !== a || t[17] !== r || t[18] !== s) {
      f = AT.jsx(xr, {
        options: s,
        onChange: a,
        onCancel: r
      });
      t[16] = a;
      t[17] = r;
      t[18] = s;
      t[19] = f;
    } else {
      f = t[19];
    }
    let h;
    if (t[20] !== p || t[21] !== f) {
      h = AT.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        paddingY: 1,
        gap: 1,
        children: [p, m, f]
      });
      t[20] = p;
      t[21] = f;
      t[22] = h;
    } else {
      h = t[22];
    }
    let g;
    if (t[23] !== r || t[24] !== h) {
      g = AT.jsx(or, {
        title: "Computer Use needs macOS permissions",
        onCancel: r,
        children: h
      });
      t[23] = r;
      t[24] = h;
      t[25] = g;
    } else {
      g = t[25];
    }
    return g;
  }
  function pIf(e) {
    let t = Hgr.c(48);
    let {
      request: n,
      onDone: r
    } = e;
    let o;
    if (t[0] !== n.apps) {
      o = () => new Set(n.apps.flatMap(gIf));
      t[0] = n.apps;
      t[1] = o;
    } else {
      o = t[1];
    }
    let [s] = ZIc.useState(o);
    let i;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = ["clipboardRead", "clipboardWrite", "systemKeyCombos"];
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== n.requestedFlags) {
      l = a.filter(P => n.requestedFlags[P]);
      t[3] = n.requestedFlags;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u = s.size;
    let d;
    if (t[5] !== s.size) {
      d = un(s.size, "app");
      t[5] = s.size;
      t[6] = d;
    } else {
      d = t[6];
    }
    let p = `Allow for this session (${u} ${d})`;
    let m;
    if (t[7] !== p) {
      m = {
        label: p,
        value: "allow_all"
      };
      t[7] = p;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      f = {
        label: AT.jsxs(Text, {
          children: ["Deny, and tell Claude what to do differently ", AT.jsx(Text, {
            bold: true,
            children: "(esc)"
          })]
        }),
        value: "deny"
      };
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== m) {
      h = [m, f];
      t[10] = m;
      t[11] = h;
    } else {
      h = t[11];
    }
    let g = h;
    let y;
    if (t[12] !== s || t[13] !== r || t[14] !== n.apps || t[15] !== c) {
      y = function (F) {
        if (!F) {
          r(ePc);
          return;
        }
        let H = Date.now();
        let U = n.apps.flatMap(j => j.resolved && s.vZc(j.resolved.bundleId) ? [{
          bundleId: j.resolved.bundleId,
          displayName: j.resolved.displayName,
          grantedAt: H
        }] : []);
        let N = n.apps.filter(j => !j.resolved || !s.vZc(j.resolved.bundleId)).map(hIf);
        let W = {
          ...jX,
          ...Object.fromEntries(c.map(fIf))
        };
        r({
          granted: U,
          denied: N,
          flags: W
        });
      };
      t[12] = s;
      t[13] = r;
      t[14] = n.apps;
      t[15] = c;
      t[16] = y;
    } else {
      y = t[16];
    }
    let _ = y;
    let b;
    if (t[17] !== _) {
      b = () => _(false);
      t[17] = _;
      t[18] = b;
    } else {
      b = t[18];
    }
    let S;
    if (t[19] !== n.reason) {
      S = n.reason ? AT.jsx(Text, {
        dimColor: true,
        children: n.reason
      }) : null;
      t[19] = n.reason;
      t[20] = S;
    } else {
      S = t[20];
    }
    let E;
    if (t[21] !== s || t[22] !== n.apps) {
      let P;
      if (t[24] !== s) {
        P = F => {
          let H = F.resolved;
          if (!H) {
            return AT.jsxs(Text, {
              dimColor: true,
              children: ["  ", vGd.circle, " ", F.requestedName, " ", AT.jsx(Text, {
                dimColor: true,
                children: "(not installed)"
              })]
            }, F.requestedName);
          }
          if (F.alreadyGranted) {
            return AT.jsxs(Text, {
              dimColor: true,
              children: ["  ", vGd.tick, " ", H.displayName, " ", AT.jsx(Text, {
                dimColor: true,
                children: "(already granted)"
              })]
            }, H.bundleId);
          }
          let U = v_a(H.bundleId);
          let N = s.vZc(H.bundleId);
          return AT.jsxs(gXd, {
            flexDirection: "column",
            children: [AT.jsxs(Text, {
              children: ["  ", N ? vGd.circleFilled : vGd.circle, " ", H.displayName]
            }), U ? AT.jsxs(Text, {
              bold: true,
              children: ["    ", vGd.warning, " ", dIf[U]]
            }) : null]
          }, H.bundleId);
        };
        t[24] = s;
        t[25] = P;
      } else {
        P = t[25];
      }
      E = n.apps.map(P);
      t[21] = s;
      t[22] = n.apps;
      t[23] = E;
    } else {
      E = t[23];
    }
    let C;
    if (t[26] !== E) {
      C = AT.jsx(gXd, {
        flexDirection: "column",
        children: E
      });
      t[26] = E;
      t[27] = C;
    } else {
      C = t[27];
    }
    let x;
    if (t[28] !== c) {
      x = c.length > 0 ? AT.jsxs(gXd, {
        flexDirection: "column",
        children: [AT.jsx(Text, {
          dimColor: true,
          children: "Also requested:"
        }), c.map(mIf)]
      }) : null;
      t[28] = c;
      t[29] = x;
    } else {
      x = t[29];
    }
    let A;
    if (t[30] !== n.willHide) {
      A = n.willHide && n.willHide.length > 0 ? AT.jsxs(Text, {
        dimColor: true,
        children: [n.willHide.length, " other", " ", un(n.willHide.length, "app"), " will be hidden while Claude works."]
      }) : null;
      t[30] = n.willHide;
      t[31] = A;
    } else {
      A = t[31];
    }
    let k;
    let I;
    if (t[32] !== _) {
      k = P => _(P === "allow_all");
      I = () => _(false);
      t[32] = _;
      t[33] = k;
      t[34] = I;
    } else {
      k = t[33];
      I = t[34];
    }
    let O;
    if (t[35] !== g || t[36] !== k || t[37] !== I) {
      O = AT.jsx(xr, {
        options: g,
        onChange: k,
        onCancel: I
      });
      t[35] = g;
      t[36] = k;
      t[37] = I;
      t[38] = O;
    } else {
      O = t[38];
    }
    let M;
    if (t[39] !== S || t[40] !== C || t[41] !== x || t[42] !== A || t[43] !== O) {
      M = AT.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        paddingY: 1,
        gap: 1,
        children: [S, C, x, A, O]
      });
      t[39] = S;
      t[40] = C;
      t[41] = x;
      t[42] = A;
      t[43] = O;
      t[44] = M;
    } else {
      M = t[44];
    }
    let L;
    if (t[45] !== b || t[46] !== M) {
      L = AT.jsx(or, {
        title: "Computer Use wants to control these apps",
        onCancel: b,
        children: M
      });
      t[45] = b;
      t[46] = M;
      t[47] = L;
    } else {
      L = t[47];
    }
    return L;
  }
  function mIf(e) {
    return AT.jsxs(Text, {
      dimColor: true,
      children: ["  ", "\xB7 ", e]
    }, e);
  }
  function fIf(e) {
    return [e, true];
  }
  function hIf(e) {
    return {
      bundleId: e.resolved?.bundleId ?? e.requestedName,
      reason: e.resolved ? "user_denied" : "not_installed"
    };
  }
  function gIf(e) {
    return e.resolved && !e.alreadyGranted ? [e.resolved.bundleId] : [];
  }
  var Hgr;
  var ZIc;
  var AT;
  var ePc;
  var dIf;
  var nPc = __lazy(() => {
    bmo();
    BHn();
    et();
    ji();
    Zn();
    $c();
    Ii();
    Hgr = __toESM(pt(), 1);
    ZIc = __toESM(ot(), 1);
    AT = __toESM(ie(), 1);
    ePc = {
      granted: [],
      denied: [],
      flags: jX
    };
    dIf = {
      shell: "equivalent to shell access",
      filesystem: "can read/write any file",
      system_settings: "can change system settings"
    };
  });
  function rPc(e) {
    let t = eRe.c(58);
    let {
      onDone: n,
      tmuxAvailable: r
    } = e;
    let [o, s] = yxt.useState("initial");
    let [i, a] = yxt.useState(null);
    let [l, c] = yxt.useState(null);
    let u;
    let d;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        l0l().then(W => {
          a(W);
        });
      };
      d = [];
      t[0] = u;
      t[1] = d;
    } else {
      u = t[0];
      d = t[1];
    }
    yxt.useEffect(u, d);
    let p;
    if (t[2] !== n) {
      p = () => {
        n("cancelled");
      };
      t[2] = n;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m = p;
    let f = o !== "installing" && o !== "verifying";
    let h;
    if (t[4] !== f) {
      h = {
        context: "Confirmation",
        isActive: f
      };
      t[4] = f;
      t[5] = h;
    } else {
      h = t[5];
    }
    uo("confirm:no", m, h);
    let g;
    if (t[6] !== n) {
      g = () => n("installed");
      t[6] = n;
      t[7] = g;
    } else {
      g = t[7];
    }
    useTimeout(g, o === "success" ? 1500 : null);
    let y;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      y = function () {
        s("verifying");
        u0l().then(j => {
          if (j.success) {
            p0l();
            s("success");
          } else {
            c(j.error);
            s("failed");
          }
        });
      };
      t[8] = y;
    } else {
      y = t[8];
    }
    let _ = y;
    let b;
    if (t[9] !== o) {
      b = function (j) {
        if (o === "api-instructions" && j.key === "return") {
          j.preventDefault();
          _();
        }
      };
      t[9] = o;
      t[10] = b;
    } else {
      b = t[10];
    }
    let S = b;
    let E;
    if (t[11] !== i) {
      E = async function () {
        if (!i) {
          c("No Python package manager found (uvx, pipx, or pip)");
          s("failed");
          return;
        }
        s("installing");
        let j = await c0l(i);
        if (j.success) {
          s("api-instructions");
        } else {
          c(j.error);
          s("install-failed");
        }
      };
      t[11] = i;
      t[12] = E;
    } else {
      E = t[12];
    }
    let C = E;
    let x;
    if (t[13] !== n) {
      x = function () {
        m0l(true);
        n("use-tmux");
      };
      t[13] = n;
      t[14] = x;
    } else {
      x = t[14];
    }
    let A = x;
    let k;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      k = od.jsx(Text, {
        bold: true,
        color: "permission",
        children: "iTerm2 Split Pane Setup"
      });
      t[15] = k;
    } else {
      k = t[15];
    }
    let I;
    if (t[16] !== m || t[17] !== C || t[18] !== A || t[19] !== i || t[20] !== o || t[21] !== r) {
      I = o === "initial" && od.jsx(yIf, {
        packageManager: i,
        tmuxAvailable: r,
        onInstall: C,
        onUseTmux: A,
        onCancel: m
      });
      t[16] = m;
      t[17] = C;
      t[18] = A;
      t[19] = i;
      t[20] = o;
      t[21] = r;
      t[22] = I;
    } else {
      I = t[22];
    }
    let O;
    if (t[23] !== i || t[24] !== o) {
      O = o === "installing" && od.jsx(_If, {
        packageManager: i
      });
      t[23] = i;
      t[24] = o;
      t[25] = O;
    } else {
      O = t[25];
    }
    let M;
    if (t[26] !== l || t[27] !== m || t[28] !== C || t[29] !== A || t[30] !== i || t[31] !== o || t[32] !== r) {
      M = o === "install-failed" && od.jsx(bIf, {
        error: l,
        packageManager: i,
        tmuxAvailable: r,
        onRetry: C,
        onUseTmux: A,
        onCancel: m
      });
      t[26] = l;
      t[27] = m;
      t[28] = C;
      t[29] = A;
      t[30] = i;
      t[31] = o;
      t[32] = r;
      t[33] = M;
    } else {
      M = t[33];
    }
    let L;
    if (t[34] !== o) {
      L = o === "api-instructions" && od.jsx(SIf, {});
      t[34] = o;
      t[35] = L;
    } else {
      L = t[35];
    }
    let P;
    if (t[36] !== o) {
      P = o === "verifying" && od.jsx(EIf, {});
      t[36] = o;
      t[37] = P;
    } else {
      P = t[37];
    }
    let F;
    if (t[38] !== o) {
      F = o === "success" && od.jsx(vIf, {});
      t[38] = o;
      t[39] = F;
    } else {
      F = t[39];
    }
    let H;
    if (t[40] !== l || t[41] !== m || t[42] !== A || t[43] !== o || t[44] !== r) {
      H = o === "failed" && od.jsx(wIf, {
        error: l,
        tmuxAvailable: r,
        onRetry: _,
        onUseTmux: A,
        onCancel: m
      });
      t[40] = l;
      t[41] = m;
      t[42] = A;
      t[43] = o;
      t[44] = r;
      t[45] = H;
    } else {
      H = t[45];
    }
    let U;
    if (t[46] !== o) {
      U = o !== "installing" && o !== "verifying" && o !== "success" && od.jsx(Lw, {
        children: od.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })
      });
      t[46] = o;
      t[47] = U;
    } else {
      U = t[47];
    }
    let N;
    if (t[48] !== S || t[49] !== I || t[50] !== O || t[51] !== M || t[52] !== L || t[53] !== P || t[54] !== F || t[55] !== H || t[56] !== U) {
      N = od.jsx(Td, {
        color: "permission",
        children: od.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          paddingBottom: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: S,
          children: [k, I, O, M, L, P, F, H, U]
        })
      });
      t[48] = S;
      t[49] = I;
      t[50] = O;
      t[51] = M;
      t[52] = L;
      t[53] = P;
      t[54] = F;
      t[55] = H;
      t[56] = U;
      t[57] = N;
    } else {
      N = t[57];
    }
    return N;
  }
  function yIf(e) {
    let t = eRe.c(17);
    let {
      packageManager: n,
      tmuxAvailable: r,
      onInstall: o,
      onUseTmux: s,
      onCancel: i
    } = e;
    let a = n ? `Uses ${n} to install the it2 CLI tool` : "Requires Python (uvx, pipx, or pip)";
    let l;
    if (t[0] !== a) {
      l = {
        label: "Install it2 now",
        value: "install",
        description: a
      };
      t[0] = a;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c;
    if (t[2] !== l || t[3] !== r) {
      if (c = [l], r) {
        let h;
        if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
          h = {
            label: "Use tmux instead",
            value: "tmux",
            description: "Opens teammates in a separate tmux session"
          };
          t[5] = h;
        } else {
          h = t[5];
        }
        c.push(h);
      }
      let f;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        f = {
          label: "Cancel",
          value: "cancel",
          description: "Skip teammate spawning for now"
        };
        t[6] = f;
      } else {
        f = t[6];
      }
      c.push(f);
      t[2] = l;
      t[3] = r;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    let d;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      u = od.jsxs(Text, {
        children: ["To use native iTerm2 split panes for teammates, you need the", " ", od.jsx(Text, {
          bold: true,
          children: "it2"
        }), " CLI tool."]
      });
      d = od.jsx(Text, {
        dimColor: true,
        children: "This enables teammates to appear as split panes within your current window."
      });
      t[7] = u;
      t[8] = d;
    } else {
      u = t[7];
      d = t[8];
    }
    let p;
    if (t[9] !== i || t[10] !== o || t[11] !== s) {
      p = f => {
        e: switch (f) {
          case "install":
            {
              o();
              break e;
            }
          case "tmux":
            {
              s();
              break e;
            }
          case "cancel":
            i();
        }
      };
      t[9] = i;
      t[10] = o;
      t[11] = s;
      t[12] = p;
    } else {
      p = t[12];
    }
    let m;
    if (t[13] !== i || t[14] !== c || t[15] !== p) {
      m = od.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [u, d, od.jsx(gXd, {
          marginTop: 1,
          children: od.jsx(xr, {
            options: c,
            onChange: p,
            onCancel: i
          })
        })]
      });
      t[13] = i;
      t[14] = c;
      t[15] = p;
      t[16] = m;
    } else {
      m = t[16];
    }
    return m;
  }
  function _If(e) {
    let t = eRe.c(6);
    let {
      packageManager: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = od.jsx(Ed, {});
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = od.jsxs(gXd, {
        children: [r, od.jsxs(Text, {
          children: [" Installing it2 using ", n, "\u2026"]
        })]
      });
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      s = od.jsx(Text, {
        dimColor: true,
        children: "This may take a moment."
      });
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o) {
      i = od.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [o, s]
      });
      t[4] = o;
      t[5] = i;
    } else {
      i = t[5];
    }
    return i;
  }
  function bIf(e) {
    let t = eRe.c(22);
    let {
      error: n,
      packageManager: r,
      tmuxAvailable: o,
      onRetry: s,
      onUseTmux: i,
      onCancel: a
    } = e;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = {
        label: "Try again",
        value: "retry",
        description: "Retry the installation"
      };
      t[0] = l;
    } else {
      l = t[0];
    }
    let c;
    if (t[1] !== o) {
      if (c = [l], o) {
        let _;
        if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
          _ = {
            label: "Use tmux instead",
            value: "tmux",
            description: "Falls back to tmux for teammate panes"
          };
          t[3] = _;
        } else {
          _ = t[3];
        }
        c.push(_);
      }
      let y;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        y = {
          label: "Cancel",
          value: "cancel",
          description: "Skip teammate spawning for now"
        };
        t[4] = y;
      } else {
        y = t[4];
      }
      c.push(y);
      t[1] = o;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      u = od.jsx(Text, {
        color: "error",
        children: "Installation failed"
      });
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== n) {
      d = n && od.jsx(Text, {
        dimColor: true,
        children: n
      });
      t[6] = n;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p = r === "uvx" ? "uv tool install it2" : r === "pipx" ? "pipx install it2" : "pip install --user it2";
    let m;
    if (t[8] !== p) {
      m = od.jsxs(Text, {
        dimColor: true,
        children: ["You can try installing manually:", " ", p]
      });
      t[8] = p;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f;
    if (t[10] !== a || t[11] !== s || t[12] !== i) {
      f = y => {
        e: switch (y) {
          case "retry":
            {
              s();
              break e;
            }
          case "tmux":
            {
              i();
              break e;
            }
          case "cancel":
            a();
        }
      };
      t[10] = a;
      t[11] = s;
      t[12] = i;
      t[13] = f;
    } else {
      f = t[13];
    }
    let h;
    if (t[14] !== a || t[15] !== c || t[16] !== f) {
      h = od.jsx(gXd, {
        marginTop: 1,
        children: od.jsx(xr, {
          options: c,
          onChange: f,
          onCancel: a
        })
      });
      t[14] = a;
      t[15] = c;
      t[16] = f;
      t[17] = h;
    } else {
      h = t[17];
    }
    let g;
    if (t[18] !== d || t[19] !== m || t[20] !== h) {
      g = od.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [u, d, m, h]
      });
      t[18] = d;
      t[19] = m;
      t[20] = h;
      t[21] = g;
    } else {
      g = t[21];
    }
    return g;
  }
  function SIf() {
    let e = eRe.c(6);
    let t;
    let n;
    let r;
    let o;
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      let a = d0l();
      t = gXd;
      n = "column";
      r = 1;
      o = od.jsxs(Text, {
        color: "success",
        children: [od.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "it2 installed successfully"]
      });
      s = od.jsx(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: a.map(TIf)
      });
      e[0] = t;
      e[1] = n;
      e[2] = r;
      e[3] = o;
      e[4] = s;
    } else {
      t = e[0];
      n = e[1];
      r = e[2];
      o = e[3];
      s = e[4];
    }
    let i;
    if (e[5] === Symbol.for("react.memo_cache_sentinel")) {
      i = od.jsxs(t, {
        flexDirection: n,
        gap: r,
        children: [o, s, od.jsx(gXd, {
          marginTop: 1,
          children: od.jsx(Text, {
            dimColor: true,
            children: "Press Enter when ready to verify\u2026"
          })
        })]
      });
      e[5] = i;
    } else {
      i = e[5];
    }
    return i;
  }
  function TIf(e, t) {
    return od.jsx(Text, {
      children: e
    }, t);
  }
  function EIf() {
    let e = eRe.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = od.jsxs(gXd, {
        children: [od.jsx(Ed, {}), od.jsx(Text, {
          children: " Verifying it2 can communicate with iTerm2\u2026"
        })]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function vIf() {
    let e = eRe.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = od.jsxs(gXd, {
        flexDirection: "column",
        children: [od.jsxs(Text, {
          color: "success",
          children: [od.jsx(Ps, {
            status: "success",
            withSpace: true
          }), "iTerm2 split pane support is ready"]
        }), od.jsx(Text, {
          dimColor: true,
          children: "Teammates will now appear as split panes."
        })]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function wIf(e) {
    let t = eRe.c(21);
    let {
      error: n,
      tmuxAvailable: r,
      onRetry: o,
      onUseTmux: s,
      onCancel: i
    } = e;
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = {
        label: "Try again",
        value: "retry",
        description: "Verify the connection again"
      };
      t[0] = a;
    } else {
      a = t[0];
    }
    let l;
    if (t[1] !== r) {
      if (l = [a], r) {
        let y;
        if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
          y = {
            label: "Use tmux instead",
            value: "tmux",
            description: "Falls back to tmux for teammate panes"
          };
          t[3] = y;
        } else {
          y = t[3];
        }
        l.push(y);
      }
      let g;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        g = {
          label: "Cancel",
          value: "cancel",
          description: "Skip teammate spawning for now"
        };
        t[4] = g;
      } else {
        g = t[4];
      }
      l.push(g);
      t[1] = r;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      c = od.jsx(Text, {
        color: "error",
        children: "Verification failed"
      });
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== n) {
      u = n && od.jsx(Text, {
        dimColor: true,
        children: n
      });
      t[6] = n;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      d = od.jsx(Text, {
        children: "Make sure:"
      });
      t[8] = d;
    } else {
      d = t[8];
    }
    let p;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      p = od.jsxs(gXd, {
        flexDirection: "column",
        paddingLeft: 2,
        children: [od.jsx(Text, {
          children: "\xB7 Python API is enabled in iTerm2 preferences"
        }), od.jsx(Text, {
          children: "\xB7 You may need to restart iTerm2 after enabling"
        })]
      });
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== i || t[11] !== o || t[12] !== s) {
      m = g => {
        e: switch (g) {
          case "retry":
            {
              o();
              break e;
            }
          case "tmux":
            {
              s();
              break e;
            }
          case "cancel":
            i();
        }
      };
      t[10] = i;
      t[11] = o;
      t[12] = s;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== i || t[15] !== l || t[16] !== m) {
      f = od.jsx(gXd, {
        marginTop: 1,
        children: od.jsx(xr, {
          options: l,
          onChange: m,
          onCancel: i
        })
      });
      t[14] = i;
      t[15] = l;
      t[16] = m;
      t[17] = f;
    } else {
      f = t[17];
    }
    let h;
    if (t[18] !== u || t[19] !== f) {
      h = od.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [c, u, d, p, f]
      });
      t[18] = u;
      t[19] = f;
      t[20] = h;
    } else {
      h = t[20];
    }
    return h;
  }
  var eRe;
  var yxt;
  var od;
  var oPc = __lazy(() => {
    OS();
    fz();
    bs();
    oE();
    Vf();
    cA();
    et();
    Bs();
    bFo();
    eRe = __toESM(pt(), 1);
    yxt = __toESM(ot(), 1);
    od = __toESM(ie(), 1);
  });
  function sPc(e) {
    let t = oZo.c(5);
    let n = K_();
    let r;
    if (t[0] !== n.syntaxHighlightingDisabled) {
      r = n.syntaxHighlightingDisabled ? null : GDe();
      t[0] = n.syntaxHighlightingDisabled;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = r;
    let s;
    if (t[2] !== o || t[3] !== e) {
      s = Gie.jsx(CIf, {
        ...e,
        highlight: o
      });
      t[2] = o;
      t[3] = e;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function CIf(e) {
    let t = oZo.c(37);
    let {
      content: n,
      maxLines: r,
      minHeight: o,
      minWidth: s,
      maxWidth: i,
      highlight: a
    } = e;
    let l = s === undefined ? 40 : s;
    let {
      columns: c
    } = Sr();
    let [u] = useTheme();
    let d = i ?? c - 4;
    let p = r ?? 20;
    let m;
    if (t[0] !== n || t[1] !== a || t[2] !== u) {
      m = NXn(n, u, a);
      t[0] = n;
      t[1] = a;
      t[2] = u;
      t[3] = m;
    } else {
      m = t[3];
    }
    let f = m;
    let h = Math.max(1, d - 4);
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    if (t[4] !== p || t[5] !== d || t[6] !== o || t[7] !== l || t[8] !== f || t[9] !== h) {
      let k;
      if (t[16] !== h) {
        k = Q => an(Q) > h ? MB(Q, h, {
          hard: true,
          trim: false
        }).split(`
`) : Q;
        t[16] = h;
        t[17] = k;
      } else {
        k = t[17];
      }
      let I = f.split(`
`).flatMap(k);
      let O = I.length > p;
      let M = O ? I.slice(0, p) : I;
      let L = Math.min(o ?? 0, p);
      let P = Math.max(0, L - M.length - (O ? 1 : 0));
      let F = P > 0 ? [...M, ...Array(P).fill("")] : M;
      let H = Math.max(l, ...F.map(RIf));
      let U = Math.max(4, Math.min(H + 4, d));
      let N = U - 4;
      let W = U - 2;
      let j;
      if (t[18] !== W) {
        j = hm(zK.horizontal, W);
        t[18] = W;
        t[19] = j;
      } else {
        j = t[19];
      }
      let z = `${zK.topLeft}${j}${zK.topRight}`;
      let V = U - 2;
      let K;
      if (t[20] !== V) {
        K = hm(zK.horizontal, V);
        t[20] = V;
        t[21] = K;
      } else {
        K = t[21];
      }
      if (y = `${zK.bottomLeft}${K}${zK.bottomRight}`, E = O ? (() => {
        let Q = I.length - p;
        let Z = `${zK.horizontal.repeat(3)} \u2702 ${zK.horizontal.repeat(3)} ${Q} lines hidden `;
        let ne = an(Z);
        let oe = Math.max(0, U - 2 - ne);
        return `${zK.teeLeft}${Z}${zK.horizontal.repeat(oe)}${zK.teeRight}`;
      })() : null, g = gXd, _ = "column", t[22] !== z) {
        b = Gie.jsx(Text, {
          dimColor: true,
          children: z
        });
        t[22] = z;
        t[23] = b;
      } else {
        b = t[23];
      }
      let J;
      if (t[24] !== N) {
        J = (Q, Z) => {
          let oe = an(Q) > N ? KF(Q, 0, N) : Q;
          let ee = " ".repeat(Math.max(0, N - an(oe)));
          return Gie.jsxs(gXd, {
            flexDirection: "row",
            children: [Gie.jsxs(Text, {
              dimColor: true,
              children: [zK.vertical, " "]
            }), Gie.jsx(Ansi, {
              children: oe
            }), Gie.jsxs(Text, {
              dimColor: true,
              children: [ee, " ", zK.vertical]
            })]
          }, Z);
        };
        t[24] = N;
        t[25] = J;
      } else {
        J = t[25];
      }
      S = F.map(J);
      t[4] = p;
      t[5] = d;
      t[6] = o;
      t[7] = l;
      t[8] = f;
      t[9] = h;
      t[10] = g;
      t[11] = y;
      t[12] = _;
      t[13] = b;
      t[14] = S;
      t[15] = E;
    } else {
      g = t[10];
      y = t[11];
      _ = t[12];
      b = t[13];
      S = t[14];
      E = t[15];
    }
    let C;
    if (t[26] !== E) {
      C = E && Gie.jsx(Text, {
        color: "warning",
        children: E
      });
      t[26] = E;
      t[27] = C;
    } else {
      C = t[27];
    }
    let x;
    if (t[28] !== y) {
      x = Gie.jsx(Text, {
        dimColor: true,
        children: y
      });
      t[28] = y;
      t[29] = x;
    } else {
      x = t[29];
    }
    let A;
    if (t[30] !== g || t[31] !== _ || t[32] !== b || t[33] !== S || t[34] !== C || t[35] !== x) {
      A = Gie.jsxs(g, {
        flexDirection: _,
        children: [b, S, C, x]
      });
      t[30] = g;
      t[31] = _;
      t[32] = b;
      t[33] = S;
      t[34] = C;
      t[35] = x;
      t[36] = A;
    } else {
      A = t[36];
    }
    return A;
  }
  function RIf(e) {
    return an(e);
  }
  var oZo;
  var Gie;
  var zK;
  var iPc = __lazy(() => {
    Qq();
    ki();
    bc();
    Kge();
    et();
    f5e();
    d7t();
    yPe();
    Zn();
    oZo = __toESM(pt(), 1);
    Gie = __toESM(ie(), 1);
    zK = {
      topLeft: "\u250C",
      topRight: "\u2510",
      bottomLeft: "\u2514",
      bottomRight: "\u2518",
      horizontal: "\u2500",
      vertical: "\u2502",
      teeLeft: "\u251C",
      teeRight: "\u2524"
    };
  });
  function _xt(e) {
    let t = aPc.c(39);
    let {
      questions: n,
      currentQuestionIndex: r,
      answers: o,
      hideSubmitTab: s
    } = e;
    let i = s === undefined ? false : s;
    let {
      columns: a
    } = Sr();
    let l;
    if (t[0] !== a || t[1] !== r || t[2] !== i || t[3] !== n) {
      e: {
        let g = i ? "" : ` ${vGd.tick} Submit `;
        let y = an("\u2190 ") + an(" \u2192") + an(g);
        let _ = a - y;
        if (_ <= 0) {
          let L;
          if (t[5] !== r || t[6] !== n) {
            let P;
            if (t[8] !== r) {
              P = (F, H) => {
                let U = F?.header || `Q${H + 1}`;
                return H === r ? U.slice(0, 3) : "";
              };
              t[8] = r;
              t[9] = P;
            } else {
              P = t[9];
            }
            L = n.map(P);
            t[5] = r;
            t[6] = n;
            t[7] = L;
          } else {
            L = t[7];
          }
          l = L;
          break e;
        }
        let b = n.map(AIf);
        if (b.map(kIf).reduce(xIf, 0) <= _) {
          l = b;
          break e;
        }
        let C = b[r] || "";
        let x = 4 + an(C);
        let A = Math.min(x, _ / 2);
        let k = _ - A;
        let I = n.length - 1;
        let O = Math.max(6, Math.floor(k / Math.max(I, 1)));
        let M;
        if (t[10] !== r || t[11] !== A || t[12] !== O) {
          M = (L, P) => {
            if (P === r) {
              let F = A - 2 - 2;
              return truncateToWidth(L, F);
            } else {
              let F = O - 2 - 2;
              return truncateToWidth(L, F);
            }
          };
          t[10] = r;
          t[11] = A;
          t[12] = O;
          t[13] = M;
        } else {
          M = t[13];
        }
        l = b.map(M);
      }
      t[0] = a;
      t[1] = r;
      t[2] = i;
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u = n.length === 1 && i;
    let d;
    if (t[14] !== r || t[15] !== u) {
      d = !u && tRe.jsxs(Text, {
        color: r === 0 ? "inactive" : undefined,
        children: ["\u2190", " "]
      });
      t[14] = r;
      t[15] = u;
      t[16] = d;
    } else {
      d = t[16];
    }
    let p;
    if (t[17] !== o || t[18] !== r || t[19] !== n || t[20] !== c) {
      let g;
      if (t[22] !== o || t[23] !== r || t[24] !== c) {
        g = (y, _) => {
          let b = _ === r;
          let E = y?.question && !!o[y.question] ? vGd.checkboxOn : vGd.checkboxOff;
          let C = c[_] || y?.header || `Q${_ + 1}`;
          return tRe.jsx(gXd, {
            children: tRe.jsxs(Mx, {
              color: b ? "permission" : undefined,
              padded: true,
              children: [E, " ", C]
            })
          }, y?.question || `question-${_}`);
        };
        t[22] = o;
        t[23] = r;
        t[24] = c;
        t[25] = g;
      } else {
        g = t[25];
      }
      p = n.map(g);
      t[17] = o;
      t[18] = r;
      t[19] = n;
      t[20] = c;
      t[21] = p;
    } else {
      p = t[21];
    }
    let m;
    if (t[26] !== r || t[27] !== i || t[28] !== n.length) {
      m = !i && tRe.jsx(gXd, {
        children: tRe.jsxs(Mx, {
          color: r === n.length ? "permission" : undefined,
          padded: true,
          children: [vGd.tick, " Submit"]
        })
      }, "submit");
      t[26] = r;
      t[27] = i;
      t[28] = n.length;
      t[29] = m;
    } else {
      m = t[29];
    }
    let f;
    if (t[30] !== r || t[31] !== u || t[32] !== n.length) {
      f = !u && tRe.jsxs(Text, {
        color: r === n.length ? "inactive" : undefined,
        children: [" ", "\u2192"]
      });
      t[30] = r;
      t[31] = u;
      t[32] = n.length;
      t[33] = f;
    } else {
      f = t[33];
    }
    let h;
    if (t[34] !== d || t[35] !== p || t[36] !== m || t[37] !== f) {
      h = tRe.jsxs(gXd, {
        flexDirection: "row",
        marginBottom: 1,
        children: [d, p, m, f]
      });
      t[34] = d;
      t[35] = p;
      t[36] = m;
      t[37] = f;
      t[38] = h;
    } else {
      h = t[38];
    }
    return h;
  }
  function xIf(e, t) {
    return e + t;
  }
  function kIf(e) {
    return 4 + an(e);
  }
  function AIf(e, t) {
    return e?.header || `Q${t + 1}`;
  }
  var aPc;
  var tRe;
  var jgr = __lazy(() => {
    ki();
    bc();
    et();
    cs();
    qve();
    aPc = __toESM(pt(), 1);
    tRe = __toESM(ie(), 1);
  });
  function lPc({
    question: e,
    questions: t,
    currentQuestionIndex: n,
    answers: r,
    questionStates: o,
    hideSubmitTab: s = false,
    minContentWidth: i,
    onUpdateQuestionState: a,
    onAnswer: l,
    onTextInputFocus: c,
    onCancel: u,
    onTabPrev: d,
    onTabNext: p,
    onRespondToClaude: m
  }) {
    let [f, h] = n4.useState(false);
    let [g, y] = n4.useState(false);
    let [_, b] = n4.useState(0);
    let S = v5();
    let E = S ? S0(S) : null;
    let C = e.question;
    let x = o[C];
    let A = e.options;
    let [k, I] = n4.useState(0);
    let O = n4.useRef(C);
    if (O.current !== C) {
      O.current = C;
      let re = x?.selectedValue;
      let se = re ? A.findIndex(ae => ae.label === re) : -1;
      I(se >= 0 ? se : 0);
    }
    let M = A[k];
    let L = x?.selectedValue;
    let P = x?.textInputValue || "";
    let F = n4.useCallback(re => {
      let se = A[re];
      if (!se) {
        return;
      }
      I(re);
      a(C, {
        selectedValue: se.label
      }, false);
      l(C, se.label);
    }, [A, C, a, l]);
    let H = n4.useCallback(re => {
      if (g) {
        return;
      }
      let se;
      if (typeof re === "number") {
        se = re;
      } else if (re === "up") {
        se = k > 0 ? k - 1 : k;
      } else {
        se = k < A.length - 1 ? k + 1 : k;
      }
      if (se >= 0 && se < A.length) {
        I(se);
      }
    }, [k, A.length, g]);
    uo("chat:externalEditor", async () => {
      let re = x?.textInputValue || "";
      let se = await KZ(re);
      if (se.content !== null && se.content !== re) {
        a(C, {
          textInputValue: se.content
        }, false);
      }
    }, {
      context: "Chat",
      isActive: g && !!S
    });
    jo({
      "tabs:previous": d,
      "tabs:next": p
    }, {
      context: "Tabs",
      isActive: !g && !f
    });
    let U = n4.useCallback(() => {
      y(false);
      c(false);
    }, [c]);
    let N = n4.useCallback(() => {
      if (U(), L) {
        l(C, L);
      } else if (P.trim()) {
        l(C, "(notes only)");
      }
    }, [U, L, P, C, l]);
    let W = n4.useCallback(() => {
      h(true);
    }, []);
    let j = n4.useCallback(() => {
      h(false);
    }, []);
    let z = n4.useCallback(re => {
      if (f) {
        if (re.key === "up" || re.ctrl && re.key === "p") {
          re.preventDefault();
          j();
          return;
        }
        if (re.key === "return") {
          re.preventDefault();
          m();
          return;
        }
        if (re.key === "escape") {
          re.preventDefault();
          u();
        }
        return;
      }
      if (g) {
        if (re.key === "escape") {
          re.preventDefault();
          U();
        }
        return;
      }
      if (re.key === "up" || re.ctrl && re.key === "p") {
        if (re.preventDefault(), k > 0) {
          H("up");
        }
      } else if (re.key === "down" || re.ctrl && re.key === "n") {
        if (re.preventDefault(), k === A.length - 1) {
          W();
        } else {
          H("down");
        }
      } else if (re.key === "return") {
        re.preventDefault();
        F(k);
      } else if (re.key === "n" && !re.ctrl && !re.meta) {
        re.preventDefault();
        y(true);
        c(true);
      } else if (re.key === "escape") {
        re.preventDefault();
        u();
      } else if (re.key.length === 1 && re.key >= "1" && re.key <= "9") {
        re.preventDefault();
        let se = parseInt(re.key, 10) - 1;
        if (se < A.length) {
          H(se);
        }
      }
    }, [f, g, k, A.length, j, W, H, F, U, m, u, c]);
    let V = M?.preview || null;
    let K = 30;
    let J = 4;
    let {
      columns: Q,
      rows: Z
    } = Sr();
    let ne = Q - K - J;
    let ee = Math.max(1, Z - 26);
    return ag.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: z,
      children: [ag.jsx(mS, {
        color: "inactive"
      }), ag.jsxs(gXd, {
        flexDirection: "column",
        paddingTop: 0,
        children: [ag.jsx(_xt, {
          questions: t,
          currentQuestionIndex: n,
          answers: r,
          hideSubmitTab: s
        }), ag.jsx(qNe, {
          title: e.question,
          color: "text"
        }), ag.jsxs(gXd, {
          flexDirection: "column",
          children: [ag.jsxs(gXd, {
            marginTop: 1,
            flexDirection: "row",
            gap: 4,
            children: [ag.jsx(gXd, {
              flexDirection: "column",
              width: 30,
              children: A.map((re, se) => {
                let ae = k === se;
                let de = L === re.label;
                return ag.jsxs(gXd, {
                  flexDirection: "row",
                  children: [ae ? ag.jsx(Text, {
                    color: "suggestion",
                    children: vGd.pointer
                  }) : ag.jsx(Text, {
                    children: " "
                  }), ag.jsxs(Text, {
                    dimColor: true,
                    children: [" ", se + 1, "."]
                  }), ag.jsxs(Text, {
                    color: de ? "success" : ae ? "suggestion" : undefined,
                    bold: ae,
                    children: [" ", re.label]
                  }), de && ag.jsxs(Text, {
                    color: "success",
                    children: [" ", vGd.tick]
                  })]
                }, re.label);
              })
            }), ag.jsxs(gXd, {
              flexDirection: "column",
              flexGrow: 1,
              children: [ag.jsx(sPc, {
                content: V || "No preview available",
                maxLines: ee,
                minWidth: i,
                maxWidth: ne
              }), ag.jsxs(gXd, {
                marginTop: 1,
                flexDirection: "row",
                gap: 1,
                children: [ag.jsx(Text, {
                  color: "suggestion",
                  children: "Notes:"
                }), g ? ag.jsx(Dl, {
                  value: P,
                  placeholder: "Add notes on this design\u2026",
                  onChange: re => {
                    a(C, {
                      textInputValue: re
                    }, false);
                  },
                  onSubmit: N,
                  onExit: U,
                  focus: true,
                  showCursor: true,
                  columns: 60,
                  cursorOffset: _,
                  onChangeCursorOffset: b,
                  disableEscapeDoublePress: true
                }) : ag.jsx(Text, {
                  dimColor: true,
                  italic: true,
                  children: P || "press n to add notes"
                })]
              })]
            })]
          }), ag.jsxs(gXd, {
            flexDirection: "column",
            marginTop: 1,
            children: [ag.jsx(mS, {
              color: "inactive"
            }), ag.jsxs(gXd, {
              flexDirection: "row",
              gap: 1,
              children: [f ? ag.jsx(Text, {
                color: "suggestion",
                children: vGd.pointer
              }) : ag.jsx(Text, {
                children: " "
              }), ag.jsx(Text, {
                color: f ? "suggestion" : undefined,
                children: "Chat about this"
              })]
            })]
          }), ag.jsx(gXd, {
            marginTop: 1,
            children: ag.jsx(Text, {
              color: "inactive",
              dimColor: true,
              children: ag.jsxs(Hn, {
                children: [ag.jsx(xt, {
                  chord: "enter",
                  action: "select"
                }), ag.jsx(xt, {
                  chord: ["up", "down"],
                  action: "navigate"
                }), ag.jsx(xt, {
                  chord: "n",
                  action: "add notes"
                }), t.length > 1 && ag.jsx(xt, {
                  chord: "tab",
                  action: "switch questions"
                }), g && E && ag.jsx(xt, {
                  chord: "ctrl+g",
                  action: `edit in ${E}`
                }), ag.jsx(xt, {
                  chord: "escape",
                  action: "cancel"
                })]
              })
            })
          })]
        })]
      })]
    });
  }
  var n4;
  var ag;
  var cPc = __lazy(() => {
    ki();
    et();
    Bs();
    n7t();
    SUe();
    bT();
    Lfe();
    Ai();
    oX();
    bs();
    q_();
    K6t();
    iPc();
    jgr();
    n4 = __toESM(ot(), 1);
    ag = __toESM(ie(), 1);
  });
  function dPc(e) {
    let t = uPc.c(59);
    let {
      question: n,
      questions: r,
      currentQuestionIndex: o,
      answers: s,
      questionStates: i,
      hideSubmitTab: a,
      planFilePath: l,
      minContentWidth: c,
      onUpdateQuestionState: u,
      onAnswer: d,
      onTextInputFocus: p,
      onCancel: m,
      onSubmit: f,
      onTabPrev: h,
      onTabNext: g,
      onRespondToClaude: y,
      onImagePaste: _,
      pastedContents: b,
      onRemoveImage: S
    } = e;
    let E = a === undefined ? false : a;
    let C = bt(DIf) === "plan";
    let x = useIsScreenReaderEnabled();
    let [A, k] = yon.useState(false);
    let [I, O] = yon.useState(false);
    let M;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      let xe = v5();
      M = xe ? S0(xe) : null;
      t[0] = M;
    } else {
      M = t[0];
    }
    let L = M;
    let P;
    if (t[1] !== p) {
      P = xe => {
        let ke = xe === "__other__";
        O(ke);
        p(ke);
      };
      t[1] = p;
      t[2] = P;
    } else {
      P = t[2];
    }
    let F = P;
    let H;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      H = () => {
        k(true);
      };
      t[3] = H;
    } else {
      H = t[3];
    }
    let U = H;
    let N;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      N = () => {
        k(false);
      };
      t[4] = N;
    } else {
      N = t[4];
    }
    let W = N;
    let z = n.options.length + 1 + 1;
    let V;
    if (t[5] !== z || t[6] !== A || t[7] !== I || t[8] !== x || t[9] !== m || t[10] !== y) {
      V = xe => {
        if (!A) {
          if (!x && !I && N7(xe.key) === String(z)) {
            xe.preventDefault();
            y();
          }
          return;
        }
        if (xe.key === "up" || xe.ctrl && xe.key === "p") {
          xe.preventDefault();
          W();
          return;
        }
        if (xe.key === "return" || N7(xe.key) === String(z)) {
          xe.preventDefault();
          y();
          return;
        }
        if (xe.key === "escape") {
          xe.preventDefault();
          m();
        }
      };
      t[5] = z;
      t[6] = A;
      t[7] = I;
      t[8] = x;
      t[9] = m;
      t[10] = y;
      t[11] = V;
    } else {
      V = t[11];
    }
    let K = V;
    let J = n.options.map(OIf);
    let Q = n.question;
    let Z = i[Q];
    let ne = yon.useRef(null);
    let oe;
    if (t[12] !== u || t[13] !== n.multiSelect || t[14] !== Q) {
      oe = async (xe, ke) => {
        let Ie = await KZ(xe);
        if (Ie.content !== null && Ie.content !== xe) {
          ke(Ie.content);
          u(Q, {
            textInputValue: Ie.content
          }, n.multiSelect ?? false);
        }
      };
      t[12] = u;
      t[13] = n.multiSelect;
      t[14] = Q;
      t[15] = oe;
    } else {
      oe = t[15];
    }
    let ee = oe;
    let re = n.multiSelect ? "Type something" : "Type something.";
    let se = Z?.textInputValue ?? "";
    let ae;
    if (t[16] !== u || t[17] !== n.multiSelect || t[18] !== Q) {
      ae = xe => {
        ne.current = {
          question: Q,
          value: xe
        };
        u(Q, {
          textInputValue: xe
        }, n.multiSelect ?? false);
      };
      t[16] = u;
      t[17] = n.multiSelect;
      t[18] = Q;
      t[19] = ae;
    } else {
      ae = t[19];
    }
    let de;
    if (t[20] !== ae || t[21] !== re || t[22] !== se) {
      de = {
        type: "input",
        value: "__other__",
        label: "Other",
        placeholder: re,
        initialValue: se,
        onChange: ae
      };
      t[20] = ae;
      t[21] = re;
      t[22] = se;
      t[23] = de;
    } else {
      de = t[23];
    }
    let be = de;
    let fe;
    if (t[24] !== x || t[25] !== n.multiSelect) {
      fe = x && !n.multiSelect ? [{
        type: "text",
        value: "__chat__",
        label: "Chat about this"
      }] : [];
      t[24] = x;
      t[25] = n.multiSelect;
      t[26] = fe;
    } else {
      fe = t[26];
    }
    let me = fe;
    let Te = [...J, be, ...me];
    if (!n.multiSelect && n.options.some(PIf) && !x) {
      let xe;
      if (t[27] !== s || t[28] !== o || t[29] !== E || t[30] !== c || t[31] !== d || t[32] !== m || t[33] !== y || t[34] !== g || t[35] !== h || t[36] !== p || t[37] !== u || t[38] !== n || t[39] !== i || t[40] !== r) {
        xe = A_.jsx(lPc, {
          question: n,
          questions: r,
          currentQuestionIndex: o,
          answers: s,
          questionStates: i,
          hideSubmitTab: E,
          minContentWidth: c,
          onUpdateQuestionState: u,
          onAnswer: d,
          onTextInputFocus: p,
          onCancel: m,
          onTabPrev: h,
          onTabNext: g,
          onRespondToClaude: y
        });
        t[27] = s;
        t[28] = o;
        t[29] = E;
        t[30] = c;
        t[31] = d;
        t[32] = m;
        t[33] = y;
        t[34] = g;
        t[35] = h;
        t[36] = p;
        t[37] = u;
        t[38] = n;
        t[39] = i;
        t[40] = r;
        t[41] = xe;
      } else {
        xe = t[41];
      }
      return xe;
    }
    let ce;
    if (t[42] !== C || t[43] !== l) {
      ce = C && l && A_.jsxs(gXd, {
        flexDirection: "column",
        gap: 0,
        children: [A_.jsx(mS, {
          color: "inactive"
        }), A_.jsxs(Text, {
          color: "inactive",
          children: ["Planning: ", A_.jsx(vM, {
            filePath: l
          })]
        })]
      });
      t[42] = C;
      t[43] = l;
      t[44] = ce;
    } else {
      ce = t[44];
    }
    let le;
    if (t[45] === Symbol.for("react.memo_cache_sentinel")) {
      le = A_.jsx(mS, {
        color: "inactive"
      });
      t[45] = le;
    } else {
      le = t[45];
    }
    let pe;
    if (t[46] !== s || t[47] !== o || t[48] !== E || t[49] !== r) {
      pe = A_.jsx(_xt, {
        questions: r,
        currentQuestionIndex: o,
        answers: s,
        hideSubmitTab: E
      });
      t[46] = s;
      t[47] = o;
      t[48] = E;
      t[49] = r;
      t[50] = pe;
    } else {
      pe = t[50];
    }
    let ve;
    if (t[51] !== n.question) {
      ve = A_.jsx(qNe, {
        title: n.question,
        color: "text"
      });
      t[51] = n.question;
      t[52] = ve;
    } else {
      ve = t[52];
    }
    let _e;
    if (t[53] !== z || t[54] !== A || t[55] !== I || t[56] !== x || t[57] !== r) {
      _e = !x && A_.jsxs(A_.Fragment, {
        children: [A_.jsxs(gXd, {
          flexDirection: "column",
          children: [A_.jsx(mS, {
            color: "inactive"
          }), A_.jsxs(gXd, {
            flexDirection: "row",
            gap: 1,
            children: [A ? A_.jsx(Text, {
              color: "suggestion",
              children: vGd.pointer
            }) : A_.jsx(Text, {
              children: " "
            }), A_.jsxs(Text, {
              color: A ? "suggestion" : undefined,
              children: [z, ". Chat about this"]
            })]
          })]
        }), A_.jsx(gXd, {
          marginTop: 1,
          children: A_.jsx(Text, {
            color: "inactive",
            dimColor: true,
            children: A_.jsxs(Hn, {
              children: [A_.jsx(xt, {
                chord: "enter",
                action: "select"
              }), r.length === 1 ? A_.jsx(xt, {
                chord: ["up", "down"],
                action: "navigate"
              }) : A_.jsx(Text, {
                children: "Tab/Arrow keys to navigate"
              }), I && L && A_.jsx(xt, {
                chord: "ctrl+g",
                action: `edit in ${L}`
              }), A_.jsx(xt, {
                chord: "escape",
                action: "cancel"
              })]
            })
          })
        })]
      });
      t[53] = z;
      t[54] = A;
      t[55] = I;
      t[56] = x;
      t[57] = r;
      t[58] = _e;
    } else {
      _e = t[58];
    }
    return A_.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 0,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: K,
      children: [ce, le, A_.jsxs(gXd, {
        flexDirection: "column",
        paddingTop: 0,
        children: [pe, ve, A_.jsxs(gXd, {
          flexDirection: "column",
          children: [A_.jsx(gXd, {
            marginTop: 1,
            children: n.multiSelect ? A_.jsx(eUe, {
              options: Te,
              defaultValue: i[n.question]?.selectedValue,
              onChange: xe => {
                u(Q, {
                  selectedValue: xe
                }, true);
                let ke = xe.includes("__other__") ? ne.current?.question === Q ? ne.current.value : i[Q]?.textInputValue : undefined;
                let Ie = xe.filter(IIf).concat(ke ? [ke] : []);
                d(Q, Ie, undefined, false);
              },
              onFocus: F,
              onCancel: m,
              submitButtonText: o === r.length - 1 ? "Submit" : "Next",
              onSubmit: f,
              onDownFromLastItem: U,
              isDisabled: A,
              onOpenEditor: ee,
              onImagePaste: _,
              pastedContents: b,
              onRemoveImage: S
            }, n.question) : A_.jsx(xr, {
              options: Te,
              defaultValue: i[n.question]?.selectedValue,
              onChange: xe => {
                if (xe === "__chat__") {
                  y();
                  return;
                }
                u(Q, {
                  selectedValue: xe
                }, false);
                let ke = xe === "__other__" ? i[Q]?.textInputValue : undefined;
                d(Q, xe, ke);
              },
              onFocus: F,
              onCancel: m,
              onDownFromLastItem: U,
              isDisabled: A,
              layout: "compact-vertical",
              onOpenEditor: ee,
              onImagePaste: _,
              pastedContents: b,
              onRemoveImage: S
            }, n.question)
          }), _e]
        })]
      })]
    });
  }
  function IIf(e) {
    return e !== "__other__";
  }
  function PIf(e) {
    return e.preview;
  }
  function OIf(e) {
    return {
      type: "text",
      value: e.label,
      label: e.label,
      description: e.description
    };
  }
  function DIf(e) {
    return e.toolPermissionContext.mode;
  }
  var uPc;
  var yon;
  var A_;
  var pPc = __lazy(() => {
    et();
    ho();
    SUe();
    bT();
    Lfe();
    Zn();
    OS();
    Ai();
    oX();
    bs();
    XTe();
    K6t();
    cPc();
    jgr();
    uPc = __toESM(pt(), 1);
    yon = __toESM(ot(), 1);
    A_ = __toESM(ie(), 1);
  });
  function fPc(e) {
    let t = mPc.c(24);
    let {
      questions: n,
      currentQuestionIndex: r,
      answers: o,
      allQuestionsAnswered: s,
      permissionResult: i,
      onFinalResponse: a
    } = e;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = iN.jsx(mS, {
        color: "inactive"
      });
      t[0] = l;
    } else {
      l = t[0];
    }
    let c;
    if (t[1] !== o || t[2] !== r || t[3] !== n) {
      c = iN.jsx(_xt, {
        questions: n,
        currentQuestionIndex: r,
        answers: o
      });
      t[1] = o;
      t[2] = r;
      t[3] = n;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      u = iN.jsx(qNe, {
        title: "Review your answers",
        color: "text"
      });
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== s) {
      d = !s && iN.jsx(gXd, {
        marginBottom: 1,
        children: iN.jsx(gA, {
          status: "warning",
          children: "You have not answered all questions"
        })
      });
      t[6] = s;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== o || t[9] !== n) {
      p = Object.keys(o).length > 0 && iN.jsx(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: n.filter(_ => _?.question && o[_.question]).map(_ => {
          let b = o[_?.question];
          return iN.jsxs(gXd, {
            flexDirection: "column",
            marginLeft: 1,
            children: [iN.jsx(Pw, {
              children: _?.question || "Question"
            }), iN.jsx(gXd, {
              marginLeft: 2,
              children: iN.jsxs(Text, {
                color: "success",
                children: [vGd.arrowRight, " ", b]
              })
            })]
          }, _?.question || "answer");
        })
      });
      t[8] = o;
      t[9] = n;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== i) {
      m = iN.jsx(FH, {
        permissionResult: i,
        toolType: "tool"
      });
      t[11] = i;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      f = iN.jsx(Text, {
        color: "inactive",
        children: "Ready to submit your answers?"
      });
      t[13] = f;
    } else {
      f = t[13];
    }
    let h;
    if (t[14] !== a) {
      h = iN.jsx(gXd, {
        marginTop: 1,
        children: iN.jsx(mc, {
          confirmLabel: "Submit answers",
          cancelLabel: "Cancel",
          onConfirm: () => a("submit"),
          onCancel: () => a("cancel")
        })
      });
      t[14] = a;
      t[15] = h;
    } else {
      h = t[15];
    }
    let g;
    if (t[16] !== d || t[17] !== p || t[18] !== m || t[19] !== h) {
      g = iN.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [d, p, m, f, h]
      });
      t[16] = d;
      t[17] = p;
      t[18] = m;
      t[19] = h;
      t[20] = g;
    } else {
      g = t[20];
    }
    let y;
    if (t[21] !== c || t[22] !== g) {
      y = iN.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [l, iN.jsxs(gXd, {
          flexDirection: "column",
          borderTop: true,
          borderColor: "inactive",
          paddingTop: 0,
          children: [c, u, g]
        })]
      });
      t[21] = c;
      t[22] = g;
      t[23] = y;
    } else {
      y = t[23];
    }
    return y;
  }
  var mPc;
  var iN;
  var hPc = __lazy(() => {
    et();
    Loe();
    b_();
    oX();
    nwt();
    K6t();
    QCe();
    jgr();
    mPc = __toESM(pt(), 1);
    iN = __toESM(ie(), 1);
  });
  function MIf(e, t) {
    switch (t.type) {
      case "next-question":
        return {
          ...e,
          currentQuestionIndex: e.currentQuestionIndex + 1,
          isInTextInput: false
        };
      case "prev-question":
        return {
          ...e,
          currentQuestionIndex: Math.max(0, e.currentQuestionIndex - 1),
          isInTextInput: false
        };
      case "update-question-state":
        {
          let n = e.questionStates[t.questionText];
          let r = {
            selectedValue: t.updates.selectedValue ?? n?.selectedValue ?? (t.isMultiSelect ? [] : undefined),
            textInputValue: t.updates.textInputValue ?? n?.textInputValue ?? ""
          };
          return {
            ...e,
            questionStates: {
              ...e.questionStates,
              [t.questionText]: r
            }
          };
        }
      case "set-answer":
        {
          let n = {
            ...e,
            answers: {
              ...e.answers,
              [t.questionText]: t.answer
            }
          };
          if (t.shouldAdvance) {
            return {
              ...n,
              currentQuestionIndex: n.currentQuestionIndex + 1,
              isInTextInput: false
            };
          }
          return n;
        }
      case "set-text-input-mode":
        return {
          ...e,
          isInTextInput: t.isInInput
        };
    }
  }
  function gPc() {
    let [e, t] = YBe.useReducer(MIf, NIf);
    let n = YBe.useCallback(() => {
      t({
        type: "next-question"
      });
    }, []);
    let r = YBe.useCallback(() => {
      t({
        type: "prev-question"
      });
    }, []);
    let o = YBe.useCallback((a, l, c) => {
      t({
        type: "update-question-state",
        questionText: a,
        updates: l,
        isMultiSelect: c
      });
    }, []);
    let s = YBe.useCallback((a, l, c = true) => {
      t({
        type: "set-answer",
        questionText: a,
        answer: l,
        shouldAdvance: c
      });
    }, []);
    let i = YBe.useCallback(a => {
      t({
        type: "set-text-input-mode",
        isInInput: a
      });
    }, []);
    return {
      currentQuestionIndex: e.currentQuestionIndex,
      answers: e.answers,
      questionStates: e.questionStates,
      isInTextInput: e.isInTextInput,
      nextQuestion: n,
      prevQuestion: r,
      updateQuestionState: o,
      setAnswer: s,
      setTextInputMode: i
    };
  }
  var YBe;
  var NIf;
  var yPc = __lazy(() => {
    YBe = __toESM(ot(), 1);
    NIf = {
      currentQuestionIndex: 0,
      answers: {},
      questionStates: {},
      isInTextInput: false
    };
  });
  function _Pc({
    enabled: e,
    timeoutMs: t,
    countdownThresholdMs: n,
    onTimeout: r
  }) {
    t ??= Me.CLAUDE_AFK_TIMEOUT_MS ?? 60000;
    n = Math.min(n ?? Me.CLAUDE_AFK_COUNTDOWN_MS ?? 20000, t);
    let o = nRe.useEffectEvent(r);
    let s = Math.ceil(t / 1000);
    let [i, a] = nRe.useState(s);
    let l = nRe.useRef(false);
    let c = nRe.useRef(Date.now());
    nRe.useEffect(() => {
      if (!e) {
        return;
      }
      c.current = Date.now();
      l.current = false;
      a(s);
    }, [e, s]);
    useInterval(() => {
      if (l.current) {
        return;
      }
      flushInteractionTime();
      let d = Date.now();
      if (getTerminalFocus() === true) {
        c.current = d;
      }
      let p = d - Math.max(getLastInteractionTime(), c.current);
      let m = p >= t - n ? Math.max(0, Math.ceil((t - p) / 1000)) : s;
      if (a(m), p >= t) {
        l.current = true;
        o(t);
      }
    }, e ? 1000 : null);
    let u = i * 1000 <= n;
    return {
      remainingSeconds: i,
      showCountdown: u,
      timeoutMs: t
    };
  }
  var nRe;
  function TPc(e) {
    let t = qgr.c(5);
    let n = K_();
    let r;
    if (t[0] !== n.syntaxHighlightingDisabled) {
      r = n.syntaxHighlightingDisabled ? null : GDe();
      t[0] = n.syntaxHighlightingDisabled;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = r;
    let s;
    if (t[2] !== o || t[3] !== e) {
      s = rRe.jsx(BIf, {
        ...e,
        highlight: o
      });
      t[2] = o;
      t[3] = e;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function BIf(e) {
    let t = qgr.c(100);
    let {
      payload: n,
      answer: r,
      highlight: o
    } = e;
    let s = n.questions;
    let i = n.metadataSource;
    let [a] = useTheme();
    let l = 40;
    for (let kt of s) {
      for (let Ye of kt.options) {
        if (!Ye.preview) {
          continue;
        }
        let ht = NXn(Ye.preview, a, o);
        for (let It of ht.split(`
`)) {
          l = Math.max(l, an(It));
        }
      }
    }
    let c = l;
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = {};
      t[0] = u;
    } else {
      u = t[0];
    }
    let [d, p] = Wgr.useState(u);
    let m = Wgr.useRef(0);
    let f = Lo();
    let h;
    if (t[1] !== f) {
      h = function (Ye, ht, It, Rt, wt, vt) {
        m.current = m.current + 1;
        let yt = m.current;
        let gt = {
          id: yt,
          type: "image",
          content: ht,
          mediaType: It || "image/png",
          filename: Rt || "Pasted image",
          dimensions: wt
        };
        LRt(gt, f);
        FRt(gt, f);
        p(Ft => ({
          ...Ft,
          [Ye]: {
            ...(Ft[Ye] ?? {}),
            [yt]: gt
          }
        }));
      };
      t[1] = f;
      t[2] = h;
    } else {
      h = t[2];
    }
    let g = h;
    let y;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      y = (kt, Ye) => {
        p(ht => {
          let It = {
            ...(ht[kt] ?? {})
          };
          delete It[Ye];
          return {
            ...ht,
            [kt]: It
          };
        });
      };
      t[3] = y;
    } else {
      y = t[3];
    }
    let _ = y;
    let b;
    if (t[4] !== d) {
      b = Object.values(d).flatMap(WIf).filter(qIf);
      t[4] = d;
      t[5] = b;
    } else {
      b = t[5];
    }
    let S = b;
    let E = bt(jIf);
    let C = dR();
    let x;
    if (t[6] !== C) {
      x = Yg(C);
      t[6] = C;
      t[7] = x;
    } else {
      x = t[7];
    }
    let A = x;
    let k = E === "plan";
    let I;
    if (t[8] !== k) {
      I = k ? getPlanFilePath() : undefined;
      t[8] = k;
      t[9] = I;
    } else {
      I = t[9];
    }
    let O = I;
    let M = gPc();
    let {
      currentQuestionIndex: L,
      answers: P,
      questionStates: F,
      isInTextInput: H,
      nextQuestion: U,
      prevQuestion: N,
      updateQuestionState: W,
      setAnswer: j,
      setTextInputMode: z
    } = M;
    Jg("ask-user-question-text-input", H);
    let V = L < (s?.length || 0) ? s?.[L] : null;
    let K = L === (s?.length || 0);
    let J;
    if (t[10] !== P || t[11] !== s) {
      J = s?.every(kt => kt?.question && !!P[kt.question]) ?? false;
      t[10] = P;
      t[11] = s;
      t[12] = J;
    } else {
      J = t[12];
    }
    let Q = J;
    let Z = s.length === 1 && !s[0]?.multiSelect;
    let ne;
    if (t[13] !== r || t[14] !== k || t[15] !== i || t[16] !== s.length) {
      ne = () => {
        if (i) {
          logEvent("tengu_ask_user_question_rejected", {
            source_hash: i3i.createHash("sha256").update(i).digest("hex").slice(0, 12),
            questionCount: s.length,
            isInPlanMode: k
          });
        }
        r({
          behavior: "deny"
        });
      };
      t[13] = r;
      t[14] = k;
      t[15] = i;
      t[16] = s.length;
      t[17] = ne;
    } else {
      ne = t[17];
    }
    let oe = ne;
    let ee;
    if (t[18] !== S || t[19] !== r || t[20] !== P || t[21] !== A || t[22] !== k || t[23] !== i || t[24] !== F || t[25] !== s) {
      ee = async () => {
        let kt = await VIf({
          questions: s,
          answers: P,
          questionStates: F,
          imageAttachments: S,
          imageLimits: A
        });
        if (i) {
          logEvent("tengu_ask_user_question_respond_to_claude", {
            source_hash: i3i.createHash("sha256").update(i).digest("hex").slice(0, 12),
            questionCount: s.length,
            isInPlanMode: k
          });
        }
        r(kt);
      };
      t[18] = S;
      t[19] = r;
      t[20] = P;
      t[21] = A;
      t[22] = k;
      t[23] = i;
      t[24] = F;
      t[25] = s;
      t[26] = ee;
    } else {
      ee = t[26];
    }
    let re = ee;
    let se;
    if (t[27] !== S || t[28] !== r || t[29] !== A || t[30] !== k || t[31] !== i || t[32] !== n.input || t[33] !== F || t[34] !== s) {
      se = async kt => {
        let Ye = await SPc({
          questions: s,
          answersToSubmit: kt,
          questionStates: F,
          input: n.input,
          imageAttachments: S,
          imageLimits: A
        });
        if (i) {
          logEvent("tengu_ask_user_question_accepted", {
            source_hash: i3i.createHash("sha256").update(i).digest("hex").slice(0, 12),
            questionCount: s.length,
            answerCount: Object.keys(kt).length,
            isInPlanMode: k
          });
        }
        r(Ye);
      };
      t[27] = S;
      t[28] = r;
      t[29] = A;
      t[30] = k;
      t[31] = i;
      t[32] = n.input;
      t[33] = F;
      t[34] = s;
      t[35] = se;
    } else {
      se = t[35];
    }
    let ae = se;
    let de;
    if (t[36] !== P || t[37] !== d || t[38] !== s.length || t[39] !== j || t[40] !== ae) {
      de = (kt, Ye, ht, It) => {
        let Rt = It === undefined ? true : It;
        let wt;
        let vt = Array.isArray(Ye);
        if (vt) {
          wt = Ye.join(", ");
        } else if (ht) {
          wt = Object.values(d[kt] ?? {}).filter(HIf).length > 0 ? `${ht} (Image attached)` : ht;
        } else if (Ye === "__other__") {
          wt = Object.values(d[kt] ?? {}).filter($If).length > 0 ? "(Image attached)" : Ye;
        } else {
          wt = Ye;
        }
        let yt = s.length === 1;
        if (!vt && yt && Rt) {
          let gt = {
            ...P,
            [kt]: wt
          };
          ae(gt).catch(Oe);
          return;
        }
        j(kt, wt, Rt);
      };
      t[36] = P;
      t[37] = d;
      t[38] = s.length;
      t[39] = j;
      t[40] = ae;
      t[41] = de;
    } else {
      de = t[41];
    }
    let be = de;
    let fe;
    if (t[42] !== P || t[43] !== oe || t[44] !== ae) {
      fe = function (Ye) {
        if (Ye === "cancel") {
          oe();
          return;
        }
        if (Ye === "submit") {
          ae(P).catch(Oe);
        }
      };
      t[42] = P;
      t[43] = oe;
      t[44] = ae;
      t[45] = fe;
    } else {
      fe = t[45];
    }
    let me = fe;
    let Te = Z ? (s?.length || 1) - 1 : s?.length || 0;
    let ue;
    if (t[46] !== L || t[47] !== N) {
      ue = () => {
        if (L > 0) {
          N();
        }
      };
      t[46] = L;
      t[47] = N;
      t[48] = ue;
    } else {
      ue = t[48];
    }
    let ce = ue;
    let le;
    if (t[49] !== L || t[50] !== Te || t[51] !== U) {
      le = () => {
        if (L < Te) {
          U();
        }
      };
      t[49] = L;
      t[50] = Te;
      t[51] = U;
      t[52] = le;
    } else {
      le = t[52];
    }
    let pe = le;
    let ve;
    if (t[53] !== pe || t[54] !== ce) {
      ve = {
        "tabs:previous": ce,
        "tabs:next": pe
      };
      t[53] = pe;
      t[54] = ce;
      t[55] = ve;
    } else {
      ve = t[55];
    }
    let _e = !(H && !K);
    let xe;
    if (t[56] !== _e) {
      xe = {
        context: "Tabs",
        isActive: _e
      };
      t[56] = _e;
      t[57] = xe;
    } else {
      xe = t[57];
    }
    jo(ve, xe);
    let ke = useIsScreenReaderEnabled();
    let Ie;
    if (t[58] !== ke || t[59] !== n.hasExternalRacer) {
      Ie = !ke && !n.hasExternalRacer && !li();
      t[58] = ke;
      t[59] = n.hasExternalRacer;
      t[60] = Ie;
    } else {
      Ie = t[60];
    }
    let Ue = Ie;
    let Ge;
    if (t[61] !== S || t[62] !== r || t[63] !== P || t[64] !== A || t[65] !== k || t[66] !== i || t[67] !== n.input || t[68] !== F || t[69] !== s) {
      Ge = kt => {
        SPc({
          questions: s,
          answersToSubmit: P,
          questionStates: F,
          input: n.input,
          imageAttachments: S,
          imageLimits: A,
          afkTimeoutMs: kt
        }).then(Ye => {
          logEvent("tengu_ask_user_question_afk_auto_advance", {
            ...(i && {
              source_hash: i3i.createHash("sha256").update(i).digest("hex").slice(0, 12)
            }),
            timeoutMs: kt,
            questionCount: s.length,
            hadPartialAnswers: Object.keys(P).length > 0,
            isInPlanMode: k
          });
          r(Ye);
        }).catch(Oe);
      };
      t[61] = S;
      t[62] = r;
      t[63] = P;
      t[64] = A;
      t[65] = k;
      t[66] = i;
      t[67] = n.input;
      t[68] = F;
      t[69] = s;
      t[70] = Ge;
    } else {
      Ge = t[70];
    }
    let Be = Ge;
    let We;
    if (t[71] !== Q || t[72] !== P || t[73] !== V || t[74] !== L || t[75] !== c || t[76] !== oe || t[77] !== me || t[78] !== be || t[79] !== re || t[80] !== pe || t[81] !== ce || t[82] !== Z || t[83] !== K || t[84] !== U || t[85] !== g || t[86] !== d || t[87] !== n.permissionResult || t[88] !== O || t[89] !== F || t[90] !== s || t[91] !== z || t[92] !== W) {
      We = V ? rRe.jsx(dPc, {
        question: V,
        questions: s,
        currentQuestionIndex: L,
        answers: P,
        questionStates: F,
        hideSubmitTab: Z,
        minContentWidth: c,
        planFilePath: O,
        onUpdateQuestionState: W,
        onAnswer: be,
        onTextInputFocus: z,
        onCancel: oe,
        onSubmit: U,
        onTabPrev: ce,
        onTabNext: pe,
        onRespondToClaude: re,
        onImagePaste: (kt, Ye, ht, It, Rt) => g(V.question, kt, Ye, ht, It, Rt),
        pastedContents: d[V.question] ?? {},
        onRemoveImage: kt => _(V.question, kt)
      }) : K ? rRe.jsx(fPc, {
        questions: s,
        currentQuestionIndex: L,
        answers: P,
        allQuestionsAnswered: Q,
        permissionResult: n.permissionResult,
        onFinalResponse: me
      }) : null;
      t[71] = Q;
      t[72] = P;
      t[73] = V;
      t[74] = L;
      t[75] = c;
      t[76] = oe;
      t[77] = me;
      t[78] = be;
      t[79] = re;
      t[80] = pe;
      t[81] = ce;
      t[82] = Z;
      t[83] = K;
      t[84] = U;
      t[85] = g;
      t[86] = d;
      t[87] = n.permissionResult;
      t[88] = O;
      t[89] = F;
      t[90] = s;
      t[91] = z;
      t[92] = W;
      t[93] = We;
    } else {
      We = t[93];
    }
    let Ze;
    if (t[94] !== Ue || t[95] !== Be) {
      Ze = Ue ? rRe.jsx(GIf, {
        enabled: true,
        onTimeout: Be
      }) : null;
      t[94] = Ue;
      t[95] = Be;
      t[96] = Ze;
    } else {
      Ze = t[96];
    }
    let Tt;
    if (t[97] !== We || t[98] !== Ze) {
      Tt = rRe.jsxs(Act, {
        children: [We, Ze]
      });
      t[97] = We;
      t[98] = Ze;
      t[99] = Tt;
    } else {
      Tt = t[99];
    }
    return Tt;
  }
  function $If(e) {
    return e.type === "image";
  }
  function HIf(e) {
    return e.type === "image";
  }
  function jIf(e) {
    return e.toolPermissionContext.mode;
  }
  function qIf(e) {
    return e.type === "image";
  }
  function WIf(e) {
    return Object.values(e);
  }
  function GIf(e) {
    let t = qgr.c(8);
    let {
      enabled: n,
      onTimeout: r
    } = e;
    let o;
    if (t[0] !== n || t[1] !== r) {
      o = {
        enabled: n,
        onTimeout: r
      };
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      o = t[2];
    }
    let {
      remainingSeconds: s,
      showCountdown: i
    } = _Pc(o);
    let a;
    if (t[3] !== s || t[4] !== i) {
      a = i ? rRe.jsxs(Text, {
        color: "inactive",
        dimColor: true,
        children: ["auto-continue in ", s, "s \xB7 any key to stay"]
      }) : null;
      t[3] = s;
      t[4] = i;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== a) {
      l = rRe.jsx(gXd, {
        height: 1,
        justifyContent: "flex-end",
        children: a
      });
      t[6] = a;
      t[7] = l;
    } else {
      l = t[7];
    }
    return l;
  }
  async function SPc(e) {
    let {
      questions: t,
      answersToSubmit: n,
      questionStates: r,
      input: o
    } = e;
    let s = {};
    for (let l of t) {
      let c = n[l.question];
      let u = EPc(l) ? r[l.question]?.textInputValue : undefined;
      let p = (c ? l.options.find(m => m.label === c) : undefined)?.preview;
      if (p || u?.trim()) {
        s[l.question] = {
          ...(p && {
            preview: p
          }),
          ...(u?.trim() && {
            notes: u.trim()
          })
        };
      }
    }
    let i = {
      ...o,
      answers: n,
      annotations: s,
      ...(e.afkTimeoutMs && {
        afkTimeoutMs: e.afkTimeoutMs
      })
    };
    let a = await vPc(e.imageAttachments, e.imageLimits);
    return {
      behavior: "allow",
      updatedInput: i,
      ...(a && a.length > 0 && {
        contentBlocks: a
      })
    };
  }
  async function VIf(e) {
    let {
      questions: t,
      answers: n,
      questionStates: r
    } = e;
    let s = `The user wants to clarify these questions.
    This means they may have additional information, context or questions for you.
    Take their response into account and then reformulate the questions if appropriate.
    Start by asking them what they would like to clarify.

    Questions asked:
${zIf(t, n, r)}`;
    let i = await vPc(e.imageAttachments, e.imageLimits);
    return {
      behavior: "deny",
      feedback: s,
      ...(i && i.length > 0 && {
        contentBlocks: i
      })
    };
  }
  function zIf(e, t, n) {
    return e.map(r => {
      let o = t[r.question];
      let s = EPc(r) ? n[r.question]?.textInputValue?.trim() : undefined;
      let i = [`- "${r.question}"`];
      if (i.push(o ? `  Answer: ${o}` : "  (No answer provided)"), s) {
        i.push(`  User notes: ${s}`);
      }
      return i.join(`
`);
    }).join(`
`);
  }
  function EPc(e) {
    return !e.multiSelect && e.options.some(t => t.preview);
  }
  async function vPc(e, t) {
    if (e.length === 0) {
      return;
    }
    return Promise.all(e.map(async n => {
      let {
        block: r
      } = await f1({
        data: n.content,
        mediaType: n.mediaType,
        limits: t
      });
      return r;
    }));
  }
  var qgr;
  var Wgr;
  var rRe;
  var wPc = __lazy(() => {
    C1n();
    pPc();
    hPc();
    yPc();
    px();
    iH();
    Qq();
    bc();
    et();
    Bs();
    Ot();
    ho();
    f5e();
    yd();
    dw();
    yG();
    URt();
    Rn();
    d7t();
    JF();
    xx();
    qgr = __toESM(pt(), 1);
    Wgr = __toESM(ot(), 1);
    rRe = __toESM(ie(), 1);
  });
  var KIf;
  var YIf;
  var CPc = __lazy(() => {
    et();
    KIf = __toESM(pt(), 1);
    YIf = __toESM(ie(), 1);
  });
  function JIf(e) {
    switch (e.length) {
      case 0:
        return "";
      case 1:
        return NE.jsx(Text, {
          bold: true,
          children: e[0]
        });
      case 2:
        return NE.jsxs(Text, {
          children: [NE.jsx(Text, {
            bold: true,
            children: e[0]
          }), " and ", NE.jsx(Text, {
            bold: true,
            children: e[1]
          })]
        });
      default:
        return NE.jsxs(Text, {
          children: [NE.jsx(Text, {
            bold: true,
            children: e.slice(0, -1).join(", ")
          }), ", and", " ", NE.jsx(Text, {
            bold: true,
            children: e.slice(-1)[0]
          })]
        });
    }
  }
  function sZo(e) {
    if (e.join(", ").length > 50) {
      return "similar";
    }
    return JIf(e);
  }
  function _on(e) {
    if (e.length === 0) {
      return "";
    }
    let t = e.map(n => Iee.basename(n) || n);
    if (t.length === 1) {
      return NE.jsxs(Text, {
        children: [NE.jsx(Text, {
          bold: true,
          children: t[0]
        }), Iee.sep]
      });
    }
    if (t.length === 2) {
      return NE.jsxs(Text, {
        children: [NE.jsx(Text, {
          bold: true,
          children: t[0]
        }), Iee.sep, " and ", NE.jsx(Text, {
          bold: true,
          children: t[1]
        }), Iee.sep]
      });
    }
    return NE.jsxs(Text, {
      children: [NE.jsx(Text, {
        bold: true,
        children: t[0]
      }), Iee.sep, ", ", NE.jsx(Text, {
        bold: true,
        children: t[1]
      }), Iee.sep, " and ", e.length - 2, " more"]
    });
  }
  function Ggr(e, t, n) {
    let r = e.filter(p => p.type === "addRules").flatMap(p => p.rules || []);
    let o = r.filter(p => p.toolName === "Read");
    let s = r.filter(p => p.toolName === t);
    let i = e.filter(p => p.type === "addDirectories").flatMap(p => p.directories || []);
    let a = o.map(p => p.ruleContent?.replace("/**", "") || "").filter(p => p);
    let l = Ro(s.flatMap(p => {
      if (!p.ruleContent) {
        return [];
      }
      let m = p.ruleContent.endsWith(":*") || p.ruleContent.endsWith(" *") ? p.ruleContent.slice(0, -2) : p.ruleContent;
      return n ? n(m) : m;
    }));
    let c = i.length > 0;
    let u = a.length > 0;
    let d = l.length > 0;
    if (u && !c && !d) {
      if (a.length === 1) {
        let p = a[0];
        let m = Iee.basename(p) || p;
        return NE.jsxs(Text, {
          children: ["Yes, allow reading from ", NE.jsx(Text, {
            bold: true,
            children: m
          }), Iee.sep, " from this project"]
        });
      }
      return NE.jsxs(Text, {
        children: ["Yes, allow reading from ", _on(a), " from this project"]
      });
    }
    if (c && !u && !d) {
      if (i.length === 1) {
        let p = i[0];
        let m = Iee.basename(p) || p;
        return NE.jsxs(Text, {
          children: ["Yes, and always allow access to ", NE.jsx(Text, {
            bold: true,
            children: m
          }), Iee.sep, " from this project"]
        });
      }
      return NE.jsxs(Text, {
        children: ["Yes, and always allow access to ", _on(i), " from this project"]
      });
    }
    if (d && !c && !u) {
      return NE.jsxs(Text, {
        children: ["Yes, and don't ask again for ", sZo(l), " commands in", " ", NE.jsx(Text, {
          bold: true,
          children: aCt(getOriginalCwd())
        })]
      });
    }
    if ((c || u) && !d) {
      let p = [...i, ...a];
      if (c && u) {
        return NE.jsxs(Text, {
          children: ["Yes, and always allow access to ", _on(p), " from this project"]
        });
      }
    }
    if ((c || u) && d) {
      let p = [...i, ...a];
      if (p.length === 1 && l.length === 1) {
        return NE.jsxs(Text, {
          children: ["Yes, and allow access to ", _on(p), " and", " ", sZo(l), " commands"]
        });
      }
      return NE.jsxs(Text, {
        children: ["Yes, and allow ", _on(p), " access and", " ", sZo(l), " commands"]
      });
    }
    return null;
  }
  var Iee;
  var NE;
  var iZo = __lazy(() => {
    at();
    et();
    eur();
    Iee = require("path");
    NE = __toESM(ie(), 1);
  });
  function Kgr(e) {
    let t = RPc.c(10);
    let n = bt(XIf);
    let r = Lo();
    let {
      addNotification: o
    } = Fi();
    let s;
    if (t[0] !== n) {
      s = (n.mode === "default" || n.mode === "acceptEdits") && Bhr(n);
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a = e?.type === "workflow-agent" && i;
    let l;
    if (t[2] !== o || t[3] !== r || t[4] !== n) {
      l = d => {
        if (!setPermissionModeWithGuards("auto", n, f => r(h => {
          let g = f(h.toolPermissionContext);
          if (g === h.toolPermissionContext) {
            return h;
          }
          return {
            ...h,
            toolPermissionContext: g
          };
        }), d === undefined ? "workflow_permission_prompt" : d).ok) {
          let f = getAutoModeUnavailableReason();
          o({
            key: "workflow-auto-mode-unavailable",
            text: f !== null ? getAutoModeUnavailableNotification(f) : "auto mode is unavailable right now",
            color: "warning",
            priority: "high"
          });
          return false;
        }
        return true;
      };
      t[2] = o;
      t[3] = r;
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c = l;
    let u;
    if (t[6] !== i || t[7] !== c || t[8] !== a) {
      u = {
        offered: a,
        canOfferAutoMode: i,
        enableAutoMode: c
      };
      t[6] = i;
      t[7] = c;
      t[8] = a;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  function XIf(e) {
    return e.toolPermissionContext;
  }
  var RPc;
  var Ygr = __lazy(() => {
    Nd();
    ho();
    Hhr();
    S_();
    RPc = __toESM(pt(), 1);
  });
  function QIf(e) {
    let {
      commandWithoutRedirections: t,
      redirections: n
    } = tpe(e);
    return n.length > 0 ? t : e;
  }
  function xPc({
    suggestions: e = [],
    decisionReason: t,
    onRejectFeedbackChange: n,
    onAcceptFeedbackChange: r,
    onClassifierDescriptionChange: o,
    classifierDescription: s,
    initialClassifierDescriptionEmpty: i = false,
    existingAllowDescriptions: a = [],
    yesInputMode: l = false,
    noInputMode: c = false,
    editablePrefix: u,
    onEditablePrefixChange: d,
    showEnableAutoModeOption: p = false,
    enableAutoModeDescription: m = zgr
  }) {
    let f = [];
    if (l) {
      f.push({
        type: "input",
        label: "Yes",
        value: "yes",
        placeholder: "and tell Claude what to do next",
        onChange: r,
        allowEmptySubmitToCancel: true
      });
    } else {
      f.push({
        label: "Yes",
        value: "yes"
      });
    }
    if (Umt()) {
      let h = e.some(y => y.type === "addDirectories" || y.type === "addRules" && y.rules?.some(_ => _.toolName !== "Bash"));
      if (u !== undefined && d && !h && e.length > 0) {
        f.push({
          type: "input",
          label: "Yes, and don\u2019t ask again for",
          value: "yes-prefix-edited",
          placeholder: "command prefix (e.g., npm run *)",
          initialValue: u,
          onChange: d,
          allowEmptySubmitToCancel: true,
          showLabelWithValue: true,
          labelValueSeparator: ": ",
          resetCursorOnUpdate: true
        });
      } else if (e.length > 0) {
        let y = Ggr(e, "Bash", QIf);
        if (y) {
          f.push({
            label: y,
            value: "yes-apply-suggestions"
          });
        }
      }
      let g = f.some(y => y.value === "yes-prefix-edited");
    }
    if (p) {
      f.push({
        label: "Yes, and switch to auto mode",
        description: m,
        value: "yes-enable-auto-mode"
      });
    }
    if (c) {
      f.push({
        type: "input",
        label: "No",
        value: "no",
        placeholder: "and tell Claude what to do differently",
        onChange: n,
        allowEmptySubmitToCancel: true
      });
    } else {
      f.push({
        label: "No",
        value: "no"
      });
    }
    return f;
  }
  var kPc = __lazy(() => {
    bU();
    iZo();
    Ygr();
  });
  function iPf(e) {
    if (typeof e === "string") {
      return e;
    }
    try {
      return De(e, null, 2);
    } catch {
      return String(e);
    }
  }
  function aPf(e, t = 1000) {
    let n = e.filter(s => s.type === "assistant").slice(-3);
    let r = [];
    let o = 0;
    for (let s of n.reverse()) {
      let i = s.message.content.filter(a => a.type === "text").map(a => "text" in a ? a.text : "").join(" ");
      if (i && o < t) {
        let a = t - o;
        let l = i.length > a ? pC(i, a) + "..." : i;
        r.unshift(l);
        o += l.length;
      }
    }
    return r.join(`

`);
  }
  function aZo() {
    return getGlobalConfig().permissionExplainerEnabled !== false;
  }
  async function APc({
    toolName: e,
    toolInput: t,
    toolDescription: n,
    messages: r,
    signal: o
  }) {
    if (!aZo()) {
      return null;
    }
    let s = Date.now();
    try {
      let i = iPf(t);
      let a = r.length ? aPf(r) : "";
      let l = `Tool: ${e}
${n ? `Description: ${n}
` : ""}
Input:
${i}
${a ? `
Recent conversation context:
${a}` : ""}

Explain this command in context.`;
      let c = getMainLoopModel();
      let u = await BU({
        model: c,
        system: "Analyze shell commands and explain what they do, why you're running them, and potential risks.",
        messages: [{
          role: "user",
          content: l
        }],
        tools: [oPf],
        tool_choice: {
          type: "tool",
          name: "explain_command"
        },
        signal: o,
        querySource: "permission_explainer"
      });
      let d = Date.now() - s;
      logForDebugging(`Permission explainer: API returned in ${d}ms, stop_reason=${u.stop_reason}`);
      let p = u.content.find(m => m.type === "tool_use");
      if (p && p.type === "tool_use") {
        logForDebugging(`Permission explainer: tool input: ${De(p.input).slice(0, 500)}`);
        let m = sPf().safeParse(p.input);
        if (m.success) {
          let f = {
            riskLevel: m.data.riskLevel,
            explanation: m.data.explanation,
            reasoning: m.data.reasoning,
            risk: m.data.risk
          };
          logEvent("tengu_permission_explainer_generated", {
            tool_name: qi(e),
            risk_level: ZIf[f.riskLevel],
            latency_ms: d
          });
          Pe("permission_explainer_generate");
          logForDebugging(`Permission explainer: ${f.riskLevel} risk for ${e} (${d}ms)`);
          return f;
        }
      }
      logEvent("tengu_permission_explainer_error", {
        tool_name: qi(e),
        error_type: 1,
        latency_ms: d
      });
      Et("permission_explainer_generate", "parse_failed");
      logForDebugging("Permission explainer: no parsed output in response");
      return null;
    } catch (i) {
      let a = Date.now() - s;
      if (o.aborted) {
        logForDebugging(`Permission explainer: request aborted for ${e}`);
        return null;
      }
      logForDebugging(`Permission explainer error: ${he(i)}`, {
        level: "error"
      });
      logEvent("tengu_permission_explainer_error", {
        tool_name: qi(e),
        error_type: i instanceof Error && i.name === "AbortError" ? 2 : 3,
        latency_ms: a
      });
      Ae("permission_explainer_generate", "api_error");
      return null;
    }
  }
  var ZIf;
  var oPf;
  var sPf;
  var IPc = __lazy(() => {
    ln();
    Ot();
    Gu();
    je();
    dt();
    Eo();
    xme();
    Zn();
    ZIf = {
      LOW: 1,
      MEDIUM: 2,
      HIGH: 3
    };
    oPf = {
      name: "explain_command",
      description: "Provide an explanation of a shell command",
      input_schema: {
        type: "object",
        properties: {
          explanation: {
            type: "string",
            description: "What this command does (1-2 sentences)"
          },
          reasoning: {
            type: "string",
            description: 'Why YOU are running this command. Start with "I" - e.g. "I need to check the file contents"'
          },
          risk: {
            type: "string",
            description: "What could go wrong, under 15 words"
          },
          riskLevel: {
            type: "string",
            enum: ["LOW", "MEDIUM", "HIGH"],
            description: "LOW (safe dev workflows), MEDIUM (recoverable changes), HIGH (dangerous/irreversible)"
          }
        },
        required: ["explanation", "reasoning", "risk", "riskLevel"]
      }
    };
    sPf = we(() => v.object({
      riskLevel: v.enum(["LOW", "MEDIUM", "HIGH"]),
      explanation: v.string(),
      reasoning: v.string(),
      risk: v.string()
    }));
  });
  function lPf() {
    let e = bon.c(7);
    let [t, n] = fKt("responding", "Loading explanation\u2026", false);
    let r;
    if (e[0] !== n) {
      r = ("Loading explanation\u2026").split("").map((i, a) => aN.jsx(pGe, {
        char: i,
        index: a,
        glimmerIndex: n,
        messageColor: "inactive",
        shimmerColor: "text"
      }, a));
      e[0] = n;
      e[1] = r;
    } else {
      r = e[1];
    }
    let o;
    if (e[2] !== r) {
      o = aN.jsx(Text, {
        children: r
      });
      e[2] = r;
      e[3] = o;
    } else {
      o = e[3];
    }
    let s;
    if (e[4] !== t || e[5] !== o) {
      s = aN.jsx(gXd, {
        ref: t,
        children: o
      });
      e[4] = t;
      e[5] = o;
      e[6] = s;
    } else {
      s = e[6];
    }
    return s;
  }
  function cPf(e) {
    switch (e) {
      case "LOW":
        return "success";
      case "MEDIUM":
        return "warning";
      case "HIGH":
        return "error";
    }
  }
  function uPf(e) {
    switch (e) {
      case "LOW":
        return "Low risk";
      case "MEDIUM":
        return "Med risk";
      case "HIGH":
        return "High risk";
    }
  }
  function dPf(e, t) {
    return APc({
      toolName: e.toolName,
      toolInput: e.toolInput,
      toolDescription: e.toolDescription,
      messages: e.messages ?? [],
      signal: t
    }).catch(() => null);
  }
  function Jgr(e) {
    let t = bon.c(12);
    let n;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = aZo();
      t[0] = n;
    } else {
      n = t[0];
    }
    let r = n;
    let o = NI("confirm:toggleExplanation", "Confirmation", "ctrl+e");
    let [s, i] = Vie.useState(false);
    let [a, l] = Vie.useState(null);
    let c = Vie.useRef(null);
    let u;
    if (t[1] !== a || t[2] !== e || t[3] !== s) {
      u = () => {
        if (!s) {
          if (logEvent("tengu_permission_explainer_shortcut_used", {}), !a) {
            let h = new AbortController();
            c.current = h;
            l(dPf(e, h.signal));
          }
        }
        i(pPf);
      };
      t[1] = a;
      t[2] = e;
      t[3] = s;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      d = {
        context: "Confirmation",
        isActive: r
      };
      t[5] = d;
    } else {
      d = t[5];
    }
    uo("confirm:toggleExplanation", u, d);
    let p;
    let m;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      p = () => () => c.current?.abort();
      m = [];
      t[6] = p;
      t[7] = m;
    } else {
      p = t[6];
      m = t[7];
    }
    Vie.useEffect(p, m);
    let f;
    if (t[8] !== o || t[9] !== a || t[10] !== s) {
      f = {
        visible: s,
        enabled: r,
        chord: o,
        promise: a
      };
      t[8] = o;
      t[9] = a;
      t[10] = s;
      t[11] = f;
    } else {
      f = t[11];
    }
    return f;
  }
  function pPf(e) {
    return !e;
  }
  function mPf(e) {
    let t = bon.c(21);
    let {
      promise: n
    } = e;
    let r = Vie.use(n);
    if (!r) {
      let p;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        p = aN.jsx(gXd, {
          marginTop: 1,
          children: aN.jsx(Text, {
            dimColor: true,
            children: "Explanation unavailable"
          })
        });
        t[0] = p;
      } else {
        p = t[0];
      }
      return p;
    }
    let o;
    if (t[1] !== r.explanation) {
      o = aN.jsx(Text, {
        children: r.explanation
      });
      t[1] = r.explanation;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== r.reasoning) {
      s = aN.jsx(gXd, {
        marginTop: 1,
        children: aN.jsx(Text, {
          children: r.reasoning
        })
      });
      t[3] = r.reasoning;
      t[4] = s;
    } else {
      s = t[4];
    }
    let i;
    if (t[5] !== r.riskLevel) {
      i = cPf(r.riskLevel);
      t[5] = r.riskLevel;
      t[6] = i;
    } else {
      i = t[6];
    }
    let a;
    if (t[7] !== r.riskLevel) {
      a = uPf(r.riskLevel);
      t[7] = r.riskLevel;
      t[8] = a;
    } else {
      a = t[8];
    }
    let l;
    if (t[9] !== i || t[10] !== a) {
      l = aN.jsxs(Text, {
        color: i,
        children: [a, ":"]
      });
      t[9] = i;
      t[10] = a;
      t[11] = l;
    } else {
      l = t[11];
    }
    let c;
    if (t[12] !== r.risk) {
      c = aN.jsxs(Text, {
        children: [" ", r.risk]
      });
      t[12] = r.risk;
      t[13] = c;
    } else {
      c = t[13];
    }
    let u;
    if (t[14] !== l || t[15] !== c) {
      u = aN.jsx(gXd, {
        marginTop: 1,
        children: aN.jsxs(Text, {
          children: [l, c]
        })
      });
      t[14] = l;
      t[15] = c;
      t[16] = u;
    } else {
      u = t[16];
    }
    let d;
    if (t[17] !== o || t[18] !== s || t[19] !== u) {
      d = aN.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [o, s, u]
      });
      t[17] = o;
      t[18] = s;
      t[19] = u;
      t[20] = d;
    } else {
      d = t[20];
    }
    return d;
  }
  function Xgr(e) {
    let t = bon.c(3);
    let {
      visible: n,
      promise: r
    } = e;
    if (!n || !r) {
      return null;
    }
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = aN.jsx(gXd, {
        marginTop: 1,
        children: aN.jsx(lPf, {})
      });
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== r) {
      s = aN.jsx(Vie.Suspense, {
        fallback: o,
        children: aN.jsx(mPf, {
          promise: r
        })
      });
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  var bon;
  var Vie;
  var aN;
  var lZo = __lazy(() => {
    et();
    eOe();
    Bs();
    Ot();
    IPc();
    Pjt();
    IJn();
    bon = __toESM(pt(), 1);
    Vie = __toESM(ot(), 1);
    aN = __toESM(ie(), 1);
  });
  function fPf() {
    let e = DPc.c(6);
    let [t, n] = fKt("requesting", "Attempting to auto-approve\u2026", false);
    let r;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = [..."Attempting to auto-approve\u2026"];
      e[0] = r;
    } else {
      r = e[0];
    }
    let o;
    if (e[1] !== n) {
      o = Gx.jsx(Text, {
        children: r.map((i, a) => Gx.jsx(pGe, {
          char: i,
          index: a,
          glimmerIndex: n,
          messageColor: "inactive",
          shimmerColor: "subtle"
        }, a))
      });
      e[1] = n;
      e[2] = o;
    } else {
      o = e[2];
    }
    let s;
    if (e[3] !== t || e[4] !== o) {
      s = Gx.jsx(gXd, {
        ref: t,
        children: o
      });
      e[3] = t;
      e[4] = o;
      e[5] = s;
    } else {
      s = e[5];
    }
    return s;
  }
  function Son(e, t, n = {}) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(n.feedback && {
            feedback: n.feedback
          })
        };
      case "yes-apply-suggestions":
        {
          let r = "suggestions" in t.permissionResult ? t.permissionResult.suggestions ?? [] : [];
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: r
          };
        }
      case "yes-prefix-edited":
        {
          let r = (n.editablePrefix ?? "").trim();
          if (!r) {
            return {
              behavior: "allow",
              updatedInput: t.input
            };
          }
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: [{
              type: "addRules",
              rules: [{
                toolName: "Bash",
                ruleContent: r
              }],
              behavior: "allow",
              destination: "localSettings"
            }]
          };
        }
      case "no":
        return {
          behavior: "deny",
          ...(n.feedback && {
            feedback: n.feedback
          })
        };
    }
    return {
      behavior: "allow",
      updatedInput: t.input
    };
  }
  function MPc({
    payload: e,
    answer: t
  }) {
    let n = Lo();
    let r = e.command;
    let o = e.permissionResult.decisionReason;
    let s = e.permissionResult.suggestions ?? [];
    let i = Jgr({
      toolName: e.toolName,
      toolInput: e.input,
      toolDescription: e.description
    });
    let [a, l] = $v.useState("");
    let [c, u] = $v.useState("");
    let [d, p] = $v.useState(false);
    let [m, f] = $v.useState(false);
    let [h, g] = $v.useState("yes");
    let [y, _] = $v.useState(false);
    let [b, S] = $v.useState(false);
    let E = typeof e.input.description === "string" ? oR(e.input.description) : "";
    let [C, x] = $v.useState(E);
    let [A, k] = $v.useState(!E.trim());
    $v.useEffect(() => {
      return;
    }, [r, E]);
    let I = o?.type === "subcommandResults";
    let [O, M] = $v.useState(() => {
      if (I) {
        let se = qGt(s).filter(ae => ae.toolName === "Bash" && ae.ruleContent);
        return se.length === 1 ? se[0].ruleContent : undefined;
      }
      let ee = E3n(r);
      if (ee) {
        return `${ee} *`;
      }
      let re = VDa(r);
      if (re) {
        return `${re} *`;
      }
      return r;
    });
    let L = $v.useRef(false);
    let P = $v.useCallback(ee => {
      L.current = true;
      M(ee);
    }, []);
    $v.useEffect(() => {
      if (I) {
        return;
      }
      let ee = false;
      b0a(r, () => false).then(async re => {
        if (ee || L.current) {
          return;
        }
        if (re.length === 0 || !re[0]) {
          return;
        }
        let se = await Eho(r, re[0]);
        if (ee || L.current) {
          return;
        }
        if (!GDa(se)) {
          M(`${re[0]} *`);
        }
      }).catch(() => {});
      return () => {
        ee = true;
      };
    }, [r, I]);
    let {
      destructiveWarning: F,
      sandboxingEnabled: H,
      isSandboxed: U
    } = $v.useMemo(() => {
      let ee = getFeatureValue_CACHED_MAY_BE_STALE("tengu_destructive_command_warning", false) ? O3i(r) : null;
      let re = SandboxManager.isSandboxingEnabled();
      let se = re && $1(e.input);
      return {
        destructiveWarning: ee,
        sandboxingEnabled: re,
        isSandboxed: se
      };
    }, [r, e.input]);
    let {
      offered: N,
      canOfferAutoMode: W,
      enableAutoMode: j
    } = Kgr(e.requestSource);
    let z = false;
    let V = $v.useMemo(() => xPc({
      suggestions: s,
      decisionReason: o,
      onRejectFeedbackChange: u,
      onAcceptFeedbackChange: l,
      onClassifierDescriptionChange: x,
      classifierDescription: C,
      initialClassifierDescriptionEmpty: A,
      existingAllowDescriptions: [...e.existingAllowDescriptions],
      yesInputMode: d,
      noInputMode: m,
      editablePrefix: O,
      onEditablePrefixChange: P,
      showEnableAutoModeOption: N || z,
      enableAutoModeDescription: undefined
    }), [s, o, C, A, e.existingAllowDescriptions, d, m, O, P, N, z]);
    let K = $v.useMemo(() => qi(e.toolName), [e.toolName]);
    let J = $v.useCallback(ee => {
      if (logEvent("tengu_permission_request_option_selected", {
        option_index: V.findIndex(re => re.value === ee) + 1
      }), ee === "yes") {
        let re = a.trim();
        logEvent("tengu_accept_submitted", {
          toolName: K,
          isMcp: e.isMcp,
          has_instructions: !!re,
          instructions_length: re.length,
          entered_feedback_mode: y
        });
        t(Son("yes", e, {
          feedback: re || undefined
        }));
        return;
      }
      if (ee === "no") {
        let re = c.trim();
        logEvent("tengu_reject_submitted", {
          toolName: K,
          isMcp: e.isMcp,
          has_instructions: !!re,
          instructions_length: re.length,
          entered_feedback_mode: b
        });
        t(Son("no", e, {
          feedback: re || undefined
        }));
        return;
      }
      if (ee === "yes-prefix-edited") {
        t(Son("yes-prefix-edited", e, {
          editablePrefix: O
        }));
        return;
      }
      if (ee === "yes-enable-auto-mode") {
        j("workflow_permission_prompt");
        t(Son("yes", e));
        return;
      }
      t(Son(ee, e));
    }, [t, e, a, c, O, C, K, y, b, j, N, V]);
    let Q = $v.useCallback(() => {
      logEvent("tengu_permission_request_escape", {});
      n(ee => ({
        ...ee,
        attribution: {
          ...ee.attribution,
          escapeCount: ee.attribution.escapeCount + 1
        }
      }));
      t({
        behavior: "deny"
      });
    }, [t, n]);
    let Z = $v.useCallback(ee => {
      let re = {
        toolName: K,
        isMcp: e.isMcp
      };
      if (ee === "yes") {
        if (d) {
          p(false);
          logEvent("tengu_accept_feedback_mode_collapsed", re);
        } else {
          p(true);
          _(true);
          logEvent("tengu_accept_feedback_mode_entered", re);
        }
      } else if (ee === "no") {
        if (m) {
          f(false);
          logEvent("tengu_reject_feedback_mode_collapsed", re);
        } else {
          f(true);
          S(true);
          logEvent("tengu_reject_feedback_mode_entered", re);
        }
      }
    }, [d, m, e.isMcp, K]);
    let ne = $v.useCallback(ee => {
      if (ee !== "yes" && d && !a.trim()) {
        p(false);
      }
      if (ee !== "no" && m && !c.trim()) {
        f(false);
      }
      g(ee);
    }, [d, m, a, c]);
    let oe = $v.useMemo(() => {
      return;
      switch (e.classifierState) {
        case "pending":
          return Gx.jsx(fPf, {});
        case "no-match":
        case "error":
          return Gx.jsx(Text, {
            dimColor: true,
            children: "Requires manual approval"
          });
        case "none":
          return;
      }
    }, [e.classifierState, z]);
    return Gx.jsxs(qm, {
      title: H && !U ? "Bash command (unsandboxed)" : "Bash command",
      subtitle: oe,
      requestSource: e.requestSource,
      children: [Gx.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [Gx.jsx(Text, {
          dimColor: i.visible,
          children: e.renderedToolUseMessage
        }), !i.visible && Gx.jsx(Text, {
          dimColor: true,
          children: e.description
        }), Gx.jsx(Xgr, {
          visible: i.visible,
          promise: i.promise
        })]
      }), Gx.jsxs(gXd, {
        flexDirection: "column",
        children: [Gx.jsx(FH, {
          permissionResult: e.permissionResult,
          toolType: "command"
        }), F && Gx.jsx(gXd, {
          marginBottom: 1,
          children: Gx.jsx(Text, {
            color: "warning",
            children: F
          })
        }), Gx.jsx(Text, {
          children: "Do you want to proceed?"
        }), Gx.jsx(xr, {
          options: V,
          inlineDescriptions: true,
          onChange: J,
          onCancel: Q,
          onFocus: ne,
          onInputModeToggle: Z
        })]
      }), Gx.jsx(gXd, {
        justifyContent: "space-between",
        marginTop: 1,
        children: Gx.jsx(Text, {
          dimColor: true,
          children: Gx.jsxs(Hn, {
            children: [Gx.jsx(xt, {
              chord: "escape",
              action: "cancel"
            }), (h === "yes" && !d || h === "no" && !m) && Gx.jsx(xt, {
              chord: "tab",
              action: "amend"
            }), i.enabled && Gx.jsx(xt, {
              chord: i.chord,
              action: i.visible ? "hide" : "explain"
            })]
          })
        })
      })]
    });
  }
  var DPc;
  var $v;
  var Gx;
  var NPc = __lazy(() => {
    $c();
    Ai();
    bs();
    CPc();
    kPc();
    XI();
    lZo();
    QCe();
    Ygr();
    Pjt();
    IJn();
    et();
    $n();
    Ot();
    Gu();
    ho();
    iWe();
    X5e();
    vho();
    Zk();
    Th();
    DPc = __toESM(pt(), 1);
    $v = __toESM(ot(), 1);
    Gx = __toESM(ie(), 1);
  });
  function hPf(e, t) {
    switch (e) {
      case "allow":
        return {
          behavior: "allow",
          updatedInput: t.input
        };
      case "allow-domain":
        return {
          behavior: "allow",
          updatedInput: t.input,
          permissionUpdates: t.chrome ? [{
            type: "addRules",
            rules: [{
              toolName: "ClaudeInChromeDomain",
              ruleContent: t.chrome.host
            }],
            behavior: "allow",
            destination: "session"
          }] : []
        };
      case "deny":
        return {
          behavior: "deny"
        };
    }
  }
  function gPf(e) {
    return e.showAlwaysAllow && !e.isAskCappedByOrg && !!e.chrome;
  }
  function FPc(e) {
    let t = LPc.c(27);
    let {
      payload: n,
      answer: r
    } = e;
    let {
      verbPhrase: o,
      chrome: s
    } = n;
    let i;
    if (t[0] !== n) {
      i = gPf(n);
      t[0] = n;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l;
    if (t[2] !== r || t[3] !== n) {
      l = S => {
        r(hPf(S, n));
      };
      t[2] = r;
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] !== r) {
      u = () => {
        r({
          behavior: "cancelled"
        });
      };
      t[5] = r;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d = u;
    let p;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        label: "Allow",
        value: "allow"
      };
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== s || t[9] !== a) {
      if (m = [p], a && s) {
        let E;
        if (t[11] !== s.host) {
          E = {
            label: Ohe.jsxs(Text, {
              children: ["Allow all actions on ", Ohe.jsx(Text, {
                bold: true,
                children: s.host
              }), " for this session"]
            }),
            value: "allow-domain"
          };
          t[11] = s.host;
          t[12] = E;
        } else {
          E = t[12];
        }
        m.push(E);
      }
      let S;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        S = {
          label: Ohe.jsxs(Text, {
            children: ["Deny ", Ohe.jsx(Text, {
              bold: true,
              children: "(esc)"
            })]
          }),
          value: "deny"
        };
        t[13] = S;
      } else {
        S = t[13];
      }
      m.push(S);
      t[8] = s;
      t[9] = a;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f = m;
    let h = s ? `Claude in Chrome wants to ${o} on ${s.host}` : `Claude in Chrome wants to ${o}`;
    let g;
    if (t[14] !== s) {
      g = s ? Ohe.jsx(Text, {
        dimColor: true,
        children: s.url
      }) : null;
      t[14] = s;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== d || t[17] !== c || t[18] !== f) {
      y = Ohe.jsx(xr, {
        options: f,
        onChange: c,
        onCancel: d
      });
      t[16] = d;
      t[17] = c;
      t[18] = f;
      t[19] = y;
    } else {
      y = t[19];
    }
    let _;
    if (t[20] !== g || t[21] !== y) {
      _ = Ohe.jsxs(gXd, {
        flexDirection: "column",
        paddingY: 1,
        gap: 1,
        children: [g, y]
      });
      t[20] = g;
      t[21] = y;
      t[22] = _;
    } else {
      _ = t[22];
    }
    let b;
    if (t[23] !== n.requestSource || t[24] !== h || t[25] !== _) {
      b = Ohe.jsx(qm, {
        title: h,
        requestSource: n.requestSource,
        children: _
      });
      t[23] = n.requestSource;
      t[24] = h;
      t[25] = _;
      t[26] = b;
    } else {
      b = t[26];
    }
    return b;
  }
  var LPc;
  var Ohe;
  var UPc = __lazy(() => {
    $c();
    XI();
    et();
    b1();
    LPc = __toESM(pt(), 1);
    Ohe = __toESM(ie(), 1);
  });
  function yPf(e) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: {},
          permissionUpdates: [{
            type: "setMode",
            mode: "plan",
            destination: "session"
          }]
        };
      case "no":
        return {
          behavior: "deny"
        };
    }
  }
  function $Pc(e) {
    let t = BPc.c(11);
    let {
      payload: n,
      answer: r
    } = e;
    let o = bt(_Pf);
    let s;
    if (t[0] !== r || t[1] !== o) {
      s = p => {
        if (p === "yes") {
          logEvent("tengu_plan_enter", {
            entryMethod: "tool"
          });
          handlePlanModeTransition(o, "plan");
        }
        r(yPf(p));
      };
      t[0] = r;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = r4.jsx(Text, {
        children: "Claude wants to enter plan mode to explore and design an implementation approach."
      });
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      l = r4.jsxs(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: [r4.jsx(Text, {
          dimColor: true,
          children: "In plan mode, Claude will:"
        }), r4.jsx(Text, {
          dimColor: true,
          children: " \xB7 Explore the codebase thoroughly"
        }), r4.jsx(Text, {
          dimColor: true,
          children: " \xB7 Identify existing patterns"
        }), r4.jsx(Text, {
          dimColor: true,
          children: " \xB7 Design an implementation strategy"
        }), r4.jsx(Text, {
          dimColor: true,
          children: " \xB7 Present a plan for your approval"
        })]
      });
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      c = r4.jsx(gXd, {
        marginTop: 1,
        children: r4.jsx(Text, {
          dimColor: true,
          children: "No code changes will be made until you approve the plan."
        })
      });
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== i) {
      u = r4.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        paddingX: 1,
        children: [a, l, c, r4.jsx(gXd, {
          marginTop: 1,
          children: r4.jsx(mc, {
            confirmLabel: "Yes, enter plan mode",
            cancelLabel: "No, start implementing now",
            onConfirm: () => i("yes"),
            onCancel: () => i("no")
          })
        })]
      });
      t[6] = i;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== n.requestSource || t[9] !== u) {
      d = r4.jsx(qm, {
        color: "planMode",
        title: "Enter plan mode?",
        requestSource: n.requestSource,
        children: u
      });
      t[8] = n.requestSource;
      t[9] = u;
      t[10] = d;
    } else {
      d = t[10];
    }
    return d;
  }
  function _Pf(e) {
    return e.toolPermissionContext.mode;
  }
  var BPc;
  var r4;
  var HPc = __lazy(() => {
    at();
    b_();
    XI();
    et();
    Ot();
    ho();
    BPc = __toESM(pt(), 1);
    r4 = __toESM(ie(), 1);
  });
  function bPf(e) {
    let t = us(e);
    let n = us(`${getOriginalCwd()}/.claude`);
    let r = normalizeCaseForComparison(t);
    let o = normalizeCaseForComparison(n);
    return r.startsWith(o + wXe.sep.toLowerCase()) || r.startsWith(o + "/");
  }
  function SPf(e) {
    let t = us(e);
    let n = wXe.join(jPc.homedir(), ".claude");
    let r = normalizeCaseForComparison(t);
    let o = normalizeCaseForComparison(n);
    return r.startsWith(o + wXe.sep.toLowerCase()) || r.startsWith(o + "/");
  }
  function qPc({
    filePath: e,
    toolPermissionContext: t,
    operationType: n = "write",
    onRejectFeedbackChange: r,
    onAcceptFeedbackChange: o,
    yesInputMode: s = false,
    noInputMode: i = false
  }) {
    let a = [];
    let l = dx("chat:cycleMode", "Chat", "shift+tab");
    if (s && o) {
      a.push({
        type: "input",
        label: "Yes",
        value: "yes",
        placeholder: "and tell Claude what to do next",
        onChange: o,
        allowEmptySubmitToCancel: true,
        option: {
          type: "accept-once"
        }
      });
    } else {
      a.push({
        label: "Yes",
        value: "yes",
        option: {
          type: "accept-once"
        }
      });
    }
    let c = pathInAllowedWorkingPath(e, t);
    let u = bPf(e);
    let d = SPf(e);
    if ((u || d) && n !== "read") {
      a.push({
        label: "Yes, and allow Claude to edit its own settings for this session",
        value: "yes-claude-folder",
        option: {
          type: "accept-session",
          scope: d ? "global-claude-folder" : "claude-folder"
        }
      });
    } else {
      let p;
      if (c) {
        if (n === "read") {
          p = "Yes, during this session";
        } else {
          p = JBe.jsxs(Text, {
            children: ["Yes, allow all edits during this session", " ", JBe.jsxs(Text, {
              bold: true,
              children: ["(", l, ")"]
            })]
          });
        }
      } else {
        let m = YB(e);
        let f = wXe.basename(m) || "this directory";
        if (n === "read") {
          p = JBe.jsxs(Text, {
            children: ["Yes, allow reading from ", JBe.jsxs(Text, {
              bold: true,
              children: [f, "/"]
            }), " during this session"]
          });
        } else {
          p = JBe.jsxs(Text, {
            children: ["Yes, allow all edits in ", JBe.jsxs(Text, {
              bold: true,
              children: [f, "/"]
            }), " during this session ", JBe.jsxs(Text, {
              bold: true,
              children: ["(", l, ")"]
            })]
          });
        }
      }
      a.push({
        label: p,
        value: "yes-session",
        option: {
          type: "accept-session"
        }
      });
    }
    if (i && r) {
      a.push({
        type: "input",
        label: "No",
        value: "no",
        placeholder: "and tell Claude what to do differently",
        onChange: r,
        allowEmptySubmitToCancel: true,
        option: {
          type: "reject"
        }
      });
    } else {
      a.push({
        label: "No",
        value: "no",
        option: {
          type: "reject"
        }
      });
    }
    return a;
  }
  var jPc;
  var wXe;
  var JBe;
  var WPc = __lazy(() => {
    at();
    et();
    kre();
    ku();
    wm();
    jPc = require("os");
    wXe = require("path");
    JBe = __toESM(ie(), 1);
  });
  function TPf(e, t, n, r) {
    switch (e.type) {
      case "accept-once":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(r && {
            feedback: r
          })
        };
      case "accept-session":
        {
          if (e.scope === "claude-folder" || e.scope === "global-claude-folder") {
            let o = e.scope === "global-claude-folder" ? "~/.claude/**" : "/.claude/**";
            return {
              behavior: "allow",
              updatedInput: t.input,
              permissionUpdates: [{
                type: "addRules",
                rules: [{
                  toolName: "Edit",
                  ruleContent: o
                }],
                behavior: "allow",
                destination: "session"
              }]
            };
          }
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: generateSuggestions(t.filePath, t.operationType, n)
          };
        }
      case "reject":
        return {
          behavior: "deny",
          ...(r && {
            feedback: r
          })
        };
    }
  }
  function zPc(e) {
    let t = GPc.c(98);
    let {
      payload: n,
      answer: r
    } = e;
    let o = bt(vPf);
    let [s, i] = XBe.useState("");
    let [a, l] = XBe.useState("");
    let [c, u] = XBe.useState("yes");
    let [d, p] = XBe.useState(false);
    let [m, f] = XBe.useState(false);
    let [h, g] = XBe.useState(false);
    let [y, _] = XBe.useState(false);
    let b;
    if (t[0] !== n.toolName) {
      b = qi(n.toolName);
      t[0] = n.toolName;
      t[1] = b;
    } else {
      b = t[1];
    }
    let S;
    if (t[2] !== n.isMcp || t[3] !== b) {
      S = {
        toolName: b,
        isMcp: n.isMcp
      };
      t[2] = n.isMcp;
      t[3] = b;
      t[4] = S;
    } else {
      S = t[4];
    }
    let E = S;
    let C;
    if (t[5] !== m || t[6] !== n.filePath || t[7] !== n.operationType || t[8] !== o || t[9] !== d) {
      C = qPc({
        filePath: n.filePath,
        toolPermissionContext: o,
        operationType: n.operationType,
        onRejectFeedbackChange: l,
        onAcceptFeedbackChange: i,
        yesInputMode: d,
        noInputMode: m
      });
      t[5] = m;
      t[6] = n.filePath;
      t[7] = n.operationType;
      t[8] = o;
      t[9] = d;
      t[10] = C;
    } else {
      C = t[10];
    }
    let x = C;
    let A;
    if (t[11] !== E || t[12] !== r || t[13] !== y || t[14] !== n || t[15] !== o || t[16] !== h) {
      A = (de, be) => {
        if (de.type === "reject") {
          logEvent("tengu_reject_submitted", {
            ...E,
            has_instructions: !!be,
            instructions_length: be?.length ?? 0,
            entered_feedback_mode: y
          });
        } else if (de.type === "accept-once") {
          logEvent("tengu_accept_submitted", {
            ...E,
            has_instructions: !!be,
            instructions_length: be?.length ?? 0,
            entered_feedback_mode: h
          });
        }
        r(TPf(de, n, o, be));
      };
      t[11] = E;
      t[12] = r;
      t[13] = y;
      t[14] = n;
      t[15] = o;
      t[16] = h;
      t[17] = A;
    } else {
      A = t[17];
    }
    let k = A;
    let I;
    if (t[18] !== x || t[19] !== k) {
      I = () => {
        let de = x.find(EPf);
        if (de) {
          k(de.option);
        }
      };
      t[18] = x;
      t[19] = k;
      t[20] = I;
    } else {
      I = t[20];
    }
    let O = I;
    let M;
    if (t[21] !== O) {
      M = {
        "confirm:cycleMode": O
      };
      t[21] = O;
      t[22] = M;
    } else {
      M = t[22];
    }
    let L;
    if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
      L = {
        context: "Confirmation"
      };
      t[23] = L;
    } else {
      L = t[23];
    }
    jo(M, L);
    let P;
    if (t[24] !== s || t[25] !== m || t[26] !== a || t[27] !== d) {
      P = de => {
        if (de !== "yes" && d && !s.trim()) {
          p(false);
        }
        if (de !== "no" && m && !a.trim()) {
          f(false);
        }
        u(de);
      };
      t[24] = s;
      t[25] = m;
      t[26] = a;
      t[27] = d;
      t[28] = P;
    } else {
      P = t[28];
    }
    let F = P;
    let H;
    if (t[29] !== E || t[30] !== m || t[31] !== d) {
      H = de => {
        if (de === "yes") {
          if (d) {
            p(false);
            logEvent("tengu_accept_feedback_mode_collapsed", E);
          } else {
            p(true);
            g(true);
            logEvent("tengu_accept_feedback_mode_entered", E);
          }
        } else if (de === "no") {
          if (m) {
            f(false);
            logEvent("tengu_reject_feedback_mode_collapsed", E);
          } else {
            f(true);
            _(true);
            logEvent("tengu_reject_feedback_mode_entered", E);
          }
        }
      };
      t[29] = E;
      t[30] = m;
      t[31] = d;
      t[32] = H;
    } else {
      H = t[32];
    }
    let U = H;
    let N;
    if (t[33] !== n.symlinkTarget) {
      N = n.symlinkTarget ? IT.jsx(gXd, {
        paddingX: 1,
        marginBottom: 1,
        children: IT.jsx(Text, {
          color: "warning",
          children: VPc.relative(Nt(), n.symlinkTarget).startsWith("..") ? `This will modify ${n.symlinkTarget} (outside working directory) via a symlink` : `Symlink target: ${n.symlinkTarget}`
        })
      }) : null;
      t[33] = n.symlinkTarget;
      t[34] = N;
    } else {
      N = t[34];
    }
    let W = N;
    let j;
    if (t[35] !== s || t[36] !== x || t[37] !== a || t[38] !== k) {
      j = de => {
        let be = x.find(fe => fe.value === de);
        if (!be) {
          return;
        }
        if (be.option.type === "reject") {
          let fe = a.trim();
          k(be.option, fe || undefined);
          return;
        }
        if (be.option.type === "accept-once") {
          let fe = s.trim();
          k(be.option, fe || undefined);
          return;
        }
        k(be.option);
      };
      t[35] = s;
      t[36] = x;
      t[37] = a;
      t[38] = k;
      t[39] = j;
    } else {
      j = t[39];
    }
    let z = j;
    let V;
    if (t[40] !== k) {
      V = () => {
        k({
          type: "reject"
        });
      };
      t[40] = k;
      t[41] = V;
    } else {
      V = t[41];
    }
    let K = V;
    if (n.showingDiffInIDE) {
      let be = `Opened changes in ${n.ideName ?? "IDE"} \u29C9`;
      let fe;
      if (t[42] === Symbol.for("react.memo_cache_sentinel")) {
        fe = h5t() && IT.jsx(gXd, {
          paddingX: 1,
          marginBottom: 1,
          children: IT.jsx(Text, {
            dimColor: true,
            children: "Save file to continue\u2026"
          })
        });
        t[42] = fe;
      } else {
        fe = t[42];
      }
      let me;
      if (t[43] !== n.question) {
        me = typeof n.question === "string" ? IT.jsx(Text, {
          children: n.question
        }) : n.question;
        t[43] = n.question;
        t[44] = me;
      } else {
        me = t[44];
      }
      let Te = x;
      let ue;
      if (t[45] !== K || t[46] !== F || t[47] !== U || t[48] !== z || t[49] !== Te) {
        ue = IT.jsx(xr, {
          options: Te,
          inlineDescriptions: true,
          onChange: z,
          onCancel: K,
          onFocus: F,
          onInputModeToggle: U
        });
        t[45] = K;
        t[46] = F;
        t[47] = U;
        t[48] = z;
        t[49] = Te;
        t[50] = ue;
      } else {
        ue = t[50];
      }
      let ce;
      if (t[51] !== me || t[52] !== ue) {
        ce = IT.jsxs(gXd, {
          flexDirection: "column",
          paddingX: 1,
          children: [me, ue]
        });
        t[51] = me;
        t[52] = ue;
        t[53] = ce;
      } else {
        ce = t[53];
      }
      let le;
      if (t[54] !== n.requestSource || t[55] !== n.subtitle || t[56] !== W || t[57] !== be || t[58] !== ce) {
        le = IT.jsxs(qm, {
          title: be,
          subtitle: n.subtitle,
          innerPaddingX: 0,
          requestSource: n.requestSource,
          children: [W, fe, ce]
        });
        t[54] = n.requestSource;
        t[55] = n.subtitle;
        t[56] = W;
        t[57] = be;
        t[58] = ce;
        t[59] = le;
      } else {
        le = t[59];
      }
      let pe;
      if (t[60] === Symbol.for("react.memo_cache_sentinel")) {
        pe = IT.jsx(xt, {
          chord: "escape",
          action: "cancel"
        });
        t[60] = pe;
      } else {
        pe = t[60];
      }
      let ve;
      if (t[61] !== c || t[62] !== m || t[63] !== d) {
        ve = (c === "yes" && !d || c === "no" && !m) && IT.jsx(xt, {
          chord: "tab",
          action: "amend"
        });
        t[61] = c;
        t[62] = m;
        t[63] = d;
        t[64] = ve;
      } else {
        ve = t[64];
      }
      let _e;
      if (t[65] !== ve) {
        _e = IT.jsx(gXd, {
          paddingX: 1,
          marginTop: 1,
          children: IT.jsx(Text, {
            dimColor: true,
            children: IT.jsxs(Hn, {
              children: [pe, ve]
            })
          })
        });
        t[65] = ve;
        t[66] = _e;
      } else {
        _e = t[66];
      }
      let xe;
      if (t[67] !== le || t[68] !== _e) {
        xe = IT.jsxs(IT.Fragment, {
          children: [le, _e]
        });
        t[67] = le;
        t[68] = _e;
        t[69] = xe;
      } else {
        xe = t[69];
      }
      return xe;
    }
    let J;
    if (t[70] !== n.question) {
      J = typeof n.question === "string" ? IT.jsx(Text, {
        children: n.question
      }) : n.question;
      t[70] = n.question;
      t[71] = J;
    } else {
      J = t[71];
    }
    let Q = x;
    let Z;
    if (t[72] !== K || t[73] !== F || t[74] !== U || t[75] !== z || t[76] !== Q) {
      Z = IT.jsx(xr, {
        options: Q,
        inlineDescriptions: true,
        onChange: z,
        onCancel: K,
        onFocus: F,
        onInputModeToggle: U
      });
      t[72] = K;
      t[73] = F;
      t[74] = U;
      t[75] = z;
      t[76] = Q;
      t[77] = Z;
    } else {
      Z = t[77];
    }
    let ne;
    if (t[78] !== J || t[79] !== Z) {
      ne = IT.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        children: [J, Z]
      });
      t[78] = J;
      t[79] = Z;
      t[80] = ne;
    } else {
      ne = t[80];
    }
    let oe;
    if (t[81] !== n.content || t[82] !== n.requestSource || t[83] !== n.subtitle || t[84] !== n.title || t[85] !== W || t[86] !== ne) {
      oe = IT.jsxs(qm, {
        title: n.title,
        subtitle: n.subtitle,
        innerPaddingX: 0,
        requestSource: n.requestSource,
        children: [W, n.content, ne]
      });
      t[81] = n.content;
      t[82] = n.requestSource;
      t[83] = n.subtitle;
      t[84] = n.title;
      t[85] = W;
      t[86] = ne;
      t[87] = oe;
    } else {
      oe = t[87];
    }
    let ee;
    if (t[88] === Symbol.for("react.memo_cache_sentinel")) {
      ee = IT.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[88] = ee;
    } else {
      ee = t[88];
    }
    let re;
    if (t[89] !== c || t[90] !== m || t[91] !== d) {
      re = (c === "yes" && !d || c === "no" && !m) && IT.jsx(xt, {
        chord: "tab",
        action: "amend"
      });
      t[89] = c;
      t[90] = m;
      t[91] = d;
      t[92] = re;
    } else {
      re = t[92];
    }
    let se;
    if (t[93] !== re) {
      se = IT.jsx(gXd, {
        paddingX: 1,
        marginTop: 1,
        children: IT.jsx(Text, {
          dimColor: true,
          children: IT.jsxs(Hn, {
            children: [ee, re]
          })
        })
      });
      t[93] = re;
      t[94] = se;
    } else {
      se = t[94];
    }
    let ae;
    if (t[95] !== oe || t[96] !== se) {
      ae = IT.jsxs(IT.Fragment, {
        children: [oe, se]
      });
      t[95] = oe;
      t[96] = se;
      t[97] = ae;
    } else {
      ae = t[97];
    }
    return ae;
  }
  function EPf(e) {
    return e.option.type === "accept-session";
  }
  function vPf(e) {
    return e.toolPermissionContext;
  }
  var GPc;
  var VPc;
  var XBe;
  var IT;
  var KPc = __lazy(() => {
    $c();
    Ai();
    bs();
    WPc();
    XI();
    et();
    Bs();
    Ot();
    Gu();
    ho();
    Ay();
    vo();
    bT();
    wm();
    GPc = __toESM(pt(), 1);
    VPc = require("path");
    XBe = __toESM(ot(), 1);
    IT = __toESM(ie(), 1);
  });
  function ZBe(e) {
    let t = YPc.c(57);
    let {
      options: n,
      onSelect: r,
      onCancel: o,
      question: s,
      toolAnalyticsContext: i
    } = e;
    let a = s === undefined ? "Do you want to proceed?" : s;
    let l = Lo();
    let [c, u] = QBe.useState("");
    let [d, p] = QBe.useState("");
    let [m, f] = QBe.useState(false);
    let [h, g] = QBe.useState(false);
    let [y, _] = QBe.useState(null);
    let [b, S] = QBe.useState(false);
    let [E, C] = QBe.useState(false);
    let x;
    if (t[0] !== y || t[1] !== n) {
      let ee;
      if (t[3] !== y) {
        ee = re => re.value === y;
        t[3] = y;
        t[4] = ee;
      } else {
        ee = t[4];
      }
      x = n.find(ee);
      t[0] = y;
      t[1] = n;
      t[2] = x;
    } else {
      x = t[2];
    }
    let k = x?.feedbackConfig?.type;
    let I = k === "accept" && !m || k === "reject" && !h;
    let O;
    if (t[5] !== m || t[6] !== n || t[7] !== h) {
      let ee;
      if (t[9] !== m || t[10] !== h) {
        ee = re => {
          let {
            value: se,
            label: ae,
            feedbackConfig: de
          } = re;
          if (!de) {
            return {
              label: ae,
              value: se,
              description: re.description
            };
          }
          let {
            type: be,
            placeholder: fe
          } = de;
          let me = be === "accept" ? m : h;
          let Te = be === "accept" ? u : p;
          let ue = wPf[be];
          if (me) {
            return {
              type: "input",
              label: ae,
              value: se,
              placeholder: fe ?? ue,
              onChange: Te,
              allowEmptySubmitToCancel: true
            };
          }
          return {
            label: ae,
            value: se,
            description: re.description
          };
        };
        t[9] = m;
        t[10] = h;
        t[11] = ee;
      } else {
        ee = t[11];
      }
      O = n.map(ee);
      t[5] = m;
      t[6] = n;
      t[7] = h;
      t[8] = O;
    } else {
      O = t[8];
    }
    let M = O;
    let L;
    if (t[12] !== m || t[13] !== n || t[14] !== h || t[15] !== i?.isMcp || t[16] !== i?.toolName) {
      L = ee => {
        let re = n.find(de => de.value === ee);
        if (!re?.feedbackConfig) {
          return;
        }
        let {
          type: se
        } = re.feedbackConfig;
        let ae = {
          toolName: i?.toolName,
          isMcp: i?.isMcp ?? false
        };
        if (se === "accept") {
          if (m) {
            f(false);
            logEvent("tengu_accept_feedback_mode_collapsed", ae);
          } else {
            f(true);
            S(true);
            logEvent("tengu_accept_feedback_mode_entered", ae);
          }
        } else if (se === "reject") {
          if (h) {
            g(false);
            logEvent("tengu_reject_feedback_mode_collapsed", ae);
          } else {
            g(true);
            C(true);
            logEvent("tengu_reject_feedback_mode_entered", ae);
          }
        }
      };
      t[12] = m;
      t[13] = n;
      t[14] = h;
      t[15] = i?.isMcp;
      t[16] = i?.toolName;
      t[17] = L;
    } else {
      L = t[17];
    }
    let P = L;
    let F;
    if (t[18] !== c || t[19] !== b || t[20] !== r || t[21] !== n || t[22] !== d || t[23] !== E || t[24] !== i?.isMcp || t[25] !== i?.toolName) {
      F = ee => {
        let re = n.find(ae => ae.value === ee);
        if (!re) {
          return;
        }
        let se;
        if (re.feedbackConfig) {
          let de = (re.feedbackConfig.type === "accept" ? c : d).trim();
          if (de) {
            se = de;
          }
          let be = {
            toolName: i?.toolName,
            isMcp: i?.isMcp ?? false,
            has_instructions: !!de,
            instructions_length: de?.length ?? 0,
            entered_feedback_mode: re.feedbackConfig.type === "accept" ? b : E
          };
          if (re.feedbackConfig.type === "accept") {
            logEvent("tengu_accept_submitted", be);
          } else if (re.feedbackConfig.type === "reject") {
            logEvent("tengu_reject_submitted", be);
          }
        }
        r(ee, se);
      };
      t[18] = c;
      t[19] = b;
      t[20] = r;
      t[21] = n;
      t[22] = d;
      t[23] = E;
      t[24] = i?.isMcp;
      t[25] = i?.toolName;
      t[26] = F;
    } else {
      F = t[26];
    }
    let H = F;
    let U;
    if (t[27] !== H || t[28] !== n) {
      U = {};
      for (let ee of n) {
        if (ee.keybinding) {
          U[ee.keybinding] = () => H(ee.value);
        }
      }
      t[27] = H;
      t[28] = n;
      t[29] = U;
    } else {
      U = t[29];
    }
    let N = U;
    let W;
    if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
      W = {
        context: "Confirmation"
      };
      t[30] = W;
    } else {
      W = t[30];
    }
    jo(N, W);
    let j;
    if (t[31] !== o || t[32] !== l) {
      j = () => {
        logEvent("tengu_permission_request_escape", {});
        l(CPf);
        o?.();
      };
      t[31] = o;
      t[32] = l;
      t[33] = j;
    } else {
      j = t[33];
    }
    let z = j;
    let V;
    if (t[34] !== a) {
      V = typeof a === "string" ? Dhe.jsx(Text, {
        children: a
      }) : a;
      t[34] = a;
      t[35] = V;
    } else {
      V = t[35];
    }
    let K;
    if (t[36] !== c || t[37] !== m || t[38] !== n || t[39] !== d || t[40] !== h) {
      K = ee => {
        let re = n.find(se => se.value === ee);
        if (re?.feedbackConfig?.type !== "accept" && m && !c.trim()) {
          f(false);
        }
        if (re?.feedbackConfig?.type !== "reject" && h && !d.trim()) {
          g(false);
        }
        _(ee);
      };
      t[36] = c;
      t[37] = m;
      t[38] = n;
      t[39] = d;
      t[40] = h;
      t[41] = K;
    } else {
      K = t[41];
    }
    let J;
    if (t[42] !== z || t[43] !== P || t[44] !== H || t[45] !== M || t[46] !== K) {
      J = Dhe.jsx(xr, {
        options: M,
        inlineDescriptions: true,
        onChange: H,
        onCancel: z,
        onFocus: K,
        onInputModeToggle: P
      });
      t[42] = z;
      t[43] = P;
      t[44] = H;
      t[45] = M;
      t[46] = K;
      t[47] = J;
    } else {
      J = t[47];
    }
    let Q;
    if (t[48] === Symbol.for("react.memo_cache_sentinel")) {
      Q = Dhe.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[48] = Q;
    } else {
      Q = t[48];
    }
    let Z;
    if (t[49] !== I) {
      Z = I && Dhe.jsx(xt, {
        chord: "tab",
        action: "amend"
      });
      t[49] = I;
      t[50] = Z;
    } else {
      Z = t[50];
    }
    let ne;
    if (t[51] !== Z) {
      ne = Dhe.jsx(gXd, {
        marginTop: 1,
        children: Dhe.jsx(Text, {
          dimColor: true,
          children: Dhe.jsxs(Hn, {
            children: [Q, Z]
          })
        })
      });
      t[51] = Z;
      t[52] = ne;
    } else {
      ne = t[52];
    }
    let oe;
    if (t[53] !== J || t[54] !== ne || t[55] !== V) {
      oe = Dhe.jsxs(gXd, {
        flexDirection: "column",
        children: [V, J, ne]
      });
      t[53] = J;
      t[54] = ne;
      t[55] = V;
      t[56] = oe;
    } else {
      oe = t[56];
    }
    return oe;
  }
  function CPf(e) {
    return {
      ...e,
      attribution: {
        ...e.attribution,
        escapeCount: e.attribution.escapeCount + 1
      }
    };
  }
  var YPc;
  var QBe;
  var Dhe;
  var wPf;
  var Ton = __lazy(() => {
    et();
    Bs();
    Ot();
    ho();
    $c();
    Ai();
    bs();
    YPc = __toESM(pt(), 1);
    QBe = __toESM(ot(), 1);
    Dhe = __toESM(ie(), 1);
    wPf = {
      accept: "tell Claude what to do next",
      reject: "tell Claude what to do differently"
    };
  });
  function RPf(e, t, n) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(n && {
            feedback: n
          })
        };
      case "yes-apply-suggestions":
        {
          let r = "suggestions" in t.permissionResult ? t.permissionResult.suggestions ?? [] : [];
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: r
          };
        }
      case "no":
        return {
          behavior: "deny",
          ...(n && {
            feedback: n
          })
        };
    }
  }
  function xPf(e) {
    let t = "suggestions" in e.permissionResult ? e.permissionResult.suggestions ?? [] : [];
    return e.showAlwaysAllow && t.length > 0;
  }
  function kPf(e) {
    let t = e.filter(n => n.type === "addRules").flatMap(n => n.rules ?? []);
    if (t.length === 1 && t[0].ruleContent) {
      let n = t[0];
      return o4.jsxs(Text, {
        children: ["Yes, and don't ask again for", " ", o4.jsxs(Text, {
          bold: true,
          children: [n.toolName, "(", n.ruleContent, ")"]
        })]
      });
    }
    return `Yes, and add ${t.length} suggested permission rules`;
  }
  function XPc(e) {
    let t = JPc.c(42);
    let {
      payload: n,
      answer: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = xPf(n);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i;
    if (t[2] !== n.permissionResult) {
      i = "suggestions" in n.permissionResult ? n.permissionResult.suggestions ?? [] : [];
      t[2] = n.permissionResult;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== r || t[5] !== n) {
      l = (x, A) => {
        r(RPf(x, n, A));
      };
      t[4] = r;
      t[5] = n;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c = l;
    let u;
    if (t[7] !== r) {
      u = () => {
        r({
          behavior: "deny"
        });
      };
      t[7] = r;
      t[8] = u;
    } else {
      u = t[8];
    }
    let d = u;
    let p;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        label: "Yes",
        value: "yes",
        feedbackConfig: {
          type: "accept"
        }
      };
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== s || t[11] !== a) {
      if (m = [p], s) {
        let A;
        if (t[13] !== a) {
          A = kPf(a);
          t[13] = a;
          t[14] = A;
        } else {
          A = t[14];
        }
        let k;
        if (t[15] !== A) {
          k = {
            label: A,
            value: "yes-apply-suggestions"
          };
          t[15] = A;
          t[16] = k;
        } else {
          k = t[16];
        }
        m.push(k);
      }
      let x;
      if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
        x = {
          label: "No",
          value: "no",
          feedbackConfig: {
            type: "reject"
          }
        };
        t[17] = x;
      } else {
        x = t[17];
      }
      m.push(x);
      t[10] = s;
      t[11] = a;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f = m;
    let h;
    if (t[18] !== n.command || t[19] !== n.intervalMs || t[20] !== n.mcp || t[21] !== n.ws) {
      h = n.mcp ? o4.jsxs(Text, {
        children: ["Poll", " ", o4.jsxs(Text, {
          bold: true,
          children: [n.mcp.server, "/", n.mcp.tool]
        }), " ", "every ", n.intervalMs / 1000, "s"]
      }) : n.ws ? o4.jsxs(Text, {
        children: ["Open WebSocket ", o4.jsx(Text, {
          bold: true,
          children: n.ws.url
        })]
      }) : o4.jsx(Text, {
        children: n.command
      });
      t[18] = n.command;
      t[19] = n.intervalMs;
      t[20] = n.mcp;
      t[21] = n.ws;
      t[22] = h;
    } else {
      h = t[22];
    }
    let g;
    if (t[23] !== n.monitorDescription) {
      g = o4.jsx(Text, {
        dimColor: true,
        children: n.monitorDescription
      });
      t[23] = n.monitorDescription;
      t[24] = g;
    } else {
      g = t[24];
    }
    let y;
    if (t[25] !== h || t[26] !== g) {
      y = o4.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [h, g]
      });
      t[25] = h;
      t[26] = g;
      t[27] = y;
    } else {
      y = t[27];
    }
    let _ = n.mcp || n.ws ? "tool" : "command";
    let b;
    if (t[28] !== n.permissionResult || t[29] !== _) {
      b = o4.jsx(FH, {
        permissionResult: n.permissionResult,
        toolType: _
      });
      t[28] = n.permissionResult;
      t[29] = _;
      t[30] = b;
    } else {
      b = t[30];
    }
    let S;
    if (t[31] !== d || t[32] !== c || t[33] !== f) {
      S = o4.jsx(ZBe, {
        options: f,
        onSelect: c,
        onCancel: d
      });
      t[31] = d;
      t[32] = c;
      t[33] = f;
      t[34] = S;
    } else {
      S = t[34];
    }
    let E;
    if (t[35] !== b || t[36] !== S) {
      E = o4.jsxs(gXd, {
        flexDirection: "column",
        children: [b, S]
      });
      t[35] = b;
      t[36] = S;
      t[37] = E;
    } else {
      E = t[37];
    }
    let C;
    if (t[38] !== n.requestSource || t[39] !== E || t[40] !== y) {
      C = o4.jsxs(qm, {
        title: "Monitor",
        requestSource: n.requestSource,
        children: [y, E]
      });
      t[38] = n.requestSource;
      t[39] = E;
      t[40] = y;
      t[41] = C;
    } else {
      C = t[41];
    }
    return C;
  }
  var JPc;
  var o4;
  var QPc = __lazy(() => {
    XI();
    Ton();
    QCe();
    et();
    wX();
    JPc = __toESM(pt(), 1);
    o4 = __toESM(ie(), 1);
  });
  function APf(e, t, n) {
    switch (e) {
      case "yes":
      case "yes-enable-auto-mode":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(n && {
            feedback: n
          })
        };
      case "yes-dont-ask-again":
        return {
          behavior: "allow",
          updatedInput: t.input,
          permissionUpdates: [{
            type: "addRules",
            rules: [{
              toolName: t.toolName
            }],
            behavior: "allow",
            destination: "localSettings"
          }]
        };
      case "no":
        return {
          behavior: "deny",
          ...(n && {
            feedback: n
          })
        };
    }
  }
  function cZo(e) {
    let t = e.permissionResult.decisionReason;
    let n = t?.type === "safetyCheck" && !t.classifierApprovable;
    return e.showAlwaysAllow && !n && !e.isAskCappedByOrg;
  }
  function eOc(e) {
    let t = ZPc.c(55);
    let {
      payload: n,
      answer: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = cZo(n);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let {
      offered: i,
      enableAutoMode: a
    } = Kgr(n.requestSource);
    let l;
    if (t[2] !== r || t[3] !== a || t[4] !== n) {
      l = (F, H) => {
        if (F === "yes-enable-auto-mode") {
          a();
        }
        r(APf(F, n, H));
      };
      t[2] = r;
      t[3] = a;
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c = l;
    let u;
    if (t[6] !== r) {
      u = () => {
        r({
          behavior: "cancelled"
        });
      };
      t[6] = r;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = u;
    let p;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      p = getOriginalCwd();
      t[8] = p;
    } else {
      p = t[8];
    }
    let m = p;
    let f;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      f = {
        label: "Yes",
        value: "yes",
        feedbackConfig: {
          type: "accept"
        }
      };
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== i || t[11] !== n.userFacingName || t[12] !== s) {
      if (h = [f], s) {
        let H;
        if (t[14] !== n.userFacingName) {
          H = UH.jsx(Text, {
            bold: true,
            children: n.userFacingName
          });
          t[14] = n.userFacingName;
          t[15] = H;
        } else {
          H = t[15];
        }
        let U;
        if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
          U = UH.jsx(Text, {
            bold: true,
            children: m
          });
          t[16] = U;
        } else {
          U = t[16];
        }
        let N;
        if (t[17] !== H) {
          N = {
            label: UH.jsxs(Text, {
              children: ["Yes, and don't ask again for", " ", H, " commands in", " ", U]
            }),
            value: "yes-dont-ask-again"
          };
          t[17] = H;
          t[18] = N;
        } else {
          N = t[18];
        }
        h.push(N);
      }
      if (i) {
        let H;
        if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
          H = {
            label: "Yes, and switch to auto mode",
            description: "\xB7 workflows run best with it on",
            value: "yes-enable-auto-mode"
          };
          t[19] = H;
        } else {
          H = t[19];
        }
        h.push(H);
      }
      let F;
      if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
        F = {
          label: "No",
          value: "no",
          feedbackConfig: {
            type: "reject"
          }
        };
        t[20] = F;
      } else {
        F = t[20];
      }
      h.push(F);
      t[10] = i;
      t[11] = n.userFacingName;
      t[12] = s;
      t[13] = h;
    } else {
      h = t[13];
    }
    let g = h;
    let y;
    if (t[21] !== n.toolName) {
      y = qi(n.toolName);
      t[21] = n.toolName;
      t[22] = y;
    } else {
      y = t[22];
    }
    let _;
    if (t[23] !== n.isMcp || t[24] !== y) {
      _ = {
        toolName: y,
        isMcp: n.isMcp
      };
      t[23] = n.isMcp;
      t[24] = y;
      t[25] = _;
    } else {
      _ = t[25];
    }
    let b = _;
    let S = n.requestSource;
    let E;
    if (t[26] !== n.renderedToolUseMessage) {
      E = n.renderedToolUseMessage !== "" && UH.jsxs(UH.Fragment, {
        children: ["(", n.renderedToolUseMessage, ")"]
      });
      t[26] = n.renderedToolUseMessage;
      t[27] = E;
    } else {
      E = t[27];
    }
    let C;
    if (t[28] !== n.hasMcpSuffix) {
      C = n.hasMcpSuffix ? UH.jsx(Text, {
        dimColor: true,
        children: " (MCP)"
      }) : "";
      t[28] = n.hasMcpSuffix;
      t[29] = C;
    } else {
      C = t[29];
    }
    let x;
    if (t[30] !== n.userFacingName || t[31] !== C || t[32] !== E) {
      x = UH.jsxs(Text, {
        children: [n.userFacingName, E, C]
      });
      t[30] = n.userFacingName;
      t[31] = C;
      t[32] = E;
      t[33] = x;
    } else {
      x = t[33];
    }
    let A;
    if (t[34] !== n.description) {
      A = nun(n.description, 3);
      t[34] = n.description;
      t[35] = A;
    } else {
      A = t[35];
    }
    let k;
    if (t[36] !== A) {
      k = UH.jsx(Text, {
        dimColor: true,
        children: A
      });
      t[36] = A;
      t[37] = k;
    } else {
      k = t[37];
    }
    let I;
    if (t[38] !== x || t[39] !== k) {
      I = UH.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [x, k]
      });
      t[38] = x;
      t[39] = k;
      t[40] = I;
    } else {
      I = t[40];
    }
    let O;
    if (t[41] !== n.permissionResult) {
      O = UH.jsx(FH, {
        permissionResult: n.permissionResult,
        toolType: "tool"
      });
      t[41] = n.permissionResult;
      t[42] = O;
    } else {
      O = t[42];
    }
    let M;
    if (t[43] !== d || t[44] !== c || t[45] !== g || t[46] !== b) {
      M = UH.jsx(ZBe, {
        options: g,
        onSelect: c,
        onCancel: d,
        toolAnalyticsContext: b
      });
      t[43] = d;
      t[44] = c;
      t[45] = g;
      t[46] = b;
      t[47] = M;
    } else {
      M = t[47];
    }
    let L;
    if (t[48] !== O || t[49] !== M) {
      L = UH.jsxs(gXd, {
        flexDirection: "column",
        children: [O, M]
      });
      t[48] = O;
      t[49] = M;
      t[50] = L;
    } else {
      L = t[50];
    }
    let P;
    if (t[51] !== n.requestSource || t[52] !== I || t[53] !== L) {
      P = UH.jsxs(qm, {
        title: "Tool use",
        requestSource: S,
        children: [I, L]
      });
      t[51] = n.requestSource;
      t[52] = I;
      t[53] = L;
      t[54] = P;
    } else {
      P = t[54];
    }
    return P;
  }
  var ZPc;
  var UH;
  var uZo = __lazy(() => {
    at();
    XI();
    Ton();
    QCe();
    Ygr();
    et();
    Gu();
    Zn();
    ZPc = __toESM(pt(), 1);
    UH = __toESM(ie(), 1);
  });
  function tOc({
    suggestions: e = [],
    onRejectFeedbackChange: t,
    onAcceptFeedbackChange: n,
    yesInputMode: r = false,
    noInputMode: o = false,
    editablePrefix: s,
    onEditablePrefixChange: i
  }) {
    let a = [];
    if (r) {
      a.push({
        type: "input",
        label: "Yes",
        value: "yes",
        placeholder: "and tell Claude what to do next",
        onChange: n,
        allowEmptySubmitToCancel: true
      });
    } else {
      a.push({
        label: "Yes",
        value: "yes"
      });
    }
    if (Umt() && e.length > 0) {
      let l = e.some(c => c.type === "addDirectories" || c.type === "addRules" && c.rules?.some(u => u.toolName !== "PowerShell"));
      if (s !== undefined && i && !l) {
        a.push({
          type: "input",
          label: "Yes, and don\u2019t ask again for",
          value: "yes-prefix-edited",
          placeholder: "command prefix (e.g., Get-Process *)",
          initialValue: s,
          onChange: i,
          allowEmptySubmitToCancel: true,
          showLabelWithValue: true,
          labelValueSeparator: ": ",
          resetCursorOnUpdate: true
        });
      } else {
        let c = Ggr(e, "PowerShell");
        if (c) {
          a.push({
            label: c,
            value: "yes-apply-suggestions"
          });
        }
      }
    }
    if (o) {
      a.push({
        type: "input",
        label: "No",
        value: "no",
        placeholder: "and tell Claude what to do differently",
        onChange: t,
        allowEmptySubmitToCancel: true
      });
    } else {
      a.push({
        label: "No",
        value: "no"
      });
    }
    return a;
  }
  var nOc = __lazy(() => {
    iZo();
  });
  function IPf(e) {
    let t = [];
    for (let n of e.statements) {
      for (let r of n.commands) {
        if (r.elementType === "CommandAst") {
          t.push(r);
        }
      }
    }
    return t;
  }
  async function rOc(e) {
    if (e.nameType === "application") {
      return null;
    }
    let t = e.name;
    if (!t) {
      return null;
    }
    if (!/^[A-Za-z0-9_+-]+$/.test(t)) {
      return null;
    }
    if (p9a.vZc(t.toLowerCase())) {
      return null;
    }
    if (e.nameType === "cmdlet") {
      return t;
    }
    if (e.elementTypes?.[0] !== "StringConstant") {
      return null;
    }
    for (let i = 0; i < e.args.length; i++) {
      let a = e.elementTypes[i + 1];
      if (a !== "StringConstant" && a !== "Parameter") {
        return null;
      }
    }
    let n = t.toLowerCase();
    let r = await oMe(n);
    let o = await tqn(t, e.args, r);
    let s = 0;
    for (let i of o.split(" ").slice(1)) {
      if (i.includes("\\")) {
        return null;
      }
      while (s < e.args.length) {
        let a = e.args[s];
        if (a === i) {
          break;
        }
        if (a.startsWith("-")) {
          if (s++, r?.options && s < e.args.length && e.args[s] !== i && !e.args[s].startsWith("-")) {
            let l = a.toLowerCase();
            if (r.options.find(u => Array.isArray(u.name) ? u.name.includes(l) : u.name === l)?.args) {
              s++;
            }
          }
          continue;
        }
        return null;
      }
      if (s >= e.args.length) {
        return null;
      }
      s++;
    }
    if (!o.includes(" ") && (r?.subcommands?.length || C5e[n])) {
      return null;
    }
    return o;
  }
  async function oOc(e, t) {
    let n = await REe(e);
    if (!n.valid) {
      return [];
    }
    let r = IPf(n);
    if (r.length <= 1) {
      let a = r[0] ? await rOc(r[0]) : null;
      return a ? [a] : [];
    }
    let o = [];
    for (let a of r) {
      if (t?.(a)) {
        continue;
      }
      let l = await rOc(a);
      if (l) {
        o.push(l);
      }
    }
    if (o.length === 0) {
      return [];
    }
    let s = new Map();
    for (let a of o) {
      let l = ii(a, " ").toLowerCase();
      let c = s.get(l);
      if (c) {
        c.push(a);
      } else {
        s.set(l, [a]);
      }
    }
    let i = [];
    for (let [a, l] of s) {
      let c = PPf(l);
      if ((c === "" ? 0 : Ru(c, " ") + 1) <= 1) {
        if ((await oMe(a))?.subcommands?.length || C5e[a]) {
          continue;
        }
      }
      i.push(c);
    }
    return i;
  }
  function PPf(e) {
    if (e.length === 0) {
      return "";
    }
    if (e.length === 1) {
      return e[0];
    }
    let t = e[0].split(" ");
    let n = t.length;
    for (let r = 1; r < e.length; r++) {
      let o = e[r].split(" ");
      let s = 0;
      while (s < n && s < o.length && o[s].toLowerCase() === t[s].toLowerCase()) {
        s++;
      }
      if (n = s, n === 0) {
        break;
      }
    }
    return t.slice(0, n).join(" ");
  }
  var sOc = __lazy(() => {
    Tho();
    bho();
    Zn();
    hvo();
  });
  function Zgr(e, t, n = {}) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(n.feedback && {
            feedback: n.feedback
          })
        };
      case "yes-apply-suggestions":
        {
          let r = "suggestions" in t.permissionResult ? t.permissionResult.suggestions ?? [] : [];
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: r
          };
        }
      case "yes-prefix-edited":
        {
          let r = (n.editablePrefix ?? "").trim();
          if (!r) {
            return {
              behavior: "allow",
              updatedInput: t.input
            };
          }
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: [{
              type: "addRules",
              rules: [{
                toolName: "PowerShell",
                ruleContent: r
              }],
              behavior: "allow",
              destination: "localSettings"
            }]
          };
        }
      case "no":
        return {
          behavior: "deny",
          ...(n.feedback && {
            feedback: n.feedback
          })
        };
    }
  }
  function iOc({
    payload: e,
    answer: t
  }) {
    let n = Lo();
    let r = e.command;
    let o = Jgr({
      toolName: e.toolName,
      toolInput: e.input,
      toolDescription: e.description
    });
    let [s, i] = vA.useState("");
    let [a, l] = vA.useState("");
    let [c, u] = vA.useState(false);
    let [d, p] = vA.useState(false);
    let [m, f] = vA.useState("yes");
    let [h, g] = vA.useState(false);
    let [y, _] = vA.useState(false);
    let [b, S] = vA.useState(r.includes(`
`) ? undefined : r);
    let E = vA.useRef(false);
    vA.useEffect(() => {
      let F = false;
      oOc(r, H => o8e(H, H.text)).then(H => {
        if (F || E.current) {
          return;
        }
        if (H.length > 0) {
          S(`${H[0]} *`);
        }
      }).catch(() => {});
      return () => {
        F = true;
      };
    }, [r]);
    let C = vA.useCallback(F => {
      E.current = true;
      S(F);
    }, []);
    let x = vA.useMemo(() => {
      if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_destructive_command_warning", false)) {
        return null;
      }
      return Kba(r);
    }, [r]);
    let A = e.permissionResult.suggestions;
    let k = vA.useMemo(() => tOc({
      suggestions: A,
      onRejectFeedbackChange: l,
      onAcceptFeedbackChange: i,
      yesInputMode: c,
      noInputMode: d,
      editablePrefix: b,
      onEditablePrefixChange: C
    }), [A, c, d, b, C]);
    let I = vA.useMemo(() => qi(e.toolName), [e.toolName]);
    let O = vA.useCallback(F => {
      if (logEvent("tengu_permission_request_option_selected", {
        option_index: {
          yes: 1,
          "yes-apply-suggestions": 2,
          "yes-prefix-edited": 2,
          no: 3
        }[F]
      }), F === "yes") {
        let U = s.trim();
        logEvent("tengu_accept_submitted", {
          toolName: I,
          isMcp: e.isMcp,
          has_instructions: !!U,
          instructions_length: U.length,
          entered_feedback_mode: h
        });
        t(Zgr("yes", e, {
          feedback: U || undefined
        }));
        return;
      }
      if (F === "no") {
        let U = a.trim();
        logEvent("tengu_reject_submitted", {
          toolName: I,
          isMcp: e.isMcp,
          has_instructions: !!U,
          instructions_length: U.length,
          entered_feedback_mode: y
        });
        t(Zgr("no", e, {
          feedback: U || undefined
        }));
        return;
      }
      if (F === "yes-prefix-edited") {
        t(Zgr("yes-prefix-edited", e, {
          editablePrefix: b
        }));
        return;
      }
      t(Zgr(F, e));
    }, [t, e, s, a, b, I, h, y]);
    let M = vA.useCallback(() => {
      logEvent("tengu_permission_request_escape", {});
      n(F => ({
        ...F,
        attribution: {
          ...F.attribution,
          escapeCount: F.attribution.escapeCount + 1
        }
      }));
      t({
        behavior: "deny"
      });
    }, [t, n]);
    let L = vA.useCallback(F => {
      let H = {
        toolName: I,
        isMcp: e.isMcp
      };
      if (F === "yes") {
        if (c) {
          u(false);
          logEvent("tengu_accept_feedback_mode_collapsed", H);
        } else {
          u(true);
          g(true);
          logEvent("tengu_accept_feedback_mode_entered", H);
        }
      } else if (F === "no") {
        if (d) {
          p(false);
          logEvent("tengu_reject_feedback_mode_collapsed", H);
        } else {
          p(true);
          _(true);
          logEvent("tengu_reject_feedback_mode_entered", H);
        }
      }
    }, [c, d, e.isMcp, I]);
    let P = vA.useCallback(F => {
      if (F !== "yes" && c && !s.trim()) {
        u(false);
      }
      if (F !== "no" && d && !a.trim()) {
        p(false);
      }
      f(F);
    }, [c, d, s, a]);
    return lN.jsxs(qm, {
      title: "PowerShell command",
      requestSource: e.requestSource,
      children: [lN.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [lN.jsx(Text, {
          dimColor: o.visible,
          children: e.renderedToolUseMessage
        }), !o.visible && lN.jsx(Text, {
          dimColor: true,
          children: e.description
        }), lN.jsx(Xgr, {
          visible: o.visible,
          promise: o.promise
        })]
      }), lN.jsxs(gXd, {
        flexDirection: "column",
        children: [lN.jsx(FH, {
          permissionResult: e.permissionResult,
          toolType: "command"
        }), x && lN.jsx(gXd, {
          marginBottom: 1,
          children: lN.jsx(Text, {
            color: "warning",
            children: x
          })
        }), lN.jsx(Text, {
          children: "Do you want to proceed?"
        }), lN.jsx(xr, {
          options: k,
          inlineDescriptions: true,
          onChange: O,
          onCancel: M,
          onFocus: P,
          onInputModeToggle: L
        })]
      }), lN.jsx(gXd, {
        justifyContent: "space-between",
        marginTop: 1,
        children: lN.jsx(Text, {
          dimColor: true,
          children: lN.jsxs(Hn, {
            children: [lN.jsx(xt, {
              chord: "escape",
              action: "cancel"
            }), (m === "yes" && !c || m === "no" && !d) && lN.jsx(xt, {
              chord: "tab",
              action: "amend"
            }), o.enabled && lN.jsx(xt, {
              chord: o.chord,
              action: o.visible ? "hide" : "explain"
            })]
          })
        })
      })]
    });
  }
  var vA;
  var lN;
  var aOc = __lazy(() => {
    $c();
    Ai();
    bs();
    XI();
    lZo();
    QCe();
    nOc();
    et();
    $n();
    Ot();
    Gu();
    ho();
    Kpt();
    qht();
    sOc();
    vA = __toESM(ot(), 1);
    lN = __toESM(ie(), 1);
  });
  function cOc(e) {
    let t = lOc.c(27);
    let {
      payload: n,
      answer: r
    } = e;
    let o;
    if (t[0] !== n.fallbackModel || t[1] !== n.originalModel) {
      o = bha(n.originalModel, n.fallbackModel);
      t[0] = n.fallbackModel;
      t[1] = n.originalModel;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i;
    if (t[3] !== s.retry_fallback) {
      i = {
        value: "retry_fallback",
        label: s.retry_fallback
      };
      t[3] = s.retry_fallback;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] !== s.edit_prompt) {
      a = {
        value: "edit_prompt",
        label: s.edit_prompt
      };
      t[5] = s.edit_prompt;
      t[6] = a;
    } else {
      a = t[6];
    }
    let l;
    if (t[7] !== i || t[8] !== a) {
      l = [i, a];
      t[7] = i;
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    let c = l;
    let u;
    if (t[10] !== n.apiRefusalCategory || t[11] !== n.originalModel) {
      u = _ha(n.originalModel, n.apiRefusalCategory);
      t[10] = n.apiRefusalCategory;
      t[11] = n.originalModel;
      t[12] = u;
    } else {
      u = t[12];
    }
    let d;
    if (t[13] !== u) {
      d = oRe.jsx(pZn, {
        children: u
      });
      t[13] = u;
      t[14] = d;
    } else {
      d = t[14];
    }
    let p;
    if (t[15] !== n.guidanceText) {
      p = n.guidanceText !== undefined && oRe.jsx(gXd, {
        marginTop: 1,
        children: oRe.jsx(Text, {
          color: "inactive",
          children: n.guidanceText
        })
      });
      t[15] = n.guidanceText;
      t[16] = p;
    } else {
      p = t[16];
    }
    let m;
    if (t[17] !== r) {
      m = () => r("cancelled");
      t[17] = r;
      t[18] = m;
    } else {
      m = t[18];
    }
    let f;
    if (t[19] !== r || t[20] !== c || t[21] !== m) {
      f = oRe.jsx(gXd, {
        marginTop: 1,
        children: oRe.jsx(xr, {
          options: c,
          onChange: r,
          onCancel: m
        })
      });
      t[19] = r;
      t[20] = c;
      t[21] = m;
      t[22] = f;
    } else {
      f = t[22];
    }
    let h;
    if (t[23] !== d || t[24] !== p || t[25] !== f) {
      h = oRe.jsx(qm, {
        color: "warning",
        title: "Session paused",
        children: oRe.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          paddingX: 1,
          children: [d, p, f]
        })
      });
      t[23] = d;
      t[24] = p;
      t[25] = f;
      t[26] = h;
    } else {
      h = t[26];
    }
    return h;
  }
  var lOc;
  var oRe;
  var uOc = __lazy(() => {
    OS();
    XI();
    aNo();
    et();
    LX();
    lOc = __toESM(pt(), 1);
    oRe = __toESM(ie(), 1);
  });
  function OPf(e, t, n) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: t.input,
          ...(n && {
            feedback: n
          })
        };
      case "yes-exact":
        return {
          behavior: "allow",
          updatedInput: t.input,
          permissionUpdates: [{
            type: "addRules",
            rules: [{
              toolName: "Skill",
              ruleContent: t.skill
            }],
            behavior: "allow",
            destination: "localSettings"
          }]
        };
      case "yes-prefix":
        {
          let r = t.skill.indexOf(" ");
          let o = r > 0 ? t.skill.substring(0, r) : t.skill;
          return {
            behavior: "allow",
            updatedInput: t.input,
            permissionUpdates: [{
              type: "addRules",
              rules: [{
                toolName: "Skill",
                ruleContent: `${o}:*`
              }],
              behavior: "allow",
              destination: "localSettings"
            }]
          };
        }
      case "no":
        return {
          behavior: "deny",
          ...(n && {
            feedback: n
          })
        };
    }
  }
  function DPf(e) {
    return e.showAlwaysAllow && e.skill !== "";
  }
  function MPf(e) {
    if (!e.showAlwaysAllow) {
      return false;
    }
    return e.skill.indexOf(" ") > 0;
  }
  function pOc(e) {
    let t = dOc.c(51);
    let {
      payload: n,
      answer: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = getOriginalCwd();
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] !== n) {
      i = DPf(n);
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== n) {
      l = MPf(n);
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      u = {
        label: "Yes",
        value: "yes",
        feedbackConfig: {
          type: "accept"
        }
      };
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== n.skill || t[7] !== a || t[8] !== c) {
      if (d = [u], a) {
        let M;
        if (t[10] !== n.skill) {
          M = s4.jsx(Text, {
            bold: true,
            children: n.skill
          });
          t[10] = n.skill;
          t[11] = M;
        } else {
          M = t[11];
        }
        let L;
        if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
          L = s4.jsx(Text, {
            bold: true,
            children: s
          });
          t[12] = L;
        } else {
          L = t[12];
        }
        let P;
        if (t[13] !== M) {
          P = {
            label: s4.jsxs(Text, {
              children: ["Yes, and don't ask again for ", M, " ", "in ", L]
            }),
            value: "yes-exact"
          };
          t[13] = M;
          t[14] = P;
        } else {
          P = t[14];
        }
        d.push(P);
      }
      if (c) {
        let M;
        if (t[15] !== n.skill) {
          let N = n.skill.indexOf(" ");
          M = n.skill.substring(0, N);
          t[15] = n.skill;
          t[16] = M;
        } else {
          M = t[16];
        }
        let P = M + ":*";
        let F;
        if (t[17] !== P) {
          F = s4.jsx(Text, {
            bold: true,
            children: P
          });
          t[17] = P;
          t[18] = F;
        } else {
          F = t[18];
        }
        let H;
        if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
          H = s4.jsx(Text, {
            bold: true,
            children: s
          });
          t[19] = H;
        } else {
          H = t[19];
        }
        let U;
        if (t[20] !== F) {
          U = {
            label: s4.jsxs(Text, {
              children: ["Yes, and don't ask again for", " ", F, " commands in", " ", H]
            }),
            value: "yes-prefix"
          };
          t[20] = F;
          t[21] = U;
        } else {
          U = t[21];
        }
        d.push(U);
      }
      let O;
      if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
        O = {
          label: "No",
          value: "no",
          feedbackConfig: {
            type: "reject"
          }
        };
        t[22] = O;
      } else {
        O = t[22];
      }
      d.push(O);
      t[6] = n.skill;
      t[7] = a;
      t[8] = c;
      t[9] = d;
    } else {
      d = t[9];
    }
    let p = d;
    let m;
    if (t[23] !== n.toolName) {
      m = qi(n.toolName);
      t[23] = n.toolName;
      t[24] = m;
    } else {
      m = t[24];
    }
    let f;
    if (t[25] !== n.isMcp || t[26] !== m) {
      f = {
        toolName: m,
        isMcp: n.isMcp
      };
      t[25] = n.isMcp;
      t[26] = m;
      t[27] = f;
    } else {
      f = t[27];
    }
    let h = f;
    let g;
    if (t[28] !== r || t[29] !== n) {
      g = (O, M) => {
        r(OPf(O, n, M));
      };
      t[28] = r;
      t[29] = n;
      t[30] = g;
    } else {
      g = t[30];
    }
    let y = g;
    let _;
    if (t[31] !== r) {
      _ = () => {
        r({
          behavior: "deny"
        });
      };
      t[31] = r;
      t[32] = _;
    } else {
      _ = t[32];
    }
    let b = _;
    let S = `Use skill "${n.skill}"?`;
    let E;
    if (t[33] === Symbol.for("react.memo_cache_sentinel")) {
      E = s4.jsx(Text, {
        children: "Claude may use instructions, code, or files from this Skill."
      });
      t[33] = E;
    } else {
      E = t[33];
    }
    let C;
    if (t[34] !== n.skillDescription) {
      C = n.skillDescription ? s4.jsx(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: s4.jsx(Text, {
          dimColor: true,
          children: n.skillDescription
        })
      }) : null;
      t[34] = n.skillDescription;
      t[35] = C;
    } else {
      C = t[35];
    }
    let x;
    if (t[36] !== n.permissionResult) {
      x = s4.jsx(FH, {
        permissionResult: n.permissionResult,
        toolType: "tool"
      });
      t[36] = n.permissionResult;
      t[37] = x;
    } else {
      x = t[37];
    }
    let A;
    if (t[38] !== b || t[39] !== y || t[40] !== p || t[41] !== h) {
      A = s4.jsx(ZBe, {
        options: p,
        onSelect: y,
        onCancel: b,
        toolAnalyticsContext: h
      });
      t[38] = b;
      t[39] = y;
      t[40] = p;
      t[41] = h;
      t[42] = A;
    } else {
      A = t[42];
    }
    let k;
    if (t[43] !== x || t[44] !== A) {
      k = s4.jsxs(gXd, {
        flexDirection: "column",
        children: [x, A]
      });
      t[43] = x;
      t[44] = A;
      t[45] = k;
    } else {
      k = t[45];
    }
    let I;
    if (t[46] !== n.requestSource || t[47] !== C || t[48] !== k || t[49] !== S) {
      I = s4.jsxs(qm, {
        title: S,
        requestSource: n.requestSource,
        children: [E, C, k]
      });
      t[46] = n.requestSource;
      t[47] = C;
      t[48] = k;
      t[49] = S;
      t[50] = I;
    } else {
      I = t[50];
    }
    return I;
  }
  var dOc;
  var s4;
  var mOc = __lazy(() => {
    at();
    XI();
    Ton();
    QCe();
    et();
    Gu();
    dOc = __toESM(pt(), 1);
    s4 = __toESM(ie(), 1);
  });
  function NPf(e, t) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: t.input
        };
      case "yes-dont-ask-again-domain":
        return {
          behavior: "allow",
          updatedInput: t.input,
          permissionUpdates: [{
            type: "addRules",
            rules: [{
              toolName: t.toolName,
              ruleContent: `domain:${t.hostname}`
            }],
            behavior: "allow",
            destination: "localSettings"
          }]
        };
      case "no":
        return {
          behavior: "deny"
        };
    }
  }
  function LPf(e) {
    let t = e.permissionResult.decisionReason;
    let n = t?.type === "safetyCheck" && !t.classifierApprovable;
    return e.showAlwaysAllow && !n && !e.isAskCappedByOrg && e.hostname !== "";
  }
  function hOc(e) {
    let t = fOc.c(35);
    let {
      payload: n,
      answer: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = LPf(n);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i;
    if (t[2] !== r || t[3] !== n) {
      i = E => {
        r(NPf(E, n));
      };
      t[2] = r;
      t[3] = n;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a = i;
    let l;
    if (t[5] !== r) {
      l = () => {
        r({
          behavior: "cancelled"
        });
      };
      t[5] = r;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c = l;
    let u;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      u = {
        label: "Yes",
        value: "yes"
      };
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== n.hostname || t[9] !== s) {
      if (d = [u], s) {
        let C;
        if (t[11] !== n.hostname) {
          C = {
            label: J5.jsxs(Text, {
              children: ["Yes, and don't ask again for", " ", J5.jsx(Text, {
                bold: true,
                children: n.hostname
              })]
            }),
            value: "yes-dont-ask-again-domain"
          };
          t[11] = n.hostname;
          t[12] = C;
        } else {
          C = t[12];
        }
        d.push(C);
      }
      let E;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        E = {
          label: J5.jsxs(Text, {
            children: ["No, and tell Claude what to do differently ", J5.jsx(Text, {
              bold: true,
              children: "(esc)"
            })]
          }),
          value: "no"
        };
        t[13] = E;
      } else {
        E = t[13];
      }
      d.push(E);
      t[8] = n.hostname;
      t[9] = s;
      t[10] = d;
    } else {
      d = t[10];
    }
    let p = d;
    let m;
    if (t[14] !== n.renderedToolUseMessage) {
      m = J5.jsx(Text, {
        children: n.renderedToolUseMessage
      });
      t[14] = n.renderedToolUseMessage;
      t[15] = m;
    } else {
      m = t[15];
    }
    let f;
    if (t[16] !== n.description) {
      f = J5.jsx(Text, {
        dimColor: true,
        children: n.description
      });
      t[16] = n.description;
      t[17] = f;
    } else {
      f = t[17];
    }
    let h;
    if (t[18] !== m || t[19] !== f) {
      h = J5.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [m, f]
      });
      t[18] = m;
      t[19] = f;
      t[20] = h;
    } else {
      h = t[20];
    }
    let g;
    if (t[21] !== n.permissionResult) {
      g = J5.jsx(FH, {
        permissionResult: n.permissionResult,
        toolType: "tool"
      });
      t[21] = n.permissionResult;
      t[22] = g;
    } else {
      g = t[22];
    }
    let y;
    if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
      y = J5.jsx(Text, {
        children: "Do you want to allow Claude to fetch this content?"
      });
      t[23] = y;
    } else {
      y = t[23];
    }
    let _;
    if (t[24] !== c || t[25] !== a || t[26] !== p) {
      _ = J5.jsx(xr, {
        options: p,
        onChange: a,
        onCancel: c
      });
      t[24] = c;
      t[25] = a;
      t[26] = p;
      t[27] = _;
    } else {
      _ = t[27];
    }
    let b;
    if (t[28] !== _ || t[29] !== g) {
      b = J5.jsxs(gXd, {
        flexDirection: "column",
        children: [g, y, _]
      });
      t[28] = _;
      t[29] = g;
      t[30] = b;
    } else {
      b = t[30];
    }
    let S;
    if (t[31] !== n.requestSource || t[32] !== b || t[33] !== h) {
      S = J5.jsxs(qm, {
        title: "Fetch",
        requestSource: n.requestSource,
        children: [h, b]
      });
      t[31] = n.requestSource;
      t[32] = b;
      t[33] = h;
      t[34] = S;
    } else {
      S = t[34];
    }
    return S;
  }
  var fOc;
  var J5;
  var gOc = __lazy(() => {
    $c();
    XI();
    QCe();
    et();
    fOc = __toESM(pt(), 1);
    J5 = __toESM(ie(), 1);
  });
  function FPf(e, t) {
    let n = t;
    while (n < e.length && /\s/.test(e[n])) {
      n++;
    }
    let r = e[n];
    if (r !== '"' && r !== "'" && r !== "`") {
      let i = Math.min(e.length, n + 5000);
      let a = 0;
      let l = n;
      while (l < i) {
        let c = e[l];
        if (c === "(" || c === "[" || c === "{") {
          a++;
        } else if (c === ")" || c === "]" || c === "}") {
          if (a === 0) {
            break;
          }
          a--;
        } else if (c === "," && a === 0) {
          break;
        } else if (c === '"' || c === "'" || c === "`") {
          l++;
          while (l < i && e[l] !== c) {
            if (e[l] === "\\") {
              l++;
            }
            l++;
          }
        }
        l++;
      }
      return truncate(e.slice(n, l).trim(), 100);
    }
    n++;
    let o = [];
    while (n < e.length) {
      let i = e[n];
      if (i === "\\") {
        o.push(e[n + 1] ?? "");
        n += 2;
        continue;
      }
      if (i === r) {
        break;
      }
      if (r === "`" && i === "$" && e[n + 1] === "{") {
        o.push("${\u2026}");
        let a = 1;
        n += 2;
        while (n < e.length && a > 0) {
          if (e[n] === "{") {
            a++;
          }
          if (e[n] === "}") {
            a--;
          }
          n++;
        }
        continue;
      }
      o.push(i);
      n++;
    }
    let s = o.join("").replace(/\s+/g, " ").trim();
    return truncate(s, 100);
  }
  function _Oc(e, t, n) {
    if (e[t] !== "(") {
      return;
    }
    let r = Math.min(e.length, t + 5000);
    let o = 0;
    let s = t;
    while (s < r) {
      let i = e[s];
      if (i === "(") {
        o++;
      } else if (i === ")") {
        if (o--, o === 0) {
          return e.slice(t + 1, s);
        }
      } else if (n && i === ";" && o === 1) {
        return e.slice(t + 1, s);
      }
      s++;
    }
    return;
  }
  function UPf(e, t, n) {
    let r = 0;
    let o = t;
    while (o < n) {
      let s = e[o];
      if (s === "(" || s === "[" || s === "{") {
        r++;
      } else if (s === ")" || s === "]" || s === "}") {
        if (r === 0) {
          return o;
        }
        r--;
      } else if (r === 0 && s === ";") {
        return o + 1;
      } else if (r === 0 && s === `
`) {
        let i = o + 1;
        while (i < n && /\s/.test(e[i] ?? "")) {
          i++;
        }
        if (e[i] !== "{") {
          return o + 1;
        }
      }
      o++;
    }
    return -1;
  }
  function bxt(e) {
    return e != null && /[A-Za-z0-9_]/.test(e);
  }
  function bOc(e) {
    try {
      let t = [];
      let n = 0;
      let r = 0;
      let o = false;
      let s;
      let i = -1;
      let a = [];
      let l = [];
      let c = e.length;
      let u = 0;
      while (u < c) {
        if (i >= 0 && u >= i) {
          o = false;
          s = undefined;
          i = -1;
        }
        let m = e[u];
        if (m === "/" && e[u + 1] === "/") {
          while (u < c && e[u] !== `
`) {
            u++;
          }
        } else if (m === "/" && e[u + 1] === "*") {
          u += 2;
          while (u < c && !(e[u] === "*" && e[u + 1] === "/")) {
            u++;
          }
          u++;
        } else if (m === '"' || m === "'" || m === "`") {
          u++;
          while (u < c && e[u] !== m) {
            if (e[u] === "\\") {
              u++;
            }
            u++;
          }
        } else if (m === "{") {
          if (n++, o && r === 0) {
            a.push({
              braceDepth: n,
              cond: s
            });
            o = false;
            s = undefined;
            i = -1;
          }
        } else if (m === "}") {
          let f = a.at(-1);
          if (f && f.braceDepth === n) {
            a.pop();
          }
          n--;
        } else if (m === "(") {
          r++;
        } else if (m === ")") {
          let f = l.at(-1);
          if (f !== undefined && f === r) {
            l.pop();
          }
          if (r--, o && r === 0 && i < 0) {
            let h = u + 1;
            let g = Math.min(c, h + 5000);
            while (h < g && /\s/.test(e[h] ?? "")) {
              h++;
            }
            if (e[h] !== "{") {
              let y = UPf(e, h, Math.min(c, h + 5000));
              if (y >= 0) {
                i = y;
              }
            }
          }
        } else if (m === "w" && e.startsWith("while", u) && r === 0 && !bxt(e[u - 1]) && !bxt(e[u + 5])) {
          let f = e.indexOf("(", u);
          if (f === -1 || f - u > 5000) {
            u++;
            continue;
          }
          o = true;
          i = -1;
          s = _Oc(e, f, false);
        } else if (m === "f" && e.startsWith("for", u) && r === 0 && !bxt(e[u - 1]) && !bxt(e[u + 3])) {
          let f = e.indexOf("(", u);
          if (f === -1 || f - u > 5000) {
            u++;
            continue;
          }
          o = true;
          i = -1;
          s = _Oc(e, f, true);
        } else if (m === "p" && e.startsWith("parallel(", u) && !bxt(e[u - 1])) {
          l.push(r + 1);
          u += 7;
        } else if (m === "a" && e.startsWith("agent", u) && !bxt(e[u - 1])) {
          let f = u + 5;
          while (f < c && /\s/.test(e[f] ?? "")) {
            f++;
          }
          if (e[f] === "(") {
            let h = l.length > 0 ? "parallel" : o || a.length > 0 ? "loop" : "sequential";
            let g = o ? s : a.at(-1)?.cond;
            let y = h === "loop" ? g?.trim().slice(0, 40) : h === "parallel" ? "\xD7 N" : undefined;
            t.push({
              prompt: FPf(e, f + 1),
              kind: h,
              annotation: y
            });
          }
        }
        u++;
      }
      if (t.length === 0) {
        return null;
      }
      let d = [];
      for (let m of t) {
        let f = d.at(-1);
        if (f && f.kind === m.kind && f.annotation === m.annotation) {
          f.agents.push({
            prompt: m.prompt
          });
        } else {
          d.push({
            kind: m.kind,
            agents: [{
              prompt: m.prompt
            }],
            annotation: m.annotation
          });
        }
      }
      let p = 0;
      for (let m of d) {
        let f = m.agents.length;
        p += m.kind === "sequential" ? f : f * 3;
      }
      return {
        phases: d,
        estimatedAgents: p,
        hasReturn: /\breturn\b/.test(e)
      };
    } catch {
      return null;
    }
  }
  var SOc = __lazy(() => {
    cs();
  });
  var COc = {};