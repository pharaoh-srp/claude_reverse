  var _ma = __commonJS((i3y, yma) => {
    var b_p = uma();
    var Duo = hma();
    var gma = l4t();
    var S_p = a4t();
    var T_p = e => e && typeof e === "object" && !Array.isArray(e);
    var jI = (e, t, n = false) => {
      if (Array.isArray(e)) {
        let u = e.map(p => jI(p, t, n));
        return p => {
          for (let m of u) {
            let f = m(p);
            if (f) {
              return f;
            }
          }
          return false;
        };
      }
      let r = T_p(e) && e.tokens && e.input;
      if (e === "" || typeof e !== "string" && !r) {
        throw TypeError("Expected pattern to be a non-empty string");
      }
      let o = t || {};
      let s = o.windows;
      let i = r ? jI.compileRe(e, t) : jI.makeRe(e, t, false, true);
      let a = i.state;
      delete i.state;
      let l = () => false;
      if (o.ignore) {
        let u = {
          ...t,
          ignore: null,
          onMatch: null,
          onResult: null
        };
        l = jI(o.ignore, u, n);
      }
      let c = (u, d = false) => {
        let {
          isMatch: p,
          match: m,
          output: f
        } = jI.test(u, i, t, {
          glob: e,
          posix: s
        });
        let h = {
          glob: e,
          state: a,
          regex: i,
          posix: s,
          input: u,
          output: f,
          match: m,
          isMatch: p
        };
        if (typeof o.onResult === "function") {
          o.onResult(h);
        }
        if (p === false) {
          h.isMatch = false;
          return d ? h : false;
        }
        if (l(u)) {
          if (typeof o.onIgnore === "function") {
            o.onIgnore(h);
          }
          h.isMatch = false;
          return d ? h : false;
        }
        if (typeof o.onMatch === "function") {
          o.onMatch(h);
        }
        return d ? h : true;
      };
      if (n) {
        c.state = a;
      }
      return c;
    };
    jI.test = (e, t, n, {
      glob: r,
      posix: o
    } = {}) => {
      if (typeof e !== "string") {
        throw TypeError("Expected input to be a string");
      }
      if (e === "") {
        return {
          isMatch: false,
          output: ""
        };
      }
      let s = n || {};
      let i = s.format || (o ? gma.toPosixSlashes : null);
      let a = e === r;
      let l = a && i ? i(e) : e;
      if (a === false) {
        l = i ? i(e) : e;
        a = l === r;
      }
      if (a === false || s.capture === true) {
        if (s.matchBase === true || s.basename === true) {
          a = jI.matchBase(e, t, n, o);
        } else {
          a = t.exec(l);
        }
      }
      return {
        isMatch: Boolean(a),
        match: a,
        output: l
      };
    };
    jI.matchBase = (e, t, n) => (t instanceof RegExp ? t : jI.makeRe(t, n)).test(gma.basename(e));
    jI.isMatch = (e, t, n) => jI(t, n)(e);
    jI.parse = (e, t) => {
      if (Array.isArray(e)) {
        return e.map(n => jI.parse(n, t));
      }
      return Duo(e, {
        ...t,
        fastpaths: false
      });
    };
    jI.scan = (e, t) => b_p(e, t);
    jI.compileRe = (e, t, n = false, r = false) => {
      if (n === true) {
        return e.output;
      }
      let o = t || {};
      let s = o.contains ? "" : "^";
      let i = o.contains ? "" : "$";
      let a = `${s}(?:${e.output})${i}`;
      if (e && e.negated === true) {
        a = `^(?!${a}).*$`;
      }
      let l = jI.toRegex(a, t);
      if (r === true) {
        l.state = e;
      }
      return l;
    };
    jI.makeRe = (e, t = {}, n = false, r = false) => {
      if (!e || typeof e !== "string") {
        throw TypeError("Expected a non-empty string");
      }
      let o = {
        negated: false,
        fastpaths: true
      };
      if (t.fastpaths !== false && (e[0] === "." || e[0] === "*")) {
        o.output = Duo.fastpaths(e, t);
      }
      if (!o.output) {
        o = Duo(e, t);
      }
      return jI.compileRe(o, t, n, r);
    };
    jI.toRegex = (e, t) => {
      try {
        let n = t || {};
        return new RegExp(e, n.flags || (n.nocase ? "i" : ""));
      } catch (n) {
        if (t && t.debug === true) {
          throw n;
        }
        return /$^/;
      }
    };
    jI.constants = S_p;
    yma.exports = jI;
  });
  var Muo = __commonJS((a3y, Tma) => {
    var bma = _ma();
    var E_p = l4t();
    function Sma(e, t, n = false) {
      if (t && (t.windows === null || t.windows === undefined)) {
        t = {
          ...t,
          windows: E_p.isWindows()
        };
      }
      return bma(e, t, n);
    }
    Object.assign(Sma, bma);
    Tma.exports = Sma;
  });