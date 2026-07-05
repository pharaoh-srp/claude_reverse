  __export(O6i, {
    getEraseScreenSequence: () => getEraseScreenSequence,
    getClearTerminalSequence: () => getClearTerminalSequence,
    eraseViewportInPlace: () => eraseViewportInPlace
  });
  function getClearTerminalSequence() {
    return o0 + xlt + gv;
  }
  function getEraseScreenSequence() {
    return o0 + gv;
  }
  function eraseViewportInPlace(e) {
    return gv + (QIe + NZr(1)).repeat(e) + gv;
  }
  var uuy;
  var Leo = __lazy(() => {
    ePe();
    c1();
    uuy = Sg(0, "f");
  });
  function j2(e) {
    return Sg(`?${e}h`);
  }
  function jJ(e) {
    return Sg(`?${e}l`);
  }
  function uPe(e) {
    switch (e) {
      case "full":
        return XKd;
      case "scroll":
        return QKd;
      case "off":
        return "";
    }
  }
  var f_;
  var hHt;
  var jlt;
  var dNn;
  var pNn;
  var Feo;
  var gHt;
  var D6i;
  var mNn;
  var WF;
  var sG;
  var fNn;
  var M6i;
  var XKd;
  var QKd;
  var mue;
  var qJ = __lazy(() => {
    c1();
    f_ = {
      CURSOR_VISIBLE: 25,
      ALT_SCREEN: 47,
      ALT_SCREEN_CLEAR: 1049,
      MOUSE_NORMAL: 1000,
      MOUSE_BUTTON: 1002,
      MOUSE_ANY: 1003,
      MOUSE_SGR: 1006,
      FOCUS_EVENTS: 1004,
      BRACKETED_PASTE: 2004,
      THEME_NOTIFY: 2031,
      SYNCHRONIZED_UPDATE: 2026
    };
    hHt = j2(f_.SYNCHRONIZED_UPDATE);
    jlt = jJ(f_.SYNCHRONIZED_UPDATE);
    dNn = j2(f_.BRACKETED_PASTE);
    pNn = jJ(f_.BRACKETED_PASTE);
    Feo = j2(f_.FOCUS_EVENTS);
    gHt = jJ(f_.FOCUS_EVENTS);
    D6i = j2(f_.THEME_NOTIFY);
    mNn = jJ(f_.THEME_NOTIFY);
    WF = j2(f_.CURSOR_VISIBLE);
    sG = jJ(f_.CURSOR_VISIBLE);
    fNn = j2(f_.ALT_SCREEN_CLEAR);
    M6i = jJ(f_.ALT_SCREEN_CLEAR);
    XKd = j2(f_.MOUSE_NORMAL) + j2(f_.MOUSE_BUTTON) + j2(f_.MOUSE_ANY) + j2(f_.MOUSE_SGR);
    QKd = j2(f_.MOUSE_NORMAL) + j2(f_.MOUSE_SGR);
    mue = jJ(f_.MOUSE_SGR) + jJ(f_.MOUSE_ANY) + jJ(f_.MOUSE_BUTTON) + jJ(f_.MOUSE_NORMAL);
  });
  function MWe() {
    let e = getAttacherCaps()?.progressReporting;
    if (e !== undefined) {
      return e;
    }
    if (!process.stdout.isTTY) {
      return false;
    }
    if (process.env.WT_SESSION) {
      return false;
    }
    if (process.env.ConEmuANSI || process.env.ConEmuPID || process.env.ConEmuTask) {
      return true;
    }
    let t = F6i.coerce(process.env.TERM_PROGRAM_VERSION);
    if (!t) {
      return false;
    }
    if (process.env.TERM_PROGRAM === "ghostty") {
      return iO(t.version, "1.2.0");
    }
    if (process.env.TERM_PROGRAM === "iTerm.app") {
      return iO(t.version, "3.6.6");
    }
    return false;
  }
  function B6i(e) {
    U6i = e;
  }
  function q2() {
    if (process.env.CLAUDE_BG_BACKEND === "daemon") {
      return getAttacherCaps()?.syncOutput !== false;
    }
    if (process.env.TMUX) {
      return false;
    }
    if (st(process.env.CLAUDE_CODE_FORCE_SYNC_OUTPUT)) {
      return true;
    }
    let e = process.env.TERM_PROGRAM;
    let t = process.env.TERM;
    if (e === "iTerm.app" || e === "WezTerm" || e === "WarpTerminal" || e === "ghostty" || e === "contour" || e === "vscode" || e === "alacritty" || e === "mintty" || e === "rio" || e === "Tabby") {
      return true;
    }
    if (qF.isJetBrainsIdeTerminal()) {
      return true;
    }
    if (parseInt(process.env.KONSOLE_VERSION ?? "", 10) >= 211200) {
      return true;
    }
    if (t?.includes("kitty") || process.env.KITTY_WINDOW_ID) {
      return true;
    }
    if (t === "xterm-ghostty") {
      return true;
    }
    if (t?.startsWith("foot")) {
      return true;
    }
    if (t?.includes("alacritty")) {
      return true;
    }
    if (process.env.ZED_TERM) {
      return true;
    }
    if (process.env.WT_SESSION) {
      return true;
    }
    let n = process.env.VTE_VERSION;
    if (n) {
      if (parseInt(n, 10) >= 6800) {
        return true;
      }
    }
    if (U6i) {
      return true;
    }
    return false;
  }
  function $6i() {
    if (Me.CLAUDE_CODE_FORCE_STRIKETHROUGH) {
      return true;
    }
    let e = Me.TERM;
    if (Me.TERM_PROGRAM === "Apple_Terminal" || e === "linux") {
      return false;
    }
    return ZKd.vZc(Me.TERM_PROGRAM ?? "") || qF.isGhostty() || qF.isMintty() || qF.isJetBrainsIdeTerminal() || Me.LC_TERMINAL === "iTerm2" || !!e?.includes("kitty") || !!e?.includes("alacritty") || !!e?.startsWith("foot") || !!Me.KITTY_WINDOW_ID || !!Me.ALACRITTY_LOG || !!Me.KONSOLE_VERSION || !!Me.WT_SESSION || !!Me.ZED_TERM || parseInt(Me.VTE_VERSION ?? "", 10) >= 4400;
  }
  function H6i(e) {
    hNn = e;
  }
  function yHt() {
    return hNn;
  }
  function Rb() {
    if (getAttacherCaps()?.isVscodeTerm) {
      return true;
    }
    if (process.env.TERM_PROGRAM === "vscode") {
      return true;
    }
    return hNn?.startsWith("xterm.js") ?? false;
  }
  function j6i() {
    return hNn?.toLowerCase().startsWith("ghostty") ?? false;
  }
  function t7d(e) {
    return e7d.includes(e ?? Me.terminal ?? "");
  }
  function mre() {
    return t7d() ? aue + oGi + sGi : "";
  }
  function dPe() {
    return fNn + o0 + gv + mre();
  }
  function GF() {
    return aue + M6i + Zbe;
  }
  function q6i() {
    return !!process.env.WT_SESSION;
  }
  function Ueo() {
    if (process.env.CLAUDE_BG_BACKEND === "daemon") {
      return false;
    }
    return q2() && process.env.ZELLIJ == null && !qF.isJetBrainsIdeTerminal() && !Rb() && Me.WT_SESSION == null;
  }
  function Beo(e, t, n = false, r) {
    let o = r !== undefined && r > 1 ? r - 1 : undefined;
    if (t.length === 0) {
      return;
    }
    let s = !n;
    let i = s ? hHt : "";
    for (let a of t) {
      switch (a.type) {
        case "stdout":
          i += a.content;
          break;
        case "clear":
          if (a.count > 0) {
            i += RMn(a.count);
          }
          break;
        case "clearTerminal":
          i += a.altScreen ? getClearTerminalSequence() : eraseViewportInPlace(a.viewportRows);
          break;
        case "cursorHide":
          i += sG;
          break;
        case "cursorShow":
          i += WF;
          break;
        case "cursorMove":
          i += iue(a.x, o !== undefined ? Math.max(-o, Math.min(o, a.y)) : a.y);
          break;
        case "cursorTo":
          i += CMn(a.col);
          break;
        case "carriageReturn":
          i += "\r";
          break;
        case "hyperlink":
          i += klt(a.uri);
          break;
        case "styleStr":
          i += a.str;
          break;
      }
    }
    if (s) {
      i += jlt;
    }
    if (N6i) {
      return;
    }
    try {
      e.stdout.write(i);
    } catch (a) {
      if (r7d() && (L6i(a) === "EIO" || L6i(a) === "EPIPE")) {
        N6i = true;
        return;
      }
      throw a;
    }
  }
  function r7d() {
    return n7d ??= process.env.CLAUDE_BG_BACKEND === "daemon";
  }
  function L6i(e) {
    return e && typeof e === "object" && "code" in e ? String(e.code) : undefined;
  }
  var F6i;
  var U6i;
  var ZKd;
  var hNn;
  var e7d;
  var Euy;
  var gNn;
  var N6i = false;
  var n7d;
  var mT = __lazy(() => {
    at();
    pr();
    gn();
    Leo();
    ePe();
    c1();
    qJ();
    Tg();
    F6i = __toESM(lq(), 1);
    ZKd = new Set(["iTerm.app", "vscode", "WezTerm", "WarpTerminal", "Hyper", "Tabby", "rio", "contour", "alacritty"]);
    e7d = ["iTerm.app", "kitty", "WezTerm", "ghostty", "tmux", "windows-terminal", "WarpTerminal"];
    Euy = q2();
    gNn = Ueo();
  });
  function VF() {
    let e = yHt();
    let t = getAttacherCaps();
    let n = t?.wheelFlood ?? $eo();
    let r = t ? N6.includes(t.terminal ?? "") : qF.isJetBrainsIdeTerminal();
    let o = t?.wtSession ?? !!process.env.WT_SESSION;
    let s = Rb();
    if (fue && fue.xtversion === (e ?? "(no reply)") && fue.wheelFlood === n && fue.jediTerm === r && fue.wtSession === o && fue.xtermJs === s) {
      return fue;
    }
    let i = "linux";
    fue = {
      useDecayCurve: !n && (s || i === "win32" || o),
      useAdaptiveDrain: s,
      base: r ? 2 : s7d(s, n, o),
      xtermJs: s,
      wheelFlood: n,
      jediTerm: r,
      termProgram: process.env.TERM_PROGRAM ?? "unset",
      termProgramVersion: process.env.TERM_PROGRAM_VERSION ?? "unset",
      xtversion: e ?? "(no reply)",
      wtSession: o,
      scrollSpeedEnv: process.env.CLAUDE_CODE_SCROLL_SPEED ?? "unset",
      platform: i
    };
    return fue;
  }
  function $eo() {
    if (process.env.CURSOR_TRACE_ID !== undefined) {
      return true;
    }
    if (process.env.VSCODE_GIT_ASKPASS_MAIN?.includes("cursor")) {
      return true;
    }
    if (process.env.TERM_PROGRAM === "vscode") {
      let e = o7d(process.env.TERM_PROGRAM_VERSION);
      if (e !== null) {
        return e >= 1092000 && e < 1105000;
      }
    }
    return yHt()?.startsWith("xterm.js") ?? false;
  }
  function o7d(e) {
    if (!e) {
      return null;
    }
    let t = /^(\d+)\.(\d+)\.(\d+)/.exec(e);
    if (!t) {
      return null;
    }
    return +t[1] * 1e6 + +t[2] * 1000 + +t[3];
  }
  function Heo(e, t, n) {
    return !t && (e || false || n) ? 3 : 1;
  }
  function s7d(e, t, n) {
    let r = Heo(e, t, n);
    let o = process.env.CLAUDE_CODE_SCROLL_SPEED;
    if (!o) {
      return r;
    }
    let s = parseFloat(o);
    return Number.isNaN(s) || s <= 0 ? r : Math.min(s, 20);
  }
  function yNn() {
    fue = undefined;
  }
  var fue;
  var pPe = __lazy(() => {
    at();
    pr();
    ePe();
    mT();
  });
  function i7d() {
    jeo = true;
    qeo = true;
    _Nn++;
  }
  function G6i() {
    qeo = false;
    _Nn = 0;
  }
  function V6i() {
    let e = _Nn;
    _Nn = 0;
    return e;
  }
  function bNn() {
    if (jeo) {
      return true;
    }
    if (process.env.INTELLIJ_TERMINAL_COMMAND_BLOCKS_REWORKED !== undefined || process.env.INTELLIJ_TERMINAL_COMMAND_BLOCKS !== undefined) {
      jeo = true;
      return true;
    }
    return false;
  }
  function z6i() {
    return qeo;
  }
  function K6i() {
    return {
      lastWheelTime: 0,
      lastWheelDownTime: 0
    };
  }
  function Y6i(e, t, n, r) {
    if (!VF().jediTerm) {
      G6i();
      return t;
    }
    let o = null;
    for (let s = 0; s < t.length; s++) {
      let i = t[s];
      if (i.kind !== "key") {
        o?.push(i);
        continue;
      }
      if (i.name === "wheelup" || i.name === "wheeldown") {
        if (n - e.lastWheelTime > 200) {
          e.lastWheelDownTime = 0;
          G6i();
        }
        if (e.lastWheelTime = n, i.name === "wheeldown") {
          e.lastWheelDownTime = n;
        }
        if (i.name === "wheelup" && n - e.lastWheelDownTime < 250 && bNn()) {
          o ??= t.slice(0, s);
          o.push({
            ...i,
            name: "wheeldown"
          });
          continue;
        }
        o?.push(i);
        continue;
      }
      if ((i.name === "up" || i.name === "down") && !i.ctrl && !i.meta && !i.shift && !i.isPasted && n - e.lastWheelTime < 75) {
        if (!W6i) {
          W6i = true;
          r();
        }
        i7d();
        o ??= t.slice(0, s);
        continue;
      }
      o?.push(i);
    }
    return o ?? t;
  }
  var jeo = false;
  var W6i = false;
  var qeo = false;
  var _Nn = 0;
  var SNn = __lazy(() => {
    pPe();
  });
  function mPe(e) {
    let t = "ground";
    let n = "";
    let r = e?.x10Mouse ?? false;
    let o = e?.forOutput ?? false;
    return {
      feed(s) {
        let i = J6i(s, t, n, false, r, o);
        t = i.state.state;
        n = i.state.buffer;
        return i.tokens;
      },
      flush() {
        let s = J6i("", t, n, true, r, o);
        t = s.state.state;
        n = s.state.buffer;
        return s.tokens;
      },
      reset() {
        t = "ground";
        n = "";
      },
      buffer() {
        return n;
      }
    };
  }
  function J6i(e, t, n, r, o, s) {
    let i = [];
    let a = {
      state: t,
      buffer: ""
    };
    let l = n + e;
    let c = 0;
    let u = 0;
    let d = 0;
    let p = () => {
      if (c > u) {
        let f = l.slice(u, c);
        if (f) {
          i.push({
            type: "text",
            value: f
          });
        }
      }
      u = c;
    };
    let m = f => {
      if (f) {
        i.push({
          type: "sequence",
          value: f
        });
      }
      a.state = "ground";
      u = c;
    };
    while (c < l.length) {
      let f = l.charCodeAt(c);
      switch (a.state) {
        case "ground":
          if (f === rre.ESC) {
            p();
            d = c;
            a.state = "escape";
            c++;
          } else if (f === rre.DEL) {
            if (c7d.test(l.slice(u, c))) {
              c++;
            } else {
              p();
              c++;
              i.push({
                type: "text",
                value: "\x7F"
              });
              u = c;
            }
          } else if (!s && f < 32 && l.length < 64) {
            if (p(), c++, f === 13 && l.charCodeAt(c) === 10) {
              c++;
            }
            i.push({
              type: "text",
              value: String.fromCharCode(f)
            });
            u = c;
          } else {
            c++;
          }
          break;
        case "escape":
          if (f === nG.CSI) {
            a.state = "csi";
            c++;
          } else if (f === nG.OSC) {
            a.state = "osc";
            c++;
          } else if (f === nG.DCS) {
            a.state = "dcs";
            c++;
          } else if (!o && f === nG.APC) {
            a.state = "apc";
            c++;
          } else if (!o && f === nG.PM) {
            a.state = "pm";
            c++;
          } else if (!o && (f === nG.SOS || f === 107)) {
            a.state = "sos";
            c++;
          } else if (f === 79) {
            a.state = "ss3";
            c++;
          } else if (o && (f === 32 || f === 13 || f === 10 || f === 9)) {
            c++;
            i.push({
              type: "text",
              value: l.slice(d, c)
            });
            a.state = "ground";
            u = c;
          } else if (o && z$t(f)) {
            i.push({
              type: "text",
              value: l.slice(d, c)
            });
            a.state = "ground";
            u = c;
          } else if (z$t(f)) {
            a.state = "escapeIntermediate";
            c++;
          } else if (f === rre.DEL) {
            c++;
            i.push({
              type: "text",
              value: l.slice(d, c)
            });
            a.state = "ground";
            u = c;
          } else if (OZr(f)) {
            c++;
            m(l.slice(d, c));
          } else if (f === rre.ESC) {
            m(l.slice(d, c));
            d = c;
            a.state = "escape";
            c++;
          } else if (f < 32) {
            c++;
            i.push({
              type: "text",
              value: l.slice(d, c)
            });
            a.state = "ground";
            u = c;
          } else {
            a.state = "ground";
            u = d;
          }
          break;
        case "escapeIntermediate":
          if (z$t(f)) {
            c++;
          } else if (OZr(f)) {
            c++;
            m(l.slice(d, c));
          } else {
            a.state = "ground";
            u = d;
          }
          break;
        case "csi":
          if (o && f === 77 && c - d === 2 && (c + 1 >= l.length || l.charCodeAt(c + 1) >= 32) && (c + 2 >= l.length || l.charCodeAt(c + 2) >= 32) && (c + 3 >= l.length || l.charCodeAt(c + 3) >= 32)) {
            if (c + 4 <= l.length) {
              c += 4;
              m(l.slice(d, c));
            } else {
              c = l.length;
            }
            break;
          }
          if (YWi(f)) {
            c++;
            m(l.slice(d, c));
          } else if (KWi(f) || z$t(f)) {
            c++;
          } else {
            a.state = "ground";
            u = d;
          }
          break;
        case "ss3":
          if (f >= 64 && f <= 126) {
            c++;
            m(l.slice(d, c));
          } else {
            a.state = "ground";
            u = d;
          }
          break;
        case "osc":
        case "dcs":
        case "apc":
        case "pm":
        case "sos":
          if (f === rre.BEL && a.state !== "pm" && a.state !== "sos") {
            c++;
            m(l.slice(d, c));
          } else if (f === rre.ESC && c + 1 < l.length) {
            if (l.charCodeAt(c + 1) === nG.ST) {
              c += 2;
              m(l.slice(d, c));
            } else {
              m(l.slice(d, c));
              d = c;
              a.state = "escape";
              c++;
            }
          } else if (f === rre.CAN || f === rre.SUB) {
            c++;
            m(l.slice(d, c));
          } else {
            c++;
          }
          break;
      }
    }
    if (a.state === "ground") {
      p();
    } else if (r) {
      let f = l.slice(d);
      if (f) {
        i.push({
          type: "sequence",
          value: f
        });
      }
      a.state = "ground";
    } else {
      a.buffer = l.slice(d);
    }
    return {
      tokens: i,
      state: a
    };
  }
  var c7d;
  var _Ht = __lazy(() => {
    ore();
    c1();
    c7d = /^\[M[\x60-\x7f][\x20-\uffff]?$/;
  });
  function X6i(e) {
    return {
      kind: "key",
      name: "",
      fn: false,
      ctrl: false,
      meta: false,
      shift: false,
      option: false,
      super: false,
      sequence: e,
      raw: e,
      isPasted: true
    };
  }
  function Q6i(e) {
    if (e.startsWith("\x1B[")) {
      let t;
      if (t = p7d.exec(e)) {
        return {
          type: "decrpm",
          mode: parseInt(t[1], 10),
          status: parseInt(t[2], 10)
        };
      }
      if (t = m7d.exec(e)) {
        return {
          type: "da1",
          params: Z6i(t[1])
        };
      }
      if (t = f7d.exec(e)) {
        return {
          type: "da2",
          params: Z6i(t[1])
        };
      }
      if (t = h7d.exec(e)) {
        return {
          type: "kittyKeyboard",
          flags: parseInt(t[1], 10)
        };
      }
      if (t = g7d.exec(e)) {
        return {
          type: "cursorPosition",
          row: parseInt(t[1], 10),
          col: parseInt(t[2], 10)
        };
      }
      if (t = y7d.exec(e)) {
        return {
          type: "themeNotify",
          dark: t[1] === "1"
        };
      }
      return null;
    }
    if (e.startsWith("\x1B]")) {
      let t = _7d.exec(e);
      if (t) {
        return {
          type: "osc",
          code: parseInt(t[1], 10),
          data: t[2]
        };
      }
    }
    if (e.startsWith("\x1BP")) {
      let t = b7d.exec(e);
      if (t) {
        return {
          type: "xtversion",
          name: t[1]
        };
      }
    }
    return null;
  }
  function Z6i(e) {
    if (!e) {
      return [];
    }
    return e.split(";").map(t => parseInt(t, 10));
  }
  function S7d(e, t) {
    let n = t.CLAUDE_CODE_BS_AS_CTRL_BACKSPACE;
    if (st(n)) {
      return true;
    }
    if (Pl(n)) {
      return false;
    }
    return e === "win32" && t.TERM_PROGRAM !== "mintty" && t.TERM !== "cygwin";
  }
  function Keo() {
    return S7d("linux", process.env);
  }
  function T7d(e, t) {
    let n = e.CLAUDE_CODE_ALTGR_AS_TEXT;
    if (st(n)) {
      return "force";
    }
    if (Pl(n)) {
      return "off";
    }
    return t ?? !!e.WT_SESSION ? "auto" : "off";
  }
  function E7d() {
    return T7d(process.env, getAttacherCaps()?.wtSession);
  }
  function v7d(e) {
    return e > 32 && e < 127 || e >= 160 && e < 55296;
  }
  function w7d(e) {
    return e >= 48 && e <= 57 || e >= 65 && e <= 90 || e >= 97 && e <= 122;
  }
  function e8i(e, t, n) {
    return {
      kind: "key",
      name: String.fromCodePoint(t),
      fn: false,
      ctrl: false,
      meta: false,
      shift: n,
      option: false,
      super: false,
      sequence: e,
      raw: e,
      isPasted: false
    };
  }
  function t8i(e, t) {
    if (!(e.ctrl && e.meta) || e.super) {
      return false;
    }
    if (!v7d(t)) {
      return false;
    }
    let n = E7d();
    if (n === "off") {
      return false;
    }
    return n === "force" || !w7d(t);
  }
  function C7d(e) {
    if (SHt.Buffer.isBuffer(e)) {
      if (e[0] > 127 && e[1] === undefined) {
        e[0] -= 128;
        return "\x1B" + String(e);
      } else {
        return String(e);
      }
    } else if (e !== undefined && typeof e !== "string") {
      return String(e);
    } else if (!e) {
      return "";
    } else {
      return e;
    }
  }
  function u8i(e, t = "") {
    let n = t === null;
    let r = n ? "" : C7d(t);
    let o = e._tokenizer ?? mPe({
      x10Mouse: true
    });
    let s = n ? o.flush() : o.feed(r);
    let i = [];
    let a = e.mode === "IN_PASTE";
    let l = e.pasteBuffer;
    let c = e.pendingByteEvents;
    function u(f) {
      if (a) {
        l += String.fromCharCode(f.byte);
      } else {
        i.push(bHt(f.seq));
      }
    }
    function d() {
      for (let f of c) {
        u(f);
      }
      c = [];
    }
    function p(f, h) {
      if (c.length === 0) {
        if (h >= 194 && h <= 244) {
          c = [{
            seq: f,
            byte: h
          }];
          return;
        }
        u({
          seq: f,
          byte: h
        });
        return;
      }
      if (h >= 128 && h <= 191) {
        c = [...c, {
          seq: f,
          byte: h
        }];
        let g = c[0].byte;
        let y = g <= 223 ? 2 : g <= 239 ? 3 : 4;
        if (c.length < y) {
          return;
        }
        let _ = c;
        c = [];
        let b = SHt.Buffer.from(_.map(E => E.byte)).toString("utf8");
        if ([...b].length !== 1 || SHt.Buffer.byteLength(b, "utf8") !== _.length) {
          for (let E of _) {
            u(E);
          }
        } else if (a) {
          l += b;
        } else {
          i.push(bHt(b));
        }
        return;
      }
      d();
      p(f, h);
    }
    for (let f of s) {
      if (f.type === "sequence") {
        if (f.value === nGi) {
          d();
          a = true;
          l = "";
        } else if (f.value === rGi) {
          d();
          i.push(X6i(l));
          a = false;
          l = "";
        } else if (a) {
          if (i8i(f.value)) {
            continue;
          }
          let h = o8i(f.value);
          if (h !== undefined) {
            p(f.value, h);
            continue;
          }
          if (!Q6i(f.value) && !s8i.test(f.value)) {
            d();
          }
          l += A7d(f.value);
        } else {
          let h = o8i(f.value);
          if (h !== undefined) {
            p(f.value, h);
            continue;
          }
          let g = Q6i(f.value);
          if (g) {
            i.push({
              kind: "response",
              sequence: f.value,
              response: g
            });
            continue;
          }
          let y = a8i(f.value);
          if (y) {
            i.push(y);
            continue;
          }
          if (f.value === ZIe || !i8i(f.value) && !s8i.test(f.value)) {
            d();
          }
          i.push(bHt(f.value));
        }
      } else if (f.type === "text") {
        if (d(), a) {
          l += f.value;
        } else if (/^\[<\d+;\d+;\d+[Mm]$/.test(f.value) || /^\[M[\x60-\x7f][\x20-\uffff]{2}$/.test(f.value)) {
          let h = "\x1B" + f.value;
          let g = a8i(h);
          i.push(g ?? bHt(h));
        } else {
          i.push(bHt(f.value));
        }
      }
    }
    if (n) {
      d();
    }
    if (n && a) {
      if (l) {
        i.push(X6i(l));
      }
      a = false;
      l = "";
    }
    let m = {
      mode: a ? "IN_PASTE" : "NORMAL",
      incomplete: o.buffer(),
      pasteBuffer: l,
      pendingByteEvents: c,
      _tokenizer: o
    };
    return [i, m];
  }
  function n8i(e) {
    let t = e - 1;
    return {
      shift: !!(t & 1),
      meta: !!(t & 2),
      ctrl: !!(t & 4),
      super: !!(t & 8)
    };
  }
  function r8i(e) {
    switch (e) {
      case 9:
        return "tab";
      case 13:
        return "return";
      case 27:
        return "escape";
      case 32:
        return "space";
      case 127:
        return "backspace";
      case 57399:
        return "0";
      case 57400:
        return "1";
      case 57401:
        return "2";
      case 57402:
        return "3";
      case 57403:
        return "4";
      case 57404:
        return "5";
      case 57405:
        return "6";
      case 57406:
        return "7";
      case 57407:
        return "8";
      case 57408:
        return "9";
      case 57409:
        return ".";
      case 57410:
        return "/";
      case 57411:
        return "*";
      case 57412:
        return "-";
      case 57413:
        return "+";
      case 57414:
        return "return";
      case 57415:
        return "=";
      case 57416:
        return ",";
      case 57417:
        return "left";
      case 57418:
        return "right";
      case 57419:
        return "up";
      case 57420:
        return "down";
      case 57421:
        return "pageup";
      case 57422:
        return "pagedown";
      case 57423:
        return "home";
      case 57424:
        return "end";
      case 57425:
        return "insert";
      case 57426:
        return "delete";
      default:
        if (e >= 32 && e <= 126) {
          return String.fromCharCode(e).toLowerCase();
        }
        if (e >= 160 && e < 55296) {
          return String.fromCodePoint(e);
        }
        return;
    }
  }
  function o8i(e) {
    let t;
    let n;
    let r = Geo.exec(e);
    if (r) {
      t = parseInt(r[1], 10);
      n = r[2] === undefined ? undefined : parseInt(r[2], 10);
    } else if (r = Veo.exec(e)) {
      n = parseInt(r[1], 10);
      t = parseInt(r[2], 10);
    }
    if (t === undefined || t < 128 || t > 255) {
      return;
    }
    if (n !== undefined && n !== 1) {
      return;
    }
    return t;
  }
  function A7d(e) {
    let t = Geo.exec(e);
    let n = t ? parseInt(t[1], 10) : undefined;
    if (n === undefined && (t = Veo.exec(e))) {
      n = parseInt(t[2], 10);
    }
    if (n !== undefined && n <= 1114111) {
      return String.fromCodePoint(n);
    }
    return e;
  }
  function i8i(e) {
    return e === wWe || e === ZIe || zeo.test(e) || I7d.test(e);
  }
  function a8i(e) {
    let t = zeo.exec(e);
    if (!t) {
      return null;
    }
    let n = parseInt(t[1], 10);
    if ((n & 64) !== 0) {
      return null;
    }
    return {
      kind: "mouse",
      button: n,
      action: t[4] === "M" ? "press" : "release",
      col: parseInt(t[2], 10),
      row: parseInt(t[3], 10),
      sequence: e
    };
  }
  function bHt(e = "") {
    let t;
    let n = {
      kind: "key",
      name: "",
      fn: false,
      ctrl: false,
      meta: false,
      shift: false,
      option: false,
      super: false,
      sequence: e,
      raw: e,
      isPasted: false
    };
    n.sequence = n.sequence || e || n.name;
    let r;
    if (r = Geo.exec(e)) {
      let o = parseInt(r[1], 10);
      let s = r[2] ? parseInt(r[2], 10) : 1;
      let i = n8i(s);
      if (t8i(i, o)) {
        return e8i(e, o, i.shift);
      }
      return {
        kind: "key",
        name: r8i(o),
        fn: false,
        ctrl: i.ctrl,
        meta: i.meta,
        shift: i.shift,
        option: false,
        super: i.super,
        sequence: e,
        raw: e,
        isPasted: false
      };
    }
    if (r = Veo.exec(e)) {
      let o = n8i(parseInt(r[1], 10));
      let s = parseInt(r[2], 10);
      if (t8i(o, s)) {
        return e8i(e, s, o.shift);
      }
      return {
        kind: "key",
        name: r8i(s),
        fn: false,
        ctrl: o.ctrl,
        meta: o.meta,
        shift: o.shift,
        option: false,
        super: o.super,
        sequence: e,
        raw: e,
        isPasted: false
      };
    }
    if (r = zeo.exec(e)) {
      let o = parseInt(r[1], 10);
      let s = parseInt(r[2], 10);
      let i = parseInt(r[3], 10);
      return l8i(e, o, s, i) ?? fPe(e, "mouse", false);
    }
    if (e.length === 6 && e.startsWith("\x1B[M")) {
      let o = e.charCodeAt(3) - 32;
      let s = e.charCodeAt(4) - 32;
      let i = e.charCodeAt(5) - 32;
      return l8i(e, o, s, i) ?? fPe(e, "mouse", false);
    }
    if (e === "\r" || e === "\x1B\r") {
      n.raw = undefined;
      n.name = "return";
      n.meta = e.length === 2;
    } else if (e === `
` || e === `\x1B
`) {
      n.name = "enter";
      n.meta = e.length === 2;
    } else if (e === "\t" || e === "\x1B\t") {
      n.name = "tab";
      n.meta = e.length === 2;
    } else if (e === "\b" || e === "\x1B\b") {
      if (n.name = "backspace", n.meta = e.charAt(0) === "\x1B", Keo()) {
        n.ctrl = true;
      }
    } else if (e === "\x7F" || e === "\x1B\x7F") {
      n.name = "backspace";
      n.meta = e.charAt(0) === "\x1B";
    } else if (e === "\x1B" || e === "\x1B\x1B") {
      n.name = "escape";
      n.meta = e.length === 2;
    } else if (e === " " || e === "\x1B ") {
      n.name = "space";
      n.meta = e.length === 2;
    } else if (e === "\x1C") {
      n.name = "\\";
      n.ctrl = true;
    } else if (e === "\x1D") {
      n.name = "]";
      n.ctrl = true;
    } else if (e === "\x1E") {
      n.name = "^";
      n.ctrl = true;
    } else if (e === "\x1F") {
      n.name = "_";
      n.ctrl = true;
    } else if (e <= "\x1A" && e.length === 1) {
      n.name = String.fromCharCode(e.charCodeAt(0) + 97 - 1);
      n.ctrl = true;
    } else if (e.length === 1 && e >= "0" && e <= "9") {
      n.name = "number";
    } else if (e.length === 1 && e >= "a" && e <= "z") {
      n.name = e;
    } else if (e.length === 1 && e >= "A" && e <= "Z") {
      n.name = e.toLowerCase();
      n.shift = true;
    } else if (t = u7d.exec(e)) {
      n.meta = true;
      n.shift = /^[A-Z]$/.test(t[1]);
      n.name = t[1].toLowerCase();
    } else if (t = d7d.exec(e)) {
      let o = [...e];
      if (o[0] === "\x1B" && o[1] === "\x1B") {
        n.option = true;
      }
      let s = [t[1], t[2], t[4], t[6]].filter(Boolean).join("");
      let i = (t[3] || t[5] || 1) - 1;
      n.ctrl = !!(i & 4);
      n.meta = !!(i & 2);
      n.super = !!(i & 8);
      n.shift = !!(i & 1);
      n.code = s;
      n.name = R7d[s];
      n.shift = x7d(s) || n.shift;
      n.ctrl = k7d(s) || n.ctrl;
    }
    if (n.raw === "\x1Bb") {
      n.meta = true;
      n.name = "left";
    } else if (n.raw === "\x1Bf") {
      n.meta = true;
      n.name = "right";
    }
    switch (e) {
      case "\x1B[1~":
        return fPe(e, "home", false);
      case "\x1B[4~":
        return fPe(e, "end", false);
      case "\x1B[5~":
        return fPe(e, "pageup", false);
      case "\x1B[6~":
        return fPe(e, "pagedown", false);
      case "\x1B[1;5D":
        return fPe(e, "left", true);
      case "\x1B[1;5C":
        return fPe(e, "right", true);
    }
    return n;
  }
  function l8i(e, t, n, r) {
    let o = t & 67;
    if (o !== 64 && o !== 65) {
      return null;
    }
    return {
      kind: "key",
      name: o === 64 ? "wheelup" : "wheeldown",
      ctrl: (t & 16) !== 0,
      meta: (t & 8) !== 0,
      shift: (t & 4) !== 0,
      option: false,
      super: false,
      fn: false,
      sequence: e,
      raw: e,
      isPasted: false,
      col: n,
      row: r
    };
  }
  function fPe(e, t, n) {
    return {
      kind: "key",
      name: t,
      ctrl: n,
      meta: false,
      shift: false,
      option: false,
      super: false,
      fn: false,
      sequence: e,
      raw: e,
      isPasted: false
    };
  }
  var SHt;
  var u7d;
  var d7d;
  var Geo;
  var Veo;
  var p7d;
  var m7d;
  var f7d;
  var h7d;
  var g7d;
  var y7d;
  var _7d;
  var b7d;
  var zeo;
  var c8i;
  var R7d;
  var x7d = e => ["[a", "[b", "[c", "[d", "[e", "[2$", "[3$", "[5$", "[6$", "[7$", "[8$", "[Z"].includes(e);
  var k7d = e => ["Oa", "Ob", "Oc", "Od", "Oe", "[2^", "[3^", "[5^", "[6^", "[7^", "[8^"].includes(e);
  var I7d;
  var s8i;
  var Yeo = __lazy(() => {
    at();
    gn();
    c1();
    _Ht();
    SHt = require("buffer");
    u7d = /^(?:\x1b)([a-zA-Z0-9])$/;
    d7d = /^(?:\x1b+)(O|N|\[|\[\[)(?:(\d+)(?:;(\d+))?([~^$])|(?:1;)?(\d+)?([a-zA-Z]))/;
    Geo = /^\x1b\[(\d+)(?:;(\d+))?u/;
    Veo = /^\x1b\[27;(\d+);(\d+)~/;
    p7d = /^\x1b\[\?(\d+);(\d+)\$y$/;
    m7d = /^\x1b\[\?([\d;]*)c$/;
    f7d = /^\x1b\[>([\d;]*)c$/;
    h7d = /^\x1b\[\?(\d+)u$/;
    g7d = /^\x1b\[\?(\d+);(\d+)R$/;
    y7d = /^\x1b\[\?997;([12])n$/;
    _7d = /^\x1b\](\d+);(.*?)(?:\x07|\x1b\\)$/s;
    b7d = /^\x1bP>\|(.*?)(?:\x07|\x1b\\)$/s;
    zeo = /^\x1b\[<(\d+);(\d+);(\d+)([Mm])$/;
    c8i = {
      mode: "NORMAL",
      incomplete: "",
      pasteBuffer: "",
      pendingByteEvents: []
    };
    R7d = {
      OP: "f1",
      OQ: "f2",
      OR: "f3",
      OS: "f4",
      Op: "0",
      Oq: "1",
      Or: "2",
      Os: "3",
      Ot: "4",
      Ou: "5",
      Ov: "6",
      Ow: "7",
      Ox: "8",
      Oy: "9",
      Oj: "*",
      Ok: "+",
      Ol: ",",
      Om: "-",
      On: ".",
      Oo: "/",
      OM: "return",
      "[11~": "f1",
      "[12~": "f2",
      "[13~": "f3",
      "[14~": "f4",
      "[[A": "f1",
      "[[B": "f2",
      "[[C": "f3",
      "[[D": "f4",
      "[[E": "f5",
      "[15~": "f5",
      "[17~": "f6",
      "[18~": "f7",
      "[19~": "f8",
      "[20~": "f9",
      "[21~": "f10",
      "[23~": "f11",
      "[24~": "f12",
      "[A": "up",
      "[B": "down",
      "[C": "right",
      "[D": "left",
      "[E": "clear",
      "[F": "end",
      "[H": "home",
      sZc: "up",
      OB: "down",
      OC: "right",
      OD: "left",
      OE: "clear",
      OF: "end",
      OH: "home",
      "[1~": "home",
      "[2~": "insert",
      "[3~": "delete",
      "[4~": "end",
      "[5~": "pageup",
      "[6~": "pagedown",
      "[[5~": "pageup",
      "[[6~": "pagedown",
      "[7~": "home",
      "[8~": "end",
      "[a": "up",
      "[b": "down",
      "[c": "right",
      "[d": "left",
      "[e": "clear",
      "[2$": "insert",
      "[3$": "delete",
      "[5$": "pageup",
      "[6$": "pagedown",
      "[7$": "home",
      "[8$": "end",
      Oa: "up",
      Ob: "down",
      Oc: "right",
      Od: "left",
      Oe: "clear",
      "[2^": "insert",
      "[3^": "delete",
      "[5^": "pageup",
      "[6^": "pagedown",
      "[7^": "home",
      "[8^": "end",
      "[Z": "tab"
    };
    I7d = /^\x1b\[M[\x60-\x7f][\x20-\uffff]{2}$/;
    s8i = /^\x1b\[M[\x20-\x7f][\x20-\uffff]{2}$/;
  });