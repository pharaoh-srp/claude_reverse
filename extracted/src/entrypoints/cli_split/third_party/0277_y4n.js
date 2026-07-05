  var y4n = __commonJS((Vg_, s1a) => {
    var Z1p = require("tty");
    var eLp = Z1p?.WriteStream?.prototype?.hasColors?.() ?? false;
    var df = (e, t) => {
      if (!eLp) {
        return o => o;
      }
      let n = `\x1B[${e}m`;
      let r = `\x1B[${t}m`;
      return o => {
        let s = o + "";
        let i = s.indexOf(r);
        if (i === -1) {
          return n + s + r;
        }
        let a = n;
        let l = 0;
        while (i !== -1) {
          a += s.slice(l, i) + n;
          l = i + r.length;
          i = s.indexOf(r, l);
        }
        a += s.slice(l) + r;
        return a;
      };
    };
    var Hm = {};
    Hm.reset = df(0, 0);
    Hm.bold = df(1, 22);
    Hm.dim = df(2, 22);
    Hm.italic = df(3, 23);
    Hm.underline = df(4, 24);
    Hm.overline = df(53, 55);
    Hm.inverse = df(7, 27);
    Hm.hidden = df(8, 28);
    Hm.strikethrough = df(9, 29);
    Hm.black = df(30, 39);
    Hm.red = df(31, 39);
    Hm.green = df(32, 39);
    Hm.yellow = df(33, 39);
    Hm.blue = df(34, 39);
    Hm.magenta = df(35, 39);
    Hm.cyan = df(36, 39);
    Hm.white = df(37, 39);
    Hm.gray = df(90, 39);
    Hm.bgBlack = df(40, 49);
    Hm.bgRed = df(41, 49);
    Hm.bgGreen = df(42, 49);
    Hm.bgYellow = df(43, 49);
    Hm.bgBlue = df(44, 49);
    Hm.bgMagenta = df(45, 49);
    Hm.bgCyan = df(46, 49);
    Hm.bgWhite = df(47, 49);
    Hm.bgGray = df(100, 49);
    Hm.redBright = df(91, 39);
    Hm.greenBright = df(92, 39);
    Hm.yellowBright = df(93, 39);
    Hm.blueBright = df(94, 39);
    Hm.magentaBright = df(95, 39);
    Hm.cyanBright = df(96, 39);
    Hm.whiteBright = df(97, 39);
    Hm.bgRedBright = df(101, 49);
    Hm.bgGreenBright = df(102, 49);
    Hm.bgYellowBright = df(103, 49);
    Hm.bgBlueBright = df(104, 49);
    Hm.bgMagentaBright = df(105, 49);
    Hm.bgCyanBright = df(106, 49);
    Hm.bgWhiteBright = df(107, 49);
    s1a.exports = Hm;
  });