  __export(mQi, {
    shouldOfferTerminalSetup: () => shouldOfferTerminalSetup,
    setupTerminal: () => setupTerminal,
    readVSCodeScrollSensitivity: () => readVSCodeScrollSensitivity,
    markBackslashReturnUsed: () => markBackslashReturnUsed,
    isShiftEnterKeyBindingInstalled: () => isShiftEnterKeyBindingInstalled,
    installVSCodeGpuAccelerationOff: () => installVSCodeGpuAccelerationOff,
    hasUsedBackslashReturn: () => hasUsedBackslashReturn,
    getNativeCSIuTerminalDisplayName: () => getNativeCSIuTerminalDisplayName,
    enableITerm2ClipboardAccess: () => enableITerm2ClipboardAccess,
    call: () => call
  });
  function gLn() {
    let e = process.env.VSCODE_GIT_ASKPASS_MAIN ?? "";
    let t = process.env.PATH ?? "";
    return e.includes(".vscode-server") || e.includes(".cursor-server") || e.includes(".windsurf-server") || e.includes(".devin-server") || t.includes(".vscode-server") || t.includes(".cursor-server") || t.includes(".windsurf-server") || t.includes(".devin-server");
  }
  function getNativeCSIuTerminalDisplayName() {
    if (!Me.terminal || !(Me.terminal in hLn)) {
      return null;
    }
    return hLn[Me.terminal] ?? null;
  }
  function Q2(e) {
    if (!Hk()) {
      return e;
    }
    return `\x1B]8;;${uQi.pathToFileURL(e).href}\x07${e}\x1B]8;;\x07`;
  }
  function pLn() {
    return "";
  }
  function shouldOfferTerminalSetup() {
    return Pre.platform() === "darwin" && Me.terminal === "Apple_Terminal" || Me.terminal === "vscode" || Me.terminal === "cursor" || Me.terminal === "windsurf" || Me.terminal === "alacritty" || Me.terminal === "zed";
  }
  async function setupTerminal(e) {
    let t = "";
    switch (Me.terminal) {
      case "Apple_Terminal":
        t = await trp(e);
        break;
      case "vscode":
        t = await too("VSCode", e);
        t += await eoo("VSCode", e);
        t += await installVSCodeGpuAccelerationOff("VSCode", e);
        break;
      case "cursor":
        t = await too("Cursor", e);
        t += await eoo("Cursor", e);
        t += await installVSCodeGpuAccelerationOff("Cursor", e);
        break;
      case "windsurf":
        t = await too("Devin Desktop", e);
        t += await eoo("Devin Desktop", e);
        t += await installVSCodeGpuAccelerationOff("Devin Desktop", e);
        break;
      case "alacritty":
        t = await nrp(e);
        break;
      case "zed":
        t = await rrp(e);
        break;
      case null:
        break;
    }
    saveGlobalConfig(n => {
      if (["vscode", "cursor", "windsurf", "alacritty", "zed"].includes(Me.terminal ?? "")) {
        if (n.shiftEnterKeyBindingInstalled === true) {
          return n;
        }
        return {
          ...n,
          shiftEnterKeyBindingInstalled: true
        };
      } else if (Me.terminal === "Apple_Terminal") {
        if (n.optionAsMetaKeyInstalled === true) {
          return n;
        }
        return {
          ...n,
          optionAsMetaKeyInstalled: true
        };
      }
      return n;
    });
    Zct();
    return t;
  }
  async function enableITerm2ClipboardAccess(e) {
    let t = _$u.dim('iTerm2 \u2192 Settings \u2192 General \u2192 Selection \u2192 check "Applications in terminal may access clipboard"');
    try {
      let {
        stdout: n,
        code: r
      } = await execFileNoThrow("defaults", ["read", "com.googlecode.iterm2", "AllowClipboardAccess"]);
      if (r === 0 && n.trim() === "1") {
        return `${color("success", e)("iTerm2 clipboard access already enabled")}${Ma}${Ma}`;
      }
      let {
        code: o
      } = await execFileNoThrow("defaults", ["write", "com.googlecode.iterm2", "AllowClipboardAccess", "-bool", "true"]);
      if (o !== 0) {
        return `${color("warning", e)("Couldn't update iTerm2 clipboard setting.")}${Ma}${t}${Ma}${Ma}`;
      }
      return `${color("success", e)('Enabled "Applications in terminal may access clipboard" in iTerm2')}${Ma}${_$u.dim("Restart iTerm2 for this to take effect. Undo: defaults write com.googlecode.iterm2 AllowClipboardAccess -bool false")}${Ma}${Ma}`;
    } catch (n) {
      Oe(n);
      return `${color("warning", e)("Couldn't update iTerm2 clipboard setting.")}${Ma}${t}${Ma}${Ma}`;
    }
  }
  function isShiftEnterKeyBindingInstalled() {
    return getGlobalConfig().shiftEnterKeyBindingInstalled === true;
  }
  function hasUsedBackslashReturn() {
    return getGlobalConfig().hasUsedBackslashReturn === true;
  }
  function markBackslashReturnUsed() {
    if (!getGlobalConfig().hasUsedBackslashReturn) {
      saveGlobalConfig(t => ({
        ...t,
        hasUsedBackslashReturn: true
      }));
    }
  }
  async function call(e, t, n) {
    if (Pre.platform() === "darwin" && process.env.__CFBundleIdentifier === "com.googlecode.iterm2" && (Me.terminal === "iTerm.app" || Me.terminal === "tmux" || Me.terminal === "screen" || Me.terminal === null)) {
      let s = `${await enableITerm2ClipboardAccess(t.options.theme)}Shift+Enter is natively supported in iTerm2.

No configuration needed. Just use Shift+Enter to add newlines.${pLn()}`;
      e(s);
      return null;
    }
    if (Me.terminal && Me.terminal in hLn) {
      let o = `Shift+Enter is natively supported in ${hLn[Me.terminal]}.

No configuration needed. Just use Shift+Enter to add newlines.${pLn()}`;
      e(o);
      return null;
    }
    if (!shouldOfferTerminalSetup()) {
      let o = Me.terminal || "your current terminal";
      let s = Wt();
      let i = "";
      if (s === "macos") {
        i = `   \u2022 macOS: Apple Terminal
`;
      }
      let a = process.env.LC_TERMINAL === "iTerm2" ? `${Ma}${Ma}You appear to be connected from iTerm2 on another machine. For /copy to reach your local clipboard, on that machine open:${Ma}${_$u.dim('iTerm2 \u2192 Settings \u2192 General \u2192 Selection \u2192 check "Applications in terminal may access clipboard"')}` : "";
      let l = `Terminal setup cannot be run from ${o}.

This command configures a convenient Shift+Enter shortcut for multi-line prompts.
${_$u.dim("Note: You can already use backslash (\\\\) + return to add newlines.")}

To set up the shortcut (optional):
1. Exit tmux/screen temporarily
2. Run /terminal-setup directly in one of these terminals:
${i}   \u2022 IDE: VSCode, Cursor, Devin Desktop, Zed
   \u2022 Other: Alacritty
3. Return to tmux/screen - settings will persist

${_$u.dim("Note: iTerm2, WezTerm, Ghostty, Kitty, Warp, and Windows Terminal support Shift+Enter natively.")}${a}${pLn()}`;
      e(l);
      return null;
    }
    let r = await setupTerminal(t.options.theme);
    e(r + pLn());
    return null;
  }
  function ioo(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  async function readVSCodeScrollSensitivity() {
    let e = erp();
    if (!e || gLn()) {
      return null;
    }
    try {
      let t = await qk.readFile(X2.join(await _Ln(e), "settings.json"), {
        encoding: "utf-8"
      });
      let n = gMt(t);
      let r = ioo(n) ? n["terminal.integrated.mouseWheelScrollSensitivity"] : undefined;
      return {
        editor: e,
        sensitivity: typeof r === "number" ? r : null,
        recommended: 3
      };
    } catch (t) {
      if (!Io(t)) {
        Oe(t);
      }
      return {
        editor: e,
        sensitivity: null,
        recommended: 3
      };
    }
  }
  function erp() {
    switch (Me.terminal) {
      case "vscode":
        return "VSCode";
      case "cursor":
        return "Cursor";
      case "windsurf":
        return "Devin Desktop";
      default:
        return null;
    }
  }
  async function eoo(e, t) {
    let n = _$u.dim(`For smoother scrolling, set "${"terminal.integrated.mouseWheelScrollSensitivity"}": ${3} in ${e} settings.`);
    if (gLn()) {
      return `${n}${Ma}`;
    }
    let r = X2.join(await _Ln(e), "settings.json");
    try {
      let o = "{}";
      let s = false;
      try {
        o = await qk.readFile(r, {
          encoding: "utf-8"
        });
        s = true;
      } catch (l) {
        if (!Io(l)) {
          throw l;
        }
      }
      let i = gMt(o);
      if (!ioo(i)) {
        return `${color("warning", t)(`${e} settings.json isn't a JSON object; not modifying it.`)}${Ma}${n}${Ma}`;
      }
      if ("terminal.integrated.mouseWheelScrollSensitivity" in i) {
        return `${color("success", t)(`${e} ${"terminal.integrated.mouseWheelScrollSensitivity"} already set; leaving as-is`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}`;
      }
      let a = u1r(o, "terminal.integrated.mouseWheelScrollSensitivity", 3);
      if (a === o) {
        return `${color("warning", t)(`Couldn't update ${e} settings.json.`)}${Ma}${n}${Ma}`;
      }
      if (s) {
        let l = `${r}.${nut.randomBytes(4).toString("hex")}.bak`;
        try {
          await qk.copyFile(r, l);
        } catch {
          return `${color("warning", t)(`Couldn't back up ${e} settings.json; not modifying it.`)}${Ma}${n}${Ma}`;
        }
      }
      await qk.writeFile(r, a, {
        encoding: "utf-8"
      });
      return `${color("success", t)(`Set ${e} terminal scroll sensitivity to ${3}`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}`;
    } catch (o) {
      logForDebugging(`Couldn't update ${e} settings.json at ${r}: ${o instanceof Error ? o.message : String(o)}`, {
        level: "error"
      });
      return `${color("warning", t)(`Couldn't update ${e} settings.json.`)}${Ma}${n}${Ma}`;
    }
  }
  async function installVSCodeGpuAccelerationOff(e, t) {
    let n = _$u.dim(`To fix garbled text, set "${"terminal.integrated.gpuAcceleration"}": "${"off"}" in ${e} settings (undo: set it back to "auto").`);
    if (gLn()) {
      Et("terminal_setup_gpu_accel", "remote_ssh");
      return `${n}${Ma}`;
    }
    let r = X2.join(await _Ln(e), "settings.json");
    try {
      let o = "{}";
      let s = false;
      try {
        o = await qk.readFile(r, {
          encoding: "utf-8"
        });
        s = true;
      } catch (l) {
        if (!Io(l)) {
          throw l;
        }
      }
      let i = gMt(o);
      if (!ioo(i)) {
        Et("terminal_setup_gpu_accel", "not_json_object");
        return `${color("warning", t)(`${e} settings.json isn't a JSON object; not modifying it.`)}${Ma}${n}${Ma}`;
      }
      if (i["terminal.integrated.gpuAcceleration"] === "off") {
        Pe("terminal_setup_gpu_accel");
        return `${color("success", t)(`${e} GPU acceleration already off; leaving as-is`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}`;
      }
      let a = u1r(o, "terminal.integrated.gpuAcceleration", "off");
      if (a === o) {
        Et("terminal_setup_gpu_accel", "write_failed");
        return `${color("warning", t)(`Couldn't update ${e} settings.json.`)}${Ma}${n}${Ma}`;
      }
      if (s) {
        let l = `${r}.${nut.randomBytes(4).toString("hex")}.bak`;
        try {
          await qk.copyFile(r, l);
        } catch {
          Et("terminal_setup_gpu_accel", "backup_failed");
          return `${color("warning", t)(`Couldn't back up ${e} settings.json; not modifying it.`)}${Ma}${n}${Ma}`;
        }
      }
      await qk.writeFile(r, a, {
        encoding: "utf-8"
      });
      Pe("terminal_setup_gpu_accel");
      return `${color("success", t)(`Turned off ${e} GPU acceleration to fix garbled text`)}${Ma}${_$u.dim(`Reload the ${e} window to apply. Undo: set "${"terminal.integrated.gpuAcceleration"}" back to "auto".`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}`;
    } catch (o) {
      Et("terminal_setup_gpu_accel", "write_failed");
      logForDebugging(`Couldn't update ${e} settings.json at ${r}: ${o instanceof Error ? o.message : String(o)}`, {
        level: "error"
      });
      return `${color("warning", t)(`Couldn't update ${e} settings.json.`)}${Ma}${n}${Ma}`;
    }
  }
  async function too(e = "VSCode", t) {
    if (gLn()) {
      return `${color("warning", t)(`Cannot install keybindings from a remote ${e} session.`)}${Ma}${Ma}${e} keybindings must be installed on your local machine, not the remote server.${Ma}${Ma}To install the Shift+Enter keybinding:${Ma}1. Open ${e} on your local machine (not connected to remote)${Ma}2. Open the Command Palette (Cmd/Ctrl+Shift+P) \u2192 "Preferences: Open Keyboard Shortcuts (JSON)"${Ma}3. Add this keybinding (the file must be a JSON array):${Ma}${Ma}${_$u.dim(`[
  {
    "key": "shift+enter",
    "command": "workbench.action.terminal.sendSequence",
    "args": { "text": "\\u001b\\r" },
    "when": "terminalFocus"
  }
]`)}${Ma}`;
    }
    let n = await _Ln(e);
    let r = X2.join(n, "keybindings.json");
    try {
      await qk.mkdir(n, {
        recursive: true
      });
      let o = "[]";
      let s = [];
      let i = false;
      try {
        o = await qk.readFile(r, {
          encoding: "utf-8"
        });
        i = true;
        s = gMt(o) ?? [];
      } catch (u) {
        if (!Io(u)) {
          throw u;
        }
      }
      if (i) {
        let u = nut.randomBytes(4).toString("hex");
        let d = `${r}.${u}.bak`;
        try {
          await qk.copyFile(r, d);
        } catch {
          return `${color("warning", t)(`Error backing up existing ${e} terminal keybindings. Bailing out.`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}${_$u.dim(`Backup path: ${Q2(d)}`)}${Ma}`;
        }
      }
      let a = {
        key: "shift+enter",
        command: "workbench.action.terminal.sendSequence",
        args: {
          text: "\x1B\r"
        },
        when: "terminalFocus"
      };
      let l = s.find(u => u.key === a.key && u.command === a.command && u.when === a.when);
      if (l) {
        let u = _$u.dim(`See ${Q2(r)}`);
        if (l.args?.text === a.args.text) {
          return `${color("success", t)(`${e} terminal Shift+Enter key binding already configured`)}${Ma}${u}${Ma}`;
        }
        return `${color("warning", t)(`${e} already has a Shift+Enter terminal binding with different args; leaving it as-is.`)}${Ma}${u}${Ma}`;
      }
      let c = sPs(o, a);
      await qk.writeFile(r, c, {
        encoding: "utf-8"
      });
      return `${color("success", t)(`Installed ${e} terminal Shift+Enter key binding`)}${Ma}${_$u.dim(`See ${Q2(r)}`)}${Ma}`;
    } catch (o) {
      throw logForDebugging(`Failed to install ${e} terminal Shift+Enter keybinding: ${o instanceof Error ? o.message : String(o)}`, {
        level: "error"
      }), Error(`Failed to install ${e} terminal Shift+Enter key binding`);
    }
  }
  async function lQi(e) {
    let {
      code: t
    } = await execFileNoThrow("/usr/libexec/PlistBuddy", ["-c", `Add :'Window Settings':'${e}':useOptionAsMetaKey bool true`, tut()]);
    if (t !== 0) {
      let {
        code: n
      } = await execFileNoThrow("/usr/libexec/PlistBuddy", ["-c", `Set :'Window Settings':'${e}':useOptionAsMetaKey true`, tut()]);
      if (n !== 0) {
        logForDebugging(`Failed to enable Option as Meta key for Terminal.app profile: ${e}`, {
          level: "error"
        });
        return false;
      }
    }
    return true;
  }
  async function cQi(e) {
    let {
      code: t
    } = await execFileNoThrow("/usr/libexec/PlistBuddy", ["-c", `Add :'Window Settings':'${e}':Bell bool false`, tut()]);
    if (t !== 0) {
      let {
        code: n
      } = await execFileNoThrow("/usr/libexec/PlistBuddy", ["-c", `Set :'Window Settings':'${e}':Bell false`, tut()]);
      if (n !== 0) {
        logForDebugging(`Failed to disable audio bell for Terminal.app profile: ${e}`, {
          level: "error"
        });
        return false;
      }
    }
    return true;
  }
  async function trp(e) {
    let t = (PTs() ?? 0) >= 27;
    try {
      if (!(await iQi())) {
        throw Error("Failed to create backup of Terminal.app preferences, bailing out");
      }
      let {
        stdout: r,
        code: o
      } = await execFileNoThrow("defaults", ["read", "com.apple.Terminal", "Default Window Settings"]);
      if (o !== 0 || !r.trim()) {
        throw Error("Failed to read default Terminal.app profile");
      }
      let {
        stdout: s,
        code: i
      } = await execFileNoThrow("defaults", ["read", "com.apple.Terminal", "Startup Window Settings"]);
      if (i !== 0 || !s.trim()) {
        throw Error("Failed to read startup Terminal.app profile");
      }
      let a = false;
      let l = r.trim();
      let c = t ? false : await lQi(l);
      let u = await cQi(l);
      if (c || u) {
        a = true;
      }
      let d = s.trim();
      if (d !== l) {
        let f = t ? false : await lQi(d);
        let h = await cQi(d);
        if (f || h) {
          a = true;
        }
      }
      if (!a) {
        throw Error("Failed to enable Option as Meta key or disable audio bell for any Terminal.app profile");
      }
      await execFileNoThrow("killall", ["cfprefsd"]);
      eut();
      let p = [color("success", e)("Configured Terminal.app settings:")];
      if (!t) {
        p.push(color("success", e)('- Enabled "Use Option as Meta key"'));
      }
      p.push(color("success", e)("- Switched to visual bell"));
      let m = t ? _$u.dim("Shift+Return will now enter a newline.") : _$u.dim("Option+Enter will now enter a newline.");
      return `${p.join(Ma)}${Ma}${m}${Ma}${_$u.dim("You must restart Terminal.app for changes to take effect.")}${Ma}`;
    } catch (n) {
      logForDebugging(`Terminal.app setup failed: ${n instanceof Error ? n.message : String(n)}`, {
        level: "error"
      });
      let r = await dLn();
      let o = "Failed to enable Option as Meta key for Terminal.app.";
      if (r.status === "restored") {
        throw Error(`${o} Your settings have been restored from backup.`);
      } else if (r.status === "failed") {
        throw Error(`${o} Restoring from backup failed, try manually with: defaults import com.apple.Terminal ${r.backupPath}`);
      } else {
        throw Error(`${o} No backup was available to restore from.`);
      }
    }
  }
  async function nrp(e) {
    let n = [];
    let r = process.env.XDG_CONFIG_HOME;
    if (r) {
      n.push(X2.join(r, "alacritty", "alacritty.toml"));
    } else {
      n.push(X2.join(Pre.homedir(), ".config", "alacritty", "alacritty.toml"));
    }
    if (Pre.platform() === "win32") {
      let a = process.env.APPDATA;
      if (a) {
        n.push(X2.join(a, "alacritty", "alacritty.toml"));
      }
    }
    let o = null;
    let s = "";
    let i = false;
    for (let a of n) {
      try {
        s = await qk.readFile(a, {
          encoding: "utf-8"
        });
        o = a;
        i = true;
        break;
      } catch (l) {
        if (!Io(l)) {
          throw l;
        }
      }
    }
    if (!o) {
      o = n[0] ?? null;
    }
    if (!o) {
      throw Error("No valid config path found for Alacritty");
    }
    try {
      if (i) {
        if (s.includes('mods = "Shift"') && s.includes('key = "Return"')) {
          return `${color("success", e)("Alacritty Shift+Enter key binding already configured")}${Ma}${_$u.dim(`See ${Q2(o)}`)}${Ma}`;
        }
        let l = nut.randomBytes(4).toString("hex");
        let c = `${o}.${l}.bak`;
        try {
          await qk.copyFile(o, c);
        } catch {
          return `${color("warning", e)("Error backing up existing Alacritty config. Bailing out.")}${Ma}${_$u.dim(`See ${Q2(o)}`)}${Ma}${_$u.dim(`Backup path: ${Q2(c)}`)}${Ma}`;
        }
      } else {
        await qk.mkdir(X2.dirname(o), {
          recursive: true
        });
      }
      let a = s;
      if (s && !s.endsWith(`
`)) {
        a += `
`;
      }
      a += `
[[keyboard.bindings]]
key = "Return"
mods = "Shift"
chars = "\\u001B\\r"
`;
      await qk.writeFile(o, a, {
        encoding: "utf-8"
      });
      return `${color("success", e)("Installed Alacritty Shift+Enter key binding")}${Ma}${color("success", e)("You may need to restart Alacritty for changes to take effect")}${Ma}${_$u.dim(`See ${Q2(o)}`)}${Ma}`;
    } catch (a) {
      throw logForDebugging(`Failed to install Alacritty keybinding: ${a instanceof Error ? a.message : String(a)}`, {
        level: "error"
      }), Error("Failed to install Alacritty Shift+Enter key binding");
    }
  }
  async function rrp(e) {
    let t = X2.join(Pre.homedir(), ".config", "zed");
    let n = X2.join(t, "keymap.json");
    try {
      await qk.mkdir(t, {
        recursive: true
      });
      let r = "[]";
      let o = false;
      try {
        r = await qk.readFile(n, {
          encoding: "utf-8"
        });
        o = true;
      } catch (i) {
        if (!Io(i)) {
          throw i;
        }
      }
      if (o) {
        if (r.includes("shift-enter")) {
          return `${color("success", e)("Zed Shift+Enter key binding already configured")}${Ma}${_$u.dim(`See ${Q2(n)}`)}${Ma}`;
        }
        let i = nut.randomBytes(4).toString("hex");
        let a = `${n}.${i}.bak`;
        try {
          await qk.copyFile(n, a);
        } catch {
          return `${color("warning", e)("Error backing up existing Zed keymap. Bailing out.")}${Ma}${_$u.dim(`See ${Q2(n)}`)}${Ma}${_$u.dim(`Backup path: ${Q2(a)}`)}${Ma}`;
        }
      }
      let s;
      try {
        if (s = qt(r), !Array.isArray(s)) {
          s = [];
        }
      } catch {
        s = [];
      }
      s.push({
        context: "Terminal",
        bindings: {
          "shift-enter": ["terminal::SendText", "\x1B\r"]
        }
      });
      await qk.writeFile(n, De(s, null, 2) + `
`, {
        encoding: "utf-8"
      });
      return `${color("success", e)("Installed Zed Shift+Enter key binding")}${Ma}${_$u.dim(`See ${Q2(n)}`)}${Ma}`;
    } catch (r) {
      throw logForDebugging(`Failed to install Zed Shift+Enter key binding: ${r instanceof Error ? r.message : String(r)}`, {
        level: "error"
      }), Error("Failed to install Zed Shift+Enter key binding");
    }
  }
  var nut;
  var qk;
  var Pre;
  var X2;
  var uQi;
  var Ma = `
`;
  var hLn;
  var _Ln;
  var zPe = __lazy(() => {
    uG();
    et();
    Ejt();
    ln();
    Jro();
    Qro();
    je();
    pr();
    dt();
    ji();
    Zl();
    zp();
    Gd();
    Rn();
    Cs();
    nut = require("crypto");
    qk = require("fs/promises");
    Pre = require("os");
    X2 = require("path");
    uQi = require("url");
    hLn = {
      ghostty: "Ghostty",
      kitty: "Kitty",
      "iTerm.app": "iTerm2",
      WezTerm: "WezTerm",
      WarpTerminal: "Warp",
      "windows-terminal": "Windows Terminal"
    };
    _Ln = TEr(async e => {
      let t = n => X2.join(Pre.homedir(), Pre.platform() === "win32" ? X2.join("AppData", "Roaming", n, "User") : Pre.platform() === "darwin" ? X2.join("Library", "Application Support", n, "User") : X2.join(".config", n, "User"));
      if (e === "VSCode") {
        return t("Code");
      }
      if (e === "Devin Desktop") {
        let n = t("Devin");
        return (await ad(n)) ? n : t("Windsurf");
      }
      return t(e);
    }, e => `${e}:${Pre.homedir()}`);
  });
  function irp(e, t) {
    switch (t.type) {
      case "kill":
        {
          if (t.text.length === 0) {
            return e;
          }
          return {
            ring: e.mode.type === "killing" && e.ring.length > 0 ? [t.direction === "prepend" ? t.text + e.ring[0] : e.ring[0] + t.text, ...e.ring.slice(1)] : [t.text, ...e.ring].slice(0, 10),
            mode: {
              type: "killing"
            }
          };
        }
      case "yank":
        return {
          ...e,
          mode: {
            type: "yanked",
            start: t.start,
            length: t.length,
            index: 0
          }
        };
      case "yankPop":
        {
          if (e.mode.type !== "yanked" || e.ring.length <= 1) {
            return e;
          }
          let n = (e.mode.index + 1) % e.ring.length;
          return {
            ...e,
            mode: {
              ...e.mode,
              index: n
            }
          };
        }
      case "updateYankLength":
        if (e.mode.type !== "yanked") {
          return e;
        }
        return {
          ...e,
          mode: {
            ...e.mode,
            length: t.length
          }
        };
      case "interrupt":
        if (e.mode.type === "idle") {
          return e;
        }
        return {
          ...e,
          mode: {
            type: "idle"
          }
        };
    }
  }
  function bLn(e) {
    return e.ring[0] ?? "";
  }
  function SLn(e) {
    if (e.mode.type !== "yanked" || e.ring.length <= 1) {
      return null;
    }
    let t = (e.mode.index + 1) % e.ring.length;
    let {
      start: n,
      length: r
    } = e.mode;
    return {
      text: e.ring[t] ?? "",
      start: n,
      length: r
    };
  }
  function fQi() {
    let e = srp;
    return {
      get state() {
        return e;
      },
      dispatch(t) {
        e = irp(e, t);
      }
    };
  }
  function gQi({
    children: e
  }) {
    let t = rut.useRef(null);
    if (t.current === null) {
      t.current = fQi();
    }
    return yQi.jsx(hQi.Provider, {
      value: t.current,
      children: e
    });
  }
  function TLn() {
    return rut.useContext(hQi);
  }
  var rut;
  var yQi;
  var srp;
  var hQi;
  var ELn = __lazy(() => {
    rut = __toESM(ot(), 1);
    yQi = __toESM(ie(), 1);
    srp = {
      ring: [],
      mode: {
        type: "idle"
      }
    };
    hQi = rut.createContext(fQi());
  });
  function _Qi() {
    return null ?? 1e7;
  }
  function urp(e, t) {
    let n = Iue.get(e);
    if (n !== undefined) {
      Cjt -= n.length;
      Iue.delete(e);
    }
    if (t.length > _Qi()) {
      return;
    }
    Iue.set(e, t);
    Cjt += t.length;
    while (Cjt > _Qi()) {
      let r = Iue.keys().next().value;
      Cjt -= Iue.get(r).length;
      Iue.delete(r);
    }
  }
  function loo() {
    return wLn.join(er(), "paste-cache");
  }
  function SQi(e) {
    return bQi.createHash("sha256").update(e).digest("hex").slice(0, 16);
  }
  function TQi(e) {
    return wLn.join(loo(), `${e}.txt`);
  }
  function EQi(e, t) {
    vLn.set(e, t);
    return drp(e, t);
  }
  async function drp(e, t) {
    try {
      let n = Ys();
      let r = loo();
      await n.mkdir(r);
      let o = TQi(e);
      if (await n.write(o, t, 384), vLn.delete(e), Iue.vZc(e)) {
        Cjt -= Iue.get(e).length;
        Iue.delete(e);
      }
      logForDebugging(`Stored paste ${e} to ${o}`);
      Pe("paste_store");
    } catch (n) {
      vLn.delete(e);
      urp(e, t);
      logForDebugging(`Failed to store paste: ${n}`);
      Et("paste_store", "paste_store_write_failed");
    }
  }
  async function vQi(e) {
    let t = vLn.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = Iue.get(e);
    if (n !== undefined) {
      return n;
    }
    try {
      let r = TQi(e);
      return await Ys().read(r);
    } catch (r) {
      if (!fn(r)) {
        logForDebugging(`Failed to retrieve paste ${e}: ${r}`);
      }
      return null;
    }
  }
  async function wQi(e) {
    let t = Ys();
    let n = loo();
    let r;
    try {
      r = await t.list(n);
    } catch {
      return;
    }
    let o = e.getTime();
    for (let s of r) {
      if (!s.endsWith(".txt")) {
        continue;
      }
      let i = wLn.join(n, s);
      try {
        if ((await t.stat(i)).mtimeMs < o) {
          await t.delete(i);
          logForDebugging(`Cleaned up old paste: ${i}`);
        }
      } catch {}
    }
  }
  var bQi;
  var wLn;
  var vLn;
  var Iue;
  var Cjt = 0;
  var coo = __lazy(() => {
    ln();
    _b();
    je();
    gn();
    dt();
    bQi = require("crypto");
    wLn = require("path");
    vLn = new Map();
    Iue = new Map();
  });
  function KPe(e) {
    return (e.match(/\r\n|\r|\n/g) || []).length;
  }
  function out(e, t) {
    if (t === 0) {
      return `[Pasted text #${e}]`;
    }
    return `[Pasted text #${e} +${t} lines]`;
  }
  function ALn(e) {
    return `[Image #${e}]`;
  }
  function h1(e) {
    if (!e) {
      return [];
    }
    let t = /\[(Pasted text|Image|\.\.\.Truncated text) #(\d+)(?: \+\d+ lines)?(\.)*\]/g;
    return [...e.matchAll(t)].map(r => ({
      id: parseInt(r[2] || "0"),
      match: r[0],
      index: r.index
    })).filter(r => r.id > 0);
  }
  function mrp(e) {
    return e.match.startsWith("[...Truncated text") ? `[...Truncated text #${e.id} \u2014 content no longer available...]` : `[Pasted text #${e.id} \u2014 content no longer available]`;
  }
  function nX(e, t) {
    let n = h1(e);
    let r = e;
    for (let o = n.length - 1; o >= 0; o--) {
      let s = n[o];
      let i = t[s.id];
      if (i?.type !== "text") {
        continue;
      }
      r = r.slice(0, s.index) + i.content + r.slice(s.index + s.match.length);
    }
    return r;
  }
  function xQi(e, t) {
    let n = null;
    for (let o of h1(e)) {
      if (t[o.id]?.type !== "text") {
        continue;
      }
      if (!n || o.id > n.id) {
        n = o;
      }
    }
    if (!n) {
      return null;
    }
    let r = t[n.id].content;
    if (r.length > 1e5) {
      return null;
    }
    return {
      expanded: e.slice(0, n.index) + r + e.slice(n.index + n.match.length),
      id: n.id,
      cursorOffset: n.index + r.length
    };
  }
  function frp(e) {
    return qt(e);
  }
  async function* PLn() {
    let e = Pue.slice();
    let t = new Set(e.map(o => `${o.timestamp}\x00${o.sessionId ?? ""}`));
    for (let o = e.length - 1; o >= 0; o--) {
      yield e[o];
    }
    let n = doo.join(er(), "history.jsonl");
    let r = false;
    try {
      for await (let o of Jcn(n)) {
        try {
          let s = frp(o);
          let i = `${s.timestamp}\x00${s.sessionId ?? ""}`;
          if (IQi.vZc(i) || t.vZc(i)) {
            continue;
          }
          yield s;
        } catch (s) {
          logForDebugging(`Failed to parse history line: ${s}`);
          r = true;
        }
      }
      if (r) {
        Et("history_load", "history_load_parse_failed");
      } else {
        Pe("history_load");
      }
    } catch (o) {
      if (en(o) === "ENOENT") {
        Pe("history_load");
        return;
      }
      throw o;
    }
  }
  async function* poo() {
    for await (let e of PLn()) {
      yield await RLn(e);
    }
  }
  async function* kQi(e = "project") {
    let t = getProjectRoot();
    let n = getSessionId();
    let r = new Set();
    for await (let o of PLn()) {
      if (!o || typeof o.project !== "string") {
        continue;
      }
      if (e === "project" && o.project !== t) {
        continue;
      }
      if (e === "session" && o.sessionId !== n) {
        continue;
      }
      if (r.vZc(o.display)) {
        continue;
      }
      if (r.add(o.display), yield {
        display: o.display,
        timestamp: o.timestamp,
        resolve: () => RLn(o)
      }, r.size >= 100) {
        return;
      }
    }
  }
  async function AQi(e) {
    let t = getProjectRoot();
    let n = 0;
    let r = 0;
    try {
      for await (let o of PLn()) {
        if (!o || typeof o.project !== "string") {
          continue;
        }
        if (o.project !== t) {
          continue;
        }
        if (n++, !e || e(o.display)) {
          r++;
        }
        if (n >= 100) {
          break;
        }
      }
    } catch {
      return null;
    }
    return r;
  }
  async function* DLn() {
    let e = getProjectRoot();
    let t = getSessionId();
    let n = [];
    let r = 0;
    for await (let o of PLn()) {
      if (!o || typeof o.project !== "string") {
        continue;
      }
      if (o.project !== e) {
        continue;
      }
      if (o.sessionId === t) {
        yield await RLn(o);
        r++;
      } else {
        n.push(o);
      }
      if (r + n.length >= 100) {
        break;
      }
    }
    for (let o of n) {
      if (r >= 100) {
        return;
      }
      yield await RLn(o);
      r++;
    }
  }
  async function hrp(e) {
    if (e.content) {
      return {
        id: e.id,
        type: e.type,
        content: e.content,
        mediaType: e.mediaType,
        filename: e.filename
      };
    }
    if (e.contentHash) {
      let t = await vQi(e.contentHash);
      if (t) {
        return {
          id: e.id,
          type: e.type,
          content: t,
          mediaType: e.mediaType,
          filename: e.filename
        };
      }
    }
    return null;
  }
  function grp(e) {
    let t = e ?? "missing-hash";
    if (CQi.vZc(t)) {
      return;
    }
    CQi.add(t);
    Et("paste_store", "paste_store_content_lost");
  }
  function yrp(e, t) {
    if (t.size === 0) {
      return e;
    }
    let n = h1(e);
    let r = e;
    for (let o = n.length - 1; o >= 0; o--) {
      let s = n[o];
      if (!t.vZc(s.id) || s.match.startsWith("[Image")) {
        continue;
      }
      r = r.slice(0, s.index) + mrp(s) + r.slice(s.index + s.match.length);
    }
    return r;
  }
  async function RLn(e) {
    let t = e.pastedContents || {};
    let n = {};
    let r = new Set();
    for (let [o, s] of Object.entries(t)) {
      let i = await hrp(s);
      if (i) {
        n[Number(o)] = i;
      } else if (s.type === "text") {
        r.add(Number(o));
        grp(s.contentHash);
      }
    }
    return {
      display: yrp(e.display, r),
      pastedContents: n
    };
  }
  async function PQi() {
    if (Pue.length === 0) {
      return;
    }
    let e;
    try {
      let t = doo.join(er(), "history.jsonl");
      await Ys().append(t, "", 384);
      e = await Ry(t, {
        stale: 1e4,
        retries: {
          retries: 3,
          minTimeout: 50
        },
        onCompromised: r => logForDebugging(`History lock compromised: ${r}`, {
          level: "error"
        })
      });
      let n = Pue.map(r => De(r) + `
`);
      Pue = [];
      await Ys().append(t, n.join(""), 384);
      Pe("history_save");
    } catch (t) {
      logForDebugging(`Failed to write prompt history: ${t}`);
      Et("history_save", "history_save_write_failed");
    } finally {
      if (e) {
        await e().catch(Oe);
      }
    }
  }
  async function OQi(e) {
    if (uoo || Pue.length === 0) {
      return;
    }
    if (e > 5) {
      return;
    }
    uoo = true;
    try {
      await PQi();
    } finally {
      if (uoo = false, Pue.length > 0) {
        await sleep(500);
        OQi(e + 1);
      }
    }
  }
  function _rp(e, t, n, r) {
    if (!e || e.display !== t.display) {
      return false;
    }
    if (e.project !== n || e.sessionId !== r) {
      return false;
    }
    let o = Object.keys(e.pastedContents).length > 0;
    let s = !!t.pastedContents && Object.keys(t.pastedContents).length > 0;
    return !o && !s;
  }
  async function brp(e) {
    let t = typeof e === "string" ? {
      display: e,
      pastedContents: {}
    } : e;
    let n = getProjectRoot();
    let r = getSessionId();
    if (_rp(Rjt, t, n, r)) {
      kLn = true;
      return;
    }
    let o = {};
    if (t.pastedContents) {
      for (let [i, a] of Object.entries(t.pastedContents)) {
        if (a.type === "image") {
          continue;
        }
        if (a.content.length <= 1024) {
          o[Number(i)] = {
            id: a.id,
            type: a.type,
            content: a.content,
            mediaType: a.mediaType,
            filename: a.filename
          };
        } else {
          let l = SQi(a.content);
          o[Number(i)] = {
            id: a.id,
            type: a.type,
            contentHash: l,
            mediaType: a.mediaType,
            filename: a.filename
          };
          EQi(l, a.content);
        }
      }
    }
    let s = {
      ...t,
      pastedContents: o,
      timestamp: Date.now(),
      project: n,
      sessionId: r
    };
    Pue.push(s);
    Rjt = s;
    kLn = false;
    xLn = OQi(0);
  }
  function sut(e) {
    if (st(process.env.CLAUDE_CODE_SKIP_PROMPT_HISTORY) || isNestedInteractiveClaudeSession()) {
      return;
    }
    if (!RQi) {
      RQi = true;
      Ti(async () => {
        if (xLn) {
          await xLn;
        }
        if (Pue.length > 0) {
          await PQi();
        }
      });
    }
    brp(e);
  }
  function DQi() {
    if (kLn) {
      kLn = false;
      return;
    }
    if (!Rjt) {
      return;
    }
    let e = Rjt;
    Rjt = null;
    let t = Pue.lastIndexOf(e);
    if (t !== -1) {
      Pue.splice(t, 1);
    } else {
      IQi.add(`${e.timestamp}\x00${e.sessionId ?? ""}`);
    }
  }
  var doo;
  var OLn;
  var CQi;
  var Pue;
  var uoo = false;
  var xLn = null;
  var RQi = false;
  var Rjt = null;
  var kLn = false;
  var IQi;
  var gq = __lazy(() => {
    at();
    ln();
    _b();
    hd();
    je();
    gn();
    dt();
    Rn();
    coo();
    qp();
    doo = require("path");
    OLn = ["session", "project", "everywhere"];
    CQi = new Set();
    Pue = [];
    IQi = new Set();
  });
  class zl {
    measuredText;
    selection;
    offset;
    constructor(e, t = 0, n = 0) {
      this.measuredText = e;
      this.selection = n;
      this.offset = Math.max(0, Math.min(this.text.length, t));
    }
    static fromText(e, t, n = 0, r = 0) {
      return new zl(new MQi(e, t - 1), n, r);
    }
    getViewportStartLine(e) {
      if (e === undefined || e <= 0) {
        return 0;
      }
      let {
        line: t
      } = this.getPosition();
      let n = this.measuredText.getWrappedText();
      if (n.length <= e) {
        return 0;
      }
      let r = Math.floor(e / 2);
      let o = Math.max(0, t - r);
      let s = Math.min(n.length, o + e);
      if (s - o < e) {
        o = Math.max(0, s - e);
      }
      return o;
    }
    getViewportCharOffset(e) {
      let t = this.getViewportStartLine(e);
      if (t === 0) {
        return 0;
      }
      return this.measuredText.getWrappedLines()[t]?.startOffset ?? 0;
    }
    getViewportCharEnd(e) {
      let t = this.getViewportStartLine(e);
      let n = this.measuredText.getWrappedLines();
      if (e === undefined || e <= 0) {
        return this.text.length;
      }
      let r = Math.min(n.length, t + e);
      if (r >= n.length) {
        return this.text.length;
      }
      return n[r]?.startOffset ?? this.text.length;
    }
    render(e, t, n, r, o, s, i) {
      let a = this.measuredText.getWrappedLines();
      let l = this.getViewportStartLine(o);
      let c = o !== undefined && o > 0 ? Math.min(a.length, l + o) : a.length;
      if (s !== undefined) {
        let m = Math.min(s, this.offset);
        let f = Math.max(s, this.offset);
        let h = i ? this.findLogicalLineStart(m) : m;
        let g = i ? this.findLogicalLineEnd(f) : this.measuredText.nextOffset(f);
        return a.slice(l, c).map(y => {
          let _ = y.isPrecededByNewline ? y.text : y.text.trimStart();
          let b = y.text.length - _.length;
          let S = y.startOffset + b;
          let E = S + _.length;
          if (g <= S || h >= E) {
            if (S === E && h <= S && (i ? g >= E : g > E)) {
              return n(" ");
            }
            return _.trimEnd();
          }
          if (S === E) {
            return n(" ");
          }
          let C = Math.max(0, h - S);
          let x = Math.min(_.length, g - S);
          return _.slice(0, C) + n(_.slice(C, x)) + _.slice(x).trimEnd();
        }).join(`
`);
      }
      let {
        line: u,
        column: d
      } = this.getPosition();
      let p = this.measuredText.getWrappedText();
      return p.slice(l, c).map((m, f) => {
        let h = f + l;
        let g = m;
        if (t) {
          let A = Array.from(JS().segment(m));
          if (h === p.length - 1) {
            let k = Math.min(6, A.length);
            let I = A.length - k;
            let O = A.length > k ? A[I].index : 0;
            g = t.repeat(I) + m.slice(O);
          } else {
            g = t.repeat(A.length);
          }
        }
        if (u !== h) {
          return g.trimEnd();
        }
        let y = "";
        let _ = e;
        let b = "";
        let S = 0;
        let E = false;
        for (let {
          segment: A
        } of JS().segment(g)) {
          if (E) {
            b += A;
            continue;
          }
          let k = S + an(A);
          if (k > d) {
            _ = A;
            E = true;
          } else {
            S = k;
            y += A;
          }
        }
        let C;
        let x = "";
        if (r && h === p.length - 1 && this.isAtEnd() && r.text.length > 0) {
          let A = CIt(r.text) || r.text[0];
          C = e ? n(A) : A;
          let k = r.text.slice(A.length);
          if (k.length > 0) {
            x = r.dim(k);
          }
        } else {
          C = e ? n(_) : _;
        }
        return y + C + x + b.trimEnd();
      }).join(`
`);
    }
    left() {
      if (this.offset === 0) {
        return this;
      }
      let e = this.placeholderEndingAt(this.offset);
      if (e) {
        return new zl(this.measuredText, e.start);
      }
      let t = this.measuredText.prevOffset(this.offset);
      return new zl(this.measuredText, t);
    }
    right() {
      if (this.offset >= this.text.length) {
        return this;
      }
      let e = this.placeholderStartingAt(this.offset);
      if (e) {
        return new zl(this.measuredText, e.end);
      }
      let t = this.measuredText.nextOffset(this.offset);
      return new zl(this.measuredText, Math.min(t, this.text.length));
    }
    placeholderEndingAt(e) {
      let t = this.text.slice(0, e).match(Erp);
      return t ? {
        start: e - t[0].length,
        end: e
      } : null;
    }
    placeholderStartingAt(e) {
      let t = this.text.slice(e).match(vrp);
      return t ? {
        start: e,
        end: e + t[0].length
      } : null;
    }
    placeholderContaining(e) {
      for (let t of this.text.matchAll(wrp)) {
        let n = t.index;
        let r = n + t[0].length;
        if (e > n && e < r) {
          return {
            start: n,
            end: r
          };
        }
        if (n >= e) {
          break;
        }
      }
      return null;
    }
    snapOutOfPlaceholder(e, t) {
      let n = this.placeholderContaining(e);
      if (!n) {
        return e;
      }
      return t === "start" ? n.start : n.end;
    }
    up() {
      let {
        line: e,
        column: t
      } = this.getPosition();
      if (e === 0) {
        return this;
      }
      let n = this.measuredText.getWrappedText()[e - 1];
      if (n === undefined) {
        return this;
      }
      let r = an(n);
      if (t > r) {
        let s = this.getOffset({
          line: e - 1,
          column: r
        });
        return new zl(this.measuredText, s, 0);
      }
      let o = this.getOffset({
        line: e - 1,
        column: t
      });
      return new zl(this.measuredText, o, 0);
    }
    down() {
      let {
        line: e,
        column: t
      } = this.getPosition();
      if (e >= this.measuredText.lineCount - 1) {
        return this;
      }
      let n = this.measuredText.getWrappedText()[e + 1];
      if (n === undefined) {
        return this;
      }
      let r = an(n);
      if (t > r) {
        let s = this.getOffset({
          line: e + 1,
          column: r
        });
        return new zl(this.measuredText, s, 0);
      }
      let o = this.getOffset({
        line: e + 1,
        column: t
      });
      return new zl(this.measuredText, o, 0);
    }
    startOfCurrentLine() {
      let {
        line: e
      } = this.getPosition();
      return new zl(this.measuredText, this.getOffset({
        line: e,
        column: 0
      }), 0);
    }
    startOfLine() {
      let {
        line: e,
        column: t
      } = this.getPosition();
      if (t === 0 && e > 0) {
        return new zl(this.measuredText, this.getOffset({
          line: e - 1,
          column: 0
        }), 0);
      }
      return this.startOfCurrentLine();
    }
    firstNonBlankInLine() {
      let {
        line: e
      } = this.getPosition();
      let n = (this.measuredText.getWrappedText()[e] || "").match(/^\s*\S/);
      let r = n?.index ? n.index + n[0].length - 1 : 0;
      let o = this.getOffset({
        line: e,
        column: r
      });
      return new zl(this.measuredText, o, 0);
    }
    endOfLine() {
      let {
        line: e,
        column: t
      } = this.getPosition();
      let n = this.measuredText.getLineLength(e);
      if (t >= n && e < this.measuredText.lineCount - 1) {
        let o = this.measuredText.getLineLength(e + 1);
        let s = this.getOffset({
          line: e + 1,
          column: o
        });
        return new zl(this.measuredText, s, 0);
      }
      let r = this.getOffset({
        line: e,
        column: n
      });
      return new zl(this.measuredText, r, 0);
    }
    findLogicalLineStart(e = this.offset) {
      if (e === 0) {
        return 0;
      }
      let t = this.text.lastIndexOf(`
`, e - 1);
      return t === -1 ? 0 : t + 1;
    }
    findLogicalLineEnd(e = this.offset) {
      let t = this.text.indexOf(`
`, e);
      return t === -1 ? this.text.length : t;
    }
    getLogicalLineBounds() {
      return {
        start: this.findLogicalLineStart(),
        end: this.findLogicalLineEnd()
      };
    }
    createCursorWithColumn(e, t, n) {
      let r = t - e;
      let o = Math.min(n, r);
      let s = e + o;
      let i = this.measuredText.snapToGraphemeBoundary(s);
      return new zl(this.measuredText, i, 0);
    }
    endOfLogicalLine() {
      return new zl(this.measuredText, this.findLogicalLineEnd(), 0);
    }
    lastCharInLogicalLine() {
      let e = this.findLogicalLineStart();
      let t = this.findLogicalLineEnd();
      let n = t > e ? this.measuredText.prevOffset(t) : e;
      return new zl(this.measuredText, n, 0);
    }
    startOfLogicalLine() {
      return new zl(this.measuredText, this.findLogicalLineStart(), 0);
    }
    firstNonBlankInLogicalLine() {
      let {
        start: e,
        end: t
      } = this.getLogicalLineBounds();
      let r = this.text.slice(e, t).match(/\S/);
      let o = e + (r?.index ?? 0);
      return new zl(this.measuredText, o, 0);
    }
    upLogicalLine() {
      let {
        start: e
      } = this.getLogicalLineBounds();
      if (e === 0) {
        return new zl(this.measuredText, 0, 0);
      }
      let t = this.offset - e;
      let n = e - 1;
      let r = this.findLogicalLineStart(n);
      return this.createCursorWithColumn(r, n, t);
    }
    downLogicalLine() {
      let {
        start: e,
        end: t
      } = this.getLogicalLineBounds();
      if (t >= this.text.length) {
        return new zl(this.measuredText, this.text.length, 0);
      }
      let n = this.offset - e;
      let r = t + 1;
      let o = this.findLogicalLineEnd(r);
      return this.createCursorWithColumn(r, o, n);
    }
    nextWord() {
      if (this.isAtEnd()) {
        return this;
      }
      let e = this.placeholderStartingAt(this.offset) ?? this.placeholderContaining(this.offset);
      if (e) {
        return new zl(this.measuredText, e.end);
      }
      let t = this.measuredText.getWordBoundaries();
      for (let n of t) {
        if (n.isWordLike && n.start > this.offset) {
          let r = this.snapOutOfPlaceholder(n.start, "end");
          return new zl(this.measuredText, r);
        }
      }
      return new zl(this.measuredText, this.text.length);
    }
    prevWord() {
      if (this.isAtStart()) {
        return this;
      }
      let e = this.placeholderEndingAt(this.offset);
      if (e) {
        return new zl(this.measuredText, e.start);
      }
      let t = this.placeholderContaining(this.offset);
      if (t) {
        return new zl(this.measuredText, t.start);
      }
      let n = this.measuredText.getWordBoundaries();
      let r = null;
      for (let o of n) {
        if (!o.isWordLike) {
          continue;
        }
        if (o.start < this.offset) {
          if (this.offset > o.start && this.offset <= o.end) {
            let s = this.snapOutOfPlaceholder(o.start, "start");
            return new zl(this.measuredText, s);
          }
          r = o.start;
        }
      }
      if (r !== null) {
        let o = this.snapOutOfPlaceholder(r, "start");
        return new zl(this.measuredText, o);
      }
      return new zl(this.measuredText, 0);
    }
    nextVimWord() {
      if (this.isAtEnd()) {
        return this;
      }
      let e = this.placeholderStartingAt(this.offset) ?? this.placeholderContaining(this.offset);
      if (e) {
        let o = e.end;
        while (o < this.text.length && iut.test(this.graphemeAt(o))) {
          o = this.measuredText.nextOffset(o);
        }
        return new zl(this.measuredText, o);
      }
      let t = this.offset;
      let n = o => this.measuredText.nextOffset(o);
      let r = this.graphemeAt(t);
      if (!r) {
        return this;
      }
      if (_Se(r)) {
        while (t < this.text.length && _Se(this.graphemeAt(t))) {
          t = n(t);
        }
      } else if (YPe(r)) {
        while (t < this.text.length && YPe(this.graphemeAt(t))) {
          t = n(t);
        }
      }
      while (t < this.text.length && iut.test(this.graphemeAt(t))) {
        t = n(t);
      }
      return new zl(this.measuredText, this.snapOutOfPlaceholder(t, "end"));
    }
    endOfVimWord() {
      if (this.isAtEnd()) {
        return this;
      }
      let e = this.placeholderStartingAt(this.offset) ?? this.placeholderContaining(this.offset);
      if (e && this.offset < e.end - 1) {
        return new zl(this.measuredText, e.end - 1);
      }
      let t = this.text;
      let n = this.offset;
      let r = i => this.measuredText.nextOffset(i);
      if (this.graphemeAt(n) === "") {
        return this;
      }
      n = r(n);
      while (n < t.length && iut.test(this.graphemeAt(n))) {
        n = r(n);
      }
      if (n >= t.length) {
        return new zl(this.measuredText, t.length);
      }
      let o = this.graphemeAt(n);
      if (_Se(o)) {
        while (n < t.length) {
          let i = r(n);
          if (i >= t.length || !_Se(this.graphemeAt(i))) {
            break;
          }
          n = i;
        }
      } else if (YPe(o)) {
        while (n < t.length) {
          let i = r(n);
          if (i >= t.length || !YPe(this.graphemeAt(i))) {
            break;
          }
          n = i;
        }
      }
      let s = this.placeholderStartingAt(n) ?? this.placeholderContaining(n);
      if (s) {
        n = s.end - 1;
      }
      return new zl(this.measuredText, n);
    }
    prevVimWord() {
      if (this.isAtStart()) {
        return this;
      }
      let e = this.placeholderEndingAt(this.offset);
      if (e) {
        return new zl(this.measuredText, e.start);
      }
      let t = this.placeholderContaining(this.offset);
      if (t) {
        return new zl(this.measuredText, t.start);
      }
      let n = this.offset;
      let r = s => this.measuredText.prevOffset(s);
      n = r(n);
      while (n > 0 && iut.test(this.graphemeAt(n))) {
        n = r(n);
      }
      if (n === 0 && iut.test(this.graphemeAt(0))) {
        return new zl(this.measuredText, 0);
      }
      let o = this.graphemeAt(n);
      if (_Se(o)) {
        while (n > 0) {
          let s = r(n);
          if (!_Se(this.graphemeAt(s))) {
            break;
          }
          n = s;
        }
      } else if (YPe(o)) {
        while (n > 0) {
          let s = r(n);
          if (!YPe(this.graphemeAt(s))) {
            break;
          }
          n = s;
        }
      }
      return new zl(this.measuredText, this.snapOutOfPlaceholder(n, "start"));
    }
    nextWORD() {
      let e = this;
      while (!e.isOverWhitespace() && !e.isAtEnd()) {
        e = e.right();
      }
      while (e.isOverWhitespace() && !e.isAtEnd()) {
        e = e.right();
      }
      return e;
    }
    endOfWORD() {
      if (this.isAtEnd()) {
        return this;
      }
      let e = this.placeholderStartingAt(this.offset) ?? this.placeholderContaining(this.offset);
      if (e && this.offset < e.end - 1) {
        return new zl(this.measuredText, e.end - 1);
      }
      let t = this;
      if (!t.isOverWhitespace() && (t.right().isOverWhitespace() || t.right().isAtEnd())) {
        t = t.right();
        return t.endOfWORD();
      }
      if (t.isOverWhitespace()) {
        t = t.nextWORD();
        let r = t.placeholderStartingAt(t.offset);
        if (r) {
          return new zl(this.measuredText, r.end - 1);
        }
      }
      while (!t.right().isOverWhitespace() && !t.isAtEnd()) {
        t = t.right();
      }
      return t;
    }
    prevWORD() {
      let e = this;
      if (e.left().isOverWhitespace()) {
        e = e.left();
      }
      while (e.isOverWhitespace() && !e.isAtStart()) {
        e = e.left();
      }
      if (!e.isOverWhitespace()) {
        while (!e.left().isOverWhitespace() && !e.isAtStart()) {
          e = e.left();
        }
      }
      return e;
    }
    modifyText(e, t = "") {
      let n = this.offset;
      let r = e.offset;
      let o = this.text.slice(0, n) + t + this.text.slice(r);
      return zl.fromText(o, this.columns, n + t.normalize("NFC").length);
    }
    insert(e) {
      return this.modifyText(this, e);
    }
    del() {
      if (this.isAtEnd()) {
        return this;
      }
      return this.modifyText(this.right());
    }
    backspace() {
      if (this.isAtStart()) {
        return this;
      }
      return this.left().modifyText(this);
    }
    deleteToLineStart() {
      if (this.offset > 0 && this.text[this.offset - 1] === `
`) {
        return {
          cursor: this.left().modifyText(this),
          killed: `
`
        };
      }
      let e = this.startOfLine();
      let t = this.text.slice(e.offset, this.offset);
      return {
        cursor: e.modifyText(this),
        killed: t
      };
    }
    deleteToLineEnd() {
      if (this.text[this.offset] === `
`) {
        return {
          cursor: this.modifyText(this.right()),
          killed: `
`
        };
      }
      let e = this.endOfLine();
      let t = this.text.slice(this.offset, e.offset);
      return {
        cursor: this.modifyText(e),
        killed: t
      };
    }
    deleteToLogicalLineEnd() {
      if (this.text[this.offset] === `
`) {
        return this.modifyText(this.right());
      }
      return this.modifyText(this.endOfLogicalLine());
    }
    deleteWordBefore() {
      if (this.isAtStart()) {
        return {
          cursor: this,
          killed: ""
        };
      }
      let e = this.snapOutOfPlaceholder(this.prevWord().offset, "start");
      let t = new zl(this.measuredText, e);
      let n = this.text.slice(t.offset, this.offset);
      return {
        cursor: t.modifyText(this),
        killed: n
      };
    }
    deleteTokenBefore() {
      let e = this.placeholderStartingAt(this.offset);
      if (e) {
        let o = this.text[e.end] === " " ? e.end + 1 : e.end;
        return this.modifyText(new zl(this.measuredText, o));
      }
      if (this.isAtStart()) {
        return null;
      }
      let t = this.text[this.offset];
      if (t !== undefined && !/\s/.test(t)) {
        return null;
      }
      let r = this.text.slice(0, this.offset).match(/(^|\s)\[(Pasted text #\d+(?: \+\d+ lines)?|Image #\d+|\.\.\.Truncated text #\d+ \+\d+ lines\.\.\.)\]$/);
      if (r) {
        let o = r.index + r[1].length;
        return new zl(this.measuredText, o).modifyText(this);
      }
      return null;
    }
    deleteWordAfter() {
      if (this.isAtEnd()) {
        return this;
      }
      let e = this.snapOutOfPlaceholder(this.nextWord().offset, "end");
      return this.modifyText(new zl(this.measuredText, e));
    }
    graphemeAt(e) {
      if (e >= this.text.length) {
        return "";
      }
      let t = this.measuredText.nextOffset(e);
      return this.text.slice(e, t);
    }
    isOverWhitespace() {
      let e = this.text[this.offset] ?? "";
      return /\s/.test(e);
    }
    equals(e) {
      return this.offset === e.offset && this.measuredText === e.measuredText;
    }
    isAtStart() {
      return this.offset === 0;
    }
    isAtEnd() {
      return this.offset >= this.text.length;
    }
    startOfFirstLine() {
      return new zl(this.measuredText, 0, 0);
    }
    startOfLastLine() {
      let e = this.text.lastIndexOf(`
`);
      if (e === -1) {
        return this.startOfLine();
      }
      return new zl(this.measuredText, e + 1, 0);
    }
    goToLine(e) {
      let t = this.text.split(`
`);
      let n = Math.min(Math.max(0, e - 1), t.length - 1);
      let r = 0;
      for (let o = 0; o < n; o++) {
        r += (t[o]?.length ?? 0) + 1;
      }
      return new zl(this.measuredText, r, 0);
    }
    endOfFile() {
      return new zl(this.measuredText, this.text.length, 0);
    }
    get text() {
      return this.measuredText.text;
    }
    get columns() {
      return this.measuredText.columns + 1;
    }
    getPosition() {
      return this.measuredText.getPositionFromOffset(this.offset);
    }
    getOffset(e) {
      return this.measuredText.getOffsetFromPosition(e);
    }
    findCharacter(e, t, n = 1) {
      let r = this.text;
      let o = t === "f" || t === "t";
      let s = t === "t" || t === "T";
      let i = 0;
      if (o) {
        let a = this.measuredText.nextOffset(this.offset);
        while (a < r.length) {
          if (this.graphemeAt(a) === e) {
            if (i++, i === n) {
              return s ? Math.max(this.offset, this.measuredText.prevOffset(a)) : a;
            }
          }
          a = this.measuredText.nextOffset(a);
        }
      } else {
        if (this.offset === 0) {
          return null;
        }
        let a = this.measuredText.prevOffset(this.offset);
        while (a >= 0) {
          if (this.graphemeAt(a) === e) {
            if (i++, i === n) {
              return s ? Math.min(this.offset, this.measuredText.nextOffset(a)) : a;
            }
          }
          if (a === 0) {
            break;
          }
          a = this.measuredText.prevOffset(a);
        }
      }
      return null;
    }
  }
  class MLn {
    text;
    startOffset;
    isPrecededByNewline;
    endsWithNewline;
    constructor(e, t, n, r = false) {
      this.text = e;
      this.startOffset = t;
      this.isPrecededByNewline = n;
      this.endsWithNewline = r;
    }
    equals(e) {
      return this.text === e.text && this.startOffset === e.startOffset;
    }
    get length() {
      return this.text.length + (this.endsWithNewline ? 1 : 0);
    }
  }
  class MQi {
    columns;
    _wrappedLines;
    text;
    navigationCache;
    graphemeBoundaries;
    constructor(e, t) {
      this.columns = t;
      this.text = e.normalize("NFC");
      this.navigationCache = new Map();
    }
    get wrappedLines() {
      if (!this._wrappedLines) {
        this._wrappedLines = this.measureWrappedText();
      }
      return this._wrappedLines;
    }
    getGraphemeBoundaries() {
      if (!this.graphemeBoundaries) {
        this.graphemeBoundaries = [];
        for (let {
          index: e
        } of JS().segment(this.text)) {
          this.graphemeBoundaries.push(e);
        }
        this.graphemeBoundaries.push(this.text.length);
      }
      return this.graphemeBoundaries;
    }
    wordBoundariesCache;
    getWordBoundaries() {
      if (!this.wordBoundariesCache) {
        this.wordBoundariesCache = [];
        for (let e of qRr().segment(this.text)) {
          let t = e.isWordLike || Trp.test(e.segment);
          this.wordBoundariesCache.push({
            start: e.index,
            end: e.index + e.segment.length,
            isWordLike: t
          });
        }
      }
      return this.wordBoundariesCache;
    }
    binarySearchBoundary(e, t, n) {
      let r = 0;
      let o = e.length - 1;
      let s = n ? this.text.length : 0;
      while (r <= o) {
        let i = Math.floor((r + o) / 2);
        let a = e[i];
        if (a === undefined) {
          break;
        }
        if (n) {
          if (a > t) {
            s = a;
            o = i - 1;
          } else {
            r = i + 1;
          }
        } else if (a < t) {
          s = a;
          r = i + 1;
        } else {
          o = i - 1;
        }
      }
      return s;
    }
    stringIndexToDisplayWidth(e, t) {
      if (t <= 0) {
        return 0;
      }
      if (t >= e.length) {
        return an(e);
      }
      return an(e.substring(0, t));
    }
    displayWidthToStringIndex(e, t) {
      if (t <= 0) {
        return 0;
      }
      if (!e) {
        return 0;
      }
      if (e === this.text) {
        return this.offsetAtDisplayWidth(t);
      }
      let n = 0;
      let r = 0;
      for (let {
        segment: o,
        index: s
      } of JS().segment(e)) {
        let i = an(o);
        if (n + i > t) {
          break;
        }
        n += i;
        r = s + o.length;
      }
      return r;
    }
    offsetAtDisplayWidth(e) {
      if (e <= 0) {
        return 0;
      }
      let t = 0;
      let n = this.getGraphemeBoundaries();
      for (let r = 0; r < n.length - 1; r++) {
        let o = n[r];
        let s = n[r + 1];
        if (o === undefined || s === undefined) {
          continue;
        }
        let i = this.text.substring(o, s);
        let a = an(i);
        if (t + a > e) {
          return o;
        }
        t += a;
      }
      return this.text.length;
    }
    measureWrappedText() {
      let e = MB(this.text, this.columns, {
        hard: true,
        trim: false
      });
      let t = [];
      let n = 0;
      let r = -1;
      let o = e.split(`
`);
      for (let s = 0; s < o.length; s++) {
        let i = o[s];
        let a = l => s === 0 || l > 0 && this.text[l - 1] === `
`;
        if (i.length === 0) {
          if (r = this.text.indexOf(`
`, r + 1), r !== -1) {
            let l = r;
            let c = true;
            t.push(new MLn(i, l, a(l), true));
          } else {
            let l = this.text.length;
            t.push(new MLn(i, l, a(l), false));
          }
        } else {
          let l = this.text.indexOf(i, n);
          if (l === -1) {
            throw Error("Failed to find wrapped line in text");
          }
          n = l + i.length;
          let c = l + i.length;
          let u = c < this.text.length && this.text[c] === `
`;
          if (u) {
            r = c;
          }
          t.push(new MLn(i, l, a(l), u));
        }
      }
      return t;
    }
    getWrappedText() {
      return this.wrappedLines.map(e => e.isPrecededByNewline ? e.text : e.text.trimStart());
    }
    getWrappedLines() {
      return this.wrappedLines;
    }
    getLine(e) {
      let t = this.wrappedLines;
      return t[Math.max(0, Math.min(e, t.length - 1))];
    }
    getOffsetFromPosition(e) {
      let t = this.getLine(e.line);
      if (t.text.length === 0 && t.endsWithNewline) {
        return t.startOffset;
      }
      let n = t.isPrecededByNewline ? 0 : t.text.length - t.text.trimStart().length;
      let r = e.column + n;
      let o = this.displayWidthToStringIndex(t.text, r);
      let s = t.startOffset + o;
      let i = t.startOffset + t.text.length;
      let a = i;
      let l = an(t.text);
      if (t.endsWithNewline && e.column > l) {
        a = i + 1;
      }
      return this.snapToGraphemeBoundary(Math.min(s, a));
    }
    getLineLength(e) {
      let t = this.getLine(e);
      return an(t.text);
    }
    getPositionFromOffset(e) {
      let t = this.wrappedLines;
      for (let o = 0; o < t.length; o++) {
        let s = t[o];
        let i = t[o + 1];
        if (e >= s.startOffset && (!i || e < i.startOffset)) {
          let a = e - s.startOffset;
          let l;
          if (s.isPrecededByNewline) {
            l = this.stringIndexToDisplayWidth(s.text, a);
          } else {
            let c = s.text.length - s.text.trimStart().length;
            if (a < c) {
              l = 0;
            } else {
              let u = s.text.trimStart();
              let d = a - c;
              l = this.stringIndexToDisplayWidth(u, d);
            }
          }
          return {
            line: o,
            column: Math.max(0, l)
          };
        }
      }
      let n = t.length - 1;
      let r = this.wrappedLines[n];
      return {
        line: n,
        column: an(r.text)
      };
    }
    get lineCount() {
      return this.wrappedLines.length;
    }
    withCache(e, t) {
      let n = this.navigationCache.get(e);
      if (n !== undefined) {
        return n;
      }
      let r = t();
      this.navigationCache.set(e, r);
      return r;
    }
    nextOffset(e) {
      return this.withCache(`next:${e}`, () => {
        let t = this.getGraphemeBoundaries();
        return this.binarySearchBoundary(t, e, true);
      });
    }
    prevOffset(e) {
      if (e <= 0) {
        return 0;
      }
      return this.withCache(`prev:${e}`, () => {
        let t = this.getGraphemeBoundaries();
        return this.binarySearchBoundary(t, e, false);
      });
    }
    snapToGraphemeBoundary(e) {
      if (e <= 0) {
        return 0;
      }
      if (e >= this.text.length) {
        return this.text.length;
      }
      let t = this.getGraphemeBoundaries();
      let n = 0;
      let r = t.length - 1;
      while (n < r) {
        let o = n + r + 1 >> 1;
        if (t[o] <= e) {
          n = o;
        } else {
          r = o - 1;
        }
      }
      return t[n];
    }
  }
  var Srp;
  var iut;
  var Trp;
  var Erp;
  var vrp;
  var wrp;
  var _Se = e => Srp.test(e);
  var NLn = e => iut.test(e);
  var YPe = e => e.length > 0 && !NLn(e) && !_Se(e);
  var uGe = __lazy(() => {
    bc();
    Kge();
    PP();
    Srp = /^[\p{L}\p{N}\p{M}_]$/u;
    iut = /\s/;
    Trp = /\p{N}/u;
    Erp = new RegExp("\\[(?:Pasted text|Image|\\.\\.\\.Truncated text) #\\d+(?: \\+\\d+ lines)?\\.*\\]" + "$");
    vrp = new RegExp("^" + "\\[(?:Pasted text|Image|\\.\\.\\.Truncated text) #\\d+(?: \\+\\d+ lines)?\\.*\\]");
    wrp = new RegExp("\\[(?:Pasted text|Image|\\.\\.\\.Truncated text) #\\d+(?: \\+\\d+ lines)?\\.*\\]", "g");
  });
  var hoo = {};
  __export(hoo, {
    prewarm: () => prewarm,
    isModifierPressed: () => isModifierPressed,
    getModifiers: () => getModifiers
  });
  function Crp(e) {
    return typeof e === "object" && e !== null && "getModifiers" in e && typeof e.getModifiers === "function" && "isModifierPressed" in e && typeof e.isModifierPressed === "function";
  }
  function foo() {
    if (null) {
      return null;
    }
    return null;
  }
  function getModifiers() {
    let e = foo();
    if (!e) {
      return [];
    }
    try {
      return e.getModifiers();
    } catch {
      return [];
    }
  }
  function isModifierPressed(e) {
    let t = foo();
    if (!t) {
      return false;
    }
    try {
      return t.isModifierPressed(e);
    } catch {
      return false;
    }
  }
  function prewarm() {
    foo();
  }
  var NQi;
  var LQi;
  var FLn;
  var goo = __lazy(() => {
    NQi = require("module");
    LQi = require("url");
    FLn = require("path");
  });
  function UQi() {
    return;
  }
  function BQi(e) {
    return false;
  }
  function _G(e, t, n, r = 800) {
    let o = useClock();
    let s = JPe.useRef(0);
    let i = JPe.useRef(undefined);
    let a = JPe.useCallback(() => {
      if (i.current) {
        i.current();
        i.current = undefined;
      }
    }, []);
    JPe.useEffect(() => () => {
      a();
    }, [a]);
    return JPe.useCallback(() => {
      let l = Date.now();
      if (l - s.current <= r && i.current !== undefined) {
        a();
        e(false);
        t();
      } else {
        n?.();
        e(true);
        a();
        i.current = o.setTimeout(() => {
          e(false);
          i.current = undefined;
        }, r);
      }
      s.current = l;
    }, [e, t, n, a, o, r]);
  }
  var JPe;
  var aut = __lazy(() => {
    et();
    JPe = __toESM(ot(), 1);
  });
  function $Qi(e) {
    let t = new Map(e);
    return function (n) {
      return (t.get(n) ?? Irp)(n);
    };
  }
  function ULn({
    value: e,
    onChange: t,
    onSubmit: n,
    onExit: r,
    onExitMessage: o,
    onLeftArrowOnEmpty: s,
    onHistoryUp: i,
    onHistoryDown: a,
    onHistoryReset: l,
    mask: c = "",
    multiline: u = false,
    cursorChar: d,
    invert: p,
    columns: m,
    onImagePaste: f,
    disableCursorMovementForUpDownKeys: h = false,
    disableEscapeDoublePress: g = false,
    maxVisibleLines: y,
    externalOffset: _,
    onOffsetChange: b,
    inputFilter: S,
    inlineGhostText: E,
    dim: C,
    killRing: x,
    selectionAnchor: A,
    selectionLinewise: k = false
  }) {
    let I = TLn();
    let O = x ?? I;
    if (Me.terminal === "Apple_Terminal") {
      UQi();
    }
    let M = _;
    let L = b;
    let P = zl.fromText(e, m, M);
    let F = false;
    let {
      addNotification: H,
      removeNotification: U
    } = Fi();
    let N = _G(ue => {
      o?.(ue, "Ctrl-C");
    }, () => r?.(), () => {
      if (e) {
        t("");
        L(0);
        l?.();
      }
    });
    let W = _G(ue => {
      if (!e || !ue) {
        return;
      }
      H({
        key: "escape-again-to-clear",
        kind: "feedback",
        text: "Esc again to clear",
        priority: "immediate",
        timeoutMs: 1000
      });
    }, () => {
      if (U("escape-again-to-clear"), e) {
        if (e.trim() !== "") {
          sut(e);
        }
        t("");
        L(0);
        l?.();
      }
    });
    let j = _G(ue => {
      if (e !== "") {
        return;
      }
      o?.(ue, "Ctrl-D");
    }, () => {
      if (e !== "") {
        return;
      }
      r?.();
    });
    function z() {
      if (P.text === "") {
        j();
        return P;
      }
      return P.del();
    }
    function V() {
      let {
        cursor: ue,
        killed: ce
      } = P.deleteToLineEnd();
      O.dispatch({
        type: "kill",
        text: ce,
        direction: "append"
      });
      return ue;
    }
    function K() {
      let {
        cursor: ue,
        killed: ce
      } = P.deleteToLineStart();
      if (O.dispatch({
        type: "kill",
        text: ce,
        direction: "prepend"
      }), ce.length >= 3) {
        H({
          key: "kill-paste-hint",
          kind: "hint",
          text: "Ctrl+Y to paste deleted text",
          priority: "immediate",
          timeoutMs: 5000
        });
      }
      return ue;
    }
    function J() {
      let {
        cursor: ue,
        killed: ce
      } = P.deleteWordBefore();
      O.dispatch({
        type: "kill",
        text: ce,
        direction: "prepend"
      });
      return ue;
    }
    function Q() {
      let ue = bLn(O.state);
      if (ue.length > 0) {
        let ce = P.offset;
        let le = P.insert(ue);
        O.dispatch({
          type: "yank",
          start: ce,
          length: ue.length
        });
        return le;
      }
      return P;
    }
    function Z() {
      let ue = SLn(O.state);
      if (!ue) {
        return P;
      }
      let {
        text: ce,
        start: le,
        length: pe
      } = ue;
      O.dispatch({
        type: "yankPop"
      });
      let ve = P.text.slice(0, le);
      let _e = P.text.slice(le + pe);
      let xe = ve + ce + _e;
      let ke = le + ce.length;
      O.dispatch({
        type: "updateYankLength",
        length: ce.length
      });
      return zl.fromText(xe, m, ke);
    }
    let ne = $Qi([["a", () => P.startOfLogicalLine()], ["b", () => P.left()], ["c", () => (N(), P)], ["d", z], ["e", () => P.endOfLogicalLine()], ["f", () => P.right()], ["h", () => P.deleteTokenBefore() ?? P.backspace()], ["k", V], ["n", () => se()], ["p", () => re()], ["u", K], ["w", J], ["y", Q]]);
    let oe = $Qi([["b", () => P.prevWord()], ["f", () => P.nextWord()], ["d", () => P.deleteWordAfter()], ["y", Z]]);
    function ee({
      meta: ue,
      shift: ce
    }) {
      if (u && P.offset > 0 && P.text[P.offset - 1] === "\\") {
        markBackslashReturnUsed();
        return P.backspace().insert(`
`);
      }
      if (ue || ce) {
        return P.insert(`
`);
      }
      if (Me.terminal === "Apple_Terminal" && BQi("shift")) {
        return P.insert(`
`);
      }
      if (n) {
        n(P.text);
        F = true;
      }
      return P;
    }
    function re() {
      if (h) {
        i?.();
        return P;
      }
      if (i && P.getPosition().line === 0) {
        i();
        return P;
      }
      let ue = P.up();
      if (!ue.equals(P)) {
        return ue;
      }
      if (u) {
        let ce = P.upLogicalLine();
        if (!ce.equals(P)) {
          return ce;
        }
      }
      return P;
    }
    function se() {
      if (h) {
        a?.();
        return P;
      }
      if (a && P.getPosition().line >= P.measuredText.lineCount - 1) {
        a();
        return P;
      }
      let ue = P.down();
      if (!ue.equals(P)) {
        return ue;
      }
      if (u) {
        let ce = P.downLogicalLine();
        if (!ce.equals(P)) {
          return ce;
        }
      }
      return P;
    }
    function ae(ue) {
      if (ue.ctrl && (ue.key === "k" || ue.key === "u" || ue.key === "w")) {
        return true;
      }
      if (ue.key === "backspace" && (ue.meta || ue.superKey || ue.ctrl)) {
        return true;
      }
      if (ue.key === "delete" && (ue.meta || ue.superKey)) {
        return true;
      }
      return false;
    }
    function de(ue) {
      return (ue.ctrl || ue.meta) && ue.key === "y";
    }
    function be(ue, ce) {
      switch (ue.name) {
        case "escape":
          if (g) {
            return;
          }
          W();
          return P;
        case "left":
          if (ue.superKey) {
            return P.startOfLine();
          }
          if (ue.ctrl || ue.meta || ue.fn) {
            return P.prevWord();
          }
          if (s && !ue.shift && P.text === "") {
            s();
            return P;
          }
          return P.left();
        case "right":
          if (ue.superKey) {
            return P.endOfLine();
          }
          if (ue.ctrl || ue.meta || ue.fn) {
            return P.nextWord();
          }
          return P.right();
        case "up":
          if (ue.shift || ue.ctrl || ue.meta) {
            return;
          }
          return re();
        case "down":
          if (ue.shift || ue.ctrl || ue.meta) {
            return;
          }
          return se();
        case "backspace":
          if (ue.superKey) {
            return K();
          }
          if (ue.meta || ue.ctrl) {
            return J();
          }
          return P.deleteTokenBefore() ?? P.backspace();
        case "delete":
          if (ue.superKey) {
            return V();
          }
          if (ue.meta) {
            return V();
          }
          return P.del();
        case "home":
          if (ue.ctrl) {
            return;
          }
          return P.startOfLine();
        case "end":
          if (ue.ctrl) {
            return;
          }
          return P.endOfLine();
        case "pagedown":
          if (qs() || ue.ctrl) {
            return;
          }
          return P.endOfLine();
        case "pageup":
          if (qs() || ue.ctrl) {
            return;
          }
          return P.startOfLine();
        case "return":
          if (ue.ctrl) {
            return;
          }
          return ee(ue);
        case "enter":
          return P.insert(`
`);
        case "tab":
          return;
      }
      if (ue.ctrl) {
        return ne(ue.key);
      }
      if (ue.meta) {
        return oe(ue.key);
      }
      if (Prp.vZc(ue.name)) {
        return;
      }
      if (ce.length === 0) {
        return;
      }
      if (P.isAtStart() && Tjt(ce)) {
        return P.insert(ce).left();
      }
      return P.insert(ce);
    }
    function fe(ue) {
      let ce = S ? S(ue.key, ue) : ue.key;
      if (ce === "" && ue.key !== "") {
        ue.preventDefault();
        return;
      }
      if (!ae(ue) && !de(ue)) {
        O.dispatch({
          type: "interrupt"
        });
      }
      let le = be(ue, ce);
      if (le === undefined) {
        return;
      }
      if (ue.preventDefault(), !P.equals(le)) {
        if (P.text !== le.text) {
          t(le.text);
        }
        L(le.offset);
        P = le;
      }
      if (F) {
        F = false;
        P = zl.fromText("", m, 0);
      }
    }
    let me = E && C && E.insertPosition === M ? {
      text: E.text,
      dim: C
    } : undefined;
    let Te = P.getPosition();
    return {
      handleKeyDown: fe,
      renderedValue: P.render(d, c, p, me, y, A ?? undefined, k),
      offset: M,
      setOffset: L,
      cursorLine: Te.line - P.getViewportStartLine(y),
      cursorColumn: Te.column,
      viewportCharOffset: P.getViewportCharOffset(y),
      viewportCharEnd: P.getViewportCharEnd(y)
    };
  }
  var Irp = () => {};
  var Prp;
  var yoo = __lazy(() => {
    Nd();
    zPe();
    ELn();
    gq();
    uGe();
    pr();
    zp();
    aut();
    Prp = new Set(["insert", "clear", "enter", "center", "undefined", "mouse", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10", "f11", "f12"]);
  });
  function g1(e) {
    return Math.round(e * 8) / 8;
  }
  function BLn(e) {
    return g1(e / 360) * 360;
  }
  function $Ln(e, t) {
    return (1 - Math.cos(2 * Math.PI * e / t)) / 2;
  }
  function y1(e, t, n) {
    return {
      r: Math.round(e.r + (t.r - e.r) * n),
      g: Math.round(e.g + (t.g - e.g) * n),
      b: Math.round(e.b + (t.b - e.b) * n)
    };
  }
  function _1(e) {
    return `rgb(${e.r},${e.g},${e.b})`;
  }
  function HLn(e) {
    let t = (e % 360 + 360) % 360;
    let n = 0.7;
    let r = 0.6;
    let o = (1 - Math.abs(0.19999999999999996)) * 0.7;
    let s = o * (1 - Math.abs(t / 60 % 2 - 1));
    let i = 0.6 - o / 2;
    let a = 0;
    let l = 0;
    let c = 0;
    if (t < 60) {
      a = o;
      l = s;
    } else if (t < 120) {
      a = s;
      l = o;
    } else if (t < 180) {
      l = o;
      c = s;
    } else if (t < 240) {
      l = s;
      c = o;
    } else if (t < 300) {
      a = s;
      c = o;
    } else {
      a = o;
      c = s;
    }
    return {
      r: Math.round((a + i) * 255),
      g: Math.round((l + i) * 255),
      b: Math.round((c + i) * 255)
    };
  }
  function Z2(e) {
    let t = jQi.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = e.match(/rgb\(\s*(\d+)\s*,\s*(\d+)\s*,\s*(\d+)\s*\)/);
    let r = n ? {
      r: parseInt(n[1], 10),
      g: parseInt(n[2], 10),
      b: parseInt(n[3], 10)
    } : null;
    jQi.set(e, r);
    return r;
  }
  var bSe;
  var jQi;
  var Ore = __lazy(() => {
    bSe = TEr(() => {
      if (process.env.TERM === "xterm-ghostty") {
        return ["\xB7", "\u2722", "\u2733", "\u2736", "\u273B", "\u273B"];
      }
      return ["\xB7", "\u2722", "*", "\u2736", "\u273B", "\u273D"];
    }, () => process.env.TERM);
    jQi = new Map();
  });
  function WC(e) {
    if (e) {
      return true;
    }
    return Rb() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_cedar_marsh", false);
  }
  var Dre = __lazy(() => {
    mT();
    $n();
  });
  function WQi() {
    xjt = 0;
    boo = false;
  }
  function jLn() {
    let e = bt(y => WC(y.settings.prefersReducedMotion));
    let n = useVoiceState(y => y.voiceState) === "recording";
    if (n && !boo) {
      xjt = 0;
    }
    boo = n;
    let r = useVoiceState(y => y.voiceAudioLevels);
    let o = n && !e;
    let [s, i] = useAnimationFrame(o ? 50 : null);
    if (!o) {
      return [s, null];
    }
    let a = r.at(-1) ?? 0;
    let l = Math.min(a * 1.8, 1);
    xjt = xjt * 0.7 + l * (1 - 0.7);
    let c = Math.max(1, Math.min(Math.round(xjt * ((" \u2581\u2582\u2583\u2584\u2585\u2586\u2587\u2588").length - 1)), (" \u2581\u2582\u2583\u2584\u2585\u2586\u2587\u2588").length - 1));
    let u = a < 0.15;
    let d = i / 1000 * 90 % 360;
    let p = Rb() ? BLn(d) : d;
    let {
      r: m,
      g: f,
      b: h
    } = u ? {
      r: 128,
      g: 128,
      b: 128
    } : HLn(p);
    let g = `#${(m << 16 | f << 8 | h).toString(16).padStart(6, "0")}`;
    return [s, {
      char: (" \u2581\u2582\u2583\u2584\u2585\u2586\u2587\u2588")[c],
      hex: g
    }];
  }
  var xjt = 0;
  var boo = false;
  var qLn = __lazy(() => {
    Ore();
    dSe();
    ejt();
    mT();
    ho();
    Dre();
  });
  function GQi({
    placeholder: e,
    value: t,
    showCursor: n,
    focus: r,
    terminalFocus: o = true,
    invert: s = OWe,
    hidePlaceholderText: i = false
  }) {
    let a = undefined;
    if (e) {
      if (i) {
        a = n && r && o ? s(" ") : "";
      } else if (a = _$u.dim(e), n && r && o) {
        a = e.length > 0 ? s(e[0]) + _$u.dim(e.slice(1)) : s(" ");
      }
    }
    let l = t.length === 0 && Boolean(e);
    return {
      renderedPlaceholder: a,
      showPlaceholder: l
    };
  }
  var VQi = __lazy(() => {
    J8();
  });
  function Nrp() {
    return null;
  }
  function zQi() {
    return [];
  }
  function KQi(e, t) {
    return;
  }
  var kjt = __lazy(() => {
    $n();
  });
  function Yg(e) {
    let t = Lrp();
    let n = e ? getCanonicalName(e) : undefined;
    let r = n ? VN(n)?.image_limits : undefined;
    let o = r ? {
      maxWidth: r.maxWidth,
      maxHeight: r.maxHeight,
      maxBase64Size: r.maxBase64Size
    } : undefined;
    let s = e ? KQi(e, {
      ignore1mTag: true
    })?.imageLimits ?? o : undefined;
    if (!s) {
      if (t === iV.maxBase64Size) {
        return iV;
      }
      return {
        ...iV,
        maxBase64Size: t,
        targetRawSize: t * 3 / 4
      };
    }
    let i = s.maxBase64Size ?? t;
    return {
      maxWidth: s.maxWidth ?? iV.maxWidth,
      maxHeight: s.maxHeight ?? iV.maxHeight,
      maxBase64Size: i,
      targetRawSize: s.targetRawSize ?? i * 3 / 4
    };
  }
  function Lrp() {
    if (getAPIProvider() === "firstParty" && isFirstPartyAnthropicBaseUrl() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_crimson_vector", false)) {
      return 10485760;
    }
    return iV.maxBase64Size;
  }
  var JF = __lazy(() => {
    Ire();
    $n();
    kjt();
    DY();
    Eo();
    Ds();
  });
  function YQi() {
    return Yg(getMainLoopModel());
  }
  function Ajt({
    onPaste: e,
    handleKeyDown: t,
    onImagePaste: n
  }) {
    let r = useClock();
    let [o, s] = bG.useState(false);
    let i = bG.useRef(true);
    let a = bG.useRef(false);
    let l = bG.useRef(false);
    let c = bG.useRef(t);
    c.current = t;
    let u = bG.useMemo(() => Wt() === "macos", []);
    let d = bG.useMemo(() => Wt() === "wsl", []);
    bG.useEffect(() => () => {
      i.current = false;
    }, []);
    let p = bG.useCallback(() => {
      if (!n || !i.current) {
        return;
      }
      VPe(YQi()).then(b => {
        if (b && i.current) {
          n(b.base64, b.mediaType, undefined, b.dimensions);
        }
      }).catch(b => {
        if (i.current) {
          Ae("input_image_paste", "clipboard_read_failed");
          Oe(b);
        }
      }).finally(() => {
        if (i.current) {
          a.current = false;
          l.current = false;
          s(false);
        }
      });
    }, [n]);
    let m = useDebouncedCallback(p, 50);
    function f(b) {
      if (e) {
        e(b);
        return;
      }
      t(new mct({
        kind: "key",
        name: undefined,
        sequence: b,
        raw: b,
        ctrl: false,
        meta: false,
        shift: false,
        option: false,
        super: false,
        fn: false,
        isPasted: true
      }));
    }
    function h() {
      s(false);
      r.setTimeout(() => {
        if (!i.current) {
          return;
        }
        if (a.current = false, l.current) {
          l.current = false;
          c.current(new mct({
            kind: "key",
            name: "return",
            sequence: "\r",
            raw: "\r",
            ctrl: false,
            meta: false,
            shift: false,
            option: false,
            super: false,
            fn: false,
            isPasted: false
          }));
        }
      }, 0);
    }
    function g(b) {
      a.current = true;
      let S = b.replace(/\[I$/, "").replace(/\[O$/, "");
      if (S.length === 0 && (u || d) && n) {
        m();
        return;
      }
      let E = S.split(/ (?=\/|[A-Za-z]:\\)/).flatMap(x => x.split(`
`)).filter(x => x.trim());
      let C = E.filter(x => Vro(x));
      if (n && C.length > 0) {
        let x = /\/TemporaryItems\/.*screencaptureui.*\/Screenshot/i.test(S);
        let A = YQi();
        Promise.all(C.map(k => QXi(k, A))).then(k => {
          if (!i.current) {
            return;
          }
          let I = k.filter(O => O !== null);
          if (I.length > 0) {
            for (let [M, L] of I.entries()) {
              let P = JQi.basename(L.path);
              n(L.base64, L.mediaType, P, L.dimensions, L.path, M > 0);
            }
            let O = E.filter(M => !Vro(M));
            if (O.length > 0) {
              f(O.join(`
`));
            }
            a.current = false;
            l.current = false;
            s(false);
          } else if (x && u) {
            m();
          } else {
            Et("input_image_drag", "read_failed");
            f(S);
            a.current = false;
            l.current = false;
            s(false);
          }
        }).catch(k => {
          if (!i.current) {
            return;
          }
          Ae("input_image_drag", "read_threw");
          logForDebugging(`Image paste read failed: ${k instanceof Error ? k.message : String(k)}`, {
            level: "error"
          });
          f(S);
          a.current = false;
          l.current = false;
          s(false);
        });
        return;
      }
      f(S);
      h();
    }
    function y(b) {
      b.preventDefault();
      s(true);
      g(b.text);
    }
    function _(b) {
      if (a.current && b.key === "return") {
        b.preventDefault();
        l.current = true;
        return;
      }
      if ((e || n) && !b.ctrl && !b.meta && b.key.length > 800 && !b.defaultPrevented) {
        b.preventDefault();
        s(true);
        g(b.key);
        return;
      }
      t(b);
    }
    return {
      handleKeyDown: _,
      handlePaste: y,
      isPasting: o
    };
  }
  var JQi;
  var bG;
  var Soo = __lazy(() => {
    ln();
    Rn();
    cno();
    et();
    je();
    lGe();
    JF();
    Eo();
    Cs();
    JQi = require("path");
    bG = __toESM(ot(), 1);
  });
  function SG({
    line: e,
    column: t,
    active: n,
    visible: r = false
  }) {
    let o = SSe.useContext(KYd);
    let s = SSe.useRef(null);
    let i = SSe.useCallback(a => {
      s.current = a;
    }, []);
    SSe.useLayoutEffect(() => {
      let a = s.current;
      if (n && a) {
        o({
          relativeX: t,
          relativeY: e,
          node: a,
          visible: r
        });
      } else {
        o(null, a);
      }
    });
    SSe.useLayoutEffect(() => () => {
      o(null, s.current);
    }, [o]);
    return i;
  }
  var SSe;
  var dGe = __lazy(() => {
    SSe = __toESM(ot(), 1);
  });
  function MI(e, t, n = false) {
    XQi.useEffect(() => {
      let r = e.current;
      if (!r) {
        return;
      }
      let o = yre(r);
      if (!t) {
        if (n && o.activeElement === r) {
          o.blur();
        }
        return;
      }
      o.focus(r);
      return o.subscribe(() => {
        let s = e.current;
        if (!s || o.activeElement === s) {
          return;
        }
        if (!o.activeElement) {
          o.focus(s);
          return;
        }
        let i = s.parentNode;
        while (i) {
          if (i === o.activeElement) {
            o.focus(s);
            return;
          }
          i = i.parentNode;
        }
      });
    }, [t, e, n]);
  }
  var XQi;
  var Oue = __lazy(() => {
    iSe();
    XQi = __toESM(ot(), 1);
  });
  function Due() {
    return WC(fw(e => e.settings.prefersReducedMotion));
  }
  var WLn = -100;
  var Ijt = __lazy(() => {
    ho();
    Dre();
  });
  function ZQi(e, t) {
    if (t.length === 0) {
      return [{
        text: e,
        start: 0
      }];
    }
    let n = [...t].sort((s, i) => {
      if (s.start !== i.start) {
        return s.start - i.start;
      }
      return i.priority - s.priority;
    });
    let r = [];
    let o = [];
    for (let s of n) {
      if (s.start === s.end) {
        continue;
      }
      if (!o.some(a => s.start >= a.start && s.start < a.end || s.end > a.start && s.end <= a.end || s.start <= a.start && s.end >= a.end)) {
        r.push(s);
        o.push({
          start: s.start,
          end: s.end
        });
      }
    }
    return new eZi(e).segment(r);
  }
  class eZi {
    text;
    tokens;
    visiblePos = 0;
    stringPos = 0;
    tokenIdx = 0;
    charIdx = 0;
    codes = [];
    constructor(e) {
      this.text = e;
      this.tokens = Vlt(e);
    }
    segment(e) {
      let t = [];
      for (let r of e) {
        let o = this.segmentTo(r.start);
        if (o) {
          t.push(o);
        }
        let s = this.segmentTo(r.end);
        if (s) {
          s.highlight = r;
          t.push(s);
        }
      }
      let n = this.segmentTo(1 / 0);
      if (n) {
        t.push(n);
      }
      return t;
    }
    segmentTo(e) {
      if (this.tokenIdx >= this.tokens.length || e <= this.visiblePos) {
        return null;
      }
      let t = this.visiblePos;
      while (this.tokenIdx < this.tokens.length) {
        let l = this.tokens[this.tokenIdx];
        if (l.type !== "ansi") {
          break;
        }
        this.codes.push(l);
        this.stringPos += l.code.length;
        this.tokenIdx++;
      }
      let n = this.stringPos;
      let r = [...this.codes];
      while (this.visiblePos < e && this.tokenIdx < this.tokens.length) {
        let l = this.tokens[this.tokenIdx];
        if (l.type === "ansi") {
          this.codes.push(l);
          this.stringPos += l.code.length;
          this.tokenIdx++;
        } else {
          let c = e - this.visiblePos;
          let u = l.value.length - this.charIdx;
          let d = Math.min(c, u);
          if (this.stringPos += d, this.visiblePos += d, this.charIdx += d, this.charIdx >= l.value.length) {
            this.tokenIdx++;
            this.charIdx = 0;
          }
        }
      }
      if (this.stringPos === n) {
        return null;
      }
      let o = QQi(r);
      let s = QQi(this.codes);
      this.codes = s;
      let i = zF(o);
      let a = zF(sSe(s));
      return {
        text: i + this.text.substring(n, this.stringPos) + a,
        start: t
      };
    }
  }
  function QQi(e) {
    return GJ(e).filter(t => t.code !== t.endCode);
  }
  var tZi = __lazy(() => {
    zlt();
  });
  function pGe(e) {
    let t = nZi.c(3);
    let {
      char: n,
      index: r,
      glimmerIndex: o,
      messageColor: s,
      shimmerColor: i
    } = e;
    let a = r === o;
    let l = Math.abs(r - o) === 1;
    let u = a || l ? i : s;
    let d;
    if (t[0] !== n || t[1] !== u) {
      d = rZi.jsx(Text, {
        color: u,
        children: n
      });
      t[0] = n;
      t[1] = u;
      t[2] = d;
    } else {
      d = t[2];
    }
    return d;
  }
  var nZi;
  var rZi;
  var Pjt = __lazy(() => {
    et();
    nZi = __toESM(pt(), 1);
    rZi = __toESM(ie(), 1);
  });
  function sZi(e) {
    let t = oZi.c(23);
    let {
      text: n,
      highlights: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      let E = ZQi(n, r);
      o = [[]];
      let C = 0;
      for (let x of E) {
        let A = x.text.split(`
`);
        for (let k = 0; k < A.length; k++) {
          if (k > 0) {
            o.push([]);
            C = C + 1;
          }
          let I = A[k];
          if (I.length > 0) {
            o.at(-1).push({
              text: I,
              highlight: x.highlight,
              start: C
            });
          }
          C = C + I.length;
        }
      }
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== r) {
      s = r.some(Urp);
      t[3] = r;
      t[4] = s;
    } else {
      s = t[4];
    }
    let i = s;
    let a = 0;
    let l = 1;
    if (i) {
      let E = 1 / 0;
      let C = -1 / 0;
      if (t[5] !== C || t[6] !== r || t[7] !== E) {
        for (let x of r) {
          if (x.shimmerColor) {
            E = Math.min(E, x.start);
            C = Math.max(C, x.end);
          }
        }
        t[5] = C;
        t[6] = r;
        t[7] = E;
        t[8] = E;
        t[9] = C;
      } else {
        E = t[8];
        C = t[9];
      }
      a = E - 10;
      l = C - E + 20;
    }
    let c;
    if (t[10] !== l || t[11] !== i || t[12] !== o || t[13] !== a) {
      c = {
        lines: o,
        hasShimmer: i,
        sweepStart: a,
        cycleLength: l
      };
      t[10] = l;
      t[11] = i;
      t[12] = o;
      t[13] = a;
      t[14] = c;
    } else {
      c = t[14];
    }
    let {
      lines: u,
      hasShimmer: d,
      sweepStart: p,
      cycleLength: m
    } = c;
    let f = Due();
    let h = d && !f;
    let [g, y] = useAnimationFrame(h ? 50 : null);
    let _ = h ? p + Math.floor(y / 50) % m : WLn;
    let b;
    if (t[15] !== _ || t[16] !== u) {
      let E;
      if (t[18] !== _) {
        E = (C, x) => XPe.jsx(gXd, {
          children: C.length === 0 ? XPe.jsx(Text, {
            children: " "
          }) : C.map((A, k) => {
            if (A.highlight?.shimmerColor && A.highlight.color) {
              return XPe.jsx(Text, {
                children: A.text.split("").map((I, O) => XPe.jsx(pGe, {
                  char: I,
                  index: A.start + O,
                  glimmerIndex: _,
                  messageColor: A.highlight.color,
                  shimmerColor: A.highlight.shimmerColor
                }, O))
              }, k);
            }
            return XPe.jsx(Text, {
              color: A.highlight?.color,
              dimColor: A.highlight?.dimColor,
              inverse: A.highlight?.inverse,
              children: XPe.jsx(Ansi, {
                children: A.text
              })
            }, k);
          })
        }, x);
        t[18] = _;
        t[19] = E;
      } else {
        E = t[19];
      }
      b = u.map(E);
      t[15] = _;
      t[16] = u;
      t[17] = b;
    } else {
      b = t[17];
    }
    let S;
    if (t[20] !== g || t[21] !== b) {
      S = XPe.jsx(gXd, {
        ref: g,
        flexDirection: "column",
        children: b
      });
      t[20] = g;
      t[21] = b;
      t[22] = S;
    } else {
      S = t[22];
    }
    return S;
  }
  function Urp(e) {
    return e.shimmerColor;
  }
  var oZi;
  var XPe;
  var iZi = __lazy(() => {
    Ijt();
    et();
    tZi();
    Pjt();
    oZi = __toESM(pt(), 1);
    XPe = __toESM(ie(), 1);
  });
  function GLn({
    inputState: e,
    children: t,
    terminalFocus: n,
    invert: r,
    hidePlaceholderText: o,
    cursorCellPainted: s,
    ...i
  }) {
    let {
      handleKeyDown: a,
      renderedValue: l,
      cursorLine: c,
      cursorColumn: u
    } = e;
    let d = SG({
      line: c,
      column: u,
      active: Boolean(i.focus && i.showCursor),
      visible: !s
    });
    let p = QPe.useRef(null);
    let m = QPe.useCallback(F => {
      p.current = F;
      d(F);
    }, [d]);
    let {
      handleKeyDown: f,
      handlePaste: h,
      isPasting: g
    } = Ajt({
      onPaste: i.onPaste,
      handleKeyDown: F => {
        if (i.onKeyDownBefore?.(F), F.defaultPrevented || F.didStopImmediatePropagation()) {
          return;
        }
        a(F);
      },
      onImagePaste: i.onImagePaste
    });
    let {
      onIsPastingChange: y
    } = i;
    QPe.useEffect(() => {
      if (y) {
        y(g);
      }
    }, [g, y]);
    let _ = i.focus !== false;
    MI(p, _);
    let b = QPe.useMemo(wre, []);
    let S = useIsScreenReaderEnabled();
    let {
      showPlaceholder: E,
      renderedPlaceholder: C
    } = GQi({
      placeholder: i.placeholder,
      value: i.value,
      showCursor: i.showCursor && !b,
      focus: i.focus,
      terminalFocus: n,
      invert: r,
      hidePlaceholderText: o || S
    });
    let x = _ ? {
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: f,
      onPaste: h
    } : {};
    let A = i.value && i.value.trim().indexOf(" ") === -1 || i.value && i.value.endsWith(" ");
    let k = Boolean(i.argumentHint && i.value && A && i.value.startsWith("/"));
    let I = i.showCursor && i.highlights ? i.highlights.filter(F => F.dimColor || i.cursorOffset < F.start || i.cursorOffset >= F.end) : i.highlights;
    let {
      viewportCharOffset: O,
      viewportCharEnd: M
    } = e;
    let L = I && O > 0 ? I.filter(F => F.end > O && F.start < M).map(F => ({
      ...F,
      start: Math.max(0, F.start - O),
      end: F.end - O
    })) : I;
    if (L && L.length > 0) {
      return Mre.jsxs(gXd, {
        ref: m,
        ...x,
        children: [Mre.jsx(gXd, {
          flexShrink: 0,
          children: Mre.jsx(sZi, {
            text: l,
            highlights: L
          })
        }), k && Mre.jsxs(Text, {
          dimColor: true,
          wrap: "truncate-end",
          children: [i.value?.endsWith(" ") ? "" : " ", i.argumentHint]
        }), t]
      });
    }
    return Mre.jsx(gXd, {
      ref: m,
      ...x,
      children: Mre.jsxs(Text, {
        wrap: "truncate-end",
        dimColor: i.dimColor,
        children: [E && C ? Mre.jsx(Ansi, {
          children: C
        }) : Mre.jsx(Ansi, {
          children: l
        }), k && Mre.jsxs(Text, {
          dimColor: true,
          children: [i.value?.endsWith(" ") ? "" : " ", i.argumentHint]
        }), t]
      })
    });
  }
  var QPe;
  var Mre;
  var Too = __lazy(() => {
    VQi();
    Soo();
    dGe();
    DPe();
    Oue();
    et();
    GWe();
    iZi();
    QPe = __toESM(ot(), 1);
    Mre = __toESM(ie(), 1);
  });
  function Dl(e) {
    let [t] = useTheme();
    let n = useTerminalFocus();
    let r = aZi.useMemo(wre, []);
    let s = useVoiceState(u => u.voiceState) === "recording";
    let [i, a] = jLn();
    uLn(n, !!e.onImagePaste);
    let l = !n ? u => u : a ? () => _$u.hex(a.hex)(a.char) : r ? u => u : OWe;
    let c = ULn({
      value: e.value,
      onChange: e.onChange,
      onSubmit: e.onSubmit,
      onExit: e.onExit,
      onExitMessage: e.onExitMessage,
      onLeftArrowOnEmpty: e.onLeftArrowOnEmpty,
      onHistoryReset: e.onHistoryReset,
      onHistoryUp: e.onHistoryUp,
      onHistoryDown: e.onHistoryDown,
      focus: e.focus,
      mask: e.mask,
      multiline: e.multiline,
      cursorChar: e.showCursor ? " " : "",
      highlightPastedText: e.highlightPastedText,
      invert: l,
      themeText: color("text", t),
      columns: e.columns,
      maxVisibleLines: e.maxVisibleLines,
      onImagePaste: e.onImagePaste,
      disableCursorMovementForUpDownKeys: e.disableCursorMovementForUpDownKeys,
      disableEscapeDoublePress: e.disableEscapeDoublePress,
      externalOffset: e.cursorOffset,
      onOffsetChange: e.onChangeCursorOffset,
      inputFilter: e.inputFilter,
      inlineGhostText: e.inlineGhostText,
      dim: _$u.dim
    });
    return Eoo.jsx(gXd, {
      ref: i,
      children: Eoo.jsx(GLn, {
        inputState: c,
        terminalFocus: n,
        highlights: e.highlights,
        invert: l,
        hidePlaceholderText: s,
        cursorCellPainted: a != null,
        ...e
      })
    });
  }
  var aZi;
  var Eoo;
  var q_ = __lazy(() => {
    dSe();
    zro();
    yoo();
    qLn();
    J8();
    et();
    GWe();
    Too();
    aZi = __toESM(ot(), 1);
    Eoo = __toESM(ie(), 1);
  });
  function lZi(e) {
    let t = Brp[e.name];
    let n = {
      upArrow: t === "upArrow",
      downArrow: t === "downArrow",
      leftArrow: t === "leftArrow",
      rightArrow: t === "rightArrow",
      pageDown: t === "pageDown",
      pageUp: t === "pageUp",
      wheelUp: false,
      wheelDown: false,
      home: t === "home",
      end: t === "end",
      return: t === "return",
      escape: t === "escape",
      tab: t === "tab",
      backspace: t === "backspace",
      delete: t === "delete",
      ctrl: e.ctrl,
      shift: e.shift,
      super: e.superKey,
      meta: e.meta
    };
    return {
      input: e.name === "enter" ? `
` : [...e.key].length === 1 ? e.key : "",
      key: n
    };
  }
  function cZi(e, t) {
    let n = "";
    if (t.escape) {
      n = "escape";
    } else if (t.return) {
      n = "return";
    } else if (t.tab) {
      n = "tab";
    } else if (t.backspace) {
      n = "backspace";
    } else if (t.delete) {
      n = "delete";
    } else if (t.upArrow) {
      n = "up";
    } else if (t.downArrow) {
      n = "down";
    } else if (t.leftArrow) {
      n = "left";
    } else if (t.rightArrow) {
      n = "right";
    } else if (t.pageUp) {
      n = "pageup";
    } else if (t.pageDown) {
      n = "pagedown";
    } else if (t.wheelUp) {
      n = "wheelup";
    } else if (t.wheelDown) {
      n = "wheeldown";
    } else if (t.home) {
      n = "home";
    } else if (t.end) {
      n = "end";
    } else if (e === `
`) {
      n = "enter";
    }
    return {
      name: n,
      key: e,
      ctrl: t.ctrl,
      shift: t.shift,
      meta: t.meta,
      superKey: t.super
    };
  }
  var Brp;
  var voo = __lazy(() => {
    Brp = {
      up: "upArrow",
      down: "downArrow",
      left: "leftArrow",
      right: "rightArrow",
      pagedown: "pageDown",
      pageup: "pageUp",
      home: "home",
      end: "end",
      return: "return",
      escape: "escape",
      tab: "tab",
      backspace: "backspace",
      delete: "delete"
    };
  });
  function VLn() {
    return {
      decls: new WeakMap(),
      scopesChanged: Si(),
      preemptiveScopes: new Map(),
      swallowAll: new Map(),
      keyDispatchTrace: Si()
    };
  }
  function zLn(e) {
    let t = woo.c(24);
    let {
      bindings: n,
      pendingChordRef: r,
      pendingChord: o,
      setPendingChord: s,
      activeContexts: i,
      registerActiveContext: a,
      unregisterActiveContext: l,
      handlerRegistryRef: c,
      preDispatchRef: u,
      keyHandlerRegistry: d,
      children: p
    } = e;
    let m;
    if (t[0] !== n) {
      m = (x, A) => U1n(x, A, n);
      t[0] = n;
      t[1] = m;
    } else {
      m = t[1];
    }
    let f = m;
    let h;
    if (t[2] !== u) {
      h = x => (u.current.add(x), () => u.current.delete(x));
      t[2] = u;
      t[3] = h;
    } else {
      h = t[3];
    }
    let g = h;
    let y;
    if (t[4] !== c) {
      y = x => {
        let A = c.current;
        if (!A) {
          return $rp;
        }
        if (!A.vZc(x.action)) {
          A.set(x.action, new Set());
        }
        A.get(x.action).add(x);
        return () => {
          let k = A.get(x.action);
          if (k) {
            if (k.delete(x), k.size === 0) {
              A.delete(x.action);
            }
          }
        };
      };
      t[4] = c;
      t[5] = y;
    } else {
      y = t[5];
    }
    let _ = y;
    let b;
    if (t[6] !== n || t[7] !== r) {
      b = (x, A, k) => ljt(cZi(x, A), k, n, r.current);
      t[6] = n;
      t[7] = r;
      t[8] = b;
    } else {
      b = t[8];
    }
    let S;
    if (t[9] !== i || t[10] !== n || t[11] !== f || t[12] !== d || t[13] !== o || t[14] !== a || t[15] !== _ || t[16] !== g || t[17] !== s || t[18] !== b || t[19] !== l) {
      S = {
        resolve: b,
        setPendingChord: s,
        getDisplayText: f,
        bindings: n,
        pendingChord: o,
        activeContexts: i,
        registerActiveContext: a,
        unregisterActiveContext: l,
        registerHandler: _,
        registerPreDispatch: g,
        keyHandlerRegistry: d
      };
      t[9] = i;
      t[10] = n;
      t[11] = f;
      t[12] = d;
      t[13] = o;
      t[14] = a;
      t[15] = _;
      t[16] = g;
      t[17] = s;
      t[18] = b;
      t[19] = l;
      t[20] = S;
    } else {
      S = t[20];
    }
    let E = S;
    let C;
    if (t[21] !== p || t[22] !== E) {
      C = dZi.jsx(uZi.Provider, {
        value: E,
        children: p
      });
      t[21] = p;
      t[22] = E;
      t[23] = C;
    } else {
      C = t[23];
    }
    return C;
  }
  function $rp() {}
  function tE() {
    return lut.useContext(uZi);
  }
  function KLn(e, t) {
    let n = woo.c(5);
    let r = t === undefined ? true : t;
    let o = tE();
    let s;
    let i;
    if (n[0] !== e || n[1] !== r || n[2] !== o) {
      s = () => {
        if (!o || !r) {
          return;
        }
        o.registerActiveContext(e);
        return () => {
          o.unregisterActiveContext(e);
        };
      };
      i = [e, o, r];
      n[0] = e;
      n[1] = r;
      n[2] = o;
      n[3] = s;
      n[4] = i;
    } else {
      s = n[3];
      i = n[4];
    }
    lut.useLayoutEffect(s, i);
  }
  var woo;
  var lut;
  var dZi;
  var uZi;
  var yq = __lazy(() => {
    ph();
    voo();
    BPe();
    woo = __toESM(pt(), 1);
    lut = __toESM(ot(), 1);
    dZi = __toESM(ie(), 1);
    uZi = lut.createContext(null);
  });
  function uo(e, t, n = {}) {
    let {
      context: r = "Global",
      isActive: o = true
    } = n;
    let s = tE();
    let i = ZPe.useRef(t);
    i.current = t;
    ZPe.useEffect(() => {
      if (!s || !o) {
        return;
      }
      return s.registerHandler({
        action: e,
        context: r,
        handler: () => i.current(),
        singleKey: true
      });
    }, [e, r, s, o]);
  }
  function jo(e, t = {}) {
    let {
      context: n = "Global",
      isActive: r = true
    } = t;
    let o = tE();
    let s = ZPe.useRef(e);
    s.current = e;
    let i = Object.keys(e).sort().join("|");
    ZPe.useEffect(() => {
      if (!o || !r) {
        return;
      }
      let a = [];
      for (let l of Object.keys(s.current)) {
        a.push(o.registerHandler({
          action: l,
          context: n,
          handler: () => s.current[l]?.(),
          singleKey: true
        }));
      }
      return () => {
        for (let l of a) {
          l();
        }
      };
    }, [n, i, o, r]);
  }
  function cut(e, {
    isActive: t = true
  } = {}) {
    let n = tE();
    let r = ZPe.useRef(e);
    r.current = e;
    ZPe.useEffect(() => {
      if (!t || !n) {
        return;
      }
      return n.registerPreDispatch((o, s, i) => r.current(o, s, i));
    }, [t, n]);
  }
  var ZPe;
  var Bs = __lazy(() => {
    yq();
    ZPe = __toESM(ot(), 1);
  });
  function yZi(e, t) {
    if (!e) {
      return {
        directory: t || Nt(),
        prefix: ""
      };
    }
    let n = us(e, t);
    if (e.endsWith("/") || e.endsWith(rX.sep)) {
      return {
        directory: n,
        prefix: ""
      };
    }
    let r = rX.dirname(n);
    let o = rX.basename(e);
    return {
      directory: r,
      prefix: o
    };
  }
  async function Hrp(e) {
    let t = pZi.get(e);
    if (t) {
      return t;
    }
    try {
      let o = (await zt().readdir(e)).filter(s => s.isDirectory() && !s.name.startsWith(".")).map(s => ({
        name: s.name,
        path: rX.join(e, s.name),
        type: "directory"
      })).slice(0, 5000);
      pZi.set(e, o);
      return o;
    } catch (n) {
      logForDebugging(`Directory completion: failed to scan ${e}: ${n instanceof Error ? n.message : String(n)}`, {
        level: "error"
      });
      return [];
    }
  }
  async function YLn(e, t = {}) {
    if (va()) {
      return [];
    }
    let {
      basePath: n = Nt(),
      maxResults: r = 10
    } = t;
    let {
      directory: o,
      prefix: s
    } = yZi(e, n);
    let i = await Hrp(o);
    let a = s.toLowerCase();
    return i.filter(c => c.name.toLowerCase().startsWith(a)).slice(0, r).map(c => ({
      id: c.path,
      displayText: c.name + "/",
      description: "directory",
      metadata: {
        type: "directory"
      }
    }));
  }
  function Coo(e) {
    return e.startsWith("~/") || e.startsWith("/") || e.startsWith("./") || e.startsWith("../") || e === "~" || e === "." || e === "..";
  }
  async function jrp(e, t = false) {
    let n = `${e}:${t}`;
    let r = mZi.get(n);
    if (r) {
      return r;
    }
    try {
      let i = (await zt().readdir(e)).filter(a => t || !a.name.startsWith(".")).map(a => ({
        name: a.name,
        path: rX.join(e, a.name),
        type: a.isDirectory() ? "directory" : "file"
      })).sort((a, l) => {
        if (a.type === "directory" && l.type !== "directory") {
          return -1;
        }
        if (a.type !== "directory" && l.type === "directory") {
          return 1;
        }
        return a.name.localeCompare(l.name);
      }).slice(0, 5000);
      mZi.set(n, i);
      return i;
    } catch (o) {
      logForDebugging(`Failed to scan directory for path completion: ${o}`, {
        level: "error"
      });
      return [];
    }
  }
  async function Roo(e, t = {}) {
    if (va()) {
      return [];
    }
    let {
      basePath: n = Nt(),
      maxResults: r = 10,
      includeFiles: o = true,
      includeHidden: s = false
    } = t;
    let {
      directory: i,
      prefix: a
    } = yZi(e, n);
    let l = await jrp(i, s);
    let c = a.toLowerCase();
    let u = l.filter(m => {
      if (!o && m.type === "file") {
        return false;
      }
      return m.name.toLowerCase().startsWith(c);
    }).slice(0, r);
    let d = e.includes("/") || e.includes(rX.sep);
    let p = "";
    if (d) {
      let m = e.lastIndexOf("/");
      let f = e.lastIndexOf(rX.sep);
      let h = Math.max(m, f);
      p = e.substring(0, h + 1);
    }
    if (p.startsWith("./") || p.startsWith("." + rX.sep)) {
      p = p.slice(2);
    }
    return u.map(m => {
      let f = p + m.name;
      return {
        id: f,
        displayText: m.type === "directory" ? f + "/" : f,
        metadata: {
          type: m.type
        }
      };
    });
  }
  var rX;
  var pZi;
  var mZi;
  var xoo = __lazy(() => {
    snt();
    vo();
    ku();
    ru();
    je();
    rX = require("path");
    pZi = new tW({
      max: 500,
      ttl: 300000
    });
    mZi = new tW({
      max: 500,
      ttl: 300000
    });
  });
  function NI(e, t, n) {
    let r = tE();
    let o = r ? mro(e, t, r.bindings) : undefined;
    let s = o === undefined;
    let i = r ? "action_not_found" : "no_context";
    let a = JLn.useRef(false);
    if (JLn.useEffect(() => {
      if (s && !a.current) {
        a.current = true;
        logEvent("tengu_keybinding_fallback_used", {
          action: e,
          context: t,
          fallback: n,
          reason: i
        });
      }
    }, [s, e, t, n, i]), o === undefined) {
      return n;
    }
    return o === null ? "" : ZJ(o);
  }
  var JLn;
  var eOe = __lazy(() => {
    Ot();
    yq();
    BPe();
    JLn = __toESM(ot(), 1);
  });
  function Wrp(e) {
    let {
      style: t,
      ...n
    } = e;
    return {
      ...qrp[t ?? "default"],
      ...Grp(n)
    };
  }
  function Grp(e) {
    let t = {};
    for (let n in e) {
      if (e[n] !== undefined) {
        t[n] = e[n];
      }
    }
    return t;
  }
  function tOe(e, t = {}) {
    let n = Wrp(t);
    let r = c => Qrp(c, n);
    let o = c => c.map(r).join(n.chordSep);
    if (e.length === 0) {
      return "";
    }
    if (e.length === 1) {
      return o(e[0]);
    }
    let s = e.every(c => c.length === 1) ? e.map(c => c[0]) : undefined;
    if (!s) {
      return e.map(o).join("/");
    }
    let i = Zrp(s, n);
    let l = s.every(c => Yrp.vZc(c.key)) && (!!i || s.every(c => QLn(c, n).length === 0)) ? n.arrowSep : "/";
    if (i) {
      let c = s.map(u => r({
        ...u,
        ...Jrp
      }));
      return top(i, n) + c.join(l);
    }
    return s.map(r).join(l);
  }
  function koo(e) {
    let t = [];
    if (e.ctrl) {
      t.push("ctrl");
    }
    if (e.shift) {
      t.push("shift");
    }
    if (e.alt || e.meta) {
      t.push("alt");
    }
    if (e.super) {
      t.push("super");
    }
    return t;
  }
  function XLn(e, t) {
    let n = Krp[e][t.modCase];
    return typeof n === "function" ? n(t.platform) : n;
  }
  function Xrp(e, t) {
    let n = Vrp[e];
    if (n) {
      return n[zrp[t.keyCase]];
    }
    return t.charCase === "upper" ? e.toUpperCase() : e;
  }
  function _Zi(e) {
    return e.shift && !e.ctrl && !e.alt && !e.meta && !e.super && e.key.length === 1 && e.key >= "a" && e.key <= "z";
  }
  function Qrp(e, t) {
    if (t.shiftAsCase && _Zi(e)) {
      return e.key.toUpperCase();
    }
    let n = koo(e);
    let r = Xrp(e.key, t);
    if (t.caretCtrl && n.length === 1 && n[0] === "ctrl") {
      return `^${r}`;
    }
    if (t.modCase === "glyph") {
      return n.map(o => XLn(o, t)).join("") + r;
    }
    return [...n.map(o => XLn(o, t)), r].join(t.modSep);
  }
  function Zrp(e, t) {
    let [n, ...r] = e;
    if (!QLn(n, t).length) {
      return;
    }
    return r.every(s => eop(n, s, t)) ? n : undefined;
  }
  function QLn(e, t) {
    if (t.shiftAsCase && _Zi(e)) {
      return [];
    }
    return koo(e);
  }
  function eop(e, t, n) {
    let r = QLn(e, n);
    let o = QLn(t, n);
    return r.length === o.length && r.every((s, i) => s === o[i]);
  }
  function top(e, t) {
    let n = koo(e);
    if (t.caretCtrl && n.length === 1 && n[0] === "ctrl") {
      return "^";
    }
    if (t.modCase === "glyph") {
      return n.map(r => XLn(r, t)).join("");
    }
    return n.map(r => XLn(r, t)).join(t.modSep) + t.modSep;
  }
  var qrp;
  var Vrp;
  var zrp;
  var Krp;
  var Yrp;
  var Jrp;
  var ZLn = __lazy(() => {
    qrp = {
      default: {
        keyCase: "title",
        modCase: "lower",
        caretCtrl: false,
        modSep: "+",
        arrowSep: "/",
        chordSep: " ",
        shiftAsCase: false,
        charCase: "preserve",
        platform: "other"
      },
      compact: {
        keyCase: "lower",
        modCase: "lower",
        caretCtrl: true,
        modSep: "+",
        arrowSep: "",
        chordSep: " ",
        shiftAsCase: true,
        charCase: "preserve",
        platform: "other"
      },
      symbol: {
        keyCase: "glyph",
        modCase: "glyph",
        caretCtrl: false,
        modSep: "",
        arrowSep: "",
        chordSep: " ",
        shiftAsCase: true,
        charCase: "upper",
        platform: "other"
      }
    };
    Vrp = {
      enter: ["Enter", "enter", "\u23CE"],
      escape: ["Esc", "esc", "\u238B"],
      tab: ["Tab", "tab", "\u21E5"],
      " ": ["Space", "space", "\u2423"],
      backspace: ["Backspace", "backspace", "\u232B"],
      delete: ["Delete", "delete", "\u2326"],
      up: ["\u2191", "\u2191", "\u2191"],
      down: ["\u2193", "\u2193", "\u2193"],
      left: ["\u2190", "\u2190", "\u2190"],
      right: ["\u2192", "\u2192", "\u2192"],
      pageup: ["PageUp", "pgup", "\u21DE"],
      pagedown: ["PageDown", "pgdn", "\u21DF"],
      home: ["Home", "home", "\u2196"],
      end: ["End", "end", "\u2198"]
    };
    zrp = {
      title: 0,
      lower: 1,
      glyph: 2
    };
    Krp = {
      ctrl: {
        lower: "ctrl",
        title: "Ctrl",
        glyph: "\u2303"
      },
      shift: {
        lower: "shift",
        title: "Shift",
        glyph: "\u21E7"
      },
      alt: {
        lower: e => e === "macos" ? "opt" : "alt",
        title: e => e === "macos" ? "Opt" : "Alt",
        glyph: "\u2325"
      },
      super: {
        lower: e => e === "macos" ? "cmd" : "super",
        title: e => e === "macos" ? "Cmd" : "Super",
        glyph: "\u2318"
      }
    };
    Yrp = new Set(["up", "down", "left", "right"]);
    Jrp = {
      ctrl: false,
      alt: false,
      shift: false,
      meta: false,
      super: false
    };
  });
  function xt(e) {
    let t = bZi.c(12);
    let {
      chord: n,
      action: r,
      format: o,
      parens: s,
      bold: i
    } = e;
    let a = s === undefined ? false : s;
    let l = i === undefined ? false : i;
    let c = Lct() === "macos" ? "macos" : "other";
    let u;
    if (t[0] !== n || t[1] !== o) {
      u = tOe((typeof n === "string" ? [n] : n).map(hG), {
        ...o,
        platform: o?.platform ?? c
      });
      t[0] = n;
      t[1] = o;
      t[2] = u;
    } else {
      u = t[2];
    }
    let d = u;
    if (!d) {
      return null;
    }
    let p;
    if (t[3] !== l || t[4] !== d) {
      p = l ? Ojt.jsx(BaseText, {
        bold: true,
        children: d
      }) : d;
      t[3] = l;
      t[4] = d;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m = p;
    if (a) {
      let h;
      if (t[6] !== r || t[7] !== m) {
        h = Ojt.jsxs(BaseText, {
          children: ["(", m, " to ", r, ")"]
        });
        t[6] = r;
        t[7] = m;
        t[8] = h;
      } else {
        h = t[8];
      }
      return h;
    }
    let f;
    if (t[9] !== r || t[10] !== m) {
      f = Ojt.jsxs(BaseText, {
        children: [m, " to ", r]
      });
      t[9] = r;
      t[10] = m;
      t[11] = f;
    } else {
      f = t[11];
    }
    return f;
  }
  var bZi;
  var Ojt;
  var bs = __lazy(() => {
    HWe();
    F1n();
    ZLn();
    bZi = __toESM(pt(), 1);
    Ojt = __toESM(ie(), 1);
  });
  function Wr(e) {
    let t = SZi.c(5);
    let {
      action: n,
      context: r,
      fallback: o,
      description: s,
      parens: i,
      bold: a
    } = e;
    let l = NI(n, r, o);
    let c;
    if (t[0] !== a || t[1] !== l || t[2] !== s || t[3] !== i) {
      c = TZi.jsx(xt, {
        chord: l,
        action: s,
        parens: i,
        bold: a
      });
      t[0] = a;
      t[1] = l;
      t[2] = s;
      t[3] = i;
      t[4] = c;
    } else {
      c = t[4];
    }
    return c;
  }
  var SZi;
  var TZi;
  var Sd = __lazy(() => {
    eOe();
    bs();
    SZi = __toESM(pt(), 1);
    TZi = __toESM(ie(), 1);
  });
  function nE() {
    return mGe.useContext(_q) !== null;
  }
  function h_(e) {
    let t = EZi.c(3);
    let n = mGe.useContext(_q);
    let r;
    if (t[0] !== n || t[1] !== e) {
      r = n ? {
        rows: n.rows,
        columns: n.columns
      } : e;
      t[0] = n;
      t[1] = e;
      t[2] = r;
    } else {
      r = t[2];
    }
    return r;
  }
  function uut() {
    return mGe.useContext(_q)?.scrollRef ?? null;
  }
  function eFn() {
    return mGe.useContext(_q)?.claimScrollBox ?? null;
  }
  var EZi;
  var mGe;
  var _q;
  var rE = __lazy(() => {
    EZi = __toESM(pt(), 1);
    mGe = __toESM(ot(), 1);
    _q = mGe.createContext(null);
  });
  function e$(e) {
    if (typeof e === "string") {
      return e;
    }
    if (typeof e === "number") {
      return String(e);
    }
    if (!e) {
      return "";
    }
    if (Array.isArray(e)) {
      return e.map(e$).join("");
    }
    if (vZi.isValidElement(e)) {
      return e$(e.props.children);
    }
    return "";
  }
  var vZi;
  var Djt = __lazy(() => {
    vZi = __toESM(ot(), 1);
  });
  function Ps(e) {
    let t = wZi.c(8);
    let {
      status: n,
      withSpace: r
    } = e;
    let o = r === undefined ? false : r;
    let s = Aoo[n];
    let i = !s.color;
    let a;
    if (t[0] !== s.ariaLabel || t[1] !== s.icon) {
      a = tFn.jsx(Text, {
        "aria-label": s.ariaLabel,
        children: s.icon
      });
      t[0] = s.ariaLabel;
      t[1] = s.icon;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l = o && " ";
    let c;
    if (t[3] !== s.color || t[4] !== i || t[5] !== a || t[6] !== l) {
      c = tFn.jsxs(Text, {
        color: s.color,
        dimColor: i,
        children: [a, l]
      });
      t[3] = s.color;
      t[4] = i;
      t[5] = a;
      t[6] = l;
      t[7] = c;
    } else {
      c = t[7];
    }
    return c;
  }
  var wZi;
  var tFn;
  var Aoo;
  var Vf = __lazy(() => {
    et();
    wZi = __toESM(pt(), 1);
    tFn = __toESM(ie(), 1);
    Aoo = {
      success: {
        icon: vGd.tick,
        color: "success",
        ariaLabel: "done:"
      },
      error: {
        icon: vGd.cross,
        color: "error",
        ariaLabel: "failed:"
      },
      warning: {
        icon: vGd.warning,
        color: "warning",
        ariaLabel: "warning:"
      },
      info: {
        icon: vGd.info,
        color: "suggestion",
        ariaLabel: "note:"
      },
      pending: {
        icon: vGd.circle,
        color: undefined,
        ariaLabel: "pending:"
      },
      loading: {
        icon: "\u2026",
        color: undefined,
        ariaLabel: "loading:"
      }
    };
  });
  function Jg(e, t) {
    let n = CZi.c(8);
    let r = t === undefined ? true : t;
    let s = dut.useContext(Dct)?.setState;
    let i;
    let a;
    if (n[0] !== r || n[1] !== e || n[2] !== s) {
      i = () => {
        if (!r || !s) {
          return;
        }
        s(u => {
          if (u.activeOverlays.vZc(e)) {
            return u;
          }
          let d = new Set(u.activeOverlays);
          d.add(e);
          return {
            ...u,
            activeOverlays: d
          };
        });
        return () => {
          s(u => {
            if (!u.activeOverlays.vZc(e)) {
              return u;
            }
            let d = new Set(u.activeOverlays);
            d.delete(e);
            return {
              ...u,
              activeOverlays: d
            };
          });
        };
      };
      a = [e, r, s];
      n[0] = r;
      n[1] = e;
      n[2] = s;
      n[3] = i;
      n[4] = a;
    } else {
      i = n[3];
      a = n[4];
    }
    dut.useEffect(i, a);
    let l;
    let c;
    if (n[5] !== r) {
      l = () => {
        if (!r) {
          return;
        }
        return oop;
      };
      c = [r];
      n[5] = r;
      n[6] = l;
      n[7] = c;
    } else {
      l = n[6];
      c = n[7];
    }
    dut.useLayoutEffect(l, c);
  }
  function oop() {
    return rVd.get(process.stdout)?.invalidatePrevFrame();
  }
  function RZi() {
    return bt(sop);
  }
  function sop(e) {
    return e.activeOverlays.size > 0;
  }
  function TSe() {
    return bt(iop);
  }
  function iop(e) {
    for (let t of e.activeOverlays) {
      if (!nop.vZc(t)) {
        return true;
      }
    }
    return false;
  }
  function nFn() {
    return fw(aop) ?? false;
  }
  function aop(e) {
    for (let t of e.activeOverlays) {
      if (rop.vZc(t)) {
        return true;
      }
    }
    return false;
  }
  var CZi;
  var dut;
  var nop;
  var rop;
  var px = __lazy(() => {
    ho();
    CZi = __toESM(pt(), 1);
    dut = __toESM(ot(), 1);
    nop = new Set(["autocomplete"]);
    rop = new Set(["history-search"]);
  });
  function Ioo() {
    let e = Mjt.c(3);
    let [t, n] = t$.useState("");
    let r = t$.useRef("");
    let o;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = a => {
        r.current = a(r.current);
        n(r.current);
      };
      e[0] = o;
    } else {
      o = e[0];
    }
    let s = o;
    let i;
    if (e[1] !== t) {
      i = [t, r, s];
      e[1] = t;
      e[2] = i;
    } else {
      i = e[2];
    }
    return i;
  }
  function xZi(e) {
    let t = Mjt.c(47);
    let {
      options: n,
      onChange: r,
      onFocus: o,
      onCancel: s,
      isDisabled: i,
      disableSelection: a,
      defaultValue: l
    } = e;
    let c = i === undefined ? false : i;
    let u = a === undefined ? false : a;
    let [d, p, m] = Ioo();
    let [f, h] = t$.useState(null);
    let [g, y] = t$.useState(null);
    let _ = g !== null && n[g - 1]?.type === "input" ? n[g - 1] : null;
    let b = t$.useRef(null);
    MI(b, !c);
    Jg("select", !!s && !c);
    let S;
    if (t[0] !== u || t[1] !== _ || t[2] !== r || t[3] !== o || t[4] !== n || t[5] !== m) {
      S = W => {
        if (u) {
          return;
        }
        if (_) {
          if (W === "") {
            h("Enter some text, or Escape for the list.");
            return;
          }
          r?.(_.value);
          m(mop);
          y(null);
          return;
        }
        let j = Number.parseInt(W, 10);
        if (!Number.isFinite(j) || j < 1 || j > n.length) {
          h(`Invalid selection "${W}". Enter a number between 1 and ${n.length}.`);
          m(pop);
          return;
        }
        let z = n[j - 1];
        if (z.disabled) {
          h(`Option ${j} is disabled.`);
          m(dop);
          return;
        }
        if (z.type === "input") {
          y(j);
          let V = z.initialValue ?? "";
          m(() => V);
          z.onChange(V);
          o?.(z.value);
          return;
        }
        r?.(z.value);
        m(uop);
      };
      t[0] = u;
      t[1] = _;
      t[2] = r;
      t[3] = o;
      t[4] = n;
      t[5] = m;
      t[6] = S;
    } else {
      S = t[6];
    }
    let E = S;
    let C;
    if (t[7] !== p || t[8] !== u || t[9] !== _ || t[10] !== c || t[11] !== s || t[12] !== o || t[13] !== n || t[14] !== m || t[15] !== E) {
      C = W => {
        if (c) {
          return;
        }
        if (W.key === "escape") {
          if (W.preventDefault(), _) {
            y(null);
            m(cop);
            let z = n.find(lop) ?? n[0];
            if (z) {
              o?.(z.value);
            }
            return;
          }
          s?.();
          return;
        }
        if (u) {
          return;
        }
        if (W.key === "return") {
          if (W.preventDefault(), _ || p.current.length > 0) {
            E(p.current);
          }
          return;
        }
        if (W.key === "backspace" || W.key === "delete") {
          W.preventDefault();
          let z = p.current.slice(0, -1);
          m(() => z);
          _?.onChange(z);
          return;
        }
        if (_) {
          if (W.key.length === 1 && !W.ctrl && !W.meta) {
            W.preventDefault();
            let z = p.current + W.key;
            m(() => z);
            _.onChange(z);
          }
          return;
        }
        let j = N7(W.key);
        if (/^[0-9]$/.test(j)) {
          W.preventDefault();
          h(null);
          m(z => z + j);
        }
      };
      t[7] = p;
      t[8] = u;
      t[9] = _;
      t[10] = c;
      t[11] = s;
      t[12] = o;
      t[13] = n;
      t[14] = m;
      t[15] = E;
      t[16] = C;
    } else {
      C = t[16];
    }
    let x = C;
    let A;
    if (t[17] !== d || t[18] !== _ || t[19] !== g || t[20] !== s || t[21] !== n.length) {
      A = _ ? `Enter text for option ${g} (${e$(_.label)}), or Escape for the list: ${d}` : `Enter selection [1-${n.length}]${s ? ", or Escape to cancel" : ""}: ${d}`;
      t[17] = d;
      t[18] = _;
      t[19] = g;
      t[20] = s;
      t[21] = n.length;
      t[22] = A;
    } else {
      A = t[22];
    }
    let k = A;
    let I;
    if (t[23] !== k) {
      I = an(k);
      t[23] = k;
      t[24] = I;
    } else {
      I = t[24];
    }
    let O = !c && !u;
    let M;
    if (t[25] !== I || t[26] !== O) {
      M = {
        line: 0,
        column: I,
        active: O,
        visible: true
      };
      t[25] = I;
      t[26] = O;
      t[27] = M;
    } else {
      M = t[27];
    }
    let L = SG(M);
    let P;
    if (t[28] !== x || t[29] !== c) {
      P = c ? {} : {
        tabIndex: 0,
        onKeyDown: x
      };
      t[28] = x;
      t[29] = c;
      t[30] = P;
    } else {
      P = t[30];
    }
    let F;
    if (t[31] !== l || t[32] !== n) {
      let W;
      if (t[34] !== l) {
        W = (j, z) => lM.jsx(AZi, {
          index: z + 1,
          option: j,
          selected: l !== undefined && j.value === l
        }, String(j.value));
        t[34] = l;
        t[35] = W;
      } else {
        W = t[35];
      }
      F = n.map(W);
      t[31] = l;
      t[32] = n;
      t[33] = F;
    } else {
      F = t[33];
    }
    let H;
    if (t[36] !== f) {
      H = f && lM.jsx(Text, {
        children: f
      });
      t[36] = f;
      t[37] = H;
    } else {
      H = t[37];
    }
    let U;
    if (t[38] !== L || t[39] !== u || t[40] !== k) {
      U = !u && lM.jsx(gXd, {
        ref: L,
        children: lM.jsx(Text, {
          children: k
        })
      });
      t[38] = L;
      t[39] = u;
      t[40] = k;
      t[41] = U;
    } else {
      U = t[41];
    }
    let N;
    if (t[42] !== F || t[43] !== H || t[44] !== U || t[45] !== P) {
      N = lM.jsxs(gXd, {
        ref: b,
        flexDirection: "column",
        ...P,
        children: [F, H, U]
      });
      t[42] = F;
      t[43] = H;
      t[44] = U;
      t[45] = P;
      t[46] = N;
    } else {
      N = t[46];
    }
    return N;
  }
  function lop(e) {
    return e.type !== "input";
  }
  function cop() {
    return "";
  }
  function uop() {
    return "";
  }
  function dop() {
    return "";
  }
  function pop() {
    return "";
  }
  function mop() {
    return "";
  }
  function kZi({
    options: e,
    defaultValue: t = [],
    onChange: n,
    onSubmit: r,
    onFocus: o,
    onCancel: s,
    isDisabled: i = false,
    submitButtonText: a
  }) {
    let [l, c, u] = Ioo();
    let [d, p] = t$.useState(null);
    let [m, f] = t$.useState(null);
    let h = t$.useRef(false);
    t$.useEffect(() => {
      if (m !== null) {
        let I = [...m];
        f(null);
        h.current = false;
        r?.(I);
      }
    }, [m]);
    let [g, y] = t$.useState(null);
    let _ = g && e[g.index - 1]?.type === "input" ? e[g.index - 1] : null;
    let b = t$.useRef(null);
    MI(b, !i);
    Jg("multi-select", !!s && !i);
    let S = I => {
      h.current = true;
      n?.([...I]);
      f(I);
      u(() => "");
      y(null);
    };
    let E = I => {
      if (_ && g) {
        if (I === "") {
          p("Enter some text, or Escape for the list.");
          return;
        }
        S([...g.stashed, _.value]);
        return;
      }
      let O = I.trim();
      if (O === "") {
        S(t);
        return;
      }
      let M = O.split(/[\s,]+/).filter(Boolean);
      if (M.length === 0) {
        S(t);
        return;
      }
      let L = new Set();
      let P = [];
      let F = null;
      for (let H of M) {
        if (!/^\d+$/.test(H)) {
          p(`Invalid selection "${H}". Enter numbers between 1 and ${e.length}, comma- or space-separated.`);
          u(() => "");
          return;
        }
        let U = Number.parseInt(H, 10);
        if (L.vZc(U)) {
          continue;
        }
        if (L.add(U), U < 1 || U > e.length) {
          p(`Invalid selection "${H}". Enter numbers between 1 and ${e.length}, comma- or space-separated.`);
          u(() => "");
          return;
        }
        let N = e[U - 1];
        if (N.disabled) {
          p(`Option ${U} is disabled.`);
          u(() => "");
          return;
        }
        if (N.type === "input") {
          if (F) {
            p("Only one free-text option can be included per selection.");
            u(() => "");
            return;
          }
          F = {
            index: U,
            opt: N
          };
          continue;
        }
        P.push(N.value);
      }
      if (F?.opt) {
        y({
          index: F.index,
          stashed: P,
          raw: O
        });
        let H = F.opt.initialValue ?? "";
        u(() => H);
        F.opt.onChange(H);
        o?.(F.opt.value);
        return;
      }
      S(P);
    };
    let C = I => {
      if (i) {
        return;
      }
      if (I.key === "escape") {
        if (I.preventDefault(), g) {
          let {
            raw: M
          } = g;
          y(null);
          u(() => M);
          let L = e.find(P => P.type !== "input") ?? e[0];
          if (L) {
            o?.(L.value);
          }
          return;
        }
        s?.();
        return;
      }
      if (I.key === "return") {
        if (I.preventDefault(), !h.current) {
          E(c.current);
        }
        return;
      }
      if (I.key === "backspace" || I.key === "delete") {
        I.preventDefault();
        let M = c.current.slice(0, -1);
        u(() => M);
        _?.onChange(M);
        return;
      }
      if (_) {
        if (I.key.length === 1 && !I.ctrl && !I.meta) {
          I.preventDefault();
          let M = c.current + I.key;
          u(() => M);
          _.onChange(M);
        }
        return;
      }
      let O = Bae(N7(I.key)).replace("\uFF0C", ",").replace("\u3001", ",");
      if (/^[0-9, ]$/.test(O)) {
        I.preventDefault();
        p(null);
        u(M => M + O);
      }
    };
    let x = _ ? `Enter text for option ${g?.index} (${e$(_.label)}), or Escape for the list: ${l}` : `Enter selections (comma- or space-separated) [1-${e.length}]${a ? ` then Enter to ${a}` : ""}${t.length > 0 ? ", bare Enter for defaults" : ""}${s ? ", or Escape to cancel" : ""}: ${l}`;
    let A = SG({
      line: 0,
      column: an(x),
      active: !i,
      visible: true
    });
    let k = new Set(t);
    return lM.jsxs(gXd, {
      ref: b,
      flexDirection: "column",
      ...(i ? {} : {
        tabIndex: 0,
        onKeyDown: C
      }),
      children: [e.map((I, O) => lM.jsx(AZi, {
        index: O + 1,
        option: I,
        selected: k.vZc(I.value)
      }, String(I.value))), d && lM.jsx(Text, {
        children: d
      }), lM.jsx(gXd, {
        ref: A,
        children: lM.jsx(Text, {
          children: x
        })
      })]
    });
  }
  function AZi(e) {
    let t = Mjt.c(10);
    let {
      index: n,
      option: r,
      selected: o
    } = e;
    let s;
    if (t[0] !== r.label) {
      s = e$(r.label);
      t[0] = r.label;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a = r.description ? ` \u2014 ${r.description}` : "";
    let l = r.disabled ? "(disabled)" : null;
    let c = o ? "(selected)" : null;
    let u;
    if (t[2] !== l || t[3] !== c) {
      u = [l, c].filter(Boolean);
      t[2] = l;
      t[3] = c;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d = u.join(" ");
    let p = d ? `${d} ` : "";
    let m;
    if (t[5] !== a || t[6] !== n || t[7] !== i || t[8] !== p) {
      m = lM.jsxs(Text, {
        children: [n, ". ", p, i, a]
      });
      t[5] = a;
      t[6] = n;
      t[7] = i;
      t[8] = p;
      t[9] = m;
    } else {
      m = t[9];
    }
    return m;
  }
  function IZi(e) {
    let t = Mjt.c(34);
    let {
      confirmLabel: n,
      cancelLabel: r,
      onConfirm: o,
      onCancel: s
    } = e;
    let [i, a, l] = Ioo();
    let [c, u] = t$.useState(null);
    let d = t$.useRef(null);
    MI(d, true);
    Jg("select", true);
    let p;
    if (t[0] !== s || t[1] !== o || t[2] !== l) {
      p = M => {
        let L = M.trim().toLowerCase();
        if (L === "y" || L === "yes") {
          return o();
        }
        if (L === "n" || L === "no") {
          return s();
        }
        u("Please answer y or n.");
        l(hop);
      };
      t[0] = s;
      t[1] = o;
      t[2] = l;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m = p;
    let f;
    if (t[4] !== a || t[5] !== s || t[6] !== l || t[7] !== m) {
      f = M => {
        if (M.key === "escape") {
          M.preventDefault();
          return s();
        }
        if (M.key === "return") {
          M.preventDefault();
          return m(a.current);
        }
        if (M.key === "backspace" || M.key === "delete") {
          M.preventDefault();
          l(fop);
          return;
        }
        if (M.key.length === 1 && !M.ctrl && !M.meta) {
          M.preventDefault();
          u(null);
          l(L => L + M.key);
        }
      };
      t[4] = a;
      t[5] = s;
      t[6] = l;
      t[7] = m;
      t[8] = f;
    } else {
      f = t[8];
    }
    let h = f;
    let g = `Enter y/n: ${i}`;
    let y;
    if (t[9] !== g) {
      y = an(g);
      t[9] = g;
      t[10] = y;
    } else {
      y = t[10];
    }
    let _;
    if (t[11] !== y) {
      _ = {
        line: 0,
        column: y,
        active: true,
        visible: true
      };
      t[11] = y;
      t[12] = _;
    } else {
      _ = t[12];
    }
    let b = SG(_);
    let S;
    if (t[13] !== n) {
      S = e$(n);
      t[13] = n;
      t[14] = S;
    } else {
      S = t[14];
    }
    let E;
    if (t[15] !== S) {
      E = lM.jsxs(Text, {
        children: ["y. ", S]
      });
      t[15] = S;
      t[16] = E;
    } else {
      E = t[16];
    }
    let C;
    if (t[17] !== r) {
      C = e$(r);
      t[17] = r;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x;
    if (t[19] !== C) {
      x = lM.jsxs(Text, {
        children: ["n. ", C]
      });
      t[19] = C;
      t[20] = x;
    } else {
      x = t[20];
    }
    let A;
    if (t[21] !== c) {
      A = c && lM.jsx(Text, {
        children: c
      });
      t[21] = c;
      t[22] = A;
    } else {
      A = t[22];
    }
    let k;
    if (t[23] !== g) {
      k = lM.jsx(Text, {
        children: g
      });
      t[23] = g;
      t[24] = k;
    } else {
      k = t[24];
    }
    let I;
    if (t[25] !== b || t[26] !== k) {
      I = lM.jsx(gXd, {
        ref: b,
        children: k
      });
      t[25] = b;
      t[26] = k;
      t[27] = I;
    } else {
      I = t[27];
    }
    let O;
    if (t[28] !== h || t[29] !== I || t[30] !== E || t[31] !== x || t[32] !== A) {
      O = lM.jsxs(gXd, {
        ref: d,
        flexDirection: "column",
        tabIndex: 0,
        onKeyDown: h,
        children: [E, x, A, I]
      });
      t[28] = h;
      t[29] = I;
      t[30] = E;
      t[31] = x;
      t[32] = A;
      t[33] = O;
    } else {
      O = t[33];
    }
    return O;
  }
  function fop(e) {
    return e.slice(0, -1);
  }
  function hop() {
    return "";
  }
  var Mjt;
  var t$;
  var lM;
  var rFn = __lazy(() => {
    px();
    dGe();
    Oue();
    bc();
    et();
    Djt();
    Zn();
    Mjt = __toESM(pt(), 1);
    t$ = __toESM(ot(), 1);
    lM = __toESM(ie(), 1);
  });
  function DZi(e) {
    let t = PZi.c(15);
    let {
      imageId: n,
      backgroundColor: r,
      isSelected: o
    } = e;
    let s = o === undefined ? false : o;
    let i = fw(c => c.storedImagePaths.get(n) ?? null) ?? null;
    let a = `[Image #${n}]`;
    if (i && Hk()) {
      let c;
      if (t[0] !== i) {
        c = OZi.pathToFileURL(i);
        t[0] = i;
        t[1] = c;
      } else {
        c = t[1];
      }
      let u = c.href;
      let d;
      let p;
      if (t[2] !== r || t[3] !== a || t[4] !== s) {
        d = Njt.jsx(Text, {
          backgroundColor: r,
          inverse: s,
          children: a
        });
        p = Njt.jsx(Text, {
          backgroundColor: r,
          inverse: s,
          bold: s,
          children: a
        });
        t[2] = r;
        t[3] = a;
        t[4] = s;
        t[5] = d;
        t[6] = p;
      } else {
        d = t[5];
        p = t[6];
      }
      let m;
      if (t[7] !== u || t[8] !== d || t[9] !== p) {
        m = Njt.jsx(Link, {
          url: u,
          fallback: d,
          children: p
        });
        t[7] = u;
        t[8] = d;
        t[9] = p;
        t[10] = m;
      } else {
        m = t[10];
      }
      return m;
    }
    let l;
    if (t[11] !== r || t[12] !== a || t[13] !== s) {
      l = Njt.jsx(Text, {
        backgroundColor: r,
        inverse: s,
        children: a
      });
      t[11] = r;
      t[12] = a;
      t[13] = s;
      t[14] = l;
    } else {
      l = t[14];
    }
    return l;
  }
  var PZi;
  var OZi;
  var Njt;
  var MZi = __lazy(() => {
    _ue();
    uG();
    et();
    ho();
    PZi = __toESM(pt(), 1);
    OZi = require("url");
    Njt = __toESM(ie(), 1);
  });
  function Hn(e) {
    let t = NZi.c(5);
    let {
      children: n
    } = e;
    let r;
    let o;
    if (t[0] !== n) {
      o = Symbol.for("react.early_return_sentinel");
      e: {
        let i = oFn.Children.toArray(n).filter(yop);
        if (i.length === 0) {
          o = null;
          break e;
        }
        r = i.map(gop);
      }
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      r = t[1];
      o = t[2];
    }
    if (o !== Symbol.for("react.early_return_sentinel")) {
      return o;
    }
    let s;
    if (t[3] !== r) {
      s = fGe.jsx(fGe.Fragment, {
        children: r
      });
      t[3] = r;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function gop(e, t) {
    return fGe.jsxs(LZi.Fragment, {
      children: [t > 0 && fGe.jsx(Text, {
        dimColor: true,
        children: " \xB7 "
      }), e]
    }, oFn.isValidElement(e) ? e.key ?? t : t);
  }
  function yop(e) {
    return e !== "";
  }
  var NZi;
  var LZi;
  var oFn;
  var fGe;
  var Ai = __lazy(() => {
    et();
    NZi = __toESM(pt(), 1);
    LZi = __toESM(ot(), 1);
    oFn = __toESM(ot(), 1);
    fGe = __toESM(ie(), 1);
  });
  function _v(e) {
    let t = Poo.c(42);
    let {
      isFocused: n,
      isSelected: r,
      children: o,
      description: s,
      showScrollDown: i,
      showScrollUp: a,
      styled: l,
      disabled: c,
      declareCursor: u,
      onClick: d,
      onHoverChange: p
    } = e;
    let m = r === undefined ? false : r;
    let f = l === undefined ? true : l;
    let h = c === undefined ? false : c;
    let [g, y] = FZi.useState(false);
    let _ = !h && d !== undefined;
    let b = !h && (d !== undefined || p !== undefined);
    let S;
    if (t[0] !== p) {
      S = z => {
        y(z);
        p?.(z);
      };
      t[0] = p;
      t[1] = S;
    } else {
      S = t[1];
    }
    let E = S;
    let C;
    if (t[2] !== h || t[3] !== n || t[4] !== m || t[5] !== f) {
      C = function () {
        if (h) {
          return "inactive";
        }
        if (!f) {
          return;
        }
        if (m) {
          return "success";
        }
        if (n) {
          return "suggestion";
        }
      }();
      t[2] = h;
      t[3] = n;
      t[4] = m;
      t[5] = f;
      t[6] = C;
    } else {
      C = t[6];
    }
    let x = C;
    let A = n && !h && u !== false;
    let k;
    if (t[7] !== A) {
      k = {
        line: 0,
        column: 0,
        active: A
      };
      t[7] = A;
      t[8] = k;
    } else {
      k = t[8];
    }
    let I = SG(k);
    let O = _ ? d : undefined;
    let M;
    if (t[9] !== b || t[10] !== E) {
      M = b ? () => E(true) : undefined;
      t[9] = b;
      t[10] = E;
      t[11] = M;
    } else {
      M = t[11];
    }
    let L;
    if (t[12] !== b || t[13] !== E) {
      L = b ? () => E(false) : undefined;
      t[12] = b;
      t[13] = E;
      t[14] = L;
    } else {
      L = t[14];
    }
    let P = g && _;
    let F;
    if (t[15] !== h || t[16] !== n || t[17] !== i || t[18] !== a || t[19] !== P) {
      F = n$.jsx(gXd, {
        flexShrink: 0,
        children: n$.jsx(_op, {
          disabled: h,
          isFocused: n,
          showScrollUp: a,
          showScrollDown: i,
          hovered: P
        })
      });
      t[15] = h;
      t[16] = n;
      t[17] = i;
      t[18] = a;
      t[19] = P;
      t[20] = F;
    } else {
      F = t[20];
    }
    let H;
    if (t[21] !== o || t[22] !== h || t[23] !== f || t[24] !== x) {
      H = f ? n$.jsx(Text, {
        color: x,
        dimColor: h,
        children: o
      }) : o;
      t[21] = o;
      t[22] = h;
      t[23] = f;
      t[24] = x;
      t[25] = H;
    } else {
      H = t[25];
    }
    let U;
    if (t[26] !== h || t[27] !== m) {
      U = m && !h && n$.jsx(Text, {
        color: "success",
        children: vGd.tick
      });
      t[26] = h;
      t[27] = m;
      t[28] = U;
    } else {
      U = t[28];
    }
    let N;
    if (t[29] !== F || t[30] !== H || t[31] !== U) {
      N = n$.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [F, H, U]
      });
      t[29] = F;
      t[30] = H;
      t[31] = U;
      t[32] = N;
    } else {
      N = t[32];
    }
    let W;
    if (t[33] !== s) {
      W = s && n$.jsx(gXd, {
        paddingLeft: 2,
        children: n$.jsx(Text, {
          color: "inactive",
          children: s
        })
      });
      t[33] = s;
      t[34] = W;
    } else {
      W = t[34];
    }
    let j;
    if (t[35] !== I || t[36] !== L || t[37] !== N || t[38] !== W || t[39] !== O || t[40] !== M) {
      j = n$.jsxs(gXd, {
        ref: I,
        flexDirection: "column",
        onClick: O,
        onMouseEnter: M,
        onMouseLeave: L,
        children: [N, W]
      });
      t[35] = I;
      t[36] = L;
      t[37] = N;
      t[38] = W;
      t[39] = O;
      t[40] = M;
      t[41] = j;
    } else {
      j = t[41];
    }
    return j;
  }
  function _op(e) {
    let t = Poo.c(6);
    let {
      disabled: n,
      isFocused: r,
      showScrollUp: o,
      showScrollDown: s,
      hovered: i
    } = e;
    if (n) {
      let l;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        l = n$.jsx(Text, {
          children: " "
        });
        t[0] = l;
      } else {
        l = t[0];
      }
      return l;
    }
    if (r) {
      let l;
      if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
        l = n$.jsx(Text, {
          color: "suggestion",
          children: vGd.pointer
        });
        t[1] = l;
      } else {
        l = t[1];
      }
      return l;
    }
    if (s) {
      let l;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        l = n$.jsx(Text, {
          dimColor: true,
          children: vGd.arrowDown
        });
        t[2] = l;
      } else {
        l = t[2];
      }
      return l;
    }
    if (o) {
      let l;
      if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
        l = n$.jsx(Text, {
          dimColor: true,
          children: vGd.arrowUp
        });
        t[3] = l;
      } else {
        l = t[3];
      }
      return l;
    }
    if (i) {
      let l;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        l = n$.jsx(Text, {
          dimColor: true,
          children: vGd.pointer
        });
        t[4] = l;
      } else {
        l = t[4];
      }
      return l;
    }
    let a;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      a = n$.jsx(Text, {
        children: " "
      });
      t[5] = a;
    } else {
      a = t[5];
    }
    return a;
  }
  var Poo;
  var FZi;
  var n$;
  var Mue = __lazy(() => {
    dGe();
    et();
    Poo = __toESM(pt(), 1);
    FZi = __toESM(ot(), 1);
    n$ = __toESM(ie(), 1);
  });
  function nOe(e) {
    let t = UZi.c(9);
    let {
      isFocused: n,
      isSelected: r,
      children: o,
      description: s,
      shouldShowDownArrow: i,
      shouldShowUpArrow: a,
      declareCursor: l,
      onClick: c
    } = e;
    let u;
    if (t[0] !== o || t[1] !== l || t[2] !== s || t[3] !== n || t[4] !== r || t[5] !== c || t[6] !== i || t[7] !== a) {
      u = BZi.jsx(_v, {
        isFocused: n,
        isSelected: r,
        description: s,
        showScrollDown: i,
        showScrollUp: a,
        styled: false,
        declareCursor: l,
        onClick: c,
        children: o
      });
      t[0] = o;
      t[1] = l;
      t[2] = s;
      t[3] = n;
      t[4] = r;
      t[5] = c;
      t[6] = i;
      t[7] = a;
      t[8] = u;
    } else {
      u = t[8];
    }
    return u;
  }
  var UZi;
  var BZi;
  var sFn = __lazy(() => {
    Mue();
    UZi = __toESM(pt(), 1);
    BZi = __toESM(ie(), 1);
  });
  function bop(e, t, n, r) {
    let o = 2 + t + 2;
    return Math.max(1, e - o - n - r);
  }
  function put(e) {
    let t = $Zi.c(102);
    let {
      option: n,
      isFocused: r,
      isSelected: o,
      shouldShowDownArrow: s,
      shouldShowUpArrow: i,
      maxIndexWidth: a,
      index: l,
      inputValue: c,
      onInputChange: u,
      onSubmit: d,
      onExit: p,
      layout: m,
      children: f,
      showLabel: h,
      onOpenEditor: g,
      resetCursorOnUpdate: y,
      onImagePaste: _,
      pastedContents: b,
      onRemoveImage: S,
      imagesSelected: E,
      selectedImageIndex: C,
      onImagesSelectedChange: x,
      onSelectedImageIndexChange: A,
      extraChromeWidth: k
    } = e;
    let I = h === undefined ? false : h;
    let O = y === undefined ? false : y;
    let M = C === undefined ? 0 : C;
    let L = k === undefined ? 0 : k;
    let P;
    if (t[0] !== b) {
      P = b ? Object.values(b).filter(Sop) : [];
      t[0] = b;
      t[1] = P;
    } else {
      P = t[1];
    }
    let F = P;
    let H = I || n.showLabelWithValue === true;
    let [U, N] = hGe.useState(c.length);
    let W = hGe.useRef(false);
    let j;
    if (t[2] !== c.length || t[3] !== r || t[4] !== O) {
      j = () => {
        if (O && r) {
          if (W.current) {
            W.current = false;
          } else {
            N(c.length);
          }
        }
      };
      t[2] = c.length;
      t[3] = r;
      t[4] = O;
      t[5] = j;
    } else {
      j = t[5];
    }
    let z;
    if (t[6] !== c || t[7] !== r || t[8] !== O) {
      z = [O, r, c];
      t[6] = c;
      t[7] = r;
      t[8] = O;
      t[9] = z;
    } else {
      z = t[9];
    }
    hGe.useEffect(j, z);
    let V;
    if (t[10] !== c || t[11] !== u || t[12] !== g) {
      V = () => {
        g?.(c, u);
      };
      t[10] = c;
      t[11] = u;
      t[12] = g;
      t[13] = V;
    } else {
      V = t[13];
    }
    let K = r && !!g;
    let J;
    if (t[14] !== K) {
      J = {
        context: "Chat",
        isActive: K
      };
      t[14] = K;
      t[15] = J;
    } else {
      J = t[15];
    }
    uo("chat:externalEditor", V, J);
    let Q;
    if (t[16] !== _) {
      Q = () => {
        if (!_) {
          return;
        }
        VPe(Yg(getMainLoopModel())).then(It => {
          if (It) {
            _(It.base64, It.mediaType, undefined, It.dimensions);
          }
        });
      };
      t[16] = _;
      t[17] = Q;
    } else {
      Q = t[17];
    }
    let Z = r && !!_;
    let ne;
    if (t[18] !== Z) {
      ne = {
        context: "Chat",
        isActive: Z
      };
      t[18] = Z;
      t[19] = ne;
    } else {
      ne = t[19];
    }
    uo("chat:imagePaste", Q, ne);
    let oe;
    if (t[20] !== F || t[21] !== S) {
      oe = () => {
        if (F.length > 0 && S) {
          S(F.at(-1).id);
        }
      };
      t[20] = F;
      t[21] = S;
      t[22] = oe;
    } else {
      oe = t[22];
    }
    let ee = r && !E && c === "" && F.length > 0 && !!S;
    let re;
    if (t[23] !== ee) {
      re = {
        context: "Attachments",
        isActive: ee
      };
      t[23] = ee;
      t[24] = re;
    } else {
      re = t[24];
    }
    uo("attachments:remove", oe, re);
    let se;
    let ae;
    if (t[25] !== F.length || t[26] !== A || t[27] !== M) {
      se = () => {
        if (F.length > 1) {
          A?.((M + 1) % F.length);
        }
      };
      ae = () => {
        if (F.length > 1) {
          A?.((M - 1 + F.length) % F.length);
        }
      };
      t[25] = F.length;
      t[26] = A;
      t[27] = M;
      t[28] = se;
      t[29] = ae;
    } else {
      se = t[28];
      ae = t[29];
    }
    let de;
    if (t[30] !== F || t[31] !== x || t[32] !== S || t[33] !== A || t[34] !== M) {
      de = () => {
        let It = F[M];
        if (It && S) {
          if (S(It.id), F.length <= 1) {
            x?.(false);
          } else {
            A?.(Math.min(M, F.length - 2));
          }
        }
      };
      t[30] = F;
      t[31] = x;
      t[32] = S;
      t[33] = A;
      t[34] = M;
      t[35] = de;
    } else {
      de = t[35];
    }
    let be;
    if (t[36] !== x) {
      be = () => {
        x?.(false);
      };
      t[36] = x;
      t[37] = be;
    } else {
      be = t[37];
    }
    let fe;
    if (t[38] !== se || t[39] !== ae || t[40] !== de || t[41] !== be) {
      fe = {
        "attachments:next": se,
        "attachments:previous": ae,
        "attachments:remove": de,
        "attachments:exit": be
      };
      t[38] = se;
      t[39] = ae;
      t[40] = de;
      t[41] = be;
      t[42] = fe;
    } else {
      fe = t[42];
    }
    let me = r && !!E;
    let Te;
    if (t[43] !== me) {
      Te = {
        context: "Attachments",
        isActive: me
      };
      t[43] = me;
      t[44] = Te;
    } else {
      Te = t[44];
    }
    jo(fe, Te);
    let ue;
    let ce;
    if (t[45] !== E || t[46] !== r || t[47] !== x) {
      ue = () => {
        if (!r && E) {
          x?.(false);
        }
      };
      ce = [r, E, x];
      t[45] = E;
      t[46] = r;
      t[47] = x;
      t[48] = ue;
      t[49] = ce;
    } else {
      ue = t[48];
      ce = t[49];
    }
    hGe.useEffect(ue, ce);
    let le = m === "expanded" ? a + 3 : a + 4;
    let {
      columns: pe
    } = h_(Sr());
    let ve = H && typeof n.label === "string" ? an(n.label) + an(n.labelValueSeparator ?? ", ") : 0;
    let _e;
    if (t[50] !== pe || t[51] !== L || t[52] !== ve || t[53] !== a) {
      _e = bop(pe, a, ve, L);
      t[50] = pe;
      t[51] = L;
      t[52] = ve;
      t[53] = a;
      t[54] = _e;
    } else {
      _e = t[54];
    }
    let xe = _e;
    let ke = m === "compact" ? 0 : undefined;
    let Ie = `${l}.`;
    let Ue;
    if (t[55] !== a || t[56] !== Ie) {
      Ue = Ie.padEnd(a + 2);
      t[55] = a;
      t[56] = Ie;
      t[57] = Ue;
    } else {
      Ue = t[57];
    }
    let Ge;
    if (t[58] !== Ue) {
      Ge = pS.jsx(gXd, {
        flexShrink: 0,
        children: pS.jsx(Text, {
          dimColor: true,
          children: Ue
        })
      });
      t[58] = Ue;
      t[59] = Ge;
    } else {
      Ge = t[59];
    }
    let Be;
    if (t[60] !== U || t[61] !== E || t[62] !== c || t[63] !== r || t[64] !== p || t[65] !== _ || t[66] !== u || t[67] !== d || t[68] !== n || t[69] !== H || t[70] !== xe) {
      Be = H ? r ? pS.jsxs(pS.Fragment, {
        children: [pS.jsxs(Text, {
          color: "suggestion",
          children: [n.label, n.labelValueSeparator ?? ", "]
        }), pS.jsx(Dl, {
          value: c,
          onChange: It => {
            W.current = true;
            u(It);
            n.onChange(It);
          },
          onSubmit: d,
          onExit: p,
          placeholder: n.placeholder,
          focus: !E,
          showCursor: true,
          multiline: true,
          cursorOffset: U,
          onChangeCursorOffset: N,
          columns: xe,
          onImagePaste: _,
          onPaste: It => {
            W.current = true;
            let Rt = c.slice(0, U);
            let wt = c.slice(U);
            let vt = Rt + It + wt;
            u(vt);
            n.onChange(vt);
            N(Rt.length + It.length);
          }
        })]
      }) : pS.jsxs(Text, {
        children: [n.label, c ? n.labelValueSeparator ?? ", " : null, c || null]
      }) : r ? pS.jsx(Dl, {
        value: c,
        onChange: It => {
          W.current = true;
          u(It);
          n.onChange(It);
        },
        onSubmit: d,
        onExit: p,
        placeholder: n.placeholder || (typeof n.label === "string" ? n.label : undefined),
        focus: !E,
        showCursor: true,
        multiline: true,
        cursorOffset: U,
        onChangeCursorOffset: N,
        columns: xe,
        onImagePaste: _,
        onPaste: It => {
          W.current = true;
          let Rt = c.slice(0, U);
          let wt = c.slice(U);
          let vt = Rt + It + wt;
          u(vt);
          n.onChange(vt);
          N(Rt.length + It.length);
        }
      }) : pS.jsx(Text, {
        color: c ? undefined : "inactive",
        children: c || n.placeholder || n.label
      });
      t[60] = U;
      t[61] = E;
      t[62] = c;
      t[63] = r;
      t[64] = p;
      t[65] = _;
      t[66] = u;
      t[67] = d;
      t[68] = n;
      t[69] = H;
      t[70] = xe;
      t[71] = Be;
    } else {
      Be = t[71];
    }
    let We;
    if (t[72] !== f || t[73] !== ke || t[74] !== Ge || t[75] !== Be) {
      We = pS.jsxs(gXd, {
        flexDirection: "row",
        flexShrink: ke,
        children: [Ge, f, Be]
      });
      t[72] = f;
      t[73] = ke;
      t[74] = Ge;
      t[75] = Be;
      t[76] = We;
    } else {
      We = t[76];
    }
    let Ze;
    if (t[77] !== r || t[78] !== o || t[79] !== s || t[80] !== i || t[81] !== We) {
      Ze = pS.jsx(nOe, {
        isFocused: r,
        isSelected: o,
        shouldShowDownArrow: s,
        shouldShowUpArrow: i,
        declareCursor: false,
        children: We
      });
      t[77] = r;
      t[78] = o;
      t[79] = s;
      t[80] = i;
      t[81] = We;
      t[82] = Ze;
    } else {
      Ze = t[82];
    }
    let Tt;
    if (t[83] !== le || t[84] !== r || t[85] !== o || t[86] !== n.description || t[87] !== n.dimDescription) {
      Tt = n.description && pS.jsx(gXd, {
        paddingLeft: le,
        children: pS.jsx(Text, {
          dimColor: n.dimDescription !== false,
          color: o ? "success" : r ? "suggestion" : undefined,
          children: n.description
        })
      });
      t[83] = le;
      t[84] = r;
      t[85] = o;
      t[86] = n.description;
      t[87] = n.dimDescription;
      t[88] = Tt;
    } else {
      Tt = t[88];
    }
    let kt;
    if (t[89] !== le || t[90] !== F || t[91] !== E || t[92] !== r || t[93] !== M) {
      kt = F.length > 0 && pS.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        paddingLeft: le,
        children: [F.map((It, Rt) => pS.jsx(DZi, {
          imageId: It.id,
          isSelected: !!E && Rt === M
        }, It.id)), pS.jsx(gXd, {
          flexGrow: 1,
          justifyContent: "flex-start",
          flexDirection: "row",
          children: pS.jsx(Text, {
            dimColor: true,
            children: E ? pS.jsxs(Hn, {
              children: [F.length > 1 && pS.jsxs(pS.Fragment, {
                children: [pS.jsx(Wr, {
                  action: "attachments:next",
                  context: "Attachments",
                  fallback: "\u2192",
                  description: "next"
                }), pS.jsx(Wr, {
                  action: "attachments:previous",
                  context: "Attachments",
                  fallback: "\u2190",
                  description: "prev"
                })]
              }), pS.jsx(Wr, {
                action: "attachments:remove",
                context: "Attachments",
                fallback: "backspace",
                description: "remove"
              }), pS.jsx(Wr, {
                action: "attachments:exit",
                context: "Attachments",
                fallback: "esc",
                description: "cancel"
              })]
            }) : r ? pS.jsx(xt, {
              chord: "down",
              action: "select",
              parens: true
            }) : null
          })
        })]
      });
      t[89] = le;
      t[90] = F;
      t[91] = E;
      t[92] = r;
      t[93] = M;
      t[94] = kt;
    } else {
      kt = t[94];
    }
    let Ye;
    if (t[95] !== m) {
      Ye = m === "expanded" && pS.jsx(Text, {
        children: " "
      });
      t[95] = m;
      t[96] = Ye;
    } else {
      Ye = t[96];
    }
    let ht;
    if (t[97] !== Ze || t[98] !== Tt || t[99] !== kt || t[100] !== Ye) {
      ht = pS.jsxs(gXd, {
        flexDirection: "column",
        flexShrink: 0,
        children: [Ze, Tt, kt, Ye]
      });
      t[97] = Ze;
      t[98] = Tt;
      t[99] = kt;
      t[100] = Ye;
      t[101] = ht;
    } else {
      ht = t[101];
    }
    return ht;
  }
  function Sop(e) {
    return e.type === "image";
  }
  var $Zi;
  var hGe;
  var pS;
  var Ooo = __lazy(() => {
    rE();
    ki();
    bc();
    et();
    Bs();
    lGe();
    JF();
    Eo();
    MZi();
    Sd();
    Ai();
    bs();
    q_();
    sFn();
    $Zi = __toESM(pt(), 1);
    hGe = __toESM(ot(), 1);
    pS = __toESM(ie(), 1);
  });
  var Doo;
  var jZi = ({
    isDisabled: e = false,
    disableSelection: t = false,
    state: n,
    options: r,
    isMultiSelect: o = false,
    onUpFromFirstItem: s,
    onDownFromLastItem: i,
    onInputModeToggle: a,
    inputValues: l,
    imagesSelected: c = false,
    onEnterImageSelection: u,
    onExitImageSelection: d,
    hasInkFocus: p = true
  }) => {
    let {
      focusDirection: m
    } = useFocus();
    Jg("select", !!n.onCancel);
    let f = Doo.useMemo(() => r.find(_ => _.value === n.focusedValue)?.type === "input", [r, n.focusedValue]);
    let h = Doo.useMemo(() => {
      let y = {};
      if (!f) {
        y["select:next"] = () => {
          let _ = r.at(-1);
          if (_ && n.focusedValue === _.value) {
            if (i) {
              i();
              return;
            }
          }
          n.focusNextOption();
        };
        y["select:previous"] = () => {
          let _ = r[0];
          if (_ && n.focusedValue === _.value && n.visibleFromIndex === 0) {
            if (s) {
              s();
              return;
            }
          }
          n.focusPreviousOption();
        };
        y["select:accept"] = () => {
          if (t === true) {
            return;
          }
          if (n.focusedValue === undefined) {
            return;
          }
          if (r.find(b => b.value === n.focusedValue)?.disabled === true) {
            return;
          }
          n.selectFocusedOption?.();
          n.onChange?.(n.focusedValue);
        };
      }
      if (n.onCancel) {
        y["select:cancel"] = () => {
          n.onCancel();
        };
      }
      return y;
    }, [r, n, i, s, f, t, m]);
    jo(h, {
      context: "Select",
      isActive: !e && true
    });
    return {
      handleKeyDown: y => {
        if (e) {
          return;
        }
        let _ = N7(y.key);
        let b = r.find(E => E.value === n.focusedValue);
        let S = b?.type === "input";
        if (y.key === "tab") {
          if (y.preventDefault(), a && n.focusedValue !== undefined) {
            a(n.focusedValue);
          }
          return;
        }
        if (S) {
          if (c) {
            if (y.key === "up") {
              y.preventDefault();
              d?.();
            }
            return;
          }
          if (y.key === "down" && u?.()) {
            y.stopImmediatePropagation();
            return;
          }
          if (y.key === "down" || y.ctrl && y.key === "n") {
            if (i) {
              let E = r.at(-1);
              if (E && n.focusedValue === E.value) {
                i();
                y.stopImmediatePropagation();
                return;
              }
            }
            n.focusNextOption();
            y.stopImmediatePropagation();
            return;
          }
          if (y.key === "up" || y.ctrl && y.key === "p") {
            if (s && n.visibleFromIndex === 0) {
              let E = r[0];
              if (E && n.focusedValue === E.value) {
                s();
                y.stopImmediatePropagation();
                return;
              }
            }
            n.focusPreviousOption();
            y.stopImmediatePropagation();
            return;
          }
          return;
        }
        if (y.key === "pagedown") {
          y.preventDefault();
          n.focusNextPage();
          return;
        }
        if (y.key === "pageup") {
          y.preventDefault();
          n.focusPreviousPage();
          return;
        }
        if (t !== true) {
          if (o && Bae(y.key) === " " && n.focusedValue !== undefined) {
            if (b?.disabled !== true) {
              y.preventDefault();
              n.selectFocusedOption?.();
              n.onChange?.(n.focusedValue);
            }
            return;
          }
          if (t !== "numeric" && /^[0-9]$/.test(_)) {
            y.preventDefault();
            let E = parseInt(_) - 1;
            if (E >= 0 && E < n.options.length) {
              let C = n.options[E];
              if (C.disabled === true) {
                return;
              }
              if (C.type === "input") {
                if ((l?.get(C.value) ?? "").trim()) {
                  n.onChange?.(C.value);
                  return;
                }
                if (C.allowEmptySubmitToCancel) {
                  n.onChange?.(C.value);
                  return;
                }
                n.focusOption(C.value);
                return;
              }
              n.onChange?.(C.value);
              return;
            }
          }
        }
      }
    };
  };
  var qZi = __lazy(() => {
    px();
    y1n();
    Bs();
    Zn();
    Doo = __toESM(ot(), 1);
  });
  var iFn;
  var WZi = __lazy(() => {
    iFn = class iFn extends Map {
      first;
      last;
      constructor(e) {
        let t = [];
        let n;
        let r;
        let o;
        let s = 0;
        for (let i of e) {
          let a = {
            label: i.label,
            value: i.value,
            description: i.description,
            previous: o,
            next: undefined,
            index: s
          };
          if (o) {
            o.next = a;
          }
          n ||= a;
          r = a;
          t.push([i.value, a]);
          s++;
          o = a;
        }
        super(t);
        this.first = n;
        this.last = r;
      }
    };
  });
  function aFn({
    visibleOptionCount: e = 5,
    options: t,
    initialFocusValue: n,
    onFocus: r,
    focusValue: o
  }) {
    let [s, i] = l0.useReducer(Top, {
      visibleOptionCount: e,
      options: t,
      initialFocusValue: o || n
    }, GZi);
    let a = l0.useRef(r);
    l0.useEffect(() => {
      a.current = r;
    });
    let [l, c] = l0.useState(t);
    let [u, d] = l0.useState(e);
    let p = t !== l && !VZi.isDeepStrictEqual(t, l);
    let m = e !== u;
    if (p || m) {
      if (i({
        type: "reset",
        state: GZi({
          visibleOptionCount: e,
          options: t,
          initialFocusValue: p ? o ?? s.focusedValue ?? n : s.focusedValue ?? o ?? n,
          currentViewport: {
            visibleFromIndex: s.visibleFromIndex,
            visibleToIndex: s.visibleToIndex
          }
        })
      }), p) {
        c(t);
      }
      if (m) {
        d(e);
      }
    }
    let f = l0.useCallback(() => {
      i({
        type: "focus-next-option"
      });
    }, []);
    let h = l0.useCallback(() => {
      i({
        type: "focus-previous-option"
      });
    }, []);
    let g = l0.useCallback(() => {
      i({
        type: "focus-next-page"
      });
    }, []);
    let y = l0.useCallback(() => {
      i({
        type: "focus-previous-page"
      });
    }, []);
    let _ = l0.useCallback(x => {
      if (x !== undefined) {
        i({
          type: "set-focus",
          value: x
        });
      }
    }, []);
    let b = l0.useMemo(() => t.map((x, A) => ({
      ...x,
      index: A
    })).slice(s.visibleFromIndex, s.visibleToIndex), [t, s.visibleFromIndex, s.visibleToIndex]);
    let S = l0.useMemo(() => {
      if (s.focusedValue === undefined) {
        return;
      }
      if (t.some(A => A.value === s.focusedValue)) {
        return s.focusedValue;
      }
      return t[0]?.value;
    }, [s.focusedValue, t]);
    let E = l0.useMemo(() => t.find(A => A.value === S)?.type === "input", [S, t]);
    l0.useEffect(() => {
      if (S !== undefined) {
        a.current?.(S);
      }
    }, [S]);
    l0.useEffect(() => {
      if (o !== undefined) {
        i({
          type: "set-focus",
          value: o
        });
      }
    }, [o]);
    let C = l0.useMemo(() => {
      if (S === undefined) {
        return 0;
      }
      let x = t.findIndex(A => A.value === S);
      return x >= 0 ? x + 1 : 0;
    }, [S, t]);
    return {
      focusedValue: S,
      focusedIndex: C,
      visibleFromIndex: s.visibleFromIndex,
      visibleToIndex: s.visibleToIndex,
      visibleOptions: b,
      isInInput: E ?? false,
      focusNextOption: f,
      focusPreviousOption: h,
      focusNextPage: g,
      focusPreviousPage: y,
      focusOption: _,
      options: t
    };
  }
  var l0;
  var VZi;
  var Top = (e, t) => {
    switch (t.type) {
      case "focus-next-option":
        {
          if (e.focusedValue === undefined) {
            return e;
          }
          let n = e.optionMap.get(e.focusedValue);
          if (!n) {
            return e;
          }
          let r = n.next || e.optionMap.first;
          if (!r) {
            return e;
          }
          if (!n.next && r === e.optionMap.first) {
            return {
              ...e,
              focusedValue: r.value,
              visibleFromIndex: 0,
              visibleToIndex: e.visibleOptionCount
            };
          }
          if (!(r.index >= e.visibleToIndex)) {
            return {
              ...e,
              focusedValue: r.value
            };
          }
          let s = Math.min(e.optionMap.size, e.visibleToIndex + 1);
          let i = s - e.visibleOptionCount;
          return {
            ...e,
            focusedValue: r.value,
            visibleFromIndex: i,
            visibleToIndex: s
          };
        }
      case "focus-previous-option":
        {
          if (e.focusedValue === undefined) {
            return e;
          }
          let n = e.optionMap.get(e.focusedValue);
          if (!n) {
            return e;
          }
          let r = n.previous || e.optionMap.last;
          if (!r) {
            return e;
          }
          if (!n.previous && r === e.optionMap.last) {
            let a = e.optionMap.size;
            let l = Math.max(0, a - e.visibleOptionCount);
            return {
              ...e,
              focusedValue: r.value,
              visibleFromIndex: l,
              visibleToIndex: a
            };
          }
          if (!(r.index <= e.visibleFromIndex)) {
            return {
              ...e,
              focusedValue: r.value
            };
          }
          let s = Math.max(0, e.visibleFromIndex - 1);
          let i = s + e.visibleOptionCount;
          return {
            ...e,
            focusedValue: r.value,
            visibleFromIndex: s,
            visibleToIndex: i
          };
        }
      case "focus-next-page":
        {
          if (e.focusedValue === undefined) {
            return e;
          }
          let n = e.optionMap.get(e.focusedValue);
          if (!n) {
            return e;
          }
          let r = Math.min(e.optionMap.size - 1, n.index + e.visibleOptionCount);
          let o = e.optionMap.first;
          while (o && o.index < r) {
            if (o.next) {
              o = o.next;
            } else {
              break;
            }
          }
          if (!o) {
            return e;
          }
          let s = Math.min(e.optionMap.size, o.index + 1);
          let i = Math.max(0, s - e.visibleOptionCount);
          return {
            ...e,
            focusedValue: o.value,
            visibleFromIndex: i,
            visibleToIndex: s
          };
        }
      case "focus-previous-page":
        {
          if (e.focusedValue === undefined) {
            return e;
          }
          let n = e.optionMap.get(e.focusedValue);
          if (!n) {
            return e;
          }
          let r = Math.max(0, n.index - e.visibleOptionCount);
          let o = e.optionMap.first;
          while (o && o.index < r) {
            if (o.next) {
              o = o.next;
            } else {
              break;
            }
          }
          if (!o) {
            return e;
          }
          let s = Math.max(0, o.index);
          let i = Math.min(e.optionMap.size, s + e.visibleOptionCount);
          return {
            ...e,
            focusedValue: o.value,
            visibleFromIndex: s,
            visibleToIndex: i
          };
        }
      case "reset":
        return t.state;
      case "set-focus":
        {
          if (e.focusedValue === t.value) {
            return e;
          }
          let n = e.optionMap.get(t.value);
          if (!n) {
            return e;
          }
          if (n.index >= e.visibleFromIndex && n.index < e.visibleToIndex) {
            return {
              ...e,
              focusedValue: t.value
            };
          }
          let r;
          let o;
          if (n.index < e.visibleFromIndex) {
            r = n.index;
            o = Math.min(e.optionMap.size, r + e.visibleOptionCount);
          } else {
            o = Math.min(e.optionMap.size, n.index + 1);
            r = Math.max(0, o - e.visibleOptionCount);
          }
          return {
            ...e,
            focusedValue: t.value,
            visibleFromIndex: r,
            visibleToIndex: o
          };
        }
    }
  };
  var GZi = ({
    visibleOptionCount: e,
    options: t,
    initialFocusValue: n,
    currentViewport: r
  }) => {
    let o = typeof e === "number" ? Math.min(e, t.length) : t.length;
    let s = new iFn(t);
    let i = n !== undefined && s.get(n);
    let a = i ? n : s.first?.value;
    let l = 0;
    let c = o;
    if (i) {
      let u = i.index;
      if (r) {
        if (u >= r.visibleFromIndex && u < r.visibleToIndex) {
          if (l = r.visibleFromIndex, c = Math.min(s.size, l + o), u >= c) {
            c = Math.min(s.size, u + 1);
            l = Math.max(0, c - o);
          }
          if (c - l < o) {
            l = Math.max(0, c - o);
          }
        } else if (u < r.visibleFromIndex) {
          l = u;
          c = Math.min(s.size, l + o);
        } else {
          c = Math.min(s.size, u + 1);
          l = Math.max(0, c - o);
        }
      } else if (u >= o) {
        c = Math.min(s.size, u + 1);
        l = Math.max(0, c - o);
      }
      l = Math.max(0, Math.min(l, s.size - 1));
      c = Math.min(s.size, Math.max(o, c));
    }
    return {
      optionMap: s,
      visibleOptionCount: o,
      focusedValue: a,
      visibleFromIndex: l,
      visibleToIndex: c
    };
  };
  var Moo = __lazy(() => {
    WZi();
    l0 = __toESM(ot(), 1);
    VZi = require("util");
  });
  function zZi({
    visibleOptionCount: e = 5,
    options: t,
    defaultValue: n,
    onChange: r,
    onCancel: o,
    onFocus: s,
    focusValue: i
  }) {
    let [a, l] = lFn.useState(n);
    let c = aFn({
      visibleOptionCount: e,
      options: t,
      initialFocusValue: undefined,
      onFocus: s,
      focusValue: i
    });
    let u = lFn.useCallback(() => {
      l(c.focusedValue);
    }, [c.focusedValue]);
    return {
      ...c,
      value: a,
      selectFocusedOption: u,
      onChange: r,
      onCancel: o
    };
  }
  var lFn;
  var KZi = __lazy(() => {
    Moo();
    lFn = __toESM(ot(), 1);
  });
  function xr(e) {
    let t = cFn.c(10);
    if (useIsScreenReaderEnabled()) {
      let o;
      if (t[0] !== e.defaultValue || t[1] !== e.disableSelection || t[2] !== e.isDisabled || t[3] !== e.onCancel || t[4] !== e.onChange || t[5] !== e.onFocus || t[6] !== e.options) {
        o = oc.jsx(xZi, {
          options: e.options,
          onChange: e.onChange,
          onFocus: e.onFocus,
          onCancel: e.onCancel,
          isDisabled: e.isDisabled,
          disableSelection: e.disableSelection,
          defaultValue: e.defaultValue
        });
        t[0] = e.defaultValue;
        t[1] = e.disableSelection;
        t[2] = e.isDisabled;
        t[3] = e.onCancel;
        t[4] = e.onChange;
        t[5] = e.onFocus;
        t[6] = e.options;
        t[7] = o;
      } else {
        o = t[7];
      }
      return o;
    }
    let r;
    if (t[8] !== e) {
      r = oc.jsx(Eop, {
        ...e
      });
      t[8] = e;
      t[9] = r;
    } else {
      r = t[9];
    }
    return r;
  }
  function Eop(e) {
    let t = cFn.c(86);
    let {
      isDisabled: n,
      hideIndexes: r,
      visibleOptionCount: o,
      highlightText: s,
      options: i,
      defaultValue: a,
      onCancel: l,
      onChange: c,
      onFocus: u,
      defaultFocusValue: d,
      layout: p,
      disableSelection: m,
      inlineDescriptions: f,
      onUpFromFirstItem: h,
      onDownFromLastItem: g,
      onInputModeToggle: y,
      onOpenEditor: _,
      onImagePaste: b,
      pastedContents: S,
      onRemoveImage: E
    } = e;
    let C = n === undefined ? false : n;
    let x = r === undefined ? false : r;
    let A = o === undefined ? 5 : o;
    let k = p === undefined ? "compact" : p;
    let I = m === undefined ? false : m;
    let O = f === undefined ? false : f;
    let [M, L] = Nre.useState(false);
    let [P, F] = Nre.useState(0);
    let H;
    if (t[0] !== i) {
      H = () => {
        let _e = new Map();
        i.forEach(xe => {
          if (xe.type === "input" && xe.initialValue) {
            _e.set(xe.value, xe.initialValue);
          }
        });
        return _e;
      };
      t[0] = i;
      t[1] = H;
    } else {
      H = t[1];
    }
    let [U, N] = Nre.useState(H);
    let W;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      W = new Map();
      t[2] = W;
    } else {
      W = t[2];
    }
    let j = Nre.useRef(W);
    let z;
    let V;
    if (t[3] !== U || t[4] !== i) {
      V = () => {
        for (let _e of i) {
          if (_e.type === "input" && _e.initialValue !== undefined) {
            let xe = j.current.get(_e.value) ?? "";
            let ke = U.get(_e.value) ?? "";
            let Ie = _e.initialValue;
            if (Ie !== xe && ke === xe) {
              N(Ue => {
                let Ge = new Map(Ue);
                Ge.set(_e.value, Ie);
                return Ge;
              });
            }
            j.current.set(_e.value, Ie);
          }
        }
      };
      z = [i, U];
      t[3] = U;
      t[4] = i;
      t[5] = z;
      t[6] = V;
    } else {
      z = t[5];
      V = t[6];
    }
    Nre.useEffect(V, z);
    let K = k === "compact" && !O && !i.some(Oop) && i.some(Pop);
    let {
      columns: J
    } = h_(Sr());
    let Q = Noo(A, K ? "compact-vertical" : k);
    let Z;
    if (t[7] !== d || t[8] !== a || t[9] !== l || t[10] !== c || t[11] !== u || t[12] !== i || t[13] !== Q) {
      Z = {
        visibleOptionCount: Q,
        options: i,
        defaultValue: a,
        onChange: c,
        onCancel: l,
        onFocus: u,
        focusValue: d
      };
      t[7] = d;
      t[8] = a;
      t[9] = l;
      t[10] = c;
      t[11] = u;
      t[12] = i;
      t[13] = Q;
      t[14] = Z;
    } else {
      Z = t[14];
    }
    let ne = zZi(Z);
    let [oe, ee] = Nre.useState(true);
    let re;
    if (t[15] !== I || t[16] !== C || t[17] !== ne) {
      re = _e => C || I === true || _e.disabled === true ? undefined : () => ne.onChange?.(_e.value);
      t[15] = I;
      t[16] = C;
      t[17] = ne;
      t[18] = re;
    } else {
      re = t[18];
    }
    let se = re;
    let ae = I || (x ? "numeric" : false);
    let de;
    if (t[19] !== S) {
      de = () => {
        if (S && Object.values(S).some(Iop)) {
          let _e = Bn(Object.values(S), Aop);
          L(true);
          F(_e - 1);
          return true;
        }
        return false;
      };
      t[19] = S;
      t[20] = de;
    } else {
      de = t[20];
    }
    let be;
    if (t[21] === Symbol.for("react.memo_cache_sentinel")) {
      be = () => {
        L(false);
      };
      t[21] = be;
    } else {
      be = t[21];
    }
    let fe;
    if (t[22] !== oe || t[23] !== M || t[24] !== U || t[25] !== C || t[26] !== g || t[27] !== y || t[28] !== h || t[29] !== i || t[30] !== ne || t[31] !== ae || t[32] !== de) {
      fe = {
        isDisabled: C,
        hasInkFocus: oe,
        disableSelection: ae,
        state: ne,
        options: i,
        isMultiSelect: false,
        onUpFromFirstItem: h,
        onDownFromLastItem: g,
        onInputModeToggle: y,
        inputValues: U,
        imagesSelected: M,
        onEnterImageSelection: de,
        onExitImageSelection: be
      };
      t[22] = oe;
      t[23] = M;
      t[24] = U;
      t[25] = C;
      t[26] = g;
      t[27] = y;
      t[28] = h;
      t[29] = i;
      t[30] = ne;
      t[31] = ae;
      t[32] = de;
      t[33] = fe;
    } else {
      fe = t[33];
    }
    let {
      handleKeyDown: me
    } = jZi(fe);
    let Te = Nre.useRef(null);
    MI(Te, !C);
    let ue;
    let ce;
    let le;
    let pe;
    if (t[34] !== J || t[35] !== se || t[36] !== me || t[37] !== x || t[38] !== s || t[39] !== M || t[40] !== O || t[41] !== U || t[42] !== C || t[43] !== k || t[44] !== l || t[45] !== c || t[46] !== b || t[47] !== _ || t[48] !== E || t[49] !== i || t[50] !== S || t[51] !== P || t[52] !== ne.focusedValue || t[53] !== ne.options || t[54] !== ne.value || t[55] !== ne.visibleFromIndex || t[56] !== ne.visibleOptions || t[57] !== ne.visibleToIndex) {
      pe = Symbol.for("react.early_return_sentinel");
      e: {
        let _e = {
          container: () => ({
            flexDirection: "column",
            ref: Te,
            ...(C ? {} : {
              tabIndex: 0,
              onKeyDown: me,
              onFocus: () => ee(true),
              onBlur: () => ee(false)
            })
          }),
          highlightedText: kop
        };
        if (k === "expanded") {
          let Ge;
          if (t[62] !== ne.options.length) {
            Ge = ne.options.length.toString();
            t[62] = ne.options.length;
            t[63] = Ge;
          } else {
            Ge = t[63];
          }
          let Be = Ge.length;
          pe = oc.jsx(gXd, {
            ..._e.container(),
            children: ne.visibleOptions.map((We, Ze) => {
              let Tt = We.index === ne.visibleFromIndex;
              let kt = We.index === ne.visibleToIndex - 1;
              let Ye = ne.visibleToIndex < i.length;
              let ht = ne.visibleFromIndex > 0;
              let It = ne.visibleFromIndex + Ze + 1;
              let Rt = !C && ne.focusedValue === We.value;
              let wt = ne.value === We.value;
              if (We.type === "input") {
                let Ft = U.vZc(We.value) ? U.get(We.value) : We.initialValue || "";
                return oc.jsx(put, {
                  option: We,
                  isFocused: Rt,
                  isSelected: wt,
                  shouldShowDownArrow: Ye && kt,
                  shouldShowUpArrow: ht && Tt,
                  maxIndexWidth: Be,
                  index: It,
                  inputValue: Ft,
                  onInputChange: on => {
                    N(rn => {
                      let Sn = new Map(rn);
                      Sn.set(We.value, on);
                      return Sn;
                    });
                  },
                  onSubmit: on => {
                    let rn = S && Object.values(S).some(xop);
                    if (on.trim() || rn || We.allowEmptySubmitToCancel) {
                      c?.(We.value);
                    } else {
                      l?.();
                    }
                  },
                  onExit: l,
                  layout: "expanded",
                  showLabel: O,
                  onOpenEditor: _,
                  resetCursorOnUpdate: We.resetCursorOnUpdate,
                  onImagePaste: b,
                  pastedContents: S,
                  onRemoveImage: E,
                  imagesSelected: M,
                  selectedImageIndex: P,
                  onImagesSelectedChange: L,
                  onSelectedImageIndexChange: F
                }, String(We.value));
              }
              let vt = We.label;
              if (typeof We.label === "string" && s && We.label.includes(s)) {
                let Ft = We.label;
                let on = Ft.indexOf(s);
                vt = oc.jsxs(oc.Fragment, {
                  children: [Ft.slice(0, on), oc.jsx(Text, {
                    ..._e.highlightedText(),
                    children: s
                  }), Ft.slice(on + s.length)]
                });
              }
              let yt = We.disabled === true;
              let gt = yt ? undefined : wt ? "success" : Rt ? "suggestion" : undefined;
              return oc.jsxs(gXd, {
                flexDirection: "column",
                flexShrink: 0,
                children: [oc.jsx(nOe, {
                  isFocused: Rt,
                  isSelected: wt,
                  shouldShowDownArrow: Ye && kt,
                  shouldShowUpArrow: ht && Tt,
                  onClick: se(We),
                  children: oc.jsx(Text, {
                    dimColor: yt,
                    color: gt,
                    children: vt
                  })
                }), We.description && oc.jsx(gXd, {
                  paddingLeft: 2,
                  children: oc.jsx(Text, {
                    dimColor: yt || We.dimDescription !== false,
                    color: gt,
                    children: oc.jsx(Ansi, {
                      children: We.description
                    })
                  })
                }), oc.jsx(Text, {
                  children: " "
                })]
              }, String(We.value));
            })
          });
          break e;
        }
        if (k === "compact-vertical") {
          let Ge;
          if (t[64] !== x || t[65] !== ne.options) {
            Ge = x ? 0 : ne.options.length.toString().length;
            t[64] = x;
            t[65] = ne.options;
            t[66] = Ge;
          } else {
            Ge = t[66];
          }
          let Be = Ge;
          pe = oc.jsx(gXd, {
            ..._e.container(),
            children: ne.visibleOptions.map((We, Ze) => {
              let Tt = We.index === ne.visibleFromIndex;
              let kt = We.index === ne.visibleToIndex - 1;
              let Ye = ne.visibleToIndex < i.length;
              let ht = ne.visibleFromIndex > 0;
              let It = ne.visibleFromIndex + Ze + 1;
              let Rt = !C && ne.focusedValue === We.value;
              let wt = ne.value === We.value;
              if (We.type === "input") {
                let gt = U.vZc(We.value) ? U.get(We.value) : We.initialValue || "";
                return oc.jsx(put, {
                  option: We,
                  isFocused: Rt,
                  isSelected: wt,
                  shouldShowDownArrow: Ye && kt,
                  shouldShowUpArrow: ht && Tt,
                  maxIndexWidth: Be,
                  index: It,
                  inputValue: gt,
                  onInputChange: Ft => {
                    N(on => {
                      let rn = new Map(on);
                      rn.set(We.value, Ft);
                      return rn;
                    });
                  },
                  onSubmit: Ft => {
                    let on = S && Object.values(S).some(Rop);
                    if (Ft.trim() || on || We.allowEmptySubmitToCancel) {
                      c?.(We.value);
                    } else {
                      l?.();
                    }
                  },
                  onExit: l,
                  layout: "compact",
                  showLabel: O,
                  onOpenEditor: _,
                  resetCursorOnUpdate: We.resetCursorOnUpdate,
                  onImagePaste: b,
                  pastedContents: S,
                  onRemoveImage: E,
                  imagesSelected: M,
                  selectedImageIndex: P,
                  onImagesSelectedChange: L,
                  onSelectedImageIndexChange: F
                }, String(We.value));
              }
              let vt = We.label;
              if (typeof We.label === "string" && s && We.label.includes(s)) {
                let gt = We.label;
                let Ft = gt.indexOf(s);
                vt = oc.jsxs(oc.Fragment, {
                  children: [gt.slice(0, Ft), oc.jsx(Text, {
                    ..._e.highlightedText(),
                    children: s
                  }), gt.slice(Ft + s.length)]
                });
              }
              let yt = We.disabled === true;
              return oc.jsxs(gXd, {
                flexDirection: "column",
                flexShrink: 0,
                children: [oc.jsx(nOe, {
                  isFocused: Rt,
                  isSelected: wt,
                  shouldShowDownArrow: Ye && kt,
                  shouldShowUpArrow: ht && Tt,
                  onClick: se(We),
                  children: oc.jsxs(oc.Fragment, {
                    children: [!x && oc.jsx(Text, {
                      dimColor: true,
                      children: `${It}.`.padEnd(Be + 1)
                    }), oc.jsx(Text, {
                      dimColor: yt,
                      color: yt ? undefined : wt ? "success" : Rt ? "suggestion" : undefined,
                      children: vt
                    })]
                  })
                }), We.description && oc.jsx(gXd, {
                  paddingLeft: x ? 4 : Be + 4,
                  children: oc.jsx(Text, {
                    dimColor: yt || We.dimDescription !== false,
                    color: yt ? undefined : wt ? "success" : Rt ? "suggestion" : undefined,
                    children: oc.jsx(Ansi, {
                      children: We.description
                    })
                  })
                })]
              }, String(We.value));
            })
          });
          break e;
        }
        let xe;
        if (t[67] !== x || t[68] !== ne.options) {
          xe = x ? 0 : ne.options.length.toString().length;
          t[67] = x;
          t[68] = ne.options;
          t[69] = xe;
        } else {
          xe = t[69];
        }
        let ke = xe;
        let Ie = i.some(Cop);
        if (!O && !Ie && i.some(wop)) {
          let Ge = x ? 0 : ke + 2;
          let Be;
          if (t[70] !== Ge || t[71] !== i || t[72] !== ne.value) {
            let kt;
            if (t[74] !== Ge || t[75] !== ne.value) {
              kt = Ye => {
                if (Ye.type === "input") {
                  return 0;
                }
                let ht = ne.value === Ye.value ? 2 : 0;
                return 2 + Ge + an(e$(Ye.label)) + ht;
              };
              t[74] = Ge;
              t[75] = ne.value;
              t[76] = kt;
            } else {
              kt = t[76];
            }
            Be = Math.max(...i.map(kt));
            t[70] = Ge;
            t[71] = i;
            t[72] = ne.value;
            t[73] = Be;
          } else {
            Be = t[73];
          }
          let We = Math.min(Be, Math.floor(J * 0.6));
          let Ze = ne.visibleOptions.map((kt, Ye) => {
            let ht = kt.index === ne.visibleFromIndex;
            let It = kt.index === ne.visibleToIndex - 1;
            let Rt = ne.visibleToIndex < i.length;
            let wt = ne.visibleFromIndex > 0;
            let vt = ne.visibleFromIndex + Ye + 1;
            let yt = !C && ne.focusedValue === kt.value;
            let gt = ne.value === kt.value;
            let Ft = kt.disabled === true;
            let on = gt ? 2 : 0;
            let rn = e$(kt.label);
            let Sn = kt.label;
            let jn = We - 2 - Ge - on;
            if (an(rn) > jn) {
              rn = truncateToWidth(rn, jn);
              Sn = rn;
            }
            if (typeof Sn === "string" && s && Sn.includes(s)) {
              let Xr = Sn;
              let co = Xr.indexOf(s);
              Sn = oc.jsxs(oc.Fragment, {
                children: [Xr.slice(0, co), oc.jsx(Text, {
                  ..._e.highlightedText(),
                  children: s
                }), Xr.slice(co + s.length)]
              });
            }
            return {
              option: kt,
              index: vt,
              label: Sn,
              labelWidth: 2 + Ge + an(rn) + on,
              isFocused: yt,
              isSelected: gt,
              isOptionDisabled: Ft,
              shouldShowDownArrow: Rt && It,
              shouldShowUpArrow: wt && ht
            };
          });
          let Tt;
          if (t[77] !== se || t[78] !== x || t[79] !== ke || t[80] !== We) {
            Tt = kt => {
              if (kt.option.type === "input") {
                return null;
              }
              let Ye = We - kt.labelWidth;
              return oc.jsxs(Nop, {
                isFocused: kt.isFocused,
                shouldShowDownArrow: kt.shouldShowDownArrow,
                shouldShowUpArrow: kt.shouldShowUpArrow,
                onClick: se(kt.option),
                children: [oc.jsxs(gXd, {
                  flexDirection: "row",
                  flexShrink: 0,
                  children: [oc.jsx(Text, {
                    children: " "
                  }), oc.jsxs(Text, {
                    dimColor: kt.isOptionDisabled,
                    color: kt.isOptionDisabled ? undefined : kt.isSelected ? "success" : kt.isFocused ? "suggestion" : undefined,
                    children: [!x && oc.jsx(Text, {
                      dimColor: true,
                      children: `${kt.index}.`.padEnd(ke + 2)
                    }), kt.label]
                  }), kt.isSelected && oc.jsxs(Text, {
                    children: [" ", oc.jsx(Ps, {
                      status: "success"
                    })]
                  }), Ye > 0 && oc.jsx(Text, {
                    children: " ".repeat(Ye)
                  })]
                }), oc.jsx(gXd, {
                  flexGrow: 1,
                  marginLeft: 2,
                  children: oc.jsx(Text, {
                    wrap: "wrap",
                    dimColor: kt.option.descriptionColor === undefined && (kt.isOptionDisabled || kt.option.dimDescription !== false),
                    color: kt.isOptionDisabled ? kt.option.descriptionColor : kt.isSelected ? "success" : kt.isFocused ? "suggestion" : kt.option.descriptionColor,
                    children: oc.jsx(Ansi, {
                      children: kt.option.description || " "
                    })
                  })
                })]
              }, String(kt.option.value));
            };
            t[77] = se;
            t[78] = x;
            t[79] = ke;
            t[80] = We;
            t[81] = Tt;
          } else {
            Tt = t[81];
          }
          pe = oc.jsx(gXd, {
            ..._e.container(),
            children: Ze.map(Tt)
          });
          break e;
        }
        ue = gXd;
        ce = _e.container();
        le = ne.visibleOptions.map((Ge, Be) => {
          if (Ge.type === "input") {
            let vt = U.vZc(Ge.value) ? U.get(Ge.value) : Ge.initialValue || "";
            let yt = Ge.index === ne.visibleFromIndex;
            let gt = Ge.index === ne.visibleToIndex - 1;
            let Ft = ne.visibleToIndex < i.length;
            let on = ne.visibleFromIndex > 0;
            let rn = ne.visibleFromIndex + Be + 1;
            let Sn = !C && ne.focusedValue === Ge.value;
            let jn = ne.value === Ge.value;
            return oc.jsx(put, {
              option: Ge,
              isFocused: Sn,
              isSelected: jn,
              shouldShowDownArrow: Ft && gt,
              shouldShowUpArrow: on && yt,
              maxIndexWidth: ke,
              index: rn,
              inputValue: vt,
              onInputChange: Xr => {
                N(co => {
                  let Yt = new Map(co);
                  Yt.set(Ge.value, Xr);
                  return Yt;
                });
              },
              onSubmit: Xr => {
                let co = S && Object.values(S).some(vop);
                if (Xr.trim() || co || Ge.allowEmptySubmitToCancel) {
                  c?.(Ge.value);
                } else {
                  l?.();
                }
              },
              onExit: l,
              layout: "compact",
              showLabel: O,
              onOpenEditor: _,
              resetCursorOnUpdate: Ge.resetCursorOnUpdate,
              onImagePaste: b,
              pastedContents: S,
              onRemoveImage: E,
              imagesSelected: M,
              selectedImageIndex: P,
              onImagesSelectedChange: L,
              onSelectedImageIndexChange: F
            }, String(Ge.value));
          }
          let We = Ge.label;
          if (typeof Ge.label === "string" && s && Ge.label.includes(s)) {
            let vt = Ge.label;
            let yt = vt.indexOf(s);
            We = oc.jsxs(oc.Fragment, {
              children: [vt.slice(0, yt), oc.jsx(Text, {
                ..._e.highlightedText(),
                children: s
              }), vt.slice(yt + s.length)]
            });
          }
          let Ze = Ge.index === ne.visibleFromIndex;
          let Tt = Ge.index === ne.visibleToIndex - 1;
          let kt = ne.visibleToIndex < i.length;
          let Ye = ne.visibleFromIndex > 0;
          let ht = ne.visibleFromIndex + Be + 1;
          let It = !C && ne.focusedValue === Ge.value;
          let Rt = ne.value === Ge.value;
          let wt = Ge.disabled === true;
          return oc.jsxs(nOe, {
            isFocused: It,
            isSelected: Rt,
            shouldShowDownArrow: kt && Tt,
            shouldShowUpArrow: Ye && Ze,
            onClick: se(Ge),
            children: [oc.jsxs(gXd, {
              flexDirection: "row",
              flexShrink: 0,
              children: [!x && oc.jsx(Text, {
                dimColor: true,
                children: `${ht}.`.padEnd(ke + 2)
              }), oc.jsxs(Text, {
                dimColor: wt,
                color: wt ? undefined : Rt ? "success" : It ? "suggestion" : undefined,
                children: [We, O && Ge.description && oc.jsxs(Text, {
                  dimColor: wt || Ge.dimDescription !== false,
                  children: [" ", Ge.description]
                })]
              })]
            }), !O && Ge.description && oc.jsx(gXd, {
              flexShrink: 99,
              marginLeft: 2,
              children: oc.jsx(Text, {
                wrap: "wrap-trim",
                dimColor: wt || Ge.dimDescription !== false,
                color: wt ? undefined : Rt ? "success" : It ? "suggestion" : undefined,
                children: oc.jsx(Ansi, {
                  children: Ge.description
                })
              })
            })]
          }, String(Ge.value));
        });
      }
      t[34] = J;
      t[35] = se;
      t[36] = me;
      t[37] = x;
      t[38] = s;
      t[39] = M;
      t[40] = O;
      t[41] = U;
      t[42] = C;
      t[43] = k;
      t[44] = l;
      t[45] = c;
      t[46] = b;
      t[47] = _;
      t[48] = E;
      t[49] = i;
      t[50] = S;
      t[51] = P;
      t[52] = ne.focusedValue;
      t[53] = ne.options;
      t[54] = ne.value;
      t[55] = ne.visibleFromIndex;
      t[56] = ne.visibleOptions;
      t[57] = ne.visibleToIndex;
      t[58] = ue;
      t[59] = ce;
      t[60] = le;
      t[61] = pe;
    } else {
      ue = t[58];
      ce = t[59];
      le = t[60];
      pe = t[61];
    }
    if (pe !== Symbol.for("react.early_return_sentinel")) {
      return pe;
    }
    let ve;
    if (t[82] !== ue || t[83] !== ce || t[84] !== le) {
      ve = oc.jsx(ue, {
        ...ce,
        children: le
      });
      t[82] = ue;
      t[83] = ce;
      t[84] = le;
      t[85] = ve;
    } else {
      ve = t[85];
    }
    return ve;
  }
  function vop(e) {
    return e.type === "image";
  }
  function wop(e) {
    return e.description;
  }
  function Cop(e) {
    return e.type === "input";
  }
  function Rop(e) {
    return e.type === "image";
  }
  function xop(e) {
    return e.type === "image";
  }
  function kop() {
    return {
      bold: true
    };
  }
  function Aop(e) {
    return e.type === "image";
  }
  function Iop(e) {
    return e.type === "image";
  }
  function Pop(e) {
    return e.description;
  }
  function Oop(e) {
    return e.type === "input";
  }
  function Noo(e, t) {
    let n = t === undefined ? "compact" : t;
    let {
      rows: r
    } = h_(Sr());
    let o = n === "expanded" ? 3 : n === "compact" ? 1 : 2;
    let s = Math.max(1, Math.floor((r - 8) / o));
    return Math.min(e, s);
  }
  function Nop(e) {
    let t = cFn.c(19);
    let {
      isFocused: n,
      shouldShowDownArrow: r,
      shouldShowUpArrow: o,
      onClick: s,
      children: i
    } = e;
    let [a, l] = Nre.useState(false);
    let c = s !== undefined;
    let u;
    if (t[0] !== n) {
      u = {
        line: 0,
        column: 0,
        active: n
      };
      t[0] = n;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d = SG(u);
    let p;
    if (t[2] !== c) {
      p = c ? () => l(true) : undefined;
      t[2] = c;
      t[3] = p;
    } else {
      p = t[3];
    }
    let m;
    if (t[4] !== c) {
      m = c ? () => l(false) : undefined;
      t[4] = c;
      t[5] = m;
    } else {
      m = t[5];
    }
    let f;
    if (t[6] !== c || t[7] !== a || t[8] !== n || t[9] !== r || t[10] !== o) {
      f = oc.jsx(gXd, {
        flexShrink: 0,
        children: n ? oc.jsx(Text, {
          color: "suggestion",
          children: vGd.pointer
        }) : r ? oc.jsx(Text, {
          dimColor: true,
          children: vGd.arrowDown
        }) : o ? oc.jsx(Text, {
          dimColor: true,
          children: vGd.arrowUp
        }) : c && a ? oc.jsx(Text, {
          dimColor: true,
          children: vGd.pointer
        }) : oc.jsx(Text, {
          children: " "
        })
      });
      t[6] = c;
      t[7] = a;
      t[8] = n;
      t[9] = r;
      t[10] = o;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h;
    if (t[12] !== i || t[13] !== d || t[14] !== s || t[15] !== p || t[16] !== m || t[17] !== f) {
      h = oc.jsxs(gXd, {
        ref: d,
        flexDirection: "row",
        flexShrink: 0,
        onClick: s,
        onMouseEnter: p,
        onMouseLeave: m,
        children: [f, i]
      });
      t[12] = i;
      t[13] = d;
      t[14] = s;
      t[15] = p;
      t[16] = m;
      t[17] = f;
      t[18] = h;
    } else {
      h = t[18];
    }
    return h;
  }
  var cFn;
  var Nre;
  var oc;
  var $c = __lazy(() => {
    rE();
    ki();
    dGe();
    Oue();
    bc();
    et();
    Djt();
    dI();
    Vf();
    rFn();
    Ooo();
    sFn();
    qZi();
    KZi();
    cFn = __toESM(pt(), 1);
    Nre = __toESM(ot(), 1);
    oc = __toESM(ie(), 1);
  });
  function Zu(e, t, n) {
    let r = tE();
    let o = r?.getDisplayText(e, t);
    let s = o === undefined;
    let i = r ? "action_not_found" : "no_context";
    let a = uFn.useRef(false);
    if (uFn.useEffect(() => {
      if (s && !a.current) {
        a.current = true;
        logEvent("tengu_keybinding_fallback_used", {
          action: e,
          context: t,
          fallback: n,
          reason: i
        });
      }
    }, [s, e, t, n, i]), s) {
      return n;
    }
    return o === null ? "" : o;
  }
  var uFn;
  var c0 = __lazy(() => {
    Ot();
    yq();
    uFn = __toESM(ot(), 1);
  });
  function bq() {
    if (Me.CLAUDE_CODE_KB_COHESION_FIXES) {
      return true;
    }
    return false;
  }
  var mut = __lazy(() => {
    $n();
    d_();
  });
  function YZi(e, t, n, r = true) {
    let {
      handleInterrupt: o,
      handleExit: s,
      exitState: i
    } = Loo(t, n);
    let a = rOe.useMemo(() => ({
      "app:interrupt": o,
      "app:exit": s
    }), [o, s]);
    e(a, {
      context: "Global",
      isActive: r
    });
    return i;
  }
  function Loo(e, t) {
    let {
      exit: n
    } = MXd();
    let [r, o] = rOe.useState({
      pending: false,
      keyName: null
    });
    let s = rOe.useMemo(() => t ?? n, [t, n]);
    let i = bq();
    let a = Zu("app:interrupt", "Global", "Ctrl-C");
    let l = Zu("app:exit", "Global", "Ctrl-D");
    let c = i && a ? a : "Ctrl-C";
    let u = i && l ? l : "Ctrl-D";
    let d = _G(h => o({
      pending: h,
      keyName: c
    }), s);
    let p = _G(h => o({
      pending: h,
      keyName: u
    }), s);
    let m = rOe.useCallback(() => {
      if (e?.()) {
        return;
      }
      d();
    }, [d, e]);
    let f = rOe.useCallback(() => {
      p();
    }, [p]);
    return {
      handleInterrupt: m,
      handleExit: f,
      exitState: r
    };
  }
  var rOe;
  var JZi = __lazy(() => {
    c0();
    mut();
    aut();
    rOe = __toESM(ot(), 1);
  });
  function Eg(e, t, n) {
    return YZi(jo, t, e, n);
  }
  function QZi(e, t, n = true) {
    let {
      handleInterrupt: r,
      handleExit: o,
      exitState: s
    } = Loo(t, e);
    return {
      entries: XZi.useMemo(() => n ? [{
        action: "app:interrupt",
        run: r
      }, {
        action: "app:exit",
        run: o
      }] : [], [n, r, o]),
      exitState: s
    };
  }
  var XZi;
  var mO = __lazy(() => {
    Bs();
    JZi();
    XZi = __toESM(ot(), 1);
  });
  function ZZi(e) {
    if (e.startsWith("command:")) {
      return {
        description: e.slice(8)
      };
    }
    return Lop[e];
  }
  var Lop;
  var eea = __lazy(() => {
    Lop = {
      "confirm:yes": {
        description: "confirm"
      },
      "confirm:no": {
        description: "cancel"
      },
      "confirm:previous": {
        description: "navigate"
      },
      "confirm:next": {
        description: "navigate"
      },
      "confirm:nextField": {
        description: "next field"
      },
      "confirm:previousField": {
        description: "previous field"
      },
      "confirm:toggle": {
        description: "toggle"
      },
      "confirm:cycleMode": {
        description: "cycle mode"
      },
      "confirm:toggleExplanation": {
        description: "explanation"
      },
      "select:next": {
        description: "navigate"
      },
      "select:previous": {
        description: "navigate"
      },
      "select:pageUp": {
        description: "page up"
      },
      "select:pageDown": {
        description: "page down"
      },
      "select:first": {
        description: "first"
      },
      "select:last": {
        description: "last"
      },
      "select:accept": {
        description: "select"
      },
      "select:cancel": {
        description: "cancel"
      },
      "tabs:next": {
        description: "switch tab"
      },
      "tabs:previous": {
        description: "switch tab"
      },
      "app:toggleReplTab": {
        description: "switch tab"
      },
      "app:toggleDiffNoiseFilter": {
        description: "show/hide tests in diff panel"
      }
    };
  });
  function nea(e) {
    let t = tea.c(18);
    let {
      boundary: n,
      fallback: r,
      order: o,
      omit: s,
      max: i,
      maxWidth: a
    } = e;
    let l = r === undefined ? null : r;
    let c = i === undefined ? 4 : i;
    let u = tE();
    let {
      focusManager: d,
      rootNode: p
    } = ESe.useContext(JVi);
    let [m, f] = ESe.useState(0);
    let h;
    let g;
    if (t[0] !== u || t[1] !== d) {
      h = () => {
        if (!u || !d) {
          return;
        }
        let k = () => f(Uop);
        let I = d.subscribe(k);
        let O = u.keyHandlerRegistry.scopesChanged.subscribe(k);
        k();
        return () => {
          I();
          O();
        };
      };
      g = [u, d];
      t[0] = u;
      t[1] = d;
      t[2] = h;
      t[3] = g;
    } else {
      h = t[2];
      g = t[3];
    }
    ESe.useEffect(h, g);
    let y = d?.activeElement ?? null;
    let _ = n?.current ?? p ?? null;
    let b;
    if (t[4] !== u || t[5] !== c || t[6] !== a || t[7] !== s || t[8] !== o || t[9] !== y || t[10] !== _) {
      b = Bop({
        ctx: u,
        activeElement: y,
        boundaryNode: _,
        order: o,
        omit: s,
        max: c,
        maxWidth: a
      });
      t[4] = u;
      t[5] = c;
      t[6] = a;
      t[7] = s;
      t[8] = o;
      t[9] = y;
      t[10] = _;
      t[11] = b;
    } else {
      b = t[11];
    }
    let S = b;
    let E = ESe.useRef(null);
    let C;
    let x;
    if (t[12] !== S.fellBack || t[13] !== S.hadEntryWithoutDescription) {
      C = () => {
        let k = S.fellBack ? "fell_back" : S.hadEntryWithoutDescription ? "no_description" : "ok";
        if (k === E.current) {
          return;
        }
        let I = E.current === null;
        if (E.current = k, I && k === "fell_back") {
          return;
        }
        if (k === "ok") {
          Pe("keybinding_auto_hints");
        } else {
          Et("keybinding_auto_hints", k);
        }
      };
      x = [S.fellBack, S.hadEntryWithoutDescription];
      t[12] = S.fellBack;
      t[13] = S.hadEntryWithoutDescription;
      t[14] = C;
      t[15] = x;
    } else {
      C = t[14];
      x = t[15];
    }
    if (ESe.useEffect(C, x), S.fellBack) {
      return l;
    }
    let A;
    if (t[16] !== S.text) {
      A = rea.jsx(Text, {
        dimColor: true,
        italic: true,
        children: S.text
      });
      t[16] = S.text;
      t[17] = A;
    } else {
      A = t[17];
    }
    return A;
  }
  function Uop(e) {
    return e + 1;
  }
  function Bop({
    ctx: e,
    activeElement: t,
    boundaryNode: n,
    order: r,
    omit: o,
    max: s,
    maxWidth: i
  }) {
    let a = {
      fellBack: true,
      text: "",
      hadEntryWithoutDescription: false
    };
    if (!e || !t || !n) {
      return a;
    }
    let l = [];
    let c = false;
    let u = 0;
    let d = t;
    while (d) {
      let A = d === n;
      let k = e.keyHandlerRegistry.decls.get(d);
      if (k) {
        for (let I of k.entriesRef.current) {
          if (!I.action) {
            continue;
          }
          l.push({
            action: I.action,
            hint: I.hint,
            scope: k.scope,
            depth: u,
            isBoundary: A
          });
        }
      }
      if (A) {
        c = true;
        break;
      }
      d = d.parentNode;
      u++;
    }
    if (!c) {
      return a;
    }
    if (!l.some(A => !A.isBoundary)) {
      return a;
    }
    let m = new Set(o ?? []);
    let f = new Set();
    let h = false;
    let g = [];
    for (let A of l) {
      if (m.vZc(A.action)) {
        continue;
      }
      let k = A.hint ?? ZZi(A.action)?.description;
      if (!k) {
        h = true;
        continue;
      }
      if (f.vZc(k)) {
        continue;
      }
      let I = Q7i(A.action, A.scope ? [A.scope] : [], e.bindings);
      if (!I) {
        continue;
      }
      f.add(k);
      g.push({
        action: A.action,
        text: `${ZJ(I)} ${k}`,
        depth: A.depth
      });
    }
    let y = new Map();
    (r ?? []).forEach((A, k) => y.set(A, k));
    g.sort((A, k) => {
      let I = y.get(A.action) ?? 1 / 0;
      let O = y.get(k.action) ?? 1 / 0;
      if (I !== O) {
        return I - O;
      }
      return A.depth - k.depth;
    });
    let _ = " \xB7 ";
    let b = an(_);
    let S = 0;
    let E = [];
    for (;;) {
      E = [];
      let A = 0;
      for (let O of g) {
        if (E.length >= s) {
          break;
        }
        let M = (E.length === 0 ? 0 : b) + an(O.text);
        if (i !== undefined && A + M + S > i && E.length > 0) {
          break;
        }
        E.push(O.text);
        A += M;
      }
      let k = g.length - E.length;
      if (i === undefined || k === 0) {
        break;
      }
      let I = an(`${_}+${k} more`);
      if (I <= S) {
        break;
      }
      S = I;
    }
    if (E.length === 0) {
      return a;
    }
    let C = g.length - E.length;
    return {
      fellBack: false,
      text: C > 0 ? `${E.join(_)}${_}+${C} more` : E.join(_),
      hadEntryWithoutDescription: h
    };
  }
  var tea;
  var ESe;
  var rea;
  var oea = __lazy(() => {
    bc();
    et();
    ln();
    eea();
    yq();
    BPe();
    tea = __toESM(pt(), 1);
    ESe = __toESM(ot(), 1);
    rea = __toESM(ie(), 1);
  });
  function aea(e) {
    let t = Foo.c(17);
    let {
      scope: n,
      bindings: r,
      active: o,
      preemptive: s,
      swallowAll: i,
      claimFocus: a,
      ref: l,
      flexGrow: c,
      flexDirection: u,
      flexShrink: d,
      children: p
    } = e;
    let m = o === undefined ? true : o;
    let f = s === undefined ? false : s;
    let h = i === undefined ? false : i;
    let g = a === undefined ? false : a;
    let y = c === undefined ? 0 : c;
    let _ = Nue.useRef(null);
    let b;
    if (t[0] !== m || t[1] !== r || t[2] !== f || t[3] !== n || t[4] !== h) {
      b = {
        scope: n,
        bindings: r,
        active: m,
        preemptive: f,
        swallowAll: h
      };
      t[0] = m;
      t[1] = r;
      t[2] = f;
      t[3] = n;
      t[4] = h;
      t[5] = b;
    } else {
      b = t[5];
    }
    let S = Hop(_, b);
    qop(_, g);
    Wop(_, n, g);
    let E;
    if (t[6] !== l) {
      E = k => {
        if (_.current = k, typeof l === "function") {
          l(k);
        } else if (l) {
          l.current = k;
        }
      };
      t[6] = l;
      t[7] = E;
    } else {
      E = t[7];
    }
    let C = E;
    let x = g ? -1 : undefined;
    let A;
    if (t[8] !== p || t[9] !== u || t[10] !== y || t[11] !== d || t[12] !== S || t[13] !== n || t[14] !== C || t[15] !== x) {
      A = lea.jsx(oJd, {
        ref: C,
        keybindingScope: n,
        onAction: S,
        tabIndex: x,
        flexGrow: y,
        flexDirection: u,
        flexShrink: d,
        children: p
      });
      t[8] = p;
      t[9] = u;
      t[10] = y;
      t[11] = d;
      t[12] = S;
      t[13] = n;
      t[14] = C;
      t[15] = x;
      t[16] = A;
    } else {
      A = t[16];
    }
    return A;
  }
  function $op(e, t) {
    for (let n of t) {
      if (n.action !== e.action) {
        continue;
      }
      if (n.chordOnly && !e.isChordCompletion) {
        continue;
      }
      if (n.run() === false) {
        continue;
      }
      e.consume();
      return;
    }
  }
  function Hop(e, {
    scope: t,
    bindings: n,
    active: r = true,
    preemptive: o = false,
    swallowAll: s = false
  }) {
    let i = tE();
    let a = Nue.useRef([]);
    a.current = r ? n : [];
    let l = Nue.useCallback(p => $op(p, a.current), []);
    let c = jop(t, r, o, s, a.current);
    let u = r && o && Boolean(t);
    let d = u && s;
    Nue.useLayoutEffect(() => {
      if (!i) {
        return;
      }
      let p = e.current;
      if (!p) {
        return;
      }
      let {
        decls: m,
        scopesChanged: f,
        preemptiveScopes: h,
        swallowAll: g
      } = i.keyHandlerRegistry;
      let y = {
        scope: t,
        active: r,
        preemptive: o,
        swallowAll: s,
        entriesRef: a
      };
      if (m.set(p, y), u && t) {
        if (sea(h, t), d) {
          sea(g, t);
        }
      }
      f.emit();
      return () => {
        if (m.delete(p), u && t) {
          if (iea(h, t), d) {
            iea(g, t);
          }
        }
        f.emit();
      };
    }, [i, e, t, u, d, c]);
    return l;
  }
  function sea(e, t) {
    e.set(t, (e.get(t) ?? 0) + 1);
  }
  function iea(e, t) {
    let n = (e.get(t) ?? 0) - 1;
    if (n <= 0) {
      e.delete(t);
    } else {
      e.set(t, n);
    }
  }
  function jop(e, t, n, r, o) {
    return De([e ?? "", t, n, r, o.map(s => [s.action ?? "", s.hint ?? "", Boolean(s.chordOnly)])]);
  }
  function qop(e, t) {
    Nue.useLayoutEffect(() => {
      if (!t) {
        return;
      }
      let n = e.current;
      if (!n) {
        return;
      }
      let r = yre(n);
      let o = false;
      let s = () => {
        if (o) {
          return;
        }
        let i = e.current;
        if (!i) {
          return;
        }
        let a = r.activeElement;
        if (a && gre(a, i)) {
          return;
        }
        o = true;
        try {
          r.focus(i);
        } finally {
          o = false;
        }
      };
      r.pushAutoFocusFallback(n);
      s();
      return r.subscribe(s);
    }, [e, t]);
  }
  function Wop(e, t, n) {
    let r = Foo.c(6);
    let o = tE();
    let s = Nue.useRef(false);
    let i;
    let a;
    if (r[0] !== n || r[1] !== o || r[2] !== e || r[3] !== t) {
      i = () => {
        return;
      };
      a = [e, t, n, o];
      r[0] = n;
      r[1] = o;
      r[2] = e;
      r[3] = t;
      r[4] = i;
      r[5] = a;
    } else {
      i = r[4];
      a = r[5];
    }
    Nue.useLayoutEffect(i, a);
  }
  var Foo;
  var Nue;
  var lea;
  var cea = __lazy(() => {
    iSe();
    et();
    je();
    yq();
    Foo = __toESM(pt(), 1);
    Nue = __toESM(ot(), 1);
    lea = __toESM(ie(), 1);
  });
  function mS(e) {
    let t = uea.c(27);
    let {
      width: n,
      color: r,
      char: o,
      padding: s,
      title: i,
      titleAlign: a
    } = e;
    let l = o === undefined ? "\u2500" : o;
    let c = s === undefined ? 0 : s;
    let u = a === undefined ? "center" : a;
    let {
      columns: d
    } = Sr();
    let p = Math.max(0, (n ?? d) - c);
    let m;
    if (t[0] !== r || t[1] !== i) {
      m = i ? Lue.jsx(Text, {
        color: r,
        dimColor: !r,
        children: Lue.jsx(Ansi, {
          children: i
        })
      }) : null;
      t[0] = r;
      t[1] = i;
      t[2] = m;
    } else {
      m = t[2];
    }
    let f = m;
    if (i) {
      let _ = an(i) + 2;
      let b = Math.max(0, p - _);
      let S = u === "start" ? Math.min(4, b) : Math.floor(b / 2);
      let E = b - S;
      let C = !r;
      let x;
      if (t[3] !== l || t[4] !== S) {
        x = l.repeat(S);
        t[3] = l;
        t[4] = S;
        t[5] = x;
      } else {
        x = t[5];
      }
      let A;
      if (t[6] !== i) {
        A = Lue.jsx(Text, {
          dimColor: true,
          children: Lue.jsx(Ansi, {
            children: i
          })
        });
        t[6] = i;
        t[7] = A;
      } else {
        A = t[7];
      }
      let k;
      if (t[8] !== l || t[9] !== E) {
        k = l.repeat(E);
        t[8] = l;
        t[9] = E;
        t[10] = k;
      } else {
        k = t[10];
      }
      let I;
      if (t[11] !== r || t[12] !== C || t[13] !== x || t[14] !== A || t[15] !== k) {
        I = Lue.jsxs(Text, {
          color: r,
          dimColor: C,
          children: [x, " ", A, " ", k]
        });
        t[11] = r;
        t[12] = C;
        t[13] = x;
        t[14] = A;
        t[15] = k;
        t[16] = I;
      } else {
        I = t[16];
      }
      let O;
      if (t[17] !== f || t[18] !== I) {
        O = Lue.jsx(Decorative, {
          fallback: f,
          children: I
        });
        t[17] = f;
        t[18] = I;
        t[19] = O;
      } else {
        O = t[19];
      }
      return O;
    }
    let h = !r;
    let g;
    if (t[20] !== l || t[21] !== p) {
      g = l.repeat(p);
      t[20] = l;
      t[21] = p;
      t[22] = g;
    } else {
      g = t[22];
    }
    let y;
    if (t[23] !== r || t[24] !== h || t[25] !== g) {
      y = Lue.jsx(Decorative, {
        children: Lue.jsx(Text, {
          color: r,
          dimColor: h,
          children: g
        })
      });
      t[23] = r;
      t[24] = h;
      t[25] = g;
      t[26] = y;
    } else {
      y = t[26];
    }
    return y;
  }
  var uea;
  var Lue;
  var oX = __lazy(() => {
    wl();
    ki();
    bc();
    et();
    uea = __toESM(pt(), 1);
    Lue = __toESM(ie(), 1);
  });
  function Td(e) {
    let t = dea.c(9);
    let {
      children: n,
      color: r
    } = e;
    if (nE()) {
      let a;
      if (t[0] !== n) {
        a = fut.jsx(gXd, {
          flexDirection: "column",
          paddingX: 1,
          flexShrink: 0,
          children: n
        });
        t[0] = n;
        t[1] = a;
      } else {
        a = t[1];
      }
      return a;
    }
    let o;
    if (t[2] !== r) {
      o = fut.jsx(mS, {
        color: r
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    let s;
    if (t[4] !== n) {
      s = fut.jsx(gXd, {
        flexDirection: "column",
        paddingX: 2,
        children: n
      });
      t[4] = n;
      t[5] = s;
    } else {
      s = t[5];
    }
    let i;
    if (t[6] !== o || t[7] !== s) {
      i = fut.jsxs(gXd, {
        flexDirection: "column",
        paddingTop: 1,
        children: [o, s]
      });
      t[6] = o;
      t[7] = s;
      t[8] = i;
    } else {
      i = t[8];
    }
    return i;
  }
  var dea;
  var fut;
  var oE = __lazy(() => {
    rE();
    et();
    oX();
    dea = __toESM(pt(), 1);
    fut = __toESM(ie(), 1);
  });
  function or(e) {
    let t = mea.c(43);
    let {
      title: n,
      titleEnd: r,
      subtitle: o,
      children: s,
      onCancel: i,
      color: a,
      hideInputGuide: l,
      hideBorder: c,
      inputGuide: u,
      isCancelActive: d
    } = e;
    let p = a === undefined ? "permission" : a;
    let m = d === undefined ? true : d;
    let f = CSe.useRef(null);
    let {
      entries: h,
      exitState: g
    } = QZi(undefined, undefined, m);
    let y;
    if (t[0] !== m || t[1] !== i) {
      y = m ? [{
        action: "confirm:no",
        run: i,
        hint: "cancel"
      }] : [];
      t[0] = m;
      t[1] = i;
      t[2] = y;
    } else {
      y = t[2];
    }
    let _ = y;
    let b;
    if (t[3] !== _ || t[4] !== h) {
      b = [..._, ...h];
      t[3] = _;
      t[4] = h;
      t[5] = b;
    } else {
      b = t[5];
    }
    let S = b;
    let E = CSe.useContext(_q);
    let C = CSe.useRef(null);
    let [x, A] = CSe.useState(o ? 2 : 1);
    let k;
    if (t[6] !== E || t[7] !== x) {
      k = () => {
        if (!E || !C.current) {
          return;
        }
        let ne = $Xd(C.current).height;
        if (ne !== x) {
          A(ne);
        }
      };
      t[6] = E;
      t[7] = x;
      t[8] = k;
    } else {
      k = t[8];
    }
    CSe.useLayoutEffect(k);
    let I = x + 1 + (l ? 0 : 2);
    let O;
    if (t[9] !== E || t[10] !== I) {
      O = E ? {
        ...E,
        rows: Math.max(0, E.rows - I)
      } : null;
      t[9] = E;
      t[10] = I;
      t[11] = O;
    } else {
      O = t[11];
    }
    let M = O;
    let L;
    if (t[12] !== g || t[13] !== u) {
      L = typeof u === "function" ? u(g) : g.pending ? LI.jsxs(Text, {
        children: ["Press ", g.keyName, " again to exit"]
      }) : u != null ? u : undefined;
      t[12] = g;
      t[13] = u;
      t[14] = L;
    } else {
      L = t[14];
    }
    let P = L;
    let F = typeof u === "function" || g.pending || u != null;
    let H;
    if (t[15] !== P || t[16] !== l || t[17] !== m || t[18] !== F) {
      H = !l && LI.jsx(gXd, {
        marginTop: 1,
        children: F ? LI.jsx(Text, {
          dimColor: true,
          italic: true,
          children: P
        }) : !m ? LI.jsx(Text, {
          dimColor: true,
          italic: true,
          children: pea
        }) : LI.jsx(nea, {
          boundary: f,
          fallback: LI.jsx(Text, {
            dimColor: true,
            italic: true,
            children: pea
          })
        })
      });
      t[15] = P;
      t[16] = l;
      t[17] = m;
      t[18] = F;
      t[19] = H;
    } else {
      H = t[19];
    }
    let U = H;
    let N = c ? 0 : 1;
    let W;
    if (t[20] !== p || t[21] !== n || t[22] !== r) {
      W = r ? LI.jsxs(gXd, {
        justifyContent: "space-between",
        gap: 2,
        children: [LI.jsx(Text, {
          bold: true,
          color: p,
          children: n
        }), LI.jsx(Text, {
          dimColor: true,
          wrap: "truncate-start",
          children: r
        })]
      }) : LI.jsx(Text, {
        bold: true,
        color: p,
        children: n
      });
      t[20] = p;
      t[21] = n;
      t[22] = r;
      t[23] = W;
    } else {
      W = t[23];
    }
    let j;
    if (t[24] !== o) {
      j = o && LI.jsx(Text, {
        dimColor: true,
        children: o
      });
      t[24] = o;
      t[25] = j;
    } else {
      j = t[25];
    }
    let z;
    if (t[26] !== W || t[27] !== j) {
      z = LI.jsxs(gXd, {
        ref: C,
        flexDirection: "column",
        children: [W, j]
      });
      t[26] = W;
      t[27] = j;
      t[28] = z;
    } else {
      z = t[28];
    }
    let V;
    if (t[29] !== M || t[30] !== s) {
      V = LI.jsx(_q, {
        value: M,
        children: s
      });
      t[29] = M;
      t[30] = s;
      t[31] = V;
    } else {
      V = t[31];
    }
    let K;
    if (t[32] !== z || t[33] !== V) {
      K = LI.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [z, V]
      });
      t[32] = z;
      t[33] = V;
      t[34] = K;
    } else {
      K = t[34];
    }
    let J;
    if (t[35] !== S || t[36] !== U || t[37] !== K || t[38] !== N) {
      J = LI.jsxs(aea, {
        ref: f,
        scope: "Confirmation",
        claimFocus: true,
        flexGrow: N,
        flexDirection: "column",
        bindings: S,
        children: [K, U]
      });
      t[35] = S;
      t[36] = U;
      t[37] = K;
      t[38] = N;
      t[39] = J;
    } else {
      J = t[39];
    }
    let Q = J;
    if (c) {
      return Q;
    }
    let Z;
    if (t[40] !== p || t[41] !== Q) {
      Z = LI.jsx(Td, {
        color: p,
        children: Q
      });
      t[40] = p;
      t[41] = Q;
      t[42] = Z;
    } else {
      Z = t[42];
    }
    return Z;
  }
  var mea;
  var CSe;
  var LI;
  var pea;
  var Ii = __lazy(() => {
    rE();
    mO();
    et();
    oea();
    cea();
    Sd();
    Ai();
    bs();
    oE();
    mea = __toESM(pt(), 1);
    CSe = __toESM(ot(), 1);
    LI = __toESM(ie(), 1);
    pea = LI.jsxs(Hn, {
      children: [LI.jsx(xt, {
        chord: "enter",
        action: "confirm"
      }), LI.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: "cancel"
      })]
    });
  });
  function Hc(e) {
    let t = fea.c(4);
    let {
      error: n
    } = e;
    if (!n) {
      return null;
    }
    let r;
    if (t[0] !== n) {
      r = he(n);
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] !== r) {
      o = hea.jsx(Text, {
        color: "error",
        children: r
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    return o;
  }
  var fea;
  var hea;
  var bv = __lazy(() => {
    dt();
    IPe();
    fea = __toESM(pt(), 1);
    hea = __toESM(ie(), 1);
  });
  function sc(e) {
    let t = gea.c(9);
    let {
      children: n,
      hint: r
    } = e;
    if (!r) {
      let a;
      if (t[0] !== n) {
        a = hut.jsx(Text, {
          dimColor: true,
          children: n
        });
        t[0] = n;
        t[1] = a;
      } else {
        a = t[1];
      }
      return a;
    }
    let o;
    if (t[2] !== n) {
      o = hut.jsx(Text, {
        dimColor: true,
        children: n
      });
      t[2] = n;
      t[3] = o;
    } else {
      o = t[3];
    }
    let s;
    if (t[4] !== r) {
      s = hut.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[4] = r;
      t[5] = s;
    } else {
      s = t[5];
    }
    let i;
    if (t[6] !== o || t[7] !== s) {
      i = hut.jsxs(gXd, {
        flexDirection: "column",
        children: [o, s]
      });
      t[6] = o;
      t[7] = s;
      t[8] = i;
    } else {
      i = t[8];
    }
    return i;
  }
  var gea;
  var hut;
  var xb = __lazy(() => {
    et();
    gea = __toESM(pt(), 1);
    hut = __toESM(ie(), 1);
  });
  function Vop(e) {
    if (e.startsWith("file-")) {
      return "+";
    }
    if (e.startsWith("mcp-resource-")) {
      return "\u25C7";
    }
    if (e.startsWith("mcp-template")) {
      return "\u25C7";
    }
    if (e.startsWith("agent-")) {
      return "*";
    }
    return "+";
  }
  function zop(e, t, n = false) {
    let r = e.toLowerCase();
    if (r.length !== e.length) {
      return [];
    }
    let o = r.indexOf(t);
    if (o !== -1) {
      return [[o, o + t.length]];
    }
    if (n) {
      return [];
    }
    let s = [];
    let i = 0;
    for (let a of t) {
      let l = r.indexOf(a, i);
      if (l === -1) {
        return [];
      }
      let c = l + a.length;
      let u = s.at(-1);
      if (u && u[1] === l) {
        u[1] = c;
      } else {
        s.push([l, c]);
      }
      i = c;
    }
    return s;
  }
  function Uoo(e) {
    let t = $oo.c(13);
    let {
      text: n,
      query: r,
      color: o,
      dimColor: s,
      bold: i,
      contiguousOnly: a
    } = e;
    let l;
    let c;
    if (t[0] !== i || t[1] !== o || t[2] !== a || t[3] !== s || t[4] !== r || t[5] !== n) {
      c = Symbol.for("react.early_return_sentinel");
      e: {
        let u = r ? zop(n, r, a) : [];
        if (u.length === 0) {
          let f;
          if (t[8] !== i || t[9] !== o || t[10] !== s || t[11] !== n) {
            f = hw.jsx(Text, {
              color: o,
              dimColor: s,
              bold: i,
              children: n
            });
            t[8] = i;
            t[9] = o;
            t[10] = s;
            t[11] = n;
            t[12] = f;
          } else {
            f = t[12];
          }
          c = f;
          break e;
        }
        let d = [];
        let p = (f, h, g) => {
          if (f >= h) {
            return;
          }
          d.push(hw.jsx(Text, {
            color: g ? "suggestion" : o,
            dimColor: !g && s,
            bold: i,
            children: n.slice(f, h)
          }, f));
        };
        let m = 0;
        for (let [f, h] of u) {
          p(m, f, false);
          p(f, h, true);
          m = h;
        }
        p(m, n.length, false);
        l = hw.jsx(hw.Fragment, {
          children: d
        });
      }
      t[0] = i;
      t[1] = o;
      t[2] = a;
      t[3] = s;
      t[4] = r;
      t[5] = n;
      t[6] = l;
      t[7] = c;
    } else {
      l = t[6];
      c = t[7];
    }
    if (c !== Symbol.for("react.early_return_sentinel")) {
      return c;
    }
    return l;
  }
  function yea(e) {
    return e.startsWith("file-") || e.startsWith("mcp-resource-") || e.startsWith("mcp-template") || e.startsWith("agent-");
  }
  function yGe({
    suggestions: e,
    selectedSuggestion: t,
    maxColumnWidth: n,
    emptyMessage: r,
    overlay: o,
    noPad: s,
    onSelect: i,
    hoveredId: a,
    onHoverChange: l
  }) {
    let {
      rows: c,
      columns: u
    } = Sr();
    let d = o ? 5 : Math.max(1, Math.min(Math.max(6, Math.floor(c / 2)), c - 3));
    if (e.length === 0) {
      if (!r) {
        return null;
      }
      let k = s ? 0 : Math.max(0, d - 1);
      return hw.jsxs(gXd, {
        flexDirection: "column",
        justifyContent: o ? undefined : "flex-end",
        children: [hw.jsx(sc, {
          children: r
        }), Array.from({
          length: k
        }, (I, O) => hw.jsx(Text, {
          children: " "
        }, `pad-${O}`))]
      });
    }
    let p = n ?? Math.max(...e.map(k => an(k.displayText))) + 5;
    let m = d >= 2;
    let f = e.map(k => m ? Yop(k, u, p) : 1);
    let h = Math.max(0, Math.min(t, e.length - 1));
    let g = h;
    let y = h + 1;
    let _ = f[h] ?? 1;
    let b = 0;
    let S = Math.floor(d / 2);
    while (g > 0 && _ < d && b + (f[g - 1] ?? 1) <= S) {
      g--;
      b += f[g] ?? 1;
    }
    _ += b;
    while (y < e.length && _ + (f[y] ?? 1) <= d) {
      _ += f[y] ?? 1;
      y++;
    }
    while (g > 0 && _ + (f[g - 1] ?? 1) <= d) {
      g--;
      _ += f[g] ?? 1;
    }
    let E = e.slice(g, y);
    let C = s ? 0 : Math.max(0, d - _);
    let x = e[t]?.id;
    let A = a != null && e.some(k => k.id === a) ? a : undefined;
    return hw.jsxs(gXd, {
      flexDirection: "column",
      justifyContent: o ? undefined : "flex-end",
      onMouseLeave: i ? () => l?.(null) : undefined,
      children: [E.map((k, I) => {
        let O = g + I;
        let M = hw.jsx(Kop, {
          item: k,
          maxColumnWidth: p,
          isSelected: k.id === (A ?? x),
          allowWrap: m
        }, k.id);
        if (!i) {
          return M;
        }
        return hw.jsx(gXd, {
          onMouseEnter: () => l?.(k.id),
          onClick: () => i(O),
          children: M
        }, k.id);
      }), Array.from({
        length: C
      }, (k, I) => hw.jsx(Text, {
        children: " "
      }, `pad-${I}`))]
    });
  }
  function bea(e) {
    let n = e.kind === undefined || e.kind === "action" ? "" : e.kind === "info" ? "config" : e.kind;
    let r = e.kind === undefined ? "" : n + hm(" ", 7 - an(n));
    let o = e.sourceTag ? `[${e.sourceTag}] ` : "";
    return {
      kindLaneText: r,
      kindLabel: n,
      sourceText: o
    };
  }
  function Yop(e, t, n) {
    if (yea(e.id) || !e.description) {
      return 1;
    }
    let r = Math.min(n, Math.floor(t * 0.4));
    let o = e.tag ? an(`[${e.tag}] `) : 0;
    let {
      kindLaneText: s,
      sourceText: i
    } = bea(e);
    let a = Math.max(0, t - r - o - an(s) - an(i) - 4);
    if (a <= 0) {
      return 1;
    }
    let l = e.description.replace(Boo, " ").trim();
    return an(l) > a ? 2 : 1;
  }
  function Jop(e, t) {
    if (t <= 0 || an(e) <= t) {
      return [e, ""];
    }
    let n = truncateToWidthNoEllipsis(e, t);
    let r = e.slice(n.length);
    if (r.startsWith(" ")) {
      return [n, r.trimStart()];
    }
    let o = n.lastIndexOf(" ");
    if (o > 0) {
      return [n.slice(0, o), e.slice(o + 1)];
    }
    return [n, r];
  }
  var $oo;
  var Hoo;
  var hw;
  var Boo;
  var Kop;
  var _ea;
  var Ljt = __lazy(() => {
    wl();
    ki();
    bc();
    et();
    cs();
    Zn();
    xb();
    $oo = __toESM(pt(), 1);
    Hoo = __toESM(ot(), 1);
    hw = __toESM(ie(), 1);
    Boo = /\s+/g;
    Kop = Hoo.memo(function (t) {
      let n = $oo.c(98);
      let {
        item: r,
        maxColumnWidth: o,
        isSelected: s,
        allowWrap: i
      } = t;
      let a = i === undefined ? true : i;
      let l = Sr().columns;
      if (yea(r.id)) {
        let ne;
        if (n[0] !== r.id) {
          ne = Vop(r.id);
          n[0] = r.id;
          n[1] = ne;
        } else {
          ne = n[1];
        }
        let oe = ne;
        let ee = s ? "suggestion" : undefined;
        let re = !s;
        let se = r.id.startsWith("file-");
        let ae = r.id.startsWith("mcp-resource-");
        let de;
        if (n[2] !== r.id) {
          de = r.id.startsWith("mcp-template-value::");
          n[2] = r.id;
          n[3] = de;
        } else {
          de = n[3];
        }
        let be = de;
        let fe = r.id.startsWith("mcp-template::");
        let me = r.description ? 3 : 0;
        let Te;
        if (se || fe || be) {
          let pe;
          if (n[4] !== r.description) {
            pe = r.description ? Math.min(20, an(r.description)) : 0;
            n[4] = r.description;
            n[5] = pe;
          } else {
            pe = n[5];
          }
          let ve = pe;
          let _e = l - 2 - 4 - me - ve;
          let xe;
          if (n[6] !== be || n[7] !== r.displayText || n[8] !== _e) {
            xe = be ? truncateStartToWidth(r.displayText, _e) : truncatePathMiddle(r.displayText, _e);
            n[6] = be;
            n[7] = r.displayText;
            n[8] = _e;
            n[9] = xe;
          } else {
            xe = n[9];
          }
          Te = xe;
        } else if (ae) {
          let pe;
          if (n[10] !== r.displayText) {
            pe = truncateToWidth(r.displayText, 30);
            n[10] = r.displayText;
            n[11] = pe;
          } else {
            pe = n[11];
          }
          Te = pe;
        } else {
          Te = r.displayText;
        }
        let ue = l - 2 - an(Te) - me - 4;
        let ce;
        if (r.description) {
          let pe = Math.max(0, ue);
          let ve;
          if (n[12] !== r.description || n[13] !== pe) {
            ve = truncateToWidth(r.description.replace(Boo, " "), pe);
            n[12] = r.description;
            n[13] = pe;
            n[14] = ve;
          } else {
            ve = n[14];
          }
          ce = `${oe} ${Te} \u2013 ${ve}`;
        } else {
          ce = `${oe} ${Te}`;
        }
        let le;
        if (n[15] !== re || n[16] !== ce || n[17] !== ee) {
          le = hw.jsx(Text, {
            color: ee,
            dimColor: re,
            wrap: "truncate",
            children: ce
          });
          n[15] = re;
          n[16] = ce;
          n[17] = ee;
          n[18] = le;
        } else {
          le = n[18];
        }
        return le;
      }
      let d = r.description || r.tag || r.kind !== undefined || r.sourceTag ? Math.floor(l * 0.4) : l - 4;
      let p = Math.min(o ?? an(r.displayText) + 5, d);
      let m = r.color || (s ? "suggestion" : undefined);
      let f = !s;
      let h;
      if (n[19] !== r.id) {
        h = r.id.startsWith("emoji:");
        n[19] = r.id;
        n[20] = h;
      } else {
        h = n[20];
      }
      let g = h;
      let y = g ? s ? `${vGd.pointer} ` : "  " : "";
      let _ = an(y);
      let b = g && s;
      let S = r.displayText;
      if (an(S) > p - 2) {
        let ne;
        if (n[21] !== S) {
          ne = S.includes("/") || S.includes("\\");
          n[21] = S;
          n[22] = ne;
        } else {
          ne = n[22];
        }
        let oe = ne;
        let ee;
        if (n[23] !== p || n[24] !== S || n[25] !== oe) {
          ee = oe ? truncateStartToWidth(S, p - 2) : truncateToWidth(S, p - 2);
          n[23] = p;
          n[24] = S;
          n[25] = oe;
          n[26] = ee;
        } else {
          ee = n[26];
        }
        S = ee;
      }
      let E;
      if (n[27] !== p || n[28] !== S || n[29] !== _) {
        E = " ".repeat(Math.max(0, p - an(S) - _));
        n[27] = p;
        n[28] = S;
        n[29] = _;
        n[30] = E;
      } else {
        E = n[30];
      }
      let C = E;
      let x = r.tag ? `[${r.tag}] ` : "";
      let A = an(x);
      let k;
      let I;
      let O;
      let M;
      let L;
      if (n[31] !== r) {
        let {
          kindLaneText: ne,
          kindLabel: oe,
          sourceText: ee
        } = bea(r);
        I = ne;
        O = ee;
        k = oe === "skill" ? "skill" : oe === "agent" ? "background" : undefined;
        M = an(I);
        L = an(O);
        n[31] = r;
        n[32] = k;
        n[33] = I;
        n[34] = O;
        n[35] = M;
        n[36] = L;
      } else {
        k = n[32];
        I = n[33];
        O = n[34];
        M = n[35];
        L = n[36];
      }
      let P = M + L;
      let F = Math.max(0, l - p - A - P - 4);
      let H;
      let U;
      let N;
      let W;
      let j;
      if (n[37] !== a || n[38] !== b || n[39] !== l || n[40] !== F || n[41] !== p || n[42] !== S || n[43] !== s || n[44] !== r.description || n[45] !== r.query || n[46] !== k || n[47] !== I || n[48] !== P || n[49] !== C || n[50] !== y || n[51] !== f || n[52] !== O || n[53] !== x || n[54] !== A || n[55] !== m) {
        j = Symbol.for("react.early_return_sentinel");
        e: {
          let ne = r.description ? r.description.replace(Boo, " ").trim() : "";
          let [oe, ee] = a ? Jop(ne, F) : [truncateToWidth(ne, F), ""];
          H = s ? "suggestion" : undefined;
          let re;
          if (n[61] !== b || n[62] !== y || n[63] !== f || n[64] !== m) {
            re = y ? hw.jsx(Text, {
              color: m,
              dimColor: f,
              bold: b,
              children: y
            }) : null;
            n[61] = b;
            n[62] = y;
            n[63] = f;
            n[64] = m;
            n[65] = re;
          } else {
            re = n[65];
          }
          let se;
          if (n[66] !== b || n[67] !== S || n[68] !== r.query || n[69] !== f || n[70] !== m) {
            se = hw.jsx(Uoo, {
              text: S,
              query: r.query,
              color: m,
              dimColor: f,
              bold: b
            });
            n[66] = b;
            n[67] = S;
            n[68] = r.query;
            n[69] = f;
            n[70] = m;
            n[71] = se;
          } else {
            se = n[71];
          }
          let ae;
          if (n[72] !== b || n[73] !== C || n[74] !== f || n[75] !== m) {
            ae = hw.jsx(Text, {
              color: m,
              dimColor: f,
              bold: b,
              children: C
            });
            n[72] = b;
            n[73] = C;
            n[74] = f;
            n[75] = m;
            n[76] = ae;
          } else {
            ae = n[76];
          }
          let de;
          if (n[77] !== k || n[78] !== I) {
            de = I ? hw.jsx(Text, {
              color: k,
              dimColor: k === undefined,
              children: I
            }) : null;
            n[77] = k;
            n[78] = I;
            n[79] = de;
          } else {
            de = n[79];
          }
          let be;
          if (n[80] !== x) {
            be = x ? hw.jsx(Text, {
              dimColor: true,
              children: x
            }) : null;
            n[80] = x;
            n[81] = be;
          } else {
            be = n[81];
          }
          let fe;
          if (n[82] !== O) {
            fe = O ? hw.jsx(Text, {
              dimColor: true,
              children: O
            }) : null;
            n[82] = O;
            n[83] = fe;
          } else {
            fe = n[83];
          }
          if (U = hw.jsxs(Text, {
            wrap: "truncate",
            children: [re, se, ae, de, be, fe, hw.jsx(Uoo, {
              text: oe,
              query: r.query,
              color: H,
              dimColor: !s,
              bold: b,
              contiguousOnly: true
            })]
          }), !ee) {
            j = U;
            break e;
          }
          N = p + A + P;
          W = truncateToWidth(ee, Math.max(0, l - N - 4));
        }
        n[37] = a;
        n[38] = b;
        n[39] = l;
        n[40] = F;
        n[41] = p;
        n[42] = S;
        n[43] = s;
        n[44] = r.description;
        n[45] = r.query;
        n[46] = k;
        n[47] = I;
        n[48] = P;
        n[49] = C;
        n[50] = y;
        n[51] = f;
        n[52] = O;
        n[53] = x;
        n[54] = A;
        n[55] = m;
        n[56] = H;
        n[57] = U;
        n[58] = N;
        n[59] = W;
        n[60] = j;
      } else {
        H = n[56];
        U = n[57];
        N = n[58];
        W = n[59];
        j = n[60];
      }
      if (j !== Symbol.for("react.early_return_sentinel")) {
        return j;
      }
      let z = W;
      let V;
      if (n[84] !== N) {
        V = " ".repeat(N);
        n[84] = N;
        n[85] = V;
      } else {
        V = n[85];
      }
      let K = !s;
      let J;
      if (n[86] !== b || n[87] !== H || n[88] !== z || n[89] !== r.query || n[90] !== K) {
        J = hw.jsx(Uoo, {
          text: z,
          query: r.query,
          color: H,
          dimColor: K,
          bold: b,
          contiguousOnly: true
        });
        n[86] = b;
        n[87] = H;
        n[88] = z;
        n[89] = r.query;
        n[90] = K;
        n[91] = J;
      } else {
        J = n[91];
      }
      let Q;
      if (n[92] !== J || n[93] !== V) {
        Q = hw.jsxs(Text, {
          wrap: "truncate",
          children: [V, J]
        });
        n[92] = J;
        n[93] = V;
        n[94] = Q;
      } else {
        Q = n[94];
      }
      let Z;
      if (n[95] !== U || n[96] !== Q) {
        Z = hw.jsxs(gXd, {
          flexDirection: "column",
          children: [U, Q]
        });
        n[95] = U;
        n[96] = Q;
        n[97] = Z;
      } else {
        Z = n[97];
      }
      return Z;
    });
    _ea = Hoo.memo(yGe);
  });
  function Sea() {
    let e = Fjt.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = GC.jsx(Text, {
        dimColor: true,
        children: "Claude Code will be able to read files in this directory and make edits when auto-accept edits is on."
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function Qop(e) {
    let t = Fjt.c(5);
    let {
      path: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = GC.jsx(Text, {
        color: "permission",
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = GC.jsx(Sea, {});
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== r) {
      s = GC.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [r, o]
      });
      t[3] = r;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function Zop(e) {
    let t = Fjt.c(14);
    let {
      value: n,
      onChange: r,
      onSubmit: o,
      error: s,
      suggestions: i,
      selectedSuggestion: a
    } = e;
    let l;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = GC.jsx(Text, {
        children: "Enter the path to the directory:"
      });
      t[0] = l;
    } else {
      l = t[0];
    }
    let c;
    if (t[1] !== r || t[2] !== o || t[3] !== n) {
      c = GC.jsx(gXd, {
        borderDimColor: true,
        borderStyle: "round",
        marginTop: 1,
        paddingLeft: 1,
        children: GC.jsx(Dl, {
          showCursor: true,
          placeholder: `Directory path${vGd.ellipsis}`,
          value: n,
          onChange: r,
          onSubmit: o,
          columns: 80,
          cursorOffset: n.length,
          onChangeCursorOffset: esp
        })
      });
      t[1] = r;
      t[2] = o;
      t[3] = n;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== i) {
      u = i.length > 0 && GC.jsx(gXd, {
        marginBottom: 1,
        children: GC.jsx(yGe, {
          suggestions: i,
          selectedSuggestion: a,
          noPad: true
        })
      });
      t[5] = a;
      t[6] = i;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== s) {
      d = GC.jsx(Hc, {
        error: s
      });
      t[8] = s;
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] !== c || t[11] !== u || t[12] !== d) {
      p = GC.jsxs(gXd, {
        flexDirection: "column",
        children: [l, c, u, d]
      });
      t[10] = c;
      t[11] = u;
      t[12] = d;
      t[13] = p;
    } else {
      p = t[13];
    }
    return p;
  }
  function esp() {}
  function Ujt(e) {
    let t = Fjt.c(36);
    let {
      onAddDirectory: n,
      onCancel: r,
      permissionContext: o,
      directoryPath: s
    } = e;
    let [i, a] = _Ge.useState("");
    let [l, c] = _Ge.useState(null);
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = [];
      t[0] = u;
    } else {
      u = t[0];
    }
    let [d, p] = _Ge.useState(u);
    let [m, f] = _Ge.useState(0);
    let h;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      h = async U => {
        if (!U) {
          p([]);
          f(0);
          return;
        }
        let N = await YLn(U);
        p(N);
        f(0);
      };
      t[1] = h;
    } else {
      h = t[1];
    }
    let y = useDebouncedCallback(h, 100);
    let _;
    let b;
    if (t[2] !== y || t[3] !== i) {
      _ = () => {
        y(i);
      };
      b = [i, y];
      t[2] = y;
      t[3] = i;
      t[4] = _;
      t[5] = b;
    } else {
      _ = t[4];
      b = t[5];
    }
    _Ge.useEffect(_, b);
    let S;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      S = U => {
        let N = U.id + "/";
        a(N);
        c(null);
      };
      t[6] = S;
    } else {
      S = t[6];
    }
    let E = S;
    let C;
    if (t[7] !== n || t[8] !== o) {
      C = async U => {
        let N = await Ict(U, o);
        if (N.resultType === "success") {
          n(N.absolutePath, false);
        } else {
          c(Pct(N));
        }
      };
      t[7] = n;
      t[8] = o;
      t[9] = C;
    } else {
      C = t[9];
    }
    let x = C;
    let A;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      A = {
        context: "Settings"
      };
      t[10] = A;
    } else {
      A = t[10];
    }
    uo("confirm:no", r, A);
    let k;
    if (t[11] !== x || t[12] !== m || t[13] !== d) {
      k = U => {
        if (d.length > 0) {
          if (U.key === "tab") {
            U.preventDefault();
            let N = d[m];
            if (N) {
              E(N);
            }
            return;
          }
          if (U.key === "return") {
            U.preventDefault();
            let N = d[m];
            if (N) {
              x(N.id + "/");
            }
            return;
          }
          if (U.key === "up" || U.ctrl && U.key === "p") {
            U.preventDefault();
            f(N => N <= 0 ? d.length - 1 : N - 1);
            return;
          }
          if (U.key === "down" || U.ctrl && U.key === "n") {
            U.preventDefault();
            f(N => N >= d.length - 1 ? 0 : N + 1);
            return;
          }
        }
      };
      t[11] = x;
      t[12] = m;
      t[13] = d;
      t[14] = k;
    } else {
      k = t[14];
    }
    let I = k;
    let O;
    if (t[15] !== s || t[16] !== n || t[17] !== r) {
      O = U => {
        if (!s) {
          return;
        }
        let N = U;
        e: switch (N) {
          case "yes-session":
            {
              n(s, false);
              break e;
            }
          case "yes-remember":
            {
              n(s, true);
              break e;
            }
          case "no":
            r();
        }
      };
      t[15] = s;
      t[16] = n;
      t[17] = r;
      t[18] = O;
    } else {
      O = t[18];
    }
    let M = O;
    let L;
    if (t[19] !== s) {
      L = s ? undefined : GC.jsxs(Hn, {
        children: [GC.jsx(xt, {
          chord: "tab",
          action: "complete"
        }), GC.jsx(xt, {
          chord: "enter",
          action: "add"
        }), GC.jsx(Wr, {
          action: "confirm:no",
          context: "Settings",
          fallback: "Esc",
          description: "cancel"
        })]
      });
      t[19] = s;
      t[20] = L;
    } else {
      L = t[20];
    }
    let P;
    if (t[21] !== i || t[22] !== s || t[23] !== l || t[24] !== M || t[25] !== x || t[26] !== m || t[27] !== d) {
      P = s ? GC.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [GC.jsx(Qop, {
          path: s
        }), GC.jsx(xr, {
          options: Xop,
          onChange: M,
          onCancel: () => M("no")
        })]
      }) : GC.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [GC.jsx(Sea, {}), GC.jsx(Zop, {
          value: i,
          onChange: a,
          onSubmit: x,
          error: l,
          suggestions: d,
          selectedSuggestion: m
        })]
      });
      t[21] = i;
      t[22] = s;
      t[23] = l;
      t[24] = M;
      t[25] = x;
      t[26] = m;
      t[27] = d;
      t[28] = P;
    } else {
      P = t[28];
    }
    let F;
    if (t[29] !== r || t[30] !== L || t[31] !== P) {
      F = GC.jsx(or, {
        title: "Add directory to workspace",
        onCancel: r,
        color: "permission",
        isCancelActive: false,
        inputGuide: L,
        children: P
      });
      t[29] = r;
      t[30] = L;
      t[31] = P;
      t[32] = F;
    } else {
      F = t[32];
    }
    let H;
    if (t[33] !== I || t[34] !== F) {
      H = GC.jsx(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: I,
        children: F
      });
      t[33] = I;
      t[34] = F;
      t[35] = H;
    } else {
      H = t[35];
    }
    return H;
  }
  var Fjt;
  var _Ge;
  var GC;
  var Xop;
  var joo = __lazy(() => {
    R1n();
    q_();
    et();
    Bs();
    xoo();
    Sd();
    $c();
    Ai();
    Ii();
    bv();
    bs();
    Ljt();
    Fjt = __toESM(pt(), 1);
    _Ge = __toESM(ot(), 1);
    GC = __toESM(ie(), 1);
    Xop = [{
      value: "yes-session",
      label: "Yes, for this session"
    }, {
      value: "yes-remember",
      label: "Yes, and remember this directory"
    }, {
      value: "no",
      label: "No"
    }];
  });
  function Tea(e) {
    let t = Object.keys(e).filter(r => !pFn.vZc(r));
    if (t.length === 0) {
      return e;
    }
    logForDebugging(`[jobs] stripped non-allowlisted providerEnv key(s) from persisted job state: ${t.join(", ")}`, {
      level: "warn"
    });
    let n = d_u(e, (r, o) => pFn.vZc(o));
    return Object.keys(n).length > 0 ? n : undefined;
  }
  function oOe(e) {
    let t = [];
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (!o.startsWith("-")) {
        n.push(o);
        continue;
      }
      let s = o.indexOf("=");
      let i = s === -1 ? o : o.slice(0, s);
      if (s !== -1 && !TG.vZc(i) && $jt.vZc(i)) {
        t.push(i);
        n.push(o);
        continue;
      }
      let a = s === -1 && TG.vZc(i);
      let l = s === -1 ? $jt.vZc(i) || a && e[r + 1] !== undefined : TG.vZc(i);
      let c = l ? t : n;
      if (c.push(o), a && e[r + 1] !== undefined) {
        c.push(e[++r]);
      }
      if (!l || a && bGe.vZc(i)) {
        while (e[r + 1] !== undefined && !e[r + 1].startsWith("-")) {
          c.push(e[++r]);
        }
      }
    }
    if (n.length > 0) {
      logForDebugging(`[jobs] stripped non-allowlisted respawnFlags token(s) from persisted job state: ${n.join(" ")}`, {
        level: "warn"
      });
    }
    return nsp(t);
  }
  function nsp(e) {
    let t = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      let s = o.indexOf("=");
      let i = s === -1 ? o : o.slice(0, s);
      let a = [o];
      if (s === -1 && TG.vZc(i) && e[r + 1] !== undefined) {
        if (a.push(e[++r]), bGe.vZc(i)) {
          while (e[r + 1] !== undefined && !e[r + 1].startsWith("-")) {
            a.push(e[++r]);
          }
        }
      }
      t.push({
        name: i,
        toks: a
      });
    }
    let n = new Map();
    for (let r = 0; r < t.length; r++) {
      let o = t[r];
      if (TG.vZc(o.name) && !bGe.vZc(o.name) && !tsp.vZc(o.name)) {
        n.set(o.name, r);
      }
    }
    return t.filter((r, o) => (n.get(r.name) ?? o) === o).flatMap(r => r.toks);
  }
  function aV(e) {
    let t = [];
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r === "--") {
        for (let s = n; s < e.length; s++) {
          t.push(e[s]);
        }
        break;
      }
      let o = r.startsWith("--") ? r.indexOf("=") : -1;
      if (o !== -1 && (TG.vZc(r.slice(0, o)) || Bjt.vZc(r.slice(0, o)))) {
        t.push(r.slice(0, o + 1) + gut(r.slice(0, o), r.slice(o + 1)));
        continue;
      }
      if (/^-[a-zA-Z].+/.test(r)) {
        let s = 1;
        while (s < r.length - 1 && mFn.vZc(`-${r[s]}`)) {
          s++;
        }
        let i = `-${r[s]}`;
        if (r.length > s + 1 && (TG.vZc(i) || Bjt.vZc(i))) {
          t.push(r.slice(0, s + 1) + gut(i, r.slice(s + 1)));
          continue;
        }
        if (r.length === s + 1 && s > 1 && (TG.vZc(i) || Bjt.vZc(i))) {
          if (t.push(r), TG.vZc(i) && e[n + 1] !== undefined) {
            if (t.push(gut(i, e[++n])), bGe.vZc(i)) {
              while (e[n + 1] !== undefined && !dFn(e[n + 1])) {
                t.push(gut(i, e[++n]));
              }
            }
          } else if (Bjt.vZc(i) && e[n + 1] !== undefined && !dFn(e[n + 1])) {
            t.push(lC(e[++n]));
          }
          continue;
        }
      }
      if (t.push(r), TG.vZc(r) && e[n + 1] !== undefined) {
        if (t.push(gut(r, e[++n])), bGe.vZc(r)) {
          while (e[n + 1] !== undefined && !dFn(e[n + 1])) {
            t.push(gut(r, e[++n]));
          }
        }
      } else if (Bjt.vZc(r) && e[n + 1] !== undefined && !dFn(e[n + 1])) {
        t.push(lC(e[++n]));
      }
    }
    return t;
  }
  function gut(e, t) {
    return rsp.vZc(e) ? t : lC(t);
  }
  function dFn(e) {
    return e.length > 1 && e.startsWith("-");
  }
  var TG;
  var bGe;
  var tsp;
  var $jt;
  var qoo;
  var pFn;
  var rsp;
  var Bjt;
  var mFn;
  var SGe = __lazy(() => {
    ZL();
    mm();
    je();
    lW();
    TG = new Set(["--exec", "--model", "-m", "--permission-mode", "--agent", "--agents", "--routine", "--effort", "--add-dir", "--mcp-config", "--settings", "--setting-sources", "--system-prompt", "--system-prompt-file", "--append-system-prompt", "--append-system-prompt-file", "--fallback-model", "--advisor", "--channels", "--permission-prompt-tool", "--allowed-tools", "--allowedTools", "--disallowed-tools", "--disallowedTools", "--tools", "--session-id", "--debug-file", "-n", "--name", "--autocompact", "--betas", "--file", "--max-budget-usd", "--max-thinking-tokens", "--max-turns", "--task-budget", "--plan-mode-instructions", "--plugin-dir", "--plugin-dir-no-mcp", "--plugin-url", "--resume-session-at", "--rewind-files", "--thinking", "--thinking-display", "--remote-control-session-name-prefix", "--json-schema"]);
    bGe = new Set(["--allowed-tools", "--allowedTools", "--disallowed-tools", "--disallowedTools", "--tools", "--mcp-config", "--betas", "--add-dir", "--file", "--channels"]);
    tsp = new Set(["--plugin-dir", "--plugin-dir-no-mcp", "--plugin-url"]);
    $jt = new Set(["--dangerously-skip-permissions", "--allow-dangerously-skip-permissions", "--strict-mcp-config", "--dangerously-allow-browser-network-access", "--disable-slash-commands", "--verbose", "--reply-on-resume", "--ide", "--chrome", "--no-chrome", "--bare", "--brief", "--remote-control", "--rc"]);
    qoo = [...g1r, ...wPs];
    pFn = new Set(["CLAUDE_CONFIG_DIR", "CLAUDE_INTERNAL_FC_OVERRIDES", ...qoo, ...$te, "AWS_REGION", "AWS_DEFAULT_REGION", "AWS_PROFILE", "AWS_CONFIG_FILE", "AWS_SHARED_CREDENTIALS_FILE", "GOOGLE_APPLICATION_CREDENTIALS", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLAUDE_SECURESTORAGE_CONFIG_DIR", "CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST"]);
    rsp = new Set(["--system-prompt", "--append-system-prompt", "--plan-mode-instructions", "--name", "-n"]);
    Bjt = new Set(["-r", "--resume"]);
    mFn = new Set(["-c", "-p", "-h", "-v"]);
  });
  function jjt(e, t) {
    return n => {
      if (t(n)) {
        return n;
      }
      logForDebugging(`[jobs] dropped malformed ${e} from persisted job state`, {
        level: "warn"
      });
      return;
    };
  }
  function fO() {
    return kb.join(er(), "jobs");
  }
  function dc(e) {
    return kb.join(fO(), e);
  }
  function fT() {
    let e = Me.CLAUDE_JOB_DIR;
    if (e) {
      return kb.basename(e);
    }
    let t = WY();
    if (t) {
      return kb.basename(t.jobDir);
    }
    return getSessionId().slice(0, 8);
  }
  function Cea(e, t) {
    let n = kb.join(dc(e), "state.json");
    let r = false;
    let o = Number.NaN;
    function s(u) {
      if (r) {
        return;
      }
      if (Number.isNaN(o)) {
        o = u;
        return;
      }
      if (u === o) {
        return;
      }
      c();
      t();
    }
    function i() {
      gw.lstat(n).then(u => s(u.mtimeMs), () => s(-1));
    }
    i();
    let a = setInterval(i, 200);
    let l = setTimeout(c, 1e4);
    function c() {
      if (r) {
        return;
      }
      r = true;
      clearInterval(a);
      clearTimeout(l);
    }
    return c;
  }
  function Rea() {
    return Goo > 0;
  }
  async function ip(e, t) {
    let {
      pinned: n,
      sortOrder: r,
      stateSortOrder: o,
      ...s
    } = t;
    Goo++;
    try {
      await Fm(kb.join(e, "state.json"), De(s, null, 2), 384);
    } finally {
      Goo--;
      fS(e);
    }
  }
  function lf(e) {
    let t = en(e);
    if (t && (v6.vZc(t) || t === "ENOENT")) {
      logForDebugging(`[jobs] state write failed (${t}): ${he(e)}`, {
        level: "error"
      });
      return;
    }
    Oe(e);
  }
  function iOe(e, t, n) {
    if (!e) {
      return;
    }
    let r = {
      CLAUDE_BRIDGE_REATTACH_SESSION: e
    };
    if (t !== undefined && t > 0) {
      r.CLAUDE_BRIDGE_REATTACH_SEQ = String(t);
    }
    if (n !== false) {
      r.CLAUDE_BRIDGE_REATTACH_OUTBOUND_ONLY = "1";
    }
    return r;
  }
  function fS(e) {
    Lre.delete(e);
  }
  async function Zi(e) {
    let t = kb.join(e, "state.json");
    let n = kb.join(e, "order");
    let r = kb.join(e, "stateOrder");
    let o;
    let s;
    try {
      let [a, l, c] = await Promise.all([gw.lstat(t), gw.lstat(n).catch(() => null), gw.lstat(r).catch(() => null)]);
      if (!a.isFile() || a.size > 8388608) {
        let d = `rejected:${a.mtimeMs}:${a.size}`;
        if (Lre.get(e)?.mtimeKey === d) {
          return null;
        }
        logForDebugging(`[jobs] skipping ${kb.basename(e)}: state.json is ${a.isFile() ? `too large (${a.size} bytes)` : "not a regular file"}`, {
          level: "warn"
        });
        Lre.set(e, {
          mtimeKey: d,
          state: null
        });
        return null;
      }
      let u = d => d !== null && d.isFile() && d.size <= 8388608;
      s = {
        order: u(l),
        stateOrder: u(c)
      };
      o = `${a.mtimeMs}:${s.order ? l.mtimeMs : 0}:${s.stateOrder ? c.mtimeMs : 0}`;
    } catch (a) {
      if (fn(a)) {
        Lre.delete(e);
        sOe.delete(e);
        return null;
      }
      logForDebugging(`[jobs] ${kb.basename(e)}: state.json stat failed \u2014 ${a instanceof Error ? a.message : String(a)}`, {
        level: "warn"
      });
      let l = Lre.get(e);
      if (!sOe.vZc(e)) {
        sOe.add(e);
        logEvent("tengu_bg_state_read_transient", {
          errno: gd(a) ?? "unknown",
          had_cache: l !== undefined
        });
      }
      return l?.state ?? null;
    }
    let i = Lre.get(e);
    if (i?.mtimeKey === o) {
      sOe.delete(e);
      return i.state;
    }
    try {
      let [a, l, c] = await Promise.all([gw.readFile(t, "utf-8"), s.order ? gw.readFile(n, "utf-8").catch(() => null) : Promise.resolve(null), s.stateOrder ? gw.readFile(r, "utf-8").catch(() => null) : Promise.resolve(null)]);
      let u = qt(a);
      let d = Eea().safeParse(u);
      if (!d.success) {
        logForDebugging(`[jobs] skipping ${kb.basename(e)}: state.json schema validation failed \u2014 ${d.error.message}`, {
          level: "warn"
        });
        Lre.set(e, {
          mtimeKey: o,
          state: null
        });
        return null;
      }
      let p = l !== null ? Number(l) : undefined;
      let m = c !== null ? Number(c) : undefined;
      let f = Eea().in.shape;
      let h = u !== null && typeof u === "object" ? Object.entries(u).filter(([y]) => !Object.hasOwn(f, y)) : [];
      let g = {
        ...Object.fromEntries(h),
        ...d.data
      };
      if (Number.isFinite(p)) {
        g = {
          ...g,
          sortOrder: p
        };
      }
      if (Number.isFinite(m)) {
        g = {
          ...g,
          stateSortOrder: m
        };
      }
      if (Lre.size > 1000) {
        Lre.clear();
      }
      Lre.set(e, {
        mtimeKey: o,
        state: g
      });
      sOe.delete(e);
      return g;
    } catch (a) {
      if (fn(a)) {
        Lre.delete(e);
        sOe.delete(e);
        return null;
      }
      if (logForDebugging(`[jobs] ${kb.basename(e)}: state.json read/parse failed \u2014 ${a instanceof Error ? a.message : String(a)}`, {
        level: "warn"
      }), !sOe.vZc(e)) {
        sOe.add(e);
        logEvent("tengu_bg_state_read_transient", {
          errno: gd(a) ?? "unknown",
          had_cache: i !== undefined
        });
      }
      return i?.state ?? null;
    }
  }
  function qjt() {
    return kb.join(fO(), "pins.json");
  }
  async function TGe() {
    try {
      let e = await gw.lstat(qjt());
      if (!e.isFile() || e.size > 8388608) {
        if (!e.isFile()) {
          await gw.rm(qjt(), {
            recursive: true,
            force: true
          }).catch(() => {});
        }
        return new Set();
      }
      let t = await gw.readFile(qjt(), "utf-8");
      let n = qt(t);
      if (!Array.isArray(n)) {
        return new Set();
      }
      return new Set(n.filter(r => typeof r === "string"));
    } catch (e) {
      if (fn(e)) {
        return ssp();
      }
      return new Set();
    }
  }
  async function ssp() {
    let e;
    try {
      e = await gw.readdir(fO(), {
        withFileTypes: true
      });
    } catch {
      return new Set();
    }
    let t = fO();
    let n = [];
    await Promise.all(e.filter(o => o.isDirectory()).map(o => gw.lstat(kb.join(t, o.name, "pinned")).then(s => {
      if (s.isFile()) {
        n.push(o.name);
      }
    }, () => {})));
    let r = new Set(n);
    await xea(r).catch(o => {
      if (!fn(o)) {
        lf(o);
      }
    });
    return r;
  }
  async function xea(e) {
    let t = qjt();
    await gw.mkdir(kb.dirname(t), {
      recursive: true
    });
    await Fm(t, De([...e], null, 2));
  }
  async function Fue(e, t, n) {
    let r = dc(e);
    let o = await Zi(r);
    if (!o) {
      return false;
    }
    if (o.name === t) {
      return true;
    }
    fS(r);
    let s = (await Zi(r)) ?? o;
    if (s.name === t || n === "auto" && s.name) {
      return true;
    }
    return ip(r, {
      ...s,
      name: t,
      nameSource: n,
      updatedAt: new Date().toISOString()
    }).then(() => true, i => {
      if (!fn(i)) {
        lf(i);
      }
      return false;
    });
  }
  async function fFn(e, t) {
    let n = dc(e);
    let r = await Zi(n);
    if (!r) {
      return false;
    }
    if (r.color === t) {
      return true;
    }
    fS(n);
    let o = (await Zi(n)) ?? r;
    if (o.color === t) {
      return true;
    }
    return ip(n, {
      ...o,
      color: t,
      updatedAt: new Date().toISOString()
    }).then(() => true, s => {
      if (!fn(s)) {
        lf(s);
      }
      return false;
    });
  }
  function zoo() {
    return kea;
  }
  async function Aea(e) {
    let t = Me.CLAUDE_JOB_DIR;
    if (!t || Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return;
    }
    kea = e;
    fS(t);
    let n = await Zi(t);
    let r = n?.worktreePath ? n.originCwd : e;
    if (!n || n.cwd === e && n.originCwd === r) {
      return;
    }
    fS(t);
    let o = (await Zi(t)) ?? n;
    await ip(t, {
      ...o,
      cwd: e,
      originCwd: o.worktreePath ? o.originCwd : e,
      updatedAt: new Date().toISOString()
    }).catch(s => {
      if (!fn(s)) {
        lf(s);
      }
    });
  }
  async function Iea(e, t) {
    let n = Me.CLAUDE_JOB_DIR;
    if (!n || Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return;
    }
    fS(n);
    let r = await Zi(n);
    if (!r || r.resumeSessionId === e && r.linkScanPath === t) {
      return;
    }
    fS(n);
    let o = (await Zi(n)) ?? r;
    await ip(n, {
      ...o,
      resumeSessionId: e,
      linkScanPath: t,
      linkScanOffset: 0,
      updatedAt: new Date().toISOString()
    }).catch(s => {
      if (!fn(s)) {
        lf(s);
      }
    });
  }
  async function aOe(e, t, n) {
    let r = Me.CLAUDE_JOB_DIR;
    if (!r || Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return;
    }
    fS(r);
    let o = await Zi(r);
    if (!o?.respawnFlags) {
      return;
    }
    let s = [e, ...t];
    let i = c => {
      let u = [];
      for (let d = 0; d < c.length; d++) {
        let p = c[d];
        if (s.some(m => p === m || p.startsWith(`${m}=`))) {
          if (p.indexOf("=") === -1 && c[d + 1] !== undefined) {
            d++;
          }
          continue;
        }
        u.push(p);
      }
      return n === null ? u : [...u, e, n];
    };
    let a = i(o.respawnFlags);
    if (a.length === o.respawnFlags.length && a.every((c, u) => c === o.respawnFlags[u])) {
      return;
    }
    fS(r);
    let l = (await Zi(r)) ?? o;
    await ip(r, {
      ...l,
      respawnFlags: i(l.respawnFlags ?? o.respawnFlags),
      updatedAt: new Date().toISOString()
    }).catch(c => {
      if (!fn(c)) {
        lf(c);
      }
    });
  }
  async function Pea(e, t) {
    let n = Me.CLAUDE_JOB_DIR;
    if (!n || Me.CLAUDE_CODE_SESSION_KIND !== "bg") {
      return;
    }
    fS(n);
    let r = await Zi(n);
    if (!r?.respawnFlags) {
      return;
    }
    for (let s = 0; s < r.respawnFlags.length - 1; s++) {
      if (r.respawnFlags[s] === e && r.respawnFlags[s + 1] === t) {
        return;
      }
    }
    fS(n);
    let o = (await Zi(n)) ?? r;
    await ip(n, {
      ...o,
      respawnFlags: [...(o.respawnFlags ?? []), e, t],
      updatedAt: new Date().toISOString()
    }).catch(s => {
      if (!fn(s)) {
        lf(s);
      }
    });
  }
  async function Oea(e, t) {
    await gw.writeFile(kb.join(e, "order"), String(t), "utf-8");
    fS(e);
  }
  async function Dea(e, t) {
    await gw.writeFile(kb.join(e, "stateOrder"), String(t), "utf-8");
    fS(e);
  }
  async function Mea(e) {
    let t = kb.join(fO(), ".order");
    await gw.mkdir(fO(), {
      recursive: true
    });
    await using n = await Ry(t, {
      realpath: false,
      stale: 5000,
      retries: {
        retries: 5,
        minTimeout: 20
      },
      onCompromised: r => logForDebugging(`jobs/.order lock compromised (likely process suspend or slow fs): ${r}`, {
        level: "error"
      })
    });
    return await e();
  }
  function Nea(e, t) {
    let n = vea.then(async () => {
      let r = qjt();
      await gw.mkdir(kb.dirname(r), {
        recursive: true
      });
      await using o = await Ry(r, {
        realpath: false,
        stale: 5000,
        retries: {
          retries: 5,
          minTimeout: 20
        },
        onCompromised: i => logForDebugging(`pins.json lock compromised (likely process suspend or slow fs): ${i}`, {
          level: "error"
        })
      });
      let s = await TGe();
      if (t ? s.vZc(e) : !s.vZc(e)) {
        return;
      }
      if (t) {
        s.add(e);
      } else {
        s.delete(e);
      }
      await xea(s);
    });
    vea = n.catch(() => {});
    return n;
  }
  async function sX(e) {
    let t;
    try {
      t = await gw.readdir(fO(), {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    let [n, r] = await Promise.all([TGe(), Promise.all(t.filter(s => s.isDirectory()).map(async s => {
      let i = await Zi(kb.join(fO(), s.name));
      return i ? {
        id: s.name,
        state: i
      } : null;
    }))]);
    let o = r.filter(s => s !== null).map(s => n.vZc(s.id) ? {
      ...s,
      state: {
        ...s.state,
        pinned: true
      }
    } : s);
    return e ? Wjt(o, e) : o;
  }
  function Wjt(e, t) {
    let n = Date.now();
    return e.map(r => {
      if (Xg(r.state)) {
        return r;
      }
      if (t.vZc(r.id)) {
        return r;
      }
      if (n - Date.parse(r.state.createdAt) < 5000) {
        return r;
      }
      return {
        ...r,
        state: asp(r.state)
      };
    });
  }
  function asp(e) {
    if (e.state === "blocked" && !RSe(e)) {
      return {
        ...e,
        tempo: "blocked",
        inFlight: undefined
      };
    }
    return {
      ...e,
      state: "failed",
      tempo: "idle",
      needs: undefined,
      block: undefined,
      inFlight: undefined,
      detail: e.detail.replace(/; respawning$/, "")
    };
  }
  function Uue(e) {
    let t = new Date().toISOString();
    return {
      state: "working",
      detail: e.detail !== undefined ? Lc(e.detail) : "starting\u2026",
      tempo: e.tempo ?? "active",
      needs: e.needs,
      output: null,
      children: null,
      linkScanOffset: 0,
      template: e.template.name,
      routine: e.routine,
      respawnFlags: e.respawnFlags ?? [],
      bgIsolation: e.bgIsolation,
      providerEnv: e.providerEnv,
      sessionPermissionRules: e.sessionPermissionRules,
      memoryToggledOff: e.memoryToggledOff,
      intent: e.intent,
      displayIntent: e.displayIntent,
      name: e.name,
      nameSource: e.nameSource,
      color: e.template.color,
      initialPrompt: e.template.initialPrompt,
      sessionId: e.sessionId,
      resumeSessionId: e.sessionId,
      daemonShort: e.sessionId.slice(0, 8),
      cwd: e.cwd,
      createdAt: t,
      updatedAt: t,
      firstTerminalAt: null,
      worktreePath: e.worktreePath,
      worktreeBranch: e.worktreeBranch,
      worktreeHookBased: e.worktreeHookBased,
      originCwd: e.originCwd,
      backend: "daemon"
    };
  }
  function Lea(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = new Set(e.map(s => s.id));
    let r = t.filter(s => wea.test(s.short) && !n.vZc(s.short) && s.source !== "spare" && !s.dying);
    if (r.length === 0) {
      return e;
    }
    let o = r.map(s => {
      let i = {
        ...Uue({
          template: {
            name: s.agent ?? "bg",
            description: ""
          },
          routine: s.routine,
          intent: s.intent,
          name: s.name,
          detail: s.detail,
          ...(s.tempo === "active" && (s.state === "running" || yut.includes(s.state)) ? s.routine ? {
            tempo: "idle"
          } : {
            tempo: "blocked",
            needs: "send a prompt to start"
          } : {
            tempo: s.tempo,
            needs: s.needs
          }),
          sessionId: lC(s.sessionId),
          cwd: lC(s.cwd),
          worktreePath: s.worktreePath === undefined ? undefined : lC(s.worktreePath)
        }),
        createdAt: new Date(s.createdAt ?? s.startedAt).toISOString(),
        daemonShort: s.short,
        state: yut.includes(s.state) ? "working" : s.state,
        ...(FI(s.state) && {
          inFlight: {
            tasks: 0,
            queued: 0,
            kinds: []
          }
        })
      };
      let a = dc(s.short);
      gw.mkdir(a, {
        recursive: true
      }).then(() => gw.writeFile(kb.join(a, "state.json"), JSON.stringify(i), {
        flag: "wx",
        mode: 384
      })).then(() => logEvent("tengu_bg_roster_orphan_adopted", {})).catch(l => {
        if (en(l) !== "EEXIST") {
          lf(l);
        }
      });
      return {
        id: s.short,
        state: i
      };
    });
    return [...e, ...o];
  }
  function Fre(e) {
    if (e === "done") {
      return "success";
    }
    if (e === "failed") {
      return "failure";
    }
    if (e === "stopped") {
      return "stopped";
    }
    return null;
  }
  function FI(e) {
    return Fre(e) !== null;
  }
  function Xg(e) {
    return FI(e.state) && e.tempo !== "active";
  }
  function RSe(e) {
    return e.template === "exec" && e.respawnFlags.length === 0;
  }
  function xSe(e) {
    let t = e.originCwd || (e.cwd.match(/^(.+?)[/\\]\.claude[/\\]worktrees[/\\]/)?.[1] ?? e.cwd);
    return lC(t);
  }
  function hFn(e, t) {
    if (e.backend === "remote") {
      return true;
    }
    let n = kb.relative(t, xSe(e));
    return n.split(/[/\\]/, 1)[0] !== ".." && !kb.isAbsolute(n);
  }
  function Gjt(e) {
    let t = n => n?.trim().toLowerCase().startsWith("/loop") ?? false;
    return t(e.intent) || t(e.initialPrompt);
  }
  function lOe(e) {
    return e.routine !== undefined || (e.inFlight?.kinds.includes("session_cron") ?? false) || Gjt(e);
  }
  function EGe(e, t, n, r) {
    let o = dc(e);
    return Zi(o).then(s => {
      if (!s || Xg(s) || t === "failed" && s.state === "blocked" && !RSe(s)) {
        return;
      }
      let i = new Date().toISOString();
      return ip(o, {
        ...s,
        state: t === "crashed" ? "failed" : t,
        detail: t === "stopped" ? "stopped" : t === "failed" ? (s.detail || n).replace(/; respawning$/, "") : n,
        tempo: "idle",
        inFlight: undefined,
        needs: undefined,
        updatedAt: i,
        firstTerminalAt: s.firstTerminalAt ?? i,
        ...(r?.midWork && t === "failed" && {
          reapedMidWorkAt: s.updatedAt
        })
      });
    }).catch(lf);
  }
  var gw;
  var kb;
  var Hjt = () => v.string().transform(lC);
  var wea;
  var osp;
  var Eea;
  var Goo = 0;
  var Lre;
  var sOe;
  var kea;
  var vea;
  var but;
  var yut;
  var zf = __lazy(() => {
    ZL();
    at();
    Ot();
    BT();
    mm();
    je();
    pr();
    gn();
    dt();
    Rn();
    Kv();
    GL();
    SGe();
    gw = require("fs/promises");
    kb = require("path");
    wea = /^[a-f0-9]{8}$/;
    osp = /^(cse_|session_)[A-Za-z0-9_-]{1,128}$/;
    Eea = we(() => v.object({
      state: v.string(),
      detail: v.string(),
      tempo: v.enum(["active", "idle", "blocked"]).optional().catch(undefined),
      inFlight: v.object({
        tasks: v.number(),
        queued: v.number(),
        kinds: v.array(v.string())
      }).optional(),
      fan: v.array(v.object({
        id: v.string().optional(),
        kind: v.enum(["agent", "workflow", "shell", "monitor", "mcp", "todo"]).optional().catch(undefined),
        label: v.string(),
        startedAt: v.number().optional(),
        doneAt: v.number().optional(),
        failed: v.boolean().optional(),
        group: v.string().optional()
      })).optional(),
      budget: v.object({
        spent: v.number(),
        target: v.number()
      }).optional(),
      tokens: v.number().optional(),
      needs_you: v.boolean().optional(),
      needs: v.string().optional(),
      block: v.object({
        questions: v.array(v.object({
          question: v.string(),
          options: v.array(v.object({
            label: v.string(),
            description: v.string()
          }))
        }))
      }).optional(),
      suggestedReply: v.string().optional(),
      output: v.record(v.string(), v.string()).nullable().default(null),
      structuredResult: v.record(v.string(), v.unknown()).optional(),
      children: v.array(v.object({
        id: v.string(),
        href: v.string(),
        kind: v.enum(["pr", "frame"]).optional().catch(undefined)
      })).nullable().default(null),
      linkScanOffset: v.number().default(0),
      linkScanPath: Hjt().transform(jjt("linkScanPath", e => kb.isAbsolute(e) && e.endsWith(".jsonl") && kD(kb.basename(e, ".jsonl")) !== null)).optional(),
      template: v.string(),
      routine: v.string().optional(),
      respawnFlags: v.array(v.string()).default([]).transform(e => aV(oOe(e))),
      bgIsolation: v.enum(["none", "worktree"]).optional().catch(undefined),
      providerEnv: v.record(v.string(), v.string()).transform(e => {
        let t = Tea(e);
        return t && Sbu(t, lC);
      }).optional(),
      sessionPermissionRules: v.object({
        allow: v.array(v.string()),
        deny: v.array(v.string())
      }).optional(),
      memoryToggledOff: v.boolean().optional(),
      intent: v.string(),
      displayIntent: v.string().optional(),
      initialPrompt: v.string().optional(),
      queuedPrompt: v.string().optional(),
      name: v.string().optional(),
      nameSource: v.enum(["user", "auto"]).optional().catch(undefined),
      color: v.string().optional(),
      sessionId: Hjt(),
      resumeSessionId: v.string().transform(jjt("resumeSessionId", e => kD(e) !== null)).optional(),
      daemonShort: v.string().transform(jjt("daemonShort", e => wea.test(e))).optional(),
      cliVersion: v.string().optional(),
      cwd: Hjt(),
      createdAt: v.string(),
      updatedAt: v.string(),
      firstTerminalAt: v.string().nullable().default(null),
      worktreePath: Hjt().optional(),
      worktreeBranch: v.string().optional(),
      worktreeHookBased: v.boolean().optional(),
      originCwd: Hjt().optional(),
      bridgeSessionId: v.string().transform(jjt("bridgeSessionId", e => osp.test(e))).optional(),
      bridgeOutboundOnly: v.boolean().optional(),
      bridgeSessionSeq: v.number().transform(jjt("bridgeSessionSeq", e => Number.isInteger(e) && e >= 0)).optional(),
      backend: v.enum(["daemon", "peer", "remote"]).catch("daemon").default("daemon").transform(e => {
        if (e === "daemon") {
          return e;
        }
        logForDebugging(`[jobs] coerced persisted backend '${e}' to 'daemon' \u2014 peer/remote rows are never written to disk`, {
          level: "warn"
        });
        return "daemon";
      }),
      sock: v.string().optional(),
      pid: v.number().optional(),
      sortOrder: v.number().optional(),
      stateSortOrder: v.number().optional(),
      pinned: v.boolean().optional(),
      reapedMidWorkAt: v.string().optional()
    }).transform(({
      needs_you: e,
      ...t
    }) => ({
      ...t,
      tempo: t.tempo ?? (e ? "blocked" : "idle")
    })));
    Lre = new Map();
    sOe = new Set();
    vea = Promise.resolve();
    but = `(idle \u2014 ${"send a prompt to start"})`;
    yut = ["starting", "resuming", "adopted", "crashed"];
  });
  function gFn(e) {
    return Bl(e) === Fea;
  }
  function Uea(e) {
    let t = `${csp}${e}`;
    return {
      async checkPermissions() {
        return {
          behavior: "ask",
          message: "Claude Preview requires permission.",
          suggestions: [{
            type: "addRules",
            rules: [{
              toolName: t,
              ruleContent: undefined
            }],
            behavior: "allow",
            destination: "session"
          }],
          metadata: {
            command: {
              name: t,
              chrome: {
                hostHandlesOriginConsent: true
              }
            }
          }
        };
      }
    };
  }
  var Fea;
  var csp;
  var Koo = __lazy(() => {
    Fea = Bl("Claude Preview");
    csp = `mcp__${Fea}__`;
  });
  var jea = {};
  __export(jea, {
    trackClaudeInChromeTabId: () => trackClaudeInChromeTabId,
    openInChrome: () => openInChrome,
    isTrackedClaudeInChromeTabId: () => isTrackedClaudeInChromeTabId,
    isInProductPermissionsEnabled: () => isInProductPermissionsEnabled,
    isClaudeInChromeMCPServer: () => isClaudeInChromeMCPServer,
    getSocketDir: () => getSocketDir,
    getSecureSocketPath: () => getSecureSocketPath,
    getAllWindowsRegistryKeys: () => getAllWindowsRegistryKeys,
    getAllSocketPaths: () => getAllSocketPaths,
    getAllNativeMessagingHostsDirs: () => getAllNativeMessagingHostsDirs,
    getAllBrowserDataPaths: () => getAllBrowserDataPaths,
    detectAvailableBrowser: () => detectAvailableBrowser,
    _resetTrackedTabIdsForTesting: () => _resetTrackedTabIdsForTesting,
    CLAUDE_IN_CHROME_MCP_SERVER_NAME: () => "claude-in-chrome",
    CLAUDE_IN_CHROME_DOMAIN_RULE_TOOL: () => "ClaudeInChromeDomain",
    CHROMIUM_BROWSERS: () => CHROMIUM_BROWSERS,
    CFC_TOOL_PREFIX: () => CFC_TOOL_PREFIX,
    BROWSER_DETECTION_ORDER: () => BROWSER_DETECTION_ORDER
  });
  function isInProductPermissionsEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cfc_in_product_permissions", false);
  }
  function getAllBrowserDataPaths() {
    let e = Wt();
    let t = kSe.homedir();
    let n = [];
    for (let r of BROWSER_DETECTION_ORDER) {
      let o = CHROMIUM_BROWSERS[r];
      let s;
      switch (e) {
        case "macos":
          s = o.macos.dataPath;
          break;
        case "linux":
        case "wsl":
          s = o.linux.dataPath;
          break;
        case "windows":
          {
            if (o.windows.dataPath.length > 0) {
              let i = o.windows.useRoaming ? lV.join(t, "AppData", "Roaming") : lV.join(t, "AppData", "Local");
              n.push({
                browser: r,
                path: lV.join(i, ...o.windows.dataPath)
              });
            }
            continue;
          }
      }
      if (s && s.length > 0) {
        n.push({
          browser: r,
          path: lV.join(t, ...s)
        });
      }
    }
    return n;
  }
  function getAllNativeMessagingHostsDirs() {
    let e = Wt();
    let t = kSe.homedir();
    let n = [];
    for (let r of BROWSER_DETECTION_ORDER) {
      let o = CHROMIUM_BROWSERS[r];
      switch (e) {
        case "macos":
          if (o.macos.nativeMessagingPath.length > 0) {
            n.push({
              browser: r,
              path: lV.join(t, ...o.macos.nativeMessagingPath)
            });
          }
          break;
        case "linux":
        case "wsl":
          if (o.linux.nativeMessagingPath.length > 0) {
            n.push({
              browser: r,
              path: lV.join(t, ...o.linux.nativeMessagingPath)
            });
          }
          break;
        case "windows":
          break;
      }
    }
    return n;
  }
  function getAllWindowsRegistryKeys() {
    let e = [];
    for (let t of BROWSER_DETECTION_ORDER) {
      let n = CHROMIUM_BROWSERS[t];
      if (n.windows.registryKey) {
        e.push({
          browser: t,
          key: n.windows.registryKey
        });
      }
    }
    return e;
  }
  async function detectAvailableBrowser() {
    let e = Wt();
    for (let t of BROWSER_DETECTION_ORDER) {
      let n = CHROMIUM_BROWSERS[t];
      switch (e) {
        case "macos":
          {
            let r = `/Applications/${n.macos.appName}.app`;
            try {
              if ((await Yoo.stat(r)).isDirectory()) {
                logForDebugging(`[Claude in Chrome] Detected browser: ${n.name}`);
                return t;
              }
            } catch (o) {
              if (!Io(o)) {
                throw o;
              }
            }
            break;
          }
        case "wsl":
        case "linux":
          {
            for (let r of n.linux.binaries) {
              if (await Qm(r).catch(() => null)) {
                logForDebugging(`[Claude in Chrome] Detected browser: ${n.name}`);
                return t;
              }
            }
            break;
          }
        case "windows":
          {
            let r = kSe.homedir();
            if (n.windows.dataPath.length > 0) {
              let o = n.windows.useRoaming ? lV.join(r, "AppData", "Roaming") : lV.join(r, "AppData", "Local");
              let s = lV.join(o, ...n.windows.dataPath);
              try {
                if ((await Yoo.stat(s)).isDirectory()) {
                  logForDebugging(`[Claude in Chrome] Detected browser: ${n.name}`);
                  return t;
                }
              } catch (i) {
                if (!Io(i)) {
                  throw i;
                }
              }
            }
            break;
          }
      }
    }
    return null;
  }
  function isClaudeInChromeMCPServer(e) {
    return Bl(e) === "claude-in-chrome";
  }
  function trackClaudeInChromeTabId(e) {
    if (Sut.size >= 200 && !Sut.vZc(e)) {
      Sut.clear();
    }
    Sut.add(e);
  }
  function isTrackedClaudeInChromeTabId(e) {
    return Sut.vZc(e);
  }
  function _resetTrackedTabIdsForTesting() {
    Sut.clear();
  }
  async function openInChrome(e) {
    let t = Wt();
    let n = await detectAvailableBrowser();
    if (!n) {
      logForDebugging("[Claude in Chrome] No compatible browser found");
      Ae("chrome_open_url", "no_browser");
      return false;
    }
    let r = CHROMIUM_BROWSERS[n];
    switch (t) {
      case "macos":
        {
          let {
            code: o
          } = await execFileNoThrow("open", ["-a", r.macos.appName, e]);
          if (o === 0) {
            Pe("chrome_open_url");
            return true;
          }
          Ae("chrome_open_url", "exec_failed");
          return false;
        }
      case "windows":
        {
          let {
            code: o
          } = await execFileNoThrow("rundll32", ["url,OpenURL", e]);
          if (o === 0) {
            Pe("chrome_open_url");
            return true;
          }
          Ae("chrome_open_url", "exec_failed");
          return false;
        }
      case "wsl":
      case "linux":
        {
          for (let o of r.linux.binaries) {
            let {
              code: s
            } = await execFileNoThrow(o, [e]);
            if (s === 0) {
              Pe("chrome_open_url");
              return true;
            }
          }
          Ae("chrome_open_url", "exec_failed");
          return false;
        }
      default:
        Ae("chrome_open_url", "exec_failed");
        return false;
    }
  }
  function getSocketDir() {
    return `/tmp/claude-mcp-browser-bridge-${tso()}`;
  }
  function getSecureSocketPath() {
    if (kSe.platform() === "win32") {
      return `\\\\.\\pipe\\${Hea()}`;
    }
    return lV.join(getSocketDir(), `${process.pid}.sock`);
  }
  function getAllSocketPaths() {
    if (kSe.platform() === "win32") {
      return [`\\\\.\\pipe\\${Hea()}`];
    }
    let e = [];
    let t = getSocketDir();
    try {
      let s = Bea.readdirSync(t);
      for (let i of s) {
        if (i.endsWith(".sock")) {
          e.push(lV.join(t, i));
        }
      }
    } catch {}
    let n = `claude-mcp-browser-bridge-${tso()}`;
    let r = lV.join(F2(), n);
    let o = `/tmp/${n}`;
    if (!e.includes(r)) {
      e.push(r);
    }
    if (r !== o && !e.includes(o)) {
      e.push(o);
    }
    return e;
  }
  function Hea() {
    return `claude-mcp-browser-bridge-${tso()}`;
  }
  function tso() {
    try {
      return kSe.userInfo().username || "default";
    } catch {
      return process.env.USER || process.env.USERNAME || "default";
    }
  }
  var Bea;
  var Yoo;
  var kSe;
  var lV;
  var CFC_TOOL_PREFIX;
  var CHROMIUM_BROWSERS;
  var BROWSER_DETECTION_ORDER;
  var Sut;
  var b1 = __lazy(() => {
    ln();
    $n();
    je();
    dt();
    ji();
    Cs();
    BC();
    Bea = require("fs");
    Yoo = require("fs/promises");
    kSe = require("os");
    lV = require("path");
    CFC_TOOL_PREFIX = `mcp__${"claude-in-chrome"}__`;
    CHROMIUM_BROWSERS = {
      chrome: {
        name: "Google Chrome",
        macos: {
          appName: "Google Chrome",
          dataPath: ["Library", "Application Support", "Google", "Chrome"],
          nativeMessagingPath: ["Library", "Application Support", "Google", "Chrome", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["google-chrome", "google-chrome-stable"],
          dataPath: [".config", "google-chrome"],
          nativeMessagingPath: [".config", "google-chrome", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["Google", "Chrome", "User Data"],
          registryKey: "HKCU\\Software\\Google\\Chrome\\NativeMessagingHosts"
        }
      },
      brave: {
        name: "Brave",
        macos: {
          appName: "Brave Browser",
          dataPath: ["Library", "Application Support", "BraveSoftware", "Brave-Browser"],
          nativeMessagingPath: ["Library", "Application Support", "BraveSoftware", "Brave-Browser", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["brave-browser", "brave"],
          dataPath: [".config", "BraveSoftware", "Brave-Browser"],
          nativeMessagingPath: [".config", "BraveSoftware", "Brave-Browser", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["BraveSoftware", "Brave-Browser", "User Data"],
          registryKey: "HKCU\\Software\\BraveSoftware\\Brave-Browser\\NativeMessagingHosts"
        }
      },
      arc: {
        name: "Arc",
        macos: {
          appName: "Arc",
          dataPath: ["Library", "Application Support", "Arc", "User Data"],
          nativeMessagingPath: ["Library", "Application Support", "Arc", "User Data", "NativeMessagingHosts"]
        },
        linux: {
          binaries: [],
          dataPath: [],
          nativeMessagingPath: []
        },
        windows: {
          dataPath: ["Arc", "User Data"],
          registryKey: "HKCU\\Software\\ArcBrowser\\Arc\\NativeMessagingHosts"
        }
      },
      chromium: {
        name: "Chromium",
        macos: {
          appName: "Chromium",
          dataPath: ["Library", "Application Support", "Chromium"],
          nativeMessagingPath: ["Library", "Application Support", "Chromium", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["chromium", "chromium-browser"],
          dataPath: [".config", "chromium"],
          nativeMessagingPath: [".config", "chromium", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["Chromium", "User Data"],
          registryKey: "HKCU\\Software\\Chromium\\NativeMessagingHosts"
        }
      },
      edge: {
        name: "Microsoft Edge",
        macos: {
          appName: "Microsoft Edge",
          dataPath: ["Library", "Application Support", "Microsoft Edge"],
          nativeMessagingPath: ["Library", "Application Support", "Microsoft Edge", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["microsoft-edge", "microsoft-edge-stable"],
          dataPath: [".config", "microsoft-edge"],
          nativeMessagingPath: [".config", "microsoft-edge", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["Microsoft", "Edge", "User Data"],
          registryKey: "HKCU\\Software\\Microsoft\\Edge\\NativeMessagingHosts"
        }
      },
      vivaldi: {
        name: "Vivaldi",
        macos: {
          appName: "Vivaldi",
          dataPath: ["Library", "Application Support", "Vivaldi"],
          nativeMessagingPath: ["Library", "Application Support", "Vivaldi", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["vivaldi", "vivaldi-stable"],
          dataPath: [".config", "vivaldi"],
          nativeMessagingPath: [".config", "vivaldi", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["Vivaldi", "User Data"],
          registryKey: "HKCU\\Software\\Vivaldi\\NativeMessagingHosts"
        }
      },
      opera: {
        name: "Opera",
        macos: {
          appName: "Opera",
          dataPath: ["Library", "Application Support", "com.operasoftware.Opera"],
          nativeMessagingPath: ["Library", "Application Support", "com.operasoftware.Opera", "NativeMessagingHosts"]
        },
        linux: {
          binaries: ["opera"],
          dataPath: [".config", "opera"],
          nativeMessagingPath: [".config", "opera", "NativeMessagingHosts"]
        },
        windows: {
          dataPath: ["Opera Software", "Opera Stable"],
          registryKey: "HKCU\\Software\\Opera Software\\Opera Stable\\NativeMessagingHosts",
          useRoaming: true
        }
      }
    };
    BROWSER_DETECTION_ORDER = ["chrome", "brave", "arc", "edge", "chromium", "vivaldi", "opera"];
    Sut = new Set();
  });
  function wGe(e) {
    return isClaudeInChromeMCPServer(e) || j4e(e) || gFn(e) || e === "workspace";
  }
  var yFn = __lazy(() => {
    Koo();
    b1();
    Cbe();
    EC();
  });
  function msp() {
    return `
- If this is an existing file, you MUST use the ${"Read"} tool first to read the file's contents. This tool will fail if you did not read the file first.`;
  }
  function qea(e) {
    if (_g(e)) {
      return `Writes a file to the local filesystem, overwriting if one exists.

When to use: creating a new file, or fully replacing one you've already ${"Read"}. Overwriting an existing file you haven't ${"Read"} will fail. For partial changes, use ${"Edit"} instead.`;
    }
    return `Writes a file to the local filesystem.

Usage:
- This tool will overwrite the existing file if there is one at the provided path.${msp()}
- Prefer the Edit tool for modifying existing files \u2014 it only sends the diff. Only use this tool to create new files or for complete rewrites.
- NEVER create documentation files (*.md) or README files unless explicitly requested by the User.
- Only use emojis if the user explicitly requests it. Avoid writing emojis to files unless asked.`;
  }
  var mx = __lazy(() => {
    AI();
    Ay();
    Tm();
  });
  function nso(e) {
    return /^\w[\w.@-]*$/.test(e);
  }
  function Py(e, t, n) {
    if (!nso(t)) {
      return null;
    }
    return `claude ${e} ${t}${n ? ` ${n}` : ""}`;
  }
  function rso(e) {
    return e.type === "dependency-unsatisfied" || e.type === "dependency-version-unsatisfied";
  }
  function Wea(e) {
    return rso(e) || e.source.endsWith("@inline") || e.source.startsWith("inline[") || e.source.endsWith("@synced") || e.source.endsWith("@skills-dir");
  }
  function hS(e) {
    switch (e.type) {
      case "generic-error":
        return e.error;
      case "path-not-found":
        return `Path not found: ${e.path} (${e.component}${e.errno ? `, ${e.errno}` : ""})`;
      case "path-traversal":
        return `Path escapes plugin directory: ${e.path} (${e.component})`;
      case "git-auth-failed":
        return `Git authentication failed (${e.authType}): ${e.gitUrl}`;
      case "git-timeout":
        return `Git ${e.operation} timeout: ${e.gitUrl}`;
      case "network-error":
        return `Network error: ${e.url}${e.details ? ` - ${e.details}` : ""}`;
      case "manifest-parse-error":
        return `Manifest parse error: ${e.parseError}`;
      case "manifest-validation-error":
        return `Manifest validation failed: ${e.validationErrors.join(", ")}`;
      case "plugin-not-found":
        return `Plugin ${e.pluginId} not found in marketplace ${e.marketplace}`;
      case "marketplace-not-found":
        return `Marketplace ${e.marketplace} not found`;
      case "marketplace-load-failed":
        return `Marketplace ${e.marketplace} failed to load: ${e.reason}`;
      case "mcp-config-invalid":
        return `MCP server ${e.serverName} invalid: ${e.validationError}`;
      case "hook-load-failed":
        return `Hook load failed: ${e.reason}`;
      case "component-load-failed":
        return `${e.component} load failed from ${e.path}: ${e.reason}`;
      case "mcpb-download-failed":
        return `Failed to download MCPB from ${e.url}: ${e.reason}`;
      case "mcpb-extract-failed":
        return `Failed to extract MCPB ${e.mcpbPath}: ${e.reason}`;
      case "mcpb-invalid-manifest":
        return `MCPB manifest invalid at ${e.mcpbPath}: ${e.validationError}`;
      case "lsp-config-invalid":
        return `Plugin "${e.plugin}" has invalid LSP server config for "${e.serverName}": ${e.validationError}`;
      case "lsp-server-start-failed":
        return `Plugin "${e.plugin}" failed to start LSP server "${e.serverName}": ${e.reason}`;
      case "lsp-server-crashed":
        if (e.signal) {
          return `Plugin "${e.plugin}" LSP server "${e.serverName}" crashed with signal ${e.signal}`;
        }
        return `Plugin "${e.plugin}" LSP server "${e.serverName}" crashed with exit code ${e.exitCode ?? "unknown"}`;
      case "lsp-request-timeout":
        return `Plugin "${e.plugin}" LSP server "${e.serverName}" timed out on ${e.method} request after ${e.timeoutMs}ms`;
      case "lsp-request-failed":
        return `Plugin "${e.plugin}" LSP server "${e.serverName}" ${e.method} request failed: ${e.error}`;
      case "marketplace-blocked-by-policy":
        if (e.blockedByBlocklist) {
          return `Marketplace '${e.marketplace}' is blocked by enterprise policy`;
        }
        return `Marketplace '${e.marketplace}' is not in the allowed marketplace list`;
      case "dependency-unsatisfied":
        {
          let t = Py("plugin install", e.dependency);
          let n = e.reason === "not-enabled" ? "disabled \u2014 enable it or remove the dependency" : `not installed \u2014 ${t ? `run \`${t}\`, or ` : ""}check that its marketplace is added`;
          return `Dependency "${e.dependency}" is ${n}`;
        }
      case "dependency-version-unsatisfied":
        return `Requires "${e.dependency}" ${e.required}, installed ${e.installed ?? "version unknown"}`;
      case "plugin-cache-miss":
        return `Plugin "${e.plugin}" not cached at ${e.installPath} \u2014 run /plugins to refresh`;
      case "plugin-not-installed":
        {
          let t = Py("plugin install", e.source, "--scope project");
          return `Plugin "${e.plugin}" is enabled in project settings but isn't installed${t ? ` \u2014 run \`${t}\`` : " \u2014 install it at project scope (from /plugin or claude plugin install)"}`;
        }
      case "autoupdate-blocked-by-pinner":
        {
          let t = e.heldAt ? ` at ${e.heldAt}` : "";
          let n = e.blockedBy.join(", ");
          let r = e.disabledPinners.length > 0 ? ` (note: ${e.disabledPinners.join(", ")} ${e.disabledPinners.length === 1 ? "is" : "are"} currently disabled)` : "";
          return `Autoupdate held "${e.plugin}"${t} \u2014 version constraint from ${n}${r}`;
        }
    }
  }
  function S1(e) {
    switch (e.type) {
      case "folder-shadowed-by-manifest":
        {
          let t = Gea(e.manifestFields);
          return `Default ${e.component}/ folder is ignored because the manifest sets ${t}`;
        }
      case "mcp-server-suppressed-duplicate":
        {
          let t = e.duplicateOf.startsWith("plugin:") ? `server provided by plugin "${e.duplicateOf.split(":")[1] ?? "?"}"` : `already-configured "${e.duplicateOf}"`;
          return `MCP server "${e.serverName}" skipped \u2014 same command/URL as ${t}`;
        }
      case "plugin-renamed":
        return e.renamedTo === null ? `Removed from the "${e.marketplace}" marketplace` : `Renamed to "${e.renamedTo}" in the "${e.marketplace}" marketplace`;
      case "lsp-extension-conflict":
        {
          let t = e.activeServer.startsWith("plugin:") ? e.activeServer.split(":")[1] : undefined;
          let n = t ? `plugin "${t}"` : `"${e.activeServer}"`;
          return `LSP server "${e.serverName}" is not used for ${e.extension} files \u2014 ${n} already registered a server for that extension`;
        }
      case "project-scope-suppressed-untrusted":
      case "project-scope-server-stripped":
        return e.warning;
      case "broken-wikilink":
        return `${e.raw} in ${e.filePath}:${e.line} doesn't resolve to a skill`;
      case "ineffective-disable":
        return `Disabled in ~/.claude/settings.json but still loads \u2014 ${cY(e.overriddenBy)} settings enable it, which overrides your user setting`;
    }
  }
  function _Fn(e) {
    switch (e.type) {
      case "folder-shadowed-by-manifest":
        {
          let t = Gea(e.manifestFields);
          if (e.manifestFields.length === 1) {
            return `Remove ${t} from .claude-plugin/plugin.json (or SKILL.md frontmatter) to auto-load the folder, or add the folder's files to the ${t} list if you want both`;
          }
          return `Remove ${t} from .claude-plugin/plugin.json (or SKILL.md frontmatter) to auto-load the folder`;
        }
      case "project-scope-suppressed-untrusted":
        return "Accept the trust dialog for this workspace, then run /reload-plugins.";
      case "project-scope-server-stripped":
        return "Monitors from project @skills-dir plugins are not supported \u2014 install the plugin at user scope instead.";
      case "broken-wikilink":
        return e.reason === "invalid" ? "Wikilink names may use letters, digits, dash, underscore \u2014 rename the link" : `Create one of: ${e.tried.join(" or ")}, or fix the link spelling`;
      case "mcp-server-suppressed-duplicate":
        {
          if (e.duplicateOf.startsWith("plugin:")) {
            return `Disable plugin "${e.duplicateOf.split(":")[1] ?? "the other plugin"}" if you want this plugin's version instead`;
          }
          return `Remove "${e.duplicateOf}" from your MCP config if you want the plugin's version instead`;
        }
      case "lsp-extension-conflict":
        {
          let t = e.activeServer.startsWith("plugin:") ? e.activeServer.split(":")[1] ?? "the other plugin" : e.activeServer;
          if (t === e.plugin) {
            return `Plugin "${e.plugin}" declares two LSP servers for ${e.extension} \u2014 remove or reorder "${e.serverName}" in its lspServers config`;
          }
          return `Disable plugin "${t}" to use this plugin's LSP server for ${e.extension} files, or disable "${e.plugin}" to silence this warning`;
        }
      case "plugin-renamed":
        return e.renamedTo === null ? `Remove "${e.source}" from enabledPlugins if you still see this on the next start` : `If you still see this on the next start, update enabledPlugins to use "${e.renamedTo}@${e.marketplace}" (managed settings are not rewritten automatically)`;
      case "ineffective-disable":
        switch (e.overriddenBy) {
          case "projectSettings":
            return `Set "enabledPlugins": {"${e.source}": false} in .claude/settings.local.json instead \u2014 project settings override ~/.claude/settings.json`;
          case "localSettings":
            return "Change it to false in .claude/settings.local.json \u2014 that file currently enables it";
          case "flagSettings":
            return `Remove "${e.source}" from the --settings value \u2014 that flag overrides all settings files`;
          case "policySettings":
            return "Managed policy can't be overridden locally \u2014 contact your administrator";
          case "userSettings":
            return "";
        }
    }
  }
  function Gea(e) {
    return e.map(t => `"${t}"`).join(" and ");
  }
  var cV = __lazy(() => {
    nf();
  });
  async function uV(e, t, {
    concurrency: n = Number.POSITIVE_INFINITY,
    stopOnError: r = true,
    signal: o
  } = {}) {
    return new Promise((s, i) => {
      if (e[Symbol.iterator] === undefined && e[Symbol.asyncIterator] === undefined) {
        throw TypeError(`Expected \`input\` to be either an \`Iterable\` or \`AsyncIterable\`, got (${typeof e})`);
      }
      if (typeof t !== "function") {
        throw TypeError("Mapper function is required");
      }
      if (!(Number.isSafeInteger(n) && n >= 1 || n === Number.POSITIVE_INFINITY)) {
        throw TypeError(`Expected \`concurrency\` to be an integer from 1 and up or \`Infinity\`, got \`${n}\` (${typeof n})`);
      }
      let a = [];
      let l = [];
      let c = new Map();
      let u = false;
      let d = false;
      let p = false;
      let m = 0;
      let f = 0;
      let h = e[Symbol.iterator] === undefined ? e[Symbol.asyncIterator]() : e[Symbol.iterator]();
      let g = () => {
        b(o.reason);
      };
      let y = () => {
        o?.removeEventListener("abort", g);
      };
      let _ = E => {
        s(E);
        y();
      };
      let b = E => {
        u = true;
        d = true;
        i(E);
        y();
      };
      if (o) {
        if (o.aborted) {
          b(o.reason);
        }
        o.addEventListener("abort", g, {
          once: true
        });
      }
      let S = async () => {
        if (d) {
          return;
        }
        let E = await h.next();
        let C = f;
        if (f++, E.done) {
          if (p = true, m === 0 && !d) {
            if (!r && l.length > 0) {
              b(AggregateError(l));
              return;
            }
            if (d = true, c.size === 0) {
              _(a);
              return;
            }
            let x = [];
            for (let [A, k] of a.entries()) {
              if (c.get(A) === Vea) {
                continue;
              }
              x.push(k);
            }
            _(x);
          }
          return;
        }
        m++;
        (async () => {
          try {
            let x = await E.value;
            if (d) {
              return;
            }
            let A = await t(x, C);
            if (A === Vea) {
              c.set(C, A);
            }
            a[C] = A;
            m--;
            await S();
          } catch (x) {
            if (r) {
              b(x);
            } else {
              l.push(x);
              m--;
              try {
                await S();
              } catch (A) {
                b(A);
              }
            }
          }
        })();
      };
      (async () => {
        for (let E = 0; E < n; E++) {
          try {
            await S();
          } catch (C) {
            b(C);
            break;
          }
          if (p || u) {
            break;
          }
        }
      })();
    });
  }
  var Vea;
  var Yjt = __lazy(() => {
    Vea = Symbol("skip");
  });
  function dOe(e, t, n) {
    if (typeof n !== "function") {
      return;
    }
    Object.defineProperty(e, t, {
      get: n,
      enumerable: true,
      configurable: true
    });
  }
  function zea(e) {
    return e.endsWith(`@${"builtin"}`);
  }
  function Kea(e) {
    return oso.get(e);
  }
  function sso() {
    let e = getInitialSettings();
    let t = [];
    let n = [];
    for (let [r, o] of oso) {
      if (o.isAvailable && !o.isAvailable()) {
        continue;
      }
      let s = `${r}@${"builtin"}`;
      let i = e?.enabledPlugins?.[s];
      let a = i !== undefined ? i === true : o.defaultEnabled ?? true;
      let l = {
        name: r,
        manifest: {
          name: r,
          description: o.description,
          version: o.version
        },
        path: "builtin",
        source: s,
        repository: s,
        enabled: a,
        isBuiltin: true,
        hooksConfig: o.hooks,
        mcpServers: o.mcpServers
      };
      if (a) {
        t.push(l);
      } else {
        n.push(l);
      }
    }
    return {
      enabled: t,
      disabled: n
    };
  }
  function Yea() {
    let {
      enabled: e
    } = sso();
    let t = [];
    for (let n of e) {
      let r = oso.get(n.name);
      if (!r?.skills) {
        continue;
      }
      for (let o of r.skills) {
        t.push(fsp(o));
      }
    }
    return t;
  }
  function fsp(e) {
    let t = {
      type: "prompt",
      name: e.name,
      description: typeof e.description === "function" ? "" : e.description,
      hasUserSpecifiedDescription: true,
      allowedTools: e.allowedTools ?? [],
      argumentHint: typeof e.argumentHint === "function" ? undefined : e.argumentHint,
      whenToUse: typeof e.whenToUse === "function" ? undefined : e.whenToUse,
      subcommands: e.subcommands,
      model: e.model,
      disableModelInvocation: e.disableModelInvocation ?? false,
      userInvocable: e.userInvocable ?? true,
      contentLength: 0,
      source: "bundled",
      loadedFrom: "bundled",
      hooks: e.hooks,
      context: e.context,
      agent: e.agent,
      isEnabled: e.isEnabled ?? (() => true),
      requires: e.requires,
      isHidden: !(e.userInvocable ?? true),
      progressMessage: "running",
      getPromptForCommand: e.getPromptForCommand
    };
    dOe(t, "description", e.description);
    dOe(t, "argumentHint", e.argumentHint);
    dOe(t, "whenToUse", e.whenToUse);
    return t;
  }
  var oso;
  var vut = __lazy(() => {
    oso = new Map();
  });
  function bFn() {
    let e = ew();
    if (!e.includes("userSettings")) {
      return [];
    }
    let t = getSettingsForSource("userSettings")?.enabledPlugins;
    if (!t) {
      return [];
    }
    let n = e.filter(o => o !== "userSettings");
    let r = [];
    for (let [o, s] of Object.entries(t)) {
      if (s !== false) {
        continue;
      }
      let i = null;
      for (let a of n) {
        let l = getSettingsForSource(a)?.enabledPlugins?.[o];
        if (l === undefined) {
          continue;
        }
        i = l === false ? null : a;
      }
      if (i === null) {
        continue;
      }
      r.push({
        pluginId: o,
        overriddenBy: i
      });
    }
    return r;
  }
  function hsp(e) {
    switch (e.overriddenBy) {
      case "projectSettings":
        return `To opt out, set "enabledPlugins": {"${e.pluginId}": false} in .claude/settings.local.json.`;
      case "localSettings":
        return "To opt out, change it to false in .claude/settings.local.json (that file currently enables it).";
      case "flagSettings":
        return `This comes from the --settings flag; .claude/settings.local.json won't override it. Remove "${e.pluginId}" from the --settings value.`;
      case "policySettings":
        return "Managed policy can't be overridden locally \u2014 contact your " + "administrator.";
      case "userSettings":
        return "";
    }
  }
  function iso(e) {
    let t = cY(e.overriddenBy);
    return `"${e.pluginId}" is enabled by ${t} settings, which override your user setting. ${hsp(e)}`;
  }
  var aso = __lazy(() => {
    nf();
  });
  function wut(e) {
    return Jea.createHash("sha256").update(e + "claude-plugin-telemetry-v1").digest("hex").slice(0, 16);
  }
  var Jea;
  var lso = __lazy(() => {
    Jea = require("crypto");
  });
  function Xea(e, t) {
    TFn.set(e, t);
  }
  function ysp(e) {
    return TFn.get(e);
  }
  function Zea(e) {
    Qea.add(e);
  }
  function o$(e, t, n, r, o) {
    try {
      let s = _sp(e, t, n);
      if (r) {
        let i = ZN(e);
        if (i === "main" || i === "subagent") {
          if (s.attributionMcpServer = r, o) {
            s.attributionMcpTool = o;
          }
        }
      }
      return s;
    } catch (s) {
      Oe(s);
      return {};
    }
  }
  function _sp(e, t, n) {
    if (!e) {
      return {};
    }
    if (e.startsWith("agent:builtin:")) {
      return {
        attributionAgent: e.slice(14),
        ...SFn(t)
      };
    }
    if (e.startsWith("agent:custom:")) {
      let r = e.slice(13);
      return {
        attributionAgent: r,
        ...SFn(t, nXr(r))
      };
    }
    if (e.startsWith("agent:")) {
      return SFn(t);
    }
    if (ZN(e) === "main" && n) {
      return SFn(n);
    }
    return {};
  }
  function SFn(e, t) {
    if (!e) {
      return t ? {
        attributionPlugin: t
      } : {};
    }
    let n = nXr(e) ?? t;
    return {
      attributionSkill: e,
      ...(n && {
        attributionPlugin: n
      })
    };
  }
  function Xjt(e, t) {
    let n = tta(e, t);
    let r = {};
    if (n.attributionAgent !== undefined) {
      r.attributionAgent = n.attributionAgent;
      let o = Jjt(t.attributionAgent, n.attributionAgent, "custom");
      if (o !== undefined) {
        r.attributionAgentHash = o;
      }
    }
    if (n.attributionSkill !== undefined) {
      r.attributionSkill = n.attributionSkill;
      let o = Jjt(t.attributionSkill, n.attributionSkill, "third-party");
      if (o !== undefined) {
        r.attributionSkillHash = o;
      }
    }
    if (n.attributionPlugin !== undefined) {
      r.attributionPlugin = n.attributionPlugin;
      let o = Jjt(t.attributionPlugin, n.attributionPlugin, "third-party");
      if (o !== undefined) {
        r.attributionPluginHash = o;
      }
    }
    if (n.attributionMcpServer !== undefined) {
      r.attributionMcpServer = n.attributionMcpServer;
      let o = Jjt(t.attributionMcpServer, n.attributionMcpServer, "custom");
      if (o !== undefined) {
        r.attributionMcpServerHash = o;
      }
    }
    if (n.attributionMcpTool !== undefined) {
      r.attributionMcpTool = n.attributionMcpTool;
      let o = Jjt(t.attributionMcpTool, n.attributionMcpTool, "custom");
      if (o !== undefined) {
        r.attributionMcpToolHash = o;
      }
    }
    return r;
  }
  function Jjt(e, t, n) {
    if (t !== n || e === undefined || e === n) {
      return;
    }
    return wut(e);
  }
  function Rut(e, t) {
    let {
      attributionAgent: n,
      attributionSkill: r,
      attributionPlugin: o,
      attributionMcpServer: s,
      attributionMcpTool: i
    } = tta(e, t);
    let a = o ? ysp(o) : undefined;
    return {
      ...(n && {
        "agent.name": n
      }),
      ...(r && {
        "skill.name": r
      }),
      ...(o && {
        "plugin.name": o
      }),
      ...(a && {
        "marketplace.name": a
      }),
      ...(s && {
        "mcp_server.name": s
      }),
      ...(i && {
        "mcp_tool.name": i
      })
    };
  }
  function tta(e, t) {
    try {
      return bsp(e, t);
    } catch (n) {
      Oe(n);
      return {};
    }
  }
  function bsp(e, t) {
    let {
      attributionAgent: n,
      attributionSkill: r,
      attributionPlugin: o,
      attributionMcpServer: s,
      attributionMcpTool: i
    } = t;
    let a = {};
    if (s !== undefined) {
      let l = Qea.vZc(s);
      if (a.attributionMcpServer = l ? Bl(s) : "custom", i !== undefined) {
        a.attributionMcpTool = l ? Bl(i) : "custom";
      }
    }
    if (n !== undefined) {
      if (e?.startsWith("agent:builtin:")) {
        a.attributionAgent = n;
      } else {
        let l = o !== undefined && TFn.vZc(o);
        a.attributionAgent = l ? n : "custom";
      }
    }
    if (o !== undefined) {
      if (TFn.vZc(o)) {
        if (a.attributionPlugin = o, r !== undefined) {
          a.attributionSkill = r;
        }
      } else if (a.attributionPlugin = "third-party", r !== undefined) {
        a.attributionSkill = "third-party";
      }
    } else if (r !== undefined) {
      a.attributionSkill = r;
    }
    return a;
  }
  var TFn;
  var Qea;
  var ASe = __lazy(() => {
    Rn();
    lso();
    TFn = new Map();
    Qea = new Set();
  });
  function UI(e) {
    return e === "inline" || e === "skills-dir";
  }
  function xut(e) {
    return e.scope === "project" && e.source.endsWith(`@${"skills-dir"}`);
  }
  function Yo(e) {
    if (e.includes("@")) {
      let t = e.split("@");
      return {
        name: t[0] || "",
        marketplace: t[1]
      };
    }
    return {
      name: e
    };
  }
  function nta(e, t) {
    return t ? `${e}@${t}` : e;
  }
  function pOe(e, t) {
    return e === t || e.toLowerCase() === t.toLowerCase();
  }
  function Bre(e, t) {
    return e.find(n => n === t) ?? e.find(n => pOe(n, t));
  }
  function BI(e) {
    return e !== undefined && Fke.vZc(e.toLowerCase());
  }
  function uso(e) {
    return BI(e) || e !== undefined && LMt.vZc(e.toLowerCase());
  }
  function rta(e, t) {
    return t === "inline" && Ssp.vZc(e);
  }
  function uM(e) {
    if (e === "managed") {
      throw Error("Cannot install plugins to managed scope");
    }
    return Tsp[e];
  }
  function vFn(e) {
    return cso[e];
  }
  var cso;
  var Ssp;
  var Tsp;
  var Kf = __lazy(() => {
    TC();
    cso = {
      policySettings: "managed",
      userSettings: "user",
      projectSettings: "project",
      localSettings: "local",
      flagSettings: "flag"
    };
    Ssp = new Set(["anthropic-skills", "core", "cowork-plugin-management", "data", "design", "engineering", "enterprise-search", "figma", "finance", "human-resources", "internal-apps", "legal", "marketing", "operations", "product-management", "productivity", "sales", "small-business", "ai-governance-legal", "cocounsel-legal", "commercial-legal", "corporate-legal", "employment-legal", "ip-legal", "law-student", "legal-builder-hub", "legal-clinic", "litigation-legal", "privacy-legal", "product-legal", "regulatory-legal"]);
    Tsp = {
      user: "userSettings",
      project: "projectSettings",
      local: "localSettings"
    };
  });
  function Tq(e) {
    vsp.emit(e);
    let t = Date.now();
    let n = mOe.get(e);
    if (n) {
      n.count++;
      n.lastUsedAt = t;
    } else {
      mOe.set(e, {
        count: 1,
        lastUsedAt: t
      });
    }
    if (!ota) {
      ota = true;
      process.on("exit", sta);
    }
    if (!kut) {
      kut = setTimeout(sta, 60000);
      kut.unref?.();
    }
  }
  function sta() {
    if (kut) {
      clearTimeout(kut);
      kut = null;
    }
    if (mOe.size === 0) {
      return;
    }
    let e = [...mOe.entries()];
    mOe.clear();
    saveGlobalConfig(t => {
      let n = {
        ...t.pluginUsage
      };
      for (let [r, o] of e) {
        let s = n[r];
        n[r] = {
          usageCount: (s?.usageCount ?? 0) + o.count,
          lastUsedAt: o.lastUsedAt,
          lastUsedNumStartups: t.numStartups
        };
      }
      return {
        ...t,
        pluginUsage: n
      };
    });
  }
  function wFn(e) {
    let t = Date.now();
    saveGlobalConfig(n => {
      let r = e.filter(s => !n.pluginUsage?.[s]);
      if (r.length === 0) {
        return n;
      }
      let o = {
        ...n.pluginUsage
      };
      for (let s of r) {
        o[s] = {
          usageCount: 0,
          lastUsedAt: t,
          lastUsedNumStartups: n.numStartups
        };
      }
      return {
        ...n,
        pluginUsage: o
      };
    });
  }
  function Aut(e) {
    let t = new Set(e.map(n => n.toLowerCase()));
    for (let n of mOe.keys()) {
      if (t.vZc(n.toLowerCase())) {
        mOe.delete(n);
      }
    }
    saveGlobalConfig(n => {
      let o = Object.keys(n.pluginUsage ?? {}).filter(i => t.vZc(i.toLowerCase()));
      if (o.length === 0) {
        return n;
      }
      let s = {
        ...n.pluginUsage
      };
      for (let i of o) {
        delete s[i];
      }
      return {
        ...n,
        pluginUsage: s
      };
    });
  }
  function Qjt(e) {
    return getGlobalConfig().pluginUsage?.[e];
  }
  function dso(e) {
    return mOe.vZc(e);
  }
  function ita(e) {
    let t = Date.now();
    saveGlobalConfig(n => {
      let r = e.filter(s => n.pluginUsage?.[s]);
      if (r.length === 0) {
        return n;
      }
      let o = {
        ...n.pluginUsage
      };
      for (let s of r) {
        let i = o[s];
        if (!i) {
          continue;
        }
        o[s] = {
          ...i,
          lastUsedAt: t,
          lastUsedNumStartups: n.numStartups
        };
      }
      return {
        ...n,
        pluginUsage: o
      };
    });
  }
  function Zjt(e, t, n) {
    return {
      sessionsSinceLastUse: Math.max(0, t - e.lastUsedNumStartups),
      daysSinceLastUse: Math.max(0, Math.floor((n - e.lastUsedAt) / 86400000))
    };
  }
  var vsp;
  var mOe;
  var kut = null;
  var ota = false;
  var dV = __lazy(() => {
    ph();
    vsp = Si();
    mOe = new Map();
  });
  function Csp(e) {
    let t = e.indexOf(".");
    let n = e.indexOf(".", t + 1);
    if (t < 0 || n < 0) {
      return null;
    }
    try {
      let r = wsp().safeParse(qt(Buffer.from(e.slice(t + 1, n), "base64url").toString("utf8")));
      return r.success ? r.data : null;
    } catch {
      return null;
    }
  }
  function RFn() {
    let e = getGatewayAuth();
    let t = isGatewayAuthPinned(e) ? e.jwt : undefined;
    if (t === ata) {
      return pso;
    }
    if (ata = t, !t) {
      return CFn = pso;
    }
    let n = Csp(t);
    if (!n) {
      return CFn = pso;
    }
    let r = {
      "identity.source": "gateway-oidc"
    };
    if (n.sub) {
      r["user.id"] = n.sub;
    }
    if (n.email) {
      r["user.email"] = n.email;
    }
    if (n.groups && n.groups.length > 0) {
      r["user.groups"] = n.groups.join(",");
    }
    return CFn = Object.freeze(r);
  }
  var wsp;
  var pso;
  var ata;
  function Rsp(e) {
    let t = BigInt(58);
    let n = Array(22).fill("1");
    let r = 21;
    let o = e;
    while (o > 0n) {
      let s = Number(o % t);
      n[r] = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"[s];
      o = o / t;
      r--;
    }
    return n.join("");
  }
  function xsp(e) {
    let t = e.replaceAll("-", "");
    if (t.length !== 32) {
      throw Error(`Invalid UUID hex length: ${t.length}`);
    }
    return BigInt("0x" + t);
  }
  function lta(e, t) {
    try {
      let n = xsp(t);
      return `${e}_01${Rsp(n)}`;
    } catch {
      return;
    }
  }
  function eqt(e) {
    let t = ksp[e];
    let n = process.env[e];
    if (n === undefined) {
      return t;
    }
    return st(n);
  }
  function cta(e) {
    for (let t = 0; t < e.length; t++) {
      let n = e.charCodeAt(t);
      if (n < 33 || n === 44 || n === 59 || n === 92 || n > 126) {
        return false;
      }
    }
    return true;
  }
  function RGe() {
    let e = getOrCreateUserID();
    let t = getSessionId();
    let n = RFn();
    let r = Object.keys(n).length > 0;
    let o = {};
    if (eqt("OTEL_METRICS_INCLUDE_RESOURCE_ATTRIBUTES")) {
      for (let [i, a] of Object.entries(Asp(Me.OTEL_RESOURCE_ATTRIBUTES))) {
        if (r && (i.startsWith("user.") || i.startsWith("identity."))) {
          continue;
        }
        o[i] = a;
      }
    }
    if (o["user.id"] = e, eqt("OTEL_METRICS_INCLUDE_SESSION_ID")) {
      if (o["session.id"] = t, Me.CLAUDE_CODE_REMOTE_SESSION_ID) {
        o["ccr.session.id"] = Me.CLAUDE_CODE_REMOTE_SESSION_ID;
      }
    }
    if (eqt("OTEL_METRICS_INCLUDE_VERSION")) {
      o["app.version"] = {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION;
    }
    if (eqt("OTEL_METRICS_INCLUDE_ENTRYPOINT")) {
      let i = NN();
      if (i) {
        o["app.entrypoint"] = i;
      }
    }
    let s = getOauthAccountInfo() ?? Isp();
    if (s) {
      let {
        organizationUuid: i,
        emailAddress: a,
        accountUuid: l
      } = s;
      if (i) {
        o["organization.id"] = i;
      }
      if (a) {
        o["user.email"] = a;
      }
      if (l && eqt("OTEL_METRICS_INCLUDE_ACCOUNT_UUID")) {
        o["user.account_uuid"] = l;
        let c = process.env.CLAUDE_CODE_ACCOUNT_TAGGED_ID || lta("user", l);
        if (c) {
          o["user.account_id"] = c;
        }
      }
    }
    if (Object.assign(o, n), nM.terminal) {
      o["terminal.type"] = nM.terminal;
    }
    return o;
  }
  function Isp() {
    if (!Me.CLAUDE_CODE_REMOTE_SESSION_ID) {
      return null;
    }
    let e = Me.CLAUDE_CODE_SESSION_ACCESS_TOKEN;
    if (!e) {
      return null;
    }
    let n = e.replace(/^sk-ant-[a-z0-9]+-/, "").split(".");
    if (n.length !== 3 || !n[1]) {
      return null;
    }
    let r;
    try {
      r = JSON.parse(Buffer.from(n[1], "base64url").toString("utf8"));
    } catch {
      return null;
    }
    let o = i => typeof i === "string" && i.length > 0 ? i : undefined;
    let s = r.act ?? {};
    return {
      organizationUuid: o(r.organization_uuid),
      accountUuid: o(r.account_uuid),
      emailAddress: o(r.account_email) ?? o(s.email)
    };
  }
  var ksp;
  var Asp;
  var xFn = __lazy(() => {
    at();
    no();
    $A();
    pr();
    YW();
    gn();
    ksp = {
      OTEL_METRICS_INCLUDE_SESSION_ID: true,
      OTEL_METRICS_INCLUDE_VERSION: false,
      OTEL_METRICS_INCLUDE_ACCOUNT_UUID: true,
      OTEL_METRICS_INCLUDE_ENTRYPOINT: false,
      OTEL_METRICS_INCLUDE_RESOURCE_ATTRIBUTES: true
    };
    Asp = TEr(e => {
      if (!e) {
        return {};
      }
      let t = {};
      try {
        for (let n of e.split(",")) {
          let [r, o, ...s] = n.split("=");
          if (r === undefined || o === undefined || s.length > 0) {
            continue;
          }
          let i = r.trim();
          let a = o.trim().split(/^"|"$/).join("");
          if (i.length === 0 || i.length > 255 || !cta(i)) {
            throw Error("invalid resource attribute key");
          }
          if (a.length > 255 || !cta(a)) {
            throw Error("invalid resource attribute value");
          }
          t[i] = decodeURIComponent(a);
        }
      } catch {
        return {};
      }
      return t;
    });
  });
  function Osp() {
    return st(process.env.OTEL_LOG_USER_PROMPTS);
  }
  function tqt(e) {
    return Osp() ? e : "<REDACTED>";
  }
  function pta() {
    return Me.OTEL_LOG_ASSISTANT_RESPONSES ?? Me.OTEL_LOG_USER_PROMPTS;
  }
  async function su(e, t = {}) {
    let n = {
      ...RGe(),
      "event.name": e,
      "event.timestamp": new Date().toISOString(),
      "event.sequence": Psp++
    };
    let r = getPromptId();
    if (r) {
      n["prompt.id"] = r;
    }
    let o = process.env.CLAUDE_CODE_WORKSPACE_HOST_PATHS;
    if (o) {
      n["workspace.host_paths"] = o.split("|");
    }
    for (let [l, c] of Object.entries(t)) {
      if (c !== undefined) {
        n[l] = c;
      }
    }
    let s = new Date();
    let i = {
      timestamp: s,
      observedTimestamp: s,
      body: `claude_code.${e}`,
      attributes: n
    };
    let a = getEventLogger();
    if (a) {
      a.emit(i);
      return;
    }
    if (!bufferPendingOTelEvent(i) && !dta) {
      dta = true;
      logForDebugging(`[3P telemetry] Event dropped (no event logger initialized): ${e}`, {
        level: "warn"
      });
    }
  }
  function ISe(e) {
    if (e.from === e.to) {
      return;
    }
    su("permission_mode_changed", {
      from_mode: e.from,
      to_mode: e.to,
      ...(e.trigger && {
        trigger: e.trigger
      })
    });
  }
  function fOe(e) {
    su("compaction", {
      trigger: e.trigger,
      success: String(e.success),
      duration_ms: String(Math.round(e.durationMs)),
      ...(e.preTokens !== undefined && {
        pre_tokens: String(e.preTokens)
      }),
      ...(e.postTokens !== undefined && {
        post_tokens: String(e.postTokens)
      }),
      ...(e.error && {
        error: e.error
      }),
      ...(e.precomputeReuse && {
        precompute_reuse: e.precomputeReuse
      })
    });
  }
  function mta(e) {
    if (fso) {
      return;
    }
    fso = true;
    try {
      let t = e.name !== "Error" ? e.name : e.constructor?.name || "Error";
      su("internal_error", {
        error_name: N$e(t) ?? "Error",
        error_code: gd(e)
      });
    } finally {
      fso = false;
    }
  }
  function XF(e) {
    su("at_mention", {
      mention_type: e.mentionType,
      success: String(e.success)
    });
  }
  function xGe(e) {
    let t = e.error !== undefined ? YS(e.error) : null;
    su("auth", {
      action: e.action,
      success: String(e.success),
      auth_method: e.authMethod,
      ...(t && {
        error_category: t.kind,
        ...(t.status !== undefined && {
          status_code: String(t.status)
        })
      })
    });
  }
  var Psp = 0;
  var dta = false;
  var fso = false;
  var yS = __lazy(() => {
    at();
    je();
    d_();
    gn();
    dt();
    xFn();
  });
  function PSe(e, t) {
    let n = t ? `${e}@${t.toLowerCase()}` : e;
    return wut(n);
  }
  function kGe(e, t, n) {
    if (t === "builtin") {
      return "default-bundle";
    }
    if (BI(t)) {
      return "official";
    }
    if (t !== undefined && LMt.vZc(t.toLowerCase())) {
      return "community";
    }
    if (n?.vZc(e)) {
      return "org";
    }
    return "user-local";
  }
  function hOe(e) {
    return e === "official" || e === "default-bundle";
  }
  function Msp(e) {
    return hOe(e) || e === "community";
  }
  function nqt(e, t, n) {
    let r = t?.type === "prompt" ? t.source : undefined;
    let o = t?.type === "prompt" ? t.pluginInfo : undefined;
    let s = o ? Yo(o.repository).marketplace : undefined;
    let a = r === "builtin" || r === "bundled" || r === "plugin" && BI(s) || bh();
    su("skill_activated", {
      "skill.name": a ? e : "custom_skill",
      invocation_trigger: n,
      ...(r && {
        "skill.source": r
      }),
      ...(t?.kind && {
        "skill.kind": t.kind
      }),
      ...(a && o && {
        "plugin.name": o.pluginManifest.name
      }),
      ...(a && s && {
        "marketplace.name": s
      })
    });
  }
  function OSe(e, t, n, r) {
    return {
      ...(e && {
        skill_source: e
      }),
      ...(t && {
        skill_loaded_from: t
      }),
      ...(n && {
        skill_kind: n
      }),
      ...(r && {
        skill_created_by: r
      })
    };
  }
  function Nsp(e, t) {
    if (t !== "custom") {
      return {};
    }
    return {
      skill_name_hash: wut(e)
    };
  }
  function gso(e, t) {
    if (!e) {
      return {};
    }
    return {
      parent_skill_name_hash: wut(e),
      parent_command_name: t ? e : "custom"
    };
  }
  function Iut({
    rawName: e,
    canonicalName: t,
    isMcp: n,
    isBuiltIn: r,
    isBundled: o,
    isOfficial: s
  }) {
    let i = n ? "mcp" : r || o || s ? e : "custom";
    return {
      sanitizedName: i,
      skillNameHash: Nsp(t, i)
    };
  }
  function yso(e, t, n) {
    if (e.isBuiltin) {
      return "default-enable";
    }
    if (t?.vZc(e.name)) {
      return "org-policy";
    }
    if (n.some(r => e.path.startsWith(r.endsWith(hso.sep) ? r : r + hso.sep))) {
      return "seed-mount";
    }
    return "user-install";
  }
  function Lsp(e, t, n = null) {
    let r = kGe(e, t, n);
    let o = Msp(r) || rta(e, t);
    return {
      plugin_id_hash: PSe(e, t),
      plugin_scope: r,
      plugin_name_redacted: o ? e : "third-party",
      marketplace_name_redacted: o && t ? t : "third-party",
      is_official_plugin: hOe(r)
    };
  }
  function pV(e, t, n = null) {
    return {
      _PROTO_plugin_name: e,
      ...(t && {
        _PROTO_marketplace_name: t
      }),
      ...Lsp(e, t, n)
    };
  }
  function kFn(e, t, n) {
    logEvent("tengu_plugin_folder_shadowed", {
      component: n,
      ...pV(e, t)
    });
  }
  function AFn(e, t, n) {
    logEvent("tengu_plugin_renamed", {
      outcome: n.kind,
      chain_depth: n.kind === "unresolved" ? undefined : n.chainDepth,
      reason: n.kind === "unresolved" ? n.reason : undefined,
      ...pV(e, t)
    });
  }
  function gOe(e, t, n) {
    let r = new Map();
    for (let {
      name: o,
      source: s
    } of t) {
      let i = r.get(o);
      if (i === undefined) {
        r.set(o, [s]);
      } else {
        i.push(s);
      }
    }
    for (let [o, s] of r) {
      let i = Ro(s);
      if (i.length < 2) {
        continue;
      }
      logEvent("tengu_plugin_name_collision", {
        item_type: e,
        _PROTO_skill_name: o,
        item_name_hash: PSe(o),
        source_count: i.length,
        sources: i.sort().join(","),
        ...(n.resolves && {
          winner_source: s.at(-1)
        })
      });
    }
  }
  function Eq(e, t = null) {
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    return pV(n, r, t);
  }
  function DSe(e, t = null) {
    let {
      marketplace: n
    } = Yo(e.repository);
    return pV(e.pluginManifest.name, n, t);
  }
  function fta(e, t) {
    for (let n of e) {
      try {
        let {
          marketplace: r
        } = Yo(n.repository);
        if (hOe(kGe(n.name, r, t))) {
          Xea(n.name, r);
        }
      } catch (r) {
        Oe(r);
      }
    }
  }
  function hta(e, t, n) {
    let r = bh();
    let o = getGlobalConfig().numStartups;
    let s = Date.now();
    let i = [];
    for (let a of e) {
      let {
        marketplace: l
      } = Yo(a.repository);
      let c = Qjt(a.repository);
      if (!c) {
        i.push(a.repository);
      }
      let {
        sessionsSinceLastUse: u,
        daysSinceLastUse: d
      } = c ? Zjt(c, o, s) : {
        sessionsSinceLastUse: 0,
        daysSinceLastUse: 0
      };
      let p = kGe(a.name, l, t);
      let m = yso(a, t, n);
      let f = (a.skillsPath ? 1 : 0) + (a.skillsPaths?.length ?? 0);
      let h = (a.commandsPath ? 1 : 0) + (a.commandsPaths?.length ?? 0);
      let g = (a.agentsPath ? 1 : 0) + (a.agentsPaths?.length ?? 0);
      let y = hOe(p) || r;
      su("plugin_loaded", {
        "plugin.name": y ? a.name : "third-party",
        ...(l && {
          "marketplace.name": y ? l : "third-party"
        }),
        ...(y && a.manifest.version && {
          "plugin.version": a.manifest.version
        }),
        "plugin.scope": p,
        enabled_via: m,
        plugin_id_hash: PSe(a.name, l),
        has_hooks: a.hooksConfig !== undefined,
        has_mcp: !a.skipMcpDiscovery && a.mcpServers !== undefined,
        host_owned_mcp: a.skipMcpDiscovery === true,
        skill_path_count: f,
        command_path_count: h,
        agent_path_count: g,
        safe_mode: String(Ql())
      });
      logEvent("tengu_plugin_enabled_for_session", {
        ...pV(a.name, l, t),
        enabled_via: m,
        skill_path_count: f,
        command_path_count: h,
        agent_path_count: g,
        has_mcp: !a.skipMcpDiscovery && a.mcpServers !== undefined,
        host_owned_mcp: a.skipMcpDiscovery === true,
        has_lsp: a.lspServers !== undefined,
        has_hooks: a.hooksConfig !== undefined,
        has_settings: a.settings !== undefined,
        sessions_since_last_use: u,
        days_since_last_use: d,
        safe_mode: Ql(),
        ...(a.settings && {
          settings_keys: Object.keys(a.settings).sort().join(",")
        }),
        ...(a.manifest.version && {
          version: uS(a.manifest.version)
        })
      });
    }
    if (i.length > 0) {
      wFn(i);
    }
  }
  function iX(e) {
    let t = String(e?.message ?? e);
    if (/ENOTFOUND|ECONNREFUSED|EAI_AGAIN|ETIMEDOUT|ECONNRESET|network|Could not resolve|Connection refused|timed out/i.test(t)) {
      return "network";
    }
    if (/\b404\b|not found|does not exist|no such plugin/i.test(t)) {
      return "not-found";
    }
    if (/\b40[13]\b|EACCES|EPERM|permission denied|unauthorized/i.test(t)) {
      return "permission";
    }
    if (/invalid|malformed|schema|validation|parse error/i.test(t)) {
      return "validation";
    }
    return "unknown";
  }
  function gta(e, t, n) {
    for (let r of e) {
      let {
        name: o,
        marketplace: s
      } = Yo(r.source);
      let i = "plugin" in r && r.plugin ? r.plugin : o;
      logEvent("tengu_plugin_load_failed", {
        error_category: r.type,
        cache_only: n?.cacheOnly ?? false,
        ...("component" in r && {
          component: r.component
        }),
        ...("errno" in r && r.errno && {
          errno: r.errno
        }),
        ...pV(i, s, t)
      });
    }
  }
  var hso;
  var Wk = __lazy(() => {
    Ot();
    Gu();
    gn();
    Rn();
    ASe();
    Kf();
    TC();
    dV();
    yS();
    lso();
    hso = require("path");
  });
  function AGe() {
    let e = {};
    for (let t of getAdditionalDirectoriesForClaudeMd()) {
      for (let n of yta) {
        let {
          settings: r
        } = parseSettingsFile(_so.join(t, ".claude", n));
        if (!r?.enabledPlugins) {
          continue;
        }
        Object.assign(e, r.enabledPlugins);
      }
    }
    return e;
  }
  function bso() {
    let e = {};
    for (let t of getAdditionalDirectoriesForClaudeMd()) {
      for (let n of yta) {
        let {
          settings: r
        } = parseSettingsFile(_so.join(t, ".claude", n));
        if (!r?.extraKnownMarketplaces) {
          continue;
        }
        Object.assign(e, r.extraKnownMarketplaces);
      }
    }
    return e;
  }
  var _so;
  var yta;
  var IFn = __lazy(() => {
    at();
    _so = require("path");
    yta = ["settings.json", "settings.local.json"];
  });
  function IGe(e, t, n) {
    let r = Fsp(t, n);
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return {
        ok: false,
        error: `${r}

Validation errors: manifest must be an object`,
        errors: [{
          path: "",
          message: "manifest must be an object"
        }],
        rawCandidate: null
      };
    }
    let o = {
      ...e
    };
    if (t === "marketplace-entry") {
      delete o.id;
      delete o.source;
      delete o.strict;
    }
    let s = new Set();
    let i = [];
    let a = Cje().safeParse(o);
    if (a.success && i.length === 0) {
      return {
        ok: true,
        manifest: a.data,
        rawCandidate: o
      };
    }
    let l = a.success ? [] : a.error.issues.map(d => {
      let p = d.path.length > 0 ? String(d.path[0]) : "";
      let m = d.path.join(".");
      return {
        path: s.vZc(p) ? `experimental.${m}` : m,
        message: d.message
      };
    });
    let c = [...i, ...l];
    let u = c.map(d => d.path ? `${d.path}: ${d.message}` : d.message).join(", ");
    return {
      ok: false,
      error: `${r}

Validation errors: ${u}`,
      errors: c,
      rawCandidate: o,
      manifest: a.success ? a.data : undefined
    };
  }
  function Fsp(e, t) {
    switch (e) {
      case "plugin-json":
        return `Plugin ${t.pluginName} has an invalid manifest file at ${t.manifestPath}.`;
      case "skill-md":
        return `Skill ${t.pluginName} has invalid plugin-manifest frontmatter at ${t.manifestPath}.`;
      case "marketplace-entry":
        return `Marketplace entry ${t.pluginName} has an invalid manifest.`;
    }
  }
  var PFn = __lazy(() => {
    lQr();
    TC();
  });
  function bta(e) {
    if (e === null || typeof e !== "object") {
      return;
    }
    let t = "dependencies" in e ? e.dependencies : undefined;
    if (!Array.isArray(t)) {
      return;
    }
    let n = new Map();
    for (let r of t) {
      if (r === null || typeof r !== "object") {
        continue;
      }
      let o = "name" in r ? r.name : undefined;
      if (typeof o !== "string" || o.length === 0) {
        continue;
      }
      let s = "version" in r && typeof r.version === "string" ? r.version : undefined;
      let i = "sha" in r && typeof r.sha === "string" ? r.sha : undefined;
      if (s === undefined && i === undefined) {
        continue;
      }
      let a = "marketplace" in r && typeof r.marketplace === "string" ? r.marketplace : undefined;
      let l = a ? `${o}@${a}` : o;
      n.set(l, {
        version: s,
        sha: i
      });
    }
    return n.size > 0 ? n : undefined;
  }
  function T1(e, t) {
    if (Yo(e).marketplace) {
      return e;
    }
    let n = Yo(t).marketplace;
    if (!n || UI(n)) {
      return e;
    }
    return `${e}@${n}`;
  }
  function Sso(e) {
    logForDebugging(`intersectConstraints: ${e} \u2014 treating as too complex`, {
      level: "warn"
    });
    return {
      ok: false,
      reason: "too-complex"
    };
  }
  function oqt(e) {
    if (e.length === 0) {
      return {
        ok: true,
        range: "*"
      };
    }
    let t = 0;
    for (let i of e) {
      t += i.length;
    }
    if (t > 4096) {
      return Sso(`total input ${t} chars > ${4096}`);
    }
    let n = [];
    for (let i of e) {
      let a = aX.validRange(i);
      if (a === null) {
        return {
          ok: false,
          reason: "invalid"
        };
      }
      n.push(a.split("||").map(l => l.trim()).filter(Boolean));
    }
    let r = n[0] ?? [];
    if (r.length > 1024) {
      return Sso(`${r.length} conjuncts after 1/${e.length} inputs > ${1024}`);
    }
    for (let i = 1; i < n.length; i++) {
      let a = n[i] ?? [];
      let l = r.length * a.length;
      if (l > 1024) {
        return Sso(`${l} conjuncts after ${i + 1}/${e.length} inputs > ${1024}`);
      }
      let c = [];
      for (let u of r) {
        for (let d of a) {
          c.push(`${u} ${d}`);
        }
      }
      r = c;
    }
    let o = r.filter(i => {
      let a = aX.validRange(i);
      return a !== null && aX.minVersion(a) !== null;
    });
    if (o.length === 0) {
      return {
        ok: false,
        reason: "disjoint"
      };
    }
    let s = aX.validRange(o.join(" || "));
    return s === null ? {
      ok: false,
      reason: "disjoint"
    } : {
      ok: true,
      range: s
    };
  }
  function rqt(e) {
    return Li(e).replace(Usp, "");
  }
  function Eso(e) {
    if (e.length <= 200) {
      return e;
    }
    return `${e.slice(0, 200)}\u2026 (+${e.length - 200} chars)`;
  }
  function sqt(e, t, n, r, o) {
    let s = Eso(rqt(n.join(", ")));
    let i = rqt(t);
    switch (r) {
      case "disjoint":
        return `${e} "${i}" has conflicting version requirements (no version satisfies all of: ${s})`;
      case "too-complex":
        return `${e} "${i}" has version requirements too complex to intersect \u2014 simplify the ranges: ${s}`;
      case "invalid":
        return `${e} "${i}" has an invalid version requirement among: ${s}`;
      case "installed-unsatisfied":
        return `${e} "${i}" is installed at ${Eso(rqt(o ?? "an unknown version"))}, which does not satisfy: ${s}`;
    }
  }
  function DFn(e, t, n) {
    let r = Eso(rqt(n));
    return `${e} "${rqt(t)}" has no git tag satisfying ${r}`;
  }
  function MFn(e, t) {
    let n = aX.valid(e) ?? aX.coerce(e)?.version;
    return n !== undefined && aX.satisfies(n, t);
  }
  function Sta(e, t) {
    let n = [];
    for (let r of t) {
      if (!r.depConstraints) {
        continue;
      }
      for (let [o, s] of r.depConstraints) {
        if (T1(o, r.source) === e) {
          n.push({
            plugin: r,
            constraint: s
          });
          break;
        }
      }
    }
    return n;
  }
  async function Tta(e, t, n, r = new Set(), o) {
    let s = Yo(e).marketplace;
    let i = [];
    let a = new Set();
    let l = [];
    async function c(d, p) {
      if (d !== e && n.vZc(d) && !o?.vZc(d)) {
        return null;
      }
      let m = Yo(d).marketplace;
      if (!n.vZc(d) && m !== s && !(m && r.vZc(m))) {
        return {
          ok: false,
          reason: "cross-marketplace",
          dependency: d,
          requiredBy: p
        };
      }
      if (l.includes(d)) {
        return {
          ok: false,
          reason: "cycle",
          chain: [...l, d]
        };
      }
      if (a.vZc(d)) {
        return null;
      }
      a.add(d);
      let f = await t(d);
      if (!f) {
        if (d !== e && n.vZc(d)) {
          logForDebugging(`resolveDependencyClosure: force-included ${d} has no catalog entry; skipping (pinner stays demoted)`);
          return null;
        }
        return {
          ok: false,
          reason: "not-found",
          missing: d,
          requiredBy: p
        };
      }
      l.push(d);
      for (let h of f.dependencies ?? []) {
        let g = T1(h, d);
        let y = await c(g, d);
        if (y) {
          return y;
        }
      }
      l.pop();
      i.push(d);
      return null;
    }
    let u = await c(e, e);
    if (u) {
      return u;
    }
    return {
      ok: true,
      closure: i
    };
  }
  function Eta(e) {
    let t = new Set(e.map(c => c.source));
    let n = new Set(e.filter(c => c.enabled).map(c => c.source));
    let r = new Map(e.map(c => [c.source, c]));
    let o = new Set(e.map(c => Yo(c.source).name));
    let s = new Map();
    for (let c of n) {
      let u = Yo(c).name;
      s.set(u, (s.get(u) ?? 0) + 1);
    }
    let i = [];
    let a = true;
    while (a) {
      a = false;
      for (let c of e) {
        if (!n.vZc(c.source)) {
          continue;
        }
        for (let u of c.manifest.dependencies ?? []) {
          let d = T1(u, c.source);
          let p = !Yo(d).marketplace;
          let m = p ? (s.get(d) ?? 0) > 0 : n.vZc(d);
          let f;
          if (!m) {
            f = {
              type: "dependency-unsatisfied",
              source: c.source,
              plugin: c.name,
              dependency: d,
              reason: (p ? o.vZc(d) : t.vZc(d)) ? "not-enabled" : "not-found"
            };
          } else if (!p) {
            let h = c.depConstraints?.get(u)?.version;
            if (h !== undefined) {
              let g = r.get(d);
              let y = g?.resolvedVersion ?? g?.manifest.version;
              if (!MFn(y, h)) {
                f = {
                  type: "dependency-version-unsatisfied",
                  source: c.source,
                  plugin: c.name,
                  dependency: d,
                  required: h,
                  installed: y
                };
              }
            }
          }
          if (f) {
            n.delete(c.source);
            let h = Yo(c.source).name;
            let g = s.get(h) ?? 0;
            if (g <= 1) {
              s.delete(h);
            } else {
              s.set(h, g - 1);
            }
            i.push(f);
            a = true;
            break;
          }
        }
      }
    }
    return {
      demoted: new Set(e.filter(c => c.enabled && !n.vZc(c.source)).map(c => c.source)),
      errors: i
    };
  }
  function NFn(e, t) {
    let {
      name: n
    } = Yo(e);
    return t.filter(r => r.enabled && r.source !== e && (r.manifest.dependencies ?? []).some(o => {
      let s = T1(o, r.source);
      return Yo(s).marketplace ? s === e : s === n;
    })).map(r => r.name);
  }
  function vta(e, t) {
    let n = new Set([e]);
    let r = [];
    let o = new Map();
    for (let i of t) {
      let a = o.get(i.name) ?? [];
      a.push(i.source);
      o.set(i.name, a);
    }
    let s = i => {
      for (let a of NFn(i, t)) {
        for (let l of o.get(a) ?? [a]) {
          if (n.vZc(l)) {
            continue;
          }
          n.add(l);
          s(l);
          r.push(l);
        }
      }
    };
    s(e);
    return r;
  }
  function PGe(e) {
    return new Set(Object.entries(getSettingsForSource(e)?.enabledPlugins ?? {}).filter(([, t]) => t === true || Array.isArray(t)).map(([t]) => t));
  }
  function wta(e, t, n, r) {
    let o = new Set();
    let s = new Set();
    for (let [d, p] of Object.entries(e)) {
      let m = p.find(f => f.scope === n && f.projectPath === r);
      if (!m) {
        continue;
      }
      if (m.auto === true) {
        s.add(d);
      } else {
        o.add(d);
      }
    }
    if (s.size === 0) {
      return {
        orphans: new Set(),
        unloadable: [],
        autoCount: 0
      };
    }
    let i = new Map(t.map(d => [d.source, d]));
    let a = [];
    for (let d of [...o, ...s]) {
      if (!i.vZc(d)) {
        a.push(d);
      }
    }
    if (a.length > 0) {
      return {
        orphans: new Set(),
        unloadable: a,
        autoCount: s.size
      };
    }
    let l = new Set();
    function c(d) {
      if (l.vZc(d)) {
        return;
      }
      l.add(d);
      let p = i.get(d);
      if (!p) {
        return;
      }
      for (let m of p.manifest.dependencies ?? []) {
        c(T1(m, p.source));
      }
    }
    for (let d of o) {
      c(d);
    }
    let u = new Set();
    for (let d of s) {
      if (!l.vZc(d)) {
        u.add(d);
      }
    }
    return {
      orphans: u,
      unloadable: [],
      autoCount: s.size
    };
  }
  function Cta(e, t) {
    if (e.size === 0) {
      return "";
    }
    let n = [...e].map(i => Yo(i).name);
    let r = 5;
    let o = n.length <= r ? n.join(", ") : `${n.slice(0, r).join(", ")}, \u2026`;
    let s = t === "user" ? "" : ` --scope ${t}`;
    return `
${e.size} auto-installed ${un(e.size, "dependency", "dependencies")} no longer needed: ${o}. Run \`claude plugin prune${s}\` to remove.`;
  }
  function $ue(e) {
    if (e.length === 0) {
      return "";
    }
    let t = e.length;
    let n = 5;
    let r = e.map(s => Yo(s).name);
    let o = r.length <= n ? r.join(", ") : `${r.slice(0, n).join(", ")}, \u2026`;
    return ` (+ ${t} ${un(t, "dependency", "dependencies")}: ${o})`;
  }
  function Rta(e, t) {
    if (e.length === 0) {
      return "";
    }
    let n = e.length;
    let r = t.map(s => Yo(s).marketplace).find(s => s !== undefined);
    let o = r !== undefined ? ` Is the "${r}" marketplace added?` : t.length > 0 ? " Add the dependency's marketplace, then re-run install." : "";
    return ` \u2014 ${n} ${un(n, "dependency", "dependencies")} still unresolved: ${e.join(", ")}.${o}`;
  }
  function vso(e) {
    if (!e || e.length === 0) {
      return "";
    }
    return ` \u2014 warning: required by ${e.join(", ")}`;
  }
  function xta(e, t) {
    let n = new Map(t.map(c => [c.source, c]));
    let r = new Map(t.map(c => [c.name, c]));
    let o = c => {
      let u = n.get(c);
      if (u) {
        return u;
      }
      return c.includes("@") ? undefined : r.get(c);
    };
    let s = [];
    let i = [];
    let a = new Set([e]);
    let l = (o(e)?.manifest.dependencies ?? []).map(c => ({
      id: c,
      declaringId: e
    }));
    while (l.length > 0) {
      let c = l.shift();
      if (!c) {
        break;
      }
      let u = T1(c.id, c.declaringId);
      let d = o(u);
      if (!d) {
        if (!a.vZc(u)) {
          a.add(u);
          i.push(u);
        }
        continue;
      }
      if (a.vZc(d.source)) {
        continue;
      }
      a.add(d.source);
      s.push(d.source);
      for (let p of d.manifest.dependencies ?? []) {
        l.push({
          id: p,
          declaringId: d.source
        });
      }
    }
    return {
      closure: s,
      missing: i
    };
  }
  var aX;
  var Usp;
  var MSe = __lazy(() => {
    je();
    Zn();
    Kf();
    aX = __toESM(lq(), 1);
    Usp = /[\x00-\x08\x0b-\x1f\x7f]/g;
  });
  var Put;
  var OGe = __lazy(() => {
    Put = {
      source: "github",
      repo: "anthropics/claude-plugins-official"
    };
  });
  function $sp(e) {
    let t;
    let n = /^[^@/]+@([^:/]+):/.exec(e);
    if (n) {
      t = n[1];
    } else {
      try {
        t = new URL(e).hostname;
      } catch {
        return "unknown";
      }
    }
    let r = t.toLowerCase();
    return Bsp.vZc(r) ? r : "other";
  }
  function Hsp(e) {
    return e.includes(`anthropics/${"claude-plugins-official"}`);
  }
  function dM(e, t, n, r, o) {
    logEvent("tengu_plugin_remote_fetch", {
      source: e,
      host: t ? $sp(t) : "unknown",
      is_official: e === "plugin_catalog" || (t ? Hsp(t) : false),
      outcome: n,
      duration_ms: Math.round(r),
      ...(o && {
        error_kind: o
      })
    });
  }
  function mV(e) {
    let t = String(e?.message ?? e);
    if (/ENOTFOUND|ECONNREFUSED|EAI_AGAIN|Could not resolve host|Connection refused/i.test(t)) {
      return "dns_or_refused";
    }
    if (/ETIMEDOUT|timed out|timeout/i.test(t)) {
      return "timeout";
    }
    if (/ECONNRESET|socket hang up|Connection reset by peer|remote end hung up/i.test(t)) {
      return "conn_reset";
    }
    if (/403|401|authentication|permission denied/i.test(t)) {
      return "auth";
    }
    if (/404|not found|repository not found/i.test(t)) {
      return "not_found";
    }
    if (/certificate|SSL|TLS|unable to get local issuer/i.test(t)) {
      return "tls";
    }
    if (/Invalid response format|Invalid marketplace schema/i.test(t)) {
      return "invalid_schema";
    }
    return "other";
  }
  var Bsp;
  var iqt = __lazy(() => {
    Ot();
    fk();
    OGe();
    Bsp = new Set(["github.com", "raw.githubusercontent.com", "objects.githubusercontent.com", "gist.githubusercontent.com", "gitlab.com", "bitbucket.org", "codeberg.org", "dev.azure.com", "ssh.dev.azure.com", "storage.googleapis.com"]);
  });
  async function jsp(e) {
    try {
      return !!(await Qm(e));
    } catch {
      return false;
    }
  }
  function kta() {
    DGe.cache?.set?.(undefined, Promise.resolve(false));
  }
  var DGe;
  var LFn = __lazy(() => {
    DGe = TEr(async () => jsp("git"));
  });
  function yOe() {
    return st(process.env.CLAUDE_CODE_REMOTE) || st(process.env.CLAUDE_CODE_PLUGIN_PREFER_HTTPS);
  }
  function fV(e = process.env) {
    return {
      ...e,
      ...aqt,
      ...wso(e.GIT_CONFIG_COUNT, [["credential.interactive", "false"]])
    };
  }
  function wso(e, t) {
    let n = Number(e);
    let r = Number.isInteger(n) && n > 0 ? n : 0;
    let o = {
      GIT_CONFIG_COUNT: String(r + t.length)
    };
    t.forEach(([s, i], a) => {
      o[`GIT_CONFIG_KEY_${r + a}`] = s;
      o[`GIT_CONFIG_VALUE_${r + a}`] = i;
    });
    return o;
  }
  var aqt;
  var $re;
  var MGe = __lazy(() => {
    gn();
    aqt = {
      GIT_TERMINAL_PROMPT: "0",
      GIT_ASKPASS: "",
      GCM_INTERACTIVE: "never"
    };
    $re = ["-c", "core.sshCommand=ssh -o BatchMode=yes -o StrictHostKeyChecking=yes"];
  });
  function mo(e, t) {
    if (!process.env.SRT_DEBUG) {
      return;
    }
    let n = t?.level || "info";
    let r = "[SandboxDebug]";
    switch (n) {
      case "error":
        console.error(`${r} ${e}`);
        break;
      case "warn":
        console.warn(`${r} ${e}`);
        break;
      default:
        console.error(`${r} ${e}`);
    }
  }
  async function FFn(e, t, n, r, o) {
    let s;
    let i = t;
    if (!qsp.vZc(t.method ?? "GET")) {
      let c = Cso.Readable.toWeb(t);
      let [u, d] = c.tee();
      s = u;
      i = Cso.Readable.fromWeb(d);
    }
    let a;
    try {
      a = new Request(r, {
        method: t.method,
        headers: Wsp(t),
        signal: o,
        ...(s ? {
          body: s,
          duplex: "half"
        } : {})
      });
    } catch (c) {
      Ata(n, {
        action: "deny",
        reason: `malformed request: ${c.message}`
      });
      s?.cancel();
      i.destroy();
      return null;
    }
    let l;
    try {
      l = await e(a);
    } catch (c) {
      l = {
        action: "deny",
        reason: `filterRequest threw: ${c.message}`
      };
    }
    if (s && !a.bodyUsed) {
      s.cancel();
    }
    if (l.action === "allow") {
      mo(`[request-filter] allow ${t.method} ${r}`);
      return i;
    }
    Ata(n, l);
    i.destroy();
    return null;
  }
  function Ata(e, t) {
    let n = t.reason ?? "denied by filterRequest";
    if (mo(`[request-filter] deny: ${n}`), e.headersSent) {
      e.destroy();
      return;
    }
    e.writeHead(403, {
      "Content-Type": "text/plain",
      "X-Proxy-Error": "blocked-by-sandbox-runtime"
    });
    e.end(n + `
`);
  }
  function Wsp(e) {
    let t = new Headers();
    for (let [n, r] of Object.entries(e.headers)) {
      if (r === undefined) {
        continue;
      }
      if (Array.isArray(r)) {
        for (let o of r) {
          t.append(n, o);
        }
      } else {
        t.append(n, r);
      }
    }
    return t;
  }
  var Cso;
  var qsp;
  var Rso = __lazy(() => {
    Cso = require("stream");
    qsp = new Set(["GET", "HEAD", "OPTIONS"]);
  });