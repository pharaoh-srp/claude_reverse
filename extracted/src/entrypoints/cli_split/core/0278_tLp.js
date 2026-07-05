  function tLp() {
    if (voe.default.platform !== "win32") {
      return voe.default.env.TERM !== "linux";
    }
    return Boolean(voe.default.env.WT_SESSION) || Boolean(voe.default.env.TERMINUS_SUBLIME) || voe.default.env.ConEmuTask === "{cmd::Cmder}" || voe.default.env.TERM_PROGRAM === "Terminus-Sublime" || voe.default.env.TERM_PROGRAM === "vscode" || voe.default.env.TERM === "xterm-256color" || voe.default.env.TERM === "alacritty" || voe.default.env.TERMINAL_EMULATOR === "JetBrains-JediTerm";
  }
  var voe;
  var i1a;
  var a1a;
  var nLp;
  var rLp;
  var oLp;
  var sLp;
  var iLp;
  var zg_;
  var nQ;
  var l1a;
  var c1a = __lazy(() => {
    nQ = __toESM(y4n(), 1);
    l1a = {
      prefix: {
        idle: nQ.default.blue("?"),
        done: nQ.default.green(iLp.tick)
      },
      spinner: {
        interval: 80,
        frames: ["\u280B", "\u2819", "\u2839", "\u2838", "\u283C", "\u2834", "\u2826", "\u2827", "\u2807", "\u280F"].map(e => nQ.default.yellow(e))
      },
      style: {
        answer: nQ.default.cyan,
        message: nQ.default.bold,
        error: e => nQ.default.red(`> ${e}`),
        defaultAnswer: e => nQ.default.dim(`(${e})`),
        help: nQ.default.dim,
        highlight: nQ.default.cyan,
        key: e => nQ.default.cyan(nQ.default.bold(`<${e}>`))
      }
    };
  });
  function u1a(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    let t = e;
    while (Object.getPrototypeOf(t) !== null) {
      t = Object.getPrototypeOf(t);
    }
    return Object.getPrototypeOf(e) === t;
  }
  function d1a(...e) {
    let t = {};
    for (let n of e) {
      for (let [r, o] of Object.entries(n)) {
        let s = t[r];
        t[r] = u1a(s) && u1a(o) ? d1a(s, o) : o;
      }
    }
    return t;
  }
  function lEe(...e) {
    let t = [l1a, ...e.filter(n => n != null)];
    return d1a(...t);
  }
  var T_o = __lazy(() => {
    c1a();
  });
  function d6e({
    status: e = "idle",
    theme: t
  }) {
    let [n, r] = CU(false);
    let [o, s] = CU(0);
    let {
      prefix: i,
      spinner: a
    } = lEe(t);
    if (u6e(() => {
      if (e === "loading") {
        let c;
        let u = -1;
        let d = setTimeout(E_o.AsyncResource.bind(() => {
          r(true);
          c = setInterval(E_o.AsyncResource.bind(() => {
            u = u + 1;
            s(u % a.frames.length);
          }), a.interval);
        }), 300);
        return () => {
          clearTimeout(d);
          clearInterval(c);
        };
      } else {
        r(false);
      }
    }, [e]), n) {
      return a.frames[o];
    }
    return typeof i === "string" ? i : i[e === "loading" ? "idle" : e];
  }
  var E_o;
  var p1a = __lazy(() => {
    h4n();
    g4n();
    T_o();
    E_o = require("async_hooks");
  });
  function y9t(e, t) {
    return aft(n => {
      let r = n.get();
      if (!r || r.dependencies.length !== t.length || r.dependencies.some((o, s) => o !== t[s])) {
        let o = e();
        n.set({
          value: o,
          dependencies: t
        });
        return o;
      }
      return r.value;
    });
  }
  var m1a = __lazy(() => {
    c6e();
  });
  function FMe(e) {
    return CU({
      current: e
    })[0];
  }
  var b4n = __lazy(() => {
    h4n();
  });
  function p6e(e) {
    let t = FMe(e);
    t.current = e;
    u6e(n => {
      let r = false;
      let o = S_o((s, i) => {
        if (r) {
          return;
        }
        t.current(i, n);
      });
      n.input.on("keypress", o);
      return () => {
        r = true;
        n.input.removeListener("keypress", o);
      };
    }, []);
  }
  var f1a = __lazy(() => {
    b4n();
    g4n();
    c6e();
  });