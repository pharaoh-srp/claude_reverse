  __export(Hlo, {
    shouldForceSandboxOn: () => shouldForceSandboxOn,
    shouldAllowManagedSandboxDomainsOnly: () => shouldAllowManagedSandboxDomainsOnly,
    resolveSandboxFilesystemPath: () => resolveSandboxFilesystemPath,
    resolvePathPatternForSandbox: () => resolvePathPatternForSandbox,
    isHostAllowedBySandboxNetworkPolicy: () => isHostAllowedBySandboxNetworkPolicy,
    getTenguSandboxGbConfig: () => getTenguSandboxGbConfig,
    getEffectiveFilesystemPolicy: () => getEffectiveFilesystemPolicy,
    ensureAtomicWriteStagingDirs: () => ensureAtomicWriteStagingDirs,
    detectWorktreeGitCommonDir: () => detectWorktreeGitCommonDir,
    convertToSandboxRuntimeConfig: () => convertToSandboxRuntimeConfig,
    addToExcludedCommands: () => addToExcludedCommands,
    addSandboxAllowWriteDirectory: () => addSandboxAllowWriteDirectory,
    SandboxViolationStore: () => SandboxViolationStore,
    SandboxManager: () => SandboxManager,
    SandboxInitFailedError: () => SandboxInitFailedError,
    SandboxBridgeUnavailableError: () => SandboxBridgeUnavailableError,
    HOST_CEL_POLICIES: () => HOST_CEL_POLICIES
  });
  function l9e(e) {
    let t = e.match(/^([^(]+)\(([^)]+)\)$/);
    if (!t) {
      return {
        toolName: e
      };
    }
    let n = t[1];
    let r = t[2];
    if (!n || !r) {
      return {
        toolName: e
      };
    }
    return {
      toolName: n,
      ruleContent: r
    };
  }
  function afp(e) {
    return e.match(/^(.+):\*$/)?.[1] ?? null;
  }
  function resolvePathPatternForSandbox(e, t) {
    if (e.startsWith("//")) {
      return e.slice(1);
    }
    if (e.startsWith("/") && !e.startsWith("//")) {
      let n = getSettingsRootPathForSource(t);
      return La.resolve(n, e.slice(1));
    }
    return e;
  }
  function resolveSandboxFilesystemPath(e, t) {
    if (e.startsWith("//")) {
      return e.slice(1);
    }
    return us(e, getSettingsRootPathForSource(t));
  }
  function getEffectiveFilesystemPolicy() {
    if (isScrubEnabled()) {
      return "strict";
    }
    let e = getTenguSandboxGbConfig().filesystemPolicy ?? "strict";
    if (e === "relaxedIfForced") {
      return lfp() ? "strict" : "relaxed";
    }
    return e;
  }
  function lfp() {
    return [...getAllPolicyTierSettings(), getSettingsForSource("flagSettings"), qf("userSettings") ? getSettingsForSource("userSettings") : null, qf("projectSettings") ? getSettingsForSource("projectSettings") : null, qf("localSettings") ? getSettingsForSource("localSettings") : null].some(e => e?.sandbox?.enabled === true);
  }
  function shouldAllowManagedSandboxDomainsOnly() {
    return getAllPolicyTierSettings().some(e => e.sandbox?.network?.allowManagedDomainsOnly === true);
  }
  function hua(e, t) {
    let n = t === "allow" ? "allowedDomains" : "deniedDomains";
    let r = [];
    for (let o of e) {
      for (let s of o.sandbox?.network?.[n] ?? []) {
        r.push(s);
      }
      for (let s of o.permissions?.[t] ?? []) {
        let i = l9e(s);
        if (i.toolName === "WebFetch" && i.ruleContent?.startsWith("domain:")) {
          r.push(i.ruleContent.substring(7));
        }
      }
    }
    return r;
  }
  function isHostAllowedBySandboxNetworkPolicy(e) {
    let t = getAllPolicyTierSettings();
    if (hua([getInitialSettings(), ...t], "deny").some(o => Alo(o, e))) {
      return {
        allowed: false,
        reason: `${e} is in sandbox.network.deniedDomains`
      };
    }
    if (!shouldAllowManagedSandboxDomainsOnly()) {
      return {
        allowed: true
      };
    }
    if (hua(t, "allow").some(o => Alo(o, e))) {
      return {
        allowed: true
      };
    }
    return {
      allowed: false,
      reason: `sandbox.network.allowManagedDomainsOnly is set and ${e} is not in the policy allowlist`
    };
  }
  function cfp(e) {
    if (YBn.vZc(e)) {
      return;
    }
    YBn.add(e);
    Blo();
  }
  function Ib(e) {
    let t;
    try {
      t = cd.readlinkSync(e);
    } catch {
      return e;
    }
    let n;
    try {
      n = cd.realpathSync(e);
      p3t.push({
        literal: e,
        resolved: n
      });
      return n;
    } catch {
      let r = La.resolve(La.dirname(e), t);
      for (let o = 0; o < 8; o++) {
        let s;
        try {
          s = cd.readlinkSync(r);
        } catch {
          break;
        }
        r = La.resolve(La.dirname(r), s);
      }
      p3t.push({
        literal: e,
        resolved: r
      });
      return r;
    }
  }
  function gua(e) {
    return La.resolve(e, ".claude", ".cc-writes");
  }
  function _ua() {
    let e = new Set();
    e.add(gua(getOriginalCwd()));
    e.add(gua(getCwdState()));
    e.add(La.resolve(er(), ".cc-writes"));
    return [...e];
  }
  function Dlo(e) {
    cd.mkdirSync(La.dirname(e), {
      recursive: true
    });
    cd.mkdirSync(e, {
      recursive: true,
      mode: 448
    });
  }
  function VBn(e) {
    try {
      cd.closeSync(cd.openSync(La.dirname(e), cd.constants.O_RDONLY | cd.constants.O_DIRECTORY | cd.constants.O_NOFOLLOW));
      return true;
    } catch (t) {
      let n = en(t);
      return n !== "ELOOP" && n !== "ENOTDIR";
    }
  }
  function ensureAtomicWriteStagingDirs() {
    for (let e of _ua()) {
      if (!VBn(e)) {
        continue;
      }
      let t = false;
      try {
        if (!cd.lstatSync(e).isDirectory()) {
          if (!VBn(e)) {
            continue;
          }
          cd.unlinkSync(e);
          Dlo(e);
          t = true;
        } else {
          try {
            cd.closeSync(cd.openSync(e, cd.constants.O_RDONLY | cd.constants.O_DIRECTORY));
            t = true;
          } catch {
            try {
              if (!VBn(e)) {
                continue;
              }
              cd.rmdirSync(e);
              Dlo(e);
              t = true;
            } catch {}
          }
        }
      } catch {
        try {
          if (!VBn(e)) {
            continue;
          }
          Dlo(e);
          t = true;
        } catch (n) {
          logForDebugging(`ensureAtomicWriteStagingDirs: failed to create ${e}: ${n}`);
          Et("sandbox_exec", "atomic_write_staging_dir_create_failed");
        }
      }
      try {
        let n = cd.openSync(e, cd.constants.O_RDONLY | cd.constants.O_DIRECTORY | cd.constants.O_NOFOLLOW);
        try {
          let r = cd.fstatSync(n);
          Gks(e, r.dev, r.ino, n);
        } catch (r) {
          throw cd.closeSync(n), r;
        }
      } catch (n) {
        if (t) {
          _ke(`Staging dir ${e} was just established but identity-record open failed (${en(n) ?? n})`);
        }
      }
    }
    if (!yua) {
      yua = true;
      Bgn(`.claude/${".cc-writes"}/`, getOriginalCwd()).then(e => {
        if (!e.written) {
          return;
        }
        if (e.effective) {
          Pe("gitignore_global_rule");
        } else if (e.reason === "already_tracked") {
          Et("gitignore_global_rule", e.reason);
        } else {
          Ae("gitignore_global_rule", e.reason ?? "write_ineffective");
        }
      });
    }
  }
  function convertToSandboxRuntimeConfig(e) {
    let t = e.permissions || {};
    let n = getAllPolicyTierSettings();
    let r = n.some(N => N.sandbox?.network?.allowManagedDomainsOnly === true);
    let o = n.some(N => N.sandbox?.filesystem?.allowManagedReadPathsOnly === true);
    let s = [];
    let i = [];
    if (r) {
      for (let N of n) {
        for (let W of N.sandbox?.network?.allowedDomains || []) {
          s.push(W);
        }
        for (let W of N.permissions?.allow || []) {
          let j = l9e(W);
          if (j.toolName === "WebFetch" && j.ruleContent?.startsWith("domain:")) {
            s.push(j.ruleContent.substring(7));
          }
        }
      }
    } else {
      for (let N of e.sandbox?.network?.allowedDomains || []) {
        s.push(N);
      }
      for (let N of t.allow || []) {
        let W = l9e(N);
        if (W.toolName === "WebFetch" && W.ruleContent?.startsWith("domain:")) {
          s.push(W.ruleContent.substring(7));
        }
      }
      for (let N of YBn) {
        s.push(N);
      }
    }
    for (let N of e.sandbox?.network?.deniedDomains || []) {
      i.push(N);
    }
    for (let N of t.deny || []) {
      let W = l9e(N);
      if (W.toolName === "WebFetch" && W.ruleContent?.startsWith("domain:")) {
        i.push(W.ruleContent.substring(7));
      }
    }
    let a = [".", getClaudeTempDir()];
    let l = getChildProcessTmpDir();
    if (l !== getClaudeTempDir()) {
      a.push(l);
    }
    let c = [];
    let u = [];
    let d = [];
    p3t.length = 0;
    let p = bC.map(N => getSettingsFilePathForSource(N)).filter(N => N !== undefined);
    if (c.push(...p.map(Ib)), c.push(_Mt()), Wt() === "wsl") {
      c.push(La.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.json"));
      c.push(La.join("/mnt/c/Program Files/ClaudeCode", "managed-settings.d"));
    }
    let m = getCwdState();
    let f = getOriginalCwd();
    if (m !== f) {
      c.push(Ib(La.resolve(m, ".claude", "settings.json")));
      c.push(Ib(La.resolve(m, ".claude", "settings.local.json")));
    }
    if (c.push(Ib(La.resolve(f, ".claude", "skills"))), m !== f) {
      c.push(Ib(La.resolve(m, ".claude", "skills")));
    }
    if (c.push(Ib(La.resolve(f, ".claude", "hooks"))), m !== f) {
      c.push(Ib(La.resolve(m, ".claude", "hooks")));
    }
    if (c.push(La.resolve(er(), "local")), c.push(..._ua()), c.push(Ib(La.resolve(er(), "jobs"))), c.push(Ib(La.resolve(er(), "daemon"))), Me.CLAUDE_CODE_HOST_CREDS_FILE) {
      c.push(Ib(Me.CLAUDE_CODE_HOST_CREDS_FILE));
    }
    let h = N => {
      c.push(Ib(La.resolve(N, ".claude", "launch.json")));
      c.push(Ib(La.resolve(N, ".claude", "workflows")));
      c.push(Ib(La.resolve(N, ".claude", "routines")));
      c.push(Ib(La.resolve(N, ".claude", "scheduled_tasks.json")));
    };
    if (h(f), m !== f) {
      let N = f.endsWith(La.sep) ? f : f + La.sep;
      let W = m;
      while (W !== f) {
        h(W);
        let j = La.dirname(W);
        if (j === W || !(j + La.sep).startsWith(N)) {
          break;
        }
        W = j;
      }
    }
    if (c.push(La.resolve(f, ".mcp.json")), m !== f) {
      let N = f.endsWith(La.sep) ? f : f + La.sep;
      let W = m;
      while (W !== f) {
        c.push(La.resolve(W, ".mcp.json"));
        let j = La.dirname(W);
        if (j === W || !(j + La.sep).startsWith(N)) {
          break;
        }
        W = j;
      }
    }
    bdt.length = 0;
    let g = new Set([...(e.permissions?.additionalDirectories || []), ...getAdditionalDirectoriesForClaudeMd()]);
    let y = ["HEAD", "objects", "refs"];
    let _ = ["hooks", "config"];
    let b = Wt() === "macos";
    let S = N => {
      let W = z => {
        try {
          cd.statSync(z);
          c.push(Ib(z));
        } catch {
          if (bdt.push(z), b) {
            c.push(z);
          }
        }
      };
      c.push(Ib(La.join(N, "hooks")));
      c.push(Ib(La.join(N, "config")));
      c.push(Ib(La.join(N, "config.lock")));
      c.push(Ib(La.join(N, "config.worktree")));
      W(La.join(N, "config.worktree.lock"));
      W(La.join(N, "commondir"));
      let j = La.join(N, "worktrees");
      try {
        for (let z of cd.readdirSync(j, {
          withFileTypes: true
        })) {
          if (!z.isDirectory() && !z.isSymbolicLink()) {
            continue;
          }
          c.push(Ib(La.join(j, z.name, "config.worktree")));
          W(La.join(j, z.name, "config.worktree.lock"));
          c.push(Ib(La.join(j, z.name, "commondir")));
        }
      } catch {}
    };
    let E = new Set([f, m]);
    for (let N of [f, ...g]) {
      let W;
      try {
        W = us(N, f);
      } catch {
        continue;
      }
      let j = W.endsWith(La.sep) ? W : W + La.sep;
      if ((m + La.sep).startsWith(j)) {
        let z = m;
        for (;;) {
          if (E.add(z), z === W) {
            break;
          }
          let V = La.dirname(z);
          if (V === z || !(V + La.sep).startsWith(j)) {
            break;
          }
          z = V;
        }
      }
    }
    for (let N of E) {
      let W = true;
      for (let z of y) {
        let V = La.resolve(N, z);
        try {
          cd.statSync(V);
          c.push(V);
        } catch {
          if (W = false, bdt.push(V), b) {
            c.push(V);
          }
        }
      }
      if (W) {
        S(N);
      }
      for (let z of _) {
        let V = La.resolve(N, z);
        try {
          let K = cd.statSync(V);
          if (c.push(V), z === "config" && K.isFile()) {
            c.push(La.resolve(N, "config.lock"));
          }
        } catch {}
      }
      let j = La.resolve(N, ".git");
      try {
        let z = cd.lstatSync(j);
        if (z.isFile()) {
          c.push(j);
        } else if (z.isDirectory()) {
          S(j);
        } else {
          try {
            if (cd.statSync(j).isDirectory()) {
              S(j);
            }
          } catch {}
        }
      } catch {
        if (bdt.push(j), b) {
          c.push(j);
        }
      }
    }
    let C = N => {
      let W = detectWorktreeGitCommonDir(N);
      if (W && W !== m && !a.includes(W)) {
        a.push(W);
        S(W);
      }
    };
    C(m);
    a.push(...g);
    for (let N of JBn.values()) {
      a.push(N);
      c.push(Ib(La.resolve(N, ".claude", "settings.json")));
      c.push(Ib(La.resolve(N, ".claude", "settings.local.json")));
      c.push(Ib(La.resolve(N, ".claude", "skills")));
      c.push(Ib(La.resolve(N, ".claude", "agents")));
      c.push(Ib(La.resolve(N, ".claude", "commands")));
      c.push(Ib(La.resolve(N, ".claude", "hooks")));
      c.push(Ib(La.resolve(N, ".claude", "launch.json")));
      c.push(Ib(La.resolve(N, ".claude", "workflows")));
      c.push(Ib(La.resolve(N, ".claude", "routines")));
      c.push(Ib(La.resolve(N, ".claude", "scheduled_tasks.json")));
      let W = La.resolve(N, ".git");
      try {
        let j = cd.lstatSync(W);
        if (j.isFile()) {
          c.push(W);
        } else if (j.isDirectory()) {
          S(W);
        } else {
          try {
            if (cd.statSync(W).isDirectory()) {
              S(W);
            }
          } catch {}
        }
      } catch {}
      C(N);
    }
    for (let N of bC) {
      let W = getSettingsForSource(N);
      if (W?.permissions) {
        for (let z of W.permissions.allow || []) {
          let V = l9e(z);
          if (V.toolName === "Edit" && V.ruleContent) {
            a.push(resolvePathPatternForSandbox(V.ruleContent, N));
          }
        }
        for (let z of W.permissions.deny || []) {
          let V = l9e(z);
          if (V.toolName === "Edit" && V.ruleContent) {
            c.push(resolvePathPatternForSandbox(V.ruleContent, N));
          }
          if (V.toolName === "Read" && V.ruleContent) {
            u.push(resolvePathPatternForSandbox(V.ruleContent, N));
          }
        }
      }
      let j = W?.sandbox?.filesystem;
      if (j) {
        for (let z of j.allowWrite || []) {
          a.push(resolveSandboxFilesystemPath(z, N));
        }
        for (let z of j.denyWrite || []) {
          c.push(resolveSandboxFilesystemPath(z, N));
        }
        for (let z of j.denyRead || []) {
          u.push(resolveSandboxFilesystemPath(z, N));
        }
        if (!o) {
          for (let z of j.allowRead || []) {
            d.push(resolveSandboxFilesystemPath(z, N));
          }
        }
      }
    }
    if (o) {
      for (let N of n) {
        for (let W of N.sandbox?.filesystem?.allowRead || []) {
          d.push(resolveSandboxFilesystemPath(W, "policySettings"));
        }
      }
    }
    let x = [];
    let A = [];
    let k = false;
    for (let N of bC) {
      let W = getSettingsForSource(N)?.sandbox?.credentials;
      if (!W) {
        continue;
      }
      k = true;
      x.push(...(W.files ?? []).map(j => ({
        ...j,
        path: resolveSandboxFilesystemPath(j.path, N)
      })));
      A.push(...(W.envVars ?? []));
    }
    let I = k ? {
      files: x,
      envVars: A
    } : undefined;
    let {
      rgPath: O,
      rgArgs: M,
      argv0: L
    } = i9e();
    let P = e.sandbox?.ripgrep ?? {
      command: O,
      args: M,
      argv0: L
    };
    let H = isScrubEnabled() && isScrubSandboxAvailable() && !c9e() ? {
      allowedDomains: undefined,
      deniedDomains: [],
      allowAllUnixSockets: true
    } : {
      allowedDomains: s,
      deniedDomains: i,
      allowUnixSockets: e.sandbox?.network?.allowUnixSockets,
      allowAllUnixSockets: e.sandbox?.network?.allowAllUnixSockets,
      allowLocalBinding: e.sandbox?.network?.allowLocalBinding,
      allowMachLookup: e.sandbox?.network?.allowMachLookup,
      httpProxyPort: e.sandbox?.network?.httpProxyPort,
      socksProxyPort: e.sandbox?.network?.socksProxyPort
    };
    let U = {
      denyRead: u,
      allowRead: d,
      allowWrite: a,
      denyWrite: c,
      ...(getEffectiveFilesystemPolicy() === "relaxed" && {
        disabled: true
      })
    };
    return {
      network: H,
      filesystem: U,
      ignoreViolations: e.sandbox?.ignoreViolations,
      credentials: I,
      enableWeakerNestedSandbox: isScrubEnabled() && isScrubSandboxAvailable() ? false : e.sandbox?.enableWeakerNestedSandbox,
      enableWeakerNetworkIsolation: e.sandbox?.enableWeakerNetworkIsolation,
      allowAppleEvents: [...n, getSettingsForSource("flagSettings"), qf("userSettings") ? getSettingsForSource("userSettings") : null].map(N => N?.sandbox?.allowAppleEvents).find(N => N !== undefined),
      ripgrep: P,
      seccomp: pua(),
      bwrapPath: w$t(),
      socatPath: h3i()
    };
  }
  function addSandboxAllowWriteDirectory(e, t) {
    if (JBn.get(t) === e) {
      return;
    }
    JBn.set(t, e);
    Blo();
  }
  function ufp() {
    for (let e of bdt) {
      let t = e.slice(e.lastIndexOf(La.sep) + 1);
      try {
        cd.rmSync(e, {
          recursive: t !== "HEAD" && t !== ".git"
        });
        logForDebugging(`[Sandbox] scrubbed planted bare-repo file: ${e}`);
      } catch {}
    }
  }
  function dfp() {
    for (let {
      literal: e,
      resolved: t
    } of p3t) {
      let n;
      try {
        n = cd.lstatSync(e).isSymbolicLink();
      } catch (r) {
        if (en(r) === "ENOENT") {
          continue;
        }
        n = false;
      }
      if (n) {
        try {
          if (cd.realpathSync(e) === t) {
            continue;
          }
        } catch {}
      }
      try {
        cd.rmSync(e, {
          recursive: true,
          force: true
        });
        logForDebugging(`[Sandbox] scrubbed replaced symlinked-deny path: ${e}`);
      } catch {}
    }
  }
  function detectWorktreeGitCommonDir(e) {
    let t = La.join(e, ".git");
    try {
      let r = cd.readFileSync(t, {
        encoding: "utf8"
      }).match(/^gitdir:\s*(.+)$/m);
      if (!r?.[1]) {
        return null;
      }
      let o = r[1].trim();
      if (IB(o, e)) {
        return null;
      }
      let s = La.resolve(e, o);
      let i = La.dirname(s);
      if (La.basename(i) !== "worktrees") {
        return null;
      }
      let a = La.dirname(i);
      if (!La.basename(a).endsWith(".git")) {
        return null;
      }
      let l = cd.readFileSync(La.join(s, "gitdir"), {
        encoding: "utf8"
      }).trim();
      if (IB(l, e)) {
        return null;
      }
      if (cd.realpathSync(La.resolve(s, l)) !== La.join(cd.realpathSync(e), ".git")) {
        return null;
      }
      return a;
    } catch {
      return null;
    }
  }
  function shouldForceSandboxOn() {
    if (!getTenguSandboxGbConfig().disableNoSandbox) {
      return false;
    }
    return !isScrubEnabled() && !st(process.env.IS_SANDBOX) && !nM.getIsBubblewrapSandbox();
  }
  function c9e() {
    try {
      if (shouldForceSandboxOn()) {
        return true;
      }
      return getInitialSettings()?.sandbox?.enabled ?? false;
    } catch (e) {
      logForDebugging(`Failed to get settings for sandbox check: ${e}`);
      return false;
    }
  }
  function pfp() {
    if (isScrubEnabled()) {
      return false;
    }
    return getInitialSettings()?.sandbox?.autoAllowBashIfSandboxed ?? true;
  }
  function mfp() {
    if (getTenguSandboxGbConfig().forbidUnsandboxedCommands) {
      return false;
    }
    return getInitialSettings()?.sandbox?.allowUnsandboxedCommands ?? true;
  }
  function ffp() {
    return getTenguSandboxGbConfig().forbidUnsandboxedCommands === true;
  }
  function Tua() {
    let e = getInitialSettings();
    return c9e() && ZBn() && (e?.sandbox?.failIfUnavailable ?? false);
  }
  function ZBn() {
    try {
      let e = getSettingsForSource("policySettings")?.sandbox?.enabledPlatforms;
      if (e === undefined) {
        return true;
      }
      if (e.length === 0) {
        return false;
      }
      let t = Wt();
      return e.includes(t);
    } catch (e) {
      logForDebugging(`Failed to check enabledPlatforms: ${e}`);
      return true;
    }
  }
  function e2n() {
    if (isScrubEnabled() && true && !c9e()) {
      return isScrubSandboxAvailable();
    }
    if (Flo) {
      return false;
    }
    if (!QBn()) {
      return false;
    }
    if (m3t().errors.length > 0) {
      return false;
    }
    if (!ZBn()) {
      return false;
    }
    return c9e();
  }
  function hfp() {
    if (!c9e()) {
      return;
    }
    if (!ZBn()) {
      return;
    }
    if (!QBn()) {
      let t = Wt();
      if (t === "wsl") {
        return "sandbox is enabled but WSL1 is not supported (requires WSL2)";
      }
      return `sandbox is enabled but ${t} is not supported (requires macOS, Linux, or WSL2)`;
    }
    let e = m3t();
    if (e.errors.length > 0) {
      let t = Wt();
      let n = getIsNonInteractiveSession() ? "see https://code.claude.com/docs/en/sandboxing" : t === "macos" ? "run /sandbox or /doctor for details" : "run /sandbox for details";
      let r = t === "macos" ? n : `install missing tools (e.g. apt install bubblewrap socat) or ${n}`;
      return `sandbox is enabled but dependencies are missing: ${e.errors.join(", ")} \xB7 ${r}`;
    }
    return;
  }
  function gfp() {
    let e = Wt();
    if (e !== "linux" && e !== "wsl") {
      return [];
    }
    try {
      if (!c9e()) {
        return [];
      }
      let n = getInitialSettings()?.permissions || {};
      let r = [];
      let o = s => {
        let i = s.replace(/\/\*\*$/, "");
        return /[*?[\]]/.test(i);
      };
      for (let s of [...(n.allow || []), ...(n.deny || [])]) {
        let i = l9e(s);
        if ((i.toolName === "Edit" || i.toolName === "Read") && i.ruleContent && o(i.ruleContent)) {
          r.push(s);
        }
      }
      return r;
    } catch (t) {
      logForDebugging(`Failed to get Linux glob pattern warnings: ${t}`);
      return [];
    }
  }
  function yfp() {
    let e = ["flagSettings", "policySettings"];
    for (let t of e) {
      let n = getSettingsForSource(t);
      if (n?.sandbox?.enabled !== undefined || n?.sandbox?.autoAllowBashIfSandboxed !== undefined || n?.sandbox?.allowUnsandboxedCommands !== undefined) {
        return true;
      }
    }
    return false;
  }
  async function _fp(e) {
    let t = getSettingsForSource("localSettings");
    updateSettingsForSource("localSettings", {
      sandbox: {
        ...t?.sandbox,
        ...(e.enabled !== undefined && {
          enabled: e.enabled
        }),
        ...(e.autoAllowBashIfSandboxed !== undefined && {
          autoAllowBashIfSandboxed: e.autoAllowBashIfSandboxed
        }),
        ...(e.allowUnsandboxedCommands !== undefined && {
          allowUnsandboxedCommands: e.allowUnsandboxedCommands
        })
      }
    });
    Pe("sandbox_set_settings");
  }
  function bfp() {
    return getInitialSettings()?.sandbox?.excludedCommands ?? [];
  }
  async function Sfp(e, t, n, r) {
    if (e2n()) {
      if (!ide) {
        Et("sandbox_exec", "sandbox_exec_lazy_init");
        await Eua();
      }
      if (ide) {
        await ide;
      }
      if (!ide) {
        Ae("sandbox_exec", "sandbox_exec_not_initialized");
        let o = d3t ? `: ${d3t}` : "";
        if (Tua() || isScrubEnabled() && isScrubSandboxAvailable()) {
          throw new SandboxInitFailedError(`Sandbox is required but failed to initialize${o}. Restart to retry.`);
        }
        throw Flo = true, new SandboxInitFailedError(`Sandbox is enabled but failed to initialize${o}. Sandboxing is disabled for the rest of this session; restart to retry.`);
      }
      ensureAtomicWriteStagingDirs();
    }
    try {
      let o = await bS.wrapWithSandbox(e, t, n, r);
      Pe("sandbox_exec");
      return o;
    } catch (o) {
      if (o instanceof Error && /bridge socket does not exist/i.test(o.message)) {
        Et("sandbox_exec", "sandbox_linux_bridge_dead");
        let s = /SOCKS/i.test(o.message) ? "SOCKS" : "HTTP";
        throw new SandboxBridgeUnavailableError(`Linux sandbox ${s} bridge socket is missing (socat may have died). Restart to retry.`);
      }
      throw o;
    }
  }
  async function Eua(e) {
    if (ide) {
      return ide;
    }
    if (!e2n()) {
      return;
    }
    let t = e ? async n => {
      if (shouldAllowManagedSandboxDomainsOnly()) {
        logForDebugging(`[sandbox] Blocked network request to ${n.host} (allowManagedDomainsOnly)`);
        return false;
      }
      return e(n);
    } : undefined;
    ide = (async () => {
      try {
        let n = getInitialSettings();
        let r = convertToSandboxRuntimeConfig(n);
        await bS.initialize(r, t);
        m3t.cache.clear?.();
        Mlo = fM.subscribe(() => {
          let o = getInitialSettings();
          let s = convertToSandboxRuntimeConfig(o);
          bS.updateConfig(s);
          logForDebugging("Sandbox configuration updated from settings change");
        });
        Pe("sandbox_init");
      } catch (n) {
        ide = undefined;
        d3t = he(n);
        Et("sandbox_init", "sandbox_init_failed");
        logForDebugging(`Failed to initialize sandbox: ${d3t}`);
      }
    })();
    return ide;
  }
  function Blo() {
    if (!e2n()) {
      return;
    }
    let e = getInitialSettings();
    let t = convertToSandboxRuntimeConfig(e);
    bS.updateConfig(t);
  }
  async function Tfp() {
    Mlo?.();
    Mlo = undefined;
    bdt.length = 0;
    p3t.length = 0;
    JBn.clear();
    YBn.clear();
    m3t.cache.clear?.();
    QBn.cache.clear?.();
    getTenguSandboxGbConfig.cache.clear?.();
    ide = undefined;
    Flo = false;
    d3t = undefined;
    return bS.reset();
  }
  function addToExcludedCommands(e, t) {
    let n = getSettingsForSource("localSettings");
    let r = n?.sandbox?.excludedCommands || [];
    let o = e;
    if (t) {
      let s = t.filter(i => i.type === "addRules" && i.rules.some(a => a.toolName === "Bash"));
      if (s.length > 0 && s[0].type === "addRules") {
        let i = s[0].rules.find(a => a.toolName === "Bash");
        if (i?.ruleContent) {
          o = afp(i.ruleContent) || i.ruleContent;
        }
      }
    }
    if (!r.includes(o)) {
      updateSettingsForSource("localSettings", {
        sandbox: {
          ...n?.sandbox,
          excludedCommands: [...r, o]
        }
      });
    }
    Pe("sandbox_exclude_command");
    return o;
  }
  var cd;
  var La;
  var SandboxInitFailedError;
  var SandboxBridgeUnavailableError;
  var getTenguSandboxGbConfig;
  var YBn;
  var yua = false;
  var ide;
  var Mlo;
  var Flo = false;
  var d3t;
  var bdt;
  var p3t;
  var JBn;
  var m3t;
  var QBn;
  var SandboxManager;
  var Th = __lazy(() => {
    $sa();
    BSe();
    nao();
    ZL();
    at();
    ln();
    $n();
    Ot();
    mm();
    sNt();
    Vca();
    je();
    pr();
    YW();
    gn();
    Zl();
    $gn();
    ku();
    Cs();
    ode();
    nf();
    Bte();
    Ike();
    s1();
    hQr();
    Ay();
    Tm();
    EX();
    dt();
    wm();
    eoe();
    Olo();
    fua();
    cd = require("fs");
    La = require("path");
    SandboxInitFailedError = class KBn extends Error {
      constructor(e) {
        super(e);
        this.name = "SandboxInitFailedError";
      }
    };
    SandboxBridgeUnavailableError = class Nlo extends Error {
      constructor(e) {
        super(e);
        this.name = "SandboxBridgeUnavailableError";
      }
    };
    getTenguSandboxGbConfig = TEr(() => ({}));
    YBn = new Set();
    bdt = [];
    p3t = [];
    JBn = new Map();
    m3t = TEr(() => {
      try {
        bS.updateConfig(convertToSandboxRuntimeConfig(getInitialSettings() ?? {}));
      } catch (n) {
        logForDebugging(`checkDependencies: settings unavailable, skipping SRT config seed: ${n}`);
      }
      let {
        rgPath: e,
        rgArgs: t
      } = i9e();
      return bS.checkDependencies({
        command: e,
        args: t
      });
    });
    QBn = TEr(() => {
      if (Wt() === "windows") {
        return false;
      }
      return bS.isSupportedPlatform();
    });
    SandboxManager = {
      initialize: Eua,
      isSandboxingEnabled: e2n,
      isSandboxEnabledInSettings: c9e,
      isPlatformInEnabledList: ZBn,
      getSandboxUnavailableReason: hfp,
      isAutoAllowBashIfSandboxedEnabled: pfp,
      areUnsandboxedCommandsAllowed: mfp,
      isSandboxRequired: Tua,
      areSandboxSettingsLockedByPolicy: yfp,
      areUnsandboxedCommandsForbiddenByPolicy: ffp,
      setSandboxSettings: _fp,
      getExcludedCommands: bfp,
      wrapWithSandbox: Sfp,
      refreshConfig: Blo,
      addSessionAllowedHost: cfp,
      reset: Tfp,
      checkDependencies: m3t,
      getConfig: bS.getConfig,
      getFsReadConfig: () => {
        let e = bS.getConfig();
        if (e?.filesystem.disabled) {
          return {
            denyOnly: e.filesystem.denyRead.map(CG),
            allowWithinDeny: (e.filesystem.allowRead ?? []).map(CG)
          };
        }
        return bS.getFsReadConfig();
      },
      getFsWriteConfig: () => {
        let e = bS.getConfig();
        if (e?.filesystem.disabled) {
          return {
            allowOnly: e.filesystem.allowWrite.map(CG),
            denyWithinAllow: e.filesystem.denyWrite.map(CG)
          };
        }
        return bS.getFsWriteConfig();
      },
      getNetworkRestrictionConfig: () => {
        if (bS.getConfig()?.network?.allowedDomains === undefined) {
          return {};
        }
        return bS.getNetworkRestrictionConfig();
      },
      getIgnoreViolations: bS.getIgnoreViolations,
      getLinuxGlobPatternWarnings: gfp,
      isSupportedPlatform: QBn,
      getAllowUnixSockets: bS.getAllowUnixSockets,
      getAllowLocalBinding: bS.getAllowLocalBinding,
      getAllowMachLookup: bS.getAllowMachLookup,
      getEnableWeakerNestedSandbox: bS.getEnableWeakerNestedSandbox,
      getProxyPort: bS.getProxyPort,
      getProxyAuthToken: bS.getProxyAuthToken,
      getSocksProxyPort: bS.getSocksProxyPort,
      getLinuxHttpSocketPath: bS.getLinuxHttpSocketPath,
      getLinuxSocksSocketPath: bS.getLinuxSocksSocketPath,
      waitForNetworkInitialization: bS.waitForNetworkInitialization,
      getSandboxViolationStore: bS.getSandboxViolationStore,
      annotateStderrWithSandboxFailures: bS.annotateStderrWithSandboxFailures,
      cleanupAfterCommand: () => {
        bS.cleanupAfterCommand();
        ufp();
        dfp();
      }
    };
  });
  function _O() {
    return Efp;
  }
  function wfp(e) {
    return {
      src: e,
      len: e.length,
      i: 0,
      b: 0,
      heredocs: [],
      byteTable: null
    };
  }
  function _t(e) {
    let t = e.src.charCodeAt(e.i);
    if (e.i++, t < 128) {
      e.b++;
    } else if (t < 2048) {
      e.b += 2;
    } else if (t >= 55296 && t <= 56319) {
      e.b += 4;
      e.i++;
    } else {
      e.b += 3;
    }
  }
  function tn(e, t = 0) {
    return e.i + t < e.len ? e.src[e.i + t] : "";
  }
  function Pua(e, t) {
    if (e.byteTable) {
      return e.byteTable[t];
    }
    let n = new Uint32Array(e.len + 1);
    let r = 0;
    let o = 0;
    while (o < e.len) {
      n[o] = r;
      let s = e.src.charCodeAt(o);
      if (s < 128) {
        r++;
        o++;
      } else if (s < 2048) {
        r += 2;
        o++;
      } else if (s >= 55296 && s <= 56319) {
        n[o + 1] = r + 2;
        r += 4;
        o += 2;
      } else {
        r += 3;
        o++;
      }
    }
    n[e.len] = r;
    e.byteTable = n;
    return n[t];
  }
  function Oua(e) {
    return e >= "a" && e <= "z" || e >= "A" && e <= "Z" || e >= "0" && e <= "9" || e === "_" || e === "/" || e === "." || e === "-" || e === "+" || e === ":" || e === "@" || e === "%" || e === "," || e === "~" || e === "^" || e === "?" || e === "*" || e === "!" || e === "=" || e === "[" || e === "]";
  }
  function Cfp(e) {
    return Oua(e) || e === "\\";
  }
  function jlo(e) {
    return e === "" || e === " " || e === "\t" || e === `
` || e === "\r" || e === ";" || e === "&" || e === "|" || e === "(" || e === ")" || e === "<" || e === ">";
  }
  function a$(e) {
    return e >= "a" && e <= "z" || e >= "A" && e <= "Z" || e === "_";
  }
  function toe(e) {
    return a$(e) || e >= "0" && e <= "9";
  }
  function yx(e) {
    return e >= "0" && e <= "9";
  }
  function Rfp(e) {
    return yx(e) || e >= "a" && e <= "f" || e >= "A" && e <= "F";
  }
  function xfp(e) {
    return toe(e) || e === "@";
  }
  function kfp(e) {
    return e !== "" && e !== " " && e !== "\t" && e !== `
` && e !== "<" && e !== ">" && e !== "|" && e !== "&" && e !== ";" && e !== "(" && e !== ")" && e !== "'" && e !== '"' && e !== "`" && e !== "\\";
  }
  function da(e) {
    while (e.i < e.len) {
      let t = e.src[e.i];
      if (t === " " || t === "\t" || t === "\r") {
        _t(e);
      } else if (t === "\\") {
        if (e.src[e.i + 1] === `
`) {
          _t(e);
          _t(e);
        } else {
          break;
        }
      } else {
        break;
      }
    }
  }
  function Afp(e) {
    while (e.i < e.len) {
      let t = e.src[e.i];
      if (t === " " || t === "\t") {
        _t(e);
      } else if (t === "\\" && e.src[e.i + 1] === `
`) {
        _t(e);
        _t(e);
      } else {
        break;
      }
    }
  }
  function im(e, t = "arg") {
    da(e);
    let n = e.b;
    if (e.i >= e.len) {
      return {
        type: "EOF",
        value: "",
        start: n,
        end: n
      };
    }
    let r = e.src[e.i];
    let o = tn(e, 1);
    let s = tn(e, 2);
    if (r === `
`) {
      _t(e);
      return {
        type: "NEWLINE",
        value: `
`,
        start: n,
        end: e.b
      };
    }
    if (r === "#") {
      let i = e.i > 0 ? e.src[e.i - 1] : "";
      if (i === "" || " \t\n;&|<>()`".includes(i)) {
        let a = e.i;
        while (e.i < e.len && e.src[e.i] !== `
`) {
          _t(e);
        }
        return {
          type: "COMMENT",
          value: e.src.slice(a, e.i),
          start: n,
          end: e.b
        };
      }
    }
    if (r === "&" && o === "&") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "&&",
        start: n,
        end: e.b
      };
    }
    if (r === "|" && o === "|") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "||",
        start: n,
        end: e.b
      };
    }
    if (r === "|" && o === "&") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "|&",
        start: n,
        end: e.b
      };
    }
    if (r === ";" && o === ";" && s === "&") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ";;&",
        start: n,
        end: e.b
      };
    }
    if (r === ";" && o === ";") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ";;",
        start: n,
        end: e.b
      };
    }
    if (r === ";" && o === "&") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ";&",
        start: n,
        end: e.b
      };
    }
    if (r === ">" && o === ">") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ">>",
        start: n,
        end: e.b
      };
    }
    if (r === ">" && o === "&" && s === "-") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ">&-",
        start: n,
        end: e.b
      };
    }
    if (r === ">" && o === "&") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ">&",
        start: n,
        end: e.b
      };
    }
    if (r === ">" && o === "|") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: ">|",
        start: n,
        end: e.b
      };
    }
    if (r === "&" && o === ">" && s === ">") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "&>>",
        start: n,
        end: e.b
      };
    }
    if (r === "&" && o === ">") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "&>",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "<" && s === "<") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "<<<",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "<" && s === "-") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "<<-",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "<") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "<<",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "&" && s === "-") {
      _t(e);
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "<&-",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "&") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "<&",
        start: n,
        end: e.b
      };
    }
    if (r === "<" && o === "(") {
      _t(e);
      _t(e);
      return {
        type: "LT_PAREN",
        value: "<(",
        start: n,
        end: e.b
      };
    }
    if (r === ">" && o === "(") {
      _t(e);
      _t(e);
      return {
        type: "GT_PAREN",
        value: ">(",
        start: n,
        end: e.b
      };
    }
    if (r === "(" && o === "(") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "((",
        start: n,
        end: e.b
      };
    }
    if (r === ")" && o === ")") {
      _t(e);
      _t(e);
      return {
        type: "OP",
        value: "))",
        start: n,
        end: e.b
      };
    }
    if (r === "|" || r === "&" || r === ";" || r === ">" || r === "<") {
      _t(e);
      return {
        type: "OP",
        value: r,
        start: n,
        end: e.b
      };
    }
    if (r === "(" || r === ")") {
      _t(e);
      return {
        type: "OP",
        value: r,
        start: n,
        end: e.b
      };
    }
    if (t === "cmd") {
      if (r === "[" && o === "[" && (s === " " || s === "\t" || s === `
` || s === "" || s === "(")) {
        _t(e);
        _t(e);
        return {
          type: "OP",
          value: "[[",
          start: n,
          end: e.b
        };
      }
      if (r === "[") {
        _t(e);
        return {
          type: "OP",
          value: "[",
          start: n,
          end: e.b
        };
      }
      if (r === "{" && (o === " " || o === "\t" || o === `
`)) {
        _t(e);
        return {
          type: "OP",
          value: "{",
          start: n,
          end: e.b
        };
      }
      if (r === "}") {
        _t(e);
        return {
          type: "OP",
          value: "}",
          start: n,
          end: e.b
        };
      }
      if (r === "!" && (o === " " || o === "\t")) {
        _t(e);
        return {
          type: "OP",
          value: "!",
          start: n,
          end: e.b
        };
      }
    }
    if (r === '"') {
      _t(e);
      return {
        type: "DQUOTE",
        value: '"',
        start: n,
        end: e.b
      };
    }
    if (r === "'") {
      let i = e.i;
      _t(e);
      while (e.i < e.len && e.src[e.i] !== "'") {
        _t(e);
      }
      if (e.i < e.len) {
        _t(e);
      }
      return {
        type: "SQUOTE",
        value: e.src.slice(i, e.i),
        start: n,
        end: e.b
      };
    }
    if (r === "$") {
      if (o === "(" && s === "(") {
        _t(e);
        _t(e);
        _t(e);
        return {
          type: "DOLLAR_DPAREN",
          value: "$((",
          start: n,
          end: e.b
        };
      }
      if (o === "(") {
        _t(e);
        _t(e);
        return {
          type: "DOLLAR_PAREN",
          value: "$(",
          start: n,
          end: e.b
        };
      }
      if (o === "{") {
        _t(e);
        _t(e);
        return {
          type: "DOLLAR_BRACE",
          value: "${",
          start: n,
          end: e.b
        };
      }
      if (o === "'") {
        let i = e.i;
        _t(e);
        _t(e);
        while (e.i < e.len && e.src[e.i] !== "'") {
          if (e.src[e.i] === "\\" && e.i + 1 < e.len) {
            _t(e);
          }
          _t(e);
        }
        if (e.i < e.len) {
          _t(e);
        }
        return {
          type: "ANSI_C",
          value: e.src.slice(i, e.i),
          start: n,
          end: e.b
        };
      }
      _t(e);
      return {
        type: "DOLLAR",
        value: "$",
        start: n,
        end: e.b
      };
    }
    if (r === "`") {
      _t(e);
      return {
        type: "BACKTICK",
        value: "`",
        start: n,
        end: e.b
      };
    }
    if (yx(r)) {
      let i = e.i;
      while (i < e.len && yx(e.src[i])) {
        i++;
      }
      let a = i < e.len ? e.src[i] : "";
      if (a === ">" || a === "<") {
        let l = e.i;
        while (e.i < i) {
          _t(e);
        }
        return {
          type: "WORD",
          value: e.src.slice(l, e.i),
          start: n,
          end: e.b
        };
      }
    }
    if (Cfp(r) || r === "{" || r === "}") {
      let i = e.i;
      while (e.i < e.len) {
        let a = e.src[e.i];
        if (a === "\\") {
          if (e.i + 1 >= e.len) {
            break;
          }
          if (e.src[e.i + 1] === `
`) {
            _t(e);
            _t(e);
            continue;
          }
          _t(e);
          _t(e);
          continue;
        }
        if (!Oua(a) && a !== "{" && a !== "}" && a !== "#") {
          break;
        }
        _t(e);
      }
      if (e.i > i) {
        let a = e.src.slice(i, e.i);
        if (/^-?\d+$/.test(a)) {
          return {
            type: "NUMBER",
            value: a,
            start: n,
            end: e.b
          };
        }
        return {
          type: "WORD",
          value: a,
          start: n,
          end: e.b
        };
      }
    }
    _t(e);
    return {
      type: "WORD",
      value: r,
      start: n,
      end: e.b
    };
  }
  function Ifp(e, t) {
    let n = wfp(e);
    let r = Pfp(e);
    let o = {
      L: n,
      src: e,
      srcBytes: r,
      isAscii: r === e.length,
      nodeCount: 0,
      deadline: performance.now() + (t ?? 50),
      aborted: false,
      inBacktick: 0,
      inDquote: 0,
      stopToken: null,
      zshBraceDiff: false
    };
    try {
      let s = Dfp(o);
      if (o.aborted) {
        return null;
      }
      if (o.zshBraceDiff) {
        return An(o, "ERROR", s.startIndex, s.endIndex, [s]);
      }
      return s;
    } catch {
      return null;
    }
  }
  function Pfp(e) {
    let t = 0;
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      if (r < 128) {
        t++;
      } else if (r < 2048) {
        t += 2;
      } else if (r >= 55296 && r <= 56319) {
        t += 4;
        n++;
      } else {
        t += 3;
      }
    }
    return t;
  }
  function Ofp(e) {
    if (e.nodeCount++, e.nodeCount > 50000) {
      throw e.aborted = true, Error("budget");
    }
    if ((e.nodeCount & 127) === 0 && performance.now() > e.deadline) {
      throw e.aborted = true, Error("timeout");
    }
  }
  function An(e, t, n, r, o) {
    Ofp(e);
    return {
      type: t,
      text: WOe(e, n, r),
      startIndex: n,
      endIndex: r,
      children: o
    };
  }
  function WOe(e, t, n) {
    if (e.isAscii) {
      return e.src.slice(t, n);
    }
    let r = e.L;
    if (!r.byteTable) {
      Pua(r, 0);
    }
    let o = r.byteTable;
    let s = 0;
    let i = e.src.length;
    while (s < i) {
      let l = s + i >>> 1;
      if (o[l] < t) {
        s = l + 1;
      } else {
        i = l;
      }
    }
    let a = s;
    s = a;
    i = e.src.length;
    while (s < i) {
      let l = s + i >>> 1;
      if (o[l] < n) {
        s = l + 1;
      } else {
        i = l;
      }
    }
    return e.src.slice(a, s);
  }
  function nd(e, t, n) {
    return An(e, t, n.start, n.end, []);
  }
  function Dfp(e) {
    let t = [];
    da(e.L);
    while (true) {
      let o = uf(e.L);
      if (im(e.L, "cmd").type === "NEWLINE") {
        da(e.L);
        continue;
      }
      Fu(e.L, o);
      break;
    }
    let n = e.L.b;
    while (e.L.i < e.L.len) {
      let o = uf(e.L);
      let s = im(e.L, "cmd");
      if (s.type === "EOF") {
        break;
      }
      if (s.type === "NEWLINE") {
        continue;
      }
      if (s.type === "COMMENT") {
        t.push(nd(e, "comment", s));
        continue;
      }
      Fu(e.L, o);
      let i = Dq(e, null);
      for (let a of i) {
        t.push(a);
      }
      if (i.length === 0) {
        let a = im(e.L, "cmd");
        if (a.type === "EOF") {
          break;
        }
        if (a.type === "OP" && a.value === ";;" && t.length > 0) {
          continue;
        }
        t.push(An(e, "ERROR", a.start, a.end, []));
      }
    }
    let r = t.length > 0 ? e.srcBytes : n;
    return An(e, "program", n, r, t);
  }
  function uf(e) {
    return e.b * 65536 + e.i;
  }
  function Fu(e, t) {
    e.i = t & 65535;
    e.b = t >>> 16;
  }
  function Dq(e, t) {
    let n = [];
    while (true) {
      da(e.L);
      let r = uf(e.L);
      let o = im(e.L, "cmd");
      if (o.type === "EOF") {
        Fu(e.L, r);
        break;
      }
      if (o.type === "NEWLINE") {
        if (e.L.heredocs.length > 0) {
          qlo(e);
        }
        continue;
      }
      if (o.type === "COMMENT") {
        n.push(nd(e, "comment", o));
        continue;
      }
      if (t && o.type === "OP" && o.value === t) {
        Fu(e.L, r);
        break;
      }
      if (o.type === "OP" && (o.value === ")" || o.value === "}" || o.value === ";;" || o.value === ";&" || o.value === ";;&" || o.value === "))" || o.value === "]]" || o.value === "]")) {
        Fu(e.L, r);
        break;
      }
      if (o.type === "BACKTICK" && e.inBacktick > 0) {
        Fu(e.L, r);
        break;
      }
      if (o.type === "WORD" && (o.value === "then" || o.value === "elif" || o.value === "else" || o.value === "fi" || o.value === "do" || o.value === "done" || o.value === "esac")) {
        Fu(e.L, r);
        break;
      }
      Fu(e.L, r);
      let s = Dua(e);
      if (!s) {
        break;
      }
      n.push(s);
      da(e.L);
      let i = uf(e.L);
      let a = im(e.L, "cmd");
      if (a.type === "OP" && (a.value === ";" || a.value === "&")) {
        let l = uf(e.L);
        let c = im(e.L, "cmd");
        if (Fu(e.L, l), n.push(nd(e, a.value, a)), c.type === "EOF" || c.type === "OP" && (c.value === ")" || c.value === "}" || c.value === ";;" || c.value === ";&" || c.value === ";;&") || c.type === "WORD" && (c.value === "then" || c.value === "elif" || c.value === "else" || c.value === "fi" || c.value === "do" || c.value === "done" || c.value === "esac")) {
          continue;
        }
      } else if (a.type === "NEWLINE") {
        if (e.L.heredocs.length > 0) {
          qlo(e);
        }
        continue;
      } else {
        Fu(e.L, i);
      }
    }
    return n;
  }
  function Dua(e) {
    let t = vua(e);
    if (!t) {
      return null;
    }
    while (true) {
      let n = uf(e.L);
      let r = im(e.L, "cmd");
      if (r.type === "OP" && (r.value === "&&" || r.value === "||")) {
        let o = nd(e, r.value, r);
        oTe(e);
        let s = vua(e);
        if (!s) {
          t = An(e, "list", t.startIndex, o.endIndex, [t, o]);
          break;
        }
        if (s.type === "redirected_statement" && s.children.length >= 2) {
          let i = s.children[0];
          let a = s.children.slice(1);
          let l = An(e, "list", t.startIndex, i.endIndex, [t, o, i]);
          let c = a.at(-1);
          t = An(e, "redirected_statement", l.startIndex, c.endIndex, [l, ...a]);
        } else {
          t = An(e, "list", t.startIndex, s.endIndex, [t, o, s]);
        }
      } else {
        Fu(e.L, n);
        break;
      }
    }
    return t;
  }
  function oTe(e) {
    while (true) {
      let t = uf(e.L);
      if (im(e.L, "cmd").type !== "NEWLINE") {
        Fu(e.L, t);
        break;
      }
    }
  }
  function vua(e) {
    let t = GOe(e);
    if (!t) {
      return null;
    }
    let n = [t];
    while (true) {
      let o = uf(e.L);
      let s = im(e.L, "cmd");
      if (s.type === "OP" && (s.value === "|" || s.value === "|&")) {
        let i = nd(e, s.value, s);
        oTe(e);
        let a = GOe(e);
        if (!a) {
          n.push(i);
          break;
        }
        if (a.type === "redirected_statement" && a.children.length >= 2 && n.length >= 1) {
          let l = a.children[0];
          let c = a.children.slice(1);
          let u = [...n, i, l];
          let d = An(e, "pipeline", u[0].startIndex, l.endIndex, u);
          let p = c.at(-1);
          let m = An(e, "redirected_statement", d.startIndex, p.endIndex, [d, ...c]);
          n.length = 0;
          n.push(m);
          t = m;
          continue;
        }
        n.push(i, a);
      } else {
        Fu(e.L, o);
        break;
      }
    }
    if (n.length === 1) {
      return n[0];
    }
    let r = n.at(-1);
    return An(e, "pipeline", n[0].startIndex, r.endIndex, n);
  }
  function GOe(e) {
    da(e.L);
    let t = uf(e.L);
    let n = im(e.L, "cmd");
    if (n.type === "EOF") {
      Fu(e.L, t);
      return null;
    }
    if (n.type === "OP" && n.value === "!") {
      let r = nd(e, "!", n);
      let o = GOe(e);
      if (!o) {
        return An(e, "negated_command", r.startIndex, r.endIndex, [r]);
      }
      if (o.type === "redirected_statement" && o.children.length >= 2) {
        let s = o.children[0];
        let i = o.children.slice(1);
        let a = An(e, "negated_command", r.startIndex, s.endIndex, [r, s]);
        let l = i.at(-1);
        return An(e, "redirected_statement", a.startIndex, l.endIndex, [a, ...i]);
      }
      return An(e, "negated_command", r.startIndex, o.endIndex, [r, o]);
    }
    if (n.type === "OP" && n.value === "(") {
      let r = nd(e, "(", n);
      let o = Dq(e, ")");
      let s = im(e.L, "cmd");
      let i = s.type === "OP" && s.value === ")" ? nd(e, ")", s) : An(e, ")", r.endIndex, r.endIndex, []);
      let a = An(e, "subshell", r.startIndex, i.endIndex, [r, ...o, i]);
      return ade(e, a);
    }
    if (n.type === "OP" && n.value === "((") {
      let r = nd(e, "((", n);
      let o = g3t(e, "))", "var");
      let s = im(e.L, "cmd");
      let i = s.value === "))" ? nd(e, "))", s) : An(e, "))", r.endIndex, r.endIndex, []);
      return An(e, "compound_statement", r.startIndex, i.endIndex, [r, ...o, i]);
    }
    if (n.type === "OP" && n.value === "{") {
      let r = nd(e, "{", n);
      let o = Dq(e, "}");
      let s = im(e.L, "cmd");
      let i = s.type === "OP" && s.value === "}" ? nd(e, "}", s) : An(e, "}", r.endIndex, r.endIndex, []);
      let a = An(e, "compound_statement", r.startIndex, i.endIndex, [r, ...o, i]);
      return ade(e, a);
    }
    if (n.type === "OP" && (n.value === "[" || n.value === "[[")) {
      let r = nd(e, n.value, n);
      let o = n.value === "[" ? "]" : "]]";
      let s = uf(e.L);
      let i = Rua(e, o);
      if (da(e.L), n.value === "[" && tn(e.L) !== "]") {
        Fu(e.L, s);
        let d = e.stopToken;
        e.stopToken = "]";
        let p = GOe(e);
        if (e.stopToken = d, p && p.type === "redirected_statement") {
          i = p;
        } else {
          Fu(e.L, s);
          i = Rua(e, o);
        }
        da(e.L);
      }
      let a = uf(e.L);
      let l = im(e.L, "arg");
      let c;
      if (l.value === o && jlo(tn(e.L))) {
        c = nd(e, o, l);
      } else {
        Fu(e.L, a);
        c = An(e, o, r.endIndex, r.endIndex, []);
      }
      let u = i ? [r, i, c] : [r, c];
      return ade(e, An(e, "test_command", r.startIndex, c.endIndex, u));
    }
    if (n.type === "WORD") {
      if (n.value === "if") {
        return ade(e, Wfp(e, n), true);
      }
      if (n.value === "while" || n.value === "until") {
        return ade(e, Gfp(e, n), true);
      }
      if (n.value === "for") {
        return ade(e, Cua(e, n), true);
      }
      if (n.value === "select") {
        return ade(e, Cua(e, n), true);
      }
      if (n.value === "case") {
        return ade(e, Vfp(e, n), true);
      }
      if (n.value === "function") {
        return Jfp(e, n);
      }
      if (vfp.vZc(n.value)) {
        return ade(e, Xfp(e, n));
      }
      if (n.value === "unset" || n.value === "unsetenv") {
        return ade(e, Qfp(e, n));
      }
    }
    Fu(e.L, t);
    return Mfp(e);
  }
  function Mfp(e) {
    let t = e.L.b;
    let n = [];
    let r = [];
    while (true) {
      da(e.L);
      let y = Mua(e);
      if (y) {
        n.push(y);
        continue;
      }
      let _ = Sdt(e);
      if (_) {
        r.push(_);
        continue;
      }
      break;
    }
    da(e.L);
    let o = uf(e.L);
    let s = im(e.L, "cmd");
    if (s.type === "EOF" || s.type === "NEWLINE" || s.type === "COMMENT" || s.type === "BACKTICK" || s.type === "OP" && s.value !== "{" && s.value !== "[" && s.value !== "[[" || s.type === "WORD" && zlo.vZc(s.value) && s.value !== "in") {
      if (Fu(e.L, o), n.length === 1 && r.length === 0) {
        return n[0];
      }
      if (r.length > 0 && n.length === 0) {
        let y = r.at(-1);
        return An(e, "redirected_statement", r[0].startIndex, y.endIndex, r);
      }
      if (n.length > 1 && r.length === 0) {
        let y = n.at(-1);
        return An(e, "variable_assignments", n[0].startIndex, y.endIndex, n);
      }
      if (n.length > 0 || r.length > 0) {
        let y = [...n, ...r];
        let _ = y.at(-1);
        return An(e, "command", t, _.endIndex, y);
      }
      return null;
    }
    Fu(e.L, o);
    let i = uf(e.L);
    let a = Mq(e, "cmd");
    if (a && a.type === "word") {
      if (da(e.L), tn(e.L) === "(" && tn(e.L, 1) === ")") {
        let y = im(e.L, "cmd");
        let _ = im(e.L, "cmd");
        let b = nd(e, "(", y);
        let S = nd(e, ")", _);
        da(e.L);
        oTe(e);
        let E = GOe(e);
        if (E) {
          let C = [E];
          if (E.type === "redirected_statement" && E.children.length >= 2 && E.children[0].type === "compound_statement") {
            C = E.children;
          }
          let x = C.at(-1);
          return An(e, "function_definition", a.startIndex, x.endIndex, [a, b, S, ...C]);
        }
      }
    }
    Fu(e.L, i);
    let l = Mq(e, "cmd");
    if (!l) {
      if (n.length === 1) {
        return n[0];
      }
      return null;
    }
    let c = An(e, "command_name", l.startIndex, l.endIndex, [l]);
    let u = [];
    let d = [];
    let p = null;
    while (true) {
      da(e.L);
      let y = Sdt(e, true);
      if (y) {
        if (y.type === "heredoc_redirect") {
          p = y;
        } else if (y.type === "herestring_redirect") {
          u.push(y);
        } else {
          d.push(y);
        }
        continue;
      }
      if (d.length > 0) {
        break;
      }
      if (e.stopToken === "]" && tn(e.L) === "]") {
        break;
      }
      let _ = uf(e.L);
      let b = im(e.L, "arg");
      if (b.type === "EOF" || b.type === "NEWLINE" || b.type === "COMMENT" || b.type === "OP" && (b.value === "|" || b.value === "|&" || b.value === "&&" || b.value === "||" || b.value === ";" || b.value === ";;" || b.value === ";&" || b.value === ";;&" || b.value === "&" || b.value === ")" || b.value === "}" || b.value === "))")) {
        Fu(e.L, _);
        break;
      }
      Fu(e.L, _);
      let S = Mq(e, "arg");
      if (!S) {
        if (tn(e.L) === "(") {
          let E = im(e.L, "cmd");
          let C = nd(e, "(", E);
          let x = Dq(e, ")");
          let A = uf(e.L);
          let k = im(e.L, "cmd");
          let I;
          if (k.type === "OP" && k.value === ")") {
            I = nd(e, ")", k);
          } else {
            Fu(e.L, A);
            I = An(e, ")", C.endIndex, C.endIndex, []);
          }
          u.push(An(e, "subshell", C.startIndex, I.endIndex, [C, ...x, I]));
          continue;
        }
        break;
      }
      if (S.type === "word" && S.text === "=") {
        u.push(An(e, "ERROR", S.startIndex, S.endIndex, [S]));
        continue;
      }
      if ((S.type === "word" || S.type === "concatenation") && tn(e.L) === "(" && e.L.b === S.endIndex) {
        u.push(An(e, "ERROR", S.startIndex, S.endIndex, [S]));
        continue;
      }
      u.push(S);
    }
    let m = [...n, ...r, c, ...u];
    let f = m.length > 0 ? m.at(-1).endIndex : c.endIndex;
    let h = m[0].startIndex;
    let g = An(e, "command", h, f, m);
    if (p) {
      qlo(e);
      let y = e.L.heredocs.shift();
      if (y && p.children.length >= 2) {
        let S = An(e, "heredoc_body", y.bodyStart, y.bodyEnd, y.quoted ? [] : Ffp(e, y.bodyStart, y.bodyEnd));
        let E = An(e, "heredoc_end", y.endStart, y.endEnd, []);
        p.children.push(S, E);
        p.endIndex = y.endEnd;
        p.text = WOe(e, p.startIndex, y.endEnd);
      }
      let _ = [...r, p, ...d];
      let b = r.length > 0 ? Math.min(g.startIndex, r[0].startIndex) : g.startIndex;
      return An(e, "redirected_statement", b, p.endIndex, [g, ..._]);
    }
    if (d.length > 0) {
      let y = d.at(-1);
      return An(e, "redirected_statement", g.startIndex, y.endIndex, [g, ...d]);
    }
    return g;
  }
  function ade(e, t, n = false) {
    let r = [];
    while (true) {
      da(e.L);
      let s = uf(e.L);
      let i = Sdt(e);
      if (!i) {
        break;
      }
      if (i.type === "herestring_redirect" && !n) {
        Fu(e.L, s);
        break;
      }
      r.push(i);
    }
    if (r.length === 0) {
      return t;
    }
    let o = r.at(-1);
    return An(e, "redirected_statement", t.startIndex, o.endIndex, [t, ...r]);
  }
  function Mua(e) {
    let t = uf(e.L);
    da(e.L);
    let n = e.L.b;
    if (!a$(tn(e.L))) {
      Fu(e.L, t);
      return null;
    }
    while (toe(tn(e.L))) {
      _t(e.L);
    }
    let r = e.L.b;
    let o = r;
    if (tn(e.L) === "[") {
      _t(e.L);
      let g = 1;
      while (e.L.i < e.L.len && g > 0) {
        let y = tn(e.L);
        if (y === "[") {
          g++;
        } else if (y === "]") {
          g--;
        }
        _t(e.L);
      }
      o = e.L.b;
    }
    let s = tn(e.L);
    let i = tn(e.L, 1);
    let a;
    if (s === "=" && i !== "=") {
      a = "=";
    } else if (s === "+" && i === "=") {
      a = "+=";
    } else {
      Fu(e.L, t);
      return null;
    }
    let l = An(e, "variable_name", n, r, []);
    let c = l;
    if (o > r) {
      let g = An(e, "[", r, r + 1, []);
      let y = Lfp(e, r + 1, o - 1);
      let _ = An(e, "]", o - 1, o, []);
      c = An(e, "subscript", n, o, [l, g, y, _]);
    }
    let u = e.L.b;
    if (_t(e.L), a === "+=") {
      _t(e.L);
    }
    let d = e.L.b;
    let p = An(e, a, u, d, []);
    let m = null;
    if (tn(e.L) === "(") {
      let g = im(e.L, "cmd");
      let y = nd(e, "(", g);
      let _ = [y];
      while (true) {
        if (da(e.L), tn(e.L) === ")") {
          break;
        }
        let E = Mq(e, "arg");
        if (!E) {
          break;
        }
        _.push(E);
      }
      let b = im(e.L, "cmd");
      let S = b.value === ")" ? nd(e, ")", b) : An(e, ")", y.endIndex, y.endIndex, []);
      _.push(S);
      m = An(e, "array", y.startIndex, S.endIndex, _);
    } else {
      let g = tn(e.L);
      if (g && g !== " " && g !== "\t" && g !== `
` && g !== ";" && g !== "&" && g !== "|" && g !== ")" && g !== "}") {
        m = Mq(e, "arg");
      }
    }
    let f = m ? [c, p, m] : [c, p];
    let h = m ? m.endIndex : d;
    return An(e, "variable_assignment", n, h, f);
  }
  function Nfp(e) {
    da(e.L);
    let t = tn(e.L);
    if ((t === "@" || t === "*") && tn(e.L, 1) === "]") {
      let n = e.L.b;
      _t(e.L);
      return An(e, "word", n, e.L.b, []);
    }
    if (t === "(" && tn(e.L, 1) === "(") {
      let n = e.L.b;
      _t(e.L);
      _t(e.L);
      let r = An(e, "((", n, e.L.b, []);
      let o = r2n(e, "))", "var");
      da(e.L);
      let s;
      if (tn(e.L) === ")" && tn(e.L, 1) === ")") {
        let a = e.L.b;
        _t(e.L);
        _t(e.L);
        s = An(e, "))", a, e.L.b, []);
      } else {
        s = An(e, "))", e.L.b, e.L.b, []);
      }
      let i = o ? [r, o, s] : [r, s];
      return An(e, "compound_statement", r.startIndex, s.endIndex, i);
    }
    return r2n(e, "]", "word");
  }
  function Lfp(e, t, n) {
    let r = WOe(e, t, n);
    if (/^\d+$/.test(r)) {
      return An(e, "number", t, n, []);
    }
    if (/^\$([a-zA-Z_]\w*)$/.exec(r)) {
      let s = An(e, "$", t, t + 1, []);
      let i = An(e, "variable_name", t + 1, n, []);
      return An(e, "simple_expansion", t, n, [s, i]);
    }
    if (r.length === 2 && r[0] === "$" && Tdt.vZc(r[1])) {
      let s = An(e, "$", t, t + 1, []);
      let i = An(e, "special_variable_name", t + 1, n, []);
      return An(e, "simple_expansion", t, n, [s, i]);
    }
    return An(e, "word", t, n, []);
  }
  function wua(e) {
    let t = tn(e.L);
    if (t === "" || t === `
`) {
      return false;
    }
    if (t === "|" || t === "&" || t === ";" || t === "(" || t === ")") {
      return false;
    }
    if (t === "<" || t === ">") {
      return tn(e.L, 1) === "(";
    }
    if (yx(t)) {
      let n = e.L.i;
      while (n < e.L.len && yx(e.L.src[n])) {
        n++;
      }
      let r = n < e.L.len ? e.L.src[n] : "";
      if (r === ">" || r === "<") {
        return false;
      }
    }
    if (t === "}") {
      return false;
    }
    if (e.stopToken === "]" && t === "]") {
      return false;
    }
    return true;
  }
  function Sdt(e, t = false) {
    let n = uf(e.L);
    da(e.L);
    let r = null;
    if (yx(tn(e.L))) {
      let i = e.L.b;
      let a = e.L.i;
      while (a < e.L.len && yx(e.L.src[a])) {
        a++;
      }
      let l = a < e.L.len ? e.L.src[a] : "";
      if (l === ">" || l === "<") {
        while (e.L.i < a) {
          _t(e.L);
        }
        r = An(e, "file_descriptor", i, e.L.b, []);
      }
    }
    if (r === null && tn(e.L) === "{") {
      let i = e.L.i + 1;
      if (i < e.L.len && /[A-Za-z_]/.test(e.L.src[i])) {
        while (i < e.L.len && /[A-Za-z0-9_]/.test(e.L.src[i])) {
          i++;
        }
        if (e.L.src[i] === "[") {
          let a = 0;
          let l = false;
          let c = false;
          while (i < e.L.len) {
            let u = e.L.src[i];
            if (l) {
              if (u === "'") {
                l = false;
              }
            } else if (c) {
              if (u === "\\" && i + 1 < e.L.len) {
                i++;
              } else if (u === '"') {
                c = false;
              }
            } else if (u === "\\" && i + 1 < e.L.len) {
              i++;
            } else if (u === "'") {
              l = true;
            } else if (u === '"') {
              c = true;
            } else if (u === "[") {
              a++;
            } else if (u === "]") {
              if (a--, a === 0) {
                i++;
                break;
              }
            } else if (u === "\\" && e.L.src[i + 1] === `
`) {
              i += 2;
              continue;
            } else if (u === `
`) {
              break;
            }
            i++;
          }
        }
        if (e.L.src[i] === "}") {
          let a = i + 1 < e.L.len ? e.L.src[i + 1] : "";
          if (a === ">" || a === "<") {
            let l = e.L.b;
            while (e.L.i <= i) {
              _t(e.L);
            }
            r = An(e, "variable_name", l, e.L.b, []);
          }
        }
      }
    }
    let o = im(e.L, "arg");
    if (o.type !== "OP") {
      Fu(e.L, n);
      return null;
    }
    let s = o.value;
    if (s === "<<<") {
      let i = nd(e, "<<<", o);
      da(e.L);
      let a = Mq(e, "arg");
      let l = a ? a.endIndex : i.endIndex;
      let c = a ? [i, a] : [i];
      return An(e, "herestring_redirect", r ? r.startIndex : i.startIndex, l, r ? [r, ...c] : c);
    }
    if (s === "<<" || s === "<<-") {
      let i = nd(e, s, o);
      Afp(e.L);
      let a = e.L.b;
      let l = false;
      let c = "";
      let u = tn(e.L);
      if (u === "'" || u === '"') {
        l = true;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== u) {
          c += tn(e.L);
          _t(e.L);
        }
        if (e.L.i < e.L.len) {
          _t(e.L);
        }
      } else if (u === "\\") {
        if (l = true, _t(e.L), e.L.i < e.L.len && tn(e.L) !== `
`) {
          c += tn(e.L);
          _t(e.L);
        }
        while (e.L.i < e.L.len && toe(tn(e.L))) {
          c += tn(e.L);
          _t(e.L);
        }
      } else {
        while (e.L.i < e.L.len && kfp(tn(e.L))) {
          c += tn(e.L);
          _t(e.L);
        }
      }
      let d = e.L.b;
      if (u === '"' && /[`$\\\n]/.test(c)) {
        throw e.aborted = true, Error("heredoc delimiter contains substitution/escape chars");
      }
      if (e.L.i < e.L.len) {
        let h = tn(e.L);
        if (h !== " " && h !== "\t" && h !== `
` && h !== "<" && h !== ">" && h !== "|" && h !== "&" && h !== ";" && h !== "(" && h !== ")") {
          throw e.aborted = true, Error("heredoc delimiter word continues past scanned segment");
        }
      }
      if (/[\uD800-\uDFFF]/.test(c)) {
        throw e.aborted = true, Error("heredoc delimiter contains astral/surrogate code unit");
      }
      let p = An(e, "heredoc_start", a, d, []);
      e.L.heredocs.push({
        delim: c,
        stripTabs: s === "<<-",
        quoted: l,
        bodyStart: 0,
        bodyEnd: 0,
        endStart: 0,
        endEnd: 0
      });
      let m = r ? [r, i, p] : [i, p];
      let f = r ? r.startIndex : i.startIndex;
      while (true) {
        da(e.L);
        let h = tn(e.L);
        if (h === `
` || h === "" || e.L.i >= e.L.len) {
          break;
        }
        if (h === ">" || h === "<" || yx(h)) {
          let _ = uf(e.L);
          let b = Sdt(e);
          if (b && b.type === "file_redirect") {
            m.push(b);
            continue;
          }
          Fu(e.L, _);
        }
        if (h === "|" && tn(e.L, 1) !== "|") {
          let _ = e.L.b;
          _t(e.L);
          da(e.L);
          let b = [];
          while (true) {
            let S = GOe(e);
            if (!S) {
              break;
            }
            if (b.push(S), da(e.L), tn(e.L) === "|" && tn(e.L, 1) !== "|") {
              let E = e.L.b;
              _t(e.L);
              b.push(An(e, "|", E, e.L.b, []));
              da(e.L);
              continue;
            }
            break;
          }
          if (b.length > 0) {
            let S = b.at(-1);
            m.push(An(e, "pipeline", b[0].startIndex, S.endIndex, b));
          } else {
            m.push(An(e, "ERROR", _, e.L.b, []));
          }
          continue;
        }
        if (h === "&" && tn(e.L, 1) === "&" || h === "|" && tn(e.L, 1) === "|") {
          let _ = e.L.b;
          _t(e.L);
          _t(e.L);
          da(e.L);
          let b = GOe(e);
          if (b) {
            m.push(b);
          } else {
            m.push(An(e, "ERROR", _, e.L.b, []));
          }
          continue;
        }
        if (h === "&" || h === ";" || h === "(" || h === ")") {
          let _ = e.L.b;
          while (e.L.i < e.L.len && tn(e.L) !== `
`) {
            _t(e.L);
          }
          m.push(An(e, "ERROR", _, e.L.b, []));
          break;
        }
        let g = Mq(e, "arg");
        if (g) {
          m.push(g);
          continue;
        }
        let y = e.L.b;
        while (e.L.i < e.L.len && tn(e.L) !== `
`) {
          _t(e.L);
        }
        if (e.L.b > y) {
          m.push(An(e, "ERROR", y, e.L.b, []));
        }
        break;
      }
      return An(e, "heredoc_redirect", f, e.L.b, m);
    }
    if (s === "<&-" || s === ">&-") {
      let i = nd(e, s, o);
      let a = [];
      if (r) {
        a.push(r);
      }
      a.push(i);
      da(e.L);
      let l = uf(e.L);
      let c = wua(e) ? Mq(e, "arg") : null;
      if (c) {
        a.push(c);
      } else {
        Fu(e.L, l);
      }
      let u = r ? r.startIndex : i.startIndex;
      let d = c ? c.endIndex : i.endIndex;
      return An(e, "file_redirect", u, d, a);
    }
    if (s === ">" || s === ">>" || s === ">&" || s === ">|" || s === "&>" || s === "&>>" || s === "<" || s === "<&") {
      let i = nd(e, s, o);
      let a = [];
      if (r) {
        a.push(r);
      }
      a.push(i);
      let l = i.endIndex;
      let c = 0;
      while (true) {
        if (da(e.L), !wua(e)) {
          break;
        }
        if (!t && c >= 1) {
          break;
        }
        let d = tn(e.L);
        let p = tn(e.L, 1);
        let m = null;
        if ((d === "<" || d === ">") && p === "(") {
          m = o2n(e);
        } else {
          m = Mq(e, "arg");
        }
        if (!m) {
          break;
        }
        a.push(m);
        l = m.endIndex;
        c++;
      }
      let u = r ? r.startIndex : i.startIndex;
      return An(e, "file_redirect", u, l, a);
    }
    Fu(e.L, n);
    return null;
  }
  function o2n(e) {
    let t = tn(e.L);
    if (t !== "<" && t !== ">" || tn(e.L, 1) !== "(") {
      return null;
    }
    let n = e.L.b;
    _t(e.L);
    _t(e.L);
    let r = An(e, t + "(", n, e.L.b, []);
    let o = Dq(e, ")");
    da(e.L);
    let s;
    if (tn(e.L) === ")") {
      let i = e.L.b;
      _t(e.L);
      s = An(e, ")", i, e.L.b, []);
    } else {
      s = An(e, ")", e.L.b, e.L.b, []);
    }
    return An(e, "process_substitution", n, s.endIndex, [r, ...o, s]);
  }
  function qlo(e) {
    while (e.L.i < e.L.len && e.L.src[e.L.i] !== `
`) {
      _t(e.L);
    }
    if (e.L.i < e.L.len) {
      _t(e.L);
    }
    for (let t of e.L.heredocs) {
      t.bodyStart = e.L.b;
      let n = t.delim.length;
      if (t.stripTabs && t.delim.startsWith("\t")) {
        throw e.aborted = true, Error("ambiguous heredoc terminator (<<- tab-prefixed delim)");
      }
      while (e.L.i < e.L.len) {
        let r = e.L.i;
        let o = e.L.b;
        let s = r;
        if (t.stripTabs) {
          while (s < e.L.len && e.L.src[s] === "\t") {
            s++;
          }
        }
        if (e.L.src.startsWith(t.delim, s)) {
          let i = s + n;
          let a = i < e.L.len ? e.L.src[i] : "";
          if (a === "" || a === `
` || a === "\r") {
            t.bodyEnd = o;
            while (e.L.i < s) {
              _t(e.L);
            }
            t.endStart = e.L.b;
            for (let c = 0; c < n; c++) {
              _t(e.L);
            }
            if (t.endEnd = e.L.b, e.L.i < e.L.len && e.L.src[e.L.i] === `
`) {
              _t(e.L);
            }
            return;
          }
          let l = i;
          while (l < e.L.len) {
            let c = e.L.src[l];
            if (c === `
`) {
              break;
            }
            if (c === ")" || c === "`" || c === "}") {
              throw e.aborted = true, Error("ambiguous heredoc terminator (shell_eof_token)");
            }
            l++;
          }
        }
        while (e.L.i < e.L.len && e.L.src[e.L.i] !== `
`) {
          _t(e.L);
        }
        if (e.L.i < e.L.len) {
          _t(e.L);
        }
      }
      t.bodyEnd = e.L.b;
      t.endStart = e.L.b;
      t.endEnd = e.L.b;
    }
  }
  function Ffp(e, t, n) {
    let r = uf(e.L);
    Ufp(e, t);
    let o = [];
    let s = e.L.b;
    let i = false;
    while (e.L.b < n) {
      let a = tn(e.L);
      if (a === "\\") {
        let l = tn(e.L, 1);
        if (l === "$" || l === "`" || l === "\\") {
          _t(e.L);
          _t(e.L);
          continue;
        }
        _t(e.L);
        continue;
      }
      if (a === "$" || a === "`") {
        if (a === "$" && tn(e.L, 1) === "'") {
          _t(e.L);
          continue;
        }
        let l = e.L.b;
        let c = sTe(e);
        if (c && (c.type === "simple_expansion" || c.type === "expansion" || c.type === "command_substitution" || c.type === "arithmetic_expansion")) {
          if (i && l > s) {
            o.push(An(e, "heredoc_content", s, l, []));
          }
          o.push(c);
          s = e.L.b;
          i = true;
        }
        continue;
      }
      _t(e.L);
    }
    if (i) {
      o.push(An(e, "heredoc_content", s, n, []));
    }
    Fu(e.L, r);
    return o;
  }
  function Ufp(e, t) {
    if (!e.L.byteTable) {
      Pua(e.L, 0);
    }
    let n = e.L.byteTable;
    let r = 0;
    let o = e.src.length;
    while (r < o) {
      let s = r + o >>> 1;
      if (n[s] < t) {
        r = s + 1;
      } else {
        o = s;
      }
    }
    e.L.i = r;
    e.L.b = t;
  }
  function Mq(e, t) {
    da(e.L);
    let n = [];
    while (e.L.i < e.L.len) {
      let s = tn(e.L);
      if (s === " " || s === "\t" || s === `
` || s === "\r" || s === "" || s === "|" || s === "&" || s === ";" || s === "(" || s === ")") {
        break;
      }
      if (s === "<" || s === ">") {
        if (tn(e.L, 1) === "(") {
          let a = o2n(e);
          if (a) {
            n.push(a);
          }
          continue;
        }
        break;
      }
      if (s === '"') {
        n.push(lde(e));
        continue;
      }
      if (s === "'") {
        let a = im(e.L, "arg");
        n.push(nd(e, "raw_string", a));
        continue;
      }
      if (s === "$") {
        let a = tn(e.L, 1);
        if (a === "'") {
          let c = im(e.L, "arg");
          n.push(nd(e, "ansi_c_string", c));
          continue;
        }
        if (a === '"') {
          let c = {
            type: "DOLLAR",
            value: "$",
            start: e.L.b,
            end: e.L.b + 1
          };
          _t(e.L);
          n.push(nd(e, "$", c));
          n.push(lde(e));
          continue;
        }
        if (a === "`") {
          let c = {
            type: "DOLLAR",
            value: "$",
            start: e.L.b,
            end: e.L.b + 1
          };
          _t(e.L);
          n.push(nd(e, "$", c));
          continue;
        }
        let l = sTe(e);
        if (l) {
          n.push(l);
        }
        continue;
      }
      if (s === "`") {
        if (e.inBacktick > 0) {
          break;
        }
        let a = s2n(e);
        if (a) {
          n.push(a);
        }
        continue;
      }
      if (s === "{") {
        let a = $fp(e);
        if (a) {
          n.push(a);
          continue;
        }
        let l = tn(e.L, 1);
        if (l === ";" || l === "|" || l === "&" || l === `
` || l === "" || l === ")" || l === " " || l === "\t") {
          let u = e.L.b;
          _t(e.L);
          n.push(An(e, "word", u, e.L.b, []));
          continue;
        }
        let c = Hfp(e);
        if (c) {
          for (let u of c) {
            n.push(u);
          }
          continue;
        }
      }
      if (s === "}") {
        let a = e.L.b;
        _t(e.L);
        n.push(An(e, "word", a, e.L.b, []));
        continue;
      }
      if (s === "[" || s === "]") {
        let a = e.L.b;
        _t(e.L);
        n.push(An(e, "word", a, e.L.b, []));
        continue;
      }
      let i = Bfp(e);
      if (!i) {
        break;
      }
      if (i.type === "word" && /^-?(0x)?[0-9]+#$/.test(i.text) && tn(e.L) === "$" && (tn(e.L, 1) === "{" || tn(e.L, 1) === "(")) {
        let a = sTe(e);
        if (a) {
          n.push(An(e, "number", i.startIndex, a.endIndex, [a]));
          continue;
        }
      }
      n.push(i);
    }
    if (n.length === 0) {
      return null;
    }
    if (n.length === 1) {
      return n[0];
    }
    let r = n[0];
    let o = n.at(-1);
    return An(e, "concatenation", r.startIndex, o.endIndex, n);
  }
  function Bfp(e) {
    let t = e.L.b;
    let n = e.L.i;
    while (e.L.i < e.L.len) {
      let s = tn(e.L);
      if (s === "\\") {
        if (e.L.i + 1 >= e.L.len) {
          break;
        }
        if (e.L.src[e.L.i + 1] === `
`) {
          break;
        }
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (s === " " || s === "\t" || s === `
` || s === "\r" || s === "" || s === "|" || s === "&" || s === ";" || s === "(" || s === ")" || s === "<" || s === ">" || s === '"' || s === "'" || s === "$" || s === "`" || s === "{" || s === "}" || s === "[" || s === "]") {
        break;
      }
      _t(e.L);
    }
    if (e.L.b === t) {
      return null;
    }
    let r = e.src.slice(n, e.L.i);
    let o = /^-?\d+$/.test(r) ? "number" : "word";
    return An(e, o, t, e.L.b, []);
  }
  function $fp(e) {
    let t = uf(e.L);
    if (tn(e.L) !== "{") {
      return null;
    }
    let n = e.L.b;
    _t(e.L);
    let r = e.L.b;
    let o = e.L.b;
    while (yx(tn(e.L)) || a$(tn(e.L))) {
      _t(e.L);
    }
    let s = e.L.b;
    if (s === o || tn(e.L) !== "." || tn(e.L, 1) !== ".") {
      Fu(e.L, t);
      return null;
    }
    let i = e.L.b;
    _t(e.L);
    _t(e.L);
    let a = e.L.b;
    let l = e.L.b;
    while (yx(tn(e.L)) || a$(tn(e.L))) {
      _t(e.L);
    }
    let c = e.L.b;
    if (c === l || tn(e.L) !== "}") {
      Fu(e.L, t);
      return null;
    }
    let u = e.L.b;
    _t(e.L);
    let d = e.L.b;
    let p = WOe(e, o, s);
    let m = WOe(e, l, c);
    let f = /^\d+$/.test(p);
    let h = /^\d+$/.test(m);
    if (f !== h) {
      Fu(e.L, t);
      return null;
    }
    if (!f && (p.length !== 1 || m.length !== 1)) {
      Fu(e.L, t);
      return null;
    }
    let g = f ? "number" : "word";
    let y = h ? "number" : "word";
    return An(e, "brace_expression", n, d, [An(e, "{", n, r, []), An(e, g, o, s, []), An(e, "..", i, a, []), An(e, y, l, c, []), An(e, "}", u, d, [])]);
  }
  function Hfp(e) {
    if (tn(e.L) !== "{") {
      return null;
    }
    let t = e.L.b;
    _t(e.L);
    let n = e.L.b;
    let r = [An(e, "word", t, n, [])];
    while (e.L.i < e.L.len) {
      let o = tn(e.L);
      if (o === "}" || o === `
` || o === ";" || o === "|" || o === "&" || o === " " || o === "\t" || o === "<" || o === ">" || o === "(" || o === ")") {
        break;
      }
      if (o === "[" || o === "]") {
        let a = e.L.b;
        _t(e.L);
        r.push(An(e, "word", a, e.L.b, []));
        continue;
      }
      let s = e.L.b;
      while (e.L.i < e.L.len) {
        let a = tn(e.L);
        if (a === "\\" && e.L.i + 1 < e.L.len) {
          _t(e.L);
          _t(e.L);
          continue;
        }
        if (a === "}" || a === `
` || a === ";" || a === "|" || a === "&" || a === " " || a === "\t" || a === "<" || a === ">" || a === "(" || a === ")" || a === "[" || a === "]") {
          break;
        }
        _t(e.L);
      }
      let i = e.L.b;
      if (i > s) {
        let a = WOe(e, s, i);
        let l = /^-?\d+$/.test(a) ? "number" : "word";
        r.push(An(e, l, s, i, []));
      } else {
        break;
      }
    }
    if (tn(e.L) === "}") {
      let o = e.L.b;
      _t(e.L);
      r.push(An(e, "word", o, e.L.b, []));
    }
    return r;
  }
  function lde(e) {
    let t = e.L.b;
    _t(e.L);
    e.inDquote++;
    let n = e.L.b;
    let o = [An(e, '"', t, n, [])];
    let s = e.L.b;
    let i = e.L.i;
    let a = () => {
      if (e.L.b > s) {
        let c = e.src.slice(i, e.L.i);
        if (!/^[ \t]+$/.test(c)) {
          o.push(An(e, "string_content", s, e.L.b, []));
        }
      }
    };
    while (e.L.i < e.L.len) {
      let c = tn(e.L);
      if (c === '"') {
        break;
      }
      if (c === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (c === `
`) {
        a();
        _t(e.L);
        s = e.L.b;
        i = e.L.i;
        continue;
      }
      if (c === "$") {
        let u = tn(e.L, 1);
        if (u === "(" || u === "{" || a$(u) || Tdt.vZc(u) || yx(u)) {
          a();
          let d = sTe(e);
          if (d) {
            o.push(d);
          }
          s = e.L.b;
          i = e.L.i;
          continue;
        }
        if (u !== '"' && u !== "") {
          a();
          let d = e.L.b;
          _t(e.L);
          o.push(An(e, "$", d, e.L.b, []));
          s = e.L.b;
          i = e.L.i;
          continue;
        }
      }
      if (c === "`") {
        a();
        let u = s2n(e);
        if (u) {
          o.push(u);
        }
        s = e.L.b;
        i = e.L.i;
        continue;
      }
      _t(e.L);
    }
    a();
    let l;
    if (tn(e.L) === '"') {
      let c = e.L.b;
      _t(e.L);
      l = An(e, '"', c, e.L.b, []);
    } else {
      l = An(e, '"', e.L.b, e.L.b, []);
    }
    o.push(l);
    e.inDquote--;
    return An(e, "string", t, l.endIndex, o);
  }
  function sTe(e) {
    let t = tn(e.L, 1);
    let n = e.L.b;
    if (t === "(" && tn(e.L, 2) === "(") {
      _t(e.L);
      _t(e.L);
      _t(e.L);
      let i = An(e, "$((", n, e.L.b, []);
      let a = uf(e.L);
      let l = g3t(e, "))", "var");
      da(e.L);
      let c;
      let u = false;
      if (tn(e.L) !== ")" || tn(e.L, 1) !== ")") {
        Iua(e, a, "))");
        u = true;
      }
      if (tn(e.L) === ")" && tn(e.L, 1) === ")") {
        let d = e.L.b;
        _t(e.L);
        _t(e.L);
        c = An(e, "))", d, e.L.b, []);
      } else {
        c = An(e, "))", e.L.b, e.L.b, []);
      }
      return An(e, u ? "ERROR" : "arithmetic_expansion", n, c.endIndex, [i, ...l, c]);
    }
    if (t === "[") {
      _t(e.L);
      _t(e.L);
      let i = An(e, "$[", n, e.L.b, []);
      let a = uf(e.L);
      let l = g3t(e, "]", "var");
      da(e.L);
      let c;
      let u = false;
      if (tn(e.L) !== "]") {
        Iua(e, a, "]");
        u = true;
      }
      if (tn(e.L) === "]") {
        let d = e.L.b;
        _t(e.L);
        c = An(e, "]", d, e.L.b, []);
      } else {
        c = An(e, "]", e.L.b, e.L.b, []);
      }
      return An(e, u ? "ERROR" : "arithmetic_expansion", n, c.endIndex, [i, ...l, c]);
    }
    if (t === "(") {
      _t(e.L);
      _t(e.L);
      let i = An(e, "$(", n, e.L.b, []);
      let a = e.inDquote;
      e.inDquote = 0;
      let l = Dq(e, ")");
      e.inDquote = a;
      da(e.L);
      let c;
      let u = false;
      if (tn(e.L) === ")") {
        let d = e.L.b;
        _t(e.L);
        c = An(e, ")", d, e.L.b, []);
      } else {
        u = true;
        let d = e.L.b;
        let p = 1;
        while (e.L.i < e.L.len) {
          let m = tn(e.L);
          if (m === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (m === '"' || m === "'") {
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== m) {
              if (m === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "`") {
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "`") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "$") {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "'") {
            _t(e.L);
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "'") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "(") {
            p++;
          } else if (m === ")") {
            if (p--, p === 0) {
              break;
            }
          }
          _t(e.L);
        }
        if (l.push(An(e, "ERROR", d, e.L.b, [])), tn(e.L) === ")") {
          let m = e.L.b;
          _t(e.L);
          c = An(e, ")", m, e.L.b, []);
        } else {
          c = An(e, "ERROR", e.L.b, e.L.b, []);
        }
      }
      if (!u && l.length === 1 && l[0].type === "redirected_statement" && l[0].children.length === 1 && l[0].children[0].type === "file_redirect") {
        l = l[0].children;
      }
      return An(e, u ? "ERROR" : "command_substitution", n, c.endIndex, [i, ...l, c]);
    }
    if (t === "{") {
      _t(e.L);
      _t(e.L);
      let i = An(e, "${", n, e.L.b, []);
      let a = jfp(e);
      let l;
      let c = false;
      while (tn(e.L) === `
`) {
        _t(e.L);
      }
      if (tn(e.L) === "}") {
        let u = e.L.b;
        _t(e.L);
        l = An(e, "}", u, e.L.b, []);
      } else {
        c = true;
        let u = e.L.b;
        let d = 1;
        while (e.L.i < e.L.len) {
          let m = tn(e.L);
          if (m === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (m === '"' || m === "'") {
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== m) {
              if (m === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "(") {
            let f = 1;
            _t(e.L);
            _t(e.L);
            while (e.L.i < e.L.len && f > 0) {
              let h = tn(e.L);
              if (h === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              } else if (h === "$" && tn(e.L, 1) === "$") {
                _t(e.L);
              } else if (h === "$" && tn(e.L, 1) === "'") {
                _t(e.L);
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "'") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (h === '"' || h === "'") {
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== h) {
                  if (h === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (h === "`") {
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "`") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (h === "(") {
                f++;
              } else if (h === ")") {
                f--;
              }
              _t(e.L);
            }
            continue;
          }
          if (m === "`") {
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "`") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "$") {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "'") {
            _t(e.L);
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "'") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (e.L.i < e.L.len) {
              _t(e.L);
            }
            continue;
          }
          if (m === "$" && tn(e.L, 1) === "{") {
            d++;
            _t(e.L);
          } else if (m === "}") {
            if (d--, d === 0) {
              break;
            }
          }
          _t(e.L);
        }
        let p = An(e, "ERROR", u, e.L.b, []);
        if (tn(e.L) === "}") {
          let m = e.L.b;
          _t(e.L);
          l = An(e, "}", m, e.L.b, []);
        } else {
          l = An(e, "ERROR", e.L.b, e.L.b, []);
        }
        a.push(p);
      }
      if (!c && e.inDquote > 0 && WOe(e, i.endIndex, l.startIndex).includes("'")) {
        c = true;
      }
      return An(e, c || e.zshBraceDiff ? "ERROR" : "expansion", n, l.endIndex, [i, ...a, l]);
    }
    _t(e.L);
    let r = e.L.b;
    let o = An(e, "$", n, r, []);
    let s = tn(e.L);
    if (s === "_" && !toe(tn(e.L, 1))) {
      let i = e.L.b;
      _t(e.L);
      let a = An(e, "special_variable_name", i, e.L.b, []);
      return An(e, "simple_expansion", n, e.L.b, [o, a]);
    }
    if (a$(s)) {
      let i = e.L.b;
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      let a = An(e, "variable_name", i, e.L.b, []);
      return An(e, "simple_expansion", n, e.L.b, [o, a]);
    }
    if (yx(s)) {
      let i = e.L.b;
      _t(e.L);
      let a = An(e, "variable_name", i, e.L.b, []);
      return An(e, "simple_expansion", n, e.L.b, [o, a]);
    }
    if (Tdt.vZc(s)) {
      let i = e.L.b;
      _t(e.L);
      let a = An(e, "special_variable_name", i, e.L.b, []);
      return An(e, "simple_expansion", n, e.L.b, [o, a]);
    }
    if (s === "'") {
      _t(e.L);
      while (e.L.i < e.L.len && tn(e.L) !== "'") {
        if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
          _t(e.L);
        }
        _t(e.L);
      }
      if (tn(e.L) === "'") {
        _t(e.L);
      }
      return An(e, "ansi_c_string", n, e.L.b, []);
    }
    return o;
  }
  function jfp(e) {
    let t = [];
    da(e.L);
    {
      let s = tn(e.L);
      let i = tn(e.L, 1);
      if (s === "#" && i === "!" && tn(e.L, 2) === "}") {
        _t(e.L);
        _t(e.L);
        return t;
      }
      if (s === "!" && i === "#") {
        let a = 2;
        if (tn(e.L, a) === "#") {
          a++;
        }
        if (tn(e.L, a) === " ") {
          a++;
        }
        if (tn(e.L, a) === "}") {
          while (a-- > 0) {
            _t(e.L);
          }
          return t;
        }
      }
    }
    if (tn(e.L) === "#") {
      let s = e.L.b;
      _t(e.L);
      t.push(An(e, "#", s, e.L.b, []));
    }
    let n = tn(e.L);
    if ((n === "!" || n === "=" || n === "~") && (a$(tn(e.L, 1)) || yx(tn(e.L, 1)))) {
      let s = e.L.b;
      _t(e.L);
      t.push(An(e, n, s, e.L.b, []));
    }
    if (da(e.L), a$(tn(e.L))) {
      let s = e.L.b;
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      t.push(An(e, "variable_name", s, e.L.b, []));
    } else if (yx(tn(e.L))) {
      let s = e.L.b;
      while (yx(tn(e.L))) {
        _t(e.L);
      }
      t.push(An(e, "variable_name", s, e.L.b, []));
    } else if (Tdt.vZc(tn(e.L))) {
      let s = e.L.b;
      _t(e.L);
      t.push(An(e, "special_variable_name", s, e.L.b, []));
    }
    if (tn(e.L) === "[") {
      let s = t.at(-1);
      let i = e.L.b;
      _t(e.L);
      let a = An(e, "[", i, e.L.b, []);
      let l = Nfp(e);
      da(e.L);
      let c = e.L.b;
      if (tn(e.L) === "]") {
        _t(e.L);
      }
      let u = An(e, "]", c, e.L.b, []);
      if (s) {
        let d = l ? [s, a, l, u] : [s, a, u];
        t[t.length - 1] = An(e, "subscript", s.startIndex, e.L.b, d);
      }
    }
    da(e.L);
    let r = tn(e.L);
    if ((r === "*" || r === "@") && tn(e.L, 1) === "}") {
      let s = e.L.b;
      _t(e.L);
      t.push(An(e, r, s, e.L.b, []));
      return t;
    }
    if (r === "@" && a$(tn(e.L, 1))) {
      let s = e.L.b;
      _t(e.L);
      t.push(An(e, "@", s, e.L.b, []));
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      return t;
    }
    let o = tn(e.L);
    if (o === ":") {
      let s = tn(e.L, 1);
      if (s === "}") {
        _t(e.L);
        return t;
      }
      if (s !== "-" && s !== "=" && s !== "?" && s !== "+") {
        _t(e.L);
        da(e.L);
        let i = tn(e.L);
        let a;
        if (i === "-" && yx(tn(e.L, 1))) {
          let l = e.L.b;
          _t(e.L);
          while (yx(tn(e.L))) {
            _t(e.L);
          }
          a = An(e, "number", l, e.L.b, []);
        } else {
          a = r2n(e, ":}", "var");
        }
        if (a) {
          t.push(a);
        }
        if (da(e.L), tn(e.L) === ":") {
          _t(e.L);
          da(e.L);
          let l = tn(e.L);
          let c;
          if (l === "-" && yx(tn(e.L, 1))) {
            let u = e.L.b;
            _t(e.L);
            while (yx(tn(e.L))) {
              _t(e.L);
            }
            c = An(e, "number", u, e.L.b, []);
          } else {
            c = r2n(e, "}", "var");
          }
          if (c) {
            t.push(c);
          }
        }
        return t;
      }
    }
    if (o === ":" || o === "#" || o === "%" || o === "/" || o === "^" || o === "," || o === "-" || o === "=" || o === "?" || o === "+") {
      let s = e.L.b;
      let i = tn(e.L, 1);
      let a = o;
      if (o === ":" && (i === "-" || i === "=" || i === "?" || i === "+")) {
        _t(e.L);
        _t(e.L);
        a = o + i;
      } else if ((o === "#" || o === "%" || o === "/" || o === "^" || o === ",") && i === o) {
        _t(e.L);
        _t(e.L);
        a = o + o;
      } else {
        _t(e.L);
      }
      t.push(An(e, a, s, e.L.b, []));
      let l = a === "#" || a === "##" || a === "%" || a === "%%" || a === "/" || a === "//" || a === "^" || a === "^^" || a === "," || a === ",,";
      if (a === "/" || a === "//") {
        let c = tn(e.L);
        if (c === "#" || c === "%") {
          let u = e.L.b;
          _t(e.L);
          t.push(An(e, c, u, e.L.b, []));
        }
        if (tn(e.L) === '"') {
          t.push(lde(e));
          let u = t2n(e, "regex", true);
          if (u) {
            t.push(u);
          }
        } else {
          let u = t2n(e, "regex", true);
          if (u) {
            t.push(u);
          }
        }
        if (tn(e.L) === "/") {
          let u = e.L.b;
          _t(e.L);
          t.push(An(e, "/", u, e.L.b, []));
          let d = t2n(e, "replword", false);
          if (d) {
            if (d.type === "concatenation" && d.children.length === 2 && d.children[0].type === "command_substitution") {
              t.push(d.children[0]);
              t.push(d.children[1]);
            } else {
              t.push(d);
            }
          }
        }
      } else if (a === "#" || a === "##" || a === "%" || a === "%%") {
        for (let c of qfp(e)) {
          t.push(c);
        }
      } else {
        let c = t2n(e, l ? "regex" : "word", false);
        if (c) {
          t.push(c);
        }
      }
    }
    return t;
  }
  function t2n(e, t, n) {
    let r = e.L.b;
    if (t === "word" && tn(e.L) === "(") {
      _t(e.L);
      let c = [An(e, "(", r, e.L.b, [])];
      while (e.L.i < e.L.len) {
        da(e.L);
        let u = tn(e.L);
        if (u === ")" || u === "}" || u === `
` || u === "") {
          break;
        }
        let d = e.L.b;
        while (e.L.i < e.L.len) {
          let p = tn(e.L);
          if (p === ")" || p === "}" || p === " " || p === "\t" || p === `
` || p === "") {
            break;
          }
          if (p === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (p === "$" && tn(e.L, 1) === "$") {
            _t(e.L);
            _t(e.L);
            continue;
          }
          if (p === "$" && tn(e.L, 1) === "'") {
            _t(e.L);
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "'") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (tn(e.L) === "'") {
              _t(e.L);
            }
            continue;
          }
          if (p === "$" && tn(e.L, 1) === "(") {
            e.zshBraceDiff = true;
          }
          if (p === '"' || p === "'") {
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== p) {
              if (p === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (tn(e.L) === p) {
              _t(e.L);
            }
            continue;
          }
          if (p === "`") {
            e.zshBraceDiff = true;
            _t(e.L);
            while (e.L.i < e.L.len && tn(e.L) !== "`") {
              if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              }
              _t(e.L);
            }
            if (tn(e.L) === "`") {
              _t(e.L);
            }
            continue;
          }
          if (p === "{") {
            e.zshBraceDiff = true;
          }
          _t(e.L);
        }
        if (e.L.b > d) {
          c.push(An(e, "word", d, e.L.b, []));
        } else {
          break;
        }
      }
      if (tn(e.L) === ")") {
        let u = e.L.b;
        _t(e.L);
        c.push(An(e, ")", u, e.L.b, []));
      }
      while (tn(e.L) === `
`) {
        _t(e.L);
      }
      return An(e, "array", r, e.L.b, c);
    }
    if (t === "regex") {
      while (e.L.i < e.L.len) {
        let c = tn(e.L);
        if (c === "{") {
          e.zshBraceDiff = true;
        }
        if (c === "}") {
          break;
        }
        if (n && c === "/") {
          break;
        }
        if (c === "\\" && e.L.i + 1 < e.L.len) {
          _t(e.L);
          _t(e.L);
          continue;
        }
        if (c === '"' || c === "'") {
          _t(e.L);
          while (e.L.i < e.L.len && tn(e.L) !== c) {
            if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            }
            _t(e.L);
          }
          if (tn(e.L) === c) {
            _t(e.L);
          }
          continue;
        }
        if (c === "`") {
          e.zshBraceDiff = true;
          _t(e.L);
          while (e.L.i < e.L.len && tn(e.L) !== "`") {
            if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            }
            _t(e.L);
          }
          if (tn(e.L) === "`") {
            _t(e.L);
          }
          continue;
        }
        if (c === "$") {
          let u = tn(e.L, 1);
          if (u === "{") {
            let d = 0;
            _t(e.L);
            _t(e.L);
            d++;
            while (e.L.i < e.L.len && d > 0) {
              let p = tn(e.L);
              if (p === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              } else if (p === "$" && tn(e.L, 1) === "$") {
                _t(e.L);
              } else if (p === "$" && tn(e.L, 1) === "'") {
                _t(e.L);
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "'") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === '"' || p === "'") {
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== p) {
                  if (p === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === "`") {
                e.zshBraceDiff = true;
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "`") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === "$" && tn(e.L, 1) === "{") {
                d++;
                _t(e.L);
              } else if (p === "$" && tn(e.L, 1) === "(") {
                e.zshBraceDiff = true;
              } else if (p === "{") {
                e.zshBraceDiff = true;
              } else if (p === "}") {
                d--;
              }
              _t(e.L);
            }
            continue;
          }
          if (u === "(") {
            e.zshBraceDiff = true;
            let d = 0;
            _t(e.L);
            _t(e.L);
            d++;
            while (e.L.i < e.L.len && d > 0) {
              let p = tn(e.L);
              if (p === "\\" && e.L.i + 1 < e.L.len) {
                _t(e.L);
              } else if (p === "$" && tn(e.L, 1) === "$") {
                _t(e.L);
              } else if (p === "$" && tn(e.L, 1) === "'") {
                _t(e.L);
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "'") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === '"' || p === "'") {
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== p) {
                  if (p === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === "`") {
                _t(e.L);
                while (e.L.i < e.L.len && tn(e.L) !== "`") {
                  if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                    _t(e.L);
                  }
                  _t(e.L);
                }
              } else if (p === "(") {
                d++;
              } else if (p === ")") {
                d--;
              }
              _t(e.L);
            }
            continue;
          }
        }
        _t(e.L);
      }
      let l = e.L.b;
      if (l === r) {
        return null;
      }
      return An(e, "regex", r, l, []);
    }
    let o = [];
    let s = e.L.b;
    let i = () => {
      if (e.L.b > s) {
        o.push(An(e, "word", s, e.L.b, []));
      }
    };
    while (e.L.i < e.L.len) {
      let l = tn(e.L);
      if (l === "}") {
        break;
      }
      if (l === "{") {
        e.zshBraceDiff = true;
      }
      if (n && l === "/") {
        break;
      }
      if (l === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      let c = tn(e.L, 1);
      if (l === "$") {
        if (c === "{" || c === "(" || c === "[") {
          i();
          let u = sTe(e);
          if (u) {
            o.push(u);
          }
          s = e.L.b;
          continue;
        }
        if (c === "'") {
          i();
          let u = e.L.b;
          _t(e.L);
          _t(e.L);
          while (e.L.i < e.L.len && tn(e.L) !== "'") {
            if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            }
            _t(e.L);
          }
          if (tn(e.L) === "'") {
            _t(e.L);
          }
          o.push(An(e, "ansi_c_string", u, e.L.b, []));
          s = e.L.b;
          continue;
        }
        if (a$(c) || yx(c) || Tdt.vZc(c)) {
          i();
          let u = sTe(e);
          if (u) {
            o.push(u);
          }
          s = e.L.b;
          continue;
        }
      }
      if (l === '"') {
        i();
        o.push(lde(e));
        s = e.L.b;
        continue;
      }
      if (l === "'") {
        i();
        let u = e.L.b;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== "'") {
          _t(e.L);
        }
        if (tn(e.L) === "'") {
          _t(e.L);
        }
        o.push(An(e, "raw_string", u, e.L.b, []));
        s = e.L.b;
        continue;
      }
      if ((l === "<" || l === ">") && c === "(") {
        e.zshBraceDiff = true;
        i();
        let u = o2n(e);
        if (u) {
          o.push(u);
        }
        s = e.L.b;
        continue;
      }
      if (l === "`") {
        i();
        let u = s2n(e);
        if (u) {
          o.push(u);
        }
        s = e.L.b;
        continue;
      }
      _t(e.L);
    }
    if (i(), o.length > 1 && o[0].type === "word" && /^[ \t]+$/.test(o[0].text)) {
      o.shift();
    }
    if (o.length === 0) {
      return null;
    }
    if (o.length === 1) {
      return o[0];
    }
    let a = o.at(-1);
    return An(e, "concatenation", o[0].startIndex, a.endIndex, o);
  }
  function qfp(e) {
    let t = [];
    let n = e.L.b;
    let r = () => {
      if (e.L.b > n) {
        t.push(An(e, "regex", n, e.L.b, []));
      }
    };
    while (e.L.i < e.L.len) {
      let o = tn(e.L);
      if (o === "}") {
        break;
      }
      if (o === "{") {
        e.zshBraceDiff = true;
      }
      if (o === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (o === '"') {
        r();
        t.push(lde(e));
        n = e.L.b;
        continue;
      }
      if (o === "'") {
        r();
        let s = e.L.b;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== "'") {
          _t(e.L);
        }
        if (tn(e.L) === "'") {
          _t(e.L);
        }
        t.push(An(e, "raw_string", s, e.L.b, []));
        n = e.L.b;
        continue;
      }
      if (o === "`") {
        e.zshBraceDiff = true;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== "`") {
          if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
          }
          _t(e.L);
        }
        if (tn(e.L) === "`") {
          _t(e.L);
        }
        continue;
      }
      if (o === "$") {
        let s = tn(e.L, 1);
        if (s === "$") {
          _t(e.L);
          _t(e.L);
          continue;
        }
        if (s === "'") {
          r();
          let i = e.L.b;
          _t(e.L);
          _t(e.L);
          while (e.L.i < e.L.len && tn(e.L) !== "'") {
            if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            }
            _t(e.L);
          }
          if (tn(e.L) === "'") {
            _t(e.L);
          }
          t.push(An(e, "ansi_c_string", i, e.L.b, []));
          n = e.L.b;
          continue;
        }
        if (s === "{") {
          let i = 1;
          _t(e.L);
          _t(e.L);
          while (e.L.i < e.L.len && i > 0) {
            let a = tn(e.L);
            if (a === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            } else if (a === "$" && tn(e.L, 1) === "$") {
              _t(e.L);
            } else if (a === "$" && tn(e.L, 1) === "'") {
              _t(e.L);
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== "'") {
                if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === '"' || a === "'") {
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== a) {
                if (a === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === "`") {
              e.zshBraceDiff = true;
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== "`") {
                if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === "$" && tn(e.L, 1) === "{") {
              i++;
              _t(e.L);
            } else if (a === "$" && tn(e.L, 1) === "(") {
              e.zshBraceDiff = true;
            } else if (a === "{") {
              e.zshBraceDiff = true;
            } else if (a === "}") {
              i--;
            }
            _t(e.L);
          }
          continue;
        }
        if (s === "(") {
          e.zshBraceDiff = true;
          let i = 1;
          _t(e.L);
          _t(e.L);
          while (e.L.i < e.L.len && i > 0) {
            let a = tn(e.L);
            if (a === "\\" && e.L.i + 1 < e.L.len) {
              _t(e.L);
            } else if (a === "$" && tn(e.L, 1) === "$") {
              _t(e.L);
            } else if (a === "$" && tn(e.L, 1) === "'") {
              _t(e.L);
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== "'") {
                if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === '"' || a === "'") {
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== a) {
                if (a === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === "`") {
              _t(e.L);
              while (e.L.i < e.L.len && tn(e.L) !== "`") {
                if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
                  _t(e.L);
                }
                _t(e.L);
              }
            } else if (a === "(") {
              i++;
            } else if (a === ")") {
              i--;
            }
            _t(e.L);
          }
          continue;
        }
      }
      _t(e.L);
    }
    r();
    return t;
  }
  function s2n(e) {
    let t = e.L.b;
    _t(e.L);
    let n = An(e, "`", t, e.L.b, []);
    let r = e.L.i;
    {
      let c = false;
      while (r < e.L.len) {
        let u = e.L.src[r];
        if (u === "\\") {
          let d = e.L.src[r + 1];
          if (d === "`" || d === "$" || d === "\\") {
            c = true;
          }
          r += 2;
          continue;
        }
        if (u === "`") {
          break;
        }
        r++;
      }
      if (c) {
        let u = e.L.b;
        while (e.L.i < r) {
          _t(e.L);
        }
        let d = An(e, "backtick_escape_unsupported", u, e.L.b, []);
        let p;
        if (tn(e.L) === "`") {
          let m = e.L.b;
          _t(e.L);
          p = An(e, "`", m, e.L.b, []);
        } else {
          p = An(e, "`", e.L.b, e.L.b, []);
        }
        return An(e, "command_substitution", t, p.endIndex, [n, d, p]);
      }
    }
    e.inBacktick++;
    let o = e.inDquote;
    e.inDquote = 0;
    let s = uf(e.L);
    let i = e.L.heredocs;
    e.L.heredocs = [];
    let a = [];
    while (true) {
      if (da(e.L), tn(e.L) === "`" || tn(e.L) === "") {
        break;
      }
      let c = uf(e.L);
      let u = im(e.L, "cmd");
      if (u.type === "EOF" || u.type === "BACKTICK") {
        Fu(e.L, c);
        break;
      }
      if (u.type === "NEWLINE") {
        continue;
      }
      Fu(e.L, c);
      let d = Dua(e);
      if (!d) {
        break;
      }
      if (a.push(d), da(e.L), tn(e.L) === "`") {
        break;
      }
      let p = uf(e.L);
      let m = im(e.L, "cmd");
      if (m.type === "OP" && (m.value === ";" || m.value === "&")) {
        a.push(nd(e, m.value, m));
      } else if (m.type !== "NEWLINE") {
        Fu(e.L, p);
      }
    }
    if (e.L.heredocs = i, e.inBacktick--, e.inDquote = o, e.L.i !== r) {
      Fu(e.L, s);
      while (e.L.i < r) {
        _t(e.L);
      }
      a.length = 0;
      a.push(An(e, "backtick_body_overrun", n.endIndex, e.L.b, []));
    }
    let l;
    if (tn(e.L) === "`") {
      let c = e.L.b;
      _t(e.L);
      l = An(e, "`", c, e.L.b, []);
    } else {
      l = An(e, "`", e.L.b, e.L.b, []);
    }
    if (a.length === 0) {
      return null;
    }
    return An(e, "command_substitution", t, l.endIndex, [n, ...a, l]);
  }
  function Wfp(e, t) {
    let n = nd(e, "if", t);
    let r = [n];
    let o = Dq(e, null);
    r.push(...o);
    h3t(e, "then", r);
    let s = Dq(e, null);
    r.push(...s);
    while (true) {
      let a = uf(e.L);
      let l = im(e.L, "cmd");
      if (l.type === "WORD" && l.value === "elif") {
        let c = nd(e, "elif", l);
        let u = Dq(e, null);
        let d = [c, ...u];
        h3t(e, "then", d);
        let p = Dq(e, null);
        d.push(...p);
        let m = d.at(-1);
        r.push(An(e, "elif_clause", c.startIndex, m.endIndex, d));
      } else if (l.type === "WORD" && l.value === "else") {
        let c = nd(e, "else", l);
        let u = Dq(e, null);
        let d = u.length > 0 ? u.at(-1) : c;
        r.push(An(e, "else_clause", c.startIndex, d.endIndex, [c, ...u]));
      } else {
        Fu(e.L, a);
        break;
      }
    }
    h3t(e, "fi", r);
    let i = r.at(-1);
    return An(e, "if_statement", n.startIndex, i.endIndex, r);
  }
  function Gfp(e, t) {
    let n = nd(e, t.value, t);
    let r = [n];
    let o = Dq(e, null);
    r.push(...o);
    let s = Wlo(e);
    if (s) {
      r.push(s);
    }
    let i = r.at(-1);
    return An(e, "while_statement", n.startIndex, i.endIndex, r);
  }
  function Cua(e, t) {
    let n = nd(e, t.value, t);
    if (da(e.L), t.value === "for" && tn(e.L) === "(" && tn(e.L, 1) === "(") {
      let d = e.L.b;
      _t(e.L);
      _t(e.L);
      let p = An(e, "((", d, e.L.b, []);
      let m = [n, p];
      for (let _ = 0; _ < 3; _++) {
        da(e.L);
        let b = g3t(e, _ < 2 ? ";" : "))", "assign");
        if (m.push(...b), _ < 2) {
          if (tn(e.L) === ";") {
            let S = e.L.b;
            _t(e.L);
            m.push(An(e, ";", S, e.L.b, []));
          }
        }
      }
      if (da(e.L), tn(e.L) === ")" && tn(e.L, 1) === ")") {
        let _ = e.L.b;
        _t(e.L);
        _t(e.L);
        m.push(An(e, "))", _, e.L.b, []));
      }
      let f = uf(e.L);
      let h = im(e.L, "cmd");
      if (h.type === "OP" && h.value === ";") {
        m.push(nd(e, ";", h));
      } else if (h.type !== "NEWLINE") {
        Fu(e.L, f);
      }
      let g = Wlo(e);
      if (g) {
        m.push(g);
      } else if (oTe(e), da(e.L), tn(e.L) === "{") {
        let _ = e.L.b;
        _t(e.L);
        let b = An(e, "{", _, e.L.b, []);
        let S = Dq(e, "}");
        let E;
        if (tn(e.L) === "}") {
          let C = e.L.b;
          _t(e.L);
          E = An(e, "}", C, e.L.b, []);
        } else {
          E = An(e, "}", e.L.b, e.L.b, []);
        }
        m.push(An(e, "compound_statement", b.startIndex, E.endIndex, [b, ...S, E]));
      }
      let y = m.at(-1);
      return An(e, "c_style_for_statement", n.startIndex, y.endIndex, m);
    }
    let r = [n];
    let o = im(e.L, "arg");
    if (o.type === "WORD" && a$(o.value[0] ?? "") && [...o.value].every(toe)) {
      r.push(An(e, "variable_name", o.start, o.end, []));
    } else {
      r.push(An(e, "ERROR", o.start, o.end, []));
    }
    da(e.L);
    let s = uf(e.L);
    let i = im(e.L, "arg");
    if (i.type === "WORD" && i.value === "in") {
      r.push(nd(e, "in", i));
      while (true) {
        da(e.L);
        let d = tn(e.L);
        if (d === ";" || d === `
` || d === "") {
          break;
        }
        let p = Mq(e, "arg");
        if (!p) {
          break;
        }
        r.push(p);
      }
    } else {
      Fu(e.L, s);
    }
    let a = uf(e.L);
    let l = im(e.L, "cmd");
    if (l.type === "OP" && l.value === ";") {
      r.push(nd(e, ";", l));
    } else if (l.type !== "NEWLINE") {
      Fu(e.L, a);
    }
    let c = Wlo(e);
    if (c) {
      r.push(c);
    }
    let u = r.at(-1);
    return An(e, "for_statement", n.startIndex, u.endIndex, r);
  }
  function Wlo(e) {
    oTe(e);
    let t = uf(e.L);
    let n = im(e.L, "cmd");
    if (n.type !== "WORD" || n.value !== "do") {
      Fu(e.L, t);
      return null;
    }
    let r = nd(e, "do", n);
    let o = Dq(e, null);
    let s = [r, ...o];
    h3t(e, "done", s);
    let i = s.at(-1);
    return An(e, "do_group", r.startIndex, i.endIndex, s);
  }
  function Vfp(e, t) {
    let n = nd(e, "case", t);
    let r = [n];
    da(e.L);
    let o = Mq(e, "arg");
    if (o) {
      r.push(o);
    }
    da(e.L);
    h3t(e, "in", r);
    oTe(e);
    while (true) {
      da(e.L);
      oTe(e);
      let i = uf(e.L);
      let a = im(e.L, "arg");
      if (a.type === "WORD" && a.value === "esac") {
        r.push(nd(e, "esac", a));
        break;
      }
      if (a.type === "EOF") {
        break;
      }
      Fu(e.L, i);
      let l = zfp(e);
      if (!l) {
        break;
      }
      r.push(l);
    }
    let s = r.at(-1);
    return An(e, "case_statement", n.startIndex, s.endIndex, r);
  }
  function zfp(e) {
    da(e.L);
    let t = e.L.b;
    let n = [];
    if (tn(e.L) === "(") {
      let l = e.L.b;
      _t(e.L);
      n.push(An(e, "(", l, e.L.b, []));
    }
    let r = true;
    while (true) {
      da(e.L);
      let l = tn(e.L);
      if (l === ")" || l === "") {
        break;
      }
      let c = Kfp(e);
      if (c.length === 0) {
        break;
      }
      if (!r && c.length > 1) {
        let u = c.map(m => m.type === "extglob_pattern" ? An(e, "word", m.startIndex, m.endIndex, []) : m);
        let d = u[0];
        let p = u.at(-1);
        n.push(An(e, "concatenation", d.startIndex, p.endIndex, u));
      } else {
        n.push(...c);
      }
      if (r = false, da(e.L), tn(e.L) === "\\" && tn(e.L, 1) === `
`) {
        _t(e.L);
        _t(e.L);
        da(e.L);
      }
      if (tn(e.L) === "|") {
        let u = e.L.b;
        if (_t(e.L), n.push(An(e, "|", u, e.L.b, [])), tn(e.L) === "\\" && tn(e.L, 1) === `
`) {
          _t(e.L);
          _t(e.L);
        }
      } else {
        break;
      }
    }
    if (tn(e.L) === ")") {
      let l = e.L.b;
      _t(e.L);
      n.push(An(e, ")", l, e.L.b, []));
    }
    let o = Dq(e, null);
    n.push(...o);
    let s = uf(e.L);
    let i = im(e.L, "cmd");
    if (i.type === "OP" && (i.value === ";;" || i.value === ";&" || i.value === ";;&")) {
      n.push(nd(e, i.value, i));
    } else {
      Fu(e.L, s);
    }
    if (n.length === 0) {
      return null;
    }
    if (o.length === 0) {
      for (let l = 0; l < n.length; l++) {
        let c = n[l];
        if (c.type !== "extglob_pattern") {
          continue;
        }
        let u = WOe(e, c.startIndex, c.endIndex);
        if (/^[-+?*@!][a-zA-Z]/.test(u) && !/[*?(]/.test(u)) {
          n[l] = An(e, "word", c.startIndex, c.endIndex, []);
        }
      }
    }
    let a = n.at(-1);
    return An(e, "case_item", t, a.endIndex, n);
  }
  function Kfp(e) {
    da(e.L);
    let t = uf(e.L);
    let n = e.L.b;
    let r = e.L.i;
    let o = 0;
    let s = false;
    let i = false;
    let a = false;
    while (e.L.i < e.L.len) {
      let d = tn(e.L);
      if (d === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (d === '"' || d === "'") {
        a = true;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== d) {
          if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
          }
          _t(e.L);
        }
        if (tn(e.L) === d) {
          _t(e.L);
        }
        continue;
      }
      if (d === "(") {
        o++;
        _t(e.L);
        continue;
      }
      if (o > 0) {
        if (d === ")") {
          o--;
          _t(e.L);
          continue;
        }
        if (d === `
`) {
          break;
        }
        _t(e.L);
        continue;
      }
      if (d === ")" || d === "|" || d === " " || d === "\t" || d === `
`) {
        break;
      }
      if (d === "$") {
        s = true;
      }
      if (d === "[") {
        i = true;
      }
      _t(e.L);
    }
    if (e.L.b === n) {
      return [];
    }
    let l = e.src.slice(r, e.L.i);
    let c = /[*?+@!]\(/.test(l);
    if (a && !c) {
      Fu(e.L, t);
      return Yfp(e);
    }
    if (!c && (s || i)) {
      Fu(e.L, t);
      let d = Mq(e, "arg");
      return d ? [d] : [];
    }
    let u = c || /[*?]/.test(l) || /^[-+?*@!][a-zA-Z]/.test(l) ? "extglob_pattern" : "word";
    return [An(e, u, n, e.L.b, [])];
  }
  function Yfp(e) {
    let t = [];
    let n = e.L.b;
    let r = e.L.i;
    let o = () => {
      if (e.L.i > r) {
        let s = e.src.slice(r, e.L.i);
        let i = /[*?]/.test(s) ? "extglob_pattern" : "word";
        t.push(An(e, i, n, e.L.b, []));
      }
    };
    while (e.L.i < e.L.len) {
      let s = tn(e.L);
      if (s === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (s === '"') {
        o();
        t.push(lde(e));
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if (s === "'") {
        o();
        let i = im(e.L, "arg");
        t.push(nd(e, "raw_string", i));
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if (s === ")" || s === "|" || s === " " || s === "\t" || s === `
`) {
        break;
      }
      _t(e.L);
    }
    o();
    return t;
  }
  function Jfp(e, t) {
    let n = nd(e, "function", t);
    da(e.L);
    let r = im(e.L, "arg");
    let o = An(e, "word", r.start, r.end, []);
    let s = [n, o];
    if (da(e.L), tn(e.L) === "(" && tn(e.L, 1) === ")") {
      let l = im(e.L, "cmd");
      let c = im(e.L, "cmd");
      s.push(nd(e, "(", l));
      s.push(nd(e, ")", c));
    }
    da(e.L);
    oTe(e);
    let i = GOe(e);
    if (i) {
      if (i.type === "redirected_statement" && i.children.length >= 2 && i.children[0].type === "compound_statement") {
        s.push(...i.children);
      } else {
        s.push(i);
      }
    }
    let a = s.at(-1);
    return An(e, "function_definition", n.startIndex, a.endIndex, s);
  }
  function Xfp(e, t) {
    let n = nd(e, t.value, t);
    let r = [n];
    let o = [];
    while (true) {
      da(e.L);
      let c = Sdt(e);
      if (c) {
        o.push(c);
        continue;
      }
      let u = tn(e.L);
      if (u === "" || u === `
` || u === ";" || u === "&" || u === "|" || u === ")" || u === "<" || u === ">") {
        break;
      }
      let d = Mua(e);
      if (d) {
        r.push(d);
        continue;
      }
      if (u === '"' || u === "'" || u === "$") {
        let f = Mq(e, "arg");
        if (f) {
          r.push(f);
          continue;
        }
        break;
      }
      let p = uf(e.L);
      let m = im(e.L, "arg");
      if (m.type === "WORD" || m.type === "NUMBER") {
        if (m.value.startsWith("-")) {
          r.push(nd(e, "word", m));
        } else if (a$(m.value[0] ?? "")) {
          r.push(An(e, "variable_name", m.start, m.end, []));
        } else {
          r.push(nd(e, "word", m));
        }
      } else {
        Fu(e.L, p);
        break;
      }
    }
    let s = r.at(-1);
    let i = An(e, "declaration_command", n.startIndex, s.endIndex, r);
    if (o.length === 0) {
      return i;
    }
    let a = o.at(-1);
    let l = Math.max(i.endIndex, a.endIndex);
    return An(e, "redirected_statement", n.startIndex, l, [i, ...o]);
  }
  function Qfp(e, t) {
    let n = nd(e, "unset", t);
    let r = [n];
    let o = [];
    while (true) {
      da(e.L);
      let c = Sdt(e);
      if (c) {
        o.push(c);
        continue;
      }
      let u = tn(e.L);
      if (u === "" || u === `
` || u === ";" || u === "&" || u === "|" || u === ")" || u === "<" || u === ">") {
        break;
      }
      let d = Mq(e, "arg");
      if (!d) {
        break;
      }
      if (d.type === "word") {
        if (d.text.startsWith("-")) {
          r.push(d);
        } else {
          r.push(An(e, "variable_name", d.startIndex, d.endIndex, []));
        }
      } else {
        r.push(d);
      }
    }
    let s = r.at(-1);
    let i = An(e, "unset_command", n.startIndex, s.endIndex, r);
    if (o.length === 0) {
      return i;
    }
    let a = o.at(-1);
    let l = Math.max(i.endIndex, a.endIndex);
    return An(e, "redirected_statement", n.startIndex, l, [i, ...o]);
  }
  function h3t(e, t, n) {
    oTe(e);
    let r = uf(e.L);
    let o = im(e.L, "cmd");
    if (o.type === "WORD" && o.value === t) {
      n.push(nd(e, t, o));
    } else {
      Fu(e.L, r);
    }
  }
  function Rua(e, t) {
    return Klo(e, t);
  }
  function Klo(e, t) {
    let n = xua(e, t);
    if (!n) {
      return null;
    }
    while (true) {
      da(e.L);
      let r = uf(e.L);
      if (t === "]]" && tn(e.L) === "|" && tn(e.L, 1) === "|") {
        let o = e.L.b;
        _t(e.L);
        _t(e.L);
        let s = An(e, "||", o, e.L.b, []);
        i2n(e, t);
        let i = xua(e, t);
        if (!i) {
          Fu(e.L, r);
          break;
        }
        n = An(e, "binary_expression", n.startIndex, i.endIndex, [n, s, i]);
      } else {
        break;
      }
    }
    return n;
  }
  function xua(e, t) {
    let n = kua(e, t);
    if (!n) {
      return null;
    }
    while (true) {
      da(e.L);
      let r = uf(e.L);
      if (t === "]]" && tn(e.L) === "&" && tn(e.L, 1) === "&") {
        let o = e.L.b;
        _t(e.L);
        _t(e.L);
        let s = An(e, "&&", o, e.L.b, []);
        i2n(e, t);
        let i = kua(e, t);
        if (!i) {
          Fu(e.L, r);
          break;
        }
        n = An(e, "binary_expression", n.startIndex, i.endIndex, [n, s, i]);
      } else {
        break;
      }
    }
    return n;
  }
  function i2n(e, t) {
    if (da(e.L), t === "]]") {
      while (true) {
        let n = tn(e.L);
        if (n === `
`) {
          _t(e.L);
          da(e.L);
        } else if (n === "#") {
          while (tn(e.L) && tn(e.L) !== `
`) {
            _t(e.L);
          }
        } else {
          break;
        }
      }
    }
  }
  function kua(e, t) {
    if (i2n(e, t), tn(e.L) === "(") {
      let r = e.L.b;
      _t(e.L);
      let o = An(e, "(", r, e.L.b, []);
      let s = Klo(e, t);
      da(e.L);
      let i;
      if (tn(e.L) === ")") {
        let l = e.L.b;
        _t(e.L);
        i = An(e, ")", l, e.L.b, []);
      } else {
        i = An(e, ")", e.L.b, e.L.b, []);
      }
      let a = s ? [o, s, i] : [o, i];
      return An(e, "parenthesized_expression", o.startIndex, i.endIndex, a);
    }
    return Zfp(e, t);
  }
  function Nua(e, t) {
    i2n(e, t);
    let n = tn(e.L);
    let r = o => o === " " || o === "\t" || o === `
` || o === "";
    if (n === "!" && (r(tn(e.L, 1)) || tn(e.L, 1) === "(")) {
      let o = e.L.b;
      _t(e.L);
      let s = An(e, "!", o, e.L.b, []);
      let i = Nua(e, t);
      if (!i) {
        return s;
      }
      return An(e, "unary_expression", s.startIndex, i.endIndex, [s, i]);
    }
    if (n === "(") {
      let o = e.L.b;
      _t(e.L);
      let s = An(e, "(", o, e.L.b, []);
      let i = Klo(e, t);
      da(e.L);
      let a;
      if (tn(e.L) === ")") {
        let c = e.L.b;
        _t(e.L);
        a = An(e, ")", c, e.L.b, []);
      } else {
        a = An(e, ")", e.L.b, e.L.b, []);
      }
      let l = i ? [s, i, a] : [s, a];
      return An(e, "parenthesized_expression", s.startIndex, a.endIndex, l);
    }
    if (n === "-" && a$(tn(e.L, 1))) {
      let o = uf(e.L);
      let s = e.L.b;
      _t(e.L);
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      if (!r(tn(e.L))) {
        Fu(e.L, o);
        return n2n(e, t);
      }
      let i = An(e, "test_operator", s, e.L.b, []);
      da(e.L);
      let a = n2n(e, t);
      if (!a) {
        return i;
      }
      return An(e, "unary_expression", i.startIndex, a.endIndex, [i, a]);
    }
    return n2n(e, t);
  }
  function Zfp(e, t) {
    da(e.L);
    let n = Nua(e, t);
    if (!n) {
      return null;
    }
    da(e.L);
    let r = tn(e.L);
    let o = tn(e.L, 1);
    let s = null;
    let i = e.L.b;
    if (r === "=" && o === "=") {
      _t(e.L);
      _t(e.L);
      s = An(e, "==", i, e.L.b, []);
    } else if (r === "!" && o === "=") {
      _t(e.L);
      _t(e.L);
      s = An(e, "!=", i, e.L.b, []);
    } else if (r === "=" && o === "~") {
      _t(e.L);
      _t(e.L);
      s = An(e, "=~", i, e.L.b, []);
    } else if (r === "=" && o !== "=") {
      _t(e.L);
      s = An(e, "=", i, e.L.b, []);
    } else if (t === "]]" && r === "<" && o !== "<") {
      _t(e.L);
      s = An(e, "<", i, e.L.b, []);
    } else if (t === "]]" && r === ">" && o !== ">") {
      _t(e.L);
      s = An(e, ">", i, e.L.b, []);
    } else if (r === "-" && a$(o)) {
      _t(e.L);
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      s = An(e, "test_operator", i, e.L.b, []);
    }
    if (!s) {
      return n;
    }
    if (da(e.L), t === "]]") {
      let l = s.type;
      if (l === "=~") {
        da(e.L);
        let c = tn(e.L);
        let u = null;
        if (c === '"' || c === "'") {
          let d = uf(e.L);
          let p = c === '"' ? lde(e) : nd(e, "raw_string", im(e.L, "arg"));
          let m = e.L.i;
          let f = m;
          while (f < e.L.len && (e.src[f] === " " || e.src[f] === "\t")) {
            f++;
          }
          let h = e.src[f] ?? "";
          let g = f + 1;
          while (e.src[g] === "\\") {
            if (e.src[g + 1] === `
`) {
              g += 2;
            } else if (e.src[g + 1] === "\r" && e.src[g + 2] === `
`) {
              g += 3;
            } else {
              break;
            }
          }
          let y = e.src[g] ?? "";
          if (h === "]" && y === "]" && f > m || h === "&" && y === "&" || h === "|" && y === "|" && f > m || h === `
` || h === "") {
            u = p;
          } else {
            Fu(e.L, d);
          }
        }
        if (!u) {
          u = Aua(e, true);
        }
        if (!u) {
          return n;
        }
        return An(e, "binary_expression", n.startIndex, u.endIndex, [n, s, u]);
      }
      if (l === "=") {
        let c = Aua(e, false);
        if (!c) {
          return n;
        }
        return An(e, "binary_expression", n.startIndex, c.endIndex, [n, s, c]);
      }
      if (l === "==" || l === "!=") {
        let c = ehp(e);
        if (c.length === 0) {
          return n;
        }
        let u = c.at(-1);
        return An(e, "binary_expression", n.startIndex, u.endIndex, [n, s, ...c]);
      }
    }
    let a = n2n(e, t);
    if (!a) {
      return n;
    }
    return An(e, "binary_expression", n.startIndex, a.endIndex, [n, s, a]);
  }
  function Aua(e, t) {
    da(e.L);
    let n = e.L.b;
    let r = 0;
    while (e.L.i < e.L.len) {
      let o = tn(e.L);
      if (o === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (o === `
`) {
        if (r === 0) {
          break;
        }
        _t(e.L);
        continue;
      }
      if (o === '"' || o === "'") {
        let s = o;
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== s) {
          if (s === '"' && tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
          }
          _t(e.L);
        }
        if (e.L.i < e.L.len) {
          _t(e.L);
        }
        continue;
      }
      if (o === "`") {
        _t(e.L);
        while (e.L.i < e.L.len && tn(e.L) !== "`") {
          if (tn(e.L) === "\\" && e.L.i + 1 < e.L.len) {
            _t(e.L);
          }
          _t(e.L);
        }
        if (e.L.i < e.L.len) {
          _t(e.L);
        }
        continue;
      }
      if (r === 0) {
        if (o === " " || o === "\t") {
          break;
        }
        if (o === "&" || !t && o === "|") {
          break;
        }
        if (o === ")") {
          break;
        }
      }
      if (o === "(") {
        r++;
      } else if (o === ")" && r > 0) {
        r--;
      }
      _t(e.L);
    }
    if (e.L.b === n) {
      return null;
    }
    return An(e, "regex", n, e.L.b, []);
  }
  function ehp(e) {
    da(e.L);
    let t = [];
    let n = e.L.b;
    let r = e.L.i;
    let o = 0;
    let s = () => {
      if (e.L.i > r) {
        let i = e.src.slice(r, e.L.i);
        let a = /^\d+$/.test(i) ? "number" : "extglob_pattern";
        t.push(An(e, a, n, e.L.b, []));
      }
    };
    while (e.L.i < e.L.len) {
      let i = tn(e.L);
      if (i === "\\" && e.L.i + 1 < e.L.len) {
        _t(e.L);
        _t(e.L);
        continue;
      }
      if (i === `
`) {
        if (o === 0) {
          break;
        }
        _t(e.L);
        continue;
      }
      if (o === 0) {
        if (i === "&" || i === "|") {
          break;
        }
        if (i === " " || i === "\t") {
          let a = e.L.i;
          for (;;) {
            let d = e.L.src[a];
            if (d === " " || d === "\t") {
              a++;
            } else if (d === "\\" && e.L.src[a + 1] === `
`) {
              a += 2;
            } else if (d === "\\" && e.L.src[a + 1] === "\r" && e.L.src[a + 2] === `
`) {
              a += 3;
            } else {
              break;
            }
          }
          let l = e.L.src[a] ?? "";
          let c = a + 1;
          while (e.L.src[c] === "\\") {
            if (e.L.src[c + 1] === `
`) {
              c += 2;
            } else if (e.L.src[c + 1] === "\r" && e.L.src[c + 2] === `
`) {
              c += 3;
            } else {
              break;
            }
          }
          let u = e.L.src[c] ?? "";
          if (l === "]" && u === "]" || l === "&" && u === "&" || l === "|" && u === "|" || l === "#" || l === `
`) {
            break;
          }
          _t(e.L);
          continue;
        }
      }
      if (i === "$") {
        let a = tn(e.L, 1);
        if (a === "'") {
          s();
          let l = im(e.L, "arg");
          t.push(nd(e, "ansi_c_string", l));
          n = e.L.b;
          r = e.L.i;
          continue;
        }
        if (a === '"') {
          s();
          let l = {
            type: "DOLLAR",
            value: "$",
            start: e.L.b,
            end: e.L.b + 1
          };
          _t(e.L);
          t.push(nd(e, "$", l));
          t.push(lde(e));
          n = e.L.b;
          r = e.L.i;
          continue;
        }
        if (a === "(" || a === "{" || a$(a) || Tdt.vZc(a)) {
          s();
          let l = sTe(e);
          if (l) {
            t.push(l);
          }
          n = e.L.b;
          r = e.L.i;
          continue;
        }
      }
      if (i === '"') {
        s();
        t.push(lde(e));
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if (i === "'") {
        s();
        let a = im(e.L, "arg");
        t.push(nd(e, "raw_string", a));
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if (i === "`") {
        s();
        let a = s2n(e);
        if (a) {
          t.push(a);
        }
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if ((i === "<" || i === ">") && tn(e.L, 1) === "(") {
        s();
        let a = o2n(e);
        if (a) {
          t.push(a);
        }
        n = e.L.b;
        r = e.L.i;
        continue;
      }
      if (i === ")" && o === 0) {
        break;
      }
      if (i === "(") {
        o++;
      } else if (i === ")" && o > 0) {
        o--;
      }
      _t(e.L);
    }
    s();
    return t;
  }
  function n2n(e, t) {
    if (da(e.L), t === "]" && tn(e.L) === "]" && jlo(tn(e.L, 1) ?? "")) {
      return null;
    }
    if (t === "]]" && tn(e.L) === "]" && tn(e.L, 1) === "]" && jlo(tn(e.L, 2) ?? "")) {
      return null;
    }
    return Mq(e, "arg");
  }
  function Iua(e, t, n) {
    Fu(e.L, t);
    let r = 0;
    while (e.L.i < e.L.len) {
      let o = tn(e.L);
      if (n === "))" || n === ")") {
        if (o === "(") {
          r++;
        } else if (o === ")") {
          if (r === 0) {
            if (n === ")" || tn(e.L, 1) === ")") {
              return;
            }
          } else {
            r--;
          }
        }
      } else if (n === "]") {
        if (o === "[") {
          r++;
        } else if (o === "]") {
          if (r === 0) {
            return;
          }
          r--;
        }
      } else if (_3t(e, n)) {
        return;
      }
      _t(e.L);
    }
  }
  function r2n(e, t, n = "var") {
    return y3t(e, t, n);
  }
  function g3t(e, t, n = "var") {
    let r = [];
    while (true) {
      let o = y3t(e, t, n);
      if (o) {
        r.push(o);
      }
      if (da(e.L), tn(e.L) === "," && !_3t(e, t)) {
        _t(e.L);
        continue;
      }
      break;
    }
    return r;
  }
  function y3t(e, t, n) {
    let r = Glo(e, t, 0, n);
    if (!r) {
      return null;
    }
    if (da(e.L), tn(e.L) === "?") {
      let o = e.L.b;
      _t(e.L);
      let s = An(e, "?", o, e.L.b, []);
      let i = Glo(e, ":", 0, n);
      da(e.L);
      let a;
      if (tn(e.L) === ":") {
        let d = e.L.b;
        _t(e.L);
        a = An(e, ":", d, e.L.b, []);
      } else {
        a = An(e, ":", e.L.b, e.L.b, []);
      }
      let l = y3t(e, t, n);
      let c = l ?? a;
      let u = [r, s];
      if (i) {
        u.push(i);
      }
      if (u.push(a), l) {
        u.push(l);
      }
      return An(e, "ternary_expression", r.startIndex, c.endIndex, u);
    }
    return r;
  }
  function rhp(e) {
    let t = tn(e.L);
    let n = tn(e.L, 1);
    let r = tn(e.L, 2);
    if (t === "<" && n === "<" && r === "=") {
      return ["<<=", 3];
    }
    if (t === ">" && n === ">" && r === "=") {
      return [">>=", 3];
    }
    if (t === "*" && n === "*") {
      return ["**", 2];
    }
    if (t === "<" && n === "<") {
      return ["<<", 2];
    }
    if (t === ">" && n === ">") {
      return [">>", 2];
    }
    if (t === "=" && n === "=") {
      return ["==", 2];
    }
    if (t === "!" && n === "=") {
      return ["!=", 2];
    }
    if (t === "<" && n === "=") {
      return ["<=", 2];
    }
    if (t === ">" && n === "=") {
      return [">=", 2];
    }
    if (t === "&" && n === "&") {
      return ["&&", 2];
    }
    if (t === "|" && n === "|") {
      return ["||", 2];
    }
    if (t === "+" && n === "=") {
      return ["+=", 2];
    }
    if (t === "-" && n === "=") {
      return ["-=", 2];
    }
    if (t === "*" && n === "=") {
      return ["*=", 2];
    }
    if (t === "/" && n === "=") {
      return ["/=", 2];
    }
    if (t === "%" && n === "=") {
      return ["%=", 2];
    }
    if (t === "&" && n === "=") {
      return ["&=", 2];
    }
    if (t === "^" && n === "=") {
      return ["^=", 2];
    }
    if (t === "|" && n === "=") {
      return ["|=", 2];
    }
    if (t === "+" && n !== "+") {
      return ["+", 1];
    }
    if (t === "-" && n !== "-") {
      return ["-", 1];
    }
    if (t === "*") {
      return ["*", 1];
    }
    if (t === "/") {
      return ["/", 1];
    }
    if (t === "%") {
      return ["%", 1];
    }
    if (t === "<") {
      return ["<", 1];
    }
    if (t === ">") {
      return [">", 1];
    }
    if (t === "&") {
      return ["&", 1];
    }
    if (t === "|") {
      return ["|", 1];
    }
    if (t === "^") {
      return ["^", 1];
    }
    if (t === "=") {
      return ["=", 1];
    }
    return null;
  }
  function Glo(e, t, n, r) {
    let o = Vlo(e, t, r);
    if (!o) {
      return null;
    }
    while (true) {
      if (da(e.L), _3t(e, t)) {
        break;
      }
      if (tn(e.L) === ",") {
        break;
      }
      let s = rhp(e);
      if (!s) {
        break;
      }
      let [i, a] = s;
      let l = thp[i];
      if (l === undefined || l < n) {
        break;
      }
      let c = e.L.b;
      for (let m = 0; m < a; m++) {
        _t(e.L);
      }
      let u = An(e, i, c, e.L.b, []);
      let d = nhp.vZc(i) ? l : l + 1;
      let p = Glo(e, t, d, r);
      if (!p) {
        break;
      }
      o = An(e, "binary_expression", o.startIndex, p.endIndex, [o, u, p]);
    }
    return o;
  }
  function Vlo(e, t, n) {
    if (da(e.L), _3t(e, t)) {
      return null;
    }
    let r = tn(e.L);
    let o = tn(e.L, 1);
    if (r === "+" && o === "+" || r === "-" && o === "-") {
      let s = e.L.b;
      _t(e.L);
      _t(e.L);
      let i = An(e, r + o, s, e.L.b, []);
      let a = Vlo(e, t, n);
      if (!a) {
        return i;
      }
      return An(e, "unary_expression", i.startIndex, a.endIndex, [i, a]);
    }
    if (r === "-" || r === "+" || r === "!" || r === "~") {
      if (n !== "var" && r === "-" && yx(o)) {
        let l = e.L.b;
        _t(e.L);
        while (yx(tn(e.L))) {
          _t(e.L);
        }
        return An(e, "number", l, e.L.b, []);
      }
      let s = e.L.b;
      _t(e.L);
      let i = An(e, r, s, e.L.b, []);
      let a = Vlo(e, t, n);
      if (!a) {
        return i;
      }
      return An(e, "unary_expression", i.startIndex, a.endIndex, [i, a]);
    }
    return ohp(e, t, n);
  }
  function ohp(e, t, n) {
    let r = shp(e, t, n);
    if (!r) {
      return null;
    }
    let o = tn(e.L);
    let s = tn(e.L, 1);
    if (o === "+" && s === "+" || o === "-" && s === "-") {
      let i = e.L.b;
      _t(e.L);
      _t(e.L);
      let a = An(e, o + s, i, e.L.b, []);
      return An(e, "postfix_expression", r.startIndex, a.endIndex, [r, a]);
    }
    return r;
  }
  function shp(e, t, n) {
    if (da(e.L), _3t(e, t)) {
      return null;
    }
    let r = tn(e.L);
    if (r === "(") {
      let o = e.L.b;
      _t(e.L);
      let s = An(e, "(", o, e.L.b, []);
      let i = g3t(e, ")", n);
      da(e.L);
      let a;
      if (tn(e.L) === ")") {
        let l = e.L.b;
        _t(e.L);
        a = An(e, ")", l, e.L.b, []);
      } else {
        a = An(e, ")", e.L.b, e.L.b, []);
      }
      return An(e, "parenthesized_expression", s.startIndex, a.endIndex, [s, ...i, a]);
    }
    if (r === '"') {
      return lde(e);
    }
    if (r === "$") {
      return sTe(e);
    }
    if (yx(r)) {
      let o = e.L.b;
      while (yx(tn(e.L))) {
        _t(e.L);
      }
      if (e.L.b - o === 1 && r === "0" && (tn(e.L) === "x" || tn(e.L) === "X")) {
        _t(e.L);
        while (Rfp(tn(e.L))) {
          _t(e.L);
        }
      } else if (tn(e.L) === "#") {
        _t(e.L);
        while (xfp(tn(e.L))) {
          _t(e.L);
        }
      }
      return An(e, "number", o, e.L.b, []);
    }
    if (a$(r)) {
      let o = e.L.b;
      while (toe(tn(e.L))) {
        _t(e.L);
      }
      let s = tn(e.L);
      if (n === "assign") {
        da(e.L);
        let a = tn(e.L);
        let l = tn(e.L, 1);
        if (a === "=" && l !== "=") {
          let c = An(e, "variable_name", o, e.L.b, []);
          let u = e.L.b;
          _t(e.L);
          let d = An(e, "=", u, e.L.b, []);
          let p = y3t(e, t, n);
          let m = p ? p.endIndex : d.endIndex;
          return An(e, "variable_assignment", o, m, p ? [c, d, p] : [c, d]);
        }
      }
      if (s === "[") {
        let a = An(e, "variable_name", o, e.L.b, []);
        let l = e.L.b;
        _t(e.L);
        let c = An(e, "[", l, e.L.b, []);
        let u = y3t(e, "]", "var") ?? sTe(e);
        da(e.L);
        let d;
        if (tn(e.L) === "]") {
          let m = e.L.b;
          _t(e.L);
          d = An(e, "]", m, e.L.b, []);
        } else {
          d = An(e, "]", e.L.b, e.L.b, []);
        }
        let p = u ? [a, c, u, d] : [a, c, d];
        return An(e, "subscript", o, d.endIndex, p);
      }
      return An(e, n === "var" ? "variable_name" : "word", o, e.L.b, []);
    }
    return null;
  }
  function _3t(e, t) {
    let n = tn(e.L);
    if (t === "))") {
      return n === ")" && tn(e.L, 1) === ")";
    }
    if (t === ")") {
      return n === ")";
    }
    if (t === ";") {
      return n === ";";
    }
    if (t === ":") {
      return n === ":";
    }
    if (t === "]") {
      return n === "]";
    }
    if (t === "}") {
      return n === "}";
    }
    if (t === ":}") {
      return n === ":" || n === "}";
    }
    return n === "" || n === `
`;
  }
  var Efp;
  var wBy;
  var Tdt;
  var vfp;
  var zlo;
  var thp;
  var nhp;
  var iTe = __lazy(() => {
    Efp = {
      parse: Ifp
    };
    wBy = Promise.resolve();
    Tdt = new Set(["?", "$", "@", "*", "#", "-", "!", "_"]);
    vfp = new Set(["export", "declare", "typeset", "readonly", "local"]);
    zlo = new Set(["if", "then", "elif", "else", "fi", "while", "until", "for", "in", "do", "done", "case", "esac", "function", "select"]);
    thp = {
      "=": 2,
      "+=": 2,
      "-=": 2,
      "*=": 2,
      "/=": 2,
      "%=": 2,
      "<<=": 2,
      ">>=": 2,
      "&=": 2,
      "^=": 2,
      "|=": 2,
      "||": 4,
      "&&": 5,
      "|": 6,
      "^": 7,
      "&": 8,
      "==": 9,
      "!=": 9,
      "<": 10,
      ">": 10,
      "<=": 10,
      ">=": 10,
      "<<": 11,
      ">>": 11,
      "+": 12,
      "-": 12,
      "*": 13,
      "/": 13,
      "%": 13,
      "**": 14
    };
    nhp = new Set(["=", "+=", "-=", "*=", "/=", "%=", "<<=", ">>=", "&=", "^=", "|=", "**"]);
  });
  var Fua = {};