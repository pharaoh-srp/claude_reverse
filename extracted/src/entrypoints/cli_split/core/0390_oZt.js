  }
  function oZt(e, t) {
    if (e.config.type === "claudeai-proxy") {
      return t(e.name);
    }
    return e.config.type !== "sse-ide" && e.config.type !== "ws-ide";
  }
  function aGl(e, t) {
    return Bn(e, n => n.type === "needs-auth" && oZt(n, t));
  }
  function lGl(e, t) {
    let n = [];
    for (let r of e) {
      if (r.type !== "failed" && r.type !== "needs-auth") {
        continue;
      }
      if (oZt(r, t)) {
        n.push(r);
      }
    }
    return n;
  }
  var pK = __lazy(() => {
    je();
    Zn();
  });
  function Yir() {
    let e = cGl.c(5);
    let t = Lo();
    let [n, r] = Kir.useState(FGm);
    let o;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = () => {
        let {
          errors: l
        } = N1e();
        r(l);
      };
      e[0] = o;
    } else {
      o = e[0];
    }
    Agt(o);
    let i;
    let a;
    if (e[1] !== n || e[2] !== t) {
      i = () => {
        if (va()) {
          return;
        }
        tD("settings", n.length);
        t(l => {
          if (l.setupIssues.settingsErrorCount === n.length) {
            return l;
          }
          return {
            ...l,
            setupIssues: {
              ...l.setupIssues,
              settingsErrorCount: n.length
            }
          };
        });
      };
      a = [n, t];
      e[1] = n;
      e[2] = t;
      e[3] = i;
      e[4] = a;
    } else {
      i = e[3];
      a = e[4];
    }
    Kir.useEffect(i, a);
    return n;
  }
  function FGm() {
    let {
      errors: e
    } = N1e();
    return e;
  }
  var cGl;
  var Kir;
  var Zqo = __lazy(() => {
    ru();
    ho();
    W_t();
    pK();
    F5n();
    cGl = __toESM(pt(), 1);
    Kir = __toESM(ot(), 1);
  });
  function UGm(e) {
    return e === "projectSettings" || e === "policySettings" || e === "command";
  }
  function Jir(e) {
    return permissionRuleSourceDisplayString(e);
  }
  function uGl(e, t, n) {
    let r = Jir(t.source);
    let o = Jir(n.source);
    let s = t.ruleValue.toolName;
    if (e === "deny") {
      return `Remove the "${s}" deny rule from ${r}, or remove the specific allow rule from ${o}`;
    }
    return `Remove the "${s}" ask rule from ${r}, or remove the specific allow rule from ${o}`;
  }
  function BGm(e, t, n) {
    let {
      toolName: r,
      ruleContent: o
    } = e.ruleValue;
    if (o === undefined) {
      return {
        shadowed: false
      };
    }
    let s = t.find(i => i.ruleValue.toolName === r && i.ruleValue.ruleContent === undefined);
    if (!s) {
      return {
        shadowed: false
      };
    }
    if (r === "Bash" && n.sandboxAutoAllowEnabled) {
      if (!UGm(s.source)) {
        return {
          shadowed: false
        };
      }
    }
    return {
      shadowed: true,
      shadowedBy: s,
      shadowType: "ask"
    };
  }
  function $Gm(e, t) {
    let {
      toolName: n,
      ruleContent: r
    } = e.ruleValue;
    if (r === undefined) {
      return {
        shadowed: false
      };
    }
    let o = t.find(s => s.ruleValue.toolName === n && s.ruleValue.ruleContent === undefined);
    if (!o) {
      return {
        shadowed: false
      };
    }
    return {
      shadowed: true,
      shadowedBy: o,
      shadowType: "deny"
    };
  }
  function Xir(e, t) {
    let n = [];
    let r = getAllowRules(e);
    let o = getAskRules(e);
    let s = getDenyRules(e);
    for (let i of r) {
      let a = $Gm(i, s);
      if (a.shadowed) {
        let c = Jir(a.shadowedBy.source);
        n.push({
          rule: i,
          reason: `Blocked by "${a.shadowedBy.ruleValue.toolName}" deny rule (from ${c})`,
          shadowedBy: a.shadowedBy,
          shadowType: "deny",
          fix: uGl("deny", a.shadowedBy, i)
        });
        continue;
      }
      let l = BGm(i, o, t);
      if (l.shadowed) {
        let c = Jir(l.shadowedBy.source);
        n.push({
          rule: i,
          reason: `Shadowed by "${l.shadowedBy.ruleValue.toolName}" ask rule (from ${c})`,
          shadowedBy: l.shadowedBy,
          shadowType: "ask",
          fix: uGl("ask", l.shadowedBy, i)
        });
      }
    }
    return n;
  }
  var e3o = __lazy(() => {
    oy();
  });
  function Qir() {
    if (getMainLoopModelOverride() !== undefined) {
      return false;
    }
    let e = getGlobalConfig();
    let t = [e.sonnet45To46MigrationTimestamp, e.legacyOpusMigrationTimestamp, e.opusProMigrationTimestamp];
    let n = Date.now() - process.uptime() * 1000;
    return t.some(r => r !== undefined && r >= n - 3000);
  }
  function sZt(e) {
    if (!e) {
      return 0;
    }
    return e.activeAgents.filter(t => t.source !== "built-in").reduce((t, n) => {
      let r = `${n.agentType}: ${n.whenToUse}`;
      return t + xm(r);
    }, 0);
  }
  var Zir = __lazy(() => {
    at();
    aU();
  });
  async function HGm() {
    if (Qce()) {
      return null;
    }
    let e = getLargeMemoryFiles(await getMemoryFiles());
    if (e.length === 0) {
      return null;
    }
    let t = getMaxMemoryCharacterCount();
    let n = e.sort((o, s) => s.content.length - o.content.length).map(o => `${o.path}: ${o.content.length.toLocaleString()} chars`);
    return {
      type: "claudemd_files",
      severity: "warning",
      message: e.length === 1 ? `Large CLAUDE.md file detected (${e[0].content.length.toLocaleString()} chars > ${t.toLocaleString()})` : `${e.length} large CLAUDE.md files detected (each > ${t.toLocaleString()} chars)`,
      details: n,
      currentValue: e.length,
      threshold: t
    };
  }
  async function jGm(e) {
    if (!e) {
      return null;
    }
    let t = sZt(e);
    if (t <= 15000) {
      return null;
    }
    let n = e.activeAgents.filter(o => o.source !== "built-in").map(o => {
      let s = `${o.agentType}: ${o.whenToUse}`;
      return {
        name: o.agentType,
        tokens: xm(s)
      };
    }).sort((o, s) => s.tokens - o.tokens);
    let r = n.slice(0, 5).map(o => `${o.name}: ~${o.tokens.toLocaleString()} tokens`);
    if (n.length > 5) {
      r.push(`(${n.length - 5} more custom agents)`);
    }
    return {
      type: "agent_descriptions",
      severity: "warning",
      message: `Large agent descriptions (~${t.toLocaleString()} tokens > ${(15000).toLocaleString()})`,
      details: r,
      currentValue: t,
      threshold: 15000
    };
  }
  async function qGm(e) {
    let t = await e();
    let n = SandboxManager.isSandboxingEnabled() && SandboxManager.isAutoAllowBashIfSandboxedEnabled();
    let r = Xir(t, {
      sandboxAutoAllowEnabled: n
    });
    if (r.length === 0) {
      return null;
    }
    let o = r.flatMap(s => [`${jp(s.rule.ruleValue)}: ${s.reason}`, `  Fix: ${s.fix}`]);
    return {
      type: "unreachable_rules",
      severity: "warning",
      message: `${r.length} ${un(r.length, "unreachable permission rule")} detected`,
      details: o,
      currentValue: r.length,
      threshold: 0
    };
  }
  async function dGl(e, t) {
    let [n, r, o] = await Promise.all([HGm(), jGm(e), qGm(t)]);
    return {
      claudeMdWarning: n,
      agentWarning: r,
      unreachableRulesWarning: o
    };
  }
  var pGl = __lazy(() => {
    aU();
    bx();
    wb();
    EC();
    e3o();
    Th();
    Zir();
    Zn();
  });
  var n3o = {};