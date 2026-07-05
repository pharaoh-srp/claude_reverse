  var nLa = __commonJS((Ny_, tLa) => {
    var PLp = require("stream");
    class eLa extends PLp {
      #e = null;
      constructor(e = {}) {
        super(e);
        this.writable = this.readable = true;
        this.muted = false;
        this.on("pipe", this._onpipe);
        this.replace = e.replace;
        this._prompt = e.prompt || null;
        this._hadControl = false;
      }
      #t(e, t) {
        if (this._dest) {
          return this._dest[e];
        }
        if (this._src) {
          return this._src[e];
        }
        return t;
      }
      #n(e, ...t) {
        if (typeof this._dest?.[e] === "function") {
          this._dest[e](...t);
        }
        if (typeof this._src?.[e] === "function") {
          this._src[e](...t);
        }
      }
      get isTTY() {
        if (this.#e !== null) {
          return this.#e;
        }
        return this.#t("isTTY", false);
      }
      set isTTY(e) {
        this.#e = e;
      }
      get rows() {
        return this.#t("rows");
      }
      get columns() {
        return this.#t("columns");
      }
      mute() {
        this.muted = true;
      }
      unmute() {
        this.muted = false;
      }
      _onpipe(e) {
        this._src = e;
      }
      pipe(e, t) {
        this._dest = e;
        return super.pipe(e, t);
      }
      pause() {
        if (this._src) {
          return this._src.pause();
        }
      }
      resume() {
        if (this._src) {
          return this._src.resume();
        }
      }
      write(e) {
        if (this.muted) {
          if (!this.replace) {
            return true;
          }
          if (e.match(/^\u001b/)) {
            if (e.indexOf(this._prompt) === 0) {
              e = e.slice(this._prompt.length);
              e = e.replace(/./g, this.replace);
              e = this._prompt + e;
            }
            this._hadControl = true;
            return this.emit("data", e);
          } else {
            if (this._prompt && this._hadControl && e.indexOf(this._prompt) === 0) {
              this._hadControl = false;
              this.emit("data", this._prompt);
              e = e.slice(this._prompt.length);
            }
            e = e.toString().replace(/./g, this.replace);
          }
        }
        this.emit("data", e);
      }
      end(e) {
        if (this.muted) {
          if (e && this.replace) {
            e = e.toString().replace(/./g, this.replace);
          } else {
            e = null;
          }
        }
        if (e) {
          this.emit("data", e);
        }
        this.emit("end");
      }
      destroy(...e) {
        return this.#n("destroy", ...e);
      }
      destroySoon(...e) {
        return this.#n("destroySoon", ...e);
      }
      close(...e) {
        return this.#n("close", ...e);
      }
    }
    tLa.exports = eLa;
  });
  var oLa = __commonJS((Ly_, O_o) => {
    var Hy = O_o.exports;
    O_o.exports.default = Hy;
    var rLa = process.env.TERM_PROGRAM === "Apple_Terminal";
    Hy.cursorTo = (e, t) => {
      if (typeof e !== "number") {
        throw TypeError("The `x` argument is required");
      }
      if (typeof t !== "number") {
        return "\x1B[" + (e + 1) + "G";
      }
      return "\x1B[" + (t + 1) + ";" + (e + 1) + "H";
    };
    Hy.cursorMove = (e, t) => {
      if (typeof e !== "number") {
        throw TypeError("The `x` argument is required");
      }
      let n = "";
      if (e < 0) {
        n += "\x1B[" + -e + "D";
      } else if (e > 0) {
        n += "\x1B[" + e + "C";
      }
      if (t < 0) {
        n += "\x1B[" + -t + "A";
      } else if (t > 0) {
        n += "\x1B[" + t + "B";
      }
      return n;
    };
    Hy.cursorUp = (e = 1) => "\x1B[" + e + "A";
    Hy.cursorDown = (e = 1) => "\x1B[" + e + "B";
    Hy.cursorForward = (e = 1) => "\x1B[" + e + "C";
    Hy.cursorBackward = (e = 1) => "\x1B[" + e + "D";
    Hy.cursorLeft = "\x1B[" + "G";
    Hy.cursorSavePosition = rLa ? "\x1B7" : "\x1B[" + "s";
    Hy.cursorRestorePosition = rLa ? "\x1B8" : "\x1B[" + "u";
    Hy.cursorGetPosition = "\x1B[" + "6n";
    Hy.cursorNextLine = "\x1B[" + "E";
    Hy.cursorPrevLine = "\x1B[" + "F";
    Hy.cursorHide = "\x1B[" + "?25l";
    Hy.cursorShow = "\x1B[" + "?25h";
    Hy.eraseLines = e => {
      let t = "";
      for (let n = 0; n < e; n++) {
        t += Hy.eraseLine + (n < e - 1 ? Hy.cursorUp() : "");
      }
      if (e) {
        t += Hy.cursorLeft;
      }
      return t;
    };
    Hy.eraseEndLine = "\x1B[" + "K";
    Hy.eraseStartLine = "\x1B[" + "1K";
    Hy.eraseLine = "\x1B[" + "2K";
    Hy.eraseDown = "\x1B[" + "J";
    Hy.eraseUp = "\x1B[" + "1J";
    Hy.eraseScreen = "\x1B[" + "2J";
    Hy.scrollUp = "\x1B[" + "S";
    Hy.scrollDown = "\x1B[" + "T";
    Hy.clearScreen = "\x1Bc";
    Hy.clearTerminal = `${Hy.eraseScreen}${"\x1B["}3J${"\x1B["}H`;
    Hy.beep = "\x07";
    Hy.link = (e, t) => ["\x1B]", "8", ";", ";", t, "\x07", e, "\x1B]", "8", ";", ";", "\x07"].join("");
    Hy.image = (e, t = {}) => {
      let n = `${"\x1B]"}1337;File=inline=1`;
      if (t.width) {
        n += `;width=${t.width}`;
      }
      if (t.height) {
        n += `;height=${t.height}`;
      }
      if (t.preserveAspectRatio === false) {
        n += ";preserveAspectRatio=0";
      }
      return n + ":" + e.toString("base64") + "\x07";
    };
    Hy.iTerm = {
      setCwd: (e = process.cwd()) => `${"\x1B]"}50;CurrentDir=${e}${"\x07"}`,
      annotation: (e, t = {}) => {
        let n = `${"\x1B]"}1337;`;
        let r = typeof t.x < "u";
        let o = typeof t.y < "u";
        if ((r || o) && !(r && o && typeof t.length < "u")) {
          throw Error("`x`, `y` and `length` must be defined when `x` or `y` is defined");
        }
        if (e = e.replace(/\|/g, ""), n += t.isHidden ? "AddHiddenAnnotation=" : "AddAnnotation=", t.length > 0) {
          n += (r ? [e, t.length, t.x, t.y] : [t.length, e]).join("|");
        } else {
          n += e;
        }
        return n + "\x07";
      }
    };
  });