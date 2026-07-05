  __export(tVo, {
    renderDaemonHubStandalone: () => renderDaemonHubStandalone,
    call: () => call_export91,
    DaemonHub: () => DaemonHub
  });
  async function Z8o() {
    let e = gUe();
    let [t, n, r, o, s, i, a] = await Promise.all([edc(), zuc(), lP().catch(() => null), Ilc().catch(() => null), iuc().catch(() => null), j3({
      silent: true
    }), e ? WZ() : Promise.resolve(false)]);
    return {
      tasks: t.tasks,
      servers: n,
      lock: r,
      status: o,
      scheduledStatus: s,
      bgCount: Object.keys(i.workers).length,
      serviceInstalled: a,
      serviceSupported: e
    };
  }
  function idc() {
    return Ade(false).map(e => ({
      label: e.label,
      value: e.value ?? "",
      description: e.description
    }));
  }
  async function call_export91(e) {
    let t = await Z8o();
    return Zc.jsx(DaemonHub, {
      initialData: t,
      modelOptions: idc(),
      onDone: e
    });
  }
  function DaemonHub({
    initialData: e,
    modelOptions: t,
    onDone: n
  }) {
    let [r, o] = RK.useState(e);
    let s = useClock();
    let [i] = RK.useState(() => ({
      wall: Date.now(),
      clock: s.now()
    }));
    let [a, l] = RK.useState(i.wall);
    let [c, u] = RK.useState({
      type: "hub"
    });
    let [d, p] = RK.useState("scheduled");
    let [m, f] = RK.useState(false);
    let [h, g] = RK.useState(null);
    async function y() {
      let C = await Z8o();
      o(C);
    }
    let _ = RK.useRef(0);
    useInterval(() => {
      if (l(i.wall + (s.now() - i.clock)), _.current++ % 2 === 0) {
        y();
      }
    }, c.type === "hub" ? 1000 : null);
    async function b(C) {
      if (m) {
        return;
      }
      f(true);
      g(null);
      let x;
      try {
        switch (C) {
          case "uninstall":
            x = await qvt();
            break;
          case "stop":
            x = await QQt();
            break;
        }
        if (!x.ok) {
          g(`${C} failed: ${x.error}`);
        }
      } finally {
        try {
          await y();
        } catch {}
        f(false);
      }
    }
    function S() {
      y();
      u({
        type: "hub"
      });
    }
    switch (c.type) {
      case "detail-scheduled":
        return Zc.jsx(tdc, {
          task: c.entry,
          onBack: S,
          onEdit: C => u({
            type: "new",
            kind: "scheduled",
            prefill: C
          }),
          onDone: n,
          refresh: y
        });
      case "detail-remoteControl":
        return Zc.jsx(Kuc, {
          server: c.entry,
          onBack: S,
          onDone: n,
          refresh: y
        });
      case "new":
        if (c.kind === "remoteControl") {
          return Zc.jsx(Yuc, {
            defaultDir: getOriginalCwd(),
            onCancel: S,
            onAdded: () => S()
          });
        }
        return Zc.jsx(ndc, {
          defaultDir: getOriginalCwd(),
          existingIds: r.tasks.map(C => C.id),
          prefill: c.prefill,
          modelOptions: t,
          onCancel: S,
          onDone: n,
          onSaved: async () => S()
        });
      case "hub":
        break;
    }
    let E = [Zc.jsx(kh, {
      id: "scheduled",
      title: "Scheduled",
      children: Zc.jsx(odc, {
        kind: "scheduled",
        data: r,
        now: a,
        busy: m,
        message: h,
        onSelect: C => u({
          type: "detail-scheduled",
          entry: C
        }),
        onAddNew: () => u({
          type: "new",
          kind: "scheduled"
        }),
        onService: C => void b(C),
        onCancel: () => n()
      })
    }, "scheduled")];
    E.push(Zc.jsx(kh, {
      id: "remoteControl",
      title: "Remote Control",
      children: Zc.jsx(odc, {
        kind: "remoteControl",
        data: r,
        now: a,
        busy: m,
        message: h,
        onSelect: C => u({
          type: "detail-remoteControl",
          entry: C
        }),
        onAddNew: () => u({
          type: "new",
          kind: "remoteControl"
        }),
        onService: C => void b(C),
        onCancel: () => n()
      })
    }, "remoteControl"));
    return Zc.jsx(or, {
      title: "Claude daemon",
      onCancel: () => n(),
      hideInputGuide: true,
      children: Zc.jsx(VM, {
        title: null,
        color: "permission",
        selectedTab: d,
        onTabChange: C => p(C),
        children: E
      })
    });
  }
  function odc(e) {
    let t = Hdr.c(58);
    let {
      kind: n,
      data: r,
      now: o,
      busy: s,
      message: i,
      onSelect: a,
      onAddNew: l,
      onService: c,
      onCancel: u
    } = e;
    let {
      headerFocused: d,
      focusHeader: p
    } = zM();
    let m = n === "scheduled" ? r.tasks : r.servers;
    let f = Wlf(r);
    let h = m.length;
    let g = m.length + 1 + f.length;
    let [y, _] = RK.useState(0);
    let b;
    let S;
    if (t[0] !== y || t[1] !== g) {
      b = () => {
        if (y >= g) {
          _(Math.max(0, g - 1));
        }
      };
      S = [g, y];
      t[0] = y;
      t[1] = g;
      t[2] = b;
      t[3] = S;
    } else {
      b = t[2];
      S = t[3];
    }
    RK.useEffect(b, S);
    let E;
    if (t[4] !== p || t[5] !== y) {
      E = () => {
        if (y === 0) {
          p();
        } else {
          _(y - 1);
        }
      };
      t[4] = p;
      t[5] = y;
      t[6] = E;
    } else {
      E = t[6];
    }
    let C;
    if (t[7] !== y || t[8] !== g) {
      C = () => _(Math.min(g - 1, y + 1));
      t[7] = y;
      t[8] = g;
      t[9] = C;
    } else {
      C = t[9];
    }
    let x = !d;
    let A;
    if (t[10] !== x) {
      A = {
        context: "Select",
        isActive: x
      };
      t[10] = x;
      t[11] = A;
    } else {
      A = t[11];
    }
    jo({
      "select:previous": E,
      "select:next": C,
      "select:accept": () => {
        if (s) {
          return;
        }
        if (y < m.length) {
          a(m[y]);
        } else if (y === h) {
          l();
        } else {
          c(f[y - h - 1]);
        }
      },
      "select:cancel": u
    }, A);
    let k;
    if (t[12] !== r || t[13] !== m || t[14] !== n || t[15] !== o) {
      k = Blf(n, m, r, o);
      t[12] = r;
      t[13] = m;
      t[14] = n;
      t[15] = o;
      t[16] = k;
    } else {
      k = t[16];
    }
    let I = k;
    let O = gXd;
    let M = "column";
    let L = "  " + I.header;
    let P;
    if (t[17] !== L) {
      P = Zc.jsx(Text, {
        dimColor: true,
        children: L
      });
      t[17] = L;
      t[18] = P;
    } else {
      P = t[18];
    }
    let F;
    if (t[19] !== m.length || t[20] !== n) {
      F = m.length === 0 && Zc.jsx(sc, {
        children: `  (no ${rdc[n]}s)`
      });
      t[19] = m.length;
      t[20] = n;
      t[21] = F;
    } else {
      F = t[21];
    }
    let H;
    if (t[22] !== m || t[23] !== y || t[24] !== d || t[25] !== I.keys || t[26] !== I.rows) {
      let ue;
      if (t[28] !== y || t[29] !== d || t[30] !== I.keys || t[31] !== I.rows) {
        ue = (ce, le) => {
          let pe = !d && y === le;
          return Zc.jsxs(gXd, {
            children: [Zc.jsxs(Text, {
              color: pe ? "suggestion" : undefined,
              children: [pe ? vGd.pointer : " ", " "]
            }), Zc.jsx(Text, {
              bold: pe,
              children: I.rows[le].text
            }), I.rows[le].suffix]
          }, I.keys[le]);
        };
        t[28] = y;
        t[29] = d;
        t[30] = I.keys;
        t[31] = I.rows;
        t[32] = ue;
      } else {
        ue = t[32];
      }
      H = m.map(ue);
      t[22] = m;
      t[23] = y;
      t[24] = d;
      t[25] = I.keys;
      t[26] = I.rows;
      t[27] = H;
    } else {
      H = t[27];
    }
    let U = !d && y === h;
    let N = `+ Add new ${rdc[n]}\u2026`;
    let W;
    if (t[33] !== U || t[34] !== N) {
      W = Zc.jsx(gXd, {
        marginTop: 1,
        children: Zc.jsx(sdc, {
          isFocused: U,
          label: N
        })
      });
      t[33] = U;
      t[34] = N;
      t[35] = W;
    } else {
      W = t[35];
    }
    let j = gXd;
    let z = 1;
    let V = "column";
    let K = "single";
    let J = false;
    let Q = false;
    let Z = false;
    let ne = true;
    let oe;
    let ee;
    if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
      oe = Zc.jsx(Text, {
        bold: true,
        children: "Daemon service"
      });
      ee = Zc.jsx(Text, {
        dimColor: true,
        children: " \xB7 "
      });
      t[36] = oe;
      t[37] = ee;
    } else {
      oe = t[36];
      ee = t[37];
    }
    let re = s ? "working\u2026" : i;
    let se;
    if (t[38] !== r || t[39] !== re) {
      se = Zc.jsxs(gXd, {
        children: [oe, ee, Zc.jsx(Glf, {
          data: r,
          message: re
        })]
      });
      t[38] = r;
      t[39] = re;
      t[40] = se;
    } else {
      se = t[40];
    }
    let ae;
    if (t[41] !== h || t[42] !== y || t[43] !== d) {
      ae = (ue, ce) => Zc.jsx(sdc, {
        isFocused: !d && y === h + 1 + ce,
        label: qlf[ue],
        color: ue === "uninstall" ? "error" : undefined
      }, ue);
      t[41] = h;
      t[42] = y;
      t[43] = d;
      t[44] = ae;
    } else {
      ae = t[44];
    }
    let de = f.map(ae);
    let be;
    if (t[45] !== j || t[46] !== se || t[47] !== de) {
      be = Zc.jsxs(j, {
        marginTop: z,
        flexDirection: V,
        borderStyle: K,
        borderBottom: J,
        borderLeft: Q,
        borderRight: Z,
        borderDimColor: ne,
        children: [se, de]
      });
      t[45] = j;
      t[46] = se;
      t[47] = de;
      t[48] = be;
    } else {
      be = t[48];
    }
    let fe;
    if (t[49] === Symbol.for("react.memo_cache_sentinel")) {
      fe = Zc.jsx(xt, {
        chord: ["left", "right"],
        action: "tabs"
      });
      t[49] = fe;
    } else {
      fe = t[49];
    }
    let me;
    if (t[50] === Symbol.for("react.memo_cache_sentinel")) {
      me = Zc.jsx(gXd, {
        marginTop: 1,
        children: Zc.jsx(Text, {
          dimColor: true,
          children: Zc.jsxs(Hn, {
            children: [fe, Zc.jsx(xt, {
              chord: ["up", "down"],
              action: "move"
            }), Zc.jsx(xt, {
              chord: "enter",
              action: "select"
            }), Zc.jsx(xt, {
              chord: "escape",
              action: "close"
            })]
          })
        })
      });
      t[50] = me;
    } else {
      me = t[50];
    }
    let Te;
    if (t[51] !== O || t[52] !== P || t[53] !== F || t[54] !== H || t[55] !== W || t[56] !== be) {
      Te = Zc.jsxs(O, {
        flexDirection: M,
        children: [P, F, H, W, be, me]
      });
      t[51] = O;
      t[52] = P;
      t[53] = F;
      t[54] = H;
      t[55] = W;
      t[56] = be;
      t[57] = Te;
    } else {
      Te = t[57];
    }
    return Te;
  }
  function sdc(e) {
    let t = Hdr.c(7);
    let {
      isFocused: n,
      label: r,
      color: o
    } = e;
    let s = n ? undefined : o;
    let i;
    if (t[0] !== n || t[1] !== r || t[2] !== s) {
      i = Zc.jsx(Text, {
        bold: n,
        color: s,
        children: r
      });
      t[0] = n;
      t[1] = r;
      t[2] = s;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== n || t[5] !== i) {
      a = Zc.jsx(_v, {
        isFocused: n,
        styled: false,
        children: i
      });
      t[4] = n;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    return a;
  }
  function Blf(e, t, n, r) {
    let o = new Date(r);
    let s = n.lock !== null;
    let i;
    let a;
    let l;
    let c;
    if (e === "scheduled") {
      i = ["Name", "Schedule", "Next run", "Last run", "PID"];
      c = 2;
      let f = t;
      let h = n.scheduledStatus?.workerPid ?? n.status?.workers["scheduled:0"]?.pid;
      l = f.map(g => g.id);
      a = f.map(g => {
        let y = n.scheduledStatus?.tasks[g.id];
        let _ = g.enabled ? Hlf(g.cron, o) : null;
        return [g.id, A1(g.cron), !g.enabled ? "disabled" : !s ? "daemon stopped" : y?.running ? "running" : _ ? formatRelativeTime(_, {
          now: o
        }) : "\u2014", y?.lastFiredAt ? formatRelativeTime(new Date(y.lastFiredAt), {
          now: o
        }) : "\u2014", y?.running && h !== undefined ? String(h) : "\u2014"];
      });
    } else {
      i = ["Name", "Directory", "Status", "PID"];
      c = 2;
      let f = t;
      l = f.map(h => h.dir);
      a = f.map((h, g) => {
        let y = n.status?.workers[`${e}:${g}`]?.pid;
        let _ = s && (n.status === null || y !== undefined);
        return [h.name, jlf(h.dir), _ ? "running" : "stopped", y !== undefined ? String(y) : _ ? "\u2014" : ""];
      });
    }
    let u = i.map((f, h) => Math.max(an(f), ...a.map(g => an(g[h] ?? ""))));
    let d = (f, h) => f + " ".repeat(Math.max(0, u[h] - an(f)));
    let p = i.map(d).join("  ");
    let m = a.map(f => ({
      text: f.slice(0, c).map(d).join("  ") + "  ",
      suffix: Zc.jsxs(Zc.Fragment, {
        children: [$lf(f[c], u[c]), Zc.jsx(Text, {
          children: f.slice(c + 1).map((h, g) => "  " + d(h, c + 1 + g)).join("")
        })]
      })
    }));
    return {
      header: p,
      rows: m,
      keys: l
    };
  }
  function $lf(e, t) {
    let n = e + " ".repeat(Math.max(0, t - an(e)));
    return e === "running" ? Zc.jsx(Text, {
      color: "success",
      children: n
    }) : Zc.jsx(Text, {
      dimColor: true,
      children: n
    });
  }
  function Hlf(e, t) {
    let n = lU(e);
    return n ? Odt(n, t) : null;
  }
  function jlf(e) {
    return truncateStartToWidth(e, 40);
  }
  function Wlf(e) {
    if (!e.serviceSupported || !e.serviceInstalled) {
      return [];
    }
    if (e.lock === null) {
      return ["uninstall"];
    }
    return ["stop", "uninstall"];
  }
  function Glf(e) {
    let t = Hdr.c(22);
    let {
      data: n,
      message: r
    } = e;
    if (r) {
      let p;
      if (t[0] !== r) {
        p = Zc.jsx(Text, {
          dimColor: true,
          children: r
        });
        t[0] = r;
        t[1] = p;
      } else {
        p = t[1];
      }
      return p;
    }
    if (!n.serviceSupported) {
      let p;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        p = Zc.jsx(Text, {
          dimColor: true,
          children: "service install not available on this platform \u2014 runs on demand"
        });
        t[2] = p;
      } else {
        p = t[2];
      }
      return p;
    }
    if (n.lock === null) {
      let p = n.serviceInstalled ? "installed \xB7 not running" : "not installed (runs on demand)";
      let m;
      if (t[3] !== p) {
        m = Zc.jsx(Text, {
          dimColor: true,
          children: p
        });
        t[3] = p;
        t[4] = m;
      } else {
        m = t[4];
      }
      return m;
    }
    let o = n.status === null || n.lock.version !== {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
    let s;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      s = Zc.jsx(Text, {
        color: "success",
        children: "running"
      });
      t[5] = s;
    } else {
      s = t[5];
    }
    let i;
    if (t[6] !== n.lock.pid) {
      i = Zc.jsxs(Zc.Fragment, {
        children: ["pid ", n.lock.pid]
      });
      t[6] = n.lock.pid;
      t[7] = i;
    } else {
      i = t[7];
    }
    let a;
    if (t[8] !== n.lock.version) {
      a = Zc.jsxs(Zc.Fragment, {
        children: ["v", n.lock.version]
      });
      t[8] = n.lock.version;
      t[9] = a;
    } else {
      a = t[9];
    }
    let l;
    if (t[10] !== n.bgCount) {
      l = n.bgCount > 0 && Zc.jsxs(Zc.Fragment, {
        children: [n.bgCount, " ", un(n.bgCount, "background session")]
      });
      t[10] = n.bgCount;
      t[11] = l;
    } else {
      l = t[11];
    }
    let c;
    if (t[12] !== n.serviceInstalled) {
      c = !n.serviceInstalled && Zc.jsx(Zc.Fragment, {
        children: "not installed as service"
      });
      t[12] = n.serviceInstalled;
      t[13] = c;
    } else {
      c = t[13];
    }
    let u;
    if (t[14] !== o) {
      u = o && Zc.jsx(Text, {
        color: "warning",
        children: "restart to update"
      });
      t[14] = o;
      t[15] = u;
    } else {
      u = t[15];
    }
    let d;
    if (t[16] !== i || t[17] !== a || t[18] !== l || t[19] !== c || t[20] !== u) {
      d = Zc.jsx(Text, {
        dimColor: true,
        children: Zc.jsxs(Hn, {
          children: [s, i, a, l, c, u]
        })
      });
      t[16] = i;
      t[17] = a;
      t[18] = l;
      t[19] = c;
      t[20] = u;
      t[21] = d;
    } else {
      d = t[21];
    }
    return d;
  }
  async function renderDaemonHubStandalone() {
    let [{
      createRoot: e
    }, {
      getBaseRenderOptions: t
    }] = await Promise.all([Promise.resolve().then(() => (et(), fG)), Promise.resolve().then(() => (Qoe(), p6n))]);
    let {
      AppStateProvider: n
    } = await Promise.resolve().then(() => (_3(), bCo));
    let {
      KeybindingSetup: r
    } = await Promise.resolve().then(() => (C9(), $wo));
    let {
      getEraseScreenSequence: o
    } = await Promise.resolve().then(() => (Leo(), O6i));
    let s = await Z8o();
    process.stdout.write(o());
    let i = await e(t(false));
    await new Promise(a => {
      i.render(Zc.jsx(n, {
        children: Zc.jsx(r, {
          children: Zc.jsx(DaemonHub, {
            initialData: s,
            modelOptions: idc(),
            onDone: l => {
              if (l) {
                process.stdout.write(l + `
`);
              }
              a();
            }
          })
        })
      }));
    });
    i.unmount();
  }
  var Hdr;
  var RK;
  var Zc;
  var rdc;
  var qlf;
  var nVo = __lazy(() => {
    at();
    Ai();
    Ii();
    xb();
    bs();
    Mue();
    yH();
    hYe();
    jZ();
    yUe();
    fdr();
    vtn();
    bc();
    et();
    Bs();
    vX();
    cs();
    STe();
    Zn();
    dI();
    Juc();
    Q8o();
    Hdr = __toESM(pt(), 1);
    RK = __toESM(ot(), 1);
    Zc = __toESM(ie(), 1);
    rdc = {
      scheduled: "scheduled task",
      remoteControl: "remote-control server"
    };
    qlf = {
      uninstall: "Uninstall service",
      stop: "Stop"
    };
  });
  var adc = {};