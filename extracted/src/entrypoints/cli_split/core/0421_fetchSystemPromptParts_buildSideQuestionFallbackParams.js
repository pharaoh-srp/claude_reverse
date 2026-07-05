  __export(Rdc, {
    fetchSystemPromptParts: () => fetchSystemPromptParts,
    buildSideQuestionFallbackParams: () => buildSideQuestionFallbackParams
  });
  async function fetchSystemPromptParts({
    tools: e,
    mainLoopModel: t,
    additionalWorkingDirectories: n,
    customSystemPrompt: r,
    excludeDynamicSections: o,
    cacheBreakerPhrase: s
  }) {
    let [i, a, l, c] = await Promise.all([r !== undefined ? Promise.resolve([]) : GO(e, t, n, {
      excludeDynamicSections: o
    }), iE(), r !== undefined ? Promise.resolve({}) : Tv(s), o && r === undefined ? Urr(t, n) : Promise.resolve({})]);
    if (o) {
      return {
        defaultSystemPrompt: i,
        userContext: {
          ...l,
          ...a,
          ...c
        },
        systemContext: {}
      };
    }
    return {
      defaultSystemPrompt: i,
      userContext: a,
      systemContext: l
    };
  }
  async function buildSideQuestionFallbackParams({
    tools: e,
    commands: t,
    mcpClients: n,
    messages: r,
    readFileState: o,
    getAppState: s,
    setAppState: i,
    customSystemPrompt: a,
    appendSystemPrompt: l,
    excludeDynamicSections: c,
    thinkingConfig: u,
    agents: d
  }) {
    let p = s();
    let m = getRuntimeMainLoopModel({
      permissionMode: p.toolPermissionContext.mode,
      mainLoopModel: getMainLoopModel()
    });
    let {
      defaultSystemPrompt: f,
      userContext: h,
      systemContext: g
    } = await fetchSystemPromptParts({
      tools: e,
      mainLoopModel: m,
      additionalWorkingDirectories: Array.from(p.toolPermissionContext.additionalWorkingDirectories.keys()),
      customSystemPrompt: a,
      excludeDynamicSections: c,
      cacheBreakerPhrase: p.cacheBreakerPhrase
    });
    let y = [...(typeof a === "string" ? [a] : Array.isArray(a) ? a : f), ...(l ? [l] : [])];
    let _ = r.at(-1);
    let b = _?.type === "assistant" && _.message.stop_reason === null ? r.slice(0, -1) : r;
    let S = {
      messageQueue: Yh,
      agentContext: ym(),
      options: {
        commands: t,
        debug: false,
        mainLoopModel: m,
        tools: e,
        verbose: false,
        thinkingConfig: u ?? (wce() !== false ? {
          type: "adaptive"
        } : {
          type: "disabled"
        }),
        mcpClients: n,
        mcpResources: {},
        isNonInteractiveSession: true,
        agentDefinitions: {
          activeAgents: d,
          allAgents: []
        },
        customSystemPrompt: a,
        appendSystemPrompt: l,
        autoCompactWindow: p.autoCompactWindow,
        fastMode: p.fastMode,
        cacheBreakerPhrase: p.cacheBreakerPhrase
      },
      abortController: createAbortController(),
      readFileState: o,
      getAppState: s,
      setAppState: i,
      getMcp: () => s().mcp,
      getWebBrowser: () => s().webBrowser,
      setToolPermissionContext: E => i(C => {
        let x = typeof E === "function" ? E(C.toolPermissionContext) : E;
        return C.toolPermissionContext === x ? C : {
          ...C,
          toolPermissionContext: x
        };
      }),
      taskRegistry: DO(s, i),
      sessionHooksRegistry: AKe(i),
      getReplContexts: () => s().replContexts,
      setReplContext: CJe(i),
      setWebBrowserSlice: makeSetWebBrowserSlice(i),
      setArtifactReadVersion: makeSetArtifactReadVersion(i),
      agentLifecycle: VYe(s, i),
      teammateColors: zYe(s, i),
      rootToolSurface: {
        tools: e,
        mainLoopModel: m
      },
      messages: b,
      turnStartIndex: 0,
      getFileHistoryState: () => {
        return;
      },
      applyFileHistoryOp: () => {},
      applyAttributionOp: () => {}
    };
    return {
      systemPrompt: y,
      userContext: h,
      systemContext: g,
      toolUseContext: S,
      forkContextMessages: b
    };
  }
  var Ydr = __lazy(() => {
    dz();
    LG();
    nwe();
    Kp();
    _h();
    Kwt();
    pZ();
    Rf();
    Eo();
    Ywt();
    U$();
    XN();
  });
  var xdc = {};