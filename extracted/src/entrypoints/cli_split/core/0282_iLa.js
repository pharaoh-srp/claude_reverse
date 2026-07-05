  function iLa(e) {
    return e > 0 ? UMe.default.cursorDown(e) : "";
  }
  class C4n {
    rl;
    height = 0;
    extraLinesUnderPrompt = 0;
    cursorPos;
    constructor(e) {
      this.rl = e;
      this.rl = e;
      this.cursorPos = e.getCursorPos();
    }
    write(e) {
      this.rl.output.unmute();
      this.rl.output.write(e);
      this.rl.output.mute();
    }
    render(e, t = "") {
      let n = OLp(e);
      let r = aLa.default(n);
      let o = r;
      if (this.rl.line.length > 0) {
        o = o.slice(0, -this.rl.line.length);
      }
      this.rl.setPrompt(o);
      this.cursorPos = this.rl.getCursorPos();
      let s = E4n();
      if (e = S9t(e, s), t = S9t(t, s), r.length % s === 0) {
        e += `
`;
      }
      let i = e + (t ? `
` + t : "");
      let l = Math.floor(r.length / s) - this.cursorPos.rows + (t ? sLa(t) : 0);
      if (l > 0) {
        i += UMe.default.cursorUp(l);
      }
      i += UMe.default.cursorTo(this.cursorPos.cols);
      this.write(iLa(this.extraLinesUnderPrompt) + UMe.default.eraseLines(this.height) + i);
      this.extraLinesUnderPrompt = l;
      this.height = sLa(i);
    }
    checkCursorPos() {
      let e = this.rl.getCursorPos();
      if (e.cols !== this.cursorPos.cols) {
        this.write(UMe.default.cursorTo(e.cols));
        this.cursorPos = e;
      }
    }
    done({
      clearContent: e
    }) {
      this.rl.setPrompt("");
      let t = iLa(this.extraLinesUnderPrompt);
      t += e ? UMe.default.eraseLines(this.height) : `
`;
      t += UMe.default.cursorShow;
      this.write(t);
      this.rl.close();
    }
  }
  var aLa;
  var UMe;
  var sLa = e => e.split(`
`).length;
  var OLp = e => e.split(`
`).pop() ?? "";
  var lLa = __lazy(() => {
    v4n();
    aLa = __toESM(C_o(), 1);
    UMe = __toESM(oLa(), 1);
  });
  var D_o;
  var cLa = __lazy(() => {
    D_o = class D_o extends Promise {
      static withResolver() {
        let e;
        let t;
        return {
          promise: new Promise((r, o) => {
            e = r;
            t = o;
          }),
          resolve: e,
          reject: t
        };
      }
    };
  });
  function m6e(e) {
    return (n, r = {}) => {
      let {
        input: o = process.stdin,
        signal: s
      } = r;
      let i = new Set();
      let a = new pLa.default();
      a.pipe(r.output ?? process.stdout);
      let l = uLa.createInterface({
        terminal: true,
        input: o,
        output: a
      });
      let c = new C4n(l);
      let {
        promise: u,
        resolve: d,
        reject: p
      } = D_o.withResolver();
      let m = () => p(new g_o());
      if (s) {
        let h = () => p(new h_o({
          cause: s.reason
        }));
        if (s.aborted) {
          h();
          return Object.assign(u, {
            cancel: m
          });
        }
        s.addEventListener("abort", h);
        i.add(() => s.removeEventListener("abort", h));
      }
      i.add(Ute((h, g) => {
        p(new y_o(`User force closed the prompt with ${h} ${g}`));
      }));
      let f = () => c.checkCursorPos();
      l.input.on("keypress", f);
      i.add(() => l.input.removeListener("keypress", f));
      return r1a(l, h => {
        let g = dLa.AsyncResource.bind(() => l6e.clearAll());
        l.on("close", g);
        i.add(() => l.removeListener("close", g));
        h(() => {
          try {
            let y = e(n, S => {
              setImmediate(() => d(S));
            });
            let [_, b] = typeof y === "string" ? [y] : y;
            c.render(_, b);
            l6e.run();
          } catch (y) {
            p(y);
          }
        });
        return Object.assign(u.then(y => (l6e.clearAll(), y), y => {
          throw l6e.clearAll(), y;
        }).finally(() => {
          i.forEach(y => y());
          c.done({
            clearContent: Boolean(r?.clearPromptOnDone)
          });
          a.end();
        }).then(() => u), {
          cancel: m
        });
      });
    };
  }
  var uLa;
  var dLa;
  var pLa;
  var mLa = __lazy(() => {
    lLa();
    cLa();
    c6e();
    m4n();
    uLa = __toESM(require("readline"));
    dLa = require("async_hooks");
    pLa = __toESM(nLa(), 1);
  });
  class f6e {
    separator = fLa.default.dim(Array.from({
      length: 15
    }).join(iLp.line));
    type = "separator";
    constructor(e) {
      if (e) {
        this.separator = e;
      }
    }
    static isSeparator(e) {
      return Boolean(e && typeof e === "object" && "type" in e && e.type === "separator");
    }
  }
  var fLa;
  var hLa = __lazy(() => {
    fLa = __toESM(y4n(), 1);
  });
  var R4n = __lazy(() => {
    p1a();
    h4n();
    g4n();
    m1a();
    b4n();
    f1a();
    T_o();
    Z1a();
    mLa();
    hLa();
    m4n();
  });
  var _T;
  var gLa = __lazy(() => {
    R4n();
    _T = m6e((e, t) => {
      let {
        transformer: n = p => p ? "yes" : "no"
      } = e;
      let [r, o] = CU("idle");
      let [s, i] = CU("");
      let a = lEe(e.theme);
      let l = d6e({
        status: r,
        theme: a
      });
      p6e((p, m) => {
        if (ift(p)) {
          let f = e.default !== false;
          if (/^(y|yes)/i.test(s)) {
            f = true;
          } else if (/^(n|no)/i.test(s)) {
            f = false;
          }
          i(n(f));
          o("done");
          t(f);
        } else {
          i(m.line);
        }
      });
      let c = s;
      let u = "";
      if (r === "done") {
        c = a.style.answer(s);
      } else {
        u = ` ${a.style.defaultAnswer(e.default === false ? "y/N" : "Y/n")}`;
      }
      let d = a.style.message(e.message, r);
      return `${l} ${d}${u} ${c}`;
    });
  });
  var jy;
  var yLa = __lazy(() => {
    R4n();
    jy = m6e((e, t) => {
      let {
        required: n,
        validate: r = () => true
      } = e;
      let o = lEe(e.theme);
      let [s, i] = CU("idle");
      let [a = "", l] = CU(e.default);
      let [c, u] = CU();
      let [d, p] = CU("");
      let m = d6e({
        status: s,
        theme: o
      });
      p6e(async (_, b) => {
        if (s !== "idle") {
          return;
        }
        if (ift(_)) {
          let S = d || a;
          i("loading");
          let E = n && !S ? "You must provide a value" : await r(S);
          if (E === true) {
            p(S);
            i("done");
            t(S);
          } else {
            b.write(d);
            u(E || "You must provide a valid value");
            i("idle");
          }
        } else if (p4n(_) && !d) {
          l(undefined);
        } else if (_.name === "tab" && !d) {
          l(undefined);
          b.clearLine(0);
          b.write(a);
          p(a);
        } else {
          p(b.line);
          u(undefined);
        }
      });
      let f = o.style.message(e.message, s);
      let h = d;
      if (typeof e.transformer === "function") {
        h = e.transformer(d, {
          isFinal: s === "done"
        });
      } else if (s === "done") {
        h = o.style.answer(d);
      }
      let g;
      if (a && s !== "done" && !d) {
        g = o.style.defaultAnswer(a);
      }
      let y = "";
      if (c) {
        y = o.style.error(c);
      }
      return [[m, f, g, h].filter(_ => _ !== undefined).join(" "), y];
    });
  });