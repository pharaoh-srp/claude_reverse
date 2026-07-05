  __export(uQl, {
    filterResumableSessions: () => filterResumableSessions,
    call: () => call_export43
  });
  function aQl(e) {
    switch (e.resultType) {
      case "sessionNotFound":
        return `Session ${_$u.bold(e.arg)} was not found.`;
      case "multipleMatches":
        return `Found ${e.count} sessions matching ${_$u.bold(e.arg)}. Please use /resume to pick a specific session.`;
    }
  }
  function qGo(e) {
    let t = lQl.c(7);
    let {
      message: n,
      args: r,
      onDone: o
    } = e;
    useTimeout(o, 0);
    let s;
    if (t[0] !== r) {
      s = V3.jsxs(Text, {
        dimColor: true,
        children: [vGd.pointer, " /resume ", r]
      });
      t[0] = r;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n) {
      i = V3.jsx(Vn, {
        children: V3.jsx(Text, {
          children: n
        })
      });
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== s || t[5] !== i) {
      a = V3.jsxs(gXd, {
        flexDirection: "column",
        children: [s, i]
      });
      t[4] = s;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    return a;
  }
  function HXm({
    onDone: e,
    onResume: t
  }) {
    let [n, r] = bK.useState([]);
    let [o, s] = bK.useState([]);
    let [i, a] = bK.useState(true);
    let [l, c] = bK.useState(false);
    let [u, d] = bK.useState(false);
    let {
      rows: p
    } = Sr();
    let m = nE();
    let f = bK.useRef(false);
    let h = bK.useCallback(async (b, S) => {
      a(true);
      try {
        let E = b ? await loadAllProjectsMessageLogs() : await loadSameRepoMessageLogs(S);
        if (f.current) {
          return;
        }
        let C = filterResumableSessions(E, getSessionId());
        r(C);
      } catch (E) {
        if (f.current) {
          return;
        }
        e("Failed to load conversations");
      } finally {
        a(false);
      }
    }, [e]);
    bK.useEffect(() => {
      async function b() {
        let S = await vve(getOriginalCwd());
        if (f.current) {
          return;
        }
        s(S);
        h(false, S);
      }
      b();
    }, [h]);
    let g = bK.useCallback(() => {
      let b = !u;
      d(b);
      h(b, o);
    }, [u, h, o]);
    async function y(b) {
      let S = kD(getSessionIdFromLog(b));
      if (!S) {
        e("Failed to resume conversation");
        return;
      }
      let E = isLiteLog(b) ? await loadFullLog(b) : b;
      if (f.current) {
        return;
      }
      let C = Scr(E, u, o);
      if (C.isCrossProject) {
        if (C.isSameRepoWorktree) {
          c(true);
          t(S, E, "slash_command_picker");
          return;
        }
        let x = await Uk(C.command);
        if (f.current) {
          return;
        }
        if (x) {
          process.stdout.write(x);
        }
        let A = ["", "This conversation is from a different directory.", "", "To resume, run:", `  ${C.command}`, "", "(Command copied to clipboard)", ""].join(`
`);
        e(A, {
          display: "user"
        });
        return;
      }
      c(true);
      t(S, E, "slash_command_picker");
    }
    function _() {
      f.current = true;
      e("Resume cancelled", {
        display: "system"
      });
    }
    if (uo("confirm:no", _, {
      context: "Confirmation",
      isActive: i && !l
    }), i || l) {
      return V3.jsxs(Td, {
        color: "suggestion",
        children: [V3.jsx(Text, {
          bold: true,
          color: "suggestion",
          children: "Resume session"
        }), V3.jsx(gXd, {
          marginTop: 1,
          children: V3.jsx(Xc, {
            message: l ? "Resuming conversation\u2026" : "Loading conversations\u2026"
          })
        })]
      });
    }
    return V3.jsx(fcr, {
      logs: n,
      maxHeight: m ? Math.floor(p / 2) : p - 2,
      onCancel: _,
      onSelect: y,
      onLogsChanged: () => h(u, o),
      showAllProjects: u,
      onToggleAllProjects: g,
      onAgenticSearch: bcr
    });
  }
  function filterResumableSessions(e, t) {
    return e.filter(n => !n.isSidechain && getSessionIdFromLog(n) !== t);
  }
  var lQl;
  var bK;
  var V3;
  var call_export43 = async (e, t, n) => {
    let r = async (c, u, d) => {
      if (await findLiveNonInteractiveSession(c)) {
        e("That session is still running as a background agent. Open `claude agents` to attach to it, or stop it there first to resume here.", {
          display: "user"
        });
        return;
      }
      try {
        await t.resume?.(c, u, d);
        e(undefined, {
          display: "skip"
        });
      } catch (p) {
        Oe($o(sr(p), "resume: context.resume failed"));
        e(`Failed to resume: ${he(p)}`);
      }
    };
    let o = n?.trim();
    if (!o) {
      return V3.jsx(HXm, {
        onDone: e,
        onResume: r
      }, Date.now());
    }
    let s = await vve(getOriginalCwd());
    let i = await loadSameRepoMessageLogs(s);
    if (i.length === 0) {
      return V3.jsx(qGo, {
        message: "No conversations found to resume.",
        args: o,
        onDone: () => e("No conversations found to resume.")
      });
    }
    let a = kD(o);
    if (a) {
      let c = i.filter(d => getSessionIdFromLog(d) === a).sort((d, p) => p.modified.getTime() - d.modified.getTime());
      if (c.length > 0) {
        let d = c[0];
        let p = isLiteLog(d) ? await loadFullLog(d) : d;
        r(a, p, "slash_command_session_id");
        return null;
      }
      let u = await getLastSessionLog(a);
      if (u) {
        r(a, u, "slash_command_session_id");
        return null;
      }
    }
    if (isCustomTitleEnabled()) {
      let c = await searchSessionsByCustomTitle(o, {
        exact: true
      });
      if (c.length === 1) {
        let u = c[0];
        let d = getSessionIdFromLog(u);
        if (d) {
          let p = isLiteLog(u) ? await loadFullLog(u) : u;
          r(d, p, "slash_command_title");
          return null;
        }
      }
      if (c.length > 1) {
        let u = aQl({
          resultType: "multipleMatches",
          arg: o,
          count: c.length
        });
        return V3.jsx(qGo, {
          message: u,
          args: o,
          onDone: () => e(u)
        });
      }
    }
    let l = aQl({
      resultType: "sessionNotFound",
      arg: o
    });
    return V3.jsx(qGo, {
      message: l,
      args: o,
      onDone: () => e(l)
    });
  };
  var dQl = __lazy(() => {
    at();
    Pv();
    oE();
    UGo();
    Wl();
    rE();
    ki();
    Tg();
    et();
    Bs();
    $Go();
    Pme();
    jGo();
    dt();
    TKt();
    Rn();
    fa();
    GL();
    lQl = __toESM(pt(), 1);
    bK = __toESM(ot(), 1);
    V3 = __toESM(ie(), 1);
  });
  var qXm;
  var hQl = {};