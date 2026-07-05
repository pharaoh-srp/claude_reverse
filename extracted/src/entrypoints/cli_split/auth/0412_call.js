  __export(N6o, {
    call: () => call_export84
  });
  async function call_export84(e, t) {
    try {
      if (isClaudeAISubscriber()) {
        let s = getClaudeAIOAuthTokens();
        let i = false;
        if (s?.subscriptionType && s?.rateLimitTier) {
          i = s.subscriptionType === "max" && s.rateLimitTier === "default_claude_max_20x";
        } else if (s?.accessToken) {
          let a = await t0e(s.accessToken);
          i = a?.organization?.organization_type === "claude_max" && a?.organization?.rate_limit_tier === "default_claude_max_20x";
        }
        if (i) {
          setTimeout(e, 0, "You are already on the highest Max subscription plan. For additional usage, run /login to switch to an API usage-billed account.");
          return null;
        }
      }
      await Ac("https://claude.ai/upgrade/max");
      let r = getOauthAccountInfo();
      let o = r && {
        accountUuid: r.accountUuid,
        organizationUuid: r.organizationUuid
      };
      return yac.jsx(Login, {
        startingMessage: "Starting new login following /upgrade. Exit with Ctrl-C to use existing account.",
        onDone: async s => {
          let i = await runPostLoginHooks(t, s, {
            previousAccount: o
          });
          e(s ? i.bridgeDisconnected ? `Login successful. ${"Remote Control disconnected."}` : "Login successful" : "Login interrupted", s ? loginAutoContinueOptions(t, i) : undefined);
        }
      });
    } catch (n) {
      Oe(n);
      setTimeout(e, 0, "Failed to open browser. Please visit https://claude.ai/upgrade/max to upgrade.");
    }
    return null;
  }
  var yac;
  var ctn = __lazy(() => {
    fqe();
    no();
    ky();
    Rn();
    LSt();
    yac = __toESM(ie(), 1);
  });
  var rsf;
  function Sac(e) {
    let t = _ac.c(15);
    let {
      onDone: n,
      context: r
    } = e;
    let [o, s] = bac.useState(null);
    if (o) {
      return o;
    }
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = [...(FX() ? [] : [{
        label: "Upgrade to Max",
        value: "upgrade"
      }]), {
        label: "Add funds to continue with usage credits",
        value: "extra-usage"
      }];
      t[0] = i;
    } else {
      i = t[0];
    }
    let a = i;
    let l;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      l = hJe.jsx(gXd, {
        paddingX: 2,
        children: hJe.jsx(Text, {
          color: "error",
          children: "Your Claude Code trial has ended."
        })
      });
      t[1] = l;
    } else {
      l = t[1];
    }
    let c;
    if (t[2] !== n) {
      c = () => n();
      t[2] = n;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== n) {
      u = () => n();
      t[4] = n;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== r || t[7] !== n) {
      d = f => {
        if (logEvent("tengu_pro_trial_expired_choice", {
          chose_upgrade: f === "upgrade"
        }), f === "upgrade") {
          call_export84(n, r).then(h => s(h));
        } else {
          call_export3(n, r).then(h => s(h));
        }
      };
      t[6] = r;
      t[7] = n;
      t[8] = d;
    } else {
      d = t[8];
    }
    let p;
    if (t[9] !== u || t[10] !== d) {
      p = hJe.jsx(xr, {
        options: a,
        onCancel: u,
        onChange: d
      });
      t[9] = u;
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== c || t[13] !== p) {
      m = hJe.jsxs(gXd, {
        flexDirection: "column",
        children: [l, hJe.jsx(or, {
          title: "What do you want to do?",
          onCancel: c,
          children: p
        })]
      });
      t[12] = c;
      t[13] = p;
      t[14] = m;
    } else {
      m = t[14];
    }
    return m;
  }
  var _ac;
  var bac;
  var hJe;
  var Tac = __lazy(() => {
    F7t();
    ctn();
    et();
    Ot();
    U9e();
    $c();
    Ii();
    _ac = __toESM(pt(), 1);
    bac = __toESM(ot(), 1);
    hJe = __toESM(ie(), 1);
  });
  var Eac = {};