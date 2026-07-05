  var FKi = __commonJS((cyy, LKi) => {
    var lyy = require("os");
    var NKi = require("tty");
    var XJ = mhn();
    var {
      env: p1
    } = process;
    var PPe;
    if (XJ("no-color") || XJ("no-colors") || XJ("color=false") || XJ("color=never")) {
      PPe = 0;
    } else if (XJ("color") || XJ("colors") || XJ("color=true") || XJ("color=always")) {
      PPe = 1;
    }
    if ("FORCE_COLOR" in p1) {
      if (p1.FORCE_COLOR === "true") {
        PPe = 1;
      } else if (p1.FORCE_COLOR === "false") {
        PPe = 0;
      } else {
        PPe = p1.FORCE_COLOR.length === 0 ? 1 : Math.min(parseInt(p1.FORCE_COLOR, 10), 3);
      }
    }
    function Uno(e) {
      if (e === 0) {
        return false;
      }
      return {
        level: e,
        hasBasic: true,
        has256: e >= 2,
        has16m: e >= 3
      };
    }
    function Bno(e, t) {
      if (PPe === 0) {
        return 0;
      }
      if (XJ("color=16m") || XJ("color=full") || XJ("color=truecolor")) {
        return 3;
      }
      if (XJ("color=256")) {
        return 2;
      }
      if (e && !t && PPe === undefined) {
        return 0;
      }
      let n = PPe || 0;
      if (p1.TERM === "dumb") {
        return n;
      }
      if ("CI" in p1) {
        if (["TRAVIS", "CIRCLECI", "APPVEYOR", "GITLAB_CI", "GITHUB_ACTIONS", "BUILDKITE"].some(r => r in p1) || p1.CI_NAME === "codeship") {
          return 1;
        }
        return n;
      }
      if ("TEAMCITY_VERSION" in p1) {
        return /^(9\.(0*[1-9]\d*)\.|\d{2,}\.)/.test(p1.TEAMCITY_VERSION) ? 1 : 0;
      }
      if (p1.COLORTERM === "truecolor") {
        return 3;
      }
      if ("TERM_PROGRAM" in p1) {
        let r = parseInt((p1.TERM_PROGRAM_VERSION || "").split(".")[0], 10);
        switch (p1.TERM_PROGRAM) {
          case "iTerm.app":
            return r >= 3 ? 3 : 2;
          case "Apple_Terminal":
            return 2;
        }
      }
      if (/-256(color)?$/i.test(p1.TERM)) {
        return 2;
      }
      if (/^screen|^xterm|^vt100|^vt220|^rxvt|color|ansi|cygwin|linux/i.test(p1.TERM)) {
        return 1;
      }
      if ("COLORTERM" in p1) {
        return 1;
      }
      return n;
    }
    function yXd(e) {
      let t = Bno(e, e && e.isTTY);
      return Uno(t);
    }
    LKi.exports = {
      supportsColor: yXd,
      stdout: Uno(Bno(true, NKi.isatty(1))),
      stderr: Uno(Bno(true, NKi.isatty(2)))
    };
  });