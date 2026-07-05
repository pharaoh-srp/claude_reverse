  __export(Hja, {
    hasIdeOnboardingDialogBeenShown: () => hasIdeOnboardingDialogBeenShown,
    IdeOnboardingDialog: () => IdeOnboardingDialog
  });
  function IdeOnboardingDialog(e) {
    let t = Bja.c(22);
    let {
      onDone: n,
      installationStatus: r
    } = e;
    wjp();
    let o;
    if (t[0] !== n) {
      o = {
        "confirm:yes": n,
        "confirm:no": n
      };
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = {
        context: "Confirmation"
      };
      t[2] = s;
    } else {
      s = t[2];
    }
    jo(o, s);
    let i;
    if (t[3] !== r?.ideType) {
      i = r?.ideType ?? YSo();
      t[3] = r?.ideType;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a = i;
    let l = Foe(a);
    let c;
    if (t[5] !== a) {
      c = S0(a);
      t[5] = a;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u = c;
    let d = r?.installedVersion;
    let p = l ? "plugin" : "extension";
    let m = Me.platform === "darwin" ? "Cmd+Option+K" : "Ctrl+Alt+K";
    let f;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      f = rA.jsx(Text, {
        color: "claude",
        children: "\u273B "
      });
      t[7] = f;
    } else {
      f = t[7];
    }
    let h;
    if (t[8] !== u) {
      h = rA.jsxs(rA.Fragment, {
        children: [f, rA.jsxs(Text, {
          children: ["Welcome to Claude Code for ", u]
        })]
      });
      t[8] = u;
      t[9] = h;
    } else {
      h = t[9];
    }
    let g = d ? `installed ${p} v${d}` : undefined;
    let y;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      y = rA.jsx(Text, {
        color: "suggestion",
        children: "\u29C9 open files"
      });
      t[10] = y;
    } else {
      y = t[10];
    }
    let _;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      _ = rA.jsxs(Pw, {
        children: ["Claude has context of ", y, " ", "and ", rA.jsx(Text, {
          color: "suggestion",
          children: "\u29C9 selected lines"
        })]
      });
      t[11] = _;
    } else {
      _ = t[11];
    }
    let b;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      b = rA.jsxs(Pw, {
        children: ["Review Claude Code's changes", " ", rA.jsx(d9, {
          added: 11,
          removed: 22
        }), " in the comfort of your IDE"]
      });
      t[12] = b;
    } else {
      b = t[12];
    }
    let S;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      S = rA.jsxs(Pw, {
        children: ["Cmd+Esc", rA.jsx(Text, {
          dimColor: true,
          children: " for Quick Launch"
        })]
      });
      t[13] = S;
    } else {
      S = t[13];
    }
    let E;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      E = rA.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [_, b, S, rA.jsxs(Pw, {
          children: [m, rA.jsx(Text, {
            dimColor: true,
            children: " to reference files or lines in your input"
          })]
        })]
      });
      t[14] = E;
    } else {
      E = t[14];
    }
    let C;
    if (t[15] !== n || t[16] !== h || t[17] !== g) {
      C = rA.jsx(or, {
        title: h,
        subtitle: g,
        color: "ide",
        onCancel: n,
        hideInputGuide: true,
        children: E
      });
      t[15] = n;
      t[16] = h;
      t[17] = g;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      x = rA.jsx(gXd, {
        paddingX: 1,
        children: rA.jsxs(Text, {
          dimColor: true,
          italic: true,
          children: ["Press ", rA.jsx(xt, {
            chord: "enter",
            action: "continue"
          })]
        })
      });
      t[19] = x;
    } else {
      x = t[19];
    }
    let A;
    if (t[20] !== C) {
      A = rA.jsxs(rA.Fragment, {
        children: [C, x]
      });
      t[20] = C;
      t[21] = A;
    } else {
      A = t[21];
    }
    return A;
  }
  function hasIdeOnboardingDialogBeenShown() {
    let e = getGlobalConfig();
    let t = nM.terminal || "unknown";
    return e.hasIdeOnboardingBeenShown?.[t] === true;
  }
  function wjp() {
    if (hasIdeOnboardingDialogBeenShown()) {
      return;
    }
    let e = nM.terminal || "unknown";
    saveGlobalConfig(t => ({
      ...t,
      hasIdeOnboardingBeenShown: {
        ...t.hasIdeOnboardingBeenShown,
        [e]: true
      }
    }));
    Pe("onboarding_ide_dialog_shown");
  }
  var Bja;
  var rA;
  var KSo = __lazy(() => {
    YW();
    et();
    Bs();
    ln();
    pr();
    bT();
    Loe();
    Ii();
    pNe();
    bs();
    Bja = __toESM(pt(), 1);
    rA = __toESM(ie(), 1);
  });
  function Yja(e) {
    try {
      process.kill(e, 0);
      return true;
    } catch {
      return false;
    }
  }
  function Cjp() {
    let e = null;
    return () => {
      if (!e) {
        e = getAncestorPidsAsync(process.ppid, 10).then(t => new Set(t));
      }
      return e;
    };
  }
  function ZWn(e) {
    if (!e) {
      return false;
    }
    let t = nht[e];
    return t && t.ideKind === "vscode";
  }
  function Foe(e) {
    if (!e) {
      return false;
    }
    let t = nht[e];
    return t && t.ideKind === "jetbrains";
  }
  function YSo() {
    if (!M$()) {
      return null;
    }
    return Me.terminal;
  }
  function rht(e = false) {
    if (Me.CLAUDE_CODE_AUTO_CONNECT_IDE === false) {
      return false;
    }
    return Boolean(getGlobalConfig().autoConnectIde || e || M$() || Me.CLAUDE_CODE_SSE_PORT !== undefined || Me.CLAUDE_CODE_AUTO_CONNECT_IDE === true);
  }
  async function tGn() {
    try {
      let e = await xjp();
      return (await Promise.all(e.map(async n => {
        try {
          let o = (await zt().readdir(n)).filter(i => i.name.endsWith(".lock"));
          return (await Promise.all(o.map(async i => {
            let a = V1.join(n, i.name);
            try {
              let l = await zt().stat(a);
              return {
                path: a,
                mtime: l.mtime
              };
            } catch {
              return null;
            }
          }))).filter(i => i !== null);
        } catch (r) {
          if (!Io(r)) {
            Oe(r);
          }
          return [];
        }
      }))).flat().sort((n, r) => r.mtime.getTime() - n.mtime.getTime()).map(n => n.path);
    } catch (e) {
      Oe(e);
      return [];
    }
  }
  async function Jja(e) {
    try {
      let t = await zt().readFile(e, {
        encoding: "utf-8"
      });
      let n = [];
      let r;
      let o;
      let s = false;
      let i = false;
      let a;
      try {
        let u = qt(t);
        if (u.workspaceFolders) {
          n = u.workspaceFolders;
        }
        r = u.pid;
        o = u.ideName;
        s = u.transport === "ws";
        i = u.runningInWindows === true;
        a = u.authToken;
      } catch (u) {
        n = t.split(`
`).map(d => d.trim());
      }
      let l = e.split(V1.sep).pop();
      if (!l) {
        return null;
      }
      let c = l.replace(".lock", "");
      return {
        workspaceFolders: n,
        port: parseInt(c),
        pid: r,
        ideName: o,
        useWebSocket: s,
        runningInWindows: i,
        authToken: a
      };
    } catch (t) {
      logForDebugging(`Failed to read IDE lockfile ${e}: ${he(t)}`, {
        level: "error"
      });
      return null;
    }
  }
  async function JSo(e, t, n = 500) {
    try {
      return new Promise(r => {
        let o = zja.createConnection({
          host: e,
          port: t,
          timeout: n
        });
        o.on("connect", () => {
          o.destroy();
          r(true);
        });
        o.on("error", () => {
          r(false);
        });
        o.on("timeout", () => {
          o.destroy();
          r(false);
        });
      });
    } catch (r) {
      return false;
    }
  }
  async function xjp() {
    let e = [V1.join(er(), "ide")];
    if (process.env.CLAUDE_CONFIG_DIR?.trim()) {
      e.push(V1.join(Kja.homedir(), ".claude", "ide").normalize("NFC"));
    }
    if (Wt() === "wsl") {
      let r = await Rjp();
      if (r) {
        let s = await new WPe(process.env.WSL_DISTRO_NAME).toLocalPath(r);
        e.push(V1.resolve(s, ".claude", "ide"));
      }
      try {
        let s = await zt().readdir("/mnt/c/Users");
        for (let i of s) {
          if (!i.isDirectory() && !i.isSymbolicLink()) {
            continue;
          }
          if (i.name === "Public" || i.name === "Default" || i.name === "Default User" || i.name === "All Users") {
            continue;
          }
          e.push(V1.join("/mnt/c/Users", i.name, ".claude", "ide"));
        }
      } catch (o) {
        if (Io(o)) {
          logForDebugging(`WSL IDE lockfile path detection failed (${o.code}): ${he(o)}`);
        } else {
          logForDebugging(`WSL IDE lockfile path detection failed unexpectedly: ${he(o)}`, {
            level: "error"
          });
        }
      }
    }
    let t = new Set();
    let n = [];
    for (let r of e) {
      let o = await Vja.realpath(r).catch(() => V1.resolve(r));
      if (t.vZc(o)) {
        continue;
      }
      t.add(o);
      n.push(r);
    }
    return n;
  }
  async function kjp() {
    try {
      let e = await tGn();
      for (let t of e) {
        let n = await Jja(t);
        if (!n) {
          try {
            await zt().unlink(t);
          } catch (s) {
            logForDebugging(`Failed to delete unreadable IDE lockfile ${t}: ${s}`, {
              level: "error"
            });
          }
          continue;
        }
        let r = await iqa(n.runningInWindows, n.port);
        let o = false;
        if (n.pid) {
          if (!Yja(n.pid)) {
            if (Wt() !== "wsl") {
              o = true;
            } else if (!(await JSo(r, n.port))) {
              o = true;
            }
          }
        } else if (!(await JSo(r, n.port))) {
          o = true;
        }
        if (o) {
          try {
            await zt().unlink(t);
          } catch (s) {
            logForDebugging(`Failed to remove stale IDE lockfile ${t}: ${he(s)}`, {
              level: "error"
            });
          }
        }
      }
    } catch (e) {
      Oe(e);
    }
  }
  async function Ajp(e) {
    try {
      let t = await Pjp(e);
      if (logEvent("tengu_ext_installed", {
        ide_type: e,
        installed_version: t == null ? undefined : uS(t)
      }), Pe("ide_extension_install"), !getGlobalConfig().diffTool) {
        saveGlobalConfig(r => ({
          ...r,
          diffTool: "auto"
        }));
      }
      return {
        installed: true,
        error: null,
        installedVersion: t,
        ideType: e
      };
    } catch (t) {
      logEvent("tengu_ext_install_error", {
        ide_type: e,
        error_code: WZe(t)
      });
      Ae("ide_extension_install", "ide_extension_install_failed");
      let n = t instanceof Error ? t.message : String(t);
      logForDebugging(`IDE extension install failed: ${n}`, {
        level: "error"
      });
      return {
        installed: false,
        error: n,
        installedVersion: null,
        ideType: e
      };
    }
  }
  async function QWn() {
    if (U6e) {
      U6e.abort();
    }
    U6e = createAbortController();
    let e = U6e.signal;
    await kjp();
    let t = Date.now();
    while (Date.now() - t < 30000 && !e.aborted) {
      if (getIsScrollDraining()) {
        await sleep(1000, e);
        continue;
      }
      let n = await rGn(false);
      if (e.aborted) {
        return null;
      }
      if (n.length === 1) {
        return n[0];
      }
      await sleep(1000, e);
    }
    return null;
  }
  function nGn() {
    if (U6e) {
      U6e.abort();
      U6e = null;
    }
  }
  async function rGn(e) {
    let t = [];
    try {
      let n = process.env.CLAUDE_CODE_SSE_PORT;
      let r = n ? parseInt(n) : null;
      let o = getOriginalCwd().normalize("NFC");
      let s = await tGn();
      let i = await Promise.all(s.map(Jja));
      let a = Cjp();
      let l = Wt() !== "wsl" && M$();
      for (let c of i) {
        if (!c) {
          continue;
        }
        let u = false;
        if (st(process.env.CLAUDE_CODE_IDE_SKIP_VALID_CHECK)) {
          u = true;
        } else if (c.port === r) {
          u = true;
        } else {
          for (let f of c.workspaceFolders) {
            if (!f) {
              continue;
            }
            let h = f;
            if (Wt() === "wsl" && c.runningInWindows && process.env.WSL_DISTRO_NAME) {
              if (!RXi(f, process.env.WSL_DISTRO_NAME)) {
                continue;
              }
              let y = V1.resolve(h).normalize("NFC");
              if (o === y || o.startsWith(y + V1.sep)) {
                u = true;
                break;
              }
              h = await new WPe(process.env.WSL_DISTRO_NAME).toLocalPath(f);
            }
            let g = V1.resolve(h).normalize("NFC");
            if (Wt() === "windows") {
              let y = o.replace(/^[a-zA-Z]:/, b => b.toUpperCase());
              let _ = g.replace(/^[a-zA-Z]:/, b => b.toUpperCase());
              if (y === _ || y.startsWith(_ + V1.sep)) {
                u = true;
                break;
              }
              continue;
            }
            if (o === g || o.startsWith(g + V1.sep)) {
              u = true;
              break;
            }
          }
        }
        if (!u && !e) {
          continue;
        }
        if (l) {
          if (!(r !== null && c.port === r)) {
            if (!c.pid || !Yja(c.pid)) {
              continue;
            }
            if (process.ppid !== c.pid) {
              if (!(await a()).vZc(c.pid)) {
                continue;
              }
            }
          }
        }
        let d = c.ideName ? Zja(c.ideName) : M$() ? S0(nM.terminal) : "IDE";
        let p = await iqa(c.runningInWindows, c.port);
        let m;
        if (c.useWebSocket) {
          m = `ws://${p}:${c.port}`;
        } else {
          m = `http://${p}:${c.port}/sse`;
        }
        t.push({
          url: m,
          name: d,
          workspaceFolders: c.workspaceFolders,
          port: c.port,
          isValid: u,
          authToken: c.authToken,
          ideRunningInWindows: c.runningInWindows
        });
      }
      if (!e && r) {
        let c = t.filter(u => u.isValid && u.port === r);
        if (c.length === 1) {
          Pe("ide_detect");
          return c;
        }
      }
      Pe("ide_detect");
    } catch (n) {
      Oe(n);
      Et("ide_detect", "ide_detect_failed");
    }
    return t;
  }
  async function Xja(e) {
    await e.notification({
      method: "ide_connected",
      params: {
        pid: process.pid
      }
    });
  }
  function B6e(e) {
    return e.some(t => t.type === "connected" && t.name === "ide");
  }
  async function qja(e) {
    if (ZWn(e)) {
      let t = await oGn(e);
      if (t) {
        try {
          if ((await execFileNoThrowWithCwd(t, ["--list-extensions"], {
            env: QSo()
          })).stdout?.includes("anthropic.claude-code")) {
            return true;
          }
        } catch {}
      }
    } else if (Foe(e)) {
      return await Nja(e);
    }
    return false;
  }
  async function Pjp(e) {
    if (ZWn(e)) {
      let t = await oGn(e);
      if (t) {
        let n = await Ojp(t);
        if (!n || Vne(n, Wja())) {
          await sleep(500);
          let r = await execFileNoThrowWithCwd(t, ["--force", "--install-extension", "anthropic.claude-code"], {
            env: QSo()
          });
          if (r.code !== 0) {
            throw Object.assign(Error(`${r.code}: ${r.error} ${r.stderr}`), {
              code: `EXIT_${r.code}`
            });
          }
          n = Wja();
        }
        return n;
      }
    }
    return null;
  }
  function QSo() {
    if (Wt() === "linux") {
      return {
        ...process.env,
        DISPLAY: ""
      };
    }
    return;
  }
  function Wja() {
    return {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
  }
  async function Ojp(e) {
    let {
      stdout: t
    } = await execFileNoThrow(e, ["--list-extensions", "--show-versions"], {
      env: QSo()
    });
    let n = t?.split(`
`) || [];
    for (let r of n) {
      let [o, s] = r.split("@");
      if (o === "anthropic.claude-code" && s) {
        return s;
      }
    }
    return null;
  }
  function Qja(e) {
    let t = e.toLowerCase();
    if (t.includes("windsurf") || t.includes("devin")) {
      return "windsurf";
    }
    if (t.includes("cursor")) {
      return "cursor";
    }
    if (!t.includes("insiders") && (t.includes("vscode") || t.includes("vs code") || t.includes("visual studio code") || t.includes("vscodium") || t.includes("code - oss"))) {
      return "vscode";
    }
    return null;
  }
  function Zja(e) {
    return e.replace(/windsurf/gi, "Devin Desktop");
  }
  async function oGn(e, t) {
    let n = Mjp[e];
    if (!n) {
      return null;
    }
    if (e === "vscode" && t) {
      n = t.toLowerCase().includes("vscodium") ? ["codium"] : ["code"];
    }
    let r = await Djp();
    if (r && n.includes(V1.basename(r))) {
      try {
        await zt().stat(r);
        return r;
      } catch {}
    }
    let o = Wt() === "windows" ? ".cmd" : "";
    return n[0] + o;
  }
  async function eqa() {
    return (await execFileNoThrow("cursor", ["--version"])).code === 0;
  }
  async function tqa() {
    if ((await execFileNoThrow("windsurf", ["--version"])).code === 0) {
      return true;
    }
    return (await execFileNoThrow("devin-desktop", ["--version"])).code === 0;
  }
  async function nqa() {
    let e = await execFileNoThrow("code", ["--help"]);
    return e.code === 0 && Boolean(e.stdout?.includes("Visual Studio Code"));
  }
  async function Njp() {
    let e = [];
    try {
      let t = Wt();
      if (t === "macos") {
        let r = (await yI('ps aux | grep -E "Visual Studio Code|Code Helper|Cursor Helper|Windsurf Helper|Devin Helper|Devin.app|IntelliJ IDEA|PyCharm|WebStorm|PhpStorm|RubyMine|CLion|GoLand|Rider|DataGrip|AppCode|DataSpell|Aqua|Gateway|Fleet|Android Studio" | grep -v grep', {
          reject: false
        })).stdout ?? "";
        for (let [o, s] of Object.entries(nht)) {
          for (let i of s.processKeywordsMac) {
            if (r.includes(i)) {
              e.push(o);
              break;
            }
          }
        }
      } else if (t === "windows") {
        let o = ((await yI('tasklist | findstr /I "Code.exe Cursor.exe Windsurf.exe Devin.exe idea64.exe pycharm64.exe webstorm64.exe phpstorm64.exe rubymine64.exe clion64.exe goland64.exe rider64.exe datagrip64.exe appcode.exe dataspell64.exe aqua64.exe gateway64.exe fleet.exe studio64.exe"', {
          reject: false
        })).stdout ?? "").toLowerCase();
        for (let [s, i] of Object.entries(nht)) {
          for (let a of i.processKeywordsWindows) {
            if (o.includes(a.toLowerCase())) {
              e.push(s);
              break;
            }
          }
        }
      } else if (t === "linux") {
        let o = ((await yI('ps aux | grep -E "code|cursor|windsurf|devin-desktop|idea|pycharm|webstorm|phpstorm|rubymine|clion|goland|rider|datagrip|dataspell|aqua|gateway|fleet|android-studio" | grep -v grep', {
          reject: false
        })).stdout ?? "").toLowerCase();
        for (let [s, i] of Object.entries(nht)) {
          for (let a of i.processKeywordsLinux) {
            if (o.includes(a)) {
              if (s !== "vscode") {
                e.push(s);
                break;
              } else if (!o.includes("cursor") && !o.includes("appcode")) {
                e.push(s);
                break;
              }
            }
          }
        }
      }
    } catch (t) {
      logForDebugging(`IDE process detection failed: ${t}`, {
        level: "error"
      });
    }
    return e;
  }
  async function ZSo() {
    let e = await Njp();
    XSo = e;
    return e;
  }
  async function rqa() {
    if (XSo === null) {
      return ZSo();
    }
    return XSo;
  }
  function g5t(e) {
    let t = e.find(n => n.type === "connected" && n.name === "ide");
    return eTo(t);
  }
  function eTo(e) {
    let t = e?.config;
    return t?.type === "sse-ide" || t?.type === "ws-ide" ? Zja(t.ideName) : M$() ? S0(nM.terminal) : null;
  }
  function S0(e) {
    if (!e) {
      return "IDE";
    }
    let t = nht[e];
    if (t) {
      return t.displayName;
    }
    let n = Gja[e.toLowerCase().trim()];
    if (n) {
      return n;
    }
    let r = ii(e, " ");
    let o = r ? V1.basename(r).toLowerCase() : null;
    if (o) {
      let s = Gja[o];
      if (s) {
        return s;
      }
      return bjp(o);
    }
    return bjp(e);
  }
  function p9(e) {
    if (!e) {
      return;
    }
    let t = e.find(n => n.type === "connected" && n.name === "ide");
    return t?.type === "connected" ? t : undefined;
  }
  async function oqa(e) {
    try {
      await Uoe("closeAllDiffTabs", {}, e);
    } catch (t) {}
  }
  async function sqa(e, t, n, r, o) {
    QWn().then(e);
    let s = getGlobalConfig().autoInstallIdeExtension ?? true;
    if (!st(process.env.CLAUDE_CODE_IDE_SKIP_AUTO_INSTALL) && s) {
      let i = t ?? YSo();
      if (i) {
        if (ZWn(i)) {
          qja(i).then(async a => {
            Ajp(i).catch(l => ({
              installed: false,
              error: l.message || "Installation failed",
              installedVersion: null,
              ideType: i
            })).then(l => {
              if (r(l), l?.installed && !o?.aborted) {
                QWn().then(e);
              }
              if (!a && l?.installed === true && !jja().hasIdeOnboardingDialogBeenShown()) {
                n();
              }
            });
          });
        } else if (Foe(i)) {
          qja(i).then(async a => {
            if (a && !jja().hasIdeOnboardingDialogBeenShown()) {
              n();
            }
          });
        }
      }
    }
  }
  var Vja;
  var zja;
  var Kja;
  var V1;
  var jja = () => (KSo(), __toCommonJS(Hja));
  var nht;
  var h5t;
  var eGn;
  var M$;
  var Rjp;
  var U6e = null;
  var Djp;
  var Mjp;
  var XSo = null;
  var Gja;
  var iqa;
  var bT = __lazy(() => {
    Ot();
    Gu();
    at();
    ln();
    pk();
    eA();
    pr();
    gn();
    ji();
    Tb();
    Lja();
    Rn();
    Cs();
    oF();
    Zn();
    BC();
    Kp();
    je();
    YW();
    dt();
    oLn();
    Vja = require("fs/promises");
    zja = require("net");
    Kja = __toESM(require("os"));
    V1 = require("path");
    nht = {
      cursor: {
        ideKind: "vscode",
        displayName: "Cursor",
        processKeywordsMac: ["Cursor Helper", "Cursor.app"],
        processKeywordsWindows: ["cursor.exe"],
        processKeywordsLinux: ["cursor"]
      },
      windsurf: {
        ideKind: "vscode",
        displayName: "Devin Desktop",
        processKeywordsMac: ["Windsurf Helper", "Windsurf.app", "Devin Helper", "Devin.app"],
        processKeywordsWindows: ["windsurf.exe", "Devin.exe"],
        processKeywordsLinux: ["windsurf", "devin-desktop"]
      },
      vscode: {
        ideKind: "vscode",
        displayName: "VS Code",
        processKeywordsMac: ["Visual Studio Code", "Code Helper"],
        processKeywordsWindows: ["code.exe"],
        processKeywordsLinux: ["code"]
      },
      intellij: {
        ideKind: "jetbrains",
        displayName: "IntelliJ IDEA",
        processKeywordsMac: ["IntelliJ IDEA"],
        processKeywordsWindows: ["idea64.exe"],
        processKeywordsLinux: ["idea", "intellij"]
      },
      pycharm: {
        ideKind: "jetbrains",
        displayName: "PyCharm",
        processKeywordsMac: ["PyCharm"],
        processKeywordsWindows: ["pycharm64.exe"],
        processKeywordsLinux: ["pycharm"]
      },
      webstorm: {
        ideKind: "jetbrains",
        displayName: "WebStorm",
        processKeywordsMac: ["WebStorm"],
        processKeywordsWindows: ["webstorm64.exe"],
        processKeywordsLinux: ["webstorm"]
      },
      phpstorm: {
        ideKind: "jetbrains",
        displayName: "PhpStorm",
        processKeywordsMac: ["PhpStorm"],
        processKeywordsWindows: ["phpstorm64.exe"],
        processKeywordsLinux: ["phpstorm"]
      },
      rubymine: {
        ideKind: "jetbrains",
        displayName: "RubyMine",
        processKeywordsMac: ["RubyMine"],
        processKeywordsWindows: ["rubymine64.exe"],
        processKeywordsLinux: ["rubymine"]
      },
      clion: {
        ideKind: "jetbrains",
        displayName: "CLion",
        processKeywordsMac: ["CLion"],
        processKeywordsWindows: ["clion64.exe"],
        processKeywordsLinux: ["clion"]
      },
      goland: {
        ideKind: "jetbrains",
        displayName: "GoLand",
        processKeywordsMac: ["GoLand"],
        processKeywordsWindows: ["goland64.exe"],
        processKeywordsLinux: ["goland"]
      },
      rider: {
        ideKind: "jetbrains",
        displayName: "Rider",
        processKeywordsMac: ["Rider"],
        processKeywordsWindows: ["rider64.exe"],
        processKeywordsLinux: ["rider"]
      },
      datagrip: {
        ideKind: "jetbrains",
        displayName: "DataGrip",
        processKeywordsMac: ["DataGrip"],
        processKeywordsWindows: ["datagrip64.exe"],
        processKeywordsLinux: ["datagrip"]
      },
      appcode: {
        ideKind: "jetbrains",
        displayName: "AppCode",
        processKeywordsMac: ["AppCode"],
        processKeywordsWindows: ["appcode.exe"],
        processKeywordsLinux: ["appcode"]
      },
      dataspell: {
        ideKind: "jetbrains",
        displayName: "DataSpell",
        processKeywordsMac: ["DataSpell"],
        processKeywordsWindows: ["dataspell64.exe"],
        processKeywordsLinux: ["dataspell"]
      },
      aqua: {
        ideKind: "jetbrains",
        displayName: "Aqua",
        processKeywordsMac: [],
        processKeywordsWindows: ["aqua64.exe"],
        processKeywordsLinux: []
      },
      gateway: {
        ideKind: "jetbrains",
        displayName: "Gateway",
        processKeywordsMac: [],
        processKeywordsWindows: ["gateway64.exe"],
        processKeywordsLinux: []
      },
      fleet: {
        ideKind: "jetbrains",
        displayName: "Fleet",
        processKeywordsMac: [],
        processKeywordsWindows: ["fleet.exe"],
        processKeywordsLinux: []
      },
      androidstudio: {
        ideKind: "jetbrains",
        displayName: "Android Studio",
        processKeywordsMac: ["Android Studio"],
        processKeywordsWindows: ["studio64.exe"],
        processKeywordsLinux: ["android-studio"]
      }
    };
    h5t = TEr(() => ZWn(Me.terminal));
    eGn = TEr(() => Foe(nM.terminal));
    M$ = TEr(() => h5t() || eGn() || Boolean(process.env.FORCE_CODE_TERMINAL));
    Rjp = TEr(async () => {
      if (process.env.USERPROFILE) {
        return process.env.USERPROFILE;
      }
      let {
        stdout: e,
        code: t
      } = await execFileNoThrow("powershell.exe", ["-NoProfile", "-NonInteractive", "-Command", "$env:USERPROFILE"]);
      if (t === 0 && e.trim()) {
        return e.trim();
      }
      logForDebugging("Unable to get Windows USERPROFILE via PowerShell - IDE detection may be incomplete");
      return;
    });
    Djp = TEr(async () => {
      try {
        if (Wt() !== "macos") {
          return null;
        }
        let t = process.ppid;
        for (let n = 0; n < 10; n++) {
          if (!t || t === 0 || t === 1) {
            break;
          }
          let r = (await execFileNoThrow("ps", ["-o", "command=", "-p", String(t)])).stdout.trim();
          if (r) {
            let s = {
              "Visual Studio Code.app": "code",
              "Cursor.app": "cursor",
              "Windsurf.app": "windsurf",
              "Devin.app": "devin",
              "Visual Studio Code - Insiders.app": "code",
              "VSCodium.app": "codium"
            };
            let i = "/Contents/MacOS/";
            for (let [a, l] of Object.entries(s)) {
              let c = r.indexOf(a + "/Contents/MacOS/");
              if (c !== -1) {
                let u = c + a.length;
                return r.substring(0, u) + "/Contents/Resources/app/bin/" + l;
              }
            }
          }
          let o = (await execFileNoThrow("ps", ["-o", "ppid=", "-p", String(t)])).stdout.trim();
          if (!o) {
            break;
          }
          t = parseInt(o);
        }
        return null;
      } catch {
        return null;
      }
    });
    Mjp = {
      vscode: ["code", "codium"],
      cursor: ["cursor"],
      windsurf: ["windsurf", "devin"]
    };
    Gja = {
      code: "VS Code",
      cursor: "Cursor",
      windsurf: "Devin Desktop",
      antigravity: "Antigravity",
      vi: "Vim",
      vim: "Vim",
      nano: "nano",
      notepad: "Notepad",
      "start /wait notepad": "Notepad",
      emacs: "Emacs",
      subl: "Sublime Text",
      atom: "Atom"
    };
    iqa = TEr(async (e, t) => {
      if (process.env.CLAUDE_CODE_IDE_HOST_OVERRIDE) {
        return process.env.CLAUDE_CODE_IDE_HOST_OVERRIDE;
      }
      if (Wt() !== "wsl" || !e) {
        return "127.0.0.1";
      }
      try {
        let n = await yI("ip route show | grep -i default", {
          reject: false
        });
        if (n.exitCode === 0 && n.stdout) {
          let r = n.stdout.match(/default via (\d+\.\d+\.\d+\.\d+)/);
          if (r) {
            let o = r[1];
            if (await JSo(o, t)) {
              return o;
            }
          }
        }
      } catch (n) {}
      return "127.0.0.1";
    }, (e, t) => `${e}:${t}`);
  });
  function $6e(e, t = "SIGKILL") {
    if (!Number.isInteger(e) || e <= 1) {
      return Promise.resolve();
    }
    return Fjp(e, t).catch(() => {});
  }
  async function Fjp(e, t) {
    let n = await Ujp(e);
    try {
      process.kill(-e, t);
    } catch (r) {
      try {
        process.kill(e, t);
      } catch {}
      if (en(r) !== "ESRCH") {
        lqa("group_kill", r);
      }
    }
    for (let r of n) {
      try {
        process.kill(r, t);
      } catch {}
    }
  }
  async function Ujp(e) {
    let t;
    try {
      t = await Promise.race([Bjp(), new Promise(s => {
        let i = setTimeout(a => a(""), 500, s);
        if (typeof i === "object") {
          i.unref();
        }
      })]);
    } catch (s) {
      lqa("enum_spawn", s);
      return new Set();
    }
    let n = new Map();
    for (let s of t.split(`
`)) {
      let i = s.match(/^\s*(\d+)\s+(\d+)\s*$/);
      if (!i) {
        continue;
      }
      let a = Number(i[1]);
      let l = Number(i[2]);
      let c = n.get(l);
      if (c) {
        c.push(a);
      } else {
        n.set(l, [a]);
      }
    }
    let r = new Set();
    let o = [e];
    while (o.length > 0) {
      let s = o.shift();
      for (let i of n.get(s) ?? []) {
        if (i > 1 && i !== e && !r.vZc(i)) {
          r.add(i);
          o.push(i);
        }
      }
    }
    return r;
  }
  function Bjp() {
    return new Promise((e, t) => {
      let n;
      try {
        n = aqa.spawn("ps", ["-A", "-o", "pid=", "-o", "ppid="], {
          cwd: "/",
          stdio: ["ignore", "pipe", "ignore"],
          windowsHide: true
        });
      } catch (o) {
        t(o);
        return;
      }
      let r = "";
      n.stdout?.on("data", o => r += o);
      n.once("error", t);
      n.once("close", () => e(r));
    });
  }
  function lqa(e, t) {
    try {
      let n = en(t);
      let r = gd(t);
      logForDebugging(`killProcessTree ${e} failed: ${n ?? t}`);
      logEvent("tengu_bash_tool_kill_error", {
        stage: e,
        ...(r && {
          error_code: r
        })
      });
    } catch {}
  }
  var aqa;
  var y5t = __lazy(() => {
    Ot();
    je();
    d_();
    dt();
    aqa = require("child_process");
  });
  class iGn {
    0;
    started = false;
    opened;
    constructor(e) {
      this.ws = e;
      this.opened = new Promise((n, r) => {
        if (this.ws.readyState === 1) {
          n();
        } else {
          let o = this.ws;
          let s = () => {
            o.removeEventListener("open", s);
            o.removeEventListener("error", i);
            n();
          };
          let i = a => {
            o.removeEventListener("open", s);
            o.removeEventListener("error", i);
            wn("error", "mcp_websocket_connect_fail");
            r(a);
          };
          o.addEventListener("open", s);
          o.addEventListener("error", i);
        }
      });
      let t = this.ws;
      t.addEventListener("message", this.onBunMessage);
      t.addEventListener("error", this.onBunError);
      t.addEventListener("close", this.onBunClose);
    }
    onclose;
    onerror;
    onmessage;
    onBunMessage = e => {
      try {
        let t = typeof e.data === "string" ? e.data : String(e.data);
        let n = qt(t);
        let r = Xae.parse(n);
        this.onmessage?.(r);
      } catch (t) {
        this.handleError(t);
      }
    };
    onBunError = () => {
      this.handleError(Error("WebSocket error"));
    };
    onBunClose = () => {
      this.handleCloseCleanup();
    };
    handleError(e) {
      wn("error", "mcp_websocket_message_fail");
      this.onerror?.(sr(e));
    }
    handleCloseCleanup() {
      this.onclose?.();
      let e = this.ws;
      e.removeEventListener("message", this.onBunMessage);
      e.removeEventListener("error", this.onBunError);
      e.removeEventListener("close", this.onBunClose);
    }
    async start() {
      if (this.started) {
        throw Error("Start can only be called once per transport.");
      }
      if (await this.opened, this.ws.readyState !== 1) {
        throw wn("error", "mcp_websocket_start_not_opened"), Error("WebSocket is not open. Cannot start transport.");
      }
      this.started = true;
    }
    async close() {
      if (this.ws.readyState === 1 || this.ws.readyState === 0) {
        this.ws.close();
      }
      this.handleCloseCleanup();
    }
    async send(e) {
      if (this.ws.readyState !== 1) {
        throw wn("error", "mcp_websocket_send_not_opened"), Error("WebSocket is not open. Cannot send message.");
      }
      let t = De(e);
      try {
        this.ws.send(t);
      } catch (n) {
        throw this.handleError(n), n;
      }
    }
  }
  var cqa = __lazy(() => {
    Zm();
    dt();
  });
  var oht;
  var _5t = __lazy(() => {
    oht = {
      register() {},
      update() {},
      updateTranscript() {},
      getTranscript() {
        return;
      },
      remove() {},
      evictTerminal() {},
      applyOffsetsAndEvict() {},
      get() {
        return;
      },
      all() {
        return {};
      }
    };
  });
  class uqa {
    capBytes;
    onOverflow;
    chunks = [];
    byteLength = 0;
    overflowed = false;
    overflowThrown = false;
    constructor(e, t) {
      this.capBytes = e;
      this.onOverflow = t;
    }
    append(e) {
      if (this.overflowed) {
        return;
      }
      if (this.byteLength + e.length > this.capBytes) {
        this.chunks = [];
        this.byteLength = 0;
        this.overflowed = true;
        this.onOverflow(new b5t(this.capBytes));
        return;
      }
      this.chunks.push(e);
      this.byteLength += e.length;
    }
    readMessage() {
      if (this.overflowed) {
        if (this.overflowThrown) {
          return null;
        }
        throw this.overflowThrown = true, new b5t(this.capBytes);
      }
      if (this.chunks.length === 0) {
        return null;
      }
      let e = this.chunks.at(-1);
      let t = e.indexOf(10);
      if (t === -1) {
        return null;
      }
      let n = this.chunks.length === 1 ? e : Buffer.concat(this.chunks);
      let r = n.length - e.length + t;
      let o = n.toString("utf8", 0, r).replace(/\r$/, "");
      let s = n.subarray(r + 1);
      this.chunks = s.length > 0 ? [s] : [];
      this.byteLength = s.length;
      return QPr(o);
    }
    clear() {
      this.chunks = [];
      this.byteLength = 0;
    }
  }
  var b5t;
  var S5t;
  var nTo = __lazy(() => {
    n_o();
    tfn();
    b5t = class b5t extends Error {
      constructor(e) {
        super(`wrote >${Math.round(e / 1024 / 1024)}MB to stdout without a JSON-RPC message boundary. The server is likely writing logs or other non-protocol data to stdout instead of stderr. Disconnecting to prevent unbounded memory growth.`);
        this.name = "StdoutOverflowError";
      }
    };
    S5t = class S5t extends t_o {
      overflowError;
      constructor(e) {
        super(e);
        this._readBuffer = new uqa(16777216, t => {
          this.overflowError = t;
          queueMicrotask(() => void this.close());
        });
      }
    };
  });
  function jjp(e) {
    let t = 0;
    let n = 0;
    let r = false;
    return new TransformStream({
      transform(o, s) {
        let i = -1;
        for (let a = 0; a < o.length; a++) {
          let l = o[a];
          if (r && l === 10) {
            r = false;
            continue;
          }
          if (r = false, l === 10 || l === 13) {
            if (n === 0) {
              i = a;
            }
            n = 0;
            r = l === 13;
          } else {
            n++;
          }
        }
        if (t = i >= 0 ? o.length - 1 - i : t + o.length, t > e) {
          s.error(new dqa(e));
          return;
        }
        s.enqueue(o);
      }
    });
  }
  function sht(e) {
    return async (t, n) => {
      let r = await e(t, n);
      if (!r.body || r.body.locked || r.status < 200 || r.status > 599) {
        return r;
      }
      let o = r.body.pipeThrough(jjp(16777216));
      let s = new Response(o, {
        status: r.status,
        statusText: r.statusText,
        headers: r.headers
      });
      Object.defineProperty(s, "url", {
        value: r.url
      });
      Object.defineProperty(s, "redirected", {
        value: r.redirected
      });
      Object.defineProperty(s, "type", {
        value: r.type
      });
      return s;
    };
  }
  var dqa;
  function qjp(e) {
    return e.mode === "url" ? "url" : "form";
  }
  function Wjp(e, t, n) {
    return e.findIndex(r => r.serverName === t && r.params.mode === "url" && "elicitationId" in r.params && r.params.elicitationId === n);
  }
  function mqa(e, t, n, r) {
    try {
      e.setRequestHandler(lye, async (o, s) => {
        if (r) {
          r.pendingElicitations++;
        }
        dn(t, `Received elicitation request: ${De(o)}`);
        let i = qjp(o.params);
        logEvent("tengu_mcp_elicitation_shown", {
          mode: i
        });
        try {
          let a = await T5t(t, o.params, s.signal);
          if (a) {
            dn(t, `Elicitation resolved by hook: ${De(a)}`);
            logEvent("tengu_mcp_elicitation_response", {
              mode: i,
              action: a.action
            });
            Pe("mcp_elicitation_handle");
            return a;
          }
          let l = i === "url" && "elicitationId" in o.params ? o.params.elicitationId : undefined;
          let u = await new Promise(p => {
            let m = () => {
              p({
                action: "cancel"
              });
            };
            if (s.signal.aborted) {
              m();
              return;
            }
            let f = l ? {
              actionLabel: "Skip confirmation"
            } : undefined;
            n(h => ({
              ...h,
              elicitation: {
                queue: [...h.elicitation.queue, {
                  serverName: t,
                  requestId: s.requestId,
                  params: o.params,
                  signal: s.signal,
                  waitingState: f,
                  respond: g => {
                    s.signal.removeEventListener("abort", m);
                    logEvent("tengu_mcp_elicitation_response", {
                      mode: i,
                      action: g.action
                    });
                    p(g);
                  }
                }]
              }
            }));
            s.signal.addEventListener("abort", m, {
              once: true
            });
          });
          dn(t, `Elicitation response: ${De(u)}`);
          let d = await E5t(t, u, s.signal, i, l);
          Pe("mcp_elicitation_handle");
          return d;
        } catch (a) {
          uu(t, `Elicitation error: ${a}`);
          Ae("mcp_elicitation_handle", "handler_error");
          return {
            action: "cancel"
          };
        } finally {
          if (r) {
            r.pendingElicitations--;
            r.lastElicitationClosedAt = Date.now();
          }
        }
      });
      e.setNotificationHandler(uOt, o => {
        let {
          elicitationId: s
        } = o.params;
        dn(t, `Received elicitation completion notification: ${s}`);
        executeNotificationHooks({
          message: `MCP server "${t}" confirmed elicitation ${s} complete`,
          notificationType: "elicitation_complete"
        });
        let i = false;
        if (n(a => {
          let l = Wjp(a.elicitation.queue, t, s);
          if (l === -1) {
            return a;
          }
          i = true;
          let c = [...a.elicitation.queue];
          c[l] = {
            ...c[l],
            completed: true
          };
          return {
            ...a,
            elicitation: {
              queue: c
            }
          };
        }), !i) {
          dn(t, `Ignoring completion notification for unknown elicitation: ${s}`);
        }
      });
    } catch {
      return;
    }
  }
  async function T5t(e, t, n) {
    try {
      let r = t.mode === "url" ? "url" : "form";
      let o = "url" in t ? t.url : undefined;
      let s = "elicitationId" in t ? t.elicitationId : undefined;
      let {
        elicitationResponse: i,
        blockingError: a
      } = await executeElicitationHooks({
        serverName: e,
        message: t.message,
        requestedSchema: "requestedSchema" in t ? t.requestedSchema : undefined,
        signal: n,
        mode: r,
        url: o,
        elicitationId: s
      });
      if (a) {
        return {
          action: "decline"
        };
      }
      if (i) {
        return {
          action: i.action,
          content: i.content
        };
      }
      return;
    } catch (r) {
      uu(e, `Elicitation hook error: ${r}`);
      return;
    }
  }
  async function E5t(e, t, n, r, o) {
    try {
      let {
        elicitationResultResponse: s,
        blockingError: i
      } = await executeElicitationResultHooks({
        serverName: e,
        action: t.action,
        content: t.content,
        signal: n,
        mode: r,
        elicitationId: o
      });
      if (i) {
        executeNotificationHooks({
          message: `Elicitation response for server "${e}": decline`,
          notificationType: "elicitation_response"
        });
        return {
          action: "decline"
        };
      }
      let a = s ? {
        action: s.action,
        content: s.content ?? t.content
      } : t;
      executeNotificationHooks({
        message: `Elicitation response for server "${e}": ${a.action}`,
        notificationType: "elicitation_response"
      });
      return a;
    } catch (s) {
      uu(e, `ElicitationResult hook error: ${s}`);
      executeNotificationHooks({
        message: `Elicitation response for server "${e}": ${t.action}`,
        notificationType: "elicitation_response"
      });
      return t;
    }
  }
  var aGn = __lazy(() => {
    Sp();
    Rn();
    ln();
    Ot();
  });
  async function lGn(e) {
    if (!getProxyUrl()) {
      let t = agentProxyEnv();
      if (t.HTTPS_PROXY && URL.parse(e)?.protocol === "https:") {
        let n;
        if (t.SSL_CERT_FILE) {
          try {
            n = await fqa.readFile(t.SSL_CERT_FILE, "utf8");
          } catch (r) {
            logForDebugging(`MCP agent-proxy fallback: failed to read CA bundle: ${r instanceof Error ? r.message : String(r)}`, {
              level: "warn"
            });
          }
        }
        return getProxyFetchOptions({
          url: e,
          fallbackProxy: {
            url: t.HTTPS_PROXY,
            noProxy: t.NO_PROXY,
            ca: n
          }
        });
      }
    }
    return getProxyFetchOptions({
      url: e
    });
  }
  var fqa;
  var hqa = __lazy(() => {
    je();
    Fh();
    s1();
    fqa = require("fs/promises");
  });
  function _pe(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function oTo(e, t) {
    let n = e.$ref;
    if (typeof n !== "string") {
      return e;
    }
    let r = /^#\/(\$defs|definitions)\/([^/]+)$/.exec(n);
    if (r === null) {
      return e;
    }
    let o = t[r[1]];
    if (!_pe(o)) {
      return e;
    }
    let s = o[r[2]];
    return _pe(s) ? s : e;
  }
  function Kjp(e) {
    if (!_pe(e)) {
      return null;
    }
    let t = e.required;
    if (Array.isArray(t) && t.length > 0 && t.every(r => typeof r === "string")) {
      return t.join(", ");
    }
    let n = e.properties;
    if (_pe(n)) {
      let r = Object.keys(n);
      if (r.length > 0) {
        return r.join(", ");
      }
    }
    return null;
  }
  function gqa(e) {
    if (!_pe(e)) {
      return {
        outcome: "unchanged"
      };
    }
    let t = Gjp.filter(n => n in e);
    if (t.length === 0) {
      return {
        outcome: "unchanged"
      };
    }
    try {
      let n = Object.create(null);
      let r = u => {
        if (!_pe(u)) {
          return;
        }
        for (let [d, p] of Object.entries(u)) {
          if (Vjp.test(d) && !(d in n) && _pe(p)) {
            n[d] = p;
          }
        }
      };
      r(e.properties);
      for (let u of t) {
        let d = e[u];
        if (!Array.isArray(d)) {
          return {
            outcome: "drop",
            reason: `input schema has top-level ${u} that is not an array`
          };
        }
        for (let p of d) {
          if (_pe(p)) {
            r(oTo(p, e).properties);
          }
        }
      }
      let o = [];
      let s = u => {
        if (!Array.isArray(u)) {
          return;
        }
        for (let d of u) {
          if (typeof d === "string" && d in n && !o.includes(d)) {
            o.push(d);
          }
        }
      };
      s(e.required);
      let i = e.allOf;
      if (Array.isArray(i)) {
        for (let u of i) {
          if (_pe(u)) {
            s(oTo(u, e).required);
          }
        }
      }
      let a = t.includes("anyOf") || t.includes("oneOf");
      let l = {
        type: "object",
        properties: n,
        required: o
      };
      for (let u of zjp) {
        if (u in e) {
          l[u] = e[u];
        }
      }
      let c = Yjp(t, e, a);
      return {
        outcome: "normalized",
        schema: l,
        note: c,
        combinators: t
      };
    } catch {
      return {
        outcome: "drop",
        reason: `input schema uses top-level ${t.join("/")} and could not be normalized`
      };
    }
  }
  function Yjp(e, t, n) {
    if (!n) {
      return "Input constraint: all listed parameters apply together (flattened from a JSON Schema allOf).";
    }
    let r = e.includes("oneOf") ? "oneOf" : "anyOf";
    let o = t[r];
    let s = Array.isArray(o) ? Ro(o.map(l => Kjp(_pe(l) ? oTo(l, t) : l)).filter(l => l !== null)) : [];
    let i = r === "oneOf" ? "Provide parameters for exactly one of" : "Provide parameters for at least one of";
    if (s.length === 0) {
      return `Input constraint: ${i} the documented parameter groups (flattened from a JSON Schema ${r}).`;
    }
    let a = s.map(l => `(${l})`).join(" or ");
    return `Input constraint: ${i}: ${a}.`;
  }
  var Gjp;
  var Vjp;
  var zjp;
  var yqa = __lazy(() => {
    Gjp = ["anyOf", "oneOf", "allOf"];
    Vjp = /^[a-zA-Z0-9_.-]{1,64}$/;
    zjp = ["$defs", "definitions", "$schema", "additionalProperties", "description", "title"];
  });
  function Xjp(e) {
    let t = e.inputSchema?.properties ?? {};
    let n = Object.keys(t);
    let r = [];
    if (e.description) {
      r.push(e.description.slice(0, 2048));
    }
    for (let a of n) {
      let l = t[a];
      let c = l && typeof l === "object" && "description" in l ? l.description : undefined;
      if (typeof c === "string") {
        r.push(c);
      }
    }
    if (r.length === 0) {
      return;
    }
    let o = r.join(`
`).toLowerCase();
    let s = [...sTo];
    for (let a of n) {
      let l = a.toLowerCase();
      if (a.length >= 4 && !Jjp.vZc(l)) {
        s.push(`<${l}>`, `</${l}>`);
      }
    }
    let i = s.find(a => o.includes(a));
    if (i === undefined) {
      return;
    }
    return sTo.some(a => a === i) ? "invoke" : "param";
  }
  function Sqa(e, t, n, r, o) {
    let s = 0;
    let i = 0;
    let a;
    for (let d of e) {
      let p = Xjp(d);
      if (p === undefined) {
        continue;
      }
      if (p === "invoke") {
        s++;
      } else {
        i++;
      }
      a ??= d.name;
    }
    let l = o?.slice(0, 2048).toLowerCase();
    let c = l !== undefined && sTo.some(d => l.includes(d));
    let u = s + i;
    if (u === 0 && !c) {
      return;
    }
    logEvent("tengu_mcp_description_contains_toolcall_xml", {
      matchedToolCount: u,
      invokeCount: s,
      paramCount: i,
      instructionsMatch: c,
      sampleToolName: a ? n ? a : undefined : undefined,
      mcpServerName: n ? n : undefined,
      ...(r && {
        mcpServerBaseUrl: r
      })
    });
  }
  function bqa(e, t) {
    return e.length >= t.length && e.slice(-t.length).toLowerCase() === t.toLowerCase();
  }
  function Tqa(e, t, n, r, o, s) {
    let i = e;
    for (let [a, l] of Object.entries(e)) {
      if (typeof l !== "string") {
        continue;
      }
      let c = l.length - 1;
      while (c >= 0 && (l.charCodeAt(c) === 32 || l.charCodeAt(c) === 9 || l.charCodeAt(c) === 10 || l.charCodeAt(c) === 13)) {
        c--;
      }
      if (c >= 0) {
        let h = l.charCodeAt(c);
        if (h >= 33 && h <= 126 && h !== 62) {
          continue;
        }
      }
      let u = l.trimEnd();
      if (!bqa(u, "</invoke>")) {
        continue;
      }
      u = u.slice(0, -("</invoke>").length).trimEnd();
      let d = `</${a}>`;
      let p = bqa(u, d);
      if (p) {
        u = u.slice(0, -d.length).trimEnd();
      }
      let m = p && new RegExp(`<${FA(a)}[\\s>/]`, "i").test(l);
      let f = !p ? "param_close" : m ? "open_guard" : undefined;
      if (logEvent("tengu_mcp_arg_trailing_invoke_suffix", {
        wouldStrip: f === undefined,
        missKind: f,
        flagOn: o,
        paramNameLen: a.length,
        strippedToLen: u.length,
        mcpToolName: r ? r : undefined,
        mcpServerName: r ? n : undefined,
        ...(s && {
          mcpServerBaseUrl: s
        })
      }), f !== undefined || !o) {
        continue;
      }
      if (i === e) {
        i = {
          ...e
        };
      }
      i[a] = u;
      dn(n, `stripped trailing </${a}></invoke> from ${t}.${a} (model emission artifact)`);
    }
    return i;
  }
  var sTo;
  var Jjp;
  var Eqa = __lazy(() => {
    Rn();
    Zn();
    Ot();
    sTo = ["<invoke>", "<invoke ", "<invoke\t", `<invoke
`, "</invoke>"];
    Jjp = new Set(["address", "area", "article", "audio", "base", "body", "button", "cite", "code", "data", "details", "dialog", "figure", "footer", "form", "head", "header", "html", "image", "input", "label", "link", "main", "mark", "menu", "meta", "object", "option", "output", "path", "picture", "script", "section", "select", "slot", "source", "span", "style", "summary", "table", "template", "text", "time", "title", "video"]);
  });
  function vqa(e) {
    return Zjp.vZc(e);
  }
  function eqp(e) {
    let t = e.channel_id ?? e.channel;
    if (typeof t !== "string" || !t) {
      return null;
    }
    let n = t.replace(/^#/, "");
    let r = `#${n}`;
    let o = Qjp.test(n) ? `https://slack.com/app_redirect?channel=${n}` : null;
    return {
      label: r,
      url: o
    };
  }
  function wqa() {
    return {
      userFacingName() {
        return "Slacked";
      },
      renderToolUseMessage(e, {
        verbose: t
      }) {
        if (!t) {
          return "";
        }
        let n = yle(e);
        if (n !== null) {
          return n;
        }
        return Object.entries(e).map(([r, o]) => `${r}: ${De(o)}`).join(", ");
      },
      renderToolUseTag(e) {
        let t = eqp(e);
        if (t === null) {
          return null;
        }
        return iTo.jsx(gXd, {
          flexWrap: "nowrap",
          marginLeft: 1,
          children: iTo.jsx(Ansi, {
            children: t.url && Hk() ? TM(t.url, t.label) : t.label
          })
        });
      }
    };
  }
  var iTo;
  var Qjp;
  var Zjp;
  var Cqa = __lazy(() => {
    uG();
    et();
    EMe();
    Gd();
    iTo = __toESM(ie(), 1);
    Qjp = /^[CDG][A-Z0-9]{6,}$/;
    Zjp = new Set(["slack_send_message", "slack_post_message"]);
  });
  function xqa(e) {
    let t = aTo;
    aTo = e;
    return t;
  }
  function kqa() {
    return aTo;
  }
  function Aqa(e) {
    let t = lTo;
    lTo = e;
    return t;
  }
  function bEe() {
    return lTo?.() ?? false;
  }
  function Iqa(e) {
    if (Rqa) {
      return;
    }
    Rqa = true;
    cTo = e;
  }
  function uTo() {
    let e = cTo;
    cTo = undefined;
    return e;
  }
  function Pqa() {
    let e = uTo();
    if (e) {
      process.stderr.write(`${e}
`);
    }
  }
  var aTo = null;
  var lTo = null;
  var cTo;
  var Rqa = false;
  function tqp(e) {
    return e.scope === "project" || e.scope === "local";
  }
  async function nqp(e, t) {
    if (!t.headersHelper) {
      return null;
    }
    if ("scope" in t && tqp(t) && !getIsNonInteractiveSession()) {
      if (!checkHasTrustDialogAccepted()) {
        let o = Error(`Security: headersHelper for MCP server '${e}' executed before workspace trust is confirmed. If you see this message, post in ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.FEEDBACK_CHANNEL}.`);
        logAntError("MCP headersHelper invoked before trust check", o);
        logEvent("tengu_mcp_headersHelper_missing_trust", {});
        Ae("mcp_headers_helper", "missing_trust");
        return null;
      }
    }
    let n = "pluginPath" in t && typeof t.pluginPath === "string" && Oqa.isAbsolute(t.pluginPath) ? t.pluginPath : undefined;
    try {
      dn(e, "Executing headersHelper to get dynamic headers");
      let r = await execFileNoThrowWithCwd(t.headersHelper, [], {
        shell: true,
        timeout: 1e4,
        cwd: n,
        env: {
          ...process.env,
          CLAUDE_CODE_MCP_SERVER_NAME: e,
          CLAUDE_CODE_MCP_SERVER_URL: t.url,
          ...(n && {
            CLAUDE_PLUGIN_ROOT: n
          })
        }
      });
      if (r.code !== 0 || !r.stdout) {
        throw Ae("mcp_headers_helper", "exec_failed"), Error(`headersHelper for MCP server '${e}' did not return a valid value`);
      }
      let o = r.stdout.trim();
      let s;
      try {
        s = qt(o);
      } catch (i) {
        throw Ae("mcp_headers_helper", "parse_failed"), i;
      }
      if (typeof s !== "object" || s === null || Array.isArray(s)) {
        throw Ae("mcp_headers_helper", "non_object"), Error(`headersHelper for MCP server '${e}' must return a JSON object with string key-value pairs`);
      }
      for (let [i, a] of Object.entries(s)) {
        if (typeof a !== "string") {
          throw Ae("mcp_headers_helper", "non_string_value"), Error(`headersHelper for MCP server '${e}' returned non-string value for key "${i}": ${typeof a}`);
        }
      }
      dn(e, `Successfully retrieved ${Object.keys(s).length} headers from headersHelper`);
      Pe("mcp_headers_helper");
      return s;
    } catch (r) {
      uu(e, `Error getting headers from headersHelper: ${he(r)}`);
      logForDebugging(`Error getting MCP headers from headersHelper for server '${e}': ${he(r)}`, {
        level: "error"
      });
      return null;
    }
  }
  async function cGn(e, t) {
    let n = {};
    let r = [];
    for (let [s, i] of Object.entries(t.headers ?? {})) {
      let {
        expanded: a,
        missingVars: l
      } = Eoe(i);
      n[s] = a;
      r.push(...l);
    }
    if (r.length > 0) {
      dn(e, `Header values reference unset environment variables: ${Ro(r).join(", ")}`);
    }
    let o = (await nqp(e, t)) || {};
    return {
      ...n,
      ...o
    };
  }
  var Oqa;
  var Dqa = __lazy(() => {
    at();
    je();
    dt();
    ji();
    Rn();
    ln();
    Ot();
    Oqa = require("path");
  });
  function C5t(e) {
    if (e instanceof oO) {
      return true;
    }
    if (e instanceof Error && !(e instanceof yi) && "code" in e) {
      if (e.code === 403) {
        return !e.message.includes("Server returned 403 after trying upscoping");
      }
      if (e.code === 401) {
        return !e.message.includes("Server returned 401 after successful authentication");
      }
    }
    return false;
  }
  var dTo = __lazy(() => {
    SIe();
  });
  class pTo {
    serverName;
    sendMcpMessage;
    isClosed = false;
    onclose;
    onerror;
    onmessage;
    constructor(e, t) {
      this.serverName = e;
      this.sendMcpMessage = t;
    }
    async start() {}
    async send(e) {
      if (this.isClosed) {
        throw Error("Transport is closed");
      }
      let t = await this.sendMcpMessage(this.serverName, e);
      if (this.onmessage) {
        this.onmessage(t);
      }
    }
    async close() {
      if (this.isClosed) {
        return;
      }
      this.isClosed = true;
      this.onclose?.();
    }
  }
  class mTo {
    sendMcpMessage;
    isClosed = false;
    constructor(e) {
      this.sendMcpMessage = e;
    }
    onclose;
    onerror;
    onmessage;
    async start() {}
    async send(e) {
      if (this.isClosed) {
        throw Error("Transport is closed");
      }
      this.sendMcpMessage(e);
    }
    async close() {
      if (this.isClosed) {
        return;
      }
      this.isClosed = true;
      this.onclose?.();
    }
  }
  function Mqa(e) {
    if (!e.endsWith("/SKILL.md")) {
      return;
    }
    let t = e.slice(0, -9);
    return /^[a-z][a-z0-9+.-]*:\/\/./i.test(t) ? t : undefined;
  }
  function uGn(e, t, n) {
    let r = t;
    let o = t + n;
    while (r < o && e[r] !== 0) {
      r++;
    }
    return Buffer.from(e.buffer, e.byteOffset + t, r - t).toString("utf8");
  }
  function hTo(e, t, n) {
    if ((e[t] & 128) !== 0) {
      throw new fTo("base-256 tar numeric fields are not supported");
    }
    let r = uGn(e, t, n).trim();
    if (r.length === 0) {
      return 0;
    }
    if (!/^[0-7]+$/.test(r)) {
      throw new fTo(`tar header octal field contains non-octal bytes: "${r}"`);
    }
    return parseInt(r, 8);
  }
  function iqp(e, t) {
    let n = hTo(e, t + 148, 8);
    let r = 0;
    let o = 0;
    for (let s = 0; s < 512; s++) {
      let i = s >= 148 && s < 156 ? 32 : e[t + s];
      r += i;
      o += i < 128 ? i : i - 256;
    }
    return n === r || n === o;
  }
  function gTo(e) {
    return e.split(/[/\\]/).filter(t => t !== "" && t !== ".").join("/");
  }
  function yTo(e) {
    return e.normalize("NFC").toLowerCase();
  }
  function aqp(e) {
    let t = {};
    let n = 0;
    while (n < e.length) {
      let r = n;
      while (r < e.length && e[r] !== 32) {
        r++;
      }
      let o = parseInt(Buffer.from(e.buffer, e.byteOffset + n, r - n).toString("ascii"), 10);
      if (!Number.isFinite(o) || o <= 0 || n + o > e.length) {
        break;
      }
      let s = Buffer.from(e.buffer, e.byteOffset + r + 1, o - (r - n) - 2).toString("utf8");
      let i = s.indexOf("=");
      if (i > 0) {
        let a = s.slice(0, i);
        let l = s.slice(i + 1);
        if (a === "path") {
          t.path = l;
        } else if (a === "size") {
          let c = Number(l);
          if (Number.isFinite(c) && c >= 0) {
            t.size = c;
          }
        }
      }
      n += o;
    }
    return t;
  }
  function lqp(e, t) {
    let n = {};
    let r = new Map();
    let o;
    let s;
    let i = 0;
    let a = 0;
    let l = 0;
    while (l + 512 <= e.length) {
      let c = true;
      for (let k = 0; k < 512; k++) {
        if (e[l + k] !== 0) {
          c = false;
          break;
        }
      }
      if (c) {
        break;
      }
      if (!iqp(e, l)) {
        throw new Nqa(l);
      }
      let u = hTo(e, l + 124, 12);
      let d = hTo(e, l + 100, 8);
      let p = String.fromCharCode(e[l + 156]) || "0";
      let m = uGn(e, l, 100);
      let h = uGn(e, l + 257, 6) === "ustar" ? uGn(e, l + 345, 155) : "";
      let g = oqp.vZc(p);
      let y = !g && s !== undefined ? s : u;
      let _ = l + 512;
      let b = Math.ceil(y / 512) * 512;
      if (_ + y > e.length) {
        throw Error("Truncated tar: entry data extends past end of archive");
      }
      let S = e.subarray(_, _ + y);
      if (l = _ + b, g) {
        if (p === "L") {
          let k = S.length;
          while (k > 0 && S[k - 1] === 0) {
            k--;
          }
          o = Buffer.from(S.buffer, S.byteOffset, k).toString("utf8");
        } else if (p === "x" || p === "X") {
          let k = aqp(S);
          o = k.path ?? o;
          s = k.size ?? s;
        }
        continue;
      }
      let E = o ?? (h ? `${h}/${m}` : m);
      if (o = undefined, s = undefined, rqp.vZc(p)) {
        throw new dGn(E);
      }
      if (sqp.vZc(p)) {
        throw new pGn(E, p);
      }
      if (!lSo(E)) {
        throw new R5t(E, "path traversal or absolute path");
      }
      if (p === "5" || E.endsWith("/")) {
        continue;
      }
      if (p !== "0" && p !== "\x00" && p !== "7") {
        continue;
      }
      let C = gTo(E);
      let x = yTo(C);
      let A = r.get(x);
      if (A !== undefined && A !== E) {
        throw new x5t(A, E);
      }
      if (r.set(x, E), E = C, a++, a > t.maxFiles) {
        throw new mGn(t.maxFiles);
      }
      if (i += y, i > t.maxBytes) {
        throw new k5t(t.maxBytes);
      }
      n[E] = {
        data: S,
        mode: d & 4095
      };
    }
    return n;
  }
  async function cqp(e, t) {
    let {
      Gunzip: n
    } = await Promise.resolve().then(() => (b6e(), O9t));
    let r = [];
    let o = 0;
    let s = new n((c, u) => {
      if (o += c.length, o > t) {
        throw new k5t(t);
      }
      r.push(c);
    });
    let i = 65536;
    for (let c = 0; c < e.length; c += i) {
      let u = Math.min(c + i, e.length);
      s.push(e.subarray(c, u), u === e.length);
    }
    if (r.length === 1) {
      return r[0];
    }
    let a = new Uint8Array(o);
    let l = 0;
    for (let c of r) {
      a.set(c, l);
      l += c.length;
    }
    return a;
  }
  async function Lqa(e, t) {
    let r = e.length >= 2 && e[0] === 31 && e[1] === 139 ? await cqp(e, t.maxBytes) : e;
    return lqp(r, t);
  }
  var rqp;
  var oqp;
  var sqp;
  var R5t;
  var dGn;
  var pGn;
  var Nqa;
  var fTo;
  var x5t;
  var mGn;
  var k5t;
  var Fqa = __lazy(() => {
    dt();
    w6e();
    rqp = new Set(["1", "2"]);
    oqp = new Set(["x", "X", "g", "L", "K"]);
    sqp = new Set(["S", "D", "V", "M"]);
    R5t = class R5t extends Po {
      entryName;
      constructor(e, t) {
        super(`Unsafe tar entry "${e}": ${t}`, "tar archive contains an unsafe entry");
        this.entryName = e;
      }
    };
    dGn = class dGn extends Po {
      entryName;
      constructor(e) {
        super(`Tar entry "${e}" is a symlink or hardlink \u2014 links are not permitted in skill archives`, "tar archive contains a link entry");
        this.entryName = e;
      }
    };
    pGn = class pGn extends Po {
      entryName;
      constructor(e, t) {
        super(`Tar entry "${e}" has unsupported typeflag '${t}' (sparse/GNU-special entries are not permitted in skill archives)`, "tar archive contains an unsupported entry type");
        this.entryName = e;
      }
    };
    Nqa = class Nqa extends Po {
      constructor(e) {
        super(`Tar header at offset ${e} has an invalid checksum`, "tar header has an invalid checksum");
      }
    };
    fTo = class fTo extends Po {
      constructor(e) {
        super(e, "tar header is malformed");
      }
    };
    x5t = class x5t extends Po {
      a;
      b;
      constructor(e, t) {
        super(`Archive entries "${e}" and "${t}" alias the same path on disk (case-folding or dot-segment normalization)`, "archive contains entries that alias the same disk path");
        this.a = e;
        this.b = t;
      }
    };
    mGn = class mGn extends Po {
      constructor(e) {
        super(`Tar archive has more than ${e} entries`, "tar archive exceeds the entry-count limit");
      }
    };
    k5t = class k5t extends Po {
      constructor(e) {
        super(`Tar archive uncompressed content exceeds ${Math.round(e / 1e6)}MB`, "tar archive exceeds the uncompressed-size limit");
      }
    };
  });
  function $qa() {
    return bpe.join(er(), "mcp-skill-archives");
  }
  function A5t(e) {
    return Uqa.createHash("sha256").update(e).digest("hex");
  }
  function Hqa(e, t, n) {
    let r = A5t(`${e}\x00${n}`).slice(0, 8);
    let o = t.replace(/[^A-Za-z0-9._-]/g, "-");
    return `${Bl(e)}--${o}--${r}`;
  }
  function H6e(e) {
    if (!e) {
      return;
    }
    let t = /^(?:sha256:)?([0-9a-fA-F]{64})$/.exec(e.trim());
    return t ? t[1].toLowerCase() : undefined;
  }
  async function bTo(e) {
    try {
      let t = await SEe.readFile(bpe.join(e, "meta.json"), "utf8");
      let n = dqp().safeParse(qt(t));
      return n.success ? n.data : null;
    } catch {
      return null;
    }
  }
  async function pqp(e, t) {
    await SEe.mkdir(e, {
      recursive: true
    });
    await SEe.writeFile(bpe.join(e, "meta.json"), De(t));
  }
  async function I5t(e, t) {
    let n = Hqa(e, t.name, t.url);
    let r = bpe.join($qa(), n);
    let o = {
      hit: false,
      slugDir: r
    };
    let s;
    let i = H6e(t.digest ?? undefined);
    if (i) {
      s = i;
    } else {
      let l = await bTo(r);
      if (!l || Date.now() - l.fetchedAt >= 86400000) {
        return o;
      }
      s = l.cacheKey;
    }
    let a = bpe.join(r, s);
    try {
      let l = await SEe.readFile(bpe.join(a, "SKILL.md"), "utf8");
      return {
        hit: true,
        dir: a,
        cacheKey: s,
        skillMd: l
      };
    } catch {
      return o;
    }
  }
  async function fGn(e, t, n) {
    let r = Hqa(e, t.name, t.url);
    let o = bpe.join($qa(), r);
    let s = bpe.join(o, n);
    let i = await SEe.stat(bpe.join(s, "SKILL.md")).then(a => a.isFile()).catch(() => false);
    if (i) {
      dn(e, `Skill '${t.name}' content unchanged \u2014 reusing extraction at ${s}`);
    }
    return {
      slugDir: o,
      keyDir: s,
      alreadyExtracted: i
    };
  }
  async function hGn(e, t, n) {
    await pqp(e, {
      url: t.url,
      cacheKey: n,
      declaredDigest: H6e(t.digest ?? undefined),
      fetchedAt: Date.now()
    });
  }
  var Uqa;
  var SEe;
  var bpe;
  var dqp;
  var gGn = __lazy(() => {
    gn();
    Rn();
    Uqa = require("crypto");
    SEe = require("fs/promises");
    bpe = require("path");
    dqp = we(() => v.object({
      url: v.string(),
      cacheKey: v.string(),
      declaredDigest: v.string().optional(),
      fetchedAt: v.number()
    }));
  });
  function TTo(e, t) {
    let n = e?.toLowerCase();
    if (n === "application/gzip" || n === "application/x-gzip") {
      return "tar.gz";
    }
    if (n === "application/zip") {
      return "zip";
    }
    if (t.endsWith(".tar.gz") || t.endsWith(".tgz")) {
      return "tar.gz";
    }
    if (t.endsWith(".zip")) {
      return "zip";
    }
    return null;
  }
  async function Gqa(e, t) {
    let n = await I5t(e.name, t);
    if (n.hit && n.skillMd.length <= 1e6) {
      dn(e.name, `Archive skill '${t.name}' cache hit at ${n.dir}`);
      return {
        baseDir: n.dir,
        skillMd: n.skillMd
      };
    }
    let r;
    let o;
    try {
      let h = (await e.client.request({
        method: "resources/read",
        params: {
          uri: t.url
        }
      }, Qae, {
        timeout: ez()
      })).contents?.find(g => "blob" in g && typeof g.blob === "string");
      if (!h || !("blob" in h)) {
        return {
          errorCode: "skill_mcp_archive_not_blob",
          message: `Archive resource ${t.url} did not return blob content`
        };
      }
      o = "mimeType" in h && typeof h.mimeType === "string" ? h.mimeType : undefined;
      r = Buffer.from(String(h.blob), "base64");
    } catch (f) {
      return {
        errorCode: "skill_mcp_fetch_failed",
        message: `Failed to fetch archive ${t.url}: ${he(f)}`
      };
    }
    if (r.length > 52428800) {
      return {
        errorCode: "skill_mcp_archive_too_large",
        message: `Archive ${t.url} is ${Math.round(r.length / 1e6)}MB compressed (max ${52428800 / 1e6}MB)`
      };
    }
    let s = A5t(r);
    let i = H6e(t.digest ?? undefined);
    if (i && i !== s) {
      return {
        errorCode: "skill_mcp_archive_digest_mismatch",
        message: `Archive ${t.url} digest mismatch: index declared ${i}, got ${s}`
      };
    }
    let a = i ?? s;
    let l = TTo(t.mimeType ?? o, t.url);
    if (l === null) {
      return {
        errorCode: "skill_mcp_archive_unsupported_format",
        message: `Archive ${t.url} has unsupported format (mimeType=${o ?? "absent"})`
      };
    }
    let c;
    try {
      c = await mqp(r, l);
    } catch (f) {
      if (f instanceof k5t || f instanceof mGn || f instanceof Error && /too many files|is too large|compression ratio/i.test(f.message)) {
        return {
          errorCode: "skill_mcp_archive_too_large",
          message: f.message
        };
      }
      if (f instanceof dGn) {
        return {
          errorCode: "skill_mcp_archive_link_entry",
          message: f.message
        };
      }
      if (f instanceof pGn) {
        return {
          errorCode: "skill_mcp_archive_unsupported_entry",
          message: f.message
        };
      }
      if (f instanceof x5t) {
        return {
          errorCode: "skill_mcp_archive_case_collision",
          message: f.message
        };
      }
      if (f instanceof R5t || f instanceof Error && /unsafe file path/i.test(f.message)) {
        return {
          errorCode: "skill_mcp_archive_unsafe_entry",
          message: he(f)
        };
      }
      return {
        errorCode: "skill_mcp_archive_unpack_failed",
        message: `Failed to unpack ${t.url}: ${he(f)}`
      };
    }
    if (!("SKILL.md" in c)) {
      return {
        errorCode: "skill_mcp_archive_missing_skill_md",
        message: Object.keys(c).some(h => h.endsWith("/SKILL.md")) ? `Archive ${t.url} has no root SKILL.md \u2014 found one inside a wrapper directory. Archive contents must be rooted at SKILL.md, not my-skill/SKILL.md.` : `Archive ${t.url} has no SKILL.md at its root`
      };
    }
    let u = c["SKILL.md"].data;
    if (u.length > 1e6) {
      return {
        errorCode: "skill_mcp_archive_unpack_failed",
        message: `SKILL.md in ${t.url} exceeds ${1e6 / 1e6}MB`
      };
    }
    let {
      slugDir: d,
      keyDir: p,
      alreadyExtracted: m
    } = await fGn(e.name, t, a);
    if (!m) {
      try {
        await fqp(d, p, c);
      } catch (f) {
        uu(e.name, `Failed to materialize archive ${t.url}: ${he(f)}`);
        return {
          errorCode: "skill_mcp_archive_unpack_failed",
          message: he(f)
        };
      }
    }
    await hGn(d, t, a).catch(f => {
      dn(e.name, `Non-fatal: failed to write cache meta for ${t.name}: ${he(f)}`);
    });
    return {
      baseDir: p,
      skillMd: Buffer.from(u).toString("utf8")
    };
  }
  async function mqp(e, t) {
    if (t === "tar.gz") {
      return Lqa(e, {
        maxBytes: 209715200,
        maxFiles: 5000
      });
    }
    let n = await dpe(e, {
      MAX_FILE_COUNT: 5000,
      MAX_TOTAL_SIZE: 209715200,
      MAX_FILE_SIZE: 209715200,
      MAX_COMPRESSION_RATIO: 100
    });
    let r = rNe(e);
    let o = {};
    let s = new Map();
    for (let i of Object.keys(n)) {
      if (i.endsWith("/")) {
        continue;
      }
      let a = gTo(i);
      let l = yTo(a);
      let c = s.get(l);
      if (c !== undefined && c !== i) {
        throw new x5t(c, i);
      }
      s.set(l, i);
      o[a] = {
        data: n[i],
        mode: r[i] ?? 0
      };
    }
    return o;
  }
  async function fqp(e, t, n) {
    let r = Boe.join(e, `.tmp-${process.pid}-${Wqa.randomBytes(4).toString("hex")}`);
    let o = Boe.resolve(r) + Boe.sep;
    await f9.mkdir(r, {
      recursive: true
    });
    try {
      for (let [s, {
        data: i,
        mode: a
      }] of Object.entries(n)) {
        let l = Boe.resolve(r, s);
        if (!(l + Boe.sep).startsWith(o)) {
          throw new R5t(s, "resolves outside the extraction root");
        }
        if (await f9.mkdir(Boe.dirname(l), {
          recursive: true
        }), await f9.writeFile(l, i), a & 73) {
          await f9.chmod(l, a & 493 | 384).catch(() => {});
        }
      }
      try {
        await f9.rename(r, t);
      } catch (s) {
        let i = en(s);
        if ((i === "EEXIST" || i === "ENOTEMPTY" || i === "EPERM" || i === "EBUSY") && (await f9.stat(Boe.join(t, "SKILL.md")).then(l => l.isFile()).catch(() => false))) {
          await f9.rm(r, {
            recursive: true,
            force: true
          });
          logForDebugging(`mcp-skill-archive: ${t} already exists (concurrent extraction) \u2014 using existing`);
          return;
        }
        throw s;
      }
    } catch (s) {
      throw await f9.rm(r, {
        recursive: true,
        force: true
      }).catch(() => {}), s;
    }
  }
  var Wqa;
  var f9;
  var Boe;
  var Vqa = __lazy(() => {
    Zft();
    je();
    Fqa();
    w6e();
    dt();
    Rn();
    gGn();
    Wqa = require("crypto");
    f9 = require("fs/promises");
    Boe = require("path");
  });
  var vTo = {};
  __export(vTo, {
    fetchMcpSkillsForClient: () => fetchMcpSkillsForClient
  });
  async function _qp(e) {
    let t = {
      direct: [],
      archives: []
    };
    let n;
    try {
      let u = (await e.client.request({
        method: "resources/read",
        params: {
          uri: "skill://index.json"
        }
      }, Qae, {
        timeout: ez()
      })).contents?.find(d => "text" in d && typeof d.text === "string");
      if (!u || !("text" in u)) {
        return t;
      }
      if (n = String(u.text), n.length > 1e6) {
        dn(e.name, `${"skill://index.json"} exceeds ${1e6 / 1e6}MB, skipping skill discovery`);
        Et("skill_mcp_load", "skill_mcp_index_too_large");
        return t;
      }
    } catch {
      return t;
    }
    let r;
    try {
      r = qt(n);
    } catch (c) {
      dn(e.name, `${"skill://index.json"} is not valid JSON (${he(c)}) \u2014 skipping skill discovery`);
      Et("skill_mcp_load", "skill_mcp_index_invalid_json");
      return t;
    }
    let o = gqp().safeParse(r);
    if (!o.success) {
      dn(e.name, `${"skill://index.json"} does not match the discovery schema \u2014 skipping skill discovery`);
      Et("skill_mcp_load", "skill_mcp_index_schema_invalid");
      return t;
    }
    let s = [];
    let i = [];
    for (let c of o.data.skills) {
      let u = Kqa(c.frontmatter?.name);
      if (!u) {
        continue;
      }
      if (c.url) {
        s.push({
          name: u,
          url: c.url,
          digest: c.digest
        });
        continue;
      }
      let d = c.archives?.find(p => !!p.url && TTo(p.mimeType ?? undefined, p.url) !== null);
      if (d?.url) {
        i.push({
          name: u,
          url: d.url,
          description: Kqa(c.frontmatter?.description) ?? "",
          mimeType: d.mimeType ?? undefined,
          digest: d.digest
        });
      }
    }
    let a = o.data.skills.length - s.length - i.length;
    if (a > 0) {
      dn(e.name, `${a} ${"skill://index.json"} entr${a === 1 ? "y" : "ies"} skipped (malformed or missing required fields)`);
      Et("skill_mcp_load", "skill_mcp_index_entries_dropped");
    }
    let l = s.slice(0, 100);
    return {
      direct: l,
      archives: i.slice(0, 100 - l.length)
    };
  }
  function Kqa(e) {
    return typeof e === "string" && e.length > 0 ? e : undefined;
  }
  async function bqp(e, t, n, r) {
    let o = await I5t(e.name, t);
    if (o.hit) {
      dn(e.name, `Skill '${t.name}' cache hit \u2014 no resources/read`);
      return yGn(e, t.url, t.name, o.skillMd, n);
    }
    return Sqp(e, t.url, t.name, n, r, {
      cacheEntry: t
    });
  }
  async function Sqp(e, t, n, r, o, s) {
    try {
      let a = (await e.client.request({
        method: "resources/read",
        params: {
          uri: t
        }
      }, Qae, {
        timeout: ez()
      })).contents?.find(d => "text" in d && typeof d.text === "string");
      if (!a || !("text" in a)) {
        dn(e.name, `Skill resource ${t} has no text content`);
        o("skill_mcp_no_text_content");
        return null;
      }
      if (a.text.length > 1e6) {
        dn(e.name, `Skill resource ${t} exceeds ${1e6 / 1e6}MB, skipping`);
        o("skill_mcp_content_too_large");
        return null;
      }
      let l = String(a.text);
      let c = H6e(s?.cacheEntry?.digest ?? undefined);
      let u = A5t(l);
      if (c && c !== u) {
        uu(e.name, `SKILL.md digest mismatch for ${t}: index declares ${c.slice(0, 12)}\u2026, served content hashes to ${u.slice(0, 12)}\u2026`);
        o("skill_mcp_skill_md_digest_mismatch");
        return null;
      }
      if (s?.cacheEntry) {
        await Tqp(e.name, s.cacheEntry, l, u);
      }
      return yGn(e, t, n, l, r);
    } catch (i) {
      uu(e.name, `Failed to load MCP skill from ${t}: ${he(i)}`);
      o("skill_mcp_fetch_failed");
      return null;
    }
  }
  async function Tqp(e, t, n, r) {
    try {
      let o = H6e(t.digest ?? undefined) ?? r;
      let {
        slugDir: s,
        keyDir: i,
        alreadyExtracted: a
      } = await fGn(e, t, o);
      if (!a) {
        let l = ETo.join(s, `.tmp-${process.pid}-${Yqa.randomBytes(4).toString("hex")}`);
        await mNe.mkdir(l, {
          recursive: true
        });
        try {
          await mNe.writeFile(ETo.join(l, "SKILL.md"), n);
          await mNe.rename(l, i);
        } catch (c) {
          if (await mNe.rm(l, {
            recursive: true,
            force: true
          }).catch(() => {}), en(c) !== "EEXIST" && en(c) !== "ENOTEMPTY") {
            throw c;
          }
        }
      }
      await hGn(s, t, o);
    } catch (o) {
      dn(e, `Failed to cache SKILL.md for '${t.name}': ${he(o)}`);
    }
  }
  function yGn(e, t, n, r, {
    createSkillCommand: o,
    parseSkillFrontmatterFields: s
  }, i) {
    let a = m3(r);
    let {
      frontmatter: l,
      content: c
    } = sf(a, t, {
      normalizeKeys: true
    });
    let u = s(l, c, n);
    let d = Bl(n);
    if (u.hooks) {
      dn(e.name, `Skill '${d}' declared hooks in frontmatter \u2014 ignored (MCP-sourced skills cannot register hooks)`);
    }
    if (u.allowedTools.length > 0) {
      dn(e.name, `Skill '${d}' declared allowed-tools in frontmatter \u2014 ignored (MCP-sourced skills cannot bypass permissions)`);
    }
    let p = `${Bl(e.name)}:${d}`;
    let m = Mqa(t);
    let f = !i && m ? {
      server: uNe(e.name),
      uri: uNe(m),
      directoryRead: M6e(e.capabilities)
    } : undefined;
    dn(e.name, `Loaded MCP skill '${d}' from ${t}`);
    return o({
      ...u,
      hooks: undefined,
      allowedTools: [],
      executionContext: undefined,
      agent: undefined,
      model: undefined,
      effort: undefined,
      shell: undefined,
      skillName: p,
      markdownContent: c,
      source: "mcp",
      baseDir: i,
      mcpResourceRoot: f,
      loadedFrom: "mcp",
      paths: undefined
    });
  }
  async function Eqp(e, t, n, r) {
    let o = Bl(e.name);
    let s = Bl(t.name);
    let i = `${o}:${s}`;
    let a = await I5t(e.name, t);
    if (a.hit) {
      dn(e.name, `Archive skill '${t.name}' cache hit at connect \u2014 no download`);
      return yGn(e, t.url, t.name, a.skillMd, n, a.dir);
    }
    let l = null;
    return {
      type: "prompt",
      name: i,
      description: t.description,
      isMcp: true,
      isHidden: false,
      userInvocable: true,
      loadedFrom: "mcp",
      source: "mcp",
      contentLength: 0,
      progressMessage: `Downloading skill archive from ${o}`,
      allowedTools: [],
      userFacingName: () => s,
      async getPromptForCommand(c, u) {
        let d = await n.ensureConnectedClient(e);
        l ??= Gqa(d, t);
        let p;
        try {
          p = await l;
        } catch (f) {
          l = null;
          p = {
            errorCode: "skill_mcp_archive_unpack_failed",
            message: he(f)
          };
        }
        if ("errorCode" in p) {
          l = null;
          uu(e.name, p.message);
          Ae("skill_mcp_load", p.errorCode, {
            mcp_server_sha12: i3i.createHash("sha256").update(e.name).digest("hex").slice(0, 12)
          });
          r(p.errorCode);
          return [{
            type: "text",
            text: `Error: failed to load archive skill '${t.name}' from MCP server '${e.name}': ${p.message}`
          }];
        }
        let m = yGn(e, t.url, t.name, p.skillMd, n, p.baseDir);
        if (m.type !== "prompt") {
          return [{
            type: "text",
            text: `Error: archive skill '${t.name}' did not build as a prompt command`
          }];
        }
        Pe("skill_mcp_load");
        return m.getPromptForCommand(c, u);
      }
    };
  }
  var Yqa;
  var mNe;
  var ETo;
  var gqp;
  var fetchMcpSkillsForClient;
  var wTo = __lazy(() => {
    ln();
    u5t();
    Noe();
    Zft();
    je();
    dt();
    dw();
    fv();
    Rn();
    nW();
    dNe();
    Vqa();
    gGn();
    Yqa = require("crypto");
    mNe = require("fs/promises");
    ETo = require("path");
    gqp = we(() => v.object({
      skills: v.array(v.looseObject({
        frontmatter: v.record(v.string(), v.unknown()).nullish(),
        url: v.string().nullish(),
        digest: v.string().nullish(),
        archives: v.array(v.looseObject({
          url: v.string().nullish(),
          mimeType: v.string().nullish(),
          digest: v.string().nullish()
        }).catch({})).nullish()
      }).catch({}))
    }));
    fetchMcpSkillsForClient = mk(async e => {
      if (!JHa(e.capabilities)) {
        return [];
      }
      let {
        direct: t,
        archives: n
      } = await _qp(e);
      if (t.length === 0 && n.length === 0) {
        return [];
      }
      dn(e.name, `Found ${t.length} direct skill(s) and ${n.length} archive skill(s) in ${"skill://index.json"}`);
      let r = NNa();
      let o = null;
      let s = c => {
        o = c;
      };
      let [i, a] = await Promise.all([Promise.all(t.map(c => bqp(e, c, r, s))), Promise.all(n.map(c => Eqp(e, c, r, s)))]);
      let l = [...i.filter(c => c !== null), ...a.filter(c => c !== null)];
      if (o) {
        Ae("skill_mcp_load", o, {
          mcp_server_sha12: i3i.createHash("sha256").update(e.name).digest("hex").slice(0, 12)
        });
      } else if (l.length > 0) {
        Pe("skill_mcp_load");
      }
      if (l.length > 0) {
        logForDebugging(`[mcp-skills] Loaded ${l.length} skills from MCP server '${e.name}'`);
      }
      return l;
    }, e => e.name, 20);
  });
  function fNe(e, t) {
    let n = e?.mcpInfo?.serverName;
    let r = n !== undefined ? t.mcpPermissionModeOverrides?.[n] : undefined;
    let o = t.mode === "bypassPermissions" || t.mode === "auto" || t.mode === "plan" && t.isBypassPermissionsModeAvailable === true;
    if (r !== undefined && o) {
      return r;
    }
    if (o && n !== undefined && vqp.vZc(n) && (n === "Claude Preview" ? t.previewClassifierFloorEnabled === true : t.chromeClassifierFloorEnabled === true)) {
      return t.canAutoClassifierRun === true ? "auto" : "default";
    }
    return t.mode;
  }
  function Jqa(e) {
    if (e === null) {
      return {
        ok: true,
        override: undefined
      };
    }
    if (e === "default" || e === "auto") {
      return {
        ok: true,
        override: e
      };
    }
    return {
      ok: false,
      rejected: e
    };
  }
  var vqp;
  var _Gn = __lazy(() => {
    vqp = new Set(["claude-in-chrome", "Claude in Chrome", "Claude Preview"]);
  });
  function Rqp(e) {
    let t = e.slice(0, 4);
    let n = e.length - t.length;
    if (n > 0) {
      t.push(`${n} more`);
    }
    if (t.length === 1) {
      return t[0] ?? "";
    }
    if (t.length === 2) {
      return `${t[0]} and ${t[1]}`;
    }
    return `${t.slice(0, -1).join(", ")}, and ${t.at(-1)}`;
  }
  function P5t(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function xqp(e) {
    if (!Array.isArray(e.actions)) {
      return [];
    }
    let t = new Set();
    let n = [];
    for (let r of e.actions) {
      if (!P5t(r) || typeof r.name !== "string") {
        continue;
      }
      if (r.name === "browser_batch" || MIt.vZc(r.name)) {
        continue;
      }
      let o = O5t(r.name, P5t(r.input) ? r.input : {});
      if (!t.vZc(o)) {
        t.add(o);
        n.push(o);
      }
    }
    return n;
  }
  function O5t(e, t) {
    let n = e.startsWith(CFC_TOOL_PREFIX) ? e.slice(CFC_TOOL_PREFIX.length) : e;
    if (n === "computer") {
      let r = typeof t.action === "string" ? t.action : undefined;
      if (r && Xqa[r]) {
        return Xqa[r];
      }
      return "use the browser";
    }
    if (n === "browser_batch") {
      let r = xqp(t);
      return r.length > 0 ? Rqp(r) : "use the browser";
    }
    return wqp[n] ?? "use the browser";
  }
  var wqp;
  var Xqa;
  var CTo = __lazy(() => {
    aet();
    b1();
    wqp = {
      navigate: "navigate",
      read_page: "read the page",
      get_page_text: "extract page text",
      find: "find an element",
      form_input: "fill in a form field",
      javascript_tool: "run JavaScript",
      read_console_messages: "read console messages",
      read_network_requests: "read network requests",
      upload_image: "upload an image",
      file_upload: "upload a file",
      select_browser: "select a browser"
    };
    Xqa = {
      screenshot: "take a screenshot",
      left_click: "click",
      right_click: "right-click",
      middle_click: "middle-click",
      double_click: "double-click",
      triple_click: "triple-click",
      type: "type text",
      key: "press keys",
      hold_key: "hold a key",
      scroll: "scroll",
      scroll_to: "scroll to an element",
      left_click_drag: "drag",
      zoom: "zoom in",
      hover: "hover",
      mouse_move: "move the mouse",
      left_mouse_down: "press the mouse button",
      left_mouse_up: "release the mouse button",
      cursor_position: "read the cursor position",
      wait: "wait"
    };
  });
  var i3a = {};
  __export(i3a, {
    setChromeBinding: () => setChromeBinding,
    getClaudeInChromePermissionOverrides: () => getClaudeInChromePermissionOverrides,
    _resetChromeBindingForTesting: () => _resetChromeBindingForTesting
  });
  function Qqa(e, t) {
    if (D5t.size >= 200) {
      D5t.clear();
    }
    D5t.set(e, t);
  }
  function RTo() {
    return {
      sessionId: getSessionId()
    };
  }
  function setChromeBinding(e, t) {
    N5t = {
      context: e,
      socketClient: t
    };
  }
  function _resetChromeBindingForTesting() {
    N5t = undefined;
  }
  function Pqp(e) {
    return e.replace(/^www\./i, "");
  }
  function Zqa(e) {
    let t = new Set();
    let n = [];
    let r = new Set();
    let o = new Map();
    e3a(e.alwaysDenyRules, r, o);
    e3a(e.alwaysAllowRules, t, o, n, r);
    return {
      allowed: t,
      denied: r,
      allowedRaw: n,
      sourceOf: o
    };
  }
  function Dqp(e, t) {
    let n = CFC_TOOL_PREFIX.slice(0, -2);
    let r = `${CFC_TOOL_PREFIX}*`;
    for (let o of Object.values(e.alwaysAllowRules)) {
      for (let s of o ?? []) {
        let i = s.replace(/\(\*?\)$/, "");
        if (i === t || i === n || i === r) {
          return true;
        }
      }
    }
    return false;
  }
  function M5t(e) {
    let t = e.replace(/\.+(?=$|:)/, "").toLowerCase();
    let n = xTo(t);
    let r = t.slice(n.length);
    let o = (o3a.domainToASCII(n) || n).replace(/\.+$/, "");
    return Pqp(o + r);
  }
  function xTo(e) {
    if (e.startsWith("[")) {
      let n = e.indexOf("]");
      return n === -1 ? e : e.slice(0, n + 1);
    }
    let t = e.lastIndexOf(":");
    return t === -1 ? e : e.slice(0, t);
  }
  function s3a(e, t) {
    return e.vZc(t) || e.vZc(xTo(t));
  }
  function e3a(e, t, n, r, o) {
    for (let [s, i] of Object.entries(e)) {
      for (let a of i ?? []) {
        let l = Oqp.exec(a);
        if (l?.[1]) {
          let c = M5t(l[1]);
          if (o && s3a(o, c)) {
            continue;
          }
          if (!t.vZc(c)) {
            t.add(c);
            n.set(c, s);
            r?.push(l[1]);
          }
        }
      }
    }
  }
  function t3a(e) {
    let t = e.trim();
    let n;
    try {
      if (n = new URL(t), n.protocol !== "http:" && n.protocol !== "https:") {
        if (!/^(localhost|[a-z0-9-]+\.[a-z0-9.-]+):\d+(?=$|[/?#])/i.test(t)) {
          return;
        }
        n = undefined;
      }
    } catch {}
    if (!n) {
      try {
        n = new URL(`https://${t}`);
      } catch {
        return;
      }
    }
    if (!n.host || n.username || n.password) {
      return;
    }
    return {
      host: n.host,
      url: n.href
    };
  }
  async function Nqp(e) {
    let t = N5t;
    if (!t) {
      return;
    }
    try {
      return await withTimeout((async () => {
        if (!(await t.socketClient.ensureConnected())) {
          return;
        }
        let n = await t.socketClient.callTool("tabs_context_mcp", {
          createIfEmpty: false,
          includePermissionState: false
        }, {
          permissionMode: "ask",
          sessionScope: RTo()
        });
        if (!n || n.error) {
          return;
        }
        let r = n.result?.content;
        let o = Array.isArray(r) && r[0] && typeof r[0] === "object" && "text" in r[0] && typeof r[0].text === "string" ? r[0].text : undefined;
        if (!o) {
          return;
        }
        return qt(o).availableTabs?.find(i => i.tabId === e)?.url;
      })(), 5000, "queryTabUrl bridge call");
    } catch {
      return;
    }
  }
  function n3a(e) {
    return {
      type: "text",
      text: `[Image from Claude in Chrome \u2014 ${e}; not inlined]`
    };
  }
  function Fqp(e) {
    if (!e) {
      return false;
    }
    let t = ii(e, ";").trim().toLowerCase();
    return Lqp.vZc(t === "image/jpg" ? "image/jpeg" : t);
  }
  async function Uqp(e, t) {
    let n = Yg(t);
    let r = [];
    for (let o of e.content ?? []) {
      if (o.type === "text") {
        r.push({
          type: "text",
          text: o.text
        });
      } else if (o.type === "image") {
        if (Fqp(o.mimeType)) {
          try {
            let {
              block: s
            } = await f1({
              data: String(o.data),
              mediaType: o.mimeType,
              limits: n
            });
            r.push(s);
          } catch {
            r.push(n3a("could not be decoded"));
          }
        } else {
          r.push(n3a(`unsupported type ${o.mimeType ?? "unknown"}`));
        }
      }
    }
    return r;
  }
  function Bqp(e) {
    if (!Array.isArray(e.actions)) {
      return;
    }
    for (let t of e.actions) {
      if (!P5t(t) || typeof t.name !== "string") {
        continue;
      }
      if (MIt.vZc(t.name)) {
        continue;
      }
      let n = P5t(t.input) ? t.input : {};
      if (t.name === "navigate" && typeof n.url === "string" && (n.url.trim().toLowerCase() === "back" || n.url.trim().toLowerCase() === "forward")) {
        continue;
      }
      if (t.name === "navigate" && typeof n.url === "string" || typeof n.tabId === "number") {
        return {
          toolName: t.name,
          input: n
        };
      }
    }
    return;
  }
  function $qp(e, t, n) {
    let r = O5t(e, t);
    return n ? `Allow Claude in Chrome to ${r} on ${n}?` : `Allow Claude in Chrome to ${r}?`;
  }
  function Hqp(e) {
    return async t => {
      let n;
      try {
        n = new URL(t.url).host;
      } catch {}
      let r = !!n && e.vZc(M5t(n));
      if (!r) {
        Ae("chrome_permission_prompt", "stale_host_mismatch");
      }
      return r;
    };
  }
  async function r3a(e, t, n, r) {
    let o = N5t;
    if (!o) {
      throw Ae("chrome_permission_prompt", "binding_missing"), Error("Claude in Chrome bridge is not initialized in this session.");
    }
    let s = n.abortController.signal;
    if (s.aborted) {
      throw new xc("Claude in Chrome tool call aborted");
    }
    let i;
    let a = new Promise((u, d) => {
      i = () => d(new xc("Claude in Chrome tool call aborted"));
      s.addEventListener("abort", i, {
        once: true
      });
    });
    let l;
    try {
      l = await Promise.race([Xmn(o.context, o.socketClient, e, t ?? {}, r), a]);
    } finally {
      if (i) {
        s.removeEventListener("abort", i);
      }
    }
    if (l.isError) {
      let u = (l.content ?? []).flatMap(d => d.type === "text" ? [d.text] : []).join(`
`) || `${e} failed`;
      throw new Po(u, "Claude in Chrome tool returned error");
    }
    return {
      data: await Uqp(l, n.options.mainLoopModel),
      ...(l._meta && {
        mcpMeta: {
          _meta: l._meta
        }
      })
    };
  }
  function getClaudeInChromePermissionOverrides(e) {
    if (!isInProductPermissionsEnabled()) {
      return {
        checkPermissions: async i => ({
          behavior: "allow",
          updatedInput: i
        }),
        call: async (i, a) => r3a(e, i, a, {
          permissionMode: N5t?.context.initialPermissionMode ?? "ask",
          sessionScope: RTo()
        })
      };
    }
    let t = `${CFC_TOOL_PREFIX}${e}`;
    return {
      checkPermissions: async (o, s) => {
        let i = s.toolUseId;
        if (MIt.vZc(e)) {
          return {
            behavior: "allow",
            updatedInput: o
          };
        }
        if (e === "navigate" && typeof o.url === "string" && (o.url.trim().toLowerCase() === "back" || o.url.trim().toLowerCase() === "forward")) {
          return {
            behavior: "allow",
            updatedInput: o
          };
        }
        let a = e === "browser_batch" ? Bqp(o) : {
          input: o,
          toolName: e
        };
        let l;
        if (a && a.toolName === "navigate" && typeof a.input.url === "string") {
          if (l = t3a(a.input.url), !l) {
            Ae("chrome_permission_prompt", "non_web_url");
            return {
              behavior: "deny",
              message: "Can't interact with browser-internal or unparseable URLs. Navigate to a web page first.",
              decisionReason: {
                type: "safetyCheck",
                reason: "Claude in Chrome: non-web or unparseable URL",
                classifierApprovable: false
              }
            };
          }
        } else if (a && typeof a.input.tabId === "number") {
          let d = await Nqp(a.input.tabId);
          if (!d) {
            Ae("chrome_permission_prompt", "tab_url_unresolved");
            return {
              behavior: "deny",
              message: "Couldn't determine which page this action targets. Re-read tabs_context_mcp and try again.",
              decisionReason: {
                type: "safetyCheck",
                reason: "Claude in Chrome: tab URL unresolved",
                classifierApprovable: false
              }
            };
          }
          if (l = t3a(d), !l) {
            Ae("chrome_permission_prompt", "non_web_tab_url");
            return {
              behavior: "deny",
              message: "Can't interact with browser-internal or unparseable URLs. Navigate to a web page first.",
              decisionReason: {
                type: "safetyCheck",
                reason: "Claude in Chrome: non-web or unparseable tab URL",
                classifierApprovable: false
              }
            };
          }
        }
        let c = getToolPermissionContext(s);
        let u = false;
        if (l) {
          let d = Zqa(c);
          let p = M5t(l.host);
          let m = d.sourceOf.get(p) ?? d.sourceOf.get(xTo(p)) ?? "session";
          if (s3a(d.denied, p)) {
            Et("chrome_permission_prompt", "domain_rule_denied");
            return {
              behavior: "deny",
              message: `Claude in Chrome is denied on ${l.host}.`,
              decisionReason: {
                type: "rule",
                rule: {
                  source: m,
                  ruleBehavior: "deny",
                  ruleValue: {
                    toolName: "ClaudeInChromeDomain",
                    ruleContent: l.host
                  }
                }
              }
            };
          }
          if (u = d.allowed.vZc(p), u && c.chromeClassifierFloorEnabled !== true) {
            if (i) {
              Qqa(i, l);
            }
            return {
              behavior: "allow",
              updatedInput: o,
              decisionReason: {
                type: "rule",
                rule: {
                  source: m,
                  ruleBehavior: "allow",
                  ruleValue: {
                    toolName: "ClaudeInChromeDomain",
                    ruleContent: l.host
                  }
                }
              }
            };
          }
          if (i && (u || c.chromeClassifierFloorEnabled === true || !Dqp(c, t))) {
            Qqa(i, l);
          }
        }
        return {
          behavior: "ask",
          message: "Claude in Chrome requires permission.",
          suggestions: l ? u ? undefined : [{
            type: "addRules",
            rules: [{
              toolName: "ClaudeInChromeDomain",
              ruleContent: l.host
            }],
            behavior: "allow",
            destination: "session"
          }] : [{
            type: "addRules",
            rules: [{
              toolName: t,
              ruleContent: undefined
            }],
            behavior: "allow",
            destination: "session"
          }],
          decisionReason: {
            type: "other",
            reason: l ? `Claude in Chrome action on ${l.host}` : "Claude in Chrome action"
          },
          metadata: {
            command: {
              name: t,
              description: $qp(e, o, l?.host),
              chrome: l ? {
                ...l,
                domainAllowed: u
              } : undefined
            }
          }
        };
      },
      call: async (o, s) => {
        let i = s.toolUseId;
        let a = i ? D5t.get(i)?.host : undefined;
        if (i) {
          D5t.delete(i);
        }
        let l = getToolPermissionContext(s);
        let c = s.options?.tools?.find(y => bl(y, t));
        let u = fNe(c, l) === "bypassPermissions";
        let d = Zqa(l);
        let p = d.allowed;
        let m = [...d.allowedRaw];
        if (a && !p.vZc(M5t(a))) {
          p.add(M5t(a));
          m.push(a);
        }
        let f = RTo();
        let h = u ? {
          permissionMode: "skip_all_permission_checks",
          sessionScope: f
        } : a ? {
          permissionMode: "follow_a_plan",
          allowedDomains: m,
          onPermissionRequest: Hqp(p),
          sessionScope: f
        } : m.length > 0 ? {
          permissionMode: "follow_a_plan",
          allowedDomains: m,
          sessionScope: f
        } : {
          permissionMode: "ask",
          sessionScope: f
        };
        let g = await r3a(e, o, s, h);
        if (a) {
          Pe("chrome_permission_prompt");
        }
        return g;
      }
    };
  }
  var o3a;
  var N5t;
  var D5t;
  var Oqp;
  var Lqp;
  var ATo = __lazy(() => {
    aet();
    Qmn();
    at();
    ln();
    ci();
    Sl();
    dt();
    yG();
    JF();
    _Gn();
    Zn();
    b1();
    CTo();
    o3a = require("url");
    D5t = new Map();
    Oqp = new RegExp(`^${"ClaudeInChromeDomain"}\\(([^)]+)\\)$`);
    Lqp = new Set(["image/png", "image/jpeg", "image/gif", "image/webp"]);
  });
  var l3a = {};
  __export(l3a, {
    renderChromeToolResultMessage: () => renderChromeToolResultMessage,
    getClaudeInChromeMCPToolOverrides: () => getClaudeInChromeMCPToolOverrides
  });
  function qqp(e, t, n) {
    let r = e.tabId;
    if (typeof r === "number") {
      trackClaudeInChromeTabId(r);
    }
    let o = [];
    switch (t) {
      case "navigate":
        if (typeof e.url === "string") {
          try {
            let s = new URL(e.url);
            o.push(s.hostname);
          } catch {
            o.push(truncateToWidth(e.url, 30));
          }
        }
        break;
      case "find":
        if (typeof e.query === "string") {
          o.push(`pattern: ${truncateToWidth(e.query, 30)}`);
        }
        break;
      case "computer":
        if (typeof e.action === "string") {
          let s = e.action;
          if (s === "left_click" || s === "right_click" || s === "double_click" || s === "middle_click") {
            if (typeof e.ref === "string") {
              o.push(`${s} on ${e.ref}`);
            } else if (Array.isArray(e.coordinate)) {
              o.push(`${s} at (${e.coordinate.join(", ")})`);
            } else {
              o.push(s);
            }
          } else if (s === "type" && typeof e.text === "string") {
            o.push(`type "${truncateToWidth(e.text, 15)}"`);
          } else if (s === "key" && typeof e.text === "string") {
            o.push(`key ${e.text}`);
          } else if (s === "scroll" && typeof e.scroll_direction === "string") {
            o.push(`scroll ${e.scroll_direction}`);
          } else if (s === "wait" && typeof e.duration === "number") {
            o.push(`wait ${e.duration}s`);
          } else if (s === "left_click_drag") {
            o.push("drag");
          } else {
            o.push(s);
          }
        }
        break;
      case "gif_creator":
        if (typeof e.action === "string") {
          o.push(`${e.action}`);
        }
        break;
      case "resize_window":
        if (typeof e.width === "number" && typeof e.height === "number") {
          o.push(`${e.width}x${e.height}`);
        }
        break;
      case "read_console_messages":
        if (typeof e.pattern === "string") {
          o.push(`pattern: ${truncateToWidth(e.pattern, 20)}`);
        }
        if (e.onlyErrors === true) {
          o.push("errors only");
        }
        break;
      case "read_network_requests":
        if (typeof e.urlPattern === "string") {
          o.push(`pattern: ${truncateToWidth(e.urlPattern, 20)}`);
        }
        break;
      case "shortcuts_execute":
        if (typeof e.shortcutId === "string") {
          o.push(`shortcut_id: ${e.shortcutId}`);
        }
        break;
      case "javascript_tool":
        if (n && typeof e.text === "string") {
          return e.text;
        }
        return "";
      case "tabs_create_mcp":
      case "tabs_context_mcp":
      case "form_input":
      case "shortcuts_list":
      case "read_page":
      case "upload_image":
      case "get_page_text":
      case "update_plan":
        return "";
    }
    return o.join(", ") || null;
  }
  function Wqp(e) {
    if (!Hk()) {
      return null;
    }
    if (typeof e !== "object" || e === null || !("tabId" in e)) {
      return null;
    }
    let t = typeof e.tabId === "number" ? e.tabId : typeof e.tabId === "string" ? parseInt(e.tabId, 10) : NaN;
    if (isNaN(t)) {
      return null;
    }
    let n = `${"https://clau.de/chrome/tab/"}${t}`;
    return j6e.jsxs(Text, {
      children: [" ", j6e.jsx(Link, {
        url: n,
        children: j6e.jsx(Text, {
          color: "subtle",
          children: "[View Tab]"
        })
      })]
    });
  }
  function renderChromeToolResultMessage(e, t, n) {
    if (n) {
      return c4n(e, [], {
        verbose: n
      });
    }
    let r = null;
    switch (t) {
      case "navigate":
        r = "Navigation completed";
        break;
      case "tabs_create_mcp":
        r = "Tab created";
        break;
      case "tabs_context_mcp":
        r = "Tabs read";
        break;
      case "form_input":
        r = "Input completed";
        break;
      case "computer":
        r = "Action completed";
        break;
      case "resize_window":
        r = "Window resized";
        break;
      case "find":
        r = "Search completed";
        break;
      case "gif_creator":
        r = "GIF action completed";
        break;
      case "read_console_messages":
        r = "Console messages retrieved";
        break;
      case "read_network_requests":
        r = "Network requests retrieved";
        break;
      case "shortcuts_list":
        r = "Shortcuts retrieved";
        break;
      case "shortcuts_execute":
        r = "Shortcut executed";
        break;
      case "javascript_tool":
        r = "Script executed";
        break;
      case "read_page":
        r = "Page read";
        break;
      case "upload_image":
        r = "Image uploaded";
        break;
      case "get_page_text":
        r = "Page text retrieved";
        break;
      case "update_plan":
        r = "Plan updated";
        break;
    }
    if (r) {
      return j6e.jsx(Vn, {
        height: 1,
        children: j6e.jsx(Text, {
          dimColor: true,
          children: r
        })
      });
    }
    return null;
  }
  function getClaudeInChromeMCPToolOverrides(e) {
    return {
      userFacingName(t) {
        return `Claude in Chrome[${e.replace(/_mcp$/, "")}]`;
      },
      renderToolUseMessage(t, {
        verbose: n
      }) {
        return qqp(t, e, n);
      },
      renderToolUseTag(t) {
        return Wqp(t);
      },
      renderToolResultMessage(t, n, {
        verbose: r
      }) {
        if (!Vqp(t)) {
          return null;
        }
        return renderChromeToolResultMessage(t, e, r);
      },
      ...getClaudeInChromePermissionOverrides(e)
    };
  }
  function Vqp(e) {
    return typeof e === "object" && e !== null;
  }
  var j6e;
  var c3a = __lazy(() => {
    Wl();
    uG();
    et();
    d_o();
    cs();
    b1();
    ATo();
    j6e = __toESM(ie(), 1);
  });
  var bGn;
  var ITo = __lazy(() => {
    Hpt();
    bGn = {
      kind: "computer_use_approval",
      payload: we(() => v.custom(e => typeof e === "object" && e !== null)),
      result: we(() => v.custom(e => typeof e === "object" && e !== null)),
      default: {
        granted: [],
        denied: [],
        flags: jX
      }
    };
  });
  function PTo() {
    return {
      ...u3a,
      ...getDynamicConfig_CACHED_MAY_BE_STALE("tengu_malort_pedway", u3a)
    };
  }
  function zqp() {
    let e = getSubscriptionType();
    return e === "max" || e === "pro";
  }
  function SGn() {
    if (l8("hipaa")) {
      return false;
    }
    return zqp() && PTo().enabled;
  }
  function TGn() {
    let {
      enabled: e,
      coordinateMode: t,
      ...n
    } = PTo();
    return n;
  }
  function lht() {
    d3a ??= PTo().coordinateMode;
    return d3a;
  }
  var u3a;
  var d3a;
  var cht = __lazy(() => {
    $n();
    $Y();
    no();
    gn();
    u3a = {
      enabled: false,
      pixelValidation: false,
      clipboardPasteMultiline: true,
      mouseAnimation: true,
      hideBeforeAction: true,
      autoTargetDisplay: true,
      clipboardGuard: true,
      coordinateMode: "pixels"
    };
  });
  class p3a {
    silly(e, ...t) {
      logForDebugging(uht.format(e, ...t), {
        level: "debug"
      });
    }
    debug(e, ...t) {
      logForDebugging(uht.format(e, ...t), {
        level: "debug"
      });
    }
    info(e, ...t) {
      logForDebugging(uht.format(e, ...t), {
        level: "info"
      });
    }
    warn(e, ...t) {
      logForDebugging(uht.format(e, ...t), {
        level: "warn"
      });
    }
    error(e, ...t) {
      logForDebugging(uht.format(e, ...t), {
        level: "error"
      });
    }
  }
  function vGn() {
    if (EGn) {
      return EGn;
    }
    EGn = {
      serverName: "computer-use",
      logger: new p3a(),
      executor: createCliExecutor({
        getMouseAnimationEnabled: () => TGn().mouseAnimation,
        getHideBeforeActionEnabled: () => TGn().hideBeforeAction
      }),
      ensureOsPermissions: async () => {
        let e = Vq();
        let t = e.tcc.checkAccessibility();
        let n = e.tcc.checkScreenRecording();
        return t && n ? {
          granted: true
        } : {
          granted: false,
          accessibility: t,
          screenRecording: n
        };
      },
      isDisabled: () => !SGn(),
      getSubGates: TGn,
      getAutoUnhideEnabled: () => true,
      cropRawPatch: () => null
    };
    return EGn;
  }
  var uht;
  var EGn;
  var OTo = __lazy(() => {
    je();
    Cbe();
    Nmo();
    cht();
    uht = require("util");
  });
  function L5t(e) {
    return e ? `(${e[0]}, ${e[1]})` : "";
  }
  function m3a(e) {
    return {
      userFacingName() {
        return `Computer Use[${e}]`;
      },
      renderToolUseMessage(t) {
        switch (e) {
          case "screenshot":
          case "left_mouse_down":
          case "left_mouse_up":
          case "cursor_position":
          case "list_granted_applications":
          case "read_clipboard":
            return "";
          case "left_click":
          case "right_click":
          case "middle_click":
          case "double_click":
          case "triple_click":
          case "mouse_move":
            return L5t(t.coordinate);
          case "left_click_drag":
            return t.start_coordinate ? `${L5t(t.start_coordinate)} \u2192 ${L5t(t.coordinate)}` : `to ${L5t(t.coordinate)}`;
          case "type":
            return typeof t.text === "string" ? `"${truncateToWidth(t.text, 40)}"` : "";
          case "key":
          case "hold_key":
            return typeof t.text === "string" ? t.text : "";
          case "scroll":
            return [t.direction, t.amount && `\xD7${t.amount}`, t.coordinate && `at ${L5t(t.coordinate)}`].filter(Boolean).join(" ");
          case "zoom":
            {
              let n = t.region;
              return Array.isArray(n) && n.length === 4 ? `[${n[0]}, ${n[1]}, ${n[2]}, ${n[3]}]` : "";
            }
          case "wait":
            return typeof t.duration === "number" ? `${t.duration}s` : "";
          case "write_clipboard":
            return typeof t.text === "string" ? `"${truncateToWidth(t.text, 40)}"` : "";
          case "open_application":
            return typeof t.bundle_id === "string" ? String(t.bundle_id) : "";
          case "request_access":
            {
              let n = t.apps;
              if (!Array.isArray(n)) {
                return "";
              }
              return n.map(o => typeof o?.displayName === "string" ? o.displayName : "").filter(Boolean).join(", ");
            }
          case "computer_batch":
            {
              let n = t.actions;
              return Array.isArray(n) ? `${n.length} actions` : "";
            }
          default:
            return "";
        }
      },
      renderToolResultMessage(t, n, {
        verbose: r
      }) {
        if (r || typeof t !== "object" || t === null) {
          return null;
        }
        let o = Kqp[e];
        if (!o) {
          return null;
        }
        return DTo.jsx(Vn, {
          height: 1,
          children: DTo.jsx(Text, {
            dimColor: true,
            children: o
          })
        });
      }
    };
  }
  var DTo;
  var Kqp;
  var f3a = __lazy(() => {
    Wl();
    et();
    cs();
    DTo = __toESM(ie(), 1);
    Kqp = {
      screenshot: "Captured",
      zoom: "Captured",
      request_access: "Access updated",
      left_click: "Clicked",
      right_click: "Clicked",
      middle_click: "Clicked",
      double_click: "Clicked",
      triple_click: "Clicked",
      type: "Typed",
      key: "Pressed",
      hold_key: "Pressed",
      scroll: "Scrolled",
      left_click_drag: "Dragged",
      open_application: "Opened"
    };
  });
  var y3a = {};
  __export(y3a, {
    getComputerUseMCPToolOverrides: () => getComputerUseMCPToolOverrides,
    buildSessionContext: () => buildSessionContext,
    _resetComputerUseWrapperForTesting: () => _resetComputerUseWrapperForTesting
  });
  function h9() {
    return MTo;
  }
  function _resetComputerUseWrapperForTesting() {
    F5t = undefined;
    MTo = undefined;
    NTo = undefined;
    wGn = 0;
    NHn();
  }
  function h3a(e) {
    return `Computer use is in use by another Claude session (${e.slice(0, 8)}\u2026). Wait for that session to finish or run /exit there.`;
  }
  function buildSessionContext() {
    return {
      getAllowedApps: () => h9().getAppState().computerUseMcpState?.allowedApps ?? [],
      getGrantFlags: () => h9().getAppState().computerUseMcpState?.grantFlags ?? jX,
      getUserDeniedBundleIds: () => [],
      getSelectedDisplayId: () => h9().getAppState().computerUseMcpState?.selectedDisplayId,
      getDisplayPinnedByModel: () => h9().getAppState().computerUseMcpState?.displayPinnedByModel ?? false,
      getDisplayResolvedForApps: () => h9().getAppState().computerUseMcpState?.displayResolvedForApps,
      getLastScreenshotDims: () => {
        let e = h9().getAppState().computerUseMcpState?.lastScreenshotDims;
        return e ? {
          ...e,
          displayId: e.displayId ?? 0,
          originX: e.originX ?? 0,
          originY: e.originY ?? 0
        } : undefined;
      },
      onPermissionRequest: (e, t) => Qqp(e),
      onAllowedAppsChanged: (e, t) => OTe(h9().setAppState, n => {
        let r = n?.allowedApps;
        let o = n?.grantFlags;
        let s = r?.length === e.length && e.every((a, l) => r[l]?.bundleId === a.bundleId);
        let i = o?.clipboardRead === t.clipboardRead && o?.clipboardWrite === t.clipboardWrite && o?.systemKeyCombos === t.systemKeyCombos;
        return s && i ? n : {
          ...n,
          allowedApps: [...e],
          grantFlags: t
        };
      }),
      onAppsHidden: e => {
        if (e.length === 0) {
          return;
        }
        OTe(h9().setAppState, t => {
          let n = t?.hiddenDuringTurn;
          if (n && e.every(r => n.vZc(r))) {
            return t;
          }
          return {
            ...t,
            hiddenDuringTurn: new Set([...(n ?? []), ...e])
          };
        });
      },
      onResolvedDisplayUpdated: e => OTe(h9().setAppState, t => {
        if (t?.selectedDisplayId === e && !t.displayPinnedByModel && t.displayResolvedForApps === undefined) {
          return t;
        }
        return {
          ...t,
          selectedDisplayId: e,
          displayPinnedByModel: false,
          displayResolvedForApps: undefined
        };
      }),
      onDisplayPinned: e => OTe(h9().setAppState, t => {
        let n = e !== undefined;
        let r = n ? t?.displayResolvedForApps : undefined;
        if (t?.selectedDisplayId === e && t?.displayPinnedByModel === n && t?.displayResolvedForApps === r) {
          return t;
        }
        return {
          ...t,
          selectedDisplayId: e,
          displayPinnedByModel: n,
          displayResolvedForApps: r
        };
      }),
      onDisplayResolvedForApps: e => OTe(h9().setAppState, t => {
        if (t?.displayResolvedForApps === e) {
          return t;
        }
        return {
          ...t,
          displayResolvedForApps: e
        };
      }),
      onScreenshotCaptured: e => OTe(h9().setAppState, t => {
        let n = t?.lastScreenshotDims;
        return n?.width === e.width && n?.height === e.height && n?.displayWidth === e.displayWidth && n?.displayHeight === e.displayHeight && n?.displayId === e.displayId && n?.originX === e.originX && n?.originY === e.originY ? t : {
          ...t,
          lastScreenshotDims: e
        };
      }),
      checkCuLock: async () => {
        let e = await e_a();
        switch (e.kind) {
          case "free":
            return {
              holder: undefined,
              isSelf: false
            };
          case "held_by_self":
            if (MHn()) {
              return {
                holder: getSessionId(),
                isSelf: true
              };
            }
            return {
              holder: undefined,
              isSelf: false
            };
          case "blocked":
            return {
              holder: e.by,
              isSelf: false
            };
        }
      },
      acquireCuLock: async () => {
        let e = await t_a();
        if (e.kind === "blocked") {
          throw Error(h3a(e.by));
        }
        if (n_a()) {
          let t = u_a(() => {
            if (wGn === 0) {
              logForDebugging("[cu-esc] user escape with no CU call in flight; consumed only");
              return;
            }
            logForDebugging("[cu-esc] user escape, aborting turn");
            h9().abortController.abort();
          });
          NTo?.({
            type: "os_notification",
            message: t ? "Claude is using your computer \xB7 press Esc to stop" : "Claude is using your computer \xB7 press Ctrl+C to stop",
            notificationType: "computer_use_enter"
          });
        }
      },
      formatLockHeldMessage: h3a
    };
  }
  function Jqp() {
    if (F5t) {
      return F5t;
    }
    let e = buildSessionContext();
    F5t = {
      ctx: e,
      dispatch: zHn(vGn(), lht(), e)
    };
    return F5t;
  }
  function getComputerUseMCPToolOverrides(e) {
    let t = async (n, r, o, s, i) => {
      MTo = r;
      NTo = i;
      wGn++;
      let a;
      try {
        let {
          dispatch: d
        } = Jqp();
        a = await d(e, n);
      } finally {
        wGn--;
      }
      let {
        telemetry: l,
        ...c
      } = a;
      if (l?.error_kind) {
        logForDebugging(`[Computer Use MCP] ${e} error_kind=${l.error_kind}`);
      }
      return {
        data: Array.isArray(c.content) ? c.content.map(d => d.type === "image" ? {
          type: "image",
          source: {
            type: "base64",
            media_type: d.mimeType ?? "image/jpeg",
            data: d.data
          }
        } : {
          type: "text",
          text: d.type === "text" ? d.text : ""
        }) : c.content
      };
    };
    return {
      ...m3a(e),
      call: t
    };
  }
  async function Qqp(e) {
    let t = h9();
    let n = t.requestDialog;
    if (!n) {
      return {
        granted: [],
        denied: [],
        flags: jX
      };
    }
    return n(bGn, e, {
      signal: t.abortController.signal
    });
  }
  var F5t;
  var MTo;
  var NTo;
  var wGn = 0;
  var _3a = __lazy(() => {
    Hpt();
    at();
    ITo();
    je();
    hmo();
    UHn();
    cht();
    OTo();
    f3a();
  });
  var FTo = {};
  __export(FTo, {
    createLinkedTransportPair: () => createLinkedTransportPair
  });
  class LTo {
    peer;
    closed = false;
    onclose;
    onerror;
    onmessage;
    _setPeer(e) {
      this.peer = e;
    }
    async start() {}
    async send(e) {
      if (this.closed) {
        throw Error("Transport is closed");
      }
      queueMicrotask(() => {
        this.peer?.onmessage?.(e);
      });
    }
    async close() {
      if (this.closed) {
        return;
      }
      if (this.closed = true, this.onclose?.(), this.peer && !this.peer.closed) {
        this.peer.closed = true;
        this.peer.onclose?.();
      }
    }
  }
  function createLinkedTransportPair() {
    let e = new LTo();
    let t = new LTo();
    e._setPeer(t);
    t._setPeer(e);
    return [e, t];
  }
  var dht = {};
  __export(dht, {
    shouldTrackDatadog: () => shouldTrackDatadog,
    initializeAnalyticsSink: () => initializeAnalyticsSink
  });
  function shouldTrackDatadog() {
    if (V4e("datadog")) {
      return false;
    }
    try {
      return getFeatureValue_CACHED_MAY_BE_STALE("tengu_log_datadog_events", false);
    } catch {
      return false;
    }
  }
  function t3p(e, t) {
    if (UTo) {
      logForDebugging(`logEvent reentered while collecting metadata \u2014 dropped ${e}. A getEventMetadata dependency (model/betas/auth) called logEvent synchronously; defer it (queueMicrotask) or move it out of the metadata path.`, {
        level: "error"
      });
      return;
    }
    UTo = true;
    try {
      let n = shouldSampleEvent(e);
      if (n === 0) {
        return;
      }
      let r = n !== null ? {
        ...t,
        sample_rate: n
      } : t;
      if (shouldTrackDatadog()) {
        trackDatadogEvent(e, stripProtoFields(r));
      }
      logEventTo1P(e, r);
    } finally {
      UTo = false;
    }
  }
  async function n3p(e, t) {
    let n = shouldSampleEvent(e);
    if (n === 0) {
      return;
    }
    let r = n !== null ? {
      ...t,
      sample_rate: n
    } : t;
    let o = [];
    if (shouldTrackDatadog()) {
      o.push(trackDatadogEvent(e, stripProtoFields(r)));
    }
    o.push(logEventTo1PAwaitable(e, r));
    await Promise.all(o);
  }
  function initializeAnalyticsSink() {
    attachAnalyticsSink({
      logEvent: t3p,
      logEventAsync: n3p
    });
  }
  var UTo = false;
  var TEe = __lazy(() => {
    je();
    xJ();
    BF();
    $n();
    Ot();
    IXr();
  });
  function a3p(e, t) {
    if (r3p.some(n => e.startsWith(n))) {
      return true;
    }
    if (t) {
      let n = t.endsWith("/") ? `${t}Applications/` : `${t}/Applications/`;
      if (e.startsWith(n)) {
        return true;
      }
    }
    return false;
  }
  function l3p(e) {
    return o3p.some(t => t.test(e));
  }
  function b3a(e, t) {
    let n = new Set();
    return e.map(r => r.trim()).filter(r => {
      if (!r) {
        return false;
      }
      if (r.length > 40) {
        return false;
      }
      if (t && !i3p.test(r)) {
        return false;
      }
      if (n.vZc(r)) {
        return false;
      }
      n.add(r);
      return true;
    }).sort((r, o) => r.localeCompare(o));
  }
  function c3p(e) {
    let t = b3a(e, true);
    if (t.length <= 50) {
      return t;
    }
    return [...t.slice(0, 50), `\u2026 and ${t.length - 50} more`];
  }
  function u3p(e) {
    return b3a(e, false);
  }
  function S3a(e, t) {
    let {
      alwaysKept: n,
      rest: r
    } = e.reduce((i, a) => {
      if (s3p.vZc(a.bundleId)) {
        i.alwaysKept.push(a.displayName);
      } else if (a3p(a.path, t) && !l3p(a.displayName)) {
        i.rest.push(a.displayName);
      }
      return i;
    }, {
      alwaysKept: [],
      rest: []
    });
    let o = u3p(n);
    let s = new Set(o);
    return [...o, ...c3p(r).filter(i => !s.vZc(i))];
  }
  var r3p;
  var o3p;
  var s3p;
  var i3p;
  var T3a = __lazy(() => {
    r3p = ["/Applications/", "/System/Applications/"];
    o3p = [/Helper(?:$|\s\()/, /Agent(?:$|\s\()/, /Service(?:$|\s\()/, /Uninstaller(?:$|\s\()/, /Updater(?:$|\s\()/, /^\./];
    s3p = new Set(["com.apple.Safari", "com.google.Chrome", "com.microsoft.edgemac", "org.mozilla.firefox", "company.thebrowser.Browser", "com.tinyspeck.slackmacgap", "us.zoom.xos", "com.microsoft.teams2", "com.microsoft.teams", "com.apple.MobileSMS", "com.apple.mail", "com.microsoft.Word", "com.microsoft.Excel", "com.microsoft.Powerpoint", "com.microsoft.Outlook", "com.apple.iWork.Pages", "com.apple.iWork.Numbers", "com.apple.iWork.Keynote", "com.google.GoogleDocs", "notion.id", "com.apple.Notes", "md.obsidian", "com.linear", "com.figma.Desktop", "com.microsoft.VSCode", "com.apple.Terminal", "com.googlecode.iterm2", "com.github.GitHubDesktop", "com.apple.finder", "com.apple.iCal", "com.apple.systempreferences"]);
    i3p = /^[\p{L}\p{M}\p{N}_ .&'()+-]+$/u;
  });
  var $To = {};
  __export($To, {
    runComputerUseMcpServer: () => runComputerUseMcpServer,
    createComputerUseMcpServerForCli: () => createComputerUseMcpServerForCli
  });
  async function d3p() {
    try {
      let e = Vq();
      let t = await hoe(() => e.apps.listInstalled(), 1000);
      return S3a(t, v3a.homedir());
    } catch {
      logForDebugging(`[Computer Use MCP] app enumeration exceeded ${1000}ms or failed; tool description omits list`);
      return;
    }
  }
  async function createComputerUseMcpServerForCli() {
    let e = vGn();
    let t = lht();
    let n = xmo(e, t);
    let r = await d3p();
    let o = s5e(e.executor.capabilities, t, r);
    n.setRequestHandler(q7, async () => e.isDisabled() ? {
      tools: []
    } : {
      tools: o
    });
    return n;
  }
  async function runComputerUseMcpServer() {
    enableConfigs();
    initializeAnalyticsSink();
    let e = await createComputerUseMcpServerForCli();
    let t = new SHe();
    let n = false;
    let r = async () => {
      if (n) {
        return;
      }
      n = true;
      await Promise.all([shutdown1PEventLogging(), shutdownDatadog()]);
      process.exit(0);
    };
    process.stdin.on("end", () => void r());
    process.stdin.on("error", () => void r());
    logForDebugging("[Computer Use MCP] Starting MCP server");
    await e.connect(t);
    logForDebugging("[Computer Use MCP] MCP server started");
  }
  var v3a;
  var HTo = __lazy(() => {
    Hpt();
    nfn();
    xJ();
    BF();
    TEe();
    je();
    T3a();
    cht();
    OTo();
    v3a = require("os");
  });
  function xGn(e, t) {
    t(n => {
      let r = n.mcp.clients.findIndex(i => i.name === e);
      if (r === -1) {
        return n;
      }
      let o = n.mcp.clients[r];
      if (!o || o.type !== "connected") {
        return n;
      }
      let s = [...n.mcp.clients];
      s[r] = {
        name: e,
        type: "needs-auth",
        config: o.config
      };
      return {
        ...n,
        mcp: {
          ...n.mcp,
          clients: s
        }
      };
    });
  }
  function L3a(e) {
    if (e instanceof hht) {
      return true;
    }
    if (e instanceof yi) {
      return false;
    }
    let t = "code" in e ? e.code : undefined;
    if (t === 404) {
      return !(e instanceof sEe && e.message.includes("Failed to open SSE stream"));
    }
    return t === 400 && /Server not initialized|No valid session ID|Mcp-Session-Id header is required/i.test(e.message);
  }
  function m3p(e) {
    if (e.name === "AbortError") {
      return true;
    }
    let t = e.message;
    return t.includes("ECONNRESET") || t.includes("ETIMEDOUT") || t.includes("EPIPE") || t.includes("EHOSTUNREACH") || t.includes("ECONNREFUSED") || t.includes("Body Timeout Error") || /\bterminated\b/.test(t) || t.includes("SSE stream disconnected") || t.includes("Failed to reconnect SSE stream");
  }
  function g3p(e) {
    if (C5t(e)) {
      return false;
    }
    if (e instanceof DOMException && e.name === "TimeoutError") {
      return false;
    }
    if (e instanceof Error && !(e instanceof yi) && "code" in e && typeof e.code === "number" && e.code >= 400 && e.code < 500) {
      return false;
    }
    if (e instanceof yi) {
      return e.code !== Ei.RequestTimeout && e.code !== Ei.MethodNotFound && e.code !== Ei.InvalidRequest && e.code !== Ei.InvalidParams;
    }
    return true;
  }
  async function kGn(e, t, n, r, o) {
    let s = false;
    for (let i = 0;; i++) {
      let a = [];
      let l;
      let c = 0;
      let u = false;
      try {
        do {
          let d = await e.request({
            method: n,
            ...(l && {
              params: {
                cursor: l
              }
            })
          }, r, {
            timeout: ez()
          });
          c++;
          let p = o(d);
          if (p) {
            a.push(...p);
          }
          if (l = d.nextCursor, l && c >= 20) {
            u = true;
            break;
          }
        } while (l);
        if (u) {
          dn(t, `${n} still returning nextCursor after ${20} pages; stopping`);
        }
        if (c > 1) {
          R3a(n, c, a.length, u ? "capped" : "complete");
        }
        return a;
      } catch (d) {
        if (c > 0 && !s) {
          s = true;
          R3a(n, c, a.length, "error");
        }
        let p = h3p[i];
        if (p === undefined || !g3p(d)) {
          throw d;
        }
        dn(t, `${n} failed (${he(d)}); retrying in ${p}ms`);
        await sleep(p);
      }
    }
  }
  function R3a(e, t, n, r) {
    logEvent("tengu_mcp_list_paginated", {
      method: e,
      pageCount: t,
      itemCount: n,
      outcome: r
    });
  }
  function U3a(e) {
    let t = parseInt(process.env.MCP_TOOL_TIMEOUT || "", 10);
    let r = (e?.timeout !== undefined && e.timeout >= 1000 ? e.timeout : undefined) ?? (t > 0 ? t : undefined) ?? 1e8;
    return Math.min(Math.max(r, 1000), 2147483647);
  }
  function b3p(e) {
    if (!_3p.vZc(e?.type ?? "")) {
      return 0;
    }
    let t = Me.CLAUDE_CODE_MCP_TOOL_IDLE_TIMEOUT ?? 300000;
    if (t <= 0) {
      return 0;
    }
    return Math.min(Math.max(t, 1000), U3a(e));
  }
  function IGn() {
    return AGn.join(er(), "mcp-needs-auth-cache.json");
  }
  function KTo() {
    if (!mht) {
      mht = Ys().read(IGn()).then(e => qt(e)).catch(() => ({}));
    }
    return mht;
  }
  async function x3a(e, t) {
    let r = (await KTo())[e];
    if (!r) {
      return false;
    }
    if (t.type === "claudeai-proxy" && r.id !== t.id) {
      return false;
    }
    if ((t.type === "stdio" || t.type === undefined) && t.pluginSource === undefined) {
      return false;
    }
    if ((t.type === "stdio" || t.type === undefined) && t.pluginSource !== undefined && r.id !== cNe(t)) {
      return false;
    }
    if ((t.type === "http" || t.type === "sse") && t.pluginSource !== undefined && r.id !== undefined) {
      return false;
    }
    let s = t.type === "claudeai-proxy" || t.pluginSource !== undefined && (t.type === "http" || t.type === "sse") && !jIn(t) ? 14400000 : 900000;
    return Date.now() - r.timestamp < s;
  }
  function YTo(e, t) {
    RGn = RGn.then(async () => {
      let n = await KTo();
      n[e] = {
        timestamp: Date.now(),
        ...(t && {
          id: t
        })
      };
      let r = Ys();
      let o = IGn();
      await r.mkdir(AGn.dirname(o));
      await r.write(o, De(n));
      mht = null;
    }).catch(() => {});
  }
  function H5t(e) {
    let t = RGn.then(async () => {
      let n = await KTo();
      if (!(e in n)) {
        return;
      }
      delete n[e];
      await Ys().write(IGn(), De(n));
      mht = null;
    }).catch(() => {});
    RGn = t;
    return t;
  }
  function WWn() {
    mht = null;
    Ys().delete(IGn()).catch(() => {});
  }
  function Spe(e) {
    let t = u9(e);
    return t ? {
      mcpServerBaseUrl: t
    } : {};
  }
  function jTo(e, t, n) {
    let r = bh();
    let o = t.pluginSource ? Yo(t.pluginSource) : undefined;
    let s = o && (hOe(kGe(o.name, o.marketplace, null)) || r);
    su("mcp_server_connection", {
      status: n.status,
      transport_type: t.type ?? "stdio",
      server_scope: t.scope,
      duration_ms: String(Math.round(n.durationMs)),
      is_plugin: o !== undefined,
      ...(o && {
        plugin_id_hash: PSe(o.name, o.marketplace),
        "plugin.name": s ? o.name : "third-party"
      }),
      ...(n.errorCode && {
        error_code: n.errorCode
      }),
      ...(r && {
        server_name: e,
        ...(n.error && {
          error: n.error
        })
      })
    });
  }
  function qTo(e, t, n, r) {
    let o = r instanceof ZodError_export;
    let s = o ? r.issues[0] : undefined;
    let i = s ? `Server OAuth metadata invalid: ${s.path.join(".") || "(root)"} \u2014 ${s.message}` : undefined;
    logEvent("tengu_mcp_server_needs_auth", {
      transportType: n,
      ...(o && {
        cause: "discovery_schema"
      }),
      ...Spe(t)
    });
    dn(e, `Authentication required for ${{
      sse: "SSE",
      http: "HTTP",
      "claudeai-proxy": "claude.ai proxy"
    }[n]} server`);
    YTo(e, t.type === "claudeai-proxy" ? t.id : undefined);
    Et("mcp_connect", "mcp_connect_needs_auth");
    return {
      name: e,
      type: "needs-auth",
      config: t,
      error: i
    };
  }
  function k3a(e, t, n, r) {
    let o = `Server rejected the configured Authorization header (HTTP ${r ?? 401}). ` + "Check that the token is valid for this MCP endpoint \u2014 OAuth fallback is " + "disabled when headers.Authorization is set.";
    logEvent("tengu_mcp_server_connection_failed", {
      transportType: n,
      errorCode: "AUTH_HEADER_REJECTED",
      ...Spe(t)
    });
    Et("mcp_connect", "mcp_connect_auth_header_rejected");
    uu(e, o);
    return {
      name: e,
      type: "failed",
      config: t,
      error: o,
      errorCode: "AUTH_HEADER_REJECTED"
    };
  }
  function A3a(e, t, n, r) {
    let o = "api.anthropic.com";
    try {
      if ("url" in t) {
        o = new URL(t.url).host;
      }
    } catch {}
    let s = !getClaudeAIOAuthTokens()?.accessToken && bEe();
    let i;
    if (s) {
      i = r === 403 ? `${o} rejected your /design-login credential (HTTP 403). Your ` + "token may be missing a scope this server needs \u2014 run /design-login " + "to re-authorize it, or check that your account has access." : `${o} rejected your /design-login credential (HTTP ${r ?? 401}). Run /design-login to re-authorize it.`;
    } else {
      i = r === 403 ? `${o} rejected your claude.ai login (HTTP 403). Your token may be ` + `missing a scope this server needs \u2014 run ${"/login"} and retry, or check that your account has access.` : `${o} rejected your claude.ai login (HTTP ${r ?? 401}). Run /login and retry.`;
    }
    logEvent("tengu_mcp_server_connection_failed", {
      transportType: n,
      errorCode: "FIRST_PARTY_AUTH_REJECTED",
      ...Spe(t)
    });
    Et("mcp_connect", "mcp_connect_first_party_auth_rejected");
    uu(e, i);
    return {
      name: e,
      type: "failed",
      config: t,
      error: i,
      errorCode: "FIRST_PARTY_AUTH_REJECTED"
    };
  }
  function w3p(e) {
    return async (t, n) => {
      let r = new Headers(n?.headers);
      if (!r.vZc("Authorization")) {
        let o = cT();
        if (o) {
          r.set("Authorization", `Bearer ${o}`);
        }
      }
      return e(t, {
        ...n,
        headers: r
      });
    };
  }
  function C3p(e) {
    return async (t, n) => {
      let r = async () => {
        await checkAndRefreshOAuthTokenIfNeeded();
        let c = getClaudeAIOAuthTokens();
        if (!c) {
          throw Error("No claude.ai OAuth token available");
        }
        let u = new Headers(n?.headers);
        u.set("Authorization", `Bearer ${c.accessToken}`);
        return {
          response: await e(t, {
            ...n,
            headers: u
          }),
          sentToken: c.accessToken
        };
      };
      async function o(c) {
        if (c.status >= 400 && c.headers.get("content-type")?.includes("text/event-stream")) {
          let u = await c.text();
          let d = u.split(`
`).find(p => p.startsWith("data: "));
          return new Response(d ? d.slice(6) : u, {
            status: c.status,
            statusText: c.statusText,
            headers: c.headers
          });
        }
        return c;
      }
      let {
        response: s,
        sentToken: i
      } = await r();
      if (s.status !== 401) {
        return o(s);
      }
      let a = s.headers.get("X-Mcp-Error-Code") ?? undefined;
      if (a) {
        logEvent("tengu_mcp_claudeai_proxy_401", {
          tokenChanged: false,
          proxyErrorCode: a
        });
        return s;
      }
      let l = await handleOAuth401Error(i).catch(() => false);
      if (logEvent("tengu_mcp_claudeai_proxy_401", {
        tokenChanged: l
      }), !l) {
        let c = getClaudeAIOAuthTokens()?.accessToken;
        if (!c || c === i) {
          return s;
        }
      }
      try {
        return o((await r()).response);
      } catch {
        return s;
      }
    };
  }
  async function R3p(e) {
    if (new URL(e).pathname.startsWith("/v1/design/")) {
      let t = await kqa()?.();
      if (t?.ok) {
        if (t.expanded) {
          Iqa("Added user:design:read and user:design:write to your claude.ai login (for the Design MCP connector).");
          logEvent("tengu_mcp_first_party_scope_expanded", {
            pathPrefix: "/v1/design/"
          });
        }
        return t.accessToken;
      }
    }
    await checkAndRefreshOAuthTokenIfNeeded();
    return getClaudeAIOAuthTokens()?.accessToken;
  }
  function WTo(e) {
    return async (t, n) => {
      if (new Headers(n?.headers).vZc("Authorization") || !M8(t) || !isFirstPartyProvider()) {
        return e(t, n);
      }
      let o = async () => {
        let l = await R3p(t);
        if (!l) {
          return {
            response: await e(t, n),
            sentToken: undefined
          };
        }
        let c = {
          ...Object.fromEntries(new Headers(n?.headers)),
          Authorization: `Bearer ${l}`
        };
        return {
          response: await e(t, {
            ...n,
            headers: c
          }),
          sentToken: l
        };
      };
      let {
        response: s,
        sentToken: i
      } = await o();
      if (s.status !== 401 || !i) {
        return s;
      }
      if (!(await handleOAuth401Error(i).catch(() => false))) {
        let l = getClaudeAIOAuthTokens()?.accessToken;
        if (!l || l === i) {
          return s;
        }
      }
      try {
        return (await o()).response;
      } catch {
        return s;
      }
    };
  }
  function x3p(e, t, n) {
    let r = new Headers({
      "User-Agent": getMCPUserAgent(),
      "Accept-Encoding": "identity",
      ...t
    });
    new Headers(e).forEach((o, s) => r.set(s, o));
    for (let [o, s] of Object.entries(n)) {
      r.set(o, s);
    }
    r.set("Accept", "text/event-stream");
    return r;
  }
  function I3a(e) {
    if (!e) {
      return false;
    }
    let t = ii(e, ";").trim().toLowerCase();
    return k3p.vZc(t === "image/jpg" ? "image/jpeg" : t);
  }
  function B3a(e) {
    let t = parseInt(process.env.MCP_TOOL_TIMEOUT || "", 10);
    let r = (e?.timeout !== undefined && e.timeout >= 1000 ? e.timeout : undefined) ?? (t > 0 ? t : undefined);
    return r !== undefined ? Math.min(Math.max(r, 60000), 2147483647) : 60000;
  }
  function CGn(e, t) {
    let n = B3a(t);
    return async (r, o) => {
      if ((o?.method ?? "GET").toUpperCase() === "GET") {
        return e(r, o);
      }
      let i = new Headers(o?.headers);
      if (!i.vZc("accept")) {
        i.set("accept", "application/json, text/event-stream");
      }
      if (shouldPropagateTraceContext()) {
        let u = aqn();
        if (u && !i.vZc("traceparent")) {
          i.set("traceparent", u);
        }
      }
      let a = new AbortController();
      let l = setTimeout(u => u.abort(new DOMException("The operation timed out.", "TimeoutError")), n, a);
      l.unref?.();
      let c = o?.signal;
      if (c?.aborted) {
        a.abort(c.reason);
      } else {
        c?.addEventListener("abort", () => a.abort(c.reason), {
          once: true
        });
      }
      try {
        return await e(r, {
          ...o,
          headers: i,
          signal: a.signal
        });
      } finally {
        clearTimeout(l);
      }
    };
  }
  function ght() {
    let e = parseInt(process.env.MCP_SERVER_CONNECTION_BATCH_SIZE || "", 10);
    return e > 0 ? e : 3;
  }
  function PGn() {
    let e = parseInt(process.env.MCP_REMOTE_SERVER_CONNECTION_BATCH_SIZE || "", 10);
    return e > 0 ? e : 20;
  }
  function B5t(e) {
    return !e.type || e.type === "stdio" || e.type === "sdk";
  }
  function P3p(e) {
    return !e.name.startsWith("mcp__ide__") || I3p.includes(e.name);
  }
  function O3p(e) {
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_normalize_root_combinators", []);
    if (!Array.isArray(t) || t.length === 0) {
      return false;
    }
    if (t.includes("*")) {
      return true;
    }
    if (!("url" in e) || typeof e.url !== "string") {
      return false;
    }
    try {
      let n = new URL(e.url).hostname.toLowerCase();
      return t.some(r => {
        if (typeof r !== "string" || r === "") {
          return false;
        }
        let o = r.toLowerCase();
        return n === o || n.endsWith(`.${o}`);
      });
    } catch {
      return false;
    }
  }
  function W6e(e, t) {
    return `${e}-${cNe(t)}`;
  }
  function D3p() {
    return {
      roots: [{
        uri: M3a.pathToFileURL(getOriginalCwd()).href
      }]
    };
  }
  async function Ow(e, t) {
    let n = W6e(e, t);
    let r = kM.cache?.get?.(n);
    if (r) {
      try {
        let o = await r;
        if (o.type === "connected") {
          await o.cleanup();
        }
      } catch {}
    }
    if (kM.cache?.delete?.(n), AM.cache.delete(e), n3.cache.delete(e), ype.cache.delete(e), yQ.cache.delete(e), nA()) {
      fht.cache.delete(e);
    }
  }
  async function iEe(e) {
    if (e.config.type === "sdk") {
      return e;
    }
    let t = await kM(e.name, e.config);
    if (t.type !== "connected") {
      throw new Po(`MCP server "${e.name}" is not connected`, "MCP server not connected");
    }
    return t;
  }
  function V6e(e, t) {
    return cNe(e) === cNe(t);
  }
  function N3p(e, t) {
    let n = Object.keys(e);
    if (n.length === 0) {
      return t;
    }
    return n.map(r => {
      let o = e[r];
      let s = typeof o === "object" && o !== null ? JSON.stringify(o) : String(o);
      return `${r}=${s}`;
    }).join(" ");
  }
  function $3a(e, t) {
    let n = [];
    for (let r of e) {
      if (r.type !== "connected") {
        continue;
      }
      if (r.name in t) {
        continue;
      }
      n.push(ype(r).then(o => ({
        client: r,
        templates: o
      })));
    }
    return Promise.all(n);
  }
  async function H3a(e, t, n, r, o) {
    if (!e.capabilities?.completions) {
      return [];
    }
    try {
      let s = await e.client.complete({
        ref: {
          type: "ref/resource",
          uri: t
        },
        argument: {
          name: n,
          value: r
        },
        context: Object.keys(o).length > 0 ? {
          arguments: o
        } : undefined
      });
      Pe("mcp_complete_resource_template");
      return s.completion.values;
    } catch (s) {
      Ae("mcp_complete_resource_template", "mcp_complete_resource_template_failed");
      dn(e.name, `Failed to complete resource template: ${he(s)}`);
      return [];
    }
  }
  async function Uoe(e, t, n) {
    return (await QTo({
      client: n,
      tool: e,
      args: t,
      signal: createAbortController().signal,
      imageLimits: iV,
      idleTimeoutMs: 0
    })).content;
  }
  async function pQ(e, t) {
    try {
      m_e();
      await Ow(e, t);
      let n = await kM(e, t);
      if (n.type === "needs-auth") {
        dn(e, "Reconnect returned 'needs-auth'; retrying once after cache clear");
        let u = W6e(e, t);
        kM.cache?.delete?.(u);
        n = await kM(e, t);
      }
      if (n.type !== "connected") {
        Et("mcp_reconnect", "mcp_reconnect_not_connected");
        return {
          client: n,
          tools: [],
          commands: []
        };
      }
      if (H5t(e), t.type === "http" || t.type === "sse") {
        await NSo(e, t);
      }
      let r = !!n.capabilities?.resources;
      let [o, s, i, a] = await Promise.all([AM(n), yQ(n), nA() && r ? fht(n) : Promise.resolve([]), r ? n3(n) : Promise.resolve([])]);
      if (n.discoveryAuthFailure) {
        Et("mcp_reconnect", "mcp_reconnect_needs_auth_discovery");
        return {
          client: {
            name: e,
            type: "needs-auth",
            config: t
          },
          tools: [],
          commands: []
        };
      }
      if (t.type === "claudeai-proxy") {
        _So(e);
      }
      let l = [...s, ...i];
      let c = [];
      if (r) {
        if (![tQ, fQ].some(d => o.some(p => bl(p, d.name)))) {
          c.push(tQ, fQ, _Ee);
        }
      }
      Pe("mcp_reconnect");
      return {
        client: n,
        tools: [...o, ...c],
        commands: l,
        resources: a.length > 0 ? a : undefined,
        resourceTemplates: []
      };
    } catch (n) {
      Ae("mcp_reconnect", "mcp_reconnect_failed");
      uu(e, `Error during reconnection: ${he(n)}`);
      return {
        client: {
          name: e,
          type: "failed",
          config: t
        },
        tools: [],
        commands: []
      };
    }
  }
  async function O3a(e, t, n) {
    await uV(e, n, {
      concurrency: t
    });
  }
  async function j3a(e, t) {
    if (e.length === 0) {
      return 0;
    }
    let n;
    let r = new Promise(o => {
      n = setTimeout(s => s("deadline"), t, o);
    });
    try {
      let o = await Promise.all(e.map(s => Promise.race([s.then(() => "settled", () => "settled"), r])));
      return Bn(o, s => s === "deadline");
    } finally {
      clearTimeout(n);
    }
  }
  async function z6e(e, t) {
    let n = false;
    let r = Object.entries(t ?? (await getAllMcpConfigs()).servers);
    let o = [];
    for (let g of r) {
      if (isMcpServerDisabled(g[0])) {
        e({
          client: {
            name: g[0],
            type: "disabled",
            config: g[1]
          },
          tools: [],
          commands: []
        });
      } else {
        o.push(g);
      }
    }
    let s = o.length;
    let i = Bn(o, ([g, y]) => y.type === "stdio");
    let a = Bn(o, ([g, y]) => y.type === "sse");
    let l = Bn(o, ([g, y]) => y.type === "http");
    let c = Bn(o, ([g, y]) => y.type === "sse-ide");
    let u = Bn(o, ([g, y]) => y.type === "ws-ide");
    let d = o.filter(([g, y]) => B5t(y));
    let p = o.filter(([g, y]) => !B5t(y));
    let m = {
      totalServers: s,
      stdioCount: i,
      sseCount: a,
      httpCount: l,
      sseIdeCount: c,
      wsIdeCount: u
    };
    let f = [];
    let h = async ([g, y]) => {
      try {
        if (isMcpServerDisabled(g)) {
          e({
            client: {
              name: g,
              type: "disabled",
              config: y
            },
            tools: [],
            commands: []
          });
          return;
        }
        if ((y.type === "claudeai-proxy" || y.type === "http" || y.type === "sse") && ((await x3a(g, y)) || (y.type === "http" || y.type === "sse") && WIn(g, y, await HIn()))) {
          if (y.type !== "claudeai-proxy" && y.pluginSource === undefined) {
            dn(g, "Skipping connection (cached needs-auth)");
          }
          e({
            client: {
              name: g,
              type: "needs-auth",
              config: y
            },
            tools: qWn(g, y),
            commands: []
          });
          return;
        }
        if ((y.type === "stdio" || y.type === undefined) && y.pluginSource !== undefined && (await x3a(g, y))) {
          e({
            client: {
              name: g,
              type: "failed",
              config: y,
              error: "Skipping connection (recent failure cached; retries automatically in 15 min, or edit the plugin config to retry now)"
            },
            tools: [],
            commands: []
          });
          return;
        }
        let _ = await kM(g, y, m);
        if (_.type !== "connected") {
          e({
            client: _,
            tools: _.type === "needs-auth" ? qWn(g, y) : [],
            commands: []
          });
          return;
        }
        if (H5t(g), y.type === "http" || y.type === "sse") {
          await NSo(g, y);
        }
        f.push((async () => {
          try {
            let b = !!_.capabilities?.resources;
            let [S, E, C, x] = await Promise.all([AM(_), yQ(_), nA() && b ? fht(_) : Promise.resolve([]), b ? n3(_) : Promise.resolve([])]);
            if (_.discoveryAuthFailure) {
              e({
                client: {
                  name: g,
                  type: "needs-auth",
                  config: y
                },
                tools: qWn(g, y),
                commands: []
              });
              return;
            }
            if (y.type === "claudeai-proxy") {
              _So(g);
            }
            let A = [...E, ...C];
            let k = [];
            if (b && !n) {
              n = true;
              k.push(tQ, fQ, _Ee);
            }
            e({
              client: _,
              tools: [...S, ...k],
              commands: A,
              resources: x.length > 0 ? x : undefined,
              resourceTemplates: undefined
            });
          } catch (b) {
            uu(g, `Error fetching tools/commands/resources: ${he(b)}`);
            e({
              client: {
                name: g,
                type: "failed",
                config: y
              },
              tools: [],
              commands: []
            });
          }
        })());
      } catch (_) {
        uu(g, `Error fetching tools/commands/resources: ${he(_)}`);
        e({
          client: {
            name: g,
            type: "failed",
            config: y
          },
          tools: [],
          commands: []
        });
      }
    };
    await Promise.all([O3a(d, ght(), h), O3a(p, PGn(), h)]);
    await Promise.all(f);
  }
  function j5t(e) {
    return new Promise(t => {
      let n = 0;
      let r = 0;
      if (n = Object.keys(e).length, n === 0) {
        t({
          clients: [],
          tools: [],
          commands: []
        });
        return;
      }
      let o = [];
      let s = [];
      let i = [];
      z6e(a => {
        if (o.push(a.client), s.push(...a.tools), i.push(...a.commands), r++, r >= n) {
          let l = i.reduce((c, u) => {
            let d = u.name.length + (u.description ?? "").length + (u.argumentHint ?? "").length;
            return c + d;
          }, 0);
          logEvent("tengu_mcp_tools_commands_loaded", {
            tools_count: s.length,
            commands_count: i.length,
            commands_metadata_length: l
          });
          t({
            clients: o,
            tools: s,
            commands: i
          });
        }
      }, e).catch(a => {
        uu("prefetchAllMcpResources", `Failed to get MCP resources: ${he(a)}`);
        t({
          clients: [],
          tools: [],
          commands: []
        });
      });
    });
  }
  async function zTo(e, t, n, r = false) {
    switch (e.type) {
      case "text":
        {
          let o = {
            type: "text",
            text: e.text
          };
          if (r) {
            let s = e._meta;
            if (s) {
              o._meta = s;
            }
          }
          return [o];
        }
      case "audio":
        {
          let o = e;
          return await VTo(Buffer.from(o.data, "base64"), o.mimeType, t, `[Audio from ${t}] `);
        }
      case "image":
        {
          if (I3a(e.mimeType)) {
            let {
              block: o
            } = await f1({
              data: String(e.data),
              mediaType: e.mimeType,
              limits: n
            });
            return [o];
          }
          return await VTo(Buffer.from(String(e.data), "base64"), e.mimeType, t, `[Image from ${t}] `);
        }
      case "resource":
        {
          let o = e.resource;
          let s = `[Resource from ${t} at ${o.uri}] `;
          if ("text" in o) {
            return [{
              type: "text",
              text: `${s}${o.text}`
            }];
          } else if ("blob" in o) {
            if (I3a(o.mimeType)) {
              let {
                block: a
              } = await f1({
                data: o.blob,
                mediaType: o.mimeType,
                limits: n
              });
              let l = [];
              if (s) {
                l.push({
                  type: "text",
                  text: s
                });
              }
              l.push(a);
              return l;
            } else {
              return await VTo(Buffer.from(o.blob, "base64"), o.mimeType, t, s);
            }
          }
          return [];
        }
      case "resource_link":
        {
          let o = e;
          let s = `[Resource link: ${o.name}] ${o.uri}`;
          if (o.description) {
            s += ` (${o.description})`;
          }
          return [{
            type: "text",
            text: s
          }];
        }
      default:
        return [];
    }
  }
  async function VTo(e, t, n, r) {
    let o = `mcp-${Bl(n)}-blob-${Date.now()}-${Math.random().toString(36).slice(2, 8)}`;
    let s = await persistBinaryContent(e, t, o);
    if ("error" in s) {
      return [{
        type: "text",
        text: `${r}Binary content (${t || "unknown type"}, ${e.length} bytes) could not be saved to disk: ${s.error}`
      }];
    }
    return [{
      type: "text",
      text: getBinaryBlobSavedMessage(s.filepath, t, s.size, r)
    }];
  }
  function U5t(e, t = 2) {
    if (e === null) {
      return "null";
    }
    if (Array.isArray(e)) {
      if (e.length === 0) {
        return "[]";
      }
      return `[${U5t(e[0], t - 1)}]`;
    }
    if (typeof e === "object") {
      if (t <= 0) {
        return "{...}";
      }
      let r = Object.entries(e).slice(0, 10).map(([s, i]) => `${s}: ${U5t(i, t - 1)}`);
      let o = Object.keys(e).length > 10 ? ", ..." : "";
      return `{${r.join(", ")}${o}}`;
    }
    return typeof e;
  }
  async function L3p(e, t, n, r) {
    if (e && typeof e === "object") {
      if ("toolResult" in e) {
        return {
          content: String(e.toolResult),
          type: "toolResult"
        };
      }
      if ("structuredContent" in e && e.structuredContent !== undefined) {
        let s = De(e.structuredContent);
        let i = U5t(e.structuredContent);
        if ("content" in e && Array.isArray(e.content)) {
          let a = e.content.filter(l => l && typeof l === "object" && "type" in l && l.type !== "text");
          if (a.length > 0) {
            let l = (await Promise.all(a.map(c => zTo(c, n, r, true)))).flat();
            if (l.length > 0) {
              let c = [...l, {
                type: "text",
                text: s
              }];
              return {
                content: c,
                type: "contentArray",
                schema: U5t(oft(c))
              };
            }
          }
        }
        return {
          content: s,
          type: "structuredContent",
          schema: i
        };
      }
      if ("content" in e && Array.isArray(e.content)) {
        let s = (await Promise.all(e.content.map(i => zTo(i, n, r, true)))).flat();
        return {
          content: s,
          type: "contentArray",
          schema: U5t(oft(s))
        };
      }
    }
    let o = `MCP server "${n}" tool "${t}": unexpected response format`;
    throw uu(n, o), new Po(o, "MCP tool unexpected response format");
  }
  function D3a(e) {
    if (!e || typeof e === "string") {
      return false;
    }
    return e.some(t => t.type === "image");
  }
  async function F3p(e, t, n, r, o = false) {
    let {
      content: s,
      type: i,
      schema: a
    } = await L3p(e, t, n, r);
    if (n === "ide") {
      return s;
    }
    if (o && !D3a(s)) {
      return s;
    }
    if (!(await c_o(s))) {
      return s;
    }
    let l = d9t(s);
    if (Pl(process.env.ENABLE_MCP_LARGE_OUTPUT_FILES)) {
      logEvent("tengu_mcp_large_result_handled", {
        outcome: "truncated",
        reason: "env_disabled",
        sizeEstimateTokens: l
      });
      return await p9t(s);
    }
    if (!s) {
      return s;
    }
    if (D3a(s)) {
      logEvent("tengu_mcp_large_result_handled", {
        outcome: "truncated",
        reason: "contains_images",
        sizeEstimateTokens: l
      });
      return await p9t(s);
    }
    let c = Date.now();
    let u = `mcp-${Bl(n)}-${Bl(t)}-${c}`;
    let d = oft(s);
    let p = isSubagentTruncationPromptEnabled() || getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_singleton_unwrap", true);
    let m = Array.isArray(d) ? d.length : undefined;
    let f = p && Array.isArray(d) && d.length === 1 && d[0]?.type === "text" && !("annotations" in d[0]) && !("_meta" in d[0]) ? d[0].text : undefined;
    let h = typeof d === "string" ? d : f ?? De(d, null, 2);
    let g = i === "toolResult" || f !== undefined;
    let y = g ? "text" : "json";
    let _;
    if (g) {
      let E = h.split(`
`);
      if (E.length > 1 && E.at(-1) === "") {
        E.pop();
      }
      let C = 0;
      for (let x of E) {
        if (x.length > C) {
          C = x.length;
        }
      }
      _ = {
        count: E.length,
        maxLen: C
      };
    }
    let b = await gMe(h, u);
    if (_Me(b)) {
      let E = h.length;
      logEvent("tengu_mcp_large_result_handled", {
        outcome: "truncated",
        reason: "persist_failed",
        sizeEstimateTokens: l
      });
      return `Error: result (${E.toLocaleString()} characters) exceeds maximum allowed tokens. Failed to save output to file: ${b.error}. If this MCP server provides pagination or filtering tools, use them to retrieve specific portions of the data.`;
    }
    logEvent("tengu_mcp_large_result_handled", {
      outcome: "persisted",
      reason: "file_saved",
      sizeEstimateTokens: l,
      persistedSizeChars: b.originalSize,
      resultType: i,
      blockCount: m,
      persistedAs: y
    });
    let S = f !== undefined ? getFormatDescription("toolResult") : getFormatDescription(i, a);
    return getLargeOutputInstructions(b.filepath, b.originalSize, S, undefined, _);
  }
  function JTo(e) {
    let t = e.data;
    return (t != null && typeof t === "object" && "elicitations" in t && Array.isArray(t.elicitations) ? t.elicitations : []).filter(r => A0r.safeParse(r).success);
  }
  async function XTo({
    client: e,
    clientConnection: t,
    tool: n,
    args: r,
    meta: o,
    signal: s,
    setAppState: i,
    onProgress: a,
    callToolFn: l = QTo,
    requestDialog: c,
    hasResultSizeAnnotation: u = false,
    imageLimits: d,
    toolExecution: p,
    taskRegistry: m,
    toolUseId: f,
    onAwaitingUserInput: h
  }) {
    for (let y = 0;; y++) {
      try {
        let _ = () => l({
          client: e,
          tool: n,
          args: r,
          meta: o,
          signal: s,
          onProgress: a,
          hasResultSizeAnnotation: u,
          imageLimits: d,
          toolExecution: p,
          taskRegistry: m,
          toolUseId: f
        });
        if (!Gde()) {
          return await _();
        }
        let b;
        try {
          b = yM(De(r)).content;
        } catch {
          b = undefined;
        }
        return await z0a("claude_code.mcp.rpc", {
          spanType: "mcp.rpc",
          attrs: {
            "rpc.system": "mcp",
            "rpc.service": e.name,
            "rpc.method": "tools/call",
            mcp_tool: n,
            attempt: y,
            ...(b !== undefined && {
              mcp_args: b
            })
          },
          isExpectedError: S => S instanceof yi && S.code === Ei.UrlElicitationRequired
        }, _);
      } catch (_) {
        if (!(_ instanceof yi) || _.code !== Ei.UrlElicitationRequired) {
          throw _;
        }
        if (y >= 3) {
          throw _;
        }
        let b = JTo(_);
        let S = t.type === "connected" ? t.name : "unknown";
        if (b.length === 0) {
          throw dn(S, `Tool '${n}' returned -32042 but no valid elicitations in error data`), _;
        }
        dn(S, `Tool '${n}' requires URL elicitation (error -32042, attempt ${y + 1}), processing ${b.length} elicitation(s)`);
        for (let E of b) {
          let {
            elicitationId: C
          } = E;
          let x = await T5t(S, E, s);
          if (x) {
            if (dn(S, `URL elicitation ${C} resolved by hook: ${De(x)}`), x.action !== "accept") {
              return {
                content: `URL elicitation was ${x.action === "decline" ? "declined" : x.action + "ed"} by a hook. The tool "${n}" could not complete because it requires the user to open a URL.`,
                urlElicitationDeclined: {
                  url: E.url
                },
                isError: true
              };
            }
            continue;
          }
          let A;
          h?.(true);
          try {
            A = c ? await c(rft, {
              serverName: S,
              params: E
            }, {
              signal: s
            }) : {
              action: "cancel"
            };
          } finally {
            h?.(false);
          }
          let k = await E5t(S, A, s, "url", C);
          if (k.action !== "accept") {
            dn(S, `User ${k.action === "decline" ? "declined" : k.action + "ed"} URL elicitation ${C}`);
            return {
              content: `URL elicitation was ${k.action === "decline" ? "declined" : k.action + "ed"} by the user. The tool "${n}" could not complete because it requires the user to open a URL.`,
              urlElicitationDeclined: {
                url: E.url
              },
              isError: true
            };
          }
          dn(S, `Elicitation ${C} completed, retrying tool call`);
        }
      }
    }
  }
  function U3p(e, t) {
    if (!e.isError) {
      return;
    }
    let n = "Unknown error";
    if (Array.isArray(e.content) && e.content.length > 0) {
      let r = e.content.flatMap(o => {
        if (o == null || typeof o !== "object") {
          return [];
        }
        if ("text" in o) {
          return [String(o.text)];
        }
        if (o.type === "resource_link") {
          let s = o;
          let i = `[Resource link: ${s.name}] ${s.uri}`;
          if (s.description) {
            i += ` (${s.description})`;
          }
          return [i];
        }
        return [];
      });
      if (r.length > 0) {
        n = r.join(`
`);
      }
    } else if ("error" in e) {
      n = String(e.error);
    }
    throw uu(t, n), new $5t(n, "MCP tool returned error", e._meta ? {
      _meta: e._meta
    } : undefined);
  }
  async function QTo({
    client: {
      client: e,
      name: t,
      config: n,
      transportErrorState: r
    },
    tool: o,
    args: s,
    meta: i,
    signal: a,
    onProgress: l,
    hasResultSizeAnnotation: c = false,
    imageLimits: u,
    toolExecution: d,
    taskRegistry: p,
    toolUseId: m,
    idleTimeoutMs: f,
    isAuthRetry: h = false
  }) {
    let g = Date.now();
    let y;
    let _ = {
      armedAt: 0
    };
    r?.activeCallWatchdogs.add(_);
    try {
      dn(t, `Calling MCP tool: ${o}`);
      let b = f ?? b3p(n);
      let S = g;
      let E;
      let C = new Promise((H, U) => {
        E = U;
      });
      y = setInterval(() => {
        let H = Math.floor((Date.now() - g) / 1000);
        if (dn(t, `Tool '${o}' still running (${H}s elapsed)`), _.armedAt > 0 && Date.now() - _.armedAt > 90000) {
          dn(t, `Tool '${o}' aborting: transport error ${Math.floor((Date.now() - _.armedAt) / 1000)}s ago, response presumed lost`);
          E(new Po(`MCP server "${t}" transport dropped mid-call; response for tool "${o}" was lost`, "MCP transport lost mid-call"));
          return;
        }
        if (r?.pendingElicitations) {
          S = Date.now();
        } else if (r && r.lastElicitationClosedAt > S) {
          S = r.lastElicitationClosedAt;
        }
        if (b > 0 && Date.now() - S > b) {
          let U = Math.floor((Date.now() - S) / 1000);
          dn(t, `Tool '${o}' aborting: no response or progress notification for ${U}s (idle timeout ${Math.floor(b / 1000)}s)`);
          E(new Po(`MCP server "${t}" tool "${o}" sent no response or progress for ${U}s; aborting. Set CLAUDE_CODE_MCP_TOOL_IDLE_TIMEOUT (ms) higher or to 0 if this tool is expected to run silently for longer.`, "MCP tool idle timeout"));
        }
      }, 30000);
      let x = U3a(n);
      let A;
      let k = new Promise((H, U) => {
        A = setTimeout((N, W, j, z) => {
          N(new Po(`MCP server "${W}" tool "${j}" timed out after ${Math.floor(z / 1000)}s`, "MCP tool timeout"));
        }, x, U, t, o, x);
      });
      let I = () => {
        if (A) {
          clearTimeout(A);
        }
        if (y !== undefined) {
          clearInterval(y);
          y = undefined;
        }
        r?.activeCallWatchdogs.delete(_);
      };
      let O = await Promise.race([e.callTool({
        name: o,
        arguments: s,
        _meta: i
      }, hj, {
        signal: a,
        timeout: x,
        onprogress: H => {
          if (_.armedAt = 0, S = Date.now(), l) {
            l({
              type: "mcp_progress",
              status: "progress",
              serverName: t,
              toolName: o,
              progress: H.progress,
              total: H.total,
              progressMessage: H.message
            });
          }
        }
      }), k, C]).finally(I);
      U3p(O, t);
      let M = Date.now() - g;
      let L = M < 1000 ? `${M}ms` : M < 60000 ? `${Math.floor(M / 1000)}s` : `${Math.floor(M / 60000)}m ${Math.floor(M % 60000 / 1000)}s`;
      dn(t, `Tool '${o}' completed successfully in ${L}`);
      let P = fAa(t);
      if (P) {
        logEvent("tengu_code_indexing_tool_used", {
          tool: P,
          source: "mcp",
          success: true
        });
      }
      return {
        content: await F3p(O, o, t, u, c),
        _meta: O._meta,
        structuredContent: O.structuredContent
      };
    } catch (b) {
      if (y !== undefined) {
        clearInterval(y);
      }
      r?.activeCallWatchdogs.delete(_);
      let S = Date.now() - g;
      if (b instanceof Error && b.name !== "AbortError") {
        dn(t, `Tool '${o}' failed after ${Math.floor(S / 1000)}s: ${b.message}`);
      }
      if (b instanceof Error) {
        let C = b instanceof yi ? undefined : "code" in b ? b.code : undefined;
        let x = (n.type === "http" || n.type === "sse" || n.type === "ws") && !!n.headersHelper;
        let A = C === 401 || b instanceof oO || C === 403 && x;
        if (x && !h) {
          let O = W6e(t, n);
          let M = GTo.get(O);
          let L = M !== undefined && b instanceof yi && b.code === Ei.ConnectionClosed;
          if (A || L) {
            if (dn(t, `Tool '${o}' returned ${C ?? 401}; re-running headersHelper and retrying once`), Et("mcp_headers_helper", "reauth_retry"), !M) {
              M = (async () => (await Ow(t, n), kM(t, n)))();
              GTo.set(O, M);
              M.finally(() => GTo.delete(O)).catch(() => {});
            }
            let P = await M;
            if (P.type === "connected") {
              return QTo({
                client: P,
                tool: o,
                args: s,
                meta: i,
                signal: a,
                onProgress: l,
                hasResultSizeAnnotation: c,
                imageLimits: u,
                toolExecution: d,
                taskRegistry: p,
                toolUseId: m,
                idleTimeoutMs: f,
                isAuthRetry: true
              });
            }
            dn(t, `headersHelper reconnect returned '${P.type}'; falling through to needs-auth`);
          }
        }
        if (A) {
          dn(t, "Tool call returned 401 Unauthorized - token may have expired");
          let O = Spe(n);
          throw logEvent("tengu_mcp_tool_call_auth_error", {
            errorCode: String(C ?? 401),
            transportType: n.type ?? "stdio",
            ...O,
            ...(xbe(t, n) && {
              mcpServerName: Bl(t),
              mcpToolName: Bl(o)
            })
          }), new G6e(t, `MCP server "${t}" requires re-authorization (token expired)`);
        }
        let k = L3a(b);
        let I = "code" in b && b.code === -32000 && b.message.includes("Connection closed") && (n.type === "http" || n.type === "claudeai-proxy");
        if (k || I) {
          dn(t, `MCP session expired during tool call (${k ? "stale session" : "connection closed"}), clearing connection cache for re-initialization`);
          let O = Spe(n);
          throw logEvent("tengu_mcp_session_expired", {
            errorCode: C !== undefined ? String(C) : undefined,
            transportType: n.type ?? "stdio",
            ...O,
            ...(xbe(t, n) && {
              mcpServerName: Bl(t),
              mcpToolName: Bl(o)
            })
          }), await Ow(t, n), new hht(t);
        }
      }
      let E = b;
      if (b instanceof ZodError_export || (E?.name === "ZodError" || E?.name === "$ZodError") && Array.isArray(E?.issues)) {
        throw new N3a(t, b);
      }
      if (!(b instanceof Error) || b.name !== "AbortError") {
        throw b;
      }
      return {
        content: undefined,
        isError: true
      };
    } finally {
      if (y !== undefined) {
        clearInterval(y);
      }
    }
  }
  function B3p(e) {
    if (e.message.content[0]?.type !== "tool_use") {
      return;
    }
    return e.message.content[0].id;
  }
  async function q3a(e, t) {
    let n = [];
    let r = [];
    let o = [];
    let s = await Promise.allSettled(Object.entries(e).map(async ([a, l]) => {
      let c = new pTo(a, t);
      let u = new J3n({
        name: "claude-code",
        title: "Claude Code",
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION ?? "unknown",
        description: "Anthropic's agentic coding tool",
        websiteUrl: "https://claude.com/claude-code"
      }, {
        capabilities: {}
      });
      try {
        await u.connect(c);
        let d = u.getServerCapabilities();
        let p = u.getInstructions();
        let m = p;
        if (p && p.length > 2048) {
          m = pC(p, 2048) + "\u2026 [truncated]";
          dn(a, `Server instructions truncated from ${p.length} to ${2048} chars`);
        }
        let f = {
          type: "connected",
          name: a,
          capabilities: d || {},
          instructions: m,
          client: u,
          config: {
            ...l,
            scope: "dynamic"
          },
          cleanup: async () => {
            await u.close();
          }
        };
        if (AM.cache.delete(a), nA()) {
          fht.cache.delete(a);
        }
        let h = [];
        if (d?.tools) {
          let y = await AM(f);
          h.push(...y);
        }
        let g = nA() && d?.resources ? await fht(f) : [];
        Pe("mcp_sdk_connect");
        return {
          client: f,
          tools: h,
          commands: g
        };
      } catch (d) {
        Ae("mcp_sdk_connect", "mcp_sdk_connect_failed");
        uu(a, `Failed to connect SDK MCP server: ${d}`);
        return {
          client: {
            type: "failed",
            name: a,
            config: {
              ...l,
              scope: "user"
            }
          },
          tools: [],
          commands: []
        };
      }
    }));
    for (let a of s) {
      if (a.status === "fulfilled") {
        n.push(a.value.client);
        r.push(...a.value.tools);
        o.push(...a.value.commands);
      }
    }
    if (n.some(a => a.type === "connected" && !!a.capabilities?.resources)) {
      if (![tQ, fQ].some(l => r.some(c => bl(c, l.name)))) {
        r.push(tQ, fQ, _Ee);
      }
    }
    return {
      clients: n,
      tools: r,
      commands: o
    };
  }
  async function ZTo(e) {
    await Promise.all(e.map(async t => {
      if (t.type !== "connected") {
        return;
      }
      try {
        await t.cleanup();
      } catch (n) {
        logForDebugging(`MCP client cleanup failed for ${t.name}: ${n}`, {
          level: "error"
        });
      }
    }));
  }
  var M3a;
  var AGn;
  var fht;
  var G6e;
  var hht;
  var $5t;
  var N3a;
  var h3p;
  var _3p;
  var S3p = () => (c3a(), __toCommonJS(l3a));
  var T3p = () => (_3a(), __toCommonJS(y3a));
  var mht = null;
  var RGn;
  var k3p;
  var I3p;
  var GTo;
  var kM;
  var M3p;
  var AM;
  var n3;
  var ype;
  var yQ;
  var eA = __lazy(() => {
    fNa();
    ENa();
    n_o();
    kNa();
    Yjt();
    at();
    Ire();
    Uc();
    n4n();
    ci();
    i4n();
    QNa();
    YHa();
    GWn();
    KWn();
    hja();
    Kp();
    no();
    hd();
    Qfo();
    je();
    pr();
    gn();
    dt();
    dw();
    YA();
    bT();
    yG();
    y5t();
    Rn();
    eht();
    m9t();
    cqa();
    nW();
    ASe();
    JF();
    Ds();
    fW();
    Kf();
    Fh();
    Kv();
    dNe();
    Fat();
    e1();
    ADn();
    Zn();
    s1();
    dV();
    _5t();
    kTe();
    yS();
    Wk();
    GG();
    zI();
    ln();
    $n();
    Ot();
    Gu();
    nTo();
    fSo();
    aGn();
    fat();
    Noe();
    EI();
    bWn();
    hqa();
    yqa();
    gSo();
    Zft();
    Bat();
    G1();
    Eqa();
    SIe();
    Cqa();
    o8();
    Moe();
    Oce();
    l9();
    Iw();
    Dqa();
    dTo();
    Koo();
    b1();
    Cbe();
    _b();
    gn();
    Oce();
    M3a = require("url");
    AGn = require("path");
    fht = (wTo(), __toCommonJS(vTo)).fetchMcpSkillsForClient;
    G6e = class G6e extends Error {
      serverName;
      constructor(e, t) {
        super(t);
        this.name = "McpAuthError";
        this.serverName = e;
      }
    };
    hht = class hht extends Error {
      constructor(e) {
        super(`MCP server "${e}" session expired`);
        this.name = "McpSessionExpiredError";
      }
    };
    $5t = class $5t extends Po {
      mcpMeta;
      constructor(e, t, n) {
        super(e, t);
        this.mcpMeta = n;
        this.name = "McpToolCallError";
      }
    };
    N3a = class N3a extends Po {
      constructor(e, t) {
        let n = typeof t?.message === "string" ? t.message : String(t);
        super(`MCP server "${e}" returned a malformed result that failed schema validation: ${n}`, "MCP server returned a malformed result");
        this.name = "McpResponseSchemaError";
        this.cause = t;
      }
    };
    h3p = [250, 500, 1000];
    _3p = new Set(["http", "sse", "ws", "claudeai-proxy"]);
    RGn = Promise.resolve();
    k3p = new Set(["image/jpeg", "image/png", "image/gif", "image/webp"]);
    I3p = ["mcp__ide__executeCode", "mcp__ide__getDiagnostics"];
    GTo = new Map();
    kM = TEr(async (e, t, n) => {
      let r = Date.now();
      {
        let a = t.configError;
        if (!a && "url" in t) {
          try {
            new URL(t.url);
          } catch {
            a = `'url' is not a valid URL: ${De(t.url)}. Update the server's config and reconnect.`;
          }
        }
        if (a) {
          logEvent("tengu_mcp_server_config_invalid", {
            transportType: t.type ?? "stdio",
            field: "url",
            source: t.configError ? "loader" : "connect"
          });
          dn(e, a);
          uu(e, a);
          return {
            name: e,
            type: "failed",
            config: t,
            error: a,
            errorCode: "INVALID_CONFIG"
          };
        }
      }
      let o;
      let s;
      let i;
      try {
        let I = function () {
          let U = Date.now();
          for (let N of k.activeCallWatchdogs) {
            if (N.armedAt === 0) {
              N.armedAt = U;
            }
          }
        };
        let a = "url" in t && UOn(t.url);
        let l = (t.type === "sse" || t.type === "http") && v4e(t);
        let c = (t.type === "sse" || t.type === "http") && !l && !a && M8(t.url) && isFirstPartyProvider() && (!!getClaudeAIOAuthTokens()?.accessToken || bEe());
        if (c) {
          logEvent("tengu_mcp_first_party_auto_auth", {
            transportType: t.type,
            ...Spe(t)
          });
        }
        if (t.type === "sse") {
          let U = l || c ? undefined : new O6e(e, t);
          s = U;
          let N = await cGn(e, t);
          let W = await lGn(t.url);
          let j = sht(s6e(undefined, W));
          if (U) {
            j = HWn(j, U);
          }
          if (j = CGn(j, t), c) {
            j = WTo(j);
          }
          let z = {
            authProvider: U,
            fetch: j,
            requestInit: {
              ...W,
              headers: {
                "User-Agent": getMCPUserAgent(),
                "Accept-Encoding": "identity",
                ...N
              }
            }
          };
          let V = async (K, J) => {
            let Q = {};
            let Z = await U?.tokens();
            if (Z) {
              Q.Authorization = `Bearer ${Z.access_token}`;
            }
            let ne = await lGn(String(K));
            return fetch(K, {
              ...J,
              ...ne,
              headers: x3p(J?.headers, Q, N)
            });
          };
          z.eventSourceInit = {
            fetch: sht(U ? HWn(V, U) : c ? WTo(V) : V)
          };
          i = new Z3n(new URL(t.url), z);
          dn(e, "SSE transport initialized, awaiting connection");
        } else if (t.type === "sse-ide") {
          dn(e, `Setting up SSE-IDE transport to ${t.url}`);
          let U = {
            fetch: sht(globalThis.fetch),
            requestInit: {
              headers: {
                "User-Agent": getMCPUserAgent(),
                "Accept-Encoding": "identity"
              }
            }
          };
          i = new Z3n(new URL(t.url), U);
        } else if (t.type === "ws-ide") {
          let U = getWebSocketTLSOptions();
          let N = {
            "User-Agent": getMCPUserAgent(),
            ...(t.authToken && {
              "X-Claude-Code-Ide-Authorization": t.authToken
            })
          };
          let W = new globalThis.WebSocket(t.url, {
            protocols: ["mcp"],
            headers: N,
            proxy: getWebSocketProxyUrl(t.url),
            Aeu: U || undefined
          });
          i = new iGn(W);
        } else if (t.type === "ws") {
          dn(e, `Initializing WebSocket transport to ${t.url}`);
          let U = await cGn(e, t);
          let N = getWebSocketTLSOptions();
          let W = a ? cT() : null;
          let j = {
            "User-Agent": getMCPUserAgent(),
            ...(W && {
              Authorization: `Bearer ${W}`
            }),
            ...U
          };
          let z = Sbu(j, (K, J) => J.toLowerCase().endsWith("authorization") ? "[REDACTED]" : K);
          dn(e, `WebSocket transport options: ${De({
            url: t.url,
            headers: z,
            hasSessionAuth: !!W
          })}`);
          let V = new globalThis.WebSocket(t.url, {
            protocols: ["mcp"],
            headers: j,
            proxy: getWebSocketProxyUrl(t.url),
            Aeu: N || undefined
          });
          i = new iGn(V);
        } else if (t.type === "http") {
          dn(e, `Initializing HTTP transport to ${t.url}`);
          dn(e, `Node version: ${process.version}, Platform: linux`);
          dn(e, `Environment: ${De({
            NODE_OPTIONS: process.env.NODE_OPTIONS || "not set",
            UV_THREADPOOL_SIZE: process.env.UV_THREADPOOL_SIZE || "default",
            HTTP_PROXY: Vge(process.env.HTTP_PROXY || "not set"),
            HTTPS_PROXY: Vge(process.env.HTTPS_PROXY || "not set"),
            NO_PROXY: process.env.NO_PROXY || "not set"
          })}`);
          let U = l || c ? undefined : new O6e(e, t);
          s = U;
          let N = await cGn(e, t);
          let W = await lGn(t.url);
          let j = sht(s6e(undefined, W));
          if (U) {
            j = HWn(j, U);
          }
          if (j = CGn(j, t), c) {
            j = WTo(j);
          }
          if (a) {
            j = w3p(j);
          }
          if (fDi(t)) {
            j = hSo(j, t.url);
          }
          let z = {
            authProvider: U,
            fetch: j,
            requestInit: {
              ...W,
              headers: {
                "User-Agent": getMCPUserAgent(),
                "Accept-Encoding": "identity",
                ...N
              }
            }
          };
          let V = z.requestInit?.headers ? Sbu(z.requestInit.headers, (K, J) => J.toLowerCase().endsWith("authorization") ? "[REDACTED]" : K) : undefined;
          dn(e, `HTTP transport options: ${De({
            url: t.url,
            headers: V,
            hasAuthProvider: !!U,
            timeoutMs: B3a(t)
          })}`);
          i = new t4n(new URL(t.url), z);
          dn(e, "HTTP transport created successfully");
        } else if (t.type === "sdk") {
          throw Error("SDK servers should be handled in print.ts");
        } else if (t.type === "claudeai-proxy") {
          if (!isFirstPartyProvider()) {
            throw Error("claude.ai MCP proxy is not available on third-party providers");
          }
          if (dn(e, `Initializing claude.ai proxy transport for server ${t.id}`), !getClaudeAIOAuthTokens()) {
            throw Error("No claude.ai OAuth token found");
          }
          let N = getOauthConfig();
          let W = `${N.MCP_PROXY_URL}${N.MCP_PROXY_PATH.replace("{server_id}", t.id)}`;
          dn(e, `Using claude.ai proxy at ${W}`);
          let j = C3p(sht(globalThis.fetch));
          let z = getProxyFetchOptions({
            url: W
          });
          let K = {
            fetch: TWn(t) ? hSo(CGn(j, t), W) : CGn(j, t),
            requestInit: {
              ...z,
              headers: {
                "User-Agent": getMCPUserAgent(),
                "Accept-Encoding": "identity",
                "X-Mcp-Client-Session-Id": getSessionId()
              }
            }
          };
          i = new t4n(new URL(W), K);
          dn(e, "claude.ai proxy transport created successfully");
        } else if ((t.type === "stdio" || !t.type) && isClaudeInChromeMCPServer(e)) {
          let {
            createChromeContext: U
          } = await Promise.resolve().then(() => (tEo(), eEo));
          let {
            createChromeSocketClient: N,
            createClaudeForChromeMcpServer: W
          } = await Promise.resolve().then(() => (XPr(), sSs));
          let {
            createLinkedTransportPair: j
          } = await Promise.resolve().then(() => FTo);
          let {
            setChromeBinding: z
          } = await Promise.resolve().then(() => (ATo(), i3a));
          let V = U(t.env);
          let K = N(V);
          z(V, K);
          o = W(V, K);
          let [J, Q] = j();
          await o.connect(Q);
          i = J;
          dn(e, "In-process Chrome MCP server started");
        } else if ((t.type === "stdio" || !t.type) && j4e(e)) {
          let {
            createComputerUseMcpServerForCli: U
          } = await Promise.resolve().then(() => (HTo(), $To));
          let {
            createLinkedTransportPair: N
          } = await Promise.resolve().then(() => FTo);
          o = await U();
          let [W, j] = N();
          await o.connect(j);
          i = W;
          dn(e, "In-process Computer Use MCP server started");
        } else if (t.type === "stdio" || !t.type) {
          let U = process.env.CLAUDE_CODE_SHELL_PREFIX || t.command;
          let N = process.env.CLAUDE_CODE_SHELL_PREFIX ? [Ja([t.command, ...t.args])] : t.args;
          let W = shouldUseMcpAllowlistEnv() ? {
            ...e_o(),
            ...agentProxyEnv()
          } : subprocessEnv();
          let {
            CLAUDE_CODE_CHILD_SESSION: j,
            ...z
          } = W;
          i = new S5t({
            command: U,
            args: N,
            env: {
              ...z,
              CLAUDE_PROJECT_DIR: getProjectRoot(),
              CLAUDE_CODE_SESSION_ID: getSessionId(),
              CLAUDECODE: "1",
              ...t.env
            },
            stderr: "pipe"
          });
        } else {
          throw Error(`Unsupported server type: ${t.type}`);
        }
        let u;
        let d = "";
        if (t.type === "stdio" || !t.type) {
          let U = i;
          if (U.stderr) {
            u = N => {
              if (d.length < 67108864) {
                try {
                  d += N.toString();
                } catch {}
              }
            };
            U.stderr.on("data", u);
          }
        }
        let p = new J3n({
          name: "claude-code",
          title: "Claude Code",
          version: {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION ?? "unknown",
          description: "Anthropic's agentic coding tool",
          websiteUrl: "https://claude.com/claude-code"
        }, {
          capabilities: SWn()
        });
        if (t.type === "http") {
          dn(e, "Client created, setting up request handler");
        }
        if (p.setRequestHandler(P0r, async () => (dn(e, "Received ListRoots request from server"), D3p())), dn(e, `Starting connection with timeout of ${ez()}ms`), t.type === "http") {
          dn(e, `Testing basic HTTP connectivity to ${t.url}`);
          try {
            let U = new URL(t.url);
            if (dn(e, `Parsed URL: host=${U.hostname}, port=${U.port || "default"}, protocol=${U.protocol}`), U.hostname === "127.0.0.1" || U.hostname === "localhost") {
              dn(e, `Using loopback address: ${U.hostname}`);
            }
          } catch (U) {
            dn(e, `Failed to parse URL: ${U}`);
          }
        }
        let m = pHa(t);
        if (TWn(t)) {
          dn(e, m ? "Stateless claudeai-proxy \u2014 resolving MCP initialize from cached projection" : "Stateless claudeai-proxy \u2014 no cached projection; real initialize, GET SSE suppressed");
          mHa(i, m);
        }
        let f = p.connect(i);
        let h = new Promise((U, N) => {
          let W = setTimeout(() => {
            let j = Date.now() - r;
            if (dn(e, `Connection timeout triggered after ${j}ms (limit: ${ez()}ms)`), o) {
              o.close().catch(() => {});
            }
            i?.close().catch(() => {});
            N(new Po(`MCP server "${e}" connection timed out after ${ez()}ms`, "MCP connection timeout"));
          }, ez());
          f.then(() => {
            clearTimeout(W);
          }, j => {
            clearTimeout(W);
          });
        });
        try {
          if (await Promise.race([f, h]), d) {
            uu(e, `Server stderr: ${d}`);
            d = "";
          }
          let U = Date.now() - r;
          if (dn(e, `Successfully connected (transport: ${t.type || "stdio"}) in ${U}ms`), (t.type === "stdio" || !t.type) && i instanceof S5t && i.pid) {
            OOn("mcp_stdio", i.pid);
          }
        } catch (U) {
          let N = Date.now() - r;
          if (i instanceof S5t && i.overflowError) {
            if (uu(e, i.overflowError.message), d) {
              uu(e, `Server stderr: ${d}`);
            }
            throw i.overflowError;
          }
          if (t.type === "sse" && U instanceof Error) {
            dn(e, `SSE Connection failed after ${N}ms: ${De({
              url: t.url,
              error: U.message,
              errorType: U.constructor.name,
              stack: U.stack
            })}`);
            uu(e, U);
            let W = U.code;
            if (U instanceof oO || U instanceof ZodError_export && s?.sawAuthChallenge || W === 401 || W === 403) {
              if (l) {
                return k3a(e, t, "sse", W);
              }
              if (c) {
                return A3a(e, t, "sse", W);
              }
              return qTo(e, t, "sse", U);
            }
          } else if (t.type === "http" && U instanceof Error) {
            let W = U;
            dn(e, `HTTP Connection failed after ${N}ms: ${U.message} (code: ${W.code || "none"}, errno: ${W.errno || "none"})`);
            uu(e, U);
            let j = U.code;
            if (U instanceof oO || U instanceof ZodError_export && s?.sawAuthChallenge || j === 401 || j === 403) {
              if (l) {
                return k3a(e, t, "http", j);
              }
              if (c) {
                return A3a(e, t, "http", j);
              }
              return qTo(e, t, "http", U);
            }
          } else if (t.type === "claudeai-proxy" && U instanceof Error) {
            dn(e, `claude.ai proxy connection failed after ${N}ms: ${U.message}`);
            uu(e, U);
            let W = U.code;
            if (W === 401 || W === 403) {
              return qTo(e, t, "claudeai-proxy");
            }
          } else if (t.type === "sse-ide" || t.type === "ws-ide") {
            logEvent("tengu_mcp_ide_server_connection_failed", {
              connectionDurationMs: N
            });
          }
          if (o) {
            o.close().catch(() => {});
          }
          if (i.close().catch(() => {}), d) {
            uu(e, `Server stderr: ${d}`);
          }
          throw U;
        }
        let g = p.getServerCapabilities();
        let y = p.getServerVersion();
        let _ = p.getInstructions();
        let b = _;
        if (_ && _.length > 2048) {
          b = pC(_, 2048) + "\u2026 [truncated]";
          dn(e, `Server instructions truncated from ${_.length} to ${2048} chars`);
        }
        if (dn(e, `Connection established with capabilities: ${De({
          hasTools: !!g?.tools,
          hasPrompts: !!g?.prompts,
          hasResources: !!g?.resources,
          hasResourceSubscribe: !!g?.resources?.subscribe,
          serverVersion: y || "unknown"
        })}`), logForDebugging(`[MCP] Server "${e}" connected with subscribe=${!!g?.resources?.subscribe}`), p.setRequestHandler(lye, async U => (dn(e, `Elicitation request received during initialization: ${De(U)}`), {
          action: "cancel"
        })), t.type === "sse-ide" || t.type === "ws-ide") {
          let U = Date.now() - r;
          logEvent("tengu_mcp_ide_server_connection_succeeded", {
            connectionDurationMs: U,
            serverVersion: uS(y?.version)
          });
          Xja(p).catch(N => {
            uu(e, `Failed to send ide_connected notification: ${N}`);
          });
        }
        let S = Date.now();
        let E = false;
        let C = p.onerror;
        let x = p.onclose;
        let A = 3;
        let k = {
          consecutiveErrors: 0,
          activeCallWatchdogs: new Set(),
          pendingElicitations: 0,
          lastElicitationClosedAt: 0
        };
        let O = false;
        let M = U => {
          if (O) {
            return;
          }
          O = true;
          dn(e, `Closing transport (${U})`);
          p.close().catch(N => {
            dn(e, `Error during close: ${he(N)}`);
          });
        };
        if (p.onerror = U => {
          let N = t.type || "stdio";
          if (N === "stdio" && U instanceof SyntaxError) {
            uu(e, `Ignoring non-JSON line on stdout: ${U.message}`);
            return;
          }
          if (N === "stdio" && U instanceof b5t) {
            if (uu(e, U.message), E = true, M("stdout overflow"), C) {
              C(U);
            }
            return;
          }
          if ((N === "sse" || N === "sse-ide" || N === "http" || N === "claudeai-proxy") && U.message.includes("without an SSE event boundary")) {
            if (uu(e, U.message), E = true, M("http body overflow"), C) {
              C(U);
            }
            return;
          }
          if ((N === "sse" || N === "http" || N === "claudeai-proxy") && U instanceof SyntaxError) {
            if (E = true, I(), M("malformed JSON-RPC message (response truncated)"), C) {
              C(U);
            }
            return;
          }
          let W = Date.now() - S;
          if (E = true, dn(e, `${N.toUpperCase()} connection dropped after ${Math.floor(W / 1000)}s uptime`), U.message) {
            if (U.message.includes("ECONNRESET")) {
              dn(e, "Connection reset - server may have crashed or restarted");
            } else if (U.message.includes("ETIMEDOUT")) {
              dn(e, "Connection timeout - network issue or server unresponsive");
            } else if (U.message.includes("ECONNREFUSED")) {
              dn(e, "Connection refused - server may be down");
            } else if (U.message.includes("EPIPE")) {
              dn(e, "Broken pipe - server closed connection unexpectedly");
            } else if (U.message.includes("EHOSTUNREACH")) {
              dn(e, "Host unreachable - network connectivity issue");
            } else if (U.message.includes("ESRCH")) {
              dn(e, "Process not found - stdio server process terminated");
            } else if (U.message.includes("spawn")) {
              dn(e, "Failed to spawn process - check command and permissions");
            } else {
              dn(e, `Connection error: ${U.message}`);
            }
          }
          if ((N === "http" || N === "claudeai-proxy") && p.transport?.sessionId !== undefined && L3a(U)) {
            if (dn(e, "MCP session expired (server no longer recognizes session ID), triggering reconnection"), M("session expired"), C) {
              C(U);
            }
            return;
          }
          if (N === "sse" || N === "http" || N === "claudeai-proxy") {
            if (U.message.includes("Maximum reconnection attempts")) {
              if (dn(e, "SSE GET-stream reconnection exhausted; leaving transport up (POST still works)"), k.consecutiveErrors = 0, I(), C) {
                C(U);
              }
              return;
            }
            if (m3p(U)) {
              if (k.consecutiveErrors++, I(), dn(e, `Terminal connection error ${k.consecutiveErrors}/${A}`), k.consecutiveErrors >= A) {
                k.consecutiveErrors = 0;
                M("max consecutive terminal errors");
              }
            } else {
              k.consecutiveErrors = 0;
            }
          }
          if (C) {
            C(U);
          }
        }, p.transport) {
          let U = p.transport.onmessage;
          p.transport.onmessage = (N, W) => {
            if (k.consecutiveErrors !== 0) {
              k.consecutiveErrors = 0;
            }
            U?.(N, W);
          };
        }
        p.onclose = () => {
          let U = Date.now() - S;
          let N = t.type ?? "unknown";
          dn(e, `${N.toUpperCase()} connection closed after ${Math.floor(U / 1000)}s (${E ? "with errors" : "cleanly"})`);
          jTo(e, t, {
            status: "disconnected",
            durationMs: U
          });
          let W = W6e(e, t);
          if (AM.cache.delete(e), n3.cache.delete(e), ype.cache.delete(e), yQ.cache.delete(e), nA()) {
            fht.cache.delete(e);
          }
          if (kM.cache.delete(W), dn(e, "Cleared connection cache for reconnection"), x) {
            x();
          }
        };
        let L = async () => {
          if (o) {
            try {
              await o.close();
            } catch (U) {
              dn(e, `Error closing in-process server: ${U}`);
            }
            try {
              await p.close();
            } catch (U) {
              dn(e, `Error closing client: ${U}`);
            }
            return;
          }
          if (u && (t.type === "stdio" || !t.type)) {
            i.stderr?.off("data", u);
          }
          if (t.type === "stdio" || !t.type) {
            try {
              let N = i.pid;
              if (N) {
                dn(e, "Sending SIGINT to MCP server process");
                try {
                  process.kill(N, "SIGINT");
                } catch (W) {
                  dn(e, `Error sending SIGINT: ${W}`);
                  return;
                }
                await new Promise(async W => {
                  let j = false;
                  let z = setInterval(() => {
                    try {
                      process.kill(N, 0);
                    } catch {
                      if (!j) {
                        j = true;
                        clearInterval(z);
                        clearTimeout(V);
                        dn(e, "MCP server process exited cleanly");
                        W();
                      }
                    }
                  }, 50);
                  let V = setTimeout(() => {
                    if (!j) {
                      j = true;
                      clearInterval(z);
                      dn(e, "Cleanup timeout reached, stopping process monitoring");
                      W();
                    }
                  }, 600);
                  try {
                    if (await sleep(100), !j) {
                      try {
                        process.kill(N, 0);
                        dn(e, "SIGINT failed, sending SIGTERM to MCP server process");
                        try {
                          process.kill(N, "SIGTERM");
                        } catch (K) {
                          dn(e, `Error sending SIGTERM: ${K}`);
                          j = true;
                          clearInterval(z);
                          clearTimeout(V);
                          W();
                          return;
                        }
                      } catch {
                        j = true;
                        clearInterval(z);
                        clearTimeout(V);
                        W();
                        return;
                      }
                      if (await sleep(400), !j) {
                        try {
                          process.kill(N, 0);
                          dn(e, "SIGTERM failed, sending SIGKILL to MCP server process");
                          try {
                            process.kill(N, "SIGKILL");
                          } catch (K) {
                            dn(e, `Error sending SIGKILL: ${K}`);
                          }
                        } catch {
                          j = true;
                          clearInterval(z);
                          clearTimeout(V);
                          W();
                        }
                      }
                    }
                    if (!j) {
                      j = true;
                      clearInterval(z);
                      clearTimeout(V);
                      W();
                    }
                  } catch {
                    if (!j) {
                      j = true;
                      clearInterval(z);
                      clearTimeout(V);
                      W();
                    }
                  }
                });
              }
            } catch (U) {
              dn(e, `Error terminating process: ${U}`);
            }
          }
          try {
            await p.close();
          } catch (U) {
            dn(e, `Error closing client: ${U}`);
          }
        };
        let P = Ti(L);
        let F = async () => {
          P?.();
          await L();
        };
        let H = Date.now() - r;
        jTo(e, t, {
          status: "connected",
          durationMs: H
        });
        logEvent("tengu_mcp_server_connection_succeeded", {
          connectionDurationMs: H,
          transportType: t.type ?? "stdio",
          scope: t.scope,
          isPlugin: t.pluginSource !== undefined,
          totalServers: n?.totalServers,
          stdioCount: n?.stdioCount,
          sseCount: n?.sseCount,
          httpCount: n?.httpCount,
          sseIdeCount: n?.sseIdeCount,
          wsIdeCount: n?.wsIdeCount,
          ...Spe(t)
        });
        Pe("mcp_connect");
        return {
          name: e,
          client: p,
          type: "connected",
          capabilities: g ?? {},
          serverInfo: y,
          instructions: b,
          config: t,
          cleanup: F,
          transportErrorState: k
        };
      } catch (a) {
        let l = Date.now() - r;
        let c = he(a);
        let u = a instanceof Error ? a.cause : undefined;
        let d = (a && typeof a === "object" && "code" in a ? a.code : undefined) ?? (u && typeof u === "object" && "code" in u ? u.code : undefined);
        let p = d !== undefined ? String(d) : undefined;
        if (t.type === "http" && p === "404" && i?.sessionId === undefined && !UOn(t.url)) {
          p = "ENDPOINT_NOT_FOUND";
          c = `MCP endpoint not found at ${RIe(t) ?? "(unparseable url)"}. Check the URL in your MCP config.`;
        }
        jTo(e, t, {
          status: "failed",
          durationMs: l,
          errorCode: p,
          error: c
        });
        let m = p === "ECONNREFUSED" ? "mcp_connect_refused" : c.includes("timed out") ? "mcp_connect_timeout" : "mcp_connect_failed";
        if (Et("mcp_connect", `${m}_${t.type ?? "stdio"}`), logEvent("tengu_mcp_server_connection_failed", {
          connectionDurationMs: l,
          errorCode: p,
          errorClassName: Pds(a),
          errorMessageHash: i3i.createHash("sha256").update(fQr(c)).digest("hex").slice(0, 12),
          totalServers: n?.totalServers || 1,
          stdioCount: n?.stdioCount || (t.type === "stdio" ? 1 : 0),
          sseCount: n?.sseCount || (t.type === "sse" ? 1 : 0),
          httpCount: n?.httpCount || (t.type === "http" ? 1 : 0),
          sseIdeCount: n?.sseIdeCount || (t.type === "sse-ide" ? 1 : 0),
          wsIdeCount: n?.wsIdeCount || (t.type === "ws-ide" ? 1 : 0),
          transportType: t.type ?? "stdio",
          scope: t.scope,
          isPlugin: t.pluginSource !== undefined,
          ...Spe(t)
        }), dn(e, `Connection failed after ${l}ms: ${c}`), uu(e, `Connection failed: ${c}`), o) {
          o.close().catch(() => {});
        }
        if ((t.type === "stdio" || t.type === undefined) && t.pluginSource !== undefined) {
          YTo(e, cNe(t));
        }
        return {
          name: e,
          type: "failed",
          config: t,
          error: c,
          errorCode: p
        };
      }
    }, W6e);
    MNa({
      ensureConnectedClient: iEe
    });
    M3p = {
      [Ei.ConnectionClosed]: "connection_closed",
      [Ei.RequestTimeout]: "request_timeout",
      [Ei.ParseError]: "parse_error",
      [Ei.InvalidRequest]: "invalid_request",
      [Ei.MethodNotFound]: "method_not_found",
      [Ei.InvalidParams]: "invalid_params",
      [Ei.InternalError]: "internal_error"
    };
    AM = mk(async e => {
      if (e.type !== "connected") {
        return [];
      }
      try {
        if (!e.capabilities?.tools) {
          return [];
        }
        let t = Date.now();
        let n = await kGn(e.client, e.name, "tools/list", aOt, g => g.tools);
        e.toolsListError = undefined;
        let r = m3(n);
        let o = u9(e.config);
        let s = o ? {
          mcpServerBaseUrl: o
        } : {};
        let i = xbe(e.name, e.config) ? Bl(e.name) : undefined;
        if (r.length === 0) {
          logEvent("tengu_mcp_degraded", {
            reason: "connected_zero_tools",
            transportType: e.config.type ?? "stdio",
            mcpServerName: i,
            ...s
          });
        }
        let a = e.config.type === "sdk" && st(process.env.CLAUDE_AGENT_SDK_MCP_NO_PREFIX);
        let l = e.config.type === "claudeai-proxy" || e.config.type === "http" || e.config.type === "sse" ? e.config.toolPermissions : undefined;
        if (l) {
          let g = Object.keys(l).length;
          if (g > 0 && !r.some(y => l[y.name] !== undefined)) {
            logForDebugging(`[claudeai-mcp] ${e.name}: toolPermissions has ${g} entries but none matched upstream tool names \u2014 backend name drift?`, {
              level: "warn"
            });
          }
        }
        let c = O3p(e.config);
        let u = 0;
        let d = 0;
        let p = 0;
        let m = r.flatMap(g => {
          let y = gqa(g.inputSchema);
          if (y.outcome === "unchanged") {
            return [g];
          }
          if (y.outcome === "normalized" && c) {
            u++;
            dn(e.name, `Normalized input schema for tool "${g.name}" (flattened top-level ${y.combinators.join("/")})`);
            let b = g.description ? `${y.note}

${g.description}` : y.note;
            return [{
              ...g,
              inputSchema: y.schema,
              description: b
            }];
          }
          if (y.outcome === "normalized") {
            d++;
          } else {
            p++;
          }
          let _ = y.outcome === "drop" ? y.reason : `its input schema uses top-level ${y.combinators.join("/")}, which the Anthropic API does not accept`;
          uu(e.name, `Skipping tool "${g.name}": ${_}. Other tools from this server remain available.`);
          return [];
        });
        if (u > 0) {
          logEvent("tengu_mcp_degraded", {
            reason: "tool_schema_normalized",
            transportType: e.config.type ?? "stdio",
            normalizedCount: u,
            mcpServerName: i,
            ...s
          });
        }
        if (d > 0) {
          logEvent("tengu_mcp_degraded", {
            reason: "tool_schema_normalize_gated",
            transportType: e.config.type ?? "stdio",
            skippedCount: d,
            mcpServerName: i,
            ...s
          });
        }
        if (p > 0) {
          logEvent("tengu_mcp_degraded", {
            reason: "tool_schema_unsupported",
            transportType: e.config.type ?? "stdio",
            skippedCount: p,
            mcpServerName: i,
            ...s
          });
        }
        let f = () => xbe(e.name, e.config);
        Sqa(m, e.name, f(), o, e.instructions);
        let h = m.map(g => {
          let y = W6(e.name, g.name);
          let _ = g._meta?.["anthropic/maxResultSizeChars"];
          let b = typeof _ === "number" && Number.isFinite(_) && _ > 0;
          let S = {
            ...p_o,
            name: a ? g.name : y,
            mcpInfo: {
              serverName: e.name,
              scope: e.config.scope,
              displayName: "displayName" in e.config ? e.config.displayName : undefined,
              iconUrl: "iconUrl" in e.config ? e.config.iconUrl : undefined,
              serverInfoName: e.serverInfo?.name,
              toolName: g.name,
              title: g.annotations?.title?.replace(/\s+/g, " ").trim() || undefined,
              execution: g.execution,
              role: "role" in e.config ? e.config.role : undefined,
              effectiveMaxPermission: l?.[g.name]
            },
            isMcp: true,
            searchHint: typeof g._meta?.["anthropic/searchHint"] === "string" ? g._meta["anthropic/searchHint"].replace(/\s+/g, " ").trim() || undefined : undefined,
            alwaysLoad: e.config.alwaysLoad === true || g._meta?.["anthropic/alwaysLoad"] === true,
            async description() {
              return g.description ?? "";
            },
            async prompt() {
              let C = g.description ?? "";
              return C.length > 2048 ? pC(C, 2048) + "\u2026 [truncated]" : C;
            },
            isConcurrencySafe() {
              return g.annotations?.readOnlyHint ?? false;
            },
            isReadOnly() {
              return g.annotations?.readOnlyHint ?? false;
            },
            readOnlyHint: g.annotations?.readOnlyHint,
            toAutoClassifierInput(C) {
              return N3p(C, g.name);
            },
            isDestructive() {
              return g.annotations?.destructiveHint ?? false;
            },
            isOpenWorld() {
              return g.annotations?.openWorldHint ?? false;
            },
            maxResultSizeChars: b ? Math.min(_, 500000) : p_o.maxResultSizeChars,
            persistenceThresholdCeiling: b ? 500000 : undefined,
            inputJSONSchema: g.inputSchema,
            async checkPermissions() {
              return {
                behavior: "passthrough",
                message: "MCPTool requires permission.",
                suggestions: [{
                  type: "addRules",
                  rules: [{
                    toolName: y,
                    ruleContent: undefined
                  }],
                  behavior: "allow",
                  destination: "localSettings"
                }]
              };
            },
            async call(C, x, A, k, I) {
              let O = B3p(k);
              let M = O ? {
                "claudecode/toolUseId": O
              } : {};
              if (I && O) {
                I({
                  type: "progress",
                  toolUseID: O,
                  data: {
                    type: "mcp_progress",
                    status: "started",
                    serverName: e.name,
                    toolName: g.name
                  }
                });
              }
              let L = Date.now();
              let P = e;
              let F = false;
              let H = false;
              return (async N => {
                for (let j = 0;; j++) {
                  try {
                    let z = await iEe(e);
                    P = z;
                    let V = await XTo({
                      client: z,
                      clientConnection: e,
                      tool: g.name,
                      args: C,
                      meta: M,
                      signal: N,
                      setAppState: x.setAppState,
                      imageLimits: Yg(x.options.mainLoopModel),
                      toolExecution: g.execution,
                      taskRegistry: x.taskRegistry,
                      toolUseId: O,
                      onProgress: I && O ? K => {
                        if (H) {
                          return;
                        }
                        I({
                          type: "progress",
                          toolUseID: O,
                          data: K
                        });
                      } : undefined,
                      requestDialog: x.requestDialog,
                      hasResultSizeAnnotation: b,
                      onAwaitingUserInput: K => {
                        F = K;
                      }
                    });
                    if (I && O && !H) {
                      I({
                        type: "progress",
                        toolUseID: O,
                        data: {
                          type: "mcp_progress",
                          status: "completed",
                          serverName: e.name,
                          toolName: g.name,
                          elapsedTimeMs: Date.now() - L
                        }
                      });
                    }
                    if (!V.isError) {
                      fja(g.name);
                    }
                    return {
                      data: V.content,
                      ...((V._meta || V.structuredContent) && {
                        mcpMeta: {
                          ...(V._meta && {
                            _meta: V._meta
                          }),
                          ...(V.structuredContent && {
                            structuredContent: V.structuredContent
                          })
                        }
                      })
                    };
                  } catch (z) {
                    if (z instanceof hht && j < 1) {
                      dn(e.name, `Retrying tool '${g.name}' after session recovery`);
                      continue;
                    }
                    if (I && O && !H) {
                      I({
                        type: "progress",
                        toolUseID: O,
                        data: {
                          type: "mcp_progress",
                          status: "failed",
                          serverName: e.name,
                          toolName: g.name,
                          elapsedTimeMs: Date.now() - L
                        }
                      });
                    }
                    if (z instanceof Error && !(z instanceof Po)) {
                      let V = z.constructor.name;
                      if (V === "Error") {
                        throw new Po(z.message, z.message.slice(0, 200));
                      }
                      if (V === "McpError" && "code" in z && typeof z.code === "number") {
                        throw new Po(z.message, `McpError ${z.code}`);
                      }
                    }
                    throw z;
                  }
                }
              })(x.abortController.signal);
            },
            userFacingName() {
              let C = (g.annotations?.title || g.name).replace(/\s+/g, " ").trim();
              return `${e.name} - ${C} (MCP)`;
            },
            ...(isClaudeInChromeMCPServer(e.name) && (e.config.type === "stdio" || !e.config.type) ? S3p().getClaudeInChromeMCPToolOverrides(g.name) : {}),
            ...((e.config.type === "stdio" || !e.config.type) && j4e(e.name) ? T3p().getComputerUseMCPToolOverrides(g.name) : {}),
            ...(e.config.type === "sdk" && gFn(e.name) ? Uea(g.name) : {}),
            ...(vqa(g.name) ? wqa() : {})
          };
          let E = S.call;
          S.call = async (C, x, A, k, I) => {
            if (x.options.activeMcpServer = e.name, x.options.activeMcpTool = g.name, e.config.pluginSource) {
              Tq(e.config.pluginSource);
            }
            let O = f();
            if (O) {
              Zea(e.name);
            }
            return E(Tqa(C, g.name, e.name, O, getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_strip_trailing_xml_tags", false), o), x, A, k, I);
          };
          return S;
        }).filter(P3p);
        logEvent("tengu_mcp_tools_listed", {
          transportType: e.config.type ?? "stdio",
          listDurationMs: Date.now() - t,
          toolCount: h.length,
          alwaysLoadCount: Bn(h, g => g.alwaysLoad === true),
          ...s,
          ...(xbe(e.name, e.config) && {
            mcpServerName: Bl(e.name)
          })
        });
        Pe("mcp_list_tools");
        return h;
      } catch (t) {
        let n = he(t);
        if (e.config.type === "claudeai-proxy" && C5t(t)) {
          logEvent("tengu_mcp_server_needs_auth", {
            transportType: "claudeai-proxy",
            cause: "discovery_tools_list",
            ...Spe(e.config)
          });
          YTo(e.name, e.config.id);
          Et("mcp_list_tools", "mcp_list_tools_needs_auth");
          dn(e.name, "tools/list 401/403 on claude.ai proxy \u2014 flagging needs-auth");
          e.discoveryAuthFailure = true;
          AM.cache.delete(e.name);
          return [];
        }
        let r = t instanceof yi ? `mcp_list_tools_${M3p[t.code] ?? "mcperr_other"}` : n.includes("timed out") ? "mcp_list_tools_timeout" : "mcp_list_tools_failed";
        Et("mcp_list_tools", r);
        uu(e.name, `Failed to fetch tools: ${n}`);
        e.toolsListError = n;
        let o = Spe(e.config);
        logEvent("tengu_mcp_degraded", {
          reason: "tools_list_failed",
          transportType: e.config.type ?? "stdio",
          ...o,
          ...(xbe(e.name, e.config) && {
            mcpServerName: Bl(e.name)
          })
        });
        AM.cache.delete(e.name);
        return [];
      }
    }, e => e.name, 20);
    n3 = mk(async e => {
      if (e.type !== "connected") {
        return [];
      }
      try {
        if (!e.capabilities?.resources) {
          return [];
        }
        let t = await kGn(e.client, e.name, "resources/list", cHe, n => n.resources);
        Pe("mcp_list_resources");
        return t.map(n => ({
          ...n,
          server: e.name
        }));
      } catch (t) {
        Ae("mcp_list_resources", "mcp_list_resources_failed");
        uu(e.name, `Failed to fetch resources: ${he(t)}`);
        n3.cache.delete(e.name);
        return [];
      }
    }, e => e.name, 20);
    ype = mk(async e => {
      if (e.type !== "connected") {
        return [];
      }
      try {
        if (!e.capabilities?.resources) {
          return [];
        }
        let t = await kGn(e.client, e.name, "resources/templates/list", rOt, n => n.resourceTemplates);
        logEvent("tengu_mcp_resource_templates_fetched", {
          template_count: t.length
        });
        Pe("mcp_list_resource_templates");
        return t.map(n => ({
          ...n,
          server: e.name
        }));
      } catch (t) {
        ype.cache.delete(e.name);
        dn(e.name, `Failed to fetch resource templates: ${he(t)}`);
        return [];
      }
    }, e => e.name, 20);
    yQ = mk(async e => {
      if (e.type !== "connected") {
        return [];
      }
      try {
        if (!e.capabilities?.prompts) {
          return [];
        }
        let t = await kGn(e.client, e.name, "prompts/list", sOt, s => s.prompts);
        let n = m3(t);
        Pe("mcp_list_prompts");
        let r = e.config;
        let o = (r.type === "http" || r.type === "sse") && M8(r.url);
        return n.map(s => {
          let i = Object.values(s.arguments ?? {});
          let a = i.map(l => l.name);
          return {
            type: "prompt",
            name: "mcp__" + Bl(e.name) + "__" + s.name,
            description: s.description ?? "",
            hasUserSpecifiedDescription: !!s.description,
            contentLength: 0,
            isEnabled: () => true,
            isHidden: false,
            isMcp: true,
            progressMessage: "running",
            userFacingName() {
              return o ? s.name : `${e.name}:${s.name} (MCP)`;
            },
            aliases: o ? [`${e.name}:${s.name}`, `${e.name}:${s.name} (MCP)`] : undefined,
            argNames: a,
            source: "mcp",
            async getPromptForCommand(l, c) {
              let u = l.trim();
              let d = u ? u.split(/\s+/) : [];
              try {
                let p = i.filter((y, _) => y.required && d[_] === undefined).map(y => y.name);
                if (p.length > 0) {
                  throw Error(`Missing required ${un(p.length, "argument")}: ${p.join(", ")}. Usage: /mcp__${Bl(e.name)}__${s.name} ${a.join(" ")}`);
                }
                let m = await iEe(e);
                let f = await m.client.getPrompt({
                  name: s.name,
                  arguments: R1p(a, d)
                });
                let h = Yg(c.options.mainLoopModel);
                let g = await Promise.all(f.messages.map(y => zTo(y.content, m.name, h)));
                Pe("mcp_get_prompt");
                return g.flat();
              } catch (p) {
                throw Ae("mcp_get_prompt", "mcp_get_prompt_failed"), uu(e.name, `Error running command '${s.name}': ${he(p)}`), p;
              }
            }
          };
        });
      } catch (t) {
        Ae("mcp_list_prompts", "mcp_list_prompts_failed");
        uu(e.name, `Failed to fetch commands: ${he(t)}`);
        yQ.cache.delete(e.name);
        return [];
      }
    }, e => e.name, 20);
  });