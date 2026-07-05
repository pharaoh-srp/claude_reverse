  __export(Ots, {
    BypassPermissionsModeDialog: () => BypassPermissionsModeDialog
  });
  function BypassPermissionsModeDialog(e) {
    let t = Q3c.c(7);
    let {
      onAccept: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = [];
      t[0] = r;
    } else {
      r = t[0];
    }
    q_r.useEffect(K$f, r);
    let o = q_r.useRef(false);
    let s;
    if (t[1] !== n) {
      s = function (p) {
        if (o.current || isShuttingDown()) {
          return;
        }
        o.current = true;
        e: switch (p) {
          case "accept":
            {
              logEvent("tengu_bypass_permissions_mode_dialog_accept", {});
              updateSettingsForSource("userSettings", {
                skipDangerousModePermissionPrompt: true
              });
              n();
              break e;
            }
          case "decline":
            gracefulShutdownSync(1);
        }
      };
      t[1] = n;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = () => {
        o.current = true;
        gracefulShutdownSync(0);
      };
      t[3] = a;
    } else {
      a = t[3];
    }
    let l = a;
    let c;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      c = dRe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [dRe.jsxs(Text, {
          children: ["In Bypass Permissions mode, Claude Code will not ask for your approval before running potentially dangerous commands.", dRe.jsx(Newline, {}), "This mode should only be used in a sandboxed container/VM that has restricted internet access and can easily be restored if damaged."]
        }), dRe.jsx(Text, {
          children: "By proceeding, you accept all responsibility for actions taken while running in Bypass Permissions mode."
        }), dRe.jsx(Link, {
          url: "https://code.claude.com/docs/en/security"
        })]
      });
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== i) {
      u = dRe.jsxs(or, {
        title: "WARNING: Claude Code running in Bypass Permissions mode",
        color: "error",
        onCancel: l,
        children: [c, dRe.jsx(mc, {
          cancelFirst: true,
          focus: "cancel",
          confirmLabel: "Yes, I accept",
          cancelLabel: "No, exit",
          onConfirm: () => i("accept"),
          onCancel: () => i("decline")
        })]
      });
      t[5] = i;
      t[6] = u;
    } else {
      u = t[6];
    }
    return u;
  }
  function K$f() {
    logEvent("tengu_bypass_permissions_mode_dialog_shown", {});
  }
  var Q3c;
  var q_r;
  var dRe;
  var Dts = __lazy(() => {
    Ot();
    et();
    lm();
    b_();
    Ii();
    Q3c = __toESM(pt(), 1);
    q_r = __toESM(ot(), 1);
    dRe = __toESM(ie(), 1);
  });
  var e4c = {};