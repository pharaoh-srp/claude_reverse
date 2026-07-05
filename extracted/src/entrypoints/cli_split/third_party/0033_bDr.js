  var bDr = __commonJS((nbh, _ws) => {
    var Utt = 1000 * 60;
    var Btt = Utt * 60;
    var BHe = Btt * 24;
    var O0u = BHe * 7;
    var D0u = BHe * 365.25;
    _ws.exports = function (e, t) {
      t = t || {};
      var n = typeof e;
      if (n === "string" && e.length > 0) {
        return M0u(e);
      } else if (n === "number" && isFinite(e)) {
        return t.long ? L0u(e) : N0u(e);
      }
      throw Error("val is not a non-empty string or a valid number. val=" + JSON.stringify(e));
    };
    function M0u(e) {
      if (e = String(e), e.length > 100) {
        return;
      }
      var t = /^(-?(?:\d+)?\.?\d+) *(milliseconds?|msecs?|ms|seconds?|secs?|s|minutes?|mins?|m|hours?|hrs?|h|days?|d|weeks?|w|years?|yrs?|y)?$/i.exec(e);
      if (!t) {
        return;
      }
      var n = parseFloat(t[1]);
      var r = (t[2] || "ms").toLowerCase();
      switch (r) {
        case "years":
        case "year":
        case "yrs":
        case "yr":
        case "y":
          return n * D0u;
        case "weeks":
        case "week":
        case "w":
          return n * O0u;
        case "days":
        case "day":
        case "d":
          return n * BHe;
        case "hours":
        case "hour":
        case "hrs":
        case "hr":
        case "h":
          return n * Btt;
        case "minutes":
        case "minute":
        case "mins":
        case "min":
        case "m":
          return n * Utt;
        case "seconds":
        case "second":
        case "secs":
        case "sec":
        case "s":
          return n * 1000;
        case "milliseconds":
        case "millisecond":
        case "msecs":
        case "msec":
        case "ms":
          return n;
        default:
          return;
      }
    }
    function N0u(e) {
      var t = Math.abs(e);
      if (t >= BHe) {
        return Math.round(e / BHe) + "d";
      }
      if (t >= Btt) {
        return Math.round(e / Btt) + "h";
      }
      if (t >= Utt) {
        return Math.round(e / Utt) + "m";
      }
      if (t >= 1000) {
        return Math.round(e / 1000) + "s";
      }
      return e + "ms";
    }
    function L0u(e) {
      var t = Math.abs(e);
      if (t >= BHe) {
        return dhn(e, t, BHe, "day");
      }
      if (t >= Btt) {
        return dhn(e, t, Btt, "hour");
      }
      if (t >= Utt) {
        return dhn(e, t, Utt, "minute");
      }
      if (t >= 1000) {
        return dhn(e, t, 1000, "second");
      }
      return e + " ms";
    }
    function dhn(e, t, n, r) {
      var o = t >= n * 1.5;
      return Math.round(e / n) + " " + r + (o ? "s" : "");
    }
  });
  var SDr = __commonJS((rbh, bws) => {
    function F0u(e) {
      n.debug = n;
      n.default = n;
      n.coerce = l;
      n.disable = i;
      n.enable = o;
      n.enabled = a;
      n.humanize = bDr();
      n.destroy = c;
      Object.keys(e).forEach(u => {
        n[u] = e[u];
      });
      n.names = [];
      n.skips = [];
      n.formatters = {};
      function t(u) {
        let d = 0;
        for (let p = 0; p < u.length; p++) {
          d = (d << 5) - d + u.charCodeAt(p);
          d |= 0;
        }
        return n.colors[Math.abs(d) % n.colors.length];
      }
      n.selectColor = t;
      function n(u) {
        let d;
        let p = null;
        let m;
        let f;
        function h(...g) {
          if (!h.enabled) {
            return;
          }
          let y = h;
          let _ = Number(new Date());
          let b = _ - (d || _);
          if (y.diff = b, y.prev = d, y.curr = _, d = _, g[0] = n.coerce(g[0]), typeof g[0] !== "string") {
            g.unshift("%O");
          }
          let S = 0;
          g[0] = g[0].replace(/%([a-zA-Z%])/g, (C, x) => {
            if (C === "%%") {
              return "%";
            }
            S++;
            let A = n.formatters[x];
            if (typeof A === "function") {
              let k = g[S];
              C = A.call(y, k);
              g.splice(S, 1);
              S--;
            }
            return C;
          });
          n.formatArgs.call(y, g);
          (y.log || n.log).apply(y, g);
        }
        if (h.namespace = u, h.useColors = n.useColors(), h.color = n.selectColor(u), h.extend = r, h.destroy = n.destroy, Object.defineProperty(h, "enabled", {
          enumerable: true,
          configurable: false,
          get: () => {
            if (p !== null) {
              return p;
            }
            if (m !== n.namespaces) {
              m = n.namespaces;
              f = n.enabled(u);
            }
            return f;
          },
          set: g => {
            p = g;
          }
        }), typeof n.init === "function") {
          n.init(h);
        }
        return h;
      }
      function r(u, d) {
        let p = n(this.namespace + (typeof d > "u" ? ":" : d) + u);
        p.log = this.log;
        return p;
      }
      function o(u) {
        n.save(u);
        n.namespaces = u;
        n.names = [];
        n.skips = [];
        let d = (typeof u === "string" ? u : "").trim().replace(" ", ",").split(",").filter(Boolean);
        for (let p of d) {
          if (p[0] === "-") {
            n.skips.push(p.slice(1));
          } else {
            n.names.push(p);
          }
        }
      }
      function s(u, d) {
        let p = 0;
        let m = 0;
        let f = -1;
        let h = 0;
        while (p < u.length) {
          if (m < d.length && (d[m] === u[p] || d[m] === "*")) {
            if (d[m] === "*") {
              f = m;
              h = p;
              m++;
            } else {
              p++;
              m++;
            }
          } else if (f !== -1) {
            m = f + 1;
            h++;
            p = h;
          } else {
            return false;
          }
        }
        while (m < d.length && d[m] === "*") {
          m++;
        }
        return m === d.length;
      }
      function i() {
        let u = [...n.names, ...n.skips.map(d => "-" + d)].join(",");
        n.enable("");
        return u;
      }
      function a(u) {
        for (let d of n.skips) {
          if (s(u, d)) {
            return false;
          }
        }
        for (let d of n.names) {
          if (s(u, d)) {
            return true;
          }
        }
        return false;
      }
      function l(u) {
        if (u instanceof Error) {
          return u.stack || u.message;
        }
        return u;
      }
      function c() {
        console.warn("Instance method `debug.destroy()` is deprecated and no longer does anything. It will be removed in the next major version of `debug`.");
      }
      n.enable(n.load());
      return n;
    }
    bws.exports = F0u;
  });
  var Sws = __commonJS((M6, phn) => {
    M6.formatArgs = B0u;
    M6.save = $0u;
    M6.load = H0u;
    M6.useColors = U0u;
    M6.storage = j0u();
    M6.destroy = (() => {
      let e = false;
      return () => {
        if (!e) {
          e = true;
          console.warn("Instance method `debug.destroy()` is deprecated and no longer does anything. It will be removed in the next major version of `debug`.");
        }
      };
    })();
    M6.colors = ["#0000CC", "#0000FF", "#0033CC", "#0033FF", "#0066CC", "#0066FF", "#0099CC", "#0099FF", "#00CC00", "#00CC33", "#00CC66", "#00CC99", "#00CCCC", "#00CCFF", "#3300CC", "#3300FF", "#3333CC", "#3333FF", "#3366CC", "#3366FF", "#3399CC", "#3399FF", "#33CC00", "#33CC33", "#33CC66", "#33CC99", "#33CCCC", "#33CCFF", "#6600CC", "#6600FF", "#6633CC", "#6633FF", "#66CC00", "#66CC33", "#9900CC", "#9900FF", "#9933CC", "#9933FF", "#99CC00", "#99CC33", "#CC0000", "#CC0033", "#CC0066", "#CC0099", "#CC00CC", "#CC00FF", "#CC3300", "#CC3333", "#CC3366", "#CC3399", "#CC33CC", "#CC33FF", "#CC6600", "#CC6633", "#CC9900", "#CC9933", "#CCCC00", "#CCCC33", "#FF0000", "#FF0033", "#FF0066", "#FF0099", "#FF00CC", "#FF00FF", "#FF3300", "#FF3333", "#FF3366", "#FF3399", "#FF33CC", "#FF33FF", "#FF6600", "#FF6633", "#FF9900", "#FF9933", "#FFCC00", "#FFCC33"];
    function U0u() {
      if (typeof window < "u" && window.process && (window.process.type === "renderer" || window.process.__nwjs)) {
        return true;
      }
      if (typeof navigator < "u" && navigator.userAgent && navigator.userAgent.toLowerCase().match(/(edge|trident)\/(\d+)/)) {
        return false;
      }
      let e;
      return typeof document < "u" && document.documentElement && document.documentElement.style && document.documentElement.style.WebkitAppearance || typeof window < "u" && window.console && (window.console.firebug || window.console.exception && window.console.table) || typeof navigator < "u" && navigator.userAgent && (e = navigator.userAgent.toLowerCase().match(/firefox\/(\d+)/)) && parseInt(e[1], 10) >= 31 || typeof navigator < "u" && navigator.userAgent && navigator.userAgent.toLowerCase().match(/applewebkit\/(\d+)/);
    }
    function B0u(e) {
      if (e[0] = (this.useColors ? "%c" : "") + this.namespace + (this.useColors ? " %c" : " ") + e[0] + (this.useColors ? "%c " : " ") + "+" + phn.exports.humanize(this.diff), !this.useColors) {
        return;
      }
      let t = "color: " + this.color;
      e.splice(1, 0, t, "color: inherit");
      let n = 0;
      let r = 0;
      e[0].replace(/%[a-zA-Z%]/g, o => {
        if (o === "%%") {
          return;
        }
        if (n++, o === "%c") {
          r = n;
        }
      });
      e.splice(r, 0, t);
    }
    M6.log = console.debug || console.log || (() => {});
    function $0u(e) {
      try {
        if (e) {
          M6.storage.setItem("debug", e);
        } else {
          M6.storage.removeItem("debug");
        }
      } catch (t) {}
    }
    function H0u() {
      let e;
      try {
        e = M6.storage.getItem("debug");
      } catch (t) {}
      if (!e && typeof process < "u" && "env" in process) {
        e = process.env.DEBUG;
      }
      return e;
    }
    function j0u() {
      try {
        return localStorage;
      } catch (e) {}
    }
    phn.exports = SDr()(M6);
    var {
      formatters: q0u
    } = phn.exports;
    q0u.j = function (e) {
      try {
        return JSON.stringify(e);
      } catch (t) {
        return "[UnexpectedJSONParseError]: " + t.message;
      }
    };
  });
  var mhn = __commonJS((obh, Tws) => {
    Tws.exports = (e, t = process.argv) => {
      let n = e.startsWith("-") ? "" : e.length === 1 ? "-" : "--";
      let r = t.indexOf(n + e);
      let o = t.indexOf("--");
      return r !== -1 && (o === -1 || r < o);
    };
  });
  var wws = __commonJS((ibh, vws) => {
    var sbh = require("os");
    var Ews = require("tty");
    var Y7 = mhn();
    var {
      env: ON
    } = process;
    var fhn;
    if (Y7("no-color") || Y7("no-colors") || Y7("color=false") || Y7("color=never")) {
      fhn = 0;
    } else if (Y7("color") || Y7("colors") || Y7("color=true") || Y7("color=always")) {
      fhn = 1;
    }
    function W0u() {
      if ("FORCE_COLOR" in ON) {
        if (ON.FORCE_COLOR === "true") {
          return 1;
        }
        if (ON.FORCE_COLOR === "false") {
          return 0;
        }
        return ON.FORCE_COLOR.length === 0 ? 1 : Math.min(Number.parseInt(ON.FORCE_COLOR, 10), 3);
      }
    }
    function G0u(e) {
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
    function V0u(e, {
      streamIsTTY: t,
      sniffFlags: n = true
    } = {}) {
      let r = W0u();
      if (r !== undefined) {
        fhn = r;
      }
      let o = n ? fhn : r;
      if (o === 0) {
        return 0;
      }
      if (n) {
        if (Y7("color=16m") || Y7("color=full") || Y7("color=truecolor")) {
          return 3;
        }
        if (Y7("color=256")) {
          return 2;
        }
      }
      if (e && !t && o === undefined) {
        return 0;
      }
      let s = o || 0;
      if (ON.TERM === "dumb") {
        return s;
      }
      if ("CI" in ON) {
        if (["TRAVIS", "CIRCLECI", "APPVEYOR", "GITLAB_CI", "GITHUB_ACTIONS", "BUILDKITE", "DRONE"].some(i => i in ON) || ON.CI_NAME === "codeship") {
          return 1;
        }
        return s;
      }
      if ("TEAMCITY_VERSION" in ON) {
        return /^(9\.(0*[1-9]\d*)\.|\d{2,}\.)/.test(ON.TEAMCITY_VERSION) ? 1 : 0;
      }
      if (ON.COLORTERM === "truecolor") {
        return 3;
      }
      if ("TERM_PROGRAM" in ON) {
        let i = Number.parseInt((ON.TERM_PROGRAM_VERSION || "").split(".")[0], 10);
        switch (ON.TERM_PROGRAM) {
          case "iTerm.app":
            return i >= 3 ? 3 : 2;
          case "Apple_Terminal":
            return 2;
        }
      }
      if (/-256(color)?$/i.test(ON.TERM)) {
        return 2;
      }
      if (/^screen|^xterm|^vt100|^vt220|^rxvt|color|ansi|cygwin|linux/i.test(ON.TERM)) {
        return 1;
      }
      if ("COLORTERM" in ON) {
        return 1;
      }
      return s;
    }
    function TDr(e, t = {}) {
      let n = V0u(e, {
        streamIsTTY: e && e.isTTY,
        ...t
      });
      return G0u(n);
    }
    vws.exports = {
      supportsColor: TDr,
      stdout: TDr({
        isTTY: Ews.isatty(1)
      }),
      stderr: TDr({
        isTTY: Ews.isatty(2)
      })
    };
  });
  var Rws = __commonJS((DN, ghn) => {
    var z0u = require("tty");
    var hhn = require("util");
    DN.init = eIu;
    DN.log = X0u;
    DN.formatArgs = Y0u;
    DN.save = Q0u;
    DN.load = Z0u;
    DN.useColors = K0u;
    DN.destroy = hhn.deprecate(() => {}, "Instance method `debug.destroy()` is deprecated and no longer does anything. It will be removed in the next major version of `debug`.");
    DN.colors = [6, 2, 3, 4, 5, 1];
    try {
      let e = wws();
      if (e && (e.stderr || e).level >= 2) {
        DN.colors = [20, 21, 26, 27, 32, 33, 38, 39, 40, 41, 42, 43, 44, 45, 56, 57, 62, 63, 68, 69, 74, 75, 76, 77, 78, 79, 80, 81, 92, 93, 98, 99, 112, 113, 128, 129, 134, 135, 148, 149, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 178, 179, 184, 185, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 214, 215, 220, 221];
      }
    } catch (e) {}
    DN.inspectOpts = Object.keys(process.env).filter(e => /^debug_/i.test(e)).reduce((e, t) => {
      let n = t.substring(6).toLowerCase().replace(/_([a-z])/g, (o, s) => s.toUpperCase());
      let r = process.env[t];
      if (/^(yes|on|true|enabled)$/i.test(r)) {
        r = true;
      } else if (/^(no|off|false|disabled)$/i.test(r)) {
        r = false;
      } else if (r === "null") {
        r = null;
      } else {
        r = Number(r);
      }
      e[n] = r;
      return e;
    }, {});
    function K0u() {
      return "colors" in DN.inspectOpts ? Boolean(DN.inspectOpts.colors) : z0u.isatty(process.stderr.fd);
    }
    function Y0u(e) {
      let {
        namespace: t,
        useColors: n
      } = this;
      if (n) {
        let r = this.color;
        let o = "\x1B[3" + (r < 8 ? r : "8;5;" + r);
        let s = `  ${o};1m${t} \x1B[0m`;
        e[0] = s + e[0].split(`
`).join(`
` + s);
        e.push(o + "m+" + ghn.exports.humanize(this.diff) + "\x1B[0m");
      } else {
        e[0] = J0u() + t + " " + e[0];
      }
    }
    function J0u() {
      if (DN.inspectOpts.hideDate) {
        return "";
      }
      return new Date().toISOString() + " ";
    }
    function X0u(...e) {
      return process.stderr.write(hhn.formatWithOptions(DN.inspectOpts, ...e) + `
`);
    }
    function Q0u(e) {
      if (e) {
        process.env.DEBUG = e;
      } else {
        delete process.env.DEBUG;
      }
    }
    function Z0u() {
      return process.env.DEBUG;
    }
    function eIu(e) {
      e.inspectOpts = {};
      let t = Object.keys(DN.inspectOpts);
      for (let n = 0; n < t.length; n++) {
        e.inspectOpts[t[n]] = DN.inspectOpts[t[n]];
      }
    }
    ghn.exports = SDr()(DN);
    var {
      formatters: Cws
    } = ghn.exports;
    Cws.o = function (e) {
      this.inspectOpts.colors = this.useColors;
      return hhn.inspect(e, this.inspectOpts).split(`
`).map(t => t.trim()).join(" ");
    };
    Cws.O = function (e) {
      this.inspectOpts.colors = this.useColors;
      return hhn.inspect(e, this.inspectOpts);
    };
  });