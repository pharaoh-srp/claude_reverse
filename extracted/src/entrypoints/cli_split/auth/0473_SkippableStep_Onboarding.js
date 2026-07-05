  __export(m3c, {
    SkippableStep: () => SkippableStep,
    Onboarding: () => Onboarding
  });
  function Onboarding({
    onDone: e
  }) {
    let [t, n] = Dee.useState(0);
    let [r, o] = Dee.useState(false);
    let [s] = Dee.useState(() => isAnthropicAuthEnabled());
    let [i, a] = useTheme();
    Dee.useEffect(() => {
      logEvent("tengu_began_setup", {
        oauthEnabled: s
      });
    }, [s]);
    function l() {
      if (t < g.length - 1) {
        let S = t + 1;
        n(S);
        logEvent("tengu_onboarding_step", {
          oauthEnabled: s,
          stepId: g[S]?.id == null ? undefined : g[S]?.id
        });
        Pe("onboarding_step_complete");
      } else {
        Pe("onboarding_complete");
        e();
      }
    }
    function c(S) {
      a(S);
      l();
    }
    let u = Eg();
    let d = Df.jsx(gXd, {
      marginX: 1,
      children: Df.jsx(xvt, {
        onThemeSelect: c,
        showIntroText: true,
        helpText: "To change this later, run /theme",
        hideEscToCancel: true,
        skipExitHandling: true
      })
    });
    let p = Df.jsxs(gXd, {
      flexDirection: "column",
      gap: 1,
      paddingLeft: 1,
      children: [Df.jsx(Text, {
        bold: true,
        children: "Security notes:"
      }), Df.jsx(gXd, {
        flexDirection: "column",
        width: 70,
        children: Df.jsxs(c3c, {
          children: [Df.jsxs(c3c.Item, {
            children: [Df.jsx(Text, {
              children: "Claude can make mistakes."
            }), Df.jsxs(Text, {
              dimColor: true,
              wrap: "wrap",
              children: ["You're responsible for Claude's actions and should always", Df.jsx(Newline, {}), "review them, especially when running code.", Df.jsx(Newline, {})]
            })]
          }), Df.jsxs(c3c.Item, {
            children: [Df.jsx(Text, {
              children: "Due to prompt injection risks, only use it with code you trust"
            }), Df.jsx(eD, {
              url: "https://code.claude.com/docs/en/security"
            })]
          })]
        })
      }), Df.jsx(r3c, {})]
    });
    let m = Df.jsx(Qqc, {
      onSuccess: l
    });
    let f = Dee.useMemo(() => {
      if (!process.env.ANTHROPIC_API_KEY || cC()) {
        return "";
      }
      let S = a2(process.env.ANTHROPIC_API_KEY);
      if (getCustomApiKeyStatus(S) === "new") {
        return S;
      }
    }, []);
    function h(S) {
      if (S) {
        o(true);
      }
      l();
    }
    let g = [];
    if (s) {
      g.push({
        id: "preflight",
        component: m
      });
    }
    if (g.push({
      id: "theme",
      component: d
    }), f) {
      g.push({
        id: "api-key",
        component: Df.jsx(ApproveApiKey, {
          customApiKeyTruncated: f,
          onDone: h
        })
      });
    }
    if (s) {
      g.push({
        id: "oauth",
        component: Df.jsx(SkippableStep, {
          skip: r,
          onSkip: l,
          children: Df.jsx(gXd, {
            flexDirection: "column",
            gap: 1,
            paddingLeft: 1,
            children: Df.jsx(ConsoleOAuthFlow, {
              onDone: l,
              urlOutdent: 1
            })
          })
        })
      });
    }
    if (g.push({
      id: "security",
      component: p
    }), shouldOfferTerminalSetup()) {
      g.push({
        id: "terminal-setup",
        component: Df.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          paddingLeft: 1,
          children: [Df.jsx(Text, {
            bold: true,
            children: "Use Claude Code's terminal setup?"
          }), Df.jsxs(gXd, {
            flexDirection: "column",
            width: 70,
            gap: 1,
            children: [Df.jsxs(Text, {
              children: ["For the optimal coding experience, enable the recommended settings", Df.jsx(Newline, {}), "for your terminal:", " ", Me.terminal === "Apple_Terminal" ? "Option+Enter for newlines and visual bell" : "Shift+Enter for newlines"]
            }), Df.jsx(mc, {
              confirmLabel: "Yes, use recommended settings",
              cancelLabel: "No, maybe later with /terminal-setup",
              onConfirm: () => void setupTerminal(i).then(() => Pe("onboarding_terminal_setup")).catch(() => Ae("onboarding_terminal_setup", "onboarding_terminal_setup_failed")).finally(l),
              onCancel: l
            }), Df.jsx(Text, {
              dimColor: true,
              children: u.pending ? Df.jsxs(Df.Fragment, {
                children: ["Press ", u.keyName, " again to exit"]
              }) : Df.jsxs(Hn, {
                children: [Df.jsx(xt, {
                  chord: "enter",
                  action: "confirm"
                }), Df.jsx(xt, {
                  chord: "escape",
                  action: "skip"
                })]
              })
            })]
          })]
        })
      });
    }
    let y = g[t];
    let _ = Dee.useCallback(() => {
      if (t === g.length - 1) {
        e();
      } else {
        l();
      }
    }, [t, e, l]);
    let b = Dee.useCallback(() => {
      l();
    }, [l]);
    jo({
      "confirm:yes": _
    }, {
      context: "Confirmation",
      isActive: y?.id === "security"
    });
    jo({
      "confirm:no": b
    }, {
      context: "Confirmation",
      isActive: y?.id === "terminal-setup"
    });
    return Df.jsxs(gXd, {
      flexDirection: "column",
      children: [Df.jsx(ABe, {}), Df.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [y?.component, u.pending && Df.jsx(gXd, {
          padding: 1,
          children: Df.jsxs(Text, {
            dimColor: true,
            children: ["Press ", u.keyName, " again to exit"]
          })
        })]
      })]
    });
  }
  function SkippableStep(e) {
    let t = d3c.c(4);
    let {
      skip: n,
      onSkip: r,
      children: o
    } = e;
    let s;
    let i;
    if (t[0] !== r || t[1] !== n) {
      s = () => {
        if (n) {
          r();
        }
      };
      i = [n, r];
      t[0] = r;
      t[1] = n;
      t[2] = s;
      t[3] = i;
    } else {
      s = t[2];
      i = t[3];
    }
    if (Dee.useEffect(s, i), n) {
      return null;
    }
    return o;
  }
  var d3c;
  var Dee;
  var Df;
  var f3c = __lazy(() => {
    Ot();
    zPe();
    mO();
    et();
    Bs();
    ln();
    no();
    Lot();
    pr();
    gn();
    Zqc();
    kts();
    bKt();
    Ai();
    b_();
    die();
    bs();
    znn();
    o3c();
    Msr();
    d3c = __toESM(pt(), 1);
    Dee = __toESM(ot(), 1);
    Df = __toESM(ie(), 1);
  });
  function h3c(e) {
    if (e === null) {
      return false;
    }
    if (e.statusLine) {
      return true;
    }
    if (e.fileSuggestion) {
      return true;
    }
    if (e.subagentStatusLine) {
      return true;
    }
    if (!e.hooks) {
      return false;
    }
    for (let t of Object.values(e.hooks)) {
      if (t.length > 0) {
        return true;
      }
    }
    return false;
  }
  function k3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (h3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (h3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function g3c(e) {
    return e.some(t => t.ruleBehavior === "allow" && (t.ruleValue.toolName === "Bash" || t.ruleValue.toolName.startsWith("Bash" + "(")));
  }
  function A3c(e) {
    let t = Li(e).replace(F$f, "").trim();
    return t.length > 60 ? `${t.slice(0, 60)}\u2026` : t;
  }
  function _3c(e) {
    let {
      toolName: t,
      ruleContent: n
    } = e.ruleValue;
    let r = U$f.vZc(t) || t.startsWith("mcp__");
    let o = n === undefined;
    if (r) {
      return o ? 0 : 1;
    }
    return o ? 2 : 3;
  }
  function I3c() {
    let e = [];
    let t = [];
    for (let [s, i] of x3c()) {
      let a = Fmt(s).filter(l => l.ruleBehavior === "allow");
      if (a.length > 0) {
        e.push(i);
        t.push(...a);
      }
    }
    let n = t.length;
    t.sort((s, i) => _3c(s) - _3c(i));
    let r = new Set();
    let o = [];
    for (let s of t) {
      let i = A3c(jp(s.ruleValue));
      if (i.length > 0 && !r.vZc(i)) {
        r.add(i);
        o.push(i);
      }
    }
    return {
      rules: o,
      sources: e,
      rawCount: n
    };
  }
  function b3c(e) {
    if (R3c.isAbsolute(e) || e.startsWith("~")) {
      return 0;
    }
    if (e.includes("..")) {
      return 1;
    }
    return 2;
  }
  function P3c() {
    let e = [];
    let t = [];
    for (let [s, i] of x3c()) {
      let a = getSettingsForSource(s)?.permissions?.additionalDirectories ?? [];
      if (a.length > 0) {
        e.push(i);
        t.push(...a);
      }
    }
    let n = t.length;
    let r = new Set();
    let o = [];
    for (let s of t) {
      let i = A3c(s);
      if (i.length > 0 && !r.vZc(i)) {
        r.add(i);
        o.push(i);
      }
    }
    o.sort((s, i) => b3c(s) - b3c(i));
    return {
      dirs: o,
      sources: e,
      rawCount: n
    };
  }
  function O3c() {
    let e = [];
    let t = Fmt("projectSettings");
    if (g3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = Fmt("localSettings");
    if (g3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function csn(e, t) {
    if (e.length === 0) {
      return "";
    }
    let n = t === 0 ? undefined : t;
    if (!n || e.length <= n) {
      if (e.length === 1) {
        return e[0];
      }
      if (e.length === 2) {
        return `${e[0]} and ${e[1]}`;
      }
      let s = e.at(-1);
      return `${e.slice(0, -1).join(", ")}, and ${s}`;
    }
    let r = e.slice(0, n);
    let o = e.length - n;
    if (r.length === 1) {
      return `${r[0]} and ${o} more`;
    }
    return `${r.join(", ")}, and ${o} more`;
  }
  function S3c(e) {
    return !!e?.otelHeadersHelper;
  }
  function D3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (S3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (S3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function M3c() {
    let e = [];
    if (getSettingsForSource("projectSettings")?.autoMemoryDirectory !== undefined) {
      e.push(".claude/settings.json");
    }
    if (getSettingsForSource("localSettings")?.autoMemoryDirectory !== undefined) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function T3c(e) {
    return !!e?.apiKeyHelper;
  }
  function N3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (T3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (T3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function E3c(e) {
    return !!(e?.awsAuthRefresh || e?.awsCredentialExport);
  }
  function L3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (E3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (E3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function v3c(e) {
    return !!e?.gcpAuthRefresh;
  }
  function F3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (v3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (v3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function w3c(e) {
    return !!e?.proxyAuthHelper;
  }
  function U3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (w3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (w3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  function C3c(e) {
    if (!e?.env) {
      return false;
    }
    return Object.keys(e.env).some(t => !Int.vZc(t.toUpperCase()));
  }
  function B3c() {
    let e = [];
    let t = getSettingsForSource("projectSettings");
    if (C3c(t)) {
      e.push(".claude/settings.json");
    }
    let n = getSettingsForSource("localSettings");
    if (C3c(n)) {
      e.push(".claude/settings.local.json");
    }
    return e;
  }
  var R3c;
  var x3c = () => [["projectSettings", ".claude/settings.json"], ...(isLocalSettingsGitTracked() ? [["localSettings", ".claude/settings.local.json"]] : [])];
  var F$f;
  var U$f;
  var $3c = __lazy(() => {
    lW();
    EC();
    R3c = require("path");
    F$f = /[\x00-\x1f\x7f-\x9f]/g;
    U$f = new Set(["Bash", "PowerShell", "Write", "Edit", "MultiEdit", "NotebookEdit", "WebFetch", "WebSearch"]);
  });
  var j3c = {};