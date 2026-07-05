  __export(M8c, {
    teleportWithProgress: () => teleportWithProgress,
    TeleportProgress: () => TeleportProgress
  });
  function TeleportProgress(e) {
    let t = P8c.c(16);
    let {
      currentStep: n,
      sessionId: r
    } = e;
    let [o, s] = useAnimationFrame(100);
    let i = Math.floor(s / 100) % ors.length;
    let a;
    if (t[0] !== n) {
      a = h => h.key === n;
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = I8c.findIndex(a);
    let c = ors[i];
    let u;
    if (t[2] !== c) {
      u = c4.jsx(gXd, {
        marginBottom: 1,
        children: c4.jsxs(Text, {
          bold: true,
          color: "claude",
          children: [c, " Teleporting session\u2026"]
        })
      });
      t[2] = c;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d;
    if (t[4] !== r) {
      d = r && c4.jsx(gXd, {
        marginBottom: 1,
        children: c4.jsx(Text, {
          dimColor: true,
          children: r
        })
      });
      t[4] = r;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p;
    if (t[6] !== l || t[7] !== i) {
      p = I8c.map((h, g) => {
        let y = g < l;
        let _ = g === l;
        let b = g > l;
        let S;
        let E;
        if (y) {
          S = vGd.tick;
          E = "green";
        } else if (_) {
          S = ors[i];
          E = "claude";
        } else {
          S = vGd.circle;
          E = undefined;
        }
        return c4.jsxs(gXd, {
          flexDirection: "row",
          children: [c4.jsx(gXd, {
            width: 2,
            children: c4.jsx(Text, {
              color: E,
              dimColor: b,
              children: S
            })
          }), c4.jsx(Text, {
            dimColor: b,
            bold: _,
            children: h.label
          })]
        }, h.key);
      });
      t[6] = l;
      t[7] = i;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m;
    if (t[9] !== p) {
      m = c4.jsx(gXd, {
        flexDirection: "column",
        marginLeft: 2,
        children: p
      });
      t[9] = p;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f;
    if (t[11] !== o || t[12] !== u || t[13] !== d || t[14] !== m) {
      f = c4.jsxs(gXd, {
        ref: o,
        flexDirection: "column",
        paddingX: 1,
        paddingY: 1,
        children: [u, d, m]
      });
      t[11] = o;
      t[12] = u;
      t[13] = d;
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    return f;
  }
  async function teleportWithProgress(e, t) {
    let n = () => {};
    function r() {
      let [a, l] = O8c.useState("validating");
      n = l;
      return c4.jsx(TeleportProgress, {
        currentStep: a,
        sessionId: t
      });
    }
    e.render(c4.jsx(AppStateProvider, {
      children: c4.jsx(r, {})
    }));
    let o = await teleportResumeCodeSession(t, n);
    n("checking_out");
    let {
      branchName: s,
      branchError: i
    } = await checkOutTeleportedSessionBranch(o.branch);
    return {
      messages: processMessagesForTeleportResume(o.log, i),
      branchName: s
    };
  }
  var P8c;
  var O8c;
  var c4;
  var ors;
  var I8c;
  var N8c = __lazy(() => {
    et();
    _3();
    FM();
    P8c = __toESM(pt(), 1);
    O8c = __toESM(ot(), 1);
    c4 = __toESM(ie(), 1);
    ors = ["\u25D0", "\u25D3", "\u25D1", "\u25D2"];
    I8c = [{
      key: "validating",
      label: "Validating session"
    }, {
      key: "fetching_logs",
      label: "Fetching session logs"
    }, {
      key: "fetching_branch",
      label: "Getting branch info"
    }, {
      key: "checking_out",
      label: "Checking out branch"
    }];
  });