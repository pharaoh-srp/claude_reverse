  __export(R3i, {
    subprocessEnv: () => subprocessEnv,
    shouldUseMcpAllowlistEnv: () => shouldUseMcpAllowlistEnv,
    setSettingsColorEnv: () => setSettingsColorEnv,
    scrubSandboxConfig: () => scrubSandboxConfig,
    registerAgentProxyEnvFn: () => registerAgentProxyEnvFn,
    isScrubSandboxAvailable: () => isScrubSandboxAvailable,
    isScrubEnabled: () => isScrubEnabled,
    enforceScriptCaps: () => enforceScriptCaps,
    assertScrubSandboxAvailable: () => assertScrubSandboxAvailable,
    agentProxyEnv: () => agentProxyEnv,
    _setScrubPathsLatchedForTesting: () => _setScrubPathsLatchedForTesting,
    _resetScrubLatchForTesting: () => _resetScrubLatchForTesting,
    _resetScriptCapsForTesting: () => _resetScriptCapsForTesting,
    BG_WORKER_IDENTITY_ENV_VARS: () => BG_WORKER_IDENTITY_ENV_VARS
  });
  function isScrubEnabled() {
    if (DDn === undefined) {
      DDn = st(process.env.CLAUDE_CODE_SUBPROCESS_ENV_SCRUB);
    }
    return DDn;
  }
  function zGd() {
    if (isScrubEnabled()) {
      return true;
    }
    if (Pl(process.env.CLAUDE_CODE_SUBPROCESS_ENV_SCRUB)) {
      return false;
    }
    return process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent";
  }
  function isScrubSandboxAvailable() {
    if (MDn !== undefined) {
      return MDn;
    }
    return IDn() !== null;
  }
  async function assertScrubSandboxAvailable() {
    if (!isScrubEnabled()) {
      return;
    }
    let e = EQr.homedir();
    let t = getOriginalCwd();
    let n = process.env.GITHUB_ENV ? Yce.dirname(process.env.GITHUB_ENV) : undefined;
    let r = process.env.GITHUB_WORKSPACE;
    if (MDn = IDn() !== null, $8 = {
      home: e,
      originalCwd: t,
      claudeConfigDir: process.env.CLAUDE_CONFIG_DIR,
      runnerFileCommandsDir: n,
      workspace: r,
      GITHUB_ACTION_PATH: process.env.GITHUB_ACTION_PATH,
      GITHUB_EVENT_PATH: process.env.GITHUB_EVENT_PATH
    }, $8.pathDirs = (process.env.PATH ?? "").split(":").map(l => l ? Yce.posix.normalize(l).replace(/\/+$/, "") : l).filter(l => l && E3i.some(c => l.startsWith(`${c}/`))), v3i(), IDn() === null) {
      let l = w$t();
      throw Error(l ? `sandbox.bwrapPath is set to ${l} but it is not an executable file. Fix the path in managed settings, or set CLAUDE_CODE_SUBPROCESS_ENV_SCRUB=0 to disable (loses subprocess isolation).` : "bubblewrap is required for subprocess env scrubbing and isolation. Install with: sudo apt-get install -y bubblewrap, set sandbox.bwrapPath in managed settings, or set CLAUDE_CODE_SUBPROCESS_ENV_SCRUB=0 to disable (loses subprocess isolation).");
    }
    let {
      appendFile: o,
      mkdir: s,
      open: i
    } = await import("fs/promises");
    try {
      rlt();
    } catch {}
    for (let l of [`${e}/.gitconfig`, `${e}/.bash_profile`, `${e}/.bashrc`, `${e}/.bash_aliases`, `${e}/.profile`, `${e}/.zshrc`, `${e}/.bunfig.toml`, `${e}/.netrc`, `${e}/.npmrc`, `${e}/.yarnrc`, `${e}/.yarnrc.yml`, `${t}/.npmrc`, `${t}/.yarnrc`, `${t}/.yarnrc.yml`, `${t}/bunfig.toml`, `${t}/package.json`, `${t}/.gitmodules`, `${t}/package-lock.json`, `${t}/yarn.lock`, `${t}/pnpm-lock.yaml`, "/tmp/inline-comments-buffer.jsonl", ...bQr.map(c => `${t}/${c}`)]) {
      try {
        await s(Yce.dirname(l), {
          recursive: true
        });
        await (await i(l, "a")).close();
      } catch {}
    }
    for (let l of [`${e}/.config/gh`, `${e}/.config/git`, `${e}/.config/pip`, `${e}/.pip`, `${t}/.claude/commands`, `${t}/.claude/agents`, `${t}/node_modules/.bin`, ...(n ? [n] : []), ...$8.pathDirs]) {
      try {
        await s(l, {
          recursive: true
        });
      } catch {}
    }
    if (r && Yce.posix.resolve(r) !== Yce.posix.resolve(t)) {
      await s(`${r}/.git/hooks`).catch(() => {});
      await s(`${r}/.git/modules`).catch(() => {});
      await s(`${r}/.git/worktrees`).catch(() => {});
      await s(`${r}/.git/info`).catch(() => {});
      await s(`${r}/.github`, {
        recursive: true
      }).catch(() => {});
      for (let l of [`${r}/.git/config`, `${r}/.git/config.worktree`, `${r}/.git/info/exclude`, `${r}/.gitmodules`]) {
        try {
          await (await i(l, "a")).close();
        } catch {}
      }
      try {
        let l = await i(`${r}/.git/commondir`, "wx");
        await l.writeFile(".");
        await l.close();
      } catch {}
    }
    let a = ["bunfig.toml", "package.json", ".npmrc", ".yarnrc", ".yarnrc.yml", ".gitmodules", "package-lock.json", "yarn.lock", "pnpm-lock.yaml", ...bQr];
    await s(`${t}/.git/info`).catch(() => {});
    await s(`${t}/.git/modules`).catch(() => {});
    await s(`${t}/.git/worktrees`).catch(() => {});
    try {
      await (await i(`${t}/.git/config.worktree`, "a")).close();
    } catch {}
    try {
      let l = await i(`${t}/.git/commondir`, "wx");
      await l.writeFile(".");
      await l.close();
    } catch {}
    try {
      await o(`${t}/.git/info/exclude`, `
# claude-code scrub-mode stubs
${a.map(l => `/${l}`).join(`
`)}
`);
    } catch {}
  }
  function v3i() {
    if (GIe !== undefined) {
      return;
    }
    let e = process.env.CLAUDE_CODE_SCRIPT_CAPS;
    if (!e) {
      GIe = null;
      return;
    }
    try {
      let t = qt(e);
      if (t && typeof t === "object" && !Array.isArray(t)) {
        let n = d_u(t, (r, o) => typeof r === "number" && Number.isFinite(r) && o.trim().length > 0);
        GIe = Object.keys(n).length > 0 ? n : null;
      } else {
        GIe = null;
      }
    } catch {
      GIe = null;
    }
  }
  function _resetScriptCapsForTesting() {
    SQr.clear();
    GIe = undefined;
  }
  function _resetScrubLatchForTesting() {
    DDn = undefined;
    MDn = undefined;
    $8 = undefined;
    _resetScriptCapsForTesting();
  }
  function _setScrubPathsLatchedForTesting(e) {
    $8 = e;
  }
  function enforceScriptCaps(e) {
    if (!isScrubEnabled()) {
      return;
    }
    if (v3i(), !GIe) {
      return;
    }
    let t = GIe;
    for (let [n, r] of Object.entries(t)) {
      let o = e.split(n).length - 1;
      if (o > 0) {
        let s = (SQr.get(n) ?? 0) + o;
        if (SQr.set(n, s), s > r) {
          throw Error(`Script call limit exceeded: ${n} has been called ${s} times (cap: ${r}). This limit prevents data exfiltration via repeated write operations in untrusted-input workflows.`);
        }
      }
    }
  }
  function registerAgentProxyEnvFn(e) {
    C3i = e;
  }
  function agentProxyEnv() {
    return C3i?.() ?? {};
  }
  function setSettingsColorEnv(e) {
    TQr = e;
  }
  function subprocessEnv() {
    let e = agentProxyEnv();
    let t = Object.keys(e).length > 0;
    let n = Object.keys(TQr).length > 0;
    let r = st(process.env.CLAUDE_CODE_REMOTE) ? b3i(t ? {
      ...process.env,
      ...e
    } : process.env) : {};
    let o = Object.keys(r).length > 0;
    let s = zGd();
    let i = process.env.CLAUDE_CODE_OAUTH_TOKEN !== undefined || process.env.CLAUDE_CODE_SUBSCRIPTION_TYPE !== undefined || process.env.CLAUDE_CODE_RATE_LIMIT_TIER !== undefined || process.env.CLAUDE_BG_AUTH_SNAPSHOT_PATH !== undefined || Me.CLAUDE_BG_SOCKET_TOKENS_PATH !== undefined || Me.CLAUDE_BG_RV_AUTH !== undefined || Me.CLAUDE_BG_PTY_AUTH !== undefined;
    let a = tyn(process.env);
    let l = false;
    l = BG_WORKER_IDENTITY_ENV_VARS.some(d => process.env[d] !== undefined);
    let c = Object.keys(process.env).some(d => d.startsWith("OTEL_") || d === "CLAUDE_CODE_OTEL_DIAG_STDERR");
    if (!t && !o && !s && !l && !i && !a.length && !c && !n) {
      return process.env;
    }
    let u = {
      ...process.env,
      ...TQr,
      ...e,
      ...r
    };
    delete u.CLAUDE_CODE_OAUTH_TOKEN;
    delete u.CLAUDE_CODE_SUBSCRIPTION_TYPE;
    delete u.CLAUDE_CODE_RATE_LIMIT_TIER;
    delete u.CLAUDE_BG_AUTH_SNAPSHOT_PATH;
    delete u.CLAUDE_BG_SOCKET_TOKENS_PATH;
    delete u.CLAUDE_BG_RV_AUTH;
    delete u.CLAUDE_BG_PTY_AUTH;
    for (let d of a) {
      delete u[d];
    }
    for (let d of BG_WORKER_IDENTITY_ENV_VARS) {
      delete u[d];
    }
    for (let d of Object.keys(u)) {
      if (d.startsWith("OTEL_")) {
        delete u[d];
      }
    }
    if (delete u.CLAUDE_CODE_OTEL_DIAG_STDERR, !s) {
      return u;
    }
    for (let d of JGd) {
      delete u[d];
      delete u[`INPUT_${d}`];
    }
    return u;
  }
  function shouldUseMcpAllowlistEnv() {
    let e = process.env.CLAUDE_CODE_MCP_ALLOWLIST_ENV;
    if (st(e)) {
      return true;
    }
    if (Pl(e)) {
      return false;
    }
    return process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent";
  }
  function scrubSandboxConfig() {
    let e = $8?.home ?? EQr.homedir();
    let t = $8?.originalCwd ?? getOriginalCwd();
    let n = $8?.GITHUB_ACTION_PATH ?? process.env.GITHUB_ACTION_PATH;
    let r = $8?.runnerFileCommandsDir ?? (process.env.GITHUB_ENV ? Yce.dirname(process.env.GITHUB_ENV) : undefined);
    let o = $8?.workspace ?? process.env.GITHUB_WORKSPACE;
    let s = o && Yce.posix.resolve(o) !== Yce.posix.resolve(t) ? [`${o}/.git/hooks`, `${o}/.git/config`, `${o}/.git/config.lock`, `${o}/.git/config.worktree`, `${o}/.git/config.worktree.lock`, `${o}/.git/commondir`, `${o}/.git/worktrees`, `${o}/.git/modules`, `${o}/.git/info/exclude`, `${o}/.gitmodules`, `${o}/.github`] : [];
    return {
      filesystem: {
        allowWrite: E3i,
        denyRead: ["/run/docker.sock", "/run/containerd/containerd.sock", "/run/podman/podman.sock", "/run/buildkit/buildkitd.sock", "/run/dbus", "/run/user"],
        denyWrite: [`${e}/.bash_profile`, `${e}/.bashrc`, `${e}/.bash_aliases`, `${e}/.bash_login`, `${e}/.bash_logout`, `${e}/.profile`, `${e}/.zshrc`, `${e}/.zprofile`, `${e}/.zshenv`, `${e}/.zlogin`, `${e}/.zlogout`, `${e}/.claude`, `${e}/.claude.json`, $8?.claudeConfigDir ?? process.env.CLAUDE_CONFIG_DIR, `${e}/.gitconfig`, `${e}/.config/git`, `${e}/.bunfig.toml`, `${t}/bunfig.toml`, `${t}/package.json`, ...bQr.map(i => `${t}/${i}`), `${e}/.npmrc`, `${t}/.npmrc`, `${e}/.yarnrc`, `${e}/.yarnrc.yml`, `${t}/.yarnrc`, `${t}/.yarnrc.yml`, `${e}/.config/pip`, `${e}/.pip`, `${t}/package-lock.json`, `${t}/yarn.lock`, `${t}/pnpm-lock.yaml`, `${t}/node_modules/.bin`, `${t}/.git/modules`, `${t}/scripts`, `${t}/.claude`, `${t}/.github`, `${e}/.local/bin`, `${e}/runners`, `${e}/actions-runner`, "/tmp/inline-comments-buffer.jsonl", ...($8?.pathDirs ?? []), r, n, n && n.includes("/_actions/") ? n.slice(0, n.indexOf("/_actions/") + 9) : undefined, $8?.GITHUB_EVENT_PATH ?? process.env.GITHUB_EVENT_PATH, `${e}/.config/gh`, `${e}/.netrc`, `${e}/.ssh`, `${t}/.git/hooks`, `${t}/.git/config`, `${t}/.git/config.lock`, `${t}/.git/config.worktree`, `${t}/.git/config.worktree.lock`, `${t}/.git/commondir`, `${t}/.git/worktrees`, `${t}/.gitmodules`, `${t}/.git/info/exclude`, ...s].filter(i => !!i)
      }
    };
  }
  var EQr;
  var Yce;
  var BG_WORKER_IDENTITY_ENV_VARS;
  var DDn;
  var bQr;
  var E3i;
  var MDn;
  var $8;
  var SQr;
  var GIe;
  var JGd;
  var C3i;
  var TQr;
  var s1 = __lazy(() => {
    ZL();
    at();
    pr();
    gn();
    lW();
    hQr();
    BC();
    S3i();
    EQr = require("os");
    Yce = require("path");
    BG_WORKER_IDENTITY_ENV_VARS = ["CLAUDE_CODE_SESSION_KIND", "CLAUDE_BG_SOURCE", "CLAUDE_BG_ISOLATION", "CLAUDE_BG_BACKEND", "CLAUDE_CODE_SESSION_NAME", "CLAUDE_CODE_RESUME_INTERRUPTED_TURN", "CLAUDE_CODE_RESUME_PROMPT", "CLAUDE_BG_POST_CLEAR_RESPAWN", "CLAUDE_BG_SESSION_PERMISSION_RULES", "CLAUDE_BG_MEMORY_TOGGLED_OFF"];
    bQr = [".env", ".env.local", ".env.development", ".env.development.local", ".env.test", ".env.test.local", ".env.production", ".env.production.local"];
    E3i = ["home", "root", "tmp", "var", "opt", "run", "mnt"].map(e => `/${e}`);
    SQr = new Map();
    JGd = ["ANTHROPIC_API_KEY", "CLAUDE_CODE_OAUTH_TOKEN", "ANTHROPIC_AUTH_TOKEN", "ANTHROPIC_FOUNDRY_API_KEY", "ANTHROPIC_AWS_API_KEY", "ANTHROPIC_BEDROCK_MANTLE_API_KEY", "ANTHROPIC_CUSTOM_HEADERS", "AWS_SECRET_ACCESS_KEY", "AWS_SESSION_TOKEN", "AWS_BEARER_TOKEN_BEDROCK", "GOOGLE_APPLICATION_CREDENTIALS", "AZURE_CLIENT_SECRET", "AZURE_CLIENT_CERTIFICATE_PATH", "ACTIONS_ID_TOKEN_REQUEST_TOKEN", "ACTIONS_ID_TOKEN_REQUEST_URL", "ACTIONS_RUNTIME_TOKEN", "ACTIONS_RUNTIME_URL", "ALL_INPUTS", "OVERRIDE_GITHUB_TOKEN", "DEFAULT_WORKFLOW_TOKEN", "SSH_SIGNING_KEY"];
    TQr = {};
  });
  function xQr() {
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_disable_bypass_permissions_mode", false)) {
      return "Bypass permissions mode was disabled by your organization policy";
    }
    if ((getInitialSettings() || {}).permissions?.disableBypassPermissionsMode === "disable") {
      return "Bypass permissions mode was disabled by settings";
    }
    return;
  }
  function isBypassPermissionsModeDisabled() {
    return xQr() !== undefined;
  }
  var Bbe = __lazy(() => {
    $n();
  });
  var x3i;
  var Sh = __lazy(() => {
    x3i = new Set(["Explore", "Plan"]);
  });
  function P3i(e) {
    let t = e.length > 1e4 ? e.slice(0, 1e4) : e;
    for (let n of QGd) {
      if (n.pattern.test(t)) {
        return n;
      }
    }
    return null;
  }
  function O3i(e) {
    return P3i(e)?.warning ?? null;
  }
  function oWe(e) {
    return P3i(e)?.category ?? null;
  }
  function Xce(e, t, n) {
    if (n === null || !n9d.vZc(n)) {
      return "none";
    }
    if (e.length > 2000) {
      return "unknown";
    }
    try {
      let r = r9d(e, t);
      let o = o9d(e);
      let s = s9d(e);
      if (o === null && s === null) {
        return "unknown";
      }
      if (o === "unknown" || s === "unknown") {
        return "unknown";
      }
      let i = [...(o ?? []), ...(s ?? [])];
      if (i.length === 0) {
        return "unknown";
      }
      let a = new Set();
      for (let l of i) {
        let c = i9d(l, t, r);
        if (c === "unknown") {
          return "unknown";
        }
        a.add(c);
      }
      if (a.size > 1) {
        return "mixed";
      }
      return a.values().next().value ?? "unknown";
    } catch (r) {
      Oe(new Po(`destructive-target-scope parse failed: ${he(r)}`, "destructive-target-scope parse failed"));
      return "unknown";
    }
  }
  function r9d(e, t) {
    if (!k3i.test(e)) {
      return t;
    }
    let n = t.startsWith("/") ? kJ.posix.resolve : kJ.resolve;
    let r = t;
    let o = e;
    let s = false;
    for (let i = A3i.exec(o); i !== null; i = A3i.exec(o)) {
      let a = i[1];
      if (a.startsWith("-") || kQr.test(a)) {
        return null;
      }
      let l = a.replace(/\\(.)/g, "$1");
      if (l.startsWith("~")) {
        if (l !== "~" && !l.startsWith("~/")) {
          return null;
        }
        r = l;
      } else if (r.startsWith("~")) {
        if (l.startsWith("/")) {
          r = n(l);
        } else {
          r = `${r}/${l}`;
        }
      } else {
        r = n(r, l);
      }
      o = o.slice(i[0].length);
      s = true;
    }
    if (!s || k3i.test(o)) {
      return null;
    }
    return r;
  }
  function o9d(e) {
    let t = false;
    let n = [];
    for (let r of e.matchAll(ZGd)) {
      let o = r[1] ?? "";
      if (!/(?:^|\s)-[a-zA-Z]/.test(o)) {
        continue;
      }
      if (/(?:^|\s)-(Recurse|Force|Path|LiteralPath)\b/i.test(o)) {
        continue;
      }
      t = true;
      let s = o.replace(/(?:^|\s)#.*$/, "").replace(/\d{0,4}>{1,2}\s*\S*/g, " ").replace(/\d{0,4}<{1,2}\s*\S*/g, " ");
      let i = C$t(s, true);
      if (i === "unknown") {
        return "unknown";
      }
      let a = false;
      for (let l of i) {
        if (!a && l === "--") {
          a = true;
          continue;
        }
        if (!a && l.startsWith("-")) {
          continue;
        }
        n.push(l);
      }
    }
    return t ? n : null;
  }
  function s9d(e) {
    let t = false;
    let n = [];
    let r = o => {
      if (o.includes(",")) {
        for (let s of o.split(",")) {
          if (s !== "") {
            n.push(s.trim());
          }
        }
      } else {
        n.push(o);
      }
    };
    for (let o of e.matchAll(e9d)) {
      let s = o[1] ?? "";
      if (!/(?:^|\s)-(Recurse|Force)\b/i.test(s)) {
        continue;
      }
      if (t = true, /[()]/.test(s)) {
        return "unknown";
      }
      let i = s.replace(/(?:^|\s)#.*$/, "").replace(/\*>{1,2}&?\d?\s*\S*/g, " ").replace(/\d{0,4}>{1,2}\s*\S*/g, " ");
      let a = C$t(i, false);
      if (a === "unknown") {
        return "unknown";
      }
      for (let l = 0; l < a.length; l++) {
        let c = a[l];
        if (c.startsWith("-")) {
          let u = c.indexOf(":");
          let d = (u >= 0 ? c.slice(1, u) : c.slice(1)).toLowerCase();
          let p = u >= 0 ? c.slice(u + 1) : undefined;
          if (d === "path" || d === "literalpath") {
            if (p !== undefined && p !== "") {
              r(p);
            } else {
              let m = a[l + 1];
              if (m !== undefined && !m.startsWith("-")) {
                r(m);
                l++;
              }
            }
          } else if (p !== undefined && p !== "") {
            ;
          } else if (p === "") {
            if (a[l + 1] !== undefined && !a[l + 1].startsWith("-")) {
              l++;
            }
          } else if (!t9d.vZc(d)) {
            if (a[l + 1] !== undefined && !a[l + 1].startsWith("-")) {
              l++;
            }
          }
          continue;
        }
        r(c);
      }
    }
    return t ? n : null;
  }
  function C$t(e, t) {
    let n = [];
    let r = "";
    let o = 0;
    while (o < e.length) {
      let s = e[o];
      if (s === " " || s === "\t") {
        if (r !== "") {
          n.push(r);
          r = "";
        }
        o++;
        continue;
      }
      if (s === "`") {
        return "unknown";
      }
      if (s === '"' || s === "'") {
        let i = s;
        o++;
        while (o < e.length && e[o] !== i) {
          if (t && i === '"' && e[o] === "\\" && o + 1 < e.length && '$`"\\\n'.includes(e[o + 1])) {
            r += e[o + 1];
            o += 2;
            continue;
          }
          r += e[o];
          o++;
        }
        if (o >= e.length) {
          return "unknown";
        }
        o++;
        continue;
      }
      if (t && s === "\\" && o + 1 < e.length) {
        r += e[o + 1];
        o += 2;
        continue;
      }
      r += s;
      o++;
    }
    if (r !== "") {
      n.push(r);
    }
    return n;
  }
  function i9d(e, t, n) {
    if (e === "") {
      return "unknown";
    }
    if (e.includes("$(")) {
      return "unknown";
    }
    if (e.includes("`")) {
      return "unknown";
    }
    if (/^\$TMPDIR(?:[\\/]|$)/.test(e)) {
      return "tmp";
    }
    if (/^\$\{TMPDIR\}(?:[\\/]|$)/.test(e)) {
      return "tmp";
    }
    if (/^%TE?MP%(?:[\\/]|$)/i.test(e)) {
      return "tmp";
    }
    if (/^\$env:TE?MP(?:[\\/]|$)/i.test(e)) {
      return "tmp";
    }
    if (e.includes("$")) {
      return "unknown";
    }
    if (/%[^%]+%/.test(e)) {
      return "unknown";
    }
    if (e.startsWith("*") || e.startsWith("?")) {
      return "unknown";
    }
    if (e.includes("{")) {
      return "unknown";
    }
    if (e.startsWith("~")) {
      return e === "~" || e.startsWith("~/") || e.startsWith("~\\") ? "outside_cwd" : "unknown";
    }
    let r = kQr.test(e) || e.startsWith("\\\\");
    if (!kJ.isAbsolute(e) && !r) {
      if (n === null) {
        return "unknown";
      }
      if (n.startsWith("~")) {
        return "outside_cwd";
      }
      let o = n.startsWith("/") ? kJ.posix.resolve(n, e) : kJ.resolve(n, e);
      if (!kJ.relative(t, o).startsWith("..")) {
        return "cwd";
      }
      if (I3i(o)) {
        return "tmp";
      }
      return "outside_cwd";
    }
    if (!r || kQr.test(t) || t.startsWith("\\\\")) {
      let o = kJ.relative(t, e);
      if (o === "" || !o.startsWith("..") && !kJ.isAbsolute(o)) {
        return "cwd";
      }
    }
    if (I3i(e)) {
      return "tmp";
    }
    return "outside_cwd";
  }
  function sWe(e, t) {
    if (t === null || !l9d.vZc(t)) {
      return "none";
    }
    if (e.length > 2000) {
      return "unknown";
    }
    try {
      switch (t) {
        case "git_force_push":
          return c9d(e);
        case "git_reset_hard":
          return u9d(e);
        case "git_branch_force_delete":
          return d9d(e);
        case "git_commit_amend":
          return p9d(e);
        default:
          return "none";
      }
    } catch (n) {
      Oe(new Po(`git-destructive-target parse failed: ${he(n)}`, "git-destructive-target parse failed"));
      return "unknown";
    }
  }
  function AQr(e) {
    return e.includes("$") || e.includes("`");
  }
  function D3i(e) {
    let t = e.replace(/^refs\/heads\//, "");
    return a9d.test(t) ? "main_like" : "feature";
  }
  function IQr(e, t, n) {
    for (let r of e.matchAll(t)) {
      let o = r[1] ?? "";
      if (n(o)) {
        return o;
      }
    }
    return;
  }
  function c9d(e) {
    let t = IQr(e, /\bgit[ \t]+push\b([^;&|\n]*)/g, a => /(?:^|[ \t])(?:--force(?:-with-lease|-if-includes)?|-f)\b/.test(a));
    if (t === undefined) {
      return "unknown";
    }
    if (AQr(t)) {
      return "unknown";
    }
    let n = C$t(t, true);
    if (n === "unknown") {
      return "unknown";
    }
    let r = new Set(["-o", "--push-option", "--repo", "--receive-pack", "--exec"]);
    let o = [];
    let s = false;
    for (let a = 0; a < n.length; a++) {
      let l = n[a];
      if (!s && l === "--") {
        s = true;
        continue;
      }
      if (!s && l.startsWith("-")) {
        let c = l.indexOf("=");
        let u = c >= 0 ? l.slice(0, c) : l;
        if (c < 0 && r.vZc(u)) {
          a++;
        }
        continue;
      }
      o.push(l);
    }
    if (o.length <= 1) {
      return "implicit";
    }
    let i = "feature";
    for (let a of o.slice(1)) {
      if (a === "" || /[*?[\]]/.test(a)) {
        return "unknown";
      }
      let l = a.replace(/^\+/, "");
      let c = l.lastIndexOf(":");
      let u = c >= 0 ? l.slice(c + 1) : l;
      if (u === "" || u === "HEAD") {
        return "unknown";
      }
      if (D3i(u) === "main_like") {
        i = "main_like";
      }
    }
    return i;
  }
  function u9d(e) {
    let t = e.match(/\bgit[ \t]+reset[ \t]+--hard\b([^;&|\n]*)/);
    if (!t) {
      return "unknown";
    }
    let n = t[1] ?? "";
    if (AQr(n)) {
      return "unknown";
    }
    let r = C$t(n, true);
    if (r === "unknown") {
      return "unknown";
    }
    let o;
    for (let s of r) {
      if (s === "--") {
        continue;
      }
      if (s.startsWith("-")) {
        continue;
      }
      o = s;
      break;
    }
    if (o === undefined || o === "") {
      return "bare";
    }
    if (/^(HEAD|@)([~^].*)?$/.test(o) || /^(HEAD|@)@\{.*\}$/.test(o)) {
      return "head_relative";
    }
    if (/^[A-Z_]+_HEAD$/.test(o)) {
      return "head_relative";
    }
    if (/^(origin|upstream)\//.test(o) || /^refs\/remotes\//.test(o) || /^[A-Za-z0-9_.-]+\/(main|master)$/.test(o)) {
      return "remote_ref";
    }
    return "other";
  }
  function d9d(e) {
    let t = IQr(e, /\bgit[ \t]+branch\b([^;&|\n]*)/g, s => /(?:^|[ \t])-D\b/.test(s) || /--delete\b/.test(s) && /--force\b/.test(s));
    if (t === undefined) {
      return "unknown";
    }
    if (AQr(t)) {
      return "unknown";
    }
    let n = C$t(t, true);
    if (n === "unknown") {
      return "unknown";
    }
    let r = [];
    let o = false;
    for (let s of n) {
      if (!o && s === "--") {
        o = true;
        continue;
      }
      if (!o && s.startsWith("-")) {
        continue;
      }
      r.push(s);
    }
    if (r.length === 0) {
      return "unknown";
    }
    for (let s of r) {
      if (D3i(s) === "main_like") {
        return "main_like";
      }
    }
    return "feature";
  }
  function p9d(e) {
    let t = IQr(e, /\bgit[ \t]+commit\b([^;&|\n]*)/g, n => /--amend\b/.test(n));
    if (t === undefined) {
      return "unknown";
    }
    if (/--no-edit\b/.test(t)) {
      return "no_edit";
    }
    if (/(?:^|[ \t])-[a-zA-Z]*m\b|--message\b/.test(t)) {
      return "with_message";
    }
    return "interactive";
  }
  function I3i(e) {
    if (/^\/tmp(?:\/|$)/.test(e) || /^\/var\/tmp(?:\/|$)/.test(e) || /^\/var\/folders\//.test(e) || /^\/private\/tmp(?:\/|$)/.test(e) || /^\/private\/var\/tmp(?:\/|$)/.test(e) || /^\/private\/var\/folders\//.test(e)) {
      return true;
    }
    if (/[\\/]claude[^\\/]*[\\/](?:[^\\/]+[\\/])+scratchpad(?:[\\/]|$)/i.test(e)) {
      return true;
    }
    let t = e.replace(/\//g, "\\");
    if (/^[A-Za-z]:\\Temp(?:\\|$)/i.test(t) || /^[A-Za-z]:\\Windows\\Temp(?:\\|$)/i.test(t) || /\\AppData\\Local\\Temp(?:\\|$)/i.test(t)) {
      return true;
    }
    return false;
  }
  var kJ;
  var QGd;
  var ZGd;
  var e9d;
  var t9d;
  var kQr;
  var n9d;
  var k3i;
  var A3i;
  var a9d;
  var l9d;
  var iWe = __lazy(() => {
    dt();
    Rn();
    kJ = require("path");
    QGd = [{
      pattern: /\bgit\s+reset\s+--hard\b/,
      category: "git_reset_hard",
      warning: "Note: may discard uncommitted changes"
    }, {
      pattern: /\bgit\s+push\b[^;&|\n]*[ \t](--force|--force-with-lease|-f)\b/,
      category: "git_force_push",
      warning: "Note: may overwrite remote history"
    }, {
      pattern: /\bgit\s+clean\b(?![^;&|\n]*(?:-[a-zA-Z]*n|--dry-run))[^;&|\n]*-[a-zA-Z]*f/,
      category: "git_clean_force",
      warning: "Note: may permanently delete untracked files"
    }, {
      pattern: /\bgit\s+checkout\s+(--\s+)?\.[ \t]*($|[;&|\n])/,
      category: "git_checkout_dot",
      warning: "Note: may discard all working tree changes"
    }, {
      pattern: /\bgit\s+restore\s+(--\s+)?\.[ \t]*($|[;&|\n])/,
      category: "git_restore_dot",
      warning: "Note: may discard all working tree changes"
    }, {
      pattern: /\bgit\s+stash[ \t]+(drop|clear)\b/,
      category: "git_stash_drop",
      warning: "Note: may permanently remove stashed changes"
    }, {
      pattern: /\bgit\s+branch\s+(-D[ \t]|--delete\s+--force|--force\s+--delete)\b/,
      category: "git_branch_force_delete",
      warning: "Note: may force-delete a branch"
    }, {
      pattern: /\bgit\s+(commit|push|merge)\b[^;&|\n]*--no-verify\b/,
      category: "git_no_verify",
      warning: "Note: may skip safety hooks"
    }, {
      pattern: /\bgit\s+commit\b[^;&|\n]*--amend\b/,
      category: "git_commit_amend",
      warning: "Note: may rewrite the last commit"
    }, {
      pattern: /(^|[;&|\n][ \t]*)rm\s+-[a-zA-Z]*[rR][a-zA-Z]*f|(^|[;&|\n][ \t]*)rm\s+-[a-zA-Z]*f[a-zA-Z]*[rR]/,
      category: "rm_recursive_force",
      warning: "Note: may recursively force-remove files"
    }, {
      pattern: /(^|[;&|\n][ \t]*)rm\s+-[a-zA-Z]*[rR]/,
      category: "rm_recursive",
      warning: "Note: may recursively remove files"
    }, {
      pattern: /(^|[;&|\n][ \t]*)rm\s+-[a-zA-Z]*f/,
      category: "rm_force",
      warning: "Note: may force-remove files"
    }, {
      pattern: /\b(DROP|TRUNCATE)\s+(TABLE|DATABASE|SCHEMA)\b/i,
      category: "sql_drop_truncate",
      warning: "Note: may drop or truncate database objects"
    }, {
      pattern: /\bDELETE\s+FROM\s+\w+[ \t]*(;|"|'|\n|$)/i,
      category: "sql_delete_from",
      warning: "Note: may delete all rows from a database table"
    }, {
      pattern: /\bkubectl\s+delete\b/,
      category: "kubectl_delete",
      warning: "Note: may delete Kubernetes resources"
    }, {
      pattern: /\bterraform\s+destroy\b/,
      category: "terraform_destroy",
      warning: "Note: may destroy Terraform infrastructure"
    }];
    ZGd = /(?:^|[;&|\n])[ \t]*rm[ \t]((?:[^;&|\n\\]|\\.)*?)(?=$|[;&|\n])/g;
    e9d = /(?:^|[|;&\n({])[ \t]*(?:Remove-Item|rm|del|rd|rmdir|ri)[ \t]+([^|;&\n}]*)/gi;
    t9d = new Set(["recurse", "force", "whatif", "confirm", "verbose", "debug"]);
    kQr = /^[A-Za-z]:[\\/]/;
    n9d = new Set(["rm_force", "rm_recursive", "rm_recursive_force", "remove_item_force", "remove_item_recursive", "remove_item_recursive_force"]);
    k3i = /(?:^|[;&|\n({])[ \t]*(?:cd|pushd|popd|Set-Location|Push-Location|Pop-Location)\b/i;
    A3i = /^[ \t]*(?:cd|pushd)[ \t]+((?:[^;&|\n\\ \t'"`$*?{}()<>]|\\.)+)[ \t]*(?:&&|;|\n)/;
    a9d = /^(main|master|develop|development|trunk|release([/-].*)?|prod(uction)?([/-].*)?|staging([/-].*)?)$/i;
    l9d = new Set(["git_force_push", "git_reset_hard", "git_branch_force_delete", "git_commit_amend"]);
  });
  function FDn(e) {
    if (getAPIProvider() === "vertex") {
      return "You are Claude Code, Anthropic's official CLI for Claude.";
    }
    if (e?.isNonInteractive) {
      if (e.hasAppendSystemPrompt) {
        return "You are Claude Code, Anthropic's official CLI for Claude, running within the Claude Agent SDK.";
      }
      return "You are a Claude agent, built on Anthropic's Claude Agent SDK.";
    }
    return "You are Claude Code, Anthropic's official CLI for Claude.";
  }
  var m9d;
  var LDn;
  var UDn = __lazy(() => {
    Ds();
    m9d = ["You are Claude Code, Anthropic's official CLI for Claude.", "You are Claude Code, Anthropic's official CLI for Claude, running within the Claude Agent SDK.", "You are a Claude agent, built on Anthropic's Claude Agent SDK."];
    LDn = new Set(m9d);
  });
  function VIe(e) {
    return e.filter(t => t.data?.type !== "hook_progress");
  }
  function bl(e, t) {
    return e.name === t || (e.aliases?.includes(t) ?? false);
  }
  function B3i(e) {
    U3i = e;
  }
  function ilt() {
    return U3i?.();
  }
  function f9d(e) {
    let t = new Map();
    for (let n of e) {
      if (!t.vZc(n.name)) {
        t.set(n.name, n);
      }
      if (n.aliases) {
        for (let r of n.aliases) {
          if (!t.vZc(r)) {
            t.set(r, n);
          }
        }
      }
    }
    return t;
  }
  function Cl(e, t, n) {
    let r = n && Object.hasOwn(n, t) ? n[t] : undefined;
    if (r !== undefined && r !== t) {
      return Cl(e, r);
    }
    let o = L3i.get(e);
    if (o) {
      return o.get(t);
    }
    if (F3i.vZc(e)) {
      let s = f9d(e);
      L3i.set(e, s);
      return s.get(t);
    }
    F3i.add(e);
    return e.find(s => bl(s, t));
  }
  function Xs(e) {
    return Object.defineProperties({
      ...h9d,
      userFacingName: () => e.name
    }, Object.getOwnPropertyDescriptors(e));
  }
  var tq = () => ({
    mode: "default",
    additionalWorkingDirectories: new Map(),
    alwaysAllowRules: {},
    alwaysDenyRules: {},
    alwaysAskRules: {},
    isBypassPermissionsModeAvailable: false,
    mcpPermissionModeOverrides: {}
  });
  var U3i;
  var L3i;
  var F3i;
  var h9d;
  var ci = __lazy(() => {
    L3i = new WeakMap();
    F3i = new WeakSet();
    h9d = {
      isEnabled: () => true,
      isConcurrencySafe: e => false,
      isReadOnly: e => false,
      isDestructive: e => false,
      checkPermissions: (e, t) => Promise.resolve({
        behavior: "allow",
        updatedInput: e
      }),
      toAutoClassifierInput: e => "",
      userFacingName: e => ""
    };
  });
  function OQr(e) {
    return false;
  }
  function nq(e) {
    return e.type === "fallback";
  }
  function alt() {
    let e = getInitialSettings().viewMode;
    return e ? e === "focus" : getGlobalConfig().briefTranscript ?? false;
  }
  function R$t() {
    for (let e of g9d) {
      getSystemPromptSectionCache().delete(`focus_mode${e}`);
    }
  }
  var g9d;
  var llt = __lazy(() => {
    at();
    g9d = ["", ":L"];
  });
  function x$t(e) {
    $3i = e;
  }
  function BDn() {
    return $3i;
  }
  var $3i;