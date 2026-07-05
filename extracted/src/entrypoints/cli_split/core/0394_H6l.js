  function H6l(e) {
    let t = $6l.c(41);
    let {
      inputValue: n,
      setInputValue: r,
      cursorOffset: o,
      setCursorOffset: s,
      error: i,
      setError: a,
      result: l,
      setResult: c,
      setViewState: u,
      onAddComplete: d,
      cliMode: p
    } = e;
    let m = p === undefined ? false : p;
    let f = RYe.useRef(false);
    let [h, g] = RYe.useState(false);
    let [y, _] = RYe.useState("");
    let b;
    if (t[0] !== m || t[1] !== n || t[2] !== d || t[3] !== a || t[4] !== c || t[5] !== u) {
      b = async () => {
        let z = n.trim();
        if (!z) {
          a("Please enter a marketplace source");
          return;
        }
        let V = await kar(z);
        if (!V) {
          a("Invalid marketplace source format. Try: owner/repo, https://..., or ./path");
          return;
        }
        if ("error" in V) {
          a(V.error);
          return;
        }
        a(null);
        try {
          g(true);
          _("");
          let {
            name: K,
            resolvedSource: J
          } = await FFe(V, ne => {
            _(ne);
          });
          UXt(K, {
            source: J
          });
          Ag();
          let Q = V.source;
          if (V.source === "github") {
            Q = V.repo;
          }
          logEvent("tengu_marketplace_added", {
            source_type: Q
          });
          let Z = [];
          try {
            Z = (await zwe((await loadAllPlugins()).errors)).installed;
          } catch (ne) {
            logForDebugging(`marketplace add: dep auto-resolve skipped: ${he(ne)}`, {
              level: "warn"
            });
          }
          if (Z.length > 0) {
            Ag();
          }
          if (await d(), _(""), g(false), m) {
            c(`Successfully added marketplace: ${K}${$ue(Z)}`);
          } else {
            u({
              type: "browse-marketplace",
              targetMarketplace: K
            });
          }
        } catch (K) {
          let Q = sr(K);
          if (logForDebugging(`marketplace add failed: ${he(Q)}`, {
            level: "error"
          }), a(Q.message), _(""), g(false), m) {
            c(`Error: ${Q.message}`);
          } else {
            c(null);
          }
        }
      };
      t[0] = m;
      t[1] = n;
      t[2] = d;
      t[3] = a;
      t[4] = c;
      t[5] = u;
      t[6] = b;
    } else {
      b = t[6];
    }
    let S = b;
    let E;
    if (t[7] !== i || t[8] !== S || t[9] !== n || t[10] !== l) {
      E = () => {
        if (n && !f.current && !i && !l) {
          f.current = true;
          S();
        }
      };
      t[7] = i;
      t[8] = S;
      t[9] = n;
      t[10] = l;
      t[11] = E;
    } else {
      E = t[11];
    }
    let C;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      C = [];
      t[12] = C;
    } else {
      C = t[12];
    }
    RYe.useEffect(E, C);
    let x;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      x = Nv.jsx(gXd, {
        marginBottom: 1,
        children: Nv.jsx(Text, {
          bold: true,
          children: "Add Marketplace"
        })
      });
      t[13] = x;
    } else {
      x = t[13];
    }
    let A;
    let k;
    let I;
    let O;
    let M;
    let L;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      I = Nv.jsx(Text, {
        children: "Enter marketplace source:"
      });
      O = Nv.jsx(Text, {
        dimColor: true,
        children: "Examples:"
      });
      M = Nv.jsx(Text, {
        dimColor: true,
        children: " \xB7 owner/repo (GitHub)"
      });
      L = Nv.jsx(Text, {
        dimColor: true,
        children: " \xB7 git@github.com:owner/repo.git (SSH)"
      });
      A = Nv.jsx(Text, {
        dimColor: true,
        children: " \xB7 https://example.com/marketplace.json"
      });
      k = Nv.jsx(Text, {
        dimColor: true,
        children: " \xB7 ./path/to/marketplace"
      });
      t[14] = A;
      t[15] = k;
      t[16] = I;
      t[17] = O;
      t[18] = M;
      t[19] = L;
    } else {
      A = t[14];
      k = t[15];
      I = t[16];
      O = t[17];
      M = t[18];
      L = t[19];
    }
    let P;
    if (t[20] !== o || t[21] !== S || t[22] !== n || t[23] !== s || t[24] !== r) {
      P = Nv.jsxs(gXd, {
        flexDirection: "column",
        children: [I, O, M, L, A, k, Nv.jsx(gXd, {
          marginTop: 1,
          children: Nv.jsx(Dl, {
            value: n,
            onChange: r,
            onSubmit: S,
            columns: 80,
            cursorOffset: o,
            onChangeCursorOffset: s,
            focus: true,
            showCursor: true
          })
        })]
      });
      t[20] = o;
      t[21] = S;
      t[22] = n;
      t[23] = s;
      t[24] = r;
      t[25] = P;
    } else {
      P = t[25];
    }
    let F;
    if (t[26] !== h || t[27] !== y) {
      F = h && Nv.jsxs(gXd, {
        marginTop: 1,
        children: [Nv.jsx(Ed, {}), Nv.jsx(Text, {
          children: y || "Adding marketplace to configuration\u2026"
        })]
      });
      t[26] = h;
      t[27] = y;
      t[28] = F;
    } else {
      F = t[28];
    }
    let H;
    if (t[29] !== i) {
      H = i && Nv.jsx(gXd, {
        marginTop: 1,
        children: Nv.jsx(Hc, {
          error: i
        })
      });
      t[29] = i;
      t[30] = H;
    } else {
      H = t[30];
    }
    let U;
    if (t[31] !== l) {
      U = l && Nv.jsx(gXd, {
        marginTop: 1,
        children: Nv.jsx(Text, {
          children: l
        })
      });
      t[31] = l;
      t[32] = U;
    } else {
      U = t[32];
    }
    let N;
    if (t[33] !== P || t[34] !== F || t[35] !== H || t[36] !== U) {
      N = Nv.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        borderStyle: "round",
        children: [x, P, F, H, U]
      });
      t[33] = P;
      t[34] = F;
      t[35] = H;
      t[36] = U;
      t[37] = N;
    } else {
      N = t[37];
    }
    let W;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      W = Nv.jsx(gXd, {
        marginLeft: 3,
        children: Nv.jsx(Text, {
          dimColor: true,
          italic: true,
          children: Nv.jsxs(Hn, {
            children: [Nv.jsx(xt, {
              chord: "enter",
              action: "add"
            }), Nv.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })
      });
      t[38] = W;
    } else {
      W = t[38];
    }
    let j;
    if (t[39] !== N) {
      j = Nv.jsxs(gXd, {
        flexDirection: "column",
        children: [N, W]
      });
      t[39] = N;
      t[40] = j;
    } else {
      j = t[40];
    }
    return j;
  }
  var $6l;
  var RYe;
  var Nv;
  var j6l = __lazy(() => {
    Ot();
    Sd();
    Ai();
    bv();
    bs();
    cA();
    q_();
    et();
    je();
    dt();
    p5();
    MSe();
    yT();
    EUe();
    q3o();
    xg();
    $6l = __toESM(pt(), 1);
    RYe = __toESM(ot(), 1);
    Nv = __toESM(ie(), 1);
  });
  function V6l() {
    return z3o.join(XC(), "plugin-catalog-cache.json");
  }
  async function a6m() {
    try {
      let e = await Aar.readFile(V6l(), {
        encoding: "utf-8"
      });
      let t = i6m().safeParse(qt(e));
      if (!t.success) {
        logForDebugging("Plugin catalog cache has invalid structure");
        return null;
      }
      let n = t.data;
      if (n.version !== 1) {
        logForDebugging(`Plugin catalog cache version mismatch (got ${n.version}, expected ${1})`);
        return null;
      }
      let r = new Date(n.fetchedAt).getTime();
      if (Number.isNaN(r) || Date.now() - r > 86400000) {
        logForDebugging("Plugin catalog cache is stale (>24 h old)");
        return null;
      }
      return n;
    } catch (e) {
      if (!fn(e)) {
        logForDebugging(`Failed to load plugin catalog cache: ${he(e)}`);
      }
      return null;
    }
  }
  async function l6m(e) {
    try {
      await zt().mkdir(XC());
      await Fm(V6l(), De(e), 384);
      await Aar.unlink(z3o.join(XC(), "install-counts-cache.json")).catch(() => {});
    } catch (t) {
      logForDebugging(`Failed to save plugin catalog cache: ${he(t)}`, {
        level: "error"
      });
    }
  }
  async function c6m() {
    logForDebugging(`Fetching plugin catalog from ${"https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/plugin-stats/plugin-details.json"}`);
    let e = performance.now();
    try {
      let t = await externalHttp.get("https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/plugin-stats/plugin-details.json", {
        timeout: 1e4,
        maxContentLength: 5242880
      });
      let n = G6l().safeParse(t.data);
      if (!n.success) {
        throw Error("Invalid response format from plugin catalog");
      }
      dM("plugin_catalog", "https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/plugin-stats/plugin-details.json", "success", performance.now() - e);
      return n.data;
    } catch (t) {
      throw dM("plugin_catalog", "https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/plugin-stats/plugin-details.json", "failure", performance.now() - e, mV(t)), t;
    }
  }
  function z6l() {
    G3o ??= (async () => {
      let e = await a6m();
      if (e) {
        dM("plugin_catalog", "https://storage.googleapis.com/claude-code-dist-86c565f3-f756-42ad-8dfa-d59b1c096819/plugin-stats/plugin-details.json", "cache_hit", 0);
        return e.catalog;
      }
      try {
        let t = await c6m();
        await l6m({
          version: 1,
          fetchedAt: new Date().toISOString(),
          catalog: t
        });
        return t;
      } catch (t) {
        logForDebugging(`Failed to fetch plugin catalog: ${he(t)}`, {
          level: "error"
        });
        G3o = undefined;
        return null;
      }
    })();
    return G3o;
  }
  async function owt() {
    let e = await z6l();
    if (!e) {
      return null;
    }
    let t = new Map();
    for (let [n, r] of Object.entries(e.plugins)) {
      if (typeof r.unique_installs === "number") {
        t.set(n, r.unique_installs);
      }
    }
    return t;
  }
  async function K3o(e) {
    return (await z6l())?.plugins[e];
  }
  async function Y6l(e, t) {
    let n = await K3o(e);
    if (!n) {
      return null;
    }
    let r = n.tokens[t];
    if (r) {
      return {
        alwaysOn: r.always_on,
        onInvoke: r.on_invoke,
        isEstimate: false
      };
    }
    let o = [...n.components.commands, ...n.components.agents, ...n.components.skills];
    let s = 0;
    let i = 0;
    for (let a of o) {
      s += a.chars?.always_on ?? 0;
      i += a.chars?.on_invoke ?? 0;
    }
    return {
      alwaysOn: Math.round(s / 3),
      onInvoke: Math.round(i / 3),
      isEstimate: true
    };
  }
  function Iar(e) {
    if (e < 1000) {
      return String(e);
    }
    if (e < 1e6) {
      let n = (e / 1000).toFixed(1);
      return n.endsWith(".0") ? `${n.slice(0, -2)}K` : `${n}K`;
    }
    let t = (e / 1e6).toFixed(1);
    return t.endsWith(".0") ? `${t.slice(0, -2)}M` : `${t}M`;
  }
  var Aar;
  var z3o;
  var W6l;
  var W3o;
  var s6m;
  var G6l;
  var i6m;
  var G3o;
  var EZt = __lazy(() => {
    pk();
    BT();
    je();
    dt();
    iqt();
    k1();
    Aar = require("fs/promises");
    z3o = require("path");
    W6l = we(() => v.object({
      always_on: v.number(),
      on_invoke: v.number()
    }));
    W3o = we(() => v.object({
      name: v.string(),
      chars: W6l().optional()
    }).loose());
    s6m = we(() => v.object({
      plugin: v.string(),
      tokens: v.record(v.string(), W6l()),
      components: v.object({
        commands: v.array(W3o()),
        agents: v.array(W3o()),
        skills: v.array(W3o()),
        hooks: v.array(v.string()).optional(),
        mcpServers: v.array(v.string()).optional(),
        lspServers: v.array(v.string()).optional()
      }).loose(),
      unique_installs: v.number().optional(),
      last_updated: v.string().optional(),
      marketplace_entry: v.record(v.string(), v.unknown())
    }).loose());
    G6l = we(() => v.object({
      generated_at: v.string(),
      installs_generated_at: v.string().optional(),
      marketplace_sha: v.string(),
      models: v.array(v.string()),
      plugins: v.record(v.string(), s6m())
    }).loose());
    i6m = we(() => v.object({
      version: v.number(),
      fetchedAt: v.string(),
      catalog: G6l()
    }));
  });
  function u6m(e, t, n, r) {
    let o = {};
    for (let s of e) {
      let i = n[s];
      let l = ((t[s] ?? "").split(/\r\n|\r|\n/, 1)[0] ?? "").trim();
      if (l === "") {
        if (i?.sensitive === true && r?.[s] !== undefined) {
          continue;
        }
        if (i?.type === "number") {
          continue;
        }
        if (i?.required !== true && r?.[s] === undefined) {
          continue;
        }
      }
      if (i?.type === "number") {
        let c = Number(l);
        o[s] = Number.isNaN(c) ? l : c;
      } else if (i?.type === "boolean") {
        o[s] = st(l);
      } else {
        o[s] = l;
      }
    }
    return o;
  }
  function vZt(e) {
    let t = J6l.c(24);
    let {
      title: n,
      subtitle: r,
      configSchema: o,
      initialValues: s,
      onSave: i,
      onCancel: a
    } = e;
    let l;
    if (t[0] !== o) {
      l = Object.keys(o);
      t[0] = o;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    let u;
    if (t[2] !== o || t[3] !== c || t[4] !== s) {
      u = () => {
        let _ = {};
        for (let b of c) {
          let S = o[b]?.sensitive === true ? undefined : s?.[b];
          _[b] = S === undefined ? "" : String(S);
        }
        return _;
      };
      t[2] = o;
      t[3] = c;
      t[4] = s;
      t[5] = u;
    } else {
      u = t[5];
    }
    let [d, p] = X6l.useState(u);
    let m;
    if (t[6] !== o || t[7] !== c || t[8] !== s) {
      m = c.map(_ => {
        let b = o[_];
        let S = b?.sensitive === true;
        let E = S && s?.[_] !== undefined;
        return {
          type: "text",
          key: _,
          label: b?.title || _,
          required: b?.required === true && !E,
          mask: S ? "*" : undefined,
          placeholder: E ? "(unchanged)" : undefined,
          hint: () => b?.description
        };
      });
      t[6] = o;
      t[7] = c;
      t[8] = s;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f = m;
    if (c.length === 0) {
      return null;
    }
    let h;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      h = (_, b) => p(S => ({
        ...S,
        [_]: b
      }));
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] !== o || t[12] !== c || t[13] !== s || t[14] !== i || t[15] !== d) {
      g = () => i(u6m(c, d, o, s));
      t[11] = o;
      t[12] = c;
      t[13] = s;
      t[14] = i;
      t[15] = d;
      t[16] = g;
    } else {
      g = t[16];
    }
    let y;
    if (t[17] !== f || t[18] !== a || t[19] !== r || t[20] !== g || t[21] !== n || t[22] !== d) {
      y = Q6l.jsx(q1e, {
        title: n,
        subtitle: r,
        fields: f,
        values: d,
        onChange: h,
        onSubmit: g,
        onCancel: a,
        submitLabel: "Save configuration"
      });
      t[17] = f;
      t[18] = a;
      t[19] = r;
      t[20] = g;
      t[21] = n;
      t[22] = d;
      t[23] = y;
    } else {
      y = t[23];
    }
    return y;
  }
  var J6l;
  var X6l;
  var Q6l;
  var Y3o = __lazy(() => {
    Zzt();
    gn();
    J6l = __toESM(pt(), 1);
    X6l = __toESM(ot(), 1);
    Q6l = __toESM(ie(), 1);
  });
  async function wZt(e) {
    let {
      enabled: t,
      disabled: n
    } = await loadAllPlugins();
    return fWn([...t, ...n], e);
  }
  function d6m(e) {
    return Object.keys(Z9t(e)).length > 0 || dSo(e).length > 0;
  }
  async function Par(e, t) {
    let n = await wZt(e);
    if (!n || !d6m(n)) {
      return null;
    }
    return {
      type: "plugin-options",
      plugin: n,
      pluginId: e,
      depNote: t?.suffix ?? "",
      alreadyInstalled: true,
      depsResolved: t?.changed ?? false
    };
  }
  function Oar(e) {
    let t = Z6l.c(11);
    let {
      viewState: n,
      onFinish: r
    } = e;
    let {
      plugin: o,
      pluginId: s,
      depNote: i,
      alreadyInstalled: a,
      depsResolved: l
    } = n;
    let c = a ? "Already installed" : "Installed";
    let u = !a || Boolean(l);
    let d;
    if (t[0] !== a || t[1] !== u || t[2] !== i || t[3] !== r || t[4] !== o || t[5] !== c) {
      d = (m, f, h) => {
        e: switch (m) {
          case "configured":
            {
              let g = Boolean(h);
              let y = u || g;
              r(`\u2713 ${g ? a ? "Configured" : "Installed and configured" : c} ${ES(o)}${i}.${y ? " Run /reload-plugins to apply." : ""}`, y);
              break e;
            }
          case "skipped":
            {
              let g = u || Boolean(h);
              r(`\u2713 ${c} ${ES(o)}${i}.${g ? " Run /reload-plugins to apply." : ""}`, g);
              break e;
            }
          case "error":
            r(`${c} but failed to save config: ${f}`, u || Boolean(h));
        }
      };
      t[0] = a;
      t[1] = u;
      t[2] = i;
      t[3] = r;
      t[4] = o;
      t[5] = c;
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] !== o || t[8] !== s || t[9] !== d) {
      p = X3o.jsx(J3o, {
        plugin: o,
        pluginId: s,
        onDone: d
      });
      t[7] = o;
      t[8] = s;
      t[9] = d;
      t[10] = p;
    } else {
      p = t[10];
    }
    return p;
  }
  function J3o({
    plugin: e,
    pluginId: t,
    onDone: n
  }) {
    let [r] = vUe.useState(() => {
      let u = [];
      let d = Z9t(e);
      if (Object.keys(d).length > 0) {
        u.push({
          key: "top-level",
          title: `Configure ${ES(e)}`,
          subtitle: "Plugin options",
          schema: d,
          load: () => W1(t),
          save: m => Fft(t, m, e.manifest.userConfig)
        });
      }
      let p = dSo(e);
      for (let m of p) {
        u.push({
          key: `channel:${m.server}`,
          title: `Configure ${m.displayName}`,
          subtitle: `Plugin: ${ES(e)}`,
          schema: m.configSchema,
          load: () => x6e(t, m.server) ?? undefined,
          save: f => pWn(t, m.server, f, m.configSchema)
        });
      }
      return u;
    });
    let [o, s] = vUe.useState(0);
    let i = vUe.useRef(false);
    let a = vUe.useRef(n);
    if (a.current = n, vUe.useEffect(() => {
      if (r.length === 0) {
        a.current("skipped");
      }
    }, [r.length]), r.length === 0) {
      return null;
    }
    let l = r[o];
    async function c(u) {
      try {
        await l.save(u);
      } catch (p) {
        n("error", he(p), i.current);
        return;
      }
      if (Object.keys(u).length > 0) {
        i.current = true;
      }
      let d = o + 1;
      if (d < r.length) {
        s(d);
      } else {
        n("configured", undefined, i.current);
      }
    }
    return X3o.jsx(vZt, {
      title: l.title,
      subtitle: l.subtitle,
      configSchema: l.schema,
      initialValues: l.load(),
      onSave: c,
      onCancel: () => n("skipped", undefined, i.current)
    }, l.key);
  }
  var Z6l;
  var vUe;
  var X3o;
  var Dar = __lazy(() => {
    dt();
    Lft();
    sNe();
    xg();
    a9();
    Y3o();
    Z6l = __toESM(pt(), 1);
    vUe = __toESM(ot(), 1);
    X3o = __toESM(ie(), 1);
  });
  function Nar() {
    let e = e8l.c(3);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = getPluginTrustMessage();
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let r;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = Mar.jsxs(Text, {
        color: "claude",
        children: [vGd.warning, " "]
      });
      e[1] = r;
    } else {
      r = e[1];
    }
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = Mar.jsxs(gXd, {
        marginBottom: 1,
        children: [r, Mar.jsxs(Text, {
          dimColor: true,
          italic: true,
          children: ["Make sure you trust a plugin before installing, updating, or using it. Anthropic does not control what MCP servers, files, or other software are included in plugins and cannot verify that they will work as intended or that they won't change. See each plugin's homepage for more information.", n ? ` ${n}` : ""]
        })]
      });
      e[2] = o;
    } else {
      o = e[2];
    }
    return o;
  }
  var e8l;
  var Mar;
  var Q3o = __lazy(() => {
    et();
    Xk();
    e8l = __toESM(pt(), 1);
    Mar = __toESM(ie(), 1);
  });
  function Lar(e) {
    return [["Commands", e.commands.map(n => n.name)], ["Agents", e.agents.map(n => n.name)], ["Skills", e.skills.map(n => n.name)], ["Hooks", e.hooks ?? []], ["MCP Servers", e.mcpServers ?? []], ["LSP Servers", e.lspServers ?? []]].filter(([, n]) => n.length > 0);
  }
  function wUe(e) {
    if (e.entry.source && typeof e.entry.source === "object" && "source" in e.entry.source && e.entry.source.source === "github" && typeof e.entry.source === "object" && "repo" in e.entry.source) {
      return e.entry.source.repo;
    }
    return null;
  }
  function awt(e, t) {
    let n = [{
      label: "Install for you (user scope)",
      action: "install-user"
    }, {
      label: "Install for all collaborators on this repository (project scope)",
      action: "install-project"
    }, {
      label: "Install for you, in this repo only (local scope)",
      action: "install-local"
    }];
    if (e) {
      n.push({
        label: "Open homepage",
        action: "homepage"
      });
    }
    if (t) {
      n.push({
        label: "View on GitHub",
        action: "github"
      });
    }
    n.push({
      label: "Back to plugin list",
      action: "back"
    });
    return n;
  }
  function t8l(e) {
    let t = iwt.c(12);
    let {
      hasSelection: n,
      canToggle: r,
      canView: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = n && sD.jsx(Wr, {
        action: "plugin:install",
        context: "Plugin",
        fallback: "i",
        description: "install",
        bold: true
      });
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = sD.jsx(Text, {
        children: "Type to search"
      });
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== r) {
      a = r && sD.jsx(Wr, {
        action: "plugin:toggle",
        context: "Plugin",
        fallback: "Space",
        description: "toggle"
      });
      t[3] = r;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== o) {
      l = o && sD.jsx(Wr, {
        action: "select:accept",
        context: "Select",
        fallback: "Enter",
        description: "view"
      });
      t[5] = o;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      c = sD.jsx(Wr, {
        action: "confirm:no",
        context: "Settings",
        fallback: "Esc",
        description: "go back"
      });
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== s || t[9] !== a || t[10] !== l) {
      u = sD.jsx(gXd, {
        marginTop: 1,
        children: sD.jsx(Text, {
          dimColor: true,
          italic: true,
          children: sD.jsxs(Hn, {
            children: [s, i, a, l, c]
          })
        })
      });
      t[8] = s;
      t[9] = a;
      t[10] = l;
      t[11] = u;
    } else {
      u = t[11];
    }
    return u;
  }
  function Uar(e) {
    let t = iwt.c(4);
    let {
      pluginId: n
    } = e;
    let r = n8l(n);
    if (!r?.last_updated) {
      return null;
    }
    let o;
    if (t[0] !== r.last_updated) {
      o = m6m(r.last_updated);
      t[0] = r.last_updated;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    if (s === undefined) {
      return null;
    }
    let i;
    if (t[2] !== s) {
      i = sD.jsxs(Text, {
        dimColor: true,
        children: ["Last updated: ", s]
      });
      t[2] = s;
      t[3] = i;
    } else {
      i = t[3];
    }
    return i;
  }
  function n8l(e) {
    let t = iwt.c(3);
    let [n, r] = Far.useState(null);
    let o;
    let s;
    if (t[0] !== e) {
      o = () => {
        r(null);
        let i = false;
        K3o(e).then(a => {
          if (!i) {
            r(a ?? null);
          }
        }).catch(p6m);
        return () => {
          i = true;
        };
      };
      s = [e];
      t[0] = e;
      t[1] = o;
      t[2] = s;
    } else {
      o = t[1];
      s = t[2];
    }
    Far.useEffect(o, s);
    return n;
  }
  function p6m() {}
  function m6m(e) {
    let t = new Date(e);
    if (Number.isNaN(t.getTime())) {
      return;
    }
    return t.toLocaleDateString(undefined, {
      year: "numeric",
      month: "short",
      day: "numeric"
    });
  }
  function Bar(e) {
    let t = iwt.c(4);
    let {
      plugin: n
    } = e;
    let r = n8l(n.pluginId);
    let o;
    if (t[0] !== r || t[1] !== n.entry) {
      let s = r?.components ? Lar(r.components) : [];
      let i;
      if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
        i = sD.jsx(Text, {
          bold: true,
          children: "Will install:"
        });
        t[3] = i;
      } else {
        i = t[3];
      }
      o = sD.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [i, s.length > 0 ? s.map(f6m) : sD.jsx(h6m, {
          entry: n.entry
        })]
      });
      t[0] = r;
      t[1] = n.entry;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function f6m(e) {
    let [t, n] = e;
    return sD.jsxs(Text, {
      dimColor: true,
      children: ["\xB7 ", t, ": ", n.join(", ")]
    }, t);
  }
  function h6m(e) {
    let t = iwt.c(11);
    let {
      entry: n
    } = e;
    let r;
    let o;
    if (t[0] !== n.agents || t[1] !== n.commands || t[2] !== n.hooks || t[3] !== n.lspServers || t[4] !== n.mcpServers || t[5] !== n.skills || t[6] !== n.source) {
      o = Symbol.for("react.early_return_sentinel");
      e: {
        let i = [["Commands", swt(n.commands)], ["Agents", swt(n.agents)], ["Skills", swt(n.skills)], ["Hooks", swt(n.hooks)], ["MCP Servers", swt(n.mcpServers)], ["LSP Servers", swt(n.lspServers)]].filter(y6m);
        if (i.length === 0) {
          let a = typeof n.source === "object" ? "\xB7 Component summary not available for remote plugin" : "\xB7 Components will be discovered at installation";
          let l;
          if (t[9] !== a) {
            l = sD.jsx(Text, {
              dimColor: true,
              children: a
            });
            t[9] = a;
            t[10] = l;
          } else {
            l = t[10];
          }
          o = l;
          break e;
        }
        r = sD.jsx(sD.Fragment, {
          children: i.map(g6m)
        });
      }
      t[0] = n.agents;
      t[1] = n.commands;
      t[2] = n.hooks;
      t[3] = n.lspServers;
      t[4] = n.mcpServers;
      t[5] = n.skills;
      t[6] = n.source;
      t[7] = r;
      t[8] = o;
    } else {
      r = t[7];
      o = t[8];
    }
    if (o !== Symbol.for("react.early_return_sentinel")) {
      return o;
    }
    return r;
  }
  function g6m(e) {
    let [t, n] = e;
    return sD.jsxs(Text, {
      dimColor: true,
      children: ["\xB7 ", t, ": ", n.join(", ")]
    }, t);
  }
  function y6m(e) {
    let [, t] = e;
    return t.length > 0;
  }
  function swt(e) {
    if (typeof e === "string") {
      return [e];
    }
    if (Array.isArray(e)) {
      return e.flatMap(t => typeof t === "string" ? [t] : t && typeof t === "object" ? Object.keys(t) : []);
    }
    if (e && typeof e === "object") {
      return Object.keys(e);
    }
    return [];
  }
  var iwt;
  var Far;
  var sD;
  var Z3o = __lazy(() => {
    Sd();
    Ai();
    et();
    EZt();
    iwt = __toESM(pt(), 1);
    Far = __toESM(ot(), 1);
    sD = __toESM(ie(), 1);
  });
  function lwt({
    totalItems: e,
    maxVisible: t = _6m,
    selectedIndex: n = 0,
    firstSelectableIndex: r = 0
  }) {
    let o = e > t;
    let s = fK.useRef(0);
    let i = fK.useMemo(() => {
      if (!o) {
        return 0;
      }
      let b = s.current;
      if (n < b) {
        let C = n <= r ? 0 : n;
        s.current = C;
        return C;
      }
      if (n >= b + t) {
        let C = n - t + 1;
        s.current = C;
        return C;
      }
      let S = Math.max(0, e - t);
      let E = Math.min(b, S);
      s.current = E;
      return E;
    }, [n, t, o, e, r]);
    let a = i;
    let l = Math.min(i + t, e);
    let c = fK.useCallback(b => {
      if (!o) {
        return b;
      }
      return b.slice(a, l);
    }, [o, a, l]);
    let u = fK.useCallback(b => a + b, [a]);
    let d = fK.useCallback(b => b >= a && b < l, [a, l]);
    let p = fK.useCallback(b => {}, []);
    let m = fK.useCallback(() => {}, []);
    let f = fK.useCallback(() => {}, []);
    let h = fK.useCallback((b, S) => {
      let E = Math.max(0, Math.min(b, e - 1));
      S(E);
    }, [e]);
    let g = fK.useCallback((b, S) => false, []);
    let y = Math.max(1, Math.ceil(e / t));
    return {
      currentPage: Math.floor(i / t),
      totalPages: y,
      startIndex: a,
      endIndex: l,
      needsPagination: o,
      pageSize: t,
      getVisibleItems: c,
      toActualIndex: u,
      isOnCurrentPage: d,
      goToPage: p,
      nextPage: m,
      prevPage: f,
      handleSelectionChange: h,
      handlePageNavigation: g,
      scrollPosition: {
        current: n + 1,
        total: e,
        canScrollUp: i > 0,
        canScrollDown: i + t < e
      }
    };
  }
  var fK;
  var $ar = __lazy(() => {
    fK = __toESM(ot(), 1);
  });
  function o8l({
    error: e,
    setError: t,
    result: n,
    setResult: r,
    setViewState: o,
    onInstallComplete: s,
    onSearchModeChange: i,
    targetMarketplace: a,
    targetPlugin: l
  }) {
    let [c, u] = ob.useState("marketplace-list");
    let [d, p] = ob.useState(null);
    let [m, f] = ob.useState(null);
    let [h, g] = ob.useState([]);
    let [y, _] = ob.useState([]);
    let [b, S] = ob.useState(true);
    let [E, C] = ob.useState(null);
    let [x, A] = ob.useState(false);
    let k = () => A(false);
    let {
      query: I,
      setQuery: O,
      cursorOffset: M,
      setCursorOffset: L,
      handleKeyDown: P,
      handlePaste: F
    } = U0({
      isActive: c === "plugin-list" && x && !b,
      onExit: k,
      onExitUp: k
    });
    let H = x && I !== "";
    ob.useEffect(() => {
      i(H);
    }, [H, i]);
    ob.useEffect(() => () => i(false), [i]);
    let U = useTerminalFocus();
    let {
      columns: N
    } = Sr();
    let W = ob.useMemo(() => {
      if (!I) {
        return y;
      }
      let _e = I.toLowerCase();
      return y.filter(xe => xe.entry.name.toLowerCase().includes(_e) || xe.entry.displayName?.toLowerCase().includes(_e) || xe.entry.description?.toLowerCase().includes(_e));
    }, [y, I]);
    let [j, z] = ob.useState(0);
    let [V, K] = ob.useState(new Set());
    let [J, Q] = ob.useState(new Set());
    let Z = lwt({
      totalItems: W.length,
      selectedIndex: j
    });
    ob.useEffect(() => {
      z(0);
    }, [I]);
    let [ne, oe] = ob.useState(0);
    let [ee, re] = ob.useState(false);
    let [se, ae] = ob.useState(null);
    let [de, be] = ob.useState(null);
    let fe = ob.useCallback(() => {
      if (c === "plugin-list") {
        if (a) {
          o({
            type: "manage-marketplaces",
            targetMarketplace: a
          });
        } else if (h.length === 1) {
          o({
            type: "menu"
          });
        } else {
          u("marketplace-list");
          p(null);
          K(new Set());
          z(0);
        }
      } else if (c === "plugin-details") {
        u("plugin-list");
        f(null);
      } else {
        o({
          type: "menu"
        });
      }
    }, [c, a, o, h.length]);
    uo("confirm:no", fe, {
      context: "Settings",
      isActive: typeof c === "string" && !(c === "plugin-list" && x)
    });
    ob.useEffect(() => {
      let _e = false;
      async function xe() {
        try {
          let ke = await hf();
          let {
            marketplaces: Ie,
            failures: Ue
          } = await Xse(ke);
          if (_e) {
            return;
          }
          let Ge = [];
          for (let {
            name: Ze,
            config: Tt,
            data: kt
          } of Ie) {
            if (kt) {
              let Ye = Bn(kt.plugins, ht => qG(OZ(ht.name, Ze)));
              Ge.push({
                name: Ze,
                totalPlugins: kt.plugins.length,
                installedCount: Ye,
                source: N7e(Tt.source)
              });
            }
          }
          Ge.sort((Ze, Tt) => {
            if (Ze.name === "claude-plugin-directory") {
              return -1;
            }
            if (Tt.name === "claude-plugin-directory") {
              return 1;
            }
            return 0;
          });
          g(Ge);
          let Be = Bn(Ie, Ze => Ze.data !== null);
          let We = tvt(Ue, Be);
          if (We) {
            if (We.type === "warning") {
              be(We.message + ". Showing available marketplaces.");
            } else {
              throw Error(We.message);
            }
          }
          if (Ge.length === 1 && !a && !l) {
            let Ze = Ge[0];
            if (Ze) {
              p(Ze.name);
              u("plugin-list");
            }
          }
          if (a && !Ge.some(Ze => Ze.name === a)) {
            t(`Marketplace "${a}" not found`);
          } else if (l) {
            let Ze = null;
            let Tt = null;
            let kt = a ? [a] : Object.keys(ke);
            for (let Ye of kt) {
              let ht = await uL(Ye);
              if (ht) {
                let It = ht.plugins.find(Rt => Rt.name === l);
                if (It) {
                  let Rt = OZ(It.name, Ye);
                  Ze = {
                    entry: It,
                    marketplaceName: Ye,
                    pluginId: Rt,
                    isInstalled: U7e(Rt)
                  };
                  Tt = Ye;
                  break;
                }
              }
            }
            if (_e) {
              return;
            }
            if (Ze && Tt) {
              let Ye = Ze.pluginId;
              if (U7e(Ye)) {
                let It = await rwt(Ye);
                let Rt = await Par(Ye, It);
                if (_e) {
                  return;
                }
                if (Rt) {
                  u(Rt);
                } else if (It === null) {
                  t(`Plugin '${Ye}' is already installed globally. Use '/plugin' to manage existing plugins.`);
                } else if (r(`Plugin "${Ye}" is already installed${It.suffix}`), It.changed) {
                  await s();
                }
              } else {
                p(Tt);
                f(Ze);
                u("plugin-details");
              }
            } else {
              let Ye = a ? `marketplace "${a}"` : "any marketplace";
              t(`Plugin "${l}" not found in ${Ye}`);
            }
          } else if (a) {
            p(a);
            u("plugin-list");
          }
        } catch (ke) {
          if (_e) {
            return;
          }
          t(ke instanceof Error ? ke.message : "Failed to load marketplaces");
        } finally {
          if (!_e) {
            S(false);
          }
        }
      }
      xe();
      return () => {
        _e = true;
      };
    }, [t, r, s, a, l]);
    let me = ob.useRef(0);
    ob.useEffect(() => {
      if (!d) {
        return;
      }
      let _e = false;
      let xe = ++me.current;
      async function ke(Ie) {
        S(true);
        try {
          let Ue = await uL(Ie);
          if (_e) {
            return;
          }
          if (!Ue) {
            throw Error(`Failed to load marketplace: ${Ie}`);
          }
          let Ge = [];
          for (let Be of Ue.plugins) {
            let We = OZ(Be.name, Ie);
            if (isPluginBlockedByPolicy(We)) {
              continue;
            }
            Ge.push({
              entry: Be,
              marketplaceName: Ie,
              pluginId: We,
              isInstalled: U7e(We)
            });
          }
          try {
            let Be = await owt();
            if (_e) {
              return;
            }
            if (C(Be), Be) {
              Ge.sort((We, Ze) => {
                let Tt = Be.get(We.pluginId) ?? 0;
                let kt = Be.get(Ze.pluginId) ?? 0;
                if (Tt !== kt) {
                  return kt - Tt;
                }
                return We.entry.name.localeCompare(Ze.entry.name);
              });
            } else {
              Ge.sort((We, Ze) => We.entry.name.localeCompare(Ze.entry.name));
            }
          } catch (Be) {
            if (_e) {
              return;
            }
            logForDebugging(`Failed to fetch install counts: ${he(Be)}`);
            Ge.sort((We, Ze) => We.entry.name.localeCompare(Ze.entry.name));
          }
          _(Ge);
          z(0);
          K(new Set());
          A(false);
          O("");
        } catch (Ue) {
          if (_e) {
            return;
          }
          t(Ue instanceof Error ? Ue.message : "Failed to load plugins");
        } finally {
          if (me.current === xe) {
            S(false);
          }
        }
      }
      ke(d);
      return () => {
        _e = true;
      };
    }, [d, t, O]);
    let Te = async () => {
      if (V.size === 0) {
        return;
      }
      let _e = y.filter(Be => V.vZc(Be.pluginId));
      Q(new Set(_e.map(Be => Be.pluginId)));
      let xe = 0;
      let ke = 0;
      let Ie = [];
      let Ue = [];
      for (let Be of _e) {
        let We = await UFe({
          pluginId: Be.pluginId,
          entry: Be.entry,
          marketplaceName: Be.marketplaceName,
          scope: "user"
        });
        if (We.success) {
          if (xe++, We.installedDisabled) {
            Ue.push(Be.entry.name);
          }
        } else {
          ke++;
          Ie.push({
            name: Be.entry.name,
            reason: We.error
          });
        }
      }
      Q(new Set());
      K(new Set());
      Ag();
      let Ge = Ue.length > 0 ? ` Disabled by default \u2014 enable in /plugin: ${Ue.join(", ")}.` : "";
      if (ke === 0) {
        let Be = `\u2713 Installed ${xe} ${un(xe, "plugin")}. Run /reload-plugins to activate.${Ge}`;
        r(Be);
      } else if (xe === 0) {
        t(`Failed to install: ${evt(Ie, true)}`);
      } else {
        let Be = `\u2713 Installed ${xe} of ${xe + ke} plugins. Failed: ${evt(Ie, false)}. Run /reload-plugins to activate successfully installed plugins.${Ge}`;
        r(Be);
      }
      if (xe > 0) {
        await s();
      }
      o({
        type: "menu"
      });
    };
    let ue = async (_e, xe = "user") => {
      re(true);
      ae(null);
      let ke = await UFe({
        pluginId: _e.pluginId,
        entry: _e.entry,
        marketplaceName: _e.marketplaceName,
        scope: xe
      });
      if (ke.success) {
        let Ie = await wZt(_e.pluginId);
        if (Ie) {
          re(false);
          u({
            type: "plugin-options",
            plugin: Ie,
            pluginId: _e.pluginId,
            depNote: ke.depNote
          });
          return;
        }
        r(ke.message);
        await s();
        o({
          type: "menu"
        });
      } else {
        re(false);
        ae(ke.error);
      }
    };
    ob.useEffect(() => {
      if (e) {
        r(e);
      }
    }, [e, r]);
    jo({
      "select:previous": () => {
        if (j > 0) {
          z(j - 1);
        }
      },
      "select:next": () => {
        if (j < h.length - 1) {
          z(j + 1);
        }
      },
      "select:accept": () => {
        let _e = h[j];
        if (_e) {
          p(_e.name);
          u("plugin-list");
        }
      }
    }, {
      context: "Select",
      isActive: c === "marketplace-list"
    });
    function ce(_e) {
      if (x) {
        P(_e);
        return;
      }
      if (_e.ctrl || _e.meta || b) {
        return;
      }
      if (_e.key === "/") {
        _e.preventDefault();
        A(true);
        O("");
      } else if (_e.key.length === 1 && _e.key !== " ") {
        _e.preventDefault();
        A(true);
        O(_e.key);
      }
    }
    function le(_e) {
      if (x) {
        F(_e);
        return;
      }
      if (b) {
        return;
      }
      let xe = (_e.text.split(/\r\n|\r|\n/, 2)[0] ?? "").trim();
      if (!xe) {
        return;
      }
      _e.preventDefault();
      A(true);
      O(xe);
    }
    jo({
      "select:previous": () => {
        if (j === 0) {
          if (y.length > 0) {
            A(true);
          }
        } else {
          Z.handleSelectionChange(j - 1, z);
        }
      },
      "select:next": () => {
        if (j < W.length - 1) {
          Z.handleSelectionChange(j + 1, z);
        }
      },
      "select:accept": () => {
        if (j < W.length) {
          let _e = W[j];
          if (_e) {
            if (_e.isInstalled) {
              o({
                type: "manage-plugins",
                targetPlugin: _e.entry.name,
                targetMarketplace: _e.marketplaceName
              });
            } else {
              f(_e);
              u("plugin-details");
              oe(0);
              ae(null);
            }
          }
        }
      }
    }, {
      context: "Select",
      isActive: c === "plugin-list" && !x && !b
    });
    jo({
      "plugin:toggle": () => {
        if (j < W.length) {
          let _e = W[j];
          if (_e && !_e.isInstalled) {
            let xe = new Set(V);
            if (xe.vZc(_e.pluginId)) {
              xe.delete(_e.pluginId);
            } else {
              xe.add(_e.pluginId);
            }
            K(xe);
          }
        }
      },
      "plugin:install": () => {
        if (V.size === 0) {
          return false;
        }
        if (J.size > 0) {
          return;
        }
        Te();
      }
    }, {
      context: "Plugin",
      isActive: c === "plugin-list" && !x && !b
    });
    let pe = ob.useMemo(() => {
      if (!m) {
        return [];
      }
      let _e = m.entry.homepage;
      let xe = wUe(m);
      return awt(_e, xe);
    }, [m]);
    if (jo({
      "select:previous": () => {
        if (ne > 0) {
          oe(ne - 1);
        }
      },
      "select:next": () => {
        if (ne < pe.length - 1) {
          oe(ne + 1);
        }
      },
      "select:accept": () => {
        if (!m) {
          return;
        }
        let _e = pe[ne]?.action;
        let xe = m.entry.homepage;
        let ke = wUe(m);
        if (_e === "install-user") {
          ue(m, "user");
        } else if (_e === "install-project") {
          ue(m, "project");
        } else if (_e === "install-local") {
          ue(m, "local");
        } else if (_e === "homepage" && xe) {
          Ac(xe);
        } else if (_e === "github" && ke) {
          Ac(`https://github.com/${ke}`);
        } else if (_e === "back") {
          u("plugin-list");
          f(null);
        }
      }
    }, {
      context: "Select",
      isActive: c === "plugin-details" && !!m && !b && !ee
    }), typeof c === "object" && c.type === "plugin-options") {
      return _i.jsx(Oar, {
        viewState: c,
        onFinish: (_e, xe) => {
          if (r(_e), xe) {
            s();
          }
          o({
            type: "menu"
          });
        }
      });
    }
    if (b) {
      return _i.jsx(Xc, {
        message: "Loading\u2026"
      });
    }
    if (e) {
      return _i.jsx(Hc, {
        error: e
      });
    }
    if (c === "marketplace-list") {
      if (h.length === 0) {
        return _i.jsxs(gXd, {
          flexDirection: "column",
          children: [_i.jsx(gXd, {
            marginBottom: 1,
            children: _i.jsx(Text, {
              bold: true,
              children: "Select marketplace"
            })
          }), _i.jsx(Text, {
            children: "No marketplaces configured."
          }), _i.jsxs(Text, {
            dimColor: true,
            children: ["Add a marketplace first using ", "'Add marketplace'", "."]
          }), _i.jsx(gXd, {
            marginTop: 1,
            paddingLeft: 1,
            children: _i.jsx(Text, {
              dimColor: true,
              children: _i.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })
            })
          })]
        });
      }
      return _i.jsxs(gXd, {
        flexDirection: "column",
        children: [_i.jsx(gXd, {
          marginBottom: 1,
          children: _i.jsx(Text, {
            bold: true,
            children: "Select marketplace"
          })
        }), de && _i.jsx(gXd, {
          marginBottom: 1,
          flexDirection: "column",
          children: _i.jsxs(Text, {
            color: "warning",
            children: [_i.jsx(Ps, {
              status: "warning",
              withSpace: true
            }), de]
          })
        }), h.map((_e, xe) => _i.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: xe < h.length - 1 ? 1 : 0,
          children: [_i.jsx(gXd, {
            children: _i.jsxs(Text, {
              color: j === xe ? "suggestion" : undefined,
              children: [j === xe ? vGd.pointer : " ", " ", _e.name]
            })
          }), _i.jsx(gXd, {
            marginLeft: 2,
            children: _i.jsx(Text, {
              dimColor: true,
              children: _i.jsxs(Hn, {
                children: [_i.jsxs(_i.Fragment, {
                  children: [_e.totalPlugins, " ", un(_e.totalPlugins, "plugin"), " available"]
                }), _e.installedCount > 0 && `${_e.installedCount} already installed`, _e.source]
              })
            })
          })]
        }, _e.name)), _i.jsx(gXd, {
          marginTop: 1,
          children: _i.jsx(Text, {
            dimColor: true,
            italic: true,
            children: _i.jsxs(Hn, {
              children: [_i.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), _i.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (c === "plugin-details" && m) {
      let _e = m.entry.homepage;
      let xe = wUe(m);
      let ke = awt(_e, xe);
      return _i.jsxs(gXd, {
        flexDirection: "column",
        children: [_i.jsx(gXd, {
          marginBottom: 1,
          children: _i.jsx(Text, {
            bold: true,
            children: "Plugin Details"
          })
        }), _i.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [_i.jsx(Text, {
            bold: true,
            children: ES(m.entry)
          }), m.entry.version && _i.jsxs(Text, {
            dimColor: true,
            children: ["Version: ", m.entry.version]
          }), _i.jsx(Uar, {
            pluginId: m.pluginId
          }), m.entry.description && _i.jsx(gXd, {
            marginTop: 1,
            children: _i.jsx(Text, {
              children: m.entry.description
            })
          }), m.entry.author && _i.jsx(gXd, {
            marginTop: 1,
            children: _i.jsxs(Text, {
              dimColor: true,
              children: ["By:", " ", typeof m.entry.author === "string" ? m.entry.author : m.entry.author.name]
            })
          })]
        }), _i.jsx(Bar, {
          plugin: m
        }), _i.jsx(b6m, {
          pluginId: m.pluginId
        }), _i.jsx(Nar, {}), se && _i.jsx(gXd, {
          marginBottom: 1,
          children: _i.jsx(Hc, {
            error: se
          })
        }), _i.jsx(gXd, {
          flexDirection: "column",
          children: ke.map((Ie, Ue) => _i.jsxs(gXd, {
            children: [ne === Ue && _i.jsx(Text, {
              children: "> "
            }), ne !== Ue && _i.jsx(Text, {
              children: "  "
            }), _i.jsx(Text, {
              bold: ne === Ue,
              children: ee && Ie.action.startsWith("install-") ? "Installing\u2026" : Ie.label
            })]
          }, Ie.action))
        }), _i.jsx(gXd, {
          marginTop: 1,
          paddingLeft: 1,
          children: _i.jsx(Text, {
            dimColor: true,
            children: _i.jsxs(Hn, {
              children: [_i.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), _i.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (y.length === 0) {
      return _i.jsxs(gXd, {
        flexDirection: "column",
        children: [_i.jsx(gXd, {
          marginBottom: 1,
          children: _i.jsx(Text, {
            bold: true,
            children: "Install plugins"
          })
        }), _i.jsx(sc, {
          hint: "All plugins from this marketplace are already installed.",
          children: "No new plugins available to install."
        }), _i.jsx(gXd, {
          marginLeft: 3,
          children: _i.jsx(Text, {
            dimColor: true,
            italic: true,
            children: _i.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "go back"
            })
          })
        })]
      });
    }
    let ve = Z.getVisibleItems(W);
    return _i.jsxs(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: ce,
      onPaste: le,
      children: [_i.jsxs(gXd, {
        children: [_i.jsx(Text, {
          bold: true,
          children: "Install Plugins"
        }), Z.needsPagination && _i.jsxs(Text, {
          dimColor: true,
          children: [" ", "(", Z.scrollPosition.current, "/", Z.scrollPosition.total, ")"]
        })]
      }), _i.jsx(gXd, {
        marginBottom: 1,
        children: _i.jsx(YM, {
          query: I,
          isFocused: x,
          isTerminalFocused: U,
          width: N - 4,
          cursorOffset: M,
          onCursorOffsetChange: L,
          onFocus: () => A(true)
        })
      }), W.length === 0 && I && _i.jsx(gXd, {
        marginBottom: 1,
        children: _i.jsxs(sc, {
          children: ['No plugins match "', I, '"']
        })
      }), Z.scrollPosition.canScrollUp && _i.jsx(gXd, {
        children: _i.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowUp, " more above"]
        })
      }), ve.map((_e, xe) => {
        let ke = Z.toActualIndex(xe);
        let Ie = j === ke;
        let Ue = V.vZc(_e.pluginId);
        let Ge = J.vZc(_e.pluginId);
        let Be = xe === ve.length - 1;
        let We = E?.get(_e.pluginId);
        return _i.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: Be && !e ? 0 : 1,
          children: [_i.jsxs(gXd, {
            children: [_i.jsxs(Text, {
              color: Ie && !x ? "suggestion" : undefined,
              children: [Ie && !x ? vGd.pointer : " ", " "]
            }), _i.jsxs(Text, {
              color: _e.isInstalled ? "success" : undefined,
              children: [_e.isInstalled ? vGd.tick : Ge ? vGd.ellipsis : Ue ? vGd.radioOn : vGd.radioOff, " ", ES(_e.entry), _e.entry.category && _i.jsxs(Text, {
                dimColor: true,
                children: [" [", _e.entry.category, "]"]
              }), _e.entry.tags?.includes("community-managed") && _i.jsx(Text, {
                dimColor: true,
                children: " [Community Managed]"
              }), _i.jsx(lie, {
                when: _e.isInstalled,
                children: "installed"
              }), We !== undefined && d === "claude-plugins-official" && _i.jsxs(Text, {
                dimColor: true,
                children: [" \xB7 ", Iar(We), " installs"]
              })]
            })]
          }), _e.entry.description && _i.jsxs(gXd, {
            marginLeft: 4,
            children: [_i.jsx(Text, {
              dimColor: true,
              children: truncateToWidth(_e.entry.description, 60)
            }), _e.entry.version && _i.jsxs(Text, {
              dimColor: true,
              children: [" \xB7 v", _e.entry.version]
            })]
          })]
        }, _e.pluginId);
      }), Z.scrollPosition.canScrollDown && _i.jsx(gXd, {
        children: _i.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowDown, " more below"]
        })
      }), e && _i.jsx(gXd, {
        marginTop: 1,
        children: _i.jsxs(Text, {
          color: "error",
          children: [_i.jsx(Ps, {
            status: "error",
            withSpace: true
          }), e]
        })
      }), _i.jsx(t8l, {
        hasSelection: V.size > 0,
        canToggle: j < W.length && !W[j]?.isInstalled,
        canView: j < W.length
      })]
    });
  }
  function b6m(e) {
    let t = r8l.c(21);
    let {
      pluginId: n
    } = e;
    let [r, o] = ob.useState(null);
    let s;
    let i;
    if (t[0] !== n) {
      s = () => {
        o(null);
        let y = false;
        Y6l(n, getCanonicalName(getMainLoopModel())).then(_ => {
          if (!y) {
            o(_);
          }
        }).catch(S6m);
        return () => {
          y = true;
        };
      };
      i = [n];
      t[0] = n;
      t[1] = s;
      t[2] = i;
    } else {
      s = t[1];
      i = t[2];
    }
    if (ob.useEffect(s, i), r === null) {
      return null;
    }
    let a = r.alwaysOn >= 2000;
    let l;
    if (t[3] !== r.isEstimate) {
      l = r.isEstimate && _i.jsx(Text, {
        dimColor: true,
        children: " (estimated)"
      });
      t[3] = r.isEstimate;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== l) {
      c = _i.jsxs(Text, {
        bold: true,
        children: ["Context cost", l, ":"]
      });
      t[5] = l;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u = a ? "warning" : undefined;
    let d = !a;
    let p;
    if (t[7] !== r.alwaysOn) {
      p = formatTokenEstimate(r.alwaysOn);
      t[7] = r.alwaysOn;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m;
    if (t[9] !== u || t[10] !== d || t[11] !== p) {
      m = _i.jsxs(Text, {
        color: u,
        dimColor: d,
        children: ["\xB7 Every turn: ", p, " tokens"]
      });
      t[9] = u;
      t[10] = d;
      t[11] = p;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== r.onInvoke) {
      f = formatTokenEstimate(r.onInvoke);
      t[13] = r.onInvoke;
      t[14] = f;
    } else {
      f = t[14];
    }
    let h;
    if (t[15] !== f) {
      h = _i.jsxs(Text, {
        dimColor: true,
        children: ["\xB7 When invoked: ", f, " tokens"]
      });
      t[15] = f;
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== h || t[18] !== c || t[19] !== m) {
      g = _i.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [c, m, h]
      });
      t[17] = h;
      t[18] = c;
      t[19] = m;
      t[20] = g;
    } else {
      g = t[20];
    }
    return g;
  }
  function S6m() {}
  var r8l;
  var ob;
  var _i;
  var s8l = __lazy(() => {
    Sd();
    Uvt();
    Ai();
    xb();
    bv();
    Pv();
    Vf();
    Cfe();
    sie();
    ki();
    et();
    Bs();
    ky();
    je();
    dt();
    cs();
    Eo();
    p5();
    Qk();
    Cwe();
    yT();
    EUe();
    OGe();
    EZt();
    rie();
    Xk();
    Zn();
    dI();
    Dar();
    Q3o();
    Z3o();
    $ar();
    r8l = __toESM(pt(), 1);
    ob = __toESM(ot(), 1);
    _i = __toESM(ie(), 1);
  });
  function a8l({
    error: e,
    setError: t,
    result: n,
    setResult: r,
    setViewState: o,
    onInstallComplete: s,
    onSearchModeChange: i,
    getSessionContext: a,
    grantedSuggestions: l,
    targetPlugin: c
  }) {
    let [u, d] = RE.useState("plugin-list");
    let [p, m] = RE.useState(null);
    let [f, h] = RE.useState([]);
    let [g, y] = RE.useState(true);
    let [_, b] = RE.useState(null);
    let [S, E] = RE.useState(new Map());
    let [C, x] = RE.useState(false);
    let A = () => x(false);
    let {
      query: k,
      setQuery: I,
      cursorOffset: O,
      setCursorOffset: M,
      handleKeyDown: L,
      handlePaste: P
    } = U0({
      isActive: u === "plugin-list" && C && !g,
      onExit: A,
      onExitUp: A
    });
    let F = C && k !== "";
    RE.useEffect(() => {
      i(F);
    }, [F, i]);
    RE.useEffect(() => () => i(false), [i]);
    let H = useTerminalFocus();
    let {
      columns: U
    } = Sr();
    let N = RE.useMemo(() => {
      if (!k) {
        return f;
      }
      let _e = k.toLowerCase();
      return f.filter(xe => xe.entry.name.toLowerCase().includes(_e) || xe.entry.displayName?.toLowerCase().includes(_e) || xe.entry.description?.toLowerCase().includes(_e) || xe.marketplaceName.toLowerCase().includes(_e));
    }, [f, k]);
    let [W, j] = RE.useState(0);
    let [z, V] = RE.useState(new Set());
    let [K, J] = RE.useState(new Set());
    let Q = lwt({
      totalItems: N.length,
      selectedIndex: W
    });
    RE.useEffect(() => {
      j(0);
    }, [k]);
    let [Z, ne] = RE.useState(0);
    let [oe, ee] = RE.useState(false);
    let [re, se] = RE.useState(null);
    let [ae, de] = RE.useState(null);
    let [be, fe] = RE.useState(null);
    RE.useEffect(() => {
      let _e = false;
      async function xe() {
        try {
          let ke = await hf();
          let {
            marketplaces: Ie,
            failures: Ue
          } = await Xse(ke);
          if (_e) {
            return;
          }
          let Ge = [];
          for (let {
            name: ht,
            data: It
          } of Ie) {
            if (It) {
              for (let Rt of It.plugins) {
                let wt = OZ(Rt.name, ht);
                Ge.push({
                  entry: Rt,
                  marketplaceName: ht,
                  pluginId: wt,
                  isInstalled: qG(wt)
                });
              }
            }
          }
          let Be = Ge.filter(ht => !ht.isInstalled && !isPluginBlockedByPolicy(ht.pluginId));
          try {
            let ht = await owt();
            if (_e) {
              return;
            }
            if (b(ht), ht) {
              Be.sort((It, Rt) => {
                let wt = ht.get(It.pluginId) ?? 0;
                let vt = ht.get(Rt.pluginId) ?? 0;
                if (wt !== vt) {
                  return vt - wt;
                }
                return It.entry.name.localeCompare(Rt.entry.name);
              });
            } else {
              Be.sort((It, Rt) => It.entry.name.localeCompare(Rt.entry.name));
            }
          } catch (ht) {
            logForDebugging(`Failed to fetch install counts: ${he(ht)}`);
            Be.sort((It, Rt) => It.entry.name.localeCompare(Rt.entry.name));
          }
          let We = new Map();
          try {
            let ht = a?.();
            let It = new Set(getPluginSuggestionMarketplaces());
            for (let Rt of Be) {
              if (!It.vZc(Rt.marketplaceName)) {
                continue;
              }
              if (Rt.marketplaceName !== "claude-plugins-official") {
                let yt = ke[Rt.marketplaceName]?.source;
                if (!yt || !isMarketplaceSourceDeclaredByPolicy(Rt.marketplaceName, yt)) {
                  continue;
                }
              }
              let wt = Rar(Rt.entry.name, Rt.entry.relevance);
              if (!wt) {
                continue;
              }
              if (Bpl(Rt.pluginId) > 0 && !l?.vZc(Rt.pluginId)) {
                continue;
              }
              let vt = await xar(wt, ht);
              if (vt) {
                We.set(Rt.pluginId, vt);
              }
            }
          } catch (ht) {
            logForDebugging(`Failed to compute plugin suggestions: ${he(ht)}`);
          }
          if (_e) {
            return;
          }
          E(We);
          let Ze = We.size > 0 ? [...Be.filter(ht => We.vZc(ht.pluginId)), ...Be.filter(ht => !We.vZc(ht.pluginId))] : Be;
          h(Ze);
          let Tt = Object.keys(ke).length;
          if (Be.length === 0) {
            let ht = await wBl({
              configuredMarketplaceCount: Tt,
              failedMarketplaceCount: Ue.length
            });
            if (_e) {
              return;
            }
            if (ht === "all-plugins-installed" && Ge.length > 0 && Ge.every(It => It.isInstalled && !U7e(It.pluginId)) && !Ge.some(It => isPluginBlockedByPolicy(It.pluginId))) {
              ht = "all-plugins-project-installed";
            }
            fe(ht);
          }
          let kt = Bn(Ie, ht => ht.data !== null);
          let Ye = tvt(Ue, kt);
          if (Ye) {
            if (Ye.type === "warning") {
              de(Ye.message + (Be.length > 0 ? ". Showing available plugins." : "."));
            } else {
              throw Error(Ye.message);
            }
          }
          if (c) {
            let ht = Ge.find(It => It.entry.name === c);
            if (ht) {
              if (U7e(ht.pluginId)) {
                let It = await rwt(ht.pluginId);
                let Rt = await Par(ht.pluginId, It);
                if (_e) {
                  return;
                }
                if (Rt) {
                  d(Rt);
                } else if (It === null) {
                  t(`Plugin '${ht.pluginId}' is already installed. Use '/plugin' to manage existing plugins.`);
                } else if (r(`Plugin "${ht.pluginId}" is already installed${It.suffix}`), It.changed) {
                  await s?.();
                }
              } else {
                m(ht);
                d("plugin-details");
              }
            } else {
              t(`Plugin "${c}" not found in any marketplace`);
            }
          }
        } catch (ke) {
          if (_e) {
            return;
          }
          t(ke instanceof Error ? ke.message : "Failed to load plugins");
        } finally {
          if (!_e) {
            y(false);
          }
        }
      }
      xe();
      return () => {
        _e = true;
      };
    }, [t, r, s, a, l, c]);
    let me = RE.useRef(false);
    RE.useEffect(() => {
      if (me.current || g || e !== null || n !== null || u !== "plugin-list" || S.size === 0) {
        return;
      }
      me.current = true;
      let _e = [...S.keys()];
      for (let xe of _e) {
        l?.add(xe);
      }
      $pl(_e);
    }, [g, e, n, u, S, l]);
    let Te = async () => {
      if (z.size === 0) {
        return;
      }
      let _e = f.filter(Be => z.vZc(Be.pluginId));
      J(new Set(_e.map(Be => Be.pluginId)));
      let xe = 0;
      let ke = 0;
      let Ie = [];
      let Ue = [];
      for (let Be of _e) {
        let We = await UFe({
          pluginId: Be.pluginId,
          entry: Be.entry,
          marketplaceName: Be.marketplaceName,
          scope: "user"
        });
        if (We.success) {
          if (xe++, We.installedDisabled) {
            Ue.push(Be.entry.name);
          }
        } else {
          ke++;
          Ie.push({
            name: Be.entry.name,
            reason: We.error
          });
        }
      }
      J(new Set());
      V(new Set());
      Ag();
      let Ge = Ue.length > 0 ? ` Disabled by default \u2014 enable in /plugin: ${Ue.join(", ")}.` : "";
      if (ke === 0) {
        let Be = `\u2713 Installed ${xe} ${un(xe, "plugin")}. Run /reload-plugins to activate.${Ge}`;
        r(Be);
      } else if (xe === 0) {
        t(`Failed to install: ${evt(Ie, true)}`);
      } else {
        let Be = `\u2713 Installed ${xe} of ${xe + ke} plugins. Failed: ${evt(Ie, false)}. Run /reload-plugins to activate successfully installed plugins.${Ge}`;
        r(Be);
      }
      if (xe > 0) {
        if (s) {
          await s();
        }
      }
      o({
        type: "menu"
      });
    };
    let ue = async (_e, xe = "user") => {
      ee(true);
      se(null);
      let ke = await UFe({
        pluginId: _e.pluginId,
        entry: _e.entry,
        marketplaceName: _e.marketplaceName,
        scope: xe
      });
      if (ke.success) {
        let Ie = await wZt(_e.pluginId);
        if (Ie) {
          ee(false);
          d({
            type: "plugin-options",
            plugin: Ie,
            pluginId: _e.pluginId,
            depNote: ke.depNote
          });
          return;
        }
        if (r(ke.message), s) {
          await s();
        }
        o({
          type: "menu"
        });
      } else {
        ee(false);
        se(ke.error);
      }
    };
    RE.useEffect(() => {
      if (e) {
        r(e);
      }
    }, [e, r]);
    uo("confirm:no", () => {
      d("plugin-list");
      m(null);
    }, {
      context: "Settings",
      isActive: u === "plugin-details"
    });
    uo("confirm:no", () => {
      o({
        type: "menu"
      });
    }, {
      context: "Settings",
      isActive: u === "plugin-list" && !C
    });
    function ce(_e) {
      if (C) {
        L(_e);
        return;
      }
      if (_e.ctrl || _e.meta || g) {
        return;
      }
      if (_e.key === "/") {
        _e.preventDefault();
        x(true);
        I("");
      } else if (_e.key.length === 1 && _e.key !== " ") {
        _e.preventDefault();
        x(true);
        I(_e.key);
      }
    }
    function le(_e) {
      if (C) {
        P(_e);
        return;
      }
      if (g) {
        return;
      }
      let xe = (_e.text.split(/\r\n|\r|\n/, 2)[0] ?? "").trim();
      if (!xe) {
        return;
      }
      _e.preventDefault();
      x(true);
      I(xe);
    }
    jo({
      "select:previous": () => {
        if (W === 0) {
          if (!g && f.length > 0) {
            x(true);
          }
        } else {
          Q.handleSelectionChange(W - 1, j);
        }
      },
      "select:next": () => {
        if (W < N.length - 1) {
          Q.handleSelectionChange(W + 1, j);
        }
      },
      "select:accept": () => {
        if (W < N.length) {
          let _e = N[W];
          if (_e) {
            if (_e.isInstalled) {
              o({
                type: "manage-plugins",
                targetPlugin: _e.entry.name,
                targetMarketplace: _e.marketplaceName
              });
            } else {
              m(_e);
              d("plugin-details");
              ne(0);
              se(null);
            }
          }
        }
      }
    }, {
      context: "Select",
      isActive: u === "plugin-list" && !C
    });
    jo({
      "plugin:toggle": () => {
        if (W < N.length) {
          let _e = N[W];
          if (_e && !_e.isInstalled) {
            let xe = new Set(z);
            if (xe.vZc(_e.pluginId)) {
              xe.delete(_e.pluginId);
            } else {
              xe.add(_e.pluginId);
            }
            V(xe);
          }
        }
      },
      "plugin:install": () => {
        if (z.size === 0) {
          return false;
        }
        if (K.size > 0) {
          return;
        }
        Te();
      }
    }, {
      context: "Plugin",
      isActive: u === "plugin-list" && !C
    });
    let pe = RE.useMemo(() => {
      if (!p) {
        return [];
      }
      let _e = p.entry.homepage;
      let xe = wUe(p);
      return awt(_e, xe);
    }, [p]);
    if (jo({
      "select:previous": () => {
        if (Z > 0) {
          ne(Z - 1);
        }
      },
      "select:next": () => {
        if (Z < pe.length - 1) {
          ne(Z + 1);
        }
      },
      "select:accept": () => {
        if (!p) {
          return;
        }
        let _e = pe[Z]?.action;
        let xe = p.entry.homepage;
        let ke = wUe(p);
        if (_e === "install-user") {
          ue(p, "user");
        } else if (_e === "install-project") {
          ue(p, "project");
        } else if (_e === "install-local") {
          ue(p, "local");
        } else if (_e === "homepage" && xe) {
          Ac(xe);
        } else if (_e === "github" && ke) {
          Ac(`https://github.com/${ke}`);
        } else if (_e === "back") {
          d("plugin-list");
          m(null);
        }
      }
    }, {
      context: "Select",
      isActive: u === "plugin-details" && !!p && !oe
    }), typeof u === "object" && u.type === "plugin-options") {
      return hi.jsx(Oar, {
        viewState: u,
        onFinish: (_e, xe) => {
          if (r(_e), xe && s) {
            s();
          }
          o({
            type: "menu"
          });
        }
      });
    }
    if (g) {
      return hi.jsx(Xc, {
        message: "Loading\u2026"
      });
    }
    if (e) {
      return hi.jsx(Hc, {
        error: e
      });
    }
    if (u === "plugin-details" && p) {
      let _e = p.entry.homepage;
      let xe = wUe(p);
      let ke = awt(_e, xe);
      return hi.jsxs(gXd, {
        flexDirection: "column",
        children: [hi.jsx(gXd, {
          marginBottom: 1,
          children: hi.jsx(Text, {
            bold: true,
            children: "Plugin details"
          })
        }), hi.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [hi.jsx(Text, {
            bold: true,
            children: ES(p.entry)
          }), hi.jsxs(Text, {
            dimColor: true,
            children: ["from ", p.marketplaceName]
          }), p.entry.version && hi.jsxs(Text, {
            dimColor: true,
            children: ["Version: ", p.entry.version]
          }), hi.jsx(Uar, {
            pluginId: p.pluginId
          }), p.entry.description && hi.jsx(gXd, {
            marginTop: 1,
            children: hi.jsx(Text, {
              children: p.entry.description
            })
          }), p.entry.author && hi.jsx(gXd, {
            marginTop: 1,
            children: hi.jsxs(Text, {
              dimColor: true,
              children: ["By:", " ", typeof p.entry.author === "string" ? p.entry.author : p.entry.author.name]
            })
          })]
        }), hi.jsx(Bar, {
          plugin: p
        }), hi.jsx(Nar, {}), re && hi.jsx(gXd, {
          marginBottom: 1,
          children: hi.jsx(Hc, {
            error: re
          })
        }), hi.jsx(gXd, {
          flexDirection: "column",
          children: ke.map((Ie, Ue) => hi.jsxs(gXd, {
            children: [Z === Ue && hi.jsx(Text, {
              children: "> "
            }), Z !== Ue && hi.jsx(Text, {
              children: "  "
            }), hi.jsx(Text, {
              bold: Z === Ue,
              children: oe && Ie.action.startsWith("install-") ? "Installing\u2026" : Ie.label
            })]
          }, Ie.action))
        }), hi.jsx(gXd, {
          marginTop: 1,
          children: hi.jsx(Text, {
            dimColor: true,
            children: hi.jsxs(Hn, {
              children: [hi.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), hi.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (f.length === 0) {
      return hi.jsxs(gXd, {
        flexDirection: "column",
        children: [hi.jsx(gXd, {
          marginBottom: 1,
          children: hi.jsx(Text, {
            bold: true,
            children: "Discover plugins"
          })
        }), ae && hi.jsx(gXd, {
          marginBottom: 1,
          children: hi.jsx(gA, {
            status: "warning",
            children: ae
          })
        }), hi.jsx(E6m, {
          reason: be
        }), hi.jsx(gXd, {
          marginTop: 1,
          children: hi.jsx(Text, {
            dimColor: true,
            italic: true,
            children: hi.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "go back"
            })
          })
        })]
      });
    }
    let ve = Q.getVisibleItems(N);
    return hi.jsxs(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: ce,
      onPaste: le,
      children: [hi.jsxs(gXd, {
        children: [hi.jsx(Text, {
          bold: true,
          children: "Discover plugins"
        }), Q.needsPagination && hi.jsxs(Text, {
          dimColor: true,
          children: [" ", "(", Q.scrollPosition.current, "/", Q.scrollPosition.total, ")"]
        })]
      }), hi.jsx(gXd, {
        marginBottom: 1,
        children: hi.jsx(YM, {
          query: k,
          isFocused: C,
          isTerminalFocused: H,
          width: U - 4,
          cursorOffset: O,
          onCursorOffsetChange: M,
          onFocus: () => x(true)
        })
      }), ae && hi.jsx(gXd, {
        marginBottom: 1,
        children: hi.jsx(gA, {
          status: "warning",
          children: ae
        })
      }), N.length === 0 && k && hi.jsx(gXd, {
        marginBottom: 1,
        children: hi.jsxs(sc, {
          children: ['No plugins match "', k, '"']
        })
      }), Q.scrollPosition.canScrollUp && hi.jsx(gXd, {
        children: hi.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowUp, " more above"]
        })
      }), ve.map((_e, xe) => {
        let ke = Q.toActualIndex(xe);
        let Ie = W === ke;
        let Ue = z.vZc(_e.pluginId);
        let Ge = K.vZc(_e.pluginId);
        let Be = _?.get(_e.pluginId);
        let We = S.get(_e.pluginId);
        let Ze = xe === ve.length - 1;
        return hi.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: Ze ? 0 : 1,
          children: [hi.jsxs(gXd, {
            children: [hi.jsxs(Text, {
              color: Ie && !C ? "suggestion" : undefined,
              children: [Ie && !C ? vGd.pointer : " ", " "]
            }), hi.jsxs(Text, {
              children: [Ge ? vGd.ellipsis : Ue ? vGd.radioOn : vGd.radioOff, " ", ES(_e.entry), hi.jsxs(Text, {
                dimColor: true,
                children: [" \xB7 ", _e.marketplaceName]
              }), We && hi.jsxs(Text, {
                dimColor: true,
                children: [" ", "\xB7 ", v6m(We)]
              }), _e.entry.tags?.includes("community-managed") && hi.jsx(Text, {
                dimColor: true,
                children: " [Community Managed]"
              }), Be !== undefined && _e.marketplaceName === "claude-plugins-official" && hi.jsxs(Text, {
                dimColor: true,
                children: [" \xB7 ", Iar(Be), " installs"]
              })]
            })]
          }), _e.entry.description && hi.jsx(gXd, {
            marginLeft: 4,
            children: hi.jsx(Text, {
              dimColor: true,
              children: truncateToWidth(_e.entry.description, 60)
            })
          })]
        }, `${Q.startIndex}-${_e.pluginId}`);
      }), Q.scrollPosition.canScrollDown && hi.jsx(gXd, {
        children: hi.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowDown, " more below"]
        })
      }), hi.jsx(T6m, {
        hasSelection: z.size > 0,
        canToggle: W < N.length && !N[W]?.isInstalled,
        canView: W < N.length
      })]
    });
  }
  function T6m(e) {
    let t = t4o.c(12);
    let {
      hasSelection: n,
      canToggle: r,
      canView: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = n && hi.jsx(Wr, {
        action: "plugin:install",
        context: "Plugin",
        fallback: "i",
        description: "install",
        bold: true
      });
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = hi.jsx(Text, {
        children: "Type to search"
      });
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== r) {
      a = r && hi.jsx(Wr, {
        action: "plugin:toggle",
        context: "Plugin",
        fallback: "Space",
        description: "toggle"
      });
      t[3] = r;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== o) {
      l = o && hi.jsx(Wr, {
        action: "select:accept",
        context: "Select",
        fallback: "Enter",
        description: "view"
      });
      t[5] = o;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      c = hi.jsx(Wr, {
        action: "confirm:no",
        context: "Settings",
        fallback: "Esc",
        description: "go back"
      });
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== s || t[9] !== a || t[10] !== l) {
      u = hi.jsx(gXd, {
        marginTop: 1,
        children: hi.jsx(Text, {
          dimColor: true,
          italic: true,
          children: hi.jsxs(Hn, {
            children: [s, i, a, l, c]
          })
        })
      });
      t[8] = s;
      t[9] = a;
      t[10] = l;
      t[11] = u;
    } else {
      u = t[11];
    }
    return u;
  }
  function E6m(e) {
    let t = t4o.c(7);
    let {
      reason: n
    } = e;
    switch (n) {
      case "git-not-installed":
        {
          let r;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "Git is required to install marketplaces."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Please install git and restart Claude Code."
              })]
            });
            t[0] = r;
          } else {
            r = t[0];
          }
          return r;
        }
      case "all-blocked-by-policy":
        {
          let r;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "Your organization policy does not allow any external marketplaces."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Contact your administrator."
              })]
            });
            t[1] = r;
          } else {
            r = t[1];
          }
          return r;
        }
      case "policy-restricts-sources":
        {
          let r;
          if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "Your organization restricts which marketplaces can be added."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Switch to the Marketplaces tab to view allowed sources."
              })]
            });
            t[2] = r;
          } else {
            r = t[2];
          }
          return r;
        }
      case "all-marketplaces-failed":
        {
          let r;
          if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "Failed to load marketplace data."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Check your network connection."
              })]
            });
            t[3] = r;
          } else {
            r = t[3];
          }
          return r;
        }
      case "all-plugins-installed":
        {
          let r;
          if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "All available plugins are already installed."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Check for new plugins later or add more marketplaces."
              })]
            });
            t[4] = r;
          } else {
            r = t[4];
          }
          return r;
        }
      case "all-plugins-project-installed":
        {
          let r;
          if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsxs(hi.Fragment, {
              children: [hi.jsx(Text, {
                dimColor: true,
                children: "All available plugins are installed for this project."
              }), hi.jsx(Text, {
                dimColor: true,
                children: "Use the Browse tab to install at user scope."
              })]
            });
            t[5] = r;
          } else {
            r = t[5];
          }
          return r;
        }
      case "no-marketplaces-configured":
      default:
        {
          let r;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            r = hi.jsx(sc, {
              hint: "Add a marketplace first using the Marketplaces tab.",
              children: "No plugins available."
            });
            t[6] = r;
          } else {
            r = t[6];
          }
          return r;
        }
    }
  }
  function v6m(e) {
    switch (e.signal) {
      case "cwd":
        return "suggested for this directory";
      case "cli":
        return `suggested for ${truncateToWidth(e.command, 32)} commands`;
      case "hosts":
        return `suggested for ${truncateToWidth(e.host, 32)}`;
      case "filesRead":
        return `suggested for ${i8l(e.file)}`;
      case "manifestDep":
        return `suggested from ${i8l(e.file)}`;
    }
  }
  function i8l(e) {
    return truncatePathMiddle(Pd(e).replaceAll("\\", "/"), 32);
  }
  var t4o;
  var RE;
  var hi;
  var l8l = __lazy(() => {
    Sd();
    Ai();
    xb();
    bv();
    Pv();
    nwt();
    Cfe();
    sie();
    ki();
    et();
    Bs();
    vbt();
    ky();
    je();
    dt();
    Zl();
    p5();
    Qk();
    Cwe();
    yT();
    EUe();
    OGe();
    EZt();
    rie();
    Xk();
    twt();
    Zn();
    dI();
    Dar();
    Q3o();
    Z3o();
    $ar();
    t4o = __toESM(pt(), 1);
    RE = __toESM(ot(), 1);
    hi = __toESM(ie(), 1);
  });
  async function C6m(e) {
    let t = [];
    let n = [];
    let r;
    try {
      r = await CZt.readdir(e);
    } catch (o) {
      if (fn(o)) {
        return {
          queries: [],
          warnings: [`No evals/ folder found at ${e}. Create one with at least ${5} <name>.md files (frontmatter: query, should_trigger).`]
        };
      }
      throw o;
    }
    for (let o of r.filter(s => s.endsWith(".md")).sort()) {
      let s = Kwe.join(e, o);
      let i;
      try {
        i = await CZt.readFile(s, "utf8");
      } catch (d) {
        n.push(`Could not read ${o}: ${he(d)}`);
        continue;
      }
      let a = i.match(Kne);
      if (!a) {
        n.push(`${o}: missing YAML frontmatter (expected ---\\nquery: \u2026\\nshould_trigger: \u2026\\n---).`);
        continue;
      }
      let l;
      try {
        l = Zj(a[1] ?? "");
      } catch (d) {
        n.push(`${o}: invalid YAML \u2014 ${he(d)}`);
        continue;
      }
      let c = w6m().safeParse(l);
      if (!c.success) {
        let d = c.error.issues.map(p => `${p.path.join(".")}: ${p.message}`).join("; ");
        n.push(`${o}: ${d}`);
        continue;
      }
      let u = i.slice(a[0].length).trim();
      t.push({
        file: o,
        query: c.data.query,
        shouldTrigger: c.data.should_trigger,
        ...(u && {
          notes: u
        })
      });
    }
    if (t.length > 0 && t.length < 5) {
      n.push(`Only ${t.length} eval ${t.length === 1 ? "query" : "queries"} found; the spec recommends at least ${5} for meaningful coverage.`);
    }
    return {
      queries: t,
      warnings: n
    };
  }
  async function R6m(e) {
    try {
      let n = (await CZt.readFile(Kwe.join(e, "SKILL.md"), "utf8")).match(Kne);
      if (!n) {
        return "";
      }
      let r = Zj(n[1] ?? "");
      if (r && typeof r === "object" && "description" in r && typeof r.description === "string") {
        return r.description;
      }
    } catch {}
    return "";
  }
  async function d8l(e, t, n) {
    let r = e === "~" || e.startsWith("~/") ? Kwe.join(c8l.homedir(), e.slice(1)) : e;
    let o = Kwe.resolve(r);
    let s = Kwe.basename(o);
    let i = await R6m(o);
    let a = Kwe.join(o, "evals");
    let {
      queries: l,
      warnings: c
    } = await C6m(a);
    let u = [];
    for (let d of l) {
      if (t.aborted) {
        break;
      }
      try {
        let p = await n({
          skillName: s,
          description: i,
          query: d,
          signal: t
        });
        if (p === null) {
          u.push({
            query: d,
            modelWouldTrigger: null,
            reason: "Model evaluation not yet wired up \u2014 tracks the plugin evaluation framework.",
            verdict: "skipped"
          });
          continue;
        }
        u.push({
          query: d,
          modelWouldTrigger: p.wouldTrigger,
          reason: p.reason,
          verdict: p.wouldTrigger === d.shouldTrigger ? "pass" : "fail"
        });
      } catch (p) {
        logForDebugging(`plugin eval: trigger test for ${d.file} threw: ${he(p)}`, {
          level: "error"
        });
        u.push({
          query: d,
          modelWouldTrigger: null,
          reason: he(p),
          verdict: "fail"
        });
      }
    }
    return {
      pluginName: s,
      pluginPath: o,
      evalsPath: a,
      queries: l,
      warnings: c,
      triggerResults: u,
      passCount: Bn(u, d => d.verdict === "pass"),
      failCount: Bn(u, d => d.verdict === "fail"),
      skippedCount: Bn(u, d => d.verdict === "skipped")
    };
  }
  function p8l(e) {
    let t = [];
    t.push(`Evaluating ${e.pluginName} (${e.evalsPath})`);
    t.push("");
    for (let n of e.warnings) {
      t.push(`! ${n}`);
    }
    if (e.warnings.length > 0) {
      t.push("");
    }
    if (e.queries.length === 0) {
      t.push("No eval queries to run.");
      return t.join(`
`);
    }
    t.push("Level 1 \u2014 trigger tests:");
    for (let n of e.triggerResults) {
      let r = n.verdict.toUpperCase().padEnd(7);
      let o = n.query.shouldTrigger ? "trigger" : "skip";
      if (n.verdict === "skipped") {
        t.push(`  [${r}] ${n.query.file} \u2014 expected ${o}`);
      } else {
        let s = n.modelWouldTrigger ? "trigger" : "skip";
        if (t.push(`  [${r}] ${n.query.file} \u2014 expected ${o}, got ${s}`), n.verdict === "fail") {
          t.push(`            ${n.reason}`);
        }
      }
    }
    if (t.push(""), e.skippedCount === e.triggerResults.length) {
      t.push("All trigger tests skipped \u2014 model evaluation not yet wired up.");
    } else {
      t.push(`${e.passCount}/${e.passCount + e.failCount} trigger tests passed${e.skippedCount > 0 ? ` (${e.skippedCount} skipped)` : ""}.`);
    }
    t.push("");
    t.push("Level 2 \u2014 interplay tests: not yet implemented. Tracks the plugin evaluation framework.");
    return t.join(`
`);
  }
  var CZt;
  var c8l;
  var Kwe;
  var w6m;
  var u8l = async () => null;
  var m8l = __lazy(() => {
    je();
    dt();
    fv();
    CZt = require("fs/promises");
    c8l = require("os");
    Kwe = __toESM(require("path"));
    w6m = we(() => v.object({
      query: v.string().min(1),
      should_trigger: v.boolean()
    }));
  });
  function f8l({
    onComplete: e,
    target: t
  }) {
    let n = Har.useRef(new AbortController());
    Har.useEffect(() => {
      let r = n.current;
      async function o() {
        if (!t) {
          e(`Usage: /plugin eval [path]

Run trigger evaluations for a skill against the queries in its evals/ folder.

Examples:
  /plugin eval ./my-skill
  /plugin eval ~/.claude/skills/pdf-tools

Each evals/*.md file needs frontmatter with \`query\` (string)
and \`should_trigger\` (boolean). The spec recommends at least five.

Or from the command line:
  claude plugin eval [path]`);
          return;
        }
        try {
          let s = await d8l(t, r.signal, u8l);
          process.exitCode = s.failCount > 0 ? 1 : 0;
          let i = s.queries.length === 0 ? "" : s.failCount > 0 ? `

${vGd.cross} Evaluation failed` : s.skippedCount === s.queries.length ? `

${vGd.info} Eval queries validated; trigger tests pending model integration` : `

${vGd.tick} Evaluation passed`;
          e(p8l(s) + i);
        } catch (s) {
          process.exitCode = 2;
          logForDebugging(`Plugin eval failed for ${t}: ${he(s)}`, {
            level: "error"
          });
          e(`${vGd.cross} ${he(s)}`);
        }
      }
      o();
      return () => r.abort();
    }, [e, t]);
    return r4o.jsx(gXd, {
      flexDirection: "column",
      children: r4o.jsx(Text, {
        children: "Running evaluation\u2026"
      })
    });
  }
  var Har;
  var r4o;
  var h8l = __lazy(() => {
    et();
    je();
    dt();
    m8l();
    Har = __toESM(ot(), 1);
    r4o = __toESM(ie(), 1);
  });
  function o4o(e, t) {
    let n = {
      install: "installed",
      update: "updated",
      uninstall: "uninstalled"
    }[t];
    if (e === "inline") {
      return `This plugin is loaded via --plugin-dir for this session with no marketplace backing \u2014 it cannot be ${n}. Drop the --plugin-dir flag to stop loading it, or \`claude plugin disable\` to turn it off.`;
    }
    return `This plugin is loaded from ${LN(yie.join(er(), "skills"))}/ with no marketplace backing \u2014 it cannot be ${n}. Delete the directory to remove it; \`claude plugin disable\` to turn it off; edits there take effect after /reload-plugins.`;
  }
  function s4o(e) {
    if (!VALID_INSTALLABLE_SCOPES.includes(e)) {
      throw Error(`Invalid scope "${e}". Must be one of: ${VALID_INSTALLABLE_SCOPES.join(", ")}`);
    }
  }
  function uwt(e) {
    return VALID_INSTALLABLE_SCOPES.includes(e);
  }
  function dwt(e) {
    return e === "project" || e === "local" ? getOriginalCwd() : undefined;
  }
  function y8l(e) {
    let t = getSettingsForSource("projectSettings")?.enabledPlugins;
    if (!t) {
      return false;
    }
    let n = Bre(Object.keys(t), e);
    return n !== undefined && t[n] === true;
  }
  function pwt(e) {
    let t = Kw();
    let n = Bre(Object.keys(t.plugins), e);
    if (n) {
      return n;
    }
    for (let r of ["local", "project", "user"]) {
      let o = getSettingsForSource(uM(r))?.enabledPlugins;
      if (!o) {
        continue;
      }
      let s = Bre(Object.keys(o), e);
      if (s) {
        return s;
      }
    }
    return e;
  }
  function mwt(e, t, n) {
    let r = n?.enabledPlugins?.[e];
    return r !== undefined ? r !== false : t.defaultEnabled !== false;
  }
  function g8l(e) {
    let t = e.includes("@");
    let n = e.toLowerCase();
    let r = ["local", "project", "user"];
    for (let o of r) {
      let s = getSettingsForSource(uM(o))?.enabledPlugins;
      if (!s) {
        continue;
      }
      for (let i of Object.keys(s)) {
        if (t ? pOe(i, e) : i.toLowerCase().startsWith(`${n}@`)) {
          return {
            pluginId: i,
            scope: o
          };
        }
      }
    }
    return null;
  }
  function _8l(e, t) {
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    return t.find(o => {
      if (pOe(o.name, e) || pOe(o.name, n)) {
        return true;
      }
      if (r && o.source) {
        return pOe(o.name, n) && o.source.toLowerCase().includes(`@${r.toLowerCase()}`);
      }
      return false;
    });
  }
  function x6m(e) {
    let {
      name: t
    } = Yo(e);
    let n = Kw();
    let r = Object.keys(n.plugins);
    let o = Bre(r, e);
    if (o && n.plugins[o]?.length) {
      return {
        pluginId: o,
        pluginName: t
      };
    }
    let s = r.find(i => {
      let {
        name: a
      } = Yo(i);
      return pOe(a, t) && (n.plugins[i]?.length ?? 0) > 0;
    });
    if (s) {
      return {
        pluginId: s,
        pluginName: t
      };
    }
    return null;
  }
  function jar(e) {
    let t = Kw();
    let n = Bre(Object.keys(t.plugins), e);
    let r = n ? t.plugins[n] : undefined;
    if (!r || r.length === 0) {
      return {
        scope: "user"
      };
    }
    let o = getOriginalCwd();
    let s = r.find(l => l.scope === "local" && l.projectPath === o);
    if (s) {
      return {
        scope: s.scope,
        projectPath: s.projectPath
      };
    }
    let i = r.find(l => l.scope === "project" && l.projectPath === o);
    if (i) {
      return {
        scope: i.scope,
        projectPath: i.projectPath
      };
    }
    let a = r.find(l => l.scope === "user");
    if (a) {
      return {
        scope: a.scope
      };
    }
    return {
      scope: r[0].scope,
      projectPath: r[0].projectPath
    };
  }
  async function b8l(e, t = "user") {
    s4o(t);
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    if (UI(r)) {
      return {
        success: false,
        message: o4o(r, "install")
      };
    }
    let o;
    let s;
    let i;
    let a = false;
    if (r) {
      let m = await xO(e);
      if (!m) {
        let h = (await hf())[r];
        if (h && isSourceAllowedByPolicy(h.source) && Oye(r, h, L3()[r]?.autoUpdate)) {
          try {
            await eie(r, undefined, {
              skipIfRecent: true
            });
            a = true;
            m = await xO(e);
          } catch (g) {
            logForDebugging(`Failed to refresh marketplace '${r}' before install; using cached data: ${he(g)}`, {
              level: "warn"
            });
          }
        }
      }
      if (m) {
        o = m.entry;
        s = r;
        i = m.marketplaceInstallLocation;
      }
    } else {
      let m = await hf();
      for (let [f, h] of Object.entries(m)) {
        if (!isSourceAllowedByPolicy(h.source)) {
          continue;
        }
        try {
          let y = (await uL(f)).plugins.find(_ => _.name === n);
          if (y) {
            o = y;
            s = f;
            i = h.installLocation;
            break;
          }
        } catch (g) {
          logForDebugging(`Failed to load marketplace "${f}" while searching for plugin "${n}": ${he(g)}`, {
            level: "error"
          });
          continue;
        }
      }
    }
    if (!o || !s) {
      let m = r ? `marketplace "${r}"` : "any configured marketplace";
      let f = r ? Py("plugin marketplace update", r) : null;
      let h = r && !a ? `. Your local copy may be out of date${f ? ` \u2014 try \`${f}\`` : " \u2014 update it from /plugin > Marketplaces"}.` : "";
      return {
        success: false,
        message: `Plugin "${n}" not found in ${m}${h}`
      };
    }
    let l = o;
    let c = `${l.name}@${s}`;
    if (await o2l(c, t)) {
      if (!(await j3o(c)).some(h => h.type !== "dependency-unsatisfied" || h.reason !== "not-found")) {
        let h = qBl(c, t, dwt(t));
        let g = await rwt(c);
        return {
          success: true,
          message: `Plugin "${c}" is already installed (scope: ${t})${h ? " \u2014 marked as manually installed" : ""}${g?.suffix ?? ""}`,
          pluginId: c,
          pluginName: l.name,
          scope: t
        };
      }
    }
    let u = await zXt({
      pluginId: c,
      entry: l,
      scope: t,
      marketplaceInstallLocation: i,
      trigger: "cli"
    });
    if (!u.ok) {
      switch (u.reason) {
        case "local-source-no-location":
          return {
            success: false,
            message: `Cannot install local plugin "${u.pluginName}" without marketplace install location`
          };
        case "settings-write-failed":
          return {
            success: false,
            message: `Failed to update settings: ${u.message}`
          };
        case "resolution-failed":
          return {
            success: false,
            message: F$o(u.resolution)
          };
        case "blocked-by-policy":
          return {
            success: false,
            message: `Plugin "${u.pluginName}" is blocked by your organization's policy and cannot be installed`
          };
        case "dependency-blocked-by-policy":
          return {
            success: false,
            message: `Plugin "${u.pluginName}" depends on "${u.blockedDependency}", which is blocked by your organization's policy`
          };
        case "marketplace-blocked-by-policy":
          return {
            success: false,
            message: `Plugin "${u.pluginName}" is from marketplace "${u.marketplaceName}", which is blocked by your organization's policy`
          };
        case "dependency-marketplace-blocked-by-policy":
          return {
            success: false,
            message: `Plugin "${u.pluginName}" depends on "${u.blockedDependency}" from marketplace "${u.marketplaceName}", which is blocked by your organization's policy`
          };
        case "range-conflict":
          {
            let m = u.dep === c ? "Plugin" : "Dependency";
            return {
              success: false,
              message: sqt(m, u.dep, u.ranges, u.why, u.installed)
            };
          }
        case "no-matching-tag":
          {
            let m = u.dep === c ? "Plugin" : "Dependency";
            return {
              success: false,
              message: DFn(m, u.dep, u.range)
            };
          }
      }
    }
    let d = Py("plugin enable", c);
    let p = u.installedDisabled.includes(c) ? `. This plugin is disabled by default${d ? ` \u2014 enable it with: ${d}` : " \u2014 enable it in /plugin"}` : "";
    return {
      success: true,
      message: `Successfully installed plugin: ${c} (scope: ${t})${u.depNote}${p}`,
      pluginId: c,
      pluginName: l.name,
      scope: t
    };
  }
  async function Ywe(e, t = "user", n = true) {
    s4o(t);
    let {
      marketplace: r
    } = Yo(e);
    if (UI(r)) {
      return {
        success: false,
        message: o4o(r, "uninstall")
      };
    }
    let {
      enabled: o,
      disabled: s
    } = await loadAllPlugins();
    let i = [...o, ...s];
    let a = _8l(e, i);
    let l = uM(t);
    let c = getSettingsForSource(l);
    let u;
    let d;
    if (a) {
      let A = Object.keys(c?.enabledPlugins ?? {});
      let k = a.name.toLowerCase();
      let I = e.includes("@");
      u = A.find(O => O === e || O === a.name || O.startsWith(`${a.name}@`)) ?? A.find(O => {
        let M = O.toLowerCase();
        return pOe(O, e) || M === k || !I && M.startsWith(`${k}@`);
      }) ?? (I ? e : a.name);
      d = a.name;
    } else {
      let A = x6m(e);
      if (!A) {
        return {
          success: false,
          message: `Plugin "${e}" not found in installed plugins`
        };
      }
      u = A.pluginId;
      d = A.pluginName;
    }
    let p = dwt(t);
    let m = Kw();
    u = Bre(Object.keys(m.plugins), u) ?? u;
    let f = m.plugins[u];
    let h = f?.find(A => A.scope === t && A.projectPath === p);
    if (!h) {
      let {
        scope: A
      } = jar(u);
      if (A !== t && f && f.length > 0) {
        if (A === "project") {
          let k = Py("plugin disable", e, "--scope local");
          return {
            success: false,
            message: `Plugin "${e}" is enabled at project scope (.claude/settings.json, shared with your team). To disable just for you${k ? `: ${k}` : ", use claude plugin disable with --scope local"}`
          };
        }
        return {
          success: false,
          message: `Plugin "${e}" is installed in ${A} scope, not ${t}. Use --scope ${A} to uninstall.`
        };
      }
      return {
        success: false,
        message: `Plugin "${e}" is not installed in ${t} scope. Use --scope to specify the correct scope.`
      };
    }
    let g = h.installPath;
    let y = {
      ...c?.enabledPlugins
    };
    let _ = Bre(Object.keys(y), u) ?? u;
    y[_] = undefined;
    updateSettingsForSource(l, {
      enabledPlugins: y
    });
    Ag();
    Aor(u, t, p);
    let S = Kw().plugins[u];
    let E = !S || S.length === 0;
    if (E && g) {
      await OFe(g);
    }
    if (E) {
      if (await Uft(u), Aut([u]), n) {
        await Pdt(u);
      }
    }
    let C = NFn(u, i);
    let x = vso(C);
    return {
      success: true,
      message: `Successfully uninstalled plugin: ${d} (scope: ${t})${x}`,
      pluginId: u,
      pluginName: d,
      scope: t,
      reverseDependents: C.length > 0 ? C : undefined
    };
  }
  async function i4o(e, t, n, r) {
    let o = t ? "enable" : "disable";
    let {
      marketplace: s
    } = Yo(e);
    if (zea(e) || s === "skills-dir" || s === "inline") {
      let S = "user";
      let E = e;
      let C;
      if (s === "skills-dir" || s === "inline") {
        let O = await loadAllPlugins();
        let M = _8l(e, [...O.enabled, ...O.disabled].filter(P => Yo(P.source).marketplace === s));
        if (M) {
          E = M.source;
          C = M.manifest.defaultEnabled === false;
        }
        let L = g8l(E);
        if (E = L?.pluginId ?? E, n) {
          if (getSettingsForSource(uM(n))?.enabledPlugins?.[E] === undefined && L && CUe[L.scope] > CUe[n]) {
            return {
              success: false,
              message: `Plugin "${E}" is set at ${L.scope} scope (which overrides ${n}). Use --scope ${L.scope} or omit --scope to auto-detect.`
            };
          }
          S = n;
        } else {
          S = L?.scope ?? "user";
        }
      }
      if (t && s === "skills-dir") {
        if (!areLocalPluginDirsAllowedByPolicy()) {
          return {
            success: false,
            message: localPluginDirsBlockedMessage(LN(yie.join(er(), "skills")))
          };
        }
      }
      if (t && isPluginBlockedByPolicy(E)) {
        return {
          success: false,
          message: `Plugin "${E}" is blocked by your organization's policy and cannot be enabled`
        };
      }
      let x = uM(S);
      let A = t && (s === "skills-dir" || s === "inline") && x === "userSettings" && C === false ? undefined : t;
      let {
        error: k
      } = updateSettingsForSource(x, {
        enabledPlugins: {
          ...getSettingsForSource(x)?.enabledPlugins,
          [E]: A
        }
      });
      if (k) {
        return {
          success: false,
          message: `Failed to ${o} plugin: ${k.message}`
        };
      }
      Ag();
      let {
        name: I
      } = Yo(E);
      return {
        success: true,
        message: `Successfully ${o}d plugin: ${I}`,
        pluginId: E,
        pluginName: I,
        scope: S
      };
    }
    if (n) {
      s4o(n);
    }
    let i;
    let a;
    let l = g8l(e);
    if (n) {
      if (a = n, l) {
        i = l.pluginId;
      } else if (e.includes("@")) {
        i = e;
      } else {
        return {
          success: false,
          message: `Plugin "${e}" not found in settings. Use plugin@marketplace format.`
        };
      }
    } else if (l) {
      i = l.pluginId;
      a = l.scope;
    } else if (e.includes("@")) {
      i = e;
      a = "user";
    } else {
      return {
        success: false,
        message: `Plugin "${e}" not found in any editable settings scope. Use plugin@marketplace format.`
      };
    }
    if (t && isPluginBlockedByPolicy(i)) {
      return {
        success: false,
        message: `Plugin "${i}" is blocked by your organization's policy and cannot be enabled`
      };
    }
    let c = uM(a);
    let u = getSettingsForSource(c)?.enabledPlugins?.[i];
    let d = n && l && CUe[n] > CUe[l.scope];
    if (n && u === undefined && l && l.scope !== n && !d) {
      return {
        success: false,
        message: `Plugin "${e}" is installed at ${l.scope} scope, not ${n}. Use --scope ${l.scope} or omit --scope to auto-detect.`
      };
    }
    let p = n && !d ? u === true : getPluginEditableScopes().vZc(i);
    if (t === p) {
      return {
        success: false,
        alreadyInGoalState: true,
        message: `Plugin "${e}" is already ${t ? "enabled" : "disabled"}${n ? ` at ${n} scope` : ""}`
      };
    }
    let m;
    if (!t) {
      let {
        enabled: S,
        disabled: E
      } = await loadAllPlugins();
      let C = NFn(i, [...S, ...E]);
      if (C.length > 0) {
        m = C;
      }
      if (C.length > 0 && !r?.bypassDependentsBlock) {
        let {
          name: x
        } = Yo(i);
        let k = [...vta(i, [...S, ...E]), i].map(O => Py("plugin disable", O));
        let I = k.every(O => O !== null) ? `, or disable everything together: ${k.join(" && ")}` : ", or disable them together in /plugin.";
        return {
          success: false,
          message: `${x} is still required by ${C.join(", ")}. Disable ${un(C.length, "that plugin", "those plugins")} first${I}`,
          reverseDependents: C
        };
      }
    }
    let f = [];
    if (t) {
      let {
        enabled: S,
        disabled: E
      } = await loadAllPlugins();
      let {
        closure: C,
        missing: x
      } = xta(i, [...S, ...E]);
      if (x.length > 0) {
        let {
          name: M
        } = Yo(i);
        let L = x.map(F => Py("plugin install", F));
        let P = L.every(F => F !== null) ? `: ${L.join(" && ")}` : " from /plugin.";
        return {
          success: false,
          message: `${M} depends on ${x.join(", ")}, which ${un(x.length, "is", "are")} not installed. Install ${un(x.length, "it", "them")} first${P}`
        };
      }
      let A = C.filter(M => isPluginBlockedByPolicy(M));
      if (A.length > 0) {
        let {
          name: M
        } = Yo(i);
        return {
          success: false,
          message: `${M} depends on ${A.join(", ")}, which ${un(A.length, "is", "are")} blocked by your organization's plugin policy. Ask an admin to allow ${un(A.length, "it", "them")}.`
        };
      }
      let k = [...VALID_INSTALLABLE_SCOPES].sort((M, L) => CUe[L] - CUe[M]);
      let I = [];
      for (let M of C) {
        for (let L of k) {
          if (CUe[L] <= CUe[a]) {
            continue;
          }
          let P = getSettingsForSource(uM(L))?.enabledPlugins?.[M];
          if (P === undefined) {
            continue;
          }
          if (P === false) {
            I.push({
              dep: M,
              scope: L
            });
          }
          break;
        }
      }
      if (I.length > 0) {
        let {
          name: M
        } = Yo(i);
        let L = I.map(H => `${H.dep} (${H.scope} scope)`).join(", ");
        let P = Ro(I.map(H => H.scope));
        let F = P.length === 1 ? `, or use --scope ${P[0]} to write where the override lives` : "";
        return {
          success: false,
          message: `${M} depends on ${L}, which ${un(I.length, "is", "are")} disabled there. Enable ${un(I.length, "it", "them")} at that scope${F}.`
        };
      }
      let O = PGe(c);
      f = C.filter(M => !O.vZc(M));
    }
    let h = {
      ...getSettingsForSource(c)?.enabledPlugins,
      [i]: t,
      ...Object.fromEntries(f.map(S => [S, true]))
    };
    let {
      error: g
    } = updateSettingsForSource(c, {
      enabledPlugins: h
    });
    if (g) {
      return {
        success: false,
        message: `Failed to ${o} plugin: ${g.message}`
      };
    }
    if (Ag(), t) {
      wFn([i, ...f]);
      ita([i, ...f]);
    }
    let {
      name: y
    } = Yo(i);
    let _ = vso(m);
    let b = f.length > 0 ? ` (also enabled ${f.length} ${un(f.length, "dependency", "dependencies")}: ${f.map(S => Yo(S).name).join(", ")})` : "";
    return {
      success: true,
      message: `Successfully ${o}d plugin: ${y} (scope: ${a})${_}${b}`,
      pluginId: i,
      pluginName: y,
      scope: a,
      reverseDependents: m
    };
  }
  async function fwt(e, t) {
    return i4o(e, true, t);
  }
  async function hwt(e, t) {
    return i4o(e, false, t);
  }
  async function S8l() {
    let e = getPluginEditableScopes();
    if (e.size === 0) {
      return {
        success: true,
        message: "No enabled plugins to disable"
      };
    }
    let t = [];
    let n = [];
    for (let [r] of e) {
      let o = await i4o(r, false, undefined, {
        bypassDependentsBlock: true
      });
      if (o.success) {
        t.push(r);
      } else {
        n.push(`${r}: ${o.message}`);
      }
    }
    if (n.length > 0) {
      return {
        success: false,
        message: `Disabled ${t.length} ${un(t.length, "plugin")}, ${n.length} failed:
${n.join(`
`)}`
      };
    }
    return {
      success: true,
      message: `Disabled ${t.length} ${un(t.length, "plugin")}`
    };
  }
  async function gwt(e, t) {
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    if (UI(r)) {
      return {
        success: false,
        message: o4o(r, "update")
      };
    }
    let o = r;
    let s = o ? `${n}@${o}` : e;
    let i = KO();
    let a = Bre(Object.keys(i.plugins), s);
    if (a) {
      s = a;
      ({
        marketplace: o
      } = Yo(s));
    }
    let l = a ? i.plugins[a] : undefined;
    let c;
    if (o) {
      let _ = (await hf())[o]?.source;
      if (_ && !isSourceAllowedByPolicy(_)) {
        return {
          success: false,
          message: `Plugin "${n}" is from marketplace "${o}", which is blocked by your organization's policy`,
          pluginId: s,
          scope: t
        };
      }
      if (_ && (_.source === "github" || _.source === "git" || _.source === "url")) {
        try {
          await eie(o, undefined, {
            skipIfRecent: true
          });
        } catch (b) {
          c = `marketplace not refreshed (${he(b)})`;
          logForDebugging(`Failed to refresh marketplace '${o}' before update; using cached data: ${he(b)}`, {
            level: "warn"
          });
        }
      }
    }
    let u = await xO(s);
    if (!u) {
      return {
        success: false,
        message: `Plugin "${n}" not found`,
        pluginId: s,
        scope: t
      };
    }
    let {
      entry: d,
      marketplaceInstallLocation: p
    } = u;
    if (!l || l.length === 0) {
      return {
        success: false,
        message: `Plugin "${n}" is not installed`,
        pluginId: s,
        scope: t
      };
    }
    let m = dwt(t);
    let f = l.filter(y => y.scope === t);
    let h = f.find(y => y.projectPath === m);
    if (!h && f.length > 1) {
      logForDebugging(`updatePluginOp: ${f.length} ${t}-scope installs, none match CWD '${m}'; updating '${f[0]?.projectPath}' only`, {
        level: "warn"
      });
    }
    let g = h ?? f[0];
    if (!g) {
      let y = m ? `${t} (${m})` : t;
      return {
        success: false,
        message: `Plugin "${n}" is not installed at scope ${y}`,
        pluginId: s,
        scope: t
      };
    }
    return k6m({
      pluginId: s,
      pluginName: n,
      entry: d,
      marketplaceInstallLocation: p,
      installation: g,
      scope: t,
      projectPath: g.projectPath,
      refreshWarning: c
    });
  }
  async function k6m({
    pluginId: e,
    pluginName: t,
    entry: n,
    marketplaceInstallLocation: r,
    installation: o,
    scope: s,
    projectPath: i,
    refreshWarning: a
  }) {
    let l = zt();
    let c = o.version;
    let {
      enabled: u,
      disabled: d
    } = await loadAllPlugins();
    let p = Sta(e, [...u, ...d]);
    let m = p.filter(x => x.constraint.version !== undefined);
    let f = p.map(x => x.constraint.version).filter(x => x !== undefined);
    let h;
    let g = "";
    if (f.length > 0) {
      let x = oqt(f);
      if (!x.ok) {
        return {
          success: true,
          skipped: true,
          message: `Skipped \u2014 ${sqt("Plugin", e, f, x.reason)}`,
          pluginId: e,
          scope: s,
          blockedBy: m.map(I => I.plugin.source),
          oldVersion: c
        };
      }
      let A = (await hf())[Yo(e).marketplace ?? ""]?.source;
      let k = Mor(n.source) ?? (typeof n.source === "string" ? WXt(A) : null);
      if (k !== null && x.range !== "*") {
        let I = await Lor(k, n.name, x.range);
        if (I === null) {
          logForDebugging(`performPluginUpdate(${e}): no ${n.name}--v* tag satisfying ${x.range}; falling back to HEAD + post-fetch guard`);
        } else if (I.version === o.resolvedVersion && I.sha === o.gitCommitSha) {
          return {
            success: true,
            message: `${t} is already at the latest version satisfying ${f.join(", ")} (${I.version}, required by ${m.map(O => O.plugin.name).join(", ")}).${a ? ` Warning: ${a} \u2014 version shown may be stale.` : ""}`,
            pluginId: e,
            newVersion: o.version,
            oldVersion: c,
            alreadyUpToDate: true,
            scope: s
          };
        } else if (h = I, g = ` (highest tag satisfying ${f.join(", ")} from ${m.map(O => O.plugin.name).join(", ")})`, typeof n.source === "string") {
          let O = Nor(A, n.source);
          if (O !== null) {
            n = {
              ...n,
              source: O
            };
          }
        }
      }
    }
    let y;
    let _;
    let b;
    let S = false;
    let E;
    let C;
    if (typeof n.source !== "string") {
      let x = n.source;
      let A = h && (x.source === "github" || x.source === "url" || x.source === "git-subdir") ? {
        ...x,
        ref: h.ref,
        sha: h.sha
      } : x;
      let k = await cachePlugin(A, {
        manifest: {
          name: n.name
        }
      });
      y = k.path;
      S = true;
      E = h?.sha ?? k.gitCommitSha;
      b = k.manifest?.version;
      let I = await nie(e, n.source, k.manifest, k.path, n.version, h?.sha ?? k.gitCommitSha);
      _ = h && (k.manifest?.version || n.version) ? `${I}-${h.sha.substring(0, 12)}` : I;
    } else {
      let x;
      try {
        x = await l.stat(r);
      } catch (k) {
        if (fn(k)) {
          return {
            success: false,
            message: `Marketplace directory not found at ${r}`,
            pluginId: e,
            scope: s
          };
        }
        throw k;
      }
      C = x.isDirectory() ? r : yie.dirname(r);
      y = yie.join(C, n.source);
      try {
        await l.stat(y);
      } catch (k) {
        if (fn(k)) {
          return {
            success: false,
            message: `Plugin source not found at ${y}`,
            pluginId: e,
            scope: s
          };
        }
        throw k;
      }
      let A;
      try {
        A = (await loadPluginManifest(y, n.name, n.source)).manifest;
      } catch {}
      b = A?.version;
      E = (await N$o(y)) ?? undefined;
      _ = await nie(e, n.source, A, y, n.version);
    }
    try {
      if (h === undefined && f.length > 0) {
        let P = cwt.valid(b) ?? cwt.coerce(b)?.version;
        let F = p.filter(({
          constraint: H
        }) => H.version !== undefined && P !== undefined && !cwt.satisfies(P, H.version)).map(({
          plugin: H
        }) => H.source);
        if (F.length > 0) {
          return {
            success: true,
            skipped: true,
            message: `Skipped \u2014 ${F.join(", ")} requires ${t} at a version range that ${b ?? _} does not satisfy`,
            pluginId: e,
            scope: s,
            blockedBy: F,
            oldVersion: c
          };
        }
      }
      let x = getVersionedCachePath(e, _);
      let A = _ === "unknown";
      let k = getVersionedZipCachePath(e, _);
      if (!A && (o.version === _ || o.installPath === x || o.installPath === k)) {
        let P = `${t} is already at the latest version (${_}).`;
        return {
          success: true,
          message: a ? `${P} Warning: ${a} \u2014 version shown may be stale.` : P,
          pluginId: e,
          newVersion: _,
          oldVersion: c,
          alreadyUpToDate: true,
          scope: s
        };
      }
      x = await copyPluginToVersionedCache(y, e, _, n, C, {
        forceOverwrite: A
      });
      let O = o.installPath;
      if (HBl(e, s, i, x, _, E, h?.version), O && O !== x) {
        let P = KO();
        if (!Object.values(P.plugins).some(H => H.some(U => U.installPath === O))) {
          await OFe(O);
        }
      }
      let M = i ? `${s} (${i})` : s;
      let L = A && (c ?? "unknown") === "unknown" ? `Plugin "${t}" refreshed from source for scope ${M}. Restart to apply changes.` : `Plugin "${t}" updated from ${c || "unknown"} to ${_}${g} for scope ${M}. Restart to apply changes.`;
      return {
        success: true,
        message: a ? `${L} Warning: ${a}.` : L,
        pluginId: e,
        newVersion: _,
        oldVersion: c,
        scope: s
      };
    } finally {
      let x = getVersionedCachePath(e, _);
      if (S && y !== x && !yie.resolve(x).startsWith(yie.resolve(y) + yie.sep)) {
        await l.rm(y, {
          recursive: true,
          force: true
        });
      }
    }
  }
  var yie;
  var cwt;
  var VALID_INSTALLABLE_SCOPES;
  var CUe;
  var VALID_UPDATE_SCOPES;
  var ywt = __lazy(() => {
    at();
    vut();
    je();
    gn();
    dt();
    ku();
    p5();
    MSe();
    Qk();
    yT();
    EUe();
    k1();
    Kf();
    rie();
    xg();
    a9();
    Xk();
    CYe();
    GXt();
    TC();
    Zn();
    dV();
    yie = require("path");
    cwt = __toESM(lq(), 1);
    VALID_INSTALLABLE_SCOPES = ["user", "project", "local"];
    CUe = {
      user: 0,
      project: 1,
      local: 2
    };
    VALID_UPDATE_SCOPES = ["user", "project", "local", "managed"];
  });
  function T8l(e) {
    if (qar = e, RZt !== null) {
      e(RZt.updated, RZt.blocked);
      RZt = null;
    }
    return () => {
      qar = null;
    };
  }
  async function I6m() {
    let e = await hf();
    let t = L3();
    let n = new Set();
    for (let [r, o] of Object.entries(e)) {
      if (!isSourceAllowedByPolicy(o.source)) {
        continue;
      }
      if (Oye(r, o, t[r]?.autoUpdate)) {
        n.add(r.toLowerCase());
      }
    }
    return n;
  }
  async function P6m(e, t, n) {
    let r = false;
    let o = false;
    let s = null;
    for (let {
      scope: i
    } of t) {
      try {
        let a = await gwt(e, i);
        if (a.success && !a.alreadyUpToDate && !a.skipped) {
          r = true;
          logForDebugging(`Plugin autoupdate: updated ${e} from ${a.oldVersion} to ${a.newVersion}`);
        } else if (a.skipped) {
          if (logForDebugging(`Plugin autoupdate: ${e} ${a.message}`), a.blockedBy && a.blockedBy.length > 0) {
            let l = a.blockedBy.map(u => Yo(u).name);
            let c = a.blockedBy.filter(u => n.vZc(u)).map(u => Yo(u).name);
            s = {
              type: "autoupdate-blocked-by-pinner",
              source: e,
              plugin: Yo(e).name,
              heldAt: a.oldVersion,
              blockedBy: l,
              disabledPinners: c
            };
          }
        } else if (!a.alreadyUpToDate) {
          o = true;
          logForDebugging(`Plugin autoupdate: failed to update ${e}: ${a.message}`, {
            level: "warn"
          });
        }
      } catch (a) {
        o = true;
        logForDebugging(`Plugin autoupdate: error updating ${e}: ${he(a)}`, {
          level: "warn"
        });
      }
    }
    return {
      updated: r ? e : null,
      blocked: s,
      failed: o
    };
  }
  async function a4o(e) {
    let t = KO();
    let n = Object.keys(t.plugins);
    if (n.length === 0) {
      return {
        updated: [],
        blocked: [],
        updateFailedCount: 0
      };
    }
    let {
      disabled: r
    } = await loadAllPluginsCacheOnly();
    let o = new Set(r.map(c => c.source));
    let s = await Promise.allSettled(n.map(async c => {
      let {
        marketplace: u
      } = Yo(c);
      if (!u || !e.vZc(u.toLowerCase())) {
        return null;
      }
      let d = t.plugins[c];
      if (!d || d.length === 0) {
        return null;
      }
      let p = d.filter(gfe);
      if (p.length === 0) {
        return null;
      }
      return P6m(c, p, o);
    }));
    let i = [];
    let a = [];
    let l = 0;
    for (let c of s) {
      if (c.status !== "fulfilled" || c.value === null) {
        continue;
      }
      if (c.value.updated !== null) {
        i.push(c.value.updated);
      }
      if (c.value.blocked !== null) {
        a.push(c.value.blocked);
      }
      if (c.value.failed) {
        l++;
      }
    }
    return {
      updated: i,
      blocked: a,
      updateFailedCount: l
    };
  }
  async function O6m(e) {
    return a4o(e);
  }
  function E8l() {
    return (async () => {
      if (shouldSkipPluginAutoupdate()) {
        logForDebugging("Plugin autoupdate: skipped (auto-updater disabled)");
        return;
      }
      let e = Date.now();
      let t = {
        marketplaces_refreshed: 0,
        marketplace_refresh_failed: 0,
        plugins_updated: 0,
        plugin_update_failed: 0,
        plugins_blocked_by_pin: 0
      };
      try {
        let n = await I6m();
        if (n.size === 0) {
          return;
        }
        let r = Math.floor(Math.random() * 600000);
        await sleep(r, undefined, {
          unref: true
        });
        e = Date.now();
        let o = getFeatureValue_CACHED_MAY_BE_STALE("tengu_plugin_autoupdate_allow_credential_helper", false);
        let s = await Promise.allSettled(Array.from(n).map(async p => {
          try {
            await eie(p, undefined, {
              disableCredentialHelper: !o
            });
            return true;
          } catch (m) {
            logForDebugging(`Plugin autoupdate: failed to refresh marketplace ${p}: ${he(m)}`, {
              level: "warn"
            });
            return false;
          }
        }));
        t.marketplace_refresh_failed = Bn(s, p => p.status !== "fulfilled" || !p.value);
        t.marketplaces_refreshed = n.size - t.marketplace_refresh_failed;
        let i = s.filter(p => p.status === "rejected");
        if (i.length > 0) {
          logForDebugging(`Plugin autoupdate: ${i.length} marketplace refresh(es) failed`, {
            level: "warn"
          });
        }
        logForDebugging("Plugin autoupdate: checking installed plugins");
        let {
          updated: a,
          blocked: l,
          updateFailedCount: c
        } = await O6m(n);
        if (t.plugins_updated = a.length, t.plugin_update_failed = c, t.plugins_blocked_by_pin = l.length, a.length > 0) {
          clearPluginCache("autoupdate dep-resolution");
        }
        let {
          errors: u
        } = await loadAllPluginsCacheOnly();
        let d = await zwe(u.filter(p => {
          if (p.type !== "dependency-unsatisfied") {
            return false;
          }
          let m = Yo(p.source).marketplace;
          return m !== undefined && n.vZc(m.toLowerCase());
        }));
        if (d.installed.length > 0) {
          logForDebugging(`Plugin autoupdate: resolved ${d.installed.length} missing plugin dependencies: ${d.installed.join(", ")}`);
          a.push(...d.installed);
        }
        if (a.length > 0 || l.length > 0) {
          if (qar) {
            qar(a, l);
          } else {
            RZt = {
              updated: a,
              blocked: l
            };
          }
        }
        logEvent("tengu_plugin_autoupdate_pass", {
          outcome: t.marketplace_refresh_failed > 0 || t.plugin_update_failed > 0 ? "partial" : "ok",
          ...t,
          duration_ms: Date.now() - e
        });
      } catch (n) {
        logForDebugging(`Plugin autoupdate: failed: ${he(n)}`, {
          level: "error"
        });
        logEvent("tengu_plugin_autoupdate_pass", {
          outcome: "failed",
          error_kind: iX(n),
          ...t,
          duration_ms: Date.now() - e
        });
      }
    })();
  }
  var qar = null;
  var RZt = null;
  var War = __lazy(() => {
    $n();
    Ot();
    ywt();
    je();
    dt();
    Wk();
    Qk();
    yT();
    EUe();
    Kf();
    xg();
    Xk();
    TC();
  });
  function w8l({
    setViewState: e,
    error: t,
    setError: n,
    setResult: r,
    exitState: o,
    onManageComplete: s,
    targetMarketplace: i,
    action: a
  }) {
    let [l, c] = gL.useState([]);
    let [u, d] = gL.useState(true);
    let [p, m] = gL.useState(0);
    let [f, h] = gL.useState(false);
    let [g, y] = gL.useState(null);
    let [_, b] = gL.useState(null);
    let [S, E] = gL.useState(null);
    let [C, x] = gL.useState("list");
    let [A, k] = gL.useState(null);
    let [I, O] = gL.useState(0);
    let M = gL.useRef(false);
    let L = useClock();
    let P = gL.useRef(undefined);
    let F = gL.useRef(true);
    gL.useEffect(() => () => {
      F.current = false;
      P.current?.();
    }, []);
    gL.useEffect(() => {
      async function Z() {
        try {
          let ne = await hf();
          let {
            enabled: oe,
            disabled: ee
          } = await loadAllPlugins();
          let re = [...oe, ...ee];
          let {
            marketplaces: se,
            failures: ae
          } = await Xse(ne);
          let de = L3();
          let be = [];
          for (let {
            name: Te,
            config: ue,
            data: ce
          } of se) {
            let le = re.filter(pe => pe.source.endsWith(`@${Te}`));
            be.push({
              name: Te,
              source: N7e(ue.source),
              lastUpdated: ue.lastUpdated,
              pluginCount: ce?.plugins.length,
              installedPlugins: le,
              pendingUpdate: false,
              pendingRemove: false,
              autoUpdate: Oye(Te, ue, de[Te]?.autoUpdate)
            });
          }
          be.sort((Te, ue) => {
            if (Te.name === "claude-plugin-directory") {
              return -1;
            }
            if (ue.name === "claude-plugin-directory") {
              return 1;
            }
            return Te.name.localeCompare(ue.name);
          });
          c(be);
          let fe = Bn(se, Te => Te.data !== null);
          let me = tvt(ae, fe);
          if (me) {
            if (me.type === "warning") {
              y(me.message);
            } else {
              throw Error(me.message);
            }
          }
          if (i && !M.current && !t) {
            M.current = true;
            let Te = be.findIndex(ue => ue.name === i);
            if (Te >= 0) {
              let ue = be[Te];
              if (a) {
                m(Te + 1);
                let ce = be.map((le, pe) => pe === Te ? {
                  ...le,
                  pendingUpdate: a === "update",
                  pendingRemove: a === "remove"
                } : le);
                c(ce);
                N(ce);
              } else if (ue) {
                m(Te + 1);
                k(ue);
                P.current?.();
                x("details");
              }
            } else {
              n(`Marketplace not found: ${i}`);
            }
          }
        } catch (ne) {
          n(ne instanceof Error ? ne.message : "Failed to load marketplaces");
          y(ne instanceof Error ? ne.message : "Failed to load marketplaces");
        } finally {
          d(false);
        }
      }
      Z();
    }, [i, a, t]);
    let H = () => l.some(Z => Z.pendingUpdate || Z.pendingRemove);
    let U = () => {
      let Z = Bn(l, oe => oe.pendingUpdate);
      let ne = Bn(l, oe => oe.pendingRemove);
      return {
        updateCount: Z,
        removeCount: ne
      };
    };
    let N = async Z => {
      let ne = Z || l;
      let oe = C === "details";
      h(true);
      y(null);
      b(null);
      E(null);
      try {
        let ee = getSettingsForSource("userSettings");
        let re = 0;
        let se = 0;
        let ae = new Set();
        for (let ve of ne) {
          if (ve.pendingRemove) {
            if (ve.installedPlugins.length > 0) {
              let _e = {
                ...ee?.enabledPlugins
              };
              for (let xe of ve.installedPlugins) {
                let ke = OZ(xe.name, ve.name);
                _e[ke] = false;
              }
              updateSettingsForSource("userSettings", {
                enabledPlugins: _e
              });
            }
            await nvt(ve.name);
            se++;
            logEvent("tengu_marketplace_removed", {
              marketplace_name: ve.name,
              plugins_uninstalled: ve.installedPlugins.length
            });
            continue;
          }
          if (ve.pendingUpdate) {
            await eie(ve.name, _e => {
              E(_e);
            });
            re++;
            ae.add(ve.name.toLowerCase());
            logEvent("tengu_marketplace_updated", {
              marketplace_name: ve.name
            });
          }
        }
        let de = 0;
        if (ae.size > 0) {
          let {
            updated: ve
          } = await a4o(ae);
          de = ve.length;
        }
        if (Ag(), await s(), !F.current) {
          return;
        }
        let be = await hf();
        let {
          enabled: fe,
          disabled: me
        } = await loadAllPlugins();
        if (!F.current) {
          return;
        }
        let Te = [...fe, ...me];
        let {
          marketplaces: ue
        } = await Xse(be);
        if (!F.current) {
          return;
        }
        let ce = L3();
        let le = [];
        for (let {
          name: ve,
          config: _e,
          data: xe
        } of ue) {
          let ke = Te.filter(Ie => Ie.source.endsWith(`@${ve}`));
          le.push({
            name: ve,
            source: N7e(_e.source),
            lastUpdated: _e.lastUpdated,
            pluginCount: xe?.plugins.length,
            installedPlugins: ke,
            pendingUpdate: false,
            pendingRemove: false,
            autoUpdate: Oye(ve, _e, ce[ve]?.autoUpdate)
          });
        }
        if (le.sort((ve, _e) => {
          if (ve.name === "claude-plugin-directory") {
            return -1;
          }
          if (_e.name === "claude-plugin-directory") {
            return 1;
          }
          return ve.name.localeCompare(_e.name);
        }), c(le), oe && A) {
          let ve = le.find(_e => _e.name === A.name);
          if (ve) {
            k(ve);
          }
        }
        let pe = [];
        if (re > 0) {
          let ve = de > 0 ? ` (${de} ${un(de, "plugin")} bumped)` : "";
          pe.push(`Updated ${re} ${un(re, "marketplace")}${ve}`);
        }
        if (se > 0) {
          pe.push(`Removed ${se} ${un(se, "marketplace")}`);
        }
        if (pe.length > 0) {
          let ve = `${vGd.tick} ${pe.join(", ")}`;
          if (oe) {
            b(ve);
          } else {
            if (!F.current) {
              return;
            }
            r(ve);
            P.current?.();
            P.current = L.setTimeout(() => e({
              type: "menu"
            }), 2000);
          }
        } else if (!oe) {
          if (!F.current) {
            return;
          }
          e({
            type: "menu"
          });
        }
      } catch (ee) {
        let re = he(ee);
        if (!F.current) {
          return;
        }
        y(re);
        n(re);
      } finally {
        if (F.current) {
          h(false);
          E(null);
        }
      }
    };
    let W = async () => {
      if (!A) {
        return;
      }
      let Z = l.map(ne => ne.name === A.name ? {
        ...ne,
        pendingRemove: true
      } : ne);
      c(Z);
      await N(Z);
    };
    let j = Z => {
      if (!Z) {
        return [];
      }
      let ne = [{
        label: `Browse plugins (${Z.pluginCount ?? 0})`,
        value: "browse"
      }, {
        label: "Update marketplace",
        secondaryLabel: Z.lastUpdated ? `(last updated ${new Date(Z.lastUpdated).toLocaleDateString()})` : undefined,
        value: "update"
      }];
      if (!shouldSkipPluginAutoupdate()) {
        ne.push({
          label: Z.autoUpdate ? "Disable auto-update" : "Enable auto-update",
          value: "toggle-auto-update"
        });
      }
      ne.push({
        label: "Remove marketplace",
        value: "remove"
      });
      return ne;
    };
    let z = async Z => {
      let ne = !Z.autoUpdate;
      try {
        await MBl(Z.name, ne);
        c(oe => oe.map(ee => ee.name === Z.name ? {
          ...ee,
          autoUpdate: ne
        } : ee));
        k(oe => oe ? {
          ...oe,
          autoUpdate: ne
        } : oe);
      } catch (oe) {
        y(oe instanceof Error ? oe.message : "Failed to update setting");
      }
    };
    uo("confirm:no", () => {
      P.current?.();
      x("list");
      O(0);
    }, {
      context: "Confirmation",
      isActive: !f && (C === "details" || C === "confirm-remove")
    });
    uo("confirm:no", () => {
      P.current?.();
      c(Z => Z.map(ne => ({
        ...ne,
        pendingUpdate: false,
        pendingRemove: false
      })));
      m(0);
    }, {
      context: "Confirmation",
      isActive: !f && C === "list" && H()
    });
    uo("confirm:no", () => {
      e({
        type: "menu"
      });
    }, {
      context: "Confirmation",
      isActive: !f && C === "list" && !H()
    });
    jo({
      "select:previous": () => m(Z => Math.max(0, Z - 1)),
      "select:next": () => {
        let Z = l.length + 1;
        m(ne => Math.min(Z - 1, ne + 1));
      },
      "select:accept": () => {
        P.current?.();
        let Z = p - 1;
        if (p === 0) {
          e({
            type: "add-marketplace"
          });
        } else if (H()) {
          N();
        } else {
          let ne = l[Z];
          if (ne) {
            k(ne);
            x("details");
            O(0);
          }
        }
      }
    }, {
      context: "Select",
      isActive: !f && C === "list"
    });
    function V(Z) {
      if (Z.ctrl || Z.meta || f) {
        return;
      }
      let ne = p - 1;
      if ((Z.key === "u" || Z.key === "U") && ne >= 0) {
        Z.preventDefault();
        P.current?.();
        c(oe => oe.map((ee, re) => re === ne ? {
          ...ee,
          pendingUpdate: !ee.pendingUpdate,
          pendingRemove: ee.pendingUpdate ? ee.pendingRemove : false
        } : ee));
      } else if ((Z.key === "d" || Z.key === "D") && ne >= 0) {
        let oe = l[ne];
        if (oe) {
          Z.preventDefault();
          k(oe);
          P.current?.();
          x("confirm-remove");
        }
      }
    }
    jo({
      "select:previous": () => O(Z => Math.max(0, Z - 1)),
      "select:next": () => {
        let Z = j(A);
        O(ne => Math.min(Z.length - 1, ne + 1));
      },
      "select:accept": () => {
        if (P.current?.(), !A) {
          return;
        }
        let ne = j(A)[I];
        if (ne?.value === "browse") {
          e({
            type: "browse-marketplace",
            targetMarketplace: A.name
          });
        } else if (ne?.value === "update") {
          let oe = l.map(ee => ee.name === A.name ? {
            ...ee,
            pendingUpdate: true
          } : ee);
          c(oe);
          N(oe);
        } else if (ne?.value === "toggle-auto-update") {
          z(A);
        } else if (ne?.value === "remove") {
          x("confirm-remove");
        }
      }
    }, {
      context: "Select",
      isActive: !f && C === "details"
    });
    function K(Z) {
      if (Z.ctrl || Z.meta || f) {
        return;
      }
      if (Z.key === "y" || Z.key === "Y") {
        Z.preventDefault();
        P.current?.();
        W();
      } else if (Z.key === "n" || Z.key === "N") {
        Z.preventDefault();
        P.current?.();
        x("list");
        k(null);
      }
    }
    if (u) {
      return Zs.jsx(Text, {
        children: "Loading marketplaces\u2026"
      });
    }
    if (l.length === 0) {
      return Zs.jsxs(gXd, {
        flexDirection: "column",
        children: [Zs.jsx(gXd, {
          marginBottom: 1,
          children: Zs.jsx(Text, {
            bold: true,
            children: "Manage marketplaces"
          })
        }), Zs.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          children: [Zs.jsxs(Text, {
            color: "suggestion",
            children: [vGd.pointer, " +"]
          }), Zs.jsx(Text, {
            bold: true,
            color: "suggestion",
            children: "Add Marketplace"
          })]
        }), Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsx(Text, {
            dimColor: true,
            italic: true,
            children: o.pending ? Zs.jsxs(Zs.Fragment, {
              children: ["Press ", o.keyName, " again to go back"]
            }) : Zs.jsxs(Hn, {
              children: [Zs.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), Zs.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (C === "confirm-remove" && A) {
      let Z = A.installedPlugins.length;
      return Zs.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: K,
        children: [Zs.jsxs(Text, {
          bold: true,
          color: "warning",
          children: ["Remove marketplace ", Zs.jsx(Text, {
            italic: true,
            children: A.name
          }), "?"]
        }), Zs.jsxs(gXd, {
          flexDirection: "column",
          children: [Z > 0 && Zs.jsx(gXd, {
            marginTop: 1,
            children: Zs.jsxs(Text, {
              color: "warning",
              children: ["This will also uninstall ", Z, " ", un(Z, "plugin"), " from this marketplace:"]
            })
          }), A.installedPlugins.length > 0 && Zs.jsx(gXd, {
            flexDirection: "column",
            marginTop: 1,
            marginLeft: 2,
            children: A.installedPlugins.map(ne => Zs.jsx(Pw, {
              children: Zs.jsx(Text, {
                dimColor: true,
                children: ne.name
              })
            }, ne.name))
          }), Zs.jsx(gXd, {
            marginTop: 1,
            children: Zs.jsxs(Text, {
              children: ["Press ", Zs.jsx(Text, {
                bold: true,
                children: "y"
              }), " to confirm or ", Zs.jsx(Text, {
                bold: true,
                children: "n"
              }), " to cancel"]
            })
          })]
        })]
      });
    }
    if (C === "details" && A) {
      let Z = A.pendingUpdate || f;
      let ne = j(A);
      return Zs.jsxs(gXd, {
        flexDirection: "column",
        children: [Zs.jsx(Text, {
          bold: true,
          children: A.name
        }), Zs.jsx(Text, {
          dimColor: true,
          children: A.source
        }), Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsxs(Text, {
            children: [A.pluginCount || 0, " available", " ", un(A.pluginCount || 0, "plugin")]
          })
        }), A.installedPlugins.length > 0 && Zs.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [Zs.jsxs(Text, {
            bold: true,
            children: ["Installed plugins (", A.installedPlugins.length, "):"]
          }), Zs.jsx(gXd, {
            flexDirection: "column",
            marginLeft: 1,
            children: A.installedPlugins.map(oe => Zs.jsxs(Pw, {
              children: [oe.name, `
`, Zs.jsx(Text, {
                dimColor: true,
                children: oe.manifest.description
              })]
            }, oe.name))
          })]
        }), Z && Zs.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [Zs.jsx(Text, {
            color: "claude",
            children: "Updating marketplace\u2026"
          }), S && Zs.jsx(Text, {
            dimColor: true,
            children: S
          })]
        }), !Z && _ && Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsx(Text, {
            color: "claude",
            children: _
          })
        }), !Z && g && Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsx(Hc, {
            error: g
          })
        }), !Z && Zs.jsx(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: ne.map((oe, ee) => {
            if (!oe) {
              return null;
            }
            return Zs.jsxs(_v, {
              isFocused: ee === I,
              children: [oe.label, oe.secondaryLabel && Zs.jsxs(Text, {
                dimColor: true,
                children: [" ", oe.secondaryLabel]
              })]
            }, oe.value);
          })
        }), !Z && !shouldSkipPluginAutoupdate() && A.autoUpdate && Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsx(Text, {
            dimColor: true,
            children: "Auto-update enabled. Claude Code will automatically update this marketplace and its installed plugins."
          })
        }), Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsx(Text, {
            dimColor: true,
            italic: true,
            children: Z ? Zs.jsx(Zs.Fragment, {
              children: "Please wait\u2026"
            }) : Zs.jsxs(Hn, {
              children: [Zs.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), Zs.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    let {
      updateCount: J,
      removeCount: Q
    } = U();
    return Zs.jsxs(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: V,
      children: [Zs.jsx(gXd, {
        marginBottom: 1,
        children: Zs.jsx(Text, {
          bold: true,
          children: "Manage marketplaces"
        })
      }), Zs.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        marginBottom: 1,
        children: [Zs.jsxs(Text, {
          color: p === 0 ? "suggestion" : undefined,
          children: [p === 0 ? vGd.pointer : " ", " +"]
        }), Zs.jsx(Text, {
          bold: true,
          color: p === 0 ? "suggestion" : undefined,
          children: "Add Marketplace"
        })]
      }), Zs.jsx(gXd, {
        flexDirection: "column",
        children: l.map((Z, ne) => {
          let oe = ne + 1 === p;
          let ee = [];
          if (Z.pendingUpdate) {
            ee.push("UPDATE");
          }
          if (Z.pendingRemove) {
            ee.push("REMOVE");
          }
          return Zs.jsxs(gXd, {
            flexDirection: "row",
            gap: 1,
            marginBottom: 1,
            children: [Zs.jsxs(Text, {
              color: oe ? "suggestion" : undefined,
              children: [oe ? vGd.pointer : " ", " ", Z.pendingRemove ? vGd.cross : vGd.bullet]
            }), Zs.jsxs(gXd, {
              flexDirection: "column",
              flexGrow: 1,
              children: [Zs.jsxs(gXd, {
                flexDirection: "row",
                gap: 1,
                children: [Zs.jsxs(Text, {
                  bold: true,
                  strikethrough: Z.pendingRemove,
                  dimColor: Z.pendingRemove,
                  children: [Z.name === "claude-plugins-official" && Zs.jsx(Text, {
                    color: "claude",
                    children: "\u273B "
                  }), Z.name, Z.name === "claude-plugins-official" && Zs.jsx(Text, {
                    color: "claude",
                    children: " \u273B"
                  })]
                }), ee.length > 0 && Zs.jsxs(Text, {
                  color: "warning",
                  children: ["[", ee.join(", "), "]"]
                })]
              }), Zs.jsx(Text, {
                dimColor: true,
                children: Z.source
              }), Zs.jsxs(Text, {
                dimColor: true,
                children: [Z.pluginCount !== undefined && Zs.jsxs(Zs.Fragment, {
                  children: [Z.pluginCount, " available"]
                }), Z.installedPlugins.length > 0 && Zs.jsxs(Zs.Fragment, {
                  children: [" \u2022 ", Z.installedPlugins.length, " installed"]
                }), Z.lastUpdated && Zs.jsxs(Zs.Fragment, {
                  children: [" ", "\u2022 Updated", " ", new Date(Z.lastUpdated).toLocaleDateString()]
                })]
              })]
            })]
          }, Z.name);
        })
      }), H() && Zs.jsxs(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: [Zs.jsxs(Text, {
          children: [Zs.jsx(Text, {
            bold: true,
            children: "Pending changes:"
          }), " ", Zs.jsx(Text, {
            dimColor: true,
            children: Zs.jsx(Wr, {
              action: "select:accept",
              context: "Select",
              fallback: "Enter",
              description: "apply"
            })
          })]
        }), J > 0 && Zs.jsxs(Pw, {
          children: ["Update ", J, " ", un(J, "marketplace")]
        }), Q > 0 && Zs.jsxs(Pw, {
          color: "warning",
          children: ["Remove ", Q, " ", un(Q, "marketplace")]
        })]
      }), f && Zs.jsx(gXd, {
        marginTop: 1,
        children: Zs.jsx(Text, {
          color: "claude",
          children: "Processing changes\u2026"
        })
      }), g && Zs.jsx(gXd, {
        marginTop: 1,
        children: Zs.jsx(Hc, {
          error: g
        })
      }), Zs.jsx(D6m, {
        exitState: o,
        hasPendingActions: H()
      })]
    });
  }
  function D6m(e) {
    let t = v8l.c(18);
    let {
      exitState: n,
      hasPendingActions: r
    } = e;
    if (n.pending) {
      let d;
      if (t[0] !== n.keyName) {
        d = Zs.jsx(gXd, {
          marginTop: 1,
          children: Zs.jsxs(Text, {
            dimColor: true,
            italic: true,
            children: ["Press ", n.keyName, " again to go back"]
          })
        });
        t[0] = n.keyName;
        t[1] = d;
      } else {
        d = t[1];
      }
      return d;
    }
    let o;
    if (t[2] !== r) {
      o = r && Zs.jsx(Wr, {
        action: "select:accept",
        context: "Select",
        fallback: "Enter",
        description: "apply changes"
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    let s;
    if (t[4] !== r) {
      s = !r && Zs.jsx(Wr, {
        action: "select:accept",
        context: "Select",
        fallback: "Enter",
        description: "select"
      });
      t[4] = r;
      t[5] = s;
    } else {
      s = t[5];
    }
    let i;
    if (t[6] !== r) {
      i = !r && Zs.jsx(xt, {
        chord: "u",
        action: "update"
      });
      t[6] = r;
      t[7] = i;
    } else {
      i = t[7];
    }
    let a;
    if (t[8] !== r) {
      a = !r && Zs.jsx(xt, {
        chord: "d",
        action: "remove"
      });
      t[8] = r;
      t[9] = a;
    } else {
      a = t[9];
    }
    let l = r ? "cancel" : "go back";
    let c;
    if (t[10] !== l) {
      c = Zs.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: l
      });
      t[10] = l;
      t[11] = c;
    } else {
      c = t[11];
    }
    let u;
    if (t[12] !== o || t[13] !== s || t[14] !== i || t[15] !== a || t[16] !== c) {
      u = Zs.jsx(gXd, {
        marginTop: 1,
        children: Zs.jsx(Text, {
          dimColor: true,
          italic: true,
          children: Zs.jsxs(Hn, {
            children: [o, s, i, a, c]
          })
        })
      });
      t[12] = o;
      t[13] = s;
      t[14] = i;
      t[15] = a;
      t[16] = c;
      t[17] = u;
    } else {
      u = t[17];
    }
    return u;
  }
  var v8l;
  var gL;
  var Zs;
  var C8l = __lazy(() => {
    Ot();
    Sd();
    Loe();
    Ai();
    bv();
    bs();
    Mue();
    et();
    Bs();
    dt();
    p5();
    Cwe();
    yT();
    War();
    xg();
    TC();
    Zn();
    v8l = __toESM(pt(), 1);
    gL = __toESM(ot(), 1);
    Zs = __toESM(ie(), 1);
  });
  function xZt(e, t, n) {
    let r = j_(e - n + 1, 0, Math.max(0, t - n));
    let o = Math.min(r + n, t);
    return {
      windowStart: r,
      windowEnd: o,
      moreAbove: r,
      moreBelow: t - o
    };
  }
  function R8l({
    count: e,
    visibleCount: t,
    containerRef: n,
    isDisabled: r = false,
    onAccept: o,
    onRowKeyDown: s,
    onCursorChange: i,
    edge: a = "clamp"
  }) {
    let [l, c] = xUe.useState(0);
    let u = useHasFocus(n);
    let d = Math.max(0, e - 1);
    let p = j_(l, 0, d);
    function m(_) {
      c(b => {
        let E = j_(b, 0, d) + _;
        if (a === "wrap" && e > 0) {
          return (E % e + e) % e;
        }
        return j_(E, 0, d);
      });
    }
    xUe.useEffect(() => {
      if (l !== p) {
        c(p);
      }
    }, [l, p]);
    let f = xUe.useRef(i);
    f.current = i;
    let h = xUe.useRef(null);
    xUe.useEffect(() => {
      if (e === 0) {
        h.current = null;
        return;
      }
      if (h.current !== p) {
        h.current = p;
        f.current?.(p);
      }
    }, [p, e]);
    jo({
      "select:next": () => m(1),
      "select:previous": () => m(-1),
      "select:pageDown": () => m(t),
      "select:pageUp": () => m(-t),
      "select:first": () => c(0),
      "select:last": () => c(d)
    }, {
      context: "Select",
      isActive: u && !r && e > 0
    });
    function g(_) {
      if (r || e === 0) {
        return;
      }
      if (_.key === "return" && o) {
        o(p);
        _.preventDefault();
        _.stopImmediatePropagation();
        return;
      }
      s?.(_, p);
    }
    let y = xZt(p, e, t);
    return {
      cursor: p,
      ...y,
      isCursor: _ => _ === p && e > 0,
      hasFocus: u,
      setCursor: _ => c(j_(_, 0, d)),
      bind: {
        tabIndex: 0,
        onKeyDown: g
      }
    };
  }
  var xUe;
  var Gar = __lazy(() => {
    Gno();
    Q8();
    Bs();
    xUe = __toESM(ot(), 1);
  });
  function A8l() {
    return hK.useContext(k8l);
  }
  function M6m({
    children: e,
    visibleCount: t,
    onSelect: n,
    onFocus: r,
    isDisabled: o = false,
    wrap: s = false,
    overflowHint: i = "glyph",
    emptyMessage: a
  }) {
    let l = hK.useRef(null);
    let c = hK.Children.toArray(e);
    let u = c.length;
    let d = R8l({
      count: u,
      visibleCount: t,
      containerRef: l,
      isDisabled: o,
      edge: s ? "wrap" : "clamp",
      onAccept: n
    });
    let p = hK.useRef(r);
    if (p.current = r, hK.useEffect(() => {
      if (u > 0) {
        p.current?.(d.cursor);
      }
    }, [d.cursor, u]), MI(l, !o), u === 0) {
      return x5.jsx(gXd, {
        ref: l,
        flexDirection: "column",
        tabIndex: 0,
        children: a && x5.jsx(Text, {
          dimColor: true,
          children: a
        })
      });
    }
    let m = i === "glyph" && t === 1 ? "count" : i;
    let f = c.slice(d.windowStart, d.windowEnd);
    return x5.jsxs(gXd, {
      ref: l,
      flexDirection: "column",
      ...d.bind,
      children: [m === "count" && d.moreAbove > 0 && x5.jsx(gXd, {
        paddingLeft: 2,
        children: x5.jsxs(Text, {
          dimColor: true,
          children: ["\u2191", " ", d.moreAbove, " more above"]
        })
      }), f.map((h, g) => {
        let y = d.windowStart + g;
        let _ = d.isCursor(y);
        let b = g === 0 && d.moreAbove > 0;
        let S = g === f.length - 1 && d.moreBelow > 0;
        return x5.jsx(k8l.Provider, {
          value: _,
          children: x5.jsx(_v, {
            isFocused: _,
            showScrollUp: m === "glyph" && b,
            showScrollDown: m === "glyph" && S,
            styled: false,
            children: h
          })
        }, hK.isValidElement(h) ? h.key ?? y : y);
      }), m === "count" && d.moreBelow > 0 && x5.jsx(gXd, {
        paddingLeft: 2,
        children: x5.jsxs(Text, {
          dimColor: true,
          children: ["\u2193", " ", d.moreBelow, " more below"]
        })
      })]
    });
  }
  function N6m(e) {
    let t = x8l.c(2);
    let {
      children: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = x5.jsx(x5.Fragment, {
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  var x8l;
  var hK;
  var x5;
  var k8l;
  var _wt;
  var l4o = __lazy(() => {
    wl();
    Oue();
    et();
    Mue();
    Gar();
    x8l = __toESM(pt(), 1);
    hK = __toESM(ot(), 1);
    x5 = __toESM(ie(), 1);
    k8l = hK.createContext(false);
    _wt = Object.assign(M6m, {
      Item: N6m
    });
  });
  function F6m(e) {
    return typeof e === "string" && L6m.vZc(e);
  }
  function I8l() {
    let [e, t] = Var.useState(null);
    Var.useEffect(() => {
      let n = false;
      U6m().then(r => {
        if (!n && r) {
          t(r);
        }
      });
      return () => {
        n = true;
      };
    }, []);
    return e;
  }
  var Var;
  var L6m;
  var U6m;
  var P8l = __lazy(() => {
    je();
    $n();
    bg();
    Var = __toESM(ot(), 1);
    L6m = new Set(["good", "warn", "poor"]);
    U6m = TEr(async () => {
      if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_skills_dashboard_enabled", false)) {
        return null;
      }
      try {
        let e = await _s.get("/api/claude_code/skills", {
          auth: "async",
          timeout: 5000,
          validateStatus: () => true
        });
        if (!e.ok) {
          logForDebugging(`Skill health fetch skipped: ${e.reason}`);
          return null;
        }
        if (e.status >= 400) {
          logForDebugging(`Skill health fetch skipped: status ${e.status}`);
          return null;
        }
        let t = e.data?.skills;
        if (!Array.isArray(t)) {
          return null;
        }
        let n = new Map();
        for (let r of t) {
          if (r.skill_name && F6m(r.health)) {
            n.set(r.skill_name, r.health);
          }
        }
        return n;
      } catch (e) {
        logForDebugging(`Skill health fetch skipped: ${e}`);
        return null;
      }
    });
  });
  function M8l() {
    return D8l.join(XC(), "flagged-plugins.json");
  }
  function H6m(e) {
    let t = qt(e);
    if (typeof t !== "object" || t === null || !("plugins" in t) || typeof t.plugins !== "object" || t.plugins === null) {
      return {};
    }
    let n = t.plugins;
    let r = {};
    for (let [o, s] of Object.entries(n)) {
      if (s && typeof s === "object" && "flaggedAt" in s && typeof s.flaggedAt === "string") {
        let i = {
          flaggedAt: s.flaggedAt
        };
        if ("seenAt" in s && typeof s.seenAt === "string") {
          i.seenAt = s.seenAt;
        }
        r[o] = i;
      }
    }
    return r;
  }
  async function zar() {
    try {
      let e = await kUe.readFile(M8l(), {
        encoding: "utf-8"
      });
      return H6m(e);
    } catch {
      return {};
    }
  }
  async function Kar(e) {
    let t = M8l();
    let n = `${t}.${O8l.randomBytes(8).toString("hex")}.tmp`;
    try {
      await zt().mkdir(XC());
      let r = De({
        plugins: e
      }, null, 2);
      await kUe.writeFile(n, r, {
        encoding: "utf-8",
        mode: 384
      });
      await kUe.rename(n, t);
      k5 = e;
    } catch (r) {
      let o = en(r);
      if (o === "ENOSPC" || o === "EROFS" || o === "EACCES" || o === "ENOENT" || o === "ENOTDIR") {
        logForDebugging(`Failed to persist flagged plugins: ${r}`, {
          level: "error"
        });
      } else {
        Oe(r);
      }
      try {
        await kUe.unlink(n);
      } catch {}
    }
  }
  async function N8l() {
    let e = await zar();
    let t = Date.now();
    let n = false;
    for (let [r, o] of Object.entries(e)) {
      if (o.seenAt && t - new Date(o.seenAt).getTime() >= 172800000) {
        delete e[r];
        n = true;
      }
    }
    if (k5 = e, n) {
      await Kar(e);
    }
  }
  function bwt() {
    return k5 ?? {};
  }
  async function L8l(e) {
    if (k5 === null) {
      k5 = await zar();
    }
    let t = {
      ...k5,
      [e]: {
        flaggedAt: new Date().toISOString()
      }
    };
    await Kar(t);
    logForDebugging(`Flagged plugin: ${e}`);
  }
  async function F8l(e) {
    if (k5 === null) {
      k5 = await zar();
    }
    let t = new Date().toISOString();
    let n = false;
    let r = {
      ...k5
    };
    for (let o of e) {
      let s = r[o];
      if (s && !s.seenAt) {
        r[o] = {
          ...s,
          seenAt: t
        };
        n = true;
      }
    }
    if (n) {
      await Kar(r);
    }
  }
  async function U8l(e) {
    if (k5 === null) {
      k5 = await zar();
    }
    if (!(e in k5)) {
      return;
    }
    let {
      [e]: t,
      ...n
    } = k5;
    k5 = n;
    await Kar(n);
  }
  var O8l;
  var kUe;
  var D8l;
  var k5 = null;
  var Yar = __lazy(() => {
    je();
    dt();
    Rn();
    k1();
    O8l = require("crypto");
    kUe = require("fs/promises");
    D8l = require("path");
  });
  var W8l = {};