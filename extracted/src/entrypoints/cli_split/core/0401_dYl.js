  function dYl(e) {
    let {
      title: t,
      lines: n,
      footer: r,
      emptyMessage: o,
      customContent: s
    } = e;
    let i = an(t);
    if (s !== undefined) {
      i = Math.max(i, s.width);
    } else if (n.length === 0 && o) {
      i = Math.max(i, an(o));
    } else {
      let l = Math.max(0, ...n.map(c => c.timestamp ? an(c.timestamp) : 0));
      for (let c of n) {
        let u = l > 0 ? l : 0;
        let d = an(c.text) + (u > 0 ? u + 2 : 0);
        i = Math.max(i, d);
      }
    }
    if (r) {
      i = Math.max(i, an(r));
    }
    return i;
  }
  function pYl(e) {
    let t = uYl.c(15);
    let {
      config: n,
      actualWidth: r
    } = e;
    let {
      title: o,
      lines: s,
      footer: i,
      emptyMessage: a,
      customContent: l
    } = n;
    let c;
    if (t[0] !== s) {
      c = Math.max(0, ...s.map(H7m));
      t[0] = s;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d;
    if (t[2] !== o) {
      d = sB.jsx(Text, {
        bold: true,
        color: "claude",
        children: o
      });
      t[2] = o;
      t[3] = d;
    } else {
      d = t[3];
    }
    let p;
    if (t[4] !== r || t[5] !== l || t[6] !== a || t[7] !== i || t[8] !== s || t[9] !== u) {
      p = l ? sB.jsxs(sB.Fragment, {
        children: [l.content, i && sB.jsx(Text, {
          dimColor: true,
          italic: true,
          children: truncate(i, r)
        })]
      }) : s.length === 0 && a ? sB.jsx(sc, {
        children: truncate(a, r)
      }) : sB.jsxs(sB.Fragment, {
        children: [s.map((f, h) => {
          let g = Math.max(10, r - (u > 0 ? u + 2 : 0));
          return sB.jsxs(Text, {
            children: [u > 0 && sB.jsxs(sB.Fragment, {
              children: [sB.jsx(Text, {
                dimColor: true,
                children: (f.timestamp || "").padEnd(u)
              }), "  "]
            }), sB.jsx(Text, {
              children: truncate(f.text, g)
            })]
          }, h);
        }), i && sB.jsx(Text, {
          dimColor: true,
          italic: true,
          children: truncate(i, r)
        })]
      });
      t[4] = r;
      t[5] = l;
      t[6] = a;
      t[7] = i;
      t[8] = s;
      t[9] = u;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== r || t[12] !== d || t[13] !== p) {
      m = sB.jsxs(gXd, {
        flexDirection: "column",
        width: r,
        children: [d, p]
      });
      t[11] = r;
      t[12] = d;
      t[13] = p;
      t[14] = m;
    } else {
      m = t[14];
    }
    return m;
  }
  function H7m(e) {
    return e.timestamp ? an(e.timestamp) : 0;
  }
  var uYl;
  var sB;
  var mYl = __lazy(() => {
    bc();
    et();
    cs();
    xb();
    uYl = __toESM(pt(), 1);
    sB = __toESM(ie(), 1);
  });
  function gYl(e) {
    let t = fYl.c(10);
    let {
      feeds: n,
      maxWidth: r
    } = e;
    let o;
    if (t[0] !== n) {
      let c = n.map(j7m);
      o = Math.max(...c);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let i = Math.min(o, r);
    let a;
    if (t[2] !== i || t[3] !== n) {
      let c;
      if (t[5] !== i || t[6] !== n.length) {
        c = (u, d) => Nwt.jsxs(hYl.Fragment, {
          children: [Nwt.jsx(pYl, {
            config: u,
            actualWidth: i
          }), d < n.length - 1 && Nwt.jsx(mS, {
            color: "claude",
            width: i
          })]
        }, d);
        t[5] = i;
        t[6] = n.length;
        t[7] = c;
      } else {
        c = t[7];
      }
      a = n.map(c);
      t[2] = i;
      t[3] = n;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[8] !== a) {
      l = Nwt.jsx(gXd, {
        flexDirection: "column",
        children: a
      });
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    return l;
  }
  function j7m(e) {
    return dYl(e);
  }
  var fYl;
  var hYl;
  var Nwt;
  var yYl = __lazy(() => {
    et();
    oX();
    mYl();
    fYl = __toESM(pt(), 1);
    hYl = __toESM(ot(), 1);
    Nwt = __toESM(ie(), 1);
  });
  function bYl(e) {
    let t = e.map(r => ({
      text: r
    }));
    let n = "Check the Claude Code changelog for updates";
    return {
      title: "What's new",
      lines: t,
      footer: t.length > 0 ? "/release-notes for more" : undefined,
      emptyMessage: "Check the Claude Code changelog for updates"
    };
  }
  function SYl(e) {
    let n = e.filter(({
      isEnabled: o
    }) => o).sort((o, s) => Number(o.isComplete) - Number(s.isComplete)).map(({
      text: o,
      isComplete: s
    }) => ({
      text: `${s ? `${vGd.tick} ` : ""}${o}`
    }));
    let r = Nt() === _Yl.homedir() ? "Note: You have launched claude in your home directory. For the best experience, launch it in a project directory instead." : undefined;
    if (r) {
      n.push({
        text: r
      });
    }
    return {
      title: "Tips for getting started",
      lines: n
    };
  }
  var _Yl;
  var TYl = __lazy(() => {
    vo();
    _Yl = require("os");
  });
  var vYl = {};