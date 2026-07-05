  function PZr(e) {
    IZr = e ? "focused" : "blurred";
    setTerminalFocusForState(e);
    for (let t of AZr) {
      t();
    }
    if (!e) {
      for (let t of zWi) {
        t();
      }
      zWi.clear();
    }
  }
  function Clt() {
    return IZr !== "blurred";
  }
  function nre() {
    return IZr;
  }
  function EWe(e) {
    AZr.add(e);
    return () => {
      AZr.delete(e);
    };
  }
  var IZr = "unknown";
  var zWi;
  var AZr;
  var vWe = __lazy(() => {
    at();
    zWi = new Set();
    AZr = new Set();
  });
  function OZr(e) {
    return e >= 48 && e <= 126;
  }
  var rre;
  var nG;
  var ore = __lazy(() => {
    rre = {
      NUL: 0,
      SOH: 1,
      STX: 2,
      ETX: 3,
      EOT: 4,
      ENQ: 5,
      ACK: 6,
      BEL: 7,
      BS: 8,
      HT: 9,
      LF: 10,
      VT: 11,
      FF: 12,
      CR: 13,
      SO: 14,
      SI: 15,
      DLE: 16,
      DC1: 17,
      DC2: 18,
      DC3: 19,
      DC4: 20,
      NAK: 21,
      SYN: 22,
      ETB: 23,
      CAN: 24,
      EM: 25,
      SUB: 26,
      ESC: 27,
      FS: 28,
      GS: 29,
      RS: 30,
      US: 31,
      DEL: 127
    };
    nG = {
      CSI: 91,
      OSC: 93,
      DCS: 80,
      APC: 95,
      PM: 94,
      SOS: 88,
      ST: 92
    };
  });
  function KWi(e) {
    return e >= Rlt.PARAM_START && e <= Rlt.PARAM_END;
  }
  function z$t(e) {
    return e >= Rlt.INTERMEDIATE_START && e <= Rlt.INTERMEDIATE_END;
  }
  function YWi(e) {
    return e >= Rlt.FINAL_START && e <= Rlt.FINAL_END;
  }
  function Sg(...e) {
    if (e.length === 0) {
      return DZr;
    }
    if (e.length === 1) {
      return `${DZr}${e[0]}`;
    }
    let t = e.slice(0, -1);
    let n = e.at(-1);
    return `${DZr}${t.join(";")}${n}`;
  }
  function QWi(e = 1) {
    return e === 0 ? "" : Sg(e, "A");
  }
  function NZr(e = 1) {
    return e === 0 ? "" : Sg(e, "B");
  }
  function R6d(e = 1) {
    return e === 0 ? "" : Sg(e, "C");
  }
  function x6d(e = 1) {
    return e === 0 ? "" : Sg(e, "D");
  }
  function CMn(e) {
    return Sg(e, "G");
  }
  function rG(e, t) {
    return Sg(e, t, "H");
  }
  function iue(e, t) {
    let n = "";
    if (e < 0) {
      n += x6d(-e);
    } else if (e > 0) {
      n += R6d(e);
    }
    if (t < 0) {
      n += QWi(-t);
    } else if (t > 0) {
      n += NZr(t);
    }
    return n;
  }
  function ZWi() {
    return Sg("K");
  }
  function RMn(e) {
    if (e <= 0) {
      return "";
    }
    let t = "";
    for (let n = 0; n < e; n++) {
      if (t += QIe, n < e - 1) {
        t += QWi(1);
      }
    }
    t += k6d;
    return t;
  }
  function eGi(e = 1) {
    return e === 0 ? "" : Sg(e, "S");
  }
  function tGi(e = 1) {
    return e === 0 ? "" : Sg(e, "T");
  }
  function LJ(e, t) {
    return Sg(e, t, "r");
  }
  var DZr;
  var Rlt;
  var Cb;
  var JWi;
  var XWi;
  var MZr;
  var k6d;
  var gv;
  var Uay;
  var Bay;
  var QIe;
  var o0;
  var xlt;
  var V8;
  var nGi;
  var rGi;
  var wWe;
  var ZIe;
  var oGi;
  var aue;
  var sGi;
  var Zbe;
  var c1 = __lazy(() => {
    ore();
    DZr = "\x1B" + String.fromCharCode(nG.CSI);
    Rlt = {
      PARAM_START: 48,
      PARAM_END: 63,
      INTERMEDIATE_START: 32,
      INTERMEDIATE_END: 47,
      FINAL_START: 64,
      FINAL_END: 126
    };
    Cb = {
      CUU: 65,
      CUD: 66,
      CUF: 67,
      CUB: 68,
      CNL: 69,
      CPL: 70,
      CHA: 71,
      CUP: 72,
      CHT: 73,
      HPA: 96,
      HPR: 97,
      VPA: 100,
      VPR: 101,
      HVP: 102,
      ED: 74,
      EL: 75,
      ECH: 88,
      IL: 76,
      DL: 77,
      ICH: 64,
      DCH: 80,
      SU: 83,
      SD: 84,
      SM: 104,
      RM: 108,
      SGR: 109,
      DSR: 110,
      DECSCUSR: 113,
      DECSTBM: 114,
      SCOSC: 115,
      SCORC: 117,
      CBT: 90
    };
    JWi = ["toEnd", "toStart", "all", "scrollback"];
    XWi = ["toEnd", "toStart", "all"];
    MZr = [{
      style: "block",
      blinking: true
    }, {
      style: "block",
      blinking: true
    }, {
      style: "block",
      blinking: false
    }, {
      style: "underline",
      blinking: true
    }, {
      style: "underline",
      blinking: false
    }, {
      style: "bar",
      blinking: true
    }, {
      style: "bar",
      blinking: false
    }];
    k6d = Sg("G");
    gv = Sg("H");
    Uay = Sg("s");
    Bay = Sg("u");
    QIe = Sg(2, "K");
    o0 = Sg(2, "J");
    xlt = Sg(3, "J");
    V8 = Sg("r");
    nGi = Sg("200~");
    rGi = Sg("201~");
    wWe = Sg("I");
    ZIe = Sg("O");
    oGi = Sg(">1u");
    aue = Sg("<u");
    sGi = Sg(">4;2m");
    Zbe = Sg(">4m");
  });
  class iGi {
    proc;
    constructor(e = process) {
      this.proc = e;
    }
    isJetBrainsIdeTerminal() {
      return this.proc.env.TERMINAL_EMULATOR === "JetBrains-JediTerm";
    }
    isMicrosoftWindowsTerminal() {
      return this.proc.platform === "win32" && !!this.proc.env.WT_SESSION;
    }
    isGhostty() {
      return this.proc.env.TERM === "xterm-ghostty" || this.proc.env.TERM_PROGRAM === "ghostty";
    }
    isMintty() {
      if (this.proc.env.TERM_PROGRAM === "mintty") {
        return true;
      }
      if (this.proc.platform === "win32" && this.proc.env.MSYSTEM) {
        return true;
      }
      return false;
    }
    windowsConsoleSupportsVirtualTerminalSequences() {
      if (this.isMicrosoftWindowsTerminal()) {
        return true;
      }
      if (this.proc.platform === "win32" && this.proc.env.TERM_PROGRAM === "vscode" && this.proc.env.TERM_PROGRAM_VERSION) {
        return true;
      }
      if (this.isMintty()) {
        return true;
      }
      return false;
    }
    hasGeometricShapesInkBleedBug() {
      return this.isGhostty();
    }
    hasOsc52ClipboardUtf8Bug() {
      if (this.proc.env.TERM_PROGRAM !== "vscode") {
        return false;
      }
      let e = A6d(this.proc.env.TERM_PROGRAM_VERSION);
      return e !== null && e >= 1123000 && e < 1125000;
    }
    macCmdClickArrivesWithoutSgrModifierBit() {
      return this.proc.platform === "darwin" && (this.proc.env.TERM_PROGRAM === "ghostty" || this.proc.env.TERM_PROGRAM === "WarpTerminal");
    }
  }
  function A6d(e) {
    if (!e) {
      return null;
    }
    let t = /^(\d+)\.(\d+)\.(\d+)/.exec(e);
    if (!t) {
      return null;
    }
    return +t[1] * 1e6 + +t[2] * 1000 + +t[3];
  }
  var qF;
  var ePe = __lazy(() => {
    qF = new iGi();
  });
  function cGi() {
    return getAttacherCaps()?.terminal ?? Me.terminal;
  }
  function UZr() {
    let e = getAttacherCaps();
    if (e) {
      return e.mux;
    }
    if (process.env.TMUX) {
      return "tmux";
    }
    if (process.env.STY) {
      return "screen";
    }
    return null;
  }
  function K$t() {
    return getAttacherCaps()?.ssh ?? !!process.env.SSH_CONNECTION;
  }
  function xMn() {
    let e = cGi();
    if (e === "Apple_Terminal") {
      return "Fn";
    }
    if (e === "iTerm.app") {
      return "Option";
    }
    if (getAttacherCaps()?.isVscodeTerm || e && O6d.vZc(e)) {
      return Wt() === "macos" ? "Option" : "Shift";
    }
    if (e && P6d.vZc(e)) {
      return "Shift";
    }
    if (process.env.LC_TERMINAL === "iTerm2") {
      return "Option";
    }
    return K$t() || UZr() !== null || Wt() === "macos" ? "Shift (Option in iTerm2, Fn in Terminal.app)" : "Shift";
  }
  function H_(...e) {
    let t = cGi() === "kitty" ? I6d : "\x07";
    return `${FZr}${e.join(";")}${t}`;
  }
  function s0(e) {
    let t = UZr();
    if (t === "tmux") {
      return `\x1BPtmux;${e.replaceAll("\x1B", "\x1B\x1B")}\x1B\\`;
    }
    if (t === "screen") {
      return `\x1BP${e.replaceAll("\x1B", "\x1B\x1B")}\x1B\\`;
    }
    return e;
  }
  function Y$t() {
    if (!K$t()) {
      switch (Wt()) {
        case "macos":
        case "windows":
        case "wsl":
          return "native";
        case "linux":
          if (typeof sre === "string") {
            return "native";
          }
          break;
      }
    }
    if (process.env.TMUX) {
      return "tmux-buffer";
    }
    return "osc52";
  }
  async function BZr() {
    if (Wt() !== "linux" || typeof sre === "string") {
      return;
    }
    if (process.env.WAYLAND_DISPLAY && (await Qm("wl-copy"))) {
      sre = "wl-copy";
      return;
    }
    if (process.env.DISPLAY) {
      if (await Qm("xclip")) {
        sre = "xclip";
        return;
      }
      if (await Qm("xsel")) {
        sre = "xsel";
        return;
      }
    }
    sre = null;
  }
  function D6d(e) {
    return /[^\x00-\x7f]/.test(e);
  }
  function kMn(e) {
    if (!qF.hasOsc52ClipboardUtf8Bug() || !D6d(e)) {
      return null;
    }
    return "VS Code 1.123/1.124 will mojibake this paste \u2014 update to \u22651.125";
  }
  async function M6d(e) {
    if (!process.env.TMUX) {
      return false;
    }
    let t = {
      input: e,
      useCwd: false,
      timeout: 2000
    };
    let n = process.env.LC_TERMINAL ?? "unset";
    let {
      code: r
    } = await execFileNoThrow("tmux", ["load-buffer", "-w", "-"], t);
    if (logForDebugging(`clipboard: tmux load-buffer -w - \u2192 exit ${r} (LC_TERMINAL=${n})`), r === 0) {
      return true;
    }
    let o = await execFileNoThrow("tmux", ["load-buffer", "-"], t);
    logForDebugging(`clipboard: retry tmux load-buffer - \u2192 exit ${o.code} (LC_TERMINAL=${n})`);
    return o.code === 0;
  }
  async function Uk(e) {
    let t = LZr.Buffer.from(e, "utf8").toString("base64");
    if (!K$t()) {
      uGi(e);
    }
    await M6d(e);
    let n = UZr();
    let r = K$t();
    let o = `${"\x1B"}]52;c;${t}${"\x07"}`;
    let s = n === "tmux" ? "raw+dcs" : n === "screen" ? "dcs" : "raw";
    if (logForDebugging(`clipboard: setClipboard mux=${n ?? "none"} ssh=${r} native=${!r} predicted=${Y$t()} emit=${s} bytes=${e.length}`), n === "tmux") {
      return o + s0(o);
    }
    if (n === "screen") {
      return s0(o);
    }
    return H_(Wh.CLIPBOARD, "c", t);
  }
  function uGi(e) {
    let t = {
      input: e,
      useCwd: false,
      timeout: 2000
    };
    switch (Wt()) {
      case "macos":
        execFileNoThrow("pbcopy", [], t);
        return;
      case "linux":
        if (typeof sre !== "string") {
          BZr().then(() => {
            if (typeof sre === "string") {
              uGi(e);
            }
          });
        } else if (sre === "wl-copy") {
          execFileNoThrow("wl-copy", [], t);
          execFileNoThrow("wl-copy", ["--primary"], t);
        } else if (sre === "xclip") {
          execFileNoThrow("xclip", ["-selection", "clipboard"], t);
          execFileNoThrow("xclip", ["-selection", "primary"], t);
        } else if (sre === "xsel") {
          execFileNoThrow("xsel", ["--clipboard", "--input"], t);
          execFileNoThrow("xsel", ["--primary", "--input"], t);
        }
        return;
      case "wsl":
        {
          execFileNoThrow("powershell.exe", ["-NoProfile", "-NonInteractive", "-Command", "[Console]::InputEncoding = [Text.Encoding]::UTF8; Set-Clipboard -Value ([Console]::In.ReadToEnd())"], t);
          return;
        }
      case "windows":
        {
          execFileNoThrow("powershell", ["-NoProfile", "-NonInteractive", "-Command", "[Console]::InputEncoding = [Text.Encoding]::UTF8; Set-Clipboard -Value ([Console]::In.ReadToEnd())"], t);
          return;
        }
    }
  }
  async function J$t(e = "clipboard") {
    if (K$t()) {
      return "";
    }
    let t = {
      useCwd: false,
      timeout: 2000
    };
    switch (Wt()) {
      case "macos":
        {
          let n = await execFileNoThrow("pbpaste", [], t);
          return n.code === 0 ? n.stdout : "";
        }
      case "windows":
      case "wsl":
        {
          let n = await execFileNoThrow(Wt() === "wsl" ? "powershell.exe" : "powershell", ["-NoProfile", "-NonInteractive", "-Command", "[Console]::OutputEncoding = [Text.Encoding]::UTF8; Get-Clipboard -Raw"], t);
          return n.code === 0 ? n.stdout.replace(/\r\n/g, `
`).replace(/\n$/, "") : "";
        }
      case "linux":
        {
          let n = e === "primary";
          let r = [["wl-paste", n ? ["--primary", "--no-newline"] : ["--no-newline"]], ["xclip", ["-selection", n ? "primary" : "clipboard", "-o"]], ["xsel", [n ? "--primary" : "--clipboard", "--output"]]];
          for (let [o, s] of r) {
            let i = await execFileNoThrow(o, [...s], t);
            if (i.code === 0) {
              return i.stdout;
            }
          }
          return "";
        }
      default:
        return "";
    }
  }
  function dGi(e) {
    let t = e.indexOf(";");
    let n = t >= 0 ? e.slice(0, t) : e;
    let r = t >= 0 ? e.slice(t + 1) : "";
    let o = parseInt(n, 10);
    if (o === Wh.SET_TITLE_AND_ICON) {
      return {
        type: "title",
        action: {
          type: "both",
          title: r
        }
      };
    }
    if (o === Wh.SET_ICON) {
      return {
        type: "title",
        action: {
          type: "iconName",
          name: r
        }
      };
    }
    if (o === Wh.SET_TITLE) {
      return {
        type: "title",
        action: {
          type: "windowTitle",
          title: r
        }
      };
    }
    if (o === Wh.HYPERLINK) {
      let s = r.split(";");
      let i = s[0] ?? "";
      let a = s.slice(1).join(";");
      if (a === "") {
        return {
          type: "link",
          action: {
            type: "end"
          }
        };
      }
      let l = {};
      if (i) {
        for (let c of i.split(":")) {
          let u = c.indexOf("=");
          if (u >= 0) {
            l[c.slice(0, u)] = c.slice(u + 1);
          }
        }
      }
      return {
        type: "link",
        action: {
          type: "start",
          url: a,
          params: Object.keys(l).length > 0 ? l : undefined
        }
      };
    }
    if (o === Wh.TAB_STATUS) {
      return {
        type: "tabStatus",
        action: L6d(r)
      };
    }
    return {
      type: "unknown",
      sequence: `\x1B]${e}`
    };
  }
  function lGi(e) {
    let t = e.match(/^#([0-9a-f]{2})([0-9a-f]{2})([0-9a-f]{2})$/i);
    if (t) {
      return {
        type: "rgb",
        r: parseInt(t[1], 16),
        g: parseInt(t[2], 16),
        b: parseInt(t[3], 16)
      };
    }
    let n = e.match(/^rgb:([0-9a-f]{1,4})\/([0-9a-f]{1,4})\/([0-9a-f]{1,4})$/i);
    if (n) {
      let r = o => Math.round(parseInt(o, 16) / (16 ** o.length - 1) * 255);
      return {
        type: "rgb",
        r: r(n[1]),
        g: r(n[2]),
        b: r(n[3])
      };
    }
    return null;
  }
  function L6d(e) {
    let t = {};
    for (let [n, r] of F6d(e)) {
      switch (n) {
        case "indicator":
          t.indicator = r === "" ? null : lGi(r);
          break;
        case "status":
          t.status = r === "" ? null : r;
          break;
        case "status-color":
          t.statusColor = r === "" ? null : lGi(r);
          break;
      }
    }
    return t;
  }
  function* F6d(e) {
    let t = "";
    let n = "";
    let r = false;
    let o = false;
    for (let s of e) {
      if (o) {
        if (r) {
          n += s;
        } else {
          t += s;
        }
        o = false;
      } else if (s === "\\") {
        o = true;
      } else if (s === ";") {
        yield [t, n];
        t = "";
        n = "";
        r = false;
      } else if (s === "=" && !r) {
        r = true;
      } else if (r) {
        n += s;
      } else {
        t += s;
      }
    }
    if (t || r) {
      yield [t, n];
    }
  }
  function klt(e, t) {
    if (!e) {
      return CWe;
    }
    let n = {
      id: U6d(e),
      ...t
    };
    let r = Object.entries(n).map(([o, s]) => `${o}=${s}`).join(":");
    return H_(Wh.HYPERLINK, r, e);
  }
  function U6d(e) {
    let t = 0;
    for (let n = 0; n < e.length; n++) {
      t = (t << 5) - t + e.charCodeAt(n) | 0;
    }
    return (t >>> 0).toString(36);
  }
  function supportsTabStatus() {
    return false;
  }
  function mGi(e) {
    let t = [];
    let n = r => r.type === "rgb" ? `#${[r.r, r.g, r.b].map(o => o.toString(16).padStart(2, "0")).join("")}` : "";
    if ("indicator" in e) {
      t.push(`indicator=${e.indicator ? n(e.indicator) : ""}`);
    }
    if ("status" in e) {
      t.push(`status=${e.status?.replaceAll("\\", "\\\\").replaceAll(";", "\\;") ?? ""}`);
    }
    if ("statusColor" in e) {
      t.push(`status-color=${e.statusColor ? n(e.statusColor) : ""}`);
    }
    return H_(Wh.TAB_STATUS, t.join(";"));
  }
  function fGi(e) {
    let t = LZr.Buffer.from(JSON.stringify(e)).toString("base64");
    return H_(Wh.ITERM2_PROPRIETARY, `SetProfileProperty=Initial Text=${t}`);
  }
  var LZr;
  var FZr;
  var I6d;
  var P6d;
  var O6d;
  var sre;
  var Wh;
  var CWe;
  var RWe;
  var xWe;
  var AMn;
  var pGi;
  var IMn;
  var B6d;
  var Tg = __lazy(() => {
    at();
    je();
    pr();
    ji();
    Cs();
    ePe();
    ore();
    LZr = require("buffer");
    FZr = "\x1B" + String.fromCharCode(nG.OSC);
    I6d = "\x1B" + "\\";
    P6d = new Set(["ghostty", "kitty", "WezTerm", "alacritty", "xterm", "gnome-terminal", "vte-based", "konsole", "windows-terminal", "mintty", ...N6]);
    O6d = new Set(["vscode", "cursor", "windsurf", "antigravity", "codium"]);
    Wh = {
      SET_TITLE_AND_ICON: 0,
      SET_ICON: 1,
      SET_TITLE: 2,
      SET_COLOR: 4,
      SET_CWD: 7,
      HYPERLINK: 8,
      ITERM2: 9,
      SET_FG_COLOR: 10,
      SET_BG_COLOR: 11,
      SET_CURSOR_COLOR: 12,
      CLIPBOARD: 52,
      KITTY: 99,
      RESET_COLOR: 104,
      RESET_FG_COLOR: 110,
      RESET_BG_COLOR: 111,
      RESET_CURSOR_COLOR: 112,
      SEMANTIC_PROMPT: 133,
      GHOSTTY: 777,
      ITERM2_PROPRIETARY: 1337,
      TAB_STATUS: 21337
    };
    CWe = H_(Wh.HYPERLINK, "", "");
    RWe = {
      NOTIFY: 0,
      BADGE: 2,
      PROGRESS: 4
    };
    xWe = {
      CLEAR: 0,
      SET: 1,
      ERROR: 2,
      INDETERMINATE: 3
    };
    AMn = `${FZr}${Wh.ITERM2};${RWe.PROGRESS};${xWe.CLEAR};${"\x07"}`;
    pGi = `${FZr}${Wh.SET_TITLE_AND_ICON};${"\x07"}`;
    IMn = H_(Wh.TAB_STATUS, "indicator=;status=;status-color=");
    B6d = fGi("");
  });
  function hGi(e) {
    return {
      request: Sg(`?${e}$p`),
      match: t => t.type === "decrpm" && t.mode === e
    };
  }
  function gGi() {
    return {
      request: Sg("?6n"),
      match: e => e.type === "cursorPosition"
    };
  }
  function yGi(e) {
    return {
      request: H_(e, "?"),
      match: t => t.type === "osc" && t.code === e
    };
  }
  function _Gi() {
    return {
      request: Sg(">0q"),
      match: e => e.type === "xtversion"
    };
  }
  class $Zr {
    stdout;
    queue = [];
    constructor(e) {
      this.stdout = e;
    }
    send(e) {
      return new Promise(t => {
        this.queue.push({
          kind: "query",
          match: e.match,
          resolve: n => t(n)
        });
        this.stdout.write(e.request);
      });
    }
    flush() {
      return new Promise(e => {
        this.queue.push({
          kind: "sentinel",
          resolve: e
        });
        this.stdout.write($6d);
      });
    }
    cancel(e) {
      let t = this.queue.findIndex(r => r.kind === "query" && r.match === e.match);
      if (t === -1) {
        return;
      }
      let [n] = this.queue.splice(t, 1);
      if (n?.kind === "query") {
        n.resolve(undefined);
      }
    }
    onResponse(e) {
      let t = this.queue.findIndex(n => n.kind === "query" && n.match(e));
      if (t !== -1) {
        let [n] = this.queue.splice(t, 1);
        if (n?.kind === "query") {
          n.resolve(e);
        }
        return;
      }
      if (e.type === "da1") {
        let n = this.queue.findIndex(r => r.kind === "sentinel");
        if (n === -1) {
          return;
        }
        for (let r of this.queue.splice(0, n + 1)) {
          if (r.kind === "query") {
            r.resolve(undefined);
          } else {
            r.resolve();
          }
        }
      }
    }
  }
  var $6d;
  var PMn = __lazy(() => {
    c1();
    Tg();
    $6d = Sg("c");
  });
  function bGi(e) {
    HZr.add(e);
    return () => {
      HZr.delete(e);
    };
  }
  function SGi() {
    for (let e of HZr) {
      e();
    }
  }
  var HZr;
  var jZr = __lazy(() => {
    HZr = new Set();
  });
  function H6d() {
    return {
      loggedTmuxCcDisable: false,
      loggedWinSshDisable: false,
      checkedTmuxMouseHint: false,
      checkedTmuxFocusHint: false,
      tmuxControlModeProbed: undefined,
      gbGateCached: undefined,
      downsellGateCached: undefined
    };
  }
  function j6d() {
    if (!process.env.TMUX) {
      return false;
    }
    if (process.env.TERM_PROGRAM !== "iTerm.app") {
      return false;
    }
    let e = process.env.TERM ?? "";
    return !e.startsWith("screen") && !e.startsWith("tmux");
  }
  function q6d(e) {
    if (e.tmuxControlModeProbed = j6d(), e.tmuxControlModeProbed) {
      return;
    }
    if (!process.env.TMUX) {
      return;
    }
    if (process.env.TERM_PROGRAM) {
      return;
    }
    let t = resolveExecutableSafely("tmux");
    if (t === null) {
      return;
    }
    let n;
    try {
      n = EGi.spawnSync(t, ["display-message", "-p", "#{client_control_mode}"], {
        encoding: "utf8",
        timeout: 2000,
        cwd: undefined,
        env: process.env,
        windowsHide: true
      });
    } catch {
      return;
    }
    if (n.status !== 0) {
      return;
    }
    e.tmuxControlModeProbed = n.stdout.trim() === "1";
  }
  function are(e = ire) {
    if (e.tmuxControlModeProbed === undefined) {
      q6d(e);
    }
    return e.tmuxControlModeProbed ?? false;
  }
  function qZr() {
    if (Wt() !== "windows") {
      return false;
    }
    return Boolean(process.env.SSH_CONNECTION || process.env.SSH_CLIENT || process.env.SSH_TTY);
  }
  function WZr() {
    return Me.CLAUDE_CODE_NO_FLICKER === false || st(process.env.CLAUDE_CODE_DISABLE_ALTERNATE_SCREEN);
  }
  function qs(e = ire) {
    if (NN() === "local-agent") {
      return false;
    }
    if (process.env.CLAUDE_CODE_SESSION_KIND === "bg") {
      return true;
    }
    if (tM()) {
      return false;
    }
    if (WZr()) {
      return false;
    }
    if (Me.CLAUDE_CODE_NO_FLICKER === true) {
      return true;
    }
    if (are(e)) {
      if (!e.loggedTmuxCcDisable) {
        e.loggedTmuxCcDisable = true;
        logForDebugging("fullscreen disabled: tmux -CC (iTerm2 integration mode) detected \xB7 set CLAUDE_CODE_NO_FLICKER=1 to override");
      }
      return false;
    }
    if (qZr()) {
      if (!e.loggedWinSshDisable) {
        e.loggedWinSshDisable = true;
        logForDebugging("fullscreen disabled: Windows over SSH (ConPTY re-rendering) detected \xB7 set CLAUDE_CODE_NO_FLICKER=1 to override");
      }
      return false;
    }
    switch (getInitialSettings().tui) {
      case "fullscreen":
        return true;
      case "default":
        return false;
    }
    if (W6d(e)) {
      return true;
    }
    e.gbGateCached ??= getFeatureValue_CACHED_MAY_BE_STALE("tengu_pewter_brook", false);
    return e.gbGateCached;
  }
  function W6d(e = ire) {
    e.downsellGateCached ??= getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_creek", false);
    return e.downsellGateCached;
  }
  function X$t(e = ire) {
    if (tM()) {
      return false;
    }
    if (WZr()) {
      return false;
    }
    if (Me.CLAUDE_CODE_NO_FLICKER === true) {
      return true;
    }
    if (qZr()) {
      return false;
    }
    if (are(e)) {
      return false;
    }
    switch (getInitialSettings().tui) {
      case "fullscreen":
        return true;
      case "default":
        return false;
    }
    return true;
  }
  function tPe(e = ire) {
    if (process.env.CLAUDE_CODE_SESSION_KIND === "bg") {
      return "bg_forced_on";
    }
    if (tM()) {
      return "sr_auto_off";
    }
    if (WZr()) {
      return "env_off";
    }
    if (Me.CLAUDE_CODE_NO_FLICKER === true) {
      return "env_on";
    }
    if (are(e)) {
      return "tmux_cc_auto_off";
    }
    if (qZr()) {
      return "win_ssh_auto_off";
    }
    switch (getInitialSettings().tui) {
      case "fullscreen":
        return "settings_on";
      case "default":
        return "settings_off";
    }
    if (e.downsellGateCached ?? getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_creek", false)) {
      return "downsell_on";
    }
    return e.gbGateCached ?? getFeatureValue_CACHED_MAY_BE_STALE("tengu_pewter_brook", false) ? "gb_on" : "gb_off";
  }
  function vGi(e) {
    switch (e) {
      case "env_on":
      case "bg_forced_on":
      case "settings_on":
      case "ant_default":
      case "downsell_on":
      case "gb_on":
        return "fullscreen";
      case "env_off":
      case "sr_auto_off":
      case "tmux_cc_auto_off":
      case "win_ssh_auto_off":
      case "settings_off":
      case "gb_off":
        return "default";
    }
  }
  function wGi() {
    if (Me.CLAUDE_CODE_NO_FLICKER === true) {
      return "on";
    }
    if (Me.CLAUDE_CODE_NO_FLICKER === false) {
      return "off";
    }
    return;
  }
  function Alt() {
    if (Me.CLAUDE_CODE_SESSION_KIND === "bg") {
      return "full";
    }
    if (Me.CLAUDE_CODE_DISABLE_MOUSE !== undefined) {
      return Me.CLAUDE_CODE_DISABLE_MOUSE ? "off" : "full";
    }
    if (Me.CLAUDE_CODE_DISABLE_MOUSE_CLICKS !== undefined) {
      return Me.CLAUDE_CODE_DISABLE_MOUSE_CLICKS ? "scroll" : "full";
    }
    return "full";
  }
  function lre(e = ire) {
    return getIsInteractive() && qs(e);
  }
  async function CGi(e = ire) {
    if (!process.env.TMUX) {
      return null;
    }
    if (!lre(e) || are(e)) {
      return null;
    }
    if (e.checkedTmuxMouseHint) {
      return null;
    }
    e.checkedTmuxMouseHint = true;
    let {
      stdout: t,
      code: n
    } = await execFileNoThrow("tmux", ["show", "-Av", "mouse"], {
      useCwd: false,
      timeout: 2000
    });
    if (n !== 0 || t.trim() === "on") {
      return null;
    }
    return "tmux detected \xB7 scroll with PgUp/PgDn \xB7 or add 'set -g mouse on' to ~/.tmux.conf for wheel scroll";
  }
  async function RGi(e = ire) {
    if (!process.env.TMUX) {
      return null;
    }
    if (are(e)) {
      return null;
    }
    if (e.checkedTmuxFocusHint) {
      return null;
    }
    e.checkedTmuxFocusHint = true;
    let {
      stdout: t,
      code: n
    } = await execFileNoThrow("tmux", ["show", "-gv", "focus-events"], {
      useCwd: false,
      timeout: 2000
    });
    if (n !== 0 || t.trim() === "on") {
      return null;
    }
    return "tmux focus-events off \xB7 add 'set -g focus-events on' to ~/.tmux.conf and reattach for focus tracking";
  }
  var EGi;
  var ire;
  var zp = __lazy(() => {
    at();
    $n();
    je();
    $A();
    pr();
    gn();
    ji();
    Cs();
    tje();
    D8();
    EGi = require("child_process");
    ire = H6d();
  });
  var xGi = {};