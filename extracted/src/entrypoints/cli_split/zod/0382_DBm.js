  function $Xt() {
    return aK.join(XC(), "installed_plugins.json");
  }
  function DBm() {
    return aK.join(XC(), "installed_plugins_v2.json");
  }
  function BBl() {
    tie = null;
    F7e = null;
    logForDebugging("Cleared installed plugins cache");
  }
  function HXt(e, t, n) {
    let r = t instanceof SyntaxError ? "syntax-error" : t instanceof Error && t.name === "ZodError" ? "validation-error" : gd(t) ?? "unknown";
    logEvent("tengu_plugin_state_file_error", {
      operation: e,
      error_kind: r,
      recovered: n
    });
  }
  function MBm() {
    if (BXt) {
      return;
    }
    let e = zt();
    let t = $Xt();
    let n = DBm();
    try {
      try {
        e.renameSync(n, t);
        logForDebugging("Renamed installed_plugins_v2.json to installed_plugins.json");
        let i = Kw();
        FBl(i);
        BXt = true;
        return;
      } catch (i) {
        let a = en(i);
        if (a !== "ENOENT" && a !== "EEXIST") {
          throw i;
        }
        if (a === "EEXIST") {
          try {
            e.unlinkSync(n);
          } catch {}
        }
      }
      let r;
      try {
        r = e.readFileSync(t, {
          encoding: "utf-8"
        });
      } catch (i) {
        if (!fn(i)) {
          throw i;
        }
        BXt = true;
        return;
      }
      let o = qt(r);
      if ((typeof o?.version === "number" ? o.version : 1) === 1) {
        let i = HMt().parse(o);
        let a = w$o(i);
        vj(t, De(a, null, 2));
        logForDebugging(`Converted installed_plugins.json from V1 to V2 format (${Object.keys(i.plugins).length} plugins)`);
        FBl(a);
      }
      BXt = true;
    } catch (r) {
      let o = he(r);
      if (logForDebugging(`Failed to migrate plugin files: ${o}`, {
        level: "error"
      }), !Zd(r) && !(r instanceof SyntaxError)) {
        Oe(sr(r));
      }
      HXt("migrate-single-file", r, true);
      BXt = true;
    }
  }
  function FBl(e) {
    let t = zt();
    let n = getPluginCachePath();
    try {
      let r = new Set();
      for (let s of Object.values(e.plugins)) {
        for (let i of s) {
          r.add(i.installPath);
        }
      }
      let o = t.readdirSync(n);
      for (let s of o) {
        if (!s.isDirectory()) {
          continue;
        }
        let i = s.name;
        let a = aK.join(n, i);
        if (t.readdirSync(a).some(u => {
          if (!u.isDirectory()) {
            return false;
          }
          let d = aK.join(a, u.name);
          return t.readdirSync(d).some(m => m.isDirectory());
        })) {
          continue;
        }
        if (!r.vZc(a)) {
          t.rmSync(a, {
            recursive: true,
            force: true
          });
          logForDebugging(`Cleaned up legacy cache directory: ${i}`);
        }
      }
    } catch (r) {
      let o = he(r);
      logForDebugging(`Failed to clean up legacy cache: ${o}`, {
        level: "warn"
      });
    }
  }
  function v$o() {
    let e = zt();
    let t = $Xt();
    let n;
    try {
      n = e.readFileSync(t, {
        encoding: "utf-8"
      });
    } catch (s) {
      if (fn(s)) {
        return null;
      }
      throw s;
    }
    let r = qt(n);
    return {
      version: typeof r?.version === "number" ? r.version : 1,
      data: r
    };
  }
  function w$o(e) {
    let t = {};
    for (let [n, r] of Object.entries(e.plugins)) {
      let o = getVersionedCachePath(n, r.version);
      t[n] = [{
        scope: "user",
        installPath: o,
        version: r.version,
        installedAt: r.installedAt,
        lastUpdated: r.lastUpdated,
        gitCommitSha: r.gitCommitSha
      }];
    }
    return {
      version: 2,
      plugins: t
    };
  }
  function Kw() {
    if (tie !== null) {
      return tie;
    }
    let e = $Xt();
    try {
      let t = v$o();
      if (t) {
        if (t.version === 2) {
          let o = jMt().parse(t.data);
          tie = o;
          logForDebugging(`Loaded ${Object.keys(o.plugins).length} installed plugins from ${e}`);
          return o;
        }
        let n = HMt().parse(t.data);
        let r = w$o(n);
        tie = r;
        logForDebugging(`Loaded and converted ${Object.keys(n.plugins).length} plugins from V1 format`);
        return r;
      }
      logForDebugging("installed_plugins.json doesn't exist, returning empty V2 object");
      tie = {
        version: 2,
        plugins: {}
      };
      return tie;
    } catch (t) {
      let n = he(t);
      if (logForDebugging(`Failed to load installed_plugins.json: ${n}. Starting with empty state.`, {
        level: "error"
      }), !Zd(t) && !(t instanceof SyntaxError)) {
        Oe(sr(t));
      }
      HXt("load", t, true);
      tie = {
        version: 2,
        plugins: {}
      };
      return tie;
    }
  }
  function rvt(e) {
    let t = zt();
    let n = $Xt();
    try {
      t.mkdirSync(XC());
      let r = De(e, null, 2);
      vj(n, r);
      tie = e;
      logForDebugging(`Saved ${Object.keys(e.plugins).length} installed plugins to ${n}`);
    } catch (r) {
      throw logForDebugging(`Failed to save installed_plugins.json to ${n}: ${he(r)}`, {
        level: "error"
      }), HXt("save", r, false), r;
    }
  }
  function Aor(e, t, n) {
    let r = KO();
    let o = r.plugins[e];
    if (!o) {
      return;
    }
    if (r.plugins[e] = o.filter(s => !(s.scope === t && s.projectPath === n)), r.plugins[e].length === 0) {
      delete r.plugins[e];
    }
    rvt(r);
    logForDebugging(`Removed installation for ${e} at scope ${t}`);
  }
  function $Bl(e) {
    if (e.length === 0) {
      return;
    }
    let t = KO();
    let n = false;
    for (let {
      oldId: r,
      newId: o
    } of e) {
      let s = t.plugins[r];
      if (!s) {
        continue;
      }
      let i = s.filter(a => a.scope === "managed");
      if (i.length === s.length) {
        continue;
      }
      if (i.length > 0) {
        t.plugins[r] = i;
      } else {
        delete t.plugins[r];
      }
      n = true;
    }
    if (!n) {
      return;
    }
    rvt(t);
    NBm();
  }
  function jXt() {
    if (F7e === null) {
      F7e = Kw();
    }
    return F7e;
  }
  function KO() {
    try {
      let e = v$o();
      if (e) {
        if (e.version === 2) {
          return jMt().parse(e.data);
        }
        let t = HMt().parse(e.data);
        return w$o(t);
      }
      return {
        version: 2,
        plugins: {}
      };
    } catch (e) {
      let t = he(e);
      logForDebugging(`Failed to load installed plugins from disk: ${t}`, {
        level: "error"
      });
      HXt("load-from-disk", e, true);
      return {
        version: 2,
        plugins: {}
      };
    }
  }
  function HBl(e, t, n, r, o, s, i) {
    let a = KO();
    let l = a.plugins[e];
    if (!l) {
      logForDebugging(`Cannot update ${e} on disk: plugin not found in installed plugins`);
      return;
    }
    let c = l.find(u => u.scope === t && u.projectPath === n);
    if (c) {
      if (c.installPath = r, c.version !== undefined) {
        c.version = o;
      }
      if (i !== undefined) {
        c.resolvedVersion = i;
      } else {
        delete c.resolvedVersion;
      }
      if (c.lastUpdated = new Date().toISOString(), s !== undefined) {
        c.gitCommitSha = s;
      }
      let u = $Xt();
      vj(u, De(a, null, 2));
      tie = null;
      logForDebugging(`Updated ${e} on disk to version ${o} at ${r}`);
    } else {
      logForDebugging(`Cannot update ${e} on disk: no installation for scope ${t}`);
    }
  }
  function NBm() {
    F7e = null;
  }
  async function jBl() {
    MBm();
    try {
      await R$o();
    } catch (t) {
      if (Zd(t) || t instanceof SyntaxError) {
        logForDebugging(`Plugin migration skipped (fs/parse error): ${he(t)}`, {
          level: "error"
        });
      } else {
        Oe(t);
      }
      HXt("migrate-from-enabled", t, true);
    }
    let e = jXt();
    logForDebugging(`Initialized versioned plugins system with ${Object.keys(e.plugins).length} plugins`);
  }
  function LBl(e) {
    if (!e) {
      return {
        orphanedPaths: [],
        removedPluginIds: []
      };
    }
    let t = KO();
    let n = `@${e}`;
    let r = new Set();
    let o = [];
    for (let s of Object.keys(t.plugins)) {
      if (!s.endsWith(n)) {
        continue;
      }
      for (let i of t.plugins[s] ?? []) {
        if (i.installPath) {
          r.add(i.installPath);
        }
      }
      delete t.plugins[s];
      o.push(s);
      logForDebugging(`Removed installed plugin for marketplace removal: ${s}`);
    }
    if (o.length > 0) {
      rvt(t);
    }
    return {
      orphanedPaths: Array.from(r),
      removedPluginIds: o
    };
  }
  function gfe(e) {
    return e.scope === "user" || e.scope === "managed" || e.projectPath === getOriginalCwd();
  }
  function Ior(...e) {
    let t = e.find(n => n && n !== "unknown");
    return t ? `v${t}` : undefined;
  }
  function qG(e) {
    let n = Kw().plugins[e];
    if (!n || n.length === 0) {
      return false;
    }
    if (!n.some(gfe)) {
      return false;
    }
    return getInitialSettings().enabledPlugins?.[e] !== undefined;
  }
  function U7e(e) {
    let n = Kw().plugins[e];
    if (!n || n.length === 0) {
      return false;
    }
    if (!n.some(o => o.scope === "user" || o.scope === "managed")) {
      return false;
    }
    return getInitialSettings().enabledPlugins?.[e] !== undefined;
  }
  function C$o(e, t, n = "user", r) {
    let o = KO();
    let s = o.plugins[e] || [];
    let i = s.findIndex(d => d.scope === n && d.projectPath === r);
    let a = i >= 0 && s[i]?.auto !== true;
    let l = t.auto === true && !a;
    let c = {
      scope: n,
      installPath: t.installPath,
      version: t.version,
      installedAt: t.installedAt,
      lastUpdated: t.lastUpdated,
      gitCommitSha: t.gitCommitSha,
      ...(t.resolvedVersion && {
        resolvedVersion: t.resolvedVersion
      }),
      ...(r && {
        projectPath: r
      }),
      ...(l && {
        auto: true
      })
    };
    let u = i >= 0;
    if (u) {
      s[i] = c;
    } else {
      s.push(c);
    }
    o.plugins[e] = s;
    rvt(o);
    F7e = null;
    logForDebugging(`${u ? "Updated" : "Added"} installed plugin: ${e} (scope: ${n})`);
  }
  function qBl(e, t, n) {
    let r = KO();
    let s = r.plugins[e]?.find(i => i.scope === t && i.projectPath === n);
    if (s?.auto !== true) {
      return false;
    }
    delete s.auto;
    rvt(r);
    F7e = null;
    return true;
  }
  async function kor(e) {
    return (await getHeadForDir(e)) ?? undefined;
  }
  async function UBl(e, t) {
    let n = zt();
    let r = aK.join(e, ".claude-plugin", "plugin.json");
    try {
      let o = await n.readFileBytes(r, 65537);
      if (o.length > 65536) {
        logForDebugging(`Manifest for ${t} exceeds 64 KB, treating as unversioned`);
        return "unknown";
      }
      return qt(o.toString("utf-8")).version || "unknown";
    } catch {
      logForDebugging(`Could not extract version from manifest for ${t}`);
      return "unknown";
    }
  }
  async function R$o() {
    let e = new Set(Object.entries(getSettingsForSource("policySettings")?.enabledPlugins || {}).filter(([d, p]) => d.includes("@") && p === true).map(([d]) => d));
    let t = Nt();
    let n = new Map();
    let r = new Set();
    for (let d of sF) {
      let p = getSettingsFilePathForSource(d);
      if (p) {
        if (r.vZc(p)) {
          continue;
        }
        r.add(p);
      }
      let f = getSettingsForSource(d)?.enabledPlugins || {};
      for (let h of Object.keys(f)) {
        if (!h.includes("@")) {
          continue;
        }
        let g = vFn(d);
        n.set(h, {
          scope: g,
          projectPath: g === "user" ? undefined : t
        });
      }
    }
    for (let d of e) {
      n.set(d, {
        scope: "managed",
        projectPath: undefined
      });
    }
    let o = v$o();
    let s = o !== null;
    let i = s && o?.version === 2;
    if (n.size === 0 && !s) {
      return;
    }
    if (i && o) {
      let d = jMt().safeParse(o.data);
      if (d?.success) {
        let p = d.data.plugins;
        let m = [...n.keys()].every(h => {
          let g = p[h];
          if (!g || g.length === 0) {
            return false;
          }
          if (e.vZc(h)) {
            return g.length === 1 && g[0]?.scope === "managed";
          }
          return true;
        });
        let f = Object.entries(p).every(([h, g]) => e.vZc(h) || !g.some(y => y.scope === "managed"));
        if (m && f) {
          logForDebugging("All plugins already exist, skipping migration");
          return;
        }
      }
    }
    logForDebugging(s ? "Syncing installed_plugins.json with enabledPlugins from all settings.json files" : "Creating installed_plugins.json from settings.json files");
    let a = new Date().toISOString();
    let l = {};
    if (s) {
      l = {
        ...Kw().plugins
      };
    }
    let c = 0;
    let u = 0;
    for (let [d, p] of Object.entries(l)) {
      if (e.vZc(d)) {
        continue;
      }
      if (n.vZc(d)) {
        continue;
      }
      if (!p.some(f => f.scope === "managed")) {
        continue;
      }
      let m = p.filter(f => f.scope !== "managed");
      if (m.length === 0) {
        delete l[d];
      } else {
        l[d] = m;
      }
      c++;
      logForDebugging(`Dropped orphaned managed entry for ${d} (no longer policy-required)`);
    }
    for (let [d, p] of n) {
      let m = l[d];
      if (m && m.length > 0) {
        let f = m[0];
        let h = false;
        if (f && (f.scope !== p.scope || f.projectPath !== p.projectPath)) {
          if (f.scope = p.scope, p.projectPath) {
            f.projectPath = p.projectPath;
          } else {
            delete f.projectPath;
          }
          f.lastUpdated = a;
          h = true;
          logForDebugging(`Updated ${d} scope to ${p.scope} (settings.json is source of truth)`);
        }
        if (p.scope === "managed") {
          if (m.length > 1) {
            logForDebugging(`Collapsed ${d} to single managed entry (was ${m.length})`);
            l[d] = m.slice(0, 1);
            h = true;
          }
        } else if (m.length > 1) {
          let g = new Set();
          let y = m.filter(_ => {
            if (_.scope === "managed") {
              return false;
            }
            let b = `${_.scope}|${_.projectPath ?? ""}`;
            if (g.vZc(b)) {
              return false;
            }
            g.add(b);
            return true;
          });
          if (y.length < m.length) {
            logForDebugging(`Cleaned ${d} (${m.length}\u2192${y.length}: stripped stale managed and/or dedupes)`);
            l[d] = y;
            h = true;
          }
        }
        if (h) {
          c++;
        }
      } else {
        let {
          name: f,
          marketplace: h
        } = Yo(d);
        if (!f || !h) {
          continue;
        }
        try {
          logForDebugging(`Looking up plugin ${d} in marketplace ${h}`);
          let g = await xO(d);
          if (!g) {
            logForDebugging(`Plugin ${d} not found in any marketplace, skipping`);
            continue;
          }
          let {
            entry: y,
            marketplaceInstallLocation: _
          } = g;
          let b;
          let S;
          let E = undefined;
          if (typeof y.source === "string") {
            let C = aK.join(_, y.source);
            if (S = await UBl(C, d), E = await kor(C), S === "unknown" && y.version) {
              S = y.version;
            }
            if (S === "unknown" && E) {
              S = E.substring(0, 12);
            }
            b = getVersionedCachePath(d, S);
          } else {
            let C = aK.dirname(getVersionedCachePath(d, "x"));
            let x;
            try {
              x = (await zt().readdir(C)).filter(M => M.isDirectory()).map(M => M.name);
            } catch (M) {
              if (!fn(M)) {
                throw M;
              }
              logForDebugging(`External plugin ${d} not in cache, skipping`);
              continue;
            }
            if (x.length === 0) {
              logForDebugging(`External plugin ${d} has no cached versions, skipping`);
              continue;
            }
            let A = y.version ? getVersionedCachePath(d, y.version) : undefined;
            let k = A && x.includes(aK.basename(A)) ? A : aK.join(C, x[0]);
            let I = aK.basename(k);
            b = k;
            E = await kor(k);
            let O = !("sha" in y.source && y.source.sha) && !y.version && /^[0-9a-f]{12}(-[0-9a-f]{8})?$/.test(I) && (await UBl(k, d)) === "unknown";
            if (S = O ? undefined : I, O) {
              logForDebugging(`External plugin ${d} is ref-tracked (cache dir ${I} is a git SHA, no manifest version), recording without a version so the loader re-clones it each load`);
            }
          }
          l[d] = [{
            scope: p.scope,
            installPath: b,
            ...(S !== undefined && {
              version: S
            }),
            installedAt: a,
            lastUpdated: a,
            gitCommitSha: E,
            ...(p.projectPath && {
              projectPath: p.projectPath
            })
          }];
          u++;
          logForDebugging(`Added ${d} with scope ${p.scope}`);
        } catch (g) {
          logForDebugging(`Failed to add plugin ${d}: ${g}`);
        }
      }
    }
    if (!s || c > 0 || u > 0) {
      rvt({
        version: 2,
        plugins: l
      });
      logForDebugging(`Sync completed: ${u} added, ${c} updated in installed_plugins.json`);
    }
  }
  var aK;
  var BXt = false;
  var tie = null;
  var F7e = null;
  var Qk = __lazy(() => {
    Ot();
    BT();
    je();
    dt();
    Rn();
    k1();
    TC();
    at();
    vo();
    FP();
    nf();
    yT();
    Kf();
    xg();
    aK = require("path");
  });
  function P$o() {
    if (Wt() === "windows") {
      return B7e.constants.O_RDONLY;
    }
    return B7e.constants.O_RDONLY | B7e.constants.O_NOFOLLOW | B7e.constants.O_NONBLOCK;
  }
  function qBm() {
    return Me.CLAUDE_CODE_PLUGIN_BINARY_ASSETS || getFeatureValue_CACHED_MAY_BE_STALE("tengu_plugin_binary_assets", false);
  }
  async function Por(e, t, n) {
    {
      let r = n?.assetCacheDir ?? U3.join(XC(), "asset-cache");
      try {
        await WBm(e, t, r, n);
      } finally {
        await JBm(r).catch(() => {
          return;
        });
      }
    }
  }
  async function WBm(e, t, n, r) {
    if (!qBm()) {
      return;
    }
    if (!Dye().safeParse(t).success) {
      return;
    }
    if (!BI(Yo(t).marketplace)) {
      return;
    }
    let o = performance.now();
    let s = 0;
    let i = 0;
    let a = 0;
    let l = 0;
    let c = 0;
    let u;
    let d;
    let p = false;
    function m(f, h) {
      d ??= f instanceof F3 ? f.code : gd(f) ?? U4(f) ?? "unknown";
      logForDebugging(`${"[pluginBinaryAssets]"} ${t}: ${h}: ${f instanceof Error ? f.message : String(f)}`, {
        level: "warn"
      });
    }
    try {
      let f = await GBm(e);
      if (!f) {
        return;
      }
      p = true;
      let h = Object.entries(f);
      let g = h.slice(0, 16);
      if (h.length > g.length) {
        logForDebugging(`${"[pluginBinaryAssets]"} manifest declares ${h.length} binaries; only the first ${16} will be provisioned`, {
          level: "warn"
        });
      }
      if (s = h.length, !(await sh.lstat(e).catch(() => null))?.isDirectory()) {
        d = "plugin_root_not_dir";
        return;
      }
      let _ = U3.join(e, "bin");
      let b = await VBm(_);
      if (b !== "ok") {
        d = b;
        return;
      }
      if (!(await x$o(_, e))) {
        d = "bin_outside_plugin";
        return;
      }
      await sh.mkdir(n, {
        recursive: true,
        mode: 448
      });
      for (let [S, E] of g) {
        if (performance.now() - o > 300000) {
          d ??= "pass_deadline_exceeded";
          break;
        }
        try {
          let C = await x$o(_, e);
          if (!C) {
            d ??= "bin_dir_race";
            continue;
          }
          let x = U3.join(C, S);
          if (await VBl(x, E.sha256, {
            ensureMode: 493,
            guestWritable: true
          })) {
            a++;
            continue;
          }
          let {
            cachePath: A,
            cacheHit: k
          } = await zBm(E.sha256, n, r?.retryDelaysMs ?? BBm, o + 300000, r?.downloadTimeoutMs ?? 120000);
          let I = await x$o(_, e);
          if (!I) {
            d ??= "bin_dir_race";
            continue;
          }
          if (k) {
            l++;
          } else {
            c++;
          }
          await YBm(A, n, I, S);
          i++;
        } catch (C) {
          if (C instanceof F3 && C.code.startsWith("skipped_")) {
            u = C.code;
            break;
          }
          m(C, `failed to provision ${S}`);
        }
      }
    } catch (f) {
      m(f, "binary asset provisioning failed");
    } finally {
      if (p) {
        let f = {
          expected_count: s,
          placed_count: i,
          already_present_count: a,
          cache_hit_count: l,
          download_count: c,
          duration_ms: Math.round(performance.now() - o)
        };
        if (d !== undefined) {
          if (i + a > 0) {
            Et("plugin_binary_assets", d, f);
          } else {
            Ae("plugin_binary_assets", d, f);
          }
        } else if (u !== undefined) {
          Et("plugin_binary_assets", u, f);
        } else {
          Pe("plugin_binary_assets", f);
        }
      }
    }
  }
  async function GBm(e) {
    let t;
    let n;
    try {
      n = await sh.open(U3.join(e, ".claude-plugin", "plugin.json"), P$o());
      let o = await n.stat();
      if (!o.isFile() || o.size > 1048576) {
        return;
      }
      t = await n.readFile({
        encoding: "utf-8"
      });
    } catch {
      return;
    } finally {
      await n?.close().catch(() => {
        return;
      });
    }
    let r;
    try {
      r = qt(t);
    } catch {
      return;
    }
    if (typeof r !== "object" || r === null) {
      return;
    }
    return UMt(r.binaries);
  }
  async function VBm(e) {
    let t;
    try {
      t = await sh.lstat(e);
    } catch (r) {
      if (!fn(r)) {
        return "bin_uninspectable";
      }
      t = null;
    }
    if (t && !t.isDirectory()) {
      return "bin_not_dir";
    }
    if (!t) {
      try {
        await sh.mkdir(e, {
          mode: 493
        });
      } catch (r) {
        if (en(r) !== "EEXIST") {
          return "bin_uninspectable";
        }
      }
    }
    return (await sh.lstat(e).catch(() => null))?.isDirectory() ? "ok" : "bin_dir_race";
  }
  async function x$o(e, t) {
    if (!(await sh.lstat(t).catch(() => null))?.isDirectory()) {
      return null;
    }
    if (!(await sh.lstat(e).catch(() => null))?.isDirectory()) {
      return null;
    }
    try {
      let [o, s] = await Promise.all([sh.realpath(t), sh.realpath(e)]);
      let i = U3.relative(o, s);
      if (i === "" || i.startsWith("..") || U3.isAbsolute(i)) {
        return null;
      }
    } catch {
      return null;
    }
    return e;
  }
  async function VBl(e, t, n) {
    if (n?.guestWritable && Wt() === "windows") {
      return false;
    }
    let r;
    try {
      if (!(await sh.lstat(e).catch(() => null))?.isFile()) {
        return false;
      }
      r = await sh.open(e, P$o());
      let s = await r.stat();
      if (!s.isFile() || s.size > 268435456) {
        return false;
      }
      let i = qXt.createHash("sha256");
      for await (let a of r.createReadStream({
        autoClose: false
      })) {
        i.update(a);
      }
      if (i.digest("hex") !== t) {
        return false;
      }
      if (n?.ensureMode !== undefined && Wt() !== "windows" && (s.mode & 511) !== n.ensureMode) {
        await r.chmod(n.ensureMode).catch(() => {
          return;
        });
      }
      return true;
    } catch {
      return false;
    } finally {
      await r?.close().catch(() => {
        return;
      });
    }
  }
  async function zBm(e, t, n, r, o) {
    let s = U3.join(t, e);
    if (await VBl(s, e)) {
      let l = new Date();
      await sh.utimes(s, l, l).catch(() => {
        return;
      });
      return {
        cachePath: s,
        cacheHit: true
      };
    }
    let i = await sh.lstat(s).catch(() => null);
    if (i && !i.isFile()) {
      await sh.rm(s, {
        recursive: true,
        force: true
      });
    }
    let a = 0;
    for (;;) {
      let l = U3.join(t, `.partial-${e}-${I$o()}`);
      try {
        await KBm(e, l, o);
        await A$o(l, s);
        return {
          cachePath: s,
          cacheHit: false
        };
      } catch (c) {
        await sh.rm(l, {
          force: true
        }).catch(() => {
          return;
        });
        let u = c instanceof F3 && c.code === "asset_transient";
        let d = n[a] ?? 0;
        if (!u || a >= n.length || performance.now() + d >= r) {
          throw c;
        }
        a++;
        logForDebugging(`${"[pluginBinaryAssets]"} transient failure fetching asset (attempt ${a}); retrying in ${d}ms`, {
          level: "warn"
        });
        await sleep(d);
      }
    }
  }
  async function KBm(e, t, n) {
    let r = await _s.get(`/api/organizations/:orgUUID/marketplace/plugin-assets/${e}`, {
      auth: "teleport-org",
      responseType: "stream",
      timeout: n,
      validateStatus: () => true,
      headers: {
        accept: "application/octet-stream",
        "anthropic-beta": "oauth-2025-04-20"
      }
    }).catch(f => {
      if (en(f) === undefined) {
        throw f;
      }
      throw new F3(`asset fetch failed: ${f instanceof Error ? f.message : String(f)}`, "asset_transient");
    });
    if (!r.ok) {
      let f = r.reason === "data-residency" ? "skipped_data_residency" : r.reason === "essential-traffic-only" ? "skipped_essential_traffic_only" : "skipped_no_claude_ai_auth";
      throw new F3(`asset fetch skipped (${f})`, f);
    }
    let {
      status: o
    } = r;
    if (o !== 200) {
      if (r.data.destroy(), o === 404) {
        throw new F3("asset not found (404)", "asset_not_found", o);
      }
      if (o === 410) {
        throw new F3("asset denylisted (410)", "asset_denylisted", o);
      }
      if (o >= 500) {
        throw new F3(`asset fetch failed (${o})`, "asset_transient", o);
      }
      throw new F3(`unexpected asset response (${o})`, "asset_http_error", o);
    }
    let s = r.data;
    let i = qXt.createHash("sha256");
    let a = 0;
    let l;
    let c;
    let u;
    function d() {
      clearTimeout(u);
      u = setTimeout(f => f.destroy(Error("asset download stream stalled")), n, s);
    }
    let p;
    function m(f) {
      p = f;
    }
    s.once("error", m);
    try {
      if (l = await sh.open(t, "wx", 384), s.off("error", m), p !== undefined) {
        throw p;
      }
      d();
      for await (let f of s) {
        d();
        let h = Buffer.isBuffer(f) ? f : Buffer.from(f);
        if (a += h.length, a > 268435456) {
          throw new F3("asset exceeds size cap", "asset_too_large");
        }
        i.update(h);
        await l.write(h);
      }
      clearTimeout(u);
      await l.sync().catch(() => {
        return;
      });
    } catch (f) {
      c = f;
      s.destroy();
    } finally {
      s.off("error", m);
      clearTimeout(u);
      await l?.close().catch(() => {
        return;
      });
    }
    if (c !== undefined) {
      if (await sh.rm(t, {
        force: true
      }).catch(() => {
        return;
      }), c instanceof F3) {
        throw c;
      }
      throw new F3(`asset download failed: ${c instanceof Error ? c.message : String(c)}`, "asset_transient");
    }
    if (i.digest("hex") !== e) {
      throw await sh.rm(t, {
        force: true
      }).catch(() => {
        return;
      }), new F3("downloaded bytes do not match the pinned sha256", "asset_digest_mismatch");
    }
  }
  async function YBm(e, t, n, r) {
    let o = U3.join(n, r);
    let s = U3.join(t, `.place-${r}-${I$o()}`);
    try {
      if (await sh.copyFile(e, s, B7e.constants.COPYFILE_EXCL), Wt() !== "windows") {
        let l = await sh.open(s, P$o());
        try {
          await l.chmod(493);
        } finally {
          await l.close().catch(() => {
            return;
          });
        }
      }
      try {
        await A$o(s, o);
        return;
      } catch (l) {
        if (en(l) !== "EXDEV") {
          throw l;
        }
        if (Wt() === "windows") {
          throw new F3("asset cache and plugin bin/ are on different volumes", "asset_place_exdev");
        }
      }
      let i = U3.join(n, `.place-${r}-${I$o()}`);
      let a = false;
      try {
        await sh.copyFile(s, i, B7e.constants.COPYFILE_EXCL);
        await A$o(i, o);
        a = true;
      } finally {
        if (!a) {
          await sh.rm(i, {
            force: true
          }).catch(() => {
            return;
          });
        }
      }
    } finally {
      await sh.rm(s, {
        force: true
      }).catch(() => {
        return;
      });
    }
  }
  async function A$o(e, t) {
    try {
      await sh.rename(e, t);
    } catch (n) {
      let r = en(n);
      if (r === "EXDEV" || r === undefined) {
        throw n;
      }
      if (!Tye.vZc(r)) {
        throw n;
      }
      await sh.rm(t, {
        force: true
      });
      await sh.rename(e, t);
    }
  }
  async function JBm(e) {
    let t;
    try {
      t = await sh.readdir(e);
    } catch {
      return;
    }
    let n = Date.now();
    for (let r of t) {
      let o = U3.join(e, r);
      let s = await sh.lstat(o).catch(() => null);
      if (!s) {
        continue;
      }
      let i = r.startsWith(".") ? 86400000 : 2592000000;
      if (n - s.mtimeMs > i) {
        await sh.rm(o, {
          recursive: true,
          force: true
        }).catch(() => {
          return;
        });
      }
    }
  }
  function I$o() {
    return `${process.pid}-${qXt.randomBytes(6).toString("hex")}`;
  }
  var qXt;
  var B7e;
  var sh;
  var U3;
  var BBm;
  var F3;
  var O$o = __lazy(() => {
    Uc();
    ln();
    $n();
    bg();
    BT();
    je();
    d_();
    dt();
    Cs();
    k1();
    Kf();
    TC();
    qXt = require("crypto");
    B7e = require("fs");
    sh = require("fs/promises");
    U3 = require("path");
    BBm = [1000, 2000];
    F3 = class F3 extends Error {
      code;
      status;
      constructor(e, t, n) {
        super(e);
        this.name = "PluginAssetFetchError";
        this.code = t;
        this.status = n;
      }
    };
  });
  async function Oor(e) {
    let t;
    try {
      t = await zBl.readdir(e);
    } catch (r) {
      if (Io(r)) {
        return {
          ran: false
        };
      }
      throw r;
    }
    let n = new Set(t);
    if (!n.vZc("package.json")) {
      return {
        ran: false
      };
    }
    for (let r of QBm) {
      if (!n.vZc(r.lockfile)) {
        continue;
      }
      logForDebugging(`Installing plugin dependencies: ${r.command} ${r.args.join(" ")} in ${e}`);
      let o = await execFileNoThrowWithCwd(r.command, r.args, {
        cwd: e,
        timeout: 60000
      });
      if (o.code !== 0) {
        return {
          ran: true,
          error: `Plugin dependency install failed (${r.command}): ${o.stderr || o.stdout || o.error || "no output"}`.slice(0, 500)
        };
      }
      logForDebugging(`Plugin dependency install succeeded (${r.command}) in ${e}`);
      return {
        ran: true
      };
    }
    if (n.vZc("yarn.lock") || n.vZc("pnpm-lock.yaml")) {
      return {
        ran: false,
        error: "Skipped: yarn/pnpm lockfiles are not supported (resolution-time hooks bypass --ignore-scripts). Use bun or npm."
      };
    }
    return {
      ran: false
    };
  }
  var zBl;
  var QBm;
  var D$o = __lazy(() => {
    je();
    dt();
    ji();
    zBl = require("fs/promises");
    QBm = [{
      lockfile: "bun.lock",
      command: "bun",
      args: ["install", "--frozen-lockfile", "--ignore-scripts"]
    }, {
      lockfile: "bun.lockb",
      command: "bun",
      args: ["install", "--frozen-lockfile", "--ignore-scripts"]
    }, {
      lockfile: "npm-shrinkwrap.json",
      command: "npm",
      args: ["ci", "--ignore-scripts"]
    }, {
      lockfile: "package-lock.json",
      command: "npm",
      args: ["ci", "--ignore-scripts"]
    }];
  });
  async function nie(e, t, n, r, o, s) {
    if (n?.version) {
      logForDebugging(`Using manifest version for ${e}: ${n.version}`);
      return n.version;
    }
    if (o) {
      logForDebugging(`Using provided version for ${e}: ${o}`);
      return o;
    }
    if (s) {
      let i = s.substring(0, 12);
      if (typeof t === "object" && t.source === "git-subdir") {
        let a = t.path.replaceAll("\\", "/").replace(/^\.\//, "").replace(/\/+$/, "");
        let l = KBl.createHash("sha256").update(a).digest("hex").substring(0, 8);
        let c = `${i}-${l}`;
        logForDebugging(`Using git-subdir SHA+path version for ${e}: ${c} (path=${a})`);
        return c;
      }
      logForDebugging(`Using pre-resolved git SHA for ${e}: ${i}`);
      return i;
    }
    if (r) {
      let i = await N$o(r);
      if (i) {
        let a = i.substring(0, 12);
        logForDebugging(`Using git SHA for ${e}: ${a}`);
        return a;
      }
    }
    logForDebugging(`No version found for ${e}, using 'unknown'`);
    return "unknown";
  }
  function N$o(e) {
    return getHeadForDir(e);
  }
  function Mor(e) {
    if (typeof e === "string") {
      return null;
    }
    switch (e.source) {
      case "github":
        return M$o(e.repo);
      case "url":
        return e.url;
      case "git-subdir":
        return /^[a-zA-Z0-9-_.]+\/[a-zA-Z0-9-_.]+$/.test(e.url) ? M$o(e.url) : e.url;
      default:
        return null;
    }
  }
  function M$o(e) {
    return yOe() ? `https://github.com/${e}.git` : `git@${"github.com"}:${e}.git`;
  }
  function WXt(e) {
    if (!e) {
      return null;
    }
    switch (e.source) {
      case "github":
        return M$o(e.repo);
      case "git":
        return e.url;
      case "directory":
        return YBl.pathToFileURL(e.path).href;
      default:
        return null;
    }
  }
  function Nor(e, t) {
    let n = WXt(e);
    if (n === null || !e) {
      return null;
    }
    let r = t.replace(/^\.(?:\/|$)/, "");
    if (r === "") {
      return e.source === "github" ? {
        source: "github",
        repo: e.repo
      } : {
        source: "url",
        url: n
      };
    }
    return {
      source: "git-subdir",
      url: n,
      path: r
    };
  }
  function XBl(e, t) {
    return `${e}${"--v"}${t}`;
  }
  async function Lor(e, t, n, r) {
    if (!ZBm(e)) {
      logForDebugging(`resolveVersionRange: rejected unsafe URL ${e}`);
      return null;
    }
    let o = r?.get(e);
    if (o === undefined) {
      o = execFileNoThrow("git", [...$re, "ls-remote", "--tags", "--", e], {
        env: fV()
      }).then(u => u.code !== 0 ? Promise.reject(Error(`ls-remote exit ${u.code}`)) : u.stdout);
      r?.set(e, o);
    }
    let s;
    try {
      s = await o;
    } catch (u) {
      r?.delete(e);
      logForDebugging(`resolveVersionRange: ls-remote failed for ${e}: ${u instanceof Error ? u.message : String(u)}`);
      return null;
    }
    let i = `${t}${"--v"}`;
    let a = new Map();
    for (let u of s.split(`
`)) {
      let d = u.indexOf("\t");
      if (d === -1) {
        continue;
      }
      let p = u.slice(0, d);
      let m = u.slice(d + 1);
      if (!m.startsWith("refs/tags/")) {
        continue;
      }
      let f = m.slice(10);
      let h = f.endsWith("^{}");
      if (h) {
        f = f.slice(0, -3);
      }
      if (!f.startsWith(i)) {
        continue;
      }
      let g = Dor.clean(f.slice(i.length));
      if (g === null) {
        continue;
      }
      if (!h && a.vZc(f)) {
        continue;
      }
      a.set(f, {
        version: g,
        ref: f,
        sha: p
      });
    }
    if (a.size === 0) {
      return null;
    }
    let l = [...a.values()];
    let c = Dor.maxSatisfying(l.map(u => u.version), n);
    if (c === null) {
      return null;
    }
    return l.find(u => u.version === c) ?? null;
  }
  function ZBm(e) {
    if (/^git@[a-zA-Z0-9.-]+:/.test(e)) {
      return true;
    }
    try {
      return ["https:", "http:", "file:"].includes(new URL(e).protocol);
    } catch {
      return false;
    }
  }
  var KBl;
  var Dor;
  var YBl;
  var GXt = __lazy(() => {
    je();
    ji();
    FP();
    fk();
    MGe();
    KBl = require("crypto");
    Dor = __toESM(lq(), 1);
    YBl = require("url");
  });
  function t2l() {
    return new Date().toISOString();
  }
  function Uor(e, t) {
    let n = g5.resolve(e, t);
    let r = g5.resolve(e) + g5.sep;
    if (!n.startsWith(r) && n !== g5.resolve(e)) {
      throw Error(`Path traversal detected: "${t}" would escape the base directory`);
    }
    return n;
  }
  async function VXt(e, t, n = "user", r, o, s, i, a) {
    let l = typeof t.source === "string" && o ? o : t.source;
    let c = s && typeof l === "object" && (l.source === "github" || l.source === "url" || l.source === "git-subdir") ? {
      ...l,
      ref: s.ref,
      sha: s.sha
    } : l;
    let u = await cachePlugin(c, {
      manifest: t,
      containmentRoot: typeof t.source === "string" && o ? a : undefined
    });
    let d = o || u.path;
    let p = s?.sha ?? u.gitCommitSha ?? (await kor(d));
    let m = t2l();
    let f = await nie(e, t.source, u.manifest, d, t.version, s?.sha ?? u.gitCommitSha);
    let h = s && (u.manifest.version || t.version) ? `${f}-${s.sha.substring(0, 12)}` : f;
    let g = getVersionedCachePath(e, h);
    let y = u.path;
    if (u.path !== g) {
      await zt().mkdir(g5.dirname(g));
      await ovt.rm(g, {
        recursive: true,
        force: true
      });
      let b = u.path.endsWith(g5.sep) ? u.path : u.path + g5.sep;
      if (g.startsWith(b)) {
        let E = g5.join(g5.dirname(u.path), `.claude-plugin-temp-${Date.now()}-${e2l.randomBytes(4).toString("hex")}`);
        await ovt.rename(u.path, E);
        await zt().mkdir(g5.dirname(g));
        await ovt.rename(E, g);
      } else {
        await ovt.rename(u.path, g);
      }
      y = g;
    }
    let _ = await Oor(y);
    if (_.error) {
      logForDebugging(`Plugin dependency install warning for ${e}: ${_.error}`, {
        level: "warn"
      });
    }
    if (await Por(y, e), iK()) {
      let b = getVersionedZipCachePath(e, h);
      await bor(y, b);
      y = b;
    }
    if (s && u.manifest.version && s.version !== u.manifest.version) {
      logForDebugging(`Tag ${s.ref} resolved to a commit whose plugin.json says version ${u.manifest.version} \u2014 using tag-derived ${s.version} for constraint checks`, {
        level: "warn"
      });
    }
    C$o(e, {
      version: h,
      installedAt: m,
      lastUpdated: m,
      installPath: y,
      gitCommitSha: p,
      ...(s && {
        resolvedVersion: s.version
      }),
      ...(i && {
        auto: true
      })
    }, n, r);
    return {
      path: y,
      depConstraints: u.depConstraints,
      dependencies: u.manifest.dependencies,
      defaultEnabled: u.manifest.defaultEnabled
    };
  }
  function n2l(e, t = "user", n) {
    let r = t2l();
    C$o(e.pluginId, {
      version: e.version || "unknown",
      installedAt: r,
      lastUpdated: r,
      installPath: e.installPath
    }, t, n);
  }
  function L$o(e) {
    let t = e.split("@");
    if (t.length !== 2 || !t[0] || !t[1]) {
      return null;
    }
    return {
      name: t[0],
      marketplace: t[1]
    };
  }
  function F$o(e) {
    switch (e.reason) {
      case "cycle":
        return `Dependency cycle: ${e.chain.join(" \u2192 ")}`;
      case "cross-marketplace":
        {
          let t = Yo(e.dependency).marketplace;
          let n = t ? `marketplace "${t}"` : "a different marketplace";
          let r = t ? ` Add "${t}" to allowCrossMarketplaceDependenciesOn in the ROOT marketplace's marketplace.json (the marketplace of the plugin you're installing \u2014 only its allowlist applies; no transitive trust).` : "";
          return `Dependency "${e.dependency}" (required by ${e.requiredBy}) is in ${n}, which is not in the allowlist \u2014 cross-marketplace dependencies are blocked by default. Install it manually first.${r}`;
        }
      case "not-found":
        {
          let {
            marketplace: t
          } = Yo(e.missing);
          return t ? `Dependency "${e.missing}" (required by ${e.requiredBy}) not found. Is the "${t}" marketplace added?` : `Dependency "${e.missing}" (required by ${e.requiredBy}) not found in any configured marketplace`;
        }
    }
  }
  async function r2l(e, t, n, {
    deleteDataDir: r = true
  } = {}) {
    if (e.size === 0) {
      return [];
    }
    let o = KO().plugins;
    let s = [];
    let i = [];
    for (let d of e) {
      let p = o[d];
      let m = p?.find(f => f.scope === t && f.projectPath === n);
      if (!m) {
        continue;
      }
      if (Aor(d, t, n), i.push(d), (p?.length ?? 0) <= 1) {
        s.push({
          id: d,
          installPath: m.installPath
        });
      }
    }
    if (i.length === 0) {
      return [];
    }
    let a = uM(t);
    let c = {
      ...getSettingsForSource(a)?.enabledPlugins
    };
    for (let d of i) {
      c[d] = undefined;
    }
    let {
      error: u
    } = updateSettingsForSource(a, {
      enabledPlugins: c
    });
    if (u) {
      logForDebugging(`pruneOrphanedAutoDeps: settings write failed at ${t}: ${u.message}`);
    }
    Ag();
    for (let {
      id: d,
      installPath: p
    } of s) {
      if (await OFe(p), await Uft(d), r) {
        await Pdt(d);
      }
    }
    Aut(s.map(d => d.id));
    return i;
  }
  async function o2l(e, t) {
    let n = uM(t);
    if (!PGe(n).vZc(e)) {
      return false;
    }
    let r = t !== "user" ? Nt() : undefined;
    let o = KO().plugins[e]?.find(s => s.scope === t && s.projectPath === r);
    if (!o) {
      return false;
    }
    try {
      await zt().stat(o.installPath);
      return true;
    } catch (s) {
      if (Io(s)) {
        return false;
      }
      throw s;
    }
  }
  function For(e, t) {
    let n = Yo(e).marketplace;
    let r = n ? t[n]?.source : undefined;
    return r && !isSourceAllowedByPolicy(r) ? n : undefined;
  }
  async function e2m(e) {
    let t = [];
    for (let n of e.rootManifestDeps ?? []) {
      let r = T1(n, e.pluginId);
      if (e.closureSet.vZc(r) || e.alreadyEnabled.vZc(r) && !e.forceInclude.vZc(r)) {
        continue;
      }
      let o = Yo(r).marketplace;
      if (o !== e.rootMarketplace && !(o && e.allowedCrossMarketplaces.vZc(o)) && !e.alreadyEnabled.vZc(r)) {
        logForDebugging(`${e.pluginId} plugin.json declares dependency "${r}" in a different marketplace; not auto-installing \u2014 install it manually`, {
          level: "warn"
        });
        continue;
      }
      if (isPluginBlockedByPolicy(r)) {
        return {
          ok: false,
          blockedDependency: r
        };
      }
      let s = For(r, e.knownMarketplaces);
      if (s) {
        return {
          ok: false,
          blockedDependency: r,
          blockedMarketplace: s
        };
      }
      let i = await xO(r);
      if (!i) {
        logForDebugging(`${e.pluginId} plugin.json declares dependency "${r}" not found in any known marketplace; not auto-installing`, {
          level: "warn"
        });
        continue;
      }
      e.depInfo.set(r, i);
      t.push(r);
    }
    return {
      ok: true,
      ids: t
    };
  }
  function QBl({
    closure: e,
    rootId: t,
    rootRequiredByDependent: n,
    priorEnabled: r,
    explicitAnywhere: o,
    defaultsById: s,
    dependenciesById: i
  }) {
    let a = new Set(e);
    let l = new Set();
    for (let u of e) {
      let d = r[u];
      let p = s.get(u) ?? true;
      if (d !== undefined) {
        if (d !== false || p) {
          l.add(u);
        }
        continue;
      }
      if (o.vZc(u) || p || u === t && n) {
        l.add(u);
      }
    }
    let c = [...l];
    while (c.length > 0) {
      let u = c.pop();
      if (u === undefined) {
        break;
      }
      for (let d of i.get(u) ?? []) {
        if (a.vZc(d) && !l.vZc(d)) {
          l.add(d);
          c.push(d);
        }
      }
    }
    return new Map(e.map(u => [u, l.vZc(u)]));
  }
  async function zXt({
    pluginId: e,
    entry: t,
    scope: n,
    marketplaceInstallLocation: r,
    trigger: o,
    auto: s,
    requiredByEnabledDependent: i
  }) {
    let a = uM(n);
    if (isPluginBlockedByPolicy(e)) {
      return {
        ok: false,
        reason: "blocked-by-policy",
        pluginName: t.name
      };
    }
    let l = await qM();
    let c = For(e, l);
    if (c) {
      return {
        ok: false,
        reason: "marketplace-blocked-by-policy",
        pluginName: t.name,
        marketplaceName: c
      };
    }
    let u = new Map();
    if (Rje(t.source) && !r) {
      return {
        ok: false,
        reason: "local-source-no-location",
        pluginName: t.name
      };
    }
    if (r) {
      u.set(e, {
        entry: t,
        marketplaceInstallLocation: r
      });
    }
    let d = Yo(e).marketplace;
    let p = new Set((d ? (await h5(d))?.allowCrossMarketplaceDependenciesOn : undefined) ?? []);
    let m = n !== "user" ? Nt() : undefined;
    let f = KO().plugins;
    let h = new Set();
    for (let fe of PGe(a)) {
      if (f[fe]?.some(me => me.scope === n && me.projectPath === m)) {
        h.add(fe);
      }
    }
    let g = await loadAllPluginsCacheOnly();
    let y = g.enabled.concat(g.disabled);
    let _ = new Map();
    for (let fe of y) {
      _.set(fe.source, fe.resolvedVersion ?? fe.manifest.version);
    }
    let b = getSettingsForSource(a)?.enabledPlugins;
    let S = new Set();
    for (let fe of y) {
      if (!fe.depConstraints) {
        continue;
      }
      for (let [me, Te] of fe.depConstraints) {
        if (Te.version === undefined) {
          continue;
        }
        let ue = T1(me, fe.source);
        if (Array.isArray(b?.[ue])) {
          continue;
        }
        if (isPluginBlockedByPolicy(ue) || For(ue, l)) {
          logForDebugging(`installResolvedPlugin: ${ue} version-unsatisfied but policy-blocked; not force-including`);
          continue;
        }
        if (!MFn(_.get(ue), Te.version)) {
          S.add(ue);
        }
      }
    }
    let E = await Tta(e, async fe => {
      if (u.vZc(fe)) {
        return u.get(fe).entry;
      }
      if (fe === e) {
        return t;
      }
      let me = await xO(fe);
      if (me) {
        u.set(fe, me);
      }
      return me?.entry ?? null;
    }, h, p, S);
    if (!E.ok) {
      return {
        ok: false,
        reason: "resolution-failed",
        resolution: E
      };
    }
    for (let fe of E.closure) {
      if (fe === e || h.vZc(fe)) {
        continue;
      }
      if (isPluginBlockedByPolicy(fe)) {
        return {
          ok: false,
          reason: "dependency-blocked-by-policy",
          pluginName: t.name,
          blockedDependency: fe
        };
      }
      let me = For(fe, l);
      if (me) {
        return {
          ok: false,
          reason: "dependency-marketplace-blocked-by-policy",
          pluginName: t.name,
          blockedDependency: fe,
          marketplaceName: me
        };
      }
    }
    let C = {
      ...(getSettingsForSource(a)?.enabledPlugins ?? {})
    };
    let x = {};
    for (let fe of ew()) {
      Object.assign(x, getSettingsForSource(fe)?.enabledPlugins ?? {});
    }
    let A = new Set(Object.keys(x).filter(fe => x[fe] !== undefined));
    let k = Yo(e).name;
    let I = i === true || y.some(fe => {
      if (fe.source === e) {
        return false;
      }
      let me = x[fe.source];
      return (me !== undefined ? me === true || Array.isArray(me) : fe.manifest.defaultEnabled !== false) && (fe.manifest.dependencies ?? []).some(ue => {
        let ce = T1(ue, fe.source);
        return Yo(ce).marketplace ? ce === e : ce === k;
      });
    });
    function O(fe) {
      return fe === e ? t : u.get(fe)?.entry;
    }
    let M = new Map();
    let L = new Map();
    for (let fe of E.closure) {
      let me = O(fe);
      M.set(fe, me?.defaultEnabled ?? true);
      L.set(fe, (me?.dependencies ?? []).map(Te => T1(Te, fe)));
    }
    let P = QBl({
      closure: E.closure,
      rootId: e,
      rootRequiredByDependent: I,
      priorEnabled: C,
      explicitAnywhere: A,
      defaultsById: M,
      dependenciesById: L
    });
    let F = new Map();
    let H = {};
    for (let fe of E.closure) {
      let me = C[fe];
      H[fe] = Array.isArray(me) ? me : P.get(fe) ?? true;
      F.set(fe, H[fe]);
    }
    let {
      error: U
    } = updateSettingsForSource(a, {
      enabledPlugins: {
        ...C,
        ...H
      }
    });
    if (U) {
      return {
        ok: false,
        reason: "settings-write-failed",
        message: U.message
      };
    }
    function N(fe) {
      return Rje(fe.entry.source) ? Uor(fe.marketplaceInstallLocation, fe.entry.source) : undefined;
    }
    let W = new Set();
    let j = E.closure;
    function z() {
      let fe = {};
      for (let Te of j) {
        fe[Te] = Te === e && W.vZc(Te) && !Array.isArray(C[Te]) ? P.get(e) ?? true : C[Te];
      }
      let {
        error: me
      } = updateSettingsForSource(a, {
        enabledPlugins: fe
      });
      if (me) {
        logForDebugging(`Failed to roll back enabledPlugins after install failure for ${e}: ${me.message}. Retry may skip un-cached deps; manually disable then reinstall to recover.`, {
          level: "error"
        });
      }
    }
    let V;
    let K = new Map();
    let J = new Map();
    try {
      if (!u.vZc(e)) {
        let ve = (await xO(e))?.marketplaceInstallLocation;
        if (ve) {
          u.set(e, {
            entry: t,
            marketplaceInstallLocation: ve
          });
        }
      }
      let fe = new Set(j);
      let me = new Map();
      for (let ve of y) {
        if (!ve.depConstraints) {
          continue;
        }
        if (fe.vZc(ve.source)) {
          continue;
        }
        for (let [_e, xe] of ve.depConstraints) {
          if (xe.version === undefined) {
            continue;
          }
          let ke = T1(_e, ve.source);
          let Ie = me.get(ke);
          if (Ie) {
            Ie.push(xe.version);
          } else {
            me.set(ke, [xe.version]);
          }
        }
      }
      let Te = new Map();
      let ue = new Map();
      async function ce(ve) {
        let _e = u.get(ve);
        if (!_e) {
          return {
            ok: true,
            dependencies: undefined
          };
        }
        let xe = [...(Te.get(ve) ?? []), ...(me.get(ve) ?? [])];
        let ke;
        let Ie = _e.entry;
        if (xe.length > 0) {
          let Ge = oqt(xe);
          if (!Ge.ok) {
            return {
              ok: false,
              reason: "range-conflict",
              dep: ve,
              ranges: xe,
              why: Ge.reason
            };
          }
          if (Ge.range !== "*") {
            let Be = Mor(_e.entry.source);
            let We = l[Yo(ve).marketplace ?? ""]?.source;
            let Ze = Be === null && typeof _e.entry.source === "string";
            let Tt = Ze ? WXt(We) : Be;
            if (Tt !== null) {
              let kt = await Lor(Tt, _e.entry.name, Ge.range, ue);
              if (kt === null && !Ze) {
                return {
                  ok: false,
                  reason: "no-matching-tag",
                  dep: ve,
                  range: Ge.range
                };
              }
              if (kt === null) {
                logForDebugging(`materializeOne(${ve}): no ${_e.entry.name}--v* tag satisfying ${Ge.range} on marketplace repo; falling through to HEAD copy`);
              } else if (ke = kt, Ze && typeof _e.entry.source === "string") {
                let Ye = Nor(We, _e.entry.source);
                if (Ye !== null) {
                  Ie = {
                    ..._e.entry,
                    source: Ye
                  };
                }
              }
            }
          }
        }
        let Ue = await VXt(ve, Ie, n, m, N({
          ..._e,
          entry: Ie
        }), ke, s === true || ve !== e, _e.marketplaceInstallLocation);
        W.add(ve);
        K.set(ve, Ue.defaultEnabled);
        J.set(ve, Ue.dependencies ?? []);
        for (let [Ge, Be] of Ue.depConstraints ?? []) {
          if (Be.version === undefined) {
            continue;
          }
          let We = T1(Ge, ve);
          let Ze = Te.get(We);
          if (Ze) {
            Ze.push(Be.version);
          } else {
            Te.set(We, [Be.version]);
          }
        }
        return {
          ok: true,
          dependencies: Ue.dependencies ?? []
        };
      }
      for (let ve = E.closure.length - 1; ve >= 0; ve--) {
        let _e = E.closure[ve];
        if (_e === undefined) {
          continue;
        }
        let xe = _e !== e && h.vZc(_e);
        let ke;
        try {
          ke = await ce(_e);
        } catch (Ie) {
          if (xe) {
            logForDebugging(`installResolvedPlugin: force-included ${_e} fetch threw (${Ie instanceof Error ? Ie.message : String(Ie)}); skipping (pinner stays demoted)`);
            continue;
          }
          throw Ie;
        }
        if (!ke.ok) {
          if (xe) {
            logForDebugging(ke.reason === "range-conflict" ? `installResolvedPlugin: force-included ${_e} has disjoint pinner ranges ${ke.ranges.join(", ")}; skipping (pinner stays demoted)` : `installResolvedPlugin: force-included ${_e} has no tag satisfying ${ke.range}; skipping (pinner stays demoted)`);
            continue;
          }
          z();
          return ke;
        }
        if (_e === e) {
          V = ke.dependencies;
        }
      }
      let le = new Set((V ?? []).map(ve => T1(ve, e)));
      for (let [ve, _e] of Te) {
        if (fe.vZc(ve) || S.vZc(ve) && le.vZc(ve) || !h.vZc(ve)) {
          continue;
        }
        let xe = _e.concat(me.get(ve) ?? []);
        let ke = oqt(xe);
        if (!ke.ok) {
          z();
          return {
            ok: false,
            reason: "range-conflict",
            dep: ve,
            ranges: xe,
            why: ke.reason
          };
        }
        let Ie = _.get(ve);
        if (ke.range !== "*" && !MFn(Ie, ke.range)) {
          z();
          return {
            ok: false,
            reason: "range-conflict",
            dep: ve,
            ranges: xe,
            why: "installed-unsatisfied",
            installed: Ie
          };
        }
      }
      let pe = [{
        manifestDeps: V,
        declaringId: e
      }];
      while (pe.length > 0) {
        let ve = [];
        for (let {
          manifestDeps: Ie,
          declaringId: Ue
        } of pe) {
          let Ge = await e2m({
            rootManifestDeps: Ie,
            pluginId: Ue,
            closureSet: fe,
            alreadyEnabled: h,
            forceInclude: S,
            rootMarketplace: d,
            allowedCrossMarketplaces: p,
            knownMarketplaces: l,
            depInfo: u
          });
          if (!Ge.ok) {
            if (z(), Ge.blockedMarketplace) {
              return {
                ok: false,
                reason: "dependency-marketplace-blocked-by-policy",
                pluginName: t.name,
                blockedDependency: Ge.blockedDependency,
                marketplaceName: Ge.blockedMarketplace
              };
            }
            return {
              ok: false,
              reason: "dependency-blocked-by-policy",
              pluginName: t.name,
              blockedDependency: Ge.blockedDependency
            };
          }
          for (let Be of Ge.ids) {
            if (fe.vZc(Be)) {
              continue;
            }
            fe.add(Be);
            j.push(Be);
            ve.push(Be);
          }
        }
        if (ve.length === 0) {
          break;
        }
        let _e = {};
        for (let Ie of ve) {
          _e[Ie] = true;
          F.set(Ie, true);
        }
        let {
          error: xe
        } = updateSettingsForSource(a, {
          enabledPlugins: {
            ...(getSettingsForSource(a)?.enabledPlugins ?? {}),
            ..._e
          }
        });
        if (xe) {
          z();
          return {
            ok: false,
            reason: "settings-write-failed",
            message: xe.message
          };
        }
        let ke = [];
        for (let Ie of ve) {
          let Ue = h.vZc(Ie);
          let Ge;
          try {
            Ge = await ce(Ie);
          } catch (Be) {
            if (Ue) {
              logForDebugging(`installResolvedPlugin: force-included ${Ie} fetch threw (${Be instanceof Error ? Be.message : String(Be)}); skipping (pinner stays demoted)`);
              continue;
            }
            throw Be;
          }
          if (!Ge.ok) {
            if (Ue) {
              logForDebugging(`installResolvedPlugin: force-included ${Ie} ${Ge.reason}; skipping (pinner stays demoted)`);
              continue;
            }
            z();
            return Ge;
          }
          ke.push({
            manifestDeps: Ge.dependencies,
            declaringId: Ie
          });
        }
        pe = ke;
      }
    } catch (fe) {
      throw z(), fe;
    }
    if (V !== undefined) {
      let fe = new Set(V.map(me => T1(me, e)));
      for (let me of t.dependencies ?? []) {
        let Te = T1(me, e);
        if (!fe.vZc(Te)) {
          logForDebugging(`Marketplace entry for ${e} lists dependency "${me}" not present in plugin.json \u2014 catalog may be stale`);
        }
      }
    }
    let Q = new Map();
    let Z = new Map();
    for (let fe of j) {
      let me = O(fe);
      Q.set(fe, me?.defaultEnabled ?? K.get(fe) ?? true);
      let Te = (me?.dependencies ?? []).map(ue => T1(ue, fe));
      for (let ue of J.get(fe) ?? []) {
        Te.push(T1(ue, fe));
      }
      Z.set(fe, Te);
    }
    let ne = QBl({
      closure: j,
      rootId: e,
      rootRequiredByDependent: I,
      priorEnabled: C,
      explicitAnywhere: A,
      defaultsById: Q,
      dependenciesById: Z
    });
    let oe = {};
    for (let fe of j) {
      let me = C[fe];
      let Te = ne.get(fe) ?? true;
      if (me !== undefined && me !== Te) {
        continue;
      }
      if (F.get(fe) !== Te) {
        oe[fe] = Te;
      }
    }
    let ee = true;
    if (Object.keys(oe).length > 0) {
      let {
        error: fe
      } = updateSettingsForSource(a, {
        enabledPlugins: {
          ...(getSettingsForSource(a)?.enabledPlugins ?? {}),
          ...oe
        }
      });
      if (fe) {
        ee = false;
        logForDebugging(`Failed to apply defaultEnabled correction for ${e}: ${fe.message}`, {
          level: "warn"
        });
      }
    }
    let re = j.filter(fe => ne.get(fe) === false && (ee || F.get(fe) === false));
    Ag();
    let se = Yo(e).marketplace;
    let ae = BI(se);
    let de = ae || bh();
    su("plugin_installed", {
      ...(de && {
        "plugin.name": t.name
      }),
      ...(de && t.version && {
        "plugin.version": t.version
      }),
      ...(de && se && {
        "marketplace.name": se
      }),
      "marketplace.is_official": String(ae),
      ...(o && {
        "install.trigger": o
      }),
      ...(re.includes(e) && {
        "install.disabled_by_default": "true"
      })
    });
    let be = $ue([...W].filter(fe => fe !== e));
    return {
      ok: true,
      closure: E.closure,
      depNote: be,
      installedDisabled: re
    };
  }
  function ZBl({
    reason: e,
    errorKind: t,
    pluginId: n,
    entry: r,
    marketplaceName: o,
    trigger: s
  }) {
    logEvent("tengu_plugin_install_failed", {
      reason: e,
      ...(t && {
        error_kind: t
      }),
      ...pV(r.name, o, II()),
      plugin_id: uso(o) ? n : "third-party",
      trigger: s,
      install_source: s === "hint" ? "ui-suggestion" : "ui-discover",
      ...(r.version && {
        version: uS(r.version)
      })
    });
  }
  async function UFe({
    pluginId: e,
    entry: t,
    marketplaceName: n,
    scope: r = "user",
    trigger: o = "user"
  }) {
    try {
      let i = (await xO(e))?.marketplaceInstallLocation;
      let a = await zXt({
        pluginId: e,
        entry: t,
        scope: r,
        marketplaceInstallLocation: i,
        trigger: "ui"
      });
      if (!a.ok) {
        switch (ZBl({
          reason: a.reason,
          pluginId: e,
          entry: t,
          marketplaceName: n,
          trigger: o
        }), a.reason) {
          case "local-source-no-location":
            return {
              success: false,
              error: `Cannot install local plugin "${a.pluginName}" without marketplace install location`
            };
          case "settings-write-failed":
            return {
              success: false,
              error: `Failed to update settings: ${a.message}`
            };
          case "resolution-failed":
            return {
              success: false,
              error: F$o(a.resolution)
            };
          case "blocked-by-policy":
            return {
              success: false,
              error: `Plugin "${a.pluginName}" is blocked by your organization's policy and cannot be installed`
            };
          case "dependency-blocked-by-policy":
            return {
              success: false,
              error: `Cannot install "${a.pluginName}": dependency "${a.blockedDependency}" is blocked by your organization's policy`
            };
          case "marketplace-blocked-by-policy":
            return {
              success: false,
              error: `Cannot install "${a.pluginName}": marketplace "${a.marketplaceName}" is blocked by your organization's policy`
            };
          case "dependency-marketplace-blocked-by-policy":
            return {
              success: false,
              error: `Cannot install "${a.pluginName}": dependency "${a.blockedDependency}" is from marketplace "${a.marketplaceName}", which is blocked by your organization's policy`
            };
          case "range-conflict":
            {
              let c = a.dep === e ? "Plugin" : "Dependency";
              return {
                success: false,
                error: sqt(c, a.dep, a.ranges, a.why, a.installed)
              };
            }
          case "no-matching-tag":
            {
              let c = a.dep === e ? "Plugin" : "Dependency";
              return {
                success: false,
                error: DFn(c, a.dep, a.range)
              };
            }
        }
      }
      logEvent("tengu_plugin_installed", {
        ...pV(t.name, n, II()),
        plugin_id: uso(n) ? e : "third-party",
        trigger: o,
        install_source: o === "hint" ? "ui-suggestion" : "ui-discover",
        ...(t.version && {
          version: uS(t.version)
        })
      });
      let l = Py("plugin enable", e);
      return {
        success: true,
        message: a.installedDisabled.includes(e) ? `\u2713 Installed ${t.name}${a.depNote}. This plugin is disabled by default \u2014 enable it in /plugin${l ? ` or run: ${l}` : ""}` : `\u2713 Installed ${t.name}${a.depNote}. Run /reload-plugins to activate.`,
        depNote: a.depNote,
        installedDisabled: a.installedDisabled.includes(e)
      };
    } catch (s) {
      let i = s instanceof Error ? s.message : String(s);
      logForDebugging(`installPluginFromMarketplace failed for ${e}: ${i}`, {
        level: "error"
      });
      ZBl({
        reason: "unexpected-error",
        errorKind: iX(s),
        pluginId: e,
        entry: t,
        marketplaceName: n,
        trigger: o
      });
      return {
        success: false,
        error: `Failed to install: ${i}`
      };
    }
  }
  var e2l;
  var ovt;
  var g5;
  var rie = __lazy(() => {
    Ot();
    Gu();
    vo();
    je();
    dt();
    nf();
    dV();
    yS();
    Wk();
    p5();
    MSe();
    Qk();
    H8();
    yT();
    O$o();
    D$o();
    k1();
    Kf();
    xg();
    a9();
    Xk();
    GXt();
    TC();
    PFe();
    e2l = require("crypto");
    ovt = require("fs/promises");
    g5 = require("path");
  });
  function ivt(e, t, n) {
    if (!Object.hasOwn(t, e)) {
      return null;
    }
    let r = new Set();
    let o = e;
    for (let s = 0; s < 16; s++) {
      if (r.vZc(o)) {
        return {
          kind: "unresolved",
          reason: "cycle"
        };
      }
      r.add(o);
      let i = Object.hasOwn(t, o) ? t[o] : undefined;
      if (i === undefined) {
        return n.vZc(o) ? {
          kind: "renamed",
          to: o,
          chainDepth: s
        } : {
          kind: "unresolved",
          reason: "target-missing"
        };
      }
      if (i === null) {
        return {
          kind: "removed",
          chainDepth: s + 1
        };
      }
      o = i;
    }
    return {
      kind: "unresolved",
      reason: "chain-too-deep"
    };
  }
  function s2l(e) {
    if (e.length === 0) {
      return;
    }
    let t = 0;
    let n = 0;
    let r = new Set(ew());
    for (let o of sF) {
      if (!r.vZc(o)) {
        continue;
      }
      let s = getSettingsForSource(o);
      let i = s?.enabledPlugins;
      let a = s?.pluginConfigs;
      if (!i && !a) {
        continue;
      }
      let l = {};
      let c = {};
      for (let {
        oldId: d,
        newId: p
      } of e) {
        if (i && d in i) {
          if (l[d] = undefined, p !== null && !(p in i) && !(p in l)) {
            l[p] = i[d];
          }
        }
        if (a && d in a) {
          if (c[d] = undefined, p !== null && !(p in a) && !(p in c)) {
            c[p] = a[d];
          }
        }
      }
      if (Object.keys(l).length === 0 && Object.keys(c).length === 0) {
        continue;
      }
      let {
        error: u
      } = updateSettingsForSource(o, {
        ...(Object.keys(l).length > 0 && {
          enabledPlugins: l
        }),
        ...(Object.keys(c).length > 0 && {
          pluginConfigs: c
        })
      });
      if (u) {
        n++;
        logForDebugging(`migrateRenamedPluginsInSettings: failed to update ${o}: ${u.message}`, {
          level: "warn"
        });
      } else {
        t++;
      }
    }
    if (t > 0 && n === 0) {
      Pe("plugin_rename_migration");
    } else if (t > 0) {
      Et("plugin_rename_migration", "partial_settings_write");
    } else if (n > 0) {
      Ae("plugin_rename_migration", "settings_write_failed");
    } else {
      Et("plugin_rename_migration", "no_editable_scope");
    }
  }
  var Bor = __lazy(() => {
    ln();
    je();
    nf();
  });
  var i2l;
  var a2l = __lazy(() => {
    i2l = ["agent", "subagentStatusLine"];
  });
  var U$o = __lazy(() => {
    vvo();
    dt();
    fv();
  });
  var A2l = {};