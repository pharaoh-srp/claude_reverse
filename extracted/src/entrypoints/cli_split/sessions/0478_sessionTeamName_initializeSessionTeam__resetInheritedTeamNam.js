  __export(FWc, {
    startEventLoopStallDetector: () => startEventLoopStallDetector,
    sampleRss: () => sampleRss
  });
  function sampleRss() {
    try {
      let e = process.memoryUsage();
      return {
        rss_mb: Math.round(e.rss / 1024 / 1024),
        heap_used_mb: Math.round(e.heapUsed / 1024 / 1024),
        ext_mb: Math.round(e.external / 1024 / 1024)
      };
    } catch (e) {
      logForDebugging(`[event-loop-stall] process.memoryUsage() failed: ${e instanceof Error ? e.message : String(e)}`, {
        level: "error"
      });
      return null;
    }
  }
  function startEventLoopStallDetector() {
    if (zts !== null) {
      return;
    }
    Kts = Date.now();
    logForDebugging(`[event-loop-stall] detector started (interval=${200}ms, threshold=${500}ms)`);
    zts = setInterval(() => {
      let e = Date.now();
      let t = e - Kts;
      let n = t - 200;
      if (kHf++, n > 500) {
        Yts++;
        Jts += n;
        let r = n > 5000;
        let o = sampleRss();
        if (logForDebugging(`[event-loop-stall] blocked for ${n}ms (expected ${200}ms, actual ${t}ms). Total stalls: ${Yts}, cumulative: ${Jts}ms${r ? " [likely sleep/wake]" : ""}` + (o ? ` rss=${o.rss_mb}MB heap=${o.heap_used_mb}MB ext=${o.ext_mb}MB` : ""), {
          level: "warn"
        }), logEvent("tengu_event_loop_stall", {
          stall_duration_ms: n,
          expected_interval_ms: 200,
          actual_interval_ms: t,
          total_stalls: Yts,
          cumulative_stall_ms: Jts,
          likely_sleep: r,
          ...o
        }), r) {
          rVd.get(process.stdout)?.reassertTerminalModes();
        }
      }
      Kts = e;
    }, 200);
    zts.unref();
  }
  var zts = null;
  var Kts = 0;
  var Yts = 0;
  var Jts = 0;
  var kHf = 0;
  var UWc = __lazy(() => {
    Ot();
    je();
  });
  async function PHf() {
    let e = getGlobalConfig().deepLinkTerminal;
    if (e) {
      let n = Z_r.find(r => r.app === e);
      if (n) {
        return {
          name: n.name,
          command: n.app
        };
      }
    }
    let t = process.env.TERM_PROGRAM;
    if (t) {
      let n = t.replace(/\.app$/i, "").toLowerCase();
      let r = Z_r.find(o => o.app.toLowerCase() === n || o.name.toLowerCase() === n || o.termProgramAliases?.includes(n));
      if (r) {
        return {
          name: r.name,
          command: r.app
        };
      }
    }
    for (let n of Z_r) {
      let {
        code: r,
        stdout: o
      } = await execFileNoThrow("mdfind", [`kMDItemCFBundleIdentifier == "${n.bundleId}"`], {
        timeout: 5000,
        useCwd: false
      });
      if (r === 0 && o.trim().length > 0) {
        return {
          name: n.name,
          command: n.app
        };
      }
    }
    for (let n of Z_r) {
      let {
        code: r
      } = await execFileNoThrow("ls", [`/Applications/${n.app}.app`], {
        timeout: 1000,
        useCwd: false
      });
      if (r === 0) {
        return {
          name: n.name,
          command: n.app
        };
      }
    }
    return {
      name: "Terminal.app",
      command: "Terminal"
    };
  }
  async function OHf() {
    let e = process.env.TERMINAL;
    if (e) {
      let n = await Qm(e);
      if (n) {
        return {
          name: qWc.basename(e),
          command: n
        };
      }
    }
    let t = await Qm("x-terminal-emulator");
    if (t) {
      return {
        name: "x-terminal-emulator",
        command: t
      };
    }
    for (let n of IHf) {
      let r = await Qm(n);
      if (r) {
        return {
          name: n,
          command: r
        };
      }
    }
    return null;
  }
  async function DHf() {
    let e = await Qm("wt.exe");
    if (e) {
      return {
        name: "Windows Terminal",
        command: e
      };
    }
    let t = await Qm("pwsh.exe");
    if (t) {
      return {
        name: "PowerShell",
        command: t
      };
    }
    let n = await Qm("powershell.exe");
    if (n) {
      return {
        name: "PowerShell",
        command: n
      };
    }
    return {
      name: "Command Prompt",
      command: process.env.ComSpec || `${process.env.SystemRoot || "C:\\Windows"}\\System32\\cmd.exe`
    };
  }
  async function MHf() {
    switch ("linux") {
      case "darwin":
        return PHf();
      case "linux":
        return OHf();
      case "win32":
        return DHf();
      default:
        return null;
    }
  }
  async function WWc(e, t) {
    let n = await MHf();
    if (!n) {
      logForDebugging("No terminal emulator detected", {
        level: "error"
      });
      return false;
    }
    logForDebugging(`Launching in terminal: ${n.name} (${n.command})`);
    let r = ["--deep-link-origin"];
    if (t.repo) {
      if (r.push(`--deep-link-repo=${t.repo}`), t.lastFetchMs !== undefined) {
        r.push(`--deep-link-last-fetch=${t.lastFetchMs}`);
      }
    }
    if (t.query) {
      r.push(`--prefill=${t.query}`);
    }
    switch ("linux") {
      case "darwin":
        return GWc(n, e, r, t);
      case "linux":
        return NHf(n, e, r, t);
      case "win32":
        return LHf(n, e, t);
      default:
        return false;
    }
  }
  async function GWc(e, t, n, r) {
    let {
      cwd: o
    } = r;
    switch (e.command) {
      case "iTerm":
        {
          let s = BWc(t, r);
          let i = `tell application "iTerm"
  if running then
    create window with default profile
  else
    activate
  end if
  tell current session of current window
    write text ${$Wc(s)}
  end tell
end tell`;
          let {
            code: a
          } = await execFileNoThrow("osascript", ["-e", i], {
            useCwd: false
          });
          if (a === 0) {
            return true;
          }
          break;
        }
      case "Terminal":
        {
          let s = BWc(t, r);
          let i = `tell application "Terminal"
  do script ${$Wc(s)}
  activate
end tell`;
          let {
            code: a
          } = await execFileNoThrow("osascript", ["-e", i], {
            useCwd: false
          });
          return a === 0;
        }
      case "Ghostty":
        {
          let s = ["-na", e.command, "--args", "--window-save-state=never"];
          if (o) {
            s.push(`--working-directory=${o}`);
          }
          s.push("-e", t, ...Kxt(r));
          let {
            code: i
          } = await execFileNoThrow("open", s, {
            useCwd: false
          });
          if (i === 0) {
            return true;
          }
          break;
        }
      case "Alacritty":
        {
          let s = ["-na", e.command, "--args"];
          if (o) {
            s.push("--working-directory", o);
          }
          s.push("-e", t, ...n);
          let {
            code: i
          } = await execFileNoThrow("open", s, {
            useCwd: false
          });
          if (i === 0) {
            return true;
          }
          break;
        }
      case "kitty":
        {
          let s = ["-na", e.command, "--args"];
          if (o) {
            s.push("--directory", o);
          }
          s.push(t, ...n);
          let {
            code: i
          } = await execFileNoThrow("open", s, {
            useCwd: false
          });
          if (i === 0) {
            return true;
          }
          break;
        }
      case "WezTerm":
        {
          let s = ["-na", e.command, "--args", "start"];
          if (o) {
            s.push("--cwd", o);
          }
          s.push("--", t, ...n);
          let {
            code: i
          } = await execFileNoThrow("open", s, {
            useCwd: false
          });
          if (i === 0) {
            return true;
          }
          break;
        }
    }
    logForDebugging(`Failed to launch ${e.name}, falling back to Terminal.app`);
    return GWc({
      name: "Terminal.app",
      command: "Terminal"
    }, t, n, r);
  }
  async function NHf(e, t, n, r) {
    let {
      cwd: o
    } = r;
    let s;
    let i;
    switch (e.name) {
      case "gnome-terminal":
        s = o ? [`--working-directory=${o}`, "--"] : ["--"];
        s.push(t, ...n);
        break;
      case "konsole":
        s = o ? ["--workdir", o, "-e"] : ["-e"];
        s.push(t, ...n);
        break;
      case "kitty":
        s = o ? ["--directory", o] : [];
        s.push(t, ...n);
        break;
      case "wezterm":
        s = o ? ["start", "--cwd", o, "--"] : ["start", "--"];
        s.push(t, ...n);
        break;
      case "alacritty":
        s = o ? ["--working-directory", o, "-e"] : ["-e"];
        s.push(t, ...n);
        break;
      case "ghostty":
        s = o ? [`--working-directory=${o}`, "-e"] : ["-e"];
        s.push(t, ...Kxt(r));
        break;
      case "xfce4-terminal":
      case "mate-terminal":
        s = o ? [`--working-directory=${o}`, "-x"] : ["-x"];
        s.push(t, ...n);
        break;
      case "tilix":
        s = o ? [`--working-directory=${o}`, "-e"] : ["-e"];
        s.push(t, ...Kxt(r));
        break;
      default:
        s = ["-e", t, ...Kxt(r)];
        i = o;
        break;
    }
    return VWc(e.command, s, {
      cwd: i
    });
  }
  async function LHf(e, t, n) {
    let r = [];
    let o = Kxt(n);
    let s = n.cwd;
    switch (e.name) {
      case "Windows Terminal":
        {
          let i = a => a.replaceAll(";", "\\;");
          if (s) {
            r.push("-d", i(s));
          }
          r.push("--", i(t), ...o);
          break;
        }
      case "PowerShell":
        {
          r.push("-NoExit", "-Command", `& ${UHf(t)} ${o.join(" ")}`);
          break;
        }
      default:
        {
          let i = `${HWc(t)} ${o.map(HWc).join(" ")}`;
          r.push("/d", "/v:off", "/s", "/k", `"${i}"`);
          break;
        }
    }
    return VWc(e.command, r, {
      windowsVerbatimArguments: e.name === "Command Prompt",
      cwd: n.cwd
    });
  }
  async function VWc(e, t, n = {}) {
    let r = o => new Promise(s => {
      let i = l => {
        logForDebugging(`Failed to spawn ${e}: ${l.message}`, {
          level: "error"
        });
        s(false);
      };
      let a;
      try {
        a = jWc.spawn(e, t, {
          detached: true,
          stdio: "ignore",
          windowsHide: false,
          cwd: o,
          windowsVerbatimArguments: n.windowsVerbatimArguments
        });
      } catch (l) {
        return i(l);
      }
      a.once("error", i);
      a.once("spawn", () => {
        a.unref();
        s(true);
      });
    });
    if (await r(n.cwd)) {
      return true;
    }
    if (n.cwd) {
      return r(undefined);
    }
    return false;
  }
  function Kxt(e) {
    let t = r => Buffer.from(r, "utf8").toString("base64url");
    let n = ["--deep-link-origin"];
    if (e.repo) {
      n.push(`--deep-link-repo=${e.repo}`);
    }
    if (e.lastFetchMs !== undefined) {
      n.push(`--deep-link-last-fetch=${e.lastFetchMs}`);
    }
    if (e.cwd) {
      n.push(`--deep-link-cwd-b64=${t(e.cwd)}`);
    }
    if (e.query) {
      n.push(`--prefill-b64=${t(e.query)}`);
    }
    return n;
  }
  function BWc(e, t) {
    let n = Kxt(t).join(" ");
    if (!FHf.test(n)) {
      throw Error(`Internal error: shell-safe args contain metacharacters: ${n}`);
    }
    if (/^[A-Za-z0-9/._-]+$/.test(e)) {
      return `${e} ${n}`;
    }
    if (/['\\!$\n]/.test(e)) {
      throw Error(`Deep-link launch unsupported: the claude binary path "${e}" contains a single quote, backslash, exclamation mark, dollar sign, or newline, which cannot be portably quoted for every login shell. Reinstall claude to a path without these characters to use deep links with iTerm2 or Terminal.app.`);
    }
    return `'${e}' ${n}`;
  }
  function $Wc(e) {
    return `"${e.replaceAll("\\", "\\\\").replaceAll('"', "\\\"").replaceAll(`
`, "\\n").replaceAll("\t", "\\t")}"`;
  }
  function UHf(e) {
    if (/[\u2018\u2019\u201A\u201B]/.test(e)) {
      throw Error("Cannot safely quote a Unicode single-quote variant (U+2018-U+201B) in a PowerShell path; install Windows Terminal (wt.exe).");
    }
    return `'${e.replaceAll('"', "").replaceAll("'", "''")}'`;
  }
  function HWc(e) {
    return `"${e.replace(/[\n\t]/g, " ").replace(/["%]/g, "").replace(/(\\+)$/, "$1$1")}"`;
  }
  var jWc;
  var qWc;
  var Z_r;
  var IHf;
  var FHf;
  var zWc = __lazy(() => {
    je();
    ji();
    jWc = require("child_process");
    qWc = require("path");
    Z_r = [{
      name: "iTerm2",
      bundleId: "com.googlecode.iterm2",
      app: "iTerm"
    }, {
      name: "Ghostty",
      bundleId: "com.mitchellh.ghostty",
      app: "Ghostty"
    }, {
      name: "Kitty",
      bundleId: "net.kovidgoyal.kitty",
      app: "kitty"
    }, {
      name: "Alacritty",
      bundleId: "org.alacritty",
      app: "Alacritty"
    }, {
      name: "WezTerm",
      bundleId: "com.github.wez.wezterm",
      app: "WezTerm"
    }, {
      name: "Terminal.app",
      bundleId: "com.apple.Terminal",
      app: "Terminal",
      termProgramAliases: ["apple_terminal"]
    }];
    IHf = ["ghostty", "kitty", "alacritty", "wezterm", "gnome-terminal", "konsole", "xfce4-terminal", "mate-terminal", "tilix", "xterm"];
    FHf = /^[A-Za-z0-9 /._=-]+$/;
  });
  var KWc = {};
  __export(KWc, {
    waitForUrlEvent: () => waitForUrlEvent
  });
  function BHf() {
    if (null) {
      return null;
    }
    return null;
  }
  function waitForUrlEvent(e) {
    let t = BHf();
    if (!t) {
      return null;
    }
    return t.waitForUrlEvent(e);
  }
  var YWc = () => {};
  var ZWc = {};
  __export(ZWc, {
    handleUrlSchemeLaunch: () => handleUrlSchemeLaunch,
    handleDeepLinkUri: () => handleDeepLinkUri
  });
  async function handleDeepLinkUri(e) {
    logForDebugging(`Handling deep link URI: ${e}`);
    let t;
    try {
      t = jAc(e);
    } catch (a) {
      let l = a instanceof Error ? a.message : String(a);
      console.error(`Deep link error: ${l}`);
      Ae("deep_link_handle", "parse_failed");
      return 1;
    }
    logForDebugging(`Parsed deep link action: ${De(t)}`);
    let n = await JWc.realpath(process.execPath).catch(() => process.execPath);
    let {
      cwd: r,
      resolvedRepo: o
    } = await jHf(t);
    let s = o ? await Sxc(r) : undefined;
    let i;
    try {
      i = await WWc(n, {
        query: t.query,
        cwd: r,
        repo: o,
        lastFetchMs: s?.getTime()
      });
    } catch (a) {
      let l = a instanceof Error ? a.message : String(a);
      console.error(`Deep link error: ${l}`);
      Ae("deep_link_handle", "launch_error");
      return 1;
    }
    if (!i) {
      console.error("Failed to open a terminal. Make sure a supported terminal emulator is installed.");
      Ae("deep_link_handle", "no_terminal");
      return 1;
    }
    Pe("deep_link_handle");
    return 0;
  }
  async function handleUrlSchemeLaunch() {
    if (process.env.__CFBundleIdentifier !== "com.anthropic.claude-code-url-handler") {
      return null;
    }
    try {
      let {
        waitForUrlEvent: e
      } = await Promise.resolve().then(() => (YWc(), KWc));
      let t = e(5000);
      if (!t) {
        return null;
      }
      return await handleDeepLinkUri(t);
    } catch {
      return null;
    }
  }
  async function jHf(e) {
    if (e.cwd) {
      return {
        cwd: e.cwd
      };
    }
    if (e.repo) {
      let t = O_r(e.repo);
      let n = await D_r(t);
      if (n[0]) {
        logForDebugging(`Resolved repo ${e.repo} \u2192 ${n[0]}`);
        return {
          cwd: n[0],
          resolvedRepo: e.repo
        };
      }
      logForDebugging(`No local clone found for repo ${e.repo}, falling back to home`);
    }
    return {
      cwd: XWc.homedir()
    };
  }
  var JWc;
  var XWc;
  var eGc = __lazy(() => {
    ln();
    je();
    osn();
    zhr();
    vgr();
    AQo();
    zWc();
    JWc = require("fs/promises");
    XWc = require("os");
  });
  var rGc = {};
  __export(rGc, {
    sessionTeamName: () => sessionTeamName,
    initializeSessionTeam: () => initializeSessionTeam,
    _resetInheritedTeamNameForTesting: () => _resetInheritedTeamNameForTesting
  });
  function sessionTeamName(e) {
    return `${"session"}-${e.slice(0, 8)}`;
  }
  function WHf() {
    if (getInheritedTeamName() === undefined) {
      let e = process.env.CLAUDE_INTERNAL_ASSISTANT_TEAM_NAME || null;
      delete process.env.CLAUDE_INTERNAL_ASSISTANT_TEAM_NAME;
      setInheritedTeamName(e);
    }
    return getInheritedTeamName() ?? null;
  }
  function _resetInheritedTeamNameForTesting() {
    setInheritedTeamName(undefined);
  }
  async function initializeSessionTeam(e) {
    let t = e?.existingTeamName || WHf();
    let n = t ?? sessionTeamName(getSessionId());
    let r = m8("team-lead", n);
    let o = getTeamFilePath(n);
    if (!(t ? await readTeamFileAsync(n) : null)) {
      let l = {
        name: n,
        createdAt: Date.now(),
        leadAgentId: r,
        leadSessionId: getSessionId(),
        members: [{
          agentId: r,
          name: "team-lead",
          agentType: "team-lead",
          joinedAt: Date.now(),
          tmuxPaneId: "leader",
          cwd: getOriginalCwd(),
          subscriptions: [],
          backendType: "in-process"
        }]
      };
      await writeTeamFileAsync(n, l).catch(c => logTeamFileWriteFailure(n, c));
    }
    z5a(n);
    let i = getSessionId();
    if (n !== i) {
      await tGc.rename(w9(i), w9(n)).catch(() => {});
    }
    await Jvo(n);
    registerTeamForSessionCleanup(n);
    let a = eb[0];
    return {
      teamContext: {
        teamName: n,
        teamFilePath: o,
        leadAgentId: r,
        teammates: {
          [r]: {
            name: "team-lead",
            agentType: "team-lead",
            color: a,
            tmuxSessionName: "in-process",
            tmuxPaneId: "leader",
            cwd: getOriginalCwd(),
            spawnedAt: Date.now()
          }
        }
      },
      teammateColors: {
        assignments: new Map([[r, a]]),
        index: 1
      }
    };
  }
  var tGc;
  var oGc = __lazy(() => {
    at();
    $U();
    YI();
    eL();
    UM();
    tGc = require("fs/promises");
  });
  var aGc = {};