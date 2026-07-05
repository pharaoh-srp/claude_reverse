  __export(fG, {
    wrapText: () => wrapText_export,
    useTimeout: () => useTimeout,
    useThemeSetting: () => useThemeSetting,
    useTheme: () => useTheme,
    useTerminalViewport: () => useTerminalViewport,
    useTerminalTitle: () => useTerminalTitle,
    useTerminalFocus: () => useTerminalFocus,
    useTabStatus: () => useTabStatus,
    F5d: () => F5d,
    useSelection: () => useSelection,
    useResolvedTheme: () => useResolvedTheme,
    usePreviewTheme: () => usePreviewTheme,
    useIsScreenReaderEnabled: () => useIsScreenReaderEnabled,
    useInterval: () => useInterval,
    useHasFocus: () => useHasFocus,
    useFocus: () => useFocus,
    useDebouncedCallback: () => useDebouncedCallback,
    useCustomThemes: () => useCustomThemes,
    useClock: () => useClock,
    MXd: () => MXd,
    useAnimationTimer: () => useAnimationTimer,
    useAnimationFrame: () => useAnimationFrame,
    supportsTabStatus: () => supportsTabStatus,
    render: () => render,
    $Xd: () => $Xd,
    createRoot: () => createRoot,
    color: () => color,
    ThemeProvider: () => ThemeProvider,
    Text: () => Text,
    TerminalFocusEvent: () => TerminalFocusEvent,
    Spacer: () => Spacer,
    RawAnsi: () => RawAnsi,
    NoSelect: () => NoSelect,
    Newline: () => Newline,
    Link: () => Link,
    FocusManager: () => FocusManager,
    EventEmitter: () => EventEmitter,
    Event: () => Event_export,
    Decorative: () => Decorative,
    ClickEvent: () => ClickEvent,
    OXd: () => OXd,
    gXd: () => gXd,
    BaseText: () => BaseText,
    oJd: () => oJd,
    Ansi: () => Ansi
  });
  function zno(e) {
    return C7i.createElement(ThemeProvider, null, e);
  }
  async function render(e, t) {
    if (t !== undefined && "write" in t) {
      return pXd(zno(e), t);
    }
    return pXd(zno(e), {
      nativeCursor: wre(),
      ...t
    });
  }
  async function createRoot(e) {
    let t = await CKi({
      nativeCursor: wre(),
      ...e
    });
    return {
      ...t,
      render: n => t.render(zno(n))
    };
  }
  var C7i;
  var et = __lazy(() => {
    FJ();
    GWe();
    APe();
    IPe();
    FJ();
    e7i();
    i7i();
    _ue();
    c7i();
    p7i();
    h7i();
    _7i();
    HWe();
    dno();
    aMn();
    beo();
    iSe();
    ejt();
    zWe();
    T7i();
    y1n();
    Gno();
    Vno();
    DPe();
    JWe();
    w7i();
    vPe();
    v1n();
    ZHt();
    tjt();
    Tg();
    xHt();
    C7i = __toESM(ot(), 1);
  });
  function Sr() {
    let e = R7i.useContext(gue);
    if (!e) {
      throw Error("useTerminalSize must be used within an Ink App component");
    }
    return e;
  }
  var R7i;
  var ki = __lazy(() => {
    pct();
    R7i = __toESM(ot(), 1);
  });
  function Act(e) {
    let t = x7i.c(10);
    let {
      children: n,
      lock: r
    } = e;
    let o = r === undefined ? "always" : r;
    let [s, i] = useTerminalViewport();
    let {
      isVisible: a
    } = i;
    let {
      rows: l
    } = Sr();
    let c = QWe.useRef(null);
    let u = QWe.useRef(0);
    let [d, p] = QWe.useState(0);
    let m;
    if (t[0] !== s) {
      m = S => {
        s(S);
      };
      t[0] = s;
      t[1] = m;
    } else {
      m = t[1];
    }
    let f = m;
    let h = o === "always" || !a;
    let g;
    if (t[2] !== l) {
      g = () => {
        if (!c.current) {
          return;
        }
        let {
          height: S
        } = $Xd(c.current);
        if (S > u.current) {
          u.current = Math.min(S, l);
          p(u.current);
        }
      };
      t[2] = l;
      t[3] = g;
    } else {
      g = t[3];
    }
    QWe.useLayoutEffect(g);
    let y = h ? d : undefined;
    let _;
    if (t[4] !== n) {
      _ = Kno.jsx(gXd, {
        ref: c,
        flexDirection: "column",
        children: n
      });
      t[4] = n;
      t[5] = _;
    } else {
      _ = t[5];
    }
    let b;
    if (t[6] !== f || t[7] !== y || t[8] !== _) {
      b = Kno.jsx(gXd, {
        minHeight: y,
        ref: f,
        children: _
      });
      t[6] = f;
      t[7] = y;
      t[8] = _;
      t[9] = b;
    } else {
      b = t[9];
    }
    return b;
  }
  var x7i;
  var QWe;
  var Kno;
  var C1n = __lazy(() => {
    ki();
    ZHt();
    et();
    x7i = __toESM(pt(), 1);
    QWe = __toESM(ot(), 1);
    Kno = __toESM(ie(), 1);
  });
  function Vn(e) {
    let t = Yno.c(11);
    let {
      children: n,
      height: r,
      screenReaderLabel: o
    } = e;
    if (Jno.useContext(Xno)) {
      return n;
    }
    let i = o === undefined;
    let a;
    if (t[0] !== o || t[1] !== i) {
      a = uSe.jsx(NoSelect, {
        fromLeftEdge: true,
        flexShrink: 0,
        children: uSe.jsxs(Text, {
          "aria-hidden": i,
          "aria-label": o,
          dimColor: true,
          children: ["  ", "\u23BF \xA0"]
        })
      });
      t[0] = o;
      t[1] = i;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== n) {
      l = uSe.jsx(gXd, {
        flexShrink: 1,
        flexGrow: 1,
        children: n
      });
      t[3] = n;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== r || t[6] !== a || t[7] !== l) {
      c = uSe.jsx(HXd, {
        children: uSe.jsxs(gXd, {
          flexDirection: "row",
          height: r,
          overflowY: "hidden",
          children: [a, l]
        })
      });
      t[5] = r;
      t[6] = a;
      t[7] = l;
      t[8] = c;
    } else {
      c = t[8];
    }
    let u = c;
    if (r !== undefined) {
      return u;
    }
    let d;
    if (t[9] !== u) {
      d = uSe.jsx(Act, {
        lock: "offscreen",
        children: u
      });
      t[9] = u;
      t[10] = d;
    } else {
      d = t[10];
    }
    return d;
  }
  function A7i() {
    return Jno.useContext(Xno);
  }
  function HXd(e) {
    let t = Yno.c(2);
    let {
      children: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = uSe.jsx(Xno.Provider, {
        value: true,
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  var Yno;
  var k7i;
  var Jno;
  var uSe;
  var Xno;
  var Wl = __lazy(() => {
    et();
    C1n();
    Yno = __toESM(pt(), 1);
    k7i = __toESM(ot(), 1);
    Jno = __toESM(ot(), 1);
    uSe = __toESM(ie(), 1);
    Xno = k7i.createContext(false);
  });
  async function Ict(e, t) {
    if (!e) {
      return {
        resultType: "emptyPath"
      };
    }
    let n = njt.resolve(us(e));
    try {
      if (!(await I7i.stat(n)).isDirectory()) {
        return {
          resultType: "notADirectory",
          directoryPath: e,
          absolutePath: n
        };
      }
    } catch (s) {
      if (!Io(s)) {
        Oe(Object.assign(Error("validateDirectoryForWorkspace: unexpected stat errno"), {
          code: en(s)
        }));
      }
      return {
        resultType: "pathNotFound",
        directoryPath: e,
        absolutePath: n
      };
    }
    let r = allWorkingDirectories(t);
    let o = getOriginalCwd();
    for (let s of r) {
      if (pathInWorkingPath(n, s, {
        caseFold: false
      })) {
        return {
          resultType: "alreadyInWorkingDirectory",
          directoryPath: e,
          workingDir: s,
          isExactMatch: njt.resolve(s) === n,
          isOriginalCwd: s === o
        };
      }
    }
    return {
      resultType: "success",
      absolutePath: n
    };
  }
  function Pct(e) {
    switch (e.resultType) {
      case "emptyPath":
        return "Please provide a directory path.";
      case "pathNotFound":
        return `Path ${_$u.bold(e.absolutePath)} was not found.`;
      case "notADirectory":
        {
          let t = njt.dirname(e.absolutePath);
          return `${_$u.bold(e.directoryPath)} is not a directory. Did you mean to add the parent directory ${_$u.bold(t)}?`;
        }
      case "alreadyInWorkingDirectory":
        {
          let t = _$u.bold(e.directoryPath);
          if (e.isExactMatch) {
            return e.isOriginalCwd ? `${t} is already the current working directory.` : `${t} is already added as a working directory.`;
          }
          let n = e.isOriginalCwd ? "the current working directory" : "the additional working directory";
          return `${t} is already accessible within ${n} ${_$u.bold(e.workingDir)}.`;
        }
      case "success":
        return `Added ${_$u.bold(e.absolutePath)} as a working directory.`;
    }
  }
  var I7i;
  var njt;
  var R1n = __lazy(() => {
    at();
    dt();
    Rn();
    ku();
    wm();
    I7i = require("fs/promises");
    njt = require("path");
  });
  var O7i = {};
  __export(O7i, {
    useVoiceState: () => useVoiceState,
    useSetVoiceState: () => useSetVoiceState,
    useGetVoiceState: () => useGetVoiceState,
    VoiceProvider: () => VoiceProvider
  });
  function VoiceProvider(e) {
    let t = Qno.c(3);
    let {
      children: n
    } = e;
    let [r] = FPe.useState(WXd);
    let o;
    if (t[0] !== n || t[1] !== r) {
      o = D7i.jsx(P7i.Provider, {
        value: r,
        children: n
      });
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function WXd() {
    return dO(jXd);
  }
  function Zno() {
    let e = FPe.useContext(P7i);
    if (!e) {
      throw Error("useVoiceState must be used within a VoiceProvider");
    }
    return e;
  }
  function useVoiceState(e) {
    let t = Qno.c(3);
    let n = Zno();
    let r;
    if (t[0] !== e || t[1] !== n) {
      r = () => e(n.getState());
      t[0] = e;
      t[1] = n;
      t[2] = r;
    } else {
      r = t[2];
    }
    let o = r;
    return FPe.useSyncExternalStore(n.subscribe, o, o);
  }
  function useSetVoiceState() {
    return Zno().setState;
  }
  function useGetVoiceState() {
    return Zno().getState;
  }
  var Qno;
  var FPe;
  var D7i;
  var jXd;
  var P7i;
  var dSe = __lazy(() => {
    tre();
    Qno = __toESM(pt(), 1);
    FPe = __toESM(ot(), 1);
    D7i = __toESM(ie(), 1);
    jXd = {
      voiceState: "idle",
      voiceError: null,
      voiceInterimTranscript: "",
      voiceAudioLevels: [],
      voiceWarmingUp: false,
      awaitingVoiceSubmitDoubleTap: false
    };
    P7i = FPe.createContext(null);
  });
  function ero() {
    let e = UPe.useContext(Dct);
    if (!e) {
      throw ReferenceError("useAppState/useSetAppState cannot be called outside of an <AppStateProvider />");
    }
    return e;
  }
  function bt(e) {
    let t = ero();
    let n = () => {
      let r = t.getState();
      return e(r);
    };
    return UPe.useSyncExternalStore(t.subscribe, n, n);
  }
  function Lo() {
    return ero().setState;
  }
  function Ec() {
    return ero();
  }
  function fw(e) {
    let t = UPe.useContext(Dct);
    return UPe.useSyncExternalStore(t ? t.subscribe : GXd, () => t ? e(t.getState()) : undefined);
  }
  var UPe;
  var Dct;
  var GXd = () => () => {};
  var ho = __lazy(() => {
    UPe = __toESM(ot(), 1);
    Dct = UPe.createContext(null);
  });
  function ojt(e, t) {
    let n = e.current?.key === t;
    let r = e.queue.some(s => s.key === t);
    let o = e.pinned.some(s => s.key === t);
    if (!n && !r && !o) {
      return e;
    }
    return {
      current: n ? null : e.current,
      queue: e.queue.filter(s => s.key !== t),
      pinned: o ? e.pinned.filter(s => s.key !== t) : e.pinned
    };
  }
  function sjt({
    children: e
  }) {
    let t = rV.useRef({
      clearTimer: {
        current: null
      },
      mountCount: {
        current: 0
      }
    }).current;
    return L7i.jsx(N7i.Provider, {
      value: t,
      children: e
    });
  }
  function Fi() {
    let e = Ec();
    let t = Lo();
    let n = useClock();
    let r = rV.useContext(N7i);
    let o = rV.useRef({
      clearTimer: {
        current: null
      },
      mountCount: {
        current: 0
      }
    }).current;
    let {
      clearTimer: s,
      mountCount: i
    } = r ?? o;
    let a = rV.useCallback(() => {
      t(u => {
        let d = VXd(u.notifications.queue);
        if (u.notifications.current !== null || !d) {
          return u;
        }
        let p = d.key;
        s.current?.();
        s.current = n.setTimeout(() => {
          s.current = null;
          t(m => {
            if (m.notifications.current?.key !== p) {
              return m;
            }
            return {
              ...m,
              notifications: {
                ...m.notifications,
                current: null
              }
            };
          });
          a();
        }, d.timeoutMs ?? 8000);
        return {
          ...u,
          notifications: {
            ...u.notifications,
            queue: u.notifications.queue.filter(m => m !== d),
            current: d
          }
        };
      });
    }, [t, s, n]);
    let l = rV.useCallback(u => {
      if (u.pinned) {
        t(d => {
          if (d.notifications.pinned.some(p => p.key === u.key)) {
            return d;
          }
          return {
            ...d,
            notifications: {
              ...d.notifications,
              pinned: [...d.notifications.pinned, u]
            }
          };
        });
        return;
      }
      if (u.priority === "immediate") {
        if (s.current) {
          s.current();
          s.current = null;
        }
        s.current = n.setTimeout(() => {
          s.current = null;
          t(d => {
            if (d.notifications.current?.key !== u.key) {
              return d;
            }
            return {
              ...d,
              notifications: {
                ...d.notifications,
                queue: d.notifications.queue.filter(p => !u.invalidates?.includes(p.key)),
                current: null
              }
            };
          });
          a();
        }, u.timeoutMs ?? 8000);
        t(d => ({
          ...d,
          notifications: {
            ...d.notifications,
            current: u,
            queue: [...(d.notifications.current ? [d.notifications.current] : []), ...d.notifications.queue].filter(p => M7i(p, u))
          }
        }));
        return;
      }
      t(d => {
        if (u.fold) {
          if (d.notifications.current?.key === u.key) {
            let g = u.fold(d.notifications.current, u);
            if (s.current) {
              s.current();
              s.current = null;
            }
            let y = g.key;
            s.current = n.setTimeout(() => {
              s.current = null;
              t(_ => {
                if (_.notifications.current?.key !== y) {
                  return _;
                }
                return {
                  ..._,
                  notifications: {
                    ..._.notifications,
                    current: null
                  }
                };
              });
              a();
            }, g.timeoutMs ?? 8000);
            return {
              ...d,
              notifications: {
                ...d.notifications,
                current: g
              }
            };
          }
          let h = d.notifications.queue.findIndex(g => g.key === u.key);
          if (h !== -1) {
            let g = u.fold(d.notifications.queue[h], u);
            let y = [...d.notifications.queue];
            y[h] = g;
            return {
              ...d,
              notifications: {
                ...d.notifications,
                queue: y
              }
            };
          }
        }
        if (!(!new Set(d.notifications.queue.map(h => h.key)).vZc(u.key) && d.notifications.current?.key !== u.key)) {
          return d;
        }
        let f = d.notifications.current !== null && u.invalidates?.includes(d.notifications.current.key);
        if (f && s.current) {
          s.current();
          s.current = null;
        }
        return {
          ...d,
          notifications: {
            ...d.notifications,
            current: f ? null : d.notifications.current,
            queue: [...d.notifications.queue.filter(h => M7i(h, u)), u]
          }
        };
      });
      a();
    }, [t, a, s, n]);
    let c = rV.useCallback(u => {
      t(d => {
        let p = ojt(d.notifications, u);
        if (p === d.notifications) {
          return d;
        }
        if (d.notifications.current?.key === u && s.current) {
          s.current();
          s.current = null;
        }
        return {
          ...d,
          notifications: p
        };
      });
      a();
    }, [t, a, s]);
    rV.useEffect(() => {
      if (i.current++, e.getState().notifications.queue.length > 0) {
        a();
      }
      return () => {
        if (i.current--, i.current === 0 && s.current) {
          s.current();
          s.current = null;
        }
      };
    }, []);
    return {
      addNotification: l,
      removeNotification: c
    };
  }
  function M7i(e, t) {
    return (e.priority !== "immediate" || e.requeueOnPreempt === true) && !t.invalidates?.includes(e.key);
  }
  function VXd(e) {
    if (e.length === 0) {
      return;
    }
    return e.reduce((t, n) => rjt[n.priority] < rjt[t.priority] ? n : t);
  }
  var rV;
  var L7i;
  var N7i;
  var rjt;
  var Nd = __lazy(() => {
    ho();
    zWe();
    rV = __toESM(ot(), 1);
    L7i = __toESM(ie(), 1);
    N7i = rV.createContext(null);
    rjt = {
      immediate: 0,
      high: 1,
      medium: 2,
      low: 3
    };
  });
  var k1n;
  var zXd;
  var KXd;
  var YXd;
  var U7i;
  var Mct;
  var A1n = __lazy(() => {
    Cs();
    k1n = Wt();
    zXd = k1n === "windows" || k1n === "wsl";
    KXd = zXd ? "alt+v" : "ctrl+v";
    YXd = k1n !== "windows" || (X4() ? rQr("1.4.0", ">=1.2.23") : rQr(process.versions.node, ">=22.17.0 <23.0.0 || >=24.2.0"));
    U7i = YXd ? "shift+tab" : "meta+m";
    Mct = [{
      context: "Global",
      bindings: {
        "ctrl+c": "app:interrupt",
        "ctrl+d": "app:exit",
        "ctrl+t": "app:toggleTodos",
        "ctrl+o": "app:toggleTranscript",
        "ctrl+shift+b": "app:toggleBrief",
        "ctrl+r": "history:search",
        ...{},
        ...{
          "ctrl+]": "app:openArtifact"
        }
      }
    }, {
      context: "Chat",
      bindings: {
        escape: "chat:cancel",
        "ctrl+l": "chat:clearInput",
        "cmd+k": "chat:clearScreen",
        "ctrl+x ctrl+k": "chat:killAgents",
        [U7i]: "chat:cycleMode",
        "meta+p": "chat:modelPicker",
        "meta+o": "chat:fastMode",
        "meta+t": "chat:thinkingToggle",
        "meta+w": "chat:workflowKeywordToggle",
        enter: "chat:submit",
        "ctrl+j": "chat:newline",
        up: "history:previous",
        down: "history:next",
        "ctrl+_": "chat:undo",
        "ctrl+-": "chat:undo",
        "ctrl+shift+-": "chat:undo",
        "ctrl+shift+_": "chat:undo",
        "ctrl+x ctrl+e": "chat:externalEditor",
        "ctrl+g": "chat:externalEditor",
        "ctrl+s": "chat:stash",
        [KXd]: "chat:imagePaste",
        ...(k1n === "wsl" && {
          "ctrl+v": "chat:imagePaste"
        }),
        ...{
          space: "voice:pushToTalk"
        }
      }
    }, {
      context: "Autocomplete",
      bindings: {
        tab: "autocomplete:accept",
        escape: "autocomplete:dismiss",
        up: "autocomplete:previous",
        down: "autocomplete:next"
      }
    }, {
      context: "Settings",
      bindings: {
        escape: "confirm:no",
        up: "select:previous",
        down: "select:next",
        k: "select:previous",
        j: "select:next",
        "ctrl+p": "select:previous",
        "ctrl+n": "select:next",
        space: "select:accept",
        enter: "select:accept",
        "/": "settings:search",
        r: "settings:retry",
        d: "settings:periodDay",
        w: "settings:periodWeek",
        t: "settings:sortByTokens",
        "ctrl+u": "scroll:halfPageUp",
        "ctrl+d": "scroll:halfPageDown"
      }
    }, {
      context: "Doctor",
      bindings: {
        f: "doctor:fix"
      }
    }, {
      context: "Confirmation",
      bindings: {
        y: "confirm:yes",
        n: "confirm:no",
        enter: "confirm:yes",
        escape: "confirm:no",
        up: "confirm:previous",
        down: "confirm:next",
        tab: "confirm:nextField",
        space: "confirm:toggle",
        [U7i]: "confirm:cycleMode",
        "ctrl+e": "confirm:toggleExplanation"
      }
    }, {
      context: "Tabs",
      bindings: {
        tab: "tabs:next",
        "shift+tab": "tabs:previous",
        right: "tabs:next",
        left: "tabs:previous"
      }
    }, {
      context: "Transcript",
      bindings: {
        "ctrl+e": "transcript:toggleShowAll",
        "ctrl+c": "transcript:exit",
        escape: "transcript:exit",
        q: "transcript:exit",
        "ctrl+u": "scroll:halfPageUp",
        "ctrl+d": "scroll:halfPageDown",
        "ctrl+b": "scroll:fullPageUp",
        "ctrl+f": "scroll:fullPageDown",
        "ctrl+n": "scroll:lineDown",
        "ctrl+p": "scroll:lineUp",
        g: "scroll:top",
        "shift+g": "scroll:bottom",
        j: "scroll:lineDown",
        k: "scroll:lineUp",
        space: "scroll:fullPageDown",
        b: "scroll:fullPageUp",
        up: "scroll:lineUp",
        down: "scroll:lineDown",
        home: "scroll:top",
        end: "scroll:bottom"
      }
    }, {
      context: "HistorySearch",
      bindings: {
        "ctrl+r": "historySearch:next",
        escape: "historySearch:accept",
        tab: "historySearch:accept",
        "ctrl+c": "historySearch:cancel",
        enter: "historySearch:execute",
        "ctrl+s": "historySearch:cycleScope"
      }
    }, {
      context: "Task",
      bindings: {
        "ctrl+x ctrl+b": "task:background",
        "ctrl+b": "task:background"
      }
    }, {
      context: "ThemePicker",
      bindings: {
        "ctrl+t": "theme:toggleSyntaxHighlighting",
        "ctrl+e": "theme:editCustom"
      }
    }, {
      context: "Scroll",
      bindings: {
        pageup: "scroll:pageUp",
        pagedown: "scroll:pageDown",
        wheelup: "scroll:lineUp",
        wheeldown: "scroll:lineDown",
        "ctrl+home": "scroll:top",
        "ctrl+end": "scroll:bottom",
        "ctrl+shift+c": "selection:copy",
        "cmd+c": "selection:copy",
        "shift+left": "selection:extendLeft",
        "shift+right": "selection:extendRight",
        "shift+up": "selection:extendUp",
        "shift+down": "selection:extendDown",
        "shift+home": "selection:extendLineStart",
        "shift+end": "selection:extendLineEnd"
      }
    }, {
      context: "Help",
      bindings: {
        escape: "help:dismiss"
      }
    }, {
      context: "Attachments",
      bindings: {
        right: "attachments:next",
        left: "attachments:previous",
        backspace: "attachments:remove",
        delete: "attachments:remove",
        down: "attachments:exit",
        escape: "attachments:exit"
      }
    }, {
      context: "Footer",
      bindings: {
        up: "footer:up",
        "ctrl+p": "footer:up",
        down: "footer:down",
        "ctrl+n": "footer:down",
        right: "footer:next",
        left: "footer:previous",
        enter: "footer:openSelected",
        escape: "footer:clearSelection",
        x: "footer:close"
      }
    }, {
      context: "MessageSelector",
      bindings: {
        up: "messageSelector:up",
        down: "messageSelector:down",
        k: "messageSelector:up",
        j: "messageSelector:down",
        "ctrl+p": "messageSelector:up",
        "ctrl+n": "messageSelector:down",
        "ctrl+up": "messageSelector:top",
        "shift+up": "messageSelector:top",
        "meta+up": "messageSelector:top",
        "shift+k": "messageSelector:top",
        "ctrl+down": "messageSelector:bottom",
        "shift+down": "messageSelector:bottom",
        "meta+down": "messageSelector:bottom",
        "shift+j": "messageSelector:bottom",
        enter: "messageSelector:select"
      }
    }, {
      context: "DiffDialog",
      bindings: {
        escape: "diff:dismiss",
        left: "diff:previousSource",
        right: "diff:nextSource",
        up: "diff:previousFile",
        down: "diff:nextFile",
        enter: "diff:viewDetails",
        j: "diff:nextFile",
        k: "diff:previousFile",
        pageup: "scroll:pageUp",
        pagedown: "scroll:pageDown",
        space: "scroll:fullPageDown",
        "shift+space": "scroll:fullPageUp",
        b: "scroll:fullPageUp",
        g: "scroll:top",
        "shift+g": "scroll:bottom",
        home: "scroll:top",
        end: "scroll:bottom"
      }
    }, {
      context: "ModelPicker",
      bindings: {
        left: "modelPicker:decreaseEffort",
        right: "modelPicker:increaseEffort",
        s: "modelPicker:thisSessionOnly"
      }
    }, {
      context: "Select",
      bindings: {
        up: "select:previous",
        down: "select:next",
        j: "select:next",
        k: "select:previous",
        "ctrl+n": "select:next",
        "ctrl+p": "select:previous",
        pageup: "select:pageUp",
        pagedown: "select:pageDown",
        home: "select:first",
        end: "select:last",
        enter: "select:accept",
        escape: "select:cancel"
      }
    }, {
      context: "Plugin",
      bindings: {
        space: "plugin:toggle",
        i: "plugin:install",
        f: "plugin:favorite"
      }
    }];
  });
  function ZWe(e) {
    let t = e.split("+");
    let n = {
      key: "",
      ctrl: false,
      alt: false,
      shift: false,
      meta: false,
      super: false
    };
    for (let r of t) {
      let o = r.toLowerCase();
      switch (o) {
        case "ctrl":
        case "control":
          n.ctrl = true;
          break;
        case "alt":
        case "opt":
        case "option":
          n.alt = true;
          break;
        case "shift":
          n.shift = true;
          break;
        case "meta":
          n.meta = true;
          break;
        case "cmd":
        case "command":
        case "super":
        case "win":
          n.super = true;
          break;
        case "esc":
          n.key = "escape";
          break;
        case "return":
          n.key = "enter";
          break;
        case "del":
          n.key = "delete";
          break;
        case "space":
          n.key = " ";
          break;
        case "\u2191":
          n.key = "up";
          break;
        case "\u2193":
          n.key = "down";
          break;
        case "\u2190":
          n.key = "left";
          break;
        case "\u2192":
          n.key = "right";
          break;
        default:
          n.key = o;
          break;
      }
    }
    return n;
  }
  function hG(e) {
    if (e === " ") {
      return [ZWe("space")];
    }
    return e.trim().split(/\s+/).map(ZWe);
  }
  function JXd(e) {
    let t = [];
    if (e.ctrl) {
      t.push("ctrl");
    }
    if (e.alt) {
      t.push("alt");
    }
    if (e.shift) {
      t.push("shift");
    }
    if (e.meta) {
      t.push("meta");
    }
    if (e.super) {
      t.push("cmd");
    }
    let n = B7i(e.key);
    t.push(n);
    return t.join("+");
  }
  function B7i(e) {
    switch (e) {
      case "escape":
        return "Esc";
      case " ":
        return "space";
      case "tab":
        return "tab";
      case "enter":
        return "Enter";
      case "backspace":
        return "Backspace";
      case "delete":
        return "Delete";
      case "up":
        return "\u2191";
      case "down":
        return "\u2193";
      case "left":
        return "\u2190";
      case "right":
        return "\u2192";
      case "pageup":
        return "PageUp";
      case "pagedown":
        return "PageDown";
      case "home":
        return "Home";
      case "end":
        return "End";
      default:
        return e;
    }
  }
  function ZJ(e) {
    return e.map(JXd).join(" ");
  }
  function nro(e, t = "linux") {
    let n = [];
    if (e.ctrl) {
      n.push("ctrl");
    }
    if (e.alt || e.meta) {
      n.push(t === "macos" ? "opt" : "alt");
    }
    if (e.shift) {
      n.push("shift");
    }
    if (e.super) {
      n.push(t === "macos" ? "cmd" : "super");
    }
    let r = B7i(e.key);
    n.push(r);
    return n.join("+");
  }
  function $7i(e, t = "linux") {
    return e.map(n => nro(n, t)).join(" ");
  }
  function I1n(e) {
    let t = [];
    for (let n of e) {
      for (let [r, o] of Object.entries(n.bindings)) {
        t.push({
          chord: hG(r),
          action: o,
          context: n.context
        });
      }
    }
    return t;
  }
  function H7i() {
    let e = Wt();
    let t = [...ijt, ...rro];
    if (e === "macos") {
      t.push(...oro);
    }
    return t;
  }
  function eGe(e) {
    if (e === " ") {
      return "space";
    }
    return e.trim().split(/\s+/).map(QXd).join(" ");
  }
  function QXd(e) {
    let t = e.split("+");
    let n = [];
    let r = "";
    for (let o of t) {
      let s = o.trim().toLowerCase();
      if (["ctrl", "control", "alt", "opt", "option", "meta", "cmd", "command", "super", "win", "shift"].includes(s)) {
        if (s === "control") {
          n.push("ctrl");
        } else if (s === "option" || s === "opt" || s === "meta") {
          n.push("alt");
        } else if (s === "command" || s === "cmd" || s === "super" || s === "win") {
          n.push("cmd");
        } else {
          n.push(s);
        }
      } else {
        r = XXd[s] ?? s;
      }
    }
    n.sort();
    return [...n, r].join("+");
  }
  var ijt;
  var rro;
  var oro;
  var XXd;
  var P1n = __lazy(() => {
    Cs();
    ijt = [{
      key: "ctrl+c",
      reason: "Cannot be rebound - used for interrupt/exit (hardcoded)",
      severity: "error"
    }, {
      key: "ctrl+d",
      reason: "Cannot be rebound - used for exit (hardcoded)",
      severity: "error"
    }, {
      key: "ctrl+m",
      reason: "Cannot be rebound - identical to Enter in terminals (both send CR)",
      severity: "error"
    }, {
      key: "capslock",
      reason: "Caps Lock is not delivered to terminal applications",
      severity: "error"
    }];
    rro = [{
      key: "ctrl+z",
      reason: "Unix process suspend (SIGTSTP)",
      severity: "warning"
    }, {
      key: "ctrl+\\",
      reason: "Terminal quit signal (SIGQUIT)",
      severity: "error"
    }];
    oro = [{
      key: "cmd+c",
      reason: "macOS system copy",
      severity: "error"
    }, {
      key: "cmd+v",
      reason: "macOS system paste",
      severity: "error"
    }, {
      key: "cmd+x",
      reason: "macOS system cut",
      severity: "error"
    }, {
      key: "cmd+q",
      reason: "macOS quit application",
      severity: "error"
    }, {
      key: "cmd+w",
      reason: "macOS close window/tab",
      severity: "error"
    }, {
      key: "cmd+tab",
      reason: "macOS app switcher",
      severity: "error"
    }, {
      key: "cmd+space",
      reason: "macOS Spotlight",
      severity: "error"
    }];
    XXd = {
      esc: "escape",
      return: "enter",
      del: "delete",
      "\u2191": "up",
      "\u2193": "down",
      "\u2190": "left",
      "\u2192": "right",
      caps: "capslock",
      "caps-lock": "capslock",
      caps_lock: "capslock"
    };
  });
  function j7i(e) {
    return ZXd.vZc(e);
  }
  var Nct;
  var ZXd;
  var q7i;
  var sro;
  var eQd;
  var eSy;
  var O1n = __lazy(() => {
    Nct = ["Global", "Chat", "Autocomplete", "Confirmation", "Help", "Transcript", "HistorySearch", "Task", "ThemePicker", "Settings", "Tabs", "Attachments", "Footer", "MessageSelector", "DiffDialog", "ModelPicker", "Select", "Plugin", "Scroll", "Doctor"];
    ZXd = new Set(Nct);
    q7i = {
      Global: "Active everywhere, regardless of focus",
      Chat: "When the chat input is focused",
      Autocomplete: "When autocomplete menu is visible",
      Confirmation: "When a confirmation/permission dialog is shown",
      Help: "When the help overlay is open",
      Transcript: "When viewing the transcript",
      HistorySearch: "When searching command history (ctrl+r)",
      Task: "When a task/agent is running in the foreground",
      ThemePicker: "When the theme picker is open",
      Settings: "When the settings menu is open",
      Tabs: "When tab navigation is active",
      Attachments: "When navigating image attachments in a select dialog",
      Footer: "When footer indicators are focused",
      MessageSelector: "When the message selector (rewind) is open",
      DiffDialog: "When the diff dialog is open",
      ModelPicker: "When the model picker is open",
      Select: "When a select/list component is focused",
      Plugin: "When the plugin dialog is open",
      Scroll: "When a scrollable view is focused (fullscreen layout)",
      Doctor: "When the /doctor diagnostics screen is open"
    };
    sro = ["app:interrupt", "app:exit", "app:toggleTodos", "app:toggleTranscript", "app:toggleBrief", "app:toggleReplTab", "app:toggleDiffNoiseFilter", "app:toggleTerminal", "app:redraw", "app:openArtifact", "history:search", "history:previous", "history:next", "chat:cancel", "chat:killAgents", "chat:cycleMode", "chat:modelPicker", "chat:fastMode", "chat:thinkingToggle", "chat:workflowKeywordToggle", "chat:submit", "chat:newline", "chat:undo", "chat:externalEditor", "chat:stash", "chat:imagePaste", "chat:clearInput", "chat:clearScreen", "autocomplete:accept", "autocomplete:dismiss", "autocomplete:previous", "autocomplete:next", "confirm:yes", "confirm:no", "confirm:previous", "confirm:next", "confirm:nextField", "confirm:previousField", "confirm:cycleMode", "confirm:toggle", "confirm:toggleExplanation", "tabs:next", "tabs:previous", "transcript:toggleShowAll", "transcript:exit", "historySearch:next", "historySearch:accept", "historySearch:cancel", "historySearch:execute", "historySearch:cycleScope", "task:background", "theme:toggleSyntaxHighlighting", "theme:editCustom", "help:dismiss", "attachments:next", "attachments:previous", "attachments:remove", "attachments:exit", "footer:up", "footer:down", "footer:next", "footer:previous", "footer:openSelected", "footer:clearSelection", "footer:close", "messageSelector:up", "messageSelector:down", "messageSelector:top", "messageSelector:bottom", "messageSelector:select", "diff:dismiss", "diff:previousSource", "diff:nextSource", "diff:back", "diff:viewDetails", "diff:previousFile", "diff:nextFile", "modelPicker:decreaseEffort", "modelPicker:increaseEffort", "modelPicker:thisSessionOnly", "select:next", "select:previous", "select:pageUp", "select:pageDown", "select:first", "select:last", "select:accept", "select:cancel", "plugin:toggle", "plugin:install", "plugin:favorite", "doctor:fix", "permission:toggleDebug", "settings:search", "settings:retry", "settings:periodDay", "settings:periodWeek", "settings:sortByTokens", "voice:pushToTalk", "scroll:pageUp", "scroll:pageDown", "scroll:lineUp", "scroll:lineDown", "scroll:top", "scroll:bottom", "scroll:halfPageUp", "scroll:halfPageDown", "scroll:fullPageUp", "scroll:fullPageDown", "selection:copy", "selection:clear", "selection:extendLeft", "selection:extendRight", "selection:extendUp", "selection:extendDown", "selection:extendLineStart", "selection:extendLineEnd"];
    eQd = we(() => v.object({
      context: v.enum(Nct).describe("UI context where these bindings apply. Global bindings work everywhere."),
      bindings: v.record(v.string().describe('Keystroke pattern (e.g., "ctrl+k", "shift+tab")'), v.union([v.enum(sro), v.string().regex(/^command:[a-zA-Z0-9:\-_]+$/).describe('Command binding (e.g., "command:help", "command:compact"). Executes the slash command as if typed.'), v.null().describe("Set to null to unbind a default shortcut")]).describe("Action to trigger, command to invoke, or null to unbind")).describe("Map of keystroke patterns to actions")
    }).describe("A block of keybindings for a specific context"));
    eSy = we(() => v.object({
      $schema: v.string().optional().describe("JSON Schema URL for editor validation"),
      $docs: v.string().optional().describe("Documentation URL"),
      bindings: v.array(eQd()).describe("Array of keybinding blocks by context")
    }).describe("Claude Code keybindings configuration. Customize keyboard shortcuts by context."));
  });
  function nQd(e) {
    return tQd().safeParse(e).success;
  }
  function D1n(e) {
    return Array.isArray(e) && e.every(nQd);
  }
  function rQd(e) {
    return Nct.includes(e);
  }
  function oQd(e) {
    let t = e.toLowerCase().split("+");
    for (let r of t) {
      if (!r.trim()) {
        return {
          type: "parse_error",
          severity: "error",
          message: `Empty key part in "${e}"`,
          key: e,
          suggestion: 'Remove extra "+" characters'
        };
      }
    }
    let n = ZWe(e);
    if (!n.key && !n.ctrl && !n.alt && !n.shift && !n.meta && !n.super) {
      return {
        type: "parse_error",
        severity: "error",
        message: `Could not parse keystroke "${e}"`,
        key: e
      };
    }
    return null;
  }
  function sQd(e, t) {
    let n = [];
    if (typeof e !== "object" || e === null) {
      n.push({
        type: "parse_error",
        severity: "error",
        message: `Keybinding block ${t + 1} is not an object`
      });
      return n;
    }
    let r = e;
    let o = r.context;
    let s;
    if (typeof o !== "string") {
      n.push({
        type: "parse_error",
        severity: "error",
        message: `Keybinding block ${t + 1} missing "context" field`
      });
    } else if (!rQd(o)) {
      n.push({
        type: "invalid_context",
        severity: "error",
        message: `Unknown context "${o}"`,
        context: o,
        suggestion: `Valid contexts: ${Nct.join(", ")}`
      });
    } else {
      s = o;
    }
    if (typeof r.bindings !== "object" || r.bindings === null) {
      n.push({
        type: "parse_error",
        severity: "error",
        message: `Keybinding block ${t + 1} missing "bindings" field`
      });
      return n;
    }
    let i = r.bindings;
    for (let [a, l] of Object.entries(i)) {
      let c = oQd(a);
      if (c) {
        c.context = s;
        n.push(c);
      }
      if (l !== null && typeof l !== "string") {
        n.push({
          type: "invalid_action",
          severity: "error",
          message: `Invalid action for "${a}": must be a string or null`,
          key: a,
          context: s
        });
      } else if (typeof l === "string" && l.startsWith("command:")) {
        if (!/^command:[a-zA-Z0-9:\-_]+$/.test(l)) {
          n.push({
            type: "invalid_action",
            severity: "warning",
            message: `Invalid command binding "${l}" for "${a}": command name may only contain alphanumeric characters, colons, hyphens, and underscores`,
            key: a,
            context: s,
            action: l
          });
        }
        if (s && s !== "Chat") {
          n.push({
            type: "invalid_action",
            severity: "warning",
            message: `Command binding "${l}" must be in "Chat" context, not "${s}"`,
            key: a,
            context: s,
            action: l,
            suggestion: 'Move this binding to a block with "context": "Chat"'
          });
        }
      } else if (l === "voice:pushToTalk") {
        let u = hG(a)[0];
        if (u && !u.ctrl && !u.alt && !u.shift && !u.meta && !u.super && /^[a-z]$/.test(u.key)) {
          n.push({
            type: "invalid_action",
            severity: "warning",
            message: `Binding "${a}" to voice:pushToTalk prints into the input during warmup; use space or a modifier combo like meta+k`,
            key: a,
            context: s,
            action: l
          });
        }
      }
    }
    return n;
  }
  function iro(e) {
    let t = [];
    let n = /"bindings"\s*:\s*\{([^{}]*(?:\{[^{}]*\}[^{}]*)*)\}/g;
    let r;
    while ((r = n.exec(e)) !== null) {
      let o = r[1];
      if (!o) {
        continue;
      }
      let a = e.slice(0, r.index).match(/"context"\s*:\s*"([^"]+)"[^{]*$/)?.[1] ?? "unknown";
      let l = /"([^"]+)"\s*:/g;
      let c = new Map();
      let u;
      while ((u = l.exec(o)) !== null) {
        let d = u[1];
        if (!d) {
          continue;
        }
        let p = (c.get(d) ?? 0) + 1;
        if (c.set(d, p), p === 2) {
          t.push({
            type: "duplicate",
            severity: "warning",
            message: `Duplicate key "${d}" in ${a} bindings`,
            key: d,
            context: a,
            suggestion: "This key appears multiple times in the same context. JSON uses the last value, earlier values are ignored."
          });
        }
      }
    }
    return t;
  }
  function iQd(e) {
    let t = [];
    if (!Array.isArray(e)) {
      t.push({
        type: "parse_error",
        severity: "error",
        message: "keybindings.json must contain an array",
        suggestion: "Wrap your bindings in [ ]"
      });
      return t;
    }
    for (let n = 0; n < e.length; n++) {
      t.push(...sQd(e[n], n));
    }
    return t;
  }
  function aQd(e) {
    let t = [];
    let n = new Map();
    for (let r of e) {
      let o = n.get(r.context) ?? new Map();
      n.set(r.context, o);
      for (let [s, i] of Object.entries(r.bindings)) {
        let a = eGe(s);
        let l = o.get(a);
        if (l && l !== i) {
          t.push({
            type: "duplicate",
            severity: "warning",
            message: `Duplicate binding "${s}" in ${r.context} context`,
            key: s,
            context: r.context,
            action: i ?? "null (unbind)",
            suggestion: `Previously bound to "${l}". Only the last binding will be used.`
          });
        }
        o.set(a, i ?? "null");
      }
    }
    return t;
  }
  function lQd(e) {
    let t = [];
    let n = H7i();
    for (let r of e) {
      let o = ZJ(r.chord);
      let s = eGe(o);
      for (let i of n) {
        if (eGe(i.key) === s) {
          t.push({
            type: "reserved",
            severity: i.severity,
            message: `"${o}" may not work: ${i.reason}`,
            key: o,
            context: r.context,
            action: r.action ?? undefined
          });
        }
      }
    }
    return t;
  }
  function cQd(e) {
    let t = [];
    for (let n of e) {
      for (let [r, o] of Object.entries(n.bindings)) {
        let s = r.split(" ").map(i => ZWe(i));
        t.push({
          chord: s,
          action: o,
          context: n.context
        });
      }
    }
    return t;
  }
  function aro(e, t) {
    let n = [];
    if (n.push(...iQd(e)), D1n(e)) {
      n.push(...aQd(e));
      let o = cQd(e);
      n.push(...lQd(o));
    }
    let r = new Set();
    return n.filter(o => {
      let s = `${o.type}:${o.key}:${o.context}`;
      if (r.vZc(s)) {
        return false;
      }
      r.add(s);
      return true;
    });
  }
  var tQd;
  function oV() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_keybinding_customization_release", true);
  }
  function pQd() {
    let e = {
      bindings: null,
      warnings: [],
      watcher: null,
      initialized: false,
      disposed: false,
      lastCustomBindingsLogDate: null,
      changed: Si(),
      [Symbol.dispose]() {
        if (e.disposed = true, e.watcher) {
          e.watcher.close();
          e.watcher = null;
        }
        e.changed.clear();
      }
    };
    return e;
  }
  function K7i(e, t) {
    let n = new Date().toISOString().slice(0, 10);
    if (e.lastCustomBindingsLogDate === n) {
      return;
    }
    e.lastCustomBindingsLogDate = n;
    logEvent("tengu_custom_keybindings_loaded", {
      user_binding_count: t
    });
  }
  function pSe() {
    return N1n.join(er(), "keybindings.json");
  }
  function lro() {
    return I1n(Mct);
  }
  async function mQd(e) {
    let t = lro();
    if (!oV() || Pc("keybindings")) {
      return {
        bindings: t,
        warnings: []
      };
    }
    let n = pSe();
    try {
      let r = await M1n.readFile(n, "utf-8");
      let o = qt(r);
      let s;
      if (typeof o === "object" && o !== null && "bindings" in o) {
        s = o.bindings;
      } else {
        logForDebugging('[keybindings] Invalid keybindings.json: keybindings.json must have a "bindings" array');
        Ae("keybinding_load_user_config", "keybinding_config_invalid_format");
        return {
          bindings: t,
          warnings: [{
            type: "parse_error",
            severity: "error",
            message: 'keybindings.json must have a "bindings" array',
            suggestion: 'Use format: { "bindings": [ ... ] }'
          }]
        };
      }
      if (!D1n(s)) {
        let u = !Array.isArray(s) ? '"bindings" must be an array' : "keybindings.json contains invalid block structure";
        let d = !Array.isArray(s) ? 'Set "bindings" to an array of keybinding blocks' : 'Each block must have "context" (string) and "bindings" (object mapping keys to a string action or null)';
        logForDebugging(`[keybindings] Invalid keybindings.json: ${u}`);
        Ae("keybinding_load_user_config", "keybinding_config_invalid_structure");
        return {
          bindings: t,
          warnings: [{
            type: "parse_error",
            severity: "error",
            message: u,
            suggestion: d
          }]
        };
      }
      let i = I1n(s);
      logForDebugging(`[keybindings] Loaded ${i.length} user bindings from ${n}`);
      let a = [...t, ...i];
      K7i(e, i.length);
      let c = [...iro(r), ...aro(s, a)];
      if (c.length > 0) {
        logForDebugging(`[keybindings] Found ${c.length} validation issue(s)`);
      }
      Pe("keybinding_load_user_config");
      return {
        bindings: a,
        warnings: c
      };
    } catch (r) {
      if (fn(r)) {
        Pe("keybinding_load_user_config");
        return {
          bindings: t,
          warnings: []
        };
      }
      logForDebugging(`[keybindings] Error loading ${n}: ${he(r)}`);
      Ae("keybinding_load_user_config", "keybinding_config_parse_error");
      return {
        bindings: t,
        warnings: [{
          type: "parse_error",
          severity: "error",
          message: `Failed to parse keybindings.json: ${he(r)}`
        }]
      };
    }
  }
  function L1n(e) {
    if (e.bindings) {
      return e.bindings;
    }
    return ajt(e).bindings;
  }
  function ajt(e) {
    if (e.bindings) {
      return {
        bindings: e.bindings,
        warnings: e.warnings
      };
    }
    let t = lro();
    if (!oV() || Pc("keybindings")) {
      e.bindings = t;
      e.warnings = [];
      return {
        bindings: e.bindings,
        warnings: e.warnings
      };
    }
    let n = pSe();
    try {
      let r = z7i.readFileSync(n, "utf-8");
      let o = qt(r);
      let s;
      if (typeof o === "object" && o !== null && "bindings" in o) {
        s = o.bindings;
      } else {
        Ae("keybinding_load_user_config", "keybinding_config_invalid_format");
        e.bindings = t;
        e.warnings = [{
          type: "parse_error",
          severity: "error",
          message: 'keybindings.json must have a "bindings" array',
          suggestion: 'Use format: { "bindings": [ ... ] }'
        }];
        return {
          bindings: e.bindings,
          warnings: e.warnings
        };
      }
      if (!D1n(s)) {
        let l = !Array.isArray(s) ? '"bindings" must be an array' : "keybindings.json contains invalid block structure";
        let c = !Array.isArray(s) ? 'Set "bindings" to an array of keybinding blocks' : 'Each block must have "context" (string) and "bindings" (object mapping keys to a string action or null)';
        Ae("keybinding_load_user_config", "keybinding_config_invalid_structure");
        e.bindings = t;
        e.warnings = [{
          type: "parse_error",
          severity: "error",
          message: l,
          suggestion: c
        }];
        return {
          bindings: e.bindings,
          warnings: e.warnings
        };
      }
      let i = I1n(s);
      logForDebugging(`[keybindings] Loaded ${i.length} user bindings from ${n}`);
      e.bindings = [...t, ...i];
      K7i(e, i.length);
      let a = iro(r);
      if (e.warnings = [...a, ...aro(s, e.bindings)], e.warnings.length > 0) {
        logForDebugging(`[keybindings] Found ${e.warnings.length} validation issue(s)`);
      }
      Pe("keybinding_load_user_config");
      return {
        bindings: e.bindings,
        warnings: e.warnings
      };
    } catch (r) {
      if (fn(r)) {
        Pe("keybinding_load_user_config");
        e.bindings = t;
        e.warnings = [];
        return {
          bindings: e.bindings,
          warnings: e.warnings
        };
      }
      logForDebugging(`[keybindings] Error loading ${n}: ${he(r)}`);
      Ae("keybinding_load_user_config", "keybinding_config_parse_error");
      e.bindings = t;
      e.warnings = [{
        type: "parse_error",
        severity: "error",
        message: `Failed to parse keybindings.json: ${he(r)}`
      }];
      return {
        bindings: e.bindings,
        warnings: e.warnings
      };
    }
  }
  async function Y7i(e) {
    if (e.initialized || e.disposed) {
      return;
    }
    if (!oV() || Pc("keybindings")) {
      logForDebugging("[keybindings] Skipping file watcher - user customization disabled");
      return;
    }
    let t = pSe();
    let n = N1n.dirname(t);
    try {
      if (!(await M1n.stat(n)).isDirectory()) {
        logForDebugging(`[keybindings] Not watching: ${n} is not a directory`);
        Et("keybinding_watcher_init", "watch_dir_inaccessible");
        return;
      }
    } catch {
      logForDebugging(`[keybindings] Not watching: ${n} does not exist`);
      Et("keybinding_watcher_init", "watch_dir_inaccessible");
      return;
    }
    e.initialized = true;
    logForDebugging(`[keybindings] Watching for changes to ${t}`);
    e.watcher = jF.watch(t, {
      persistent: true,
      ignoreInitial: true,
      awaitWriteFinish: {
        stabilityThreshold: 500,
        pollInterval: 200
      },
      ignorePermissionErrors: true,
      usePolling: true,
      interval: 2000,
      atomic: true
    });
    e.watcher.on("add", r => V7i(e, r));
    e.watcher.on("change", r => V7i(e, r));
    e.watcher.on("unlink", r => fQd(e, r));
    e.watcher.on("error", r => logForDebugging(`[keybindings] watcher error: ${he(r)}`, {
      level: "warn"
    }));
    Ti(e);
    Pe("keybinding_watcher_init");
  }
  async function V7i(e, t) {
    logForDebugging(`[keybindings] Detected change to ${t}`);
    try {
      let n = await mQd(e);
      e.bindings = n.bindings;
      e.warnings = n.warnings;
      e.changed.emit(n);
      Pe("keybinding_hot_reload");
    } catch (n) {
      logForDebugging(`[keybindings] Error reloading: ${he(n)}`);
      Et("keybinding_hot_reload", "keybinding_reload_failed");
    }
  }
  function fQd(e, t) {
    logForDebugging(`[keybindings] Detected deletion of ${t}`);
    let n = lro();
    e.bindings = n;
    e.warnings = [];
    e.changed.emit({
      bindings: n,
      warnings: []
    });
  }
  var z7i;
  var M1n;
  var N1n;
  var pq;
  var xre = __lazy(() => {
    oue();
    ln();
    $n();
    Ot();
    hd();
    wb();
    je();
    gn();
    dt();
    ph();
    A1n();
    z7i = require("fs");
    M1n = require("fs/promises");
    N1n = require("path");
    pq = pQd();
  });
  function J7i(e) {
    return Object.hasOwn(cro, e);
  }
  function X7i(e) {
    return Object.hasOwn(uro, e);
  }
  var cro;
  var uro;
  var dro = __lazy(() => {
    cro = {
      "\u2020": "t"
    };
    uro = {
      π: "alt+p",
      ø: "alt+o"
    };
  });
  function Lct() {
    let e = Wt();
    if (e === "macos") {
      return e;
    }
    if (Me.LC_TERMINAL === "iTerm2" || Me.TERM_PROGRAM === "Apple_Terminal" || Me.TERM_PROGRAM === "iTerm.app") {
      return "macos";
    }
    return e;
  }
  var F1n = __lazy(() => {
    pr();
    Cs();
  });
  function mro(e, t, n) {
    let r = false;
    let o;
    for (let s = 0; s < n.length; s++) {
      let i = n[s];
      if (!i || i.context !== t || i.action !== e) {
        continue;
      }
      r = true;
      let a = false;
      for (let l = s + 1; l < n.length; l++) {
        let c = n[l];
        if (c && c.context === t && pro(c.chord, i.chord)) {
          a = true;
          break;
        }
      }
      if (!a) {
        o = i.chord;
      }
    }
    if (o) {
      return o;
    }
    return r ? null : undefined;
  }
  function Q7i(e, t, n) {
    let r = new Set(t);
    let o = new Map();
    for (let i of n) {
      if (!r.vZc(i.context)) {
        continue;
      }
      let a = o.get(i.context);
      if (a) {
        a.push(i);
      } else {
        o.set(i.context, [i]);
      }
    }
    let s = false;
    for (let i = 0; i < t.length; i++) {
      let a = t[i];
      if (a === undefined) {
        continue;
      }
      let l = o.get(a);
      if (!l) {
        continue;
      }
      let c = false;
      let u;
      for (let d = 0; d < l.length; d++) {
        let p = l[d];
        if (!p || p.action !== e) {
          continue;
        }
        c = true;
        let m = false;
        for (let f = d + 1; f < l.length; f++) {
          let h = l[f];
          if (h && pro(h.chord, p.chord)) {
            m = true;
            break;
          }
        }
        if (!m) {
          u = p.chord;
        }
      }
      if (u) {
        for (let d = 0; d < i; d++) {
          let p = t[d];
          if (p === undefined) {
            continue;
          }
          let m = o.get(p);
          if (!m) {
            continue;
          }
          if (m.some(f => f && pro(f.chord, u))) {
            return null;
          }
        }
        return u;
      }
      if (c) {
        s = true;
      }
    }
    return s ? null : undefined;
  }
  function Z7i(e, t, n) {
    let r = null;
    for (let o of n) {
      if (o.context !== t || o.chord.length !== 1) {
        continue;
      }
      let s = o.chord[0];
      if (s && Fct(s, e)) {
        r = o.action;
      }
    }
    return r;
  }
  function pro(e, t) {
    if (e.length !== t.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      let o = t[n];
      if (!r || !o || !Fct(r, o)) {
        return false;
      }
    }
    return true;
  }
  function U1n(e, t, n) {
    let r = mro(e, t, n);
    return r ? $7i(r, Lct()) : r;
  }
  function eYi(e) {
    let t = e.name === "enter" ? `
` : e.key;
    let n = e.meta;
    if (Wt() === "macos" && !e.meta && !e.ctrl && J7i(t)) {
      t = cro[t];
      n = true;
    }
    let r = hQd[e.name] ?? (t.length === 1 ? t.toLowerCase() : null);
    if (!r) {
      return null;
    }
    let o = e.shift || t.length === 1 && t !== t.toLowerCase() && t === t.toUpperCase();
    return {
      key: r,
      ctrl: e.ctrl,
      alt: n,
      shift: o,
      meta: n,
      super: e.superKey
    };
  }
  function Fct(e, t) {
    return e.key === t.key && e.ctrl === t.ctrl && e.shift === t.shift && (e.alt || e.meta) === (t.alt || t.meta) && e.super === t.super;
  }
  function tYi(e, t) {
    if (e.length >= t.chord.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      let o = t.chord[n];
      if (!r || !o) {
        return false;
      }
      if (!Fct(r, o)) {
        return false;
      }
    }
    return true;
  }
  function nYi(e, t) {
    if (e.length !== t.chord.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      let o = t.chord[n];
      if (!r || !o) {
        return false;
      }
      if (!Fct(r, o)) {
        return false;
      }
    }
    return true;
  }
  function ljt(e, t, n, r) {
    if (e.name === "escape" && r !== null) {
      return {
        type: "chord_cancelled"
      };
    }
    let o = eYi(e);
    if (!o) {
      if (r !== null) {
        return {
          type: "chord_cancelled"
        };
      }
      return {
        type: "none"
      };
    }
    let s = r ? [...r, o] : [o];
    let i = new Set(t);
    let a = n.filter(d => i.vZc(d.context));
    let l = new Map();
    for (let d of a) {
      if (d.chord.length > s.length && tYi(s, d)) {
        l.set(ZJ(d.chord), d.action);
      }
    }
    let c = false;
    for (let d of l.values()) {
      if (d !== null) {
        c = true;
        break;
      }
    }
    if (c) {
      return {
        type: "chord_started",
        pending: s
      };
    }
    let u;
    for (let d of a) {
      if (nYi(s, d)) {
        u = d;
      }
    }
    if (u) {
      if (u.action === null) {
        return {
          type: "unbound"
        };
      }
      return {
        type: "match",
        action: u.action
      };
    }
    if (r !== null) {
      return {
        type: "chord_cancelled"
      };
    }
    return {
      type: "none"
    };
  }
  function B1n(e, t, n, r) {
    if (e.name === "escape" && r !== null) {
      return {
        type: "chord_cancelled"
      };
    }
    let o = eYi(e);
    if (!o) {
      if (r !== null) {
        return {
          type: "chord_cancelled"
        };
      }
      return {
        type: "none"
      };
    }
    let s = r ? [...r, o] : [o];
    let i = new Set(t);
    let a = new Map();
    let l = new Map();
    for (let c of n) {
      if (!i.vZc(c.context)) {
        continue;
      }
      if (c.chord.length > s.length) {
        if (tYi(s, c)) {
          a.set(ZJ(c.chord), c.action);
        }
      } else if (nYi(s, c)) {
        l.set(c.context, c);
      }
    }
    for (let c of a.values()) {
      if (c !== null) {
        return {
          type: "chord_started",
          pending: s
        };
      }
    }
    for (let c of t) {
      let u = l.get(c);
      if (u) {
        if (u.action === null) {
          return {
            type: "unbound"
          };
        }
        return {
          type: "match",
          action: u.action
        };
      }
    }
    if (r !== null) {
      return {
        type: "chord_cancelled"
      };
    }
    return {
      type: "none"
    };
  }
  var hQd;
  var BPe = __lazy(() => {
    dro();
    Cs();
    F1n();
    hQd = {
      escape: "escape",
      return: "enter",
      tab: "tab",
      backspace: "backspace",
      delete: "delete",
      up: "up",
      down: "down",
      left: "left",
      right: "right",
      pageup: "pageup",
      pagedown: "pagedown",
      wheelup: "wheelup",
      wheeldown: "wheeldown",
      home: "home",
      end: "end"
    };
  });
  function dx(e, t, n) {
    let r = L1n(pq);
    let o = U1n(e, t, r);
    if (o === undefined) {
      let s = `${e}:${t}`;
      if (!rYi.vZc(s)) {
        rYi.add(s);
        logEvent("tengu_keybinding_fallback_used", {
          action: e,
          context: t,
          fallback: n,
          reason: "action_not_found"
        });
      }
      return n;
    }
    return o === null ? "" : o;
  }
  var rYi;
  var kre = __lazy(() => {
    Ot();
    xre();
    BPe();
    rYi = new Set();
  });
  var fro = {};
  __export(fro, {
    sharp: () => sharp,
    getNativeModule: () => getNativeModule,
    default: () => sharp
  });
  function getNativeModule() {
    if (oYi) {
      return $1n;
    }
    oYi = true;
    try {
      $1n = His();
    } catch {
      $1n = null;
    }
    return $1n;
  }
  function sharp(e) {
    let t = [];
    async function n(o) {
      let s = getNativeModule();
      if (!s) {
        throw Error("Native image processor module not available");
      }
      let i = await s.processImage(e);
      if (o) {
        for (let a of t) {
          a(i);
        }
      }
      return i;
    }
    let r = {
      async metadata() {
        let o = await n(false);
        try {
          return o.metadata();
        } finally {
          o.dispose?.();
        }
      },
      resize(o, s, i) {
        t.push(a => {
          a.resize(o, s, i);
        });
        return r;
      },
      jpeg(o) {
        t.push(s => {
          s.jpeg(o?.quality);
        });
        return r;
      },
      png(o) {
        t.push(s => {
          s.png(o);
        });
        return r;
      },
      webp(o) {
        t.push(s => {
          s.webp(o?.quality);
        });
        return r;
      },
      async toBuffer() {
        let o = await n(true);
        try {
          return await o.toBuffer();
        } finally {
          o.dispose?.();
        }
      }
    };
    return r;
  }
  var $1n = null;
  var oYi = false;