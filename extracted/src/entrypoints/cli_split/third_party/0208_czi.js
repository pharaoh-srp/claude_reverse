  var czi = __commonJS((Gpy, lzi) => {
    lzi.exports = e => {
      if (typeof e !== "string") {
        throw TypeError("Expected a string");
      }
      return e.replace(/[|\\{}()[\]^$+*?.-]/g, "\\$&");
    };
  });
  var mzi = __commonJS((Vpy, pzi) => {
    var ZYd = czi();
    var eJd = typeof process === "object" && process && typeof process.cwd === "function" ? process.cwd() : ".";
    var dzi = [].concat(require("module").builtinModules, "bootstrap_node", "node").map(e => new RegExp(`(?:\\((?:node:)?${e}(?:\\.js)?:\\d+:\\d+\\)$|^\\s*at (?:node:)?${e}(?:\\.js)?:\\d+:\\d+$)`));
    dzi.push(/\((?:node:)?internal\/[^:]+:\d+:\d+\)$/, /\s*at (?:node:)?internal\/[^:]+:\d+:\d+$/, /\/\.node-spawn-wrap-\w+-\w+\/node:\d+:\d+\)?$/);
    class ono {
      constructor(e) {
        if (e = {
          ignoredPackages: [],
          ...e
        }, "internals" in e === false) {
          e.internals = ono.nodeInternals();
        }
        if ("cwd" in e === false) {
          e.cwd = eJd;
        }
        this._cwd = e.cwd.replace(/\\/g, "/");
        this._internals = [].concat(e.internals, tJd(e.ignoredPackages));
        this._wrapCallSite = e.wrapCallSite || false;
      }
      static nodeInternals() {
        return [...dzi];
      }
      clean(e, t = 0) {
        if (t = " ".repeat(t), !Array.isArray(e)) {
          e = e.split(`
`);
        }
        if (!/^\s*at /.test(e[0]) && /^\s*at /.test(e[1])) {
          e = e.slice(1);
        }
        let n = false;
        let r = null;
        let o = [];
        e.forEach(s => {
          if (s = s.replace(/\\/g, "/"), this._internals.some(a => a.test(s))) {
            return;
          }
          let i = /^\s*at /.test(s);
          if (n) {
            s = s.trimEnd().replace(/^(\s+)at /, "$1");
          } else if (s = s.trim(), i) {
            s = s.slice(3);
          }
          if (s = s.replace(`${this._cwd}/`, ""), s) {
            if (i) {
              if (r) {
                o.push(r);
                r = null;
              }
              o.push(s);
            } else {
              n = true;
              r = s;
            }
          }
        });
        return o.map(s => `${t}${s}
`).join("");
      }
      captureString(e, t = this.captureString) {
        if (typeof e === "function") {
          t = e;
          e = 1 / 0;
        }
        let {
          stackTraceLimit: n
        } = Error;
        if (e) {
          Error.stackTraceLimit = e;
        }
        let r = {};
        Error.captureStackTrace(r, t);
        let {
          stack: o
        } = r;
        Error.stackTraceLimit = n;
        return this.clean(o);
      }
      capture(e, t = this.capture) {
        if (typeof e === "function") {
          t = e;
          e = 1 / 0;
        }
        let {
          prepareStackTrace: n,
          stackTraceLimit: r
        } = Error;
        if (Error.prepareStackTrace = (i, a) => {
          if (this._wrapCallSite) {
            return a.map(this._wrapCallSite);
          }
          return a;
        }, e) {
          Error.stackTraceLimit = e;
        }
        let o = {};
        Error.captureStackTrace(o, t);
        let {
          stack: s
        } = o;
        Object.assign(Error, {
          prepareStackTrace: n,
          stackTraceLimit: r
        });
        return s;
      }
      at(e = this.at) {
        let [t] = this.capture(1, e);
        if (!t) {
          return {};
        }
        let n = {
          line: t.getLineNumber(),
          column: t.getColumnNumber()
        };
        if (uzi(n, t.getFileName(), this._cwd), t.isConstructor()) {
          Object.defineProperty(n, "constructor", {
            value: true,
            configurable: true
          });
        }
        if (t.isEval()) {
          n.evalOrigin = t.getEvalOrigin();
        }
        if (t.isNative()) {
          n.native = true;
        }
        let r;
        try {
          r = t.getTypeName();
        } catch (i) {}
        if (r && r !== "Object" && r !== "[object Object]") {
          n.type = r;
        }
        let o = t.getFunctionName();
        if (o) {
          n.function = o;
        }
        let s = t.getMethodName();
        if (s && o !== s) {
          n.method = s;
        }
        return n;
      }
      parseLine(e) {
        let t = e && e.match(nJd);
        if (!t) {
          return null;
        }
        let n = t[1] === "new";
        let r = t[2];
        let o = t[3];
        let s = t[4];
        let i = Number(t[5]);
        let a = Number(t[6]);
        let l = t[7];
        let c = t[8];
        let u = t[9];
        let d = t[10] === "native";
        let p = t[11] === ")";
        let m;
        let f = {};
        if (c) {
          f.line = Number(c);
        }
        if (u) {
          f.column = Number(u);
        }
        if (p && l) {
          let h = 0;
          for (let g = l.length - 1; g > 0; g--) {
            if (l.charAt(g) === ")") {
              h++;
            } else if (l.charAt(g) === "(" && l.charAt(g - 1) === " ") {
              if (h--, h === -1 && l.charAt(g - 1) === " ") {
                let y = l.slice(0, g - 1);
                l = l.slice(g + 1);
                r += ` (${y}`;
                break;
              }
            }
          }
        }
        if (r) {
          let h = r.match(/^(.*?) \[as (.*?)\]$/);
          if (h) {
            r = h[1];
            m = h[2];
          }
        }
        if (uzi(f, l, this._cwd), n) {
          Object.defineProperty(f, "constructor", {
            value: true,
            configurable: true
          });
        }
        if (o) {
          f.evalOrigin = o;
          f.evalLine = i;
          f.evalColumn = a;
          f.evalFile = s && s.replace(/\\/g, "/");
        }
        if (d) {
          f.native = true;
        }
        if (r) {
          f.function = r;
        }
        if (m && r !== m) {
          f.method = m;
        }
        return f;
      }
    }
    function uzi(e, t, n) {
      if (t) {
        if (t = t.replace(/\\/g, "/"), t.startsWith(`${n}/`)) {
          t = t.slice(n.length + 1);
        }
        e.file = t;
      }
    }
    function tJd(e) {
      if (e.length === 0) {
        return [];
      }
      let t = e.map(n => ZYd(n));
      return new RegExp(`[/\\\\]node_modules[/\\\\](?:${t.join("|")})[/\\\\][^:]+:\\d+:\\d+`);
    }
    var nJd = new RegExp("^(?:\\s*at )?(?:(new) )?(?:(.*?) \\()?(?:eval at ([^ ]+) \\((.+?):(\\d+):(\\d+)\\), )?(?:(.+?):(\\d+):(\\d+)|(native))(\\)?)$");
    pzi.exports = ono;
  });