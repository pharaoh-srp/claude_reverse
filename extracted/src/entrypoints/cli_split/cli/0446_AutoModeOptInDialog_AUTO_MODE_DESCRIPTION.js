  __export(zCc, {
    ClosedIssueNotice: () => ClosedIssueNotice
  });
  function GCc(e) {
    return whr.jsxs(Link, {
      url: `${"https://github.com/anthropics/claude-code/issues/"}${e}`,
      children: ["#", e]
    }, e);
  }
  function Xwf(e) {
    if (e.length === 1) {
      return whr.jsxs(Text, {
        color: "success",
        children: ["\u2713 Your issue ", GCc(e[0].number), " has been closed. Thanks for reporting!"]
      });
    }
    let t = e.flatMap((n, r) => [r > 0 ? ", " : "", GCc(n.number)]);
    return whr.jsxs(Text, {
      color: "success",
      children: ["\u2713 ", e.length, " of your issues have been closed (", t, "). Thanks for reporting!"]
    });
  }
  function ClosedIssueNotice() {
    let e = VCc.c(3);
    let {
      addNotification: t
    } = Fi();
    let n = Chr.useRef(false);
    let r;
    let o;
    if (e[0] !== t) {
      r = () => {
        if (n.current) {
          return;
        }
        if (n.current = true, getFeatureValue_CACHED_MAY_BE_STALE("tengu_gouda_loop", false)) {
          let s = false;
          let i = [];
          let a = function (u) {
            let d = new Set(i.map(tCf));
            let p = u.filter(m => !d.vZc(m.number));
            if (p.length === 0) {
              return;
            }
            i.push(...p);
            logEvent("tengu_closed_issue_notice_shown", {
              newClosedIssueCount: p.length,
              totalClosedIssueCount: i.length
            });
            t({
              key: "closed-issue-notice",
              kind: "event",
              jsx: Xwf(i),
              priority: "low",
              timeoutMs: 1e4,
              fold: eCf
            });
            qCc(p.map(Zwf));
          };
          (async function () {
            let u = await sXo();
            let d = iXo(u);
            if (!s && d.length > 0) {
              a(d);
            }
            let p = await jCc();
            if (s || p === null || p > 4000) {
              return;
            }
            let m = iXo(await sXo());
            if (!s && m.length > 0) {
              a(m);
            }
          })().catch(Oe);
          return () => {
            s = true;
          };
        }
      };
      o = [t];
      e[0] = t;
      e[1] = r;
      e[2] = o;
    } else {
      r = e[1];
      o = e[2];
    }
    Chr.useEffect(r, o);
    return null;
  }
  function Zwf(e) {
    return e.number;
  }
  function eCf(e, t) {
    return t;
  }
  function tCf(e) {
    return e.number;
  }
  var VCc;
  var Chr;
  var whr;
  var KCc = __lazy(() => {
    Nd();
    et();
    $n();
    Ot();
    WCc();
    Rn();
    VCc = __toESM(pt(), 1);
    Chr = __toESM(ot(), 1);
    whr = __toESM(ie(), 1);
  });
  function xhr(e) {
    let t = JCc.c(40);
    let {
      apiKeyStatus: n,
      isAutoUpdating: r,
      verbose: o,
      tokenUsage: s,
      onChangeIsUpdating: i,
      isInputWrapped: a,
      hasStash: l
    } = e;
    let c = a === undefined ? false : a;
    let u = l === undefined ? false : l;
    let d = dR();
    let p = bt(lCf);
    let m;
    if (t[0] !== p || t[1] !== d || t[2] !== s) {
      m = _De(s, d, p);
      t[0] = p;
      t[1] = d;
      t[2] = s;
      t[3] = m;
    } else {
      m = t[3];
    }
    let f = m.level !== "ok";
    let h = dhr();
    let g = bt(aCf);
    let y = bt(iCf);
    let {
      addNotification: _,
      removeNotification: b
    } = Fi();
    let S = Wme();
    let E;
    let C;
    if (t[4] !== _) {
      E = () => (Ipo((Q, Z) => {
        _({
          key: "env-hook",
          kind: "event",
          text: Q,
          color: Z ? "error" : undefined,
          priority: Z ? "medium" : "low",
          timeoutMs: Z ? 8000 : 5000
        });
      }), sCf);
      C = [_];
      t[4] = _;
      t[5] = E;
      t[6] = C;
    } else {
      E = t[5];
      C = t[6];
    }
    HBe.useEffect(E, C);
    let x = S.isUsingOverage;
    let A;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      A = getSubscriptionType();
      t[7] = A;
    } else {
      A = t[7];
    }
    let k = A;
    let I = k === "team" || k === "enterprise";
    let O;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      O = v5();
      t[8] = O;
    } else {
      O = t[8];
    }
    let M = O;
    let L = c && !f && n !== "invalid" && n !== "missing" && M !== undefined;
    let P;
    let F;
    if (t[9] !== _ || t[10] !== b || t[11] !== L) {
      P = () => {
        if (L && M) {
          logEvent("tengu_external_editor_hint_shown", {});
          _({
            key: "external-editor-hint",
            kind: "hint",
            jsx: my.jsx(Text, {
              dimColor: true,
              children: my.jsx(Wr, {
                action: "chat:externalEditor",
                context: "Chat",
                fallback: "ctrl+g",
                description: `edit in ${S0(M)}`
              })
            }),
            priority: "immediate",
            timeoutMs: 5000
          });
        } else {
          b("external-editor-hint");
        }
      };
      F = [L, M, _, b];
      t[9] = _;
      t[10] = b;
      t[11] = L;
      t[12] = P;
      t[13] = F;
    } else {
      P = t[12];
      F = t[13];
    }
    HBe.useEffect(P, F);
    let H;
    let U;
    if (t[14] !== _ || t[15] !== g || t[16] !== f || t[17] !== d || t[18] !== b || t[19] !== h || t[20] !== s) {
      H = () => {
        if (f && !h && !g) {
          _({
            key: "token-warning",
            jsx: my.jsx(OCc, {
              tokenUsage: s,
              model: d
            }),
            priority: "medium",
            timeoutMs: 18000000,
            fold: oCf
          });
        } else {
          b("token-warning");
        }
      };
      U = [f, h, g, s, d, _, b];
      t[14] = _;
      t[15] = g;
      t[16] = f;
      t[17] = d;
      t[18] = b;
      t[19] = h;
      t[20] = s;
      t[21] = H;
      t[22] = U;
    } else {
      H = t[21];
      U = t[22];
    }
    HBe.useEffect(H, U);
    let N = Boolean(y || x && !I || n === "invalid" || n === "missing" || o || r);
    let W = x ?? false;
    let j;
    if (t[23] !== n || t[24] !== r || t[25] !== f || t[26] !== i || t[27] !== W || t[28] !== s || t[29] !== o) {
      j = my.jsx(gXd, {
        flexDirection: "column",
        alignItems: "flex-end",
        flexShrink: 1,
        overflowX: "hidden",
        children: my.jsx(cCf, {
          isInOverageMode: W,
          isTeamOrEnterprise: I,
          apiKeyStatus: n,
          verbose: o,
          tokenUsage: s,
          isAutoUpdating: r,
          isShowingCompactMessage: f,
          onChangeIsUpdating: i
        })
      });
      t[23] = n;
      t[24] = r;
      t[25] = f;
      t[26] = i;
      t[27] = W;
      t[28] = s;
      t[29] = o;
      t[30] = j;
    } else {
      j = t[30];
    }
    let z;
    if (t[31] !== N || t[32] !== u) {
      z = u && my.jsxs(gXd, {
        flexShrink: 0,
        children: [my.jsx(Text, {
          dimColor: true,
          children: N ? " \xB7 " : " "
        }), my.jsxs(Text, {
          dimColor: true,
          children: [vGd.pointerSmall, " stashed"]
        })]
      });
      t[31] = N;
      t[32] = u;
      t[33] = z;
    } else {
      z = t[33];
    }
    let V = N || u;
    let K;
    if (t[34] !== V) {
      K = my.jsx(NCc, {
        withSeparator: V
      });
      t[34] = V;
      t[35] = K;
    } else {
      K = t[35];
    }
    let J;
    if (t[36] !== j || t[37] !== z || t[38] !== K) {
      J = my.jsx(vKe, {
        children: my.jsxs(gXd, {
          flexDirection: "row",
          justifyContent: "flex-end",
          alignItems: "flex-end",
          flexShrink: 0,
          overflowX: "hidden",
          children: [j, z, K]
        })
      });
      t[36] = j;
      t[37] = z;
      t[38] = K;
      t[39] = J;
    } else {
      J = t[39];
    }
    return J;
  }
  function oCf(e, t) {
    return t;
  }
  function sCf() {
    return Ipo(null);
  }
  function iCf(e) {
    return e.notifications.current !== null;
  }
  function aCf(e) {
    return e.isBriefOnly;
  }
  function lCf(e) {
    return e.autoCompactWindow;
  }
  function cCf({
    isInOverageMode: e,
    isTeamOrEnterprise: t,
    apiKeyStatus: n,
    verbose: r,
    tokenUsage: o,
    isAutoUpdating: s,
    isShowingCompactMessage: i,
    onChangeIsUpdating: a
  }) {
    let [l, c] = HBe.useState(null);
    let u = !va() && getSubscriptionType() === "pro";
    HBe.useEffect(() => {
      if (!u) {
        c(_ => _ === null ? _ : null);
        return;
      }
      let y = YCc(o, getLastApiCompletionTimestamp());
      c(_ => _ === y ? _ : y);
    }, [o, u]);
    useInterval(() => {
      let y = YCc(o, getLastApiCompletionTimestamp());
      c(_ => _ === y ? _ : y);
    }, u ? 30000 : null);
    let [d, p] = HBe.useState(null);
    let m = !va() && Boolean(getConfiguredApiKeyHelper());
    useInterval(() => {
      let y = getApiKeyHelperElapsedMs();
      let _ = y >= 1e4 ? formatDuration(y) : null;
      p(b => _ === b ? b : _);
    }, m ? 1000 : null);
    let f = useVoiceState(y => y.voiceState);
    let h = Rhe();
    let g = useVoiceState(y => y.voiceError);
    if (h && (f === "recording" || f === "processing")) {
      return my.jsx(nCf, {
        voiceState: f
      });
    }
    return my.jsxs(my.Fragment, {
      children: [e && !t && my.jsx(gXd, {
        children: my.jsx(Text, {
          dimColor: true,
          wrap: "truncate",
          children: "Now using usage credits"
        })
      }), d && my.jsxs(gXd, {
        children: [my.jsxs(Text, {
          color: "warning",
          wrap: "truncate",
          children: ["apiKeyHelper is taking a while", " "]
        }), my.jsxs(Text, {
          dimColor: true,
          wrap: "truncate",
          children: ["(", d, ")"]
        })]
      }), (n === "invalid" || n === "missing") && my.jsx(gXd, {
        children: my.jsx(Text, {
          color: "error",
          wrap: "truncate",
          children: st(process.env.CLAUDE_CODE_REMOTE) ? "Authentication error \xB7 Try again" : "Not logged in \xB7 Run /login"
        })
      }), n !== "invalid" && n !== "missing" && r && my.jsx(gXd, {
        children: my.jsxs(Text, {
          dimColor: true,
          wrap: "truncate",
          children: [o, " tokens"]
        })
      }), l && my.jsx(gXd, {
        children: my.jsx(Text, {
          dimColor: true,
          wrap: "truncate",
          children: l
        })
      }), my.jsx(fhr, {
        verbose: r,
        isUpdating: s,
        onChangeIsUpdating: a,
        showSuccessMessage: !i
      }), my.jsx(rCf, {}), h && g && my.jsx(gXd, {
        children: my.jsx(Text, {
          color: "error",
          wrap: "truncate",
          children: g
        })
      }), my.jsx(ACc, {}), !va() && my.jsx(UCc, {}), my.jsx(hhr, {})]
    });
  }
  function YCc(e, t, n = Date.now()) {
    if (t === null) {
      return null;
    }
    if (e < 50000) {
      return null;
    }
    if (n - t <= 3600000) {
      return null;
    }
    return `~${Math.round(e / 1000)}k uncached \xB7 /clear to start fresh`;
  }
  var JCc;
  var HBe;
  var my;
  var nCf;
  var rCf;
  var khr = __lazy(() => {
    Nd();
    Ot();
    ho();
    at();
    dSe();
    iH();
    Nrn();
    et();
    ru();
    ADe();
    jSt();
    d$();
    XJo();
    no();
    SUe();
    gn();
    cs();
    q4t();
    bT();
    tXo();
    Sd();
    rXo();
    ICc();
    UQn();
    DCc();
    LCc();
    BCc();
    JCc = __toESM(pt(), 1);
    HBe = __toESM(ot(), 1);
    my = __toESM(ie(), 1);
    nCf = (Ehr(), __toCommonJS($Cc)).VoiceIndicator;
    rCf = (KCc(), __toCommonJS(zCc)).ClosedIssueNotice;
  });
  async function dCf(e, t) {
    let n = Math.ceil(e / 10) * 10;
    if (rXe && Ahr >= n && aXo === t) {
      return rXe;
    }
    if (rXe) {
      await rXe;
    }
    Ahr = n;
    aXo = t;
    rXe = (async () => {
      let r = [];
      let o = 0;
      for await (let s of DLn()) {
        if (t) {
          if (a0(s.display) !== t) {
            continue;
          }
        }
        if (r.push(s), o++, o >= Ahr) {
          break;
        }
      }
      return r;
    })();
    try {
      return await rXe;
    } finally {
      rXe = null;
      Ahr = 0;
      aXo = undefined;
    }
  }
  function QCc(e, t, n, r, o, s) {
    let [i, a] = US.useState(0);
    let [l, c] = US.useState(null);
    let u = US.useRef(0);
    let d = US.useRef(false);
    let [p, m] = US.useState(undefined);
    let f = US.useRef(false);
    let {
      addNotification: h,
      removeNotification: g
    } = Fi();
    let y = US.useRef([]);
    let _ = US.useRef(undefined);
    let b = US.useRef(0);
    let S = US.useRef(null);
    let E = US.useRef(undefined);
    let C = US.useRef(new Map());
    let x = US.useRef(0);
    let A = US.useRef(false);
    let k = US.useRef(0);
    let I = US.useRef(t);
    let O = US.useRef(n);
    let M = US.useRef(o);
    let L = US.useRef(s);
    I.current = t;
    O.current = n;
    M.current = o;
    L.current = s;
    let P = US.useCallback((V, K, J, Q) => {
      S.current = V;
      e(V, K, J);
      r(Q === "end" ? V.length : 0);
      I.current = V;
      O.current = J;
      M.current = K;
    }, [e, r]);
    let F = US.useCallback((V, K) => {
      if (!V || !V.display) {
        return false;
      }
      let J = a0(V.display);
      let Q = J === "bash" ? V.display.slice(1) : V.display;
      P(Q, J, V.pastedContents ?? {}, K);
      return true;
    }, [P]);
    let H = US.useCallback((V, K) => {
      let J = C.current.get(V);
      if (J) {
        P(J.display, J.mode, J.pastedContents, K);
        return true;
      }
      return F(y.current[V], K);
    }, [P, F]);
    let U = US.useCallback(() => {
      h({
        key: "search-history-hint",
        kind: "contextual",
        jsx: lXo.jsx(Text, {
          dimColor: true,
          children: lXo.jsx(Wr, {
            action: "history:search",
            context: "Global",
            fallback: "ctrl+r",
            description: "search history"
          })
        }),
        priority: "immediate",
        timeoutMs: 5000
      });
    }, [h]);
    let N = US.useCallback(() => {
      let V = b.current;
      let K = I.current;
      let J = O.current;
      let Q = M.current;
      let Z = x.current === 0;
      if (V === 0) {
        E.current = Q === "bash" ? Q : undefined;
      }
      let ne = E.current;
      if (_.current !== ne) {
        y.current = [];
        _.current = ne;
        C.current.clear();
        u.current++;
        d.current = false;
        c(null);
      }
      let oe = L.current;
      if (oe) {
        let se = ne ? oe.filter(de => a0(de.display) === ne) : oe;
        let ae = y.current;
        if (se.length > ae.length) {
          let de = se.length - ae.length;
          if (ae.length === 0 || se[de]?.display === ae[0]?.display) {
            if (b.current > 0) {
              b.current += de;
              a(b.current);
            }
            if (x.current > 0) {
              x.current += de;
            }
            if (C.current.size > 0) {
              C.current = new Map([...C.current].map(([be, fe]) => [be + de, fe]));
            }
          } else {
            b.current = 0;
            a(0);
            x.current = 0;
            C.current.clear();
          }
          y.current = se;
          V = b.current;
        }
        c(y.current.length);
      }
      if (V === 0 && !oe && !d.current) {
        d.current = true;
        let se = u.current;
        AQi(ne ? ae => a0(ae) === ne : undefined).then(ae => {
          if (u.current !== se) {
            return;
          }
          d.current = false;
          c(ae);
        });
      }
      let ee = () => {
        if (b.current !== V) {
          return;
        }
        if (V >= y.current.length) {
          return;
        }
        if (V === 0) {
          if (Z) {
            let ae = K.trim() !== "";
            m(ae ? {
              display: K,
              pastedContents: J,
              mode: Q
            } : undefined);
          }
        } else if (V === x.current) {
          C.current.set(V - 1, {
            display: K,
            pastedContents: J,
            mode: Q
          });
        }
        let se = V + 1;
        if (b.current = se, a(se), H(V, "end")) {
          x.current = se;
        }
        if (se >= 2 && !oe && !f.current) {
          f.current = true;
          U();
        }
      };
      if (V < y.current.length || oe) {
        ee();
        return;
      }
      A.current = true;
      let re = ++k.current;
      (async () => {
        try {
          let se = await dCf(V + 1, ne);
          if (k.current !== re) {
            return;
          }
          if (se.length > y.current.length && _.current === ne) {
            y.current = se;
          }
          ee();
        } catch {} finally {
          if (k.current === re) {
            A.current = false;
          }
        }
      })();
    }, [H, U]);
    let W = US.useCallback(() => {
      let V = A.current;
      if (V) {
        k.current++;
        A.current = false;
      }
      let K = b.current;
      if (K > 0 && K === x.current) {
        C.current.set(K - 1, {
          display: I.current,
          pastedContents: O.current,
          mode: M.current
        });
      }
      if (K > 1) {
        if (b.current--, a(K - 1), H(K - 2, "start")) {
          x.current = K - 1;
        }
      } else if (K === 1) {
        if (b.current = 0, a(0), p) {
          P(p.display, p.mode, p.pastedContents ?? {}, "start");
        } else {
          P("", E.current ?? "prompt", {}, "start");
        }
        x.current = 0;
      }
      return K <= 0 && !V;
    }, [p, H, P]);
    let j = US.useCallback(() => {
      m(undefined);
      a(0);
      c(null);
      u.current++;
      d.current = false;
      b.current = 0;
      x.current = 0;
      k.current++;
      A.current = false;
      S.current = null;
      E.current = undefined;
      g("search-history-hint");
      y.current = [];
      _.current = undefined;
      C.current.clear();
    }, [g]);
    let z = US.useCallback(() => {
      g("search-history-hint");
    }, [g]);
    return {
      historyIndex: i,
      historyTotal: l,
      historyEdited: i > 0 && t !== S.current,
      setHistoryIndex: a,
      onHistoryUp: N,
      onHistoryDown: W,
      resetHistory: j,
      dismissSearchHint: z
    };
  }
  var US;
  var lXo;
  var rXe = null;
  var Ahr = 0;
  var aXo = undefined;
  var ZCc = __lazy(() => {
    Nd();
    Sd();
    khr();
    gq();
    et();
    US = __toESM(ot(), 1);
    lXo = __toESM(ie(), 1);
  });
  function eRc(e, t, n, r, o, s, i, a, l, c, u) {
    let [d, p] = rC.useState("");
    let [m, f] = rC.useState(false);
    let [h, g] = rC.useState("");
    let [y, _] = rC.useState(0);
    let [b, S] = rC.useState("prompt");
    let [E, C] = rC.useState({});
    let [x, A] = rC.useState(undefined);
    let k = rC.useRef(undefined);
    let I = rC.useRef(new Set());
    let O = rC.useRef(null);
    let M = rC.useCallback(() => {
      if (k.current) {
        k.current.return(undefined);
        k.current = undefined;
      }
    }, []);
    let L = rC.useCallback(() => {
      l(false);
      p("");
      f(false);
      g("");
      _(0);
      S("prompt");
      C({});
      A(undefined);
      M();
      I.current.clear();
    }, [l, M]);
    let P = rC.useCallback(async (K, J) => {
      if (!a) {
        return;
      }
      if (d.length === 0) {
        M();
        I.current.clear();
        A(undefined);
        f(false);
        n(h);
        r(y);
        s(b);
        c(E);
        return;
      }
      if (!K) {
        M();
        k.current = poo();
        I.current.clear();
      }
      if (!k.current) {
        return;
      }
      let Q = d.toLowerCase();
      while (true) {
        if (J?.aborted) {
          return;
        }
        let Z = await k.current.next();
        if (Z.done) {
          f(true);
          return;
        }
        let ne = Z.value.display;
        let oe = ne.toLowerCase().lastIndexOf(Q);
        if (oe !== -1 && !I.current.vZc(ne)) {
          I.current.add(ne);
          A(Z.value);
          f(false);
          let ee = a0(ne);
          s(ee);
          n(ne);
          c(Z.value.pastedContents);
          let se = J2(ne).toLowerCase().lastIndexOf(Q);
          r(se !== -1 ? se : oe);
          return;
        }
      }
    }, [a, d, M, n, r, s, c, h, y, b, E]);
    let F = rC.useCallback(() => {
      Pe("history_search_open");
      l(true);
      g(t);
      _(o);
      S(i);
      C(u);
      k.current = poo();
      I.current.clear();
    }, [l, t, o, i, u]);
    let H = rC.useCallback(() => {
      P(true);
    }, [P]);
    let U = rC.useCallback(() => {
      if (x) {
        Pe("history_search_accept");
        let K = a0(x.display);
        let J = J2(x.display);
        n(J);
        s(K);
        c(x.pastedContents);
      } else {
        c(E);
      }
      L();
    }, [x, n, s, c, E, L]);
    let N = rC.useCallback(() => {
      n(h);
      r(y);
      c(E);
      L();
    }, [n, r, c, h, y, E, L]);
    let W = rC.useCallback(() => {
      if (d.length === 0) {
        e({
          display: h,
          pastedContents: E
        });
      } else if (x) {
        Pe("history_search_execute");
        let K = a0(x.display);
        let J = J2(x.display);
        s(K);
        e({
          display: J,
          pastedContents: x.pastedContents
        });
      }
      L();
    }, [d, x, e, s, h, E, L]);
    uo("history:search", F, {
      context: "Global",
      isActive: lre() ? false : !a
    });
    let j = rC.useMemo(() => ({
      "historySearch:next": H,
      "historySearch:accept": U,
      "historySearch:cancel": N,
      "historySearch:execute": W
    }), [H, U, N, W]);
    jo(j, {
      context: "HistorySearch",
      isActive: a
    });
    let z = K => {
      if (!a) {
        return;
      }
      if (K.key === "backspace" && d === "") {
        K.preventDefault();
        N();
      }
    };
    let V = rC.useRef(P);
    V.current = P;
    rC.useEffect(() => {
      O.current?.abort();
      let K = new AbortController();
      O.current = K;
      V.current(false, K.signal);
      return () => {
        K.abort();
      };
    }, [d]);
    return {
      historyQuery: d,
      setHistoryQuery: p,
      historyMatch: x,
      historyFailedMatch: m,
      handleKeyDown: z,
      openSearch: F
    };
  }
  var rC;
  var tRc = __lazy(() => {
    gq();
    Bs();
    ln();
    zp();
    rC = __toESM(ot(), 1);
  });
  function nRc({
    maxBufferSize: e,
    debounceMs: t
  }) {
    let n = useClock();
    let r = xhe.useRef({
      entries: [],
      index: -1
    });
    let [o, s] = xhe.useState(r.current);
    let i = xhe.useRef(0);
    let a = xhe.useRef(null);
    let l = xhe.useCallback((p, m, f = {}, h = {}) => {
      let g = Date.now();
      if (a.current) {
        a.current();
        a.current = null;
      }
      if (!h.immediate && g - i.current < t) {
        a.current = n.setTimeout(() => l(p, m, f), t);
        return;
      }
      i.current = g;
      let y = r.current;
      if (y.entries[y.index]?.text === p) {
        return;
      }
      let _ = [...y.entries.slice(0, y.index + 1), {
        text: p,
        cursorOffset: m,
        pastedContents: f,
        timestamp: g
      }];
      let b = _.length > e ? _.slice(-e) : _;
      r.current = {
        entries: b,
        index: b.length - 1
      };
      s(r.current);
    }, [t, e, n]);
    let c = xhe.useCallback(() => {
      if (a.current) {
        a.current();
        a.current = null;
      }
      let p = r.current;
      let m = p.entries[p.index];
      if (!m) {
        return;
      }
      r.current = {
        entries: p.entries,
        index: p.index - 1
      };
      s(r.current);
      return m;
    }, []);
    let u = xhe.useCallback(() => {
      if (r.current = {
        entries: [],
        index: -1
      }, s(r.current), i.current = 0, a.current) {
        a.current();
        a.current = null;
      }
    }, []);
    let d = o.index >= 0 && o.entries[o.index] !== undefined;
    return {
      pushToBuffer: l,
      undo: c,
      canUndo: d,
      clearBuffer: u
    };
  }
  var xhe;
  var rRc = __lazy(() => {
    et();
    xhe = __toESM(ot(), 1);
  });
  function oRc({
    inputValue: e,
    isAssistantResponding: t
  }) {
    let n = bt(b => b.promptSuggestion);
    let r = Lo();
    let o = useTerminalFocus();
    let {
      text: s,
      promptId: i,
      shownAt: a,
      acceptedAt: l,
      generationRequestId: c
    } = n;
    let u = t || e.length > 0 ? null : s;
    let d = s && a > 0;
    let p = zCe.useRef(0);
    let m = zCe.useRef(true);
    let f = zCe.useRef(0);
    if (a > 0 && a !== f.current) {
      f.current = a;
      m.current = o;
      p.current = 0;
    } else if (a === 0) {
      f.current = 0;
    }
    if (e.length > 0 && p.current === 0 && d) {
      p.current = Date.now();
    }
    let h = zCe.useCallback(() => {
      r(b => ({
        ...b,
        promptSuggestion: {
          text: null,
          promptId: null,
          shownAt: 0,
          acceptedAt: 0,
          generationRequestId: null
        }
      }));
    }, [r]);
    let g = zCe.useCallback(() => {
      if (!d) {
        return;
      }
      r(b => ({
        ...b,
        promptSuggestion: {
          ...b.promptSuggestion,
          acceptedAt: Date.now()
        }
      }));
    }, [d, r]);
    let y = zCe.useCallback(() => {
      r(b => {
        if (b.promptSuggestion.shownAt !== 0 || !b.promptSuggestion.text) {
          return b;
        }
        return {
          ...b,
          promptSuggestion: {
            ...b.promptSuggestion,
            shownAt: Date.now()
          }
        };
      });
    }, [r]);
    let _ = zCe.useCallback((b, S) => {
      if (!d) {
        return;
      }
      let E = l > a;
      let C = E || b === s;
      let x = C ? l || Date.now() : Date.now();
      if (logEvent("tengu_prompt_suggestion", {
        source: "cli",
        outcome: C ? "accepted" : "ignored",
        prompt_id: i == null ? undefined : i,
        ...(c && {
          generationRequestId: br(c)
        }),
        ...(C && {
          acceptMethod: E ? "tab" : "enter"
        }),
        ...(C && {
          timeToAcceptMs: x - a
        }),
        ...(!C && {
          timeToIgnoreMs: x - a
        }),
        ...(p.current > 0 && {
          timeToFirstKeystrokeMs: p.current - a
        }),
        wasFocusedWhenShown: m.current,
        similarity: Math.round(b.length / (s?.length || 1) * 100) / 100,
        ...false
      }), !S?.skipReset) {
        h();
      }
    }, [d, l, a, s, i, c, h]);
    return {
      suggestion: u,
      markAccepted: g,
      markShown: y,
      logOutcomeAtSubmission: _
    };
  }
  var zCe;
  var sRc = __lazy(() => {
    vPe();
    Ot();
    B_();
    ho();
    zCe = __toESM(ot(), 1);
  });
  function QRt(e) {
    return "'" + e[0].replaceAll("'", `'"'"'`) + "'";
  }
  function mCf(e) {
    if (e.startsWith("$")) {
      return "variable";
    }
    if (e.includes("/") || e.startsWith("~") || e.startsWith(".")) {
      return "file";
    }
    return "command";
  }
  function fCf(e, t) {
    let n = e.slice(0, t);
    let r = n.match(/\$[a-zA-Z_][a-zA-Z0-9_]*$/);
    if (r) {
      return {
        prefix: r[0],
        completionType: "variable"
      };
    }
    let o = n.split(/\s+/);
    let s = o.at(-1) || "";
    let i = o.length === 1 && !n.includes(" ");
    let a = mCf(s);
    return {
      prefix: s,
      completionType: a !== "command" ? a : i ? "command" : "file"
    };
  }
  function hCf(e, t) {
    if (t === "variable") {
      let n = e.slice(1);
      return `compgen -v ${QRt([n])} 2>/dev/null`;
    } else if (t === "file") {
      return `compgen -f ${QRt([e])} 2>/dev/null | head -${15} | while IFS= read -r f; do [ -d "$f" ] && echo "$f/" || echo "$f "; done`;
    } else {
      return `compgen -c ${QRt([e])} 2>/dev/null`;
    }
  }
  function gCf(e, t) {
    if (t === "variable") {
      let n = e.slice(1);
      return `print -rl -- \${(k)parameters[(I)${QRt([n])}*]} 2>/dev/null`;
    } else if (t === "file") {
      return `for f in ${QRt([e])}*(N[1,${15}]); do [[ -d "$f" ]] && echo "$f/" || echo "$f "; done`;
    } else {
      return `print -rl -- \${(k)commands[(I)${QRt([e])}*]} 2>/dev/null`;
    }
  }
  async function yCf(e, t, n, r, o) {
    let s;
    if (e === "bash") {
      s = hCf(t, n);
    } else if (e === "zsh") {
      s = gCf(t, n);
    } else {
      return [];
    }
    return (await (await Kde(s, r, "bash", {
      timeout: 1000,
      sessionEnvVars: o
    })).result).stdout.split(`
`).filter(l => l.trim()).slice(0, 15).map(l => ({
      id: l,
      displayText: l,
      description: undefined,
      metadata: {
        completionType: n
      }
    }));
  }
  async function iRc(e, t, n, r) {
    let o = O_t();
    if (o !== "bash" && o !== "zsh") {
      return [];
    }
    try {
      let {
        prefix: s,
        completionType: i
      } = fCf(e, t);
      if (!s) {
        return [];
      }
      return (await yCf(o, s, i, n, r)).map(l => ({
        ...l,
        metadata: {
          ...l.metadata,
          inputSnapshot: e
        }
      }));
    } catch (s) {
      logForDebugging(`Shell completion failed: ${s}`);
      return [];
    }
  }
  var aRc = __lazy(() => {
    je();
    zVe();
    U1();
  });
  async function cRc(e, t) {
    let n = e.indexOf(" ");
    if (!e.startsWith("/") || n === -1) {
      return [];
    }
    let r = e.slice(1, n);
    let o = e.slice(n + 1);
    let s = o.split(/\s+/).filter(Boolean);
    let i = o === "" || /\s$/.test(o);
    let a = i ? "" : s.at(-1) ?? "";
    let l = i ? s : s.slice(0, -1);
    let c = await t(l, a);
    let u = [`/${r}`, ...l].join(" ");
    return c.slice(0, 12).map(d => {
      let p = d.isFinal === true || d.value.toLowerCase() === a.toLowerCase();
      let m = !p && (d.appendSpace ?? true);
      return {
        id: `command-arg-${d.value}`,
        displayText: d.value,
        description: d.description,
        query: a === "" ? undefined : a.toLowerCase(),
        metadata: {
          replacement: `${u} ${d.value}${m ? " " : ""}`,
          partial: !p
        }
      };
    });
  }
  function uRc(e) {
    if (e.type === "prompt") {
      return "skill";
    }
    return _Cf[e.name] ?? "action";
  }
  function dRc(e) {
    if (e.type !== "prompt") {
      return "builtin";
    }
    switch (e.source) {
      case "builtin":
        return "builtin";
      case "bundled":
        return "bundled";
      case "mcp":
        return "mcp";
      case "plugin":
        return "plugin";
      case "userSettings":
        return "user";
      case "projectSettings":
      case "localSettings":
        return "project";
      case "policySettings":
        return "managed";
      case "flagSettings":
        return "flag";
    }
  }
  var _Cf;
  var pRc = __lazy(() => {
    _Cf = {
      advisor: "config",
      agents: "config",
      autocompact: "config",
      brief: "config",
      channel: "config",
      chrome: "config",
      color: "config",
      config: "config",
      effort: "config",
      env: "config",
      experiments: "config",
      "extra-usage": "config",
      fast: "config",
      focus: "config",
      goal: "config",
      hooks: "config",
      ide: "config",
      "install-github-app": "config",
      "install-slack-app": "config",
      issue: "config",
      keybindings: "config",
      mcp: "config",
      memory: "config",
      model: "config",
      "output-style": "config",
      passes: "config",
      "pause-memory": "config",
      permissions: "config",
      plan: "config",
      plugin: "config",
      powerup: "config",
      pride: "config",
      "privacy-settings": "config",
      "pro-trial-expired": "config",
      "rate-limit-options": "config",
      "remote-control": "config",
      "remote-env": "config",
      sandbox: "config",
      "scroll-speed": "config",
      "setup-bedrock": "config",
      "setup-vertex": "config",
      "terminal-setup": "config",
      theme: "config",
      tui: "config",
      upgrade: "config",
      "usage-credits": "config",
      vim: "config",
      voice: "config",
      "web-setup": "config",
      wellbeing: "config",
      "add-dir": "action",
      "ant-trace": "action",
      background: "action",
      branch: "action",
      btw: "action",
      cd: "action",
      clear: "action",
      compact: "action",
      copy: "action",
      "debug-tool-call": "action",
      desktop: "action",
      exit: "action",
      export: "action",
      feedback: "action",
      heapdump: "action",
      design: "action",
      "design-login": "action",
      login: "action",
      logout: "action",
      "mock-limits": "action",
      "oauth-refresh": "action",
      onboarding: "action",
      "perf-issue": "action",
      radio: "action",
      "reload-plugins": "action",
      "reload-skills": "action",
      rename: "action",
      "reset-limits": "action",
      resume: "action",
      "simulate-usage": "action",
      rewind: "action",
      stickers: "action",
      stop: "action",
      teleport: "action",
      update: "action",
      context: "info",
      diff: "info",
      doctor: "info",
      help: "info",
      "input-debug": "info",
      mobile: "info",
      recap: "info",
      "release-notes": "info",
      "render-debug": "info",
      session: "info",
      skills: "info",
      status: "info",
      usage: "info",
      version: "info",
      "autofix-pr": "agent",
      autopilot: "agent",
      bugfix: "agent",
      daemon: "agent",
      dashboard: "agent",
      docs: "agent",
      fork: "agent",
      investigate: "agent",
      schedule: "agent",
      "list-agents": "agent",
      loops: "agent",
      tasks: "agent",
      ultraplan: "agent",
      ultrareview: "agent",
      workflows: "agent"
    };
  });
  function bCf(e) {
    if (uXo?.commands === e) {
      return uXo.fuse;
    }
    let t = e.filter(r => !r.isHidden).map(r => {
      let o = r.name;
      let s = getCommandName(r);
      let i = o.split(mRc).filter(Boolean);
      let a = s !== o ? s.split(mRc).filter(Boolean) : [];
      return {
        descriptionKey: (r.description ?? "").split(" ").map(l => xCf(l)).filter(Boolean),
        partKey: i.length > 1 ? i : undefined,
        displayPartKey: a.length > 1 ? a : undefined,
        commandName: o,
        displayName: s,
        command: r,
        aliasKey: r.aliases
      };
    });
    let n = new tee(t, {
      includeScore: true,
      threshold: 0.3,
      location: 0,
      distance: 100,
      keys: [{
        name: "commandName",
        weight: 3
      }, {
        name: "displayName",
        weight: 2
      }, {
        name: "partKey",
        weight: 2
      }, {
        name: "aliasKey",
        weight: 2
      }, {
        name: "displayPartKey",
        weight: 1
      }, {
        name: "descriptionKey",
        weight: 0.5
      }]
    });
    uXo = {
      commands: e,
      fuse: n
    };
    return n;
  }
  function fRc(e) {
    return typeof e === "object" && e !== null && "name" in e && typeof e.name === "string" && "type" in e;
  }
  function Phr(e, t) {
    if (e.startsWith("/")) {
      let l = e.indexOf(" ");
      let c = l === -1 ? e.slice(1) : e.slice(1, l);
      if (SCf.vZc(c)) {
        return null;
      }
    }
    let r = e.slice(0, t).match(/[\s\u3002\u3001\uFF1F\uFF01]\/([a-zA-Z0-9._:-]*)$/);
    if (!r || r.index === undefined) {
      return null;
    }
    let o = r.index + 1;
    let i = e.slice(o + 1).match(/^[a-zA-Z0-9._:-]*/);
    let a = i ? i[0] : "";
    if (t > o + 1 + a.length) {
      return null;
    }
    return {
      token: "/" + a,
      startPos: o,
      partialCommand: a
    };
  }
  function pXo(e, t) {
    if (!e) {
      return null;
    }
    let n = fXo("/" + e, t);
    if (n.length === 0) {
      return null;
    }
    let r = e.toLowerCase();
    for (let o of n) {
      if (!fRc(o.metadata)) {
        continue;
      }
      for (let s of [o.metadata.name, getCommandName(o.metadata)]) {
        if (s.toLowerCase().startsWith(r)) {
          let i = s.slice(e.length);
          if (i) {
            return {
              suffix: i,
              fullCommand: s
            };
          }
        }
      }
    }
    return null;
  }
  function mXo(e) {
    return !/[^a-zA-Z0-9.:\-_]/.test(e);
  }
  function oXe(e) {
    if (!e.startsWith("/")) {
      return false;
    }
    let t = e.indexOf(" ");
    let n = t === -1 ? e.slice(1) : e.slice(1, t);
    if (mXo(n)) {
      return true;
    }
    let r = n.indexOf(":");
    return r > 0 && looksLikeCommand(n.slice(0, r)) && n.slice(r + 1).includes("://");
  }
  function TCf(e) {
    if (!oXe(e)) {
      return false;
    }
    if (!e.includes(" ")) {
      return false;
    }
    if (e.endsWith(" ")) {
      return false;
    }
    return true;
  }
  function ECf(e) {
    return `/${e} `;
  }
  function Ihr(e) {
    let t = e.name;
    if (e.type === "prompt") {
      if (e.source === "plugin" && e.pluginInfo?.repository) {
        return `${t}:${e.source}:${e.pluginInfo.repository}`;
      }
      return `${t}:${e.source}`;
    }
    return `${t}:${e.type}`;
  }
  function vCf(e, t) {
    if (!t || t.length === 0 || e === "") {
      return;
    }
    return t.find(n => n.toLowerCase().startsWith(e));
  }
  function wCf() {
    return Me.CLAUDE_CODE_ENABLE_MENU_KIND_LANES || getFeatureValue_CACHED_MAY_BE_STALE("tengu_mint_lanes", false);
  }
  function CCf(e) {
    return false;
  }
  function RCf(e) {
    if (e.type !== "prompt") {
      return CCf(e.name) ? "ANT" : undefined;
    }
    switch (dRc(e)) {
      case "project":
        return "project";
      case "plugin":
      case "managed":
        return "org";
      default:
        return;
    }
  }
  function dXo(e, t, n, r) {
    let o = getCommandName(e);
    let s = n ? ` (${n})` : "";
    let i = e.type === "prompt" && e.kind === "workflow";
    let l = (t ? e.menuDescription ?? e.description : i ? e.description : formatDescriptionWithSource(e)) + (e.type === "prompt" && e.argNames?.length ? ` (arguments: ${e.argNames.join(", ")})` : "");
    return {
      id: Ihr(e),
      displayText: `/${o}${s}`,
      tag: i ? "dynamic workflow" : undefined,
      description: l,
      metadata: e,
      matchedAlias: n,
      query: r,
      ...(t && {
        kind: uRc(e),
        sourceTag: RCf(e)
      })
    };
  }
  function fXo(e, t) {
    if (!oXe(e)) {
      return [];
    }
    if (TCf(e)) {
      return [];
    }
    t = dropShadowedBundledSkills(t);
    let n = e.slice(1).toLowerCase().trim();
    let r = wCf();
    if (n === "") {
      let d = t.filter(E => !E.isHidden && !isSkillOff(E));
      let p = [];
      let m = d.filter(E => E.type === "prompt").map(E => ({
        cmd: E,
        score: Nve(E.name)
      })).filter(E => E.score > 0).sort((E, C) => C.score - E.score);
      for (let E of m.slice(0, 5)) {
        p.push(E.cmd);
      }
      let f = new Set(p.map(E => Ihr(E)));
      let h = [];
      let g = [];
      let y = [];
      let _ = [];
      let b = [];
      d.forEach(E => {
        if (f.vZc(Ihr(E))) {
          return;
        }
        if (E.type === "local" || E.type === "local-jsx") {
          h.push(E);
        } else if (E.type === "prompt" && (E.source === "userSettings" || E.source === "localSettings")) {
          g.push(E);
        } else if (E.type === "prompt" && E.source === "projectSettings") {
          y.push(E);
        } else if (E.type === "prompt" && E.source === "policySettings") {
          _.push(E);
        } else {
          b.push(E);
        }
      });
      let S = (E, C) => getCommandName(E).localeCompare(getCommandName(C));
      h.sort(S);
      g.sort(S);
      y.sort(S);
      _.sort(S);
      b.sort(S);
      return [...p, ...h, ...g, ...y, ..._, ...b].map(E => dXo(E, r));
    }
    let o = d => getCommandName(d).toLowerCase() === n || d.name.toLowerCase() === n;
    let s = t.find(d => d.isHidden && o(d));
    if (s && t.some(d => !d.isHidden && o(d))) {
      s = undefined;
    }
    let u = bCf(t).search(n).filter(d => !isSkillOff(d.item.command)).map(d => {
      let p = d.item.commandName.toLowerCase();
      let m = d.item.displayName.toLowerCase();
      let f = d.item.aliasKey?.map(g => g.toLowerCase()) ?? [];
      let h = d.item.command.type === "prompt" ? Nve(d.item.command.name) : 0;
      return {
        r: d,
        name: p,
        display: m,
        aliases: f,
        usage: h
      };
    }).sort((d, p) => {
      let m = d.name;
      let f = p.name;
      let h = d.aliases;
      let g = p.aliases;
      let y = m === n || d.display === n;
      let _ = f === n || p.display === n;
      if (y && !_) {
        return -1;
      }
      if (_ && !y) {
        return 1;
      }
      let b = h.some(P => P === n);
      let S = g.some(P => P === n);
      if (b && !S) {
        return -1;
      }
      if (S && !b) {
        return 1;
      }
      let E = (P, F) => Math.min(P.startsWith(n) ? P.length : 1 / 0, F.startsWith(n) ? F.length : 1 / 0);
      let C = E(m, d.display);
      let x = E(f, p.display);
      let A = C < 1 / 0;
      let k = x < 1 / 0;
      if (A && !k) {
        return -1;
      }
      if (k && !A) {
        return 1;
      }
      if (A && k && C !== x) {
        return C - x;
      }
      let I = h.find(P => P.startsWith(n));
      let O = g.find(P => P.startsWith(n));
      if (I && !O) {
        return -1;
      }
      if (O && !I) {
        return 1;
      }
      if (I && O && I.length !== O.length) {
        return I.length - O.length;
      }
      let M = Math.floor((d.r.score ?? 0) * 10);
      let L = Math.floor((p.r.score ?? 0) * 10);
      if (M !== L) {
        return M - L;
      }
      return p.usage - d.usage;
    }).map(d => {
      let p = d.r.item.command;
      let m = vCf(n, p.aliases);
      return dXo(p, r, m, n);
    });
    if (s) {
      let d = Ihr(s);
      if (!u.some(p => p.id === d)) {
        return [dXo(s, r, undefined, n), ...u];
      }
    }
    return u;
  }
  function hXo(e, t, n, r, o, s) {
    if (typeof e !== "string") {
      let c = kSt(e.metadata);
      if (c) {
        let u = c.replacement;
        if (r(u), o(u.length), t && !c.partial) {
          s(u.trim(), true);
        }
        return {
          newInput: u,
          reSuggest: c.partial
        };
      }
    }
    let i;
    let a;
    if (typeof e === "string") {
      i = e;
      a = t ? getCommand(i, n) : undefined;
    } else {
      if (!fRc(e.metadata)) {
        return null;
      }
      let c = e.matchedAlias;
      i = c && findCommand(c, n) === e.metadata ? c : e.metadata.name;
      a = e.metadata;
    }
    if (nA()) {
      if (a?.type === "prompt" && a.urlTemplate) {
        let c = `/${getCommandName(a)}`;
        r(c);
        o(c.length);
        return {
          newInput: c,
          reSuggest: true
        };
      }
    }
    let l = ECf(i);
    if (r(l), o(l.length), t && a) {
      if (a.type !== "prompt" || (a.argNames ?? []).length === 0) {
        s(l, true);
      }
    }
    return {
      newInput: l,
      reSuggest: false
    };
  }
  function xCf(e) {
    return e.toLowerCase().replace(/[^a-z0-9]/g, "");
  }
  var mRc;
  var uXo = null;
  var SCf;
  var hRc = __lazy(() => {
    Nlr();
    pRc();
    Bm();
    $n();
    Noe();
    ASt();
    pr();
    DLe();
    Lve();
    mRc = /[:_-]/g;
    SCf = new Set(["add-dir", "resume", "plugin", "plugins", "marketplace"]);
  });
  async function ACf() {
    let e = Date.now();
    if (sXe && e - gRc < 60000) {
      return sXe;
    }
    let t = [];
    let n = new Set();
    try {
      for await (let r of DLn()) {
        if (r.display && r.display.startsWith("!")) {
          let o = r.display.slice(1).trim();
          if (o && !n.vZc(o)) {
            n.add(o);
            t.push(o);
          }
        }
        if (t.length >= 50) {
          break;
        }
      }
    } catch (r) {
      logForDebugging(`Failed to read shell history: ${r}`);
    }
    sXe = t;
    gRc = e;
    return t;
  }
  function yRc(e) {
    if (!sXe) {
      return;
    }
    let t = sXe.indexOf(e);
    if (t !== -1) {
      sXe.splice(t, 1);
    }
    sXe.unshift(e);
  }
  async function _Rc(e) {
    if (!e || e.length < 2) {
      return null;
    }
    if (!e.trim()) {
      return null;
    }
    let n = await ACf();
    for (let r of n) {
      if (r.startsWith(e) && r !== e) {
        return {
          fullCommand: r,
          suffix: r.slice(e.length)
        };
      }
    }
    return null;
  }
  var sXe = null;
  var gRc = 0;
  var gXo = __lazy(() => {
    gq();
    je();
  });
  function ERc(e) {
    return e.find(t => t.type === "connected" && t.name.includes("slack"));
  }
  async function PCf(e, t) {
    let n = ERc(e);
    if (!n || n.type !== "connected") {
      return [];
    }
    try {
      let o = (await n.client.callTool({
        name: "slack_search_channels",
        arguments: {
          query: t,
          limit: 20,
          channel_types: "public_channel,private_channel"
        }
      }, undefined, {
        timeout: 5000
      })).content;
      if (!Array.isArray(o)) {
        return [];
      }
      let s = o.filter(i => i.type === "text").map(i => i.text).join(`
`);
      return MCf(DCf(s));
    } catch (r) {
      logForDebugging(`Failed to fetch Slack channels: ${r}`);
      return [];
    }
  }
  function DCf(e) {
    let t = e.trim();
    if (!t.startsWith("{")) {
      return e;
    }
    try {
      let n = OCf().safeParse(qt(t));
      if (n.success) {
        return n.data.results;
      }
    } catch {}
    return e;
  }
  function MCf(e) {
    let t = [];
    let n = new Set();
    for (let r of e.split(`
`)) {
      let o = r.match(/^Name:\s*#?([a-z0-9][a-z0-9_-]{0,79})\s*$/);
      if (o && !n.vZc(o[1])) {
        n.add(o[1]);
        t.push(o[1]);
      }
    }
    return t;
  }
  function Mhr(e) {
    return ERc(e) !== undefined;
  }
  function vRc() {
    return bRc;
  }
  function wRc(e) {
    let t = [];
    let n = /(^|\s)#([a-z0-9][a-z0-9_-]{0,79})(?=\s|$)/g;
    let r;
    while ((r = n.exec(e)) !== null) {
      if (!Dhr.vZc(r[2])) {
        continue;
      }
      let o = r.index + r[1].length;
      t.push({
        start: o,
        end: o + 1 + r[2].length
      });
    }
    return t;
  }
  function NCf(e) {
    let t = Math.max(e.lastIndexOf("-"), e.lastIndexOf("_"));
    return t > 0 ? e.slice(0, t) : e;
  }
  function LCf(e, t) {
    let n;
    let r = 0;
    for (let [o, s] of ZRt) {
      if (e.startsWith(o) && o.length > r && s.some(i => i.startsWith(t))) {
        n = s;
        r = o.length;
      }
    }
    return n;
  }
  async function CRc(e, t) {
    if (!t) {
      return [];
    }
    let n = NCf(t);
    let r = t.toLowerCase();
    let o = ZRt.get(n) ?? LCf(n, r);
    if (!o) {
      if (Ohr === n && Urn) {
        o = await Urn;
      } else {
        Ohr = n;
        Urn = PCf(e, n);
        o = await Urn;
        ZRt.set(n, o);
        let s = Dhr.size;
        for (let i of o) {
          Dhr.add(i);
        }
        if (Dhr.size !== s) {
          bRc++;
          SRc.emit();
        }
        if (ZRt.size > 50) {
          ZRt.delete(ZRt.keys().next().value);
        }
        if (Ohr === n) {
          Ohr = null;
          Urn = null;
        }
      }
    }
    return o.filter(s => s.startsWith(r)).sort().slice(0, 10).map(s => ({
      id: `slack-channel-${s}`,
      displayText: `#${s}`
    }));
  }
  var ZRt;
  var Dhr;
  var bRc = 0;
  var SRc;
  var TRc;
  var Ohr = null;
  var Urn = null;
  var OCf;
  var yXo = __lazy(() => {
    qg();
    je();
    ph();
    ZRt = new Map();
    Dhr = new Set();
    SRc = Si();
    TRc = SRc.subscribe;
    OCf = we(() => Ke.object({
      results: Ke.string()
    }));
  });
  function RRc(e) {
    switch (e.type) {
      case "file":
        return {
          id: `file-${e.path}`,
          displayText: e.displayText,
          description: e.description
        };
      case "mcp_resource":
        return {
          id: `mcp-resource-${e.server}__${e.uri}`,
          displayText: e.displayText,
          description: e.description
        };
      case "mcp_resource_template":
        return {
          id: `mcp-template::${e.server}__${e.uriTemplate}`,
          displayText: e.displayText,
          description: e.description,
          metadata: {
            replacement: _Xo("@", e.displayText, true),
            partial: true
          }
        };
      case "agent":
        return {
          id: `agent-${e.agentType}`,
          displayText: e.displayText,
          description: e.description,
          color: e.color
        };
    }
  }
  function $rn(e) {
    return truncateToWidth(e, 60);
  }
  function UCf(e, t, n = false) {
    if (!t && !n) {
      return [];
    }
    try {
      let r = e.map(s => ({
        type: "agent",
        displayText: `${s.agentType} (agent)`,
        description: $rn(s.whenToUse),
        agentType: s.agentType,
        color: pze(s.agentType)
      }));
      if (!t) {
        return r;
      }
      let o = t.toLowerCase();
      return r.filter(s => s.agentType.toLowerCase().includes(o) || s.displayText.toLowerCase().includes(o));
    } catch (r) {
      Oe(r);
      return [];
    }
  }
  async function bXo(e, t, n, r, o = false, s = {}) {
    if (!t && !o) {
      return [];
    }
    let [i, a] = await Promise.all([generateFileSuggestions(e, t, o), Promise.resolve(UCf(r, t, o))]);
    let l = i.map(m => ({
      type: "file",
      displayText: m.displayText,
      description: m.description,
      path: m.displayText,
      filename: xRc.basename(m.displayText),
      score: m.metadata?.score
    }));
    let c = Object.values(n).flat().map(m => ({
      type: "mcp_resource",
      displayText: `${m.server}:${m.uri}`,
      description: $rn(m.description || m.name || m.uri),
      server: m.server,
      uri: m.uri,
      name: m.name || m.uri
    }));
    let u = Object.values(s).flat().map(m => ({
      type: "mcp_resource_template",
      displayText: `${m.server}:${UDo(m.uriTemplate)}`,
      description: $rn(m.description || m.name || m.uriTemplate),
      server: m.server,
      uriTemplate: m.uriTemplate,
      name: m.name || m.uriTemplate
    }));
    if (!t) {
      return [...l, ...c, ...u, ...a].slice(0, 15).map(RRc);
    }
    let d = [...c, ...u, ...a];
    let p = [];
    for (let m of l) {
      p.push({
        source: m,
        score: m.score ?? 0.5
      });
    }
    if (d.length > 0) {
      let f = new tee(d, {
        includeScore: true,
        threshold: 0.6,
        keys: [{
          name: "displayText",
          weight: 2
        }, {
          name: "name",
          weight: 3
        }, {
          name: "server",
          weight: 1
        }, {
          name: "description",
          weight: 1
        }, {
          name: "agentType",
          weight: 3
        }, {
          name: "uriTemplate",
          weight: 2
        }]
      }).search(t, {
        limit: 15
      });
      for (let h of f) {
        let g = h.item.type === "mcp_resource" ? 0.15 : 0;
        p.push({
          source: h.item,
          score: (h.score ?? 0.5) + g
        });
      }
    }
    p.sort((m, f) => m.score - f.score);
    return p.slice(0, 15).map(m => m.source).map(RRc);
  }
  async function Nhr(e, t, n, r) {
    let o = e.indexOf(":");
    if (o === -1) {
      return null;
    }
    let s = e.slice(0, o);
    let i = e.slice(o + 1);
    let a = t[s];
    if (!a || a.length === 0) {
      return null;
    }
    let l = W_l(i, a);
    if (!l) {
      if (!i) {
        return null;
      }
      let g = a.filter(y => y.uriTemplate.startsWith(i) && y.uriTemplate.length > i.length);
      if (g.length === 0) {
        return null;
      }
      return g.slice(0, 15).map(y => {
        let _ = UDo(y.uriTemplate);
        return {
          id: `mcp-template::${s}__${y.uriTemplate}`,
          displayText: `${s}:${_}`,
          description: $rn(y.description || y.name || y.uriTemplate),
          metadata: {
            replacement: _Xo(r, `${s}:${_}`, true),
            partial: true
          }
        };
      });
    }
    let c = Bl(s);
    let u = n.find(g => Bl(g.name) === c && g.type === "connected");
    if (!u) {
      return [];
    }
    let d = {};
    for (let [g, y] of Object.entries(l.resolvedArgs)) {
      try {
        d[g] = decodeURIComponent(y);
      } catch {
        d[g] = y;
      }
    }
    let p = (() => {
      try {
        return decodeURIComponent(l.argValue);
      } catch {
        return l.argValue;
      }
    })();
    let m = await H3a(u, l.template.uriTemplate, l.argName, p, d);
    if (m.length === 0) {
      return [];
    }
    let f = $rn(l.template.description || l.template.name || "");
    let h = q_l(l);
    return m.slice(0, 15).map(g => {
      let y = G_l(i, l, g);
      return {
        id: `mcp-template-value::${s}__${y}`,
        displayText: y.slice(l.valueStartIndex),
        description: f,
        metadata: {
          replacement: _Xo(r, `${s}:${y}`, h),
          partial: h
        }
      };
    });
  }
  function _Xo(e, t, n) {
    if (e === "@" && t.includes(" ")) {
      return n ? `@"${t}` : `@"${t}"`;
    }
    if (e === "/") {
      return `/${t.replace(/ /g, "%20")}`;
    }
    return `${e}${t}`;
  }
  var xRc;
  var kRc = __lazy(() => {
    Nlr();
    yvt();
    eA();
    ASt();
    $U();
    cs();
    Rn();
    xRc = require("path");
  });
  function GCf(e, t, n) {
    if (t === undefined) {
      return false;
    }
    let r = e.length - t.length;
    let o = n - r;
    return r > 0 && o >= 0 && e.slice(0, o) + e.slice(n) === t && /^[a-z0-9_+-]*:$/.test(e.slice(o, n));
  }
  function iXe(e) {
    return typeof e === "object" && e !== null && "type" in e && (e.type === "directory" || e.type === "file");
  }
  function Bie(e, t, n) {
    if (n.length === 0) {
      return -1;
    }
    if (t < 0) {
      return 0;
    }
    let r = e[t];
    if (!r) {
      return 0;
    }
    let o = n.findIndex(s => s.id === r.id);
    return o >= 0 ? o : 0;
  }
  function IRc(e) {
    let t = e.metadata;
    return t?.sessionId ? `/resume ${t.sessionId}` : `/resume ${e.displayText}`;
  }
  function EXo(e) {
    if (e.isQuoted) {
      return e.token.slice(2).replace(/"$/, "");
    } else if (e.token.startsWith("@")) {
      return e.token.substring(1);
    } else {
      return e.token;
    }
  }
  function vXo(e) {
    let {
      displayText: t,
      mode: n,
      hasAtPrefix: r,
      needsQuotes: o,
      isQuoted: s,
      isComplete: i
    } = e;
    let a = i ? " " : "";
    if (s || o) {
      return n === "bash" ? `"${t}"${a}` : `@"${t}"${a}`;
    } else if (r) {
      return n === "bash" ? `${t}${a}` : `@${t}${a}`;
    } else {
      return t;
    }
  }
  function wXo(e, t, n, r, o, s) {
    let l = t.slice(0, n).lastIndexOf(" ") + 1;
    let c;
    if (s === "variable") {
      c = "$" + e.displayText + " ";
    } else if (s === "command") {
      c = e.displayText + " ";
    } else {
      c = e.displayText;
    }
    let u = t.slice(0, l) + c + t.slice(n);
    r(u);
    o(l + c.length);
  }
  function ext(e, t, n, r, o, s) {
    let i = t.slice(0, n).match(r);
    if (!i || i.index === undefined) {
      return;
    }
    let a = i.index + (i[1]?.length ?? 0);
    let l = t.slice(0, a);
    let c = l + e.displayText + " " + t.slice(n);
    o(c);
    s(l.length + e.displayText.length + 1);
  }
  async function VCf(e, t, n) {
    if (va()) {
      return [];
    }
    try {
      if (Fhr) {
        Fhr.abort();
      }
      Fhr = new AbortController();
      return await iRc(e, t, Fhr.signal, n);
    } catch {
      logEvent("tengu_shell_completion_failed", {});
      return [];
    }
  }
  function PRc(e, t, n, r, o) {
    let s = o ? "/" : " ";
    let i = e.slice(0, n);
    let a = e.slice(n + r);
    let l = "@" + t + s;
    return {
      newInput: i + l + a,
      cursorPos: i.length + l.length
    };
  }
  function KCe(e, t, n = false) {
    if (!e) {
      return null;
    }
    let r = e.substring(0, t);
    if (n) {
      let c = /@"([^"]*)"?$/;
      let u = r.match(c);
      if (u && u.index !== undefined) {
        let p = e.substring(t).match(/^[^"]*"?/);
        let m = p ? p[0] : "";
        return {
          token: u[0] + m,
          startPos: u.index,
          isQuoted: true
        };
      }
    }
    if (n) {
      let c = r.lastIndexOf("@");
      if (c >= 0 && (c === 0 || /[\s\u3002\u3001\uFF1F\uFF01]/.test(r[c - 1]))) {
        let u = r.substring(c);
        let d = u.match($Cf);
        if (d && d[0].length === u.length) {
          let m = e.substring(t).match(ARc);
          let f = m ? m[0] : "";
          return {
            token: d[0] + f,
            startPos: c,
            isQuoted: false
          };
        }
      }
    }
    let o = n ? HCf : jCf;
    let s = r.match(o);
    if (!s || s.index === undefined) {
      return null;
    }
    let a = e.substring(t).match(ARc);
    let l = a ? a[0] : "";
    return {
      token: s[0] + l,
      startPos: s.index,
      isQuoted: false
    };
  }
  function zCf(e) {
    if (oXe(e)) {
      let t = e.indexOf(" ");
      if (t === -1) {
        return {
          commandName: e.slice(1),
          args: ""
        };
      }
      return {
        commandName: e.slice(1, t),
        args: e.slice(t + 1)
      };
    }
    return null;
  }
  function ORc(e, t) {
    return !e && t.includes(" ") && !t.endsWith(" ");
  }
  function DRc({
    commands: e,
    onInputChange: t,
    onSubmit: n,
    setCursorOffset: r,
    input: o,
    cursorOffset: s,
    mode: i,
    agents: a,
    setSuggestionsState: l,
    suggestionsState: {
      suggestions: c,
      selectedSuggestion: u,
      hoveredSuggestionId: d,
      commandArgumentHint: p,
      suggestionsEmptyMessage: m
    },
    suppressSuggestions: f,
    markAccepted: h,
    onModeChange: g,
    sessionEnvVars: y
  }) {
    let {
      addNotification: _
    } = Fi();
    let b = Zu("chat:thinkingToggle", "Chat", "alt+t");
    let [S, E] = ch.useState("none");
    let C = ch.useRef(d);
    C.current = d ?? null;
    let x = ch.useMemo(() => {
      let Ye = e.filter(It => !It.isHidden);
      if (Ye.length === 0) {
        return;
      }
      return Math.max(...Ye.map(It => getCommandName(It).length)) + 6;
    }, [e]);
    let [A, k] = ch.useState(undefined);
    let I = bt(Ye => Ye.mcp.resources);
    let O = bt(Ye => Ye.mcp.resourceTemplates);
    let M = Ec();
    let L = Lo();
    let P = ch.useCallback(() => {
      let Ye = M.getState();
      $3a(Ye.mcp.clients, Ye.mcp.resourceTemplates).then(ht => {
        if (ht.length === 0) {
          return;
        }
        let It = false;
        if (L(Rt => {
          let wt = Rt.mcp.resourceTemplates;
          for (let {
            client: vt,
            templates: yt
          } of ht) {
            if (vt.name in wt || !Rt.mcp.clients.some(gt => gt.type === "connected" && gt.client === vt.client)) {
              continue;
            }
            wt = {
              ...wt,
              [vt.name]: yt
            };
          }
          if (wt === Rt.mcp.resourceTemplates) {
            return Rt;
          }
          It = true;
          return {
            ...Rt,
            mcp: {
              ...Rt.mcp,
              resourceTemplates: wt
            }
          };
        }), It && J.current === "at") {
          K.current = null;
        }
      });
    }, [M, L]);
    let F = bt(Ye => Ye.promptSuggestion);
    let H = bt(Ye => !!Ye.viewingAgentTaskId);
    let U = tE();
    let [N, W] = ch.useState(undefined);
    let j = ch.useMemo(() => {
      if (i !== "prompt" || f) {
        return;
      }
      let Ye = Phr(o, s);
      if (!Ye) {
        return;
      }
      let ht = pXo(Ye.partialCommand, e);
      if (!ht) {
        return;
      }
      return {
        text: ht.suffix,
        fullCommand: ht.fullCommand,
        insertPosition: Ye.startPos + 1 + Ye.partialCommand.length
      };
    }, [o, s, i, e, f]);
    let z = f ? undefined : i === "prompt" ? j : N;
    let V = ch.useRef(s);
    V.current = s;
    let K = ch.useRef(null);
    let J = ch.useRef("file");
    let Q = ch.useRef("");
    let Z = ch.useRef("");
    let ne = ch.useRef("at-path");
    let oe = ch.useRef("");
    let ee = ch.useRef("");
    let re = ch.useRef(c);
    re.current = c;
    let se = ch.useRef(null);
    let ae = ch.useCallback(() => {
      l(() => ({
        commandArgumentHint: undefined,
        suggestions: [],
        selectedSuggestion: -1
      }));
      E("none");
      k(undefined);
      W(undefined);
    }, [l]);
    let de = ch.useCallback(async (Ye, ht = false) => {
      K.current = Ye;
      J.current = ht ? "at" : "file";
      let It = va();
      let Rt = null;
      let wt = ht && !It ? M.getState().mcp.resourceTemplates : O;
      if (ht && !It) {
        if (P(), Rt = await Nhr(Ye, wt, M.getState().mcp.clients, "@"), K.current !== Ye) {
          return;
        }
      }
      if (!Rt) {
        Rt = await bXo(globalFileIndexCache, Ye, It ? {} : I, It ? [] : a, ht, It ? {} : wt);
      }
      if (K.current !== Ye) {
        return;
      }
      if (Rt.length === 0) {
        l(() => ({
          commandArgumentHint: undefined,
          suggestions: [],
          selectedSuggestion: -1
        }));
        E("none");
        k(undefined);
        return;
      }
      l(vt => ({
        commandArgumentHint: undefined,
        suggestions: Rt,
        selectedSuggestion: Bie(vt.suggestions, vt.selectedSuggestion, Rt)
      }));
      E(Rt.length > 0 ? "file" : "none");
      k(undefined);
    }, [I, O, M, P, l, E, k, a]);
    ch.useEffect(() => {
      let Ye = setImmediate(() => {
        if (!va()) {
          startBackgroundCacheRefresh(globalFileIndexCache);
        }
      });
      let ht = globalFileIndexCache.indexBuildComplete.subscribe(() => {
        let It = K.current;
        if (It === null) {
          return;
        }
        let Rt = J.current;
        if (Rt === "slash-template") {
          return;
        }
        K.current = null;
        de(It, Rt === "at");
      });
      return () => {
        clearImmediate(Ye);
        ht();
      };
    }, [de]);
    let be = useDebouncedCallback(de, 50);
    let fe = ch.useCallback(async Ye => {
      ee.current = Ye;
      let ht = await CRc(M.getState().mcp.clients, Ye);
      if (ee.current !== Ye) {
        return;
      }
      l(It => ({
        commandArgumentHint: undefined,
        suggestions: ht,
        selectedSuggestion: Bie(It.suggestions, It.selectedSuggestion, ht)
      }));
      E(ht.length > 0 ? "slack-channel" : "none");
      k(undefined);
    }, [l]);
    let me = useDebouncedCallback(fe, 150);
    let Te = ch.useCallback(async (Ye, ht, It) => {
      K.current = Ye;
      J.current = "slash-template";
      let Rt = await Nhr(Ye, {
        [ht]: It
      }, M.getState().mcp.clients, "/");
      if (K.current !== Ye) {
        return;
      }
      let wt = Rt ?? [];
      l(() => ({
        commandArgumentHint: undefined,
        suggestions: wt,
        selectedSuggestion: wt.length > 0 ? 0 : -1
      }));
      E(wt.length > 0 ? "command" : "none");
      k(undefined);
    }, [l]);
    let ue = useDebouncedCallback(Te, 150);
    let ce = ch.useCallback(async (Ye, ht, It) => {
      let Rt = ht ?? V.current;
      if (f) {
        be.cancel();
        ue.cancel();
        ae();
        return;
      }
      if (i === "prompt") {
        let gt = Phr(Ye, Rt);
        if (gt) {
          if (pXo(gt.partialCommand, e)) {
            l(() => ({
              commandArgumentHint: undefined,
              suggestions: [],
              selectedSuggestion: -1
            }));
            E("none");
            k(undefined);
            return;
          }
        }
      }
      if (i === "bash" && Ye.trim()) {
        let gt = Ye.slice(0, Rt).lastIndexOf(" ") + 1;
        let Ft = Ye.slice(gt, Rt);
        if (Ft && (Coo(Ft) || Ft.includes("/"))) {
          Z.current = Ft;
          let rn = await Roo(Ft, {
            maxResults: 10
          });
          if (Z.current !== Ft) {
            return;
          }
          if (rn.length > 0) {
            W(undefined);
            l(Sn => ({
              suggestions: rn,
              selectedSuggestion: Bie(Sn.suggestions, Sn.selectedSuggestion, rn),
              commandArgumentHint: undefined
            }));
            ne.current = "bash-path";
            E("directory");
            return;
          }
        }
        if (S === "directory" && ne.current === "bash-path") {
          ae();
        }
        oe.current = Ye;
        let on = await _Rc(Ye);
        if (oe.current !== Ye) {
          return;
        }
        if (on) {
          W({
            text: on.suffix,
            fullCommand: on.fullCommand,
            insertPosition: Ye.length
          });
          l(() => ({
            commandArgumentHint: undefined,
            suggestions: [],
            selectedSuggestion: -1
          }));
          E("none");
          k(undefined);
          return;
        } else {
          W(undefined);
        }
      }
      let wt = i !== "bash" ? Ye.substring(0, Rt).match(Lhr) : null;
      if (wt) {
        let gt = (wt[2] ?? "").toLowerCase();
        let Ft = M.getState();
        let on = [];
        let rn = new Set();
        if (isAgentSwarmsEnabled() && Ft.teamContext) {
          for (let Sn of Object.values(Ft.teamContext.teammates ?? {})) {
            if (Sn.name === "team-lead") {
              continue;
            }
            if (!Sn.name.toLowerCase().startsWith(gt)) {
              continue;
            }
            rn.add(Sn.name);
            on.push({
              id: `dm-${Sn.name}`,
              displayText: `@${Sn.name}`,
              description: "send message"
            });
          }
        }
        for (let [Sn, jn] of Ft.agentNameRegistry) {
          if (rn.vZc(Sn)) {
            continue;
          }
          if (!Sn.toLowerCase().startsWith(gt)) {
            continue;
          }
          let Xr = Ft.tasks[jn]?.status;
          on.push({
            id: `dm-${Sn}`,
            displayText: `@${Sn}`,
            description: Xr ? `send message \xB7 ${Xr}` : "send message"
          });
        }
        if (on.length > 0) {
          be.cancel();
          ue.cancel();
          l(Sn => ({
            commandArgumentHint: undefined,
            suggestions: on,
            selectedSuggestion: Bie(Sn.suggestions, Sn.selectedSuggestion, on)
          }));
          E("agent");
          k(undefined);
          return;
        }
      }
      if (i === "prompt") {
        let gt = Ye.substring(0, Rt).match(SXo);
        if (gt && Mhr(M.getState().mcp.clients)) {
          me(gt[2]);
          return;
        } else if (S === "slack-channel") {
          me.cancel();
          ae();
        }
      }
      if (null && i === "prompt") {
        let gt = Ye.substring(0, Rt);
        let Ft = GCf(Ye, It, Rt) ? gt.match(WCf) : null;
        if (Ft) {
          let rn = (null).getEmoji(Ft[2]);
          if (rn) {
            let Sn = (Ft.index ?? 0) + (Ft[1]?.length ?? 0);
            let jn = Ye.slice(0, Sn) + rn + Ye.slice(Rt);
            t(jn);
            r(Sn + rn.length);
            ae();
            return;
          }
        }
        let on = gt.match(TXo);
        if (on) {
          let rn = (null).getEmojiSuggestions(on[2]);
          if (rn.length > 0) {
            l(Sn => ({
              commandArgumentHint: undefined,
              suggestions: rn,
              selectedSuggestion: Bie(Sn.suggestions, Sn.selectedSuggestion, rn)
            }));
            E("emoji");
            k(undefined);
            return;
          }
        }
        if (S === "emoji") {
          ae();
        }
      }
      let vt = Ye.substring(0, Rt).match(qCf);
      let yt = Rt === Ye.length && Rt > 0 && Ye.length > 0 && Ye[Rt - 1] === " ";
      if (i === "prompt" && oXe(Ye) && Rt > 0) {
        let gt = zCf(Ye);
        if (gt && gt.commandName === "add-dir" && gt.args) {
          let {
            args: Ft
          } = gt;
          if (Ft.match(/\s+$/)) {
            be.cancel();
            ue.cancel();
            ae();
            return;
          }
          let on = await YLn(Ft);
          if (on.length > 0) {
            l(rn => ({
              suggestions: on,
              selectedSuggestion: Bie(rn.suggestions, rn.selectedSuggestion, on),
              commandArgumentHint: undefined
            }));
            ne.current = "command-arg";
            E("directory");
            return;
          }
          be.cancel();
          ue.cancel();
          ae();
          return;
        }
        if (gt && gt.commandName === "resume" && gt.args !== undefined && gt.args.trim().length > 0 && Ye.includes(" ")) {
          let {
            args: Ft
          } = gt;
          let rn = (await searchSessionsByCustomTitle(Ft, {
            limit: 10
          })).map(Sn => {
            let jn = getSessionIdFromLog(Sn);
            return {
              id: `resume-title-${jn}`,
              displayText: Sn.customTitle ?? Sn.aiTitle,
              description: formatLogMetadata(Sn),
              metadata: {
                sessionId: jn
              }
            };
          });
          if (rn.length > 0) {
            l(Sn => ({
              suggestions: rn,
              selectedSuggestion: Bie(Sn.suggestions, Sn.selectedSuggestion, rn),
              commandArgumentHint: undefined
            }));
            E("custom-title");
            return;
          }
          ae();
          return;
        }
        if (gt && Ye.includes(" ")) {
          let Ft = findCommand(gt.commandName, e);
          if (Ft?.getArgumentCompletions) {
            let on = await cRc(Ye, Ft.getArgumentCompletions);
            if (on.length > 0) {
              l(rn => ({
                suggestions: on,
                selectedSuggestion: Bie(rn.suggestions, rn.selectedSuggestion, on),
                commandArgumentHint: undefined
              }));
              E("command");
              k(undefined);
              return;
            }
            be.cancel();
            ue.cancel();
            ae();
            return;
          }
        }
      }
      if (i === "prompt" && oXe(Ye) && Rt > 0 && !ORc(yt, Ye)) {
        let gt = undefined;
        if (Ye.length > 1) {
          let rn = Ye.indexOf(" ");
          let Sn = rn === -1 ? Ye.slice(1) : Ye.slice(1, rn);
          let jn = rn !== -1 && Ye.slice(rn + 1).trim().length > 0;
          let Xr = rn !== -1 && Ye.length === rn + 1;
          if (rn !== -1) {
            let co = findCommand(Sn, e);
            if (co || jn) {
              if (co?.argumentHint && Xr) {
                gt = co.argumentHint;
              } else if (co?.type === "prompt" && co.argNames?.length && Ye.endsWith(" ")) {
                let Yt = Ye.slice(rn + 1);
                let Ee = LEo(Yt);
                gt = FWa(co.argNames, Ee);
              }
              l(() => ({
                commandArgumentHint: gt,
                suggestions: [],
                selectedSuggestion: -1
              }));
              E("none");
              k(undefined);
              return;
            }
          }
        }
        if (nA()) {
          let rn = Ye.slice(1);
          let Sn = rn.indexOf(":");
          if (Sn > 0 && rn.slice(Sn + 1).includes("://")) {
            let jn = rn.slice(0, Sn);
            let Xr = j_l(e, jn);
            if (Xr.length > 0) {
              if (K.current === rn) {
                return;
              }
              be.cancel();
              ue(rn, jn, Xr);
              return;
            }
          }
          ue.cancel();
        }
        let Ft = fXo(Ye, e);
        let on = ii(Ye.slice(1), " ");
        if (l(rn => ({
          commandArgumentHint: gt,
          suggestions: Ft,
          selectedSuggestion: Ye === It ? Bie(rn.suggestions, rn.selectedSuggestion, Ft) : Ft.length > 0 ? 0 : -1,
          suggestionsEmptyMessage: Ft.length === 0 && Ye.length > 1 && mXo(on) ? `No commands match "${Ye}"` : undefined
        })), E("command"), Ft.length > 0) {
          k(x);
        }
        return;
      }
      if (S === "command") {
        be.cancel();
        ue.cancel();
        ae();
      } else if (oXe(Ye) && ORc(yt, Ye)) {
        l(gt => gt.commandArgumentHint ? {
          ...gt,
          commandArgumentHint: undefined
        } : gt);
      }
      if (S === "custom-title") {
        ae();
      }
      if (S === "agent" && re.current.some(gt => gt.id?.startsWith("dm-"))) {
        if (!Ye.substring(0, Rt).match(Lhr)) {
          ae();
        }
      }
      if (vt && i !== "bash") {
        let gt = KCe(Ye, Rt, true);
        if (gt && gt.token.startsWith("@")) {
          let Ft = EXo(gt);
          if (Coo(Ft)) {
            Z.current = Ft;
            let on = await Roo(Ft, {
              maxResults: 10
            });
            if (Z.current !== Ft) {
              return;
            }
            if (on.length > 0) {
              l(rn => ({
                suggestions: on,
                selectedSuggestion: Bie(rn.suggestions, rn.selectedSuggestion, on),
                commandArgumentHint: undefined
              }));
              ne.current = "at-path";
              E("directory");
              return;
            }
          }
          if (K.current === Ft) {
            return;
          }
          be(Ft, true);
          return;
        }
      }
      if (S === "file") {
        let gt = KCe(Ye, Rt, true);
        if (gt) {
          let Ft = EXo(gt);
          if (K.current === Ft) {
            return;
          }
          be(Ft, false);
        } else {
          be.cancel();
          ue.cancel();
          ae();
        }
      }
      if (S === "shell") {
        let gt = re.current[0]?.metadata?.inputSnapshot;
        if (i !== "bash" || Ye !== gt) {
          be.cancel();
          ue.cancel();
          ae();
        }
      }
      if (S === "directory" && ne.current === "bash-path" && i !== "bash") {
        be.cancel();
        ue.cancel();
        ae();
      }
    }, [S, e, l, ae, de, be, me, ue, i, f, t, r, x]);
    ch.useEffect(() => {
      if (se.current === o) {
        return;
      }
      let Ye = Q.current;
      if (Ye !== o) {
        Q.current = o;
        K.current = null;
      }
      se.current = null;
      ce(o, undefined, Ye);
    }, [o, ce]);
    let le = ch.useCallback(async () => {
      if (z) {
        if (i === "bash") {
          t(z.fullCommand);
          r(z.fullCommand.length);
          W(undefined);
          return;
        }
        let Ye = Phr(o, s);
        if (Ye) {
          let ht = o.slice(0, Ye.startPos);
          let It = o.slice(Ye.startPos + Ye.token.length);
          let Rt = ht + "/" + z.fullCommand + " " + It;
          let wt = Ye.startPos + 1 + z.fullCommand.length + 1;
          t(Rt);
          r(wt);
          return;
        }
      }
      if (c.length > 0) {
        be.cancel();
        me.cancel();
        ue.cancel();
        let Ye = C.current ? c.findIndex(Rt => Rt.id === C.current) : -1;
        let ht = Ye >= 0 ? Ye : u === -1 ? 0 : u;
        let It = c[ht];
        if (S === "command" && ht < c.length) {
          if (It) {
            let Rt = hXo(It, false, e, t, r, n);
            if (Rt?.reSuggest) {
              ce(Rt.newInput, Rt.newInput.length);
            } else {
              ae();
            }
          }
        } else if (S === "custom-title" && c.length > 0) {
          if (It) {
            let Rt = IRc(It);
            t(Rt);
            r(Rt.length);
            ae();
          }
        } else if (S === "directory" && c.length > 0) {
          let Rt = c[ht];
          if (Rt) {
            let wt;
            if (ne.current === "bash-path") {
              let vt = o.slice(0, s).lastIndexOf(" ") + 1;
              let yt = iXe(Rt.metadata) && Rt.metadata.type === "directory";
              let gt = Rt.displayText + (yt ? "" : " ");
              wt = o.slice(0, vt) + gt + o.slice(s);
              let Ft = vt + gt.length;
              if (t(wt), r(Ft), yt) {
                ce(wt, Ft);
              } else {
                ae();
              }
            } else if (ne.current === "command-arg") {
              let vt = o.indexOf(" ");
              let yt = o.slice(0, vt + 1);
              let gt = iXe(Rt.metadata) && Rt.metadata.type === "directory" ? "/" : " ";
              if (wt = yt + Rt.id + gt, t(wt), r(wt.length), iXe(Rt.metadata) && Rt.metadata.type === "directory") {
                l(Ft => ({
                  ...Ft,
                  commandArgumentHint: undefined
                }));
                ce(wt, wt.length);
              } else {
                ae();
              }
            } else {
              let yt = KCe(o, s, true) ?? KCe(o, s, false);
              if (yt) {
                let gt = iXe(Rt.metadata) && Rt.metadata.type === "directory";
                let Ft = PRc(o, Rt.id, yt.startPos, yt.token.length, gt);
                if (wt = Ft.newInput, t(wt), r(Ft.cursorPos), gt) {
                  l(on => ({
                    ...on,
                    commandArgumentHint: undefined
                  }));
                  ce(wt, Ft.cursorPos);
                } else {
                  ae();
                }
              } else {
                ae();
              }
            }
          }
        } else if (S === "shell" && c.length > 0) {
          let Rt = c[ht];
          if (Rt) {
            let wt = Rt.metadata;
            wXo(Rt, o, s, t, r, wt?.completionType);
            ae();
          }
        } else if (S === "agent" && c.length > 0 && c[ht]?.id?.startsWith("dm-")) {
          let Rt = c[ht];
          if (Rt) {
            ext(Rt, o, s, Lhr, t, r);
            ae();
          }
        } else if (S === "slack-channel" && c.length > 0) {
          let Rt = c[ht];
          if (Rt) {
            ext(Rt, o, s, SXo, t, r);
            ae();
          }
        } else if (null && S === "emoji" && c.length > 0) {
          let Rt = c[ht];
          if (Rt) {
            ext(Rt, o, s, TXo, t, r);
            ae();
          }
        } else if (S === "file" && c.length > 0) {
          let Rt = KCe(o, s, true);
          if (!Rt) {
            ae();
            return;
          }
          let vt = c.some(Ft => kSt(Ft.metadata) !== null) ? "" : findLongestCommonPrefix(c);
          let yt = Rt.token.startsWith("@");
          let gt;
          if (Rt.isQuoted) {
            gt = Rt.token.slice(2).replace(/"$/, "").length;
          } else if (yt) {
            gt = Rt.token.length - 1;
          } else {
            gt = Rt.token.length;
          }
          if (vt.length > gt) {
            let Ft = vXo({
              displayText: vt,
              mode: i,
              hasAtPrefix: yt,
              needsQuotes: false,
              isQuoted: Rt.isQuoted,
              isComplete: false
            });
            applyFileSuggestion(Ft, o, Rt.token, Rt.startPos, t, r);
            ce(o.replace(Rt.token, Ft), s);
          } else if (ht < c.length) {
            let Ft = c[ht];
            if (Ft) {
              let on = kSt(Ft.metadata);
              let rn = on ? `${on.replacement}${on.partial ? "" : " "}` : vXo({
                displayText: Ft.displayText,
                mode: i,
                hasAtPrefix: yt,
                needsQuotes: Ft.displayText.includes(" "),
                isQuoted: Rt.isQuoted,
                isComplete: true
              });
              let Sn = applyFileSuggestion(rn, o, Rt.token, Rt.startPos, t, r);
              if (on?.partial) {
                ce(Sn, Rt.startPos + rn.length);
              } else {
                ae();
              }
            }
          }
        }
      } else if (o.trim() !== "") {
        let Ye;
        let ht;
        if (i === "bash") {
          Ye = "shell";
          let It = await VCf(o, s, y);
          if (It.length === 1) {
            let Rt = It[0];
            if (Rt) {
              let wt = Rt.metadata;
              wXo(Rt, o, s, t, r, wt?.completionType);
            }
            ht = [];
          } else {
            ht = It;
          }
        } else {
          Ye = "file";
          let It = KCe(o, s, true);
          if (It) {
            let Rt = It.token.startsWith("@");
            let wt = EXo(It);
            let vt = va();
            K.current = wt;
            J.current = Rt ? "at" : "file";
            let yt = Rt && !vt ? M.getState().mcp.resourceTemplates : O;
            let gt = null;
            if (Rt && !vt) {
              if (P(), gt = await Nhr(wt, yt, M.getState().mcp.clients, "@"), K.current !== wt) {
                return;
              }
            }
            if (ht = gt ?? (await bXo(globalFileIndexCache, wt, vt ? {} : I, vt ? [] : a, Rt, vt ? {} : yt)), K.current !== wt) {
              return;
            }
          } else {
            ht = [];
          }
        }
        if (ht.length > 0) {
          l(It => ({
            commandArgumentHint: undefined,
            suggestions: ht,
            selectedSuggestion: Bie(It.suggestions, It.selectedSuggestion, ht)
          }));
          E(Ye);
          k(undefined);
        }
      }
    }, [c, u, o, S, e, i, t, r, n, ae, s, ce, I, O, M, P, l, a, be, me, ue, z, y]);
    let pe = ch.useCallback(Ye => {
      let ht = C.current ? c.findIndex(wt => wt.id === C.current) : -1;
      let It = Ye ?? (ht >= 0 ? ht : u);
      if (It < 0 || c.length === 0) {
        return;
      }
      let Rt = c[It];
      if (S === "command" && It < c.length) {
        if (Rt) {
          if (Ye === undefined && Rt.id.startsWith("command-arg-") && /^\/\S+\s+$/.test(o)) {
            be.cancel();
            ue.cancel();
            ae();
            n(o, true);
            return;
          }
          let wt = hXo(Rt, Ye === undefined, e, t, r, n);
          if (be.cancel(), ue.cancel(), wt?.reSuggest) {
            ce(wt.newInput, wt.newInput.length);
          } else {
            ae();
          }
        }
      } else if (S === "custom-title" && It < c.length) {
        if (Rt) {
          let wt = IRc(Rt);
          t(wt);
          r(wt.length);
          n(wt, true);
          be.cancel();
          ue.cancel();
          ae();
        }
      } else if (S === "shell" && It < c.length) {
        if (Rt) {
          let wt = Rt.metadata;
          wXo(Rt, o, s, t, r, wt?.completionType);
          be.cancel();
          ue.cancel();
          ae();
        }
      } else if (S === "agent" && It < c.length && Rt?.id?.startsWith("dm-")) {
        ext(Rt, o, s, Lhr, t, r);
        be.cancel();
        ue.cancel();
        ae();
      } else if (S === "slack-channel" && It < c.length) {
        if (Rt) {
          ext(Rt, o, s, SXo, t, r);
          me.cancel();
          ae();
        }
      } else if (null && S === "emoji" && It < c.length) {
        if (Rt) {
          ext(Rt, o, s, TXo, t, r);
          ae();
        }
      } else if (S === "file" && It < c.length) {
        let wt = KCe(o, s, true);
        if (wt) {
          if (Rt) {
            let vt = kSt(Rt.metadata);
            let yt = wt.token.startsWith("@");
            let gt = vt ? `${vt.replacement}${vt.partial ? "" : " "}` : vXo({
              displayText: Rt.displayText,
              mode: i,
              hasAtPrefix: yt,
              needsQuotes: Rt.displayText.includes(" "),
              isQuoted: wt.isQuoted,
              isComplete: true
            });
            let Ft = applyFileSuggestion(gt, o, wt.token, wt.startPos, t, r);
            if (be.cancel(), ue.cancel(), vt?.partial) {
              ce(Ft, wt.startPos + gt.length);
            } else {
              ae();
            }
          }
        }
      } else if (S === "directory" && It < c.length) {
        if (Rt) {
          if (ne.current === "bash-path") {
            if (be.cancel(), ue.cancel(), Ye === undefined) {
              ae();
              n(o, false);
              return;
            }
            let yt = o.slice(0, s).lastIndexOf(" ") + 1;
            let gt = iXe(Rt.metadata) && Rt.metadata.type === "directory";
            let Ft = Rt.displayText + (gt ? "" : " ");
            let on = o.slice(0, yt) + Ft + o.slice(s);
            t(on);
            r(yt + Ft.length);
            ae();
            return;
          }
          if (ne.current === "command-arg") {
            if (be.cancel(), ue.cancel(), Ye !== undefined) {
              let yt = o.indexOf(" ");
              let gt = o.slice(0, yt + 1);
              let Ft = iXe(Rt.metadata) && Rt.metadata.type === "directory";
              let on = gt + Rt.id + (Ft ? "/" : " ");
              if (t(on), r(on.length), Ft) {
                ce(on, on.length);
              } else {
                ae();
              }
              return;
            }
            ae();
            n(o, true);
            return;
          }
          let vt = KCe(o, s, true) ?? KCe(o, s, false);
          if (vt) {
            let yt = iXe(Rt.metadata) && Rt.metadata.type === "directory";
            let gt = PRc(o, Rt.id, vt.startPos, vt.token.length, yt);
            t(gt.newInput);
            r(gt.cursorPos);
          }
          be.cancel();
          ue.cancel();
          ae();
        }
      }
    }, [c, u, S, e, o, s, i, t, r, n, ae, be, me, ue, ce]);
    let ve = ch.useCallback(() => {
      le();
    }, [le]);
    let _e = ch.useCallback(() => {
      be.cancel();
      me.cancel();
      ue.cancel();
      ae();
      se.current = o;
    }, [be, me, ue, ae, o]);
    let xe = ch.useCallback(() => {
      l(Ye => ({
        ...Ye,
        hoveredSuggestionId: null,
        selectedSuggestion: Ye.selectedSuggestion <= 0 ? c.length - 1 : Ye.selectedSuggestion - 1
      }));
    }, [c.length, l]);
    let ke = ch.useCallback(() => {
      l(Ye => ({
        ...Ye,
        hoveredSuggestionId: null,
        selectedSuggestion: Ye.selectedSuggestion >= c.length - 1 ? 0 : Ye.selectedSuggestion + 1
      }));
    }, [c.length, l]);
    let Ie = ch.useCallback(Ye => {
      l(ht => ht.hoveredSuggestionId === Ye ? ht : {
        ...ht,
        hoveredSuggestionId: Ye
      });
    }, [l]);
    let Ue = ch.useRef(pe);
    Ue.current = pe;
    let Ge = ch.useCallback(Ye => Ue.current(Ye), []);
    let Be = ch.useMemo(() => ({
      "autocomplete:accept": ve,
      "autocomplete:dismiss": _e,
      "autocomplete:previous": xe,
      "autocomplete:next": ke
    }), [ve, _e, xe, ke]);
    let We = c.length > 0 || !!z;
    let Ze = TSe();
    Jg("autocomplete", We);
    KLn("Autocomplete", We);
    jo(Be, {
      context: "Autocomplete",
      isActive: We && !Ze
    });
    function Tt(Ye) {
      let ht = a0(Ye);
      if (ht !== "prompt") {
        g(ht);
        let It = J2(Ye);
        t(It);
        r(It.length);
      } else {
        t(Ye);
        r(Ye.length);
      }
    }
    return {
      suggestions: c,
      selectedSuggestion: u,
      suggestionType: S,
      maxColumnWidth: A,
      commandArgumentHint: p,
      suggestionsEmptyMessage: m,
      inlineGhostText: z,
      handleKeyDown: Ye => {
        if (Ye.name === "right" && !H) {
          let {
            text: It,
            shownAt: Rt
          } = F;
          if (It && Rt > 0 && o === "") {
            h();
            Tt(It);
            Ye.preventDefault();
            Ye.stopImmediatePropagation();
            return;
          }
        }
        if (Ye.name === "tab" && !Ye.shift) {
          if (c.length > 0 || z) {
            return;
          }
          let {
            text: It,
            shownAt: Rt
          } = F;
          if (It && Rt > 0 && o === "" && !H) {
            Ye.preventDefault();
            h();
            Tt(It);
            return;
          }
          if (o.trim() === "") {
            Ye.preventDefault();
            _({
              key: "thinking-toggle-hint",
              kind: "hint",
              jsx: MRc.jsxs(Text, {
                dimColor: true,
                children: ["Use ", b, " to toggle thinking"]
              }),
              priority: "immediate",
              timeoutMs: 3000
            });
          }
          return;
        }
        if (c.length === 0) {
          return;
        }
        let ht = U?.pendingChord != null;
        if (Ye.ctrl && Ye.key === "n" && !ht) {
          Ye.preventDefault();
          ke();
          return;
        }
        if (Ye.ctrl && Ye.key === "p" && !ht) {
          Ye.preventDefault();
          xe();
          return;
        }
        if (Ye.name === "return" && !Ye.shift && !Ye.meta) {
          Ye.preventDefault();
          pe();
        }
      },
      selectSuggestion: Ge,
      setHoveredSuggestion: Ie,
      hoveredSuggestionId: d ?? null
    };
  }
  var ch;
  var MRc;
  var $Cf;
  var ARc;
  var HCf;
  var jCf;
  var qCf;
  var SXo;
  var TXo;
  var WCf;
  var Lhr;
  var Fhr = null;
  var NRc = __lazy(() => {
    Nd();
    et();
    Ot();
    Bm();
    px();
    et();
    yq();
    Bs();
    c0();
    ru();
    eA();
    Noe();
    ASt();
    ho();
    mE();
    J5t();
    aRc();
    cs();
    fa();
    Zn();
    hRc();
    xoo();
    gXo();
    yXo();
    eL();
    yvt();
    kRc();
    ch = __toESM(ot(), 1);
    MRc = __toESM(ie(), 1);
    $Cf = /^@[\p{L}\p{N}\p{M}_\-./\\()[\]~:]*/u;
    ARc = /^[\p{L}\p{N}\p{M}_\-./\\()[\]~:]+/u;
    HCf = /(@[\p{L}\p{N}\p{M}_\-./\\()[\]~:]*|[\p{L}\p{N}\p{M}_\-./\\()[\]~:]+)$/u;
    jCf = /[\p{L}\p{N}\p{M}_\-./\\()[\]~:]+$/u;
    qCf = /(^|[\s\u3002\u3001\uFF1F\uFF01])@([\p{L}\p{N}\p{M}_\-./\\()[\]~:]*|"[^"]*"?)$/u;
    SXo = /(^|\s)#([a-z0-9][a-z0-9_-]*)$/;
    TXo = /(^|\s):([a-z0-9_+-]{2,})$/;
    WCf = /(^|\s):([a-z0-9_+-]+):$/;
    Lhr = /(^|[\s\u3002\u3001\uFF1F\uFF01])@([\w-]*)$/;
  });
  function txt(e, t, n) {
    if (e.type === "in_process_teammate") {
      if (e.status === "running") {
        Uze(e.id, t, n);
        t.update(e.id, s => s.status === "killed" && s.evictAfter === undefined ? {
          ...s,
          evictAfter: Date.now() + 3000
        } : s);
        return "killed";
      }
      t.remove(e.id);
      return "dismissed";
    }
    if (e.status !== "running" && !gT(e)) {
      kZl(e.id, n);
      return "dismissed";
    }
    let r = t.get(e.id);
    if (za(r) && (r.status === "running" || gT(r))) {
      rfe(e.id, t);
    }
    Ape(e.id, t, "user");
    let o = t.all();
    for (let s of Object.values(o)) {
      if (za(s) && s.id !== e.id && (s.status === "running" || gT(s)) && KCf(s, e.agentId, o)) {
        _gt(s.id, t);
        rfe(s.id, t);
        Ape(s.id, t, "user");
      }
    }
    return "killed";
  }
  function KCf(e, t, n) {
    let r = new Set();
    let o = e.parentAgentId;
    while (o && !r.vZc(o)) {
      if (o === t) {
        return true;
      }
      r.add(o);
      let s = n[o];
      o = za(s) ? s.parentAgentId : undefined;
    }
    return false;
  }
  function LRc(e, t, n, r) {
    if (t === "running") {
      killWorkflowTask(e, n);
      return "killed";
    }
    r(o => {
      if (o.tasks[e]?.type !== "local_workflow") {
        return o;
      }
      let s = {
        ...o.tasks
      };
      delete s[e];
      return {
        ...o,
        tasks: s
      };
    });
    return "dismissed";
  }
  var Uhr = __lazy(() => {
    ry();
    Dpe();
    e7e();
    aLe();
    U$();
    GUe();
  });
  function jrn(e) {
    let t = [];
    for (let n of Object.values(e)) {
      if (n.type !== "local_workflow") {
        continue;
      }
      if (n.status === "running" || Mw(n.status) && n.evictAfter !== undefined) {
        t.push(n);
      }
    }
    t.sort((n, r) => n.startTime - r.startTime);
    return t;
  }
  var CXo = __lazy(() => {
    Cx();
  });
  function FRc(e) {
    let t = e.match(/^@([\w-]+)\s+(.+)$/s);
    if (!t) {
      return null;
    }
    let [, n, r] = t;
    if (!n || !r) {
      return null;
    }
    let o = r.trim();
    if (!o) {
      return null;
    }
    return {
      recipientName: n,
      message: o
    };
  }
  async function URc(e, t, n, r) {
    if (!n || !r) {
      return {
        success: false,
        error: "no_team_context"
      };
    }
    if (!Object.values(n.teammates ?? {}).find(s => s.name === e)) {
      return {
        success: false,
        error: "unknown_recipient",
        recipientName: e
      };
    }
    await r(e, {
      from: "user",
      text: t,
      timestamp: new Date().toISOString()
    }, n.teamName);
    return {
      success: true,
      recipientName: e
    };
  }
  function Bhr(e) {
    {
      let t = isAutoModeGateEnabled();
      let n = RXo();
      let r = !!e.isAutoModeAvailable && t && !n;
      if (!r) {
        logForDebugging(`[auto-mode] canCycleToAuto=false: ctx.isAutoModeAvailable=${e.isAutoModeAvailable} isAutoModeGateEnabled=${t} dismissed=${n} reason=${getAutoModeUnavailableReason()}`);
      }
      return r;
    }
    return false;
  }
  function RXo() {
    return Boolean(getGlobalConfig().autoModeOptInDismissed) && !hasAutoModeOptInAnySource();
  }
  function $hr(e, t) {
    switch (e.mode) {
      case "default":
        return "acceptEdits";
      case "acceptEdits":
        return "plan";
      case "plan":
        if (e.isBypassPermissionsModeAvailable) {
          return "bypassPermissions";
        }
        if (Bhr(e)) {
          return "auto";
        }
        return "default";
      case "bypassPermissions":
        if (Bhr(e)) {
          return "auto";
        }
        return "default";
      case "dontAsk":
        return "default";
      default:
        return "default";
    }
  }
  function BRc(e, t, n) {
    let r = $hr(e, t);
    return {
      nextMode: r,
      context: transitionPermissionMode(e.mode, r, e, n)
    };
  }
  var Hhr = __lazy(() => {
    je();
    S_();
  });
  var kXo = {};
  __export(kXo, {
    AutoModeOptInDialog: () => AutoModeOptInDialog,
    AUTO_MODE_DESCRIPTION: () => "Auto mode lets Claude handle permission prompts automatically \u2014 Claude checks each tool call for risky actions and prompt injection before executing. Actions Claude identifies as safe are executed, while actions Claude identifies as risky are blocked and Claude may try a different approach. Ideal for long-running tasks. Sessions are slightly more expensive. Claude can make mistakes that allow harmful commands to run, it's recommended to only use in isolated environments. Shift+Tab to change mode."
  });
  function AutoModeOptInDialog(e) {
    let t = $Rc.c(25);
    let {
      onAccept: n,
      onDecline: r,
      declineExits: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = [];
      t[0] = s;
    } else {
      s = t[0];
    }
    HRc.useEffect(QCf, s);
    let i;
    if (t[1] !== n || t[2] !== r) {
      i = function (E) {
        if ((E === "accept" || E === "accept-default") && getGlobalConfig().autoModeOptInDismissed) {
          saveGlobalConfig(XCf);
        }
        e: switch (E) {
          case "accept":
            {
              logEvent("tengu_auto_mode_opt_in_dialog_accept", {});
              updateSettingsForSource("userSettings", {
                skipAutoPermissionPrompt: true
              });
              n();
              break e;
            }
          case "accept-default":
            {
              logEvent("tengu_auto_mode_opt_in_dialog_accept_default", {});
              updateSettingsForSource("userSettings", {
                skipAutoPermissionPrompt: true,
                permissions: {
                  defaultMode: "auto"
                }
              });
              n();
              break e;
            }
          case "decline":
            {
              logEvent("tengu_auto_mode_opt_in_dialog_decline", {});
              r("go-back");
              break e;
            }
          case "decline-dont-ask":
            {
              if (logEvent("tengu_auto_mode_opt_in_dialog_decline_dont_ask", {}), !getGlobalConfig().autoModeOptInDismissed) {
                saveGlobalConfig(JCf);
              }
              r("dont-ask");
            }
        }
      };
      t[1] = n;
      t[2] = r;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== r) {
      l = () => r("go-back");
      t[4] = r;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c = l;
    let u;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      u = aXe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [aXe.jsx(Text, {
          children: "Auto mode lets Claude handle permission prompts automatically \u2014 Claude checks each tool call for risky actions and prompt injection before executing. Actions Claude identifies as safe are executed, while actions Claude identifies as risky are blocked and Claude may try a different approach. Ideal for long-running tasks. Sessions are slightly more expensive. Claude can make mistakes that allow harmful commands to run, it's recommended to only use in isolated environments. Shift+Tab to change mode."
        }), aXe.jsx(Link, {
          url: "https://code.claude.com/docs/en/security"
        })]
      });
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      d = [{
        label: "Yes, and make it my default mode",
        value: "accept-default"
      }];
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        label: "Yes, enable auto mode",
        value: "accept"
      };
      t[8] = p;
    } else {
      p = t[8];
    }
    let m = o ? "No, exit" : "No, go back";
    let f;
    if (t[9] !== m) {
      f = {
        label: m,
        value: "decline"
      };
      t[9] = m;
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== o) {
      h = o ? [] : [{
        label: "No, don't ask again",
        value: "decline-dont-ask"
      }];
      t[11] = o;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g;
    if (t[13] !== f || t[14] !== h) {
      g = [...d, p, f, ...h];
      t[13] = f;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== a) {
      y = S => a(S);
      t[16] = a;
      t[17] = y;
    } else {
      y = t[17];
    }
    let _;
    if (t[18] !== c || t[19] !== g || t[20] !== y) {
      _ = aXe.jsx(xr, {
        options: g,
        onChange: y,
        onCancel: c
      });
      t[18] = c;
      t[19] = g;
      t[20] = y;
      t[21] = _;
    } else {
      _ = t[21];
    }
    let b;
    if (t[22] !== c || t[23] !== _) {
      b = aXe.jsxs(or, {
        title: "Enable auto mode?",
        color: "warning",
        onCancel: c,
        children: [u, _]
      });
      t[22] = c;
      t[23] = _;
      t[24] = b;
    } else {
      b = t[24];
    }
    return b;
  }
  function JCf(e) {
    return {
      ...e,
      autoModeOptInDismissed: true
    };
  }
  function XCf(e) {
    return {
      ...e,
      autoModeOptInDismissed: undefined
    };
  }
  function QCf() {
    logEvent("tengu_auto_mode_opt_in_dialog_shown", {});
  }
  var $Rc;
  var HRc;
  var aXe;
  var jhr = __lazy(() => {
    Ot();
    et();
    OS();
    Ii();
    $Rc = __toESM(pt(), 1);
    HRc = __toESM(ot(), 1);
    aXe = __toESM(ie(), 1);
  });
  function GRc() {
    if (!vSt()) {
      return false;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.envOnboarding) {
      return false;
    }
    if ((getAutoModeConfig()?.environment?.length ?? 0) > 0) {
      return false;
    }
    let t = getGlobalConfig().autoModeEnvSetup;
    if (t?.dismissed) {
      return false;
    }
    if (t?.dismissedAt && Date.now() - t.dismissedAt < 604800000) {
      return false;
    }
    return true;
  }
  function VRc(e) {
    let t = qRc.c(16);
    let {
      onAccept: n,
      onLater: r,
      onDismiss: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = [];
      t[0] = s;
    } else {
      s = t[0];
    }
    WRc.useEffect(rRf, s);
    let i;
    if (t[1] !== n || t[2] !== o || t[3] !== r) {
      i = function (g) {
        e: switch (g) {
          case "accept":
            {
              if (logEvent("tengu_auto_mode_env_onboarding_accept", {}), getGlobalConfig().autoModeEnvSetup) {
                saveGlobalConfig(nRf);
              }
              n();
              break e;
            }
          case "later":
            {
              logEvent("tengu_auto_mode_env_onboarding_later", {});
              saveGlobalConfig(tRf);
              r();
              break e;
            }
          case "dismiss":
            logEvent("tengu_auto_mode_env_onboarding_dismiss", {});
            saveGlobalConfig(eRf);
            o();
        }
      };
      t[1] = n;
      t[2] = o;
      t[3] = r;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a = i;
    let l;
    if (t[5] !== a) {
      l = () => a("later");
      t[5] = a;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      c = nxt.jsx(gXd, {
        flexDirection: "column",
        gap: 1,
        children: nxt.jsx(Text, {
          children: "Auto mode lets Claude act without asking first. Telling it which repos you trust and what data is sensitive makes that safer. Claude will explore your repo and recent sessions, then check its draft with you \u2014 takes a few minutes, and you can keep working in another terminal while it runs."
        })
      });
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      u = {
        label: "Set it up",
        value: "accept"
      };
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      d = {
        label: "Not now",
        value: "later"
      };
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      p = [u, d, {
        label: "Don't show again",
        value: "dismiss"
      }];
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== a) {
      m = nxt.jsx(xr, {
        options: p,
        onChange: h => a(h),
        onCancel: () => a("later")
      });
      t[11] = a;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== l || t[14] !== m) {
      f = nxt.jsxs(or, {
        title: "Set up auto mode for your environment?",
        onCancel: l,
        children: [c, m]
      });
      t[13] = l;
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    return f;
  }
  function eRf(e) {
    return {
      ...e,
      autoModeEnvSetup: {
        ...e.autoModeEnvSetup,
        dismissed: true
      }
    };
  }
  function tRf(e) {
    return {
      ...e,
      autoModeEnvSetup: {
        ...e.autoModeEnvSetup,
        dismissedAt: Date.now()
      }
    };
  }
  function nRf(e) {
    return {
      ...e,
      autoModeEnvSetup: undefined
    };
  }
  function rRf() {
    logEvent("tengu_auto_mode_env_onboarding_shown", {});
  }
  var qRc;
  var WRc;
  var nxt;
  var zRc = __lazy(() => {
    $n();
    Ot();
    et();
    jz();
    OS();
    Ii();
    qRc = __toESM(pt(), 1);
    WRc = __toESM(ot(), 1);
    nxt = __toESM(ie(), 1);
  });
  function YRc({
    onDone: e
  }) {
    Jg("bridge-dialog");
    let t = bt(P => P.replBridgeConnected);
    let n = bt(P => P.replBridgeSessionActive);
    let r = bt(P => P.replBridgeReconnecting);
    let o = bt(P => P.replBridgeConnectUrl);
    let s = bt(P => P.replBridgeSessionUrl);
    let i = bt(P => P.replBridgeError);
    let a = bt(P => P.replBridgeExplicit);
    let l = bt(P => P.replBridgeEnabled);
    let c = bt(P => P.replBridgeEnvironmentId);
    let u = bt(P => P.replBridgeSessionId);
    let d = bt(P => P.verbose);
    let p = Lo();
    let {
      removeNotification: m
    } = Fi();
    let [f, h] = lXe.useState(false);
    let [g, y] = lXe.useState("");
    let [_, b] = lXe.useState("");
    let S = KRc.basename(getOriginalCwd());
    lXe.useEffect(() => {
      getBranch().then(b).catch(() => {});
    }, []);
    let E = n ? s : o;
    lXe.useEffect(() => {
      if (!f || !E) {
        y("");
        return;
      }
      Promise.resolve().then(() => __toESM(Iwt(), 1)).then(({
        toString: P
      }) => P(E, {
        type: "utf8",
        errorCorrectionLevel: "L",
        small: true
      })).then(y).catch(() => y(""));
    }, [f, E]);
    jo({
      "confirm:yes": e,
      "confirm:toggle": () => {
        h(P => !P);
      }
    }, {
      context: "Confirmation"
    });
    function C(P) {
      if (P.key === "d" && !P.ctrl && !P.meta) {
        if (P.preventDefault(), a && l) {
          Mk("remoteControlAtStartup", false);
        }
        m("bridge-failed");
        p(F => {
          if (!F.replBridgeEnabled && F.replBridgeError === undefined) {
            return F;
          }
          return {
            ...F,
            replBridgeEnabled: false,
            replBridgeError: undefined
          };
        });
        e();
      }
    }
    let {
      label: x,
      color: A
    } = dJn({
      error: i,
      connected: t,
      sessionActive: n,
      reconnecting: r
    });
    let k = i ? "\xD7" : "\xB7\u2714\uFE0E\xB7";
    let I = g ? g.split(`
`).filter(P => P.length > 0) : [];
    let O = [];
    if (S) {
      O.push(S);
    }
    if (_) {
      O.push(_);
    }
    let M = O.length > 0 ? " \xB7 " + O.join(" \xB7 ") : "";
    let L = i === "disabled after repeated failures \xB7 restart to retry" ? undefined : i ? "Run /remote-control to retry" : E ? n ? mJn(E) : pJn(E) : undefined;
    return oN.jsx(or, {
      title: "Remote Control",
      onCancel: e,
      hideInputGuide: true,
      children: oN.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: C,
        children: [oN.jsxs(gXd, {
          flexDirection: "column",
          children: [oN.jsxs(Text, {
            children: [oN.jsxs(Text, {
              color: A,
              children: [k, " ", x]
            }), oN.jsx(Text, {
              dimColor: true,
              children: M
            })]
          }), oN.jsx(Hc, {
            error: i
          }), d && c && oN.jsxs(Text, {
            dimColor: true,
            children: ["Environment: ", c]
          }), d && u && oN.jsxs(Text, {
            dimColor: true,
            children: ["Session: ", u]
          })]
        }), f && I.length > 0 && oN.jsx(gXd, {
          flexDirection: "column",
          children: I.map((P, F) => oN.jsx(Text, {
            children: P
          }, F))
        }), L && oN.jsx(Text, {
          dimColor: true,
          children: L
        }), oN.jsx(Text, {
          dimColor: true,
          children: oN.jsxs(Hn, {
            children: [oN.jsx(xt, {
              chord: "d",
              action: i !== undefined && !l ? "dismiss" : "disconnect"
            }), Boolean(E) && oN.jsx(Text, {
              children: "space for QR code"
            }), oN.jsx(xt, {
              chord: ["enter", "escape"],
              action: "close"
            })]
          })
        })]
      })
    });
  }
  var KRc;
  var lXe;
  var oN;
  var JRc = __lazy(() => {
    at();
    yse();
    wl();
    Nd();
    px();
    et();
    Bs();
    ho();
    na();
    zg();
    Ai();
    Ii();
    bv();
    bs();
    KRc = require("path");
    lXe = __toESM(ot(), 1);
    oN = __toESM(ie(), 1);
  });
  function xee(e) {
    return j$(e) || RS(e);
  }
  function QRc(e) {
    return e.type === "in_process_teammate" ? e.identity.agentName : e.agentType;
  }
  function oRf(e) {
    return e.type === "in_process_teammate" ? e.identity.agentId : e.agentId;
  }
  function sRf(e) {
    return e.type === "in_process_teammate" ? e.pendingUserMessages.length : e.pendingMessages.length;
  }
  function iRf(e, t) {
    return e?.type === "in_process_teammate" && e.isIdle && e.evictAfter !== undefined && e.evictAfter > 0 && e.evictAfter <= t && e.pendingUserMessages.length === 0 && !e.awaitingPlanApproval;
  }
  function aRf(e, t) {
    let n = t ? e[t] : undefined;
    let r = j$(n) ? n.agentId : undefined;
    let o = j$(n) ? $ie(e, n) : undefined;
    let s = ZRc(e, t);
    let i = Object.values(e).filter(d => xee(d) && (d.evictAfter !== 0 || s.vZc(d.id)) && ($ie(e, d) === r || $ie(e, d) === o || s.vZc(d.id)));
    let a = new Set(i.map(d => d.id));
    let l = new Map();
    for (let d of i) {
      let p = $ie(e, d);
      let m = p !== undefined && a.vZc(p) ? p : undefined;
      let f = l.get(m);
      if (f) {
        f.push(d);
      } else {
        l.set(m, [d]);
      }
    }
    for (let d of l.values()) {
      d.sort((p, m) => p.startTime - m.startTime);
    }
    let c = [];
    function u(d) {
      for (let p of l.get(d) ?? []) {
        c.push(p);
        u(p.id);
      }
    }
    u(undefined);
    return c;
  }
  function $ie(e, t) {
    if (t.type === "in_process_teammate" || !t.parentAgentId) {
      return;
    }
    let n = e[t.parentAgentId];
    return j$(n) && n.evictAfter !== 0 ? t.parentAgentId : undefined;
  }
  function ZRc(e, t) {
    let n = t ? e[t] : undefined;
    let r = new Set();
    for (let o = xee(n) ? n : undefined; o && !r.vZc(o.id);) {
      r.add(o.id);
      let s = $ie(e, o);
      let i = s ? e[s] : undefined;
      o = xee(i) ? i : undefined;
    }
    return r;
  }
  function lRf(e, t) {
    let n = 0;
    let r = new Set();
    let o = $ie(e, t);
    while (o && !r.vZc(o)) {
      r.add(o);
      n++;
      let s = e[o];
      o = j$(s) ? $ie(e, s) : undefined;
    }
    return n;
  }
  function cRf(e, t) {
    let n = 0;
    for (let r of Object.values(e)) {
      if (!j$(r) || r.evictAfter === 0) {
        continue;
      }
      let o = $ie(e, r);
      let s = new Set();
      while (o && !s.vZc(o)) {
        if (o === t) {
          n++;
          break;
        }
        s.add(o);
        let i = e[o];
        o = j$(i) ? $ie(e, i) : undefined;
      }
    }
    return n;
  }
  function khe(e, t, n) {
    return aRf(e, n).filter(r => t[r.id]?.content !== "");
  }
  function exc(e, t, n) {
    if (e < 1) {
      return e;
    }
    for (let r = Math.min(e, t.length) - 1; r >= 0; r--) {
      let o = n.indexOf(t[r]);
      if (o !== -1) {
        return o + 1;
      }
    }
    return 0;
  }
  function qrn() {
    return 2 + Math.max(an(vGd.circle), an(Tc)) + 1;
  }
  function txc(e) {
    switch (e) {
      case "completed":
        return "success";
      case "failed":
      case "killed":
        return "error";
      default:
        return;
    }
  }
  function AXo(e) {
    if (e.type === "in_process_teammate") {
      return !aCe(e.status);
    }
    return !aCe(e.status) || gT(e);
  }
  function uRf(e, t, n, r) {
    let o = sRf(e);
    let s = o > 0 ? `${o} queued` : "";
    let i = e.progress?.tokenCount;
    let a = e.progress?.lastActivity ? vGd.arrowDown : vGd.arrowUp;
    let l = i !== undefined && i > 0 ? `${a} ${formatNumber(i)} tokens` : "";
    if (e.type === "in_process_teammate") {
      if (e.status === "running" && e.shutdownRequested) {
        return {
          elapsed: "stopping",
          tokenText: "",
          queuedText: s,
          queuedCount: o
        };
      }
      if (e.status === "running" && e.awaitingPlanApproval) {
        return {
          elapsed: "awaiting approval",
          tokenText: "",
          queuedText: s,
          queuedCount: o
        };
      }
      if (e.isIdle) {
        return {
          elapsed: "idle",
          tokenText: "",
          queuedText: s,
          queuedCount: o
        };
      }
      if (aCe(e.status)) {
        let m = n ?? e.startTime;
        let f = e.endTime ?? t;
        return {
          elapsed: formatDuration(Math.max(0, f - m)),
          tokenText: l,
          queuedText: s,
          queuedCount: o
        };
      }
      let p = n ?? e.startTime;
      return {
        elapsed: formatDuration(Math.max(0, t - p)),
        tokenText: l,
        queuedText: s,
        queuedCount: o
      };
    }
    let c = !aCe(e.status);
    if (c && e.isIdle) {
      return {
        elapsed: "waiting",
        tokenText: "",
        queuedText: s,
        queuedCount: o
      };
    }
    if (e.status === "completed" && r && !gT(e)) {
      return {
        elapsed: "idle",
        tokenText: "",
        queuedText: s,
        queuedCount: o
      };
    }
    let u = e.totalPausedMs ?? 0;
    let d = Math.max(0, c ? t - e.startTime - u : (e.endTime ?? e.startTime) - e.startTime - u);
    return {
      elapsed: formatDuration(d),
      tokenText: l,
      queuedText: s,
      queuedCount: o
    };
  }
  function dRf(e, t, n) {
    let r = aCe(e.status);
    let o = r ? e.endTime ?? e.startTime : n;
    let s = Math.max(0, o - e.startTime - (e.totalPausedMs ?? 0));
    let i = e.totalTokens > 0 ? ` \xB7 ${vGd.arrowDown} ${formatNumber(e.totalTokens)} tokens` : "";
    let a = t.failedCount > 0 ? ` \xB7 ${t.failedCount} failed` : "";
    let l = e.workflowName ?? e.summary ?? e.description ?? "Dynamic workflow";
    let c = ii(e.description ?? e.summary ?? "", ":").trim();
    return {
      name: l,
      description: c === l ? "" : c,
      statusText: `${t.done}/${t.total} agents done${a} \xB7 ${formatDuration(s)}${i}`,
      bulletColor: r ? txc(e.status) : t.failedCount > 0 ? "error" : undefined
    };
  }
  function nxc({
    showWorkflows: e = false
  } = {}) {
    let t = bt(K => K.tasks);
    let n = Ec();
    let r = bt(K => K.taskDecorations);
    let o = bt(K => K.viewingAgentTaskId);
    let s = bt(K => K.agentNameRegistry);
    let i = bt(K => K.coordinatorTaskIndex);
    let a = bt(K => K.footerSelection === "tasks");
    let l = bt(K => K.footerSelection === "workflows");
    let c = bt(K => K.workflowFooterIndex);
    let u = a ? i : undefined;
    let d = Lo();
    let p = Rv();
    let m = khe(t, r, o);
    let f = Object.values(t).some(xee);
    let h = Ree.useMemo(() => e ? jrn(t) : [], [t, e]);
    let g = h.length > 0;
    let y = Ree.useMemo(() => h.map(K => dtr(K.workflowProgress, K.agentCount)), [h]);
    let _ = Ree.useRef(t);
    _.current = t;
    let b = Ree.useRef(e);
    b.current = e;
    let [, S] = Ree.useState(0);
    useInterval(() => {
      let K = Date.now();
      let J = false;
      let Q = [];
      for (let Z of Object.values(_.current)) {
        if (Z.type === "local_workflow") {
          if (Z.status === "running") {
            if (b.current) {
              J = true;
            }
          } else if ((Z.evictAfter ?? 1 / 0) <= K) {
            p.evictTerminal(Z.id);
          }
          continue;
        }
        if (!xee(Z)) {
          continue;
        }
        if (aCe(Z.status)) {
          if (Z.evictAfter !== undefined && Z.evictAfter <= K) {
            p.evictTerminal(Z.id);
          }
        } else if (Z.evictAfter !== undefined && Z.evictAfter > 0 && Z.evictAfter <= K) {
          Q.push(Z.id);
        } else if (!aCe(Z.status) && !Z.isIdle) {
          J = true;
        }
      }
      if (Q.length > 0) {
        d(Z => {
          let ne;
          for (let oe of Q) {
            let ee = Z.tasks[oe];
            if (iRf(ee, K)) {
              ne ??= {
                ...Z.tasks
              };
              ne[oe] = {
                ...ee,
                evictAfter: 0
              };
            }
          }
          return ne ? {
            ...Z,
            tasks: ne
          } : Z;
        });
      }
      if (J) {
        S(Z => Z + 1);
      }
    }, f || g ? 1000 : null);
    let E = Ree.useMemo(() => {
      let K = new Map();
      for (let [J, Q] of s) {
        K.set(Q, J);
      }
      return K;
    }, [s]);
    let C = o !== undefined && xee(t[o]);
    if (m.length === 0 && !g && !C) {
      return null;
    }
    let x = Date.now();
    let A = h.map((K, J) => dRf(K, y[J], x));
    let k = u ?? 0;
    let I = j_(k >= 1 ? k - 1 : m.findIndex(K => K.id === o), 0, Math.max(0, m.length - 1));
    let {
      windowStart: O,
      windowEnd: M,
      moreAbove: L,
      moreBelow: P
    } = xZt(I, m.length, 5);
    let F = ZRc(t, o);
    let H = m.map(K => F.vZc(K.id) ? 0 : cRf(t, oRf(K)));
    let U = m.map(K => lRf(t, K));
    let N = K => K > 0 ? ` (+${K})` : "";
    let W = Math.min(28, Math.max(4, ...m.map((K, J) => r[K.id]?.content === undefined ? 2 * U[J] + an(E.get(K.id) ?? QRc(K)) + an(N(H[J])) : 0), ...A.map(K => an(K.name))));
    let j = n.getState().transcripts;
    let z = m.map(K => uRf(K, x, j[K.id]?.turnStartTime, E.vZc(K.id)));
    let V = Math.max(0, ...z.map((K, J) => r[m[J].id]?.content === undefined ? an([K.elapsed, K.tokenText, K.queuedText].filter(Boolean).join(" \xB7 ")) : 0), ...A.map(K => an(K.statusText)));
    return Ou.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      children: [(m.length > 0 || C) && Ou.jsx(TRf, {
        isSelected: u === 0,
        isViewed: o === undefined,
        labelWidth: W,
        moreAbove: L,
        onClick: () => I5(d)
      }), m.slice(O, M).map((K, J) => {
        let Q = O + J;
        let Z = U[Q];
        let ne = $ie(t, K);
        let oe = ne !== undefined && m.findIndex(re => re.id === ne) >= O;
        let ee;
        if (Z > 0 && oe) {
          let re = m.slice(Q + 1).some(se => $ie(t, se) === ne);
          ee = hm("  ", Z - 1) + (re ? cF.branch : cF.last) + " ";
        }
        return Ou.jsx(ERf, {
          task: K,
          name: E.get(K.id),
          decoration: r[K.id],
          isSelected: u === Q + 1,
          isViewed: o === K.id,
          treeConnector: ee,
          descendantSuffix: N(H[Q]),
          labelWidth: W,
          statusWidth: V,
          statusParts: z[Q],
          onClick: () => iCe(K.id, d)
        }, K.id);
      }), m.length > 5 && Ou.jsx(gXd, {
        justifyContent: "flex-end",
        children: Ou.jsx(Text, {
          dimColor: true,
          children: P > 0 ? `${"\u2193"} ${P} more` : " "
        })
      }), h.map((K, J) => Ou.jsx(vRf, {
        parts: A[J],
        isSelected: l && c === J,
        labelWidth: W,
        statusWidth: V,
        onClick: () => d(Q => Q.workflowDetail?.taskId === K.id ? Q : {
          ...Q,
          workflowDetail: {
            taskId: K.id
          }
        })
      }, K.id))]
    });
  }
  function rxc() {
    let e = rxt.c(12);
    let t = bt(yRf);
    let n = bt(gRf);
    let r = bt(hRf);
    let o = bt(fRf);
    let s = bt(mRf);
    let i = bt(pRf);
    let a = Zu("chat:killAgents", "Chat", "ctrl+x ctrl+k");
    let {
      columns: l
    } = Sr();
    let c = l >= 90;
    let u;
    if (o === "tasks" && s >= 0) {
      let p;
      if (e[0] !== s || e[1] !== a || e[2] !== c || e[3] !== n || e[4] !== t || e[5] !== r) {
        let m = khe(t, n, r);
        let f = s >= 1 ? m[s - 1] : undefined;
        p = f ? Ou.jsxs(Hn, {
          children: [Ou.jsx(xt, {
            chord: "enter",
            action: "view"
          }), Ou.jsx(xt, {
            chord: "x",
            action: AXo(f) ? "stop" : "clear"
          }), c && Bn(m, AXo) > 1 && Ou.jsx(xt, {
            chord: a,
            action: "stop all agents",
            format: {
              keyCase: "lower"
            }
          })]
        }) : Ou.jsxs(Hn, {
          children: [Ou.jsx(xt, {
            chord: ["up", "down"],
            action: "select"
          }), Ou.jsx(xt, {
            chord: "enter",
            action: "view"
          })]
        });
        e[0] = s;
        e[1] = a;
        e[2] = c;
        e[3] = n;
        e[4] = t;
        e[5] = r;
        e[6] = p;
      } else {
        p = e[6];
      }
      u = p;
    } else if (o === "workflows") {
      let p;
      if (e[7] !== t || e[8] !== i) {
        let m = jrn(t)[i];
        p = m ? Ou.jsxs(Hn, {
          children: [Ou.jsx(xt, {
            chord: "enter",
            action: "view"
          }), Ou.jsx(xt, {
            chord: "x",
            action: aCe(m.status) ? "clear" : "stop"
          })]
        }) : Ou.jsxs(Hn, {
          children: [Ou.jsx(xt, {
            chord: ["up", "down"],
            action: "select"
          }), Ou.jsx(xt, {
            chord: "enter",
            action: "view"
          })]
        });
        e[7] = t;
        e[8] = i;
        e[9] = p;
      } else {
        p = e[9];
      }
      u = p;
    }
    let d;
    if (e[10] !== u) {
      d = u !== undefined ? Ou.jsx(Text, {
        dimColor: true,
        wrap: "truncate",
        children: u
      }) : null;
      e[10] = u;
      e[11] = d;
    } else {
      d = e[11];
    }
    return d;
  }
  function pRf(e) {
    return e.workflowFooterIndex;
  }
  function mRf(e) {
    return e.coordinatorTaskIndex;
  }
  function fRf(e) {
    return e.footerSelection;
  }
  function hRf(e) {
    return e.viewingAgentTaskId;
  }
  function gRf(e) {
    return e.taskDecorations;
  }
  function yRf(e) {
    return e.tasks;
  }
  function qhr() {
    let e = rxt.c(4);
    let t = bt(SRf);
    let n = bt(bRf);
    let r = bt(_Rf);
    let o;
    if (e[0] !== n || e[1] !== t || e[2] !== r) {
      o = khe(t, n, r);
      e[0] = n;
      e[1] = t;
      e[2] = r;
      e[3] = o;
    } else {
      o = e[3];
    }
    let s = o.length;
    let i = r !== undefined && xee(t[r]);
    return s > 0 || i ? s + 1 : 0;
  }
  function _Rf(e) {
    return e.viewingAgentTaskId;
  }
  function bRf(e) {
    return e.taskDecorations;
  }
  function SRf(e) {
    return e.tasks;
  }
  function TRf(e) {
    let t = rxt.c(16);
    let {
      isSelected: n,
      isViewed: r,
      labelWidth: o,
      moreAbove: s,
      onClick: i
    } = e;
    let [a, l] = Ree.useState(false);
    let c = n || a ? vGd.pointer + " " : "  ";
    let u = r ? Tc : vGd.circle;
    let d = s > 0 ? `${"\u2191"} ${s} more` : "";
    let p;
    let m;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      p = () => l(true);
      m = () => l(false);
      t[0] = p;
      t[1] = m;
    } else {
      p = t[0];
      m = t[1];
    }
    let f = o + qrn();
    let h = !n && !r && !a;
    let g;
    if (t[2] !== u || t[3] !== r || t[4] !== c || t[5] !== h) {
      g = Ou.jsxs(Text, {
        dimColor: h,
        bold: r,
        children: [c, u, " main"]
      });
      t[2] = u;
      t[3] = r;
      t[4] = c;
      t[5] = h;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y;
    if (t[7] !== f || t[8] !== g) {
      y = Ou.jsx(gXd, {
        width: f,
        flexShrink: 0,
        children: g
      });
      t[7] = f;
      t[8] = g;
      t[9] = y;
    } else {
      y = t[9];
    }
    let _;
    if (t[10] !== d) {
      _ = d && Ou.jsx(Text, {
        dimColor: true,
        children: d
      });
      t[10] = d;
      t[11] = _;
    } else {
      _ = t[11];
    }
    let b;
    if (t[12] !== i || t[13] !== y || t[14] !== _) {
      b = Ou.jsxs(gXd, {
        justifyContent: "space-between",
        onClick: i,
        onMouseEnter: p,
        onMouseLeave: m,
        children: [y, _]
      });
      t[12] = i;
      t[13] = y;
      t[14] = _;
      t[15] = b;
    } else {
      b = t[15];
    }
    return b;
  }
  function ERf(e) {
    let t = rxt.c(79);
    let {
      task: n,
      name: r,
      decoration: o,
      labelWidth: s,
      statusWidth: i,
      statusParts: a,
      isSelected: l,
      isViewed: c,
      treeConnector: u,
      descendantSuffix: d,
      onClick: p
    } = e;
    let [m, f] = Ree.useState(false);
    let {
      elapsed: h,
      tokenText: g,
      queuedText: y,
      queuedCount: _
    } = a;
    let b = n.progress?.summary || n.description;
    let S = l || m;
    let E = S ? vGd.pointer + " " : "  ";
    let C = c ? Tc : vGd.circle;
    let x;
    if (t[0] !== n) {
      x = AXo(n) ? undefined : txc(n.status);
      t[0] = n;
      t[1] = x;
    } else {
      x = t[1];
    }
    let A = x;
    let k = !S && !c;
    let I;
    if (t[2] !== k || t[3] !== c || t[4] !== E) {
      I = Ou.jsx(Text, {
        dimColor: k,
        bold: c,
        children: E
      });
      t[2] = k;
      t[3] = c;
      t[4] = E;
      t[5] = I;
    } else {
      I = t[5];
    }
    let O;
    if (t[6] !== k || t[7] !== u) {
      O = u !== undefined && Ou.jsx(Text, {
        dimColor: k,
        children: u
      });
      t[6] = k;
      t[7] = u;
      t[8] = O;
    } else {
      O = t[8];
    }
    let M = !A && k;
    let L;
    if (t[9] !== C || t[10] !== A || t[11] !== c || t[12] !== M) {
      L = Ou.jsxs(Text, {
        color: A,
        dimColor: M,
        bold: c,
        children: [C, " "]
      });
      t[9] = C;
      t[10] = A;
      t[11] = c;
      t[12] = M;
      t[13] = L;
    } else {
      L = t[13];
    }
    let P;
    if (t[14] !== I || t[15] !== O || t[16] !== L) {
      P = Ou.jsxs(Ou.Fragment, {
        children: [I, O, L]
      });
      t[14] = I;
      t[15] = O;
      t[16] = L;
      t[17] = P;
    } else {
      P = t[17];
    }
    let F = P;
    let H;
    if (t[18] !== u) {
      H = u ? an(u) : 0;
      t[18] = u;
      t[19] = H;
    } else {
      H = t[19];
    }
    let U = H;
    let N = qrn() + U;
    let W = Math.max(0, s - U);
    if (o?.content !== undefined) {
      let fe;
      let me;
      if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
        fe = () => f(true);
        me = () => f(false);
        t[20] = fe;
        t[21] = me;
      } else {
        fe = t[20];
        me = t[21];
      }
      let Te;
      if (t[22] !== F || t[23] !== N) {
        Te = Ou.jsx(gXd, {
          width: N,
          flexShrink: 0,
          children: F
        });
        t[22] = F;
        t[23] = N;
        t[24] = Te;
      } else {
        Te = t[24];
      }
      let ue;
      if (t[25] !== o.content) {
        ue = Ou.jsx(Ansi, {
          children: o.content
        });
        t[25] = o.content;
        t[26] = ue;
      } else {
        ue = t[26];
      }
      let ce;
      if (t[27] !== k || t[28] !== c || t[29] !== ue) {
        ce = Ou.jsx(gXd, {
          flexGrow: 1,
          width: 0,
          children: Ou.jsx(Text, {
            dimColor: k,
            bold: c,
            wrap: "truncate",
            children: ue
          })
        });
        t[27] = k;
        t[28] = c;
        t[29] = ue;
        t[30] = ce;
      } else {
        ce = t[30];
      }
      let le;
      if (t[31] !== p || t[32] !== Te || t[33] !== ce) {
        le = Ou.jsxs(gXd, {
          onClick: p,
          onMouseEnter: fe,
          onMouseLeave: me,
          children: [Te, ce]
        });
        t[31] = p;
        t[32] = Te;
        t[33] = ce;
        t[34] = le;
      } else {
        le = t[34];
      }
      return le;
    }
    let j;
    let z;
    if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
      j = () => f(true);
      z = () => f(false);
      t[35] = j;
      t[36] = z;
    } else {
      j = t[35];
      z = t[36];
    }
    let V;
    if (t[37] !== F || t[38] !== N) {
      V = Ou.jsx(gXd, {
        width: N,
        flexShrink: 0,
        children: F
      });
      t[37] = F;
      t[38] = N;
      t[39] = V;
    } else {
      V = t[39];
    }
    let K = !r && k;
    let J;
    if (t[40] !== r || t[41] !== n) {
      J = r ?? QRc(n);
      t[40] = r;
      t[41] = n;
      t[42] = J;
    } else {
      J = t[42];
    }
    let Q;
    if (t[43] !== d) {
      Q = d && Ou.jsx(Text, {
        dimColor: true,
        children: d
      });
      t[43] = d;
      t[44] = Q;
    } else {
      Q = t[44];
    }
    let Z;
    if (t[45] !== c || t[46] !== K || t[47] !== J || t[48] !== Q) {
      Z = Ou.jsxs(Text, {
        bold: c,
        dimColor: K,
        wrap: "truncate",
        children: [J, Q]
      });
      t[45] = c;
      t[46] = K;
      t[47] = J;
      t[48] = Q;
      t[49] = Z;
    } else {
      Z = t[49];
    }
    let ne;
    if (t[50] !== W || t[51] !== Z) {
      ne = Ou.jsx(gXd, {
        width: W,
        flexShrink: 0,
        children: Z
      });
      t[50] = W;
      t[51] = Z;
      t[52] = ne;
    } else {
      ne = t[52];
    }
    let oe;
    if (t[53] !== k || t[54] !== b || t[55] !== c) {
      oe = Ou.jsx(gXd, {
        flexGrow: 1,
        width: 0,
        paddingLeft: 2,
        children: Ou.jsx(Text, {
          dimColor: k,
          bold: c,
          wrap: "truncate",
          children: b
        })
      });
      t[53] = k;
      t[54] = b;
      t[55] = c;
      t[56] = oe;
    } else {
      oe = t[56];
    }
    let ee;
    if (t[57] !== h || t[58] !== g) {
      ee = [h, g].filter(Boolean);
      t[57] = h;
      t[58] = g;
      t[59] = ee;
    } else {
      ee = t[59];
    }
    let re = ee.join(" \xB7 ");
    let se;
    if (t[60] !== h || t[61] !== _ || t[62] !== y || t[63] !== g) {
      se = _ > 0 && Ou.jsxs(Text, {
        color: "warning",
        children: [h || g ? " \xB7 " : "", y]
      });
      t[60] = h;
      t[61] = _;
      t[62] = y;
      t[63] = g;
      t[64] = se;
    } else {
      se = t[64];
    }
    let ae;
    if (t[65] !== k || t[66] !== c || t[67] !== re || t[68] !== se) {
      ae = Ou.jsxs(Text, {
        dimColor: k,
        bold: c,
        children: [re, se]
      });
      t[65] = k;
      t[66] = c;
      t[67] = re;
      t[68] = se;
      t[69] = ae;
    } else {
      ae = t[69];
    }
    let de;
    if (t[70] !== i || t[71] !== ae) {
      de = Ou.jsx(gXd, {
        minWidth: i,
        flexShrink: 0,
        marginLeft: 1,
        justifyContent: "flex-end",
        children: ae
      });
      t[70] = i;
      t[71] = ae;
      t[72] = de;
    } else {
      de = t[72];
    }
    let be;
    if (t[73] !== p || t[74] !== V || t[75] !== ne || t[76] !== oe || t[77] !== de) {
      be = Ou.jsxs(gXd, {
        onClick: p,
        onMouseEnter: j,
        onMouseLeave: z,
        children: [V, ne, oe, de]
      });
      t[73] = p;
      t[74] = V;
      t[75] = ne;
      t[76] = oe;
      t[77] = de;
      t[78] = be;
    } else {
      be = t[78];
    }
    return be;
  }
  function vRf(e) {
    let t = rxt.c(33);
    let {
      parts: n,
      labelWidth: r,
      statusWidth: o,
      isSelected: s,
      onClick: i
    } = e;
    let [a, l] = Ree.useState(false);
    let c = s || a;
    let u = c ? vGd.pointer + " " : "  ";
    let d = n.bulletColor;
    let p = !c;
    let m;
    let f;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      m = () => l(true);
      f = () => l(false);
      t[0] = m;
      t[1] = f;
    } else {
      m = t[0];
      f = t[1];
    }
    let h;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      h = qrn();
      t[2] = h;
    } else {
      h = t[2];
    }
    let g;
    if (t[3] !== p || t[4] !== u) {
      g = Ou.jsx(Text, {
        dimColor: p,
        children: u
      });
      t[3] = p;
      t[4] = u;
      t[5] = g;
    } else {
      g = t[5];
    }
    let y = !d && p;
    let _;
    if (t[6] !== d || t[7] !== y) {
      _ = Ou.jsxs(Text, {
        color: d,
        dimColor: y,
        children: [vGd.circle, " "]
      });
      t[6] = d;
      t[7] = y;
      t[8] = _;
    } else {
      _ = t[8];
    }
    let b;
    if (t[9] !== g || t[10] !== _) {
      b = Ou.jsxs(gXd, {
        width: h,
        flexShrink: 0,
        children: [g, _]
      });
      t[9] = g;
      t[10] = _;
      t[11] = b;
    } else {
      b = t[11];
    }
    let S;
    if (t[12] !== p || t[13] !== n.name) {
      S = Ou.jsx(Text, {
        dimColor: p,
        wrap: "truncate",
        children: n.name
      });
      t[12] = p;
      t[13] = n.name;
      t[14] = S;
    } else {
      S = t[14];
    }
    let E;
    if (t[15] !== r || t[16] !== S) {
      E = Ou.jsx(gXd, {
        width: r,
        flexShrink: 0,
        children: S
      });
      t[15] = r;
      t[16] = S;
      t[17] = E;
    } else {
      E = t[17];
    }
    let C;
    if (t[18] !== p || t[19] !== n.description) {
      C = Ou.jsx(gXd, {
        flexGrow: 1,
        width: 0,
        paddingLeft: 2,
        children: Ou.jsx(Text, {
          dimColor: p,
          wrap: "truncate",
          children: n.description
        })
      });
      t[18] = p;
      t[19] = n.description;
      t[20] = C;
    } else {
      C = t[20];
    }
    let x;
    if (t[21] !== p || t[22] !== n.statusText) {
      x = Ou.jsx(Text, {
        dimColor: p,
        children: n.statusText
      });
      t[21] = p;
      t[22] = n.statusText;
      t[23] = x;
    } else {
      x = t[23];
    }
    let A;
    if (t[24] !== o || t[25] !== x) {
      A = Ou.jsx(gXd, {
        minWidth: o,
        flexShrink: 0,
        marginLeft: 1,
        justifyContent: "flex-end",
        children: x
      });
      t[24] = o;
      t[25] = x;
      t[26] = A;
    } else {
      A = t[26];
    }
    let k;
    if (t[27] !== i || t[28] !== C || t[29] !== A || t[30] !== b || t[31] !== E) {
      k = Ou.jsxs(gXd, {
        onClick: i,
        onMouseEnter: m,
        onMouseLeave: f,
        children: [b, E, C, A]
      });
      t[27] = i;
      t[28] = C;
      t[29] = A;
      t[30] = b;
      t[31] = E;
      t[32] = k;
    } else {
      k = t[32];
    }
    return k;
  }
  var rxt;
  var Ree;
  var Ou;
  var oxt = __lazy(() => {
    wl();
    ki();
    Q8();
    bc();
    et();
    c0();
    ho();
    GUe();
    _9();
    ry();
    CXo();
    ptr();
    cs();
    Zn();
    aLe();
    Ai();
    bs();
    Gar();
    lCe();
    rxt = __toESM(pt(), 1);
    Ree = __toESM(ot(), 1);
    Ou = __toESM(ie(), 1);
  });
  function sxc({
    initialQuery: e,
    onSelect: t,
    onCancel: n
  }) {
    Jg("history-search");
    let {
      columns: r
    } = Sr();
    let [o, s] = Hie.useState("everywhere");
    let [i, a] = Hie.useState(null);
    let [l, c] = Hie.useState(e ?? "");
    let u = Hie.useRef({});
    Hie.useEffect(() => {
      Pe("history_search_open");
    }, []);
    Hie.useEffect(() => {
      let y = u.current[o];
      if (y) {
        a(y);
        return;
      }
      a(null);
      let _ = false;
      (async () => {
        let b = kQi(o);
        let S = [];
        for await (let E of b) {
          if (_) {
            b.return(undefined);
            return;
          }
          let C = E.display;
          let x = C.indexOf(`
`);
          let A = formatRelativeTimeAgo(new Date(E.timestamp));
          S.push({
            entry: E,
            display: C,
            lower: C.toLowerCase(),
            firstLine: x === -1 ? C : C.slice(0, x),
            age: A + " ".repeat(Math.max(0, 8 - an(A)))
          });
        }
        if (!_) {
          u.current[o] = S;
          a(S);
        }
      })();
      return () => {
        _ = true;
      };
    }, [o]);
    let d = NI("historySearch:cycleScope", "HistorySearch", "ctrl+s");
    uo("historySearch:cycleScope", () => {
      let y = OLn.indexOf(o);
      let _ = OLn[(y + 1) % OLn.length];
      s(_);
      logEvent("tengu_history_picker_scope", {
        from: o,
        to: _
      });
    }, {
      context: "HistorySearch"
    });
    let p = Hie.useMemo(() => {
      if (!i) {
        return [];
      }
      let y = l.trim().toLowerCase();
      if (!y) {
        return i;
      }
      let _ = [];
      let b = [];
      for (let S of i) {
        if (S.lower.includes(y)) {
          _.push(S);
        } else if (wRf(S.lower, y)) {
          b.push(S);
        }
      }
      return _.concat(b);
    }, [i, l]);
    let m = r >= 100;
    let f = m ? Math.floor((r - 6) * 0.5) : r - 6;
    let h = Math.max(20, f - 8 - 1);
    let g = m ? Math.max(20, r - f - 12) : Math.max(20, r - 10);
    return $K.jsx(Jcr, {
      title: $K.jsxs(Text, {
        children: ["Search prompts ", $K.jsxs(Text, {
          color: "suggestion",
          children: ["\xB7 ", o]
        })]
      }),
      placeholder: "Filter history\u2026",
      initialQuery: e,
      items: p,
      getKey: y => String(y.entry.timestamp),
      onQueryChange: c,
      onSelect: y => {
        logEvent("tengu_history_picker_select", {
          result_count: p.length,
          query_length: l.length
        });
        y.entry.resolve().then(t);
      },
      onCancel: n,
      resetKey: o,
      extraHints: [$K.jsx(xt, {
        chord: d,
        action: "scope"
      }, "scope"), mL() && $K.jsx(Text, {
        children: "Esc i / for slash commands"
      }, "vim")],
      emptyMessage: y => i === null ? "Loading\u2026" : y ? "No matching prompts" : "No history yet",
      selectAction: "use",
      direction: "up",
      previewPosition: m ? "right" : "bottom",
      renderItem: (y, _) => $K.jsxs(Text, {
        children: [$K.jsx(Text, {
          dimColor: true,
          children: y.age
        }), $K.jsxs(Text, {
          color: _ ? "suggestion" : undefined,
          children: [" ", truncateToWidth(y.firstLine, h)]
        })]
      }),
      renderPreview: y => {
        let _ = MB(y.display, g, {
          hard: true
        }).split(`
`).filter(C => C.trim() !== "");
        let b = _.length > 6;
        let S = _.slice(0, b ? 6 - 1 : 6);
        let E = _.length - S.length;
        return $K.jsxs(gXd, {
          flexDirection: "column",
          borderStyle: "round",
          borderDimColor: true,
          paddingX: 1,
          height: 6 + 2,
          children: [S.map((C, x) => $K.jsx(Text, {
            dimColor: true,
            children: C
          }, x)), $K.jsx(B1, {
            count: E
          })]
        });
      }
    });
  }
  function wRf(e, t) {
    let n = 0;
    for (let r = 0; r < e.length && n < t.length; r++) {
      if (e[r] === t[n]) {
        n++;
      }
    }
    return n === t.length;
  }
  var Hie;
  var $K;
  var ixc = __lazy(() => {
    px();
    gq();
    ki();
    bc();
    Kge();
    et();
    eOe();
    Bs();
    ln();
    Ot();
    cs();
    M9o();
    bs();
    YX();
    oUe();
    Hie = __toESM(ot(), 1);
    $K = __toESM(ie(), 1);
  });
  function cxc(e) {
    let t = axc.c(25);
    let {
      currentValue: n,
      onSelect: r,
      onCancel: o,
      isMidConversation: s
    } = e;
    let [i, a] = lxc.useState(null);
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = [{
        value: "true",
        label: "Enabled",
        description: "Claude will think before responding"
      }, {
        value: "false",
        label: "Disabled",
        description: "Claude will respond without extended thinking"
      }];
      t[0] = l;
    } else {
      l = t[0];
    }
    let c = l;
    let u;
    if (t[1] !== i || t[2] !== o) {
      u = () => {
        if (i !== null) {
          a(null);
        } else {
          o();
        }
      };
      t[1] = i;
      t[2] = o;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      d = {
        context: "Confirmation"
      };
      t[4] = d;
    } else {
      d = t[4];
    }
    uo("confirm:no", u, d);
    let p;
    if (t[5] !== i || t[6] !== r) {
      p = () => {
        if (i !== null) {
          r(i);
        }
      };
      t[5] = i;
      t[6] = r;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m = i !== null;
    let f;
    if (t[8] !== m) {
      f = {
        context: "Confirmation",
        isActive: m
      };
      t[8] = m;
      t[9] = f;
    } else {
      f = t[9];
    }
    uo("confirm:yes", p, f);
    let h;
    if (t[10] !== n || t[11] !== s || t[12] !== r) {
      h = function (C) {
        let x = C === "true";
        if (s && x !== n) {
          a(x);
        } else {
          r(x);
        }
      };
      t[10] = n;
      t[11] = s;
      t[12] = r;
      t[13] = h;
    } else {
      h = t[13];
    }
    let g = h;
    let y;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      y = sN.jsxs(gXd, {
        marginBottom: 1,
        flexDirection: "column",
        children: [sN.jsx(Text, {
          color: "remember",
          bold: true,
          children: "Toggle thinking mode"
        }), sN.jsx(Text, {
          dimColor: true,
          children: "Enable or disable thinking for this session."
        })]
      });
      t[14] = y;
    } else {
      y = t[14];
    }
    let _;
    if (t[15] !== i || t[16] !== n || t[17] !== g || t[18] !== o) {
      _ = sN.jsxs(gXd, {
        flexDirection: "column",
        children: [y, i !== null ? sN.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          gap: 1,
          children: [sN.jsx(Text, {
            color: "warning",
            children: "Changing thinking mode mid-conversation will increase latency and may reduce quality. For best results, set this at the start of a session."
          }), sN.jsx(Text, {
            color: "warning",
            children: "Do you want to proceed?"
          })]
        }) : sN.jsx(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: sN.jsx(xr, {
            defaultValue: n ? "true" : "false",
            defaultFocusValue: n ? "true" : "false",
            options: c,
            onChange: g,
            onCancel: o,
            visibleOptionCount: 2
          })
        })]
      });
      t[15] = i;
      t[16] = n;
      t[17] = g;
      t[18] = o;
      t[19] = _;
    } else {
      _ = t[19];
    }
    let b;
    if (t[20] !== i) {
      b = sN.jsx(Lw, {
        children: i !== null ? sN.jsxs(Hn, {
          children: [sN.jsx(xt, {
            chord: "enter",
            action: "confirm"
          }), sN.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        }) : sN.jsxs(Hn, {
          children: [sN.jsx(xt, {
            chord: "enter",
            action: "confirm"
          }), sN.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        })
      });
      t[20] = i;
      t[21] = b;
    } else {
      b = t[21];
    }
    let S;
    if (t[22] !== b || t[23] !== _) {
      S = sN.jsxs(Td, {
        color: "permission",
        children: [_, b]
      });
      t[22] = b;
      t[23] = _;
      t[24] = S;
    } else {
      S = t[24];
    }
    return S;
  }
  var axc;
  var lxc;
  var sN;
  var uxc = __lazy(() => {
    fz();
    et();
    Bs();
    Sd();
    OS();
    Ai();
    bs();
    oE();
    axc = __toESM(pt(), 1);
    lxc = __toESM(ot(), 1);
    sN = __toESM(ie(), 1);
  });
  function PXo(e) {
    let [t] = useTheme();
    let n = useTerminalFocus();
    let r = Ghr.useMemo(wre, []);
    uLn(n, !!e.onImagePaste);
    let o = Xql({
      value: e.value,
      onChange: e.onChange,
      onSubmit: e.onSubmit,
      onExit: e.onExit,
      onExitMessage: e.onExitMessage,
      onLeftArrowOnEmpty: e.onLeftArrowOnEmpty,
      onHistoryReset: e.onHistoryReset,
      onHistoryUp: e.onHistoryUp,
      onHistoryDown: e.onHistoryDown,
      focus: e.focus,
      mask: e.mask,
      multiline: e.multiline,
      cursorChar: e.showCursor && !r ? " " : "",
      highlightPastedText: e.highlightPastedText,
      invert: n ? OWe : a => a,
      themeText: color("text", t),
      columns: e.columns,
      maxVisibleLines: e.maxVisibleLines,
      onImagePaste: e.onImagePaste,
      disableCursorMovementForUpDownKeys: e.disableCursorMovementForUpDownKeys,
      disableEscapeDoublePress: e.disableEscapeDoublePress,
      externalOffset: e.cursorOffset,
      onOffsetChange: e.onChangeCursorOffset,
      inputFilter: e.inputFilter,
      onModeChange: e.onModeChange,
      onUndo: e.onUndo,
      onOpenHistorySearch: e.onOpenHistorySearch
    });
    let {
      mode: s,
      setMode: i
    } = o;
    Ghr.useEffect(() => {
      if (e.initialMode && e.initialMode !== s) {
        i(e.initialMode);
      }
    }, [e.initialMode, s, i]);
    return IXo.jsx(gXd, {
      flexDirection: "column",
      children: IXo.jsx(GLn, {
        inputState: o,
        terminalFocus: n,
        highlights: e.highlights,
        ...e
      })
    });
  }
  var Ghr;
  var IXo;
  var dxc = __lazy(() => {
    zro();
    Bjo();
    J8();
    et();
    GWe();
    Too();
    Ghr = __toESM(ot(), 1);
    IXo = __toESM(ie(), 1);
  });
  function PRf() {
    let e = Wrn.c(8);
    let t = Ec();
    let n = Lo();
    let r = HK.useRef(null);
    let o = useClock();
    let s;
    if (e[0] !== o || e[1] !== n || e[2] !== t) {
      s = () => {
        let c = t.getState().frameUrls;
        let u = Object.values(c).at(-1)?.url;
        if (!u) {
          return false;
        }
        Ac(u);
        Pe("frame_link_open");
        let d = Object.keys(c).at(-1) ?? null;
        if (n(p => p.frameExpanded && p.frameNavPath === d ? p : {
          ...p,
          frameExpanded: true,
          frameNavPath: d
        }), r.current) {
          r.current();
        }
        r.current = o.setTimeout(() => {
          n(DRf);
        }, 15000);
      };
      e[0] = o;
      e[1] = n;
      e[2] = t;
      e[3] = s;
    } else {
      s = e[3];
    }
    let i;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        context: "Global"
      };
      e[4] = i;
    } else {
      i = e[4];
    }
    uo("app:openArtifact", s, i);
    let a;
    let l;
    if (e[5] !== n) {
      a = () => () => {
        r.current?.();
        n(ORf);
      };
      l = [n];
      e[5] = n;
      e[6] = a;
      e[7] = l;
    } else {
      a = e[6];
      l = e[7];
    }
    HK.useEffect(a, l);
  }
  function ORf(e) {
    if (e.footerSelection === "frame" || !e.frameExpanded) {
      return e;
    }
    return {
      ...e,
      frameExpanded: false
    };
  }
  function DRf(e) {
    if (e.footerSelection === "frame" || !e.frameExpanded) {
      return e;
    }
    return {
      ...e,
      frameExpanded: false
    };
  }
  function fxc() {
    let e = Wrn.c(1);
    if (PRf(), !bt(MRf)) {
      return null;
    }
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = ME.jsx(NRf, {});
      e[0] = n;
    } else {
      n = e[0];
    }
    return n;
  }
  function MRf(e) {
    return Object.keys(e.frameUrls).length > 0;
  }
  function Vhr(e, t) {
    if (e.length === 0) {
      return 0;
    }
    if (t != null) {
      let n = e.findIndex(([r]) => r === t);
      if (n !== -1) {
        return n;
      }
    }
    return e.length - 1;
  }
  function LRf(e, t, n) {
    let r = e.length;
    if (r === 0) {
      return {
        visible: [],
        before: 0,
        after: 0
      };
    }
    let o = e.map(([u, d], p) => ({
      idx: p,
      name: DXo.parse(u).name,
      url: d.url,
      updatedAt: d.updatedAt
    }));
    let s = Math.min(Math.max(n ?? r - 1, 0), r - 1);
    function i(u, d) {
      let p = 0;
      for (let m = u; m <= d; m++) {
        p += (m > u ? uXe : 0) + an(o[m].name);
      }
      if (u > 0) {
        p += an(`+${u}`) + uXe;
      }
      if (d < r - 1) {
        p += uXe + an(`+${r - 1 - d}`);
      }
      return p;
    }
    let a = s;
    let l = s;
    for (;;) {
      if (l < r - 1 && i(a, l + 1) <= t) {
        l++;
        continue;
      }
      if (a > 0 && i(a - 1, l) <= t) {
        a--;
        continue;
      }
      break;
    }
    let c = o.slice(a, l + 1);
    if (c.length === 1 && i(a, l) > t) {
      let u = i(a, l) - an(c[0].name);
      let d = Math.max(1, t - u);
      c = [{
        ...c[0],
        name: truncateToWidth(c[0].name, d)
      }];
    }
    return {
      visible: c,
      before: a,
      after: r - 1 - l
    };
  }
  function FRf(e) {
    let t = Wrn.c(13);
    let {
      name: n,
      url: r,
      highlighted: o,
      navSelected: s,
      stale: i
    } = e;
    let [a, l] = HK.useState(false);
    let c;
    if (t[0] !== r) {
      c = () => void Ac(r);
      t[0] = r;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u;
    let d;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => l(true);
      d = () => l(false);
      t[2] = u;
      t[3] = d;
    } else {
      u = t[2];
      d = t[3];
    }
    let p = o || a ? "claude" : undefined;
    let m = i && !o && !a && !s;
    let f;
    if (t[4] !== a || t[5] !== n || t[6] !== s || t[7] !== p || t[8] !== m) {
      f = ME.jsx(Text, {
        underline: a,
        inverse: s,
        color: p,
        dimColor: m,
        children: n
      });
      t[4] = a;
      t[5] = n;
      t[6] = s;
      t[7] = p;
      t[8] = m;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== c || t[11] !== f) {
      h = ME.jsx(gXd, {
        flexShrink: 0,
        onClick: c,
        onMouseEnter: u,
        onMouseLeave: d,
        children: f
      });
      t[10] = c;
      t[11] = f;
      t[12] = h;
    } else {
      h = t[12];
    }
    return h;
  }
  function URf(e) {
    return e.frameUrls;
  }
  function BRf(e) {
    return e.footerSelection === "frame";
  }
  function $Rf(e) {
    return e.frameNavPath;
  }
  function HRf(e) {
    return e.frameExpanded;
  }
  function jRf(e) {
    let [, t] = e;
    return Date.now() - t.updatedAt <= 1800000;
  }
  function qRf(e) {
    return e + 1;
  }
  var Wrn;
  var DXo;
  var pxc;
  var HK;
  var ME;
  var uXe;
  var OXo;
  var ARf;
  var IRf;
  var NRf;
  var hxc = __lazy(() => {
    wl();
    ki();
    bc();
    et();
    eOe();
    Bs();
    ln();
    ho();
    ky();
    dI();
    bs();
    ZLn();
    Wrn = __toESM(pt(), 1);
    DXo = require("path");
    pxc = __toESM(ot(), 1);
    HK = __toESM(ot(), 1);
    ME = __toESM(ie(), 1);
    uXe = an(" \xB7 ");
    OXo = 2 + an(`${"\u29C9"}  `);
    ARf = an(`\u2190/\u2192 to navigate${" \xB7 "}`);
    IRf = an("Enter to open");
    NRf = HK.memo(function () {
      let t = Wrn.c(47);
      let n = bt(URf);
      let r = bt(BRf);
      let o = bt($Rf);
      let s = bt(HRf);
      let i = NI("app:openArtifact", "Global", "ctrl+]");
      let {
        columns: a
      } = Sr();
      let [l, c] = HK.useState(false);
      let u = HK.useRef(null);
      let d = useClock();
      let p;
      if (t[0] !== n) {
        p = Object.entries(n);
        t[0] = n;
        t[1] = p;
      } else {
        p = t[1];
      }
      let m = p;
      let f = Vhr(m, o);
      let h;
      if (t[2] !== d) {
        h = () => {
          c(true);
          u.current?.();
          u.current = d.setTimeout(() => c(false), 30000);
        };
        t[2] = d;
        t[3] = h;
      } else {
        h = t[3];
      }
      let g;
      if (t[4] !== d || t[5] !== n) {
        g = [n, d];
        t[4] = d;
        t[5] = n;
        t[6] = g;
      } else {
        g = t[6];
      }
      HK.useEffect(h, g);
      let y;
      let _;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        y = () => () => {
          u.current?.();
        };
        _ = [];
        t[7] = y;
        t[8] = _;
      } else {
        y = t[7];
        _ = t[8];
      }
      HK.useEffect(y, _);
      let [, b] = HK.useState(0);
      let S = m.some(jRf);
      let E;
      if (t[9] !== b) {
        E = () => b(qRf);
        t[9] = b;
        t[10] = E;
      } else {
        E = t[10];
      }
      useInterval(E, S ? 60000 : null);
      let C = r || s ? f : null;
      let x = s ? m[f]?.[1]?.url : undefined;
      let A = r ? `${vGd.pointer} ` : "  ";
      let k = !r && l && i !== "";
      let I = 0;
      if (r) {
        I = IRf + (m.length > 1 ? ARf : 0);
      } else if (k) {
        let ce;
        if (t[11] !== i) {
          ce = tOe([hG(i)]);
          t[11] = i;
          t[12] = ce;
        } else {
          ce = t[12];
        }
        let le = `${ce} to open`;
        let pe;
        if (t[13] !== le) {
          pe = an(le);
          t[13] = le;
          t[14] = pe;
        } else {
          pe = t[14];
        }
        I = pe;
      }
      let O = C ?? m.length - 1;
      let M = an(DXo.parse(m[O]?.[0] ?? "").name);
      let L = O > 0 ? an(`+${O}`) + uXe : 0;
      let P = O < m.length - 1 ? uXe + an(`+${m.length - 1 - O}`) : 0;
      let F = I > 0 && a - OXo - I - uXe - L - P >= Math.min(M, 16);
      let H;
      if (t[15] !== i || t[16] !== m.length || t[17] !== k || t[18] !== F || t[19] !== r) {
        H = F && r ? ME.jsxs(ME.Fragment, {
          children: [m.length > 1 && ME.jsx(xt, {
            chord: ["left", "right"],
            action: "navigate"
          }), m.length > 1 && " \xB7 ", ME.jsx(xt, {
            chord: "enter",
            action: "open"
          })]
        }) : F && k ? ME.jsx(xt, {
          chord: i,
          action: "open"
        }) : null;
        t[15] = i;
        t[16] = m.length;
        t[17] = k;
        t[18] = F;
        t[19] = r;
        t[20] = H;
      } else {
        H = t[20];
      }
      let U = H;
      let N = Math.max(8, a - OXo - (F ? I + uXe : 0));
      let {
        visible: W,
        before: j,
        after: z
      } = LRf(m, N, C);
      let V = gXd;
      let K = "column";
      let J = "100%";
      let Q = gXd;
      let Z = "row";
      let ne = r ? "claude" : undefined;
      let oe = !r;
      let ee;
      if (t[21] !== A || t[22] !== ne || t[23] !== oe) {
        ee = ME.jsx(Text, {
          color: ne,
          dimColor: oe,
          children: A
        });
        t[21] = A;
        t[22] = ne;
        t[23] = oe;
        t[24] = ee;
      } else {
        ee = t[24];
      }
      let re;
      if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
        re = ME.jsxs(Text, {
          color: "claude",
          children: ["\u29C9", "  "]
        });
        t[25] = re;
      } else {
        re = t[25];
      }
      let se;
      if (t[26] !== ee) {
        se = ME.jsxs(gXd, {
          flexShrink: 0,
          children: [ee, re]
        });
        t[26] = ee;
        t[27] = se;
      } else {
        se = t[27];
      }
      let ae;
      if (t[28] !== j) {
        ae = j > 0 && ME.jsx(gXd, {
          flexShrink: 0,
          children: ME.jsxs(Text, {
            dimColor: true,
            children: ["+", j, " \xB7 "]
          })
        });
        t[28] = j;
        t[29] = ae;
      } else {
        ae = t[29];
      }
      let de = W.map((ce, le) => {
        let {
          idx: pe,
          name: ve,
          url: _e,
          updatedAt: xe
        } = ce;
        return ME.jsxs(pxc.Fragment, {
          children: [le > 0 && ME.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          }), ME.jsx(FRf, {
            name: ve,
            url: _e,
            highlighted: pe === C,
            navSelected: r && pe === f,
            stale: Date.now() - xe > 1800000
          })]
        }, `${pe}-${ve}`);
      });
      let be;
      if (t[30] !== z) {
        be = z > 0 && ME.jsx(gXd, {
          flexShrink: 0,
          children: ME.jsxs(Text, {
            dimColor: true,
            children: [" \xB7 ", "+", z]
          })
        });
        t[30] = z;
        t[31] = be;
      } else {
        be = t[31];
      }
      let fe;
      if (t[32] !== U) {
        fe = U && ME.jsx(gXd, {
          flexShrink: 0,
          children: ME.jsxs(Text, {
            dimColor: true,
            children: [" \xB7 ", U]
          })
        });
        t[32] = U;
        t[33] = fe;
      } else {
        fe = t[33];
      }
      let me;
      if (t[34] !== Q || t[35] !== se || t[36] !== ae || t[37] !== de || t[38] !== be || t[39] !== fe) {
        me = ME.jsxs(Q, {
          flexDirection: Z,
          children: [se, ae, de, be, fe]
        });
        t[34] = Q;
        t[35] = se;
        t[36] = ae;
        t[37] = de;
        t[38] = be;
        t[39] = fe;
        t[40] = me;
      } else {
        me = t[40];
      }
      let Te;
      if (t[41] !== x) {
        Te = x && ME.jsx(gXd, {
          paddingLeft: OXo,
          children: ME.jsx(Link, {
            url: x,
            children: ME.jsx(Text, {
              dimColor: true,
              children: x
            })
          })
        });
        t[41] = x;
        t[42] = Te;
      } else {
        Te = t[42];
      }
      let ue;
      if (t[43] !== V || t[44] !== me || t[45] !== Te) {
        ue = ME.jsxs(V, {
          flexDirection: K,
          width: J,
          children: [me, Te]
        });
        t[43] = V;
        t[44] = me;
        t[45] = Te;
        t[46] = ue;
      } else {
        ue = t[46];
      }
      return ue;
    });
  });
  function bxc(e) {
    let t = [`This session was opened by an external deep link in ${GRf(e.cwd)}`];
    if (e.repo) {
      let n = e.lastFetch ? formatRelativeTimeAgo(e.lastFetch) : "never";
      let r = !e.lastFetch || Date.now() - e.lastFetch.getTime() > 604800000;
      t.push(`Resolved ${e.repo} from local clones \xB7 last fetched ${n}${r ? " \u2014 CLAUDE.md may be stale" : ""}`);
    }
    if (e.prefillLength) {
      t.push(e.prefillLength > 1000 ? `The prompt below (${formatNumber(e.prefillLength)} chars) was supplied by the link \u2014 scroll to review the entire prompt before pressing Enter.` : "The prompt below was supplied by the link \u2014 review carefully before pressing Enter.");
    }
    return t.join(`
`);
  }
  async function Sxc(e) {
    let t = await getGitDir(e);
    if (!t) {
      return;
    }
    let n = await getCommonDir(t);
    let [r, o] = await Promise.all([gxc(Grn.join(t, "FETCH_HEAD")), n ? gxc(Grn.join(n, "FETCH_HEAD")) : Promise.resolve(undefined)]);
    if (r && o) {
      return r > o ? r : o;
    }
    return r ?? o;
  }
  async function gxc(e) {
    try {
      let {
        mtime: t
      } = await yxc.stat(e);
      return t;
    } catch {
      return;
    }
  }
  function GRf(e) {
    let t = _xc.homedir();
    if (e === t) {
      return "~";
    }
    if (e.startsWith(t + Grn.sep)) {
      return "~" + e.slice(t.length);
    }
    return e;
  }
  var yxc;
  var _xc;
  var Grn;
  var zhr = __lazy(() => {
    cs();
    FP();
    na();
    yxc = require("fs/promises");
    _xc = require("os");
    Grn = require("path");
  });
  function vxc() {
    let e = NXo.c(5);
    let t = uLl();
    let {
      addNotification: n,
      removeNotification: r
    } = Fi();
    let o;
    let s;
    if (e[0] !== n || e[1] !== r || e[2] !== t) {
      o = () => {
        if (t === null) {
          r("launch-prompt-warning");
          return;
        }
        n({
          key: "launch-prompt-warning",
          kind: "warning",
          priority: "immediate",
          pinned: true,
          jsx: dXe.jsx(VRf, {
            warning: t
          })
        });
      };
      s = [t, n, r];
      e[0] = n;
      e[1] = r;
      e[2] = t;
      e[3] = o;
      e[4] = s;
    } else {
      o = e[3];
      s = e[4];
    }
    Exc.useEffect(o, s);
  }
  function VRf(e) {
    let t = NXo.c(9);
    let {
      warning: n
    } = e;
    let r = n.type === "deep-link" ? "Prompt from an external link" : "Pre-filled prompt";
    let o = n.prefillLength > 1000;
    let s;
    if (t[0] !== o || t[1] !== n.prefillLength) {
      s = o ? ` (${n.prefillLength.toLocaleString("en-US")} chars)` : "";
      t[0] = o;
      t[1] = n.prefillLength;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = o ? " \xB7 scroll to review it all before pressing Enter" : " \xB7 review before pressing Enter";
    let a;
    if (t[3] !== i) {
      a = dXe.jsx(Text, {
        dimColor: true,
        children: i
      });
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== r || t[6] !== s || t[7] !== a) {
      l = dXe.jsxs(dXe.Fragment, {
        children: [r, s, a]
      });
      t[5] = r;
      t[6] = s;
      t[7] = a;
      t[8] = l;
    } else {
      l = t[8];
    }
    return l;
  }
  var NXo;
  var Exc;
  var dXe;
  var wxc = __lazy(() => {
    Nd();
    et();
    zhr();
    ufe();
    NXo = __toESM(pt(), 1);
    Exc = __toESM(ot(), 1);
    dXe = __toESM(ie(), 1);
  });
  function Cxc() {
    let e = LXo.c(10);
    vxc();
    let t = bt(YRf);
    if (t.length === 0) {
      return null;
    }
    let n;
    let r;
    let o;
    let s;
    if (e[0] !== t) {
      let a = t.slice().sort(KRf);
      n = gXd;
      r = "column";
      o = 2;
      s = a.map(zRf);
      e[0] = t;
      e[1] = n;
      e[2] = r;
      e[3] = o;
      e[4] = s;
    } else {
      n = e[1];
      r = e[2];
      o = e[3];
      s = e[4];
    }
    let i;
    if (e[5] !== n || e[6] !== r || e[7] !== o || e[8] !== s) {
      i = sxt.jsx(n, {
        flexDirection: r,
        paddingLeft: o,
        children: s
      });
      e[5] = n;
      e[6] = r;
      e[7] = o;
      e[8] = s;
      e[9] = i;
    } else {
      i = e[9];
    }
    return i;
  }
  function zRf(e) {
    return sxt.jsx(JRf, {
      notice: e
    }, e.key);
  }
  function KRf(e, t) {
    return rjt[e.priority] - rjt[t.priority];
  }
  function YRf(e) {
    return e.notifications.pinned;
  }
  function JRf(e) {
    let t = LXo.c(5);
    let {
      notice: n
    } = e;
    if ("jsx" in n) {
      let s;
      if (t[0] !== n.jsx) {
        s = sxt.jsxs(Text, {
          color: "warning",
          wrap: "truncate",
          children: ["\u26A0", " ", n.jsx]
        });
        t[0] = n.jsx;
        t[1] = s;
      } else {
        s = t[1];
      }
      return s;
    }
    let r = n.color ?? "warning";
    let o;
    if (t[2] !== n.text || t[3] !== r) {
      o = sxt.jsxs(Text, {
        color: r,
        wrap: "truncate",
        children: ["\u26A0", " ", n.text]
      });
      t[2] = n.text;
      t[3] = r;
      t[4] = o;
    } else {
      o = t[4];
    }
    return o;
  }
  var LXo;
  var sxt;
  var Rxc = __lazy(() => {
    wl();
    Nd();
    et();
    ho();
    wxc();
    LXo = __toESM(pt(), 1);
    sxt = __toESM(ie(), 1);
  });
  function UXo(e) {
    let t = FXo.c(13);
    let {
      tasksSelected: n,
      onOpenDialog: r
    } = e;
    let o = bt(XRf);
    let s;
    if (t[0] !== o) {
      s = Object.values(o ?? {}).filter(eCt);
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    if (i.length === 0) {
      return null;
    }
    let a;
    if (t[2] !== i) {
      a = Pgt(i);
      t[2] = i;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== r || t[5] !== a || t[6] !== n) {
      l = YCe.jsx(QRf, {
        selected: n,
        onClick: r,
        children: a
      });
      t[4] = r;
      t[5] = a;
      t[6] = n;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== i) {
      c = vVa(i) && YCe.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", vGd.arrowDown, " to view"]
      });
      t[8] = i;
      t[9] = c;
    } else {
      c = t[9];
    }
    let u;
    if (t[10] !== l || t[11] !== c) {
      u = YCe.jsxs(YCe.Fragment, {
        children: [l, c]
      });
      t[10] = l;
      t[11] = c;
      t[12] = u;
    } else {
      u = t[12];
    }
    return u;
  }
  function XRf(e) {
    return e.tasks;
  }
  function QRf(e) {
    let t = FXo.c(8);
    let {
      selected: n,
      onClick: r,
      children: o
    } = e;
    let [s, i] = xxc.useState(false);
    let a = n || s;
    let l;
    if (t[0] !== o || t[1] !== a) {
      l = YCe.jsx(Text, {
        color: "background",
        inverse: a,
        children: o
      });
      t[0] = o;
      t[1] = a;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = l;
    if (!r) {
      return c;
    }
    let u;
    let d;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => i(true);
      d = () => i(false);
      t[3] = u;
      t[4] = d;
    } else {
      u = t[3];
      d = t[4];
    }
    let p;
    if (t[5] !== c || t[6] !== r) {
      p = YCe.jsx(gXd, {
        onClick: r,
        onMouseEnter: u,
        onMouseLeave: d,
        children: c
      });
      t[5] = c;
      t[6] = r;
      t[7] = p;
    } else {
      p = t[7];
    }
    return p;
  }
  var FXo;
  var xxc;
  var YCe;
  var kxc = __lazy(() => {
    ho();
    j5n();
    et();
    lCe();
    FXo = __toESM(pt(), 1);
    xxc = __toESM(ot(), 1);
    YCe = __toESM(ie(), 1);
  });
  function Ixc(e, t) {
    let n = new Set();
    for (let {
      id: r,
      tokenCount: o
    } of t) {
      n.add(r);
      let s = e.get(r);
      if (!s) {
        e.set(r, s = []);
      }
      if (s.push(o), s.length > 16) {
        s.splice(0, s.length - 16);
      }
    }
    for (let r of e.keys()) {
      if (!n.vZc(r)) {
        e.delete(r);
      }
    }
  }
  function txf(e) {
    if ("label" in e && typeof e.label === "string") {
      return e.label;
    }
    if (e.type === "local_agent") {
      return e.progress?.summary;
    }
    if (e.type === "local_bash" && e.kind !== "monitor") {
      return e.command;
    }
    if (e.type === "local_workflow") {
      return e.workflowName ?? e.summary;
    }
    if (e.type === "remote_agent") {
      return e.title;
    }
    if (e.type === "in_process_teammate") {
      return Zwt(e);
    }
    return;
  }
  function BXo() {
    let e = $_() ? getSettingsForSource("policySettings")?.subagentStatusLine : getSettingsAfterPluginLoad("subagentStatusLine");
    return e?.type === "command" ? e.command : undefined;
  }
  async function Pxc(e, t, n, r) {
    if (rq()) {
      return {};
    }
    if (shouldSkipHookDueToTrust()) {
      logForDebugging("Skipping subagentStatusLine execution - workspace trust not accepted");
      return {};
    }
    let o = BXo();
    if (o === undefined || e.length === 0) {
      return {};
    }
    let s = Nt();
    let i = {
      ...createBaseHookInput(),
      columns: t,
      tasks: e.map(h => ({
        id: h.id,
        name: n.get(h.id),
        type: h.type,
        status: h.status,
        description: h.description,
        label: txf(h) || h.description,
        startTime: h.startTime,
        tokenCount: h.progress?.tokenCount ?? 0,
        tokenSamples: r.get(h.id) ?? [],
        cwd: h.cwd ?? s
      }))
    };
    let a = Wt() === "windows";
    let l = a ? Cye() : null;
    let c = a && !l ? await qV() : null;
    let u = a && l ? h => h.replaceAll("\\", "/") : h => h;
    let d = {
      ...subprocessEnv(),
      ...vmt(I5e(i)),
      CLAUDE_PROJECT_DIR: u(getProjectRoot())
    };
    if (l) {
      Qhn(d, l);
    }
    let p = {
      cwd: s,
      env: d,
      timeout: 5000,
      input: De(i),
      preserveOutputOnError: true
    };
    let m = c ? await execFileNoThrowWithCwd(c, gGt(o), {
      ...p
    }) : await execFileNoThrowWithCwd(l ? Zhn(o) : o, [], {
      shell: a ? l ?? true : true,
      ...p
    });
    if (m.code !== 0) {
      logForDebugging(`subagentStatusLine exited ${m.code}: ${m.error ?? m.stderr}`, {
        level: "error"
      });
      return {};
    }
    let f = {};
    for (let h of m.stdout.split(`
`)) {
      if (!h.trim()) {
        continue;
      }
      let g;
      try {
        g = qt(h);
      } catch {
        logForDebugging(`subagentStatusLine emitted non-JSON line: ${h}`, {
          level: "error"
        });
        continue;
      }
      let y = exf().safeParse(g);
      if (!y.success) {
        logForDebugging(`subagentStatusLine emitted invalid schema: ${y.error.message}`, {
          level: "error"
        });
        continue;
      }
      f[y.data.id] = {
        content: y.data.content
      };
    }
    return f;
  }
  var exf;
  var Oxc = __lazy(() => {
    at();
    lCe();
    lqn();
    vo();
    je();
    ji();
    i1();
    Sp();
    Cs();
    cMe();
    _qn();
    s1();
    wj();
    exf = we(() => v.object({
      id: v.string(),
      content: v.string()
    }));
  });
  function rxf(e, t) {
    let n = Object.keys(e);
    let r = Object.keys(t);
    if (n.length !== r.length) {
      return false;
    }
    for (let o of n) {
      if (e[o]?.content !== t[o]?.content) {
        return false;
      }
    }
    return true;
  }
  function $Xo(e) {
    return Object.values(e).filter(t => j$(t) && t.evictAfter !== 0);
  }
  function Mxc() {
    let e = Ec();
    let t = Lo();
    let r = bt(c => c.settings?.subagentStatusLine?.command !== undefined) && (!$_() || BXo() !== undefined);
    let o = bt(c => r ? $Xo(c.tasks).length : 0);
    let {
      columns: s
    } = Sr();
    let i = useClock();
    let a = Vrn.useRef(false);
    let l = Vrn.useRef(new Map());
    Vrn.useEffect(() => {
      if (!r) {
        t(m => Object.keys(m.taskDecorations).length === 0 ? m : {
          ...m,
          taskDecorations: {}
        });
        return;
      }
      let c = false;
      let u = () => {
        if (a.current) {
          return;
        }
        let m = e.getState();
        let f = $Xo(m.tasks);
        if (Ixc(l.current, f.map(g => ({
          id: g.id,
          tokenCount: g.progress?.tokenCount ?? 0
        }))), f.length === 0) {
          t(g => Object.keys(g.taskDecorations).length === 0 ? g : {
            ...g,
            taskDecorations: {}
          });
          return;
        }
        a.current = true;
        let h = new Map();
        for (let [g, y] of m.agentNameRegistry) {
          h.set(y, g);
        }
        Pxc(f, Math.max(0, s - qrn()), h, l.current).then(g => {
          if (c) {
            return;
          }
          t(y => {
            let _ = new Set(f.map(S => S.id));
            let b = {};
            for (let [S, E] of Object.entries(g)) {
              if (_.vZc(S)) {
                b[S] = E;
              }
            }
            return rxf(y.taskDecorations, b) ? y : {
              ...y,
              taskDecorations: b
            };
          });
        }).catch(g => {
          logForDebugging(`subagentStatusLine tick failed: ${g}`, {
            level: "error"
          });
        }).finally(() => {
          if (a.current = false, $Xo(e.getState().tasks).length === 0) {
            u();
          }
        });
      };
      if (o === 0) {
        u();
        return;
      }
      let d = i.setTimeout(u, 300);
      let p = i.setTimeout(function m() {
        try {
          u();
        } finally {
          p = i.setTimeout(m, 5000);
        }
      }, 5000);
      return () => {
        c = true;
        d();
        p();
      };
    }, [r, o, s, e, t, i]);
  }
  var Vrn;
  var Nxc = __lazy(() => {
    oxt();
    ki();
    et();
    ho();
    ry();
    je();
    i1();
    Oxc();
    Vrn = __toESM(ot(), 1);
  });
  function oxf(e) {
    let t = Lxc.c(12);
    let {
      value: n,
      onChange: r,
      historyFailedMatch: o
    } = e;
    let s = o ? "no matching prompt:" : "search prompts:";
    let i;
    if (t[0] !== s) {
      i = ixt.jsx(Text, {
        dimColor: true,
        children: s
      });
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = an(n) + 1;
    let l;
    if (t[2] !== r || t[3] !== a || t[4] !== n) {
      l = ixt.jsx(Dl, {
        value: n,
        onChange: r,
        cursorOffset: n.length,
        onChangeCursorOffset: sxf,
        columns: a,
        focus: true,
        showCursor: true,
        multiline: false,
        dimColor: true
      });
      t[2] = r;
      t[3] = a;
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== n) {
      c = mL() && n === "" && ixt.jsx(Text, {
        dimColor: true,
        children: "esc i / for slash commands"
      });
      t[6] = n;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== i || t[9] !== l || t[10] !== c) {
      u = ixt.jsxs(gXd, {
        gap: 1,
        children: [i, l, c]
      });
      t[8] = i;
      t[9] = l;
      t[10] = c;
      t[11] = u;
    } else {
      u = t[11];
    }
    return u;
  }
  function sxf() {}
  var Lxc;
  var ixt;
  function $xc() {
    let [e, t] = Khr.useState(null);
    Khr.useEffect(() => {
      if (!li() || va()) {
        return;
      }
      let n = dc(fT());
      let r;
      let o = async () => {
        let i = (await Zi(n))?.children?.find(l => l.kind !== "frame");
        let a = i ? Number(i.id) : NaN;
        if (!i || !Number.isFinite(a)) {
          return;
        }
        t(l => l?.number === a && l.url === i.href ? l : {
          number: a,
          url: i.href
        });
      };
      try {
        r = Bxc.watch(n, (s, i) => {
          if (i && !i.startsWith("state.json")) {
            return;
          }
          o();
        });
        r.on("error", s => logForDebugging(`[useBgSessionPr] watcher error: ${he(s)}`, {
          level: "warn"
        }));
        r.unref();
      } catch (s) {
        logForDebugging(`[useBgSessionPr] watch skipped: ${he(s)}`);
      }
      o();
      return () => r?.close();
    }, []);
    return e;
  }
  var Bxc;
  var Khr;
  var Hxc = __lazy(() => {
    zf();
    ru();
    yd();
    je();
    dt();
    Bxc = require("fs");
    Khr = __toESM(ot(), 1);
  });
  function qxc(e) {
    let t = bt(r => r.footerLinks);
    let n = e?.excludeKeyed === true;
    return jxc.useMemo(() => {
      let r = n ? t.filter(o => o.key === undefined) : t;
      return r.length <= 5 ? r : r.slice(0, 5);
    }, [t, n]);
  }
  var jxc;
  var Wxc = __lazy(() => {
    ho();
    ufr();
    jxc = __toESM(ot(), 1);
  });
  function Gxc(e, t = true) {
    let [n, r] = kee.useState(dxf);
    let [o, s] = kee.useState(0);
    let i = kee.useRef(null);
    let a = kee.useRef(0);
    let l = kee.useRef(0);
    let c = useClock();
    let u = useTerminalFocus();
    let d = kee.useRef(u);
    d.current = u;
    kee.useEffect(() => {
      if (!CWt()) {
        return;
      }
      if (!u || yoe.disabled) {
        return;
      }
      if (a.current === 0) {
        return;
      }
      if (Date.now() - a.current < 1e4) {
        return;
      }
      l.current = 0;
      a.current = 0;
      s(p => p + 1);
    }, [u]);
    kee.useEffect(() => g5e.subscribe(() => {
      if (yoe.disabled) {
        return;
      }
      l.current = 0;
      a.current = 0;
      s(p => p + 1);
    }), []);
    kee.useEffect(() => {
      if (!t) {
        return;
      }
      if (yoe.disabled) {
        return;
      }
      let p = false;
      let m = -1;
      let f = Date.now();
      function h(b) {
        if (!CWt()) {
          return 60000;
        }
        return mxf(d.current, Date.now() - getLastInteractionTime(), b ? 0 : l.current);
      }
      async function g() {
        if (p) {
          return;
        }
        let b = getLastInteractionTime();
        if (m !== b) {
          m = b;
          f = Date.now();
        } else if (Date.now() - f >= 3600000) {
          return;
        }
        let S = Date.now();
        let E;
        try {
          E = await yka();
        } catch (O) {
          Oe(O);
          E = null;
        }
        let C = E;
        if (p) {
          return;
        }
        a.current = S;
        let x = C === "needs-auth";
        let A = C === "fetch-failed";
        let k = x || A ? null : C;
        if (l.current = x ? 1 : k === null ? l.current + 1 : 0, yoe.badStreak = A ? yoe.badStreak + 1 : 0, r(O => {
          if (O.lastUpdated > 0 && O.pr?.number === k?.number && O.pr?.url === k?.url && O.pr?.reviewState === k?.reviewState && O.pr?.kind === k?.kind && O.needsAuth === x) {
            return O;
          }
          return {
            pr: k,
            needsAuth: x,
            lastUpdated: Date.now()
          };
        }), yoe.badStreak >= 3) {
          yoe.disabled = true;
          Et("github_pr_status_direct", "bad_streak_disabled");
          return;
        }
        let I = Date.now() - S;
        if (I > 4000) {
          if (yoe.disabled = true, CWt()) {
            Et("github_pr_status_direct", "slow_disabled", {
              elapsed_ms: I
            });
          }
          return;
        }
        if (!p) {
          i.current = c.setTimeout(g, h(false));
        }
      }
      let y = h(true);
      let _ = Date.now() - a.current;
      if (_ >= y) {
        g();
      } else {
        i.current = c.setTimeout(g, y - _);
      }
      return () => {
        if (p = true, i.current) {
          i.current();
          i.current = null;
        }
      };
    }, [e, t, o, c]);
    return n;
  }
  function mxf(e, t, n) {
    let r = t < 30000 ? 90000 : t < 300000 ? 180000 : t < 1800000 ? 600000 : 1800000;
    let o = n <= 0 ? 90000 : n === 1 ? 300000 : n === 2 ? 900000 : 1800000;
    return Math.max(r, o, e ? 0 : 300000);
  }
  var kee;
  var dxf;
  var Vxc = __lazy(() => {
    at();
    vPe();
    et();
    ln();
    omt();
    Rn();
    kee = __toESM(ot(), 1);
    dxf = {
      pr: null,
      needsAuth: false,
      lastUpdated: 0
    };
  });
  function Yhr() {
    let e = bt(r => r.fileHistory.trackSequence ?? 0);
    let t = bt(r => r.replTab);
    let n = Nt();
    return zxc.useMemo(() => zYo(), [n, e, t]);
  }
  var zxc;
  var HXo = __lazy(() => {
    ho();
    vo();
    MBe();
    zxc = __toESM(ot(), 1);
  });
  function Yxc(e) {
    let t = Jhr.c(57);
    let {
      exitMessage: n,
      leftArrowDetachAvailable: r,
      vimMode: o,
      hideVimModeIndicator: s,
      mode: i,
      toolPermissionContext: a,
      suppressHint: l,
      suppressHintExceptStatusline: c,
      isInputEmpty: u,
      isLoading: d,
      isExternalLoading: p,
      betweenCalls: m,
      tasksSelected: f,
      tmuxSelected: h,
      isPasting: g,
      showExpandPasteHint: y,
      isSearching: _,
      historyQuery: b,
      setHistoryQuery: S,
      historyFailedMatch: E,
      onOpenTasksDialog: C
    } = e;
    let x = c === undefined ? l : c;
    let A = p === undefined ? false : p;
    let k = m === undefined ? true : m;
    Mxc();
    let I = KNn();
    let O;
    if (t[0] !== I) {
      O = Sxf(I) && !va();
      t[0] = I;
      t[1] = O;
    } else {
      O = t[1];
    }
    let M = O;
    let L = Gxc(d, M);
    let P = $xc();
    let F;
    if (t[2] !== P || t[3] !== L.pr || t[4] !== M) {
      F = M && L.pr ? L.pr : P ? {
        number: P.number,
        url: P.url,
        reviewState: undefined,
        kind: undefined
      } : null;
      t[2] = P;
      t[3] = L.pr;
      t[4] = M;
      t[5] = F;
    } else {
      F = t[5];
    }
    let H = F;
    let U = !H && M && L.needsAuth;
    let N = bt(gxf);
    let W;
    if (t[6] !== H || t[7] !== N) {
      W = H ? RWt(H.url, N) : undefined;
      t[6] = H;
      t[7] = N;
      t[8] = W;
    } else {
      W = t[8];
    }
    PTl(W, H?.url, H?.kind);
    let j = Lo();
    let z = H?.number;
    let V = H?.url;
    let K = H?.reviewState;
    let J = H?.kind;
    let Q = L.lastUpdated > 0 || yoe.disabled;
    let Z;
    let ne;
    if (t[9] !== J || t[10] !== z || t[11] !== K || t[12] !== V || t[13] !== Q || t[14] !== N || t[15] !== j) {
      Z = () => {
        j(ue => {
          let ce = !Q && ue.prStatus !== null && (z === undefined || z === ue.prStatus.number && ue.prStatus.kind === J && K === undefined && ue.prStatus.reviewState !== undefined);
          let le = ue.prStatus?.number === z && ue.prStatus?.url === V && ue.prStatus?.reviewState === K && ue.prStatus?.kind === J;
          let pe = ce || le ? ue.prStatus : z !== undefined && V !== undefined ? {
            number: z,
            url: V,
            reviewState: K,
            kind: J
          } : null;
          let ve = Bbc(ue.footerLinks, "current-pr", ITl(pe, pe ? pe.kind === "cr" ? pe.url : RWt(pe.url, N) : undefined));
          if (pe === ue.prStatus && ve === ue.footerLinks) {
            return ue;
          }
          return {
            ...ue,
            prStatus: pe,
            footerLinks: ve
          };
        });
      };
      ne = [z, V, K, J, Q, N, j];
      t[9] = J;
      t[10] = z;
      t[11] = K;
      t[12] = V;
      t[13] = Q;
      t[14] = N;
      t[15] = j;
      t[16] = Z;
      t[17] = ne;
    } else {
      Z = t[16];
      ne = t[17];
    }
    jK.useEffect(Z, ne);
    let oe;
    let ee;
    if (t[18] !== U || t[19] !== j) {
      ee = () => {
        j(ue => ue.prNeedsAuth === U ? ue : {
          ...ue,
          prNeedsAuth: U
        });
      };
      oe = [U, j];
      t[18] = U;
      t[19] = j;
      t[20] = oe;
      t[21] = ee;
    } else {
      oe = t[20];
      ee = t[21];
    }
    if (jK.useEffect(ee, oe), n.show) {
      let ue = n.action === "clear" ? "/clear" : li() || LD("catchupReplay") ? "detach (session keeps running)" : "exit";
      let ce;
      if (t[22] !== n.key || t[23] !== ue) {
        ce = di.jsxs(Text, {
          dimColor: true,
          children: ["Press ", n.key, " again to", " ", ue]
        }, "exit-message");
        t[22] = n.key;
        t[23] = ue;
        t[24] = ce;
      } else {
        ce = t[24];
      }
      return ce;
    }
    if (g) {
      let ue;
      if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
        ue = di.jsx(Text, {
          dimColor: true,
          children: "Pasting\u2026"
        }, "pasting-message");
        t[25] = ue;
      } else {
        ue = t[25];
      }
      return ue;
    }
    if (y && !_) {
      let ue;
      if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
        ue = di.jsx(Text, {
          dimColor: true,
          children: "paste again to expand"
        }, "expand-paste-hint");
        t[26] = ue;
      } else {
        ue = t[26];
      }
      return ue;
    }
    let re;
    if (t[27] !== s || t[28] !== _ || t[29] !== o) {
      re = mL() && !s && o !== "NORMAL" && !_;
      t[27] = s;
      t[28] = _;
      t[29] = o;
      t[30] = re;
    } else {
      re = t[30];
    }
    let se = re;
    let ae;
    if (t[31] !== E || t[32] !== b || t[33] !== _ || t[34] !== S) {
      ae = _ && di.jsx(oxf, {
        value: b,
        onChange: S,
        historyFailedMatch: E
      });
      t[31] = E;
      t[32] = b;
      t[33] = _;
      t[34] = S;
      t[35] = ae;
    } else {
      ae = t[35];
    }
    let de;
    if (t[36] !== se || t[37] !== o) {
      de = se ? di.jsxs(Text, {
        dimColor: true,
        children: ["-- ", o, " --"]
      }, "vim-indicator") : null;
      t[36] = se;
      t[37] = o;
      t[38] = de;
    } else {
      de = t[38];
    }
    let be = !l && !se;
    let fe = !x && !se;
    let me;
    if (t[39] !== k || t[40] !== A || t[41] !== u || t[42] !== d || t[43] !== r || t[44] !== i || t[45] !== C || t[46] !== U || t[47] !== be || t[48] !== fe || t[49] !== f || t[50] !== h || t[51] !== a) {
      me = di.jsx(yxf, {
        mode: i,
        toolPermissionContext: a,
        showHint: be,
        denseShowHint: fe,
        isInputEmpty: u,
        isLoading: d,
        isExternalLoading: A,
        betweenCalls: k,
        leftArrowDetachAvailable: r,
        tasksSelected: f,
        tmuxSelected: h,
        onOpenTasksDialog: C,
        prNeedsAuth: U
      });
      t[39] = k;
      t[40] = A;
      t[41] = u;
      t[42] = d;
      t[43] = r;
      t[44] = i;
      t[45] = C;
      t[46] = U;
      t[47] = be;
      t[48] = fe;
      t[49] = f;
      t[50] = h;
      t[51] = a;
      t[52] = me;
    } else {
      me = t[52];
    }
    let Te;
    if (t[53] !== ae || t[54] !== de || t[55] !== me) {
      Te = di.jsxs(gXd, {
        justifyContent: "flex-start",
        gap: 1,
        children: [ae, de, me]
      });
      t[53] = ae;
      t[54] = de;
      t[55] = me;
      t[56] = Te;
    } else {
      Te = t[56];
    }
    return Te;
  }
  function gxf(e) {
    return e.settings?.prUrlTemplate;
  }
  function yxf({
    mode: e,
    toolPermissionContext: t,
    showHint: n,
    denseShowHint: r,
    isInputEmpty: o,
    isLoading: s,
    isExternalLoading: i,
    betweenCalls: a,
    leftArrowDetachAvailable: l,
    tasksSelected: c,
    tmuxSelected: u,
    onOpenTasksDialog: d,
    prNeedsAuth: p
  }) {
    let {
      columns: m
    } = Sr();
    bKe();
    let f = getFeatureValue_CACHED_MAY_BE_STALE("tengu_copper_thistle", false);
    let h = Zu("chat:cycleMode", "Chat", "shift+tab");
    let g = bt(Be => Be.tasks);
    let y = bt(Be => Be.taskDecorations);
    let _ = bt(Be => Be.footerSelection === "tasks" && Be.coordinatorTaskIndex >= 0 || Be.footerSelection === "workflows");
    let b = bt(Be => Be.footerSelection !== null);
    let S = bt(Be => Be.viewSelectionMode);
    let E = bt(Be => Be.viewingAgentTaskId);
    let C = bt(Be => Be.expandedView);
    let x = qxc({
      excludeKeyed: f
    });
    let A = bt(Be => false);
    let k = Rhe();
    let I = useVoiceState(Be => Be.voiceState);
    let O = useVoiceState(Be => Be.voiceWarmingUp);
    let M = v7i();
    let L = useSelection().getState;
    let P = fxf?.isCoordinatorMode() === true;
    let F = jK.useMemo(() => Bn(Object.values(g), eCt), [g]);
    let H = dKt();
    let U = H !== undefined && H.length > 0;
    let N = Zu("chat:cancel", "Chat", "esc").toLowerCase();
    let W = Zu("app:toggleTodos", "Global", "ctrl+t");
    let j = Zu("voice:pushToTalk", "Chat", "space");
    let [z] = jK.useState(() => (getGlobalConfig().voiceFooterHintSeenCount ?? 0) < 3);
    let V = jK.useRef(false);
    jK.useEffect(() => {
      {
        if (!k || !z) {
          return;
        }
        if (V?.current) {
          return;
        }
        if (V) {
          V.current = true;
        }
        let Be = (getGlobalConfig().voiceFooterHintSeenCount ?? 0) + 1;
        saveGlobalConfig(We => {
          if ((We.voiceFooterHintSeenCount ?? 0) >= Be) {
            return We;
          }
          return {
            ...We,
            voiceFooterHintSeenCount: Be
          };
        });
      }
    }, [k, z, V]);
    let K = useIsScreenReaderEnabled();
    let J = Yhr();
    if (e === "bash") {
      return di.jsx(Text, {
        color: "bashBorder",
        children: "! for shell mode"
      });
    }
    let Q = t?.mode;
    let Z = !XPs(Q);
    let ne = E ? g[E] : undefined;
    let oe = S === "viewing-agent" && ne?.type === "in_process_teammate";
    let ee = oe && ne != null && ne.status !== "running";
    let re = F > 0;
    let se = (P || Z ? 1 : 0) + (re ? 1 : 0);
    let ae = !f && p && !x.some(Be => Be.key === "current-pr") ? di.jsx(Text, {
      dimColor: true,
      children: "gh auth login"
    }, "pr-status") : null;
    let de = null;
    let be = se < 2 && !((ae || x.length > 0) && m < 60 + (de ? 8 : 0)) && !(de && m < 56);
    let fe = Ul();
    let me = fe ? LD("setPermissionMode") && !fe.viewerOnly : !va();
    let Te = !K && E === undefined && Txf(m, J);
    if (_) {
      return di.jsx(gXd, {
        height: 1,
        overflow: "hidden",
        children: di.jsx(rxc, {})
      });
    }
    if (f) {
      let Be = F;
      let We = Be >= 2;
      let Ze = F >= 1;
      let Tt = !!Q && Z && me;
      let kt = false;
      let Ye = khe(g, y, E).length > 0 || E !== undefined && xee(g[E]);
      let ht = l && !oe && o && !b;
      let It = k && I === "idle" && z && n;
      let Rt = "none";
      if (k && O) {
        Rt = "warmup";
      } else if (ee) {
        Rt = "interrupt";
      } else if (!r) {
        Rt = "none";
      } else if (s && !M) {
        Rt = ht && !K ? "interrupt_agents" : "interrupt";
      } else if ((Ze || Ye) && !_) {
        Rt = "manage";
      } else if (U) {
        Rt = "ctrl_t";
      } else if (ht && !K) {
        Rt = "agents";
      } else if (It) {
        Rt = "voice";
      } else if (Tt) {
        Rt = "cycle";
      } else {
        Rt = n && !K ? "shortcuts" : "none";
      }
      let wt = C === "tasks" ? "hide tasks" : "show tasks";
      let vt = Rt === "cycle" ? di.jsxs(Text, {
        dimColor: true,
        children: [" ", di.jsx(xt, {
          chord: h,
          action: "cycle",
          parens: true,
          format: {
            keyCase: "lower"
          }
        })]
      }) : null;
      let yt = Rt === "manage" && Ze ? di.jsxs(Text, {
        dimColor: true,
        children: [" ", c ? di.jsx(xt, {
          chord: "enter",
          action: "view tasks",
          parens: true
        }) : di.jsx(xt, {
          chord: "down",
          action: "manage",
          parens: true
        })]
      }) : null;
      let gt = null;
      if (Rt === "warmup") {
        gt = di.jsx(VoiceWarmupHint, {}, "voice-warmup");
      } else if (Rt === "manage" && !Ze) {
        gt = di.jsx(Text, {
          dimColor: true,
          children: c ? di.jsx(xt, {
            chord: "enter",
            action: "view tasks"
          }) : di.jsx(xt, {
            chord: "down",
            action: "manage"
          })
        });
      } else if (Rt === "interrupt" || Rt === "interrupt_agents") {
        gt = di.jsxs(Text, {
          dimColor: true,
          children: [di.jsx(xt, {
            chord: N,
            action: ee ? "return to team lead" : "interrupt",
            format: {
              keyCase: "lower"
            }
          }), Rt === "interrupt_agents" && di.jsxs(di.Fragment, {
            children: [" \xB7 ", "\u2190", " for agents"]
          })]
        });
      } else if (Rt === "ctrl_t") {
        gt = di.jsx(Text, {
          dimColor: true,
          children: di.jsx(xt, {
            chord: W,
            action: wt,
            format: {
              keyCase: "lower"
            }
          })
        });
      } else if (Rt === "agents") {
        gt = di.jsxs(Text, {
          dimColor: true,
          children: ["\u2190", " for agents"]
        });
      } else if (Rt === "voice") {
        gt = di.jsxs(Text, {
          dimColor: true,
          children: ["hold ", j, " to speak"]
        });
      } else if (Rt === "shortcuts") {
        gt = di.jsx(Text, {
          dimColor: true,
          children: "? for shortcuts"
        });
      }
      let Ft = Tt && Q ? di.jsxs(Text, {
        color: dF(Q),
        children: [di.jsxs(Text, {
          "aria-hidden": true,
          children: [Lnt(Q), " "]
        }), mY(Q).toLowerCase(), " on", vt]
      }, "mode") : null;
      let on = null;
      let rn = Ze ? We ? di.jsx(_xf, {
        count: Be,
        selected: c,
        onClick: d
      }) : di.jsx(UXo, {
        tasksSelected: c,
        onOpenDialog: d
      }) : null;
      if (!Ft && !on && !rn && x.length === 0 && !gt) {
        return qs() ? di.jsx(Text, {
          children: " "
        }) : null;
      }
      let Sn = rn || x.length > 0 || gt;
      return di.jsxs(gXd, {
        height: 1,
        overflow: "hidden",
        children: [Ft && di.jsxs(gXd, {
          flexShrink: 0,
          children: [Ft, (on || Sn) && di.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          })]
        }), on && di.jsxs(gXd, {
          flexShrink: 0,
          children: [on, Sn && di.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          })]
        }), rn && di.jsxs(gXd, {
          flexShrink: 0,
          children: [rn, yt, (x.length > 0 || gt) && di.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          })]
        }), x.map((jn, Xr) => di.jsxs(gXd, {
          flexShrink: 0,
          children: [di.jsx(Kxc, {
            link: jn
          }), (Xr < x.length - 1 || !!gt) && di.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          })]
        }, jn.url)), gt && di.jsx(Text, {
          wrap: "truncate",
          children: gt
        }), null]
      });
    }
    let ue = Q && Z && me ? di.jsxs(Text, {
      color: dF(Q),
      children: [di.jsxs(Text, {
        "aria-hidden": true,
        children: [Lnt(Q), " "]
      }), mY(Q).toLowerCase(), " on", be && di.jsxs(Text, {
        dimColor: true,
        children: [" ", di.jsx(xt, {
          chord: h,
          action: "cycle",
          parens: true,
          format: {
            keyCase: "lower"
          }
        })]
      })]
    }, "mode") : null;
    let ce = x.map(Be => di.jsx(Kxc, {
      link: Be
    }, Be.key ?? Be.url));
    let le = [...[]];
    let pe = n ? bxf(s, N, W, U, C, M) : [];
    if (ee) {
      le.push(di.jsx(Text, {
        dimColor: true,
        children: di.jsx(xt, {
          chord: N,
          action: "return to team lead",
          format: {
            keyCase: "lower"
          }
        })
      }, "esc-return"));
    } else if (n) {
      le.push(...pe);
    }
    let ve = (li() || getIsRemoteMode()) && l && o && !b && !K ? di.jsxs(Text, {
      dimColor: true,
      children: ["\u2190", " for agents"]
    }, "bg-detach") : null;
    let xe = !oe && o && !b && Dnr(yEt({
      isBg: li(),
      isLoading: s,
      isExternalLoading: i,
      betweenCalls: a,
      inFlight: {
        count: 0,
        kinds: []
      }
    })) && getGlobalConfig().leftArrowOpensAgents !== false && !K ? di.jsxs(Text, {
      dimColor: true,
      children: ["\u2190", " for agents"]
    }, "fg-agents") : null;
    let ke = khe(g, y, E).length > 0 || E !== undefined && xee(g[E]);
    let Ie = re ? di.jsx(UXo, {
      tasksSelected: c,
      onOpenDialog: d
    }) : null;
    if (le.length === 0 && !Ie && !ue && !ae && ce.length === 0 && !ve && n) {
      if (!K) {
        le.push(di.jsx(Text, {
          dimColor: true,
          children: "? for shortcuts"
        }, "shortcuts-hint"));
      }
    }
    if (xe) {
      le.push(xe);
    }
    let Ue = getGlobalConfig().copyOnSelect ?? true;
    let Ge = M && (!Ue || Rb());
    if (k && O) {
      le.push(di.jsx(VoiceWarmupHint, {}, "voice-warmup"));
    } else if (qs() && Ge) {
      let Be = Wt() === "macos";
      let We = Be && (L()?.lastPressHadAlt ?? false);
      le.push(di.jsx(Text, {
        dimColor: true,
        children: di.jsxs(Hn, {
          children: [!Ue && di.jsx(xt, {
            chord: "ctrl+c",
            action: "copy"
          }), Rb() && (We ? di.jsx(Text, {
            children: "set macOptionClickForcesSelection in VS Code settings"
          }) : di.jsxs(Text, {
            children: [Be ? "option+click" : "shift+click", " to native select"]
          }))]
        })
      }, "selection-copy"));
    } else if (le.length > 0 && n && k && I === "idle" && pe.length === 0 && z) {
      le.push(di.jsxs(Text, {
        dimColor: true,
        children: ["hold ", j, " to speak"]
      }, "voice-hint"));
    }
    if ((Ie || ke) && n && !_) {
      le.push(di.jsx(Text, {
        dimColor: true,
        children: c ? di.jsx(xt, {
          chord: "enter",
          action: "view tasks"
        }) : di.jsx(xt, {
          chord: "down",
          action: "manage"
        })
      }, "manage-tasks"));
    }
    if (le.length === 0 && !Ie && !ue && !de && !ae && ce.length === 0 && !ve) {
      return qs() ? di.jsx(Text, {
        children: " "
      }) : null;
    }
    return di.jsxs(gXd, {
      height: 1,
      overflow: "hidden",
      children: [ue && di.jsxs(gXd, {
        flexShrink: 0,
        children: [ue, (de || ve || ae || ce.length > 0 || Ie || le.length > 0) && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), de && di.jsxs(gXd, {
        flexShrink: 0,
        children: [de, (ve || ae || ce.length > 0 || Ie || le.length > 0) && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), ve && di.jsxs(gXd, {
        flexShrink: 0,
        children: [ve, (ae || ce.length > 0 || Ie || le.length > 0) && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), ae && di.jsxs(gXd, {
        flexShrink: 0,
        children: [ae, (ce.length > 0 || Ie || le.length > 0) && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), ce.length > 0 && di.jsxs(gXd, {
        flexShrink: 0,
        children: [di.jsx(Hn, {
          children: ce
        }), (Ie || le.length > 0) && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), Ie && di.jsxs(gXd, {
        flexShrink: 0,
        children: [Ie, le.length > 0 && di.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        })]
      }), le.length > 0 && di.jsx(Text, {
        wrap: "truncate",
        children: di.jsx(Hn, {
          children: le
        })
      })]
    });
  }
  function bxf(e, t, n, r, o, s) {
    let i = o === "tasks" ? "hide tasks" : "show tasks";
    let a = r;
    return [...(e && !s ? [di.jsx(Text, {
      dimColor: true,
      children: di.jsx(xt, {
        chord: t,
        action: "interrupt",
        format: {
          keyCase: "lower"
        }
      })
    }, "esc")] : []), ...(a ? [di.jsx(Text, {
      dimColor: true,
      children: di.jsx(xt, {
        chord: n,
        action: i,
        format: {
          keyCase: "lower"
        }
      })
    }, "toggle-tasks")] : [])];
  }
  function Sxf(e) {
    if (li() && e === "unknown") {
      return false;
    }
    return getGlobalConfig().prStatusFooterEnabled ?? true;
  }
  function Kxc(e) {
    let t = Jhr.c(17);
    let {
      link: n
    } = e;
    let r;
    if (t[0] !== n.prefix) {
      r = n.prefix !== undefined && di.jsxs(di.Fragment, {
        children: [di.jsx(Text, {
          dimColor: true,
          children: n.prefix
        }), " "]
      });
      t[0] = n.prefix;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = !n.color;
    let s;
    if (t[2] !== n.color || t[3] !== n.label || t[4] !== o) {
      s = di.jsx(Text, {
        color: n.color,
        dimColor: o,
        children: n.label
      });
      t[2] = n.color;
      t[3] = n.label;
      t[4] = o;
      t[5] = s;
    } else {
      s = t[5];
    }
    let i = !n.color;
    let a;
    if (t[6] !== n.color || t[7] !== n.label || t[8] !== i) {
      a = di.jsx(Text, {
        color: n.color,
        dimColor: i,
        underline: true,
        children: n.label
      });
      t[6] = n.color;
      t[7] = n.label;
      t[8] = i;
      t[9] = a;
    } else {
      a = t[9];
    }
    let l;
    if (t[10] !== n.url || t[11] !== s || t[12] !== a) {
      l = di.jsx(Link, {
        url: n.url,
        fallback: s,
        assumeSupport: false,
        children: a
      });
      t[10] = n.url;
      t[11] = s;
      t[12] = a;
      t[13] = l;
    } else {
      l = t[13];
    }
    let c;
    if (t[14] !== r || t[15] !== l) {
      c = di.jsxs(Text, {
        children: [r, l]
      });
      t[14] = r;
      t[15] = l;
      t[16] = c;
    } else {
      c = t[16];
    }
    return c;
  }
  function Txf(e, t) {
    return qs() && !getIsRemoteMode() && e >= 110 && t;
  }
  var Jhr;
  var jK;
  var di;
  var fxf;
  var _xf;
  var Jxc = __lazy(() => {
    et();
    _ue();
    oUe();
    c0();
    HT();
    kxc();
    lCe();
    oxt();
    Nxc();
    ho();
    ru();
    at();
    yd();
    p7e();
    wl();
    $n();
    $Y();
    Hxc();
    Wxc();
    yQn();
    rNo();
    ufr();
    omt();
    Vxc();
    DPe();
    vPe();
    bs();
    Ai();
    ki();
    kJn();
    Ehr();
    Nrn();
    dSe();
    zp();
    MBe();
    HXo();
    mT();
    JWe();
    Cs();
    Jhr = __toESM(pt(), 1);
    jK = __toESM(ot(), 1);
    di = __toESM(ie(), 1);
    fxf = (N1(), __toCommonJS(DG));
    _xf = jK.memo(function (t) {
      let n = Jhr.c(11);
      let {
        count: r,
        selected: o,
        onClick: s
      } = t;
      let [i, a] = jK.useState(false);
      let l = o || i;
      let c;
      if (n[0] === Symbol.for("react.memo_cache_sentinel")) {
        c = di.jsxs(Text, {
          "aria-hidden": true,
          children: ["\u21B3", " "]
        });
        n[0] = c;
      } else {
        c = n[0];
      }
      let u;
      if (n[1] !== r || n[2] !== l) {
        u = di.jsxs(Text, {
          color: "background",
          inverse: l,
          children: [c, r, " background"]
        });
        n[1] = r;
        n[2] = l;
        n[3] = u;
      } else {
        u = n[3];
      }
      let d = u;
      if (!s) {
        return d;
      }
      let p;
      if (n[4] !== s) {
        p = () => s();
        n[4] = s;
        n[5] = p;
      } else {
        p = n[5];
      }
      let m;
      let f;
      if (n[6] === Symbol.for("react.memo_cache_sentinel")) {
        m = () => a(true);
        f = () => a(false);
        n[6] = m;
        n[7] = f;
      } else {
        m = n[6];
        f = n[7];
      }
      let h;
      if (n[8] !== d || n[9] !== p) {
        h = di.jsx(gXd, {
          onClick: p,
          onMouseEnter: m,
          onMouseLeave: f,
          children: d
        });
        n[8] = d;
        n[9] = p;
        n[10] = h;
      } else {
        h = n[10];
      }
      return h;
    });
  });
  function WXo() {
    if (jXo === undefined) {
      jXo = (getGlobalConfig().seenNotifications?.[qXo] ?? 0) < 5;
    }
    return jXo;
  }
  function Qxc() {
    if (Xxc) {
      return;
    }
    if (!WXo()) {
      return;
    }
    Xxc = true;
    saveGlobalConfig(e => {
      let t = e.seenNotifications ?? {};
      return {
        ...e,
        seenNotifications: {
          ...t,
          ["rc-active-badge"]: (t["rc-active-badge"] ?? 0) + 1
        }
      };
    });
  }
  var Xxc = false;
  var jXo;
  var Zxc = __lazy(() => {});
  function Xhr(e) {
    return ekc.useMemo(() => {
      let t = e.find(o => o.name === "ide");
      if (!t) {
        return {
          status: null,
          ideName: null
        };
      }
      let n = t.config;
      let r = n.type === "sse-ide" || n.type === "ws-ide" ? n.ideName : null;
      if (t.type === "connected") {
        return {
          status: "connected",
          ideName: r
        };
      }
      if (t.type === "pending") {
        return {
          status: "pending",
          ideName: r
        };
      }
      return {
        status: "disconnected",
        ideName: r
      };
    }, [e]);
  }
  var ekc;
  var GXo = __lazy(() => {
    ekc = __toESM(ot(), 1);
  });
  function wxf(e) {
    switch (e) {
      case "reconnecting":
        return {
          suffix: " \xB7 reconnecting\u2026",
          color: "warning"
        };
      case "disconnected":
        return {
          suffix: " \xB7 disconnected",
          color: "error"
        };
      case "connecting":
      case "connected":
        return {
          suffix: "",
          color: "ide"
        };
    }
  }
  function nkc(e) {
    let t = Qhr.c(51);
    let {
      ideSelection: n,
      mcpClients: r,
      debug: o,
      bridgeSelected: s,
      modeLabels: i
    } = e;
    let a = bt(Pxf);
    let l = bt(Ixf);
    let c = bt(Axf);
    let {
      status: u
    } = Xhr(r);
    let d;
    if (t[0] !== n || t[1] !== u) {
      d = Mxf(u, n);
      t[0] = n;
      t[1] = u;
      t[2] = d;
    } else {
      d = t[2];
    }
    let p = d;
    let m = bt(kxf);
    let {
      columns: f
    } = Sr();
    let h;
    if (t[3] !== m || t[4] !== f) {
      h = m && f >= 60 && isBridgeEnabled();
      t[3] = m;
      t[4] = f;
      t[5] = h;
    } else {
      h = t[5];
    }
    let g = h;
    let y = KYl("hipaa");
    bKe();
    let _;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      _ = getFeatureValue_CACHED_MAY_BE_STALE("tengu_copper_thistle", false);
      t[6] = _;
    } else {
      _ = t[6];
    }
    let b = _;
    let S = bt(xxf);
    let E = bt(Rxf);
    let C = b && (S !== null || E);
    let x = false;
    let A;
    if (t[7] !== s || t[8] !== o || t[9] !== x || t[10] !== p || t[11] !== y || t[12] !== i || t[13] !== S || t[14] !== c || t[15] !== l || t[16] !== a || t[17] !== g || t[18] !== C) {
      if (A = [], y) {
        let I;
        if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
          I = Bv.jsx(Text, {
            color: "permission",
            wrap: "truncate",
            children: Rvt("hipaa")
          }, "hipaa");
          t[21] = I;
        } else {
          I = t[21];
        }
        A.push(I);
        x = true;
      }
      if (a) {
        let I;
        if (t[22] !== c) {
          I = wxf(c);
          t[22] = c;
          t[23] = I;
        } else {
          I = t[23];
        }
        let {
          suffix: O,
          color: M
        } = I;
        let L;
        if (t[24] !== l) {
          L = truncateToWidth(Li(l ?? "").replace(/[\r\n]/g, " "), 20).trim() || "cloud";
          t[24] = l;
          t[25] = L;
        } else {
          L = t[25];
        }
        let P = L;
        let F;
        if (t[26] !== P || t[27] !== a || t[28] !== O) {
          F = Bv.jsxs(Link, {
            url: a,
            children: [vGd.circleDouble, " ", P, O]
          });
          t[26] = P;
          t[27] = a;
          t[28] = O;
          t[29] = F;
        } else {
          F = t[29];
        }
        let H;
        if (t[30] !== M || t[31] !== F) {
          H = Bv.jsx(Text, {
            color: M,
            wrap: "truncate",
            children: F
          }, "cloud");
          t[30] = M;
          t[31] = F;
          t[32] = H;
        } else {
          H = t[32];
        }
        A.push(H);
        x = true;
      }
      if (p) {
        let I;
        if (t[33] !== p) {
          I = Bv.jsx(Text, {
            color: "ide",
            wrap: "truncate",
            children: p
          }, "ide");
          t[33] = p;
          t[34] = I;
        } else {
          I = t[34];
        }
        A.push(I);
        x = true;
      }
      if (o) {
        let I;
        if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
          I = Bv.jsx(Text, {
            color: "warning",
            wrap: "truncate",
            children: "Debug"
          }, "debug");
          t[35] = I;
        } else {
          I = t[35];
        }
        A.push(I);
        x = true;
      }
      if (g) {
        let I;
        if (t[36] !== s || t[37] !== x) {
          I = Bv.jsx(Oxf, {
            bridgeSelected: s,
            leadingSeparator: x
          }, "bridge");
          t[36] = s;
          t[37] = x;
          t[38] = I;
        } else {
          I = t[38];
        }
        A.push(I);
        x = true;
      }
      if (C) {
        let I;
        if (t[39] !== x) {
          I = x && Bv.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          }, "pr-sep");
          t[39] = x;
          t[40] = I;
        } else {
          I = t[40];
        }
        let O;
        if (t[41] !== S) {
          O = S ? Bv.jsx(xKe, {
            number: S.number,
            url: S.url,
            reviewState: S.reviewState,
            kind: S.kind
          }) : Bv.jsx(Text, {
            dimColor: true,
            children: "gh auth login"
          });
          t[41] = S;
          t[42] = O;
        } else {
          O = t[42];
        }
        let M;
        if (t[43] !== I || t[44] !== O) {
          M = Bv.jsxs(tkc.Fragment, {
            children: [I, O]
          }, "pr");
          t[43] = I;
          t[44] = O;
          t[45] = M;
        } else {
          M = t[45];
        }
        A.push(M);
        x = true;
      }
      if (i.length > 0) {
        let I;
        if (t[46] !== x || t[47] !== i) {
          I = Bv.jsx(Dxf, {
            labels: i,
            leadingSeparator: x
          }, "mode-labels");
          t[46] = x;
          t[47] = i;
          t[48] = I;
        } else {
          I = t[48];
        }
        A.push(I);
      }
      t[7] = s;
      t[8] = o;
      t[9] = x;
      t[10] = p;
      t[11] = y;
      t[12] = i;
      t[13] = S;
      t[14] = c;
      t[15] = l;
      t[16] = a;
      t[17] = g;
      t[18] = C;
      t[19] = A;
      t[20] = x;
    } else {
      A = t[19];
      x = t[20];
    }
    if (A.length === 0) {
      return null;
    }
    let k;
    if (t[49] !== A) {
      k = Bv.jsx(gXd, {
        flexShrink: 0,
        children: A.flatMap(Cxf)
      });
      t[49] = A;
      t[50] = k;
    } else {
      k = t[50];
    }
    return k;
  }
  function Cxf(e, t) {
    let n = e?.key;
    if (t === 0 || n === "bridge" || n === "pr" || n === "mode-labels") {
      return [e];
    }
    return [Bv.jsx(Text, {
      dimColor: true,
      children: " \xB7 "
    }, `sep-${n}`), e];
  }
  function Rxf(e) {
    return e.prNeedsAuth;
  }
  function xxf(e) {
    return e.prStatus;
  }
  function kxf(e) {
    return e.replBridgeEnabled && e.replBridgeError === undefined;
  }
  function Axf(e) {
    return e.remoteConnectionStatus;
  }
  function Ixf(e) {
    return e.remoteProject?.name;
  }
  function Pxf(e) {
    return e.remoteSessionUrl;
  }
  function Dxf(e) {
    let t = Qhr.c(9);
    let {
      labels: n,
      leadingSeparator: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = r && Bv.jsx(Text, {
        dimColor: true,
        children: " \xB7 "
      }, "mode-labels-sep");
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n) {
      s = n.join(" & ");
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== s) {
      i = Bv.jsx(Text, {
        dimColor: true,
        children: s
      });
      t[4] = s;
      t[5] = i;
    } else {
      i = t[5];
    }
    let a;
    if (t[6] !== o || t[7] !== i) {
      a = Bv.jsxs(Bv.Fragment, {
        children: [o, i]
      });
      t[6] = o;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  function Mxf(e, t) {
    if (!t) {
      return null;
    }
    let n = t.source === "diff";
    if (!n && e !== "connected") {
      return null;
    }
    if (t.text && t.lineCount > 0) {
      let r = t.lineCount;
      let o = n && t.filePath ? `from ${VXo.basename(t.filePath)}` : n ? "from diff" : "selected";
      return `\u29C9 ${r} ${r === 1 ? "line" : "lines"} ${o}`;
    }
    if (!n && t.filePath) {
      return `\u29C9 In ${VXo.basename(t.filePath)}`;
    }
    return null;
  }
  function Nxf(e) {
    return e.replBridgeConnected;
  }
  function Lxf(e) {
    return e.replBridgeSessionActive;
  }
  function Fxf(e) {
    return e.replBridgeReconnecting;
  }
  function Uxf(e) {
    return e.replBridgeError;
  }
  function Bxf(e) {
    return e.replBridgeOutboundOnly;
  }
  function $xf(e) {
    return e.replBridgeSessionUrl;
  }
  var Qhr;
  var VXo;
  var tkc;
  var Zhr;
  var Bv;
  var Oxf;
  var KXo = __lazy(() => {
    ho();
    Ox();
    yse();
    Zxc();
    yQn();
    GXo();
    ki();
    et();
    $n();
    Psr();
    nGo();
    dI();
    bs();
    aZn();
    Qhr = __toESM(pt(), 1);
    VXo = require("path");
    tkc = __toESM(ot(), 1);
    Zhr = __toESM(ot(), 1);
    Bv = __toESM(ie(), 1);
    Oxf = Zhr.memo(function (t) {
      let n = Qhr.c(26);
      let {
        bridgeSelected: r,
        leadingSeparator: o
      } = t;
      let s = bt(Nxf);
      let i = bt(Lxf);
      let a = bt(Fxf);
      let l = bt(Uxf);
      let c = bt(Bxf);
      let u = bt($xf);
      let d;
      if (n[0] !== l || n[1] !== c) {
        d = !isBridgeEnabled() || c || Boolean(l);
        n[0] = l;
        n[1] = c;
        n[2] = d;
      } else {
        d = n[2];
      }
      let p = d;
      let m;
      if (n[3] !== s || n[4] !== a || n[5] !== i) {
        m = dJn({
          connected: s,
          sessionActive: i,
          reconnecting: a
        });
        n[3] = s;
        n[4] = a;
        n[5] = i;
        n[6] = m;
      } else {
        m = n[6];
      }
      let f = m;
      let h = WXo();
      let g;
      let y;
      if (n[7] !== p || n[8] !== f.label) {
        g = () => {
          if (!p && f.label === "/rc active") {
            Qxc();
          }
        };
        y = [p, f.label];
        n[7] = p;
        n[8] = f.label;
        n[9] = g;
        n[10] = y;
      } else {
        g = n[9];
        y = n[10];
      }
      if (Zhr.useEffect(g, y), p) {
        return null;
      }
      let _ = f.label === "/rc active" && !h ? "/rc" : f.label;
      let b;
      if (n[11] !== _ || n[12] !== u) {
        b = u ? Bv.jsx(Link, {
          url: u,
          children: _
        }) : _;
        n[11] = _;
        n[12] = u;
        n[13] = b;
      } else {
        b = n[13];
      }
      let S = b;
      let E;
      if (n[14] !== o) {
        E = o && Bv.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        }, "bridge-sep");
        n[14] = o;
        n[15] = E;
      } else {
        E = n[15];
      }
      let C = r ? "background" : f.color;
      let x;
      if (n[16] !== r) {
        x = r && Bv.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", Bv.jsx(xt, {
            chord: "enter",
            action: "view"
          })]
        });
        n[16] = r;
        n[17] = x;
      } else {
        x = n[17];
      }
      let A;
      if (n[18] !== r || n[19] !== S || n[20] !== C || n[21] !== x) {
        A = Bv.jsxs(Text, {
          color: C,
          inverse: r,
          wrap: "truncate",
          children: [S, x]
        });
        n[18] = r;
        n[19] = S;
        n[20] = C;
        n[21] = x;
        n[22] = A;
      } else {
        A = n[22];
      }
      let k;
      if (n[23] !== E || n[24] !== A) {
        k = Bv.jsxs(Bv.Fragment, {
          children: [E, A]
        });
        n[23] = E;
        n[24] = A;
        n[25] = k;
      } else {
        k = n[25];
      }
      return k;
    });
  });
  function jxf(e) {
    let t = YXo.c(87);
    let {
      apiKeyStatus: n,
      debug: r,
      exitMessage: o,
      leftArrowDetachAvailable: s,
      vimMode: i,
      mode: a,
      isAutoUpdating: l,
      verbose: c,
      onChangeIsUpdating: u,
      suggestions: d,
      selectedSuggestion: p,
      suggestionsEmptyMessage: m,
      maxColumnWidth: f,
      hoveredSuggestionId: h,
      onSelectSuggestion: g,
      onHoverSuggestion: y,
      toolPermissionContext: _,
      helpOpen: b,
      suppressHint: S,
      isLoading: E,
      isExternalLoading: C,
      betweenCalls: x,
      tasksSelected: A,
      bridgeSelected: k,
      tmuxSelected: I,
      ideSelection: O,
      mcpClients: M,
      isPasting: L,
      showExpandPasteHint: P,
      hasStash: F,
      isInputWrapped: H,
      messagesRef: U,
      lastAssistantMessageId: N,
      tokenUsage: W,
      isSearching: j,
      historyQuery: z,
      setHistoryQuery: V,
      historyFailedMatch: K,
      onOpenTasksDialog: J
    } = e;
    let Q = C === undefined ? false : C;
    let Z = x === undefined ? true : x;
    let ne = L === undefined ? false : L;
    let oe = P === undefined ? false : P;
    let ee = F === undefined ? false : F;
    let re = K_();
    let {
      columns: se,
      rows: ae
    } = Sr();
    let de;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      de = qs();
      t[0] = de;
    } else {
      de = t[0];
    }
    let be = de;
    let fe = useIsScreenReaderEnabled();
    let me = bt(Gxf);
    let Te = be && ae < 15;
    let ue;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      ue = false;
      t[1] = ue;
    } else {
      ue = t[1];
    }
    let ce = be && me && "focus";
    let le;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      le = getMemoryToggledOff() && "memory paused";
      t[2] = le;
    } else {
      le = t[2];
    }
    let pe;
    if (t[3] !== ce) {
      pe = [ue, ce, le].filter(Wxf);
      t[3] = ce;
      t[4] = pe;
    } else {
      pe = t[4];
    }
    let ve = pe;
    let _e = qhr();
    let xe = bt(qxf);
    let ke = A && (_e === 0 || xe < 0);
    let Ie;
    if (t[5] !== re) {
      Ie = Tvc(re);
      t[5] = re;
      t[6] = Ie;
    } else {
      Ie = t[6];
    }
    let Ue = Ie;
    let Ge = S || j;
    let Be = Ge || Ue;
    let We = d.length > 0 || !!m;
    let Ze;
    if (t[7] !== We || t[8] !== h || t[9] !== f || t[10] !== y || t[11] !== g || t[12] !== p || t[13] !== d || t[14] !== m) {
      Ze = be && We ? {
        suggestions: d,
        selectedSuggestion: p,
        maxColumnWidth: f,
        emptyMessage: m,
        hoveredId: h,
        onSelect: g,
        onHoverChange: y
      } : null;
      t[7] = We;
      t[8] = h;
      t[9] = f;
      t[10] = y;
      t[11] = g;
      t[12] = p;
      t[13] = d;
      t[14] = m;
      t[15] = Ze;
    } else {
      Ze = t[15];
    }
    if (cXl(Ze), We && !be) {
      let jn;
      if (t[16] !== f || t[17] !== p || t[18] !== d || t[19] !== m) {
        jn = pB.jsx(gXd, {
          paddingX: 2,
          paddingY: 0,
          children: pB.jsx(yGe, {
            suggestions: d,
            selectedSuggestion: p,
            maxColumnWidth: f,
            emptyMessage: m
          })
        });
        t[16] = f;
        t[17] = p;
        t[18] = d;
        t[19] = m;
        t[20] = jn;
      } else {
        jn = t[20];
      }
      return jn;
    }
    if (b) {
      let jn;
      if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
        jn = pB.jsx(sar, {
          dimColor: true,
          fixedWidth: true,
          paddingX: 2
        });
        t[21] = jn;
      } else {
        jn = t[21];
      }
      return jn;
    }
    let kt = fe ? "column" : "row";
    let Ye;
    if (t[22] !== o || t[23] !== ne || t[24] !== Te || t[25] !== N || t[26] !== U || t[27] !== a || t[28] !== Ue || t[29] !== W || t[30] !== i) {
      Ye = a === "prompt" && !Te && !o.show && !ne && Ue && pB.jsx(Evc, {
        messagesRef: U,
        lastAssistantMessageId: N,
        tokenUsage: W,
        vimMode: i
      });
      t[22] = o;
      t[23] = ne;
      t[24] = Te;
      t[25] = N;
      t[26] = U;
      t[27] = a;
      t[28] = Ue;
      t[29] = W;
      t[30] = i;
      t[31] = Ye;
    } else {
      Ye = t[31];
    }
    let ht;
    if (t[32] !== Te || t[33] !== re?.statusLine || t[34] !== Ue) {
      ht = !Te && Ue && (V7e(re?.statusLine)?.hideVimModeIndicator ?? false);
      t[32] = Te;
      t[33] = re?.statusLine;
      t[34] = Ue;
      t[35] = ht;
    } else {
      ht = t[35];
    }
    let It = !S;
    let Rt;
    if (t[36] !== Z || t[37] !== o || t[38] !== K || t[39] !== z || t[40] !== Q || t[41] !== E || t[42] !== ne || t[43] !== j || t[44] !== s || t[45] !== a || t[46] !== J || t[47] !== ke || t[48] !== V || t[49] !== oe || t[50] !== Be || t[51] !== Ge || t[52] !== ht || t[53] !== It || t[54] !== I || t[55] !== _ || t[56] !== i) {
      Rt = pB.jsx(Yxc, {
        exitMessage: o,
        leftArrowDetachAvailable: s,
        vimMode: i,
        hideVimModeIndicator: ht,
        mode: a,
        toolPermissionContext: _,
        suppressHint: Be,
        suppressHintExceptStatusline: Ge,
        isInputEmpty: It,
        isLoading: E,
        isExternalLoading: Q,
        betweenCalls: Z,
        tasksSelected: ke,
        tmuxSelected: I,
        isPasting: ne,
        showExpandPasteHint: oe,
        isSearching: j,
        historyQuery: z,
        setHistoryQuery: V,
        historyFailedMatch: K,
        onOpenTasksDialog: J
      });
      t[36] = Z;
      t[37] = o;
      t[38] = K;
      t[39] = z;
      t[40] = Q;
      t[41] = E;
      t[42] = ne;
      t[43] = j;
      t[44] = s;
      t[45] = a;
      t[46] = J;
      t[47] = ke;
      t[48] = V;
      t[49] = oe;
      t[50] = Be;
      t[51] = Ge;
      t[52] = ht;
      t[53] = It;
      t[54] = I;
      t[55] = _;
      t[56] = i;
      t[57] = Rt;
    } else {
      Rt = t[57];
    }
    let wt;
    if (t[58] === Symbol.for("react.memo_cache_sentinel")) {
      wt = false;
      t[58] = wt;
    } else {
      wt = t[58];
    }
    let vt;
    if (t[59] !== Ye || t[60] !== Rt) {
      vt = pB.jsxs(gXd, {
        flexDirection: "column",
        flexShrink: 1,
        children: [Ye, Rt, wt]
      });
      t[59] = Ye;
      t[60] = Rt;
      t[61] = vt;
    } else {
      vt = t[61];
    }
    let yt;
    if (t[62] !== n || t[63] !== ee || t[64] !== l || t[65] !== H || t[66] !== u || t[67] !== W || t[68] !== c) {
      yt = be ? null : pB.jsx(xhr, {
        apiKeyStatus: n,
        isAutoUpdating: l,
        verbose: c,
        tokenUsage: W,
        onChangeIsUpdating: u,
        isInputWrapped: H,
        hasStash: ee
      });
      t[62] = n;
      t[63] = ee;
      t[64] = l;
      t[65] = H;
      t[66] = u;
      t[67] = W;
      t[68] = c;
      t[69] = yt;
    } else {
      yt = t[69];
    }
    let gt;
    if (t[70] !== k || t[71] !== r || t[72] !== O || t[73] !== M || t[74] !== ve || t[75] !== yt) {
      gt = pB.jsx(Vxf, {
        bridgeSelected: k,
        modeLabels: ve,
        ideSelection: O,
        mcpClients: M,
        debug: r,
        notifications: yt
      });
      t[70] = k;
      t[71] = r;
      t[72] = O;
      t[73] = M;
      t[74] = ve;
      t[75] = yt;
      t[76] = gt;
    } else {
      gt = t[76];
    }
    let Ft;
    if (t[77] !== se || t[78] !== kt || t[79] !== vt || t[80] !== gt) {
      Ft = pB.jsxs(gXd, {
        width: se,
        flexDirection: kt,
        flexWrap: "wrap",
        alignItems: "flex-start",
        paddingLeft: 2,
        paddingRight: be ? 1 : 2,
        columnGap: 1,
        children: [vt, gt]
      });
      t[77] = se;
      t[78] = kt;
      t[79] = vt;
      t[80] = gt;
      t[81] = Ft;
    } else {
      Ft = t[81];
    }
    let on = a === "prompt" && !o.show && !ne;
    let rn;
    if (t[82] !== on) {
      rn = pB.jsx(nxc, {
        showWorkflows: on
      });
      t[82] = on;
      t[83] = rn;
    } else {
      rn = t[83];
    }
    let Sn;
    if (t[84] !== Ft || t[85] !== rn) {
      Sn = pB.jsxs(pB.Fragment, {
        children: [Ft, rn]
      });
      t[84] = Ft;
      t[85] = rn;
      t[86] = Sn;
    } else {
      Sn = t[86];
    }
    return Sn;
  }
  function qxf(e) {
    return e.coordinatorTaskIndex;
  }
  function Wxf(e) {
    return Boolean(e);
  }
  function Gxf(e) {
    return e.briefTranscript;
  }
  function Vxf(e) {
    let t = YXo.c(9);
    let {
      notifications: n,
      bridgeSelected: r,
      modeLabels: o,
      ideSelection: s,
      mcpClients: i,
      debug: a
    } = e;
    let l;
    if (t[0] !== r || t[1] !== a || t[2] !== s || t[3] !== i || t[4] !== o) {
      l = pB.jsx(nkc, {
        ideSelection: s,
        mcpClients: i,
        debug: a,
        bridgeSelected: r,
        modeLabels: o
      });
      t[0] = r;
      t[1] = a;
      t[2] = s;
      t[3] = i;
      t[4] = o;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== n || t[7] !== l) {
      c = pB.jsxs(gXd, {
        flexShrink: 0,
        marginLeft: "auto",
        flexDirection: "column",
        alignItems: "flex-end",
        children: [n, l]
      });
      t[6] = n;
      t[7] = l;
      t[8] = c;
    } else {
      c = t[8];
    }
    return c;
  }
  var YXo;
  var rkc;
  var pB;
  var okc;
  var skc = __lazy(() => {
    at();
    pen();
    Qq();
    ki();
    DPe();
    et();
    pU();
    A4t();
    ho();
    zp();
    lQt();
    NNe();
    oxt();
    EJo();
    khr();
    Jxc();
    Ljt();
    u3o();
    KXo();
    YXo = __toESM(pt(), 1);
    rkc = __toESM(ot(), 1);
    pB = __toESM(ie(), 1);
    okc = rkc.memo(jxf);
  });
  function zxf() {
    if (!isAgentSwarmsEnabled()) {
      return;
    }
    let e = getTeammateColor();
    if (!e) {
      return;
    }
    if (eb.includes(e)) {
      return w3[e];
    }
    return;
  }
  function ikc(e) {
    let t = JXo.c(4);
    let {
      isLoading: n,
      isScreenReader: r,
      themeColor: o
    } = e;
    let i = o ?? undefined;
    let a = r ? "$" : vGd.pointer;
    let l;
    if (t[0] !== i || t[1] !== n || t[2] !== a) {
      l = pXe.jsxs(Text, {
        color: i,
        dimColor: n,
        children: [a, "\xA0"]
      });
      t[0] = i;
      t[1] = n;
      t[2] = a;
      t[3] = l;
    } else {
      l = t[3];
    }
    return l;
  }
  function XXo(e) {
    let t = JXo.c(10);
    let {
      mode: n,
      isLoading: r,
      viewingAgentName: o,
      viewingAgentColor: s
    } = e;
    let i = useIsScreenReaderEnabled();
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = zxf();
      t[0] = a;
    } else {
      a = t[0];
    }
    let l = a;
    let c = s ? w3[s] : undefined;
    let d = !i || !o && n === "bash";
    let p;
    if (t[1] !== r || t[2] !== i || t[3] !== n || t[4] !== c || t[5] !== o) {
      p = o ? pXe.jsx(ikc, {
        isLoading: r,
        isScreenReader: i,
        themeColor: c
      }) : n === "bash" ? pXe.jsx(Text, {
        color: "bashBorder",
        dimColor: r,
        children: "!\xA0"
      }) : pXe.jsx(ikc, {
        isLoading: r,
        isScreenReader: i,
        themeColor: isAgentSwarmsEnabled() ? l : undefined
      });
      t[1] = r;
      t[2] = i;
      t[3] = n;
      t[4] = c;
      t[5] = o;
      t[6] = p;
    } else {
      p = t[6];
    }
    let m;
    if (t[7] !== d || t[8] !== p) {
      m = pXe.jsx(gXd, {
        "aria-hidden": d,
        alignItems: "flex-start",
        alignSelf: "flex-start",
        flexWrap: "nowrap",
        justifyContent: "flex-start",
        children: p
      });
      t[7] = d;
      t[8] = p;
      t[9] = m;
    } else {
      m = t[9];
    }
    return m;
  }
  var JXo;
  var pXe;
  var akc = __lazy(() => {
    et();
    $U();
    qp();
    mE();
    JXo = __toESM(pt(), 1);
    pXe = __toESM(ie(), 1);
  });
  function Yxf(e) {
    try {
      return qt(e)?.type === "idle_notification";
    } catch {
      return false;
    }
  }
  function Jxf(e) {
    return `<${"task-notification"}>
<${"summary"}>+${e} more tasks completed</${"summary"}>
<${"status"}>completed</${"status"}>
</${"task-notification"}>`;
  }
  function Xxf(e) {
    let t = e.filter(a => typeof a.value !== "string" || !Yxf(a.value));
    let n = t.filter(a => a.mode === "task-notification");
    let r = t.filter(a => a.mode !== "task-notification");
    if (n.length <= 3) {
      return [...r, ...n];
    }
    let o = n.slice(0, 3 - 1);
    let s = n.length - (3 - 1);
    let i = {
      value: Jxf(s),
      mode: "task-notification",
      agentId: mainAgentId()
    };
    return [...r, ...o, i];
  }
  function Qxf() {
    let e = lkc.c(20);
    let t = Che();
    let n = bt(rkf);
    let r = bt(nkf);
    let o = bt(tkf);
    let s;
    if (e[0] !== t) {
      e: {
        if (t.length === 0) {
          s = null;
          break e;
        }
        let p = t.filter(ekf);
        if (p.length === 0) {
          s = null;
          break e;
        }
        let m = Xxf(p);
        let f = xS(m.map(Zxf));
        let h;
        if (e[2] !== f || e[3] !== m) {
          h = {
            messages: f,
            processedCommands: m
          };
          e[2] = f;
          e[3] = m;
          e[4] = h;
        } else {
          h = e[4];
        }
        s = h;
      }
      e[0] = t;
      e[1] = s;
    } else {
      s = e[1];
    }
    let i = s;
    let a;
    e: {
      if (r === null || i === null) {
        a = -1;
        break e;
      }
      let p;
      if (e[5] !== r || e[6] !== t || e[7] !== i) {
        let f = t.filter($G)[r];
        p = f ? i.processedCommands.indexOf(f) : -1;
        e[5] = r;
        e[6] = t;
        e[7] = i;
        e[8] = p;
      } else {
        p = e[8];
      }
      a = p;
    }
    let l = a;
    if (n || i === null) {
      return null;
    }
    let c = l !== -1;
    let u;
    if (e[9] !== l || e[10] !== i.messages || e[11] !== c || e[12] !== o) {
      let p;
      if (e[14] !== l || e[15] !== c || e[16] !== o) {
        p = (m, f) => egr.jsx(YSl, {
          isFirst: f === 0,
          useBriefLayout: o,
          selectionHighlight: c ? f === l ? "on" : "off" : undefined,
          children: egr.jsx(dZ, {
            message: m,
            lookups: Yve,
            addMargin: false,
            tools: [],
            commands: [],
            verbose: false,
            inProgressToolUseIDs: Kxf,
            progressMessagesForMessage: [],
            shouldAnimate: false,
            shouldShowDot: false,
            isTranscriptMode: false,
            isStatic: true
          })
        }, f);
        e[14] = l;
        e[15] = c;
        e[16] = o;
        e[17] = p;
      } else {
        p = e[17];
      }
      u = i.messages.map(p);
      e[9] = l;
      e[10] = i.messages;
      e[11] = c;
      e[12] = o;
      e[13] = u;
    } else {
      u = e[13];
    }
    let d;
    if (e[18] !== u) {
      d = egr.jsx(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: u
      });
      e[18] = u;
      e[19] = d;
    } else {
      d = e[19];
    }
    return d;
  }
  function Zxf(e) {
    let t = e.value;
    if (e.mode === "bash" && typeof t === "string") {
      t = `<bash-input>${t}</bash-input>`;
    }
    return In({
      content: t
    });
  }
  function ekf(e) {
    return uba(e);
  }
  function tkf(e) {
    return e.isBriefOnly;
  }
  function nkf(e) {
    return e.queueEditIndex;
  }
  function rkf(e) {
    return !!e.viewingAgentTaskId;
  }
  var lkc;
  var ckc;
  var egr;
  var Kxf;
  var tgr;
  var ZXo = __lazy(() => {
    et();
    ho();
    at();
    np();
    zMo();
    zRt();
    Rf();
    ro();
    sTt();
    lkc = __toESM(pt(), 1);
    ckc = __toESM(ot(), 1);
    egr = __toESM(ie(), 1);
    Kxf = new Set();
    tgr = ckc.memo(Qxf);
  });
  function ukc(e, t, n) {
    if (e === 0 || n) {
      return;
    }
    if (t === null) {
      return "History";
    }
    return `History ${Math.max(1, t - e + 1)}/${t}`;
  }
  function zrn(e) {
    let t = dkc.c(27);
    let {
      banner: n,
      columns: r,
      fastModeTag: o,
      borderOnly: s
    } = e;
    if (useIsScreenReaderEnabled()) {
      if (s || !n.text && !o) {
        return null;
      }
      let g;
      if (t[0] !== n.bgColor || t[1] !== n.text) {
        g = n.text && Aee.jsx(Mx, {
          color: n.bgColor,
          padded: true,
          children: n.text
        });
        t[0] = n.bgColor;
        t[1] = n.text;
        t[2] = g;
      } else {
        g = t[2];
      }
      let y;
      if (t[3] !== o) {
        y = o && Aee.jsxs(Text, {
          color: "fastMode",
          children: [" ", o]
        });
        t[3] = o;
        t[4] = y;
      } else {
        y = t[4];
      }
      let _;
      if (t[5] !== n.bgColor || t[6] !== g || t[7] !== y) {
        _ = Aee.jsxs(Text, {
          color: n.bgColor,
          children: [g, y]
        });
        t[5] = n.bgColor;
        t[6] = g;
        t[7] = y;
        t[8] = _;
      } else {
        _ = t[8];
      }
      return _;
    }
    let a = o ? an(o) + 2 : 0;
    let l = n.text ? an(n.text) + 2 : 0;
    let c = a || l ? "\u2500\u2500" : "";
    let u = Math.max(0, r - a - l - c.length);
    let d = n.gradient;
    let p;
    if (t[9] !== n.bgColor || t[10] !== d) {
      p = d?.at(-1) ?? n.bgColor;
      t[9] = n.bgColor;
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== u || t[13] !== d) {
      m = d ? Aee.jsx(okf, {
        count: u,
        colors: d
      }) : "\u2500".repeat(u);
      t[12] = u;
      t[13] = d;
      t[14] = m;
    } else {
      m = t[14];
    }
    let f;
    if (t[15] !== n.bgColor || t[16] !== n.text || t[17] !== s || t[18] !== l || t[19] !== o || t[20] !== a || t[21] !== c) {
      f = s ? "\u2500".repeat(a + l + c.length) : Aee.jsxs(Aee.Fragment, {
        children: [o ? ` ${o} ` : null, n.text ? Aee.jsx(Mx, {
          color: n.bgColor,
          padded: true,
          children: n.text
        }) : null, c]
      });
      t[15] = n.bgColor;
      t[16] = n.text;
      t[17] = s;
      t[18] = l;
      t[19] = o;
      t[20] = a;
      t[21] = c;
      t[22] = f;
    } else {
      f = t[22];
    }
    let h;
    if (t[23] !== p || t[24] !== m || t[25] !== f) {
      h = Aee.jsxs(Text, {
        color: p,
        children: [m, f]
      });
      t[23] = p;
      t[24] = m;
      t[25] = f;
      t[26] = h;
    } else {
      h = t[26];
    }
    return h;
  }
  function okf({
    count: e,
    colors: t
  }) {
    if (e <= 0 || t.length === 0) {
      return null;
    }
    let n = Math.min(t.length, e);
    let r = Math.floor(e / n);
    let o = e - r * n;
    return t.slice(0, n).map((s, i) => {
      let a = r + (o-- > 0 ? 1 : 0);
      return Aee.jsx(Text, {
        color: s,
        children: "\u2500".repeat(a)
      }, i);
    });
  }
  var dkc;
  var Aee;
  var eQo = __lazy(() => {
    bc();
    et();
    qve();
    dkc = __toESM(pt(), 1);
    Aee = __toESM(ie(), 1);
  });
  function pkc(e) {
    let t = axt.useRef(e);
    t.current = e;
    let {
      internal_querier: n
    } = F5d();
    let r = axt.useSyncExternalStore(onAttacherCapsChange, () => getAttacherCaps()?.terminal ?? Me.terminal);
    axt.useEffect(() => {
      if (!qs() || !n) {
        return;
      }
      if (r !== "iTerm.app" && r !== "Apple_Terminal") {
        return;
      }
      let o = rVd.get(process.stdout);
      if (!o) {
        return;
      }
      let s = new AbortController();
      (async () => {
        while (!s.signal.aborted) {
          let i = await o.probeExternalClear(n);
          if (s.signal.aborted) {
            return;
          }
          if (i) {
            t.current();
          }
          await sleep(200, s.signal, {
            unref: true
          });
        }
      })();
      return () => s.abort();
    }, [n, r]);
  }
  var axt;
  var mkc = __lazy(() => {
    at();
    pr();
    zp();
    axt = __toESM(ot(), 1);
  });
  function skf(e, t, n = false) {
    if (!n && e.length <= 1e4 || e.length <= 1000) {
      return {
        truncatedText: e,
        placeholderContent: ""
      };
    }
    let r = Math.floor(1000 / 2);
    let o = Math.floor(1000 / 2);
    let s = e.slice(0, r);
    let i = e.slice(-o);
    let a = e.slice(r, -o);
    let l = KPe(a);
    let u = ikf(t, l);
    return {
      truncatedText: s + u + i,
      placeholderContent: a
    };
  }
  function ikf(e, t) {
    return `[...Truncated text #${e} +${t} lines...]`;
  }
  function hkc(e, t) {
    if (e.length <= 1e4) {
      return {
        newInput: e,
        newPastedContents: t
      };
    }
    let n = Object.keys(t).map(Number);
    let r = n.length > 0 ? Math.max(...n) + 1 : 1;
    let o = Math.floor(1000 / 2);
    let s = e.length - Math.floor(1000 / 2);
    let i = new Set();
    let a = new Set();
    let l = [];
    let c = e;
    let u = h1(e);
    for (let h = u.length - 1; h >= 0; h--) {
      let g = u[h];
      let y = t[g.id];
      if (!y) {
        continue;
      }
      let _ = g.index + g.match.length;
      let b = _ > o && g.index < s;
      if (y.type !== "text") {
        if (b) {
          l.unshift(g.match);
          c = c.slice(0, g.index) + c.slice(_);
        }
        continue;
      }
      if (!b) {
        a.add(g.id);
        continue;
      }
      c = c.slice(0, g.index) + y.content + c.slice(_);
      i.add(g.id);
    }
    let {
      truncatedText: d,
      placeholderContent: p
    } = skf(c, r, true);
    if (!p) {
      return {
        newInput: e,
        newPastedContents: t
      };
    }
    let m = d;
    if (l.length > 0) {
      let h = Math.floor(1000 / 2);
      m = d.slice(0, h) + l.join("") + d.slice(h);
    }
    let f = {};
    for (let [h, g] of Object.entries(t)) {
      let y = Number(h);
      if (i.vZc(y) && !a.vZc(y)) {
        continue;
      }
      f[y] = g;
    }
    f[r] = {
      id: r,
      type: "text",
      content: p
    };
    return {
      newInput: m,
      newPastedContents: f
    };
  }
  var gkc = __lazy(() => {
    gq();
  });
  function ykc({
    input: e,
    pastedContents: t,
    onInputChange: n,
    setCursorOffset: r,
    setPastedContents: o
  }) {
    let [s, i] = Krn.useState(false);
    Krn.useEffect(() => {
      if (s) {
        return;
      }
      if (e.length <= 1e4) {
        return;
      }
      let {
        newInput: a,
        newPastedContents: l
      } = hkc(e, t);
      n(a);
      r(a.length);
      o(l);
      i(true);
    }, [e, s, t, n, o, r]);
    Krn.useEffect(() => {
      if (e === "") {
        i(false);
      }
    }, [e]);
  }
  var Krn;
  var _kc = __lazy(() => {
    gkc();
    Krn = __toESM(ot(), 1);
  });
  function lkf(e) {
    return !akf.some(t => t.test(e));
  }
  function ckf(e, t) {
    let n = [];
    let r = new Set();
    let o = new Map();
    for (let s = 1; n.length < t && s <= t; s++) {
      for (let i of e) {
        if (n.length >= t) {
          break;
        }
        if (!lkf(i)) {
          continue;
        }
        let a = Math.max(i.lastIndexOf("/"), i.lastIndexOf("\\"));
        let l = a >= 0 ? i.slice(a + 1) : i;
        if (!l || r.vZc(l)) {
          continue;
        }
        let c = a >= 0 ? i.slice(0, a) : ".";
        if ((o.get(c) ?? 0) >= s) {
          continue;
        }
        n.push(l);
        r.add(l);
        o.set(c, (o.get(c) ?? 0) + 1);
      }
    }
    return n.length >= t ? n : [];
  }
  async function ukf() {
    if (Me.platform === "win32") {
      return [];
    }
    if (!(await getIsGit())) {
      return [];
    }
    try {
      let e = await kce();
      let t = ["log", "-n", "1000", "--pretty=format:", "--name-only", "--diff-filter=M"];
      let n = new Map();
      let r = s => {
        for (let i of s.split(`
`)) {
          let a = i.trim();
          if (a) {
            n.set(a, (n.get(a) ?? 0) + 1);
          }
        }
      };
      if (e) {
        let {
          stdout: s
        } = await execFileNoThrowWithCwd("git", [...t, `--author=${e}`], {
          cwd: Nt()
        });
        r(s);
      }
      if (n.size < 10) {
        let {
          stdout: s
        } = await execFileNoThrowWithCwd(gitExe(), t, {
          cwd: Nt()
        });
        r(s);
      }
      let o = Array.from(n.entries()).sort((s, i) => i[1] - s[1]).map(([s]) => s);
      return ckf(o, 5);
    } catch (e) {
      logForDebugging(`Failed to collect frequently-modified files from git history: ${e}`, {
        level: "error"
      });
      return [];
    }
  }
  var akf;
  var bkc;
  var Skc;
  var tQo = __lazy(() => {
    vo();
    je();
    pr();
    ji();
    na();
    Bne();
    akf = [/(?:^|\/)(?:package-lock\.json|yarn\.lock|bun\.lock|bun\.lockb|pnpm-lock\.yaml|Pipfile\.lock|poetry\.lock|Cargo\.lock|Gemfile\.lock|go\.sum|composer\.lock|uv\.lock)$/, /\.generated\./, /(?:^|\/)(?:dist|build|out|target|node_modules|\.next|__pycache__)\//, /\.(?:min\.js|min\.css|map|pyc|pyo)$/, /\.(?:json|ya?ml|toml|xml|ini|cfg|conf|env|lock|txt|md|mdx|rst|csv|log|svg)$/i, /(?:^|\/)\.?(?:eslintrc|prettierrc|babelrc|editorconfig|gitignore|gitattributes|dockerignore|npmrc)/, /(?:^|\/)(?:tsconfig|jsconfig|biome|vitest\.config|jest\.config|webpack\.config|vite\.config|rollup\.config)\.[a-z]+$/, /(?:^|\/)\.(?:github|vscode|idea|claude)\//, /(?:^|\/)(?:CHANGELOG|LICENSE|CONTRIBUTING|CODEOWNERS|README)(?:\.[a-z]+)?$/i];
    bkc = TEr(() => {
      let e = getCurrentProjectConfig();
      let t = e.exampleFiles?.length ? yWp(e.exampleFiles) : "<filepath>";
      let n = ["fix lint errors", "fix typecheck errors", `how does ${t} work?`, `refactor ${t}`, "how do I log an error?", `edit ${t} to...`, `write a test for ${t}`, "create a util logging.py that..."];
      return `Try "${yWp(n)}"`;
    });
    Skc = TEr(async () => {
      let e = getCurrentProjectConfig();
      let t = Date.now();
      let n = e.exampleFilesGeneratedAt ?? 0;
      if (t - n > 604800000) {
        e.exampleFiles = [];
      }
      if (!e.exampleFiles?.length) {
        ukf().then(r => {
          if (r.length) {
            saveCurrentProjectConfig(o => ({
              ...o,
              exampleFiles: r,
              exampleFilesGeneratedAt: Date.now()
            }));
          }
        });
      }
    });
  });
  function vkc({
    input: e,
    submitCount: t,
    hasMessages: n,
    viewingAgentName: r
  }) {
    let o = Che();
    let s = bt(a => a.promptSuggestionEnabled);
    return Ekc.useMemo(() => {
      if (e !== "") {
        return;
      }
      if (r) {
        return `Message @${r.length > 20 ? r.slice(0, 20 - 1) + "\u2026" : r}\u2026`;
      }
      if (o.some($G) && (getGlobalConfig().queuedCommandUpHintCount || 0) < 3) {
        return "Press up to edit queued messages";
      }
      if (t < 1 && !n && s) {
        return bkc();
      }
    }, [e, o, t, n, s, r]);
  }
  var Ekc;
  var wkc = __lazy(() => {
    zRt();
    ho();
    tQo();
    Rf();
    Ekc = __toESM(ot(), 1);
  });
  function Rkc(e) {
    let [t, n] = ngr.useState(false);
    let r = useClock();
    ngr.useEffect(() => {
      if (Ckc || !e) {
        return;
      }
      Ckc = true;
      n(true);
      let o = r.setTimeout(() => n(false), 5000);
      return () => {
        o();
        n(false);
      };
    }, [e, r]);
    return t;
  }
  var ngr;
  var Ckc = false;
  var xkc = __lazy(() => {
    et();
    ngr = __toESM(ot(), 1);
  });
  function Ikc(e, t) {
    let n = Due();
    let [r, o] = rgr.useState(false);
    let s = useClock();
    let [, i] = useAnimationFrame(r && !n ? 150 : null);
    if (rgr.useEffect(() => {
      let u = Akc === false && e;
      if (Akc = e, !u || n) {
        return;
      }
      o(true);
      let d = s.setTimeout(() => o(false), 2500);
      return () => {
        d();
        o(false);
      };
    }, [e, s, n]), !r || n || t <= 0) {
      return;
    }
    let a = Math.floor(i / 150);
    let l = B2(uc("theme", "dark").value);
    let c = Array.from({
      length: t
    }, (u, d) => color(k8(d + a), l)("\u2500")).join("");
    return [{
      content: c,
      position: "top",
      align: "start",
      offset: 0
    }, {
      content: c,
      position: "bottom",
      align: "start",
      offset: 0
    }];
  }
  var rgr;
  var Akc = null;
  var Pkc = __lazy(() => {
    Ijt();
    et();
    zg();
    NJ();
    XN();
    APe();
    rgr = __toESM(ot(), 1);
  });
  function sgr() {
    let e = bt(h => h.teamContext);
    let t = bt(h => h.standaloneAgentContext);
    let n = bt(h => h.agent);
    bt(h => h.viewingAgentTaskId);
    let r = Ec();
    let [o] = useTheme();
    let [s, i] = cxt.useState(null);
    let a = t?.prideGradient;
    let l = cxt.useMemo(() => a && undefined ? undefined(a, o) : a, [a, o]);
    cxt.useEffect(() => {
      isInsideTmux().then(i);
    }, []);
    let c = r.getState();
    if (isTeammate() && !isInProcessTeammate()) {
      let h = getAgentName();
      if (h && getTeamName()) {
        return {
          text: `@${h}`,
          bgColor: ogr(e?.selfAgentColor ?? getTeammateColor())
        };
      }
    }
    if (e?.teammates && Object.keys(e.teammates).length > 1) {
      let h = kFe(c);
      let g = ogr(h?.identity.color);
      let y = isInProcessEnabled();
      let _ = getCachedDetectionResult()?.isNative ?? false;
      if (s === false && !y && !_) {
        return {
          text: `View teammates: \`tmux -L ${tKt()} a\``,
          bgColor: g
        };
      }
      if ((s === true || y || _) && h) {
        return {
          text: `@${h.identity.agentName}`,
          bgColor: g
        };
      }
    }
    let d = vXt(c);
    if (d.type === "named_agent") {
      let h = d.task;
      let g;
      for (let [y, _] of c.agentNameRegistry) {
        if (_ === h.id) {
          g = y;
          break;
        }
      }
      return {
        text: g ? `@${g}` : h.description,
        bgColor: pze(h.agentType) ?? "cyan_FOR_SUBAGENTS_ONLY"
      };
    }
    let p = n ? c.agentDefinitions.activeAgents.find(h => h.agentType === n) : undefined;
    let m = vHl(c);
    let f = t?.color;
    if (m || f || l) {
      return {
        text: m || n || "",
        bgColor: ogr(Rbt({
          userOverride: f,
          agentDefinitionColor: p?.color
        })),
        gradient: l
      };
    }
    if (n) {
      return {
        text: n,
        bgColor: ogr(p?.color, "promptBorder")
      };
    }
    return null;
  }
  function ogr(e, t = "cyan_FOR_SUBAGENTS_ONLY") {
    return e && eb.includes(e) ? w3[e] : t;
  }
  var cxt;
  var nQo = __lazy(() => {
    ho();
    wXt();
    $U();
    gsr();
    Ive();
    eL();
    qp();
    Uj();
    FJ();
    cxt = __toESM(ot(), 1);
  });
  function bkf({
    debug: e,
    ideSelection: t,
    toolPermissionContext: n,
    setToolPermissionContext: r,
    apiKeyStatus: o,
    commands: s,
    agents: i,
    isLoading: a,
    betweenCalls: l = true,
    isExternalLoading: c = false,
    verbose: u,
    messagesRef: d,
    hasMessages: p,
    hasAssistantMessage: m,
    lastAssistantMessageId: f,
    tokenUsage: h,
    onInputChange: g,
    mode: y,
    onModeChange: _,
    stashedPrompt: b,
    setStashedPrompt: S,
    submitCount: E,
    onShowMessageSelector: C,
    mcpClients: x,
    pastedContents: A,
    setPastedContents: k,
    showBashesDialog: I,
    setShowBashesDialog: O,
    onExit: M,
    onLeftArrowOnEmpty: L,
    getToolUseContext: P,
    onSubmit: F,
    onAgentSubmit: H,
    onDismissSideQuestion: U,
    isSideQuestionVisible: N,
    onInputOverlayActiveChange: W,
    onVimEditingChange: j,
    onInputOwnsEscapeChange: z,
    initialVimMode: V,
    onVimModeChange: K,
    hasSuppressedDialogs: J,
    isLocalJSXCommandActive: Q = false,
    insertTextRef: Z,
    voiceInterimRange: ne,
    sessionEnvVars: oe
  }) {
    let ee = prr();
    let re = dR();
    let se = TSe() || Q;
    let [ae, de] = Co.useState(V ?? "INSERT");
    Co.useEffect(() => K?.(ae), [ae, K]);
    let be = Co.useRef(false);
    let fe = Co.useCallback($t => {
      be.current = false;
      de($t);
    }, []);
    let me = mL();
    let [Te, ue] = Co.useState(false);
    let [ce, le] = Co.useState(false);
    let pe = Te || ce;
    Co.useEffect(() => (W(pe), () => W(false)), [pe, W]);
    let ve = me && ae !== "NORMAL";
    Co.useEffect(() => (j(ve), () => j(false)), [ve, j]);
    let [_e, xe] = Co.useState(false);
    let [ke, Ie] = Co.useState({
      show: false
    });
    let [Ue, Ge] = Co.useState(ee.length);
    let Be = Co.useRef(Ue);
    Be.current = Ue;
    let We = Co.useRef(A);
    We.current = A;
    let Ze = Co.useRef(Promise.resolve());
    let Tt = Co.useRef(ee);
    if (ee !== Tt.current) {
      Ge(ee.length);
      Tt.current = ee;
    }
    let kt = Co.useCallback($t => {
      Tt.current = $t;
      g($t);
    }, [g]);
    let Ye = Co.useRef(null);
    if (Z) {
      Z.current = {
        cursorOffset: Ue,
        submit: ($t, nr) => void Ye.current?.($t, nr),
        insert: $t => {
          let bo = Ue === ee.length && ee.length > 0 && !/\s$/.test(ee) ? " " + $t : $t;
          let qa = ee.slice(0, Ue) + bo + ee.slice(Ue);
          Tt.current = qa;
          g(qa);
          Ge(Ue + bo.length);
        },
        setInputWithCursor: ($t, nr) => {
          Tt.current = $t;
          g($t);
          Ge(nr);
        }
      };
    }
    let ht = Ec();
    let It = Lo();
    let Rt = bt($t => $t.queueEditIndex);
    let wt = Co.useCallback($t => {
      It(nr => nr.queueEditIndex === $t ? nr : {
        ...nr,
        queueEditIndex: $t
      });
    }, [It]);
    let vt = Co.useRef(ee);
    Co.useEffect(() => {
      if (vt.current === ee) {
        return;
      }
      if (vt.current = ee, ht.getState().queueEditIndex !== null) {
        wt(null);
      }
    }, [ee, wt, ht]);
    let yt = Rv();
    let gt = bt($t => $t.tasks);
    let Ft = bt($t => $t.workflowDetail);
    let on = Ft?.taskId;
    Co.useEffect(() => {
      if (on === undefined || gt[on]) {
        return;
      }
      It($t => $t.workflowDetail === undefined ? $t : {
        ...$t,
        workflowDetail: undefined
      });
    }, [on, gt, It]);
    let {
      columns: rn,
      rows: Sn
    } = Sr();
    let Xr = bt($t => $t.replBridgeError === undefined && $t.replBridgeConnected && ($t.replBridgeExplicit || $t.replBridgeReconnecting)) && rn >= 60 && isBridgeEnabled();
    let co = bt($t => false);
    let Yt = false;
    let Ee = bt($t => false);
    let Re = bt($t => Object.keys($t.frameUrls).length > 0);
    let Ce = Re && isPublishToolEnabled();
    let Fe = bt($t => $t.teamContext);
    let Xe = Che();
    Co.useEffect(() => {
      if (Rt === null) {
        return;
      }
      let $t = Bn(Xe, $G);
      if ($t === 0) {
        wt(null);
      } else if (Rt > $t - 1) {
        wt($t - 1);
      }
    }, [Xe, Rt, wt]);
    let He = bt($t => $t.promptSuggestion);
    let Gt = bt($t => $t.viewingAgentTaskId);
    let mt = bt($t => $t.viewSelectionMode);
    let Dt = ve || pe || y !== "prompt" || Rt !== null || !bq() && Xe.some($G) || !!N;
    Co.useEffect(() => (z?.(Dt), () => z?.(false)), [Dt, z]);
    let jt = bt($t => $t.isBriefOnly) && !Gt;
    let bn = bt($t => $t.mainLoopModel);
    let Ct = bt($t => $t.mainLoopModelForSession);
    let hn = bt($t => $t.thinkingEnabled);
    let vn = bt($t => lc() ? $t.fastMode : false);
    let zn = bt($t => $t.effortValue);
    let Pn = bt($t => $t.ultracode);
    let Lr = kFe(ht.getState());
    let ao = Lr?.identity.agentName;
    let Nn = Lr?.identity.color && eb.includes(Lr.identity.color) ? Lr.identity.color : undefined;
    let Tr = vXt(ht.getState());
    let To = Tr.type === "leader" ? undefined : ht.getState().transcripts[Tr.task.id]?.messages ?? ykf;
    let wr = Co.useMemo(() => To ? Tkf(To) : undefined, [To]);
    let Ut = Co.useMemo(() => {
      if (Lr) {
        return {
          ...n,
          mode: Lr.permissionMode
        };
      }
      return n;
    }, [Lr, n]);
    let {
      historyQuery: Wn,
      setHistoryQuery: Fr,
      historyMatch: Is,
      historyFailedMatch: _r,
      handleKeyDown: kn,
      openSearch: Qn
    } = eRc($t => {
      k($t.pastedContents);
      t_($t.display);
    }, ee, kt, Ge, Ue, _, y, Te, ue, k, A);
    let gi = Co.useRef(-1);
    if (gi.current === -1) {
      gi.current = Skf(d.current);
    }
    let Ks = Co.useRef(false);
    let [Fa, Hs] = Co.useState(false);
    let Ms = bt($t => $t.coordinatorTaskIndex);
    let Ia = bt($t => $t.taskDecorations);
    let ec = Co.useCallback($t => It(nr => {
      let bo = typeof $t === "function" ? $t(nr.coordinatorTaskIndex) : $t;
      if (bo === nr.coordinatorTaskIndex) {
        return nr;
      }
      return {
        ...nr,
        coordinatorTaskIndex: bo
      };
    }), [It]);
    let Os = Co.useMemo(() => Object.values(gt).some(eCt), [gt]);
    let Kn = Os ? -1 : 0;
    let sn = Co.useMemo(() => khe(gt, Ia, Gt).map($t => $t.id), [gt, Ia, Gt]);
    let Ln = Co.useRef(sn);
    Co.useEffect(() => {
      let $t = Ln.current;
      Ln.current = sn;
      let nr = exc(Ms, $t, sn);
      if (nr !== Ms) {
        ec(nr);
      } else if (Ms >= 0) {
        ec(Math.max(Kn, 0 - 1));
      } else if (Ms < Kn) {
        ec(Kn);
      }
    }, [sn, 0, Ms, Kn, ec]);
    let [ct, Br] = Co.useState(false);
    let [Pr, Vr] = Co.useState(false);
    let Xo = useClock();
    let qo = Co.useRef(null);
    Co.useEffect(() => () => {
      if (qo.current) {
        qo.current();
      }
    }, []);
    let [ss, Ri] = Co.useState(false);
    let [ya, fs] = Co.useState(false);
    let [tc, On] = Co.useState(false);
    let [lr, Mn] = Co.useState(false);
    let [Un, Er] = Co.useState(false);
    let [Or, Y] = Co.useState(false);
    let [Se, qe] = Co.useState(false);
    let Qe = Co.useRef(false);
    let Ht = Co.useRef(null);
    let [nn, qn] = Co.useState(null);
    let zr = Co.useRef(null);
    Co.useEffect(() => () => {
      if (zr.current) {
        zr.current();
        zr.current = null;
      }
    }, []);
    let wo = Co.useMemo(() => nn !== null && !Lr ? {
      ...Ut,
      mode: "auto"
    } : Ut, [Ut, nn, Lr]);
    let Nr = Co.useMemo(() => jrn(gt), [gt]);
    let pi = 0 > 0 || Os;
    let Dr = Nr.length > 0 && y === "prompt" && !ke.show && !ct;
    let Us = Co.useMemo(() => [pi && "tasks", Dr && "workflows", Yt && "tmux", Ee && "bagel", Xr && "bridge", Ce && "frame"].filter(Boolean), [pi, Dr, Yt, Ee, Xr, Ce]);
    let oa = bt($t => $t.workflowFooterIndex);
    let Du = Co.useCallback($t => It(nr => {
      let bo = typeof $t === "function" ? $t(nr.workflowFooterIndex) : $t;
      if (bo === nr.workflowFooterIndex) {
        return nr;
      }
      return {
        ...nr,
        workflowFooterIndex: bo
      };
    }), [It]);
    let nc = Co.useMemo(() => Nr.map($t => $t.id), [Nr]);
    let ju = Co.useRef(nc);
    Co.useEffect(() => {
      let $t = ju.current;
      ju.current = nc;
      let nr = $t[oa];
      if (nr !== undefined) {
        let bo = nc.indexOf(nr);
        if (bo !== -1 && bo !== oa) {
          Du(bo);
          return;
        }
      }
      if (oa >= nc.length) {
        Du(Math.max(0, nc.length - 1));
      }
    }, [nc, oa, Du]);
    let tm = bt($t => $t.footerSelection);
    let Ym = tm && Us.includes(tm) ? tm : null;
    Co.useEffect(() => {
      if (tm && !Ym) {
        It($t => $t.footerSelection === null ? $t : {
          ...$t,
          footerSelection: null,
          frameExpanded: false
        });
      }
    }, [tm, Ym, It]);
    let um = Ym === "tasks";
    let jv = Ym === "workflows";
    let ac = Ym === "tmux";
    let id = Ym === "bagel";
    let Qy = Ym === "bridge";
    let jS = Ym === "frame";
    function Dc($t) {
      if (It(nr => {
        if (nr.footerSelection === $t) {
          return nr;
        }
        if ($t === "frame") {
          return {
            ...nr,
            footerSelection: $t,
            frameNavPath: Object.keys(nr.frameUrls).at(-1) ?? null,
            frameExpanded: false
          };
        }
        if (nr.footerSelection === "frame") {
          return {
            ...nr,
            footerSelection: $t,
            frameExpanded: false
          };
        }
        return {
          ...nr,
          footerSelection: $t
        };
      }), $t === "tasks") {
        ec(Kn);
      }
      if ($t === "workflows") {
        Du(0);
      }
    }
    function Zy($t, nr = false) {
      let bo = Ym ? Us.indexOf(Ym) : -1;
      let qa = Us[bo + $t];
      if (qa) {
        if (Dc(qa), qa === "tasks" && $t < 0 && 0 > 0) {
          ec(0 - 1);
        }
        if (qa === "workflows" && $t < 0) {
          Du(Math.max(0, Nr.length - 1));
        }
        return true;
      }
      if ($t < 0 && nr) {
        Dc(null);
        return true;
      }
      return false;
    }
    let {
      suggestion: Ll,
      markAccepted: Mg,
      logOutcomeAtSubmission: PR,
      markShown: $d
    } = oRc({
      inputValue: ee,
      isAssistantResponding: a
    });
    let up = Co.useMemo(() => Te && Is ? J2(typeof Is === "string" ? Is : Is.display) : ee, [Te, Is, ee]);
    let ub = Co.useMemo(() => tIn(up), [up]);
    let ta = bt($t => $t.ultraplanSessionUrl);
    let db = bt($t => $t.ultraplanLaunching);
    let Nf = Co.useMemo(() => zfe() && !ta && !db ? oor(up) : [], [up, ta, db]);
    let iC = Co.useMemo(() => qz() ? xUl(up) : [], [up]);
    let Vb = Co.useMemo(() => dT() && RDn() ? J2o(up) : [], [up]);
    let [e_, Jx] = Co.useState(false);
    let OR = Co.useRef(false);
    let UE = Zu("chat:workflowKeywordToggle", "Chat", "alt+w");
    let qS = Co.useMemo(() => findBtwTriggerPositions(up), [up]);
    let J0 = Co.useMemo(() => ecr(up).filter(nr => {
      let bo = up.slice(nr.start + 1, nr.end);
      return hasCommand(bo, s);
    }), [up, s]);
    let TP = Co.useMemo(() => [], [up]);
    let Xx = Co.useSyncExternalStore(TRc, vRc);
    let Yn = Co.useMemo(() => Mhr(ht.getState().mcp.clients) ? wRc(up) : [], [up, ht.getState]);
    let ks = Co.useMemo(() => {
      if (!isAgentSwarmsEnabled()) {
        return [];
      }
      if (!Fe?.teammates) {
        return [];
      }
      let $t = [];
      let nr = Fe.teammates;
      if (!nr) {
        return $t;
      }
      let bo = /(^|\s)@([\w-]+)/g;
      let qa = Object.values(nr);
      let Mc;
      while ((Mc = bo.exec(up)) !== null) {
        let dp = Mc[1] ?? "";
        let nu = Mc.index + dp.length;
        let $E = Mc[0].trimStart();
        let Wv = Mc[2];
        let lt = qa.find(Xn => Xn.name === Wv);
        if (lt?.color) {
          let Xn = w3[lt.color];
          if (Xn) {
            $t.push({
              start: nu,
              end: nu + $E.length,
              themeColor: Xn
            });
          }
        }
      }
      return $t;
    }, [up, Fe]);
    let Ui = Co.useMemo(() => h1(up).filter($t => $t.match.startsWith("[Image")).map($t => ({
      start: $t.index,
      end: $t.index + $t.match.length
    })), [up]);
    let Ca = Ui.some($t => $t.start === Ue);
    Co.useEffect(() => {
      let $t = Ui.find(nr => Ue > nr.start && Ue < nr.end);
      if ($t) {
        let nr = ($t.start + $t.end) / 2;
        Ge(Ue < nr ? $t.start : $t.end);
      }
    }, [Ue, Ui]);
    let gc = Co.useMemo(() => {
      let $t = [];
      for (let nr of Ui) {
        if (Ue === nr.start) {
          $t.push({
            start: nr.start,
            end: nr.end,
            color: undefined,
            inverse: true,
            priority: 8
          });
        }
      }
      if (Te && Is && !_r) {
        $t.push({
          start: Ue,
          end: Ue + Wn.length,
          color: "warning",
          priority: 20
        });
      }
      for (let nr of qS) {
        $t.push({
          start: nr.start,
          end: nr.end,
          color: "warning",
          priority: 15
        });
      }
      for (let nr of J0) {
        $t.push({
          start: nr.start,
          end: nr.end,
          color: "suggestion",
          priority: 5
        });
      }
      for (let nr of TP) {
        $t.push({
          start: nr.start,
          end: nr.end,
          color: "suggestion",
          priority: 5
        });
      }
      for (let nr of Yn) {
        $t.push({
          start: nr.start,
          end: nr.end,
          color: "suggestion",
          priority: 5
        });
      }
      for (let nr of ks) {
        $t.push({
          start: nr.start,
          end: nr.end,
          color: nr.themeColor,
          priority: 5
        });
      }
      if (ne) {
        $t.push({
          start: ne.start,
          end: ne.end,
          color: undefined,
          dimColor: true,
          priority: 1
        });
      }
      if (c4e()) {
        for (let nr of ub) {
          for (let bo = nr.start; bo < nr.end; bo++) {
            $t.push({
              start: bo,
              end: bo + 1,
              color: k8(bo - nr.start),
              shimmerColor: k8(bo - nr.start, true),
              priority: 10
            });
          }
        }
      }
      if (zfe()) {
        for (let nr of Nf) {
          for (let bo = nr.start; bo < nr.end; bo++) {
            $t.push({
              start: bo,
              end: bo + 1,
              color: k8(bo - nr.start),
              shimmerColor: k8(bo - nr.start, true),
              priority: 10
            });
          }
        }
      }
      if (dT() && !e_) {
        for (let nr of Vb) {
          for (let bo = nr.start; bo < nr.end; bo++) {
            $t.push({
              start: bo,
              end: bo + 1,
              color: "autoAccept",
              shimmerColor: "autoAcceptShimmer",
              priority: 10
            });
          }
        }
      }
      return $t;
    }, [Te, Wn, Is, _r, Ue, qS, Ui, ks, J0, TP, Yn, ne, ub, Nf, Vb, e_]);
    let {
      addNotification: Je,
      removeNotification: rt
    } = Fi();
    Co.useEffect(() => {
      if (ub.length && c4e()) {
        Je({
          key: "ultrathink-active",
          kind: "feedback",
          text: "Deeper reasoning requested for this turn",
          priority: "immediate",
          timeoutMs: 5000
        });
      } else {
        rt("ultrathink-active");
      }
    }, [Je, rt, ub.length]);
    Co.useEffect(() => {
      if (zfe() && Nf.length) {
        Je({
          key: "ultraplan-active",
          kind: "feedback",
          text: "This prompt will launch an ultraplan session in Claude Code on the web",
          priority: "immediate",
          timeoutMs: 5000
        });
      } else {
        rt("ultraplan-active");
      }
    }, [Je, rt, Nf.length]);
    Co.useEffect(() => {
      if (qz() && iC.length) {
        Je({
          key: "ultrareview-active",
          kind: "contextual",
          text: "Run /code-review ultra after Claude finishes to review these changes in the cloud",
          priority: "immediate",
          timeoutMs: 5000
        });
      }
    }, [Je, iC.length]);
    Co.useEffect(() => {
      if (dT() && Vb.length && !e_) {
        Je({
          key: "workflow-keyword-active",
          text: `Dynamic workflow requested for this turn${UE ? ` \xB7 ${UE} to ignore` : ""}`,
          priority: "immediate",
          timeoutMs: 30000
        });
      } else {
        rt("workflow-keyword-active");
      }
    }, [Je, rt, Vb.length, e_, UE]);
    Co.useEffect(() => {
      if (Vb.length === 0 && e_) {
        Jx(false);
        OR.current = false;
        rt("workflow-keyword-ignored");
      }
    }, [Vb.length, e_, rt]);
    let cn = Co.useCallback(() => {
      if (Vb.length === 0) {
        return;
      }
      let $t = !OR.current;
      if (Jx($t), OR.current = $t, $t) {
        logEvent("tengu_workflow_keyword_dismissed", {});
        Je({
          key: "workflow-keyword-ignored",
          text: `Ultracode keyword ignored for this prompt${UE ? ` \xB7 ${UE} to undo` : ""}`,
          priority: "immediate",
          timeoutMs: 5000
        });
      } else {
        logEvent("tengu_workflow_keyword_restored", {});
        rt("workflow-keyword-ignored");
      }
    }, [Vb.length, UE, Je, rt]);
    let Gn = Co.useRef(ee.length);
    let $r = Co.useRef(ee.length);
    let Ko = Co.useCallback(() => {
      rt("stash-hint");
    }, [rt]);
    Co.useEffect(() => {
      let $t = Gn.current;
      let nr = $r.current;
      let bo = ee.length;
      if (Gn.current = bo, bo > nr) {
        $r.current = bo;
        return;
      }
      if (bo === 0) {
        $r.current = 0;
        return;
      }
      let qa = nr >= 20 && bo <= 5;
      let Mc = $t >= 20 && bo <= 5;
      if (qa && !Mc) {
        if (!getGlobalConfig().hasUsedStash) {
          Je({
            key: "stash-hint",
            kind: "hint",
            jsx: Fd.jsxs(Text, {
              dimColor: true,
              children: ["Tip:", " ", Fd.jsx(Wr, {
                action: "chat:stash",
                context: "Chat",
                fallback: "ctrl+s",
                description: "stash"
              })]
            }),
            priority: "immediate",
            timeoutMs: 5000
          });
        }
        $r.current = bo;
      }
    }, [ee.length, Je]);
    let {
      pushToBuffer: Sa,
      undo: Pi,
      canUndo: Za,
      clearBuffer: Mu
    } = nRc({
      maxBufferSize: 50,
      debounceMs: 1000
    });
    let wu = Co.useCallback(($t, nr, bo, qa) => {
      let Mc = !qa?.continuesGesture && me && (ae !== "INSERT" || !be.current);
      Sa($t, nr, bo, {
        immediate: Mc
      });
      be.current = me;
    }, [Sa, ae, me]);
    ykc({
      input: ee,
      pastedContents: A,
      onInputChange: kt,
      setCursorOffset: Ge,
      setPastedContents: k
    });
    let Lf = vkc({
      input: ee,
      submitCount: E,
      hasMessages: p,
      viewingAgentName: ao
    });
    let DT = Co.useCallback($t => {
      if ($t === "?") {
        logEvent("tengu_help_toggled", {});
        le(dp => !dp);
        return;
      }
      le(false);
      Ko();
      lza();
      let nr = $t.length === ee.length + 1;
      let bo = Ue === 0;
      let qa = a0($t);
      if (bo && qa !== "prompt") {
        if (nr) {
          _(qa);
          return;
        }
        if (ee.length === 0) {
          _(qa);
          let dp = J2($t).replaceAll("\t", "    ");
          wu(ee, Ue, A);
          kt(dp);
          Ge(dp.length);
          return;
        }
      }
      let Mc = $t.replaceAll("\t", "    ");
      if (ee !== Mc) {
        wu(ee, Ue, A);
      }
      It(dp => dp.footerSelection === null ? dp : {
        ...dp,
        footerSelection: null,
        frameExpanded: false
      });
      kt(Mc);
    }, [kt, _, ee, Ue, wu, A, Ko, It]);
    let {
      resetHistory: hy,
      onHistoryUp: X0,
      onHistoryDown: TB,
      dismissSearchHint: _D,
      historyIndex: bD,
      historyTotal: DL,
      historyEdited: f4
    } = QCc(($t, nr, bo) => {
      DT($t);
      _(nr);
      k(bo);
    }, ee, A, Ge, y, wr);
    Co.useEffect(() => {
      hy();
    }, [Gt, hy]);
    Co.useEffect(() => {
      if (Te) {
        _D();
      }
    }, [Te, _D]);
    function n7() {
      if (zb.length > 1) {
        return;
      }
      let $t = ee.indexOf(`
`);
      if ($t !== -1 && Ue > $t) {
        return;
      }
      let nr = Bn(Xe, $G);
      if (bq()) {
        let bo = ht.getState().queueEditIndex;
        if (bo === null && nr > 0) {
          wt(nr - 1);
          return;
        }
        if (bo !== null) {
          if (bo > 0) {
            wt(bo - 1);
          } else {
            wt(null);
            X0();
          }
          return;
        }
      } else if (nr > 0) {
        gN();
        return;
      }
      X0();
    }
    function EB() {
      if (zb.length > 1) {
        return;
      }
      let $t = ee.lastIndexOf(`
`);
      if ($t !== -1 && Ue <= $t) {
        return;
      }
      if (bq()) {
        let nr = ht.getState().queueEditIndex;
        if (nr !== null) {
          let bo = Bn(Xe, $G);
          if (nr < bo - 1) {
            wt(nr + 1);
          } else {
            wt(null);
          }
          return;
        }
      }
      if (TB() && Us.length > 0) {
        let nr = Us[0];
        if (Dc(nr), nr === "tasks" && !getGlobalConfig().hasSeenTasksHint) {
          saveGlobalConfig(bo => bo.hasSeenTasksHint ? bo : {
            ...bo,
            hasSeenTasksHint: true
          });
        }
      }
    }
    let [Ng, Vc] = Co.useState({
      suggestions: [],
      selectedSuggestion: -1,
      hoveredSuggestionId: null,
      commandArgumentHint: undefined
    });
    let Il = Co.useCallback($t => {
      Vc(nr => typeof $t === "function" ? $t(nr) : $t);
    }, []);
    let WH = Co.useCallback(() => {
      let $t = ht.getState().queueEditIndex;
      if ($t === null) {
        return false;
      }
      let nr = _ba($t, ee, Ue);
      if (wt(null), !nr) {
        return false;
      }
      if (kt(nr.text), _("prompt"), Ge(nr.cursorOffset), nr.images.length > 0) {
        k(bo => {
          let qa = {
            ...bo
          };
          for (let Mc of nr.images) {
            qa[Mc.id] = Mc;
          }
          return qa;
        });
      }
      Pe("input_queue_pop_to_edit");
      return true;
    }, [kt, _, ee, Ue, k, wt, ht]);
    let t_ = Co.useCallback(async ($t, nr = false) => {
      $t = $t.trimEnd();
      let bo = ht.getState();
      if (bq() && bo.queueEditIndex !== null && WH()) {
        return;
      }
      if (bo.footerSelection && Us.includes(bo.footerSelection)) {
        return;
      }
      if (zr.current !== null) {
        zr.current();
        zr.current = null;
        Y(true);
        logForDebugging("[auto-mode] onSubmit: consent debounce pending \u2014 showing opt-in dialog instead of submitting");
        return;
      }
      let qa = Object.values(A).some(Xn => Xn.type === "image");
      let Mc = He.text;
      let dp = $t === Mc;
      let nu = Boolean(dp && Mc && He.acceptedAt > He.shownAt);
      if (dp && Mc && !qa && !bo.viewingAgentTaskId) {
        if (He.shownAt > 0) {
          Mg();
        }
      }
      if (isAgentSwarmsEnabled()) {
        let Xn = FRc($t);
        if (Xn) {
          let rr = await URc(Xn.recipientName, nX(Xn.message, A), Fe, writeToMailbox);
          if (rr.success) {
            Je({
              key: "direct-message-sent",
              kind: "feedback",
              text: `Sent to @${rr.recipientName}`,
              priority: "immediate",
              timeoutMs: 3000
            });
            kt("");
            k({});
            Ge(0);
            Mu();
            hy();
            Pe("input_at_member_message");
            return;
          } else if (rr.error === "no_team_context") {
            ;
          }
        }
      }
      if ($t.trim() === "" && !qa) {
        Pe("prompt_submit_empty");
        return;
      }
      let $E = Ng.suggestions.length > 0 && Ng.suggestions.every(Xn => Xn.description === "directory");
      if (Ng.suggestions.length > 0 && !nr && !$E) {
        logForDebugging(`[onSubmit] early return: suggestions showing (count=${Ng.suggestions.length})`);
        return;
      }
      if (He.text && He.shownAt > 0) {
        PR($t);
      }
      rt("stash-hint");
      hy();
      let Wv = vXt(ht.getState());
      if (Wv.type !== "leader" && H) {
        let Xn = Jve($t);
        let rr = Xn && findCommand(Xn.commandName, s);
        if (!(rr?.type === "local" || rr?.type === "local-jsx")) {
          logEvent("tengu_transcript_input_to_teammate", {});
          await H($t, Wv.task, {
            setCursorOffset: Ge,
            clearBuffer: Mu,
            resetHistory: () => {}
          });
          return;
        }
      }
      let lt = OR.current || nu ? {
        suppressWorkflowKeyword: OR.current || undefined,
        inputSource: nu ? "suggestion_accepted" : undefined
      } : undefined;
      await F($t, {
        setCursorOffset: Ge,
        clearBuffer: Mu,
        resetHistory: () => {}
      }, lt);
    }, [He, Fe, ht, Us, Ng.suggestions, s, F, H, Mu, hy, PR, Mg, A, k, rt, Je, kt, WH]);
    Ye.current = t_;
    let {
      suggestions: zb,
      selectedSuggestion: EP,
      commandArgumentHint: tu,
      suggestionsEmptyMessage: Kb,
      inlineGhostText: h4,
      maxColumnWidth: s6,
      handleKeyDown: ege,
      selectSuggestion: tge,
      setHoveredSuggestion: GH,
      hoveredSuggestionId: r7
    } = DRc({
      commands: s,
      onInputChange: kt,
      onSubmit: t_,
      setCursorOffset: Ge,
      input: ee,
      cursorOffset: Ue,
      mode: y,
      agents: i,
      setSuggestionsState: Il,
      suggestionsState: Ng,
      suppressSuggestions: Te || bD > 0,
      markAccepted: Mg,
      onModeChange: _,
      sessionEnvVars: oe
    });
    function n_($t) {
      if (tc) {
        return;
      }
      if (kn($t), $t.defaultPrevented || $t.didStopImmediatePropagation()) {
        return;
      }
      if (ege($t), $t.defaultPrevented || $t.didStopImmediatePropagation()) {
        return;
      }
      if (dT() && $t.name === "backspace" && !$t.meta && !$t.ctrl && !$t.superKey && !Te && (!mL() || ae === "INSERT") && !OR.current && Vb.some(nr => nr.end === Ue)) {
        $t.preventDefault();
        cn();
        return;
      }
      if (Wt() === "macos" && X7i($t.key)) {
        let nr = uro[$t.key];
        let bo = getNativeCSIuTerminalDisplayName();
        Je({
          key: "option-meta-hint",
          kind: "contextual",
          jsx: bo ? Fd.jsxs(Text, {
            dimColor: true,
            children: ["To enable ", nr, ", set ", Fd.jsx(Text, {
              bold: true,
              children: "Option as Meta"
            }), " in", " ", bo, " preferences (\u2318,)"]
          }) : Fd.jsxs(Text, {
            dimColor: true,
            children: ["To enable ", nr, ", run /terminal-setup"]
          }),
          priority: "immediate",
          timeoutMs: 5000
        });
      }
      if (SD($t), $t.name === "escape") {
        if ($ee()) {
          return;
        }
        if (mL() && ae !== "NORMAL") {
          return;
        }
        if (!bq()) {
          if (Xe.some($G)) {
            gN();
            return;
          }
        }
        if (p && !ee && !a) {
          WS();
        }
      }
      if ($t.name === "return" && ce) {
        le(false);
      }
    }
    function SD($t) {
      if ($t.name === "escape" && mL() && ae !== "NORMAL") {
        return;
      }
      let nr = bq() && $t.name === "escape";
      if ((Ue === 0 || nr) && ($t.name === "escape" || $t.name === "backspace" || $t.name === "delete" || $t.ctrl && $t.key === "u")) {
        _("prompt");
        le(false);
      }
      if (ce && ee === "" && ($t.name === "backspace" || $t.name === "delete")) {
        le(false);
      }
    }
    function $ee() {
      if (ht.getState().queueEditIndex !== null) {
        wt(null);
        return true;
      }
      if (N && U) {
        U();
        return true;
      }
      if (ce) {
        le(false);
        return true;
      }
      return false;
    }
    function o7($t) {
      if (SD($t), $t.ctrl || $t.meta) {
        return;
      }
      if (mL() && ae === "NORMAL") {
        if ($t.key === "j") {
          $t.preventDefault();
          return vP();
        }
        if ($t.key === "k") {
          $t.preventDefault();
          return Z0();
        }
        if ($t.key === "l") {
          $t.preventDefault();
          return _4();
        }
        if ($t.key === "h") {
          $t.preventDefault();
          return l6();
        }
      }
      if ([...$t.key].length === 1) {
        $t.preventDefault();
        DT(ee.slice(0, Ue) + $t.key + ee.slice(Ue));
        Ge(Ue + $t.key.length);
      }
    }
    let i6 = y === "prompt" && zb.length === 0 && Ll && !Gt;
    if (i6) {
      $d();
    }
    if (He.text && !Ll && He.shownAt === 0 && !Gt) {
      W$("timing", He.text);
      It($t => ({
        ...$t,
        promptSuggestion: {
          text: null,
          promptId: null,
          shownAt: 0,
          acceptedAt: 0,
          generationRequestId: null
        }
      }));
    }
    function ML($t, nr, bo, qa, Mc, dp) {
      logEvent("tengu_paste_image", {});
      Pe(Mc ? "input_image_drag" : "input_image_paste");
      _("prompt");
      let nu = gi.current++;
      let $E = {
        id: nu,
        type: "image",
        content: $t,
        mediaType: nr || "image/png",
        filename: bo || "Pasted image",
        dimensions: qa,
        sourcePath: Mc
      };
      LRt($E, It);
      FRt($E, It);
      k(lt => ({
        ...lt,
        [nu]: $E
      }));
      We.current = {
        ...We.current,
        [nu]: $E
      };
      let Wv = Ks.current ? " " : "";
      hN(Wv + ALn(nu), {
        continuesGesture: dp
      });
      Ks.current = true;
    }
    let s7 = Co.useMemo(() => Object.values(A).some($t => $t.type === "image"), [A]);
    Co.useEffect(() => {
      if (!s7) {
        return;
      }
      let $t = new Set(h1(ee).map(nr => nr.id));
      k(nr => {
        let bo = Object.values(nr).filter(Mc => Mc.type === "image" && !$t.vZc(Mc.id));
        if (bo.length === 0) {
          return nr;
        }
        let qa = {
          ...nr
        };
        for (let Mc of bo) {
          delete qa[Mc.id];
        }
        return qa;
      });
    }, [ee, s7, k]);
    function fN($t) {
      let nr = xQi(ee, A);
      if (nr?.id !== $t) {
        return false;
      }
      if (wu(ee, Ue, A), kt(nr.expanded), Ge(nr.cursorOffset), k(bo => {
        let {
          [nr.id]: qa,
          ...Mc
        } = bo;
        return Mc;
      }), qo.current) {
        qo.current();
        qo.current = null;
      }
      Vr(false);
      return true;
    }
    function a6($t) {
      Ks.current = false;
      let nr = Li($t).replace(/\r\n|\r/g, `
`).replaceAll("\t", "    ");
      if (ee.length === 0) {
        let dp = a0(nr);
        if (dp !== "prompt") {
          _(dp);
          nr = J2(nr);
        }
      }
      let bo = gi.current - 1;
      if (A[bo]?.type === "text" && A[bo].content === nr && fN(bo)) {
        return;
      }
      let qa = KPe(nr);
      let Mc = Math.max(0, Math.min(Sn - 10, 2));
      if (nr.length > 800 || qa > Mc) {
        Pe("input_paste_large");
        let dp = gi.current++;
        let nu = {
          id: dp,
          type: "text",
          content: nr
        };
        if (k($E => ({
          ...$E,
          [dp]: nu
        })), hN(out(dp, qa)), nr.length <= 1e5) {
          if (Vr(true), qo.current) {
            qo.current();
          }
          qo.current = Xo.setTimeout(() => {
            Vr(false);
            qo.current = null;
          }, 8000);
        }
      } else {
        hN(nr);
      }
    }
    let xA = Co.useCallback(($t, nr) => {
      if (!Ks.current) {
        return $t;
      }
      if (Ks.current = false, _ql($t, nr) && !bql($t)) {
        return " " + $t;
      }
      return $t;
    }, []);
    function hN($t, nr) {
      let bo = Tt.current;
      let qa = Be.current;
      wu(bo, qa, We.current, nr);
      let Mc = bo.slice(0, qa) + $t + bo.slice(qa);
      kt(Mc);
      Be.current = qa + $t.length;
      Ge(qa + $t.length);
    }
    let WS = _G(() => {}, () => C());
    let gN = Co.useCallback(() => {
      let $t = cWt(ee, Ue);
      if (!$t) {
        return false;
      }
      if (kt($t.text), _("prompt"), Ge($t.cursorOffset), $t.images.length > 0) {
        k(nr => {
          let bo = {
            ...nr
          };
          for (let qa of $t.images) {
            bo[qa.id] = qa;
          }
          return bo;
        });
      }
      Pe("input_queue_pop_to_edit");
      return true;
    }, [kt, _, ee, Ue, k]);
    ahr(x, function ($t) {
      logEvent("tengu_ext_at_mentioned", {});
      hN(lhr($t, ee[Ue - 1]));
    });
    let Jm = Co.useCallback(() => {
      if (Za) {
        let $t = Pi();
        if ($t) {
          kt($t.text);
          Ge($t.cursorOffset);
          k($t.pastedContents);
        }
      }
    }, [Za, Pi, kt, k]);
    let DR = Co.useCallback(() => {
      wu(ee, Ue, A);
      let $t = ee.slice(0, Ue) + `
` + ee.slice(Ue);
      kt($t);
      Ge(Ue + 1);
    }, [ee, Ue, kt, wu, A]);
    let Qx = Co.useCallback(async () => {
      logEvent("tengu_external_editor_used", {});
      Ri(true);
      try {
        let $t = getGlobalConfig().externalEditorContext ? vmr(d.current).messages.join(`

`) || undefined : undefined;
        let nr = await KZ(ee, A, $t);
        if (nr.error) {
          Je({
            key: "external-editor-error",
            kind: "warning",
            text: nr.error,
            color: "warning",
            priority: "high"
          });
          Et("input_external_editor", "editor_error");
        } else {
          Pe("input_external_editor");
        }
        if (nr.content !== null && nr.content !== ee) {
          wu(ee, Ue, A);
          kt(nr.content);
          Ge(nr.content.length);
        }
      } catch ($t) {
        if ($t instanceof Error) {
          Oe($t);
        }
        Je({
          key: "external-editor-error",
          kind: "warning",
          text: `External editor failed: ${he($t)}`,
          color: "warning",
          priority: "high"
        });
        Ae("input_external_editor", "spawn_failed");
      } finally {
        Ri(false);
      }
    }, [ee, Ue, A, d, wu, kt, Je]);
    let nae = Co.useCallback(() => {
      if (ee.trim() === "" && b !== undefined) {
        if (kt(b.text), Ge(b.cursorOffset), k(b.pastedContents), b.launchWarning) {
          bwe(b.launchWarning);
        }
        S(undefined);
        Pe("input_stash");
      } else if (ee.trim() !== "") {
        S({
          text: ee,
          cursorOffset: Ue,
          pastedContents: A,
          launchWarning: dLl() ?? undefined
        });
        kt("");
        Ge(0);
        k({});
        saveGlobalConfig($t => {
          if ($t.hasUsedStash) {
            return $t;
          }
          return {
            ...$t,
            hasUsedStash: true
          };
        });
        Pe("input_stash");
      }
    }, [ee, Ue, b, kt, S, A, k]);
    let [Hee, jee] = Co.useState(0);
    Co.useLayoutEffect(() => {
      if (Hee === 0) {
        return;
      }
      rVd.get(process.stdout)?.forceRedraw();
    }, [Hee]);
    let Zx = Zu("chat:clearScreen", "Chat", "cmd+k");
    let Q0 = Zu("chat:clearInput", "Chat", "ctrl+l");
    let TD = Co.useRef(Zx);
    let ED = Co.useCallback($t => {
      if (!qs()) {
        return;
      }
      if ($t) {
        Ie({
          show: true,
          key: TD.current,
          action: "clear"
        });
      } else {
        Ie(nr => nr.action === "clear" ? {
          show: false
        } : nr);
      }
    }, []);
    let g4 = Co.useCallback(() => {
      if (!qs()) {
        return;
      }
      Ye.current?.("/clear", true);
    }, []);
    let y4 = _G(ED, g4, undefined, 2000);
    let vD = Co.useCallback(() => {
      TD.current = Zx;
      y4();
    }, [Zx, y4]);
    pkc(vD);
    let Lg = Co.useCallback(() => {
      jee($t => $t + 1);
      TD.current = Q0;
      y4();
    }, [Q0, y4]);
    let NL = Co.useCallback(() => {
      if (!va()) {
        return false;
      }
      Je({
        key: "remote-inference-config-unavailable",
        kind: "feedback",
        text: "Fast mode switching in cloud sessions is coming soon \u2014 set at session creation for now",
        priority: "medium"
      });
      return true;
    }, [Je]);
    let BE = Co.useCallback(() => {
      if (va()) {
        Je({
          key: "remote-model-picker-unavailable",
          kind: "feedback",
          text: "Use /model to change the model in cloud sessions",
          priority: "medium"
        });
        return;
      }
      if (fs($t => !$t), ce) {
        le(false);
      }
    }, [ce, Je]);
    let rae = Co.useCallback(() => {
      if (!c_() && NL()) {
        return;
      }
      if (Mn($t => !$t), ce) {
        le(false);
      }
    }, [ce, Je, NL]);
    let Fg = Co.useCallback(() => {
      if (!c_() && NL()) {
        return;
      }
      if (Er($t => !$t), ce) {
        le(false);
      }
    }, [ce, NL]);
    let kA = Co.useCallback(() => {
      if (qo.current) {
        qo.current();
        qo.current = null;
      }
      if (Vr(false), isAgentSwarmsEnabled() && Lr && Gt) {
        let Mc = {
          ...n,
          mode: Lr.permissionMode
        };
        let dp = $hr(Mc, undefined);
        logEvent("tengu_mode_cycle", {
          to: dp
        });
        Pe("mode_switch");
        let nu = Gt;
        if (It($E => {
          let Wv = $E.tasks[nu];
          if (!Wv || Wv.type !== "in_process_teammate") {
            return $E;
          }
          if (Wv.permissionMode === dp) {
            return $E;
          }
          return {
            ...$E,
            tasks: {
              ...$E.tasks,
              [nu]: {
                ...Wv,
                permissionMode: dp
              }
            }
          };
        }), ce) {
          le(false);
        }
        return;
      }
      let $t = nn !== null ? {
        ...n,
        mode: "auto"
      } : n;
      logForDebugging(`[auto-mode] handleCycleMode: currentMode=${$t.mode} appStateMode=${n.mode} isAutoModeAvailable=${n.isAutoModeAvailable} showAutoModeOptIn=${Or} timeoutPending=${!!zr.current}`);
      let nr = $hr($t, Fe);
      if (nr === $t.mode) {
        if (Ae("mode_switch", "no_other_modes"), va()) {
          Je({
            key: "remote-permission-mode-noop",
            kind: "feedback",
            text: "No other permission modes are available in this cloud session",
            priority: "medium"
          });
        }
        return;
      }
      let bo = false;
      if (bo = nr === "auto" && $t.mode !== "auto" && !hasAutoModeOptIn() && !Gt, bo) {
        if (qn(n.mode), zr.current) {
          zr.current();
        }
        if (zr.current = Xo.setTimeout(() => {
          Y(true);
          zr.current = null;
        }, 800), Pe("mode_switch"), ce) {
          le(false);
        }
        return;
      }
      if (Or || zr.current) {
        if (Or) {
          logEvent("tengu_auto_mode_opt_in_dialog_decline", {});
        }
        if (Y(false), zr.current) {
          zr.current();
          zr.current = null;
        }
        qn(null);
      }
      if (Se) {
        qe(false);
      }
      let {
        context: qa
      } = BRc($t, Fe, "shift_tab");
      if (logEvent("tengu_mode_cycle", {
        to: nr
      }), !c_()) {
        Pe("mode_switch");
      }
      if (nr === "plan") {
        Pe("mode_plan_enter");
      } else if (n.mode === "plan") {
        Pe("mode_plan_exit");
      }
      if (nr === "auto") {
        Pe("mode_auto_enter");
      }
      if (nr === "plan") {
        saveGlobalConfig(Mc => ({
          ...Mc,
          lastPlanModeUse: Date.now()
        }));
      }
      if (It(Mc => ({
        ...Mc,
        toolPermissionContext: {
          ...qa,
          mode: nr
        }
      })), r({
        ...qa,
        mode: nr
      }), Ze.current = Ze.current.then(() => syncTeammateMode(nr, Fe?.teamName)), ce) {
        le(false);
      }
    }, [n, nn, Fe, Gt, Lr, It, r, ce, Or, Se, Je, Xo]);
    Co.useEffect(() => {
      if (n.mode !== "auto") {
        if (Se) {
          qe(false);
        }
        return;
      }
      if (Or || Qe.current || Gt || a || li() || getIsRemoteMode() || Me.CLAUDE_BRIDGE_REATTACH_SESSION || !GRc()) {
        return;
      }
      Ht.current = Xo.setTimeout(() => {
        Ht.current = null;
        Qe.current = true;
        qe(true);
      }, 800);
      return () => {
        if (Ht.current) {
          Ht.current();
          Ht.current = null;
        }
      };
    }, [n.mode, Or, Se, Gt, a, Xo]);
    let qv = Co.useCallback(() => {
      qe(false);
      It($t => ({
        ...$t,
        initialMessage: {
          message: In({
            content: "/auto-mode-setup"
          })
        }
      }));
    }, [It]);
    let uh = Co.useCallback(() => {
      qe(false);
    }, []);
    let i7 = Co.useCallback(() => {
      {
        Y(false);
        qn(null);
        let $t = transitionPermissionMode(nn ?? n.mode, "auto", n, "auto_opt_in");
        if (It(nr => ({
          ...nr,
          toolPermissionContext: {
            ...$t,
            mode: "auto"
          }
        })), r({
          ...$t,
          mode: "auto"
        }), Pe("mode_auto_enter"), ce) {
          le(false);
        }
      }
    }, [ce, nn, n, It, r]);
    let ek = Co.useCallback($t => {
      if (logForDebugging(`[auto-mode] handleAutoModeOptInDecline(${$t}): clearing pending consent (was ${nn})`), Pe("mode_auto_opt_in_decline"), Y(false), zr.current) {
        zr.current();
        zr.current = null;
      }
      if (nn) {
        if (qn(null), $t === "dont-ask") {
          It(nr => ({
            ...nr,
            toolPermissionContext: {
              ...nr.toolPermissionContext,
              isAutoModeAvailable: false
            }
          }));
          r({
            ...n,
            isAutoModeAvailable: false
          });
        }
      }
    }, [nn, n, It, r]);
    let {
      dispatchPasteEvent: zH
    } = MXd();
    let KH = Co.useCallback(() => {
      Br(true);
      VPe(Yg(re)).then(async $t => {
        if ($t) {
          ML($t.base64, $t.mediaType, undefined, $t.dimensions);
          return;
        }
        let nr = await J$t("clipboard");
        if (nr && !ZXi(nr)) {
          Et("input_image_paste", "text_fallback");
          zH(nr);
          return;
        }
        Ae("input_image_paste", nr ? "binary_garbage" : "not_found");
        let bo = dx("chat:imagePaste", "Chat", "ctrl+v");
        let qa = Me.isSSH() ? "No image found in clipboard. You're SSH'd; try scp?" : `No image found in clipboard. Use ${bo} to paste images.`;
        Je({
          key: "no-image-in-clipboard",
          kind: "feedback",
          text: qa,
          priority: "immediate",
          timeoutMs: 1000
        });
      }).catch($t => {
        Ae("input_image_paste", "clipboard_read_failed");
        Oe($t);
      }).finally(() => Br(false));
    }, [Je, ML, zH, re]);
    let nm = tE();
    Co.useEffect(() => {
      if (!nm || se) {
        return;
      }
      let $t = Z7i(ZWe("enter"), "Chat", nm.bindings) === "chat:submit";
      return nm.registerHandler({
        action: "chat:submit",
        context: "Chat",
        handler: () => {
          Ye.current?.(Tt.current);
        },
        singleKey: !$t
      });
    }, [nm, se]);
    let dh = Co.useMemo(() => ({
      "chat:undo": Jm,
      "chat:newline": DR,
      "chat:clearScreen": vD,
      "chat:externalEditor": Qx,
      "chat:stash": nae,
      "chat:clearInput": Lg,
      "chat:modelPicker": BE,
      "chat:thinkingToggle": Fg,
      "chat:cycleMode": kA,
      "chat:imagePaste": KH
    }), [Jm, DR, vD, Qx, nae, Lg, BE, Fg, kA, KH]);
    jo(dh, {
      context: "Chat",
      isActive: !se && !Te
    });
    uo("chat:fastMode", rae, {
      context: "Chat",
      isActive: !se && lc() && zA()
    });
    uo("chat:workflowKeywordToggle", cn, {
      context: "Chat",
      isActive: !se && Vb.length > 0
    });
    uo("help:dismiss", () => {
      le(false);
    }, {
      context: "Help",
      isActive: ce
    });
    function Xi() {
      if (va()) {
        Je({
          key: "remote-history-search-unavailable",
          kind: "feedback",
          text: "History search isn't available in cloud sessions yet",
          priority: "medium"
        });
        return;
      }
      On(true);
      le(false);
    }
    uo("history:search", Xi, {
      context: "Global",
      isActive: lre() && !se
    });
    function Z0() {
      if (um && 0 > 0 && Ms > Kn) {
        ec($t => $t - 1);
        return;
      }
      if (jv && oa > 0) {
        Du($t => $t - 1);
        return;
      }
      Zy(-1, true);
    }
    function vP() {
      if (um && 0 > 0) {
        if (Ms < 0 - 1) {
          ec($t => $t + 1);
          return;
        }
        Zy(1);
        return;
      }
      if (um) {
        if (!Zy(1)) {
          O(true);
          Dc(null);
        }
        return;
      }
      if (jv) {
        if (oa < Nr.length - 1) {
          Du($t => $t + 1);
          return;
        }
        Zy(1);
        return;
      }
      Zy(1);
    }
    function oae($t) {
      It(nr => {
        let bo = Object.keys(nr.frameUrls);
        let qa = bo.length;
        if (qa <= 1) {
          return nr;
        }
        let Mc = Vhr(Object.entries(nr.frameUrls), nr.frameNavPath);
        let dp = bo[(Mc + $t + qa) % qa] ?? null;
        if (dp === nr.frameNavPath && !nr.frameExpanded) {
          return nr;
        }
        return {
          ...nr,
          frameNavPath: dp,
          frameExpanded: false
        };
      });
    }
    function _4() {
      if (jS) {
        oae(1);
        return;
      }
      Zy(1);
    }
    function l6() {
      if (jS) {
        oae(-1);
        return;
      }
      Zy(-1);
    }
    jo({
      "footer:up": Z0,
      "footer:down": vP,
      "footer:next": _4,
      "footer:previous": l6,
      "footer:openSelected": () => {
        if (ce) {
          le(false);
        }
        switch (Ym) {
          case "tasks":
            {
              let $t = Ms >= 1 ? khe(gt, Ia, Gt)[Ms - 1]?.id : undefined;
              if ($t) {
                iCe($t, It);
              } else if (Ms === 0 && 0 > 0) {
                I5(It);
              } else {
                O(true);
                Dc(null);
              }
              break;
            }
          case "workflows":
            {
              let $t = Nr[oa];
              if ($t) {
                Pe("workflow_progress_preview");
                It(nr => nr.workflowDetail?.taskId === $t.id ? nr : {
                  ...nr,
                  workflowDetail: {
                    taskId: $t.id
                  }
                });
                Dc(null);
              }
              break;
            }
          case "tmux":
            break;
          case "bagel":
            break;
          case "bridge":
            Hs(true);
            Dc(null);
            break;
          case "frame":
            {
              let $t = ht.getState();
              let nr = Object.entries($t.frameUrls);
              let bo = nr[Vhr(nr, $t.frameNavPath)]?.[1]?.url;
              if (bo) {
                Ac(bo);
                Pe("frame_link_open");
              }
              It(qa => qa.frameExpanded ? qa : {
                ...qa,
                frameExpanded: true
              });
              break;
            }
        }
      },
      "footer:clearSelection": () => {
        if (jS && ht.getState().frameExpanded) {
          It($t => !$t.frameExpanded ? $t : {
            ...$t,
            frameExpanded: false
          });
          return;
        }
        $ee();
        Dc(null);
      },
      "footer:close": () => {
        if (um && Ms >= 1) {
          let $t = khe(gt, Ia, Gt)[Ms - 1];
          if (!$t) {
            return false;
          }
          if (mt === "viewing-agent" && $t.id === Gt) {
            DT(ee.slice(0, Ue) + "x" + ee.slice(Ue));
            Ge(Ue + 1);
            return;
          }
          if (txt($t, yt, It) === "dismissed") {
            ec(bo => Math.max(Kn, bo - 1));
          }
          return;
        }
        if (jv) {
          let $t = Nr[oa];
          if (!$t) {
            return false;
          }
          LRc($t.id, $t.status, yt, It);
          return;
        }
        return false;
      }
    }, {
      context: "Footer",
      isActive: !!Ym && !se
    });
    let b4 = sgr();
    let vB = useIsScreenReaderEnabled();
    let LL = lc() ? zle() : false;
    let FL = lc() ? vn && (zA() || LL) : false;
    let a7 = Rkc(FL ?? false);
    let Ug = FL ? vB ? LL ? "fast mode (cooling down)" : "fast mode" : a7 ? `${XUe(true, LL)} ${_$u.reset.dim("/fast")}` : XUe(true, LL) : undefined;
    let S4 = zjl(zn, re, jt);
    let MR = S4 !== undefined && Jne(re, zn, Pn);
    let wB = Yjl(MR);
    let sae = Jjl([wB, Ug]);
    let nge = ukc(bD, DL, f4);
    let T4 = nge ? {
      content: ` ${_$u.dim(nge)} `,
      position: "top",
      align: "start",
      offset: 2
    } : undefined;
    let NR = Kjl(S4, MR);
    Co.useEffect(() => {
      if (!NR) {
        rt("effort-level");
        return;
      }
      rt("effort-level");
      Je({
        key: "effort-level",
        kind: "feedback",
        text: NR,
        priority: "high",
        timeoutMs: 1e4
      });
    }, [NR, Je, rt]);
    let UL = rn - 3;
    let CB = Ikc(Pn === true, rn);
    let E4 = qs() ? Math.max(3, Math.floor(Sn / 2) - 5) : undefined;
    let iae = Co.useCallback($t => {
      if (Te) {
        return;
      }
      if (It(Mc => Mc.footerSelection === null ? Mc : {
        ...Mc,
        footerSelection: null,
        frameExpanded: false
      }), !ee) {
        return;
      }
      let nr = zl.fromText(ee, UL, Ue);
      let bo = nr.getViewportStartLine(E4);
      let qa = nr.measuredText.getOffsetFromPosition({
        line: $t.localRow + bo,
        column: $t.localCol
      });
      Ge(qa);
    }, [ee, UL, Te, Ue, E4, It]);
    let qee = Co.useRef(null);
    let l7 = Co.useRef(null);
    l7.current = $t => {
      if (!ee || Te || se) {
        return false;
      }
      let nr = qee.current;
      let bo = nr ? Kg.get(nr) : undefined;
      let qa = FHt($t);
      if (!bo || !qa) {
        return false;
      }
      let {
        start: Mc,
        end: dp
      } = qa;
      if (Mc.row < bo.y || dp.row < bo.y || Mc.row >= bo.y + bo.height || dp.row >= bo.y + bo.height) {
        return false;
      }
      let nu = zl.fromText(ee, UL, Ue);
      let $E = nu.getViewportStartLine(E4);
      let Wv = (rr, Gr) => nu.measuredText.getOffsetFromPosition({
        line: rr - bo.y + $E,
        column: Math.max(0, Gr - bo.x)
      });
      let lt = Math.max(0, Wv(Mc.row, Mc.col));
      let Xn = Math.min(ee.length, Wv(dp.row, dp.col + 1));
      if (Xn <= lt) {
        return false;
      }
      wu(ee, Ue, A);
      kt(ee.slice(0, lt) + ee.slice(Xn));
      Ge(lt);
      return true;
    };
    let YH = kir();
    Co.useEffect(() => (YH.setHandler($t => l7.current?.($t) ?? false), () => YH.setHandler(null)), [YH]);
    let Wee = Co.useCallback($t => O($t ?? true), [O]);
    let JH = t?.source === "diff" && t.text && !Gt ? `Comment on ${t.lineCount} selected ${t.lineCount === 1 ? "line" : "lines"}\u2026` : undefined;
    let v4 = i6 && Ll ? Ll : JH ?? Lf;
    let c7 = Co.useMemo(() => ee.includes(`
`), [ee]);
    let XH = Co.useRef(false);
    let aae = Co.useCallback(($t, nr) => {
      let bo = false;
      clearRefusalFallbackModelLatch();
      It(dp => (bo = lc() && !yh($t) && !!dp.fastMode, {
        ...dp,
        mainLoopModel: $t,
        mainLoopModelForSession: null,
        ...(bo && {
          fastMode: false
        })
      }));
      fs(false);
      let qa = (vn ?? false) && !bo;
      let Mc = `Model set to ${modelDisplayString($t)}${XH.current ? " and saved as your default for new sessions" : " for this session only"}`;
      if (XH.current = false, KFe($t, qa, isOpus1mMergeEnabled())) {
        Mc += " \xB7 Draws from usage credits";
      }
      if (bo) {
        Mc += " \xB7 Fast mode OFF";
      }
      Je({
        key: "model-switched",
        kind: "feedback",
        jsx: Fd.jsx(Text, {
          children: Mc
        }),
        priority: "immediate",
        timeoutMs: 3000
      });
      logEvent("tengu_model_picker_hotkey", {
        model: $t
      });
    }, [It, Je, vn]);
    let w4 = Co.useCallback(() => {
      XH.current = false;
      fs(false);
    }, []);
    let c6 = Co.useMemo(() => {
      if (!ya) {
        return null;
      }
      return Fd.jsx(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: Fd.jsx(nUe, {
          initial: bn,
          sessionModel: Ct,
          onSelect: aae,
          onSetDefault: $t => {
            if (FZ($t)) {
              return;
            }
            XH.current = true;
            RQt($t);
          },
          onCancel: w4,
          isStandaloneCommand: true,
          showFastModeNotice: lc() && vn && yh(bn) && zA()
        })
      });
    }, [ya, bn, Ct, aae, w4, vn]);
    let lae = Co.useCallback($t => {
      if (Mn(false), $t) {
        Je({
          key: "fast-mode-toggled",
          kind: "feedback",
          jsx: Fd.jsx(Text, {
            children: $t
          }),
          priority: "immediate",
          timeoutMs: 3000
        });
      }
    }, [Je]);
    let Gee = Co.useMemo(() => {
      if (!lr) {
        return null;
      }
      return Fd.jsx(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: Fd.jsx(FastModePicker, {
          onDone: lae,
          unavailableReason: Vle()
        })
      });
    }, [lr, lae]);
    let u7 = Co.useCallback($t => {
      It(nr => ({
        ...nr,
        thinkingEnabled: $t
      }));
      Er(false);
      Ul()?.sendControlRequest({
        subtype: "set_max_thinking_tokens",
        max_thinking_tokens: $t ? null : 0
      }).catch(nr => {
        logForDebugging(`[remote] set_max_thinking_tokens failed: ${nr}`);
      });
      logEvent("tengu_thinking_toggled_hotkey", {
        enabled: $t
      });
      Pe("thinking_toggle");
      Je({
        key: "thinking-toggled-hotkey",
        kind: "feedback",
        jsx: Fd.jsxs(Text, {
          color: $t ? "suggestion" : undefined,
          dimColor: !$t,
          children: ["Thinking ", $t ? "on" : "off"]
        }),
        priority: "immediate",
        timeoutMs: 3000
      });
    }, [It, Je]);
    let Vee = Co.useCallback(() => {
      Er(false);
    }, []);
    let cae = Co.useMemo(() => {
      if (!Un) {
        return null;
      }
      return Fd.jsx(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: Fd.jsx(cxc, {
          currentValue: hn ?? true,
          onSelect: u7,
          onCancel: Vee,
          isMidConversation: m
        })
      });
    }, [Un, hn, u7, Vee, m]);
    let uae = Co.useMemo(() => Or ? Fd.jsx(AutoModeOptInDialog, {
      onAccept: i7,
      onDecline: ek
    }) : Se ? Fd.jsx(VRc, {
      onAccept: qv,
      onLater: uh,
      onDismiss: uh
    }) : null, [Or, i7, ek, Se, qv, uh]);
    uXl(qs() ? uae : null);
    let yN = on ? gt[on] : undefined;
    if (yN && yN.type === "local_workflow") {
      let $t = yN.status === "running";
      let nr = bo => {
        if (bo) {
          Je({
            key: "workflow-save-result",
            kind: "feedback",
            text: bo,
            priority: "high",
            timeoutMs: 8000
          });
        }
        It(qa => qa.workflowDetail === undefined && qa.footerSelection === null ? qa : {
          ...qa,
          workflowDetail: undefined,
          footerSelection: null
        });
      };
      return Fd.jsx(WorkflowDetailDialog, {
        workflow: yN,
        initialPhaseIndex: Ft?.phaseIndex,
        onDone: nr,
        onKill: $t ? () => killWorkflowTask(yN.id, yt) : undefined,
        onPause: $t ? () => pauseWorkflowTask(yN.id, yt) : undefined,
        onResume: bo => {
          nr();
          Ye.current?.(bo, true);
        },
        onSkipAgent: $t ? bo => skipWorkflowAgent(yN.id, bo, yt) : undefined,
        onRetryAgent: $t ? bo => retryWorkflowAgent(yN.id, bo, yt) : undefined
      });
    }
    if (I) {
      return Fd.jsx(zcr, {
        onDone: () => O(false),
        toolUseContext: P(d.current, [], new AbortController(), re),
        initialDetailTaskId: typeof I === "string" ? I : undefined
      });
    }
    if (lre() && tc) {
      return Fd.jsx(sxc, {
        initialQuery: ee,
        onSelect: $t => {
          let nr = a0($t.display);
          let bo = J2($t.display);
          _(nr);
          kt(bo);
          k($t.pastedContents);
          Ge(bo.length);
          On(false);
        },
        onCancel: () => On(false)
      });
    }
    if (c6) {
      return c6;
    }
    if (Gee) {
      return Gee;
    }
    if (cae) {
      return cae;
    }
    if (Fa) {
      return Fd.jsx(YRc, {
        onDone: () => {
          Hs(false);
          Dc(null);
        }
      });
    }
    let dae = {
      multiline: true,
      onKeyDownBefore: n_,
      onSubmit: t_,
      onChange: DT,
      value: Is ? J2(typeof Is === "string" ? Is : Is.display) : ee,
      onHistoryUp: n7,
      onHistoryDown: EB,
      onHistoryReset: hy,
      placeholder: v4,
      onExit: M,
      onExitMessage: ($t, nr) => Ie(bo => $t ? {
        show: $t,
        key: nr
      } : bo.action === "clear" ? bo : {
        show: false
      }),
      onLeftArrowOnEmpty: L,
      onImagePaste: ML,
      columns: UL,
      maxVisibleLines: E4,
      disableCursorMovementForUpDownKeys: zb.length > 0 || !!Ym,
      disableEscapeDoublePress: zb.length > 0,
      cursorOffset: Ue,
      onChangeCursorOffset: Ge,
      onPaste: a6,
      onIsPastingChange: Br,
      focus: !Te && !se,
      showCursor: !Ym && !Te && !Ca,
      argumentHint: tu,
      onUndo: Za ? () => {
        let $t = Pi();
        if ($t) {
          kt($t.text);
          Ge($t.cursorOffset);
          k($t.pastedContents);
        }
      } : undefined,
      highlights: gc,
      inlineGhostText: h4,
      inputFilter: xA
    };
    let rge = vB ? {} : {
      borderColor: (() => {
        let $t = {
          bash: "bashBorder"
        };
        if ($t[y]) {
          return $t[y];
        }
        if (isInProcessTeammate()) {
          return "promptBorder";
        }
        let nr = getTeammateColor();
        if (nr && eb.includes(nr)) {
          return w3[nr];
        }
        return "promptBorder";
      })(),
      borderStyle: "round",
      borderLeft: false,
      borderRight: false,
      borderBottom: true
    };
    if (ss) {
      return Fd.jsx(gXd, {
        flexDirection: "row",
        alignItems: "center",
        justifyContent: "center",
        ...rge,
        width: "100%",
        children: Fd.jsx(Text, {
          dimColor: true,
          italic: true,
          children: "Save and close editor to continue..."
        })
      });
    }
    let Dm = mL() ? Fd.jsx(PXo, {
      ...dae,
      initialMode: ae,
      onModeChange: fe,
      onOpenHistorySearch: lre() ? Xi : Qn
    }) : Fd.jsx(Dl, {
      ...dae
    });
    let pae = qs() && (zb.length > 0 || Or || Se);
    let BL = b4 ? Fd.jsxs(Fd.Fragment, {
      children: [Fd.jsx(zrn, {
        banner: b4,
        columns: rn,
        fastModeTag: Ug
      }), Fd.jsxs(gXd, {
        flexDirection: "row",
        width: "100%",
        children: [Fd.jsx(XXo, {
          mode: y,
          isLoading: a,
          viewingAgentName: ao,
          viewingAgentColor: Nn
        }), Fd.jsx(gXd, {
          ref: qee,
          flexGrow: 1,
          flexShrink: 1,
          tabIndex: -1,
          onClick: iae,
          children: Dm
        })]
      }), Fd.jsx(zrn, {
        banner: b4,
        columns: rn,
        fastModeTag: Ug,
        borderOnly: true
      })]
    }) : Fd.jsxs(Fd.Fragment, {
      children: [vB && wB && Fd.jsx(Text, {
        children: wB
      }), vB && Ug && Fd.jsx(Text, {
        color: "fastMode",
        dimColor: LL,
        children: Ug
      }), Fd.jsxs(gXd, {
        flexDirection: "row",
        alignItems: "flex-start",
        justifyContent: "flex-start",
        ...rge,
        width: "100%",
        borderText: vB ? undefined : CB ?? T4 ?? sae,
        children: [Fd.jsx(XXo, {
          mode: y,
          isLoading: a,
          viewingAgentName: ao,
          viewingAgentColor: Nn
        }), Fd.jsx(gXd, {
          ref: qee,
          flexGrow: 1,
          flexShrink: 1,
          tabIndex: -1,
          onClick: iae,
          children: Dm
        })]
      })]
    });
    return Fd.jsxs(gXd, {
      flexDirection: "column",
      marginTop: jt || pae ? 0 : 1,
      children: [Ym && !se && Fd.jsx(gXd, {
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: o7
      }), !qs() && Fd.jsx(tgr, {}), J && Fd.jsx(gXd, {
        marginTop: 1,
        marginLeft: 2,
        children: Fd.jsx(Text, {
          dimColor: true,
          children: "Waiting for permission\u2026"
        })
      }), !vB && BL, Fd.jsx(Cxc, {}), Fd.jsx(okc, {
        apiKeyStatus: o,
        debug: e,
        exitMessage: ke,
        leftArrowDetachAvailable: L !== undefined,
        vimMode: mL() ? ae : undefined,
        mode: y,
        isAutoUpdating: _e,
        verbose: u,
        onChangeIsUpdating: xe,
        suggestions: zb,
        selectedSuggestion: EP,
        suggestionsEmptyMessage: Kb,
        maxColumnWidth: s6,
        hoveredSuggestionId: r7,
        onSelectSuggestion: tge,
        onHoverSuggestion: GH,
        toolPermissionContext: wo,
        helpOpen: ce,
        suppressHint: ee.length > 0,
        isLoading: a,
        isExternalLoading: c,
        betweenCalls: l,
        tasksSelected: um,
        bridgeSelected: Qy,
        tmuxSelected: ac,
        ideSelection: t,
        mcpClients: x,
        isPasting: ct,
        showExpandPasteHint: Pr,
        hasStash: b !== undefined,
        isInputWrapped: c7,
        messagesRef: d,
        lastAssistantMessageId: f,
        tokenUsage: h,
        isSearching: Te,
        historyQuery: Wn,
        setHistoryQuery: Fr,
        historyFailedMatch: _r,
        onOpenTasksDialog: qs() ? Wee : undefined
      }), Re && isPublishToolEnabled() ? Fd.jsx(fxc, {}) : null, qs() ? null : uae, qs() ? Fd.jsx(gXd, {
        position: "absolute",
        marginTop: jt ? -2 : -1,
        height: zb.length === 0 && !Or && !Se ? 1 : 0,
        width: "100%",
        paddingLeft: 2,
        paddingRight: 1,
        flexDirection: "column",
        justifyContent: "flex-end",
        overflow: "hidden",
        children: Fd.jsx(xhr, {
          apiKeyStatus: o,
          isAutoUpdating: _e,
          verbose: u,
          tokenUsage: h,
          onChangeIsUpdating: xe,
          isInputWrapped: c7,
          hasStash: b !== undefined
        })
      }) : null, vB && BL]
    });
  }
  function Skf(e) {
    let t = 0;
    for (let n of e) {
      if (n.type === "user") {
        if (n.imagePasteIds) {
          for (let r of n.imagePasteIds) {
            if (r > t) {
              t = r;
            }
          }
        }
        if (Array.isArray(n.message.content)) {
          for (let r of n.message.content) {
            if (r.type === "text") {
              let o = h1(r.text);
              for (let s of o) {
                if (s.id > t) {
                  t = s.id;
                }
              }
            }
          }
        }
      }
    }
    return t + 1;
  }
  function Tkf(e) {
    let t = [];
    for (let n = e.length - 1; n >= 0; n--) {
      let r = e[n];
      if (r.type === "user" && !r.isMeta && !Hse(r) && !(r.origin && r.origin.kind !== "human")) {
        let o = qO(r);
        if (o?.trim() && !VQn(o) && o.length <= 1e5) {
          t.push({
            display: o,
            pastedContents: {}
          });
        }
      }
    }
    return t;
  }
  var Dkc;
  var Co;
  var Fd;
  var ykf;
  var Mkc;
  var Nkc = __lazy(() => {
    Nd();
    zRt();
    chr();
    Ot();
    ho();
    _9();
    mut();
    Rf();
    at();
    X9o();
    Pwe();
    Pwe();
    bLe();
    zPe();
    Bm();
    px();
    pen();
    gq();
    ZCc();
    aut();
    tRc();
    rRc();
    iH();
    sRc();
    ki();
    NRc();
    oSe();
    UHt();
    et();
    yq();
    BPe();
    kre();
    Bs();
    c0();
    ru();
    ln();
    Ugt();
    Uhr();
    wXt();
    GUe();
    Dpe();
    $U();
    M1();
    CXo();
    N2();
    mE();
    ky();
    uGe();
    yd();
    je();
    Fp();
    pr();
    dt();
    wQt();
    GT();
    zp();
    Tg();
    lGe();
    URt();
    dro();
    Rn();
    ro();
    JF();
    Eo();
    Hhr();
    S_();
    Cs();
    Lfe();
    tQt();
    K7t();
    yXo();
    UM();
    qp();
    Uj();
    uA();
    XN();
    Err();
    _en();
    CXt();
    jhr();
    zRc();
    Ox();
    JRc();
    Sd();
    oxt();
    bjo();
    our();
    ixc();
    zQn();
    Lsr();
    q_();
    uxc();
    x9o();
    lCe();
    qcr();
    dxc();
    hxc();
    Air();
    Rxc();
    khr();
    skc();
    akc();
    ZXo();
    ufe();
    KXo();
    eQo();
    mkc();
    _kc();
    wkc();
    xkc();
    Pkc();
    nQo();
    oUe();
    Dkc = __toESM(ot(), 1);
    Co = __toESM(ot(), 1);
    Fd = __toESM(ie(), 1);
    ykf = [];
    Mkc = Dkc.memo(bkf);
  });
  function Fkc() {
    let e = Lkc.c(3);
    let t = sgr();
    let {
      columns: n
    } = Sr();
    if (!t) {
      return null;
    }
    let r;
    if (e[0] !== t || e[1] !== n) {
      r = Ukc.jsx(zrn, {
        banner: t,
        columns: n,
        fastModeTag: undefined
      });
      e[0] = t;
      e[1] = n;
      e[2] = r;
    } else {
      r = e[2];
    }
    return r;
  }
  var Lkc;
  var Ukc;
  var Bkc = __lazy(() => {
    ki();
    eQo();
    nQo();
    Lkc = __toESM(pt(), 1);
    Ukc = __toESM(ie(), 1);
  });
  function $kc(e, t) {
    let n = bt(i => i.fotwClaim);
    let r = Lo();
    rQo.useEffect(() => {
      xZn();
    }, []);
    let o = n?.phase;
    useTimeout(() => r(i => i.fotwClaim ? {
      ...i,
      fotwClaim: undefined
    } : i), o === undefined || o === "pending" ? null : 30000, [o]);
    rQo.useEffect(() => {
      if (!n) {
        t("fotw-claim");
        return;
      }
      let i = Ky(n.amountMinorUnits, n.currency, "precise");
      switch (t("fotw-claim"), n.phase) {
        case "pending":
          e({
            key: "fotw-claim",
            text: `Thanks for trying the feature of the week. ${i} in usage credits on its way!`,
            priority: "immediate",
            requeueOnPreempt: true,
            timeoutMs: 60000
          });
          return;
        case "granted":
          e({
            key: "fotw-claim",
            text: `${i} in usage credits added to your account \xB7 expires in 90 days`,
            color: "success",
            priority: "immediate",
            requeueOnPreempt: true,
            timeoutMs: 30000
          });
          return;
        case "failed":
          e({
            key: "fotw-claim",
            text: "Something went wrong when adding your usage credits. Contact support for help.",
            color: "error",
            priority: "immediate",
            requeueOnPreempt: true,
            timeoutMs: 30000
          });
          return;
        case "needs_payment_setup":
          e({
            key: "fotw-claim",
            text: `To claim ${i} in usage credits, add a payment method at ${"https://claude.ai/settings/usage"}, then run /${n.command} again to claim (claiming turns on extra usage billing)`,
            priority: "immediate",
            requeueOnPreempt: true,
            timeoutMs: 30000
          });
          return;
      }
    }, [n, e, t]);
  }
  var rQo;
  var Hkc = __lazy(() => {
    tjt();
    lTt();
    ho();
    Wve();
    rQo = __toESM(ot(), 1);
  });
  function jkc(e) {
    return typeof e === "string" ? Li(e).replace(/[\r\n]/g, " ").slice(0, 512) : undefined;
  }
  function Wkc(e, t) {
    let n = e.data?.timestamp;
    if (typeof n !== "string") {
      return false;
    }
    let r = Date.parse(n);
    return !Number.isNaN(r) && t - r > 300000;
  }
  function kkf(e, t, n) {
    let r = e.data?.timestamp;
    if (typeof r !== "string") {
      return false;
    }
    let o = Date.parse(r);
    return Number.isFinite(o) && Math.abs(t - o) <= 60000 && o >= n - 5000;
  }
  function agr(e) {
    return {
      steps: Ckf.map(t => ({
        id: t,
        status: "pending"
      })),
      sessionMode: null,
      startedAt: e,
      hasStructuredSteps: false,
      terminal: false,
      dismissed: false,
      sawLiveFrame: false,
      hadLiveCycle: false,
      queuedCount: 0
    };
  }
  function Gkc(e, t, n, r, o) {
    let s = t.data?.extra;
    let i = typeof s?.step_id === "string" ? s.step_id : null;
    let a = typeof s?.step_status === "string" ? s.step_status : null;
    let l = e.terminal && i !== null && a !== null ? {
      ...agr(r),
      dismissed: e.hadLiveCycle,
      hadLiveCycle: e.hadLiveCycle
    } : e;
    if (i !== null && a !== null && !l.sawLiveFrame && kkf(t, r, o)) {
      l = {
        ...l,
        sawLiveFrame: true
      };
    }
    if (typeof s?.session_mode === "string") {
      let c = s.session_mode;
      if ((c === "new" || c === "resume" || c === "resume-cached" || c === "setup-only") && l.sessionMode !== c) {
        l = {
          ...l,
          sessionMode: c
        };
      }
    }
    if (typeof s?.expected_steps === "string") {
      let c = Ro(Li(s.expected_steps).split(",").map(u => u.trim().slice(0, 64)).filter(u => u !== "")).slice(0, 32);
      if (c.length > 0) {
        let u = new Map(l.steps.map(m => [m.id, m]));
        let d = c.map(m => u.get(m) ?? {
          id: m,
          status: "pending"
        });
        let p = l.steps.filter(m => !c.includes(m.id) && m.status !== "pending");
        l = {
          ...l,
          steps: [...p, ...d]
        };
      }
    }
    if (i !== null && a !== null) {
      l = Akf(l, {
        stepId: i,
        stepStatus: a,
        extra: s,
        line: n,
        now: r
      });
    } else if (n !== "") {
      let c = l.steps.findIndex(u => u.status === "running");
      if (c !== -1 && l.steps[c].detail !== n) {
        let u = l.steps.slice();
        u[c] = {
          ...u[c],
          detail: n
        };
        l = {
          ...l,
          steps: u
        };
      }
    }
    return l;
  }
  function Akf(e, {
    stepId: t,
    stepStatus: n,
    extra: r,
    line: o,
    now: s
  }) {
    let i = Li(t).slice(0, 64);
    let a = e.steps;
    let l = a.findIndex(m => m.id === i);
    if (l === -1) {
      if (a.length >= 32) {
        return e;
      }
      let m = jkc(r?.step_label) ?? o;
      a = [...a, {
        id: i,
        label: m,
        status: "pending"
      }];
      l = a.length - 1;
    }
    let c = a[l];
    let u = jkc(r?.step_detail);
    let d = null;
    switch (n) {
      case "started":
        if (c.status === "pending") {
          d = {
            ...c,
            status: "running",
            startedAt: s,
            detail: u
          };
        } else if (u !== undefined && c.detail !== u) {
          d = {
            ...c,
            detail: u
          };
        }
        break;
      case "completed":
        if (c.status !== "completed") {
          d = {
            ...c,
            status: "completed",
            completedAt: s,
            detail: undefined
          };
        }
        break;
      case "failed":
        if (c.status !== "failed" || c.error !== o) {
          d = {
            ...c,
            status: "failed",
            completedAt: s,
            error: o || undefined
          };
        }
        break;
      case "skipped":
        if (c.status === "pending" || c.status === "running") {
          d = {
            ...c,
            status: "skipped",
            detail: undefined
          };
        }
        break;
      default:
        break;
    }
    if (d !== null) {
      a = a === e.steps ? e.steps.slice() : a;
      a[l] = d;
    }
    if (a === e.steps) {
      return e;
    }
    let p = {
      ...e,
      steps: a,
      hasStructuredSteps: true
    };
    if (t === "start_cc" && n === "completed") {
      p = oQo(p, s);
    }
    return p;
  }
  function oQo(e, t) {
    if (e.terminal) {
      return e;
    }
    let n = e.steps.map(r => r.status === "pending" ? {
      ...r,
      status: "skipped"
    } : r.status === "running" ? {
      ...r,
      status: "completed",
      completedAt: t
    } : r);
    return {
      ...e,
      steps: n,
      terminal: true,
      completedAt: t,
      hadLiveCycle: e.hadLiveCycle || e.sawLiveFrame
    };
  }
  function Vkc(e, t) {
    let n = t === "resume" || t === "resume-cached";
    let r = e.status === "completed";
    switch (e.id) {
      case "provision":
        if (n) {
          return r ? "Resumed your cloud container" : "Resuming your cloud container";
        }
        return r ? "Set up a cloud container" : "Setting up a cloud container";
      case "clone":
        if (n) {
          return r ? "Refreshed repository" : "Refreshing repository";
        }
        return r ? "Cloned repository" : "Cloning repository";
      case "setup_script":
        return r ? "Ran setup script" : "Running setup script";
      case "start_cc":
        return r ? "Started Claude Code" : "Starting Claude Code";
      default:
        return e.label ?? e.id;
    }
  }
  function zkc(e) {
    return e === "resume" || e === "resume-cached" ? "Resuming remote session" : "Setting up remote session";
  }
  function Kkc(e) {
    let n = e.sessionMode === "resume" || e.sessionMode === "resume-cached" ? "resumed" : "ready";
    let r = (e.completedAt ?? e.startedAt) - e.startedAt;
    return `Remote session ${n} in ${sQo(r)}`;
  }
  function sQo(e) {
    if (e < 1e4) {
      return `${(Math.max(e, 100) / 1000).toFixed(1)}s`;
    }
    let t = Math.round(e / 1000);
    if (t < 60) {
      return `${t}s`;
    }
    return `${Math.floor(t / 60)}m ${t % 60}s`;
  }
  var Ckf;
  var iQo = __lazy(() => {
    Ckf = ["provision", "clone", "setup_script", "start_cc"];
  });
  function jBe(e, t) {
    return;
  }
  var Ykc;
  var Jkc = __lazy(() => {
    Ykc = require("fs/promises");
  });
  function Zkc(e) {
    if (e.startsWith("<bash-stdout") || e.startsWith("<bash-stderr") || e.startsWith("<local-command-stdout") || e.startsWith("<local-command-stderr") || e.startsWith('<channel source="') || e.startsWith(`<${"teammate-message"} `) || e.startsWith(`<${"teammate-message"}>`)) {
      return true;
    }
    if ((e.startsWith("A message arrived from ") || e.startsWith("Another Claude session sent a message")) && e.startsWith("<", e.indexOf(`
`) + 1)) {
      return true;
    }
    if (Nl(e, "tick") !== null) {
      return true;
    }
    return e.includes("<bash-input>") || e.includes(`<${"command-message"}>`) || e.includes("<user-memory-input>") || e.includes(`<${"task-notification"}`) || e.includes("<mcp-resource-update") || e.includes("<mcp-polling-update") || e.includes(`<${"fork-boilerplate"}>`) || e.includes(`<${"cross-session-message"}`) || e.includes(`<${"local-command-caveat"}>`);
  }
  function cQo(e) {
    if (e.tool_use_result !== undefined) {
      return true;
    }
    let t = e.message?.content;
    if (typeof t === "string") {
      return Zkc(t);
    }
    return Array.isArray(t) && t.some(n => typeof n === "object" && n !== null && "type" in n && (n.type === "tool_result" || n.type === "text" && "text" in n && typeof n.text === "string" && Zkc(n.text)));
  }
  function eAc(e) {
    return typeof e === "object" && e !== null && "type" in e && typeof e.type === "string";
  }
  function Lkf(e) {
    if (!("type" in e)) {
      return true;
    }
    switch (e.type) {
      case "message_start":
        {
          if (!("message" in e)) {
            return false;
          }
          let t = e.message;
          return typeof t === "object" && t !== null && "id" in t && typeof t.id === "string";
        }
      case "content_block_start":
        {
          if (!("content_block" in e) || typeof e.content_block !== "object" || e.content_block === null) {
            return false;
          }
          let t = e.content_block;
          if ("type" in t && t.type === "tool_use") {
            return "id" in t && typeof t.id === "string" && "name" in t && typeof t.name === "string";
          }
          return true;
        }
      case "content_block_delta":
        {
          if (!("delta" in e)) {
            return false;
          }
          let t = e.delta;
          if (typeof t !== "object" || t === null) {
            return false;
          }
          if (!("type" in t)) {
            return true;
          }
          switch (t.type) {
            case "text_delta":
              return "text" in t && typeof t.text === "string";
            case "input_json_delta":
              return "partial_json" in t && typeof t.partial_json === "string";
            case "signature_delta":
              return "signature" in t && typeof t.signature === "string";
            default:
              return true;
          }
        }
      default:
        return true;
    }
  }
  class uQo {
    sessionId;
    orgUuid;
    getAccessToken;
    callbacks;
    onAuth401;
    state = "idle";
    abortController = null;
    reconnectAttempts = 0;
    exhaustedBudget = false;
    reconnectTimer = null;
    livenessTimer = null;
    driftTimer = null;
    lastDriftCheck = 0;
    lastSequenceNum = 0;
    issuedRequestIds = new Set();
    constructor(e, t, n, r, o, s) {
      this.sessionId = e;
      this.orgUuid = t;
      this.getAccessToken = n;
      this.callbacks = r;
      this.onAuth401 = o;
      if (s !== undefined && s > 0) {
        this.lastSequenceNum = s;
      }
    }
    async connect() {
      if (this.state === "connecting" || this.state === "connected") {
        logForDebugging("[SessionsV2Client] Already connecting/connected");
        return;
      }
      this.state = "connecting";
      let e = new URL(`${getOauthConfig().BASE_API_URL}/v1/code/sessions/${this.sessionId}/events/stream`);
      if (this.lastSequenceNum > 0) {
        e.searchParams.set("from_sequence_num", String(this.lastSequenceNum));
      }
      let t = {
        ...this.authHeaders(),
        Accept: "text/event-stream"
      };
      if (this.lastSequenceNum > 0) {
        t["Last-Event-ID"] = String(this.lastSequenceNum);
      }
      logForDebugging(`[SessionsV2Client] Connecting to ${e.href} (from_sequence_num=${this.lastSequenceNum})`);
      this.abortController = new AbortController();
      this.readStream(e, t, this.abortController);
    }
    async readStream(e, t, n) {
      let r;
      let o = false;
      let s = setTimeout(() => {
        o = true;
        n.abort();
      }, 30000);
      try {
        r = await fetch(e.href, {
          method: "GET",
          headers: t,
          signal: n.signal,
          ...getProxyFetchOptions({
            url: e.href
          })
        });
        clearTimeout(s);
      } catch (c) {
        if (clearTimeout(s), o) {
          logForDebugging(`[SessionsV2Client] Connect timed out after ${30000}ms, reconnecting`, {
            level: "error"
          });
          Et("remote_connect", "remote_connect_timeout");
          this.handleStreamEnd();
          return;
        }
        if (n.signal.aborted) {
          return;
        }
        logForDebugging(`[SessionsV2Client] Connect error: ${he(c)}`, {
          level: "error"
        });
        Et("remote_connect", "remote_connect_request_failed");
        this.callbacks.onError?.(sr(c));
        this.handleStreamEnd();
        return;
      }
      if (!r.ok || !r.body) {
        if (logForDebugging(`[SessionsV2Client] HTTP ${r.status} on SSE connect`, {
          level: "error"
        }), r.body?.cancel(), r.status === 401 && this.onAuth401) {
          logForDebugging("[SessionsV2Client] 401 on SSE connect \u2014 refreshing");
          Ae("remote_connect", "remote_connect_auth_401");
          await this.onAuth401(this.getAccessToken());
          this.handleStreamEnd();
          return;
        }
        if (Dkf.vZc(r.status)) {
          Ae("remote_connect", "remote_connect_permanent_failure");
          this.state = "closed";
          this.callbacks.onClose?.();
          return;
        }
        Et("remote_connect", "remote_connect_http_error");
        this.handleStreamEnd();
        return;
      }
      this.state = "connected";
      this.reconnectAttempts = 0;
      this.resetLivenessTimer();
      this.startDriftWatch();
      logForDebugging("[SessionsV2Client] Connected");
      Pe("remote_connect");
      this.callbacks.onConnected?.();
      let i = r.body.getReader();
      let a = new TextDecoder();
      let l = "";
      try {
        while (true) {
          let {
            done: c,
            value: u
          } = await i.read();
          if (c) {
            break;
          }
          l += a.oC(u, Nkf);
          let {
            frames: d,
            remaining: p
          } = brn(l);
          l = p;
          for (let m of d) {
            if (this.resetLivenessTimer(), m.event && m.data) {
              this.handleFrame(m.event, m.id, m.data);
            }
          }
        }
      } catch (c) {
        if (n.signal.aborted) {
          return;
        }
        logForDebugging(`[SessionsV2Client] Stream read error: ${he(c)}`, {
          level: "error"
        });
        Et("remote_connect", "remote_connect_stream_error");
      } finally {
        i.releaseLock();
      }
      if (!n.signal.aborted) {
        logForDebugging("[SessionsV2Client] Stream ended");
        this.handleStreamEnd();
      }
    }
    handleFrame(e, t, n) {
      let r;
      try {
        r = qt(n);
      } catch (o) {
        Oe($o(Error(`[SessionsV2Client] Failed to parse ${e} frame: ${he(o)}`), "SessionsV2Client: failed to parse event frame"));
        Et("remote_connect", "remote_connect_frame_parse_failed");
        return;
      }
      switch (e) {
        case "client_event":
          {
            let o = r;
            let s = parseInt(t ?? String(o.sequence_num), 10);
            if (!isNaN(s) && s > this.lastSequenceNum) {
              this.lastSequenceNum = s;
            }
            if (!eAc(o.payload)) {
              logForDebugging(`[SessionsV2Client] Dropping client_event with no payload.type (event_type=${o.event_type})`);
              return;
            }
            if (o.payload.type === "control_response") {
              let {
                response: i
              } = o.payload;
              if (!i || typeof i !== "object" || typeof i.request_id !== "string") {
                logForDebugging(`[SessionsV2Client] Dropping malformed control_response from source=${o.source}`, {
                  level: "warn"
                });
                return;
              }
            }
            if (o.payload.type === "user") {
              if (o.source !== "worker" && cQo(o.payload)) {
                logForDebugging(`[SessionsV2Client] Dropping worker-output-shaped user frame from source=${o.source} \u2014 only the worker produces tool results and execution output`, {
                  level: "warn"
                });
                return;
              }
              let i = o.payload.message?.content;
              if (Array.isArray(i) && !i.every(a => typeof a === "object" && a !== null && (a.type !== "text" || typeof a.text === "string"))) {
                logForDebugging(`[SessionsV2Client] Dropping user frame with malformed content from source=${o.source}`, {
                  level: "warn"
                });
                return;
              }
            }
            if (o.source !== "worker") {
              if (o.payload.type === "control_response") {
                if (this.issuedRequestIds.vZc(o.payload.response.request_id)) {
                  logForDebugging(`[SessionsV2Client] Dropping control_response for this client's request_id from source=${o.source} \u2014 only the worker may answer our RPCs`, {
                    level: "warn"
                  });
                  return;
                }
                if (o.payload.response.pending_user_dialog_requests || o.payload.response.pending_permission_requests) {
                  logForDebugging(`[SessionsV2Client] Stripping prompt-redelivery fields from control_response with source=${o.source}`);
                  let {
                    pending_user_dialog_requests: i,
                    pending_permission_requests: a,
                    ...l
                  } = o.payload.response;
                  this.callbacks.onMessage({
                    ...o.payload,
                    response: l
                  });
                  return;
                }
              } else if (!lQo.vZc(o.payload.type)) {
                logForDebugging(`[SessionsV2Client] Dropping ${o.payload.type} from source=${o.source}`);
                return;
              }
            } else if (o.payload.type === "control_response") {
              this.issuedRequestIds.delete(o.payload.response.request_id);
            }
            this.callbacks.onMessage(o.payload);
            return;
          }
        case "ephemeral_event":
          {
            let o = r;
            if (eAc(o.payload)) {
              if (o.payload.type === "system" && o.payload.subtype === "thinking_tokens") {
                this.callbacks.onMessage({
                  type: "system",
                  subtype: "thinking_tokens",
                  estimated_tokens: o.payload.estimated_tokens,
                  estimated_tokens_delta: o.payload.estimated_tokens_delta,
                  uuid: o.payload.uuid,
                  session_id: o.payload.session_id
                });
                return;
              }
              if (o.payload.type !== "stream_event") {
                logForDebugging(`[SessionsV2Client] Dropping ${o.payload.type} on ephemeral channel`);
                return;
              }
              if (typeof o.payload.event !== "object" || o.payload.event === null || !Lkf(o.payload.event)) {
                logForDebugging("[SessionsV2Client] Dropping malformed stream_event on ephemeral channel", {
                  level: "warn"
                });
                return;
              }
              this.callbacks.onMessage(o.payload);
            }
            return;
          }
        case "catch_up_truncated":
          logForDebugging("[SessionsV2Client] catch_up_truncated \u2014 transcript gap");
          Et("remote_connect", "remote_catch_up_truncated");
          this.callbacks.onCatchUpTruncated?.();
          return;
        case "session_update":
        case "delivery_update":
          logForDebugging(`[SessionsV2Client] Ignoring ${e} frame`);
          return;
        default:
          logForDebugging(`[SessionsV2Client] Unknown SSE event type '${e}'`, {
            level: "warn"
          });
          return;
      }
    }
    handleStreamEnd() {
      if (this.clearLivenessTimer(), this.clearDriftWatch(), this.state === "closed") {
        return;
      }
      if (this.abortController = null, this.reconnectAttempts >= 5) {
        logForDebugging(`[SessionsV2Client] Reconnect budget exhausted (${5}), closing`);
        Ae("remote_connect", "remote_connect_reconnect_exhausted");
        this.state = "closed";
        this.exhaustedBudget = true;
        this.callbacks.onClose?.();
        return;
      }
      this.reconnectAttempts++;
      this.state = "idle";
      let e = Math.min(1000 * 2 ** (this.reconnectAttempts - 1), 30000);
      logForDebugging(`[SessionsV2Client] Reconnecting in ${e}ms (attempt ${this.reconnectAttempts}/${5}, from_sequence_num=${this.lastSequenceNum})`);
      this.callbacks.onReconnecting?.();
      this.reconnectTimer = setTimeout(() => {
        this.reconnectTimer = null;
        this.connect();
      }, e);
    }
    onLivenessTimeout = () => {
      this.livenessTimer = null;
      logForDebugging("[SessionsV2Client] Liveness timeout, reconnecting", {
        level: "warn"
      });
      this.abortController?.abort();
      this.abortController = null;
      this.handleStreamEnd();
    };
    resetLivenessTimer() {
      this.clearLivenessTimer();
      this.livenessTimer = setTimeout(this.onLivenessTimeout, 45000);
    }
    clearLivenessTimer() {
      if (this.livenessTimer) {
        clearTimeout(this.livenessTimer);
        this.livenessTimer = null;
      }
    }
    startDriftWatch() {
      this.clearDriftWatch();
      this.lastDriftCheck = Date.now();
      this.driftTimer = setInterval(() => {
        let e = Date.now();
        let t = e - this.lastDriftCheck;
        if (this.lastDriftCheck = e, t > 5000 * 2 && this.state === "connected") {
          logForDebugging(`[SessionsV2Client] Wall-clock drift ${t}ms \u2014 reconnecting after suspend`);
          this.reconnect();
        }
      }, 5000);
      this.driftTimer.unref?.();
    }
    clearDriftWatch() {
      if (this.driftTimer) {
        clearInterval(this.driftTimer);
        this.driftTimer = null;
      }
    }
    async sendEvent(e) {
      if (this.state === "closed") {
        logForDebugging("[SessionsV2Client] Cannot send: closed", {
          level: "warn"
        });
        Ae("remote_send_event", "remote_send_event_closed");
        return null;
      }
      let t = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${this.sessionId}/events`;
      let n = {
        session_id: this.sessionId,
        events: [{
          payload: e
        }]
      };
      try {
        let r = await fetch(t, {
          method: "POST",
          headers: this.authHeaders(),
          body: De(n),
          signal: AbortSignal.timeout(30000),
          ...getProxyFetchOptions({
            url: t
          })
        });
        if (!r.ok) {
          if (r.body?.cancel(), r.status === 401 && this.onAuth401) {
            if (logForDebugging("[SessionsV2Client] 401 on POST \u2014 refreshing + retry"), await this.onAuth401(this.getAccessToken())) {
              let a = await fetch(t, {
                method: "POST",
                headers: this.authHeaders(),
                body: De(n),
                signal: AbortSignal.timeout(30000),
                ...getProxyFetchOptions({
                  url: t
                })
              });
              if (a.ok) {
                let c = (await a.json()).results?.[0];
                let u = c ? parseInt(String(c.sequence_num), 10) : NaN;
                Pe("remote_send_event");
                return {
                  sequence_num: isNaN(u) ? 0 : u
                };
              }
              a.body?.cancel();
            }
          }
          logForDebugging(`[SessionsV2Client] POST /events returned ${r.status}`, {
            level: "warn"
          });
          Ae("remote_send_event", "remote_send_event_http_error");
          return null;
        }
        let s = (await r.json()).results?.[0];
        let i = s ? parseInt(String(s.sequence_num), 10) : NaN;
        Pe("remote_send_event");
        return {
          sequence_num: isNaN(i) ? 0 : i
        };
      } catch (r) {
        logForDebugging(`[SessionsV2Client] POST /events failed: ${he(r)}`, {
          level: "warn"
        });
        Ae("remote_send_event", "remote_send_event_request_failed");
        return null;
      }
    }
    sendControlResponse(e) {
      logForDebugging("[SessionsV2Client] Sending control_response");
      this.sendEvent({
        ...e,
        uuid: Yrn.randomUUID()
      });
    }
    sendControlRequest(e) {
      if (this.state === "closed") {
        logForDebugging("[SessionsV2Client] Cannot send control_request: closed", {
          level: "warn"
        });
        return null;
      }
      let t = Yrn.randomUUID();
      if (this.issuedRequestIds.add(t), this.issuedRequestIds.size > 500) {
        logForDebugging("[SessionsV2Client] issuedRequestIds overflow \u2014 evicting oldest unanswered request_id", {
          level: "warn"
        });
        let r = this.issuedRequestIds.values().next().value;
        if (r !== undefined) {
          this.issuedRequestIds.delete(r);
        }
      }
      let n = {
        type: "control_request",
        request_id: t,
        request: e,
        uuid: Yrn.randomUUID()
      };
      logForDebugging(`[SessionsV2Client] Sending control_request: ${e.subtype}`);
      this.sendEvent(n);
      return t;
    }
    sendControlCancelRequest(e) {
      if (this.state === "closed") {
        return;
      }
      logForDebugging(`[SessionsV2Client] Sending control_cancel_request: ${e}`);
      this.sendEvent({
        type: "control_cancel_request",
        request_id: e,
        uuid: Yrn.randomUUID()
      });
    }
    isConnected() {
      return this.state === "connected";
    }
    close() {
      if (logForDebugging("[SessionsV2Client] Closing"), this.state = "closed", this.exhaustedBudget = false, this.clearLivenessTimer(), this.clearDriftWatch(), this.reconnectTimer) {
        clearTimeout(this.reconnectTimer);
        this.reconnectTimer = null;
      }
      this.abortController?.abort();
      this.abortController = null;
    }
    reconnect() {
      if (logForDebugging("[SessionsV2Client] Force reconnect"), this.reconnectAttempts = 0, this.exhaustedBudget = false, this.clearLivenessTimer(), this.clearDriftWatch(), this.reconnectTimer) {
        clearTimeout(this.reconnectTimer);
        this.reconnectTimer = null;
      }
      this.abortController?.abort();
      this.abortController = null;
      this.state = "idle";
      this.connect();
    }
    reviveAfterExhaustion() {
      if (this.state !== "closed" || !this.exhaustedBudget) {
        return false;
      }
      Et("remote_connect", "remote_connect_revived_by_user_send");
      this.reconnect();
      return true;
    }
    authHeaders() {
      return {
        Authorization: `Bearer ${this.getAccessToken()}`,
        "Content-Type": "application/json",
        "anthropic-version": "2023-06-01",
        "anthropic-client-platform": getClientPlatform(),
        "x-organization-uuid": this.orgUuid,
        "User-Agent": dg()
      };
    }
  }
  var Yrn;
  var Dkf;
  var Nkf;
  var lQo;
  var dQo = __lazy(() => {
    Uc();
    zbt();
    np();
    ln();
    je();
    dt();
    Rn();
    ro();
    Fh();
    Yrn = require("crypto");
    Dkf = new Set([401, 403, 404]);
    Nkf = {
      stream: true
    };
    lQo = new Set(["user", "env_manager_log"]);
  });
  function lgr(e, t) {
    return {
      type: "control_response",
      response: {
        subtype: "success",
        request_id: e,
        response: t
      }
    };
  }
  class pQo {
    config;
    callbacks;
    client = null;
    pendingPermissionRequests = new Map();
    pendingDialogRequests = new Set();
    seenControlResponseIds = new Set();
    pendingControlRequests = new Map();
    pendingModelSwitchIds = new Set();
    constructor(e, t) {
      this.config = e;
      this.callbacks = t;
    }
    connect() {
      logForDebugging(`[RemoteSessionManager] Connecting to session ${this.config.sessionId}`);
      let e = {
        onMessage: t => this.handleMessage(t),
        onConnected: () => {
          logForDebugging("[RemoteSessionManager] Connected");
          this.callbacks.onConnected?.();
        },
        onClose: () => {
          logForDebugging("[RemoteSessionManager] Disconnected");
          this.callbacks.onDisconnected?.();
        },
        onReconnecting: () => {
          logForDebugging("[RemoteSessionManager] Reconnecting");
          this.callbacks.onReconnecting?.();
        },
        onCatchUpTruncated: () => {
          logForDebugging("[RemoteSessionManager] Catch-up truncated");
          this.callbacks.onCatchUpTruncated?.();
        },
        onError: t => {
          logForDebugging(`[RemoteSessionManager] Stream error: ${t.message}`, {
            level: "error"
          });
          this.callbacks.onError?.(t);
        }
      };
      this.client = new uQo(this.config.sessionId, this.config.orgUuid, this.config.getAccessToken, e, this.config.onAuth401, this.config.initialSequenceNum);
      this.client.connect();
    }
    handleMessage(e) {
      if (jBe("in", e), e.type === "control_request") {
        this.handleControlRequest(e);
        return;
      }
      if (e.type === "control_cancel_request") {
        let {
          request_id: t
        } = e;
        if (this.pendingDialogRequests.delete(t)) {
          logForDebugging(`[RemoteSessionManager] User dialog request cancelled: ${t}`);
          this.callbacks.onUserDialogCancelled?.(t);
          return;
        }
        let n = this.pendingPermissionRequests.get(t);
        if (!n) {
          logForDebugging(`[RemoteSessionManager] control_cancel_request for unknown request ${t} \u2014 nothing pending, ignoring`);
          return;
        }
        logForDebugging(`[RemoteSessionManager] Permission request cancelled: ${t}`);
        this.pendingPermissionRequests.delete(t);
        this.callbacks.onPermissionCancelled?.(t, n.tool_use_id);
        return;
      }
      if (e.type === "system" && e.subtype === "control_request_progress") {
        let t = this.pendingControlRequests.get(e.request_id);
        if (!t) {
          logForDebugging(`[RemoteSessionManager] control_request_progress for unknown request ${e.request_id} \u2014 ignoring`);
          return;
        }
        clearTimeout(t.timer);
        let n = setTimeout(this.onControlRequestTimeout, t.timeoutMs, e.request_id, t.subtype, t.timeoutMs);
        this.pendingControlRequests.set(e.request_id, {
          ...t,
          timer: n
        });
        t.onProgress?.(e);
        return;
      }
      if (e.type === "control_response") {
        let {
          request_id: t
        } = e.response;
        this.recordSeenControlResponseId(t);
        this.pendingModelSwitchIds.delete(t);
        let n = this.pendingControlRequests.get(t);
        if (n) {
          if (this.pendingControlRequests.delete(t), clearTimeout(n.timer), n.removeAbortListener?.(), e.response.subtype === "success") {
            n.resolve(e.response.response);
          } else {
            n.reject(Error(e.response.error));
          }
        } else {
          let r = this.pendingPermissionRequests.get(t);
          if (r) {
            this.pendingPermissionRequests.delete(t);
            logForDebugging(`[RemoteSessionManager] Permission request ${t} answered elsewhere \u2014 dismissing`);
            this.callbacks.onPermissionCancelled?.(t, r.tool_use_id);
          } else if (this.pendingDialogRequests.delete(t)) {
            logForDebugging(`[RemoteSessionManager] User dialog request ${t} answered elsewhere \u2014 dismissing`);
            this.callbacks.onUserDialogCancelled?.(t);
          } else {
            logForDebugging(`[RemoteSessionManager] Unmatched control_response ${t} (${e.response.subtype})${e.response.subtype === "error" ? `: ${e.response.error}` : ""}`);
          }
        }
        if (e.response.pending_user_dialog_requests) {
          for (let r of e.response.pending_user_dialog_requests) {
            if (r.request.subtype !== "request_user_dialog") {
              continue;
            }
            if (this.seenControlResponseIds.vZc(r.request_id)) {
              logForDebugging(`[RemoteSessionManager] Redelivered dialog ${r.request_id} already answered \u2014 skipping`);
              continue;
            }
            let o = this.pendingDialogRequests.vZc(r.request_id);
            if (this.handleControlRequest(r), !o && this.pendingDialogRequests.vZc(r.request_id)) {
              Pe("remote_dialog_redelivery");
            }
          }
        }
        return;
      }
      if (this.pendingModelSwitchIds.size > 0 && e.type === "user" && "isReplay" in e && e.isReplay === true && typeof e.message?.content === "string" && e.message.content.startsWith(GKo)) {
        let [t] = this.pendingModelSwitchIds;
        this.pendingModelSwitchIds.delete(t);
        logForDebugging("[RemoteSessionManager] Dropped own set_model breadcrumb echo");
        return;
      }
      if (e.type === "result") {
        for (let [t, n] of this.pendingPermissionRequests) {
          logForDebugging(`[RemoteSessionManager] Turn ended with permission request ${t} unresolved \u2014 dismissing`);
          this.callbacks.onPermissionCancelled?.(t, n.tool_use_id);
        }
        this.pendingPermissionRequests.clear();
        for (let t of this.pendingDialogRequests) {
          logForDebugging(`[RemoteSessionManager] Turn ended with user dialog request ${t} unresolved \u2014 dismissing`);
          this.callbacks.onUserDialogCancelled?.(t);
        }
        this.pendingDialogRequests.clear();
      }
      this.callbacks.onMessage(e);
    }
    recordSeenControlResponseId(e) {
      if (this.seenControlResponseIds.add(e), this.seenControlResponseIds.size > 1000) {
        let t = this.seenControlResponseIds.values().next().value;
        if (t !== undefined) {
          this.seenControlResponseIds.delete(t);
        }
      }
    }
    handleControlRequest(e) {
      let {
        request_id: t,
        request: n
      } = e;
      if (n.subtype === "can_use_tool") {
        logForDebugging(`[RemoteSessionManager] Permission request for tool: ${n.tool_name}`);
        this.pendingPermissionRequests.set(t, n);
        this.callbacks.onPermissionRequest(n, t);
        return;
      }
      if (n.subtype === "request_user_dialog") {
        if (this.pendingDialogRequests.vZc(t)) {
          logForDebugging(`[RemoteSessionManager] Duplicate user dialog request ${t} \u2014 already pending, skipping`);
          return;
        }
        logForDebugging(`[RemoteSessionManager] User dialog request: ${n.dialog_kind}`);
        this.pendingDialogRequests.add(t);
        this.callbacks.onUserDialogRequest(n, t);
        return;
      }
      logForDebugging(`[RemoteSessionManager] Unsupported control request subtype: ${n.subtype}`);
      this.client?.sendControlResponse({
        type: "control_response",
        response: {
          subtype: "error",
          request_id: t,
          error: `Unsupported control request subtype: ${n.subtype}`
        }
      });
    }
    async sendMessage(e, t) {
      logForDebugging(`[RemoteSessionManager] Sending message to session ${this.config.sessionId}`);
      this.reviveStreamForUserSend();
      jBe("out", {
        kind: "sendMessage",
        content: e,
        opts: t
      });
      let n = await sendEventToRemoteSession(this.config.sessionId, e, t);
      if (!n.ok) {
        logForDebugging(`[RemoteSessionManager] Failed to send message to session ${this.config.sessionId}: ${n.reason}`, {
          level: "error"
        });
        Ae("remote_send_message", "remote_send_message_failed");
      } else {
        Pe("remote_send_message");
      }
      return n;
    }
    async sendBashCommand(e, t) {
      logForDebugging(`[RemoteSessionManager] Sending bash_command to session ${this.config.sessionId}`);
      this.reviveStreamForUserSend();
      let n = await sendBashCommandToRemoteSession(this.config.sessionId, e, t);
      if (!n.ok) {
        logForDebugging(`[RemoteSessionManager] Failed to send bash_command to session ${this.config.sessionId}: ${n.reason}`, {
          level: "error"
        });
        Ae("remote_send_bash", "remote_send_bash_failed");
      } else {
        Pe("remote_send_bash");
      }
      return n;
    }
    reviveStreamForUserSend() {
      if (this.client?.reviveAfterExhaustion()) {
        this.callbacks.onReconnecting?.();
      }
    }
    respondToPermissionRequest(e, t) {
      if (!this.pendingPermissionRequests.get(e)) {
        Oe(Error(`[RemoteSessionManager] No pending permission request with ID: ${e}`));
        Ae("remote_permission_respond", "remote_permission_respond_no_pending");
        return;
      }
      this.pendingPermissionRequests.delete(e);
      this.reviveStreamForUserSend();
      let r = lgr(e, t);
      logForDebugging(`[RemoteSessionManager] Sending permission response: ${t.behavior}`);
      jBe("out", r);
      this.client?.sendControlResponse(r);
      Pe("remote_permission_respond");
    }
    respondToUserDialogRequest(e, t) {
      if (!this.pendingDialogRequests.delete(e)) {
        Oe(Error(`[RemoteSessionManager] No pending user dialog request with ID: ${e}`));
        Ae("remote_dialog_respond", "remote_dialog_respond_no_pending");
        return;
      }
      this.recordSeenControlResponseId(e);
      this.reviveStreamForUserSend();
      let n = {
        type: "control_response",
        response: {
          subtype: "success",
          request_id: e,
          response: t
        }
      };
      logForDebugging(`[RemoteSessionManager] Sending user dialog response: ${t.behavior}`);
      jBe("out", n);
      this.client?.sendControlResponse(n);
      Pe("remote_dialog_respond");
    }
    isConnected() {
      return this.client?.isConnected() ?? false;
    }
    cancelSession() {
      logForDebugging("[RemoteSessionManager] Sending interrupt signal");
      this.reviveStreamForUserSend();
      jBe("out", {
        kind: "control_request",
        subtype: "interrupt"
      });
      this.client?.sendControlRequest({
        subtype: "interrupt"
      });
    }
    sendControlRequest(e, t) {
      return vl("remote_control_rpc", async () => {
        if (t?.signal?.aborted) {
          throw new xc();
        }
        this.reviveStreamForUserSend();
        jBe("out", {
          kind: "control_request",
          ...e
        });
        let n = this.client?.sendControlRequest(e);
        if (n == null) {
          throw Error("[RemoteSessionManager] Cannot send: not connected");
        }
        if (e.subtype === "set_model") {
          this.pendingModelSwitchIds.add(n);
        }
        let r = e.subtype === "side_question" ? 600000 : 75000;
        return new Promise((o, s) => {
          let i = setTimeout(this.onControlRequestTimeout, r, n, e.subtype, r);
          let a = t?.signal;
          let l = a ? () => this.cancelControlRequest(n) : undefined;
          if (a && l) {
            a.addEventListener("abort", l, {
              once: true
            });
          }
          this.pendingControlRequests.set(n, {
            resolve: c => o(c),
            reject: s,
            timer: i,
            timeoutMs: r,
            subtype: e.subtype,
            onProgress: t?.onProgress,
            removeAbortListener: a && l ? () => a.removeEventListener("abort", l) : undefined
          });
        });
      }, Nvt);
    }
    onControlRequestTimeout = (e, t, n) => {
      this.pendingModelSwitchIds.delete(e);
      let r = this.pendingControlRequests.get(e);
      if (!r) {
        return;
      }
      this.pendingControlRequests.delete(e);
      r.removeAbortListener?.();
      r.reject(new Lwe(t, n));
    };
    cancelControlRequest(e) {
      let t = this.pendingControlRequests.get(e);
      if (!t) {
        return;
      }
      this.reviveStreamForUserSend();
      this.pendingControlRequests.delete(e);
      this.pendingModelSwitchIds.delete(e);
      clearTimeout(t.timer);
      logForDebugging(`[RemoteSessionManager] Cancelling control request ${e} (${t.subtype})`);
      jBe("out", {
        kind: "control_cancel_request",
        requestId: e
      });
      this.client?.sendControlCancelRequest(e);
      t.reject(new xc());
    }
    getSessionId() {
      return this.config.sessionId;
    }
    disconnect() {
      logForDebugging("[RemoteSessionManager] Disconnecting");
      this.client?.close();
      this.client = null;
      this.pendingPermissionRequests.clear();
      this.pendingDialogRequests.clear();
      for (let e of this.pendingControlRequests.values()) {
        clearTimeout(e.timer);
        e.removeAbortListener?.();
        e.reject(Error("[RemoteSessionManager] Disconnected"));
      }
      this.pendingControlRequests.clear();
      this.pendingModelSwitchIds.clear();
    }
    reconnect() {
      logForDebugging("[RemoteSessionManager] Reconnecting SSE stream");
      this.client?.reconnect();
    }
  }
  var tAc = __lazy(() => {
    ln();
    je();
    dt();
    Rn();
    ro();
    NC();
    KQt();
    Jkc();
    dQo();
  });
  function cgr() {
    return {
      retracted: new Set(),
      inProgressToolUses: new Map(),
      evictedToolUses: new Set(),
      nestedUuidAliases: new Map()
    };
  }
  function ugr(e, t, n) {
    let r = n.filter(o => o !== t);
    if (r.length > 0) {
      e.nestedUuidAliases.set(t, r);
    }
  }
  function qBe(e) {
    if (typeof e !== "object" || e === null) {
      return null;
    }
    let t = e;
    let n = typeof t.uuid === "string" ? t.uuid : null;
    if (t.type === "system" && t.subtype === "model_refusal_fallback") {
      let r = nAc(t.retracted_message_uuids, n);
      return r ? {
        uuids: r,
        source: "retraction_banner"
      } : null;
    }
    if (t.type === "assistant") {
      let r = nAc(t.supersedes, n);
      return r ? {
        uuids: r,
        source: "supersedes"
      } : null;
    }
    return null;
  }
  function nAc(e, t) {
    if (!Array.isArray(e)) {
      return null;
    }
    let n = e.filter(r => typeof r === "string" && r !== t);
    return n.length > 0 ? n : null;
  }
  function $kf(e, t) {
    if (t.size === 0) {
      return e;
    }
    let n = e.filter(r => !t.vZc(r.uuid));
    return n.length === e.length ? e : n;
  }
  function dgr(e, t, n) {
    for (let r of n) {
      e.inProgressToolUses.set(r, t);
    }
  }
  function Jrn(e, t) {
    for (let n of t) {
      e.inProgressToolUses.delete(n);
    }
  }
  function Xrn(e) {
    let {
      index: t,
      signal: n,
      surface: r,
      setMessages: o,
      setInProgressToolUseIDs: s
    } = e;
    let i = Bn(n.uuids, l => !t.retracted.vZc(l));
    for (let l of n.uuids) {
      t.retracted.add(l);
      for (let c of t.nestedUuidAliases.get(l) ?? []) {
        t.retracted.add(c);
      }
    }
    let a = [...t.inProgressToolUses].filter(([, l]) => t.retracted.vZc(l)).map(([l]) => l);
    Jrn(t, a);
    for (let l of a) {
      t.evictedToolUses.add(l);
    }
    if (a.length > 0 && s) {
      s({
        action: "remove",
        ids: a
      });
    }
    o(l => $kf(l, t.retracted));
    logEvent("tengu_refusal_retraction_evicted", {
      surface: r,
      source: n.source,
      uuid_count: n.uuids.length,
      newly_retracted_count: i,
      tool_use_cleared_count: a.length
    });
  }
  function pgr(e, t, n, r) {
    if (r !== null && e.retracted.vZc(r)) {
      return 0;
    }
    let o = Bn(t, s => e.evictedToolUses.vZc(s));
    if (o > 0) {
      logEvent("tengu_refusal_retraction_orphan_tool_result", {
        surface: n,
        count: o
      });
    }
    return o;
  }
  function rAc(e) {
    let {
      index: t,
      events: n,
      surface: r,
      setMessages: o,
      setInProgressToolUseIDs: s
    } = e;
    let i = 0;
    let a = 0;
    let l = 0;
    for (let c of n) {
      if (c.source !== "worker") {
        if (qBe(c.payload)) {
          if (c.source === undefined) {
            l++;
          } else {
            a++;
          }
        }
        continue;
      }
      let u = qBe(c.payload);
      if (u) {
        i++;
        Xrn({
          index: t,
          signal: u,
          surface: r,
          setMessages: o,
          setInProgressToolUseIDs: s
        });
      }
    }
    if (a > 0) {
      logEvent("tengu_refusal_retraction_unauthenticated_signal", {
        surface: r,
        reason: "source_mismatch",
        count: a
      });
    }
    if (l > 0) {
      logEvent("tengu_refusal_retraction_unauthenticated_signal", {
        surface: r,
        reason: "source_missing",
        count: l
      });
    }
    return i;
  }
  function mXe(e, t, n) {
    if (!e.retracted.vZc(t)) {
      return false;
    }
    logEvent("tengu_refusal_retraction_late_drop", {
      surface: n
    });
    return true;
  }
  var Qrn = __lazy(() => {
    Ot();
  });
  function oAc(e) {
    return e.type !== "control_request" && e.type !== "control_response" && e.type !== "keep_alive" && e.type !== "control_cancel_request" && e.type !== "transcript_mirror" && !(e.type === "system" && e.subtype === "task_summary");
  }
  function Hkf(e) {
    return {
      type: "assistant",
      message: e.message,
      uuid: e.uuid,
      requestId: undefined,
      timestamp: new Date().toISOString(),
      error: e.error,
      ...(e.is_api_error_message && {
        isApiErrorMessage: true
      })
    };
  }
  function jkf(e) {
    return {
      type: "stream_event",
      event: e.event,
      ...(e.ttft_ms !== undefined && {
        ttftMs: e.ttft_ms
      })
    };
  }
  function qkf(e) {
    if (e.subtype === "success") {
      return {
        type: "system",
        subtype: "informational",
        content: "Session completed successfully",
        level: "info",
        uuid: e.uuid,
        timestamp: new Date().toISOString()
      };
    }
    let t = e.errors.filter(n => !n.startsWith("[ede_diagnostic]"));
    if (t.length === 0) {
      return null;
    }
    return {
      type: "system",
      subtype: "informational",
      content: Li(t.join(", ")),
      level: "warning",
      uuid: e.uuid,
      timestamp: new Date().toISOString()
    };
  }
  function Wkf(e) {
    return {
      type: "system",
      subtype: "informational",
      content: `Cloud session initialized (model: ${Li(e.model)})`,
      level: "info",
      uuid: e.uuid,
      timestamp: new Date().toISOString()
    };
  }
  function Gkf(e) {
    if (!e.status) {
      return null;
    }
    return {
      type: "system",
      subtype: "informational",
      content: e.status === "compacting" ? "Compacting conversation\u2026" : `Status: ${Li(e.status)}`,
      level: "info",
      uuid: e.uuid,
      timestamp: new Date().toISOString()
    };
  }
  function Vkf(e) {
    return {
      type: "system",
      subtype: "informational",
      content: `Tool ${Li(e.tool_name)} running for ${e.elapsed_time_seconds}s\u2026`,
      level: "info",
      uuid: e.uuid,
      timestamp: new Date().toISOString(),
      toolUseID: e.tool_use_id
    };
  }
  function zkf(e) {
    return {
      type: "system",
      subtype: "compact_boundary",
      content: "Conversation compacted",
      level: "info",
      uuid: e.uuid,
      timestamp: new Date().toISOString(),
      compactMetadata: Ten(e.compact_metadata)
    };
  }
  function dxt(e) {
    if (!e) {
      return;
    }
    return {
      condition: Li(e.condition),
      iterations: e.iterations,
      setAt: e.set_at,
      tokensAtStart: e.tokens_at_start,
      ...(e.last_reason !== undefined && {
        lastReason: Li(e.last_reason)
      })
    };
  }
  function jie(e, t) {
    switch (e.type) {
      case "control_request":
      case "control_response":
      case "control_cancel_request":
        return {
          type: "ignored"
        };
      case "assistant":
        return {
          type: "message",
          message: Hkf(e)
        };
      case "user":
        {
          let n = e.message?.content;
          let r = Array.isArray(n) && n.some(s => s.type === "tool_result");
          if (t?.convertToolResults && r) {
            return {
              type: "message",
              message: In({
                content: n,
                toolUseResult: e.tool_use_result,
                uuid: e.uuid,
                timestamp: e.timestamp
              })
            };
          }
          if (e.parent_tool_use_id) {
            return {
              type: "ignored"
            };
          }
          if (e.isSynthetic && !nK(e.origin)) {
            return {
              type: "ignored"
            };
          }
          let o = n === "[Request interrupted by user]" || Array.isArray(n) && n.some(s => s.type === "text" && (s.text === "[Request interrupted by user]" || s.text === "[Request interrupted by user for tool use]"));
          if ((t?.convertUserTextMessages || o) && !r) {
            if (typeof n === "string" || Array.isArray(n)) {
              return {
                type: "message",
                message: In({
                  content: n,
                  toolUseResult: e.tool_use_result,
                  uuid: e.uuid,
                  timestamp: e.timestamp
                })
              };
            }
          }
          return {
            type: "ignored"
          };
        }
      case "stream_event":
        return {
          type: "stream_event",
          event: jkf(e)
        };
      case "result":
        {
          if (e.subtype === "success") {
            return {
              type: "ignored"
            };
          }
          let n = qkf(e);
          return n ? {
            type: "message",
            message: n
          } : {
            type: "ignored"
          };
        }
      case "system":
        if (e.subtype === "init") {
          return {
            type: "message",
            message: Wkf(e)
          };
        }
        if (e.subtype === "status") {
          if (e.status === "requesting") {
            return {
              type: "stream_event",
              event: {
                type: "stream_request_start"
              }
            };
          }
          let n = Gkf(e);
          return n ? {
            type: "message",
            message: n
          } : {
            type: "ignored"
          };
        }
        if (e.subtype === "compact_boundary") {
          return {
            type: "message",
            message: zkf(e)
          };
        }
        if (e.subtype === "model_refusal_fallback") {
          return {
            type: "message",
            message: {
              type: "system",
              subtype: "model_refusal_fallback",
              content: Li(e.content),
              level: "warning",
              trigger: e.trigger,
              direction: e.direction,
              originalModel: e.original_model,
              fallbackModel: e.fallback_model,
              requestId: e.request_id,
              apiRefusalCategory: e.api_refusal_category ?? null,
              apiRefusalExplanation: e.api_refusal_explanation ?? null,
              ...(e.retracted_message_uuids !== undefined && {
                retractedMessageUuids: e.retracted_message_uuids
              }),
              ...(e.refused_user_message_uuid !== undefined && {
                refusedUserMessageUuid: e.refused_user_message_uuid
              }),
              isMeta: false,
              uuid: e.uuid,
              timestamp: new Date().toISOString()
            }
          };
        }
        if (e.subtype === "model_fallback") {
          return {
            type: "message",
            message: {
              type: "system",
              subtype: "model_fallback",
              content: Li(e.content),
              level: "warning",
              trigger: e.trigger,
              originalModel: e.original_model,
              fallbackModel: e.fallback_model,
              isMeta: false,
              uuid: e.uuid,
              timestamp: new Date().toISOString()
            }
          };
        }
        if (e.subtype === "model_consent_fallback") {
          return {
            type: "message",
            message: {
              type: "system",
              subtype: "model_consent_fallback",
              content: Li(e.content),
              level: "warning",
              choice: e.choice,
              originalModel: e.original_model,
              fallbackModel: e.fallback_model,
              persistedAsDefault: e.persisted_as_default,
              isMeta: false,
              uuid: e.uuid,
              timestamp: new Date().toISOString()
            }
          };
        }
        if (e.subtype === "informational") {
          return {
            type: "message",
            message: {
              type: "system",
              subtype: "informational",
              content: Li(e.content),
              level: e.level,
              isMeta: false,
              uuid: e.uuid,
              timestamp: new Date().toISOString(),
              ...(e.tool_use_id && {
                toolUseID: e.tool_use_id
              }),
              ...(e.prevent_continuation && {
                preventContinuation: e.prevent_continuation
              })
            }
          };
        }
        if (e.subtype === "permission_denied") {
          if (t?.convertToolResults) {
            return {
              type: "ignored"
            };
          }
          let n = e.decision_reason ? ` \u2014 ${e.decision_reason}` : e.decision_reason_type ? ` (${e.decision_reason_type})` : "";
          return {
            type: "message",
            message: {
              type: "system",
              subtype: "informational",
              content: Li(`Permission denied: ${e.tool_name}${n}`),
              level: "warning",
              uuid: e.uuid,
              timestamp: new Date().toISOString(),
              toolUseID: e.tool_use_id
            }
          };
        }
        if (e.subtype === "local_command_output") {
          return {
            type: "message",
            message: ST({
              content: Li(e.content),
              uuid: () => e.uuid
            })
          };
        }
        logForDebugging(`[sdkMessageAdapter] Ignoring system message subtype: ${e.subtype}`);
        return {
          type: "ignored"
        };
      case "tool_progress":
        return {
          type: "message",
          message: Vkf(e)
        };
      case "auth_status":
        logForDebugging("[sdkMessageAdapter] Ignoring auth_status message");
        return {
          type: "ignored"
        };
      case "tool_use_summary":
        logForDebugging("[sdkMessageAdapter] Ignoring tool_use_summary message");
        return {
          type: "ignored"
        };
      case "rate_limit_event":
        logForDebugging("[sdkMessageAdapter] Ignoring rate_limit_event message");
        return {
          type: "ignored"
        };
      case "active_goal":
        return {
          type: "ignored"
        };
      case "env_manager_log":
        {
          let n = typeof e.data?.content === "string" ? e.data.content : typeof e.message === "string" ? e.message : null;
          if (n === null) {
            logForDebugging("[sdkMessageAdapter] env_manager_log without data.content/message \u2014 orchestrator wire change?", {
              level: "warn"
            });
            return {
              type: "env_log",
              message: ""
            };
          }
          let r = n.split(/\r\n?|\n/);
          let o = "";
          for (let s = r.length - 1; s >= 0; s--) {
            if (o = Li(r[s]).trim(), o !== "") {
              break;
            }
          }
          return {
            type: "env_log",
            message: o
          };
        }
      case "conversation_reset":
        return {
          type: "conversation_reset",
          newConversationId: e.new_conversation_id
        };
      default:
        logForDebugging(`[sdkMessageAdapter] Unknown message type: ${e.type}`);
        return {
          type: "ignored"
        };
    }
  }
  function mgr(e) {
    return e.type === "result";
  }
  var Zrn = __lazy(() => {
    je();
    VUe();
    ro();
  });
  async function hgr(e) {
    let {
      accessToken: t
    } = await prepareApiRequest();
    return {
      sessionUrl: `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}`,
      headers: getOAuthHeaders(t)
    };
  }
  async function sAc(e, t, n) {
    let r = await NP.get(`${e.sessionUrl}/events`, {
      headers: e.headers,
      params: t,
      timeout: 15000,
      validateStatus: () => true
    }).catch(() => null);
    if (!r || r.status !== 200) {
      logForDebugging(`[${n}] HTTP ${r?.status ?? "error"}`);
      return null;
    }
    let o = Array.isArray(r.data.data) ? r.data.data : [];
    let s = [];
    for (let a = o.length - 1; a >= 0; a--) {
      let l = o[a];
      if (l?.payload) {
        let c = l.sequence_num === undefined ? undefined : parseInt(String(l.sequence_num), 10);
        s.push({
          payload: l.payload,
          createdAt: l.created_at,
          source: l.source,
          sequenceNum: c !== undefined && !isNaN(c) ? c : undefined
        });
      }
    }
    let i = r.data.next_cursor ?? null;
    return {
      events: s,
      firstId: i,
      hasMore: i !== null
    };
  }
  async function iAc(e, t = 100, n) {
    let r = await sAc(e, {
      limit: t,
      sort_order: "desc"
    }, "fetchLatestEvents");
    if (n?.reportFeatureHealth !== false) {
      if (r === null) {
        Ae("assistant_history_load", "http_error");
      } else {
        Pe("assistant_history_load");
      }
    }
    return r;
  }
  async function ggr(e, t, n = 100) {
    return sAc(e, {
      limit: n,
      sort_order: "desc",
      cursor: t
    }, "fetchOlderEvents");
  }
  var mQo = __lazy(() => {
    Dp();
    Uc();
    ln();
    je();
    NC();
  });
  function aAc(e, t) {
    let n = Cl(t, e);
    if (n) {
      return n;
    }
    return Kkf(e);
  }
  function Kkf(e) {
    function t(n) {
      throw Error(`Stub tool ${e}.${n} called \u2014 stub exists only for permission UI rendering.`);
    }
    return {
      name: e,
      isMcp: false,
      isReadOnly: () => false,
      isConcurrencySafe: () => false,
      isEnabled: () => false,
      inputSchema: Ghs.record(Ghs.string(), Ghs.unknown()),
      maxResultSizeChars: 0,
      userFacingName: () => e,
      description: async () => "",
      prompt: async () => t("prompt"),
      call: async () => t("call"),
      checkPermissions: async () => t("checkPermissions"),
      toAutoClassifierInput: () => "",
      mapToolResultToToolResultBlockParam: (n, r) => ({
        type: "tool_result",
        tool_use_id: r,
        content: ""
      }),
      renderToolUseMessage: n => {
        let r = Object.entries(n);
        if (r.length === 0) {
          return "";
        }
        return r.slice(0, 3).map(([o, s]) => {
          let i = typeof s === "string" ? Li(s) : De(s);
          return `${Li(o)}: ${i}`;
        }).join(", ");
      }
    };
  }
  var lAc = __lazy(() => {
    ci();
  });
  async function ygr(e) {
    let t = e.tool;
    let n = {
      ...e,
      hasExternalRacer: true
    };
    let r = gFo(t);
    if (r !== undefined) {
      return {
        dialog: r.dialog,
        descriptor: r.build(n)
      };
    }
    if (r7t(t)) {
      let o = o7t(t, e.input);
      if (o !== null) {
        let s = e.remoteWorkspace === true;
        let i = s && Fgl(t) && !e.signal?.aborted ? await Jkf(o) : undefined;
        return {
          dialog: dLe,
          descriptor: await s7t({
            ...e,
            filePath: o,
            remoteWorkspace: s,
            remoteOldContent: i
          })
        };
      }
    }
    if (t === xl) {
      return {
        dialog: Gze,
        descriptor: IXn({
          ...e,
          classifierState: "none",
          toolPermissionContext: e.toolPermissionContext
        })
      };
    }
    return {
      dialog: mLe,
      descriptor: BM(n)
    };
  }
  async function Jkf(e) {
    if (!LD("fileRead")) {
      return;
    }
    try {
      let t = await withTimeout(Ul().sendControlRequest({
        subtype: "read_file",
        path: e,
        max_bytes: 1e7
      }), 1e4, "remote read_file timed out");
      if (t.truncated === true) {
        return;
      }
      return t.contents;
    } catch (t) {
      let n = t instanceof Error ? t.message : String(t);
      if (n.includes("ENOENT") || n.includes("no such file")) {
        return null;
      }
      logForDebugging(`buildForwardedPermissionDialog: remote read_file failed for ${e}: ${n}`, {
        level: "error"
      });
      return;
    }
  }
  var fQo = __lazy(() => {
    Etr();
    ru();
    R$();
    je();
    arn();
    xXn();
    kXn();
    WOo();
    OXn();
    PXn();
  });
  function _gr({
    sessionKey: e,
    sendResponse: t,
    requestDialog: n,
    toolRegistry: r,
    toolPermissionContext: o,
    canInterruptTurn: s
  }) {
    let i = qK.useRef(t);
    i.current = t;
    let a = qK.useRef(n);
    a.current = n;
    let l = qK.useRef(r);
    l.current = r;
    let c = qK.useRef(o);
    c.current = o;
    let u = qK.useRef(s);
    u.current = s;
    let [d] = useTheme();
    let p = qK.useRef(d);
    p.current = d;
    let m = qK.useRef(new Map());
    let f = qK.useCallback(g => {
      if (g.request.subtype !== "can_use_tool") {
        return;
      }
      let {
        request: y,
        request_id: _
      } = g;
      let b = m.current;
      let S = aAc(y.tool_name, l.current);
      let E = y.description ?? `${y.tool_name} requires permission`;
      let C = new AbortController();
      b.set(_, C);
      ygr({
        tool: S,
        input: y.input,
        description: E,
        toolUseID: y.tool_use_id,
        permissionResult: {
          behavior: "ask",
          message: E,
          suggestions: y.permission_suggestions,
          blockedPath: y.blocked_path
        },
        assistantMessage: ST({
          content: [{
            type: "tool_use",
            id: y.tool_use_id,
            name: y.tool_name,
            input: y.input
          }]
        }),
        theme: p.current,
        toolPermissionContext: c.current,
        remoteWorkspace: va(),
        signal: C.signal
      }).then(({
        dialog: x,
        descriptor: A
      }) => {
        if (!b.vZc(_)) {
          return Promise.resolve({
            behavior: "cancelled"
          });
        }
        return a.current(x, A, {
          signal: C.signal,
          queueBehind: true
        });
      }).then(x => {
        if (!b.delete(_)) {
          return;
        }
        switch (x.behavior) {
          case "allow":
            i.current(_, {
              behavior: "allow",
              updatedInput: x.updatedInput,
              ...(x.permissionUpdates?.length && {
                updatedPermissions: x.permissionUpdates
              }),
              toolUseID: y.tool_use_id
            });
            return;
          case "deny":
            {
              let A = u.current && Per({
                feedback: x.feedback,
                contentBlocks: x.contentBlocks,
                isSubagent: !!y.agent_id
              });
              i.current(_, {
                behavior: "deny",
                message: x.feedback ?? "User denied permission",
                ...(A && {
                  interrupt: true
                }),
                toolUseID: y.tool_use_id
              });
              return;
            }
          case "cancelled":
            i.current(_, {
              behavior: "deny",
              message: "User aborted",
              ...(u.current && {
                interrupt: true
              }),
              toolUseID: y.tool_use_id
            });
            return;
        }
      }).catch(x => {
        if (!b.delete(_)) {
          return;
        }
        i.current(_, {
          behavior: "deny",
          message: `Permission dialog failed: ${x instanceof Error ? x.message : String(x)}`,
          toolUseID: y.tool_use_id
        });
      });
    }, []);
    let h = qK.useCallback(g => {
      let y = m.current.get(g);
      if (y) {
        m.current.delete(g);
        y.abort();
      }
    }, []);
    qK.useEffect(() => {
      let g = m.current;
      return () => {
        for (let [y, _] of g) {
          g.delete(y);
          i.current(y, {
            behavior: "deny",
            message: "Permission dispatcher unmounted"
          });
          _.abort();
        }
      };
    }, [e]);
    return {
      dispatch: f,
      cancel: h
    };
  }
  var qK;
  var hQo = __lazy(() => {
    FJ();
    lAc();
    fQo();
    ru();
    ro();
    qK = __toESM(ot(), 1);
  });
  function cAc({
    sessionKey: e,
    sendResponse: t,
    requestDialog: n
  }) {
    let r = JCe.useRef(t);
    r.current = t;
    let o = JCe.useRef(n);
    o.current = n;
    let s = JCe.useRef(new Map());
    let i = JCe.useCallback(l => {
      if (l.request.subtype !== "request_user_dialog") {
        return;
      }
      let {
        request: c,
        request_id: u
      } = l;
      let d = Xkf[c.dialog_kind];
      if (!d) {
        r.current(u, {
          behavior: "cancelled"
        });
        return;
      }
      let p = s.current;
      let m = new AbortController();
      p.set(u, m);
      d(o.current, c.payload, {
        signal: m.signal
      }).then(f => {
        if (!p.delete(u)) {
          return;
        }
        r.current(u, f);
      }).catch(() => {
        if (!p.delete(u)) {
          return;
        }
        r.current(u, {
          behavior: "cancelled"
        });
      });
    }, []);
    let a = JCe.useCallback(l => {
      let c = s.current.get(l);
      if (c) {
        s.current.delete(l);
        c.abort();
      }
    }, []);
    JCe.useEffect(() => {
      let l = s.current;
      return () => {
        for (let [c, u] of l) {
          l.delete(c);
          u.abort();
        }
      };
    }, [e]);
    return {
      dispatch: i,
      cancel: a
    };
  }
  var JCe;
  var Xkf;
  var uAc = __lazy(() => {
    mWt();
    JCe = __toESM(ot(), 1);
    Xkf = {
      ...{
        [WX.kind]: async (e, t, n) => {
          let r = WX.payload().safeParse(t);
          if (!r.success) {
            return {
              behavior: "cancelled"
            };
          }
          let o = await e(WX, r.data, n);
          return o === "cancelled" ? {
            behavior: "cancelled"
          } : {
            behavior: "completed",
            result: o
          };
        }
      }
    };
  });
  function mAc({
    config: e,
    setMessages: t,
    setIsLoading: n,
    isLoading: r,
    onInit: o,
    requestDialog: s,
    toolPermissionContext: i,
    tools: a,
    onPermissionModeChange: l,
    setStreamingToolUses: c,
    setStreamMode: u,
    setInProgressToolUseIDs: d,
    recordApiMetricsEvent: p,
    onUpdateLength: m,
    onStreamingText: f,
    onTurnEnd: h,
    onConversationReset: g,
    retraction: y
  }) {
    let _ = !!e;
    let b = Eu.useRef(m);
    b.current = m;
    let S = Eu.useRef(f);
    S.current = f;
    let E = Eu.useRef(h);
    E.current = h;
    let C = Eu.useRef(g);
    C.current = g;
    let x = Eu.useRef(l);
    x.current = l;
    let A = Eu.useRef(r);
    A.current = r;
    let {
      columns: k
    } = Sr();
    let I = Eu.useRef(k);
    I.current = k;
    let O = Eu.useCallback(yt => {
      if (yt && A.current) {
        return;
      }
      A.current = yt;
      n(yt);
    }, [n]);
    let M = Eu.useRef(false);
    let L = Eu.useRef(false);
    let P = Eu.useRef(false);
    let F = Eu.useCallback(() => {
      S.current(() => null);
      c(yt => yt.length > 0 ? [] : yt);
    }, [c]);
    let H = useClock();
    let U = Lo();
    let N = Ec();
    let W = Eu.useCallback(yt => U(gt => gt.remoteConnectionStatus === yt ? gt : {
      ...gt,
      remoteConnectionStatus: yt
    }), [U]);
    let j = Eu.useRef(new Set());
    let z = Eu.useCallback(() => {
      let yt = j.current.size;
      U(gt => gt.remoteBackgroundTaskCount === yt ? gt : {
        ...gt,
        remoteBackgroundTaskCount: yt
      });
    }, [U]);
    let V = Eu.useRef(null);
    let K = Eu.useCallback(() => {
      if (V.current) {
        V.current();
        V.current = null;
      }
    }, []);
    let J = Eu.useRef(0);
    let Q = Eu.useCallback(() => {
      J.current++;
      K();
    }, [K]);
    let Z = Eu.useRef(null);
    let ne = Eu.useRef(Date.now());
    let oe = Eu.useRef(false);
    let ee = Eu.useCallback(yt => {
      if (Z.current === yt) {
        return;
      }
      Z.current = yt;
      U(gt => gt.remoteBootstrap === yt ? gt : {
        ...gt,
        remoteBootstrap: yt
      });
    }, [U]);
    let re = Eu.useCallback(yt => {
      let gt = Z.current;
      if (ee(yt), (gt === null || !gt.terminal) && yt.terminal) {
        if (yt.hasStructuredSteps) {
          if (!yt.dismissed) {
            t(Ft => [...Ft, wc(Kkc(yt), "info")]);
          }
          if (!yt.steps.some(Ft => Ft.status === "failed")) {
            Pe("remote_bootstrap");
          }
        }
      }
    }, [ee, t]);
    let se = Eu.useRef(true);
    let ae = Eu.useRef([]);
    let de = Eu.useRef(false);
    let be = Eu.useRef(() => {});
    let fe = Eu.useCallback((yt = true) => {
      let gt = ae.current.length;
      if (ae.current = [], Ue.current = false, Ge.current.clear(), gt > 0) {
        if (yt) {
          Et("remote_bootstrap", "queue_dropped");
        }
        t(Ft => [...Ft, wc(`${gt} queued ${un(gt, "message")} not sent \u2014 the session disconnected before the container was ready.`, "warning")]);
      }
      if (Z.current !== null && Z.current.queuedCount !== 0) {
        ee({
          ...Z.current,
          queuedCount: 0
        });
      }
    }, [t, ee]);
    let me = Eu.useCallback(() => {
      let yt = Z.current;
      if (yt !== null && !yt.terminal) {
        re(oQo(yt, Date.now()));
      }
      if (!se.current) {
        P.current = false;
        M.current = false;
        se.current = true;
        let gt = ae.current.length === 0;
        if (be.current(), gt && A.current && !e?.initialPromptUuid) {
          O(false);
        }
      }
    }, [re, e, O]);
    let Te = Eu.useCallback(() => {
      Q();
      M.current = true;
      P.current = true;
      O(false);
      let yt = Z.current;
      if (yt !== null && !yt.terminal && !yt.dismissed) {
        ee({
          ...yt,
          dismissed: true
        });
      }
    }, [Q, O, ee]);
    let ue = Eu.useRef(pAc.randomUUID());
    let ce = Eu.useRef(false);
    let le = Eu.useRef(null);
    let pe = Eu.useCallback(() => {
      let yt = le.current;
      if (yt === null) {
        return;
      }
      if (le.current = null, IEe().overrideMessage === yt) {
        zEo(null);
      }
    }, []);
    let ve = Eu.useRef(null);
    let _e = Eu.useRef(false);
    let xe = Eu.useRef(false);
    let ke = Eu.useRef(new MCt(50));
    let Ie = Eu.useRef(new Set());
    let Ue = Eu.useRef(false);
    let Ge = Eu.useRef(new Set());
    let {
      dispatch: Be,
      cancel: We
    } = _gr({
      sessionKey: e,
      sendResponse: Eu.useCallback((yt, gt) => {
        let Ft = ve.current;
        if (!Ft) {
          return;
        }
        if (Ft.respondToPermissionRequest(yt, gt), gt.behavior === "allow") {
          O(true);
        } else if (gt.interrupt) {
          Te();
        }
      }, [O, Te]),
      requestDialog: s,
      toolRegistry: a,
      toolPermissionContext: i,
      canInterruptTurn: !e?.viewerOnly
    });
    let {
      dispatch: Ze,
      cancel: Tt
    } = cAc({
      sessionKey: e,
      sendResponse: Eu.useCallback((yt, gt) => {
        ve.current?.respondToUserDialogRequest(yt, gt);
      }, []),
      requestDialog: s
    });
    Eu.useEffect(() => {
      if (!e) {
        if (_e.current) {
          _e.current = false;
          W("connecting");
          O(false);
          xe.current = false;
          ce.current = false;
          M.current = false;
          P.current = false;
          pe();
          se.current = true;
          fe();
          ee(null);
          oe.current = false;
          j.current.clear();
          z();
          d({
            action: "clear"
          });
          L.current = false;
          U(Yt => Yt.hasRemoteReplyChannel ? {
            ...Yt,
            hasRemoteReplyChannel: false
          } : Yt);
          U(Yt => Yt.activeGoal === undefined ? Yt : {
            ...Yt,
            activeGoal: undefined
          });
          y.inProgressToolUses.clear();
          F();
          E.current();
        }
        return;
      }
      if (_e.current = true, se.current = Boolean(e.isAttachToExisting || e.viewerOnly), fe(), ee(null), oe.current = false, ne.current = Date.now(), e.initialPromptUuid) {
        ke.current.add(e.initialPromptUuid);
      }
      logForDebugging(`[useRemoteSession] Initializing for session ${e.sessionId}`);
      let yt = false;
      let gt = false;
      let Ft = new Set();
      let on = new Set(null !== null ? e.seedReplyChannelToolUseIds ?? [] : []);
      L.current = null !== null && N.getState().hasRemoteReplyChannel;
      let rn = L.current;
      function Sn() {
        let Yt = rn;
        if (rn = false, L.current) {
          if (Yt) {
            logEvent("tengu_remote_reply_channel_init", {});
          }
          return;
        }
        L.current = true;
        logEvent("tengu_remote_reply_channel_init", {});
        U(Ee => Ee.hasRemoteReplyChannel ? Ee : {
          ...Ee,
          hasRemoteReplyChannel: true
        });
      }
      if (e.seedActiveGoal !== undefined) {
        let Yt = e.seedActiveGoal ?? undefined;
        if (U(Ee => Ee.activeGoal === Yt ? Ee : {
          ...Ee,
          activeGoal: Yt
        }), Yt !== undefined) {
          logEvent("tengu_remote_active_goal_adopted", {
            via: "seed",
            active: true
          });
        }
      }
      let jn = new pQo(e, {
        onMessage: Yt => {
          let Ee = [`type=${Yt.type}`];
          if ("subtype" in Yt) {
            Ee.push(`subtype=${Yt.subtype}`);
          }
          if (Yt.type === "user") {
            let Fe = Yt.message?.content;
            Ee.push(`content=${Array.isArray(Fe) ? Fe.map(Xe => Xe.type).join(",") : typeof Fe}`);
          }
          logForDebugging(`[useRemoteSession] Received ${Ee.join(" ")}`);
          {
            let Fe = qBe(Yt);
            if (Fe) {
              Xrn({
                index: y,
                signal: Fe,
                surface: "ccr",
                setMessages: t,
                setInProgressToolUseIDs: d
              });
            }
          }
          if (K(), Yt.type === "env_manager_log") {
            let Fe = Date.now();
            let Xe = Z.current !== null && Z.current.hasStructuredSteps && !Z.current.terminal;
            if (se.current && !Xe && Wkc(Yt, Fe)) {
              return;
            }
            let He = jie(Yt);
            if (!M.current && He.type === "env_log" && He.message !== "") {
              if (!se.current) {
                O(true);
              }
              let Gt = IEe().overrideMessage;
              if (Gt === null || Gt === le.current) {
                let mt = truncateToWidth(He.message, Math.max(40, I.current - 8));
                zEo(mt);
                le.current = mt;
              }
            }
            {
              let Gt = Z.current ?? agr(Fe);
              let mt = Gkc(Gt, Yt, He.type === "env_log" ? He.message : "", Fe, ne.current);
              if (mt !== Z.current) {
                if (Gt.terminal && !mt.terminal && mt.dismissed && !oe.current) {
                  oe.current = true;
                  logEvent("tengu_remote_bootstrap_cycle_hidden", {});
                }
                if (re(mt), mt.steps.some(Dt => Dt.status === "failed") && !Gt.steps.some(Dt => Dt.status === "failed")) {
                  if (Ae("remote_bootstrap", "step_failed"), oe.current = false, fe(false), se.current = true, P.current = false, M.current = false, O(false), mt.dismissed) {
                    t(Dt => [...Dt, wc("Cloud container provisioning failed \u2014 reconnect or check the session logs", "warning")]);
                  }
                }
                if (mt.terminal) {
                  oe.current = false;
                  pe();
                  me();
                }
              }
            }
            return;
          }
          if (pe(), Yt.type !== "user") {
            me();
          }
          if (!M.current && (Yt.type === "assistant" || Yt.type === "stream_event" || Yt.type === "system" && Yt.subtype === "status" && Yt.status === "requesting")) {
            O(true);
          }
          if (Yt.type === "user" && Yt.uuid && ke.current.vZc(Yt.uuid)) {
            let Fe = Yt.uuid;
            if (Fe === e.initialPromptUuid) {
              let He = jie(Yt, {
                convertUserTextMessages: true
              });
              t(Gt => He.type !== "message" || Gt.some(mt => mt.uuid === Fe) ? Gt : [...Gt, He.message]);
              return;
            }
            let Xe = Ie.current.delete(Fe);
            t(He => {
              let Gt = He.findLastIndex(Dt => Dt.uuid === Fe);
              if (Gt === -1) {
                if (!Xe) {
                  return He;
                }
                let Dt = jie(Yt, {
                  convertUserTextMessages: true
                });
                return Dt.type === "message" ? [...He, Dt.message] : He;
              }
              if (Gt === He.length - 1) {
                return He;
              }
              let mt = He[Gt];
              return He.slice(0, Gt).concat(He.slice(Gt + 1), mt);
            });
            logForDebugging(`[useRemoteSession] Reconciled echoed user message ${Fe} to canonical position`);
            return;
          }
          if (Yt.type === "system" && Yt.subtype === "init") {
            if (logForDebugging(`[useRemoteSession] Init received with ${Yt.slash_commands.length} slash commands`), null !== null) {
              if ((null).hasReplyChannelInit(Yt)) {
                Sn();
              } else if (!L.current || rn) {
                L.current = false;
                rn = false;
                U(Fe => Fe.hasRemoteReplyChannel ? {
                  ...Fe,
                  hasRemoteReplyChannel: false
                } : Fe);
              }
            }
            if (Yt.cwd) {
              if (Rc(Yt.cwd)) {
                logForDebugging("[useRemoteSession] init reported a UNC cwd \u2014 not adopting", {
                  level: "warn"
                });
              } else {
                setCwdState(Yt.cwd);
              }
            }
            o(Yt);
          }
          if (Yt.type === "system" && "permissionMode" in Yt && Yt.permissionMode) {
            x.current(Yt.permissionMode);
          }
          if (Yt.type === "active_goal") {
            let Fe = dxt(Yt.value);
            U(Xe => Xe.activeGoal === Fe ? Xe : {
              ...Xe,
              activeGoal: Fe
            });
            logEvent("tengu_remote_active_goal_adopted", {
              via: "stream",
              active: Fe !== undefined
            });
            return;
          }
          if (Yt.type === "system") {
            if (Yt.subtype === "task_started") {
              j.current.add(Yt.task_id);
              z();
              return;
            }
            if (Yt.subtype === "task_notification") {
              j.current.delete(Yt.task_id);
              z();
              return;
            }
            if (Yt.subtype === "task_progress" || Yt.subtype === "task_updated" || Yt.subtype === "notification") {
              return;
            }
            if (Yt.subtype === "status") {
              let Fe = ce.current;
              if (ce.current = Yt.status === "compacting", Fe && ce.current) {
                return;
              }
            }
            if (Yt.subtype === "compact_boundary") {
              ce.current = false;
            }
          }
          if (mgr(Yt)) {
            ce.current = false;
            M.current = false;
            P.current = false;
            O(false);
            F();
            E.current();
          }
          if (Yt.type === "user") {
            let Fe = Yt.message?.content;
            if (Array.isArray(Fe)) {
              let Xe = [];
              for (let He of Fe) {
                if (He.type === "tool_result") {
                  Xe.push(He.tool_use_id);
                }
              }
              if (Xe.length > 0) {
                d({
                  action: "remove",
                  ids: Xe
                });
                Jrn(y, Xe);
                pgr(y, Xe, "ccr", typeof Yt.uuid === "string" ? Yt.uuid : null);
              }
              if (null !== null && !e.viewerOnly && Fe.some(He => He.type === "tool_result" && He.is_error === true && on.vZc(He.tool_use_id)) && !(typeof Yt.uuid === "string" && mXe(y, Yt.uuid, "ccr"))) {
                let He = jie(Yt, {
                  convertToolResults: true
                });
                if (He.type === "message") {
                  let Gt = He.message;
                  t(mt => mt.some(Dt => Dt.uuid === Gt.uuid) ? mt : [...mt, Gt]);
                }
              }
            }
          }
          if (null !== null && Yt.type === "assistant" && !Yt.parent_tool_use_id) {
            for (let Fe of Yt.message.content) {
              let Xe = (null).replyChannelBlockKind(Fe);
              if (Xe === undefined) {
                continue;
              }
              if (Fe.type === "tool_use") {
                if (on.vZc(Fe.id)) {
                  Sn();
                  continue;
                }
                on.add(Fe.id);
              }
              Sn();
              logEvent("tengu_remote_reply_channel_frame", {
                kind: Xe
              });
            }
          }
          let Re = null;
          if (Re !== null) {
            if (typeof Yt.uuid === "string" && mXe(y, Yt.uuid, "ccr")) {
              return;
            }
            if (Re.length > 0) {
              if (typeof Yt.uuid === "string") {
                ugr(y, Yt.uuid, Re.map(Xe => Xe.uuid));
              }
              let Fe = Re[0].parentToolUseID;
              if (!Ft.vZc(Fe)) {
                Ft.add(Fe);
                logEvent("tengu_remote_subagent_frame_nested", {
                  frame_type: Yt.type
                });
              }
              t(Xe => {
                let He = Re.filter(Gt => !Xe.some(mt => mt.uuid === Gt.uuid));
                return He.length === 0 ? Xe : [...Xe, ...He];
              });
            }
            return;
          }
          let Ce = jie(Yt, e.viewerOnly ? {
            convertToolResults: true,
            convertUserTextMessages: true
          } : {
            convertUserTextMessages: true
          });
          if (Ce.type === "conversation_reset") {
            let Fe = new Set(Ge.current);
            let Xe = Ue.current;
            Ge.current.clear();
            Ue.current = false;
            t(He => {
              if (Ie.current.size > 100) {
                Ie.current.clear();
              }
              for (let Gt of He) {
                if (Gt.type === "user" && ke.current.vZc(Gt.uuid) && !Fe.vZc(Gt.uuid)) {
                  Ie.current.add(Gt.uuid);
                }
              }
              return He.filter(Gt => Gt.type === "user" && Fe.vZc(Gt.uuid) || Xe && Gt.type === "system");
            });
            c(He => He.length > 0 ? [] : He);
            S.current(() => null);
            d({
              action: "clear"
            });
            y.inProgressToolUses.clear();
            O(false);
            C.current?.(Ce.newConversationId);
            return;
          }
          if (Ce.type === "message") {
            if (c(Xe => Xe.length > 0 ? [] : Xe), Ce.message.type === "assistant") {
              S.current(() => null);
            }
            if (mXe(y, Ce.message.uuid, "ccr")) {
              return;
            }
            if (Ce.message.type === "assistant") {
              let Xe = Ce.message.message.content.filter(He => He.type === "tool_use").map(He => He.id);
              if (Xe.length > 0) {
                d({
                  action: "add",
                  ids: Xe
                });
                dgr(y, Ce.message.uuid, Xe);
              }
            }
            let Fe = Ce.message.uuid;
            t(Xe => Fe && Xe.some(He => He.uuid === Fe) ? Xe : [...Xe, Ce.message]);
          } else if (Ce.type === "stream_event") {
            if (P.current) {
              return;
            }
            EBe(Ce.event, {
              onMessage: Fe => t(Xe => [...Xe, Fe]),
              onUpdateLength: Fe => b.current(Fe),
              onSetStreamMode: u,
              onStreamingToolUses: c,
              onApiMetrics: p,
              onStreamingText: Fe => {
                if (!L.current) {
                  S.current(Fe);
                }
              }
            });
          }
        },
        onPermissionRequest: (Yt, Ee) => {
          if (logForDebugging(`[useRemoteSession] Permission request for tool: ${Yt.tool_name}`), O(false), e.viewerOnly) {
            return;
          }
          Be({
            type: "control_request",
            request_id: Ee,
            request: Yt
          });
        },
        onPermissionCancelled: (Yt, Ee) => {
          if (logForDebugging(`[useRemoteSession] Permission request cancelled: ${Yt}`), We(Yt), !M.current) {
            O(true);
          }
        },
        onUserDialogRequest: (Yt, Ee) => {
          if (logForDebugging(`[useRemoteSession] User dialog request: ${Yt.dialog_kind}`), O(false), e.viewerOnly) {
            return;
          }
          Ze({
            type: "control_request",
            request_id: Ee,
            request: Yt
          });
        },
        onUserDialogCancelled: Yt => {
          logForDebugging(`[useRemoteSession] User dialog request cancelled: ${Yt}`);
          Tt(Yt);
        },
        onConnected: () => {
          logForDebugging("[useRemoteSession] Connected");
          W("connected");
        },
        onReconnecting: () => {
          logForDebugging("[useRemoteSession] Reconnecting");
          W("reconnecting");
          M.current = false;
          P.current = false;
          j.current.clear();
          z();
          d({
            action: "clear"
          });
          y.inProgressToolUses.clear();
        },
        onCatchUpTruncated: () => {
          if (logForDebugging("[useRemoteSession] Catch-up truncated \u2014 transcript gap"), t(Yt => [...Yt, wc("Some earlier messages from this session could not be loaded after reconnecting.", "warning")]), yt) {
            gt = true;
          } else {
            yt = true;
            let Yt = e.sessionId;
            (async () => {
              try {
                do {
                  gt = false;
                  try {
                    if ((await Ee()) === "stale") {
                      return;
                    }
                  } catch {}
                } while (gt);
              } finally {
                yt = false;
              }
            })();
            async function Ee() {
              let Re = await hgr(Yt);
              if (ve.current !== jn) {
                return "stale";
              }
              let Ce = await iAc(Re, undefined, {
                reportFeatureHealth: false
              });
              let Fe = 0;
              let Xe = 0;
              while (Ce && Xe < 3) {
                if (ve.current !== jn) {
                  return "stale";
                }
                Xe++;
                Fe += rAc({
                  index: y,
                  events: Ce.events,
                  surface: "truncation_harvest",
                  setMessages: t,
                  setInProgressToolUseIDs: d
                });
                Ce = Xe < 3 && Ce.hasMore && Ce.firstId ? await ggr(Re, Ce.firstId) : null;
              }
              if (ve.current !== jn) {
                return "stale";
              }
              logEvent("tengu_refusal_retraction_truncation_harvest", {
                signal_count: Fe,
                page_count: Xe
              });
              return "done";
            }
          }
        },
        onDisconnected: () => {
          logForDebugging("[useRemoteSession] Disconnected");
          Q();
          W("disconnected");
          M.current = false;
          P.current = false;
          O(false);
          pe();
          j.current.clear();
          z();
          d({
            action: "clear"
          });
          y.inProgressToolUses.clear();
          F();
          E.current();
        },
        onError: Yt => {
          logForDebugging(`[useRemoteSession] Error: ${Yt.message}`);
        }
      });
      ve.current = jn;
      jn.connect();
      let Xr = ue.current;
      let co = null;
      reportClientPresence(e.sessionId, Xr).then(Yt => {
        if (ve.current !== jn || Yt == null) {
          return;
        }
        let Ee = Yt * 1000;
        let Re = () => {
          try {
            reportClientPresence(e.sessionId, Xr);
          } finally {
            co = H.setTimeout(Re, Ee);
          }
        };
        co = H.setTimeout(Re, Ee);
      });
      e.preflightCheck?.catch(Yt => {
        if (ve.current !== jn) {
          return;
        }
        t(Ee => [...Ee, wc(he(Yt), "warning")]);
        jn.disconnect();
        ve.current = null;
        Q();
        W("disconnected");
        O(false);
        M.current = false;
        P.current = false;
        pe();
        j.current.clear();
        z();
        d({
          action: "clear"
        });
        y.inProgressToolUses.clear();
        F();
        E.current();
      });
      return () => {
        if (logForDebugging("[useRemoteSession] Cleanup - disconnecting"), Q(), co) {
          co();
          co = null;
        }
        reportClientPresence(e.sessionId, Xr, true);
        markSessionRead(e.sessionId);
        pe();
        L.current = false;
        U(Yt => Yt.hasRemoteReplyChannel ? {
          ...Yt,
          hasRemoteReplyChannel: false
        } : Yt);
        U(Yt => Yt.activeGoal === undefined ? Yt : {
          ...Yt,
          activeGoal: undefined
        });
        jn.disconnect();
        ve.current = null;
      };
    }, [e, t, O, o, c, u, d, W, z, p, H, Be, We, Ze, Tt, K, Q, F, pe, U, N, y]);
    let kt = Eu.useCallback(yt => {
      if (xe.current || !e || e.initialPromptUuid || e.viewerOnly || e.isAttachToExisting) {
        return;
      }
      xe.current = true;
      let gt = e.sessionId;
      let Ft = typeof yt === "string" ? yt : Tl(yt, " ");
      if (Ft) {
        Sie(Ft, new AbortController().signal).then(on => {
          updateSessionTitle(gt, on ?? truncateToWidth(Ft, 75));
        });
      }
    }, [e]);
    let Ye = Eu.useCallback(async (yt, gt) => {
      let Ft = ve.current;
      if (!Ft) {
        logForDebugging("[useRemoteSession] Cannot send - no manager");
        return false;
      }
      K();
      let on = J.current;
      if (M.current = false, O(true), gt?.uuid) {
        ke.current.add(gt.uuid);
      }
      if (gt?.clearsConversation) {
        Ue.current = true;
        Ge.current.clear();
      } else if (Ue.current && gt?.uuid) {
        if (Ge.current.size > 100) {
          Ge.current.clear();
        }
        Ge.current.add(gt.uuid);
      }
      let rn = await Ft.sendMessage(yt, gt);
      if (!rn.ok) {
        if (gt?.clearsConversation) {
          Ue.current = false;
          Ge.current.clear();
        } else if (gt?.uuid) {
          Ge.current.delete(gt.uuid);
        }
        t(Sn => [...Sn, wc(`Couldn't send your message \u2014 ${rn.reason}. It wasn't delivered to the cloud session.`, "warning")]);
        O(false);
        return false;
      }
      if (kt(yt), !e?.viewerOnly && J.current === on) {
        let Sn = ce.current ? 180000 : 60000;
        V.current = H.setTimeout(() => {
          logForDebugging("[useRemoteSession] Response timeout - attempting reconnect");
          let jn = wc("Cloud session may be unresponsive. Attempting to reconnect\u2026", "warning");
          t(Xr => [...Xr, jn]);
          Ft.reconnect();
        }, Sn);
      }
      return true;
    }, [e, O, t, H, K, kt]);
    let ht = Eu.useCallback(async () => {
      if (de.current) {
        return;
      }
      de.current = true;
      try {
        while (ae.current.length > 0) {
          let yt = ae.current.shift();
          if (yt === undefined) {
            break;
          }
          let gt = Z.current;
          if (gt !== null && gt.queuedCount !== ae.current.length) {
            ee({
              ...gt,
              queuedCount: ae.current.length
            });
          }
          await Ye(yt.content, yt.opts);
        }
      } finally {
        de.current = false;
      }
    }, [Ye, ee]);
    Eu.useEffect(() => {
      be.current = () => {
        ht().catch(yt => Oe(yt));
      };
    }, [ht]);
    let It = Eu.useCallback(async (yt, gt) => {
      if (!ve.current) {
        logForDebugging("[useRemoteSession] Cannot send - no manager");
        return false;
      }
      if (!e?.viewerOnly && (!se.current || de.current || ae.current.length > 0)) {
        if (gt?.uuid) {
          ke.current.add(gt.uuid);
        }
        if (gt?.clearsConversation) {
          Ue.current = true;
          Ge.current.clear();
        } else if (Ue.current && gt?.uuid) {
          if (Ge.current.size > 100) {
            Ge.current.clear();
          }
          Ge.current.add(gt.uuid);
        }
        M.current = false;
        O(true);
        ae.current.push({
          content: yt,
          opts: gt
        });
        let rn = Z.current ?? agr(Date.now());
        ee({
          ...rn,
          queuedCount: ae.current.length
        });
        kt(yt);
        logForDebugging(`[useRemoteSession] Queued message during bootstrap (${ae.current.length} queued)`);
        return true;
      }
      return Ye(yt, gt);
    }, [e, O, ee, kt, Ye]);
    let Rt = Eu.useCallback(() => {
      if (pe(), !e?.viewerOnly) {
        ve.current?.cancelSession();
        Te();
        return;
      }
      Q();
      O(false);
    }, [e, O, Q, Te, pe]);
    let wt = Eu.useCallback((yt, gt) => {
      let Ft = ve.current;
      if (!Ft) {
        return Promise.reject(Error("[useRemoteSession] Cannot send control request: no manager"));
      }
      return Ft.sendControlRequest(yt, gt);
    }, []);
    let vt = Eu.useCallback(() => {
      Q();
      ve.current?.disconnect();
      ve.current = null;
    }, [Q]);
    return Eu.useMemo(() => ({
      isRemoteMode: _,
      sendMessage: It,
      cancelRequest: Rt,
      disconnect: vt,
      sendControlRequest: wt
    }), [_, It, Rt, vt, wt]);
  }
  var pAc;
  var Eu;
  var fAc = __lazy(() => {
    at();
    otn();
    vpe();
    et();
    iQo();
    tAc();
    Qrn();
    Zrn();
    mQo();
    ln();
    Ot();
    ho();
    mm();
    je();
    dt();
    cs();
    Rn();
    ro();
    UYe();
    Zn();
    NC();
    ki();
    hQo();
    uAc();
    pAc = require("crypto");
    Eu = __toESM(ot(), 1);
  });
  function hAc(e, t) {
    let n = bt(c => c.toolPermissionContext);
    let r = n.mode;
    let o = Lo();
    let s = Ec();
    let {
      addNotification: i
    } = Fi();
    let a = eon.useRef({
      mode: r,
      context: n
    });
    let l = eon.useRef(null);
    eon.useEffect(() => {
      if (!e.isRemoteMode || !e.caps.controlChannel || e.viewerOnly) {
        return;
      }
      let c = a.current;
      a.current = {
        mode: r,
        context: n
      };
      let u = t.current;
      if (t.current = null, c.mode === r || r === "bubble") {
        return;
      }
      if (u === r) {
        nur(r);
        return;
      }
      let d = r;
      let p = l.current === d;
      l.current = null;
      e.sendControlRequest({
        subtype: "set_permission_mode",
        mode: d
      }).then(() => {
        if (nur(d), !p) {
          Pe("mode_switch");
        }
      }).catch(m => {
        if (nur(d, sr(m)), logForDebugging(`[remote] set_permission_mode rejected: ${he(m)}`), p) {
          return;
        }
        if (Ae("mode_switch", Nvt(m)), s.getState().toolPermissionContext.mode !== d) {
          return;
        }
        l.current = c.mode;
        o(f => {
          if (f.toolPermissionContext.mode !== d) {
            return f;
          }
          return {
            ...f,
            toolPermissionContext: c.context
          };
        });
        i({
          key: "remote-permission-mode-rejected",
          kind: "feedback",
          text: `Cloud session couldn't switch to ${d} mode`,
          color: "warning",
          priority: "immediate"
        });
      });
    }, [r, n, e, o, i, s, t]);
  }
  var eon;
  var gAc = __lazy(() => {
    Nd();
    KQt();
    V9o();
    ln();
    ho();
    je();
    dt();
    eon = __toESM(ot(), 1);
  });
  class gQo {
    0 = null;
    config;
    callbacks;
    constructor(e, t) {
      this.config = e;
      this.callbacks = t;
    }
    connect() {
      let e = {};
      if (this.config.authToken) {
        e.authorization = `Bearer ${this.config.authToken}`;
      }
      this.ws = new WebSocket(this.config.wsUrl, {
        headers: e
      });
      this.ws.addEventListener("open", () => {
        this.callbacks.onConnected?.();
      });
      this.ws.addEventListener("message", t => {
        let r = (typeof t.data === "string" ? t.data : "").split(`
`).filter(o => o.trim());
        for (let o of r) {
          let s;
          try {
            s = qt(o);
          } catch {
            continue;
          }
          if (!T6o(s)) {
            continue;
          }
          let i = s;
          if (i.type === "control_request") {
            if (i.request.subtype === "can_use_tool") {
              this.callbacks.onPermissionRequest(i.request, i.request_id);
            } else {
              logForDebugging(`[DirectConnect] Unsupported control request subtype: ${i.request.subtype}`);
              this.sendErrorResponse(i.request_id, `Unsupported control request subtype: ${i.request.subtype}`);
            }
            continue;
          }
          if (oAc(i)) {
            this.callbacks.onMessage(i);
          }
        }
      });
      this.ws.addEventListener("close", () => {
        this.callbacks.onDisconnected?.();
      });
      this.ws.addEventListener("error", () => {
        this.callbacks.onError?.(Error("WebSocket connection error"));
      });
    }
    async sendMessage(e) {
      if (!this.ws) {
        return {
          ok: false,
          reason: "not connected"
        };
      }
      if (this.ws.readyState === WebSocket.CONNECTING) {
        return {
          ok: false,
          reason: "the connection is still being established"
        };
      }
      if (this.ws.readyState !== WebSocket.OPEN) {
        return {
          ok: false,
          reason: "the connection was closed"
        };
      }
      let t = De({
        type: "user",
        message: {
          role: "user",
          content: e
        },
        parent_tool_use_id: null,
        session_id: ""
      });
      this.ws.send(t);
      return {
        ok: true
      };
    }
    respondToPermissionRequest(e, t) {
      if (!this.ws || this.ws.readyState !== WebSocket.OPEN) {
        logForDebugging(`[DirectConnect] Dropping permission response for ${e}: socket not open`, {
          level: "error"
        });
        return;
      }
      this.ws.send(De(lgr(e, t)));
    }
    sendInterrupt() {
      if (!this.ws || this.ws.readyState !== WebSocket.OPEN) {
        return;
      }
      let e = De({
        type: "control_request",
        request_id: crypto.randomUUID(),
        request: {
          subtype: "interrupt"
        }
      });
      this.ws.send(e);
    }
    sendErrorResponse(e, t) {
      if (!this.ws || this.ws.readyState !== WebSocket.OPEN) {
        return;
      }
      let n = De({
        type: "control_response",
        response: {
          subtype: "error",
          request_id: e,
          error: t
        }
      });
      this.ws.send(n);
    }
    disconnect() {
      if (this.ws) {
        this.ws.close();
        this.ws = null;
      }
    }
    isConnected() {
      return this.ws?.readyState === WebSocket.OPEN;
    }
  }
  var yAc = __lazy(() => {
    otn();
    Zrn();
    je();
  });
  function bgr({
    adapter: e,
    setMessages: t,
    setIsLoading: n,
    isLoading: r,
    requestDialog: o,
    toolPermissionContext: s,
    tools: i,
    permissionMode: a,
    onInit: l,
    setStreamingToolUses: c,
    setStreamMode: u,
    setInProgressToolUseIDs: d,
    recordApiMetricsEvent: p,
    onConversationReset: m
  }) {
    let f = !!e;
    let h = wR.useRef(null);
    let g = wR.useRef(false);
    let y = wR.useRef(false);
    let [_] = wR.useState(cgr);
    let b = r !== undefined;
    let S = wR.useRef(r ?? false);
    if (b) {
      S.current = r;
    }
    let E = wR.useCallback(z => {
      if (z && b && S.current) {
        return;
      }
      S.current = z;
      n(z);
    }, [n, b]);
    let C = wR.useRef(false);
    let x = wR.useCallback(() => {
      C.current = true;
      E(false);
    }, [E]);
    let A = Lo();
    let k = wR.useCallback(z => A(V => V.remoteConnectionStatus === z ? V : {
      ...V,
      remoteConnectionStatus: z
    }), [A]);
    let I = wR.useRef(new Set());
    let O = wR.useCallback(() => {
      let z = I.current.size;
      A(V => V.remoteBackgroundTaskCount === z ? V : {
        ...V,
        remoteBackgroundTaskCount: z
      });
    }, [A]);
    let M = wR.useCallback(() => {
      I.current.clear();
      O();
      d?.({
        action: "clear"
      });
      _.inProgressToolUses.clear();
    }, [O, d, _]);
    let {
      dispatch: L,
      cancel: P
    } = _gr({
      sessionKey: e,
      sendResponse: wR.useCallback((z, V) => {
        let K = h.current;
        if (!K) {
          return;
        }
        if (K.respondToPermissionRequest(z, V), V.behavior === "allow") {
          E(true);
        } else if (V.interrupt) {
          x();
        }
      }, [E, x]),
      requestDialog: o,
      toolRegistry: i,
      toolPermissionContext: s,
      canInterruptTurn: !e?.readOnly
    });
    let F = wR.useRef(a);
    F.current = a;
    wR.useEffect(() => {
      if (!e) {
        return;
      }
      let {
        label: z,
        createManager: V,
        onDisconnected: K,
        cleanup: J
      } = e;
      g.current = false;
      logForDebugging(`[${z}] connecting`);
      function Q(oe) {
        if (F.current !== undefined && !e?.readOnly) {
          oe.setPermissionMode?.(F.current);
        }
      }
      let Z = V({
        onMessage: oe => {
          if (oe.type === "active_goal") {
            let se = dxt(oe.value);
            A(ae => ae.activeGoal === se ? ae : {
              ...ae,
              activeGoal: se
            });
            logEvent("tengu_remote_active_goal_adopted", {
              via: "thin_client_stream",
              active: se !== undefined
            });
            return;
          }
          {
            let se = qBe(oe);
            if (se) {
              Xrn({
                index: _,
                signal: se,
                surface: "thin_client",
                setMessages: t,
                setInProgressToolUseIDs: d
              });
            }
          }
          if (mgr(oe)) {
            C.current = false;
            E(false);
          }
          if (!C.current && (oe.type === "assistant" || oe.type === "stream_event" || oe.type === "system" && oe.subtype === "status" && oe.status === "requesting")) {
            E(true);
          }
          if (oe.type === "system" && oe.subtype === "init") {
            if (g.current) {
              return;
            }
            g.current = true;
            l?.(oe);
          }
          if (oe.type === "system") {
            if (oe.subtype === "task_started") {
              I.current.add(oe.task_id);
              O();
              return;
            }
            if (oe.subtype === "task_notification") {
              I.current.delete(oe.task_id);
              O();
              return;
            }
            if (oe.subtype === "task_progress" || oe.subtype === "task_updated" || oe.subtype === "notification") {
              return;
            }
          }
          if (d && oe.type === "user") {
            let se = oe.message?.content;
            if (Array.isArray(se)) {
              let ae = [];
              for (let de of se) {
                if (de.type === "tool_result") {
                  ae.push(de.tool_use_id);
                }
              }
              if (ae.length > 0) {
                d({
                  action: "remove",
                  ids: ae
                });
                Jrn(_, ae);
                pgr(_, ae, "thin_client", typeof oe.uuid === "string" ? oe.uuid : null);
              }
            }
          }
          if (e.interceptMessage?.(oe, {
            setMessages: t
          }) === "consumed") {
            return;
          }
          let ee = null;
          if (ee !== null) {
            if (typeof oe.uuid === "string" && mXe(_, oe.uuid, "thin_client")) {
              return;
            }
            if (ee.length > 0) {
              if (typeof oe.uuid === "string") {
                ugr(_, oe.uuid, ee.map(se => se.uuid));
              }
              t(se => {
                let ae = ee.filter(de => !se.some(be => be.uuid === de.uuid));
                return ae.length === 0 ? se : [...se, ...ae];
              });
            }
            return;
          }
          let re = jie(oe, e.convertOpts ?? {
            convertToolResults: true
          });
          if (re.type === "conversation_reset") {
            c?.(se => se.length > 0 ? [] : se);
            d?.({
              action: "clear"
            });
            _.inProgressToolUses.clear();
            E(false);
            m?.(re.newConversationId);
            return;
          }
          if (re.type === "message") {
            if (c?.(se => se.length > 0 ? [] : se), mXe(_, re.message.uuid, "thin_client")) {
              return;
            }
            if (d && re.message.type === "assistant") {
              let se = re.message.message.content.filter(ae => ae.type === "tool_use").map(ae => ae.id);
              if (se.length > 0) {
                d({
                  action: "add",
                  ids: se
                });
                dgr(_, re.message.uuid, se);
              }
            }
            t(se => [...se, re.message]);
          } else if (re.type === "stream_event") {
            EBe(re.event, {
              onMessage: se => t(ae => [...ae, se]),
              onUpdateLength: () => {},
              onSetStreamMode: u ?? (() => {}),
              onStreamingToolUses: c ?? (() => {}),
              onApiMetrics: p
            });
          }
        },
        onPermissionRequest: (oe, ee) => {
          if (logForDebugging(`[${z}] permission request: ${oe.tool_name}`), E(false), e.readOnly) {
            return;
          }
          L({
            type: "control_request",
            request_id: ee,
            request: oe
          });
        },
        onPermissionCancelled: (oe, ee) => {
          if (logForDebugging(`[${z}] permission cancelled: ${oe}`), P(oe), !C.current) {
            E(true);
          }
        },
        onConnected: () => {
          logForDebugging(`[${z}] connected`);
          y.current = true;
          k("connected");
          Q(Z);
        },
        onReconnecting: (oe, ee) => {
          if (logForDebugging(`[${z}] dropped, reconnecting${oe != null ? ` (${oe}/${ee})` : ""}`), y.current = false, k("reconnecting"), !e.replaysOnReconnect) {
            E(false);
          }
          if (C.current = false, M(), oe != null) {
            t(re => [...re, wc(`Connection dropped \u2014 reconnecting (attempt ${oe}/${ee})...`, "warning")]);
          }
        },
        onDisconnected: () => {
          logForDebugging(`[${z}] disconnected`);
          let oe = y.current;
          y.current = false;
          k("disconnected");
          C.current = false;
          E(false);
          M();
          K(oe);
        },
        onError: oe => {
          logForDebugging(`[${z}] error: ${oe.message}`);
        }
      });
      h.current = Z;
      Z.connect();
      Q(Z);
      let ne = e.afterConnect?.(Z);
      return () => {
        logForDebugging(`[${z}] cleanup`);
        ne?.();
        A(oe => oe.activeGoal === undefined ? oe : {
          ...oe,
          activeGoal: undefined
        });
        Z.disconnect();
        J?.();
        h.current = null;
      };
    }, [e, t, E, l, c, u, d, p, m, k, O, M, L, P, _]);
    let H = wR.useCallback(async (z, V) => {
      let K = h.current;
      if (!K) {
        t(Q => [...Q, wc("Not connected to the remote session \u2014 your message wasn't sent.", "warning")]);
        return false;
      }
      C.current = false;
      E(true);
      let J = await K.sendMessage(z, V);
      if (!J.ok) {
        t(Q => [...Q, wc(`Couldn't send your message \u2014 ${J.reason}. It wasn't delivered to the remote session.`, "warning")]);
        E(false);
        return false;
      }
      return true;
    }, [E, t]);
    let U = wR.useCallback(() => {
      if (!e?.readOnly) {
        h.current?.sendInterrupt();
        x();
        return;
      }
      E(false);
    }, [e, E, x]);
    let N = wR.useCallback(() => {
      h.current?.disconnect();
      h.current = null;
      y.current = false;
    }, []);
    let W = e?.label;
    let j = wR.useCallback((z, V) => {
      let K = h.current;
      if (!K) {
        return Promise.reject(Error("Remote session is not connected \u2014 try again in a moment"));
      }
      if (!K.sendControlRequest) {
        return Promise.reject(Error(`sendControlRequest not yet wired for ${W ?? "this"} transport`));
      }
      return K.sendControlRequest(z, V);
    }, [W]);
    return wR.useMemo(() => ({
      isRemoteMode: f,
      sendMessage: H,
      cancelRequest: U,
      disconnect: N,
      sendControlRequest: j
    }), [f, H, U, N, j]);
  }
  var wR;
  var yQo = __lazy(() => {
    Qrn();
    Zrn();
    Ot();
    ho();
    je();
    ro();
    hQo();
    wR = __toESM(ot(), 1);
  });
  function bAc({
    config: e,
    setMessages: t,
    setIsLoading: n,
    requestDialog: r,
    toolPermissionContext: o,
    tools: s,
    permissionMode: i,
    onConversationReset: a
  }) {
    let l = _Ac.useMemo(() => {
      if (!e) {
        return;
      }
      return {
        label: "directConnect",
        createManager: c => new gQo(e, c),
        onDisconnected: c => {
          process.stderr.write(c ? `
Server disconnected.
` : `
Failed to connect to server at ${e.wsUrl}
`);
          gracefulShutdown(1);
        }
      };
    }, [e]);
    return bgr({
      adapter: l,
      setMessages: t,
      setIsLoading: n,
      requestDialog: r,
      toolPermissionContext: o,
      tools: s,
      permissionMode: i,
      onConversationReset: a
    });
  }
  var _Ac;
  var SAc = __lazy(() => {
    yAc();
    lm();
    yQo();
    _Ac = __toESM(ot(), 1);
  });
  function EAc({
    session: e,
    setMessages: t,
    setIsLoading: n,
    requestDialog: r,
    toolPermissionContext: o,
    tools: s,
    permissionMode: i,
    onConversationReset: a
  }) {
    let l = TAc.useMemo(() => {
      if (!e) {
        return;
      }
      return {
        label: "ssh",
        createManager: c => e.createManager(c),
        onDisconnected: c => {
          let u = e.getStderrTail().trim();
          let d = e.proc.exitCode;
          let p = c ? "Remote session ended." : "SSH session failed before connecting.";
          if (u && (!c || d !== 0)) {
            p += `
Remote stderr (exit ${d ?? "signal " + e.proc.signalCode}):
${u}`;
          }
          gracefulShutdown(1, "other", {
            finalMessage: p
          });
        },
        cleanup: () => e.proxy?.stop()
      };
    }, [e]);
    return bgr({
      adapter: l,
      setMessages: t,
      setIsLoading: n,
      requestDialog: r,
      toolPermissionContext: o,
      tools: s,
      permissionMode: i,
      onConversationReset: a
    });
  }
  var TAc;
  var vAc = __lazy(() => {
    lm();
    yQo();
    TAc = __toESM(ot(), 1);
  });
  function wAc(e) {
    let t = Ec();
    let n = bt(a => a.transcripts[e]?.messages ?? _Qo);
    let r = ton.useRef(n);
    let o = bt(a => a.transcripts[e]?.inProgressToolUseIDs ?? bQo);
    let s = ton.useCallback((a, l) => {
      r.current = a;
      t.setState(c => {
        let u = c.transcripts[e] ?? {
          messages: _Qo,
          inProgressToolUseIDs: bQo
        };
        if (u.messages === a && l?.tokenCount === undefined) {
          return c;
        }
        return {
          ...c,
          transcripts: {
            ...c.transcripts,
            [e]: {
              ...u,
              messages: a,
              ...(l?.tokenCount !== undefined && {
                progress: {
                  toolUseCount: 0,
                  ...u.progress,
                  tokenCount: l.tokenCount
                }
              })
            }
          }
        };
      });
    }, [t, e]);
    let i = ton.useCallback(a => {
      t.setState(l => {
        let c = l.transcripts[e] ?? {
          messages: _Qo,
          inProgressToolUseIDs: bQo
        };
        let u = c.inProgressToolUseIDs;
        let d;
        switch (a.action) {
          case "add":
            {
              d = new Set(u);
              for (let p of a.ids) {
                d.add(p);
              }
              break;
            }
          case "remove":
            {
              d = new Set(u);
              for (let p of a.ids) {
                d.delete(p);
              }
              if (d.size === u.size) {
                return l;
              }
              break;
            }
          case "clear":
            if (u.size === 0) {
              return l;
            }
            d = new Set();
            break;
          default:
            return l;
        }
        return {
          ...l,
          transcripts: {
            ...l.transcripts,
            [e]: {
              ...c,
              inProgressToolUseIDs: d
            }
          }
        };
      });
    }, [t, e]);
    return {
      messages: n,
      messagesRef: r,
      setAgentMessages: s,
      inProgressToolUseIDs: o,
      setInProgressToolUseIDs: i
    };
  }
  var ton;
  var _Qo;
  var bQo;
  var CAc = __lazy(() => {
    ho();
    ton = __toESM(ot(), 1);
    _Qo = [];
    bQo = new Set();
  });
  function Sgr(e) {
    let t = kAc.createHash("sha256").update(e).digest("hex").slice(0, 8);
    return SQo.join(fO(), `.draft-${t}`);
  }
  function IAc(e) {
    return De({
      ...e,
      ts: Date.now()
    });
  }
  async function Tgr(e, t) {
    try {
      await WBe.mkdir(fO(), {
        recursive: true
      });
      await Fm(Sgr(e), IAc(t));
    } catch {}
  }
  function PAc(e, t) {
    try {
      vj(Sgr(e), IAc(t));
    } catch {}
  }
  async function OAc(e) {
    await WBe.unlink(Sgr(e)).catch(() => {});
  }
  async function MAc(e) {
    let t = await t0(Sgr(e), 8388608);
    if (t === null) {
      return;
    }
    let n;
    try {
      n = DAc().safeParse(qt(t));
    } catch {
      return;
    }
    if (!n.success) {
      return;
    }
    let {
      q: r,
      collapsed: o,
      ts: s
    } = n.data;
    if (Date.now() - s > 86400000) {
      return;
    }
    return {
      q: r,
      collapsed: o ?? []
    };
  }
  async function Egr() {
    return vl("job_sweep_drafts", async () => {
      let e;
      try {
        e = await WBe.readdir(fO());
      } catch {
        return;
      }
      let t = Date.now();
      await Promise.all(e.filter(n => n.startsWith(".draft-")).map(async n => {
        let r = SQo.join(fO(), n);
        let o = await t0(r, 8388608);
        if (o !== null) {
          try {
            let s = DAc().safeParse(qt(o));
            if (s.success && t - s.data.ts <= 86400000) {
              return;
            }
          } catch {}
        }
        await WBe.rm(r, {
          recursive: true,
          force: true
        }).catch(() => {});
      }));
    });
  }
  var kAc;
  var WBe;
  var SQo;
  var DAc;
  var TQo = __lazy(() => {
    ln();
    BT();
    n1();
    zf();
    kAc = require("crypto");
    WBe = require("fs/promises");
    SQo = require("path");
    DAc = we(() => v.object({
      q: v.string(),
      collapsed: v.array(v.string()).optional(),
      ts: v.number()
    }));
  });
  function tAf() {
    if (!qf("userSettings") && getInitialSettings()?.cleanupPeriodDays === undefined) {
      logForDebugging("Skipping retention cleanup: userSettings source is disabled (--setting-sources) and no enabled source provides cleanupPeriodDays.");
      return false;
    }
    if (getSettingsForSource("policySettings")?.cleanupPeriodDays !== undefined) {
      return true;
    }
    let {
      errors: e
    } = N1e();
    if (e.length > 0 && rawSettingsContainsKey("cleanupPeriodDays")) {
      logForDebugging("Skipping cleanup: settings have validation errors but cleanupPeriodDays was explicitly set. Fix settings errors to enable cleanup.");
      return false;
    }
    return true;
  }
  function e4(e) {
    let n = (getInitialSettings() || {}).cleanupPeriodDays ?? 30;
    if (n === 0) {
      return null;
    }
    if (e !== undefined && e < n) {
      n = e;
    }
    let r = n * 24 * 60 * 60 * 1000;
    return new Date(Date.now() - r);
  }
  function GBe(e, t) {
    return {
      messages: e.messages + t.messages,
      errors: e.errors + t.errors
    };
  }
  function nAf(e) {
    let t = ii(e, ".").replace(/T(\d{2})-(\d{2})-(\d{2})-(\d{3})Z/, "T$1:$2:$3.$4Z");
    return new Date(t);
  }
  async function NAc(e, t, n) {
    let r = {
      messages: 0,
      errors: 0
    };
    try {
      let o = await zt().readdir(e);
      for (let s of o) {
        try {
          if (nAf(s.name) < t) {
            if (await zt().unlink(hc.join(e, s.name)), n) {
              r.messages++;
            } else {
              r.errors++;
            }
          }
        } catch (i) {
          logForDebugging(`Failed to clean up file ${s.name} in ${e}: ${i}`, {
            level: "error"
          });
        }
      }
    } catch (o) {
      if (fn(o)) {
        ;
      } else if (Io(o)) {
        logForDebugging(`cleanup readdir ${e} failed: ${o.code}`, {
          level: "error"
        });
      } else {
        Oe(o);
      }
    }
    return r;
  }
  async function rAf() {
    let e = zt();
    let t = e4();
    if (t === null) {
      return {
        messages: 0,
        errors: 0
      };
    }
    let n = IHe.errors();
    let r = IHe.baseLogs();
    let o = await NAc(n, t, false);
    try {
      let s;
      try {
        s = await e.readdir(r);
      } catch {
        return o;
      }
      let i = s.filter(a => a.isDirectory() && a.name.startsWith("mcp-logs-")).map(a => hc.join(r, a.name));
      for (let a of i) {
        o = GBe(o, await NAc(a, t, true));
        await mB(a, e);
      }
    } catch (s) {
      if (fn(s)) {
        ;
      } else if (Io(s)) {
        logForDebugging(`cleanup mcp-logs scan failed: ${s.code}`, {
          level: "error"
        });
      } else {
        Oe(s);
      }
    }
    return o;
  }
  async function WK(e, t, n) {
    if ((await n.stat(e)).mtime < t) {
      await n.unlink(e);
      return true;
    }
    return false;
  }
  async function mB(e, t) {
    try {
      await t.rmdir(e);
    } catch {}
  }
  async function LAc(e, t, n, r) {
    for (let o of await n.readdir(e).catch(() => [])) {
      let s = hc.join(e, o.name);
      if (o.isDirectory()) {
        await LAc(s, t, n, r);
      } else if (o.isFile()) {
        try {
          if (await WK(s, t, n)) {
            r.messages++;
          }
        } catch {
          r.errors++;
        }
      } else {
        try {
          if ((await n.lstat(s)).mtime < t) {
            await n.unlink(s);
            r.messages++;
          }
        } catch {
          r.errors++;
        }
      }
    }
    await mB(e, n);
  }
  async function EQo(e, t, {
    requireCompleteWalk: n = false
  } = {}) {
    let r = -1 / 0;
    let o = await t.readdir(e).catch(s => {
      if (n && !fn(s)) {
        throw s;
      }
      return [];
    });
    for (let s of o) {
      let i = hc.join(e, s.name);
      if (s.isDirectory()) {
        let a = await EQo(i, t, {
          requireCompleteWalk: n
        });
        if (a !== null) {
          r = Math.max(r, a);
        }
      } else if (s.isFile()) {
        try {
          let {
            mtimeMs: a
          } = await t.stat(i);
          r = Math.max(r, a);
        } catch (a) {
          if (n && !fn(a)) {
            throw a;
          }
        }
      }
    }
    return r === -1 / 0 ? null : r;
  }
  async function oAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = y$();
    let r = zt();
    let o;
    try {
      o = await r.readdir(n);
    } catch {
      return t;
    }
    let s;
    try {
      if (s = pT(), !(await r.lstat(s)).isDirectory()) {
        s = null;
      }
    } catch {
      s = null;
    }
    for (let i of o) {
      if (!i.isDirectory()) {
        continue;
      }
      let a = hc.join(n, i.name);
      let l;
      try {
        l = await r.readdir(a);
      } catch {
        t.errors++;
        continue;
      }
      l.sort((u, d) => Number(d.isDirectory()) - Number(u.isDirectory()));
      let c = new Set(l.filter(u => u.isFile() && u.name.endsWith(".jsonl")).map(u => u.name.slice(0, -6)));
      for (let u of l) {
        if (u.isFile()) {
          if (!u.name.endsWith(".jsonl") && !u.name.endsWith(".cast") && !u.name.endsWith(".ccr-tip.json") && !u.name.endsWith(".precompact.json") && !u.name.includes(".ccr-tip.json.tmp.") && !u.name.includes(".precompact.json.tmp.")) {
            continue;
          }
          try {
            if (await WK(hc.join(a, u.name), e, r)) {
              if (t.messages++, u.name.endsWith(".jsonl")) {
                let d = u.name.slice(0, -6);
                if (d && d !== "." && d !== "..") {
                  if (await r.unlink(hc.join(a, `${d}.ccr-tip.json`)).catch(() => {}), await r.unlink(hc.join(a, `${d}.precompact.json`)).catch(() => {}), await r.rm(hc.join(a, d), {
                    recursive: true,
                    force: true
                  }).catch(() => {
                    t.errors++;
                  }), s !== null) {
                    let p = hc.join(s, i.name);
                    if ((await r.lstat(p).catch(() => null))?.isDirectory()) {
                      await r.rm(hc.join(p, d), {
                        recursive: true,
                        force: true
                      }).catch(() => {
                        t.errors++;
                      });
                      await mB(p, r);
                    }
                  }
                }
              }
            }
          } catch (d) {
            if (!fn(d)) {
              t.errors++;
            }
          }
        } else if (u.isDirectory()) {
          let d = hc.join(a, u.name);
          if (u.name === "bagel") {
            let h = await EQo(d, r);
            if (h !== null && h < e.getTime()) {
              try {
                await r.rm(d, {
                  recursive: true,
                  force: true
                });
                t.messages++;
              } catch {
                t.errors++;
              }
            }
            continue;
          }
          let p = hc.join(d, "tool-results");
          let m = await r.readdir(p).catch(() => []);
          for (let h of m) {
            if (h.isFile()) {
              try {
                if (await WK(hc.join(p, h.name), e, r)) {
                  t.messages++;
                }
              } catch {
                t.errors++;
              }
            } else if (h.isDirectory()) {
              let g = hc.join(p, h.name);
              let y;
              try {
                y = await r.readdir(g);
              } catch {
                continue;
              }
              for (let _ of y) {
                if (!_.isFile()) {
                  continue;
                }
                try {
                  if (await WK(hc.join(g, _.name), e, r)) {
                    t.messages++;
                  }
                } catch {
                  t.errors++;
                }
              }
              await mB(g, r);
            }
          }
          await mB(p, r);
          let f = hc.join(d, "mcp-tasks");
          for (let h of await r.readdir(f).catch(() => [])) {
            if (!h.isFile() || !h.name.endsWith(".json")) {
              continue;
            }
            try {
              if (await WK(hc.join(f, h.name), e, r)) {
                t.messages++;
              }
            } catch {
              t.errors++;
            }
          }
          if (await mB(f, r), !c.vZc(u.name)) {
            for (let h of ["subagents", "workflows", "remote-agents"]) {
              await LAc(hc.join(d, h), e, r, t);
            }
          }
          await mB(d, r);
        }
      }
      await mB(a, r);
    }
    return t;
  }
  async function fB(e, t, n = true, r) {
    let o = e4(r);
    let s = {
      messages: 0,
      errors: 0
    };
    if (o === null) {
      return s;
    }
    let i = zt();
    let a;
    try {
      a = await i.readdir(e);
    } catch {
      return s;
    }
    for (let l of a) {
      if (!l.isFile() || !l.name.endsWith(t)) {
        continue;
      }
      try {
        if (await WK(hc.join(e, l.name), o, i)) {
          s.messages++;
        }
      } catch {
        s.errors++;
      }
    }
    if (n) {
      await mB(e, i);
    }
    return s;
  }
  async function sAf() {
    let e = {
      messages: 0,
      errors: 0
    };
    let t = e4();
    if (t === null) {
      return e;
    }
    let n = hc.join(er(), "hfi-auth.json");
    try {
      if (await WK(n, t, zt())) {
        e.messages++;
      }
    } catch (r) {
      if (!fn(r)) {
        logForDebugging(`Failed to clean up HFI auth file: ${r}`, {
          level: "error"
        });
        e.errors++;
      }
    }
    return e;
  }
  async function iAf() {
    let e = {
      messages: 0,
      errors: 0
    };
    let t = e4();
    if (t === null) {
      return e;
    }
    let n = hc.join(er(), "mcp-needs-auth-cache.json");
    try {
      if (await WK(n, t, zt())) {
        e.messages++;
      }
    } catch (r) {
      if (!fn(r)) {
        if (e.errors++, Io(r)) {
          logForDebugging(`cleanup mcp-auth-cache failed: ${r.code}`, {
            level: "error"
          });
        } else {
          Oe(r);
        }
      }
    }
    return e;
  }
  function aAf() {
    let e = hc.join(er(), "plans");
    return fB(e, ".md");
  }
  async function hXe(e, t, n) {
    let r = e4();
    let o = {
      messages: 0,
      errors: 0
    };
    if (r === null) {
      return o;
    }
    let s = zt();
    let i = hc.join(er(), e);
    let a;
    try {
      a = await s.readdir(i);
    } catch {
      return o;
    }
    for (let l of a) {
      if (!l.isDirectory() || t?.vZc(l.name)) {
        continue;
      }
      let c = hc.join(i, l.name);
      try {
        if ((await s.stat(c)).mtime < r) {
          if (await n?.(c)) {
            continue;
          }
          await s.rm(c, {
            recursive: true,
            force: true
          });
          o.messages++;
        }
      } catch {
        o.errors++;
      }
    }
    await mB(i, s);
    return o;
  }
  function lAf() {
    return hXe("file-history");
  }
  function cAf() {
    return hXe("session-env");
  }
  function uAf() {
    return hXe("tasks");
  }
  function dAf() {
    return hXe("uploads");
  }
  function pAf() {
    return hXe(hc.join("skills", ".staging"));
  }
  async function mAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = zt();
    let r = hc.join(er(), "mcp-skill-archives");
    let o;
    try {
      o = await n.readdir(r);
    } catch {
      return t;
    }
    for (let s of o) {
      if (!s.isDirectory()) {
        continue;
      }
      let i = hc.join(r, s.name);
      let a = (await bTo(i))?.cacheKey ?? null;
      let l;
      try {
        l = await n.readdir(i);
      } catch {
        t.errors++;
        continue;
      }
      for (let c of l) {
        if (!c.isDirectory() || c.name === a) {
          continue;
        }
        let u = hc.join(i, c.name);
        try {
          if ((await n.stat(u)).mtime < e) {
            await n.rm(u, {
              recursive: true,
              force: true
            });
            t.messages++;
          }
        } catch {
          t.errors++;
        }
      }
      try {
        if ((await n.stat(i)).mtime < e) {
          await n.rm(i, {
            recursive: true,
            force: true
          });
          t.messages++;
        }
      } catch {
        t.errors++;
      }
    }
    await mB(r, n);
    return t;
  }
  async function fAf() {
    let e = hc.join(er(), "usage-data");
    let t = await fB(hc.join(e, "facets"), ".json");
    t = GBe(t, await fB(hc.join(e, "session-meta"), ".json"));
    t = GBe(t, await fB(e, ".html", false));
    await mB(e, zt());
    return t;
  }
  async function hAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = zt();
    let r;
    try {
      r = pT();
    } catch {
      return t;
    }
    let o;
    try {
      o = await n.readdir(r);
    } catch {
      return t;
    }
    for (let s of o) {
      if (!s.isFile() || !s.name.startsWith("cc-transcript-") || !s.name.endsWith(".txt")) {
        continue;
      }
      try {
        if (await WK(hc.join(r, s.name), e, n)) {
          t.messages++;
        }
      } catch {
        t.errors++;
      }
    }
    return t;
  }
  async function gAf() {
    let e = {
      messages: 0,
      errors: 0
    };
    let t = e4(3);
    if (t === null) {
      return e;
    }
    let n = zt();
    let r;
    try {
      if (r = pT(), !(await n.lstat(r)).isDirectory()) {
        return e;
      }
    } catch {
      return e;
    }
    let o = hc.join(r, "speculation");
    let s;
    try {
      s = await n.lstat(o);
    } catch {
      return e;
    }
    if (!s.isDirectory()) {
      return e;
    }
    try {
      if (((await EQo(o, n, {
        requireCompleteWalk: true
      })) ?? s.mtimeMs) < t.getTime()) {
        await n.rm(o, {
          recursive: true,
          force: true
        });
        e.messages++;
        return e;
      }
    } catch {
      e.errors++;
    }
    await mB(o, n);
    return e;
  }
  async function yAf() {
    let e = hc.join(er(), "shares");
    let t = await hXe("shares");
    t = GBe(t, await fB(e, ".zip", false));
    await mB(e, zt());
    return t;
  }
  function _Af() {
    return fB(hc.join(er(), "telemetry"), ".json");
  }
  function bAf() {
    return fB(hc.join(er(), "dump-prompts"), ".jsonl", true, 3);
  }
  function SAf() {
    return fB(hc.join(er(), "shell-snapshots"), ".sh");
  }
  async function TAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = zt();
    let r = pxe();
    for (let o of await n.readdir(r).catch(() => [])) {
      if (!o.isDirectory()) {
        continue;
      }
      let s = hc.join(r, o.name, "inboxes");
      for (let i of await n.readdir(s).catch(() => [])) {
        if (!i.isFile() || !i.name.endsWith(".json")) {
          continue;
        }
        try {
          if (await WK(hc.join(s, i.name), e, n)) {
            t.messages++;
          }
        } catch {
          t.errors++;
        }
      }
      await mB(s, n);
      await mB(hc.join(r, o.name), n);
    }
    return t;
  }
  async function EAf() {
    let e = er();
    let t = await fB(hc.join(e, "jobs", "settled"), ".json");
    t = GBe(t, await fB(hc.join(e, "daemon", "dispatch", "rejected"), ".json"));
    t = GBe(t, await fB(hc.join(e, "daemon", "dispatch"), ".json", false));
    t = GBe(t, await fB(hc.join(e, "daemon", "auth"), ".json"));
    try {
      let a = hc.join(e, "daemon", "host-managed");
      let l = zt();
      let c = e4();
      if (c) {
        let u = c.getTime();
        for (let d of await l.readdir(a)) {
          try {
            await l.lstat(hc.join(e, "jobs", d.name));
          } catch (p) {
            if (!fn(p)) {
              t.errors++;
              continue;
            }
            let m = await l.lstat(hc.join(a, d.name)).catch(() => null);
            if (m && m.mtimeMs < u) {
              await l.unlink(hc.join(a, d.name)).catch(() => {});
              t.messages++;
            }
          }
        }
      }
    } catch (a) {
      if (!fn(a)) {
        t.errors++;
      }
    }
    let n = getSettingsForSource("policySettings")?.cleanupPeriodDays !== undefined;
    let r = e4();
    let o = new Set();
    if (!n) {
      for (let a of await TGe()) {
        o.add(a);
      }
    }
    let s = false;
    let i = false;
    try {
      let a = hc.join(e, "daemon", "roster.json");
      let l = await zt().lstat(a);
      if (!l.isFile() || l.size > 8388608) {
        throw Error("not a regular file");
      }
      let c = await zt().readFile(a, {
        encoding: "utf-8"
      });
      let u = qt(c);
      if (u !== null && typeof u === "object" && "workers" in u) {
        let d = u.workers;
        if (d !== null && typeof d === "object") {
          s = true;
          for (let [p, m] of Object.entries(d)) {
            if (m !== null && typeof m === "object" && "pid" in m && typeof m.pid === "number" && isProcessRunning(m.pid) && (await isSameProcessAsync(m.pid, "procStart" in m && typeof m.procStart === "string" ? m.procStart : undefined))) {
              o.add(p);
              i = true;
            }
          }
        }
      }
    } catch {}
    if (t = GBe(t, await hXe("jobs", o, async a => {
      let l = await Zi(a);
      if (!n && (l === null || !Xg(l))) {
        return true;
      }
      if (l?.worktreePath && Xg(l) && r) {
        await reapJobWorktreeIfSafe(l.worktreePath, l.worktreeBranch, l.originCwd, l.worktreeHookBased, r).catch(() => {});
      }
      return false;
    })), r !== null) {
      let a = zt();
      for (let c of [hc.join(e, "daemon.log"), hc.join(e, "daemon.log.1")]) {
        try {
          if (await WK(c, r, a)) {
            t.messages++;
          }
        } catch (u) {
          if (!fn(u)) {
            t.errors++;
          }
        }
      }
      let l = hc.join(e, "daemon", "roster.json");
      try {
        if ((await a.lstat(l)).mtime < r && !i && (s || n)) {
          await a.unlink(l);
          t.messages++;
        }
      } catch (c) {
        if (!fn(c)) {
          t.errors++;
        }
      }
      for (let c of await a.readdir(hc.join(e, "daemon")).catch(() => [])) {
        if (!c.isFile() || !c.name.startsWith("roster.json.corrupt.")) {
          continue;
        }
        try {
          if (await WK(hc.join(e, "daemon", c.name), r, a)) {
            t.messages++;
          }
        } catch {
          t.errors++;
        }
      }
    }
    await Egr();
    return t;
  }
  function vAf() {
    return fB(hc.join(er(), "backups"), "", false);
  }
  async function wAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = zt();
    let r = hc.join(er(), "debug");
    let o;
    try {
      o = await n.readdir(r);
    } catch {
      return t;
    }
    for (let s of o) {
      if (s.name === "latest" || !s.isFile()) {
        continue;
      }
      try {
        if (await WK(hc.join(r, s.name), e, n)) {
          t.messages++;
        }
      } catch {
        t.errors++;
      }
    }
    return t;
  }
  async function CAf() {
    return fB(hc.join(er(), "feedback-bundles"), ".zip");
  }
  async function RAf() {
    let e = await fB(hc.join(er(), "traces"), ".json");
    let t = await fB(hc.join(er(), "startup-perf"), ".txt");
    let n = await fB(hc.join(er(), "startup-perf"), ".json");
    return {
      messages: e.messages + t.messages + n.messages,
      errors: e.errors + t.errors + n.errors
    };
  }
  async function xAf() {
    let e = e4();
    let t = {
      messages: 0,
      errors: 0
    };
    if (e === null) {
      return t;
    }
    let n = zt();
    for (let r of ["todos", "statsig", "logs"]) {
      let o = hc.join(er(), r);
      let s;
      try {
        s = await n.readdir(o);
      } catch {
        continue;
      }
      for (let i of s) {
        let a = hc.join(o, i.name);
        try {
          if ((await n.stat(a)).mtime >= e) {
            continue;
          }
          if (i.isDirectory()) {
            await n.rm(a, {
              recursive: true,
              force: true
            });
          } else {
            await n.unlink(a);
          }
          t.messages++;
        } catch {
          t.errors++;
        }
      }
      await mB(o, n);
    }
    return t;
  }
  async function FAc() {
    if (await YEc(), !tAf()) {
      return;
    }
    await rAf();
    await oAf();
    await aAf();
    await lAf();
    await cAf();
    await uAf();
    await dAf();
    await fAf();
    await pAf();
    await mAf();
    await hAf();
    await gAf();
    await yAf();
    await _Af();
    await wAf();
    await CAf();
    await RAf();
    await bAf();
    await SAf();
    await TAf();
    await EAf();
    await vAf();
    await sAf();
    await iAf();
    await xAf();
    let e = e4();
    if (e !== null) {
      await wQi(e);
      let t = await cleanupStaleAgentWorktrees(e);
      if (t > 0) {
        logEvent("tengu_worktree_cleanup", {
          removed: t
        });
      }
    }
  }
  var hc;
  var UAc = __lazy(() => {
    TQo();
    zf();
    Ot();
    gGn();
    Ufn();
    je();
    gn();
    dt();
    Tb();
    URt();
    Rn();
    qQ();
    coo();
    Fy();
    W_t();
    nf();
    Zn();
    BC();
    zI();
    iP();
    hc = require("path");
  });
  function HAc(e, {
    allowNewlineAndTab: t = false
  } = {}) {
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      if (r <= 31 || r >= 127 && r <= 159) {
        if (t && (r === 10 || r === 9)) {
          continue;
        }
        return true;
      }
    }
    return false;
  }
  function vQo(e) {
    if (/^[/\\]{2}/.test(e)) {
      throw Error(`Invalid cwd in deep link: UNC / network paths are not supported, got "${e}"`);
    }
    if (!e.startsWith("/") && !/^[a-zA-Z]:[/\\]/.test(e)) {
      throw Error(`Invalid cwd in deep link: must be an absolute path, got "${e}"`);
    }
    if (HAc(e)) {
      throw Error("Deep link cwd contains disallowed control characters");
    }
    if (/(?![\u200C\u200D\uFE00-\uFE0F\u{E0100}-\u{E01EF}])[\p{Default_Ignorable_Code_Point}\u2028\u2029\u2800\uFFF9-\uFFFB\u{1D173}-\u{1D17A}]/u.test(e)) {
      throw Error("Deep link cwd contains invisible or bidirectional control characters");
    }
    if (e.length > 4096) {
      throw Error(`Deep link cwd exceeds ${4096} characters (got ${e.length})`);
    }
  }
  function wQo(e) {
    let t = FSo(e).replace(/\r\n?/g, `
`);
    if (HAc(t, {
      allowNewlineAndTab: true
    })) {
      throw Error("Deep link query contains disallowed control characters");
    }
    if (t.length > 5000) {
      throw Error(`Deep link query exceeds ${5000} characters (got ${t.length})`);
    }
    return t;
  }
  function jAc(e) {
    let t = e.startsWith(`${"claude-cli"}://`) ? e : e.startsWith(`${"claude-cli"}:`) ? e.replace(`${"claude-cli"}:`, `${"claude-cli"}://`) : null;
    if (!t) {
      throw Error(`Invalid deep link: expected ${"claude-cli"}:// scheme, got "${e}"`);
    }
    let n;
    try {
      n = new URL(t);
    } catch {
      throw Error(`Invalid deep link URL: "${e}"`);
    }
    if (n.hostname !== "open") {
      throw Error(`Unknown deep link action: "${n.hostname}"`);
    }
    let r = n.searchParams.get("cwd") ?? undefined;
    let o = n.searchParams.get("repo") ?? undefined;
    let s = n.searchParams.get("q");
    if (r) {
      vQo(r);
    }
    if (o && !kAf.test(o)) {
      throw Error(`Invalid repo in deep link: expected "owner/repo", got "${o}"`);
    }
    let i;
    if (s && s.trim().length > 0) {
      i = wQo(s.trim());
    }
    return {
      query: i,
      cwd: r,
      repo: o
    };
  }
  var kAf;
  var vgr = __lazy(() => {
    dNe();
    kAf = /^[\w.-]+\/[\w.-]+$/;
  });
  function wgr() {
    return qie.join(boe(), "applications", "claude-code-url-handler.desktop");
  }
  function VAc(e) {
    return `Exec="${e}" --handle-uri %u`;
  }
  function zAc(e) {
    return `"${e}" --handle-uri "%1"`;
  }
  async function PAf(e) {
    let t = qie.join(non, "Contents");
    try {
      await Y5.promises.rm(non, {
        recursive: true
      });
    } catch (o) {
      if (en(o) !== "ENOENT") {
        throw o;
      }
    }
    await Y5.promises.mkdir(qie.dirname(CQo), {
      recursive: true
    });
    let n = `<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
  <key>CFBundleIdentifier</key>
  <string>${"com.anthropic.claude-code-url-handler"}</string>
  <key>CFBundleName</key>
  <string>${"Claude Code URL Handler"}</string>
  <key>CFBundleExecutable</key>
  <string>claude</string>
  <key>CFBundleVersion</key>
  <string>1.0</string>
  <key>CFBundlePackageType</key>
  <string>APPL</string>
  <key>LSBackgroundOnly</key>
  <true/>
  <key>CFBundleURLTypes</key>
  <array>
    <dict>
      <key>CFBundleURLName</key>
      <string>Claude Code Deep Link</string>
      <key>CFBundleURLSchemes</key>
      <array>
        <string>${"claude-cli"}</string>
      </array>
    </dict>
  </array>
</dict>
</plist>`;
    await Y5.promises.writeFile(qie.join(t, "Info.plist"), n);
    await Y5.promises.symlink(e, CQo);
    await execFileNoThrow("/System/Library/Frameworks/CoreServices.framework/Frameworks/LaunchServices.framework/Support/lsregister", ["-R", non], {
      useCwd: false
    });
    logForDebugging(`Registered ${"claude-cli"}:// protocol handler at ${non}`);
  }
  async function OAf(e) {
    await Y5.promises.mkdir(qie.dirname(wgr()), {
      recursive: true
    });
    let t = `[Desktop Entry]
Name=${"Claude Code URL Handler"}
Comment=Handle ${"claude-cli"}:// deep links for Claude Code
${VAc(e)}
Type=Application
NoDisplay=true
MimeType=x-scheme-handler/${"claude-cli"};
`;
    await Y5.promises.writeFile(wgr(), t);
    let n = await Qm("xdg-mime");
    if (n) {
      let {
        code: r
      } = await execFileNoThrow(n, ["default", "claude-code-url-handler.desktop", `x-scheme-handler/${"claude-cli"}`], {
        useCwd: false
      });
      if (r !== 0) {
        throw Object.assign(Error(`xdg-mime exited with code ${r}`), {
          code: "XDG_MIME_FAILED"
        });
      }
    }
    logForDebugging(`Registered ${"claude-cli"}:// protocol handler at ${wgr()}`);
  }
  async function DAf(e) {
    for (let t of [["add", RQo, "/ve", "/d", `URL:${"Claude Code URL Handler"}`, "/f"], ["add", RQo, "/v", "URL Protocol", "/d", "", "/f"], ["add", GAc, "/ve", "/d", zAc(e), "/f"]]) {
      let {
        code: n
      } = await execFileNoThrow("reg", t, {
        useCwd: false
      });
      if (n !== 0) {
        throw Object.assign(Error(`reg add exited with code ${n}`), {
          code: "REG_FAILED"
        });
      }
    }
    logForDebugging(`Registered ${"claude-cli"}:// protocol handler in Windows registry`);
  }
  async function MAf(e) {
    let t = e ?? (await KAc());
    switch ("linux") {
      case "darwin":
        await PAf(t);
        break;
      case "linux":
        await OAf(t);
        break;
      case "win32":
        await DAf(t);
        break;
      default:
        throw Error("Unsupported platform: linux");
    }
  }
  async function KAc() {
    let t = qie.join(zde(), "claude");
    try {
      await Y5.promises.realpath(t);
      return t;
    } catch {
      return process.execPath;
    }
  }
  async function NAf(e) {
    try {
      switch ("linux") {
        case "darwin":
          return (await Y5.promises.readlink(CQo)) === e;
        case "linux":
          return (await Y5.promises.readFile(wgr(), "utf8")).includes(VAc(e));
        case "win32":
          {
            let {
              stdout: t,
              code: n
            } = await execFileNoThrow("reg", ["query", GAc, "/ve"], {
              useCwd: false
            });
            return n === 0 && t.includes(zAc(e));
          }
        default:
          return false;
      }
    } catch {
      return false;
    }
  }
  async function YAc() {
    if (getInitialSettings().disableDeepLinkRegistration === "disable") {
      return;
    }
    if (!["darwin", "linux", "win32"].includes("linux")) {
      return;
    }
    let e = await KAc();
    if (await NAf(e)) {
      return;
    }
    let t = qie.join(er(), ".deep-link-register-failed");
    try {
      let n = await Y5.promises.stat(t);
      if (Date.now() - n.mtimeMs < 86400000) {
        return;
      }
    } catch {}
    try {
      await MAf(e);
      Pe("deep_link_register");
      logForDebugging("Auto-registered claude-cli:// deep link protocol handler");
      await Y5.promises.rm(t, {
        force: true
      }).catch(() => {});
    } catch (n) {
      let r = gd(n);
      if (Ae("deep_link_register", r ?? "register_failed"), logForDebugging(`Failed to auto-register deep link protocol handler: ${n instanceof Error ? n.message : String(n)}`, {
        level: "warn"
      }), r === "EACCES" || r === "ENOSPC") {
        await Y5.promises.writeFile(t, "").catch(() => {});
      }
    }
  }
  var Y5;
  var qAc;
  var qie;
  var non;
  var CQo;
  var RQo;
  var GAc;
  var AQo = __lazy(() => {
    ln();
    je();
    gn();
    dt();
    ji();
    zTe();
    vgr();
    Y5 = require("fs");
    qAc = __toESM(require("os"));
    qie = __toESM(require("path"));
    non = qie.join(qAc.homedir(), "Applications", "Claude Code URL Handler.app");
    CQo = qie.join(non, "Contents", "MacOS", "claude");
    RQo = `HKEY_CURRENT_USER\\Software\\Classes\\${"claude-cli"}`;
    GAc = `${RQo}\\shell\\open\\command`;
  });
  var xgr = {};