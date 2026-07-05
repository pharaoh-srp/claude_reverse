  __export(Mma, {
    stripHtmlComments: () => stripHtmlComments,
    shouldShowClaudeMdExternalIncludesWarning: () => shouldShowClaudeMdExternalIncludesWarning,
    resetGetMemoryFilesCache: () => resetGetMemoryFilesCache,
    processMemoryFile: () => processMemoryFile,
    processMdRules: () => processMdRules,
    processConditionedMdRules: () => processConditionedMdRules,
    isSyntheticMemoryPath: () => isSyntheticMemoryPath,
    isMemoryFilePath: () => isMemoryFilePath,
    hasExternalClaudeMdIncludes: () => hasExternalClaudeMdIncludes,
    getMemoryFilesForNestedDirectory: () => getMemoryFilesForNestedDirectory,
    getMemoryFiles: () => getMemoryFiles,
    getMaxMemoryCharacterCount: () => getMaxMemoryCharacterCount,
    getManagedAndUserConditionalRules: () => getManagedAndUserConditionalRules,
    getLargeMemoryFiles: () => getLargeMemoryFiles,
    getExternalClaudeMdIncludes: () => getExternalClaudeMdIncludes,
    getConditionalRulesForCwdLevelDirectory: () => getConditionalRulesForCwdLevelDirectory,
    getClaudeMds: () => getClaudeMds,
    getAllMemoryFilePaths: () => getAllMemoryFilePaths,
    filterInjectedMemoryFiles: () => filterInjectedMemoryFiles,
    clearMemoryFileCaches: () => clearMemoryFileCaches,
    MIN_MEMORY_CHARACTER_COUNT: () => 40000,
    MAX_CLAUDE_MD_TOKEN_CONTEXT_RATIO: () => 0.05,
    MAX_CLAUDE_MD_BYTES: () => 4194304,
    MANAGED_SETTINGS_CLAUDEMD_PATH: () => "<managed-settings>"
  });
  function isSyntheticMemoryPath(e) {
    return e === "<policyHelper>" || e === "<managed-settings>";
  }
  function getMaxMemoryCharacterCount(e = getMainLoopModel()) {
    let t = iT(e, getSdkBetas());
    let n = Number.isFinite(t) && t > 0 ? t : 200000;
    return Math.max(40000, Math.round(n * 0.05 * bytesPerTokenForModel(e)));
  }
  function Ama(e) {
    return pathInWorkingPath(e, getOriginalCwd());
  }
  function x_p(e) {
    let {
      frontmatter: t,
      content: n
    } = sf(e);
    if (!t.paths) {
      return {
        content: n
      };
    }
    let r = y$t(t.paths).map(o => o.endsWith("/**") ? o.slice(0, -3) : o).filter(o => o.length > 0);
    if (r.length === 0 || r.every(o => o === "**")) {
      return {
        content: n
      };
    }
    return {
      content: n,
      paths: r
    };
  }
  function stripHtmlComments(e) {
    if (!e.includes("<!--")) {
      return {
        content: e,
        stripped: false
      };
    }
    return Ima(new Bq({
      gfm: false
    }).lex(e));
  }
  function Ima(e) {
    let t = "";
    let n = false;
    let r = /<!--[\s\S]*?-->/g;
    for (let o of e) {
      if (o.type === "html") {
        let s = o.raw.trimStart();
        if (s.startsWith("<!--") && s.includes("-->")) {
          let i = o.raw.replace(r, "");
          if (n = true, i.trim().length > 0) {
            t += i;
          }
          continue;
        }
      }
      t += o.raw;
    }
    return {
      content: t,
      stripped: n
    };
  }
  function A_p(e, t, n, r) {
    let o = $m.extname(t).toLowerCase();
    if (o && !R_p.vZc(o)) {
      logForDebugging(`Skipping non-text file in @include: ${t}`);
      return {
        info: null,
        includePaths: []
      };
    }
    let {
      content: s,
      paths: i
    } = x_p(e);
    let a = s.includes("<!--");
    let l = a || r !== undefined ? new Bq({
      gfm: false
    }).lex(s) : undefined;
    let c = a && l ? Ima(l).content : s;
    let u = l && r !== undefined ? O_p(l, r) : [];
    let d = c;
    if (n === "AutoMem") {
      d = F$t(c).content;
    }
    let p = d !== e;
    return {
      info: {
        path: t,
        type: n,
        content: d,
        globs: i,
        contentDiffersFromDisk: p,
        rawContent: p ? e : undefined
      },
      includePaths: u
    };
  }
  function I_p(e) {
    let {
      content: t
    } = F$t(e);
    return {
      path: Obe(),
      type: "AutoMem",
      content: t,
      contentDiffersFromDisk: true,
      rawContent: e
    };
  }
  function P_p(e, t) {
    let n = en(e);
    if (n === "ENOENT" || n === "EISDIR") {
      return;
    }
    if (n === "EACCES") {
      logEvent("tengu_claude_md_permission_error", {
        is_access_error: 1,
        has_home_dir: t.includes(er()) ? 1 : 0
      });
    }
  }
  async function Pma(e, t, n) {
    try {
      let r = zt();
      let o = await $F(r, e, 4194304);
      if (o === null) {
        logForDebugging(`[CLAUDE.md] skipping ${e}: not a regular file or exceeds ${4194304} byte limit`);
        return {
          info: null,
          includePaths: []
        };
      }
      return A_p(o, e, t, n);
    } catch (r) {
      P_p(r, e);
      return {
        info: null,
        includePaths: []
      };
    }
  }
  function O_p(e, t) {
    let n = new Set();
    function r(s) {
      let i = /(?:^|\s)@((?:[^\s\\]|\\ )+)/g;
      let a;
      while ((a = i.exec(s)) !== null) {
        let l = a[1];
        if (!l) {
          continue;
        }
        let c = l.indexOf("#");
        if (c !== -1) {
          l = l.substring(0, c);
        }
        if (!l) {
          continue;
        }
        if (l = l.replaceAll("\\ ", " "), l) {
          if (!(Rc(l) && !Pp(l)) && !zS(l) && (l.startsWith("./") || l.startsWith("~/") || l.startsWith("/") && l !== "/" || !l.startsWith("@") && !l.match(/^[#%^&*()]+/) && l.match(/^[a-zA-Z0-9._-]/))) {
            let d = us(l, $m.dirname(t));
            n.add(d);
          }
        }
      }
    }
    function o(s) {
      for (let i of s) {
        if (i.type === "code" || i.type === "codespan") {
          continue;
        }
        if (i.type === "html") {
          let a = i.raw || "";
          let l = a.trimStart();
          if (l.startsWith("<!--") && l.includes("-->")) {
            let c = /<!--[\s\S]*?-->/g;
            let u = a.replace(c, "");
            if (u.trim().length > 0) {
              r(u);
            }
          }
          continue;
        }
        if (i.type === "text") {
          r(i.text || "");
        }
        if (i.tokens) {
          o(i.tokens);
        }
        if (i.items) {
          o(i.items);
        }
      }
    }
    o(e);
    return [...n];
  }
  function M_p(e, t) {
    if (t !== "User" && t !== "Project" && t !== "Local") {
      return false;
    }
    let n = getInitialSettings().claudeMdExcludes;
    if (!n || n.length === 0) {
      return false;
    }
    let r = {
      dot: true
    };
    let o = e.replaceAll("\\", "/");
    let s = N_p(n).filter(i => i.length > 0);
    if (s.length === 0) {
      return false;
    }
    return Rma.default.isMatch(o, s, r);
  }
  function N_p(e) {
    let t = zt();
    let n = e.map(r => r.replaceAll("\\", "/"));
    for (let r of n) {
      if (!r.startsWith("/")) {
        continue;
      }
      let o = r.search(/[*?{[]/);
      let s = o === -1 ? r : r.slice(0, o);
      let i = $m.dirname(s);
      try {
        let {
          resolvedPath: a
        } = qd(t, i);
        if (Rc(a) && !Pp(a) || zS(a)) {
          continue;
        }
        let l = a.replaceAll("\\", "/");
        if (l !== i) {
          let c = l + r.slice(i.length);
          n.push(c);
        }
      } catch {}
    }
    return n;
  }
  async function processMemoryFile(e, t, n, r, o = 0, s) {
    let i = yC(e);
    if (n.vZc(i) || o >= 5) {
      return [];
    }
    if (M_p(e, t)) {
      return [];
    }
    if (Rc(e) && !Pp(e) || zS(e)) {
      return [];
    }
    let {
      resolvedPath: a,
      isSymlink: l
    } = qd(zt(), e);
    if (Rc(a) && !Pp(a) || zS(a)) {
      return [];
    }
    if (l) {
      let p = yC(a);
      if (n.vZc(p)) {
        return [];
      }
      n.add(p);
    }
    n.add(i);
    let {
      info: c,
      includePaths: u
    } = await Pma(e, t, a);
    if (!c || !c.content.trim()) {
      return [];
    }
    if (s) {
      c.parent = s;
    }
    let d = [];
    d.push(c);
    for (let p of u) {
      if (!Ama(p) && !r) {
        continue;
      }
      let f = await processMemoryFile(p, t, n, r, o + 1, e);
      d.push(...f);
    }
    return d;
  }
  async function processMdRules({
    rulesDir: e,
    type: t,
    processedPaths: n,
    includeExternal: r,
    conditionalRule: o,
    visitedDirs: s = new Set()
  }) {
    if (s.vZc(e)) {
      return [];
    }
    try {
      let i = zt();
      let {
        resolvedPath: a,
        isSymlink: l
      } = qd(i, e);
      if (Rc(a) && !Pp(a) || zS(a)) {
        return [];
      }
      if (s.add(e), l) {
        s.add(a);
      }
      let c = [];
      let u;
      try {
        u = await i.readdir(a);
      } catch (d) {
        let p = en(d);
        if (p === "ENOENT" || p === "EACCES" || p === "ENOTDIR") {
          return [];
        }
        throw d;
      }
      for (let d of u) {
        let p = $m.join(e, d.name);
        let {
          resolvedPath: m,
          isSymlink: f
        } = qd(i, p);
        if (Rc(m) && !Pp(m) || zS(m)) {
          continue;
        }
        let h = f ? await i.stat(m) : null;
        let g = h ? h.isDirectory() : d.isDirectory();
        let y = h ? h.isFile() : d.isFile();
        if (g) {
          c.push(...(await processMdRules({
            rulesDir: m,
            type: t,
            processedPaths: n,
            includeExternal: r,
            conditionalRule: o,
            visitedDirs: s
          })));
        } else if (y && d.name.endsWith(".md")) {
          let _ = await processMemoryFile(m, t, n, r);
          c.push(..._.filter(b => o ? b.globs : !b.globs));
        }
      }
      return c;
    } catch (i) {
      if (i instanceof Error && i.message.includes("EACCES")) {
        logEvent("tengu_claude_rules_md_permission_error", {
          is_access_error: 1,
          has_home_dir: e.includes(er()) ? 1 : 0
        });
      }
      return [];
    }
  }
  function Oma(e) {
    return e === "User" || e === "Project" || e === "Local" || e === "Managed";
  }
  function L_p() {
    if (!Fuo) {
      return;
    }
    Fuo = false;
    let e = Luo;
    Luo = "session_start";
    return e;
  }
  function clearMemoryFileCaches() {
    getMemoryFiles.cache?.clear?.();
  }
  function resetGetMemoryFilesCache(e = "session_start") {
    Luo = e;
    Fuo = true;
    clearMemoryFileCaches();
  }
  function getLargeMemoryFiles(e) {
    let t = getMaxMemoryCharacterCount();
    return e.filter(n => !isSyntheticMemoryPath(n.path) && Oma(n.type) && n.content.length > t);
  }
  function filterInjectedMemoryFiles(e) {
    if (!Gat()) {
      return e;
    }
    return e.filter(t => t.type !== "AutoMem");
  }
  async function getManagedAndUserConditionalRules(e, t) {
    let n = [];
    let r = getManagedClaudeRulesDir();
    if (n.push(...(await processConditionedMdRules(e, r, "Managed", t, false))), qf("userSettings")) {
      let o = getUserClaudeRulesDir();
      n.push(...(await processConditionedMdRules(e, o, "User", t, true)));
    }
    return n;
  }
  async function getMemoryFilesForNestedDirectory(e, t, n) {
    if (Me.CLAUDE_CODE_DISABLE_CLAUDE_MDS) {
      return [];
    }
    let r = [];
    if (qf("projectSettings")) {
      let i = $m.join(e, "CLAUDE.md");
      r.push(...(await processMemoryFile(i, "Project", n, false)));
      let a = $m.join(e, ".claude", "CLAUDE.md");
      r.push(...(await processMemoryFile(a, "Project", n, false)));
    }
    if (qf("localSettings")) {
      let i = $m.join(e, "CLAUDE.local.md");
      r.push(...(await processMemoryFile(i, "Local", n, false)));
    }
    let o = $m.join(e, ".claude", "rules");
    let s = new Set(n);
    r.push(...(await processMdRules({
      rulesDir: o,
      type: "Project",
      processedPaths: s,
      includeExternal: false,
      conditionalRule: false
    })));
    r.push(...(await processConditionedMdRules(t, o, "Project", n, false)));
    for (let i of s) {
      n.add(i);
    }
    return r;
  }
  async function getConditionalRulesForCwdLevelDirectory(e, t, n) {
    let r = $m.join(e, ".claude", "rules");
    return processConditionedMdRules(t, r, "Project", n, false);
  }
  async function processConditionedMdRules(e, t, n, r, o) {
    let s = await processMdRules({
      rulesDir: t,
      type: n,
      processedPaths: r,
      includeExternal: o,
      conditionalRule: true
    });
    let i = n === "Project" ? $m.dirname($m.dirname(t)) : getOriginalCwd();
    let a = $m.isAbsolute(e) ? $m.relative(i, e) : e;
    if ($m.isAbsolute(e) && (!a || a.startsWith("..") || $m.isAbsolute(a))) {
      let l = $m.dirname(e);
      let {
        resolvedPath: c
      } = qd(zt(), l);
      if (c !== l) {
        a = $m.relative(i, $m.join(c, $m.basename(e)));
      }
    }
    return s.filter(l => {
      if (!l.globs || l.globs.length === 0) {
        return false;
      }
      if (!a || a.startsWith("..") || $m.isAbsolute(a)) {
        return false;
      }
      return Cma.default().add(l.globs).ignores(a);
    });
  }
  function getExternalClaudeMdIncludes(e) {
    let t = [];
    for (let n of e) {
      if (n.type !== "User" && n.parent && !Ama(n.path)) {
        t.push({
          path: n.path,
          parent: n.parent
        });
      }
    }
    return t;
  }
  function hasExternalClaudeMdIncludes(e) {
    return getExternalClaudeMdIncludes(e).length > 0;
  }
  async function shouldShowClaudeMdExternalIncludesWarning() {
    let e = getCurrentProjectConfig();
    if (e.hasClaudeMdExternalIncludesApproved || e.hasClaudeMdExternalIncludesWarningShown) {
      return false;
    }
    return hasExternalClaudeMdIncludes(await getMemoryFiles(true));
  }
  function isMemoryFilePath(e) {
    let t = $m.basename(e);
    if (t === "CLAUDE.md" || t === "CLAUDE.local.md") {
      return true;
    }
    if (t.endsWith(".md") && e.includes(`${$m.sep}.claude${$m.sep}rules${$m.sep}`)) {
      return true;
    }
    return false;
  }
  function getAllMemoryFilePaths(e, t) {
    let n = new Set();
    for (let r of e) {
      if (isSyntheticMemoryPath(r.path)) {
        continue;
      }
      if (r.content.trim().length > 0) {
        n.add(r.path);
      }
    }
    for (let r of aDe(t)) {
      if (isMemoryFilePath(r)) {
        n.add(r);
      }
    }
    return Array.from(n);
  }
  var Cma;
  var $m;
  var Rma;
  var wma = false;
  var R_p;
  var getMemoryFiles;
  var Luo = "session_start";
  var Fuo = true;
  var getClaudeMds = (e, t) => {
    let n = [];
    let r = getFeatureValue_CACHED_MAY_BE_STALE("tengu_paper_halyard", false);
    for (let o of e) {
      if (t && !t(o.type)) {
        continue;
      }
      if (r && (o.type === "Project" || o.type === "Local")) {
        continue;
      }
      if (o.content) {
        let s = o.type === "Project" ? " (project instructions, checked into the codebase)" : o.type === "Local" ? " (user's private project instructions, not checked in)" : o.type === "AutoMem" ? " (user's auto-memory, persists across conversations)" : o.type === "Managed" ? " (organization-managed policy instructions)" : " (user's private global instructions for all projects)";
        let i = o.content.trim();
        n.push(`Contents of ${o.path}${s}:

${i}`);
      }
    }
    if (n.length === 0) {
      return "";
    }
    return `${"Codebase and user instructions are shown below. Be sure to adhere to these instructions. IMPORTANT: These instructions OVERRIDE any default behavior and you MUST follow them exactly as written."}

${n.join(`

`)}`;
  };
  var bx = __lazy(() => {
    Gdt();
    Ot();
    at();
    B$t();
    Eb();
    ru();
    $n();
    mm();
    VT();
    je();
    Zm();
    pr();
    gn();
    dt();
    Zl();
    qI();
    fv();
    n1();
    na();
    Sp();
    Eo();
    ku();
    wm();
    nf();
    xje();
    Cma = __toESM(aWe(), 1);
    $m = require("path");
    Rma = __toESM(Muo(), 1);
    R_p = new Set([".md", ".txt", ".text", ".json", ".yaml", ".yml", ".toml", ".xml", ".csv", ".html", ".htm", ".css", ".scss", ".sass", ".less", ".js", ".ts", ".tsx", ".jsx", ".mjs", ".cjs", ".mts", ".cts", ".py", ".pyi", ".pyw", ".rb", ".erb", ".rake", ".go", ".rs", ".java", ".kt", ".kts", ".scala", ".c", ".cpp", ".cc", ".cxx", ".h", ".hpp", ".hxx", ".cs", ".swift", ".sh", ".bash", ".zsh", ".fish", ".ps1", ".bat", ".cmd", ".env", ".ini", ".cfg", ".conf", ".config", ".properties", ".sql", ".graphql", ".gql", ".proto", ".vue", ".svelte", ".astro", ".ejs", ".hbs", ".pug", ".jade", ".php", ".pl", ".pm", ".lua", ".r", ".R", ".dart", ".ex", ".exs", ".erl", ".hrl", ".clj", ".cljs", ".cljc", ".edn", ".hs", ".lhs", ".elm", ".ml", ".mli", ".f", ".f90", ".f95", ".for", ".cmake", ".make", ".makefile", ".gradle", ".sbt", ".rst", ".adoc", ".asciidoc", ".org", ".tex", ".latex", ".lock", ".log", ".diff", ".patch"]);
    getMemoryFiles = TEr(async (e = false) => {
      if (va()) {
        return [];
      }
      let t = Date.now();
      wn("info", "memory_files_started");
      let n = [];
      let r = new Set();
      let o = getCurrentProjectConfig();
      let s = e || o.hasClaudeMdExternalIncludesApproved || false;
      let i = getMemoryPath("Managed");
      n.push(...(await processMemoryFile(i, "Managed", r, s)));
      let a = oDs();
      if (a) {
        n.push({
          path: "<policyHelper>",
          type: "Managed",
          content: a,
          globs: [],
          contentDiffersFromDisk: true,
          rawContent: a
        });
      }
      let l = getSettingsForSource("policySettings")?.claudeMd;
      if (l) {
        n.push({
          path: "<managed-settings>",
          type: "Managed",
          content: l,
          globs: [],
          contentDiffersFromDisk: true,
          rawContent: l
        });
      }
      let c = getManagedClaudeRulesDir();
      if (n.push(...(await processMdRules({
        rulesDir: c,
        type: "Managed",
        processedPaths: r,
        includeExternal: s,
        conditionalRule: false
      }))), qf("userSettings")) {
        let _ = getMemoryPath("User");
        n.push(...(await processMemoryFile(_, "User", r, true)));
        let b = getUserClaudeRulesDir();
        n.push(...(await processMdRules({
          rulesDir: b,
          type: "User",
          processedPaths: r,
          includeExternal: true,
          conditionalRule: false
        })));
      }
      let u = [];
      let d = getOriginalCwd();
      let p = d;
      while (p !== $m.parse(p).root) {
        u.push(p);
        p = $m.dirname(p);
      }
      let m = findGitRoot(d);
      let f = findCanonicalGitRoot(d);
      let h = m !== null && f !== null && yC(m) !== yC(f) && pathInWorkingPath(m, f);
      for (let _ of u.reverse()) {
        let b = h && pathInWorkingPath(_, f) && !pathInWorkingPath(_, m);
        if (qf("projectSettings") && !b) {
          let S = $m.join(_, "CLAUDE.md");
          n.push(...(await processMemoryFile(S, "Project", r, s)));
          let E = $m.join(_, ".claude", "CLAUDE.md");
          n.push(...(await processMemoryFile(E, "Project", r, s)));
          let C = $m.join(_, ".claude", "rules");
          n.push(...(await processMdRules({
            rulesDir: C,
            type: "Project",
            processedPaths: r,
            includeExternal: s,
            conditionalRule: false
          })));
        }
        if (qf("localSettings")) {
          let S = $m.join(_, "CLAUDE.local.md");
          n.push(...(await processMemoryFile(S, "Local", r, s)));
        }
      }
      if (st(process.env.CLAUDE_CODE_ADDITIONAL_DIRECTORIES_CLAUDE_MD)) {
        let _ = getAdditionalDirectoriesForClaudeMd();
        for (let b of _) {
          let S = $m.join(b, "CLAUDE.md");
          n.push(...(await processMemoryFile(S, "Project", r, s)));
          let E = $m.join(b, ".claude", "CLAUDE.md");
          n.push(...(await processMemoryFile(E, "Project", r, s)));
          let C = $m.join(b, ".claude", "rules");
          if (n.push(...(await processMdRules({
            rulesDir: C,
            type: "Project",
            processedPaths: r,
            includeExternal: s,
            conditionalRule: false
          }))), qf("localSettings")) {
            let x = $m.join(b, "CLAUDE.local.md");
            n.push(...(await processMemoryFile(x, "Local", r, s)));
          }
        }
      }
      if (Vd()) {
        let _ = process.env.CLAUDE_COWORK_MEMORY_INDEX_CONTENT;
        if (_ !== "") {
          let b = _ !== undefined ? I_p(_) : (await Pma(Obe(), "AutoMem")).info;
          if (b) {
            let S = yC(b.path);
            if (!r.vZc(S)) {
              r.add(S);
              n.push(b);
            }
          }
        }
      }
      let g = n.reduce((_, b) => _ + b.content.length, 0);
      wn("info", "memory_files_completed", {
        duration_ms: Date.now() - t,
        file_count: n.length,
        total_content_length: g
      });
      let y = {};
      for (let _ of n) {
        y[_.type] = (y[_.type] ?? 0) + 1;
      }
      if (!wma) {
        wma = true;
        logEvent("tengu_claudemd__initial_load", {
          file_count: n.length,
          total_content_length: g,
          user_count: y.User ?? 0,
          project_count: y.Project ?? 0,
          local_count: y.Local ?? 0,
          managed_count: y.Managed ?? 0,
          automem_count: y.AutoMem ?? 0,
          duration_ms: Date.now() - t
        });
      }
      if (!e) {
        let _ = L_p();
        if (_ !== undefined && hasInstructionsLoadedHook()) {
          for (let b of n) {
            if (!Oma(b.type)) {
              continue;
            }
            if (isSyntheticMemoryPath(b.path)) {
              continue;
            }
            let S = b.parent ? "include" : _;
            executeInstructionsLoadedHooks(b.path, b.type, S, {
              globs: b.globs,
              parentFilePath: b.parent
            });
          }
        }
      }
      return n;
    });
  });
  function b4t() {
    let e = process.env.CLAUDE_CODE_DISABLE_GIT_INSTRUCTIONS;
    if (st(e)) {
      return false;
    }
    if (Pl(e)) {
      return true;
    }
    return getInitialSettings().includeGitInstructions ?? true;
  }
  var juo = __lazy(() => {
    gn();
  });
  function quo() {
    return cT() !== null;
  }
  function M9e() {
    return quo();
  }
  async function N9e(e, t, n, r) {
    let o = await _s.post("/v2/ccr-sessions/-/chat-project", {
      op: e,
      ...t
    }, {
      auth: "session-jwt",
      timeout: 30000,
      validateStatus: () => true,
      signal: r
    });
    if (o.ok && o.status >= 300) {
      throw new Kdt(n, o.status, B_p(o.data));
    }
    return gTe(o, n);
  }
  function B_p(e) {
    return e !== null && typeof e === "object" && "error" in e && typeof e.error === "string" ? e.error : e;
  }
  function pDe(e) {
    return {
      auth: "teleport-org",
      timeout: 30000,
      headers: {
        "anthropic-beta": "oauth-2025-04-20"
      },
      validateStatus: () => true,
      signal: e
    };
  }
  function mDe(e, t) {
    return `/api/organizations/:orgUUID/projects/${encodeURIComponent(e)}${t}`;
  }
  async function fDe(e, t) {
    if (M9e()) {
      return N9e("detail", {}, "get project detail", t);
    }
    let n = await _s.get(mDe(e, "/detail"), pDe(t));
    return gTe(n, "get project detail");
  }
  async function Fma(e, t) {
    if (M9e()) {
      return N9e("kb-stats", {}, "get knowledge stats", t);
    }
    let n = await _s.get(mDe(e, "/kb/stats"), pDe(t));
    return gTe(n, "get knowledge stats");
  }
  async function Uma(e, t, n) {
    if (M9e()) {
      return N9e("read-doc", {
        doc_uuid: t
      }, "read doc", n);
    }
    let r = await _s.get(mDe(e, `/docs/${encodeURIComponent(t)}`), pDe(n));
    return gTe(r, "read doc");
  }
  async function Bma(e, t, n) {
    if (M9e()) {
      return N9e("read-file", {
        file_uuid: t
      }, "read file", n);
    }
    let r = await _s.get(mDe(e, `/files/${encodeURIComponent(t)}/extracted`), pDe(n));
    return gTe(r, "read file");
  }
  async function Wuo(e, t, n, r) {
    if (M9e()) {
      return N9e("write-doc", {
        file_name: t,
        content: n
      }, "create doc", r);
    }
    let o = await _s.post(mDe(e, "/docs"), {
      file_name: t,
      content: n
    }, pDe(r));
    return gTe(o, "create doc");
  }
  async function $ma(e, t, n, r) {
    let o = await _s.patch(mDe(e, `/docs/${encodeURIComponent(t)}`), {
      content: n
    }, pDe(r));
    return gTe(o, "update doc");
  }
  async function Guo(e, t, n) {
    if (M9e()) {
      await N9e("delete-doc", {
        doc_uuid: t
      }, "delete doc", n);
      return;
    }
    let r = await _s.delete(mDe(e, `/docs/${encodeURIComponent(t)}`), undefined, pDe(n));
    gTe(r, "delete doc");
  }
  async function Hma(e, t, n, r) {
    if (M9e()) {
      return Nma(await N9e("kb-search", {
        query: t,
        n
      }, "search knowledge base", r));
    }
    let o = await _s.get(mDe(e, `/kb/search?query=${encodeURIComponent(t)}&n=${n}`), pDe(r));
    return Nma(gTe(o, "search knowledge base"));
  }
  function Nma(e) {
    if (typeof e === "string") {
      try {
        return qt(e);
      } catch {
        return e;
      }
    }
    return e;
  }
  function jma(e, t) {
    if (!t) {
      return e;
    }
    return e.split(t).join("[redacted-oauth-token]");
  }
  function gTe(e, t) {
    if (!e.ok) {
      throw new Kdt(t, 0, e.reason === "no-auth" ? e.detail : e.reason);
    }
    if (e.status < 200 || e.status >= 300) {
      throw new Kdt(t, e.status, e.data);
    }
    return e.data;
  }
  function $_p(e) {
    if (e == null) {
      return "";
    }
    if (typeof e === "string") {
      return e ? `: ${e.slice(0, 200)}` : "";
    }
    try {
      return `: ${De(e).slice(0, 200)}`;
    } catch {
      return `: ${String(e).slice(0, 200)}`;
    }
  }
  var Kdt;
  var Vuo = __lazy(() => {
    Uc();
    bg();
    e1();
    Kdt = class Kdt extends Error {
      action;
      status;
      body;
      constructor(e, t, n) {
        super(`Projects API: ${e} failed (HTTP ${t})${$_p(n)}`);
        this.action = e;
        this.status = t;
        this.body = n;
        this.name = "ProjectsApiError";
      }
    };
  });
  async function Q2n() {
    if (!isPolicyAllowed("allow_projects_tool")) {
      return {
        ok: false,
        reason: "policy_disabled"
      };
    }
    if (!isFirstPartyProvider()) {
      return {
        ok: false,
        reason: "wrong_provider"
      };
    }
    if (Vi()) {
      return {
        ok: false,
        reason: "essential_traffic_only"
      };
    }
    let e = cT();
    if (e) {
      return {
        ok: true,
        accessToken: e,
        expanded: false
      };
    }
    await checkAndRefreshOAuthTokenIfNeeded();
    let t = getClaudeAIOAuthTokens();
    if (!t?.accessToken) {
      return {
        ok: false,
        reason: "no_token"
      };
    }
    if (zuo(t.scopes)) {
      return {
        ok: true,
        accessToken: t.accessToken,
        expanded: false
      };
    }
    if (!t.refreshToken) {
      return {
        ok: false,
        reason: "no_refresh"
      };
    }
    try {
      return await withOAuthRefreshLock(async ({
        lockedTokens: n
      }) => {
        if (!n?.refreshToken) {
          return {
            ok: false,
            reason: "no_refresh"
          };
        }
        if (zuo(n.scopes) && n.accessToken) {
          return {
            ok: true,
            accessToken: n.accessToken,
            expanded: false
          };
        }
        let r = await refreshOAuthToken(n.refreshToken, {
          clientId: n.clientId,
          scopes: Ro([...CLAUDE_AI_OAUTH_SCOPES, ...preservableScopesFrom(n.scopes), "user:projects:read", "user:projects:write"])
        });
        if (await saveOAuthTokensIfNeeded(r), !zuo(r.scopes)) {
          return {
            ok: false,
            reason: "expand_failed",
            detail: "refresh succeeded but projects scopes not granted"
          };
        }
        return {
          ok: true,
          accessToken: r.accessToken,
          expanded: true
        };
      });
    } catch (n) {
      return {
        ok: false,
        reason: "expand_failed",
        detail: he(n)
      };
    }
  }
  function zuo(e) {
    return !!e && e.includes("user:projects:read") && e.includes("user:projects:write");
  }
  var Kuo = __lazy(() => {
    Uc();
    qP();
    Kc();
    no();
    dt();
    Ds();
    Wd();
    e1();
  });
  var Jma = {};
  __export(Jma, {
    safeInline: () => safeInline,
    getProjectContextBlock: () => getProjectContextBlock,
    formatProjectContext: () => formatProjectContext,
    describeSyncSource: () => describeSyncSource
  });
  async function getProjectContextBlock() {
    let e = process.env.CLAUDE_PROJECT_UUID?.trim();
    if (!e) {
      return null;
    }
    try {
      return await withTimeout(W_p(e), 5000, "project context fetch timed out");
    } catch (t) {
      logForDebugging(`project context fetch failed: ${he(t)}`, {
        level: "warn"
      });
      return null;
    }
  }
  async function W_p(e) {
    let t = await Q2n();
    if (!t.ok) {
      logForDebugging(`project context skipped: ${t.reason}`, {
        level: "verbose"
      });
      return null;
    }
    return formatProjectContext(await fDe(e));
  }
  function safeInline(e) {
    return e.replace(/[\r\n]+/g, " ").replace(/`/g, "'");
  }
  function Gma(e) {
    let t = e.slice(0, 50);
    let n = e.length - t.length;
    return t.join(`
`) + (n > 0 ? `
- \u2026 and ${n} more \u2014 call \`project_info\` for the full list` : "");
  }
  function describeSyncSource(e) {
    let t = H_p[e.type ?? ""] ?? safeInline(e.type ?? "source");
    let n = safeInline(De(e.config));
    let r = [...n];
    let o = r.length > 200 ? `${r.slice(0, 200).join("")}\u2026` : n;
    return `${t}: \`${o}\``;
  }
  function formatProjectContext(e) {
    let t = e.documents.map(a => a.file_name).filter(a => a !== null);
    let n = (e.files ?? []).filter(a => a.file_name !== null);
    let r = e.sync_sources ?? [];
    let o = r.slice(0, 50);
    let s = r.length - o.length;
    let i = o.map(a => `- ${describeSyncSource(a)}`).join(`
`) + (s > 0 ? `
- \u2026 and ${s} more \u2014 call \`project_info\` for the full list` : "");
    return [`This session is attached to the Project **"${safeInline(e.name)}"**.`, "", ...(e.description ? ["## Project description", e.description, ""] : []), ...(e.prompt_template ? ["## Project instructions", e.prompt_template, ""] : []), `## Project docs (${t.length})`, Gma(t.map(a => `- \`${safeInline(a)}\``)) || "(none yet)", "", ...(n.length > 0 ? [`## Project files (${n.length})`, Gma(n.map(a => `- \`${safeInline(a.file_name)}\` (${safeInline(a.file_kind)})`)), ""] : []), ...(r.length > 0 ? [`## Synced sources (${r.length})`, i, "These are synced automatically \u2014 use the matching connector tool (Google Drive, GitHub, etc.) to read them.", ""] : []), "## When to use the Projects tool", "- **Before answering questions about anything in the doc list above**, read or search the relevant doc with `project_read` or `project_search`. Do not Glob/Grep the local filesystem for these \u2014 they live in the project, not on disk.", "- **When you produce something durable and relevant to this project** \u2014 a new doc, an update to an existing one, a captured decision or finding the user or their team would look for here later \u2014 write it to the project with `project_write`. The project is what they see across Claude products. Be selective: write things that belong alongside the existing docs, not every artifact or note.", "- **To edit a project doc**, `project_read` it, make the change, and `project_write` the full updated content back to the same path. There is no in-place patch.", "- **You don't have to use the project for everything.** If the request is unrelated to it, answer normally without reading or writing the project."].join(`
`);
  }
  var H_p;
  var Yuo = __lazy(() => {
    je();
    dt();
    Vuo();
    Kuo();
    H_p = {
      gdrive: "Google Drive",
      github: "GitHub",
      outlin: "Outline",
      mcpres: "MCP resource"
    };
  });
  var G_p;
  var Xuo = () => getSessionId();
  var Quo;
  var Tv;
  var iE;
  var LG = __lazy(() => {
    at();
    v9e();
    ln();
    no();
    bx();
    wb();
    je();
    Zm();
    gn();
    dt();
    ji();
    na();
    juo();
    Jf();
    G_p = (Yuo(), __toCommonJS(Jma)).getProjectContextBlock;
    Quo = TEr(async () => {
      let e = Date.now();
      wn("info", "git_status_started");
      let t = Date.now();
      let n = await getIsGit();
      if (wn("info", "git_is_git_check_completed", {
        duration_ms: Date.now() - t,
        is_git: n
      }), !n) {
        wn("info", "git_status_skipped_not_git", {
          duration_ms: Date.now() - e
        });
        Pe("context_git_detect");
        return null;
      }
      try {
        let r = Date.now();
        let [o, s, i, a, l] = await Promise.all([getBranch(), getDefaultBranch(), execFileNoThrow(gitExe(), ["--no-optional-locks", "status", "--short"], {
          preserveOutputOnError: false
        }).then(({
          stdout: d
        }) => d.trim()), execFileNoThrow(gitExe(), ["--no-optional-locks", "log", "--oneline", "-n", "5"], {
          preserveOutputOnError: false
        }).then(({
          stdout: d
        }) => d.trim()), execFileNoThrow(gitExe(), ["config", "user.name"], {
          preserveOutputOnError: false
        }).then(({
          stdout: d
        }) => d.trim())]);
        wn("info", "git_commands_completed", {
          duration_ms: Date.now() - r,
          status_length: i.length
        });
        let c = Pu() ? "Bash" : "PowerShell";
        let u = i.length > 2000 ? i.substring(0, 2000) + `
... (truncated because it exceeds 2k characters. If you need more information, run "git status" using ${c})` : i;
        wn("info", "git_status_completed", {
          duration_ms: Date.now() - e,
          truncated: i.length > 2000
        });
        Pe("context_git_detect");
        return ["This is the git status at the start of the conversation. Note that this status is a snapshot in time, and will not update during the conversation.", `Current branch: ${o}`, `Main branch (you will usually use this for PRs): ${s}`, ...(l ? [`Git user: ${l}`] : []), `Status:
${u || "(clean)"}`, `Recent commits:
${a}`].join(`

`);
      } catch (r) {
        wn("error", "git_status_failed", {
          duration_ms: Date.now() - e
        });
        Et("context_git_detect", "git_cmd_failed");
        logForDebugging(`Failed to get git status for system context: ${he(r)}`, {
          level: "error"
        });
        return null;
      }
    }, Xuo);
    Tv = TEr(async e => {
      let t = Date.now();
      wn("info", "system_context_started");
      let n = st(process.env.CLAUDE_CODE_REMOTE) || !b4t() ? null : await Quo();
      wn("info", "system_context_completed", {
        duration_ms: Date.now() - t,
        has_git_status: n !== null,
        has_injection: e !== undefined
      });
      return {
        ...(n && {
          gitStatus: n
        }),
        ...(st(process.env.CLAUDE_CODE_PERFORCE_MODE) && {
          perforceMode: `This is a Perforce workspace. Files not yet opened for edit are read-only; if a file is read-only, run \`p4 edit <file>\` via ${Pu() ? "Bash" : "PowerShell"} to check it out before modifying. Files that are already writable have been opened and can be edited directly.`
        }),
        ...{}
      };
    }, e => `${Xuo()}\x00${e ?? ""}`);
    if (!(Tv.cache instanceof Map)) {
      Tv.cache = new Map();
    }
    iE = TEr(async () => {
      let e = Date.now();
      wn("info", "user_context_started");
      let t = Qce();
      let n = t ? null : getClaudeMds(filterInjectedMemoryFiles(await getMemoryFiles()));
      if (!t) {
        Pe("context_claude_md_load");
      }
      setCachedClaudeMdContent(n || null);
      let r = process.env.ANTHROPIC_UNIX_SOCKET ? undefined : getOauthAccountInfo()?.emailAddress;
      let o = await G_p();
      wn("info", "user_context_completed", {
        duration_ms: Date.now() - e,
        claudemd_length: n?.length ?? 0,
        claudemd_disabled: Boolean(t),
        has_user_email: Boolean(r),
        has_project_context: Boolean(o)
      });
      return {
        ...(n && {
          claudeMd: n
        }),
        ...(r && {
          userEmail: `The user's email address is ${r}.`
        }),
        ...(o && {
          attachedProject: o
        }),
        currentDate: `Today's date is ${fTe()}.`
      };
    }, Xuo);
  });
  var Hq;
  var hDe = __lazy(() => {
    Hq = class Hq {
      returned;
      queue = [];
      readResolve;
      readReject;
      isDone = false;
      hasError;
      started = false;
      constructor(e) {
        this.returned = e;
      }
      [Symbol.asyncIterator]() {
        if (this.started) {
          throw Error("Stream can only be iterated once");
        }
        this.started = true;
        return this;
      }
      next() {
        if (this.queue.length > 0) {
          return Promise.resolve({
            done: false,
            value: this.queue.shift()
          });
        }
        if (this.isDone) {
          return Promise.resolve({
            done: true,
            value: undefined
          });
        }
        if (this.hasError) {
          return Promise.reject(this.hasError);
        }
        return new Promise((e, t) => {
          this.readResolve = e;
          this.readReject = t;
        });
      }
      enqueue(e) {
        if (this.readResolve) {
          let t = this.readResolve;
          this.readResolve = undefined;
          this.readReject = undefined;
          t({
            done: false,
            value: e
          });
        } else {
          this.queue.push(e);
        }
      }
      done() {
        if (this.isDone = true, this.readResolve) {
          let e = this.readResolve;
          this.readResolve = undefined;
          this.readReject = undefined;
          e({
            done: true,
            value: undefined
          });
        }
      }
      error(e) {
        if (this.hasError = e, this.readReject) {
          let t = this.readReject;
          this.readResolve = undefined;
          this.readReject = undefined;
          t(e);
        }
      }
      return() {
        if (this.isDone = true, this.returned) {
          this.returned();
        }
        return Promise.resolve({
          done: true,
          value: undefined
        });
      }
    };
  });
  async function* Ydt(e, t) {
    let n = new Hq();
    let r = {
      ...t,
      onCompactEvent: a => n.enqueue(a)
    };
    let o = a => {
      n.enqueue({
        type: "notification",
        notification: a
      });
    };
    let s = a => {
      n.enqueue(a);
    };
    let i;
    e(r, o, s).then(a => {
      i = a;
      n.done();
    }, a => n.error(a));
    yield* n;
    return i;
  }
  var Xma = __lazy(() => {
    hDe();
  });
  function Z2n() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_redwood2", "") || getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_redwood3", "");
  }
  function Sx() {
    if (Me.DISABLE_COMPACT) {
      return false;
    }
    if (st(process.env.DISABLE_AUTO_COMPACT)) {
      return false;
    }
    return uc("autoCompactEnabled", true).value;
  }
  function DX() {
    if (st(process.env.CLAUDE_CODE_REMOTE)) {
      if (Qma ??= getFeatureValue_CACHED_MAY_BE_STALE("tengu_reactive_compact_remote", false), !Qma) {
        return false;
      }
    }
    return true;
  }
  function gDe(e) {
    return e !== undefined && V_p.vZc(e);
  }
  function Jdt(e) {
    if (e === "compact") {
      return true;
    }
    return false;
  }
  var Qma;
  var V_p;
  var efa = __lazy(() => {
    pr();
    gn();
    zg();
    $n();
    V_p = new Set(["prompt_suggestion", "away_summary", "agent_summary", "memdir_aki_extract"]);
  });
  function wde(e, t, n, r) {
    if (!t) {
      return {
        effective: n,
        status: "valid"
      };
    }
    let o = parseInt(t, 10);
    if (isNaN(o) || o <= 0) {
      let s = {
        effective: n,
        status: "invalid",
        message: `Invalid value "${t}" (using default: ${n})`
      };
      logForDebugging(`${e} ${s.message}`);
      return s;
    }
    if (o > r) {
      let s = {
        effective: r,
        status: "capped",
        message: `Capped from ${o} to ${r}`
      };
      logForDebugging(`${e} ${s.message}`);
      return s;
    }
    return {
      effective: o,
      status: "valid"
    };
  }
  var Xdt = __lazy(() => {
    je();
  });
  function tfa(e) {
    return typeof e === "number" && Number.isFinite(e) && e >= 0 && e < 1 ? e : null;
  }
  function z_p(e) {
    if (typeof e !== "object" || e === null) {
      return null;
    }
    let t = e;
    let n = tfa(t.repl);
    let r = tfa(t.sdk);
    return n === null || r === null ? null : {
      repl: n,
      sdk: r
    };
  }
  function ofa(e) {
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return null;
    }
    let t = [];
    let n = null;
    for (let [r, o] of Object.entries(e)) {
      let s = z_p(o);
      if (s === null) {
        return null;
      }
      if (r === "default") {
        n = s;
        continue;
      }
      let i = Number(r);
      if (!Number.isSafeInteger(i) || i <= 0) {
        return null;
      }
      t.push({
        windowSize: i,
        ...s
      });
    }
    if (t.length === 0 && n === null) {
      return null;
    }
    return {
      entries: t,
      defaultEntry: n
    };
  }
  function sfa(e, t) {
    let n = e.entries.find(r => r.windowSize === t);
    if (n !== undefined) {
      return {
        kind: "exact",
        entry: n
      };
    }
    return e.defaultEntry === null ? null : {
      kind: "default",
      entry: e.defaultEntry
    };
  }
  function e$n(e, t) {
    let n = e - 13000;
    let r = t.testPctOverride;
    if (r !== undefined && !isNaN(r) && r > 0 && r <= 100) {
      return Math.min(Math.floor(e * (r / 100)), n);
    }
    return n;
  }
  function edo(e, t) {
    return Math.min(e - Math.round(e * t.precomputeBufferFraction), e$n(e, t));
  }
  function ifa(e, t, n, r = t) {
    let o = e$n(t, n);
    let s = n.enabled ? o : t;
    let i = s - 20000;
    let a = n.testBlockingOverride;
    let l = a !== undefined && !isNaN(a) && a > 0 ? a : r - 3000;
    let c = Math.max(0, Math.round((s - e) / s * 100));
    if (e >= l) {
      return {
        level: "blocked",
        pctLeft: c
      };
    }
    if (n.enabled && e >= o) {
      return {
        level: "compact",
        pctLeft: c
      };
    }
    if (e >= i) {
      return {
        level: "warn",
        pctLeft: c
      };
    }
    return {
      level: "ok"
    };
  }
  var tdo = () => {};
  function odo(e) {
    let t = e.trim().toLowerCase();
    if (t === "auto") {
      return "auto";
    }
    let n;
    if (t.endsWith("m")) {
      n = parseFloat(t) * 1e6;
    } else if (t.endsWith("k")) {
      n = parseFloat(t) * 1000;
    } else {
      let r = parseInt(t, 10);
      n = r >= 100 && r <= 1000 ? r * 1000 : r;
    }
    if (!Number.isFinite(n) || n < 1e5 || n > 1e6) {
      return;
    }
    return Math.round(n);
  }
  function sdo(e) {
    if (!Sx()) {
      return;
    }
    if (getIsNonInteractiveSession()) {
      return;
    }
    if (e !== "claude-opus-4-8") {
      return;
    }
    let t = Z2n();
    if (!t) {
      return;
    }
    let n = odo(t);
    return typeof n === "number" ? n : undefined;
  }
  function lfa(e, t) {
    if (t && Object.hasOwn(e, t)) {
      return e[t];
    }
    return e.default;
  }
  function dfa(e) {
    if (typeof e === "number") {
      return e;
    }
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return;
    }
    let {
      surfaces: t,
      ...n
    } = e;
    let r = getSubscriptionType();
    let o = Me.CLAUDE_CODE_ENTRYPOINT;
    let s = o && t && Object.hasOwn(t, o) ? t[o] : undefined;
    if (s) {
      let i = lfa(s, r);
      if (i !== undefined) {
        return i;
      }
    }
    return lfa(n, r);
  }
  function K_p(e) {
    if (!Sx()) {
      return;
    }
    if (!Object.hasOwn(afa, e)) {
      return;
    }
    return dfa(afa[e]);
  }
  function J_p(e) {
    if (!Sx()) {
      return {
        window: null,
        replacesDefault: false
      };
    }
    let t = s => typeof s === "number" && Number.isInteger(s) && s >= 1e5 && s <= 1e6 ? s : null;
    let n = s => {
      if (typeof s !== "object" || s === null || Array.isArray(s)) {
        return {
          window: null,
          present: false
        };
      }
      if (!Object.hasOwn(s, e)) {
        return {
          window: null,
          present: false
        };
      }
      return {
        window: t(dfa(s[e])),
        present: true
      };
    };
    let r = n(WPi()?.rowan_thicket);
    let o = n(GPi());
    return {
      window: r.window ?? o.window,
      replacesDefault: o.present
    };
  }
  function jq(e, t) {
    let n = getCanonicalName(e);
    let r = getSdkBetas();
    let o = iT(e, r);
    if (process.env.CLAUDE_CODE_AUTO_COMPACT_WINDOW) {
      let l = wde("CLAUDE_CODE_AUTO_COMPACT_WINDOW", process.env.CLAUDE_CODE_AUTO_COMPACT_WINDOW, 1e5, 1e6);
      if (l.status !== "invalid") {
        let c = Math.max(1e5, l.effective);
        return {
          window: Math.min(o, c),
          configured: c,
          source: "env"
        };
      }
    }
    if (t !== undefined) {
      return {
        window: Math.min(o, t),
        configured: t,
        source: "settings"
      };
    }
    let s = J_p(n);
    if (s.window !== null) {
      return {
        window: Math.min(o, s.window),
        configured: s.window,
        source: "clientdata"
      };
    }
    let i = sdo(n);
    if (i !== undefined) {
      return {
        window: Math.min(o, i),
        configured: i,
        source: "experiment"
      };
    }
    if (o < 1e6 && (Y_p.vZc(n) || g7r(e, r))) {
      return {
        window: Math.min(o, 200000),
        configured: 200000,
        source: "model-default"
      };
    }
    let a = s.replacesDefault ? undefined : K_p(n);
    if (a !== undefined) {
      return {
        window: Math.min(o, a),
        configured: a,
        source: "model-default"
      };
    }
    return {
      window: o,
      configured: o,
      source: "auto"
    };
  }
  function yDe(e, t) {
    return jq(e, t).source !== "auto";
  }
  function n$n(e, t) {
    return jq(e, t).source;
  }
  function coe(e, t) {
    let n = Math.min(r$n(e), 20000);
    let r = Sx() ? t : undefined;
    let {
      window: o
    } = jq(e, r);
    return o - n;
  }
  function X_p(e) {
    let t = Math.min(r$n(e), 20000);
    return iT(e, getSdkBetas()) - t;
  }
  function Z_p(e) {
    if (cfa) {
      return;
    }
    cfa = true;
    logEvent("tengu_precompute_arm_table_malformed", {
      payloadType: e
    });
  }
  function ndo() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_rokovoko", 0.2);
    return typeof e === "number" && Number.isFinite(e) && e >= 0 && e < 1 ? e : 0.2;
  }
  function ido(e, t, n) {
    let r = getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_moleskin", null);
    if (r === null || r === undefined) {
      return {
        fraction: ndo(),
        source: "scalar"
      };
    }
    let o = ofa(r);
    if (o === null) {
      Z_p(Array.isArray(r) ? "array" : typeof r);
      return {
        fraction: ndo(),
        source: "malformed"
      };
    }
    let s = Sx() ? t : undefined;
    let {
      window: i
    } = jq(e, s);
    let a = sfa(o, i);
    if (a === null) {
      return {
        fraction: ndo(),
        source: "table_no_match"
      };
    }
    let l = n === "sdk" ? "sdk" : "repl";
    let c = a.entry[l];
    return a.kind === "exact" ? {
      fraction: c,
      source: "table_exact",
      matchedWindowKey: a.entry.windowSize
    } : {
      fraction: c,
      source: "table_default"
    };
  }
  function ebp(e, t, n) {
    return ido(e, t, n).fraction;
  }
  function ado(e, t, n) {
    let r = process.env.CLAUDE_AUTOCOMPACT_PCT_OVERRIDE;
    let o = process.env.CLAUDE_CODE_BLOCKING_LIMIT_OVERRIDE;
    return {
      enabled: Sx(),
      precomputeBufferFraction: ebp(e, t, n),
      testPctOverride: r ? parseFloat(r) : undefined,
      testBlockingOverride: o ? parseInt(o, 10) : undefined
    };
  }
  function S4t(e, t) {
    return e$n(coe(e, t), ado(e, t));
  }
  function _De(e, t, n) {
    let r = ado(t, n);
    let o = r.enabled ? n : undefined;
    return ifa(e, coe(t, o), r, X_p(t));
  }
  function pfa(e, t, n, r) {
    let o = ado(t, n, r);
    let s = o.enabled ? n : undefined;
    let i = coe(t, s);
    if (!yDe(t, n)) {
      return e >= edo(i, o);
    }
    let {
      window: a
    } = jq(t, s);
    if (a < 200000) {
      return false;
    }
    return e >= edo(i, o);
  }
  var afa;
  var Y_p;
  var cfa = false;
  var ldo = __lazy(() => {
    at();
    no();
    VT();
    pr();
    Xdt();
    Eo();
    $n();
    Ot();
    aE();
    d$();
    tdo();
    afa = {
      "claude-sonnet-5": {
        surfaces: {
          remote_cowork: {
            default: 500000
          },
          "local-agent": {
            default: 500000
          }
        },
        default: 967000
      }
    };
    Y_p = new Set(["claude-sonnet-4-6", "claude-opus-4-6"]);
  });
  function tbp(e) {
    return e?.compacted === true && e.turnCounter < 3 ? (e?.consecutiveRapidRefills ?? 0) + 1 : 0;
  }
  function o$n(e) {
    let t = tbp(e);
    return {
      action: t >= 3 ? "trip" : "proceed",
      consecutiveRapidRefills: t
    };
  }
  function cdo(e, t) {
    return {
      compacted: true,
      turnId: e,
      turnCounter: 0,
      consecutiveFailures: 0,
      consecutiveRapidRefills: t
    };
  }
  var hdo = {};