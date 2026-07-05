  function wgm(e) {
    return /\[1m\]$/i.test(e) ? e : `${e}[1m]`;
  }
  function Hml() {
    let {
      goBack: e,
      goNext: t,
      updateWizardData: n,
      wizardData: r
    } = E_();
    let o = r.discoveredProfiles ?? [];
    let s = Q$.useMemo(() => fPo(r.region), [r.region]);
    let i = Q$.useMemo(() => Object.fromEntries(X1e.map(b => [b, process.env[vgm[b]]?.trim() || undefined])), []);
    let a = $le(r.region);
    let l = () => Object.fromEntries(X1e.map(b => [b, i[b] ?? pqe(o, s[b].needle, a) ?? s[b].fallback]));
    let [c, u] = Q$.useState(l);
    let [d, p] = Q$.useState({
      sonnet: "pending",
      opus: "pending",
      haiku: "pending",
      fable: "pending"
    });
    let [m, f] = Q$.useState("summary");
    if (Q$.useEffect(() => {
      let b = false;
      p(S => ({
        ...S,
        sonnet: "pending"
      }));
      fze(r, c.sonnet).then(S => {
        if (!b) {
          p(E => ({
            ...E,
            sonnet: S
          }));
        }
      });
      return () => {
        b = true;
      };
    }, [c.sonnet]), Q$.useEffect(() => {
      let b = false;
      p(S => ({
        ...S,
        opus: "pending"
      }));
      fze(r, c.opus).then(S => {
        if (!b) {
          p(E => ({
            ...E,
            opus: S
          }));
        }
      });
      return () => {
        b = true;
      };
    }, [c.opus]), Q$.useEffect(() => {
      let b = false;
      p(S => ({
        ...S,
        haiku: "pending"
      }));
      fze(r, c.haiku).then(S => {
        if (!b) {
          p(E => ({
            ...E,
            haiku: S
          }));
        }
      });
      return () => {
        b = true;
      };
    }, [c.haiku]), Q$.useEffect(() => {
      let b = false;
      p(S => ({
        ...S,
        fable: "pending"
      }));
      fze(r, c.fable).then(S => {
        if (!b) {
          p(E => ({
            ...E,
            fable: S
          }));
        }
      });
      return () => {
        b = true;
      };
    }, [c.fable]), m !== "summary") {
      let b = m.picking;
      return ay.jsx(Cgm, {
        tier: b,
        wizardData: r,
        profiles: o,
        fallback: s[b].fallback,
        current: c[b],
        existingPin: i[b],
        onPick: S => {
          u(x => ({
            ...x,
            [b]: S
          }));
          let E = X1e.indexOf(b);
          let C = X1e[E + 1];
          f(C ? {
            picking: C
          } : "summary");
        },
        onCancel: () => f("summary")
      }, b);
    }
    let g = X1e.every(b => d[b] !== "pending") && X1e.some(b => d[b] !== "pending" && d[b].ok);
    let y = g && X1e.some(b => {
      let S = d[b];
      return S !== "pending" && S.ok && d8(c[b]);
    });
    let _ = b => {
      if (b === "manual") {
        f({
          picking: "sonnet"
        });
        return;
      }
      if (b === "pin" || b === "pin1m") {
        let S = E => {
          let C = d[E];
          if (C === "pending" || !C.ok) {
            return;
          }
          let x = c[E];
          return b === "pin1m" && d8(x) ? wgm(x) : x;
        };
        n({
          pinSonnet: S("sonnet"),
          pinOpus: S("opus"),
          pinHaiku: S("haiku"),
          pinFable: S("fable")
        });
      } else {
        n({
          pinSonnet: undefined,
          pinOpus: undefined,
          pinHaiku: undefined,
          pinFable: undefined
        });
      }
      t();
    };
    return ay.jsx(rh, {
      subtitle: "Pin model versions",
      children: ay.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [ay.jsx(Text, {
          children: "Without pinning, Claude Code uses its built-in defaults. When a new model ships, your install will try to call it even if your account has not yet enabled it \u2014 Claude Code will fail to connect to Bedrock until you enable the model or pin to one you have."
        }), ay.jsxs(gXd, {
          flexDirection: "column",
          children: [ay.jsx(Text, {
            dimColor: true,
            children: "Each candidate is tested with a one-token request:"
          }), X1e.map(b => ay.jsx(xgm, {
            label: PJn[b],
            modelId: c[b],
            state: d[b]
          }, b))]
        }), ay.jsx(xr, {
          options: [...(g ? [{
            label: "Pin the working models",
            value: "pin"
          }] : []), ...(y ? [{
            label: "Pin the working models with 1M context",
            value: "pin1m"
          }] : []), {
            label: "Choose different models\u2026",
            value: "manual"
          }, {
            label: "Skip \u2014 use Claude Code defaults (auto-updates)",
            value: "skip"
          }],
          onChange: _,
          onCancel: e
        })]
      })
    });
  }
  function Cgm({
    tier: e,
    wizardData: t,
    profiles: n,
    fallback: r,
    current: o,
    existingPin: s,
    onPick: i,
    onCancel: a
  }) {
    let l = Q$.useMemo(() => {
      let g = n.filter(y => y.toLowerCase().includes(e)).sort().reverse();
      for (let y of [r, o, s]) {
        if (y && !g.includes(y)) {
          g.push(y);
        }
      }
      return g;
    }, [n, e, r, o, s]);
    let [c, u] = Q$.useState(() => Object.fromEntries(l.map(g => [g, "pending"])));
    Q$.useEffect(() => {
      let g = false;
      for (let y of l) {
        fze(t, y).then(_ => {
          if (!g) {
            u(b => ({
              ...b,
              [y]: _
            }));
          }
        });
      }
      return () => {
        g = true;
      };
    }, []);
    let d = l.every(g => c[g] !== "pending");
    let p = g => {
      let y = c[g];
      return y !== undefined && y !== "pending" && y.ok;
    };
    let m = Q$.useMemo(() => {
      if (!d) {
        return l;
      }
      return [...l].sort((g, y) => (p(g) ? 0 : 1) - (p(y) ? 0 : 1));
    }, [l, c, d]);
    let f = m.map(g => ({
      value: g,
      label: ay.jsx(Rgm, {
        id: g,
        state: c[g] ?? "pending",
        suffix: g === s ? "(currently pinned)" : g === r ? "(built-in default)" : g === o ? "(selected)" : undefined
      })
    }));
    let h = Bn(n, g => g.toLowerCase().includes(e));
    return ay.jsx(rh, {
      subtitle: `Pin ${PJn[e]} model`,
      children: ay.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [ay.jsx(Text, {
          dimColor: true,
          children: h > 0 ? `${h} ${PJn[e]} ${un(h, "profile")} in your account \xB7 each tested with a one-token request.` : `No ${PJn[e]} profiles found in your account.`
        }), ay.jsx(xr, {
          options: f,
          defaultValue: d ? m.find(p) : o,
          onChange: i,
          onCancel: a
        }, d ? "settled" : "pending")]
      })
    });
  }
  function Rgm(e) {
    let t = gPo.c(19);
    let {
      id: n,
      state: r,
      suffix: o
    } = e;
    if (r === "pending") {
      let u;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        u = ay.jsx(Ps, {
          status: "pending",
          withSpace: true
        });
        t[0] = u;
      } else {
        u = t[0];
      }
      let d;
      if (t[1] !== o) {
        d = o && ay.jsxs(Text, {
          dimColor: true,
          children: [" ", o]
        });
        t[1] = o;
        t[2] = d;
      } else {
        d = t[2];
      }
      let p;
      if (t[3] !== n || t[4] !== d) {
        p = ay.jsxs(Text, {
          children: [u, n, d]
        });
        t[3] = n;
        t[4] = d;
        t[5] = p;
      } else {
        p = t[5];
      }
      return p;
    }
    if (r.ok) {
      let u;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        u = ay.jsx(Ps, {
          status: "success",
          withSpace: true
        });
        t[6] = u;
      } else {
        u = t[6];
      }
      let d;
      if (t[7] !== o) {
        d = o && ay.jsxs(Text, {
          dimColor: true,
          children: [" ", o]
        });
        t[7] = o;
        t[8] = d;
      } else {
        d = t[8];
      }
      let p;
      if (t[9] !== n || t[10] !== d) {
        p = ay.jsxs(Text, {
          children: [u, n, d]
        });
        t[9] = n;
        t[10] = d;
        t[11] = p;
      } else {
        p = t[11];
      }
      return p;
    }
    let s;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      s = ay.jsx(Ps, {
        status: "error",
        withSpace: true
      });
      t[12] = s;
    } else {
      s = t[12];
    }
    let i = o && ` ${o}`;
    let a = $ml[r.reason];
    let l;
    if (t[13] !== a) {
      l = ay.jsxs(Text, {
        color: "error",
        children: ["(", a, ")"]
      });
      t[13] = a;
      t[14] = l;
    } else {
      l = t[14];
    }
    let c;
    if (t[15] !== n || t[16] !== i || t[17] !== l) {
      c = ay.jsxs(Text, {
        dimColor: true,
        children: [s, n, i, " ", l]
      });
      t[15] = n;
      t[16] = i;
      t[17] = l;
      t[18] = c;
    } else {
      c = t[18];
    }
    return c;
  }
  function xgm(e) {
    let t = gPo.c(26);
    let {
      label: n,
      modelId: r,
      state: o
    } = e;
    if (o === "pending") {
      let d;
      let p;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        d = ay.jsx(Text, {
          children: "  "
        });
        p = ay.jsx(Ed, {});
        t[0] = d;
        t[1] = p;
      } else {
        d = t[0];
        p = t[1];
      }
      let m;
      if (t[2] !== n) {
        m = n.padEnd(7);
        t[2] = n;
        t[3] = m;
      } else {
        m = t[3];
      }
      let f;
      if (t[4] !== r || t[5] !== m) {
        f = ay.jsxs(gXd, {
          children: [d, p, ay.jsxs(Text, {
            children: [" ", m, "\u2192 ", r]
          })]
        });
        t[4] = r;
        t[5] = m;
        t[6] = f;
      } else {
        f = t[6];
      }
      return f;
    }
    if (o.ok) {
      let d;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        d = ay.jsx(Ps, {
          status: "success",
          withSpace: true
        });
        t[7] = d;
      } else {
        d = t[7];
      }
      let p;
      if (t[8] !== n) {
        p = n.padEnd(7);
        t[8] = n;
        t[9] = p;
      } else {
        p = t[9];
      }
      let m;
      if (t[10] !== r) {
        m = ay.jsx(Text, {
          color: "success",
          children: r
        });
        t[10] = r;
        t[11] = m;
      } else {
        m = t[11];
      }
      let f;
      if (t[12] !== p || t[13] !== m) {
        f = ay.jsxs(Text, {
          children: ["  ", d, p, "\u2192 ", m]
        });
        t[12] = p;
        t[13] = m;
        t[14] = f;
      } else {
        f = t[14];
      }
      return f;
    }
    let s;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      s = ay.jsx(Ps, {
        status: "error",
        withSpace: true
      });
      t[15] = s;
    } else {
      s = t[15];
    }
    let i;
    if (t[16] !== n) {
      i = n.padEnd(7);
      t[16] = n;
      t[17] = i;
    } else {
      i = t[17];
    }
    let a;
    if (t[18] !== r) {
      a = ay.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[18] = r;
      t[19] = a;
    } else {
      a = t[19];
    }
    let l = $ml[o.reason];
    let c;
    if (t[20] !== l) {
      c = ay.jsxs(Text, {
        color: "error",
        children: ["(", l, ")"]
      });
      t[20] = l;
      t[21] = c;
    } else {
      c = t[21];
    }
    let u;
    if (t[22] !== i || t[23] !== a || t[24] !== c) {
      u = ay.jsxs(Text, {
        children: ["  ", s, i, "\u2192 ", a, " ", c]
      });
      t[22] = i;
      t[23] = a;
      t[24] = c;
      t[25] = u;
    } else {
      u = t[25];
    }
    return u;
  }
  var gPo;
  var Q$;
  var ay;
  var X1e;
  var PJn;
  var vgm;
  var $ml;
  var jml = __lazy(() => {
    et();
    VT();
    Hle();
    Zn();
    $c();
    Vf();
    cA();
    Z1();
    J$();
    hPo();
    gPo = __toESM(pt(), 1);
    Q$ = __toESM(ot(), 1);
    ay = __toESM(ie(), 1);
    X1e = ["sonnet", "opus", "haiku", "fable"];
    PJn = {
      sonnet: "Sonnet",
      opus: "Opus",
      haiku: "Haiku",
      fable: "Fable"
    };
    vgm = {
      sonnet: "ANTHROPIC_DEFAULT_SONNET_MODEL",
      opus: "ANTHROPIC_DEFAULT_OPUS_MODEL",
      haiku: "ANTHROPIC_DEFAULT_HAIKU_MODEL",
      fable: "ANTHROPIC_DEFAULT_FABLE_MODEL"
    };
    $ml = {
      auth: "auth failed",
      permission: "no InvokeModel permission",
      model: "not enabled in this account",
      network: "unreachable",
      other: "request failed"
    };
  });
  function Xc(e) {
    let t = qml.c(10);
    let {
      message: n,
      bold: r,
      dimColor: o,
      subtitle: s
    } = e;
    let i = r === undefined ? false : r;
    let a = o === undefined ? false : o;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = hze.jsx(Ed, {});
      t[0] = l;
    } else {
      l = t[0];
    }
    let c;
    if (t[1] !== i || t[2] !== a || t[3] !== n) {
      c = hze.jsxs(gXd, {
        flexDirection: "row",
        children: [l, hze.jsxs(Text, {
          bold: i,
          dimColor: a,
          children: [" ", n]
        })]
      });
      t[1] = i;
      t[2] = a;
      t[3] = n;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== s) {
      u = s && hze.jsx(Text, {
        dimColor: true,
        children: s
      });
      t[5] = s;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] !== c || t[8] !== u) {
      d = hze.jsxs(gXd, {
        flexDirection: "column",
        children: [c, u]
      });
      t[7] = c;
      t[8] = u;
      t[9] = d;
    } else {
      d = t[9];
    }
    return d;
  }
  var qml;
  var hze;
  var Pv = __lazy(() => {
    et();
    cA();
    qml = __toESM(pt(), 1);
    hze = __toESM(ie(), 1);
  });
  async function Vml() {
    let e = new Set();
    let t = Gml.homedir();
    for (let {
      path: n,
      re: r
    } of [{
      path: yPo.join(t, ".aws", "config"),
      re: /^\[(?:profile\s+)?([^\]]+)\]/gm
    }, {
      path: yPo.join(t, ".aws", "credentials"),
      re: /^\[([^\]]+)\]/gm
    }]) {
      try {
        for (let o of (await Wml.readFile(n, "utf8")).matchAll(r)) {
          let s = o[1]?.trim();
          if (s && !s.startsWith("sso-session ")) {
            e.add(s);
          }
        }
      } catch {}
    }
    return [...e].sort();
  }
  var Wml;
  var Gml;
  var yPo;
  var zml = __lazy(() => {
    Wml = require("fs/promises");
    Gml = require("os");
    yPo = require("path");
  });
  function Yml() {
    let e = _Po.c(10);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        phase: "loading"
      };
      e[0] = s;
    } else {
      s = e[0];
    }
    let [i, a] = Q1e.useState(s);
    let l;
    let c;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      l = () => {
        let d = false;
        Vml().then(p => {
          if (!d) {
            a({
              phase: "ready",
              profiles: p
            });
          }
        });
        return () => {
          d = true;
        };
      };
      c = [];
      e[1] = l;
      e[2] = c;
    } else {
      l = e[1];
      c = e[2];
    }
    if (Q1e.useEffect(l, c), i.phase === "loading") {
      let d;
      if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
        d = tP.jsx(rh, {
          subtitle: "AWS profile",
          children: tP.jsx(Xc, {
            message: "Reading ~/.aws/config\u2026"
          })
        });
        e[3] = d;
      } else {
        d = e[3];
      }
      return d;
    }
    let u;
    if (e[4] !== t || e[5] !== n || e[6] !== i.profiles || e[7] !== r || e[8] !== o) {
      u = tP.jsx(Agm, {
        profiles: i.profiles,
        wizardData: o,
        goBack: t,
        goToStep: n,
        updateWizardData: r
      });
      e[4] = t;
      e[5] = n;
      e[6] = i.profiles;
      e[7] = r;
      e[8] = o;
      e[9] = u;
    } else {
      u = e[9];
    }
    return u;
  }
  function Agm(e) {
    let t = _Po.c(49);
    let {
      profiles: n,
      wizardData: r,
      goBack: o,
      goToStep: s,
      updateWizardData: i
    } = e;
    let a = n.length > 12;
    let l;
    if (t[0] !== n || t[1] !== r.awsProfile) {
      l = r.awsProfile && !n.includes(r.awsProfile);
      t[0] = n;
      t[1] = r.awsProfile;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = Boolean(l);
    let [u, d] = Q1e.useState(n.length === 0 || a || c);
    let p;
    if (t[3] !== n || t[4] !== a) {
      p = a ? n.find(Pgm) : undefined;
      t[3] = n;
      t[4] = a;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m = p;
    let [f, h] = Q1e.useState(r.awsProfile ?? m ?? "");
    let [g, y] = Q1e.useState(f.length);
    let [_, b] = Q1e.useState(null);
    let S;
    if (t[6] !== u) {
      S = {
        context: "Settings",
        isActive: u
      };
      t[6] = u;
      t[7] = S;
    } else {
      S = t[7];
    }
    uo("confirm:no", o, S);
    let E;
    if (t[8] !== s || t[9] !== i) {
      E = H => {
        i({
          awsProfile: H
        });
        s(bve.REGION);
      };
      t[8] = s;
      t[9] = i;
      t[10] = E;
    } else {
      E = t[10];
    }
    let C = E;
    if (!u) {
      let H = n.length;
      let U;
      if (t[11] !== n.length) {
        U = un(n.length, "profile");
        t[11] = n.length;
        t[12] = U;
      } else {
        U = t[12];
      }
      let N;
      if (t[13] !== n.length || t[14] !== U) {
        N = tP.jsxs(Text, {
          dimColor: true,
          children: ["Found ", H, " ", U, " in ~/.aws/config and ~/.aws/credentials."]
        });
        t[13] = n.length;
        t[14] = U;
        t[15] = N;
      } else {
        N = t[15];
      }
      let W;
      if (t[16] !== n) {
        let J;
        if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
          J = {
            label: "Type a different name\u2026",
            value: "__manual__"
          };
          t[18] = J;
        } else {
          J = t[18];
        }
        W = [...n.map(Igm), J];
        t[16] = n;
        t[17] = W;
      } else {
        W = t[17];
      }
      let j = r.awsProfile && n.includes(r.awsProfile) ? r.awsProfile : undefined;
      let z;
      if (t[19] !== C) {
        z = J => {
          if (J === "__manual__") {
            d(true);
          } else {
            C(J);
          }
        };
        t[19] = C;
        t[20] = z;
      } else {
        z = t[20];
      }
      let V;
      if (t[21] !== o || t[22] !== z || t[23] !== W || t[24] !== j) {
        V = tP.jsx(xr, {
          options: W,
          defaultValue: j,
          onChange: z,
          onCancel: o
        });
        t[21] = o;
        t[22] = z;
        t[23] = W;
        t[24] = j;
        t[25] = V;
      } else {
        V = t[25];
      }
      let K;
      if (t[26] !== V || t[27] !== N) {
        K = tP.jsx(rh, {
          subtitle: "AWS profile",
          children: tP.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [N, V]
          })
        });
        t[26] = V;
        t[27] = N;
        t[28] = K;
      } else {
        K = t[28];
      }
      return K;
    }
    let x;
    if (t[29] !== C || t[30] !== f) {
      x = () => {
        let H = f.trim();
        if (!H) {
          b("Profile name is required");
          return;
        }
        b(null);
        C(H);
      };
      t[29] = C;
      t[30] = f;
      t[31] = x;
    } else {
      x = t[31];
    }
    let A = x;
    let k;
    if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
      k = tP.jsxs(Hn, {
        children: [tP.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), tP.jsx(Wr, {
          action: "confirm:no",
          context: "Settings",
          fallback: "Esc",
          description: "go back"
        })]
      });
      t[32] = k;
    } else {
      k = t[32];
    }
    let I;
    if (t[33] === Symbol.for("react.memo_cache_sentinel")) {
      I = tP.jsx(Text, {
        children: "The name from ~/.aws/config (after [profile \u2026])."
      });
      t[33] = I;
    } else {
      I = t[33];
    }
    let O;
    if (t[34] !== m || t[35] !== n.length || t[36] !== a) {
      O = a && tP.jsxs(Text, {
        dimColor: true,
        children: ["Found ", n.length, " profiles \u2014 too many to list.", m && ` Prepopulated with "${m}".`]
      });
      t[34] = m;
      t[35] = n.length;
      t[36] = a;
      t[37] = O;
    } else {
      O = t[37];
    }
    let M;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      M = tP.jsx(Text, {
        dimColor: true,
        children: "If this is an SSO profile, run `aws sso login --profile NAME` first."
      });
      t[38] = M;
    } else {
      M = t[38];
    }
    let L;
    if (t[39] !== g || t[40] !== A || t[41] !== f) {
      L = tP.jsx(gXd, {
        marginTop: 1,
        children: tP.jsx(Dl, {
          value: f,
          onChange: h,
          onSubmit: A,
          placeholder: "my-bedrock-profile",
          columns: 60,
          cursorOffset: g,
          onChangeCursorOffset: y,
          focus: true,
          showCursor: true
        })
      });
      t[39] = g;
      t[40] = A;
      t[41] = f;
      t[42] = L;
    } else {
      L = t[42];
    }
    let P;
    if (t[43] !== _) {
      P = _ && tP.jsx(gXd, {
        marginTop: 1,
        children: tP.jsx(Hc, {
          error: _
        })
      });
      t[43] = _;
      t[44] = P;
    } else {
      P = t[44];
    }
    let F;
    if (t[45] !== L || t[46] !== P || t[47] !== O) {
      F = tP.jsx(rh, {
        subtitle: "AWS profile name",
        footerText: k,
        children: tP.jsxs(gXd, {
          flexDirection: "column",
          children: [I, O, M, L, P]
        })
      });
      t[45] = L;
      t[46] = P;
      t[47] = O;
      t[48] = F;
    } else {
      F = t[48];
    }
    return F;
  }
  function Igm(e) {
    return {
      label: e,
      value: e
    };
  }
  function Pgm(e) {
    return e.toLowerCase().includes("bedrock");
  }
  var _Po;
  var Q1e;
  var tP;
  var Jml = __lazy(() => {
    et();
    Bs();
    Zn();
    Sd();
    $c();
    Ai();
    bv();
    bs();
    Pv();
    q_();
    Z1();
    J$();
    zml();
    lJn();
    _Po = __toESM(pt(), 1);
    Q1e = __toESM(ot(), 1);
    tP = __toESM(ie(), 1);
  });
  function Qml() {
    let e = Xml.c(17);
    let {
      goBack: t,
      goNext: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let [s, i] = OJn.useState(o.region ?? "us-east-1");
    let [a, l] = OJn.useState(s.length);
    let [c, u] = OJn.useState(null);
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
          u("Region is required");
          return;
        }
        u(null);
        r({
          region: S
        });
        n();
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
      f = Nz.jsxs(Hn, {
        children: [Nz.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), Nz.jsx(Wr, {
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
      h = Nz.jsx(Text, {
        children: "Where your Bedrock models are enabled."
      });
      g = Nz.jsx(Text, {
        dimColor: true,
        children: "Claude Code reads this from AWS_REGION, not ~/.aws/config \u2014 set it explicitly even if your profile has a region."
      });
      e[6] = h;
      e[7] = g;
    } else {
      h = e[6];
      g = e[7];
    }
    let y;
    if (e[8] !== a || e[9] !== m || e[10] !== s) {
      y = Nz.jsx(gXd, {
        marginTop: 1,
        children: Nz.jsx(Dl, {
          value: s,
          onChange: i,
          onSubmit: m,
          placeholder: "us-east-1",
          columns: 40,
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
      _ = c && Nz.jsx(gXd, {
        marginTop: 1,
        children: Nz.jsx(Hc, {
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
      b = Nz.jsx(rh, {
        subtitle: "AWS region",
        footerText: f,
        children: Nz.jsxs(gXd, {
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
  var Xml;
  var OJn;
  var Nz;
  var Zml = __lazy(() => {
    et();
    Bs();
    Sd();
    Ai();
    bv();
    bs();
    q_();
    Z1();
    J$();
    Xml = __toESM(pt(), 1);
    OJn = __toESM(ot(), 1);
    Nz = __toESM(ie(), 1);
  });
  function efl() {
    let {
      goBack: e,
      goNext: t,
      updateWizardData: n,
      wizardData: r
    } = E_();
    let [o, s] = DJn.useState({
      phase: "checking"
    });
    if (DJn.useEffect(() => {
      let a = false;
      Uml(r).then(l => {
        if (a) {
          return;
        }
        if (l.status === "ok") {
          n({
            verifiedIdentity: l.identity,
            discoveredProfiles: l.profiles
          });
        } else {
          n({
            verifiedIdentity: undefined,
            discoveredProfiles: undefined
          });
        }
        s({
          phase: "done",
          result: l
        });
      });
      return () => {
        a = true;
      };
    }, []), o.phase === "checking") {
      return tL.jsx(rh, {
        subtitle: "Verifying credentials",
        children: tL.jsx(Xc, {
          message: r.authMethod === "bearer" ? "Sending a test request to Bedrock\u2026" : "Calling AWS STS and Bedrock\u2026",
          subtitle: "This may take a few seconds."
        })
      });
    }
    let {
      result: i
    } = o;
    switch (i.status) {
      case "ok":
        return tL.jsx(rh, {
          subtitle: "Verification",
          children: tL.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [tL.jsxs(Text, {
              children: [tL.jsx(Ps, {
                status: "success",
                withSpace: true
              }), "Authenticated as ", tL.jsx(Text, {
                bold: true,
                children: i.identity
              })]
            }), tL.jsx(Text, {
              dimColor: true,
              children: i.note ?? (i.profiles.length > 0 ? `Found ${i.profiles.length} Anthropic inference ${un(i.profiles.length, "profile")} in this region.` : "No Anthropic inference profiles found in this region. You may still proceed \u2014 model defaults will use the built-in IDs.")
            }), tL.jsx(xr, {
              options: [{
                label: "Continue",
                value: "continue"
              }],
              onChange: () => t(),
              onCancel: e
            })]
          })
        });
      case "error":
        return tL.jsx(rh, {
          subtitle: "Verification failed",
          color: "error",
          children: tL.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [tL.jsxs(gXd, {
              flexDirection: "column",
              children: [tL.jsxs(Text, {
                children: [tL.jsx(Ps, {
                  status: "error",
                  withSpace: true
                }), i.error]
              }), i.command && tL.jsxs(Text, {
                bold: true,
                color: "suggestion",
                children: ["    ", i.command]
              })]
            }), tL.jsx(mc, {
              cancelFirst: true,
              focus: "cancel",
              confirmLabel: "Save anyway (skip verification)",
              cancelLabel: "Go back and fix",
              onConfirm: t,
              onCancel: e
            })]
          })
        });
    }
  }
  var DJn;
  var tL;
  var tfl = __lazy(() => {
    et();
    Zn();
    $c();
    b_();
    Pv();
    Vf();
    Z1();
    J$();
    hPo();
    DJn = __toESM(ot(), 1);
    tL = __toESM(ie(), 1);
  });
  function NJn({
    onComplete: e,
    onCancel: t
  }) {
    let n = MJn.useRef(e);
    n.current = e;
    let [r] = MJn.useState(() => [ypl, Yml, Spl, mpl, Qml, efl, Hml, () => bPo.jsx(wpl, {
      onComplete: o => n.current(o)
    })]);
    return bPo.jsx(Qzt, {
      steps: r,
      initialData: {},
      onComplete: () => {},
      onCancel: t,
      title: "Set up Amazon Bedrock",
      showStepCounter: false
    });
  }
  var MJn;
  var bPo;
  var SPo = __lazy(() => {
    Z1();
    hpl();
    _pl();
    Tpl();
    Cpl();
    jml();
    Jml();
    Zml();
    tfl();
    MJn = __toESM(ot(), 1);
    bPo = __toESM(ie(), 1);
  });
  function Mgm(e) {
    let t = en(e) ?? en(e?.cause);
    let n = he(e);
    if (!(t !== undefined && Dgm.vZc(t) || /self[- ]?signed certificate|unable to (verify the first|get (local )?issuer) certificate|certificate not trusted/i.test(n))) {
      return null;
    }
    return "Could not verify the gateway's TLS certificate. If your gateway uses a private CA or self-signed certificate: Claude Code reads your OS trust " + "store by default on the native binary and Node \u226522.15, so if the CA is " + "already installed there, upgrade to a current runtime. Otherwise set " + "NODE_EXTRA_CA_CERTS to the CA certificate PEM file before starting \u2014 " + "e.g. `export NODE_EXTRA_CA_CERTS=/path/to/ca.pem` \u2014 or add it under " + "`env.NODE_EXTRA_CA_CERTS` in your user settings (~/.claude/settings.json).";
  }
  function nfl(e, t, n) {
    if (t) {
      try {
        if (new URL(t).origin === new URL(e).origin) {
          return t;
        }
      } catch {}
      logForDebugging(`[gateway-login] ignoring advertised endpoint ${t} (not same-origin with ${e}); using ${n}`);
    }
    return `${e}${n}`;
  }
  function rfl({
    onDone: e,
    onCancel: t,
    initialUrl: n,
    screenLocked: r
  }) {
    let [o, s] = kbt.useState({
      state: "url_input"
    });
    let i = n ?? undefined;
    let a = kbt.useRef(0);
    kbt.useEffect(() => () => {
      a.current += 1;
    }, []);
    let l = r ? () => s({
      state: "url_input"
    }) : t;
    function c() {
      a.current += 1;
      l();
    }
    async function u(h) {
      let g = ++a.current;
      s({
        state: "connecting"
      });
      try {
        let y = lIn(h);
        if (await oOi(y), g !== a.current) {
          return;
        }
        let _ = await externalHttp.get(`${y}/.well-known/oauth-authorization-server`, {
          timeout: 1e4
        });
        if (g !== a.current) {
          return;
        }
        let b = Ngm().safeParse(_.data);
        let S = b.success ? b.data : undefined;
        let E = {
          deviceAuthorizationEndpoint: nfl(y, S?.device_authorization_endpoint, "/oauth/device_authorization"),
          tokenEndpoint: nfl(y, S?.token_endpoint, "/oauth/token")
        };
        let {
          hostname: C,
          fingerprint: x
        } = await VBt(y);
        if (g !== a.current) {
          return;
        }
        let A = await zBt(C);
        if (g !== a.current) {
          return;
        }
        if (A === x) {
          await d(y, E);
        } else {
          s({
            state: "trust_prompt",
            url: y,
            hostname: C,
            fingerprint: x,
            previouslyPinned: A,
            endpoints: E
          });
        }
      } catch (y) {
        if (g !== a.current) {
          return;
        }
        let _ = Mgm(y);
        s(_ ? {
          state: "error",
          message: _,
          detail: he(y)
        } : {
          state: "error",
          message: he(y)
        });
      }
    }
    async function d(h, g) {
      let y = ++a.current;
      s({
        state: "connecting"
      });
      try {
        let {
          data: _
        } = await externalHttp.post(g.deviceAuthorizationEndpoint, "", {
          headers: {
            "Content-Type": "application/x-www-form-urlencoded"
          },
          timeout: 1e4
        });
        if (y !== a.current) {
          return;
        }
        let b = Lgm().safeParse(_);
        if (!b.success) {
          throw Error("gateway device authorization endpoint returned malformed response");
        }
        let S = b.data;
        Ac(S.verification_uri_complete ?? S.verification_uri);
        s({
          state: "polling",
          url: h,
          userCode: S.user_code,
          verificationUri: S.verification_uri
        });
        await p(h, g.tokenEndpoint, S.device_code, S.interval ?? 5, y);
      } catch (_) {
        if (y !== a.current) {
          return;
        }
        s({
          state: "error",
          message: he(_)
        });
      }
    }
    async function p(h, g, y, _, b) {
      let S = Math.max(1, _);
      while (b === a.current) {
        if (await sleep(S * 1000), b !== a.current) {
          return;
        }
        try {
          let {
            data: E
          } = await externalHttp.post(g, new URLSearchParams({
            grant_type: "urn:ietf:params:oauth:grant-type:device_code",
            device_code: y
          }).toString(), {
            headers: {
              "Content-Type": "application/x-www-form-urlencoded"
            },
            timeout: 1e4
          });
          if (b !== a.current) {
            return;
          }
          let C = cGr().safeParse(E);
          if (!C.success) {
            throw Error("gateway token endpoint returned malformed response");
          }
          await m(h, g, C.data, b);
          return;
        } catch (E) {
          if (b !== a.current) {
            return;
          }
          let C = uGr(E);
          if (C === "authorization_pending") {
            continue;
          }
          if (C === "slow_down") {
            S += 5;
            continue;
          }
          if (C === "expired_token") {
            s({
              state: "error",
              message: "Sign-in timed out before the browser flow completed. Try again."
            });
            return;
          }
          if (C === "access_denied") {
            s({
              state: "error",
              message: "Sign-in was denied in the browser."
            });
            return;
          }
          s({
            state: "error",
            message: he(E)
          });
          return;
        }
      }
    }
    async function m(h, g, y, _) {
      let b = {
        url: h,
        jwt: y.access_token,
        expiresAt: Date.now() + y.expires_in * 1000,
        tokenEndpoint: g,
        ...(y.refresh_token && {
          idpRefreshToken: y.refresh_token
        })
      };
      let {
        hostname: S,
        fingerprint: E
      } = await VBt(h);
      if (_ !== a.current) {
        return;
      }
      let C = await zBt(S);
      if (_ !== a.current) {
        return;
      }
      if (C !== E) {
        s({
          state: "error",
          message: `TLS certificate for ${S} changed during sign-in. Aborting without storing credentials.`
        });
        return;
      }
      try {
        await Smi(b);
      } catch (x) {
        if (_ !== a.current) {
          return;
        }
        let A = he(x);
        logForDebugging(`[gateway-login] secureStorage write failed: ${A}`, {
          level: "error"
        });
        s({
          state: "error",
          message: A
        });
        return;
      }
      if (_ !== a.current) {
        return;
      }
      e();
    }
    let f = o.state === "url_input";
    switch (uo("confirm:yes", () => {
      if (i) {
        u(i);
      }
    }, {
      context: "Confirmation",
      isActive: f
    }), uo("confirm:no", r ? () => {} : t, {
      context: "Confirmation",
      isActive: f
    }), o.state) {
      case "url_input":
        if (!i) {
          return zm.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [zm.jsx(Text, {
              bold: true,
              children: "Cloud gateway"
            }), zm.jsx(Text, {
              color: "warning",
              children: "Gateway login is required by your organization's policy, but no gateway URL is configured. Contact your IT administrator."
            })]
          });
        }
        return zm.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [zm.jsx(Text, {
            bold: true,
            children: "Cloud gateway"
          }), zm.jsx(Text, {
            children: "Your organization's gateway URL (set by managed settings):"
          }), zm.jsx(gXd, {
            borderDimColor: true,
            borderStyle: "round",
            paddingLeft: 1,
            children: zm.jsx(Text, {
              children: i
            })
          }), zm.jsxs(Text, {
            dimColor: true,
            children: ["Press Enter to connect", r ? "" : " \xB7 Esc to cancel"]
          })]
        });
      case "polling":
        return zm.jsx(Fgm, {
          userCode: o.userCode,
          verificationUri: o.verificationUri,
          onCancel: c
        });
      case "connecting":
        return zm.jsx(Ugm, {
          label: "Connecting to gateway\u2026",
          onCancel: c
        });
      case "trust_prompt":
        return zm.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [zm.jsxs(Text, {
            bold: true,
            children: ["Trust gateway ", zm.jsx(Text, {
              color: "suggestion",
              children: o.hostname
            }), "?"]
          }), o.previouslyPinned ? zm.jsx(Text, {
            color: "warning",
            children: "The TLS certificate for this gateway has changed since you last connected. Only continue if your administrator has confirmed a certificate rotation."
          }) : zm.jsx(Text, {
            children: "You haven't connected to this gateway before. Once trusted, it can push settings to this machine that execute commands and change your environment. Only continue if this is your organization's gateway."
          }), zm.jsxs(Text, {
            dimColor: true,
            children: ["Certificate fingerprint (SHA-256): ", o.fingerprint.slice(0, 16), "\u2026"]
          }), zm.jsx(mc, {
            confirmLabel: "Yes, trust this gateway",
            cancelLabel: r ? "No, go back" : "No, cancel login",
            focus: "cancel",
            onConfirm: () => {
              let h = a.current;
              iOi(o.hostname, o.fingerprint).then(() => {
                if (h !== a.current) {
                  return;
                }
                return d(o.url, o.endpoints);
              }).catch(g => {
                if (h !== a.current) {
                  return;
                }
                s({
                  state: "error",
                  message: he(g)
                });
              });
            },
            onCancel: c
          })]
        });
      case "error":
        return zm.jsx(Bgm, {
          message: o.message,
          detail: o.detail,
          onCancel: l
        });
    }
  }
  function Fgm(e) {
    let t = LJn.c(13);
    let {
      userCode: n,
      verificationUri: r,
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
    let a;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = zm.jsx(Text, {
        bold: true,
        children: "Cloud gateway \xB7 sign in"
      });
      a = zm.jsx(Text, {
        children: "A browser window should have opened. After signing in with your identity provider, confirm this code on the verification page:"
      });
      t[1] = i;
      t[2] = a;
    } else {
      i = t[1];
      a = t[2];
    }
    let l;
    if (t[3] !== n) {
      l = zm.jsx(gXd, {
        borderDimColor: true,
        borderStyle: "round",
        paddingX: 2,
        children: zm.jsx(Text, {
          bold: true,
          color: "suggestion",
          children: n
        })
      });
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      c = zm.jsx(Text, {
        dimColor: true,
        children: "Browser didn't open? Visit:"
      });
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== r) {
      u = zm.jsxs(gXd, {
        flexDirection: "column",
        children: [c, zm.jsx(Text, {
          dimColor: true,
          wrap: "wrap",
          children: r
        })]
      });
      t[6] = r;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    let p;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      d = zm.jsxs(gXd, {
        gap: 1,
        children: [zm.jsx(Ed, {}), zm.jsx(Text, {
          dimColor: true,
          children: "Waiting for sign-in to complete in your browser\u2026"
        })]
      });
      p = zm.jsx(Text, {
        dimColor: true,
        children: "Press Esc to cancel"
      });
      t[8] = d;
      t[9] = p;
    } else {
      d = t[8];
      p = t[9];
    }
    let m;
    if (t[10] !== l || t[11] !== u) {
      m = zm.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [i, a, l, u, d, p]
      });
      t[10] = l;
      t[11] = u;
      t[12] = m;
    } else {
      m = t[12];
    }
    return m;
  }
  function Ugm(e) {
    let t = LJn.c(7);
    let {
      label: n,
      onCancel: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        context: "Confirmation"
      };
      t[0] = o;
    } else {
      o = t[0];
    }
    uo("confirm:no", r, o);
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = zm.jsx(Ed, {});
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n) {
      i = zm.jsxs(gXd, {
        gap: 1,
        children: [s, zm.jsx(Text, {
          children: n
        })]
      });
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      a = zm.jsx(Text, {
        dimColor: true,
        children: "Press Esc to cancel"
      });
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== i) {
      l = zm.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [i, a]
      });
      t[5] = i;
      t[6] = l;
    } else {
      l = t[6];
    }
    return l;
  }
  function Bgm(e) {
    let t = LJn.c(9);
    let {
      message: n,
      detail: r,
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
    if (t[1] !== n) {
      i = zm.jsxs(Text, {
        color: "error",
        children: ["Error: ", n]
      });
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== r) {
      a = r && zm.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[3] = r;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      l = zm.jsx(Text, {
        dimColor: true,
        children: "Press Esc to go back"
      });
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== i || t[7] !== a) {
      c = zm.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [i, a, l]
      });
      t[6] = i;
      t[7] = a;
      t[8] = c;
    } else {
      c = t[8];
    }
    return c;
  }
  var LJn;
  var kbt;
  var zm;
  var Dgm;
  var Ngm;
  var Lgm;
  var ofl = __lazy(() => {
    qg();
    et();
    Bs();
    pk();
    ky();
    je();
    dt();
    bst();
    uIn();
    b_();
    cA();
    LJn = __toESM(pt(), 1);
    kbt = __toESM(ot(), 1);
    zm = __toESM(ie(), 1);
    Dgm = new Set(["UNABLE_TO_VERIFY_LEAF_SIGNATURE", "UNABLE_TO_GET_ISSUER_CERT", "UNABLE_TO_GET_ISSUER_CERT_LOCALLY", "DEPTH_ZERO_SELF_SIGNED_CERT", "SELF_SIGNED_CERT_IN_CHAIN", "CERT_UNTRUSTED"]);
    Ngm = we(() => Ke.object({
      device_authorization_endpoint: Ke.string().optional(),
      token_endpoint: Ke.string().optional()
    }));
    Lgm = we(() => Ke.object({
      device_code: Ke.string(),
      user_code: Ke.string(),
      verification_uri: Ke.string(),
      verification_uri_complete: Ke.string().optional(),
      expires_in: Ke.number(),
      interval: Ke.number().optional()
    }));
  });
  var Z1e;
  var FJn = __lazy(() => {
    Z1e = {
      AUTH_METHOD: 0,
      SERVICE_ACCOUNT: 1,
      PROJECT: 2,
      REGION: 3,
      VERIFY: 4,
      PIN_MODELS: 5,
      CONFIRM: 6
    };
  });
  function ifl() {
    let e = sfl.c(12);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        label: "Application Default Credentials (gcloud auth)",
        value: "adc"
      };
      e[0] = s;
    } else {
      s = e[0];
    }
    let i;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        label: "Service account key file",
        value: "serviceAccount"
      };
      e[1] = i;
    } else {
      i = e[1];
    }
    let a;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = [s, i, {
        label: "Use credentials already in my environment",
        value: "environment"
      }];
      e[2] = a;
    } else {
      a = e[2];
    }
    let l = a;
    let c;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      c = {
        adc: Z1e.PROJECT,
        serviceAccount: Z1e.SERVICE_ACCOUNT,
        environment: Z1e.PROJECT
      };
      e[3] = c;
    } else {
      c = e[3];
    }
    let u = c;
    let d;
    if (e[4] !== n || e[5] !== r) {
      d = h => {
        let g = h;
        r({
          authMethod: g
        });
        n(u[g]);
      };
      e[4] = n;
      e[5] = r;
      e[6] = d;
    } else {
      d = e[6];
    }
    let p = d;
    let m;
    if (e[7] === Symbol.for("react.memo_cache_sentinel")) {
      m = Abt.jsx(Text, {
        dimColor: true,
        children: "Claude Code uses the standard GCP credential chain. Pick the method you already use with gcloud or in your deployment."
      });
      e[7] = m;
    } else {
      m = e[7];
    }
    let f;
    if (e[8] !== t || e[9] !== p || e[10] !== o.authMethod) {
      f = Abt.jsx(rh, {
        subtitle: "How do you authenticate to Google Cloud?",
        children: Abt.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [m, Abt.jsx(xr, {
            options: l,
            defaultValue: o.authMethod,
            onChange: p,
            onCancel: t
          })]
        })
      });
      e[8] = t;
      e[9] = p;
      e[10] = o.authMethod;
      e[11] = f;
    } else {
      f = e[11];
    }
    return f;
  }
  var sfl;
  var Abt;
  var afl = __lazy(() => {
    et();
    $c();
    Z1();
    J$();
    FJn();
    sfl = __toESM(pt(), 1);
    Abt = __toESM(ie(), 1);
  });
  function $gm(e) {
    let t = {
      CLAUDE_CODE_USE_VERTEX: "1",
      CLAUDE_CODE_USE_BEDROCK: undefined,
      CLAUDE_CODE_USE_FOUNDRY: undefined,
      CLAUDE_CODE_USE_ANTHROPIC_AWS: undefined,
      CLAUDE_CODE_USE_MANTLE: undefined,
      ANTHROPIC_VERTEX_PROJECT_ID: e.projectId,
      CLOUD_ML_REGION: e.region,
      GOOGLE_APPLICATION_CREDENTIALS: undefined,
      ANTHROPIC_DEFAULT_SONNET_MODEL: undefined,
      ANTHROPIC_DEFAULT_OPUS_MODEL: undefined,
      ANTHROPIC_DEFAULT_HAIKU_MODEL: undefined,
      ANTHROPIC_DEFAULT_FABLE_MODEL: undefined,
      ANTHROPIC_SMALL_FAST_MODEL: undefined
    };
    if (e.authMethod === "serviceAccount") {
      t.GOOGLE_APPLICATION_CREDENTIALS = e.keyFile;
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
  function ufl(e) {
    let t = lfl.c(29);
    let {
      onComplete: n
    } = e;
    let {
      goBack: r,
      wizardData: o
    } = E_();
    let [s, i] = cfl.useState(null);
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
      c = $gm(o);
      t[1] = o;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u = c;
    let d;
    if (t[3] !== u) {
      d = Object.entries(u).filter(jgm);
      t[3] = u;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p = d;
    let m;
    if (t[5] !== u || t[6] !== n || t[7] !== o.authMethod || t[8] !== o.pinFable || t[9] !== o.pinHaiku || t[10] !== o.pinOpus || t[11] !== o.pinSonnet || t[12] !== o.verifiedIdentity) {
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
        logEvent("tengu_vertex_setup_complete", {
          auth_method: o.authMethod == null ? undefined : o.authMethod,
          pinned_models: Boolean(o.pinSonnet || o.pinOpus || o.pinFable || o.pinHaiku),
          verified: Boolean(o.verifiedIdentity)
        });
        n(`Vertex AI configuration saved to ${l}.${o.authMethod === "adc" ? " When your ADC token expires, run `gcloud auth application-default login` \u2014 Claude Code picks up refreshed credentials automatically." : ""}`);
      };
      t[5] = u;
      t[6] = n;
      t[7] = o.authMethod;
      t[8] = o.pinFable;
      t[9] = o.pinHaiku;
      t[10] = o.pinOpus;
      t[11] = o.pinSonnet;
      t[12] = o.verifiedIdentity;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f = m;
    let h;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      h = ZQ.jsxs(Text, {
        children: ["These will be written to ", l, " under env:"]
      });
      t[14] = h;
    } else {
      h = t[14];
    }
    let g;
    if (t[15] !== p) {
      g = ZQ.jsx(gXd, {
        flexDirection: "column",
        children: p.map(Hgm)
      });
      t[15] = p;
      t[16] = g;
    } else {
      g = t[16];
    }
    let y;
    if (t[17] !== o.verifiedIdentity) {
      y = o.verifiedIdentity && ZQ.jsxs(Text, {
        dimColor: true,
        children: [ZQ.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "Verified as ", o.verifiedIdentity]
      });
      t[17] = o.verifiedIdentity;
      t[18] = y;
    } else {
      y = t[18];
    }
    let _;
    if (t[19] !== s) {
      _ = ZQ.jsx(Hc, {
        error: s
      });
      t[19] = s;
      t[20] = _;
    } else {
      _ = t[20];
    }
    let b;
    if (t[21] !== r || t[22] !== f) {
      b = ZQ.jsx(mc, {
        confirmLabel: "Save",
        cancelLabel: "Cancel",
        onConfirm: f,
        onCancel: r
      });
      t[21] = r;
      t[22] = f;
      t[23] = b;
    } else {
      b = t[23];
    }
    let S;
    if (t[24] !== g || t[25] !== y || t[26] !== _ || t[27] !== b) {
      S = ZQ.jsx(rh, {
        subtitle: "Confirm and save",
        children: ZQ.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [h, g, y, _, b]
        })
      });
      t[24] = g;
      t[25] = y;
      t[26] = _;
      t[27] = b;
      t[28] = S;
    } else {
      S = t[28];
    }
    return S;
  }
  function Hgm(e) {
    let [t, n] = e;
    return ZQ.jsxs(Text, {
      children: ["  ", ZQ.jsx(Text, {
        color: "suggestion",
        children: t
      }), " = ", n]
    }, t);
  }
  function jgm(e) {
    return e[1] !== undefined;
  }
  var lfl;
  var cfl;
  var ZQ;
  var dfl = __lazy(() => {
    et();
    Ot();
    ku();
    b_();
    bv();
    Vf();
    Z1();
    J$();
    lfl = __toESM(pt(), 1);
    cfl = __toESM(ot(), 1);
    ZQ = __toESM(ie(), 1);
  });
  function EPo() {
    return {
      sonnet: xa["sonnet45"].vertex,
      opus: xa["opus46"].vertex,
      haiku: xa["haiku45"].vertex,
      fable: xa["fable5"].vertex
    };
  }
  function pfl(e) {
    let t = new Set();
    for (let n of Object.values(xa)) {
      if (n.vertex !== null && n.vertex.toLowerCase().includes(e)) {
        t.add(n.vertex);
      }
    }
    return [...t].sort().reverse();
  }
  function mfl(e) {
    if (e.authMethod === "serviceAccount" && e.keyFile) {
      return {
        kind: "keyFile",
        path: e.keyFile
      };
    }
    return {
      kind: "default"
    };
  }
  async function ffl(e) {
    let t;
    try {
      let o = await buildVertexGoogleAuth(mfl(e), e.projectId);
      let s = (async () => {
        await (await o.getClient()).getAccessToken();
      })();
      let i = new Promise((l, c) => setTimeout(u => u(Error("Timed out waiting for GCP credentials")), 12000, c));
      await Promise.race([s, i]);
      let a;
      try {
        a = (await o.getCredentials()).client_email;
      } catch {
        a = undefined;
      }
      t = a ?? (e.authMethod === "serviceAccount" ? `service account (${e.keyFile})` : "Application Default Credentials");
    } catch (o) {
      return {
        status: "error",
        ...Ggm(o, e)
      };
    }
    let n = EPo().haiku;
    let r = await gze(e, n);
    if (r.ok) {
      return {
        status: "ok",
        identity: t,
        note: `Test request to ${n} succeeded.`
      };
    }
    switch (r.reason) {
      case "auth":
        return {
          status: "error",
          error: "Got a token, but Vertex AI rejected it. The credential may lack the cloud-platform scope."
        };
      case "permission":
        return {
          status: "error",
          error: `Permission denied calling Vertex AI in project "${e.projectId}". The principal needs the aiplatform.endpoints.predict permission (Vertex AI User role), and the Vertex AI API must be enabled.`
        };
      case "model":
        return {
          status: "ok",
          identity: t,
          note: `Credentials work, but ${n} returned not-found in ${e.region}. Pin a model you have access to on the next step, or try the 'global' region.`
        };
      case "network":
        return {
          status: "error",
          error: `Could not reach Vertex AI in region "${e.region}". Check the region name and your network.`
        };
      case "other":
        return {
          status: "ok",
          identity: t,
          note: `Credentials work, but the test request to ${n} failed. You can pin a different model on the next step.`
        };
    }
  }
  async function gze(e, t) {
    let n;
    try {
      n = await Wgm(e);
    } catch {
      return {
        ok: false,
        reason: "auth"
      };
    }
    try {
      await n.messages.create({
        model: ca(t),
        max_tokens: 1,
        messages: [{
          role: "user",
          content: "."
        }]
      });
      return {
        ok: true
      };
    } catch (r) {
      let o = r?.status;
      if (o === 401) {
        return {
          ok: false,
          reason: "auth"
        };
      }
      if (o === 403) {
        return {
          ok: false,
          reason: "permission"
        };
      }
      if (o === 400 || o === 404) {
        return {
          ok: false,
          reason: "model"
        };
      }
      if (o === 429) {
        return {
          ok: true
        };
      }
      if (o === undefined) {
        return {
          ok: false,
          reason: "network"
        };
      }
      return {
        ok: false,
        reason: "other"
      };
    }
  }
  async function Wgm(e) {
    let [{
      AnthropicVertex: t
    }, {
      getProxyFetchOptions: n
    }] = await Promise.all([Promise.resolve().then(() => (BBt(), UBt)), Promise.resolve().then(() => (Fh(), BAe))]);
    let r = await buildVertexGoogleAuth(mfl(e), e.projectId);
    return new t({
      region: e.region,
      projectId: e.projectId,
      googleAuth: r,
      maxRetries: 0,
      timeout: 15000,
      fetchOptions: n({
        url: process.env.ANTHROPIC_VERTEX_BASE_URL || kZe(e.region)
      })
    });
  }
  function Ggm(e, t) {
    let n = e?.message ?? String(e);
    if (t.authMethod === "serviceAccount" && /ENOENT|no such file/i.test(n)) {
      return {
        error: `Service account key file not found: ${t.keyFile}`
      };
    }
    if (/Could not load the default credentials/i.test(n)) {
      return t.authMethod === "adc" ? {
        error: "No Application Default Credentials found. Run:",
        command: "gcloud auth application-default login"
      } : {
        error: "No GCP credentials found in the environment. Set GOOGLE_APPLICATION_CREDENTIALS or run gcloud auth application-default login."
      };
    }
    if (/invalid_grant|Token has been expired|reauth/i.test(n)) {
      if (t.authMethod === "serviceAccount") {
        return {
          error: "Service account credentials have been revoked or expired. Obtain a new key file from GCP IAM (IAM \u2192 Service Accounts \u2192 Keys \u2192 Add Key)."
        };
      }
      if (t.authMethod === "adc") {
        return {
          error: "GCP credentials expired. Run:",
          command: "gcloud auth application-default login"
        };
      }
      return {
        error: "GCP credentials in the environment have expired or been revoked. Refresh them (gcloud auth application-default login for ADC, or replace the GOOGLE_APPLICATION_CREDENTIALS key file)."
      };
    }
    if (/Unable to detect a Project Id/i.test(n)) {
      return {
        error: "Could not determine a GCP project from the credentials. Go back and set the project ID explicitly."
      };
    }
    if (/Timed out waiting for GCP/i.test(n)) {
      return {
        error: "Timed out resolving GCP credentials (no ADC, no key file, and no GCE metadata server).",
        ...(t.authMethod === "adc" && {
          command: "gcloud auth application-default login"
        })
      };
    }
    return {
      error: n
    };
  }
  var vPo = __lazy(() => {
    gn();
    Tk();
    zN();
    Eo();
    Y0n();
  });
  function zgm(e) {
    return /\[1m\]$/i.test(e) ? e : `${e}[1m]`;
  }
  function gfl() {
    let {
      goBack: e,
      goNext: t,
      updateWizardData: n,
      wizardData: r
    } = E_();
    let o = Z$.useMemo(() => EPo(), []);
    let s = Z$.useMemo(() => Object.fromEntries(eLe.map(g => [g, process.env[Vgm[g]]?.trim() || undefined])), []);
    let [i, a] = Z$.useState(() => Object.fromEntries(eLe.map(g => [g, s[g] ?? o[g]])));
    let [l, c] = Z$.useState({
      sonnet: "pending",
      opus: "pending",
      haiku: "pending",
      fable: "pending"
    });
    let [u, d] = Z$.useState("summary");
    if (Z$.useEffect(() => {
      let g = false;
      c(y => ({
        ...y,
        sonnet: "pending"
      }));
      gze(r, i.sonnet).then(y => {
        if (!g) {
          c(_ => ({
            ..._,
            sonnet: y
          }));
        }
      });
      return () => {
        g = true;
      };
    }, [i.sonnet]), Z$.useEffect(() => {
      let g = false;
      c(y => ({
        ...y,
        opus: "pending"
      }));
      gze(r, i.opus).then(y => {
        if (!g) {
          c(_ => ({
            ..._,
            opus: y
          }));
        }
      });
      return () => {
        g = true;
      };
    }, [i.opus]), Z$.useEffect(() => {
      let g = false;
      c(y => ({
        ...y,
        haiku: "pending"
      }));
      gze(r, i.haiku).then(y => {
        if (!g) {
          c(_ => ({
            ..._,
            haiku: y
          }));
        }
      });
      return () => {
        g = true;
      };
    }, [i.haiku]), Z$.useEffect(() => {
      let g = false;
      c(y => ({
        ...y,
        fable: "pending"
      }));
      gze(r, i.fable).then(y => {
        if (!g) {
          c(_ => ({
            ..._,
            fable: y
          }));
        }
      });
      return () => {
        g = true;
      };
    }, [i.fable]), u !== "summary") {
      let g = u.picking;
      return ly.jsx(Kgm, {
        tier: g,
        wizardData: r,
        fallback: o[g],
        current: i[g],
        existingPin: s[g],
        onPick: y => {
          a(S => ({
            ...S,
            [g]: y
          }));
          let _ = eLe.indexOf(g);
          let b = eLe[_ + 1];
          d(b ? {
            picking: b
          } : "summary");
        },
        onCancel: () => d("summary")
      }, g);
    }
    let m = eLe.every(g => l[g] !== "pending") && eLe.some(g => l[g] !== "pending" && l[g].ok);
    let f = m && eLe.some(g => {
      let y = l[g];
      return y !== "pending" && y.ok && d8(i[g]);
    });
    let h = g => {
      if (g === "manual") {
        d({
          picking: "sonnet"
        });
        return;
      }
      if (g === "pin" || g === "pin1m") {
        let y = _ => {
          let b = l[_];
          if (b === "pending" || !b.ok) {
            return;
          }
          let S = i[_];
          return g === "pin1m" && d8(S) ? zgm(S) : S;
        };
        n({
          pinSonnet: y("sonnet"),
          pinOpus: y("opus"),
          pinHaiku: y("haiku"),
          pinFable: y("fable")
        });
      } else {
        n({
          pinSonnet: undefined,
          pinOpus: undefined,
          pinHaiku: undefined,
          pinFable: undefined
        });
      }
      t();
    };
    return ly.jsx(rh, {
      subtitle: "Pin model versions",
      children: ly.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [ly.jsx(Text, {
          children: "Without pinning, Claude Code uses its built-in defaults. When a new model ships, your install will try to call it even if it is not yet available in your project \u2014 Claude Code will fail to connect to Vertex AI until you enable the model or pin to one you have."
        }), ly.jsxs(gXd, {
          flexDirection: "column",
          children: [ly.jsx(Text, {
            dimColor: true,
            children: "Each candidate is tested with a one-token request:"
          }), eLe.map(g => ly.jsx(Jgm, {
            label: wPo[g],
            modelId: i[g],
            state: l[g]
          }, g))]
        }), ly.jsx(xr, {
          options: [...(m ? [{
            label: "Pin the working models",
            value: "pin"
          }] : []), ...(f ? [{
            label: "Pin the working models with 1M context",
            value: "pin1m"
          }] : []), {
            label: "Choose different models\u2026",
            value: "manual"
          }, {
            label: "Skip \u2014 use Claude Code defaults (auto-updates)",
            value: "skip"
          }],
          onChange: h,
          onCancel: e
        })]
      })
    });
  }
  function Kgm({
    tier: e,
    wizardData: t,
    fallback: n,
    current: r,
    existingPin: o,
    onPick: s,
    onCancel: i
  }) {
    let a = Z$.useMemo(() => {
      let f = pfl(e);
      for (let h of [n, r, o]) {
        if (h && !f.includes(h)) {
          f.push(h);
        }
      }
      return f;
    }, [e, n, r, o]);
    let [l, c] = Z$.useState(() => Object.fromEntries(a.map(f => [f, "pending"])));
    Z$.useEffect(() => {
      let f = false;
      for (let h of a) {
        gze(t, h).then(g => {
          if (!f) {
            c(y => ({
              ...y,
              [h]: g
            }));
          }
        });
      }
      return () => {
        f = true;
      };
    }, []);
    let u = a.every(f => l[f] !== "pending");
    let d = f => {
      let h = l[f];
      return h !== undefined && h !== "pending" && h.ok;
    };
    let p = Z$.useMemo(() => {
      if (!u) {
        return a;
      }
      return [...a].sort((f, h) => (d(f) ? 0 : 1) - (d(h) ? 0 : 1));
    }, [a, l, u]);
    let m = p.map(f => ({
      value: f,
      label: ly.jsx(Ygm, {
        id: f,
        state: l[f] ?? "pending",
        suffix: f === o ? "(currently pinned)" : f === n ? "(built-in default)" : f === r ? "(selected)" : undefined
      })
    }));
    return ly.jsx(rh, {
      subtitle: `Pin ${wPo[e]} model`,
      children: ly.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [ly.jsxs(Text, {
          dimColor: true,
          children: ["Available ", wPo[e], " versions on Vertex AI \xB7 each tested with a one-token request."]
        }), ly.jsx(xr, {
          options: m,
          defaultValue: u ? d(r) ? r : d(n) ? n : p.find(d) : r,
          onChange: s,
          onCancel: i
        }, u ? "settled" : "pending")]
      })
    });
  }
  function Ygm(e) {
    let t = CPo.c(19);
    let {
      id: n,
      state: r,
      suffix: o
    } = e;
    if (r === "pending") {
      let u;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        u = ly.jsx(Ps, {
          status: "pending",
          withSpace: true
        });
        t[0] = u;
      } else {
        u = t[0];
      }
      let d;
      if (t[1] !== o) {
        d = o && ly.jsxs(Text, {
          dimColor: true,
          children: [" ", o]
        });
        t[1] = o;
        t[2] = d;
      } else {
        d = t[2];
      }
      let p;
      if (t[3] !== n || t[4] !== d) {
        p = ly.jsxs(Text, {
          children: [u, n, d]
        });
        t[3] = n;
        t[4] = d;
        t[5] = p;
      } else {
        p = t[5];
      }
      return p;
    }
    if (r.ok) {
      let u;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        u = ly.jsx(Ps, {
          status: "success",
          withSpace: true
        });
        t[6] = u;
      } else {
        u = t[6];
      }
      let d;
      if (t[7] !== o) {
        d = o && ly.jsxs(Text, {
          dimColor: true,
          children: [" ", o]
        });
        t[7] = o;
        t[8] = d;
      } else {
        d = t[8];
      }
      let p;
      if (t[9] !== n || t[10] !== d) {
        p = ly.jsxs(Text, {
          children: [u, n, d]
        });
        t[9] = n;
        t[10] = d;
        t[11] = p;
      } else {
        p = t[11];
      }
      return p;
    }
    let s;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      s = ly.jsx(Ps, {
        status: "error",
        withSpace: true
      });
      t[12] = s;
    } else {
      s = t[12];
    }
    let i = o && ` ${o}`;
    let a = hfl[r.reason];
    let l;
    if (t[13] !== a) {
      l = ly.jsxs(Text, {
        color: "error",
        children: ["(", a, ")"]
      });
      t[13] = a;
      t[14] = l;
    } else {
      l = t[14];
    }
    let c;
    if (t[15] !== n || t[16] !== i || t[17] !== l) {
      c = ly.jsxs(Text, {
        dimColor: true,
        children: [s, n, i, " ", l]
      });
      t[15] = n;
      t[16] = i;
      t[17] = l;
      t[18] = c;
    } else {
      c = t[18];
    }
    return c;
  }
  function Jgm(e) {
    let t = CPo.c(26);
    let {
      label: n,
      modelId: r,
      state: o
    } = e;
    if (o === "pending") {
      let d;
      let p;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        d = ly.jsx(Text, {
          children: "  "
        });
        p = ly.jsx(Ed, {});
        t[0] = d;
        t[1] = p;
      } else {
        d = t[0];
        p = t[1];
      }
      let m;
      if (t[2] !== n) {
        m = n.padEnd(7);
        t[2] = n;
        t[3] = m;
      } else {
        m = t[3];
      }
      let f;
      if (t[4] !== r || t[5] !== m) {
        f = ly.jsxs(gXd, {
          children: [d, p, ly.jsxs(Text, {
            children: [" ", m, "\u2192 ", r]
          })]
        });
        t[4] = r;
        t[5] = m;
        t[6] = f;
      } else {
        f = t[6];
      }
      return f;
    }
    if (o.ok) {
      let d;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        d = ly.jsx(Ps, {
          status: "success",
          withSpace: true
        });
        t[7] = d;
      } else {
        d = t[7];
      }
      let p;
      if (t[8] !== n) {
        p = n.padEnd(7);
        t[8] = n;
        t[9] = p;
      } else {
        p = t[9];
      }
      let m;
      if (t[10] !== r) {
        m = ly.jsx(Text, {
          color: "success",
          children: r
        });
        t[10] = r;
        t[11] = m;
      } else {
        m = t[11];
      }
      let f;
      if (t[12] !== p || t[13] !== m) {
        f = ly.jsxs(Text, {
          children: ["  ", d, p, "\u2192 ", m]
        });
        t[12] = p;
        t[13] = m;
        t[14] = f;
      } else {
        f = t[14];
      }
      return f;
    }
    let s;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      s = ly.jsx(Ps, {
        status: "error",
        withSpace: true
      });
      t[15] = s;
    } else {
      s = t[15];
    }
    let i;
    if (t[16] !== n) {
      i = n.padEnd(7);
      t[16] = n;
      t[17] = i;
    } else {
      i = t[17];
    }
    let a;
    if (t[18] !== r) {
      a = ly.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[18] = r;
      t[19] = a;
    } else {
      a = t[19];
    }
    let l = hfl[o.reason];
    let c;
    if (t[20] !== l) {
      c = ly.jsxs(Text, {
        color: "error",
        children: ["(", l, ")"]
      });
      t[20] = l;
      t[21] = c;
    } else {
      c = t[21];
    }
    let u;
    if (t[22] !== i || t[23] !== a || t[24] !== c) {
      u = ly.jsxs(Text, {
        children: ["  ", s, i, "\u2192 ", a, " ", c]
      });
      t[22] = i;
      t[23] = a;
      t[24] = c;
      t[25] = u;
    } else {
      u = t[25];
    }
    return u;
  }
  var CPo;
  var Z$;
  var ly;
  var eLe;
  var wPo;
  var Vgm;
  var hfl;
  var yfl = __lazy(() => {
    et();
    VT();
    $c();
    Vf();
    cA();
    Z1();
    J$();
    vPo();
    CPo = __toESM(pt(), 1);
    Z$ = __toESM(ot(), 1);
    ly = __toESM(ie(), 1);
    eLe = ["sonnet", "opus", "haiku", "fable"];
    wPo = {
      sonnet: "Sonnet",
      opus: "Opus",
      haiku: "Haiku",
      fable: "Fable"
    };
    Vgm = {
      sonnet: "ANTHROPIC_DEFAULT_SONNET_MODEL",
      opus: "ANTHROPIC_DEFAULT_OPUS_MODEL",
      haiku: "ANTHROPIC_DEFAULT_HAIKU_MODEL",
      fable: "ANTHROPIC_DEFAULT_FABLE_MODEL"
    };
    hfl = {
      auth: "auth failed",
      permission: "no aiplatform.endpoints.predict permission",
      model: "not enabled in this project",
      network: "unreachable",
      other: "request failed"
    };
  });
  async function bfl() {
    let e = new Set();
    let t = process.env.CLOUDSDK_CONFIG ?? Xgm();
    try {
      let n = yKt.join(t, "configurations");
      for (let r of await _Kt.readdir(n)) {
        if (!r.startsWith("config_")) {
          continue;
        }
        try {
          let o = await _Kt.readFile(yKt.join(n, r), "utf8");
          for (let s of o.matchAll(/^project\s*=\s*(\S+)/gm)) {
            let i = s[1]?.trim();
            if (i) {
              e.add(i);
            }
          }
        } catch {}
      }
    } catch {}
    try {
      let n = qt(await _Kt.readFile(yKt.join(t, "application_default_credentials.json"), "utf8"));
      if (n.quota_project_id) {
        e.add(n.quota_project_id);
      }
    } catch {}
    return [...e].sort();
  }
  function Xgm() {
    return yKt.join(_fl.homedir(), ".config", "gcloud");
  }
  var _Kt;
  var _fl;
  var yKt;
  var Sfl = __lazy(() => {
    _Kt = require("fs/promises");
    _fl = require("os");
    yKt = require("path");
  });
  function Efl() {
    let e = RPo.c(10);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        phase: "loading"
      };
      e[0] = s;
    } else {
      s = e[0];
    }
    let [i, a] = tLe.useState(s);
    let l;
    let c;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      l = () => {
        let d = false;
        bfl().then(p => {
          if (!d) {
            a({
              phase: "ready",
              projects: p
            });
          }
        });
        return () => {
          d = true;
        };
      };
      c = [];
      e[1] = l;
      e[2] = c;
    } else {
      l = e[1];
      c = e[2];
    }
    if (tLe.useEffect(l, c), i.phase === "loading") {
      let d;
      if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
        d = nP.jsx(rh, {
          subtitle: "GCP project",
          children: nP.jsx(Xc, {
            message: "Reading ~/.config/gcloud\u2026"
          })
        });
        e[3] = d;
      } else {
        d = e[3];
      }
      return d;
    }
    let u;
    if (e[4] !== t || e[5] !== n || e[6] !== i.projects || e[7] !== r || e[8] !== o) {
      u = nP.jsx(Zgm, {
        projects: i.projects,
        wizardData: o,
        goBack: t,
        goToStep: n,
        updateWizardData: r
      });
      e[4] = t;
      e[5] = n;
      e[6] = i.projects;
      e[7] = r;
      e[8] = o;
      e[9] = u;
    } else {
      u = e[9];
    }
    return u;
  }
  function Zgm(e) {
    let t = RPo.c(45);
    let {
      projects: n,
      wizardData: r,
      goBack: o,
      goToStep: s,
      updateWizardData: i
    } = e;
    let a = n.length > 12;
    let l;
    if (t[0] !== n || t[1] !== r.projectId) {
      l = r.projectId && !n.includes(r.projectId);
      t[0] = n;
      t[1] = r.projectId;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = Boolean(l);
    let [u, d] = tLe.useState(n.length === 0 || a || c);
    let [p, m] = tLe.useState(r.projectId ?? "");
    let [f, h] = tLe.useState(p.length);
    let [g, y] = tLe.useState(null);
    let _;
    if (t[3] !== u) {
      _ = {
        context: "Settings",
        isActive: u
      };
      t[3] = u;
      t[4] = _;
    } else {
      _ = t[4];
    }
    uo("confirm:no", o, _);
    let b;
    if (t[5] !== s || t[6] !== i) {
      b = P => {
        i({
          projectId: P
        });
        s(Z1e.REGION);
      };
      t[5] = s;
      t[6] = i;
      t[7] = b;
    } else {
      b = t[7];
    }
    let S = b;
    if (!u) {
      let P = n.length;
      let F;
      if (t[8] !== n.length) {
        F = un(n.length, "project");
        t[8] = n.length;
        t[9] = F;
      } else {
        F = t[9];
      }
      let H;
      if (t[10] !== n.length || t[11] !== F) {
        H = nP.jsxs(Text, {
          dimColor: true,
          children: ["Found ", P, " ", F, " in your gcloud configurations."]
        });
        t[10] = n.length;
        t[11] = F;
        t[12] = H;
      } else {
        H = t[12];
      }
      let U;
      if (t[13] !== n) {
        let V;
        if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
          V = {
            label: "Type a different project\u2026",
            value: "__manual__"
          };
          t[15] = V;
        } else {
          V = t[15];
        }
        U = [...n.map(eym), V];
        t[13] = n;
        t[14] = U;
      } else {
        U = t[14];
      }
      let N = r.projectId && n.includes(r.projectId) ? r.projectId : undefined;
      let W;
      if (t[16] !== S) {
        W = V => {
          if (V === "__manual__") {
            d(true);
          } else {
            S(V);
          }
        };
        t[16] = S;
        t[17] = W;
      } else {
        W = t[17];
      }
      let j;
      if (t[18] !== o || t[19] !== U || t[20] !== N || t[21] !== W) {
        j = nP.jsx(xr, {
          options: U,
          defaultValue: N,
          onChange: W,
          onCancel: o
        });
        t[18] = o;
        t[19] = U;
        t[20] = N;
        t[21] = W;
        t[22] = j;
      } else {
        j = t[22];
      }
      let z;
      if (t[23] !== j || t[24] !== H) {
        z = nP.jsx(rh, {
          subtitle: "GCP project",
          children: nP.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [H, j]
          })
        });
        t[23] = j;
        t[24] = H;
        t[25] = z;
      } else {
        z = t[25];
      }
      return z;
    }
    let E;
    if (t[26] !== S || t[27] !== p) {
      E = () => {
        let P = p.trim();
        if (!P) {
          y("Project ID is required");
          return;
        }
        y(null);
        S(P);
      };
      t[26] = S;
      t[27] = p;
      t[28] = E;
    } else {
      E = t[28];
    }
    let C = E;
    let x;
    if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
      x = nP.jsxs(Hn, {
        children: [nP.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), nP.jsx(Wr, {
          action: "confirm:no",
          context: "Settings",
          fallback: "Esc",
          description: "go back"
        })]
      });
      t[29] = x;
    } else {
      x = t[29];
    }
    let A;
    if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
      A = nP.jsx(Text, {
        children: "The project where Vertex AI is enabled."
      });
      t[30] = A;
    } else {
      A = t[30];
    }
    let k;
    if (t[31] !== n.length || t[32] !== a) {
      k = a && nP.jsxs(Text, {
        dimColor: true,
        children: ["Found ", n.length, " projects \u2014 too many to list."]
      });
      t[31] = n.length;
      t[32] = a;
      t[33] = k;
    } else {
      k = t[33];
    }
    let I;
    if (t[34] === Symbol.for("react.memo_cache_sentinel")) {
      I = nP.jsx(Text, {
        dimColor: true,
        children: "Find it with `gcloud config get-value project` or in the GCP console header."
      });
      t[34] = I;
    } else {
      I = t[34];
    }
    let O;
    if (t[35] !== f || t[36] !== C || t[37] !== p) {
      O = nP.jsx(gXd, {
        marginTop: 1,
        children: nP.jsx(Dl, {
          value: p,
          onChange: m,
          onSubmit: C,
          placeholder: "my-gcp-project",
          columns: 60,
          cursorOffset: f,
          onChangeCursorOffset: h,
          focus: true,
          showCursor: true
        })
      });
      t[35] = f;
      t[36] = C;
      t[37] = p;
      t[38] = O;
    } else {
      O = t[38];
    }
    let M;
    if (t[39] !== g) {
      M = g && nP.jsx(gXd, {
        marginTop: 1,
        children: nP.jsx(Hc, {
          error: g
        })
      });
      t[39] = g;
      t[40] = M;
    } else {
      M = t[40];
    }
    let L;
    if (t[41] !== M || t[42] !== k || t[43] !== O) {
      L = nP.jsx(rh, {
        subtitle: "GCP project ID",
        footerText: x,
        children: nP.jsxs(gXd, {
          flexDirection: "column",
          children: [A, k, I, O, M]
        })
      });
      t[41] = M;
      t[42] = k;
      t[43] = O;
      t[44] = L;
    } else {
      L = t[44];
    }
    return L;
  }
  function eym(e) {
    return {
      label: e,
      value: e
    };
  }
  var RPo;
  var tLe;
  var nP;
  var vfl = __lazy(() => {
    et();
    Bs();
    Zn();
    Sd();
    $c();
    Ai();
    bv();
    bs();
    Pv();
    q_();
    Z1();
    J$();
    Sfl();
    FJn();
    RPo = __toESM(pt(), 1);
    tLe = __toESM(ot(), 1);
    nP = __toESM(ie(), 1);
  });
  function Cfl() {
    let e = wfl.c(17);
    let {
      goBack: t,
      goNext: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let [s, i] = UJn.useState(o.region ?? "global");
    let [a, l] = UJn.useState(s.length);
    let [c, u] = UJn.useState(null);
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
          u("Region is required");
          return;
        }
        u(null);
        r({
          region: S
        });
        n();
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
      f = Lz.jsxs(Hn, {
        children: [Lz.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), Lz.jsx(Wr, {
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
      h = Lz.jsx(Text, {
        children: "Where Claude models are served from."
      });
      g = Lz.jsx(Text, {
        dimColor: true,
        children: "Use 'global', 'us', or 'eu' for a multi-region endpoint (recommended), or a specific location like us-east5 if you have regional quota."
      });
      e[6] = h;
      e[7] = g;
    } else {
      h = e[6];
      g = e[7];
    }
    let y;
    if (e[8] !== a || e[9] !== m || e[10] !== s) {
      y = Lz.jsx(gXd, {
        marginTop: 1,
        children: Lz.jsx(Dl, {
          value: s,
          onChange: i,
          onSubmit: m,
          placeholder: "global",
          columns: 40,
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
      _ = c && Lz.jsx(gXd, {
        marginTop: 1,
        children: Lz.jsx(Hc, {
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
      b = Lz.jsx(rh, {
        subtitle: "Vertex AI region",
        footerText: f,
        children: Lz.jsxs(gXd, {
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
  var wfl;
  var UJn;
  var Lz;
  var Rfl = __lazy(() => {
    et();
    Bs();
    Sd();
    Ai();
    bv();
    bs();
    q_();
    Z1();
    J$();
    wfl = __toESM(pt(), 1);
    UJn = __toESM(ot(), 1);
    Lz = __toESM(ie(), 1);
  });
  function Ifl() {
    let e = xfl.c(17);
    let {
      goBack: t,
      goToStep: n,
      updateWizardData: r,
      wizardData: o
    } = E_();
    let [s, i] = BJn.useState(o.keyFile ?? "");
    let [a, l] = BJn.useState(s.length);
    let [c, u] = BJn.useState(null);
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
          u("Path is required");
          return;
        }
        u(null);
        let E = S === "~" || S.startsWith("~/") ? Afl.join(kfl.homedir(), S.slice(1)) : S;
        r({
          keyFile: E
        });
        n(Z1e.PROJECT);
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
      f = Fz.jsxs(Hn, {
        children: [Fz.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), Fz.jsx(Wr, {
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
      h = Fz.jsx(Text, {
        children: "Path to the service account JSON key file."
      });
      g = Fz.jsx(Text, {
        dimColor: true,
        children: "Download one from the GCP console under IAM \u2192 Service Accounts \u2192 Keys \u2192 Add key."
      });
      e[6] = h;
      e[7] = g;
    } else {
      h = e[6];
      g = e[7];
    }
    let y;
    if (e[8] !== a || e[9] !== m || e[10] !== s) {
      y = Fz.jsx(gXd, {
        marginTop: 1,
        children: Fz.jsx(Dl, {
          value: s,
          onChange: i,
          onSubmit: m,
          placeholder: "~/keys/my-project-vertex.json",
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
      _ = c && Fz.jsx(gXd, {
        marginTop: 1,
        children: Fz.jsx(Hc, {
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
      b = Fz.jsx(rh, {
        subtitle: "Service account key",
        footerText: f,
        children: Fz.jsxs(gXd, {
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
  var xfl;
  var kfl;
  var Afl;
  var BJn;
  var Fz;
  var Pfl = __lazy(() => {
    et();
    Bs();
    Sd();
    Ai();
    bv();
    bs();
    q_();
    Z1();
    J$();
    FJn();
    xfl = __toESM(pt(), 1);
    kfl = require("os");
    Afl = require("path");
    BJn = __toESM(ot(), 1);
    Fz = __toESM(ie(), 1);
  });
  function Ofl() {
    let {
      goBack: e,
      goNext: t,
      updateWizardData: n,
      wizardData: r
    } = E_();
    let [o, s] = $Jn.useState({
      phase: "checking"
    });
    if ($Jn.useEffect(() => {
      let a = false;
      ffl(r).then(l => {
        if (a) {
          return;
        }
        if (l.status === "ok") {
          n({
            verifiedIdentity: l.identity
          });
        } else {
          n({
            verifiedIdentity: undefined
          });
        }
        s({
          phase: "done",
          result: l
        });
      });
      return () => {
        a = true;
      };
    }, []), o.phase === "checking") {
      return nL.jsx(rh, {
        subtitle: "Verifying credentials",
        children: nL.jsx(Xc, {
          message: "Calling Google Cloud\u2026",
          subtitle: "This may take a few seconds."
        })
      });
    }
    let {
      result: i
    } = o;
    switch (i.status) {
      case "ok":
        return nL.jsx(rh, {
          subtitle: "Verification",
          children: nL.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [nL.jsxs(Text, {
              children: [nL.jsx(Ps, {
                status: "success",
                withSpace: true
              }), "Authenticated as ", nL.jsx(Text, {
                bold: true,
                children: i.identity
              })]
            }), i.note && nL.jsx(Text, {
              dimColor: true,
              children: i.note
            }), nL.jsx(xr, {
              options: [{
                label: "Continue",
                value: "continue"
              }],
              onChange: () => t(),
              onCancel: e
            })]
          })
        });
      case "error":
        return nL.jsx(rh, {
          subtitle: "Verification failed",
          color: "error",
          children: nL.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [nL.jsxs(gXd, {
              flexDirection: "column",
              children: [nL.jsxs(Text, {
                children: [nL.jsx(Ps, {
                  status: "error",
                  withSpace: true
                }), i.error]
              }), i.command && nL.jsxs(Text, {
                bold: true,
                color: "suggestion",
                children: ["    ", i.command]
              })]
            }), nL.jsx(mc, {
              cancelFirst: true,
              focus: "cancel",
              confirmLabel: "Save anyway (skip verification)",
              cancelLabel: "Go back and fix",
              onConfirm: t,
              onCancel: e
            })]
          })
        });
    }
  }
  var $Jn;
  var nL;
  var Dfl = __lazy(() => {
    et();
    $c();
    b_();
    Pv();
    Vf();
    Z1();
    J$();
    vPo();
    $Jn = __toESM(ot(), 1);
    nL = __toESM(ie(), 1);
  });
  function jJn({
    onComplete: e,
    onCancel: t
  }) {
    let n = HJn.useRef(e);
    n.current = e;
    let [r] = HJn.useState(() => [ifl, Ifl, Efl, Cfl, Ofl, gfl, () => xPo.jsx(ufl, {
      onComplete: o => n.current(o)
    })]);
    return xPo.jsx(Qzt, {
      steps: r,
      initialData: {},
      onComplete: () => {},
      onCancel: t,
      title: "Set up Google Vertex AI",
      showStepCounter: false
    });
  }
  var HJn;
  var xPo;
  var kPo = __lazy(() => {
    Z1();
    afl();
    dfl();
    yfl();
    vfl();
    Rfl();
    Pfl();
    Dfl();
    HJn = __toESM(ot(), 1);
    xPo = __toESM(ie(), 1);
  });
  function GJn() {
    if (!rm()) {
      return false;
    }
    let e = yze.join(boe(), "claude", "versions") + yze.sep;
    return process.execPath.startsWith(e);
  }
  function eH(e = {}) {
    if (!e.pinToCurrentBinary && GJn()) {
      return {
        cmd: yze.join(zde(), "claude"),
        prefixArgs: []
      };
    }
    if (rm()) {
      return {
        cmd: process.execPath,
        prefixArgs: []
      };
    }
    let t = process.argv[1];
    if (!t) {
      return {
        cmd: process.execPath,
        prefixArgs: []
      };
    }
    return {
      cmd: process.execPath,
      prefixArgs: [t]
    };
  }
  async function VJn() {
    let e = yze.join(boe(), "claude", "versions");
    let t;
    try {
      t = await qJn.readdir(e);
    } catch {
      return null;
    }
    let n = t.filter(r => !/\.tmp\.\d+\.\d+$/.test(r) && WJn.valid(r)).sort(WJn.rcompare);
    for (let r of n) {
      let o = yze.join(e, r);
      try {
        let s = await qJn.stat(o);
        if (s.isFile() && s.size > 0) {
          return o;
        }
      } catch {}
    }
    return null;
  }
  var qJn;
  var yze;
  var WJn;
  var Sve = __lazy(() => {
    zTe();
    qJn = require("fs/promises");
    yze = require("path");
    WJn = __toESM(lq(), 1);
  });
  var _ze = {};