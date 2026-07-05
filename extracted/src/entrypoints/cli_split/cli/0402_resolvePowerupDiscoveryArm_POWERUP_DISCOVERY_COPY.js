  __export(vYl, {
    startProTrial: () => startProTrial,
    shouldAutoOpenProTrialExpired: () => shouldAutoOpenProTrialExpired,
    getProTrialState: () => getProTrialState,
    getProTrialDurationDays: () => getProTrialDurationDays,
    formatTrialBadge: () => formatTrialBadge,
    PRO_TRIAL_FALLBACK_DAYS: () => 14
  });
  function getProTrialDurationDays() {
    return getOauthAccountInfo()?.claudeCodeTrialDurationDays ?? null;
  }
  function getProTrialState() {
    let e = Yqr();
    if (e) {
      return Hlr(true, e.endsAt);
    }
    let t = getOauthAccountInfo();
    if (!t || getSubscriptionType() !== "pro") {
      return zWo;
    }
    let n = t.ccOnboardingFlags?.e10 === true;
    return Hlr(n, t.claudeCodeTrialEndsAt ?? null);
  }
  async function startProTrial() {
    return vl("api_pro_trial_start", async () => {
      if (Yqr()) {
        let n = new Date(Date.now() + 14 * 24 * 60 * 60 * 1000).toISOString();
        qni({
          endsAt: n
        });
        return Hlr(true, n);
      }
      let t = await _s.post("/api/oauth/organizations/:orgUUID/claude_code/pro_trial", {}, {
        auth: "teleport-org"
      });
      if (!t.ok) {
        throw Error(t.reason === "no-auth" ? t.detail : `Pro trial start unavailable: ${t.reason}`);
      }
      logForDebugging("Pro trial started", {
        level: "debug"
      });
      W7m(t.data.ends_at);
      return Hlr(true, t.data.ends_at);
    });
  }
  function shouldAutoOpenProTrialExpired() {
    if (getProTrialState().status !== "expired") {
      return false;
    }
    return getGlobalConfig().cachedExtraUsageDisabledReason !== null;
  }
  function formatTrialBadge(e) {
    switch (e.status) {
      case "active":
        {
          let t = e.daysRemaining ?? 0;
          return `Trial: ${t} ${t === 1 ? "day" : "days"} left`;
        }
      case "expired":
        return "Usage credits";
      case "ineligible":
      case "not_started":
        return null;
    }
  }
  function Hlr(e, t) {
    if (!e) {
      return zWo;
    }
    if (!t) {
      return {
        status: "not_started",
        daysRemaining: null
      };
    }
    let n = new Date(t);
    if (Number.isNaN(n.getTime())) {
      Oe(Error(`Invalid claude_code_trial_ends_at: ${t}`));
      return zWo;
    }
    let r = n.getTime() - Date.now();
    if (r <= 0) {
      return {
        status: "expired",
        daysRemaining: 0
      };
    }
    return {
      status: "active",
      daysRemaining: Math.ceil(r / 86400000)
    };
  }
  function W7m(e) {
    saveGlobalConfig(t => {
      if (!t.oauthAccount || t.oauthAccount.claudeCodeTrialEndsAt === e) {
        return t;
      }
      return {
        ...t,
        oauthAccount: {
          ...t.oauthAccount,
          claudeCodeTrialEndsAt: e
        }
      };
    });
  }
  var zWo;
  var Fwt = __lazy(() => {
    no();
    je();
    Rn();
    ln();
    bg();
    jle();
    zWo = {
      status: "ineligible",
      daysRemaining: null
    };
  });
  function jlr() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ochre_hollow", false);
  }
  function CYl() {
    let e = wYl.c(6);
    switch (Me.CLAUDE_CODE_TUI_JUST_SWITCHED) {
      case "fullscreen":
        {
          let t;
          let n;
          let r;
          let o;
          if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
            t = nee.jsxs(Text, {
              children: [nee.jsx(Ps, {
                status: "success",
                withSpace: true
              }), nee.jsx(Text, {
                color: "success",
                children: "Using flicker-free rendering"
              }), nee.jsx(Text, {
                dimColor: true,
                children: " \xB7 if you want to go back, use /tui default"
              })]
            });
            n = nee.jsxs(Text, {
              dimColor: true,
              children: ["  ", "\xB7 Click to move your cursor in the text input"]
            });
            r = nee.jsxs(Text, {
              dimColor: true,
              children: ["  ", "\xB7 Click to expand collapsed tool results"]
            });
            o = nee.jsxs(Text, {
              dimColor: true,
              children: ["  ", "\xB7 By default, text auto-copies when you select it (/config to change)"]
            });
            e[0] = t;
            e[1] = n;
            e[2] = r;
            e[3] = o;
          } else {
            t = e[0];
            n = e[1];
            r = e[2];
            o = e[3];
          }
          let s;
          if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
            s = nee.jsxs(gXd, {
              flexDirection: "column",
              children: [t, n, r, o, nee.jsxs(Text, {
                dimColor: true,
                children: ["  ", "\xB7 Hold ", xMn(), " while selecting to use your terminal's native copy instead"]
              })]
            });
            e[4] = s;
          } else {
            s = e[4];
          }
          return s;
        }
      case "default":
        {
          let t;
          if (e[5] === Symbol.for("react.memo_cache_sentinel")) {
            t = nee.jsx(Text, {
              dimColor: true,
              children: "Switched back to the classic renderer"
            });
            e[5] = t;
          } else {
            t = e[5];
          }
          return t;
        }
      default:
        return null;
    }
  }
  var wYl;
  var nee;
  var qlr = __lazy(() => {
    Tg();
    et();
    $n();
    pr();
    Vf();
    wYl = __toESM(pt(), 1);
    nee = __toESM(ie(), 1);
  });
  function xYl() {
    let e = RYl.c(40);
    let {
      columns: t
    } = Sr();
    let n = bt(z7m);
    let r = bt(V7m);
    let o = MSt();
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    let p;
    if (e[0] !== n || e[1] !== t || e[2] !== r || e[3] !== o) {
      let k = parseUserSpecifiedModel(o);
      let I = renderModelSetting(o);
      let {
        version: O,
        cwd: M,
        billingType: L,
        agentName: P
      } = Mwt();
      s = n ?? P;
      p = Me.CLAUDE_CODE_TUI_JUST_SWITCHED !== undefined;
      let F = Math.max(t - 15, 20);
      d = truncate(O, Math.max(F - 13, 6));
      let H = tlt(k, r);
      l = null;
      let U = 0;
      {
        let W;
        let j;
        if (e[12] === Symbol.for("react.memo_cache_sentinel")) {
          j = getProTrialState();
          W = formatTrialBadge(j);
          e[12] = W;
          e[13] = j;
        } else {
          W = e[12];
          j = e[13];
        }
        let z = W;
        if (z) {
          let V;
          if (e[14] === Symbol.for("react.memo_cache_sentinel")) {
            V = an(` \xB7 ${z}`);
            e[14] = V;
          } else {
            V = e[14];
          }
          U = V;
          let K;
          if (e[15] === Symbol.for("react.memo_cache_sentinel")) {
            K = RT.jsx(Text, {
              dimColor: true,
              children: " \xB7 "
            });
            e[15] = K;
          } else {
            K = e[15];
          }
          let J;
          if (e[16] === Symbol.for("react.memo_cache_sentinel")) {
            J = RT.jsxs(Text, {
              children: [K, RT.jsx(Text, {
                color: j.status === "expired" ? "suggestion" : "warning",
                children: z
              })]
            });
            e[16] = J;
          } else {
            J = e[16];
          }
          l = J;
        }
      }
      ({
        shouldSplit: i,
        truncatedModel: u,
        truncatedBilling: c
      } = lYl(I + H, L, F - U));
      let N = s ? F - 1 - an(s) - 3 : F;
      a = UUe(M, Math.max(N, 10));
      e[0] = n;
      e[1] = t;
      e[2] = r;
      e[3] = o;
      e[4] = s;
      e[5] = i;
      e[6] = a;
      e[7] = l;
      e[8] = c;
      e[9] = u;
      e[10] = d;
      e[11] = p;
    } else {
      s = e[4];
      i = e[5];
      a = e[6];
      l = e[7];
      c = e[8];
      u = e[9];
      d = e[10];
      p = e[11];
    }
    let m = a;
    let f = s && `@${s}`;
    let h;
    if (e[17] !== f || e[18] !== m) {
      h = [f, m].filter(Boolean);
      e[17] = f;
      e[18] = m;
      e[19] = h;
    } else {
      h = e[19];
    }
    let g = h.join(" \xB7 ");
    let y;
    if (e[20] === Symbol.for("react.memo_cache_sentinel")) {
      y = null ? RT.jsx((null).Mascot, {
        fallback: qs() ? RT.jsx(TKe, {}) : RT.jsx(oZ, {})
      }) : qs() ? RT.jsx(TKe, {}) : RT.jsx(oZ, {});
      e[20] = y;
    } else {
      y = e[20];
    }
    let _;
    if (e[21] === Symbol.for("react.memo_cache_sentinel")) {
      _ = null ? RT.jsx((null).Title, {}) : RT.jsx(Text, {
        bold: true,
        children: "Claude Code"
      });
      e[21] = _;
    } else {
      _ = e[21];
    }
    let b;
    if (e[22] !== d) {
      b = RT.jsxs(Text, {
        children: [_, " ", RT.jsxs(Text, {
          dimColor: true,
          children: ["v", d]
        })]
      });
      e[22] = d;
      e[23] = b;
    } else {
      b = e[23];
    }
    let S;
    if (e[24] !== i || e[25] !== l || e[26] !== c || e[27] !== u) {
      S = i ? RT.jsxs(RT.Fragment, {
        children: [RT.jsx(Text, {
          dimColor: true,
          children: u
        }), RT.jsxs(Text, {
          children: [RT.jsx(Text, {
            dimColor: true,
            children: c
          }), l]
        })]
      }) : RT.jsxs(Text, {
        children: [RT.jsxs(Text, {
          dimColor: true,
          children: [u, " \xB7 ", c]
        }), l]
      });
      e[24] = i;
      e[25] = l;
      e[26] = c;
      e[27] = u;
      e[28] = S;
    } else {
      S = e[28];
    }
    let E;
    if (e[29] !== g) {
      E = g && RT.jsx(Text, {
        dimColor: true,
        children: g
      });
      e[29] = g;
      e[30] = E;
    } else {
      E = e[30];
    }
    let C;
    if (e[31] !== b || e[32] !== S || e[33] !== E) {
      C = RT.jsxs(gXd, {
        flexDirection: "row",
        gap: 2,
        alignItems: "center",
        children: [y, RT.jsxs(gXd, {
          flexDirection: "column",
          children: [b, S, E]
        })]
      });
      e[31] = b;
      e[32] = S;
      e[33] = E;
      e[34] = C;
    } else {
      C = e[34];
    }
    let x;
    if (e[35] !== p) {
      x = p && RT.jsx(gXd, {
        paddingLeft: 2,
        flexDirection: "column",
        marginTop: 1,
        children: RT.jsx(CYl, {})
      });
      e[35] = p;
      e[36] = x;
    } else {
      x = e[36];
    }
    let A;
    if (e[37] !== C || e[38] !== x) {
      A = RT.jsx(IM, {
        children: RT.jsxs(gXd, {
          flexDirection: "column",
          children: [C, x]
        })
      });
      e[37] = C;
      e[38] = x;
      e[39] = A;
    } else {
      A = e[39];
    }
    return A;
  }
  function V7m(e) {
    return e.effortValue;
  }
  function z7m(e) {
    return e.agent;
  }
  var RYl;
  var RT;
  var kYl = __lazy(() => {
    iH();
    ki();
    bc();
    et();
    Fwt();
    ho();
    Fp();
    pr();
    cs();
    zp();
    QZt();
    Eo();
    xEe();
    cMo();
    M7t();
    qlr();
    RYl = __toESM(pt(), 1);
    RT = __toESM(ie(), 1);
  });
  function PYl() {
    let e = AYl.c(63);
    let t = getOauthAccountInfo();
    let n = t?.displayName ?? "";
    let r = useIsScreenReaderEnabled();
    let {
      columns: o
    } = Sr();
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = nQi();
      e[0] = s;
    } else {
      s = e[0];
    }
    let i = s;
    let a = bt(X7m);
    let l = bt(J7m);
    let c = getGlobalConfig();
    let u;
    try {
      u = cYl(3);
    } catch {
      u = [];
    }
    let {
      hasReleaseNotes: d
    } = a7l(c.lastReleaseNotesSeen);
    let p;
    let m;
    if (e[1] !== i) {
      p = () => {
        if (getGlobalConfig().lastReleaseNotesSeen === {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION) {
          return;
        }
        if (saveGlobalConfig(Y7m), i) {
          rQi();
        }
      };
      m = [c, i];
      e[1] = i;
      e[2] = p;
      e[3] = m;
    } else {
      p = e[2];
      m = e[3];
    }
    IYl.useEffect(p, m);
    let f = MSt();
    let h = parseUserSpecifiedModel(f);
    let g = renderModelSetting(f);
    let {
      version: y,
      cwd: _,
      billingType: b,
      agentName: S
    } = Mwt();
    let E = a ?? S;
    let C = tlt(h, l);
    let x = g + C;
    let A;
    if (e[4] !== x) {
      A = truncate(x, 50 - 20);
      e[4] = x;
      e[5] = A;
    } else {
      A = e[5];
    }
    let k = A;
    let I = null;
    {
      let Ie;
      let Ue;
      if (e[6] === Symbol.for("react.memo_cache_sentinel")) {
        Ue = getProTrialState();
        Ie = formatTrialBadge(Ue);
        e[6] = Ie;
        e[7] = Ue;
      } else {
        Ie = e[6];
        Ue = e[7];
      }
      let Ge = Ie;
      if (Ge) {
        let Be;
        if (e[8] === Symbol.for("react.memo_cache_sentinel")) {
          Be = sg.jsx(Text, {
            color: Ue.status === "expired" ? "suggestion" : "warning",
            children: Ge
          });
          e[8] = Be;
        } else {
          Be = e[8];
        }
        I = Be;
      }
    }
    if (!d && !i && !Me.CLAUDE_CODE_FORCE_FULL_LOGO) {
      let Ie;
      if (e[9] === Symbol.for("react.memo_cache_sentinel")) {
        Ie = sg.jsxs(sg.Fragment, {
          children: [sg.jsx(xYl, {}), false]
        });
        e[9] = Ie;
      } else {
        Ie = e[9];
      }
      return Ie;
    }
    let O = Blr(o);
    let M = B2(uc("theme", "dark").value);
    let L = ` ${color("claude", M)("Claude Code")} ${color("inactive", M)(`v${y}`)} `;
    let P = color("claude", M)(" Claude Code ");
    let F = r ? sg.jsxs(Text, {
      children: [sg.jsxs(Text, {
        color: "claude",
        bold: true,
        children: ["Claude Code", " "]
      }), sg.jsxs(Text, {
        dimColor: true,
        children: ["v", y]
      })]
    }) : null;
    let H = r ? {} : {
      borderStyle: "round",
      borderColor: "claude",
      borderText: {
        content: O === "compact" ? P : L,
        position: "top",
        align: "start",
        offset: O === "compact" ? 1 : 3
      }
    };
    if (O === "compact") {
      let Ie = $lr(n);
      if (an(Ie) > o - 4) {
        let kt;
        if (e[10] === Symbol.for("react.memo_cache_sentinel")) {
          kt = $lr(null);
          e[10] = kt;
        } else {
          kt = e[10];
        }
        Ie = kt;
      }
      let Ue = E ? o - 4 - 1 - an(E) - 3 : o - 4;
      let Ge = UUe(_, Math.max(Ue, 10));
      let Be = [E && `@${E}`, Ge].filter(Boolean).join(" \xB7 ");
      let We;
      if (e[11] === Symbol.for("react.memo_cache_sentinel")) {
        We = sg.jsx(gXd, {
          marginY: 1,
          children: null ? sg.jsx((null).Mascot, {
            fallback: sg.jsx(oZ, {})
          }) : sg.jsx(oZ, {})
        });
        e[11] = We;
      } else {
        We = e[11];
      }
      let Ze;
      if (e[12] !== k) {
        Ze = sg.jsx(Text, {
          dimColor: true,
          children: k
        });
        e[12] = k;
        e[13] = Ze;
      } else {
        Ze = e[13];
      }
      let Tt;
      if (e[14] !== Be) {
        Tt = Be && sg.jsx(Text, {
          dimColor: true,
          children: Be
        });
        e[14] = Be;
        e[15] = Tt;
      } else {
        Tt = e[15];
      }
      return sg.jsx(IM, {
        children: sg.jsxs(gXd, {
          flexDirection: "column",
          ...H,
          paddingX: 1,
          paddingY: 1,
          alignItems: r ? undefined : "center",
          width: o,
          children: [F, sg.jsx(Text, {
            bold: true,
            children: Ie
          }), We, Ze, sg.jsx(Text, {
            dimColor: true,
            children: b
          }), Tt, I]
        })
      });
    }
    let U = $lr(n);
    let N = !process.env.IS_DEMO && t?.organizationName ? `${k} \xB7 ${b} \xB7 ${t.organizationName}` : `${k} \xB7 ${b}`;
    let W = E ? 50 - 1 - an(E) - 3 : 50;
    let j = UUe(_, Math.max(W, 10));
    let z = E && `@${E}`;
    let V;
    if (e[16] !== z || e[17] !== j) {
      V = [z, j].filter(Boolean);
      e[16] = z;
      e[17] = j;
      e[18] = V;
    } else {
      V = e[18];
    }
    let K = V.join(" \xB7 ");
    let J = aYl(U, K, N);
    let {
      leftWidth: Q,
      rightWidth: Z
    } = iYl(o, O, J);
    let ne = bYl(u);
    let oe;
    if (i) {
      let Ie;
      if (e[19] === Symbol.for("react.memo_cache_sentinel")) {
        Ie = SYl(Kro());
        e[19] = Ie;
      } else {
        Ie = e[19];
      }
      let Ue;
      if (e[20] !== ne) {
        Ue = [Ie, ne];
        e[20] = ne;
        e[21] = Ue;
      } else {
        Ue = e[21];
      }
      oe = Ue;
    } else {
      let Ie;
      if (e[22] !== ne) {
        Ie = [ne];
        e[22] = ne;
        e[23] = Ie;
      } else {
        Ie = e[23];
      }
      oe = Ie;
    }
    let ee;
    if (e[24] !== F) {
      ee = F && sg.jsx(gXd, {
        paddingX: 1,
        children: F
      });
      e[24] = F;
      e[25] = ee;
    } else {
      ee = e[25];
    }
    let re = O === "horizontal" ? "row" : "column";
    let se = r ? undefined : "center";
    let ae = r ? undefined : 9;
    let de;
    if (e[26] !== U) {
      de = sg.jsx(gXd, {
        marginTop: 1,
        children: sg.jsx(Text, {
          bold: true,
          children: U
        })
      });
      e[26] = U;
      e[27] = de;
    } else {
      de = e[27];
    }
    let be;
    if (e[28] === Symbol.for("react.memo_cache_sentinel")) {
      be = null ? sg.jsx((null).Mascot, {
        fallback: sg.jsx(oZ, {})
      }) : sg.jsx(oZ, {});
      e[28] = be;
    } else {
      be = e[28];
    }
    let fe = r ? undefined : "center";
    let me;
    if (e[29] !== N) {
      me = sg.jsx(Text, {
        dimColor: true,
        children: N
      });
      e[29] = N;
      e[30] = me;
    } else {
      me = e[30];
    }
    let Te;
    if (e[31] !== K) {
      Te = K && sg.jsx(Text, {
        dimColor: true,
        children: K
      });
      e[31] = K;
      e[32] = Te;
    } else {
      Te = e[32];
    }
    let ue;
    if (e[33] !== fe || e[34] !== me || e[35] !== Te || e[36] !== I) {
      ue = sg.jsxs(gXd, {
        flexDirection: "column",
        alignItems: fe,
        children: [me, Te, I]
      });
      e[33] = fe;
      e[34] = me;
      e[35] = Te;
      e[36] = I;
      e[37] = ue;
    } else {
      ue = e[37];
    }
    let ce;
    if (e[38] !== Q || e[39] !== ae || e[40] !== de || e[41] !== ue || e[42] !== se) {
      ce = sg.jsxs(gXd, {
        flexDirection: "column",
        width: Q,
        justifyContent: "space-between",
        alignItems: se,
        minHeight: ae,
        children: [de, be, ue]
      });
      e[38] = Q;
      e[39] = ae;
      e[40] = de;
      e[41] = ue;
      e[42] = se;
      e[43] = ce;
    } else {
      ce = e[43];
    }
    let le;
    if (e[44] !== r || e[45] !== O) {
      le = O === "horizontal" && !r && sg.jsx(gXd, {
        height: "100%",
        borderStyle: "single",
        borderColor: "claude",
        borderDimColor: true,
        borderTop: false,
        borderBottom: false,
        borderLeft: false
      });
      e[44] = r;
      e[45] = O;
      e[46] = le;
    } else {
      le = e[46];
    }
    let pe;
    if (e[47] !== oe || e[48] !== O || e[49] !== Z) {
      pe = O === "horizontal" && sg.jsx(gYl, {
        feeds: oe,
        maxWidth: Z
      });
      e[47] = oe;
      e[48] = O;
      e[49] = Z;
      e[50] = pe;
    } else {
      pe = e[50];
    }
    let ve;
    if (e[51] !== ce || e[52] !== le || e[53] !== pe || e[54] !== re) {
      ve = sg.jsxs(gXd, {
        flexDirection: re,
        paddingX: 1,
        gap: 1,
        children: [ce, le, pe]
      });
      e[51] = ce;
      e[52] = le;
      e[53] = pe;
      e[54] = re;
      e[55] = ve;
    } else {
      ve = e[55];
    }
    let _e;
    if (e[56] !== H || e[57] !== ve || e[58] !== ee) {
      _e = sg.jsx(IM, {
        children: sg.jsxs(gXd, {
          flexDirection: "column",
          ...H,
          children: [ee, ve]
        })
      });
      e[56] = H;
      e[57] = ve;
      e[58] = ee;
      e[59] = _e;
    } else {
      _e = e[59];
    }
    let xe;
    if (e[60] === Symbol.for("react.memo_cache_sentinel")) {
      xe = false;
      e[60] = xe;
    } else {
      xe = e[60];
    }
    let ke;
    if (e[61] !== _e) {
      ke = sg.jsxs(sg.Fragment, {
        children: [_e, xe]
      });
      e[61] = _e;
      e[62] = ke;
    } else {
      ke = e[62];
    }
    return ke;
  }
  function Y7m(e) {
    if (e.lastReleaseNotesSeen === {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION) {
      return e;
    }
    return {
      ...e,
      lastReleaseNotesSeen: {
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
  function J7m(e) {
    return e.effortValue;
  }
  function X7m(e) {
    return e.agent;
  }
  var AYl;
  var IYl;
  var sg;
  var OYl = __lazy(() => {
    et();
    ki();
    bc();
    QZt();
    cs();
    M7t();
    yYl();
    TYl();
    zg();
    NJ();
    Ejt();
    kYl();
    Fwt();
    xEe();
    LYe();
    pr();
    ho();
    Fp();
    iH();
    Eo();
    no();
    AYl = __toESM(pt(), 1);
    IYl = __toESM(ot(), 1);
    sg = __toESM(ie(), 1);
  });
  function MYl(e) {
    let t = DYl.c(5);
    let {
      message: n,
      isTranscriptMode: r
    } = e;
    if (!(r && n.type === "assistant" && n.message.model && n.message.content.some(Q7m))) {
      return null;
    }
    let s = an(n.message.model) + 8;
    let i;
    if (t[0] !== n.message.model) {
      i = QWo.jsx(Text, {
        dimColor: true,
        children: n.message.model
      });
      t[0] = n.message.model;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== s || t[3] !== i) {
      a = QWo.jsx(gXd, {
        minWidth: s,
        children: i
      });
      t[2] = s;
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    return a;
  }
  function Q7m(e) {
    return e.type === "text";
  }
  var DYl;
  var QWo;
  var NYl = __lazy(() => {
    bc();
    et();
    DYl = __toESM(pt(), 1);
    QWo = __toESM(ie(), 1);
  });
  function FYl(e) {
    let t = LYl.c(10);
    let {
      message: n,
      isTranscriptMode: r,
      showMessageTimestamps: o
    } = e;
    let s = o === undefined ? false : o;
    if (!(n.timestamp && n.type === "assistant" && (s || r && n.message.content.some(Z7m)))) {
      return null;
    }
    let a;
    let l;
    let c;
    if (t[0] !== n.timestamp) {
      l = new Date(n.timestamp).toLocaleTimeString("en-US", {
        hour: "2-digit",
        minute: "2-digit",
        hour12: true
      });
      a = gXd;
      c = an(l);
      t[0] = n.timestamp;
      t[1] = a;
      t[2] = l;
      t[3] = c;
    } else {
      a = t[1];
      l = t[2];
      c = t[3];
    }
    let u;
    if (t[4] !== l) {
      u = ZWo.jsx(Text, {
        dimColor: true,
        children: l
      });
      t[4] = l;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== a || t[7] !== c || t[8] !== u) {
      d = ZWo.jsx(a, {
        minWidth: c,
        children: u
      });
      t[6] = a;
      t[7] = c;
      t[8] = u;
      t[9] = d;
    } else {
      d = t[9];
    }
    return d;
  }
  function Z7m(e) {
    return e.type === "text";
  }
  var LYl;
  var ZWo;
  var UYl = __lazy(() => {
    bc();
    et();
    LYl = __toESM(pt(), 1);
    ZWo = __toESM(ie(), 1);
  });
  function HYl(e, t, n, r) {
    for (let o = t + 1; o < e.length; o++) {
      let s = e[o];
      if (s?.type === "assistant") {
        let i = s.message.content[0];
        if (i?.type === "thinking" || i?.type === "redacted_thinking") {
          continue;
        }
        if (i?.type === "tool_use") {
          if (w8e(i.name, i.input, n).isCollapsible) {
            continue;
          }
          if (r.vZc(i.id)) {
            continue;
          }
        }
        return true;
      }
      if (s?.type === "system" || s?.type === "attachment") {
        continue;
      }
      if (s?.type === "user") {
        if (s.message.content[0]?.type === "tool_result") {
          continue;
        }
      }
      if (s?.type === "grouped_tool_use") {
        let i = s.messages[0]?.message.content[0]?.input;
        if (w8e(s.toolName, i, n).isCollapsible) {
          continue;
        }
      }
      return true;
    }
    return false;
  }
  function eYm(e) {
    let t = BYl.c(73);
    let {
      message: n,
      isUserContinuation: r,
      hasContentAfter: o,
      tools: s,
      commands: i,
      verbose: a,
      showMessageTimestamps: l,
      inProgressToolUseIDs: c,
      streamingToolUseIDs: u,
      screen: d,
      canAnimate: p,
      onOpenRateLimitOptions: m,
      latestBashOutputUUID: f,
      columns: h,
      isLoading: g,
      lookups: y
    } = e;
    let _ = d === "transcript";
    let b = n.type === "grouped_tool_use";
    let S = n.type === "collapsed_read_search";
    let E;
    if (t[0] !== o || t[1] !== c || t[2] !== S || t[3] !== g || t[4] !== n) {
      E = S && (uwo(n, c) || g && !o);
      t[0] = o;
      t[1] = c;
      t[2] = S;
      t[3] = g;
      t[4] = n;
      t[5] = E;
    } else {
      E = t[5];
    }
    let C = E;
    let x;
    if (t[6] !== S || t[7] !== b || t[8] !== n) {
      x = b ? n.displayMessage : S ? a8a(n) : n;
      t[6] = S;
      t[7] = b;
      t[8] = n;
      t[9] = x;
    } else {
      x = t[9];
    }
    let A = x;
    let k;
    if (t[10] !== S || t[11] !== b || t[12] !== y || t[13] !== n) {
      k = b || S ? [] : VYl(n, y);
      t[10] = S;
      t[11] = b;
      t[12] = y;
      t[13] = n;
      t[14] = k;
    } else {
      k = t[14];
    }
    let I = k;
    let O;
    if (t[15] !== c || t[16] !== S || t[17] !== b || t[18] !== y || t[19] !== n || t[20] !== d || t[21] !== u) {
      let J = b || S ? Vlr : GYl(n, y);
      O = WYl(n, u, c, J, d, y);
      t[15] = c;
      t[16] = S;
      t[17] = b;
      t[18] = y;
      t[19] = n;
      t[20] = d;
      t[21] = u;
      t[22] = O;
    } else {
      O = t[22];
    }
    let M = O;
    let L = false;
    if (p) {
      if (b) {
        let J;
        if (t[23] !== c || t[24] !== n.messages) {
          let Q;
          if (t[26] !== c) {
            Q = Z => {
              let ne = Z.message.content[0];
              return ne?.type === "tool_use" && c.vZc(ne.id);
            };
            t[26] = c;
            t[27] = Q;
          } else {
            Q = t[27];
          }
          J = n.messages.some(Q);
          t[23] = c;
          t[24] = n.messages;
          t[25] = J;
        } else {
          J = t[25];
        }
        L = J;
      } else if (S) {
        let J;
        if (t[28] !== c || t[29] !== n) {
          J = uwo(n, c);
          t[28] = c;
          t[29] = n;
          t[30] = J;
        } else {
          J = t[30];
        }
        L = J;
      } else {
        let J;
        if (t[31] !== c || t[32] !== n) {
          let Q = eCe(n);
          J = !Q || c.vZc(Q);
          t[31] = c;
          t[32] = n;
          t[33] = J;
        } else {
          J = t[33];
        }
        L = J;
      }
    }
    let P;
    if (t[34] !== A.message || t[35] !== A.timestamp || t[36] !== A.type || t[37] !== _ || t[38] !== l) {
      P = A.type === "assistant" && (l || _ && A.message.content.some(tYm)) && (A.timestamp || A.message.model);
      t[34] = A.message;
      t[35] = A.timestamp;
      t[36] = A.type;
      t[37] = _;
      t[38] = l;
      t[39] = P;
    } else {
      P = t[39];
    }
    let F = P;
    let H = !F;
    let U = F ? undefined : h;
    let N;
    if (t[40] !== i || t[41] !== c || t[42] !== C || t[43] !== M || t[44] !== _ || t[45] !== r || t[46] !== f || t[47] !== y || t[48] !== n || t[49] !== m || t[50] !== I || t[51] !== L || t[52] !== H || t[53] !== U || t[54] !== s || t[55] !== a) {
      N = Zwe.jsx(dZ, {
        message: n,
        lookups: y,
        addMargin: H,
        containerWidth: U,
        tools: s,
        commands: i,
        verbose: a,
        inProgressToolUseIDs: c,
        progressMessagesForMessage: I,
        shouldAnimate: L,
        shouldShowDot: true,
        isTranscriptMode: _,
        isStatic: M,
        onOpenRateLimitOptions: m,
        isActiveCollapsedGroup: C,
        isUserContinuation: r,
        latestBashOutputUUID: f
      });
      t[40] = i;
      t[41] = c;
      t[42] = C;
      t[43] = M;
      t[44] = _;
      t[45] = r;
      t[46] = f;
      t[47] = y;
      t[48] = n;
      t[49] = m;
      t[50] = I;
      t[51] = L;
      t[52] = H;
      t[53] = U;
      t[54] = s;
      t[55] = a;
      t[56] = N;
    } else {
      N = t[56];
    }
    let W = N;
    if (!F) {
      let J;
      if (t[57] !== W) {
        J = Zwe.jsx(IM, {
          children: W
        });
        t[57] = W;
        t[58] = J;
      } else {
        J = t[58];
      }
      return J;
    }
    let j;
    if (t[59] !== A || t[60] !== _ || t[61] !== l) {
      j = Zwe.jsx(FYl, {
        message: A,
        isTranscriptMode: _,
        showMessageTimestamps: l
      });
      t[59] = A;
      t[60] = _;
      t[61] = l;
      t[62] = j;
    } else {
      j = t[62];
    }
    let z;
    if (t[63] !== A || t[64] !== _) {
      z = Zwe.jsx(MYl, {
        message: A,
        isTranscriptMode: _
      });
      t[63] = A;
      t[64] = _;
      t[65] = z;
    } else {
      z = t[65];
    }
    let V;
    if (t[66] !== z || t[67] !== j) {
      V = Zwe.jsxs(gXd, {
        flexDirection: "row",
        justifyContent: "flex-end",
        gap: 1,
        marginTop: 1,
        children: [j, z]
      });
      t[66] = z;
      t[67] = j;
      t[68] = V;
    } else {
      V = t[68];
    }
    let K;
    if (t[69] !== h || t[70] !== W || t[71] !== V) {
      K = Zwe.jsx(IM, {
        children: Zwe.jsxs(gXd, {
          width: h,
          flexDirection: "column",
          children: [V, W]
        })
      });
      t[69] = h;
      t[70] = W;
      t[71] = V;
      t[72] = K;
    } else {
      K = t[72];
    }
    return K;
  }
  function tYm(e) {
    return e.type === "text";
  }
  function nYm(e, t) {
    if (e.type === "grouped_tool_use") {
      return e.messages.some(r => {
        let o = r.message.content[0];
        return o?.type === "tool_use" && t.vZc(o.id);
      });
    }
    if (e.type === "collapsed_read_search") {
      return fgt(e).some(o => t.vZc(o));
    }
    let n = eCe(e);
    return !!n && t.vZc(n);
  }
  function rYm(e, t) {
    if (e.type === "grouped_tool_use") {
      return e.messages.every(r => {
        let o = r.message.content[0];
        return o?.type === "tool_use" && t.vZc(o.id);
      });
    }
    if (e.type === "collapsed_read_search") {
      return fgt(e).every(o => t.vZc(o));
    }
    if (e.type === "assistant") {
      let r = e.message.content[0];
      if (r?.type === "server_tool_use") {
        return t.vZc(r.id);
      }
    }
    let n = eCe(e);
    return !n || t.vZc(n);
  }
  function oYm(e, t) {
    if (e.message !== t.message) {
      return false;
    }
    if (e.screen !== t.screen) {
      return false;
    }
    if (e.verbose !== t.verbose) {
      return false;
    }
    if (e.showMessageTimestamps !== t.showMessageTimestamps) {
      return false;
    }
    if (e.message.type === "collapsed_read_search" && t.screen !== "transcript") {
      return false;
    }
    if (e.columns !== t.columns) {
      return false;
    }
    let n = e.latestBashOutputUUID === e.message.uuid;
    let r = t.latestBashOutputUUID === t.message.uuid;
    if (n !== r) {
      return false;
    }
    let o = nYm(e.message, e.streamingToolUseIDs);
    let s = rYm(e.message, e.lookups.resolvedToolUseIDs);
    if (o || !s) {
      return false;
    }
    return true;
  }
  var BYl;
  var $Yl;
  var Zwe;
  var jYl;
  var qYl = __lazy(() => {
    et();
    FNe();
    ro();
    sTt();
    NYl();
    een();
    UYl();
    xEe();
    BYl = __toESM(pt(), 1);
    $Yl = __toESM(ot(), 1);
    Zwe = __toESM(ie(), 1);
    jYl = $Yl.memo(eYm, oYm);
  });
  function zlr(e) {
    if (e.type !== "attachment") {
      return false;
    }
    if (e.attachment.type === "hook_cancelled") {
      return !(e.attachment.hookEvent === "UserPromptSubmit" && e.attachment.timedOut);
    }
    return iYm.vZc(e.attachment.type);
  }
  var sYm;
  var iYm;
  var eGo = __lazy(() => {
    sYm = ["hook_success", "hook_additional_context", "command_permissions", "agent_mention", "budget_usd", "critical_system_reminder", "edited_image_file", "edited_text_file", "opened_file_in_ide", "output_style", "plan_mode", "plan_mode_exit", "plan_mode_reentry", "structured_output", "team_context", "todo_reminder", "context_efficiency", "fold_nudge", "deferred_tools_delta", "mcp_instructions_delta", "memory_update", "token_usage", "total_tokens_reminder", "ultrathink_effort", "max_turns_reached", "task_reminder", "tool_search_usage_reminder", "auto_mode", "auto_mode_exit", "output_token_usage", "date_change", "workflow_keyword_request", "ultra_effort_enter", "ultra_effort_exit"];
    iYm = new Set(sYm);
  });
  function zYl() {
    return tGo.useSyncExternalStore(_Lt, Gle);
  }
  function KYl(e) {
    return tGo.useSyncExternalStore(_Lt, () => l8(e));
  }
  var tGo;
  var nGo = __lazy(() => {
    $Y();
    tGo = __toESM(ot(), 1);
  });
  function JYl() {
    return YYl.useSyncExternalStore(gDn, NIe);
  }
  var YYl;
  var XYl = __lazy(() => {
    c$t();
    YYl = __toESM(ot(), 1);
  });
  function Klr() {
    let e = getSettingsForSource("policySettings");
    return e !== null && Object.keys(e).length > 0;
  }
  var rGo = __lazy(() => {});
  var QYl = {};
  __export(QYl, {
    resolvePowerupDiscoveryArm: () => resolvePowerupDiscoveryArm,
    POWERUP_DISCOVERY_COPY: () => POWERUP_DISCOVERY_COPY
  });
  function resolvePowerupDiscoveryArm() {
    let e = Me.CLAUDE_CODE_POWERUP_ONBOARDING;
    if (e === "banner" || e === "step") {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_birch_lantern", "off");
  }
  var POWERUP_DISCOVERY_COPY;
  var Ylr = __lazy(() => {
    $n();
    pr();
    POWERUP_DISCOVERY_COPY = {
      heading: "Learn the moves",
      body: "Quick lessons on the things power users do \u2014 plan mode, undo, " + "subagents, memory. About 5 minutes. Come back any time with /powerup.",
      banner: "New here? Type /powerup for a 5-minute tour \u2014 modes, undo, " + "@-mentions, and how to teach Claude your rules."
    };
  });
  function tJl() {
    let e = ZYl.c(30);
    let [t] = eJl.useState(uYm);
    let {
      channels: n,
      disabled: r,
      is3P: o,
      policyBlocked: s,
      list: i,
      unmatched: a
    } = t;
    if (n.length === 0) {
      return null;
    }
    let l = n.some(cYm);
    let c = getHasDevChannels() && l ? "Channels" : getHasDevChannels() ? "--dangerously-load-development-channels" : "--channels";
    if (o) {
      let m;
      if (e[0] !== c || e[1] !== i) {
        m = vH.jsxs(Text, {
          color: "warning",
          children: [c, " ignored (", i, ")"]
        });
        e[0] = c;
        e[1] = i;
        e[2] = m;
      } else {
        m = e[2];
      }
      let f;
      if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
        f = vH.jsx(Text, {
          dimColor: true,
          children: "Channels are not available on third-party providers"
        });
        e[3] = f;
      } else {
        f = e[3];
      }
      let h;
      if (e[4] !== m) {
        h = vH.jsxs(gXd, {
          flexDirection: "column",
          children: [m, f]
        });
        e[4] = m;
        e[5] = h;
      } else {
        h = e[5];
      }
      return h;
    }
    if (r) {
      let m;
      if (e[6] !== c || e[7] !== i) {
        m = vH.jsxs(Text, {
          color: "warning",
          children: [c, " ignored (", i, ")"]
        });
        e[6] = c;
        e[7] = i;
        e[8] = m;
      } else {
        m = e[8];
      }
      let f;
      if (e[9] === Symbol.for("react.memo_cache_sentinel")) {
        f = vH.jsx(Text, {
          dimColor: true,
          children: "Channels are not currently available"
        });
        e[9] = f;
      } else {
        f = e[9];
      }
      let h;
      if (e[10] !== m) {
        h = vH.jsxs(gXd, {
          flexDirection: "column",
          children: [m, f]
        });
        e[10] = m;
        e[11] = h;
      } else {
        h = e[11];
      }
      return h;
    }
    if (s) {
      let m;
      if (e[12] !== c || e[13] !== i) {
        m = vH.jsxs(Text, {
          color: "warning",
          children: [c, " blocked by org policy (", i, ")"]
        });
        e[12] = c;
        e[13] = i;
        e[14] = m;
      } else {
        m = e[14];
      }
      let f;
      let h;
      if (e[15] === Symbol.for("react.memo_cache_sentinel")) {
        f = vH.jsx(Text, {
          dimColor: true,
          children: "Inbound messages will be silently dropped"
        });
        h = vH.jsx(Text, {
          dimColor: true,
          children: "Have an administrator set channelsEnabled: true in managed settings to enable"
        });
        e[15] = f;
        e[16] = h;
      } else {
        f = e[15];
        h = e[16];
      }
      let g;
      if (e[17] !== a) {
        g = a.map(lYm);
        e[17] = a;
        e[18] = g;
      } else {
        g = e[18];
      }
      let y;
      if (e[19] !== m || e[20] !== g) {
        y = vH.jsxs(gXd, {
          flexDirection: "column",
          children: [m, f, h, g]
        });
        e[19] = m;
        e[20] = g;
        e[21] = y;
      } else {
        y = e[21];
      }
      return y;
    }
    let u;
    if (e[22] !== c || e[23] !== i) {
      u = vH.jsxs(Text, {
        dimColor: true,
        children: ["Channels (experimental) messages from ", i, " inject directly in this session \xB7 restart without ", c, " to stop"]
      });
      e[22] = c;
      e[23] = i;
      e[24] = u;
    } else {
      u = e[24];
    }
    let d;
    if (e[25] !== a) {
      d = a.map(aYm);
      e[25] = a;
      e[26] = d;
    } else {
      d = e[26];
    }
    let p;
    if (e[27] !== u || e[28] !== d) {
      p = vH.jsxs(gXd, {
        flexDirection: "column",
        children: [u, d]
      });
      e[27] = u;
      e[28] = d;
      e[29] = p;
    } else {
      p = e[29];
    }
    return p;
  }
  function aYm(e) {
    return vH.jsxs(Text, {
      color: "warning",
      children: [ten(e.entry), " \xB7 ", e.why]
    }, `${ten(e.entry)}:${e.why}`);
  }
  function lYm(e) {
    return vH.jsxs(Text, {
      color: "warning",
      children: [ten(e.entry), " \xB7 ", e.why]
    }, `${ten(e.entry)}:${e.why}`);
  }
  function cYm(e) {
    return !e.dev;
  }
  function uYm() {
    let e = getAllowedChannels();
    if (e.length === 0) {
      return {
        channels: e,
        disabled: false,
        is3P: false,
        policyBlocked: false,
        list: "",
        unmatched: []
      };
    }
    let t = e.map(ten).join(", ");
    let n = getSettingsForSource("policySettings");
    let r = getEffectiveChannelAllowlist(n?.allowedChannelPlugins);
    return {
      channels: e,
      disabled: !isChannelsEnabled(),
      is3P: getAPIProvider() !== "firstParty",
      policyBlocked: isChannelsPolicyBlocked(n),
      list: t,
      unmatched: dYm(e, r)
    };
  }
  function ten(e) {
    return e.kind === "plugin" ? `plugin:${e.name}@${e.marketplace}` : `server:${e.name}`;
  }
  function dYm(e, t) {
    let n = ["enterprise", "user", "project", "local"];
    let r = new Set();
    for (let l of n) {
      for (let c of Object.keys(getMcpConfigsByScope(l).servers)) {
        r.add(c);
      }
    }
    let o = Object.keys(Kw().plugins);
    let {
      entries: s,
      source: i
    } = t;
    let a = [];
    for (let l of e) {
      if (l.kind === "server") {
        if (!r.vZc(l.name)) {
          a.push({
            entry: l,
            why: "no MCP server configured with that name"
          });
        }
        if (!l.dev) {
          a.push({
            entry: l,
            why: "server: entries need --dangerously-load-development-channels"
          });
        }
        continue;
      }
      if (!Bre(o, `${l.name}@${l.marketplace}`)) {
        a.push({
          entry: l,
          why: "plugin not installed"
        });
      }
      if (!l.dev && !s.some(c => c.plugin === l.name && c.marketplace === l.marketplace)) {
        a.push({
          entry: l,
          why: i === "org" ? "not on your org's approved channels list" : "not on the approved channels allowlist"
        });
      }
    }
    return a;
  }
  var ZYl;
  var eJl;
  var vH;
  var nJl = __lazy(() => {
    at();
    et();
    MTt();
    qKe();
    Iw();
    Ds();
    Qk();
    Kf();
    ZYl = __toESM(pt(), 1);
    eJl = __toESM(ot(), 1);
    vH = __toESM(ie(), 1);
  });
  function tCe(e) {
    let t = rJl.c(3);
    let {
      children: n,
      command: r
    } = e;
    let o = r ? ` \xB7 ${r}` : "";
    let s;
    if (t[0] !== n || t[1] !== o) {
      s = Jlr.jsx(gXd, {
        children: Jlr.jsxs(Text, {
          dimColor: true,
          children: [n, o]
        })
      });
      t[0] = n;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    return s;
  }
  var rJl;
  var Jlr;
  var Xlr = __lazy(() => {
    et();
    rJl = __toESM(pt(), 1);
    Jlr = __toESM(ie(), 1);
  });
  function sJl() {
    let e = MSt();
    let t = oJl.useMemo(getModelSourceAnnotation, [e]);
    let n = Qir();
    if (!t && !n) {
      return null;
    }
    let r = t && n ? `${t.slice(0, -1)}, auto-updated)` : n ? " (auto-updated)" : t;
    return iJl.jsxs(tCe, {
      command: "/model",
      children: ["Using ", renderModelSetting(e), r]
    });
  }
  var oJl;
  var iJl;
  var aJl = __lazy(() => {
    iH();
    Eo();
    Zir();
    Xlr();
    oJl = __toESM(ot(), 1);
    iJl = __toESM(ie(), 1);
  });
  function cJl(e) {
    let t = lJl.c(4);
    let {
      messages: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r;
    if (t[0] !== n) {
      r = n.map(pYm);
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] !== r) {
      o = $Ye.jsx(gXd, {
        flexDirection: "column",
        children: r
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    return o;
  }
  function pYm(e) {
    return $Ye.jsxs(gXd, {
      flexDirection: "row",
      children: [$Ye.jsx(Ps, {
        status: "warning",
        withSpace: true
      }), $Ye.jsxs(Text, {
        color: "warning",
        children: [e, $Ye.jsx(Text, {
          dimColor: true,
          children: " \xB7 run claude install to repair"
        })]
      })]
    }, e);
  }
  var lJl;
  var $Ye;
  var uJl = __lazy(() => {
    et();
    Vf();
    lJl = __toESM(pt(), 1);
    $Ye = __toESM(ie(), 1);
  });
  function dJl() {
    let e = nen.useMemo(iGo, []);
    let t = nen.useMemo(() => getGlobalConfig().lastShownEmergencyTip, []);
    let n = aGo(e) && (e.persistent || e.tip !== t);
    if (nen.useEffect(() => {
      if (n && !e.persistent) {
        saveGlobalConfig(r => {
          if (r.lastShownEmergencyTip === e.tip) {
            return r;
          }
          return {
            ...r,
            lastShownEmergencyTip: e.tip
          };
        });
      }
    }, [n, e.tip, e.persistent]), !n) {
      return null;
    }
    return sGo.jsx(gXd, {
      paddingLeft: 2,
      flexDirection: "column",
      children: sGo.jsx(Text, {
        ...(e.color === "warning" ? {
          color: "warning"
        } : e.color === "error" ? {
          color: "error"
        } : {
          dimColor: true
        }),
        children: e.tip
      })
    });
  }
  function iGo() {
    return getDynamicConfig_CACHED_MAY_BE_STALE("tengu-top-of-feed-tip", fYm);
  }
  function aGo(e) {
    if (!e.tip) {
      return false;
    }
    if (!Array.isArray(e.taints) || e.taints.length === 0) {
      return true;
    }
    return e.taints.some(l8);
  }
  var nen;
  var sGo;
  var fYm;
  var pJl = __lazy(() => {
    et();
    $n();
    $Y();
    nen = __toESM(ot(), 1);
    sGo = __toESM(ie(), 1);
    fYm = {
      tip: "",
      color: "dim"
    };
  });
  function hJl() {
    let e = getInitialSettings().companyAnnouncements;
    return !!e && e.some(t => t);
  }
  function gJl(e) {
    if (Qlr !== null) {
      return Qlr;
    }
    let t = (getInitialSettings().companyAnnouncements ?? []).filter(r => r);
    if (t.length === 0) {
      return null;
    }
    let n = getGlobalConfig().numStartups === 1 ? t[0] : t[Math.floor(Math.random() * t.length)];
    if (!n) {
      return null;
    }
    if (e) {
      Qlr = n;
    }
    return n;
  }
  function hYm() {
    Qlr = null;
  }
  function yJl() {
    let e = mJl.c(7);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = getOauthAccountInfo();
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let r = P8e();
    let [o] = fJl.useState(gYm);
    let s;
    if (e[1] !== r || e[2] !== o) {
      s = r ? gJl(true) : o;
      e[1] = r;
      e[2] = o;
      e[3] = s;
    } else {
      s = e[3];
    }
    let i = s;
    if (!i) {
      return null;
    }
    let a;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      a = !process.env.IS_DEMO && n?.organizationName && ren.jsxs(Text, {
        dimColor: true,
        children: ["Message from ", n.organizationName, ":"]
      });
      e[4] = a;
    } else {
      a = e[4];
    }
    let l;
    if (e[5] !== i) {
      l = ren.jsxs(gXd, {
        flexDirection: "column",
        children: [a, ren.jsx(Text, {
          children: i
        })]
      });
      e[5] = i;
      e[6] = l;
    } else {
      l = e[6];
    }
    return l;
  }
  function gYm() {
    return gJl(false);
  }
  var mJl;
  var fJl;
  var ren;
  var Qlr = null;
  var _Jl = __lazy(() => {
    et();
    no();
    I8e();
    HEe();
    mJl = __toESM(pt(), 1);
    fJl = __toESM(ot(), 1);
    ren = __toESM(ie(), 1);
    Ope(hYm);
  });
  async function yYm(e = "claude_code_guest_pass") {
    let t = await _s.get(`/api/oauth/organizations/:orgUUID/referral/eligibility?campaign=${encodeURIComponent(e)}`, {
      auth: "teleport-org",
      timeout: 5000
    });
    if (!t.ok) {
      throw Error(t.reason === "no-auth" ? t.detail : `Referral eligibility unavailable: ${t.reason}`);
    }
    return t.data;
  }
  async function TJl(e = "claude_code_guest_pass") {
    return vl("api_referral_redemptions_fetch", async () => {
      let t = await _s.get(`/api/oauth/organizations/:orgUUID/referral/redemptions?campaign=${encodeURIComponent(e)}`, {
        auth: "teleport-org",
        timeout: 1e4
      });
      if (!t.ok) {
        throw Error(t.reason === "no-auth" ? t.detail : `Referral redemptions unavailable: ${t.reason}`);
      }
      return t.data;
    });
  }
  function EJl() {
    let e = getSubscriptionType();
    return !!(getOauthAccountInfo()?.organizationUuid && isClaudeAISubscriber() && (e === "max" || e === "pro"));
  }
  function Bwt() {
    if (!EJl()) {
      return {
        eligible: false,
        needsRefresh: false,
        hasCache: false
      };
    }
    let e = getOauthAccountInfo()?.organizationUuid;
    if (!e) {
      return {
        eligible: false,
        needsRefresh: false,
        hasCache: false
      };
    }
    let n = getGlobalConfig().passesEligibilityCache?.[e];
    if (!n) {
      return {
        eligible: false,
        needsRefresh: true,
        hasCache: false
      };
    }
    let {
      eligible: r,
      timestamp: o
    } = n;
    let i = Date.now() - o > 86400000;
    return {
      eligible: r,
      needsRefresh: i,
      hasCache: true
    };
  }
  function $wt(e) {
    return Ky(e.amount_minor_units, e.currency, "fit");
  }
  function Hwt() {
    let e = getOauthAccountInfo()?.organizationUuid;
    if (!e) {
      return null;
    }
    return getGlobalConfig().passesEligibilityCache?.[e]?.referrer_reward ?? null;
  }
  function Zlr() {
    let e = getOauthAccountInfo()?.organizationUuid;
    if (!e) {
      return null;
    }
    return getGlobalConfig().passesEligibilityCache?.[e]?.remaining_passes ?? null;
  }
  async function bJl() {
    if (oen) {
      logForDebugging("Passes: Reusing in-flight eligibility fetch");
      return oen;
    }
    let e = getOauthAccountInfo()?.organizationUuid;
    if (!e) {
      return null;
    }
    oen = (async () => {
      try {
        let t = await yYm();
        let n = {
          ...t,
          timestamp: Date.now()
        };
        saveGlobalConfig(r => ({
          ...r,
          passesEligibilityCache: {
            ...r.passesEligibilityCache,
            [e]: n
          }
        }));
        logForDebugging(`Passes eligibility cached for org ${e}: ${t.eligible}`);
        Pe("api_referral_eligibility_fetch");
        return t;
      } catch (t) {
        logForDebugging(`Failed to fetch and cache passes eligibility: ${t instanceof Error ? t.message : String(t)}`, {
          level: "error"
        });
        Ae("api_referral_eligibility_fetch", "request_failed");
        return null;
      } finally {
        oen = null;
      }
    })();
    return oen;
  }
  async function lGo() {
    if (!EJl()) {
      return null;
    }
    let e = getOauthAccountInfo()?.organizationUuid;
    if (!e) {
      return null;
    }
    let n = getGlobalConfig().passesEligibilityCache?.[e];
    let r = Date.now();
    if (!n) {
      logForDebugging("Passes: No cache, fetching eligibility in background (command unavailable this session)");
      bJl();
      return null;
    }
    if (r - n.timestamp > 86400000) {
      logForDebugging("Passes: Cache stale, returning cached data and refreshing in background");
      bJl();
      let {
        timestamp: i,
        ...a
      } = n;
      return a;
    }
    logForDebugging("Passes: Using fresh cached eligibility data");
    let {
      timestamp: o,
      ...s
    } = n;
    return s;
  }
  async function vJl() {
    if (Vi()) {
      return;
    }
    lGo();
  }
  var oen = null;
  var HYe = __lazy(() => {
    no();
    Wve();
    je();
    Wd();
    ln();
    bg();
  });
  function _Ym() {
    let e = Zlr();
    if (e == null || e <= 0) {
      return;
    }
    let n = getGlobalConfig().passesLastSeenRemaining ?? 0;
    if (e > n) {
      saveGlobalConfig(r => ({
        ...r,
        passesUpsellSeenCount: 0,
        hasVisitedPasses: false,
        passesLastSeenRemaining: e
      }));
    }
  }
  function wJl() {
    let {
      eligible: e,
      hasCache: t
    } = Bwt();
    if (!e || !t) {
      return false;
    }
    _Ym();
    let n = getGlobalConfig();
    if ((n.passesUpsellSeenCount ?? 0) >= 3) {
      return false;
    }
    if (n.hasVisitedPasses) {
      return false;
    }
    return true;
  }
  function bYm() {
    let e = 0;
    saveGlobalConfig(t => (e = (t.passesUpsellSeenCount ?? 0) + 1, {
      ...t,
      passesUpsellSeenCount: e
    }));
    logEvent("tengu_guest_passes_upsell_shown", {
      seen_count: e
    });
  }
  function SYm() {
    let e = cGo.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      let n = Hwt();
      t = BUe.jsxs(Text, {
        dimColor: true,
        children: [BUe.jsx(Text, {
          color: "claude",
          children: "[\u273B]"
        }), " ", BUe.jsx(Text, {
          color: "claude",
          children: "[\u273B]"
        }), " ", BUe.jsx(Text, {
          color: "claude",
          children: "[\u273B]"
        }), " \xB7", " ", n ? `Share Claude Code and earn ${$wt(n)} in usage credits \xB7 /passes` : "3 guest passes at /passes"]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function CJl() {
    let e = cGo.c(1);
    mz("guest-passes", bYm);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = BUe.jsx(gXd, {
        children: BUe.jsx(SYm, {})
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var cGo;
  var BUe;
  var RJl = __lazy(() => {
    et();
    Ot();
    HYe();
    HEe();
    cGo = __toESM(pt(), 1);
    BUe = __toESM(ie(), 1);
  });
  function ecr(e) {
    let t = [];
    let n = /(^|[\s\u3002\u3001\uFF1F\uFF01])(\/[a-zA-Z][a-zA-Z0-9.:\-_]*)/g;
    let r = null;
    while ((r = n.exec(e)) !== null) {
      let o = r[1] ?? "";
      let s = (r[2] ?? "").replace(/\.+$/, "");
      let i = r.index + o.length;
      t.push({
        start: i,
        end: i + s.length
      });
    }
    return t;
  }
  function EYm(e) {
    let t = tcr.c(9);
    let {
      text: n,
      style: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = [];
      let l = 0;
      for (let {
        start: c,
        end: u
      } of ecr(n)) {
        if (c > l) {
          o.push(n.slice(l, c));
        }
        let d = n.slice(c, u).replace(/[:\-_]+$/, "");
        o.push(iB.jsx(Text, {
          bold: true,
          color: "permission",
          children: d
        }, c));
        l = c + d.length;
      }
      if (l < n.length) {
        let c;
        if (t[2] !== l || t[3] !== n) {
          c = n.slice(l);
          t[2] = l;
          t[3] = n;
          t[4] = c;
        } else {
          c = t[4];
        }
        o.push(c);
      }
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = r === "bold";
    let i = r === "dim";
    let a;
    if (t[5] !== o || t[6] !== s || t[7] !== i) {
      a = iB.jsx(Text, {
        bold: s,
        dimColor: i,
        children: o
      });
      t[5] = o;
      t[6] = s;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  function ncr() {
    if (!mZ()?.command) {
      return false;
    }
    if (PLe()) {
      return Xve() !== null;
    }
    return aTt();
  }
  function vYm(e) {
    if ($Ue !== null) {
      return $Ue;
    }
    if (!ncr()) {
      return null;
    }
    let t = mZ();
    if (!t) {
      return null;
    }
    let n = {
      variant: PLe() ? "credit" : "upsell",
      campaign: t,
      cached: Xve()
    };
    if (e) {
      $Ue = n;
    }
    return n;
  }
  function wYm() {
    $Ue = null;
  }
  function kJl() {
    let e = tcr.c(4);
    let t = P8e();
    let n;
    if (e[0] !== t) {
      n = vYm(t);
      e[0] = t;
      e[1] = n;
    } else {
      n = e[1];
    }
    let r = n;
    if (r === null) {
      return null;
    }
    let o;
    if (e[2] !== r.variant) {
      o = iB.jsx(CYm, {
        variant: r.variant
      });
      e[2] = r.variant;
      e[3] = o;
    } else {
      o = e[3];
    }
    return o;
  }
  function CYm(e) {
    let t = tcr.c(23);
    let {
      variant: n
    } = e;
    let [r] = xJl.useState(xYm);
    let o = $Ue !== null ? $Ue.campaign : r.campaign;
    let s = $Ue !== null ? $Ue.cached : r.cached;
    let i = Boolean(o?.command) && (n === "upsell" || s !== null);
    let a;
    if (t[0] !== o || t[1] !== n) {
      a = () => {
        if (!o) {
          return;
        }
        logEvent("tengu_fotw_nudge_shown", {
          feature: o.feature,
          campaign: "feature_of_the_week",
          audience: n === "credit" ? "claimant" : "viewer"
        });
      };
      t[0] = o;
      t[1] = n;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== i) {
      l = {
        enabled: i
      };
      t[3] = i;
      t[4] = l;
    } else {
      l = t[4];
    }
    if (mz("fotw-nudge", a, l), !o?.command) {
      return null;
    }
    let c = o.hideCommandChip !== true;
    let u;
    if (t[5] !== o.announcementLines || t[6] !== o.command || t[7] !== o.commandBlurb || t[8] !== o.titleLabel || t[9] !== c) {
      u = o.announcementLines?.length ? iB.jsx(gXd, {
        flexDirection: "column",
        children: o.announcementLines.map(RYm)
      }) : iB.jsxs(Text, {
        children: [iB.jsx(Text, {
          bold: true,
          children: o.titleLabel ?? "Feature of the week:"
        }), c ? iB.jsxs(iB.Fragment, {
          children: [" ", iB.jsxs(Text, {
            bold: true,
            color: "permission",
            children: ["/", o.command]
          })]
        }) : null, o.commandBlurb ? `${c ? " \u2014 " : " "}${o.commandBlurb}` : ""]
      });
      t[5] = o.announcementLines;
      t[6] = o.command;
      t[7] = o.commandBlurb;
      t[8] = o.titleLabel;
      t[9] = c;
      t[10] = u;
    } else {
      u = t[10];
    }
    let d = u;
    if (n === "upsell") {
      let _;
      if (t[11] !== d) {
        _ = iB.jsx(gXd, {
          flexDirection: "column",
          children: d
        });
        t[11] = d;
        t[12] = _;
      } else {
        _ = t[12];
      }
      return _;
    }
    if (s === null) {
      return null;
    }
    let p;
    if (t[13] !== s.amountMinorUnits || t[14] !== s.currency) {
      p = Ky(s.amountMinorUnits, s.currency, "fit");
      t[13] = s.amountMinorUnits;
      t[14] = s.currency;
      t[15] = p;
    } else {
      p = t[15];
    }
    let m = p;
    let f = o.redeemBy ? ` \xB7 Redeem by ${o.redeemBy}` : "";
    let h;
    if (t[16] !== m || t[17] !== f) {
      h = iB.jsxs(Text, {
        children: ["Get ", m, " in usage credits when you run it", f]
      });
      t[16] = m;
      t[17] = f;
      t[18] = h;
    } else {
      h = t[18];
    }
    let g;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      g = iB.jsxs(Text, {
        dimColor: true,
        children: ["Terms apply: ", "https://www.anthropic.com/legal/promotion-terms"]
      });
      t[19] = g;
    } else {
      g = t[19];
    }
    let y;
    if (t[20] !== d || t[21] !== h) {
      y = iB.jsxs(gXd, {
        flexDirection: "column",
        children: [d, h, g]
      });
      t[20] = d;
      t[21] = h;
      t[22] = y;
    } else {
      y = t[22];
    }
    return y;
  }
  function RYm(e, t) {
    return iB.jsx(EYm, {
      text: e.text,
      style: e.style
    }, t);
  }
  function xYm() {
    return {
      campaign: mZ(),
      cached: Xve()
    };
  }
  var tcr;
  var xJl;
  var iB;
  var $Ue = null;
  var AJl = __lazy(() => {
    et();
    Ot();
    lTt();
    Wve();
    I8e();
    HEe();
    tcr = __toESM(pt(), 1);
    xJl = __toESM(ot(), 1);
    iB = __toESM(ie(), 1);
    Ope(wYm);
  });
  function PJl({
    char: e = Hte
  }) {
    let t = useIsScreenReaderEnabled();
    let [n] = ien.useState(() => WC(getInitialSettings().prefersReducedMotion));
    let [r, o] = ien.useState(n || t);
    let s = ien.useRef(null);
    let [i, a] = useAnimationFrame(r ? null : 50);
    if (useTimeout(() => o(true), r ? null : AYm, [r]), r) {
      return sen.jsx(gXd, {
        ref: i,
        children: sen.jsx(Text, {
          color: IYm,
          children: e
        })
      });
    }
    if (s.current === null) {
      s.current = a;
    }
    let c = (a - s.current) / 1500 * 360 % 360;
    let u = Rb() ? BLn(c) : c;
    return sen.jsx(gXd, {
      ref: i,
      children: sen.jsx(Text, {
        color: _1(HLn(u)),
        children: e
      })
    });
  }
  var ien;
  var sen;
  var AYm;
  var IYm;
  var OJl = __lazy(() => {
    wl();
    mT();
    et();
    Dre();
    Ore();
    ien = __toESM(ot(), 1);
    sen = __toESM(ie(), 1);
    AYm = 1500 * 2;
    IYm = _1({
      r: 153,
      g: 153,
      b: 153
    });
  });
  function MJl() {
    if (tPe() !== "downsell_on") {
      return false;
    }
    return (getGlobalConfig().fullscreenDownsellSeenCount ?? 0) < 5;
  }
  function NJl() {
    let e = uGo.c(1);
    mz("fullscreen-downsell", PYm);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = Tie.jsx(OYm, {});
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function PYm() {
    let e = 0;
    if (saveGlobalConfig(t => (e = (t.fullscreenDownsellSeenCount ?? 0) + 1, {
      ...t,
      fullscreenDownsellSeenCount: e
    })), logEvent("tengu_fullscreen_downsell_shown", {
      seen_count: e
    }), e >= 5 && getInitialSettings().tui === undefined) {
      let {
        error: t
      } = updateSettingsForSource("userSettings", {
        tui: "fullscreen"
      });
      if (t) {
        logForDebugging(`fullscreen downsell graduation persist failed: ${t.message}`, {
          level: "error"
        });
        return;
      }
      logEvent("tengu_fullscreen_downsell_persisted", {
        seen_count: e
      });
    }
  }
  function OYm() {
    let e = uGo.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = Tie.jsxs(gXd, {
        flexDirection: "column",
        children: [Tie.jsxs(gXd, {
          flexDirection: "row",
          children: [Tie.jsx(PJl, {}), Tie.jsx(Text, {
            color: "autoAccept",
            children: " Using flicker-free rendering"
          })]
        }), Tie.jsxs(Text, {
          dimColor: true,
          children: ["  ", "\xB7 Scroll with your trackpad, scroll wheel, or PageUp/PageDown"]
        }), Tie.jsxs(Text, {
          dimColor: true,
          children: ["  ", "\xB7 Select text to copy \u2014 copying is automatic (/config to disable)"]
        }), Tie.jsxs(Text, {
          dimColor: true,
          children: ["  ", "\xB7 Click to move your cursor or expand collapsed results"]
        }), Tie.jsxs(Text, {
          dimColor: true,
          children: ["  ", "\xB7 /tui default to go back (saved to your preferences)"]
        })]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var uGo;
  var Tie;
  var LJl = __lazy(() => {
    et();
    Ot();
    je();
    zp();
    OJl();
    HEe();
    uGo = __toESM(pt(), 1);
    Tie = __toESM(ie(), 1);
  });
  function $Jl() {
    let e = getDynamicConfig_CACHED_MAY_BE_STALE("tengu_startup_announcements", FJl);
    let t = DYm().safeParse(e);
    return t.success ? t.data : FJl;
  }
  function HJl(e) {
    return e.requiresModel === undefined || isModelAllowed(e.requiresModel);
  }
  function ocr(e) {
    if (rcr !== undefined) {
      return rcr;
    }
    let t = getGlobalConfig().announcementImpressions ?? {};
    let n = $Jl().filter(r => (t[r.id] ?? 0) < r.maxImpressions && HJl(r)).sort((r, o) => o.priority - r.priority)[0];
    if (e && n !== undefined) {
      rcr = n;
    }
    return n;
  }
  function jJl() {
    let e = $Jl().filter(HJl).sort((t, n) => n.priority - t.priority)[0];
    if (e === undefined) {
      return false;
    }
    return JSON.stringify({
      id: e.id,
      title: e.title,
      text: e.text
    });
  }
  function MYm() {
    rcr = undefined;
  }
  function qJl() {
    let e = UJl.c(14);
    let t = P8e();
    let [n] = BJl.useState(NYm);
    let r;
    if (e[0] !== t || e[1] !== n) {
      r = t ? ocr(true) : n;
      e[0] = t;
      e[1] = n;
      e[2] = r;
    } else {
      r = e[2];
    }
    let o = r;
    let s;
    if (e[3] !== o) {
      s = () => {
        if (!o) {
          return;
        }
        saveGlobalConfig(d => ({
          ...d,
          announcementImpressions: {
            ...d.announcementImpressions,
            [o.id]: (d.announcementImpressions?.[o.id] ?? 0) + 1
          }
        }));
      };
      e[3] = o;
      e[4] = s;
    } else {
      s = e[4];
    }
    let i = o !== undefined;
    let a;
    if (e[5] !== i) {
      a = {
        enabled: i
      };
      e[5] = i;
      e[6] = a;
    } else {
      a = e[6];
    }
    if (mz("startup-announcement", s, a), !o) {
      return null;
    }
    let l;
    if (e[7] !== o.title) {
      l = o.title ? aen.jsx(Text, {
        color: "claude",
        children: o.title
      }) : null;
      e[7] = o.title;
      e[8] = l;
    } else {
      l = e[8];
    }
    let c;
    if (e[9] !== o.text) {
      c = aen.jsx(cy, {
        children: o.text
      });
      e[9] = o.text;
      e[10] = c;
    } else {
      c = e[10];
    }
    let u;
    if (e[11] !== l || e[12] !== c) {
      u = aen.jsxs(gXd, {
        flexDirection: "column",
        children: [l, c]
      });
      e[11] = l;
      e[12] = c;
      e[13] = u;
    } else {
      u = e[13];
    }
    return u;
  }
  function NYm() {
    return ocr(false);
  }
  var UJl;
  var BJl;
  var aen;
  var DYm;
  var FJl;
  var rcr;
  var dGo = __lazy(() => {
    qg();
    et();
    $n();
    YN();
    I8e();
    sH();
    HEe();
    UJl = __toESM(pt(), 1);
    BJl = __toESM(ot(), 1);
    aen = __toESM(ie(), 1);
    DYm = we(() => Ke.array(Ke.object({
      id: Ke.string(),
      title: Ke.string().optional(),
      text: Ke.string(),
      priority: Ke.number().default(0),
      maxImpressions: Ke.number().default(3),
      requiresModel: Ke.string().optional()
    })).default([]));
    FJl = [];
    Ope(MYm);
  });
  function QYm(e) {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_harbor_notice", true)) {
      return false;
    }
    if (!e.replBridgeAutoOnByDefault) {
      return false;
    }
    if (!isBridgeEnabled()) {
      return false;
    }
    if (!isPolicyLimitsCacheLoaded()) {
      return false;
    }
    if (getRemoteControlPolicyVerdict() !== "allowed") {
      return false;
    }
    return (getGlobalConfig().seenNotifications?.[jwt] ?? 0) < 3;
  }
  function ZYm() {
    saveGlobalConfig(e => {
      let t = e.seenNotifications ?? {};
      let n = t["remote-control-auto-on"] ?? 0;
      if (n >= 3) {
        return e;
      }
      return {
        ...e,
        seenNotifications: {
          ...t,
          ["remote-control-auto-on"]: n + 1
        }
      };
    });
  }
  function tJm(e) {
    let t = mGo.c(4);
    let {
      ctx: n
    } = e;
    mz("remote-control-auto-on", ZYm);
    let r;
    if (t[0] !== n.replBridgeSessionUrl) {
      r = n.replBridgeSessionUrl ?? `${ZGt()}/code`;
      t[0] = n.replBridgeSessionUrl;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = r;
    let s;
    if (t[2] !== o) {
      s = Su.jsxs(tCe, {
        children: ["/remote-control is active \xB7 Continue here, on your phone, or at ", o]
      });
      t[2] = o;
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  function rJm() {
    let e = mGo.c(1);
    mz("powerup-discovery", oJm);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = Su.jsx(tCe, {
        children: POWERUP_DISCOVERY_COPY.banner
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function oJm() {
    return logEvent("tengu_powerup_discovery_shown", {
      arm: "banner"
    });
  }
  function YJl(e) {
    return fJm.filter(t => t.isActive(e));
  }
  function WJl() {
    return ["DISABLE_PROMPT_CACHING", "DISABLE_PROMPT_CACHING_HAIKU", "DISABLE_PROMPT_CACHING_OPUS", "DISABLE_PROMPT_CACHING_SONNET", "DISABLE_PROMPT_CACHING_FABLE"].filter(e => st(process.env[e]));
  }
  function hJm(e, t) {
    switch (e) {
      case "error":
      case "warning":
      case "info":
      case "announcement":
        return true;
    }
  }
  function gJm(e) {
    return e.priority ?? 0;
  }
  function VJl(e) {
    if (e.tier === "announcement") {
      let n = gJm(e);
      if (n >= nCe.org) {
        return [0, -n];
      }
      if (n >= nCe.launch) {
        return [1, -n];
      }
      if (n >= nCe.campaign) {
        return [2, -n];
      }
      return [4, -n];
    }
    let t = GJl.indexOf(e.id);
    return [3, t === -1 ? GJl.length : t];
  }
  function icr() {
    return isEnterpriseSubscriber() || getAPIProvider() !== "firstParty" || Vi();
  }
  function yJm() {
    scr = null;
    pGo = null;
  }
  function JJl(e, t, n) {
    let r = pGo ?? n;
    let o = fGo(e, t, r);
    if (scr === null) {
      if (o.slot !== null) {
        scr = o.slot;
        pGo = {
          suppressPromos: r.suppressPromos
        };
      }
      return o;
    }
    let s = scr;
    if (o.slot?.id === s.id) {
      return o;
    }
    let i = o.slot === null ? 0 : o.slotOverflowCount + 1;
    let a = e.some(l => l.id === s.id);
    return {
      ...o,
      slot: s,
      slotOverflowCount: Math.max(0, i - (a ? 1 : 0))
    };
  }
  function fGo(e, t, {
    suppressPromos: n
  }) {
    let r = e.filter(l => hJm(l.tier, t) && !(l.promo === true && n));
    let o = r.filter(l => l.antOnly !== true && l.tier !== "info" && l.tier !== "announcement");
    let s = r.filter(l => l.antOnly === true);
    let i = r.filter(l => l.antOnly !== true && (l.tier === "info" || l.tier === "announcement"));
    let a = i.find(l => l.claimsFirstShow?.() === true) ?? null;
    if (a === null) {
      for (let l of i) {
        if (a === null) {
          a = l;
          continue;
        }
        let [c, u] = VJl(l);
        let [d, p] = VJl(a);
        if (c < d || c === d && u < p) {
          a = l;
        }
      }
    }
    return {
      warnings: o,
      slot: a,
      slotOverflowCount: a === null ? 0 : i.length - 1,
      ant: s
    };
  }
  var mGo;
  var zJl;
  var Su;
  var nCe;
  var LYm;
  var FYm;
  var UYm;
  var BYm;
  var $Ym;
  var HYm;
  var jYm;
  var qYm;
  var WYm;
  var GYm;
  var VYm;
  var zYm;
  var KYm;
  var YYm;
  var JYm;
  var XYm;
  var eJm;
  var nJm;
  var sJm;
  var iJm;
  var aJm;
  var lJm;
  var cJm;
  var uJm;
  var dJm;
  var pJm;
  var mJm;
  var fJm;
  var GJl;
  var scr = null;
  var pGo = null;
  var hGo = __lazy(() => {
    et();
    bx();
    nwt();
    vo();
    cs();
    Zn();
    Ox();
    no();
    Wd();
    $Y();
    c$t();
    Ds();
    Zir();
    gn();
    rGo();
    pr();
    at();
    Ylr();
    Ot();
    nJl();
    Xlr();
    HEe();
    aJl();
    uJl();
    Eo();
    pJl();
    _Jl();
    RJl();
    AJl();
    LJl();
    A5n();
    dGo();
    lTt();
    I8e();
    je();
    $n();
    mGo = __toESM(pt(), 1);
    zJl = require("path");
    Su = __toESM(ie(), 1);
    nCe = {
      org: 30,
      launch: 20,
      campaign: 15,
      promo: 10,
      hint: 5
    };
    LYm = {
      id: "safe-mode",
      tier: "warning",
      type: "warning",
      isActive: () => Ql(),
      render: () => Su.jsxs(Su.Fragment, {
        children: [Su.jsxs(gA, {
          status: "warning",
          children: ["Safe mode: all customizations are disabled (CLAUDE.md, skills, plugins, hooks, MCP, agents, and more)", Klr() && Su.jsxs(Su.Fragment, {
            children: [" \xB7 ", "managed hooks and settings policy from your organization still apply; managed plugins, skills, CLAUDE.md, and MCP servers do not"]
          })]
        }), Su.jsx(gXd, {
          paddingLeft: 2,
          children: Su.jsx(Text, {
            dimColor: true,
            children: `${DD(UR())} to re-enable`
          })
        })]
      })
    };
    FYm = {
      id: "large-memory-files",
      tier: "warning",
      type: "warning",
      isActive: e => getLargeMemoryFiles(e.memoryFiles).length > 0,
      render: e => {
        let t = getLargeMemoryFiles(e.memoryFiles);
        let n = getMaxMemoryCharacterCount();
        return Su.jsx(Su.Fragment, {
          children: t.map(r => {
            let o = r.path.startsWith(Nt()) ? zJl.relative(Nt(), r.path) : r.path;
            return Su.jsxs(gA, {
              status: "warning",
              children: [Su.jsx(Text, {
                bold: true,
                children: o
              }), " is over the", " ", formatNumber(n), "-char limit (", formatNumber(r.content.length), " chars)", Su.jsx(Text, {
                dimColor: true,
                children: " \xB7 /memory to free up context"
              })]
            }, r.path);
          })
        });
      }
    };
    UYm = {
      id: "claude-ai-external-token",
      tier: "warning",
      type: "warning",
      isActive: () => {
        let e = getAuthTokenSource();
        return isClaudeAISubscriber() && (e.source === "ANTHROPIC_AUTH_TOKEN" || e.source === "apiKeyHelper");
      },
      render: () => {
        let e = getAuthTokenSource();
        return Su.jsx(gXd, {
          marginTop: 1,
          children: Su.jsxs(gA, {
            status: "warning",
            children: [e.source, " overriding Claude subscription login", Su.jsx(Text, {
              dimColor: true,
              children: " \xB7 unset it or /logout to sign it out"
            })]
          })
        });
      }
    };
    BYm = {
      id: "api-key-conflict",
      tier: "warning",
      type: "warning",
      isActive: () => {
        let {
          source: e
        } = getAnthropicApiKeyWithSourceSafe({
          skipRetrievingKeyFromApiKeyHelper: true
        });
        return !!getApiKeyFromConfigOrMacOSKeychain() && (e === "ANTHROPIC_API_KEY" || e === "apiKeyHelper");
      },
      render: () => {
        let {
          source: e
        } = getAnthropicApiKeyWithSourceSafe({
          skipRetrievingKeyFromApiKeyHelper: true
        });
        return Su.jsx(gXd, {
          marginTop: 1,
          children: Su.jsxs(gA, {
            status: "warning",
            children: [e, " overriding saved Console key", Su.jsx(Text, {
              dimColor: true,
              children: " \xB7 unset it or /logout to clear the saved key"
            })]
          })
        });
      }
    };
    $Ym = {
      id: "both-auth-methods",
      tier: "warning",
      type: "warning",
      isActive: () => {
        let {
          source: e
        } = getAnthropicApiKeyWithSourceSafe({
          skipRetrievingKeyFromApiKeyHelper: true
        });
        let t = getAuthTokenSource();
        return e !== "none" && t.source !== "none" && !(e === "apiKeyHelper" && t.source === "apiKeyHelper");
      },
      render: () => {
        let {
          source: e
        } = getAnthropicApiKeyWithSourceSafe({
          skipRetrievingKeyFromApiKeyHelper: true
        });
        let t = getAuthTokenSource();
        return Su.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [Su.jsxs(gA, {
            status: "warning",
            children: ["Both ", t.source, " and ", e, " set \xB7 auth may not work as expected"]
          }), Su.jsxs(gXd, {
            flexDirection: "column",
            paddingLeft: 2,
            children: [Su.jsxs(Text, {
              dimColor: true,
              children: ["\xB7 to use", " ", t.source === "claude.ai" ? "claude.ai" : t.source, ":", " ", e === "ANTHROPIC_API_KEY" ? 'Unset the ANTHROPIC_API_KEY environment variable, or claude /logout then say "No" to the API key approval before login.' : e === "apiKeyHelper" ? "Unset the apiKeyHelper setting." : "claude /logout"]
            }), Su.jsxs(Text, {
              dimColor: true,
              children: ["\xB7 to use ", e, ":", " ", describeHowToDisableAuthTokenSource(t.source)]
            })]
          })]
        });
      }
    };
    HYm = {
      id: "large-agent-descriptions",
      tier: "warning",
      type: "warning",
      isActive: e => sZt(e.agentDefinitions) > 15000,
      render: e => {
        let t = sZt(e.agentDefinitions);
        return Su.jsxs(gA, {
          status: "warning",
          children: ["Agent descriptions are over the", " ", formatNumber(15000), "-token limit (~", formatNumber(t), " tokens)", Su.jsxs(Text, {
            dimColor: true,
            children: [" ", "\xB7 ask Claude to trim agent descriptions in .claude/agents/"]
          })]
        });
      }
    };
    jYm = {
      id: "model-source",
      tier: "info",
      type: "info",
      isActive: e => e.modelRestrictedWarning === null && (getModelSourceAnnotation() !== "" || Qir()),
      render: () => Su.jsx(sJl, {})
    };
    qYm = {
      id: "install-broken",
      tier: "warning",
      type: "warning",
      isActive: e => e.installBrokenMessages.length > 0,
      render: e => Su.jsx(cJl, {
        messages: e.installBrokenMessages
      })
    };
    WYm = {
      id: "npm-deprecation",
      tier: "warning",
      type: "warning",
      isActive: e => e.npmInstallDeprecated,
      render: () => Su.jsxs(gA, {
        status: "warning",
        children: ["Installed via npm (deprecated)", Su.jsxs(Text, {
          dimColor: true,
          children: [" ", "\xB7 run claude install to switch to the native version"]
        })]
      })
    };
    GYm = {
      id: "mcp-needs-auth",
      tier: "warning",
      type: "warning",
      isActive: e => e.mcpNeedsAuthCount > 0,
      render: e => Su.jsxs(gA, {
        status: "warning",
        children: [e.mcpNeedsAuthCount, " MCP", " ", un(e.mcpNeedsAuthCount, "server needs", "servers need"), " ", "authentication", Su.jsx(Text, {
          dimColor: true,
          children: " \xB7 run /mcp"
        })]
      })
    };
    VYm = {
      id: "model-deprecation",
      tier: "warning",
      type: "warning",
      isActive: e => e.modelDeprecationWarning !== null,
      render: e => e.modelDeprecationWarning === null ? null : Su.jsxs(gA, {
        status: "warning",
        children: [e.modelDeprecationWarning.message, Su.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", e.modelDeprecationWarning.action]
        })]
      })
    };
    zYm = {
      id: "model-restricted",
      tier: "warning",
      type: "warning",
      isActive: e => e.modelRestrictedWarning !== null,
      render: e => e.modelRestrictedWarning === null ? null : Su.jsx(gA, {
        status: "warning",
        children: wse(e.modelRestrictedWarning.requested, e.modelRestrictedWarning.effective)
      })
    };
    KYm = {
      id: "hipaa-compliance",
      tier: "warning",
      type: "info",
      isActive: () => l8("hipaa"),
      render: () => Su.jsxs(gA, {
        status: "info",
        children: ["HIPAA \xB7 some features are restricted", Su.jsx(Text, {
          dimColor: true,
          children: " \xB7 /status for details"
        })]
      })
    };
    YYm = {
      id: "monitoring-notice",
      tier: "warning",
      type: "info",
      isActive: () => NIe() !== null,
      render: () => {
        let e = NIe();
        if (!e) {
          return null;
        }
        return Su.jsxs(gA, {
          status: "info",
          children: [e.text, e.url ? Su.jsxs(Text, {
            dimColor: true,
            children: [" \xB7 ", Su.jsx(Link, {
              url: e.url,
              fallback: e.url,
              children: "learn more"
            })]
          }) : null]
        });
      }
    };
    JYm = {
      id: "debug-mode",
      tier: "info",
      type: "info",
      isActive: () => isDebugMode(),
      render: () => Su.jsxs(tCe, {
        children: ["Debug mode enabled \xB7 logging to", " ", isDebugToStdErr() ? "stderr" : getDebugLogPath()]
      })
    };
    XYm = {
      id: "tmux-session",
      tier: "info",
      type: "info",
      isActive: () => !!process.env.CLAUDE_CODE_TMUX_SESSION,
      render: () => Su.jsxs(tCe, {
        children: ["tmux session: ", process.env.CLAUDE_CODE_TMUX_SESSION, " \xB7 detach with", " ", process.env.CLAUDE_CODE_TMUX_PREFIX_CONFLICTS ? `${process.env.CLAUDE_CODE_TMUX_PREFIX} ${process.env.CLAUDE_CODE_TMUX_PREFIX} d (press prefix twice - Claude uses ${process.env.CLAUDE_CODE_TMUX_PREFIX})` : `${process.env.CLAUDE_CODE_TMUX_PREFIX} d`]
      })
    };
    eJm = {
      id: "remote-control-auto-on",
      tier: "info",
      type: "info",
      claimsFirstShow: () => (getGlobalConfig().seenNotifications?.[jwt] ?? 0) === 0,
      isActive: e => QYm(e),
      render: e => Su.jsx(tJm, {
        ctx: e
      })
    };
    nJm = {
      id: "powerup-discovery",
      tier: "info",
      type: "info",
      isActive: () => getOnboardingShownThisSession() && resolvePowerupDiscoveryArm() === "banner",
      render: () => Su.jsx(rJm, {})
    };
    sJm = {
      id: "emergency-tip",
      tier: "warning",
      type: "warning",
      isActive: () => aGo(iGo()),
      render: () => Su.jsx(dJl, {})
    };
    iJm = {
      id: "channels",
      tier: "info",
      type: "info",
      isActive: () => getAllowedChannels().length > 0,
      render: () => Su.jsx(tJl, {})
    };
    aJm = {
      id: "prompt-caching-disabled",
      tier: "warning",
      type: "warning",
      isActive: () => WJl().length > 0,
      render: () => {
        let e = WJl();
        return Su.jsxs(gA, {
          status: "warning",
          children: ["Prompt caching off (", e.join(", "), "), requests will be slower and cost more", Su.jsx(Text, {
            dimColor: true,
            children: " \xB7 unset it to re-enable"
          })]
        });
      }
    };
    lJm = {
      id: "company-announcement",
      tier: "announcement",
      type: "info",
      promo: false,
      priority: nCe.org,
      isActive: () => hJl(),
      render: () => Su.jsx(yJl, {})
    };
    cJm = {
      id: "startup-announcement",
      tier: "announcement",
      type: "info",
      promo: false,
      priority: nCe.launch,
      isActive: () => ocr(false) !== undefined && !(mZ()?.isTopPriorityAnnouncement === true && ncr()),
      render: () => Su.jsx(qJl, {})
    };
    uJm = {
      id: "fotw-nudge",
      tier: "announcement",
      type: "info",
      promo: false,
      priority: nCe.campaign,
      isActive: () => ncr(),
      render: () => Su.jsx(kJl, {})
    };
    dJm = {
      id: "guest-passes",
      tier: "announcement",
      type: "info",
      promo: true,
      maxImpressions: 3,
      priority: nCe.promo,
      isActive: () => wJl() && !PLe() && !aTt(),
      render: () => Su.jsx(CJl, {})
    };
    pJm = {
      id: "fullscreen-downsell",
      tier: "announcement",
      type: "info",
      promo: false,
      priority: nCe.hint,
      claimsFirstShow: () => (getGlobalConfig().fullscreenDownsellSeenCount ?? 0) === 0,
      isActive: () => Me.CLAUDE_CODE_TUI_JUST_SWITCHED === undefined && MJl(),
      render: () => Su.jsx(NJl, {})
    };
    mJm = {
      id: "subscription-switch",
      tier: "announcement",
      type: "info",
      promo: true,
      maxImpressions: 3,
      priority: nCe.promo,
      isActive: e => e.existingClaudeSubscription !== null,
      render: e => e.existingClaudeSubscription === null ? null : Su.jsx(q8a, {
        subscriptionType: e.existingClaudeSubscription
      })
    };
    fJm = [LYm, FYm, HYm, UYm, BYm, $Ym, iJm, aJm, sJm, jYm, VYm, zYm, qYm, WYm, GYm, KYm, YYm, JYm, XYm, eJm, nJm, lJm, cJm, uJm, dJm, mJm, pJm];
    GJl = ["debug-mode", "model-source", "channels", "tmux-session"];
    Ope(yJm);
  });
  function _Jm() {
    let e = _Go.c(3);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = Qce() ? null : getMemoryFiles();
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let [r, o] = acr.useState(XJl);
    let s;
    let i;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = () => {
        if (n === null) {
          o(XJl);
          return;
        }
        let a = true;
        n.then(l => {
          if (a) {
            o(l);
          }
        }, bJm);
        return () => {
          a = false;
        };
      };
      i = [n];
      e[1] = s;
      e[2] = i;
    } else {
      s = e[1];
      i = e[2];
    }
    acr.useEffect(s, i);
    return r;
  }
  function bJm() {}
  function QJl(e) {
    let t = _Go.c(7);
    let {
      agentDefinitions: n,
      latchAnnouncementSlot: r
    } = e === undefined ? {} : e;
    let o = r === undefined ? true : r;
    let {
      columns: s
    } = Sr();
    let i = Blr(s);
    let a = fw(vJm);
    let l = fw(EJm);
    let c = fw(TJm);
    let u = fw(SJm) ?? 0;
    zYl();
    JYl();
    let d = _Jm();
    let p = getGlobalConfig();
    let m;
    e: {
      let k = a?.modelRestrictedWarning;
      if (!k) {
        m = null;
        break e;
      }
      let I = getMainLoopModel();
      let O = ca(k.requested.trim().toLowerCase());
      if (!isModeDependentModelSetting(O) && O !== "best" && parseUserSpecifiedModel(k.requested).toLowerCase() === I.toLowerCase()) {
        m = null;
        break e;
      }
      m = {
        requested: k.requested,
        effective: I
      };
    }
    let f = {
      config: p,
      agentDefinitions: n,
      memoryFiles: d,
      installBrokenMessages: a?.installBrokenMessages ?? [],
      npmInstallDeprecated: a?.npmInstallDeprecated ?? false,
      modelDeprecationWarning: a?.modelDeprecationWarning ?? null,
      modelRestrictedWarning: m,
      existingClaudeSubscription: a?.existingClaudeSubscription ?? null,
      replBridgeAutoOnByDefault: l ?? false,
      replBridgeSessionUrl: c,
      mcpNeedsAuthCount: u
    };
    let g = (o ? JJl : fGo)(YJl(f), i, {
      suppressPromos: icr()
    });
    let y = g.warnings.length > 0;
    let _ = g.slot !== null;
    let b = g.ant.length > 0;
    let S = xwo;
    let E = IM;
    let C = !y && !_ && !b ? null : ree.jsxs(gXd, {
      flexDirection: "column",
      paddingLeft: 1,
      children: [g.warnings.map(k => ree.jsx(yGo.Fragment, {
        children: k.render(f)
      }, k.id)), g.slot === null ? null : ree.jsxs(gXd, {
        flexDirection: "column",
        marginTop: y ? 1 : 0,
        children: [ree.jsx(gXd, {
          flexDirection: "column",
          paddingLeft: 1,
          borderStyle: "quote",
          borderTop: false,
          borderBottom: false,
          borderRight: false,
          borderColor: g.slot.tier === "announcement" ? "claude" : undefined,
          borderDimColor: g.slot.tier !== "announcement",
          children: g.slot.render(f)
        }), g.slotOverflowCount > 0 && ree.jsx(gXd, {
          paddingLeft: 2,
          children: ree.jsxs(tCe, {
            command: "/status",
            children: ["+", g.slotOverflowCount, " more"]
          })
        })]
      }), b && ree.jsx(gXd, {
        flexDirection: "column",
        paddingLeft: 2,
        marginTop: y || _ ? 1 : 0,
        children: g.ant.map(k => ree.jsx(yGo.Fragment, {
          children: k.render(f)
        }, k.id))
      })]
    });
    let x;
    if (t[0] !== E || t[1] !== C) {
      x = ree.jsx(E, {
        children: C
      });
      t[0] = E;
      t[1] = C;
      t[2] = x;
    } else {
      x = t[2];
    }
    let A;
    if (t[3] !== o || t[4] !== S.Provider || t[5] !== x) {
      A = ree.jsx(S.Provider, {
        value: o,
        children: x
      });
      t[3] = o;
      t[4] = S.Provider;
      t[5] = x;
      t[6] = A;
    } else {
      A = t[6];
    }
    return A;
  }
  function SJm(e) {
    return aGl(e.mcp.clients, A6e);
  }
  function TJm(e) {
    return e.replBridgeSessionUrl;
  }
  function EJm(e) {
    return e.replBridgeAutoOnByDefault;
  }
  function vJm(e) {
    return e.setupIssues;
  }
  var _Go;
  var yGo;
  var acr;
  var ree;
  var XJl;
  var ZJl = __lazy(() => {
    ki();
    et();
    l9();
    nGo();
    XYl();
    ho();
    bx();
    wb();
    QZt();
    Tk();
    Eo();
    pK();
    hGo();
    Xlr();
    HEe();
    xEe();
    _Go = __toESM(pt(), 1);
    yGo = __toESM(ot(), 1);
    acr = __toESM(ot(), 1);
    ree = __toESM(ie(), 1);
    XJl = [];
  });
  function xJm(e) {
    return Math.max(RJm, Math.min(Math.round(e * 1.5), 80));
  }
  function tXl(e, t, n) {
    let r = Ig.useRef(new Map());
    let o = Ig.useRef(0);
    let s = Ig.useRef(0);
    let i = Ig.useRef({
      arr: new Float64Array(0),
      version: -1,
      n: -1
    });
    let a = Ig.useRef(new Map());
    let l = Ig.useRef(new Map());
    let c = Ig.useRef({
      len: 0,
      first: undefined,
      last: undefined
    });
    let u = Ig.useRef(n);
    let d = Ig.useRef(false);
    let p = Ig.useRef(null);
    let m = Ig.useRef(0);
    if (u.current !== n) {
      let Z = u.current / n;
      u.current = n;
      for (let [ne, oe] of r.current) {
        r.current.set(ne, Math.max(1, Math.round(oe * Z)));
      }
      o.current++;
      d.current = true;
      m.current = 2;
    }
    let f = m.current > 0 ? p.current : null;
    let h = Ig.useRef(0);
    let [, g] = Ig.useState(0);
    let y = Ig.useRef(null);
    let _ = Ig.useCallback(Z => e.current?.subscribe(Z) ?? AJm, [e]);
    Ig.useSyncExternalStore(_, () => {
      let Z = e.current;
      if (!Z) {
        return NaN;
      }
      let ne = Z.getScrollTop() + Z.getPendingDelta();
      let oe = Math.floor(ne / 40);
      return Z.isSticky() ? ~oe : oe;
    });
    let b = e.current?.getScrollTop() ?? -1;
    let S = e.current?.getPendingDelta() ?? 0;
    let E = e.current?.getViewportHeight() ?? 0;
    let C = xJm(E);
    let x = e.current?.isSticky() ?? true;
    Ig.useEffect(() => (bgo(x), () => bgo(true)), [x]);
    Ig.useMemo(() => {
      let Z = c.current;
      let ne = t[0];
      let oe = t.length >= Z.len && ne === Z.first && t[Z.len - 1] === Z.last;
      if (Z.len = t.length, Z.first = ne, Z.last = t.at(-1), oe) {
        return;
      }
      let ee = new Set(t);
      let re = false;
      for (let se of r.current.keys()) {
        if (!ee.vZc(se)) {
          r.current.delete(se);
          re = true;
        }
      }
      for (let se of l.current.keys()) {
        if (!ee.vZc(se)) {
          l.current.delete(se);
        }
      }
      if (re) {
        o.current++;
      }
    }, [t]);
    let A = t.length;
    if (i.current.version !== o.current || i.current.n !== A) {
      let Z = i.current.arr.length >= A + 1 ? i.current.arr : new Float64Array(A + 1);
      Z[0] = 0;
      for (let ne = 0; ne < A; ne++) {
        Z[ne + 1] = Z[ne] + (r.current.get(t[ne]) ?? 3);
      }
      i.current = {
        arr: Z,
        version: o.current,
        n: A
      };
    }
    let k = i.current.arr;
    let I = k[A];
    let O;
    let M;
    if (f) {
      [O, M] = f;
      O = Math.min(O, A);
      M = Math.min(M, A);
    } else if (E === 0 || b < 0) {
      O = Math.max(0, A - 30);
      M = A;
    } else {
      if (x) {
        let se = E + C;
        O = A;
        while (O > 0 && I - k[O - 1] < se) {
          O--;
        }
        M = A;
      } else {
        let se = h.current;
        let ae = E * 3;
        let de = Math.min(b, b + S);
        let be = Math.max(b, b + S);
        let fe = be - de;
        let me = fe > ae ? S < 0 ? be - ae : de : de;
        let Te = me + Math.min(fe, ae);
        let ue = Math.max(0, me - se);
        let ce = Te - se;
        let le = ue - C;
        {
          let xe = 0;
          let ke = A;
          while (xe < ke) {
            let Ie = xe + ke >> 1;
            if (k[Ie + 1] <= le) {
              xe = Ie + 1;
            } else {
              ke = Ie;
            }
          }
          O = xe;
        }
        {
          let xe = p.current;
          if (xe && xe[0] < O) {
            for (let ke = xe[0]; ke < Math.min(O, xe[1]); ke++) {
              let Ie = t[ke];
              if (a.current.vZc(Ie) && !r.current.vZc(Ie)) {
                O = ke;
                break;
              }
            }
          }
        }
        let pe = E + 2 * C;
        let ve = Math.min(A, O + 300);
        let _e = 0;
        M = O;
        while (M < ve && (_e < pe || k[M] < ce + E + C)) {
          _e += r.current.get(t[M]) ?? 1;
          M++;
        }
      }
      let Z = E + 2 * C;
      let ne = Math.max(0, M - 300);
      let oe = 0;
      for (let se = O; se < M; se++) {
        oe += r.current.get(t[se]) ?? 1;
      }
      while (O > ne && oe < Z) {
        O--;
        oe += r.current.get(t[O]) ?? 1;
      }
      let ee = p.current;
      let re = Math.abs(b - s.current) + Math.abs(S);
      if (ee && re > E * 2) {
        let [se, ae] = ee;
        if (O < se - 25) {
          O = se - 25;
        }
        if (M > ae + 25) {
          M = ae + 25;
        }
        if (O > M) {
          M = Math.min(O + 25, A);
        }
      }
      s.current = b;
    }
    if (m.current > 0) {
      m.current--;
    } else {
      p.current = [O, M];
    }
    let L = Ig.useDeferredValue(O);
    let P = Ig.useDeferredValue(M);
    let F = O < L ? L : O;
    let H = M > P ? P : M;
    if (F > H || x) {
      F = O;
      H = M;
    }
    if (S > 0) {
      H = M;
    }
    if (H - F > 300) {
      let Z = (k[F] + k[H]) / 2;
      if (b - h.current < Z) {
        H = F + 300;
      } else {
        F = H - 300;
      }
    }
    let U = k[F];
    let N = H === A ? 1 / 0 : Math.max(U, k[H] - E);
    let W = Ig.useRef(null);
    Ig.useLayoutEffect(() => {
      if (x || b < 0 || E === 0) {
        W.current = null;
        return;
      }
      let Z = W.current;
      if (Z && Z.scrollTop === b && S === 0) {
        let re = t[Z.idx] === Z.key ? Z.idx : t.lastIndexOf(Z.key);
        if (re >= 0) {
          let se = k[re];
          let ae = se - Z.offset;
          if (ae !== 0) {
            e.current?.scrollTo(b + ae, {
              preserveHwm: true
            });
            W.current = {
              key: Z.key,
              idx: re,
              offset: se,
              scrollTop: b + ae
            };
            return;
          }
        }
      }
      let ne = Math.max(0, b - h.current);
      let oe = F;
      while (oe + 1 < H && k[oe + 1] <= ne) {
        oe++;
      }
      let ee = t[oe];
      W.current = ee ? {
        key: ee,
        idx: oe,
        offset: k[oe],
        scrollTop: b
      } : null;
    });
    Ig.useLayoutEffect(() => {
      let Z = y.current?.yogaNode;
      if (Z && Z.getComputedWidth() > 0) {
        let ee = Z.getComputedTop();
        let re = h.current;
        if (h.current = ee, re !== 0 && Math.abs(ee - re) > 1) {
          g(se => se + 1);
        }
      }
      let ne = h.current;
      if (x) {
        e.current?.setClampBounds(undefined, undefined);
      } else {
        e.current?.setClampBounds(F === 0 ? 0 : U + ne, N === 1 / 0 ? 1 / 0 : N + ne);
      }
      if (d.current) {
        d.current = false;
        return;
      }
      let oe = false;
      for (let [ee, re] of a.current) {
        let se = re.yogaNode;
        if (!se) {
          continue;
        }
        let ae = se.getComputedHeight();
        let de = r.current.get(ee);
        if (ae > 0) {
          if (de !== ae) {
            r.current.set(ee, ae);
            oe = true;
          }
        } else if (se.getComputedWidth() > 0 && de !== 0) {
          r.current.set(ee, 0);
          oe = true;
        }
      }
      if (oe) {
        o.current++;
      }
    });
    let j = Ig.useCallback(Z => {
      let ne = l.current.get(Z);
      if (!ne) {
        ne = oe => {
          if (oe) {
            a.current.set(Z, oe);
          } else {
            let ee = a.current.get(Z)?.yogaNode;
            if (ee && !d.current) {
              let re = ee.getComputedHeight();
              if ((re > 0 || ee.getComputedWidth() > 0) && r.current.get(Z) !== re) {
                r.current.set(Z, re);
                o.current++;
              }
            }
            a.current.delete(Z);
          }
        };
        l.current.set(Z, ne);
      }
      return ne;
    }, []);
    let z = Ig.useCallback(Z => {
      let ne = a.current.get(t[Z])?.yogaNode;
      if (!ne || ne.getComputedWidth() === 0) {
        return -1;
      }
      return ne.getComputedTop();
    }, [t]);
    let V = Ig.useCallback(Z => a.current.get(t[Z]) ?? null, [t]);
    let K = Ig.useCallback(Z => r.current.get(t[Z]), [t]);
    let J = Ig.useCallback(Z => {
      let ne = i.current;
      if (Z < 0 || Z >= ne.n) {
        return;
      }
      e.current?.scrollTo(ne.arr[Z] + h.current);
    }, [e]);
    let Q = I - k[H];
    return {
      range: [F, H],
      topSpacer: U,
      bottomSpacer: Q,
      measureRef: j,
      spacerRef: y,
      offsets: k,
      getItemTop: z,
      getItemElement: V,
      getItemHeight: K,
      scrollToIndex: J
    };
  }
  var Ig;
  var RJm;
  var AJm = () => {};
  var nXl = __lazy(() => {
    PGt();
    Ig = __toESM(ot(), 1);
    RJm = Math.round(40 * 1.5);
  });
  function SGo(e) {
    let t = lcr.c(6);
    let {
      children: n
    } = e;
    let [r, o] = wH.useState(null);
    let [s, i] = wH.useState(null);
    let a;
    if (t[0] !== n || t[1] !== s) {
      a = den.jsx(sXl.Provider, {
        value: s,
        children: n
      });
      t[0] = n;
      t[1] = s;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== r || t[4] !== a) {
      l = den.jsx(oXl.Provider, {
        value: o,
        children: den.jsx(iXl.Provider, {
          value: i,
          children: den.jsx(rXl.Provider, {
            value: r,
            children: a
          })
        })
      });
      t[3] = r;
      t[4] = a;
      t[5] = l;
    } else {
      l = t[5];
    }
    return l;
  }
  function aXl() {
    return wH.useContext(rXl);
  }
  function lXl() {
    return wH.useContext(sXl);
  }
  function cXl(e) {
    let t = lcr.c(4);
    let n = wH.useContext(oXl);
    let r;
    let o;
    if (t[0] !== e || t[1] !== n) {
      r = () => {
        if (!n) {
          return;
        }
        n(e);
        return () => n(null);
      };
      o = [n, e];
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
    } else {
      r = t[2];
      o = t[3];
    }
    wH.useEffect(r, o);
  }
  function uXl(e) {
    let t = lcr.c(4);
    let n = wH.useContext(iXl);
    let r;
    let o;
    if (t[0] !== e || t[1] !== n) {
      r = () => {
        if (!n) {
          return;
        }
        n(e);
        return () => n(null);
      };
      o = [n, e];
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
    } else {
      r = t[2];
      o = t[3];
    }
    wH.useEffect(r, o);
  }
  var lcr;
  var wH;
  var den;
  var rXl;
  var oXl;
  var sXl;
  var iXl;
  var pen = __lazy(() => {
    lcr = __toESM(pt(), 1);
    wH = __toESM(ot(), 1);
    den = __toESM(ie(), 1);
    rXl = wH.createContext(null);
    oXl = wH.createContext(null);
    sXl = wH.createContext(null);
    iXl = wH.createContext(null);
  });
  class EGo {
    out;
    cols;
    rows;
    buf = "";
    lastFrame = "";
    syncOpen = false;
    suspended = false;
    restored = false;
    tailSlack = 0;
    contentOverlayRows = 0;
    overlayRatchet = 0;
    onScreen = [];
    replayPending = false;
    committedTop = 0;
    nativeHistory = [];
    pumpCursor = -1;
    _backfillNeeded = false;
    _gapRange = null;
    _suspendedCols = 0;
    _suspendedRows = 0;
    contentHeight;
    constructor(e, t, n) {
      this.out = e;
      this.cols = t;
      this.rows = n;
      this.contentHeight = Math.max(2, n - 4);
    }
    setup() {
      this.resetTransientState();
      this.buf += sG;
      this.buf += hm(`
`, this.rows - this.contentHeight);
      this.buf += LJ(1, Math.max(2, this.contentHeight));
      for (let e = this.contentHeight; e < this.rows; e++) {
        this.clearLine(e);
      }
      this.commitImmediate();
    }
    suspend() {
      this.suspended = true;
      this._suspendedCols = this.cols;
      this._suspendedRows = this.rows;
      this.buf += V8;
      this.commitImmediate();
    }
    resume(e, t) {
      this.suspended = false;
      let n = e !== this._suspendedCols || t !== this._suspendedRows;
      if (this.cols = e, this.rows = t, this.contentHeight = Math.max(2, t - 4), this.buf += sG, this.buf += LJ(1, this.contentHeight), this.buf += gv, n) {
        this.buf += o0 + xlt + gv;
        this.resetTransientState();
        this.replayPending = true;
        this.pumpCursor = this.nativeHistory.length > 0 ? 0 : -1;
        this.lastFrame = "";
      }
      this.commitImmediate();
    }
    restore() {
      if (this.restored) {
        return;
      }
      this.restored = true;
      this.buf += "\x1B[0m";
      for (let e = this.contentHeight; e < this.rows; e++) {
        this.clearLine(e);
      }
      this.buf += V8;
      this.buf += rG(this.contentHeight + 1, 1);
      this.buf += WF;
      this.commitImmediate();
    }
    syncViewport(e, t) {
      if (this.suspended) {
        return;
      }
      if (this.pumpCursor >= 0) {
        return;
      }
      if (!this.syncOpen && q2()) {
        this.buf += hHt;
        this.syncOpen = true;
      }
      if (this.restoreUnderContentOverlay(), this.replayPending) {
        this.replayPending = false;
        this.committedTop = Math.min(e.scrollTop, e.transcriptEnd);
      }
      let n = Math.min(e.scrollTop, e.transcriptEnd);
      let r = Math.max(0, n - this.committedTop);
      if (r > 0) {
        let c = Math.min(r, this.onScreen.length);
        if (c > 0) {
          this.buf += rG(this.contentHeight, 1);
          this.buf += `
`.repeat(c);
          for (let d = 0; d < c; d++) {
            this.nativeHistory.push(this.onScreen.shift());
          }
          if (this.nativeHistory.length > 1e4) {
            this.nativeHistory.splice(0, this.nativeHistory.length - 1e4);
          }
        }
        let u = this.committedTop + c;
        if (this.committedTop = n, u < n) {
          this._gapRange = {
            from: u,
            to: n
          };
        }
        if (this.nativeHistory.length === 0 && n > 0) {
          this._backfillNeeded = true;
        }
      }
      if (t !== this.contentHeight) {
        this.contentHeight = t;
        this.buf += LJ(1, Math.max(2, t));
      }
      let o = Math.max(0, this.committedTop - e.scrollTop);
      let s = this.contentHeight;
      let i = Math.min(e.lines.length, s);
      let a = Math.max(0, i - o);
      let l = Math.max(0, s - this.onScreen.length);
      if (this.onScreen.length > s) {
        this.onScreen.length = s;
      }
      while (this.onScreen.length < s) {
        this.onScreen.push("");
      }
      for (let c = 0; c < s; c++) {
        let u = c < a ? e.lines[o + c] : "";
        if (c < s - l && this.onScreen[c] === u) {
          continue;
        }
        this.buf += rG(c + 1, 1) + u + "\x1B[0m" + "\x1B[K";
        this.onScreen[c] = u;
      }
      this.tailSlack = Math.max(0, s - a);
    }
    draw(e) {
      if (this.suspended) {
        return;
      }
      let t = this.syncOpen;
      if (!this.syncOpen && q2()) {
        this.buf += hHt;
      }
      let n = this.buf.length;
      if (this.buf += sG, this.restoreUnderContentOverlay(), e.contentHeight !== this.contentHeight) {
        this.contentHeight = e.contentHeight;
        this.buf += LJ(1, Math.max(2, e.contentHeight));
      }
      for (let s = this.contentHeight; s < this.rows; s++) {
        this.clearLine(s);
      }
      if (this.tailSlack > 0) {
        let s = this.contentHeight - this.tailSlack;
        for (let i = s; i < this.contentHeight; i++) {
          this.clearLine(i);
        }
      }
      this.writeOverlayLines(e.bottomTop, e.bottomLines);
      let r = e.overlayLines.length;
      if (r > 0) {
        this.overlayRatchet = Math.max(this.overlayRatchet, r);
        let s = Math.max(0, this.rows - this.overlayRatchet);
        this.writeOverlayLines(s, e.overlayLines);
        for (let i = s + r; i < this.rows; i++) {
          this.clearLine(i);
        }
        this.contentOverlayRows = Math.max(0, this.contentHeight - Math.max(0, s - 1));
      } else {
        this.overlayRatchet = 0;
        this.contentOverlayRows = 0;
      }
      let o = this.buf.slice(n);
      if (!t && o === this.lastFrame) {
        this.buf = "";
        this.syncOpen = false;
        return;
      }
      if (this.lastFrame = o, q2()) {
        this.buf += jlt;
      }
      this.syncOpen = false;
      this.commitImmediate();
    }
    computeLayout(e, t) {
      let n = Math.max(4, e.length);
      return {
        contentHeight: Math.max(2, this.rows - n),
        bottomTop: this.rows - n,
        bottomLines: e,
        overlayLines: t
      };
    }
    handleResize(e, t) {
      if (e === this.cols && t === this.rows) {
        return "noop";
      }
      if (this.suspended) {
        this.cols = e;
        this.rows = t;
        return "noop";
      }
      let n = e !== this.cols;
      let r = this.rows;
      this.cols = e;
      this.rows = t;
      let o = Math.max(2, t - 4);
      if (this.contentHeight = o, n || t < r) {
        this.buf += V8 + o0 + xlt + gv;
        this.buf += LJ(1, Math.max(2, o));
        this.resetTransientState();
        this.replayPending = true;
        this.pumpCursor = this.nativeHistory.length > 0 ? 0 : -1;
        this.lastFrame = "";
        this.commitImmediate();
        return "replay";
      }
      this.buf += LJ(1, Math.max(2, o));
      this.lastFrame = "";
      this.commitImmediate();
      return "adjust";
    }
    tickPump() {
      if (this.pumpCursor < 0) {
        return false;
      }
      let e = this.nativeHistory;
      this.buf += LJ(1, 2);
      let t = Math.min(this.pumpCursor + 100, e.length);
      for (; this.pumpCursor < t; this.pumpCursor++) {
        this.buf += rG(1, 1) + e[this.pumpCursor] + "\x1B[0m" + "\x1B[K";
        this.buf += rG(2, 1) + `
`;
      }
      if (this.buf += LJ(1, Math.max(2, this.contentHeight)), this.lastFrame = "", this.commitImmediate(), this.pumpCursor >= e.length) {
        this.pumpCursor = -1;
      }
      return this.pumpCursor >= 0;
    }
    consumeBackfillNeeded() {
      if (!this._backfillNeeded) {
        return false;
      }
      this._backfillNeeded = false;
      return true;
    }
    consumeGapRange() {
      let e = this._gapRange;
      this._gapRange = null;
      return e;
    }
    primeBackfill(e) {
      if (e.length === 0) {
        return;
      }
      let t = this.nativeHistory.length;
      for (let n of e) {
        this.nativeHistory.push(n);
      }
      if (this.nativeHistory.length > 1e4) {
        let n = this.nativeHistory.length - 1e4;
        this.nativeHistory.splice(0, n);
        this.pumpCursor = Math.max(0, t - n);
      } else {
        this.pumpCursor = t;
      }
      if (this.replayPending = true, t > 0) {
        this.onScreen.length = 0;
      }
    }
    switchTranscript() {
      this.buf += V8 + o0 + xlt;
      this.buf += gv;
      this.buf += LJ(1, Math.max(2, this.contentHeight));
      this.resetTransientState();
      this.nativeHistory.length = 0;
      this.pumpCursor = -1;
      this.replayPending = true;
      this.lastFrame = "";
      this.commitImmediate();
    }
    restoreUnderContentOverlay() {
      let e = this.contentOverlayRows;
      if (e === 0) {
        return;
      }
      this.contentOverlayRows = 0;
      let t = this.contentHeight;
      let n = this.onScreen.length;
      for (let r = 0; r < e; r++) {
        let o = t - 1 - r;
        if (o < 0) {
          break;
        }
        this.buf += rG(o + 1, 1) + QIe;
        let s = n - 1 - r;
        if (s >= 0) {
          this.buf += this.onScreen[s] + "\x1B[0m";
        }
      }
    }
    resetTransientState() {
      this.tailSlack = 0;
      this.contentOverlayRows = 0;
      this.overlayRatchet = 0;
      this.onScreen.length = 0;
      this.committedTop = 0;
    }
    clearLine(e) {
      this.buf += rG(e + 1, 1) + QIe;
    }
    writeOverlayLines(e, t) {
      for (let n = 0; n < t.length; n++) {
        this.buf += rG(e + n + 1, 1) + t[n] + "\x1B[0m" + "\x1B[K";
      }
    }
    commitImmediate() {
      if (this.buf.length === 0) {
        return;
      }
      this.out.write(this.buf);
      this.buf = "";
    }
    _onScreen() {
      return this.onScreen;
    }
    _committedTop() {
      return this.committedTop;
    }
    _pumpCursor() {
      return this.pumpCursor;
    }
    _nativeHistory() {
      return this.nativeHistory;
    }
    _commitForTest() {
      this.commitImmediate();
    }
    _transient() {
      return {
        tailSlack: this.tailSlack,
        overlayRows: this.contentOverlayRows
      };
    }
  }
  var dXl = __lazy(() => {
    mT();
    c1();
    qJ();
    Zn();
  });
  function ccr(e, t, n) {
    let r = e.width;
    let o = n * r;
    let s = -1;
    for (let c = r - 1; c >= 0; c--) {
      let u = KJ(e, o + c);
      if (u.width === 2) {
        continue;
      }
      if (u.char === " " && (u.styleId & 1) === 0 && u.hyperlink === undefined) {
        continue;
      }
      s = c;
      break;
    }
    if (s < 0) {
      return "";
    }
    let i = "";
    let a = t.none;
    let l;
    for (let c = 0; c <= s; c++) {
      let u = KJ(e, o + c);
      if (u.width === 2 || u.width === 3) {
        continue;
      }
      if (u.hyperlink !== l) {
        if (l !== undefined) {
          i += CWe;
        }
        if (u.hyperlink !== undefined) {
          i += klt(u.hyperlink);
        }
        l = u.hyperlink;
      }
      i += t.transition(a, u.styleId);
      a = u.styleId;
      i += u.char;
    }
    if (l !== undefined) {
      i += CWe;
    }
    if (a !== t.none) {
      i += "\x1B[0m";
    }
    return i;
  }
  var pXl = __lazy(() => {
    iG();
    Tg();
  });
  function fXl() {
    let e = mXl.c(2);
    let t = Gwt.useContext(vGo);
    let n = Gwt.useRef(null);
    let r = t ?? n;
    let o;
    if (e[0] !== r) {
      o = hXl.jsx(oJd, {
        ref: r,
        height: 0
      });
      e[0] = r;
      e[1] = o;
    } else {
      o = e[1];
    }
    return o;
  }
  var mXl;
  var Gwt;
  var hXl;
  var vGo;
  var wGo = __lazy(() => {
    mXl = __toESM(pt(), 1);
    Gwt = __toESM(ot(), 1);
    hXl = __toESM(ie(), 1);
    vGo = Gwt.createContext(null);
  });
  function yXl({
    scrollable: e,
    bottom: t,
    pushUp: n,
    overlay: r,
    scrollRef: o
  }) {
    let s = Sr();
    let i = s.columns;
    let a = s.rows;
    let l = Eie.useRef(null);
    let c = Eie.useRef(null);
    let u = Eie.useRef(null);
    let d = Eie.useRef(null);
    let p = Eie.useRef(null);
    let m = o ?? p;
    Eie.useInsertionEffect(() => {
      let h = rVd.get(process.stdout);
      if (!h) {
        return;
      }
      let g = new EGo(process.stdout, i, a);
      g.setup();
      l.current = g;
      let y = false;
      h.frameSink = (_, b) => {
        let S = l.current;
        if (!S) {
          return false;
        }
        if (h.isAltScreenActive) {
          if (!y) {
            S.suspend();
            y = true;
          }
          return false;
        }
        if (y) {
          y = false;
          S.resume(S.cols, S.rows);
        }
        let E = S.tickPump();
        let C = gXl(_, b, c.current);
        let x = gXl(_, b, u.current);
        let A = S.computeLayout(C, x);
        let k = m.current?.getDomElement() ?? null;
        if (k) {
          let O = Kg.get(k);
          let M = [];
          if (O && O.height > 0) {
            let F = Math.min(O.y + O.height, _.screen.height);
            for (let H = O.y; H < F; H++) {
              M.push(ccr(_.screen, b, H));
            }
          }
          let L = k.scrollHeight ?? 0;
          let P = OJm(d.current, k) ?? L;
          S.syncViewport({
            lines: M,
            scrollTop: k.scrollTop ?? 0,
            scrollHeight: L,
            transcriptEnd: P
          }, A.contentHeight);
        }
        let I = false;
        if (k) {
          let O = S.consumeGapRange();
          let M = S.consumeBackfillNeeded();
          if (O || M) {
            let L = O ? O.from : 0;
            let P = O ? O.to : k.scrollTop ?? 0;
            let F = DJm(k, L, P, S.cols, h.getStylePool());
            if (F.length > 0) {
              S.primeBackfill(F);
              I = true;
            }
          }
        }
        S.draw(A);
        return E || I ? "tick" : true;
      };
      return () => {
        h.frameSink = null;
        g.restore();
        l.current = null;
      };
    }, []);
    let f = Eie.useRef({
      cols: i,
      rows: a
    });
    Eie.useLayoutEffect(() => {
      if (i === f.current.cols && a === f.current.rows) {
        return;
      }
      f.current = {
        cols: i,
        rows: a
      };
      l.current?.handleResize(i, a);
    }, [i, a]);
    return jYe.jsxs(oJd, {
      flexDirection: "column",
      height: a,
      width: "100%",
      flexShrink: 0,
      children: [jYe.jsx(B2m, {
        ref: h => {
          if (m) {
            m.current = h;
          }
        },
        flexGrow: 1,
        flexDirection: "column",
        stickyScroll: true,
        children: jYe.jsx(vGo.Provider, {
          value: d,
          children: e
        })
      }), jYe.jsxs(oJd, {
        ref: c,
        flexDirection: "column",
        flexShrink: 0,
        minHeight: 4,
        maxHeight: a - 2,
        children: [n, t]
      }), r != null ? jYe.jsx(oJd, {
        ref: u,
        flexDirection: "column",
        flexShrink: 0,
        position: "absolute",
        bottom: 0,
        left: 0,
        right: 0,
        opaque: true,
        children: r
      }) : null]
    });
  }
  function OJm(e, t) {
    if (!e) {
      return;
    }
    let n = 0;
    let r = e;
    while (r && r.parentNode !== t) {
      n += r.yogaNode?.getComputedTop() ?? 0;
      r = r.parentNode;
    }
    return r ? n : undefined;
  }
  function DJm(e, t, n, r, o) {
    let s = e.childNodes[0];
    if (!s) {
      return [];
    }
    if ((e.scrollHeight ?? 0) <= 0 || n <= t) {
      return [];
    }
    let a = rVd.get(process.stdout);
    if (!a) {
      return [];
    }
    let l = Math.ceil(n);
    let c = Math.max(0, Math.floor(t), l - 1e4);
    let u = l - c;
    if (u <= 0) {
      return [];
    }
    let d = zJ(r, u, o, a.getCharPool(), a.getHyperlinkPool());
    let p = new lSe({
      width: r,
      height: u,
      stylePool: o,
      screen: d
    });
    p.clip({
      x1: undefined,
      x2: undefined,
      y1: 0,
      y2: u
    });
    let m = Kg.get(s);
    if (i1n(s, p, qWe(), {
      offsetX: 0,
      offsetY: -c,
      prevScreen: undefined
    }), p.unclip(), VHt(s), m) {
      Kg.set(s, m);
    }
    let f = p.get();
    s.dirty = true;
    let h = [];
    for (let g = 0; g < u; g++) {
      h.push(ccr(f, o, g));
    }
    return h;
  }
  function gXl(e, t, n) {
    if (!n) {
      return [];
    }
    let r = Kg.get(n);
    if (!r || r.height <= 0) {
      return [];
    }
    let o = [];
    let s = Math.min(r.y + r.height, e.screen.height);
    for (let i = Math.max(0, r.y); i < s; i++) {
      o.push(ccr(e.screen, t, i));
    }
    return o;
  }
  var Eie;
  var jYe;
  var _Xl = __lazy(() => {
    ki();
    oSe();
    WHt();
    iG();
    dXl();
    pXl();
    wGo();
    Eie = __toESM(ot(), 1);
    jYe = __toESM(ie(), 1);
  });
  function bXl(e) {
    return `rgb(${e & 255},${e >> 8 & 255},${e >> 16 & 255})`;
  }
  var CGo;
  var SXl;
  var JST;
  var XST;
  var LJm;
  var QST;
  var TXl = __lazy(() => {
    ki();
    Llt();
    iG();
    Dno();
    mT();
    et();
    Zn();
    CGo = __toESM(ot(), 1);
    SXl = __toESM(ie(), 1);
    JST = Array.from({
      length: 64
    }, (e, t) => bXl(t * 2043453));
    XST = Array.from({
      length: 64
    }, (e, t) => bXl(t * 461587 + 8405034));
    LJm = [[33, 94], [161, 431], [592, 96], [880, 144], [1024, 256], [8592, 112], [8704, 256], [9472, 128], [9600, 32], [9632, 96]];
    QST = LJm.reduce((e, [, t]) => e + t, 0);
  });
  var FJm;
  var EXl;
  var vXl;
  var iTT;
  var wXl = __lazy(() => {
    SNn();
    jWe();
    pPe();
    et();
    FJm = __toESM(pt(), 1);
    EXl = __toESM(ot(), 1);
    vXl = __toESM(ie(), 1);
    iTT = 25 * 80;
  });
  function xGo() {
    let e = RGo.c(2);
    let t = RXl.useSyncExternalStore(_ct, oKi);
    let n;
    if (e[0] !== t) {
      n = t ? rCe.jsx(HJm, {}) : null;
      e[0] = t;
      e[1] = n;
    } else {
      n = e[1];
    }
    return n;
  }
  function HJm() {
    let e = RGo.c(2);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = VJm(200);
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let r;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = rCe.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [rCe.jsx(Text, {
          dimColor: true,
          children: "\u2500\u2500 scroll test \u2014 disappears when you close the dialog \u2500\u2500"
        }), n.map(jJm)]
      });
      e[1] = r;
    } else {
      r = e[1];
    }
    return r;
  }
  function jJm(e, t) {
    return rCe.jsxs(Text, {
      dimColor: true,
      children: ["  ", e.num, e.text && rCe.jsxs(rCe.Fragment, {
        children: ["  ", e.indent, e.text]
      })]
    }, t);
  }
  function VJm(e) {
    let t = WJm ??= ("Vivere omnes beate volunt sed ad pervidendum quid sit quod beatam vitam efficiat caligant et adeo non est facile consequi beatam vitam ut eo quisque ab ea longius recedat quo ad illam concitatius fertur si via lapsus est quae ubi in contrarium ducit ipsa velocitas maioris intervalli causa fit proponendum est itaque primum quid sit quod adpetamus tunc circumspiciendum qua contendere illo celerrime possimus intellecturi in ipso itinere si modo rectum erit quantum cotidie profligetur quantoque propius ab eo simus ad quod nos cupiditas naturalis inpellit quam diu quidem passim vagamur non ducem secuti sed fremitum et clamorem dissonum in diversa vocantium conteretur vita inter errores brevis etiam si dies noctesque bonae menti laboremus decernatur itaque et quo tendamus et qua non sine perito aliquo cui explorata sint ea in quae procedimus quoniam quidem non eadem hic quae in ceteris peregrinationibus condicio est in illis comprensus aliquis limes et interrogati incolae non patiuntur errare at hic tritissima quaeque via et celeberrima maxime decipit nihil ergo magis praestandum est quam ne pecorum ritu sequamur antecedentium gregem pergentes non quo eundum est sed quo itur atqui nulla res nos maioribus malis implicat quam quod ad rumorem componimur optima rati ea quae magno adsensu recepta sunt quodque exempla nobis pro bonis multa sunt nec ad rationem sed ad similitudinem vivimus ").trim().split(/\s+/);
    let n = String(e).length;
    let r = [];
    let o = 0;
    let s = 0;
    while (r.length < e) {
      let i = CXl[s % CXl.length];
      s++;
      let a = " ".repeat(i.indent);
      for (let l = 0; l < i.lines && r.length < e; l++) {
        let u = l === i.lines - 1 ? 12 + s * 11 % 28 : 56;
        let d = [];
        let p = 0;
        while (p < u) {
          let m = t[o % t.length];
          d.push(m);
          p += m.length + 1;
          o++;
        }
        r.push({
          num: String(r.length + 1).padStart(n),
          text: d.join(" "),
          indent: a
        });
      }
      if (r.length < e) {
        r.push({
          num: String(r.length + 1).padStart(n),
          text: "",
          indent: ""
        });
      }
    }
    return r;
  }
  var RGo;
  var RXl;
  var rCe;
  var WJm;
  var CXl;
  var xXl = __lazy(() => {
    jWe();
    et();
    RGo = __toESM(pt(), 1);
    RXl = __toESM(ot(), 1);
    rCe = __toESM(ie(), 1);
    CXl = [{
      lines: 1,
      indent: 0
    }, {
      lines: 5,
      indent: 0
    }, {
      lines: 3,
      indent: 2
    }, {
      lines: 2,
      indent: 0
    }, {
      lines: 7,
      indent: 0
    }, {
      lines: 4,
      indent: 2
    }, {
      lines: 1,
      indent: 0
    }, {
      lines: 6,
      indent: 0
    }, {
      lines: 2,
      indent: 2
    }, {
      lines: 3,
      indent: 0
    }];
  });
  function IXl(e) {
    let [t, n] = py.useState(null);
    let r = py.useRef(t);
    r.current = t;
    let o = py.useRef(e);
    o.current = e;
    let s = py.useRef(null);
    let i = py.useCallback(() => {
      if (r.current !== null) {
        n(null);
      }
    }, []);
    let a = py.useCallback(c => {
      let u = Math.max(0, c.getScrollHeight() - c.getViewportHeight());
      if (c.getScrollTop() + c.getPendingDelta() >= u) {
        return;
      }
      if (s.current === null) {
        s.current = c.getScrollHeight();
        n(o.current);
      }
    }, []);
    let l = py.useCallback(c => {
      if (!c) {
        return;
      }
      c.scrollToBottom();
    }, []);
    py.useEffect(() => {
      if (t === null) {
        s.current = null;
      } else if (e < t) {
        s.current = null;
        n(null);
      }
    }, [e, t]);
    return {
      dividerIndex: t,
      dividerYRef: s,
      onScrollAway: a,
      onRepin: i,
      jumpToNew: l
    };
  }
  function zJm(e, t) {
    let n = 0;
    let r = false;
    for (let o = t; o < e.length; o++) {
      let s = e[o];
      if (s.type === "progress") {
        continue;
      }
      if (s.type === "assistant" && !KJm(s)) {
        continue;
      }
      let i = s.type === "assistant";
      if (i && !r) {
        n++;
      }
      r = i;
    }
    return n;
  }
  function KJm(e) {
    if (e.type !== "assistant") {
      return false;
    }
    for (let t of e.message.content) {
      if (t.type === "text" && t.text?.trim()) {
        return true;
      }
    }
    return false;
  }
  function PXl(e, t) {
    if (t === null) {
      return;
    }
    let n = t;
    while (n < e.length && (e[n]?.type === "progress" || zlr(e[n]))) {
      n++;
    }
    let r = e[n]?.uuid;
    if (!r) {
      return;
    }
    let o = zJm(e, t);
    return {
      firstUnseenUuid: r,
      count: Math.max(1, o)
    };
  }
  function AGo(e) {
    let t = qYe.c(78);
    let {
      scrollable: n,
      sidebar: r,
      sidebarWidth: o,
      bottom: s,
      modal: i,
      modalScrollRef: a,
      scrollRef: l,
      dividerYRef: c,
      hidePill: u,
      hideSticky: d,
      newMessageCount: p,
      onPillClick: m
    } = e;
    let f = o === undefined ? 0 : o;
    let h = u === undefined ? false : u;
    let g = d === undefined ? false : d;
    let y = p === undefined ? 0 : p;
    let {
      rows: _,
      columns: b
    } = Sr();
    let S = _ - 2 - 1;
    let E = Math.max(1, b - f);
    let C;
    if (t[0] !== E || t[1] !== _) {
      C = {
        columns: E,
        rows: _
      };
      t[0] = E;
      t[1] = _;
      t[2] = C;
    } else {
      C = t[2];
    }
    let x = C;
    let k = nFn() ? _ - 2 : "50%";
    let [I, O] = py.useState(null);
    let M;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      M = {
        setStickyPrompt: O
      };
      t[3] = M;
    } else {
      M = t[3];
    }
    let L = M;
    let P;
    if (t[4] !== l) {
      P = V => l?.current?.subscribe(V) ?? XJm;
      t[4] = l;
      t[5] = P;
    } else {
      P = t[5];
    }
    let F = P;
    let H;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      H = uc("autoScrollEnabled", true);
      t[6] = H;
    } else {
      H = t[6];
    }
    let U = H.value;
    let N;
    if (t[7] !== c || t[8] !== l) {
      N = () => {
        let V = l?.current;
        if (!V) {
          return false;
        }
        if (V.isSticky()) {
          return false;
        }
        let K = V.getScrollTop() + V.getPendingDelta() + V.getViewportHeight();
        let J = c?.current;
        if (J != null) {
          return K < J && K < V.getScrollHeight();
        }
        return !U && K < V.getScrollHeight();
      };
      t[7] = c;
      t[8] = l;
      t[9] = N;
    } else {
      N = t[9];
    }
    let W = py.useSyncExternalStore(F, N);
    let j;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      j = [];
      t[10] = j;
    } else {
      j = t[10];
    }
    if (py.useLayoutEffect(YJm, j), qs()) {
      let V = g ? null : I;
      let K = V != null && V !== "clicked" ? V : null;
      let J = V != null;
      let Q;
      if (t[11] !== K) {
        Q = K && Xd.jsx(eXm, {
          text: K.text,
          onClick: K.scrollTo
        });
        t[11] = K;
        t[12] = Q;
      } else {
        Q = t[12];
      }
      let Z = J ? 0 : 1;
      let ne;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        ne = Xd.jsx(xGo, {});
        t[13] = ne;
      } else {
        ne = t[13];
      }
      let oe;
      if (t[14] !== n) {
        oe = Xd.jsxs(ucr, {
          value: L,
          children: [n, ne]
        });
        t[14] = n;
        t[15] = oe;
      } else {
        oe = t[15];
      }
      let ee;
      if (t[16] !== l || t[17] !== Z || t[18] !== oe) {
        ee = Xd.jsx(B2m, {
          ref: l,
          flexGrow: 1,
          flexDirection: "column",
          paddingTop: Z,
          stickyScroll: true,
          followGrowth: U,
          children: oe
        });
        t[16] = l;
        t[17] = Z;
        t[18] = oe;
        t[19] = ee;
      } else {
        ee = t[19];
      }
      let re;
      if (t[20] !== h || t[21] !== y || t[22] !== m || t[23] !== W) {
        re = !h && W && Xd.jsx(ZJm, {
          count: y,
          onClick: m
        });
        t[20] = h;
        t[21] = y;
        t[22] = m;
        t[23] = W;
        t[24] = re;
      } else {
        re = t[24];
      }
      let se;
      let ae;
      if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
        se = false;
        ae = false;
        t[25] = se;
        t[26] = ae;
      } else {
        se = t[25];
        ae = t[26];
      }
      let de;
      if (t[27] !== Q || t[28] !== ee || t[29] !== re) {
        de = Xd.jsxs(gXd, {
          flexGrow: 1,
          flexDirection: "column",
          overflow: "hidden",
          children: [Q, ee, re, se, ae]
        });
        t[27] = Q;
        t[28] = ee;
        t[29] = re;
        t[30] = de;
      } else {
        de = t[30];
      }
      let be;
      if (t[31] !== x || t[32] !== de) {
        be = Xd.jsx(gue, {
          value: x,
          children: de
        });
        t[31] = x;
        t[32] = de;
        t[33] = be;
      } else {
        be = t[33];
      }
      let fe;
      if (t[34] !== r || t[35] !== f) {
        fe = r != null && (f > 0 ? Xd.jsx(gXd, {
          width: f,
          flexShrink: 0,
          flexDirection: "column",
          overflow: "hidden",
          borderStyle: "single",
          borderTop: false,
          borderRight: false,
          borderBottom: false,
          borderColor: "inactive",
          children: r
        }) : r);
        t[34] = r;
        t[35] = f;
        t[36] = fe;
      } else {
        fe = t[36];
      }
      let me;
      if (t[37] !== be || t[38] !== fe) {
        me = Xd.jsxs(gXd, {
          flexGrow: 1,
          flexDirection: "row",
          overflow: "hidden",
          children: [be, fe]
        });
        t[37] = be;
        t[38] = fe;
        t[39] = me;
      } else {
        me = t[39];
      }
      let Te;
      let ue;
      if (t[40] === Symbol.for("react.memo_cache_sentinel")) {
        Te = Xd.jsx(kXl, {});
        ue = Xd.jsx(AXl, {});
        t[40] = Te;
        t[41] = ue;
      } else {
        Te = t[40];
        ue = t[41];
      }
      let ce;
      if (t[42] !== s) {
        ce = Xd.jsx(gXd, {
          flexDirection: "column",
          width: "100%",
          flexGrow: 1,
          flexShrink: 0,
          overflowY: "hidden",
          children: s
        });
        t[42] = s;
        t[43] = ce;
      } else {
        ce = t[43];
      }
      let le;
      if (t[44] !== k || t[45] !== ce) {
        le = Xd.jsxs(gXd, {
          flexDirection: "column",
          flexShrink: 0,
          width: "100%",
          maxHeight: k,
          children: [Te, ue, ce]
        });
        t[44] = k;
        t[45] = ce;
        t[46] = le;
      } else {
        le = t[46];
      }
      let pe;
      if (t[47] !== b || t[48] !== i || t[49] !== S || t[50] !== a || t[51] !== _) {
        pe = i != null && Xd.jsx(_q, {
          value: {
            rows: S,
            columns: b - 2 * 2,
            scrollRef: a ?? null,
            claimScrollBox: null
          },
          children: Xd.jsxs(gXd, {
            position: "absolute",
            bottom: 0,
            left: 0,
            right: 0,
            maxHeight: _ - 2,
            flexDirection: "column",
            overflow: "hidden",
            opaque: true,
            children: [Xd.jsx(gXd, {
              flexShrink: 0,
              children: Xd.jsx(mS, {
                color: "permission",
                char: "\u2594"
              })
            }), Xd.jsx(QJm, {
              scrollRef: a,
              maxRows: S,
              children: i
            })]
          })
        });
        t[47] = b;
        t[48] = i;
        t[49] = S;
        t[50] = a;
        t[51] = _;
        t[52] = pe;
      } else {
        pe = t[52];
      }
      let ve;
      if (t[53] !== me || t[54] !== le || t[55] !== pe) {
        ve = Xd.jsxs(SGo, {
          children: [me, le, pe]
        });
        t[53] = me;
        t[54] = le;
        t[55] = pe;
        t[56] = ve;
      } else {
        ve = t[56];
      }
      return ve;
    }
    if (kPe()) {
      let V;
      if (t[57] === Symbol.for("react.memo_cache_sentinel")) {
        V = Xd.jsx(xGo, {});
        t[57] = V;
      } else {
        V = t[57];
      }
      let K;
      if (t[58] !== n) {
        K = Xd.jsxs(ucr, {
          value: L,
          children: [n, V]
        });
        t[58] = n;
        t[59] = K;
      } else {
        K = t[59];
      }
      let J;
      let Q;
      if (t[60] === Symbol.for("react.memo_cache_sentinel")) {
        J = Xd.jsx(kXl, {});
        Q = Xd.jsx(AXl, {});
        t[60] = J;
        t[61] = Q;
      } else {
        J = t[60];
        Q = t[61];
      }
      let Z;
      if (t[62] !== s) {
        Z = Xd.jsxs(Xd.Fragment, {
          children: [J, Q, s]
        });
        t[62] = s;
        t[63] = Z;
      } else {
        Z = t[63];
      }
      let ne;
      if (t[64] !== b || t[65] !== i || t[66] !== S || t[67] !== a) {
        ne = i != null ? Xd.jsx(_q, {
          value: {
            rows: S,
            columns: b - 2 * 2,
            scrollRef: a ?? null,
            claimScrollBox: null
          },
          children: Xd.jsx(gXd, {
            flexDirection: "column",
            paddingX: 2,
            children: i
          })
        }) : null;
        t[64] = b;
        t[65] = i;
        t[66] = S;
        t[67] = a;
        t[68] = ne;
      } else {
        ne = t[68];
      }
      let oe;
      if (t[69] !== l || t[70] !== K || t[71] !== Z || t[72] !== ne) {
        oe = Xd.jsx(SGo, {
          children: Xd.jsx(yXl, {
            scrollRef: l,
            scrollable: K,
            bottom: Z,
            overlay: ne
          })
        });
        t[69] = l;
        t[70] = K;
        t[71] = Z;
        t[72] = ne;
        t[73] = oe;
      } else {
        oe = t[73];
      }
      return oe;
    }
    let z;
    if (t[74] !== s || t[75] !== i || t[76] !== n) {
      z = Xd.jsxs(Xd.Fragment, {
        children: [n, s, i]
      });
      t[74] = s;
      t[75] = i;
      t[76] = n;
      t[77] = z;
    } else {
      z = t[77];
    }
    return z;
  }
  function YJm() {
    if (!qs()) {
      return;
    }
    let e = rVd.get(process.stdout);
    if (!e) {
      return;
    }
    e.onHyperlinkClick = JJm;
    return () => {
      e.onHyperlinkClick = undefined;
    };
  }
  function JJm(e) {
    LIn(e);
  }
  function XJm() {}
  function QJm(e) {
    let t = qYe.c(45);
    let {
      scrollRef: n,
      maxRows: r,
      children: o
    } = e;
    let s = py.useContext(_q);
    let i = py.useRef(null);
    let [a, l] = py.useState(null);
    let c;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      c = oe => {
        i.current = oe;
        l(oe);
      };
      t[0] = c;
    } else {
      c = t[0];
    }
    let u = c;
    let d = a !== null;
    let p = r - (a ?? 0);
    let m = py.useRef(null);
    let f;
    if (t[1] !== n) {
      f = () => {
        if (n && i.current === null) {
          n.current = m.current;
          return () => {
            if (n.current === m.current) {
              n.current = null;
            }
          };
        }
      };
      t[1] = n;
      t[2] = f;
    } else {
      f = t[2];
    }
    py.useLayoutEffect(f);
    let h;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      h = {
        overflows: false,
        above: false,
        below: false,
        hintTop: 0,
        hintBottom: 0
      };
      t[3] = h;
    } else {
      h = t[3];
    }
    let [g, y] = py.useState(h);
    let _;
    if (t[4] !== p || t[5] !== n) {
      _ = () => {
        let oe = n?.current;
        if (!oe) {
          return;
        }
        let ee = oe.getFreshScrollHeight();
        let re = oe.getViewportHeight() || p;
        let se = m.current?.getViewportTop() ?? 0;
        let ae = m.current?.getViewportHeight() ?? 0;
        let de = Math.max(0, oe.getViewportTop() - se);
        let be = Math.max(0, ae - de - re);
        let fe = i.current !== null ? re : p;
        let me = ee > fe;
        let Te = oe.getScrollTop() + oe.getPendingDelta();
        let ue = ee - fe > 2;
        let ce = ue && Te > 0;
        let le = ue && Te < ee - re;
        y(pe => pe.overflows === me && pe.above === ce && pe.below === le && pe.hintTop === de && pe.hintBottom === be ? pe : {
          overflows: me,
          above: ce,
          below: le,
          hintTop: de,
          hintBottom: be
        });
      };
      t[4] = p;
      t[5] = n;
      t[6] = _;
    } else {
      _ = t[6];
    }
    let b = _;
    let S = py.useRef(null);
    let E = py.useRef(null);
    let {
      focusManager: C
    } = py.useContext(JVi);
    let x;
    if (t[7] !== C) {
      x = () => {
        let oe = S.current;
        if (!oe || !C) {
          return;
        }
        for (let re = C.activeElement ?? undefined; re; re = re.parentNode) {
          if (re === oe) {
            E.current = C.activeElement;
            return;
          }
        }
        let ee = E.current;
        for (let re = ee ?? undefined; re; re = re.parentNode) {
          if (re === oe) {
            C.focus(ee);
            return;
          }
        }
        C.focus(oe);
      };
      t[7] = C;
      t[8] = x;
    } else {
      x = t[8];
    }
    let A = x;
    let k;
    if (t[9] !== A) {
      k = [A];
      t[9] = A;
      t[10] = k;
    } else {
      k = t[10];
    }
    py.useEffect(A, k);
    let I = py.useRef(null);
    let O = py.useRef(undefined);
    let M;
    let L;
    if (t[11] !== b || t[12] !== n) {
      M = () => (b(), I.current = n?.current ?? null, O.current = I.current?.subscribe(b), () => {
        O.current?.();
      });
      L = [b, n];
      t[11] = b;
      t[12] = n;
      t[13] = M;
      t[14] = L;
    } else {
      M = t[13];
      L = t[14];
    }
    py.useEffect(M, L);
    let P;
    if (t[15] !== b || t[16] !== n || t[17] !== A) {
      P = () => {
        let oe = n?.current ?? null;
        if (oe !== I.current) {
          O.current?.();
          I.current = oe;
          O.current = oe?.subscribe(b);
        }
        b();
        A();
      };
      t[15] = b;
      t[16] = n;
      t[17] = A;
      t[18] = P;
    } else {
      P = t[18];
    }
    useInterval(P, 50);
    s?.rows;
    s?.columns;
    let F = s?.rows ?? r;
    let H = s?.columns ?? 0;
    let U = n ?? null;
    let N;
    if (t[19] !== F || t[20] !== H || t[21] !== U) {
      N = {
        rows: F,
        columns: H,
        scrollRef: U,
        claimScrollBox: u
      };
      t[19] = F;
      t[20] = H;
      t[21] = U;
      t[22] = N;
    } else {
      N = t[22];
    }
    let W = N;
    let j;
    if (t[23] !== p || t[24] !== n) {
      j = oe => {
        if (oe.defaultPrevented || oe.ctrl || oe.meta || oe.shift) {
          return;
        }
        let ee = n?.current;
        if (!ee) {
          return;
        }
        let re = ee.getFreshScrollHeight();
        let se = ee.getViewportHeight() || p;
        let ae = i.current !== null ? se : p;
        if (re <= ae) {
          return;
        }
        if (oe.key === "up" || oe.key === "down") {
          ee.scrollBy(oe.key === "down" ? 1 : -1);
          oe.preventDefault();
        } else if (oe.key === "pageup" || oe.key === "pagedown") {
          let de = Math.max(1, ae);
          ee.scrollBy(oe.key === "pagedown" ? de : -de);
          oe.preventDefault();
        } else if (oe.key === "home") {
          ee.scrollTo(0);
          oe.preventDefault();
        } else if (oe.key === "end") {
          ee.scrollToBottom();
          oe.preventDefault();
        }
      };
      t[23] = p;
      t[24] = n;
      t[25] = j;
    } else {
      j = t[25];
    }
    let z = !d && g.overflows ? p : undefined;
    let V;
    if (t[26] !== o) {
      V = Xd.jsx(gXd, {
        flexDirection: "column",
        paddingX: 2,
        flexShrink: 0,
        children: o
      });
      t[26] = o;
      t[27] = V;
    } else {
      V = t[27];
    }
    let K;
    if (t[28] !== z || t[29] !== V) {
      K = Xd.jsx(B2m, {
        ref: m,
        flexDirection: "column",
        flexShrink: 0,
        height: z,
        stickyScroll: false,
        children: V
      });
      t[28] = z;
      t[29] = V;
      t[30] = K;
    } else {
      K = t[30];
    }
    let J;
    if (t[31] !== g.above || t[32] !== g.hintTop) {
      J = g.above && Xd.jsx(gXd, {
        position: "absolute",
        top: g.hintTop,
        right: 1,
        children: Xd.jsx(Text, {
          dimColor: true,
          children: vGd.arrowUp
        })
      });
      t[31] = g.above;
      t[32] = g.hintTop;
      t[33] = J;
    } else {
      J = t[33];
    }
    let Q;
    if (t[34] !== g.below || t[35] !== g.hintBottom) {
      Q = g.below && Xd.jsx(gXd, {
        position: "absolute",
        bottom: g.hintBottom,
        right: 1,
        children: Xd.jsx(Text, {
          dimColor: true,
          children: vGd.arrowDown
        })
      });
      t[34] = g.below;
      t[35] = g.hintBottom;
      t[36] = Q;
    } else {
      Q = t[36];
    }
    let Z;
    if (t[37] !== j || t[38] !== K || t[39] !== J || t[40] !== Q) {
      Z = Xd.jsxs(gXd, {
        ref: S,
        flexDirection: "column",
        flexShrink: 0,
        onKeyDown: j,
        children: [K, J, Q]
      });
      t[37] = j;
      t[38] = K;
      t[39] = J;
      t[40] = Q;
      t[41] = Z;
    } else {
      Z = t[41];
    }
    let ne;
    if (t[42] !== W || t[43] !== Z) {
      ne = Xd.jsx(_q, {
        value: W,
        children: Z
      });
      t[42] = W;
      t[43] = Z;
      t[44] = ne;
    } else {
      ne = t[44];
    }
    return ne;
  }
  function ZJm(e) {
    let t = qYe.c(13);
    let {
      count: n,
      onClick: r
    } = e;
    let [o, s] = py.useState(false);
    let i = Zu("scroll:bottom", "Scroll", "ctrl+end");
    let a;
    if (t[0] !== r) {
      a = () => {
        iOa();
        r?.();
      };
      t[0] = r;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l;
    let c;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = () => s(true);
      c = () => s(false);
      t[2] = l;
      t[3] = c;
    } else {
      l = t[2];
      c = t[3];
    }
    let u = o ? "userMessageBackgroundHover" : "userMessageBackground";
    let d;
    if (t[4] !== n) {
      d = n > 0 ? `${n} new ${un(n, "message")}` : "Jump to bottom";
      t[4] = n;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p;
    if (t[6] !== i || t[7] !== u || t[8] !== d) {
      p = Xd.jsxs(Mx, {
        color: u,
        textColor: "text",
        padded: true,
        children: [d, " ", "(", i, ") ", vGd.arrowDown]
      });
      t[6] = i;
      t[7] = u;
      t[8] = d;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== a || t[11] !== p) {
      m = Xd.jsx(gXd, {
        position: "absolute",
        bottom: 0,
        left: 0,
        right: 0,
        justifyContent: "center",
        children: Xd.jsx(gXd, {
          noSelect: true,
          onClick: a,
          onMouseEnter: l,
          onMouseLeave: c,
          children: p
        })
      });
      t[10] = a;
      t[11] = p;
      t[12] = m;
    } else {
      m = t[12];
    }
    return m;
  }
  function eXm(e) {
    let t = qYe.c(8);
    let {
      text: n,
      onClick: r
    } = e;
    let [o, s] = py.useState(false);
    let i = o ? "userMessageBackgroundHover" : "userMessageBackground";
    let a;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = () => s(true);
      l = () => s(false);
      t[0] = a;
      t[1] = l;
    } else {
      a = t[0];
      l = t[1];
    }
    let c;
    if (t[2] !== n) {
      c = Xd.jsxs(Text, {
        color: "subtle",
        wrap: "truncate-end",
        children: [vGd.pointer, " ", n]
      });
      t[2] = n;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== r || t[5] !== i || t[6] !== c) {
      u = Xd.jsx(gXd, {
        flexShrink: 0,
        width: "100%",
        height: 1,
        paddingRight: 1,
        backgroundColor: i,
        onClick: r,
        onMouseEnter: a,
        onMouseLeave: l,
        children: c
      });
      t[4] = r;
      t[5] = i;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  function kXl() {
    let e = qYe.c(8);
    let t = aXl();
    if (!t || t.suggestions.length === 0 && !t.emptyMessage) {
      return null;
    }
    let n;
    if (e[0] !== t.emptyMessage || e[1] !== t.hoveredId || e[2] !== t.maxColumnWidth || e[3] !== t.onHoverChange || e[4] !== t.onSelect || e[5] !== t.selectedSuggestion || e[6] !== t.suggestions) {
      n = Xd.jsx(gXd, {
        position: "absolute",
        bottom: "100%",
        left: 0,
        right: 0,
        paddingX: 2,
        paddingTop: 1,
        flexDirection: "column",
        opaque: true,
        children: Xd.jsx(_ea, {
          suggestions: t.suggestions,
          selectedSuggestion: t.selectedSuggestion,
          maxColumnWidth: t.maxColumnWidth,
          emptyMessage: t.emptyMessage,
          hoveredId: t.hoveredId,
          onSelect: t.onSelect,
          onHoverChange: t.onHoverChange,
          overlay: true,
          noPad: true
        })
      });
      e[0] = t.emptyMessage;
      e[1] = t.hoveredId;
      e[2] = t.maxColumnWidth;
      e[3] = t.onHoverChange;
      e[4] = t.onSelect;
      e[5] = t.selectedSuggestion;
      e[6] = t.suggestions;
      e[7] = n;
    } else {
      n = e[7];
    }
    return n;
  }
  function AXl() {
    let e = qYe.c(2);
    let t = lXl();
    if (!t) {
      return null;
    }
    let n;
    if (e[0] !== t) {
      n = Xd.jsx(gXd, {
        position: "absolute",
        bottom: "100%",
        left: 0,
        right: 0,
        opaque: true,
        children: t
      });
      e[0] = t;
      e[1] = n;
    } else {
      n = e[1];
    }
    return n;
  }
  var qYe;
  var py;
  var Xd;
  var ucr;
  var IGo = __lazy(() => {
    rE();
    px();
    pen();
    _Xl();
    XHt();
    ki();
    pct();
    et();
    c0();
    ky();
    zp();
    PGt();
    zg();
    Zn();
    TXl();
    qve();
    oX();
    oE();
    eGo();
    Ljt();
    wXl();
    xXl();
    qYe = __toESM(pt(), 1);
    py = __toESM(ot(), 1);
    Xd = __toESM(ie(), 1);
    ucr = py.createContext({
      setStickyPrompt: () => {}
    });
  });
  function tXm(e) {
    let t = OXl.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = Llr(e);
    OXl.set(e, n);
    return n;
  }
  function PGo(e) {
    if (e === undefined) {
      return null;
    }
    let t = DXl.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = rXm(e);
    DXl.set(e, n);
    return n;
  }
  function rXm(e) {
    let t = null;
    if (e.type === "user") {
      if (e.isMeta || e.isVisibleInTranscriptOnly) {
        return null;
      }
      let r = e.message.content[0];
      if (r?.type !== "text") {
        return null;
      }
      t = r.text;
    } else if (e.type === "attachment" && e.attachment.type === "queued_command" && e.attachment.commandMode !== "task-notification" && !e.attachment.isMeta) {
      let r = e.attachment.prompt;
      t = typeof r === "string" ? r : r.flatMap(o => o.type === "text" ? [o.text] : []).join(`
`);
    }
    if (t === null) {
      return null;
    }
    let n = BXl(t);
    if (n.startsWith("<") || n === "") {
      return null;
    }
    return n;
  }
  function oXm({
    itemKey: e,
    msg: t,
    idx: n,
    measureRef: r,
    expanded: o,
    hovered: s,
    clickable: i,
    onClickK: a,
    onEnterK: l,
    onLeaveK: c,
    renderItemRef: u
  }) {
    return vie.jsx(gXd, {
      ref: r(e),
      flexDirection: "column",
      backgroundColor: o ? "userMessageBackgroundHover" : undefined,
      paddingBottom: o ? 1 : undefined,
      onClick: i ? d => {
        if (d.hyperlinkUrl) {
          return d.allowDefault();
        }
        a(t, d.cellIsBlank);
      } : undefined,
      onMouseEnter: i ? () => l(e) : undefined,
      onMouseLeave: i ? () => c(e) : undefined,
      hoverIgnoresBlankCells: !o,
      children: vie.jsx(Fno.Provider, {
        value: s && !o,
        children: u.current(t, n)
      })
    });
  }
  function NXl({
    messages: e,
    scrollRef: t,
    columns: n,
    itemKey: r,
    renderItem: o,
    onItemClick: s,
    isItemClickable: i,
    isItemExpanded: a,
    extractSearchText: l = tXm,
    trackStickyPrompt: c,
    jumpRef: u,
    onSearchMatchesChange: d,
    scanElement: p,
    setPositions: m
  }) {
    let f = Af.useRef({
      keys: [],
      uuids: [],
      seen: new Map(),
      itemKey: r,
      loggedDups: new Set()
    });
    let h = Af.useMemo(() => aXm(e, r, f.current, FXl), [e, r]);
    let {
      range: g,
      topSpacer: y,
      bottomSpacer: _,
      measureRef: b,
      spacerRef: S,
      offsets: E,
      getItemTop: C,
      getItemElement: x,
      scrollToIndex: A
    } = tXl(t, h, n);
    let [k, I] = g;
    let O = Af.useRef({
      offsets: E,
      start: k,
      getItemElement: x,
      getItemTop: C,
      messages: e,
      scrollToIndex: A
    });
    O.current = {
      offsets: E,
      start: k,
      getItemElement: x,
      getItemTop: C,
      messages: e,
      scrollToIndex: A
    };
    let M = Af.useRef(null);
    function L(le, pe) {
      let {
        messages: ve
      } = O.current;
      for (let _e = le + pe; _e >= 0 && _e < ve.length; _e += pe) {
        if (PGo(ve[_e]) !== null) {
          return _e;
        }
      }
      return -1;
    }
    let P = Af.useRef(null);
    let F = Af.useRef({
      msgIdx: -1,
      positions: []
    });
    let H = Af.useRef(-1);
    let U = Af.useRef(0);
    let N = Af.useRef(0);
    let W = Af.useRef(() => {});
    let j = Af.useRef(() => {});
    let z = Af.useRef({
      matches: [],
      ptr: 0,
      screenOrd: 0,
      prefixSum: []
    });
    let V = Af.useRef(-1);
    let K = Af.useRef(false);
    function J(le) {
      let pe = O.current.getItemTop(le);
      return Math.max(0, pe - 3);
    }
    function Q(le) {
      let pe = t.current;
      let {
        msgIdx: ve,
        positions: _e
      } = F.current;
      if (!pe || _e.length === 0 || ve < 0) {
        m?.(null);
        return;
      }
      let xe = Math.max(0, Math.min(le, _e.length - 1));
      let ke = _e[xe];
      let Ie = O.current.getItemTop(ve);
      let Ue = pe.getViewportTop();
      let Ge = Ie - pe.getScrollTop();
      let Be = pe.getViewportHeight();
      let We = Ue + Ge + ke.row;
      if (We < Ue || We >= Ue + Be) {
        pe.scrollTo(Math.max(0, Ie + ke.row - 3));
        Ge = Ie - pe.getScrollTop();
        We = Ue + Ge + ke.row;
      }
      m?.({
        positions: _e,
        rowOffset: Ue + Ge,
        currentIdx: xe
      });
      let Ze = z.current;
      let Tt = Ze.prefixSum.at(-1) ?? 0;
      let kt = (Ze.prefixSum[Ze.ptr] ?? 0) + xe + 1;
      d?.(Tt, kt);
      logForDebugging(`highlight(i=${ve}, ord=${xe}/${_e.length}): pos={row:${ke.row},col:${ke.col}} lo=${Ge} screenRow=${We} badge=${kt}/${Tt}`);
    }
    j.current = Q;
    let [Z, ne] = Af.useState(0);
    let oe = Af.useCallback(() => ne(le => le + 1), []);
    Af.useEffect(() => {
      let le = P.current;
      if (!le) {
        return;
      }
      let {
        idx: pe,
        wantLast: ve,
        tries: _e
      } = le;
      let xe = t.current;
      if (!xe) {
        return;
      }
      let {
        getItemElement: ke,
        getItemTop: Ie,
        scrollToIndex: Ue
      } = O.current;
      let Ge = ke(pe);
      let Be = Ge?.yogaNode?.getComputedHeight() ?? 0;
      if (!Ge || Be === 0) {
        if (_e > 1) {
          P.current = null;
          logForDebugging(`seek(i=${pe}): no mount after scrollToIndex, skip`);
          W.current(ve ? -1 : 1);
          return;
        }
        P.current = {
          idx: pe,
          wantLast: ve,
          tries: _e + 1
        };
        Ue(pe);
        oe();
        return;
      }
      P.current = null;
      xe.scrollTo(Math.max(0, Ie(pe) - 3));
      let We = p?.(Ge) ?? [];
      if (F.current = {
        msgIdx: pe,
        positions: We
      }, logForDebugging(`seek(i=${pe} t=${_e}): ${We.length} positions`), We.length === 0) {
        if (++U.current > 20) {
          U.current = 0;
          return;
        }
        W.current(ve ? -1 : 1);
        return;
      }
      U.current = 0;
      let Ze = ve ? We.length - 1 : 0;
      z.current.screenOrd = Ze;
      H.current = -1;
      j.current(Ze);
      let Tt = N.current;
      if (Tt) {
        N.current = 0;
        W.current(Tt);
      }
    }, [Z]);
    function ee(le, pe) {
      let ve = t.current;
      if (!ve) {
        return;
      }
      let _e = O.current;
      let {
        getItemElement: xe,
        scrollToIndex: ke
      } = _e;
      if (le < 0 || le >= _e.messages.length) {
        return;
      }
      m?.(null);
      F.current = {
        msgIdx: -1,
        positions: []
      };
      P.current = {
        idx: le,
        wantLast: pe,
        tries: 0
      };
      let Ie = xe(le);
      let Ue = Ie?.yogaNode?.getComputedHeight() ?? 0;
      if (Ie && Ue > 0) {
        ve.scrollTo(J(le));
      } else {
        ke(le);
      }
      oe();
    }
    function re(le) {
      let pe = z.current;
      let {
        matches: ve,
        prefixSum: _e
      } = pe;
      let xe = _e.at(-1) ?? 0;
      if (ve.length === 0) {
        return;
      }
      if (P.current) {
        N.current = le;
        return;
      }
      if (H.current < 0) {
        H.current = pe.ptr;
      }
      let {
        positions: ke
      } = F.current;
      let Ie = pe.screenOrd + le;
      if (Ie >= 0 && Ie < ke.length) {
        pe.screenOrd = Ie;
        Q(Ie);
        H.current = -1;
        return;
      }
      let Ue = (pe.ptr + le + ve.length) % ve.length;
      if (Ue === H.current) {
        m?.(null);
        H.current = -1;
        logForDebugging(`step: wraparound at ptr=${Ue}, all ${ve.length} msgs phantoms`);
        return;
      }
      pe.ptr = Ue;
      pe.screenOrd = 0;
      ee(ve[Ue], le < 0);
      let Ge = le < 0 ? _e[Ue + 1] ?? xe : _e[Ue] + 1;
      d?.(xe, Ge);
    }
    W.current = re;
    function se() {
      let le = t.current;
      let {
        offsets: pe,
        start: ve,
        getItemTop: _e,
        messages: xe
      } = O.current;
      let ke = xe.length;
      if (!le || ke === 0) {
        return -1;
      }
      let Ie = le.getScrollTop() + 3;
      let Ue = _e(ve);
      if (Ue >= 0 && Ue <= Ie) {
        let Tt = ve;
        for (let kt = ve; kt < ke; kt++) {
          let Ye = _e(kt);
          if (Ye < 0 || Ye > Ie) {
            break;
          }
          Tt = kt;
        }
        return Tt;
      }
      let Ge = Ue >= 0 ? Ue - pe[ve] : 0;
      let Be = Ie - Ge;
      let We = 0;
      let Ze = ke - 1;
      while (We < Ze) {
        let Tt = We + Ze + 1 >> 1;
        if (pe[Tt] <= Be) {
          We = Tt;
        } else {
          Ze = Tt - 1;
        }
      }
      return We;
    }
    function ae(le) {
      let pe = t.current;
      let {
        messages: ve,
        getItemTop: _e,
        scrollToIndex: xe
      } = O.current;
      if (!pe || le < 0 || le >= ve.length) {
        return;
      }
      if (_e(le) >= 0) {
        pe.scrollTo(J(le));
      } else {
        xe(le);
      }
    }
    Af.useImperativeHandle(u, () => ({
      jumpToIndex: le => {
        let pe = t.current;
        if (pe) {
          pe.scrollTo(J(le));
        }
      },
      nextMessage: () => {
        let le = M.current ?? se();
        if (le < 0) {
          return;
        }
        let pe = L(le, 1);
        if (pe < 0) {
          return;
        }
        ae(pe);
        M.current = pe;
      },
      prevMessage: () => {
        let le = M.current;
        let pe = le ?? se();
        if (pe < 0) {
          return;
        }
        if (le === null && PGo(O.current.messages[pe]) === null) {
          let _e = L(pe, -1);
          if (_e >= 0) {
            ae(_e);
            M.current = _e;
          }
          return;
        }
        let ve = L(pe, -1);
        if (ve < 0) {
          return;
        }
        ae(ve);
        M.current = ve;
      },
      setSearchQuery: le => {
        P.current = null;
        F.current = {
          msgIdx: -1,
          positions: []
        };
        H.current = -1;
        m?.(null);
        let pe = le.toLowerCase();
        let ve = [];
        let _e = [0];
        if (pe) {
          let Tt = O.current.messages;
          for (let kt = 0; kt < Tt.length; kt++) {
            let Ye = Tt[kt];
            if (Ye === undefined) {
              continue;
            }
            let ht = l(Ye);
            let It = ht.indexOf(pe);
            let Rt = 0;
            while (It >= 0) {
              Rt++;
              It = ht.indexOf(pe, It + pe.length);
            }
            if (Rt > 0) {
              ve.push(kt);
              _e.push(_e.at(-1) + Rt);
            }
          }
        }
        let xe = _e.at(-1);
        let ke = 0;
        let Ie = t.current;
        let {
          offsets: Ue,
          start: Ge,
          getItemTop: Be
        } = O.current;
        let We = Be(Ge);
        let Ze = We >= 0 ? We - Ue[Ge] : 0;
        if (ve.length > 0 && Ie) {
          let Tt = V.current >= 0 ? V.current : Ie.getScrollTop();
          let kt = 1 / 0;
          for (let Ye = 0; Ye < ve.length; Ye++) {
            let ht = Math.abs(Ze + Ue[ve[Ye]] - Tt);
            if (ht <= kt) {
              kt = ht;
              ke = Ye;
            }
          }
          logForDebugging(`setSearchQuery('${le}'): ${ve.length} msgs \xB7 ptr=${ke} msgIdx=${ve[ke]} curTop=${Tt} origin=${Ze}`);
        }
        if (z.current = {
          matches: ve,
          ptr: ke,
          screenOrd: 0,
          prefixSum: _e
        }, ve.length > 0) {
          ee(ve[ke], true);
        } else if (V.current >= 0 && Ie) {
          Ie.scrollTo(V.current);
        }
        d?.(xe, ve.length > 0 ? _e[ke + 1] ?? xe : 0);
      },
      nextMatch: () => re(1),
      prevMatch: () => re(-1),
      setAnchor: () => {
        let le = t.current;
        if (le) {
          V.current = le.getScrollTop();
        }
      },
      disarmSearch: () => {
        m?.(null);
        P.current = null;
        F.current = {
          msgIdx: -1,
          positions: []
        };
        H.current = -1;
        M.current = null;
      },
      warmSearchIndex: async () => {
        if (K.current) {
          return 0;
        }
        let le = O.current.messages;
        let pe = 500;
        let ve = 0;
        let _e = performance.now();
        for (let ke = 0; ke < le.length; ke += pe) {
          await sleep(0);
          let Ie = performance.now();
          let Ue = Math.min(ke + pe, le.length);
          for (let Ge = ke; Ge < Ue; Ge++) {
            let Be = le[Ge];
            if (Be !== undefined) {
              l(Be);
            }
          }
          ve += performance.now() - Ie;
        }
        let xe = Math.round(performance.now() - _e);
        logForDebugging(`warmSearchIndex: ${le.length} msgs \xB7 work=${Math.round(ve)}ms wall=${xe}ms chunks=${Math.ceil(le.length / pe)}`);
        K.current = true;
        return Math.round(ve);
      }
    }), [t]);
    let [de, be] = Af.useState(null);
    let fe = Af.useRef({
      onItemClick: s,
      setHoveredKey: be
    });
    fe.current = {
      onItemClick: s,
      setHoveredKey: be
    };
    let me = Af.useCallback((le, pe) => {
      let ve = fe.current;
      if (!pe && ve.onItemClick) {
        ve.onItemClick(le);
      }
    }, []);
    let Te = Af.useCallback(le => {
      fe.current.setHoveredKey(le);
    }, []);
    let ue = Af.useCallback(le => {
      fe.current.setHoveredKey(pe => pe === le ? null : pe);
    }, []);
    let ce = Af.useRef(o);
    ce.current = o;
    return vie.jsxs(vie.Fragment, {
      children: [vie.jsx(gXd, {
        ref: S,
        height: y,
        flexShrink: 0
      }), e.slice(k, I).map((le, pe) => {
        let ve = k + pe;
        if (le === undefined) {
          LXl(ve, e, `mounted=[${k},${I})`);
          return null;
        }
        let _e = h[ve];
        let xe = !!s && (i?.(le) ?? true);
        let ke = xe && de === _e;
        let Ie = a?.(le);
        return vie.jsx(oXm, {
          itemKey: _e,
          msg: le,
          idx: ve,
          measureRef: b,
          expanded: Ie,
          hovered: ke,
          clickable: xe,
          onClickK: me,
          onEnterK: Te,
          onLeaveK: ue,
          renderItemRef: ce
        }, _e);
      }), _ > 0 && vie.jsx(gXd, {
        height: _,
        flexShrink: 0
      }), c && vie.jsx(iXm, {
        messages: e,
        start: k,
        end: I,
        offsets: E,
        getItemTop: C,
        getItemElement: x,
        scrollRef: t
      })]
    });
  }
  function LXl(e, t, n) {
    if (MXl) {
      return;
    }
    MXl = true;
    let r = o => o === undefined ? "undefined" : FXl(o);
    Oe(new Po(`VirtualMessageList: undefined at messages[${e}] (len=${t.length} ${n} neighbors=[${r(t[e - 1])},${r(t[e + 1])}])`, "VirtualMessageList: undefined element in messages[]"));
  }
  function iXm({
    messages: e,
    start: t,
    end: n,
    offsets: r,
    getItemTop: o,
    getItemElement: s,
    scrollRef: i
  }) {
    let {
      setStickyPrompt: a
    } = Af.useContext(ucr);
    let l = Af.useCallback(S => i.current?.subscribe(S) ?? sXm, [i]);
    Af.useSyncExternalStore(l, () => {
      let S = i.current;
      if (!S) {
        return NaN;
      }
      let E = S.getScrollTop() + S.getPendingDelta();
      return S.isSticky() ? -1 - E : E;
    });
    let c = i.current?.isSticky() ?? true;
    let u = Math.max(0, (i.current?.getScrollTop() ?? 0) + (i.current?.getPendingDelta() ?? 0));
    let d = t;
    let p = -1;
    for (let S = n - 1; S >= t; S--) {
      let E = o(S);
      if (E >= 0) {
        if (E < u) {
          break;
        }
        p = E;
      }
      d = S;
    }
    let m = -1;
    let f = null;
    if (d > 0 && !c) {
      for (let S = d - 1; S >= 0; S--) {
        let E = e[S];
        if (E === undefined) {
          LXl(S, e, `range=[${t},${n}] firstVisible=${d}`);
        }
        let C = PGo(E);
        if (C === null) {
          continue;
        }
        let x = o(S);
        if (x >= 0 && x + 1 >= u) {
          continue;
        }
        m = S;
        f = C;
        break;
      }
    }
    let h = p >= 0 ? p - r[d] : 0;
    let g = m >= 0 ? Math.max(0, h + r[m]) : -1;
    let y = Af.useRef({
      idx: -1,
      tries: 0
    });
    let _ = Af.useRef("none");
    let b = Af.useRef(-1);
    Af.useEffect(() => {
      if (y.current.idx >= 0) {
        return;
      }
      if (_.current === "armed") {
        _.current = "force";
        return;
      }
      let S = _.current === "force";
      if (_.current = "none", !S && b.current === m) {
        return;
      }
      if (b.current = m, f === null) {
        a(null);
        return;
      }
      let E = f.trimStart();
      let C = E.search(/\n\s*\n/);
      let x = (C >= 0 ? E.slice(0, C) : E).slice(0, 500).replace(/\s+/g, " ").trim();
      if (x === "") {
        a(null);
        return;
      }
      let A = m;
      let k = g;
      a({
        text: x,
        scrollTo: () => {
          a("clicked");
          _.current = "armed";
          let I = s(A);
          if (I) {
            i.current?.scrollToElement(I, 1);
          } else {
            i.current?.scrollTo(k);
            y.current = {
              idx: A,
              tries: 0
            };
          }
        }
      });
    });
    Af.useEffect(() => {
      if (y.current.idx < 0) {
        return;
      }
      let S = s(y.current.idx);
      if (S) {
        i.current?.scrollToElement(S, 1);
        y.current = {
          idx: -1,
          tries: 0
        };
      } else if (++y.current.tries > 5) {
        y.current = {
          idx: -1,
          tries: 0
        };
      }
    });
    return null;
  }
  function FXl(e) {
    switch (e.type) {
      case "user":
      case "assistant":
        return `${e.type}/${e.message.content[0]?.type ?? "?"}`;
      case "system":
        return `system/${e.subtype}`;
      case "attachment":
        return `attachment/${e.attachment.type}`;
      case "grouped_tool_use":
      case "collapsed_read_search":
        return e.type;
      default:
        return e.type;
    }
  }
  function aXm(e, t, n, r = o => o.type ?? "?") {
    let o = 0;
    if (n.itemKey === t && e.length >= n.keys.length) {
      let i = n.keys.length;
      while (o < i && e[o].uuid === n.uuids[o]) {
        o++;
      }
    }
    if (o < n.keys.length) {
      n.keys = [];
      n.uuids = [];
      n.seen = new Map();
      o = 0;
    }
    n.itemKey = t;
    let s = null;
    for (; o < e.length; o++) {
      let i = e[o];
      let a = t(i);
      let l = n.seen.get(a);
      if (l === undefined) {
        n.seen.set(a, 1);
        n.keys.push(a);
      } else if (n.seen.set(a, l + 1), n.keys.push(`${a}#${l}`), !n.loggedDups.vZc(a)) {
        n.loggedDups.add(a);
        (s ??= new Map()).set(a, r(i));
      }
      n.uuids.push(i.uuid);
    }
    if (s) {
      let i = [...s].slice(0, 3).map(([a, l]) => `[${l}] ${a} \xD7${n.seen.get(a)}`);
      Oe(Error(`VirtualMessageList: duplicate sibling itemKeys (deduped via #N suffix; upstream uuid-dup): ${i.join(", ")}`));
    }
    return n.keys;
  }
  var Af;
  var vie;
  var OXl;
  var DXl;
  var sXm = () => {};
  var MXl = false;
  var UXl = __lazy(() => {
    nXl();
    et();
    IPe();
    IGo();
    je();
    dt();
    Rn();
    ro();
    GWo();
    Af = __toESM(ot(), 1);
    vie = __toESM(ie(), 1);
    OXl = new WeakMap();
    DXl = new WeakMap();
  });
  function dXm(e, t, n) {
    let r = new Set(t);
    let o = new Set(n);
    let s = new Set();
    let i = [];
    let a = 0;
    for (let c = 0; c < e.length; c++) {
      let u = e[c];
      let d = u.message?.content[0];
      if (u.type === "user" && d?.type !== "tool_result" && (!u.isMeta || nK(u.origin))) {
        a++;
      } else if (u.type === "attachment" && u.attachment?.type === "queued_command" && u.attachment.commandMode === "prompt" && (nK(u.attachment.origin) || !u.attachment.isMeta && yU(u.attachment.origin))) {
        a++;
      } else if (u.type === "assistant" && d?.type === "tool_use" && d.name && o.vZc(d.name)) {
        s.add(a);
      }
      i[c] = a;
    }
    let l = new Set();
    return e.filter((c, u) => {
      if (c.type === "system") {
        return true;
      }
      let d = c.message?.content[0];
      if (c.type === "assistant") {
        if (c.isApiErrorMessage) {
          return true;
        }
        if (d?.type === "tool_use" && d.name && r.vZc(d.name)) {
          if ("id" in d) {
            l.add(d.id);
          }
          return true;
        }
        if (d?.type === "text" && !s.vZc(i[u])) {
          return true;
        }
        return false;
      }
      if (c.type === "user") {
        if (d?.type === "tool_result") {
          return d.tool_use_id !== undefined && l.vZc(d.tool_use_id);
        }
        return !c.isMeta || nK(c.origin);
      }
      if (c.type === "attachment") {
        let p = c.attachment;
        return p?.type === "queued_command" && p.commandMode === "prompt" && (nK(p.origin) || !p.isMeta && yU(p.origin));
      }
      return false;
    });
  }
  function pXm(e, t) {
    let n = new Set(t);
    let r = new Set();
    let o = new Map();
    let s = [];
    let i = 0;
    for (let a = 0; a < e.length; a++) {
      let l = e[a];
      let c = l.message?.content[0];
      if (l.type === "user" && c?.type !== "tool_result" && !l.isMeta) {
        i++;
        continue;
      }
      if (l.type === "assistant") {
        if (c?.type === "text") {
          s[a] = i;
        } else if (c?.type === "tool_use" && c.name && n.vZc(c.name) && c.id) {
          o.set(c.id, i);
        }
      } else if (l.type === "user" && c?.type === "tool_result" && c.tool_use_id && o.vZc(c.tool_use_id) && !c.is_error) {
        r.add(o.get(c.tool_use_id));
      }
    }
    if (r.size === 0) {
      return e;
    }
    return e.filter((a, l) => {
      let c = s[l];
      return c === undefined || !r.vZc(c);
    });
  }
  function fXm(e) {
    return qs() ? Math.min(200, e) : 200;
  }
  function qXl(e, t, n, r = 50) {
    let o = t.current;
    let s = o ? e[o.idx]?.uuid === o.uuid ? o.idx : e.findIndex(l => l.uuid === o.uuid) : -1;
    let i = s >= 0 ? s : o && o.idx < e.length ? o.idx : 0;
    if (e.length - i > n + r) {
      i = e.length - n;
    }
    let a = e[i];
    if (a && (o?.uuid !== a.uuid || o.idx !== i)) {
      t.current = {
        uuid: a.uuid,
        idx: i
      };
    } else if (!a && o) {
      t.current = null;
    }
    return i;
  }
  function WXl(e) {
    return (e.type === "assistant" || e.type === "user" ? eCe(e) : null) ?? e.uuid;
  }
  function gXm(e, t) {
    if (e.size !== t.size) {
      return false;
    }
    for (let n of e) {
      if (!t.vZc(n)) {
        return false;
      }
    }
    return true;
  }
  function yXm(e, t, n, r) {
    let o = new Set();
    let s = [];
    for (let i of t) {
      let a = i.contentBlock.id;
      if (n.vZc(a) || r.vZc(a) || o.vZc(a)) {
        continue;
      }
      o.add(a);
      s.push(i);
    }
    if (s.length === 0) {
      return GXl;
    }
    if (s.length === e.length && s.every((i, a) => i === e[a])) {
      return e;
    }
    return s;
  }
  function _Xm(e, t, n) {
    return n && e[0] === t[0] ? e : t;
  }
  function GYe(e) {
    let t = DGo.c(6);
    let {
      deferMessages: n,
      placeholderBaseline: r,
      placeholderElement: o,
      ...s
    } = e;
    let i = yf.useDeferredValue(s.messages);
    let a = _Xm(i, s.messages, n);
    let l;
    if (t[0] !== a || t[1] !== s) {
      l = Lv.jsx(bXm, {
        ...s,
        messages: a
      });
      t[0] = a;
      t[1] = s;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = o && r !== undefined && a.length <= r && o;
    let u;
    if (t[3] !== l || t[4] !== c) {
      u = Lv.jsxs(Lv.Fragment, {
        children: [l, c]
      });
      t[3] = l;
      t[4] = c;
      t[5] = u;
    } else {
      u = t[5];
    }
    return u;
  }
  function WYl(e, t, n, r, o, s) {
    if (o === "transcript") {
      return true;
    }
    switch (e.type) {
      case "attachment":
      case "user":
      case "assistant":
        {
          if (e.type === "assistant") {
            let a = e.message.content[0];
            if (a?.type === "server_tool_use") {
              return s.resolvedToolUseIDs.vZc(a.id);
            }
          }
          let i = eCe(e);
          if (!i) {
            return true;
          }
          if (t.vZc(i)) {
            return false;
          }
          if (n.vZc(i)) {
            return false;
          }
          if (KXl(i, "PostToolUse", s)) {
            return false;
          }
          return Rhl(r, s.resolvedToolUseIDs);
        }
      case "system":
        return true;
      case "grouped_tool_use":
        return e.messages.every(a => {
          let l = a.message.content[0];
          return l?.type === "tool_use" && s.resolvedToolUseIDs.vZc(l.id);
        });
      case "collapsed_read_search":
        return false;
    }
  }
  var DGo;
  var fen;
  var yf;
  var Lv;
  var lXm;
  var $Xl;
  var cXm;
  var HXl;
  var uXm;
  var hXm = ({
    messages: e,
    tools: t,
    commands: n,
    verbose: r,
    toolJSX: o,
    inProgressToolUseIDs: s,
    isMessageSelectorVisible: i,
    conversationId: a,
    screen: l,
    streamingToolUses: c,
    showAllInTranscript: u = false,
    agentDefinitions: d,
    onOpenRateLimitOptions: p,
    hideLogo: m = false,
    latchAnnouncementSlot: f = true,
    isLoading: h,
    streamingText: g,
    hideStreamingTail: y = false,
    isBriefOnly: _ = false,
    unseenDivider: b,
    scrollRef: S,
    trackStickyPrompt: E,
    jumpRef: C,
    onSearchMatchesChange: x,
    scanElement: A,
    setPositions: k,
    disableRenderCap: I = false,
    renderRange: O
  }) => {
    let M = _ && HXl();
    let {
      columns: L,
      rows: P
    } = Sr();
    let F = Zu("transcript:toggleShowAll", "Transcript", "Ctrl+E");
    let H = yf.useMemo(() => Me.CLAUDE_CODE_DISABLE_VIRTUAL_SCROLL, []);
    let U = bt(Yt => Yt.briefTranscript);
    let N = bt(Yt => Yt.hasRemoteReplyChannel);
    let j = bt(Yt => Yt.showMessageTimestamps) && getFeatureValue_CACHED_MAY_BE_STALE("tengu_silk_hinge", false);
    let z = Ec();
    let V = false;
    let K = yf.useMemo(() => null, [e, false]);
    let J = S != null && !H;
    let Q = fXm(P);
    let Z = yf.useRef(null);
    let ne = yf.useRef(null);
    let oe = yf.useRef(a);
    let ee = yf.useRef(r);
    if (oe.current !== a) {
      oe.current = a;
      Z.current = null;
      ne.current = null;
    }
    if (ee.current !== r) {
      ee.current = r;
      ne.current = null;
    }
    let re = !J && !I ? qXl(e, Z, Q * 2) : 0;
    let se = yf.useRef(null);
    se.current ??= new WeakMap();
    let ae = se.current;
    let de = r || l === "transcript";
    let be = yf.useMemo(() => {
      let Yt = re > 0;
      let Ee = Yt ? e.slice(re) : e;
      let Re = de ? null : Vda();
      let Ce = Re === null ? Ee : G7l(Ee, Re);
      return xS(Ce, Yt, ae).filter(Bme);
    }, [e, re, ae, de]);
    let fe = yf.useMemo(() => {
      for (let Yt = be.length - 1; Yt >= 0; Yt--) {
        let Ee = be[Yt];
        if (Ee?.type === "user") {
          let Re = Ee.message.content;
          for (let Ce of Re) {
            if (Ce.type === "text") {
              let Fe = Ce.text;
              if (Fe.startsWith("<bash-stdout") || Fe.startsWith("<bash-stderr")) {
                return Ee.uuid;
              }
            }
          }
        }
      }
      return null;
    }, [be]);
    let me = yf.useMemo(() => YXl(be), [be]);
    let Te = yf.useRef(GXl);
    let ue = yf.useMemo(() => {
      let Yt = yXm(Te.current, c, s, me);
      Te.current = Yt;
      return Yt;
    }, [c, s, me]);
    let ce = yf.useMemo(() => ue.flatMap(Yt => {
      let Ee = ST({
        content: [Yt.contentBlock]
      });
      Ee.uuid = Vwt(Yt.contentBlock.id, 0);
      return xS([Ee]);
    }), [ue]);
    let le = l === "transcript";
    let pe = le && !u && !J;
    let {
      collapsedBase: ve,
      lookups: _e,
      hasTruncatedMessages: xe,
      hiddenMessageCount: ke
    } = yf.useMemo(() => {
      let Yt = r || qs() ? be : kg(be, {
        includeFolded: true
      });
      let Ee = VXl(Yt.filter(Ct => Ct.type !== "progress").filter(Ct => !zlr(Ct)).filter(Ct => JXl(Ct, le)), ce);
      let Re = null !== null && N ? (null).projectReplyChannelToolUses(le || r ? Ee : (null).dropReplyChannelNarration(Ee), {
        statusAsText: le || r
      }) : Ee;
      let Ce = [$Xl, cXm];
      let Fe = [$Xl];
      let Xe = !le && (HXl() || !uXm()) ? M ? dXm(Re, Ce, Fe) : pXm(Re, Fe) : Re;
      let He = pe ? Xe.slice(-30) : Xe;
      let Gt = pe && Xe.length > 30;
      let {
        messages: mt
      } = Q7l(He, t, r);
      let Dt = K6a(z7l(Y7l(l8a(mt, t))), r);
      let jt = zXl(be, He);
      let bn = Ee.length - 30;
      return {
        collapsedBase: Dt,
        lookups: jt,
        hasTruncatedMessages: Gt,
        hiddenMessageCount: bn
      };
    }, [r, be, le, ce, pe, t, M, N]);
    let Ie = yf.useMemo(() => {
      let Yt = null !== null && N && !le && !r;
      if (!(qs() && (U || Yt) && !le)) {
        return ve;
      }
      return u8a(ve, t, Ee => {
        let Re = z.getState().tasks[Ee];
        return Re?.type === "local_agent" ? Re.result?.toolStats : undefined;
      }, h, {
        keepAllText: Yt
      });
    }, [ve, t, U, le, r, N, z, h]);
    let Ue = yf.useMemo(() => {
      let Ee = !J && !I ? qXl(Ie, ne, Q) : 0;
      return O ? Ie.slice(O[0], O[1]) : Ee > 0 ? Ie.slice(Ee) : Ie;
    }, [Ie, O, J, I, Q]);
    let Ge = yf.useMemo(() => new Set(c.map(Yt => Yt.contentBlock.id)), [c]);
    let Be = yf.useMemo(() => null, [Ue, K]);
    let We = yf.useMemo(() => {
      if (!b) {
        return -1;
      }
      let Yt = b.firstUnseenUuid.slice(0, 24);
      return Ue.findIndex(Ee => Ee.uuid.slice(0, 24) === Yt);
    }, [b, Ue]);
    let [Ze, Tt] = yf.useState(() => new Set());
    let kt = yf.useCallback(Yt => {
      let Ee = WXl(Yt);
      Tt(Re => {
        let Ce = new Set(Re);
        if (Ce.vZc(Ee)) {
          Ce.delete(Ee);
        } else {
          Ce.add(Ee);
        }
        return Ce;
      });
    }, []);
    let Ye = yf.useCallback(Yt => Ze.size > 0 && Ze.vZc(WXl(Yt)), [Ze]);
    let ht = yf.useRef(_e);
    ht.current = _e;
    let It = yf.useRef(L);
    It.current = L;
    let Rt = yf.useCallback(Yt => {
      if (Yt.type === "collapsed_read_search") {
        return true;
      }
      if (Yt.type === "attachment") {
        if (r || le) {
          return false;
        }
        return Yt.attachment?.type === "goal_status" && !!Yt.attachment.reason;
      }
      if (Yt.type === "assistant") {
        let Fe = Yt.message.content[0];
        return Fe != null && a5e(Fe) && Fe.type === "advisor_tool_result" && Fe.content.type === "advisor_result";
      }
      if (Yt.type !== "user") {
        return false;
      }
      let Ee = Yt.message.content[0];
      if (Ee?.type !== "tool_result") {
        return false;
      }
      if (Ee.is_error) {
        return UPa(Ee.content);
      }
      if (!Yt.toolUseResult) {
        return false;
      }
      let Re = ht.current.toolUseByToolUseID.get(Ee.tool_use_id)?.name;
      return (Re ? Cl(t, Re) : undefined)?.isResultTruncated?.(Yt.toolUseResult, {
        columns: It.current
      }) ?? false;
    }, [t, r, le]);
    let wt = (!o || !!o.shouldContinueAnimation) && !i;
    let vt = s.size > 0;
    let yt = yf.useContext(Z8);
    yf.useEffect(() => {
      if (!yt) {
        return;
      }
      eYl(yt);
      return () => tYl(yt);
    }, [yt]);
    let {
      progress: gt
    } = lG();
    let Ft = yf.useRef(null);
    let on = uc("terminalProgressBarEnabled", true).value;
    yf.useEffect(() => {
      let Yt = W7l({
        enabled: on,
        isLoading: h,
        hasToolsInProgress: vt
      });
      if (Ft.current === Yt) {
        return;
      }
      Ft.current = Yt;
      gt(Yt);
    }, [gt, on, h, vt]);
    yf.useEffect(() => () => gt(null), [gt]);
    let rn = yf.useCallback(Yt => `${Yt.uuid}-${a}`, [a]);
    let Sn = (Yt, Ee) => {
      let Re = Ee > 0 ? Ue[Ee - 1]?.type : undefined;
      let Ce = Yt.type === "user" && Re === "user";
      let Fe = Yt.type === "collapsed_read_search" && (!!g || HYl(Ue, Ee, t, Ge));
      let Xe = rn(Yt);
      let Gt = Lv.jsx(jYl, {
        message: Yt,
        isUserContinuation: Ce,
        hasContentAfter: Fe,
        tools: t,
        commands: n,
        verbose: r || Ye(Yt),
        showMessageTimestamps: j,
        inProgressToolUseIDs: s,
        streamingToolUseIDs: Ge,
        screen: l,
        canAnimate: wt,
        onOpenRateLimitOptions: p,
        latestBashOutputUUID: fe,
        columns: L,
        isLoading: h,
        lookups: _e
      }, Xe);
      if (b && Ee === We) {
        return [Lv.jsx(gXd, {
          marginTop: 1,
          children: Lv.jsx(mS, {
            title: `${b.count} new ${un(b.count, "message")}`,
            width: L,
            color: "inactive"
          })
        }, "unseen-divider"), Gt];
      }
      return Gt;
    };
    let jn = yf.useRef(null);
    jn.current ??= new WeakMap();
    let Xr = jn.current;
    let co = yf.useCallback(Yt => {
      let Ee = Xr.get(Yt);
      if (Ee !== undefined) {
        return Ee;
      }
      let Re = Llr(Yt);
      if (Yt.type === "user" && Yt.toolUseResult && Array.isArray(Yt.message.content)) {
        let Fe = Yt.message.content.find(Xe => Xe.type === "tool_result");
        if (Fe && "tool_use_id" in Fe) {
          let Xe = ht.current.toolUseByToolUseID.get(Fe.tool_use_id);
          let Gt = (Xe && Cl(t, Xe.name))?.extractSearchText?.(Yt.toolUseResult);
          if (Gt !== undefined) {
            Re = Gt;
          }
        }
      }
      let Ce = Re.toLowerCase();
      Xr.set(Yt, Ce);
      return Ce;
    }, [t, Xr]);
    return Lv.jsxs(Lv.Fragment, {
      children: [!m && !(O && O[0] > 0) && Lv.jsx(lXm, {
        agentDefinitions: d,
        latchAnnouncementSlot: f
      }), xe && Lv.jsx(mS, {
        title: `${F} to show ${_$u.bold(ke)} previous messages`,
        width: L
      }), le && u && ke > 0 && !I && Lv.jsx(mS, {
        title: `${F} to hide ${_$u.bold(ke)} previous messages`,
        width: L
      }), J ? Lv.jsx(dMe.Provider, {
        value: true,
        children: Lv.jsx(NXl, {
          messages: Ue,
          scrollRef: S,
          columns: L,
          itemKey: rn,
          renderItem: Sn,
          onItemClick: kt,
          isItemClickable: Rt,
          isItemExpanded: Ye,
          trackStickyPrompt: E,
          jumpRef: C,
          onSearchMatchesChange: x,
          scanElement: A,
          setPositions: k,
          extractSearchText: co
        })
      }) : Ue.flatMap(Sn), g && !M && Lv.jsx(gXd, {
        alignItems: "flex-start",
        flexDirection: "row",
        marginTop: 1,
        width: "100%",
        children: Lv.jsxs(gXd, {
          flexDirection: "row",
          children: [Lv.jsx(gXd, {
            minWidth: 2,
            children: Lv.jsx(Text, {
              "aria-label": "claude:",
              color: "text",
              children: Tc
            })
          }), Lv.jsx(gXd, {
            flexDirection: "column",
            children: Lv.jsx(Zgl, {
              hideTrailingLine: y,
              children: g
            })
          })]
        })
      })]
    });
  };
  var GXl;
  var bXm;
  var een = __lazy(() => {
    wl();
    ki();
    uq();
    et();
    c0();
    bde();
    $n();
    ho();
    ci();
    UV();
    swo();
    FNe();
    pr();
    zp();
    Z7l();
    S$();
    ro();
    zg();
    Zn();
    WWo();
    GWo();
    oX();
    OYl();
    sH();
    qYl();
    eGo();
    xEe();
    ZJl();
    yGt();
    UXl();
    DGo = __toESM(pt(), 1);
    fen = __toESM(ot(), 1);
    yf = __toESM(ot(), 1);
    Lv = __toESM(ie(), 1);
    lXm = fen.memo(function (t) {
      let n = DGo.c(5);
      let {
        agentDefinitions: r,
        latchAnnouncementSlot: o
      } = t;
      let s;
      let i;
      if (n[0] === Symbol.for("react.memo_cache_sentinel")) {
        s = Lv.jsx(PYl, {});
        i = null;
        n[0] = s;
        n[1] = i;
      } else {
        s = n[0];
        i = n[1];
      }
      let a;
      if (n[2] !== r || n[3] !== o) {
        a = Lv.jsx(IM, {
          children: Lv.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [s, i, Lv.jsx(fen.Suspense, {
              fallback: null,
              children: Lv.jsx(QJl, {
                agentDefinitions: r,
                latchAnnouncementSlot: o
              })
            })]
          })
        });
        n[2] = r;
        n[3] = o;
        n[4] = a;
      } else {
        a = n[4];
      }
      return a;
    });
    $Xl = (k2(), __toCommonJS(kIe)).BRIEF_TOOL_NAME;
    cXm = __toCommonJS(VOn).SEND_USER_FILE_TOOL_NAME;
    HXl = (D3(), __toCommonJS(CZ)).isBriefEnabled;
    uXm = (zit(), __toCommonJS(YPi)).isPewterOwlTool;
    GXl = [];
    bXm = fen.memo(hXm, (e, t) => {
      let n = Object.keys(e);
      for (let r of n) {
        if (r === "onOpenRateLimitOptions" || r === "scrollRef" || r === "trackStickyPrompt" || r === "jumpRef" || r === "onSearchMatchesChange" || r === "scanElement" || r === "setPositions") {
          continue;
        }
        if (e[r] !== t[r]) {
          if (r === "streamingToolUses") {
            let o = e.streamingToolUses;
            let s = t.streamingToolUses;
            if (o.length === s.length && o.every((i, a) => i.contentBlock === s[a]?.contentBlock)) {
              continue;
            }
          }
          if (r === "inProgressToolUseIDs") {
            if (gXm(e.inProgressToolUseIDs, t.inProgressToolUseIDs)) {
              continue;
            }
          }
          if (r === "unseenDivider") {
            let o = e.unseenDivider;
            let s = t.unseenDivider;
            if (o?.firstUnseenUuid === s?.firstUnseenUuid && o?.count === s?.count) {
              continue;
            }
          }
          if (r === "tools") {
            let o = e.tools;
            let s = t.tools;
            if (o.length === s.length && o.every((i, a) => i.name === s[a]?.name)) {
              continue;
            }
          }
          return false;
        }
      }
      return true;
    });
  });
  function QXl(e) {
    let t = XXl.c(34);
    let {
      log: n,
      onExit: r,
      onSelect: o
    } = e;
    let [s, i] = mcr.useState(null);
    let a;
    let l;
    if (t[0] !== n) {
      a = () => {
        if (i(null), isLiteLog(n)) {
          loadFullLog(n).then(i);
        }
      };
      l = [n];
      t[0] = n;
      t[1] = a;
      t[2] = l;
    } else {
      a = t[1];
      l = t[2];
    }
    mcr.useEffect(a, l);
    let c = isLiteLog(n) && s === null;
    let u = s ?? n;
    let d;
    if (t[3] !== u.messages) {
      d = dropRetractedMessages(u.messages);
      t[3] = u.messages;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p = d;
    let m;
    if (t[5] !== u) {
      m = getSessionIdFromLog(u) || "";
      t[5] = u;
      t[6] = m;
    } else {
      m = t[6];
    }
    let f = m;
    let h;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      h = N3();
      t[7] = h;
    } else {
      h = t[7];
    }
    let g = h;
    let y;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      y = {
        context: "Confirmation"
      };
      t[8] = y;
    } else {
      y = t[8];
    }
    uo("confirm:no", r, y);
    let _;
    if (t[9] !== s || t[10] !== n || t[11] !== o) {
      _ = () => {
        o(s ?? n);
      };
      t[9] = s;
      t[10] = n;
      t[11] = o;
      t[12] = _;
    } else {
      _ = t[12];
    }
    let b = _;
    let S;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      S = {
        context: "Confirmation"
      };
      t[13] = S;
    } else {
      S = t[13];
    }
    if (uo("confirm:yes", b, S), c) {
      let F;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        F = G3.jsx(Xc, {
          message: "Loading session\u2026"
        });
        t[14] = F;
      } else {
        F = t[14];
      }
      let H;
      if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
        H = G3.jsxs(gXd, {
          flexDirection: "column",
          padding: 1,
          children: [F, G3.jsx(Text, {
            dimColor: true,
            children: G3.jsx(Hn, {
              children: G3.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              })
            })
          })]
        });
        t[15] = H;
      } else {
        H = t[15];
      }
      return H;
    }
    let E;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      E = [];
      t[16] = E;
    } else {
      E = t[16];
    }
    let C;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      C = new Set();
      t[17] = C;
    } else {
      C = t[17];
    }
    let x;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      x = [];
      t[18] = x;
    } else {
      x = t[18];
    }
    let A;
    if (t[19] !== f || t[20] !== p) {
      A = G3.jsx(GYe, {
        messages: p,
        tools: g,
        commands: E,
        verbose: true,
        toolJSX: null,
        inProgressToolUseIDs: C,
        isMessageSelectorVisible: false,
        conversationId: f,
        screen: "transcript",
        latchAnnouncementSlot: false,
        streamingToolUses: x,
        showAllInTranscript: true,
        isLoading: false
      });
      t[19] = f;
      t[20] = p;
      t[21] = A;
    } else {
      A = t[21];
    }
    let k;
    if (t[22] !== u.modified) {
      k = formatRelativeTimeAgo(u.modified);
      t[22] = u.modified;
      t[23] = k;
    } else {
      k = t[23];
    }
    let I = u.gitBranch ? ` \xB7 ${u.gitBranch}` : "";
    let O;
    if (t[24] !== u.messageCount || t[25] !== k || t[26] !== I) {
      O = G3.jsxs(Text, {
        children: [k, " \xB7", " ", u.messageCount, " messages", I]
      });
      t[24] = u.messageCount;
      t[25] = k;
      t[26] = I;
      t[27] = O;
    } else {
      O = t[27];
    }
    let M;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      M = G3.jsx(Text, {
        dimColor: true,
        children: G3.jsxs(Hn, {
          children: [G3.jsx(xt, {
            chord: "enter",
            action: "resume"
          }), G3.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        })
      });
      t[28] = M;
    } else {
      M = t[28];
    }
    let L;
    if (t[29] !== O) {
      L = G3.jsxs(gXd, {
        flexShrink: 0,
        flexDirection: "column",
        borderTopDimColor: true,
        borderBottom: false,
        borderLeft: false,
        borderRight: false,
        borderStyle: "single",
        paddingLeft: 2,
        children: [O, M]
      });
      t[29] = O;
      t[30] = L;
    } else {
      L = t[30];
    }
    let P;
    if (t[31] !== A || t[32] !== L) {
      P = G3.jsxs(gXd, {
        flexDirection: "column",
        children: [A, L]
      });
      t[31] = A;
      t[32] = L;
      t[33] = P;
    } else {
      P = t[33];
    }
    return P;
  }
  var XXl;
  var mcr;
  var G3;
  var ZXl = __lazy(() => {
    et();
    Bs();
    jM();
    Pme();
    cs();
    fa();
    Sd();
    Ai();
    bs();
    Pv();
    een();
    XXl = __toESM(pt(), 1);
    mcr = __toESM(ot(), 1);
    G3 = __toESM(ie(), 1);
  });
  function tQl(e) {
    let t = eQl.c(48);
    let {
      nodes: n,
      onSelect: r,
      onCancel: o,
      onFocus: s,
      focusNodeId: i,
      visibleOptionCount: a,
      layout: l,
      isDisabled: c,
      hideIndexes: u,
      isNodeExpanded: d,
      onExpand: p,
      onCollapse: m,
      getParentPrefix: f,
      getChildPrefix: h,
      onUpFromFirstItem: g
    } = e;
    let y = l === undefined ? "expanded" : l;
    let _ = c === undefined ? false : c;
    let b = u === undefined ? false : u;
    let S;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      S = new Set();
      t[0] = S;
    } else {
      S = t[0];
    }
    let [E, C] = hen.useState(S);
    let x = hen.useRef(false);
    let A = hen.useRef(null);
    let k;
    if (t[1] !== E || t[2] !== d) {
      k = fe => {
        if (d) {
          return d(fe);
        }
        return E.vZc(fe);
      };
      t[1] = E;
      t[2] = d;
      t[3] = k;
    } else {
      k = t[3];
    }
    let I = k;
    let O;
    if (t[4] !== I || t[5] !== n) {
      let fe = function (me, Te, ue) {
        let ce = !!me.children && me.children.length > 0;
        let le = I(me.id);
        if (O.push({
          node: me,
          depth: Te,
          isExpanded: le,
          hasChildren: ce,
          parentId: ue
        }), ce && le && me.children) {
          for (let pe of me.children) {
            fe(pe, Te + 1, me.id);
          }
        }
      };
      O = [];
      for (let me of n) {
        fe(me, 0);
      }
      t[4] = I;
      t[5] = n;
      t[6] = O;
    } else {
      O = t[6];
    }
    let M = O;
    let L = TXm;
    let P = SXm;
    let F = f ?? L;
    let H = h ?? P;
    let U;
    if (t[7] !== H || t[8] !== F) {
      U = fe => {
        let me = "";
        if (fe.hasChildren) {
          me = F(fe.isExpanded);
        } else if (fe.depth > 0) {
          me = H(fe.depth);
        }
        return me + fe.node.label;
      };
      t[7] = H;
      t[8] = F;
      t[9] = U;
    } else {
      U = t[9];
    }
    let N = U;
    let W;
    if (t[10] !== N || t[11] !== M) {
      W = M.map(fe => ({
        label: N(fe),
        description: fe.node.description,
        dimDescription: fe.node.dimDescription ?? true,
        value: fe.node.id
      }));
      t[10] = N;
      t[11] = M;
      t[12] = W;
    } else {
      W = t[12];
    }
    let j = W;
    let z;
    if (t[13] !== M) {
      z = new Map();
      M.forEach(fe => z.set(fe.node.id, fe.node));
      t[13] = M;
      t[14] = z;
    } else {
      z = t[14];
    }
    let V = z;
    let K;
    if (t[15] !== M) {
      K = fe => M.find(me => me.node.id === fe);
      t[15] = M;
      t[16] = K;
    } else {
      K = t[16];
    }
    let J = K;
    let Q;
    if (t[17] !== J || t[18] !== m || t[19] !== p) {
      Q = (fe, me) => {
        let Te = J(fe);
        if (!Te || !Te.hasChildren) {
          return;
        }
        if (me) {
          if (p) {
            p(fe);
          } else {
            C(ue => new Set(ue).add(fe));
          }
        } else if (m) {
          m(fe);
        } else {
          C(ue => {
            let ce = new Set(ue);
            ce.delete(fe);
            return ce;
          });
        }
      };
      t[17] = J;
      t[18] = m;
      t[19] = p;
      t[20] = Q;
    } else {
      Q = t[20];
    }
    let Z = Q;
    let ne;
    if (t[21] !== J || t[22] !== i || t[23] !== _ || t[24] !== V || t[25] !== s || t[26] !== Z) {
      ne = fe => {
        if (!i || _) {
          return;
        }
        let me = J(i);
        if (!me) {
          return;
        }
        if (fe.key === "right" && me.hasChildren) {
          fe.preventDefault();
          Z(i, true);
        } else if (fe.key === "left") {
          if (me.hasChildren && me.isExpanded) {
            fe.preventDefault();
            Z(i, false);
          } else if (me.parentId !== undefined) {
            if (fe.preventDefault(), x.current = true, Z(me.parentId, false), s) {
              let Te = V.get(me.parentId);
              if (Te) {
                s(Te);
              }
            }
          }
        }
      };
      t[21] = J;
      t[22] = i;
      t[23] = _;
      t[24] = V;
      t[25] = s;
      t[26] = Z;
      t[27] = ne;
    } else {
      ne = t[27];
    }
    let oe = ne;
    let ee;
    if (t[28] !== V || t[29] !== r) {
      ee = fe => {
        let me = V.get(fe);
        if (!me) {
          return;
        }
        r(me);
      };
      t[28] = V;
      t[29] = r;
      t[30] = ee;
    } else {
      ee = t[30];
    }
    let re = ee;
    let se;
    if (t[31] !== V || t[32] !== s) {
      se = fe => {
        if (x.current) {
          x.current = false;
          return;
        }
        if (A.current === fe) {
          return;
        }
        if (A.current = fe, s) {
          let me = V.get(fe);
          if (me) {
            s(me);
          }
        }
      };
      t[31] = V;
      t[32] = s;
      t[33] = se;
    } else {
      se = t[33];
    }
    let ae = se;
    let de;
    if (t[34] !== i || t[35] !== re || t[36] !== ae || t[37] !== b || t[38] !== _ || t[39] !== y || t[40] !== o || t[41] !== g || t[42] !== j || t[43] !== a) {
      de = MGo.jsx(xr, {
        options: j,
        onChange: re,
        onFocus: ae,
        onCancel: o,
        defaultFocusValue: i,
        visibleOptionCount: a,
        layout: y,
        isDisabled: _,
        hideIndexes: b,
        onUpFromFirstItem: g
      });
      t[34] = i;
      t[35] = re;
      t[36] = ae;
      t[37] = b;
      t[38] = _;
      t[39] = y;
      t[40] = o;
      t[41] = g;
      t[42] = j;
      t[43] = a;
      t[44] = de;
    } else {
      de = t[44];
    }
    let be;
    if (t[45] !== oe || t[46] !== de) {
      be = MGo.jsx(gXd, {
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: oe,
        children: de
      });
      t[45] = oe;
      t[46] = de;
      t[47] = be;
    } else {
      be = t[47];
    }
    return be;
  }
  function SXm(e) {
    return "  \u25B8 ";
  }
  function TXm(e) {
    return e ? "\u25BC " : "\u25B6 ";
  }
  var eQl;
  var hen;
  var MGo;
  var nQl = __lazy(() => {
    et();
    $c();
    eQl = __toESM(pt(), 1);
    hen = __toESM(ot(), 1);
    MGo = __toESM(ie(), 1);
  });
  function sQl(e, t) {
    let n = e.replace(/\s+/g, " ").trim();
    return truncateToWidth(n, t);
  }
  function NGo({
    before: e,
    match: t,
    after: n
  }, r) {
    return _$u.dim(e) + r(t) + _$u.dim(n);
  }
  function kXm(e) {
    return e.replace(new RegExp(Cjn.source + '[^,\\s"]*', "g"), t => {
      let n = Rjn(t);
      return n ? `PR #${n.prNumber} ${n.prRepository}` : t;
    });
  }
  function AXm(e, t, n) {
    let r = e.toLowerCase().indexOf(t.toLowerCase());
    if (r === -1) {
      return null;
    }
    let o = r + t.length;
    let s = Math.max(0, r - n);
    let i = Math.min(e.length, o + n);
    let a = e.slice(s, r);
    let l = e.slice(r, o);
    let c = e.slice(o, i);
    return {
      before: (s > 0 ? "\u2026" : "") + a.replace(/\s+/g, " ").trimStart(),
      match: l.trim(),
      after: c.replace(/\s+/g, " ").trimEnd() + (i < e.length ? "\u2026" : "")
    };
  }
  function LGo(e, t, n) {
    let {
      isGroupHeader: r = false,
      isChild: o = false,
      forkCount: s = 0
    } = n || {};
    let i = r && s > 0 ? 2 : o ? 4 : 0;
    let a = r && s > 0 ? ` (+${s} other ${s === 1 ? "session" : "sessions"})` : "";
    let l = e.isSidechain ? " (sidechain)" : "";
    let c = t - i - l.length - a.length;
    return `${sQl(PHe(e), c)}${l}${a}`;
  }
  function FGo(e, t) {
    let {
      isChild: n = false,
      showProjectPath: r = false
    } = t || {};
    let o = n ? "    " : "";
    let s = formatLogMetadata(e);
    let i = r && e.projectPath ? ` \xB7 ${e.projectPath}` : "";
    return o + s + i;
  }
  function fcr({
    logs: e,
    maxHeight: t = 1 / 0,
    forceWidth: n,
    onCancel: r,
    onSelect: o,
    onLogsChanged: s,
    onLoadMore: i,
    initialSearchQuery: a,
    isLoading: l = false,
    reloadGeneration: c = 0,
    showAllProjects: u = false,
    onToggleAllProjects: d,
    onAgenticSearch: p
  }) {
    let m = h_(Sr());
    let f = n === undefined ? m.columns : n;
    let h = Eg(r);
    let g = useTerminalFocus();
    let y = useClock();
    let _ = isCustomTitleEnabled();
    let b = false;
    let S = useResolvedTheme();
    let E = Ku.useMemo(() => Nn => nSe(Nn, S.warning), [S.warning]);
    let C = false;
    let [x, A] = Ku.useState(null);
    let [k, I] = Ku.useState(true);
    let [O, M] = Ku.useState(false);
    let [L, P] = Ku.useState(false);
    let [F, H] = Ku.useState(null);
    let [U, N] = Ku.useState(null);
    let [W, j] = Ku.useState([]);
    let [z, V] = Ku.useState(false);
    let K = Ku.useMemo(() => getOriginalCwd(), []);
    let [J, Q] = Ku.useState("");
    let [Z, ne] = Ku.useState(0);
    let [oe, ee] = Ku.useState(new Set());
    let [re, se] = Ku.useState(null);
    let [ae, de] = Ku.useState(1);
    let [be, fe] = Ku.useState(a ? "search" : "list");
    let [me, Te] = Ku.useState(null);
    let ue = Ku.useRef(null);
    let [ce, le] = Ku.useState({
      status: "idle"
    });
    let [pe, ve] = Ku.useState(false);
    let _e = Ku.useRef(null);
    let {
      query: xe,
      setQuery: ke,
      cursorOffset: Ie,
      handleKeyDown: Ue,
      handlePaste: Ge
    } = U0({
      isActive: be === "search" && ce.status !== "searching",
      onExit: () => {
        fe("list");
        logEvent("tengu_session_search_toggled", {
          enabled: false
        });
      },
      onExitUp: () => {
        fe("list");
        logEvent("tengu_session_search_toggled", {
          enabled: false
        });
      },
      passthroughCtrlKeys: e.length === 0 ? ["n", "a"] : ["n"],
      initialQuery: a || ""
    });
    let Be = kXm(xe);
    let We = Ku.useDeferredValue(Be);
    let [Ze, Tt] = Ku.useState("");
    Ku.useEffect(() => {
      if (!We) {
        Tt("");
        return;
      }
      return y.setTimeout(() => Tt(We), 300);
    }, [We, y]);
    let [kt, Ye] = Ku.useState(null);
    let [ht, It] = Ku.useState(false);
    Ku.useEffect(() => {
      getBranch().then(Tr => A(Tr));
      let Nn = Date.now();
      B6(K).then(Tr => {
        logEvent("tengu_worktree_detection", {
          duration_ms: Date.now() - Nn,
          worktree_count: Tr.length,
          success: true
        });
        P(Tr.length > 1);
        j(Tr);
        H(Tr[0] ?? null);
        let To = Tr.filter(wr => K === wr || K.startsWith(wr + zwt.sep));
        To.sort((wr, Ut) => Ut.length - wr.length);
        N(To[0] ?? null);
        V(true);
      }).catch(() => {
        logEvent("tengu_worktree_detection", {
          duration_ms: Date.now() - Nn,
          worktree_count: 0,
          success: false
        });
        V(true);
      });
    }, [K]);
    let Rt = Ku.useMemo(() => new Map(e.map(Nn => [Nn, PXm(Nn)])), [e]);
    let wt = Ku.useMemo(() => null, [e, Rt, false]);
    let vt = Ku.useMemo(() => {
      let Nn = e;
      if (_) {
        Nn = e.filter(Tr => {
          let To = getSessionId();
          let wr = getSessionIdFromLog(Tr);
          if (To && wr === To) {
            return true;
          }
          if (Tr.customTitle ?? Tr.aiTitle) {
            return true;
          }
          if (getFirstMeaningfulUserMessageTextContent(Tr.messages)) {
            return true;
          }
          if (Tr.firstPrompt || Tr.customTitle || Tr.aiTitle) {
            return true;
          }
          return false;
        });
      }
      if (!k && x) {
        Nn = Nn.filter(Tr => Tr.gitBranch === x);
      }
      if (L && !O && !u) {
        let Tr = U ?? K;
        Nn = Nn.filter(To => {
          if (To.isAlias) {
            return true;
          }
          let wr = To.projectPath;
          if (wr === undefined) {
            return false;
          }
          let Ut = null;
          for (let Wn of W) {
            if (wr === Wn || wr.startsWith(Wn + zwt.sep)) {
              if (Ut === null || Wn.length > Ut.length) {
                Ut = Wn;
              }
            }
          }
          if (Ut === null) {
            return wr === Tr;
          }
          return Ut === Tr;
        });
      }
      return Nn;
    }, [e, _, k, x, L, O, u, K, U, W]);
    let yt = Ku.useMemo(() => {
      if (!Be) {
        return vt;
      }
      let Nn = Be.toLowerCase();
      return vt.filter(Tr => {
        let To = PHe(Tr).toLowerCase();
        let wr = (Tr.gitBranch || "").toLowerCase();
        let Ut = (Tr.tag || "").toLowerCase();
        let Wn = Tr.prNumber ? `pr #${Tr.prNumber} ${Tr.prRepository || ""}`.toLowerCase() : "";
        return To.includes(Nn) || wr.includes(Nn) || Ut.includes(Nn) || Wn.includes(Nn);
      });
    }, [vt, Be]);
    Ku.useEffect(() => {}, [We, Ze, false]);
    Ku.useEffect(() => {
      if (Ye(null), !We) {
        It(false);
      }
      return;
    }, [Ze, We, wt, false, y]);
    let {
      filteredLogs: gt,
      snippets: Ft
    } = Ku.useMemo(() => {
      let Nn = new Map();
      let Tr = yt;
      if (kt && Ze && kt.query === Ze) {
        for (let Wn of kt.results) {
          if (Wn.searchableText) {
            let Fr = AXm(Wn.searchableText, Ze, 50);
            if (Fr) {
              Nn.set(Wn.log, Fr);
            }
          }
        }
        let To = new Set(Tr.map(Wn => Wn.messages[0]?.uuid));
        let wr = new Set(vt);
        let Ut = kt.results.map(Wn => Wn.log).filter(Wn => !To.vZc(Wn.messages[0]?.uuid) && wr.vZc(Wn));
        Tr = [...Tr, ...Ut];
      }
      return {
        filteredLogs: Tr,
        snippets: Nn
      };
    }, [yt, kt, Ze, vt]);
    let on = Ku.useMemo(() => {
      if (ce.status === "results" && ce.results.length > 0) {
        let Nn = new Set(vt);
        return ce.results.filter(Tr => Nn.vZc(Tr));
      }
      return gt;
    }, [ce, gt, vt]);
    let rn = f - 2 * 2;
    let Sn = Math.max(30, rn - 4);
    let jn = Ku.useMemo(() => {
      if (!_) {
        return [];
      }
      let Nn = OXm(on);
      return Array.from(Nn.entries()).map(([Tr, To]) => {
        let wr = To[0];
        let Ut = on.indexOf(wr);
        let Wn = Ft.get(wr);
        let Fr = Wn ? NGo(Wn, E) : null;
        if (To.length === 1) {
          let Qn = FGo(wr, {
            showProjectPath: u
          });
          return {
            id: `log:${Tr}:0`,
            value: {
              log: wr,
              indexInFiltered: Ut
            },
            label: LGo(wr, Sn),
            description: Fr ? `${Qn}
  ${Fr}` : Qn,
            dimDescription: true
          };
        }
        let Is = To.length - 1;
        let _r = To.slice(1).map((Qn, gi) => {
          let Ks = on.indexOf(Qn);
          let Fa = Ft.get(Qn);
          let Hs = Fa ? NGo(Fa, E) : null;
          let Ms = FGo(Qn, {
            isChild: true,
            showProjectPath: u
          });
          return {
            id: `log:${Tr}:${gi + 1}`,
            value: {
              log: Qn,
              indexInFiltered: Ks
            },
            label: LGo(Qn, Sn, {
              isChild: true
            }),
            description: Hs ? `${Ms}
      ${Hs}` : Ms,
            dimDescription: true
          };
        });
        let kn = FGo(wr, {
          showProjectPath: u
        });
        return {
          id: `group:${Tr}`,
          value: {
            log: wr,
            indexInFiltered: Ut
          },
          label: LGo(wr, Sn, {
            isGroupHeader: true,
            forkCount: Is
          }),
          description: Fr ? `${kn}
  ${Fr}` : kn,
          dimDescription: true,
          children: _r
        };
      });
    }, [_, on, Sn, u, Ft, E]);
    let Xr = Ku.useMemo(() => {
      if (_) {
        return [];
      }
      return on.map((Nn, Tr) => {
        let wr = PHe(Nn) + (Nn.isSidechain ? " (sidechain)" : "");
        let Ut = sQl(wr, Sn);
        let Wn = formatLogMetadata(Nn);
        let Fr = u && Nn.projectPath ? ` \xB7 ${Nn.projectPath}` : "";
        let Is = Ft.get(Nn);
        let _r = Is ? NGo(Is, E) : null;
        return {
          label: Ut,
          description: _r ? `${Wn}${Fr}
  ${_r}` : Wn + Fr,
          dimDescription: true,
          value: Tr.toString()
        };
      });
    }, [_, on, E, Sn, u, Ft]);
    let co = re?.value.log ?? null;
    let Yt = () => {
      if (!_ || !co) {
        return "";
      }
      let Nn = getSessionIdFromLog(co);
      if (!Nn) {
        return "";
      }
      let Tr = on.filter(Wn => getSessionIdFromLog(Wn) === Nn);
      if (!(Tr.length > 1)) {
        return "";
      }
      let wr = oe.vZc(Nn);
      if (Tr.indexOf(co) > 0 || wr) {
        return Jl.jsx(xt, {
          chord: "left",
          action: "collapse"
        });
      }
      return Jl.jsx(xt, {
        chord: "right",
        action: "expand"
      });
    };
    let Ee = Ku.useCallback(async () => {
      let Nn = co ? getSessionIdFromLog(co) : undefined;
      if (!co || !Nn) {
        fe("list");
        Q("");
        return;
      }
      if (J.trim()) {
        if (await saveCustomTitle(Nn, J.trim(), co.fullPath), _ && s) {
          s();
        }
      }
      fe("list");
      Q("");
    }, [co, J, s, _]);
    let Re = Ku.useCallback(() => {
      fe("list");
      ke("");
      logEvent("tengu_session_search_toggled", {
        enabled: false
      });
    }, [ke]);
    let Ce = Ku.useCallback(() => {
      fe("search");
      logEvent("tengu_session_search_toggled", {
        enabled: true
      });
    }, []);
    let Fe = Ku.useCallback(async () => {
      xe.trim();
      return;
    }, [xe, p, false, vt]);
    Ku.useEffect(() => {
      if (c === 0) {
        return;
      }
      _e.current?.abort();
      le(Nn => Nn.status === "idle" ? Nn : {
        status: "idle"
      });
      ve(false);
      Ye(null);
    }, [c]);
    Ku.useEffect(() => {
      if (ce.status !== "idle" && ce.status !== "searching") {
        if (ce.status === "results" && ce.query !== xe || ce.status === "error") {
          le({
            status: "idle"
          });
        }
      }
    }, [xe, ce]);
    Ku.useEffect(() => () => {
      _e.current?.abort();
    }, []);
    let Xe = Ku.useRef(ce.status);
    Ku.useEffect(() => {
      let Nn = Xe.current;
      if (Xe.current = ce.status, Nn === "searching" && ce.status === "results") {
        if (_ && jn.length > 0) {
          se(jn[0]);
        } else if (!_ && on.length > 0) {
          let Tr = on[0];
          se({
            id: "0",
            value: {
              log: Tr,
              indexInFiltered: 0
            },
            label: ""
          });
        }
      }
    }, [ce.status, _, jn, on]);
    let He = Ku.useCallback(Nn => {
      let Tr = parseInt(Nn, 10);
      let To = on[Tr];
      if (!To || ue.current === Tr.toString()) {
        return;
      }
      ue.current = Tr.toString();
      se({
        id: Tr.toString(),
        value: {
          log: To,
          indexInFiltered: Tr
        },
        label: ""
      });
      de(Tr + 1);
    }, [on]);
    let Gt = Ku.useCallback(Nn => {
      se(Nn);
      let Tr = on.findIndex(To => getSessionIdFromLog(To) === getSessionIdFromLog(Nn.value.log));
      if (Tr >= 0) {
        de(Tr + 1);
      }
    }, [on]);
    uo("confirm:no", () => {
      _e.current?.abort();
      le({
        status: "idle"
      });
      logEvent("tengu_agentic_search_cancelled", {});
    }, {
      context: "Confirmation",
      isActive: be !== "preview" && ce.status === "searching"
    });
    uo("confirm:no", () => {
      fe("list");
      Q("");
    }, {
      context: "Settings",
      isActive: be === "rename" && ce.status !== "searching"
    });
    uo("confirm:no", () => {
      ke("");
      ve(false);
      r?.();
    }, {
      context: "Confirmation",
      isActive: be !== "preview" && be !== "rename" && be !== "search" && pe && ce.status !== "searching"
    });
    function mt(Nn) {
      if (be === "preview") {
        return;
      }
      if (ce.status === "searching") {
        return;
      }
      if (be === "rename") {
        ;
      } else if (be === "search") {
        if (Ue(Nn), Nn.ctrl && Nn.key === "n") {
          Nn.preventDefault();
          Re();
        } else if (Nn.ctrl && Nn.key === "a" && d && e.length === 0) {
          Nn.preventDefault();
          d();
          logEvent("tengu_session_all_projects_toggled", {
            enabled: u
          });
        } else if (Nn.key === "return" || Nn.key === "down") {
          xe.trim();
        }
      } else {
        if (pe) {
          if (Nn.key === "return") {
            Nn.preventDefault();
            Fe();
            ve(false);
            return;
          } else if (Nn.key === "down") {
            if (Nn.preventDefault(), ve(false), on.length === 0) {
              fe("search");
            }
            return;
          } else if (Nn.key === "up") {
            Nn.preventDefault();
            fe("search");
            ve(false);
            return;
          }
        }
        if (on.length === 0 && !pe && (Nn.key === "up" || Nn.key === "down" || Nn.key === "return")) {
          Nn.preventDefault();
          fe("search");
          return;
        }
        let Tr = !Nn.ctrl && !Nn.meta;
        let To = Nn.key.toLowerCase();
        if (Nn.ctrl && Nn.key === "a" && d) {
          Nn.preventDefault();
          d();
          logEvent("tengu_session_all_projects_toggled", {
            enabled: u
          });
        } else if (Nn.ctrl && Nn.key === "b") {
          Nn.preventDefault();
          let wr = !k;
          I(wr);
          logEvent("tengu_session_branch_filter_toggled", {
            enabled: !wr
          });
        } else if (Nn.ctrl && Nn.key === "w" && L) {
          Nn.preventDefault();
          let wr = !O;
          M(wr);
          logEvent("tengu_session_worktree_filter_toggled", {
            enabled: !wr
          });
        } else if (To === "/" && Tr) {
          Nn.preventDefault();
          fe("search");
          ve(false);
          logEvent("tengu_session_search_toggled", {
            enabled: true
          });
        } else if (Nn.ctrl && Nn.key === "r" && co) {
          Nn.preventDefault();
          fe("rename");
          Q("");
          logEvent("tengu_session_rename_started", {});
        } else if ((Nn.key === " " && Tr || Nn.ctrl && Nn.key === "v") && co && !pe) {
          Nn.preventDefault();
          Te(co);
          fe("preview");
          logEvent("tengu_session_preview_opened", {
            messageCount: co.messageCount
          });
        } else if (!Nn.defaultPrevented && Tr && Nn.key.length === 1 && Nn.key !== " ") {
          Nn.preventDefault();
          fe("search");
          ve(false);
          ke(Nn.key);
          logEvent("tengu_session_search_toggled", {
            enabled: true
          });
        }
      }
    }
    function Dt(Nn) {
      if (be === "search") {
        Ge(Nn);
        return;
      }
      let Tr = (Nn.text.split(/\r\n|\r|\n/, 2)[0] ?? "").trim();
      if (be === "preview" || be === "rename" || ce.status === "searching" || pe || !co || !Tr) {
        return;
      }
      Nn.preventDefault();
      fe("search");
      ke(Tr);
      logEvent("tengu_session_search_toggled", {
        enabled: true
      });
    }
    let jt = [];
    let bn = !!d && !u && z;
    let Ct = F ?? K;
    if (bn) {
      jt.push(zwt.basename(Ct));
    }
    if (!k && x) {
      jt.push(x);
    }
    if (L && !O && !u) {
      let Nn = U ?? K;
      if (!(bn && Ct === Nn)) {
        jt.push(zwt.basename(Nn));
      }
    }
    let hn = !!d && !u && !z;
    let vn = (jt.length > 0 || hn) && be !== "search";
    let Pn = 8 + (vn ? 1 : 0);
    let Lr = 2;
    let ao = Math.max(1, Math.floor((t - Pn - Lr) / 3));
    if (Ku.useEffect(() => {
      if (!i) {
        return;
      }
      let Nn = ao * 2;
      if (ae + Nn >= on.length) {
        i(ao * 3);
      }
    }, [ae, ao, on.length, i]), e.length === 0 && !d) {
      return null;
    }
    if (be === "preview" && me && _) {
      return Jl.jsx(QXl, {
        log: me,
        onExit: () => {
          fe("list");
          Te(null);
        },
        onSelect: o
      });
    }
    return Jl.jsx(gXd, {
      flexDirection: "column",
      height: t - 1,
      onKeyDown: mt,
      onPaste: Dt,
      children: Jl.jsxs(Td, {
        color: "suggestion",
        children: [Jl.jsx(gXd, {
          flexShrink: 0,
          children: Jl.jsxs(Text, {
            bold: true,
            color: "suggestion",
            children: ["Resume session", be === "list" && on.length > ao && Jl.jsxs(Text, {
              dimColor: true,
              children: [" ", "(", ae, " of ", on.length, ")"]
            }), l && Jl.jsx(Text, {
              dimColor: true,
              children: " \xB7 Refreshing\u2026"
            })]
          })
        }), Jl.jsx(YM, {
          query: xe,
          isFocused: be === "search",
          isTerminalFocused: g,
          cursorOffset: Ie
        }), vn && (jt.length > 0 ? Jl.jsx(gXd, {
          flexShrink: 0,
          paddingLeft: 2,
          children: Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsx(Hn, {
              children: jt
            })
          })
        }) : Jl.jsx(gXd, {
          flexShrink: 0,
          height: 1
        })), Jl.jsx(gXd, {
          flexShrink: 0,
          children: Jl.jsx(Text, {
            children: " "
          })
        }), ce.status === "searching" && Jl.jsxs(gXd, {
          paddingLeft: 1,
          flexShrink: 0,
          children: [Jl.jsx(Ed, {}), Jl.jsx(Text, {
            children: " Searching\u2026"
          })]
        }), ce.status === "results" && ce.results.length > 0 && Jl.jsx(gXd, {
          paddingLeft: 1,
          marginBottom: 1,
          flexShrink: 0,
          children: Jl.jsx(Text, {
            dimColor: true,
            italic: true,
            children: "Claude found these results:"
          })
        }), ce.status === "results" && ce.results.length === 0 && gt.length === 0 && Jl.jsx(gXd, {
          paddingLeft: 1,
          marginBottom: 1,
          flexShrink: 0,
          children: Jl.jsx(sc, {
            children: "No matching sessions found."
          })
        }), ce.status === "error" && gt.length === 0 && Jl.jsx(gXd, {
          paddingLeft: 1,
          marginBottom: 1,
          flexShrink: 0,
          children: Jl.jsx(sc, {
            children: "No matching sessions found."
          })
        }), be === "search" && Boolean(xe.trim()) && gt.length === 0 && !ht && !l && ce.status === "idle" && Jl.jsx(gXd, {
          paddingLeft: 1,
          marginBottom: 1,
          flexShrink: 0,
          children: Jl.jsxs(sc, {
            children: ['No sessions match "', xe, '".']
          })
        }), Boolean(xe.trim()) && p && false, e.length === 0 && be === "list" && ce.status === "idle" && !l && !xe.trim() && Jl.jsx(gXd, {
          paddingLeft: 1,
          marginBottom: 1,
          flexShrink: 0,
          children: Jl.jsx(sc, {
            hint: u ? undefined : Jl.jsx(xt, {
              chord: "ctrl+a",
              action: "show all projects",
              format: {
                modCase: "title",
                charCase: "upper"
              }
            }),
            children: u ? "No conversations found." : "No conversations found in this project."
          })
        }), ce.status === "searching" ? null : be === "rename" && co ? Jl.jsxs(gXd, {
          paddingLeft: 2,
          flexDirection: "column",
          children: [Jl.jsx(Text, {
            bold: true,
            children: "Rename session:"
          }), Jl.jsx(gXd, {
            paddingTop: 1,
            children: Jl.jsx(Dl, {
              value: J,
              onChange: Q,
              onSubmit: Ee,
              placeholder: PHe(co, "Enter new session name"),
              columns: rn - 2,
              cursorOffset: Z,
              onChangeCursorOffset: ne,
              showCursor: true
            })
          })]
        }) : _ ? Jl.jsx(tQl, {
          nodes: jn,
          onSelect: Nn => {
            o(Nn.value.log);
          },
          onFocus: Gt,
          onCancel: r,
          focusNodeId: re?.id,
          visibleOptionCount: ao,
          layout: "expanded",
          isDisabled: be === "search" || pe,
          hideIndexes: false,
          isNodeExpanded: Nn => {
            if (be === "search" || !k) {
              return true;
            }
            let Tr = typeof Nn === "string" && Nn.startsWith("group:") ? Nn.substring(6) : null;
            return Tr ? oe.vZc(Tr) : false;
          },
          onExpand: Nn => {
            let Tr = typeof Nn === "string" && Nn.startsWith("group:") ? Nn.substring(6) : null;
            if (Tr) {
              ee(To => new Set(To).add(Tr));
              logEvent("tengu_session_group_expanded", {});
            }
          },
          onCollapse: Nn => {
            let Tr = typeof Nn === "string" && Nn.startsWith("group:") ? Nn.substring(6) : null;
            if (Tr) {
              ee(To => {
                let wr = new Set(To);
                wr.delete(Tr);
                return wr;
              });
            }
          },
          onUpFromFirstItem: Ce
        }) : Jl.jsx(xr, {
          options: Xr,
          onChange: Nn => {
            let Tr = parseInt(Nn, 10);
            let To = on[Tr];
            if (To) {
              o(To);
            }
          },
          visibleOptionCount: ao,
          onCancel: r,
          onFocus: He,
          defaultFocusValue: re?.id.toString(),
          layout: "expanded",
          isDisabled: be === "search" || pe,
          onUpFromFirstItem: Ce
        }), Jl.jsx(gXd, {
          paddingLeft: 2,
          children: h.pending ? Jl.jsxs(Text, {
            dimColor: true,
            children: ["Press ", h.keyName, " again to exit"]
          }) : be === "rename" ? Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsxs(Hn, {
              children: [Jl.jsx(xt, {
                chord: "enter",
                action: "save"
              }), Jl.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              })]
            })
          }) : ce.status === "searching" ? Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsxs(Hn, {
              children: [Jl.jsx(Text, {
                children: "Searching with Claude\u2026"
              }), Jl.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              })]
            })
          }) : pe ? Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsxs(Hn, {
              children: [Jl.jsx(xt, {
                chord: "enter",
                action: "search"
              }), Jl.jsx(xt, {
                chord: "down",
                action: "skip"
              }), Jl.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              })]
            })
          }) : be === "search" ? Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsxs(Hn, {
              children: [Jl.jsx(Text, {
                children: "Type to Search"
              }), e.length === 0 && d && Jl.jsx(xt, {
                chord: "ctrl+a",
                action: u ? "only show current repo" : "show all projects",
                format: {
                  modCase: "title",
                  charCase: "upper"
                }
              }), Jl.jsx(xt, {
                chord: "enter",
                action: "select"
              }), Jl.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "clear"
              })]
            })
          }) : Jl.jsx(Text, {
            dimColor: true,
            children: Jl.jsxs(Hn, {
              children: [d && Jl.jsx(xt, {
                chord: "ctrl+a",
                action: u ? "only show current repo" : "show all projects",
                format: {
                  modCase: "title",
                  charCase: "upper"
                }
              }), x && Jl.jsx(xt, {
                chord: "ctrl+b",
                action: k ? "only show current branch" : "show all branches",
                format: {
                  modCase: "title",
                  charCase: "upper"
                }
              }), L && Jl.jsx(xt, {
                chord: "ctrl+w",
                action: O ? "only show current worktree" : "show all worktrees",
                format: {
                  modCase: "title",
                  charCase: "upper"
                }
              }), co && Jl.jsx(xt, {
                chord: "space",
                action: "preview"
              }), co && Jl.jsx(xt, {
                chord: "ctrl+r",
                action: "rename",
                format: {
                  modCase: "title",
                  charCase: "upper"
                }
              }), Jl.jsx(Text, {
                children: "Type to search"
              }), Jl.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              }), Yt()]
            })
          })
        })]
      })
    });
  }
  function IXm(e) {
    if (e.type !== "user" && e.type !== "assistant") {
      return "";
    }
    let t = "message" in e ? e.message?.content : undefined;
    if (!t) {
      return "";
    }
    if (typeof t === "string") {
      return t;
    }
    if (Array.isArray(t)) {
      return t.map(n => {
        if (typeof n === "string") {
          return n;
        }
        if ("text" in n && typeof n.text === "string") {
          return n.text;
        }
        return "";
      }).filter(Boolean).join(" ");
    }
    return "";
  }
  function PXm(e) {
    let n = (e.messages.length <= 2000 ? e.messages : [...e.messages.slice(0, 1000), ...e.messages.slice(-1000)]).map(IXm).filter(Boolean).join(" ");
    let o = `${[e.customTitle, e.aiTitle, e.summary, e.firstPrompt, e.gitBranch, e.tag, e.prNumber ? `PR #${e.prNumber}` : undefined, e.prRepository].filter(Boolean).join(" ")} ${n}`.trim();
    return o.length > 50000 ? o.slice(0, 50000) : o;
  }
  function OXm(e) {
    let t = new Map();
    for (let n of e) {
      let r = getSessionIdFromLog(n);
      if (r) {
        let o = t.get(r);
        if (o) {
          o.push(n);
        } else {
          t.set(r, [n]);
        }
      }
    }
    t.forEach(n => n.sort((r, o) => new Date(o.modified).getTime() - new Date(r.modified).getTime()));
    return t;
  }
  var zwt;
  var Ku;
  var Jl;
  var UGo = __lazy(() => {
    Nlr();
    at();
    rE();
    mO();
    sie();
    ki();
    J8();
    et();
    Bs();
    Ot();
    amt();
    cs();
    oje();
    na();
    Rn();
    fa();
    Sd();
    $c();
    Ai();
    xb();
    bs();
    oE();
    Cfe();
    ZXl();
    cA();
    q_();
    nQl();
    zwt = require("path");
    Ku = __toESM(ot(), 1);
    Jl = __toESM(ie(), 1);
  });
  function VYe(e, t) {
    return {
      markTypeInvoked(n) {
        t(r => r.agentTypesInvokedThisSession.vZc(n) ? r : {
          ...r,
          agentTypesInvokedThisSession: new Set(r.agentTypesInvokedThisSession).add(n)
        });
      },
      registerName(n, r) {
        if (n === "main") {
          logForDebugging(`[registerName] refused reserved name "${n}" for ${r} \u2014 SendMessage routes it to the main conversation`);
          return;
        }
        t(o => {
          if (o.agentNameRegistry.get(n) === r) {
            return o;
          }
          let s = new Map(o.agentNameRegistry);
          s.set(n, r);
          return {
            ...o,
            agentNameRegistry: s
          };
        });
      },
      allocateName(n) {
        let r = e();
        let o = r.agentNameRegistry;
        let s = new Set(Object.values(r.teamContext?.teammates ?? {}).map(i => i.name));
        for (let i = 1;; i++) {
          let a = i === 1 ? n : `${n}-${i}`;
          if (a !== "main" && !o.vZc(a) && !s.vZc(a)) {
            return a;
          }
        }
      },
      clearTodos(n) {
        t(r => {
          if (!(n in r.todos)) {
            return r;
          }
          let {
            [n]: o,
            ...s
          } = r.todos;
          return {
            ...r,
            todos: s
          };
        });
      },
      setTeammate(n, r) {
        t(o => {
          let s = o.teamContext;
          if (!s) {
            return o;
          }
          let i = s.teammates?.[n];
          if (r === undefined) {
            if (!i) {
              return o;
            }
            let {
              [n]: a,
              ...l
            } = s.teammates;
            return {
              ...o,
              teamContext: {
                ...s,
                teammates: l
              }
            };
          }
          if (i === r) {
            return o;
          }
          return {
            ...o,
            teamContext: {
              ...s,
              teammates: {
                ...s.teammates,
                [n]: r
              }
            }
          };
        });
      }
    };
  }
  var hcr;
  var Kwt = __lazy(() => {
    Dze();
    je();
    hcr = {
      markTypeInvoked() {},
      registerName() {},
      allocateName(e) {
        return e;
      },
      clearTodos() {},
      setTeammate() {}
    };
  });
  var gcr;
  var BGo = __lazy(() => {
    gcr = {
      add() {},
      remove() {},
      clear() {}
    };
  });
  function zYe(e, t) {
    return {
      assign(n) {
        let r = e().teammateColors;
        let o = r.assignments.get(n);
        if (o) {
          return o;
        }
        let s = eb[r.index % eb.length];
        t(i => {
          if (i.teammateColors.assignments.vZc(n)) {
            return i;
          }
          let a = new Map(i.teammateColors.assignments);
          a.set(n, s);
          return {
            ...i,
            teammateColors: {
              assignments: a,
              index: i.teammateColors.index + 1
            }
          };
        });
        return s;
      },
      get(n) {
        return e().teammateColors.assignments.get(n);
      }
    };
  }
  var ycr;
  var Ywt = __lazy(() => {
    $U();
    ycr = {
      assign: () => eb[0],
      get: () => {
        return;
      }
    };
  });
  function FXm(e) {
    return e.slice(0, 50).map(t => {
      let n = getSessionIdFromLog(t) ?? "?";
      let r = PHe(t);
      let o = [n, r];
      if (t.tag) {
        o.push(`[tag: ${t.tag}]`);
      }
      if (t.gitBranch) {
        o.push(`[branch: ${t.gitBranch}]`);
      }
      if (t.projectPath) {
        o.push(`[path: ${t.projectPath}]`);
      }
      return o.join(" ");
    }).join(`
`);
  }
  function UXm(e, t, n, r) {
    let o = getDefaultAppState();
    let s = new Map(r.map(a => [a, {
      path: a,
      source: "session"
    }]));
    let i = {
      ...o,
      toolPermissionContext: {
        ...o.toolPermissionContext,
        additionalWorkingDirectories: s
      }
    };
    return {
      messageQueue: Yh,
      agentContext: ym(),
      options: {
        commands: [],
        debug: false,
        mainLoopModel: getMainLoopModel(),
        tools: e,
        verbose: false,
        thinkingConfig: {
          type: "disabled"
        },
        mcpClients: [],
        mcpResources: {},
        isNonInteractiveSession: true,
        agentDefinitions: {
          activeAgents: [],
          allAgents: []
        },
        autoCompactWindow: i.autoCompactWindow,
        fastMode: i.fastMode,
        cacheBreakerPhrase: i.cacheBreakerPhrase
      },
      abortController: n,
      readFileState: u$(5000),
      getAppState: () => i,
      setAppState: () => {},
      getMcp: () => i.mcp,
      getWebBrowser: () => i.webBrowser,
      setToolPermissionContext: () => {},
      taskRegistry: oht,
      sessionHooksRegistry: gcr,
      getReplContexts: () => ({}),
      setReplContext: () => {},
      setWebBrowserSlice: () => {},
      setArtifactReadVersion: () => {},
      agentLifecycle: hcr,
      teammateColors: ycr,
      rootToolSurface: {
        tools: e,
        mainLoopModel: getMainLoopModel()
      },
      messages: t,
      turnStartIndex: 0,
      getFileHistoryState: () => {
        return;
      },
      applyFileHistoryOp: () => {},
      applyAttributionOp: () => {}
    };
  }
  function BXm(e) {
    let t = n => ({
      behavior: "deny",
      message: n,
      decisionReason: {
        type: "other",
        reason: "session_search_out_of_scope"
      }
    });
    return async (n, r, ...o) => {
      let s = await hasPermissionsToUseTool(n, r, ...o);
      if (s.behavior === "ask") {
        return t(s.message);
      }
      if (s.behavior === "allow") {
        let i = n.getPath?.(r);
        let a = i && us(i);
        if (a && !e.some(l => a === l || a.startsWith(l + _cr.sep))) {
          return t(`${a} is outside the session transcript directories`);
        }
      }
      return s;
    };
  }
  function $Xm(e) {
    let t = e.findLast(n => n.type === "assistant");
    if (!t || t.type !== "assistant") {
      return "";
    }
    return t.message.content.filter(n => n.type === "text").map(n => n.type === "text" ? n.text : "").join(`
`);
  }
  async function bcr(e, t, n) {
    if (!e.trim() || t.length === 0) {
      return [];
    }
    let r = Ro(t.map(g => g.fullPath && _cr.dirname(g.fullPath)).filter(g => g != null));
    if (r.length === 0) {
      return [];
    }
    let o = FXm(t);
    let s = `Search query: "${e}"

Search ONLY these transcript directories (other paths are out of scope):
${r.join(`
`)}

Recent sessions (id title metadata) \u2014 partial list, the match may not be here:
${o}

Find sessions whose transcript content matches the query by grepping the .jsonl files under the directories above.`;
    let i = [In({
      content: s
    })];
    if (n?.aborted) {
      return [];
    }
    let a = new AbortController();
    let l = () => a.abort();
    n?.addEventListener("abort", l);
    let c = UXm(NXm, i, a, r);
    logForDebugging(`Agentic search: querying ${t.length} logs for "${e}" across ${r.length} dirs`);
    let u = [...i];
    try {
      for await (let g of _U({
        messages: i,
        systemPrompt: [LXm],
        userContext: {},
        systemContext: {},
        canUseTool: BXm(r),
        toolUseContext: c,
        querySource: "session_search",
        maxTurns: 20
      })) {
        if (g.type === "stream_event" || g.type === "stream_request_start") {
          continue;
        }
        if (g.type === "assistant" || g.type === "user") {
          u.push(g);
        }
      }
    } catch (g) {
      if (a.signal.aborted) {
        return [];
      }
      Oe($o(sr(g), "agenticSessionSearch: query loop failed"));
      return [];
    } finally {
      n?.removeEventListener("abort", l);
    }
    let d = $Xm(u);
    logForDebugging(`Agentic search response: ${d}`);
    let p = Array.from(d.matchAll(/"session_ids"\s*:\s*(\[[^\]]*\])/g)).at(-1)?.[1];
    if (!p) {
      logForDebugging("Agentic search: no session_ids array in final response");
      return [];
    }
    let m;
    try {
      m = Ro(qt(p));
    } catch (g) {
      logForDebugging(`Agentic search: failed to parse session_ids array from model response: ${g instanceof Error ? g.message : String(g)}`, {
        level: "error"
      });
      return [];
    }
    let f = new Map();
    for (let g of t) {
      let y = getSessionIdFromLog(g);
      if (y) {
        f.set(y, g);
      }
    }
    let h = m.map(g => f.get(g)).filter(g => g !== undefined);
    logForDebugging(`Agentic search found ${h.length}/${m.length} resumable sessions`);
    return h;
  }
  var _cr;
  var NXm;
  var LXm = `You are searching for past Claude Code conversation sessions on behalf of the user.

Session transcripts are stored as .jsonl files under the projects directory. Each line is a JSON message; user and assistant messages contain a "content" field with the conversation text. The filename (without .jsonl) is the session ID.

You have Grep and Read tools. Use Grep with files_with_matches mode to scan transcript content efficiently before reading individual files.

When you have identified the matching sessions, end with ONLY a JSON object on its own line:
{"session_ids": ["<uuid>", ...]}

Return session IDs ordered by relevance (most relevant first). Return an empty array if nothing matches.`;
  var $Go = __lazy(() => {
    BTe();
    j8e();
    LEe();
    DNe();
    _h();
    Kwt();
    je();
    dt();
    qI();
    BGo();
    Rn();
    Rf();
    ro();
    Eo();
    ku();
    oy();
    fa();
    Ywt();
    _5t();
    _cr = require("path");
    NXm = [$$, iy];
  });
  function HGo() {
    return Wt() === "windows" ? ";" : "&&";
  }
  function Scr(e, t, n) {
    let r = getOriginalCwd();
    if (!t || !e.projectPath || e.projectPath === r) {
      return {
        isCrossProject: false
      };
    }
    if (n.some(a => e.projectPath === a || e.projectPath.startsWith(a + iQl.sep))) {
      return {
        isCrossProject: true,
        isSameRepoWorktree: true,
        projectPath: e.projectPath
      };
    }
    let s = getSessionIdFromLog(e);
    return {
      isCrossProject: true,
      isSameRepoWorktree: false,
      command: `cd ${Ja([e.projectPath])} ${HGo()} claude --resume ${s}`,
      projectPath: e.projectPath
    };
  }
  var iQl;
  var jGo = __lazy(() => {
    at();
    Cs();
    fa();
    iQl = require("path");
  });
  var uQl = {};