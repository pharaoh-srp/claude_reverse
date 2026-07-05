  __export(xGi, {
    watchSystemTheme: () => watchSystemTheme,
    _resetInitialProbeForTesting: () => _resetInitialProbeForTesting
  });
  function _resetInitialProbeForTesting() {
    OMn = undefined;
  }
  function watchSystemTheme(e, t, n) {
    let r = false;
    let o = false;
    let s = n?.muxTimeoutMs ?? 2000;
    let i = Boolean(process.env.TMUX || process.env.STY) && !are();
    async function a() {
      if (o) {
        return;
      }
      o = true;
      try {
        let d = yGi(Wh.SET_BG_COLOR);
        let p = i ? {
          ...d,
          request: s0(d.request)
        } : d;
        let m;
        let f = i ? "dcs" : "direct";
        if (i) {
          if (m = await Promise.race([e.send(p), sleep(s, undefined, {
            unref: true
          }).then(() => {
            return;
          })]), !m) {
            if (r) {
              e.cancel(p);
            } else {
              e.flush();
              f = "mux-bare";
              [m] = await Promise.all([e.send(d), e.flush()]);
            }
          }
        } else {
          [m] = await Promise.all([e.send(p), e.flush()]);
        }
        if (r) {
          return;
        }
        if (!m) {
          logForDebugging(`systemTheme: OSC 11 query (via=${f}) got no response`, {
            level: "debug"
          });
          OMn = false;
          return;
        }
        OMn = true;
        let h = jWi(m.data);
        if (logForDebugging(`systemTheme: OSC 11 response=${m.data} detected=${h} via=${f}`, {
          level: "debug"
        }), h === undefined) {
          return;
        }
        TMn(h);
        t(h);
      } finally {
        o = false;
      }
    }
    let l = process.env.CLAUDE_BG_BACKEND === "daemon";
    if (OMn !== false && !l) {
      a();
    }
    let c = bGi(() => void a());
    let u = l ? EWe(() => {
      if (nre() === "focused") {
        a();
      }
    }) : undefined;
    return () => {
      r = true;
      c();
      u?.();
    };
  }
  var OMn;
  var kGi = __lazy(() => {
    vWe();
    PMn();
    jZr();
    Tg();
    je();
    zp();
    NJ();
  });
  function VZr() {
    return uc("theme", "dark").value;
  }
  function K6d(e) {
    Mk("theme", e);
  }
  function ThemeProvider({
    children: e,
    initialState: t,
    onThemeSave: n = K6d
  }) {
    let [r, o] = lx.useState(t ?? VZr);
    let [s, i] = lx.useState(null);
    let [a, l] = lx.useState(null);
    let [c, u] = lx.useState(() => RZr());
    let d = lx.useSyncExternalStore(bWe.subscribe, bWe.getState);
    let p = lx.useMemo(() => [...c, ...d], [c, d]);
    let [m, f] = lx.useState(() => (t ?? r) === "auto" ? TWe() : "dark");
    let h = s ?? r;
    let g = () => u(RZr());
    lx.useEffect(() => BWi(g), []);
    let {
      internal_querier: y
    } = F5d();
    lx.useEffect(() => {
      if (h !== "auto") {
        return;
      }
      f(TWe());
      return EMn(() => f(TWe()));
    }, [h]);
    lx.useEffect(() => {
      if (h !== "auto" || !y) {
        return;
      }
      let x;
      let A = false;
      Promise.resolve().then(() => (kGi(), xGi)).then(({
        watchSystemTheme: k
      }) => {
        if (A) {
          return;
        }
        x = k(y, f);
      });
      return () => {
        A = true;
        x?.();
      };
    }, [h, y]);
    let _ = tG(h);
    let b = _ ? p.find(x => x.slug === _) : undefined;
    let S = b ? b.base : h === "auto" ? m : _ ? "dark" : h;
    let E = lx.useMemo(() => OWi(MJ(S), a ?? b?.overrides), [S, a, b]);
    let C = lx.useMemo(() => ({
      themeSetting: r,
      setThemeSetting: x => {
        if (o(x), i(null), x === "auto") {
          f(TWe());
        }
        n(x);
      },
      setPreviewTheme: x => {
        if (i(x), x === "auto") {
          f(TWe());
        }
      },
      savePreview: () => {
        if (s !== null) {
          o(s);
          i(null);
          n(s);
        }
      },
      cancelPreview: () => {
        if (s !== null) {
          i(null);
        }
      },
      currentTheme: S,
      resolvedTheme: E,
      customThemes: p,
      activeCustomTheme: b,
      reloadCustomThemes: g,
      setPreviewOverrides: l
    }), [r, s, S, n, E, p, b]);
    return AGi.jsx(Ilt.Provider, {
      value: C,
      children: e
    });
  }
  function useTheme() {
    let e = DMn.c(3);
    let {
      currentTheme: t,
      setThemeSetting: n
    } = lx.useContext(Ilt);
    let r;
    if (e[0] !== t || e[1] !== n) {
      r = [t, n];
      e[0] = t;
      e[1] = n;
      e[2] = r;
    } else {
      r = e[2];
    }
    return r;
  }
  function useThemeSetting() {
    return lx.useContext(Ilt).themeSetting;
  }
  function usePreviewTheme() {
    let e = DMn.c(4);
    let {
      setPreviewTheme: t,
      savePreview: n,
      cancelPreview: r
    } = lx.useContext(Ilt);
    let o;
    if (e[0] !== r || e[1] !== n || e[2] !== t) {
      o = {
        setPreviewTheme: t,
        savePreview: n,
        cancelPreview: r
      };
      e[0] = r;
      e[1] = n;
      e[2] = t;
      e[3] = o;
    } else {
      o = e[3];
    }
    return o;
  }
  function useResolvedTheme() {
    return lx.useContext(Ilt).resolvedTheme;
  }
  function useCustomThemes() {
    let e = DMn.c(5);
    let {
      customThemes: t,
      activeCustomTheme: n,
      reloadCustomThemes: r,
      setPreviewOverrides: o
    } = lx.useContext(Ilt);
    let s;
    if (e[0] !== n || e[1] !== t || e[2] !== r || e[3] !== o) {
      s = {
        customThemes: t,
        activeCustomTheme: n,
        reloadCustomThemes: r,
        setPreviewOverrides: o
      };
      e[0] = n;
      e[1] = t;
      e[2] = r;
      e[3] = o;
      e[4] = s;
    } else {
      s = e[4];
    }
    return s;
  }
  var DMn;
  var lx;
  var AGi;
  var Ilt;
  var FJ = __lazy(() => {
    Qbe();
    zg();
    NJ();
    Xbe();
    DMn = __toESM(pt(), 1);
    lx = __toESM(ot(), 1);
    AGi = __toESM(ie(), 1);
    Ilt = lx.createContext({
      themeSetting: "dark",
      setThemeSetting: () => {},
      setPreviewTheme: () => {},
      savePreview: () => {},
      cancelPreview: () => {},
      currentTheme: "dark",
      resolvedTheme: MJ("dark"),
      customThemes: [],
      activeCustomTheme: undefined,
      reloadCustomThemes: () => {},
      setPreviewOverrides: () => {}
    });
  });
  function zZr(e, {
    include: t,
    exclude: n
  } = {}) {
    let r = o => {
      let s = i => typeof i === "string" ? o === i : i.test(o);
      if (t) {
        return t.some(s);
      }
      if (n) {
        return !n.some(s);
      }
      return true;
    };
    for (let [o, s] of Y6d(e.constructor.prototype)) {
      if (s === "constructor" || !r(s)) {
        continue;
      }
      let i = Reflect.getOwnPropertyDescriptor(o, s);
      if (i && typeof i.value === "function") {
        e[s] = e[s].bind(e);
      }
    }
    return e;
  }
  var Y6d = e => {
    let t = new Set();
    do {
      for (let n of Reflect.ownKeys(e)) {
        t.add([e, n]);
      }
    } while ((e = Reflect.getPrototypeOf(e)) && e !== Object.prototype);
    return t;
  };
  function J6d() {}
  var X6d = function () {
    return sZc.Date.now();
  };
  function Z6d(e) {
    var t = e.length;
    while (t-- && Q6d.test(e.charAt(t))) {
      ;
    }
    return t;
  }
  var Q6d;
  function t8d(e) {
    return e ? e.slice(0, Z6d(e) + 1).replace(e8d, "") : e;
  }
  var e8d;
  function i8d(e) {
    if (typeof e == "number") {
      return e;
    }
    if (mnu(e)) {
      return NGi;
    }
    if (gZc(e)) {
      var t = typeof e.valueOf == "function" ? e.valueOf() : e;
      e = gZc(t) ? t + "" : t;
    }
    if (typeof e != "string") {
      return e === 0 ? e : +e;
    }
    e = t8d(e);
    var n = r8d.test(e);
    return n || o8d.test(e) ? parseInt(e.slice(2), n ? 2 : 8) : n8d.test(e) ? NGi : +e;
  }
  var NGi = NaN;
  var n8d;
  var r8d;
  var o8d;
  function u8d(e, t, n) {
    var r;
    var o;
    var s;
    var i;
    var a;
    var l;
    var c = 0;
    var u = false;
    var d = false;
    var p = true;
    if (typeof e != "function") {
      throw TypeError("Expected a function");
    }
    if (t = i8d(t) || 0, gZc(n)) {
      u = !!n.leading;
      d = "maxWait" in n;
      s = d ? l8d(i8d(n.maxWait) || 0, t) : s;
      p = "trailing" in n ? !!n.trailing : p;
    }
    function m(C) {
      var x = r;
      var A = o;
      r = o = undefined;
      c = C;
      i = e.apply(A, x);
      return i;
    }
    function f(C) {
      c = C;
      a = setTimeout(y, t);
      return u ? m(C) : i;
    }
    function h(C) {
      var x = C - l;
      var A = C - c;
      var k = t - x;
      return d ? c8d(k, s - A) : k;
    }
    function g(C) {
      var x = C - l;
      var A = C - c;
      return l === undefined || x >= t || x < 0 || d && A >= s;
    }
    function y() {
      var C = X6d();
      if (g(C)) {
        return _(C);
      }
      a = setTimeout(y, h(C));
    }
    function _(C) {
      if (a = undefined, p && r) {
        return m(C);
      }
      r = o = undefined;
      return i;
    }
    function b() {
      if (a !== undefined) {
        clearTimeout(a);
      }
      c = 0;
      r = l = o = a = undefined;
    }
    function S() {
      return a === undefined ? i : _(X6d());
    }
    function E() {
      var C = X6d();
      var x = g(C);
      if (r = arguments, o = this, l = C, x) {
        if (a === undefined) {
          return f(l);
        }
        if (d) {
          clearTimeout(a);
          a = setTimeout(y, t);
          return m(l);
        }
      }
      if (a === undefined) {
        a = setTimeout(y, t);
      }
      return i;
    }
    E.cancel = b;
    E.flush = S;
    return E;
  }
  var l8d;
  var c8d;
  function p8d(e, t, n) {
    var r = true;
    var o = true;
    if (typeof e != "function") {
      throw TypeError("Expected a function");
    }
    if (gZc(n)) {
      r = "leading" in n ? !!n.leading : r;
      o = "trailing" in n ? !!n.trailing : o;
    }
    return u8d(e, t, {
      leading: r,
      maxWait: t,
      trailing: o
    });
  }