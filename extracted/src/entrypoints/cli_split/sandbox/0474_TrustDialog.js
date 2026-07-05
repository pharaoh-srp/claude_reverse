  __export(j3c, {
    TrustDialog: () => TrustDialog
  });
  function TrustDialog(e) {
    let t = H3c.c(45);
    let {
      onDone: n,
      commands: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = getMcpConfigsByScope("project");
      t[0] = o;
    } else {
      o = t[0];
    }
    let {
      servers: s
    } = o;
    let i;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = Object.keys(s);
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i.length > 0;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = k3c();
      t[2] = l;
    } else {
      l = t[2];
    }
    let u = l.length > 0;
    let d;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      d = O3c();
      t[3] = d;
    } else {
      d = t[3];
    }
    let p = d;
    let m = I3c();
    let f = m.sources.length > 0;
    let h = P3c();
    let g = h.sources.length > 0;
    let y;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      y = N3c();
      t[4] = y;
    } else {
      y = t[4];
    }
    let b = y.length > 0;
    let S;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      S = L3c();
      t[5] = S;
    } else {
      S = t[5];
    }
    let C = S.length > 0;
    let x;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      x = F3c();
      t[6] = x;
    } else {
      x = t[6];
    }
    let k = x.length > 0;
    let I;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      I = D3c();
      t[7] = I;
    } else {
      I = t[7];
    }
    let M = I.length > 0;
    let L;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      L = U3c();
      t[8] = L;
    } else {
      L = t[8];
    }
    let F = L.length > 0;
    let H;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      H = B3c();
      t[9] = H;
    } else {
      H = t[9];
    }
    let N = H.length > 0;
    let W;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      W = M3c();
      t[10] = W;
    } else {
      W = t[10];
    }
    let z = W.length > 0;
    let V;
    if (t[11] !== r) {
      V = r?.some(q$f) ?? false;
      t[11] = r;
      t[12] = V;
    } else {
      V = t[12];
    }
    let K = V;
    let J;
    if (t[13] !== r) {
      J = r?.some(H$f) ?? false;
      t[13] = r;
      t[14] = J;
    } else {
      J = t[14];
    }
    let Q = J;
    let Z = p.length > 0 || K || Q;
    let ne = checkHasTrustDialogAccepted();
    let oe;
    let ee;
    if (t[15] !== Z) {
      oe = () => {
        let Ye = Pts.homedir() === Nt();
        logEvent("tengu_trust_dialog_shown", {
          isHomeDir: Ye,
          hasMcpServers: a,
          hasHooks: u,
          hasBashExecution: Z,
          hasProjectAllowRules: f,
          hasProjectAddDirs: g,
          hasApiKeyHelper: b,
          hasAwsCommands: C,
          hasGcpCommands: k,
          hasOtelHeadersHelper: M,
          hasProxyAuthHelper: F,
          hasDangerousEnvVars: N,
          hasAutoMemoryDirectory: z
        });
      };
      ee = [a, u, Z, f, g, b, C, k, M, F, N, z];
      t[15] = Z;
      t[16] = oe;
      t[17] = ee;
    } else {
      oe = t[16];
      ee = t[17];
    }
    j_r.useEffect(oe, ee);
    let re = j_r.useRef(false);
    let se;
    if (t[18] !== Z || t[19] !== n) {
      se = function (ht) {
        if (re.current || isShuttingDown()) {
          return;
        }
        if (re.current = true, ht === "exit") {
          Ae("onboarding_trust_dialog", "onboarding_trust_denied");
          gracefulShutdownSync(1);
          return;
        }
        let It = Pts.homedir() === Nt();
        if (Pe("onboarding_trust_dialog"), logEvent("tengu_trust_dialog_accept", {
          isHomeDir: It,
          hasMcpServers: a,
          hasHooks: u,
          hasBashExecution: Z,
          hasProjectAllowRules: f,
          hasProjectAddDirs: g,
          hasApiKeyHelper: b,
          hasAwsCommands: C,
          hasGcpCommands: k,
          hasOtelHeadersHelper: M,
          hasProxyAuthHelper: F,
          hasDangerousEnvVars: N,
          hasAutoMemoryDirectory: z
        }), It) {
          setSessionTrustAccepted(true);
        } else {
          saveCurrentProjectConfig($$f);
        }
        n();
      };
      t[18] = Z;
      t[19] = n;
      t[20] = se;
    } else {
      se = t[20];
    }
    let ae = se;
    let de;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      de = () => {
        re.current = true;
        gracefulShutdownSync(1);
      };
      t[21] = de;
    } else {
      de = t[21];
    }
    let be = Eg(de);
    let fe;
    if (t[22] !== ae) {
      fe = () => {
        if (bq()) {
          ae("exit");
          return;
        }
        re.current = true;
        gracefulShutdownSync(0);
      };
      t[22] = ae;
      t[23] = fe;
    } else {
      fe = t[23];
    }
    let me;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      me = {
        context: "Confirmation"
      };
      t[24] = me;
    } else {
      me = t[24];
    }
    if (uo("confirm:no", fe, me), ne) {
      queueMicrotask(n);
      return null;
    }
    let Te = qm;
    let ue = "warning";
    let ce = "warning";
    let le = "Accessing workspace:";
    let pe = gXd;
    let ve = "column";
    let _e = 1;
    let xe = 1;
    let ke;
    let Ie;
    let Ue;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      ke = PT.jsx(Text, {
        bold: true,
        children: aCt(zt().cwd())
      });
      Ie = PT.jsxs(Text, {
        children: ["Quick safety check: Is this a project you created or one you trust? (Like your own code, a well-known open source project, or work from your team). If not, take a moment to review what", "'", "s in this folder first."]
      });
      Ue = PT.jsxs(Text, {
        children: ["Claude Code", "'", "ll be able to read, edit, and execute files here."]
      });
      t[25] = ke;
      t[26] = Ie;
      t[27] = Ue;
    } else {
      ke = t[25];
      Ie = t[26];
      Ue = t[27];
    }
    let Ge = (f || g) && PT.jsxs(gXd, {
      flexDirection: "column",
      children: [f && PT.jsxs(PT.Fragment, {
        children: [PT.jsxs(Text, {
          bold: true,
          color: "warning",
          children: [PT.jsx(Ps, {
            status: "warning",
            withSpace: true
          }), "This folder pre-approves ", m.rawCount, " ", un(m.rawCount, "tool permission"), " in", " ", csn(m.sources), ":"]
        }), PT.jsxs(Text, {
          children: ["  ", m.rules.length > 0 ? csn(m.rules, 8) : "(rule names contain unprintable characters)"]
        })]
      }), g && PT.jsxs(PT.Fragment, {
        children: [PT.jsxs(Text, {
          bold: true,
          color: "warning",
          children: [PT.jsx(Ps, {
            status: "warning",
            withSpace: true
          }), "This folder adds ", h.rawCount, " ", un(h.rawCount, "directory", "directories"), " ", "to the workspace in", " ", csn(h.sources), ":"]
        }), PT.jsxs(Text, {
          children: ["  ", h.dirs.length > 0 ? csn(h.dirs, 6) : "(directory names contain unprintable characters)"]
        })]
      }), PT.jsx(Text, {
        dimColor: true,
        children: "These will apply without asking. Only proceed if you trust this configuration."
      })]
    });
    let Be;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      Be = PT.jsx(Text, {
        dimColor: true,
        children: PT.jsx(Link, {
          url: "https://code.claude.com/docs/en/security",
          children: "Security guide"
        })
      });
      t[28] = Be;
    } else {
      Be = t[28];
    }
    let We;
    if (t[29] !== ae) {
      We = PT.jsx(mc, {
        confirmLabel: "Yes, I trust this folder",
        cancelLabel: "No, exit",
        onConfirm: () => ae("enable_all"),
        onCancel: () => ae("exit")
      });
      t[29] = ae;
      t[30] = We;
    } else {
      We = t[30];
    }
    let Ze;
    if (t[31] !== be.keyName || t[32] !== be.pending) {
      Ze = PT.jsx(Text, {
        dimColor: true,
        children: be.pending ? PT.jsxs(PT.Fragment, {
          children: ["Press ", be.keyName, " again to exit"]
        }) : PT.jsxs(Hn, {
          children: [PT.jsx(xt, {
            chord: "enter",
            action: "confirm"
          }), PT.jsx(xt, {
            chord: "escape",
            action: "cancel"
          })]
        })
      });
      t[31] = be.keyName;
      t[32] = be.pending;
      t[33] = Ze;
    } else {
      Ze = t[33];
    }
    let Tt;
    if (t[34] !== pe || t[35] !== ke || t[36] !== Ie || t[37] !== Ue || t[38] !== Ge || t[39] !== We || t[40] !== Ze) {
      Tt = PT.jsxs(pe, {
        flexDirection: ve,
        gap: _e,
        paddingTop: xe,
        children: [ke, Ie, Ue, Ge, Be, We, Ze]
      });
      t[34] = pe;
      t[35] = ke;
      t[36] = Ie;
      t[37] = Ue;
      t[38] = Ge;
      t[39] = We;
      t[40] = Ze;
      t[41] = Tt;
    } else {
      Tt = t[41];
    }
    let kt;
    if (t[42] !== Te || t[43] !== Tt) {
      kt = PT.jsx(Te, {
        color: ue,
        titleColor: ce,
        title: le,
        children: Tt
      });
      t[42] = Te;
      t[43] = Tt;
      t[44] = kt;
    } else {
      kt = t[44];
    }
    return kt;
  }
  function $$f(e) {
    return {
      ...e,
      hasTrustDialogAccepted: true
    };
  }
  function H$f(e) {
    return e.type === "prompt" && (e.loadedFrom === "skills" || e.loadedFrom === "plugin") && (e.source === "projectSettings" || e.source === "localSettings" || e.source === "plugin") && e.allowedTools?.some(j$f);
  }
  function j$f(e) {
    return e === "Bash" || e.startsWith("Bash" + "(");
  }
  function q$f(e) {
    return e.type === "prompt" && e.loadedFrom === "commands_DEPRECATED" && (e.source === "projectSettings" || e.source === "localSettings") && e.allowedTools?.some(W$f);
  }
  function W$f(e) {
    return e === "Bash" || e.startsWith("Bash" + "(");
  }
  var H3c;
  var Pts;
  var j_r;
  var PT;
  var q3c = __lazy(() => {
    Ot();
    at();
    mO();
    et();
    Bs();
    ln();
    Iw();
    vo();
    lm();
    mut();
    Zn();
    eur();
    Ai();
    b_();
    bs();
    Vf();
    XI();
    $3c();
    H3c = __toESM(pt(), 1);
    Pts = require("os");
    j_r = __toESM(ot(), 1);
    PT = __toESM(ie(), 1);
  });
  var V3c = {};