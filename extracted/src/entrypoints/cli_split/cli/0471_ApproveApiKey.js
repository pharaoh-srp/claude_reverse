  __export(t3c, {
    ApproveApiKey: () => ApproveApiKey
  });
  function ApproveApiKey(e) {
    let t = e3c.c(16);
    let {
      customApiKeyTruncated: n,
      onDone: r
    } = e;
    let o;
    if (t[0] !== n || t[1] !== r) {
      o = function (f) {
        e: switch (f) {
          case "yes":
            {
              saveGlobalConfig(h => ({
                ...h,
                customApiKeyResponses: {
                  ...h.customApiKeyResponses,
                  approved: [...(h.customApiKeyResponses?.approved ?? []), n]
                }
              }));
              r(true);
              break e;
            }
          case "no":
            saveGlobalConfig(h => ({
              ...h,
              customApiKeyResponses: {
                ...h.customApiKeyResponses,
                rejected: [...(h.customApiKeyResponses?.rejected ?? []), n]
              }
            }));
            r(false);
        }
      };
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i;
    if (t[3] !== s) {
      i = () => s("no");
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      a = Hhe.jsx(Text, {
        bold: true,
        children: "ANTHROPIC_API_KEY"
      });
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== n) {
      l = Hhe.jsxs(Text, {
        children: [a, Hhe.jsxs(Text, {
          children: [": sk-ant-...", n]
        })]
      });
      t[6] = n;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      c = Hhe.jsx(Text, {
        children: "Do you want to use this API key?"
      });
      t[8] = c;
    } else {
      c = t[8];
    }
    let u;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      u = Hhe.jsxs(Text, {
        children: ["No (", Hhe.jsx(Text, {
          bold: true,
          children: "recommended"
        }), ")"]
      });
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== s) {
      d = Hhe.jsx(mc, {
        focus: "cancel",
        cancelLabel: u,
        onConfirm: () => s("yes"),
        onCancel: () => s("no")
      });
      t[10] = s;
      t[11] = d;
    } else {
      d = t[11];
    }
    let p;
    if (t[12] !== i || t[13] !== l || t[14] !== d) {
      p = Hhe.jsxs(or, {
        title: "Detected a custom API key in your environment",
        color: "warning",
        onCancel: i,
        children: [l, c, d]
      });
      t[12] = i;
      t[13] = l;
      t[14] = d;
      t[15] = p;
    } else {
      p = t[15];
    }
    return p;
  }
  var e3c;
  var Hhe;
  var kts = __lazy(() => {
    et();
    b_();
    Ii();
    e3c = __toESM(pt(), 1);
    Hhe = __toESM(ie(), 1);
  });
  function r3c() {
    let e = n3c.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = F_r.jsxs(Text, {
        color: "permission",
        children: ["Press ", F_r.jsx(Text, {
          bold: true,
          children: "Enter"
        }), " to continue\u2026"]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var n3c;
  var F_r;
  var o3c = __lazy(() => {
    et();
    n3c = __toESM(pt(), 1);
    F_r = __toESM(ie(), 1);
  });
  function B_r(e) {
    let t = s3c.c(7);
    let {
      children: n
    } = e;
    let {
      marker: r
    } = U_r.useContext(Ats);
    let o;
    if (t[0] !== r) {
      o = lsn.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n) {
      s = lsn.jsx(gXd, {
        flexDirection: "column",
        children: n
      });
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = lsn.jsxs(gXd, {
        gap: 1,
        children: [o, s]
      });
      t[4] = o;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  var s3c;
  var U_r;
  var lsn;
  var Ats;
  var i3c = __lazy(() => {
    et();
    s3c = __toESM(pt(), 1);
    U_r = __toESM(ot(), 1);
    lsn = __toESM(ie(), 1);
    Ats = U_r.createContext({
      marker: ""
    });
  });
  function c3c(e) {
    let t = l3c.c(9);
    let {
      children: n
    } = e;
    let {
      marker: r
    } = MXe.useContext(a3c);
    let o = 0;
    for (let l of Its.Children.toArray(n)) {
      if (!MXe.isValidElement(l) || l.type !== B_r) {
        continue;
      }
      o++;
    }
    let s = String(o).length;
    let i;
    if (t[0] !== n || t[1] !== s || t[2] !== r) {
      let l;
      if (t[4] !== s || t[5] !== r) {
        l = (c, u) => {
          if (!MXe.isValidElement(c) || c.type !== B_r) {
            return c;
          }
          let d = `${String(u + 1).padStart(s)}.`;
          let p = `${r}${d}`;
          return $_r.jsx(a3c.Provider, {
            value: {
              marker: p
            },
            children: $_r.jsx(Ats.Provider, {
              value: {
                marker: p
              },
              children: c
            })
          });