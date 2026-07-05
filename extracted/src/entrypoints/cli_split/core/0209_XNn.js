  function XNn(e, t, n, r) {
    if (e === undefined && t === undefined && n === undefined && r === undefined) {
      return;
    }
    return {
      hidden: e,
      label: t,
      role: n,
      state: r
    };
  }
  function oJd({
    children: e,
    ref: t,
    tabIndex: n,
    autoFocus: r,
    onClick: o,
    onFocus: s,
    onFocusCapture: i,
    onBlur: a,
    onBlurCapture: l,
    onMouseEnter: c,
    onMouseLeave: u,
    hoverIgnoresBlankCells: d,
    onKeyDown: p,
    onKeyDownCapture: m,
    onPaste: f,
    onPasteCapture: h,
    onWheel: g,
    onWheelCapture: y,
    keybindingScope: _,
    onAction: b,
    onActionCapture: S,
    "aria-hidden": E,
    "aria-label": C,
    "aria-role": x,
    "aria-state": A,
    ...k
  }) {
    if ($k(k.margin, "margin"), $k(k.marginX, "marginX"), $k(k.marginY, "marginY"), $k(k.marginTop, "marginTop"), $k(k.marginBottom, "marginBottom"), k.marginLeft !== "auto") {
      $k(k.marginLeft, "marginLeft");
    }
    if (k.marginRight !== "auto") {
      $k(k.marginRight, "marginRight");
    }
    $k(k.padding, "padding");
    $k(k.paddingX, "paddingX");
    $k(k.paddingY, "paddingY");
    $k(k.paddingTop, "paddingTop");
    $k(k.paddingBottom, "paddingBottom");
    $k(k.paddingLeft, "paddingLeft");
    $k(k.paddingRight, "paddingRight");
    $k(k.gap, "gap");
    $k(k.columnGap, "columnGap");
    $k(k.rowGap, "rowGap");
    k.flexWrap ??= "nowrap";
    k.flexDirection ??= "row";
    k.flexGrow ??= 0;
    k.flexShrink ??= 1;
    k.overflowX = k.overflowX ?? k.overflow ?? "visible";
    k.overflowY = k.overflowY ?? k.overflow ?? "visible";
    return fzi.jsx("ink-box", {
      ref: t,
      tabIndex: n,
      autoFocus: r,
      onClick: o,
      onFocus: s,
      onFocusCapture: i,
      onBlur: a,
      onBlurCapture: l,
      onMouseEnter: c,
      onMouseLeave: u,
      hoverIgnoresBlankCells: d,
      onKeyDown: p,
      onKeyDownCapture: m,
      onPaste: f,
      onPasteCapture: h,
      onWheel: g,
      onWheelCapture: y,
      keybindingScope: _,
      onAction: b,
      onActionCapture: S,
      accessibility: XNn(E, C, x, A),
      style: k,
      children: e
    });
  }
  var fzi;
  function BaseText(e) {
    let t = hzi.c(35);
    let {
      color: n,
      backgroundColor: r,
      bold: o,
      dim: s,
      italic: i,
      underline: a,
      strikethrough: l,
      inverse: c,
      wrap: u,
      children: d,
      "aria-hidden": p,
      "aria-label": m,
      "aria-role": f,
      "aria-state": h
    } = e;
    let g = i === undefined ? false : i;
    let y = a === undefined ? false : a;
    let _ = l === undefined ? false : l;
    let b = c === undefined ? false : c;
    let S = u === undefined ? "wrap" : u;
    if (d === undefined || d === null) {
      return null;
    }
    let E;
    if (t[0] !== n) {
      E = n && {
        color: n
      };
      t[0] = n;
      t[1] = E;
    } else {
      E = t[1];
    }
    let C;
    if (t[2] !== r) {
      C = r && {
        backgroundColor: r
      };
      t[2] = r;
      t[3] = C;
    } else {
      C = t[3];
    }
    let x;
    if (t[4] !== s) {
      x = s && {
        dim: s
      };
      t[4] = s;
      t[5] = x;
    } else {
      x = t[5];
    }
    let A;
    if (t[6] !== o) {
      A = o && {
        bold: o
      };
      t[6] = o;
      t[7] = A;
    } else {
      A = t[7];
    }
    let k;
    if (t[8] !== g) {
      k = g && {
        italic: g
      };
      t[8] = g;
      t[9] = k;
    } else {
      k = t[9];
    }
    let I;
    if (t[10] !== y) {
      I = y && {
        underline: y
      };
      t[10] = y;
      t[11] = I;
    } else {
      I = t[11];
    }
    let O;
    if (t[12] !== _) {
      O = _ && {
        strikethrough: _
      };
      t[12] = _;
      t[13] = O;
    } else {
      O = t[13];
    }
    let M;
    if (t[14] !== b) {
      M = b && {
        inverse: b
      };
      t[14] = b;
      t[15] = M;
    } else {
      M = t[15];
    }
    let L;
    if (t[16] !== k || t[17] !== I || t[18] !== O || t[19] !== M || t[20] !== E || t[21] !== C || t[22] !== x || t[23] !== A) {
      L = {
        ...E,
        ...C,
        ...x,
        ...A,
        ...k,
        ...I,
        ...O,
        ...M
      };
      t[16] = k;
      t[17] = I;
      t[18] = O;
      t[19] = M;
      t[20] = E;
      t[21] = C;
      t[22] = x;
      t[23] = A;
      t[24] = L;
    } else {
      L = t[24];
    }
    let P = L;
    let F = sJd[S];
    let H;
    if (t[25] !== p || t[26] !== m || t[27] !== f || t[28] !== h) {
      H = XNn(p, m, f, h);
      t[25] = p;
      t[26] = m;
      t[27] = f;
      t[28] = h;
      t[29] = H;
    } else {
      H = t[29];
    }
    let U;
    if (t[30] !== d || t[31] !== F || t[32] !== H || t[33] !== P) {
      U = gzi.jsx("ink-text", {
        style: F,
        textStyles: P,
        accessibility: H,
        children: d
      });
      t[30] = d;
      t[31] = F;
      t[32] = H;
      t[33] = P;
      t[34] = U;
    } else {
      U = t[34];
    }
    return U;
  }
  var hzi;
  var gzi;
  var sJd;
  var HWe = __lazy(() => {
    hzi = __toESM(pt(), 1);
    gzi = __toESM(ie(), 1);
    sJd = {
      wrap: {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "wrap"
      },
      "wrap-trim": {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "wrap-trim"
      },
      "wrap-stream": {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "wrap-stream"
      },
      end: {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "end"
      },
      middle: {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "middle"
      },
      "truncate-end": {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "truncate-end"
      },
      truncate: {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "truncate"
      },
      "truncate-middle": {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "truncate-middle"
      },
      "truncate-start": {
        flexGrow: 0,
        flexShrink: 1,
        flexDirection: "row",
        textWrap: "truncate-start"
      }
    };
  });
  function aJd(e) {
    return e.includes("$bunfs") || e.includes("~BUN") || e.includes("/snapshot/") || e.startsWith("node:");
  }
  function lJd(e) {
    return e.some(({
      value: t
    }) => t.length > 200);
  }
  function _zi() {
    return cJd ??= new sno.default({
      cwd: process.cwd(),
      internals: sno.default.nodeInternals()
    });
  }
  function ino({
    error: e
  }) {
    let t = e.stack ? e.stack.split(`
`).slice(1) : undefined;
    let n = t ? _zi().parseLine(t[0]) : undefined;
    let r = yzi(n?.file);
    let o;
    let s = 0;
    if (r && n?.line && !aJd(r)) {
      try {
        let i = bzi.readFileSync(r, "utf8");
        if (o = XYd(i, n.line), o && lJd(o)) {
          o = undefined;
        }
        if (o) {
          for (let {
            line: a
          } of o) {
            s = Math.max(s, String(a).length);
          }
        }
      } catch {}
    }
    return OI.jsxs(oJd, {
      flexDirection: "column",
      padding: 1,
      children: [OI.jsxs(oJd, {
        children: [OI.jsxs(BaseText, {
          backgroundColor: "ansi:red",
          color: "ansi:white",
          children: [" ", "ERROR", " "]
        }), OI.jsxs(BaseText, {
          children: [" ", e.message]
        })]
      }), n && r && OI.jsx(oJd, {
        marginTop: 1,
        children: OI.jsxs(BaseText, {
          dim: true,
          children: [r, ":", n.line, ":", n.column]
        })
      }), n && o && OI.jsx(oJd, {
        marginTop: 1,
        flexDirection: "column",
        children: o.map(({
          line: i,
          value: a
        }) => OI.jsxs(oJd, {
          children: [OI.jsx(oJd, {
            width: s + 1,
            children: OI.jsxs(BaseText, {
              dim: i !== n.line,
              backgroundColor: i === n.line ? "ansi:red" : undefined,
              color: i === n.line ? "ansi:white" : undefined,
              children: [String(i).padStart(s, " "), ":"]
            })
          }), OI.jsx(BaseText, {
            backgroundColor: i === n.line ? "ansi:red" : undefined,
            color: i === n.line ? "ansi:white" : undefined,
            children: " " + a
          }, i)]
        }, i))
      }), e.stack && OI.jsx(oJd, {
        marginTop: 1,
        flexDirection: "column",
        children: e.stack.split(`
`).slice(1).map(i => {
          let a = _zi().parseLine(i);
          if (!a) {
            return OI.jsxs(oJd, {
              children: [OI.jsx(BaseText, {
                dim: true,
                children: "- "
              }), OI.jsx(BaseText, {
                bold: true,
                children: i
              })]
            }, i);
          }
          return OI.jsxs(oJd, {
            children: [OI.jsx(BaseText, {
              dim: true,
              children: "- "
            }), OI.jsx(BaseText, {
              bold: true,
              children: a.function
            }), OI.jsxs(BaseText, {
              dim: true,
              children: [" ", "(", yzi(a.file) ?? "", ":", a.line, ":", a.column, ")"]
            })]
          }, i);
        })
      })]
    });
  }
  var bzi;
  var sno;
  var OI;
  var yzi = e => e?.replace(`file://${process.cwd()}/`, "");
  var cJd;
  var Szi = __lazy(() => {
    HWe();
    bzi = require("fs");
    sno = __toESM(mzi(), 1);
    OI = __toESM(ie(), 1);
  });
  var Tzi;
  var gue;
  var pct = __lazy(() => {
    Tzi = __toESM(ot(), 1);
    gue = Tzi.createContext(null);
  });
  function ano() {
    if (process.env.CLAUDE_CODE_SESSION_KIND === "bg") {
      return false;
    }
    return true;
  }
  async function Ezi(e) {
    let [t] = await Promise.all([e.send(_Gi()), e.flush()]);
    if (t) {
      let s = t.name;
      if (process.env.TMUX && s.startsWith("tmux ")) {
        let {
          stdout: i
        } = await execFileNoThrow("tmux", ["display-message", "-p", "#{client_termtype}"], {
          timeout: 1000,
          useCwd: false
        });
        let a = i.trim();
        if (a) {
          s = a;
        }
      }
      H6i(s);
      logForDebugging(`XTVERSION: terminal identified as "${s}"`);
    } else {
      logForDebugging("XTVERSION: no reply (terminal ignored query)");
    }
    let n = !t || process.env.TERM_PROGRAM === "Apple_Terminal";
    let [r] = await Promise.all([n ? Promise.resolve(undefined) : e.send(hGi(f_.SYNCHRONIZED_UPDATE)), n ? Promise.resolve() : e.flush()]);
    let o = r?.status === 1 || r?.status === 2;
    B6i(o);
    logForDebugging(`DECRQM(2026): ${n ? `skipped (${t ? "Apple_Terminal" : "no XTVERSION reply"})` : r ? `status=${r.status}` : "no reply"} \u2192 sync ${o ? "supported" : "unsupported"}`);
    logForDebugging(`DECSTBM: ${gNn ? "enabled" : "gated"} (TMUX=${process.env.TMUX ? "set" : "unset"} ZELLIJ=${process.env.ZELLIJ != null ? "set" : "unset"} TERM_PROGRAM=${process.env.TERM_PROGRAM ?? "unset"} TERM=${process.env.TERM ?? "unset"})`);
  }
  function mJd(e, t, n, r) {
    if (t.some(s => s.kind === "key" && s.sequence !== wWe && s.sequence !== ZIe || s.kind === "mouse" && !((s.button & 32) !== 0 && (s.button & 3) === 3))) {
      updateLastInteractionTime();
    }
    let o = Y6i(e.jediTermInput, t, performance.now(), e.emitJediTermScrollBug);
    yJd(e, o);
    for (let s of o) {
      if (s.kind === "response") {
        if (s.response.type === "themeNotify") {
          SGi();
          continue;
        }
        e.querier?.onResponse(s.response);
        continue;
      }
      if (s.kind === "mouse") {
        if (e.props.getMouseMode?.() === "scroll" && (s.button & 3) === 0) {
          continue;
        }
        fJd(e, s);
        continue;
      }
      let i = s.sequence;
      if (i === wWe) {
        e.handleTerminalFocus(true);
        let a = new TerminalFocusEvent("terminalfocus");
        e.internal_eventEmitter.emit("terminalfocus", a);
        continue;
      }
      if (i === ZIe) {
        if (e.handleTerminalFocus(false), e.props.selection.isDragging) {
          act(e.props.selection);
          e.props.onSelectionChange();
        }
        let a = new TerminalFocusEvent("terminalblur");
        e.internal_eventEmitter.emit("terminalblur", a);
        continue;
      }
      if (!Clt()) {
        PZr(true);
      }
      if (s.name === "z" && s.ctrl && ano()) {
        e.handleSuspend();
        continue;
      }
      if (!s.isPasted) {
        e.handleInput(i);
      }
      if (s.isPasted) {
        e.props.dispatchPasteEvent(s.sequence ?? "");
      } else if (s.name === "wheelup" || s.name === "wheeldown" || s.name === "mouse") {
        if (s.name !== "mouse") {
          e.props.dispatchWheelEvent(s);
        }
      } else {
        e.props.dispatchKeyboardEvent(s);
      }
    }
  }
  function fJd(e, t) {
    let n = e.props.selection;
    let r = t.col - 1;
    let o = t.row - 1;
    let s = t.button & 3;
    if (t.action === "press") {
      if ((t.button & 32) !== 0 && s === 3) {
        if (n.isDragging) {
          act(n);
          e.props.onSelectionChange();
        }
        if (r === e.lastHoverCol && o === e.lastHoverRow) {
          return;
        }
        e.lastHoverCol = r;
        e.lastHoverRow = o;
        e.props.onHoverAt(r, o);
        return;
      }
      if (s !== 0) {
        if (e.clickCount = 0, (t.button & 32) === 0) {
          let l = Wt();
          if (s === 2 && (l === "windows" || l === "wsl" || l === "linux")) {
            if (Tre(n)) {
              LHt(n);
              e.props.onSelectionChange();
            } else if (!Rb()) {
              J$t("clipboard").then(c => {
                if (c) {
                  e.props.dispatchPasteEvent(c);
                }
              });
            }
          } else if (s === 1 && l === "linux") {
            J$t("primary").then(c => {
              if (c) {
                e.props.dispatchPasteEvent(c);
              }
            });
          }
        }
        return;
      }
      if ((t.button & 32) !== 0) {
        e.props.onSelectionDrag(r, o);
        return;
      }
      if (n.isDragging) {
        act(n);
        e.props.onSelectionChange();
      }
      let i = Date.now();
      let a = i - e.lastClickTime < 500 && Math.abs(r - e.lastClickCol) <= 1 && Math.abs(o - e.lastClickRow) <= 1;
      if (e.clickCount = a ? e.clickCount + 1 : 1, e.lastClickTime = i, e.lastClickCol = r, e.lastClickRow = o, e.clickCount >= 2) {
        if (e.pendingHyperlinkTimer) {
          clearTimeout(e.pendingHyperlinkTimer);
          e.pendingHyperlinkTimer = null;
        }
        let l = e.clickCount === 2 ? 2 : 3;
        e.props.onMultiClick(r, o, l);
        return;
      }
      e.props.onSelectionStart(r, o);
      n.lastPressHadAlt = (t.button & 8) !== 0;
      e.props.onSelectionChange();
      return;
    }
    if (s !== 0) {
      if (!n.isDragging) {
        return;
      }
      act(n);
      e.props.onSelectionChange();
      return;
    }
    if (act(n), !Tre(n) && n.anchor) {
      if (!e.props.onClickAt(r, o)) {
        let i = e.props.getHyperlinkAt(r, o);
        if (i && ((t.button & 24) !== 0 || qF.macCmdClickArrivesWithoutSgrModifierBit() || j6i()) && process.env.TERM_PROGRAM !== "vscode" && !Rb()) {
          if (e.pendingHyperlinkTimer) {
            clearTimeout(e.pendingHyperlinkTimer);
          }
          e.pendingHyperlinkTimer = setTimeout((a, l) => {
            a.pendingHyperlinkTimer = null;
            a.props.onOpenHyperlink(l);
          }, 500, e, i);
        }
      }
    }
    e.props.onSelectionChange();
  }
  function yJd(e, t) {
    let n = t[0];
    if (n?.kind !== "key" || n.name !== "up" && n.name !== "down" || n.ctrl || n.meta || n.shift || n.isPasted || !t.every(i => i.kind === "key" && i.name === n.name && !i.ctrl && !i.meta && !i.shift)) {
      e.arrowWindow.length = 0;
      return;
    }
    if (e.arrowWindowDir !== n.name) {
      e.arrowWindow.length = 0;
      e.arrowWindowDir = n.name;
    }
    let r = performance.now();
    let o = e.arrowWindow;
    o.push({
      t: r,
      n: t.length
    });
    while (o.length > 0 && r - o[0].t > 100) {
      o.shift();
    }
    let s = 0;
    for (let i of o) {
      s += i.n;
    }
    if (s >= 8) {
      e.internal_eventEmitter.emit("arrow-burst", {
        direction: n.name,
        count: s
      });
      e.props.onStdinResume?.();
      o.length = 0;
    }
  }
  var Czi;
  var CPe;
  var dJd = () => {};
  var QNn;
  var lno = __lazy(() => {
    at();
    je();
    cPe();
    pr();
    dt();
    dw();
    ji();
    Rn();
    Cs();
    aPe();
    aMn();
    beo();
    SNn();
    Yeo();
    UHt();
    ePe();
    mT();
    vWe();
    PMn();
    jZr();
    zNn();
    c1();
    qJ();
    Tg();
    wPe();
    Szi();
    pct();
    Czi = __toESM(ot(), 1);
    CPe = __toESM(ie(), 1);
    QNn = class QNn extends Czi.PureComponent {
      static displayName = "InternalApp";
      static getDerivedStateFromError(e) {
        return {
          error: e
        };
      }
      state = {
        error: undefined
      };
      rawModeEnabledCount = 0;
      internal_eventEmitter = new EventEmitter();
      keyParseState = c8i;
      incompleteEscapeTimer = null;
      byteRunDeadlineAt = null;
      NORMAL_TIMEOUT = 50;
      PASTE_TIMEOUT = 2000;
      querier = this.props.stdout.isTTY && this.props.stdin.isTTY ? new $Zr(this.props.stdout) : null;
      lastClickTime = 0;
      lastClickCol = -1;
      lastClickRow = -1;
      clickCount = 0;
      pendingHyperlinkTimer = null;
      lastHoverCol = -1;
      lastHoverRow = -1;
      lastStdinTime = performance.now();
      arrowWindow = [];
      arrowWindowDir = "";
      jediTermInput = K6i();
      emitJediTermScrollBug = () => this.internal_eventEmitter.emit("jediterm-scroll-bug");
      isRawModeSupported() {
        return this.props.stdin.isTTY;
      }
      render() {
        return CPe.jsx(gue.Provider, {
          value: {
            columns: this.props.terminalColumns,
            rows: this.props.terminalRows
          },
          children: CPe.jsx(JVi.Provider, {
            value: {
              exit: this.handleExit,
              focusManager: this.props.focusManager,
              rootNode: this.props.rootNode,
              dispatchPasteEvent: this.props.dispatchPasteEvent
            },
            children: CPe.jsx(oWi.Provider, {
              value: {
                stdin: this.props.stdin,
                setRawMode: this.handleSetRawMode,
                isRawModeSupported: this.isRawModeSupported(),
                internal_eventEmitter: this.internal_eventEmitter,
                internal_querier: this.querier
              },
              children: CPe.jsx(QVi, {
                children: CPe.jsx(tzi, {
                  children: CPe.jsx(KYd.Provider, {
                    value: this.props.onCursorDeclaration ?? dJd,
                    children: this.state.error ? CPe.jsx(ino, {
                      error: this.state.error
                    }) : this.props.children
                  })
                })
              })
            })
          })
        });
      }
      componentDidMount() {
        let e = this.props.rootNode;
        let t = e._pendingRawModeDelta ?? 0;
        e._pendingRawModeDelta = 0;
        for (let n = 0; n < t; n++) {
          this.handleSetRawMode(true);
        }
        for (let n = 0; n > t; n--) {
          this.handleSetRawMode(false);
        }
        e.setRawMode = this.handleSetRawMode;
      }
      componentWillUnmount() {
        if (this.props.rootNode.setRawMode = undefined, this.props.stdout.isTTY) {
          this.props.stdout.write(WF);
        }
        if (this.incompleteEscapeTimer) {
          clearTimeout(this.incompleteEscapeTimer);
          this.incompleteEscapeTimer = null;
        }
        if (this.pendingHyperlinkTimer) {
          clearTimeout(this.pendingHyperlinkTimer);
          this.pendingHyperlinkTimer = null;
        }
        if (this.isRawModeSupported()) {
          while (this.rawModeEnabledCount > 0) {
            this.handleSetRawMode(false);
          }
        }
      }
      componentDidCatch(e, t) {
        a3i(e, t);
        this.handleExit(e);
      }
      handleSetRawMode = e => {
        let {
          stdin: t
        } = this.props;
        if (!this.isRawModeSupported()) {
          if (t === process.stdin) {
            throw Error(`Raw mode is not supported on the current process.stdin, which Ink uses as input stream by default.
Read about how to prevent this error on https://github.com/vadimdemedes/ink/#israwmodesupported`);
          } else {
            throw Error(`Raw mode is not supported on the stdin provided to Ink.
Read about how to prevent this error on https://github.com/vadimdemedes/ink/#israwmodesupported`);
          }
        }
        if (t.setEncoding("utf8"), e) {
          if (this.rawModeEnabledCount === 0) {
            if (stopCapturingEarlyInput(), this.props.onRawModeEnter?.(), t.ref(), PI(t, true), t.addListener("readable", this.handleReadable), Wt() === "windows") {
              t.resume();
              t.pause();
            }
            if (this.props.stdout.write(dNn), this.props.stdout.write(Feo), this.props.stdout.write(D6i), this.props.stdout.write(mre()), process.env.CLAUDE_BG_BACKEND !== "daemon") {
              setImmediate(() => {
                if (this.querier) {
                  Ezi(this.querier);
                }
              });
            }
          }
          this.rawModeEnabledCount++;
          return;
        }
        if (this.rawModeEnabledCount <= 0) {
          return;
        }
        if (--this.rawModeEnabledCount === 0) {
          if (this.props.stdout.write(Zbe), this.props.stdout.write(aue), this.props.stdout.write(gHt), this.props.stdout.write(mNn), this.props.stdout.write(pNn), !rVd.get(this.props.stdout)?.isHandoffRawMode) {
            PI(t, false);
          }
          t.removeListener("readable", this.handleReadable);
          t.unref();
        }
      };
      flushIncomplete = () => {
        if (this.incompleteEscapeTimer = null, !this.keyParseState.incomplete && this.keyParseState.mode !== "IN_PASTE" && this.keyParseState.pendingByteEvents.length === 0) {
          return;
        }
        if (this.props.stdin.readableLength > 0) {
          this.incompleteEscapeTimer = setTimeout(this.flushIncomplete, this.NORMAL_TIMEOUT);
          return;
        }
        if (this.keyParseState.incomplete) {
          let t = (this.keyParseState.mode === "IN_PASTE" ? this.PASTE_TIMEOUT : this.NORMAL_TIMEOUT) - (performance.now() - this.lastStdinTime);
          if (t > 0) {
            this.incompleteEscapeTimer = setTimeout(this.flushIncomplete, t);
            return;
          }
        }
        this.processInput(null);
      };
      processInput = e => {
        let t = this.keyParseState;
        let [n, r] = u8i(this.keyParseState, e);
        if (this.keyParseState = r, n.length > 0) {
          Nto.discreteUpdates(mJd, this, n, undefined, undefined);
        }
        let o = performance.now();
        let s = this.keyParseState.pendingByteEvents;
        if (s.length === 0) {
          this.byteRunDeadlineAt = null;
        } else if (t.pendingByteEvents !== s || this.byteRunDeadlineAt === null) {
          this.byteRunDeadlineAt = o + this.NORMAL_TIMEOUT;
        }
        if (this.incompleteEscapeTimer) {
          clearTimeout(this.incompleteEscapeTimer);
          this.incompleteEscapeTimer = null;
        }
        let i = this.keyParseState.incomplete || this.keyParseState.mode === "IN_PASTE" ? this.keyParseState.mode === "IN_PASTE" ? this.PASTE_TIMEOUT : this.NORMAL_TIMEOUT : null;
        let a = this.byteRunDeadlineAt === null || this.keyParseState.mode === "IN_PASTE" ? null : Math.max(0, this.byteRunDeadlineAt - o);
        let l = i === null ? a : a === null ? i : Math.min(i, a);
        if (l !== null) {
          this.incompleteEscapeTimer = setTimeout(this.flushIncomplete, l);
        }
      };
      handleReadable = () => {
        let e = performance.now();
        if (e - this.lastStdinTime > 5000) {
          this.props.onStdinResume?.();
        }
        this.lastStdinTime = e;
        try {
          let t;
          while ((t = this.props.stdin.read()) !== null) {
            this.processInput(t);
          }
        } catch (t) {
          Oe($o(sr(t), "stdin readable handler threw during input processing"));
          let {
            stdin: n
          } = this.props;
          if (this.rawModeEnabledCount > 0 && !n.listeners("readable").includes(this.handleReadable)) {
            logForDebugging("handleReadable: re-attaching stdin readable listener after error recovery", {
              level: "warn"
            });
            n.addListener("readable", this.handleReadable);
          }
        }
      };
      handleInput = e => {
        if (e === "\x03" && this.props.exitOnCtrlC) {
          this.handleExit();
        }
      };
      handleExit = e => {
        if (this.isRawModeSupported()) {
          this.handleSetRawMode(false);
        }
        this.props.onExit(e);
      };
      handleTerminalFocus = e => {
        let t = nre();
        if (PZr(e), e && t === "blurred") {
          rVd.get(this.props.stdout)?.proactiveAtlasResetOnFocus();
        }
        if (e && t !== "focused" && process.env.CLAUDE_BG_BACKEND === "daemon" && this.querier) {
          Ezi(this.querier);
        }
      };
      handleSuspend = () => {
        if (!this.isRawModeSupported()) {
          return;
        }
        let e = this.rawModeEnabledCount;
        while (this.rawModeEnabledCount > 0) {
          this.handleSetRawMode(false);
        }
        if (this.props.stdout.isTTY) {
          let n = rVd.get(this.props.stdout)?.altScreenBackgroundColor !== undefined;
          this.props.stdout.write(WF + gHt + mue + (n ? lct() : ""));
        }
        this.internal_eventEmitter.emit("suspend");
        let t = () => {
          for (let n = 0; n < e; n++) {
            if (this.isRawModeSupported()) {
              this.handleSetRawMode(true);
            }
          }
          if (this.props.stdout.isTTY) {
            let n = this.props.isScreenReaderEnabled ?? false;
            if (!Me.CLAUDE_CODE_ACCESSIBILITY && !n) {
              this.props.stdout.write(sG);
            }
            this.props.stdout.write(Feo);
          }
          this.internal_eventEmitter.emit("resume");
          process.removeListener("SIGCONT", t);
        };
        process.on("SIGCONT", t);
        process.kill(0, "SIGTSTP");
      };
    };
  });
  function _Jd(e) {
    let t = e.sequence ?? "";
    let n = e.name ?? "";
    if (n === "space") {
      return " ";
    }
    if (e.ctrl) {
      return n;
    }
    if (t.length === 1) {
      let r = t.charCodeAt(0);
      if (r >= 32 && r !== 127) {
        return t;
      }
    }
    if (n) {
      if (e.shift && n.length === 1) {
        let r = n.toUpperCase();
        if (r !== n && r.length === 1) {
          return r;
        }
      }
      return n;
    }
    if (t.charCodeAt(0) === 27) {
      return "";
    }
    if (/^(\[<\d[\d;]*[Mm]?)+$/.test(t)) {
      return "";
    }
    return t;
  }
  var mct;
  var cno = __lazy(() => {
    Jlt();
    mct = class mct extends hre {
      key;
      name;
      sequence;
      ctrl;
      shift;
      meta;
      superKey;
      fn;
      constructor(e) {
        super("keydown", {
          bubbles: true,
          cancelable: true
        });
        this.key = _Jd(e);
        this.name = e.name ?? "";
        this.sequence = e.sequence ?? "";
        this.ctrl = e.ctrl;
        this.shift = e.shift;
        this.meta = e.meta || e.option;
        this.superKey = e.super;
        this.fn = e.fn;
      }
    };
  });
  var aSe;
  var ZNn = __lazy(() => {
    Jlt();
    aSe = class aSe extends hre {
      text;
      constructor(e) {
        super("paste", {
          bubbles: true,
          cancelable: true
        });
        this.text = e;
      }
    };
  });
  var uno;
  var Rzi = __lazy(() => {
    Jlt();
    uno = class uno extends hre {
      deltaY;
      deltaX;
      ctrl;
      shift;
      meta;
      constructor(e, t) {
        super("wheel", {
          bubbles: true,
          cancelable: true
        });
        this.deltaY = e;
        this.deltaX = t.deltaX ?? 0;
        this.ctrl = t.ctrl ?? false;
        this.shift = t.shift ?? false;
        this.meta = t.meta ?? false;
      }
    };
  });
  function RPe(e, t, n, r, o) {
    return {
      screen: zJ(0, 0, n, r, o),
      viewport: {
        width: t,
        height: e
      },
      cursor: {
        x: 0,
        y: 0,
        visible: true
      }
    };
  }
  var xzi = __lazy(() => {
    iG();
  });
  var ClickEvent;
  var dno = __lazy(() => {
    ClickEvent = class $Ht extends Event_export {
      col;
      row;
      localCol = 0;
      localRow = 0;
      cellIsBlank;
      hyperlinkUrl;
      defaultAllowed = false;
      allowDefault() {
        this.defaultAllowed = true;
      }
      constructor(e, t, n, r) {
        super();
        this.col = e;
        this.row = t;
        this.cellIsBlank = n;
        this.hyperlinkUrl = r;
      }
    };
  });
  function fct(e, t, n) {
    let r = Kg.get(e);
    if (!r) {
      return null;
    }
    let o = t >= r.x && t < r.x + r.width && n >= r.y && n < r.y + r.height;
    if (!o && !e.hasAbsoluteDescendant) {
      return null;
    }
    let s = null;
    let i = false;
    for (let a = e.childNodes.length - 1; a >= 0; a--) {
      let l = e.childNodes[a];
      if (l.nodeName === "#text") {
        continue;
      }
      let c = Kg.get(l);
      if (!c) {
        continue;
      }
      let u = t >= c.x && t < c.x + c.width && n >= c.y && n < c.y + c.height;
      if (!u && !l.hasAbsoluteDescendant) {
        continue;
      }
      if (s !== null && u) {
        continue;
      }
      let d = fct(l, t, n);
      if (!d) {
        continue;
      }
      let p = !u;
      if (s === null || p && !i) {
        s = d;
        i = p;
      }
      if (i) {
        break;
      }
    }
    return s ?? (o ? e : null);
  }
  function pno(e, t, n) {
    let r = fct(e, t, n) ?? undefined;
    let o;
    while (r) {
      let s = Kg.get(r);
      if (s) {
        let i = Math.floor(s.x);
        let a = Math.floor(s.x + s.width);
        if (!o) {
          if (r.style.selectionScope) {
            let l = r.yogaNode;
            let c = l ? l.getComputedBorder(0) + l.getComputedPadding(0) : 0;
            let u = l ? l.getComputedBorder(2) + l.getComputedPadding(2) : 0;
            o = {
              x1: i + c,
              x2: a - u,
              node: r
            };
          }
        } else {
          let l = r.style.overflowX ?? r.style.overflow;
          if (l === "hidden" || l === "scroll") {
            o.x1 = Math.max(o.x1, i);
            o.x2 = Math.min(o.x2, a);
          }
        }
      }
      r = r.parentNode;
    }
    return o && o.x2 > o.x1 ? o : undefined;
  }
  function kzi(e, t, n, r = false, o) {
    let s = fct(e, t, n) ?? undefined;
    if (!s) {
      return false;
    }
    if (e.focusManager) {
      let l = s;
      while (l) {
        if (typeof l.attributes.tabIndex === "number") {
          e.focusManager.handleClickFocus(l);
          break;
        }
        l = l.parentNode;
      }
    }
    let i = new ClickEvent(t, n, r, o);
    let a = false;
    while (s) {
      let l = s._eventHandlers?.onClick;
      if (l) {
        let c = Kg.get(s);
        if (c) {
          i.localCol = t - c.x;
          i.localRow = n - c.y;
        }
        if (i.defaultAllowed = false, l(i), i.didStopImmediatePropagation()) {
          return !i.defaultAllowed;
        }
        if (!i.defaultAllowed) {
          a = true;
        }
      }
      s = s.parentNode;
    }
    return a;
  }
  function Azi(e, t, n, r, o = false) {
    let s = new Set();
    let i = fct(e, t, n) ?? undefined;
    while (i) {
      let a = i._eventHandlers;
      if ((a?.onMouseEnter || a?.onMouseLeave) && !(o && i.attributes.hoverIgnoresBlankCells)) {
        s.add(i);
      }
      i = i.parentNode;
    }
    for (let a of r) {
      if (!s.vZc(a)) {
        if (r.delete(a), a.parentNode) {
          a._eventHandlers?.onMouseLeave?.();
        }
      }
    }
    for (let a of s) {
      if (!r.vZc(a)) {
        r.add(a);
        a._eventHandlers?.onMouseEnter?.();
      }
    }
  }
  var Izi = __lazy(() => {
    dno();
    gPe();
    oSe();
  });
  function Pzi(e) {
    if (!e) {
      return 0;
    }
    let t = 0;
    let n = bJd;
    n.length = 0;
    n.push(e);
    while (n.length > 0) {
      let r = n.pop();
      if (t++, r.alternate) {
        t++;
      }
      if (r.sibling) {
        n.push(r.sibling);
      }
      if (r.child) {
        n.push(r.child);
      }
    }
    n.length = 0;
    return t;
  }
  function Ozi(e) {
    if (!e) {
      return 0;
    }
    let t = 0;
    let n = SJd;
    n.length = 0;
    n.push(e);
    while (n.length > 0) {
      let r = n.pop();
      if (t++, "childNodes" in r) {
        let o = r.childNodes;
        for (let s = 0; s < o.length; s++) {
          n.push(o[s]);
        }
      }
    }
    n.length = 0;
    return t;
  }
  var bJd;
  var SJd;
  var Dzi = __lazy(() => {
    bJd = [];
    SJd = [];
  });
  class mno {
    options;
    state;
    constructor(e) {
      this.options = e;
      this.state = {
        previousOutput: ""
      };
    }
    renderPreviousOutput_DEPRECATED(e) {
      if (!this.options.isTTY) {
        return [t1n];
      }
      return this.getRenderOpsForDone(e);
    }
    reset() {
      this.state.previousOutput = "";
      this.forceReset = false;
    }
    forceReset = false;
    forceFullReset() {
      this.forceReset = true;
    }
    renderFullFrame(e) {
      let {
        screen: t
      } = e;
      let n = [];
      let r = [];
      let o = undefined;
      for (let s = 0; s < t.height; s++) {
        let i = "";
        for (let l = 0; l < t.width; l++) {
          let c = cq(t, l, s);
          if (c && c.width !== 2) {
            if (c.hyperlink !== o) {
              if (o !== undefined) {
                i += CWe;
              }
              if (c.hyperlink !== undefined) {
                i += klt(c.hyperlink);
              }
              o = c.hyperlink;
            }
            let u = this.options.stylePool.get(c.styleId);
            let d = LWe(r, u);
            if (d.length > 0) {
              i += zF(d);
              r = u;
            }
            i += c.char;
          }
        }
        if (o !== undefined) {
          i += CWe;
          o = undefined;
        }
        let a = LWe(r, []);
        if (a.length > 0) {
          i += zF(a);
          r = [];
        }
        n.push(i.trimEnd());
      }
      if (n.length === 0) {
        return [];
      }
      return [{
        type: "stdout",
        content: n.join(`
`)
      }];
    }
    getRenderOpsForDone(e) {
      if (this.state.previousOutput = "", !e.cursor.visible) {
        return [{
          type: "cursorShow"
        }];
      }
      return [];
    }
    render(e, t, n = false, r = true) {
      if (!this.options.isTTY) {
        if (RVi(e.screen, t.screen)) {
          return [];
        }
        return this.renderFullFrame(t);
      }
      let o = performance.now();
      let s = this.options.stylePool;
      let a = e.cursor.y >= e.screen.height && e.screen.height >= e.viewport.height;
      let l = Math.max(0, e.screen.height - Math.min(e.viewport.height, t.viewport.height));
      let c = e.screen.height >= e.viewport.height ? 1 : 0;
      let u = l + c;
      if (this.forceReset) {
        this.forceReset = false;
        return HHt(t, "clear", s, n, u);
      }
      if (t.viewport.height < e.viewport.height || t.viewport.height > e.viewport.height && a || e.viewport.width !== 0 && t.viewport.width !== e.viewport.width) {
        return HHt(t, "resize", s, n, u);
      }
      let d = [];
      if (n && t.scrollHint && r) {
        let {
          top: L,
          bottom: P,
          delta: F
        } = t.scrollHint;
        if (L >= 0 && P < e.screen.height && P < t.screen.height) {
          qNn(e.screen, L, P, F);
          d = [{
            type: "stdout",
            content: LJ(L + 1, P + 1) + (F > 0 ? eGi(F) : tGi(-F)) + V8 + gv
          }];
        }
      }
      let p = t.screen.height < e.screen.height;
      let m = t.screen.height <= e.viewport.height;
      if (a && m && p) {
        logForDebugging(`Full reset (shrink->below): prevHeight=${e.screen.height}, nextHeight=${t.screen.height}, viewport=${e.viewport.height}`);
        return HHt(t, "offscreen", s, n, u);
      }
      let f = new fno(e.cursor, t.viewport.width);
      let h = Math.max(t.screen.height, 1) - Math.max(e.screen.height, 1);
      let g = h < 0;
      let y = h > 0;
      if (g) {
        let L = e.screen.height - t.screen.height;
        if (L > e.viewport.height) {
          return HHt(t, "offscreen", this.options.stylePool, n, u);
        }
        f.txn(P => [[{
          type: "clear",
          count: L
        }, {
          type: "cursorMove",
          x: 0,
          y: -1
        }], {
          dx: -P.x,
          dy: -L
        }]);
      }
      let _ = a ? 1 : 0;
      let b = y ? Math.max(0, e.screen.height - e.viewport.height + _) : Math.max(e.screen.height, t.screen.height) - t.viewport.height + _;
      let S = s.none;
      let E = undefined;
      let C = -1;
      let x = -1;
      let A = false;
      let k = false;
      let I = false;
      let O = -1;
      if (DVi(e.screen, t.screen, (L, P, F, H) => {
        if (y && P >= e.screen.height) {
          return;
        }
        if (H && (H.width === 2 || H.width === 3)) {
          return;
        }
        if (F && (F.width === 2 || F.width === 3) && !H) {
          return;
        }
        if (H && BWe(t.screen, L, P) && !F) {
          return;
        }
        if (P < b) {
          if (n || g) {
            I = true;
            O = P;
            return true;
          }
          return;
        }
        if (P !== C) {
          E = xPe(f.diff, E, undefined);
          C = P;
          x = -1;
          A = false;
          k = false;
        }
        if (F && BWe(t.screen, L, P)) {
          if (!A) {
            if (A = true, P < t.screen.height) {
              for (let U = t.screen.width - 1; U > L; U--) {
                if (!BWe(t.screen, U, P)) {
                  x = U;
                  break;
                }
              }
            }
          }
          if (L > x) {
            if (k) {
              return;
            }
            k = true;
            e1n(f, L, P);
            let U = S;
            let N = E;
            S = s.none;
            E = undefined;
            f.txn(() => {
              let W = [];
              jHt(W, s, U, s.none);
              xPe(W, N, undefined);
              W.push(TJd);
              return [W, {
                dx: 0,
                dy: 0
              }];
            });
            return;
          }
        }
        if (e1n(f, L, P), H) {
          let U = H.hyperlink;
          E = xPe(f.diff, E, U);
          let N = s.transition(S, H.styleId);
          if (Lzi(f, H, N)) {
            S = H.styleId;
          }
        } else if (F) {
          let U = S;
          let N = E;
          S = s.none;
          E = undefined;
          f.txn(() => {
            let W = [];
            jHt(W, s, U, s.none);
            xPe(W, N, undefined);
            W.push({
              type: "stdout",
              content: " "
            });
            return [W, {
              dx: 1,
              dy: 0
            }];
          });
        }
      }), I) {
        return HHt(t, "offscreen", s, n, u, {
          triggerY: O,
          prevLine: Mzi(e.screen, O),
          nextLine: Mzi(t.screen, O)
        });
      }
      if (S = jHt(f.diff, s, S, s.none), E = xPe(f.diff, E, undefined), y) {
        Nzi(f, t, e.screen.height, t.screen.height, s);
      }
      if (n) {
        ;
      } else if (t.cursor.y >= t.screen.height) {
        f.txn(L => {
          let P = t.cursor.y - L.y;
          if (P > 0) {
            let H = Array(1 + P);
            H[0] = hct;
            for (let U = 0; U < P; U++) {
              H[1 + U] = t1n;
            }
            return [H, {
              dx: -L.x,
              dy: P
            }];
          }
          let F = t.cursor.y - L.y;
          if (F !== 0 || L.x !== t.cursor.x) {
            let H = [hct];
            H.push({
              type: "cursorMove",
              x: t.cursor.x,
              y: F
            });
            return [H, {
              dx: t.cursor.x - L.x,
              dy: F
            }];
          }
          return [[], {
            dx: 0,
            dy: 0
          }];
        });
      } else {
        e1n(f, t.cursor.x, t.cursor.y);
      }
      let M = performance.now() - o;
      if (M > 50) {
        let L = t.screen.damage;
        let P = L ? `${L.width}x${L.height} at (${L.x},${L.y})` : "none";
        logForDebugging(`Slow render: ${M.toFixed(1)}ms, screen: ${t.screen.height}x${t.screen.width}, damage: ${P}, changes: ${f.diff.length}`);
      }
      return d.length > 0 ? [...d, ...f.diff] : f.diff;
    }
  }
  function xPe(e, t, n) {
    if (t !== n) {
      e.push({
        type: "hyperlink",
        uri: n ?? ""
      });
      return n;
    }
    return t;
  }
  function jHt(e, t, n, r) {
    let o = t.transition(n, r);
    if (o.length > 0) {
      e.push({
        type: "styleStr",
        str: o
      });
    }
    return r;
  }
  function Mzi(e, t) {
    let n = "";
    for (let r = 0; r < e.width; r++) {
      n += AVi(e, r, t) ?? " ";
    }
    return n.trimEnd();
  }
  function HHt(e, t, n, r, o, s) {
    let i = r ? 0 : Math.min(o, Math.max(0, e.screen.height - e.viewport.height + 1));
    let a = new fno({
      x: 0,
      y: i
    }, e.viewport.width);
    Nzi(a, e, i, e.screen.height, n);
    return [{
      type: "clearTerminal",
      reason: t,
      altScreen: r,
      viewportRows: e.viewport.height,
      debug: s
    }, ...a.diff];
  }
  function Nzi(e, t, n, r, o) {
    let s = o.none;
    let i = undefined;
    let a = -1;
    let {
      width: l,
      cells: c,
      charPool: u,
      hyperlinkPool: d
    } = t.screen;
    let p = n * l;
    for (let m = n; m < r; m += 1) {
      if (e.cursor.y < m) {
        let f = m - e.cursor.y;
        e.txn(h => {
          let g = Array(1 + f);
          g[0] = hct;
          for (let y = 0; y < f; y++) {
            g[1 + y] = t1n;
          }
          return [g, {
            dx: -h.x,
            dy: f
          }];
        });
      }
      a = -1;
      for (let f = 0; f < l; f += 1, p += 1) {
        let h = kVi(c, u, d, p, a);
        if (!h) {
          continue;
        }
        e1n(e, f, m);
        let g = h.hyperlink;
        i = xPe(e.diff, i, g);
        let y = o.transition(s, h.styleId);
        if (Lzi(e, h, y)) {
          s = h.styleId;
          a = h.styleId;
        }
      }
      s = jHt(e.diff, o, s, o.none);
      i = xPe(e.diff, i, undefined);
      e.txn(f => [[hct, t1n], {
        dx: -f.x,
        dy: 1
      }]);
    }
    jHt(e.diff, o, s, o.none);
    xPe(e.diff, i, undefined);
    return e;
  }
  function Lzi(e, t, n) {
    let r = t.width === 1 ? Math.max(2, an(t.char)) : 1;
    let o = e.cursor.x;
    let s = e.viewportWidth;
    if (r >= 2 && o < s) {
      let l = t.char.length > 2 ? s : s + 1;
      if (o + r >= l) {
        return false;
      }
    }
    let i = e.diff;
    if (n.length > 0) {
      i.push({
        type: "styleStr",
        str: n
      });
    }
    let a = r >= 3 || r === 2 && EJd(t.char);
    if (a && o + 1 < s) {
      i.push({
        type: "cursorTo",
        col: o + 2
      });
      i.push({
        type: "stdout",
        content: hm(" ", r - 1)
      });
      i.push({
        type: "cursorTo",
        col: o + 1
      });
    }
    if (i.push({
      type: "stdout",
      content: t.char
    }), a) {
      i.push({
        type: "cursorTo",
        col: o + r + 1
      });
    }
    if (o >= s) {
      e.cursor.x = r;
      e.cursor.y++;
    } else {
      e.cursor.x = o + r;
    }
    return true;
  }
  function e1n(e, t, n) {
    e.txn(r => {
      let o = t - r.x;
      let s = n - r.y;
      if (r.x >= e.viewportWidth) {
        return [[hct, {
          type: "cursorMove",
          x: t,
          y: s
        }], {
          dx: o,
          dy: s
        }];
      }
      if (s !== 0) {
        return [[hct, {
          type: "cursorMove",
          x: t,
          y: s
        }], {
          dx: o,
          dy: s
        }];
      }
      if (o !== 0) {
        return [[{
          type: "cursorTo",
          col: t + 1
        }], {
          dx: o,
          dy: s
        }];
      }
      return [[], {
        dx: 0,
        dy: 0
      }];
    });
  }
  function EJd(e) {
    let t = e.codePointAt(0);
    if (t === undefined) {
      return false;
    }
    if (t >= 129648 && t <= 129791 || t >= 129792 && t <= 130047) {
      return true;
    }
    if (e.length >= 2) {
      for (let n = 0; n < e.length; n++) {
        if (e.charCodeAt(n) === 65039) {
          return true;
        }
      }
    }
    return false;
  }
  class fno {
    viewportWidth;
    cursor;
    diff = [];
    constructor(e, t) {
      this.viewportWidth = t;
      this.cursor = {
        ...e
      };
    }
    txn(e) {
      let [t, n] = e(this.cursor);
      for (let r of t) {
        this.diff.push(r);
      }
      this.cursor.x += n.dx;
      this.cursor.y += n.dy;
    }
  }
  var hct;
  var t1n;
  var TJd;
  var Fzi = __lazy(() => {
    zlt();
    je();
    Zn();
    iG();
    bc();
    c1();
    Tg();
    hct = {
      type: "carriageReturn"
    };
    t1n = {
      type: "stdout",
      content: `
`
    };
    TJd = {
      type: "stdout",
      content: ZWi()
    };
  });
  function hno(e) {
    let t = [];
    let n = 0;
    for (let r of e) {
      let o = r.type;
      if (o === "stdout") {
        if (r.content === "") {
          continue;
        }
      } else if (o === "cursorMove") {
        if (r.x === 0 && r.y === 0) {
          continue;
        }
      } else if (o === "clear") {
        if (r.count === 0) {
          continue;
        }
      } else if (o === "styleStr") {
        if (r.str === "") {
          continue;
        }
      }
      if (n > 0) {
        let s = n - 1;
        let i = t[s];
        let a = i.type;
        if (o === "cursorMove" && a === "cursorMove") {
          let l = i.x + r.x;
          let c = i.y + r.y;
          if (l === 0 && c === 0) {
            t.pop();
            n--;
          } else {
            t[s] = {
              type: "cursorMove",
              x: l,
              y: c
            };
          }
          continue;
        }
        if (o === "cursorTo" && a === "cursorTo") {
          t[s] = r;
          continue;
        }
        if (o === "styleStr" && a === "styleStr") {
          t[s] = {
            type: "styleStr",
            str: i.str + r.str
          };
          continue;
        }
        if (o === "hyperlink" && a === "hyperlink" && r.uri === i.uri) {
          continue;
        }
        if ((o === "cursorShow" || o === "cursorHide") && (a === "cursorShow" || a === "cursorHide")) {
          t[s] = r;
          continue;
        }
      }
      t.push(r);
      n++;
    }
    return t;
  }
  function vJd() {
    var e = function (t) {
      var n = {
        R: "13k,1a,2,3,3,2+1j,ch+16,a+1,5+2,2+n,5,a,4,6+16,4+3,h+1b,4mo,179q,2+9,2+11,2i9+7y,2+68,4,3+4,5+13,4+3,2+4k,3+29,8+cf,1t+7z,w+17,3+3m,1t+3z,16o1+5r,8+30,8+mc,29+1r,29+4v,75+73",
        iZc: "1c+9,3d+1,6,187+9,513,4+5,7+9,sf+j,175h+9,qw+q,161f+1d,4xt+a,25i+9",
        ES: "17,2,6dp+1,f+1,av,16vr,mx+1,4o,2",
        ET: "z+2,3h+3,b+1,ym,3e+1,2o,p4+1,8,6u,7c,g6,1wc,1n9+4,30+1b,2n,6d,qhx+1,h0m,a+1,49+2,63+1,4+1,6bb+3,12jj",
        AN: "16o+5,2j+9,2+1,35,ed,1ff2+9,87+u",
        CS: "18,2+1,b,2u,12k,55v,l,17v0,2,3,53,2+1,b",
        B: "a,3,f+2,2v,690",
        S: "9,2,k",
        WS: "c,k,4f4,1vk+a,u,1j,335",
        ON: "x+1,4+4,h+5,r+5,r+3,z,5+3,2+1,2+1,5,2+2,3+4,o,w,ci+1,8+d,3+d,6+8,2+g,39+1,9,6+1,2,33,b8,3+1,3c+1,7+1,5r,b,7h+3,sa+5,2,3i+6,jg+3,ur+9,2v,ij+1,9g+9,7+a,8m,4+1,49+x,14u,2+2,c+2,e+2,e+2,e+1,i+n,e+e,2+p,u+2,e+2,36+1,2+3,2+1,b,2+2,6+5,2,2,2,h+1,5+4,6+3,3+f,16+2,5+3l,3+81,1y+p,2+40,q+a,m+13,2r+ch,2+9e,75+hf,3+v,2+2w,6e+5,f+6,75+2a,1a+p,2+2g,d+5x,r+b,6+3,4+o,g,6+1,6+2,2k+1,4,2j,5h+z,1m+1,1e+f,t+2,1f+e,d+3,4o+3,2s+1,w,535+1r,h3l+1i,93+2,2s,b+1,3l+x,2v,4g+3,21+3,kz+1,g5v+1,5a,j+9,n+v,2,3,2+8,2+1,3+2,2,3,46+1,4+4,h+5,r+5,r+a,3h+2,4+6,b+4,78,1r+24,4+c,4,1hb,ey+6,103+j,16j+c,1ux+7,5+g,fsh,jdq+1t,4,57+2e,p1,1m,1m,1m,1m,4kt+1,7j+17,5+2r,d+e,3+e,2+e,2+10,m+4,w,1n+5,1q,4z+5,4b+rb,9+c,4+c,4+37,d+2g,8+b,l+b,5+1j,9+9,7+13,9+t,3+1,27+3c,2+29,2+3q,d+d,3+4,4+2,6+6,a+o,8+6,a+2,e+6,16+42,2+1i",
        BN: "0+8,6+d,2s+5,2+p,e,4m9,1kt+2,2b+5,5+5,17q9+v,7k,6p+8,6+1,119d+3,440+7,96s+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+1,1ekf+75,6p+2rz,1ben+1,1ekf+1,1ekf+1",
        NSM: "lc+33,7o+6,7c+18,2,2+1,2+1,2,21+a,1d+k,h,2u+6,3+5,3+1,2+3,10,v+q,2k+a,1n+8,a,p+3,2+8,2+2,2+4,18+2,3c+e,2+v,1k,2,5+7,5,4+6,b+1,u,1n,5+3,9,l+1,r,3+1,1m,5+1,5+1,3+2,4,v+1,4,c+1,1m,5+4,2+1,5,l+1,n+5,2,1n,3,2+3,9,8+1,c+1,v,1q,d,1f,4,1m+2,6+2,2+3,8+1,c+1,u,1n,g+1,l+1,t+1,1m+1,5+3,9,l+1,u,21,8+2,2,2j,3+6,d+7,2r,3+8,c+5,23+1,s,2,2,1k+d,2+4,2+1,6+a,2+z,a,2v+3,2+5,2+1,3+1,q+1,5+2,h+3,e,3+1,7,g,jk+2,qb+2,u+2,u+1,v+1,1t+1,2+6,9,3+a,a,1a+2,3c+1,z,3b+2,5+1,a,7+2,64+1,3,1n,2+6,2,2,3+7,7+9,3,1d+g,1s+3,1d,2+4,2,6,15+8,d+1,x+3,3+1,2+2,1l,2+1,4,2+2,1n+7,3+1,49+2,2+c,2+6,5,7,4+1,5j+1l,2+4,k1+w,2db+2,3y,2p+v,ff+3,30+1,n9x+3,2+9,x+1,29+1,7l,4,5,q+1,6,48+1,r+h,e,13+7,q+a,1b+2,1d,3+3,3+1,14,1w+5,3+1,3+1,d,9,1c,1g,2+2,3+1,6+1,2,17+1,9,6n,3,5,fn5,ki+f,h+f,r2,6b,46+4,1af+2,2+1,6+3,15+2,5,4m+1,fy+3,as+1,4a+a,4x,1j+e,1l+2,1e+3,3+1,1y+2,11+4,2+7,1r,d+1,1h+8,b+3,3,2o+2,3,2+1,7,4h,4+7,m+1,1m+1,4,12+6,4+4,5g+7,3+2,2,o,2d+5,2,5+1,2+1,6n+3,7+1,2+1,s+1,2e+7,3,2+1,2z,2,3+5,2,2u+2,3+3,2+4,78+8,2+1,75+1,2,5,41+3,3+1,5,x+5,3+1,15+5,3+3,9,a+5,3+2,1b+c,2+1,bb+6,2+5,2d+l,3+6,2+1,2+1,3f+5,4,2+1,2+6,2,21+1,4,2,9o+1,f0c+4,1o+6,t5,1s+3,2a,f5l+1,43t+2,i+7,3+6,v+3,45+2,1j0+1i,5+1d,9,f,n+4,2+e,11t+6,2+g,3+6,2+1,2+4,7a+6,c6+3,15t+6,32+6,gzhy+6n",
        AL: "16w,3,2,e+1b,z+2,2+2s,g+1,8+1,b+m,2+t,s+2i,c+e,4h+f,1d+1e,1bwe+dp,3+3z,x+c,2+1,35+3y,2rm+z,5+7,b+5,dt+l,c+u,17nl+27,1t+27,4x+6n,3+d",
        LRO: "6ct",
        RLO: "6cu",
        LRE: "6cq",
        RLE: "6cr",
        PDF: "6cs",
        LRI: "6ee",
        RLI: "6ef",
        FSI: "6eg",
        PDI: "6eh"
      };
      var r = {};
      var o = {};
      r.L = 1;
      o[1] = "L";
      Object.keys(n).forEach(function (ue, ce) {
        r[ue] = 1 << ce + 1;
        o[r[ue]] = ue;
      });
      Object.freeze(r);
      var s = r.LRI | r.RLI | r.FSI;
      var i = r.L | r.R | r.AL;
      var a = r.B | r.S | r.WS | r.ON | r.FSI | r.LRI | r.RLI | r.PDI;
      var l = r.BN | r.RLE | r.LRE | r.RLO | r.LRO | r.PDF;
      var c = r.S | r.WS | r.B | s | r.PDI | l;
      var u = null;
      function d() {
        if (!u) {
          u = new Map();
          var ue = function (le) {
            if (n.hasOwnProperty(le)) {
              var pe = 0;
              n[le].split(",").forEach(function (ve) {
                var _e = ve.split("+");
                var xe = _e[0];
                var ke = _e[1];
                xe = parseInt(xe, 36);
                ke = ke ? parseInt(ke, 36) : 0;
                u.set(pe += xe, r[le]);
                for (var Ie = 0; Ie < ke; Ie++) {
                  u.set(++pe, r[le]);
                }
              });
            }
          };
          for (var ce in n) {
            ue(ce);
          }
        }
      }
      function p(ue) {
        d();
        return u.get(ue.codePointAt(0)) || r.L;
      }
      function m(ue) {
        return o[p(ue)];
      }
      var f = {
        pairs: "14>1,1e>2,u>2,2wt>1,1>1,1ge>1,1wp>1,1j>1,f>1,hm>1,1>1,u>1,u6>1,1>1,+5,28>1,w>1,1>1,+3,b8>1,1>1,+3,1>3,-1>-1,3>1,1>1,+2,1s>1,1>1,x>1,th>1,1>1,+2,db>1,1>1,+3,3>1,1>1,+2,14qm>1,1>1,+1,4q>1,1e>2,u>2,2>1,+1",
        canonical: "6f1>-6dx,6dy>-6dx,6ec>-6ed,6ee>-6ed,6ww>2jj,-2ji>2jj,14r4>-1e7l,1e7m>-1e7l,1e7m>-1e5c,1e5d>-1e5b,1e5c>-14qx,14qy>-14qx,14vn>-1ecg,1ech>-1ecg,1edu>-1ecg,1eci>-1ecg,1eda>-1ecg,1eci>-1ecg,1eci>-168q,168r>-168q,168s>-14ye,14yf>-14ye"
      };
      function h(ue, ce) {
        var le = 36;
        var pe = 0;
        var ve = new Map();
        var _e = ce && new Map();
        var xe;
        ue.split(",").forEach(function ke(Ie) {
          if (Ie.indexOf("+") !== -1) {
            for (var Ue = +Ie; Ue--;) {
              ke(xe);
            }
          } else {
            xe = Ie;
            var Ge = Ie.split(">");
            var Be = Ge[0];
            var We = Ge[1];
            Be = String.fromCodePoint(pe += parseInt(Be, le));
            We = String.fromCodePoint(pe += parseInt(We, le));
            ve.set(Be, We);
            ce && _e.set(We, Be);
          }
        });
        return {
          map: ve,
          reverseMap: _e
        };
      }
      var g;
      var y;
      var _;
      function b() {
        if (!g) {
          var ue = h(f.pairs, true);
          var ce = ue.map;
          var le = ue.reverseMap;
          g = ce;
          y = le;
          _ = h(f.canonical, false).map;
        }
      }
      function S(ue) {
        b();
        return g.get(ue) || null;
      }
      function E(ue) {
        b();
        return y.get(ue) || null;
      }
      function C(ue) {
        b();
        return _.get(ue) || null;
      }
      var {
        L: x,
        R: A,
        iZc: k,
        ES: I,
        ET: O,
        AN: M,
        CS: L,
        B: P,
        S: F,
        ON: H,
        BN: U,
        NSM: N,
        AL: W,
        LRO: j,
        RLO: z,
        LRE: V,
        RLE: K,
        PDF: J,
        LRI: Q,
        RLI: Z,
        FSI: ne,
        PDI: oe
      } = r;
      function ee(ue, ce) {
        var le = 125;
        var pe = new Uint32Array(ue.length);
        for (var ve = 0; ve < ue.length; ve++) {
          pe[ve] = p(ue[ve]);
        }
        var _e = new Map();
        function xe(up, ub) {
          var ta = pe[up];
          if (pe[up] = ub, _e.set(ta, _e.get(ta) - 1), ta & a) {
            _e.set(a, _e.get(a) - 1);
          }
          if (_e.set(ub, (_e.get(ub) || 0) + 1), ub & a) {
            _e.set(a, (_e.get(a) || 0) + 1);
          }
        }
        var ke = new Uint8Array(ue.length);
        var Ie = new Map();
        var Ue = [];
        var Ge = null;
        for (var Be = 0; Be < ue.length; Be++) {
          if (!Ge) {
            Ue.push(Ge = {
              start: Be,
              end: ue.length - 1,
              level: ce === "rtl" ? 1 : ce === "ltr" ? 0 : PR(Be, false)
            });
          }
          if (pe[Be] & P) {
            Ge.end = Be;
            Ge = null;
          }
        }
        var We = K | V | z | j | s | oe | J | P;
        var Ze = function (up) {
          return up + (up & 1 ? 1 : 2);
        };
        var Tt = function (up) {
          return up + (up & 1 ? 2 : 1);
        };
        for (var kt = 0; kt < Ue.length; kt++) {
          Ge = Ue[kt];
          var Ye = [{
            _level: Ge.level,
            _override: 0,
            _isolate: 0
          }];
          var ht = undefined;
          var It = 0;
          var Rt = 0;
          var wt = 0;
          _e.clear();
          for (var vt = Ge.start; vt <= Ge.end; vt++) {
            var yt = pe[vt];
            if (ht = Ye[Ye.length - 1], _e.set(yt, (_e.get(yt) || 0) + 1), yt & a) {
              _e.set(a, (_e.get(a) || 0) + 1);
            }
            if (yt & We) {
              if (yt & (K | V)) {
                ke[vt] = ht._level;
                var gt = (yt === K ? Tt : Ze)(ht._level);
                if (gt <= le && !It && !Rt) {
                  Ye.push({
                    _level: gt,
                    _override: 0,
                    _isolate: 0
                  });
                } else if (!It) {
                  Rt++;
                }
              } else if (yt & (z | j)) {
                ke[vt] = ht._level;
                var Ft = (yt === z ? Tt : Ze)(ht._level);
                if (Ft <= le && !It && !Rt) {
                  Ye.push({
                    _level: Ft,
                    _override: yt & z ? A : x,
                    _isolate: 0
                  });
                } else if (!It) {
                  Rt++;
                }
              } else if (yt & s) {
                if (yt & ne) {
                  yt = PR(vt + 1, true) === 1 ? Z : Q;
                }
                if (ke[vt] = ht._level, ht._override) {
                  xe(vt, ht._override);
                }
                var on = (yt === Z ? Tt : Ze)(ht._level);
                if (on <= le && It === 0 && Rt === 0) {
                  wt++;
                  Ye.push({
                    _level: on,
                    _override: 0,
                    _isolate: 1,
                    _isolInitIndex: vt
                  });
                } else {
                  It++;
                }
              } else if (yt & oe) {
                if (It > 0) {
                  It--;
                } else if (wt > 0) {
                  Rt = 0;
                  while (!Ye[Ye.length - 1]._isolate) {
                    Ye.pop();
                  }
                  var rn = Ye[Ye.length - 1]._isolInitIndex;
                  if (rn != null) {
                    Ie.set(rn, vt);
                    Ie.set(vt, rn);
                  }
                  Ye.pop();
                  wt--;
                }
                if (ht = Ye[Ye.length - 1], ke[vt] = ht._level, ht._override) {
                  xe(vt, ht._override);
                }
              } else if (yt & J) {
                if (It === 0) {
                  if (Rt > 0) {
                    Rt--;
                  } else if (!ht._isolate && Ye.length > 1) {
                    Ye.pop();
                    ht = Ye[Ye.length - 1];
                  }
                }
                ke[vt] = ht._level;
              } else if (yt & P) {
                ke[vt] = Ge.level;
              }
            } else if (ke[vt] = ht._level, ht._override && yt !== U) {
              xe(vt, ht._override);
            }
          }
          var Sn = [];
          var jn = null;
          for (var Xr = Ge.start; Xr <= Ge.end; Xr++) {
            var co = pe[Xr];
            if (!(co & l)) {
              var Yt = ke[Xr];
              var Ee = co & s;
              var Re = co === oe;
              if (jn && Yt === jn._level) {
                jn._end = Xr;
                jn._endsWithIsolInit = Ee;
              } else {
                Sn.push(jn = {
                  _start: Xr,
                  _end: Xr,
                  _level: Yt,
                  _startsWithPDI: Re,
                  _endsWithIsolInit: Ee
                });
              }
            }
          }
          var Ce = [];
          for (var Fe = 0; Fe < Sn.length; Fe++) {
            var Xe = Sn[Fe];
            if (!Xe._startsWithPDI || Xe._startsWithPDI && !Ie.vZc(Xe._start)) {
              var He = [jn = Xe];
              for (var Gt = undefined; jn && jn._endsWithIsolInit && (Gt = Ie.get(jn._end)) != null;) {
                for (var mt = Fe + 1; mt < Sn.length; mt++) {
                  if (Sn[mt]._start === Gt) {
                    He.push(jn = Sn[mt]);
                    break;
                  }
                }
              }
              var Dt = [];
              for (var jt = 0; jt < He.length; jt++) {
                var bn = He[jt];
                for (var Ct = bn._start; Ct <= bn._end; Ct++) {
                  Dt.push(Ct);
                }
              }
              var hn = ke[Dt[0]];
              var vn = Ge.level;
              for (var zn = Dt[0] - 1; zn >= 0; zn--) {
                if (!(pe[zn] & l)) {
                  vn = ke[zn];
                  break;
                }
              }
              var Pn = Dt[Dt.length - 1];
              var Lr = ke[Pn];
              var ao = Ge.level;
              if (!(pe[Pn] & s)) {
                for (var Nn = Pn + 1; Nn <= Ge.end; Nn++) {
                  if (!(pe[Nn] & l)) {
                    ao = ke[Nn];
                    break;
                  }
                }
              }
              Ce.push({
                _seqIndices: Dt,
                _sosType: Math.max(vn, hn) % 2 ? A : x,
                _eosType: Math.max(ao, Lr) % 2 ? A : x
              });
            }
          }
          for (var Tr = 0; Tr < Ce.length; Tr++) {
            var To = Ce[Tr];
            var wr = To._seqIndices;
            var Ut = To._sosType;
            var Wn = To._eosType;
            var Fr = ke[wr[0]] & 1 ? A : x;
            if (_e.get(N)) {
              for (var Is = 0; Is < wr.length; Is++) {
                var _r = wr[Is];
                if (pe[_r] & N) {
                  var kn = Ut;
                  for (var Qn = Is - 1; Qn >= 0; Qn--) {
                    if (!(pe[wr[Qn]] & l)) {
                      kn = pe[wr[Qn]];
                      break;
                    }
                  }
                  xe(_r, kn & (s | oe) ? H : kn);
                }
              }
            }
            if (_e.get(k)) {
              for (var gi = 0; gi < wr.length; gi++) {
                var Ks = wr[gi];
                if (pe[Ks] & k) {
                  for (var Fa = gi - 1; Fa >= -1; Fa--) {
                    var Hs = Fa === -1 ? Ut : pe[wr[Fa]];
                    if (Hs & i) {
                      if (Hs === W) {
                        xe(Ks, M);
                      }
                      break;
                    }
                  }
                }
              }
            }
            if (_e.get(W)) {
              for (var Ms = 0; Ms < wr.length; Ms++) {
                var Ia = wr[Ms];
                if (pe[Ia] & W) {
                  xe(Ia, A);
                }
              }
            }
            if (_e.get(I) || _e.get(L)) {
              for (var ec = 1; ec < wr.length - 1; ec++) {
                if (pe[0] & (I | L)) {
                  var Os = 0;
                  var Kn = 0;
                  for (var sn = ec - 1; sn >= 0; sn--) {
                    if (Os = pe[wr[sn]], !(Os & l)) {
                      break;
                    }
                  }
                  for (var Ln = ec + 1; Ln < wr.length; Ln++) {
                    if (Kn = pe[wr[Ln]], !(Kn & l)) {
                      break;
                    }
                  }
                  if (Os === Kn && (pe[0] === I ? Os === k : Os & (k | M))) {
                    xe(0, Os);
                  }
                }
              }
            }
            if (_e.get(k)) {
              for (var ct = 0; ct < wr.length; ct++) {
                var Br = wr[ct];
                if (pe[Br] & k) {
                  for (var Pr = ct - 1; Pr >= 0 && pe[wr[Pr]] & (O | l); Pr--) {
                    xe(wr[Pr], k);
                  }
                  for (ct++; ct < wr.length && pe[wr[ct]] & (O | l | k); ct++) {
                    if (pe[wr[ct]] !== k) {
                      xe(wr[ct], k);
                    }
                  }
                }
              }
            }
            if (_e.get(O) || _e.get(I) || _e.get(L)) {
              for (var Vr = 0; Vr < wr.length; Vr++) {
                var Xo = wr[Vr];
                if (pe[Xo] & (O | I | L)) {
                  xe(Xo, H);
                  for (var qo = Vr - 1; qo >= 0 && pe[wr[qo]] & l; qo--) {
                    xe(wr[qo], H);
                  }
                  for (var ss = Vr + 1; ss < wr.length && pe[wr[ss]] & l; ss++) {
                    xe(wr[ss], H);
                  }
                }
              }
            }
            if (_e.get(k)) {
              for (var Ri = 0, ya = Ut; Ri < wr.length; Ri++) {
                var fs = wr[Ri];
                var tc = pe[fs];
                if (tc & k) {
                  if (ya === x) {
                    xe(fs, x);
                  }
                } else if (tc & i) {
                  ya = tc;
                }
              }
            }
            if (_e.get(a)) {
              var On = A | k | M;
              var lr = On | x;
              var Mn = [];
              {
                var Un = [];
                for (var Er = 0; Er < wr.length; Er++) {
                  if (pe[wr[Er]] & a) {
                    var Or = ue[wr[Er]];
                    var Y = undefined;
                    if (S(Or) !== null) {
                      if (Un.length < 63) {
                        Un.push({
                          char: Or,
                          seqIndex: Er
                        });
                      } else {
                        break;
                      }
                    } else if ((Y = E(Or)) !== null) {
                      for (var Se = Un.length - 1; Se >= 0; Se--) {
                        var qe = Un[Se].char;
                        if (qe === Y || qe === E(C(Or)) || S(C(qe)) === Or) {
                          Mn.push([Un[Se].seqIndex, Er]);
                          Un.length = Se;
                          break;
                        }
                      }
                    }
                  }
                }
                Mn.sort(function (up, ub) {
                  return up[0] - ub[0];
                });
              }
              for (var Qe = 0; Qe < Mn.length; Qe++) {
                var Ht = Mn[Qe];
                var nn = Ht[0];
                var qn = Ht[1];
                var zr = false;
                var wo = 0;
                for (var Nr = nn + 1; Nr < qn; Nr++) {
                  var pi = wr[Nr];
                  if (pe[pi] & lr) {
                    zr = true;
                    var Dr = pe[pi] & On ? A : x;
                    if (Dr === Fr) {
                      wo = Dr;
                      break;
                    }
                  }
                }
                if (zr && !wo) {
                  wo = Ut;
                  for (var Us = nn - 1; Us >= 0; Us--) {
                    var oa = wr[Us];
                    if (pe[oa] & lr) {
                      var Du = pe[oa] & On ? A : x;
                      if (Du !== Fr) {
                        wo = Du;
                      } else {
                        wo = Fr;
                      }
                      break;
                    }
                  }
                }
                if (wo) {
                  if (pe[wr[nn]] = pe[wr[qn]] = wo, wo !== Fr) {
                    for (var nc = nn + 1; nc < wr.length; nc++) {
                      if (!(pe[wr[nc]] & l)) {
                        if (p(ue[wr[nc]]) & N) {
                          pe[wr[nc]] = wo;
                        }
                        break;
                      }
                    }
                  }
                  if (wo !== Fr) {
                    for (var ju = qn + 1; ju < wr.length; ju++) {
                      if (!(pe[wr[ju]] & l)) {
                        if (p(ue[wr[ju]]) & N) {
                          pe[wr[ju]] = wo;
                        }
                        break;
                      }
                    }
                  }
                }
              }
              for (var tm = 0; tm < wr.length; tm++) {
                if (pe[wr[tm]] & a) {
                  var Ym = tm;
                  var um = tm;
                  var jv = Ut;
                  for (var ac = tm - 1; ac >= 0; ac--) {
                    if (pe[wr[ac]] & l) {
                      Ym = ac;
                    } else {
                      jv = pe[wr[ac]] & On ? A : x;
                      break;
                    }
                  }
                  var id = Wn;
                  for (var Qy = tm + 1; Qy < wr.length; Qy++) {
                    if (pe[wr[Qy]] & (a | l)) {
                      um = Qy;
                    } else {
                      id = pe[wr[Qy]] & On ? A : x;
                      break;
                    }
                  }
                  for (var jS = Ym; jS <= um; jS++) {
                    pe[wr[jS]] = jv === id ? jv : Fr;
                  }
                  tm = um;
                }
              }
            }
          }
          for (var Dc = Ge.start; Dc <= Ge.end; Dc++) {
            var Zy = ke[Dc];
            var Ll = pe[Dc];
            if (Zy & 1) {
              if (Ll & (x | k | M)) {
                ke[Dc]++;
              }
            } else if (Ll & A) {
              ke[Dc]++;
            } else if (Ll & (M | k)) {
              ke[Dc] += 2;
            }
            if (Ll & l) {
              ke[Dc] = Dc === 0 ? Ge.level : ke[Dc - 1];
            }
            if (Dc === Ge.end || p(ue[Dc]) & (F | P)) {
              for (var Mg = Dc; Mg >= 0 && p(ue[Mg]) & c; Mg--) {
                ke[Mg] = Ge.level;
              }
            }
          }
        }
        return {
          levels: ke,
          paragraphs: Ue
        };
        function PR(up, ub) {
          for (var ta = up; ta < ue.length; ta++) {
            var db = pe[ta];
            if (db & (A | W)) {
              return 1;
            }
            if (db & (P | x) || ub && db === oe) {
              return 0;
            }
            if (db & s) {
              var Nf = $d(ta);
              ta = Nf === -1 ? ue.length : Nf;
            }
          }
          return 0;
        }
        function $d(up) {
          var ub = 1;
          for (var ta = up + 1; ta < ue.length; ta++) {
            var db = pe[ta];
            if (db & P) {
              break;
            }
            if (db & oe) {
              if (--ub === 0) {
                return ta;
              }
            } else if (db & s) {
              ub++;
            }
          }
          return -1;
        }
      }
      var re = "14>1,j>2,t>2,u>2,1a>g,2v3>1,1>1,1ge>1,1wd>1,b>1,1j>1,f>1,ai>3,-2>3,+1,8>1k0,-1jq>1y7,-1y6>1hf,-1he>1h6,-1h5>1ha,-1h8>1qi,-1pu>1,6>3u,-3s>7,6>1,1>1,f>1,1>1,+2,3>1,1>1,+13,4>1,1>1,6>1eo,-1ee>1,3>1mg,-1me>1mk,-1mj>1mi,-1mg>1mi,-1md>1,1>1,+2,1>10k,-103>1,1>1,4>1,5>1,1>1,+10,3>1,1>8,-7>8,+1,-6>7,+1,a>1,1>1,u>1,u6>1,1>1,+5,26>1,1>1,2>1,2>2,8>1,7>1,4>1,1>1,+5,b8>1,1>1,+3,1>3,-2>1,2>1,1>1,+2,c>1,3>1,1>1,+2,h>1,3>1,a>1,1>1,2>1,3>1,1>1,d>1,f>1,3>1,1a>1,1>1,6>1,7>1,13>1,k>1,1>1,+19,4>1,1>1,+2,2>1,1>1,+18,m>1,a>1,1>1,lk>1,1>1,4>1,2>1,f>1,3>1,1>1,+3,db>1,1>1,+3,3>1,1>1,+2,14qm>1,1>1,+1,6>1,4j>1,j>2,t>2,u>2,2>1,+1";
      var se;
      function ae() {
        if (!se) {
          var ue = h(re, true);
          var ce = ue.map;
          var le = ue.reverseMap;
          le.forEach(function (pe, ve) {
            ce.set(ve, pe);
          });
          se = ce;
        }
      }
      function de(ue) {
        ae();
        return se.get(ue) || null;
      }
      function be(ue, ce, le, pe) {
        var ve = ue.length;
        le = Math.max(0, le == null ? 0 : +le);
        pe = Math.min(ve - 1, pe == null ? ve - 1 : +pe);
        var _e = new Map();
        for (var xe = le; xe <= pe; xe++) {
          if (ce[xe] & 1) {
            var ke = de(ue[xe]);
            if (ke !== null) {
              _e.set(xe, ke);
            }
          }
        }
        return _e;
      }
      function fe(ue, ce, le, pe) {
        var ve = ue.length;
        le = Math.max(0, le == null ? 0 : +le);
        pe = Math.min(ve - 1, pe == null ? ve - 1 : +pe);
        var _e = [];
        ce.paragraphs.forEach(function (xe) {
          var ke = Math.max(le, xe.start);
          var Ie = Math.min(pe, xe.end);
          if (ke < Ie) {
            var Ue = ce.levels.slice(ke, Ie + 1);
            for (var Ge = Ie; Ge >= ke && p(ue[Ge]) & c; Ge--) {
              Ue[Ge] = xe.level;
            }
            var Be = xe.level;
            var We = 1 / 0;
            for (var Ze = 0; Ze < Ue.length; Ze++) {
              var Tt = Ue[Ze];
              if (Tt > Be) {
                Be = Tt;
              }
              if (Tt < We) {
                We = Tt | 1;
              }
            }
            for (var kt = Be; kt >= We; kt--) {
              for (var Ye = 0; Ye < Ue.length; Ye++) {
                if (Ue[Ye] >= kt) {
                  var ht = Ye;
                  while (Ye + 1 < Ue.length && Ue[Ye + 1] >= kt) {
                    Ye++;
                  }
                  if (Ye > ht) {
                    _e.push([ht + ke, Ye + ke]);
                  }
                }
              }
            }
          }
        });
        return _e;
      }
      function me(ue, ce, le, pe) {
        var ve = Te(ue, ce, le, pe);
        var _e = [].concat(ue);
        ve.forEach(function (xe, ke) {
          _e[ke] = (ce.levels[xe] & 1 ? de(ue[xe]) : null) || ue[xe];
        });
        return _e.join("");
      }
      function Te(ue, ce, le, pe) {
        var ve = fe(ue, ce, le, pe);
        var _e = [];
        for (var xe = 0; xe < ue.length; xe++) {
          _e[xe] = xe;
        }
        ve.forEach(function (ke) {
          var Ie = ke[0];
          var Ue = ke[1];
          var Ge = _e.slice(Ie, Ue + 1);
          for (var Be = Ge.length; Be--;) {
            _e[Ue - Be] = Ge[Be];
          }
        });
        return _e;
      }
      t.closingToOpeningBracket = E;
      t.getBidiCharType = p;
      t.getBidiCharTypeName = m;
      t.getCanonicalBracket = C;
      t.getEmbeddingLevels = ee;
      t.getMirroredCharacter = de;
      t.getMirroredCharactersMap = be;
      t.getReorderSegments = fe;
      t.getReorderedIndices = Te;
      t.getReorderedString = me;
      t.openingToClosingBracket = S;
      Object.defineProperty(t, "__esModule", {
        value: true
      });
      return t;
    }({});
    return e;
  }
  function wJd() {
    if (yno === undefined) {
      yno = typeof process.env.WT_SESSION === "string" || process.env.TERM_PROGRAM === "vscode";
    }
    return yno;
  }
  function CJd() {
    if (!gno) {
      gno = vJd();
    }
    return gno;
  }
  function $zi(e) {
    if (!wJd() || e.length === 0) {
      return e;
    }
    let t = e.map(l => l.value.replace(/[\u061C\u202A-\u202E\u2066-\u2069]/g, "\uFFFD")).join("");
    if (!AJd(t)) {
      return e;
    }
    let n = CJd();
    let {
      levels: r
    } = n.getEmbeddingLevels(t, "auto");
    let o = [];
    let s = 0;
    for (let l = 0; l < e.length; l++) {
      o.push(r[s]);
      s += e[l].value.length;
    }
    let i = [...e];
    let a = Math.max(...o);
    for (let l = a; l >= 1; l--) {
      let c = 0;
      while (c < i.length) {
        if (o[c] >= l) {
          let u = c + 1;
          while (u < i.length && o[u] >= l) {
            u++;
          }
          RJd(i, c, u - 1);
          xJd(o, c, u - 1);
          c = u;
        } else {
          c++;
        }
      }
    }
    return i;
  }
  function RJd(e, t, n) {
    while (t < n) {
      let r = e[t];
      e[t] = e[n];
      e[n] = r;
      t++;
      n--;
    }
  }
  function xJd(e, t, n) {
    while (t < n) {
      let r = e[t];
      e[t] = e[n];
      e[n] = r;
      t++;
      n--;
    }
  }
  function AJd(e) {
    return kJd.test(e);
  }
  var gno;
  var yno;
  var kJd;
  var Hzi = __lazy(() => {
    kJd = /[\u0590-\u05FF\uFB1D-\uFB4F\u0600-\u06FF\u0750-\u077F\u08A0-\u08FF\uFB50-\uFDFF\uFE70-\uFEFF\u0780-\u07BF\u0700-\u074F]/u;
  });
  function qHt(e) {
    let t = 0;
    let n = 0;
    while (n <= e.length) {
      let r = e.indexOf(`
`, n);
      let o = r === -1 ? e.substring(n) : e.substring(n, r);
      if (t = Math.max(t, Glt(o)), r === -1) {
        break;
      }
      n = r + 1;
    }
    return t;
  }
  var _no = __lazy(() => {
    xNn();
  });
  function jzi(e, t) {
    if (!e) {
      return t;
    }
    return {
      x1: qzi(e.x1, t.x1),
      x2: Wzi(e.x2, t.x2),
      y1: qzi(e.y1, t.y1),
      y2: Wzi(e.y2, t.y2)
    };
  }
  function qzi(e, t) {
    if (e === undefined) {
      return t;
    }
    if (t === undefined) {
      return e;
    }
    return Math.max(e, t);
  }
  function Wzi(e, t) {
    if (e === undefined) {
      return t;
    }
    if (t === undefined) {
      return e;
    }
    return Math.min(e, t);
  }
  class lSe {
    width;
    height;
    stylePool;
    screen;
    operations = [];
    charCache = new Map();
    charCacheGeneration;
    charCacheChalkGeneration;
    constructor(e) {
      let {
        width: t,
        height: n,
        stylePool: r,
        screen: o
      } = e;
      this.width = t;
      this.height = n;
      this.stylePool = r;
      this.screen = o;
      this.charCacheGeneration = r.generation;
      this.charCacheChalkGeneration = JMn();
      Gto(o, t, n);
    }
    reset(e, t, n) {
      if (this.width = e, this.height = t, this.screen = n, this.operations.length = 0, Gto(n, e, t), this.stylePool.generation !== this.charCacheGeneration || JMn() !== this.charCacheChalkGeneration) {
        this.charCacheGeneration = this.stylePool.generation;
        this.charCacheChalkGeneration = JMn();
        this.charCache.clear();
      } else if (this.charCache.size > 512) {
        let r = this.charCache.size - 512;
        for (let o of this.charCache.keys()) {
          if (r-- <= 0) {
            break;
          }
          this.charCache.delete(o);
        }
      }
    }
    blit(e, t, n, r, o) {
      this.operations.push({
        type: "blit",
        src: e,
        x: t,
        y: n,
        width: r,
        height: o
      });
    }
    shift(e, t, n) {
      this.operations.push({
        type: "shift",
        top: e,
        bottom: t,
        n
      });
    }
    clear(e, t) {
      this.operations.push({
        type: "clear",
        region: e,
        fromAbsolute: t
      });
    }
    noSelect(e) {
      this.operations.push({
        type: "noSelect",
        region: e
      });
    }
    write(e, t, n, r) {
      if (!n) {
        return;
      }
      this.operations.push({
        type: "write",
        x: e,
        y: t,
        text: n,
        softWrap: r
      });
    }
    clip(e) {
      this.operations.push({
        type: "clip",
        clip: e
      });
    }
    unclip() {
      this.operations.push({
        type: "unclip"
      });
    }
    get() {
      let e = this.screen;
      let t = this.width;
      let n = this.height;
      let r = 0;
      let o = 0;
      let s = [];
      for (let c = 0; c < this.operations.length; c++) {
        let u = this.operations[c];
        if (u.type !== "clear") {
          continue;
        }
        let {
          x: d,
          y: p,
          width: m,
          height: f
        } = u.region;
        let h = Math.max(0, d);
        let g = Math.max(0, p);
        let y = Math.min(d + m, t);
        let _ = Math.min(p + f, n);
        if (h >= y || g >= _) {
          continue;
        }
        let b = {
          x: h,
          y: g,
          width: y - h,
          height: _ - g
        };
        if (e.damage = e.damage ? FWe(e.damage, b) : b, u.fromAbsolute) {
          s.push({
            rect: b,
            opIndex: c
          });
        }
      }
      let i = [];
      for (let c = 0; c < this.operations.length; c++) {
        let u = this.operations[c];
        switch (u.type) {
          case "clear":
            continue;
          case "clip":
            i.push(jzi(i.at(-1), u.clip));
            continue;
          case "unclip":
            i.pop();
            continue;
          case "blit":
            {
              let {
                src: d,
                x: p,
                y: m,
                width: f,
                height: h
              } = u;
              let g = i.at(-1);
              let y = Math.max(p, g?.x1 ?? 0);
              let _ = Math.max(m, g?.y1 ?? 0);
              let b = Math.min(m + h, n, d.height, g?.y2 ?? 1 / 0);
              let S = Math.min(p + f, t, d.width, g?.x2 ?? 1 / 0);
              if (y >= S || _ >= b) {
                continue;
              }
              if (s.length === 0) {
                jNn(e, d, y, _, S, b);
                r += (b - _) * (S - y);
                continue;
              }
              let E = s.filter(x => x.opIndex > c);
              if (E.length === 0) {
                jNn(e, d, y, _, S, b);
                r += (b - _) * (S - y);
                continue;
              }
              let C = _;
              for (let x = _; x <= b; x++) {
                if (x < b && E.some(({
                  rect: k
                }) => x >= k.y && x < k.y + k.height && y >= k.x && S <= k.x + k.width) || x === b) {
                  if (x > C) {
                    jNn(e, d, y, C, S, x);
                    r += (x - C) * (S - y);
                  }
                  C = x + 1;
                }
              }
              continue;
            }
          case "shift":
            {
              qNn(e, u.top, u.bottom, u.n);
              continue;
            }
          case "write":
            {
              let {
                text: d,
                softWrap: p
              } = u;
              let {
                x: m,
                y: f
              } = u;
              let h = d.split(`
`);
              let g = 0;
              let y = 0;
              let _ = i.at(-1);
              if (_) {
                let E = typeof _?.x1 === "number" && typeof _?.x2 === "number";
                let C = typeof _?.y1 === "number" && typeof _?.y2 === "number";
                if (E) {
                  let x = qHt(d);
                  if (m + x < _.x1 || m > _.x2) {
                    continue;
                  }
                }
                if (C) {
                  let x = h.length;
                  if (f + x < _.y1 || f > _.y2) {
                    continue;
                  }
                }
                if (E) {
                  if (h = h.map(x => {
                    let A = m < _.x1 ? _.x1 - m : 0;
                    let k = an(x);
                    let I = m + k > _.x2 ? _.x2 - m : k;
                    if (A === 0 && I >= k) {
                      return x;
                    }
                    let O = KF(x, A, I);
                    while (an(O) > I - A && I > A) {
                      I--;
                      O = KF(x, A, I);
                    }
                    return O;
                  }), m < _.x1) {
                    m = _.x1;
                  }
                }
                if (C) {
                  let x = f < _.y1 ? _.y1 - f : 0;
                  let A = h.length;
                  let k = f + A > _.y2 ? _.y2 - f : A;
                  if (p && x > 0 && (p[x] ?? Sre.HardBreak) !== Sre.HardBreak) {
                    y = Wto(m + an(h[x - 1]), m);
                  }
                  if (h = h.slice(x, k), g = x, f < _.y1) {
                    f = _.y1;
                  }
                }
              }
              let b = e.softWrap;
              let S = 0;
              for (let E of h) {
                let C = f + S;
                if (C >= n) {
                  break;
                }
                let x = OJd(e, E, m, C, t, this.stylePool, this.charCache);
                if (o += x - m, p) {
                  let A = p[g + S];
                  b[C] = A === Sre.HardBreak || A === undefined ? 0 : A === Sre.ContinuationElidedSep ? y | 32768 : y;
                  y = Wto(x, m);
                }
                S++;
              }
              continue;
            }
        }
      }
      let a = [];
      for (let c of this.operations) {
        if (c.type === "clip") {
          a.push(jzi(a.at(-1), c.clip));
        } else if (c.type === "unclip") {
          a.pop();
        } else if (c.type === "noSelect") {
          let {
            x: u,
            y: d,
            width: p,
            height: m
          } = c.region;
          let f = a.at(-1);
          let h = Math.max(u, f?.x1 ?? 0);
          let g = Math.max(d, f?.y1 ?? 0);
          let y = Math.min(u + p, f?.x2 ?? 1 / 0);
          let _ = Math.min(d + m, f?.y2 ?? 1 / 0);
          if (y > h && _ > g) {
            MVi(e, h, g, y - h, _ - g);
          }
        }
      }
      let l = r + o;
      if (l > 1000 && o > r) {
        logForDebugging(`High write ratio: blit=${r}, write=${o} (${(o / l * 100).toFixed(1)}% writes), screen=${n}x${t}`);
      }
      return e;
    }
  }
  function IJd(e, t) {
    if (e === t) {
      return true;
    }
    let n = e.length;
    if (n !== t.length) {
      return false;
    }
    if (n === 0) {
      return true;
    }
    for (let r = 0; r < n; r++) {
      if (e[r].code !== t[r].code) {
        return false;
      }
    }
    return true;
  }
  function PJd(e, t) {
    let n = e.length;
    if (n === 0) {
      return [];
    }
    let r = [];
    let o = [];
    let s = e[0].styles;
    for (let i = 0; i < n; i++) {
      let a = e[i];
      let l = a.styles;
      if (o.length > 0 && !IJd(l, s)) {
        Vzi(o.join(""), s, t, r);
        o.length = 0;
      }
      o.push(a.value);
      s = l;
    }
    if (o.length > 0) {
      Vzi(o.join(""), s, t, r);
    }
    return r;
  }
  function Vzi(e, t, n, r) {
    let o = PVi(t) ?? undefined;
    let i = o !== undefined || t.some(l => l.code.length >= TPe.length && l.code.startsWith(TPe)) ? OVi(t) : t;
    let a = n.intern(U9i(i));
    for (let {
      segment: l
    } of JS().segment(e)) {
      r.push({
        value: l,
        width: an(l),
        styleId: a,
        hyperlink: o
      });
    }
  }
  function OJd(e, t, n, r, o, s, i) {
    let a = i.get(t);
    if (a) {
      i.delete(t);
      i.set(t, a);
    } else {
      a = $zi(PJd(N8i(Vlt(t)), s));
      i.set(t, a);
    }
    let l = n;
    let c = {
      char: " ",
      styleId: s.none,
      width: 0,
      hyperlink: undefined
    };
    for (let u = 0; u < a.length; u++) {
      let d = a[u];
      let p = d.value.codePointAt(0);
      if (p !== undefined && p <= 31) {
        if (p === 9) {
          let g = 8 - l % 8;
          c.char = " ";
          c.styleId = s.none;
          c.width = 0;
          c.hyperlink = undefined;
          for (let y = 0; y < g && l < o; y++) {
            nct(e, l, r, c);
            l++;
          }
        } else if (p === 27) {
          let h = a[u + 1]?.value;
          let g = h?.codePointAt(0);
          if (h === "(" || h === ")" || h === "*" || h === "+") {
            u += 2;
          } else if (h === "[") {
            u++;
            while (u < a.length - 1) {
              u++;
              let y = a[u]?.value.codePointAt(0);
              if (y !== undefined && y >= 64 && y <= 126) {
                break;
              }
            }
          } else if (h === "]" || h === "P" || h === "_" || h === "^" || h === "X") {
            u++;
            while (u < a.length - 1) {
              u++;
              let y = a[u]?.value;
              if (y === "\x07") {
                break;
              }
              if (y === "\x1B") {
                if (a[u + 1]?.value === "\\") {
                  u++;
                  break;
                }
              }
            }
          } else if (g !== undefined && g >= 48 && g <= 126) {
            u++;
          }
        }
        continue;
      }
      if (p !== undefined && d.value.length === 1 && (p === 1564 || p >= 8234 && p <= 8238 || p >= 8294 && p <= 8297)) {
        c.char = "\uFFFD";
        c.styleId = d.styleId;
        c.width = 0;
        c.hyperlink = d.hyperlink;
        nct(e, l, r, c);
        l++;
        continue;
      }
      let m = d.width;
      if (m === 0) {
        continue;
      }
      let f = m >= 2;
      if (f && l + m > o) {
        c.char = " ";
        c.styleId = s.none;
        c.width = 3;
        c.hyperlink = undefined;
        nct(e, l, r, c);
        l++;
        continue;
      }
      c.char = d.value;
      c.styleId = d.styleId;
      c.width = f ? 1 : 0;
      c.hyperlink = d.hyperlink;
      nct(e, l, r, c);
      for (let h = 2; h < m; h++) {
        c.char = "";
        c.width = 2;
        nct(e, l + h, r, c);
      }
      l += f ? m : 1;
    }
    return l;
  }
  var WHt = __lazy(() => {
    zlt();
    je();
    PP();
    yPe();
    Hzi();
    J8();
    Q8();
    iG();
    bc();
    _no();
  });
  function bno(e, t = 1, n = {}) {
    let {
      indent: r = " ",
      includeEmptyLines: o = false
    } = n;
    if (typeof e !== "string") {
      throw TypeError(`Expected \`input\` to be a \`string\`, got \`${typeof e}\``);
    }
    if (typeof t !== "number") {
      throw TypeError(`Expected \`count\` to be a \`number\`, got \`${typeof t}\``);
    }
    if (t < 0) {
      throw RangeError(`Expected \`count\` to be at least 0, got \`${t}\``);
    }
    if (typeof r !== "string") {
      throw TypeError(`Expected \`options.indent\` to be a \`string\`, got \`${typeof r}\``);
    }
    if (t === 0) {
      return e;
    }
    let s = o ? /^/gm : /^(?!\s*$)/gm;
    return e.replace(s, r.repeat(t));
  }
  var DJd = e => e.getComputedWidth() - e.getComputedPadding(0) - e.getComputedPadding(2) - e.getComputedBorder(0) - e.getComputedBorder(2);