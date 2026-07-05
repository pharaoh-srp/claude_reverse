  var bLa = __commonJS((d__, M_o) => {
    var qy = M_o.exports;
    M_o.exports.default = qy;
    var _La = process.env.TERM_PROGRAM === "Apple_Terminal";
    qy.cursorTo = (e, t) => {
      if (typeof e !== "number") {
        throw TypeError("The `x` argument is required");
      }
      if (typeof t !== "number") {
        return "\x1B[" + (e + 1) + "G";
      }
      return "\x1B[" + (t + 1) + ";" + (e + 1) + "H";
    };
    qy.cursorMove = (e, t) => {
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
    qy.cursorUp = (e = 1) => "\x1B[" + e + "A";
    qy.cursorDown = (e = 1) => "\x1B[" + e + "B";
    qy.cursorForward = (e = 1) => "\x1B[" + e + "C";
    qy.cursorBackward = (e = 1) => "\x1B[" + e + "D";
    qy.cursorLeft = "\x1B[" + "G";
    qy.cursorSavePosition = _La ? "\x1B7" : "\x1B[" + "s";
    qy.cursorRestorePosition = _La ? "\x1B8" : "\x1B[" + "u";
    qy.cursorGetPosition = "\x1B[" + "6n";
    qy.cursorNextLine = "\x1B[" + "E";
    qy.cursorPrevLine = "\x1B[" + "F";
    qy.cursorHide = "\x1B[" + "?25l";
    qy.cursorShow = "\x1B[" + "?25h";
    qy.eraseLines = e => {
      let t = "";
      for (let n = 0; n < e; n++) {
        t += qy.eraseLine + (n < e - 1 ? qy.cursorUp() : "");
      }
      if (e) {
        t += qy.cursorLeft;
      }
      return t;
    };
    qy.eraseEndLine = "\x1B[" + "K";
    qy.eraseStartLine = "\x1B[" + "1K";
    qy.eraseLine = "\x1B[" + "2K";
    qy.eraseDown = "\x1B[" + "J";
    qy.eraseUp = "\x1B[" + "1J";
    qy.eraseScreen = "\x1B[" + "2J";
    qy.scrollUp = "\x1B[" + "S";
    qy.scrollDown = "\x1B[" + "T";
    qy.clearScreen = "\x1Bc";
    qy.clearTerminal = `${qy.eraseScreen}${"\x1B["}3J${"\x1B["}H`;
    qy.beep = "\x07";
    qy.link = (e, t) => ["\x1B]", "8", ";", ";", t, "\x07", e, "\x1B]", "8", ";", ";", "\x07"].join("");
    qy.image = (e, t = {}) => {
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
    qy.iTerm = {
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