  async function KQ(e, t) {
    let n = uc("preferredNotifChannel", "auto").value;
    await executeNotificationHooks(e);
    let r = await Dfm(n, e, t);
    if (r === "error") {
      Ae("notification_show", "send_failed");
    } else {
      Pe("notification_show");
    }
    logEvent("tengu_notification_method_used", {
      configured_channel: n,
      method_used: r,
      term: Me.terminal,
      attacher_term: getAttacherCaps()?.terminal ?? null
    });
  }
  async function Dfm(e, t, n) {
    let r = t.title || "Claude Code";
    try {
      switch (e) {
        case "auto":
          return Mfm(t, n);
        case "iterm2":
          n.notifyITerm2(t);
          return "iterm2";
        case "iterm2_with_bell":
          n.notifyITerm2(t);
          n.notifyBell();
          return "iterm2_with_bell";
        case "kitty":
          n.notifyKitty({
            ...t,
            title: r,
            id: spl()
          });
          return "kitty";
        case "ghostty":
          n.notifyGhostty({
            ...t,
            title: r
          });
          return "ghostty";
        case "terminal_bell":
          n.notifyBell();
          return "terminal_bell";
        case "notifications_disabled":
          return "disabled";
        default:
          return "none";
      }
    } catch {
      return "error";
    }
  }
  async function Mfm(e, t) {
    let n = e.title || "Claude Code";
    switch (getAttacherCaps()?.terminal ?? Me.terminal) {
      case "Apple_Terminal":
        {
          if (await Nfm()) {
            t.notifyBell();
            return "terminal_bell";
          }
          return "no_method_available";
        }
      case "iTerm.app":
        t.notifyITerm2(e);
        return "iterm2";
      case "kitty":
        t.notifyKitty({
          ...e,
          title: n,
          id: spl()
        });
        return "kitty";
      case "ghostty":
        t.notifyGhostty({
          ...e,
          title: n
        });
        return "ghostty";
      default:
        return "no_method_available";
    }
  }
  function spl() {
    return Math.floor(Math.random() * 1e4);
  }
  async function Nfm() {
    try {
      if ((getAttacherCaps()?.terminal ?? Me.terminal) !== "Apple_Terminal") {
        return false;
      }
      let t = (await execFileNoThrow("osascript", ["-e", 'tell application "Terminal" to name of current settings of front window'])).stdout.trim();
      if (!t) {
        return false;
      }
      let n = await execFileNoThrow("defaults", ["export", "com.apple.Terminal", "-"]);
      if (n.code !== 0) {
        return false;
      }
      let i = (await Promise.resolve().then(() => __toESM(rpl(), 1))).parse(n.stdout)?.["Window Settings"]?.[t];
      if (!i) {
        return false;
      }
      return i.Bell === false;
    } catch (e) {
      logForDebugging(`Failed to read Apple Terminal bell setting: ${e instanceof Error ? e.message : String(e)}`, {
        level: "error"
      });
      return false;
    }
  }
  var mbt = __lazy(() => {
    at();
    je();
    pr();
    ji();
    Sp();
    zg();
    ln();
    Ot();
  });
  function _E(e) {
    let t = ipl.c(10);
    let {
      children: n,
      color: r,
      title: o
    } = e;
    let s = useIsScreenReaderEnabled();
    let i = s ? undefined : "round";
    let a = s ? 0 : 1;
    let l = o ? 1 : 0;
    let c;
    if (t[0] !== r || t[1] !== o) {
      c = o && sJn.jsx(Text, {
        bold: true,
        color: r,
        children: o
      });
      t[0] = r;
      t[1] = o;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u;
    if (t[3] !== n || t[4] !== r || t[5] !== i || t[6] !== a || t[7] !== l || t[8] !== c) {
      u = sJn.jsxs(gXd, {
        borderStyle: i,
        borderColor: r,
        flexDirection: "column",
        paddingX: a,
        gap: l,
        children: [c, n]
      });
      t[3] = n;
      t[4] = r;
      t[5] = i;
      t[6] = a;
      t[7] = l;
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  var ipl;
  var sJn;
  var Az = __lazy(() => {
    et();
    IPe();
    ipl = __toESM(pt(), 1);
    sJn = __toESM(ie(), 1);
  });
  function aJn() {
    let e = apl.c(10);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = KD.getInstance().getStatus();
      e[0] = t;
    } else {
      t = e[0];
    }
    let [n, r] = iJn.useState(t);
    let o;
    let s;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      o = () => KD.getInstance().subscribe(r);
      s = [];
      e[1] = o;
      e[2] = s;
    } else {
      o = e[1];
      s = e[2];
    }
    if (iJn.useEffect(o, s), !n.isAuthenticating && !n.error && n.output.length === 0) {
      return null;
    }
    if (!n.isAuthenticating && !n.error) {
      return null;
    }
    let i;
    if (e[3] !== n.output) {
      i = n.output.length > 0 && yve.jsx(gXd, {
        flexDirection: "column",
        children: n.output.slice(-5).map(Ffm)
      });
      e[3] = n.output;
      e[4] = i;
    } else {
      i = e[4];
    }
    let a;
    if (e[5] !== n.error) {
      a = n.error && yve.jsx(Hc, {
        error: n.error
      });
      e[5] = n.error;
      e[6] = a;
    } else {
      a = e[6];
    }
    let l;
    if (e[7] !== i || e[8] !== a) {
      l = yve.jsx(gXd, {
        marginY: 1,
        children: yve.jsxs(_E, {
          color: "permission",
          title: "Cloud authentication",
          children: [i, a]
        })
      });
      e[7] = i;
      e[8] = a;
      e[9] = l;
    } else {
      l = e[9];
    }
    return l;
  }
  function Ffm(e, t) {
    let n = e.match(Lfm);
    if (!n) {
      return yve.jsx(Text, {
        dimColor: true,
        children: e
      }, t);
    }
    let r = n[0];
    let o = n.index ?? 0;
    let s = e.slice(0, o);
    let i = e.slice(o + r.length);
    return yve.jsxs(Text, {
      dimColor: true,
      children: [s, yve.jsx(Link, {
        url: r,
        children: r
      }), i]
    }, t);
  }
  var apl;
  var iJn;
  var yve;
  var Lfm;
  var UIo = __lazy(() => {
    et();
    ICn();
    bv();
    Az();
    apl = __toESM(pt(), 1);
    iJn = __toESM(ot(), 1);
    yve = __toESM(ie(), 1);
    Lfm = /https?:\/\/\S+/;
  });
  function Qzt(e) {
    let t = lpl.c(38);
    let {
      steps: n,
      initialData: r,
      onComplete: o,
      onCancel: s,
      children: i,
      title: a,
      showStepCounter: l
    } = e;
    let c;
    if (t[0] !== r) {
      c = r === undefined ? {} : r;
      t[0] = r;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d = l === undefined ? true : l;
    let [p, m] = _ve.useState(0);
    let [f, h] = _ve.useState(u);
    let [g, y] = _ve.useState(false);
    let _;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      _ = [];
      t[2] = _;
    } else {
      _ = t[2];
    }
    let [b, S] = _ve.useState(_);
    Eg();
    let E;
    let C;
    if (t[3] !== g || t[4] !== o || t[5] !== f) {
      E = () => {
        if (g) {
          S([]);
          o(f);
        }
      };
      C = [g, f, o];
      t[3] = g;
      t[4] = o;
      t[5] = f;
      t[6] = E;
      t[7] = C;
    } else {
      E = t[6];
      C = t[7];
    }
    _ve.useEffect(E, C);
    let x;
    if (t[8] !== p || t[9] !== b || t[10] !== n.length) {
      x = () => {
        if (p < n.length - 1) {
          if (b.length > 0) {
            S(V => [...V, p]);
          }
          m($fm);
        } else {
          y(true);
        }
      };
      t[8] = p;
      t[9] = b;
      t[10] = n.length;
      t[11] = x;
    } else {
      x = t[11];
    }
    let A = x;
    let k;
    if (t[12] !== p || t[13] !== b || t[14] !== s) {
      k = () => {
        if (b.length > 0) {
          let V = b.at(-1);
          if (V !== undefined) {
            S(Bfm);
            m(V);
          }
        } else if (p > 0) {
          m(Ufm);
        } else if (s) {
          s();
        }
      };
      t[12] = p;
      t[13] = b;
      t[14] = s;
      t[15] = k;
    } else {
      k = t[15];
    }
    let I = k;
    let O;
    if (t[16] !== p || t[17] !== n.length) {
      O = V => {
        if (V >= 0 && V < n.length) {
          S(K => [...K, p]);
          m(V);
        }
      };
      t[16] = p;
      t[17] = n.length;
      t[18] = O;
    } else {
      O = t[18];
    }
    let M = O;
    let L;
    if (t[19] !== s) {
      L = () => {
        if (S([]), s) {
          s();
        }
      };
      t[19] = s;
      t[20] = L;
    } else {
      L = t[20];
    }
    let P = L;
    let F;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      F = V => {
        h(K => ({
          ...K,
          ...V
        }));
      };
      t[21] = F;
    } else {
      F = t[21];
    }
    let H = F;
    let U;
    if (t[22] !== P || t[23] !== p || t[24] !== I || t[25] !== A || t[26] !== M || t[27] !== d || t[28] !== n.length || t[29] !== a || t[30] !== f) {
      U = {
        currentStepIndex: p,
        totalSteps: n.length,
        wizardData: f,
        setWizardData: h,
        updateWizardData: H,
        goNext: A,
        goBack: I,
        goToStep: M,
        cancel: P,
        title: a,
        showStepCounter: d
      };
      t[22] = P;
      t[23] = p;
      t[24] = I;
      t[25] = A;
      t[26] = M;
      t[27] = d;
      t[28] = n.length;
      t[29] = a;
      t[30] = f;
      t[31] = U;
    } else {
      U = t[31];
    }
    let N = U;
    let W = n[p];
    if (!W || g) {
      return null;
    }
    let j;
    if (t[32] !== W || t[33] !== i) {
      j = i || BIo.jsx(W, {});
      t[32] = W;
      t[33] = i;
      t[34] = j;
    } else {
      j = t[34];
    }
    let z;
    if (t[35] !== N || t[36] !== j) {
      z = BIo.jsx($Io.Provider, {
        value: N,
        children: j
      });
      t[35] = N;
      t[36] = j;
      t[37] = z;
    } else {
      z = t[37];
    }
    return z;
  }
  function Ufm(e) {
    return e - 1;
  }
  function Bfm(e) {
    return e.slice(0, -1);
  }
  function $fm(e) {
    return e + 1;
  }
  var lpl;
  var _ve;
  var BIo;
  var $Io;
  var HIo = __lazy(() => {
    mO();
    lpl = __toESM(pt(), 1);
    _ve = __toESM(ot(), 1);
    BIo = __toESM(ie(), 1);
    $Io = _ve.createContext(null);
  });
  function E_() {
    let e = cpl.useContext($Io);
    if (!e) {
      throw Error("useWizard must be used within a WizardProvider");
    }
    return e;
  }
  var cpl;
  var jIo = __lazy(() => {
    HIo();
    cpl = __toESM(ot(), 1);
  });
  function rh(e) {
    let t = upl.c(14);
    let {
      title: n,
      color: r,
      children: o,
      subtitle: s,
      footerText: i
    } = e;
    let a = r === undefined ? "suggestion" : r;
    let {
      currentStepIndex: l,
      totalSteps: c,
      title: u,
      showStepCounter: d,
      goBack: p
    } = E_();
    let m = n || u || "Wizard";
    let f = d !== false ? ` (${l + 1}/${c})` : "";
    let h = `${m}${f}`;
    let g;
    if (t[0] !== o || t[1] !== a || t[2] !== p || t[3] !== s || t[4] !== h) {
      g = YQ.jsx(or, {
        title: h,
        subtitle: s,
        onCancel: p,
        color: a,
        hideInputGuide: true,
        isCancelActive: false,
        children: o
      });
      t[0] = o;
      t[1] = a;
      t[2] = p;
      t[3] = s;
      t[4] = h;
      t[5] = g;
    } else {
      g = t[5];
    }
    let y;
    if (t[6] !== l || t[7] !== i) {
      y = i ?? YQ.jsxs(Hn, {
        children: [YQ.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), YQ.jsx(xt, {
          chord: "enter",
          action: "select"
        }), YQ.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: l > 0 ? "go back" : "cancel"
        })]
      });
      t[6] = l;
      t[7] = i;
      t[8] = y;
    } else {
      y = t[8];
    }
    let _;
    if (t[9] !== y) {
      _ = YQ.jsx(gXd, {
        marginLeft: 2,
        marginTop: 1,
        children: YQ.jsx(Lw, {
          children: y
        })
      });
      t[9] = y;
      t[10] = _;
    } else {
      _ = t[10];
    }
    let b;
    if (t[11] !== g || t[12] !== _) {
      b = YQ.jsxs(YQ.Fragment, {
        children: [g, _]
      });
      t[11] = g;
      t[12] = _;
      t[13] = b;
    } else {
      b = t[13];
    }
    return b;
  }
  var upl;
  var YQ;
  var J$ = __lazy(() => {
    et();
    Sd();
    Ai();
    Ii();
    fz();
    bs();
    jIo();
    upl = __toESM(pt(), 1);
    YQ = __toESM(ie(), 1);
  });
  var Z1 = __lazy(() => {
    jIo();
    J$();
    HIo();
  });
  function q1e(e) {
    let t = WIo.c(107);
    let {
      title: n,
      subtitle: r,
      fields: o,
      values: s,
      onChange: i,
      onSubmit: a,
      onCancel: l,
      submitLabel: c
    } = e;
    let u = c === undefined ? "Save" : c;
    let d = o.length + 1;
    let [p, m] = qIo.useState(0);
    let f;
    if (t[0] !== o[0] || t[1] !== s) {
      f = () => {
        let Ue = o[0];
        return Ue?.type === "text" ? (s[Ue.key] ?? "").length : 0;
      };
      t[0] = o[0];
      t[1] = s;
      t[2] = f;
    } else {
      f = t[2];
    }
    let [h, g] = qIo.useState(f);
    let y = p < o.length ? o[p] : null;
    let _ = y?.type === "text";
    let b;
    if (t[3] !== o) {
      b = Math.max(...o.map(jfm));
      t[3] = o;
      t[4] = b;
    } else {
      b = t[4];
    }
    let S = b;
    let E;
    if (t[5] !== s) {
      E = function (Ge) {
        if (Ge.type !== "text") {
          return null;
        }
        let Be = s[Ge.key] ?? "";
        if (Ge.required && Be.trim() === "") {
          return `${Ge.label} is required`;
        }
        return Ge.validate ? Ge.validate(Be, s) : null;
      };
      t[5] = s;
      t[6] = E;
    } else {
      E = t[6];
    }
    let C = E;
    let x;
    if (t[7] !== C || t[8] !== o) {
      x = o.map(C).find(Hfm);
      t[7] = C;
      t[8] = o;
      t[9] = x;
    } else {
      x = t[9];
    }
    let A = x;
    let k;
    if (t[10] !== o || t[11] !== p || t[12] !== d || t[13] !== s) {
      k = function (Ge) {
        let Be = Math.max(0, Math.min(d - 1, Ge));
        if (Be === p) {
          return;
        }
        m(Be);
        let We = o[Be];
        if (We?.type === "text") {
          g((s[We.key] ?? "").length);
        }
      };
      t[10] = o;
      t[11] = p;
      t[12] = d;
      t[13] = s;
      t[14] = k;
    } else {
      k = t[14];
    }
    let I = k;
    let O;
    if (t[15] !== A || t[16] !== a) {
      O = function () {
        if (A) {
          return;
        }
        a();
      };
      t[15] = A;
      t[16] = a;
      t[17] = O;
    } else {
      O = t[17];
    }
    let M = O;
    let L;
    if (t[18] !== y || t[19] !== i || t[20] !== s) {
      L = function (Ge) {
        if (y?.type !== "select") {
          return;
        }
        let Be = y.options;
        let We = s[y.key] ?? Be[0]?.value ?? "";
        let Ze = Be.findIndex(kt => kt.value === We);
        let Tt = Be[(Ze + Ge + Be.length) % Be.length];
        if (Tt) {
          i(y.key, Tt.value);
        }
      };
      t[18] = y;
      t[19] = i;
      t[20] = s;
      t[21] = L;
    } else {
      L = t[21];
    }
    let P = L;
    let F;
    let H;
    if (t[22] !== p || t[23] !== I) {
      H = () => I(p - 1);
      F = () => I(p + 1);
      t[22] = p;
      t[23] = I;
      t[24] = F;
      t[25] = H;
    } else {
      F = t[24];
      H = t[25];
    }
    let U;
    if (t[26] !== p || t[27] !== I || t[28] !== d || t[29] !== M) {
      U = () => {
        if (p === d - 1) {
          M();
        } else {
          I(p + 1);
        }
      };
      t[26] = p;
      t[27] = I;
      t[28] = d;
      t[29] = M;
      t[30] = U;
    } else {
      U = t[30];
    }
    let N;
    if (t[31] !== l || t[32] !== F || t[33] !== U || t[34] !== H) {
      N = {
        "select:previous": H,
        "select:next": F,
        "select:accept": U,
        "select:cancel": l
      };
      t[31] = l;
      t[32] = F;
      t[33] = U;
      t[34] = H;
      t[35] = N;
    } else {
      N = t[35];
    }
    let W = !_;
    let j;
    if (t[36] !== W) {
      j = {
        context: "Select",
        isActive: W
      };
      t[36] = W;
      t[37] = j;
    } else {
      j = t[37];
    }
    jo(N, j);
    let z;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      z = {
        context: "Settings"
      };
      t[38] = z;
    } else {
      z = t[38];
    }
    uo("confirm:no", l, z);
    let V;
    if (t[39] !== P) {
      V = {
        "tabs:previous": () => P(-1),
        "tabs:next": () => P(1)
      };
      t[39] = P;
      t[40] = V;
    } else {
      V = t[40];
    }
    let K = y?.type === "select";
    let J;
    if (t[41] !== K) {
      J = {
        context: "Tabs",
        isActive: K
      };
      t[41] = K;
      t[42] = J;
    } else {
      J = t[42];
    }
    jo(V, J);
    let Q = y ? s[y.key] ?? "" : "";
    let Z;
    if (t[43] !== y || t[44] !== Q || t[45] !== s) {
      Z = y?.type === "text" && y.validate ? y.validate(Q, s) : null;
      t[43] = y;
      t[44] = Q;
      t[45] = s;
      t[46] = Z;
    } else {
      Z = t[46];
    }
    let ne = Z;
    let oe;
    if (t[47] !== ne || t[48] !== y || t[49] !== Q || t[50] !== s) {
      oe = !ne && y?.hint ? y.hint(Q, s) : undefined;
      t[47] = ne;
      t[48] = y;
      t[49] = Q;
      t[50] = s;
      t[51] = oe;
    } else {
      oe = t[51];
    }
    let ee = oe;
    let re;
    if (t[52] !== h || t[53] !== o || t[54] !== p || t[55] !== S || t[56] !== I || t[57] !== l || t[58] !== i || t[59] !== M || t[60] !== s) {
      let Ue;
      if (t[62] !== h || t[63] !== o.length || t[64] !== p || t[65] !== S || t[66] !== I || t[67] !== l || t[68] !== i || t[69] !== M || t[70] !== s) {
        Ue = (Ge, Be) => {
          let We = Be === p;
          let Ze = s[Ge.key] ?? "";
          return Z_.jsx(qfm, {
            field: Ge,
            value: Ze,
            isFocused: We,
            labelWidth: S,
            cursor: h,
            setCursor: g,
            onChange: Tt => i(Ge.key, Tt),
            onCancel: l,
            onUp: () => I(Be - 1),
            onDown: () => I(Be + 1),
            onEnter: () => {
              if (Be === o.length - 1) {
                M();
              } else {
                I(Be + 1);
              }
            }
          }, Ge.key);
        };
        t[62] = h;
        t[63] = o.length;
        t[64] = p;
        t[65] = S;
        t[66] = I;
        t[67] = l;
        t[68] = i;
        t[69] = M;
        t[70] = s;
        t[71] = Ue;
      } else {
        Ue = t[71];
      }
      re = o.map(Ue);
      t[52] = h;
      t[53] = o;
      t[54] = p;
      t[55] = S;
      t[56] = I;
      t[57] = l;
      t[58] = i;
      t[59] = M;
      t[60] = s;
      t[61] = re;
    } else {
      re = t[61];
    }
    let se = p === d - 1 ? "suggestion" : undefined;
    let ae = p === d - 1 ? vGd.pointer : " ";
    let de;
    if (t[72] !== se || t[73] !== ae) {
      de = Z_.jsxs(Text, {
        color: se,
        children: [ae, " "]
      });
      t[72] = se;
      t[73] = ae;
      t[74] = de;
    } else {
      de = t[74];
    }
    let be = p === d - 1;
    let fe = !!A;
    let me;
    if (t[75] !== u || t[76] !== be || t[77] !== fe) {
      me = Z_.jsx(Text, {
        bold: be,
        dimColor: fe,
        children: u
      });
      t[75] = u;
      t[76] = be;
      t[77] = fe;
      t[78] = me;
    } else {
      me = t[78];
    }
    let Te;
    if (t[79] !== A || t[80] !== p || t[81] !== d) {
      Te = A && p === d - 1 && Z_.jsxs(Text, {
        color: "error",
        children: [" \xB7 ", A]
      });
      t[79] = A;
      t[80] = p;
      t[81] = d;
      t[82] = Te;
    } else {
      Te = t[82];
    }
    let ue;
    if (t[83] !== de || t[84] !== me || t[85] !== Te) {
      ue = Z_.jsxs(gXd, {
        marginTop: 1,
        children: [de, me, Te]
      });
      t[83] = de;
      t[84] = me;
      t[85] = Te;
      t[86] = ue;
    } else {
      ue = t[86];
    }
    let ce;
    if (t[87] !== ne || t[88] !== ee) {
      ce = Z_.jsx(gXd, {
        marginTop: 1,
        minHeight: 1,
        children: ne ? Z_.jsx(Hc, {
          error: ne
        }) : ee ? Z_.jsx(Text, {
          dimColor: true,
          children: ee
        }) : Z_.jsx(Text, {
          children: " "
        })
      });
      t[87] = ne;
      t[88] = ee;
      t[89] = ce;
    } else {
      ce = t[89];
    }
    let le;
    if (t[90] === Symbol.for("react.memo_cache_sentinel")) {
      le = Z_.jsx(xt, {
        chord: ["up", "down"],
        action: "move"
      });
      t[90] = le;
    } else {
      le = t[90];
    }
    let pe;
    if (t[91] !== y?.type) {
      pe = y?.type === "select" && Z_.jsx(xt, {
        chord: ["left", "right"],
        action: "change"
      });
      t[91] = y?.type;
      t[92] = pe;
    } else {
      pe = t[92];
    }
    let ve;
    let _e;
    if (t[93] === Symbol.for("react.memo_cache_sentinel")) {
      ve = Z_.jsx(xt, {
        chord: "enter",
        action: "continue"
      });
      _e = Z_.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[93] = ve;
      t[94] = _e;
    } else {
      ve = t[93];
      _e = t[94];
    }
    let xe;
    if (t[95] !== pe) {
      xe = Z_.jsx(gXd, {
        marginTop: 1,
        children: Z_.jsx(Text, {
          dimColor: true,
          children: Z_.jsxs(Hn, {
            children: [le, pe, ve, _e]
          })
        })
      });
      t[95] = pe;
      t[96] = xe;
    } else {
      xe = t[96];
    }
    let ke;
    if (t[97] !== re || t[98] !== ue || t[99] !== ce || t[100] !== xe) {
      ke = Z_.jsxs(gXd, {
        flexDirection: "column",
        children: [re, ue, ce, xe]
      });
      t[97] = re;
      t[98] = ue;
      t[99] = ce;
      t[100] = xe;
      t[101] = ke;
    } else {
      ke = t[101];
    }
    let Ie;
    if (t[102] !== l || t[103] !== r || t[104] !== ke || t[105] !== n) {
      Ie = Z_.jsx(or, {
        title: n,
        subtitle: r,
        onCancel: l,
        hideInputGuide: true,
        isCancelActive: false,
        children: ke
      });
      t[102] = l;
      t[103] = r;
      t[104] = ke;
      t[105] = n;
      t[106] = Ie;
    } else {
      Ie = t[106];
    }
    return Ie;
  }
  function Hfm(e) {
    return e !== null;
  }
  function jfm(e) {
    return an(e.label);
  }
  function qfm(e) {
    let t = WIo.c(44);
    let {
      field: n,
      value: r,
      isFocused: o,
      labelWidth: s,
      cursor: i,
      setCursor: a,
      onChange: l,
      onCancel: c,
      onUp: u,
      onDown: d,
      onEnter: p
    } = e;
    let m;
    if (t[0] !== n.label || t[1] !== s) {
      m = " ".repeat(Math.max(0, s - an(n.label)));
      t[0] = n.label;
      t[1] = s;
      t[2] = m;
    } else {
      m = t[2];
    }
    let f = m;
    let h;
    if (t[3] !== n.required || t[4] !== n.type || t[5] !== r) {
      h = n.type === "text" && n.required && r.trim() === "";
      t[3] = n.required;
      t[4] = n.type;
      t[5] = r;
      t[6] = h;
    } else {
      h = t[6];
    }
    let g = h;
    let y = o ? "suggestion" : undefined;
    let _ = o ? vGd.pointer : " ";
    let b;
    if (t[7] !== y || t[8] !== _) {
      b = Z_.jsxs(Text, {
        color: y,
        children: [_, " "]
      });
      t[7] = y;
      t[8] = _;
      t[9] = b;
    } else {
      b = t[9];
    }
    let S = b;
    let E = !o;
    let C;
    if (t[10] !== g) {
      C = g ? Z_.jsx(Text, {
        color: "error",
        children: "*"
      }) : " ";
      t[10] = g;
      t[11] = C;
    } else {
      C = t[11];
    }
    let x;
    if (t[12] !== n.label || t[13] !== f || t[14] !== E || t[15] !== C) {
      x = Z_.jsxs(Text, {
        dimColor: E,
        children: [n.label, C, f, " "]
      });
      t[12] = n.label;
      t[13] = f;
      t[14] = E;
      t[15] = C;
      t[16] = x;
    } else {
      x = t[16];
    }
    let A = x;
    if (n.type === "select") {
      let O;
      if (t[17] !== n.options || t[18] !== r) {
        O = n.options.find(F => F.value === r) ?? n.options[0];
        t[17] = n.options;
        t[18] = r;
        t[19] = O;
      } else {
        O = t[19];
      }
      let M = O;
      let L;
      if (t[20] !== o || t[21] !== M?.label || t[22] !== r) {
        L = o ? Z_.jsxs(Text, {
          children: [Z_.jsxs(Text, {
            dimColor: true,
            children: [vGd.triangleLeft, " "]
          }), M?.label ?? r, Z_.jsxs(Text, {
            dimColor: true,
            children: [" ", vGd.triangleRight]
          })]
        }) : Z_.jsx(Text, {
          children: M?.label ?? r
        });
        t[20] = o;
        t[21] = M?.label;
        t[22] = r;
        t[23] = L;
      } else {
        L = t[23];
      }
      let P;
      if (t[24] !== A || t[25] !== S || t[26] !== L) {
        P = Z_.jsxs(gXd, {
          children: [S, A, L]
        });
        t[24] = A;
        t[25] = S;
        t[26] = L;
        t[27] = P;
      } else {
        P = t[27];
      }
      return P;
    }
    let k;
    if (t[28] !== i || t[29] !== n.mask || t[30] !== n.placeholder || t[31] !== o || t[32] !== c || t[33] !== l || t[34] !== d || t[35] !== p || t[36] !== u || t[37] !== a || t[38] !== r) {
      k = o ? Z_.jsx(Dl, {
        value: r,
        onChange: l,
        onSubmit: () => p(),
        onExit: c,
        onHistoryUp: u,
        onHistoryDown: d,
        placeholder: n.placeholder,
        mask: n.mask,
        columns: 60,
        cursorOffset: i,
        onChangeCursorOffset: a,
        disableCursorMovementForUpDownKeys: true,
        disableEscapeDoublePress: true,
        focus: true,
        showCursor: true
      }) : r ? Z_.jsx(Text, {
        children: n.mask ? n.mask.repeat(Math.min(an(r), 60)) : r
      }) : Z_.jsx(Text, {
        dimColor: true,
        children: n.placeholder ?? ""
      });
      t[28] = i;
      t[29] = n.mask;
      t[30] = n.placeholder;
      t[31] = o;
      t[32] = c;
      t[33] = l;
      t[34] = d;
      t[35] = p;
      t[36] = u;
      t[37] = a;
      t[38] = r;
      t[39] = k;
    } else {
      k = t[39];
    }
    let I;
    if (t[40] !== A || t[41] !== S || t[42] !== k) {
      I = Z_.jsxs(gXd, {
        children: [S, A, k]
      });
      t[40] = A;
      t[41] = S;
      t[42] = k;
      t[43] = I;
    } else {
      I = t[43];
    }
    return I;
  }
  var WIo;
  var qIo;
  var Z_;
  var Zzt = __lazy(() => {
    bc();
    et();
    Bs();
    q_();
    Ai();
    Ii();
    bv();
    bs();
    WIo = __toESM(pt(), 1);
    qIo = __toESM(ot(), 1);
    Z_ = __toESM(ie(), 1);
  });
  function mpl() {
    let e = dpl.c(16);
    let {
      goBack: t,
      goNext: n,
      updateWizardData: r,
      wizardData: o,
      title: s
    } = E_();
    let i = o.accessKeyId ?? "";
    let a = o.secretAccessKey ?? "";
    let l = o.sessionToken ?? "";
    let c;
    if (e[0] !== i || e[1] !== a || e[2] !== l) {
      c = {
        accessKeyId: i,
        secretAccessKey: a,
        sessionToken: l
      };
      e[0] = i;
      e[1] = a;
      e[2] = l;
      e[3] = c;
    } else {
      c = e[3];
    }
    let [u, d] = ppl.useState(c);
    let p;
    if (e[4] !== n || e[5] !== r || e[6] !== u.accessKeyId || e[7] !== u.secretAccessKey || e[8] !== u.sessionToken) {
      p = () => {
        r({
          accessKeyId: u.accessKeyId.trim(),
          secretAccessKey: u.secretAccessKey.trim(),
          sessionToken: u.sessionToken.trim() || undefined
        });
        n();
      };
      e[4] = n;
      e[5] = r;
      e[6] = u.accessKeyId;
      e[7] = u.secretAccessKey;
      e[8] = u.sessionToken;
      e[9] = p;
    } else {
      p = e[9];
    }
    let m = p;
    let f = s ?? "Set up AWS Bedrock";
    let h;
    if (e[10] === Symbol.for("react.memo_cache_sentinel")) {
      h = (y, _) => d(b => ({
        ...b,
        [y]: _
      }));
      e[10] = h;
    } else {
      h = e[10];
    }
    let g;
    if (e[11] !== t || e[12] !== m || e[13] !== f || e[14] !== u) {
      g = fpl.jsx(q1e, {
        title: f,
        subtitle: "AWS access keys",
        fields: Wfm,
        values: u,
        onChange: h,
        onSubmit: m,
        onCancel: t,
        submitLabel: "Continue"
      });
      e[11] = t;
      e[12] = m;
      e[13] = f;
      e[14] = u;
      e[15] = g;
    } else {
      g = e[15];
    }
    return g;
  }
  var dpl;
  var ppl;
  var fpl;
  var Wfm;
  var hpl = __lazy(() => {
    Zzt();
    Z1();
    dpl = __toESM(pt(), 1);
    ppl = __toESM(ot(), 1);
    fpl = __toESM(ie(), 1);
    Wfm = [{
      type: "text",
      key: "accessKeyId",
      label: "Access key ID",
      placeholder: "AKIA\u2026",
      required: true
    }, {
      type: "text",
      key: "secretAccessKey",
      label: "Secret access key",
      mask: "*",
      required: true
    }, {
      type: "text",
      key: "sessionToken",
      label: "Session token",
      mask: "*",
      hint: () => "Only needed for temporary credentials from STS. Leave empty for long-lived keys."
    }];
  });
  var bve;
  var lJn = __lazy(() => {
    bve = {
      AUTH_METHOD: 0,
      PROFILE: 1,
      BEARER: 2,
      ACCESS_KEY_ID: 3,
      REGION: 4,
      VERIFY: 5,
      PIN_MODELS: 6,
      CONFIRM: 7
    };
  });
  function ypl() {
    let e = gpl.c(12);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r
    } = E_();
    let o;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        label: "AWS profile (SSO or named profile)",
        value: "profile"
      };
      e[0] = o;
    } else {
      o = e[0];
    }
    let s;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        label: "Bedrock API key (bearer token)",
        value: "bearer"
      };
      e[1] = s;
    } else {
      s = e[1];
    }
    let i;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        label: "Access key + secret",
        value: "accessKey"
      };
      e[2] = i;
    } else {
      i = e[2];
    }
    let a;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = [o, s, i, {
        label: "Use credentials already in my environment",
        value: "environment"
      }];
      e[3] = a;
    } else {
      a = e[3];
    }
    let l = a;
    let c;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      c = {
        profile: bve.PROFILE,
        bearer: bve.BEARER,
        accessKey: bve.ACCESS_KEY_ID,
        environment: bve.REGION
      };
      e[4] = c;
    } else {
      c = e[4];
    }
    let u = c;
    let d;
    if (e[5] !== n || e[6] !== r) {
      d = h => {
        let g = h;
        r({
          authMethod: g
        });
        n(u[g]);
      };
      e[5] = n;
      e[6] = r;
      e[7] = d;
    } else {
      d = e[7];
    }
    let p = d;
    let m;
    if (e[8] === Symbol.for("react.memo_cache_sentinel")) {
      m = fbt.jsx(Text, {
        dimColor: true,
        children: "Claude Code uses the standard AWS credential chain. Pick the method you already use with the AWS CLI."
      });
      e[8] = m;
    } else {
      m = e[8];
    }
    let f;
    if (e[9] !== t || e[10] !== p) {
      f = fbt.jsx(rh, {
        subtitle: "How do you authenticate to AWS?",
        children: fbt.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [m, fbt.jsx(xr, {
            options: l,
            onChange: p,
            onCancel: t
          })]
        })
      });
      e[9] = t;
      e[10] = p;
      e[11] = f;
    } else {
      f = e[11];
    }
    return f;
  }
  var gpl;
  var fbt;
  var _pl = __lazy(() => {
    et();
    $c();
    Z1();
    J$();
    lJn();
    gpl = __toESM(pt(), 1);
    fbt = __toESM(ie(), 1);
  });
  function Spl() {
    let e = bpl.c(17);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let [s, i] = cJn.useState(o.bearerToken ?? "");
    let [a, l] = cJn.useState(s.length);
    let [c, u] = cJn.useState(null);
    let d;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      d = {
        context: "Settings"
      };
      e[0] = d;
    } else {
      d = e[0];
    }
    uo("confirm:no", t, d);
    let p;
    if (e[1] !== n || e[2] !== r || e[3] !== s) {
      p = () => {
        let S = s.trim();
        if (!S) {
          u("API key is required");
          return;
        }
        u(null);
        r({
          bearerToken: S
        });
        n(bve.REGION);
      };
      e[1] = n;
      e[2] = r;
      e[3] = s;
      e[4] = p;
    } else {
      p = e[4];
    }
    let m = p;
    let f;
    if (e[5] === Symbol.for("react.memo_cache_sentinel")) {
      f = Iz.jsxs(Hn, {
        children: [Iz.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), Iz.jsx(Wr, {
          action: "confirm:no",
          context: "Settings",
          fallback: "Esc",
          description: "go back"
        })]
      });
      e[5] = f;
    } else {
      f = e[5];
    }
    let h;
    let g;
    if (e[6] === Symbol.for("react.memo_cache_sentinel")) {
      h = Iz.jsx(Text, {
        children: "Paste your Bedrock API key."
      });
      g = Iz.jsx(Text, {
        dimColor: true,
        children: "Generate one in the AWS console under Bedrock \u2192 API keys."
      });
      e[6] = h;
      e[7] = g;
    } else {
      h = e[6];
      g = e[7];
    }
    let y;
    if (e[8] !== a || e[9] !== m || e[10] !== s) {
      y = Iz.jsx(gXd, {
        marginTop: 1,
        children: Iz.jsx(Dl, {
          value: s,
          onChange: i,
          onSubmit: m,
          placeholder: "bedrock-api-key-\u2026",
          mask: "*",
          columns: 60,
          cursorOffset: a,
          onChangeCursorOffset: l,
          focus: true,
          showCursor: true
        })
      });
      e[8] = a;
      e[9] = m;
      e[10] = s;
      e[11] = y;
    } else {
      y = e[11];
    }
    let _;
    if (e[12] !== c) {
      _ = c && Iz.jsx(gXd, {
        marginTop: 1,
        children: Iz.jsx(Hc, {
          error: c
        })
      });
      e[12] = c;
      e[13] = _;
    } else {
      _ = e[13];
    }
    let b;
    if (e[14] !== y || e[15] !== _) {
      b = Iz.jsx(rh, {
        subtitle: "Bedrock API key",
        footerText: f,
        children: Iz.jsxs(gXd, {
          flexDirection: "column",
          children: [h, g, y, _]
        })
      });
      e[14] = y;
      e[15] = _;
      e[16] = b;
    } else {
      b = e[16];
    }
    return b;
  }
  var bpl;
  var cJn;
  var Iz;
  var Tpl = __lazy(() => {
    et();
    Bs();
    Sd();
    Ai();
    bv();
    bs();
    q_();
    Z1();
    J$();
    lJn();
    bpl = __toESM(pt(), 1);
    cJn = __toESM(ot(), 1);
    Iz = __toESM(ie(), 1);
  });
  function Gfm(e) {
    let t = {
      CLAUDE_CODE_USE_BEDROCK: "1",
      CLAUDE_CODE_USE_VERTEX: undefined,
      CLAUDE_CODE_USE_FOUNDRY: undefined,
      CLAUDE_CODE_USE_ANTHROPIC_AWS: undefined,
      AWS_REGION: e.region,
      AWS_PROFILE: undefined,
      AWS_BEARER_TOKEN_BEDROCK: undefined,
      AWS_ACCESS_KEY_ID: undefined,
      AWS_SECRET_ACCESS_KEY: undefined,
      AWS_SESSION_TOKEN: undefined,
      ANTHROPIC_DEFAULT_SONNET_MODEL: undefined,
      ANTHROPIC_DEFAULT_OPUS_MODEL: undefined,
      ANTHROPIC_DEFAULT_HAIKU_MODEL: undefined,
      ANTHROPIC_DEFAULT_FABLE_MODEL: undefined,
      ANTHROPIC_SMALL_FAST_MODEL: undefined
    };
    switch (e.authMethod) {
      case "profile":
        t.AWS_PROFILE = e.awsProfile;
        break;
      case "bearer":
        t.AWS_BEARER_TOKEN_BEDROCK = e.bearerToken;
        break;
      case "accessKey":
        if (t.AWS_ACCESS_KEY_ID = e.accessKeyId, t.AWS_SECRET_ACCESS_KEY = e.secretAccessKey, e.sessionToken) {
          t.AWS_SESSION_TOKEN = e.sessionToken;
        }
        break;
      case "environment":
      case undefined:
        break;
    }
    if (e.pinSonnet) {
      t.ANTHROPIC_DEFAULT_SONNET_MODEL = e.pinSonnet;
    }
    if (e.pinOpus) {
      t.ANTHROPIC_DEFAULT_OPUS_MODEL = e.pinOpus;
    }
    if (e.pinFable) {
      t.ANTHROPIC_DEFAULT_FABLE_MODEL = e.pinFable;
    }
    if (e.pinHaiku) {
      t.ANTHROPIC_DEFAULT_HAIKU_MODEL = e.pinHaiku;
    }
    return t;
  }
  function wpl(e) {
    let t = Epl.c(30);
    let {
      onComplete: n
    } = e;
    let {
      goBack: r,
      wizardData: o
    } = E_();
    let [s, i] = vpl.useState(null);
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = LN(getSettingsFilePathForSource("userSettings") ?? "~/.claude/settings.json");
      t[0] = a;
    } else {
      a = t[0];
    }
    let l = a;
    let c;
    if (t[1] !== o) {
      c = Gfm(o);
      t[1] = o;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u = c;
    let d;
    if (t[3] !== u) {
      d = Object.entries(u).filter(Kfm);
      t[3] = u;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p = d;
    let m;
    if (t[5] !== u || t[6] !== n || t[7] !== o.authMethod || t[8] !== o.awsProfile || t[9] !== o.pinFable || t[10] !== o.pinHaiku || t[11] !== o.pinOpus || t[12] !== o.pinSonnet || t[13] !== o.verifiedIdentity) {
      m = () => {
        let {
          error: E
        } = updateSettingsForSource("userSettings", {
          env: u
        });
        if (E) {
          i(E.message);
          return;
        }
        logEvent("tengu_bedrock_setup_complete", {
          auth_method: o.authMethod == null ? undefined : o.authMethod,
          pinned_models: Boolean(o.pinSonnet || o.pinOpus || o.pinFable || o.pinHaiku),
          verified: Boolean(o.verifiedIdentity)
        });
        n(`Bedrock configuration saved to ${l}.${o.authMethod === "profile" ? ` When your SSO session expires (typically 8 hours), run \`aws sso login --profile ${o.awsProfile}\` \u2014 Claude Code picks up refreshed credentials automatically.` : ""}`);
      };
      t[5] = u;
      t[6] = n;
      t[7] = o.authMethod;
      t[8] = o.awsProfile;
      t[9] = o.pinFable;
      t[10] = o.pinHaiku;
      t[11] = o.pinOpus;
      t[12] = o.pinSonnet;
      t[13] = o.verifiedIdentity;
      t[14] = m;
    } else {
      m = t[14];
    }
    let f = m;
    let h;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      h = Pz.jsxs(Text, {
        children: ["These will be written to ", l, " under env:"]
      });
      t[15] = h;
    } else {
      h = t[15];
    }
    let g;
    if (t[16] !== p) {
      g = Pz.jsx(gXd, {
        flexDirection: "column",
        children: p.map(zfm)
      });
      t[16] = p;
      t[17] = g;
    } else {
      g = t[17];
    }
    let y;
    if (t[18] !== o.verifiedIdentity) {
      y = o.verifiedIdentity && Pz.jsxs(Text, {
        dimColor: true,
        children: [Pz.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "Verified as ", o.verifiedIdentity]
      });
      t[18] = o.verifiedIdentity;
      t[19] = y;
    } else {
      y = t[19];
    }
    let _;
    if (t[20] !== s) {
      _ = Pz.jsx(Hc, {
        error: s
      });
      t[20] = s;
      t[21] = _;
    } else {
      _ = t[21];
    }
    let b;
    if (t[22] !== r || t[23] !== f) {
      b = Pz.jsx(mc, {
        confirmLabel: "Save",
        cancelLabel: "Cancel",
        onConfirm: f,
        onCancel: r
      });
      t[22] = r;
      t[23] = f;
      t[24] = b;
    } else {
      b = t[24];
    }
    let S;
    if (t[25] !== g || t[26] !== y || t[27] !== _ || t[28] !== b) {
      S = Pz.jsx(rh, {
        subtitle: "Confirm and save",
        children: Pz.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [h, g, y, _, b]
        })
      });
      t[25] = g;
      t[26] = y;
      t[27] = _;
      t[28] = b;
      t[29] = S;
    } else {
      S = t[29];
    }
    return S;
  }
  function zfm(e) {
    let [t, n] = e;
    return Pz.jsxs(Text, {
      children: ["  ", Pz.jsx(Text, {
        color: "suggestion",
        children: t
      }), " =", " ", Vfm.vZc(t) ? Pz.jsx(Text, {
        dimColor: true,
        children: "(hidden)"
      }) : n]
    }, t);
  }
  function Kfm(e) {
    return e[1] !== undefined;
  }
  var Epl;
  var vpl;
  var Pz;
  var Vfm;
  var Cpl = __lazy(() => {
    et();
    Ot();
    ku();
    b_();
    bv();
    Vf();
    Z1();
    J$();
    Epl = __toESM(pt(), 1);
    vpl = __toESM(ot(), 1);
    Pz = __toESM(ie(), 1);
    Vfm = new Set(["AWS_BEARER_TOKEN_BEDROCK", "AWS_SECRET_ACCESS_KEY", "AWS_SESSION_TOKEN"]);
  });
  function W1e() {
    let e = new Date();
    let t = String(e.getHours()).padStart(2, "0");
    let n = String(e.getMinutes()).padStart(2, "0");
    let r = String(e.getSeconds()).padStart(2, "0");
    return `${t}:${n}:${r}`;
  }
  function eKt(e, t) {
    return `${ZGt(undefined, t)}/code?environment=${e}`;
  }
  function kpl(e, t) {
    let n = t + 20;
    return t + 10 - e % n;
  }
  function uJn(e, t) {
    let n = an(e);
    let r = t - 1;
    let o = t + 1;
    if (r >= n || o < 0) {
      return {
        before: e,
        shimmer: "",
        after: ""
      };
    }
    let s = Math.max(0, r);
    let i = 0;
    let a = "";
    let l = "";
    let c = "";
    for (let {
      segment: u
    } of JS().segment(e)) {
      let d = an(u);
      if (i + d <= s) {
        a += u;
      } else if (i > o) {
        c += u;
      } else {
        l += u;
      }
      i += d;
    }
    return {
      before: a,
      shimmer: l,
      after: c
    };
  }
  function dJn({
    error: e,
    connected: t,
    sessionActive: n,
    reconnecting: r
  }) {
    if (e) {
      return {
        label: "/rc failed",
        color: "error"
      };
    }
    if (r) {
      return {
        label: "/rc reconnecting",
        color: "warning"
      };
    }
    if (n || t) {
      return {
        label: "/rc active",
        color: "success"
      };
    }
    return {
      label: "/rc connecting\u2026",
      color: "warning"
    };
  }
  function pJn(e) {
    return `Code anywhere with the Claude mobile app or ${e}`;
  }
  function mJn(e) {
    return `Continue coding in the Claude mobile app or ${e}`;
  }
  function Ppl(e, t) {
    return `\x1B]8;;${t}\x07${e}\x1B]8;;\x07`;
  }
  var yse = __lazy(() => {
    bc();
    cs();
    PP();
  });
  function G1e(e) {
    if (!e?.excludeDefault) {
      return false;
    }
    return e.tips.length > 0;
  }
  function tKt() {
    return `claude-swarm-${process.pid}`;
  }
  var Opl;
  var eL = __lazy(() => {
    Opl = /^[A-Za-z0-9][A-Za-z0-9_-]{0,63}$/;
  });
  var YIo = {};