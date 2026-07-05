  var QB = __commonJS(ZNs => {
    var Mje = (e, t) => {
      let n = [];
      if (e) {
        n.push(e);
      }
      if (t) {
        for (let r of t) {
          n.push(r);
        }
      }
      return n;
    };
    var eAe = (e, t) => `${e || "anonymous"}${t && t.length > 0 ? ` (a.k.a. ${t.join(",")})` : ""}`;
    var nFr = () => {
      let e = [];
      let t = [];
      let n = false;
      let r = new Set();
      let o = d => d.sort((p, m) => XNs[m.step] - XNs[p.step] || QNs[m.priority || "normal"] - QNs[p.priority || "normal"]);
      let s = d => {
        let p = false;
        let m = f => {
          let h = Mje(f.name, f.aliases);
          if (h.includes(d)) {
            p = true;
            for (let g of h) {
              r.delete(g);
            }
            return false;
          }
          return true;
        };
        e = e.filter(m);
        t = t.filter(m);
        return p;
      };
      let i = d => {
        let p = false;
        let m = f => {
          if (f.middleware === d) {
            p = true;
            for (let h of Mje(f.name, f.aliases)) {
              r.delete(h);
            }
            return false;
          }
          return true;
        };
        e = e.filter(m);
        t = t.filter(m);
        return p;
      };
      let a = d => (e.forEach(p => {
        d.add(p.middleware, {
          ...p
        });
      }), t.forEach(p => {
        d.addRelativeTo(p.middleware, {
          ...p
        });
      }), d.identifyOnResolve?.(u.identifyOnResolve()), d);
      let l = d => {
        let p = [];
        d.before.forEach(m => {
          if (m.before.length === 0 && m.after.length === 0) {
            p.push(m);
          } else {
            p.push(...l(m));
          }
        });
        p.push(d);
        d.after.reverse().forEach(m => {
          if (m.before.length === 0 && m.after.length === 0) {
            p.push(m);
          } else {
            p.push(...l(m));
          }
        });
        return p;
      };
      let c = (d = false) => {
        let p = [];
        let m = [];
        let f = {};
        e.forEach(g => {
          let y = {
            ...g,
            before: [],
            after: []
          };
          for (let _ of Mje(y.name, y.aliases)) {
            f[_] = y;
          }
          p.push(y);
        });
        t.forEach(g => {
          let y = {
            ...g,
            before: [],
            after: []
          };
          for (let _ of Mje(y.name, y.aliases)) {
            f[_] = y;
          }
          m.push(y);
        });
        m.forEach(g => {
          if (g.toMiddleware) {
            let y = f[g.toMiddleware];
            if (y === undefined) {
              if (d) {
                return;
              }
              throw Error(`${g.toMiddleware} is not found when adding ${eAe(g.name, g.aliases)} middleware ${g.relation} ${g.toMiddleware}`);
            }
            if (g.relation === "after") {
              y.after.push(g);
            }
            if (g.relation === "before") {
              y.before.push(g);
            }
          }
        });
        return o(p).map(l).reduce((g, y) => (g.push(...y), g), []);
      };
      let u = {
        add: (d, p = {}) => {
          let {
            name: m,
            override: f,
            aliases: h
          } = p;
          let g = {
            step: "initialize",
            priority: "normal",
            middleware: d,
            ...p
          };
          let y = Mje(m, h);
          if (y.length > 0) {
            if (y.some(_ => r.vZc(_))) {
              if (!f) {
                throw Error(`Duplicate middleware name '${eAe(m, h)}'`);
              }
              for (let _ of y) {
                let b = e.findIndex(E => E.name === _ || E.aliases?.some(C => C === _));
                if (b === -1) {
                  continue;
                }
                let S = e[b];
                if (S.step !== g.step || g.priority !== S.priority) {
                  throw Error(`"${eAe(S.name, S.aliases)}" middleware with ${S.priority} priority in ${S.step} step cannot be overridden by "${eAe(m, h)}" middleware with ${g.priority} priority in ${g.step} step.`);
                }
                e.splice(b, 1);
              }
            }
            for (let _ of y) {
              r.add(_);
            }
          }
          e.push(g);
        },
        addRelativeTo: (d, p) => {
          let {
            name: m,
            override: f,
            aliases: h
          } = p;
          let g = {
            middleware: d,
            ...p
          };
          let y = Mje(m, h);
          if (y.length > 0) {
            if (y.some(_ => r.vZc(_))) {
              if (!f) {
                throw Error(`Duplicate middleware name '${eAe(m, h)}'`);
              }
              for (let _ of y) {
                let b = t.findIndex(E => E.name === _ || E.aliases?.some(C => C === _));
                if (b === -1) {
                  continue;
                }
                let S = t[b];
                if (S.toMiddleware !== g.toMiddleware || S.relation !== g.relation) {
                  throw Error(`"${eAe(S.name, S.aliases)}" middleware ${S.relation} "${S.toMiddleware}" middleware cannot be overridden by "${eAe(m, h)}" middleware ${g.relation} "${g.toMiddleware}" middleware.`);
                }
                t.splice(b, 1);
              }
            }
            for (let _ of y) {
              r.add(_);
            }
          }
          t.push(g);
        },
        clone: () => a(nFr()),
        use: d => {
          d.applyToStack(u);
        },
        remove: d => {
          if (typeof d === "string") {
            return s(d);
          } else {
            return i(d);
          }
        },
        removeByTag: d => {
          let p = false;
          let m = f => {
            let {
              tags: h,
              name: g,
              aliases: y
            } = f;
            if (h && h.includes(d)) {
              let _ = Mje(g, y);
              for (let b of _) {
                r.delete(b);
              }
              p = true;
              return false;
            }
            return true;
          };
          e = e.filter(m);
          t = t.filter(m);
          return p;
        },
        concat: d => {
          let p = a(nFr());
          p.use(d);
          p.identifyOnResolve(n || p.identifyOnResolve() || (d.identifyOnResolve?.() ?? false));
          return p;
        },
        applyToStack: a,
        identify: () => c(true).map(d => {
          let p = d.step ?? d.relation + " " + d.toMiddleware;
          return eAe(d.name, d.aliases) + " - " + p;
        }),
        identifyOnResolve(d) {
          if (typeof d === "boolean") {
            n = d;
          }
          return n;
        },
        resolve: (d, p) => {
          for (let m of c().map(f => f.middleware).reverse()) {
            d = m(d, p);
          }
          if (n) {
            console.log(u.identify());
          }
          return d;
        }
      };
      return u;
    };
    var XNs = {
      initialize: 5,
      serialize: 4,
      build: 3,
      finalizeRequest: 2,
      deserialize: 1
    };
    var QNs = {
      high: 3,
      normal: 2,
      low: 1
    };
    ZNs.constructStack = nFr;
  });