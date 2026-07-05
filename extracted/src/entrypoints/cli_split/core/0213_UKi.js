  var $Ki = __commonJS((uyy, BKi) => {
    var _Xd = FKi();
    var Ect = mhn();
    function UKi(e) {
      if (/^\d{3,4}$/.test(e)) {
        let n = /(\d{1,2})(\d{2})/.exec(e);
        return {
          major: 0,
          minor: parseInt(n[1], 10),
          patch: parseInt(n[2], 10)
        };
      }
      let t = (e || "").split(".").map(n => parseInt(n, 10));
      return {
        major: t[0],
        minor: t[1],
        patch: t[2]
      };
    }
    function $no(e) {
      let {
        env: t
      } = process;
      if ("FORCE_HYPERLINK" in t) {
        return !(t.FORCE_HYPERLINK.length > 0 && parseInt(t.FORCE_HYPERLINK, 10) === 0);
      }
      if (Ect("no-hyperlink") || Ect("no-hyperlinks") || Ect("hyperlink=false") || Ect("hyperlink=never")) {
        return false;
      }
      if (Ect("hyperlink=true") || Ect("hyperlink=always")) {
        return true;
      }
      if ("NETLIFY" in t) {
        return true;
      }
      if (!_Xd.supportsColor(e)) {
        return false;
      }
      if (e && !e.isTTY) {
        return false;
      }
      if ("CI" in t) {
        return false;
      }
      if ("TEAMCITY_VERSION" in t) {
        return false;
      }
      if ("TERM_PROGRAM" in t) {
        let n = UKi(t.TERM_PROGRAM_VERSION);
        switch (t.TERM_PROGRAM) {
          case "iTerm.app":
            if (n.major === 3) {
              return n.minor >= 1;
            }
            return n.major > 3;
          case "WezTerm":
            return n.major >= 20200620;
          case "vscode":
            return n.major > 1 || n.major === 1 && n.minor >= 72;
        }
      }
      if ("VTE_VERSION" in t) {
        if (t.VTE_VERSION === "0.50.0") {
          return false;
        }
        let n = UKi(t.VTE_VERSION);
        return n.major > 0 || n.minor >= 50;
      }
      return false;
    }
    BKi.exports = {
      supportsHyperlink: $no,
      stdout: $no(process.stdout),
      stderr: $no(process.stderr)
    };
  });
  function Hk(e) {
    let t = e?.env ?? process.env;
    let n = getAttacherCaps()?.hyperlinks;
    if (n !== undefined) {
      return n;
    }
    let r = e?.stdoutSupported ?? qKi.default.supportsHyperlink(process.stdout);
    if ("FORCE_HYPERLINK" in t) {
      return r;
    }
    if (r) {
      return true;
    }
    let o = t.TERM_PROGRAM;
    if (o && HKi.includes(o)) {
      return true;
    }
    if (t.TERMINAL_EMULATOR === "JetBrains-JediTerm") {
      return true;
    }
    if (t.WT_SESSION && o !== "tmux" && !t.TMUX) {
      return true;
    }
    if (o === "tmux") {
      let [a, l] = (t.TERM_PROGRAM_VERSION ?? "").split(".");
      let c = parseInt(a ?? "", 10);
      let u = parseInt(l ?? "", 10);
      if (c > 3 || c === 3 && u >= 4) {
        return true;
      }
    }
    let s = t.LC_TERMINAL;
    if (s && HKi.includes(s)) {
      return true;
    }
    if (t.TERM?.includes("kitty")) {
      return true;
    }
    return false;
  }
  function m1n() {
    return jKi.useSyncExternalStore(onAttacherCapsChange, Hk);
  }
  var jKi;
  var qKi;
  var HKi;
  var uG = __lazy(() => {
    at();
    jKi = __toESM(ot(), 1);
    qKi = __toESM($Ki(), 1);
    HKi = ["ghostty", "Hyper", "kitty", "alacritty", "iTerm.app", "iTerm2"];
  });
  function Link(e) {
    let t = WKi.c(5);
    let {
      children: n,
      url: r,
      fallback: o,
      assumeSupport: s
    } = e;
    let i = n ?? r;
    if (s || Hk()) {
      let c;
      if (t[0] !== i || t[1] !== r) {
        c = f1n.jsx(BaseText, {
          children: f1n.jsx("ink-link", {
            href: r,
            children: i
          })
        });
        t[0] = i;
        t[1] = r;
        t[2] = c;
      } else {
        c = t[2];
      }
      return c;
    }
    let a = o ?? i;
    let l;
    if (t[3] !== a) {
      l = f1n.jsx(BaseText, {
        children: a
      });
      t[3] = a;
      t[4] = l;
    } else {
      l = t[4];
    }
    return l;
  }
  var WKi;
  var f1n;
  var _ue = __lazy(() => {
    uG();
    HWe();
    WKi = __toESM(pt(), 1);
    f1n = __toESM(ie(), 1);
  });
  function GKi(e) {
    if (e.length === 0) {
      return null;
    }
    let t = e[0];
    if (t === "c") {
      return {
        type: "reset"
      };
    }
    if (t === "7") {
      return {
        type: "cursor",
        action: {
          type: "save"
        }
      };
    }
    if (t === "8") {
      return {
        type: "cursor",
        action: {
          type: "restore"
        }
      };
    }
    if (t === "D") {
      return {
        type: "scroll",
        action: {
          type: "index"
        }
      };
    }
    if (t === "M") {
      return {
        type: "scroll",
        action: {
          type: "reverseIndex"
        }
      };
    }
    if (t === "E") {
      return {
        type: "cursor",
        action: {
          type: "nextLine",
          count: 1
        }
      };
    }
    if (t === "H") {
      return null;
    }
    if ("()".includes(t) && e.length >= 2) {
      return null;
    }
    return {
      type: "unknown",
      sequence: `\x1B${e}`
    };
  }
  function VWe() {
    return {
      bold: false,
      dim: false,
      italic: false,
      underline: "none",
      blink: false,
      inverse: false,
      hidden: false,
      strikethrough: false,
      overline: false,
      fg: {
        type: "default"
      },
      bg: {
        type: "default"
      },
      underlineColor: {
        type: "default"
      }
    };
  }
  function SXd(e) {
    if (e === "") {
      return [{
        value: 0,
        subparams: [],
        colon: false
      }];
    }
    let t = [];
    let n = {
      value: null,
      subparams: [],
      colon: false
    };
    let r = "";
    let o = false;
    for (let s = 0; s <= e.length; s++) {
      let i = e[s];
      if (i === ";" || i === undefined) {
        let a = r === "" ? null : parseInt(r, 10);
        if (o) {
          if (a !== null) {
            n.subparams.push(a);
          }
        } else {
          n.value = a;
        }
        t.push(n);
        n = {
          value: null,
          subparams: [],
          colon: false
        };
        r = "";
        o = false;
      } else if (i === ":") {
        let a = r === "" ? null : parseInt(r, 10);
        if (!o) {
          n.value = a;
          n.colon = true;
          o = true;
        } else if (a !== null) {
          n.subparams.push(a);
        }
        r = "";
      } else if (i >= "0" && i <= "9") {
        r += i;
      }
    }
    return t;
  }
  function TXd(e, t) {
    let n = e[t];
    if (!n) {
      return null;
    }
    if (n.colon && n.subparams.length >= 1) {
      if (n.subparams[0] === 5 && n.subparams.length >= 2) {
        return {
          index: n.subparams[1]
        };
      }
      if (n.subparams[0] === 2 && n.subparams.length >= 4) {
        let o = n.subparams.length >= 5 ? 1 : 0;
        return {
          r: n.subparams[1 + o],
          g: n.subparams[2 + o],
          b: n.subparams[3 + o]
        };
      }
    }
    let r = e[t + 1];
    if (!r) {
      return null;
    }
    if (r.value === 5 && e[t + 2]?.value !== null && e[t + 2]?.value !== undefined) {
      return {
        index: e[t + 2].value
      };
    }
    if (r.value === 2) {
      let o = e[t + 2]?.value;
      let s = e[t + 3]?.value;
      let i = e[t + 4]?.value;
      if (o !== null && o !== undefined && s !== null && s !== undefined && i !== null && i !== undefined) {
        return {
          r: o,
          g: s,
          b: i
        };
      }
    }
    return null;
  }
  function VKi(e, t) {
    let n = SXd(e);
    let r = {
      ...t
    };
    let o = 0;
    while (o < n.length) {
      let s = n[o];
      let i = s.value ?? 0;
      if (i === 0) {
        r = VWe();
        o++;
        continue;
      }
      if (i === 1) {
        r.bold = true;
        o++;
        continue;
      }
      if (i === 2) {
        r.dim = true;
        o++;
        continue;
      }
      if (i === 3) {
        r.italic = true;
        o++;
        continue;
      }
      if (i === 4) {
        r.underline = s.colon ? bXd[s.subparams[0]] ?? "single" : "single";
        o++;
        continue;
      }
      if (i === 5 || i === 6) {
        r.blink = true;
        o++;
        continue;
      }
      if (i === 7) {
        r.inverse = true;
        o++;
        continue;
      }
      if (i === 8) {
        r.hidden = true;
        o++;
        continue;
      }
      if (i === 9) {
        r.strikethrough = true;
        o++;
        continue;
      }
      if (i === 21) {
        r.underline = "double";
        o++;
        continue;
      }
      if (i === 22) {
        r.bold = false;
        r.dim = false;
        o++;
        continue;
      }
      if (i === 23) {
        r.italic = false;
        o++;
        continue;
      }
      if (i === 24) {
        r.underline = "none";
        o++;
        continue;
      }
      if (i === 25) {
        r.blink = false;
        o++;
        continue;
      }
      if (i === 27) {
        r.inverse = false;
        o++;
        continue;
      }
      if (i === 28) {
        r.hidden = false;
        o++;
        continue;
      }
      if (i === 29) {
        r.strikethrough = false;
        o++;
        continue;
      }
      if (i === 53) {
        r.overline = true;
        o++;
        continue;
      }
      if (i === 55) {
        r.overline = false;
        o++;
        continue;
      }
      if (i >= 30 && i <= 37) {
        r.fg = {
          type: "named",
          name: h1n[i - 30]
        };
        o++;
        continue;
      }
      if (i === 39) {
        r.fg = {
          type: "default"
        };
        o++;
        continue;
      }
      if (i >= 40 && i <= 47) {
        r.bg = {
          type: "named",
          name: h1n[i - 40]
        };
        o++;
        continue;
      }
      if (i === 49) {
        r.bg = {
          type: "default"
        };
        o++;
        continue;
      }
      if (i >= 90 && i <= 97) {
        r.fg = {
          type: "named",
          name: h1n[i - 90 + 8]
        };
        o++;
        continue;
      }
      if (i >= 100 && i <= 107) {
        r.bg = {
          type: "named",
          name: h1n[i - 100 + 8]
        };
        o++;
        continue;
      }
      if (i === 38 || i === 48 || i === 58) {
        let a = TXd(n, o);
        if (a) {
          let c = "index" in a ? {
            type: "indexed",
            index: a.index
          } : {
            type: "rgb",
            ...a
          };
          if (i === 38) {
            r.fg = c;
          } else if (i === 48) {
            r.bg = c;
          } else {
            r.underlineColor = c;
          }
        }
        let l = n[o + 1]?.value;
        o += s.colon ? 1 : l === 5 ? 3 : l === 2 ? 5 : 1;
        continue;
      }
      if (i === 59) {
        r.underlineColor = {
          type: "default"
        };
        o++;
        continue;
      }
      o++;
    }
    return r;
  }
  var h1n;
  var bXd;
  var zKi = __lazy(() => {
    h1n = ["black", "red", "green", "yellow", "blue", "magenta", "cyan", "white", "brightBlack", "brightRed", "brightGreen", "brightYellow", "brightBlue", "brightMagenta", "brightCyan", "brightWhite"];
    bXd = ["none", "single", "double", "curly", "dotted", "dashed"];
  });
  function* KKi(e) {
    let t = true;
    for (let n = 0; n < e.length; n++) {
      if (e.charCodeAt(n) >= 128) {
        t = false;
        break;
      }
    }
    if (t) {
      for (let n = 0; n < e.length; n++) {
        yield {
          value: e[n],
          width: 1
        };
      }
      return;
    }
    for (let {
      segment: n
    } of JS().segment(e)) {
      if (n.length === 1) {
        let r = n.charCodeAt(0);
        if (r >= 32 && r < 127) {
          yield {
            value: n,
            width: 1
          };
          continue;
        }
      }
      yield {
        value: n,
        width: Math.max(1, an(n))
      };
    }
  }
  function EXd(e) {
    if (e === "") {
      return [];
    }
    return e.split(/[;:]/).map(t => t === "" ? 0 : parseInt(t, 10));
  }
  function vXd(e, t) {
    switch (e) {
      case f_.CURSOR_VISIBLE:
        return {
          type: "cursor",
          action: t ? {
            type: "show"
          } : {
            type: "hide"
          }
        };
      case f_.ALT_SCREEN_CLEAR:
      case f_.ALT_SCREEN:
        return {
          type: "mode",
          action: {
            type: "alternateScreen",
            enabled: t
          }
        };
      case f_.BRACKETED_PASTE:
        return {
          type: "mode",
          action: {
            type: "bracketedPaste",
            enabled: t
          }
        };
      case f_.MOUSE_NORMAL:
        return {
          type: "mode",
          action: {
            type: "mouseTracking",
            mode: t ? "normal" : "off"
          }
        };
      case f_.MOUSE_BUTTON:
        return {
          type: "mode",
          action: {
            type: "mouseTracking",
            mode: t ? "button" : "off"
          }
        };
      case f_.MOUSE_ANY:
        return {
          type: "mode",
          action: {
            type: "mouseTracking",
            mode: t ? "any" : "off"
          }
        };
      case f_.FOCUS_EVENTS:
        return {
          type: "mode",
          action: {
            type: "focusEvents",
            enabled: t
          }
        };
      default:
        return null;
    }
  }
  function wXd(e) {
    let t = e.slice(2);
    if (t.length === 0) {
      return null;
    }
    let n = t.charCodeAt(t.length - 1);
    let r = t.slice(0, -1);
    let o = "";
    let s = r;
    let i = "";
    if (r.length > 0 && "?>=<".includes(r[0])) {
      o = r[0];
      s = r.slice(1);
    }
    let a = s.charCodeAt(s.length - 1);
    if (s.length > 0 && !(a >= 48 && a <= 59)) {
      let d = s.match(/([^0-9;:]+)$/);
      if (d) {
        i = d[1];
        s = s.slice(0, -i.length);
      }
    }
    if (n === Cb.SGR && o === "") {
      return {
        type: "sgr",
        params: s
      };
    }
    let l = EXd(s);
    let c = l[0] ?? 1;
    let u = l[1] ?? 1;
    if (n === Cb.CUU) {
      return {
        type: "cursor",
        action: {
          type: "move",
          direction: "up",
          count: c
        }
      };
    }
    if (n === Cb.CUD || n === Cb.VPR) {
      return {
        type: "cursor",
        action: {
          type: "move",
          direction: "down",
          count: c
        }
      };
    }
    if (n === Cb.CUF || n === Cb.HPR) {
      return {
        type: "cursor",
        action: {
          type: "move",
          direction: "forward",
          count: c
        }
      };
    }
    if (n === Cb.CUB) {
      return {
        type: "cursor",
        action: {
          type: "move",
          direction: "back",
          count: c
        }
      };
    }
    if (n === Cb.CNL) {
      return {
        type: "cursor",
        action: {
          type: "nextLine",
          count: c
        }
      };
    }
    if (n === Cb.CPL) {
      return {
        type: "cursor",
        action: {
          type: "prevLine",
          count: c
        }
      };
    }
    if (n === Cb.CHA || n === Cb.HPA) {
      return {
        type: "cursor",
        action: {
          type: "column",
          col: c
        }
      };
    }
    if (n === Cb.CUP || n === Cb.HVP) {
      return {
        type: "cursor",
        action: {
          type: "position",
          row: c,
          col: u
        }
      };
    }
    if (n === Cb.VPA) {
      return {
        type: "cursor",
        action: {
          type: "row",
          row: c
        }
      };
    }
    if (n === Cb.ED) {
      return {
        type: "erase",
        action: {
          type: "display",
          region: JWi[l[0] ?? 0] ?? "toEnd"
        }
      };
    }
    if (n === Cb.EL) {
      return {
        type: "erase",
        action: {
          type: "line",
          region: XWi[l[0] ?? 0] ?? "toEnd"
        }
      };
    }
    if (n === Cb.ECH) {
      return {
        type: "erase",
        action: {
          type: "chars",
          count: c
        }
      };
    }
    if (n === Cb.IL) {
      return {
        type: "edit",
        action: {
          type: "insertLines",
          count: c
        }
      };
    }
    if (n === Cb.DL) {
      return {
        type: "edit",
        action: {
          type: "deleteLines",
          count: c
        }
      };
    }
    if (n === Cb.ICH) {
      return {
        type: "edit",
        action: {
          type: "insertChars",
          count: c
        }
      };
    }
    if (n === Cb.DCH) {
      return {
        type: "edit",
        action: {
          type: "deleteChars",
          count: c
        }
      };
    }
    if (n === Cb.SU) {
      return {
        type: "scroll",
        action: {
          type: "up",
          count: c
        }
      };
    }
    if (n === Cb.SD) {
      return {
        type: "scroll",
        action: {
          type: "down",
          count: c
        }
      };
    }
    if (n === Cb.DECSTBM) {
      return {
        type: "scroll",
        action: {
          type: "setRegion",
          top: c,
          bottom: l[1] ?? 0
        }
      };
    }
    if (n === Cb.SCOSC) {
      return {
        type: "cursor",
        action: {
          type: "save"
        }
      };
    }
    if (n === Cb.SCORC) {
      return {
        type: "cursor",
        action: {
          type: "restore"
        }
      };
    }
    if (n === Cb.DECSCUSR && i === " ") {
      return {
        type: "cursor",
        action: {
          type: "style",
          ...(MZr[c] ?? MZr[0])
        }
      };
    }
    if (o === "?" && (n === Cb.SM || n === Cb.RM)) {
      let d = n === Cb.SM;
      let p = [];
      for (let m of l) {
        let f = vXd(m, d);
        if (f) {
          p.push(f);
        }
      }
      return p.length ? p : {
        type: "unknown",
        sequence: e
      };
    }
    return {
      type: "unknown",
      sequence: e
    };
  }
  function CXd(e) {
    if (e.length < 2) {
      return "unknown";
    }
    if (e.charCodeAt(0) !== rre.ESC) {
      return "unknown";
    }
    let t = e.charCodeAt(1);
    if (t === 91) {
      return "csi";
    }
    if (t === 93) {
      return "osc";
    }
    if (t === 79) {
      return "ss3";
    }
    return "esc";
  }
  class g1n {
    tokenizer;
    forOutput;
    tail = "";
    constructor(e) {
      this.forOutput = e?.forOutput ?? false;
      this.tokenizer = mPe({
        forOutput: this.forOutput
      });
    }
    style = VWe();
    inLink = false;
    linkUrl;
    flush() {
      if (!this.tail) {
        return [];
      }
      let e = this.processText(this.tail, false);
      this.tail = "";
      return e;
    }
    reset() {
      this.tail = "";
      this.tokenizer.reset();
      this.style = VWe();
      this.inLink = false;
      this.linkUrl = undefined;
    }
    feed(e) {
      let t = this.tokenizer.feed(e);
      let n = [];
      for (let r = 0; r < t.length; r++) {
        let o = t[r];
        if (o.type === "text") {
          let s = this.tail + o.value;
          this.tail = "";
          let i = this.forOutput && r === t.length - 1;
          n.push(...this.processText(s, i));
        } else {
          if (this.tail) {
            n.push(...this.processText(this.tail, false));
            this.tail = "";
          }
          n.push(...this.processSequence(o.value));
        }
      }
      return n;
    }
    processText(e, t) {
      let n = this.style;
      if (e.indexOf("\x07") === -1) {
        let s = [...KKi(e)];
        this.holdTail(s, t);
        return s.length > 0 ? [{
          type: "text",
          graphemes: s,
          style: n
        }] : [];
      }
      let r = [];
      for (let s of e.split("\x07")) {
        if (s) {
          let i = [...KKi(s)];
          if (i.length > 0) {
            r.push({
              type: "text",
              graphemes: i,
              style: n
            });
          }
        }
        r.push({
          type: "bell"
        });
      }
      r.pop();
      let o = r.at(-1);
      if (o?.type === "text") {
        if (this.holdTail(o.graphemes, t), o.graphemes.length === 0) {
          r.pop();
        }
      }
      return r;
    }
    holdTail(e, t) {
      if (!t || e.length === 0) {
        return;
      }
      let n = e.at(-1);
      let r = n.value.charCodeAt(n.value.length - 1);
      if (r < 32) {
        return;
      }
      if (this.tail = n.value, e.pop(), r >= 55296 && r <= 56319 && e.length > 0) {
        this.tail = e.pop().value + this.tail;
      }
      while (e.length > 0 && this.tail.length <= 64) {
        let o = e.at(-1).value;
        let s = o.charCodeAt(o.length - 1);
        let i = s >= 56320 && s <= 57343 ? o.codePointAt(o.length - 2) : s;
        if (i === 8205 || i !== undefined && i >= 127462 && i <= 127487) {
          this.tail = o + this.tail;
          e.pop();
        } else {
          break;
        }
      }
    }
    processSequence(e) {
      switch (CXd(e)) {
        case "csi":
          {
            let n = wXd(e);
            if (!n) {
              return [];
            }
            if (Array.isArray(n)) {
              return n;
            }
            if (n.type === "sgr") {
              this.style = VKi(n.params, this.style);
              return [];
            }
            return [n];
          }
        case "osc":
          {
            let n = e.slice(2);
            if (n.endsWith("\x07")) {
              n = n.slice(0, -1);
            } else if (n.endsWith("\x1B\\")) {
              n = n.slice(0, -2);
            }
            let r = dGi(n);
            if (r) {
              if (r.type === "link") {
                if (r.action.type === "start") {
                  this.inLink = true;
                  this.linkUrl = r.action.url;
                } else {
                  this.inLink = false;
                  this.linkUrl = undefined;
                }
              }
              return [r];
            }
            return [];
          }
        case "esc":
          {
            let n = e.slice(1);
            let r = GKi(n);
            if (r?.type === "reset") {
              this.style = VWe();
              this.inLink = false;
              this.linkUrl = undefined;
            }
            return r ? [r] : [];
          }
        case "ss3":
          return [{
            type: "unknown",
            sequence: e
          }];
        default:
          return [{
            type: "unknown",
            sequence: e
          }];
      }
    }
  }
  var YKi = __lazy(() => {
    PP();
    bc();
    ore();
    c1();
    qJ();
    Tg();
    zKi();
    _Ht();
  });
  var JKi = __lazy(() => {
    YKi();
  });
  function RXd(e) {
    let n = new g1n().feed(e);
    let r = [];
    let o;
    for (let s of n) {
      if (s.type === "link") {
        if (s.action.type === "start") {
          o = s.action.url;
        } else {
          o = undefined;
        }
        continue;
      }
      if (s.type === "text") {
        let i = s.graphemes.map(c => c.value).join("");
        if (!i) {
          continue;
        }
        let a = xXd(s.style);
        if (o) {
          a.hyperlink = o;
        }
        let l = r.at(-1);
        if (l && AXd(l.props, a)) {
          l.text += i;
        } else {
          r.push({
            text: i,
            props: a
          });
        }
      }
    }
    return r;
  }
  function xXd(e) {
    let t = {};
    if (e.bold) {
      t.bold = true;
    }
    if (e.dim) {
      t.dim = true;
    }
    if (e.italic) {
      t.italic = true;
    }
    if (e.underline !== "none") {
      t.underline = true;
    }
    if (e.strikethrough) {
      t.strikethrough = true;
    }
    if (e.inverse) {
      t.inverse = true;
    }
    let n = XKi(e.fg);
    if (n) {
      t.color = n;
    }
    let r = XKi(e.bg);
    if (r) {
      t.backgroundColor = r;
    }
    return t;
  }
  function XKi(e) {
    switch (e.type) {
      case "named":
        return kXd[e.name];
      case "indexed":
        return `ansi256(${e.index})`;
      case "rgb":
        return `rgb(${e.r},${e.g},${e.b})`;
      case "default":
        return;
    }
  }
  function AXd(e, t) {
    return e.color === t.color && e.backgroundColor === t.backgroundColor && e.bold === t.bold && e.dim === t.dim && e.italic === t.italic && e.underline === t.underline && e.strikethrough === t.strikethrough && e.inverse === t.inverse && e.hyperlink === t.hyperlink;
  }
  function IXd(e) {
    return e.color !== undefined || e.backgroundColor !== undefined || e.dim === true || e.bold === true || e.italic === true || e.underline === true || e.strikethrough === true || e.inverse === true || e.hyperlink !== undefined;
  }
  function PXd(e) {
    return e.color !== undefined || e.backgroundColor !== undefined || e.dim === true || e.bold === true || e.italic === true || e.underline === true || e.strikethrough === true || e.inverse === true;
  }
  function QKi(e) {
    let t = Hno.c(14);
    let n;
    let r;
    let o;
    let s;
    if (t[0] !== e) {
      ({
        bold: n,
        dim: o,
        children: r,
        ...s
      } = e);
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
      t[4] = s;
    } else {
      n = t[1];
      r = t[2];
      o = t[3];
      s = t[4];
    }
    if (o) {
      let a;
      if (t[5] !== r || t[6] !== s) {
        a = Cre.jsx(BaseText, {
          ...s,
          dim: true,
          children: r
        });
        t[5] = r;
        t[6] = s;
        t[7] = a;
      } else {
        a = t[7];
      }
      return a;
    }
    if (n) {
      let a;
      if (t[8] !== r || t[9] !== s) {
        a = Cre.jsx(BaseText, {
          ...s,
          bold: true,
          children: r
        });
        t[8] = r;
        t[9] = s;
        t[10] = a;
      } else {
        a = t[10];
      }
      return a;
    }
    let i;
    if (t[11] !== r || t[12] !== s) {
      i = Cre.jsx(BaseText, {
        ...s,
        children: r
      });
      t[11] = r;
      t[12] = s;
      t[13] = i;
    } else {
      i = t[13];
    }
    return i;
  }
  var Hno;
  var ZKi;
  var Cre;
  var Ansi;
  var kXd;
  var e7i = __lazy(() => {
    _ue();
    HWe();
    JKi();
    Hno = __toESM(pt(), 1);
    ZKi = __toESM(ot(), 1);
    Cre = __toESM(ie(), 1);
    Ansi = ZKi.memo(function (t) {
      let n = Hno.c(19);
      let {
        children: r,
        dimColor: o,
        italic: s,
        wrap: i
      } = t;
      if (typeof r !== "string") {
        let m = !!o;
        let f = !!s;
        let h = String(r);
        let g;
        if (n[0] !== m || n[1] !== f || n[2] !== h || n[3] !== i) {
          g = Cre.jsx(BaseText, {
            dim: m,
            italic: f,
            wrap: i,
            children: h
          });
          n[0] = m;
          n[1] = f;
          n[2] = h;
          n[3] = i;
          n[4] = g;
        } else {
          g = n[4];
        }
        return g;
      }
      if (r === "") {
        return null;
      }
      let a;
      let l;
      if (n[5] !== r || n[6] !== o || n[7] !== s || n[8] !== i) {
        l = Symbol.for("react.early_return_sentinel");
        e: {
          let m = RXd(r);
          if (m.length === 0) {
            l = null;
            break e;
          }
          if (m.length === 1 && !IXd(m[0].props)) {
            l = Cre.jsx(BaseText, {
              dim: !!o,
              italic: !!s,
              wrap: i,
              children: m[0].text
            });
            break e;
          }
          let f;
          if (n[11] !== o || n[12] !== s) {
            f = (h, g) => {
              let y = h.props.hyperlink;
              if (o) {
                h.props.dim = true;
              }
              if (s) {
                h.props.italic = true;
              }
              let _ = PXd(h.props);
              if (y) {
                return _ ? Cre.jsx(Link, {
                  url: y,
                  children: Cre.jsx(QKi, {
                    color: h.props.color,
                    backgroundColor: h.props.backgroundColor,
                    dim: h.props.dim,
                    bold: h.props.bold,
                    italic: h.props.italic,
                    underline: h.props.underline,
                    strikethrough: h.props.strikethrough,
                    inverse: h.props.inverse,
                    children: h.text
                  })
                }, g) : Cre.jsx(Link, {
                  url: y,
                  children: h.text
                }, g);
              }
              return _ ? Cre.jsx(QKi, {
                color: h.props.color,
                backgroundColor: h.props.backgroundColor,
                dim: h.props.dim,
                bold: h.props.bold,
                italic: h.props.italic,
                underline: h.props.underline,
                strikethrough: h.props.strikethrough,
                inverse: h.props.inverse,
                children: h.text
              }, g) : h.text;
            };
            n[11] = o;
            n[12] = s;
            n[13] = f;
          } else {
            f = n[13];
          }
          a = m.map(f);
        }
        n[5] = r;
        n[6] = o;
        n[7] = s;
        n[8] = i;
        n[9] = a;
        n[10] = l;
      } else {
        a = n[9];
        l = n[10];
      }
      if (l !== Symbol.for("react.early_return_sentinel")) {
        return l;
      }
      let c = a;
      let u = !!o;
      let d = !!s;
      let p;
      if (n[14] !== c || n[15] !== u || n[16] !== d || n[17] !== i) {
        p = Cre.jsx(BaseText, {
          dim: u,
          italic: d,
          wrap: i,
          children: c
        });
        n[14] = c;
        n[15] = u;
        n[16] = d;
        n[17] = i;
        n[18] = p;
      } else {
        p = n[18];
      }
      return p;
    });
    kXd = {
      black: "ansi:black",
      red: "ansi:red",
      green: "ansi:green",
      yellow: "ansi:yellow",
      blue: "ansi:blue",
      magenta: "ansi:magenta",
      cyan: "ansi:cyan",
      white: "ansi:white",
      brightBlack: "ansi:blackBright",
      brightRed: "ansi:redBright",
      brightGreen: "ansi:greenBright",
      brightYellow: "ansi:yellowBright",
      brightBlue: "ansi:blueBright",
      brightMagenta: "ansi:magentaBright",
      brightCyan: "ansi:cyanBright",
      brightWhite: "ansi:whiteBright"
    };
  });
  function useClock() {
    let e = t7i.useContext(aG);
    if (!e) {
      throw Error("useClock must be used within a ClockProvider");
    }
    return e;
  }
  var t7i;
  var zWe = __lazy(() => {
    wPe();
    t7i = __toESM(ot(), 1);
  });
  function OXd(e) {
    let t = n7i.c(31);
    let n;
    let r;
    let o;
    let s;
    let i;
    let a;
    if (t[0] !== e) {
      ({
        onAction: o,
        tabIndex: a,
        autoFocus: n,
        children: r,
        ref: s,
        ...i
      } = e);
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
      t[4] = s;
      t[5] = i;
      t[6] = a;
    } else {
      n = t[1];
      r = t[2];
      o = t[3];
      s = t[4];
      i = t[5];
      a = t[6];
    }
    let l = a === undefined ? 0 : a;
    let [c, u] = OPe.useState(false);
    let [d, p] = OPe.useState(false);
    let [m, f] = OPe.useState(false);
    let h = useClock();
    let g = OPe.useRef(null);
    let y;
    let _;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      y = () => () => {
        g.current?.();
      };
      _ = [];
      t[7] = y;
      t[8] = _;
    } else {
      y = t[7];
      _ = t[8];
    }
    OPe.useEffect(y, _);
    let b;
    if (t[9] !== h || t[10] !== o) {
      b = N => {
        if (N.key === "return" || N.key === " ") {
          N.preventDefault();
          f(true);
          o();
          g.current?.();
          g.current = h.setTimeout(() => f(false), 100);
        }
      };
      t[9] = h;
      t[10] = o;
      t[11] = b;
    } else {
      b = t[11];
    }
    let S = b;
    let E;
    if (t[12] !== o) {
      E = N => {
        o();
      };
      t[12] = o;
      t[13] = E;
    } else {
      E = t[13];
    }
    let C = E;
    let x;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      x = N => u(true);
      t[14] = x;
    } else {
      x = t[14];
    }
    let A = x;
    let k;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      k = N => u(false);
      t[15] = k;
    } else {
      k = t[15];
    }
    let I = k;
    let O;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      O = () => p(true);
      t[16] = O;
    } else {
      O = t[16];
    }
    let M = O;
    let L;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      L = () => p(false);
      t[17] = L;
    } else {
      L = t[17];
    }
    let P = L;
    let F;
    if (t[18] !== r || t[19] !== m || t[20] !== c || t[21] !== d) {
      F = typeof r === "function" ? r({
        focused: c,
        hovered: d,
        active: m
      }) : r;
      t[18] = r;
      t[19] = m;
      t[20] = c;
      t[21] = d;
      t[22] = F;
    } else {
      F = t[22];
    }
    let H = F;
    let U;
    if (t[23] !== n || t[24] !== H || t[25] !== C || t[26] !== S || t[27] !== s || t[28] !== i || t[29] !== l) {
      U = r7i.jsx(oJd, {
        ref: s,
        tabIndex: l,
        autoFocus: n,
        onKeyDown: S,
        onClick: C,
        onFocus: A,
        onBlur: I,
        onMouseEnter: M,
        onMouseLeave: P,
        ...i,
        children: H
      });
      t[23] = n;
      t[24] = H;
      t[25] = C;
      t[26] = S;
      t[27] = s;
      t[28] = i;
      t[29] = l;
      t[30] = U;
    } else {
      U = t[30];
    }
    return U;
  }
  var n7i;
  var OPe;
  var r7i;
  function useIsScreenReaderEnabled() {
    return s7i.useContext($9i);
  }
  var s7i;
  var DPe = __lazy(() => {
    s7i = __toESM(ot(), 1);
  });
  function Decorative(e) {
    let {
      children: t,
      fallback: n
    } = e;
    return useIsScreenReaderEnabled() ? n ?? null : t;
  }
  var i7i = __lazy(() => {
    DPe();
  });
  function Newline(e) {
    let t = a7i.c(4);
    let {
      count: n
    } = e;
    let r = n === undefined ? 1 : n;
    let o;
    if (t[0] !== r) {
      o = `
`.repeat(r);
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== o) {
      s = l7i.jsx("ink-text", {
        children: o
      });
      t[2] = o;
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  var a7i;
  var l7i;
  var c7i = __lazy(() => {
    a7i = __toESM(pt(), 1);
    l7i = __toESM(ie(), 1);
  });
  function NoSelect(e) {
    let t = u7i.c(9);
    let n;
    let r;
    let o;
    if (t[0] !== e) {
      ({
        children: r,
        fromLeftEdge: o,
        ...n
      } = e);
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
    } else {
      n = t[1];
      r = t[2];
      o = t[3];
    }
    let s = o ? "stretch" : undefined;
    let i = o ? "from-left-edge" : true;
    let a;
    if (t[4] !== n || t[5] !== r || t[6] !== s || t[7] !== i) {
      a = d7i.jsx(oJd, {
        alignSelf: s,
        ...n,
        noSelect: i,
        children: r
      });
      t[4] = n;
      t[5] = r;
      t[6] = s;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  var u7i;
  var d7i;
  var p7i = __lazy(() => {
    u7i = __toESM(pt(), 1);
    d7i = __toESM(ie(), 1);
  });
  function RawAnsi(e) {
    let t = m7i.c(6);
    let {
      lines: n,
      width: r
    } = e;
    if (n.length === 0) {
      return null;
    }
    let o;
    if (t[0] !== n) {
      o = n.join(`
`);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n.length || t[3] !== o || t[4] !== r) {
      s = f7i.jsx("ink-raw-ansi", {
        rawText: o,
        rawWidth: r,
        rawHeight: n.length
      });
      t[2] = n.length;
      t[3] = o;
      t[4] = r;
      t[5] = s;
    } else {
      s = t[5];
    }
    return s;
  }
  var m7i;
  var f7i;
  var h7i = __lazy(() => {
    m7i = __toESM(pt(), 1);
    f7i = __toESM(ie(), 1);
  });
  function Spacer() {
    let e = g7i.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = y7i.jsx(oJd, {
        flexGrow: 1
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var g7i;
  var y7i;
  var _7i = __lazy(() => {
    g7i = __toESM(pt(), 1);
    y7i = __toESM(ie(), 1);
  });
  function b7i(e, t) {
    if (!e?.yogaNode || !t) {
      return null;
    }
    let n = e.yogaNode.getComputedHeight();
    let r = t.rows;
    let o = e.yogaNode.getComputedTop();
    let s = e.parentNode;
    let i = e.yogaNode;
    while (s) {
      if (s.yogaNode) {
        o += s.yogaNode.getComputedTop();
        i = s.yogaNode;
      }
      if (s.scrollTop) {
        o -= s.scrollTop;
      }
      s = s.parentNode;
    }
    let a = i.getComputedHeight();
    let l = o + n;
    let c = a > r ? 1 : 0;
    let u = Math.max(0, a - r) + c;
    let d = u + r;
    if (n === 0) {
      return o >= u && o < d;
    }
    return l > u && o < d;
  }
  function useTerminalViewport() {
    let e = eV.useContext(gue);
    let t = eV.useRef(null);
    let n = eV.useRef({
      isVisible: true
    });
    let r = eV.useCallback(c => {
      t.current = c;
    }, []);
    function o() {
      let c = b7i(t.current, e);
      if (c === null) {
        return n.current.isVisible;
      }
      if (c !== n.current.isVisible) {
        n.current = {
          isVisible: c
        };
      }
      return c;
    }
    let s = eV.useRef(o);
    s.current = o;
    let i = eV.useCallback(() => s.current(), []);
    let a = eV.useRef(e);
    a.current = e;
    let l = eV.useCallback(() => b7i(t.current, a.current), []);
    eV.useLayoutEffect(() => {
      o();
    });
    return [r, n.current, i, l];
  }
  var eV;
  var ZHt = __lazy(() => {
    pct();
    eV = __toESM(ot(), 1);
  });
  function qno(e) {
    return Me.CLAUDE_CODE_ALT_SCREEN_FULL_REPAINT ? Math.max(e, 480) : e;
  }
  function useAnimationFrame(e = 16) {
    let t = KWe.useContext(aG);
    let [n, {
      isVisible: r
    }, o] = useTerminalViewport();
    let s = KNn();
    let i = KWe.useRef(s);
    let a = r;
    if (i.current !== s) {
      i.current = s;
      a = o();
    }
    let l = !!t && a && e !== null;
    let c = e === null ? null : Math.ceil(qno(e) / 16) * 16;
    let u = KWe.useRef(0);
    let d = KWe.useSyncExternalStore(l ? t.subscribeKeepAlive : dct, () => l ? u.current = Math.max(u.current, Math.floor(t.now() / c) * c) : u.current);
    return [n, d];
  }
  var KWe;
  var ejt = __lazy(() => {
    pr();
    wPe();
    vPe();
    ZHt();
    KWe = __toESM(ot(), 1);
  });
  var S7i;
  var MXd = () => S7i.useContext(JVi);
  function useDebouncedCallback(e, t) {
    let n = Rre.useContext(aG);
    let r = Rre.useRef(e);
    r.current = e;
    let o = Rre.useRef(null);
    let s = Rre.useCallback(a => () => o.current?.(), []);
    Rre.useSyncExternalStore(s, YNn);
    let i = n?.setTimeout ?? uct;
    return Rre.useMemo(() => {
      let a = (...l) => {
        o.current?.();
        o.current = i(() => {
          o.current = null;
          r.current(...l);
        }, t);
      };
      a.cancel = () => {
        o.current?.();
        o.current = null;
      };
      return a;
    }, [i, t]);
  }
  var Rre;
  var T7i = __lazy(() => {
    wPe();
    Rre = __toESM(ot(), 1);
  });
  function useFocus() {
    let {
      focusManager: e,
      rootNode: t
    } = Cct.useContext(JVi);
    let n = Cct.useSyncExternalStore(e?.subscribe ?? E7i, () => e?.activeElement ?? null);
    return Cct.useMemo(() => ({
      activeElement: n,
      focusNext: () => {
        if (e && t) {
          e.focusNext(t);
        }
      },
      focusPrevious: () => {
        if (e && t) {
          e.focusPrevious(t);
        }
      },
      focusDirection: r => {
        if (e && t) {
          return e.focusDirection(r, t);
        }
        return false;
      },
      focus: r => e?.focus(r),
      blur: () => e?.blur(),
      subscribe: e?.subscribe ?? E7i
    }), [n, e, t]);
  }
  var Cct;
  var E7i = () => () => {};
  var y1n = __lazy(() => {
    Cct = __toESM(ot(), 1);
  });
  function useHasFocus(e) {
    let {
      focusManager: t
    } = _1n.useContext(JVi);
    return _1n.useSyncExternalStore(t?.subscribe ?? NXd, () => {
      let n = e.current;
      let r = t?.activeElement;
      if (!n || !r) {
        return false;
      }
      return gre(r, n);
    }, () => false);
  }
  var _1n;
  var NXd = () => () => {};
  var Gno = __lazy(() => {
    iSe();
    _1n = __toESM(ot(), 1);
  });
  function useAnimationTimer(e) {
    let t = tV.useContext(aG);
    let n = e === null ? null : Math.ceil(qno(e) / 16) * 16;
    let r = tV.useRef(null);
    let o = tV.useMemo(() => {
      if (!t || n === null) {
        return dct;
      }
      return s => t.subscribeFollower(() => {
        r.current = t.now();
        s();
      });
    }, [t, n]);
    return tV.useSyncExternalStore(o, () => {
      if (!t || n === null) {
        r.current = null;
        return 0;
      }
      if (r.current === null) {
        r.current = t.now();
      }
      return Math.floor(r.current / n) * n;
    });
  }
  function useInterval(e, t, n) {
    let r = tV.useRef(e);
    r.current = e;
    let o = tV.useContext(aG);
    let s = n?.immediate ?? false;
    let i = tV.useRef(null);
    let a = tV.useMemo(() => !o || t === null ? l => (i.current = null, () => {}) : l => {
      if (s && i.current === null) {
        r.current();
      }
      i.current = t;
      let c = false;
      let u;
      let d = () => {
        if (c) {
          return;
        }
        try {
          r.current();
        } finally {
          if (!c) {
            u = o.setTimeout(d, t);
          }
        }
      };
      u = o.setTimeout(d, t);
      return () => {
        c = true;
        u();
      };
    }, [o, t, s]);
    tV.useSyncExternalStore(a, YNn);
  }
  var tV;
  var Vno = __lazy(() => {
    wPe();
    ejt();
    tV = __toESM(ot(), 1);
  });
  function useSelection() {
    YWe.useContext(oWi);
    let e = rVd.get(process.stdout);
    return YWe.useMemo(() => {
      if (!e) {
        return {
          copySelection: () => "",
          copySelectionNoClear: () => "",
          getSelectedText: () => "",
          clearSelection: () => {},
          hasSelection: () => false,
          getState: () => null,
          subscribe: () => () => {},
          moveFocus: () => {},
          setSelectionBgColor: () => {}
        };
      }
      return {
        copySelection: () => e.copySelection(),
        copySelectionNoClear: () => e.copySelectionNoClear(),
        getSelectedText: () => e.getSelectedText(),
        clearSelection: () => e.clearTextSelection(),
        hasSelection: () => e.hasTextSelection(),
        getState: () => e.selection,
        subscribe: t => e.subscribeToSelectionChange(t),
        moveFocus: t => e.moveSelectionFocus(t),
        setSelectionBgColor: t => e.setSelectionBgColor(t)
      };
    }, [e]);
  }
  function v7i() {
    YWe.useContext(oWi);
    let e = rVd.get(process.stdout);
    return YWe.useSyncExternalStore(e ? e.subscribeToSelectionChange : LXd, e ? e.hasTextSelection : FXd);
  }
  var YWe;
  var LXd = () => () => {};
  var FXd = () => false;
  var JWe = __lazy(() => {
    YWe = __toESM(ot(), 1);
  });
  function useTabStatus(e, t) {
    let n = kct.useContext(Z8);
    let r = kct.useRef(null);
    kct.useEffect(() => {
      if (e === null) {
        if (r.current !== null && n && supportsTabStatus()) {
          n(s0(IMn));
        }
        r.current = null;
        return;
      }
      if (r.current = e, !n || !supportsTabStatus()) {
        return;
      }
      let o = UXd[e];
      let s = e === "idle" && t !== undefined ? {
        ...o,
        status: t
      } : o;
      n(s0(mGi(s)));
    }, [e, t, n]);
  }
  var kct;
  var xct = (e, t, n) => ({
    type: "rgb",
    r: e,
    g: t,
    b: n
  });
  var UXd;
  var w7i = __lazy(() => {
    Tg();
    uq();
    kct = __toESM(ot(), 1);
    UXd = {
      idle: {
        indicator: xct(0, 215, 95),
        status: "Idle",
        statusColor: xct(136, 136, 136)
      },
      busy: {
        indicator: xct(255, 149, 0),
        status: "Working\u2026",
        statusColor: xct(255, 149, 0)
      },
      waiting: {
        indicator: xct(95, 135, 255),
        status: "Waiting",
        statusColor: xct(95, 135, 255)
      }
    };
  });
  function Li(e) {
    return Bun.stripANSI(e);
  }
  function useTerminalTitle(e) {
    let t = E1n.useContext(Z8);
    E1n.useEffect(() => {
      if (e === null || !t) {
        return;
      }
      let n = Li(e);
      t(H_(Wh.SET_TITLE_AND_ICON, n));
    }, [e, t]);
  }
  var E1n;
  var v1n = __lazy(() => {
    Tg();
    uq();
    E1n = __toESM(ot(), 1);
  });
  function useTimeout(e, t, n) {
    let r = cSe.useContext(aG);
    let o = typeof e === "function";
    let s = o ? e : null;
    let i = o ? t : e;
    let a = o ? undefined : t;
    let l = cSe.useRef(s);
    l.current = s;
    let c = cSe.useRef(null);
    let u = r?.setTimeout ?? uct;
    let d = cSe.useMemo(() => {
      if (i === null) {
        return dct;
      }
      let m = f => (c.current = null, f(), u(() => {
        if (c.current = m, o) {
          l.current?.();
        } else {
          f();
        }
      }, i));
      return m;
    }, [u, i, o, a, ...(n ?? [])]);
    let p = cSe.useSyncExternalStore(d, o ? BXd : () => c.current === d);
    if (!o) {
      return p;
    }
  }
  var cSe;
  var BXd = () => false;
  var tjt = __lazy(() => {
    wPe();
    cSe = __toESM(ot(), 1);
  });
  var $Xd = e => ({
    width: e.yogaNode?.getComputedWidth() ?? 0,
    height: e.yogaNode?.getComputedHeight() ?? 0
  });
  var fG = {};