  __export(A2l, {
    resolvePluginRoot: () => resolvePluginRoot,
    resolvePluginPath: () => resolvePluginPath,
    resolveContainedPluginPath: () => resolveContainedPluginPath,
    probeSeedCacheAnyVersion: () => probeSeedCacheAnyVersion,
    mergePluginSources: () => mergePluginSources,
    loadSkillsAsPlugins: () => loadSkillsAsPlugins,
    loadPluginManifest: () => loadPluginManifest,
    loadAllPluginsForPreview: () => loadAllPluginsForPreview,
    loadAllPluginsCacheOnly: () => loadAllPluginsCacheOnly,
    loadAllPlugins: () => loadAllPlugins,
    installFromNpm: () => installFromNpm,
    installFromGitSubdir: () => installFromGitSubdir,
    gitClone: () => gitClone,
    getVersionedZipCachePath: () => getVersionedZipCachePath,
    getVersionedCachePathIn: () => getVersionedCachePathIn,
    getVersionedCachePath: () => getVersionedCachePath,
    getPluginCachePath: () => getPluginCachePath,
    getLegacyCachePath: () => getLegacyCachePath,
    getEnabledPluginBinPaths: () => getEnabledPluginBinPaths,
    generateTemporaryCacheNameForPlugin: () => generateTemporaryCacheNameForPlugin,
    displaySkillsDirPath: () => displaySkillsDirPath,
    createPluginFromPath: () => createPluginFromPath,
    copyPluginToVersionedCache: () => copyPluginToVersionedCache,
    copyDir: () => copyDir,
    clearPluginCache: () => clearPluginCache,
    cachePluginSettings: () => cachePluginSettings,
    cachePlugin: () => cachePlugin,
    cacheMatchesDeclaredPaths: () => cacheMatchesDeclaredPaths,
    cacheDirHasPluginContent: () => cacheDirHasPluginContent,
    IMPLICIT_PLUGIN_LAYOUT_ENTRIES: () => IMPLICIT_PLUGIN_LAYOUT_ENTRIES
  });
  function displaySkillsDirPath(e) {
    if (e.scope === "project") {
      let t = vs.join(getOriginalCwd(), ".claude", "skills");
      if (e.path.startsWith(t + vs.sep)) {
        return "." + vs.sep + vs.relative(getOriginalCwd(), e.path);
      }
    }
    return LN(e.path);
  }
  function getPluginCachePath() {
    return vs.join(XC(), "cache");
  }
  function getVersionedCachePathIn(e, t, n) {
    let {
      name: r,
      marketplace: o
    } = Yo(t);
    let s = (o || "unknown").replace(/[^a-zA-Z0-9\-_]/g, "-");
    let i = (r || t).replace(/[^a-zA-Z0-9\-_]/g, "-");
    let a = n.replace(/[^a-zA-Z0-9\-_.]/g, "-");
    if (a === "." || a === "..") {
      a = "-";
    }
    return vs.join(e, "cache", s, i, a);
  }
  function getVersionedCachePath(e, t) {
    return getVersionedCachePathIn(XC(), e, t);
  }
  async function cacheDirHasPluginContent(e) {
    let t;
    try {
      t = await wd.readdir(e);
    } catch (n) {
      if (Io(n)) {
        return false;
      }
      throw n;
    }
    return t.some(n => !n2m.vZc(n));
  }
  async function cacheMatchesDeclaredPaths(e, t, n) {
    if (!t) {
      return true;
    }
    let r = [];
    function o(a, l) {
      if (!a) {
        return;
      }
      for (let c of Array.isArray(a) ? a : [a]) {
        if (typeof c === "string") {
          r.push({
            relPath: c,
            mustBeDirectory: l
          });
        }
      }
    }
    if (o(t.agents, false), o(t.skills, true), typeof t.commands === "string" || Array.isArray(t.commands)) {
      o(t.commands, false);
    } else if (t.commands && typeof t.commands === "object") {
      for (let a of Object.values(t.commands)) {
        if (a && typeof a === "object" && a.source) {
          r.push({
            relPath: a.source,
            mustBeDirectory: false
          });
        }
      }
    }
    if (r.length === 0) {
      return true;
    }
    let i = (await Promise.all(r.map(async ({
      relPath: a,
      mustBeDirectory: l
    }) => {
      let c = resolveContainedPluginPath(e, a);
      if (c === null) {
        return {
          relPath: a,
          ok: true
        };
      }
      try {
        let u = await wd.stat(c);
        return {
          relPath: a,
          ok: l ? u.isDirectory() : true
        };
      } catch {
        return {
          relPath: a,
          ok: false
        };
      }
    }))).filter(a => !a.ok).map(a => a.relPath);
    if (i.length > 0) {
      logForDebugging(`Cache at ${e} for ${n} is missing entry-declared component paths (${i.join(", ")}); treating as stale`);
      return false;
    }
    return true;
  }
  async function B$o(e) {
    await wd.rm(vs.join(e, ".orphaned_at"), {
      force: true
    }).catch(() => {});
  }
  async function o2m(e) {
    let t = e?.filter(gfe);
    if (!t || t.length === 0) {
      return;
    }
    if (t.length === 1) {
      return t[0];
    }
    for (let n of t) {
      let r = n.installPath;
      if (!r) {
        continue;
      }
      if (r.endsWith(".zip") ? await ad(r) : await cacheDirHasPluginContent(r)) {
        return n;
      }
    }
    return t[0];
  }
  function getVersionedZipCachePath(e, t) {
    return `${getVersionedCachePath(e, t)}.zip`;
  }
  async function qor(e, t) {
    for (let n of fde()) {
      let r = getVersionedCachePathIn(n, e, t);
      try {
        if ((await wd.readdir(r)).length > 0) {
          return r;
        }
      } catch {}
    }
    return null;
  }
  async function probeSeedCacheAnyVersion(e) {
    for (let t of fde()) {
      let n = vs.dirname(getVersionedCachePathIn(t, e, "_"));
      try {
        let r = await wd.readdir(n);
        if (r.length !== 1) {
          continue;
        }
        let o = vs.join(n, r[0]);
        if ((await wd.readdir(o)).length > 0) {
          return o;
        }
      } catch {}
    }
    return null;
  }
  function getLegacyCachePath(e) {
    let t = getPluginCachePath();
    return vs.join(t, e.replace(/[^a-zA-Z0-9\-_]/g, "-"));
  }
  async function resolvePluginPath(e, t) {
    if (t) {
      let o = getVersionedCachePath(e, t);
      if (await ad(o)) {
        return o;
      }
    }
    let n = Yo(e).name || e;
    let r = getLegacyCachePath(n);
    if (await ad(r)) {
      return r;
    }
    return t ? getVersionedCachePath(e, t) : r;
  }
  function $or(e, t) {
    if (e === t) {
      return true;
    }
    let n = t.endsWith(vs.sep) ? t : t + vs.sep;
    return e.startsWith(n);
  }
  async function copyDir(e, t, n = e, r = t, o = n, s = new Set()) {
    await zt().mkdir(t);
    let i = vs.resolve(e);
    let a = vs.resolve(t);
    let l = a.startsWith(i + vs.sep) ? vs.relative(i, a).split(vs.sep)[0] : undefined;
    let c = await wd.readdir(e, {
      withFileTypes: true
    });
    for (let u of c) {
      if (l !== undefined && u.name === l) {
        continue;
      }
      let d = vs.join(e, u.name);
      let p = vs.join(t, u.name);
      if (u.isDirectory()) {
        await copyDir(d, p, n, r, o, s);
      } else if (u.isFile()) {
        await wd.copyFile(d, p);
      } else if (u.isSymbolicLink()) {
        let m;
        try {
          m = await wd.readlink(d);
        } catch (y) {
          if (en(y) !== "EINVAL") {
            logForDebugging(`copyDir: readlink failed for ${d}: ${he(y)}`, {
              level: "warn"
            });
          }
          continue;
        }
        let f;
        try {
          f = await wd.realpath(d);
        } catch {
          if (!vs.isAbsolute(m)) {
            let y = vs.resolve(vs.dirname(d), m);
            if ($or(y, vs.resolve(n))) {
              await wd.symlink(m, p);
              continue;
            }
          }
          logForDebugging(`copyDir: skipping broken symlink ${d} -> ${m}`);
          continue;
        }
        let h;
        try {
          h = await wd.realpath(n);
        } catch {
          h = n;
        }
        let g;
        try {
          g = await wd.realpath(o);
        } catch {
          g = o;
        }
        if ($or(f, h)) {
          let y = vs.relative(h, f);
          let _ = vs.join(r, y);
          let b = vs.relative(vs.dirname(p), _);
          await wd.symlink(b, p);
        } else if ($or(f, g) && !$or(h, f)) {
          if (s.vZc(f)) {
            logForDebugging(`copyDir: skipping cyclic symlink target ${d} -> ${f}`);
            continue;
          }
          let y = await wd.stat(f).catch(_ => {
            logForDebugging(`copyDir: stat failed while materializing ${d} -> ${f}: ${he(_)}`, {
              level: "warn"
            });
            return;
          });
          if (!y) {
            continue;
          }
          if (y.isFile()) {
            await wd.copyFile(f, p);
          } else if (y.isDirectory()) {
            s.add(f);
            try {
              await copyDir(f, p, f, p, o, s);
            } finally {
              s.delete(f);
            }
          } else {
            logForDebugging(`copyDir: skipping non-regular symlink target ${d} -> ${f}`);
          }
        } else {
          logForDebugging(`copyDir: skipping symlink escaping containment root: ${d} -> ${f}`);
        }
      }
    }
  }
  async function copyPluginToVersionedCache(e, t, n, r, o, s) {
    let i = iK();
    let a = s?.forceOverwrite ?? false;
    let l = getVersionedCachePath(t, n);
    let c = getVersionedZipCachePath(t, n);
    if (i) {
      if (await ad(c)) {
        if (!a) {
          logForDebugging(`Plugin ${t} version ${n} already cached at ${c}`);
          return c;
        }
        await wd.rm(c, {
          force: true
        });
      }
    } else if (await ad(l)) {
      let f = await cacheDirHasPluginContent(l);
      if (!a && f) {
        await B$o(l);
        logForDebugging(`Plugin ${t} version ${n} already cached at ${l}`);
        return l;
      }
      if (f) {
        let h = false;
        try {
          h = await IXt(l, {
            excludeSelf: true
          });
        } catch {
          h = true;
        }
        if (h) {
          logForDebugging(`Cache for ${t} at ${l} is in use by another session; deferring overwrite until it exits`);
          return l;
        }
      }
      logForDebugging(`Removing ${f ? "superseded" : "incomplete"} cache directory for ${t} at ${l}`);
      await wd.rm(l, {
        recursive: true,
        force: true
      });
    }
    let u = await qor(t, n);
    if (u) {
      logForDebugging(`Using seed cache for ${t}@${n} at ${u}`);
      return u;
    }
    if (await zt().mkdir(vs.dirname(l)), r && typeof r.source === "string" && o) {
      let f = Uor(o, r.source);
      logForDebugging(`Copying source directory ${r.source} for plugin ${t}`);
      try {
        await copyDir(f, l, f, l, o);
      } catch (h) {
        if (fn(h) && Dds(h) === f) {
          throw Error(`Plugin source directory not found: ${f} (from entry.source: ${r.source})`);
        }
        throw h;
      }
    } else {
      logForDebugging(`Copying plugin ${t} to versioned cache (fallback to full copy)`);
      await copyDir(e, l);
    }
    let d = vs.join(l, ".git");
    if (await wd.rm(d, {
      recursive: true,
      force: true
    }), (await wd.readdir(l)).length === 0) {
      throw Error(`Failed to copy plugin ${t} to versioned cache: destination is empty after copy`);
    }
    let m = await Oor(l);
    if (m.error) {
      logForDebugging(`Plugin dependency install warning for ${t}: ${m.error}`, {
        level: "warn"
      });
    }
    if (await Por(l, t), i) {
      await bor(l, c);
      logForDebugging(`Successfully cached plugin ${t} as ZIP at ${c}`);
      return c;
    }
    logForDebugging(`Successfully cached plugin ${t} at ${l}`);
    return l;
  }
  function y2l(e) {
    try {
      let t = new URL(e);
      if (!["https:", "http:", "file:"].includes(t.protocol)) {
        if (!/^git@[a-zA-Z0-9.-]+:/.test(e)) {
          throw Error(`Invalid git URL protocol: ${t.protocol}. Only HTTPS, HTTP, file:// and SSH (git@) URLs are supported.`);
        }
      }
      return e;
    } catch {
      if (/^git@[a-zA-Z0-9.-]+:/.test(e)) {
        return e;
      }
      throw Error(`Invalid git URL: ${e}`);
    }
  }
  async function installFromNpm(e, t, n = {}) {
    let r = vs.join(XC(), "npm-cache");
    await zt().mkdir(r);
    let o = `${e}@${n.version ?? "latest"}`;
    let s = vs.join(r, "node_modules", e);
    let i;
    try {
      let l = qt(await wd.readFile(vs.join(s, "package.json"), "utf8"));
      if (typeof l.version === "string") {
        i = l.version;
      }
    } catch {}
    if (!(n.version && n.version === i)) {
      logForDebugging(`Installing npm package ${o} to cache`);
      let l = ["install", o, "--prefix", r, "--no-fund", "--no-audit", "--no-progress", "--loglevel=error"];
      if (n.registry) {
        l.push("--registry", n.registry);
      }
      let c = await execFileNoThrow("npm", l, {
        useCwd: false
      });
      if (c.code !== 0) {
        throw $o(Error(`Failed to install npm package: ${c.stderr}`), "plugin npm install failed (stderr redacted)");
      }
    } else {
      logForDebugging(`npm cache hit for ${e}@${i} (pinned, matches requested)`);
    }
    await copyDir(s, t);
    logForDebugging(`Copied npm package ${e} from cache to ${t}`);
  }
  async function b2l(e, t, n) {
    let r = await execFileNoThrowWithCwd(gitExe(), ["rev-parse", "HEAD"], {
      cwd: e,
      env: n,
      stdin: "ignore"
    });
    let o = r.stdout.trim();
    if (r.code !== 0 || o.toLowerCase() !== t.toLowerCase()) {
      if (r.stderr) {
        logForDebugging(`plugin SHA pin rev-parse stderr: ${r.stderr}`);
      }
      throw new Po(`SHA pin verification failed: expected HEAD to be ${t}, got ${o || "(rev-parse failed)"}. The pinned commit may have been removed upstream, or a ref with the same name exists. Refusing to install.`, "plugin SHA pin verification failed");
    }
  }
  async function gitClone(e, t, n, r) {
    if (r?.startsWith("-")) {
      throw Error(`Invalid sha "${r}": cannot start with "-"`);
    }
    if (n?.startsWith("-")) {
      throw Error(`Invalid ref "${n}": cannot start with "-"`);
    }
    let o = [...$re, "clone", "--depth", "1", "--recurse-submodules", "--shallow-submodules"];
    if (n && !r) {
      o.push("--branch", n);
    }
    if (r) {
      o.push("--no-checkout");
    }
    o.push("--", e, t);
    let s = fV();
    let i = performance.now();
    let a = await execFileNoThrow(gitExe(), o, {
      useCwd: true,
      env: s,
      stdin: "ignore"
    });
    if (a.code !== 0) {
      throw dM("plugin_clone", e, "failure", performance.now() - i, mV(a.stderr)), $o(Error(`Failed to clone repository: ${a.stderr}`), "plugin git clone failed (stderr redacted)");
    }
    if (r) {
      if ((await execFileNoThrowWithCwd(gitExe(), [...$re, "fetch", "--depth", "1", "origin", r], {
        cwd: t,
        env: s,
        stdin: "ignore"
      })).code !== 0) {
        logForDebugging(`Shallow fetch of SHA ${r} failed, falling back to unshallow fetch`);
        let u = await execFileNoThrowWithCwd(gitExe(), [...$re, "fetch", "--unshallow", ...(n ? ["origin", n] : [])], {
          cwd: t,
          env: s,
          stdin: "ignore"
        });
        if (u.code !== 0) {
          throw dM("plugin_clone", e, "failure", performance.now() - i, mV(u.stderr)), $o(Error(`Failed to fetch commit ${r}: ${u.stderr}`), "plugin git fetch (unshallow) failed (stderr redacted)");
        }
      }
      let c = await execFileNoThrowWithCwd(gitExe(), ["checkout", r], {
        cwd: t,
        env: s,
        stdin: "ignore"
      });
      if (c.code !== 0) {
        throw dM("plugin_clone", e, "failure", performance.now() - i, mV(c.stderr)), $o(Error(`Failed to checkout commit ${r}: ${c.stderr}`), "plugin git checkout failed (stderr redacted)");
      }
      try {
        await b2l(t, r, s);
      } catch (u) {
        throw dM("plugin_clone", e, "failure", performance.now() - i, "sha_pin_mismatch"), u;
      }
    }
    dM("plugin_clone", e, "success", performance.now() - i);
  }
  async function T2l(e, t, n, r) {
    let o = y2l(e);
    await gitClone(o, t, n, r);
    let s = n ? ` (ref: ${n})` : "";
    logForDebugging(`Cloned repository from ${o}${s} to ${t}`);
  }
  async function i2m(e, t, n, r) {
    if (!/^[a-zA-Z0-9-_.]+\/[a-zA-Z0-9-_.]+$/.test(e)) {
      throw Error(`Invalid GitHub repository format: ${e}. Expected format: owner/repo`);
    }
    let o = yOe() ? `https://github.com/${e}.git` : `git@${"github.com"}:${e}.git`;
    return T2l(o, t, n, r);
  }
  function a2m(e) {
    if (/^[a-zA-Z0-9-_.]+\/[a-zA-Z0-9-_.]+$/.test(e)) {
      return yOe() ? `https://github.com/${e}.git` : `git@${"github.com"}:${e}.git`;
    }
    return y2l(e);
  }
  async function installFromGitSubdir(e, t, n, r, o) {
    if (!(await DGe())) {
      throw Error("git-subdir plugin source requires git to be installed and on PATH. Install git (version 2.25 or later for sparse-checkout cone mode) and try again.");
    }
    if (o?.startsWith("-")) {
      throw Error(`Invalid sha "${o}": cannot start with "-"`);
    }
    if (r?.startsWith("-")) {
      throw Error(`Invalid ref "${r}": cannot start with "-"`);
    }
    let s = a2m(e);
    let i = `${t}.clone`;
    let a = [...$re, "clone", "--depth", "1", "--filter=tree:0", "--no-checkout"];
    if (r && !o) {
      a.push("--branch", r);
    }
    a.push("--", s, i);
    let l = fV();
    let c = await execFileNoThrow(gitExe(), a, {
      useCwd: true,
      env: l,
      stdin: "ignore"
    });
    if (c.code !== 0) {
      throw $o(Error(`Failed to clone repository for git-subdir source: ${c.stderr}`), "plugin git-subdir clone failed (stderr redacted)");
    }
    try {
      let u = await execFileNoThrowWithCwd(gitExe(), ["sparse-checkout", "set", "--cone", "--", n], {
        cwd: i,
        env: l,
        stdin: "ignore"
      });
      if (u.code !== 0) {
        throw $o(Error(`git sparse-checkout set failed (git >= 2.25 required for cone mode): ${u.stderr}`), "plugin git sparse-checkout set failed (stderr redacted)");
      }
      let d;
      if (o) {
        if ((await execFileNoThrowWithCwd(gitExe(), [...$re, "fetch", "--depth", "1", "origin", o], {
          cwd: i,
          env: l,
          stdin: "ignore"
        })).code !== 0) {
          logForDebugging(`Shallow fetch of SHA ${o} failed for git-subdir, falling back to unshallow fetch`);
          let y = await execFileNoThrowWithCwd(gitExe(), [...$re, "fetch", "--unshallow", ...(r ? ["origin", r] : [])], {
            cwd: i,
            env: l,
            stdin: "ignore"
          });
          if (y.code !== 0) {
            throw $o(Error(`Failed to fetch commit ${o}: ${y.stderr}`), "plugin git-subdir fetch (unshallow) failed (stderr redacted)");
          }
        }
        let g = await execFileNoThrowWithCwd(gitExe(), [...$re, "checkout", o], {
          cwd: i,
          env: l,
          stdin: "ignore"
        });
        if (g.code !== 0) {
          throw $o(Error(`Failed to checkout commit ${o}: ${g.stderr}`), "plugin git-subdir checkout failed (stderr redacted)");
        }
        await b2l(i, o, l);
        d = o;
      } else {
        let [h, g] = await Promise.all([execFileNoThrowWithCwd(gitExe(), [...$re, "checkout", "HEAD"], {
          cwd: i,
          env: l,
          stdin: "ignore"
        }), execFileNoThrowWithCwd(gitExe(), ["rev-parse", "HEAD"], {
          cwd: i,
          env: l,
          stdin: "ignore"
        })]);
        if (h.code !== 0) {
          throw $o(Error(`git checkout after sparse-checkout failed: ${h.stderr}`), "plugin git-subdir checkout (post sparse-checkout) failed (stderr redacted)");
        }
        if (g.code === 0) {
          d = g.stdout.trim();
        }
      }
      let p = Uor(i, n);
      try {
        await wd.rename(p, t);
      } catch (h) {
        if (fn(h)) {
          throw Error(`Subdirectory '${n}' not found in repository ${s}${r ? ` (ref: ${r})` : ""}. Check that the path is correct and exists at the specified ref/sha.`);
        }
        throw h;
      }
      let m = r ? ` ref=${r}` : "";
      let f = d ? ` sha=${d}` : "";
      logForDebugging(`Extracted subdir ${n} from ${s}${m}${f} to ${t}`);
      return d;
    } finally {
      await wd.rm(i, {
        recursive: true,
        force: true
      });
    }
  }
  async function l2m(e, t, n) {
    if (!(await ad(e))) {
      throw Error(`Source path does not exist: ${e}`);
    }
    if (n) {
      await copyDir(e, t, e, t, n);
    } else {
      await copyDir(e, t);
    }
    let r = vs.join(t, ".git");
    await wd.rm(r, {
      recursive: true,
      force: true
    });
  }
  function generateTemporaryCacheNameForPlugin(e) {
    let t = Date.now();
    let n = Math.random().toString(36).substring(2, 8);
    let r;
    if (typeof e === "string") {
      r = "local";
    } else {
      switch (e.source) {
        case "npm":
          r = "npm";
          break;
        case "github":
          r = "github";
          break;
        case "url":
          r = "git";
          break;
        case "git-subdir":
          r = "subdir";
          break;
        default:
          r = "unknown";
      }
    }
    return `temp_${r}_${t}_${n}`;
  }
  async function cachePlugin(e, t) {
    let n = getPluginCachePath();
    await zt().mkdir(n);
    let r = generateTemporaryCacheNameForPlugin(e);
    let o = vs.join(n, r);
    let s = false;
    let i;
    try {
      if (logForDebugging(`Caching plugin from source: ${De(e)} to temporary path ${o}`), s = true, typeof e === "string") {
        await l2m(e, o, t?.containmentRoot);
      } else {
        switch (e.source) {
          case "npm":
            await installFromNpm(e.package, o, {
              registry: e.registry,
              version: e.version
            });
            break;
          case "github":
            await i2m(e.repo, o, e.ref, e.sha);
            break;
          case "url":
            await T2l(e.url, o, e.ref, e.sha);
            break;
          case "git-subdir":
            i = await installFromGitSubdir(e.url, o, e.path, e.ref, e.sha);
            break;
          default:
            throw Error("This plugin uses a source type your Claude Code version does not support. Update Claude Code and try again.");
        }
      }
    } catch (p) {
      if (s && (await ad(o))) {
        logForDebugging(`Cleaning up failed installation at ${o}`);
        try {
          await wd.rm(o, {
            recursive: true,
            force: true
          });
        } catch (m) {
          logForDebugging(`Failed to clean up installation: ${m}`, {
            level: "error"
          });
        }
      }
      throw p;
    }
    let a = typeof e === "string" ? e : e.source;
    let {
      manifest: l,
      manifestPath: c,
      depConstraints: u
    } = await loadPluginManifest(o, r, a, [vs.join(o, "plugin.json")]);
    let d = c !== null ? l : t?.manifest || {
      name: r,
      description: `Plugin cached from ${a}`
    };
    logForDebugging(`Successfully cached plugin ${d.name} to ${o}`);
    return {
      path: o,
      manifest: d,
      ...(i && {
        gitCommitSha: i
      }),
      ...(u && {
        depConstraints: u
      })
    };
  }
  async function loadPluginManifest(e, t, n, r = []) {
    let o = [vs.join(e, ".claude-plugin", "plugin.json"), ...r];
    for (let s of o) {
      let i;
      try {
        i = await wd.readFile(s, {
          encoding: "utf-8"
        });
      } catch (d) {
        if (fn(d) || en(d) === "ENOTDIR") {
          continue;
        }
        let p = he(d);
        throw Ae("plugin_load_manifest", "plugin_load_manifest_read_failed"), logForDebugging(`Plugin ${t}: failed to read manifest file at ${s}. Read error: ${p}`, {
          level: "error"
        }), Error(`Plugin ${t}: failed to read manifest file at ${s}.

Read error: ${p}`);
      }
      let a;
      try {
        a = qt(i);
      } catch (d) {
        let p = he(d);
        throw Ae("plugin_load_manifest", "plugin_load_manifest_json_invalid"), logForDebugging(`Plugin ${t} has a corrupt manifest file at ${s}. Parse error: ${p}`, {
          level: "error"
        }), Error(`Plugin ${t} has a corrupt manifest file at ${s}.

JSON parse error: ${p}`);
      }
      let l = IGe(a, "plugin-json", {
        pluginName: t,
        manifestPath: s
      });
      if (!l.ok) {
        throw Ae("plugin_load_manifest", "plugin_load_manifest_schema_invalid"), logForDebugging(l.error, {
          level: "error"
        }), Error(l.error);
      }
      let {
        manifest: c,
        rawCandidate: u
      } = l;
      Pe("plugin_load_manifest");
      return {
        manifest: c,
        manifestPath: s,
        depConstraints: bta(u)
      };
    }
    Pe("plugin_load_manifest");
    return {
      manifest: {
        name: t,
        description: `Plugin from ${n}`
      },
      manifestPath: null,
      depConstraints: undefined
    };
  }
  async function l2l(e, t) {
    if (!(await ad(e))) {
      throw Error(`Hooks file not found at ${e} for plugin ${t}. If the manifest declares hooks, the file must exist.`);
    }
    let n = await wd.readFile(e, {
      encoding: "utf-8"
    });
    let r = qt(n);
    return byn().parse(r).hooks;
  }
  async function c2m(e, t, n, r) {
    let o = t.experimental?.monitors ?? t.monitors;
    let s;
    if (o === undefined) {
      let i = vs.join(e, "monitors", "monitors.json");
      if (await ad(i)) {
        s = i;
      }
    } else if (typeof o === "string") {
      let i = resolveContainedPluginPath(e, o);
      if (i === null) {
        r.push({
          type: "path-traversal",
          source: n,
          plugin: t.name,
          path: o,
          component: "monitors"
        });
        return;
      }
      s = i;
    } else {
      return o;
    }
    if (s === undefined) {
      return;
    }
    try {
      let i = await wd.readFile(s, {
        encoding: "utf-8"
      });
      return G1r().parse(qt(i));
    } catch (i) {
      let a = he(i);
      logForDebugging(`Failed to load monitors for ${t.name} from ${s}: ${a}`, {
        level: "error"
      });
      r.push({
        type: "component-load-failed",
        source: n,
        plugin: t.name,
        component: "monitors",
        path: s,
        reason: a
      });
      return;
    }
  }
  function resolveContainedPluginPath(e, t) {
    let n = vs.resolve(e);
    let r = vs.resolve(n, t);
    let o = vs.relative(n, r);
    if (o.startsWith("..") || vs.resolve(o) === o) {
      return null;
    }
    return r;
  }
  async function y5(e, t, n, r, o, s, i, a, l = false) {
    let c = await Promise.all(e.map(async d => {
      let p = resolveContainedPluginPath(t, d);
      if (p === null) {
        return {
          relPath: d,
          fullPath: null,
          exists: false,
          isDirectory: false
        };
      }
      try {
        let m = await wd.stat(p);
        return {
          relPath: d,
          fullPath: p,
          exists: true,
          isDirectory: m.isDirectory()
        };
      } catch {
        return {
          relPath: d,
          fullPath: p,
          exists: false,
          isDirectory: false
        };
      }
    }));
    let u = [];
    for (let {
      relPath: d,
      fullPath: p,
      exists: m,
      isDirectory: f
    } of c) {
      if (p === null) {
        logForDebugging(`${s} path ${d} ${i} escapes plugin directory for ${n}`, {
          level: "error"
        });
        a.push({
          type: "path-traversal",
          source: r,
          plugin: n,
          path: d,
          component: o
        });
        continue;
      }
      if (!m) {
        logForDebugging(`${s} path ${d} ${i} not found at ${p} for ${n}`, {
          level: "error"
        });
        a.push({
          type: "path-not-found",
          source: r,
          plugin: n,
          path: p,
          component: o
        });
      } else if (l && !f) {
        let h = vs.dirname(d);
        let g = o === "skills" && vs.basename(d).toLowerCase() === "skill.md" && h !== "." ? ` \u2014 point to the parent directory '${h}' instead` : "";
        let y = o === "skills" ? `path is a file; skills entries must be directories containing SKILL.md${g}` : "path is a file; expected a directory";
        logForDebugging(`${s} path ${d} ${i} is a file, not a directory, for ${n}`, {
          level: "error"
        });
        a.push({
          type: "component-load-failed",
          source: r,
          plugin: n,
          path: d,
          component: o,
          reason: y
        });
      } else {
        u.push(p);
      }
    }
    return u;
  }
  function c2l(e, t, n) {
    let r = [];
    if (typeof e === "string") {
      r.push(e);
    } else if (Array.isArray(e)) {
      for (let s of e) {
        if (typeof s === "string") {
          r.push(s);
        }
      }
    } else if (e && typeof e === "object") {
      for (let s of Object.values(e)) {
        if (s && typeof s === "object" && "source" in s && typeof s.source === "string") {
          r.push(s.source);
        }
      }
    }
    let o = n + vs.sep;
    return r.some(s => {
      let i = resolveContainedPluginPath(t, s);
      return i !== null && (i + vs.sep).startsWith(o);
    });
  }
  async function createPluginFromPath(e, t, n, r, o = true) {
    let s = [];
    let i = [];
    let {
      manifest: a,
      manifestPath: l,
      depConstraints: c
    } = await loadPluginManifest(e, r, t);
    let u = {
      name: a.name,
      manifest: a,
      path: e,
      source: t,
      repository: t,
      enabled: n,
      depConstraints: c
    };
    let [d, p, m, f, h, g] = await Promise.all([ad(vs.join(e, "commands")), ad(vs.join(e, "agents")), ad(vs.join(e, "skills")), ad(vs.join(e, "output-styles")), ad(vs.join(e, "themes")), ad(vs.join(e, "workflows"))]);
    let {
      marketplace: y
    } = Yo(t);
    for (let [j, z, V, K] of [["commands", d, "commands", "commands"], ["agents", p, "agents", "agents"], ["outputStyles", f, "output-styles", "output-styles"], ["themes", h, "themes", "themes"]]) {
      let J = a.experimental?.[j];
      let Q = a[j];
      if (j === "themes") {
        Q = a.experimental?.themes ?? a.themes;
      } else if (j === "outputStyles") {
        Q = a.outputStyles;
      }
      let Z = [];
      if (J !== undefined) {
        Z.push(`experimental.${j}`);
      }
      if (a[j] !== undefined && (J === undefined || true)) {
        Z.push(j);
      }
      if (!Q || !z) {
        continue;
      }
      kFn(a.name, y, V);
      let ne = vs.join(e, K);
      if (c2l(Q, e, ne)) {
        continue;
      }
      logForDebugging(`Plugin ${a.name}: ${K}/ folder exists but is not auto-loaded because the manifest sets ${Z.map(oe => `"${oe}"`).join(" and ")}`);
      i.push({
        type: "folder-shadowed-by-manifest",
        source: t,
        plugin: a.name,
        component: V,
        folderPath: ne,
        manifestFields: Z
      });
    }
    if (a.workflows && g) {
      kFn(a.name, y, "workflows");
      let j = vs.join(e, "workflows");
      if (!c2l(a.workflows, e, j)) {
        i.push({
          type: "folder-shadowed-by-manifest",
          source: t,
          plugin: a.name,
          component: "workflows",
          folderPath: j,
          manifestFields: [a.experimental?.workflows !== undefined ? "experimental.workflows" : "workflows"]
        });
      }
    }
    if ((a.experimental?.monitors ?? a.monitors) !== undefined && (await ad(vs.join(e, "monitors", "monitors.json")))) {
      kFn(a.name, y, "monitors");
    }
    let _ = !a.commands && d;
    let b = !a.agents && p;
    let S = m;
    let E = a.outputStyles;
    let C = !E && f;
    let x = !(a.experimental?.themes ?? a.themes) && h;
    let A = !a.workflows && g;
    let k = vs.join(e, "commands");
    if (_) {
      u.commandsPath = k;
    }
    if (a.commands) {
      let j = Object.values(a.commands)[0];
      if (typeof a.commands === "object" && !Array.isArray(a.commands) && j && typeof j === "object" && ("source" in j || "content" in j)) {
        let z = {};
        let V = [];
        let K = Object.entries(a.commands);
        let J = await Promise.all(K.map(async ([Q, Z]) => {
          if (!Z || typeof Z !== "object") {
            return {
              commandName: Q,
              metadata: Z,
              kind: "skip"
            };
          }
          if (Z.source) {
            let ne = resolveContainedPluginPath(e, Z.source);
            return {
              commandName: Q,
              metadata: Z,
              kind: "source",
              fullPath: ne,
              exists: ne !== null && (await ad(ne))
            };
          }
          if (Z.content) {
            return {
              commandName: Q,
              metadata: Z,
              kind: "content"
            };
          }
          return {
            commandName: Q,
            metadata: Z,
            kind: "skip"
          };
        }));
        for (let Q of J) {
          if (Q.kind === "skip") {
            continue;
          }
          if (Q.kind === "content") {
            z[Q.commandName] = Q.metadata;
            continue;
          }
          if (Q.fullPath === null) {
            logForDebugging(`Command ${Q.commandName} source ${Q.metadata.source} specified in manifest but escapes plugin directory for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-traversal",
              source: t,
              plugin: a.name,
              path: Q.metadata.source ?? "",
              component: "commands"
            });
          } else if (Q.exists) {
            V.push(Q.fullPath);
            z[Q.commandName] = Q.metadata;
          } else {
            logForDebugging(`Command ${Q.commandName} path ${Q.metadata.source} specified in manifest but not found at ${Q.fullPath} for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-not-found",
              source: t,
              plugin: a.name,
              path: Q.fullPath,
              component: "commands"
            });
          }
        }
        if (V.length > 0) {
          u.commandsPaths = V;
        }
        if (Object.keys(z).length > 0) {
          u.commandsMetadata = z;
        }
      } else {
        let z = Array.isArray(a.commands) ? a.commands : [a.commands];
        let V = await Promise.all(z.map(async J => {
          if (typeof J !== "string") {
            return {
              cmdPath: J,
              kind: "invalid"
            };
          }
          let Q = resolveContainedPluginPath(e, J);
          return {
            cmdPath: J,
            kind: "path",
            fullPath: Q,
            exists: Q !== null && (await ad(Q))
          };
        }));
        let K = [];
        for (let J of V) {
          if (J.kind === "invalid") {
            logForDebugging(`Unexpected command format in manifest for ${a.name}`, {
              level: "error"
            });
            continue;
          }
          if (J.fullPath === null) {
            logForDebugging(`Command path ${J.cmdPath} specified in manifest but escapes plugin directory for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-traversal",
              source: t,
              plugin: a.name,
              path: J.cmdPath,
              component: "commands"
            });
            continue;
          }
          if (J.exists) {
            K.push(J.fullPath);
          } else {
            logForDebugging(`Command path ${J.cmdPath} specified in manifest but not found at ${J.fullPath} for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-not-found",
              source: t,
              plugin: a.name,
              path: J.fullPath,
              component: "commands"
            });
          }
        }
        if (K.length > 0) {
          u.commandsPaths = K;
        }
      }
    }
    let I = vs.join(e, "agents");
    if (b) {
      u.agentsPath = I;
    }
    if (a.agents) {
      let j = Array.isArray(a.agents) ? a.agents : [a.agents];
      let z = await y5(j, e, a.name, t, "agents", "Agent", "specified in manifest but", s);
      if (z.length > 0) {
        u.agentsPaths = z;
      }
    }
    let O = vs.join(e, "skills");
    if (S) {
      u.skillsPath = O;
    }
    if (a.skills) {
      let j = Array.isArray(a.skills) ? a.skills : [a.skills];
      let z = vs.resolve(O);
      let V = vs.resolve(e);
      let K = (await y5(j, e, a.name, t, "skills", "Skill", "specified in manifest but", s, true)).filter(J => {
        let Q = vs.resolve(J);
        if (Q === z) {
          return false;
        }
        if (y === "skills-dir" && Q === V) {
          return false;
        }
        return true;
      });
      if (K.length > 0) {
        u.skillsPaths = K;
      }
    } else if (!S && y !== "skills-dir") {
      if (await ad(vs.join(e, "SKILL.md"))) {
        u.skillsPaths = [e];
      }
    }
    let M = vs.join(e, "output-styles");
    if (C) {
      u.outputStylesPath = M;
    }
    if (E) {
      let j = Array.isArray(E) ? E : [E];
      let z = await y5(j, e, a.name, t, "output-styles", "Output style", "specified in manifest but", s);
      if (z.length > 0) {
        u.outputStylesPaths = z;
      }
    }
    let L = vs.join(e, "themes");
    if (x) {
      u.themesPath = L;
    }
    let P = a.experimental?.themes ?? a.themes;
    if (P) {
      let j = Array.isArray(P) ? P : [P];
      let z = await y5(j, e, a.name, t, "themes", "Theme", "specified in manifest but", s);
      if (z.length > 0) {
        u.themesPaths = z;
      }
    }
    if (A) {
      u.workflowsPath = vs.join(e, "workflows");
    }
    if (a.workflows) {
      let j = Array.isArray(a.workflows) ? a.workflows : [a.workflows];
      let z = await y5(j, e, a.name, t, "workflows", "Workflow", "specified in manifest but", s);
      if (z.length > 0) {
        u.workflowsPaths = z;
      }
    }
    let F;
    let H = new Set();
    let U = vs.join(e, "hooks", "hooks.json");
    if (await ad(U)) {
      try {
        F = await l2l(U, a.name);
        try {
          H.add(await wd.realpath(U));
        } catch {
          H.add(U);
        }
        logForDebugging(`Read hooks.json for plugin ${a.name} (enabled=${n}${n ? "" : "; will NOT register, plugin is disabled"}): ${U}`);
      } catch (j) {
        let z = he(j);
        logForDebugging(`Failed to load hooks for ${a.name}: ${z}`, {
          level: "error"
        });
        s.push({
          type: "hook-load-failed",
          source: t,
          plugin: a.name,
          hookPath: U,
          reason: z
        });
      }
    }
    if (a.hooks) {
      let j = Array.isArray(a.hooks) ? a.hooks : [a.hooks];
      for (let z of j) {
        if (typeof z === "string") {
          let V = resolveContainedPluginPath(e, z);
          if (V === null) {
            logForDebugging(`Hooks file ${z} specified in manifest but escapes plugin directory for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-traversal",
              source: t,
              plugin: a.name,
              path: z,
              component: "hooks"
            });
            continue;
          }
          if (!(await ad(V))) {
            logForDebugging(`Hooks file ${z} specified in manifest but not found at ${V} for ${a.name}`, {
              level: "error"
            });
            s.push({
              type: "path-not-found",
              source: t,
              plugin: a.name,
              path: V,
              component: "hooks"
            });
            continue;
          }
          let K;
          try {
            K = await wd.realpath(V);
          } catch {
            K = V;
          }
          if (H.vZc(K)) {
            if (logForDebugging(`Skipping duplicate hooks file for plugin ${a.name}: ${z} (resolves to already-loaded file: ${K})`), o) {
              let J = `Duplicate hooks file detected: ${z} resolves to already-loaded file ${K}. The standard hooks/hooks.json is loaded automatically, so manifest.hooks should only reference additional hook files.`;
              logForDebugging(J, {
                level: "error"
              });
              s.push({
                type: "hook-load-failed",
                source: t,
                plugin: a.name,
                hookPath: V,
                reason: J
              });
            }
            continue;
          }
          try {
            let J = await l2l(V, a.name);
            try {
              F = p2l(F, J);
              H.add(K);
              logForDebugging(`Read manifest hooks for plugin ${a.name} (enabled=${n}${n ? "" : "; will NOT register, plugin is disabled"}): ${z}`);
            } catch (Q) {
              let Z = he(Q);
              logForDebugging(`Failed to merge hooks from ${z} for ${a.name}: ${Z}`, {
                level: "error"
              });
              Oe(sr(Q));
              s.push({
                type: "hook-load-failed",
                source: t,
                plugin: a.name,
                hookPath: V,
                reason: `Failed to merge: ${Z}`
              });
            }
          } catch (J) {
            let Q = he(J);
            logForDebugging(`Failed to load hooks from ${z} for ${a.name}: ${Q}`, {
              level: "error"
            });
            s.push({
              type: "hook-load-failed",
              source: t,
              plugin: a.name,
              hookPath: V,
              reason: Q
            });
          }
        } else if (typeof z === "object") {
          let {
            hooks: V,
            invalid: K
          } = M1r(z);
          if (s.push(...w2l(K, t, a.name, l ?? e)), V) {
            F = p2l(F, V);
          }
        }
      }
    }
    if (F) {
      u.hooksConfig = F;
    }
    let N = await c2m(e, a, t, s);
    if (N) {
      u.monitors = N;
    }
    let W = await d2m(e, a);
    if (W) {
      u.settings = W;
    }
    return {
      plugin: u,
      errors: s,
      warnings: i,
      hasManifest: l !== null
    };
  }
  function u2l(e) {
    let t = u2m().safeParse(e);
    if (!t.success) {
      return;
    }
    let n = t.data;
    if (Object.keys(n).length === 0) {
      return;
    }
    return n;
  }
  async function d2m(e, t) {
    let n = vs.join(e, "settings.json");
    let r = false;
    try {
      let o = await wd.readFile(n, {
        encoding: "utf-8"
      });
      let s = qt(o);
      if (_2m(s)) {
        let i = u2l(s);
        if (i) {
          logForDebugging(`Loaded settings from settings.json for plugin ${t.name}`);
          Pe("plugin_load_settings");
          return i;
        }
      }
    } catch (o) {
      if (!Io(o)) {
        r = true;
        logForDebugging(`Failed to parse settings.json for plugin ${t.name}: ${o}`, {
          level: "warn"
        });
      }
    }
    if (t.settings) {
      let o = u2l(t.settings);
      if (o) {
        if (logForDebugging(`Loaded settings from manifest for plugin ${t.name}`), r) {
          Et("plugin_load_settings", "plugin_load_settings_parse_failed");
        } else {
          Pe("plugin_load_settings");
        }
        return o;
      }
    }
    if (r) {
      Et("plugin_load_settings", "plugin_load_settings_parse_failed");
    } else {
      Pe("plugin_load_settings");
    }
    return;
  }
  function d2l(e, t, n, r) {
    if (typeof e === "string" || Array.isArray(e)) {
      return {
        hooks: undefined,
        errors: [{
          type: "hook-load-failed",
          source: t,
          plugin: n,
          hookPath: r,
          reason: "hooks: the file-path and array forms are not yet supported in a marketplace entry. Define hooks in the plugin's own hooks/hooks.json (or its plugin.json), or inline them here as an object mapping hook event names to matcher arrays."
        }]
      };
    }
    let {
      hooks: o,
      invalid: s
    } = M1r(e);
    return {
      hooks: o,
      errors: w2l(s, t, n, r)
    };
  }
  function w2l(e, t, n, r) {
    return e.map(({
      path: o,
      reason: s
    }) => ({
      type: "hook-load-failed",
      source: t,
      plugin: n,
      hookPath: r,
      reason: `${o}: ${s}`
    }));
  }
  function p2l(e, t) {
    if (!e) {
      return t;
    }
    let n = {
      ...e
    };
    for (let [r, o] of Object.entries(t)) {
      if (!n[r]) {
        n[r] = o;
      } else {
        n[r] = [...(n[r] || []), ...o];
      }
    }
    return n;
  }
  async function $$o({
    cacheOnly: e,
    preview: t = false
  }) {
    let n = getInitialSettings();
    let r = {
      ...AGe(),
      ...(n.enabledPlugins || {})
    };
    let o = [];
    let s = [];
    let i = [];
    let a = Object.entries(r).filter(([S, E]) => {
      if (!Dye().safeParse(S).success || E === undefined) {
        return false;
      }
      let {
        marketplace: x
      } = Yo(S);
      return x !== "builtin" && !UI(x);
    });
    let l = await qM();
    let c = getStrictKnownMarketplaces();
    let u = getBlockedMarketplaces();
    let d = c !== null || u !== null && u.some(S => S.source !== "skills-dir");
    let p = new Set(a.map(([S]) => Yo(S).marketplace).filter(S => !!S));
    let m = new Map();
    await Promise.all([...p].map(async S => {
      m.set(S, await h5(S));
    }));
    let f = [];
    let h = new Set(a.map(([S]) => S));
    let g = new Map();
    let y = a.flatMap(([S, E]) => {
      let {
        name: C,
        marketplace: x
      } = Yo(S);
      let A = x ? m.get(x) : null;
      let k = x ? l[x] : undefined;
      if (!C || !x || !A?.renames || E === false || !k && d || k && !isSourceAllowedByPolicy(k.source)) {
        return [[S, E]];
      }
      let I = g.get(x);
      if (!I) {
        I = new Set(A.plugins.map(L => L.name));
        g.set(x, I);
      }
      if (I.vZc(C)) {
        return [[S, E]];
      }
      let O = ivt(C, A.renames, I);
      if (O === null) {
        return [[S, E]];
      }
      if (O.kind === "unresolved") {
        if (!t) {
          AFn(C, x, O);
        }
        logForDebugging(`Plugin "${S}" has a renames entry but it does not resolve (${O.reason}); falling through to plugin-not-found`, {
          level: "warn"
        });
        return [[S, E]];
      }
      let M = O.kind === "renamed" ? `${O.to}@${x}` : null;
      if (M !== null && !Dye().safeParse(M).success) {
        if (!t) {
          AFn(C, x, {
            kind: "unresolved",
            reason: "target-missing"
          });
        }
        logForDebugging(`Plugin "${S}" rename target "${M}" is not a valid PluginIdSchema id; falling through to plugin-not-found`, {
          level: "warn"
        });
        return [[S, E]];
      }
      if (!t) {
        AFn(C, x, O);
      }
      if (f.push({
        marketplace: x,
        oldName: C,
        oldId: S,
        newId: M,
        resolution: O
      }), i.push({
        type: "plugin-renamed",
        source: S,
        plugin: C,
        marketplace: x,
        renamedTo: O.kind === "renamed" ? O.to : null
      }), M === null || h.vZc(M)) {
        return [];
      }
      h.add(M);
      return [[M, E]];
    });
    if (!t && f.length > 0) {
      try {
        $Bl(f.flatMap(S => S.newId === null ? [] : [{
          oldId: S.oldId,
          newId: S.newId
        }]));
      } catch (S) {
        logForDebugging(`renamePluginInstallations failed: ${sr(S).message}`, {
          level: "warn"
        });
      }
    }
    let _ = jXt();
    let b = await Promise.allSettled(y.map(async ([S, E]) => {
      let {
        name: C,
        marketplace: x
      } = Yo(S);
      let A = l[x];
      if (!A && d) {
        s.push({
          type: "marketplace-blocked-by-policy",
          source: S,
          plugin: C,
          marketplace: x,
          blockedByBlocklist: c === null,
          allowedSources: (c ?? []).map(L => wwe(L))
        });
        return null;
      }
      if (A && !isSourceAllowedByPolicy(A.source)) {
        let L = isSourceInBlocklist(A.source);
        let P = getStrictKnownMarketplaces() || [];
        s.push({
          type: "marketplace-blocked-by-policy",
          source: S,
          plugin: C,
          marketplace: x,
          blockedByBlocklist: L,
          allowedSources: L ? [] : P.map(F => wwe(F))
        });
        return null;
      }
      let k = null;
      let I = m.get(x);
      if (I && A) {
        let L = I.plugins.find(P => P.name === C);
        if (L) {
          k = {
            entry: L,
            marketplaceInstallLocation: A.installLocation
          };
        }
      } else {
        k = await E$o(S);
      }
      if (!k) {
        let L = !!_.plugins[S]?.length;
        if (!A) {
          if (L) {
            s.push({
              type: "marketplace-not-found",
              source: S,
              marketplace: x,
              availableMarketplaces: Object.keys(l)
            });
          } else {
            logForDebugging(`Skipping orphaned enabledPlugins entry ${S}: marketplace not registered`);
          }
        } else if (!I) {
          s.push({
            type: "marketplace-load-failed",
            source: S,
            marketplace: x,
            reason: "cache-miss"
          });
        } else if (L) {
          s.push({
            type: "plugin-not-found",
            source: S,
            pluginId: C,
            marketplace: x
          });
        } else {
          logForDebugging(`Skipping orphaned enabledPlugins entry ${S}: not in marketplace catalog`);
        }
        return null;
      }
      let O = await o2m(_.plugins[S]);
      if (typeof k.entry.source !== "string" && !O) {
        if (!(["userSettings", "flagSettings", "policySettings"].some(F => getSettingsForSource(F)?.enabledPlugins?.[S] === true) || !isLocalSettingsGitTracked() && getSettingsForSource("localSettings")?.enabledPlugins?.[S] === true)) {
          let F = await nie(S, k.entry.source, undefined, undefined, k.entry.version, "sha" in k.entry.source ? k.entry.source.sha : undefined);
          if (!((await qor(S, F)) ?? (F === "unknown" ? await probeSeedCacheAnyVersion(S) : null))) {
            s.push({
              type: "plugin-not-installed",
              source: S,
              plugin: k.entry.name
            });
            return null;
          }
        }
      }
      let M = await (e ? p2m(k.entry, k.marketplaceInstallLocation, A?.source, S, E === true, s, i, O?.installPath) : m2m(k.entry, k.marketplaceInstallLocation, A?.source, S, E === true, s, i, O?.version));
      if (M && O?.resolvedVersion !== undefined) {
        M.resolvedVersion = O.resolvedVersion;
      }
      return M;
    }));
    for (let [S, E] of b.entries()) {
      if (E.status === "fulfilled" && E.value) {
        o.push(E.value);
      } else if (E.status === "rejected") {
        let C = sr(E.reason);
        let x = y[S][0];
        logForDebugging(`Failed to load plugin ${x}: ${C.message}`, {
          level: "error"
        });
        s.push({
          type: "generic-error",
          source: x,
          plugin: ii(x, "@"),
          error: C.message
        });
      }
    }
    if (!t) {
      s2l(f);
    }
    return {
      plugins: o,
      errors: s,
      warnings: i
    };
  }
  async function p2m(e, t, n, r, o, s, i, a) {
    let l;
    if (typeof e.source === "string") {
      let c = n && q6(n);
      if (!c && a && (a.endsWith(".zip") ? await ad(a) : await cacheDirHasPluginContent(a))) {
        l = a;
      } else if (!c) {
        if (o) {
          s.push({
            type: "plugin-cache-miss",
            source: r,
            plugin: e.name,
            installPath: a ?? t
          });
        }
        return null;
      } else {
        let u;
        try {
          u = (await wd.stat(t)).isDirectory() ? t : vs.join(t, "..");
        } catch {
          s.push({
            type: "generic-error",
            source: r,
            error: `Marketplace directory not found at path: ${t}`
          });
          return null;
        }
        if (l = vs.join(u, e.source), !(await ad(l))) {
          s.push({
            type: "generic-error",
            source: r,
            error: `Plugin directory not found at path: ${l}. Check that the marketplace entry has the correct path.`
          });
          return null;
        }
      }
    } else if (a && (a.endsWith(".zip") ? await ad(a) : await cacheDirHasPluginContent(a))) {
      l = a;
    } else if (!a) {
      let u = ["userSettings", "flagSettings", "policySettings"].some(m => getSettingsForSource(m)?.enabledPlugins?.[r] === true) || !isLocalSettingsGitTracked() && getSettingsForSource("localSettings")?.enabledPlugins?.[r] === true;
      let d = await nie(r, e.source, undefined, undefined, e.version, "sha" in e.source ? e.source.sha : undefined);
      let p;
      if (u) {
        let m = getVersionedZipCachePath(r, d);
        let f = getVersionedCachePath(r, d);
        if (iK() && (await ad(m))) {
          p = m;
        } else if (await cacheDirHasPluginContent(f)) {
          await B$o(f);
          p = f;
        }
      }
      if (!p) {
        p = (await qor(r, d)) ?? (d === "unknown" ? await probeSeedCacheAnyVersion(r) : null) ?? undefined;
      }
      if (p) {
        l = p;
      } else if (u) {
        s.push({
          type: "plugin-cache-miss",
          source: r,
          plugin: e.name,
          installPath: "(not recorded)"
        });
        return null;
      } else {
        s.push({
          type: "plugin-not-installed",
          source: r,
          plugin: e.name
        });
        return null;
      }
    } else {
      if (o) {
        s.push({
          type: "plugin-cache-miss",
          source: r,
          plugin: e.name,
          installPath: a
        });
      }
      return null;
    }
    if (iK() && l.endsWith(".zip")) {
      let c = await MXt();
      let u = vs.join(c, r.replace(/[^a-zA-Z0-9@\-_]/g, "-"));
      try {
        await IFe(l, u);
        l = u;
      } catch (d) {
        logForDebugging(`Failed to extract plugin ZIP ${l}: ${d}`, {
          level: "error"
        });
        s.push({
          type: "plugin-cache-miss",
          source: r,
          plugin: e.name,
          installPath: l
        });
        return null;
      }
    }
    return C2l(e, r, o, s, i, l);
  }
  async function m2m(e, t, n, r, o, s, i, a) {
    logForDebugging(`Loading plugin ${e.name} from source: ${De(e.source)}`);
    let l;
    if (typeof e.source === "string") {
      let c = (await wd.stat(t)).isDirectory() ? t : vs.join(t, "..");
      let u = vs.join(c, e.source);
      if (!(await ad(u))) {
        logForDebugging(`Plugin path not found: ${u}`, {
          level: "error"
        });
        s.push({
          type: "generic-error",
          source: r,
          error: `Plugin directory not found at path: ${u}. Check that the marketplace entry has the correct path.`
        });
        return null;
      }
      if (n && q6(n)) {
        l = u;
      } else {
        try {
          let d;
          try {
            d = (await loadPluginManifest(u, e.name, e.source)).manifest;
          } catch {}
          let p = await nie(r, e.source, d, c, e.version);
          l = await copyPluginToVersionedCache(u, r, p, e, c);
          logForDebugging(`Copied plugin ${e.name} to versioned cache: ${l}`);
        } catch (d) {
          let p = he(d);
          logForDebugging(`Failed to copy plugin ${e.name} to versioned cache: ${p}. Using marketplace path.`, {
            level: "warn"
          });
          l = u;
        }
      }
    } else {
      try {
        let c = await nie(r, e.source, undefined, undefined, a ?? e.version, "sha" in e.source ? e.source.sha : undefined);
        let u = getVersionedCachePath(r, c);
        let d = getVersionedZipCachePath(r, c);
        if (iK() && (await ad(d))) {
          logForDebugging(`Using versioned cached plugin ZIP ${e.name} from ${d}`);
          l = d;
        } else if (await cacheDirHasPluginContent(u)) {
          await B$o(u);
          logForDebugging(`Using versioned cached plugin ${e.name} from ${u}`);
          l = u;
        } else {
          let p = (await qor(r, c)) ?? (c === "unknown" ? await probeSeedCacheAnyVersion(r) : null);
          if (p) {
            l = p;
            logForDebugging(`Using seed cache for external plugin ${e.name} at ${p}`);
          } else {
            let m = await cachePlugin(e.source, {
              manifest: {
                name: e.name
              }
            });
            let f = c !== "unknown" ? c : await nie(r, e.source, m.manifest, m.path, a ?? e.version, m.gitCommitSha);
            if (l = await copyPluginToVersionedCache(m.path, r, f, e, undefined), m.path !== l && !vs.resolve(l).startsWith(vs.resolve(m.path) + vs.sep)) {
              await wd.rm(m.path, {
                recursive: true,
                force: true
              });
            }
          }
        }
      } catch (c) {
        let u = he(c);
        logForDebugging(`Failed to cache plugin ${e.name}: ${u}`, {
          level: "error"
        });
        s.push({
          type: "generic-error",
          source: r,
          error: `Failed to download/cache plugin ${e.name}: ${u}`
        });
        return null;
      }
    }
    if (iK() && l.endsWith(".zip")) {
      let c = await MXt();
      let u = vs.join(c, r.replace(/[^a-zA-Z0-9@\-_]/g, "-"));
      try {
        await IFe(l, u);
        logForDebugging(`Extracted plugin ZIP to session dir: ${u}`);
        l = u;
      } catch (d) {
        throw logForDebugging(`Failed to extract plugin ZIP ${l}, deleting corrupt file: ${d}`), await wd.rm(l, {
          force: true
        }).catch(() => {}), d;
      }
    }
    return C2l(e, r, o, s, i, l);
  }
  async function C2l(e, t, n, r, o, s) {
    let i = [];
    let {
      plugin: a,
      errors: l,
      warnings: c,
      hasManifest: u
    } = await createPluginFromPath(s, t, n, e.name, e.strict ?? true);
    if (i.push(...l), typeof e.source === "object" && "sha" in e.source && e.source.sha) {
      a.sha = e.source.sha;
    }
    if (typeof e.source === "string" && e.source.split(/[\\/]/).every(p => p === "" || p === ".") && e.skills !== undefined) {
      let p = Array.isArray(e.skills) ? e.skills : [e.skills];
      if (p.length > 0) {
        let m = await y5(p, s, e.name, t, "skills", "Skill", "declared in marketplace entry but", [], true);
        if (m.length > 0) {
          let f = vs.join(s, "skills");
          let h = vs.resolve(f);
          let g = vs.resolve(s);
          let y = m.some(b => {
            let S = vs.resolve(b);
            return S === h || S === g;
          });
          a.skillsPath = y ? a.skillsPath : undefined;
          let _ = m.filter(b => {
            let S = vs.resolve(b);
            return S !== h && S !== g;
          });
          a.skillsPaths = _.length > 0 ? _ : undefined;
        }
      }
    }
    if (!u) {
      let p = IGe(e, "marketplace-entry", {
        pluginName: e.name,
        manifestPath: t
      });
      if (p.ok) {
        a.manifest = p.manifest;
      } else {
        logForDebugging(`marketplace entry ${e.name}: canonicalizeManifest rejected an entry that PluginMarketplaceEntrySchema accepted \u2014 falling back to legacy cast. ${p.error}`, {
          level: "warn"
        });
        a.manifest = {
          ...e,
          id: undefined,
          source: undefined,
          strict: undefined
        };
      }
      if (a.name = a.manifest.name, e.commands) {
        let f = Object.values(e.commands)[0];
        if (typeof e.commands === "object" && !Array.isArray(e.commands) && f && typeof f === "object" && ("source" in f || "content" in f)) {
          let h = {};
          let g = [];
          let y = Object.entries(e.commands);
          let _ = await Promise.all(y.map(async ([b, S]) => {
            if (!S || typeof S !== "object" || !S.source) {
              return {
                commandName: b,
                metadata: S,
                skip: true
              };
            }
            let E = vs.join(s, S.source);
            return {
              commandName: b,
              metadata: S,
              skip: false,
              fullPath: E,
              exists: await ad(E)
            };
          }));
          for (let b of _) {
            if (b.skip) {
              continue;
            }
            if (b.exists) {
              g.push(b.fullPath);
              h[b.commandName] = b.metadata;
            } else {
              logForDebugging(`Command ${b.commandName} path ${b.metadata.source} from marketplace entry not found at ${b.fullPath} for ${e.name}`, {
                level: "error"
              });
              i.push({
                type: "path-not-found",
                source: t,
                plugin: e.name,
                path: b.fullPath,
                component: "commands"
              });
            }
          }
          if (g.length > 0) {
            a.commandsPaths = g;
            a.commandsMetadata = h;
          }
        } else {
          let h = Array.isArray(e.commands) ? e.commands : [e.commands];
          let g = await Promise.all(h.map(async _ => {
            if (typeof _ !== "string") {
              return {
                cmdPath: _,
                kind: "invalid"
              };
            }
            let b = vs.join(s, _);
            return {
              cmdPath: _,
              kind: "path",
              fullPath: b,
              exists: await ad(b)
            };
          }));
          let y = [];
          for (let _ of g) {
            if (_.kind === "invalid") {
              logForDebugging(`Unexpected command format in marketplace entry for ${e.name}`, {
                level: "error"
              });
              continue;
            }
            if (_.exists) {
              y.push(_.fullPath);
            } else {
              logForDebugging(`Command path ${_.cmdPath} from marketplace entry not found at ${_.fullPath} for ${e.name}`, {
                level: "error"
              });
              i.push({
                type: "path-not-found",
                source: t,
                plugin: e.name,
                path: _.fullPath,
                component: "commands"
              });
            }
          }
          if (y.length > 0) {
            a.commandsPaths = y;
          }
        }
      }
      if (e.agents) {
        let f = Array.isArray(e.agents) ? e.agents : [e.agents];
        let h = await y5(f, s, e.name, t, "agents", "Agent", "from marketplace entry", i);
        if (h.length > 0) {
          a.agentsPaths = h;
        }
      }
      if (e.skills) {
        logForDebugging(`Processing ${Array.isArray(e.skills) ? e.skills.length : 1} skill paths for plugin ${e.name}`);
        let f = Array.isArray(e.skills) ? e.skills : [e.skills];
        let h = vs.resolve(vs.join(s, "skills"));
        let g = (await y5(f, s, e.name, t, "skills", "Skill", "from marketplace entry", i, true)).filter(y => vs.resolve(y) !== h);
        if (logForDebugging(`Found ${g.length} valid skill paths for plugin ${e.name}, setting skillsPaths`), g.length > 0) {
          a.skillsPaths = g;
        }
      } else {
        logForDebugging(`Plugin ${e.name} has no entry.skills defined`);
      }
      if (e.outputStyles) {
        let f = Array.isArray(e.outputStyles) ? e.outputStyles : [e.outputStyles];
        let h = await y5(f, s, e.name, t, "output-styles", "Output style", "from marketplace entry", i);
        if (h.length > 0) {
          a.outputStylesPaths = h;
        }
      }
      let m = e.experimental?.themes ?? e.themes;
      if (m) {
        let f = Array.isArray(m) ? m : [m];
        let h = await y5(f, s, e.name, t, "themes", "Theme", "from marketplace entry", i);
        if (h.length > 0) {
          a.themesPaths = h;
        }
      }
      if (e.hooks) {
        let {
          hooks: f,
          errors: h
        } = d2l(e.hooks, t, e.name, s);
        if (f) {
          a.hooksConfig = f;
        }
        i.push(...h);
      }
    } else if (!e.strict && u && (e.commands || e.agents || e.skills || e.hooks || e.outputStyles || e.themes || e.experimental?.themes || false)) {
      logForDebugging(`Plugin ${e.name} has both plugin.json and marketplace manifest entries for commands/agents/skills/hooks/outputStyles/themes/syntaxHighlighting. This is a conflict.`, {
        level: "error"
      });
      r.push({
        type: "generic-error",
        source: t,
        error: `Plugin ${e.name} has conflicting manifests: both plugin.json and marketplace entry specify components. Set strict: true in marketplace entry or remove component specs from one location.`
      });
      return null;
    } else if (u) {
      if (e.commands) {
        let m = Object.values(e.commands)[0];
        if (typeof e.commands === "object" && !Array.isArray(e.commands) && m && typeof m === "object" && ("source" in m || "content" in m)) {
          let f = {
            ...(a.commandsMetadata || {})
          };
          let h = [];
          let g = Object.entries(e.commands);
          let y = await Promise.all(g.map(async ([_, b]) => {
            if (!b || typeof b !== "object" || !b.source) {
              return {
                commandName: _,
                metadata: b,
                skip: true
              };
            }
            let S = vs.join(s, b.source);
            return {
              commandName: _,
              metadata: b,
              skip: false,
              fullPath: S,
              exists: await ad(S)
            };
          }));
          for (let _ of y) {
            if (_.skip) {
              continue;
            }
            if (_.exists) {
              h.push(_.fullPath);
              f[_.commandName] = _.metadata;
            } else {
              logForDebugging(`Command ${_.commandName} path ${_.metadata.source} from marketplace entry not found at ${_.fullPath} for ${e.name}`, {
                level: "error"
              });
              i.push({
                type: "path-not-found",
                source: t,
                plugin: e.name,
                path: _.fullPath,
                component: "commands"
              });
            }
          }
          if (h.length > 0) {
            a.commandsPaths = [...(a.commandsPaths || []), ...h];
            a.commandsMetadata = f;
          }
        } else {
          let f = Array.isArray(e.commands) ? e.commands : [e.commands];
          let h = await Promise.all(f.map(async y => {
            if (typeof y !== "string") {
              return {
                cmdPath: y,
                kind: "invalid"
              };
            }
            let _ = vs.join(s, y);
            return {
              cmdPath: y,
              kind: "path",
              fullPath: _,
              exists: await ad(_)
            };
          }));
          let g = [];
          for (let y of h) {
            if (y.kind === "invalid") {
              logForDebugging(`Unexpected command format in marketplace entry for ${e.name}`, {
                level: "error"
              });
              continue;
            }
            if (y.exists) {
              g.push(y.fullPath);
            } else {
              logForDebugging(`Command path ${y.cmdPath} from marketplace entry not found at ${y.fullPath} for ${e.name}`, {
                level: "error"
              });
              i.push({
                type: "path-not-found",
                source: t,
                plugin: e.name,
                path: y.fullPath,
                component: "commands"
              });
            }
          }
          if (g.length > 0) {
            a.commandsPaths = [...(a.commandsPaths || []), ...g];
          }
        }
      }
      if (e.agents) {
        let m = Array.isArray(e.agents) ? e.agents : [e.agents];
        let f = await y5(m, s, e.name, t, "agents", "Agent", "from marketplace entry", i);
        if (f.length > 0) {
          a.agentsPaths = [...(a.agentsPaths || []), ...f];
        }
      }
      if (e.skills) {
        let m = Array.isArray(e.skills) ? e.skills : [e.skills];
        let f = vs.resolve(vs.join(s, "skills"));
        let h = (await y5(m, s, e.name, t, "skills", "Skill", "from marketplace entry", i, true)).filter(g => vs.resolve(g) !== f);
        if (h.length > 0) {
          let g = new Set((a.skillsPaths || []).map(_ => vs.resolve(_)));
          let y = h.filter(_ => !g.vZc(vs.resolve(_)));
          if (y.length > 0) {
            a.skillsPaths = [...(a.skillsPaths || []), ...y];
          }
        }
      }
      if (e.outputStyles) {
        let m = Array.isArray(e.outputStyles) ? e.outputStyles : [e.outputStyles];
        let f = await y5(m, s, e.name, t, "output-styles", "Output style", "from marketplace entry", i);
        if (f.length > 0) {
          a.outputStylesPaths = [...(a.outputStylesPaths || []), ...f];
        }
      }
      let p = e.experimental?.themes ?? e.themes;
      if (p) {
        let m = Array.isArray(p) ? p : [p];
        let f = await y5(m, s, e.name, t, "themes", "Theme", "from marketplace entry", i);
        if (f.length > 0) {
          a.themesPaths = [...(a.themesPaths || []), ...f];
        }
      }
      if (e.hooks) {
        let {
          hooks: m,
          errors: f
        } = d2l(e.hooks, t, e.name, s);
        if (m) {
          a.hooksConfig = {
            ...(a.hooksConfig || {}),
            ...m
          };
        }
        i.push(...f);
      }
    }
    if (n) {
      r.push(...i);
      o.push(...c);
    }
    return a;
  }
  async function resolvePluginRoot(e) {
    let t = (await wd.readdir(e, {
      withFileTypes: true
    })).filter(n => n.name !== "__MACOSX" && n.name !== ".DS_Store");
    if (t.some(n => n.name === ".claude-plugin")) {
      return e;
    }
    if (t.length === 1 && t[0].isDirectory() && (await ad(vs.join(e, t[0].name, ".claude-plugin")))) {
      return vs.join(e, t[0].name);
    }
    return e;
  }
  async function h2m(e) {
    if (e.length === 0) {
      return {
        plugins: [],
        errors: [],
        warnings: []
      };
    }
    let t = new Map(Object.entries(getInitialSettings().enabledPlugins ?? {}).map(([i, a]) => [i.toLowerCase(), a]));
    let n = await Promise.all(e.map(async (i, a) => {
      try {
        let l;
        if (i.kind === "url") {
          let h = await MXt();
          let g = new URL(i.value);
          let y = g.origin + g.pathname;
          let _ = vs.basename(g.pathname).replace(/\.zip$/i, "") || "download";
          l = vs.join(h, `url-${a}-${_.replace(/[^a-zA-Z0-9\-_]/g, "-")}.zip`);
          try {
            let b = await fetch(i.value, {
              ...getProxyFetchOptions({
                url: i.value
              }),
              signal: AbortSignal.timeout(30000)
            });
            if (!b.ok || !b.body) {
              throw Error(`HTTP ${b.status} ${b.statusText} from ${y}`);
            }
            let S = Number(b.headers.get("content-length"));
            if (S > 268435456) {
              throw Error(`Plugin archive too large (${S} bytes, max ${268435456}) from ${y}`);
            }
            let E = 0;
            let C = f2l.Readable.fromWeb(b.body);
            C.on("data", A => {
              if (E += A.byteLength, E > 268435456) {
                C.destroy(Error(`Plugin archive exceeded ${268435456} bytes from ${y}`));
              }
            });
            let x = `${l}.part`;
            await h2l.pipeline(C, m2l.createWriteStream(x));
            await wd.rename(x, l);
            logForDebugging(`Downloaded inline plugin from ${y}`);
          } catch (b) {
            if (!(await ad(l))) {
              throw b;
            }
            logForDebugging(`Re-fetch of inline plugin from ${y} failed; reusing cached ${l}`, {
              level: "warn"
            });
          }
        } else {
          l = vs.resolve(i.value);
          let h;
          try {
            await wd.stat(l);
          } catch (y) {
            h = en(y) ?? "UNKNOWN";
          }
          let g = h;
          if (h !== undefined && h !== "ENOENT" && l.startsWith("/mnt/")) {
            await sleep(250);
            try {
              await wd.stat(l);
              logForDebugging(`Plugin path ${l}: first stat failed with ${h}, retry succeeded (transient mount race)`, {
                level: "warn"
              });
              h = undefined;
            } catch (y) {
              h = en(y) ?? "UNKNOWN";
            }
          }
          if (h !== undefined) {
            let y = h !== "ENOENT" ? h : g !== "ENOENT" ? g : undefined;
            logForDebugging(`Plugin path does not exist: ${l} (${h}${y && y !== h ? `, first ${y}` : ""}), skipping`, {
              level: "warn"
            });
            return {
              plugin: undefined,
              errors: [{
                type: "path-not-found",
                source: `inline[${a}]`,
                path: l,
                component: "commands",
                ...(y && {
                  errno: y
                })
              }],
              warnings: []
            };
          }
        }
        let c = l.toLowerCase().endsWith(".zip");
        let u = c ? vs.basename(l).replace(/\.zip$/i, "") : vs.basename(l);
        if (c) {
          let h = await MXt();
          let g = vs.join(h, `inline-${a}-${u.replace(/[^a-zA-Z0-9\-_]/g, "-")}`);
          if (await wd.rm(g, {
            recursive: true,
            force: true
          }), await IFe(l, g), logForDebugging(`Extracted inline plugin zip to ${g}`), l = await resolvePluginRoot(g), l !== g) {
            logForDebugging(`Inline plugin zip had wrapper directory; using ${l}`);
          }
        }
        let {
          plugin: d,
          errors: p,
          warnings: m
        } = await createPluginFromPath(l, `${u}@${"inline"}`, true, u);
        d.source = `${d.name}@${"inline"}`;
        d.repository = `${d.name}@${"inline"}`;
        let f = t.get(d.source.toLowerCase());
        if (d.enabled = f !== undefined ? f !== false : d.manifest.defaultEnabled !== false, i.kind === "path" && i.skipMcpDiscovery) {
          d.skipMcpDiscovery = true;
          d.mcpServers = {};
        }
        logForDebugging(`Loaded inline plugin from path: ${d.name}`);
        return {
          plugin: d,
          errors: p,
          warnings: m
        };
      } catch (l) {
        let c = d => d.replace(/\?[^\s"']*/g, "");
        let u = c(he(l));
        logForDebugging(`Failed to load session plugin from ${i.kind === "url" ? c(i.value) : i.value}: ${u}`, {
          level: "warn"
        });
        return {
          plugin: undefined,
          errors: [{
            type: "generic-error",
            source: `inline[${a}]`,
            error: `Failed to load plugin: ${u}`
          }],
          warnings: []
        };
      }
    }));
    let r = n.flatMap(i => i.plugin ? [i.plugin] : []);
    let o = n.flatMap(i => i.errors);
    let s = n.flatMap(i => i.warnings);
    if (r.length > 0) {
      logForDebugging(`Loaded ${r.length} session-only plugins from --plugin-dir`);
    }
    return {
      plugins: r,
      errors: o,
      warnings: s
    };
  }
  async function loadSkillsAsPlugins() {
    let e = await HWa();
    let t = [];
    let n = e.filter(u => {
      if (u.scope === "project" && !vor()) {
        t.push(u);
        return false;
      }
      return true;
    });
    let r = await uV(n, async ({
      dir: u,
      scope: d
    }) => {
      await new Promise(m => setImmediate(m));
      let p = vs.basename(u);
      try {
        let m = new Set(await wd.readdir(u).catch(() => []));
        if (!m.vZc(".claude-plugin")) {
          return null;
        }
        let {
          plugin: f,
          errors: h,
          warnings: g,
          hasManifest: y
        } = await createPluginFromPath(u, `${p}@${"skills-dir"}`, true, p, false);
        if (!$Wa(f, y)) {
          return h.length || g.length ? {
            plugin: null,
            errors: h,
            warnings: g
          } : null;
        }
        if (f.source = `${f.name}@${"skills-dir"}`, f.repository = f.source, f.scope = d, d === "project") {
          let _ = (f.monitors ?? []).map((b, S) => b.name ?? `#${S + 1}`);
          if (_.length > 0) {
            g.push({
              type: "project-scope-server-stripped",
              source: f.source,
              plugin: f.name,
              monitors: _,
              warning: `${un(_.length, "monitor")} (${_.join(", ")}) from project-scope plugin "${f.name}" ${un(_.length, "was", "were")} not armed \u2014 project-supplied monitors have no per-item approval flow.`
            });
          }
          f.monitors = [];
        }
        return {
          plugin: f,
          errors: h,
          warnings: g
        };
      } catch (m) {
        return {
          plugin: null,
          errors: [{
            type: "generic-error",
            source: `${p}@${"skills-dir"}`,
            error: `Failed to load skill folder as plugin: ${he(m)}`
          }],
          warnings: []
        };
      }
    }, {
      concurrency: 32
    });
    let o = [];
    let s = [];
    let i = new Map();
    for (let u of r) {
      if (!u) {
        continue;
      }
      if (!u.plugin) {
        o.push(...u.errors);
        s.push(...u.warnings);
        continue;
      }
      let d = i.get(u.plugin.name);
      if (d) {
        let p = d.scope !== u.plugin.scope;
        o.push({
          type: "generic-error",
          orphan: true,
          source: `${vs.basename(u.plugin.path)}@${"skills-dir"}`,
          error: p ? `Not loaded \u2014 your ${displaySkillsDirPath(d)} (same plugin name "${u.plugin.name}") shadowed the project's ${displaySkillsDirPath(u.plugin)}. To use the project's copy here, rename or move yours.` : `Not loaded \u2014 same plugin name "${u.plugin.name}" as ${displaySkillsDirPath(d)} (which loaded instead). Delete ${displaySkillsDirPath(u.plugin)}, or give it a different "name" in its plugin.json.`
        });
        continue;
      }
      o.push(...u.errors);
      s.push(...u.warnings);
      i.set(u.plugin.name, u.plugin);
    }
    let a = [...i.values()];
    let l = getInitialSettings().enabledPlugins ?? {};
    for (let u of a) {
      let d = l[u.source];
      u.enabled = d !== undefined ? d !== false : u.manifest.defaultEnabled !== false;
    }
    let c = (await uV(t, async u => {
      try {
        await wd.readdir(vs.join(u.dir, ".claude-plugin"));
        return u;
      } catch {
        return null;
      }
    }, {
      concurrency: 32
    })).filter(u => u !== null);
    if (c.length > 0) {
      let u = c.length;
      s.push({
        type: "project-scope-suppressed-untrusted",
        source: `(suppressed)@${"skills-dir"}`,
        count: u,
        warning: `${u} project-scope plugin ${u === 1 ? "directory" : "directories"} under ./.claude/skills/ ${u === 1 ? "was" : "were"} not loaded because this workspace was not trusted when plugins were scanned. After accepting the trust dialog, run /reload-plugins (or relaunch) to load ${u === 1 ? "it" : "them"}.`
      });
    }
    if (logEvent("tengu_plugin_skills_dir_loaded", {
      count: a.length,
      user_count: Bn(a, u => u.scope === "user"),
      project_count: Bn(a, u => u.scope === "project"),
      project_suppressed_count: c.length,
      error_count: o.length
    }), a.length > 0) {
      logForDebugging(`Loaded ${a.length} skills-as-plugins`);
    }
    return {
      plugins: a,
      errors: o,
      warnings: s
    };
  }
  function mergePluginSources(e) {
    let t = [];
    let n = e.managedNames;
    let r = e.session.filter(a => {
      if (n?.vZc(a.name)) {
        logForDebugging(`Plugin "${a.name}" from --plugin-dir is blocked by managed settings`, {
          level: "warn"
        });
        t.push({
          type: "generic-error",
          source: a.source,
          plugin: a.name,
          error: `--plugin-dir copy of "${a.name}" ignored: plugin is locked by managed settings`
        });
        return false;
      }
      return true;
    });
    let o = new Set(r.filter(a => a.enabled !== false).map(a => a.name));
    let s = e.marketplace.filter(a => {
      if (o.vZc(a.name)) {
        logForDebugging(`Plugin "${a.name}" from --plugin-dir overrides installed version`);
        return false;
      }
      return true;
    });
    let i = [];
    if (e.skill?.length) {
      let a = new Map();
      for (let l of s) {
        a.set(l.name, `an installed plugin (${l.source})`);
      }
      for (let l of o) {
        a.set(l, "a session-only plugin (--plugin-dir / --plugin-url)");
      }
      i = e.skill.filter(l => {
        let c = n?.vZc(l.name) ? "managed settings" : a.get(l.name);
        if (!c) {
          return true;
        }
        t.push({
          type: "generic-error",
          orphan: true,
          source: `${vs.basename(l.path)}@${"skills-dir"}`,
          error: `Not loaded \u2014 the name "${l.name}" is already taken by ${c}, which takes precedence. Give the plugin at ${displaySkillsDirPath(l)} a different "name" (in plugin.json or SKILL.md frontmatter) to load this copy.`
        });
        return false;
      });
    }
    return {
      plugins: [...r, ...s, ...i, ...e.builtin],
      errors: t
    };
  }
  async function loadAllPluginsForPreview() {
    return H$o(() => $$o({
      cacheOnly: true,
      preview: true
    }), {
      preview: true
    });
  }
  async function getEnabledPluginBinPaths() {
    let {
      enabled: e
    } = await loadAllPluginsCacheOnly();
    return e.filter(t => !t.isBuiltin && t.path).map(t => vs.join(t.path, "bin")).filter(t => {
      if (vs.sep !== "\\" && /[:"'$`\\\n\r]/.test(t)) {
        logForDebugging(`Dropping plugin bin path with shell metacharacters: ${t}`);
        return false;
      }
      return true;
    });
  }
  async function H$o(e, t) {
    let n = getOriginalCwd();
    let r = areSideloadFlagsDisabledByPolicy();
    if (r && (getInlinePlugins().length > 0 || getInlinePluginsNoMcp().length > 0 || getInlinePluginUrls().length > 0)) {
      logForDebugging(`disableSideloadFlags: dropping @inline plugin specs at load time (parse-site gate should have caught this earlier): ${sideloadFlagsBlockedMessage(["--plugin-dir", "--plugin-url"])}`, {
        level: "warn"
      });
    }
    let s = [...(r ? [] : [...getInlinePlugins().map(_ => ({
      kind: "path",
      value: _
    })), ...getInlinePluginsNoMcp().map(_ => ({
      kind: "path",
      value: _,
      skipMcpDiscovery: true
    })), ...getInlinePluginUrls().map(_ => ({
      kind: "url",
      value: _
    }))]), ...getSyncedPluginDirs().map(_ => ({
      kind: "path",
      value: _
    }))];
    let i = {
      plugins: [],
      errors: [],
      warnings: []
    };
    let [a, l, c] = await Promise.all([e(), s.length > 0 ? h2m(s) : Promise.resolve(i), loadSkillsAsPlugins()]);
    let u = sso();
    let {
      plugins: d,
      errors: p
    } = mergePluginSources({
      session: l.plugins,
      marketplace: a.plugins,
      skill: c.plugins,
      builtin: [...u.enabled, ...u.disabled],
      managedNames: II()
    });
    let m = [...a.errors, ...l.errors, ...c.errors, ...p];
    let f = [...a.warnings, ...l.warnings, ...c.warnings];
    let {
      demoted: h,
      errors: g
    } = Eta(d);
    for (let _ of d) {
      if (h.vZc(_.source)) {
        _.enabled = false;
      }
    }
    m.push(...g);
    let y = d.filter(_ => _.enabled);
    if (logForDebugging(`Found ${d.length} plugins (${y.length} enabled, ${d.length - y.length} disabled)`), t?.preview) {
      ;
    } else if (n === getOriginalCwd()) {
      let _ = new Set(y.map(b => b.source));
      for (let b of bFn()) {
        if (_.vZc(b.pluginId)) {
          f.push({
            type: "ineffective-disable",
            source: b.pluginId,
            overriddenBy: b.overriddenBy
          });
        }
      }
      if (g2m(y), cachePluginSettings(y), m.length > 0 && d.length === 0) {
        Ae("plugin_load_all", "plugin_load_total_failure");
      } else if (m.length > 0) {
        Et("plugin_load_all", "plugin_load_partial_failures");
      } else {
        Pe("plugin_load_all");
      }
    } else {
      logForDebugging("assemblePluginLoadResult: originalCwd changed mid-scan; skipping side-effects (stale early-kick)");
    }
    return {
      enabled: y,
      disabled: d.filter(_ => !_.enabled),
      errors: m,
      warnings: f
    };
  }
  async function g2m(e) {
    let t = getPluginCachePath();
    let n = e.flatMap(r => {
      if (!r.path || r.path.endsWith(".zip")) {
        return [];
      }
      let o = vs.relative(t, r.path);
      if (!o || o.startsWith(`..${vs.sep}`) || o === ".." || vs.isAbsolute(o)) {
        return [];
      }
      return [r.path];
    });
    await Promise.all(n.map(r => rBl(r)));
    await oBl(n);
  }
  function clearPluginCache(e) {
    if (e) {
      logForDebugging(`clearPluginCache: invalidating loadAllPlugins cache (${e})`);
    }
    if (loadAllPlugins.cache?.clear?.(), loadAllPluginsCacheOnly.cache?.clear?.(), lln() !== undefined) {
      o_();
    }
    Ncs();
  }
  function y2m(e) {
    let t;
    for (let n of e) {
      if (!n.settings) {
        continue;
      }
      if (!t) {
        t = {};
      }
      for (let [r, o] of Object.entries(n.settings)) {
        if (r in t) {
          logForDebugging(`Plugin "${n.name}" overrides setting "${r}" (previously set by another plugin)`);
        }
        t[r] = o;
      }
    }
    return t;
  }
  function cachePluginSettings(e) {
    let t = y2m(e);
    if (Mcs(t), t && Object.keys(t).length > 0) {
      o_();
      logForDebugging(`Cached plugin settings with keys: ${Object.keys(t).join(", ")}`);
    }
  }
  function _2m(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  var m2l;
  var wd;
  var vs;
  var f2l;
  var h2l;
  var n2m;
  var u2m;
  var IMPLICIT_PLUGIN_LAYOUT_ENTRIES;
  var loadAllPlugins;
  var loadAllPluginsCacheOnly;
  var xg = __lazy(() => {
    Yjt();
    at();
    vut();
    DMt();
    ln();
    Ot();
    je();
    pr();
    dt();
    ji();
    Zl();
    na();
    fk();
    Rn();
    ku();
    Fh();
    aso();
    DA();
    Rj();
    Zn();
    Wk();
    IFn();
    PFn();
    MSe();
    iqt();
    LFn();
    MGe();
    Qk();
    c$o();
    H8();
    Cwe();
    yT();
    O$o();
    D$o();
    k1();
    Kf();
    rie();
    Xk();
    Bor();
    a2l();
    GXt();
    TC();
    FEo();
    U$o();
    b$o();
    PFe();
    m2l = require("fs");
    wd = require("fs/promises");
    vs = require("path");
    f2l = require("stream");
    h2l = require("stream/promises");
    n2m = new Set(["node_modules", ".orphaned_at", ".in_use"]);
    u2m = we(() => $N().pick(Object.fromEntries(i2l.map(e => [e, true]))).strip());
    IMPLICIT_PLUGIN_LAYOUT_ENTRIES = ["agents", "output-styles", "themes", "hooks", "monitors"];
    loadAllPlugins = TEr(async () => {
      let e = await H$o(() => $$o({
        cacheOnly: false
      }));
      loadAllPluginsCacheOnly.cache?.set(undefined, Promise.resolve(e));
      return e;
    });
    loadAllPluginsCacheOnly = TEr(async () => {
      if (Me.CLAUDE_CODE_SYNC_PLUGIN_INSTALL) {
        return loadAllPlugins();
      }
      return H$o(() => $$o({
        cacheOnly: true
      }));
    });
  });
  async function O2l(e, t, n, r, o, s) {
    let i = [];
    await ZEt(e, async (a, l) => {
      let c = await M2l(a, t, l, n, r, o, s);
      if (c) {
        i.push(c);
      }
    }, {
      logLabel: "agents"
    });
    return i;
  }
  async function M2l(e, t, n, r, o, s, i) {
    let a = zt();
    if (dte(a, e, i)) {
      return null;
    }
    try {
      let l = await $F(a, e, 1048576);
      if (l === null) {
        logForDebugging(`Skipping plugin agent ${e}: not a regular file or exceeds ${1048576} byte limit`, {
          level: "warn"
        });
        return null;
      }
      let {
        frontmatter: c,
        content: u
      } = sf(l, e, {
        normalizeKeys: true
      });
      let d = (c.name != null ? String(c.name) : undefined) || D2l.basename(e).replace(/\.md$/, "");
      let m = [t, ...n, d].join(":");
      let f = M2(c.description, m) ?? M2(c.when_to_use, m) ?? M2(c["when-to-use"], m) ?? `Agent from ${t} plugin`;
      let h = qFe(c.tools);
      let g = bQ(c.skills);
      let y = c.color;
      let _ = c.model;
      let b;
      if (typeof _ === "string" && _.trim().length > 0) {
        let H = _.trim();
        b = H.toLowerCase() === "inherit" ? "inherit" : H;
      }
      let S = c.background;
      let E = S === "true" || S === true ? true : undefined;
      let C = Ooe(u.trim(), {
        path: o,
        source: r
      });
      if (s.userConfig) {
        C = gWn(C, W1(r), s.userConfig);
      }
      let x = c.memory;
      let A;
      if (x !== undefined) {
        if (P2l.includes(x)) {
          A = x;
        } else {
          logForDebugging(`Plugin agent file ${e} has invalid memory value '${x}'. Valid options: ${P2l.join(", ")}`);
        }
      }
      let I = c.isolation === "worktree" ? "worktree" : undefined;
      let O = c.effort;
      let M = O !== undefined ? L2(O) : undefined;
      if (O !== undefined && M === undefined) {
        logForDebugging(`Plugin agent file ${e} has invalid effort '${O}'. Valid options: ${UC.join(", ")} or an integer`);
      }
      for (let H of ["permissionMode", "hooks", "mcpServers"]) {
        if (c[H] !== undefined) {
          logForDebugging(`Plugin agent file ${e} sets ${H}, which is ignored for plugin agents. Use .claude/agents/ for this level of control.`, {
            level: "warn"
          });
        }
      }
      let L = c.maxTurns;
      let P = bDn(L);
      if (L !== undefined && P === undefined) {
        logForDebugging(`Plugin agent file ${e} has invalid maxTurns '${L}'. Must be a positive integer.`);
      }
      let F = c.disallowedTools !== undefined ? qFe(c.disallowedTools) : undefined;
      if (Vd() && A && h !== undefined) {
        let H = new Set(h);
        for (let U of ["Write", "Edit", "Read"]) {
          if (!H.vZc(U)) {
            h = [...h, U];
          }
        }
      }
      return {
        agentType: m,
        whenToUse: f,
        tools: h,
        ...(F !== undefined && {
          disallowedTools: F
        }),
        ...(g !== undefined && {
          skills: g
        }),
        getSystemPrompt: () => {
          if (Vd() && A) {
            let H = $$t(m, A);
            return C + `

` + H;
          }
          return C;
        },
        source: "plugin",
        color: y,
        model: b,
        filename: d,
        filePath: e,
        plugin: r,
        ...(E && {
          background: E
        }),
        ...(A && {
          memory: A
        }),
        ...(I && {
          isolation: I
        }),
        ...(M !== undefined && {
          effort: M
        }),
        ...(P !== undefined && {
          maxTurns: P
        })
      };
    } catch (l) {
      logForDebugging(`Failed to load agent from ${e}: ${l}`, {
        level: "error"
      });
      return null;
    }
  }
  function Tor() {
    YXt.cache?.clear?.();
  }
  var D2l;
  var P2l;
  var YXt;
  var Eor = __lazy(() => {
    Eb();
    ln();
    Vbe();
    Ay();
    Tm();
    mx();
    cV();
    je();
    Fp();
    fv();
    n1();
    v9();
    xg();
    a9();
    hor();
    D2l = require("path");
    P2l = ["user", "project", "local"];
    YXt = TEr(async () => {
      let {
        enabled: e,
        errors: t
      } = await loadAllPluginsCacheOnly();
      if (t.length > 0) {
        logForDebugging(`Plugin loading errors: ${t.map(s => hS(s)).join(", ")}`);
      }
      let n = null;
      let o = (await Promise.all(e.map(async s => {
        let i = new Set();
        let a = [];
        if (s.agentsPath) {
          try {
            let l = await O2l(s.agentsPath, s.name, s.source, s.path, s.manifest, i);
            if (a.push(...l), l.length > 0) {
              logForDebugging(`Loaded ${l.length} agents from plugin ${s.name} default directory`);
            }
          } catch (l) {
            n = "plugin_load_agents_dir_failed";
            logForDebugging(`Failed to load agents from plugin ${s.name} default directory: ${l}`, {
              level: "error"
            });
          }
        }
        if (s.agentsPaths) {
          let l = await Promise.all(s.agentsPaths.map(async c => {
            try {
              let d = await zt().stat(c);
              if (d.isDirectory()) {
                let p = await O2l(c, s.name, s.source, s.path, s.manifest, i);
                if (p.length > 0) {
                  logForDebugging(`Loaded ${p.length} agents from plugin ${s.name} custom path: ${c}`);
                }
                return p;
              } else if (d.isFile() && c.endsWith(".md")) {
                let p = await M2l(c, s.name, [], s.source, s.path, s.manifest, i);
                if (p) {
                  logForDebugging(`Loaded agent from plugin ${s.name} custom file: ${c}`);
                  return [p];
                }
              }
              return [];
            } catch (u) {
              n = "plugin_load_agents_path_failed";
              logForDebugging(`Failed to load agents from plugin ${s.name} custom path ${c}: ${u}`, {
                level: "error"
              });
              return [];
            }
          }));
          for (let c of l) {
            a.push(...c);
          }
        }
        return a;
      }))).flat();
      if (logForDebugging(`Total plugin agents loaded: ${o.length}`), n) {
        Ae("plugin_load_agents", n);
      } else {
        Pe("plugin_load_agents");
      }
      return o;
    });
  });
  var _DS;
  var bDS;
  var N2l = __lazy(() => {
    vo();
    je();
    Vbe();
    _DS = we(() => v.object({
      updatedAt: v.string().min(1)
    }));
    bDS = we(() => v.object({
      syncedFrom: v.string().min(1)
    }));
  });
  function S2m() {
    let t = Rx() && Pu() ? `${"Read"}, \`find\`, and \`grep\`` : `${"Read"}, ${"Glob"}, and ${"Grep"}`;
    return `You are the Claude guide agent. Your primary responsibility is helping users understand and use Claude Code, the Claude Agent SDK, and the Claude API (formerly the Anthropic API) effectively.

**Your expertise spans three domains:**

1. **Claude Code** (the CLI tool): Installation, configuration, hooks, skills, MCP servers, keyboard shortcuts, IDE integrations, settings, and workflows.

2. **Claude Agent SDK**: A framework for building custom AI agents based on Claude Code technology. Available for Node.js/TypeScript and Python.

3. **Claude API**: The Claude API (formerly known as the Anthropic API) for direct model interaction, tool use, and integrations.

**Documentation sources:**

- **Claude Code docs** (${"https://code.claude.com/docs/en/claude_code_docs_map.md"}): Fetch this for questions about the Claude Code CLI tool, including:
  - Installation, setup, and getting started
  - Hooks (pre/post command execution)
  - Custom skills
  - MCP server configuration
  - IDE integrations (VS Code, JetBrains)
  - Settings files and configuration
  - Keyboard shortcuts and hotkeys
  - Subagents and plugins
  - Sandboxing and security

- **Claude Agent SDK docs** (${"https://platform.claude.com/llms.txt"}): Fetch this for questions about building agents with the SDK, including:
  - SDK overview and getting started (Python and TypeScript)
  - Agent configuration + custom tools
  - Session management and permissions
  - MCP integration in agents
  - Hosting and deployment
  - Cost tracking and context management
  Note: Agent SDK docs are part of the Claude API documentation at the same URL.

- **Claude API docs** (${"https://platform.claude.com/llms.txt"}): Fetch this for questions about the Claude API (formerly the Anthropic API), including:
  - Messages API and streaming
  - Tool use (function calling) and Anthropic-defined tools (computer use, code execution, web search, text editor, bash, programmatic tool calling, tool search tool, context editing, Files API, structured outputs)
  - Vision, PDF support, and citations
  - Extended thinking and structured outputs
  - MCP connector for remote MCP servers
  - Cloud provider integrations (Bedrock, Vertex AI, Foundry)

**Approach:**
1. Determine which domain the user's question falls into
2. Use ${"WebFetch"} to fetch the appropriate docs map
3. Identify the most relevant documentation URLs from the map
4. Fetch the specific documentation pages
5. Provide clear, actionable guidance based on official documentation
6. Use ${"WebSearch"} if docs don't cover the topic
7. Reference local project files (CLAUDE.md, .claude/ directory) when relevant using ${t}

**Guidelines:**
- Always prioritize official documentation over assumptions
- Your training data about Claude Code commands, flags, and settings may be out of date. If ${"WebFetch"} or ${"WebSearch"} fail or you cannot reach the documentation, do not silently answer from memory: tell the user you could not reach the documentation, give the best answer you have, and explicitly note it may be out of date with a link to https://code.claude.com/docs.
- Keep responses concise and actionable
- Include specific examples or code snippets when helpful
- Reference exact documentation URLs in your responses
- Help users discover features by proactively suggesting related commands, shortcuts, or capabilities

Complete the user's request by providing accurate, documentation-based guidance.`;
  }
  function T2m() {
    if (isUsing3PServices()) {
      return `- When you cannot find an answer or the feature doesn't exist, direct the user to ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.ISSUES_EXPLAINER}`;
    }
    return "- When you cannot find an answer or the feature doesn't exist, direct the user to use /feedback to report a feature request or bug";
  }
  var F2l;
  var q$o = __lazy(() => {
    Tm();
    Fk();
    _x();
    EX();
    Hdt();
    no();
    jV();
    Jf();
    F2l = {
      agentType: "claude-code-guide",
      whenToUse: `Use this agent when the user asks questions ("Can Claude...", "Does Claude...", "How do I...") about: (1) Claude Code (the CLI tool) - features, hooks, slash commands, MCP servers, settings, IDE integrations, keyboard shortcuts; (2) Claude Agent SDK - building custom agents; (3) Claude API (formerly Anthropic API) - API usage, tool use, Anthropic SDK usage. **IMPORTANT:** Before spawning a new agent, check if there is already a running or recently completed claude-code-guide agent that you can continue via ${"SendMessage"}.`,
      get tools() {
        return Rx() && Pu() ? ["Bash", "Read", "WebFetch", "WebSearch"] : ["Glob", "Grep", "Read", "WebFetch", "WebSearch"];
      },
      source: "built-in",
      baseDir: "built-in",
      model: "haiku",
      permissionMode: "dontAsk",
      getSystemPrompt({
        toolUseContext: e
      }) {
        let t = e.options.commands;
        let n = [];
        let r = t.filter(u => u.type === "prompt");
        if (r.length > 0) {
          let u = r.map(d => `- /${d.name}: ${d.description}`).join(`
`);
          n.push(`**Available custom skills in this project:**
${u}`);
        }
        let o = e.options.agentDefinitions.activeAgents.filter(u => u.source !== "built-in");
        if (o.length > 0) {
          let u = o.map(d => `- ${d.agentType}: ${d.whenToUse}`).join(`
`);
          n.push(`**Available custom agents configured:**
${u}`);
        }
        let s = e.options.mcpClients;
        if (s && s.length > 0) {
          let u = s.map(d => `- ${d.name}`).join(`
`);
          n.push(`**Configured MCP servers:**
${u}`);
        }
        let i = t.filter(u => u.type === "prompt" && u.source === "plugin");
        if (i.length > 0) {
          let u = i.map(d => `- /${d.name}: ${d.description}`).join(`
`);
          n.push(`**Available plugin skills:**
${u}`);
        }
        let a = getInitialSettings();
        if (Object.keys(a).length > 0) {
          let u = De(a, null, 2);
          n.push(`**User's settings.json:**
\`\`\`json
${u}
\`\`\``);
        }
        let l = T2m();
        let c = `${S2m()}
${l}`;
        if (n.length > 0) {
          return `${c}

---

# User's Current Configuration

The user has the following custom setup in their environment:

${n.join(`

`)}

When answering questions, consider these configured features and proactively suggest them when relevant.`;
        }
        return c;
      }
    };
  });
  function E2m() {
    let e = Pu();
    let t = e ? "Bash" : "PowerShell";
    let n = Rx() && e;
    return `You are a software architect and planning specialist for Claude Code. Your role is to explore the codebase and design implementation plans.

=== CRITICAL: READ-ONLY MODE - NO FILE MODIFICATIONS ===
This is a READ-ONLY planning task. You are STRICTLY PROHIBITED from:
- Creating new files (no Write, touch, or file creation of any kind)
- Modifying existing files (no Edit operations)
- Deleting files (no rm or deletion)
- Moving or copying files (no mv or cp)
- Creating temporary files anywhere, including /tmp
- Using redirect operators (>, >>, |) or heredocs to write to files
- Running ANY commands that change system state

Your role is EXCLUSIVELY to explore the codebase and design implementation plans. You do NOT have access to file editing tools - attempting to edit files will fail.

You will be provided with a set of requirements and optionally a perspective on how to approach the design process.

## Your Process

1. **Understand Requirements**: Focus on the requirements provided and apply your assigned perspective throughout the design process.

2. **Explore Thoroughly**:
   - Read any files provided to you in the initial prompt
   - Find existing patterns and conventions using ${n ? `\`find\`, \`grep\`, and ${"Read"}` : `${"Glob"}, ${"Grep"}, and ${"Read"}`}
   - Understand the current architecture
   - Identify similar features as reference
   - Trace through relevant code paths
   - Use ${t} ONLY for read-only operations (${e ? `ls, git status, git log, git diff, find${n ? ", grep" : ""}, cat, head, tail` : "Get-ChildItem, git status, git log, git diff, Get-Content, Select-Object -First/-Last"})
   - NEVER use ${t} for: ${e ? "mkdir, touch, rm, cp, mv, git add, git commit, npm install, pip install" : "New-Item, Remove-Item, Copy-Item, Move-Item, git add, git commit, npm install, pip install"}, or any file creation/modification

3. **Design Solution**:
   - Create implementation approach based on your assigned perspective
   - Consider trade-offs and architectural decisions
   - Follow existing patterns where appropriate

4. **Detail the Plan**:
   - Provide step-by-step implementation strategy
   - Identify dependencies and sequencing
   - Anticipate potential challenges

## Required Output

End your response with:

### Critical Files for Implementation
List 3-5 files most critical for implementing this plan:
- path/to/file1.ts
- path/to/file2.ts
- path/to/file3.ts

REMEMBER: You can ONLY explore and plan. You CANNOT and MUST NOT write, edit, or modify any files. You do NOT have access to file editing tools.`;
  }
  var Kor;
  var W$o = __lazy(() => {
    t1();
    Ay();
    Tm();
    mx();
    Fk();
    _x();
    jV();
    Jf();
    Sh();
    jve();
    Kor = {
      agentType: "Plan",
      whenToUse: "Software architect agent for designing implementation plans. Use this when you need to plan the implementation strategy for a task. Returns step-by-step plans, identifies critical files, and considers architectural trade-offs.",
      disallowedTools: ["Agent", "Artifact", "ExitPlanMode", "Edit", "Write", "NotebookEdit"],
      source: "built-in",
      tools: $me.tools,
      baseDir: "built-in",
      model: "inherit",
      omitClaudeMd: true,
      getSystemPrompt: () => E2m()
    };
  });
  var U2l;
  var B2l = __lazy(() => {
    U2l = {
      agentType: "statusline-setup",
      whenToUse: "Use this agent to configure the user's Claude Code status line setting.",
      tools: ["Read", "Edit"],
      source: "built-in",
      baseDir: "built-in",
      model: "sonnet",
      color: "orange",
      getSystemPrompt: () => `You are a status line setup agent for Claude Code. Your job is to create or update the statusLine command in the user's Claude Code settings.

When asked to convert the user's shell PS1 configuration, follow these steps:
1. Read the user's shell configuration files in this order of preference:
   - ~/.zshrc
   - ~/.bashrc  
   - ~/.bash_profile
   - ~/.profile

2. Extract the PS1 value using this regex pattern: /(?:^|\\n)\\s*(?:export\\s+)?PS1\\s*=\\s*["']([^"']+)["']/m

3. Convert PS1 escape sequences to shell commands:
   - \\u \u2192 $(whoami)
   - \\h \u2192 $(hostname -s)  
   - \\H \u2192 $(hostname)
   - \\w \u2192 $(pwd)
   - \\W \u2192 $(basename "$(pwd)")
   - \\$ \u2192 $
   - \\n \u2192 \\n
   - \\t \u2192 $(date +%H:%M:%S)
   - \\d \u2192 $(date "+%a %b %d")
   - \\@ \u2192 $(date +%I:%M%p)
   - \\# \u2192 #
   - \\! \u2192 !

4. When using ANSI color codes, be sure to use \`printf\`. Do not remove colors. Note that the status line will be printed in a terminal using dimmed colors.

5. If the imported PS1 would have trailing "$" or ">" characters in the output, you MUST remove them.

6. If no PS1 is found and user did not provide other instructions, ask for further instructions.

How to use the statusLine command:
1. The statusLine command will receive the following JSON input via stdin:
   {
     "session_id": "string", // Unique session ID
     "session_name": "string", // Optional: Human-readable session name set via /rename
     "prompt_id": "string", // Optional: UUID of the prompt being processed (same as OTel prompt.id)
     "transcript_path": "string", // Path to the conversation transcript
     "cwd": "string",         // Current working directory
     "model": {
       "id": "string",           // Model ID (e.g., "claude-3-5-sonnet-20241022")
       "display_name": "string"  // Display name (e.g., "Claude 3.5 Sonnet")
     },
     "workspace": {
       "current_dir": "string",  // Current working directory path
       "project_dir": "string",  // Project root directory path
       "added_dirs": ["string"], // Directories added via /add-dir
       "git_worktree": "string", // Optional: git worktree name when cwd is in a linked worktree
       "repo": {                 // Optional: repository identity from the origin remote
         "host": "string",       // Remote host (e.g. github.com)
         "owner": "string",      // Repository owner/organization (e.g., "anthropics")
         "name": "string"        // Repository name (e.g., "claude-code")
       }
     },
     "version": "string",        // Claude Code app version (e.g., "1.0.71")
     "output_style": {
       "name": "string",         // Output style name (e.g., "default", "Explanatory", "Learning")
     },
     "context_window": {
       "total_input_tokens": number,       // Input tokens currently in the context window (incl. cache reads/writes)
       "total_output_tokens": number,      // Output tokens from the most recent API response
       "context_window_size": number,      // Context window size for current model (e.g., 200000)
       "current_usage": {                   // Token usage from last API call (null if no messages yet)
         "input_tokens": number,           // Input tokens for current context
         "output_tokens": number,          // Output tokens generated
         "cache_creation_input_tokens": number,  // Tokens written to cache
         "cache_read_input_tokens": number       // Tokens read from cache
       } | null,
       "used_percentage": number | null,      // Pre-calculated: % of context used (0-100), null if no messages yet
       "remaining_percentage": number | null  // Pre-calculated: % of context remaining (0-100), null if no messages yet
     },
     "effort": {                  // Optional, only present when the current model supports reasoning effort
       "level": "low" | "medium" | "high" | "xhigh" | "max"  // Live session effort level
     },
     "thinking": {
       "enabled": boolean         // Whether extended thinking is enabled for this session
     },
     "rate_limits": {             // Optional: Claude.ai subscription usage limits. Only present for subscribers after first API response.
       "five_hour": {             // Optional: 5-hour session limit (may be absent)
         "used_percentage": number,   // Percentage of limit used (0-100)
         "resets_at": number          // Unix epoch seconds when this window resets
       },
       "seven_day": {             // Optional: 7-day weekly limit (may be absent)
         "used_percentage": number,   // Percentage of limit used (0-100)
         "resets_at": number          // Unix epoch seconds when this window resets
       }
     },
     "vim": {                     // Optional, only present when vim mode is enabled
       "mode": "INSERT" | "NORMAL" | "VISUAL" | "VISUAL LINE"  // Current vim editor mode
     },
     "agent": {                    // Optional, only present when Claude is started with --agent flag
       "name": "string",           // Agent name (e.g., "code-architect", "test-runner")
       "type": "string"            // Optional: Agent type identifier
     },
     "pr": {                       // Optional: open PR for the current branch (mirrors the footer PR badge)
       "number": number,           // PR number
       "url": "string",            // PR URL
       "review_state": "approved" | "pending" | "changes_requested" | "draft"  // Optional review status
     },
     "worktree": {                 // Optional, only present when in a --worktree session
       "name": "string",           // Worktree name/slug (e.g., "my-feature")
       "path": "string",           // Full path to the worktree directory
       "branch": "string",         // Optional: Git branch name for the worktree
       "original_cwd": "string",   // The directory Claude was in before entering the worktree
       "original_branch": "string" // Optional: Branch that was checked out before entering the worktree
     }
   }
   
   You can use this JSON data in your command like:
   - $(cat | jq -r '.model.display_name')
   - $(cat | jq -r '.workspace.current_dir')
   - $(cat | jq -r '.output_style.name')

   Or store it in a variable first:
   - input=$(cat); echo "$(echo "$input" | jq -r '.model.display_name') in $(echo "$input" | jq -r '.workspace.current_dir')"

   To display context remaining percentage (simplest approach using pre-calculated field):
   - input=$(cat); remaining=$(echo "$input" | jq -r '.context_window.remaining_percentage // empty'); [ -n "$remaining" ] && echo "Context: $remaining% remaining"

   Or to display context used percentage:
   - input=$(cat); used=$(echo "$input" | jq -r '.context_window.used_percentage // empty'); [ -n "$used" ] && echo "Context: $used% used"

   To display Claude.ai subscription rate limit usage (5-hour session limit):
   - input=$(cat); pct=$(echo "$input" | jq -r '.rate_limits.five_hour.used_percentage // empty'); [ -n "$pct" ] && printf "5h: %.0f%%" "$pct"

   To display both 5-hour and 7-day limits when available:
   - input=$(cat); five=$(echo "$input" | jq -r '.rate_limits.five_hour.used_percentage // empty'); week=$(echo "$input" | jq -r '.rate_limits.seven_day.used_percentage // empty'); out=""; [ -n "$five" ] && out="5h:$(printf '%.0f' "$five")%"; [ -n "$week" ] && out="$out 7d:$(printf '%.0f' "$week")%"; echo "$out"

   To display the GitHub repo (owner/name) when in a git repository:
   - input=$(cat); repo=$(echo "$input" | jq -r '.workspace.repo | if . then .owner + "/" + .name else empty end'); [ -n "$repo" ] && echo "$repo"

   To display the open PR for the current branch when one exists:
   - input=$(cat); pr=$(echo "$input" | jq -r '.pr.number // empty'); [ -n "$pr" ] && echo "PR #$pr ($(echo "$input" | jq -r '.pr.review_state // "open"'))"

2. For longer commands, you can save a new file in the user's ~/.claude directory, e.g.:
   - ~/.claude/statusline-command.sh and reference that file in the settings.

3. Update the user's ~/.claude/settings.json with:
   {
     "statusLine": {
       "type": "command", 
       "command": "your_command_here"
     }
   }

4. If ~/.claude/settings.json is a symlink, update the target file instead.

Guidelines:
- Preserve existing settings when updating
- Return a summary of what was configured, including the name of the script file if used
- If the script includes git commands, they should skip optional locks
- IMPORTANT: At the end of your response, inform the parent agent that this "statusline-setup" agent must be used for further status line changes.
  Also ensure that the user is informed that they can ask Claude to continue to make changes to the status line.
`
    };
  });
  var lvt;
  var Yor = __lazy(() => {
    ZL();
    pr();
    lvt = TEr(() => {
      if (Me.CLAUDE_CODE_DISABLE_EXPLORE_PLAN_AGENTS) {
        return false;
      }
      $n();
      let {
        getFeatureValue_CACHED_MAY_BE_STALE: e
      } = __toCommonJS(aDn);
      return e("tengu_slate_ibis", true);
    });
  });
  var j2l = {};
  __export(j2l, {
    getWorkerSystemPrompt: () => getWorkerSystemPrompt,
    getCoordinatorAgents: () => getCoordinatorAgents,
    WORKER_AGENT: () => WORKER_AGENT
  });
  function getWorkerSystemPrompt() {
    return `You are a worker agent executing a task assigned by the coordinator.

## Environment

- Other workers may be making changes on this branch. If you encounter confusing file state, unexpected changes, or merge conflicts that aren't from your work, stop and report to the coordinator rather than trying to resolve it yourself, unless you are explicitly asked to do so. Don't modify code you don't understand.

## Scope

Complete exactly what was asked. Don't fix unrelated issues you discover \u2014 suggest them as follow-ups instead.
- If you changed any files, commit your changes when done. Use a clear, descriptive commit message. Only stage files you actually changed \u2014 never use \`git add .\` or \`git add -A\`. Report the commit hash in your summary.
- Do not spawn subagents (${"Agent"} tool)
- Limit changes to what your task requires

## Resumed Tasks

You may be resumed with follow-up instructions after completing a previous task. When this happens:
- You retain full context from your previous work \u2014 use it
- Build on what you already know; don't re-read files you've already seen unless they may have changed
- Your new instructions may be brief (e.g., "now add tests for that") \u2014 this is intentional, not ambiguous

## When Things Go Wrong

- If auto-mode denies a tool, report back just the exact action, the denial reason, and "needs user approval for X". The coordinator will get the approval and send it to you \u2014 retry once it arrives; don't narrate the earlier denial.
- If the task is impossible (file missing, conflicting requirements), stop and explain why
- If the task is ambiguous, pick the most likely interpretation and note your assumption
- Don't retry the same failed approach more than once

## Output

Your response goes directly to the coordinator (not the user). Include enough detail for the coordinator to understand what happened and synthesize it for the user.

Structure your response as:
1. **What you did or found** \u2014 be specific with file paths, line numbers, code snippets
2. **Summary:** One sentence the coordinator can relay to the user

Good summary: "Added Redis cache implementation. Tests pass, typecheck clean. Committed abc123."
Bad summary: "I looked at files X, Y, and Z. Y has the changes you mentioned."`;
  }
  function getCoordinatorAgents() {
    return [WORKER_AGENT];
  }
  var WORKER_AGENT;
  var q2l = __lazy(() => {
    Sh();
    WORKER_AGENT = {
      agentType: "worker",
      whenToUse: "For executing tasks autonomously \u2014 research, implementation, or verification.",
      tools: ["*"],
      maxTurns: 200,
      permissionMode: "bubble",
      source: "built-in",
      baseDir: "built-in",
      getSystemPrompt: e => getWorkerSystemPrompt()
    };
  });
  var W2l = {};
  __export(W2l, {
    CLAUDE_AGENT: () => CLAUDE_AGENT
  });
  var CLAUDE_AGENT;
  var Jor = __lazy(() => {
    CLAUDE_AGENT = {
      agentType: "claude",
      whenToUse: "Catch-all for any task that doesn't fit a more specific agent. FleetView's default when no agent name is typed.",
      tools: ["*"],
      source: "built-in",
      baseDir: "built-in",
      appendSystemPrompt: true,
      getSystemPrompt: () => `This session is a background job. The user may be live or away \u2014 respond naturally either way. A classifier reads only your message text (not tool output, subagent reports, or human replies) to track state in the job list, so the conventions below always apply.

**Narrate.** One line on your approach before acting. After each chunk: what happened, what's next.

**Restate.** State results in your own text even if a tool already printed them \u2014 the extractor can't see tool output. If the human replies, open your next turn by restating what they said before acting on it.

For noisy investigation (grep sweeps, log trawls, broad search), spawn a subagent and keep only the findings here.

**Completed.** First run a sanity check (test, build, re-read the ask) and say what you checked. Then write \`result:\` on its own line with a self-contained one-line headline \u2014 readable by someone who never saw the ask. That line is the *only* completion signal; prose like "done" or "finished" is not detected. \`result:\` means the ask is delivered \u2014 pushing or launching something that still needs to settle is narration, not \`result:\`. Skip it only for greetings and clarifying questions; an answer to a question *is* a deliverable.

**Needs input.** Only when one human action unblocks you (auth, a decision, access you can't grant yourself) *and* guessing is costlier than the round-trip. If a reasonable guess exists: make it, note the assumption, keep working. When truly stuck, write \`needs input:\` on its own line stating exactly what you need.

**Failed.** The task is structurally impossible as framed (wrong repo, missing binary, premise false). Write \`failed:\` on its own line with the reason.

Everything else: keep working.`
    };
  });
  function getBuiltInAgents() {
    if (st(process.env.CLAUDE_AGENT_SDK_DISABLE_BUILTIN_AGENTS) && getIsNonInteractiveSession()) {
      return [];
    }
    if (eR()) {
      q2l();
      let {
        getCoordinatorAgents: n
      } = __toCommonJS(j2l);
      return n();
    }
    let e = [Kve];
    if (!Ql()) {
      e.push(U2l);
    }
    if (!zat()) {
      Jor();
      let {
        CLAUDE_AGENT: n
      } = __toCommonJS(W2l);
      e.push(n);
    }
    if (lvt()) {
      e.push($me, Kor);
    }
    if (process.env.CLAUDE_CODE_ENTRYPOINT !== "sdk-ts" && process.env.CLAUDE_CODE_ENTRYPOINT !== "sdk-py" && process.env.CLAUDE_CODE_ENTRYPOINT !== "sdk-cli") {
      e.push(F2l);
    }
    return e;
  }
  var G$o = __lazy(() => {
    at();
    fDn();
    RV();
    gn();
    q$o();
    jve();
    j7t();
    W$o();
    B2l();
    Yor();
  });
  var cvt = {};
  __export(cvt, {
    toAgentInfos: () => toAgentInfos,
    rebuildAgentDefinitions: () => rebuildAgentDefinitions,
    parseAgentsFromJson: () => parseAgentsFromJson,
    parseAgentFromMarkdown: () => parseAgentFromMarkdown,
    parseAgentFromJson: () => parseAgentFromJson,
    normalizeAgentType: () => normalizeAgentType,
    isPluginAgent: () => isPluginAgent,
    isCustomAgent: () => isCustomAgent,
    isBuiltInAgent: () => isBuiltInAgent,
    hasRequiredMcpServers: () => hasRequiredMcpServers,
    getBuiltInAgents: () => getBuiltInAgents,
    getAgentDefinitionsWithOverrides: () => getAgentDefinitionsWithOverrides,
    getActiveAgentsFromList: () => getActiveAgentsFromList,
    filterAgentsByMcpRequirements: () => filterAgentsByMcpRequirements,
    detectAgentNameCollisions: () => detectAgentNameCollisions,
    describeAgentLocation: () => describeAgentLocation,
    clearAgentDefinitionsCache: () => clearAgentDefinitionsCache,
    agentMcpSpecsToScopedConfigs: () => agentMcpSpecsToScopedConfigs
  });
  function agentMcpSpecsToScopedConfigs(e) {
    if (!e.mcpServers?.length) {
      return {};
    }
    if (ZT("mcp") && !Hbe(e.source)) {
      logForDebugging(`[Agent: ${e.agentType}] Skipping frontmatter MCP servers: strictPluginOnlyCustomization locks MCP to plugin-only (agent source: ${e.source})`);
      return {};
    }
    let t = {};
    for (let n of e.mcpServers) {
      if (typeof n === "string") {
        continue;
      }
      let r = Object.entries(n);
      if (r.length !== 1) {
        logForDebugging(`[Agent: ${e.agentType}] Invalid MCP server spec: expected exactly one key`, {
          level: "warn"
        });
        continue;
      }
      let [o, s] = r[0];
      if (wGe(o)) {
        logForDebugging(`[Agent: ${e.agentType}] Skipping reserved MCP server name '${o}' in frontmatter`, {
          level: "warn"
        });
        continue;
      }
      if (s.type === "sse-ide" || s.type === "ws-ide") {
        logForDebugging(`[Agent: ${e.agentType}] Skipping internal-only MCP transport '${s.type}' for '${o}' in frontmatter`, {
          level: "warn"
        });
        continue;
      }
      t[o] = {
        ...s,
        scope: "agent"
      };
    }
    return t;
  }
  function toAgentInfos(e) {
    return e.map(t => ({
      name: t.agentType,
      description: t.whenToUse,
      model: t.model === "inherit" ? undefined : t.model
    }));
  }
  function isBuiltInAgent(e) {
    return e.source === "built-in";
  }
  function isCustomAgent(e) {
    return e.source !== "built-in" && e.source !== "plugin";
  }
  function isPluginAgent(e) {
    return e.source === "plugin";
  }
  function getActiveAgentsFromList(e) {
    let t = e.filter(u => u.source === "built-in");
    let n = e.filter(u => u.source === "plugin");
    let r = e.filter(u => u.source === "userSettings");
    let s = [...e.filter(u => u.source === "projectSettings" && u.fromAdditionalDirectory), ...e.filter(u => u.source === "projectSettings" && !u.fromAdditionalDirectory).sort(uvt)];
    let i = e.filter(u => u.source === "policySettings");
    let a = e.filter(u => u.source === "flagSettings");
    let l = [t, n, r, s, a, i];
    let c = new Map();
    for (let u of l) {
      for (let d of u) {
        c.set(d.agentType, d);
      }
    }
    return Array.from(c.values()).sort((u, d) => u.agentType.localeCompare(d.agentType));
  }
  function G2l(e) {
    return e.replace(/[\p{Cc}\p{Cf}]/gu, " ").replace(/\s+/g, " ").trim().slice(0, 200);
  }
  function describeAgentLocation(e) {
    if (e.filePath) {
      return e.filePath;
    }
    if (isPluginAgent(e)) {
      return `plugin '${e.plugin}'`;
    }
    if (e.baseDir && e.filename) {
      return `${e.baseDir}/${e.filename}.md`;
    }
    return e.source;
  }
  function detectAgentNameCollisions(e, t) {
    let n = new Set(t);
    let r = new Map();
    for (let s of e) {
      if (s.source === "built-in") {
        continue;
      }
      let i = `${s.source}\x00${s.baseDir ?? ""}\x00${s.agentType}`;
      let a = r.get(i);
      if (a) {
        a.push(s);
      } else {
        r.set(i, [s]);
      }
    }
    let o = [];
    for (let s of r.values()) {
      if (s.length < 2) {
        continue;
      }
      s.sort((i, a) => Number(n.vZc(a)) - Number(n.vZc(i)));
      o.push({
        agentType: G2l(s[0].agentType),
        source: s[0].source,
        locations: s.map(i => G2l(describeAgentLocation(i))),
        oneIsActive: n.vZc(s[0])
      });
    }
    return o.sort((s, i) => s.agentType.localeCompare(i.agentType));
  }
  function rebuildAgentDefinitions(e, t) {
    let n = getActiveAgentsFromList(t);
    let r = detectAgentNameCollisions(t, n);
    return {
      ...e,
      allAgents: t,
      activeAgents: n,
      nameCollisions: r.length > 0 ? r : undefined
    };
  }
  function hasRequiredMcpServers(e, t) {
    if (!e.requiredMcpServers || e.requiredMcpServers.length === 0) {
      return true;
    }
    return e.requiredMcpServers.every(n => t.some(r => r.toLowerCase().includes(n.toLowerCase())));
  }
  function filterAgentsByMcpRequirements(e, t) {
    return e.filter(n => hasRequiredMcpServers(n, t));
  }
  function clearAgentDefinitionsCache() {
    getAgentDefinitionsWithOverrides.cache?.clear?.();
    E9.cache?.clear?.();
    Tor();
  }
  function R2m(e) {
    let {
      name: t,
      description: n
    } = e;
    if (!t || typeof t !== "string") {
      return 'Missing required "name" field in frontmatter';
    }
    if (t.startsWith("-")) {
      return 'Invalid "name": names must not start with "-"';
    }
    if (!n || typeof n !== "string") {
      return 'Missing required "description" field in frontmatter';
    }
    return "Unknown parsing error";
  }
  function x2m(e, t) {
    if (!e.hooks) {
      return;
    }
    let n = cW().safeParse(e.hooks);
    if (!n.success) {
      logForDebugging(`Invalid hooks in agent '${t}': ${n.error.message}`);
      return;
    }
    return n.data;
  }
  function parseAgentFromJson(e, t, n = "flagSettings") {
    try {
      if (e.startsWith("-")) {
        logForDebugging(`Agent '${e}' has an invalid name: names must not start with '-'`, {
          level: "error"
        });
        return null;
      }
      let r = K2l().parse(t);
      let o = qFe(r.tools);
      if (Vd() && r.memory && o !== undefined) {
        let l = new Set(o);
        for (let c of ["Write", "Edit", "Read"]) {
          if (!l.vZc(c)) {
            o = [...o, c];
          }
        }
      }
      let s = r.disallowedTools !== undefined ? qFe(r.disallowedTools) : undefined;
      let i = r.prompt;
      return {
        agentType: e,
        whenToUse: r.description,
        ...(o !== undefined && {
          tools: o
        }),
        ...(s !== undefined && {
          disallowedTools: s
        }),
        getSystemPrompt: () => {
          if (Vd() && r.memory) {
            return i + `

` + $$t(e, r.memory);
          }
          return i;
        },
        source: n,
        ...(r.model && {
          model: r.model
        }),
        ...(r.effort !== undefined && {
          effort: r.effort
        }),
        ...(r.permissionMode && {
          permissionMode: r.permissionMode
        }),
        ...(r.mcpServers && r.mcpServers.length > 0 && {
          mcpServers: r.mcpServers
        }),
        ...(r.hooks && {
          hooks: r.hooks
        }),
        ...(r.maxTurns !== undefined && {
          maxTurns: r.maxTurns
        }),
        ...(r.skills && r.skills.length > 0 && {
          skills: r.skills
        }),
        ...(r.initialPrompt && {
          initialPrompt: r.initialPrompt
        }),
        ...(r.background && {
          background: r.background
        }),
        ...(r.memory && {
          memory: r.memory
        }),
        ...(r.isolation && {
          isolation: r.isolation
        })
      };
    } catch (r) {
      let o = r instanceof Error ? r.message : String(r);
      logForDebugging(`Error parsing agent '${e}' from JSON: ${o}`, {
        level: "error"
      });
      return null;
    }
  }
  function parseAgentsFromJson(e, t = "flagSettings") {
    try {
      let n = C2m().parse(e);
      return Object.entries(n).map(([r, o]) => parseAgentFromJson(r, o, t)).filter(r => r !== null);
    } catch (n) {
      let r = n instanceof Error ? n.message : String(n);
      logForDebugging(`Error parsing agents from JSON: ${r}`, {
        level: "error"
      });
      return [];
    }
  }
  function parseAgentFromMarkdown(e, t, n, r, o) {
    try {
      let {
        name: s,
        description: i
      } = n;
      if (!s || typeof s !== "string") {
        return null;
      }
      if (s.startsWith("-")) {
        logForDebugging(`Agent file ${e} has invalid name '${s}': names must not start with '-'`, {
          level: "error"
        });
        return null;
      }
      if (Z4e("agent", n), !i || typeof i !== "string") {
        logForDebugging(`Agent file ${e} is missing required 'description' in frontmatter`);
        return null;
      }
      i = i.replaceAll("\\n", `
`);
      let {
        color: a,
        model: l
      } = n;
      let c;
      if (typeof l === "string" && l.trim().length > 0) {
        let j = l.trim();
        c = j.toLowerCase() === "inherit" ? "inherit" : j;
      }
      let u = n.background;
      if (u !== undefined && u !== "true" && u !== "false" && u !== true && u !== false) {
        logForDebugging(`Agent file ${e} has invalid background value '${u}'. Must be 'true', 'false', or omitted.`);
      }
      let d = u === "true" || u === true ? true : undefined;
      let p = ["user", "project", "local"];
      let m = n.memory;
      let f;
      if (m !== undefined) {
        if (p.includes(m)) {
          f = m;
        } else {
          logForDebugging(`Agent file ${e} has invalid memory value '${m}'. Valid options: ${p.join(", ")}`);
        }
      }
      let h = ["worktree", "remote"];
      let g = n.isolation;
      let y;
      if (g !== undefined) {
        if (h.includes(g)) {
          y = g;
        } else {
          logForDebugging(`Agent file ${e} has invalid isolation value '${g}'. Valid options: ${h.join(", ")}`);
        }
      }
      let _ = n.effort;
      let b = _ !== undefined ? L2(_) : undefined;
      if (_ !== undefined && b === undefined) {
        logForDebugging(`Agent file ${e} has invalid effort '${_}'. Valid options: ${UC.join(", ")} or an integer`);
      }
      let S = n.permissionMode;
      let E = S && INTERNAL_PERMISSION_MODES.includes(S);
      if (S && !E) {
        let j = `Agent file ${e} has invalid permissionMode '${S}'. Valid options: ${INTERNAL_PERMISSION_MODES.join(", ")}`;
        logForDebugging(j);
      }
      let C = n.maxTurns;
      let x = bDn(C);
      if (C !== undefined && x === undefined) {
        logForDebugging(`Agent file ${e} has invalid maxTurns '${C}'. Must be a positive integer.`);
      }
      let A = V2l.basename(e, ".md");
      let k = qFe(n.tools);
      if (Vd() && f && k !== undefined) {
        let j = new Set(k);
        for (let z of ["Write", "Edit", "Read"]) {
          if (!j.vZc(z)) {
            k = [...k, z];
          }
        }
      }
      let I = n.disallowedTools;
      let O = I !== undefined ? qFe(I) : undefined;
      let M = bQ(n.skills);
      let L = n.initialPrompt;
      let P = typeof L === "string" && L.trim() ? L : undefined;
      let F = n.mcpServers;
      let H;
      if (Array.isArray(F)) {
        H = F.map(j => {
          let z = z2l().safeParse(j);
          if (z.success) {
            return z.data;
          }
          logForDebugging(`Agent file ${e} has invalid mcpServers item: ${De(j)}. Error: ${z.error.message}`);
          return null;
        }).filter(j => j !== null);
      }
      let U = x2m(n, s);
      let N = r.trim();
      return {
        baseDir: t,
        agentType: s,
        whenToUse: i,
        ...(k !== undefined && {
          tools: k
        }),
        ...(O !== undefined && {
          disallowedTools: O
        }),
        ...(M !== undefined && {
          skills: M
        }),
        ...(P !== undefined && {
          initialPrompt: P
        }),
        ...(H !== undefined && H.length > 0 && {
          mcpServers: H
        }),
        ...(U !== undefined && {
          hooks: U
        }),
        getSystemPrompt: () => {
          if (Vd() && f) {
            let j = $$t(s, f);
            return N + `

` + j;
          }
          return N;
        },
        source: o,
        filename: A,
        filePath: e,
        ...(a && typeof a === "string" && eb.includes(a) && {
          color: a
        }),
        ...(c !== undefined && {
          model: c
        }),
        ...(b !== undefined && {
          effort: b
        }),
        ...(E && {
          permissionMode: S
        }),
        ...(x !== undefined && {
          maxTurns: x
        }),
        ...(d && {
          background: d
        }),
        ...(f && {
          memory: f
        }),
        ...(y && {
          isolation: y
        })
      };
    } catch (s) {
      let i = s instanceof Error ? s.message : String(s);
      logForDebugging(`Error parsing agent from ${e}: ${i}`, {
        level: "error"
      });
      return null;
    }
  }
  function normalizeAgentType(e) {
    return e.normalize("NFKC").toLowerCase().replace(/[\p{White_Space}\p{Pd}_]+/gu, "");
  }
  var V2l;
  var z2l;
  var K2l;
  var C2m;
  var getAgentDefinitionsWithOverrides;
  var kS = __lazy(() => {
    Eb();
    Ot();
    yFn();
    Lke();
    wb();
    je();
    Fp();
    fv();
    Rn();
    v9();
    HT();
    Eor();
    IJ();
    Rj();
    Wk();
    Ay();
    Tm();
    mx();
    $U();
    Vbe();
    N2l();
    G$o();
    V2l = require("path");
    z2l = we(() => v.union([v.string(), v.record(v.string(), vle())]));
    K2l = we(() => v.object({
      description: v.string().min(1, "Description cannot be empty"),
      tools: v.array(v.string()).optional(),
      disallowedTools: v.array(v.string()).optional(),
      prompt: v.string().min(1, "Prompt cannot be empty"),
      model: v.string().trim().min(1, "Model cannot be empty").transform(e => e.toLowerCase() === "inherit" ? "inherit" : e).optional(),
      effort: v.union([v.enum(UC), v.number().int()]).optional(),
      permissionMode: v.enum(INTERNAL_PERMISSION_MODES).optional(),
      mcpServers: v.array(z2l()).optional(),
      hooks: cW().optional(),
      maxTurns: v.number().int().positive().optional(),
      skills: v.array(v.string()).optional(),
      initialPrompt: v.string().optional(),
      memory: v.enum(["user", "project", "local"]).optional(),
      background: v.boolean().optional(),
      isolation: v.enum(["worktree", "remote"]).optional()
    }));
    C2m = we(() => v.record(v.string(), K2l()));
    getAgentDefinitionsWithOverrides = TEr(async e => {
      if (Pc("agents")) {
        let t = getBuiltInAgents();
        return {
          activeAgents: t,
          allAgents: t
        };
      }
      try {
        let t = await E9("agents", e);
        let n = [];
        let r = t.map(u => {
          let {
            filePath: d,
            baseDir: p,
            frontmatter: m,
            content: f,
            source: h
          } = u;
          let g = parseAgentFromMarkdown(d, p, m, f, h);
          if (!g) {
            if (!m.name) {
              return null;
            }
            let y = R2m(m);
            n.push({
              path: d,
              error: y
            });
            logForDebugging(`Failed to parse agent from ${d}: ${y}`);
            logEvent("tengu_agent_parse_error", {
              error: y,
              location: h
            });
            return null;
          }
          if (u.fromAdditionalDirectory) {
            g.fromAdditionalDirectory = true;
          }
          return g;
        }).filter(u => u !== null);
        let s = await YXt().catch(u => (Oe(u), []));
        let a = [...getBuiltInAgents(), ...s, ...r];
        let l = getActiveAgentsFromList(a);
        let c = detectAgentNameCollisions(a, l);
        gOe("agent", [...a, ...l].map(u => ({
          name: u.agentType,
          source: u.source
        })), {
          resolves: true
        });
        for (let u of l) {
          if (u.color) {
            xbt(u.agentType, u.color);
          }
        }
        return {
          activeAgents: l,
          allAgents: a,
          failedFiles: n.length > 0 ? n : undefined,
          nameCollisions: c.length > 0 ? c : undefined
        };
      } catch (t) {
        let n = t instanceof Error ? t.message : String(t);
        logForDebugging(`Error loading agent definitions: ${n}`);
        Oe(t);
        let r = getBuiltInAgents();
        return {
          activeAgents: r,
          allAgents: r,
          failedFiles: [{
            path: "unknown",
            error: n
          }]
        };
      }
    });
  });
  var Z2l = {};