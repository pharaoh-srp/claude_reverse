  __export(COc, {
    mapWorkflowSelectionToResult: () => mapWorkflowSelectionToResult,
    WorkflowPermissionDialog: () => WorkflowPermissionDialog,
    WORKFLOW_USAGE_WARNING: () => WORKFLOW_USAGE_WARNING
  });
  function mapWorkflowSelectionToResult(e, t, n, r) {
    switch (e) {
      case "yes":
        return {
          behavior: "allow",
          updatedInput: {
            ...t.input,
            script: n
          },
          ...(r && {
            feedback: r
          })
        };
      case "yes-always":
        return {
          behavior: "allow",
          updatedInput: {
            ...t.input,
            script: n
          },
          ...(t.workflowName && {
            permissionUpdates: [{
              type: "addRules",
              rules: [{
                toolName: "Workflow",
                ruleContent: t.workflowName
              }],
              behavior: "allow",
              destination: "localSettings"
            }]
          })
        };
      case "no":
        return {
          behavior: "deny",
          ...(r && {
            feedback: r
          })
        };
    }
  }
  function WorkflowPermissionDialog(e) {
    let t = TOc.c(75);
    let {
      payload: n,
      answer: r
    } = e;
    let [o, s] = dZo.useState(n.script);
    let i;
    if (t[0] !== o) {
      i = oR(o);
      t[0] = o;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l;
    if (t[2] !== o) {
      l = fA(o);
      t[2] = o;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = l;
    let u = "error" in c ? null : c;
    let d = u?.scriptBody ?? o;
    let p;
    if (t[4] !== d) {
      p = bOc(d);
      t[4] = d;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m = p;
    let f;
    e: {
      let re = WPf;
      let se;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        se = be => ({
          title: oR(BPf[be.kind] + (be.annotation ? ` ${be.annotation}` : "")),
          prompts: re(be)
        });
        t[6] = se;
      } else {
        se = t[6];
      }
      let ae = se;
      let de = u?.meta.phases;
      if (de && de.length > 0) {
        let be;
        if (t[7] !== de || t[8] !== m?.phases) {
          let fe;
          if (t[10] !== m?.phases) {
            fe = (ue, ce) => ({
              title: oR(ue.title),
              detail: ue.detail !== undefined ? oR(ue.detail) : undefined,
              prompts: re(m?.phases[ce])
            });
            t[10] = m?.phases;
            t[11] = fe;
          } else {
            fe = t[11];
          }
          let me = de.map(fe);
          let Te = (m?.phases ?? []).slice(de.length).map(ae);
          be = [...me, ...Te];
          t[7] = de;
          t[8] = m?.phases;
          t[9] = be;
        } else {
          be = t[9];
        }
        f = be;
        break e;
      }
      if (m && m.phases.length > 0) {
        let be;
        if (t[12] !== m.phases) {
          be = m.phases.map(ae);
          t[12] = m.phases;
          t[13] = be;
        } else {
          be = t[13];
        }
        f = be;
        break e;
      }
      f = null;
    }
    let h = f;
    let [g, y] = dZo.useState(h === null);
    let _;
    if (t[14] !== o) {
      _ = function (se) {
        if (se.ctrl && se.key === "g") {
          se.preventDefault();
          let ae = KZ(o);
          if (ae.content !== null && ae.content !== o) {
            s(ae.content);
            y(false);
          }
        }
      };
      t[14] = o;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b = _;
    let S;
    if (t[16] !== r || t[17] !== n || t[18] !== o) {
      S = (re, se) => {
        if (re === "toggle") {
          y(qPf);
          return;
        }
        r(mapWorkflowSelectionToResult(re, n, o, se));
      };
      t[16] = r;
      t[17] = n;
      t[18] = o;
      t[19] = S;
    } else {
      S = t[19];
    }
    let E = S;
    let C;
    if (t[20] !== r) {
      C = () => {
        r({
          behavior: "deny"
        });
      };
      t[20] = r;
      t[21] = C;
    } else {
      C = t[21];
    }
    let x = C;
    let A;
    if (t[22] !== u) {
      A = u?.meta.description !== undefined ? oR(u.meta.description) : undefined;
      t[22] = u;
      t[23] = A;
    } else {
      A = t[23];
    }
    let k = A;
    let I;
    e: {
      if (n.args === undefined) {
        I = undefined;
        break e;
      }
      let re;
      if (t[24] !== n.args) {
        let se;
        try {
          se = De(n.args);
        } catch {
          se = String(n.args);
        }
        se = oR(se);
        re = se.length > 120 ? se.slice(0, 119) + "\u2026" : se;
        t[24] = n.args;
        t[25] = re;
      } else {
        re = t[25];
      }
      I = re;
    }
    let O = I;
    let M;
    if (t[26] !== n) {
      M = Boolean(n.workflowName) && cZo(n);
      t[26] = n;
      t[27] = M;
    } else {
      M = t[27];
    }
    let L = M;
    let P;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      P = {
        label: "Yes, run it",
        value: "yes",
        feedbackConfig: {
          type: "accept"
        }
      };
      t[28] = P;
    } else {
      P = t[28];
    }
    let F;
    if (t[29] !== h || t[30] !== n.workflowName || t[31] !== L || t[32] !== g) {
      if (F = [P], L) {
        let se;
        if (t[34] !== n.workflowName) {
          se = LE.jsx(Text, {
            bold: true,
            children: n.workflowName
          });
          t[34] = n.workflowName;
          t[35] = se;
        } else {
          se = t[35];
        }
        let ae;
        if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
          ae = LE.jsx(Text, {
            bold: true,
            children: getOriginalCwd()
          });
          t[36] = ae;
        } else {
          ae = t[36];
        }
        let de;
        if (t[37] !== se) {
          de = {
            label: LE.jsxs(Text, {
              children: ["Yes, and don't ask again for", " ", se, " in", " ", ae]
            }),
            value: "yes-always"
          };
          t[37] = se;
          t[38] = de;
        } else {
          de = t[38];
        }
        F.push(de);
      }
      if (h) {
        let se = g ? "View workflow summary" : "View raw script";
        let ae;
        if (t[39] !== se) {
          ae = {
            label: se,
            value: "toggle"
          };
          t[39] = se;
          t[40] = ae;
        } else {
          ae = t[40];
        }
        F.push(ae);
      }
      let re;
      if (t[41] === Symbol.for("react.memo_cache_sentinel")) {
        re = {
          label: "No",
          value: "no",
          feedbackConfig: {
            type: "reject"
          }
        };
        t[41] = re;
      } else {
        re = t[41];
      }
      F.push(re);
      t[29] = h;
      t[30] = n.workflowName;
      t[31] = L;
      t[32] = g;
      t[33] = F;
    } else {
      F = t[33];
    }
    let H = F;
    let U;
    if (t[42] !== n.toolName) {
      U = qi(n.toolName);
      t[42] = n.toolName;
      t[43] = U;
    } else {
      U = t[43];
    }
    let N;
    if (t[44] !== n.isMcp || t[45] !== U) {
      N = {
        toolName: U,
        isMcp: n.isMcp
      };
      t[44] = n.isMcp;
      t[45] = U;
      t[46] = N;
    } else {
      N = t[46];
    }
    let W = N;
    let j;
    if (t[47] !== k) {
      j = k && LE.jsx(gXd, {
        marginBottom: 1,
        children: LE.jsx(Text, {
          bold: true,
          children: k
        })
      });
      t[47] = k;
      t[48] = j;
    } else {
      j = t[48];
    }
    let z;
    if (t[49] !== h || t[50] !== a || t[51] !== g) {
      z = g || !h ? LE.jsx(gXd, {
        borderStyle: "dashed",
        borderColor: "subtle",
        paddingX: 1,
        children: LE.jsx(w$, {
          code: a,
          filePath: "workflow.js"
        })
      }) : LE.jsxs(gXd, {
        flexDirection: "column",
        children: [LE.jsx(Text, {
          children: "This dynamic workflow will spin up multiple subagents across the following phases:"
        }), h.map(HPf)]
      });
      t[49] = h;
      t[50] = a;
      t[51] = g;
      t[52] = z;
    } else {
      z = t[52];
    }
    let V;
    if (t[53] !== O) {
      V = O && LE.jsx(gXd, {
        marginTop: 1,
        children: LE.jsxs(Text, {
          children: [LE.jsxs(Text, {
            bold: true,
            dimColor: true,
            children: ["args:", " "]
          }), LE.jsx(Text, {
            dimColor: true,
            children: O
          })]
        })
      });
      t[53] = O;
      t[54] = V;
    } else {
      V = t[54];
    }
    let K;
    if (t[55] !== j || t[56] !== z || t[57] !== V) {
      K = LE.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        marginBottom: 1,
        overflow: "hidden",
        children: [j, z, V]
      });
      t[55] = j;
      t[56] = z;
      t[57] = V;
      t[58] = K;
    } else {
      K = t[58];
    }
    let J;
    if (t[59] === Symbol.for("react.memo_cache_sentinel")) {
      J = LE.jsx(gXd, {
        marginBottom: 1,
        children: LE.jsx(Text, {
          color: "warning",
          children: WORKFLOW_USAGE_WARNING
        })
      });
      t[59] = J;
    } else {
      J = t[59];
    }
    let Q;
    if (t[60] !== x || t[61] !== E || t[62] !== H || t[63] !== W) {
      Q = LE.jsx(ZBe, {
        options: H,
        onSelect: E,
        onCancel: x,
        question: J,
        toolAnalyticsContext: W
      });
      t[60] = x;
      t[61] = E;
      t[62] = H;
      t[63] = W;
      t[64] = Q;
    } else {
      Q = t[64];
    }
    let Z;
    if (t[65] === Symbol.for("react.memo_cache_sentinel")) {
      Z = LE.jsx(Text, {
        dimColor: true,
        children: LE.jsx(xt, {
          chord: "ctrl+g",
          action: "edit script in $EDITOR"
        })
      });
      t[65] = Z;
    } else {
      Z = t[65];
    }
    let ne;
    if (t[66] !== Q) {
      ne = LE.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        children: [Q, Z]
      });
      t[66] = Q;
      t[67] = ne;
    } else {
      ne = t[67];
    }
    let oe;
    if (t[68] !== b || t[69] !== K || t[70] !== ne) {
      oe = LE.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: b,
        children: [K, ne]
      });
      t[68] = b;
      t[69] = K;
      t[70] = ne;
      t[71] = oe;
    } else {
      oe = t[71];
    }
    let ee;
    if (t[72] !== n.requestSource || t[73] !== oe) {
      ee = LE.jsx(qm, {
        color: "permission",
        title: "Run a dynamic workflow?",
        requestSource: n.requestSource,
        children: oe
      });
      t[72] = n.requestSource;
      t[73] = oe;
      t[74] = ee;
    } else {
      ee = t[74];
    }
    return ee;
  }
  function HPf(e, t) {
    return LE.jsxs(EOc.Fragment, {
      children: [LE.jsxs(Text, {
        children: ["  ", t + 1, ". ", e.title, e.detail ? LE.jsxs(Text, {
          dimColor: true,
          children: [" \u2014 ", e.detail]
        }) : ""]
      }), e.prompts.length > 0 && LE.jsxs(Text, {
        dimColor: true,
        children: ["     ", e.prompts.slice(0, 2).map(jPf).join("  "), e.prompts.length > 2 ? `  +${e.prompts.length - 2} more` : ""]
      })]
    }, t);
  }
  function jPf(e) {
    return `\xB7 "${e.length > 60 ? e.slice(0, 59) + "\u2026" : e}"`;
  }
  function qPf(e) {
    return !e;
  }
  function WPf(e) {
    let t = new Set();
    let n = [];
    for (let r of e?.agents ?? []) {
      if (r.prompt && !t.vZc(r.prompt)) {
        t.add(r.prompt);
        n.push(oR(r.prompt));
      }
    }
    return n;
  }
  var TOc;
  var EOc;
  var dZo;
  var LE;
  var WORKFLOW_USAGE_WARNING;
  var BPf;
  var ROc = __lazy(() => {
    at();
    bs();
    SMe();
    XI();
    Ton();
    et();
    Gu();
    SOc();
    Bse();
    Lfe();
    uZo();
    TOc = __toESM(pt(), 1);
    EOc = __toESM(ot(), 1);
    dZo = __toESM(ot(), 1);
    LE = __toESM(ie(), 1);
    WORKFLOW_USAGE_WARNING = "Dynamic workflows can use a lot of tokens quickly by running many " + "subagents in parallel \u2014 which counts against your usage limit. Stop a " + "running workflow at any time with /workflows, or disable dynamic workflows in /config.";
    BPf = {
      loop: "loop",
      parallel: "parallel",
      sequential: "step"
    };
  });
  function sOf(e) {
    let t = IOc.c(3);
    let {
      answer: n
    } = e;
    let {
      addNotification: r
    } = Fi();
    let o;
    if (t[0] !== r || t[1] !== n) {
      o = cN.jsx(atn, {
        variant: "mid-session",
        onDone: (s, i) => {
          if (i !== undefined) {
            r({
              kind: "feedback",
              key: "fable-consent-result",
              text: i,
              priority: "high"
            });
          }
          n(s === "consent" ? "consent" : s === "switch" ? "switch_default" : "cancelled");
        }
      });
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function DOc() {
    return POc.useSyncExternalStore(Z3.subscribe, AOc, AOc);
  }
  function AOc() {
    let e = Z3.getState().open.at(-1);
    return e ? fZo[e.kind] ?? "inline" : undefined;
  }
  var IOc;
  var POc;
  var cN;
  var kOc;
  var tyr;
  var GPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(rPc, {
    tmuxAvailable: e.tmuxAvailable,
    onDone: t
  });
  var VPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(tPc, {
    request: e,
    onDone: t
  });
  var zPf = ({
    payload: e,
    answer: t
  }) => {
    let n = {
      serverName: e.serverName,
      requestId: `dialog-${e.params.elicitationId}`,
      params: e.params,
      signal: new AbortController().signal,
      waitingState: {
        actionLabel: "Retry now",
        showCancel: true
      },
      respond: () => {}
    };
    return cN.jsx(ihr, {
      event: n,
      onResponse: (r, o) => {
        if (r === "accept" && e.params.mode === "url") {
          return;
        }
        t({
          action: r,
          content: o
        });
      },
      onWaitingDismiss: r => {
        t({
          action: r === "retry" ? "accept" : "cancel"
        });
      }
    });
  };
  var KPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(eOc, {
    payload: e,
    answer: t
  });
  var YPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(hOc, {
    payload: e,
    answer: t
  });
  var JPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(pOc, {
    payload: e,
    answer: t
  });
  var XPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(iOc, {
    payload: e,
    answer: t
  });
  var QPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(zPc, {
    payload: e,
    answer: t
  });
  var ZPf = ({
    payload: e,
    answer: t
  }) => cN.jsx(TPc, {
    payload: e,
    answer: t
  });
  var eOf = ({
    payload: e,
    answer: t
  }) => cN.jsx($Pc, {
    payload: e,
    answer: t
  });
  var tOf = ({
    payload: e,
    answer: t
  }) => cN.jsx(W0c, {
    payload: e,
    answer: t
  });
  var nOf = ({
    payload: e,
    answer: t
  }) => cN.jsx(XPc, {
    payload: e,
    answer: t
  });
  var rOf = ({
    payload: e,
    answer: t
  }) => cN.jsx(MPc, {
    payload: e,
    answer: t
  });
  var oOf = ({
    payload: e,
    answer: t
  }) => cN.jsx(cOc, {
    payload: e,
    answer: t
  });
  var iOf = ({
    payload: e,
    answer: t
  }) => cN.jsx(FPc, {
    payload: e,
    answer: t
  });
  var pZo = null;
  var mZo = null;
  var fZo;
  var OOc;
  var MOc;
  var hZo = __lazy(() => {
    I6o();
    JJo();
    nPc();
    Nd();
    oPc();
    wPc();
    RXn();
    NPc();
    UPc();
    xXn();
    OOo();
    ITo();
    FBe();
    HPc();
    WQo();
    n4n();
    DOo();
    MOo();
    KPc();
    ypt();
    kXn();
    pOo();
    QPc();
    GOo();
    uZo();
    aOc();
    OXn();
    VOo();
    uOc();
    mWt();
    mOc();
    zOo();
    gOc();
    KOo();
    IOc = __toESM(pt(), 1);
    POc = __toESM(ot(), 1);
    cN = __toESM(ie(), 1);
    kOc = (ROc(), __toCommonJS(COc)).WorkflowPermissionDialog;
    tyr = (aFo(), __toCommonJS(iFo)).workflowPermissionDialog;
    if (null) {
      let e = null;
      pZo = ({
        payload: t,
        answer: n
      }) => cN.jsx(e, {
        payload: t,
        answer: n
      });
    }
    if (kOc) {
      let e = kOc;
      mZo = ({
        payload: t,
        answer: n
      }) => cN.jsx(e, {
        payload: t,
        answer: n
      });
    }
    fZo = {
      [nSt.kind]: "modal"
    };
    OOc = {
      [mLe.kind]: "Claude needs your permission",
      [c7t.kind]: "Claude needs your permission",
      [l7t.kind]: "Claude needs your permission",
      [a7t.kind]: "Claude needs your permission",
      [dLe.kind]: "Claude needs your permission",
      [Wze.kind]: "Claude needs your permission",
      [t7t.kind]: "Claude Code wants to enter plan mode",
      [nSt.kind]: "Claude Code needs your approval for the plan",
      [i7t.kind]: "Claude needs your permission",
      [Gze.kind]: "Claude needs your permission",
      ...{
        [WX.kind]: "Session paused"
      },
      [CTe.kind]: "Session paused",
      [e7t.kind]: "Claude needs your permission",
      ...(null && {
        [(null).kind]: "Claude needs your approval for a review artifact"
      }),
      ...(tyr && {
        [tyr.kind]: "Claude needs your permission"
      })
    };
    MOc = {
      [dXn.kind]: GPf,
      [bGn.kind]: VPf,
      [rft.kind]: zPf,
      [mLe.kind]: KPf,
      [c7t.kind]: YPf,
      [l7t.kind]: JPf,
      [a7t.kind]: XPf,
      [dLe.kind]: QPf,
      [Wze.kind]: ZPf,
      [t7t.kind]: eOf,
      [nSt.kind]: tOf,
      [i7t.kind]: nOf,
      [Gze.kind]: rOf,
      ...{
        [WX.kind]: oOf
      },
      [CTe.kind]: sOf,
      [e7t.kind]: iOf,
      ...(pZo && null && {
        [(null).kind]: pZo
      }),
      ...(mZo && tyr && {
        [tyr.kind]: mZo
      })
    };
  });
  function gZo(e) {
    let t = won.c(14);
    let {
      channel: n,
      variant: r,
      components: o,
      layouts: s,
      notifications: i
    } = e;
    let a = r === undefined ? "inline" : r;
    let l = o === undefined ? MOc : o;
    let c = s === undefined ? fZo : s;
    let u = i === undefined ? OOc : i;
    yZo(n);
    let d = QIc();
    if (!d) {
      return null;
    }
    if ((c[d.kind] ?? "inline") !== a) {
      return null;
    }
    let m = u[d.kind];
    let f = l[d.kind];
    if (!f) {
      Z3.dismiss(d.id);
      return null;
    }
    let h;
    if (t[0] !== m || t[1] !== d.id) {
      h = m !== undefined && von.jsx(aOf, {
        dialogId: d.id,
        message: m
      });
      t[0] = m;
      t[1] = d.id;
      t[2] = h;
    } else {
      h = t[2];
    }
    let g;
    if (t[3] !== d.id || t[4] !== d.swappedAt) {
      g = b => {
        if (d.swappedAt !== undefined && Date.now() - d.swappedAt < 150) {
          return;
        }
        Z3.answer(d.id, b);
      };
      t[3] = d.id;
      t[4] = d.swappedAt;
      t[5] = g;
    } else {
      g = t[5];
    }
    let y;
    if (t[6] !== f || t[7] !== g || t[8] !== d.payload) {
      y = von.jsx(f, {
        payload: d.payload,
        answer: g
      });
      t[6] = f;
      t[7] = g;
      t[8] = d.payload;
      t[9] = y;
    } else {
      y = t[9];
    }
    let _;
    if (t[10] !== h || t[11] !== y || t[12] !== d.id) {
      _ = von.jsxs(gXd, {
        flexDirection: "column",
        width: "100%",
        children: [h, y]
      }, d.id);
      t[10] = h;
      t[11] = y;
      t[12] = d.id;
      t[13] = _;
    } else {
      _ = t[13];
    }
    return _;
  }
  function aOf(e) {
    let t = won.c(4);
    let {
      dialogId: n,
      message: r
    } = e;
    xrn(r, "permission_prompt");
    let o = PSt();
    let s;
    let i;
    if (t[0] !== o || t[1] !== n) {
      s = () => {
        if (NOc === n) {
          return;
        }
        NOc = n;
        o();
      };
      i = [o, n];
      t[0] = o;
      t[1] = n;
      t[2] = s;
      t[3] = i;
    } else {
      s = t[2];
      i = t[3];
    }
    nyr.useEffect(s, i);
    return null;
  }
  function lOf(e) {
    let t = won.c(5);
    let n = YJe();
    let r = $gr();
    let o;
    let s;
    if (t[0] !== e || t[1] !== n || t[2] !== r) {
      o = () => {
        if (!e || !n || r === null) {
          return;
        }
        logEvent("tengu_dialoghost_suppressed", {
          reason: r
        });
      };
      s = [e, n, r];
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
      t[4] = s;
    } else {
      o = t[3];
      s = t[4];
    }
    nyr.useEffect(o, s);
  }
  function yZo(e) {
    let t = won.c(3);
    lOf(e !== undefined);
    let n;
    let r;
    if (t[0] !== e) {
      n = () => {
        if (!e) {
          return;
        }
        let o = new Set();
        let s = e.subscribe(c => {
          o.add(c.id);
          Z3.open(c);
        });
        let i = e.onCancel(cOf);
        let a = e.onUpdate(c => {
          let {
            id: u,
            payload: d
          } = c;
          if (o.vZc(u)) {
            Z3.update(u, d);
          }
        });
        let l = Z3.onClosed(c => {
          if (!o.delete(c.id)) {
            return;
          }
          e.reply(c.type === "answered" ? {
            id: c.id,
            result: c.result
          } : {
            id: c.id,
            cancelled: true
          });
        });
        return () => {
          s();
          i();
          a();
          l();
          for (let c of o) {
            Z3.dismiss(c);
            e.reply({
              id: c,
              cancelled: true
            });
          }
          o.clear();
        };
      };
      r = [e];
      t[0] = e;
      t[1] = n;
      t[2] = r;
    } else {
      n = t[1];
      r = t[2];
    }
    nyr.useEffect(n, r);
  }
  function cOf(e) {
    Z3.dismiss(e);
  }
  var won;
  var nyr;
  var von;
  var NOc;
  var LOc = __lazy(() => {
    pQn();
    YJo();
    et();
    Ot();
    FBe();
    rZo();
    hZo();
    won = __toESM(pt(), 1);
    nyr = __toESM(ot(), 1);
    von = __toESM(ie(), 1);
  });
  var FOc = __lazy(() => {
    at();
    HG();
    TZn();
  });
  var UOc = __lazy(() => {
    at();
    x$();
    ru();
    Ot();
    FOc();
    HG();
    je();
    d_();
    dt();
    ji();
    FP();
    na();
    Rn();
  });
  function uOf() {
    return {
      fileContentCache: new Map(),
      turnBaselines: new Map(),
      dirtyAttributions: new Map(),
      gitStatusInFlight: new Map(),
      hooksRegistered: false
    };
  }
  var bmv;
  var _Zo = __lazy(() => {
    at();
    Cgn();
    R$();
    Ay();
    i9t();
    IMe();
    DEe();
    mx();
    O6t();
    hd();
    HG();
    je();
    gn();
    ji();
    na();
    Eo();
    UOc();
    fa();
    TZn();
    bmv = uOf();
  });
  function bZo(e, t, n) {
    return (r, o, s, i, a) => {
      let l = t.current++;
      e.current[l] = {
        id: l,
        type: "image",
        content: r,
        mediaType: o ?? "image/png",
        filename: s,
        dimensions: i,
        sourcePath: a
      };
      n(new aSe(`${ALn(l)} `));
    };
  }
  var BOc = __lazy(() => {
    gq();
    ZNn();
  });
  function $Oc(e) {
    let [t, n] = ryr.useState([]);
    ryr.useEffect(() => {
      if (va() || li()) {
        return;
      }
      if (!rht()) {
        return;
      }
      let r = false;
      QWn().then(async o => {
        if (r || !o) {
          return;
        }
        let s = {
          type: o.url.startsWith("ws:") ? "ws-ide" : "sse-ide",
          url: o.url,
          ideName: o.name,
          authToken: o.authToken,
          ideRunningInWindows: o.ideRunningInWindows,
          scope: "dynamic"
        };
        if (await xgt(), r || isMcpServerBlockedAtConnectTime("ide", s)) {
          return;
        }
        let i = await kM("ide", s);
        if (r) {
          return;
        }
        if (i.type !== "connected") {
          Ow("ide", s).catch(() => {});
        }
        n([i]);
      });
      return () => {
        r = true;
        nGn();
      };
    }, []);
    ahr(t, e);
  }
  var ryr;
  var HOc = __lazy(() => {
    ru();
    eA();
    Iw();
    yd();
    bT();
    chr();
    ryr = __toESM(ot(), 1);
  });
  function qOc(e) {
    return e.replace(/([a-z])([A-Z])/g, "$1 $2").split(/[-_./\s]+/).map(t => t.trim()).filter(t => t.length > 2 && t.length <= 20);
  }
  function pOf(e) {
    let t = SZo.basename(e).replace(/\.[^.]+$/, "");
    return qOc(t);
  }
  async function TZo(e) {
    let t = new Set(dOf);
    try {
      let n = getProjectRoot();
      if (n) {
        let r = SZo.basename(n);
        if (r.length > 2 && r.length <= 50) {
          t.add(r);
        }
      }
    } catch {}
    try {
      let n = await getBranch();
      if (n) {
        for (let r of qOc(n)) {
          t.add(r);
        }
      }
    } catch {}
    if (e) {
      for (let n of e) {
        if (t.size >= 50) {
          break;
        }
        for (let r of pOf(n)) {
          t.add(r);
        }
      }
    }
    return [...t].slice(0, 50);
  }
  var SZo;
  var dOf;
  var WOc = __lazy(() => {
    at();
    na();
    SZo = require("path");
    dOf = ["MCP", "symlink", "grep", "regex", "localhost", "codebase", "TypeScript", "JSON", "OAuth", "webhook", "gRPC", "dotfiles", "subagent", "worktree"];
  });
  var YOc = {};
  __export(YOc, {
    useVoice: () => useVoice,
    computeLevel: () => computeLevel,
    FIRST_PRESS_FALLBACK_MS: () => 2000
  });
  function oyr() {
    e2e.push(Date.now());
  }
  function mOf() {
    e2e.length = 0;
    syr = false;
  }
  function zOc(e) {
    return `voice_transcription_connection_failed_${e ?? "no_response"}`;
  }
  function computeLevel(e) {
    let t = e.length >> 1;
    if (t === 0) {
      return 0;
    }
    let n = 0;
    for (let s = 0; s < e.length - 1; s += 2) {
      let i = (e[s] | e[s + 1] << 8) << 16 >> 16;
      n += i * i;
    }
    let r = Math.sqrt(n / t);
    let o = Math.min(r / 2000, 1);
    return Math.sqrt(o);
  }
  function useVoice({
    onTranscript: e,
    onError: t,
    enabled: n,
    focusMode: r,
    mode: o = "hold"
  }) {
    let [s, i] = lg.useState("idle");
    let a = lg.useRef("idle");
    let l = lg.useRef(null);
    let c = lg.useRef("");
    let u = lg.useRef(e);
    let d = lg.useRef(t);
    let p = lg.useRef(null);
    let m = lg.useRef(null);
    let f = lg.useRef(false);
    let h = lg.useRef(null);
    let g = lg.useRef(false);
    let y = lg.useRef(false);
    let _ = lg.useRef(null);
    let b = lg.useRef(null);
    let S = lg.useRef(null);
    let E = lg.useRef(false);
    let C = lg.useRef(0);
    let x = lg.useRef(0);
    let A = lg.useRef(false);
    let k = lg.useRef([]);
    let I = lg.useRef(false);
    let O = lg.useRef(0);
    let M = lg.useRef(0);
    let L = lg.useRef(false);
    let P = lg.useRef(false);
    let F = lg.useRef(null);
    let H = lg.useRef([]);
    let U = useTerminalFocus();
    let N = useSetVoiceState();
    let W = useClock();
    u.current = e;
    d.current = t;
    function j(ee) {
      a.current = ee;
      i(ee);
      N(re => {
        if (re.voiceState === ee) {
          return re;
        }
        return {
          ...re,
          voiceState: ee
        };
      });
    }
    let z = lg.useCallback(() => {
      if (x.current++, p.current) {
        p.current();
        p.current = null;
      }
      if (m.current) {
        m.current();
        m.current = null;
      }
      if (h.current) {
        h.current();
        h.current = null;
      }
      if (_.current) {
        _.current();
        _.current = null;
      }
      if (b.current) {
        b.current();
        b.current = null;
      }
      if (S.current) {
        S.current();
        S.current = null;
      }
      if (E.current = false, y.current = false, sRe?.stopRecording(), l.current) {
        l.current.close();
        l.current = null;
      }
      c.current = "";
      H.current = [];
      k.current = [];
      N(ee => {
        if (ee.voiceInterimTranscript === "" && !ee.voiceAudioLevels.length) {
          return ee;
        }
        return {
          ...ee,
          voiceInterimTranscript: "",
          voiceAudioLevels: []
        };
      });
    }, [N]);
    function V() {
      logForDebugging("[voice] finishRecording: stopping recording, transitioning to processing");
      O.current++;
      let ee = g.current;
      if (g.current = false, y.current = false, b.current) {
        b.current();
        b.current = null;
      }
      if (S.current) {
        S.current();
        S.current = null;
      }
      j("processing");
      sRe?.stopRecording();
      let re = Date.now() - C.current;
      let se = L.current;
      let ae = A.current;
      let de = M.current;
      let be = P.current;
      let fe = F.current;
      let me = x.current;
      let Te = () => x.current !== me;
      logForDebugging("[voice] Recording stopped");
      (l.current ? l.current.finalize() : Promise.resolve(undefined)).then(async ce => {
        if (Te()) {
          return;
        }
        if (ce === "no_data_timeout" && se && be && !ee && de === 0 && c.current.trim() === "" && !I.current && k.current.length > 0) {
          if (I.current = true, logForDebugging(`[voice] Silent-drop detected (no_data_timeout, ${String(k.current.length)} chunks); replaying on fresh connection`), logEvent("tengu_voice_silent_drop_replay", {
            recordingDurationMs: re,
            chunkCount: k.current.length
          }), l.current) {
            l.current.close();
            l.current = null;
          }
          let pe = k.current;
          if (await sleep(250), Te()) {
            return;
          }
          let ve = iZe(getInitialSettings().language);
          let _e = await TZo();
          if (Te()) {
            return;
          }
          if (await new Promise(xe => {
            connectVoiceStream({
              onTranscript: (ke, Ie) => {
                if (Te()) {
                  return;
                }
                if (Ie && ke.trim()) {
                  if (c.current) {
                    c.current += " ";
                  }
                  c.current += ke.trim();
                }
              },
              onError: () => xe(),
              onClose: () => {},
              onReady: ke => {
                if (Te()) {
                  ke.close();
                  xe();
                  return;
                }
                l.current = ke;
                let Ie = 32000;
                let Ue = [];
                let Ge = 0;
                for (let Be of pe) {
                  if (Ge > 0 && Ge + Be.length > Ie) {
                    ke.send(Buffer.concat(Ue));
                    Ue = [];
                    Ge = 0;
                  }
                  Ue.push(Be);
                  Ge += Be.length;
                }
                if (Ue.length) {
                  ke.send(Buffer.concat(Ue));
                }
                ke.finalize().then(() => {
                  ke.close();
                  xe();
                });
              }
            }, {
              language: ve.code,
              keyterms: _e
            }).then(ke => {
              if (!ke) {
                xe();
              }
            }, () => xe());
          }), Te()) {
            return;
          }
        }
        k.current = [];
        let le = c.current.trim();
        if (logForDebugging(`[voice] Final transcript assembled (${String(le.length)} chars)`), logEvent("tengu_voice_recording_completed", {
          transcriptChars: le.length + de,
          recordingDurationMs: re,
          hadAudioSignal: se,
          retried: ae,
          silentDropRetried: I.current,
          wsConnected: be,
          focusTriggered: ee
        }), l.current) {
          l.current.close();
          l.current = null;
        }
        if (le) {
          logForDebugging(`[voice] Injecting transcript (${String(le.length)} chars)`);
          Pe("voice_transcription");
          u.current(le);
        } else if (de === 0 && re > 2000) {
          if (!be) {
            if (d.current("Voice connection failed. Check your network and try again."), fe) {
              Ae("voice_transcription", zOc(fe));
            } else {
              probeVoiceConnectivity().then(pe => {
                Ae("voice_transcription", zOc(`probe_${pe}`));
              });
            }
          } else if (!se) {
            Ae("voice_transcription", "voice_transcription_no_audio_signal");
            d.current("No audio detected from microphone. Check that the correct input device is selected and that Claude Code has microphone access.");
          } else {
            Ae("voice_transcription", "voice_transcription_no_speech");
            d.current("No speech detected.");
          }
        }
        c.current = "";
        N(pe => {
          if (pe.voiceInterimTranscript === "") {
            return pe;
          }
          return {
            ...pe,
            voiceInterimTranscript: ""
          };
        });
        j("idle");
      }).catch(ce => {
        if (Ae("voice_transcription", "voice_transcription_finalize_failed"), Oe(sr(ce)), !Te()) {
          j("idle");
        }
      });
    }
    lg.useEffect(() => {
      if (n && !sRe) {
        Promise.resolve().then(() => (Btn(), Utn)).then(ee => {
          sRe = ee;
        });
      }
    }, [n]);
    function K() {
      if (_.current) {
        _.current();
      }
      _.current = W.setTimeout(() => {
        if (_.current = null, a.current === "recording" && g.current) {
          logForDebugging("[voice] Focus silence timeout \u2014 tearing down session");
          E.current = true;
          V();
        }
      }, 5000);
    }
    function J() {
      if (b.current) {
        b.current();
      }
      b.current = W.setTimeout(() => {
        if (b.current = null, a.current === "recording" && y.current) {
          logForDebugging("[voice] Toggle silence timeout \u2014 auto-finishing");
          V();
        }
      }, 15000);
    }
    function Q() {
      if (S.current) {
        S.current();
      }
      S.current = W.setTimeout(() => {
        if (S.current = null, a.current === "recording" && y.current) {
          logForDebugging("[voice] Toggle max-duration cap \u2014 auto-finishing");
          V();
        }
      }, 120000);
    }
    lg.useEffect(() => {
      if (!n || !r) {
        if (g.current && a.current === "recording") {
          logForDebugging("[voice] Focus mode disabled during recording, finishing");
          V();
        }
        return;
      }
      let ee = false;
      if (U && a.current === "idle" && !E.current) {
        let re = () => {
          if (ee || a.current !== "idle" || E.current) {
            return;
          }
          logForDebugging("[voice] Focus gained, starting recording session");
          g.current = true;
          Z();
          K();
        };
        if (sRe) {
          re();
        } else {
          Promise.resolve().then(() => (Btn(), Utn)).then(se => {
            sRe = se;
            re();
          });
        }
      } else if (!U) {
        if (E.current = false, a.current === "recording") {
          logForDebugging("[voice] Focus lost, finishing recording");
          V();
        }
      }
      return () => {
        ee = true;
      };
    }, [n, r, U]);
    async function Z() {
      if (!sRe) {
        Ae("voice_start", "voice_start_module_not_loaded");
        d.current("Voice module not loaded yet. Try again in a moment.");
        return;
      }
      let ee = Date.now();
      while (e2e.length > 0 && ee - e2e[0] > 1e4) {
        e2e.shift();
      }
      if (e2e.length < 3) {
        syr = false;
      }
      if (e2e.length >= 3) {
        if (!syr) {
          syr = true;
          logForDebugging(`[voice] circuit breaker: ${String(e2e.length)} early failures in ${String(1e4)}ms \u2014 suppressing new sessions until one succeeds`, {
            level: "error"
          });
          logEvent("tengu_voice_circuit_breaker_tripped", {});
          d.current("Voice input is failing repeatedly and has been paused. Check your microphone and try again in a moment.");
        }
        return;
      }
      j("recording");
      C.current = Date.now();
      c.current = "";
      f.current = false;
      L.current = false;
      A.current = false;
      I.current = false;
      k.current = [];
      M.current = 0;
      P.current = false;
      F.current = null;
      let re = ++x.current;
      let se = await sRe.checkRecordingAvailability();
      if (!se.available) {
        logForDebugging(`[voice] Recording not available: ${se.reason ?? "unknown"}`);
        Ae("voice_start", "voice_start_recording_unavailable");
        d.current(se.reason ?? "Audio recording is not available.");
        oyr();
        z();
        j("idle");
        return;
      }
      logForDebugging("[voice] Starting recording session, connecting voice stream");
      N(ce => {
        if (!ce.voiceError) {
          return ce;
        }
        return {
          ...ce,
          voiceError: null
        };
      });
      let ae = [];
      if (logForDebugging("[voice] startRecording: buffering audio while WebSocket connects"), H.current = [], !(await sRe.startRecording(ce => {
        let le = Buffer.from(ce);
        if (!g.current) {
          k.current.push(le);
        }
        if (l.current) {
          l.current.send(le);
        } else {
          ae.push(le);
        }
        let pe = computeLevel(ce);
        if (!L.current && pe > 0.01) {
          L.current = true;
        }
        let ve = H.current;
        if (ve.length >= 16) {
          ve.shift();
        }
        ve.push(pe);
        let _e = [...ve];
        H.current = _e;
        N(xe => ({
          ...xe,
          voiceAudioLevels: _e
        }));
      }, () => {
        if (a.current === "recording") {
          V();
        }
      }, {
        silenceDetection: false
      }))) {
        Ae("voice_start", "voice_start_capture_failed");
        logForDebugging("[voice] Recording failed \u2014 no audio tool found", {
          level: "error"
        });
        d.current("Failed to start audio capture. Check that your microphone is accessible.");
        oyr();
        z();
        j("idle");
        N(ce => ({
          ...ce,
          voiceError: "Recording failed \u2014 no audio tool found"
        }));
        return;
      }
      let be = getInitialSettings().language;
      let fe = iZe(be);
      Pe("voice_start");
      logEvent("tengu_voice_recording_started", {
        focusTriggered: g.current,
        sttLanguage: fe.code,
        sttLanguageIsDefault: !be?.trim(),
        sttLanguageFellBack: fe.fellBackFrom !== undefined,
        systemLocaleLanguage: sms()
      });
      let me = false;
      let Te = () => x.current !== re;
      let ue = ce => {
        let le = O.current;
        connectVoiceStream({
          onTranscript: (pe, ve) => {
            if (Te()) {
              return;
            }
            if (me = true, mOf(), logForDebugging(`[voice] onTranscript: isFinal=${String(ve)} (${String(pe.length)} chars)`), ve && pe.trim()) {
              if (g.current) {
                logForDebugging(`[voice] Focus mode: flushing final transcript immediately (${String(pe.trim().length)} chars)`);
                Pe("voice_transcription");
                u.current(pe.trim());
                M.current += pe.trim().length;
                N(_e => {
                  if (_e.voiceInterimTranscript === "") {
                    return _e;
                  }
                  return {
                    ..._e,
                    voiceInterimTranscript: ""
                  };
                });
                c.current = "";
                K();
              } else {
                if (y.current) {
                  J();
                }
                if (c.current) {
                  c.current += " ";
                }
                c.current += pe.trim();
                logForDebugging(`[voice] Accumulated final transcript (${String(c.current.length)} chars)`);
                N(_e => {
                  let xe = c.current;
                  if (_e.voiceInterimTranscript === xe) {
                    return _e;
                  }
                  return {
                    ..._e,
                    voiceInterimTranscript: xe
                  };
                });
              }
            } else if (!ve) {
              if (g.current) {
                K();
              } else if (y.current) {
                J();
              }
              let _e = pe.trim();
              let xe = c.current ? c.current + (_e ? " " + _e : "") : _e;
              N(ke => {
                if (ke.voiceInterimTranscript === xe) {
                  return ke;
                }
                return {
                  ...ke,
                  voiceInterimTranscript: xe
                };
              });
            }
          },
          onError: (pe, ve) => {
            if (Te()) {
              logForDebugging(`[voice] ignoring onError from stale session: ${pe}`);
              return;
            }
            if (O.current !== le) {
              logForDebugging(`[voice] ignoring stale onError from superseded attempt: ${pe}`);
              return;
            }
            if (ve?.connectFailureCode) {
              F.current = ve.connectFailureCode;
            }
            if (!ve?.fatal && !me && a.current === "recording") {
              if (!A.current) {
                A.current = true;
                logForDebugging(`[voice] early voice_stream error (pre-transcript), retrying once: ${pe}`);
                logEvent("tengu_voice_stream_early_retry", {});
                l.current = null;
                O.current++;
                W.setTimeout(() => {
                  if (a.current === "recording") {
                    ue(ce);
                  }
                }, 250);
                return;
              }
            }
            if (O.current++, !me) {
              oyr();
            }
            Ae("voice_stream_connect", "voice_stream_connection_error");
            logForDebugging(`[voice] voice_stream error: ${pe}`, {
              level: "error"
            });
            let _e = c.current.trim();
            if (_e) {
              logForDebugging(`[voice] mid-stream error: salvaging ${String(_e.length)} chars before cleanup`);
              Et("voice_transcription", "voice_transcription_partial_salvaged");
              u.current(_e);
            }
            d.current(`Voice stream error: ${pe}`);
            ae.length = 0;
            g.current = false;
            z();
            j("idle");
          },
          onClose: () => {},
          onReady: pe => {
            if (Te() || a.current !== "recording") {
              pe.close();
              return;
            }
            l.current = pe;
            P.current = true;
            Pe("voice_stream_connect");
            let ve = 32000;
            if (ae.length > 0) {
              let _e = 0;
              for (let Ie of ae) {
                _e += Ie.length;
              }
              let xe = [[]];
              let ke = 0;
              for (let Ie of ae) {
                if (ke > 0 && ke + Ie.length > ve) {
                  xe.push([]);
                  ke = 0;
                }
                xe.at(-1).push(Ie);
                ke += Ie.length;
              }
              logForDebugging(`[voice] onReady: flushing ${String(ae.length)} buffered chunks (${String(_e)} bytes) as ${String(xe.length)} coalesced frame(s)`);
              for (let Ie of xe) {
                pe.send(Buffer.concat(Ie));
              }
            }
            if (ae.length = 0, m.current) {
              m.current();
            }
            if (f.current) {
              m.current = W.setTimeout(() => {
                if (m.current = null, a.current === "recording") {
                  V();
                }
              }, 200);
            }
          }
        }, {
          language: fe.code,
          keyterms: ce
        }).then(pe => {
          if (Te()) {
            pe?.close();
            return;
          }
          if (!pe) {
            logForDebugging("[voice] Failed to connect to voice_stream (no OAuth token?)");
            Ae("voice_stream_connect", "voice_stream_no_auth");
            d.current("Voice mode requires a Claude.ai account. Please run /login to sign in.");
            ae.length = 0;
            z();
            j("idle");
            return;
          }
          if (a.current !== "recording") {
            ae.length = 0;
            pe.close();
            return;
          }
        }, pe => {
          if (Oe(sr(pe)), Ae("voice_stream_connect", "voice_stream_connect_exception"), Te()) {
            return;
          }
          if (a.current !== "recording") {
            return;
          }
          oyr();
          d.current("Voice connection failed. Check your network and try again.");
          ae.length = 0;
          g.current = false;
          z();
          j("idle");
        });
      };
      TZo().then(ue);
    }
    let ne = lg.useCallback((ee = 600) => {
      if (!n || !isVoiceStreamAvailable()) {
        return;
      }
      if (g.current) {
        return;
      }
      if (r && E.current) {
        logForDebugging("[voice] Re-arming focus recording after silence timeout");
        E.current = false;
        g.current = true;
        Z();
        K();
        return;
      }
      let re = a.current;
      if (re === "processing") {
        return;
      }
      if (o === "tap") {
        if (re === "idle") {
          logForDebugging("[voice] toggle: starting recording");
          y.current = true;
          Z();
          J();
          Q();
        } else if (re === "recording") {
          logForDebugging("[voice] toggle: finishing recording");
          V();
        }
        return;
      }
      if (re === "idle") {
        if (logForDebugging("[voice] handleKeyEvent: idle, starting recording session immediately"), Z(), h.current) {
          h.current();
        }
        h.current = W.setTimeout(() => {
          if (h.current = null, a.current === "recording" && !f.current) {
            logForDebugging("[voice] No auto-repeat seen, arming release timer via fallback");
            f.current = true;
            m.current = W.setTimeout(() => {
              if (m.current = null, a.current === "recording") {
                V();
              }
            }, 200);
          }
        }, ee);
      } else if (re === "recording") {
        if (f.current = true, h.current) {
          h.current();
          h.current = null;
        }
      }
      if (m.current) {
        m.current();
      }
      if (a.current === "recording" && f.current) {
        m.current = W.setTimeout(() => {
          if (m.current = null, a.current === "recording") {
            V();
          }
        }, 200);
      }
    }, [n, r, o, z, W]);
    lg.useEffect(() => {
      if (!n && a.current !== "idle") {
        z();
        j("idle");
      }
      return () => {
        if (z(), a.current !== "idle") {
          j("idle");
        }
      };
    }, [n, z]);
    let oe = lg.useCallback(() => {
      if (a.current === "idle") {
        return;
      }
      logForDebugging("[voice] cancelRecording: discarding without submit");
      Pe("voice_cancel");
      z();
      j("idle");
    }, [z]);
    return {
      state: s,
      handleKeyEvent: ne,
      cancelRecording: oe
    };
  }
  var lg;
  var sRe = null;
  var e2e;
  var syr = false;
  var JOc = __lazy(() => {
    E7();
    dSe();
    vPe();
    et();
    ln();
    Ot();
    WOc();
    iVo();
    je();
    dt();
    PP();
    Rn();
    lg = __toESM(ot(), 1);
    e2e = [];
  });
  var wZo = {};
  __export(wZo, {
    useVoiceKeybindingHandler: () => useVoiceKeybindingHandler,
    useVoiceIntegration: () => useVoiceIntegration
  });
  function COf(e, t) {
    if ((e.key === "return" ? "enter" : e.key.toLowerCase()) !== t.key) {
      return false;
    }
    if (e.ctrl !== t.ctrl) {
      return false;
    }
    if (e.shift !== t.shift) {
      return false;
    }
    if (e.meta !== (t.alt || t.meta)) {
      return false;
    }
    if (e.superKey !== t.super) {
      return false;
    }
    return true;
  }
  function ROf(e) {
    return pq.changed.subscribe(e);
  }
  function xOf() {
    return L1n(pq);
  }
  function useVoiceIntegration({
    setInputValueRaw: e,
    inputValueRef: t,
    insertTextRef: n,
    enableDoubleTapSubmit: r = true,
    isActive: o = true
  }) {
    let {
      addNotification: s
    } = Fi();
    let i = useSetVoiceState();
    let a = useGetVoiceState();
    let l = CR.useRef(null);
    let c = CR.useRef("");
    let u = CR.useRef(null);
    let d = CR.useCallback((E, {
      char: C = " ",
      anchor: x = false,
      floor: A = 0
    } = {}) => {
      let k = t.current;
      let I = n.current?.cursorOffset ?? k.length;
      let O = k.slice(0, I);
      let M = k.slice(I);
      let L = C === " " ? Bae(O) : O;
      let P = 0;
      while (P < L.length && L[L.length - 1 - P] === C) {
        P++;
      }
      let F = Math.max(0, Math.min(P - A, E));
      let H = P - F;
      let U = O.slice(0, O.length - F);
      let N = "";
      if (x) {
        if (l.current = U, c.current = M, M.length > 0 && !/^\s/.test(M)) {
          N = " ";
        }
      }
      let W = U + N + M;
      if (x) {
        u.current = W;
      }
      if (W === k && F === 0) {
        return H;
      }
      if (n.current) {
        n.current.setInputWithCursor(W, U.length);
      } else {
        e(W);
      }
      return H;
    }, [e, t, n]);
    let p = CR.useCallback(() => {
      let E = l.current;
      if (E === null) {
        return;
      }
      let C = c.current;
      l.current = null;
      c.current = "";
      let x = E + C;
      if (n.current) {
        n.current.setInputWithCursor(x, E.length);
      } else {
        e(x);
      }
    }, [e, n]);
    let m = Rhe();
    let f = bt(E => E.settings.voice?.autoSubmit === true);
    let h = bt(E => E.settings.voice?.mode ?? "hold");
    let g = useVoiceState(E => E.voiceState);
    let y = useVoiceState(E => E.voiceInterimTranscript);
    CR.useEffect(() => {
      if (o && a().voiceState === "recording" && l.current === null) {
        let E = t.current;
        let C = n.current?.cursorOffset ?? E.length;
        l.current = E.slice(0, C);
        c.current = E.slice(C);
        u.current = E;
      }
      if (g === "idle") {
        l.current = null;
        c.current = "";
        u.current = null;
      }
    }, [g, a, t, n, o]);
    CR.useEffect(() => {
      if (l.current === null) {
        return;
      }
      let E = l.current;
      let C = c.current;
      if (t.current !== u.current) {
        return;
      }
      let x = E.length > 0 && !/\s$/.test(E) && y.length > 0;
      let A = C.length > 0 && !/^\s/.test(C);
      let k = x ? " " : "";
      let I = A ? " " : "";
      let O = E + k + y + I + C;
      let M = E.length + k.length + y.length;
      if (n.current) {
        n.current.setInputWithCursor(O, M);
      } else {
        e(O);
      }
      u.current = O;
    }, [y, e, t, n]);
    let _ = CR.useCallback(E => {
      let C = l.current;
      if (C === null) {
        return;
      }
      let x = c.current;
      if (t.current !== u.current) {
        return;
      }
      let A = C.length > 0 && !/\s$/.test(C) && E.length > 0;
      let k = x.length > 0 && !/^\s/.test(x) && E.length > 0;
      let I = A ? " " : "";
      let O = k ? " " : "";
      let M = C + I + E + O + x;
      let L = C.length + I.length + E.length;
      if (n.current) {
        n.current.setInputWithCursor(M, L);
      } else {
        e(M);
      }
      u.current = M;
      l.current = C + I + E;
      let F = (h === "tap" || f) && oms(E) >= 3;
      if (F) {
        n.current?.submit(M, true);
      }
      i(H => {
        let U = r && h !== "tap" && !F;
        if (H.awaitingVoiceSubmitDoubleTap === U) {
          return H;
        }
        return {
          ...H,
          awaitingVoiceSubmitDoubleTap: U
        };
      });
    }, [e, t, n, i, r, f, h]);
    let b = TOf.useVoice({
      onTranscript: _,
      onError: E => {
        s({
          key: "voice-error",
          kind: "warning",
          text: E,
          color: "error",
          priority: "immediate",
          timeoutMs: 1e4
        });
      },
      enabled: m,
      focusMode: false,
      mode: h
    });
    let S = CR.useMemo(() => {
      if (l.current === null) {
        return null;
      }
      if (y.length === 0) {
        return null;
      }
      let E = l.current;
      let C = E.length > 0 && !/\s$/.test(E) && y.length > 0;
      let x = E.length + (C ? 1 : 0);
      let A = x + y.length;
      return {
        start: x,
        end: A
      };
    }, [y]);
    return {
      stripTrailing: d,
      resetAnchor: p,
      handleKeyEvent: b.handleKeyEvent,
      cancelRecording: b.cancelRecording,
      interimRange: S
    };
  }
  function useVoiceKeybindingHandler({
    voiceHandleKeyEvent: e,
    voiceCancelRecording: t,
    stripTrailing: n,
    resetAnchor: r,
    isActive: o,
    inputValueRef: s,
    insertTextRef: i
  }) {
    let a = useGetVoiceState();
    let l = useSetVoiceState();
    let c = tE();
    let u = TSe();
    let d = Rhe();
    let p = useVoiceState(L => L.voiceState);
    let m = bt(L => L.settings.voice?.mode ?? "hold");
    let f = useClock();
    let h = CR.useSyncExternalStore(ROf, xOf);
    let g = c ? c.bindings : h;
    let y = CR.useMemo(() => {
      if (!d) {
        return null;
      }
      let L = null;
      for (let P of g) {
        if (P.context !== "Chat") {
          continue;
        }
        if (P.chord.length !== 1) {
          continue;
        }
        let F = P.chord[0];
        if (!F) {
          continue;
        }
        if (P.action === "voice:pushToTalk") {
          L = F;
        } else if (L !== null && Fct(F, L)) {
          L = null;
        }
      }
      return L;
    }, [g, d]);
    let _ = y ? nro(y, Lct()) : null;
    let b = y !== null && y.key.length === 1 && !y.ctrl && !y.alt && !y.shift && !y.meta && !y.super ? y.key : null;
    let S = CR.useRef(0);
    let E = CR.useRef(0);
    let C = CR.useRef(0);
    let x = CR.useRef(false);
    let A = CR.useRef(null);
    let k = CR.useRef(0);
    let I = CR.useRef(null);
    CR.useEffect(() => {
      if (p !== "recording") {
        x.current = false;
        C.current = 0;
        l(L => {
          if (!L.voiceWarmingUp) {
            return L;
          }
          return {
            ...L,
            voiceWarmingUp: false
          };
        });
      } else {
        if (k.current = 0, I.current) {
          I.current();
          I.current = null;
        }
        l(L => {
          if (!L.awaitingVoiceSubmitDoubleTap) {
            return L;
          }
          return {
            ...L,
            awaitingVoiceSubmitDoubleTap: false
          };
        });
      }
    }, [p, l]);
    CR.useEffect(() => () => {
      if (I.current) {
        I.current();
        I.current = null;
      }
    }, []);
    function O() {
      if (S.current === 0) {
        return;
      }
      if (A.current) {
        A.current();
        A.current = null;
      }
      S.current = 0;
      E.current = 0;
      l(L => {
        if (!L.voiceWarmingUp) {
          return L;
        }
        return {
          ...L,
          voiceWarmingUp: false
        };
      });
    }
    return {
      handleKeyDown: L => {
        if (!d) {
          return;
        }
        if (!o || u) {
          return;
        }
        if (L.key === "escape" && a().voiceState === "recording") {
          L.stopImmediatePropagation();
          t();
          r();
          return;
        }
        if (m !== "tap" && i?.current != null && a().awaitingVoiceSubmitDoubleTap) {
          let U = i.current;
          let N = () => {
            if (k.current = 0, I.current) {
              I.current();
              I.current = null;
            }
          };
          let W = () => {
            N();
            l(K => {
              if (!K.awaitingVoiceSubmitDoubleTap) {
                return K;
              }
              return {
                ...K,
                awaitingVoiceSubmitDoubleTap: false
              };
            });
          };
          let j = b !== null && !L.ctrl && !L.meta && !L.shift && (b === " " ? Bae(L.key) : L.key)[0] === b;
          let z = s.current;
          let V = (U.cursorOffset ?? z.length) === z.length;
          if (!j || !V) {
            W();
          } else if (I.current !== null) {
            W();
          } else if (a().voiceState === "idle") {
            let K = Date.now();
            let J = k.current;
            if (J !== 0 && K - J <= 300) {
              L.stopImmediatePropagation();
              k.current = 0;
              I.current = f.setTimeout(() => {
                I.current = null;
                let Q = a();
                if (Q.voiceState !== "idle" || !Q.awaitingVoiceSubmitDoubleTap) {
                  return;
                }
                let Z = i.current;
                if (!Z) {
                  return;
                }
                l(ee => {
                  if (!ee.awaitingVoiceSubmitDoubleTap) {
                    return ee;
                  }
                  return {
                    ...ee,
                    awaitingVoiceSubmitDoubleTap: false
                  };
                });
                let ne = s.current;
                let oe = ne.endsWith(b) || b === " " && ne.endsWith("\u3000") ? ne.slice(0, -1) : ne;
                Z.submit(oe, true);
              }, 120);
              return;
            }
            if (J !== 0) {
              W();
            } else {
              k.current = K;
            }
          }
        }
        if (y === null) {
          return;
        }
        let P;
        if (b !== null) {
          let U = b === " " ? Bae(L.key) : L.key;
          P = !L.ctrl && !L.meta && !L.shift && U[0] === b && (U.length === 1 || U === b.repeat(U.length)) ? U.length : null;
        } else {
          P = COf(L, y) ? 1 : null;
        }
        if (P === null) {
          O();
          return;
        }
        if (m === "tap") {
          let U = a().voiceState;
          if (U === "processing") {
            if (b === null) {
              L.stopImmediatePropagation();
            }
            return;
          }
          let N = U === "idle";
          if (N && s.current.length > 0) {
            return;
          }
          L.stopImmediatePropagation();
          let W = S.current === 0;
          if (S.current += P, A.current) {
            A.current();
          }
          if (A.current = f.setTimeout(() => {
            A.current = null;
            O();
          }, 120), !W) {
            if (b !== null) {
              n(P, {
                char: b,
                floor: 0
              });
            }
            return;
          }
          if (N) {
            if (b !== null) {
              n(P, {
                char: b,
                anchor: true
              });
            } else {
              n(0, {
                anchor: true
              });
            }
          } else if (b !== null) {
            n(P, {
              char: b,
              floor: 0
            });
          }
          if (e(), N && a().voiceState === "idle") {
            r();
          }
          return;
        }
        let F = a().voiceState;
        if (x.current && F !== "idle") {
          if (L.stopImmediatePropagation(), b !== null) {
            n(P, {
              char: b,
              floor: C.current
            });
          }
          e();
          return;
        }
        if (F === "recording") {
          if (b === null) {
            L.stopImmediatePropagation();
          }
          return;
        }
        if (F === "processing" && b === null) {
          L.stopImmediatePropagation();
          return;
        }
        let H = S.current;
        if (S.current += P, b === null || F === "idle" && S.current >= 5) {
          if (L.stopImmediatePropagation(), A.current) {
            A.current();
            A.current = null;
          }
          if (S.current = 0, x.current = true, l(U => {
            if (!U.voiceWarmingUp) {
              return U;
            }
            return {
              ...U,
              voiceWarmingUp: false
            };
          }), b !== null) {
            C.current = n(E.current + P, {
              char: b,
              anchor: true
            });
            E.current = 0;
            e();
          } else {
            n(0, {
              anchor: true
            });
            e(2000);
          }
          if (a().voiceState === "idle") {
            x.current = false;
            r();
          }
          return;
        }
        if (H >= 2) {
          L.stopImmediatePropagation();
          n(P, {
            char: b,
            floor: E.current
          });
        } else {
          E.current += P;
        }
        if (F === "idle" && S.current >= 2) {
          l(U => {
            if (U.voiceWarmingUp) {
              return U;
            }
            return {
              ...U,
              voiceWarmingUp: true
            };
          });
        }
        if (A.current) {
          A.current();
        }
        A.current = f.setTimeout(() => {
          A.current = null;
          O();
        }, 120);
      },
      voiceKeyDisplay: _
    };
  }
  var CR;
  var TOf;
  var lyr = __lazy(() => {
    Nd();
    px();
    dSe();
    et();
    F1n();
    yq();
    xre();
    BPe();
    ho();
    PP();
    Zn();
    Nrn();
    CR = __toESM(ot(), 1);
    TOf = (JOc(), __toCommonJS(YOc));
  });
  function QOc() {
    return false;
  }
  async function ZOc() {
    return [];
  }
  function eDc(e) {
    let {
      state: t,
      tempo: n
    } = IOf(e.worker_status);
    let r = e.config?.sources?.find(a => a.type === "git_repository")?.url;
    let o = e.title ?? "";
    let s = e.worker_status === "requires_action" ? e.external_metadata?.pending_action : undefined;
    let i = e.worker_status === "requires_action" ? s?.tool_name === "AskUserQuestion" ? Ner(s.input).text : s?.tool_name === "ExitPlanMode" ? "approve plan" : typeof s?.tool_name === "string" && typeof s.action_description === "string" && s.action_description !== "" ? MYt(`approve ${typeof s.display_tool_name === "string" && s.display_tool_name !== "" ? s.display_tool_name : s.tool_name}: ${s.action_description}`) : "awaiting input" : undefined;
    return {
      state: t,
      detail: o,
      tempo: n,
      needs: i,
      output: null,
      children: null,
      linkScanOffset: 0,
      template: "remote",
      respawnFlags: [],
      name: o || undefined,
      intent: o || e.id,
      sessionId: e.id,
      cwd: r ?? "remote",
      originCwd: r ?? "remote",
      createdAt: e.created_at,
      updatedAt: e.last_event_at ?? e.created_at,
      firstTerminalAt: null,
      backend: "remote"
    };
  }
  function tDc(e, t) {
    let n = i => i.replace(/^(?:session|cse)_/, "");
    let r = new Set(t.map(i => n(i.state.sessionId)));
    let o = e.filter(i => i.id.startsWith("remote-pending-") && !r.vZc(n(i.state.sessionId)));
    let s = [...t, ...o];
    return e.length === s.length && e.every((i, a) => i.id === s[a].id && i.activity === s[a].activity && AOf(i.state, s[a].state)) ? e : s;
  }
  function AOf(e, t) {
    let n = Object.keys(e);
    if (n.length !== Object.keys(t).length) {
      return false;
    }
    return n.every(r => {
      let o = e[r];
      let s = t[r];
      if (o === s) {
        return true;
      }
      return typeof o === "object" && typeof s === "object" && o !== null && s !== null && Bun.deepEquals(o, s);
    });
  }
  function IOf(e) {
    switch (e) {
      case "requires_action":
        return {
          state: "blocked",
          tempo: "blocked"
        };
      case "idle":
        return {
          state: "done",
          tempo: "idle"
        };
      default:
        return {
          state: "working",
          tempo: "active"
        };
    }
  }
  var Con;
  var CZo = __lazy(() => {
    OTt();
    $n();
    Kc();
    cU();
    dt();
    Ds();
    Wd();
    Con = /^(?:session|cse)_[A-Za-z0-9_-]+$/;
  });
  function cyr() {
    if (nDc) {
      return;
    }
    nDc = true;
  }
  var nDc = false;
  var oDc = `---
name: artifact-design
description: Design guidance and fundamentals for Artifacts.
---

Approach this as the design lead at a small studio known for their versatility, giving every client a visual identity pitched at the treatment the task actually calls for. Make deliberate choices about palette, typography, and layout that are specific to this subject, and avoid templated designs.

## Read the request first

Calibrate treatment, not whether to design. A doc deserves the same craft as a landing page \u2014 what changes is the treatment that craft is delivered in.

Many requests call for a more utilitarian treatment: a plan, a memo, a demo. Make it polished: include real typographic hierarchy, considered spacing, and a proper palette, but avoid over-designing. Most pages do not need a flashy, gigantic hero. Keep flourishes tasteful and limited.

Some requests call for an editorial treatment: a landing page, a game, an app or tool they'll keep or share.

When unsure: a well-composed page is never the wrong answer; an over-designed visual identity sometimes is.

Fundamentals below apply to everything. The editorial process after that runs only when the read above says so.

## Fundamentals for every artifact

**Honor what's already there** Look for an existing design system first \u2014 CLAUDE.md, a tokens or theme file, existing component styles. When one exists, apply it; everything below fills gaps and never overrides. Precedence is always: the user's own words, then the project's existing system, then your choices.

**Ground it in the subject.** If the subject isn't already clear, pin it: one concrete subject, its audience, and the page's single job. The subject's own world \u2014 its materials, instruments, vernacular \u2014 is where distinctive choices come from. Build with real content throughout, never lorem.

**Pair typefaces** Typography carries the page even when the page isn't about typography. The Artifact CSP blocks font CDNs, so don't link a webfont URL and risk a silent fallback. Instead inline the face as a @font-face data URI. Keep running text near 65 characters wide; set a type scale and stay on it; give headings \`text-wrap: balance\`, body text room to breathe, and uppercase labels a touch of letter-spacing.

**Choose neutrals, don't default to them.** A pure mid-grey reads as unconsidered; a grey with a slight hue bias toward the page's accent reads as chosen. Pure white and near-black are fine grounds when they suit the subject \u2014 the point is that the neutral was picked, not inherited.

**Let layout do the spacing.** Lay out sibling groups with flex or grid and \`gap\`, not per-element margins that silently collapse or double. Wide content \u2014 tables, code, diagrams \u2014 gets \`overflow-x: auto\` on its own container so the page body never scrolls sideways. Reach for \`font-variant-numeric: tabular-nums\` wherever digits line up in columns.

**Avoid AI-generated design** AI-generated design currently clusters around a few looks: warm cream (#F4F1EA) with a serif display and terracotta accent; near-black with a lone acid-green or vermilion pop; broadsheet hairline rules with dense columns; a purple-to-blue gradient hero on white; Inter or Space Grotesk as the "safe" face; emoji as section markers; everything centered; \`rounded-lg\` everywhere; accent bar/rail on rounded cards. Where the user pins down a visual direction, follow it exactly \u2014 their words always win, including when they ask for one of these looks. Where nothing is specified, don't spend that freedom on one of these defaults.

**Build cleanly** Be cognizant of overlapping elements, cascade collisions, silent font fallbacks; visual bugs hide in the gap between source and output. Close every non-void element, double-quote attributes, give keyboard focus a visible state, respect \`prefers-reduced-motion\`. For generative or decorative graphics, reach for Canvas or WebGL rather than hand-authoring long SVG path data.

**CSS rules** When writing the CSS, watch your selector specificities. It is easy to generate classes that cancel each other out \u2014 a type-based selector like \`.section\` fighting an element-based one like \`.cta\` over padding and margins between sections. Structure the cascade so it doesn't silently undo your spacing.

**Writing the copy** Words are design material, not decoration. Write from the user's side of the screen \u2014 name things by what people recognize, not how the system is built (a person manages *notifications*, not *webhook config*). Active voice; a control says exactly what happens ("Publish", then a toast that says "Published"). Errors explain what went wrong and how to fix it \u2014 no apologies, no vagueness. Specific beats clever.

**Structure is information** Structural devices, numbering, eyebrows, dividers, labels, should encode something true about the content, not decorate it. Many generic designs use numbered markers (01 / 02 / 03), but that's only appropriate if the content actually is a sequence - like a real process or a typed timeline where order carries information the reader needs. Question if choices like numbered markers actually make sense before incorporating them.

**When it's a UI, not a document** A dashboard or tool is scanned and operated, not read top-to-bottom, so the craft shifts from typography to information design. Surface the summary before the detail; encode state in form as well as number \u2014 a pill, a chip, a severity stripe \u2014 so what needs attention reads at a glance. Semantic color (good / warning / critical) is separate from the accent hue and doesn't count as your accent. Give sparklines and charts the same care as type: an area fill, a faint grid, an emphasized endpoint. What's interactive should look interactive.

<!-- dataviz-callout -->

## Process

Before writing code, sketch a short design plan \u2014 a compact token system with color, type, and layout:
- **Color**: describe the palette as 4\u20136 named hex values.
- **Type**: typefaces for 2+ roles \u2014 a characterful display face used with restraint, a complementary body face, and a utility face for captions or data if needed.
- **Layout**: a layout concept in one or two sentences.

Then build, following the plan and deriving every color and type decision from it.

## When the request is editorial

The stance shifts: the client has already rejected proposals that felt templated, and is paying for a distinctive point of view. Make opinionated calls, and take one real aesthetic risk where it serves the work.

Review the design plan against the subject before building: if any part of it reads like the generic default you would produce for any similar page, revise that part, and note what you changed and why. Only after you've confirmed the plan's uniqueness do you write the code, following the revised plan exactly.

**Principles** 

- The hero is a thesis: open with the most characteristic thing in the subject's world \u2014 headline, image, live demo, interactive moment. 
- Typography carries the personality of the page. Pair the display and body faces deliberately, not the same families you would reach for on any other project, and set a clear type scale with intentional weights, widths, and spacing. Make the type treatment itself a memorable part of the design, not a neutral delivery vehicle for the content. 
- Leverage motion deliberately. Think about where and if animation can serve the subject: a page-load sequence, a scroll-triggered reveal, hover micro-interactions, ambient atmosphere. An orchestrated moment usually lands harder than scattered effects; choose what the direction calls for. However, sometimes less is more, and extra animation contributes to the feeling that the design is AI-generated. 
- Match complexity to the vision. Maximalist directions need elaborate execution; minimal directions need precision in spacing, type, and detail. Elegance is executing the chosen vision well.
- Spend your boldness in one place; keep everything around it quiet. If the accent fights the ground, shift it toward analogous or drop saturation rather than replacing it.
`;
  var rDc = () => {};
  var sDc = {};