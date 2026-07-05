  __export(V3c, {
    ProTrialStartScreen: () => ProTrialStartScreen
  });
  function ProTrialStartScreen(e) {
    let t = W3c.c(9);
    let {
      onDone: n
    } = e;
    let [r, o] = G3c.useState("idle");
    let s;
    if (t[0] !== n || t[1] !== r) {
      s = {
        "confirm:yes": () => {
          if (r === "starting") {
            return;
          }
          if (r === "error") {
            n();
            return;
          }
          o("starting");
          logEvent("tengu_pro_trial_start_pressed", {});
          startProTrial().then(() => {
            logEvent("tengu_pro_trial_start_ok", {});
            n();
          }).catch(p => {
            if (M_(p)) {
              logForDebugging(`Failed to start pro trial: ${he(p)}`, {
                level: "error"
              });
            } else {
              Oe(p);
            }
            logEvent("tengu_pro_trial_start_error", {});
            o("error");
          });
        }
      };
      t[0] = n;
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        context: "Confirmation"
      };
      t[3] = i;
    } else {
      i = t[3];
    }
    jo(s, i);
    let a;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      a = getProTrialDurationDays();
      t[4] = a;
    } else {
      a = t[4];
    }
    let l = a;
    let c;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      c = Mee.jsx(ABe, {});
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      u = Mee.jsx(Text, {
        children: l !== null ? `Your Pro plan includes ${l} days of Claude Code.` : "Your Pro plan includes a Claude Code trial."
      });
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] !== r) {
      d = Mee.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        gap: 1,
        children: [c, u, r === "starting" ? Mee.jsxs(gXd, {
          children: [Mee.jsx(Ed, {}), Mee.jsx(Text, {
            children: " Starting your trial\u2026"
          })]
        }) : r === "error" ? Mee.jsxs(Text, {
          color: "error",
          children: ["Couldn't start your trial. Press ", Mee.jsx(Text, {
            bold: true,
            children: "Enter"
          }), " to continue."]
        }) : Mee.jsxs(Text, {
          color: "permission",
          children: ["Press ", Mee.jsx(Text, {
            bold: true,
            children: "Enter"
          }), " to start your trial"]
        })]
      });
      t[7] = r;
      t[8] = d;
    } else {
      d = t[8];
    }
    return d;
  }
  var W3c;
  var G3c;
  var Mee;
  var z3c = __lazy(() => {
    et();
    Bs();
    Ot();
    Fwt();
    je();
    dt();
    Rn();
    znn();
    cA();
    W3c = __toESM(pt(), 1);
    G3c = __toESM(ot(), 1);
    Mee = __toESM(ie(), 1);
  });
  var J3c = {};
  __export(J3c, {
    PowerupDiscoveryStep: () => PowerupDiscoveryStep
  });
  function PowerupDiscoveryStep(e) {
    let t = K3c.c(9);
    let {
      onDone: n
    } = e;
    let [r, o] = Y3c.useState(false);
    if (r) {
      let d;
      if (t[0] !== n) {
        d = YK.jsx(vlr, {
          onExit: n
        });
        t[0] = n;
        t[1] = d;
      } else {
        d = t[1];
      }
      return d;
    }
    let s;
    if (t[2] !== n) {
      s = function (p) {
        if (logEvent("tengu_powerup_discovery_shown", {
          arm: "step",
          action: p
        }), p === "launch") {
          o(true);
        } else {
          n();
        }
      };
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i = s;
    let a;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      a = YK.jsx(ABe, {});
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      l = YK.jsxs(gXd, {
        children: [YK.jsx(Text, {
          bold: true,
          children: POWERUP_DISCOVERY_COPY.heading
        }), YK.jsxs(Text, {
          dimColor: true,
          children: [" 0/", yK.length, " "]
        }), YK.jsx(e9, {
          ratio: 0,
          width: 16,
          fillColor: "claude",
          emptyColor: "inactive"
        })]
      });
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      c = YK.jsx(gXd, {
        width: 70,
        children: YK.jsx(Text, {
          children: POWERUP_DISCOVERY_COPY.body
        })
      });
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== i) {
      u = YK.jsxs(gXd, {
        flexDirection: "column",
        children: [a, YK.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          paddingLeft: 1,
          marginTop: 1,
          children: [l, c, YK.jsx(mc, {
            confirmLabel: "Take the tour",
            cancelLabel: "Skip for now",
            onConfirm: () => i("launch"),
            onCancel: () => i("skip")
          })]
        })]
      });
      t[7] = i;
      t[8] = u;
    } else {
      u = t[8];
    }
    return u;
  }
  var K3c;
  var Y3c;
  var YK;
  var X3c = __lazy(() => {
    Ylr();
    et();
    Ot();
    b_();
    LMe();
    znn();
    EWo();
    wWo();
    K3c = __toESM(pt(), 1);
    Y3c = __toESM(ot(), 1);
    YK = __toESM(ie(), 1);
  });
  var Ots = {};