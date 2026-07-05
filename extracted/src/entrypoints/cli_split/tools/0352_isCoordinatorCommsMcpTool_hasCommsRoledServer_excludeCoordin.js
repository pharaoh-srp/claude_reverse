  __export(Qhl, {
    isCoordinatorCommsMcpTool: () => isCoordinatorCommsMcpTool,
    hasCommsRoledServer: () => hasCommsRoledServer,
    excludeCoordinatorCommsMcpTools: () => excludeCoordinatorCommsMcpTools
  });
  function hasCommsRoledServer(e) {
    return e.some(t => "role" in t.config && t.config.role === "comms");
  }
  function isCoordinatorCommsMcpTool(e) {
    return e.mcpInfo?.role === "comms";
  }
  function excludeCoordinatorCommsMcpTools(e) {
    if (eR()) {
      return e.filter(t => !isCoordinatorCommsMcpTool(t));
    }
    return e;
  }
  var Ubt = __lazy(() => {
    RV();
  });
  function g_m() {
    return "inherit";
  }
  function vse(e, t, n, r, o) {
    let s = () => getRuntimeMainLoopModel({
      permissionMode: r ?? "default",
      mainLoopModel: t,
      exceeds200kTokens: false
    });
    let i = (p, m = p) => {
      y_m(p);
      let f = s();
      if (ca(parseUserSpecifiedModel(m)).toLowerCase() !== ca(parseUserSpecifiedModel(f)).toLowerCase()) {
        o?.(p, f);
      }
      return f;
    };
    let a = process.env.CLAUDE_CODE_SUBAGENT_MODEL;
    if (a && a !== "inherit") {
      let p = parseUserSpecifiedModel(a);
      if (!isModelAllowed(p)) {
        return i(a);
      }
      return p;
    }
    let l = own(t);
    let c = (p, m) => {
      if (l && getProviderForModel(p) === "bedrock") {
        if (own(m)) {
          return p;
        }
        return ZAe(p, l);
      }
      return p;
    };
    if (n) {
      if (n === "inherit") {
        return s();
      }
      if (egl(n, t)) {
        return t;
      }
      let p = c(Zhl(parseUserSpecifiedModel(n)), n);
      if (!isModelAllowed(p)) {
        return i(n, p);
      }
      return p;
    }
    let u = e ?? g_m();
    if (u === "inherit") {
      return s();
    }
    if (egl(u, t)) {
      return t;
    }
    let d = c(Zhl(parseUserSpecifiedModel(u)), u);
    if (!isModelAllowed(d)) {
      return i(u, d);
    }
    return d;
  }
  function y_m(e) {
    logForDebugging(`Subagent model "${e}" is not in the availableModels allowlist; inheriting the parent model instead`, {
      level: "warn"
    });
  }
  function Zhl(e) {
    let n = getCanonicalName(e).includes("opus") && d8(e);
    if (isOpus1mMergeEnabled() && !hg(e) && n) {
      return e + "[1m]";
    }
    return e;
  }
  function egl(e, t) {
    let n = getCanonicalName(t);
    switch (e.toLowerCase()) {
      case "fable":
        return n.includes("fable");
      case "opus":
        return n.includes("opus");
      case "sonnet":
        return n.includes("sonnet");
      case "haiku":
        return n.includes("haiku");
      default:
        return false;
    }
  }
  var Sbb;
  var Bbt = __lazy(() => {
    VT();
    je();
    Zn();
    Tk();
    Hle();
    Eo();
    YN();
    Ds();
    Sbb = [...u_e, "inherit"];
  });
  function $bt(e) {
    let t = e.replace(/[^A-Za-z0-9._:/@[\]-]/g, "");
    if (t.length === 0) {
      return "(unrecognized model name)";
    }
    return t.length > 128 ? `${t.slice(0, 128)}\u2026` : t;
  }
  function wse(e, t) {
    return `Model "${$bt(e)}" is restricted by your organization's settings. Using ${$bt(t)} instead.`;
  }
  function J9({
    mainThreadAgentDefinition: e,
    toolUseContext: t,
    customSystemPrompt: n,
    defaultSystemPrompt: r,
    appendSystemPrompt: o,
    overrideSystemPrompt: s
  }) {
    if (s) {
      return [s];
    }
    if (eR() && !e) {
      N1();
      let {
        getCoordinatorSystemPrompt: a
      } = __toCommonJS(DG);
      Ubt();
      let {
        hasCommsRoledServer: l
      } = __toCommonJS(Qhl);
      return [a(l(t.options.mcpClients)), ...(o ? [o] : [])];
    }
    let i = e ? isBuiltInAgent(e) ? e.getSystemPrompt({
      toolUseContext: {
        options: t.options
      }
    }) : e.getSystemPrompt() : undefined;
    if (e?.memory) {
      logEvent("tengu_agent_memory_loaded", {
        ...false,
        scope: e.memory,
        source: "main-thread"
      });
    }
    if (i && e?.appendSystemPrompt) {
      return [...(typeof n === "string" ? [n] : Array.isArray(n) ? n : r), i, ...(o ? [o] : [])];
    }
    return [...(i ? [i] : typeof n === "string" ? [n] : Array.isArray(n) ? n : r), ...(o ? [o] : [])];
  }
  var Nze = __lazy(() => {
    RV();
    Ot();
    kS();
  });
  var dXn;
  var pOo = __lazy(() => {
    dXn = {
      kind: "it2_setup",
      payload: we(() => v.object({
        tmuxAvailable: v.boolean()
      })),
      result: we(() => v.enum(["installed", "use-tmux", "cancelled"])),
      default: "cancelled"
    };
  });
  function Uz(e, t) {
    let n;
    for (let r of Object.values(t)) {
      if (RS(r) && r.identity.agentId === e) {
        if (r.status === "running") {
          return r;
        }
        if (!n) {
          n = r;
        }
      }
    }
    return n;
  }
  function mOo(e, t) {
    let n = Uz(e, t);
    if (n) {
      return {
        status: "found",
        task: n
      };
    }
    let r = new Map();
    for (let a of Object.values(t)) {
      if (!RS(a) || a.identity.agentName !== e) {
        continue;
      }
      let l = r.get(a.identity.agentId);
      if (!l || l.status !== "running" && a.status === "running") {
        r.set(a.identity.agentId, a);
      }
    }
    let o = [...r.values()];
    let s = o.filter(a => a.status === "running");
    let i = s.length > 0 ? s : o;
    if (i.length === 1) {
      return {
        status: "found",
        task: i[0]
      };
    }
    if (i.length > 1) {
      return {
        status: "ambiguous",
        candidates: i.map(a => a.identity.agentId)
      };
    }
    return {
      status: "not_found"
    };
  }
  function fOo(e) {
    return NKt(e).filter(t => t.status === "running").map(t => t.identity.agentId);
  }
  function NKt(e) {
    return Object.values(e).filter(RS);
  }
  var pXn = () => {};
  function ngl(e) {
    tgl.set(e.type, e);
  }
  function rgl() {
    return [...tgl.values()];
  }
  var tgl;
  var hOo = __lazy(() => {
    tgl = new Map();
  });
  function sgl(e) {
    return ogl.test(e);
  }
  function Hbt(e) {
    let t = ogl.exec(e);
    if (t) {
      let n = t[0].codePointAt(0);
      throw new nH(`Refusing to send command containing control character U+${n.toString(16).padStart(4, "0").toUpperCase()} to terminal pane`);
    }
  }
  function LKt(e) {
    return e === "tmux" || e === "iterm2";
  }
  var nH;
  var ogl;
  var FKt = __lazy(() => {
    nH = class nH extends Error {
      constructor(e) {
        super(e);
        this.name = "SwarmPaneError";
      }
    };
    ogl = /\p{Cc}/u;
  });
  var lgl = {};