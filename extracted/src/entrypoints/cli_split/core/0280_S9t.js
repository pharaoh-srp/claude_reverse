  function S9t(e, t) {
    return e.split(`
`).flatMap(n => K1a.default(n, t, {
      trim: false,
      hard: true
    }).split(`
`).map(r => r.trimEnd())).join(`
`);
  }
  function E4n() {
    return z1a.default({
      defaultWidth: 80,
      output: b_o().output
    });
  }
  var z1a;
  var K1a;
  var v4n = __lazy(() => {
    c6e();
    z1a = __toESM(g1a(), 1);
    K1a = __toESM(V1a(), 1);
  });
  function ALp(e, t) {
    return S9t(e, t).split(`
`);
  }
  function ILp(e, t) {
    let n = t.length;
    let r = (e % n + n) % n;
    return [...t.slice(r), ...t.slice(0, r)];
  }
  function Y1a({
    items: e,
    width: t,
    renderItem: n,
    active: r,
    position: o,
    pageSize: s
  }) {
    let i = e.map((f, h) => ({
      item: f,
      index: h,
      isActive: h === r
    }));
    let a = ILp(r - o, i).slice(0, s);
    let l = f => a[f] == null ? [] : ALp(n(a[f]), t);
    let c = Array.from({
      length: s
    });
    let u = l(o).slice(0, s);
    let d = o + u.length <= s ? o : s - u.length;
    c.splice(d, u.length, ...u);
    let p = d + u.length;
    let m = o + 1;
    while (p < s && m < a.length) {
      for (let f of l(m)) {
        if (c[p++] = f, p >= s) {
          break;
        }
      }
      m++;
    }
    p = d - 1;
    m = o - 1;
    while (p >= 0 && m >= 0) {
      for (let f of l(m).reverse()) {
        if (c[p--] = f, p < 0) {
          break;
        }
      }
      m--;
    }
    return c.filter(f => typeof f === "string");
  }
  var J1a = __lazy(() => {
    v4n();
  });
  function X1a({
    active: e,
    pageSize: t,
    total: n
  }) {
    let r = Math.floor(t / 2);
    if (n <= t || e < r) {
      return e;
    }
    if (e >= n - r) {
      return e + t - n;
    }
    return r;
  }
  function Q1a({
    active: e,
    lastActive: t,
    total: n,
    pageSize: r,
    pointer: o
  }) {
    if (n <= r) {
      return e;
    }
    if (t < e && e - t < r) {
      return Math.min(Math.floor(r / 2), o + e - t);
    }
    return o;
  }
  function P_o({
    items: e,
    active: t,
    renderItem: n,
    pageSize: r,
    loop: o = true
  }) {
    let s = FMe({
      position: 0,
      lastActive: 0
    });
    let i = o ? Q1a({
      active: t,
      lastActive: s.current.lastActive,
      total: e.length,
      pageSize: r,
      pointer: s.current.position
    }) : X1a({
      active: t,
      total: e.length,
      pageSize: r
    });
    s.current.position = i;
    s.current.lastActive = t;
    return Y1a({
      items: e,
      width: E4n(),
      renderItem: n,
      active: t,
      position: i,
      pageSize: r
    }).join(`
`);
  }
  var Z1a = __lazy(() => {
    b4n();
    v4n();
    J1a();
  });