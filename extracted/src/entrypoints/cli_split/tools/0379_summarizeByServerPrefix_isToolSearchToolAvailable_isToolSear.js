  __export(w2o, {
    summarizeByServerPrefix: () => summarizeByServerPrefix,
    isToolSearchToolAvailable: () => isToolSearchToolAvailable,
    isToolSearchEnabled: () => isToolSearchEnabled,
    isToolReferenceBlock: () => isToolReferenceBlock,
    getDeferredToolsDelta: () => getDeferredToolsDelta,
    getAutoToolSearchCharThreshold: () => getAutoToolSearchCharThreshold,
    extractDiscoveredToolNames: () => extractDiscoveredToolNames,
    DEFERRED_DELTA_LIST_CAP: () => 30
  });
  function x2o() {
    let e = process.env.ENABLE_TOOL_SEARCH;
    if (!e) {
      return 10;
    }
    if (e === "auto") {
      return 10;
    }
    let t = Qco(e);
    if (t !== null) {
      return t;
    }
    return 10;
  }
  function VFl(e) {
    let t = iT(e, kk(Jit(e)));
    let n = x2o() / 100;
    return Math.floor(t * n);
  }
  function getAutoToolSearchCharThreshold(e) {
    return Math.floor(VFl(e) * 2.5);
  }
  function isToolSearchToolAvailable(e) {
    return e.some(t => bl(t, "ToolSearch"));
  }
  async function vFm(e, t, n, r) {
    let o = e.filter(i => isDeferredTool(i));
    if (o.length === 0) {
      return 0;
    }
    return (await Promise.all(o.map(async i => {
      let a = await i.prompt({
        getToolPermissionContext: t,
        tools: e,
        agents: n,
        model: r
      });
      let l = i.inputJSONSchema ? De(i.inputJSONSchema) : i.inputSchema ? De(RFe(i.inputSchema)) : "";
      return i.name.length + a.length + l.length;
    }))).reduce((i, a) => i + a, 0);
  }
  async function isToolSearchEnabled(e, t, n, r, o) {
    let s = Bn(t, l => l.isMcp);
    function i(l, c, u, d) {
      logEvent("tengu_tool_search_mode_decision", {
        enabled: l,
        mode: c,
        reason: u,
        checkedModel: e,
        mcpToolCount: s,
        mcpNonBlocking: getMcpConnectNonBlocking(),
        userType: "external",
        ...d
      });
    }
    if (!CX(e)) {
      logForDebugging(`Tool search disabled for model '${e}': model does not support tool_reference blocks. This feature is available on Claude Sonnet 4+, Opus 4+, Haiku 4.5+, and newer models.`);
      i(false, "standard", "model_unsupported");
      return false;
    }
    if (!Zle(e, "tool_search_server") || !Zle(e, "tool_search")) {
      logForDebugging(`Tool search disabled: Foundry deployment for '${e}' does not support tool search.`);
      i(false, "standard", "foundry_deployment_unsupported");
      return false;
    }
    if (!isToolSearchToolAvailable(t)) {
      logForDebugging("Tool search disabled: ToolSearchTool is not available (may have been disallowed via disallowedTools).");
      i(false, "standard", "mcp_search_unavailable");
      return false;
    }
    let a = G3t();
    switch (a) {
      case "tst":
        i(true, a, "tst_enabled");
        return true;
      case "tst-auto":
        {
          let {
            enabled: l,
            debugDescription: c,
            metrics: u
          } = await RFm(t, n, r, e);
          if (l) {
            logForDebugging(`Auto tool search enabled: ${c}` + (o ? ` [source: ${o}]` : ""));
            i(true, a, "auto_above_threshold", u);
            return true;
          }
          logForDebugging(`Auto tool search disabled: ${c}` + (o ? ` [source: ${o}]` : ""));
          i(false, a, "auto_below_threshold", u);
          return false;
        }
      case "standard":
        i(false, a, "standard_mode");
        return false;
    }
  }
  function isToolReferenceBlock(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "tool_reference";
  }
  function wFm(e) {
    return isToolReferenceBlock(e) && "tool_name" in e && typeof e.tool_name === "string";
  }
  function CFm(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "tool_result" && "content" in e && Array.isArray(e.content);
  }
  function extractDiscoveredToolNames(e) {
    let t = new Set();
    let n = 0;
    for (let r of e) {
      if (r.type === "system" && r.subtype === "compact_boundary") {
        let s = r.compactMetadata?.preCompactDiscoveredTools;
        if (s) {
          for (let i of s) {
            t.add(i);
          }
          n += s.length;
        }
        continue;
      }
      if (r.type !== "user") {
        continue;
      }
      let o = r.message?.content;
      if (!Array.isArray(o)) {
        continue;
      }
      for (let s of o) {
        if (CFm(s)) {
          for (let i of s.content) {
            if (wFm(i)) {
              t.add(i.tool_name);
            }
          }
        }
      }
    }
    if (t.size > 0) {
      logForDebugging(`Dynamic tool loading: found ${t.size} discovered tools in message history` + (n > 0 ? ` (${n} carried from compact boundary)` : ""));
    }
    return t;
  }
  function getDeferredToolsDelta(e, t, n, r, o) {
    let s = new Set();
    let i = new Set();
    let a = [];
    let l = [];
    let c = 0;
    let u = 0;
    let d = new Set();
    for (let A of t) {
      if (A.type !== "attachment") {
        continue;
      }
      if (c++, d.add(A.attachment.type), A.attachment.type !== "deferred_tools_delta") {
        continue;
      }
      u++;
      let k = new Set(A.attachment.readdedNames ?? []);
      for (let I of A.attachment.addedNames) {
        if (M3t.vZc(I)) {
          continue;
        }
        if (s.add(I), !k.vZc(I)) {
          i.add(I);
        }
      }
      for (let I of A.attachment.removedNames) {
        s.delete(I);
      }
      if (A.attachment.pendingMcpServers !== undefined) {
        a = A.attachment.pendingMcpServers;
      }
      if (A.attachment.needsAuthMcpServers !== undefined) {
        l = A.attachment.needsAuthMcpServers;
      }
    }
    let p = e.filter(isDeferredTool);
    let m = new Set(p.map(A => A.name));
    let f = new Set(e.map(A => A.name));
    let h = p.filter(A => !s.vZc(A.name));
    let g = p.filter(A => !i.vZc(A.name));
    let y = h.filter(A => i.vZc(A.name)).map(A => A.name);
    let _ = [];
    for (let A of s) {
      if (m.vZc(A)) {
        continue;
      }
      if (!f.vZc(A)) {
        _.push(A);
      }
    }
    let b = r !== undefined ? [...r].sort() : [];
    let S = r !== undefined && (b.length !== a.length || b.some((A, k) => A !== a[k]));
    let E = o !== undefined ? [...o].sort() : [];
    let C = o !== undefined && (E.length !== l.length || E.some((A, k) => A !== l[k]));
    if (h.length === 0 && _.length === 0 && g.length === 0 && !S && !C) {
      return null;
    }
    let x = Ro([...h, ...g].map(A => A.name));
    logEvent("tengu_deferred_tools_pool_change", {
      addedCount: h.length,
      readdedCount: y.length,
      unlistedCount: g.length,
      removedCount: _.length,
      pendingChanged: S,
      pendingCount: b.length,
      lastPendingCount: a.length,
      needsAuthChanged: C,
      needsAuthCount: E.length,
      lastNeedsAuthCount: l.length,
      priorAnnouncedCount: s.size,
      messagesLength: t.length,
      attachmentCount: c,
      dtdCount: u,
      callSite: n?.callSite ?? "unknown",
      querySource: Vg(n?.querySource) ?? "unknown",
      attachmentTypesSeen: [...d].sort().join(",")
    });
    return {
      addedNames: x.sort(),
      addedLines: g.map(formatDeferredToolLine).sort(),
      removedNames: _.sort(),
      readdedNames: y.sort(),
      ...(r !== undefined && {
        pendingMcpServers: b
      }),
      ...(o !== undefined && {
        needsAuthMcpServers: E
      })
    };
  }
  function summarizeByServerPrefix(e) {
    let t = new Map();
    for (let n of e) {
      let r = n.startsWith("mcp__") ? `${n.split("__", 2).join("__")}__*` : n;
      t.set(r, (t.get(r) ?? 0) + 1);
    }
    return [...t.entries()].sort(([n], [r]) => n.localeCompare(r)).map(([n, r]) => r > 1 ? `${n} (${r})` : n).join(", ");
  }
  async function RFm(e, t, n, r) {
    let o = await EFm(e, t, n, r);
    if (o !== null) {
      let a = VFl(r);
      return {
        enabled: o >= a,
        debugDescription: `${o} tokens (threshold: ${a}, ${x2o()}% of context)`,
        metrics: {
          deferredToolTokens: o,
          threshold: a
        }
      };
    }
    let s = await vFm(e, t, n, r);
    let i = getAutoToolSearchCharThreshold(r);
    return {
      enabled: s >= i,
      debugDescription: `${s} chars (threshold: ${i}, ${x2o()}% of context) (char fallback)`,
      metrics: {
        deferredToolDescriptionChars: s,
        charThreshold: i
      }
    };
  }
  var EFm;
  var foe = __lazy(() => {
    at();
    KN();
    Bco();
    Ot();
    Tst();
    ci();
    kX();
    Frr();
    DC();
    VT();
    je();
    RX();
    $rr();
    EFm = TEr(async (e, t, n, r) => {
      let o = e.filter(s => isDeferredTool(s));
      if (o.length === 0) {
        return 0;
      }
      try {
        let s = await CFe(o, t, {
          activeAgents: n,
          allAgents: n
        }, r);
        if (s === 0) {
          return null;
        }
        return Math.max(0, s - 500);
      } catch {
        return null;
      }
    }, e => e.filter(t => isDeferredTool(t)).map(t => t.name).join(","));
  });
  function qrr() {
    return false;
  }
  async function xFm(e, t, n) {
    if (!qrr()) {
      return await n();
    }
    let r = TXt.createHash("sha1").update(De(e)).digest("hex").slice(0, 12);
    let o = KEt.join(process.env.CLAUDE_CODE_TEST_FIXTURES_ROOT ?? Nt(), `fixtures/${t}-${r}.json`);
    try {
      return qt(await Ewe.readFile(o, {
        encoding: "utf8"
      }));
    } catch (i) {
      if (en(i) !== "ENOENT") {
        throw i;
      }
    }
    if ((Me.isCI || false) && !Me.VCR_RECORD) {
      throw Error(`Fixture missing: ${o}. Re-run tests with VCR_RECORD=1, then commit the result.`);
    }
    let s = await n();
    await Ewe.mkdir(KEt.dirname(o), {
      recursive: true
    });
    await Ewe.writeFile(o, De(s, null, 2), {
      encoding: "utf8"
    });
    return s;
  }
  async function Wrr(e, t) {
    if (!qrr()) {
      return await t();
    }
    let n = EO(e.filter(i => {
      if (i.type === "attachment") {
        return i.attachment.type !== "agent_listing_delta";
      }
      if (i.type !== "user") {
        return true;
      }
      if (i.isMeta) {
        return false;
      }
      return true;
    }));
    let r = AFm(n.map(i => i.message.content), A2o);
    let o = KEt.join(process.env.CLAUDE_CODE_TEST_FIXTURES_ROOT ?? Nt(), `fixtures/${r.map(i => TXt.createHash("sha1").update(De(i)).digest("hex").slice(0, 6)).join("-")}.json`);
    try {
      let i = qt(await Ewe.readFile(o, {
        encoding: "utf8"
      }));
      i.output.forEach(kFm);
      return i.output.map((a, l) => KFl(a, OFm, l, TXt.randomUUID()));
    } catch (i) {
      if (en(i) !== "ENOENT") {
        throw i;
      }
    }
    if (Me.isCI && !Me.VCR_RECORD) {
      throw Error(`Anthropic API fixture missing: ${o}. Re-run tests with VCR_RECORD=1, then commit the result. Input messages:
${De(r, null, 2)}`);
    }
    let s = await t();
    if (Me.isCI && !Me.VCR_RECORD) {
      return s;
    }
    await Ewe.mkdir(KEt.dirname(o), {
      recursive: true
    });
    await Ewe.writeFile(o, De({
      input: r,
      output: s.map((i, a) => KFl(i, A2o, a))
    }, null, 2), {
      encoding: "utf8"
    });
    return s;
  }
  function kFm(e) {
    if (e.type !== "assistant") {
      return;
    }
    let t = e.message.model;
    let n = e.message.usage;
    let r = c8(t, n);
    XX(r, n, t);
  }
  function AFm(e, t) {
    return e.map(n => {
      if (typeof n === "string") {
        return t(n);
      }
      return n.map(r => {
        switch (r.type) {
          case "tool_result":
            if (typeof r.content === "string") {
              return {
                ...r,
                content: t(r.content)
              };
            }
            if (Array.isArray(r.content)) {
              return {
                ...r,
                content: r.content.map(o => {
                  switch (o.type) {
                    case "text":
                      return {
                        ...o,
                        text: t(o.text)
                      };
                    case "image":
                      return o;
                    default:
                      return;
                  }
                })
              };
            }
            return r;
          case "text":
            return {
              ...r,
              text: t(r.text)
            };
          case "tool_use":
            return {
              ...r,
              input: jrr(r.input, t)
            };
          case "image":
            return IFm(r);
          default:
            return;
        }
      });
    });
  }
  function IFm(e) {
    if (e.source.type !== "base64") {
      return e;
    }
    return {
      ...e,
      source: {
        ...e.source,
        data: "[IMAGE_DATA]"
      }
    };
  }
  function jrr(e, t) {
    return Sbu(e, (n, r) => {
      if (Array.isArray(n)) {
        return n.map(o => jrr(o, t));
      }
      if (Qju(n)) {
        return jrr(n, t);
      }
      return t(n, r, e);
    });
  }
  function PFm(e, t, n, r) {
    return {
      uuid: r ?? `UUID-${n}`,
      requestId: "REQUEST_ID",
      timestamp: e.timestamp,
      isApiErrorMessage: e.isApiErrorMessage,
      apiError: e.apiError,
      error: e.error,
      errorDetails: e.errorDetails,
      healsDistinctCarrier: e.healsDistinctCarrier,
      message: {
        ...e.message,
        content: e.message.content.map(o => {
          switch (o.type) {
            case "text":
              return {
                ...o,
                text: t(o.text),
                citations: o.citations || []
              };
            case "tool_use":
              return {
                ...o,
                input: jrr(o.input, t)
              };
            default:
              return o;
          }
        }).filter(Boolean)
      },
      type: "assistant"
    };
  }
  function KFl(e, t, n, r) {
    if (e.type === "assistant") {
      return PFm(e, t, n, r);
    } else {
      return e;
    }
  }
  function A2o(e) {
    if (typeof e !== "string") {
      return e;
    }
    let t = Nt();
    let n = er();
    let r = e.replace(/num_files="\d+"/g, 'num_files="[NUM]"').replace(/duration_ms="\d+"/g, 'duration_ms="[DURATION]"').replace(/cost_usd="\d+"/g, 'cost_usd="[COST]"').replaceAll(n, "[CONFIG_HOME]").replaceAll(t, "[CWD]").replace(/Available commands:.+/, "Available commands: [COMMANDS]");
    if (r = r.replace(/\[CWD\][^\s"'<>]*/g, o => o.replaceAll("\\\\", "/").replaceAll("\\", "/")).replace(/\[CONFIG_HOME\][^\s"'<>]*/g, o => o.replaceAll("\\\\", "/").replaceAll("\\", "/")), r.includes("Files modified by user:")) {
      return "Files modified by user: [FILES]";
    }
    return r;
  }
  function OFm(e) {
    if (typeof e !== "string") {
      return e;
    }
    return e.replaceAll("[NUM]", "1").replaceAll("[DURATION]", "100").replaceAll("[CONFIG_HOME]", er()).replaceAll("[CWD]", Nt());
  }
  async function* I2o(e, t) {
    if (!qrr()) {
      return yield* t();
    }
    let n = [];
    let r = await Wrr(e, async () => {
      for await (let o of t()) {
        if (o.type === "fallback_request" && o.creditCode !== null) {
          n.push({
            ...o,
            creditCode: null
          });
        } else {
          n.push(o);
        }
      }
      return n;
    });
    if (r.length > 0) {
      yield* r;
      return;
    }
    yield* n;
  }
  async function P2o(e, t, n) {
    if (!qrr()) {
      return await n();
    }
    let r = Nt().replace(/[^a-zA-Z0-9]/g, "-");
    let o = A2o(De({
      messages: e,
      tools: t
    })).replaceAll(r, "[CWD_SLUG]").replace(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/gi, "[UUID]").replace(/\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}(\.\d+)?Z?/g, "[TIMESTAMP]");
    return (await xFm(o, "token-count", async () => ({
      tokenCount: await n()
    }))).tokenCount;
  }
  var TXt;
  var Ewe;
  var KEt;
  var O2o = __lazy(() => {
    C$();
    vo();
    pr();
    gn();
    dt();
    ro();
    TXt = require("crypto");
    Ewe = require("fs/promises");
    KEt = require("path");
  });
  function JFl(e) {
    for (let t of e) {
      if (t.role === "assistant" && Array.isArray(t.content)) {
        for (let n of t.content) {
          if (typeof n === "object" && n !== null && "type" in n && (n.type === "thinking" || n.type === "redacted_thinking")) {
            return true;
          }
        }
      }
    }
    return false;
  }
  function DFm(e) {
    return e.map(t => {
      if (!Array.isArray(t.content)) {
        return t;
      }
      let n = t.content.map(r => {
        if (r.type === "tool_use") {
          let o = r;
          return {
            type: "tool_use",
            id: o.id,
            name: o.name,
            input: o.input
          };
        }
        if (r.type === "tool_result") {
          let o = r;
          if (Array.isArray(o.content)) {
            let s = o.content.filter(i => !isToolReferenceBlock(i));
            if (s.length === 0) {
              return {
                ...o,
                content: [{
                  type: "text",
                  text: "[tool references]"
                }]
              };
            }
            if (s.length !== o.content.length) {
              return {
                ...o,
                content: s
              };
            }
          }
        }
        return r;
      });
      return {
        ...t,
        content: n
      };
    });
  }
  function XFl(e) {
    if (e.length === 0) {
      return e;
    }
    return e.map(t => {
      let {
        eager_input_streaming: n,
        defer_loading: r,
        strict: o,
        ...s
      } = t;
      if (n === undefined && r === undefined && o === undefined) {
        return t;
      }
      return s;
    });
  }
  async function QFl(e) {
    if (!e) {
      return 0;
    }
    return i6e([{
      role: "user",
      content: e
    }], []);
  }
  async function i6e(e, t, n) {
    e = M2o(e);
    let r = XFl(t);
    return P2o(e, r, async () => {
      try {
        let o = n ?? getMainLoopModel();
        let s = A8(o);
        let i = JFl(e);
        if (getProviderForModel(o) === "bedrock") {
          return NFm({
            model: normalizeModelStringForAPI(o),
            messages: e,
            tools: r,
            betas: s,
            containsThinking: i
          });
        }
        let l = await R8({
          maxRetries: 1,
          model: o,
          source: "count_tokens",
          agentContext: ym()
        });
        let c = s.filter(d => tWr.vZc(d));
        let u = await l.beta.messages.countTokens({
          model: normalizeModelStringForAPI(o),
          messages: e.length > 0 ? e : [{
            role: "user",
            content: "foo"
          }],
          tools: r,
          ...(c.length > 0 && {
            betas: kk(c)
          }),
          ...(i && {
            thinking: {
              type: "enabled",
              budget_tokens: 1024
            }
          })
        });
        if (typeof u.input_tokens !== "number") {
          return null;
        }
        return u.input_tokens;
      } catch (o) {
        if (logForDebugging(`countTokens API call failed: ${o instanceof Error ? o.message : String(o)}`, {
          level: "error"
        }), getGatewayAuth()) {
          return C2o(e, t).catch(() => null);
        }
        return null;
      }
    });
  }
  async function C2o(e, t) {
    e = M2o(e);
    let n = XFl(t);
    return P2o(e, n, async () => {
      let r = JFl(e);
      let o = st(process.env.CLAUDE_CODE_USE_VERTEX) && Dae(getSmallFastModel()) === "global";
      let s = st(process.env.CLAUDE_CODE_USE_BEDROCK) && r;
      let i = st(process.env.CLAUDE_CODE_USE_VERTEX) && r;
      let a = o || s || i ? getDefaultSonnetModel() : getSmallFastModel();
      let l = await R8({
        maxRetries: 1,
        model: a,
        source: "count_tokens",
        agentContext: ym()
      });
      let c = DFm(e);
      let u = c.length > 0 ? c : [{
        role: "user",
        content: "count"
      }];
      let p = A8(a).filter(_ => tWr.vZc(_));
      let f = (await l.beta.messages.create({
        model: normalizeModelStringForAPI(a),
        max_tokens: r ? 2048 : 1,
        messages: u,
        tools: n.length > 0 ? n : undefined,
        ...(p.length > 0 && {
          betas: kk(p)
        }),
        metadata: CDe(),
        ...lKe(),
        ...(r && {
          thinking: {
            type: "enabled",
            budget_tokens: 1024
          }
        })
      })).usage;
      let h = f.input_tokens;
      let g = f.cache_creation_input_tokens || 0;
      let y = f.cache_read_input_tokens || 0;
      return h + g + y;
    });
  }
  function nR(e, t) {
    let n = 0;
    for (let r of e) {
      n += MFm(r, t);
    }
    return n;
  }
  function MFm(e, t) {
    if ((e.type === "assistant" || e.type === "user" || e.type === "api_system") && e.message?.content) {
      return XOe(e.message?.content, t);
    }
    if (e.type === "attachment" && e.attachment) {
      let n = Grr(e.attachment);
      let r = 0;
      for (let o of n) {
        r += XOe(o.message.content, t);
      }
      return r;
    }
    return 0;
  }
  async function NFm({
    model: e,
    messages: t,
    tools: n,
    betas: r,
    containsThinking: o
  }) {
    try {
      let s = await pni();
      let i = Hqr(e) ? e : await QAe(e);
      if (!i) {
        return null;
      }
      let a = {
        anthropic_version: "bedrock-2023-05-31",
        messages: t.length > 0 ? t : [{
          role: "user",
          content: "foo"
        }],
        max_tokens: o ? 2048 : 1,
        ...(n.length > 0 && {
          tools: n
        }),
        ...(r.length > 0 && {
          anthropic_beta: kk(r)
        }),
        ...(o && {
          thinking: {
            type: "enabled",
            budget_tokens: 1024
          }
        })
      };
      let {
        CountTokensCommand: l
      } = await Promise.resolve().then(() => (rwn(), $qr));
      let c = {
        modelId: i,
        input: {
          invokeModel: {
            body: new TextEncoder().HS(De(a))
          }
        }
      };
      return (await s.send(new l(c))).inputTokens ?? null;
    } catch (s) {
      logForDebugging(`Bedrock CountTokens failed: ${s}`, {
        level: "error"
      });
      return null;
    }
  }
  var IV = __lazy(() => {
    Ds();
    at();
    KN();
    _h();
    DC();
    je();
    gn();
    ro();
    Hle();
    Eo();
    foe();
    aE();
    uIe();
    aU();
    O2o();
  });
  function LFm(e) {
    let {
      firstPage: t,
      lastPage: n
    } = e ?? {};
    if (t === undefined) {
      return "page range";
    }
    if (n === undefined || n === 1 / 0) {
      return `pages ${t}-`;
    }
    if (t === n) {
      return `page ${t}`;
    }
    return `pages ${t}-${n}`;
  }
  async function eUl(e) {
    try {
      let r = (await zt().stat(e)).size;
      if (r === 0) {
        return {
          success: false,
          error: {
            reason: "empty",
            message: `PDF file is empty: ${e}`
          }
        };
      }
      if (r > 20971520) {
        return {
          success: false,
          error: {
            reason: "too_large",
            message: `PDF file exceeds maximum allowed size of ${formatFileSize(20971520)}.`
          }
        };
      }
      let o = await xFe.readFile(e);
      if (!o.subarray(0, 5).toString("ascii").startsWith("%PDF-")) {
        return {
          success: false,
          error: {
            reason: "corrupted",
            message: `File is not a valid PDF (missing %PDF- header): ${e}`
          }
        };
      }
      let i = o.toString("base64");
      return {
        success: true,
        data: {
          type: "pdf",
          file: {
            filePath: e,
            base64: i,
            originalSize: r
          }
        }
      };
    } catch (t) {
      if (Io(t)) {
        throw t;
      }
      return {
        success: false,
        error: {
          reason: "unknown",
          message: he(t)
        }
      };
    }
  }
  async function Vrr(e) {
    let {
      code: t,
      stdout: n
    } = await execFileNoThrow("pdfinfo", [e], {
      timeout: 1e4,
      useCwd: false
    });
    if (t !== 0) {
      return null;
    }
    let r = /^Pages:\s+(\d+)/m.exec(n);
    if (!r) {
      return null;
    }
    let o = parseInt(r[1], 10);
    return isNaN(o) ? null : o;
  }
  function FFm(e) {
    let t = e === "win32" ? 0 : L2o.constants.O_NONBLOCK ?? 0;
    return L2o.constants.O_RDONLY | t;
  }
  async function UFm() {
    if (N2o !== undefined) {
      return N2o;
    }
    let {
      code: e,
      stderr: t
    } = await execFileNoThrow("pdftoppm", ["-v"], {
      timeout: 5000,
      useCwd: false
    });
    let n = e === 0 || e !== 127 && t.length > 0;
    if (n) {
      N2o = true;
    }
    return n;
  }
  async function U2o(e, t) {
    try {
      let n = await xFe.open(e, FFm("linux"));
      let r = await n.stat().finally(() => n.close());
      if (!r.isFile()) {
        return {
          success: false,
          error: {
            reason: "corrupted",
            message: `Path is not a regular file: ${e}`
          }
        };
      }
      let o = r.size;
      if (o === 0) {
        return {
          success: false,
          error: {
            reason: "empty",
            message: `PDF file is empty: ${e}`
          }
        };
      }
      if (o > 104857600) {
        return {
          success: false,
          error: {
            reason: "too_large",
            message: `PDF file exceeds maximum allowed size for text extraction (${formatFileSize(104857600)}).`
          }
        };
      }
      if (!(await UFm())) {
        return {
          success: false,
          error: {
            reason: "unavailable",
            message: "pdftoppm is not installed. Install poppler-utils (e.g. `brew install poppler` or `apt-get install poppler-utils`) to enable PDF page rendering."
          }
        };
      }
      let i = ZFl.randomUUID();
      let a = F2o.join(Yde(), `pdf-${i}`);
      await xFe.mkdir(a, {
        recursive: true
      });
      let l = F2o.join(a, "page");
      let c = ["-jpeg", "-r", "100"];
      if (t?.firstPage) {
        c.push("-f", String(t.firstPage));
      }
      if (t?.lastPage && t.lastPage !== 1 / 0) {
        c.push("-l", String(t.lastPage));
      }
      c.push(e, l);
      let {
        code: u,
        stderr: d
      } = await execFileNoThrow("pdftoppm", c, {
        timeout: 120000,
        useCwd: false
      });
      if (u !== 0) {
        if (/password/i.test(d)) {
          return {
            success: false,
            error: {
              reason: "password_protected",
              message: "PDF is password-protected. Please provide an unprotected version."
            }
          };
        }
        let g = /Wrong page range given.*last page \((\d+)\)/i.exec(d);
        if (g && Number(g[1]) >= 1) {
          let S = Number(g[1]);
          let E = Math.min(S, 20);
          return {
            success: false,
            error: {
              reason: "page_out_of_range",
              message: `Requested ${LFm(t)} is outside the document (PDF has ${S} ${un(S, "page")}). Use a range within 1-${S}, maximum ${20} pages per request (e.g. pages: "1-${E}").`
            }
          };
        }
        let y = /Syntax Error(?: \(\d+\))?: Couldn't (?:find trailer dictionary|read xref table)/i;
        if (/damaged|corrupt|invalid/i.test(d) || y.test(d)) {
          return {
            success: false,
            error: {
              reason: "corrupted",
              message: "PDF file is corrupted or invalid."
            }
          };
        }
        let _ = d.split(`
`);
        let b = _[0] ?? "";
        if ((b.startsWith("I/O Error: ") && b.includes(`'${e}'`) || b.startsWith("Permission Error: ")) && !_.some(S => /^(Command Line Error|Internal Error)(?: \(\d+\))?: /.test(S))) {
          return {
            success: false,
            error: {
              reason: "pdftoppm_input_error",
              message: `Could not render PDF: ${b}`
            }
          };
        }
        return {
          success: false,
          error: {
            reason: "unknown",
            message: `pdftoppm failed: ${d}`
          }
        };
      }
      let m = (await xFe.readdir(a)).filter(g => g.endsWith(".jpg")).sort();
      if (m.length === 0) {
        return {
          success: false,
          error: {
            reason: "corrupted",
            message: "pdftoppm produced no output pages. The PDF may be invalid."
          }
        };
      }
      let h = m.length;
      return {
        success: true,
        data: {
          type: "parts",
          file: {
            filePath: e,
            originalSize: o,
            outputDir: a,
            count: h
          }
        }
      };
    } catch (n) {
      if (Io(n) && n.path === e) {
        throw n;
      }
      return {
        success: false,
        error: {
          reason: "unknown",
          message: he(n)
        }
      };
    }
  }
  var ZFl;
  var L2o;
  var xFe;
  var F2o;
  var N2o;
  var B2o = __lazy(() => {
    Ire();
    dt();
    ji();
    cs();
    Zn();
    zI();
    ZFl = require("crypto");
    L2o = require("fs");
    xFe = require("fs/promises");
    F2o = require("path");
  });
  function BFm(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function $2o(e) {
    if (typeof e === "number") {
      return Number.isFinite(e) ? e : undefined;
    }
    if (typeof e === "string" && /^[-+]?\d+$/.test(e.trim())) {
      return Number(e);
    }
    return;
  }
  function tUl(e) {
    if (!BFm(e)) {
      return null;
    }
    let t = {
      ...e
    };
    let n = [];
    if (Array.isArray(t.offset) && t.offset.length === 1) {
      t.offset = t.offset[0];
      n.push("offset_array");
    }
    if (Array.isArray(t.limit) && t.limit.length === 1) {
      t.limit = t.limit[0];
      n.push("limit_array");
    }
    let r = $2o(t.offset);
    if (r !== undefined && r < 0) {
      delete t.offset;
      n.push("offset_neg");
    }
    let o = $2o(t.limit);
    if (o !== undefined && o <= 0) {
      delete t.limit;
      n.push("limit_dropped");
    }
    if ("length" in t) {
      let s = $2o(t.length);
      if (!("limit" in t) && s !== undefined && s > 0) {
        t.limit = s;
      }
      delete t.length;
      n.push("length");
    }
    return n.length ? {
      input: t,
      shapeClass: n.join(",")
    } : null;
  }
  function zrr(e) {
    let t = `${getTaskOutputDir()}/`;
    let n = ".output";
    if (e.startsWith(t) && e.endsWith(".output")) {
      let r = e.slice(t.length, -7);
      if (r.length > 0 && r.length <= 20 && /^[a-zA-Z0-9_-]+$/.test(r)) {
        return r;
      }
    }
    return null;
  }
  function nUl({
    file_path: e,
    offset: t,
    limit: n,
    pages: r
  }, {
    verbose: o
  }) {
    if (!e) {
      return null;
    }
    if (zrr(e)) {
      return "";
    }
    let s = o ? e : Pd(e);
    if (r) {
      return rb.jsxs(rb.Fragment, {
        children: [rb.jsx(vM, {
          filePath: e,
          children: s
        }), ` \xB7 pages ${r}`]
      });
    }
    if (o && (t || n)) {
      let i = t ?? 1;
      let a = n ? `lines ${i}-${i + n - 1}` : `from line ${i}`;
      return rb.jsxs(rb.Fragment, {
        children: [rb.jsx(vM, {
          filePath: e,
          children: s
        }), ` \xB7 ${a}`]
      });
    }
    return rb.jsx(vM, {
      filePath: e,
      children: s
    });
  }
  function rUl({
    file_path: e
  }) {
    let t = e ? zrr(e) : null;
    if (!t) {
      return null;
    }
    return rb.jsxs(Text, {
      dimColor: true,
      children: [" ", t]
    });
  }
  function oUl(e) {
    switch (e.type) {
      case "image":
        {
          let {
            originalSize: t
          } = e.file;
          let n = formatFileSize(t);
          return rb.jsx(Vn, {
            height: 1,
            children: rb.jsxs(Text, {
              children: ["Read image (", n, ")"]
            })
          });
        }
      case "notebook":
        {
          let {
            cells: t
          } = e.file;
          if (!t || t.length < 1) {
            return rb.jsx(Text, {
              color: "error",
              children: "No cells found in notebook"
            });
          }
          return rb.jsx(Vn, {
            height: 1,
            children: rb.jsxs(Text, {
              children: ["Read ", rb.jsx(Text, {
                bold: true,
                children: t.length
              }), " cells"]
            })
          });
        }
      case "pdf":
        {
          let {
            originalSize: t
          } = e.file;
          let n = formatFileSize(t);
          return rb.jsx(Vn, {
            height: 1,
            children: rb.jsxs(Text, {
              children: ["Read PDF (", n, ")"]
            })
          });
        }
      case "parts":
        return rb.jsx(Vn, {
          height: 1,
          children: rb.jsxs(Text, {
            children: ["Read ", rb.jsx(Text, {
              bold: true,
              children: e.file.count
            }), " ", e.file.count === 1 ? "page" : "pages", " (", formatFileSize(e.file.originalSize), ")"]
          })
        });
      case "text":
        {
          let {
            numLines: t
          } = e.file;
          return rb.jsx(Vn, {
            height: 1,
            children: rb.jsxs(Text, {
              children: ["Read ", rb.jsx(Text, {
                bold: true,
                children: t
              }), " ", t === 1 ? "line" : "lines"]
            })
          });
        }
      case "file_unchanged":
        return rb.jsx(Vn, {
          height: 1,
          children: rb.jsx(Text, {
            dimColor: true,
            children: "Unchanged since last read"
          })
        });
    }
  }
  function sUl(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string") {
      if (e.includes("Note: your current working directory is")) {
        return rb.jsx(Vn, {
          children: rb.jsx(Text, {
            color: "error",
            children: "File not found"
          })
        });
      }
      if (Nl(e, "tool_use_error")) {
        return rb.jsx(Vn, {
          children: rb.jsx(Text, {
            color: "error",
            children: "Error reading file"
          })
        });
      }
    }
    return rb.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function iUl(e) {
    if (e?.file_path?.startsWith(getPlansDirectory())) {
      return "Reading Plan";
    }
    if (e?.file_path && zrr(e.file_path)) {
      return "Read agent output";
    }
    return "Read";
  }
  function H2o(e) {
    if (!e?.file_path) {
      return null;
    }
    let t = zrr(e.file_path);
    if (t) {
      return t;
    }
    return Pd(e.file_path);
  }
  var rb;
  var aUl = __lazy(() => {
    ro();
    KG();
    XTe();
    Wl();
    et();
    Zl();
    cs();
    xx();
    cE();
    rb = __toESM(ie(), 1);
  });
  function HFm(e) {
    if ($Fm.vZc(e)) {
      return true;
    }
    if (e.startsWith("/proc/") && (e.endsWith("/fd/0") || e.endsWith("/fd/1") || e.endsWith("/fd/2"))) {
      return true;
    }
    if (/^\/proc\/[^/]+\/(environ|cmdline|auxv|maps|mem|stat)$/.test(e)) {
      return true;
    }
    return false;
  }
  function qFm(e) {
    let t = O7e.basename(e);
    let n = /^(.+)([ \u202F])(AM|PM)(\.png)$/;
    let r = t.match(n);
    if (!r) {
      return;
    }
    let o = r[2];
    let s = o === " " ? jFm : " ";
    return e.replace(`${o}${r[3]}${r[4]}`, `${s}${r[3]}${r[4]}`);
  }
  function WFm(e) {
    let t = er();
    if (!e.startsWith(t)) {
      return null;
    }
    let n = e.split(Jrr.win32.sep).join(Jrr.posix.sep);
    if (n.includes("/projects/") && n.endsWith(".jsonl")) {
      return "session_transcript";
    }
    return null;
  }
  function zFm() {
    return h5e() ? A4i : "- Results are returned using cat -n format, with line numbers starting at 1";
  }
  function KFm(e) {
    return ugn({
      ...e,
      tabAwareSeparator: h5e()
    });
  }
  function JFm(e) {
    let t = dUl.get(e);
    if (t === undefined) {
      return "";
    }
    return Tda(t);
  }
  async function lUl(e, t, n) {
    let r = n ?? UTe().maxTokens;
    let o = Eda(e, t);
    if (!o || o <= r / 4) {
      return;
    }
    let i = (await QFl(e)) ?? o;
    if (i > r) {
      throw new $de(i, r);
    }
  }
  function Krr(e, t, n, r) {
    return {
      type: "image",
      file: {
        base64: e.toString("base64"),
        type: `image/${t}`,
        originalSize: n,
        dimensions: r
      }
    };
  }
  function j2o(e) {
    return e.reason === "unknown" ? Error(e.message) : new Po(e.message, `PDF extraction failed (${e.reason})`);
  }
  async function cUl(e, t, n, r, o, s, i, a, l, c, u, d) {
    if (r === "ipynb") {
      let P = await x6a(n);
      let F = De(P);
      let H = Buffer.byteLength(F);
      if (H > a) {
        let j = Pu() ? `Use ${"Bash"} with jq to read specific portions:
  cat "${e}" | jq '.cells[:20]' # First 20 cells
  cat "${e}" | jq '.cells[100:120]' # Cells 100-120
  cat "${e}" | jq '.cells | length' # Count total cells
  cat "${e}" | jq '.cells[] | select(.cell_type=="code") | .source' # All code sources` : `Use ${"PowerShell"} to read specific portions:
  Get-Content "${e}" | ConvertFrom-Json | Select-Object -ExpandProperty cells | Select-Object -First 20
  Get-Content "${e}" | ConvertFrom-Json | Select-Object -ExpandProperty cells | Select-Object -Skip 100 -First 20 # Cells 100-120
  (Get-Content "${e}" | ConvertFrom-Json).cells.Count # Count total cells
  Get-Content "${e}" | ConvertFrom-Json | Select-Object -ExpandProperty cells | Where-Object cell_type -eq code | Select-Object -ExpandProperty source`;
        throw Error(`Notebook content (${formatFileSize(H)}) exceeds maximum allowed size (${formatFileSize(a)}). ${j}`);
      }
      await lUl(F, r, l);
      let U = await zt().stat(n);
      c.set(t, {
        content: F,
        timestamp: Math.floor(U.mtimeMs),
        offset: o,
        limit: s
      });
      let N = u.nestedMemoryAttachmentTriggers;
      if (N && !N.includes(t)) {
        N.push(t);
      }
      let W = {
        type: "notebook",
        file: {
          filePath: e,
          cells: P
        }
      };
      Goe({
        operation: "read",
        tool: "FileReadTool",
        filePath: t,
        content: F
      });
      return {
        data: W
      };
    }
    let p = Yg(u.options.mainLoopModel);
    let m = false;
    if (r === "") {
      try {
        let P = zt();
        if ((await P.stat(n)).isFile()) {
          let F = await P.readFileBytes(n, 16);
          m = tX(F) !== null;
        }
      } catch {}
    }
    if (uUl.vZc(r) || m) {
      let P = await q2o(n, l, undefined, p);
      let F = u.nestedMemoryAttachmentTriggers;
      if (F && !F.includes(t)) {
        F.push(t);
      }
      Goe({
        operation: "read",
        tool: "FileReadTool",
        filePath: t,
        content: P.file.base64
      });
      let H = P.file.dimensions ? Jct(P.file.dimensions) : null;
      return {
        data: P,
        ...(H && {
          newMessages: [In({
            content: H,
            isMeta: true
          })]
        })
      };
    }
    if (ylt(r)) {
      if (i) {
        let j = tZr(i);
        let z = await U2o(n, j ?? undefined);
        if (!z.success) {
          throw j2o(z.error);
        }
        logEvent("tengu_pdf_page_extraction", {
          success: true,
          pageCount: z.data.file.count,
          fileSize: z.data.file.originalSize,
          hasPageRange: true
        });
        Goe({
          operation: "read",
          tool: "FileReadTool",
          filePath: t,
          content: `PDF pages ${i}`
        });
        let K = (await Yrr.readdir(z.data.file.outputDir)).filter(Q => Q.endsWith(".jpg")).sort();
        let J = await Promise.all(K.map(async Q => {
          let Z = O7e.join(z.data.file.outputDir, Q);
          let ne = await Yrr.readFile(Z);
          let {
            block: oe
          } = await f1({
            data: ne,
            mediaType: "jpeg",
            limits: p
          });
          return oe;
        }));
        return {
          data: z.data,
          ...(J.length > 0 && {
            newMessages: [In({
              content: J,
              isMeta: true
            })]
          })
        };
      }
      let P = await Vrr(n);
      if (P !== null && P > 10) {
        throw j2o({
          reason: "too_many_pages",
          message: `This PDF has ${P} pages, which is too many to read at once. Use the pages parameter to read specific page ranges (e.g., pages: "1-5"). Maximum ${20} pages per request.`
        });
      }
      let H = await zt().stat(n);
      if (!glt() || H.size > 3145728) {
        let j = await U2o(n);
        if (j.success) {
          logEvent("tengu_pdf_page_extraction", {
            success: true,
            pageCount: j.data.file.count,
            fileSize: j.data.file.originalSize
          });
        } else {
          logEvent("tengu_pdf_page_extraction", {
            success: false,
            available: j.error.reason !== "unavailable",
            fileSize: H.size
          });
        }
      }
      if (!glt()) {
        throw new Po(`Reading full PDFs is not supported with this model. Use a newer model (Sonnet 3.5 v2 or later), or use the pages parameter to read specific page ranges (e.g., pages: "1-5", maximum ${20} pages per request). Page extraction requires poppler-utils: install with \`brew install poppler\` on macOS or \`apt-get install poppler-utils\` on Debian/Ubuntu.`, "PDF unsupported on current model");
      }
      let N = await eUl(n);
      if (!N.success) {
        throw j2o(N.error);
      }
      let W = N.data;
      Goe({
        operation: "read",
        tool: "FileReadTool",
        filePath: t,
        content: W.file.base64
      });
      return {
        data: W,
        newMessages: [In({
          content: [{
            type: "document",
            source: {
              type: "base64",
              media_type: "application/pdf",
              data: W.file.base64
            }
          }],
          isMeta: true
        })]
      };
    }
    let f = o === 0 ? 0 : o - 1;
    let {
      content: h,
      lineCount: g,
      totalLines: y,
      totalBytes: _,
      readBytes: b,
      mtimeMs: S
    } = await MEt(n, f, s, s === undefined ? a : undefined, u.abortController.signal);
    let E = h;
    let C = g;
    let x = s;
    let A;
    let k = (o ?? 1) <= 1 && s === undefined && i === undefined;
    try {
      await lUl(h, r, l);
    } catch (P) {
      if (P instanceof $de && k) {
        let F = h.split(`
`);
        let H = Math.max(0.5, h.length / Math.max(1, P.tokenCount));
        let U = V => V.length / H;
        let N = Math.max(1, Math.min(F.length, Math.floor(F.length * l / Math.max(1, P.tokenCount) * 0.85)));
        let W = F.slice(0, N).join(`
`);
        for (let V = 0; V < 6; V++) {
          if (U(W) <= l || N <= 1) {
            break;
          }
          N = Math.max(1, Math.floor(N * 0.7));
          W = F.slice(0, N).join(`
`);
        }
        let j = false;
        if (U(W) > l || W.trim() === "") {
          let V = Math.max(1, Math.floor(l * H * 0.85));
          for (let J = 0; J < 6; J++) {
            if (W = h.slice(0, V), U(W) <= l) {
              break;
            }
            V = Math.max(1, Math.floor(V * 0.7));
          }
          let K = W.charCodeAt(W.length - 1);
          if (K >= 55296 && K <= 56319) {
            W = W.slice(0, -1);
          }
          j = true;
        }
        E = W;
        C = j ? Ru(W, `
`) + 1 : N;
        x = C;
        A = !j && C < y ? "[Truncated: PARTIAL view \u2014 " + `showing lines 1-${C} of ${y} total (${P.tokenCount} tokens, cap ${l}). Call ${"Read"} with offset=${C + 1} limit=${C} for the next page, or ${"Grep"} to find a specific section. Do NOT answer from this page alone if the answer may be further in the file.]` : "[Truncated: PARTIAL view \u2014 " + `showing the first ${W.length} of ${h.length} characters (${P.tokenCount} tokens, cap ${l}); this file has very long lines and cannot be paginated by line. Use ${"Grep"} to find a specific section, or ${"Read"} with offset/limit to page through it. Do NOT answer from this excerpt alone if the answer may be elsewhere in the file.]`;
      } else {
        throw P;
      }
    }
    c.set(t, {
      content: E,
      timestamp: Math.floor(S),
      offset: o,
      limit: x,
      ...(A !== undefined && {
        isPartialView: true
      })
    });