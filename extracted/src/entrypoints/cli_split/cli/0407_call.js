  __export(qQl, {
    call: () => call_export46
  });
  function RQm(e) {
    return e.map(t => t.type === "text" ? t.text : "").filter(Boolean).join(`
`);
  }
  async function xQm(e, t, n, r, o, s) {
    let i = await launchRemoteReview(e, t, r, {
      applyFixesOnComplete: o
    });
    if (s?.aborted) {
      return;
    }
    if (i) {
      n(RQm(i.blocks), {
        shouldQuery: true,
        metaMessages: i.launched ? [`The output above is already visible to the user. Briefly acknowledge it without repeating the target, URL, or billing note. Findings will arrive via task-notification.${o ? " The user passed --fix: when the findings arrive, apply them to the local working tree." : ""}`] : undefined
      });
    } else {
      n("Ultrareview failed to launch the cloud session. Check that this is a GitHub repo and try again.", {
        display: "system"
      });
    }
  }
  var WQl;
  var call_export46 = async (e, t, n) => {
    let r = policyDeniedReason("allow_remote_sessions", "Cloud sessions", "are");
    if (r) {
      e(r, {
        display: "system"
      });
      return null;
    }
    let {
      scopeArgs: o,
      applyFixes: s
    } = parseUltrareviewArgs(n);
    let i = await precheckLaunchScope(o);
    if (!i.ok) {
      e(i.error, {
        display: "system"
      });
      return null;
    }
    let a = i.scope;
    let l = await checkOverageGate();
    switch (l.kind) {
      case "blocked":
        {
          logEvent("tengu_review_overage_blocked", {
            reason: l.reason
          });
          let c = l.actionUrl ? `
  \u2192 ${l.actionUrl}` : "";
          let u = l.actionUrl?.includes("/admin-settings/") && $St() && !av() ? `
  Run /usage-credits to request this from your admin.` : "";
          e(`${l.message}${c}${u}`, {
            display: "system"
          });
          return null;
        }
      case "needs-confirm":
      case "proceed":
        if (l.kind === "needs-confirm") {
          logEvent("tengu_review_overage_dialog_shown", {});
        }
        return WQl.jsx(HQl, {
          subtitle: l.kind === "needs-confirm" ? getReviewDurationNote() : l.billingNote || null,
          body: l.kind === "needs-confirm" ? l.body : undefined,
          scope: a,
          onProceed: async c => {
            if (await xQm(a, t, e, l.billingNote, s, c), !c.aborted && l.kind === "needs-confirm") {
              confirmOverage();
            }
          },
          onCancel: () => e("Ultrareview cancelled.", {
            display: "system"
          })
        });
    }
  };
  var GQl = __lazy(() => {
    Ot();
    Kc();
    vF();
    HSt();
    Jwt();
    jQl();
    WQl = __toESM(ie(), 1);
  });
  var PQm = (e, t) => `Review target: GitHub pull request \`${e}\`.

Gather this target's diff with (instead of any local \`git diff\`):
1. \`gh pr view ${e} --json title,body,author,baseRefName,headRefName,state,additions,deletions,changedFiles,labels\` for context
2. \`gh pr diff ${e}\` for the unified diff

The PR's diff is the only review scope \u2014 local working-tree changes are out of scope. When an angle needs surrounding code, Read the files in this checkout if it matches the PR's branch, otherwise fetch file contents via \`gh\`.
${t ? `
Additional instructions from the user: ${t}
` : ""}
${Gnr(Wnr)}
## Present the review

After the final phase, do not reply with the raw JSON findings array. Present a readable review: a 2-3 sentence overview of what the PR does, then the surviving findings most-severe first as \`file:line \u2014 summary (failure scenario)\`, or a note that nothing survived verification.`;
  var OQm;
  var VQl;
  var YQl = {};
  __export(YQl, {
    call: () => call_export47
  });
  function DQm(e) {
    let t = zQl.c(15);
    let {
      onDone: n
    } = e;
    let r = bt(FQm);
    let [o, s] = Ocr.useState("");
    let i;
    let a;
    if (t[0] !== r) {
      i = () => {
        if (!r) {
          return;
        }
        let u = r;
        (async function () {
          let m = await KQl.toString(u, {
            type: "utf8",
            errorCorrectionLevel: "L",
            margin: 0
          });
          s(m);
        })().catch(LQm);
      };
      a = [r];
      t[0] = r;
      t[1] = i;
      t[2] = a;
    } else {
      i = t[1];
      a = t[2];
    }
    Ocr.useEffect(i, a);
    let l;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      l = {
        context: "Confirmation"
      };
      t[3] = l;
    } else {
      l = t[3];
    }
    if (uo("confirm:no", n, l), !r) {
      let u;
      let d;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        u = q0.jsx(gXd, {
          marginBottom: 1,
          children: q0.jsx(Text, {
            bold: true,
            children: "Cloud session"
          })
        });
        d = va() ? q0.jsx(Text, {
          children: LD("fanout") ? "This session's browser link isn't available from this view." : "This session is connected directly and has no browser link \u2014 only sessions started with `claude --cloud` can be opened in the browser."
        }) : q0.jsx(Text, {
          color: "warning",
          children: "Not in remote mode. Start with `claude --cloud` to use this command."
        });
        t[4] = u;
        t[5] = d;
      } else {
        u = t[4];
        d = t[5];
      }
      let p;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        p = q0.jsxs(Td, {
          children: [u, d, q0.jsx(gXd, {
            marginTop: 1,
            children: q0.jsx(Lw, {
              children: q0.jsx(xt, {
                chord: "escape",
                action: "close"
              })
            })
          })]
        });
        t[6] = p;
      } else {
        p = t[6];
      }
      return p;
    }
    let c;
    if (t[7] !== o || t[8] !== r) {
      let u = o.split(`
`).filter(NQm);
      let d = u.length === 0;
      let p;
      if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
        p = q0.jsx(gXd, {
          marginBottom: 1,
          children: q0.jsx(Text, {
            bold: true,
            children: "Cloud session"
          })
        });
        t[10] = p;
      } else {
        p = t[10];
      }
      let m;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        m = q0.jsx(Text, {
          dimColor: true,
          children: "Open in browser: "
        });
        t[11] = m;
      } else {
        m = t[11];
      }
      let f;
      if (t[12] !== r) {
        f = q0.jsxs(gXd, {
          children: [m, q0.jsx(Text, {
            color: "ide",
            children: r
          })]
        });
        t[12] = r;
        t[13] = f;
      } else {
        f = t[13];
      }
      let h;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        h = q0.jsx(gXd, {
          marginBottom: 1,
          children: q0.jsx(Lw, {
            children: q0.jsx(xt, {
              chord: "escape",
              action: "cancel",
              parens: true
            })
          })
        });
        t[14] = h;
      } else {
        h = t[14];
      }
      c = q0.jsxs(Td, {
        children: [p, f, h, d ? q0.jsx(Text, {
          dimColor: true,
          children: "Generating QR code\u2026"
        }) : u.map(MQm)]
      });
      t[7] = o;
      t[8] = r;
      t[9] = c;
    } else {
      c = t[9];
    }
    return c;
  }
  function MQm(e, t) {
    return q0.jsx(Text, {
      children: e
    }, t);
  }
  function NQm(e) {
    return e.length > 0;
  }
  function LQm(e) {
    logForDebugging("QR code generation failed", e);
  }
  function FQm(e) {
    return e.remoteSessionUrl;
  }
  var zQl;
  var KQl;
  var Ocr;
  var q0;
  var call_export47 = async e => q0.jsx(DQm, {
    onDone: e
  });
  var JQl = __lazy(() => {
    fz();
    bs();
    oE();
    et();
    Bs();
    ru();
    ho();
    je();
    zQl = __toESM(pt(), 1);
    KQl = __toESM(Iwt(), 1);
    Ocr = __toESM(ot(), 1);
    q0 = __toESM(ie(), 1);
  });
  var BQm;
  var QQl;
  var ZQl = __lazy(() => {
    QQl = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var eZl;
  var tZl = __lazy(() => {
    eZl = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function r9o(e, t) {
    let n = e < 1 ? Math.round(e / 0.25) * 0.25 : Math.round(e);
    return j_(n, t, 10);
  }
  function sZl({
    onDone: e,
    showDemoRuler: t = true,
    editorSensitivity: n = null
  }) {
    let r = sCe.useRef(process.env["CLAUDE_CODE_SCROLL_SPEED"]);
    let o = VF();
    let s = Heo(o.xtermJs, o.wheelFlood, o.wtSession);
    let i = o.useDecayCurve ? 1 : 0.25;
    let [a, l] = sCe.useState(() => r9o(o.base, i));
    let [c, u] = sCe.useState(r.current !== undefined);
    let d = sCe.useRef(false);
    let p = sCe.useRef(false);
    let m = !o.xtermJs && !o.wheelFlood;
    sCe.useEffect(() => {
      Cno(true, {
        demoRuler: t
      });
      let E = m ? _ct(() => {
        let C = nKi();
        if (!C) {
          return;
        }
        if (C.wheelMode) {
          d.current = true;
        } else {
          p.current = true;
        }
      }) : undefined;
      return () => {
        E?.();
        Cno(false);
      };
    }, [t, m]);
    function f(E) {
      let C = E < 0 ? a <= 1 ? -0.25 : -1 : a < 1 ? 0.25 : 1;
      let x = r9o(a + C, i);
      if (x === a) {
        return;
      }
      process.env["CLAUDE_CODE_SCROLL_SPEED"] = String(x);
      yNn();
      u(true);
      l(x);
    }
    function h() {
      delete process.env["CLAUDE_CODE_SCROLL_SPEED"];
      yNn();
      l(r9o(s, i));
      u(false);
    }
    function g() {
      if (r.current === undefined) {
        delete process.env["CLAUDE_CODE_SCROLL_SPEED"];
      } else {
        process.env["CLAUDE_CODE_SCROLL_SPEED"] = r.current;
      }
      yNn();
    }
    function y() {
      g();
      e("Scroll speed unchanged");
    }
    function _() {
      let E = !c;
      let C = {
        ["CLAUDE_CODE_SCROLL_SPEED"]: E ? undefined : String(a)
      };
      let {
        error: x
      } = updateSettingsForSource("userSettings", {
        env: C
      });
      if (x) {
        Oe(x);
        g();
        e(`Couldn't save scroll speed: ${x.message}`);
        return;
      }
      logEvent("tengu_scroll_speed_set", {
        scroll_speed: E ? s : a,
        scroll_speed_auto: s,
        reset_to_auto: E,
        xterm_js: o.xtermJs,
        wheel_flood: o.wheelFlood,
        wt_session: o.wtSession,
        use_decay_curve: o.useDecayCurve,
        saw_scroll_wheel: d.current,
        saw_trackpad: p.current,
        editor_wheel_sensitivity: n?.sensitivity ?? undefined,
        term_program: o.termProgram,
        term_program_version: uS(o.termProgramVersion)
      });
      let A = `\`${LN(getSettingsFilePathForSource("userSettings") ?? "settings.json")}\``;
      e(E ? `Scroll speed reset to auto (${s} ${un(s, "line")} per notch) \xB7 removed from ${A}` : `Scroll speed set to ${a} ${un(a, "line")} per notch \xB7 saved to ${A}`);
    }
    function b(E) {
      if (E.key === "left") {
        E.preventDefault();
        f(-1);
      } else if (E.key === "right") {
        E.preventDefault();
        f(1);
      } else if (E.key === "return") {
        E.preventDefault();
        _();
      } else if (E.key === "escape" || E.ctrl && (E.key === "c" || E.key === "d")) {
        E.preventDefault();
        y();
      } else if (E.key === "r") {
        E.preventDefault();
        h();
      }
    }
    let S = !c;
    return hP.jsx(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: b,
      children: hP.jsx(Td, {
        color: "permission",
        children: hP.jsxs(gXd, {
          flexDirection: "column",
          children: [hP.jsx(Text, {
            bold: true,
            children: "Scroll speed"
          }), hP.jsx(gXd, {
            height: 1
          }), hP.jsxs(gXd, {
            children: [hP.jsx(Text, {
              color: "permission",
              children: HQm(a)
            }), hP.jsxs(Text, {
              children: ["  ", a, " ", un(a, "line"), " per wheel notch"]
            }), S && hP.jsx(Text, {
              dimColor: true,
              children: " (auto)"
            }), !S && hP.jsxs(Text, {
              dimColor: true,
              children: [" \xB7 auto is ", s]
            })]
          }), hP.jsx(gXd, {
            height: 1
          }), hP.jsx(nZl, {
            label: "Terminal",
            value: jQm(o)
          }), n && hP.jsx(nZl, {
            label: "Editor",
            value: WQm(n)
          }), hP.jsx(gXd, {
            height: 1
          }), hP.jsx(Text, {
            dimColor: true,
            children: "Scroll to feel it \xB7 \u2190/\u2192 adjust \xB7 r reset to auto \xB7 Enter save \xB7 Esc cancel"
          })]
        })
      })
    });
  }
  function nZl(e) {
    let t = rZl.c(7);
    let {
      label: n,
      value: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = hP.jsx(gXd, {
        width: 12,
        children: hP.jsx(Text, {
          dimColor: true,
          children: n
        })
      });
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r) {
      s = hP.jsx(Text, {
        children: r
      });
      t[2] = r;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = hP.jsxs(gXd, {
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
  function HQm(e) {
    if (e < 1) {
      return "\u25AA" + hm("\xB7", 10 - 1);
    }
    let t = j_(Math.round(e), 1, 10);
    return "\u25A0".repeat(t) + hm("\xB7", 10 - t);
  }
  function jQm(e) {
    let t = [qQm(e), Wfn(e.platform)];
    if (e.wheelFlood) {
      t.push("high-rate wheel events");
    } else if (e.xtermJs) {
      t.push("xterm.js");
    } else if (e.wtSession) {
      t.push("Windows Terminal");
    }
    return t.join(" \xB7 ");
  }
  function qQm(e) {
    if (process.env.CURSOR_TRACE_ID !== undefined) {
      return "Cursor";
    }
    let t = process.env.VSCODE_GIT_ASKPASS_MAIN ?? "";
    if (t.includes("cursor")) {
      return "Cursor (remote)";
    }
    if (eMr(t)) {
      return "Devin Desktop";
    }
    if (t.includes("antigravity")) {
      return "Antigravity";
    }
    if (e.termProgram === "vscode") {
      return `VS Code${e.termProgramVersion !== "unset" ? ` ${e.termProgramVersion}` : ""}`;
    }
    switch (e.termProgram) {
      case "unset":
        return e.wtSession || e.platform === "win32" ? "Windows console" : "terminal";
      case "iTerm.app":
        return "iTerm2";
      case "Apple_Terminal":
        return "Terminal.app";
      case "ghostty":
        return "Ghostty";
      case "WezTerm":
        return "WezTerm";
      case "WarpTerminal":
        return "Warp";
      default:
        return e.termProgram;
    }
  }
  function WQm(e) {
    let t = e.editor === "VSCode" ? "VS Code" : e.editor;
    if (e.sensitivity === null) {
      return `${t} wheel sensitivity unset \xB7 /terminal-setup sets it to ${e.recommended}`;
    }
    if (e.sensitivity >= e.recommended) {
      return `${t} wheel sensitivity ${e.sensitivity}`;
    }
    return `${t} wheel sensitivity ${e.sensitivity} \xB7 /terminal-setup raises it to ${e.recommended}`;
  }
  var rZl;
  var sCe;
  var hP;
  var iZl = __lazy(() => {
    Q8();
    jWe();
    pPe();
    et();
    Ot();
    Gu();
    xDt();
    Rn();
    ku();
    Cs();
    Zn();
    oE();
    rZl = __toESM(pt(), 1);
    sCe = __toESM(ot(), 1);
    hP = __toESM(ie(), 1);
  });
  var aZl = {};
  __export(aZl, {
    call: () => call_export48
  });
  var lZl;
  var call_export48 = async (e, t) => {
    let n = t.messages.length < 20;
    let r = await withTimeout(readVSCodeScrollSensitivity(), 250, "VS Code settings read timed out").catch(() => null);
    return lZl.jsx(sZl, {
      onDone: e,
      showDemoRuler: n,
      editorSensitivity: r
    });
  };
  var cZl = __lazy(() => {
    iZl();
    zPe();
    lZl = __toESM(ie(), 1);
  });
  var zQm;
  function YQm(e, t) {
    let n = getSettingsForSource("policySettings")?.skillOverrides?.[t];
    if (n) {
      return {
        value: n,
        source: "policy"
      };
    }
    let r = getSettingsForSource("flagSettings")?.skillOverrides?.[t];
    if (r) {
      return {
        value: r,
        source: "flag"
      };
    }
    if (e.disableModelInvocation) {
      return {
        value: "user-invocable-only",
        source: "author"
      };
    }
    if (e.source === "plugin") {
      return {
        value: "on",
        source: "plugin"
      };
    }
    return;
  }
  function JQm(e) {
    return getSettingsForSource("projectSettings")?.skillOverrides?.[e] ?? getSettingsForSource("userSettings")?.skillOverrides?.[e];
  }
  function fZl(e) {
    switch (e) {
      case "mcp":
      case "plugin":
        return e;
      case "bundled":
      case "builtin":
        return "built-in";
      default:
        return cY(e);
    }
  }
  function hZl({
    onExit: e,
    commands: t,
    bytesPerToken: n
  }) {
    let [r, o] = CH.useState(false);
    let s = CH.useMemo(() => {
      let U = t.filter(N => N.type === "prompt" && (N.loadedFrom === "skills" || N.loadedFrom === "commands_DEPRECATED" || N.loadedFrom === "plugin" || N.loadedFrom === "mcp"));
      if (r) {
        let N = new Map(U.map(W => [W, Rvo(W)]));
        return U.sort((W, j) => (N.get(j) ?? 0) - (N.get(W) ?? 0) || getCommandName(W).localeCompare(getCommandName(j)));
      }
      return U.sort((N, W) => String(N.source).localeCompare(String(W.source)) || getCommandName(N).localeCompare(getCommandName(W)));
    }, [t, r]);
    let i = CH.useMemo(() => getSettingsForSource("localSettings")?.skillOverrides ?? {}, []);
    let a = CH.useMemo(() => {
      let U = new Map();
      for (let N of s) {
        let W = JQm(N.name);
        if (W) {
          U.set(N.name, W);
        }
      }
      return U;
    }, [s]);
    let l = CH.useMemo(() => {
      let U = new Map();
      for (let N of s) {
        let W = YQm(N, N.name);
        if (W) {
          U.set(N, W);
        }
      }
      return U;
    }, [s]);
    let [c, u] = CH.useState(() => {
      let U = {};
      for (let N of s) {
        if (N.name in U) {
          continue;
        }
        U[N.name] = l.get(N)?.value ?? i[N.name] ?? a.get(N.name) ?? "on";
      }
      return U;
    });
    let [d, p] = CH.useState(s[0]);
    let m = useTerminalFocus();
    let [f, h] = CH.useState(false);
    let g = CH.useRef(f);
    let {
      query: y,
      setQuery: _,
      cursorOffset: b,
      handleKeyDown: S,
      handlePaste: E
    } = U0({
      isActive: f,
      onExit: () => {
        g.current = false;
        h(false);
      },
      passthroughCtrlKeys: ["c", "d"]
    });
    Eg();
    let C = CH.useMemo(() => {
      if (!y) {
        return s;
      }
      let U = y.toLowerCase();
      return s.filter(N => N.name.toLowerCase().includes(U) || (N.description ?? "").toLowerCase().includes(U) || fZl(N.source).toLowerCase().includes(U));
    }, [s, y]);
    let {
      rows: x
    } = h_(Sr());
    let A = j_(x - 13, 4, C.length);
    let k = () => {
      let U = d;
      if (!U || !C.includes(U)) {
        return;
      }
      if (l.vZc(U)) {
        return;
      }
      u(N => {
        let W = N[U.name] ?? "on";
        let j = o9o[(o9o.indexOf(W) + 1) % o9o.length];
        return {
          ...N,
          [U.name]: j
        };
      });
    };
    let I = () => {
      let U = new Set(Array.from(l.keys(), V => V.name));
      let N = new Set(U);
      let W = {};
      let j = 0;
      let z = 0;
      for (let V of s) {
        if (N.vZc(V.name)) {
          continue;
        }
        N.add(V.name);
        let K = c[V.name] ?? "on";
        let J = a.get(V.name) ?? "on";
        let Q = i[V.name] ?? J;
        let Z = K === J ? undefined : K;
        if (Z !== i[V.name]) {
          W[V.name] = Z;
          j++;
        }
        if (K !== Q) {
          z++;
        }
      }
      if (j > 0) {
        let {
          error: V
        } = updateSettingsForSource("localSettings", {
          skillOverrides: W
        });
        if (V) {
          e(`Failed to save skill overrides: ${V.message}`, {
            display: "system"
          });
          return;
        }
        clearCommandMemoizationCaches();
      }
      e(z > 0 ? `Updated ${z} skill ${un(z, "override")}` : "No changes", {
        display: "system"
      });
    };
    let O = Zu("confirm:no", "Settings", "esc");
    let M = Zu("settings:sortByTokens", "Settings", "t");
    jo({
      "select:accept": k,
      "settings:sortByTokens": () => o(U => !U)
    }, {
      context: "Settings",
      isActive: !f && C.length > 0
    });
    jo({
      "confirm:no": I
    }, {
      context: "Settings",
      isActive: !f
    });
    let L = CH.useCallback(U => {
      if (g.current) {
        S(U);
        return;
      }
      if (U.ctrl || U.meta) {
        return;
      }
      if (U.name === "backspace") {
        if (y) {
          U.preventDefault();
          g.current = true;
          h(true);
          _(y.slice(0, -1));
        }
        return;
      }
      if (U.name.length > 1 && U.name !== "number") {
        return;
      }
      if (U.key.length >= 1 && U.key !== " ") {
        U.preventDefault();
        g.current = true;
        h(true);
        let N = U.key.startsWith("/") ? U.key.slice(1) : U.key;
        _(y + N);
      }
    }, [S, _, y]);
    let P = CH.useCallback(U => {
      if (g.current) {
        E(U);
        return;
      }
      let N = U.text.split(/\r\n|\r|\n/, 2)[0] ?? "";
      if (N.length === 0) {
        return;
      }
      U.preventDefault();
      g.current = true;
      h(true);
      let W = N.startsWith("/") ? N.slice(1) : N;
      _(y + W);
    }, [E, _, y]);
    if (s.length === 0) {
      return SA.jsx(or, {
        title: "Skills",
        onCancel: () => e("Skills dialog dismissed", {
          display: "system"
        }),
        inputGuide: SA.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "close"
        }),
        children: SA.jsx(sc, {
          hint: Ql() ? `Custom skills are disabled in safe mode \u2014 ${UR()} to load them` : "Create skills in .claude/skills/ or ~/.claude/skills/",
          children: "No skills found"
        })
      });
    }
    let F = y ? `${C.length}/${s.length} ${un(s.length, "skill")}` : `${s.length} ${un(s.length, "skill")}`;
    let H = f ? "type to filter \xB7 \u2193/enter to select \xB7 esc to clear" : C.length === 0 ? `/ to search, ${O} to close` : `enter/space to cycle, / to search, ${M} to sort, ${O} to close`;
    return SA.jsx(or, {
      title: "Skills",
      subtitle: `${F}${r ? " \xB7 sorted by tokens" : ""} \xB7 ${H}`,
      onCancel: () => e("Skills dialog dismissed", {
        display: "system"
      }),
      isCancelActive: false,
      hideInputGuide: true,
      children: SA.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: L,
        onPaste: P,
        children: [SA.jsx(YM, {
          query: y,
          isFocused: f,
          isTerminalFocused: m,
          cursorOffset: b,
          placeholder: "Search skills\u2026"
        }), C.length === 0 ? SA.jsx(gXd, {
          marginTop: 1,
          children: SA.jsx(sc, {
            children: `No skills match "${y}"`
          })
        }) : SA.jsx(_wt, {
          visibleCount: A,
          isDisabled: f,
          wrap: true,
          overflowHint: "count",
          onFocus: U => p(C[U]),
          children: C.map(U => SA.jsx(_wt.Item, {
            children: SA.jsx(XQm, {
              skill: U,
              lock: l.get(U),
              state: l.get(U)?.value ?? c[U.name] ?? "on",
              bytesPerToken: n
            })
          }, `${U.name}-${U.source}`))
        }, r ? "tok" : "name"), s.some(U => U.source === "plugin") && SA.jsx(gXd, {
          marginTop: 1,
          children: SA.jsx(Text, {
            dimColor: true,
            children: "Plugin skills are managed via /plugin"
          })
        }), Ql() && SA.jsx(gXd, {
          marginTop: 1,
          children: SA.jsxs(Text, {
            dimColor: true,
            children: ["Custom skills are disabled in safe mode \u2014", " ", `${UR()} to load them`]
          })
        })]
      })
    });
  }
  function XQm(e) {
    let t = mZl.c(22);
    let {
      skill: n,
      lock: r,
      state: o,
      bytesPerToken: s
    } = e;
    let i = A8l();
    let a = KQm[o];
    let l;
    if (t[0] !== s || t[1] !== n) {
      l = formatTokenEstimate(Rvo(n, s));
      t[0] = s;
      t[1] = n;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = `${l} tok`;
    let u;
    if (t[3] !== a.color || t[4] !== a.glyph || t[5] !== a.label || t[6] !== r) {
      u = r ? SA.jsx(Text, {
        dimColor: true,
        children: "\uD83D\uDD12 " + a.label.padEnd(9)
      }) : SA.jsxs(Text, {
        color: a.color,
        children: [a.glyph, " ", a.label.padEnd(9)]
      });
      t[3] = a.color;
      t[4] = a.glyph;
      t[5] = a.label;
      t[6] = r;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      d = SA.jsx(Text, {
        children: "  "
      });
      t[8] = d;
    } else {
      d = t[8];
    }
    let p = i ? "suggestion" : undefined;
    let m;
    if (t[9] !== n.name || t[10] !== p) {
      m = SA.jsx(Text, {
        color: p,
        children: n.name
      });
      t[9] = n.name;
      t[10] = p;
      t[11] = m;
    } else {
      m = t[11];
    }
    let f;
    if (t[12] !== n.source) {
      f = fZl(n.source);
      t[12] = n.source;
      t[13] = f;
    } else {
      f = t[13];
    }
    let h = r ? ` \xB7 locked by ${r.source}` : "";
    let g;
    if (t[14] !== f || t[15] !== h || t[16] !== c) {
      g = SA.jsxs(Text, {
        dimColor: true,
        children: [" ", "\xB7 ", f, " \xB7 ", c, h]
      });
      t[14] = f;
      t[15] = h;
      t[16] = c;
      t[17] = g;
    } else {
      g = t[17];
    }
    let y;
    if (t[18] !== u || t[19] !== m || t[20] !== g) {
      y = SA.jsxs(gXd, {
        children: [u, d, m, g]
      });
      t[18] = u;
      t[19] = m;
      t[20] = g;
      t[21] = y;
    } else {
      y = t[21];
    }
    return y;
  }
  var mZl;
  var CH;
  var SA;
  var o9o;
  var KQm;
  var gZl = __lazy(() => {
    Bm();
    rE();
    mO();
    sie();
    ki();
    Q8();
    et();
    Bs();
    c0();
    T9();
    gn();
    cs();
    nf();
    Zn();
    Sd();
    Ii();
    xb();
    l4o();
    Cfe();
    mZl = __toESM(pt(), 1);
    CH = __toESM(ot(), 1);
    SA = __toESM(ie(), 1);
    o9o = ["on", "name-only", "user-invocable-only", "off"];
    KQm = {
      on: {
        glyph: vGd.tick,
        label: "on",
        color: "success"
      },
      "name-only": {
        glyph: vGd.bullet,
        label: "name-only"
      },
      "user-invocable-only": {
        glyph: vGd.circle,
        label: "user-only",
        color: "warning"
      },
      off: {
        glyph: vGd.cross,
        label: "off",
        color: "error"
      }
    };
  });
  var yZl = {};
  __export(yZl, {
    call: () => call_export49
  });
  async function call_export49(e, t) {
    return _Zl.jsx(hZl, {
      onExit: e,
      commands: t.options.commands,
      bytesPerToken: bytesPerTokenForModel(t.options.mainLoopModel)
    });
  }
  var _Zl;
  var bZl = __lazy(() => {
    gZl();
    Eo();
    twt();
    olr();
    _Zl = __toESM(ie(), 1);
  });
  var ZQm;
  var EZl = {};
  __export(EZl, {
    call: () => call_export50
  });
  async function call_export50(e, t) {
    return vZl.jsx(uUe, {
      onClose: e,
      context: t,
      defaultTab: "Status"
    });
  }
  var vZl;
  var wZl = __lazy(() => {
    WQt();
    vZl = __toESM(ie(), 1);
  });
  var tZm;
  function s9o(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "local_agent";
  }
  function i9o(e) {
    return typeof e === "object" && e !== null && "type" in e && (e.type === "local_agent" || e.type === "in_process_teammate");
  }
  function a9o(e) {
    if (e.type === "in_process_teammate") {
      return {
        ...e,
        evictAfter: e.isIdle ? Date.now() + 30000 : undefined
      };
    }
    return {
      ...e,
      retain: false,
      diskLoaded: false,
      evictAfter: Mw(e.status) ? Date.now() + 30000 : undefined
    };
  }
  function iCe(e, t) {
    logEvent("tengu_transcript_view_enter", {});
    t(n => {
      let r = n.tasks[e];
      let o = n.viewingAgentTaskId;
      let s = o !== undefined ? n.tasks[o] : undefined;
      let i = o !== undefined && o !== e && i9o(s);
      let a = i9o(r) && (s9o(r) && !r.retain || r.evictAfter !== undefined);
      let l = n.viewingAgentTaskId !== e || n.viewSelectionMode !== "viewing-agent";
      if (!a && !l && !i) {
        return n;
      }
      let c = n.tasks;
      if (i || a) {
        if (c = {
          ...n.tasks
        }, i) {
          c[o] = a9o(s);
        }
        if (a) {
          c[e] = s9o(r) ? {
            ...r,
            retain: true,
            evictAfter: undefined
          } : {
            ...r,
            evictAfter: undefined
          };
        }
      }
      return {
        ...n,
        viewingAgentTaskId: e,
        viewSelectionMode: "viewing-agent",
        tasks: c
      };
    });
  }
  function I5(e) {
    logEvent("tengu_transcript_view_exit", {});
    e(t => {
      let n = t.viewingAgentTaskId;
      let r = {
        ...t,
        viewingAgentTaskId: undefined,
        viewSelectionMode: "none"
      };
      if (n === undefined) {
        return t.viewSelectionMode === "none" ? t : r;
      }
      let o = t.tasks[n];
      if (!i9o(o)) {
        return r;
      }
      return {
        ...r,
        tasks: {
          ...t.tasks,
          [n]: a9o(o)
        }
      };
    });
  }
  function kZl(e, t) {
    t(n => {
      let r = n.tasks[e];
      if (!s9o(r)) {
        return n;
      }
      if (r.status === "running") {
        return n;
      }
      if (r.evictAfter === 0) {
        return n;
      }
      let o = n.viewingAgentTaskId === e;
      return {
        ...n,
        tasks: {
          ...n.tasks,
          [e]: {
            ...a9o(r),
            evictAfter: 0
          }
        },
        ...(o && {
          viewingAgentTaskId: undefined,
          viewSelectionMode: "none"
        })
      };
    });
  }
  var GUe = __lazy(() => {
    Ot();
    Cx();
  });
  function Ncr(e, t, n) {
    let r = Cl(t, e.toolName);
    if (!r) {
      return e.toolName;
    }
    try {
      let o = yle(e.input);
      let s = r.inputSchema.safeParse(e.input);
      let i = s.success ? s.data : {};
      let a = r.userFacingName(i);
      if (!a) {
        return e.toolName;
      }
      let l = o ?? r.renderToolUseMessage(i, {
        theme: n,
        verbose: false
      });
      if (l) {
        return AZl.jsxs(Text, {
          children: [a, "(", l, ")"]
        });
      }
      return a;
    } catch {
      return e.toolName;
    }
  }
  var AZl;
  var l9o = __lazy(() => {
    et();
    ci();
    Gd();
    AZl = __toESM(ie(), 1);
  });
  function aCe(e) {
    return e === "completed" || e === "failed" || e === "killed";
  }
  function IZl(e, t) {
    let {
      isIdle: n,
      awaitingApproval: r,
      hasError: o,
      shutdownRequested: s
    } = t ?? {};
    if (o) {
      return vGd.cross;
    }
    if (r) {
      return vGd.questionMarkPrefix;
    }
    if (s) {
      return vGd.warning;
    }
    if (e === "running") {
      if (n) {
        return vGd.ellipsis;
      }
      return vGd.play;
    }
    if (e === "completed") {
      return vGd.tick;
    }
    if (e === "failed" || e === "killed") {
      return vGd.cross;
    }
    if (e === "paused") {
      return vGd.hamburger;
    }
    return vGd.bullet;
  }
  function PZl(e, t) {
    let {
      isIdle: n,
      awaitingApproval: r,
      hasError: o,
      shutdownRequested: s
    } = t ?? {};
    if (o) {
      return "error";
    }
    if (r) {
      return "warning";
    }
    if (s) {
      return "warning";
    }
    if (n) {
      return "background";
    }
    if (e === "completed") {
      return "success";
    }
    if (e === "failed") {
      return "error";
    }
    if (e === "killed") {
      return "warning";
    }
    if (e === "paused") {
      return "warning";
    }
    return "background";
  }
  function Zwt(e) {
    if (e.shutdownRequested) {
      return "stopping";
    }
    if (e.awaitingPlanApproval) {
      return "awaiting approval";
    }
    if (e.isIdle) {
      return "idle";
    }
    return (e.progress?.recentActivities && r5n(e.progress.recentActivities)) ?? e.progress?.lastActivity?.activityDescription ?? "working";
  }
  function eCt(e) {
    return kv(e) && e.type !== "local_workflow" && !(HQn() && (j$(e) || e.type === "in_process_teammate"));
  }
  var lCe = __lazy(() => {
    ry();
    OMo();
    FNe();
  });
  function DZl(e) {
    let t = OZl.c(63);
    let {
      agent: n,
      onDone: r,
      onKillAgent: o,
      onBack: s,
      killAllAgentsShortcut: i
    } = e;
    let [a] = useTheme();
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = fH(tq());
      t[0] = l;
    } else {
      l = t[0];
    }
    let c = l;
    let u = iZ(n.startTime, n.status === "running", 1000, n.totalPausedMs ?? 0, n.endTime);
    let d;
    if (t[1] !== r) {
      d = {
        "confirm:yes": r
      };
      t[1] = r;
      t[2] = d;
    } else {
      d = t[2];
    }
    let p;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        context: "Confirmation"
      };
      t[3] = p;
    } else {
      p = t[3];
    }
    jo(d, p);
    let m;
    if (t[4] !== n.status || t[5] !== s || t[6] !== r || t[7] !== o) {
      m = Q => {
        if (Q.key === " ") {
          Q.preventDefault();
          r();
        } else if (Q.key === "left" && s) {
          Q.preventDefault();
          s();
        } else if (Q.key === "x" && !Q.ctrl && !Q.meta && n.status === "running" && o) {
          Q.preventDefault();
          o();
        }
      };
      t[4] = n.status;
      t[5] = s;
      t[6] = r;
      t[7] = o;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f = m;
    let h;
    if (t[9] !== n.prompt) {
      h = Nl(n.prompt, "plan");
      t[9] = n.prompt;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g = h;
    let y = n.prompt.length > 300 ? n.prompt.substring(0, 297) + "\u2026" : n.prompt;
    let _ = n.result?.totalTokens ?? n.progress?.tokenCount;
    let b = n.result?.totalToolUseCount ?? n.progress?.toolUseCount;
    let S = n.selectedAgent?.agentType ?? "agent";
    let E = n.description || "Async agent";
    let C;
    if (t[11] !== S || t[12] !== E) {
      C = NS.jsxs(Text, {
        children: [S, " \u203A", " ", E]
      });
      t[11] = S;
      t[12] = E;
      t[13] = C;
    } else {
      C = t[13];
    }
    let x = C;
    let A;
    if (t[14] !== n.status) {
      A = n.status !== "running" && NS.jsxs(Text, {
        color: PZl(n.status),
        children: [IZl(n.status), " ", n.status === "completed" ? "Completed" : n.status === "failed" ? "Failed" : "Stopped", " \xB7 "]
      });
      t[14] = n.status;
      t[15] = A;
    } else {
      A = t[15];
    }
    let k;
    if (t[16] !== _) {
      k = _ !== undefined && _ > 0 && NS.jsxs(NS.Fragment, {
        children: [" \xB7 ", formatNumber(_), " tokens"]
      });
      t[16] = _;
      t[17] = k;
    } else {
      k = t[17];
    }
    let I;
    if (t[18] !== b) {
      I = b !== undefined && b > 0 && NS.jsxs(NS.Fragment, {
        children: [" ", "\xB7 ", b, " ", b === 1 ? "tool" : "tools"]
      });
      t[18] = b;
      t[19] = I;
    } else {
      I = t[19];
    }
    let O;
    if (t[20] !== u || t[21] !== k || t[22] !== I) {
      O = NS.jsxs(Text, {
        dimColor: true,
        children: [u, k, I]
      });
      t[20] = u;
      t[21] = k;
      t[22] = I;
      t[23] = O;
    } else {
      O = t[23];
    }
    let M;
    if (t[24] !== O || t[25] !== A) {
      M = NS.jsxs(Text, {
        children: [A, O]
      });
      t[24] = O;
      t[25] = A;
      t[26] = M;
    } else {
      M = t[26];
    }
    let L = M;
    let P;
    if (t[27] !== s) {
      P = s && NS.jsx(xt, {
        chord: "left",
        action: "go back"
      });
      t[27] = s;
      t[28] = P;
    } else {
      P = t[28];
    }
    let F;
    if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
      F = NS.jsx(xt, {
        chord: ["escape", "enter", "space"],
        action: "close"
      });
      t[29] = F;
    } else {
      F = t[29];
    }
    let H;
    if (t[30] !== n.status || t[31] !== o) {
      H = n.status === "running" && o && NS.jsx(xt, {
        chord: "x",
        action: "stop"
      });
      t[30] = n.status;
      t[31] = o;
      t[32] = H;
    } else {
      H = t[32];
    }
    let U;
    if (t[33] !== n.status || t[34] !== i) {
      U = n.status === "running" && i && NS.jsx(xt, {
        chord: i,
        action: "stop all agents",
        format: {
          keyCase: "lower"
        }
      });
      t[33] = n.status;
      t[34] = i;
      t[35] = U;
    } else {
      U = t[35];
    }
    let N;
    if (t[36] !== P || t[37] !== H || t[38] !== U) {
      N = NS.jsxs(Hn, {
        children: [P, F, H, U]
      });
      t[36] = P;
      t[37] = H;
      t[38] = U;
      t[39] = N;
    } else {
      N = t[39];
    }
    let W;
    if (t[40] !== n.progress || t[41] !== n.status || t[42] !== a) {
      W = n.status === "running" && n.progress?.recentActivities && n.progress.recentActivities.length > 0 && NS.jsxs(gXd, {
        flexDirection: "column",
        children: [NS.jsx(Text, {
          bold: true,
          dimColor: true,
          children: "Progress"
        }), n.progress.recentActivities.map((Q, Z) => NS.jsxs(Text, {
          dimColor: Z < n.progress.recentActivities.length - 1,
          wrap: "truncate-end",
          children: [Z === n.progress.recentActivities.length - 1 ? "\u203A " : "  ", Ncr(Q, c, a)]
        }, Z))]
      });
      t[40] = n.progress;
      t[41] = n.status;
      t[42] = a;
      t[43] = W;
    } else {
      W = t[43];
    }
    let j;
    if (t[44] !== y || t[45] !== g) {
      j = g ? NS.jsx(gXd, {
        marginTop: 1,
        children: NS.jsx(QQn, {
          addMargin: false,
          planContent: g
        })
      }) : NS.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [NS.jsx(Text, {
          bold: true,
          dimColor: true,
          children: "Prompt"
        }), NS.jsx(Text, {
          wrap: "wrap",
          children: y
        })]
      });
      t[44] = y;
      t[45] = g;
      t[46] = j;
    } else {
      j = t[46];
    }
    let z;
    if (t[47] !== n.error || t[48] !== n.status) {
      z = n.status === "failed" && n.error && NS.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [NS.jsx(Text, {
          bold: true,
          color: "error",
          children: "Error"
        }), NS.jsx(Text, {
          color: "error",
          wrap: "wrap",
          children: n.error
        })]
      });
      t[47] = n.error;
      t[48] = n.status;
      t[49] = z;
    } else {
      z = t[49];
    }
    let V;
    if (t[50] !== W || t[51] !== j || t[52] !== z) {
      V = NS.jsxs(gXd, {
        flexDirection: "column",
        children: [W, j, z]
      });
      t[50] = W;
      t[51] = j;
      t[52] = z;
      t[53] = V;
    } else {
      V = t[53];
    }
    let K;
    if (t[54] !== r || t[55] !== L || t[56] !== N || t[57] !== V || t[58] !== x) {
      K = NS.jsx(or, {
        title: x,
        subtitle: L,
        onCancel: r,
        color: "background",
        inputGuide: N,
        children: V
      });
      t[54] = r;
      t[55] = L;
      t[56] = N;
      t[57] = V;
      t[58] = x;
      t[59] = K;
    } else {
      K = t[59];
    }
    let J;
    if (t[60] !== f || t[61] !== K) {
      J = NS.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: f,
        children: K
      });
      t[60] = f;
      t[61] = K;
      t[62] = J;
    } else {
      J = t[62];
    }
    return J;
  }
  var OZl;
  var NS;
  var MZl = __lazy(() => {
    WSt();
    et();
    Bs();
    ci();
    jM();
    cs();
    ro();
    Ai();
    Ii();
    bs();
    GMo();
    l9o();
    lCe();
    OZl = __toESM(pt(), 1);
    NS = __toESM(ie(), 1);
  });
  function p9o(e, t, n, r) {
    if (!e) {
      return `${t} found \xB7 ${n} verified`;
    }
    if (e === "synthesizing") {
      let o = [`${n} verified`];
      if (r > 0) {
        o.push(`${r} refuted`);
      }
      o.push("deduping");
      return o.join(" \xB7 ");
    }
    if (e === "verifying") {
      let o = [`${t} found`, `${n} verified`];
      if (r > 0) {
        o.push(`${r} refuted`);
      }
      return o.join(" \xB7 ");
    }
    return t > 0 ? `${t} found` : "finding";
  }
  function c9o(e) {
    let t = Lcr.c(5);
    let {
      text: n,
      phase: r
    } = e;
    let o = r === undefined ? 0 : r;
    let s;
    if (t[0] !== n) {
      s = [...n];
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== o || t[3] !== s) {
      i = Fv.jsx(Fv.Fragment, {
        children: s.map((a, l) => Fv.jsx(Text, {
          color: k8(l + o),
          children: a
        }, l))
      });
      t[2] = o;
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  function u9o(e, t, n) {
    let r = d9o.useRef(e);
    let o = d9o.useRef(t);
    if (n || e < r.current) {
      r.current = e;
    } else if (e > r.current && t !== o.current) {
      r.current += 1;
      o.current = t;
    }
    return r.current;
  }
  function nZm(e) {
    let t = Lcr.c(20);
    let {
      session: n
    } = e;
    let r = K_();
    let o = useIsScreenReaderEnabled();
    let s;
    if (t[0] !== o || t[1] !== r.prefersReducedMotion) {
      s = WC(r.prefersReducedMotion) || o;
      t[0] = o;
      t[1] = r.prefersReducedMotion;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a = n.reviewProgress;
    let l = n.status === "running";
    let [, c] = useAnimationFrame(l && !i ? 80 : null);
    let u = a?.bugsFound ?? 0;
    let d = a?.bugsVerified ?? 0;
    let p = a?.bugsRefuted ?? 0;
    let m = i || !l;
    let f = u9o(u, c, m);
    let h = u9o(d, c, m);
    let g = u9o(p, c, m);
    let y = Math.floor(c / (80 * 3)) % 7;
    if (n.status === "completed") {
      let k;
      let I;
      if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
        k = Fv.jsxs(Text, {
          color: "background",
          children: ["\u25C6", " "]
        });
        I = Fv.jsx(c9o, {
          text: "ultrareview",
          phase: 0
        });
        t[3] = k;
        t[4] = I;
      } else {
        k = t[3];
        I = t[4];
      }
      let O;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        O = Fv.jsxs(Fv.Fragment, {
          children: [k, I, Fv.jsxs(Text, {
            dimColor: true,
            children: [" ready \xB7 ", Fv.jsx(xt, {
              chord: "shift+down",
              action: "view"
            })]
          })]
        });
        t[5] = O;
      } else {
        O = t[5];
      }
      return O;
    }
    if (n.status === "failed") {
      let k;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        k = Fv.jsxs(Fv.Fragment, {
          children: [Fv.jsxs(Text, {
            color: "background",
            children: ["\u25C6", " "]
          }), Fv.jsx(c9o, {
            text: "ultrareview",
            phase: 0
          }), Fv.jsxs(Text, {
            color: "error",
            dimColor: true,
            children: [" \xB7 ", "error"]
          })]
        });
        t[6] = k;
      } else {
        k = t[6];
      }
      return k;
    }
    let _;
    if (t[7] !== f || t[8] !== a || t[9] !== g || t[10] !== h) {
      _ = !a ? "setting up" : p9o(a.stage, f, h, g);
      t[7] = f;
      t[8] = a;
      t[9] = g;
      t[10] = h;
      t[11] = _;
    } else {
      _ = t[11];
    }
    let b = _;
    let S;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      S = Fv.jsxs(Text, {
        color: "background",
        children: ["\u25C7", " "]
      });
      t[12] = S;
    } else {
      S = t[12];
    }
    let E = l ? y : 0;
    let C;
    if (t[13] !== E) {
      C = Fv.jsx(c9o, {
        text: "ultrareview",
        phase: E
      });
      t[13] = E;
      t[14] = C;
    } else {
      C = t[14];
    }
    let x;
    if (t[15] !== b) {
      x = Fv.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", b]
      });
      t[15] = b;
      t[16] = x;
    } else {
      x = t[16];
    }
    let A;
    if (t[17] !== C || t[18] !== x) {
      A = Fv.jsxs(Fv.Fragment, {
        children: [S, C, x]
      });
      t[17] = C;
      t[18] = x;
      t[19] = A;
    } else {
      A = t[19];
    }
    return A;
  }
  function Sen(e) {
    let t = Lcr.c(11);
    let {
      session: n
    } = e;
    if (n.isRemoteReview) {
      let a;
      if (t[0] !== n) {
        a = Fv.jsx(nZm, {
          session: n
        });
        t[0] = n;
        t[1] = a;
      } else {
        a = t[1];
      }
      return a;
    }
    if (n.status === "completed") {
      let a;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        a = Fv.jsx(Text, {
          bold: true,
          color: "success",
          dimColor: true,
          children: "done"
        });
        t[2] = a;
      } else {
        a = t[2];
      }
      return a;
    }
    if (n.status === "failed") {
      let a;
      if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
        a = Fv.jsx(Text, {
          bold: true,
          color: "error",
          dimColor: true,
          children: "error"
        });
        t[3] = a;
      } else {
        a = t[3];
      }
      return a;
    }
    if (!n.todoList.length) {
      let a;
      if (t[4] !== n.status) {
        a = Fv.jsxs(Text, {
          dimColor: true,
          children: [n.status, "\u2026"]
        });
        t[4] = n.status;
        t[5] = a;
      } else {
        a = t[5];
      }
      return a;
    }
    let r;
    if (t[6] !== n.todoList) {
      r = Bn(n.todoList, rZm);
      t[6] = n.todoList;
      t[7] = r;
    } else {
      r = t[7];
    }
    let o = r;
    let s = n.todoList.length;
    let i;
    if (t[8] !== o || t[9] !== s) {
      i = Fv.jsxs(Text, {
        dimColor: true,
        children: [o, "/", s]
      });
      t[8] = o;
      t[9] = s;
      t[10] = i;
    } else {
      i = t[10];
    }
    return i;
  }
  function rZm(e) {
    return e.status === "completed";
  }
  var Lcr;
  var d9o;
  var Fv;
  var m9o = __lazy(() => {
    wl();
    Qq();
    et();
    Dre();
    XN();
    bs();
    Lcr = __toESM(pt(), 1);
    d9o = __toESM(ot(), 1);
    Fv = __toESM(ie(), 1);
  });
  function cCe(e) {
    let t = f9o.c(4);
    let {
      status: n,
      label: r,
      suffix: o
    } = e;
    let s = r ?? n;
    let i = n === "completed" ? "success" : n === "failed" ? "error" : n === "killed" ? "warning" : undefined;
    let a;
    if (t[0] !== i || t[1] !== s || t[2] !== o) {
      a = YYe.jsxs(Text, {
        color: i,
        dimColor: true,
        children: ["(", s, o, ")"]
      });
      t[0] = i;
      t[1] = s;
      t[2] = o;
      t[3] = a;
    } else {
      a = t[3];
    }
    return a;
  }
  function LZl(e) {
    let t = f9o.c(4);
    let {
      shell: n
    } = e;
    switch (n.status) {
      case "completed":
        {
          let r;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            r = YYe.jsx(cCe, {
              status: "completed",
              label: "done"
            });
            t[0] = r;
          } else {
            r = t[0];
          }
          return r;
        }
      case "failed":
        {
          let r;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            r = YYe.jsx(cCe, {
              status: "failed",
              label: "error"
            });
            t[1] = r;
          } else {
            r = t[1];
          }
          return r;
        }
      case "killed":
        {
          let r;
          if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
            r = YYe.jsx(cCe, {
              status: "killed",
              label: "stopped"
            });
            t[2] = r;
          } else {
            r = t[2];
          }
          return r;
        }
      case "running":
      case "pending":
        {
          let r;
          if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
            r = YYe.jsx(cCe, {
              status: "running"
            });
            t[3] = r;
          } else {
            r = t[3];
          }
          return r;
        }
    }
  }
  var f9o;
  var YYe;
  var FZl = __lazy(() => {
    et();
    f9o = __toESM(pt(), 1);
    YYe = __toESM(ie(), 1);
  });
  function BZl(e) {
    let t = UZl.c(107);
    let {
      task: n,
      maxActivityWidth: r
    } = e;
    let o = r ?? 40;
    switch (n.type) {
      case "local_bash":
        {
          let s = n.kind === "monitor" ? n.description : n.command;
          let i;
          if (t[0] !== o || t[1] !== s) {
            i = truncate(s, o, true);
            t[0] = o;
            t[1] = s;
            t[2] = i;
          } else {
            i = t[2];
          }
          let a;
          if (t[3] !== n) {
            a = eC.jsx(LZl, {
              shell: n
            });
            t[3] = n;
            t[4] = a;
          } else {
            a = t[4];
          }
          let l;
          if (t[5] !== i || t[6] !== a) {
            l = eC.jsxs(Text, {
              children: [i, " ", a]
            });
            t[5] = i;
            t[6] = a;
            t[7] = l;
          } else {
            l = t[7];
          }
          return l;
        }
      case "remote_agent":
        {
          if (n.isRemoteReview) {
            let p;
            if (t[8] !== n) {
              p = eC.jsx(Text, {
                children: eC.jsx(Sen, {
                  session: n
                })
              });
              t[8] = n;
              t[9] = p;
            } else {
              p = t[9];
            }
            return p;
          }
          let i = n.status === "running" || n.status === "pending" ? "\u25C7" : "\u25C6";
          let a;
          if (t[10] !== i) {
            a = eC.jsxs(Text, {
              dimColor: true,
              children: [i, " "]
            });
            t[10] = i;
            t[11] = a;
          } else {
            a = t[11];
          }
          let l;
          if (t[12] !== o || t[13] !== n.title) {
            l = truncate(n.title, o, true);
            t[12] = o;
            t[13] = n.title;
            t[14] = l;
          } else {
            l = t[14];
          }
          let c;
          if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
            c = eC.jsx(Text, {
              dimColor: true,
              children: " \xB7 "
            });
            t[15] = c;
          } else {
            c = t[15];
          }
          let u;
          if (t[16] !== n) {
            u = eC.jsx(Sen, {
              session: n
            });
            t[16] = n;
            t[17] = u;
          } else {
            u = t[17];
          }
          let d;
          if (t[18] !== a || t[19] !== l || t[20] !== u) {
            d = eC.jsxs(Text, {
              children: [a, l, c, u]
            });
            t[18] = a;
            t[19] = l;
            t[20] = u;
            t[21] = d;
          } else {
            d = t[21];
          }
          return d;
        }
      case "local_agent":
        {
          let s;
          if (t[22] !== o || t[23] !== n.description) {
            s = truncate(n.description, o, true);
            t[22] = o;
            t[23] = n.description;
            t[24] = s;
          } else {
            s = t[24];
          }
          let i = n.status === "completed" ? "done" : undefined;
          let a = n.status === "completed" && !n.notified ? ", unread" : undefined;
          let l;
          if (t[25] !== i || t[26] !== a || t[27] !== n.status) {
            l = eC.jsx(cCe, {
              status: n.status,
              label: i,
              suffix: a
            });
            t[25] = i;
            t[26] = a;
            t[27] = n.status;
            t[28] = l;
          } else {
            l = t[28];
          }
          let c;
          if (t[29] !== s || t[30] !== l) {
            c = eC.jsxs(Text, {
              children: [s, " ", l]
            });
            t[29] = s;
            t[30] = l;
            t[31] = c;
          } else {
            c = t[31];
          }
          return c;
        }
      case "in_process_teammate":
        {
          let s;
          let i;
          let a;
          let l;
          let c;
          let u;
          if (t[32] !== o || t[33] !== n) {
            let m = Zwt(n);
            i = Text;
            let f;
            if (t[40] !== n.identity.color) {
              f = Gz(n.identity.color);
              t[40] = n.identity.color;
              t[41] = f;
            } else {
              f = t[41];
            }
            if (t[42] !== f || t[43] !== n.identity.agentName) {
              u = eC.jsxs(Text, {
                color: f,
                children: ["@", n.identity.agentName]
              });
              t[42] = f;
              t[43] = n.identity.agentName;
              t[44] = u;
            } else {
              u = t[44];
            }
            s = Text;
            a = true;
            l = ": ";
            c = truncate(m, o, true);
            t[32] = o;
            t[33] = n;
            t[34] = s;
            t[35] = i;
            t[36] = a;
            t[37] = l;
            t[38] = c;
            t[39] = u;
          } else {
            s = t[34];
            i = t[35];
            a = t[36];
            l = t[37];
            c = t[38];
            u = t[39];
          }
          let d;
          if (t[45] !== s || t[46] !== a || t[47] !== l || t[48] !== c) {
            d = eC.jsxs(s, {
              dimColor: a,
              children: [l, c]
            });
            t[45] = s;
            t[46] = a;
            t[47] = l;
            t[48] = c;
            t[49] = d;
          } else {
            d = t[49];
          }
          let p;
          if (t[50] !== i || t[51] !== u || t[52] !== d) {
            p = eC.jsxs(i, {
              children: [u, d]
            });
            t[50] = i;
            t[51] = u;
            t[52] = d;
            t[53] = p;
          } else {
            p = t[53];
          }
          return p;
        }
      case "local_workflow":
        {
          let s = n.workflowName ?? n.summary ?? n.description;
          let i;
          if (t[54] !== o || t[55] !== s) {
            i = truncate(s, o, true);
            t[54] = o;
            t[55] = s;
            t[56] = i;
          } else {
            i = t[56];
          }
          let a;
          if (t[57] !== n.agentCount || t[58] !== n.status) {
            a = n.status === "running" ? `${n.agentCount} ${un(n.agentCount, "agent")}` : n.status === "completed" ? "done" : undefined;
            t[57] = n.agentCount;
            t[58] = n.status;
            t[59] = a;
          } else {
            a = t[59];
          }
          let l = n.status === "completed" && !n.notified ? ", unread" : undefined;
          let c;
          if (t[60] !== a || t[61] !== l || t[62] !== n.status) {
            c = eC.jsx(cCe, {
              status: n.status,
              label: a,
              suffix: l
            });
            t[60] = a;
            t[61] = l;
            t[62] = n.status;
            t[63] = c;
          } else {
            c = t[63];
          }
          let u;
          if (t[64] !== i || t[65] !== c) {
            u = eC.jsxs(Text, {
              children: [i, " ", c]
            });
            t[64] = i;
            t[65] = c;
            t[66] = u;
          } else {
            u = t[66];
          }
          return u;
        }
      case "mcp_task":
        {
          let s;
          if (t[67] !== n.mcpTaskId) {
            s = n.mcpTaskId.slice(0, 8);
            t[67] = n.mcpTaskId;
            t[68] = s;
          } else {
            s = t[68];
          }
          let i = s;
          let a;
          if (t[69] === Symbol.for("react.memo_cache_sentinel")) {
            a = eC.jsx(Text, {
              dimColor: true,
              children: "\u23F3 "
            });
            t[69] = a;
          } else {
            a = t[69];
          }
          let l = `${n.serverName}/${n.toolName}`;
          let c;
          if (t[70] !== o || t[71] !== l) {
            c = truncate(l, o, true);
            t[70] = o;
            t[71] = l;
            t[72] = c;
          } else {
            c = t[72];
          }
          let u;
          if (t[73] !== i || t[74] !== n.mcpStatus) {
            u = eC.jsxs(Text, {
              dimColor: true,
              children: [" ", "\xB7 ", i, " \xB7 ", n.mcpStatus]
            });
            t[73] = i;
            t[74] = n.mcpStatus;
            t[75] = u;
          } else {
            u = t[75];
          }
          let d;
          if (t[76] !== n.statusMessage) {
            d = n.statusMessage ? eC.jsxs(Text, {
              dimColor: true,
              children: [" ", n.statusMessage]
            }) : null;
            t[76] = n.statusMessage;
            t[77] = d;
          } else {
            d = t[77];
          }
          let p;
          if (t[78] !== c || t[79] !== u || t[80] !== d) {
            p = eC.jsxs(Text, {
              children: [a, c, u, d]
            });
            t[78] = c;
            t[79] = u;
            t[80] = d;
            t[81] = p;
          } else {
            p = t[81];
          }
          return p;
        }
      case "monitor_mcp":
      case "monitor_ws":
        {
          let s;
          if (t[82] !== o || t[83] !== n.description) {
            s = truncate(n.description, o, true);
            t[82] = o;
            t[83] = n.description;
            t[84] = s;
          } else {
            s = t[84];
          }
          let i = n.status === "completed" ? "done" : undefined;
          let a = n.status === "completed" && !n.notified ? ", unread" : undefined;
          let l;
          if (t[85] !== i || t[86] !== a || t[87] !== n.status) {
            l = eC.jsx(cCe, {
              status: n.status,
              label: i,
              suffix: a
            });
            t[85] = i;
            t[86] = a;
            t[87] = n.status;
            t[88] = l;
          } else {
            l = t[88];
          }
          let c;
          if (t[89] !== s || t[90] !== l) {
            c = eC.jsxs(Text, {
              children: [s, " ", l]
            });
            t[89] = s;
            t[90] = l;
            t[91] = c;
          } else {
            c = t[91];
          }
          return c;
        }
      case "dream":
        {
          let s = n.filesTouched.length;
          let i;
          if (t[92] !== s || t[93] !== n.phase || t[94] !== n.sessionsReviewing) {
            i = n.phase === "updating" && s > 0 ? `${s} ${un(s, "file")}` : `${n.sessionsReviewing} ${un(n.sessionsReviewing, "session")}`;
            t[92] = s;
            t[93] = n.phase;
            t[94] = n.sessionsReviewing;
            t[95] = i;
          } else {
            i = t[95];
          }
          let a = i;
          let l;
          if (t[96] !== a || t[97] !== n.phase) {
            l = eC.jsxs(Text, {
              dimColor: true,
              children: ["\xB7 ", n.phase, " \xB7 ", a]
            });
            t[96] = a;
            t[97] = n.phase;
            t[98] = l;
          } else {
            l = t[98];
          }
          let c = n.status === "completed" ? "done" : undefined;
          let u = n.status === "completed" && !n.notified ? ", unread" : undefined;
          let d;
          if (t[99] !== c || t[100] !== u || t[101] !== n.status) {
            d = eC.jsx(cCe, {
              status: n.status,
              label: c,
              suffix: u
            });
            t[99] = c;
            t[100] = u;
            t[101] = n.status;
            t[102] = d;
          } else {
            d = t[102];
          }
          let p;
          if (t[103] !== l || t[104] !== d || t[105] !== n.description) {
            p = eC.jsxs(Text, {
              children: [n.description, " ", l, " ", d]
            });
            t[103] = l;
            t[104] = d;
            t[105] = n.description;
            t[106] = p;
          } else {
            p = t[106];
          }
          return p;
        }
    }
  }
  var UZl;
  var eC;
  var $Zl = __lazy(() => {
    et();
    cs();
    wKe();
    Zn();
    wl();
    m9o();
    FZl();
    lCe();
    UZl = __toESM(pt(), 1);
    eC = __toESM(ie(), 1);
  });
  function jZl(e) {
    let t = HZl.c(75);
    let {
      task: n,
      onDone: r,
      onBack: o,
      onKill: s
    } = e;
    let i = iZ(n.startTime, n.status === "running", 1000, 0, n.endTime);
    let a;
    if (t[0] !== r) {
      a = {
        "confirm:yes": r
      };
      t[0] = r;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = {
        context: "Confirmation"
      };
      t[2] = l;
    } else {
      l = t[2];
    }
    jo(a, l);
    let c;
    if (t[3] !== o || t[4] !== r || t[5] !== s || t[6] !== n.status) {
      c = P => {
        if (P.key === " ") {
          P.preventDefault();
          r();
        } else if (P.key === "left" && o) {
          P.preventDefault();
          o();
        } else if (P.key === "x" && !P.ctrl && !P.meta && n.status === "running" && s) {
          P.preventDefault();
          s();
        }
      };
      t[3] = o;
      t[4] = r;
      t[5] = s;
      t[6] = n.status;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u = c;
    let d;
    let p;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    let C;
    let x;
    let A;
    let k;
    let I;
    if (t[8] !== i || t[9] !== u || t[10] !== o || t[11] !== r || t[12] !== s || t[13] !== n.filesTouched.length || t[14] !== n.sessionsReviewing || t[15] !== n.status || t[16] !== n.turns) {
      let P = n.turns.filter(iZm);
      let F = P.slice(-6);
      let H = P.length - F.length;
      m = gXd;
      y = "column";
      _ = 0;
      b = true;
      S = u;
      p = or;
      k = "Memory consolidation";
      let U = n.sessionsReviewing;
      let N;
      if (t[33] !== n.sessionsReviewing) {
        N = un(n.sessionsReviewing, "session");
        t[33] = n.sessionsReviewing;
        t[34] = N;
      } else {
        N = t[34];
      }
      let W;
      if (t[35] !== n.filesTouched.length) {
        W = n.filesTouched.length > 0 && _R.jsxs(_R.Fragment, {
          children: [" ", "\xB7 ", n.filesTouched.length, " ", un(n.filesTouched.length, "file"), " touched"]
        });
        t[35] = n.filesTouched.length;
        t[36] = W;
      } else {
        W = t[36];
      }
      if (t[37] !== i || t[38] !== N || t[39] !== W || t[40] !== n.sessionsReviewing) {
        I = _R.jsxs(Text, {
          dimColor: true,
          children: [i, " \xB7 reviewing ", U, " ", N, W]
        });
        t[37] = i;
        t[38] = N;
        t[39] = W;
        t[40] = n.sessionsReviewing;
        t[41] = I;
      } else {
        I = t[41];
      }
      f = r;
      h = "background";
      let j;
      if (t[42] !== o) {
        j = o && _R.jsx(xt, {
          chord: "left",
          action: "go back"
        });
        t[42] = o;
        t[43] = j;
      } else {
        j = t[43];
      }
      let z;
      if (t[44] === Symbol.for("react.memo_cache_sentinel")) {
        z = _R.jsx(xt, {
          chord: ["escape", "enter", "space"],
          action: "close"
        });
        t[44] = z;
      } else {
        z = t[44];
      }
      let V;
      if (t[45] !== s || t[46] !== n.status) {
        V = n.status === "running" && s && _R.jsx(xt, {
          chord: "x",
          action: "stop"
        });
        t[45] = s;
        t[46] = n.status;
        t[47] = V;
      } else {
        V = t[47];
      }
      if (t[48] !== j || t[49] !== V) {
        g = _R.jsxs(Hn, {
          children: [j, z, V]
        });
        t[48] = j;
        t[49] = V;
        t[50] = g;
      } else {
        g = t[50];
      }
      d = gXd;
      E = "column";
      C = 1;
      let K;
      if (t[51] === Symbol.for("react.memo_cache_sentinel")) {
        K = _R.jsx(Text, {
          bold: true,
          children: "Status:"
        });
        t[51] = K;
      } else {
        K = t[51];
      }
      if (t[52] !== n.status) {
        x = _R.jsxs(Text, {
          children: [K, " ", n.status === "running" ? _R.jsx(Text, {
            color: "background",
            children: "running"
          }) : n.status === "completed" ? _R.jsx(Text, {
            color: "success",
            children: n.status
          }) : _R.jsx(Text, {
            color: "error",
            children: n.status
          })]
        });
        t[52] = n.status;
        t[53] = x;
      } else {
        x = t[53];
      }
      A = F.length === 0 ? _R.jsx(Text, {
        dimColor: true,
        children: n.status === "running" ? "Starting\u2026" : "(no text output)"
      }) : _R.jsxs(_R.Fragment, {
        children: [H > 0 && _R.jsxs(Text, {
          dimColor: true,
          children: ["(", H, " earlier ", un(H, "turn"), ")"]
        }), F.map(sZm)]
      });
      t[8] = i;
      t[9] = u;
      t[10] = o;
      t[11] = r;
      t[12] = s;
      t[13] = n.filesTouched.length;
      t[14] = n.sessionsReviewing;
      t[15] = n.status;
      t[16] = n.turns;
      t[17] = d;
      t[18] = p;
      t[19] = m;
      t[20] = f;
      t[21] = h;
      t[22] = g;
      t[23] = y;
      t[24] = _;
      t[25] = b;
      t[26] = S;
      t[27] = E;
      t[28] = C;
      t[29] = x;
      t[30] = A;
      t[31] = k;
      t[32] = I;
    } else {
      d = t[17];
      p = t[18];
      m = t[19];
      f = t[20];
      h = t[21];
      g = t[22];
      y = t[23];
      _ = t[24];
      b = t[25];
      S = t[26];
      E = t[27];
      C = t[28];
      x = t[29];
      A = t[30];
      k = t[31];
      I = t[32];
    }
    let O;
    if (t[54] !== d || t[55] !== E || t[56] !== C || t[57] !== x || t[58] !== A) {
      O = _R.jsxs(d, {
        flexDirection: E,
        gap: C,
        children: [x, A]
      });
      t[54] = d;
      t[55] = E;
      t[56] = C;
      t[57] = x;
      t[58] = A;
      t[59] = O;
    } else {
      O = t[59];
    }
    let M;
    if (t[60] !== p || t[61] !== f || t[62] !== h || t[63] !== g || t[64] !== O || t[65] !== k || t[66] !== I) {
      M = _R.jsx(p, {
        title: k,
        subtitle: I,
        onCancel: f,
        color: h,
        inputGuide: g,
        children: O
      });
      t[60] = p;
      t[61] = f;
      t[62] = h;
      t[63] = g;
      t[64] = O;
      t[65] = k;
      t[66] = I;
      t[67] = M;
    } else {
      M = t[67];
    }
    let L;
    if (t[68] !== m || t[69] !== y || t[70] !== _ || t[71] !== b || t[72] !== S || t[73] !== M) {
      L = _R.jsx(m, {
        flexDirection: y,
        tabIndex: _,
        autoFocus: b,
        onKeyDown: S,
        children: M
      });
      t[68] = m;
      t[69] = y;
      t[70] = _;
      t[71] = b;
      t[72] = S;
      t[73] = M;
      t[74] = L;
    } else {
      L = t[74];
    }
    return L;
  }
  function sZm(e, t) {
    return _R.jsxs(gXd, {
      flexDirection: "column",
      children: [_R.jsx(Text, {
        wrap: "wrap",
        children: e.text
      }), e.toolUseCount > 0 && _R.jsxs(Text, {
        dimColor: true,
        children: ["  ", "(", e.toolUseCount, " ", un(e.toolUseCount, "tool"), ")"]
      })]
    }, t);
  }
  function iZm(e) {
    return e.text !== "";
  }
  var HZl;
  var _R;
  var qZl = __lazy(() => {
    WSt();
    et();
    Bs();
    Zn();
    Ai();
    Ii();
    bs();
    HZl = __toESM(pt(), 1);
    _R = __toESM(ie(), 1);
  });
  function GZl(e) {
    let t = WZl.c(71);
    let {
      teammate: n,
      onDone: r,
      onKill: o,
      onBack: s,
      onForeground: i
    } = e;
    let [a] = useTheme();
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = fH(tq());
      t[0] = l;
    } else {
      l = t[0];
    }
    let c = l;
    let u = iZ(n.startTime, n.status === "running", 1000, n.totalPausedMs ?? 0, n.endTime);
    let d;
    if (t[1] !== r) {
      d = {
        "confirm:yes": r
      };
      t[1] = r;
      t[2] = d;
    } else {
      d = t[2];
    }
    let p;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        context: "Confirmation"
      };
      t[3] = p;
    } else {
      p = t[3];
    }
    jo(d, p);
    let m;
    if (t[4] !== s || t[5] !== r || t[6] !== i || t[7] !== o || t[8] !== n.status) {
      m = ne => {
        if (ne.key === " ") {
          ne.preventDefault();
          r();
        } else if (ne.key === "left" && s) {
          ne.preventDefault();
          s();
        } else if (ne.key === "x" && !ne.ctrl && !ne.meta && n.status === "running" && o) {
          ne.preventDefault();
          o();
        } else if (ne.key === "f" && !ne.ctrl && !ne.meta && n.status === "running" && i) {
          ne.preventDefault();
          i();
        }
      };
      t[4] = s;
      t[5] = r;
      t[6] = i;
      t[7] = o;
      t[8] = n.status;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f = m;
    let h;
    if (t[10] !== n) {
      h = Zwt(n);
      t[10] = n;
      t[11] = h;
    } else {
      h = t[11];
    }
    let g = h;
    let y = n.result?.totalTokens ?? n.progress?.tokenCount;
    let _ = n.result?.totalToolUseCount ?? n.progress?.toolUseCount;
    let b;
    if (t[12] !== n.prompt) {
      b = truncateToWidth(n.prompt, 300);
      t[12] = n.prompt;
      t[13] = b;
    } else {
      b = t[13];
    }
    let S = b;
    let E;
    if (t[14] !== n.identity.color) {
      E = Gz(n.identity.color);
      t[14] = n.identity.color;
      t[15] = E;
    } else {
      E = t[15];
    }
    let C;
    if (t[16] !== E || t[17] !== n.identity.agentName) {
      C = xT.jsxs(Text, {
        color: E,
        children: ["@", n.identity.agentName]
      });
      t[16] = E;
      t[17] = n.identity.agentName;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x;
    if (t[19] !== g) {
      x = g && xT.jsxs(Text, {
        dimColor: true,
        children: [" (", g, ")"]
      });
      t[19] = g;
      t[20] = x;
    } else {
      x = t[20];
    }
    let A;
    if (t[21] !== C || t[22] !== x) {
      A = xT.jsxs(Text, {
        children: [C, x]
      });
      t[21] = C;
      t[22] = x;
      t[23] = A;
    } else {
      A = t[23];
    }
    let k = A;
    let I;
    if (t[24] !== n.status) {
      I = n.status !== "running" && xT.jsxs(Text, {
        color: n.status === "completed" ? "success" : n.status === "killed" ? "warning" : "error",
        children: [n.status === "completed" ? "Completed" : n.status === "failed" ? "Failed" : "Stopped", " \xB7 "]
      });
      t[24] = n.status;
      t[25] = I;
    } else {
      I = t[25];
    }
    let O;
    if (t[26] !== y) {
      O = y !== undefined && y > 0 && xT.jsxs(xT.Fragment, {
        children: [" \xB7 ", formatNumber(y), " tokens"]
      });
      t[26] = y;
      t[27] = O;
    } else {
      O = t[27];
    }
    let M;
    if (t[28] !== _) {
      M = _ !== undefined && _ > 0 && xT.jsxs(xT.Fragment, {
        children: [" ", "\xB7 ", _, " ", _ === 1 ? "tool" : "tools"]
      });
      t[28] = _;
      t[29] = M;
    } else {
      M = t[29];
    }
    let L;
    if (t[30] !== u || t[31] !== O || t[32] !== M) {
      L = xT.jsxs(Text, {
        dimColor: true,
        children: [u, O, M]
      });
      t[30] = u;
      t[31] = O;
      t[32] = M;
      t[33] = L;
    } else {
      L = t[33];
    }
    let P;
    if (t[34] !== I || t[35] !== L) {
      P = xT.jsxs(Text, {
        children: [I, L]
      });
      t[34] = I;
      t[35] = L;
      t[36] = P;
    } else {
      P = t[36];
    }
    let F = P;
    let H;
    if (t[37] !== s) {
      H = s && xT.jsx(xt, {
        chord: "left",
        action: "go back"
      });
      t[37] = s;
      t[38] = H;
    } else {
      H = t[38];
    }
    let U;
    if (t[39] === Symbol.for("react.memo_cache_sentinel")) {
      U = xT.jsx(xt, {
        chord: ["escape", "enter", "space"],
        action: "close"
      });
      t[39] = U;
    } else {
      U = t[39];
    }
    let N;
    if (t[40] !== o || t[41] !== n.status) {
      N = n.status === "running" && o && xT.jsx(xt, {
        chord: "x",
        action: "stop"
      });
      t[40] = o;
      t[41] = n.status;
      t[42] = N;
    } else {
      N = t[42];
    }
    let W;
    if (t[43] !== i || t[44] !== n.status) {
      W = n.status === "running" && i && xT.jsx(xt, {
        chord: "f",
        action: "foreground"
      });
      t[43] = i;
      t[44] = n.status;
      t[45] = W;
    } else {
      W = t[45];
    }
    let j;
    if (t[46] !== H || t[47] !== N || t[48] !== W) {
      j = xT.jsxs(Hn, {
        children: [H, U, N, W]
      });
      t[46] = H;
      t[47] = N;
      t[48] = W;
      t[49] = j;
    } else {
      j = t[49];
    }
    let z;
    if (t[50] !== n.progress || t[51] !== n.status || t[52] !== a) {
      z = n.status === "running" && n.progress?.recentActivities && n.progress.recentActivities.length > 0 && xT.jsxs(gXd, {
        flexDirection: "column",
        children: [xT.jsx(Text, {
          bold: true,
          dimColor: true,
          children: "Progress"
        }), n.progress.recentActivities.map((ne, oe) => xT.jsxs(Text, {
          dimColor: oe < n.progress.recentActivities.length - 1,
          wrap: "truncate-end",
          children: [oe === n.progress.recentActivities.length - 1 ? "\u203A " : "  ", Ncr(ne, c, a)]
        }, oe))]
      });
      t[50] = n.progress;
      t[51] = n.status;
      t[52] = a;
      t[53] = z;
    } else {
      z = t[53];
    }
    let V;
    if (t[54] === Symbol.for("react.memo_cache_sentinel")) {
      V = xT.jsx(Text, {
        bold: true,
        dimColor: true,
        children: "Prompt"
      });
      t[54] = V;
    } else {
      V = t[54];
    }
    let K;
    if (t[55] !== S) {
      K = xT.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [V, xT.jsx(Text, {
          wrap: "wrap",
          children: S
        })]
      });
      t[55] = S;
      t[56] = K;
    } else {
      K = t[56];
    }
    let J;
    if (t[57] !== n.error || t[58] !== n.status) {
      J = n.status === "failed" && n.error && xT.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [xT.jsx(Text, {
          bold: true,
          color: "error",
          children: "Error"
        }), xT.jsx(Text, {
          color: "error",
          wrap: "wrap",
          children: n.error
        })]
      });
      t[57] = n.error;
      t[58] = n.status;
      t[59] = J;
    } else {
      J = t[59];
    }
    let Q;
    if (t[60] !== r || t[61] !== F || t[62] !== j || t[63] !== z || t[64] !== K || t[65] !== J || t[66] !== k) {
      Q = xT.jsxs(or, {
        title: k,
        subtitle: F,
        onCancel: r,
        color: "background",
        inputGuide: j,
        children: [z, K, J]
      });
      t[60] = r;
      t[61] = F;
      t[62] = j;
      t[63] = z;
      t[64] = K;
      t[65] = J;
      t[66] = k;
      t[67] = Q;
    } else {
      Q = t[67];
    }
    let Z;
    if (t[68] !== f || t[69] !== Q) {
      Z = xT.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: f,
        children: Q
      });
      t[68] = f;
      t[69] = Q;
      t[70] = Z;
    } else {
      Z = t[70];
    }
    return Z;
  }
  var WZl;
  var xT;
  var VZl = __lazy(() => {
    WSt();
    et();
    Bs();
    ci();
    jM();
    cs();
    wKe();
    Ai();
    Ii();
    bs();
    l9o();
    lCe();
    WZl = __toESM(pt(), 1);
    xT = __toESM(ie(), 1);
  });
  function Fcr(e) {
    return e.flatMap(t => {
      switch (t.type) {
        case "assistant":
          return [{
            type: "assistant",
            message: t.message,
            uuid: t.uuid,
            requestId: undefined,
            timestamp: new Date().toISOString()
          }];
        case "user":
          return [{
            type: "user",
            message: t.message,
            uuid: t.uuid ?? zZl.randomUUID(),
            timestamp: t.timestamp ?? new Date().toISOString(),
            isMeta: t.isSynthetic
          }];
        case "system":
          if (t.subtype === "compact_boundary") {
            return [{
              type: "system",
              content: "Conversation compacted",
              level: "info",
              subtype: "compact_boundary",
              compactMetadata: Ten(t.compact_metadata),
              uuid: t.uuid,
              timestamp: new Date().toISOString()
            }];
          }
          return [];
        default:
          return [];
      }
    });
  }
  function tCt(e) {
    let {
      preservedSegment: t,
      preservedMessages: n
    } = e;
    return {
      trigger: e.trigger,
      pre_tokens: e.preTokens,
      ...(e.postTokens !== undefined && {
        post_tokens: e.postTokens
      }),
      ...(e.cumulativeDroppedTokens !== undefined && {
        cumulative_dropped_tokens: e.cumulativeDroppedTokens
      }),
      ...(e.durationMs !== undefined && {
        duration_ms: e.durationMs
      }),
      ...(e.userContext !== undefined && {
        user_context: e.userContext
      }),
      ...(e.messagesSummarized !== undefined && {
        messages_summarized: e.messagesSummarized
      }),
      ...(e.precomputed !== undefined && {
        precomputed: e.precomputed
      }),
      ...(e.preCompactDiscoveredTools !== undefined && {
        pre_compact_discovered_tools: e.preCompactDiscoveredTools
      }),
      ...(t && {
        preserved_segment: {
          head_uuid: t.headUuid,
          anchor_uuid: t.anchorUuid,
          tail_uuid: t.tailUuid
        }
      }),
      ...(n && {
        preserved_messages: {
          anchor_uuid: n.anchorUuid,
          uuids: n.uuids,
          ...(n.allUuids !== undefined && {
            all_uuids: n.allUuids
          })
        }
      })
    };
  }
  function Ten(e) {
    let {
      preserved_segment: t,
      preserved_messages: n
    } = e;
    return {
      trigger: e.trigger,
      preTokens: e.pre_tokens,
      ...(e.post_tokens !== undefined && {
        postTokens: e.post_tokens
      }),
      ...(e.cumulative_dropped_tokens !== undefined && {
        cumulativeDroppedTokens: e.cumulative_dropped_tokens
      }),
      ...(e.duration_ms !== undefined && {
        durationMs: e.duration_ms
      }),
      ...(e.user_context !== undefined && {
        userContext: e.user_context
      }),
      ...(e.messages_summarized !== undefined && {
        messagesSummarized: e.messages_summarized
      }),
      ...(e.precomputed !== undefined && {
        precomputed: e.precomputed
      }),
      ...(e.pre_compact_discovered_tools !== undefined && {
        preCompactDiscoveredTools: [...e.pre_compact_discovered_tools]
      }),
      ...(t && {
        preservedSegment: {
          headUuid: t.head_uuid,
          anchorUuid: t.anchor_uuid,
          tailUuid: t.tail_uuid
        }
      }),
      ...(n && {
        preservedMessages: {
          anchorUuid: n.anchor_uuid,
          uuids: [...n.uuids],
          ...(n.all_uuids !== undefined && {
            allUuids: [...n.all_uuids]
          })
        }
      })
    };
  }
  function KZl(e, t) {
    return e.flatMap(n => {
      switch (n.type) {
        case "assistant":
          {
            let r = aZm(n);
            let o = dSt(r.content, t);
            return [{
              type: "assistant",
              message: r,
              session_id: getSessionId(),
              parent_tool_use_id: null,
              uuid: n.uuid,
              error: n.error,
              ...(n.requestId !== undefined && {
                request_id: n.requestId
              }),
              ...(o.length > 0 && {
                tool_use_meta: o
              })
            }];
          }
        case "user":
          return [{
            type: "user",
            message: n.message,
            session_id: getSessionId(),
            parent_tool_use_id: null,
            uuid: n.uuid,
            timestamp: n.timestamp,
            isSynthetic: n.isMeta || n.isVisibleInTranscriptOnly,
            ...(n.toolUseResult !== undefined && {
              tool_use_result: n.toolUseResult
            }),
            ...(n.origin !== undefined && {
              origin: n.origin
            })
          }];
        case "system":
          if (n.subtype === "compact_boundary" && n.compactMetadata) {
            return [{
              type: "system",
              subtype: "compact_boundary",
              session_id: getSessionId(),
              uuid: n.uuid,
              compact_metadata: tCt(n.compactMetadata)
            }];
          }
          if (n.subtype === "local_command" && (n.content.includes(`<${"local-command-stdout"}>`) || n.content.includes(`<${"local-command-stderr"}>`))) {
            return [Een(n.content, n.uuid)];
          }
          return [];
        default:
          return [];
      }
    });
  }
  function Een(e, t) {
    let n = Li(e).replace(/<local-command-stdout>([\s\S]*?)<\/local-command-stdout>/, "$1").replace(/<local-command-stderr>([\s\S]*?)<\/local-command-stderr>/, "$1").trim();
    return {
      type: "assistant",
      message: ST({
        content: n
      }).message,
      parent_tool_use_id: null,
      session_id: getSessionId(),
      uuid: t
    };
  }
  function YZl(e, {
    includeOverageInUse: t = true
  } = {}) {
    if (!e) {
      return;
    }
    return {
      status: e.status,
      ...(e.resetsAt !== undefined && {
        resetsAt: e.resetsAt
      }),
      ...(e.rateLimitType !== undefined && {
        rateLimitType: e.rateLimitType
      }),
      ...(e.utilization !== undefined && {
        utilization: e.utilization
      }),
      ...(e.overageStatus !== undefined && {
        overageStatus: e.overageStatus
      }),
      ...(e.overageResetsAt !== undefined && {
        overageResetsAt: e.overageResetsAt
      }),
      ...(e.overageDisabledReason !== undefined && {
        overageDisabledReason: e.overageDisabledReason === "org_spend_cap_reached" ? "org_level_disabled_until" : e.overageDisabledReason
      }),
      ...(e.isUsingOverage !== undefined && {
        isUsingOverage: e.isUsingOverage
      }),
      ...(e.overageInUse !== undefined && t && {
        overageInUse: e.overageInUse
      }),
      ...(e.surpassedThreshold !== undefined && {
        surpassedThreshold: e.surpassedThreshold
      }),
      ...(e.overagePeriodMonthly !== undefined && {
        overagePeriodMonthly: e.overagePeriodMonthly
      }),
      ...(e.overagePeriodChannel !== undefined && {
        overagePeriodChannel: e.overagePeriodChannel
      }),
      ...(e.errorCode !== undefined && {
        errorCode: e.errorCode
      }),
      ...(e.canUserPurchaseCredits !== undefined && {
        canUserPurchaseCredits: e.canUserPurchaseCredits
      }),
      ...(e.hasChargeableSavedPaymentMethod !== undefined && {
        hasChargeableSavedPaymentMethod: e.hasChargeableSavedPaymentMethod
      })
    };
  }
  function aZm(e) {
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return e.message;
    }
    let n = t.map(r => {
      if (r.type !== "tool_use") {
        return r;
      }
      if (r.name === "ExitPlanMode") {
        let o = getPlan();
        if (o) {
          return {
            ...r,
            input: {
              ...r.input,
              plan: o
            }
          };
        }
      }
      return r;
    });
    return {
      ...e.message,
      content: n
    };
  }
  var zZl;
  var VUe = __lazy(() => {
    at();
    np();
    ro();
    xx();
    cDo();
    zZl = require("crypto");
  });
  function h9o(e, t, n) {
    if (e === "ExitPlanMode") {
      return "Review the plan in Claude Code on the web";
    }
    if (!t || typeof t !== "object") {
      return e;
    }
    if (e === "AskUserQuestion" && "questions" in t) {
      let r = t.questions;
      if (Array.isArray(r) && r[0] && typeof r[0] === "object") {
        let o = "question" in r[0] && typeof r[0].question === "string" && r[0].question ? r[0].question : "header" in r[0] && typeof r[0].header === "string" ? r[0].header : null;
        if (o) {
          let s = o.replace(/\s+/g, " ").trim();
          return `Answer in browser: ${truncateToWidth(s, n - 10)}`;
        }
      }
    }
    for (let r of Object.values(t)) {
      if (typeof r === "string" && r.trim()) {
        let o = r.replace(/\s+/g, " ").trim();
        return `${e} ${truncateToWidth(o, n)}`;
      }
    }
    return e;
  }
  function uZm(e) {
    let t = Ucr.c(78);
    let {
      session: n,
      onDone: r,
      onBack: o,
      onKill: s
    } = e;
    let i = n.status === "running" || n.status === "pending";
    let a = n.ultraplanPhase;
    let l = i ? a ? lZm[a] : "running" : n.status;
    let c = iZ(n.startTime, i, 1000, 0, n.endTime);
    let u = 0;
    let d = 0;
    let p = null;
    for (let ae of n.log) {
      if (ae.type !== "assistant") {
        continue;
      }
      for (let de of ae.message.content) {
        if (de.type !== "tool_use") {
          continue;
        }
        if (d++, p = de, de.name === "Agent" || de.name === "Task") {
          u++;
        }
      }
    }
    let m = 1 + u;
    let f;
    if (t[0] !== p) {
      f = p ? h9o(p.name, p.input, 60) : null;
      t[0] = p;
      t[1] = f;
    } else {
      f = t[1];
    }
    let h;
    if (t[2] !== d || t[3] !== m || t[4] !== f) {
      h = {
        agentsWorking: m,
        toolCalls: d,
        lastToolCall: f
      };
      t[2] = d;
      t[3] = m;
      t[4] = f;
      t[5] = h;
    } else {
      h = t[5];
    }
    let {
      agentsWorking: g,
      toolCalls: y,
      lastToolCall: _
    } = h;
    let b;
    if (t[6] !== n.sessionId) {
      b = Mme(n.sessionId);
      t[6] = n.sessionId;
      t[7] = b;
    } else {
      b = t[7];
    }
    let S = b;
    let E;
    if (t[8] !== o || t[9] !== r) {
      E = o ?? (() => r("Cloud session details dismissed", {
        display: "system"
      }));
      t[8] = o;
      t[9] = r;
      t[10] = E;
    } else {
      E = t[10];
    }
    let C = E;
    let [x, A] = JYe.useState(false);
    if (x) {
      let ae;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        ae = () => A(false);
        t[11] = ae;
      } else {
        ae = t[11];
      }
      let de;
      if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
        de = ba.jsx(Text, {
          dimColor: true,
          children: "This will terminate the Claude Code on the web session."
        });
        t[12] = de;
      } else {
        de = t[12];
      }
      let be = a === "plan_ready" ? "Terminate session and discard plan" : "Terminate session";
      let fe;
      if (t[13] !== C || t[14] !== s) {
        fe = () => {
          s?.();
          C();
        };
        t[13] = C;
        t[14] = s;
        t[15] = fe;
      } else {
        fe = t[15];
      }
      let me;
      if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
        me = () => A(false);
        t[16] = me;
      } else {
        me = t[16];
      }
      let Te;
      if (t[17] !== be || t[18] !== fe) {
        Te = ba.jsx(or, {
          title: "Stop ultraplan?",
          onCancel: ae,
          color: "background",
          children: ba.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [de, ba.jsx(mc, {
              confirmLabel: be,
              cancelLabel: "Back",
              onConfirm: fe,
              onCancel: me
            })]
          })
        });
        t[17] = be;
        t[18] = fe;
        t[19] = Te;
      } else {
        Te = t[19];
      }
      return Te;
    }
    let k = a === "plan_ready" ? "\u25C6" : "\u25C7";
    let I;
    if (t[20] !== k) {
      I = ba.jsxs(Text, {
        color: "background",
        children: [k, " "]
      });
      t[20] = k;
      t[21] = I;
    } else {
      I = t[21];
    }
    let O;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      O = ba.jsx(Text, {
        bold: true,
        children: "ultraplan"
      });
      t[22] = O;
    } else {
      O = t[22];
    }
    let M;
    if (t[23] !== c || t[24] !== l) {
      M = ba.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", c, " \xB7 ", l]
      });
      t[23] = c;
      t[24] = l;
      t[25] = M;
    } else {
      M = t[25];
    }
    let L;
    if (t[26] !== I || t[27] !== M) {
      L = ba.jsxs(Text, {
        children: [I, O, M]
      });
      t[26] = I;
      t[27] = M;
      t[28] = L;
    } else {
      L = t[28];
    }
    let P;
    if (t[29] !== a) {
      P = a === "plan_ready" && ba.jsxs(Text, {
        color: "success",
        children: [vGd.tick, " "]
      });
      t[29] = a;
      t[30] = P;
    } else {
      P = t[30];
    }
    let F;
    if (t[31] !== g) {
      F = un(g, "agent");
      t[31] = g;
      t[32] = F;
    } else {
      F = t[32];
    }
    let H = a ? cZm[a] : "working";
    let U;
    if (t[33] !== y) {
      U = un(y, "call");
      t[33] = y;
      t[34] = U;
    } else {
      U = t[34];
    }
    let N;
    if (t[35] !== g || t[36] !== P || t[37] !== F || t[38] !== H || t[39] !== U || t[40] !== y) {
      N = ba.jsxs(Text, {
        children: [P, g, " ", F, " ", H, " \xB7 ", y, " tool", " ", U]
      });
      t[35] = g;
      t[36] = P;
      t[37] = F;
      t[38] = H;
      t[39] = U;
      t[40] = y;
      t[41] = N;
    } else {
      N = t[41];
    }
    let W;
    if (t[42] !== _) {
      W = _ && ba.jsx(Text, {
        dimColor: true,
        children: _
      });
      t[42] = _;
      t[43] = W;
    } else {
      W = t[43];
    }
    let j;
    if (t[44] !== S) {
      j = ba.jsx(Text, {
        dimColor: true,
        children: S
      });
      t[44] = S;
      t[45] = j;
    } else {
      j = t[45];
    }
    let z;
    if (t[46] !== S || t[47] !== j) {
      z = ba.jsx(Link, {
        url: S,
        children: j
      });
      t[46] = S;
      t[47] = j;
      t[48] = z;
    } else {
      z = t[48];
    }
    let V = a === "plan_ready" ? "Review in Claude Code on the web" : a === "needs_input" ? "Answer in Claude Code on the web" : "Open in Claude Code on the web";
    let K;
    if (t[49] !== a) {
      K = a === "plan_ready" && {
        description: "Approve, edit, or comment on the plan"
      };
      t[49] = a;
      t[50] = K;
    } else {
      K = t[50];
    }
    let J;
    if (t[51] !== V || t[52] !== K) {
      J = {
        label: V,
        value: "open",
        ...K
      };
      t[51] = V;
      t[52] = K;
      t[53] = J;
    } else {
      J = t[53];
    }
    let Q;
    if (t[54] !== s || t[55] !== a || t[56] !== i) {
      Q = s && i ? [{
        label: "Stop ultraplan",
        value: "stop",
        ...(a === "plan_ready" && {
          description: "Discard the generated plan"
        })
      }] : [];
      t[54] = s;
      t[55] = a;
      t[56] = i;
      t[57] = Q;
    } else {
      Q = t[57];
    }
    let Z;
    if (t[58] === Symbol.for("react.memo_cache_sentinel")) {
      Z = {
        label: "Back",
        value: "back"
      };
      t[58] = Z;
    } else {
      Z = t[58];
    }
    let ne;
    if (t[59] !== J || t[60] !== Q) {
      ne = [J, ...Q, Z];
      t[59] = J;
      t[60] = Q;
      t[61] = ne;
    } else {
      ne = t[61];
    }
    let oe;
    if (t[62] !== C || t[63] !== r || t[64] !== S) {
      oe = ae => {
        switch (ae) {
          case "open":
            {
              Ac(S);
              r();
              return;
            }
          case "stop":
            {
              A(true);
              return;
            }
          case "back":
            {
              C();
              return;
            }
        }
      };
      t[62] = C;
      t[63] = r;
      t[64] = S;
      t[65] = oe;
    } else {
      oe = t[65];
    }
    let ee;
    if (t[66] !== ne || t[67] !== oe) {
      ee = ba.jsx(xr, {
        options: ne,
        onChange: oe
      });
      t[66] = ne;
      t[67] = oe;
      t[68] = ee;
    } else {
      ee = t[68];
    }
    let re;
    if (t[69] !== N || t[70] !== W || t[71] !== z || t[72] !== ee) {
      re = ba.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [N, W, z, ee]
      });
      t[69] = N;
      t[70] = W;
      t[71] = z;
      t[72] = ee;
      t[73] = re;
    } else {
      re = t[73];
    }
    let se;
    if (t[74] !== C || t[75] !== L || t[76] !== re) {
      se = ba.jsx(or, {
        title: L,
        onCancel: C,
        color: "background",
        children: re
      });
      t[74] = C;
      t[75] = L;
      t[76] = re;
      t[77] = se;
    } else {
      se = t[77];
    }
    return se;
  }
  function dZm(e) {
    let t = Ucr.c(15);
    let {
      stage: n,
      completed: r,
      hasProgress: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = n ? JZl.indexOf(n) : -1;
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a = !r && !o;
    let l;
    if (t[2] !== a) {
      l = a ? ba.jsx(Text, {
        color: "background",
        children: "Setup"
      }) : ba.jsx(Text, {
        dimColor: true,
        children: "Setup"
      });
      t[2] = a;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      c = ba.jsx(Text, {
        dimColor: true,
        children: " \u2192 "
      });
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== r || t[6] !== i || t[7] !== a) {
      u = JZl.map((m, f) => {
        let h = !r && !a && f === i;
        return ba.jsxs(QZl.Fragment, {
          children: [f > 0 && ba.jsx(Text, {
            dimColor: true,
            children: " \u2192 "
          }), h ? ba.jsx(Text, {
            color: "background",
            children: XZl[m]
          }) : ba.jsx(Text, {
            dimColor: true,
            children: XZl[m]
          })]
        }, m);
      });
      t[5] = r;
      t[6] = i;
      t[7] = a;
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] !== r) {
      d = r && ba.jsxs(Text, {
        children: [" ", ba.jsx(Ps, {
          status: "success"
        })]
      });
      t[9] = r;
      t[10] = d;
    } else {
      d = t[10];
    }
    let p;
    if (t[11] !== l || t[12] !== u || t[13] !== d) {
      p = ba.jsxs(Text, {
        children: [l, c, u, d]
      });
      t[11] = l;
      t[12] = u;
      t[13] = d;
      t[14] = p;
    } else {
      p = t[14];
    }
    return p;
  }
  function pZm(e) {
    let t = e.reviewProgress;
    if (!t) {
      return e.status === "completed" ? "done" : "setting up";
    }
    let n = t.bugsVerified;
    let r = t.bugsRefuted ?? 0;
    if (e.status === "completed") {
      let o = [`${n} ${un(n, "finding")}`];
      if (r > 0) {
        o.push(`${r} refuted`);
      }
      return o.join(" \xB7 ");
    }
    return p9o(t.stage, t.bugsFound, n, r);
  }
  function mZm(e) {
    let t = Ucr.c(57);
    let {
      session: n,
      onDone: r,
      onBack: o,
      onKill: s
    } = e;
    let i = n.status === "completed";
    let a = n.status === "running" || n.status === "pending";
    let [l, c] = JYe.useState(false);
    let u = iZ(n.startTime, a, 1000, 0, n.endTime);
    let d;
    if (t[0] !== r) {
      d = () => r("Cloud session details dismissed", {
        display: "system"
      });
      t[0] = r;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p = d;
    let m = o ?? p;
    let f;
    if (t[2] !== n.sessionId) {
      f = Mme(n.sessionId);
      t[2] = n.sessionId;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h = f;
    let g = i ? "ready" : a ? "running" : n.status;
    if (l) {
      let V;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        V = () => c(false);
        t[4] = V;
      } else {
        V = t[4];
      }
      let K;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        K = ba.jsx(Text, {
          dimColor: true,
          children: "This archives the cloud session and stops local tracking. The review will not complete and any findings so far are discarded."
        });
        t[5] = K;
      } else {
        K = t[5];
      }
      let J;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        J = {
          label: "Stop ultrareview",
          value: "stop"
        };
        t[6] = J;
      } else {
        J = t[6];
      }
      let Q;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        Q = [J, {
          label: "Back",
          value: "back"
        }];
        t[7] = Q;
      } else {
        Q = t[7];
      }
      let Z;
      if (t[8] !== m || t[9] !== s) {
        Z = ba.jsx(or, {
          title: "Stop ultrareview?",
          onCancel: V,
          color: "background",
          children: ba.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [K, ba.jsx(xr, {
              options: Q,
              onChange: ne => {
                if (ne === "stop") {
                  s?.();
                  m();
                } else {
                  c(false);
                }
              }
            })]
          })
        });
        t[8] = m;
        t[9] = s;
        t[10] = Z;
      } else {
        Z = t[10];
      }
      return Z;
    }
    let y;
    if (t[11] !== i || t[12] !== s || t[13] !== a) {
      y = i ? [{
        label: "Open in Claude Code on the web",
        value: "open"
      }, {
        label: "Dismiss",
        value: "dismiss"
      }] : [{
        label: "Open in Claude Code on the web",
        value: "open"
      }, ...(s && a ? [{
        label: "Stop ultrareview",
        value: "stop"
      }] : []), {
        label: "Back",
        value: "back"
      }];
      t[11] = i;
      t[12] = s;
      t[13] = a;
      t[14] = y;
    } else {
      y = t[14];
    }
    let _ = y;
    let b;
    if (t[15] !== m || t[16] !== p || t[17] !== r || t[18] !== h) {
      b = V => {
        e: switch (V) {
          case "open":
            {
              Ac(h);
              r();
              break e;
            }
          case "stop":
            {
              c(true);
              break e;
            }
          case "back":
            {
              m();
              break e;
            }
          case "dismiss":
            p();
        }
      };
      t[15] = m;
      t[16] = p;
      t[17] = r;
      t[18] = h;
      t[19] = b;
    } else {
      b = t[19];
    }
    let S = b;
    let E = i ? "\u25C6" : "\u25C7";
    let C;
    if (t[20] !== E) {
      C = ba.jsxs(Text, {
        color: "background",
        children: [E, " "]
      });
      t[20] = E;
      t[21] = C;
    } else {
      C = t[21];
    }
    let x;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      x = ba.jsx(Text, {
        bold: true,
        children: "ultrareview"
      });
      t[22] = x;
    } else {
      x = t[22];
    }
    let A;
    if (t[23] !== u || t[24] !== g) {
      A = ba.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", u, " \xB7 ", g]
      });
      t[23] = u;
      t[24] = g;
      t[25] = A;
    } else {
      A = t[25];
    }
    let k;
    if (t[26] !== C || t[27] !== A) {
      k = ba.jsxs(Text, {
        children: [C, x, A]
      });
      t[26] = C;
      t[27] = A;
      t[28] = k;
    } else {
      k = t[28];
    }
    let I;
    if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
      I = ba.jsxs(Hn, {
        children: [ba.jsx(xt, {
          chord: "enter",
          action: "select"
        }), ba.jsx(xt, {
          chord: "escape",
          action: "go back"
        })]
      });
      t[29] = I;
    } else {
      I = t[29];
    }
    let O = n.reviewProgress?.stage;
    let M = !!n.reviewProgress;
    let L;
    if (t[30] !== i || t[31] !== O || t[32] !== M) {
      L = ba.jsx(dZm, {
        stage: O,
        completed: i,
        hasProgress: M
      });
      t[30] = i;
      t[31] = O;
      t[32] = M;
      t[33] = L;
    } else {
      L = t[33];
    }
    let P;
    if (t[34] !== n) {
      P = pZm(n);
      t[34] = n;
      t[35] = P;
    } else {
      P = t[35];
    }
    let F;
    if (t[36] !== P) {
      F = ba.jsx(Text, {
        children: P
      });
      t[36] = P;
      t[37] = F;
    } else {
      F = t[37];
    }
    let H;
    if (t[38] !== h) {
      H = ba.jsx(Text, {
        dimColor: true,
        children: h
      });
      t[38] = h;
      t[39] = H;
    } else {
      H = t[39];
    }
    let U;
    if (t[40] !== h || t[41] !== H) {
      U = ba.jsx(Link, {
        url: h,
        children: H
      });
      t[40] = h;
      t[41] = H;
      t[42] = U;
    } else {
      U = t[42];
    }
    let N;
    if (t[43] !== F || t[44] !== U) {
      N = ba.jsxs(gXd, {
        flexDirection: "column",
        children: [F, U]
      });
      t[43] = F;
      t[44] = U;
      t[45] = N;
    } else {
      N = t[45];
    }
    let W;
    if (t[46] !== S || t[47] !== _) {
      W = ba.jsx(xr, {
        options: _,
        onChange: S
      });
      t[46] = S;
      t[47] = _;
      t[48] = W;
    } else {
      W = t[48];
    }
    let j;
    if (t[49] !== L || t[50] !== N || t[51] !== W) {
      j = ba.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [L, N, W]
      });
      t[49] = L;
      t[50] = N;
      t[51] = W;
      t[52] = j;
    } else {
      j = t[52];
    }
    let z;
    if (t[53] !== m || t[54] !== j || t[55] !== k) {
      z = ba.jsx(or, {
        title: k,
        onCancel: m,
        color: "background",
        inputGuide: I,
        children: j
      });
      t[53] = m;
      t[54] = j;
      t[55] = k;
      t[56] = z;
    } else {
      z = t[56];
    }
    return z;
  }
  function ZZl({
    session: e,
    toolUseContext: t,
    onDone: n,
    onBack: r,
    onKill: o
  }) {
    let [s, i] = JYe.useState(false);
    let [a, l] = JYe.useState(null);
    let c = JYe.useMemo(() => {
      if (e.isUltraplan || e.isRemoteReview) {
        return [];
      }
      return xS(Fcr(e.log)).filter(y => y.type !== "progress").slice(-3);
    }, [e]);
    let u = e.status === "running" || e.status === "pending";
    let d = iZ(e.startTime, u, 1000, 0, e.endTime);
    if (e.isUltraplan) {
      return ba.jsx(uZm, {
        session: e,
        onDone: n,
        onBack: r,
        onKill: o
      });
    }
    if (e.isRemoteReview) {
      return ba.jsx(mZm, {
        session: e,
        onDone: n,
        onBack: r,
        onKill: o
      });
    }
    let p = () => n("Cloud session details dismissed", {
      display: "system"
    });
    let m = y => {
      if (y.key === " ") {
        y.preventDefault();
        n("Cloud session details dismissed", {
          display: "system"
        });
      } else if (y.key === "left" && r) {
        y.preventDefault();
        r();
      } else if (y.key === "t" && !y.ctrl && !y.meta && !s) {
        y.preventDefault();
        f();
      } else if (y.key === "return") {
        y.preventDefault();
        p();
      }
    };
    async function f() {
      i(true);
      l(null);
      try {
        await teleportResumeCodeSession(e.sessionId);
      } catch (y) {
        l(he(y));
      } finally {
        i(false);
      }
    }
    let h = truncateToWidth(e.title, 50);
    let g = e.status === "pending" ? "starting" : e.status;
    return ba.jsx(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: m,
      children: ba.jsxs(or, {
        title: "Cloud session details",
        onCancel: p,
        color: "background",
        inputGuide: ba.jsxs(Hn, {
          children: [r && ba.jsx(xt, {
            chord: "left",
            action: "go back"
          }), ba.jsx(xt, {
            chord: ["escape", "enter", "space"],
            action: "close"
          }), !s && ba.jsx(xt, {
            chord: "t",
            action: "teleport"
          })]
        }),
        children: [ba.jsxs(gXd, {
          flexDirection: "column",
          children: [ba.jsxs(Text, {
            children: [ba.jsx(Text, {
              bold: true,
              children: "Status"
            }), ":", " ", g === "running" || g === "starting" ? ba.jsx(Text, {
              color: "background",
              children: g
            }) : g === "completed" ? ba.jsx(Text, {
              color: "success",
              children: g
            }) : ba.jsx(Text, {
              color: "error",
              children: g
            })]
          }), ba.jsxs(Text, {
            children: [ba.jsx(Text, {
              bold: true,
              children: "Runtime"
            }), ": ", d]
          }), ba.jsxs(Text, {
            wrap: "truncate-end",
            children: [ba.jsx(Text, {
              bold: true,
              children: "Title"
            }), ": ", h]
          }), ba.jsxs(Text, {
            children: [ba.jsx(Text, {
              bold: true,
              children: "Progress"
            }), ":", " ", ba.jsx(Sen, {
              session: e
            })]
          }), ba.jsxs(Text, {
            children: [ba.jsx(Text, {
              bold: true,
              children: "Session URL"
            }), ":", " ", ba.jsx(Link, {
              url: Mme(e.sessionId),
              children: ba.jsx(Text, {
                dimColor: true,
                children: Mme(e.sessionId)
              })
            })]
          })]
        }), e.log.length > 0 && ba.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [ba.jsxs(Text, {
            children: [ba.jsx(Text, {
              bold: true,
              children: "Recent messages"
            }), ":"]
          }), ba.jsx(gXd, {
            flexDirection: "column",
            height: 10,
            overflowY: "hidden",
            children: c.map((y, _) => ba.jsx(dZ, {
              message: y,
              lookups: Yve,
              addMargin: _ > 0,
              tools: t.options.tools,
              commands: t.options.commands,
              verbose: t.options.verbose,
              inProgressToolUseIDs: new Set(),
              progressMessagesForMessage: [],
              shouldAnimate: false,
              shouldShowDot: false,
              style: "condensed",
              isTranscriptMode: false,
              isStatic: true
            }, _))
          }), ba.jsx(gXd, {
            marginTop: 1,
            children: ba.jsxs(Text, {
              dimColor: true,
              italic: true,
              children: ["Showing last ", c.length, " of ", e.log.length, " ", "messages"]
            })
          })]
        }), a && ba.jsx(gXd, {
          marginTop: 1,
          children: ba.jsxs(Text, {
            color: "error",
            children: ["Teleport failed: ", a]
          })
        }), s && ba.jsx(Text, {
          color: "background",
          children: "Teleporting to session\u2026"
        })]
      })
    });
  }
  var Ucr;
  var QZl;
  var JYe;
  var ba;
  var lZm;
  var cZm;
  var JZl;
  var XZl;
  var g9o = __lazy(() => {
    wl();
    WSt();
    et();
    tZ();
    Sh();
    cU();
    ky();
    dt();
    cs();
    VUe();
    ro();
    Zn();
    FM();
    $c();
    Ai();
    b_();
    Ii();
    bs();
    Vf();
    sTt();
    m9o();
    Ucr = __toESM(pt(), 1);
    QZl = __toESM(ot(), 1);
    JYe = __toESM(ot(), 1);
    ba = __toESM(ie(), 1);
    lZm = {
      needs_input: "input required",
      plan_ready: "ready"
    };
    cZm = {
      needs_input: "waiting",
      plan_ready: "done"
    };
    JZl = ["finding", "verifying", "synthesizing"];
    XZl = {
      finding: "Find",
      verifying: "Verify",
      synthesizing: "Dedupe"
    };
  });
  async function eec(e) {
    let t = getTaskOutputPath(e.id);
    try {
      let n = await LA(t, 8192);
      return {
        content: n.content,
        bytesTotal: n.bytesTotal
      };
    } catch {
      return {
        content: "",
        bytesTotal: 0
      };
    }
  }
  function tec(e) {
    let t = y9o.c(61);
    let {
      shell: n,
      onDone: r,
      onKillShell: o,
      onBack: s
    } = e;
    let {
      columns: i
    } = Sr();
    let a;
    if (t[0] !== n) {
      a = () => eec(n);
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let [l, c] = zUe.useState(a);
    let u = zUe.useDeferredValue(l);
    let d;
    if (t[2] !== n) {
      d = () => c(eec(n));
      t[2] = n;
      t[3] = d;
    } else {
      d = t[3];
    }
    useInterval(d, n.status === "running" ? 1000 : null);
    let p;
    if (t[4] !== r) {
      p = () => r("Shell details dismissed", {
        display: "system"
      });
      t[4] = r;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m = p;
    let f;
    if (t[6] !== m) {
      f = {
        "confirm:yes": m
      };
      t[6] = m;
      t[7] = f;
    } else {
      f = t[7];
    }
    let h;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      h = {
        context: "Confirmation"
      };
      t[8] = h;
    } else {
      h = t[8];
    }
    jo(f, h);
    let g;
    if (t[9] !== s || t[10] !== r || t[11] !== o || t[12] !== n.status) {
      g = oe => {
        if (oe.key === " ") {
          oe.preventDefault();
          r("Shell details dismissed", {
            display: "system"
          });
        } else if (oe.key === "left" && s) {
          oe.preventDefault();
          s();
        } else if (oe.key === "x" && !oe.ctrl && !oe.meta && n.status === "running" && o) {
          oe.preventDefault();
          o();
        }
      };
      t[9] = s;
      t[10] = r;
      t[11] = o;
      t[12] = n.status;
      t[13] = g;
    } else {
      g = t[13];
    }
    let y = g;
    let _ = n.kind === "monitor";
    let b;
    if (t[14] !== n.command) {
      b = truncateToWidth(n.command, 280);
      t[14] = n.command;
      t[15] = b;
    } else {
      b = t[15];
    }
    let S = b;
    let E = _ ? "Monitor details" : "Shell details";
    let C;
    if (t[16] !== s) {
      C = s && R_.jsx(xt, {
        chord: "left",
        action: "go back"
      });
      t[16] = s;
      t[17] = C;
    } else {
      C = t[17];
    }
    let x;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      x = R_.jsx(xt, {
        chord: ["escape", "enter", "space"],
        action: "close"
      });
      t[18] = x;
    } else {
      x = t[18];
    }
    let A;
    if (t[19] !== o || t[20] !== n.status) {
      A = n.status === "running" && o && R_.jsx(xt, {
        chord: "x",
        action: "stop"
      });
      t[19] = o;
      t[20] = n.status;
      t[21] = A;
    } else {
      A = t[21];
    }
    let k;
    if (t[22] !== A || t[23] !== C) {
      k = R_.jsxs(Hn, {
        children: [C, x, A]
      });
      t[22] = A;
      t[23] = C;
      t[24] = k;
    } else {
      k = t[24];
    }
    let I;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      I = [{
        bold: true
      }, {
        width: {
          ratio: 1
        }
      }];
      t[25] = I;
    } else {
      I = t[25];
    }
    let O = i - 6;
    let M;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      M = R_.jsx(R_.Fragment, {
        children: "Status:"
      });
      t[26] = M;
    } else {
      M = t[26];
    }
    let L;
    if (t[27] !== n.result || t[28] !== n.status) {
      L = R_.jsxs(ih.Row, {
        children: [M, n.status === "running" ? R_.jsxs(Text, {
          color: "background",
          children: [n.status, n.result?.code !== undefined && ` (exit code: ${n.result.code})`]
        }) : n.status === "completed" ? R_.jsxs(Text, {
          color: "success",
          children: [n.status, n.result?.code !== undefined && ` (exit code: ${n.result.code})`]
        }) : R_.jsxs(Text, {
          color: "error",
          children: [n.status, n.result?.code !== undefined && ` (exit code: ${n.result.code})`]
        })]
      });
      t[27] = n.result;
      t[28] = n.status;
      t[29] = L;
    } else {
      L = t[29];
    }
    let P;
    if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
      P = R_.jsx(R_.Fragment, {
        children: "Runtime:"
      });
      t[30] = P;
    } else {
      P = t[30];
    }
    let F;
    if (t[31] !== n.endTime) {
      F = n.endTime ?? Date.now();
      t[31] = n.endTime;
      t[32] = F;
    } else {
      F = t[32];
    }
    let H = F - n.startTime;
    let U;
    if (t[33] !== H) {
      U = formatDuration(H);
      t[33] = H;
      t[34] = U;
    } else {
      U = t[34];
    }
    let N;
    if (t[35] !== U) {
      N = R_.jsxs(ih.Row, {
        children: [P, U]
      });
      t[35] = U;
      t[36] = N;
    } else {
      N = t[36];
    }
    let W = _ ? "Script:" : "Command:";
    let j;
    if (t[37] !== W) {
      j = R_.jsx(R_.Fragment, {
        children: W
      });
      t[37] = W;
      t[38] = j;
    } else {
      j = t[38];
    }
    let z;
    if (t[39] !== S || t[40] !== j) {
      z = R_.jsxs(ih.Row, {
        children: [j, S]
      });
      t[39] = S;
      t[40] = j;
      t[41] = z;
    } else {
      z = t[41];
    }
    let V;
    if (t[42] !== O || t[43] !== L || t[44] !== N || t[45] !== z) {
      V = R_.jsxs(ih, {
        box: "plain",
        columns: I,
        forceWidth: O,
        children: [L, N, z]
      });
      t[42] = O;
      t[43] = L;
      t[44] = N;
      t[45] = z;
      t[46] = V;
    } else {
      V = t[46];
    }
    let K;
    if (t[47] === Symbol.for("react.memo_cache_sentinel")) {
      K = R_.jsx(Text, {
        bold: true,
        children: "Output:"
      });
      t[47] = K;
    } else {
      K = t[47];
    }
    let J;
    if (t[48] === Symbol.for("react.memo_cache_sentinel")) {
      J = R_.jsx(Text, {
        dimColor: true,
        children: "Loading output\u2026"
      });
      t[48] = J;
    } else {
      J = t[48];
    }
    let Q;
    if (t[49] !== i || t[50] !== u) {
      Q = R_.jsxs(gXd, {
        flexDirection: "column",
        children: [K, R_.jsx(zUe.Suspense, {
          fallback: J,
          children: R_.jsx(hZm, {
            outputPromise: u,
            columns: i
          })
        })]
      });
      t[49] = i;
      t[50] = u;
      t[51] = Q;
    } else {
      Q = t[51];
    }
    let Z;
    if (t[52] !== m || t[53] !== k || t[54] !== V || t[55] !== Q || t[56] !== E) {
      Z = R_.jsxs(or, {
        title: E,
        onCancel: m,
        color: "background",
        inputGuide: k,
        children: [V, Q]
      });
      t[52] = m;
      t[53] = k;
      t[54] = V;
      t[55] = Q;
      t[56] = E;
      t[57] = Z;
    } else {
      Z = t[57];
    }
    let ne;
    if (t[58] !== y || t[59] !== Z) {
      ne = R_.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: y,
        children: Z
      });
      t[58] = y;
      t[59] = Z;
      t[60] = ne;
    } else {
      ne = t[60];
    }
    return ne;
  }
  function hZm(e) {
    let t = y9o.c(19);
    let {
      outputPromise: n,
      columns: r
    } = e;
    let {
      content: o,
      bytesTotal: s
    } = zUe.use(n);
    if (!o) {
      let h;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        h = R_.jsx(sc, {
          children: "No output available"
        });
        t[0] = h;
      } else {
        h = t[0];
      }
      return h;
    }
    let i;
    let a;
    if (t[1] !== s || t[2] !== o) {
      let h = [];
      let g = o.length;
      for (let y = 0; y < 10 && g > 0; y++) {
        let _ = o.lastIndexOf(`
`, g - 1);
        h.push(_ + 1);
        g = _;
      }
      h.reverse();
      i = s > o.length;
      a = [];
      for (let y = 0; y < h.length; y++) {
        let _ = h[y];
        let b = y < h.length - 1 ? h[y + 1] - 1 : o.length;
        let S = o.slice(_, b);
        if (S) {
          a.push(S);
        }
      }
      t[1] = s;
      t[2] = o;
      t[3] = i;
      t[4] = a;
    } else {
      i = t[3];
      a = t[4];
    }
    let l = r - 6;
    let c;
    if (t[5] !== a) {
      c = a.map(gZm);
      t[5] = a;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== l || t[8] !== c) {
      u = R_.jsx(gXd, {
        borderStyle: "round",
        paddingX: 1,
        flexDirection: "column",
        height: 12,
        maxWidth: l,
        children: c
      });
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d = `Showing ${a.length} lines`;
    let p;
    if (t[10] !== s || t[11] !== i) {
      p = i ? ` of ${formatFileSize(s)}` : "";
      t[10] = s;
      t[11] = i;
      t[12] = p;
    } else {
      p = t[12];
    }
    let m;
    if (t[13] !== d || t[14] !== p) {
      m = R_.jsxs(Text, {
        dimColor: true,
        italic: true,
        children: [d, p]
      });
      t[13] = d;
      t[14] = p;
      t[15] = m;
    } else {
      m = t[15];
    }
    let f;
    if (t[16] !== u || t[17] !== m) {
      f = R_.jsxs(R_.Fragment, {
        children: [u, m]
      });
      t[16] = u;
      t[17] = m;
      t[18] = f;
    } else {
      f = t[18];
    }
    return f;
  }
  function gZm(e, t) {
    return R_.jsx(Text, {
      wrap: "truncate-end",
      children: e
    }, t);
  }
  var y9o;
  var zUe;
  var R_;
  var nec = __lazy(() => {
    ki();
    et();
    Bs();
    cs();
    cE();
    Ai();
    Ii();
    xb();
    bs();
    oYe();
    y9o = __toESM(pt(), 1);
    zUe = __toESM(ot(), 1);
    R_ = __toESM(ie(), 1);
  });
  async function oec(e, t) {
    let n = rec.join(hz(e), `agent-${t}.jsonl`);
    let r;
    try {
      r = await knt(n);
    } catch (c) {
      logForDebugging(`readWorkflowAgentTranscript: ${n} not readable (${c instanceof Error ? c.message : String(c)})`);
      return null;
    }
    let o = r.filter(isTranscriptMessage);
    let s = o.find(c => c.type === "user");
    let i = (s && qO(s)) ?? "";
    let a = [];
    let l = "";
    for (let c of o) {
      if (c.type !== "assistant" || !Array.isArray(c.message.content)) {
        continue;
      }
      let u = "";
      for (let d of c.message.content) {
        if (d.type === "tool_use") {
          if (a.push({
            name: d.name,
            summary: otr(d.input)
          }), d.name === "StructuredOutput" && d.input !== undefined) {
            try {
              u = De(d.input, null, 2);
            } catch {
              u = String(d.input);
            }
          }
        } else if (d.type === "text") {
          u += d.text;
        }
      }
      if (u) {
        l = u;
      }
    }
    return {
      prompt: i,
      toolCalls: a,
      finalText: l
    };
  }
  var rec;
  var sec = __lazy(() => {
    je();
    Gd();
    ro();
    fa();
    O1();
    VNe();
    jLo();
    rec = require("path");
  });
  function yZm(e, t) {
    if (e === "user") {
      return ven.join(er(), "workflows");
    }
    let n = findGitRoot(t);
    if (n === null) {
      return ven.join(t, ".claude", "workflows");
    }
    let r = p8e("workflows", t)[0];
    if (r !== undefined) {
      return r;
    }
    return ven.join(n, ".claude", "workflows");
  }
  async function iec(e) {
    let t = zbe(e.name);
    let n = yZm(e.scope, e.cwd);
    let r = ven.join(n, `${t}.js`);
    await Bcr.mkdir(n, {
      recursive: true,
      mode: 448
    });
    try {
      await Bcr.writeFile(r, e.script, {
        encoding: "utf8",
        mode: 384,
        flag: e.overwrite ? "w" : "wx"
      });
    } catch (i) {
      if (en(i) === "EEXIST") {
        throw Error(`Dynamic workflow "${t}" already exists at ${r}. Use a different name or overwrite.`);
      }
      throw i;
    }
    invalidateWorkflowCache();
    let [{
      clearCommandMemoizationCaches: o
    }, {
      resetSentSkillNames: s
    }] = await Promise.all([Promise.resolve().then(() => (Bm(), _9o)), Promise.resolve().then(() => (rR(), tBl))]);
    o();
    s();
    logEvent("tengu_workflow_saved", {
      scope: e.scope,
      overwrite: e.overwrite,
      script_size_chars: e.script.length
    });
    return {
      name: t,
      path: r,
      scope: e.scope
    };
  }
  var Bcr;
  var ven;
  var aec = __lazy(() => {
    Ot();
    gn();
    dt();
    na();
    v9();
    $Yt();
    DJ();
    Bcr = require("fs/promises");
    ven = require("path");
  });
  function $cr(e) {
    let t = lec.c(49);
    let {
      script: n,
      defaultName: r,
      onDone: o
    } = e;
    let {
      columns: s
    } = Sr();
    let [i, a] = XYe.useState(r);
    let [l, c] = XYe.useState(r.length);
    let [u, d] = XYe.useState("project");
    let [p, m] = XYe.useState(false);
    let [f, h] = XYe.useState(null);
    let [g, y] = XYe.useState(null);
    let _;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      _ = () => {
        h(null);
        y(null);
      };
      t[0] = _;
    } else {
      _ = t[0];
    }
    let b = _;
    let S;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      S = de => {
        a(de);
        b();
      };
      t[1] = S;
    } else {
      S = t[1];
    }
    let E = S;
    let C;
    if (t[2] !== f || t[3] !== i || t[4] !== o || t[5] !== p || t[6] !== u || t[7] !== n) {
      C = () => {
        if (p) {
          return;
        }
        let de = i.trim();
        if (!de) {
          return;
        }
        m(true);
        y(null);
        iec({
          name: de,
          scope: u,
          script: n,
          overwrite: f !== null,
          cwd: Nt()
        }).then(be => {
          o(`Dynamic workflow saved to ${be.path}. Invoke as /${be.name} or Workflow({name: "${be.name}"}) in future sessions.`);
        }).catch(be => {
          let fe = be instanceof Error ? be.message : String(be);
          if (fe.includes("already exists")) {
            let me = fe.match(/at (.+?)\. /);
            h(me?.[1] ?? "(unknown path)");
          } else {
            y(fe);
          }
          m(false);
        });
      };
      t[2] = f;
      t[3] = i;
      t[4] = o;
      t[5] = p;
      t[6] = u;
      t[7] = n;
      t[8] = C;
    } else {
      C = t[8];
    }
    let x = C;
    let A;
    if (t[9] !== o) {
      A = () => o();
      t[9] = o;
      t[10] = A;
    } else {
      A = t[10];
    }
    let k = A;
    let I;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      I = {
        context: "Settings",
        isActive: true
      };
      t[11] = I;
    } else {
      I = t[11];
    }
    uo("confirm:no", k, I);
    let O;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      O = de => {
        if (de.key === "tab") {
          de.preventDefault();
          d(_Zm);
          b();
        }
      };
      t[12] = O;
    } else {
      O = t[12];
    }
    let M = O;
    let L;
    if (t[13] !== i) {
      L = zbe(i.trim() || "workflow");
      t[13] = i;
      t[14] = L;
    } else {
      L = t[14];
    }
    let P = L;
    let F = u === "project" ? `.claude/workflows/${P}.js` : `~/.claude/workflows/${P}.js`;
    let H = u === "project" ? "Project" : "User";
    let U;
    if (t[15] !== H || t[16] !== F) {
      U = lD.jsxs(Text, {
        dimColor: true,
        children: [H, " scope \xB7 ", F]
      });
      t[15] = H;
      t[16] = F;
      t[17] = U;
    } else {
      U = t[17];
    }
    let N = f ? "overwrite" : "save";
    let W;
    if (t[18] !== N) {
      W = lD.jsx(xt, {
        chord: "enter",
        action: N
      });
      t[18] = N;
      t[19] = W;
    } else {
      W = t[19];
    }
    let j;
    let z;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      j = lD.jsx(xt, {
        chord: "tab",
        action: "toggle scope"
      });
      z = lD.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[20] = j;
      t[21] = z;
    } else {
      j = t[20];
      z = t[21];
    }
    let V;
    if (t[22] !== W) {
      V = lD.jsxs(Hn, {
        children: [W, j, z]
      });
      t[22] = W;
      t[23] = V;
    } else {
      V = t[23];
    }
    let K;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      K = lD.jsx(Text, {
        children: "Save as:"
      });
      t[24] = K;
    } else {
      K = t[24];
    }
    let J;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      J = lD.jsx(Text, {
        children: ">"
      });
      t[25] = J;
    } else {
      J = t[25];
    }
    let Q = !p;
    let Z = !p;
    let ne;
    if (t[26] !== s || t[27] !== l || t[28] !== x || t[29] !== i || t[30] !== Q || t[31] !== Z) {
      ne = lD.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginTop: 1,
        children: [J, lD.jsx(Dl, {
          value: i,
          onChange: E,
          onSubmit: x,
          focus: Q,
          showCursor: Z,
          columns: s,
          cursorOffset: l,
          onChangeCursorOffset: c
        })]
      });
      t[26] = s;
      t[27] = l;
      t[28] = x;
      t[29] = i;
      t[30] = Q;
      t[31] = Z;
      t[32] = ne;
    } else {
      ne = t[32];
    }
    let oe;
    if (t[33] !== f) {
      oe = f && lD.jsx(gXd, {
        marginTop: 1,
        children: lD.jsxs(Text, {
          color: "warning",
          children: [f, " already exists. Press Enter again to overwrite, or change the name."]
        })
      });
      t[33] = f;
      t[34] = oe;
    } else {
      oe = t[34];
    }
    let ee;
    if (t[35] !== g) {
      ee = g && lD.jsx(gXd, {
        marginTop: 1,
        children: lD.jsx(Hc, {
          error: g
        })
      });
      t[35] = g;
      t[36] = ee;
    } else {
      ee = t[36];
    }
    let re;
    if (t[37] !== p) {
      re = p && lD.jsx(gXd, {
        marginTop: 1,
        children: lD.jsx(Text, {
          dimColor: true,
          children: "Saving\u2026"
        })
      });
      t[37] = p;
      t[38] = re;
    } else {
      re = t[38];
    }
    let se;
    if (t[39] !== ne || t[40] !== oe || t[41] !== ee || t[42] !== re) {
      se = lD.jsxs(gXd, {
        flexDirection: "column",
        children: [K, ne, oe, ee, re]
      });
      t[39] = ne;
      t[40] = oe;
      t[41] = ee;
      t[42] = re;
      t[43] = se;
    } else {
      se = t[43];
    }
    let ae;
    if (t[44] !== k || t[45] !== V || t[46] !== se || t[47] !== U) {
      ae = lD.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: M,
        children: lD.jsx(or, {
          title: "Save dynamic workflow",
          subtitle: U,
          onCancel: k,
          color: "permission",
          isCancelActive: false,
          inputGuide: V,
          children: se
        })
      });
      t[44] = k;
      t[45] = V;
      t[46] = se;
      t[47] = U;
      t[48] = ae;
    } else {
      ae = t[48];
    }
    return ae;
  }
  function _Zm(e) {
    return e === "project" ? "user" : "project";
  }
  var lec;
  var XYe;
  var lD;
  var b9o = __lazy(() => {
    ki();
    et();
    Bs();
    aec();
    DJ();
    vo();
    Ai();
    Ii();
    bv();
    bs();
    q_();
    lec = __toESM(pt(), 1);
    XYe = __toESM(ot(), 1);
    lD = __toESM(ie(), 1);
  });
  var hec = {};
  __export(hec, {
    computeVisibleWindow: () => computeVisibleWindow,
    buildAgentDetailLines: () => buildAgentDetailLines,
    agentDisplayStatus: () => agentDisplayStatus,
    WorkflowDetailDialog: () => WorkflowDetailDialog,
    PhaseScrollIndicator: () => PhaseScrollIndicator
  });
  function computeVisibleWindow(e, t, n) {
    if (t <= n) {
      return {
        from: 0,
        to: t,
        above: 0,
        below: 0
      };
    }
    let r = Math.floor(n / 2);
    let o = Math.max(0, Math.min(e - r, t - n));
    let s = o + n;
    return {
      from: o,
      to: s,
      above: o,
      below: t - s
    };
  }
  function QYe(e) {
    return e.state === "start" || e.state === "progress";
  }
  function agentDisplayStatus(e, t) {
    if (e.state === "done") {
      return "done";
    }
    if (e.state === "error") {
      return e.skipped ? "skipped" : "failed";
    }
    if (!t) {
      return "interrupted";
    }
    return e.queuedAt != null && e.startedAt == null ? "queued" : "running";
  }
  function jcr(e) {
    switch (e) {
      case "done":
        return {
          glyph: vGd.tick,
          color: "success"
        };
      case "failed":
        return {
          glyph: vGd.cross,
          color: "error"
        };
      case "skipped":
        return {
          glyph: vGd.cross,
          color: "subtle"
        };
      case "queued":
      case "interrupted":
        return {
          glyph: "\u25CC",
          color: "subtle"
        };
      case "running":
        return {
          glyph: Tc,
          color: "subtle"
        };
    }
  }
  function w9o(e, t) {
    return t ? `showing ${e} ${t}` : `${e} ${un(e, "agent")}`;
  }
  function uec(e, t) {
    if (e.status === "not-started") {
      return "Not started yet";
    }
    return t ? `No ${t} agents` : "No agents";
  }
  function nCt(e, t, n) {
    return Math.max(t, Math.min(n, e));
  }
  function bZm(e, t) {
    let n = agentDisplayStatus(e, t);
    let r = jYt(e.model, e.fallbackModel, {
      compact: true
    });
    let o = [];
    if (e.isolation != null) {
      o.push(e.isolation);
    }
    if (e.tokens != null) {
      o.push(`${formatTokens(e.tokens)} tok`);
    }
    if (e.toolCalls != null && e.toolCalls > 0) {
      o.push(`${e.toolCalls} ${un(e.toolCalls, "tool")}`);
    }
    if (e.durationMs != null) {
      o.push(formatDuration(e.durationMs));
    }
    if (n === "running" && e.lastProgressAt != null) {
      let s = Math.floor((Date.now() - e.lastProgressAt) / 1000);
      if (s >= 30) {
        o.push(`idle ${formatDuration(s * 1000)}`);
      }
    }
    if (n === "queued") {
      o.push("queued");
    }
    if (n === "interrupted") {
      o.push("stopped");
    }
    if (n === "skipped") {
      o.push("skipped");
    }
    if (n === "failed") {
      let s = e.error ? Ad(e.error).trim() : "";
      o.push(s ? `failed: ${s}` : "failed");
    }
    return {
      model: r,
      stats: o.join(" \xB7 ")
    };
  }
  function dec(e, t, n, r) {
    if (t <= 0) {
      return [];
    }
    let {
      model: o,
      stats: s
    } = bZm(e, r);
    let i = n ? "permission" : undefined;
    let a = !n;
    let l = (m, f) => f <= 0 ? "" : truncateToWidth(m, f);
    let c = o;
    let u = s;
    let d = c && u ? 1 : 0;
    if (an(c) + d + an(u) > t) {
      if (u = l(u, t - an(c) - d), an(c) + (c && u ? 1 : 0) + an(u) > t) {
        c = l(c, t - an(u) - (u ? 1 : 0));
      }
    }
    let p = Math.max(0, t - an(c) - an(u));
    return [{
      text: c,
      color: i,
      dimColor: a
    }, {
      text: " ".repeat(p)
    }, {
      text: u,
      color: i,
      dimColor: a
    }];
  }
  function Yfe(e) {
    let t = Jfe.c(9);
    let {
      segs: n,
      contentWidth: r
    } = e;
    let o = n.reduce(TZm, 0);
    let s = Math.max(0, r - o);
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = ga.jsxs(Text, {
        color: "text",
        children: [" ", cF.pipe, " "]
      });
      t[0] = i;
    } else {
      i = t[0];
    }
    let a;
    if (t[1] !== n) {
      a = n.map(SZm);
      t[1] = n;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== s) {
      l = " ".repeat(s);
      t[3] = s;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      c = ga.jsxs(Text, {
        color: "text",
        children: [" ", cF.pipe]
      });
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== a || t[7] !== l) {
      u = ga.jsxs(Text, {
        wrap: "truncate-end",
        children: [i, a, l, c]
      });
      t[6] = a;
      t[7] = l;
      t[8] = u;
    } else {
      u = t[8];
    }
    return u;
  }
  function SZm(e, t) {
    return ga.jsx(Text, {
      color: e.color,
      dimColor: e.dimColor,
      bold: e.bold ?? false,
      children: e.text
    }, t);
  }
  function TZm(e, t) {
    return e + an(t.text);
  }
  function ZYe(e, t) {
    let n = e.from > 0 ? vGd.arrowUp : " ";
    let r = e.to < t ? vGd.arrowDown : " ";
    return `${n} ${e.from + 1}${"\u2013"}${e.to} of ${t} ${r}`;
  }
  function PhaseScrollIndicator(e) {
    let t = Jfe.c(5);
    let {
      win: n,
      total: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      o = ZYe(n, r);
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = `  ${o}`;
    let i;
    if (t[3] !== s) {
      i = ga.jsx(Text, {
        dimColor: true,
        wrap: "truncate-end",
        children: s
      });
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  function EZm(e) {
    let t = Jfe.c(69);
    let {
      phase: n,
      selectedAgent: r,
      level: o,
      contentWidth: s,
      viewport: i,
      tight: a,
      workflowActive: l,
      filterLabel: c
    } = e;
    let u = n.agents;
    let d;
    if (t[0] !== s) {
      d = ("\u2500").repeat(s + 2);
      t[0] = s;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p = d;
    let m;
    let f;
    if (t[2] !== u || t[3] !== p || t[4] !== s || t[5] !== c || t[6] !== o || t[7] !== n || t[8] !== r || t[9] !== a || t[10] !== i || t[11] !== l) {
      let y = computeVisibleWindow(r, u.length, i);
      f = [];
      let _ = w9o(u.length, c);
      if (a) {
        let E = truncateToWidth(` \xB7 ${_}`, Math.max(1, s - 1));
        let C = Math.max(1, s - an(E));
        let x;
        if (t[14] !== n.title || t[15] !== C) {
          x = truncateToWidth(n.title, C);
          t[14] = n.title;
          t[15] = C;
          t[16] = x;
        } else {
          x = t[16];
        }
        let A;
        if (t[17] !== x) {
          A = {
            text: x,
            color: "permission",
            bold: true
          };
          t[17] = x;
          t[18] = A;
        } else {
          A = t[18];
        }
        let k;
        if (t[19] !== E) {
          k = {
            text: E,
            dimColor: true
          };
          t[19] = E;
          t[20] = k;
        } else {
          k = t[20];
        }
        let I;
        if (t[21] !== A || t[22] !== k) {
          I = [A, k];
          t[21] = A;
          t[22] = k;
          t[23] = I;
        } else {
          I = t[23];
        }
        let O;
        if (t[24] !== s || t[25] !== I) {
          O = ga.jsx(Yfe, {
            contentWidth: s,
            segs: I
          }, "title");
          t[24] = s;
          t[25] = I;
          t[26] = O;
        } else {
          O = t[26];
        }
        f.push(O);
      } else {
        let E;
        if (t[27] !== s || t[28] !== n.title) {
          E = truncateToWidth(n.title, s);
          t[27] = s;
          t[28] = n.title;
          t[29] = E;
        } else {
          E = t[29];
        }
        let C;
        if (t[30] !== E) {
          C = [{
            text: E,
            color: "permission",
            bold: true
          }];
          t[30] = E;
          t[31] = C;
        } else {
          C = t[31];
        }
        let x;
        if (t[32] !== s || t[33] !== C) {
          x = ga.jsx(Yfe, {
            contentWidth: s,
            segs: C
          }, "title");
          t[32] = s;
          t[33] = C;
          t[34] = x;
        } else {
          x = t[34];
        }
        f.push(x);
        let A = {
          text: truncateToWidth(_, s),
          dimColor: true
        };
        let k;
        if (t[35] !== A) {
          k = [A];
          t[35] = A;
          t[36] = k;
        } else {
          k = t[36];
        }
        let I;
        if (t[37] !== s || t[38] !== k) {
          I = ga.jsx(Yfe, {
            contentWidth: s,
            segs: k
          }, "count");
          t[37] = s;
          t[38] = k;
          t[39] = I;
        } else {
          I = t[39];
        }
        f.push(I);
        let O;
        if (t[40] === Symbol.for("react.memo_cache_sentinel")) {
          O = [{
            text: ""
          }];
          t[40] = O;
        } else {
          O = t[40];
        }
        let M;
        if (t[41] !== s) {
          M = ga.jsx(Yfe, {
            contentWidth: s,
            segs: O
          }, "gap");
          t[41] = s;
          t[42] = M;
        } else {
          M = t[42];
        }
        f.push(M);
      }
      let b = f.length;
      if (u.length === 0) {
        let E;
        if (t[43] !== c || t[44] !== n) {
          E = uec(n, c);
          t[43] = c;
          t[44] = n;
          t[45] = E;
        } else {
          E = t[45];
        }
        let C;
        if (t[46] !== E) {
          C = [{
            text: E,
            dimColor: true
          }];
          t[46] = E;
          t[47] = C;
        } else {
          C = t[47];
        }
        let x;
        if (t[48] !== s || t[49] !== C) {
          x = ga.jsx(Yfe, {
            contentWidth: s,
            segs: C
          }, "empty");
          t[48] = s;
          t[49] = C;
          t[50] = x;
        } else {
          x = t[50];
        }
        f.push(x);
      } else {
        let E = Math.min(22, Math.max(4, s - 5));
        for (let C = y.from; C < y.to; C++) {
          let x = u[C];
          let A = o === "agents" && C === r;
          let {
            glyph: k,
            color: I
          } = jcr(agentDisplayStatus(x, l));
          let O = truncateToWidth(x.label, E);
          let M = " ".repeat(Math.max(0, E - an(O)));
          let L = Math.max(0, s - (E + 5));
          f.push(ga.jsx(Yfe, {
            contentWidth: s,
            segs: [{
              text: A ? vGd.pointer : " ",
              color: "permission"
            }, {
              text: " "
            }, {
              text: k,
              color: I
            }, {
              text: " "
            }, {
              text: `${O}${M}`,
              color: A ? "permission" : undefined,
              dimColor: !A && QYe(x)
            }, {
              text: " "
            }, ...dec(x, L, A, l)]
          }, `a-${C}`));
        }
      }
      let S = f.length - b;
      for (let E = S; E < i; E++) {
        f.push(ga.jsx(Yfe, {
          contentWidth: s,
          segs: [{
            text: ""
          }]
        }, `pad-${E}`));
      }
      if (u.length > i) {
        let E = ` ${ZYe(y, u.length)} `;
        let C = Math.max(0, s + 2 - an(E));
        let x;
        if (t[51] !== C) {
          x = ("\u2500").repeat(C);
          t[51] = C;
          t[52] = x;
        } else {
          x = t[52];
        }
        let A;
        if (t[53] !== x) {
          A = ga.jsxs(Text, {
            color: "text",
            children: [" ", lF.bottomLeft, x]
          });
          t[53] = x;
          t[54] = A;
        } else {
          A = t[54];
        }
        let k;
        if (t[55] !== E) {
          k = ga.jsx(Text, {
            dimColor: true,
            children: E
          });
          t[55] = E;
          t[56] = k;
        } else {
          k = t[56];
        }
        let I;
        if (t[57] === Symbol.for("react.memo_cache_sentinel")) {
          I = ga.jsx(Text, {
            color: "text",
            children: lF.bottomRight
          });
          t[57] = I;
        } else {
          I = t[57];
        }
        let O;
        if (t[58] !== A || t[59] !== k) {
          O = ga.jsxs(Text, {
            wrap: "truncate-end",
            children: [A, k, I]
          });
          t[58] = A;
          t[59] = k;
          t[60] = O;
        } else {
          O = t[60];
        }
        m = O;
      } else {
        let E;
        if (t[61] !== p) {
          E = ga.jsxs(Text, {
            color: "text",
            wrap: "truncate-end",
            children: [" ", lF.bottomLeft, p, lF.bottomRight]
          });
          t[61] = p;
          t[62] = E;
        } else {
          E = t[62];
        }
        m = E;
      }
      t[2] = u;
      t[3] = p;
      t[4] = s;
      t[5] = c;
      t[6] = o;
      t[7] = n;
      t[8] = r;
      t[9] = a;
      t[10] = i;
      t[11] = l;
      t[12] = m;
      t[13] = f;
    } else {
      m = t[12];
      f = t[13];
    }
    let h;
    if (t[63] !== p) {
      h = ga.jsxs(Text, {
        color: "text",
        wrap: "truncate-end",
        children: [" ", lF.topLeft, p, lF.topRight]
      });
      t[63] = p;
      t[64] = h;
    } else {
      h = t[64];
    }
    let g;
    if (t[65] !== m || t[66] !== f || t[67] !== h) {
      g = ga.jsxs(gXd, {
        flexDirection: "column",
        children: [h, f, m]
      });
      t[65] = m;
      t[66] = f;
      t[67] = h;
      t[68] = g;
    } else {
      g = t[68];
    }
    return g;
  }
  function mec(e) {
    let t = Jfe.c(16);
    let {
      left: n,
      right: r,
      leftWidth: o,
      rightWidth: s
    } = e;
    let i = Math.max(0, o - n.reduce(RZm, 0));
    let a = Math.max(0, s - r.reduce(CZm, 0));
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = ga.jsxs(Text, {
        color: "text",
        children: [" ", cF.pipe, " "]
      });
      t[0] = l;
    } else {
      l = t[0];
    }
    let c;
    if (t[1] !== n) {
      c = n.map(wZm);
      t[1] = n;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u;
    if (t[3] !== i) {
      u = " ".repeat(i);
      t[3] = i;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      d = ga.jsxs(Text, {
        color: "text",
        children: [" ", cF.pipe, " "]
      });
      t[5] = d;
    } else {
      d = t[5];
    }
    let p;
    if (t[6] !== r) {
      p = r.map(vZm);
      t[6] = r;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== a) {
      m = " ".repeat(a);
      t[8] = a;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      f = ga.jsxs(Text, {
        color: "text",
        children: [" ", cF.pipe]
      });
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== c || t[12] !== u || t[13] !== p || t[14] !== m) {
      h = ga.jsxs(Text, {
        wrap: "truncate-end",
        children: [l, c, u, d, p, m, f]
      });
      t[11] = c;
      t[12] = u;
      t[13] = p;
      t[14] = m;
      t[15] = h;
    } else {
      h = t[15];
    }
    return h;
  }
  function vZm(e, t) {
    return ga.jsx(Text, {
      color: e.color,
      dimColor: e.dimColor,
      bold: e.bold ?? false,
      children: e.text
    }, t);
  }
  function wZm(e, t) {
    return ga.jsx(Text, {
      color: e.color,
      dimColor: e.dimColor,
      bold: e.bold ?? false,
      children: e.text
    }, t);
  }
  function CZm(e, t) {
    return e + an(t.text);
  }
  function RZm(e, t) {
    return e + an(t.text);
  }
  function cec(e, t) {
    let n = [];
    let r = 0;
    if (t.label) {
      let i = ` ${truncateToWidth(t.label.text, Math.max(1, e - 2))} `;
      r += an(i);
      n.push(ga.jsx(Text, {
        color: t.label.color ?? "text",
        bold: t.label.bold,
        children: i
      }, "label"));
    }
    let o = t.tag ? ` ${truncateToWidth(t.tag, Math.max(0, e - r - 2))} ` : "";
    let s = Math.max(0, e - r - an(o));
    if (n.push(ga.jsx(Text, {
      color: "text",
      children: ("\u2500").repeat(s)
    }, "dash")), o) {
      n.push(ga.jsx(Text, {
        dimColor: true,
        children: o
      }, "tag"));
    }
    return n;
  }
  function Hcr(e) {
    let t = Jfe.c(20);
    let {
      pos: n,
      leftWidth: r,
      rightWidth: o,
      leftTitle: s,
      rightTitle: i,
      leftTag: a,
      rightTag: l
    } = e;
    let c = n === "top" ? lF.topLeft : lF.bottomLeft;
    let u = n === "top" ? cF.teeDown : cF.teeUp;
    let d = n === "top" ? lF.topRight : lF.bottomRight;
    let p;
    if (t[0] !== c) {
      p = ga.jsxs(Text, {
        color: "text",
        children: [" ", c]
      });
      t[0] = c;
      t[1] = p;
    } else {
      p = t[1];
    }
    let m = r + 2;
    let f;
    if (t[2] !== a || t[3] !== s || t[4] !== m) {
      f = cec(m, {
        label: s ? {
          text: s
        } : undefined,
        tag: a
      });
      t[2] = a;
      t[3] = s;
      t[4] = m;
      t[5] = f;
    } else {
      f = t[5];
    }
    let h;
    if (t[6] !== u) {
      h = ga.jsx(Text, {
        color: "text",
        children: u
      });
      t[6] = u;
      t[7] = h;
    } else {
      h = t[7];
    }
    let g = o + 2;
    let y;
    if (t[8] !== l || t[9] !== i || t[10] !== g) {
      y = cec(g, {
        label: i ? {
          text: i
        } : undefined,
        tag: l
      });
      t[8] = l;
      t[9] = i;
      t[10] = g;
      t[11] = y;
    } else {
      y = t[11];
    }
    let _;
    if (t[12] !== d) {
      _ = ga.jsx(Text, {
        color: "text",
        children: d
      });
      t[12] = d;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b;
    if (t[14] !== p || t[15] !== f || t[16] !== h || t[17] !== y || t[18] !== _) {
      b = ga.jsxs(Text, {
        wrap: "truncate-end",
        children: [p, f, h, y, _]
      });
      t[14] = p;
      t[15] = f;
      t[16] = h;
      t[17] = y;
      t[18] = _;
      t[19] = b;
    } else {
      b = t[19];
    }
    return b;
  }
  function xZm(e, t, n, r, o) {
    let s = t === n;
    let i = e.status === "done";
    let a = e.status === "failed";
    let l = i ? vGd.tick : a ? vGd.cross : String(t + 1);
    let c = s ? "permission" : i ? "success" : a ? "error" : "subtle";
    let u = e.totalCount > 0 ? `${e.doneCount}/${e.totalCount}` : "";
    let d = r === "phases" && s ? `${vGd.pointer} ` : "  ";
    let p = an(d) + an(l) + 1;
    let m = u ? 1 + an(u) : 0;
    let f = truncateToWidth(e.title, Math.max(1, o - p - m));
    let h = Math.max(0, o - p - an(f) - m);
    let g = !s && e.status === "not-started";
    let y = [{
      text: d,
      color: s ? "permission" : undefined
    }, {
      text: l,
      color: c
    }, {
      text: " "
    }, {
      text: f,
      color: s ? "permission" : undefined,
      dimColor: g
    }, {
      text: " ".repeat(h)
    }];
    if (u) {
      y.push({
        text: " "
      }, {
        text: u,
        color: s ? "permission" : "subtle"
      });
    }
    return y;
  }
  function kZm(e, t, n, r, o, s, i) {
    let a = r === "agents" && t === n;
    let {
      glyph: l,
      color: c
    } = jcr(agentDisplayStatus(e, i));
    let u = truncateToWidth(e.label, s);
    let d = " ".repeat(Math.max(0, s - an(u)));
    let p = Math.max(0, o - (s + 4));
    return [{
      text: a ? vGd.pointer : " ",
      color: "permission"
    }, {
      text: l,
      color: c
    }, {
      text: " "
    }, {
      text: `${u}${d}`,
      color: a ? "permission" : undefined,
      dimColor: !a && QYe(e)
    }, {
      text: " "
    }, ...dec(e, p, a, i)];
  }
  function AZm(e, t, n, r, o) {
    let s = t === n;
    let {
      glyph: i,
      color: a
    } = jcr(agentDisplayStatus(e, o));
    let l = truncateToWidth(e.label, Math.max(1, r - 4));
    return [{
      text: s ? `${vGd.pointer} ` : "  ",
      color: "permission"
    }, {
      text: i,
      color: a
    }, {
      text: " "
    }, {
      text: l,
      color: s ? "permission" : undefined,
      dimColor: !s && QYe(e)
    }];
  }
  function IZm(e) {
    let t = Jfe.c(41);
    let {
      phases: n,
      selectedPhase: r,
      clampedPhase: o,
      clampedAgent: s,
      level: i,
      leftWidth: a,
      rightWidth: l,
      viewport: c,
      workflowActive: u,
      filterLabel: d
    } = e;
    let p = r.agents;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    let C;
    if (t[0] !== p || t[1] !== s || t[2] !== o || t[3] !== d || t[4] !== a || t[5] !== i || t[6] !== n || t[7] !== l || t[8] !== r || t[9] !== c || t[10] !== u) {
      let k = computeVisibleWindow(o, n.length, c);
      let I = computeVisibleWindow(s, p.length, c);
      let O = Math.min(24, Math.max(6, Math.floor(l * 0.42)));
      let M = [];
      for (let H = 0; H < c; H++) {
        let U = k.from + H;
        let N = I.from + H;
        let W = U < k.to ? xZm(n[U], U, o, i, a) : [];
        let j;
        if (N < I.to) {
          j = kZm(p[N], N, s, i, l, O, u);
        } else if (p.length === 0 && H === 0) {
          j = [{
            text: uec(r, d),
            dimColor: true
          }];
        } else {
          j = [];
        }
        M.push(ga.jsx(mec, {
          left: W,
          right: j,
          leftWidth: a,
          rightWidth: l
        }, H));
      }
      let L = r.title;
      let P;
      if (t[21] !== p.length || t[22] !== d) {
        P = w9o(p.length, d);
        t[21] = p.length;
        t[22] = d;
        t[23] = P;
      } else {
        P = t[23];
      }
      let F = `${L} \xB7 ${P}`;
      if (f = gXd, S = "column", t[24] !== a || t[25] !== F || t[26] !== l) {
        E = ga.jsx(Hcr, {
          pos: "top",
          leftWidth: a,
          rightWidth: l,
          leftTitle: "Phases",
          rightTitle: F
        });
        t[24] = a;
        t[25] = F;
        t[26] = l;
        t[27] = E;
      } else {
        E = t[27];
      }
      C = M;
      m = Hcr;
      h = "bottom";
      g = a;
      y = l;
      _ = n.length > c ? ZYe(k, n.length) : undefined;
      b = p.length > c ? ZYe(I, p.length) : undefined;
      t[0] = p;
      t[1] = s;
      t[2] = o;
      t[3] = d;
      t[4] = a;
      t[5] = i;
      t[6] = n;
      t[7] = l;
      t[8] = r;
      t[9] = c;
      t[10] = u;
      t[11] = m;
      t[12] = f;
      t[13] = h;
      t[14] = g;
      t[15] = y;
      t[16] = _;
      t[17] = b;
      t[18] = S;
      t[19] = E;
      t[20] = C;
    } else {
      m = t[11];
      f = t[12];
      h = t[13];
      g = t[14];
      y = t[15];
      _ = t[16];
      b = t[17];
      S = t[18];
      E = t[19];
      C = t[20];
    }
    let x;
    if (t[28] !== m || t[29] !== h || t[30] !== g || t[31] !== y || t[32] !== _ || t[33] !== b) {
      x = ga.jsx(m, {
        pos: h,
        leftWidth: g,
        rightWidth: y,
        leftTag: _,
        rightTag: b
      });
      t[28] = m;
      t[29] = h;
      t[30] = g;
      t[31] = y;
      t[32] = _;
      t[33] = b;
      t[34] = x;
    } else {
      x = t[34];
    }
    let A;
    if (t[35] !== f || t[36] !== S || t[37] !== E || t[38] !== C || t[39] !== x) {
      A = ga.jsxs(f, {
        flexDirection: S,
        children: [E, C, x]
      });
      t[35] = f;
      t[36] = S;
      t[37] = E;
      t[38] = C;
      t[39] = x;
      t[40] = A;
    } else {
      A = t[40];
    }
    return A;
  }
  function OZm(e, t, n) {
    let r = Jfe.c(7);
    let [o, s] = ZM.useState(null);
    let i;
    if (r[0] !== t || r[1] !== e) {
      i = () => {
        if (!e || !t) {
          return;
        }
        let l = false;
        oec(e, t).then(c => {
          if (!l) {
            s({
              agentId: t,
              transcript: c
            });
          }
        });
        return () => {
          l = true;
        };
      };
      r[0] = t;
      r[1] = e;
      r[2] = i;
    } else {
      i = r[2];
    }
    let a;
    if (r[3] !== t || r[4] !== n || r[5] !== e) {
      a = [e, t, n];
      r[3] = t;
      r[4] = n;
      r[5] = e;
      r[6] = a;
    } else {
      a = r[6];
    }
    if (ZM.useEffect(i, a), !e || !t) {
      return null;
    }
    if (!o || o.agentId !== t) {
      return "loading";
    }
    return o.transcript;
  }
  function E9o(e, t) {
    let n = [];
    for (let r of e.split(`
`)) {
      if (r === "") {
        n.push("");
        continue;
      }
      n.push(...wrapText(r, Math.max(1, t)));
    }
    return n;
  }
  function buildAgentDetailLines({
    agent: e,
    status: t,
    transcript: n,
    promptExpanded: r,
    width: o,
    nowMs: s
  }) {
    let i = [];
    let a = "  ";
    let l = Math.max(8, o - 2);
    let {
      glyph: c,
      color: u
    } = jcr(t);
    let d = [];
    if (e.model != null) {
      d.push(jYt(e.model, e.fallbackModel));
    }
    if (e.agentType != null) {
      d.push(e.agentType);
    }
    if (e.isolation != null) {
      d.push(e.isolation === "remote" && e.remoteSessionId ? `remote ${e.remoteSessionId}` : e.isolation);
    }
    if (e.cached) {
      d.push("from resume journal");
    }
    if (e.attempt != null && e.attempt > 1) {
      let b = e.lastAttemptReason === "throttled" ? "throttled" : e.lastAttemptReason === "user-retry" ? "user retry" : "stalled";
      d.push(`attempt ${e.attempt} (${b})`);
    }
    let p = an(c) + 1 + an(v9o[t]);
    let m = d.length > 0 ? truncateToWidth(` \xB7 ${d.join(" \xB7 ")}`, Math.max(0, o - p)) : "";
    i.push([{
      text: c,
      color: u
    }, {
      text: " "
    }, {
      text: v9o[t],
      color: u,
      bold: true
    }, ...(m ? [{
      text: m,
      dimColor: true
    }] : [])]);
    let f = [];
    if (e.tokens != null) {
      f.push(`${formatTokens(e.tokens)} tok`);
    }
    if (e.toolCalls != null && e.toolCalls > 0) {
      f.push(`${e.toolCalls} ${un(e.toolCalls, "tool call")}`);
    }
    if (e.durationMs != null) {
      f.push(formatDuration(e.durationMs));
    }
    if (t === "queued" && e.queuedAt != null) {
      f.push(`waiting ${formatDuration(Math.max(0, s - e.queuedAt))}`);
    }
    if (t === "running" && e.lastProgressAt != null) {
      let b = Math.floor((s - e.lastProgressAt) / 1000);
      if (b >= 30) {
        f.push(`idle ${formatDuration(b * 1000)}`);
      }
    }
    if (f.length > 0) {
      i.push([{
        text: truncateToWidth(f.join(" \xB7 "), o),
        dimColor: true
      }]);
    }
    i.push([{
      text: ""
    }]);
    let h = n !== "loading" && n?.prompt ? n.prompt : e.promptPreview ?? "";
    let g = h ? E9o(h, l) : [];
    let y = g.length > 2;
    let _ = [{
      text: "Prompt",
      bold: true,
      dimColor: true
    }];
    if (y) {
      _.push({
        text: ` \xB7 ${g.length} lines${r ? "" : ` \xB7 ${"\u23CE"} expand`}`,
        dimColor: true
      });
    }
    if (i.push(_), h) {
      let b = r ? g : g.slice(0, 2);
      for (let S of b) {
        i.push([{
          text: "  " + S,
          dimColor: true
        }]);
      }
      if (!r && y) {
        let S = g.length - 2;
        i.push([{
          text: `${"  "}\u2026 ${S} more ${un(S, "line")}`,
          dimColor: true
        }]);
      }
    } else {
      i.push([{
        text: "  " + (t === "queued" ? "Available once the agent starts." : n === "loading" ? "Loading\u2026" : t === "running" ? "Not available yet (agent still running)." : "Transcript not available."),
        dimColor: true
      }]);
    }
    if (i.push([{
      text: ""
    }]), t !== "queued") {
      let b = n !== "loading" && n ? n.toolCalls : [];
      if (i.push([{
        text: "Activity",
        bold: true,
        dimColor: true
      }, ...(b.length > 3 ? [{
        text: ` \xB7 last ${3} of ${b.length} tool calls`,
        dimColor: true
      }] : [])]), b.length > 0) {
        for (let S of b.slice(-3)) {
          let E = S.summary ? `(${S.summary})` : "";
          i.push([{
            text: truncateToWidth(`  ${S.name}${E}`, o),
            dimColor: true
          }]);
        }
      } else if (e.lastToolName != null) {
        let S = e.lastToolSummary ? `(${e.lastToolSummary})` : "";
        i.push([{
          text: truncateToWidth(`  ${e.lastToolName}${S}`, o),
          dimColor: true
        }]);
      } else {
        i.push([{
          text: `  ${t === "running" ? "No tool calls yet." : "No tool calls."}`,
          dimColor: true
        }]);
      }
      i.push([{
        text: ""
      }]);
    }
    switch (i.push([{
      text: "Outcome",
      bold: true,
      dimColor: true
    }]), t) {
      case "queued":
        i.push([{
          text: "  Waiting for an agent slot.",
          dimColor: true
        }]);
        break;
      case "running":
        i.push([{
          text: `${"  "}Still running\u2026`,
          dimColor: true
        }]);
        break;
      case "interrupted":
        i.push([{
          text: "  The workflow stopped before this agent finished.",
          dimColor: true
        }]);
        break;
      case "skipped":
        i.push([{
          text: "  Skipped by user.",
          dimColor: true
        }]);
        break;
      case "failed":
        {
          for (let b of E9o(e.error ?? "failed", l)) {
            i.push([{
              text: "  " + b,
              color: "error"
            }]);
          }
          break;
        }
      case "done":
        {
          let b = n !== "loading" && n?.finalText ? n.finalText : e.resultPreview ?? "";
          if (!b) {
            i.push([{
              text: "  " + (n === "loading" ? "Loading\u2026" : "(empty)"),
              dimColor: true
            }]);
          } else {
            for (let S of E9o(b, l)) {
              i.push([{
                text: "  " + S
              }]);
            }
          }
          break;
        }
    }
    return {
      lines: i,
      promptExpandable: y
    };
  }
  function DZm(e) {
    let t = Jfe.c(42);
    let {
      phase: n,
      clampedAgent: r,
      agentLabel: o,
      detailLines: s,
      cardScroll: i,
      leftWidth: a,
      rightWidth: l,
      viewport: c,
      workflowActive: u,
      filterLabel: d
    } = e;
    let p = n.agents;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    let C;
    if (t[0] !== o || t[1] !== p || t[2] !== i || t[3] !== r || t[4] !== s || t[5] !== d || t[6] !== a || t[7] !== n.title || t[8] !== l || t[9] !== c || t[10] !== u) {
      let k = computeVisibleWindow(r, p.length, c);
      let I = Math.max(0, s.length - c);
      let O = nCt(i, 0, I);
      let M = Math.min(s.length, O + c);
      let L = [];
      for (let U = 0; U < c; U++) {
        let N = k.from + U;
        let W = N < k.to ? AZm(p[N], N, r, a, u) : [];
        let j = O + U;
        let z = j < M ? s[j] : [];
        L.push(ga.jsx(mec, {
          left: W,
          right: z,
          leftWidth: a,
          rightWidth: l
        }, U));
      }
      f = gXd;
      S = "column";
      let P = n.title;
      let F;
      if (t[21] !== p.length || t[22] !== d) {
        F = w9o(p.length, d);
        t[21] = p.length;
        t[22] = d;
        t[23] = F;
      } else {
        F = t[23];
      }
      let H = `${P} \xB7 ${F}`;
      if (t[24] !== o || t[25] !== a || t[26] !== l || t[27] !== H) {
        E = ga.jsx(Hcr, {
          pos: "top",
          leftWidth: a,
          rightWidth: l,
          leftTitle: H,
          rightTitle: o
        });
        t[24] = o;
        t[25] = a;
        t[26] = l;
        t[27] = H;
        t[28] = E;
      } else {
        E = t[28];
      }
      C = L;
      m = Hcr;
      h = "bottom";
      g = a;
      y = l;
      _ = p.length > c ? ZYe(k, p.length) : undefined;
      b = s.length > c ? ZYe({
        from: O,
        to: M
      }, s.length) : undefined;
      t[0] = o;
      t[1] = p;
      t[2] = i;
      t[3] = r;
      t[4] = s;
      t[5] = d;
      t[6] = a;
      t[7] = n.title;
      t[8] = l;
      t[9] = c;
      t[10] = u;
      t[11] = m;
      t[12] = f;
      t[13] = h;
      t[14] = g;
      t[15] = y;
      t[16] = _;
      t[17] = b;
      t[18] = S;
      t[19] = E;
      t[20] = C;
    } else {
      m = t[11];
      f = t[12];
      h = t[13];
      g = t[14];
      y = t[15];
      _ = t[16];
      b = t[17];
      S = t[18];
      E = t[19];
      C = t[20];
    }
    let x;
    if (t[29] !== m || t[30] !== h || t[31] !== g || t[32] !== y || t[33] !== _ || t[34] !== b) {
      x = ga.jsx(m, {
        pos: h,
        leftWidth: g,
        rightWidth: y,
        leftTag: _,
        rightTag: b
      });
      t[29] = m;
      t[30] = h;
      t[31] = g;
      t[32] = y;
      t[33] = _;
      t[34] = b;
      t[35] = x;
    } else {
      x = t[35];
    }
    let A;
    if (t[36] !== f || t[37] !== S || t[38] !== E || t[39] !== C || t[40] !== x) {
      A = ga.jsxs(f, {
        flexDirection: S,
        children: [E, C, x]
      });
      t[36] = f;
      t[37] = S;
      t[38] = E;
      t[39] = C;
      t[40] = x;
      t[41] = A;
    } else {
      A = t[41];
    }
    return A;
  }
  function MZm(e) {
    let t = Jfe.c(43);
    let {
      agentLabel: n,
      position: r,
      detailLines: o,
      cardScroll: s,
      contentWidth: i,
      viewport: a
    } = e;
    let l;
    if (t[0] !== i) {
      l = ("\u2500").repeat(i + 2);
      t[0] = i;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    let u = Math.max(0, o.length - a);
    let d;
    let p;
    if (t[2] !== n || t[3] !== c || t[4] !== s || t[5] !== i || t[6] !== o || t[7] !== u || t[8] !== r || t[9] !== a) {
      let h = nCt(s, 0, u);
      let g = Math.min(o.length, h + a);
      p = [];
      let y = ` \xB7 ${r}`;
      let _ = Math.max(1, i - an(y));
      let b;
      if (t[12] !== n || t[13] !== _) {
        b = truncateToWidth(n, _);
        t[12] = n;
        t[13] = _;
        t[14] = b;
      } else {
        b = t[14];
      }
      let S;
      if (t[15] !== b) {
        S = {
          text: b,
          color: "permission",
          bold: true
        };
        t[15] = b;
        t[16] = S;
      } else {
        S = t[16];
      }
      let E;
      if (t[17] !== y) {
        E = {
          text: y,
          dimColor: true
        };
        t[17] = y;
        t[18] = E;
      } else {
        E = t[18];
      }
      let C;
      if (t[19] !== S || t[20] !== E) {
        C = [S, E];
        t[19] = S;
        t[20] = E;
        t[21] = C;
      } else {
        C = t[21];
      }
      let x;
      if (t[22] !== i || t[23] !== C) {
        x = ga.jsx(Yfe, {
          contentWidth: i,
          segs: C
        }, "title");
        t[22] = i;
        t[23] = C;
        t[24] = x;
      } else {
        x = t[24];
      }
      p.push(x);
      for (let A = h; A < g; A++) {
        p.push(ga.jsx(Yfe, {
          contentWidth: i,
          segs: o[A]
        }, `l-${A}`));
      }
      for (let A = g - h; A < a; A++) {
        p.push(ga.jsx(Yfe, {
          contentWidth: i,
          segs: [{
            text: ""
          }]
        }, `pad-${A}`));
      }
      if (o.length > a) {
        let A = ` ${ZYe({
          from: h,
          to: g
        }, o.length)} `;
        let k = Math.max(0, i + 2 - an(A));
        let I;
        if (t[25] !== k) {
          I = ("\u2500").repeat(k);
          t[25] = k;
          t[26] = I;
        } else {
          I = t[26];
        }
        let O;
        if (t[27] !== I) {
          O = ga.jsxs(Text, {
            color: "text",
            children: [" ", lF.bottomLeft, I]
          });
          t[27] = I;
          t[28] = O;
        } else {
          O = t[28];
        }
        let M;
        if (t[29] !== A) {
          M = ga.jsx(Text, {
            dimColor: true,
            children: A
          });
          t[29] = A;
          t[30] = M;
        } else {
          M = t[30];
        }
        let L;
        if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
          L = ga.jsx(Text, {
            color: "text",
            children: lF.bottomRight
          });
          t[31] = L;
        } else {
          L = t[31];
        }
        let P;
        if (t[32] !== M || t[33] !== O) {
          P = ga.jsxs(Text, {
            wrap: "truncate-end",
            children: [O, M, L]
          });
          t[32] = M;
          t[33] = O;
          t[34] = P;
        } else {
          P = t[34];
        }
        d = P;
      } else {
        let A;
        if (t[35] !== c) {
          A = ga.jsxs(Text, {
            color: "text",
            wrap: "truncate-end",
            children: [" ", lF.bottomLeft, c, lF.bottomRight]
          });
          t[35] = c;
          t[36] = A;
        } else {
          A = t[36];
        }
        d = A;
      }
      t[2] = n;
      t[3] = c;
      t[4] = s;
      t[5] = i;
      t[6] = o;
      t[7] = u;
      t[8] = r;
      t[9] = a;
      t[10] = d;
      t[11] = p;
    } else {
      d = t[10];
      p = t[11];
    }
    let m;
    if (t[37] !== c) {
      m = ga.jsxs(Text, {
        color: "text",
        wrap: "truncate-end",
        children: [" ", lF.topLeft, c, lF.topRight]
      });
      t[37] = c;
      t[38] = m;
    } else {
      m = t[38];
    }
    let f;
    if (t[39] !== d || t[40] !== p || t[41] !== m) {
      f = ga.jsxs(gXd, {
        flexDirection: "column",
        children: [m, p, d]
      });
      t[39] = d;
      t[40] = p;
      t[41] = m;
      t[42] = f;
    } else {
      f = t[42];
    }
    return f;
  }
  function WorkflowDetailDialog({
    workflow: e,
    onDone: t,
    onBack: n,
    onKill: r,
    onSkipAgent: o,
    onRetryAgent: s,
    onPause: i,
    onResume: a,
    initialPhaseIndex: l
  }) {
    Jg("workflow-detail-dialog");
    let {
      availableRows: c,
      width: u,
      rows: d
    } = nAl();
    let p = Math.max(12, u - 6);
    let m = rAl(e);
    let f = ZM.useMemo(() => aAl(e), [e.workflowProgress, e.phases]);
    let h = ZM.useMemo(() => lAl(f, e.agentCount), [f, e.agentCount]);
    let [g, y] = ZM.useState(() => l !== undefined ? Math.max(0, l) : 0);
    let [_, b] = ZM.useState(0);
    let [S, E] = ZM.useState(l !== undefined ? "agents" : "phases");
    let [C, x] = ZM.useState(false);
    let [A, k] = ZM.useState(0);
    let [I, O] = ZM.useState(false);
    let [M, L] = ZM.useState("all");
    let P = Math.min(g, Math.max(0, f.length - 1));
    let F = f[P];
    let H = e.status === "running";
    let U = ZM.useMemo(() => {
      if (!F || M === "all" || S === "phases") {
        return F;
      }
      return {
        ...F,
        agents: F.agents.filter(mt => agentDisplayStatus(mt, H) === M)
      };
    }, [F, M, S, H]);
    let N = U ? Math.min(_, Math.max(0, U.agents.length - 1)) : 0;
    let [W, j] = ZM.useState(false);
    let z = e.script.length > 0;
    let V = ZM.useMemo(() => {
      if (!z) {
        return "";
      }
      let mt = fA(e.script);
      if (!("error" in mt)) {
        return mt.meta.name;
      }
      return zbe(e.summary ?? e.description);
    }, [z, e.script, e.summary, e.description]);
    let K = ZM.useMemo(() => cAl(e), [e.script, e.description, e.summary]);
    let {
      name: J,
      subtext: Q,
      stats: Z
    } = uAl(e, K, h, m);
    function ne() {
      k(0);
      O(false);
    }
    function oe(mt) {
      y(Dt => nCt(nCt(Dt, 0, f.length - 1) + mt, 0, f.length - 1));
      b(0);
      ne();
    }
    function ee(mt) {
      if (!U) {
        return;
      }
      b(Dt => nCt(nCt(Dt, 0, U.agents.length - 1) + mt, 0, U.agents.length - 1));
      ne();
    }
    function re(mt) {
      k(Dt => Math.max(0, Dt + mt));
    }
    function se(mt) {
      if (S === "phases") {
        oe(mt);
        return;
      }
      ee(mt);
    }
    function ae() {
      if (x(false), S === "agent") {
        E("agents");
        return;
      }
      if (S === "agents") {
        E("phases");
        return;
      }
      if (n) {
        n();
      } else {
        t();
      }
    }
    function de() {
      if (F && F.agents.length > 0) {
        b(0);
        L("all");
        E("agents");
      }
    }
    function be() {
      if (!me || !F) {
        return;
      }
      if (M !== "all") {
        L("all");
        b(F.agents.indexOf(me));
      }
      if (ne(), Ie === "loading") {
        x(true);
      } else {
        E("agent");
      }
    }
    function fe() {
      if (!F || C) {
        return;
      }
      let mt = new Set(F.agents.map(Dt => agentDisplayStatus(Dt, H)));
      L(Dt => {
        let jt = wen.indexOf(Dt);
        for (let bn = 0; bn < wen.length; bn++) {
          jt = (jt + 1) % wen.length;
          let Ct = wen[jt];
          if (Ct === "all" || mt.vZc(Ct)) {
            break;
          }
        }
        return wen[jt];
      });
      b(0);
      ne();
    }
    let me = S !== "phases" && U ? U.agents[N] : undefined;
    let Te = me ? agentDisplayStatus(me, H) : undefined;
    let ue = !!me && QYe(me) && !!me.agentId && (!!o || !!r);
    let ce = !!me && QYe(me) && !!me.agentId && !!s;
    let le = u - 9;
    let pe = U ? Math.max(14, ...U.agents.map(mt => 4 + an(mt.label))) : 14;
    let ve = Math.max(12, Math.min(30, pe, le - 30));
    let _e = le - ve;
    let xe = S === "agent" && f.length > 0 && u >= 64 && _e >= 30;
    let ke = xe ? _e : p;
    let Ie = OZm(e.workflowRunId, me?.agentId, me?.toolCalls);
    let Ue = useTimeout(C ? 100 : null);
    if (C) {
      if (!me) {
        x(false);
      } else if (Ie !== "loading" || Ue) {
        x(false);
        E("agent");
      }
    }
    let Ge = Te === "queued" || Te === "running" ? Math.floor(Date.now() / 1000) * 1000 : 0;
    let Be = ZM.useMemo(() => S === "agent" && me && Te ? buildAgentDetailLines({
      agent: me,
      status: Te,
      transcript: Ie,
      promptExpanded: I,
      width: ke,
      nowMs: Ge
    }) : {
      lines: [],
      promptExpandable: false
    }, [S, me, Te, Ie, I, ke, Ge]);
    let We = Be.lines;
    function Ze() {
      if (!me || !QYe(me)) {
        return;
      }
      if (me.agentId && o) {
        o(me.agentId);
      } else if (r) {
        r();
      }
    }
    function Tt() {
      if (me && QYe(me) && me.agentId) {
        s?.(me.agentId);
      }
    }
    jo({
      "confirm:previous": () => se(-1),
      "confirm:next": () => se(1)
    }, {
      context: "Confirmation"
    });
    let kt = e.status === "running" && !!i;
    let Ye = e.status === "paused" && !!e.scriptPath && !!e.workflowRunId && !!a;
    let ht = e.status === "running" && !!r && S === "phases";
    function It() {
      if (kt) {
        i?.();
      } else if (Ye) {
        a?.(buildResumePrompt(e));
      }
    }
    let Rt = mt => {
      if (mt.ctrl || mt.meta) {
        return;
      }
      if (mt.key === "j") {
        if (mt.preventDefault(), S === "agent") {
          re(1);
        } else {
          se(1);
        }
      } else if (mt.key === "k") {
        if (mt.preventDefault(), S === "agent") {
          re(-1);
        } else {
          se(-1);
        }
      } else if (mt.key === "return" || mt.key === "right") {
        if (mt.preventDefault(), S === "phases") {
          de();
        } else if (S === "agents") {
          be();
        } else if (mt.key === "return" && Be.promptExpandable) {
          O(Dt => !Dt);
          k(0);
        }
      } else if (mt.key === "left") {
        mt.preventDefault();
        ae();
      } else if (mt.key === "r" && ce) {
        mt.preventDefault();
        Tt();
      } else if (mt.key === "x" && ue) {
        mt.preventDefault();
        Ze();
      } else if (mt.key === "x" && ht) {
        mt.preventDefault();
        r?.();
      } else if (mt.key === " ") {
        mt.preventDefault();
        t();
      } else if (mt.key === "p" && (kt || Ye)) {
        mt.preventDefault();
        It();
      } else if (mt.key === "f" && S === "agents") {
        mt.preventDefault();
        fe();
      } else if (mt.key === "s" && z) {
        mt.preventDefault();
        j(true);
      }
    };
    let wt = f.length > 0;
    if (W) {
      return ga.jsx($cr, {
        script: e.script,
        defaultName: V,
        onDone: mt => {
          if (mt) {
            t(mt);
          } else {
            j(false);
          }
        }
      });
    }
    let vt = c < 18;
    let yt = c - (vt ? 8 : 11);
    let gt = Math.max(1, yt - 3);
    let Ft = f.length > gt;
    let on = Ft ? Math.max(1, gt - 1) : f.length;
    let rn = Math.max(1, yt - on - (Ft ? 1 : 0));
    let Sn = computeVisibleWindow(P, f.length, on);
    let jn = Math.max(14, ...f.map((mt, Dt) => {
      let jt = mt.status === "done" ? vGd.tick : mt.status === "failed" ? vGd.cross : String(Dt + 1);
      let bn = mt.totalCount > 0 ? `${mt.doneCount}/${mt.totalCount}` : "";
      return 2 + an(jt) + 1 + an(mt.title) + (bn ? 1 + an(bn) : 0);
    }));
    let Xr = Math.max(12, Math.min(34, jn, le - 24));
    let co = le - Xr;
    let Yt = S !== "agent" && wt && u >= 64 && co >= 20;
    let Ee = Math.max(1, c - (vt ? 7 : 8));
    let Re = Math.max(3, c - (vt ? 8 : 9));
    let Ce = xe ? Ee : Re;
    let Fe = Math.max(0, We.length - Ce);
    if (A > Fe) {
      k(Fe);
    }
    let Xe = M !== "all" && S !== "phases" ? v9o[M].toLowerCase() : undefined;
    let He = [];
    if (S === "agent") {
      if (He.push(`${"\u2191"}${"\u2193"} agent`), We.length > Ce) {
        He.push("j/k scroll");
      }
      if (Be.promptExpandable) {
        He.push(`${"\u23CE"} prompt`);
      }
    } else if (wt) {
      He.push(`${"\u2191"}${"\u2193"} select`);
    }
    if (ue) {
      He.push("x stop");
    }
    if (ht) {
      He.push("x stop workflow");
    }
    if (ce) {
      He.push("r restart");
    }
    if (kt) {
      He.push("p pause");
    } else if (Ye) {
      He.push("p resume");
    }
    if (S === "agents" && wt) {
      He.push(Xe ? `f filter: ${Xe}` : "f filter");
    }
    if (He.push("esc back"), z) {
      He.push("s save");
    }
    let Gt = He.join(" \xB7 ");
    return ga.jsx(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: Rt,
      children: ga.jsx(or, {
        title: null,
        hideBorder: true,
        hideInputGuide: true,
        onCancel: ae,
        color: "text",
        children: ga.jsxs(gXd, {
          flexDirection: "column",
          width: u,
          minHeight: Math.max(vt ? 8 : 12, Math.min(c - 1, d - 6)),
          maxHeight: Math.max(vt ? 8 : 11, c - 1),
          overflowY: "hidden",
          children: [!wt ? ga.jsxs(ga.Fragment, {
            children: [ga.jsx(sc, {
              children: "No agents yet."
            }), ga.jsx(gXd, {
              flexGrow: 1
            })]
          }) : S === "agent" && me && U ? ga.jsxs(ga.Fragment, {
            children: [ga.jsx(utr, {
              name: J,
              subtext: Q,
              stats: Z,
              width: u
            }), !vt && ga.jsx(gXd, {
              height: 1
            }), xe ? ga.jsx(DZm, {
              phase: U,
              clampedAgent: N,
              agentLabel: me.label,
              detailLines: We,
              cardScroll: A,
              leftWidth: ve,
              rightWidth: _e,
              viewport: Ee,
              workflowActive: H,
              filterLabel: Xe
            }) : ga.jsx(MZm, {
              agentLabel: me.label,
              position: `${N + 1}/${U.agents.length}`,
              detailLines: We,
              cardScroll: A,
              contentWidth: p,
              viewport: Re
            }), ga.jsx(gXd, {
              flexGrow: 1
            })]
          }) : Yt && U ? ga.jsxs(ga.Fragment, {
            children: [ga.jsx(utr, {
              name: J,
              subtext: Q,
              stats: Z,
              width: u
            }), !vt && ga.jsx(gXd, {
              height: 1
            }), ga.jsx(IZm, {
              phases: f,
              selectedPhase: U,
              clampedPhase: P,
              clampedAgent: N,
              level: S === "phases" ? "phases" : "agents",
              leftWidth: Xr,
              rightWidth: co,
              viewport: Ee,
              workflowActive: H,
              filterLabel: Xe
            }), ga.jsx(gXd, {
              flexGrow: 1
            })]
          }) : ga.jsxs(ga.Fragment, {
            children: [ga.jsx(utr, {
              name: J,
              subtext: Q,
              stats: Z,
              width: u
            }), !vt && ga.jsx(gXd, {
              height: 1
            }), f.slice(Sn.from, Sn.to).map((mt, Dt) => {
              let jt = Sn.from + Dt;
              return ga.jsx(oAl, {
                index: jt + 1,
                title: mt.title,
                done: mt.doneCount,
                total: mt.totalCount,
                status: mt.status,
                selected: jt === P
              }, `${jt}-${mt.title}`);
            }), Ft && ga.jsx(PhaseScrollIndicator, {
              win: Sn,
              total: f.length
            }), ga.jsx(gXd, {
              flexGrow: 1
            }), U ? ga.jsx(EZm, {
              phase: U,
              selectedAgent: N,
              level: S === "phases" ? "phases" : "agents",
              contentWidth: p,
              viewport: rn,
              tight: vt,
              workflowActive: H,
              filterLabel: Xe
            }) : null]
          }), ga.jsxs(Text, {
            dimColor: true,
            italic: true,
            wrap: "truncate-end",
            children: [" ", Gt]
          })]
        })
      })
    });
  }
  var Jfe;
  var ZM;
  var ga;
  var wen;
  var v9o;
  var qcr = __lazy(() => {
    wl();
    px();
    bc();
    et();
    Bs();
    Dpe();
    XLo();
    Bse();
    sec();
    tFo();
    ptr();
    DJ();
    cs();
    Zn();
    dI();
    Ii();
    xb();
    b9o();
    Jfe = __toESM(pt(), 1);
    ZM = __toESM(ot(), 1);
    ga = __toESM(ie(), 1);
    wen = ["all", "running", "queued", "failed", "done", "skipped", "interrupted"];
    v9o = {
      queued: "Queued",
      running: "Running",
      done: "Completed",
      failed: "Failed",
      skipped: "Skipped",
      interrupted: "Stopped"
    };
  });
  function C9o(e) {
    return e !== "mcp_task" && e !== "monitor_ws";
  }
  function LZm(e, t) {
    return Object.values(e ?? {}).filter(kv).filter(r => !(r.type === "local_agent" && r.id === t));
  }
  function zcr({
    onDone: e,
    toolUseContext: t,
    initialDetailTaskId: n,
    onBack: r
  }) {
    let o = bt(J => J.tasks);
    let s = bt(J => J.foregroundedTaskId);
    let i = Lo();
    let a = Rv();
    let l = Zu("chat:killAgents", "Chat", "ctrl+x ctrl+k");
    let c = o;
    let u = wie.useRef(false);
    let [d, p] = wie.useState(() => {
      if (n) {
        u.current = true;
        return {
          mode: "detail",
          itemId: n
        };
      }
      let J = LZm(c, s);
      if (J.length === 1 && C9o(J[0].type)) {
        u.current = true;
        return {
          mode: "detail",
          itemId: J[0].id
        };
      }
      return {
        mode: "list"
      };
    });
    let [m, f] = wie.useState(0);
    Jg("background-tasks-dialog");
    let {
      bashTasks: h,
      remoteSessions: g,
      agentTasks: y,
      teammateTasks: _,
      workflowTasks: b,
      mcpMonitors: S,
      mcpTasks: E,
      dreamTasks: C,
      allSelectableItems: x
    } = wie.useMemo(() => {
      let Z = Object.values(c ?? {}).filter(kv).map(FZm).sort((me, Te) => {
        let ue = me.status;
        let ce = Te.status;
        if (ue === "running" && ce !== "running") {
          return -1;
        }
        if (ue !== "running" && ce === "running") {
          return 1;
        }
        let le = "task" in me ? me.task.startTime : 0;
        return ("task" in Te ? Te.task.startTime : 0) - le;
      });
      let ne = Z.filter(me => me.type === "local_bash");
      let oe = Z.filter(me => me.type === "remote_agent");
      let ee = Z.filter(me => me.type === "local_agent" && me.id !== s);
      let re = Z.filter(me => me.type === "local_workflow");
      let se = Z.filter(me => me.type === "monitor_mcp" || me.type === "monitor_ws");
      let ae = Z.filter(me => me.type === "mcp_task");
      let de = Z.filter(me => me.type === "dream");
      let be = Z.filter(me => me.type === "in_process_teammate");
      let fe = be.length > 0 ? [{
        id: "__leader__",
        type: "leader",
        label: `@${"team-lead"}`,
        status: "running"
      }] : [];
      return {
        bashTasks: ne,
        remoteSessions: oe,
        agentTasks: ee,
        workflowTasks: re,
        mcpMonitors: se,
        mcpTasks: ae,
        dreamTasks: de,
        teammateTasks: [...fe, ...be],
        allSelectableItems: [...fe, ...be, ...ne, ...se, ...ae, ...oe, ...ee, ...re, ...de]
      };
    }, [c, s]);
    let A = x[m] ?? null;
    jo({
      "confirm:previous": () => f(J => Math.max(0, J - 1)),
      "confirm:next": () => f(J => Math.min(x.length - 1, J + 1)),
      "confirm:yes": () => {
        let J = x[m];
        if (J) {
          if (J.type === "leader") {
            I5(i);
            e("Viewing leader", {
              display: "system"
            });
          } else if (C9o(J.type)) {
            p({
              mode: "detail",
              itemId: J.id
            });
          }
        }
      }
    }, {
      context: "Confirmation",
      isActive: d.mode === "list"
    });
    let k = J => {
      if (d.mode !== "list") {
        return;
      }
      if (J.key === "left") {
        J.preventDefault();
        e("Background dialog dismissed", {
          display: "skip"
        });
        return;
      }
      let Q = x[m];
      if (!Q) {
        return;
      }
      if (J.key === "x" && !J.ctrl && !J.meta) {
        if (J.preventDefault(), Q.type === "local_bash" && Q.status === "running") {
          I(Q.id);
        } else if (Q.type === "local_agent" && Q.status === "running") {
          O(Q.id);
        } else if (Q.type === "in_process_teammate" && Q.status === "running") {
          M(Q.id);
        } else if (Q.type === "local_workflow" && Q.status === "running" && Wcr) {
          Wcr(Q.id, a);
        } else if (Q.type === "monitor_mcp" && Q.status === "running" && Gcr) {
          Gcr(Q.id, a);
        } else if (Q.type === "monitor_ws" && Q.status === "running") {
          Fve(Q.id, a);
        } else if (Q.type === "mcp_task" && Q.status === "running" && null) {
          null(Q.id, a, i);
        } else if (Q.type === "dream" && Q.status === "running") {
          L(Q.id);
        } else if (Q.type === "remote_agent" && Q.status === "running") {
          if (Q.task.isUltraplan) {
            JGo(Q.id, Q.task.sessionId, a, i);
          } else if (Q.task.isRemoteReview) {
            XGo(Q.id, Q.task.sessionId, a, i);
          } else {
            P(Q.id);
          }
        }
      }
      if (J.key === "f" && !J.ctrl && !J.meta) {
        if (Q.type === "in_process_teammate" && Q.status === "running") {
          J.preventDefault();
          iCe(Q.id, i);
          e("Viewing teammate", {
            display: "system"
          });
        } else if (Q.type === "leader") {
          J.preventDefault();
          I5(i);
          e("Viewing leader", {
            display: "system"
          });
        }
      }
    };
    function I(J) {
      return Pjn.kill(J, a, i);
    }
    function O(J) {
      let Q = a.get(J);
      if (za(Q) && (Q.status === "running" || gT(Q))) {
        rfe(J, a);
      }
      return h5n.kill(J, a, i, "user");
    }
    function M(J) {
      return gXn.kill(J, a, i);
    }
    function L(J) {
      return qtr.kill(J, a, i);
    }
    function P(J) {
      return Oze.kill(J, a, i);
    }
    let F = wie.useEffectEvent(e);
    wie.useEffect(() => {
      if (d.mode !== "list") {
        let Q = (c ?? {})[d.itemId];
        if (!Q || Q.type !== "local_workflow" && !kv(Q)) {
          if (u.current) {
            F("Background dialog dismissed", {
              display: "skip"
            });
          } else {
            p({
              mode: "list"
            });
          }
        }
      }
      let J = x.length;
      if (m >= J && J > 0) {
        f(J - 1);
      }
    }, [d, c, m, x, F]);
    let H = () => {
      if (r) {
        r();
      } else if (u.current && x.length <= 1) {
        e("Background dialog dismissed", {
          display: "skip"
        });
      } else {
        u.current = false;
        p({
          mode: "list"
        });
      }
    };
    let U = Bn(y, J => J.status === "running") > 1;
    if (d.mode !== "list" && c) {
      let J = c[d.itemId];
      if (!J) {
        return null;
      }
      switch (J.type) {
        case "local_bash":
          return Ka.jsx(tec, {
            shell: J,
            onDone: e,
            onKillShell: () => void I(J.id),
            onBack: H
          }, `shell-${J.id}`);
        case "local_agent":
          return Ka.jsx(DZl, {
            agent: J,
            onDone: e,
            onKillAgent: () => void O(J.id),
            onBack: H,
            killAllAgentsShortcut: U ? l : undefined
          }, `agent-${J.id}`);
        case "remote_agent":
          return Ka.jsx(ZZl, {
            session: J,
            onDone: e,
            toolUseContext: t,
            onBack: H,
            onKill: J.status !== "running" ? undefined : J.isUltraplan ? () => void JGo(J.id, J.sessionId, a, i) : J.isRemoteReview ? () => void XGo(J.id, J.sessionId, a, i) : () => void P(J.id)
          }, `session-${J.id}`);
        case "in_process_teammate":
          return Ka.jsx(GZl, {
            teammate: J,
            onDone: e,
            onKill: J.status === "running" ? () => void M(J.id) : undefined,
            onBack: H,
            onForeground: J.status === "running" ? () => {
              iCe(J.id, i);
              e("Viewing teammate", {
                display: "system"
              });
            } : undefined
          }, `teammate-${J.id}`);
        case "local_workflow":
          if (!gec) {
            return null;
          }
          return Ka.jsx(gec, {
            workflow: J,
            onDone: e,
            onKill: J.status === "running" && Wcr ? () => Wcr(J.id, a) : undefined,
            onPause: J.status === "running" && yec ? () => yec(J.id, a) : undefined,
            onSkipAgent: J.status === "running" && _ec ? Q => _ec(J.id, Q, a) : undefined,
            onRetryAgent: J.status === "running" && bec ? Q => bec(J.id, Q, a) : undefined,
            onBack: H
          }, `workflow-${J.id}`);
        case "monitor_mcp":
          if (!null) {
            return null;
          }
          return Ka.jsx(null, {
            task: J,
            onKill: J.status === "running" && Gcr ? () => Gcr(J.id, a) : undefined,
            onBack: H
          }, `monitor-mcp-${J.id}`);
        case "dream":
          return Ka.jsx(jZl, {
            task: J,
            onDone: () => e("Background dialog dismissed", {
              display: "skip"
            }),
            onBack: H,
            onKill: J.status === "running" ? () => void L(J.id) : undefined
          }, `dream-${J.id}`);
      }
    }
    let N = Bn(h, J => J.status === "running");
    let W = Bn(g, J => J.status === "running" || J.status === "pending") + Bn(y, J => J.status === "running");
    let j = Bn(_, J => J.status === "running");
    let z = eke([...(j > 0 ? [Ka.jsxs(Text, {
      children: [j, " ", j !== 1 ? "agents" : "agent"]
    }, "teammates")] : []), ...(N > 0 ? [Ka.jsxs(Text, {
      children: [N, " ", N !== 1 ? "active shells" : "active shell"]
    }, "shells")] : []), ...(W > 0 ? [Ka.jsxs(Text, {
      children: [W, " ", W !== 1 ? "active agents" : "active agent"]
    }, "agents")] : [])], J => Ka.jsx(Text, {
      children: " \xB7 "
    }, `separator-${J}`));
    let V = [Ka.jsx(xt, {
      chord: ["up", "down"],
      action: "select"
    }, "upDown"), ...(!A || C9o(A.type) ? [Ka.jsx(xt, {
      chord: "enter",
      action: "view"
    }, "enter")] : []), ...(A?.type === "in_process_teammate" && A.status === "running" ? [Ka.jsx(xt, {
      chord: "f",
      action: "foreground"
    }, "foreground")] : []), ...((A?.type === "local_bash" || A?.type === "local_agent" || A?.type === "in_process_teammate" || A?.type === "local_workflow" || A?.type === "monitor_mcp" || A?.type === "monitor_ws" || A?.type === "mcp_task" || A?.type === "dream" || A?.type === "remote_agent") && A.status === "running" ? [Ka.jsx(xt, {
      chord: "x",
      action: "stop"
    }, "kill"), ...(A.type === "local_agent" && U ? [Ka.jsx(xt, {
      chord: l,
      action: "stop all agents",
      format: {
        keyCase: "lower"
      }
    }, "kill-all")] : [])] : []), Ka.jsx(xt, {
      chord: ["left", "escape"],
      action: "close"
    }, "esc")];
    return Ka.jsx(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: k,
      children: Ka.jsx(or, {
        title: "Background",
        subtitle: Ka.jsx(Ka.Fragment, {
          children: z
        }),
        onCancel: () => e("Background dialog dismissed", {
          display: "skip"
        }),
        color: "background",
        inputGuide: Ka.jsx(Hn, {
          children: V
        }),
        children: x.length === 0 ? Ka.jsx(sc, {
          children: "No tasks currently running"
        }) : Ka.jsxs(gXd, {
          flexDirection: "column",
          children: [_.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            children: [(h.length > 0 || g.length > 0 || y.length > 0) && Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Agents"]
              }), " (", Bn(_, J => J.type !== "leader"), ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: Ka.jsx(UZm, {
                teammateTasks: _,
                currentSelectionId: A?.id
              })
            })]
          }), h.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 ? 1 : 0,
            children: [(_.length > 0 || g.length > 0 || y.length > 0) && Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Shells"]
              }), " (", h.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: h.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), S.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 ? 1 : 0,
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Monitors"]
              }), " (", S.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: S.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), E.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 || S.length > 0 ? 1 : 0,
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "MCP tasks"]
              }), " (", E.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: E.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), g.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 || S.length > 0 || E.length > 0 ? 1 : 0,
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Cloud agents"]
              }), " (", g.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: g.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), y.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 || S.length > 0 || E.length > 0 || g.length > 0 ? 1 : 0,
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Local agents"]
              }), " (", y.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: y.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), b.length > 0 && Ka.jsxs(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 || S.length > 0 || E.length > 0 || g.length > 0 || y.length > 0 ? 1 : 0,
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: [Ka.jsxs(Text, {
                bold: true,
                children: ["  ", "Dynamic workflows"]
              }), " (", b.length, ")"]
            }), Ka.jsx(gXd, {
              flexDirection: "column",
              children: b.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })]
          }), C.length > 0 && Ka.jsx(gXd, {
            flexDirection: "column",
            marginTop: _.length > 0 || h.length > 0 || S.length > 0 || E.length > 0 || g.length > 0 || y.length > 0 || b.length > 0 ? 1 : 0,
            children: Ka.jsx(gXd, {
              flexDirection: "column",
              children: C.map(J => Ka.jsx(uCe, {
                item: J,
                isSelected: J.id === A?.id
              }, J.id))
            })
          })]
        })
      })
    });
  }
  function FZm(e) {
    switch (e.type) {
      case "local_bash":
        return {
          id: e.id,
          type: "local_bash",
          label: e.kind === "monitor" ? e.description : e.command,
          status: e.status,
          task: e
        };
      case "remote_agent":
        return {
          id: e.id,
          type: "remote_agent",
          label: e.title,
          status: e.status,
          task: e
        };
      case "local_agent":
        return {
          id: e.id,
          type: "local_agent",
          label: e.description,
          status: e.status,
          task: e
        };
      case "in_process_teammate":
        return {
          id: e.id,
          type: "in_process_teammate",
          label: `@${e.identity.agentName}`,
          status: e.status,
          task: e
        };
      case "local_workflow":
        return {
          id: e.id,
          type: "local_workflow",
          label: e.summary ?? e.description,
          status: e.status,
          task: e
        };
      case "monitor_mcp":
        return {
          id: e.id,
          type: "monitor_mcp",
          label: e.description,
          status: e.status,
          task: e
        };
      case "monitor_ws":
        return {
          id: e.id,
          type: "monitor_ws",
          label: e.description,
          status: e.status,
          task: e
        };
      case "mcp_task":
        return {
          id: e.id,
          type: "mcp_task",
          label: e.description,
          status: e.status,
          task: e
        };
      case "dream":
        return {
          id: e.id,
          type: "dream",
          label: e.description,
          status: e.status,
          task: e
        };
    }
  }
  function uCe(e) {
    let t = R9o.c(14);
    let {
      item: n,
      isSelected: r
    } = e;
    let {
      columns: o
    } = Sr();
    let s = Math.max(30, o - 26);
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = isCoordinatorMode();
      t[0] = i;
    } else {
      i = t[0];
    }
    let a = i;
    let l = a && r;
    let c = r ? vGd.pointer + " " : "  ";
    let u;
    if (t[1] !== l || t[2] !== c) {
      u = Ka.jsx(Text, {
        dimColor: l,
        children: c
      });
      t[1] = l;
      t[2] = c;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = r && !a ? "suggestion" : undefined;
    let p;
    if (t[4] !== n.task || t[5] !== n.type || t[6] !== s) {
      p = n.type === "leader" ? Ka.jsxs(Text, {
        children: ["@", "team-lead"]
      }) : Ka.jsx(BZl, {
        task: n.task,
        maxActivityWidth: s
      });
      t[4] = n.task;
      t[5] = n.type;
      t[6] = s;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== d || t[9] !== p) {
      m = Ka.jsx(Text, {
        color: d,
        children: p
      });
      t[8] = d;
      t[9] = p;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f;
    if (t[11] !== u || t[12] !== m) {
      f = Ka.jsxs(gXd, {
        flexDirection: "row",
        children: [u, m]
      });
      t[11] = u;
      t[12] = m;
      t[13] = f;
    } else {
      f = t[13];
    }
    return f;
  }
  function UZm(e) {
    let t = R9o.c(3);
    let {
      teammateTasks: n,
      currentSelectionId: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      let s = n.filter($Zm);
      let i = n.filter(BZm);
      let a = new Map();
      for (let c of i) {
        let u = c.task.identity.teamName;
        let d = a.get(u);
        if (d) {
          d.push(c);
        } else {
          a.set(u, [c]);
        }
      }
      let l = [...a.entries()];
      o = Ka.jsx(Ka.Fragment, {
        children: l.map(c => {
          let [u, d] = c;
          let p = d.length + s.length;
          return Ka.jsxs(gXd, {
            flexDirection: "column",
            children: [Ka.jsxs(Text, {
              dimColor: true,
              children: ["  ", "Team: ", u, " (", p, ")"]
            }), s.map(m => Ka.jsx(uCe, {
              item: m,
              isSelected: m.id === r
            }, `${m.id}-${u}`)), d.map(m => Ka.jsx(uCe, {
              item: m,
              isSelected: m.id === r
            }, m.id))]
          }, u);
        })
      });
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function BZm(e) {
    return e.type === "in_process_teammate";
  }
  function $Zm(e) {
    return e.type === "leader";
  }
  var R9o;
  var wie;
  var Ka;
  var gec;
  var Vcr;
  var Wcr;
  var yec;
  var _ec;
  var bec;
  var Gcr;
  var x9o = __lazy(() => {
    N1();
    ki();
    ho();
    GUe();
    _9();
    Wtr();
    lLe();
    ry();
    zX();
    S7t();
    tZ();
    e7e();
    eL();
    KYe();
    px();
    et();
    Bs();
    c0();
    Ai();
    Ii();
    xb();
    bs();
    MZl();
    $Zl();
    qZl();
    VZl();
    g9o();
    nec();
    R9o = __toESM(pt(), 1);
    wie = __toESM(ot(), 1);
    Ka = __toESM(ie(), 1);
    gec = (qcr(), __toCommonJS(hec)).WorkflowDetailDialog;
    Vcr = (Dpe(), __toCommonJS(Kwo));
    Wcr = Vcr?.killWorkflowTask ?? null;
    yec = Vcr?.pauseWorkflowTask ?? null;
    _ec = Vcr?.skipWorkflowAgent ?? null;
    bec = Vcr?.retryWorkflowAgent ?? null;
    Gcr = (null)?.killMonitorMcp ?? null;
  });
  var Eec = {};
  __export(Eec, {
    call: () => call_export51
  });
  async function call_export51(e, t) {
    return vec.jsx(zcr, {
      toolUseContext: t,
      onDone: e
    });
  }
  var vec;
  var wec = __lazy(() => {
    x9o();
    vec = __toESM(ie(), 1);
  });
  var jZm;
  function kec(e) {
    let t = xec.c(8);
    let [n, r] = Kcr.useState(false);
    let [o, s] = Kcr.useState(null);
    let [i, a] = Kcr.useState(null);
    let l;
    if (t[0] !== e) {
      l = async m => {
        r(true);
        s(null);
        a(m);
        logEvent("tengu_teleport_resume_session", {
          source: e,
          session_id: m.id
        });
        try {
          let f = await vl("teleport_resume", () => teleportResumeCodeSession(m.id));
          setTeleportedSessionInfo({
            sessionId: m.id
          });
          r(false);
          return f;
        } catch (f) {
          let h = f;
          let g = {
            message: h instanceof eS ? h.message : he(h),
            formattedMessage: h instanceof eS ? h.formattedMessage : undefined,
            isOperationError: h instanceof eS
          };
          s(g);
          r(false);
          return null;
        }
      };
      t[0] = e;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    let u;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        s(null);
      };
      t[2] = u;
    } else {
      u = t[2];
    }
    let d = u;
    let p;
    if (t[3] !== o || t[4] !== n || t[5] !== c || t[6] !== i) {
      p = {
        resumeSession: c,
        isResuming: n,
        error: o,
        selectedSession: i,
        clearError: d
      };
      t[3] = o;
      t[4] = n;
      t[5] = c;
      t[6] = i;
      t[7] = p;
    } else {
      p = t[7];
    }
    return p;
  }
  var xec;
  var Kcr;
  var Aec = __lazy(() => {
    at();
    Ot();
    ln();
    dt();
    FM();
    xec = __toESM(pt(), 1);
    Kcr = __toESM(ot(), 1);
  });
  function Pec({
    onSelect: e,
    onCancel: t,
    isEmbedded: n = false
  }) {
    let {
      rows: r
    } = Sr();
    let [o, s] = Cie.useState([]);
    let [i, a] = Cie.useState(null);
    let [l, c] = Cie.useState(true);
    let [u, d] = Cie.useState(null);
    let [p, m] = Cie.useState(false);
    let [f, h] = Cie.useState(false);
    let [g, y] = Cie.useState(1);
    let _ = Zu("confirm:no", "Confirmation", "Esc");
    let b = Cie.useCallback(async () => {
      try {
        c(true);
        d(null);
        let P = await detectCurrentRepository();
        a(P);
        logForDebugging(`Current repository: ${P || "not detected"}`);
        let F = await fetchCodeSessionsFromSessionsAPI();
        let H = F;
        if (P) {
          H = F.filter(N => {
            if (!N.repo) {
              return false;
            }
            return `${N.repo.owner.login}/${N.repo.name}` === P;
          });
          logForDebugging(`Filtered ${H.length} sessions for repo ${P} from ${F.length} total`);
        }
        let U = [...H].sort((N, W) => {
          let j = new Date(N.updated_at);
          return new Date(W.updated_at).getTime() - j.getTime();
        });
        s(U);
      } catch (P) {
        let F = P instanceof Error ? P.message : String(P);
        logForDebugging(`Error loading code sessions: ${F}`);
        d(WZm(F));
      } finally {
        c(false);
        m(false);
      }
    }, []);
    let S = () => {
      m(true);
      b();
    };
    uo("confirm:no", t, {
      context: "Confirmation"
    });
    function E(P) {
      if (P.ctrl && P.key === "c") {
        P.preventDefault();
        t();
        return;
      }
      if (P.ctrl && P.key === "r" && u) {
        P.preventDefault();
        S();
        return;
      }
      if (u !== null && P.key === "return") {
        P.preventDefault();
        t();
        return;
      }
    }
    let C = Cie.useCallback(() => {
      h(true);
      b();
    }, [h, b]);
    if (!f) {
      return If.jsx(zJn, {
        onComplete: C
      });
    }
    if (l) {
      return If.jsx(gXd, {
        flexDirection: "column",
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: E,
        children: If.jsx(Xc, {
          message: "Loading Claude Code sessions\u2026",
          bold: true,
          subtitle: p ? "Retrying\u2026" : "Fetching your Claude Code sessions\u2026"
        })
      });
    }
    if (u) {
      return If.jsxs(gXd, {
        flexDirection: "column",
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: E,
        children: [If.jsx(Text, {
          bold: true,
          color: "error",
          children: "Error loading Claude Code sessions"
        }), GZm(u), If.jsxs(Text, {
          dimColor: true,
          children: ["Press ", If.jsx(Text, {
            bold: true,
            children: "Ctrl+R"
          }), " to retry \xB7 Press", " ", If.jsx(Text, {
            bold: true,
            children: _
          }), " to cancel"]
        })]
      });
    }
    if (o.length === 0) {
      return If.jsxs(gXd, {
        flexDirection: "column",
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: E,
        children: [If.jsxs(Text, {
          bold: true,
          children: ["No Claude Code sessions found", i && If.jsxs(Text, {
            children: [" for ", i]
          })]
        }), If.jsx(gXd, {
          marginTop: 1,
          children: If.jsxs(Text, {
            dimColor: true,
            children: ["Press ", If.jsx(Text, {
              bold: true,
              children: _
            }), " to cancel"]
          })
        })]
      });
    }
    let x = o.map(P => ({
      ...P,
      timeString: formatRelativeTime(new Date(P.updated_at))
    }));
    let A = Math.max(("Updated").length, ...x.map(P => P.timeString.length));
    let k = x.map(({
      timeString: P,
      title: F,
      id: H
    }) => ({
      label: `${P.padEnd(A, " ")}  ${F}`,
      value: H
    }));
    let I = 7;
    let O = Math.max(1, n ? Math.min(o.length, 5, r - 6 - I) : Math.min(o.length, r - 1 - I));
    let M = O + I;
    let L = o.length > O;
    return If.jsxs(gXd, {
      flexDirection: "column",
      padding: 1,
      height: M,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: E,
      children: [If.jsxs(Text, {
        bold: true,
        children: ["Select a session to resume", L && If.jsxs(Text, {
          dimColor: true,
          children: [" ", "(", g, " of ", o.length, ")"]
        }), i && If.jsxs(Text, {
          dimColor: true,
          children: [" (", i, ")"]
        }), ":"]
      }), If.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        flexGrow: 1,
        children: [If.jsx(gXd, {
          marginLeft: 2,
          children: If.jsxs(Text, {
            bold: true,
            children: [("Updated").padEnd(A, " "), "  ", "Session Title"]
          })
        }), If.jsx(xr, {
          visibleOptionCount: O,
          options: k,
          onChange: P => {
            let F = o.find(H => H.id === P);
            if (F) {
              e(F);
            }
          },
          onFocus: P => {
            let F = k.findIndex(H => H.value === P);
            if (F >= 0) {
              y(F + 1);
            }
          }
        })]
      }), If.jsx(gXd, {
        flexDirection: "row",
        children: If.jsx(Text, {
          dimColor: true,
          children: If.jsxs(Hn, {
            children: [If.jsx(xt, {
              chord: ["up", "down"],
              action: "select"
            }), If.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), If.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })
      })]
    });
  }
  function WZm(e) {
    let t = e.toLowerCase();
    if (t.includes("fetch") || t.includes("network") || t.includes("timeout")) {
      return "network";
    }
    if (t.includes("auth") || t.includes("token") || t.includes("permission") || t.includes("oauth") || t.includes("not authenticated") || t.includes("/login") || t.includes("console account") || t.includes("403")) {
      return "auth";
    }
    if (t.includes("api") || t.includes("rate limit") || t.includes("500") || t.includes("529")) {
      return "api";
    }
    return "other";
  }
  function GZm(e) {
    switch (e) {
      case "network":
        return If.jsx(gXd, {
          marginY: 1,
          flexDirection: "column",
          children: If.jsx(Text, {
            dimColor: true,
            children: "Check your internet connection"
          })
        });
      case "auth":
        return If.jsxs(gXd, {
          marginY: 1,
          flexDirection: "column",
          children: [If.jsx(Text, {
            dimColor: true,
            children: "Teleport requires a Claude account"
          }), If.jsxs(Text, {
            dimColor: true,
            children: ["Run ", If.jsx(Text, {
              bold: true,
              children: "/login"
            }), ' and select "Claude account with subscription"']
          })]
        });
      case "api":
        return If.jsx(gXd, {
          marginY: 1,
          flexDirection: "column",
          children: If.jsx(Text, {
            dimColor: true,
            children: "Sorry, Claude encountered an error"
          })
        });
      case "other":
        return If.jsx(gXd, {
          marginY: 1,
          flexDirection: "row",
          children: If.jsx(Text, {
            dimColor: true,
            children: "Sorry, Claude Code encountered an error"
          })
        });
    }
  }
  var Cie;
  var If;
  var Oec = __lazy(() => {
    ki();
    NC();
    et();
    Bs();
    c0();
    je();
    bI();
    cs();
    Sd();
    OS();
    Ai();
    bs();
    Pv();
    OPo();
    Cie = __toESM(ot(), 1);
    If = __toESM(ie(), 1);
  });
  var Nec = {};
  __export(Nec, {
    TeleportResumeWrapper: () => TeleportResumeWrapper
  });
  function TeleportResumeWrapper(e) {
    let t = Dec.c(30);
    let {
      onComplete: n,
      onCancel: r,
      onError: o,
      isEmbedded: s,
      source: i
    } = e;
    let a = s === undefined ? false : s;
    let {
      resumeSession: l,
      isResuming: c,
      error: u,
      selectedSession: d
    } = kec(i);
    let p;
    let m;
    if (t[0] !== i) {
      p = () => {
        logEvent("tengu_teleport_started", {
          source: i
        });
      };
      m = [i];
      t[0] = i;
      t[1] = p;
      t[2] = m;
    } else {
      p = t[1];
      m = t[2];
    }
    Mec.useEffect(p, m);
    let f;
    if (t[3] !== u || t[4] !== n || t[5] !== o || t[6] !== l) {
      f = async x => {
        let A = await l(x);
        if (A) {
          n(A);
        } else if (u) {
          if (o) {
            o(u.message, u.formattedMessage);
          }
        }
      };
      t[3] = u;
      t[4] = n;
      t[5] = o;
      t[6] = l;
      t[7] = f;
    } else {
      f = t[7];
    }
    let h = f;
    let g;
    if (t[8] !== r) {
      g = () => {
        logEvent("tengu_teleport_cancelled", {});
        r();
      };
      t[8] = r;
      t[9] = g;
    } else {
      g = t[9];
    }
    let y = g;
    let _ = !!u && !o;
    let b;
    if (t[10] !== _) {
      b = {
        context: "Global",
        isActive: _
      };
      t[10] = _;
      t[11] = b;
    } else {
      b = t[11];
    }
    uo("app:interrupt", y, b);
    let S;
    if (t[12] !== u || t[13] !== o) {
      S = !!u && !o && bq();
      t[12] = u;
      t[13] = o;
      t[14] = S;
    } else {
      S = t[14];
    }
    let E;
    if (t[15] !== S) {
      E = {
        context: "Confirmation",
        isActive: S
      };
      t[15] = S;
      t[16] = E;
    } else {
      E = t[16];
    }
    if (uo("confirm:no", y, E), c && d) {
      let x;
      if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
        x = P5.jsxs(gXd, {
          flexDirection: "row",
          children: [P5.jsx(Ed, {}), P5.jsx(Text, {
            bold: true,
            children: "Resuming session\u2026"
          })]
        });
        t[17] = x;
      } else {
        x = t[17];
      }
      let A;
      if (t[18] !== d.title) {
        A = P5.jsxs(gXd, {
          flexDirection: "column",
          padding: 1,
          children: [x, P5.jsxs(Text, {
            dimColor: true,
            children: ['Loading "', d.title, '"\u2026']
          })]
        });
        t[18] = d.title;
        t[19] = A;
      } else {
        A = t[19];
      }
      return A;
    }
    if (u && !o) {
      let x;
      if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
        x = P5.jsx(Text, {
          bold: true,
          color: "error",
          children: "Failed to resume session"
        });
        t[20] = x;
      } else {
        x = t[20];
      }
      let A;
      if (t[21] !== u.message) {
        A = P5.jsx(Text, {
          dimColor: true,
          children: u.message
        });
        t[21] = u.message;
        t[22] = A;
      } else {
        A = t[22];
      }
      let k;
      if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
        k = P5.jsx(gXd, {
          marginTop: 1,
          children: P5.jsx(Text, {
            dimColor: true,
            italic: true,
            children: P5.jsx(xt, {
              chord: "escape",
              action: "cancel"
            })
          })
        });
        t[23] = k;
      } else {
        k = t[23];
      }
      let I;
      if (t[24] !== A) {
        I = P5.jsxs(gXd, {
          flexDirection: "column",
          padding: 1,
          children: [x, A, k]
        });
        t[24] = A;
        t[25] = I;
      } else {
        I = t[25];
      }
      return I;
    }
    let C;
    if (t[26] !== y || t[27] !== h || t[28] !== a) {
      C = P5.jsx(Pec, {
        onSelect: h,
        onCancel: y,
        isEmbedded: a
      });
      t[26] = y;
      t[27] = h;
      t[28] = a;
      t[29] = C;
    } else {
      C = t[29];
    }
    return C;
  }
  var Dec;
  var Mec;
  var P5;
  var A9o = __lazy(() => {
    Ot();
    Aec();
    et();
    Bs();
    mut();
    bs();
    Oec();
    cA();
    Dec = __toESM(pt(), 1);
    Mec = __toESM(ot(), 1);
    P5 = __toESM(ie(), 1);
  });
  var Bec = {};
  __export(Bec, {
    call: () => call_export52,
    Teleport: () => Teleport
  });
  function Teleport(e) {
    let t = Lec.c(16);
    let {
      onExit: n,
      context: r
    } = e;
    let o = Ec();
    let s;
    if (t[0] !== o) {
      s = () => Boolean(o.getState().replBridgeSessionId);
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let [i] = Fec.useState(s);
    let a;
    if (t[6] !== r || t[7] !== n) {
      a = d => {
        r.applyMessageOp({
          type: "replace-all",
          messages: d.log
        });
        n("Session resumed successfully", {
          display: "system"
        });
      };
      t[6] = r;
      t[7] = n;
      t[8] = a;
    } else {
      a = t[8];
    }
    let l;
    let c;
    if (t[9] !== n) {
      l = () => {
        n("Teleport cancelled", {
          display: "system"
        });
      };
      c = (d, p) => {
        n(d, {
          display: "system"
        });
      };
      t[9] = n;
      t[10] = l;
      t[11] = c;
    } else {
      l = t[10];
      c = t[11];
    }
    let u;
    if (t[12] !== a || t[13] !== l || t[14] !== c) {
      u = I9o.jsx(TeleportResumeWrapper, {
        onComplete: a,
        onCancel: l,
        onError: c,
        isEmbedded: true,
        source: "localCommand"
      });
      t[12] = a;
      t[13] = l;
      t[14] = c;
      t[15] = u;
    } else {
      u = t[15];
    }
    return u;
  }
  var Lec;
  var Fec;
  var I9o;
  var call_export52 = async (e, t) => I9o.jsx(Teleport, {
    onExit: e,
    context: t
  });
  var $ec = __lazy(() => {
    A9o();
    ho();
    Lec = __toESM(pt(), 1);
    Fec = __toESM(ot(), 1);
    I9o = __toESM(ie(), 1);
  });
  var zZm;
  function qec({
    name: e,
    description: t,
    progressMessage: n,
    pluginName: r,
    pluginCommand: o,
    getPromptWhileMarketplaceIsPrivate: s
  }) {
    return {
      type: "prompt",
      name: e,
      description: t,
      progressMessage: n,
      contentLength: 0,
      userFacingName() {
        return e;
      },
      source: "builtin",
      disableModelInvocation: false,
      async getPromptForCommand(i, a) {
        return s(i, a);
      }
    };
  }
  var KZm;
  var YZm;
  var JZm;
  var Wec;
  var Gec = __lazy(() => {
    UNe();
    vo();
    fv();
    v9();
    l8e();
    KZm = ["git diff *", "git status *", "git log *", "git show *", "git remote show *"];
    YZm = KZm.flatMap(e => [`Bash(${e})`, `PowerShell(${e})`]).join(", ");
    JZm = `---
allowed-tools: ${YZm}, Read, Glob, Grep, LS, Task
description: Complete a security review of the pending changes on the current branch
---

You are a senior security engineer conducting a focused security review of the changes on this branch.

GIT STATUS:

\`\`\`
!\`git status\`
\`\`\`

FILES MODIFIED:

\`\`\`
!\`git diff --name-only origin/HEAD...\`
\`\`\`

COMMITS:

\`\`\`
!\`git log --no-decorate origin/HEAD...\`
\`\`\`

DIFF CONTENT:

\`\`\`
!\`git diff origin/HEAD...\`
\`\`\`

Review the complete diff above. This contains all code changes in the PR.

OBJECTIVE:
Perform a security-focused code review to identify HIGH-CONFIDENCE security vulnerabilities that could have real exploitation potential. This is not a general code review - focus ONLY on security implications newly added by this PR. Do not comment on existing security concerns.

CRITICAL INSTRUCTIONS:
1. MINIMIZE FALSE POSITIVES: Only flag issues where you're >80% confident of actual exploitability
2. AVOID NOISE: Skip theoretical issues, style concerns, or low-impact findings
3. FOCUS ON IMPACT: Prioritize vulnerabilities that could lead to unauthorized access, data breaches, or system compromise
4. EXCLUSIONS: Do NOT report the following issue types:
   - Denial of Service (DOS) vulnerabilities, even if they allow service disruption
   - Secrets or sensitive data stored on disk (these are handled by other processes)
   - Rate limiting or resource exhaustion issues

SECURITY CATEGORIES TO EXAMINE:

**Input Validation Vulnerabilities:**
- SQL injection via unsanitized user input
- Command injection in system calls or subprocesses
- XXE injection in XML parsing
- Template injection in templating engines
- NoSQL injection in database queries
- Path traversal in file operations

**Authentication & Authorization Issues:**
- Authentication bypass logic
- Privilege escalation paths
- Session management flaws
- JWT token vulnerabilities
- Authorization logic bypasses

**Crypto & Secrets Management:**
- Hardcoded API keys, passwords, or tokens
- Weak cryptographic algorithms or implementations
- Improper key storage or management
- Cryptographic randomness issues
- Certificate validation bypasses

**Injection & Code Execution:**
- Remote code execution via deseralization
- Pickle injection in Python
- YAML deserialization vulnerabilities
- Eval injection in dynamic code execution
- XSS vulnerabilities in web applications (reflected, stored, DOM-based)

**Data Exposure:**
- Sensitive data logging or storage
- PII handling violations
- API endpoint data leakage
- Debug information exposure

Additional notes:
- Even if something is only exploitable from the local network, it can still be a HIGH severity issue

ANALYSIS METHODOLOGY:

Phase 1 - Repository Context Research (Use file search tools):
- Identify existing security frameworks and libraries in use
- Look for established secure coding patterns in the codebase
- Examine existing sanitization and validation patterns
- Understand the project's security model and threat model

Phase 2 - Comparative Analysis:
- Compare new code changes against existing security patterns
- Identify deviations from established secure practices
- Look for inconsistent security implementations
- Flag code that introduces new attack surfaces

Phase 3 - Vulnerability Assessment:
- Examine each modified file for security implications
- Trace data flow from user inputs to sensitive operations
- Look for privilege boundaries being crossed unsafely
- Identify injection points and unsafe deserialization

REQUIRED OUTPUT FORMAT:

You MUST output your findings in markdown. The markdown output should contain the file, line number, severity, category (e.g. \`sql_injection\` or \`xss\`), description, exploit scenario, and fix recommendation.

For example:

# Vuln 1: XSS: \`foo.py:42\`

* Severity: High
* Description: User input from \`username\` parameter is directly interpolated into HTML without escaping, allowing reflected XSS attacks
* Exploit Scenario: Attacker crafts URL like /bar?q=<script>alert(document.cookie)</script> to execute JavaScript in victim's browser, enabling session hijacking or data theft
* Recommendation: Use Flask's escape() function or Jinja2 templates with auto-escaping enabled for all user inputs rendered in HTML

SEVERITY GUIDELINES:
- **HIGH**: Directly exploitable vulnerabilities leading to RCE, data breach, or authentication bypass
- **MEDIUM**: Vulnerabilities requiring specific conditions but with significant impact
- **LOW**: Defense-in-depth issues or lower-impact vulnerabilities

CONFIDENCE SCORING:
- 0.9-1.0: Certain exploit path identified, tested if possible
- 0.8-0.9: Clear vulnerability pattern with known exploitation methods
- 0.7-0.8: Suspicious pattern requiring specific conditions to exploit
- Below 0.7: Don't report (too speculative)

FINAL REMINDER:
Focus on HIGH and MEDIUM findings only. Better to miss some theoretical issues than flood the report with false positives. Each finding should be something a security engineer would confidently raise in a PR review.

FALSE POSITIVE FILTERING:

> You do not need to run commands to reproduce the vulnerability, just read the code to determine if it is a real vulnerability. Do not use the bash tool or write to any files.
>
> HARD EXCLUSIONS - Automatically exclude findings matching these patterns:
> 1. Denial of Service (DOS) vulnerabilities or resource exhaustion attacks.
> 2. Secrets or credentials stored on disk if they are otherwise secured.
> 3. Rate limiting concerns or service overload scenarios.
> 4. Memory consumption or CPU exhaustion issues.
> 5. Lack of input validation on non-security-critical fields without proven security impact.
> 6. Input sanitization concerns for GitHub Action workflows unless they are clearly triggerable via untrusted input.
> 7. A lack of hardening measures. Code is not expected to implement all security best practices, only flag concrete vulnerabilities.
> 8. Race conditions or timing attacks that are theoretical rather than practical issues. Only report a race condition if it is concretely problematic.
> 9. Vulnerabilities related to outdated third-party libraries. These are managed separately and should not be reported here.
> 10. Memory safety issues such as buffer overflows or use-after-free-vulnerabilities are impossible in rust. Do not report memory safety issues in rust or any other memory safe languages.
> 11. Files that are only unit tests or only used as part of running tests.
> 12. Log spoofing concerns. Outputting un-sanitized user input to logs is not a vulnerability.
> 13. SSRF vulnerabilities that only control the path. SSRF is only a concern if it can control the host or protocol.
> 14. Including user-controlled content in AI system prompts is not a vulnerability.
> 15. Regex injection. Injecting untrusted content into a regex is not a vulnerability.
> 16. Regex DOS concerns.
> 16. Insecure documentation. Do not report any findings in documentation files such as markdown files.
> 17. A lack of audit logs is not a vulnerability.
>
> PRECEDENTS -
> 1. Logging high value secrets in plaintext is a vulnerability. Logging URLs is assumed to be safe.
> 2. UUIDs can be assumed to be unguessable and do not need to be validated.
> 3. Environment variables and CLI flags are trusted values. Attackers are generally not able to modify them in a secure environment. Any attack that relies on controlling an environment variable is invalid.
> 4. Resource management issues such as memory or file descriptor leaks are not valid.
> 5. Subtle or low impact web vulnerabilities such as tabnabbing, XS-Leaks, prototype pollution, and open redirects should not be reported unless they are extremely high confidence.
> 6. React and Angular are generally secure against XSS. These frameworks do not need to sanitize or escape user input unless it is using dangerouslySetInnerHTML, bypassSecurityTrustHtml, or similar methods. Do not report XSS vulnerabilities in React or Angular components or tsx files unless they are using unsafe methods.
> 7. Most vulnerabilities in github action workflows are not exploitable in practice. Before validating a github action workflow vulnerability ensure it is concrete and has a very specific attack path.
> 8. A lack of permission checking or authentication in client-side JS/TS code is not a vulnerability. Client-side code is not trusted and does not need to implement these checks, they are handled on the server-side. The same applies to all flows that send untrusted data to the backend, the backend is responsible for validating and sanitizing all inputs.
> 9. Only include MEDIUM findings if they are obvious and concrete issues.
> 10. Most vulnerabilities in ipython notebooks (*.ipynb files) are not exploitable in practice. Before validating a notebook vulnerability ensure it is concrete and has a very specific attack path where untrusted input can trigger the vulnerability.
> 11. Logging non-PII data is not a vulnerability even if the data may be sensitive. Only report logging vulnerabilities if they expose sensitive information such as secrets, passwords, or personally identifiable information (PII).
> 12. Command injection vulnerabilities in shell scripts are generally not exploitable in practice since shell scripts generally do not run with untrusted user input. Only report command injection vulnerabilities in shell scripts if they are concrete and have a very specific attack path for untrusted input.
>
> SIGNAL QUALITY CRITERIA - For remaining findings, assess:
> 1. Is there a concrete, exploitable vulnerability with a clear attack path?
> 2. Does this represent a real security risk vs theoretical best practice?
> 3. Are there specific code locations and reproduction steps?
> 4. Would this finding be actionable for a security team?
>
> For each finding, assign a confidence score from 1-10:
> - 1-3: Low confidence, likely false positive or noise
> - 4-6: Medium confidence, needs investigation
> - 7-10: High confidence, likely true vulnerability

START ANALYSIS:

Begin your analysis now. Do this in 3 steps:

1. Use a sub-task to identify vulnerabilities. Use the repository exploration tools to understand the codebase context, then analyze the PR changes for security implications. In the prompt for this sub-task, include all of the above.
2. Then for each vulnerability identified by the above sub-task, create a new sub-task to filter out false-positives. Launch these sub-tasks as parallel sub-tasks. In the prompt for these sub-tasks, include everything in the "FALSE POSITIVE FILTERING" instructions.
3. Filter out any vulnerabilities where the sub-task reported a confidence less than 8.

Your final reply must contain the markdown report and nothing else.`;
    Wec = qec({
      name: "security-review",
      description: "Complete a security review of the pending changes on the current branch",
      progressMessage: "analyzing code changes for security risks",
      pluginName: "security-review",
      pluginCommand: "security-review",
      async getPromptWhileMarketplaceIsPrivate(e, t) {
        let n = Nt();
        if (!(await Egt(n))) {
          return [{
            type: "text",
            text: `Tell the user: /security-review needs to run inside a git repository, but the current working directory (\`${n}\`) is not one.

If the repository is in a subdirectory, \`cd\` into it first and then re-run /security-review.

If this is a self-hosted runner session created without a \`git_repository\` source, either add one at session creation so the runner clones it and sets the working directory, or \`cd\` into the cloned repo before running the review.`
          }];
        }
        let r = sf(JZm);
        let o = bQ(r.frontmatter["allowed-tools"]);
        return [{
          type: "text",
          text: await Cpe(r.content, {
            ...t,
            getAppState() {
              let i = t.getAppState();
              return {
                ...i,
                toolPermissionContext: {
                  ...i.toolPermissionContext,
                  alwaysAllowRules: {
                    ...i.toolPermissionContext.alwaysAllowRules,
                    command: o
                  }
                }
              };
            }
          }, "security-review")
        }];
      }
    });
  });
  var Vec;
  var zec = __lazy(() => {
    Vec = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var Kec;
  var XZm;
  var Jec = {};
  __export(Jec, {
    call: () => call_export53
  });
  var Xec;
  var call_export53 = async (e, t, n, r) => Xec.jsx(uUe, {
    onClose: e,
    context: t,
    defaultTab: r === "stats" ? "Stats" : "Usage"
  });
  var Qec = __lazy(() => {
    WQt();
    Xec = __toESM(ie(), 1);
  });
  var rtc = {};
  __export(rtc, {
    formatRateLimits: () => formatRateLimits,
    formatBehaviors: () => formatBehaviors,
    call: () => call_export54
  });
  function formatRateLimits(e) {
    let {
      rate_limits: t,
      subscription_type: n
    } = e;
    if (!t) {
      return null;
    }
    let r = n === "max" || n === "team" || n === null;
    let o = [{
      title: "Current session",
      limit: t.five_hour
    }, {
      title: "Current week (all models)",
      limit: t.seven_day
    }, ...(r ? [{
      title: "Current week (Sonnet only)",
      limit: t.seven_day_sonnet
    }] : []), ...lpt(t.limits, vDe())];
    let s = [];
    for (let {
      title: i,
      limit: a
    } of o) {
      if (!a || a.utilization === null) {
        continue;
      }
      let l = a.resets_at ? ` \xB7 resets ${formatResetText(a.resets_at, true, true, true)}` : "";
      s.push(`${i}: ${Math.floor(a.utilization)}% used${l}`);
    }
    return s.length > 0 ? s.join(`
`) : null;
  }
  function formatBehaviors(e) {
    let {
      behaviors: t
    } = e;
    if (!t) {
      return null;
    }
    let n = [etc("Last 24h", t.day), etc("Last 7d", t.week)].filter(r => r !== null);
    if (n.length === 0) {
      return null;
    }
    return ["What's contributing to your limits usage?", "Approximate, based on local sessions on this machine \u2014 does not include other devices or claude.ai. Behaviors are independent characteristics, not a breakdown.", "", n.join(`

`)].join(`
`);
  }
  function etc(e, t) {
    let n = t.behaviors.filter(i => i.pct >= 10);
    let r = [Ycr("Top skills", t.skills, i => `/${i}`), Ycr("Top subagents", t.agents), Ycr("Top plugins", t.plugins), Ycr("Top MCP servers", t.mcp_servers)].filter(i => i !== null);
    if (n.length === 0 && r.length === 0) {
      return null;
    }
    let o = `${t.request_count} ${un(t.request_count, "request")}`;
    let s = `${t.session_count} ${un(t.session_count, "session")}`;
    return [`${e} \xB7 ${o} \xB7 ${s}`, ...n.map(i => `  ${eef[i.key](i.pct)}`), ...r.map(i => `  ${i}`)].join(`
`);
  }
  function Ycr(e, t, n) {
    if (t.length === 0) {
      return null;
    }
    let r = t.slice(0, 8).map(s => `${n ? n(s.name) : s.name} ${s.pct}%`).join(", ");
    let o = t.length - 8;
    return `${e}: ${r}${o > 0 ? `, +${o} more` : ""}`;
  }
  var call_export54 = async () => {
    let e = getSubscriptionType() !== null || hasProfileScope();
    if (isClaudeAISubscriber() && e && !i2()) {
      let t;
      if (g0.isUsingOverage) {
        t = "You are currently using your overages to power your Claude Code usage. We will automatically switch you back to your subscription rate limits when they reset";
      } else {
        t = "You are currently using your subscription to power your Claude Code usage";
      }
      let n = await collectUsageData({
        includeBehaviors: getIsNonInteractiveSession()
      });
      let r = formatRateLimits(n);
      if (r) {
        t += `

${r}`;
      }
      let o = formatBehaviors(n);
      if (o) {
        t += `

${o}`;
      }
      if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_lark", false)) {
        let s = vOa();
        if (s) {
          t += `

${_$u.dim(s)}`;
        }
      }
      return {
        type: "text",
        value: t
      };
    }
    return {
      type: "text",
      value: Li(RMe())
    };
  };
  var eef;
  var otc = __lazy(() => {
    at();
    C$();
    $n();
    ETe();
    pU();
    no();
    vF();
    cs();
    Zn();
    HQt();
    eef = {
      cache_miss: e => `${e}% of your usage hit a >100k-token cache miss`,
      long_context: e => `${e}% of your usage was at >150k context`,
      subagent_heavy: e => `${e}% of your usage came from subagent-heavy sessions`,
      high_parallel: e => `${e}% of your usage was while 4+ sessions ran in parallel`,
      cron: e => `${e}% of your usage came from sessions active for 8+ hours`
    };
  });
  var O9o;
  var D9o;
  var stc = __lazy(() => {
    at();
    O9o = {
      type: "local-jsx",
      name: "usage",
      aliases: ["cost", "stats"],
      description: "Show session cost, plan usage, and activity stats",
      thinClientDispatch: "control-request",
      immediate: true,
      requires: {
        ink: true
      },
      load: () => Promise.resolve().then(() => (Qec(), Jec))
    };
    D9o = {
      type: "local",
      name: "usage",
      aliases: ["cost", "stats"],
      supportsNonInteractive: true,
      description: "Show session cost, plan usage, and what's contributing to your limits",
      isEnabled: () => getIsNonInteractiveSession(),
      get isHidden() {
        return !getIsNonInteractiveSession();
      },
      load: () => Promise.resolve().then(() => (otc(), rtc))
    };
  });
  function Jcr({
    title: e,
    placeholder: t = "Type to search\u2026",
    initialQuery: n,
    items: r,
    getKey: o,
    renderItem: s,
    renderPreview: i,
    previewPosition: a = "bottom",
    visibleCount: l = tef,
    direction: c = "down",
    onQueryChange: u,
    onSelect: d,
    onSelectMany: p,
    onTab: m,
    onShiftTab: f,
    onFocus: h,
    onCancel: g,
    resetKey: y,
    emptyMessage: _ = "No results",
    matchLabel: b,
    selectAction: S = "select",
    cancelAction: E = "cancel",
    extraHints: C
  }) {
    let x = useTerminalFocus();
    let {
      rows: A,
      columns: k
    } = Sr();
    let [I, O] = dCe.useState({
      focus: 0,
      window: 0
    });
    let {
      focus: M,
      window: L
    } = I;
    let [P, F] = dCe.useState(undefined);
    let [H, U] = dCe.useState(new Map());
    let N = p !== undefined;
    let W = Boolean(b) || N;
    let j = Math.max(2, Math.min(l, A - 10 - (W ? 1 : 0)));
    let z = k < 120;
    let V = Math.max(0, r.length - j);
    let K = _e => {
      F(undefined);
      O(({
        focus: xe,
        window: ke
      }) => {
        let Ie = j_(xe + _e, 0, r.length - 1);
        return {
          focus: Ie,
          window: Ie < ke ? Ie : Ie >= ke + j ? Ie - j + 1 : ke
        };
      });
    };
    let J = _e => {
      if (_e === undefined) {
        return;
      }
      let xe = o(_e);
      U(ke => {
        let Ie = new Map(ke);
        if (Ie.vZc(xe)) {
          Ie.delete(xe);
        } else {
          Ie.set(xe, _e);
        }
        return Ie;
      });
    };
    let Q = _e => {
      O(xe => ({
        ...xe,
        window: j_(xe.window + _e, 0, V)
      }));
    };
    let Z = _e => {
      if (_e.deltaY === 0) {
        return;
      }
      let xe = _e.deltaY > 0;
      if (c === "up") {
        Q(xe ? -1 : 1);
      } else {
        Q(xe ? 1 : -1);
      }
      _e.stopImmediatePropagation();
    };
    let {
      query: ne,
      cursorOffset: oe,
      handleKeyDown: ee,
      handlePaste: re
    } = U0({
      isActive: true,
      onExit: () => {},
      onCancel: g,
      initialQuery: n,
      backspaceExitsOnEmpty: false
    });
    let se = _e => {
      if (_e.key === "up" || _e.ctrl && _e.key === "p") {
        _e.preventDefault();
        _e.stopImmediatePropagation();
        K(c === "up" ? 1 : -1);
        return;
      }
      if (_e.key === "down" || _e.ctrl && _e.key === "n") {
        _e.preventDefault();
        _e.stopImmediatePropagation();
        K(c === "up" ? -1 : 1);
        return;
      }
      if (_e.key === "pageup" || _e.key === "pagedown") {
        _e.preventDefault();
        _e.stopImmediatePropagation();
        let xe = _e.key === "pagedown" ? 1 : -1;
        K((c === "up" ? -xe : xe) * j);
        return;
      }
      if (_e.key === "return") {
        if (_e.preventDefault(), _e.stopImmediatePropagation(), N && H.size > 0) {
          p([...H.values()]);
          return;
        }
        let xe = r[M];
        if (xe) {
          d(xe);
        }
        return;
      }
      if (_e.key === "tab") {
        _e.preventDefault();
        _e.stopImmediatePropagation();
        let xe = r[M];
        if (N) {
          J(xe);
          K(_e.shift ? -1 : 1);
          return;
        }
        let ke = _e.shift ? f ?? m : m;
        if (ke) {
          ke.handler(xe);
        } else if (xe) {
          d(xe);
        }
        return;
      }
      ee(_e);
    };
    dCe.useEffect(() => {
      u(ne);
      O({
        focus: 0,
        window: 0
      });
      F(undefined);
    }, [ne]);
    dCe.useEffect(() => {
      O(_e => ({
        focus: j_(_e.focus, 0, r.length - 1),
        window: j_(_e.window, 0, V)
      }));
      F(undefined);
    }, [r.length, V]);
    dCe.useEffect(() => {
      if (y === undefined) {
        return;
      }
      O({
        focus: 0,
        window: 0
      });
      F(undefined);
    }, [y]);
    let ae = r[M];
    let de = P ?? ae;
    dCe.useEffect(() => {
      h?.(de);
    }, [de]);
    let be = r.slice(L, L + j);
    let fe = _e => {
      if (N && H.size > 0) {
        J(_e);
      } else {
        d(_e);
      }
    };
    let me = typeof _ === "function" ? _(ne) : _;
    let Te = W ? Uv.jsxs(Text, {
      dimColor: true,
      children: [b, b && H.size > 0 ? " \xB7 " : null, H.size > 0 ? Uv.jsxs(Text, {
        children: [Uv.jsx(Text, {
          color: "success",
          children: H.size
        }), " selected"]
      }) : null, !b && H.size === 0 ? " " : null]
    }) : null;
    let ue = Uv.jsx(YM, {
      query: ne,
      cursorOffset: oe,
      placeholder: t,
      isFocused: true,
      isTerminalFocused: x
    });
    let ce = Uv.jsx(oef, {
      visible: be,
      windowStart: L,
      visibleCount: j,
      total: r.length,
      focusedIndex: M,
      direction: c,
      getKey: o,
      renderItem: s,
      emptyText: me,
      marked: H,
      onItemClick: fe,
      onItemHover: F
    });
    let le = i && de ? Uv.jsx(gXd, {
      flexDirection: "column",
      flexGrow: 1,
      children: i(de)
    }) : null;
    let pe = i && a === "right" ? Uv.jsxs(gXd, {
      flexDirection: "row",
      gap: 2,
      height: j + (Te ? 1 : 0),
      children: [Uv.jsxs(gXd, {
        flexDirection: "column",
        flexShrink: 0,
        children: [ce, Te]
      }), le ?? Uv.jsx(gXd, {
        flexGrow: 1
      })]
    }) : Uv.jsxs(gXd, {
      flexDirection: "column",
      children: [ce, Te, le]
    });
    let ve = c !== "up";
    return Uv.jsx(Td, {
      color: "permission",
      children: Uv.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: se,
        onPaste: re,
        onWheel: Z,
        children: [Uv.jsx(Text, {
          bold: true,
          color: "permission",
          children: e
        }), ve && ue, pe, !ve && ue, Uv.jsx(Text, {
          dimColor: true,
          children: Uv.jsxs(Hn, {
            children: [Uv.jsx(xt, {
              chord: ["up", "down"],
              action: z ? "nav" : "navigate"
            }), Uv.jsx(xt, {
              chord: "enter",
              action: N && H.size > 0 ? `accept ${H.size}` : z ? sef(S) : S
            }), N && Uv.jsx(xt, {
              chord: "tab",
              action: "mark"
            }), !N && m && Uv.jsx(xt, {
              chord: "tab",
              action: m.action
            }), !N && f && !z && Uv.jsx(xt, {
              chord: "shift+tab",
              action: f.action,
              format: {
                keyCase: "lower"
              }
            }), Uv.jsx(xt, {
              chord: "escape",
              action: E
            }), C]
          })
        })]
      })
    });
  }
  function oef(e) {
    let t = itc.c(36);
    let {
      visible: n,
      windowStart: r,
      visibleCount: o,
      total: s,
      focusedIndex: i,
      direction: a,
      getKey: l,
      renderItem: c,
      emptyText: u,
      marked: d,
      onItemClick: p,
      onItemHover: m
    } = e;
    if (n.length === 0) {
      let b;
      if (t[0] !== u) {
        b = Uv.jsx(sc, {
          children: u
        });
        t[0] = u;
        t[1] = b;
      } else {
        b = t[1];
      }
      let S;
      if (t[2] !== b || t[3] !== o) {
        S = Uv.jsx(gXd, {
          height: o,
          flexShrink: 0,
          children: b
        });
        t[2] = b;
        t[3] = o;
        t[4] = S;
      } else {
        S = t[4];
      }
      return S;
    }
    let f;
    if (t[5] !== a || t[6] !== i || t[7] !== l || t[8] !== d || t[9] !== p || t[10] !== m || t[11] !== c || t[12] !== s || t[13] !== n || t[14] !== o || t[15] !== r) {
      let b;
      if (t[17] !== a || t[18] !== i || t[19] !== l || t[20] !== d || t[21] !== p || t[22] !== m || t[23] !== c || t[24] !== s || t[25] !== n.length || t[26] !== o || t[27] !== r) {
        b = (S, E) => {
          let C = l(S);
          let A = r + E === i;
          let k = d.vZc(C);
          let I = E === 0 && r > 0;
          let O = E === n.length - 1 && r + o < s;
          return Uv.jsx(_v, {
            isFocused: A,
            isSelected: k,
            showScrollUp: a === "up" ? O : I,
            showScrollDown: a === "up" ? I : O,
            styled: false,
            onClick: () => p(S),
            onHoverChange: M => M && m(S),
            children: c(S, A, k)
          }, C);
        };
        t[17] = a;
        t[18] = i;
        t[19] = l;
        t[20] = d;
        t[21] = p;
        t[22] = m;
        t[23] = c;
        t[24] = s;
        t[25] = n.length;
        t[26] = o;
        t[27] = r;
        t[28] = b;
      } else {
        b = t[28];
      }
      f = n.map(b);
      t[5] = a;
      t[6] = i;
      t[7] = l;
      t[8] = d;
      t[9] = p;
      t[10] = m;
      t[11] = c;
      t[12] = s;
      t[13] = n;
      t[14] = o;
      t[15] = r;
      t[16] = f;
    } else {
      f = t[16];
    }
    let h = f;
    let g = a === "up" ? "column-reverse" : "column";
    let y;
    if (t[29] !== m) {
      y = () => m(undefined);
      t[29] = m;
      t[30] = y;
    } else {
      y = t[30];
    }
    let _;
    if (t[31] !== h || t[32] !== g || t[33] !== y || t[34] !== o) {
      _ = Uv.jsx(gXd, {
        height: o,
        flexShrink: 0,
        flexDirection: g,
        onMouseLeave: y,
        children: h
      });
      t[31] = h;
      t[32] = g;
      t[33] = y;
      t[34] = o;
      t[35] = _;
    } else {
      _ = t[35];
    }
    return _;
  }
  function sef(e) {
    let t = e.indexOf(" ");
    return t === -1 ? e : e.slice(0, t);
  }
  var itc;
  var dCe;
  var Uv;
  var M9o = __lazy(() => {
    sie();
    ki();
    Q8();
    et();
    Cfe();
    Ai();
    xb();
    bs();
    Mue();
    oE();
    itc = __toESM(pt(), 1);
    dCe = __toESM(ot(), 1);
    Uv = __toESM(ie(), 1);
  });
  function Xcr(e) {
    let t = N9o.c(2);
    let {
      value: n
    } = e;
    let r = n;
    let o;
    if (t[0] !== r) {
      o = Km.jsx(Text, {
        color: r,
        children: ief
      });
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    return o;
  }
  function ltc(e) {
    let t = N9o.c(150);
    let {
      initial: n,
      defaultBase: r,
      onDone: o,
      onCancel: s
    } = e;
    let [, i] = useTheme();
    let {
      customThemes: a,
      reloadCustomThemes: l,
      setPreviewOverrides: c
    } = useCustomThemes();
    let u = n !== undefined && n.source !== "user";
    let [d, p] = SK.useState(n && !u ? "colors" : "name");
    let [m, f] = SK.useState(n?.name ?? "");
    let [h, g] = SK.useState(m.length);
    let [y, _] = SK.useState(u ? "" : n?.slug ?? "");
    let b;
    if (t[0] !== r || t[1] !== n?.base) {
      b = () => n?.base ?? r;
      t[0] = r;
      t[1] = n?.base;
      t[2] = b;
    } else {
      b = t[2];
    }
    let [S] = SK.useState(b);
    let E;
    if (t[3] !== S) {
      E = MJ(S);
      t[3] = S;
      t[4] = E;
    } else {
      E = t[4];
    }
    let C = E;
    let x;
    if (t[5] !== n?.overrides) {
      x = n?.overrides ?? {};
      t[5] = n?.overrides;
      t[6] = x;
    } else {
      x = t[6];
    }
    let [A, k] = SK.useState(x);
    let I;
    if (t[7] !== C) {
      I = Object.keys(C).sort();
      t[7] = C;
      t[8] = I;
    } else {
      I = t[8];
    }
    let O = I;
    let [M, L] = SK.useState("");
    let [P, F] = SK.useState(null);
    let [H, U] = SK.useState("");
    let [N, W] = SK.useState(0);
    let j;
    if (t[9] !== O || t[10] !== M) {
      let Tt = M.toLowerCase();
      j = Tt ? O.filter(kt => kt.toLowerCase().includes(Tt)) : O;
      t[9] = O;
      t[10] = M;
      t[11] = j;
    } else {
      j = t[11];
    }
    let z = j;
    let V;
    if (t[12] !== a || t[13] !== m || t[14] !== y) {
      V = y || cef(m, a);
      t[12] = a;
      t[13] = m;
      t[14] = y;
      t[15] = V;
    } else {
      V = t[15];
    }
    let K = V;
    let J;
    if (t[16] !== A) {
      J = Object.keys(A);
      t[16] = A;
      t[17] = J;
    } else {
      J = t[17];
    }
    let Q = J.length;
    let Z;
    let ne;
    if (t[18] !== c) {
      Z = () => () => c(null);
      ne = [c];
      t[18] = c;
      t[19] = Z;
      t[20] = ne;
    } else {
      Z = t[19];
      ne = t[20];
    }
    SK.useEffect(Z, ne);
    let oe;
    if (t[21] !== A || t[22] !== C) {
      oe = function (kt) {
        return A[kt] ?? C[kt];
      };
      t[21] = A;
      t[22] = C;
      t[23] = oe;
    } else {
      oe = t[23];
    }
    let ee = oe;
    let re;
    if (t[24] !== S || t[25] !== m || t[26] !== c) {
      re = function (kt, Ye) {
        k(Ye);
        c(Ye);
        xZr({
          slug: kt,
          name: m.trim(),
          base: S,
          overrides: Ye,
          source: "user"
        }).catch(ht => {
          logForDebugging(`[theme] save ${kt} failed: ${ht}`, {
            level: "warn"
          });
        });
      };
      t[24] = S;
      t[25] = m;
      t[26] = c;
      t[27] = re;
    } else {
      re = t[27];
    }
    let se = re;
    let ae;
    if (t[28] !== ee) {
      ae = function (kt) {
        let Ye = ee(kt);
        U(Ye);
        W(Ye.length);
        F(kt);
      };
      t[28] = ee;
      t[29] = ae;
    } else {
      ae = t[29];
    }
    let de = ae;
    let be;
    if (t[30] !== se || t[31] !== H || t[32] !== P || t[33] !== A || t[34] !== C || t[35] !== y) {
      be = function () {
        if (P === null || !_We(H)) {
          return;
        }
        se(y, H === C[P] ? Nwm(A, P) : {
          ...A,
          [P]: H
        });
        F(null);
      };
      t[30] = se;
      t[31] = H;
      t[32] = P;
      t[33] = A;
      t[34] = C;
      t[35] = y;
      t[36] = be;
    } else {
      be = t[36];
    }
    let fe = be;
    let me;
    if (t[37] !== A || t[38] !== c) {
      me = function () {
        c(A);
        F(null);
      };
      t[37] = A;
      t[38] = c;
      t[39] = me;
    } else {
      me = t[39];
    }
    let Te = me;
    let ue;
    if (t[40] !== se || t[41] !== A || t[42] !== y) {
      ue = function (kt) {
        if (!(kt in A)) {
          return;
        }
        se(y, Nwm(A, kt));
      };
      t[40] = se;
      t[41] = A;
      t[42] = y;
      t[43] = ue;
    } else {
      ue = t[43];
    }
    let ce = ue;
    let le;
    if (t[44] !== P || t[45] !== A || t[46] !== c) {
      le = function (kt) {
        if (U(kt), P && _We(kt)) {
          c({
            ...A,
            [P]: kt
          });
        }
      };
      t[44] = P;
      t[45] = A;
      t[46] = c;
      t[47] = le;
    } else {
      le = t[47];
    }
    let pe = le;
    let ve;
    if (t[48] !== Te || t[49] !== P || t[50] !== s) {
      ve = () => {
        if (P !== null) {
          Te();
        } else {
          s();
        }
      };
      t[48] = Te;
      t[49] = P;
      t[50] = s;
      t[51] = ve;
    } else {
      ve = t[51];
    }
    let _e = d === "name" || P !== null;
    let xe;
    if (t[52] !== _e) {
      xe = {
        context: "Settings",
        isActive: _e
      };
      t[52] = _e;
      t[53] = xe;
    } else {
      xe = t[53];
    }
    if (uo("confirm:no", ve, xe), d === "name") {
      let Tt;
      if (t[54] !== m) {
        Tt = m.trim();
        t[54] = m;
        t[55] = Tt;
      } else {
        Tt = t[55];
      }
      let kt = Tt;
      let Ye = kt.length > 0;
      let ht = u && n ? `Fork ${n.name} to your themes` : "New custom theme";
      let It;
      if (t[56] !== ht) {
        It = Km.jsx(Text, {
          bold: true,
          color: "permission",
          children: ht
        });
        t[56] = ht;
        t[57] = It;
      } else {
        It = t[57];
      }
      let Rt;
      if (t[58] === Symbol.for("react.memo_cache_sentinel")) {
        Rt = Km.jsx(Text, {
          children: "Name: "
        });
        t[58] = Rt;
      } else {
        Rt = t[58];
      }
      let wt;
      if (t[59] !== S || t[60] !== K || t[61] !== A || t[62] !== l || t[63] !== i || t[64] !== kt || t[65] !== Ye) {
        wt = () => {
          if (!Ye) {
            return;
          }
          _(K);
          f(kt);
          p("colors");
          xZr({
            slug: K,
            name: kt,
            base: S,
            overrides: A,
            source: "user"
          }).then(() => {
            l();
            i(SWe(K));
          }).catch(Xr => {
            logForDebugging(`[theme] save ${K} failed: ${Xr}`, {
              level: "warn"
            });
          });
        };
        t[59] = S;
        t[60] = K;
        t[61] = A;
        t[62] = l;
        t[63] = i;
        t[64] = kt;
        t[65] = Ye;
        t[66] = wt;
      } else {
        wt = t[66];
      }
      let vt;
      if (t[67] !== m || t[68] !== h || t[69] !== s || t[70] !== wt) {
        vt = Km.jsxs(gXd, {
          children: [Rt, Km.jsx(Dl, {
            value: m,
            onChange: f,
            onSubmit: wt,
            onExit: s,
            placeholder: "my-theme",
            columns: 40,
            cursorOffset: h,
            onChangeCursorOffset: g,
            disableCursorMovementForUpDownKeys: true,
            disableEscapeDoublePress: true,
            focus: true,
            showCursor: true
          })]
        });
        t[67] = m;
        t[68] = h;
        t[69] = s;
        t[70] = wt;
        t[71] = vt;
      } else {
        vt = t[71];
      }
      let yt;
      if (t[72] === Symbol.for("react.memo_cache_sentinel")) {
        yt = G$t();
        t[72] = yt;
      } else {
        yt = t[72];
      }
      let gt;
      if (t[73] !== S || t[74] !== K) {
        gt = Km.jsxs(Text, {
          dimColor: true,
          children: ["based on ", S, " \xB7 saved to ", yt, atc.sep, K, ".json"]
        });
        t[73] = S;
        t[74] = K;
        t[75] = gt;
      } else {
        gt = t[75];
      }
      let Ft;
      if (t[76] !== vt || t[77] !== gt) {
        Ft = Km.jsxs(gXd, {
          flexDirection: "column",
          children: [vt, gt]
        });
        t[76] = vt;
        t[77] = gt;
        t[78] = Ft;
      } else {
        Ft = t[78];
      }
      let on;
      if (t[79] !== Ye) {
        on = Ye && Km.jsx(xt, {
          chord: "enter",
          action: "continue"
        });
        t[79] = Ye;
        t[80] = on;
      } else {
        on = t[80];
      }
      let rn;
      if (t[81] === Symbol.for("react.memo_cache_sentinel")) {
        rn = Km.jsx(xt, {
          chord: "escape",
          action: "cancel"
        });
        t[81] = rn;
      } else {
        rn = t[81];
      }
      let Sn;
      if (t[82] !== on) {
        Sn = Km.jsx(Text, {
          dimColor: true,
          children: Km.jsxs(Hn, {
            children: [on, rn]
          })
        });
        t[82] = on;
        t[83] = Sn;
      } else {
        Sn = t[83];
      }
      let jn;
      if (t[84] !== It || t[85] !== Ft || t[86] !== Sn) {
        jn = Km.jsx(Td, {
          color: "permission",
          children: Km.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [It, Ft, Sn]
          })
        });
        t[84] = It;
        t[85] = Ft;
        t[86] = Sn;
        t[87] = jn;
      } else {
        jn = t[87];
      }
      return jn;
    }
    if (P !== null) {
      let Tt;
      if (t[88] !== H) {
        Tt = _We(H);
        t[88] = H;
        t[89] = Tt;
      } else {
        Tt = t[89];
      }
      let kt = Tt;
      let Ye;
      if (t[90] !== m) {
        Ye = Km.jsx(Text, {
          bold: true,
          color: "permission",
          children: m
        });
        t[90] = m;
        t[91] = Ye;
      } else {
        Ye = t[91];
      }
      let ht = kt ? H : C[P];
      let It;
      if (t[92] !== ht) {
        It = Km.jsx(Xcr, {
          value: ht
        });
        t[92] = ht;
        t[93] = It;
      } else {
        It = t[93];
      }
      let Rt;
      if (t[94] === Symbol.for("react.memo_cache_sentinel")) {
        Rt = Km.jsx(Text, {
          children: " "
        });
        t[94] = Rt;
      } else {
        Rt = t[94];
      }
      let wt;
      if (t[95] !== P) {
        wt = Km.jsx(Text, {
          bold: true,
          children: P
        });
        t[95] = P;
        t[96] = wt;
      } else {
        wt = t[96];
      }
      let vt;
      if (t[97] !== It || t[98] !== wt) {
        vt = Km.jsxs(gXd, {
          children: [It, Rt, wt]
        });
        t[97] = It;
        t[98] = wt;
        t[99] = vt;
      } else {
        vt = t[99];
      }
      let yt = C[P];
      let gt;
      if (t[100] !== yt) {
        gt = Km.jsxs(Text, {
          dimColor: true,
          children: ["preset: ", yt]
        });
        t[100] = yt;
        t[101] = gt;
      } else {
        gt = t[101];
      }
      let Ft;
      if (t[102] !== vt || t[103] !== gt) {
        Ft = Km.jsxs(gXd, {
          flexDirection: "column",
          children: [vt, gt]
        });
        t[102] = vt;
        t[103] = gt;
        t[104] = Ft;
      } else {
        Ft = t[104];
      }
      let on;
      if (t[105] === Symbol.for("react.memo_cache_sentinel")) {
        on = Km.jsx(Text, {
          children: "Value: "
        });
        t[105] = on;
      } else {
        on = t[105];
      }
      let rn;
      if (t[106] !== Te || t[107] !== fe || t[108] !== N || t[109] !== H || t[110] !== pe) {
        rn = Km.jsxs(gXd, {
          children: [on, Km.jsx(Dl, {
            value: H,
            onChange: pe,
            onSubmit: fe,
            onExit: Te,
            placeholder: "rgb(r,g,b) \xB7 #rrggbb \xB7 ansi:red",
            columns: 40,
            cursorOffset: N,
            onChangeCursorOffset: W,
            disableCursorMovementForUpDownKeys: true,
            disableEscapeDoublePress: true,
            focus: true,
            showCursor: true
          })]
        });
        t[106] = Te;
        t[107] = fe;
        t[108] = N;
        t[109] = H;
        t[110] = pe;
        t[111] = rn;
      } else {
        rn = t[111];
      }
      let Sn;
      if (t[112] !== kt) {
        Sn = kt ? Km.jsxs(Hn, {
          children: [Km.jsx(xt, {
            chord: "enter",
            action: "save"
          }), Km.jsx(xt, {
            chord: "escape",
            action: "cancel"
          })]
        }) : "Accepts rgb(r,g,b), #rrggbb, ansi256(n), or ansi:name";
        t[112] = kt;
        t[113] = Sn;
      } else {
        Sn = t[113];
      }
      let jn;
      if (t[114] !== Sn) {
        jn = Km.jsx(Text, {
          dimColor: true,
          children: Sn
        });
        t[114] = Sn;
        t[115] = jn;
      } else {
        jn = t[115];
      }
      let Xr;
      if (t[116] !== Ye || t[117] !== Ft || t[118] !== rn || t[119] !== jn) {
        Xr = Km.jsx(Td, {
          color: "permission",
          children: Km.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [Ye, Ft, rn, jn]
          })
        });
        t[116] = Ye;
        t[117] = Ft;
        t[118] = rn;
        t[119] = jn;
        t[120] = Xr;
      } else {
        Xr = t[120];
      }
      return Xr;
    }
    let ke = `${m} \xB7 based on ${S}`;
    let Ie;
    if (t[121] !== ce) {
      Ie = {
        action: "reset",
        handler: Tt => {
          if (Tt) {
            ce(Tt);
          }
        }
      };
      t[121] = ce;
      t[122] = Ie;
    } else {
      Ie = t[122];
    }
    let Ue;
    if (t[123] !== S || t[124] !== m || t[125] !== o || t[126] !== A || t[127] !== c || t[128] !== y) {
      Ue = () => {
        c(null);
        o({
          slug: y,
          name: m,
          base: S,
          overrides: A,
          source: "user"
        });
      };
      t[123] = S;
      t[124] = m;
      t[125] = o;
      t[126] = A;
      t[127] = c;
      t[128] = y;
      t[129] = Ue;
    } else {
      Ue = t[129];
    }
    let Ge;
    if (t[130] !== Q || t[131] !== y) {
      Ge = Q > 0 ? `${Q} ${un(Q, "color")} customized \xB7 ${y}.json` : `editing ${y}.json`;
      t[130] = Q;
      t[131] = y;
      t[132] = Ge;
    } else {
      Ge = t[132];
    }
    let Be;
    if (t[133] !== A || t[134] !== ee) {
      Be = (Tt, kt) => {
        let Ye = A[Tt] !== undefined;
        return Km.jsxs(gXd, {
          children: [Km.jsx(Xcr, {
            value: ee(Tt)
          }), Km.jsx(Text, {
            children: " "
          }), Km.jsx(Text, {
            color: kt ? "suggestion" : undefined,
            children: Tt
          }), Km.jsx(lie, {
            when: Ye,
            children: "custom"
          })]
        });
      };
      t[133] = A;
      t[134] = ee;
      t[135] = Be;
    } else {
      Be = t[135];
    }
    let We;
    if (t[136] !== A || t[137] !== C || t[138] !== ee) {
      We = Tt => Km.jsxs(gXd, {
        flexDirection: "column",
        children: [Km.jsxs(Text, {
          children: ["current: ", Km.jsx(Xcr, {
            value: ee(Tt)
          }), " ", ee(Tt)]
        }), A[Tt] !== undefined && Km.jsxs(Text, {
          dimColor: true,
          children: ["preset: ", Km.jsx(Xcr, {
            value: C[Tt]
          }), " ", C[Tt]]
        })]
      });
      t[136] = A;
      t[137] = C;
      t[138] = ee;
      t[139] = We;
    } else {
      We = t[139];
    }
    let Ze;
    if (t[140] !== z || t[141] !== M || t[142] !== de || t[143] !== ke || t[144] !== Ie || t[145] !== Ue || t[146] !== Ge || t[147] !== Be || t[148] !== We) {
      Ze = Km.jsx(Jcr, {
        title: ke,
        placeholder: "Filter color tokens\u2026",
        items: z,
        getKey: lef,
        initialQuery: M,
        onQueryChange: L,
        onSelect: de,
        onTab: Ie,
        onCancel: Ue,
        selectAction: "edit",
        cancelAction: "done",
        matchLabel: Ge,
        renderItem: Be,
        renderPreview: We,
        emptyMessage: aef
      });
      t[140] = z;
      t[141] = M;
      t[142] = de;
      t[143] = ke;
      t[144] = Ie;
      t[145] = Ue;
      t[146] = Ge;
      t[147] = Be;
      t[148] = We;
      t[149] = Ze;
    } else {
      Ze = t[149];
    }
    return Ze;
  }
  function aef(e) {
    return `No color named "${e}"`;
  }
  function lef(e) {
    return e;
  }
  function cef(e, t) {
    let n = UWi(e);
    if (!t.some(r => r.slug === n)) {
      return n;
    }
    for (let r = 2;; r++) {
      let o = `${n}-${r}`;
      if (!t.some(s => s.slug === o)) {
        return o;
      }
    }
  }
  var N9o;
  var atc;
  var SK;
  var Km;
  var ief;
  var ctc = __lazy(() => {
    wl();
    et();
    Bs();
    Qbe();
    je();
    Zn();
    Xbe();
    Uvt();
    Ai();
    M9o();
    bs();
    oE();
    q_();
    N9o = __toESM(pt(), 1);
    atc = require("path");
    SK = __toESM(ot(), 1);
    Km = __toESM(ie(), 1);
    ief = "\u2588" + "\u2588";
  });
  var ptc = {};
  __export(ptc, {
    call: () => call_export55
  });
  function uef(e) {
    let t = utc.c(25);
    let {
      onDone: n
    } = e;
    let [r, o] = useTheme();
    let {
      customThemes: s
    } = useCustomThemes();
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        kind: "picker"
      };
      t[0] = i;
    } else {
      i = t[0];
    }
    let [a, l] = dtc.useState(i);
    let c;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      c = Pc("themes");
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d = useThemeSetting();
    let p;
    if (t[2] !== d) {
      p = tG(d);
      t[2] = d;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m = p;
    if (a.kind === "editor") {
      let b;
      if (t[4] !== n || t[5] !== o) {
        b = C => {
          o(SWe(C.slug));
          n(`Using custom theme "${C.name}"`);
        };
        t[4] = n;
        t[5] = o;
        t[6] = b;
      } else {
        b = t[6];
      }
      let S;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        S = () => l({
          kind: "picker"
        });
        t[7] = S;
      } else {
        S = t[7];
      }
      let E;
      if (t[8] !== r || t[9] !== a.initial || t[10] !== b) {
        E = xen.jsx(ltc, {
          initial: a.initial,
          defaultBase: r,
          onDone: b,
          onCancel: S
        });
        t[8] = r;
        t[9] = a.initial;
        t[10] = b;
        t[11] = E;
      } else {
        E = t[11];
      }
      return E;
    }
    let f;
    if (t[12] !== s || t[13] !== n || t[14] !== o) {
      f = b => {
        o(b);
        n(tG(b) ? `Using custom theme "${s.find(S => SWe(S.slug) === b)?.name ?? b}"` : `Theme set to ${b}`);
      };
      t[12] = s;
      t[13] = n;
      t[14] = o;
      t[15] = f;
    } else {
      f = t[15];
    }
    let h;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      h = u ? undefined : b => l({
        kind: "editor",
        initial: b
      });
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== m) {
      g = u ? `Custom themes are disabled in safe mode \u2014 ${UR()} to create or edit them${m ? `. Your saved theme "${m}" is a custom theme; selecting a preset here replaces it` : ""}` : "";
      t[17] = m;
      t[18] = g;
    } else {
      g = t[18];
    }
    let y;
    if (t[19] !== n) {
      y = () => {
        n("Theme picker dismissed", {
          display: "system"
        });
      };
      t[19] = n;
      t[20] = y;
    } else {
      y = t[20];
    }
    let _;
    if (t[21] !== f || t[22] !== g || t[23] !== y) {
      _ = xen.jsx(Td, {
        color: "permission",
        children: xen.jsx(xvt, {
          onThemeSelect: f,
          onCustomTheme: h,
          helpText: g,
          onCancel: y,
          skipExitHandling: true
        })
      });
      t[21] = f;
      t[22] = g;
      t[23] = y;
      t[24] = _;
    } else {
      _ = t[24];
    }
    return _;
  }
  var utc;
  var dtc;
  var xen;
  var call_export55 = async (e, t) => xen.jsx(uef, {
    onDone: e
  });
  var mtc = __lazy(() => {
    oE();
    ctc();
    Msr();
    et();
    wb();
    Qbe();
    gn();
    utc = __toESM(pt(), 1);
    dtc = __toESM(ot(), 1);
    xen = __toESM(ie(), 1);
  });
  var pef;
  function gtc(e, t, n, r) {
    let o = Wt();
    if (o === "windows" || !htc.isAbsolute(e)) {
      return;
    }
    let s;
    try {
      if (r) {
        s = process.cwd();
        process.chdir(r);
      }
      let i = require("bun:ffi");
      let {
        symbols: a
      } = i.dlopen(o === "macos" ? "/usr/lib/libSystem.B.dylib" : "libc.so.6", {
        execve: {
          args: ["ptr", "ptr", "ptr"],
          returns: "int"
        }
      });
      let l = [];
      let c = m => {
        let f = Buffer.from(m + "\x00", "utf8");
        l.push(f);
        return BigInt(i.ptr(f));
      };
      let u = m => {
        let f = new BigUint64Array(m.length + 1);
        m.forEach((h, g) => f[g] = c(h));
        return f;
      };
      let d = Object.entries(n).flatMap(([m, f]) => f === undefined ? [] : [`${m}=${f}`]);
      let p = Buffer.from(e + "\x00", "utf8");
      a.execve(p, u(t), u(d));
      logForDebugging(`execve(${e}) failed \u2014 falling back to spawn`, {
        level: "warn"
      });
    } catch (i) {
      logForDebugging(`execReplaceProcess: ${he(i)} \u2014 falling back to spawn`, {
        level: "warn"
      });
    } finally {
      if (s !== undefined) {
        try {
          process.chdir(s);
        } catch {}
      }
    }
  }
  var htc;
  var ytc = __lazy(() => {
    je();
    dt();
    Cs();
    htc = require("path");
  });
  async function Xfe(e = {}) {
    let {
      cmd: t,
      prefixArgs: n
    } = e.launcher ?? eH();
    let r = getMaterializedSessionFile();
    let o = e.extraArgs ?? [];
    let s;
    if (e.args) {
      s = e.args;
    } else if (e.freshIfNoTranscript && (!r || !(await Stc.stat(r).then(c => c.size > 0, () => false)))) {
      s = o;
    } else {
      s = ["--resume", getSessionId(), ...o];
    }
    claimShutdown();
    cleanupTerminalModes();
    emitScrollTelemetrySummary();
    await Promise.all([withTimeout(flushSessionStorage(), 30000, "flush timeout (relaunch)").catch(() => {}), withTimeout(RZe(), 2000, "cleanup timeout").catch(() => {}).then(() => withTimeout(flushAnalyticsSinks_export(), 1000, "analytics flush timeout").catch(() => {}))]);
    e.preSpawn?.();
    let i = {
      ...process.env
    };
    delete i.CLAUDE_CODE_TUI_JUST_SWITCHED;
    delete i.CLAUDE_BRIDGE_REATTACH_SESSION;
    delete i.CLAUDE_BRIDGE_REATTACH_SEQ;
    delete i.CLAUDE_BRIDGE_REATTACH_OUTBOUND_ONLY;
    Object.assign(i, e.env);
    for (let c of e.dropEnv ?? []) {
      delete i[c];
    }
    let a = F9o();
    await _tc();
    gtc(t, [t, ...n, ...s], i, a);
    for (let c of ["SIGINT", "SIGTERM", "SIGHUP"]) {
      process.removeAllListeners(c);
      process.on(c, () => {});
    }
    await _tc();
    let l = btc.spawnSync(t, [...n, ...s], {
      stdio: "inherit",
      env: i,
      cwd: a
    });
    if (process.removeAllListeners("beforeExit"), process.removeAllListeners("exit"), l.error) {
      process.stderr.write(`Failed to relaunch Claude Code: ${l.error.message}
`);
      setBgExitCause("relaunch_spawn_error");
      process.exit(1);
    }
    if (l.signal) {
      process.removeAllListeners(l.signal);
      process.kill(process.pid, l.signal);
      process.exit(128 + (Ttc.constants.signals[l.signal] ?? 0));
    }
    process.exit(l.status ?? (l.signal ? 1 : 0));
  }
  function F9o() {
    let e = getMaterializedSessionFile();
    let t = getOriginalCwd();
    if (e && Etc.dirname(e) === ty(t)) {
      return t;
    }
    return getProjectRoot();
  }
  async function _tc() {
    await Promise.all([withTimeout(flushDebugLogs(), 2000, "debug flush timeout (relaunch)").catch(() => {}), withTimeout(JDt(), 2000, "diag flush timeout (relaunch)").catch(() => {}), withTimeout(Jln(), 2000, "pre-exit flush timeout (relaunch)").catch(() => {})]);
  }
  var btc;
  var Stc;
  var Ttc;
  var Etc;
  var oCt = __lazy(() => {
    at();
    M7();
    hd();
    je();
    Zm();
    ytc();
    lm();
    Sve();
    Fy();
    fa();
    btc = require("child_process");
    Stc = require("fs/promises");
    Ttc = require("os");
    Etc = require("path");
  });
  function Qcr(e, t) {
    let n = Array.from(e.additionalWorkingDirectories.values()).filter(a => a.source === "cliArg" || a.source === "session").map(a => a.path);
    let r = [];
    let o = false;
    for (let a of getReplConfigArgv()) {
      if (o) {
        o = false;
      } else if (a === "--add-dir") {
        o = true;
      } else {
        r.push(a);
      }
    }
    let s = typeof t === "string" && jIe();
    let i = e.isBypassPermissionsModeAvailable && !r.includes("--allow-dangerously-skip-permissions");
    return [...r, ...(i ? ["--allow-dangerously-skip-permissions"] : []), ...n.flatMap(a => ["--add-dir", a]), ...(s ? ["--effort", t] : []), "--permission-mode", e.mode];
  }
  var U9o = __lazy(() => {
    at();
    Fp();
  });
  var wtc = {};
  __export(wtc, {
    relaunchInto: () => relaunchInto,
    call: () => call_export56
  });
  function relaunchInto(e, t) {
    return Xfe({
      freshIfNoTranscript: true,
      extraArgs: t,
      env: {
        CLAUDE_CODE_TUI_JUST_SWITCHED: e,
        ...yIe()
      },
      dropEnv: ["CLAUDE_CODE_NO_FLICKER", "CLAUDE_CODE_DISABLE_ALTERNATE_SCREEN", "CLAUDE_CODE_FORCE_FULLSCREEN_UPSELL"]
    });
  }
  function hef(e) {
    return e.toLowerCase().replace(/[^a-z]/g, "") === "egcouldntcopytext";
  }
  function yef(e) {
    let t = vtc.c(20);
    let {
      fromEntryPath: n,
      bounce: r,
      revertKind: o,
      carryFlags: s,
      onDone: i
    } = e;
    let [a, l] = YUe.useState("");
    let [c, u] = YUe.useState(0);
    let [d, p] = YUe.useState(null);
    let {
      columns: m
    } = Sr();
    let f = YUe.useRef(false);
    let h;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      h = O => {
        if (f.current) {
          return;
        }
        f.current = true;
        p(O.trim());
      };
      t[0] = h;
    } else {
      h = t[0];
    }
    let g = h;
    let y;
    let _;
    if (t[1] !== r || t[2] !== s || t[3] !== n || t[4] !== i || t[5] !== o || t[6] !== d) {
      y = () => {
        if (d === null) {
          return;
        }
        let O = false;
        (async () => {
          if (d && !hef(d)) {
            let M = Lc(d).slice(0, 1000);
            await logEventTo1PAwaitable("tengu_tui_optout_reason", {
              reason: M,
              from_entry_path: n,
              bounce: r,
              downsell_gate: ire.downsellGateCached === true,
              revert_kind: o,
              downsell_seen_count: getGlobalConfig().fullscreenDownsellSeenCount ?? 0
            }).catch(Oe);
          }
          if (await sleep(16 * 2), O) {
            return;
          }
          relaunchInto("default", s).catch(M => {
            Oe(M);
            i(`Couldn't switch renderers \u2014 ${M instanceof Error ? M.message : String(M)}. The setting was saved; restart Claude Code to apply it.`, {
              display: "system"
            });
          });
        })();
        return () => {
          O = true;
        };
      };
      _ = [d, n, r, o, s, i];
      t[1] = r;
      t[2] = s;
      t[3] = n;
      t[4] = i;
      t[5] = o;
      t[6] = d;
      t[7] = y;
      t[8] = _;
    } else {
      y = t[7];
      _ = t[8];
    }
    YUe.useEffect(y, _);
    let b;
    let S;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      b = () => g("");
      S = {
        context: "Settings"
      };
      t[9] = b;
      t[10] = S;
    } else {
      b = t[9];
      S = t[10];
    }
    if (uo("confirm:no", b, S), d !== null) {
      let O;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        O = TK.jsx(gXd, {
          paddingX: 1,
          children: TK.jsx(Text, {
            dimColor: true,
            children: "Switching back to the classic renderer\u2026"
          })
        });
        t[11] = O;
      } else {
        O = t[11];
      }
      return O;
    }
    let E;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      E = () => g("");
      t[12] = E;
    } else {
      E = t[12];
    }
    let C;
    let x;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      C = TK.jsxs(Hn, {
        children: [TK.jsx(xt, {
          chord: "enter",
          action: "send"
        }), TK.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "skip"
        })]
      });
      x = TK.jsx(Text, {
        children: "To help us make fullscreen mode better, what made you switch back?"
      });
      t[13] = C;
      t[14] = x;
    } else {
      C = t[13];
      x = t[14];
    }
    let A;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      A = TK.jsx(Text, {
        children: ">"
      });
      t[15] = A;
    } else {
      A = t[15];
    }
    let k = Math.max(10, m - 8);
    let I;
    if (t[16] !== c || t[17] !== a || t[18] !== k) {
      I = TK.jsxs(or, {
        title: "Fullscreen feedback",
        onCancel: E,
        isCancelActive: false,
        inputGuide: C,
        children: [x, TK.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          children: [A, TK.jsx(Dl, {
            value: a,
            onChange: l,
            onSubmit: g,
            focus: true,
            showCursor: true,
            columns: k,
            cursorOffset: c,
            onChangeCursorOffset: u
          })]
        })]
      });
      t[16] = c;
      t[17] = a;
      t[18] = k;
      t[19] = I;
    } else {
      I = t[19];
    }
    return I;
  }
  var vtc;
  var YUe;
  var TK;
  var B9o;
  var call_export56 = async (e, t, n) => {
    let r = n.trim().toLowerCase();
    let o = qs() ? "fullscreen" : "default";
    if (r === "") {
      e(`Current renderer: ${o}. Usage: /tui <${B9o.join("|")}>`, {
        display: "system"
      });
      return null;
    }
    if (!B9o.includes(r)) {
      e(`Unknown renderer "${r}". Usage: /tui <${B9o.join("|")}>`, {
        display: "system"
      });
      return null;
    }
    let s = r;
    let i = Qcr(getToolPermissionContext(t), getEffortValue(t));
    if (li()) {
      e("Background sessions always use the fullscreen renderer so scrolling and mouse work when attached. The tui setting applies to sessions started directly with `claude`.", {
        display: "system"
      });
      return null;
    }
    if (tM()) {
      e("Screen-reader mode always uses the classic renderer, so the tui setting has no effect while it is active.", {
        display: "system"
      });
      return null;
    }
    let a = s === "fullscreen";
    let l = a === qs();
    if (l && getInitialSettings().tui !== undefined) {
      e(`Already using the ${s} renderer.`, {
        display: "system"
      });
      return null;
    }
    if (!l) {
      let m = t.taskRegistry.all();
      if (Object.values(m).some(h => (h.status === "running" || h.status === "pending") && h.type !== "remote_agent" && !(h.type === "mcp_task" && h.abortController === undefined))) {
        logEvent("tengu_tui_refused", {
          active_tasks: true
        });
        e("Cannot switch renderers while work is running in the background \u2014 wait for it to finish (or stop it via /tasks), then run /tui again.", {
          display: "system"
        });
        return null;
      }
    }
    let c = tPe();
    let {
      error: u
    } = updateSettingsForSource("userSettings", {
      tui: s
    });
    if (u) {
      e(`Failed to save setting: ${u.message}`, {
        display: "system"
      });
      return null;
    }
    let d = VF();
    let p = (process.env.CLAUDE_CODE_TUI_JUST_SWITCHED === "fullscreen" || c === "downsell_on" || ire.downsellGateCached === true) && s === "default";
    if (logEvent("tengu_tui_command", {
      fullscreen: a,
      from: o,
      to: s,
      from_entry_path: c,
      session_age_ms: Math.round(process.uptime() * 1000),
      bounce: p,
      scroll_decay_curve: d.useDecayCurve,
      scroll_base: d.base,
      scroll_xtermjs: d.xtermJs
    }), l) {
      e(`Already using the ${s} renderer.`, {
        display: "system"
      });
      return null;
    }
    if (s === "default" && (p || c === "gb_on" || c === "settings_on") && is1PEventLoggingEnabled() && isPolicyAllowed("allow_product_feedback")) {
      return TK.jsx(yef, {
        fromEntryPath: c,
        bounce: p,
        revertKind: p || c === "gb_on" ? "same_session" : "later_session",
        carryFlags: i,
        onDone: e
      });
    }
    return relaunchInto(s, i).catch(m => (Oe(m), e(`Couldn't switch renderers \u2014 ${m instanceof Error ? m.message : String(m)}. The setting was saved; restart Claude Code to apply it.`, {
      display: "system"
    }), null));
  };
  var $9o = __lazy(() => {
    Sd();
    Ai();
    Ii();
    bs();
    q_();
    ki();
    pPe();
    et();
    Bs();
    BF();
    Ot();
    Kc();
    yd();
    Sl();
    zp();
    Rn();
    Kv();
    oCt();
    D8();
    U9o();
    vtc = __toESM(pt(), 1);
    YUe = __toESM(ot(), 1);
    TK = __toESM(ie(), 1);
    B9o = ["default", "fullscreen"];
  });
  var _ef;
  function Atc(e) {
    let t = xtc.c(4);
    let {
      children: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = [];
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = sCt.useRef(r);
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        getDenials: () => o.current,
        recordDenial: l => {
          o.current = [l, ...o.current.slice(0, 20 - 1)];
        },
        removeDenial: l => {
          o.current = o.current.filter(c => c !== l);
        }
      };
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] !== n) {
      a = Itc.jsx(ktc.Provider, {
        value: i,
        children: n
      });
      t[2] = n;
      t[3] = a;
    } else {
      a = t[3];
    }
    return a;
  }
  function iCt() {
    return sCt.useContext(ktc);
  }
  var xtc;
  var sCt;
  var Itc;
  var ktc;
  var Aen = __lazy(() => {
    xtc = __toESM(pt(), 1);
    sCt = __toESM(ot(), 1);
    Itc = __toESM(ie(), 1);
    ktc = sCt.createContext({
      getDenials: () => [],
      recordDenial: () => {},
      removeDenial: () => {}
    });
  });
  function Zcr(e) {
    let t = Ptc.c(9);
    let {
      ruleValue: n
    } = e;
    switch (n.toolName) {
      case xl.name:
        if (n.ruleContent) {
          if (n.ruleContent.endsWith(":*") || n.ruleContent.endsWith(" *")) {
            let r;
            if (t[0] !== n.ruleContent) {
              r = n.ruleContent.slice(0, -2);
              t[0] = n.ruleContent;
              t[1] = r;
            } else {
              r = t[1];
            }
            let o;
            if (t[2] !== r) {
              o = pCe.jsxs(Text, {
                dimColor: true,
                children: ["Any Bash command starting with", " ", pCe.jsx(Text, {
                  bold: true,
                  children: r
                })]
              });
              t[2] = r;
              t[3] = o;
            } else {
              o = t[3];
            }
            return o;
          } else {
            let r;
            if (t[4] !== n.ruleContent) {
              r = pCe.jsxs(Text, {
                dimColor: true,
                children: ["The Bash command ", pCe.jsx(Text, {
                  bold: true,
                  children: n.ruleContent
                })]
              });
              t[4] = n.ruleContent;
              t[5] = r;
            } else {
              r = t[5];
            }
            return r;
          }
        } else {
          let r;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            r = pCe.jsx(Text, {
              dimColor: true,
              children: "Any Bash command"
            });
            t[6] = r;
          } else {
            r = t[6];
          }
          return r;
        }
      default:
        if (!n.ruleContent) {
          let r;
          if (t[7] !== n.toolName) {
            r = pCe.jsxs(Text, {
              dimColor: true,
              children: ["Any use of the ", pCe.jsx(Text, {
                bold: true,
                children: n.toolName
              }), " tool"]
            });
            t[7] = n.toolName;
            t[8] = r;
          } else {
            r = t[8];
          }
          return r;
        } else {
          return null;
        }
    }
  }
  var Ptc;
  var pCe;
  var H9o = __lazy(() => {
    et();
    R$();
    Ptc = __toESM(pt(), 1);
    pCe = __toESM(ie(), 1);
  });
  function Sef(e) {
    switch (e) {
      case "localSettings":
        return {
          label: "Project settings (local)",
          description: `Saved in ${getRelativeSettingsFilePathForSource("localSettings")}`,
          value: e
        };
      case "projectSettings":
        return {
          label: "Project settings",
          description: `Checked in at ${getRelativeSettingsFilePathForSource("projectSettings")}`,
          value: e
        };
      case "userSettings":
        return {
          label: "User settings",
          description: "Saved in at ~/.claude/settings.json",
          value: e
        };
    }
  }
  function Dtc(e) {
    let t = Otc.c(26);
    let {
      onAddRules: n,
      onCancel: r,
      ruleValues: o,
      ruleBehavior: s,
      initialContext: i,
      setToolPermissionContext: a
    } = e;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = yMt.map(Sef);
      t[0] = l;
    } else {
      l = t[0];
    }
    let c = l;
    let u;
    if (t[1] !== i || t[2] !== n || t[3] !== r || t[4] !== s || t[5] !== o || t[6] !== a) {
      u = E => {
        if (E === "cancel") {
          r();
          return;
        } else if (yMt.includes(E)) {
          let C = E;
          let x = $y(i, {
            type: "addRules",
            rules: o,
            behavior: s,
            destination: C
          });
          Zde({
            type: "addRules",
            rules: o,
            behavior: s,
            destination: C
          });
          a(x);
          let A = o.map(M => ({
            ruleValue: M,
            ruleBehavior: s,
            source: C
          }));
          let k = SandboxManager.isSandboxingEnabled() && SandboxManager.isAutoAllowBashIfSandboxedEnabled();
          let O = Xir(x, {
            sandboxAutoAllowEnabled: k
          }).filter(M => o.some(L => L.toolName === M.rule.ruleValue.toolName && L.ruleContent === M.rule.ruleValue.ruleContent));
          n(A, O);
        }
      };
      t[1] = i;
      t[2] = n;
      t[3] = r;
      t[4] = s;
      t[5] = o;
      t[6] = a;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = u;
    let p;
    if (t[8] !== o.length) {
      p = un(o.length, "rule");
      t[8] = o.length;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m = `Add ${s} permission ${p}`;
    let f;
    if (t[10] !== o) {
      f = o.map(Tef);
      t[10] = o;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h;
    if (t[12] !== f) {
      h = Qfe.jsx(gXd, {
        flexDirection: "column",
        paddingX: 2,
        children: f
      });
      t[12] = f;
      t[13] = h;
    } else {
      h = t[13];
    }
    let g = o.length === 1 ? "Where should this rule be saved?" : "Where should these rules be saved?";
    let y;
    if (t[14] !== g) {
      y = Qfe.jsx(Text, {
        children: g
      });
      t[14] = g;
      t[15] = y;
    } else {
      y = t[15];
    }
    let _;
    if (t[16] !== d) {
      _ = Qfe.jsx(xr, {
        options: c,
        onChange: d
      });
      t[16] = d;
      t[17] = _;
    } else {
      _ = t[17];
    }
    let b;
    if (t[18] !== y || t[19] !== _) {
      b = Qfe.jsxs(gXd, {
        flexDirection: "column",
        marginY: 1,
        children: [y, _]
      });
      t[18] = y;
      t[19] = _;
      t[20] = b;
    } else {
      b = t[20];
    }
    let S;
    if (t[21] !== r || t[22] !== h || t[23] !== b || t[24] !== m) {
      S = Qfe.jsxs(or, {
        title: m,
        onCancel: r,
        color: "permission",
        children: [h, b]
      });
      t[21] = r;
      t[22] = h;
      t[23] = b;
      t[24] = m;
      t[25] = S;
    } else {
      S = t[25];
    }
    return S;
  }
  function Tef(e) {
    return Qfe.jsxs(gXd, {
      flexDirection: "column",
      children: [Qfe.jsx(Text, {
        bold: true,
        children: jp(e)
      }), Qfe.jsx(Zcr, {
        ruleValue: e
      })]
    }, jp(e));
  }
  var Otc;
  var Qfe;
  var Mtc = __lazy(() => {
    $c();
    et();
    Zk();
    EC();
    e3o();
    Th();
    nf();
    Zn();
    Ii();
    H9o();
    Otc = __toESM(pt(), 1);
    Qfe = __toESM(ie(), 1);
  });
  function Ltc(e) {
    let t = Ntc.c(18);
    let {
      onCancel: n,
      onSubmit: r,
      ruleBehavior: o
    } = e;
    let [s, i] = j9o.useState("");
    let [a, l] = j9o.useState(0);
    let c;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      c = {
        context: "Settings"
      };
      t[0] = c;
    } else {
      c = t[0];
    }
    uo("confirm:no", n, c);
    let {
      columns: u
    } = Sr();
    let d = u - 6;
    let p;
    if (t[1] !== r || t[2] !== o) {
      p = C => {
        let x = C.trim();
        if (x.length === 0) {
          return;
        }
        let A = Nh(x);
        r(A, o);
      };
      t[1] = r;
      t[2] = o;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m = p;
    let f = `Add ${o} permission rule`;
    let h;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      h = O5.jsxs(Hn, {
        children: [O5.jsx(xt, {
          chord: "enter",
          action: "submit"
        }), O5.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      });
      t[4] = h;
    } else {
      h = t[4];
    }
    let g;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      g = O5.jsx(Newline, {});
      t[5] = g;
    } else {
      g = t[5];
    }
    let y;
    let _;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      y = O5.jsx(Text, {
        bold: true,
        children: jp({
          toolName: s5.name
        })
      });
      _ = O5.jsx(Text, {
        bold: false,
        children: " or "
      });
      t[6] = y;
      t[7] = _;
    } else {
      y = t[6];
      _ = t[7];
    }
    let b;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      b = O5.jsxs(Text, {
        children: ["Permission rules are a tool name, optionally followed by a specifier in parentheses.", g, "e.g.,", " ", y, _, O5.jsx(Text, {
          bold: true,
          children: jp({
            toolName: xl.name,
            ruleContent: "ls *"
          })
        })]
      });
      t[8] = b;
    } else {
      b = t[8];
    }
    let S;
    if (t[9] !== a || t[10] !== m || t[11] !== s || t[12] !== d) {
      S = O5.jsxs(gXd, {
        flexDirection: "column",
        children: [b, O5.jsx(gXd, {
          borderDimColor: true,
          borderStyle: "round",
          marginY: 1,
          paddingLeft: 1,
          children: O5.jsx(Dl, {
            showCursor: true,
            value: s,
            onChange: i,
            onSubmit: m,
            placeholder: `Enter permission rule${vGd.ellipsis}`,
            columns: d,
            cursorOffset: a,
            onChangeCursorOffset: l
          })
        })]
      });
      t[9] = a;
      t[10] = m;
      t[11] = s;
      t[12] = d;
      t[13] = S;
    } else {
      S = t[13];
    }
    let E;
    if (t[14] !== n || t[15] !== f || t[16] !== S) {
      E = O5.jsx(or, {
        title: f,
        onCancel: n,
        color: "permission",
        isCancelActive: false,
        inputGuide: h,
        children: S
      });
      t[14] = n;
      t[15] = f;
      t[16] = S;
      t[17] = E;
    } else {
      E = t[17];
    }
    return E;
  }
  var Ntc;
  var j9o;
  var O5;
  var Ftc = __lazy(() => {
    q_();
    ki();
    et();
    Bs();
    R$();
    Aer();
    EC();
    Ai();
    Ii();
    bs();
    Ntc = __toESM(pt(), 1);
    j9o = __toESM(ot(), 1);
    O5 = __toESM(ie(), 1);
  });
  function Btc(e) {
    let t = Utc.c(32);
    let {
      onHeaderFocusChange: n,
      onStateChange: r
    } = e;
    let {
      headerFocused: o,
      focusHeader: s
    } = zM();
    let i;
    let a;
    if (t[0] !== o || t[1] !== n) {
      i = () => {
        n(o);
      };
      a = [o, n];
      t[0] = o;
      t[1] = n;
      t[2] = i;
      t[3] = a;
    } else {
      i = t[2];
      a = t[3];
    }
    JUe.useEffect(i, a);
    let {
      getDenials: l
    } = iCt();
    let [c] = JUe.useState(l);
    let [u, d] = JUe.useState(vef);
    let [p, m] = JUe.useState(Eef);
    let [f, h] = JUe.useState(0);
    let g;
    let y;
    if (t[4] !== u || t[5] !== c || t[6] !== r || t[7] !== p) {
      g = () => {
        r({
          approved: u,
          retry: p,
          denials: c
        });
      };
      y = [u, p, c, r];
      t[4] = u;
      t[5] = c;
      t[6] = r;
      t[7] = p;
      t[8] = g;
      t[9] = y;
    } else {
      g = t[8];
      y = t[9];
    }
    JUe.useEffect(g, y);
    let _;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      _ = P => {
        let F = Number(P);
        d(H => {
          let U = new Set(H);
          if (U.vZc(F)) {
            U.delete(F);
          } else {
            U.add(F);
          }
          return U;
        });
      };
      t[10] = _;
    } else {
      _ = t[10];
    }
    let b = _;
    let S;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      S = P => {
        h(Number(P));
      };
      t[11] = S;
    } else {
      S = t[11];
    }
    let E = S;
    let C;
    if (t[12] !== f || t[13] !== o) {
      C = function (F) {
        if (o) {
          return;
        }
        if (F.ctrl || F.meta || F.shift) {
          return;
        }
        if (F.key !== "r") {
          return;
        }
        F.preventDefault();
        m(H => {
          let U = new Set(H);
          if (U.vZc(f)) {
            U.delete(f);
          } else {
            U.add(f);
          }
          return U;
        });
        d(H => {
          if (H.vZc(f)) {
            return H;
          }
          let U = new Set(H);
          U.add(f);
          return U;
        });
      };
      t[12] = f;
      t[13] = o;
      t[14] = C;
    } else {
      C = t[14];
    }
    let x = C;
    if (c.length === 0) {
      let P;
      if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
        P = Zfe.jsx(Text, {
          dimColor: true,
          children: "No recent denials. Commands denied by the auto mode classifier will appear here."
        });
        t[15] = P;
      } else {
        P = t[15];
      }
      return P;
    }
    let A;
    if (t[16] !== u || t[17] !== c || t[18] !== p) {
      let P;
      if (t[20] !== u || t[21] !== p) {
        P = (F, H) => {
          let U = u.vZc(H);
          let N = p.vZc(H) ? " (retry)" : "";
          return {
            label: Zfe.jsxs(Text, {
              children: [Zfe.jsx(Ps, {
                status: U ? "success" : "error",
                withSpace: true
              }), F.display, Zfe.jsx(Text, {
                dimColor: true,
                children: N
              })]
            }),
            value: String(H),
            ...(F.reason ? {
              description: F.reason,
              dimDescription: true
            } : {})
          };
        };
        t[20] = u;
        t[21] = p;
        t[22] = P;
      } else {
        P = t[22];
      }
      A = c.map(P);
      t[16] = u;
      t[17] = c;
      t[18] = p;
      t[19] = A;
    } else {
      A = t[19];
    }
    let k = A;
    let I;
    if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
      I = Zfe.jsx(Text, {
        children: "Commands recently denied by the auto mode classifier."
      });
      t[23] = I;
    } else {
      I = t[23];
    }
    let O = Math.min(10, k.length);
    let M;
    if (t[24] !== s || t[25] !== o || t[26] !== k || t[27] !== O) {
      M = Zfe.jsx(gXd, {
        marginTop: 1,
        children: Zfe.jsx(xr, {
          options: k,
          onChange: b,
          onFocus: E,
          visibleOptionCount: O,
          isDisabled: o,
          onUpFromFirstItem: s
        })
      });
      t[24] = s;
      t[25] = o;
      t[26] = k;
      t[27] = O;
      t[28] = M;
    } else {
      M = t[28];
    }
    let L;
    if (t[29] !== x || t[30] !== M) {
      L = Zfe.jsxs(gXd, {
        flexDirection: "column",
        onKeyDown: x,
        children: [I, M]
      });
      t[29] = x;
      t[30] = M;
      t[31] = L;
    } else {
      L = t[31];
    }
    return L;
  }
  function Eef() {
    return new Set();
  }
  function vef() {
    return new Set();
  }
  var Utc;
  var JUe;
  var Zfe;
  var $tc = __lazy(() => {
    Aen();
    et();
    $c();
    Vf();
    yH();
    Utc = __toESM(pt(), 1);
    JUe = __toESM(ot(), 1);
    Zfe = __toESM(ie(), 1);
  });
  function jtc(e) {
    let t = Htc.c(15);
    let {
      directoryPath: n,
      onRemove: r,
      onCancel: o,
      permissionContext: s,
      setPermissionContext: i
    } = e;
    let a;
    if (t[0] !== n || t[1] !== r || t[2] !== s || t[3] !== i) {
      a = () => {
        let m = $y(s, {
          type: "removeDirectories",
          directories: [n],
          destination: "session"
        });
        i(m);
        r();
      };
      t[0] = n;
      t[1] = r;
      t[2] = s;
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l = a;
    let c;
    if (t[5] !== n) {
      c = eJe.jsx(gXd, {
        marginX: 2,
        flexDirection: "column",
        children: eJe.jsx(Text, {
          bold: true,
          children: n
        })
      });
      t[5] = n;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      u = eJe.jsx(Text, {
        children: "Claude Code will no longer have access to files in this directory."
      });
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== l || t[9] !== o) {
      d = eJe.jsx(mc, {
        onConfirm: l,
        onCancel: o
      });
      t[8] = l;
      t[9] = o;
      t[10] = d;
    } else {
      d = t[10];
    }
    let p;
    if (t[11] !== o || t[12] !== c || t[13] !== d) {
      p = eJe.jsxs(or, {
        title: "Remove directory from workspace?",
        onCancel: o,
        color: "error",
        children: [c, u, d]
      });
      t[11] = o;
      t[12] = c;
      t[13] = d;
      t[14] = p;
    } else {
      p = t[14];
    }
    return p;
  }
  var Htc;
  var eJe;
  var qtc = __lazy(() => {
    et();
    Zk();
    b_();
    Ii();
    Htc = __toESM(pt(), 1);
    eJe = __toESM(ie(), 1);
  });
  function aCt(e) {
    let t = Li(e);
    let n = t === e ? t : t + "\uFFFD";
    return uNe(n.replace(wef, "\uFFFD"));
  }
  var wef;
  var eur = __lazy(() => {
    dNe();
    wef = /[\x00-\x1f\x7f-\x9f\u061c\u2028\u2029\u202a-\u202e\u2066-\u2069\p{Co}\p{Cn}]/gu;
  });
  function Vtc(e) {
    let t = Wtc.c(23);
    let {
      onExit: n,
      toolPermissionContext: r,
      onRequestAddDirectory: o,
      onRequestRemoveDirectory: s,
      onHeaderFocusChange: i
    } = e;
    let {
      headerFocused: a,
      focusHeader: l
    } = zM();
    let c;
    let u;
    if (t[0] !== a || t[1] !== i) {
      c = () => {
        i(a);
      };
      u = [a, i];
      t[0] = a;
      t[1] = i;
      t[2] = c;
      t[3] = u;
    } else {
      c = t[2];
      u = t[3];
    }
    Gtc.useEffect(c, u);
    let d;
    if (t[4] !== r.additionalWorkingDirectories) {
      d = Array.from(r.additionalWorkingDirectories.keys()).map(Ref);
      t[4] = r.additionalWorkingDirectories;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p = d;
    let m;
    if (t[6] !== p || t[7] !== o || t[8] !== s) {
      m = C => {
        if (C === "add-directory") {
          o();
          return;
        }
        let x = p.find(A => A.path === C);
        if (x && x.isDeletable) {
          s(x.path);
        }
      };
      t[6] = p;
      t[7] = o;
      t[8] = s;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f = m;
    let h;
    if (t[10] !== n) {
      h = () => n("Workspace dialog dismissed", {
        display: "system"
      });
      t[10] = n;
      t[11] = h;
    } else {
      h = t[11];
    }
    let g = h;
    let y;
    if (t[12] !== p) {
      y = p.map(Cef);
      let C;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        C = {
          label: `Add directory${vGd.ellipsis}`,
          value: "add-directory"
        };
        t[14] = C;
      } else {
        C = t[14];
      }
      y.push(C);
      t[12] = p;
      t[13] = y;
    } else {
      y = t[13];
    }
    let _ = y;
    let b;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      b = tJe.jsxs(gXd, {
        flexDirection: "row",
        marginTop: 1,
        marginLeft: 2,
        gap: 1,
        children: [tJe.jsx(Text, {
          children: `-  ${aCt(getOriginalCwd())}`
        }), tJe.jsx(Text, {
          dimColor: true,
          children: "(Original working directory)"
        })]
      });
      t[15] = b;
    } else {
      b = t[15];
    }
    let S = Math.min(10, _.length);
    let E;
    if (t[16] !== l || t[17] !== g || t[18] !== f || t[19] !== a || t[20] !== _ || t[21] !== S) {
      E = tJe.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [b, tJe.jsx(xr, {
          options: _,
          onChange: f,
          onCancel: g,
          visibleOptionCount: S,
          onUpFromFirstItem: l,
          isDisabled: a
        })]
      });
      t[16] = l;
      t[17] = g;
      t[18] = f;
      t[19] = a;
      t[20] = _;
      t[21] = S;
      t[22] = E;
    } else {
      E = t[22];
    }
    return E;
  }
  function Cef(e) {
    return {
      label: e.path,
      value: e.path
    };
  }
  function Ref(e) {
    return {
      path: e,
      isCurrent: false,
      isDeletable: true
    };
  }
  var Wtc;
  var Gtc;
  var tJe;
  var ztc = __lazy(() => {
    at();
    $c();
    et();
    eur();
    yH();
    Wtc = __toESM(pt(), 1);
    Gtc = __toESM(ot(), 1);
    tJe = __toESM(ie(), 1);
  });
  function kef(e) {
    let t = lCt.c(4);
    let {
      rule: n
    } = e;
    let r;
    if (t[0] !== n.source) {
      r = permissionRuleSourceDisplayString(n.source);
      t[0] = n.source;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = `From ${r}`;
    let s;
    if (t[2] !== o) {
      s = Tu.jsx(Text, {
        dimColor: true,
        children: o
      });
      t[2] = o;
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  function Aef(e) {
    switch (e) {
      case "allow":
        return "allowed";
      case "deny":
        return "denied";
      case "ask":
        return "ask";
    }
  }
  function Ief(e) {
    let t = lCt.c(29);
    let {
      rule: n,
      onDelete: r,
      onCancel: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        context: "Confirmation"
      };
      t[0] = s;
    } else {
      s = t[0];
    }
    uo("confirm:no", o, s);
    let i;
    if (t[1] !== n.ruleValue) {
      i = jp(n.ruleValue);
      t[1] = n.ruleValue;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== i) {
      a = Tu.jsx(Text, {
        bold: true,
        children: i
      });
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== n.ruleValue) {
      l = Tu.jsx(Zcr, {
        ruleValue: n.ruleValue
      });
      t[5] = n.ruleValue;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] !== n) {
      c = Tu.jsx(kef, {
        rule: n
      });
      t[7] = n;
      t[8] = c;
    } else {
      c = t[8];
    }
    let u;
    if (t[9] !== a || t[10] !== l || t[11] !== c) {
      u = Tu.jsxs(gXd, {
        flexDirection: "column",
        marginX: 2,
        children: [a, l, c]
      });
      t[9] = a;
      t[10] = l;
      t[11] = c;
      t[12] = u;
    } else {
      u = t[12];
    }
    let d = u;
    let p;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      p = Tu.jsx(gXd, {
        marginLeft: 3,
        children: Tu.jsx(Lw, {
          children: Tu.jsx(xt, {
            chord: "escape",
            action: "cancel"
          })
        })
      });
      t[13] = p;
    } else {
      p = t[13];
    }
    let m = p;
    if (n.source === "policySettings") {
      let b;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        b = Tu.jsxs(Text, {
          italic: true,
          children: ["This rule is configured by managed settings and cannot be modified.", `
`, "Contact your system administrator for more information."]
        });
        t[14] = b;
      } else {
        b = t[14];
      }
      let S;
      if (t[15] !== d) {
        S = Tu.jsxs(Tu.Fragment, {
          children: [Tu.jsxs(_E, {
            color: "permission",
            title: "Rule details",
            children: [d, b]
          }), m]
        });
        t[15] = d;
        t[16] = S;
      } else {
        S = t[16];
      }
      return S;
    }
    let f;
    if (t[17] !== n.ruleBehavior) {
      f = Aef(n.ruleBehavior);
      t[17] = n.ruleBehavior;
      t[18] = f;
    } else {
      f = t[18];
    }
    let h;
    if (t[19] !== f) {
      h = Tu.jsxs(Text, {
        bold: true,
        color: "error",
        children: ["Delete ", f, " tool?"]
      });
      t[19] = f;
      t[20] = h;
    } else {
      h = t[20];
    }
    let g;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      g = Tu.jsx(Text, {
        children: "Are you sure you want to delete this permission rule?"
      });
      t[21] = g;
    } else {
      g = t[21];
    }
    let y;
    if (t[22] !== o || t[23] !== r) {
      y = Tu.jsx(mc, {
        onConfirm: r,
        onCancel: o
      });
      t[22] = o;
      t[23] = r;
      t[24] = y;
    } else {
      y = t[24];
    }
    let _;
    if (t[25] !== d || t[26] !== y || t[27] !== h) {
      _ = Tu.jsxs(Tu.Fragment, {
        children: [Tu.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          borderStyle: "round",
          paddingLeft: 1,
          paddingRight: 1,
          borderColor: "error",
          children: [h, d, g, y]
        }), m]
      });
      t[25] = d;
      t[26] = y;
      t[27] = h;
      t[28] = _;
    } else {
      _ = t[28];
    }
    return _;
  }
  function Pef(e) {
    let t = lCt.c(31);
    let {
      options: n,
      searchQuery: r,
      isSearchMode: o,
      isFocused: s,
      onSelect: i,
      onCancel: a,
      lastFocusedRuleKey: l,
      cursorOffset: c,
      onHeaderFocusChange: u
    } = e;
    let d = Ojl();
    let {
      headerFocused: p,
      focusHeader: m,
      blurHeader: f
    } = zM();
    let h;
    let g;
    if (t[0] !== f || t[1] !== p || t[2] !== o) {
      h = () => {
        if (o && p) {
          f();
        }
      };
      g = [o, p, f];
      t[0] = f;
      t[1] = p;
      t[2] = o;
      t[3] = h;
      t[4] = g;
    } else {
      h = t[3];
      g = t[4];
    }
    z3.useEffect(h, g);
    let y;
    let _;
    if (t[5] !== p || t[6] !== u) {
      y = () => {
        u(p);
      };
      _ = [p, u];
      t[5] = p;
      t[6] = u;
      t[7] = y;
      t[8] = _;
    } else {
      y = t[7];
      _ = t[8];
    }
    z3.useEffect(y, _);
    let b = o && !p;
    let S;
    if (t[9] !== c || t[10] !== s || t[11] !== r || t[12] !== b || t[13] !== d) {
      S = Tu.jsx(gXd, {
        marginBottom: 1,
        flexDirection: "column",
        children: Tu.jsx(YM, {
          query: r,
          isFocused: b,
          isTerminalFocused: s,
          width: d,
          cursorOffset: c
        })
      });
      t[9] = c;
      t[10] = s;
      t[11] = r;
      t[12] = b;
      t[13] = d;
      t[14] = S;
    } else {
      S = t[14];
    }
    let E = Math.min(10, n.length);
    let C;
    if (t[15] !== p || t[16] !== o) {
      C = o || p;
      t[15] = p;
      t[16] = o;
      t[17] = C;
    } else {
      C = t[17];
    }
    let x;
    if (t[18] !== m) {
      x = m;
      t[18] = m;
      t[19] = x;
    } else {
      x = t[19];
    }
    let A;
    if (t[20] !== l || t[21] !== a || t[22] !== i || t[23] !== n || t[24] !== E || t[25] !== C || t[26] !== x) {
      A = Tu.jsx(xr, {
        options: n,
        onChange: i,
        onCancel: a,
        visibleOptionCount: E,
        isDisabled: C,
        defaultFocusValue: l,
        onUpFromFirstItem: x
      });
      t[20] = l;
      t[21] = a;
      t[22] = i;
      t[23] = n;
      t[24] = E;
      t[25] = C;
      t[26] = x;
      t[27] = A;
    } else {
      A = t[27];
    }
    let k;
    if (t[28] !== S || t[29] !== A) {
      k = Tu.jsxs(gXd, {
        flexDirection: "column",
        children: [S, A]
      });
      t[28] = S;
      t[29] = A;
      t[30] = k;
    } else {
      k = t[30];
    }
    return k;
  }
  function q9o(e) {
    let t = lCt.c(27);
    let n;
    let r;
    let o;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    if (t[0] !== e) {
      let {
        tab: f,
        getRulesOptions: h,
        handleToolSelect: g,
        ...y
      } = e;
      u = f;
      o = g;
      s = y;
      r = gXd;
      a = "column";
      l = u === "allow" ? 0 : undefined;
      let _;
      if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
        _ = {
          allow: "Claude Code won't ask before using allowed tools.",
          ask: "Claude Code will always ask for confirmation before using these tools.",
          deny: "Claude Code will always reject requests to use denied tools."
        };
        t[10] = _;
      } else {
        _ = t[10];
      }
      let b = _[u];
      if (t[11] !== b) {
        c = Tu.jsx(Text, {
          children: b
        });
        t[11] = b;
        t[12] = c;
      } else {
        c = t[12];
      }
      n = Pef;
      i = h(u, s.searchQuery);
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
      t[4] = s;
      t[5] = i;
      t[6] = a;
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      n = t[1];
      r = t[2];
      o = t[3];
      s = t[4];
      i = t[5];
      a = t[6];
      l = t[7];
      c = t[8];
      u = t[9];
    }
    let d;
    if (t[13] !== o || t[14] !== u) {
      d = f => o(f, u);
      t[13] = o;
      t[14] = u;
      t[15] = d;
    } else {
      d = t[15];
    }
    let p;
    if (t[16] !== n || t[17] !== s || t[18] !== i.options || t[19] !== d) {
      p = Tu.jsx(n, {
        options: i.options,
        onSelect: d,
        ...s
      });
      t[16] = n;
      t[17] = s;
      t[18] = i.options;
      t[19] = d;
      t[20] = p;
    } else {
      p = t[20];
    }
    let m;
    if (t[21] !== r || t[22] !== a || t[23] !== l || t[24] !== c || t[25] !== p) {
      m = Tu.jsxs(r, {
        flexDirection: a,
        flexShrink: l,
        children: [c, p]
      });
      t[21] = r;
      t[22] = a;
      t[23] = l;
      t[24] = c;
      t[25] = p;
      t[26] = m;
    } else {
      m = t[26];
    }
    return m;
  }
  function Ktc(e) {
    let t = lCt.c(119);
    let {
      onExit: n,
      initialTab: r,
      onRetryDenials: o
    } = e;
    let {
      getDenials: s,
      removeDenial: i
    } = iCt();
    let a;
    if (t[0] !== s) {
      a = s();
      t[0] = s;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a.length > 0;
    let c = r ?? (l ? "recent" : "allow");
    let u;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      u = [];
      t[2] = u;
    } else {
      u = t[2];
    }
    let [d, p] = z3.useState(u);
    let m = bt(Uef);
    let f = Lo();
    let h = useTerminalFocus();
    let [g] = useTheme();
    let y;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      y = {
        approved: new Set(),
        retry: new Set(),
        denials: []
      };
      t[3] = y;
    } else {
      y = t[3];
    }
    let _ = z3.useRef(y);
    let b;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      b = mt => {
        _.current = mt;
      };
      t[4] = b;
    } else {
      b = t[4];
    }
    let S = b;
    let [E, C] = z3.useState();
    let [x, A] = z3.useState();
    let [k, I] = z3.useState(null);
    let [O, M] = z3.useState(null);
    let [L, P] = z3.useState(false);
    let [F, H] = z3.useState(null);
    let [U, N] = z3.useState(false);
    let [W, j] = z3.useState(true);
    let z;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      z = mt => {
        j(mt);
      };
      t[5] = z;
    } else {
      z = t[5];
    }
    let V = z;
    let K;
    if (t[6] !== m) {
      K = new Map();
      getAllowRules(m).forEach(mt => {
        K.set(De(mt), mt);
      });
      t[6] = m;
      t[7] = K;
    } else {
      K = t[7];
    }
    let J = K;
    let Q;
    if (t[8] !== m) {
      Q = new Map();
      getDenyRules(m).forEach(mt => {
        Q.set(De(mt), mt);
      });
      t[8] = m;
      t[9] = Q;
    } else {
      Q = t[9];
    }
    let Z = Q;
    let ne;
    if (t[10] !== m) {
      ne = new Map();
      getAskRules(m).forEach(mt => {
        ne.set(De(mt), mt);
      });
      t[10] = m;
      t[11] = ne;
    } else {
      ne = t[11];
    }
    let oe = ne;
    let ee;
    if (t[12] !== J || t[13] !== oe || t[14] !== Z) {
      ee = (mt, Dt) => {
        let jt = Dt === undefined ? "" : Dt;
        let bn = (() => {
          switch (mt) {
            case "allow":
              return J;
            case "deny":
              return Z;
            case "ask":
              return oe;
            case "workspace":
            case "recent":
              return new Map();
          }
        })();
        let Ct = [];
        if (mt !== "workspace" && mt !== "recent" && !jt) {
          Ct.push({
            label: `Add a new rule${vGd.ellipsis}`,
            value: "add-new-rule"
          });
        }
        let hn = Array.from(bn.keys()).sort((zn, Pn) => {
          let Lr = bn.get(zn);
          let ao = bn.get(Pn);
          if (Lr && ao) {
            let Nn = jp(Lr.ruleValue).toLowerCase();
            let Tr = jp(ao.ruleValue).toLowerCase();
            return Nn.localeCompare(Tr);
          }
          return 0;
        });
        let vn = jt.toLowerCase();
        for (let zn of hn) {
          let Pn = bn.get(zn);
          if (Pn) {
            let Lr = jp(Pn.ruleValue);
            if (jt && !Lr.toLowerCase().includes(vn)) {
              continue;
            }
            Ct.push({
              label: Lr,
              value: zn
            });
          }
        }
        return {
          options: Ct,
          rulesByKey: bn
        };
      };
      t[12] = J;
      t[13] = oe;
      t[14] = Z;
      t[15] = ee;
    } else {
      ee = t[15];
    }
    let re = ee;
    let se = !E && !k && !O && !L && !F;
    let ae = se && U;
    let de;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      de = () => {
        N(false);
      };
      t[16] = de;
    } else {
      de = t[16];
    }
    let be;
    if (t[17] !== ae) {
      be = {
        isActive: ae,
        onExit: de
      };
      t[17] = ae;
      t[18] = be;
    } else {
      be = t[18];
    }
    let {
      query: fe,
      setQuery: me,
      cursorOffset: Te,
      handleKeyDown: ue,
      handlePaste: ce
    } = U0(be);
    let le;
    if (t[19] !== U || t[20] !== se || t[21] !== ue || t[22] !== me) {
      le = mt => {
        if (!se) {
          return;
        }
        if (U) {
          ue(mt);
          return;
        }
        if (mt.ctrl || mt.meta) {
          return;
        }
        if (mt.key === "/") {
          mt.preventDefault();
          N(true);
          me("");
        } else if (mt.key.length === 1 && mt.key !== "j" && mt.key !== "k" && mt.key !== "m" && mt.key !== "i" && mt.key !== "r" && mt.key !== " ") {
          mt.preventDefault();
          N(true);
          me(mt.key);
        }
      };
      t[19] = U;
      t[20] = se;
      t[21] = ue;
      t[22] = me;
      t[23] = le;
    } else {
      le = t[23];
    }
    let pe = le;
    let ve;
    if (t[24] !== re) {
      ve = (mt, Dt) => {
        let {
          rulesByKey: jt
        } = re(Dt);
        if (mt === "add-new-rule") {
          I(Dt);
          return;
        } else {
          C(jt.get(mt));
          return;
        }
      };
      t[24] = re;
      t[25] = ve;
    } else {
      ve = t[25];
    }
    let _e = ve;
    let xe;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      xe = () => {
        I(null);
      };
      t[26] = xe;
    } else {
      xe = t[26];
    }
    let ke = xe;
    let Ie;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      Ie = (mt, Dt) => {
        M({
          ruleValue: mt,
          ruleBehavior: Dt
        });
        I(null);
      };
      t[27] = Ie;
    } else {
      Ie = t[27];
    }
    let Ue = Ie;
    let Ge;
    if (t[28] !== g) {
      Ge = (mt, Dt) => {
        M(null);
        for (let jt of mt) {
          p(bn => [...bn, `Added ${jt.ruleBehavior} rule ${_$u.bold(jp(jt.ruleValue))}`]);
        }
        for (let jt of Dt) {
          let bn = jt.shadowType === "deny" ? "blocked" : "shadowed";
          p(Ct => [...Ct, color("warning", g)(`${vGd.warning} Warning: ${jp(jt.rule.ruleValue)} is ${bn}`), _$u.dim(`  ${jt.reason}`), _$u.dim(`  Fix: ${jt.fix}`)]);
        }
      };
      t[28] = g;
      t[29] = Ge;
    } else {
      Ge = t[29];
    }
    let Be = Ge;
    let We;
    if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
      We = () => {
        M(null);
      };
      t[30] = We;
    } else {
      We = t[30];
    }
    let Ze = We;
    let Tt;
    if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
      Tt = () => P(true);
      t[31] = Tt;
    } else {
      Tt = t[31];
    }
    let kt = Tt;
    let Ye;
    if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
      Ye = mt => H(mt);
      t[32] = Ye;
    } else {
      Ye = t[32];
    }
    let ht = Ye;
    let It;
    if (t[33] !== d || t[34] !== n || t[35] !== o || t[36] !== i) {
      It = () => {
        let mt = _.current;
        let Dt = Ct => Array.from(Ct).map(hn => mt.denials[hn]).filter(Fef);
        let jt = Dt(mt.retry);
        if (jt.length > 0) {
          let Ct = jt.map(Lef);
          o(Ct);
          n(undefined, {
            shouldQuery: true,
            metaMessages: [`Permission granted for: ${Ct.join(", ")}. You may now retry ${Ct.length === 1 ? "this command" : "these commands"} if you would like.`]
          });
          return;
        }
        let bn = Dt(mt.approved);
        if (bn.length > 0 || d.length > 0) {
          for (let vn of bn) {
            i(vn);
          }
          let Ct = bn.map(Nef);
          let hn = Ct.length > 0 ? [`Approved ${Ct.map(Mef).join(", ")}`] : [];
          n([...hn, ...d].join(`
`), Ct.length > 0 ? {
            metaMessages: [`Permission granted for: ${Ct.join(", ")}. You may now retry ${Ct.length === 1 ? "this command" : "these commands"} if you would like.`]
          } : undefined);
        } else {
          n("Permissions dialog dismissed", {
            display: "system"
          });
        }
      };
      t[33] = d;
      t[34] = n;
      t[35] = o;
      t[36] = i;
      t[37] = It;
    } else {
      It = t[37];
    }
    let Rt = It;
    let wt = se && !U;
    let vt;
    if (t[38] !== wt) {
      vt = {
        context: "Settings",
        isActive: wt
      };
      t[38] = wt;
      t[39] = vt;
    } else {
      vt = t[39];
    }
    uo("confirm:no", Rt, vt);
    let yt;
    if (t[40] !== re || t[41] !== E || t[42] !== f || t[43] !== m) {
      yt = () => {
        if (!E) {
          return;
        }
        let {
          options: mt
        } = re(E.ruleBehavior);
        let Dt = De(E);
        let jt = mt.filter(Def).map(Oef);
        let bn = jt.indexOf(Dt);
        let Ct;
        if (bn !== -1) {
          if (bn < jt.length - 1) {
            Ct = jt[bn + 1];
          } else if (bn > 0) {
            Ct = jt[bn - 1];
          }
        }
        A(Ct);
        deletePermissionRule({
          rule: E,
          initialContext: m,
          setToolPermissionContext(hn) {
            f(vn => ({
              ...vn,
              toolPermissionContext: hn
            }));
          }
        });
        p(hn => [...hn, `Deleted ${E.ruleBehavior} rule ${_$u.bold(jp(E.ruleValue))}`]);
        C(undefined);
      };
      t[40] = re;
      t[41] = E;
      t[42] = f;
      t[43] = m;
      t[44] = yt;
    } else {
      yt = t[44];
    }
    let gt = yt;
    if (E) {
      let mt;
      if (t[45] === Symbol.for("react.memo_cache_sentinel")) {
        mt = () => C(undefined);
        t[45] = mt;
      } else {
        mt = t[45];
      }
      let Dt;
      if (t[46] !== gt || t[47] !== E) {
        Dt = Tu.jsx(Ief, {
          rule: E,
          onDelete: gt,
          onCancel: mt
        });
        t[46] = gt;
        t[47] = E;
        t[48] = Dt;
      } else {
        Dt = t[48];
      }
      return Dt;
    }
    if (k && k !== "workspace" && k !== "recent") {
      let mt;
      if (t[49] !== k) {
        mt = Tu.jsx(Ltc, {
          onCancel: ke,
          onSubmit: Ue,
          ruleBehavior: k
        });
        t[49] = k;
        t[50] = mt;
      } else {
        mt = t[50];
      }
      return mt;
    }
    if (O) {
      let mt;
      if (t[51] !== O.ruleValue) {
        mt = [O.ruleValue];
        t[51] = O.ruleValue;
        t[52] = mt;
      } else {
        mt = t[52];
      }
      let Dt;
      if (t[53] !== f) {
        Dt = bn => {
          f(Ct => ({
            ...Ct,
            toolPermissionContext: bn
          }));
        };
        t[53] = f;
        t[54] = Dt;
      } else {
        Dt = t[54];
      }
      let jt;
      if (t[55] !== Be || t[56] !== mt || t[57] !== Dt || t[58] !== m || t[59] !== O.ruleBehavior) {
        jt = Tu.jsx(Dtc, {
          onAddRules: Be,
          onCancel: Ze,
          ruleValues: mt,
          ruleBehavior: O.ruleBehavior,
          initialContext: m,
          setToolPermissionContext: Dt
        });
        t[55] = Be;
        t[56] = mt;
        t[57] = Dt;
        t[58] = m;
        t[59] = O.ruleBehavior;
        t[60] = jt;
      } else {
        jt = t[60];
      }
      return jt;
    }
    if (L) {
      let mt;
      if (t[61] !== f || t[62] !== m) {
        mt = (bn, Ct) => {
          let vn = {
            type: "addDirectories",
            directories: [bn],
            destination: Ct ? "localSettings" : "session"
          };
          let zn = $y(m, vn);
          if (f(Pn => ({
            ...Pn,
            toolPermissionContext: zn
          })), Ct) {
            Zde(vn);
          }
          p(Pn => [...Pn, `Added directory ${_$u.bold(bn)} to workspace${Ct ? " and saved to local settings" : " for this session"}`]);
          P(false);
        };
        t[61] = f;
        t[62] = m;
        t[63] = mt;
      } else {
        mt = t[63];
      }
      let Dt;
      if (t[64] === Symbol.for("react.memo_cache_sentinel")) {
        Dt = () => P(false);
        t[64] = Dt;
      } else {
        Dt = t[64];
      }
      let jt;
      if (t[65] !== mt || t[66] !== m) {
        jt = Tu.jsx(Ujt, {
          onAddDirectory: mt,
          onCancel: Dt,
          permissionContext: m
        });
        t[65] = mt;
        t[66] = m;
        t[67] = jt;
      } else {
        jt = t[67];
      }
      return jt;
    }
    if (F) {
      let mt;
      if (t[68] !== F) {
        mt = () => {
          p(Ct => [...Ct, `Removed directory ${_$u.bold(F)} from workspace`]);
          H(null);
        };
        t[68] = F;
        t[69] = mt;
      } else {
        mt = t[69];
      }
      let Dt;
      if (t[70] === Symbol.for("react.memo_cache_sentinel")) {
        Dt = () => H(null);
        t[70] = Dt;
      } else {
        Dt = t[70];
      }
      let jt;
      if (t[71] !== f) {
        jt = Ct => {
          f(hn => ({
            ...hn,
            toolPermissionContext: Ct
          }));
        };
        t[71] = f;
        t[72] = jt;
      } else {
        jt = t[72];
      }
      let bn;
      if (t[73] !== F || t[74] !== mt || t[75] !== jt || t[76] !== m) {
        bn = Tu.jsx(jtc, {
          directoryPath: F,
          onRemove: mt,
          onCancel: Dt,
          permissionContext: m,
          setPermissionContext: jt
        });
        t[73] = F;
        t[74] = mt;
        t[75] = jt;
        t[76] = m;
        t[77] = bn;
      } else {
        bn = t[77];
      }
      return bn;
    }
    let Ft;
    if (t[78] !== re || t[79] !== Rt || t[80] !== _e || t[81] !== U || t[82] !== h || t[83] !== x || t[84] !== Te || t[85] !== fe) {
      Ft = {
        searchQuery: fe,
        isSearchMode: U,
        isFocused: h,
        onCancel: Rt,
        lastFocusedRuleKey: x,
        cursorOffset: Te,
        getRulesOptions: re,
        handleToolSelect: _e,
        onHeaderFocusChange: V
      };
      t[78] = re;
      t[79] = Rt;
      t[80] = _e;
      t[81] = U;
      t[82] = h;
      t[83] = x;
      t[84] = Te;
      t[85] = fe;
      t[86] = Ft;
    } else {
      Ft = t[86];
    }
    let on = Ft;
    let rn = !!E || !!k || !!O || L || !!F;
    let Sn = !l;
    let jn = !U;
    let Xr;
    if (t[87] === Symbol.for("react.memo_cache_sentinel")) {
      Xr = Tu.jsx(kh, {
        id: "recent",
        title: "Recently denied",
        children: Tu.jsx(Btc, {
          onHeaderFocusChange: V,
          onStateChange: S
        })
      });
      t[87] = Xr;
    } else {
      Xr = t[87];
    }
    let co;
    if (t[88] !== on) {
      co = Tu.jsx(kh, {
        id: "allow",
        title: "Allow",
        children: Tu.jsx(q9o, {
          tab: "allow",
          ...on
        })
      });
      t[88] = on;
      t[89] = co;
    } else {
      co = t[89];
    }
    let Yt;
    if (t[90] !== on) {
      Yt = Tu.jsx(kh, {
        id: "ask",
        title: "Ask",
        children: Tu.jsx(q9o, {
          tab: "ask",
          ...on
        })
      });
      t[90] = on;
      t[91] = Yt;
    } else {
      Yt = t[91];
    }
    let Ee;
    if (t[92] !== on) {
      Ee = Tu.jsx(kh, {
        id: "deny",
        title: "Deny",
        children: Tu.jsx(q9o, {
          tab: "deny",
          ...on
        })
      });
      t[92] = on;
      t[93] = Ee;
    } else {
      Ee = t[93];
    }
    let Re;
    if (t[94] === Symbol.for("react.memo_cache_sentinel")) {
      Re = Tu.jsx(Text, {
        wrap: "wrap-trim",
        children: "Claude Code can read files in the workspace, and make edits when auto-accept edits is on."
      });
      t[94] = Re;
    } else {
      Re = t[94];
    }
    let Ce;
    if (t[95] !== n || t[96] !== m) {
      Ce = Tu.jsx(kh, {
        id: "workspace",
        title: "Workspace",
        children: Tu.jsxs(gXd, {
          flexDirection: "column",
          children: [Re, Tu.jsx(Vtc, {
            onExit: n,
            toolPermissionContext: m,
            onRequestAddDirectory: kt,
            onRequestRemoveDirectory: ht,
            onHeaderFocusChange: V
          })]
        })
      });
      t[95] = n;
      t[96] = m;
      t[97] = Ce;
    } else {
      Ce = t[97];
    }
    let Fe;
    if (t[98] !== c || t[99] !== rn || t[100] !== Sn || t[101] !== jn || t[102] !== co || t[103] !== Yt || t[104] !== Ee || t[105] !== Ce) {
      Fe = Tu.jsxs(VM, {
        title: "Permissions",
        color: "permission",
        defaultTab: c,
        hidden: rn,
        initialHeaderFocused: Sn,
        navFromContent: jn,
        children: [Xr, co, Yt, Ee, Ce]
      });
      t[98] = c;
      t[99] = rn;
      t[100] = Sn;
      t[101] = jn;
      t[102] = co;
      t[103] = Yt;
      t[104] = Ee;
      t[105] = Ce;
      t[106] = Fe;
    } else {
      Fe = t[106];
    }
    let Xe;
    if (t[107] !== c || t[108] !== l || t[109] !== W || t[110] !== U) {
      Xe = Tu.jsx(gXd, {
        marginTop: 1,
        children: Tu.jsx(Lw, {
          children: W ? Tu.jsx(Tu.Fragment, {
            children: "\u2190/\u2192 to switch \xB7 \u2193 to select \xB7 Esc to cancel"
          }) : U ? Tu.jsx(Tu.Fragment, {
            children: "Type to filter \xB7 Enter/\u2193 to select \xB7 \u2191 to tabs \xB7 Esc to clear"
          }) : l && c === "recent" ? Tu.jsx(Tu.Fragment, {
            children: "Enter to approve \xB7 r to retry \xB7 \u2191/\u2193 to navigate \xB7 Esc to cancel"
          }) : Tu.jsx(Tu.Fragment, {
            children: "\u2191/\u2193 to navigate \xB7 Enter to select \xB7 \u2190/\u2192 to switch \xB7 Esc to cancel"
          })
        })
      });
      t[107] = c;
      t[108] = l;
      t[109] = W;
      t[110] = U;
      t[111] = Xe;
    } else {
      Xe = t[111];
    }
    let He;
    if (t[112] !== Fe || t[113] !== Xe) {
      He = Tu.jsxs(Td, {
        color: "permission",
        children: [Fe, Xe]
      });
      t[112] = Fe;
      t[113] = Xe;
      t[114] = He;
    } else {
      He = t[114];
    }
    let Gt;
    if (t[115] !== pe || t[116] !== ce || t[117] !== He) {
      Gt = Tu.jsx(gXd, {
        flexDirection: "column",
        onKeyDown: pe,
        onPaste: ce,
        children: He
      });
      t[115] = pe;
      t[116] = ce;
      t[117] = He;
      t[118] = Gt;
    } else {
      Gt = t[118];
    }
    return Gt;
  }
  function Oef(e) {
    return e.value;
  }
  function Def(e) {
    return e.value !== "add-new-rule";
  }
  function Mef(e) {
    return _$u.bold(e);
  }
  function Nef(e) {
    return e.display;
  }
  function Lef(e) {
    return e.display;
  }
  function Fef(e) {
    return e !== undefined;
  }
  function Uef(e) {
    return e.toolPermissionContext;
  }
  var lCt;
  var z3;
  var Tu;
  var Ytc = __lazy(() => {
    ho();
    Zk();
    $c();
    Aen();
    sie();
    et();
    Bs();
    EC();
    oy();
    b_();
    fz();
    bs();
    oE();
    Az();
    yH();
    Cfe();
    Mtc();
    joo();
    H9o();
    Ftc();
    $tc();
    qtc();
    ztc();
    lCt = __toESM(pt(), 1);
    z3 = __toESM(ot(), 1);
    Tu = __toESM(ie(), 1);
  });
  var Jtc = {};
  __export(Jtc, {
    call: () => call_export57
  });
  var Xtc;
  var call_export57 = async (e, t) => Xtc.jsx(Ktc, {
    onExit: e,
    onRetryDenials: n => {
      t.applyMessageOp({
        type: "append",
        messages: [Ztc(n)]
      });
    }
  });
  var Qtc = __lazy(() => {
    Ytc();
    ro();
    Xtc = __toESM(ie(), 1);
  });
  var $ef;
  function nnc(e) {
    Object.assign(Ien, e);
  }
  var Ien;
  var G9o = __lazy(() => {
    Ien = {
      isPlanArtifactEnabled: () => false,
      publishPlanArtifact: e => Promise.resolve({
        url: null,
        slug: null,
        version: null,
        err: "plan-artifact slot not registered"
      })
    };
  });
  function Hef(e) {
    cCt = cCt.filter(t => t !== e);
    e.reject(new tur());
  }
  function nur(e, t) {
    let n = cCt.filter(r => r.mode === e);
    cCt = cCt.filter(r => r.mode !== e);
    for (let r of n) {
      if (clearTimeout(r.timer), t) {
        r.reject(t);
      } else {
        r.resolve();
      }
    }
  }
  function rnc(e, t) {
    let {
      promise: n,
      resolve: r,
      reject: o
    } = Promise.withResolvers();
    let s = {
      mode: e,
      resolve: r,
      reject: o,
      timer: undefined
    };
    s.timer = setTimeout(Hef, t, s);
    cCt.push(s);
    return n;
  }
  var cCt;
  var tur;
  var V9o = __lazy(() => {
    cCt = [];
    tur = class tur extends Error {
      constructor() {
        super("set_permission_mode push not acknowledged in time");
        this.name = "ModePushTimeoutError";
      }
    };
  });
  var inc = {};
  __export(inc, {
    call: () => call_export58
  });
  function onc(e) {
    let t = snc.c(14);
    let {
      planContent: n,
      planPath: r,
      editorName: o,
      canShare: s
    } = e;
    let i;
    if (t[0] !== r) {
      i = K3.jsx(Dv, {
        subtitle: r,
        children: "Current Plan"
      });
      t[0] = r;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== n) {
      a = K3.jsx(gXd, {
        marginTop: 1,
        children: K3.jsx(Text, {
          children: n
        })
      });
      t[2] = n;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== o) {
      l = o && K3.jsxs(gXd, {
        marginTop: 1,
        children: [K3.jsx(Text, {
          dimColor: true,
          children: '"/plan open"'
        }), K3.jsx(Text, {
          dimColor: true,
          children: " to edit this plan in "
        }), K3.jsx(Text, {
          bold: true,
          dimColor: true,
          children: o
        })]
      });
      t[4] = o;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== s || t[7] !== o) {
      c = s && K3.jsxs(gXd, {
        marginTop: o ? 0 : 1,
        children: [K3.jsx(Text, {
          dimColor: true,
          children: '"/plan share"'
        }), K3.jsx(Text, {
          dimColor: true,
          children: " to publish this plan as an artifact"
        })]
      });
      t[6] = s;
      t[7] = o;
      t[8] = c;
    } else {
      c = t[8];
    }
    let u;
    if (t[9] !== i || t[10] !== a || t[11] !== l || t[12] !== c) {
      u = K3.jsxs(gXd, {
        flexDirection: "column",
        children: [i, a, l, c]
      });
      t[9] = i;
      t[10] = a;
      t[11] = l;
      t[12] = c;
      t[13] = u;
    } else {
      u = t[13];
    }
    return u;
  }
  async function call_export58(e, t, n) {
    let {
      getAppState: r,
      setAppState: o
    } = t;
    let i = r().toolPermissionContext.mode;
    let a = i !== "plan";
    if (a) {
      handlePlanModeTransition(i, "plan");
      o(h => ({
        ...h,
        toolPermissionContext: $y(prepareContextForPlanMode(h.toolPermissionContext), {
          type: "setMode",
          mode: "plan",
          destination: "session"
        })
      }));
    }
    if (va()) {
      if (!c_()) {
        e(a ? "Enabled plan mode" : "Already in plan mode.");
        return null;
      }
      let h = Ul();
      let g = n.trim();
      if (a && g && g !== "open" && g !== "share") {
        try {
          await rnc("plan", 15000);
        } catch (b) {
          let S = b instanceof tur;
          Ae("plan_remote_query", S ? "mode_push_timeout" : "mode_push_rejected");
          e(S ? `Enabled plan mode locally, but the cloud session didn\u2019t confirm the switch in time \u2014 your description was not sent: ${g}. The session may be having connection trouble; once it\u2019s responding again, send the description as a normal message.` : `The cloud session couldn\u2019t switch to plan mode, so your description was not sent: ${g}`);
          return null;
        }
        let y = In({
          content: g,
          origin: {
            kind: "human"
          }
        });
        if (t.setMessages(b => [...b, y]), !(await h.sendMessage(g, {
          uuid: y.uuid
        }))) {
          Ae("plan_remote_query", "send_failed");
          e("Enabled plan mode");
          return null;
        }
        Pe("plan_remote_query");
        e("Enabled plan mode");
        return null;
      }
      if (g.split(/\s+/)[0] === "open") {
        Pe("plan_remote_open");
        e("The plan file lives in the cloud workspace, so /plan open can\u2019t open it in a local editor. Use /plan to view it; to change it, tell Claude what to revise, or edit the plan in the approval dialog when Claude finishes planning.");
        return null;
      }
      if (g.split(/\s+/)[0] === "share") {
        Pe("plan_remote_share");
        e("The plan lives in the cloud workspace, so /plan share can\u2019t publish it from this machine yet. Use /plan to view it and share its contents from there.");
        return null;
      }
      try {
        let y = await withTimeout(h.sendControlRequest({
          subtype: "get_plan"
        }), 1e4, "get_plan timed out");
        if (!y.exists || !y.content || y.path === undefined) {
          Pe("plan_remote_view");
          e(a ? "Enabled plan mode" : "Already in plan mode. No plan written yet.");
          return null;
        }
        Pe("plan_remote_view");
        let _ = await L0o(K3.jsx(onc, {
          planContent: Li(y.content).slice(0, 1e6),
          planPath: Li(y.path).replace(/[\r\n]/g, " "),
          editorName: undefined,
          canShare: false
        }));
        e(_);
        return null;
      } catch (y) {
        let _ = y instanceof Error ? y.message : String(y);
        let b = _.includes("Unsupported control request subtype");
        Ae("plan_remote_view", b ? "unsupported_subtype" : _.includes("get_plan timed out") ? "timeout" : "request_failed");
        e(a ? "Enabled plan mode" : b ? "Viewing plans in cloud sessions needs a newer session runtime." : "Couldn\u2019t fetch the plan from the cloud session \u2014 try again.");
        return null;
      }
    }
    if (a) {
      let h = n.trim();
      if (h && h !== "open" && h !== "share") {
        e("Enabled plan mode", {
          shouldQuery: true
        });
        return null;
      }
      if (!peekPlanSlug()) {
        e("Enabled plan mode");
        return null;
      }
    }
    let l = getPlan();
    let c = getPlanFilePath();
    if (!l) {
      e(a ? "Enabled plan mode" : "Already in plan mode. No plan written yet.");
      return null;
    }
    let u = n.trim().split(/\s+/);
    if (u[0] === "open") {
      let h = await jwe(c);
      if (h.error) {
        e(h.error);
      } else {
        e(`Opened plan in editor: ${c}`);
      }
      return null;
    }
    if (u[0] === "share") {
      if (!Ien.isPlanArtifactEnabled()) {
        e("Publishing plans is not available in this session.");
        return null;
      }
      let h = "Couldn't publish plan \u2014 try /plan share again, or run with --debug for details.";
      try {
        let g = await Ien.publishPlanArtifact(l);
        if (g.url) {
          e(`Published plan: ${g.url}`);
        } else {
          logForDebugging(`plan share: publish returned ${g.err}`);
          e(h);
        }
      } catch (g) {
        logForDebugging(`plan share: publish threw ${g instanceof Error ? g.message : String(g)}`);
        e(h);
      }
      return null;
    }
    let d = v5();
    let p = d ? S0(d) : undefined;
    let m = K3.jsx(onc, {
      planContent: l,
      planPath: c,
      editorName: p,
      canShare: Ien.isPlanArtifactEnabled()
    });
    let f = await L0o(m);
    e(f);
    return null;
  }
  var snc;
  var K3;
  var anc = __lazy(() => {
    at();
    uK();
    G9o();
    et();
    V9o();
    ru();
    ln();
    je();
    SUe();
    bT();
    ro();
    Zk();
    S_();
    xx();
    Lfe();
    I1e();
    snc = __toESM(pt(), 1);
    K3 = __toESM(ie(), 1);
  });
  var Vef;
  function uCt() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_immediate_model_command", false);
  }
  var rur = __lazy(() => {
    $n();
  });
  function unc(e) {
    let t = cnc.c(2);
    let {
      cooldown: n
    } = e;
    if (n) {
      let o;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        o = K9o.jsx(Text, {
          color: "promptBorder",
          dimColor: true,
          children: "\u21AF"
        });
        t[0] = o;
      } else {
        o = t[0];
      }
      return o;
    }
    let r;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = K9o.jsx(Text, {
        color: "fastMode",
        children: "\u21AF"
      });
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function XUe(e = true, t = false) {
    if (!e) {
      return "\u21AF";
    }
    let n = B2(uc("theme", "dark").value);
    if (t) {
      return _$u.dim(color("promptBorder", n)("\u21AF"));
    }
    return color("fastMode", n)("\u21AF");
  }
  var cnc;
  var K9o;
  var our = __lazy(() => {
    wl();
    et();
    zg();
    NJ();
    APe();
    cnc = __toESM(pt(), 1);
    K9o = __toESM(ie(), 1);
  });
  function QUe(e, t) {
    t(n => {
      let r = n;
      if ("cacheBreakerPhrase" in e) {
        let o = e.cacheBreakerPhrase;
        let s = o == null ? undefined : String(o);
        if (r.cacheBreakerPhrase !== s) {
          r = {
            ...r,
            cacheBreakerPhrase: s
          };
        }
      }
      if ("autoCompactWindow" in e) {
        let o = e.autoCompactWindow;
        let s = o == null ? undefined : Number(o);
        if (r.autoCompactWindow !== s) {
          r = {
            ...r,
            autoCompactWindow: s
          };
        }
      }
      if ("briefTranscript" in e) {
        let o = Boolean(e.briefTranscript);
        if (r.briefTranscript !== o) {
          r = {
            ...r,
            briefTranscript: o
          };
        }
      }
      if ("isBriefOnly" in e) {
        let o = Boolean(e.isBriefOnly);
        if (r.isBriefOnly !== o) {
          r = {
            ...r,
            isBriefOnly: o
          };
        }
      }
      if ("fastMode" in e) {
        let o = Boolean(e.fastMode);
        if (r.fastMode !== o) {
          r = {
            ...r,
            fastMode: o
          };
        }
      }
      if ("model" in e) {
        let o = e.model;
        let s = o == null ? null : String(o);
        if (r.mainLoopModelForSession !== s) {
          r = {
            ...r,
            mainLoopModelForSession: s
          };
        }
        if (r.mainLoopModel !== s) {
          r = {
            ...r,
            mainLoopModel: s
          };
        }
      }
      return r;
    });
  }
  function Y9o() {
    let e = kdi();
    if (!e) {
      return null;
    }
    return {
      key: "opus47-fast-mode-deprecation",
      text: `Opus 4.7 fast mode is deprecated and will be removed on ${e}`,
      priority: "immediate",
      color: "warning"
    };
  }
  function sur(e, t) {
    if (u0e(), c_()) {
      Ul()?.sendControlRequest({
        subtype: "apply_flag_settings",
        settings: {
          fastMode: e ? true : null,
          ...(e && {
            model: Eqe()
          })
        }
      }).catch(Oe);
    } else {
      updateSettingsForSource("userSettings", {
        fastMode: e ? true : undefined
      });
    }
    if (QUe({
      fastMode: e
    }, t), e) {
      t(n => {
        if (yh(n.mainLoopModel)) {
          return n;
        }
        let r = Eqe();
        let o = parseUserSpecifiedModel(r) === parseUserSpecifiedModel(getDefaultMainLoopModelSetting());
        return {
          ...n,
          mainLoopModel: o ? null : r,
          mainLoopModelForSession: null
        };
      });
    }
  }
  async function iur(e, t, n, r, o) {
    let s = Vle();
    if (s) {
      return `Fast mode unavailable: ${s}`;
    }
    let {
      mainLoopModel: i
    } = t();
    if (sur(e, n), logEvent("tengu_fast_mode_toggled", {
      enabled: e,
      source: r,
      remote: c_()
    }), e) {
      let a = XUe(true);
      let l = !yh(i) ? ` \xB7 model set to ${vW()}` : "";
      let c = getMainLoopModel();
      let u = yh(c) ? getCanonicalName(c) : "claude-opus-4-8";
      let d = AF(tst(true, u));
      let p = Y9o();
      if (p) {
        o?.({
          type: "notification",
          notification: p
        });
      }
      return `${a} Fast mode ON${l} \xB7 ${d}`;
    } else {
      return "Fast mode OFF";
    }
  }
  var J9o = __lazy(() => {
    our();
    ru();
    Ot();
    GT();
    Rn();
    Eo();
  });
  var mnc = {};
  __export(mnc, {
    call: () => call_export59,
    FastModePicker: () => FastModePicker
  });
  function FastModePicker(e) {
    let t = dnc.c(32);
    let {
      onDone: n,
      unavailableReason: r
    } = e;
    let o = bt(Jef);
    let {
      addNotification: s
    } = Fi();
    let i = bt(Yef);
    let a = Lo();
    let [l, c] = pnc.useState(i ?? false);
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = sWr();
      t[0] = u;
    } else {
      u = t[0];
    }
    let d = u;
    let p = d.status === "cooldown";
    let m = r !== null;
    let f;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      let F = getMainLoopModel();
      let H = yh(F) ? getCanonicalName(F) : "claude-opus-4-8";
      f = AF(tst(true, H));
      t[1] = f;
    } else {
      f = t[1];
    }
    let h = f;
    let g;
    if (t[2] !== s || t[3] !== l || t[4] !== m || t[5] !== o || t[6] !== n || t[7] !== a) {
      g = function () {
        if (m) {
          return;
        }
        if (sur(l, a), logEvent("tengu_fast_mode_toggled", {
          enabled: l,
          source: "picker",
          remote: c_()
        }), l) {
          let H = XUe(l);
          let U = !yh(o) ? ` \xB7 model set to ${vW()}` : "";
          let N = Y9o();
          if (N) {
            s(N);
          }
          n(`${H} Fast mode ON${U} \xB7 ${h}`);
        } else {
          a(Kef);
          n("Fast mode OFF");
        }
      };
      t[2] = s;
      t[3] = l;
      t[4] = m;
      t[5] = o;
      t[6] = n;
      t[7] = a;
      t[8] = g;
    } else {
      g = t[8];
    }
    let y = g;
    let _;
    if (t[9] !== i || t[10] !== m || t[11] !== n || t[12] !== a) {
      _ = function () {
        if (m) {
          if (i) {
            sur(false, a);
          }
          n("Fast mode OFF", {
            display: "system"
          });
          return;
        }
        let H = i ? `${XUe()} Kept Fast mode ON` : "Kept Fast mode OFF";
        n(H, {
          display: "system"
        });
      };
      t[9] = i;
      t[10] = m;
      t[11] = n;
      t[12] = a;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b = _;
    let S;
    if (t[14] !== m) {
      S = function () {
        if (m) {
          return;
        }
        c(zef);
      };
      t[14] = m;
      t[15] = S;
    } else {
      S = t[15];
    }
    let E = S;
    let C;
    if (t[16] !== y || t[17] !== E) {
      C = {
        "confirm:yes": y,
        "confirm:nextField": E,
        "confirm:next": E,
        "confirm:previous": E,
        "confirm:cycleMode": E,
        "confirm:toggle": E
      };
      t[16] = y;
      t[17] = E;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      x = {
        context: "Confirmation"
      };
      t[19] = x;
    } else {
      x = t[19];
    }
    jo(C, x);
    let A;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      A = jx.jsxs(Text, {
        children: [jx.jsx(unc, {
          cooldown: p
        }), " Fast mode (research preview)"]
      });
      t[20] = A;
    } else {
      A = t[20];
    }
    let k = A;
    let I;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      I = vW();
      t[21] = I;
    } else {
      I = t[21];
    }
    let O;
    if (t[22] !== m) {
      O = m ? jx.jsx(xt, {
        chord: "escape",
        action: "cancel"
      }) : jx.jsxs(Hn, {
        children: [jx.jsx(xt, {
          chord: "tab",
          action: "toggle"
        }), jx.jsx(xt, {
          chord: "enter",
          action: "confirm"
        }), jx.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      });
      t[22] = m;
      t[23] = O;
    } else {
      O = t[23];
    }
    let M;
    if (t[24] !== l || t[25] !== r) {
      M = r ? jx.jsx(gXd, {
        marginLeft: 2,
        children: jx.jsx(Hc, {
          error: r
        })
      }) : jx.jsxs(jx.Fragment, {
        children: [jx.jsx(gXd, {
          flexDirection: "column",
          gap: 0,
          marginLeft: 2,
          children: jx.jsxs(gXd, {
            flexDirection: "row",
            gap: 2,
            children: [jx.jsx(Text, {
              bold: true,
              children: "Fast mode"
            }), jx.jsx(Text, {
              color: l ? "fastMode" : undefined,
              bold: l,
              children: l ? "ON " : "OFF"
            }), jx.jsx(Text, {
              dimColor: true,
              children: h
            })]
          })
        }), p && d.status === "cooldown" && jx.jsx(gXd, {
          marginLeft: 2,
          children: jx.jsxs(Text, {
            color: "warning",
            children: [d.reason === "overloaded" ? "Fast mode overloaded and is temporarily unavailable" : "You've hit your fast limit", " \xB7 resets in ", formatDuration(d.resetAt - Date.now(), {
              hideTrailingZeros: true
            })]
          })
        })]
      });
      t[24] = l;
      t[25] = r;
      t[26] = M;
    } else {
      M = t[26];
    }
    let L;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      L = jx.jsx(eD, {
        url: "https://code.claude.com/docs/en/fast-mode"
      });
      t[27] = L;
    } else {
      L = t[27];
    }
    let P;
    if (t[28] !== b || t[29] !== O || t[30] !== M) {
      P = jx.jsxs(or, {
        title: k,
        subtitle: `High-speed mode for ${I}. Draws from usage credits at a higher rate. Separate rate limits apply.`,
        onCancel: b,
        color: "fastMode",
        inputGuide: O,
        children: [M, L]
      });
      t[28] = b;
      t[29] = O;
      t[30] = M;
      t[31] = P;
    } else {
      P = t[31];
    }
    return P;
  }
  function zef(e) {
    return !e;
  }
  function Kef(e) {
    return {
      ...e,
      fastMode: false
    };
  }
  function Yef(e) {
    return e.fastMode;
  }
  function Jef(e) {
    return e.mainLoopModel;
  }
  async function call_export59(e, t, n) {
    if (!lc()) {
      e(Vle() ?? "Fast mode is not available");
      return null;
    }
    await est();
    let r = n?.trim().toLowerCase();
    if (r === "on" || r === "off") {
      let s = await iur(r === "on", t.getAppState, t.setAppState, "shortcut", t.onQueryEvent);
      e(s);
      return null;
    }
    let o = Vle();
    logEvent("tengu_fast_mode_picker_shown", {
      unavailable_reason: o ?? ""
    });
    return jx.jsx(FastModePicker, {
      onDone: e,
      unavailableReason: o
    });
  }
  var dnc;
  var pnc;
  var jx;
  var X9o = __lazy(() => {
    Ai();
    Ii();
    die();
    bv();
    bs();
    our();
    Nd();
    et();
    Bs();
    ru();
    Ot();
    ho();
    GT();
    cs();
    Eo();
    J9o();
    dnc = __toESM(pt(), 1);
    pnc = __toESM(ot(), 1);
    jx = __toESM(ie(), 1);
  });
  var fnc = {};
  __export(fnc, {
    call: () => call_export60
  });
  async function call_export60(e, t) {
    if (!lc()) {
      return {
        type: "text",
        value: Vle() ?? "Fast mode is not available"
      };
    }
    await est();
    let n = e.trim().toLowerCase();
    let r;
    if (n === "on") {
      r = true;
    } else if (n === "off") {
      r = false;
    } else if (n === "") {
      r = !t.options.fastMode;
    } else {
      return {
        type: "text",
        value: `Unknown argument "${n}". Use: /fast [on|off]`
      };
    }
    return {
      type: "text",
      value: await iur(r, t.getAppState, t.setAppState, "bridge", t.onQueryEvent)
    };
  }
  var hnc = __lazy(() => {
    GT();
    J9o();
  });
  var Zef;
  var gnc;
  function bnc({
    onDone: e
  }) {
    let [t, n] = ehe.useState(true);
    let [r, o] = ehe.useState([]);
    let [s, i] = ehe.useState(false);
    let [a, l] = ehe.useState(null);
    let [c, u] = ehe.useState(undefined);
    let d = Eg(() => e("Guest passes dialog dismissed", {
      display: "system"
    }));
    let p = ehe.useCallback(() => {
      e("Guest passes dialog dismissed", {
        display: "system"
      });
    }, [e]);
    uo("confirm:no", p, {
      context: "Confirmation"
    });
    function m(g) {
      if (g.ctrl || g.meta) {
        return;
      }
      if (g.key === "return" && a) {
        g.preventDefault();
        Uk(a).then(y => {
          if (y) {
            process.stdout.write(y);
          }
          logEvent("tengu_guest_passes_link_copied", {});
          e("Referral link copied to clipboard!");
        });
      }
    }
    if (ehe.useEffect(() => {
      async function g() {
        try {
          let y = await lGo();
          if (!y || !y.eligible) {
            i(false);
            n(false);
            return;
          }
          if (i(true), y.referral_code_details?.referral_link) {
            l(y.referral_code_details.referral_link);
          }
          u(y.referrer_reward);
          let _ = y.referral_code_details?.campaign ?? "claude_code_guest_pass";
          let b;
          try {
            b = await TJl(_);
          } catch (x) {
            logForDebugging(`Failed to fetch referral redemptions: ${x}`, {
              level: "error"
            });
            i(false);
            n(false);
            return;
          }
          let S = b.redemptions || [];
          let E = b.limit || 3;
          let C = [];
          for (let x = 0; x < E; x++) {
            let A = S[x];
            C.push({
              passNumber: x + 1,
              isAvailable: !A
            });
          }
          o(C);
          n(false);
        } catch (y) {
          Oe(y);
          i(false);
          n(false);
        }
      }
      g();
    }, []), t) {
      return Om.jsx(Td, {
        children: Om.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: m,
          children: [Om.jsx(Text, {
            dimColor: true,
            children: "Loading guest pass information\u2026"
          }), Om.jsx(Text, {
            dimColor: true,
            italic: true,
            children: d.pending ? Om.jsxs(Om.Fragment, {
              children: ["Press ", d.keyName, " again to exit"]
            }) : Om.jsx(xt, {
              chord: "escape",
              action: "cancel"
            })
          })]
        })
      });
    }
    if (!s) {
      return Om.jsx(Td, {
        children: Om.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: m,
          children: [Om.jsx(Text, {
            children: "Guest passes are not currently available."
          }), Om.jsx(Text, {
            dimColor: true,
            italic: true,
            children: d.pending ? Om.jsxs(Om.Fragment, {
              children: ["Press ", d.keyName, " again to exit"]
            }) : Om.jsx(xt, {
              chord: "escape",
              action: "cancel"
            })
          })]
        })
      });
    }
    let f = Bn(r, g => g.isAvailable);
    let h = [...r].sort((g, y) => +y.isAvailable - +g.isAvailable);
    return Om.jsx(Td, {
      children: Om.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: m,
        children: [Om.jsxs(Text, {
          color: "permission",
          children: ["Guest passes \xB7 ", f, " left"]
        }), Om.jsx(gXd, {
          flexDirection: "row",
          marginLeft: 2,
          children: h.slice(0, 3).map(g => Om.jsx(etf, {
            pass: g
          }, g.passNumber))
        }), a && Om.jsx(gXd, {
          marginLeft: 2,
          children: Om.jsx(Text, {
            children: a
          })
        }), Om.jsx(gXd, {
          flexDirection: "column",
          marginLeft: 2,
          children: Om.jsxs(Text, {
            dimColor: true,
            children: [c ? `Share a free week of Claude Code with friends. If they love it and subscribe, you'll get ${$wt(c)} in usage credits to keep building. ` : "Share a free week of Claude Code with friends. ", Om.jsx(Link, {
              url: c ? "https://support.claude.com/en/articles/13456702-claude-code-guest-passes" : "https://support.claude.com/en/articles/12875061-claude-code-guest-passes",
              children: "Terms apply."
            })]
          })
        }), Om.jsx(gXd, {
          children: Om.jsx(Text, {
            dimColor: true,
            italic: true,
            children: d.pending ? Om.jsxs(Om.Fragment, {
              children: ["Press ", d.keyName, " again to exit"]
            }) : Om.jsxs(Hn, {
              children: [Om.jsx(xt, {
                chord: "enter",
                action: "copy link"
              }), Om.jsx(xt, {
                chord: "escape",
                action: "cancel"
              })]
            })
          })
        })]
      })
    });
  }
  function etf(e) {
    let t = _nc.c(3);
    let {
      pass: n
    } = e;
    if (!n.isAvailable) {
      let i;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        i = Om.jsxs(gXd, {
          flexDirection: "column",
          marginRight: 1,
          children: [Om.jsx(Text, {
            dimColor: true,
            children: "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2571"
          }), Om.jsx(Text, {
            dimColor: true,
            children: ` ) CC ${"\u273B"} \u250A\u2571`
          }), Om.jsx(Text, {
            dimColor: true,
            children: "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2571"
          })]
        });
        t[0] = i;
      } else {
        i = t[0];
      }
      return i;
    }
    let o;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      o = Om.jsx(Text, {
        children: "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510"
      });
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = Om.jsxs(gXd, {
        flexDirection: "column",
        marginRight: 1,
        children: [o, Om.jsxs(Text, {
          children: [" ) CC ", Om.jsx(Text, {
            color: "claude",
            children: "\u273B"
          }), " \u250A ( "]
        }), Om.jsx(Text, {
          children: "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518"
        })]
      });
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  var _nc;
  var ehe;
  var Om;
  var Snc = __lazy(() => {
    wl();
    mO();
    Tg();
    et();
    Bs();
    Ot();
    HYe();
    je();
    Rn();
    Ai();
    bs();
    oE();
    _nc = __toESM(pt(), 1);
    ehe = __toESM(ot(), 1);
    Om = __toESM(ie(), 1);
  });
  var Tnc = {};
  __export(Tnc, {
    call: () => call_export61
  });
  async function call_export61(e) {
    let n = !getGlobalConfig().hasVisitedPasses;
    if (n) {
      let r = Zlr();
      saveGlobalConfig(o => ({
        ...o,
        hasVisitedPasses: true,
        passesLastSeenRemaining: r ?? o.passesLastSeenRemaining
      }));
    }
    logEvent("tengu_guest_passes_visited", {
      is_first_visit: n
    });
    return Enc.jsx(bnc, {
      onDone: e
    });
  }
  var Enc;
  var vnc = __lazy(() => {
    Snc();
    Ot();
    HYe();
    Enc = __toESM(ie(), 1);
  });
  var Z9o;
  var wnc = __lazy(() => {
    HYe();
    Z9o = {
      type: "local-jsx",
      name: "passes",
      get description() {
        if (Hwt()) {
          return "Share a free week of Claude Code with friends and earn usage credits";
        }
        return "Share a free week of Claude Code with friends";
      },
      get isHidden() {
        let {
          eligible: e,
          hasCache: t
        } = Bwt();
        return !e || !t;
      },
      requires: {
        ink: true
      },
      load: () => Promise.resolve().then(() => (vnc(), Tnc))
    };
  });
  var Cnc = {};
  __export(Cnc, {
    PrivacySettingsDialog: () => PrivacySettingsDialog,
    GroveDialog: () => GroveDialog
  });
  function rtf() {
    let e = Pen.c(9);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = kl.jsxs(Text, {
        children: ["An update to our Consumer Terms and Privacy Policy will take effect on", " ", kl.jsx(Text, {
          bold: true,
          children: "October 8, 2025"
        }), ". You can accept the updated terms today."]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    let n;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      n = kl.jsx(Text, {
        children: "What's changing?"
      });
      e[1] = n;
    } else {
      n = e[1];
    }
    let r;
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      r = kl.jsx(Text, {
        children: "\xB7 "
      });
      o = kl.jsx(Text, {
        bold: true,
        children: "Help improve our AI models "
      });
      e[2] = r;
      e[3] = o;
    } else {
      r = e[2];
      o = e[3];
    }
    let s;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      s = kl.jsx(gXd, {
        paddingLeft: 1,
        children: kl.jsxs(Text, {
          children: [r, o, kl.jsxs(Text, {
            children: ["\u2014 Allow the use of your chats and coding sessions to train and improve Anthropic AI models. Change anytime in your Privacy Settings (", kl.jsx(Link, {
              url: "https://claude.ai/settings/data-privacy-controls"
            }), ")."]
          })]
        })
      });
      e[4] = s;
    } else {
      s = e[4];
    }
    let i;
    if (e[5] === Symbol.for("react.memo_cache_sentinel")) {
      i = kl.jsxs(gXd, {
        flexDirection: "column",
        children: [n, s, kl.jsx(gXd, {
          paddingLeft: 1,
          children: kl.jsxs(Text, {
            children: [kl.jsx(Text, {
              children: "\xB7 "
            }), kl.jsx(Text, {
              bold: true,
              children: "Updates to data retention "
            }), kl.jsx(Text, {
              children: "\u2014 To help us improve our AI models and safety protections, we're extending data retention to 5 years."
            })]
          })
        })]
      });
      e[5] = i;
    } else {
      i = e[5];
    }
    let a;
    if (e[6] === Symbol.for("react.memo_cache_sentinel")) {
      a = kl.jsx(Link, {
        url: "https://www.anthropic.com/news/updates-to-our-consumer-terms"
      });
      e[6] = a;
    } else {
      a = e[6];
    }
    let l;
    if (e[7] === Symbol.for("react.memo_cache_sentinel")) {
      l = kl.jsx(Link, {
        url: "https://anthropic.com/legal/terms"
      });
      e[7] = l;
    } else {
      l = e[7];
    }
    let c;
    if (e[8] === Symbol.for("react.memo_cache_sentinel")) {
      c = kl.jsxs(kl.Fragment, {
        children: [t, i, kl.jsxs(Text, {
          children: ["Learn more (", a, ") or read the updated Consumer Terms (", l, ") and Privacy Policy (", kl.jsx(Link, {
            url: "https://anthropic.com/legal/privacy"
          }), ")"]
        })]
      });
      e[8] = c;
    } else {
      c = e[8];
    }
    return c;
  }
  function otf() {
    let e = Pen.c(7);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = kl.jsx(Text, {
        children: "We've updated our Consumer Terms and Privacy Policy."
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    let n;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      n = kl.jsx(Text, {
        children: "What's changing?"
      });
      e[1] = n;
    } else {
      n = e[1];
    }
    let r;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      r = kl.jsxs(gXd, {
        flexDirection: "column",
        children: [kl.jsx(Text, {
          bold: true,
          children: "Help improve our AI models"
        }), kl.jsx(Text, {
          children: "Allow the use of your chats and coding sessions to train and improve Anthropic AI models. You can change this anytime in Privacy Settings"
        }), kl.jsx(Link, {
          url: "https://claude.ai/settings/data-privacy-controls"
        })]
      });
      e[2] = r;
    } else {
      r = e[2];
    }
    let o;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      o = kl.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [n, r, kl.jsxs(gXd, {
          flexDirection: "column",
          children: [kl.jsx(Text, {
            bold: true,
            children: "How this affects data retention"
          }), kl.jsx(Text, {
            children: "Turning ON the improve Claude setting extends data retention from 30 days to 5 years. Turning it OFF keeps the default 30-day data retention. Delete data anytime."
          })]
        })]
      });
      e[3] = o;
    } else {
      o = e[3];
    }
    let s;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      s = kl.jsx(Link, {
        url: "https://www.anthropic.com/news/updates-to-our-consumer-terms"
      });
      e[4] = s;
    } else {
      s = e[4];
    }
    let i;
    if (e[5] === Symbol.for("react.memo_cache_sentinel")) {
      i = kl.jsx(Link, {
        url: "https://anthropic.com/legal/terms"
      });
      e[5] = i;
    } else {
      i = e[5];
    }
    let a;
    if (e[6] === Symbol.for("react.memo_cache_sentinel")) {
      a = kl.jsxs(kl.Fragment, {
        children: [t, o, kl.jsxs(Text, {
          children: ["Learn more (", s, ") or read the updated Consumer Terms (", i, ") and Privacy Policy (", kl.jsx(Link, {
            url: "https://anthropic.com/legal/privacy"
          }), ")"]
        })]
      });
      e[6] = a;
    } else {
      a = e[6];
    }
    return a;
  }
  function GroveDialog(e) {
    let t = Pen.c(35);
    let {
      showIfAlreadyViewed: n,
      location: r,
      onDone: o
    } = e;
    let [s, i] = rJe.useState(null);
    let [a, l] = rJe.useState(null);
    let c;
    let u;
    if (t[0] !== r || t[1] !== o || t[2] !== n) {
      c = () => {
        (async function () {
          let [L, P] = await Promise.all([Yoe(), HNe()]);
          let F = P.success ? P.data : null;
          l(F);
          let H = Iwo(L, P, n);
          if (i(H), !H) {
            o("skip_rendering");
            return;
          }
          Awo();
          logEvent("tengu_grove_policy_viewed", {
            location: r,
            dismissable: F?.notice_is_grace_period
          });
        })();
      };
      u = [n, r, o];
      t[0] = r;
      t[1] = o;
      t[2] = n;
      t[3] = c;
      t[4] = u;
    } else {
      c = t[3];
      u = t[4];
    }
    if (rJe.useEffect(c, u), s === null) {
      return null;
    }
    if (!s) {
      return null;
    }
    let d;
    if (t[5] !== a?.notice_is_grace_period || t[6] !== o) {
      d = async function (M) {
        e: switch (M) {
          case "accept_opt_in":
            {
              await I5n(true);
              logEvent("tengu_grove_policy_submitted", {
                state: true,
                dismissable: a?.notice_is_grace_period
              });
              break e;
            }
          case "accept_opt_out":
            {
              await I5n(false);
              logEvent("tengu_grove_policy_submitted", {
                state: false,
                dismissable: a?.notice_is_grace_period
              });
              break e;
            }
          case "defer":
            {
              logEvent("tengu_grove_policy_dismissed", {
                state: true
              });
              break e;
            }
          case "escape":
            logEvent("tengu_grove_policy_escaped", {});
        }
        o(M);
      };
      t[5] = a?.notice_is_grace_period;
      t[6] = o;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p = d;
    let m;
    if (t[8] !== a?.domain_excluded) {
      m = a?.domain_excluded ? [{
        label: "Accept terms \xB7 Help improve our AI models: OFF (for emails with your domain)",
        value: "accept_opt_out"
      }] : [{
        label: "Accept terms \xB7 Help improve our AI models: ON",
        value: "accept_opt_in"
      }, {
        label: "Accept terms \xB7 Help improve our AI models: OFF",
        value: "accept_opt_out"
      }];
      t[8] = a?.domain_excluded;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f = m;
    let h;
    if (t[10] !== a?.notice_is_grace_period || t[11] !== p) {
      h = function () {
        if (a?.notice_is_grace_period) {
          p("defer");
          return;
        }
        p("escape");
      };
      t[10] = a?.notice_is_grace_period;
      t[11] = p;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g = h;
    let y;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      y = kl.jsxs(Hn, {
        children: [kl.jsx(xt, {
          chord: "enter",
          action: "confirm"
        }), kl.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      });
      t[13] = y;
    } else {
      y = t[13];
    }
    let _;
    if (t[14] !== a?.notice_is_grace_period) {
      _ = kl.jsx(gXd, {
        flexDirection: "column",
        gap: 1,
        flexGrow: 1,
        children: a?.notice_is_grace_period ? kl.jsx(rtf, {}) : kl.jsx(otf, {})
      });
      t[14] = a?.notice_is_grace_period;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      b = kl.jsx(gXd, {
        flexShrink: 0,
        children: kl.jsx(Text, {
          color: "professionalBlue",
          children: ntf
        })
      });
      t[16] = b;
    } else {
      b = t[16];
    }
    let S;
    if (t[17] !== _) {
      S = kl.jsxs(gXd, {
        flexDirection: "row",
        children: [_, b]
      });
      t[17] = _;
      t[18] = S;
    } else {
      S = t[18];
    }
    let E;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      E = kl.jsxs(gXd, {
        flexDirection: "column",
        children: [kl.jsx(Text, {
          bold: true,
          children: "Please select how you'd like to continue"
        }), kl.jsx(Text, {
          children: "Your choice takes effect immediately upon confirmation."
        })]
      });
      t[19] = E;
    } else {
      E = t[19];
    }
    let C;
    if (t[20] !== a?.notice_is_grace_period) {
      C = a?.notice_is_grace_period ? [{
        label: "Not now",
        value: "defer"
      }] : [];
      t[20] = a?.notice_is_grace_period;
      t[21] = C;
    } else {
      C = t[21];
    }
    let x;
    if (t[22] !== f || t[23] !== C) {
      x = [...f, ...C];
      t[22] = f;
      t[23] = C;
      t[24] = x;
    } else {
      x = t[24];
    }
    let A;
    if (t[25] !== p) {
      A = O => p(O);
      t[25] = p;
      t[26] = A;
    } else {
      A = t[26];
    }
    let k;
    if (t[27] !== g || t[28] !== x || t[29] !== A) {
      k = kl.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [E, kl.jsx(xr, {
          options: x,
          onChange: A,
          onCancel: g
        })]
      });
      t[27] = g;
      t[28] = x;
      t[29] = A;
      t[30] = k;
    } else {
      k = t[30];
    }
    let I;
    if (t[31] !== g || t[32] !== k || t[33] !== S) {
      I = kl.jsxs(or, {
        title: "Updates to Consumer Terms and Policies",
        color: "professionalBlue",
        onCancel: g,
        inputGuide: y,
        children: [S, k]
      });
      t[31] = g;
      t[32] = k;
      t[33] = S;
      t[34] = I;
    } else {
      I = t[34];
    }
    return I;
  }
  function PrivacySettingsDialog(e) {
    let t = Pen.c(20);
    let {
      settings: n,
      domainExcluded: r,
      onDone: o
    } = e;
    let [s, i] = rJe.useState(n.grove_enabled);
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = [];
      t[0] = a;
    } else {
      a = t[0];
    }
    rJe.useEffect(stf, a);
    let l;
    if (t[1] !== r || t[2] !== s) {
      l = function (b) {
        if (b.ctrl || b.meta) {
          return;
        }
        if (!r && (b.key === "tab" || b.key === "return" || b.key === " ")) {
          b.preventDefault();
          let S = !s;
          i(S);
          I5n(S);
        }
      };
      t[1] = r;
      t[2] = s;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = l;
    let u;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      u = kl.jsx(Text, {
        color: "error",
        children: "false"
      });
      t[4] = u;
    } else {
      u = t[4];
    }
    let d = u;
    if (r) {
      let _;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        _ = kl.jsx(Text, {
          color: "error",
          children: "false (for emails with your domain)"
        });
        t[5] = _;
      } else {
        _ = t[5];
      }
      d = _;
    } else if (s) {
      let _;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        _ = kl.jsx(Text, {
          color: "success",
          children: "true"
        });
        t[6] = _;
      } else {
        _ = t[6];
      }
      d = _;
    }
    let p;
    if (t[7] !== r) {
      p = r ? kl.jsx(xt, {
        chord: "escape",
        action: "cancel"
      }) : kl.jsxs(Hn, {
        children: [kl.jsx(xt, {
          chord: ["enter", "tab", "space"],
          action: "toggle"
        }), kl.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      });
      t[7] = r;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      m = kl.jsxs(Text, {
        children: ["Review and manage your privacy settings at", " ", kl.jsx(Link, {
          url: "https://claude.ai/settings/data-privacy-controls"
        })]
      });
      t[9] = m;
    } else {
      m = t[9];
    }
    let f;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      f = kl.jsx(gXd, {
        width: 44,
        children: kl.jsx(Text, {
          bold: true,
          children: "Help improve our AI models"
        })
      });
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== d) {
      h = kl.jsxs(gXd, {
        children: [f, kl.jsx(gXd, {
          children: d
        })]
      });
      t[11] = d;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g;
    if (t[13] !== c || t[14] !== h) {
      g = kl.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: c,
        children: [m, h]
      });
      t[13] = c;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== o || t[17] !== p || t[18] !== g) {
      y = kl.jsx(or, {
        title: "Data privacy",
        color: "professionalBlue",
        onCancel: o,
        inputGuide: p,
        children: g
      });
      t[16] = o;
      t[17] = p;
      t[18] = g;
      t[19] = y;
    } else {
      y = t[19];
    }
    return y;
  }
  function stf() {
    logEvent("tengu_grove_privacy_settings_viewed", {});
  }
  var Pen;
  var rJe;
  var kl;
  var ntf = ` _____________
 |          \\  \\
 | NEW TERMS \\__\\
 |              |
 |  ----------  |
 |  ----------  |
 |  ----------  |
 |  ----------  |
 |  ----------  |
 |              |
 |______________|`;
  var n5o = __lazy(() => {
    Ot();
    et();
    Rgt();
    OS();
    Ai();
    Ii();
    bs();
    Pen = __toESM(pt(), 1);
    rJe = __toESM(ot(), 1);
    kl = __toESM(ie(), 1);
  });
  var xnc = {};
  __export(xnc, {
    call: () => call_export62
  });
  async function call_export62(e) {
    if (!(await Cgt())) {
      e("Review and manage your privacy settings at https://claude.ai/settings/data-privacy-controls");
      return null;
    }
    let [n, r] = await Promise.all([Yoe(), HNe()]);
    if (!n.success) {
      e("Review and manage your privacy settings at https://claude.ai/settings/data-privacy-controls");
      return null;
    }
    let o = n.data;
    let s = r.success ? r.data : null;
    async function i(l) {
      if (l === "escape" || l === "defer") {
        e("Privacy settings dialog dismissed", {
          display: "system"
        });
        return;
      }
      await a();
    }
    async function a() {
      let l = await Yoe();
      if (!l.success) {
        e("Unable to retrieve updated privacy settings", {
          display: "system"
        });
        return;
      }
      let c = l.data;
      let u = c.grove_enabled ? "true" : "false";
      if (e(`"Help improve our AI models" set to ${u}.`), o.grove_enabled !== null && o.grove_enabled !== c.grove_enabled) {
        logEvent("tengu_grove_policy_toggled", {
          state: c.grove_enabled,
          location: "settings"
        });
      }
    }
    if (o.grove_enabled !== null) {
      return r5o.jsx(PrivacySettingsDialog, {
        settings: o,
        domainExcluded: s?.domain_excluded,
        onDone: a
      });
    }
    return r5o.jsx(GroveDialog, {
      showIfAlreadyViewed: true,
      onDone: i,
      location: "settings"
    });
  }
  var r5o;
  var knc = __lazy(() => {
    n5o();
    Ot();
    Rgt();
    r5o = __toESM(ie(), 1);
  });
  var atf;
  function mCe(e) {
    switch (e.type) {
      case "command":
        return e.args ? [e.command, ...e.args].join(" ") : e.command;
      case "prompt":
        return e.prompt;
      case "agent":
        return e.prompt;
      case "http":
        return e.url;
      case "mcp_tool":
        return `${e.server}/${e.tool}`;
      case "callback":
        return "callback";
      case "function":
        return "function";
    }
  }
  function RH(e) {
    if ("statusMessage" in e && e.statusMessage) {
      return e.statusMessage;
    }
    return mCe(e);
  }
  function Pnc(e) {
    let t = [];
    if (getSettingsForSource("policySettings")?.allowManagedHooksOnly !== true) {
      let i = sF;
      let a = new Set();
      for (let l of i) {
        let c = getSettingsFilePathForSource(l);
        if (c) {
          let d = Inc.resolve(c);
          if (a.vZc(d)) {
            continue;
          }
          a.add(d);
        }
        let u = getSettingsForSource(l);
        if (!u?.hooks) {
          continue;
        }
        for (let [d, p] of Object.entries(u.hooks)) {
          for (let m of p) {
            for (let f of m.hooks) {
              t.push({
                event: d,
                config: f,
                matcher: m.matcher,
                source: l
              });
            }
          }
        }
      }
    }
    let o = getSessionId();
    let s = ILe(e, o);
    for (let [i, a] of s.entries()) {
      for (let l of a) {
        for (let c of l.hooks) {
          t.push({
            event: i,
            config: c,
            matcher: l.matcher,
            source: "sessionHook"
          });
        }
      }
    }
    return t;
  }
  function Onc(e) {
    switch (e) {
      case "userSettings":
        return "User settings (~/.claude/settings.json)";
      case "projectSettings":
        return "Project settings (.claude/settings.json)";
      case "localSettings":
        return "Local settings (.claude/settings.local.json)";
      case "pluginHook":
        return "Plugin hooks (~/.claude/plugins/*/hooks/hooks.json)";
      case "sessionHook":
        return "Session hooks (in-memory, temporary)";
      case "builtinHook":
        return "Built-in hooks (registered internally by Claude Code)";
      default:
        return e;
    }
  }
  function s5o(e) {
    switch (e) {
      case "userSettings":
        return "User Settings";
      case "projectSettings":
        return "Project Settings";
      case "localSettings":
        return "Local Settings";
      case "pluginHook":
        return "Plugin Hooks";
      case "sessionHook":
        return "Session Hooks";
      case "builtinHook":
        return "Built-in Hooks";
      default:
        return e;
    }
  }
  function Dnc(e) {
    switch (e) {
      case "userSettings":
        return "User";
      case "projectSettings":
        return "Project";
      case "localSettings":
        return "Local";
      case "pluginHook":
        return "Plugin";
      case "sessionHook":
        return "Session";
      case "builtinHook":
        return "Built-in";
      default:
        return e;
    }
  }
  function Mnc(e, t, n) {
    let r = yMt.reduce((o, s, i) => (o[s] = i, o), {});
    return [...e].sort((o, s) => {
      let i = t[n]?.[o] || [];
      let a = t[n]?.[s] || [];
      let l = Ro(i.map(m => m.source));
      let c = Ro(a.map(m => m.source));
      let u = m => m === "pluginHook" || m === "builtinHook" ? 999 : r[m];
      let d = Math.min(...l.map(u));
      let p = Math.min(...c.map(u));
      if (d !== p) {
        return d - p;
      }
      return o.localeCompare(s);
    });
  }
  var Inc;
  var dCt = __lazy(() => {
    at();
    nf();
    pZ();
    Inc = require("path");
  });
  function Nnc(e, t) {
    let n = {
      PreToolUse: {},
      PostToolUse: {},
      PostToolUseFailure: {},
      PostToolBatch: {},
      PermissionDenied: {},
      Notification: {},
      UserPromptSubmit: {},
      UserPromptExpansion: {},
      SessionStart: {},
      SessionEnd: {},
      Stop: {},
      StopFailure: {},
      SubagentStart: {},
      SubagentStop: {},
      PreCompact: {},
      PostCompact: {},
      PermissionRequest: {},
      Setup: {},
      TeammateIdle: {},
      TaskCreated: {},
      TaskCompleted: {},
      Elicitation: {},
      ElicitationResult: {},
      ConfigChange: {},
      WorktreeCreate: {},
      WorktreeRemove: {},
      InstructionsLoaded: {},
      CwdChanged: {},
      FileChanged: {},
      MessageDisplay: {}
    };
    let r = lur(t);
    Pnc(e).forEach(s => {
      let i = n[s.event];
      if (i) {
        let a = r[s.event].matcherMetadata !== undefined ? s.matcher || "" : "";
        if (!i[a]) {
          i[a] = [];
        }
        i[a].push(s);
      }
    });
    let o = getRegisteredHooks();
    if (o) {
      for (let [s, i] of Object.entries(o)) {
        let a = s;
        let l = n[a];
        if (!l) {
          continue;
        }
        for (let c of i) {
          let u = c.matcher || "";
          if ("pluginRoot" in c) {
            l[u] ??= [];
            for (let d of c.hooks) {
              l[u].push({
                event: a,
                config: d,
                matcher: c.matcher,
                source: "pluginHook",
                pluginName: c.pluginId
              });
            }
          }
        }
      }
    }
    return n;
  }
  function Lnc(e, t) {
    let n = Object.keys(e[t] || {});
    return Mnc(n, e, t);
  }
  function Fnc(e, t, n) {
    let r = n ?? "";
    return e[t]?.[r] ?? [];
  }
  function Oen(e, t) {
    return lur(t)[e].matcherMetadata;
  }
  var lur;
  var Unc = __lazy(() => {
    at();
    dCt();
    lur = TEr(function (e) {
      return {
        PreToolUse: {
          summary: "Before tool execution",
          description: `Input to command is JSON of tool call arguments.
Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to model and block tool call
Other exit codes - show stderr to user only but continue with tool call`,
          matcherMetadata: {
            fieldToMatch: "tool_name",
            values: e
          }
        },
        PostToolUse: {
          summary: "After tool execution",
          description: `Input to command is JSON with fields "inputs" (tool call arguments) and "response" (tool call response).
Exit code 0 - stdout shown in transcript mode (ctrl+o)
Exit code 2 - show stderr to model immediately
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "tool_name",
            values: e
          }
        },
        PostToolUseFailure: {
          summary: "After tool execution fails",
          description: `Input to command is JSON with tool_name, tool_input, tool_use_id, error, error_type, is_interrupt, and is_timeout.
Exit code 0 - stdout shown in transcript mode (ctrl+o)
Exit code 2 - show stderr to model immediately
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "tool_name",
            values: e
          }
        },
        PostToolBatch: {
          summary: "After a batch of tool calls resolves",
          description: `Fires once after every tool call in a batch has resolved, before the next model request. Input includes tool_calls (array of {tool_name, tool_input, tool_use_id, tool_response}).
Return additionalContext via hookSpecificOutput to inject context once for the whole batch.
Exit code 2 - stop the agentic loop (stderr shown to user only)
Other exit codes - show stderr to user only`
        },
        PermissionDenied: {
          summary: "After auto mode classifier denies a tool call",
          description: `Input to command is JSON with tool_name, tool_input, tool_use_id, and reason.
Return {"hookSpecificOutput":{"hookEventName":"PermissionDenied","retry":true}} to tell the model it may retry.
Exit code 0 - stdout shown in transcript mode (ctrl+o)
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "tool_name",
            values: e
          }
        },
        Notification: {
          summary: "When notifications are sent",
          description: `Input to command is JSON with notification message and type.
Exit code 0 - stdout/stderr not shown
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "notification_type",
            values: ["permission_prompt", "idle_prompt", "auth_success", "elicitation_dialog", "elicitation_complete", "elicitation_response", "agent_needs_input", "agent_completed"]
          }
        },
        UserPromptSubmit: {
          summary: "When the user submits a prompt",
          description: `Input to command is JSON with original user prompt text.
Exit code 0 - stdout shown to Claude
Exit code 2 - block processing, erase original prompt, and show stderr to user only
Other exit codes - show stderr to user only`
        },
        UserPromptExpansion: {
          summary: "When a user-typed slash command expands into a prompt",
          description: `Input to command is JSON with expansion_type, command_name, command_args, command_source, and original prompt.
Exit code 0 - stdout shown to Claude
Exit code 2 - block expansion and show stderr to user only
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "command_name",
            values: []
          }
        },
        SessionStart: {
          summary: "When a new session is started",
          description: `Input to command is JSON with session start source.
Exit code 0 - stdout shown to Claude
Blocking errors are ignored
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "source",
            values: ["startup", "resume", "clear", "compact"]
          }
        },
        Stop: {
          summary: "Right before Claude concludes its response",
          description: `Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to model and continue conversation
Other exit codes - show stderr to user only`
        },
        StopFailure: {
          summary: "When the turn ends due to an API error",
          description: "Fires instead of Stop when an API error (rate limit, auth failure, etc.) ended the turn. Fire-and-forget \u2014 hook output and exit codes are ignored.",
          matcherMetadata: {
            fieldToMatch: "error",
            values: ["rate_limit", "overloaded", "authentication_failed", "oauth_org_not_allowed", "billing_error", "invalid_request", "model_not_found", "server_error", "max_output_tokens", "unknown"]
          }
        },
        SubagentStart: {
          summary: "When a subagent (Agent tool call) is started",
          description: `Input to command is JSON with agent_id and agent_type.
Exit code 0 - stdout shown to subagent
Blocking errors are ignored
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "agent_type",
            values: []
          }
        },
        SubagentStop: {
          summary: "Right before a subagent (Agent tool call) concludes its response",
          description: `Input to command is JSON with agent_id, agent_type, and agent_transcript_path.
Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to subagent and continue having it run
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "agent_type",
            values: []
          }
        },
        PreCompact: {
          summary: "Before conversation compaction",
          description: `Input to command is JSON with compaction details.
Exit code 0 - stdout appended as custom compact instructions
Exit code 2 - block compaction
Other exit codes - show stderr to user only but continue with compaction`,
          matcherMetadata: {
            fieldToMatch: "trigger",
            values: ["manual", "auto"]
          }
        },
        PostCompact: {
          summary: "After conversation compaction",
          description: `Input to command is JSON with compaction details and the summary.
Exit code 0 - stdout shown to user
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "trigger",
            values: ["manual", "auto"]
          }
        },
        SessionEnd: {
          summary: "When a session is ending",
          description: `Input to command is JSON with session end reason.
Exit code 0 - command completes successfully
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "reason",
            values: ["clear", "logout", "prompt_input_exit", "other"]
          }
        },
        PermissionRequest: {
          summary: "When a permission dialog is displayed",
          description: `Input to command is JSON with tool_name, tool_input, and tool_use_id.
Output JSON with hookSpecificOutput containing decision to allow or deny.
Exit code 0 - use hook decision if provided
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "tool_name",
            values: e
          }
        },
        Setup: {
          summary: "Repo setup hooks for init and maintenance",
          description: `Input to command is JSON with trigger (init or maintenance).
Exit code 0 - stdout shown to Claude
Blocking errors are ignored
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "trigger",
            values: ["init", "maintenance"]
          }
        },
        TeammateIdle: {
          summary: "When a teammate is about to go idle",
          description: `Input to command is JSON with teammate_name and team_name.
Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to teammate and prevent idle (teammate continues working)
Other exit codes - show stderr to user only`
        },
        TaskCreated: {
          summary: "When a task is being created",
          description: `Input to command is JSON with task_id, task_subject, task_description, teammate_name, and team_name.
Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to model and prevent task creation
Other exit codes - show stderr to user only`
        },
        TaskCompleted: {
          summary: "When a task is being marked as completed",
          description: `Input to command is JSON with task_id, task_subject, task_description, teammate_name, and team_name.
Exit code 0 - stdout/stderr not shown
Exit code 2 - show stderr to model and prevent task completion
Other exit codes - show stderr to user only`
        },
        Elicitation: {
          summary: "When an MCP server requests user input (elicitation)",
          description: `Input to command is JSON with mcp_server_name, message, and requested_schema.
Output JSON with hookSpecificOutput containing action (accept/decline/cancel) and optional content.
Exit code 0 - use hook response if provided
Exit code 2 - deny the elicitation
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "mcp_server_name",
            values: []
          }
        },
        ElicitationResult: {
          summary: "After a user responds to an MCP elicitation",
          description: `Input to command is JSON with mcp_server_name, action, content, mode, and elicitation_id.
Output JSON with hookSpecificOutput containing optional action and content to override the response.
Exit code 0 - use hook response if provided
Exit code 2 - block the response (action becomes decline)
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "mcp_server_name",
            values: []
          }
        },
        ConfigChange: {
          summary: "When configuration files change during a session",
          description: `Input to command is JSON with source (user_settings, project_settings, local_settings, policy_settings, skills) and file_path.
Exit code 0 - allow the change
Exit code 2 - block the change from being applied to the session
Other exit codes - show stderr to user only`,
          matcherMetadata: {
            fieldToMatch: "source",
            values: ["user_settings", "project_settings", "local_settings", "policy_settings", "skills"]
          }
        },
        InstructionsLoaded: {
          summary: "When an instruction file (CLAUDE.md or rule) is loaded",
          description: `Input to command is JSON with file_path, memory_type (User, Project, Local, Managed), load_reason (session_start, nested_traversal, path_glob_match, include, compact), globs (optional \u2014 the paths: frontmatter patterns that matched), trigger_file_path (optional \u2014 the file Claude touched that caused the load), and parent_file_path (optional \u2014 the file that @-included this one).
Exit code 0 - command completes successfully
Other exit codes - show stderr to user only
This hook is observability-only and does not support blocking.`,
          matcherMetadata: {
            fieldToMatch: "load_reason",
            values: ["session_start", "nested_traversal", "path_glob_match", "include", "compact"]
          }
        },
        WorktreeCreate: {
          summary: "Create an isolated worktree for VCS-agnostic isolation",
          description: `Input to command is JSON with name (suggested worktree slug).
Stdout should contain the absolute path to the created worktree directory.
Exit code 0 - worktree created successfully
Other exit codes - worktree creation failed`
        },
        WorktreeRemove: {
          summary: "Remove a previously created worktree",
          description: `Input to command is JSON with worktree_path (absolute path to worktree).
Exit code 0 - worktree removed successfully
Other exit codes - show stderr to user only`
        },
        CwdChanged: {
          summary: "After the working directory changes",
          description: `Input to command is JSON with old_cwd and new_cwd.
CLAUDE_ENV_FILE is set \u2014 write bash exports there to apply env to subsequent BashTool commands.
Hook output can include hookSpecificOutput.watchPaths (array of absolute paths) to register with the FileChanged watcher.
Exit code 0 - command completes successfully
Other exit codes - show stderr to user only`
        },
        FileChanged: {
          summary: "When a watched file changes",
          description: `Input to command is JSON with file_path and event (change, add, unlink).
CLAUDE_ENV_FILE is set \u2014 write bash exports there to apply env to subsequent BashTool commands.
The matcher field specifies filenames to watch in the current directory (e.g. ".envrc|.env").
Hook output can include hookSpecificOutput.watchPaths (array of absolute paths) to dynamically update the watch list.
Exit code 0 - command completes successfully
Other exit codes - show stderr to user only`
        },
        MessageDisplay: {
          summary: "While assistant message text is displayed",
          description: `Input to command is JSON with turn_id, message_id, index, final, and delta (the newly completed lines).
Output JSON with hookSpecificOutput containing displayContent to replace the delta on screen.
Display-only: the stored message and what the model sees are untouched.
Exit code 0 - use hook response if provided
Other exit codes - display the original delta`
        }
      };
    }, e => e.slice().sort().join(","));
  });
  function $nc(e) {
    let t = Bnc.c(26);
    let {
      hookEventMetadata: n,
      hooksByEvent: r,
      totalHooksCount: o,
      restrictedByPolicy: s,
      suspendedBySafeMode: i,
      onSelectEvent: a,
      onCancel: l
    } = e;
    let c;
    if (t[0] !== o) {
      c = un(o, "hook");
      t[0] = o;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = `${o} ${c} configured`;
    let d;
    if (t[2] !== i) {
      d = i && aB.jsxs(gXd, {
        flexDirection: "column",
        children: [aB.jsxs(Text, {
          color: "warning",
          children: [vGd.info, " Safe mode"]
        }), aB.jsxs(Text, {
          dimColor: true,
          children: ["Hooks from settings files are suspended and will not run this session", i.managedHooksStillApply ? " (managed policy hooks still apply)" : "", "; session hooks created by /goal, agents, and skills still run. Settings edits save but don't load until safe mode is off.", " ", DD(i.exitHint), " to re-enable."]
        })]
      });
      t[2] = i;
      t[3] = d;
    } else {
      d = t[3];
    }
    let p;
    if (t[4] !== s) {
      p = s && aB.jsxs(gXd, {
        flexDirection: "column",
        children: [aB.jsxs(Text, {
          color: "suggestion",
          children: [vGd.info, " Hooks Restricted by Policy"]
        }), aB.jsx(Text, {
          dimColor: true,
          children: "Only hooks from managed settings can run. User-defined hooks from ~/.claude/settings.json, .claude/settings.json, and .claude/settings.local.json are blocked."
        })]
      });
      t[4] = s;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      m = aB.jsx(gXd, {
        flexDirection: "column",
        children: aB.jsxs(Text, {
          dimColor: true,
          children: [vGd.info, " This menu is read-only. To add or modify hooks, edit settings.json directly or ask Claude.", " ", aB.jsx(Link, {
            url: "https://code.claude.com/docs/en/hooks",
            children: "Learn more"
          })]
        })
      });
      t[6] = m;
    } else {
      m = t[6];
    }
    let f;
    if (t[7] !== a) {
      f = S => {
        a(S);
      };
      t[7] = a;
      t[8] = f;
    } else {
      f = t[8];
    }
    let h;
    if (t[9] !== n) {
      h = Object.entries(n);
      t[9] = n;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] !== r || t[12] !== h) {
      g = h.map(S => {
        let [E, C] = S;
        let x = r[E] || 0;
        return {
          label: x > 0 ? aB.jsxs(Text, {
            children: [E, " ", aB.jsxs(Text, {
              color: "suggestion",
              children: ["(", x, ")"]
            })]
          }) : E,
          value: E,
          description: C.summary
        };
      });
      t[11] = r;
      t[12] = h;
      t[13] = g;
    } else {
      g = t[13];
    }
    let y;
    if (t[14] !== l || t[15] !== f || t[16] !== g) {
      y = aB.jsx(gXd, {
        flexDirection: "column",
        children: aB.jsx(xr, {
          onChange: f,
          onCancel: l,
          options: g
        })
      });
      t[14] = l;
      t[15] = f;
      t[16] = g;
      t[17] = y;
    } else {
      y = t[17];
    }
    let _;
    if (t[18] !== d || t[19] !== p || t[20] !== y) {
      _ = aB.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [d, p, m, y]
      });
      t[18] = d;
      t[19] = p;
      t[20] = y;
      t[21] = _;
    } else {
      _ = t[21];
    }
    let b;
    if (t[22] !== l || t[23] !== u || t[24] !== _) {
      b = aB.jsx(or, {
        title: "Hooks",
        subtitle: u,
        onCancel: l,
        children: _
      });
      t[22] = l;
      t[23] = u;
      t[24] = _;
      t[25] = b;
    } else {
      b = t[25];
    }
    return b;
  }
  var Bnc;
  var aB;
  var Hnc = __lazy(() => {
    et();
    Zn();
    $c();
    Ii();
    Bnc = __toESM(pt(), 1);
    aB = __toESM(ie(), 1);
  });
  function qnc(e) {
    let t = jnc.c(20);
    let {
      selectedEvent: n,
      selectedMatcher: r,
      hooksForSelectedMatcher: o,
      hookEventMetadata: s,
      onSelect: i,
      onCancel: a
    } = e;
    let l = s.matcherMetadata !== undefined ? `${n} - Matcher: ${r || "(all)"}` : n;
    if (o.length === 0) {
      let f;
      let h;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        f = oJe.jsx(xt, {
          chord: "escape",
          action: "go back"
        });
        h = oJe.jsx(sc, {
          hint: "To add hooks, edit settings.json directly or ask Claude",
          children: "No hooks configured for this event"
        });
        t[0] = f;
        t[1] = h;
      } else {
        f = t[0];
        h = t[1];
      }
      let g;
      if (t[2] !== s.description || t[3] !== a || t[4] !== l) {
        g = oJe.jsx(or, {
          title: l,
          subtitle: s.description,
          onCancel: a,
          inputGuide: f,
          children: h
        });
        t[2] = s.description;
        t[3] = a;
        t[4] = l;
        t[5] = g;
      } else {
        g = t[5];
      }
      return g;
    }
    let c = s.description;
    let u;
    if (t[6] !== o) {
      u = o.map(ltf);
      t[6] = o;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== o || t[9] !== i) {
      d = f => {
        let h = parseInt(f, 10);
        let g = o[h];
        if (g) {
          i(g);
        }
      };
      t[8] = o;
      t[9] = i;
      t[10] = d;
    } else {
      d = t[10];
    }
    let p;
    if (t[11] !== a || t[12] !== u || t[13] !== d) {
      p = oJe.jsx(gXd, {
        flexDirection: "column",
        children: oJe.jsx(xr, {
          options: u,
          onChange: d,
          onCancel: a
        })
      });
      t[11] = a;
      t[12] = u;
      t[13] = d;
      t[14] = p;
    } else {
      p = t[14];
    }
    let m;
    if (t[15] !== s.description || t[16] !== a || t[17] !== p || t[18] !== l) {
      m = oJe.jsx(or, {
        title: l,
        subtitle: c,
        onCancel: a,
        children: p
      });
      t[15] = s.description;
      t[16] = a;
      t[17] = p;
      t[18] = l;
      t[19] = m;
    } else {
      m = t[19];
    }
    return m;
  }
  function ltf(e, t) {
    return {
      label: `[${e.config.type}] ${RH(e.config)}`,
      value: t.toString(),
      description: e.source === "pluginHook" && e.pluginName ? `${s5o(e.source)} (${e.pluginName})` : s5o(e.source)
    };
  }
  var jnc;
  var oJe;
  var Wnc = __lazy(() => {
    et();
    dCt();
    $c();
    Ii();
    xb();
    bs();
    jnc = __toESM(pt(), 1);
    oJe = __toESM(ie(), 1);
  });
  function Vnc(e) {
    let t = Gnc.c(26);
    let {
      selectedEvent: n,
      matchersForSelectedEvent: r,
      hooksByEventAndMatcher: o,
      eventDescription: s,
      onSelect: i,
      onCancel: a
    } = e;
    let l;
    if (t[0] !== o || t[1] !== r || t[2] !== n) {
      let h;
      if (t[4] !== o || t[5] !== n) {
        h = g => {
          let y = o[n]?.[g] || [];
          let _ = Ro(y.map(utf));
          return {
            matcher: g,
            sources: _,
            hookCount: y.length
          };
        };
        t[4] = o;
        t[5] = n;
        t[6] = h;
      } else {
        h = t[6];
      }
      l = r.map(h);
      t[0] = o;
      t[1] = r;
      t[2] = n;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = l;
    if (r.length === 0) {
      let h = `${n} - Matchers`;
      let g;
      let y;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        g = sJe.jsx(xt, {
          chord: "escape",
          action: "go back"
        });
        y = sJe.jsx(sc, {
          hint: "To add hooks, edit settings.json directly or ask Claude",
          children: "No hooks configured for this event"
        });
        t[7] = g;
        t[8] = y;
      } else {
        g = t[7];
        y = t[8];
      }
      let _;
      if (t[9] !== s || t[10] !== a || t[11] !== h) {
        _ = sJe.jsx(or, {
          title: h,
          subtitle: s,
          onCancel: a,
          inputGuide: g,
          children: y
        });
        t[9] = s;
        t[10] = a;
        t[11] = h;
        t[12] = _;
      } else {
        _ = t[12];
      }
      return _;
    }
    let u = `${n} - Matchers`;
    let d;
    if (t[13] !== c) {
      d = c.map(ctf);
      t[13] = c;
      t[14] = d;
    } else {
      d = t[14];
    }
    let p;
    if (t[15] !== i) {
      p = h => {
        i(h);
      };
      t[15] = i;
      t[16] = p;
    } else {
      p = t[16];
    }
    let m;
    if (t[17] !== a || t[18] !== d || t[19] !== p) {
      m = sJe.jsx(gXd, {
        flexDirection: "column",
        children: sJe.jsx(xr, {
          options: d,
          onChange: p,
          onCancel: a
        })
      });
      t[17] = a;
      t[18] = d;
      t[19] = p;
      t[20] = m;
    } else {
      m = t[20];
    }
    let f;
    if (t[21] !== s || t[22] !== a || t[23] !== u || t[24] !== m) {
      f = sJe.jsx(or, {
        title: u,
        subtitle: s,
        onCancel: a,
        children: m
      });
      t[21] = s;
      t[22] = a;
      t[23] = u;
      t[24] = m;
      t[25] = f;
    } else {
      f = t[25];
    }
    return f;
  }
  function ctf(e) {
    let t = e.sources.map(Dnc).join(", ");
    let n = e.matcher || "(all)";
    return {
      label: `[${t}] ${n}`,
      value: e.matcher,
      description: `${e.hookCount} ${un(e.hookCount, "hook")}`
    };
  }
  function utf(e) {
    return e.source;
  }
  var Gnc;
  var sJe;
  var znc = __lazy(() => {
    et();
    dCt();
    Zn();
    $c();
    Ii();
    xb();
    bs();
    Gnc = __toESM(pt(), 1);
    sJe = __toESM(ie(), 1);
  });
  function Ync(e) {
    let t = Knc.c(45);
    let {
      selectedHook: n,
      eventSupportsMatcher: r,
      onCancel: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = Pg.jsx(xt, {
        chord: "escape",
        action: "go back"
      });
      t[0] = s;
    } else {
      s = t[0];
    }
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = [{
        bold: true
      }, {}];
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = Pg.jsx(Pg.Fragment, {
        children: "Event:"
      });
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== n.event) {
      l = Pg.jsxs(ih.Row, {
        children: [a, Pg.jsx(Text, {
          children: n.event
        })]
      });
      t[3] = n.event;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== r || t[6] !== n.matcher) {
      c = r && Pg.jsxs(ih.Row, {
        children: [Pg.jsx(Pg.Fragment, {
          children: "Matcher:"
        }), Pg.jsx(Text, {
          children: n.matcher || "(all)"
        })]
      });
      t[5] = r;
      t[6] = n.matcher;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      u = Pg.jsx(Pg.Fragment, {
        children: "Type:"
      });
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] !== n.config.type) {
      d = Pg.jsxs(ih.Row, {
        children: [u, Pg.jsx(Text, {
          children: n.config.type
        })]
      });
      t[9] = n.config.type;
      t[10] = d;
    } else {
      d = t[10];
    }
    let p;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      p = Pg.jsx(Pg.Fragment, {
        children: "Source:"
      });
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== n.source) {
      m = Onc(n.source);
      t[12] = n.source;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== m) {
      f = Pg.jsxs(ih.Row, {
        children: [p, Pg.jsx(Text, {
          dimColor: true,
          children: m
        })]
      });
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    let h;
    if (t[16] !== n.pluginName) {
      h = n.pluginName && Pg.jsxs(ih.Row, {
        children: [Pg.jsx(Pg.Fragment, {
          children: "Plugin:"
        }), Pg.jsx(Text, {
          dimColor: true,
          children: n.pluginName
        })]
      });
      t[16] = n.pluginName;
      t[17] = h;
    } else {
      h = t[17];
    }
    let g;
    if (t[18] !== n.config) {
      g = "statusMessage" in n.config && n.config.statusMessage && Pg.jsxs(ih.Row, {
        children: [Pg.jsx(Pg.Fragment, {
          children: "Status message:"
        }), Pg.jsx(Text, {
          dimColor: true,
          children: n.config.statusMessage
        })]
      });
      t[18] = n.config;
      t[19] = g;
    } else {
      g = t[19];
    }
    let y;
    if (t[20] !== f || t[21] !== h || t[22] !== g || t[23] !== l || t[24] !== c || t[25] !== d) {
      y = Pg.jsxs(ih, {
        box: "plain",
        columns: i,
        children: [l, c, d, f, h, g]
      });
      t[20] = f;
      t[21] = h;
      t[22] = g;
      t[23] = l;
      t[24] = c;
      t[25] = d;
      t[26] = y;
    } else {
      y = t[26];
    }
    let _;
    if (t[27] !== n.config) {
      _ = dtf(n.config);
      t[27] = n.config;
      t[28] = _;
    } else {
      _ = t[28];
    }
    let b;
    if (t[29] !== _) {
      b = Pg.jsxs(Text, {
        dimColor: true,
        children: [_, ":"]
      });
      t[29] = _;
      t[30] = b;
    } else {
      b = t[30];
    }
    let S;
    if (t[31] !== n.config) {
      S = mCe(n.config);
      t[31] = n.config;
      t[32] = S;
    } else {
      S = t[32];
    }
    let E;
    if (t[33] !== S) {
      E = Pg.jsx(gXd, {
        borderStyle: "round",
        borderDimColor: true,
        paddingLeft: 1,
        paddingRight: 1,
        children: Pg.jsx(Text, {
          children: S
        })
      });
      t[33] = S;
      t[34] = E;
    } else {
      E = t[34];
    }
    let C;
    if (t[35] !== b || t[36] !== E) {
      C = Pg.jsxs(gXd, {
        flexDirection: "column",
        children: [b, E]
      });
      t[35] = b;
      t[36] = E;
      t[37] = C;
    } else {
      C = t[37];
    }
    let x;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      x = Pg.jsx(Text, {
        dimColor: true,
        children: "To modify or remove this hook, edit settings.json directly or ask Claude to help."
      });
      t[38] = x;
    } else {
      x = t[38];
    }
    let A;
    if (t[39] !== y || t[40] !== C) {
      A = Pg.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [y, C, x]
      });
      t[39] = y;
      t[40] = C;
      t[41] = A;
    } else {
      A = t[41];
    }
    let k;
    if (t[42] !== o || t[43] !== A) {
      k = Pg.jsx(or, {
        title: "Hook details",
        onCancel: o,
        inputGuide: s,
        children: A
      });
      t[42] = o;
      t[43] = A;
      t[44] = k;
    } else {
      k = t[44];
    }
    return k;
  }
  function dtf(e) {
    switch (e.type) {
      case "command":
        return "Command";
      case "prompt":
        return "Prompt";
      case "agent":
        return "Prompt";
      case "http":
        return "URL";
      case "mcp_tool":
        return "MCP tool";
    }
  }
  var Knc;
  var Pg;
  var Jnc = __lazy(() => {
    et();
    dCt();
    Ii();
    bs();
    oYe();
    Knc = __toESM(pt(), 1);
    Pg = __toESM(ie(), 1);
  });
  function Qnc(e) {
    let t = Xnc.c(102);
    let {
      toolNames: n,
      onExit: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        mode: "select-event"
      };
      t[0] = o;
    } else {
      o = t[0];
    }
    let [s, i] = cur.useState(o);
    let [a, l] = cur.useState(gtf);
    let [c, u] = cur.useState(htf);
    let d;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      d = ee => {
        if (ee === "policySettings") {
          let se = getInitialSettings()?.disableAllHooks === true;
          l(se && getSettingsForSource("policySettings")?.disableAllHooks === true);
          u(getSettingsForSource("policySettings")?.allowManagedHooksOnly === true);
        }
      };
      t[1] = d;
    } else {
      d = t[1];
    }
    Agt(d);
    let p = s.mode;
    let m = "event" in s ? s.event : "PreToolUse";
    let f = "matcher" in s ? s.matcher : null;
    let h = bt(ftf);
    let g = Ec();
    let y;
    if (t[2] !== h.tools || t[3] !== n) {
      y = [...n, ...h.tools.map(mtf)];
      t[2] = h.tools;
      t[3] = n;
      t[4] = y;
    } else {
      y = t[4];
    }
    let _ = y;
    let b;
    if (t[5] !== g || t[6] !== _) {
      b = Nnc(g.getState(), _);
      t[5] = g;
      t[6] = _;
      t[7] = b;
    } else {
      b = t[7];
    }
    let S = b;
    let E;
    if (t[8] !== S || t[9] !== m) {
      E = Lnc(S, m);
      t[8] = S;
      t[9] = m;
      t[10] = E;
    } else {
      E = t[10];
    }
    let C = E;
    let x;
    if (t[11] !== S || t[12] !== m || t[13] !== f) {
      x = Fnc(S, m, f);
      t[11] = S;
      t[12] = m;
      t[13] = f;
      t[14] = x;
    } else {
      x = t[14];
    }
    let A = x;
    let k;
    if (t[15] !== r) {
      k = () => {
        r("Hooks dialog dismissed", {
          display: "system"
        });
      };
      t[15] = r;
      t[16] = k;
    } else {
      k = t[16];
    }
    let I = k;
    let O = p === "select-event";
    let M;
    if (t[17] !== O) {
      M = {
        context: "Confirmation",
        isActive: O
      };
      t[17] = O;
      t[18] = M;
    } else {
      M = t[18];
    }
    uo("confirm:no", I, M);
    let L;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      L = () => {
        i({
          mode: "select-event"
        });
      };
      t[19] = L;
    } else {
      L = t[19];
    }
    let P = p === "select-matcher";
    let F;
    if (t[20] !== P) {
      F = {
        context: "Confirmation",
        isActive: P
      };
      t[20] = P;
      t[21] = F;
    } else {
      F = t[21];
    }
    uo("confirm:no", L, F);
    let H;
    if (t[22] !== _ || t[23] !== s) {
      H = () => {
        if ("event" in s) {
          if (Oen(s.event, _) !== undefined) {
            i({
              mode: "select-matcher",
              event: s.event
            });
          } else {
            i({
              mode: "select-event"
            });
          }
        }
      };
      t[22] = _;
      t[23] = s;
      t[24] = H;
    } else {
      H = t[24];
    }
    let U = p === "select-hook";
    let N;
    if (t[25] !== U) {
      N = {
        context: "Confirmation",
        isActive: U
      };
      t[25] = U;
      t[26] = N;
    } else {
      N = t[26];
    }
    uo("confirm:no", H, N);
    let W;
    if (t[27] !== s) {
      W = () => {
        if (s.mode === "view-hook") {
          let {
            event: ee,
            hook: re
          } = s;
          i({
            mode: "select-hook",
            event: ee,
            matcher: re.matcher || ""
          });
        }
      };
      t[27] = s;
      t[28] = W;
    } else {
      W = t[28];
    }
    let j = p === "view-hook";
    let z;
    if (t[29] !== j) {
      z = {
        context: "Confirmation",
        isActive: j
      };
      t[29] = j;
      t[30] = z;
    } else {
      z = t[30];
    }
    uo("confirm:no", W, z);
    let V;
    if (t[31] !== _) {
      V = lur(_);
      t[31] = _;
      t[32] = V;
    } else {
      V = t[32];
    }
    let K = V;
    let Q = getInitialSettings()?.disableAllHooks === true;
    let Z;
    if (t[33] !== S) {
      let ee = {};
      let re = 0;
      for (let [se, ae] of Object.entries(S)) {
        let de = Object.values(ae).reduce(ptf, 0);
        ee[se] = de;
        re = re + de;
      }
      Z = {
        hooksByEvent: ee,
        totalHooksCount: re
      };
      t[33] = S;
      t[34] = Z;
    } else {
      Z = t[34];
    }
    let {
      hooksByEvent: ne,
      totalHooksCount: oe
    } = Z;
    if (Q) {
      let ee;
      if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
        ee = eN.jsx(xt, {
          chord: "escape",
          action: "close"
        });
        t[35] = ee;
      } else {
        ee = t[35];
      }
      let re;
      if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
        re = eN.jsx(Text, {
          bold: true,
          children: "disabled"
        });
        t[36] = re;
      } else {
        re = t[36];
      }
      let se = a && " by a managed settings file";
      let ae;
      if (t[37] !== oe) {
        ae = eN.jsx(Text, {
          bold: true,
          children: oe
        });
        t[37] = oe;
        t[38] = ae;
      } else {
        ae = t[38];
      }
      let de;
      if (t[39] !== oe) {
        de = un(oe, "hook");
        t[39] = oe;
        t[40] = de;
      } else {
        de = t[40];
      }
      let be;
      if (t[41] !== oe) {
        be = un(oe, "is", "are");
        t[41] = oe;
        t[42] = be;
      } else {
        be = t[42];
      }
      let fe;
      if (t[43] !== se || t[44] !== ae || t[45] !== de || t[46] !== be) {
        fe = eN.jsxs(Text, {
          children: ["All hooks are currently ", re, se, ". You have", " ", ae, " configured", " ", de, " that", " ", be, " not running."]
        });
        t[43] = se;
        t[44] = ae;
        t[45] = de;
        t[46] = be;
        t[47] = fe;
      } else {
        fe = t[47];
      }
      let me;
      let Te;
      let ue;
      let ce;
      if (t[48] === Symbol.for("react.memo_cache_sentinel")) {
        me = eN.jsx(gXd, {
          marginTop: 1,
          children: eN.jsx(Text, {
            dimColor: true,
            children: "When hooks are disabled:"
          })
        });
        Te = eN.jsx(Text, {
          dimColor: true,
          children: "\xB7 No hook commands will execute"
        });
        ue = eN.jsx(Text, {
          dimColor: true,
          children: "\xB7 StatusLine will not be displayed"
        });
        ce = eN.jsx(Text, {
          dimColor: true,
          children: "\xB7 Tool operations will proceed without hook validation"
        });
        t[48] = me;
        t[49] = Te;
        t[50] = ue;
        t[51] = ce;
      } else {
        me = t[48];
        Te = t[49];
        ue = t[50];
        ce = t[51];
      }
      let le;
      if (t[52] !== fe) {
        le = eN.jsxs(gXd, {
          flexDirection: "column",
          children: [fe, me, Te, ue, ce]
        });
        t[52] = fe;
        t[53] = le;
      } else {
        le = t[53];
      }
      let pe;
      if (t[54] !== a) {
        pe = !a && eN.jsx(Text, {
          dimColor: true,
          children: 'To re-enable hooks, remove "disableAllHooks" from settings.json or ask Claude.'
        });
        t[54] = a;
        t[55] = pe;
      } else {
        pe = t[55];
      }
      let ve;
      if (t[56] !== le || t[57] !== pe) {
        ve = eN.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [le, pe]
        });
        t[56] = le;
        t[57] = pe;
        t[58] = ve;
      } else {
        ve = t[58];
      }
      let _e;
      if (t[59] !== I || t[60] !== ve) {
        _e = eN.jsx(or, {
          title: "Hook configuration \xB7 disabled",
          onCancel: I,
          inputGuide: ee,
          children: ve
        });
        t[59] = I;
        t[60] = ve;
        t[61] = _e;
      } else {
        _e = t[61];
      }
      return _e;
    }
    switch (s.mode) {
      case "select-event":
        {
          let ee;
          if (t[62] === Symbol.for("react.memo_cache_sentinel")) {
            ee = Ql() ? {
              exitHint: UR(),
              managedHooksStillApply: Klr()
            } : undefined;
            t[62] = ee;
          } else {
            ee = t[62];
          }
          let re;
          if (t[63] !== _) {
            re = ae => {
              if (Oen(ae, _) !== undefined) {
                i({
                  mode: "select-matcher",
                  event: ae
                });
              } else {
                i({
                  mode: "select-hook",
                  event: ae,
                  matcher: ""
                });
              }
            };
            t[63] = _;
            t[64] = re;
          } else {
            re = t[64];
          }
          let se;
          if (t[65] !== I || t[66] !== K || t[67] !== ne || t[68] !== c || t[69] !== re || t[70] !== oe) {
            se = eN.jsx($nc, {
              hookEventMetadata: K,
              hooksByEvent: ne,
              totalHooksCount: oe,
              restrictedByPolicy: c,
              suspendedBySafeMode: ee,
              onSelectEvent: re,
              onCancel: I
            });
            t[65] = I;
            t[66] = K;
            t[67] = ne;
            t[68] = c;
            t[69] = re;
            t[70] = oe;
            t[71] = se;
          } else {
            se = t[71];
          }
          return se;
        }
      case "select-matcher":
        {
          let ee = K[s.event];
          let re;
          if (t[72] !== s.event) {
            re = de => {
              i({
                mode: "select-hook",
                event: s.event,
                matcher: de
              });
            };
            t[72] = s.event;
            t[73] = re;
          } else {
            re = t[73];
          }
          let se;
          if (t[74] === Symbol.for("react.memo_cache_sentinel")) {
            se = () => {
              i({
                mode: "select-event"
              });
            };
            t[74] = se;
          } else {
            se = t[74];
          }
          let ae;
          if (t[75] !== S || t[76] !== s.event || t[77] !== C || t[78] !== ee.description || t[79] !== re) {
            ae = eN.jsx(Vnc, {
              selectedEvent: s.event,
              matchersForSelectedEvent: C,
              hooksByEventAndMatcher: S,
              eventDescription: ee.description,
              onSelect: re,
              onCancel: se
            });
            t[75] = S;
            t[76] = s.event;
            t[77] = C;
            t[78] = ee.description;
            t[79] = re;
            t[80] = ae;
          } else {
            ae = t[80];
          }
          return ae;
        }
      case "select-hook":
        {
          let ee = K[s.event];
          let re;
          if (t[81] !== s.event) {
            re = de => {
              i({
                mode: "view-hook",
                event: s.event,
                hook: de
              });
            };
            t[81] = s.event;
            t[82] = re;
          } else {
            re = t[82];
          }
          let se;
          if (t[83] !== _ || t[84] !== s.event) {
            se = () => {
              if (Oen(s.event, _) !== undefined) {
                i({
                  mode: "select-matcher",
                  event: s.event
                });
              } else {
                i({
                  mode: "select-event"
                });
              }
            };
            t[83] = _;
            t[84] = s.event;
            t[85] = se;
          } else {
            se = t[85];
          }
          let ae;
          if (t[86] !== A || t[87] !== s.event || t[88] !== s.matcher || t[89] !== ee || t[90] !== re || t[91] !== se) {
            ae = eN.jsx(qnc, {
              selectedEvent: s.event,
              selectedMatcher: s.matcher,
              hooksForSelectedMatcher: A,
              hookEventMetadata: ee,
              onSelect: re,
              onCancel: se
            });
            t[86] = A;
            t[87] = s.event;
            t[88] = s.matcher;
            t[89] = ee;
            t[90] = re;
            t[91] = se;
            t[92] = ae;
          } else {
            ae = t[92];
          }
          return ae;
        }
      case "view-hook":
        {
          let ee = s.hook;
          let re;
          if (t[93] !== _ || t[94] !== s.event) {
            re = Oen(s.event, _);
            t[93] = _;
            t[94] = s.event;
            t[95] = re;
          } else {
            re = t[95];
          }
          let se = re !== undefined;
          let ae;
          if (t[96] !== s) {
            ae = () => {
              let {
                event: be,
                hook: fe
              } = s;
              i({
                mode: "select-hook",
                event: be,
                matcher: fe.matcher || ""
              });
            };
            t[96] = s;
            t[97] = ae;
          } else {
            ae = t[97];
          }
          let de;
          if (t[98] !== s.hook || t[99] !== se || t[100] !== ae) {
            de = eN.jsx(Ync, {
              selectedHook: ee,
              eventSupportsMatcher: se,
              onCancel: ae
            });
            t[98] = s.hook;
            t[99] = se;
            t[100] = ae;
            t[101] = de;
          } else {
            de = t[101];
          }
          return de;
        }
    }
  }
  function ptf(e, t) {
    return e + t.length;
  }
  function mtf(e) {
    return e.name;
  }
  function ftf(e) {
    return e.mcp;
  }
  function htf() {
    return getSettingsForSource("policySettings")?.allowManagedHooksOnly === true;
  }
  function gtf() {
    return getInitialSettings()?.disableAllHooks === true && getSettingsForSource("policySettings")?.disableAllHooks === true;
  }
  var Xnc;
  var cur;
  var eN;
  var Znc = __lazy(() => {
    ho();
    F5n();
    et();
    Bs();
    gn();
    Unc();
    rGo();
    Zn();
    Ii();
    bs();
    Hnc();
    Wnc();
    znc();
    Jnc();
    Xnc = __toESM(pt(), 1);
    cur = __toESM(ot(), 1);
    eN = __toESM(ie(), 1);
  });
  var erc = {};
  __export(erc, {
    call: () => call_export63
  });
  var trc;
  var call_export63 = async (e, t) => {
    logEvent("tengu_hooks_command", {});
    let n = getToolPermissionContext(t);
    let r = fH(n).map(o => o.name);
    return trc.jsx(Qnc, {
      toolNames: r,
      onExit: e
    });
  };
  var nrc = __lazy(() => {
    Znc();
    Ot();
    jM();
    Sl();
    trc = __toESM(ie(), 1);
  });
  var _tf;
  function irc(e, t) {
    return e.length > t ? e.slice(0, t - 1) + "\u2026" : e;
  }
  function arc(e) {
    let t = i5o.c(93);
    let {
      loops: n,
      onDelete: r,
      onCreate: o,
      onCancel: s
    } = e;
    let [i, a] = fCe.useState("list");
    let [l, c] = fCe.useState(0);
    let [u, d] = fCe.useState("every");
    let [p, m] = fCe.useState("10m");
    let [f, h] = fCe.useState(3);
    let [g, y] = fCe.useState("");
    let [_, b] = fCe.useState(0);
    let [S, E] = fCe.useState(u === "every" ? "interval" : "text");
    let {
      columns: C
    } = Sr();
    let x;
    if (t[0] !== n.length) {
      x = {
        "select:previous": () => c(gt => n.length ? Math.max(0, gt - 1) : 0),
        "select:next": () => c(gt => n.length ? Math.min(n.length - 1, gt + 1) : 0)
      };
      t[0] = n.length;
      t[1] = x;
    } else {
      x = t[1];
    }
    let A = i === "list";
    let k;
    if (t[2] !== A) {
      k = {
        context: "Select",
        isActive: A
      };
      t[2] = A;
      t[3] = k;
    } else {
      k = t[3];
    }
    jo(x, k);
    let I;
    if (t[4] !== n || t[5] !== u || t[6] !== s || t[7] !== r || t[8] !== l || t[9] !== i) {
      I = gt => {
        if (i !== "list") {
          return;
        }
        if (gt.key === "escape") {
          gt.preventDefault();
          s();
          return;
        }
        if (gt.key === "d" && n[l]) {
          gt.preventDefault();
          r(n[l]);
          c(Ft => Math.max(0, Math.min(Ft, n.length - 2)));
          return;
        }
        if (gt.key === "n") {
          gt.preventDefault();
          a("create");
          E(u === "every" ? "interval" : "text");
        }
      };
      t[4] = n;
      t[5] = u;
      t[6] = s;
      t[7] = r;
      t[8] = l;
      t[9] = i;
      t[10] = I;
    } else {
      I = t[10];
    }
    let O = I;
    let M;
    if (t[11] !== u) {
      M = () => {
        let gt = u === "every" ? "until" : "every";
        d(gt);
        E(gt === "every" ? "interval" : "text");
      };
      t[11] = u;
      t[12] = M;
    } else {
      M = t[12];
    }
    let L = M;
    let P;
    if (t[13] !== S || t[14] !== p || t[15] !== f || t[16] !== u || t[17] !== g.length || t[18] !== _ || t[19] !== L || t[20] !== i) {
      P = gt => {
        if (i !== "create") {
          return;
        }
        if (gt.key === "escape") {
          gt.preventDefault();
          a("list");
          return;
        }
        if (gt.key === "tab") {
          gt.preventDefault();
          L();
          return;
        }
        let Ft = S === "interval" ? f : _;
        let on = S === "interval" ? p.length : g.length;
        if (gt.key === "left" && Ft === 0 || gt.key === "right" && Ft >= on) {
          gt.preventDefault();
          L();
          return;
        }
        if (u === "every" && (gt.key === "down" || gt.key === "up")) {
          gt.preventDefault();
          E(btf);
        }
      };
      t[13] = S;
      t[14] = p;
      t[15] = f;
      t[16] = u;
      t[17] = g.length;
      t[18] = _;
      t[19] = L;
      t[20] = i;
      t[21] = P;
    } else {
      P = t[21];
    }
    let F = P;
    let H;
    if (t[22] !== p || t[23] !== u || t[24] !== o || t[25] !== g) {
      H = function () {
        let Ft = g.trim();
        if (u === "every") {
          if (!p.trim() || !Ft) {
            return;
          }
          o({
            kind: "cron",
            interval: p.trim(),
            prompt: Ft
          });
        } else {
          if (!Ft) {
            return;
          }
          o({
            kind: "stophook",
            condition: Ft
          });
        }
      };
      t[22] = p;
      t[23] = u;
      t[24] = o;
      t[25] = g;
      t[26] = H;
    } else {
      H = t[26];
    }
    let U = H;
    let N;
    if (t[27] !== n.length) {
      N = n.length > 0 && ig.jsx(xt, {
        chord: ["up", "down"],
        action: "select"
      });
      t[27] = n.length;
      t[28] = N;
    } else {
      N = t[28];
    }
    let W;
    if (t[29] !== n.length) {
      W = n.length > 0 && ig.jsx(xt, {
        chord: "d",
        action: "delete"
      });
      t[29] = n.length;
      t[30] = W;
    } else {
      W = t[30];
    }
    let j;
    let z;
    if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
      j = ig.jsx(xt, {
        chord: "n",
        action: "add"
      });
      z = ig.jsx(xt, {
        chord: "escape",
        action: "close"
      });
      t[31] = j;
      t[32] = z;
    } else {
      j = t[31];
      z = t[32];
    }
    let V;
    if (t[33] !== N || t[34] !== W) {
      V = ig.jsxs(Hn, {
        children: [N, W, j, z]
      });
      t[33] = N;
      t[34] = W;
      t[35] = V;
    } else {
      V = t[35];
    }
    let K = V;
    let J;
    if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
      J = ig.jsx(xt, {
        chord: "tab",
        action: "switch mode"
      });
      t[36] = J;
    } else {
      J = t[36];
    }
    let Q;
    if (t[37] !== u) {
      Q = u === "every" && ig.jsx(xt, {
        chord: ["up", "down"],
        action: "next field"
      });
      t[37] = u;
      t[38] = Q;
    } else {
      Q = t[38];
    }
    let Z;
    let ne;
    if (t[39] === Symbol.for("react.memo_cache_sentinel")) {
      Z = ig.jsx(xt, {
        chord: "enter",
        action: "create"
      });
      ne = ig.jsx(xt, {
        chord: "escape",
        action: "back"
      });
      t[39] = Z;
      t[40] = ne;
    } else {
      Z = t[39];
      ne = t[40];
    }
    let oe;
    if (t[41] !== Q) {
      oe = ig.jsxs(Hn, {
        children: [J, Q, Z, ne]
      });
      t[41] = Q;
      t[42] = oe;
    } else {
      oe = t[42];
    }
    let ee = oe;
    let re = u !== "every";
    let se = u === "every" ? vGd.radioOn : vGd.radioOff;
    let ae;
    if (t[43] !== re || t[44] !== se) {
      ae = ig.jsxs(Text, {
        dimColor: re,
        children: [se, " every"]
      });
      t[43] = re;
      t[44] = se;
      t[45] = ae;
    } else {
      ae = t[45];
    }
    let de;
    if (t[46] === Symbol.for("react.memo_cache_sentinel")) {
      de = ig.jsx(Text, {
        dimColor: true,
        children: "  "
      });
      t[46] = de;
    } else {
      de = t[46];
    }
    let be = u !== "until";
    let fe = u === "until" ? vGd.radioOn : vGd.radioOff;
    let me;
    if (t[47] !== be || t[48] !== fe) {
      me = ig.jsxs(Text, {
        dimColor: be,
        children: [fe, " until"]
      });
      t[47] = be;
      t[48] = fe;
      t[49] = me;
    } else {
      me = t[49];
    }
    let Te;
    if (t[50] !== ae || t[51] !== me) {
      Te = ig.jsxs(Text, {
        children: [ae, de, me]
      });
      t[50] = ae;
      t[51] = me;
      t[52] = Te;
    } else {
      Te = t[52];
    }
    let ue;
    if (t[53] !== S || t[54] !== p || t[55] !== f || t[56] !== u) {
      ue = u === "every" && ig.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginTop: 1,
        children: [ig.jsx(Text, {
          dimColor: S !== "interval",
          children: "Interval >"
        }), ig.jsx(Dl, {
          value: p,
          onChange: m,
          onSubmit: () => E("text"),
          focus: S === "interval",
          showCursor: S === "interval",
          multiline: false,
          columns: 12,
          cursorOffset: f,
          onChangeCursorOffset: h,
          placeholder: "10m",
          disableEscapeDoublePress: true
        })]
      });
      t[53] = S;
      t[54] = p;
      t[55] = f;
      t[56] = u;
      t[57] = ue;
    } else {
      ue = t[57];
    }
    let ce = u === "every" && S !== "text";
    let le = u === "every" ? "Prompt   >" : "Condition>";
    let pe;
    if (t[58] !== ce || t[59] !== le) {
      pe = ig.jsx(Text, {
        dimColor: ce,
        children: le
      });
      t[58] = ce;
      t[59] = le;
      t[60] = pe;
    } else {
      pe = t[60];
    }
    let ve = u === "until" || S === "text";
    let _e = u === "until" || S === "text";
    let xe = C - 16;
    let ke = u === "every" ? "e.g. /babysit-prs" : "e.g. tests pass and PR is merged";
    let Ie;
    if (t[61] !== U || t[62] !== ve || t[63] !== _e || t[64] !== xe || t[65] !== ke || t[66] !== g || t[67] !== _) {
      Ie = ig.jsx(Dl, {
        value: g,
        onChange: y,
        onSubmit: U,
        focus: ve,
        showCursor: _e,
        multiline: false,
        columns: xe,
        cursorOffset: _,
        onChangeCursorOffset: b,
        placeholder: ke,
        disableEscapeDoublePress: true
      });
      t[61] = U;
      t[62] = ve;
      t[63] = _e;
      t[64] = xe;
      t[65] = ke;
      t[66] = g;
      t[67] = _;
      t[68] = Ie;
    } else {
      Ie = t[68];
    }
    let Ue;
    if (t[69] !== pe || t[70] !== Ie) {
      Ue = ig.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginTop: 1,
        children: [pe, Ie]
      });
      t[69] = pe;
      t[70] = Ie;
      t[71] = Ue;
    } else {
      Ue = t[71];
    }
    let Ge;
    if (t[72] !== Te || t[73] !== ue || t[74] !== Ue) {
      Ge = ig.jsxs(gXd, {
        flexDirection: "column",
        children: [Te, ue, Ue]
      });
      t[72] = Te;
      t[73] = ue;
      t[74] = Ue;
      t[75] = Ge;
    } else {
      Ge = t[75];
    }
    let Be = Ge;
    let We;
    if (t[76] !== n || t[77] !== l) {
      We = n.length === 0 ? ig.jsx(sc, {
        children: "No active loops"
      }) : n.map((gt, Ft) => ig.jsx(Stf, {
        loop: gt,
        focused: Ft === l
      }, gt.id));
      t[76] = n;
      t[77] = l;
      t[78] = We;
    } else {
      We = t[78];
    }
    let Ze;
    if (t[79] !== We) {
      Ze = ig.jsx(gXd, {
        flexDirection: "column",
        children: We
      });
      t[79] = We;
      t[80] = Ze;
    } else {
      Ze = t[80];
    }
    let Tt = Ze;
    let kt = i === "list" ? O : F;
    let Ye = i === "list" ? "Loops" : "New loop";
    let ht = i === "list" ? "Recurring crons and stop-hooks active for this session" : undefined;
    let It;
    if (t[81] !== s || t[82] !== i) {
      It = i === "list" ? s : () => a("list");
      t[81] = s;
      t[82] = i;
      t[83] = It;
    } else {
      It = t[83];
    }
    let Rt = i === "list" ? K : ee;
    let wt = i === "list" ? Tt : Be;
    let vt;
    if (t[84] !== Ye || t[85] !== ht || t[86] !== It || t[87] !== Rt || t[88] !== wt) {
      vt = ig.jsx(or, {
        title: Ye,
        subtitle: ht,
        color: "permission",
        onCancel: It,
        isCancelActive: false,
        inputGuide: Rt,
        children: wt
      });
      t[84] = Ye;
      t[85] = ht;
      t[86] = It;
      t[87] = Rt;
      t[88] = wt;
      t[89] = vt;
    } else {
      vt = t[89];
    }
    let yt;
    if (t[90] !== kt || t[91] !== vt) {
      yt = ig.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: kt,
        children: vt
      });
      t[90] = kt;
      t[91] = vt;
      t[92] = yt;
    } else {
      yt = t[92];
    }
    return yt;
  }
  function btf(e) {
    return e === "interval" ? "text" : "interval";
  }
  function Stf(e) {
    let t = i5o.c(24);
    let {
      loop: n,
      focused: r
    } = e;
    if (n.kind === "cron") {
      let c;
      if (t[0] !== n.human) {
        c = ig.jsx(Text, {
          bold: true,
          children: n.human
        });
        t[0] = n.human;
        t[1] = c;
      } else {
        c = t[1];
      }
      let u;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        u = ig.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        });
        t[2] = u;
      } else {
        u = t[2];
      }
      let d;
      if (t[3] !== n.prompt) {
        d = irc(n.prompt, 50);
        t[3] = n.prompt;
        t[4] = d;
      } else {
        d = t[4];
      }
      let p;
      if (t[5] !== n.id) {
        p = ig.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", n.id]
        });
        t[5] = n.id;
        t[6] = p;
      } else {
        p = t[6];
      }
      let m;
      if (t[7] !== c || t[8] !== d || t[9] !== p) {
        m = ig.jsxs(Text, {
          children: [c, u, d, p]
        });
        t[7] = c;
        t[8] = d;
        t[9] = p;
        t[10] = m;
      } else {
        m = t[10];
      }
      let f;
      if (t[11] !== r || t[12] !== m) {
        f = ig.jsx(_v, {
          isFocused: r,
          children: m
        });
        t[11] = r;
        t[12] = m;
        t[13] = f;
      } else {
        f = t[13];
      }
      return f;
    }
    let o;
    if (t[14] !== n.condition) {
      o = irc(n.condition, 50);
      t[14] = n.condition;
      t[15] = o;
    } else {
      o = t[15];
    }
    let s;
    if (t[16] !== o) {
      s = ig.jsx(Text, {
        bold: true,
        children: o
      });
      t[16] = o;
      t[17] = s;
    } else {
      s = t[17];
    }
    let i;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      i = ig.jsx(Text, {
        dimColor: true,
        children: " \xB7 stop-hook"
      });
      t[18] = i;
    } else {
      i = t[18];
    }
    let a;
    if (t[19] !== s) {
      a = ig.jsxs(Text, {
        children: ["goal: ", s, i]
      });
      t[19] = s;
      t[20] = a;
    } else {
      a = t[20];
    }
    let l;
    if (t[21] !== r || t[22] !== a) {
      l = ig.jsx(_v, {
        isFocused: r,
        children: a
      });
      t[21] = r;
      t[22] = a;
      t[23] = l;
    } else {
      l = t[23];
    }
    return l;
  }
  var i5o;
  var fCe;
  var ig;
  var lrc = __lazy(() => {
    ki();
    et();
    Bs();
    Ai();
    Ii();
    xb();
    bs();
    Mue();
    q_();
    i5o = __toESM(pt(), 1);
    fCe = __toESM(ot(), 1);
    ig = __toESM(ie(), 1);
  });
  var crc = {};
  __export(crc, {
    call: () => call_export64
  });
  function Etf(e) {
    let t = e.match(Ttf);
    if (!t) {
      return null;
    }
    let n = parseInt(t[1], 10);
    if (n < 1) {
      return null;
    }
    let r;
    switch (t[2].toLowerCase()) {
      case "s":
        r = `*/${Math.max(1, Math.ceil(n / 60))} * * * *`;
        break;
      case "m":
        r = n <= 59 ? `*/${n} * * * *` : `0 */${Math.round(n / 60)} * * *`;
        break;
      case "h":
        if (n > 23) {
          return null;
        }
        r = `0 */${n} * * *`;
        break;
      case "d":
        if (n > 31) {
          return null;
        }
        r = `0 0 */${n} * *`;
        break;
      default:
        return null;
    }
    return lU(r) ? r : null;
  }
  var urc;
  var Ttf;
  var call_export64 = async (e, t) => {
    logEvent("tengu_loops_command", {});
    let n = await yde();
    let r = IEt(t.getAppState(), getSessionId());
    let o = [...n.map(a => ({
      kind: "cron",
      id: a.id,
      cron: a.cron,
      human: A1(a.cron),
      prompt: a.prompt
    })), ...r.map((a, l) => ({
      kind: "stophook",
      id: `stophook-${l}`,
      condition: a.prompt
    }))];
    async function s(a) {
      if (a.kind === "cron") {
        try {
          await gde([a.id]);
          e(`Loop ${a.id} deleted`, {
            display: "system"
          });
        } catch (c) {
          e(`Failed to delete loop ${a.id}: ${c}`, {
            display: "system"
          });
        }
        return;
      }
      let l = OEt(t);
      e(l === null ? "Stop hook not found" : "Stop hook cleared", {
        display: "system"
      });
    }
    async function i(a) {
      if (a.kind === "cron") {
        let c = Etf(a.interval);
        if (!c) {
          e(`Invalid interval: ${a.interval}`, {
            display: "system"
          });
          return;
        }
        let u = await Ldt(c, a.prompt, true, false);
        e(`Loop ${u} created (${A1(c)})`, {
          display: "system"
        });
        return;
      }
      let l = PEt(a.condition, t);
      e(l ?? "Stop hook set", {
        display: "system"
      });
    }
    return urc.jsx(arc, {
      loops: o,
      onDelete: a => void s(a),
      onCreate: a => void i(a),
      onCancel: () => e("", {
        display: "skip"
      })
    });
  };
  var drc = __lazy(() => {
    at();
    lrc();
    Ot();
    vX();
    vV();
    _7e();
    urc = __toESM(ie(), 1);
    Ttf = /^(\d+)([smhd])$/i;
  });
  var wtf;
  var Ctf;
  var grc = {};
  __export(grc, {
    call: () => call_export65
  });
  var call_export65 = async (e, t, n) => {
    let r = n.trim();
    if (!r) {
      e("Usage: /fork \\<directive\\>", {
        display: "system"
      });
      return null;
    }
    let o = await spawnForkFromDirective(r, t, t.canUseTool ?? hasPermissionsToUseTool);
    if (!o) {
      e(eR() ? "Forking is not available in coordinator sessions. Use /branch instead." : "Cannot fork before the first conversation turn", {
        display: "system"
      });
      return null;
    }
    e(`${"\u2442"} forked ${o.name} (${o.agentId.slice(-4)})`, {
      display: "system"
    });
    return null;
  };
  var yrc = __lazy(() => {
    wl();
    RV();
    tHo();
    oy();
  });
  var _rc;
  var brc = __lazy(() => {
    RV();
    _rc = {
      type: "local-jsx",
      name: "fork",
      description: "Spawn a background agent that inherits the full conversation",
      argumentHint: "<directive>",
      isEnabled: () => !eR(),
      load: () => Promise.resolve().then(() => (yrc(), grc))
    };
  });
  var xtf = async () => ({
    type: "text",
    value: `The /agents wizard has been removed.

Ask Claude to create or update subagents for you (e.g. "create a code-reviewer subagent that ..."),
or edit the files directly:
  \u2022 .claude/agents/       (this project)
  \u2022 ~/.claude/agents/     (all projects)

Docs: ${"https://code.claude.com/docs/en/sub-agents"}`
  });
  var ktf;
  var Erc = {};
  __export(Erc, {
    call: () => call_export66
  });
  async function call_export66(e, t, n) {
    return vrc.jsx(wVl, {
      onComplete: e,
      args: n,
      commands: t.options.commands,
      getSessionContext: () => D6l(t.messages, t.readFileState)
    });
  }
  var vrc;
  var wrc = __lazy(() => {
    twt();
    olr();
    vrc = __toESM(ie(), 1);
  });
  var Crc = {};
  __export(Crc, {
    getPluginArgumentCompletions: () => getPluginArgumentCompletions
  });
  async function getPluginArgumentCompletions(e, t) {
    if (e.length === 0) {
      return pCt([{
        value: "list",
        description: "List installed plugins",
        isFinal: true
      }, {
        value: "enable",
        description: "Enable an installed plugin"
      }, {
        value: "disable",
        description: "Disable an installed plugin"
      }, {
        value: "install",
        description: "Install a plugin from a marketplace"
      }, {
        value: "uninstall",
        description: "Remove an installed plugin"
      }, {
        value: "marketplace",
        description: "Manage plugin marketplaces"
      }], t);
    }
    let n = e[0]?.toLowerCase();
    if (e.length === 1) {
      switch (n) {
        case "enable":
        case "disable":
        case "uninstall":
          {
            let r = Kw();
            let o = Object.entries(r.plugins).filter(([, i]) => i.some(gfe));
            if (n === "enable" || n === "disable") {
              let i = getPluginEditableScopes();
              let a = n === "disable";
              o = o.filter(([l]) => i.vZc(l) === a);
            }
            let s = o.map(([i, a]) => {
              let l = (a.find(gfe) ?? a[0])?.version;
              return {
                value: i,
                description: Ior(l),
                isFinal: true
              };
            }).sort((i, a) => i.value.localeCompare(a.value));
            return pCt(s, t);
          }
        case "install":
        case "i":
          {
            if (t.includes("/") || t.includes("\\")) {
              return [];
            }
            return pCt(await Dtf(), t);
          }
        case "list":
        case "ls":
          return pCt(Itf, t);
        case "marketplace":
        case "market":
          return pCt(Ptf, t);
        default:
          return [];
      }
    }
    if (e.length === 2 && (n === "marketplace" || n === "market")) {
      let r = e[1]?.toLowerCase();
      if (r === "remove" || r === "rm" || r === "update") {
        let o = await qM();
        let s = Object.entries(o).map(([i, a]) => ({
          value: i,
          description: N7e(a.source),
          isFinal: true
        })).sort((i, a) => i.value.localeCompare(a.value));
        return pCt(s, t);
      }
    }
    return [];
  }
  async function Dtf() {
    let e = await qM();
    let t = Object.keys(e).sort();
    let n = De(t.map(r => [r, e[r]?.installLocation, e[r]?.lastUpdated]));
    if (a5o?.key !== n) {
      let r = await Promise.all(t.map(async s => ({
        name: s,
        marketplace: await h5(s)
      })));
      let o = [];
      for (let {
        name: s,
        marketplace: i
      } of r) {
        if (!i) {
          continue;
        }
        for (let a of i.plugins) {
          o.push({
            pluginId: OZ(a.name, s),
            description: a.description
          });
        }
      }
      o.sort((s, i) => s.pluginId.localeCompare(i.pluginId));
      a5o = {
        key: n,
        candidates: o
      };
    }
    return a5o.candidates.filter(r => !qG(r.pluginId) && !isPluginBlockedByPolicy(r.pluginId)).map(r => ({
      value: r.pluginId,
      description: r.description,
      isFinal: true
    }));
  }
  function pCt(e, t) {
    if (!t) {
      return e;
    }
    let n = t.toLowerCase();
    let r = [];
    let o = [];
    for (let s of e) {
      let i = s.value.toLowerCase();
      if (i.startsWith(n)) {
        r.push(s);
      } else if (i.includes(n)) {
        o.push(s);
      }
    }
    return r.concat(o);
  }
  var Itf;
  var Ptf;
  var a5o = null;
  var Rrc = __lazy(() => {
    Qk();
    Cwe();
    yT();
    Xk();
    CYe();
    Itf = [{
      value: "--enabled",
      description: "Only show enabled plugins",
      isFinal: true
    }, {
      value: "--disabled",
      description: "Only show disabled plugins",
      isFinal: true
    }];
    Ptf = [{
      value: "add",
      description: "Add a marketplace from a URL or path"
    }, {
      value: "remove",
      description: "Remove a known marketplace"
    }, {
      value: "update",
      description: "Refresh a marketplace from its source"
    }, {
      value: "list",
      description: "List known marketplaces",
      isFinal: true
    }];
  });
  var Mtf;
  var Ntf;
  var LFT;
  var Arc = __lazy(() => {
    Ntf = ["enabledPlugins", "extraKnownMarketplaces"];
    LFT = new Set(Ntf);
  });
  var Ltf;
  var Ftf;
  var Irc = __lazy(() => {
    Ltf = we(() => v.object({
      entries: v.record(v.string(), v.string())
    }));
    Ftf = we(() => v.object({
      userId: v.string(),
      version: v.number(),
      lastModified: v.string(),
      checksum: v.string(),
      content: Ltf()
    }));
  });
  var l5o = __lazy(() => {
    at();
    Uc();
    no();
    bx();
    Zm();
    dt();
    na();
    Ds();
    Vgn();
    DA();
    ln();
    $n();
    Ot();
    r6e();
    bg();
    Kc();
    Arc();
    Irc();
  });
  var Prc = __lazy(() => {
    dt();
  });
  async function uur(e, t) {
    return 0;
  }
  var c5o = __lazy(() => {
    ln();
    wb();
    dt();
    SWt();
    Prc();
    TC();
  });
  async function hCe(e) {
    logForDebugging("refreshActivePlugins: clearing all plugin caches");
    BBl();
    Ag();
    E5a();
    let t = await loadAllPlugins();
    RIa();
    let [n, r] = await Promise.all([M7e(), getAgentDefinitionsWithOverrides(getOriginalCwd())]);
    let {
      enabled: o,
      disabled: s,
      errors: i,
      warnings: a
    } = t;
    let [l, c] = await Promise.all([Promise.all(o.map(async h => {
      if (h.mcpServers) {
        return Object.keys(h.mcpServers).length;
      }
      let g = await Doe(h, i);
      if (g) {
        h.mcpServers = g;
      }
      return g ? Object.keys(g).length : 0;
    })), Promise.all(o.map(async h => {
      if (h.lspServers) {
        return Object.keys(h.lspServers).length;
      }
      let g = await Y6e(h, i);
      if (g) {
        h.lspServers = g;
      }
      return g ? Object.keys(g).length : 0;
    }))]);
    let u = l.reduce((h, g) => h + g, 0);
    let d = c.reduce((h, g) => h + g, 0);
    await uur(o, i);
    let p = [...a, ...LGn(o)];
    e(h => ({
      ...h,
      plugins: {
        ...h.plugins,
        enabled: o,
        disabled: s,
        commands: n,
        errors: Utf(h.plugins.errors, i),
        warnings: Btf(h.plugins.warnings, p),
        needsRefresh: false
      },
      agentDefinitions: r,
      mcp: {
        ...h.mcp,
        pluginReconnectKey: h.mcp.pluginReconnectKey + 1
      }
    }));
    QGn();
    let m = false;
    try {
      await loadPluginHooks();
    } catch (h) {
      m = true;
      Oe(h);
      logForDebugging(`refreshActivePlugins: loadPluginHooks failed: ${he(h)}`);
    }
    let f = o.reduce((h, g) => {
      if (!g.hooksConfig) {
        return h;
      }
      return h + Object.values(g.hooksConfig).reduce((y, _) => y + (_?.reduce((b, S) => b + S.hooks.length, 0) ?? 0), 0);
    }, 0);
    g$.emit();
    logForDebugging(`refreshActivePlugins: ${o.length} enabled, ${n.length} commands, ${r.allAgents.length} agents, ${f} hooks, ${u} MCP, ${d} LSP`);
    return {
      enabled_count: o.length,
      disabled_count: s.length,
      command_count: n.length,
      agent_count: r.allAgents.length,
      hook_count: f,
      mcp_count: u,
      lsp_count: d,
      error_count: i.length + (m ? 1 : 0),
      errors: i,
      warnings: p,
      agentDefinitions: r,
      pluginCommands: n
    };
  }
  function Utf(e, t) {
    let n = e.filter(s => s.source === "lsp-manager" || s.source.startsWith("plugin:"));
    let r = new Set(t.map(Orc));
    return [...n.filter(s => !r.vZc(Orc(s))), ...t];
  }
  function Orc(e) {
    return e.type === "generic-error" ? `generic-error:${e.source}:${e.error}` : `${e.type}:${e.source}`;
  }
  function Btf(e, t) {
    let n = e.filter(s => s.source.startsWith("plugin:"));
    let r = new Set(t.map(s => `${s.type}:${s.source}`));
    return [...n.filter(s => !r.vZc(`${s.type}:${s.source}`)), ...t];
  }
  async function Drc(e) {
    let t = new Set(e.mcpClients.filter(l => l.config.pluginSource !== undefined).map(l => l.name));
    let n = await getConnectablePluginMcpServerNames(e.dynamicMcpConfig ?? {});
    let r = [...n].filter(l => !t.vZc(l)).sort();
    let o = [...t].filter(l => !n.vZc(l)).sort();
    let s = r.length > 0 || o.length > 0;
    let i = P1() && CX(e.model);
    let a = s && !i && getTotalOutputTokens() > 0;
    return {
      mcpServersAdded: r,
      mcpServersRemoved: o,
      toolSearchEnabled: i,
      wouldInvalidateCache: a
    };
  }
  function Mrc(e, t) {
    logEvent("tengu_reload_plugins_cache_impact", {
      mcp_changed: e.mcpServersAdded.length > 0 || e.mcpServersRemoved.length > 0,
      tool_search_on: e.toolSearchEnabled,
      warned: t.warned,
      forced: t.forced
    });
  }
  var dur = __lazy(() => {
    at();
    Ot();
    Tpe();
    Iw();
    kS();
    je();
    dt();
    Rn();
    U1();
    ODe();
    RX();
    p5();
    Qk();
    OXt();
    c5o();
    Y9e();
    q5t();
    sNe();
    T6t();
    xg();
  });
  var Nrc = {};
  __export(Nrc, {
    call: () => call_export67
  });
  function oee(e, t) {
    return `${e} ${un(e, t)}`;
  }
  function Htf(e) {
    let t = [...e.added, ...e.removed];
    let [n] = t;
    return `This reload changes MCP tools (${t.length === 1 && n !== undefined ? n.split(":").slice(2).join(":") || n : `${t.length} MCP servers`}) \u2014 your next message will re-read ` + "the whole conversation instead of using the cache. Run /reload-plugins --force to apply.";
  }
  var call_export67 = async (e, t) => {
    if (c_()) {
      let u = await Ul().sendControlRequest({
        subtype: "reload_plugins"
      });
      let p = `Reloaded on remote: ${[oee(u.plugins.length, "plugin"), oee(u.commands.length, "skill"), oee(u.agents.length, "agent"), oee(u.mcpServers.length, "plugin MCP server")].join(" \xB7 ")}`;
      if (u.error_count > 0) {
        p += `
${oee(u.error_count, "error")} during load. Run /doctor on the remote for details.`;
      }
      return {
        type: "text",
        value: p
      };
    }
    let n = e.trim().split(/\s+/).some(u => u === "--force" || u === "force");
    let r = await Drc({
      model: t.options.mainLoopModel,
      mcpClients: t.getAppState().mcp.clients,
      dynamicMcpConfig: t.options.dynamicMcpConfig
    });
    let o = r.wouldInvalidateCache && !n;
    if (Mrc(r, {
      warned: o,
      forced: n
    }), o) {
      return {
        type: "text",
        value: Htf({
          added: r.mcpServersAdded,
          removed: r.mcpServersRemoved
        })
      };
    }
    let s = await hCe(t.setAppState);
    let i = "";
    let a = await zwe(s.errors);
    if (a.installed.length > 0) {
      i = `${$ue(a.installed)} resolved`;
      s = await hCe(t.setAppState);
    }
    let c = `Reloaded: ${[oee(s.enabled_count, "plugin"), oee(s.command_count, "skill"), oee(s.agent_count, "agent"), oee(s.hook_count, "hook"), oee(s.mcp_count, "plugin MCP server"), oee(s.lsp_count, "plugin LSP server")].join(" \xB7 ")}${i}`;
    if (s.error_count > 0) {
      c += `
${oee(s.error_count, "error")} during load. Run /doctor for details.`;
    }
    return {
      type: "text",
      value: c
    };
  };
  var Lrc = __lazy(() => {
    at();
    ru();
    l5o();
    gn();
    MSe();
    EUe();
    dur();
    ode();
    Zn();
  });
  var jtf;
  var Urc = {};
  __export(Urc, {
    call: () => call_export68
  });
  var call_export68 = async (e, t) => {
    let n = Nt();
    let r = await getSkillToolCommands(n);
    let o = new Set(r.map(p => p.name));
    clearCommandsCache();
    resetSentSkillNames();
    let s = await getSkillToolCommands(n);
    let i = new Set(s.map(p => p.name));
    g$.emit();
    let a = Bn(s, p => !o.vZc(p.name));
    let l = Bn(r, p => !i.vZc(p.name));
    let c = [];
    if (a > 0) {
      c.push(`${a} added`);
    }
    if (l > 0) {
      c.push(`${l} removed`);
    }
    let u = c.length > 0 ? c.join(", ") : "no changes";
    let d = Ql() ? " (custom skills are disabled in safe mode)" : "";
    return {
      type: "text",
      value: `Reloaded skills: ${s.length} ${un(s.length, "skill")} available (${u})${d}`
    };
  };
  var Brc = __lazy(() => {
    Bm();
    rR();
    vo();
    gn();
    ODe();
    Zn();
  });
  var Wtf;
  var Hrc = {};
  __export(Hrc, {
    call: () => call_export69
  });
  async function call_export69(e, t) {
    t.onQueryEvent?.({
      type: "open_message_selector"
    });
    return {
      type: "skip"
    };
  }
  var Vtf;
  var Vrc = {};
  __export(Vrc, {
    performHeapDump: () => performHeapDump,
    captureMemoryDiagnostics: () => captureMemoryDiagnostics
  });
  async function captureMemoryDiagnostics(e, t = 0) {
    let n = process.memoryUsage();
    let r = fur.getHeapStatistics();
    let o = process.resourceUsage();
    let s = process.uptime();
    let i;
    try {
      i = fur.getHeapSpaceStatistics();
    } catch {}
    let a = process._getActiveHandles().length;
    let l = process._getActiveRequests().length;
    let c;
    try {
      c = (await mCt.readdir("/proc/self/fd")).length;
    } catch {}
    let u;
    try {
      u = await mCt.readFile("/proc/self/smaps_rollup", "utf8");
    } catch {}
    let d;
    let p;
    let m;
    try {
      let {
        heapStats: _
      } = await import("bun:jsc");
      let b = _(true);
      d = b.objectTypeCounts;
      p = b.protectedObjectTypeCounts;
      m = b.mimalloc || undefined;
    } catch {}
    let f = n.rss - n.heapUsed;
    let h = s > 0 ? n.rss / s : 0;
    let g = h * 3600 / 1048576;
    let y = [];
    if (r.number_of_detached_contexts > 0) {
      y.push(`${r.number_of_detached_contexts} detached context(s) - possible iframe/context leak`);
    }
    if (a > 100) {
      y.push(`${a} active handles - possible timer/socket leak`);
    }
    if (f > n.heapUsed) {
      y.push("Native memory > heap - leak may be in native addons (node-pty, sharp, etc.)");
    }
    if (g > 100) {
      y.push(`High memory growth rate: ${g.toFixed(1)} MB/hour`);
    }
    if (c && c > 500) {
      y.push(`${c} open file descriptors - possible file/socket leak`);
    }
    return {
      timestamp: new Date().toISOString(),
      sessionId: getSessionId(),
      trigger: e,
      dumpNumber: t,
      uptimeSeconds: s,
      memoryUsage: {
        heapUsed: n.heapUsed,
        heapTotal: n.heapTotal,
        external: n.external,
        arrayBuffers: n.arrayBuffers,
        rss: n.rss
      },
      memoryGrowthRate: {
        bytesPerSecond: h,
        mbPerHour: g
      },
      v8HeapStats: {
        heapSizeLimit: r.heap_size_limit,
        mallocedMemory: r.malloced_memory,
        peakMallocedMemory: r.peak_malloced_memory,
        detachedContexts: r.number_of_detached_contexts,
        nativeContexts: r.number_of_native_contexts
      },
      v8HeapSpaces: i?.map(_ => ({
        name: _.space_name,
        size: _.space_size,
        used: _.space_used_size,
        available: _.space_available_size
      })),
      resourceUsage: {
        maxRSS: o.maxRSS * (Wt() === "macos" ? 1 : 1024),
        userCPUTime: o.userCPUTime,
        systemCPUTime: o.systemCPUTime
      },
      activeHandles: a,
      activeRequests: l,
      openFileDescriptors: c,
      analysis: {
        potentialLeaks: y,
        recommendation: y.length > 0 ? `WARNING: ${y.length} potential leak indicator(s) found. See potentialLeaks array.` : "No obvious leak indicators. Check heap snapshot for retained objects."
      },
      smapsRollup: u,
      objectTypeCounts: d,
      protectedObjectTypeCounts: p,
      mimalloc: m,
      platform: "linux",
      nodeVersion: process.version,
      ccVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    };
  }
  async function performHeapDump(e = "manual", t = 0) {
    try {
      let n = getSessionId();
      let r = await captureMemoryDiagnostics(e, t);
      let o = d => (d / 1024 / 1024 / 1024).toFixed(3);
      logForDebugging(`[HeapDump] Memory state:
  heapUsed: ${o(r.memoryUsage.heapUsed)} GB (in snapshot)
  external: ${o(r.memoryUsage.external)} GB (NOT in snapshot)
  rss: ${o(r.memoryUsage.rss)} GB (total process)
  ${r.analysis.recommendation}`);
      let s = eAs();
      await zt().mkdir(s);
      let i = t > 0 ? `-dump${t}` : "";
      let a = `${n}${i}.heapsnapshot`;
      let l = `${n}${i}-diagnostics.json`;
      let c = u5o.join(s, a);
      let u = u5o.join(s, l);
      await mCt.writeFile(u, De(r, null, 2), {
        mode: 384
      });
      logForDebugging(`[HeapDump] Diagnostics written to ${u}`);
      await ztf(c);
      logForDebugging(`[HeapDump] Heap dump written to ${c}`);
      logEvent("tengu_heap_dump", {
        triggerManual: e === "manual",
        triggerAuto15GB: e === "auto-1.5GB",
        dumpNumber: t,
        success: true
      });
      return {
        success: true,
        heapPath: c,
        diagPath: u,
        diagnostics: r
      };
    } catch (n) {
      let r = sr(n);
      if (Zd(r)) {
        logForDebugging(`[HeapDump] Failed to write dump: ${r.message}`, {
          level: "error"
        });
      } else {
        Oe(r);
      }
      logEvent("tengu_heap_dump", {
        triggerManual: e === "manual",
        triggerAuto15GB: e === "auto-1.5GB",
        dumpNumber: t,
        success: false
      });
      return {
        success: false,
        error: r.message
      };
    }
  }
  async function ztf(e) {
    Wrc.writeFileSync(e, Bun.generateHeapSnapshot("v8", "arraybuffer"), {
      mode: 384
    });
    Bun.gc(true);
  }
  var Wrc;
  var mCt;
  var u5o;
  var fur;
  var p5o = __lazy(() => {
    at();
    Ot();
    je();
    dt();
    Zl();
    Rn();
    Cs();
    Wrc = require("fs");
    mCt = require("fs/promises");
    u5o = require("path");
    fur = require("v8");
  });
  var zrc = {};
  __export(zrc, {
    call: () => call_export70
  });
  async function call_export70() {
    let e = await performHeapDump();
    if (!e.success) {
      return {
        type: "text",
        value: `Failed to create heap dump: ${e.error}`
      };
    }
    let t = [e.heapPath, e.diagPath, "", Ytf(e.diagnostics)];
    t.push("", "Open the .heapsnapshot in Chrome DevTools \u2192 Memory \u2192 Load to inspect retainers.");
    return {
      type: "text",
      value: t.join(`
`)
    };
  }
  function Ytf(e) {
    let {
      memoryUsage: t,
      resourceUsage: n,
      analysis: r
    } = e;
    let o = t.external - t.arrayBuffers;
    let s = Math.max(0, t.rss - t.heapTotal - t.external);
    let i = t.heapTotal > t.external + s ? "\u2014 most memory is JS heap (inspect the .heapsnapshot)" : "\u2014 most memory is native (NOT in the .heapsnapshot)";
    let a = r.potentialLeaks.length ? r.potentialLeaks.map(l => `  \u26A0 ${l}`).join(`
`) : "  (no obvious leak indicators)";
    return [`RSS ${fCt(t.rss)} (peak ${fCt(n.maxRSS)}) ${i}`, `  JS heap        ${fCt(t.heapTotal).padStart(8)}  in snapshot`, `  array buffers  ${fCt(t.arrayBuffers).padStart(8)}  not in snapshot`, `  other external ${fCt(o).padStart(8)}  not in snapshot`, `  unaccounted    ${fCt(s).padStart(8)}  not in snapshot (code/JIT/stacks/allocator)`, a].join(`
`);
  }
  function fCt(e) {
    return `${(e / 1073741824).toFixed(2)} GB`;
  }
  var Krc = __lazy(() => {
    p5o();
  });
  var Jtf;
  var Xrc;
  var Qrc = __lazy(() => {
    Xrc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function Xtf() {
    let e = `${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}${ej()}`;
    return {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.BUILD_TIME ? `${e} (built ${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.BUILD_TIME})` : e;
  }
  function Qtf(e) {
    let t = Zrc.c(21);
    let {
      onDone: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Ul();
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = r;
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = o !== null && LD("controlChannel");
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = i ? {
        state: "loading"
      } : null;
      t[2] = a;
    } else {
      a = t[2];
    }
    let [l, c] = hur.useState(a);
    let u;
    let d;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        if (!o || !i) {
          return;
        }
        let C = false;
        o.sendControlRequest({
          subtype: "get_binary_version"
        }).then(x => {
          if (C) {
            return;
          }
          c({
            state: "ok",
            version: x.version,
            buildTime: x.buildTime
          });
        }).catch(x => {
          if (C) {
            return;
          }
          c({
            state: "error",
            message: he(x)
          });
        });
        return () => {
          C = true;
        };
      };
      d = [o, i];
      t[3] = u;
      t[4] = d;
    } else {
      u = t[3];
      d = t[4];
    }
    hur.useEffect(u, d);
    let p;
    if (t[5] !== n) {
      p = function (x) {
        if (x.key === "escape" || x.key === "return" || x.key === " ") {
          x.preventDefault();
          n(undefined, {
            display: "skip"
          });
        }
      };
      t[5] = n;
      t[6] = p;
    } else {
      p = t[6];
    }
    let m = p;
    let f;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      f = gP.jsx(Dv, {
        children: "Claude Code"
      });
      t[7] = f;
    } else {
      f = t[7];
    }
    let h;
    if (t[8] !== l) {
      h = l && gP.jsx(Text, {
        dimColor: true,
        children: "Thin client"
      });
      t[8] = l;
      t[9] = h;
    } else {
      h = t[9];
    }
    let g;
    let y;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      y = gP.jsxs(Text, {
        children: [{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, ej()]
      });
      g = {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.BUILD_TIME && gP.jsxs(Text, {
        dimColor: true,
        children: ["Built ", {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.BUILD_TIME]
      });
      t[10] = g;
      t[11] = y;
    } else {
      g = t[10];
      y = t[11];
    }
    let _;
    if (t[12] !== l) {
      _ = l && gP.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [gP.jsx(Text, {
          dimColor: true,
          children: "Remote container"
        }), l.state === "loading" && gP.jsx(Text, {
          dimColor: true,
          children: "Loading\u2026"
        }), l.state === "ok" && gP.jsxs(gP.Fragment, {
          children: [gP.jsx(Text, {
            children: l.version
          }), l.buildTime && gP.jsxs(Text, {
            dimColor: true,
            children: ["Built ", l.buildTime]
          })]
        }), l.state === "error" && gP.jsxs(Text, {
          dimColor: true,
          children: ["Couldn't fetch: ", l.message]
        })]
      });
      t[12] = l;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b;
    if (t[14] !== _ || t[15] !== h) {
      b = gP.jsxs(gXd, {
        flexDirection: "column",
        children: [h, y, g, _]
      });
      t[14] = _;
      t[15] = h;
      t[16] = b;
    } else {
      b = t[16];
    }
    let S;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      S = gP.jsx(Lw, {
        children: gP.jsx(xt, {
          chord: "escape",
          action: "close"
        })
      });
      t[17] = S;
    } else {
      S = t[17];
    }
    let E;
    if (t[18] !== m || t[19] !== b) {
      E = gP.jsx(Td, {
        children: gP.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: m,
          children: [f, b, S]
        })
      });
      t[18] = m;
      t[19] = b;
      t[20] = E;
    } else {
      E = t[20];
    }
    return E;
  }
  var Zrc;
  var hur;
  var gP;
  var Ztf = async e => gP.jsx(Qtf, {
    onDone: e
  });
  var enf;
  var tnf = async () => ({
    type: "text",
    value: Xtf()
  });
  var m5o;
  var toc;
  var nnf;
  var ooc;
  var soc = __lazy(() => {
    ooc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var ioc;
  var aoc = __lazy(() => {
    ioc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var loc;
  var coc = __lazy(() => {
    loc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function doc() {
    let e = uoc.c(3);
    let t = SandboxManager.isSandboxingEnabled();
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      let s = SandboxManager.checkDependencies();
      n = s.warnings.length > 0 ? xE.jsx(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: s.warnings.map(rnf)
      }) : null;
      e[0] = n;
    } else {
      n = e[0];
    }
    let r = n;
    if (!t) {
      let s;
      if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
        s = xE.jsxs(gXd, {
          flexDirection: "column",
          children: [xE.jsx(Text, {
            color: "subtle",
            children: "Sandbox is not enabled"
          }), r]
        });
        e[1] = s;
      } else {
        s = e[1];
      }
      return s;
    }
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      let s = SandboxManager.getFsReadConfig();
      let i = SandboxManager.getFsWriteConfig();
      let a = SandboxManager.getNetworkRestrictionConfig();
      let l = SandboxManager.getAllowUnixSockets();
      let c = SandboxManager.getExcludedCommands();
      let u = SandboxManager.getLinuxGlobPatternWarnings();
      o = xE.jsxs(gXd, {
        flexDirection: "column",
        children: [xE.jsxs(gXd, {
          flexDirection: "column",
          children: [xE.jsx(Text, {
            bold: true,
            color: "permission",
            children: "Excluded Commands:"
          }), xE.jsx(Text, {
            dimColor: true,
            children: c.length > 0 ? c.join(", ") : "None"
          })]
        }), s.denyOnly.length > 0 && xE.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [xE.jsx(Text, {
            bold: true,
            color: "permission",
            children: "Filesystem Read Restrictions:"
          }), xE.jsxs(Text, {
            dimColor: true,
            children: ["Denied: ", s.denyOnly.join(", ")]
          }), s.allowWithinDeny && s.allowWithinDeny.length > 0 && xE.jsxs(Text, {
            dimColor: true,
            children: ["Allowed within denied: ", s.allowWithinDeny.join(", ")]
          })]
        }), i.allowOnly.length > 0 && xE.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [xE.jsx(Text, {
            bold: true,
            color: "permission",
            children: "Filesystem Write Restrictions:"
          }), xE.jsxs(Text, {
            dimColor: true,
            children: ["Allowed: ", i.allowOnly.join(", ")]
          }), i.denyWithinAllow.length > 0 && xE.jsxs(Text, {
            dimColor: true,
            children: ["Denied within allowed: ", i.denyWithinAllow.join(", ")]
          })]
        }), (a.allowedHosts && a.allowedHosts.length > 0 || a.deniedHosts && a.deniedHosts.length > 0) && xE.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [xE.jsxs(Text, {
            bold: true,
            color: "permission",
            children: ["Network Restrictions", shouldAllowManagedSandboxDomainsOnly() ? " (Managed)" : "", ":"]
          }), a.allowedHosts && a.allowedHosts.length > 0 && xE.jsxs(Text, {
            dimColor: true,
            children: ["Allowed: ", a.allowedHosts.join(", ")]
          }), a.deniedHosts && a.deniedHosts.length > 0 && xE.jsxs(Text, {
            dimColor: true,
            children: ["Denied: ", a.deniedHosts.join(", ")]
          })]
        }), l && l.length > 0 && xE.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [xE.jsx(Text, {
            bold: true,
            color: "permission",
            children: "Allowed Unix Sockets:"
          }), xE.jsx(Text, {
            dimColor: true,
            children: l.join(", ")
          })]
        }), u.length > 0 && xE.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [xE.jsx(Text, {
            bold: true,
            color: "warning",
            children: "\u26A0 Warning: Glob patterns not fully supported on Linux"
          }), xE.jsxs(Text, {
            dimColor: true,
            children: ["The following patterns will be ignored:", " ", u.slice(0, 3).join(", "), u.length > 3 && ` (${u.length - 3} more)`]
          })]
        }), r]
      });
      e[2] = o;
    } else {
      o = e[2];
    }
    return o;
  }
  function rnf(e, t) {
    return xE.jsx(Text, {
      dimColor: true,
      children: e
    }, t);
  }
  var uoc;
  var xE;
  var poc = __lazy(() => {
    et();
    Th();
    uoc = __toESM(pt(), 1);
    xE = __toESM(ie(), 1);
  });
  function y5o(e) {
    let t = moc.c(24);
    let {
      depCheck: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Wt();
      t[0] = r;
    } else {
      r = t[0];
    }
    let s = r === "macos";
    let i;
    if (t[1] !== n.errors) {
      i = n.errors.some(lnf);
      t[1] = n.errors;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== n.errors) {
      l = n.errors.some(anf);
      t[3] = n.errors;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] !== n.errors) {
      u = n.errors.some(inf);
      t[5] = n.errors;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d = u;
    let p = n.warnings.length > 0;
    let m;
    if (t[7] !== c || t[8] !== n.errors || t[9] !== a || t[10] !== p || t[11] !== d) {
      let f = n.errors.filter(snf);
      let h = s ? "brew install ripgrep" : "apt install ripgrep";
      let g;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        g = s && Jy.jsx(gXd, {
          flexDirection: "column",
          children: Jy.jsxs(Text, {
            children: ["seatbelt: ", Jy.jsx(Text, {
              color: "success",
              children: "built-in (macOS)"
            })]
          })
        });
        t[13] = g;
      } else {
        g = t[13];
      }
      let y;
      let _;
      if (t[14] !== a) {
        y = Jy.jsxs(Text, {
          children: ["ripgrep (rg):", " ", a ? Jy.jsx(Text, {
            color: "error",
            children: "not found"
          }) : Jy.jsx(Text, {
            color: "success",
            children: "found"
          })]
        });
        _ = a && Jy.jsxs(Text, {
          dimColor: true,
          children: ["  ", "\xB7 ", h]
        });
        t[14] = a;
        t[15] = y;
        t[16] = _;
      } else {
        y = t[15];
        _ = t[16];
      }
      let b;
      if (t[17] !== y || t[18] !== _) {
        b = Jy.jsxs(gXd, {
          flexDirection: "column",
          children: [y, _]
        });
        t[17] = y;
        t[18] = _;
        t[19] = b;
      } else {
        b = t[19];
      }
      let S;
      if (t[20] !== c || t[21] !== p || t[22] !== d) {
        S = !s && Jy.jsxs(Jy.Fragment, {
          children: [Jy.jsxs(gXd, {
            flexDirection: "column",
            children: [Jy.jsxs(Text, {
              children: ["bubblewrap (bwrap):", " ", c ? Jy.jsx(Text, {
                color: "error",
                children: "not installed"
              }) : Jy.jsx(Text, {
                color: "success",
                children: "installed"
              })]
            }), c && Jy.jsxs(Text, {
              dimColor: true,
              children: ["  ", "\xB7 apt install bubblewrap"]
            })]
          }), Jy.jsxs(gXd, {
            flexDirection: "column",
            children: [Jy.jsxs(Text, {
              children: ["socat:", " ", d ? Jy.jsx(Text, {
                color: "error",
                children: "not installed"
              }) : Jy.jsx(Text, {
                color: "success",
                children: "installed"
              })]
            }), d && Jy.jsxs(Text, {
              dimColor: true,
              children: ["  ", "\xB7 apt install socat"]
            })]
          }), Jy.jsxs(gXd, {
            flexDirection: "column",
            children: [Jy.jsxs(Text, {
              children: ["seccomp filter:", " ", p ? Jy.jsx(Text, {
                color: "warning",
                children: "not installed"
              }) : Jy.jsx(Text, {
                color: "success",
                children: "installed"
              }), p && Jy.jsx(Text, {
                dimColor: true,
                children: " (required to block unix domain sockets)"
              })]
            }), p && Jy.jsxs(gXd, {
              flexDirection: "column",
              children: [Jy.jsxs(Text, {
                dimColor: true,
                children: ["  ", "\xB7 npm install -g @anthropic-ai/sandbox-runtime"]
              }), Jy.jsxs(Text, {
                dimColor: true,
                children: ["  ", "\xB7 or copy vendor/seccomp/* from sandbox-runtime and set"]
              }), Jy.jsxs(Text, {
                dimColor: true,
                children: ["    ", "sandbox.seccomp.bpfPath and applyPath in settings.json"]
              })]
            })]
          })]
        });
        t[20] = c;
        t[21] = p;
        t[22] = d;
        t[23] = S;
      } else {
        S = t[23];
      }
      m = Jy.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [g, b, S, f.map(onf)]
      });
      t[7] = c;
      t[8] = n.errors;
      t[9] = a;
      t[10] = p;
      t[11] = d;
      t[12] = m;
    } else {
      m = t[12];
    }
    return m;
  }
  function onf(e) {
    return Jy.jsx(Text, {
      color: "error",
      children: e
    }, e);
  }
  function snf(e) {
    return !e.includes("ripgrep") && !e.includes("bwrap") && !e.includes("socat");
  }
  function inf(e) {
    return e.includes("socat");
  }
  function anf(e) {
    return e.includes("bwrap");
  }
  function lnf(e) {
    return e.includes("ripgrep");
  }
  var moc;
  var Jy;
  var foc = __lazy(() => {
    et();
    Cs();
    moc = __toESM(pt(), 1);
    Jy = __toESM(ie(), 1);
  });
  function hoc(e) {
    let t = _5o.c(5);
    let {
      onComplete: n
    } = e;
    let r = SandboxManager.isSandboxingEnabled();
    let o = SandboxManager.areSandboxSettingsLockedByPolicy() || SandboxManager.areUnsandboxedCommandsForbiddenByPolicy();
    let s = SandboxManager.areUnsandboxedCommandsAllowed();
    if (!r) {
      let a;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        a = tN.jsx(gXd, {
          flexDirection: "column",
          children: tN.jsx(Text, {
            color: "subtle",
            children: "Sandbox is not enabled. Enable sandbox to configure override settings."
          })
        });
        t[0] = a;
      } else {
        a = t[0];
      }
      return a;
    }
    if (o) {
      let a;
      if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
        a = tN.jsx(Text, {
          color: "subtle",
          children: "Override settings are managed by a higher-priority configuration and cannot be changed locally."
        });
        t[1] = a;
      } else {
        a = t[1];
      }
      let l;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        l = tN.jsxs(gXd, {
          flexDirection: "column",
          children: [a, tN.jsx(gXd, {
            marginTop: 1,
            children: tN.jsxs(Text, {
              dimColor: true,
              children: ["Current setting:", " ", s ? "Allow unsandboxed fallback" : "Strict sandbox mode"]
            })
          })]
        });
        t[2] = l;
      } else {
        l = t[2];
      }
      return l;
    }
    let i;
    if (t[3] !== n) {
      i = tN.jsx(cnf, {
        onComplete: n,
        currentMode: s ? "open" : "closed"
      });
      t[3] = n;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  function cnf(e) {
    let t = _5o.c(24);
    let {
      onComplete: n,
      currentMode: r
    } = e;
    let [o] = useTheme();
    let {
      headerFocused: s,
      focusHeader: i
    } = zM();
    let a;
    if (t[0] !== o) {
      a = color("success", o)("(current)");
      t[0] = o;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c = r === "open" ? `Allow unsandboxed fallback ${l}` : "Allow unsandboxed fallback";
    let u;
    if (t[2] !== c) {
      u = {
        label: c,
        value: "open"
      };
      t[2] = c;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = r === "closed" ? `Strict sandbox mode ${l}` : "Strict sandbox mode";
    let p;
    if (t[4] !== d) {
      p = {
        label: d,
        value: "closed"
      };
      t[4] = d;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] !== u || t[7] !== p) {
      m = [u, p];
      t[6] = u;
      t[7] = p;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f = m;
    let h;
    if (t[9] !== n) {
      h = async function (A) {
        let k = A;
        await SandboxManager.setSandboxSettings({
          allowUnsandboxedCommands: k === "open"
        });
        n(k === "open" ? "\u2713 Unsandboxed fallback allowed - commands can run outside sandbox when necessary" : "\u2713 Strict sandbox mode - all commands must run in sandbox or be excluded via the `excludedCommands` option");
      };
      t[9] = n;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g = h;
    let y;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      y = tN.jsx(gXd, {
        marginBottom: 1,
        children: tN.jsx(Text, {
          bold: true,
          children: "Configure overrides"
        })
      });
      t[11] = y;
    } else {
      y = t[11];
    }
    let _;
    if (t[12] !== n) {
      _ = () => n(undefined, {
        display: "skip"
      });
      t[12] = n;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b;
    if (t[14] !== i || t[15] !== g || t[16] !== s || t[17] !== f || t[18] !== _) {
      b = tN.jsx(xr, {
        options: f,
        onChange: g,
        onCancel: _,
        onUpFromFirstItem: i,
        isDisabled: s
      });
      t[14] = i;
      t[15] = g;
      t[16] = s;
      t[17] = f;
      t[18] = _;
      t[19] = b;
    } else {
      b = t[19];
    }
    let S;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      S = tN.jsxs(Text, {
        dimColor: true,
        wrap: "wrap-trim",
        children: [tN.jsx(Text, {
          bold: true,
          dimColor: true,
          children: "Allow unsandboxed fallback:"
        }), " ", "When a command fails due to sandbox restrictions, Claude can retry with dangerouslyDisableSandbox to run outside the sandbox (falling back to default permissions)."]
      });
      t[20] = S;
    } else {
      S = t[20];
    }
    let E;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      E = tN.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        gap: 1,
        children: [S, tN.jsxs(Text, {
          dimColor: true,
          wrap: "wrap-trim",
          children: [tN.jsx(Text, {
            bold: true,
            dimColor: true,
            children: "Strict sandbox mode:"
          }), " ", "All bash commands invoked by the model must run in the sandbox unless they are explicitly listed in excludedCommands."]
        }), tN.jsx(eD, {
          url: "https://code.claude.com/docs/en/sandboxing#configure-sandboxing"
        })]
      });
      t[21] = E;
    } else {
      E = t[21];
    }
    let C;
    if (t[22] !== b) {
      C = tN.jsxs(gXd, {
        flexDirection: "column",
        children: [y, b, E]
      });
      t[22] = b;
      t[23] = C;
    } else {
      C = t[23];
    }
    return C;
  }
  var _5o;
  var tN;
  var goc = __lazy(() => {
    et();
    Th();
    $c();
    die();
    yH();
    _5o = __toESM(pt(), 1);
    tN = __toESM(ie(), 1);
  });
  function yoc(e) {
    let t = b5o.c(29);
    let {
      onComplete: n,
      depCheck: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = SandboxManager.isSandboxingEnabled();
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = SandboxManager.isAutoAllowBashIfSandboxedEnabled();
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l = r.warnings.length > 0;
    let c;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      c = getInitialSettings();
      t[2] = c;
    } else {
      c = t[2];
    }
    let d = c.sandbox?.network?.allowAllUnixSockets;
    let p = l && !d;
    let m;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      m = () => {
        if (!s) {
          return "disabled";
        }
        if (a) {
          return "auto-allow";
        }
        return "regular";
      };
      t[3] = m;
    } else {
      m = t[3];
    }
    let f = m;
    let h;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      h = shouldForceSandboxOn();
      t[4] = h;
    } else {
      h = t[4];
    }
    let g = h;
    let y = f();
    let _ = g && y === "disabled" ? "regular" : y;
    let b;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      b = [{
        label: "Sandbox BashTool, with auto-allow",
        value: "auto-allow"
      }, {
        label: "Sandbox BashTool, with regular permissions",
        value: "regular"
      }, ...(g ? [] : [{
        label: "No Sandbox",
        value: "disabled"
      }])];
      t[5] = b;
    } else {
      b = t[5];
    }
    let S = b;
    let E;
    let C;
    if (t[6] !== n) {
      C = async function (K) {
        let J = K;
        e: switch (J) {
          case "auto-allow":
            {
              await SandboxManager.setSandboxSettings({
                enabled: true,
                autoAllowBashIfSandboxed: true
              });
              n("\u2713 Sandbox enabled with auto-allow for bash commands");
              break e;
            }
          case "regular":
            {
              await SandboxManager.setSandboxSettings({
                enabled: true,
                autoAllowBashIfSandboxed: false
              });
              n("\u2713 Sandbox enabled with regular bash permissions");
              break e;
            }
          case "disabled":
            await SandboxManager.setSandboxSettings({
              enabled: false,
              autoAllowBashIfSandboxed: false
            });
            n("\u25CB Sandbox disabled");
        }
      };
      t[6] = n;
      t[7] = C;
    } else {
      C = t[7];
    }
    let x = C;
    let A;
    if (t[8] !== n) {
      A = {
        "confirm:no": () => n(undefined, {
          display: "skip"
        })
      };
      t[8] = n;
      t[9] = A;
    } else {
      A = t[9];
    }
    let k;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      k = {
        context: "Settings"
      };
      t[10] = k;
    } else {
      k = t[10];
    }
    jo(A, k);
    let I;
    if (t[11] !== x || t[12] !== n || t[13] !== p) {
      I = kE.jsx(kh, {
        title: "Mode",
        children: kE.jsx(unf, {
          showSocketWarning: p,
          options: S,
          currentMode: _,
          noSandboxHint: E,
          onSelect: x,
          onComplete: n
        })
      }, "mode");
      t[11] = x;
      t[12] = n;
      t[13] = p;
      t[14] = I;
    } else {
      I = t[14];
    }
    let O = I;
    let M;
    if (t[15] !== n) {
      M = kE.jsx(kh, {
        title: "Overrides",
        children: kE.jsx(hoc, {
          onComplete: n
        })
      }, "overrides");
      t[15] = n;
      t[16] = M;
    } else {
      M = t[16];
    }
    let L = M;
    let P;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      P = kE.jsx(kh, {
        title: "Config",
        children: kE.jsx(doc, {})
      }, "config");
      t[17] = P;
    } else {
      P = t[17];
    }
    let F = P;
    let H = r.errors.length > 0;
    let U;
    if (t[18] !== r || t[19] !== H || t[20] !== l || t[21] !== O || t[22] !== L) {
      U = H ? [kE.jsx(kh, {
        title: "Dependencies",
        children: kE.jsx(y5o, {
          depCheck: r
        })
      }, "dependencies")] : [O, ...(l ? [kE.jsx(kh, {
        title: "Dependencies",
        children: kE.jsx(y5o, {
          depCheck: r
        })
      }, "dependencies")] : []), L, F];
      t[18] = r;
      t[19] = H;
      t[20] = l;
      t[21] = O;
      t[22] = L;
      t[23] = U;
    } else {
      U = t[23];
    }
    let N = U;
    let W;
    if (t[24] !== N) {
      W = kE.jsx(VM, {
        title: "Sandbox",
        color: "permission",
        defaultTab: "Mode",
        children: N
      });
      t[24] = N;
      t[25] = W;
    } else {
      W = t[25];
    }
    let j;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      j = kE.jsx(gXd, {
        marginTop: 1,
        children: kE.jsx(Lw, {
          children: "\u2190/\u2192 to switch \xB7 \u2191/\u2193 to navigate \xB7 Enter to select \xB7 Esc to close"
        })
      });
      t[26] = j;
    } else {
      j = t[26];
    }
    let z;
    if (t[27] !== W) {
      z = kE.jsxs(Td, {
        color: "permission",
        children: [W, j]
      });
      t[27] = W;
      t[28] = z;
    } else {
      z = t[28];
    }
    return z;
  }
  function unf(e) {
    let t = b5o.c(19);
    let {
      showSocketWarning: n,
      options: r,
      currentMode: o,
      noSandboxHint: s,
      onSelect: i,
      onComplete: a
    } = e;
    let {
      headerFocused: l,
      focusHeader: c
    } = zM();
    let u;
    if (t[0] !== n) {
      u = n && kE.jsx(gXd, {
        marginBottom: 1,
        children: kE.jsx(gA, {
          status: "warning",
          children: "Cannot block unix domain sockets (see Dependencies tab)"
        })
      });
      t[0] = n;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      d = kE.jsx(gXd, {
        marginBottom: 1,
        children: kE.jsx(Text, {
          bold: true,
          children: "Configure mode"
        })
      });
      t[2] = d;
    } else {
      d = t[2];
    }
    let p;
    if (t[3] !== a) {
      p = () => a(undefined, {
        display: "skip"
      });
      t[3] = a;
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] !== o || t[6] !== c || t[7] !== l || t[8] !== i || t[9] !== r || t[10] !== p) {
      m = kE.jsx(xr, {
        options: r,
        defaultValue: o,
        defaultFocusValue: o,
        onChange: i,
        onCancel: p,
        onUpFromFirstItem: c,
        isDisabled: l
      });
      t[5] = o;
      t[6] = c;
      t[7] = l;
      t[8] = i;
      t[9] = r;
      t[10] = p;
      t[11] = m;
    } else {
      m = t[11];
    }
    let f;
    if (t[12] !== s) {
      f = s && kE.jsx(gXd, {
        marginTop: 1,
        children: kE.jsx(Text, {
          dimColor: true,
          children: s
        })
      });
      t[12] = s;
      t[13] = f;
    } else {
      f = t[13];
    }
    let h;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      h = kE.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        gap: 1,
        children: [kE.jsxs(Text, {
          dimColor: true,
          children: [kE.jsx(Text, {
            bold: true,
            dimColor: true,
            children: "Auto-allow mode:"
          }), " ", "Commands will try to run in the sandbox automatically, and attempts to run outside of the sandbox fallback to regular permissions. Explicit ask/deny rules are always respected."]
        }), kE.jsx(eD, {
          url: "https://code.claude.com/docs/en/sandboxing"
        })]
      });
      t[14] = h;
    } else {
      h = t[14];
    }
    let g;
    if (t[15] !== u || t[16] !== m || t[17] !== f) {
      g = kE.jsxs(gXd, {
        flexDirection: "column",
        children: [u, d, m, f, h]
      });
      t[15] = u;
      t[16] = m;
      t[17] = f;
      t[18] = g;
    } else {
      g = t[18];
    }
    return g;
  }
  var b5o;
  var kE;
  var _oc = __lazy(() => {
    et();
    Bs();
    Th();
    $c();
    die();
    fz();
    nwt();
    oE();
    yH();
    poc();
    foc();
    goc();
    b5o = __toESM(pt(), 1);
    kE = __toESM(ie(), 1);
  });
  var Soc = {};
  __export(Soc, {
    call: () => call_export71
  });
  async function call_export71(e, t, n) {
    let o = getInitialSettings().theme || "light";
    let s = Wt();
    if (!SandboxManager.isSupportedPlatform()) {
      let l = s === "wsl" ? "Error: Sandboxing requires WSL2. WSL1 is not supported." : "Error: Sandboxing is currently only supported on macOS, Linux, and WSL2.";
      let c = color("error", o)(l);
      e(c);
      return null;
    }
    let i = SandboxManager.checkDependencies();
    if (!SandboxManager.isPlatformInEnabledList()) {
      let l = color("error", o)(`Error: Sandboxing is disabled for this platform (${s}) via the enabledPlatforms setting.`);
      e(l);
      return null;
    }
    if (SandboxManager.areSandboxSettingsLockedByPolicy()) {
      let l = color("error", o)("Error: Sandbox settings are overridden by a higher-priority configuration and cannot be changed locally.");
      e(l);
      return null;
    }
    let a = n?.trim() || "";
    if (!a) {
      return Toc.jsx(yoc, {
        onComplete: e,
        depCheck: i
      });
    }
    if (a) {
      let c = a.split(" ")[0];
      if (c === "exclude") {
        let u = a.slice(8).trim();
        if (!u) {
          let h = color("error", o)('Error: Please provide a command pattern to exclude (e.g., /sandbox exclude "npm run test:*")');
          e(h);
          return null;
        }
        let d = u.replace(/^["']|["']$/g, "");
        addToExcludedCommands(d);
        let p = getSettingsFilePathForSource("localSettings");
        let m = p ? boc.relative(getCwdState(), p) : ".claude/settings.local.json";
        let f = color("success", o)(`Added "${d}" to excluded commands in ${m}`);
        e(f);
        return null;
      } else {
        let u = color("error", o)(`Error: Unknown subcommand "${c}". Available subcommand: exclude`);
        e(u);
        return null;
      }
    }
    return null;
  }
  var boc;
  var Toc;
  var Eoc = __lazy(() => {
    at();
    _oc();
    et();
    Cs();
    Th();
    boc = require("path");
    Toc = __toESM(ie(), 1);
  });
  var pnf;
  function Coc(e) {
    let t = T5o.c(36);
    let {
      chromeClient: n,
      onDone: r
    } = e;
    let [o, s] = ZUe.useState(null);
    let [i, a] = ZUe.useState(null);
    let [l, c] = ZUe.useState(false);
    let u = ZUe.useRef(false);
    let d;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      d = getGlobalConfig().chromeExtension?.pairedDeviceId;
      t[0] = d;
    } else {
      d = t[0];
    }
    let p = d;
    let m;
    let f;
    if (t[1] !== n) {
      m = () => (u.current = false, fnf(n).then(I => {
        if (!u.current) {
          s(I);
        }
      }).catch(I => {
        if (Ae("chrome_browser_picker", "list_failed"), !u.current) {
          a(sr(I).message);
        }
      }), () => {
        u.current = true;
      });
      f = [n];
      t[1] = n;
      t[2] = m;
      t[3] = f;
    } else {
      m = t[2];
      f = t[3];
    }
    ZUe.useEffect(m, f);
    let h;
    if (t[4] !== r) {
      h = function (O) {
        if (u.current) {
          return;
        }
        u.current = true;
        r(O);
      };
      t[4] = r;
      t[5] = h;
    } else {
      h = t[5];
    }
    let g = h;
    let y;
    if (t[6] !== o || t[7] !== n || t[8] !== g || t[9] !== l) {
      y = function (O) {
        if (l) {
          return;
        }
        c(true);
        let M = o?.find(L => L.deviceId === O);
        Roc(n, "select_browser", {
          deviceId: O
        }).then(() => {
          Pe("chrome_browser_picker");
          g(M ? `Now using browser "${M.name}" for Chrome actions.` : undefined);
        }).catch(L => {
          Ae("chrome_browser_picker", "select_failed");
          logForDebugging(`claude-in-chrome select_browser failed: ${sr(L).message}`, {
            level: "error"
          });
          g(`Couldn't switch browser: ${sr(L).message}`);
        });
      };
      t[6] = o;
      t[7] = n;
      t[8] = g;
      t[9] = l;
      t[10] = y;
    } else {
      y = t[10];
    }
    let _ = y;
    if (i) {
      let I = `Couldn't list connected browsers: ${i}`;
      let O;
      if (t[11] !== I) {
        O = bL.jsx(Text, {
          color: "error",
          children: I
        });
        t[11] = I;
        t[12] = O;
      } else {
        O = t[12];
      }
      let M;
      if (t[13] !== g || t[14] !== O) {
        M = bL.jsx(S5o, {
          onDone: g,
          children: O
        });
        t[13] = g;
        t[14] = O;
        t[15] = M;
      } else {
        M = t[15];
      }
      return M;
    }
    if (o === null) {
      let I;
      if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
        I = bL.jsx(Text, {
          dimColor: true,
          children: "Looking for connected browsers\u2026"
        });
        t[16] = I;
      } else {
        I = t[16];
      }
      let O;
      if (t[17] !== g) {
        O = bL.jsx(S5o, {
          onDone: g,
          children: I
        });
        t[17] = g;
        t[18] = O;
      } else {
        O = t[18];
      }
      return O;
    }
    if (o.length === 0) {
      let I;
      if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
        I = bL.jsx(Text, {
          children: "No browsers are connected. Open Chrome with the Claude extension and make sure you're signed in to the same claude.ai account."
        });
        t[19] = I;
      } else {
        I = t[19];
      }
      let O;
      if (t[20] !== g) {
        O = bL.jsx(S5o, {
          onDone: g,
          children: I
        });
        t[20] = g;
        t[21] = O;
      } else {
        O = t[21];
      }
      return O;
    }
    let b;
    if (t[22] !== o) {
      let I;
      if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
        I = O => ({
          value: O.deviceId,
          label: bL.jsxs(bL.Fragment, {
            children: [bL.jsx(Text, {
              children: O.name
            }), bL.jsxs(Text, {
              dimColor: true,
              children: [" ", "\xB7 ", O.osPlatform ?? "unknown OS", O.deviceId === p ? " \xB7 current" : ""]
            })]
          })
        });
        t[24] = I;
      } else {
        I = t[24];
      }
      b = o.map(I);
      t[22] = o;
      t[23] = b;
    } else {
      b = t[23];
    }
    let S = b;
    let E = o.length === 1 ? "One browser is connected:" : `Choose which browser to use (${o.length} connected):`;
    let C;
    if (t[25] !== E) {
      C = bL.jsx(Text, {
        children: E
      });
      t[25] = E;
      t[26] = C;
    } else {
      C = t[26];
    }
    let x;
    if (t[27] !== g) {
      x = () => g();
      t[27] = g;
      t[28] = x;
    } else {
      x = t[28];
    }
    let A;
    if (t[29] !== _ || t[30] !== S || t[31] !== x) {
      A = bL.jsx(xr, {
        options: S,
        onChange: _,
        onCancel: x,
        defaultFocusValue: p,
        hideIndexes: true
      });
      t[29] = _;
      t[30] = S;
      t[31] = x;
      t[32] = A;
    } else {
      A = t[32];
    }
    let k;
    if (t[33] !== A || t[34] !== C) {
      k = bL.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [C, A]
      });
      t[33] = A;
      t[34] = C;
      t[35] = k;
    } else {
      k = t[35];
    }
    return k;
  }
  function S5o(e) {
    let t = T5o.c(6);
    let {
      onDone: n,
      children: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = [{
        value: "back",
        label: "\u2039 Back"
      }];
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== n) {
      s = bL.jsx(xr, {
        options: o,
        onChange: () => n(),
        onCancel: () => n(),
        hideIndexes: true
      });
      t[1] = n;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== r || t[4] !== s) {
      i = bL.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [r, s]
      });
      t[3] = r;
      t[4] = s;
      t[5] = i;
    } else {
      i = t[5];
    }
    return i;
  }
  async function fnf(e) {
    let t = await Roc(e, "list_connected_browsers", {});
    if (!t) {
      return [];
    }
    let n = v.array(mnf()).safeParse(qt(t));
    return n.success ? n.data : [];
  }
  async function Roc(e, t, n) {
    let r = await e.client.callTool({
      name: t,
      arguments: n
    });
    let o = Array.isArray(r.content) ? r.content[0] : undefined;
    return o && typeof o === "object" && "text" in o && typeof o.text === "string" ? o.text : undefined;
  }
  var T5o;
  var ZUe;
  var bL;
  var mnf;
  var xoc = __lazy(() => {
    $c();
    et();
    ln();
    je();
    dt();
    T5o = __toESM(pt(), 1);
    ZUe = __toESM(ot(), 1);
    bL = __toESM(ie(), 1);
    mnf = we(() => v.object({
      deviceId: v.string(),
      name: v.string().default("Browser"),
      osPlatform: v.string().optional()
    }));
  });
  var Aoc = {};
  __export(Aoc, {
    call: () => call_export72
  });
  function _nf(e) {
    let t = koc.c(47);
    let {
      onDone: n,
      isExtensionInstalled: r,
      configEnabled: o,
      isClaudeAISubscriber: s,
      isWSL: i
    } = e;
    let a = bt(wnf);
    let [l, c] = hCt.useState(0);
    let [u, d] = hCt.useState(o ?? false);
    let [p, m] = hCt.useState(false);
    let [f, h] = hCt.useState(r);
    let [g, y] = hCt.useState("menu");
    let _;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      _ = false;
      t[0] = _;
    } else {
      _ = t[0];
    }
    let b = _;
    let S;
    if (t[1] !== a) {
      S = a.find(vnf);
      t[1] = a;
      t[2] = S;
    } else {
      S = t[2];
    }
    let E = S;
    let C = E !== undefined;
    let x;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      x = getGlobalConfig().chromeExtension?.pairedDeviceName;
      t[3] = x;
    } else {
      x = t[3];
    }
    let A = x;
    let k;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      k = function (J) {
        if (b) {
          Ac(J);
        } else {
          openInChrome(J).catch(Oe);
        }
      };
      t[4] = k;
    } else {
      k = t[4];
    }
    let I = k;
    let O;
    if (t[5] !== u) {
      O = function (J) {
        e: switch (J) {
          case "install-extension":
            {
              c(Enf);
              m(true);
              I("https://claude.ai/chrome");
              break e;
            }
          case "reconnect":
            {
              c(Tnf);
              isChromeExtensionInstalled().then(Q => {
                if (h(Q), Q) {
                  m(false);
                }
              }).catch(Oe);
              I("https://clau.de/chrome/reconnect");
              break e;
            }
          case "manage-permissions":
            {
              c(Snf);
              I("https://clau.de/chrome/permissions");
              break e;
            }
          case "toggle-default":
            {
              let Q = !u;
              saveGlobalConfig(Z => ({
                ...Z,
                claudeInChromeDefaultEnabled: Q
              }));
              d(Q);
              break e;
            }
          case "select-browser":
            y("select-browser");
        }
      };
      t[5] = u;
      t[6] = O;
    } else {
      O = t[6];
    }
    let M = O;
    let L;
    if (t[7] !== u || t[8] !== C || t[9] !== f) {
      L = [];
      let K = f ? "" : " (requires extension)";
      if (!f && !b) {
        let re;
        if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
          re = {
            label: "Install Chrome extension",
            value: "install-extension"
          };
          t[11] = re;
        } else {
          re = t[11];
        }
        L.push(re);
      }
      if (C) {
        let re;
        if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
          re = {
            label: "Select browser\u2026",
            value: "select-browser"
          };
          t[12] = re;
        } else {
          re = t[12];
        }
        L.push(re);
      }
      let J;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        J = Ah.jsx(Text, {
          children: "Manage permissions"
        });
        t[13] = J;
      } else {
        J = t[13];
      }
      let Q;
      if (t[14] !== K) {
        Q = {
          label: Ah.jsxs(Ah.Fragment, {
            children: [J, Ah.jsx(Text, {
              dimColor: true,
              children: K
            })]
          }),
          value: "manage-permissions"
        };
        t[14] = K;
        t[15] = Q;
      } else {
        Q = t[15];
      }
      let Z;
      if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
        Z = Ah.jsx(Text, {
          children: "Reconnect extension"
        });
        t[16] = Z;
      } else {
        Z = t[16];
      }
      let ne;
      if (t[17] !== K) {
        ne = {
          label: Ah.jsxs(Ah.Fragment, {
            children: [Z, Ah.jsx(Text, {
              dimColor: true,
              children: K
            })]
          }),
          value: "reconnect"
        };
        t[17] = K;
        t[18] = ne;
      } else {
        ne = t[18];
      }
      let oe = `Enabled by default: ${u ? "Yes" : "No"}`;
      let ee;
      if (t[19] !== oe) {
        ee = {
          label: oe,
          value: "toggle-default"
        };
        t[19] = oe;
        t[20] = ee;
      } else {
        ee = t[20];
      }
      L.push(Q, ne, ee);
      t[7] = u;
      t[8] = C;
      t[9] = f;
      t[10] = L;
    } else {
      L = t[10];
    }
    let P = i || !s;
    let F;
    if (t[21] !== n) {
      F = () => n();
      t[21] = n;
      t[22] = F;
    } else {
      F = t[22];
    }
    let H;
    if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
      H = Ah.jsx(Text, {
        children: "Claude in Chrome works with the Chrome extension to let you control your browser directly from Claude Code. Navigate websites, fill forms, capture screenshots, record GIFs, and debug with console logs and network requests."
      });
      t[23] = H;
    } else {
      H = t[23];
    }
    let U;
    if (t[24] !== i) {
      U = i && Ah.jsx(Text, {
        color: "error",
        children: "Claude in Chrome is not supported in WSL at this time."
      });
      t[24] = i;
      t[25] = U;
    } else {
      U = t[25];
    }
    let N;
    if (t[26] !== s) {
      N = !s && Ah.jsx(Text, {
        color: "error",
        children: "Claude in Chrome requires a claude.ai subscription."
      });
      t[26] = s;
      t[27] = N;
    } else {
      N = t[27];
    }
    let W;
    if (t[28] !== E || t[29] !== M || t[30] !== C || t[31] !== P || t[32] !== f || t[33] !== n || t[34] !== L || t[35] !== l || t[36] !== p || t[37] !== g) {
      W = !P && Ah.jsxs(Ah.Fragment, {
        children: [!b && Ah.jsxs(gXd, {
          flexDirection: "column",
          children: [Ah.jsxs(Text, {
            children: ["Status:", " ", C ? Ah.jsx(Text, {
              color: "success",
              children: "Enabled"
            }) : Ah.jsx(Text, {
              color: "inactive",
              children: "Disabled"
            })]
          }), Ah.jsxs(Text, {
            children: ["Extension:", " ", f ? Ah.jsx(Text, {
              color: "success",
              children: "Installed"
            }) : Ah.jsx(Text, {
              color: "warning",
              children: "Not detected"
            })]
          }), C && A ? Ah.jsxs(Text, {
            children: ["Browser: ", Ah.jsx(Text, {
              color: "success",
              children: A
            })]
          }) : null]
        }), g === "select-browser" && E ? Ah.jsx(Coc, {
          chromeClient: E,
          onDone: K => {
            if (y("menu"), c(bnf), K) {
              n(K);
            }
          }
        }) : Ah.jsx(xr, {
          options: L,
          onChange: M,
          hideIndexes: true
        }, l), p && Ah.jsxs(Text, {
          color: "warning",
          children: ["Once installed, select ", '"Reconnect extension"', " to connect."]
        }), Ah.jsxs(Text, {
          children: [Ah.jsx(Text, {
            dimColor: true,
            children: "Usage: "
          }), Ah.jsx(Text, {
            children: "claude --chrome"
          }), Ah.jsx(Text, {
            dimColor: true,
            children: " or "
          }), Ah.jsx(Text, {
            children: "claude --no-chrome"
          })]
        }), Ah.jsx(Text, {
          dimColor: true,
          children: "Site-level permissions are inherited from the Chrome extension. Manage permissions in the Chrome extension settings to control which sites Claude can browse, click, and type on."
        })]
      });
      t[28] = E;
      t[29] = M;
      t[30] = C;
      t[31] = P;
      t[32] = f;
      t[33] = n;
      t[34] = L;
      t[35] = l;
      t[36] = p;
      t[37] = g;
      t[38] = W;
    } else {
      W = t[38];
    }
    let j;
    if (t[39] === Symbol.for("react.memo_cache_sentinel")) {
      j = Ah.jsx(eD, {
        url: "https://code.claude.com/docs/en/chrome"
      });
      t[39] = j;
    } else {
      j = t[39];
    }
    let z;
    if (t[40] !== W || t[41] !== U || t[42] !== N) {
      z = Ah.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [H, U, N, W, j]
      });
      t[40] = W;
      t[41] = U;
      t[42] = N;
      t[43] = z;
    } else {
      z = t[43];
    }
    let V;
    if (t[44] !== z || t[45] !== F) {
      V = Ah.jsx(or, {
        title: "Claude in Chrome",
        onCancel: F,
        color: "chromeYellow",
        children: z
      });
      t[44] = z;
      t[45] = F;
      t[46] = V;
    } else {
      V = t[46];
    }
    return V;
  }
  function bnf(e) {
    return e + 1;
  }
  function Snf(e) {
    return e + 1;
  }
  function Tnf(e) {
    return e + 1;
  }
  function Enf(e) {
    return e + 1;
  }
  function vnf(e) {
    return e.name === "claude-in-chrome" && e.type === "connected";
  }
  function wnf(e) {
    return e.mcp.clients;
  }
  var koc;
  var hCt;
  var Ah;
  var call_export72 = async function (e) {
    let t = await isChromeExtensionInstalled().catch(s => (logForDebugging(`[Claude in Chrome] Extension detection failed: ${s instanceof Error ? s.message : String(s)}`, {
      level: "error"
    }), false));
    let n = getGlobalConfig();
    let r = isClaudeAISubscriber();
    let o = Me.isWslEnvironment();
    return Ah.jsx(_nf, {
      onDone: e,
      isExtensionInstalled: t,
      configEnabled: n.claudeInChromeDefaultEnabled,
      isClaudeAISubscriber: r,
      isWSL: o
    });
  };
  var Ioc = __lazy(() => {
    $c();
    Ii();
    die();
    et();
    ho();
    no();
    ky();
    b1();
    Gwe();
    je();
    pr();
    gn();
    Rn();
    xoc();
    koc = __toESM(pt(), 1);
    hCt = __toESM(ot(), 1);
    Ah = __toESM(ie(), 1);
  });