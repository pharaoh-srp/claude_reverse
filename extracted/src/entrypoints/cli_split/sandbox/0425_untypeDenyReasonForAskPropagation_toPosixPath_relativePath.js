  __export(bpa, {
    untypeDenyReasonForAskPropagation: () => untypeDenyReasonForAskPropagation,
    toPosixPath: () => toPosixPath,
    relativePath: () => relativePath,
    patternWithRoot: () => patternWithRoot,
    pathInWorkingPath: () => pathInWorkingPath,
    pathInAllowedWorkingPath: () => pathInAllowedWorkingPath,
    normalizeTrustedSymlink: () => normalizeTrustedSymlink,
    normalizePatternsToPath: () => normalizePatternsToPath,
    normalizeCaseForComparison: () => normalizeCaseForComparison,
    matchingRuleForInput: () => matchingRuleForInput,
    matchingAllowRuleForAllPaths: () => matchingAllowRuleForAllPaths,
    matchesPathRule: () => matchesPathRule,
    isUntrustedUncPath: () => isUntrustedUncPath,
    isScratchpadEnabled: () => isScratchpadEnabled,
    isScratchpadDisplayPath: () => isScratchpadDisplayPath,
    isClaudeSettingsPath: () => isClaudeSettingsPath,
    getScratchpadDir: () => getScratchpadDir,
    getResolvedWorkingDirPaths: () => getResolvedWorkingDirPaths,
    getProjectTempDir: () => getProjectTempDir,
    getFileReadIgnorePatterns: () => getFileReadIgnorePatterns,
    getClaudeTempDirName: () => getClaudeTempDirName,
    getClaudeTempDir: () => getClaudeTempDir,
    getClaudeSkillScope: () => getClaudeSkillScope,
    getChildProcessTmpDir: () => getChildProcessTmpDir,
    getBundledSkillsRoot: () => getBundledSkillsRoot,
    generateSuggestions: () => generateSuggestions,
    ensureScratchpadDir: () => ensureScratchpadDir,
    checkWritePermissionForTool: () => checkWritePermissionForTool,
    checkReadableInternalPath: () => checkReadableInternalPath,
    checkReadPermissionForTool: () => checkReadPermissionForTool,
    checkReadNetworkPathSafety: () => checkReadNetworkPathSafety,
    checkPathSafetyForAutoEdit: () => checkPathSafetyForAutoEdit,
    checkEditableInternalPath: () => checkEditableInternalPath,
    allWorkingDirectories: () => allWorkingDirectories,
    DANGEROUS_FILES_LC: () => DANGEROUS_FILES_LC,
    DANGEROUS_FILES: () => DANGEROUS_FILES,
    DANGEROUS_DIRECTORY_PATHS: () => DANGEROUS_DIRECTORY_PATHS,
    DANGEROUS_DIRECTORIES: () => DANGEROUS_DIRECTORIES
  });
  function normalizeCaseForComparison(e) {
    return e.toLowerCase().replace(/\u0131/g, "i").replace(/\u017f/g, "s");
  }
  function getClaudeSkillScope(e) {
    let t = us(e);
    let n = normalizeCaseForComparison(t);
    let r = [{
      dir: us(El.join(getOriginalCwd(), ".claude", "skills")),
      prefix: "/.claude/skills/"
    }, {
      dir: us(El.join(onn.homedir(), ".claude", "skills")),
      prefix: "~/.claude/skills/"
    }];
    for (let {
      dir: o,
      prefix: s
    } of r) {
      let i = normalizeCaseForComparison(o);
      for (let a of [El.sep, "/"]) {
        if (n.startsWith(i + a.toLowerCase())) {
          let l = t.slice(o.length + a.length);
          let c = l.indexOf("/");
          let u = El.sep === "\\" ? l.indexOf("\\") : -1;
          let d = c === -1 ? u : u === -1 ? c : Math.min(c, u);
          if (d <= 0) {
            return null;
          }
          let p = l.slice(0, d);
          if (!p || p === "." || p.includes("..")) {
            return null;
          }
          if (/[*?[\]]/.test(p) || p.includes("\\")) {
            return null;
          }
          let m = l.slice(d + 1).split(/[/\\]/);
          if (vJ(p) === ".claude" || m.some(f => vJ(f) === ".claude")) {
            return null;
          }
          return {
            skillName: p,
            pattern: s + p + "/**"
          };
        }
      }
    }
    return null;
  }
  function relativePath(e, t) {
    if (Wt() === "windows") {
      let n = UD(e);
      let r = UD(t);
      return El.posix.relative(n, r);
    }
    return El.posix.relative(e, t);
  }
  function toPosixPath(e) {
    if (Wt() === "windows") {
      return UD(e);
    }
    return e;
  }
  function vpf() {
    let e = bC.map(t => getSettingsFilePathForSource(t)).filter(t => t !== undefined);
    if (Wt() === "wsl" && Gte()) {
      e.push(El.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.json"));
    }
    return e;
  }
  function isClaudeSettingsPath(e) {
    let t = us(e);
    let n = normalizeCaseForComparison(t);
    if (n.endsWith(`${El.sep}.claude${El.sep}settings.json`) || n.endsWith(`${El.sep}.claude${El.sep}settings.local.json`)) {
      return true;
    }
    return vpf().some(r => normalizeCaseForComparison(r) === n);
  }
  function wpf(e) {
    if (isClaudeSettingsPath(e)) {
      return true;
    }
    let t = El.join(getOriginalCwd(), ".claude", "commands");
    let n = El.join(getOriginalCwd(), ".claude", "agents");
    let r = El.join(getOriginalCwd(), ".claude", "skills");
    return pathInWorkingPath(e, t) || pathInWorkingPath(e, n) || pathInWorkingPath(e, r);
  }
  function $mc(e) {
    let t = peekPlanSlug();
    if (!t) {
      return false;
    }
    let n = El.normalize(e);
    if (El.dirname(n) !== El.normalize(getPlansDirectory())) {
      return false;
    }
    let r = El.basename(n);
    return r === `${t}.md` || r.startsWith(`${t}-agent-`) && r.endsWith(".md");
  }
  function Cpf(e) {
    let t = El.normalize(e);
    return t.startsWith(ZDn()) && t.endsWith(".js");
  }
  function Rpf(e) {
    let t = ty(Nt());
    let n = El.normalize(e);
    return n === t || n.startsWith(t + El.sep);
  }
  function isScratchpadEnabled() {
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_scratch", false)) {
      return true;
    }
    {
      M1();
      let {
        isArtifactToolEligible: e
      } = __toCommonJS(U2n);
      return e();
    }
    return false;
  }
  function getClaudeTempDirName() {
    if (Wt() === "windows") {
      return "claude";
    }
    return `claude-${process.getuid?.() ?? 0}`;
  }
  function getProjectTempDir() {
    return El.join(getClaudeTempDir(), $T(getOriginalCwd())) + El.sep;
  }
  function getScratchpadDir() {
    return kpf(getSessionId());
  }
  async function ensureScratchpadDir() {
    if (!isScratchpadEnabled()) {
      return null;
    }
    let e = getScratchpadDir();
    if (e === null) {
      return null;
    }
    await zt().mkdir(e, {
      mode: 448
    });
    return e;
  }
  function Hmc(e) {
    if (!isScratchpadEnabled()) {
      return null;
    }
    let t = getScratchpadDir();
    if (t === null) {
      return null;
    }
    let n = normalizeCaseForComparison(El.normalize(e));
    let r = normalizeCaseForComparison(t);
    return {
      comparePath: n,
      compareDir: r,
      prefix: r + El.sep
    };
  }
  function jmc(e) {
    let t = Hmc(e);
    if (t === null) {
      return false;
    }
    return t.comparePath === t.compareDir || t.comparePath.startsWith(t.prefix) && !OIe(t.comparePath, t.prefix, DANGEROUS_FILES_LC);
  }
  function isScratchpadDisplayPath(e) {
    let t = Hmc(e);
    return t !== null && t.comparePath.startsWith(t.prefix) && !OIe(t.comparePath, t.prefix, DANGEROUS_FILES_LC);
  }
  function qmc(e) {
    let t = normalizeCaseForComparison(El.normalize(e));
    let n = normalizeCaseForComparison(El.join(er(), "jobs") + El.sep);
    if (!t.startsWith(n)) {
      return false;
    }
    let o = t.slice(n.length).split(El.sep);
    return o.length === 2 && o[1].startsWith("adopt.json");
  }
  function fzo(e) {
    let t = Me.CLAUDE_CODE_HOST_CREDS_FILE;
    if (!t) {
      return false;
    }
    let n = normalizeCaseForComparison(El.normalize(e));
    return fg(t).some(r => normalizeCaseForComparison(El.normalize(r)) === n);
  }
  function Wmc(e) {
    if (process.env.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return false;
    }
    let t = process.env.CLAUDE_JOB_DIR;
    if (!t) {
      return false;
    }
    let n = El.join(er(), "jobs") + El.sep;
    let r = El.normalize(t);
    if (!r.startsWith(n)) {
      return false;
    }
    let o = r + El.sep + "tmp" + El.sep;
    if (!normalizeCaseForComparison(e).startsWith(normalizeCaseForComparison(o))) {
      return false;
    }
    return !OIe(e, o, DANGEROUS_FILES_LC);
  }
  function SBe(e, t) {
    if (!t || t.size === 0) {
      return false;
    }
    for (let n of t.values()) {
      for (let r of n) {
        if (Rc(e) !== Rc(r)) {
          continue;
        }
        if (pathInWorkingPath(e, r)) {
          return true;
        }
      }
    }
    return false;
  }
  function isUntrustedUncPath(e, t) {
    return Rc(e) && !Pp(e) && !SBe(e, t);
  }
  function Gmc(e) {
    let t = 0;
    for (let n of getResolvedWorkingDirPaths(getOriginalCwd())) {
      let r = us(n).split(El.sep);
      if (r.length > 1 && r.at(-1) === "") {
        r.pop();
      }
      let o = 0;
      while (o < r.length && o < e.length && (e[o] === r[o] || o === 0 && /^[a-z]:$/i.test(e[o]) && e[o].toLowerCase() === r[o].toLowerCase())) {
        o++;
      }
      if (o === r.length) {
        let s = o;
        for (let i = 0; i < o; i++) {
          if (vJ(r[i]) === ".claude" && vJ(r[i + 1] ?? "") !== "worktrees") {
            s = i;
            break;
          }
        }
        if (s > t) {
          t = s;
        }
      }
    }
    return t;
  }
  function Mmc(e) {
    let t = us(e).split(El.sep);
    let n = Gmc(t);
    let r = 0;
    for (let o = n; o < t.length; o++) {
      if (vJ(t[o]) === ".claude") {
        r++;
      }
    }
    return r;
  }
  function Apf(e, t) {
    let n = t.startsWith("~/.claude/") ? onn.homedir() : t.startsWith("/.claude/") ? getOriginalCwd() : null;
    if (n === null) {
      return false;
    }
    let r = us(El.join(n, ".claude")).split(El.sep);
    if (r.length > 1 && r.at(-1) === "") {
      r.pop();
    }
    let o = us(e).split(El.sep);
    for (let s = 0; s < r.length; s++) {
      if (o[s] !== r[s] && !(s === 0 && /^[a-z]:$/i.test(o[s] ?? "") && o[s].toLowerCase() === r[s].toLowerCase())) {
        return false;
      }
    }
    for (let s = r.length; s < o.length; s++) {
      if (vJ(o[s]) === ".claude") {
        return true;
      }
    }
    return false;
  }
  function Ipf(e, t, n) {
    let o = us(e).split(El.sep);
    let s = o.at(-1);
    if (Rc(e) && !Pp(e) && !SBe(e, n)) {
      return true;
    }
    let i = false;
    let a = Gmc(o);
    for (let l = 0; l < o.length; l++) {
      let c = o[l];
      let u = vJ(c);
      for (let d of DANGEROUS_DIRECTORIES) {
        if (u !== normalizeCaseForComparison(d)) {
          continue;
        }
        if (d === ".claude") {
          let p = l >= a;
          if (i) {
            return true;
          }
          let m = o[l + 1];
          let f = m ? vJ(m) : undefined;
          if (t && f) {
            if (f === "skills" || f === "agents" || f === "commands") {
              if (p) {
                i = true;
              }
              break;
            }
            if (f === "scheduled_tasks.json" && l + 1 === o.length - 1) {
              break;
            }
          }
          if (f === "worktrees") {
            if (p) {
              i = true;
            }
            break;
          }
        }
        return true;
      }
    }
    for (let l of DANGEROUS_DIRECTORY_PATHS) {
      let c = l.split("/");
      for (let u = 0; u + c.length <= o.length; u++) {
        if (c.every((d, p) => vJ(o[u + p]) === normalizeCaseForComparison(d))) {
          return true;
        }
      }
    }
    if (s) {
      let l = vJ(s);
      if (DANGEROUS_FILES.some(c => normalizeCaseForComparison(c) === l)) {
        return true;
      }
    }
    return false;
  }
  function Apr(e, t) {
    if (Wt() === "windows" || Wt() === "wsl") {
      if (e.indexOf(":", 2) !== -1) {
        return true;
      }
    }
    if (/~\d/.test(e)) {
      return true;
    }
    if (e.startsWith("\\\\?\\") || e.startsWith("\\\\.\\") || e.startsWith("//?/") || e.startsWith("//./")) {
      return true;
    }
    let n = e.split(/[/\\]/);
    for (let r of n) {
      if (r === "" || r === "." || r === "..") {
        continue;
      }
      if (/[.\s]+$/.test(r)) {
        return true;
      }
    }
    if (/\.(CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])$/i.test(e)) {
      return true;
    }
    if (/(^|\/|\\)\.{3,}(\/|\\|$)/.test(e)) {
      return true;
    }
    if (HI(e, true) && !Pp(e) && !SBe(e, t)) {
      return true;
    }
    return false;
  }
  function checkPathSafetyForAutoEdit(e, t, n, r, o) {
    let s = n || r;
    let i = t ?? fg(e);
    for (let a of i) {
      if (Apr(a, o)) {
        return {
          safe: false,
          message: `Claude requested permissions to write to ${e}, which contains a suspicious Windows path pattern that requires manual approval.`,
          classifierApprovable: false
        };
      }
    }
    for (let a of i) {
      if (s) {
        if (isClaudeSettingsPath(a)) {
          return {
            safe: false,
            message: `Claude requested permissions to write to ${e}, but you haven't granted it yet.`,
            classifierApprovable: true
          };
        }
      } else if (wpf(a)) {
        return {
          safe: false,
          message: `Claude requested permissions to write to ${e}, but you haven't granted it yet.`,
          classifierApprovable: true
        };
      }
    }
    for (let a of i) {
      if (Ipf(a, s, o)) {
        return {
          safe: false,
          message: `Claude requested permissions to edit ${e} which is a sensitive file.`,
          classifierApprovable: true
        };
      }
    }
    return {
      safe: true
    };
  }
  function allWorkingDirectories(e) {
    return new Set([getOriginalCwd(), ...e.additionalWorkingDirectories.keys()]);
  }
  function pathInAllowedWorkingPath(e, t, n) {
    let r = n ?? fg(e);
    let o = Array.from(allWorkingDirectories(t)).flatMap(s => getResolvedWorkingDirPaths(s));
    return r.every(s => o.some(i => pathInWorkingPath(s, i, {
      caseFold: false
    })));
  }
  function pathInWorkingPath(e, t, {
    caseFold: n
  } = {
    caseFold: true
  }) {
    let r = us(e);
    let o = us(t);
    let s = r.replace(/^\/private\/var\//, "/var/").replace(/^\/private\/tmp(\/|$)/, "/tmp$1");
    let i = o.replace(/^\/private\/var\//, "/var/").replace(/^\/private\/tmp(\/|$)/, "/tmp$1");
    let a = n ? relativePath(normalizeCaseForComparison(i), normalizeCaseForComparison(s)) : relativePath(i, s);
    if (a === "") {
      return true;
    }
    if (fle(a)) {
      return false;
    }
    return !El.posix.isAbsolute(a);
  }
  function Ppf(e) {
    switch (e) {
      case "cliArg":
      case "command":
      case "session":
      case "toolsNarrowing":
      case "mcpServerPolicy":
        return us(getOriginalCwd());
      case "userSettings":
      case "policySettings":
      case "projectSettings":
      case "localSettings":
      case "flagSettings":
        return getSettingsRootPathForSource(e);
    }
  }
  function mzo(e) {
    return El.posix.join(phe, e);
  }
  function Opf({
    patternRoot: e,
    pattern: t,
    rootPath: n
  }) {
    let r = El.posix.join(e, t);
    let o = normalizeCaseForComparison(e);
    let s = normalizeCaseForComparison(n);
    if (o === s) {
      return mzo(t);
    } else if (normalizeCaseForComparison(r).startsWith(`${s}${phe}`)) {
      let i = r.slice(n.length);
      return mzo(i);
    } else {
      let i = El.posix.relative(s, o);
      if (!i || i.startsWith(`..${phe}`) || i === "..") {
        return null;
      } else {
        let a = El.posix.join(i, t);
        return mzo(a);
      }
    }
  }
  function Nmc(e) {
    if (Wt() !== "windows") {
      return e;
    }
    let t = El.posix.normalize(toPosixPath(e));
    return t.length > 1 && t.endsWith("/") ? t.slice(0, -1) : t;
  }
  function normalizePatternsToPath(e, t) {
    let n = new Set(e.get(null) ?? []);
    let r = Nmc(t);
    for (let [o, s] of e.entries()) {
      if (o === null) {
        continue;
      }
      let i = Nmc(o);
      for (let a of s) {
        let l = Opf({
          patternRoot: i,
          pattern: a,
          rootPath: r
        });
        if (l) {
          n.add(l);
        }
      }
    }
    return Array.from(n);
  }
  function getFileReadIgnorePatterns(e) {
    let t = Vmc(e, "read", "deny");
    let n = new Map();
    for (let [r, o] of t.entries()) {
      n.set(r, Array.from(o.keys()));
    }
    return n;
  }
  function patternWithRoot(e, t) {
    if (Wt() === "windows" && (e.startsWith("~\\") || e.startsWith("\\") && e[1] !== "!" && e[1] !== "#")) {
      e = e.replaceAll("\\", "/");
    }
    if (e.startsWith(`${phe}${phe}`)) {
      let r = e.slice(1);
      if (Wt() === "windows" && r.match(/^\/[a-z]\//i)) {
        let o = r[1]?.toUpperCase() ?? "C";
        let s = r.slice(2);
        let i = `${o}:\\`;
        return {
          relativePattern: s.startsWith("/") ? s : "/" + s,
          root: i
        };
      }
      return {
        relativePattern: r,
        root: phe
      };
    } else if (Wt() === "windows" && e.match(/^[A-Za-z]:[/\\]/)) {
      let r = e[0].toUpperCase();
      let o = e.slice(2).replaceAll("\\", "/");
      return {
        relativePattern: o.startsWith("/") ? o : "/" + o,
        root: `${r}:\\`
      };
    } else if (e.startsWith(`~${phe}`)) {
      return {
        relativePattern: e.slice(1),
        root: onn.homedir().normalize("NFC")
      };
    } else if (e.startsWith(phe)) {
      return {
        relativePattern: e,
        root: Ppf(t)
      };
    }
    let n = e;
    if (e.startsWith(`.${phe}`)) {
      n = e.slice(2);
    }
    return {
      relativePattern: n,
      root: null
    };
  }
  function Vmc(e, t, n) {
    let r = (() => {
      switch (t) {
        case "edit":
          return "Edit";
        case "read":
          return "Read";
      }
    })();
    let o = getRuleByContentsForToolName(e, r, n);
    let s = new Map();
    for (let [i, a] of o.entries()) {
      let {
        relativePattern: l,
        root: c
      } = patternWithRoot(i, a.source);
      let u = l.replace(/\/{2,}/g, "/");
      let d = s.get(c);
      if (d === undefined) {
        d = new Map();
        s.set(c, d);
      }
      d.set(u, a);
    }
    return s;
  }
  function matchingRuleForInput(e, t, n, r) {
    let o = us(e);
    if (Wt() === "windows" && o.includes("\\")) {
      o = UD(o);
    }
    let s = Vmc(t, n, r);
    let i = Wt() === "windows" && r !== "allow";
    let a = o ?? Nt();
    let l = i ? normalizeCaseForComparison(a) : a;
    for (let [c, u] of s.entries()) {
      let d = Array.from(u.keys()).map(g => {
        let y = g;
        if (y.endsWith("/**")) {
          let _ = y.slice(0, -3);
          y = /[^/]/.test(_) ? _ : "/**";
        }
        return y;
      });
      let p = gzo.default().add(d);
      let m = c ?? Nt();
      let f = relativePath(i ? normalizeCaseForComparison(m) : m, l);
      if (!f || f === ".." || f.startsWith(`..${phe}`)) {
        continue;
      }
      let h = p.test(f);
      if (h.ignored && h.rule) {
        let g = h.rule.pattern;
        let y = g + "/**";
        if (u.vZc(y)) {
          return u.get(y) ?? null;
        }
        return u.get(g) ?? null;
      }
    }
    return null;
  }
  function matchesPathRule(e, t) {
    let n = us(t);
    if (Wt() === "windows" && n.includes("\\")) {
      n = UD(n);
    }
    let {
      relativePattern: r,
      root: o
    } = patternWithRoot(e, "session");
    let s = r.replace(/\/{2,}/g, "/");
    if (s.endsWith("/**")) {
      let d = s.slice(0, -3);
      s = /[^/]/.test(d) ? d : "/**";
    }
    let i = Wt() === "windows";
    let a = o ?? Nt();
    let l = relativePath(i ? normalizeCaseForComparison(a) : a, i ? normalizeCaseForComparison(n) : n);
    if (l && l !== ".." && !l.startsWith("../") && gzo.default().add(s).test(l).ignored) {
      return true;
    }
    let c = e.trim();
    let u = !Qgo(c) && !c.endsWith(":*");
    if (c.startsWith("*") || u) {
      return KV(e, t);
    }
    return false;
  }
  function normalizeTrustedSymlink(e) {
    for (let [t, n] of Dpf()) {
      if (e === t || e.startsWith(t + El.sep)) {
        return n + e.slice(t.length);
      }
    }
    return e;
  }
  function Mpf(e) {
    return !!e && (e.startsWith(("/.claude/**").slice(0, -2)) || e.startsWith(("~/.claude/**").slice(0, -2))) && !e.includes("..") && e.endsWith("/**");
  }
  function matchingAllowRuleForAllPaths(e, t, n) {
    let r = null;
    for (let o of e) {
      let s = matchingRuleForInput(o, t, n, "allow");
      if (!s) {
        let i = normalizeTrustedSymlink(o);
        if (i !== o) {
          s = matchingRuleForInput(i, t, n, "allow");
        }
      }
      if (!s) {
        return null;
      }
      r ??= s;
    }
    return r;
  }
  function checkReadNetworkPathSafety(e, t, n, r) {
    if (typeof e.getPath !== "function") {
      return null;
    }
    let o = e.getPath(t);
    let s = n.trustedNetworkDirectories;
    if (zS(o) && !SBe(o, s)) {
      return {
        behavior: "ask",
        message: `Claude requested permissions to read from ${o}, which is under the /net automount map and could trigger a DNS lookup and NFS mount to a remote host.`,
        decisionReason: {
          type: "other",
          reason: "Automount -hosts path detected (defense-in-depth check)"
        }
      };
    }
    let i = r ?? fg(o);
    for (let a of i) {
      if (Rc(a) && !Pp(a) && !SBe(a, s)) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to read from ${o}, which appears to be a UNC path that could access network resources.`,
          decisionReason: {
            type: "other",
            reason: "UNC path detected (defense-in-depth check)"
          }
        };
      }
      if (zS(a) && !SBe(a, s)) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to read from ${o}, which is under the /net automount map and could trigger a DNS lookup and NFS mount to a remote host.`,
          decisionReason: {
            type: "other",
            reason: "Automount -hosts path detected (defense-in-depth check)"
          }
        };
      }
    }
    if (e.name === "Glob") {
      let a = t.pattern;
      if (typeof a === "string" && Rc(a) && !Pp(a) && !SBe(a, s)) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to glob ${a}, which appears to be a UNC pattern that could access network resources.`,
          decisionReason: {
            type: "other",
            reason: "UNC glob pattern detected (defense-in-depth check)"
          }
        };
      }
      if (typeof a === "string" && zS(a) && !SBe(a, s)) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to glob ${a}, which is under the /net automount map and could trigger a DNS lookup and NFS mount to a remote host.`,
          decisionReason: {
            type: "other",
            reason: "Automount -hosts glob pattern detected (defense-in-depth check)"
          }
        };
      }
    }
    for (let a of i) {
      if (Apr(a, s)) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to read from ${o}, which contains a suspicious Windows path pattern that requires manual approval.`,
          decisionReason: {
            type: "other",
            reason: "Path contains suspicious Windows-specific patterns (alternate data streams, short names, long path prefixes, or three or more consecutive dots) that require manual verification"
          }
        };
      }
    }
    return null;
  }
  function checkReadPermissionForTool(e, t, n) {
    if (typeof e.getPath !== "function") {
      return {
        behavior: "ask",
        message: `Claude requested permissions to use ${e.name}, but you haven't granted it yet.`
      };
    }
    let r = e.getPath(t);
    let o = fg(r);
    let s = checkReadNetworkPathSafety(e, t, n, o);
    if (s) {
      return s;
    }
    for (let p of o) {
      let m = matchingRuleForInput(p, n, "read", "deny");
      if (m) {
        return {
          behavior: "deny",
          message: `Permission to read ${r} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: m
          }
        };
      }
    }
    for (let p of o) {
      let m = matchingRuleForInput(p, n, "read", "ask");
      if (m) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to read from ${r}, but you haven't granted it yet.`,
          decisionReason: {
            type: "rule",
            rule: m
          }
        };
      }
    }
    let i = n.mode === "plan" ? {
      ...n,
      mode: "default"
    } : n;
    let a = checkWritePermissionForTool(e, t, i, o);
    if (a.behavior === "allow") {
      return a;
    }
    if (pathInAllowedWorkingPath(r, n, o)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "mode",
          mode: "default"
        }
      };
    }
    let c = us(r);
    let u = checkReadableInternalPath(c, t, o);
    if (u.behavior !== "passthrough") {
      return u;
    }
    let d = matchingAllowRuleForAllPaths(o, n, "read");
    if (d) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "rule",
          rule: d
        }
      };
    }
    return {
      behavior: "ask",
      message: `Claude requested permissions to read from ${r}, but you haven't granted it yet.`,
      suggestions: generateSuggestions(r, "read", n, o),
      decisionReason: {
        type: "workingDir",
        reason: "Path is outside allowed working directories"
      }
    };
  }
  function checkWritePermissionForTool(e, t, n, r) {
    if (typeof e.getPath !== "function") {
      return {
        behavior: "ask",
        message: `Claude requested permissions to use ${e.name}, but you haven't granted it yet.`
      };
    }
    let o = e.getPath(t);
    let s = r ?? fg(o);
    for (let m of s) {
      let f = matchingRuleForInput(m, n, "edit", "deny");
      if (f) {
        return {
          behavior: "deny",
          message: `Permission to edit ${o} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: f
          }
        };
      }
    }
    let i = us(o);
    if (wJ(i) && getMemoryToggledOff()) {
      return {
        behavior: "deny",
        message: "Cannot write to memory while it is paused. Run /pause-memory to resume automemory.",
        decisionReason: {
          type: "safetyCheck",
          reason: "memory access blocked by /pause-memory",
          classifierApprovable: false
        }
      };
    }
    if (s.some(qmc)) {
      return {
        behavior: "deny",
        message: "adopt.json is the bg-fork handoff carrier and is managed by the harness; it cannot be written directly",
        decisionReason: {
          type: "safetyCheck",
          reason: "adopt.json is a code-execution surface for the fork",
          classifierApprovable: false
        }
      };
    }
    if (s.some(fzo)) {
      return hzo;
    }
    let a = (n.alwaysAllowRules.session ?? []).filter(m => {
      let f = Nh(m).ruleContent;
      return Mpf(f) && !s.some(h => Apf(h, f ?? ""));
    });
    let l = a.length > 0 ? matchingAllowRuleForAllPaths(s, {
      ...n,
      alwaysAllowRules: {
        session: a
      }
    }, "edit") : null;
    if (l && n.mode !== "plan" && !s.some(m => Apr(m, n.trustedNetworkDirectories)) && !s.some(m => Mmc(m) > 1)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "rule",
          rule: l
        }
      };
    }
    for (let m of s) {
      let f = matchingRuleForInput(m, n, "edit", "ask");
      if (f) {
        return {
          behavior: "ask",
          message: `Claude requested permissions to write to ${o}, but you haven't granted it yet.`,
          decisionReason: {
            type: "rule",
            rule: f
          }
        };
      }
    }
    let c = checkEditableInternalPath(i, t, s);
    if (c.behavior !== "passthrough") {
      return c;
    }
    let u = checkPathSafetyForAutoEdit(o, s, undefined, n.isRemoteMode, n.trustedNetworkDirectories);
    if (!u.safe) {
      let m = s.some(h => Mmc(h) > 1 || Apr(h, n.trustedNetworkDirectories)) ? null : getClaudeSkillScope(o);
      let f = m ? [{
        type: "addRules",
        rules: [{
          toolName: "Edit",
          ruleContent: m.pattern
        }],
        behavior: "allow",
        destination: "session"
      }] : generateSuggestions(o, "write", n, s);
      return {
        behavior: "ask",
        message: u.message,
        suggestions: f,
        decisionReason: {
          type: "safetyCheck",
          reason: u.message,
          classifierApprovable: u.classifierApprovable
        }
      };
    }
    if (n.mode === "plan") {
      return {
        behavior: "ask",
        message: `Cannot write to ${o} while in plan mode.`,
        decisionReason: {
          type: "mode",
          mode: "plan"
        }
      };
    }
    let d = pathInAllowedWorkingPath(o, n, s);
    if (n.mode === "acceptEdits" && d) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "mode",
          mode: n.mode
        }
      };
    }
    let p = matchingAllowRuleForAllPaths(s, n, "edit");
    if (p) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "rule",
          rule: p
        }
      };
    }
    return {
      behavior: "ask",
      message: `Claude requested permissions to write to ${o}, but you haven't granted it yet.`,
      suggestions: generateSuggestions(o, "write", n, s),
      decisionReason: !d ? {
        type: "workingDir",
        reason: "Path is outside allowed working directories"
      } : undefined
    };
  }
  function generateSuggestions(e, t, n, r) {
    let o = !pathInAllowedWorkingPath(e, n, r);
    if (t === "read" && o) {
      let a = YB(e);
      return fg(a).map(u => G5e(u, "session")).filter(u => u !== undefined);
    }
    let s = n.mode === "plan" && (n.prePlanMode === "auto" || n.prePlanMode === "bypassPermissions" || n.prePlanMode === "acceptEdits" || n.prePlanMode === "dontAsk");
    let i = (n.mode === "default" || n.mode === "plan") && !s;
    if (t === "write" || t === "create") {
      let a = i ? [{
        type: "setMode",
        mode: "acceptEdits",
        destination: "session"
      }] : [];
      if (o) {
        let l = YB(e);
        let c = fg(l);
        a.push({
          type: "addDirectories",
          directories: c,
          destination: "session"
        });
      }
      return a;
    }
    return i ? [{
      type: "setMode",
      mode: "acceptEdits",
      destination: "session"
    }] : [];
  }
  function Npf(e) {
    for (let t of [Nt(), getOriginalCwd(), getProjectRoot(), er(), Pbe(), onn.homedir()]) {
      for (let n of getResolvedWorkingDirPaths(t)) {
        if (n === t) {
          continue;
        }
        if (e === n || e.startsWith(n + El.sep)) {
          return t + e.slice(n.length);
        }
      }
    }
    return normalizeTrustedSymlink(e);
  }
  function zmc(e, t, n) {
    let r;
    for (let o of e) {
      let s = t(o, n);
      if (s.behavior === "passthrough") {
        let i = Npf(o);
        if (i !== o) {
          s = t(i, n);
        }
      }
      if (s.behavior === "deny") {
        return s;
      }
      if (s.behavior !== "allow") {
        return {
          behavior: "passthrough",
          message: ""
        };
      }
      r ??= s;
    }
    return r ?? {
      behavior: "passthrough",
      message: ""
    };
  }
  function untypeDenyReasonForAskPropagation(e) {
    if (e?.type !== "safetyCheck") {
      return e;
    }
    return {
      type: "other",
      reason: e.reason
    };
  }
  function checkEditableInternalPath(e, t, n) {
    if (n && n.length > 0) {
      if (n.some(fzo)) {
        return hzo;
      }
      return zmc(n, checkEditableInternalPath, t);
    }
    let r = El.normalize(e);
    if ($mc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Plan files for current session are allowed for writing"
        }
      };
    }
    if (Cpf(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Workflow script files for current session are allowed for writing"
        }
      };
    }
    if (jmc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Scratchpad files for current session are allowed for writing"
        }
      };
    }
    if (Wmc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Job tmp/ subtree for current bg session is allowed for writing"
        }
      };
    }
    if (r.endsWith(".md") && mWe(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Agent memory files are allowed for writing"
        }
      };
    }
    if (wJ(r) && getMemoryToggledOff()) {
      return {
        behavior: "deny",
        message: "Cannot write to memory while it is paused. Run /pause-memory to resume automemory.",
        decisionReason: {
          type: "safetyCheck",
          reason: "memory access blocked by /pause-memory",
          classifierApprovable: false
        }
      };
    }
    if (!pDn() && r.endsWith(".md") && i$t(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "auto memory files are allowed for writing"
        }
      };
    }
    if (r === El.join(getOriginalCwd(), ".claude", "launch.json")) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Preview launch config is allowed for writing"
        }
      };
    }
    if (qmc(r)) {
      return {
        behavior: "deny",
        message: "adopt.json is the bg-fork handoff carrier and is managed by the harness; it cannot be written directly",
        decisionReason: {
          type: "safetyCheck",
          reason: "adopt.json is a code-execution surface for the fork",
          classifierApprovable: false
        }
      };
    }
    if (fzo(r)) {
      return hzo;
    }
    return {
      behavior: "passthrough",
      message: ""
    };
  }
  function checkReadableInternalPath(e, t, n) {
    if (n && n.length > 0) {
      return zmc(n, checkReadableInternalPath, t);
    }
    let r = El.normalize(e);
    if (wJ(r) && getMemoryToggledOff()) {
      return {
        behavior: "deny",
        message: "Cannot read memory while it is paused. Run /pause-memory to resume automemory.",
        decisionReason: {
          type: "safetyCheck",
          reason: "memory access blocked by /pause-memory",
          classifierApprovable: false
        }
      };
    }
    if (Rpf(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Project directory files are allowed for reading"
        }
      };
    }
    if ($mc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Plan files for current session are allowed for reading"
        }
      };
    }
    let o = Yde();
    let s = o.endsWith(El.sep) ? o : o + El.sep;
    if (r === o || r.startsWith(s)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Tool result files are allowed for reading"
        }
      };
    }
    if (jmc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Scratchpad files for current session are allowed for reading"
        }
      };
    }
    if (Wmc(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Job tmp/ subtree for current bg session is allowed for reading"
        }
      };
    }
    let i = getProjectTempDir();
    if (r.startsWith(i)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Project temp directory files are allowed for reading"
        }
      };
    }
    if (mWe(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Agent memory files are allowed for reading"
        }
      };
    }
    if (i$t(r)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "auto memory files are allowed for reading"
        }
      };
    }
    let a = El.join(er(), "tasks") + El.sep;
    if (r === a.slice(0, -1) || r.startsWith(a)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Task files are allowed for reading"
        }
      };
    }
    let l = El.join(er(), "teams") + El.sep;
    if (r === l.slice(0, -1) || r.startsWith(l)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Team files are allowed for reading"
        }
      };
    }
    let c = getBundledSkillsRoot() + El.sep;
    if (r.startsWith(c)) {
      return {
        behavior: "allow",
        updatedInput: t,
        decisionReason: {
          type: "other",
          reason: "Bundled skill reference files are allowed for reading"
        }
      };
    }
    return {
      behavior: "passthrough",
      message: ""
    };
  }
  var Lmc;
  var gzo;
  var onn;
  var El;
  var DANGEROUS_FILES;
  var DANGEROUS_FILES_LC;
  var DANGEROUS_DIRECTORIES;
  var DANGEROUS_DIRECTORY_PATHS;
  var phe;
  var getClaudeTempDir;
  var getChildProcessTmpDir;
  var getBundledSkillsRoot;
  var kpf;
  var hzo;
  var getResolvedWorkingDirPaths;
  var Dpf;
  var wm = __lazy(() => {
    Eb();
    Vbe();
    Ay();
    DJ();
    at();
    $n();
    Tm();
    Fk();
    mm();
    vo();
    pr();
    gn();
    ku();
    xx();
    Cs();
    Fy();
    nf();
    Ike();
    Kke();
    pde();
    BC();
    zI();
    wj();
    cDn();
    Zk();
    EC();
    oy();
    V5e();
    Lmc = require("crypto");
    gzo = __toESM(aWe(), 1);
    onn = require("os");
    El = require("path");
    DANGEROUS_FILES = [".gitconfig", ".gitmodules", ".bashrc", ".bash_profile", ".zshrc", ".zprofile", ".profile", ".zshenv", ".zlogin", ".zlogout", ".bash_login", ".bash_aliases", ".bash_logout", ".envrc", ".ripgreprc", ".mcp.json", ".claude.json", ".npmrc", ".yarnrc", ".yarnrc.yml", ".pnp.cjs", ".pnp.loader.mjs", ".pnpmfile.cjs", "bunfig.toml", ".bunfig.toml", ".bazelrc", ".bazelversion", ".bazeliskrc", ".pre-commit-config.yaml", "lefthook.yml", ".lefthook.yml", "lefthook.yaml", ".lefthook.yaml", "gradle-wrapper.properties", "maven-wrapper.properties", ".devcontainer.json", "pyrightconfig.json"];
    DANGEROUS_FILES_LC = new Set(DANGEROUS_FILES.map(e => e.toLowerCase()));
    DANGEROUS_DIRECTORIES = [".git", ".vscode", ".idea", ".claude", ".husky", ".cargo", ".devcontainer", ".yarn", ".mvn"];
    DANGEROUS_DIRECTORY_PATHS = [".config/git"];
    phe = El.posix.sep;
    getClaudeTempDir = TEr(function () {
      let t = pT();
      let n = zt();
      let r = t;
      try {
        r = n.realpathSync(t);
      } catch {}
      return r + El.sep;
    });
    getChildProcessTmpDir = TEr(function () {
      let t = rlt();
      let n = zt();
      let r = t;
      try {
        r = n.realpathSync(t);
      } catch {}
      return r + El.sep;
    });
    getBundledSkillsRoot = TEr(function () {
      let t = Lmc.randomBytes(16).toString("hex");
      return El.join(getClaudeTempDir(), "bundled-skills", {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION, t);
    });
    kpf = TEr(function (t) {
      try {
        return El.join(getProjectTempDir(), t, "scratchpad");
      } catch {
        return null;
      }
    });
    hzo = {
      behavior: "deny",
      message: "The host credentials file is managed by the host process; it cannot be written directly",
      decisionReason: {
        type: "safetyCheck",
        reason: "host-creds file rewrite redirects the bearer token",
        classifierApprovable: false
      }
    };
    getResolvedWorkingDirPaths = TEr(fg);
    Dpf = TEr(function () {
      let t = [["/private/tmp", "/tmp"], ["/private/var", "/var"], ["/private/etc", "/etc"], ["/usr/bin", "/bin"], ["/usr/lib", "/lib"], ["/usr/sbin", "/sbin"]];
      let n = new Map();
      let r = zt();
      for (let [o, s] of t) {
        try {
          if (r.realpathSync(s) === o) {
            n.set(o, s);
          }
        } catch {}
      }
      return n;
    });
  });
  var Amc = {};