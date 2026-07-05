  __export(Eac, {
    call: () => call_export85
  });
  async function call_export85(e, t) {
    return vac.jsx(Sac, {
      onDone: e,
      context: t
    });
  }
  var vac;
  var wac = __lazy(() => {
    Tac();
    vac = __toESM(ie(), 1);
  });
  var ssf;
  function isf() {
    return !FX() && !Me.DISABLE_UPGRADE_COMMAND && getSubscriptionType() !== "enterprise";
  }
  function kac(e) {
    return e.overageDisabledReason === "org_level_disabled_until" && e.balanceMinorUnits > 0;
  }
  function xac(e, t, n = null) {
    let r = e ?? 4000;
    let o = t === 1 ? Math.floor(r / 500 + 1) * 500 : Math.ceil(r / 500 - 1) * 500;
    let s = n === null ? 500 : t === 1 ? Math.ceil((n + 1000) / 500) * 500 : n;
    return Math.min(10000000000, Math.max(s, o));
  }
  function Aac({
    balance: e,
    onDone: t,
    context: n
  }) {
    let [r, o] = dee.useState(null);
    let [s] = useTheme();
    let i = Wme();
    let a = getSubscriptionType();
    let c = !(a === "max" && getRateLimitTier() === "default_claude_max_20x") && isf();
    let u = e.currency;
    let [d, p] = dee.useState(undefined);
    let [m, f] = dee.useState(undefined);
    let [h, g] = dee.useState(false);
    let [y, _] = dee.useState(0);
    let [b, S] = dee.useState(null);
    dee.useEffect(() => {
      let L = vI();
      if (L) {
        p(L.spendLimitCents);
        f(L.spendLimitCents);
        return;
      }
      let P = false;
      Ide().then(F => {
        if (P) {
          return;
        }
        let H = F?.extra_usage?.monthly_limit ?? null;
        let U = F?.extra_usage?.used_credits ?? 0;
        let N = H === null ? null : Math.max(H, U);
        p(N);
        f(N);
      }).catch(() => {
        if (P) {
          return;
        }
        p(null);
        f(null);
      });
      return () => {
        P = true;
      };
    }, []);
    let E = dee.useMemo(() => {
      if (i.resetsAt) {
        return formatResetTime(i.resetsAt, true);
      }
      return;
    }, [i.resetsAt]);
    let C = m !== undefined;
    let x = !C ? "\u2026" : m === null ? "Unlimited" : Ky(m, u, "fit");
    let A = dee.useMemo(() => {
      let L = [{
        id: "adjust",
        label: `Adjust monthly spend limit: ${x}`,
        hint: d === null ? "\u2190 or \u2192 to set a limit" : "\u2190 or \u2192 to adjust \xB7 Del to remove limit"
      }, {
        id: "wait",
        label: "Wait for limit to reset",
        hint: E ? `Resets ${E}` : ""
      }];
      if (c) {
        let P = a === "max" ? "Max 20x" : "Max";
        L.push({
          id: "upgrade",
          label: `Upgrade to ${P} for higher session limits every month`,
          hint: ""
        });
      }
      return L;
    }, [x, E, c, a, d]);
    function k() {
      logEvent("tengu_spend_limit_nudge_cancel", {});
      t(undefined, {
        display: "skip"
      });
    }
    async function I() {
      if (!C || h) {
        return;
      }
      if (m === d) {
        S(d === null ? "Press \u2190 or \u2192 to set a limit." : "Press \u2192 to raise the limit, or Del to remove it.");
        return;
      }
      g(true);
      let L = m ?? null;
      let P = await W$n(L, u);
      if (!P.ok) {
        g(false);
        S("Could not update your spend limit. Press Enter to retry.");
        return;
      }
      let F = P.disabledUntil != null ? new Date(P.disabledUntil) : null;
      let H = F != null && (Number.isNaN(F.getTime()) || F > new Date());
      if (logEvent("tengu_spend_limit_nudge_save", {
        removed: L === null,
        reblocked: H
      }), H) {
        g(false);
        let N = P.usedCredits !== null ? Math.max(d ?? 0, P.usedCredits) : d;
        p(N ?? null);
        f(W => N !== null && N !== undefined && W !== null ? Math.max(W ?? 0, N) : W);
        S(P.usedCredits !== null ? `You've already used ${Ky(P.usedCredits, u, "fit")} this month \u2014 set your limit above that.` : "Your current spend is still over the new limit. Raise it higher or remove it.");
        return;
      }
      S(null);
      let U = {
        ...g0,
        isUsingOverage: true
      };
      if (delete U.overageDisabledReason, U.status === "rejected") {
        U.status = "allowed";
      }
      if (I4t(U), L === null) {
        t(color("success", s)("Removed monthly spend limit"));
      } else {
        t(color("success", s)(`Increased monthly spend limit to ${Ky(L, u, "fit")}`));
      }
    }
    function O(L) {
      if (L === "adjust") {
        I();
      } else if (L === "wait") {
        logEvent("tengu_spend_limit_nudge_wait", {});
        t(undefined, {
          display: "skip"
        });
      } else if (L === "upgrade") {
        logEvent("tengu_spend_limit_nudge_upgrade", {});
        Promise.resolve().then(() => (ctn(), N6o)).then(({
          call: P
        }) => P(t, n)).then(P => {
          if (P) {
            o(P);
          }
        });
      }
    }
    function M(L) {
      if (h) {
        return;
      }
      if (L.key === "up") {
        L.preventDefault();
        S(null);
        _(P => Math.max(0, P - 1));
        return;
      }
      if (L.key === "down") {
        L.preventDefault();
        S(null);
        _(P => Math.min(A.length - 1, P + 1));
        return;
      }
      if (L.key === "return") {
        L.preventDefault();
        let P = A[y];
        if (P) {
          O(P.id);
        }
        return;
      }
      if (A[y]?.id !== "adjust" || !C) {
        return;
      }
      if (L.key === "left") {
        L.preventDefault();
        S(null);
        f(P => xac(P ?? null, -1, d ?? null));
      } else if (L.key === "right") {
        L.preventDefault();
        S(null);
        f(P => xac(P ?? null, 1, d ?? null));
      } else if (L.key === "delete" || L.key === "backspace") {
        L.preventDefault();
        S(null);
        f(null);
      }
    }
    if (r) {
      return r;
    }
    return Iie.jsx(or, {
      title: "What do you want to do?",
      titleEnd: `Usage credit balance: ${Ky(e.amount, u)}`,
      onCancel: k,
      isCancelActive: !h,
      color: "suggestion",
      children: Iie.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: M,
        children: [Iie.jsx(gXd, {
          flexDirection: "column",
          children: A.map((L, P) => {
            let F = P === y;
            return Iie.jsxs(gXd, {
              justifyContent: "space-between",
              gap: 2,
              children: [Iie.jsxs(Text, {
                color: F ? "suggestion" : undefined,
                children: [F ? vGd.pointer : " ", " ", L.label]
              }), L.hint ? Iie.jsx(Text, {
                dimColor: true,
                wrap: "truncate-end",
                children: L.hint
              }) : null]
            }, L.id);
          })
        }), h ? Iie.jsx(Xc, {
          message: "Updating spend limit\u2026"
        }) : b ? Iie.jsx(gXd, {
          children: Iie.jsx(Text, {
            color: "error",
            children: b
          })
        }) : null]
      })
    });
  }
  var dee;
  var Iie;
  var Iac = __lazy(() => {
    Ii();
    Pv();
    et();
    Ot();
    hpt();
    ETe();
    pU();
    jSt();
    jle();
    no();
    Wve();
    pr();
    cs();
    U9e();
    dee = __toESM(ot(), 1);
    Iie = __toESM(ie(), 1);
  });
  var Pac = {};
  __export(Pac, {
    call: () => call_export86
  });
  function usf({
    onDone: e,
    context: t
  }) {
    let [n, r] = yJe.useState(null);
    let o = Wme();
    let s = getSubscriptionType();
    let i = getRateLimitTier();
    let a = getOauthAccountInfo()?.hasExtraUsageEnabled === true;
    let l = getOauthAccountInfo()?.billingType === "usage_based";
    let u = s === "max" && i === "default_claude_max_20x";
    let d = s === "team" || s === "enterprise";
    let p = getFeatureValue_CACHED_MAY_BE_STALE("tengu_jade_anvil_4", false);
    let m = getFeatureValue_CACHED_MAY_BE_STALE("tengu_coral_beacon", false);
    let f = o.upgradePaths;
    let g = getFeatureValue_CACHED_MAY_BE_STALE("tengu_pewter_summit", false) && !d && o.overageDisabledReason === "org_level_disabled_until" && av() && Mse.isEnabled();
    let [y, _] = yJe.useState(null);
    yJe.useEffect(() => {
      if (!g) {
        return;
      }
      let C = false;
      fpt().then(x => {
        if (C || !x) {
          return;
        }
        if (kac({
          overageDisabledReason: o.overageDisabledReason,
          balanceMinorUnits: x.amount
        })) {
          _(x);
        }
      }).catch(() => {});
      return () => {
        C = true;
      };
    }, [g]);
    let b = yJe.useMemo(() => {
      let C = [];
      let x = f !== undefined;
      if (Mse.isEnabled()) {
        let I = av();
        let O = d && !I;
        if (x ? f.includes("overage") : true) {
          let L = l ? "usage" : "usage credits";
          let P;
          if (O) {
            P = "Ask your admin for more usage";
          } else {
            P = a ? `Add funds to continue with ${L}` : `Switch to ${L}`;
          }
          C.push({
            label: P,
            value: "extra-usage"
          });
        }
      }
      if (x ? f.includes("upgrade_plan") && rsf.isEnabled() : !u && !d && rsf.isEnabled()) {
        C.push({
          label: "Upgrade your plan",
          value: "upgrade"
        });
      }
      if (m && !d && rsf.isEnabled()) {
        C.push({
          label: u ? "Switch to Team plan" : "Upgrade to Team plan",
          value: "team"
        });
      }
      let k = {
        label: l ? "Stop" : "Stop and wait for limit to reset",
        value: "cancel"
      };
      if (p) {
        return [...C, k];
      }
      return [k, ...C];
    }, [p, m, f, u, d, a, l]);
    function S() {
      logEvent("tengu_rate_limit_options_menu_cancel", {});
      e(undefined, {
        display: "skip"
      });
    }
    function E(C) {
      if (C === "upgrade") {
        logEvent("tengu_rate_limit_options_menu_select_upgrade", {});
        call_export84(e, t).then(x => {
          if (x) {
            r(x);
          }
        });
      } else if (C === "team") {
        logEvent("tengu_rate_limit_options_menu_select_team", {});
        Ac("https://claude.ai/create/team").then(x => {
          e(x ? `Opening ${"https://claude.ai/create/team"} in your browser. Run /login after upgrading to use your new plan.` : `Could not open a browser. Visit ${"https://claude.ai/create/team"} to upgrade, then run /login.`);
        });
      } else if (C === "extra-usage") {
        logEvent("tengu_rate_limit_options_menu_select_extra_usage", {});
        call_export3(e, t).then(x => {
          if (x) {
            r(x);
          }
        });
      } else if (C === "cancel") {
        S();
      }
    }
    if (n) {
      return n;
    }
    if (y) {
      return utn.jsx(Aac, {
        balance: y,
        onDone: e,
        context: t
      });
    }
    return utn.jsx(or, {
      title: "What do you want to do?",
      onCancel: S,
      color: "suggestion",
      children: utn.jsx(xr, {
        options: b,
        onChange: E,
        visibleOptionCount: b.length
      })
    });
  }
  async function call_export86(e, t) {
    return utn.jsx(usf, {
      onDone: e,
      context: t
    });
  }
  var yJe;
  var utn;
  var Oac = __lazy(() => {
    $c();
    Ii();
    $n();
    Ot();
    hpt();
    jSt();
    no();
    vF();
    ky();
    F7t();
    HSt();
    ctn();
    Iac();
    yJe = __toESM(ot(), 1);
    utn = __toESM(ie(), 1);
  });
  var psf;
  var msf;
  var Gac = {};
  __export(Gac, {
    showCurrentEffort: () => showCurrentEffort,
    rippleLevel: () => rippleLevel,
    rippleDistance: () => rippleDistance,
    getSliderGeometry: () => getSliderGeometry,
    getEffortHelpText: () => getEffortHelpText,
    executeEffort: () => executeEffort,
    call: () => call_export87,
    UltraRippleText: () => UltraRippleText,
    RIPPLE_RAMP: () => RIPPLE_RAMP
  });
  function getEffortHelpText() {
    let e = getMainLoopModel();
    let t = B8(e);
    let n = Lbe(e);
    return `Usage: /effort [${n.join("|")}${t ? "|ultracode" : ""}|auto]

Effort levels:
` + n.map(r => `- ${r}: ${fsf[r]}
`).join("") + (t ? `- ultracode: xhigh + dynamic workflow orchestration (this session only)
` : "") + "- auto: Use the default effort level for your model";
  }
  function odr(e) {
    let t = Lbe(e);
    let n = B8(e) ? ", ultracode" : "";
    return `${t.join(", ")}${n}, auto`;
  }
  function hsf(e, t) {
    let n = e.toLowerCase();
    if (n === "auto" || n === "unset") {
      return {
        value: undefined
      };
    }
    if (n === "ultracode" && B8(t)) {
      return {
        value: "xhigh"
      };
    }
    let r = elt(e);
    return r ? {
      value: r
    } : null;
  }
  function H6o(e, t = false) {
    if (!Ul()) {
      return null;
    }
    if (!c_()) {
      return " (applied locally \u2014 this remote transport can\u2019t change server effort)";
    }
    Ul()?.sendControlRequest({
      subtype: "apply_flag_settings",
      settings: {
        effortLevel: e ?? null,
        ultracode: t
      }
    }).catch(Oe);
    return null;
  }
  function gsf(e) {
    let t = getMainLoopModel();
    let n = typeof e === "string" ? $Ie(e, t) : e;
    let r = n !== e;
    let o = HIe(n);
    if (c_() && o === undefined) {
      return {
        message: `${n} is session-scoped and won't reach the remote process. Use low, medium, high, or xhigh instead.`
      };
    }
    let s = H6o(o);
    let i = S$t(n);
    if (i) {
      return {
        message: `Failed to set effort level: ${i.message}`
      };
    }
    logEvent("tengu_effort_command", {
      effort: n,
      is_remote: Ul() !== null
    });
    let a = Ul() ? undefined : nWe();
    if (a !== undefined && a !== n) {
      let u = process.env.CLAUDE_CODE_EFFORT_LEVEL;
      if (o === undefined) {
        return {
          message: `Not applied: CLAUDE_CODE_EFFORT_LEVEL=${u} overrides effort this session, and ${Kce(n)} is session-only (nothing saved)`,
          effortUpdate: {
            value: n,
            ultracode: false
          }
        };
      }
      return {
        message: `CLAUDE_CODE_EFFORT_LEVEL=${u} overrides this session \u2014 clear it and ${Kce(n)} takes over`,
        effortUpdate: {
          value: n,
          ultracode: false
        }
      };
    }
    let l = mQr(n);
    let c = o !== undefined && !Ul() ? " (saved as your default for new sessions)" : " (this session only)";
    if (r) {
      return {
        message: `Effort '${e}' exceeds your organization's limit for ${t}; set to '${n}' instead${c}: ${l}${s ?? ""}`,
        effortUpdate: {
          value: n,
          ultracode: false
        }
      };
    }
    return {
      message: `Set effort level to ${Kce(n)}${c}: ${l}${s ?? ""}`,
      effortUpdate: {
        value: n,
        ultracode: false
      }
    };
  }
  function showCurrentEffort(e, t, n) {
    if (Jne(t, e, n)) {
      return {
        message: "Current effort level: ultracode (xhigh + dynamic workflow orchestration; this session only)"
      };
    }
    let r = Ul() ? undefined : nWe();
    let o = rWe(t) ? undefined : e;
    let s = r === null ? undefined : r ?? o;
    if (s === undefined) {
      let a = r1(t, e);
      return {
        message: `Effort level: auto (currently ${Kce(a)})`
      };
    }
    let i = mQr(s);
    return {
      message: `Current effort level: ${Kce(s)} (${i})`
    };
  }
  function ysf() {
    let e = H6o(undefined);
    let t = S$t(undefined);
    if (t) {
      return {
        message: `Failed to set effort level: ${t.message}`
      };
    }
    logEvent("tengu_effort_command", {
      effort: "auto",
      is_remote: Ul() !== null
    });
    let n = Ul() ? undefined : nWe();
    if (n !== undefined && n !== null) {
      return {
        message: `Cleared effort from settings, but CLAUDE_CODE_EFFORT_LEVEL=${process.env.CLAUDE_CODE_EFFORT_LEVEL} still controls this session`,
        effortUpdate: {
          value: undefined,
          ultracode: false
        }
      };
    }
    return {
      message: `Effort level set to auto${e ?? ""}`,
      effortUpdate: {
        value: undefined,
        ultracode: false
      }
    };
  }
  function _sf() {
    let e = getMainLoopModel();
    if (!B8()) {
      return {
        message: `Ultracode needs dynamic workflows enabled (see /config). Valid options are: ${odr(e)}`
      };
    }
    if (Yne(e) && !tWe("xhigh", e)) {
      return {
        message: `Ultracode runs at xhigh effort, which is restricted by your organization for ${e}. Valid options are: ${odr(e)}`
      };
    }
    if (!B8(e)) {
      return {
        message: `Ultracode runs at xhigh effort, which ${e} doesn't support \u2014 switch to an xhigh-capable model (${"Fable 5, Opus 4.7+, Sonnet 5"}). Valid options are: ${odr(e)}`
      };
    }
    let t = H6o("xhigh", true);
    eq();
    logEvent("tengu_effort_command", {
      effort: "ultracode",
      is_remote: Ul() !== null
    });
    let n = Ul() ? undefined : nWe();
    if (n !== undefined && n !== "xhigh") {
      return {
        message: `CLAUDE_CODE_EFFORT_LEVEL=${process.env.CLAUDE_CODE_EFFORT_LEVEL} overrides effort this session \u2014 clear it and ultracode takes over`,
        effortUpdate: {
          value: "xhigh",
          ultracode: true
        }
      };
    }
    return {
      message: `Set effort level to ultracode (this session only): xhigh + dynamic workflow orchestration${t ?? ""}`,
      effortUpdate: {
        value: "xhigh",
        ultracode: true
      }
    };
  }
  function executeEffort(e) {
    let t = e.toLowerCase();
    if (t === "auto" || t === "unset") {
      return ysf();
    }
    if (t === "ultracode") {
      return _sf();
    }
    let n = elt(e);
    if (!n) {
      return {
        message: `Invalid argument: ${e}. Valid options are: ${odr(getMainLoopModel())}`
      };
    }
    return gsf(n);
  }
  function bsf(e) {
    let {
      onDone: t
    } = e;
    let n = bt(Tsf);
    let r = bt(Ssf);
    let o = dR();
    let {
      message: s
    } = showCurrentEffort(n, o, r);
    t(s);
    return null;
  }
  function Ssf(e) {
    return e.ultracode;
  }
  function Tsf(e) {
    return e.effortValue;
  }
  function B6o(e, t, n) {
    let r = executeEffort(e);
    if (r.effortUpdate) {
      let {
        value: o,
        ultracode: s = false
      } = r.effortUpdate;
      t(i => {
        if (i.effortValue === o && (i.ultracode ?? false) === s) {
          return i;
        }
        return {
          ...i,
          effortValue: o,
          ultracode: s
        };
      });
    }
    n(r.message);
  }
  function Esf(e) {
    let t = FCt.c(23);
    let {
      args: n,
      hasConversationMessages: r,
      onDone: o
    } = e;
    let s = bt(wsf);
    let i = bt(vsf);
    let a = dR();
    let l = Lo();
    let c;
    if (t[0] !== n || t[1] !== a) {
      c = hsf(n, a);
      t[0] = n;
      t[1] = a;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u = c;
    let d;
    if (t[3] !== i || t[4] !== s || t[5] !== r || t[6] !== a || t[7] !== u) {
      d = () => u !== null && b$t(u.value, s, a, i, r);
      t[3] = i;
      t[4] = s;
      t[5] = r;
      t[6] = a;
      t[7] = u;
      t[8] = d;
    } else {
      d = t[8];
    }
    let [p, m] = pee.useState(d);
    let f;
    let h;
    if (t[9] !== n || t[10] !== o || t[11] !== p || t[12] !== l || t[13] !== u) {
      f = () => {
        if (p && u !== null) {
          return;
        }
        B6o(n, l, o);
      };
      h = [p, u, n, l, o];
      t[9] = n;
      t[10] = o;
      t[11] = p;
      t[12] = l;
      t[13] = u;
      t[14] = f;
      t[15] = h;
    } else {
      f = t[14];
      h = t[15];
    }
    if (pee.useEffect(f, h), p && u !== null) {
      let g;
      if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
        g = () => m(false);
        t[16] = g;
      } else {
        g = t[16];
      }
      let y;
      if (t[17] !== s || t[18] !== o) {
        y = () => o(`Kept effort level as ${s !== undefined ? Kce(s) : "auto"}`);
        t[17] = s;
        t[18] = o;
        t[19] = y;
      } else {
        y = t[19];
      }
      let _;
      if (t[20] !== y || t[21] !== u.value) {
        _ = Xa.jsx(LCt, {
          kind: "effort",
          model: null,
          effort: u.value,
          onConfirm: g,
          onCancel: y
        });
        t[20] = y;
        t[21] = u.value;
        t[22] = _;
      } else {
        _ = t[22];
      }
      return _;
    }
    return null;
  }
  function vsf(e) {
    return e.cacheMissAckedAtOutputTokens;
  }
  function wsf(e) {
    return e.effortValue;
  }
  function Psf(e) {
    let t = Math.min(Math.max(e, 1), U6o.length);
    let n = U6o.slice(0, t);
    let r = ksf.slice(0, t - 1);
    let o = xsf.slice(0, t);
    if (t === U6o.length) {
      return {
        levels: n,
        width: 42,
        trianglePositions: o,
        spacers: r
      };
    }
    let s = $6o(n, r);
    let i = Math.max(s[t - 1] + n[t - 1].label.length, 14);
    return {
      levels: n,
      width: i,
      trianglePositions: o,
      spacers: r
    };
  }
  function $6o(e, t) {
    return e.map((n, r) => e.slice(0, r).reduce((o, s, i) => o + s.label.length + t[i], 0));
  }
  function getSliderGeometry(e) {
    let t = e ? Zat(e) : null;
    let n = Psf(t ? UC.indexOf(t) + 1 : UC.length);
    let r = e && e3i(e) ? "Higher effort levels are restricted by your organization." : undefined;
    if (B8(e)) {
      let a = n.width + 3;
      let l = 17;
      let c = [...n.levels, {
        value: "ultracode",
        label: "ultracode",
        color: "violet-ripple"
      }];
      let u = a + Math.floor(4);
      let d = [...n.spacers, u - n.width];
      return {
        levels: c,
        width: a + 17,
        trianglePositions: [...n.trianglePositions, a + Math.floor(8.5)],
        labelStarts: $6o(c, d),
        spacers: d,
        trackChars: "\u2500".repeat(n.width + 1) + "\u2506" + "\u2500".repeat(18),
        accentStart: n.width + 2,
        sublabel: {
          text: "xhigh + workflows",
          start: a
        },
        capNote: r
      };
    }
    return {
      levels: n.levels,
      width: n.width,
      trianglePositions: n.trianglePositions,
      labelStarts: $6o(n.levels, n.spacers),
      spacers: n.spacers,
      trackChars: "\u2500".repeat(n.width),
      capNote: r
    };
  }
  function Osf(e) {
    let t = FCt.c(13);
    let {
      level: n,
      selected: r
    } = e;
    let o = n.label;
    if (!r) {
      if (n.color === "violet-ripple") {
        let a;
        if (t[0] !== o) {
          a = Xa.jsx(Text, {
            color: q6o,
            children: o
          });
          t[0] = o;
          t[1] = a;
        } else {
          a = t[1];
        }
        return a;
      }
      let i;
      if (t[2] !== o) {
        i = Xa.jsx(Text, {
          dimColor: true,
          children: o
        });
        t[2] = o;
        t[3] = i;
      } else {
        i = t[3];
      }
      return i;
    }
    if (n.color === "violet-ripple") {
      let i;
      if (t[4] !== o) {
        i = Xa.jsx(Text, {
          bold: true,
          backgroundColor: q6o,
          color: "rgb(255,255,255)",
          children: o
        });
        t[4] = o;
        t[5] = i;
      } else {
        i = t[5];
      }
      return i;
    }
    if (n.color === "rainbow-animated") {
      let i;
      if (t[6] !== o) {
        i = Xa.jsx(Dsf, {
          text: o
        });
        t[6] = o;
        t[7] = i;
      } else {
        i = t[7];
      }
      return i;
    }
    if (n.color === "autoAccept-shimmer") {
      let i;
      if (t[8] !== o) {
        i = Xa.jsx(qsf, {
          text: o
        });
        t[8] = o;
        t[9] = i;
      } else {
        i = t[9];
      }
      return i;
    }
    let s;
    if (t[10] !== n.color || t[11] !== o) {
      s = Xa.jsx(Text, {
        bold: true,
        color: n.color,
        children: o
      });
      t[10] = n.color;
      t[11] = o;
      t[12] = s;
    } else {
      s = t[12];
    }
    return s;
  }
  function Dsf(e) {
    let t = FCt.c(5);
    let {
      text: n
    } = e;
    let r = Due();
    let [, o] = useAnimationFrame(r ? null : 100);
    let s = Math.floor(o / 100);
    let i;
    if (t[0] !== n) {
      i = [...n];
      t[0] = n;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== s || t[3] !== i) {
      a = Xa.jsx(Text, {
        bold: true,
        children: i.map((l, c) => Xa.jsx(Text, {
          color: k8(c + s),
          children: l
        }, c))
      });
      t[2] = s;
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    return a;
  }
  function rippleDistance(e, t, n) {
    let r = e - n;
    let o = (t - 2) * 2;
    return Math.sqrt(r * r + o * o);
  }
  function rippleLevel(e, t) {
    if (e > t.travel) {
      return null;
    }
    let n = ((e - t.travel) % 20 + 20) % 20;
    let r = (1 + Math.cos(2 * Math.PI * n / 20)) / 2;
    return Math.min(RIPPLE_RAMP.length - 1, Math.round(r * (RIPPLE_RAMP.length - 1)));
  }
  function UltraRippleText(e) {
    let t = FCt.c(10);
    let {
      text: n,
      col: r,
      row: o,
      ripple: s,
      dimColor: i,
      bold: a,
      coveredColor: l
    } = e;
    let c;
    if (t[0] !== r || t[1] !== s || t[2] !== o || t[3] !== n) {
      c = [];
      let d = 0;
      for (let p of n) {
        let m = rippleLevel(rippleDistance(r + d, o, s.originCol), s);
        let f = c.at(-1);
        if (f && f.level === m) {
          f.text = f.text + p;
        } else {
          c.push({
            text: p,
            level: m
          });
        }
        d++;
      }
      t[0] = r;
      t[1] = s;
      t[2] = o;
      t[3] = n;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== l || t[7] !== i || t[8] !== c) {
      u = Xa.jsx(Text, {
        children: c.map((d, p) => {
          if (d.level === null) {
            return Xa.jsx(Text, {
              dimColor: i,
              bold: a,
              children: d.text
            }, p);
          }
          return Xa.jsx(Text, {
            backgroundColor: RIPPLE_RAMP[d.level],
            color: l ?? "rgb(255,255,255)",
            bold: a,
            children: d.text
          }, p);
        })
      });
      t[5] = a;
      t[6] = l;
      t[7] = i;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  function qsf(e) {
    let t = FCt.c(5);
    let {
      text: n
    } = e;
    let r = Due();
    let [, o] = useAnimationFrame(r ? null : 100);
    let s = n.length + 4;
    let i = r ? WLn : Math.floor(o / 100) % s;
    let a;
    if (t[0] !== n) {
      a = [...n];
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l;
    if (t[2] !== i || t[3] !== a) {
      l = Xa.jsx(Text, {
        bold: true,
        children: a.map((c, u) => {
          let d = u === i;
          let p = u === i - 1 || u === i + 1;
          return Xa.jsx(Text, {
            color: d ? "#d0b4ff" : "autoAccept",
            bold: d || p,
            children: c
          }, u);
        })
      });
      t[2] = i;
      t[3] = a;
      t[4] = l;
    } else {
      l = t[4];
    }
    return l;
  }
  function Wsf({
    hasConversationMessages: e,
    onDone: t
  }) {
    let n = bt(oe => oe.effortValue);
    let r = bt(oe => oe.cacheMissAckedAtOutputTokens);
    let o = bt(oe => oe.ultracode);
    let s = dR();
    let i = Lo();
    let a = pee.useMemo(() => getSliderGeometry(s), [s]);
    let l = pee.useMemo(() => {
      if (Jne(s, n, o)) {
        let de = a.levels.findIndex(be => be.value === "ultracode");
        if (de !== -1) {
          return de;
        }
      }
      let oe = Ul() ? undefined : nWe();
      let ee = rWe(s) ? undefined : n;
      let re = oe === null ? undefined : oe ?? ee;
      if (re !== undefined) {
        let de = a.levels.findIndex(be => be.value === re);
        if (de !== -1) {
          return de;
        }
      }
      let se = r1(s, re);
      let ae = a.levels.findIndex(de => de.value === se);
      return ae === -1 ? 3 : ae;
    }, [n, s, a, o]);
    let [c, u] = pee.useState(l);
    let d = Math.min(c, a.levels.length - 1);
    let [p, m] = pee.useState(null);
    let {
      columns: f
    } = Sr();
    let h = nE();
    let g = a.levels[d].value === "ultracode";
    let y = Due();
    let [, _] = useAnimationFrame(g && !y && p === null ? 80 : null);
    let b = pee.useRef(null);
    if (!g || y) {
      b.current = null;
    } else if (b.current === null) {
      b.current = _;
    }
    let S = g ? _ - (b.current ?? _) : 0;
    let E = g && !y ? {
      travel: S * 0.03,
      originCol: a.trianglePositions[d]
    } : null;
    let C = pee.useMemo(() => `${tOe([hG("left"), hG("right")])} to adjust \xB7 ${tOe([hG("enter")])} to confirm \xB7 ${tOe([hG("escape")])} to cancel`, []);
    function x(oe) {
      if (oe.key === "left") {
        oe.preventDefault();
        u(ee => Math.max(0, ee - 1));
      } else if (oe.key === "right") {
        oe.preventDefault();
        u(ee => Math.min(a.levels.length - 1, ee + 1));
      } else if (oe.key === "return") {
        oe.preventDefault();
        let ee = a.levels[d];
        let re = ee.value === "ultracode" ? "xhigh" : ee.value;
        if (b$t(re, n, s, r, e)) {
          m(ee.value);
          return;
        }
        B6o(ee.value, i, t);
      } else if (oe.key === "escape") {
        oe.preventDefault();
        t("Cancelled");
      }
    }
    if (p !== null) {
      return Xa.jsx(LCt, {
        kind: "effort",
        model: null,
        effort: p === "ultracode" ? "xhigh" : p,
        onConfirm: () => B6o(p, i, t),
        onCancel: () => m(null)
      });
    }
    let A = a.trianglePositions[d];
    let k = a.trackChars.slice(0, A);
    let I = a.trackChars.slice(A + 1);
    let O = a.accentStart ?? a.trackChars.length;
    let M = k.slice(0, Math.min(k.length, O));
    let L = k.slice(Math.min(k.length, O));
    let P = A >= O;
    let F = Math.max(0, O - A - 1);
    let H = I.slice(0, F);
    let U = I.slice(F);
    let N = hm(" ", a.width - 6 - 7);
    let W = a.labelStarts.at(-1) + a.levels.at(-1).label.length;
    let j = hm(" ", a.width - W);
    let z = oe => " ".repeat(a.spacers[oe]);
    let V = h ? 1 + 2 : 2;
    let K = Math.max(a.width, f);
    let J = " ".repeat(V);
    let Q = Math.max(0, Math.floor((K - a.width) / 2));
    let Z = " ".repeat(Q);
    let ne = " ".repeat(Math.max(0, K - Q - a.width));
    return Xa.jsx(Td, {
      children: Xa.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: x,
        marginX: E ? -V : undefined,
        width: E ? K : undefined,
        children: [Xa.jsx(Dv, {
          children: E ? Xa.jsx(UltraRippleText, {
            text: `${J}Effort${" ".repeat(Math.max(0, K - V - 6))}`,
            col: -Q,
            row: Lsf,
            ripple: E
          }) : "Effort"
        }), E ? Xa.jsx(UltraRippleText, {
          text: " ".repeat(K),
          col: -Q,
          row: Fsf,
          ripple: E
        }) : Xa.jsx(gXd, {
          height: 1
        }), Xa.jsxs(gXd, {
          flexDirection: "column",
          alignItems: "center",
          width: "100%",
          children: [Xa.jsx(gXd, {
            children: E ? Xa.jsx(UltraRippleText, {
              text: `${Z}Faster${N}Smarter${ne}`,
              col: -Q,
              row: 0,
              ripple: E
            }) : Xa.jsxs(Xa.Fragment, {
              children: [Xa.jsx(Text, {
                children: "Faster"
              }), Xa.jsx(Text, {
                children: N
              }), Xa.jsx(Text, {
                children: "Smarter"
              })]
            })
          }), Xa.jsx(gXd, {
            children: E ? Xa.jsxs(Xa.Fragment, {
              children: [Xa.jsx(UltraRippleText, {
                text: `${Z}${k}`,
                col: -Q,
                row: 1,
                ripple: E,
                dimColor: true,
                coveredColor: "#d0b4ff"
              }), Xa.jsx(Text, {
                bold: true,
                backgroundColor: q6o,
                color: "rgb(255,255,255)",
                children: "\u25B2"
              }), Xa.jsx(UltraRippleText, {
                text: `${I}${ne}`,
                col: A + 1,
                row: 1,
                ripple: E,
                dimColor: true,
                coveredColor: "#d0b4ff"
              })]
            }) : Xa.jsxs(Xa.Fragment, {
              children: [Xa.jsx(Text, {
                dimColor: true,
                children: M
              }), L ? Xa.jsx(Text, {
                color: q6o,
                children: L
              }) : null, Xa.jsx(Text, {
                bold: true,
                color: P ? q6o : undefined,
                children: "\u25B2"
              }), Xa.jsx(Text, {
                dimColor: true,
                children: H
              }), U ? Xa.jsx(Text, {
                color: q6o,
                children: U
              }) : null]
            })
          }), Xa.jsxs(gXd, {
            children: [E && Xa.jsx(UltraRippleText, {
              text: Z,
              col: -Q,
              row: 2,
              ripple: E
            }), a.levels.map((oe, ee) => Xa.jsxs($ac.Fragment, {
              children: [ee > 0 && (E ? Xa.jsx(UltraRippleText, {
                text: z(ee - 1),
                col: a.labelStarts[ee] - a.spacers[ee - 1],
                row: 2,
                ripple: E
              }) : Xa.jsx(Text, {
                children: z(ee - 1)
              })), E && d !== ee ? Xa.jsx(UltraRippleText, {
                text: oe.label,
                col: a.labelStarts[ee],
                row: 2,
                ripple: E,
                dimColor: true
              }) : Xa.jsx(Osf, {
                level: oe,
                selected: d === ee
              })]
            }, oe.value)), E ? Xa.jsx(UltraRippleText, {
              text: `${j}${ne}`,
              col: W,
              row: 2,
              ripple: E
            }) : j ? Xa.jsx(Text, {
              children: j
            }) : null]
          }), a.sublabel ? Xa.jsx(gXd, {
            children: E ? Xa.jsx(UltraRippleText, {
              text: `${Z}${" ".repeat(a.sublabel.start)}${a.sublabel.text}${ne}`,
              col: -Q,
              row: 3,
              ripple: E,
              dimColor: true
            }) : Xa.jsxs(Xa.Fragment, {
              children: [Xa.jsx(Text, {
                children: " ".repeat(a.sublabel.start)
              }), Xa.jsx(Text, {
                dimColor: true,
                children: a.sublabel.text
              })]
            })
          }) : null, a.levels[d]?.value === "max" ? Xa.jsx(gXd, {
            children: Xa.jsx(Text, {
              dimColor: true,
              children: "May use excessive tokens resulting in long response times or overthinking. Use sparingly for the hardest tasks."
            })
          }) : null, a.capNote && !E ? Xa.jsx(gXd, {
            children: Xa.jsx(Text, {
              dimColor: true,
              children: a.capNote
            })
          }) : null]
        }), E ? Xa.jsx(UltraRippleText, {
          text: " ".repeat(K),
          col: -Q,
          row: 4,
          ripple: E
        }) : Xa.jsx(gXd, {
          height: 1
        }), Xa.jsx(Lw, {
          children: E ? Xa.jsx(UltraRippleText, {
            text: `${J}${C}${" ".repeat(Math.max(0, K - V - an(C)))}`,
            col: -Q,
            row: 5,
            ripple: E,
            dimColor: true
          }) : Xa.jsxs(Hn, {
            children: [Xa.jsx(xt, {
              chord: ["left", "right"],
              action: "adjust"
            }), Xa.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), Xa.jsx(xt, {
              chord: "escape",
              action: "cancel"
            })]
          })
        })]
      })
    });
  }
  async function call_export87(e, t, n) {
    if (n = n?.trim() || "", Q4.includes(n)) {
      e(getEffortHelpText());
      return;
    }
    if (n === "current" || n === "status") {
      return Xa.jsx(bsf, {
        onDone: e
      });
    }
    let r = t.messages.length > 0;
    if (!n) {
      return Xa.jsx(Wsf, {
        onDone: e,
        hasConversationMessages: r
      });
    }
    return Xa.jsx(Esf, {
      args: n,
      onDone: e,
      hasConversationMessages: r
    });
  }
  var FCt;
  var $ac;
  var pee;
  var Xa;
  var fsf;
  var xsf;
  var ksf;
  var U6o;
  var Lsf = -2;
  var Fsf = -1;
  var Bac;
  var jsf;
  var RIPPLE_RAMP;
  var q6o;
  var Vac = {};
  __export(Vac, {
    call: () => call_export88
  });
  async function call_export88(e, t) {
    let n = e.trim();
    let r = t.getAppState();
    let o = parseUserSpecifiedModel(r.mainLoopModelForSession ?? r.mainLoopModel ?? getDefaultMainLoopModelSetting());
    if (Q4.includes(n)) {
      return {
        type: "text",
        value: getEffortHelpText()
      };
    }
    if (n === "current" || n === "status") {
      let {
        message: i
      } = showCurrentEffort(getEffortValue(t), o, r.ultracode);
      return {
        type: "text",
        value: i
      };
    }
    if (!n) {
      return {
        type: "text",
        value: `Usage: /effort <${Lbe(o).join("|")}${B8(o) ? "|ultracode" : ""}|auto>`
      };
    }
    let s = executeEffort(n);
    if (s.effortUpdate) {
      let i = s.effortUpdate.value;
      let a = s.effortUpdate.ultracode ?? false;
      t.setAppState(l => l.effortValue === i && (l.ultracode ?? false) === a ? l : {
        ...l,
        effortValue: i,
        ultracode: a
      });
    }
    return {
      type: "text",
      value: s.message
    };
  }
  var zac = __lazy(() => {
    np();
    Sl();
    Fp();
    Eo();
  });
  function Kac(e, t) {
    let n = getMainLoopModel();
    let r = B8(n) ? "|ultracode" : "";
    return `${e}${Lbe(n).join("|")}${r}|auto${t}`;
  }
  var zsf;
  var Yac;
  var V6o = () => {};
  var Zac = {};
  __export(Zac, {
    initialQuietIndexFor: () => initialQuietIndexFor,
    initialIndexFor: () => initialIndexFor,
    call: () => call_export89
  });
  function initialIndexFor(e, t) {
    if (!e) {
      return 0;
    }
    let n = t ?? 120;
    let r = 1;
    let o = 1 / 0;
    for (let s = 1; s < Xac.length; s++) {
      let i = Math.abs(Xac[s].intervalMinutes - n);
      if (i < o) {
        o = i;
        r = s;
      }
    }
    return r;
  }
  function initialQuietIndexFor(e) {
    if (!e.enabled || !e.start || !e.end) {
      return 0;
    }
    for (let t = 1; t < Qac.length; t++) {
      let n = Qac[t].range;
      if (n.start === e.start && n.end === e.end) {
        return t;
      }
    }
    return 0;
  }
  var Ksf;
  var Ysf;
  var elc;
  var Xac;
  var Qac;
  var call_export89 = async e => (e("Wellbeing settings are not available in this build"), null);
  var tlc = __lazy(() => {
    Ii();
    bs();
    yH();
    et();
    Bs();
    cKt();
    V6o();
    zg();
    Ksf = __toESM(pt(), 1);
    Ysf = __toESM(ot(), 1);
    elc = __toESM(ie(), 1);
    Xac = [{
      label: "Off",
      intervalMinutes: null
    }, {
      label: "Every 1 hour",
      intervalMinutes: 60
    }, {
      label: "Every 2 hours",
      intervalMinutes: 120,
      hint: "(default)"
    }, {
      label: "Every 3 hours",
      intervalMinutes: 180
    }, {
      label: "Every 4 hours",
      intervalMinutes: 240
    }];
    Qac = [{
      label: "Off",
      range: null
    }, {
      label: "22:00 \u2013 07:00",
      range: {
        start: "22:00",
        end: "07:00"
      }
    }, {
      label: "23:00 \u2013 06:00",
      range: {
        start: "23:00",
        end: "06:00"
      }
    }, {
      label: "00:00 \u2013 07:00",
      range: {
        start: "00:00",
        end: "07:00"
      }
    }];
  });
  var Zsf;
  function rlc(e) {
    let t = Ul();
    if (!t) {
      return null;
    }
    if (!c_()) {
      return " (applied locally \u2014 this remote transport can\u2019t update the remote session)";
    }
    t.sendControlRequest({
      subtype: "apply_flag_settings",
      settings: {
        viewMode: e ? "focus" : null
      }
    }).catch(Oe);
    return null;
  }
  var eif;
  var slc;
  var ilc = __lazy(() => {
    slc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var alc;
  var llc = __lazy(() => {
    alc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var clc;
  var ulc = __lazy(() => {
    clc = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  var plc = {};
  __export(plc, {
    default: () => rif
  });
  function nif() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_brief_config", dlc);
    let t = tif().safeParse(e);
    return t.success ? t.data : dlc;
  }
  var tif;
  var dlc;
  var rif;
  async function Y6o() {
    let e = await getFeatureValue_DEPRECATED("tengu_bridge_repl_v2_config", flc);
    let t = sif().safeParse(e);
    return t.success ? t.data : flc;
  }
  async function cdr() {
    let e = await Y6o();
    if (e.min_version && Vne({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, e.min_version)) {
      return `Your version of Claude Code (${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}) is too old for Remote Control.
Version ${e.min_version} or higher is required. Run \`claude update\` to update.`;
    }
    return null;
  }
  var flc;
  var sif;
  var udr = __lazy(() => {
    $n();
    flc = {
      init_retry_max_attempts: 3,
      init_retry_base_delay_ms: 500,
      init_retry_jitter_fraction: 0.25,
      init_retry_max_delay_ms: 4000,
      http_timeout_ms: 1e4,
      uuid_dedup_buffer_size: 2000,
      heartbeat_interval_ms: 20000,
      heartbeat_jitter_fraction: 0.1,
      token_refresh_buffer_ms: 300000,
      teardown_archive_timeout_ms: 1500,
      connect_timeout_ms: 15000,
      oauth_retry_max_attempts: 3,
      oauth_retry_base_delay_ms: 2000,
      min_version: "0.0.0",
      should_show_app_upgrade_message: false
    };
    sif = we(() => v.object({
      init_retry_max_attempts: v.number().int().min(1).max(10).default(3),
      init_retry_base_delay_ms: v.number().int().min(100).default(500),
      init_retry_jitter_fraction: v.number().min(0).max(1).default(0.25),
      init_retry_max_delay_ms: v.number().int().min(500).default(4000),
      http_timeout_ms: v.number().int().min(2000).default(1e4),
      uuid_dedup_buffer_size: v.number().int().min(100).max(50000).default(2000),
      heartbeat_interval_ms: v.number().int().min(5000).max(30000).default(20000),
      heartbeat_jitter_fraction: v.number().min(0).max(0.5).default(0.1),
      token_refresh_buffer_ms: v.number().int().min(30000).max(1800000).default(300000),
      teardown_archive_timeout_ms: v.number().int().min(500).max(2000).default(1500),
      connect_timeout_ms: v.number().int().min(5000).max(60000).default(15000),
      oauth_retry_max_attempts: v.number().int().min(0).max(6).default(3),
      oauth_retry_base_delay_ms: v.number().int().min(100).max(1e4).default(2000),
      min_version: v.string().refine(e => {
        try {
          Vne(e, "0.0.0");
          return true;
        } catch {
          return false;
        }
      }).default("0.0.0"),
      should_show_app_upgrade_message: v.boolean().default(false)
    }));
  });
  function hlc({
    onDone: e
  }) {
    let t = _Je.useRef(e);
    t.current = e;
    let n = _Je.useCallback(() => {
      t.current("dismiss");
    }, []);
    _Je.useEffect(() => {
      saveGlobalConfig(s => {
        if (s.remoteDialogSeen) {
          return s;
        }
        return {
          ...s,
          remoteDialogSeen: true
        };
      });
    }, []);
    let r = _Je.useCallback(s => {
      t.current(s);
    }, []);
    return ihe.jsx(qm, {
      title: "Remote Control",
      children: ihe.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        paddingY: 1,
        children: [ihe.jsxs(gXd, {
          marginBottom: 1,
          flexDirection: "column",
          children: [ihe.jsx(Text, {
            children: "Take this session with you and pick up right where you left off on any device. Open the Code tab in the Claude mobile app, or visit claude.ai/code in a browser."
          }), ihe.jsx(Text, {
            children: " "
          }), ihe.jsx(Text, {
            children: "The session keeps running on this machine. Use your other devices as a remote control. Disconnect anytime with /remote-control."
          })]
        }), ihe.jsx(gXd, {
          children: ihe.jsx(xr, {
            options: [{
              label: "Enable Remote Control",
              description: "Opens a secure connection to claude.ai.",
              value: "enable"
            }, {
              label: "Never mind",
              description: "You can always enable it later with /remote-control.",
              value: "dismiss"
            }],
            onChange: r,
            onCancel: n
          })
        })]
      })
    });
  }
  function glc() {
    if (getGlobalConfig().remoteDialogSeen) {
      return false;
    }
    if (!isBridgeEnabled()) {
      return false;
    }
    if (!hasStoredOAuthToken()) {
      return false;
    }
    return true;
  }
  var _Je;
  var ihe;
  var J6o = __lazy(() => {
    Ox();
    et();
    no();
    $c();
    XI();
    _Je = __toESM(ot(), 1);
    ihe = __toESM(ie(), 1);
  });
  function X6o() {
    if (!isBridgeEnabled()) {
      return false;
    }
    let e = getGlobalConfig();
    return !e.hasUsedRemoteControl && !getRemoteControlAtStartup() && (e.remoteControlUpsellSeenCount ?? 0) < 3;
  }
  function _lc() {
    let e = (getGlobalConfig().remoteControlUpsellSeenCount ?? 0) + 1;
    saveGlobalConfig(t => (t.remoteControlUpsellSeenCount ?? 0) >= e ? t : {
      ...t,
      remoteControlUpsellSeenCount: e
    });
    Pe("tips_rc_upsell_show");
  }
  function blc() {
    return getGlobalConfig().hasUsedRemoteControl === true || getRemoteControlAtStartup();
  }
  function Q6o() {
    if (!isBridgeEnabled() || !_de()) {
      return false;
    }
    return blc() && uc("agentPushNotifEnabled", false).value !== true && (getGlobalConfig().pushNotifUpsellSeenCount ?? 0) < 3;
  }
  function ddr() {
    return isBridgeEnabled() && _de() && blc() && uc("agentPushNotifEnabled", false).value !== true;
  }
  function Slc() {
    let e = (getGlobalConfig().pushNotifUpsellSeenCount ?? 0) + 1;
    saveGlobalConfig(t => (t.pushNotifUpsellSeenCount ?? 0) >= e ? t : {
      ...t,
      pushNotifUpsellSeenCount: e
    });
    Pe("tips_push_upsell_show");
  }
  function pdr() {
    if (getGlobalConfig().hasUsedRemoteControl) {
      return;
    }
    saveGlobalConfig(e => e.hasUsedRemoteControl ? e : {
      ...e,
      hasUsedRemoteControl: true
    });
  }
  var UCt = __lazy(() => {
    Ox();
    soe();
    zg();
    ln();
  });
  var vlc = {};
  __export(vlc, {
    call: () => call_export90
  });
  function lif(e) {
    let t = Z6o.c(18);
    let {
      onDone: n,
      name: r,
      context: o
    } = e;
    let s = Lo();
    let i = bt(pif);
    let a = bt(dif);
    let l = bt(uif);
    let [c, u] = ahe.useState(false);
    let [d, p] = ahe.useState(false);
    let [m] = ahe.useState(cif);
    let f;
    if (t[0] !== r || t[1] !== n || t[2] !== s) {
      f = function () {
        if (pdr(), glc()) {
          s(b => {
            if (b.showRemoteCallout) {
              return b;
            }
            return {
              ...b,
              showRemoteCallout: true,
              replBridgeInitialName: r
            };
          });
          n("", {
            display: "system"
          });
          return;
        }
        logEvent("tengu_bridge_command", {
          action: "connect"
        });
        s(b => {
          if (b.replBridgeEnabled && !b.replBridgeOutboundOnly) {
            return b;
          }
          return {
            ...b,
            replBridgeEnabled: true,
            replBridgeExplicit: true,
            replBridgeOutboundOnly: false,
            replBridgeInitialName: r
          };
        });
        n("", {
          display: "system"
        });
      };
      t[0] = r;
      t[1] = n;
      t[2] = s;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h = f;
    let g;
    if (t[4] !== h || t[5] !== n || t[6] !== i || t[7] !== a || t[8] !== l) {
      g = () => {
        if ((i || a) && !l) {
          u(true);
          return;
        }
        let _ = false;
        (async () => {
          let b = await Tlc();
          if (_) {
            return;
          }
          if (b?.kind === "error") {
            logEvent("tengu_bridge_command", {
              action: "preflight_failed"
            });
            n(b.message, {
              display: "system"
            });
            return;
          }
          if (b?.kind === "unenrolled-trusted-device") {
            logEvent("tengu_bridge_command", {
              action: "preflight_login_for_enrollment"
            });
            p(true);
            return;
          }
          h();
        })();
        return () => {
          _ = true;
        };
      };
      t[4] = h;
      t[5] = n;
      t[6] = i;
      t[7] = a;
      t[8] = l;
      t[9] = g;
    } else {
      g = t[9];
    }
    let y;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      y = [];
      t[10] = y;
    } else {
      y = t[10];
    }
    if (ahe.useEffect(g, y), c) {
      let _;
      if (t[11] !== n) {
        _ = G0.jsx(mif, {
          onDone: n
        });
        t[11] = n;
        t[12] = _;
      } else {
        _ = t[12];
      }
      return _;
    }
    if (d) {
      if (!o) {
        n("Your organization requires Trusted Devices for Remote Control, but this device is not enrolled. Please run `/login` in Claude Code to enroll this device.", {
          display: "system"
        });
        return null;
      }
      let _;
      if (t[13] !== o || t[14] !== h || t[15] !== n || t[16] !== m) {
        _ = G0.jsx(Login, {
          startingMessage: "Sign in to enroll this device for Remote Control.",
          onDone: async b => {
            if (await runPostLoginHooks(o, b, {
              awaitEnrollment: true,
              previousAccount: m
            }), !b) {
              logEvent("tengu_bridge_command", {
                action: "preflight_login_canceled"
              });
              n("Sign-in canceled. Run /remote-control after enrolling this device.", {
                display: "system"
              });
              return;
            }
            let S = await Tlc();
            if (S?.kind === "error") {
              n(S.message, {
                display: "system"
              });
              return;
            }
            if (S?.kind === "unenrolled-trusted-device") {
              logEvent("tengu_bridge_command", {
                action: "preflight_enrollment_did_not_complete"
              });
              n("Signed in, but device enrollment didn't complete. Run /remote-control again, or check the debug log for [trusted-device] messages.", {
                display: "system"
              });
              return;
            }
            h();
          }
        });
        t[13] = o;
        t[14] = h;
        t[15] = n;
        t[16] = m;
        t[17] = _;
      } else {
        _ = t[17];
      }
      return _;
    }
    return null;
  }
  function cif() {
    let e = getOauthAccountInfo();
    return e && {
      accountUuid: e.accountUuid,
      organizationUuid: e.organizationUuid
    };
  }
  function uif(e) {
    return e.replBridgeOutboundOnly;
  }
  function dif(e) {
    return e.replBridgeEnabled;
  }
  function pif(e) {
    return e.replBridgeConnected;
  }
  function mif(e) {
    let t = Z6o.c(64);
    let {
      onDone: n
    } = e;
    Jg("bridge-disconnect-dialog");
    let r = Lo();
    let o = bt(Eif);
    let s = bt(Tif);
    let i = bt(Sif);
    let [a, l] = ahe.useState(2);
    let [c, u] = ahe.useState(false);
    let [d, p] = ahe.useState("");
    let m = i ? o : s;
    let f;
    let h;
    if (t[0] !== m || t[1] !== c) {
      f = () => {
        if (!c || !m) {
          p("");
          return;
        }
        Elc.toString(m, {
          type: "utf8",
          errorCorrectionLevel: "L",
          small: true
        }).then(p).catch(() => p(""));
      };
      h = [c, m];
      t[0] = m;
      t[1] = c;
      t[2] = f;
      t[3] = h;
    } else {
      f = t[2];
      h = t[3];
    }
    ahe.useEffect(f, h);
    let g;
    if (t[4] !== n || t[5] !== r) {
      g = function () {
        r(bif);
        logEvent("tengu_bridge_command", {
          action: "disconnect"
        });
        n("Remote Control disconnected.", {
          display: "system"
        });
      };
      t[4] = n;
      t[5] = r;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y = g;
    let _;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      _ = function () {
        u(_if);
      };
      t[7] = _;
    } else {
      _ = t[7];
    }
    let b = _;
    let S;
    if (t[8] !== n) {
      S = function () {
        n(undefined, {
          display: "skip"
        });
      };
      t[8] = n;
      t[9] = S;
    } else {
      S = t[9];
    }
    let E = S;
    let C;
    let x;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      C = () => l(yif);
      x = () => l(gif);
      t[10] = C;
      t[11] = x;
    } else {
      C = t[10];
      x = t[11];
    }
    let A;
    if (t[12] !== a || t[13] !== E || t[14] !== y) {
      A = {
        "select:next": C,
        "select:previous": x,
        "select:accept": () => {
          if (a === 0) {
            y();
          } else if (a === 1) {
            b();
          } else {
            E();
          }
        }
      };
      t[12] = a;
      t[13] = E;
      t[14] = y;
      t[15] = A;
    } else {
      A = t[15];
    }
    let k;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      k = {
        context: "Select"
      };
      t[16] = k;
    } else {
      k = t[16];
    }
    jo(A, k);
    let I;
    let O;
    let M;
    let L;
    let P;
    let F;
    let H;
    let U;
    let N;
    if (t[17] !== m || t[18] !== E || t[19] !== d || t[20] !== c) {
      let be = d ? d.split(`
`).filter(hif) : [];
      O = or;
      H = "Remote Control";
      U = E;
      N = true;
      I = gXd;
      M = "column";
      L = 1;
      let fe = m ? ` and at ${m}` : " and claude.ai/code";
      if (t[30] !== fe) {
        P = G0.jsxs(Text, {
          children: ["This session is available in the Claude mobile app", fe, "."]
        });
        t[30] = fe;
        t[31] = P;
      } else {
        P = t[31];
      }
      F = c && be.length > 0 && G0.jsx(gXd, {
        flexDirection: "column",
        children: be.map(fif)
      });
      t[17] = m;
      t[18] = E;
      t[19] = d;
      t[20] = c;
      t[21] = I;
      t[22] = O;
      t[23] = M;
      t[24] = L;
      t[25] = P;
      t[26] = F;
      t[27] = H;
      t[28] = U;
      t[29] = N;
    } else {
      I = t[21];
      O = t[22];
      M = t[23];
      L = t[24];
      P = t[25];
      F = t[26];
      H = t[27];
      U = t[28];
      N = t[29];
    }
    let W = a === 0;
    let j;
    if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
      j = G0.jsx(Text, {
        children: "Disconnect this session"
      });
      t[32] = j;
    } else {
      j = t[32];
    }
    let z;
    if (t[33] !== W) {
      z = G0.jsx(_v, {
        isFocused: W,
        children: j
      });
      t[33] = W;
      t[34] = z;
    } else {
      z = t[34];
    }
    let V = a === 1;
    let K = c ? "Hide QR code" : "Show QR code";
    let J;
    if (t[35] !== c) {
      J = !c && G0.jsx(Text, {
        dimColor: true,
        children: "  Scan with your phone to open this session"
      });
      t[35] = c;
      t[36] = J;
    } else {
      J = t[36];
    }
    let Q;
    if (t[37] !== K || t[38] !== J) {
      Q = G0.jsxs(Text, {
        children: [K, J]
      });
      t[37] = K;
      t[38] = J;
      t[39] = Q;
    } else {
      Q = t[39];
    }
    let Z;
    if (t[40] !== V || t[41] !== Q) {
      Z = G0.jsx(_v, {
        isFocused: V,
        children: Q
      });
      t[40] = V;
      t[41] = Q;
      t[42] = Z;
    } else {
      Z = t[42];
    }
    let ne = a === 2;
    let oe;
    if (t[43] === Symbol.for("react.memo_cache_sentinel")) {
      oe = G0.jsx(Text, {
        children: "Continue"
      });
      t[43] = oe;
    } else {
      oe = t[43];
    }
    let ee;
    if (t[44] !== ne) {
      ee = G0.jsx(_v, {
        isFocused: ne,
        children: oe
      });
      t[44] = ne;
      t[45] = ee;
    } else {
      ee = t[45];
    }
    let re;
    if (t[46] !== z || t[47] !== Z || t[48] !== ee) {
      re = G0.jsxs(gXd, {
        flexDirection: "column",
        children: [z, Z, ee]
      });
      t[46] = z;
      t[47] = Z;
      t[48] = ee;
      t[49] = re;
    } else {
      re = t[49];
    }
    let se;
    if (t[50] === Symbol.for("react.memo_cache_sentinel")) {
      se = G0.jsx(Text, {
        dimColor: true,
        children: G0.jsxs(Hn, {
          children: [G0.jsx(xt, {
            chord: "enter",
            action: "select"
          }), G0.jsx(xt, {
            chord: "escape",
            action: "continue"
          })]
        })
      });
      t[50] = se;
    } else {
      se = t[50];
    }
    let ae;
    if (t[51] !== I || t[52] !== M || t[53] !== L || t[54] !== P || t[55] !== F || t[56] !== re) {
      ae = G0.jsxs(I, {
        flexDirection: M,
        gap: L,
        children: [P, F, re, se]
      });
      t[51] = I;
      t[52] = M;
      t[53] = L;
      t[54] = P;
      t[55] = F;
      t[56] = re;
      t[57] = ae;
    } else {
      ae = t[57];
    }
    let de;
    if (t[58] !== O || t[59] !== H || t[60] !== U || t[61] !== N || t[62] !== ae) {
      de = G0.jsx(O, {
        title: H,
        onCancel: U,
        hideInputGuide: N,
        children: ae
      });
      t[58] = O;
      t[59] = H;
      t[60] = U;
      t[61] = N;
      t[62] = ae;
      t[63] = de;
    } else {
      de = t[63];
    }
    return de;
  }
  function fif(e, t) {
    return G0.jsx(Text, {
      children: e
    }, t);
  }
  function hif(e) {
    return e.length > 0;
  }
  function gif(e) {
    return (e - 1 + 3) % 3;
  }
  function yif(e) {
    return (e + 1) % 3;
  }
  function _if(e) {
    return !e;
  }
  function bif(e) {
    if (!e.replBridgeEnabled && e.replBridgeError === undefined) {
      return e;
    }
    return {
      ...e,
      replBridgeEnabled: false,
      replBridgeExplicit: false,
      replBridgeOutboundOnly: false,
      replBridgeError: undefined,
      notifications: ojt(e.notifications, "bridge-failed")
    };
  }
  function Sif(e) {
    return e.replBridgeSessionActive;
  }
  function Tif(e) {
    return e.replBridgeConnectUrl;
  }
  function Eif(e) {
    return e.replBridgeSessionUrl;
  }
  async function Tlc() {
    let e = await getBridgeDisabledReason();
    if (e) {
      return {
        kind: "error",
        message: e
      };
    }
    let t = await cdr();
    if (t) {
      return {
        kind: "error",
        message: t
      };
    }
    if (!getBridgeAccessToken()) {
      return {
        kind: "error",
        message: "Remote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account."
      };
    }
    if (await enrollTrustedDeviceIfNeeded(), await isTrustedDeviceUnenrolled()) {
      if (isProactiveEnrollmentDisabled()) {
        return {
          kind: "error",
          message: "Your organization requires Trusted Devices for Remote Control, but enrollment is temporarily disabled. Please try again later, or contact your administrator."
        };
      }
      return {
        kind: "unenrolled-trusted-device"
      };
    }
    logForDebugging("[bridge] Prerequisites passed, enabling bridge");
    return null;
  }
  async function call_export90(e, t, n) {
    let r = n.trim() || undefined;
    return G0.jsx(lif, {
      onDone: e,
      name: r,
      context: t
    });
  }
  var Z6o;
  var Elc;
  var ahe;
  var G0;
  var wlc = __lazy(() => {
    wZ();
    Ox();
    yse();
    udr();
    CQ();
    Ai();
    Ii();
    bs();
    Mue();
    J6o();
    Nd();
    px();
    et();
    Bs();
    Ot();
    UCt();
    ho();
    no();
    je();
    LSt();
    Z6o = __toESM(pt(), 1);
    Elc = __toESM(Iwt(), 1);
    ahe = __toESM(ot(), 1);
    G0 = __toESM(ie(), 1);
  });
  var Clc = {};
  __export(Clc, {
    default: () => wif
  });
  var wif;
  function mtn() {
    return xlc.join(er(), "daemon.status.json");
  }
  async function klc(e) {
    let t = {
      supervisorPid: process.pid,
      supervisorProcStart: ownProcStart(),
      writtenAt: Date.now(),
      workers: e
    };
    try {
      await Ys().atomicWrite(mtn(), De(t, null, 2));
    } catch {}
  }
  async function Alc() {
    try {
      await Ys().delete(mtn());
    } catch {}
  }
  async function Ilc() {
    let e;
    try {
      e = await Ys().read(mtn());
    } catch {
      return null;
    }
    let t = Ba(e, false);
    if (!t || typeof t !== "object") {
      return null;
    }
    let n = t;
    if (typeof n.supervisorPid !== "number" || typeof n.workers !== "object" || n.workers === null) {
      return null;
    }
    try {
      process.kill(n.supervisorPid, 0);
    } catch {
      return null;
    }
    let r = typeof n.supervisorProcStart === "string" ? n.supervisorProcStart : undefined;
    if (!(await isSameProcessAsync(n.supervisorPid, r))) {
      return null;
    }
    return t;
  }
  var xlc;
  var fdr = __lazy(() => {
    _b();
    gn();
    Tb();
    Gd();
    xlc = require("path");
  });
  async function e8o(e) {
    let t = e ?? S5();
    let n;
    try {
      let o = await hdr.stat(t);
      if (!o.isFile() || o.size > 1048576) {
        throw Error(`${t} is not a regular file (or exceeds 1MiB); refusing read-modify-write`);
      }
      n = await hdr.readFile(t, "utf8");
    } catch (o) {
      if (!fn(o)) {
        throw o;
      }
    }
    if (n === undefined || n.trim() === "") {
      return {};
    }
    let r;
    try {
      r = JSON.parse(iW(n));
    } catch {
      throw Error(`daemon.json is malformed: ${t}`);
    }
    if (r && typeof r === "object" && !Array.isArray(r)) {
      return r;
    }
    return {};
  }
  async function BCt(e, t) {
    let n = t ?? S5();
    let r = await e8o(n);
    if ((await e(r)) === false) {
      return;
    }
    await Ys().mkdir(Plc.dirname(n));
    await Fm(n, De(r, null, 2) + `
`);
  }
  function t8o(e) {
    if (Array.isArray(e)) {
      return e.filter(t => !!t && typeof t.dir === "string");
    }
    if (e && typeof e.dir === "string") {
      return [e];
    }
    return [];
  }
  var hdr;
  var Plc;
  var n8o = __lazy(() => {
    _b();
    BT();
    dt();
    hUe();
    hdr = require("fs/promises");
    Plc = require("path");
  });
  var ydr = {};
  __export(ydr, {
    initializeErrorLogSink: () => initializeErrorLogSink,
    getMCPLogsPath: () => getMCPLogsPath,
    getErrorsPath: () => getErrorsPath,
    flushErrorLogWriters: () => flushErrorLogWriters,
    _clearLogWritersForTesting: () => _clearLogWritersForTesting
  });
  function getErrorsPath() {
    return htn.join(IHe.errors(), Olc + ".jsonl");
  }
  function getMCPLogsPath(e) {
    return htn.join(IHe.mcpLogs(e), Olc + ".jsonl");
  }
  function Rif(e) {
    let t = wZe(e);
    return {
      write(n) {
        t.write(De(n) + `
`);
      },
      flush: t.flush,
      dispose: t.dispose
    };
  }
  function xif() {}
  async function flushErrorLogWriters() {
    for (let e of ftn.values()) {
      e.flush();
    }
    await Promise.all(Array.from($Ct.values()));
  }
  async function _clearLogWritersForTesting() {
    for (let e of ftn.values()) {
      e.dispose();
    }
    await Promise.all(Array.from($Ct.values()));
    ftn.clear();
    $Ct.clear();
  }
  async function Aif(e, t, n) {
    let r = zt();
    try {
      await r.appendFile(t, n);
    } catch {
      await r.mkdir(e).catch(xif);
      await r.appendFile(t, n);
    }
  }
  function o8o(e) {
    let t = ftn.get(e);
    if (!t) {
      let n = htn.dirname(e);
      let r = false;
      t = Rif({
        writeFn: o => {
          let s = $Ct.get(e) ?? Promise.resolve();
          $Ct.set(e, s.then(Aif.bind(null, n, e, o)).catch(i => {
            if (!r) {
              r = true;
              logForDebugging(`Dropping log batch for ${e}: ${i instanceof Error ? i.message : String(i)}`);
            }
          }));
        },
        flushIntervalMs: 1000,
        maxBufferSize: 50
      });
      ftn.set(e, t);
      Ti(async () => {
        t?.dispose();
        await $Ct.get(e);
      });
      ius(flushErrorLogWriters);
    }
    return t;
  }
  function Iif(e, t) {
    return;
  }
  function Pif(e) {
    if (typeof e === "string") {
      return e;
    }
    if (e && typeof e === "object") {
      let t = e;
      if (typeof t.message === "string") {
        return t.message;
      }
      if (typeof t.error === "object" && t.error && "message" in t.error && typeof t.error.message === "string") {
        return t.error.message;
      }
    }
    return;
  }
  function Oif(e) {
    mta(e);
    kGt(e);
    let t = e.stack || e.message;
    let n = "";
    if (NP.isAxiosError(e) && e.config?.url) {
      let r = [`url=${e.config.url}`];
      if (e.response?.status !== undefined) {
        r.push(`status=${e.response.status}`);
      }
      let o = Pif(e.response?.data);
      if (o) {
        r.push(`body=${o}`);
      }
      n = `[${r.join(",")}] `;
    }
    logForDebugging(`${e.name}: ${n}${t}`, {
      level: "error"
    });
    Iif(getErrorsPath(), {
      error: `${n}${t}`
    });
  }
  function Dif(e, t) {
    logForDebugging(`MCP server "${e}" ${t}`, {
      level: "error"
    });
    let n = getMCPLogsPath(e);
    let o = {
      error: t instanceof Error ? t.stack || t.message : String(t),
      timestamp: new Date().toISOString(),
      sessionId: getSessionId(),
      cwd: zt().cwd()
    };
    o8o(n).write(o);
  }
  function Mif(e, t) {
    logForDebugging(`MCP server "${e}": ${t}`);
    let n = getMCPLogsPath(e);
    let r = {
      debug: t,
      timestamp: new Date().toISOString(),
      sessionId: getSessionId(),
      cwd: zt().cwd()
    };
    o8o(n).write(r);
  }
  function initializeErrorLogSink() {
    ATs({
      logError: Oif,
      logMCPError: Dif,
      logMCPDebug: Mif,
      getErrorsPath: getErrorsPath,
      getMCPLogsPath: getMCPLogsPath
    });
    logForDebugging("Error log sink initialized");
  }
  var htn;
  var Olc;
  var ftn;
  var $Ct;
  var gtn = __lazy(() => {
    Dp();
    at();
    _go();
    Ufn();
    hd();
    je();
    Rn();
    yS();
    htn = require("path");
    Olc = kTs(new Date());
    ftn = new Map();
    $Ct = new Map();
  });
  function Nlc() {
    if (HCt) {
      return HCt;
    }
    if (!st(process.env.DEBUG_CLAUDE_AGENT_SDK)) {
      bJe = null;
      HCt = Promise.resolve();
      return HCt;
    }
    let e = i8o.join(er(), "debug");
    bJe = i8o.join(e, `sdk-${Mlc.randomUUID()}.txt`);
    process.stderr.write(`SDK debug logs: ${bJe}
`);
    HCt = Ys().mkdir(e).catch(() => {});
    return HCt;
  }
  function Llc() {
    Nlc();
    return bJe ?? null;
  }
  function $5(e) {
    if (bJe === null) {
      return;
    }
    let n = `${new Date().toISOString()} ${e}
`;
    Nlc().then(() => {
      if (bJe) {
        Ys().append(bJe, n).catch(() => {});
      }
    });
  }
  var Mlc;
  var i8o;
  var bJe;
  var HCt = null;
  var a8o = __lazy(() => {
    _b();
    gn();
    Mlc = require("crypto");
    i8o = require("path");
  });
  function Nif(e) {
    let t = e.trim();
    return t.startsWith("{") && t.endsWith("}");
  }
  function Flc(e, t) {
    let n = {
      ...e
    };
    if (t) {
      let r = t.enabled === true && t.failIfUnavailable === undefined ? {
        ...t,
        failIfUnavailable: true
      } : t;
      let o = n.settings;
      if (o && !Nif(o)) {
        throw Error("Cannot use both a settings file path and the sandbox option. Include the sandbox configuration in your settings file instead.");
      }
      let s = {
        sandbox: r
      };
      if (o) {
        try {
          s = {
            ...qt(o),
            sandbox: r
          };
        } catch {}
      }
      n.settings = De(s);
    }
    return n;
  }
  var Ulc = __lazy(() => {});
  function Fif() {
    for (let e of _dr) {
      if (!e.killed) {
        e.kill("SIGTERM");
      }
    }
  }
  function Uif(e) {
    if (_dr.add(e), !Blc) {
      Blc = true;
      process.on("exit", Fif);
    }
  }
  function Bif(e) {
    return ![".js", ".mjs", ".tsx", ".ts", ".jsx"].some(n => e.endsWith(n));
  }
  function $if(e, t) {
    if (Hlc.existsSync(e)) {
      return t ? `Claude Code native binary at ${e} exists but failed to launch. This usually means the binary does not match this system's libc \u2014 e.g. spawning a musl-linked binary on a glibc Linux host fails because the musl dynamic loader (/lib/ld-musl-*) is missing. Specify a matching binary with options.pathToClaudeCodeExecutable.` : `Claude Code executable at ${e} exists but failed to launch.`;
    }
    return t ? `Claude Code native binary not found at ${e}. Please ensure Claude Code is installed via native installer or specify a valid path with options.pathToClaudeCodeExecutable.` : `Claude Code executable not found at ${e}. Is options.pathToClaudeCodeExecutable set?`;
  }
  var $lc;
  var Hlc;
  var jlc;
  var _dr;
  var Blc = false;
  var l8o;
  var qlc = __lazy(() => {
    qte();
    Kp();
    gn();
    dt();
    a8o();
    Ulc();
    $lc = require("child_process");
    Hlc = require("fs");
    jlc = require("readline");
    _dr = new Set();
    l8o = class l8o {
      options;
      process;
      processStdin;
      processStdout;
      ready = false;
      abortController;
      exitError;
      exitListeners = [];
      abortHandler;
      forwardedAbort = createAbortController();
      pendingWrites = [];
      pendingEndInput = false;
      spawnResolve;
      spawnReject;
      spawnPromise;
      constructor(e) {
        this.options = e;
        if (this.abortController = e.abortController || createAbortController(), e.deferSpawn) {
          this.spawnPromise = new Promise((t, n) => {
            this.spawnResolve = t;
            this.spawnReject = n;
          });
          this.spawnPromise.catch(() => {});
        } else {
          this.initialize();
        }
      }
      spawn() {
        try {
          this.initialize();
        } catch (t) {
          throw this.spawnAbort(sr(t)), t;
        }
        let e = this.pendingWrites;
        if (this.pendingWrites = [], this.spawnResolve) {
          this.spawnResolve();
          this.spawnResolve = undefined;
          this.spawnReject = undefined;
        }
        for (let t of e) {
          this.write(t);
        }
        if (this.pendingEndInput) {
          this.pendingEndInput = false;
          this.processStdin?.end();
        }
      }
      spawnAbort(e) {
        if (this.spawnReject) {
          this.spawnReject(e);
          this.spawnReject = undefined;
          this.spawnResolve = undefined;
          this.pendingWrites = [];
        }
      }
      updateEnv(e) {
        if (this.options.env) {
          Object.assign(this.options.env, e);
        } else {
          this.options.env = {
            ...e
          };
        }
      }
      updateResume(e) {
        this.options.resume = e;
      }
      getDefaultExecutable() {
        return X4() ? "bun" : "node";
      }
      spawnLocalProcess(e) {
        let {
          command: t,
          args: n,
          cwd: r,
          env: o,
          signal: s
        } = e;
        let i = st(o.DEBUG_CLAUDE_AGENT_SDK) || this.options.stderr ? "pipe" : "ignore";
        let a = $lc.spawn(t, n, {
          cwd: r,
          stdio: ["pipe", "pipe", i],
          signal: s,
          env: o,
          windowsHide: true
        });
        if (st(o.DEBUG_CLAUDE_AGENT_SDK) || this.options.stderr) {
          a.stderr.on("data", c => {
            let u = c.toString();
            if ($5(u), this.options.stderr) {
              this.options.stderr(u);
            }
          });
        }
        return {
          stdin: a.stdin,
          stdout: a.stdout,
          get killed() {
            return a.killed;
          },
          get exitCode() {
            return a.exitCode;
          },
          kill: a.kill.bind(a),
          on: a.on.bind(a),
          once: a.once.bind(a),
          off: a.off.bind(a)
        };
      }
      initialize() {
        try {
          let {
            additionalDirectories: e = [],
            agent: t,
            betas: n,
            cwd: r,
            executable: o = this.getDefaultExecutable(),
            executableArgs: s = [],
            extraArgs: i = {},
            pathToClaudeCodeExecutable: a,
            env: l = {
              ...process.env
            },
            thinkingConfig: c,
            maxTurns: u,
            maxBudgetUsd: d,
            taskBudget: p,
            model: m,
            fallbackModel: f,
            jsonSchema: h,
            permissionMode: g,
            allowDangerouslySkipPermissions: y,
            permissionPromptToolName: _,
            continueConversation: b,
            resume: S,
            settingSources: E,
            skills: C,
            disallowedTools: x = [],
            tools: A,
            mcpServers: k,
            strictMcpConfig: I,
            canUseTool: O,
            includePartialMessages: M,
            plugins: L,
            sandbox: P
          } = this.options;
          let {
            allowedTools: F = []
          } = this.options;
          if (C !== undefined) {
            let K = C === "all" ? ["Skill"] : C.map(Q => `Skill(${Q})`);
            let J = new Set(F);
            F = [...F, ...K.filter(Q => !J.vZc(Q))];
          }
          let H = ["--output-format", "stream-json", "--verbose", "--input-format", "stream-json"];
          if (c) {
            switch (c.type) {
              case "enabled":
                if (c.budgetTokens === undefined) {
                  H.push("--thinking", "adaptive");
                } else {
                  H.push("--max-thinking-tokens", c.budgetTokens.toString());
                }
                break;
              case "disabled":
                H.push("--thinking", "disabled");
                break;
              case "adaptive":
                H.push("--thinking", "adaptive");
                break;
            }
            if (c.type !== "disabled" && c.display) {
              H.push("--thinking-display", c.display);
            }
          }
          if (this.options.effort) {
            H.push("--effort", this.options.effort);
          }
          if (u) {
            H.push("--max-turns", u.toString());
          }
          if (d !== undefined) {
            H.push("--max-budget-usd", d.toString());
          }
          if (p) {
            H.push("--task-budget", p.total.toString());
          }
          if (m) {
            H.push("--model", m);
          }
          if (t) {
            H.push("--agent", t);
          }
          if (n && n.length > 0) {
            H.push("--betas", n.join(","));
          }
          if (h) {
            H.push("--json-schema", De(h));
          }
          if (this.options.debugFile) {
            H.push("--debug-file", this.options.debugFile);
          } else if (this.options.debug) {
            H.push("--debug");
          }
          if (!this.options.debugFile && !this.options.spawnClaudeCodeProcess) {
            let K = Llc();
            if (K) {
              H.push("--debug-file", K);
            }
          }
          if (O) {
            if (_) {
              throw Error("canUseTool callback cannot be used with permissionPromptToolName. Please use one or the other.");
            }
            H.push("--permission-prompt-tool", "stdio");
          } else if (_) {
            H.push("--permission-prompt-tool", _);
          }
          if (b) {
            H.push("--continue");
          }
          if (S) {
            H.push("--resume", S);
          }
          if (F.length > 0) {
            H.push("--allowedTools", F.join(","));
          }
          if (x.length > 0) {
            H.push("--disallowedTools", x.join(","));
          }
          if (A !== undefined) {
            if (Array.isArray(A)) {
              if (A.length === 0) {
                H.push("--tools", "");
              } else {
                H.push("--tools", A.join(","));
              }
            } else {
              H.push("--tools", "default");
            }
          }
          if (k && Object.keys(k).length > 0) {
            H.push("--mcp-config", De({
              mcpServers: k
            }));
          }
          if (E !== undefined) {
            H.push(`--setting-sources=${E.join(",")}`);
          }
          if (I) {
            H.push("--strict-mcp-config");
          }
          if (g) {
            H.push("--permission-mode", g);
          }
          if (y) {
            H.push("--allow-dangerously-skip-permissions");
          }
          if (f) {
            if (m && f === m) {
              throw Error("Fallback model cannot be the same as the main model. Please specify a different model for fallbackModel option.");
            }
            H.push("--fallback-model", f);
          }
          if (this.options.includeHookEvents) {
            H.push("--include-hook-events");
          }
          if (M) {
            H.push("--include-partial-messages");
          }
          if (this.options.sessionMirror) {
            H.push("--session-mirror");
          }
          for (let K of e) {
            H.push("--add-dir", K);
          }
          if (L && L.length > 0) {
            for (let K of L) {
              if (K.type === "local") {
                H.push(K.skipMcpDiscovery ? "--plugin-dir-no-mcp" : "--plugin-dir", K.path);
              } else {
                throw Error(`Unsupported plugin type: ${K.type}`);
              }
            }
          }
          if (this.options.forkSession) {
            H.push("--fork-session");
          }
          if (this.options.resumeSessionAt) {
            H.push("--resume-session-at", this.options.resumeSessionAt);
          }
          if (this.options.sessionId) {
            H.push("--session-id", this.options.sessionId);
          }
          if (this.options.persistSession === false) {
            H.push("--no-session-persistence");
          }
          if (this.options.managedSettings) {
            H.push("--managed-settings", this.options.managedSettings);
          }
          let U = {
            ...(i ?? {})
          };
          if (this.options.settings) {
            U.settings = this.options.settings;
          }
          let N = Flc(U, P);
          for (let [K, J] of Object.entries(N)) {
            if (J === null) {
              H.push(`--${K}`);
            } else {
              H.push(`--${K}`, J);
            }
          }
          if (!l.CLAUDE_CODE_ENTRYPOINT) {
            l.CLAUDE_CODE_ENTRYPOINT = "sdk-ts";
          }
          if (delete l.NODE_OPTIONS, st(l.DEBUG_CLAUDE_AGENT_SDK)) {
            l.DEBUG = "1";
          } else {
            delete l.DEBUG;
          }
          let W = Bif(a);
          let j = W ? a : o;
          let z = W ? [...s, ...H] : [...s, a, ...H];
          let V = {
            command: j,
            args: z,
            cwd: r,
            env: l,
            signal: this.forwardedAbort.signal
          };
          if (this.options.spawnClaudeCodeProcess) {
            $5(`Spawning Claude Code (custom): ${j} ${z.join(" ")}`);
            this.process = this.options.spawnClaudeCodeProcess(V);
          } else {
            $5(`Spawning Claude Code: ${j} ${z.join(" ")}`);
            this.process = this.spawnLocalProcess(V);
          }
          if (this.processStdin = this.process.stdin, this.processStdout = this.process.stdout, Uif(this.process), this.abortHandler = () => this.close(), this.abortController.signal.addEventListener("abort", this.abortHandler), this.abortController.signal.aborted) {
            this.close();
          }
          this.process.on("error", K => {
            if (this.ready = false, this.abortController.signal.aborted) {
              this.exitError = new AbortError("Claude Code process aborted by user");
            } else if (Io(K)) {
              let J = $if(a, W);
              this.exitError = ReferenceError(J);
              $5(this.exitError.message);
            } else {
              this.exitError = Error(`Failed to spawn Claude Code process: ${K.message}`);
              $5(this.exitError.message);
            }
          });
          this.process.on("exit", (K, J) => {
            if (this.ready = false, this.abortController.signal.aborted) {
              this.exitError = new AbortError("Claude Code process aborted by user");
            } else {
              let Q = this.getProcessExitError(K, J);
              if (Q) {
                this.exitError = Q;
                $5(Q.message);
              }
            }
          });
          this.ready = !this.abortController.signal.aborted;
        } catch (e) {
          throw this.ready = false, e;
        }
      }
      getProcessExitError(e, t) {
        if (e !== 0 && e !== null) {
          return Error(`Claude Code process exited with code ${e}`);
        } else if (t) {
          return Error(`Claude Code process terminated by signal ${t}`);
        }
        return;
      }
      write(e) {
        if (this.abortController.signal.aborted) {
          throw new AbortError("Operation aborted");
        }
        if (this.spawnResolve) {
          this.pendingWrites.push(e);
          return;
        }
        if (!this.ready || !this.processStdin) {
          throw Error("ProcessTransport is not ready for writing");
        }
        if (this.processStdin.writableEnded) {
          $5("[ProcessTransport] Dropping write to ended stdin stream");
          return;
        }
        if (this.process?.killed || this.process?.exitCode !== null) {
          throw Error("Cannot write to terminated process");
        }
        if (this.exitError) {
          throw Error(`Cannot write to process that exited with error: ${this.exitError.message}`);
        }
        $5(`[ProcessTransport] Writing to stdin: ${e.substring(0, 100)}`);
        try {
          if (!this.processStdin.write(e)) {
            $5("[ProcessTransport] Write buffer full, data queued");
          }
        } catch (t) {
          throw this.ready = false, Error(`Failed to write to process stdin: ${he(t)}`);
        }
      }
      [Symbol.dispose]() {
        this.close();
      }
      close() {
        if (this.spawnAbort(this.abortController.signal.aborted ? new AbortError("Claude Code process aborted by user") : Error("Query closed before spawn")), this.processStdin) {
          this.processStdin.end();
          this.processStdin = undefined;
        }
        if (this.abortHandler) {
          this.abortController.signal.removeEventListener("abort", this.abortHandler);
          this.abortHandler = undefined;
        }
        for (let {
          handler: n
        } of this.exitListeners) {
          this.process?.off("exit", n);
        }
        this.exitListeners = [];
        let e = () => {
          if (this.abortController.signal.aborted) {
            this.forwardedAbort.abort(this.abortController.signal.reason);
          }
        };
        let t = this.process;
        if (t && !t.killed && t.exitCode === null) {
          setTimeout((n, r) => {
            if (n.exitCode !== null) {
              r();
              return;
            }
            n.kill("SIGTERM");
            setTimeout(o => {
              if (o.exitCode === null) {
                o.kill("SIGKILL");
              }
            }, 5000, n).unref();
            r();
          }, 2000, t, e).unref();
          t.once("exit", () => _dr.delete(t));
        } else if (t) {
          _dr.delete(t);
          e();
        }
        this.ready = false;
      }
      isReady() {
        return this.ready;
      }
      async *readMessages() {
        if (this.spawnPromise) {
          await this.spawnPromise;
          this.spawnPromise = undefined;
        }
        if (!this.processStdout) {
          throw Error("ProcessTransport output stream not available");
        }
        if (this.exitError) {
          throw this.exitError;
        }
        let e = jlc.createInterface({
          input: this.processStdout
        });
        let t = this.process ? (() => {
          let n = this.process;
          let r = () => e.close();
          n.on("error", r);
          return () => n.off("error", r);
        })() : undefined;
        if (this.exitError) {
          e.close();
        }
        try {
          for await (let n of e) {
            if (n.trim()) {
              let r;
              try {
                r = qt(n);
              } catch (o) {
                $5(`Non-JSON stdout: ${n}`);
                continue;
              }
              yield r;
            }
          }
          if (this.exitError) {
            throw this.exitError;
          }
          await this.waitForExit();
        } catch (n) {
          throw n;
        } finally {
          t?.();
          e.close();
        }
      }
      endInput() {
        if (this.spawnResolve) {
          this.pendingEndInput = true;
          return;
        }
        if (this.processStdin) {
          this.processStdin.end();
        }
      }
      getInputStream() {
        return this.processStdin;
      }
      onExit(e) {
        if (!this.process) {
          return () => {};
        }
        let t = (n, r) => {
          let o = this.getProcessExitError(n, r);
          e(o);
        };
        this.process.on("exit", t);
        this.exitListeners.push({
          callback: e,
          handler: t
        });
        return () => {
          if (this.process) {
            this.process.off("exit", t);
          }
          let n = this.exitListeners.findIndex(r => r.handler === t);
          if (n !== -1) {
            this.exitListeners.splice(n, 1);
          }
        };
      }
      async waitForExit() {
        if (!this.process) {
          if (this.exitError) {
            throw this.exitError;
          }
          return;
        }
        if (this.process.exitCode !== null || this.process.killed || this.exitError) {
          if (this.exitError) {
            throw this.exitError;
          }
          return;
        }
        return new Promise((e, t) => {
          let n = (o, s) => {
            if (this.abortController.signal.aborted) {
              t(new AbortError("Operation aborted"));
              return;
            }
            let i = this.getProcessExitError(o, s);
            if (i) {
              t(i);
            } else {
              e();
            }
          };
          this.process.once("exit", n);
          let r = o => {
            this.process.off("exit", n);
            t(o);
          };
          this.process.once("error", r);
          this.process.once("exit", () => {
            this.process.off("error", r);
          });
        });
      }
    };
  });
  function Hif() {
    let e = typeof process.report?.getReport === "function" ? process.report.getReport() : null;
    return e != null && e.header?.glibcVersionRuntime === undefined;
  }
  function Glc(e, t = "linux", n = "arm64", r = Wlc.existsSync, o = Hif()) {
    let s = process.env.SDK_NATIVE_BIN ?? "claude";
    let i = t === "win32" ? ".exe" : "";
    let l = (t === "android" ? [`${"@anthropic-ai/claude-agent-sdk"}-linux-${n}-android`] : t === "linux" ? o ? [`${"@anthropic-ai/claude-agent-sdk"}-linux-${n}-musl`, `${"@anthropic-ai/claude-agent-sdk"}-linux-${n}`] : [`${"@anthropic-ai/claude-agent-sdk"}-linux-${n}`, `${"@anthropic-ai/claude-agent-sdk"}-linux-${n}-musl`] : [`${"@anthropic-ai/claude-agent-sdk"}-${t}-${n}`]).map(c => `${c}/${s}${i}`);
    for (let c of l) {
      try {
        let u = e(c);
        if (r(u)) {
          return u;
        }
      } catch {}
    }
    return null;
  }
  var Wlc;
  var Vlc = __lazy(() => {
    Wlc = require("fs");
  });
  var zlc;
  var c8o;
  var Klc = __lazy(() => {
    qte();
    hDe();
    ln();
    Ot();
    CAt();
    je();
    dt();
    zlc = Symbol("suppressControlResponse");
    c8o = class c8o {
      transport;
      isSingleUserTurn;
      canUseTool;
      hooks;
      abortController;
      jsonSchema;
      initConfig;
      onElicitation;
      getOAuthToken;
      getHostAuthToken;
      onUserDialog;
      pendingControlResponses = new Map();
      cleanupPerformed = false;
      sdkMessages;
      inputStream = new Hq();
      initialization;
      cancelControllers = new Map();
      hookCallbacks = new Map();
      nextCallbackId = 0;
      initHooksPayload;
      sdkMcpTransports = new Map();
      sdkMcpServerInstances = new Map();
      pendingMcpResponses = new Map();
      firstResultReceivedResolve;
      firstResultReceived = false;
      lastErrorResultText;
      transcriptMirrorBatcher;
      cleanupCallbacks = [];
      cleanupPromise;
      setIsSingleUserTurn(e) {
        this.isSingleUserTurn = e;
      }
      setTranscriptMirrorBatcher(e) {
        this.transcriptMirrorBatcher = e;
      }
      reportMirrorError(e, t) {
        let n = {
          type: "system",
          subtype: "mirror_error",
          error: t,
          key: e,
          uuid: Zee.randomUUID(),
          session_id: e.sessionId
        };
        this.inputStream.enqueue(n);
      }
      addCleanupCallback(e) {
        if (this.cleanupPerformed) {
          e();
        } else {
          this.cleanupCallbacks.push(e);
        }
      }
      isClosed() {
        return this.cleanupPerformed;
      }
      hasBidirectionalNeeds() {
        return this.sdkMcpTransports.size > 0 || this.hooks !== undefined && Object.keys(this.hooks).length > 0 || this.canUseTool !== undefined || this.onElicitation !== undefined || this.onUserDialog !== undefined || this.getOAuthToken !== undefined || this.getHostAuthToken !== undefined;
      }
      constructor(e, t, n, r, o, s = new Map(), i, a, l, c, u, d) {
        this.transport = e;
        this.isSingleUserTurn = t;
        this.canUseTool = n;
        this.hooks = r;
        this.abortController = o;
        this.jsonSchema = i;
        this.initConfig = a;
        this.onElicitation = l;
        this.getOAuthToken = c;
        this.getHostAuthToken = u;
        this.onUserDialog = d;
        for (let [p, m] of s) {
          this.connectSdkMcpServer(p, m);
        }
        this.sdkMessages = this.readSdkMessages();
        this.readMessages();
        this.initialization = this.initialize();
        this.initialization.catch(() => {});
      }
      setError(e) {
        this.inputStream.error(e);
      }
      async stopTask(e) {
        await this.request({
          subtype: "stop_task",
          task_id: e
        });
      }
      async backgroundTasks(e) {
        return (await this.request({
          subtype: "background_tasks",
          tool_use_id: e
        })).response.backgrounded ?? true;
      }
      close() {
        this.cleanup();
      }
      cleanup(e) {
        if (this.cleanupPromise) {
          return this.cleanupPromise;
        }
        this.cleanupPerformed = true;
        this.cleanupPromise = this.performCleanup(e);
        return this.cleanupPromise;
      }
      async performCleanup(e) {
        for (let t of this.cleanupCallbacks) {
          try {
            t();
          } catch {}
        }
        if (this.cleanupCallbacks = [], this.transcriptMirrorBatcher) {
          try {
            await this.transcriptMirrorBatcher.flush();
          } catch {}
        }
        try {
          for (let n of this.cancelControllers.values()) {
            n.abort();
          }
          this.cancelControllers.clear();
          this.transport.close();
          let t = e ?? Error("Query closed before response received");
          for (let {
            reject: n
          } of this.pendingControlResponses.values()) {
            n(t);
          }
          this.pendingControlResponses.clear();
          for (let {
            reject: n
          } of this.pendingMcpResponses.values()) {
            n(t);
          }
          this.pendingMcpResponses.clear();
          this.hookCallbacks.clear();
          for (let n of this.sdkMcpTransports.values()) {
            n.close().catch(() => {});
          }
          if (this.sdkMcpTransports.clear(), e) {
            this.inputStream.error(e);
          } else {
            this.inputStream.done();
          }
        } catch (t) {}
        if (this.transport.waitForExit) {
          let t = new AbortController();
          try {
            await Promise.race([this.transport.waitForExit(), sleep(2000, t.signal)]);
          } catch {} finally {
            t.abort();
          }
        }
      }
      next(...[e]) {
        return this.sdkMessages.next(...[e]);
      }
      async return(e) {
        await this.cleanup();
        return this.sdkMessages.return(e);
      }
      async throw(e) {
        await this.cleanup();
        return this.sdkMessages.throw(e);
      }
      [Symbol.asyncIterator]() {
        return this.sdkMessages;
      }
      async [Symbol.asyncDispose]() {
        await this.cleanup();
      }
      async readMessages() {
        try {
          for await (let e of this.transport.readMessages()) {
            if (e.type === "control_response") {
              let t = this.pendingControlResponses.get(e.response.request_id);
              if (t) {
                t.handler(e.response);
              }
              continue;
            } else if (e.type === "control_request") {
              this.handleControlRequest(e);
              continue;
            } else if (e.type === "control_cancel_request") {
              this.handleControlCancelRequest(e);
              continue;
            } else if (e.type === "keep_alive") {
              continue;
            } else if (e.type === "transcript_mirror") {
              this.transcriptMirrorBatcher?.enqueue(e.filePath, e.entries);
              continue;
            }
            if (e.type === "system" && (e.subtype === "post_turn_summary" || e.subtype === "task_summary")) {
              this.inputStream.enqueue(e);
              continue;
            }
            if (e.type === "active_goal") {
              this.inputStream.enqueue(e);
              continue;
            }
            if (e.type === "result") {
              if (this.transcriptMirrorBatcher) {
                await this.transcriptMirrorBatcher.flush();
              }
              if (this.lastErrorResultText = e.is_error ? e.subtype === "success" ? e.result : e.errors.join("; ") : undefined, this.firstResultReceived = true, this.firstResultReceivedResolve) {
                this.firstResultReceivedResolve();
              }
              if (this.isSingleUserTurn) {
                logForDebugging("[Query.readMessages] First result received for single-turn query, closing stdin");
                this.transport.endInput();
              }
            } else if (!(e.type === "system" && e.subtype === "session_state_changed")) {
              this.lastErrorResultText = undefined;
            }
            this.inputStream.enqueue(e);
          }
          if (this.transcriptMirrorBatcher) {
            await this.transcriptMirrorBatcher.flush();
          }
          if (this.firstResultReceivedResolve) {
            this.firstResultReceivedResolve();
          }
          this.inputStream.done();
          this.cleanup();
        } catch (e) {
          if (this.transcriptMirrorBatcher) {
            await this.transcriptMirrorBatcher.flush();
          }
          if (this.firstResultReceivedResolve) {
            this.firstResultReceivedResolve();
          }
          if (this.lastErrorResultText !== undefined && !(e instanceof AbortError)) {
            let t = Error(`Claude Code returned an error result: ${this.lastErrorResultText}`);
            logForDebugging(`[Query.readMessages] Replacing exit error with result text. Original: ${he(e)}`);
            this.inputStream.error(t);
            this.cleanup(t);
            return;
          }
          this.inputStream.error(e);
          this.cleanup(e);
        }
      }
      async handleControlRequest(e) {
        if (this.cancelControllers.vZc(e.request_id)) {
          logForDebugging(`[Query.handleControlRequest] Duplicate delivery of in-flight request ${e.request_id} (${e.request.subtype}) \u2014 skipping`);
          return;
        }
        let t = new AbortController();
        this.cancelControllers.set(e.request_id, t);
        try {
          let n = await this.processControlRequest(e, t.signal);
          if (this.cleanupPerformed) {
            return;
          }
          if (n === zlc) {
            return;
          }
          let r = {
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: n
            }
          };
          await Promise.resolve(this.transport.write(De(r) + `
`));
        } catch (n) {
          if (this.cleanupPerformed) {
            return;
          }
          let r = {
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(n)
            }
          };
          try {
            await Promise.resolve(this.transport.write(De(r) + `
`));
          } catch (o) {
            logForDebugging(`[Query.handleControlRequest] Error-response write failed: ${he(o)}`, {
              level: "error"
            });
          }
        } finally {
          this.cancelControllers.delete(e.request_id);
        }
      }
      handleControlCancelRequest(e) {
        let t = this.cancelControllers.get(e.request_id);
        if (t) {
          t.abort();
          this.cancelControllers.delete(e.request_id);
        }
      }
      async processControlRequest(e, t) {
        if (e.request.subtype === "can_use_tool") {
          if (!this.canUseTool) {
            throw Error("canUseTool callback is not provided.");
          }
          return {
            ...(await this.canUseTool(e.request.tool_name, e.request.input, {
              signal: t,
              suggestions: e.request.permission_suggestions,
              blockedPath: e.request.blocked_path,
              decisionReason: e.request.decision_reason,
              title: e.request.title,
              displayName: e.request.display_name,
              description: e.request.description,
              toolUseID: e.request.tool_use_id,
              agentID: e.request.agent_id
            })),
            toolUseID: e.request.tool_use_id
          };
        } else if (e.request.subtype === "hook_callback") {
          return await this.handleHookCallbacks(e.request.callback_id, e.request.input, e.request.tool_use_id, t);
        } else if (e.request.subtype === "mcp_message") {
          let n = e.request;
          let r = this.sdkMcpTransports.get(n.server_name);
          if (!r) {
            throw Error(`SDK MCP server not found: ${n.server_name}`);
          }
          if ("method" in n.message && "id" in n.message && n.message.id !== null) {
            return {
              mcp_response: await this.handleMcpControlRequest(n.server_name, n, r)
            };
          } else {
            if (r.onmessage) {
              r.onmessage(n.message);
            }
            return {
              mcp_response: {
                jsonrpc: "2.0",
                result: {},
                id: 0
              }
            };
          }
        } else if (e.request.subtype === "elicitation") {
          let n = e.request;
          if (this.onElicitation) {
            return await this.onElicitation({
              serverName: n.mcp_server_name,
              message: n.message,
              mode: n.mode,
              url: n.url,
              elicitationId: n.elicitation_id,
              requestedSchema: n.requested_schema,
              title: n.title,
              displayName: n.display_name,
              description: n.description
            }, {
              signal: t
            });
          }
          return {
            action: "decline"
          };
        } else if (e.request.subtype === "request_user_dialog") {
          if (this.onUserDialog) {
            return await this.onUserDialog({
              dialogKind: e.request.dialog_kind,
              payload: e.request.payload,
              toolUseID: e.request.tool_use_id
            }, {
              signal: t
            });
          }
          logForDebugging(`[Query] No onUserDialog handler for request_user_dialog (kind=${e.request.dialog_kind}) \u2014 staying silent so a capable client (or the worker's park deadline) settles it`);
          logEvent("tengu_request_user_dialog_response_ignored", {
            shape: "auto_cancel"
          });
          return zlc;
        } else if (e.request.subtype === "oauth_token_refresh") {
          if (!this.getOAuthToken) {
            throw Error("getOAuthToken callback is not provided.");
          }
          return {
            accessToken: (await this.getOAuthToken({
              signal: t
            })) ?? null
          };
        } else if (e.request.subtype === "host_auth_token_refresh") {
          if (!this.getHostAuthToken) {
            throw Error("getHostAuthToken callback is not provided.");
          }
          return {
            authToken: (await this.getHostAuthToken({
              signal: t
            })) ?? null
          };
        }
        throw Error("Unsupported control request subtype: " + e.request.subtype);
      }
      async *readSdkMessages() {
        try {
          for await (let e of this.inputStream) {
            yield e;
          }
        } finally {
          await this.cleanup();
        }
      }
      async initialize() {
        if (this.hooks && !this.initHooksPayload) {
          this.initHooksPayload = {};
          for (let [r, o] of Object.entries(this.hooks)) {
            if (o.length > 0) {
              this.initHooksPayload[r] = o.map(s => {
                let i = [];
                for (let a of s.hooks) {
                  let l = `hook_${this.nextCallbackId++}`;
                  this.hookCallbacks.set(l, a);
                  i.push(l);
                }
                return {
                  matcher: s.matcher,
                  hookCallbackIds: i,
                  timeout: s.timeout
                };
              });
            }
          }
        }
        let e = this.sdkMcpTransports.size > 0 ? Array.from(this.sdkMcpTransports.keys()) : undefined;
        let t = {
          subtype: "initialize",
          hooks: this.initHooksPayload,
          sdkMcpServers: e,
          jsonSchema: this.jsonSchema,
          systemPrompt: typeof this.initConfig?.systemPrompt === "string" ? [this.initConfig.systemPrompt] : this.initConfig?.systemPrompt,
          appendSystemPrompt: this.initConfig?.appendSystemPrompt,
          planModeInstructions: this.initConfig?.planModeInstructions,
          appendSubagentSystemPrompt: this.initConfig?.appendSubagentSystemPrompt,
          toolAliases: this.initConfig?.toolAliases,
          excludeDynamicSections: this.initConfig?.excludeDynamicSections,
          agents: this.initConfig?.agents,
          title: this.initConfig?.title,
          skills: Array.isArray(this.initConfig?.skills) ? this.initConfig.skills : undefined,
          webSearchIsolationExemptMcpServers: this.initConfig?.webSearchIsolationExemptMcpServers,
          promptSuggestions: this.initConfig?.promptSuggestions,
          agentProgressSummaries: this.initConfig?.agentProgressSummaries,
          forwardSubagentText: this.initConfig?.forwardSubagentText,
          supportedDialogKinds: this.initConfig?.supportedDialogKinds
        };
        return (await this.request(t)).response;
      }
      async interrupt() {
        return vl("sdk_interrupt", async () => {
          await this.request({
            subtype: "interrupt"
          });
        });
      }
      async setPermissionMode(e) {
        await this.request({
          subtype: "set_permission_mode",
          mode: e
        });
      }
      async setMcpPermissionModeOverride(e, t) {
        return (await this.request({
          subtype: "set_mcp_permission_mode_override",
          serverName: e,
          mode: t
        })).response ?? {};
      }
      async setModel(e) {
        await this.request({
          subtype: "set_model",
          model: e
        });
      }
      async setMaxThinkingTokens(e, t) {
        await this.request({
          subtype: "set_max_thinking_tokens",
          max_thinking_tokens: e,
          thinking_display: t
        });
      }
      async applyFlagSettings(e) {
        return vl("sdk_apply_flag_settings", async () => {
          await this.request({
            subtype: "apply_flag_settings",
            settings: e
          });
        });
      }
      async getSettings() {
        return (await this.request({
          subtype: "get_settings"
        })).response;
      }
      async rewindFiles(e, t) {
        return vl("sdk_rewind_files", async () => (await this.request({
          subtype: "rewind_files",
          user_message_id: e,
          dry_run: t?.dryRun
        })).response);
      }
      async cancelAsyncMessage(e) {
        return (await this.request({
          subtype: "cancel_async_message",
          message_uuid: e
        })).response.cancelled;
      }
      async seedReadState(e, t) {
        await this.request({
          subtype: "seed_read_state",
          path: e,
          mtime: t
        });
      }
      async enableRemoteControl(e, t) {
        return (await this.request({
          subtype: "remote_control",
          enabled: e,
          ...(t !== undefined && {
            name: t
          })
        })).response;
      }
      async submitFeedback(e, t) {
        return (await this.request({
          subtype: "submit_feedback",
          description: e,
          surface: t?.surface
        })).response;
      }
      async generateSessionTitle(e, t) {
        return vl("sdk_session_title_generate", async () => (await this.request({
          subtype: "generate_session_title",
          description: e,
          persist: t?.persist
        })).response.title);
      }
      async askSideQuestion(e) {
        return vl("sdk_side_question", async () => {
          let n = (await this.request({
            subtype: "side_question",
            question: e
          })).response;
          return n.response === null ? null : {
            response: n.response,
            synthetic: n.synthetic ?? false
          };
        });
      }
      async launchUltrareview(e, t) {
        return (await this.request({
          subtype: "ultrareview_launch",
          args: e,
          confirm: t?.confirm ?? false
        })).response;
      }
      async messageRated(e) {
        await this.request({
          subtype: "message_rated",
          messageUuid: e.messageUuid,
          sentiment: e.sentiment,
          surface: e.surface,
          cleared: e.cleared ?? false
        });
      }
      processPendingPermissionRequests(e) {
        for (let t of e) {
          if (t.request.subtype === "can_use_tool") {
            this.handleControlRequest(t).catch(() => {});
          }
        }
      }
      processPendingUserDialogRequests(e) {
        for (let t of e) {
          if (t.request.subtype === "request_user_dialog") {
            this.handleControlRequest(t).catch(() => {});
          }
        }
      }
      request(e) {
        let t = Math.random().toString(36).substring(2, 15);
        let n = {
          request_id: t,
          type: "control_request",
          request: e
        };
        let r = e.subtype === "initialize";
        return new Promise((o, s) => {
          this.pendingControlResponses.set(t, {
            handler: i => {
              if (this.pendingControlResponses.delete(t), i.subtype === "success") {
                o(i);
              } else {
                s(Error(i.error));
              }
              if (!r && (i.pending_permission_requests || i.pending_user_dialog_requests)) {
                logForDebugging(`[Query] Ignoring prompt-redelivery fields on non-initialize response (subtype=${e.subtype})`);
              } else {
                if (i.pending_permission_requests) {
                  this.processPendingPermissionRequests(i.pending_permission_requests);
                }
                if (i.pending_user_dialog_requests) {
                  this.processPendingUserDialogRequests(i.pending_user_dialog_requests);
                }
              }
            },
            reject: s
          });
          Promise.resolve(this.transport.write(De(n) + `
`)).catch(i => {
            this.pendingControlResponses.delete(t);
            s(i);
          });
        });
      }
      initializationResult() {
        return this.initialization;
      }
      reinitialize() {
        return vl("sdk_reinitialize", () => this.initialize());
      }
      async supportedCommands() {
        return (await this.initialization).commands;
      }
      async supportedModels() {
        return (await this.initialization).models;
      }
      async supportedAgents() {
        return (await this.initialization).agents;
      }
      async reconnectMcpServer(e) {
        await this.request({
          subtype: "mcp_reconnect",
          serverName: e
        });
      }
      async toggleMcpServer(e, t) {
        return vl("sdk_mcp_toggle_server", async () => {
          await this.request({
            subtype: "mcp_toggle",
            serverName: e,
            enabled: t
          });
        });
      }
      async enableChannel(e) {
        return vl("sdk_mcp_enable_channel", async () => {
          await this.request({
            subtype: "channel_enable",
            serverName: e
          });
        });
      }
      async mcpAuthenticate(e, t) {
        return (await this.request({
          subtype: "mcp_authenticate",
          serverName: e,
          redirectUri: t
        })).response;
      }
      async mcpClearAuth(e) {
        return (await this.request({
          subtype: "mcp_clear_auth",
          serverName: e
        })).response;
      }
      async mcpSubmitOAuthCallbackUrl(e, t) {
        return (await this.request({
          subtype: "mcp_oauth_callback_url",
          serverName: e,
          callbackUrl: t
        })).response;
      }
      async claudeAuthenticate(e) {
        return (await this.request({
          subtype: "claude_authenticate",
          loginWithClaudeAi: e
        })).response;
      }
      async claudeOAuthCallback(e, t) {
        return (await this.request({
          subtype: "claude_oauth_callback",
          authorizationCode: e,
          state: t
        })).response;
      }
      async claudeOAuthWaitForCompletion() {
        return (await this.request({
          subtype: "claude_oauth_wait_for_completion"
        })).response;
      }
      async mcpServerStatus() {
        return (await this.request({
          subtype: "mcp_status"
        })).response.mcpServers;
      }
      async getContextUsage() {
        return (await this.request({
          subtype: "get_context_usage"
        })).response;
      }
      async usage_EXPERIMENTAL_MAY_CHANGE_DO_NOT_RELY_ON_THIS_API_YET() {
        return (await this.request({
          subtype: "get_usage"
        })).response;
      }
      async readFile(e, t) {
        try {
          return (await this.request({
            subtype: "read_file",
            path: e,
            max_bytes: t?.maxBytes,
            encoding: t?.encoding
          })).response;
        } catch {
          return null;
        }
      }
      async reloadPlugins() {
        return vl("sdk_reload_plugins", async () => (await this.request({
          subtype: "reload_plugins"
        })).response);
      }
      async reloadSkills() {
        return vl("sdk_reload_skills", async () => (await this.request({
          subtype: "reload_skills"
        })).response);
      }
      async setMcpServers(e) {
        return vl("sdk_mcp_set_servers", async () => {
          let t = {};
          let n = {};
          for (let [a, l] of Object.entries(e)) {
            if (l.type === "sdk" && "instance" in l) {
              t[a] = l.instance;
            } else {
              n[a] = l;
            }
          }
          let r = new Set(this.sdkMcpServerInstances.keys());
          let o = new Set(Object.keys(t));
          for (let a of r) {
            if (!o.vZc(a)) {
              await this.disconnectSdkMcpServer(a);
            }
          }
          for (let [a, l] of Object.entries(t)) {
            if (!r.vZc(a)) {
              this.connectSdkMcpServer(a, l);
            }
          }
          let s = {};
          for (let a of Object.keys(t)) {
            s[a] = {
              type: "sdk",
              name: a
            };
          }
          return (await this.request({
            subtype: "mcp_set_servers",
            servers: {
              ...n,
              ...s
            }
          })).response;
        });
      }
      async accountInfo() {
        return (await this.initialization).account;
      }
      async streamInput(e) {
        logForDebugging("[Query.streamInput] Starting to process input stream");
        try {
          let t = 0;
          for await (let n of e) {
            if (t++, logForDebugging(`[Query.streamInput] Processing message ${t}: ${n.type}`), this.abortController?.signal.aborted) {
              break;
            }
            await Promise.resolve(this.transport.write(De(n) + `
`));
          }
          if (logForDebugging(`[Query.streamInput] Finished processing ${t} messages from input stream`), t > 0 && this.hasBidirectionalNeeds()) {
            logForDebugging("[Query.streamInput] Has bidirectional needs, waiting for first result");
            await this.waitForFirstResult();
          }
          logForDebugging("[Query] Calling transport.endInput() to close stdin to CLI process");
          this.transport.endInput();
        } catch (t) {
          if (!(t instanceof AbortError)) {
            throw t;
          }
        }
      }
      waitForFirstResult() {
        if (this.firstResultReceived) {
          logForDebugging("[Query.waitForFirstResult] Result already received, returning immediately");
          return Promise.resolve();
        }
        return new Promise(e => {
          if (this.abortController?.signal.aborted) {
            e();
            return;
          }
          this.abortController?.signal.addEventListener("abort", () => e(), {
            once: true
          });
          this.firstResultReceivedResolve = e;
        });
      }
      handleHookCallbacks(e, t, n, r) {
        let o = this.hookCallbacks.get(e);
        if (!o) {
          throw Error(`No hook callback found for ID: ${e}`);
        }
        return o(t, n, {
          signal: r
        });
      }
      connectSdkMcpServer(e, t) {
        let n = new mTo(r => this.sendMcpServerMessageToCli(e, r));
        this.sdkMcpTransports.set(e, n);
        this.sdkMcpServerInstances.set(e, t);
        t.connect(n).catch(r => {
          if (this.sdkMcpTransports.get(e) === n) {
            this.sdkMcpTransports.delete(e);
          }
          if (this.sdkMcpServerInstances.get(e) === t) {
            this.sdkMcpServerInstances.delete(e);
          }
          logForDebugging(`[Query.connectSdkMcpServer] Failed to connect MCP server '${e}': ${r}`, {
            level: "error"
          });
        });
      }
      async disconnectSdkMcpServer(e) {
        let t = this.sdkMcpTransports.get(e);
        if (t) {
          await t.close();
          this.sdkMcpTransports.delete(e);
        }
        this.sdkMcpServerInstances.delete(e);
      }
      sendMcpServerMessageToCli(e, t) {
        if ("id" in t && t.id !== null && t.id !== undefined) {
          let r = `${e}:${t.id}`;
          let o = this.pendingMcpResponses.get(r);
          if (o) {
            o.resolve(t);
            this.pendingMcpResponses.delete(r);
            return;
          }
        }
        let n = {
          type: "control_request",
          request_id: Zee.randomUUID(),
          request: {
            subtype: "mcp_message",
            server_name: e,
            message: t
          }
        };
        Promise.resolve(this.transport.write(De(n) + `
`)).catch(r => {
          logForDebugging(`[Query.sendMcpServerMessageToCli] Transport write failed: ${r}`, {
            level: "error"
          });
        });
      }
      handleMcpControlRequest(e, t, n) {
        let r = "id" in t.message ? t.message.id : null;
        let o = `${e}:${r}`;
        return new Promise((s, i) => {
          let a = () => {
            this.pendingMcpResponses.delete(o);
          };
          let l = u => {
            a();
            s(u);
          };
          let c = u => {
            a();
            i(u);
          };
          if (this.pendingMcpResponses.set(o, {
            resolve: l,
            reject: c
          }), n.onmessage) {
            n.onmessage(t.message);
          } else {
            a();
            i(Error("No message handler registered"));
            return;
          }
        });
      }
    };
  });
  class u8o {
    send;
    sendTimeoutMs;
    onError;
    maxPendingEntries;
    maxPendingBytes;
    backoffMs;
    pending = [];
    pendingEntries = 0;
    pendingBytes = 0;
    flushPromise = null;
    constructor(e, t = 60000, n, r = 500, o = 1048576, s = jif) {
      this.send = e;
      this.sendTimeoutMs = t;
      this.onError = n;
      this.maxPendingEntries = r;
      this.maxPendingBytes = o;
      this.backoffMs = s;
    }
    enqueue(e, t) {
      let n = De(t).length;
      if (this.pending.push({
        filePath: e,
        entries: t,
        bytes: n
      }), this.pendingEntries += t.length, this.pendingBytes += n, this.pendingEntries > this.maxPendingEntries || this.pendingBytes > this.maxPendingBytes) {
        this.flushPromise = this.drain();
        this.flushPromise.catch(() => {});
      }
    }
    async flush() {
      let e = this.drain();
      if (this.flushPromise = e, await e, this.flushPromise === e) {
        this.flushPromise = null;
      }
    }
    async drain() {
      let e = this.flushPromise;
      let t = this.pending.splice(0);
      if (this.pendingEntries = 0, this.pendingBytes = 0, e) {
        await e;
      }
      if (t.length === 0) {
        return;
      }
      await this.doFlush(t);
    }
    async doFlush(e) {
      let t = new Map();
      for (let r of e) {
        let o = t.get(r.filePath);
        if (o) {
          o.push(...r.entries);
        } else {
          t.set(r.filePath, r.entries.slice());
        }
      }
      let n = this.backoffMs.length + 1;
      for (let [r, o] of t) {
        let s = `SessionStore.append() timed out after ${this.sendTimeoutMs}ms for ${r}`;
        let i;
        let a = 1;
        for (; a <= n; a++) {
          try {
            await withTimeout(this.send(r, o), this.sendTimeoutMs, s);
            i = undefined;
            break;
          } catch (l) {
            if (i = sr(l), i.message === s) {
              break;
            }
            let c = this.backoffMs[a - 1];
            if (c === undefined) {
              break;
            }
            await sleep(c);
          }
        }
        if (i) {
          logForDebugging(`[TranscriptMirrorBatcher] flush failed for ${r} after ${a} attempt(s): ${i}`, {
            level: "error"
          });
          try {
            this.onError?.(r, i);
          } catch (l) {
            logForDebugging(`[TranscriptMirrorBatcher] onError callback threw: ${l}`, {
              level: "error"
            });
          }
        }
      }
    }
  }
  var jif;
  var Ylc = __lazy(() => {
    je();
    dt();
    jif = [200, 800];
  });
  async function qif(e, t) {
    try {
      if (t > 5242880 && !st(process.env.CLAUDE_CODE_DISABLE_PRECOMPACT_SKIP)) {
        return (await ign(e, t)).postBoundaryBuf;
      }
      return await Qlc.readFile(e);
    } catch {
      return null;
    }
  }
  async function Wif(e) {
    using t = eiu`parseTranscriptEntries(${e.length} bytes)`;
    let n = [];
    let r = 10;
    let o = e.length;
    let s = 0;
    let i = 524288;
    while (s < o) {
      if (s >= i) {
        await new Promise(u => setImmediate(u));
        i = s + 524288;
      }
      let a = e.indexOf(r, s);
      if (a === -1) {
        a = o;
      }
      let l = s;
      while (l < a && e[l] <= 32) {
        l++;
      }
      if (s = a + 1, l >= a) {
        continue;
      }
      let c = e.toString("utf-8", l, a);
      try {
        let u = jge(c);
        let d = u.type;
        if ((d === "user" || d === "assistant" || d === "progress" || d === "system" || d === "attachment") && typeof u.uuid === "string") {
          n.push(u);
        }
      } catch {}
    }
    return n;
  }
  async function Gif(e) {
    let t = new Map();
    for (let m of e) {
      t.set(m.uuid, m);
    }
    let n = 0;
    for (let m of t.values()) {
      if (m.type !== "system" || m.subtype !== "compact_boundary") {
        continue;
      }
      let f = m.compactMetadata?.preservedMessages;
      let h = m.compactMetadata?.preservedSegment;
      if (f) {
        if (f.uuids.length === 0 || f.uuids.some(b => !t.vZc(b))) {
          continue;
        }
        let g = f.anchorUuid;
        for (let b of f.uuids) {
          let S = t.get(b);
          t.set(b, {
            ...S,
            parentUuid: g
          });
          g = b;
        }
        let y = f.uuids[0];
        let _ = f.uuids.at(-1);
        for (let [b, S] of t) {
          if (++n % 8192 === 0) {
            await new Promise(E => setImmediate(E));
          }
          if (S.parentUuid === f.anchorUuid && b !== y) {
            t.set(b, {
              ...S,
              parentUuid: _
            });
          }
        }
      } else if (h) {
        let g = t.get(h.headUuid);
        if (g) {
          t.set(h.headUuid, {
            ...g,
            parentUuid: h.anchorUuid
          });
        }
        for (let [y, _] of t) {
          if (++n % 8192 === 0) {
            await new Promise(b => setImmediate(b));
          }
          if (_.parentUuid === h.anchorUuid && y !== h.headUuid) {
            t.set(y, {
              ..._,
              parentUuid: h.tailUuid
            });
          }
        }
      }
    }
    let r = new Map();
    for (let m = 0; m < e.length; m++) {
      r.set(e[m].uuid, m);
    }
    let o = new Set();
    for (let m of t.values()) {
      if (m.parentUuid) {
        o.add(m.parentUuid);
      }
    }
    let s = [...t.values()].filter(m => !o.vZc(m.uuid));
    let i = [];
    for (let m of s) {
      let f = m;
      let h = new Set();
      while (f) {
        if (h.vZc(f.uuid)) {
          break;
        }
        if (h.add(f.uuid), f.type === "user" || f.type === "assistant") {
          i.push(f);
          break;
        }
        f = f.parentUuid ? t.get(f.parentUuid) : undefined;
      }
    }
    if (i.length === 0) {
      return [];
    }
    let a = i.filter(m => !m.isSidechain && !m.teamName && !m.isMeta);
    let l = m => m.reduce((f, h) => (r.get(h.uuid) ?? -1) > (r.get(f.uuid) ?? -1) ? h : f);
    let c = a.length > 0 ? l(a) : l(i);
    let u = [];
    let d = new Set();
    let p = t.get(c.uuid);
    while (p) {
      if (d.vZc(p.uuid)) {
        break;
      }
      d.add(p.uuid);
      u.push(p);
      p = p.parentUuid ? t.get(p.parentUuid) : undefined;
    }
    u.reverse();
    await new Promise(m => setImmediate(m));
    return zif(t, u, d);
  }
  function d8o(e) {
    if (e.type !== "assistant") {
      return;
    }
    let t = e.message;
    if (typeof t !== "object" || t === null) {
      return;
    }
    let n = t.id;
    return typeof n === "string" ? n : undefined;
  }
  function Vif(e) {
    if (e.type !== "user" || !e.parentUuid) {
      return false;
    }
    let t = e.message;
    if (typeof t !== "object" || t === null) {
      return false;
    }
    let n = t.content;
    if (!Array.isArray(n)) {
      return false;
    }
    return n.some(r => typeof r === "object" && r !== null && r.type === "tool_result");
  }
  function zif(e, t, n) {
    let r = t.filter(d => d.type === "assistant");
    if (r.length === 0) {
      return t;
    }
    let o = new Map();
    for (let d of r) {
      let p = d8o(d);
      if (p) {
        o.set(p, d);
      }
    }
    let s = new Map();
    let i = new Map();
    for (let d of e.values()) {
      let p = d8o(d);
      if (p) {
        let m = s.get(p);
        if (m) {
          m.push(d);
        } else {
          s.set(p, [d]);
        }
      } else if (Vif(d)) {
        let m = d.parentUuid;
        let f = i.get(m);
        if (f) {
          f.push(d);
        } else {
          i.set(m, [d]);
        }
      }
    }
    let a = new Set();
    let l = new Map();
    let c = 0;
    for (let d of r) {
      let p = d8o(d);
      if (!p || a.vZc(p)) {
        continue;
      }
      a.add(p);
      let m = s.get(p) ?? [d];
      let f = m.filter(b => !n.vZc(b.uuid));
      let h = [];
      for (let b of m) {
        let S = i.get(b.uuid);
        if (!S) {
          continue;
        }
        for (let E of S) {
          if (!n.vZc(E.uuid)) {
            h.push(E);
          }
        }
      }
      if (f.length === 0 && h.length === 0) {
        continue;
      }
      let g = (b, S) => (b.timestamp ?? "").localeCompare(S.timestamp ?? "");
      f.sort(g);
      h.sort(g);
      let y = o.get(p);
      let _ = [...f, ...h];
      for (let b of _) {
        n.add(b.uuid);
      }
      c += _.length;
      l.set(y.uuid, _);
    }
    if (c === 0) {
      return t;
    }
    let u = [];
    for (let d of t) {
      u.push(d);
      let p = l.get(d.uuid);
      if (p) {
        u.push(...p);
      }
    }
    return u;
  }
  function Kif(e, t) {
    if (e.type === "user" || e.type === "assistant") {
      ;
    } else if (e.type === "system" && t) {
      ;
    } else {
      return false;
    }
    if (e.isMeta) {
      return false;
    }
    if (e.isSidechain) {
      return false;
    }
    if (e.teamName) {
      return false;
    }
    return true;
  }
  function p8o(e, t) {
    return {
      type: e.type,
      uuid: e.uuid,
      session_id: e.sessionId,
      message: e.message,
      parent_tool_use_id: t ?? null,
      timestamp: e.timestamp
    };
  }
  function m8o(e, t) {
    let n = t?.offset ?? 0;
    if (t?.limit !== undefined && t.limit > 0) {
      return e.slice(n, n + t.limit);
    }
    if (n > 0) {
      return e.slice(n);
    }
    return e;
  }
  async function Zlc(e, t) {
    let n = [];
    for (let r of e) {
      if (typeof r !== "object" || r === null) {
        continue;
      }
      let o = r;
      let s = o.type;
      if ((s === "user" || s === "assistant" || s === "progress" || s === "system" || s === "attachment") && typeof o.uuid === "string") {
        n.push(o);
      }
    }
    return ecc(n, t);
  }
  async function ecc(e, t) {
    let n = await Gif(e);
    let r = t?.includeSystemMessages ?? false;
    let s = n.filter(i => Kif(i, r)).map(i => p8o(i));
    return m8o(s, t);
  }
  async function tcc(e, t) {
    if (!QS(e)) {
      return [];
    }
    let n = await gke(e, t?.dir);
    if (!n) {
      return [];
    }
    let r = await qif(n.filePath, n.fileSize);
    if (!r) {
      return [];
    }
    return ecc(await Wif(r), t);
  }
  var Qlc;
  var f8o = __lazy(() => {
    gn();
    ZS();
    Qlc = require("fs/promises");
  });
  async function ncc(e, t = {}) {
    let n = QS(e);
    if (!n) {
      return;
    }
    let r = await gke(n, t.dir);
    if (!r) {
      return;
    }
    let o = await sgn(r.filePath);
    if (!o) {
      return;
    }
    return oEt(n, o, r.projectPath) ?? undefined;
  }
  var rcc = __lazy(() => {
    Btr();
    ZS();
  });
  async function occ(e, t, n = {}) {
    if (!QS(e)) {
      throw Error(`Invalid sessionId: ${e}`);
    }
    if (!t.trim()) {
      throw Error("title must be non-empty");
    }
    let r = De({
      type: "custom-title",
      customTitle: t.trim(),
      sessionId: e
    }) + `
`;
    await acc(e, r, n);
  }
  async function scc(e, t, n = {}) {
    if (!QS(e)) {
      throw Error(`Invalid sessionId: ${e}`);
    }
    if (t !== null) {
      let o = m3(t).trim();
      if (!o) {
        throw Error("tag must be non-empty (use null to clear)");
      }
      t = o;
    }
    let r = De({
      type: "tag",
      tag: t ?? "",
      sessionId: e
    }) + `
`;
    await acc(e, r, n);
  }
  async function icc(e, t = {}) {
    if (!QS(e)) {
      throw Error(`Invalid sessionId: ${e}`);
    }
    for (let n of await Yif(t)) {
      let r = SJe.join(n, `${e}.jsonl`);
      let o;
      try {
        ({
          size: o
        } = await lhe.stat(r));
      } catch (s) {
        let i = en(s);
        if (i === "ENOENT" || i === "ENOTDIR") {
          continue;
        }
        throw s;
      }
      if (o === 0) {
        continue;
      }
      await lhe.rm(r, {
        force: true
      });
      await lhe.rm(SJe.join(n, e), {
        recursive: true,
        force: true
      });
      return;
    }
    throw Error(t.dir ? `Session ${e} not found in project directory for ${t.dir}` : `Session ${e} not found in any project directory`);
  }
  async function Yif(e) {
    if (e.dir) {
      let n = await YE(e.dir);
      let r = await jA(n);
      let o;
      try {
        o = await B6(n);
      } catch {
        o = [];
      }
      for (let s of o) {
        if (s === n) {
          continue;
        }
        r.push(...(await jA(s)));
      }
      return r;
    }
    let t = nF();
    try {
      return (await lhe.readdir(t, {
        withFileTypes: true
      })).filter(r => r.isDirectory() || r.isSymbolicLink()).map(r => SJe.join(t, r.name));
    } catch {
      return [];
    }
  }
  async function acc(e, t, n) {
    let r = `${e}.jsonl`;
    if (n.dir) {
      let i = await YE(n.dir);
      for (let l of await jA(i)) {
        if (await ytn(SJe.join(l, r), t)) {
          return;
        }
      }
      let a;
      try {
        a = await B6(i);
      } catch {
        a = [];
      }
      for (let l of a) {
        if (l === i) {
          continue;
        }
        for (let c of await jA(l)) {
          if (await ytn(SJe.join(c, r), t)) {
            return;
          }
        }
      }
      throw Error(`Session ${e} not found in project directory for ${n.dir}`);
    }
    let o = nF();
    let s;
    try {
      s = await lhe.readdir(o);
    } catch {
      throw Error(`Session ${e} not found (no projects directory)`);
    }
    for (let i of s) {
      if (await ytn(SJe.join(o, i, r), t)) {
        return;
      }
    }
    throw Error(`Session ${e} not found in any project directory`);
  }
  async function ytn(e, t) {
    let n;
    try {
      n = await lhe.open(e, h8o.constants.O_WRONLY | h8o.constants.O_APPEND);
    } catch (r) {
      let o = en(r);
      if (o === "ENOENT" || o === "ENOTDIR") {
        return false;
      }
      throw r;
    }
    try {
      let {
        size: r
      } = await n.stat();
      if (r === 0) {
        return false;
      }
      let o = undefined;
      let s = Buffer.from(t, "utf8");
      let i = 0;
      while (i < s.length) {
        let {
          bytesWritten: a
        } = await n.write(s, i, s.length - i, o);
        if (a <= 0) {
          throw new Po(`tryAppend: short write to ${e} stalled with ${s.length - i} bytes remaining`, "tryAppend: zero-progress short write");
        }
        if (i += a, o !== undefined) {
          o += a;
        }
      }
      return true;
    } finally {
      await n.close();
    }
  }
  var h8o;
  var lhe;
  var SJe;
  var g8o = __lazy(() => {
    dt();
    oje();
    dNe();
    ZS();
    h8o = require("fs");
    lhe = require("fs/promises");
    SJe = require("path");
  });
  async function Jif(e, t) {
    let n = `${e}.jsonl`;
    async function r(i) {
      try {
        let a = await Ys().readBytes(Tdr.join(i, n));
        if (a.length === 0) {
          return null;
        }
        return {
          buf: a,
          projectDir: i
        };
      } catch {
        return null;
      }
    }
    if (t) {
      let i = await YE(t);
      for (let l of await jA(i)) {
        let c = await r(l);
        if (c) {
          return c;
        }
      }
      let a;
      try {
        a = await B6(i);
      } catch {
        a = [];
      }
      for (let l of a) {
        if (l === i) {
          continue;
        }
        for (let c of await jA(l)) {
          let u = await r(c);
          if (u) {
            return u;
          }
        }
      }
      return null;
    }
    let o = nF();
    let s;
    try {
      s = await Ys().list(o);
    } catch {
      return null;
    }
    for (let i of s) {
      let a = await r(Tdr.join(o, i));
      if (a) {
        return a;
      }
    }
    return null;
  }
  function Qif(e, t) {
    let n = [];
    let r = [];
    let o;
    let s = 10;
    let i = e.length;
    let a = 0;
    while (a < i) {
      let l = e.indexOf(10, a);
      if (l === -1) {
        l = i;
      }
      let c = a;
      while (c < l && e[c] <= 32) {
        c++;
      }
      if (a = l + 1, c >= l) {
        continue;
      }
      let u = e.toString("utf-8", c, l);
      try {
        o = lcc(qt(u), t, n, r) ?? o;
      } catch {}
    }
    return {
      transcript: n,
      contentReplacements: r,
      relocatedCwd: o
    };
  }
  function Zif(e, t) {
    let n = [];
    let r = [];
    let o;
    for (let s of e) {
      if (typeof s !== "object" || s === null) {
        continue;
      }
      o = lcc(s, t, n, r) ?? o;
    }
    return {
      transcript: n,
      contentReplacements: r,
      relocatedCwd: o
    };
  }
  function lcc(e, t, n, r) {
    if (Xif.vZc(e.type) && typeof e.uuid === "string") {
      n.push(e);
    } else if (e.type === "content-replacement" && e.sessionId === t && Array.isArray(e.replacements)) {
      r.push(...e.replacements);
    } else if (e.type === "relocated" && e.sessionId === t && typeof e.relocatedCwd === "string") {
      return e.relocatedCwd;
    }
    return;
  }
  async function ccc(e, t = {}) {
    if (!QS(e)) {
      throw new Po(`Invalid sessionId: ${e}`, "forkSession: invalid sessionId (not a UUID)");
    }
    if (t.upToMessageId && !QS(t.upToMessageId)) {
      throw new Po(`Invalid upToMessageId: ${t.upToMessageId}`, "forkSession: invalid upToMessageId (not a UUID)");
    }
    let n = await Jif(e, t.dir);
    if (!n) {
      throw Error(t.dir ? `Session ${e} not found in project directory for ${t.dir}` : `Session ${e} not found`);
    }
    let {
      entries: r,
      forkedSessionId: o
    } = eaf(n.buf, e, t);
    await Rye(Tdr.join(n.projectDir, `${o}.jsonl`), r);
    return {
      sessionId: o
    };
  }
  function eaf(e, t, n) {
    let r = Qif(e, t);
    return dcc(r, t, n, () => {
      let s = e.length;
      let i = e.toString("utf-8", 0, Math.min(s, 65536));
      let a = e.toString("utf-8", Math.max(0, s - 65536));
      return rS(a, "customTitle") || rS(i, "customTitle") || rS(a, "aiTitle") || rS(i, "aiTitle") || ogn(i);
    });
  }
  function ucc(e, t, n) {
    let r = Zif(e, t);
    return dcc(r, t, n, () => taf(e));
  }
  function taf(e) {
    let t;
    let n;
    for (let r of e) {
      if (typeof r !== "object" || r === null) {
        continue;
      }
      let o = r;
      if (typeof o.customTitle === "string" && o.customTitle) {
        t = o.customTitle;
      }
      if (typeof o.aiTitle === "string" && o.aiTitle) {
        n = o.aiTitle;
      }
    }
    return t || n || Bks(e) || undefined;
  }
  function dcc(e, t, n, r) {
    let o = e.transcript.filter(p => !p.isSidechain);
    if (o.length === 0) {
      throw Error(`Session ${t} has no messages to fork`);
    }
    if (n.upToMessageId) {
      let p = o.findIndex(m => m.uuid === n.upToMessageId);
      if (p === -1) {
        throw Error(`Message ${n.upToMessageId} not found in session ${t}`);
      }
      o = o.slice(0, p + 1);
    }
    let s = new Map();
    for (let p of o) {
      s.set(p.uuid, _tn.randomUUID());
    }
    let i = o.filter(p => p.type !== "progress");
    if (i.length === 0) {
      throw Error(`Session ${t} has no messages to fork`);
    }
    let a = new Map();
    for (let p of o) {
      a.set(p.uuid, p);
    }
    let l = _tn.randomUUID();
    let c = new Date().toISOString();
    let u = [];
    for (let p = 0; p < i.length; p++) {
      let m = i[p];
      let f = s.get(m.uuid);
      let h = null;
      let g = m.parentUuid;
      while (g) {
        let E = a.get(g);
        if (!E) {
          break;
        }
        if (E.type !== "progress") {
          h = s.get(g) ?? null;
          break;
        }
        g = E.parentUuid;
      }
      let y = p === i.length - 1 ? c : m.timestamp;
      let _ = m.logicalParentUuid == null ? m.logicalParentUuid : s.get(m.logicalParentUuid) ?? null;
      let b = m.type === "system" && m.subtype === "model_refusal_fallback" ? {
        neutralizedByFork: true
      } : undefined;
      let S = {
        ...m,
        ...b,
        uuid: f,
        parentUuid: h,
        logicalParentUuid: _,
        sessionId: l,
        timestamp: y,
        isSidechain: false,
        teamName: undefined,
        agentName: undefined,
        sessionKind: undefined,
        slug: undefined,
        sourceToolAssistantUUID: undefined,
        forkedFrom: {
          sessionId: t,
          messageUuid: m.uuid
        }
      };
      u.push(S);
    }
    if (e.contentReplacements.length > 0) {
      u.push({
        type: "content-replacement",
        sessionId: l,
        replacements: e.contentReplacements,
        uuid: _tn.randomUUID(),
        timestamp: c
      });
    }
    if (e.relocatedCwd) {
      u.push({
        type: "relocated",
        sessionId: l,
        relocatedCwd: e.relocatedCwd
      });
    }
    let d = n.title?.trim();
    if (!d) {
      d = `${r() || "Forked session"} (fork)`;
    }
    u.push({
      type: "custom-title",
      sessionId: l,
      customTitle: d,
      uuid: _tn.randomUUID(),
      timestamp: c
    });
    return {
      entries: u,
      forkedSessionId: l
    };
  }
  var _tn;
  var Tdr;
  var Xif;
  var pcc = __lazy(() => {
    _b();
    dt();
    oje();
    ZS();
    _tn = require("crypto");
    Tdr = require("path");
    Xif = new Set(["user", "assistant", "attachment", "system", "progress"]);
  });
  async function mcc(e, t) {
    let n = await gke(e, t);
    if (!n) {
      return null;
    }
    let r = n.filePath.replace(/\.jsonl$/, "");
    return Edr.join(r, "subagents");
  }
  async function fcc(e) {
    let t = [];
    async function n(r) {
      let o;
      try {
        o = await btn.readdir(r, {
          withFileTypes: true
        });
      } catch {
        return;
      }
      for (let s of o) {
        if (s.isFile() && s.name.startsWith("agent-") && s.name.endsWith(".jsonl")) {
          let i = s.name.slice(6, -6);
          t.push({
            agentId: i,
            filePath: Edr.join(r, s.name)
          });
        } else if (s.isDirectory()) {
          await n(Edr.join(r, s.name));
        }
      }
    }
    await n(e);
    return t;
  }
  function naf(e) {
    let t = [];
    let n = 10;
    let r = e.length;
    let o = 0;
    while (o < r) {
      let s = e.indexOf(10, o);
      if (s === -1) {
        s = r;
      }
      let i = o;
      while (i < s && e[i] <= 32) {
        i++;
      }
      if (o = s + 1, i >= s) {
        continue;
      }
      let a = e.toString("utf-8", i, s);
      try {
        let l = qt(a);
        let c = l.type;
        if ((c === "user" || c === "assistant") && typeof l.uuid === "string") {
          t.push(l);
        }
      } catch {}
    }
    return t;
  }
  function raf(e) {
    if (e.length === 0) {
      return [];
    }
    let t = new Map();
    for (let i of e) {
      t.set(i.uuid, i);
    }
    let n = e.findLast(i => i.type === "user" || i.type === "assistant");
    if (!n) {
      return [];
    }
    let r = [];
    let o = new Set();
    let s = n;
    while (s) {
      if (o.vZc(s.uuid)) {
        break;
      }
      o.add(s.uuid);
      r.push(s);
      s = s.parentUuid ? t.get(s.parentUuid) : undefined;
    }
    r.reverse();
    return r;
  }
  async function hcc(e, t) {
    if (!QS(e)) {
      return [];
    }
    let n = await mcc(e, t?.dir);
    if (!n) {
      return [];
    }
    return (await fcc(n)).map(o => o.agentId);
  }
  async function gcc(e, t, n) {
    if (!QS(e)) {
      return [];
    }
    if (!t) {
      return [];
    }
    let r = await mcc(e, n?.dir);
    if (!r) {
      return [];
    }
    let s = (await fcc(r)).find(l => l.agentId === t);
    if (!s) {
      return [];
    }
    let i;
    try {
      i = await btn.readFile(s.filePath);
    } catch {
      return [];
    }
    let a;
    try {
      let l = s.filePath.replace(/\.jsonl$/, ".meta.json");
      a = qt(await btn.readFile(l, "utf-8")).toolUseId;
    } catch {}
    return y8o(i, n, a);
  }
  function y8o(e, t, n) {
    if (e.length === 0) {
      return [];
    }
    let r = naf(e);
    let s = raf(r).filter(i => i.type === "user" || i.type === "assistant").map(i => p8o(i, n));
    return m8o(s, t);
  }
  var btn;
  var Edr;
  var ycc = __lazy(() => {
    f8o();
    ZS();
    btn = require("fs/promises");
    Edr = require("path");
  });
  function oaf(e, t) {
    if (e === "bypassPermissions") {
      return "canUseTool will not be invoked: permissionMode 'bypassPermissions' auto-approves every tool call (except explicit deny rules) before the callback is consulted. To gate every tool call, use a PreToolUse hook instead.";
    }
    let n = t.filter(r => r.length > 0 && !r.includes("("));
    if (n.length === 0) {
      return;
    }
    return `canUseTool will not be invoked for: ${n.join(", ")}. Bare allowedTools entries auto-approve the whole tool before the callback is consulted. To gate every tool call, use a PreToolUse hook; or remove the bare names from allowedTools so they fall through to canUseTool. Allow rules from settings files can also shadow the callback but are not visible here.`;
  }
  function _cc(e, t, n) {
    if (!e) {
      return;
    }
    let r = oaf(t, n);
    if (r === undefined) {
      return;
    }
    process.emitWarning(r, {
      code: "CLAUDE_SDK_CAN_USE_TOOL_SHADOWED"
    });
  }
  function _8o(e) {
    return !!e && typeof e === "object" && Scc in e;
  }
  function Tcc(e) {
    return e[Scc]?.complete;
  }
  var Scc;
  var bcc;
  var Ecc = __lazy(() => {
    Scc = Symbol.for("mcp.completable");
    (function (e) {
      e.Completable = "McpCompletable";
    })(bcc || (bcc = {}));
  });
  function iaf(e) {
    let t = [];
    if (e.length === 0) {
      return {
        isValid: false,
        warnings: ["Tool name cannot be empty"]
      };
    }
    if (e.length > 128) {
      return {
        isValid: false,
        warnings: [`Tool name exceeds maximum length of 128 characters (current: ${e.length})`]
      };
    }
    if (e.includes(" ")) {
      t.push("Tool name contains spaces, which may cause parsing issues");
    }
    if (e.includes(",")) {
      t.push("Tool name contains commas, which may cause parsing issues");
    }
    if (e.startsWith("-") || e.endsWith("-")) {
      t.push("Tool name starts or ends with a dash, which may cause parsing issues in some contexts");
    }
    if (e.startsWith(".") || e.endsWith(".")) {
      t.push("Tool name starts or ends with a dot, which may cause parsing issues in some contexts");
    }
    if (!saf.test(e)) {
      let n = e.split("").filter(r => !/[A-Za-z0-9._-]/.test(r)).filter((r, o, s) => s.indexOf(r) === o);
      t.push(`Tool name contains invalid characters: ${n.map(r => `"${r}"`).join(", ")}`, "Allowed characters are: A-Z, a-z, 0-9, underscore (_), dash (-), and dot (.)");
      return {
        isValid: false,
        warnings: t
      };
    }
    return {
      isValid: true,
      warnings: t
    };
  }
  function aaf(e, t) {
    if (t.length > 0) {
      console.warn(`Tool name validation warning for "${e}":`);
      for (let n of t) {
        console.warn(`  - ${n}`);
      }
      console.warn("Tool registration will proceed, but this may cause compatibility issues.");
      console.warn("Consider updating the tool name to conform to the MCP tool naming standard.");
      console.warn("See SEP: Specify Format for Tool Names (https://github.com/modelcontextprotocol/modelcontextprotocol/issues/986) for more details.");
    }
  }
  function b8o(e) {
    let t = iaf(e);
    aaf(e, t.warnings);
    return t.isValid;
  }
  var saf;
  var vcc = __lazy(() => {
    saf = /^[A-Za-z0-9._-]{1,128}$/;
  });
  class S8o {
    constructor(e) {
      this._mcpServer = e;
    }
    registerToolTask(e, t, n) {
      let r = {
        taskSupport: "required",
        ...t.execution
      };
      if (r.taskSupport === "forbidden") {
        throw Error(`Cannot register task-based tool '${e}' with taskSupport 'forbidden'. Use registerTool() instead.`);
      }
      return this._mcpServer._createRegisteredTool(e, t.title, t.description, t.inputSchema, t.outputSchema, t.annotations, r, t._meta, n);
    }
  }
  class E8o {
    constructor(e, t) {
      this._registeredResources = {};
      this._registeredResourceTemplates = {};
      this._registeredTools = {};
      this._registeredPrompts = {};
      this._toolHandlersInitialized = false;
      this._completionHandlerInitialized = false;
      this._resourceHandlersInitialized = false;
      this._promptHandlersInitialized = false;
      this.server = new pye(e, t);
    }
    get experimental() {
      if (!this._experimental) {
        this._experimental = {
          tasks: new S8o(this)
        };
      }
      return this._experimental;
    }
    async connect(e) {
      return await this.server.connect(e);
    }
    async close() {
      await this.server.close();
    }
    setToolRequestHandlers() {
      if (this._toolHandlersInitialized) {
        return;
      }
      this.server.assertCanSetRequestHandler(aBe(q7));
      this.server.assertCanSetRequestHandler(aBe(A6));
      this.server.registerCapabilities({
        tools: {
          listChanged: true
        }
      });
      this.server.setRequestHandler(q7, () => ({
        tools: Object.entries(this._registeredTools).filter(([, e]) => e.enabled).map(([e, t]) => {
          let n = {
            name: e,
            title: t.title,
            description: t.description,
            inputSchema: (() => {
              let r = jet(t.inputSchema);
              return r ? aIr(r, {
                strictUnions: true,
                pipeStrategy: "input"
              }) : laf;
            })(),
            annotations: t.annotations,
            execution: t.execution,
            _meta: t._meta
          };
          if (t.outputSchema) {
            let r = jet(t.outputSchema);
            if (r) {
              n.outputSchema = aIr(r, {
                strictUnions: true,
                pipeStrategy: "output"
              });
            }
          }
          return n;
        })
      }));
      this.server.setRequestHandler(A6, async (e, t) => {
        try {
          let n = this._registeredTools[e.params.name];
          if (!n) {
            throw new yi(Ei.InvalidParams, `Tool ${e.params.name} not found`);
          }
          if (!n.enabled) {
            throw new yi(Ei.InvalidParams, `Tool ${e.params.name} disabled`);
          }
          let r = !!e.params.task;
          let o = n.execution?.taskSupport;
          let s = "createTask" in n.handler;
          if ((o === "required" || o === "optional") && !s) {
            throw new yi(Ei.InternalError, `Tool ${e.params.name} has taskSupport '${o}' but was not registered with registerToolTask`);
          }
          if (o === "required" && !r) {
            throw new yi(Ei.MethodNotFound, `Tool ${e.params.name} requires task augmentation (taskSupport: 'required')`);
          }
          if (o === "optional" && !r && s) {
            return await this.handleAutomaticTaskPolling(n, e, t);
          }
          let i = await this.validateToolInput(n, e.params.arguments, e.params.name);
          let a = await this.executeToolHandler(n, i, t);
          if (r) {
            return a;
          }
          await this.validateToolOutput(n, a, e.params.name);
          return a;
        } catch (n) {
          if (n instanceof yi) {
            if (n.code === Ei.UrlElicitationRequired) {
              throw n;
            }
          }
          return this.createToolError(n instanceof Error ? n.message : String(n));
        }
      });
      this._toolHandlersInitialized = true;
    }
    createToolError(e) {
      return {
        content: [{
          type: "text",
          text: e
        }],
        isError: true
      };
    }
    async validateToolInput(e, t, n) {
      if (!e.inputSchema) {
        return;
      }
      let o = jet(e.inputSchema) ?? e.inputSchema;
      let s = await hpn(o, t);
      if (!s.success) {
        let i = "error" in s ? s.error : "Unknown error";
        let a = gpn(i);
        throw new yi(Ei.InvalidParams, `Input validation error: Invalid arguments for tool ${n}: ${a}`);
      }
      return s.data;
    }
    async validateToolOutput(e, t, n) {
      if (!e.outputSchema) {
        return;
      }
      if (!("content" in t)) {
        return;
      }
      if (t.isError) {
        return;
      }
      if (!t.structuredContent) {
        throw new yi(Ei.InvalidParams, `Output validation error: Tool ${n} has an output schema but no structured content was provided`);
      }
      let r = jet(e.outputSchema);
      let o = await hpn(r, t.structuredContent);
      if (!o.success) {
        let s = "error" in o ? o.error : "Unknown error";
        let i = gpn(s);
        throw new yi(Ei.InvalidParams, `Output validation error: Invalid structured content for tool ${n}: ${i}`);
      }
    }
    async executeToolHandler(e, t, n) {
      let r = e.handler;
      if ("createTask" in r) {
        if (!n.taskStore) {
          throw Error("No task store provided.");
        }
        let s = {
          ...n,
          taskStore: n.taskStore
        };
        if (e.inputSchema) {
          return await Promise.resolve(r.createTask(t, s));
        } else {
          return await Promise.resolve(r.createTask(s));
        }
      }
      if (e.inputSchema) {
        return await Promise.resolve(r(t, n));
      } else {
        return await Promise.resolve(r(n));
      }
    }
    async handleAutomaticTaskPolling(e, t, n) {
      if (!n.taskStore) {
        throw Error("No task store provided for task-capable tool.");
      }
      let r = await this.validateToolInput(e, t.params.arguments, t.params.name);
      let o = e.handler;
      let s = {
        ...n,
        taskStore: n.taskStore
      };
      let i = r ? await Promise.resolve(o.createTask(r, s)) : await Promise.resolve(o.createTask(s));
      let a = i.task.taskId;
      let l = i.task;
      let c = l.pollInterval ?? 5000;
      while (l.status !== "completed" && l.status !== "failed" && l.status !== "cancelled") {
        await new Promise(d => setTimeout(d, c));
        let u = await n.taskStore.getTask(a);
        if (!u) {
          throw new yi(Ei.InternalError, `Task ${a} not found during polling`);
        }
        l = u;
      }
      return await n.taskStore.getTaskResult(a);
    }
    setCompletionRequestHandler() {
      if (this._completionHandlerInitialized) {
        return;
      }
      this.server.assertCanSetRequestHandler(aBe(emn));
      this.server.registerCapabilities({
        completions: {}
      });
      this.server.setRequestHandler(emn, async e => {
        switch (e.params.ref.type) {
          case "ref/prompt":
            lgs(e);
            return this.handlePromptCompletion(e, e.params.ref);
          case "ref/resource":
            cgs(e);
            return this.handleResourceCompletion(e, e.params.ref);
          default:
            throw new yi(Ei.InvalidParams, `Invalid completion reference: ${e.params.ref}`);
        }
      });
      this._completionHandlerInitialized = true;
    }
    async handlePromptCompletion(e, t) {
      let n = this._registeredPrompts[t.name];
      if (!n) {
        throw new yi(Ei.InvalidParams, `Prompt ${t.name} not found`);
      }
      if (!n.enabled) {
        throw new yi(Ei.InvalidParams, `Prompt ${t.name} disabled`);
      }
      if (!n.argsSchema) {
        return Stn;
      }
      let o = Kae(n.argsSchema)?.[e.params.argument.name];
      if (!_8o(o)) {
        return Stn;
      }
      let s = Tcc(o);
      if (!s) {
        return Stn;
      }
      let i = await s(e.params.argument.value, e.params.context);
      return Ccc(i);
    }
    async handleResourceCompletion(e, t) {
      let n = Object.values(this._registeredResourceTemplates).find(s => s.resourceTemplate.uriTemplate.toString() === t.uri);
      if (!n) {
        if (this._registeredResources[t.uri]) {
          return Stn;
        }
        throw new yi(Ei.InvalidParams, `Resource template ${e.params.ref.uri} not found`);
      }
      let r = n.resourceTemplate.completeCallback(e.params.argument.name);
      if (!r) {
        return Stn;
      }
      let o = await r(e.params.argument.value, e.params.context);
      return Ccc(o);
    }
    setResourceRequestHandlers() {
      if (this._resourceHandlersInitialized) {
        return;
      }
      this.server.assertCanSetRequestHandler(aBe(Ypn));
      this.server.assertCanSetRequestHandler(aBe(Jpn));
      this.server.assertCanSetRequestHandler(aBe(Xpn));
      this.server.registerCapabilities({
        resources: {
          listChanged: true
        }
      });
      this.server.setRequestHandler(Ypn, async (e, t) => {
        let n = Object.entries(this._registeredResources).filter(([o, s]) => s.enabled).map(([o, s]) => ({
          uri: o,
          name: s.name,
          ...s.metadata
        }));
        let r = [];
        for (let o of Object.values(this._registeredResourceTemplates)) {
          if (!o.resourceTemplate.listCallback) {
            continue;
          }
          let s = await o.resourceTemplate.listCallback(t);
          for (let i of s.resources) {
            r.push({
              ...o.metadata,
              ...i
            });
          }
        }
        return {
          resources: [...n, ...r]
        };
      });
      this.server.setRequestHandler(Jpn, async () => ({
        resourceTemplates: Object.entries(this._registeredResourceTemplates).map(([t, n]) => ({
          name: t,
          uriTemplate: n.resourceTemplate.uriTemplate.toString(),
          ...n.metadata
        }))
      }));
      this.server.setRequestHandler(Xpn, async (e, t) => {
        let n = new URL(e.params.uri);
        let r = this._registeredResources[n.toString()];
        if (r) {
          if (!r.enabled) {
            throw new yi(Ei.InvalidParams, `Resource ${n} disabled`);
          }
          return r.readCallback(n, t);
        }
        for (let o of Object.values(this._registeredResourceTemplates)) {
          let s = o.resourceTemplate.uriTemplate.match(n.toString());
          if (s) {
            return o.readCallback(n, s, t);
          }
        }
        throw new yi(Ei.InvalidParams, `Resource ${n} not found`);
      });
      this._resourceHandlersInitialized = true;
    }
    setPromptRequestHandlers() {
      if (this._promptHandlersInitialized) {
        return;
      }
      this.server.assertCanSetRequestHandler(aBe(Qpn));
      this.server.assertCanSetRequestHandler(aBe(Zpn));
      this.server.registerCapabilities({
        prompts: {
          listChanged: true
        }
      });
      this.server.setRequestHandler(Qpn, () => ({
        prompts: Object.entries(this._registeredPrompts).filter(([, e]) => e.enabled).map(([e, t]) => ({
          name: e,
          title: t.title,
          description: t.description,
          arguments: t.argsSchema ? caf(t.argsSchema) : undefined
        }))
      }));
      this.server.setRequestHandler(Zpn, async (e, t) => {
        let n = this._registeredPrompts[e.params.name];
        if (!n) {
          throw new yi(Ei.InvalidParams, `Prompt ${e.params.name} not found`);
        }
        if (!n.enabled) {
          throw new yi(Ei.InvalidParams, `Prompt ${e.params.name} disabled`);
        }
        if (n.argsSchema) {
          let r = jet(n.argsSchema);
          let o = await hpn(r, e.params.arguments);
          if (!o.success) {
            let a = "error" in o ? o.error : "Unknown error";
            let l = gpn(a);
            throw new yi(Ei.InvalidParams, `Invalid arguments for prompt ${e.params.name}: ${l}`);
          }
          let s = o.data;
          let i = n.callback;
          return await Promise.resolve(i(s, t));
        } else {
          let r = n.callback;
          return await Promise.resolve(r(t));
        }
      });
      this._promptHandlersInitialized = true;
    }
    resource(e, t, ...n) {
      let r;
      if (typeof n[0] === "object") {
        r = n.shift();
      }
      let o = n[0];
      if (typeof t === "string") {
        if (this._registeredResources[t]) {
          throw Error(`Resource ${t} is already registered`);
        }
        let s = this._createRegisteredResource(e, undefined, t, r, o);
        this.setResourceRequestHandlers();
        this.sendResourceListChanged();
        return s;
      } else {
        if (this._registeredResourceTemplates[e]) {
          throw Error(`Resource template ${e} is already registered`);
        }
        let s = this._createRegisteredResourceTemplate(e, undefined, t, r, o);
        this.setResourceRequestHandlers();
        this.sendResourceListChanged();
        return s;
      }
    }
    registerResource(e, t, n, r) {
      if (typeof t === "string") {
        if (this._registeredResources[t]) {
          throw Error(`Resource ${t} is already registered`);
        }
        let o = this._createRegisteredResource(e, n.title, t, n, r);
        this.setResourceRequestHandlers();
        this.sendResourceListChanged();
        return o;
      } else {
        if (this._registeredResourceTemplates[e]) {
          throw Error(`Resource template ${e} is already registered`);
        }
        let o = this._createRegisteredResourceTemplate(e, n.title, t, n, r);
        this.setResourceRequestHandlers();
        this.sendResourceListChanged();
        return o;
      }
    }
    _createRegisteredResource(e, t, n, r, o) {
      let s = {
        name: e,
        title: t,
        metadata: r,
        readCallback: o,
        enabled: true,
        disable: () => s.update({
          enabled: false
        }),
        enable: () => s.update({
          enabled: true
        }),
        remove: () => s.update({
          uri: null
        }),
        update: i => {
          if (typeof i.uri < "u" && i.uri !== n) {
            if (delete this._registeredResources[n], i.uri) {
              this._registeredResources[i.uri] = s;
            }
          }
          if (typeof i.name < "u") {
            s.name = i.name;
          }
          if (typeof i.title < "u") {
            s.title = i.title;
          }
          if (typeof i.metadata < "u") {
            s.metadata = i.metadata;
          }
          if (typeof i.callback < "u") {
            s.readCallback = i.callback;
          }
          if (typeof i.enabled < "u") {
            s.enabled = i.enabled;
          }
          this.sendResourceListChanged();
        }
      };
      this._registeredResources[n] = s;
      return s;
    }
    _createRegisteredResourceTemplate(e, t, n, r, o) {
      let s = {
        resourceTemplate: n,
        title: t,
        metadata: r,
        readCallback: o,
        enabled: true,
        disable: () => s.update({
          enabled: false
        }),
        enable: () => s.update({
          enabled: true
        }),
        remove: () => s.update({
          name: null
        }),
        update: l => {
          if (typeof l.name < "u" && l.name !== e) {
            if (delete this._registeredResourceTemplates[e], l.name) {
              this._registeredResourceTemplates[l.name] = s;
            }
          }
          if (typeof l.title < "u") {
            s.title = l.title;
          }
          if (typeof l.template < "u") {
            s.resourceTemplate = l.template;
          }
          if (typeof l.metadata < "u") {
            s.metadata = l.metadata;
          }
          if (typeof l.callback < "u") {
            s.readCallback = l.callback;
          }
          if (typeof l.enabled < "u") {
            s.enabled = l.enabled;
          }
          this.sendResourceListChanged();
        }
      };
      this._registeredResourceTemplates[e] = s;
      let i = n.uriTemplate.variableNames;
      if (Array.isArray(i) && i.some(l => !!n.completeCallback(l))) {
        this.setCompletionRequestHandler();
      }
      return s;
    }
    _createRegisteredPrompt(e, t, n, r, o) {
      let s = {
        title: t,
        description: n,
        argsSchema: r === undefined ? undefined : sHe(r),
        callback: o,
        enabled: true,
        disable: () => s.update({
          enabled: false
        }),
        enable: () => s.update({
          enabled: true
        }),
        remove: () => s.update({
          name: null
        }),
        update: i => {
          if (typeof i.name < "u" && i.name !== e) {
            if (delete this._registeredPrompts[e], i.name) {
              this._registeredPrompts[i.name] = s;
            }
          }
          if (typeof i.title < "u") {
            s.title = i.title;
          }
          if (typeof i.description < "u") {
            s.description = i.description;
          }
          if (typeof i.argsSchema < "u") {
            s.argsSchema = sHe(i.argsSchema);
          }
          if (typeof i.callback < "u") {
            s.callback = i.callback;
          }
          if (typeof i.enabled < "u") {
            s.enabled = i.enabled;
          }
          this.sendPromptListChanged();
        }
      };
      if (this._registeredPrompts[e] = s, r) {
        if (Object.values(r).some(a => {
          let l = a instanceof ZodOptional ? a._def?.innerType : a;
          return _8o(l);
        })) {
          this.setCompletionRequestHandler();
        }
      }
      return s;
    }
    _createRegisteredTool(e, t, n, r, o, s, i, a, l) {
      b8o(e);
      let c = {
        title: t,
        description: n,
        inputSchema: wcc(r),
        outputSchema: wcc(o),
        annotations: s,
        execution: i,
        _meta: a,
        handler: l,
        enabled: true,
        disable: () => c.update({
          enabled: false
        }),
        enable: () => c.update({
          enabled: true
        }),
        remove: () => c.update({
          name: null
        }),
        update: u => {
          if (typeof u.name < "u" && u.name !== e) {
            if (typeof u.name === "string") {
              b8o(u.name);
            }
            if (delete this._registeredTools[e], u.name) {
              this._registeredTools[u.name] = c;
            }
          }
          if (typeof u.title < "u") {
            c.title = u.title;
          }
          if (typeof u.description < "u") {
            c.description = u.description;
          }
          if (typeof u.paramsSchema < "u") {
            c.inputSchema = sHe(u.paramsSchema);
          }
          if (typeof u.outputSchema < "u") {
            c.outputSchema = sHe(u.outputSchema);
          }
          if (typeof u.callback < "u") {
            c.handler = u.callback;
          }
          if (typeof u.annotations < "u") {
            c.annotations = u.annotations;
          }
          if (typeof u._meta < "u") {
            c._meta = u._meta;
          }
          if (typeof u.enabled < "u") {
            c.enabled = u.enabled;
          }
          this.sendToolListChanged();
        }
      };
      this._registeredTools[e] = c;
      this.setToolRequestHandlers();
      this.sendToolListChanged();
      return c;
    }
    tool(e, ...t) {
      if (this._registeredTools[e]) {
        throw Error(`Tool ${e} is already registered`);
      }
      let n;
      let r;
      let o;
      let s;
      if (typeof t[0] === "string") {
        n = t.shift();
      }
      if (t.length > 1) {
        let a = t[0];
        if (T8o(a)) {
          if (r = t.shift(), t.length > 1 && typeof t[0] === "object" && t[0] !== null && !T8o(t[0])) {
            s = t.shift();
          }
        } else if (typeof a === "object" && a !== null) {
          if (Object.values(a).some(l => typeof l === "object" && l !== null)) {
            throw Error(`Tool ${e} expected a Zod schema or ToolAnnotations, but received an unrecognized object`);
          }
          s = t.shift();
        }
      }
      let i = t[0];
      return this._createRegisteredTool(e, undefined, n, r, o, s, {
        taskSupport: "forbidden"
      }, undefined, i);
    }
    registerTool(e, t, n) {
      if (this._registeredTools[e]) {
        throw Error(`Tool ${e} is already registered`);
      }
      let {
        title: r,
        description: o,
        inputSchema: s,
        outputSchema: i,
        annotations: a,
        _meta: l
      } = t;
      return this._createRegisteredTool(e, r, o, s, i, a, {
        taskSupport: "forbidden"
      }, l, n);
    }
    prompt(e, ...t) {
      if (this._registeredPrompts[e]) {
        throw Error(`Prompt ${e} is already registered`);
      }
      let n;
      if (typeof t[0] === "string") {
        n = t.shift();
      }
      let r;
      if (t.length > 1) {
        r = t.shift();
      }
      let o = t[0];
      let s = this._createRegisteredPrompt(e, undefined, n, r, o);
      this.setPromptRequestHandlers();
      this.sendPromptListChanged();
      return s;
    }
    registerPrompt(e, t, n) {
      if (this._registeredPrompts[e]) {
        throw Error(`Prompt ${e} is already registered`);
      }
      let {
        title: r,
        description: o,
        argsSchema: s
      } = t;
      let i = this._createRegisteredPrompt(e, r, o, s, n);
      this.setPromptRequestHandlers();
      this.sendPromptListChanged();
      return i;
    }
    isConnected() {
      return this.server.transport !== undefined;
    }
    async sendLoggingMessage(e, t) {
      return this.server.sendLoggingMessage(e, t);
    }
    sendResourceListChanged() {
      if (this.isConnected()) {
        this.server.sendResourceListChanged();
      }
    }
    sendToolListChanged() {
      if (this.isConnected()) {
        this.server.sendToolListChanged();
      }
    }
    sendPromptListChanged() {
      if (this.isConnected()) {
        this.server.sendPromptListChanged();
      }
    }
  }
  function Rcc(e) {
    return e !== null && typeof e === "object" && "parse" in e && typeof e.parse === "function" && "safeParse" in e && typeof e.safeParse === "function";
  }
  function xcc(e) {
    return "_def" in e || "_zod" in e || Rcc(e);
  }
  function T8o(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    if (xcc(e)) {
      return false;
    }
    if (Object.keys(e).length === 0) {
      return true;
    }
    return Object.values(e).some(Rcc);
  }
  function wcc(e) {
    if (!e) {
      return;
    }
    if (T8o(e)) {
      return sHe(e);
    }
    if (!xcc(e)) {
      throw Error("inputSchema must be a Zod schema or raw shape, received an unrecognized object");
    }
    return e;
  }
  function caf(e) {
    let t = Kae(e);
    if (!t) {
      return [];
    }
    return Object.entries(t).map(([n, r]) => {
      let o = ohs(r);
      let s = shs(r);
      return {
        name: n,
        description: o,
        required: !s
      };
    });
  }
  function aBe(e) {
    let n = Kae(e)?.method;
    if (!n) {
      throw Error("Schema is missing a method literal");
    }
    let r = ypn(n);
    if (typeof r === "string") {
      return r;
    }
    throw Error("Schema method literal must be a string");
  }
  function Ccc(e) {
    return {
      completion: {
        values: e.slice(0, 100),
        total: e.length,
        hasMore: e.length > 100
      }
    };
  }
  var laf;
  var Stn;
  var kcc = __lazy(() => {
    BOt();
    qet();
    uIr();
    Ecc();
    vcc();
    qg();
    laf = {
      type: "object",
      properties: {}
    };
    Stn = {
      completion: {
        values: [],
        hasMore: false
      }
    };
  });
  function tool(e, t, n, r, o) {
    let s = {};
    if (o?.searchHint) {
      s["anthropic/searchHint"] = o.searchHint;
    }
    if (o?.alwaysLoad) {
      s["anthropic/alwaysLoad"] = true;
    }
    return {
      name: e,
      description: t,
      inputSchema: n,
      handler: r,
      annotations: o?.annotations,
      _meta: Object.keys(s).length > 0 ? s : undefined
    };
  }
  function createSdkMcpServer(e) {
    let t = new E8o({
      name: e.name,
      version: e.version ?? "1.0.0"
    }, {
      capabilities: {
        tools: e.tools ? {} : undefined
      },
      instructions: e.instructions
    });
    if (e.tools) {
      e.tools.forEach(n => {
        for (let r of Object.values(n.inputSchema)) {
          if (!uaf(r)) {
            continue;
          }
          let o = r.description;
          if (o && !globalRegistry.vZc(r)) {
            globalRegistry.add(r, {
              description: o
            });
          }
        }
        t.registerTool(n.name, {
          description: n.description,
          inputSchema: n.inputSchema,
          annotations: n.annotations,
          _meta: e.alwaysLoad ? {
            "anthropic/alwaysLoad": true,
            ...n._meta
          } : n._meta
        }, n.handler);
      });
    }
    return {
      type: "sdk",
      name: e.name,
      instance: t
    };
  }
  function uaf(e) {
    return typeof e === "object" && e !== null && "_zod" in e;
  }
  var Pcc = __lazy(() => {
    kcc();
  });
  function parseDirectConnectUrl(e) {
    if (e.startsWith("cc://")) {
      let r = e.slice(5);
      let o = new URL(`http://${r}`);
      let s = o.pathname.slice(1) || undefined;
      return {
        serverUrl: `http://${o.host}`,
        authToken: s
      };
    }
    if (e.startsWith("cc+unix://")) {
      throw new DirectConnectError("Unix socket connect (cc+unix://) is not supported by the SDK transport");
    }
    let t = /^https?:\/\//i.test(e) ? e : `http://${e}`;
    let n = new URL(t);
    return {
      serverUrl: `${n.protocol}//${n.host}`,
      authToken: undefined
    };
  }
  async function paf(e) {
    let t = {
      "content-type": "application/json"
    };
    if (e.authToken) {
      t.authorization = `Bearer ${e.authToken}`;
    }
    let n = {};
    if (e.cwd) {
      n.cwd = e.cwd;
    }
    if (e.sessionKey) {
      n.session_key = e.sessionKey;
    }
    if (e.permissionMode) {
      n.permission_mode = e.permissionMode;
    }
    let r;
    try {
      r = await fetch(`${e.serverUrl}/sessions`, {
        method: "POST",
        headers: t,
        body: De(n)
      });
    } catch (s) {
      throw new DirectConnectError(`Failed to connect to server at ${e.serverUrl}: ${s instanceof Error ? s.message : String(s)}`, "session_create_failed");
    }
    if (!r.ok) {
      let s = await r.text().catch(() => "");
      throw new DirectConnectError(`Failed to create session: ${r.status} ${r.statusText}${s ? ` \u2014 ${s}` : ""}`, "session_create_failed");
    }
    let o = daf().safeParse(await r.json());
    if (!o.success) {
      throw new DirectConnectError(`Invalid session response: ${o.error.message}`, "session_create_invalid_response");
    }
    return {
      sessionId: o.data.session_id,
      wsUrl: o.data.ws_url,
      workDir: o.data.work_dir
    };
  }
  async function Dcc(e, t, n) {
    let r = {};
    if (n) {
      r.authorization = `Bearer ${n}`;
    }
    try {
      await fetch(`${e}/sessions/${t}`, {
        method: "DELETE",
        headers: r
      });
    } catch {}
  }
  var daf;
  var DirectConnectError;
  var DirectConnectTransport;
  var Ncc = __lazy(() => {
    qte();
    ln();
    dt();
    a8o();
    hDe();
    daf = we(() => v.object({
      session_id: v.string(),
      ws_url: v.string(),
      work_dir: v.string().optional(),
      session_key: v.string().optional()
    }));
    DirectConnectError = class mee extends Error {
      code;
      constructor(e, t) {
        super(e);
        this.name = "DirectConnectError";
        this.code = t;
      }
    };
    DirectConnectTransport = class v8o {
      options;
      0;
      sessionId;
      workDir;
      abortController;
      readyState = false;
      closed = false;
      exitError;
      messages = new Hq();
      readyPromise;
      readyResolve;
      readyReject;
      abortHandler;
      partialChunks = [];
      telemetryEmitted = false;
      constructor(e) {
        this.options = e;
        this.abortController = e.abortController ?? new AbortController();
        this.readyPromise = new Promise((t, n) => {
          this.readyResolve = t;
          this.readyReject = n;
        });
        this.readyPromise.catch(() => {});
        this.initialize();
      }
      get ready() {
        return this.readyPromise;
      }
      getSessionId() {
        return this.sessionId;
      }
      getWorkDir() {
        return this.workDir;
      }
      async initialize() {
        if (this.abortController.signal.aborted) {
          this.failInit(new AbortError("Connection aborted"));
          return;
        }
        this.abortHandler = () => {
          this.close();
          this.exitError = new AbortError("Connection aborted by user");
        };
        this.abortController.signal.addEventListener("abort", this.abortHandler);
        let e;
        try {
          let o = await paf(this.options);
          this.sessionId = o.sessionId;
          this.workDir = o.workDir;
          e = o.wsUrl;
        } catch (o) {
          let s = sr(o);
          if (!(s instanceof AbortError)) {
            let i = s instanceof DirectConnectError && s.code ? s.code : "session_create_failed";
            this.emitTelemetry("bad", i);
          }
          this.failInit(s);
          return;
        }
        if (this.closed) {
          if (this.options.deleteSessionOnClose && this.sessionId) {
            Dcc(this.options.serverUrl, this.sessionId, this.options.authToken);
          }
          return;
        }
        let t = {};
        if (this.options.authToken) {
          t.authorization = `Bearer ${this.options.authToken}`;
        }
        let n = new WebSocket(e, {
          headers: t
        });
        this.ws = n;
        let r = setTimeout((o, s) => {
          if (!o.readyState) {
            s.close();
            let i = new DirectConnectError(`WebSocket connection timeout after ${15000}ms`);
            o.exitError = i;
            o.readyReject?.(i);
            o.emitTelemetry("bad", "connect_timeout");
          }
        }, 15000, this, n);
        n.addEventListener("open", () => {
          clearTimeout(r);
          this.readyState = true;
          $5(`[DirectConnectTransport] Connected to ${this.options.serverUrl}, session=${this.sessionId}`);
          this.readyResolve?.();
          this.emitTelemetry("ok");
        });
        n.addEventListener("message", o => {
          let s = typeof o.data === "string" ? o.data : "";
          if (s.indexOf(`
`) === -1) {
            if (s) {
              this.partialChunks.push(s);
            }
            return;
          }
          let i = this.partialChunks.join("") + s;
          this.partialChunks.length = 0;
          let a = i.split(`
`);
          let l = a.pop() ?? "";
          if (l) {
            this.partialChunks.push(l);
          }
          for (let c of a) {
            if (!c) {
              continue;
            }
            let u;
            try {
              u = qt(c);
            } catch (d) {
              $5(`DirectConnect: dropped malformed JSON line (${c.length} bytes): ${d}`);
              continue;
            }
            this.messages.enqueue(u);
          }
        });
        n.addEventListener("error", () => {
          clearTimeout(r);
          let o = new DirectConnectError("WebSocket connection error");
          if (this.exitError = o, this.readyReject?.(o), this.messages.done(), !this.readyState) {
            this.emitTelemetry("bad", "ws_error");
          }
        });
        n.addEventListener("close", o => {
          let s = this.readyState;
          this.readyState = false;
          this.closed = true;
          let i = o.code !== 1000 && o.code !== 1001;
          if (i && !this.exitError) {
            this.exitError = new DirectConnectError(`WebSocket closed abnormally: ${o.code} ${o.reason}`);
          }
          if (this.messages.done(), s && i && !this.abortController.signal.aborted) {
            this.emitTelemetry("sad", "ws_closed_abnormally");
          }
        });
      }
      emitTelemetry(e, t) {
        if (this.telemetryEmitted) {
          return;
        }
        if (this.telemetryEmitted = true, e === "ok") {
          Pe("transport_direct_connect");
        } else if (e === "bad") {
          Ae("transport_direct_connect", t ?? "unknown");
        } else {
          Et("transport_direct_connect", t ?? "unknown");
        }
      }
      failInit(e) {
        this.exitError = e;
        this.closed = true;
        this.readyReject?.(e);
        this.messages.done();
      }
      async write(e) {
        if (this.abortController.signal.aborted) {
          throw new AbortError("Operation aborted");
        }
        if (!this.readyState) {
          await this.readyPromise;
        }
        if (!this.ws || this.ws.readyState !== WebSocket.OPEN) {
          throw new DirectConnectError("Transport is not ready for writing");
        }
        this.ws.send(e);
      }
      isReady() {
        return this.readyState && this.ws?.readyState === WebSocket.OPEN;
      }
      endInput() {}
      [Symbol.dispose]() {
        this.close();
      }
      close() {
        if (this.closed) {
          return;
        }
        if (this.closed = true, this.readyState = false, this.abortHandler) {
          this.abortController.signal.removeEventListener("abort", this.abortHandler);
          this.abortHandler = undefined;
        }
        if (!this.abortController.signal.aborted) {
          this.abortController.abort();
        }
        if (this.ws && this.ws.readyState === WebSocket.OPEN) {
          this.ws.close(1000, "Normal closure");
        }
        if (this.messages.done(), this.options.deleteSessionOnClose && this.sessionId) {
          Dcc(this.options.serverUrl, this.sessionId, this.options.authToken);
        }
      }
      async *readMessages() {
        if (yield* this.messages, this.exitError) {
          throw this.exitError;
        }
      }
    };
  });
  function filterEscalatingDefaultMode(e) {
    let t = e.effective.permissions?.defaultMode;
    if (!t || !haf.vZc(t)) {
      return e.effective;
    }
    for (let n = e.sources.length - 1; n >= 0; n--) {
      let r = e.sources[n];
      if (r.settings.permissions?.defaultMode !== undefined) {
        if (gaf.vZc(r.source)) {
          let {
            defaultMode: o,
            ...s
          } = e.effective.permissions ?? {};
          return {
            ...e.effective,
            permissions: s
          };
        }
        return e.effective;
      }
    }
    return e.effective;
  }
  async function Bcc(e = {}) {
    await Vnt();
    let t = {
      cwd: Fcc.resolve(e.cwd ?? zt().cwd()),
      allowedSources: (e.settingSources ?? faf).map(n => maf[n]),
      parentManaged: e.managedSettings ?? null,
      flagInline: null,
      flagPath: undefined,
      mdm: Cle,
      hkcu: zke,
      wslInherits: Gte,
      ...(e.serverManagedSettings !== undefined && {
        remote: () => e.serverManagedSettings
      })
    };
    try {
      let {
        effective: n,
        sources: r
      } = GOs(t);
      let o = Byn(t) ?? undefined;
      let s = r.map(({
        source: a,
        settings: l
      }) => ({
        source: Lcc[a],
        settings: l,
        path: a === "policySettings" ? undefined : Wke(a, t),
        ...(a === "policySettings" && {
          policyOrigin: o
        })
      }));
      let i = {};
      for (let a of Object.keys(n)) {
        let l = VOs(a, t);
        if (l) {
          i[a] = {
            source: Lcc[l],
            path: l === "policySettings" ? undefined : Wke(l, t),
            ...(l === "policySettings" && {
              policyOrigin: o
            })
          };
        }
      }
      return {
        effective: n,
        provenance: i,
        sources: s
      };
    } finally {
      o_();
    }
  }
  var Fcc;
  var maf;
  var Lcc;
  var faf;
  var haf;
  var gaf;
  var $cc = __lazy(() => {
    Kke();
    DA();
    Gke();
    Fcc = require("path");
    maf = {
      user: "userSettings",
      project: "projectSettings",
      local: "localSettings"
    };
    Lcc = {
      userSettings: "user",
      projectSettings: "project",
      localSettings: "local",
      flagSettings: "flag",
      policySettings: "managed"
    };
    faf = ["user", "project", "local"];
    haf = new Set(["bypassPermissions", "auto", "acceptEdits"]);
    gaf = new Set(["project"]);
  });
  var euc = {};
  __export(euc, {
    tool: () => tool,
    tagSession: () => tagSession,
    startup: () => startup,
    resolveSettings: () => resolveSettings,
    renameSession: () => renameSession,
    query: () => query,
    parseDirectConnectUrl: () => parseDirectConnectUrl,
    listSubagents: () => listSubagents,
    listSessions: () => listSessions,
    importSessionToStore: () => importSessionToStore,
    getSubagentMessages: () => getSubagentMessages,
    getSessionMessages: () => getSessionMessages,
    getSessionInfo: () => getSessionInfo,
    forkSession: () => forkSession,
    foldSessionSummary: () => foldSessionSummary,
    filterEscalatingDefaultMode: () => filterEscalatingDefaultMode,
    deleteSession: () => deleteSession,
    createSdkMcpServer: () => createSdkMcpServer,
    SYSTEM_PROMPT_DYNAMIC_BOUNDARY: () => "__SYSTEM_PROMPT_DYNAMIC_BOUNDARY__",
    InMemorySessionStore: () => InMemorySessionStore,
    HOOK_EVENTS: () => HOOK_EVENTS,
    EXIT_REASONS: () => EXIT_REASONS,
    DirectConnectTransport: () => DirectConnectTransport,
    DirectConnectError: () => DirectConnectError,
    AbortError: () => AbortError
  });
  async function resolveSettings(e) {
    return Bcc(e);
  }
  async function _af(e, t) {
    try {
      await xH.copyFile(e, t);
    } catch (n) {
      if (!fn(n)) {
        throw n;
      }
    }
  }
  async function baf(e, t) {
    if (!e) {
      return;
    }
    let n = e;
    try {
      let r = qt(e);
      if (r?.claudeAiOauth?.refreshToken) {
        delete r.claudeAiOauth.refreshToken;
        n = De(r);
      }
    } catch {}
    await xH.writeFile(t, n, {
      mode: 384
    });
  }
  function Saf() {
    return Promise.resolve(undefined);
  }
  async function Ycc(e, t, n, r, o = 60000) {
    if (!QS(t)) {
      return;
    }
    let s = fee(n);
    let i = await withTimeout(e.load({
      projectKey: s,
      sessionId: t
    }), o, `SessionStore.load() timed out after ${o}ms for session ${t}`);
    if (!i || i.length === 0) {
      return;
    }
    let a = k_.join(qCt.tmpdir(), `claude-resume-${wdr.randomUUID()}`);
    try {
      let l = k_.join(a, "projects", s);
      await xH.mkdir(l, {
        recursive: true
      });
      let c = k_.join(l, `${t}.jsonl`);
      await Rye(c, i);
      let u = r?.CLAUDE_CONFIG_DIR ?? process.env.CLAUDE_CONFIG_DIR;
      let d = u ?? k_.join(qCt.homedir(), ".claude");
      let p;
      try {
        p = await xH.readFile(k_.join(d, ".credentials.json"), "utf-8");
      } catch (m) {
        if (!fn(m)) {
          throw m;
        }
      }
      if (!u && !(r ?? process.env).ANTHROPIC_API_KEY && !(r ?? process.env).CLAUDE_CODE_OAUTH_TOKEN) {
        p = (await Saf()) ?? p;
      }
      if (await baf(p, k_.join(a, ".credentials.json")), await _af(k_.join(u ?? qCt.homedir(), ".claude.json"), k_.join(a, ".claude.json")), e.listSubkeys) {
        let m = k_.join(l, t);
        let f = await withTimeout(e.listSubkeys({
          projectKey: s,
          sessionId: t
        }), o, `SessionStore.listSubkeys() timed out after ${o}ms for session ${t}`);
        for (let h of f) {
          let g = k_.resolve(m, h + ".jsonl");
          if (!h || k_.isAbsolute(h) || h.split(/[\\/]/).includes("..") || !g.startsWith(m + k_.sep)) {
            logForDebugging(`[SessionStore] skipping unsafe subpath from listSubkeys: ${h}`, {
              level: "warn"
            });
            continue;
          }
          let y = await withTimeout(e.load({
            projectKey: s,
            sessionId: t,
            subpath: h
          }), o, `SessionStore.load() timed out after ${o}ms for session ${t} subpath ${h}`);
          if (!y || y.length === 0) {
            continue;
          }
          let _ = [];
          let b = [];
          for (let S of y) {
            if (R8o(S)) {
              _.push(S);
            } else {
              b.push(S);
            }
          }
          if (b.length > 0) {
            await xH.mkdir(k_.dirname(g), {
              recursive: true
            });
            await Rye(g, b);
          }
          if (_.length > 0) {
            let S = _.at(-1);
            let E = k_.resolve(m, h + ".meta.json");
            await xH.mkdir(k_.dirname(E), {
              recursive: true
            });
            let {
              type: C,
              ...x
            } = S;
            await xH.writeFile(E, De(x), {
              mode: 384
            });
          }
        }
      }
      return a;
    } catch (l) {
      throw await vdr(a), l;
    }
  }
  function w8o(e, t, n, r) {
    let {
      systemPrompt: o,
      settings: s,
      managedSettings: i,
      settingSources: a,
      sandbox: l,
      ...c
    } = e ?? {};
    let u;
    let d;
    let p;
    if (o === undefined) {
      u = "";
    } else if (typeof o === "string") {
      u = o;
    } else if (Array.isArray(o)) {
      u = o;
    } else if (o.type === "preset") {
      d = o.append;
      p = o.excludeDynamicSections;
    }
    process.env.CLAUDE_AGENT_SDK_VERSION = process.env.CLAUDE_AGENT_SDK_VERSION ?? "unknown";
    let {
      abortController: m = createAbortController(),
      additionalDirectories: f = [],
      agent: h,
      agents: g,
      allowedTools: y = [],
      betas: _,
      canUseTool: b,
      continue: S,
      cwd: E,
      debug: C,
      debugFile: x,
      disallowedTools: A = [],
      tools: k,
      env: I,
      executable: O = X4() ? "bun" : "node",
      executableArgs: M = [],
      extraArgs: L = {},
      fallbackModel: P,
      enableFileCheckpointing: F,
      toolConfig: H,
      forkSession: U,
      hooks: N,
      includeHookEvents: W,
      includePartialMessages: j,
      forwardSubagentText: z,
      onElicitation: V,
      onUserDialog: K,
      supportedDialogKinds: J,
      persistSession: Q,
      sessionStore: Z,
      sessionStoreFlush: ne,
      thinking: oe,
      effort: ee,
      maxThinkingTokens: re,
      maxTurns: se,
      maxBudgetUsd: ae,
      taskBudget: de,
      mcpServers: be,
      model: fe,
      outputFormat: me,
      permissionMode: Te = "default",
      allowDangerouslySkipPermissions: ue = false,
      permissionPromptToolName: ce,
      plugins: le,
      getOAuthToken: pe,
      getHostAuthToken: ve,
      workload: _e,
      resume: xe,
      resumeSessionAt: ke,
      sessionId: Ie,
      skills: Ue,
      stderr: Ge,
      strictMcpConfig: Be
    } = c;
    if (Z && Q === false) {
      throw Error("sessionStore cannot be used with persistSession: false -- the storage adapter requires local writes to mirror from. Use CLAUDE_CONFIG_DIR=/tmp for ephemeral local writes with external mirroring.");
    }
    if (J !== undefined && J.length > 0 && !K) {
      throw Error("supportedDialogKinds requires an onUserDialog callback -- declaring dialog kinds without a handler would park dialogs nothing can answer. Provide onUserDialog, or omit supportedDialogKinds.");
    }
    if (Z && S && !xe && !Z.listSessions) {
      throw Error("Options.continue with sessionStore requires store.listSessions to be implemented");
    }
    if (Z && F) {
      throw Error("enableFileCheckpointing is not yet supported with sessionStore (backup blobs are not mirrored, so rewindFiles() fails after a store-backed resume).");
    }
    if (Z && c.spawnClaudeCodeProcess) {
      logForDebugging("sessionStore with custom spawnClaudeCodeProcess: ensure the subprocess CLAUDE_CONFIG_DIR matches the parent (same path, same separators) or transcript_mirror frames will be dropped.", {
        level: "warn"
      });
    }
    _cc(!!b, Te, y);
    let We = c.pathToClaudeCodeExecutable;
    if (!We) {
      let yt = Kcc.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/src/entrypoints/agentSdk.ts");
      let gt = Vcc.createRequire(yt);
      let Ft = Glc(on => gt.resolve(on));
      if (!Ft) {
        throw Error("Native CLI binary for linux-arm64 not found. Reinstall @anthropic-ai/claude-agent-sdk without --omit=optional, or set options.pathToClaudeCodeExecutable.");
      }
      We = Ft;
    }
    let Ze = me?.type === "json_schema" ? me.schema : undefined;
    let Tt = I ? {
      ...I
    } : {
      ...process.env
    };
    if (!Tt.CLAUDE_CODE_ENTRYPOINT) {
      Tt.CLAUDE_CODE_ENTRYPOINT = "sdk-ts";
    }
    if (!Tt.CLAUDE_AGENT_SDK_VERSION) {
      Tt.CLAUDE_AGENT_SDK_VERSION = process.env.CLAUDE_AGENT_SDK_VERSION;
    }
    if (F) {
      Tt.CLAUDE_CODE_ENABLE_SDK_FILE_CHECKPOINTING = "true";
    }
    if (pe) {
      Tt.CLAUDE_CODE_SDK_HAS_OAUTH_REFRESH = "1";
    }
    if (ve) {
      Tt.CLAUDE_CODE_SDK_HAS_HOST_AUTH_REFRESH = "1";
    }
    if (H?.askUserQuestion?.previewFormat) {
      Tt.CLAUDE_CODE_QUESTION_PREVIEW_FORMAT = H.askUserQuestion.previewFormat;
    }
    let kt = {};
    if (Rdr.propagation.inject(Rdr.context.active(), kt), "traceparent" in kt) {
      for (let yt of ["TRACEPARENT", "TRACESTATE"]) {
        if (!(yt in (I ?? {}))) {
          delete Tt[yt];
        }
      }
    }
    for (let [yt, gt] of Object.entries(kt)) {
      let Ft = yt.toUpperCase();
      if (!(Ft in (I ?? {}))) {
        Tt[Ft] = gt;
      }
    }
    let Ye = {};
    let ht = new Map();
    if (be) {
      for (let [yt, gt] of Object.entries(be)) {
        if (gt.type === "sdk" && gt.instance) {
          ht.set(yt, gt.instance);
        } else {
          Ye[yt] = gt;
        }
      }
    }
    let It;
    if (oe) {
      switch (oe.type) {
        case "adaptive":
          It = {
            type: "adaptive",
            display: oe.display
          };
          break;
        case "enabled":
          It = {
            type: "enabled",
            budgetTokens: oe.budgetTokens,
            display: oe.display
          };
          break;
        case "disabled":
          It = {
            type: "disabled"
          };
          break;
      }
    } else if (re !== undefined) {
      It = re === 0 ? {
        type: "disabled"
      } : {
        type: "enabled",
        budgetTokens: re
      };
    }
    if (n) {
      Tt.CLAUDE_CONFIG_DIR = n;
    }
    let Rt = new l8o({
      abortController: m,
      additionalDirectories: f,
      agent: h,
      betas: _,
      cwd: E,
      debug: C,
      debugFile: x,
      executable: O,
      executableArgs: M,
      extraArgs: _e ? {
        ...L,
        workload: _e
      } : L,
      pathToClaudeCodeExecutable: We,
      env: Tt,
      forkSession: U,
      stderr: Ge,
      thinkingConfig: It,
      effort: ee,
      maxTurns: se,
      maxBudgetUsd: ae,
      taskBudget: de,
      model: fe,
      fallbackModel: P,
      jsonSchema: Ze,
      permissionMode: Te,
      allowDangerouslySkipPermissions: ue,
      permissionPromptToolName: ce,
      continueConversation: Z ? undefined : S,
      resume: xe,
      resumeSessionAt: ke,
      sessionId: Ie,
      settings: typeof s === "object" ? De(s) : s,
      managedSettings: i ? De(i) : undefined,
      settingSources: a,
      skills: Ue,
      allowedTools: y,
      disallowedTools: A,
      tools: k,
      mcpServers: Ye,
      strictMcpConfig: Be,
      canUseTool: !!b,
      hooks: !!N,
      includeHookEvents: W,
      includePartialMessages: j,
      persistSession: Q,
      sessionMirror: !!Z,
      plugins: le,
      sandbox: l,
      spawnClaudeCodeProcess: c.spawnClaudeCodeProcess,
      deferSpawn: r
    });
    let wt = {
      systemPrompt: u,
      appendSystemPrompt: d,
      planModeInstructions: c.planModeInstructions,
      appendSubagentSystemPrompt: c.appendSubagentSystemPrompt,
      toolAliases: c.toolAliases,
      excludeDynamicSections: p,
      agents: g,
      title: c.title,
      skills: Ue,
      webSearchIsolationExemptMcpServers: c.webSearchIsolationExemptMcpServers,
      promptSuggestions: c.promptSuggestions,
      agentProgressSummaries: c.agentProgressSummaries,
      forwardSubagentText: z,
      supportedDialogKinds: J
    };
    let vt = new c8o(Rt, t, b, N, m, ht, Ze, wt, V, pe, ve, K);
    if (Z) {
      let yt = () => k_.join(Tt.CLAUDE_CONFIG_DIR ?? k_.join(qCt.homedir(), ".claude"), "projects");
      let gt = ne === "eager";
      let Ft = new u8o(async (on, rn) => {
        let Sn = Wcc(on, yt());
        if (Sn) {
          await Z.append(Sn, rn);
        } else {
          logForDebugging(`[SessionStore] dropping mirror frame: filePath ${on} is not under ${yt()} -- subprocess CLAUDE_CONFIG_DIR likely differs from parent (custom spawnClaudeCodeProcess / container?)`, {
            level: "warn"
          });
        }
      }, undefined, (on, rn) => {
        let Sn = Wcc(on, yt());
        if (Sn) {
          vt.reportMirrorError(Sn, rn.message);
        }
      }, gt ? 0 : 500, gt ? 0 : 1048576);
      vt.setTranscriptMirrorBatcher(Ft);
    }
    return {
      queryInstance: vt,
      transport: Rt,
      abortController: m,
      processEnv: Tt
    };
  }
  function C8o(e, t, n, r) {
    if (typeof n === "string") {
      t.write(De({
        type: "user",
        session_id: "",
        message: {
          role: "user",
          content: [{
            type: "text",
            text: n
          }]
        },
        parent_tool_use_id: null
      }) + `
`);
    } else {
      e.streamInput(n).catch(o => r.abort(o));
    }
  }
  async function vdr(e) {
    for (let t = 0;; t++) {
      try {
        return await xH.rm(e, {
          recursive: true,
          force: true
        });
      } catch (n) {
        if (t >= 4 || !Taf.vZc(en(n) ?? "")) {
          return;
        }
        await sleep((t + 1) * 100);
      }
    }
  }
  function Eaf(e, t) {
    e.waitForExit().catch(() => {}).finally(() => vdr(t));
  }
  function query({
    prompt: e,
    options: t
  }) {
    if ((t?.resume || t?.continue) && t?.sessionStore) {
      let {
        queryInstance: s,
        transport: i,
        abortController: a,
        processEnv: l
      } = w8o({
        ...t
      }, typeof e === "string", undefined, true);
      let c = k_.resolve(t.cwd ?? ".");
      let u = t.sessionStore;
      let d = t.loadTimeoutMs ?? 60000;
      let p = t.resume;
      (async () => {
        if (!p) {
          p = (await withTimeout(u.listSessions(fee(c)), d, `SessionStore.listSessions() timed out after ${d}ms`)).slice().sort((h, g) => g.mtime - h.mtime)[0]?.sessionId;
        }
        if (!p) {
          return;
        }
        return Ycc(u, p, c, t.env, t.loadTimeoutMs);
      })().then(f => {
        if (f) {
          i.updateResume(p);
          let h = {
            CLAUDE_CONFIG_DIR: f
          };
          i.updateEnv(h);
          l.CLAUDE_CONFIG_DIR = f;
          s.addCleanupCallback(() => Eaf(i, f));
        }
        if (!s.isClosed()) {
          i.spawn();
        }
      }).catch(f => {
        let h = sr(f);
        i.spawnAbort(h);
        s.setError(h);
      });
      C8o(s, i, e, a);
      return s;
    }
    let {
      queryInstance: n,
      transport: r,
      abortController: o
    } = w8o(t, typeof e === "string");
    C8o(n, r, e, o);
    return n;
  }
  async function startup({
    options: e,
    initializeTimeoutMs: t = 60000
  } = {}) {
    let n;
    let r = e?.resume;
    if ((r || e?.continue) && e?.sessionStore) {
      let a = k_.resolve(e.cwd ?? ".");
      if (!r) {
        if (!e.sessionStore.listSessions) {
          throw Error("Options.continue with sessionStore requires store.listSessions to be implemented");
        }
        let l = e.loadTimeoutMs ?? 60000;
        r = (await withTimeout(e.sessionStore.listSessions(fee(a)), l, `SessionStore.listSessions() timed out after ${l}ms`)).slice().sort((u, d) => d.mtime - u.mtime)[0]?.sessionId;
      }
      if (r) {
        n = await Ycc(e.sessionStore, r, a, e.env, e.loadTimeoutMs);
      }
    }
    let o;
    let s;
    let i;
    try {
      let p = function () {
        if (d) {
          return;
        }
        d = true;
        u.close();
      };
      let a = w8o(n && r && r !== e?.resume ? {
        ...e,
        resume: r
      } : e, false, n);
      o = a.queryInstance;
      let {
        transport: l,
        abortController: c
      } = a;
      s = l;
      let u = a.queryInstance;
      if (n) {
        let m = n;
        u.addCleanupCallback(() => {
          i = l.waitForExit().catch(() => {}).then(() => vdr(m));
        });
      }
      await withTimeout(u.initializationResult(), t, `Subprocess initialization did not complete within ${t}ms \u2014 check authentication and network connectivity`);
      let d = false;
      return {
        query(m) {
          if (d) {
            throw Error("WarmQuery.query() can only be called once");
          }
          d = true;
          try {
            C8o(u, l, m, c);
          } catch (f) {
            throw u.close(), f;
          }
          if (typeof m === "string") {
            u.setIsSingleUserTurn(true);
          }
          return u;
        },
        close: p,
        async [Symbol.asyncDispose]() {
          d = true;
          u.close();
          await i;
        }
      };
    } catch (a) {
      if (o?.close(), n && !i) {
        let l = s;
        i = (l ? l.waitForExit().catch(() => {}) : Promise.resolve()).then(() => vdr(n));
      }
      throw await i, a;
    }
  }
  async function getSessionMessages(e, t) {
    if (t?.sessionStore) {
      return Uaf(t.sessionStore, e, t);
    }
    return tcc(e, t);
  }
  async function listSessions(e) {
    if (e?.sessionStore) {
      return Laf(e.sessionStore, e);
    }
    return nIl(e);
  }
  async function getSessionInfo(e, t) {
    if (t?.sessionStore) {
      return Baf(t.sessionStore, e, t);
    }
    return ncc(e, t);
  }
  async function renameSession(e, t, n) {
    if (n?.sessionStore) {
      return $af(n.sessionStore, e, t, n.dir);
    }
    return occ(e, t, n);
  }
  async function tagSession(e, t, n) {
    if (n?.sessionStore) {
      return Haf(n.sessionStore, e, t, n.dir);
    }
    return scc(e, t, n);
  }
  async function deleteSession(e, t) {
    if (!QS(e)) {
      throw new Po(`Invalid sessionId: ${e}`, "deleteSession: invalid sessionId (must be a UUID)");
    }
    if (t?.sessionStore) {
      if (!t.sessionStore.delete) {
        return;
      }
      let n = fee(t.dir);
      await t.sessionStore.delete({
        projectKey: n,
        sessionId: e
      });
      return;
    }
    return icc(e, t);
  }
  async function forkSession(e, t) {
    if (t?.sessionStore) {
      return jaf(t.sessionStore, e, t);
    }
    return ccc(e, t);
  }
  async function importSessionToStore(e, t, n) {
    if (!QS(e)) {
      throw new Po(`Invalid sessionId: ${e}`, "importSessionToStore: invalid sessionId (must be a UUID)");
    }
    let r = await gke(e, n?.dir);
    if (!r) {
      throw Error(`Session ${e} not found`);
    }
    let o = fee(n?.dir);
    let s = n?.batchSize && n.batchSize > 0 ? n.batchSize : 500;
    if (await Hcc(r.filePath, {
      projectKey: o,
      sessionId: e
    }, t, s), n?.includeSubagents === false) {
      return;
    }
    let i = r.filePath.replace(/\.jsonl$/, "");
    let a = k_.join(i, "subagents");
    for (let l of await Daf(a)) {
      let c = k_.relative(i, l).split(k_.sep);
      c[c.length - 1] = c.at(-1).replace(/\.jsonl$/, "");
      let u = {
        projectKey: o,
        sessionId: e,
        subpath: c.join("/")
      };
      await Hcc(l, u, t, s);
      let d = l.replace(/\.jsonl$/, ".meta.json");
      try {
        let p = qt(await xH.readFile(d, "utf8"));
        await t.append(u, [{
          type: "agent_metadata",
          ...p
        }]);
      } catch (p) {
        if (!fn(p)) {
          throw p;
        }
      }
    }
  }
  async function Hcc(e, t, n, r) {
    let o = zcc.createInterface({
      input: Cdr.createReadStream(e, {
        encoding: "utf8"
      }),
      crlfDelay: 1 / 0
    });
    let s = [];
    let i = 0;
    for await (let a of o) {
      if (!a) {
        continue;
      }
      if (s.push(qt(a)), i += a.length, s.length >= r || i >= 1048576) {
        await n.append(t, s);
        s = [];
        i = 0;
      }
    }
    if (s.length > 0) {
      await n.append(t, s);
    }
  }
  async function Daf(e) {
    let t = [];
    async function n(r) {
      let o;
      try {
        o = await xH.readdir(r, {
          withFileTypes: true
        });
      } catch {
        return;
      }
      for (let s of o) {
        let i = k_.join(r, s.name);
        if (s.isDirectory()) {
          await n(i);
        } else if (s.isFile() && s.name.endsWith(".jsonl")) {
          t.push(i);
        }
      }
    }
    await n(e);
    return t;
  }
  async function listSubagents(e, t) {
    if (t?.sessionStore) {
      return qaf(t.sessionStore, e, t.dir);
    }
    return hcc(e, t);
  }
  async function getSubagentMessages(e, t, n) {
    if (n?.sessionStore) {
      return Waf(n.sessionStore, e, t, n);
    }
    return gcc(e, t, n);
  }
  function Jcc(e) {
    let t = k_.resolve(e ?? ".");
    let n;
    try {
      n = Cdr.realpathSync(t);
    } catch {
      n = t;
    }
    return n;
  }
  function fee(e) {
    return $T(Jcc(e));
  }
  function Xcc(e) {
    return e.map(t => De(t)).join(`
`) + `
`;
  }
  function jcc(e, t, n) {
    if (t !== undefined && t > 0) {
      return e.slice(n, n + t);
    }
    if (n > 0) {
      return e.slice(n);
    }
    return e;
  }
  function R8o(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "agent_metadata";
  }
  async function Laf(e, t) {
    let n = Jcc(t.dir);
    let r = $T(n);
    let o = t.offset ?? 0;
    let s = t.limit;
    if (e.listSessionSummaries) {
      let c = await e.listSessionSummaries(r);
      let u = e.listSessions ? new Map((await e.listSessions(r)).map(f => [f.sessionId, f])) : undefined;
      let d = [];
      for (let f of c) {
        let h = u?.get(f.sessionId);
        if (u && !h) {
          continue;
        }
        let g = h !== undefined && f.mtime < h.mtime;
        d.push({
          sessionId: f.sessionId,
          mtime: g ? h.mtime : f.mtime,
          info: g ? undefined : ZPs(f, n)
        });
      }
      if (u) {
        let f = new Set(c.map(h => h.sessionId));
        for (let [h, g] of u) {
          if (!f.vZc(h)) {
            d.push({
              sessionId: h,
              mtime: g.mtime
            });
          }
        }
      } else {
        logForDebugging("listSessionSummaries without listSessions: gap-fill skipped; sessions lacking a sidecar will be omitted");
      }
      d.sort((f, h) => h.mtime - f.mtime);
      let p = jcc(d, s, o);
      let m = p.filter(f => f.info === undefined);
      if (m.length > 0) {
        let f = await qcc(e, m, t.dir, n);
        let h = new Map(f.map(g => [g.sessionId, g]));
        for (let g of p) {
          if (g.info === undefined) {
            g.info = h.get(g.sessionId) ?? null;
          }
        }
      }
      return p.flatMap(f => f.info ? [f.info] : []);
    }
    if (!e.listSessions) {
      throw Error("sessionStore.listSessions is not implemented -- cannot list sessions. Provide a store with a listSessions() method.");
    }
    let a = (await e.listSessions(r)).slice().sort((c, u) => u.mtime - c.mtime);
    let l = jcc(a, s, o);
    return qcc(e, l, t.dir, n);
  }
  async function qcc(e, t, n, r) {
    return (await Promise.allSettled(t.map(async s => {
      let i = await Zcc(e, s.sessionId, n);
      if (!i) {
        return null;
      }
      let a = oEt(s.sessionId, Qcc(i, s.mtime), r);
      return a ? {
        ...a,
        lastModified: s.mtime
      } : null;
    }))).flatMap((s, i) => {
      let a = t[i];
      if (s.status === "fulfilled") {
        return s.value ? [s.value] : [];
      }
      return [{
        sessionId: a.sessionId,
        summary: "",
        lastModified: a.mtime
      }];
    });
  }
  function Qcc(e, t) {
    let n = Buffer.from(e, "utf-8");
    let r = n.length;
    let o = n.subarray(0, 65536).toString("utf-8");
    let s = r > 65536 ? n.subarray(r - 65536).toString("utf-8") : o;
    return {
      mtime: t,
      size: r,
      head: o,
      tail: s
    };
  }
  function Faf(e) {
    let t = e.trimEnd();
    let n = t.slice(t.lastIndexOf(`
`) + 1);
    try {
      let r = qt(n);
      if (typeof r === "object" && r !== null && "timestamp" in r && typeof r.timestamp === "string") {
        let o = Date.parse(r.timestamp);
        if (!Number.isNaN(o)) {
          return o;
        }
      }
    } catch {}
    return Date.now();
  }
  async function Zcc(e, t, n) {
    let r = fee(n);
    let o = await e.load({
      projectKey: r,
      sessionId: t
    });
    if (!o || o.length === 0) {
      return null;
    }
    return Xcc(o);
  }
  async function Uaf(e, t, n) {
    if (!QS(t)) {
      return [];
    }
    let r = fee(n.dir);
    let o = await e.load({
      projectKey: r,
      sessionId: t
    });
    if (!o || o.length === 0) {
      return [];
    }
    return Zlc(o, {
      limit: n.limit,
      offset: n.offset,
      includeSystemMessages: n.includeSystemMessages
    });
  }
  async function Baf(e, t, n) {
    if (!QS(t)) {
      return;
    }
    let r = await Zcc(e, t, n.dir);
    if (!r) {
      return;
    }
    let o = Qcc(r, Faf(r));
    return oEt(t, o) ?? undefined;
  }
  async function $af(e, t, n, r) {
    if (!QS(t)) {
      throw new Po(`Invalid sessionId: ${t}`, "renameSession: invalid sessionId (must be a UUID)");
    }
    if (!n.trim()) {
      throw Error("title must be non-empty");
    }
    let o = fee(r);
    await e.append({
      projectKey: o,
      sessionId: t
    }, [{
      type: "custom-title",
      customTitle: n.trim(),
      sessionId: t,
      uuid: wdr.randomUUID(),
      timestamp: new Date().toISOString()
    }]);
  }
  async function Haf(e, t, n, r) {
    if (!QS(t)) {
      throw new Po(`Invalid sessionId: ${t}`, "tagSession: invalid sessionId (must be a UUID)");
    }
    if (n !== null) {
      let s = m3(n).trim();
      if (!s) {
        throw Error("tag must be non-empty (use null to clear)");
      }
      n = s;
    }
    let o = fee(r);
    await e.append({
      projectKey: o,
      sessionId: t
    }, [{
      type: "tag",
      tag: n ?? "",
      sessionId: t,
      uuid: wdr.randomUUID(),
      timestamp: new Date().toISOString()
    }]);
  }
  async function jaf(e, t, n) {
    if (!QS(t)) {
      throw new Po(`Invalid sessionId: ${t}`, "forkSession: invalid sessionId (must be a UUID)");
    }
    if (n.upToMessageId && !QS(n.upToMessageId)) {
      throw new Po(`Invalid upToMessageId: ${n.upToMessageId}`, "forkSession: invalid upToMessageId (must be a UUID)");
    }
    let r = fee(n.dir);
    let o = await e.load({
      projectKey: r,
      sessionId: t
    });
    if (!o || o.length === 0) {
      throw Error(`Session ${t} not found`);
    }
    let {
      entries: s,
      forkedSessionId: i
    } = ucc(o, t, n);
    await e.append({
      projectKey: r,
      sessionId: i
    }, s);
    return {
      sessionId: i
    };
  }
  async function qaf(e, t, n) {
    if (!QS(t)) {
      return [];
    }
    if (!e.listSubkeys) {
      throw Error("sessionStore.listSubkeys is not implemented -- cannot list subagents. Provide a store with a listSubkeys() method.");
    }
    let r = fee(n);
    let o = await e.listSubkeys({
      projectKey: r,
      sessionId: t
    });
    let s = new Set();
    for (let i of o) {
      if (!i.startsWith("subagents/")) {
        continue;
      }
      let a = i.split("/").at(-1);
      if (a.startsWith("agent-")) {
        s.add(a.slice(6));
      }
    }
    return [...s];
  }
  async function Waf(e, t, n, r) {
    if (!QS(t)) {
      return [];
    }
    if (!n) {
      return [];
    }
    let o = fee(r.dir);
    let s = `subagents/agent-${n}`;
    if (e.listSubkeys) {
      let u = await e.listSubkeys({
        projectKey: o,
        sessionId: t
      });
      let d = `agent-${n}`;
      let p = u.find(m => m.startsWith("subagents/") && m.split("/").at(-1) === d);
      if (!p) {
        return [];
      }
      s = p;
    }
    let i = await e.load({
      projectKey: o,
      sessionId: t,
      subpath: s
    });
    if (!i || i.length === 0) {
      return [];
    }
    let a = i.findLast(R8o);
    let l = typeof a?.toolUseId === "string" ? a.toolUseId : undefined;
    let c = i.filter(u => !R8o(u));
    if (c.length === 0) {
      return [];
    }
    return y8o(Buffer.from(Xcc(c)), {
      limit: r.limit,
      offset: r.offset
    }, l);
  }
  function Wcc(e, t) {
    let n = k_.relative(t, e);
    let r = n.split(k_.sep);
    if (r[0] === ".." || k_.isAbsolute(n)) {
      return null;
    }
    if (r.length < 2) {
      return null;
    }
    let o = r[0];
    let s = r[1];
    if (r.length === 2 && s.endsWith(".jsonl")) {
      return {
        projectKey: o,
        sessionId: s.replace(/\.jsonl$/, "")
      };
    }
    if (r.length >= 4) {
      let i = r.slice(2);
      let a = i.length - 1;
      i[a] = i.at(-1).replace(/\.jsonl$/, "");
      return {
        projectKey: o,
        sessionId: s,
        subpath: i.join("/")
      };
    }
    return null;
  }
  var Gcc;
  var wdr;
  var Cdr;
  var xH;
  var Vcc;
  var qCt;
  var k_;
  var zcc;
  var Kcc;
  var Rdr;
  var Taf;
  var tuc = __lazy(() => {
    Kp();
    mm();
    qlc();
    Vlc();
    Klc();
    Ylc();
    dNe();
    f8o();
    Btr();
    rcc();
    g8o();
    pcc();
    ycc();
    je();
    dt();
    o8();
    ZS();
    PMt();
    Pcc();
    qte();
    O1r();
    PMt();
    Ncc();
    $cc();
    Gcc = require("child_process");
    wdr = require("crypto");
    Cdr = require("fs");
    xH = require("fs/promises");
    Vcc = require("module");
    qCt = require("os");
    k_ = require("path");
    zcc = require("readline");
    Kcc = require("url");
    Rdr = __toESM(Ji(), 1);
    process.env.NoDefaultCurrentDirectoryInExePath = "1";
    Taf = new Set(["EBUSY", "EMFILE", "ENFILE", "ENOTEMPTY", "EPERM"]);
  });
  function suc() {
    return ruc.join(er(), "daemon.scheduled.status.json");
  }
  async function Vaf(e) {
    let t = {
      workerPid: process.pid,
      workerProcStart: ownProcStart(),
      writtenAt: Date.now(),
      tasks: e
    };
    try {
      await Fm(suc(), De(t));
    } catch {}
  }
  async function iuc() {
    let e;
    try {
      e = await nuc.readFile(suc(), "utf8");
    } catch {
      return null;
    }
    let t = Ba(e, false);
    if (!t || typeof t !== "object") {
      return null;
    }
    let n = t;
    if (typeof n.workerPid !== "number" || typeof n.tasks !== "object" || n.tasks === null) {
      return null;
    }
    try {
      process.kill(n.workerPid, 0);
    } catch {
      return null;
    }
    if (!(await isSameProcessAsync(n.workerPid, n.workerProcStart))) {
      return null;
    }
    return t;
  }
  function A8o(e) {
    let t = e.scheduled;
    let n = {};
    if (Array.isArray(t) && t.length > 0 && typeof t[0] === "object") {
      n = t[0] ?? {};
    } else if (t && typeof t === "object" && !Array.isArray(t)) {
      n = t;
    }
    let r = Array.isArray(n.tasks) ? n.tasks : [];
    return {
      ...n,
      tasks: r
    };
  }
  function luc(e, t) {
    let n = e.scheduled;
    if (Array.isArray(n)) {
      let r = n.slice();
      r[0] = t;
      e.scheduled = r;
    } else {
      e.scheduled = t;
    }
  }
  async function Ttn(e, t) {
    return vl("daemon_scheduled_add", async () => {
      x8o().parse(e);
      await BCt(n => {
        let r = A8o(n);
        let o = r.tasks.filter(s => !(s && typeof s === "object" && s.id === e.id));
        o.push(e);
        luc(n, {
          ...r,
          tasks: o
        });
      }, t);
    });
  }
  async function Etn(e, t) {
    return vl("daemon_scheduled_remove", async () => {
      let n = false;
      await BCt(r => {
        if (!("scheduled" in r)) {
          return false;
        }
        let o = A8o(r);
        let s = o.tasks.filter(i => !(i && typeof i === "object" && i.id === e));
        if (s.length === o.tasks.length) {
          return false;
        }
        if (s.length === 0) {
          let i = r.scheduled;
          if (Array.isArray(i) && i.length > 1) {
            r.scheduled = i.slice(1);
          } else {
            delete r.scheduled;
          }
        } else {
          luc(r, {
            ...o,
            tasks: s
          });
        }
        n = true;
      }, t);
      return n;
    });
  }
  async function GCt(e) {
    let t = await e8o(e);
    if (!("scheduled" in t)) {
      return [];
    }
    let n = A8o(t);
    let r = [];
    for (let o of n.tasks) {
      let s = x8o().safeParse(o);
      if (s.success) {
        r.push(s.data);
      }
    }
    return r;
  }
  var nuc;
  var ruc;
  var WCt;
  var x8o;
  var k8o;
  var auc = async (e, t, n, r) => {
    let {
      tasks: o,
      maxConcurrent: s
    } = k8o().parse(e);
    let {
      initializeErrorLogSink: i
    } = await Promise.resolve().then(() => (gtn(), ydr));
    let {
      initializeAnalyticsSink: a
    } = await Promise.resolve().then(() => (TEe(), dht));
    if (i(), a(), !r.getAccessToken()) {
      n("scheduled worker: not authed \u2014 run `claude auth login`");
      process.exit(1);
    }
    let {
      query: l
    } = await Promise.resolve().then(() => (tuc(), euc));
    if (n(`scheduled worker started tasks=${o.length} maxConcurrent=${s}`), o.length === 0) {
      let E = setInterval(() => {}, 60000);
      await new Promise(C => {
        if (t.aborted) {
          C();
          return;
        }
        t.addEventListener("abort", () => C(), {
          once: true
        });
      });
      clearInterval(E);
      return;
    }
    let c = [];
    let u = new Set();
    let d = null;
    function p(E) {
      let C = c.reduce((x, A) => A.task.id === E.id ? x + 1 : x, 0);
      if (C >= E.maxQueued) {
        n(`task=${E.id} dropped (queue full: ${C}/${E.maxQueued})`);
        return;
      }
      c.push({
        task: E
      });
      d?.();
      d = null;
    }
    let m = new Map();
    let f = new Set();
    let h = Date.now();
    function g() {
      let E = {};
      for (let C of o) {
        let x = m.get(C.id);
        E[C.id] = {
          running: f.vZc(C.id),
          ...(x !== undefined && {
            lastFiredAt: x
          })
        };
      }
      Vaf(E);
    }
    g();
    function y(E) {
      let C = m.get(E.id) ?? h;
      return F3t(E.cron, C, E.id, EV);
    }
    let _ = setInterval((E, C, x, A) => {
      let k = Date.now();
      for (let I of E) {
        if (!I.enabled) {
          continue;
        }
        let O = C(I);
        if (O === null) {
          continue;
        }
        if (O <= k) {
          x.set(I.id, k);
          A(I);
        }
      }
    }, 1000, o, y, m, p);
    t.addEventListener("abort", () => {
      clearInterval(_);
      for (let E of u) {
        E.abort();
      }
      d?.();
      d = null;
    });
    let b = new Set();
    async function S(E) {
      let {
        task: C
      } = E;
      let x = new AbortController();
      u.add(x);
      f.add(C.id);
      g();
      let A = setTimeout(k => k.abort(), Math.min(C.runTimeoutMinutes, 10080) * 60000, x);
      n(`task=${C.id} start cron='${C.cron}' dir='${C.directory}'`);
      try {
        let k = l({
          prompt: C.prompt,
          options: {
            cwd: C.directory,
            permissionMode: C.permissionMode,
            ...(C.permissionMode === "bypassPermissions" && {
              allowDangerouslySkipPermissions: true
            }),
            ...(C.model && {
              model: C.model
            }),
            systemPrompt: {
              type: "preset",
              preset: "claude_code"
            },
            settingSources: ["user", "project", "local"],
            pathToClaudeCodeExecutable: process.execPath,
            abortController: x,
            stderr: I => n(`[${C.id}] ${I.trimEnd()}`),
            workload: "cron"
          }
        });
        for await (let I of k) {
          if (I.type === "result") {
            n(`task=${C.id} result subtype=${I.subtype} duration=${I.duration_ms}ms cost=$${I.total_cost_usd.toFixed(4)}`);
          }
        }
      } catch (k) {
        n(`task=${C.id} threw: ${k}`);
      } finally {
        clearTimeout(A);
        u.delete(x);
        f.delete(C.id);
        g();
      }
    }
    while (!t.aborted) {
      while (b.size < s && c.length > 0 && !t.aborted) {
        let E = c.shift();
        let C = S(E).finally(() => {
          b.delete(C);
          d?.();
          d = null;
        });
        b.add(C);
      }
      if (t.aborted) {
        break;
      }
      if (c.length === 0 || b.size >= s) {
        await new Promise(E => {
          d = E;
        });
      }
    }
    await Promise.allSettled(Array.from(b));
  };
  var vtn = __lazy(() => {
    ln();
    BT();
    vX();
    vV();
    gn();
    Tb();
    Gd();
    xqe();
    n8o();
    nuc = require("fs/promises");
    ruc = require("path");
    WCt = ["dontAsk", "auto", "default", "acceptEdits", "plan", "bypassPermissions"];
    x8o = we(() => v.object({
      id: v.string().min(1),
      cron: v.string().refine(e => lU(e) !== null, {
        message: "invalid 5-field cron expression"
      }),
      prompt: v.string().min(1),
      directory: v.string().min(1),
      enabled: v.boolean().default(true),
      permissionMode: v.enum(WCt).default("dontAsk"),
      model: v.string().optional(),
      runTimeoutMinutes: v.number().positive().max(10080).default(30),
      maxQueued: v.number().int().positive().default(1)
    }).strict());
    k8o = we(() => v.object({
      tasks: v.array(x8o()).default([]).refine(e => new Set(e.map(t => t.id)).size === e.length, {
        message: "task ids must be unique"
      }),
      maxConcurrent: v.number().int().positive().default(1)
    }).strict());
  });
  function zaf(e) {
    return typeof e === "object" && e !== null && "type" in e && (e.type === "token_update" || e.type === "auth_401_result");
  }
  function Kaf(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "auth_401";
  }
  function uuc(e, t, n = () => true) {
    let r;
    let o = false;
    let s = null;
    let i = new Set();
    let a = null;
    let l = null;
    function c() {
      return l ??= Promise.resolve().then(() => (no(), v2));
    }
    function u(k) {
      let I = {
        type: "token_update",
        accessToken: k
      };
      for (let O of i) {
        try {
          O.send(I);
        } catch {}
      }
    }
    async function d() {
      let I = await (await c()).getClaudeAIOAuthTokensAsync();
      if (I?.accessToken && I.accessToken !== r?.accessToken) {
        r = {
          accessToken: I.accessToken,
          scopes: I.scopes,
          subscriptionType: I.subscriptionType ?? null,
          rateLimitTier: I.rateLimitTier ?? null
        };
        u(r.accessToken);
      }
      f(I?.expiresAt ?? null);
    }
    let p;
    function m(k) {
      if (p = k, a || e.aborted) {
        return;
      }
      if (s) {
        clearTimeout(s);
        s = null;
      }
      t("auth: no token found, will re-check keychain every 30s");
      a = setInterval(function () {
        c().then(async O => {
          O.clearOAuthTokenCache();
          let M = await O.getClaudeAIOAuthTokensAsync();
          let L;
          if (M?.accessToken && M.accessToken !== p && M.expiresAt && M.expiresAt > Date.now()) {
            L = "auth: token found via keychain re-check";
          } else if (M?.refreshToken && (await O.checkAndRefreshOAuthTokenIfNeeded())) {
            L = "auth: token refreshed via keychain re-check retry";
          }
          if (L) {
            if (await d(), r && a) {
              clearInterval(a);
              a = null;
              t(L);
            }
          }
        }).catch(O => t(`auth: keychain re-check error: ${O}`));
      }, 30000);
      a.unref();
    }
    function f(k) {
      if (s) {
        clearTimeout(s);
        s = null;
      }
      if (!k || e.aborted) {
        return;
      }
      let I = Math.min(Math.max(k - Date.now() - 240000, 5000), 86400000);
      t(`auth: scheduling proactive refresh in ${Math.round(I / 1000)}s`);
      s = setTimeout(h, I);
      s.unref();
    }
    async function h() {
      if (e.aborted) {
        return;
      }
      try {
        t("auth: proactive refresh starting");
        let k = await c();
        let I = r?.accessToken;
        let O = await k.checkAndRefreshOAuthTokenIfNeeded();
        k.clearOAuthTokenCache();
        let M = await k.getClaudeAIOAuthTokensAsync();
        let L = M?.expiresAt ?? null;
        let P = L === null || L > Date.now() + 300000;
        if (M?.accessToken && (O || M.accessToken !== I || P) && (L === null || L > Date.now() + 240000)) {
          await d();
          t(O ? "auth: proactive refresh succeeded" : "auth: token still valid (cross-process refresh or not yet due)");
          return;
        }
        if (M?.accessToken && L !== null && L > Date.now()) {
          t("auth: proactive refresh failed, retrying in ~60s (token still valid)");
          f(Date.now() + 60000 + 240000);
          return;
        }
        t("auth: proactive refresh failed, signalling re-auth required");
        let F = M?.accessToken ?? I;
        r = undefined;
        await _();
        m(F);
      } catch (k) {
        t(`auth: proactive refresh error: ${k}`);
        f(Date.now() + 60000 + 240000);
      }
    }
    async function g(k) {
      if (o) {
        t("auth: 401 ignored (3P provider active, no OAuth)");
        return false;
      }
      t("auth: handling 401");
      let I = await c();
      if (await I.handleOAuth401Error(k)) {
        I.clearOAuthTokenCache();
        await d();
        t("auth: 401 recovery succeeded");
        return true;
      }
      t("auth: 401 recovery failed, signalling re-auth required");
      r = undefined;
      await _();
      I.clearOAuthTokenCache();
      let M = await I.getClaudeAIOAuthTokensAsync();
      if (M?.accessToken !== undefined && M.accessToken !== k) {
        await d();
        return true;
      }
      m(k);
      return false;
    }
    let y = null;
    function _() {
      if (y) {
        return y;
      }
      y = b().finally(() => {
        y = null;
      });
      return y;
    }
    async function b() {
      let k = await c();
      if (k.getAnthropicApiKey()) {
        t("auth: browser login skipped (API key auth available)");
        return;
      }
      if (k.isUsing3PServices() && !n()) {
        t("auth: browser login skipped (3P provider, no OAuth-consuming worker)");
        return;
      }
      let I = er();
      let O = I8o.join(I, "daemon-auth-cooldown");
      let M = I8o.join(I, "daemon-auth-status.json");
      try {
        let L = await Ys().read(O);
        let P = parseInt(L, 10);
        if (!Number.isNaN(P) && Date.now() - P < 300000) {
          t("auth: browser login skipped (cooldown)");
          return;
        }
      } catch (L) {
        if (!fn(L)) {
          t(`auth: cooldown read error: ${L}`);
        }
      }
      try {
        await Ys().mkdir(I);
        await Ys().write(O, String(Date.now()));
      } catch (L) {
        t(`auth: cooldown write error: ${L}`);
      }
      try {
        let {
          execFileNoThrow: L
        } = await Promise.resolve().then(() => (ji(), hIs));
        L("notify-send", ["Claude", "Your Claude assistant needs re-authentication"]);
      } catch {}
      try {
        await Ys().write(M, De({
          status: "auth_required",
          since: Date.now()
        }));
      } catch (L) {
        t(`auth: status write error: ${L}`);
      }
      t("auth: headless daemon cannot complete OAuth \u2014 run `claude auth login` to refresh");
    }
    function S(k) {
      if (!Kaf(k)) {
        return;
      }
      g(k.failedToken).then(I => {
        for (let O of i) {
          try {
            let M = {
              type: "auth_401_result",
              refreshed: I,
              requestId: k.requestId
            };
            O.send(M);
          } catch {}
        }
      }).catch(I => {
        t(`auth: 401 handler error: ${I}`);
        for (let O of i) {
          try {
            let M = {
              type: "auth_401_result",
              refreshed: false,
              requestId: k.requestId
            };
            O.send(M);
          } catch {}
        }
      });
    }
    function E(k) {
      if (i.add(k), k.on("message", S), r) {
        try {
          let I = {
            type: "token_update",
            accessToken: r.accessToken
          };
          k.send(I);
        } catch {}
      }
    }
    function C(k) {
      k.removeListener("message", S);
      i.delete(k);
    }
    let x = (async () => {
      if (e.aborted) {
        return;
      }
      try {
        let k = await c();
        let I = await k.getClaudeAIOAuthTokensAsync();
        if (!I?.accessToken && k.isUsing3PServices()) {
          o = true;
          t("auth: 3P provider active, skipping OAuth refresh loop");
          return;
        }
        if (I?.accessToken) {
          r = {
            accessToken: I.accessToken,
            scopes: I.scopes,
            subscriptionType: I.subscriptionType ?? null,
            rateLimitTier: I.rateLimitTier ?? null
          };
          f(I.expiresAt ?? null);
        }
        await k.checkAndRefreshOAuthTokenIfNeeded();
        await d();
      } catch (k) {
        t(`auth: init error: ${k}`);
      }
    })();
    x.then(() => {
      if (e.aborted || r || o) {
        return;
      }
      m();
    });
    e.addEventListener("abort", () => {
      if (s) {
        clearTimeout(s);
        s = null;
      }
      if (a) {
        clearInterval(a);
        a = null;
      }
    }, {
      once: true
    });
    return {
      ready: x,
      getAccessToken() {
        return r?.accessToken;
      },
      getAuthSnapshot() {
        return r;
      },
      attachWorker: E,
      detachWorker: C,
      dispose: A,
      [Symbol.dispose]: A
    };
    function A() {
      if (s) {
        clearTimeout(s);
        s = null;
      }
      if (a) {
        clearInterval(a);
        a = null;
      }
      for (let k of i) {
        k.removeListener("message", S);
      }
      i.clear();
    }
  }
  function duc(e) {
    if (typeof process.send === "function") {
      let s = function (i) {
        let a = o.get(i);
        if (a) {
          o.delete(i);
          a.resolve(false);
        }
      };
      let r = e;
      process.on("message", i => {
        if (!zaf(i)) {
          return;
        }
        if (i.type === "token_update") {
          r = i.accessToken;
        }
      });
      let o = new Map();
      process.on("message", i => {
        if (typeof i === "object" && i !== null && "type" in i && i.type === "auth_401_result") {
          let a = i;
          let l = o.get(a.requestId);
          if (l) {
            clearTimeout(l.timer);
            o.delete(a.requestId);
            l.resolve(a.refreshed);
          }
        }
      });
      process.channel?.unref();
      return {
        getAccessToken() {
          return r;
        },
        reportAuth401(i) {
          let a = cuc.randomUUID();
          let l = {
            type: "auth_401",
            failedToken: i,
            requestId: a
          };
          return new Promise(c => {
            let u = setTimeout(s, 30000, a);
            u.unref();
            o.set(a, {
              resolve: c,
              timer: u
            });
            try {
              process.send(l);
            } catch {
              clearTimeout(u);
              o.delete(a);
              c(false);
            }
          });
        }
      };
    }
    let t = null;
    async function n() {
      return t ??= await Promise.resolve().then(() => (no(), v2));
    }
    n();
    return {
      getAccessToken() {
        return t?.getClaudeAIOAuthTokens()?.accessToken;
      },
      async reportAuth401(r) {
        return (await n()).handleOAuth401Error(r);
      }
    };
  }
  var cuc;
  var I8o;
  var P8o = __lazy(() => {
    _b();
    gn();
    dt();
    cuc = require("crypto");
    I8o = require("path");
  });
  function VCt() {
    let {
      namespace: e,
      cluster: t
    } = fus();
    return {
      ...(e && {
        cooNamespace: e
      }),
      ...(t && {
        cooCluster: t
      })
    };
  }
  var Adr = __lazy(() => {
    gn();
  });
  function H5(e, t) {
    if (!e || !Zaf.test(e)) {
      throw Error(`Invalid ${t}: contains unsafe characters`);
    }
    return e;
  }
  function O8o(e) {
    function t(a) {
      e.onDebug?.(a);
    }
    let n = 0;
    let r = 100;
    async function o(a) {
      let l = {
        Authorization: `Bearer ${a}`,
        "Content-Type": "application/json",
        "anthropic-version": "2023-06-01",
        "anthropic-beta": X4r.header,
        "x-environment-runner-version": e.runnerVersion,
        "User-Agent": dg()
      };
      let c = await e.getTrustedDeviceToken?.();
      if (c) {
        l["X-Trusted-Device-Token"] = c;
      }
      return l;
    }
    function s() {
      let a = e.getAccessToken();
      if (!a) {
        throw Error("Remote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.");
      }
      return a;
    }
    async function i(a, l) {
      let c = s();
      let u = await a(c);
      if (u.status !== 401) {
        return u;
      }
      if (!e.onAuth401) {
        t(`[bridge:api] ${l}: 401 received, no refresh handler`);
        return u;
      }
      if (t(`[bridge:api] ${l}: 401 received, attempting token refresh`), await e.onAuth401(c)) {
        t(`[bridge:api] ${l}: Token refreshed, retrying request`);
        let p = s();
        let m = await a(p);
        if (m.status !== 401) {
          return m;
        }
        t(`[bridge:api] ${l}: Retry after refresh also got 401`);
      } else {
        t(`[bridge:api] ${l}: Token refresh failed`);
      }
      return u;
    }
    return {
      async registerBridgeEnvironment(a) {
        return vl("bridge_environment_register", async () => {
          t(`[bridge:api] POST /v1/environments/bridge bridgeId=${a.bridgeId}`);
          let l = await i(async c => NP.post(`${e.baseUrl}/v1/environments/bridge`, {
            machine_name: a.machineName,
            directory: a.dir,
            branch: a.branch,
            git_repo_url: a.gitRepoUrl,
            max_sessions: a.maxSessions,
            metadata: {
              worker_type: a.workerType
            },
            ...(a.reuseEnvironmentId && {
              environment_id: a.reuseEnvironmentId
            })
          }, {
            headers: await o(c),
            timeout: 15000,
            validateStatus: u => u < 500
          }), "Registration");
          vCe(l.status, l.data, "Registration");
          t(`[bridge:api] POST /v1/environments/bridge -> ${l.status} environment_id=${l.data.environment_id}`);
          t(`[bridge:api] >>> ${Sgt({
            machine_name: a.machineName,
            directory: a.dir,
            branch: a.branch,
            git_repo_url: redactGitRemoteCredentials(a.gitRepoUrl),
            max_sessions: a.maxSessions,
            metadata: {
              worker_type: a.workerType
            }
          })}`);
          t(`[bridge:api] <<< ${Sgt(l.data)}`);
          return l.data;
        }, guc);
      },
      async pollForWork(a, l, c, u) {
        H5(a, "environmentId");
        let d = n;
        n = 0;
        let p = await NP.get(`${e.baseUrl}/v1/environments/${a}/work/poll`, {
          headers: await o(l),
          params: u !== undefined ? {
            reclaim_older_than_ms: u
          } : undefined,
          timeout: 1e4,
          signal: c,
          validateStatus: m => m < 500
        });
        if (vCe(p.status, p.data, "Poll", p.headers), !p.data) {
          if (n = d + 1, n === 1 || n % r === 0) {
            t(`[bridge:api] GET .../work/poll -> ${p.status} (no work, ${n} consecutive empty polls)`);
          }
          return null;
        }
        t(`[bridge:api] GET .../work/poll -> ${p.status} workId=${p.data.id} type=${p.data.data?.type}${p.data.data?.id ? ` sessionId=${p.data.data.id}` : ""}`);
        t(`[bridge:api] <<< ${Sgt(p.data)}`);
        return p.data;
      },
      async acknowledgeWork(a, l, c) {
        H5(a, "environmentId");
        H5(l, "workId");
        t(`[bridge:api] POST .../work/${l}/ack`);
        let u = await NP.post(`${e.baseUrl}/v1/environments/${a}/work/${l}/ack`, {}, {
          headers: await o(c),
          timeout: 1e4,
          validateStatus: d => d < 500
        });
        vCe(u.status, u.data, "Acknowledge");
        t(`[bridge:api] POST .../work/${l}/ack -> ${u.status}`);
      },
      async stopWork(a, l, c) {
        H5(a, "environmentId");
        H5(l, "workId");
        t(`[bridge:api] POST .../work/${l}/stop force=${c}`);
        let u = await i(async d => NP.post(`${e.baseUrl}/v1/environments/${a}/work/${l}/stop`, {
          force: c
        }, {
          headers: await o(d),
          timeout: 1e4,
          validateStatus: p => p < 500
        }), "StopWork");
        vCe(u.status, u.data, "StopWork");
        t(`[bridge:api] POST .../work/${l}/stop -> ${u.status}`);
      },
      async deregisterEnvironment(a) {
        H5(a, "environmentId");
        t(`[bridge:api] DELETE /v1/environments/bridge/${a}`);
        let l = await i(async c => NP.delete(`${e.baseUrl}/v1/environments/bridge/${a}`, {
          headers: await o(c),
          timeout: 1e4,
          validateStatus: u => u < 500
        }), "Deregister");
        vCe(l.status, l.data, "Deregister");
        t(`[bridge:api] DELETE /v1/environments/bridge/${a} -> ${l.status}`);
      },
      async archiveSession(a) {
        H5(a, "sessionId");
        t(`[bridge:api] POST /v1/sessions/${a}/archive`);
        let l = await i(async c => NP.post(`${e.baseUrl}/v1/sessions/${a}/archive`, {}, {
          headers: await o(c),
          timeout: 1e4,
          validateStatus: u => u < 500
        }), "ArchiveSession");
        if (l.status === 409) {
          t(`[bridge:api] POST /v1/sessions/${a}/archive -> 409 (already archived)`);
          return;
        }
        vCe(l.status, l.data, "ArchiveSession");
        t(`[bridge:api] POST /v1/sessions/${a}/archive -> ${l.status}`);
      },
      async reconnectSession(a, l) {
        return vl("bridge_session_reconnect", async () => {
          H5(a, "environmentId");
          H5(l, "sessionId");
          t(`[bridge:api] POST /v1/environments/${a}/bridge/reconnect session_id=${l}`);
          let c = await i(async u => NP.post(`${e.baseUrl}/v1/environments/${a}/bridge/reconnect`, {
            session_id: l
          }, {
            headers: await o(u),
            timeout: 1e4,
            validateStatus: d => d < 500
          }), "ReconnectSession");
          vCe(c.status, c.data, "ReconnectSession");
          t(`[bridge:api] POST .../bridge/reconnect -> ${c.status}`);
        }, guc);
      },
      async heartbeatWork(a, l, c) {
        H5(a, "environmentId");
        H5(l, "workId");
        t(`[bridge:api] POST .../work/${l}/heartbeat`);
        let u = await NP.post(`${e.baseUrl}/v1/environments/${a}/work/${l}/heartbeat`, {}, {
          headers: await o(c),
          timeout: 1e4,
          validateStatus: d => d < 500
        });
        vCe(u.status, u.data, "Heartbeat");
        t(`[bridge:api] POST .../work/${l}/heartbeat -> ${u.status} lease_extended=${u.data.lease_extended} state=${u.data.state}`);
        return u.data;
      },
      async sendPermissionResponseEvent(a, l, c) {
        H5(a, "sessionId");
        let {
          url: u,
          body: d
        } = v5n(e.baseUrl, a, [l], e.useCcrV2Routing?.() ?? false);
        t(`[bridge:api] POST ${u} type=${l.type}`);
        let p = await NP.post(u, d, {
          headers: await o(c),
          timeout: 1e4,
          validateStatus: m => m < 500
        });
        vCe(p.status, p.data, "SendPermissionResponseEvent");
        t(`[bridge:api] POST ${u} -> ${p.status}`);
        t(`[bridge:api] >>> ${Sgt(d)}`);
        t(`[bridge:api] <<< ${Sgt(p.data)}`);
      }
    };
  }
  function vCe(e, t, n, r) {
    if (e === 200 || e === 204) {
      return;
    }
    let o = vQ(t);
    let s = elf(t);
    switch (e) {
      case 401:
        throw new J3(`${n}: Authentication failed (401)${o ? `: ${o}` : ""}. ${"Remote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account."}`, 401, s);
      case 403:
        throw new J3(wtn(s) ? "Remote Control session expired." : `${n}: Access denied (403)${o ? `: ${o}` : ""}. Check your organization permissions.`, 403, s);
      case 404:
        throw new J3(o ?? `${n}: Not found (404). Remote Control may not be available for this organization.`, 404, s);
      case 410:
        throw new J3(o ?? "Remote Control session expired.", 410, s ?? "environment_expired");
      case 429:
        {
          let i = _5n(typeof r?.["retry-after"] === "string" ? r["retry-after"] : undefined);
          throw Object.assign(Error(`${n}: Rate limited (429). Polling too frequently.`), i !== undefined ? {
            status: e,
            retryAfterMs: i
          } : {
            status: e
          });
        }
      default:
        throw Object.assign(Error(`${n}: Failed with status ${e}${o ? `: ${o}` : ""}`), {
          status: e
        });
    }
  }
  function wtn(e) {
    if (!e) {
      return false;
    }
    return e.includes("expired") || e.includes("lifetime");
  }
  function D8o(e) {
    if (e.status !== 403) {
      return false;
    }
    return e.message.includes("external_poll_sessions") || e.message.includes("environments:manage");
  }
  function guc(e) {
    if (e instanceof J3) {
      return e.status === 401 ? "auth_failed" : "http_error";
    }
    if (e instanceof Error) {
      if (e.message === "Remote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.") {
        return "no_token";
      }
      if ("status" in e && typeof e.status === "number") {
        return "http_error";
      }
    }
    return "request_failed";
  }
  function elf(e) {
    if (e && typeof e === "object") {
      if ("error" in e && e.error && typeof e.error === "object" && "type" in e.error && typeof e.error.type === "string") {
        return e.error.type;
      }
    }
    return;
  }
  var Zaf;
  var J3;
  var yuc = __lazy(() => {
    Dp();
    KN();
    ln();
    na();
    gwo();
    Ipe();
    Zaf = /^[a-zA-Z0-9_-]+$/;
    J3 = class J3 extends Error {
      status;
      errorType;
      constructor(e, t, n) {
        super(e);
        this.name = "BridgeFatalError";
        this.status = t;
        this.errorType = n;
      }
    };
  });
  async function nlf(e) {
    return (await _uc.toString(e, tlf)).split(`
`).filter(n => n.length > 0);
  }
  function buc(e) {
    let t = e.write ?? (U => process.stdout.write(U));
    let n = e.verbose;
    let r = 0;
    let o = "idle";
    let s = "Ready";
    let i = "";
    let a = "";
    let l = "";
    let c = "";
    let u = "";
    let d = null;
    let p = [];
    let m = false;
    let f = "";
    let h = null;
    let g = 0;
    let y = 0;
    let _ = 1;
    let b = null;
    let S = "single-session";
    let E = new Map();
    let C = null;
    let x = 0;
    function A(U) {
      let N = process.stdout.columns || 80;
      let W = 0;
      for (let j of U.split(`
`)) {
        if (j.length === 0) {
          W++;
          continue;
        }
        let z = an(j);
        W += Math.max(1, Math.ceil(z / N));
      }
      if (U.endsWith(`
`)) {
        W--;
      }
      return W;
    }
    function k(U) {
      t(U);
      r += A(U);
    }
    function I() {
      if (r <= 0) {
        return;
      }
      t(`\x1B[${r}A`);
      t("\x1B[J");
      r = 0;
    }
    function O(U) {
      I();
      t(U);
      H();
    }
    function M(U) {
      if (U === f) {
        return;
      }
      f = U;
      nlf(U).then(N => {
        p = N;
        H();
      }).catch(N => {
        logForDebugging(`QR code generation failed: ${N}`, {
          level: "error"
        });
      });
    }
    function L() {
      I();
      let U = CMt[x % CMt.length];
      let N = "";
      if (i) {
        N += _$u.dim(" \xB7 ") + _$u.dim(i);
      }
      if (a) {
        N += _$u.dim(" \xB7 ") + _$u.dim(a);
      }
      k(`${_$u.yellow(U)} ${_$u.yellow("Connecting")}${N}
`);
    }
    function P() {
      F();
      L();
      C = setInterval(() => {
        x++;
        L();
      }, 150);
    }
    function F() {
      if (C) {
        clearInterval(C);
        C = null;
      }
    }
    function H() {
      if (o === "reconnecting" || o === "failed") {
        return;
      }
      I();
      let U = o === "idle";
      if (m) {
        for (let J of p) {
          k(`${_$u.dim(J)}
`);
        }
      }
      let N = "\xB7\u2714\uFE0E\xB7";
      let W = U ? _$u.green : _$u.cyan;
      let z = (U ? _$u.green : _$u.cyan)(s);
      let V = "";
      if (i) {
        V += _$u.dim(" \xB7 ") + _$u.dim(i);
      }
      if (a && S !== "worktree") {
        V += _$u.dim(" \xB7 ") + _$u.dim(a);
      }
      if (k(`${W(N)} ${z}${V}
`), _ > 1) {
        let J = S === "worktree" ? "New sessions will be created in an isolated worktree" : "New sessions will be created in the current directory";
        k(`    ${_$u.dim(`Capacity: ${y}/${_} \xB7 ${J}`)}
`);
        for (let [, Q] of E) {
          let Z = Q.title ? truncateToWidth(Q.title, 35) : _$u.dim("Attached");
          let ne = Ppl(Z, Q.url);
          let oe = Q.activity;
          let re = oe && oe.type !== "result" && oe.type !== "error" ? _$u.dim(` ${truncateToWidth(oe.summary, 40)}`) : "";
          k(`    ${ne}${re}
`);
        }
      }
      if (_ === 1) {
        let J = S === "single-session" ? "Single session \xB7 exits when complete" : S === "worktree" ? `Capacity: ${y}/1 \xB7 New sessions will be created in an isolated worktree` : `Capacity: ${y}/1 \xB7 New sessions will be created in the current directory`;
        k(`    ${_$u.dim(J)}
`);
      }
      if (_ === 1 && !U && h && Date.now() - g < 30000) {
        k(`  ${_$u.dim(truncateToWidth(h, 60))}
`);
      }
      let K = d ?? c;
      if (K) {
        k(`
`);
        let J = U ? pJn(K) : mJn(K);
        let Q = m ? _$u.dim.italic("space to hide QR code") : _$u.dim.italic("space to show QR code");
        let Z = b ? _$u.dim.italic(" \xB7 w to toggle spawn mode") : "";
        k(`${_$u.dim(J)}
`);
        k(`${Q}${Z}
`);
      }
    }
    return {
      printBanner(U, N) {
        if (u = U.sessionIngressUrl, c = eKt(N, u), M(c), n) {
          t(_$u.dim("Remote Control") + ` v${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION}
`);
        }
        if (n) {
          if (U.spawnMode !== "single-session") {
            t(_$u.dim("Spawn mode: ") + `${U.spawnMode}
`);
            t(_$u.dim("Max concurrent sessions: ") + `${U.maxSessions}
`);
          }
          t(_$u.dim("Environment ID: ") + `${N}
`);
        }
        if (U.sandbox) {
          t(_$u.dim("Sandbox: ") + `${_$u.green("Enabled")}
`);
        }
        if (U.livePreviewPorts && U.livePreviewPorts.size > 0) {
          let W = [...U.livePreviewPorts].sort((j, z) => j - z).join(", ");
          t(_$u.yellow(`\u26A0  Live preview enabled: 127.0.0.1 port${U.livePreviewPorts.size > 1 ? "s" : ""} ${W} ${U.livePreviewPorts.size > 1 ? "are" : "is"} reachable from this session's livepreview URL while Remote Control is running.
`));
        }
        t(`
`);
        P();
      },
      logSessionStart(U, N) {
        if (n) {
          let W = truncateToWidth(N, 80);
          O(_$u.dim(`[${W1e()}]`) + ` Session started: ${_$u.white(`"${W}"`)} (${_$u.dim(U)})
`);
        }
      },
      logSessionComplete(U, N) {
        O(_$u.dim(`[${W1e()}]`) + ` Session ${_$u.green("completed")} (${formatDuration(N)}) ${_$u.dim(U)}
`);
      },
      logSessionFailed(U, N) {
        O(_$u.dim(`[${W1e()}]`) + ` Session ${_$u.red("failed")}: ${N} ${_$u.dim(U)}
`);
      },
      logStatus(U) {
        O(_$u.dim(`[${W1e()}]`) + ` ${U}
`);
      },
      logVerbose(U) {
        if (n) {
          O(_$u.dim(`[${W1e()}] ${U}`) + `
`);
        }
      },
      logError(U) {
        O(_$u.red(`[${W1e()}] Error: ${U}`) + `
`);
      },
      logReconnected(U) {
        O(_$u.dim(`[${W1e()}]`) + ` ${_$u.green("Reconnected")} after ${formatDuration(U)}
`);
      },
      setRepoInfo(U, N) {
        i = U;
        a = N;
      },
      setDebugLogPath(U) {
        l = U;
      },
      updateIdleStatus() {
        F();
        o = "idle";
        s = "Ready";
        h = null;
        g = 0;
        d = null;
        M(c);
        H();
      },
      setAttached(U) {
        if (F(), o = "attached", s = "Connected", h = null, g = 0, _ <= 1) {
          d = wS(U, u);
          M(d);
        }
        H();
      },
      updateReconnectingStatus(U, N) {
        if (F(), I(), o = "reconnecting", m) {
          for (let j of p) {
            k(`${_$u.dim(j)}
`);
          }
        }
        let W = CMt[x % CMt.length];
        x++;
        k(`${_$u.yellow(W)} ${_$u.yellow("Reconnecting")} ${_$u.dim("\xB7")} ${_$u.dim(`retrying in ${U}`)} ${_$u.dim("\xB7")} ${_$u.dim(`disconnected ${N}`)}
`);
      },
      updateFailedStatus(U) {
        F();
        I();
        o = "failed";
        let N = "";
        if (i) {
          N += _$u.dim(" \xB7 ") + _$u.dim(i);
        }
        if (a) {
          N += _$u.dim(" \xB7 ") + _$u.dim(a);
        }
        if (k(`${_$u.red("\xD7")} ${_$u.red("Remote Control Failed")}${N}
`), k(`${_$u.dim("Re-run `claude remote-control` to try again")}
`), U) {
          k(`${_$u.red(U)}
`);
        }
      },
      updateSessionStatus(U, N, W, j) {
        if (W.type === "tool_start") {
          h = W.summary;
          g = Date.now();
        }
        H();
      },
      clearStatus() {
        F();
        I();
      },
      toggleQr() {
        m = !m;
        H();
      },
      updateSessionCount(U, N, W) {
        if (y === U && _ === N && S === W) {
          return;
        }
        y = U;
        _ = N;
        S = W;
      },
      setSpawnModeDisplay(U) {
        if (b === U) {
          return;
        }
        if (b = U, U) {
          S = U;
        }
      },
      addSession(U, N) {
        E.set(U, {
          url: N
        });
      },
      updateSessionActivity(U, N) {
        let W = E.get(U);
        if (!W) {
          return;
        }
        W.activity = N;
      },
      setSessionTitle(U, N) {
        let W = E.get(U);
        if (!W) {
          return;
        }
        if (W.title = N, o === "reconnecting" || o === "failed") {
          return;
        }
        if (_ === 1) {
          o = "titled";
          s = truncateToWidth(N, 40);
        }
        H();
      },
      removeSession(U) {
        E.delete(U);
      },
      refreshDisplay() {
        if (o === "reconnecting" || o === "failed") {
          return;
        }
        H();
      }
    };
  }
  var _uc;
  var tlf;
  var Suc = __lazy(() => {
    wl();
    bc();
    je();
    yse();
    _uc = __toESM(Iwt(), 1);
    tlf = {
      type: "utf8",
      errorCorrectionLevel: "L",
      small: true
    };
  });
  function Tuc(e) {
    let t = new AbortController();
    function n() {
      t.abort();
      t = new AbortController();
    }
    function r() {
      let o = new AbortController();
      let s = () => o.abort();
      if (e.aborted || t.signal.aborted) {
        o.abort();
        return {
          signal: o.signal,
          cleanup: () => {}
        };
      }
      e.addEventListener("abort", s, {
        once: true
      });
      let i = t.signal;
      i.addEventListener("abort", s, {
        once: true
      });
      return {
        signal: o.signal,
        cleanup: () => {
          e.removeEventListener("abort", s);
          i.removeEventListener("abort", s);
        }
      };
    }
    return {
      signal: r,
      wake: n
    };
  }
  var zCt;
  var Euc = __lazy(() => {
    zCt = {
      poll_interval_ms_not_at_capacity: 2000,
      poll_interval_ms_at_capacity: 600000,
      non_exclusive_heartbeat_interval_ms: 0,
      multisession_poll_interval_ms_not_at_capacity: 2000,
      multisession_poll_interval_ms_partial_capacity: 2000,
      multisession_poll_interval_ms_at_capacity: 600000,
      reclaim_older_than_ms: 5000,
      session_keepalive_interval_v2_ms: 120000
    };
  });
  function lBe() {
    let e = getFeatureValue_CACHED_WITH_REFRESH("tengu_bridge_poll_interval_config", zCt, 300000);
    let t = rlf().safeParse(e);
    return t.success ? t.data : zCt;
  }
  var vuc;
  var rlf;
  var M8o = __lazy(() => {
    $n();
    Euc();
    vuc = {
      message: "must be 0 (disabled) or \u2265100ms"
    };
    rlf = we(() => v.object({
      poll_interval_ms_not_at_capacity: v.number().int().min(100),
      poll_interval_ms_at_capacity: v.number().int().refine(e => e === 0 || e >= 100, vuc),
      non_exclusive_heartbeat_interval_ms: v.number().int().min(0).default(0),
      multisession_poll_interval_ms_not_at_capacity: v.number().int().min(100).default(zCt.multisession_poll_interval_ms_not_at_capacity),
      multisession_poll_interval_ms_partial_capacity: v.number().int().min(100).default(zCt.multisession_poll_interval_ms_partial_capacity),
      multisession_poll_interval_ms_at_capacity: v.number().int().refine(e => e === 0 || e >= 100, vuc).default(zCt.multisession_poll_interval_ms_at_capacity),
      reclaim_older_than_ms: v.number().int().min(1).default(5000),
      session_keepalive_interval_v2_ms: v.number().int().min(0).default(120000)
    }).refine(e => e.non_exclusive_heartbeat_interval_ms > 0 || e.poll_interval_ms_at_capacity > 0, {
      message: "at-capacity liveness requires non_exclusive_heartbeat_interval_ms > 0 or poll_interval_ms_at_capacity > 0"
    }).refine(e => e.non_exclusive_heartbeat_interval_ms > 0 || e.multisession_poll_interval_ms_at_capacity > 0, {
      message: "at-capacity liveness requires non_exclusive_heartbeat_interval_ms > 0 or multisession_poll_interval_ms_at_capacity > 0"
    }));
  });
  var N8o = __lazy(() => {
    je();
    dt();
    fW();
    Fh();
    Aot();
  });
  function Idr(e) {
    return e.replace(/[^a-zA-Z0-9_-]/g, "_");
  }
  function alf(e, t) {
    let n = ilf[e] ?? e;
    let r = t.file_path ?? t.filePath ?? t.pattern ?? t.command?.slice(0, 60) ?? t.url ?? t.query ?? "";
    if (r) {
      return `${n} ${r}`;
    }
    return n;
  }
  function llf(e, t, n) {
    let r;
    try {
      r = qt(e);
    } catch {
      return [];
    }
    if (!r || typeof r !== "object") {
      return [];
    }
    let o = r;
    let s = [];
    let i = Date.now();
    switch (o.type) {
      case "assistant":
        {
          let a = o.message;
          if (!a) {
            break;
          }
          let l = a.content;
          if (!Array.isArray(l)) {
            break;
          }
          for (let c of l) {
            if (!c || typeof c !== "object") {
              continue;
            }
            let u = c;
            if (u.type === "tool_use") {
              let d = u.name ?? "Tool";
              let p = u.input ?? {};
              let m = alf(d, p);
              s.push({
                type: "tool_start",
                summary: m,
                timestamp: i
              });
              n(`[bridge:activity] sessionId=${t} tool_use name=${d} ${ulf(p)}`);
            } else if (u.type === "text") {
              let d = u.text ?? "";
              if (d.length > 0) {
                s.push({
                  type: "text",
                  summary: d.slice(0, 80),
                  timestamp: i
                });
                n(`[bridge:activity] sessionId=${t} text "${d.slice(0, 100)}"`);
              }
            }
          }
          break;
        }
      case "result":
        {
          let a = o.subtype;
          if (a === "success") {
            s.push({
              type: "result",
              summary: "Session completed",
              timestamp: i
            });
            n(`[bridge:activity] sessionId=${t} result subtype=success`);
          } else if (a) {
            let c = o.errors?.[0] ?? `Error: ${a}`;
            s.push({
              type: "error",
              summary: c,
              timestamp: i
            });
            n(`[bridge:activity] sessionId=${t} result subtype=${a} error="${c}"`);
          } else {
            n(`[bridge:activity] sessionId=${t} result subtype=undefined`);
          }
          break;
        }
      default:
        break;
    }
    return s;
  }
  function clf(e) {
    if (e.parent_tool_use_id != null || e.isSynthetic || e.isReplay) {
      return;
    }
    let n = e.message?.content;
    let r;
    if (typeof n === "string") {
      r = n;
    } else if (Array.isArray(n)) {
      for (let o of n) {
        if (o && typeof o === "object" && o.type === "text") {
          r = o.text;
          break;
        }
      }
    }
    r = r?.trim();
    return r ? r : undefined;
  }
  function ulf(e) {
    let t = [];
    for (let [n, r] of Object.entries(e)) {
      if (typeof r === "string") {
        t.push(`${n}="${r.slice(0, 100)}"`);
      }
      if (t.length >= 3) {
        break;
      }
    }
    return t.join(" ");
  }
  function F8o(e) {
    return {
      spawn(t, n) {
        let r = Idr(t.sessionId);
        let o;
        if (e.debugFile) {
          let y = e.debugFile.lastIndexOf(".");
          if (y > 0) {
            o = `${e.debugFile.slice(0, y)}-${r}${e.debugFile.slice(y)}`;
          } else {
            o = `${e.debugFile}-${r}`;
          }
        } else if (e.verbose) {
          o = Ctn.join(pT(), `bridge-session-${r}.log`);
        }
        let s = null;
        let i;
        if (e.debugFile) {
          i = Ctn.join(Ctn.dirname(e.debugFile), `bridge-transcript-${r}.jsonl`);
          s = Cuc.createWriteStream(i, {
            flags: "a"
          });
          s.on("error", y => {
            e.onDebug(`[bridge:session] Transcript write error: ${y.message}`);
            s = null;
          });
          e.onDebug(`[bridge:session] Transcript log: ${i}`);
        }
        let a = [...e.scriptArgs, "--print", "--sdk-url", t.sdkUrl, "--session-id", t.sessionId, "--input-format", "stream-json", "--output-format", "stream-json", "--replay-user-messages", ...(e.verbose ? ["--verbose"] : []), ...(o ? ["--debug-file", o] : []), ...(e.permissionMode ? ["--permission-mode", e.permissionMode] : [])];
        let l = {
          ...e.env,
          CLAUDE_CODE_OAUTH_TOKEN: undefined,
          CLAUDE_CODE_ENVIRONMENT_KIND: "bridge",
          ...(e.sandbox && {
            CLAUDE_CODE_FORCE_SANDBOX: "1"
          }),
          CLAUDE_CODE_SESSION_ACCESS_TOKEN: t.accessToken,
          ...(t.useCcrV2 && {
            CLAUDE_CODE_USE_CCR_V2: "1",
            CLAUDE_CODE_WORKER_EPOCH: String(t.workerEpoch)
          })
        };
        if (e.onDebug(`[bridge:session] Spawning sessionId=${t.sessionId} sdkUrl=${t.sdkUrl} accessToken=${t.accessToken ? "present" : "MISSING"}`), e.onDebug(`[bridge:session] Child args: ${a.join(" ")}`), o) {
          e.onDebug(`[bridge:session] Debug log: ${o}`);
        }
        let c = wuc.spawn(e.execPath, a, {
          cwd: n,
          stdio: ["pipe", "pipe", "pipe"],
          env: l,
          windowsHide: true
        });
        e.onDebug(`[bridge:session] sessionId=${t.sessionId} pid=${c.pid}`);
        let u = [];
        let d = null;
        let p = [];
        let m = false;
        let f = false;
        if (c.stderr) {
          L8o.createInterface({
            input: c.stderr
          }).on("line", _ => {
            if (e.verbose) {
              process.stderr.write(_ + `
`);
            }
            if (p.length >= 10) {
              p.shift();
            }
            p.push(_);
          });
        }
        if (c.stdout) {
          L8o.createInterface({
            input: c.stdout
          }).on("line", _ => {
            if (s) {
              s.write(_ + `
`);
            }
            if (e.onDebug(`[bridge:ws] sessionId=${t.sessionId} <<< ${hwo(_)}`), e.verbose) {
              process.stderr.write(_ + `
`);
            }
            let b = llf(_, t.sessionId, e.onDebug);
            for (let S of b) {
              if (u.length >= 10) {
                u.shift();
              }
              u.push(S);
              d = S;
              e.onActivity?.(t.sessionId, S);
            }
            {
              let S;
              try {
                S = qt(_);
              } catch {}
              if (S && typeof S === "object") {
                let E = S;
                if (E.type === "control_request") {
                  if (E.request?.subtype === "can_use_tool" && e.onPermissionRequest) {
                    e.onPermissionRequest(t.sessionId, S, t.accessToken);
                  }
                } else if (E.type === "user" && !f && t.onFirstUserMessage) {
                  let C = clf(E);
                  if (C) {
                    f = true;
                    t.onFirstUserMessage(C);
                  }
                }
              }
            }
          });
        }
        let h = new Promise(y => {
          c.on("close", (_, b) => {
            if (s) {
              s.end();
              s = null;
            }
            if (b === "SIGTERM" || b === "SIGINT") {
              e.onDebug(`[bridge:session] sessionId=${t.sessionId} interrupted signal=${b} pid=${c.pid}`);
              y("interrupted");
            } else if (_ === 0) {
              e.onDebug(`[bridge:session] sessionId=${t.sessionId} completed exit_code=0 pid=${c.pid}`);
              y("completed");
            } else {
              e.onDebug(`[bridge:session] sessionId=${t.sessionId} failed exit_code=${_} pid=${c.pid}`);
              y("failed");
            }
          });
          c.on("error", _ => {
            e.onDebug(`[bridge:session] sessionId=${t.sessionId} spawn error: ${_.message}`);
            p.push(`spawn error: ${_.message}`);
            y("failed");
          });
        });
        let g = {
          sessionId: t.sessionId,
          done: h,
          activities: u,
          accessToken: t.accessToken,
          lastStderr: p,
          get currentActivity() {
            return d;
          },
          kill() {
            if (!c.killed) {
              e.onDebug(`[bridge:session] Sending SIGTERM to sessionId=${t.sessionId} pid=${c.pid}`);
              c.kill("SIGTERM");
            }
          },
          forceKill() {
            if (!m && c.pid) {
              m = true;
              e.onDebug(`[bridge:session] Sending SIGKILL to sessionId=${t.sessionId} pid=${c.pid}`);
              c.kill("SIGKILL");
            }
          },
          writeStdin(y) {
            if (c.stdin && !c.stdin.destroyed) {
              e.onDebug(`[bridge:ws] sessionId=${t.sessionId} >>> ${hwo(y)}`);
              c.stdin.write(y);
            }
          },
          updateAccessToken(y) {
            g.accessToken = y;
            g.writeStdin(De({
              type: "update_environment_variables",
              variables: {
                CLAUDE_CODE_SESSION_ACCESS_TOKEN: y
              }
            }) + `
`);
            e.onDebug(`[bridge:session] Sent token refresh via stdin for sessionId=${t.sessionId}`);
          }
        };
        return g;
      }
    };
  }
  var wuc;
  var Cuc;
  var Ctn;
  var L8o;
  var ilf;
  var Ruc = __lazy(() => {
    BC();
    Ipe();
    wuc = require("child_process");
    Cuc = require("fs");
    Ctn = require("path");
    L8o = require("readline");
    ilf = {
      Read: "Reading",
      Write: "Writing",
      Edit: "Editing",
      MultiEdit: "Editing",
      Bash: "Running",
      Glob: "Searching",
      Grep: "Searching",
      WebFetch: "Fetching",
      WebSearch: "Searching",
      Task: "Running task",
      FileReadTool: "Reading",
      FileWriteTool: "Writing",
      FileEditTool: "Editing",
      GlobTool: "Searching",
      GrepTool: "Searching",
      BashTool: "Running",
      NotebookEditTool: "Editing notebook",
      LSP: "LSP"
    };
  });
  function xuc(e) {
    let t = Buffer.from(e, "base64url").toString("utf-8");
    let n = qt(t);
    if (!n || typeof n !== "object" || !("version" in n) || n.version !== 1) {
      throw Error(`Unsupported work secret version: ${n && typeof n === "object" && "version" in n ? n.version : "unknown"}`);
    }
    let r = n;
    if (typeof r.session_ingress_token !== "string" || r.session_ingress_token.length === 0) {
      throw Error("Invalid work secret: missing or empty session_ingress_token");
    }
    if (typeof r.api_base_url !== "string") {
      throw Error("Invalid work secret: missing api_base_url");
    }
    return n;
  }
  function kuc(e, t) {
    let n = e.includes("localhost") || e.includes("127.0.0.1");
    let r = n ? "ws" : "wss";
    let o = n ? "v2" : "v1";
    let s = e.replace(/^https?:\/\//, "").replace(/\/+$/, "");
    return `${r}://${s}/${o}/session_ingress/ws/${t}`;
  }
  function U8o(e, t) {
    if (e === t) {
      return true;
    }
    let n = e.slice(e.lastIndexOf("_") + 1);
    let r = t.slice(t.lastIndexOf("_") + 1);
    return n.length >= 4 && n === r;
  }
  function Rtn(e, t) {
    return `${e.replace(/\/+$/, "")}/v1/code/sessions/${t}`;
  }
  async function Pdr(e, t) {
    let n = await NP.post(`${e}/worker/register`, {}, {
      headers: {
        Authorization: `Bearer ${t}`,
        "Content-Type": "application/json",
        "anthropic-version": "2023-06-01"
      },
      timeout: 1e4
    });
    let r = n.data?.worker_epoch;
    let o = typeof r === "string" ? Number(r) : r;
    if (typeof o !== "number" || !Number.isFinite(o) || !Number.isSafeInteger(o)) {
      throw Error(`registerWorker: invalid worker_epoch in response: ${De(n.data)}`);
    }
    return o;
  }
  var Odr = __lazy(() => {
    Dp();
  });
  var uBe = {};