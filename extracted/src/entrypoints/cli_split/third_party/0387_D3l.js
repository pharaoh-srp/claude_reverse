  var D3l = __commonJS(mir => {
    (function (e) {
      e.black = "\x1B[30m";
      e.red = "\x1B[31m";
      e.green = "\x1B[32m";
      e.yellow = "\x1B[33m";
      e.blue = "\x1B[34m";
      e.magenta = "\x1B[35m";
      e.cyan = "\x1B[36m";
      e.lightgray = "\x1B[37m";
      e.default = "\x1B[39m";
      e.darkgray = "\x1B[90m";
      e.lightred = "\x1B[91m";
      e.lightgreen = "\x1B[92m";
      e.lightyellow = "\x1B[93m";
      e.lightblue = "\x1B[94m";
      e.lightmagenta = "\x1B[95m";
      e.lightcyan = "\x1B[96m";
      e.white = "\x1B[97m";
      e.reset = "\x1B[0m";
      function t(n, r) {
        return r === undefined ? n : r + n + e.reset;
      }
      e.colored = t;
      e.plot = function (n, r = undefined) {
        if (typeof n[0] == "number") {
          n = [n];
        }
        r = typeof r < "u" ? r : {};
        let o = typeof r.min < "u" ? r.min : n[0][0];
        let s = typeof r.max < "u" ? r.max : n[0][0];
        for (let S = 0; S < n.length; S++) {
          for (let E = 0; E < n[S].length; E++) {
            o = Math.min(o, n[S][E]);
            s = Math.max(s, n[S][E]);
          }
        }
        let i = ["\u253C", "\u2524", "\u2576", "\u2574", "\u2500", "\u2570", "\u256D", "\u256E", "\u256F", "\u2502"];
        let a = Math.abs(s - o);
        let l = typeof r.offset < "u" ? r.offset : 3;
        let c = typeof r.padding < "u" ? r.padding : "           ";
        let u = typeof r.height < "u" ? r.height : a;
        let d = typeof r.colors < "u" ? r.colors : [];
        let p = a !== 0 ? u / a : 1;
        let m = Math.round(o * p);
        let f = Math.round(s * p);
        let h = Math.abs(f - m);
        let g = 0;
        for (let S = 0; S < n.length; S++) {
          g = Math.max(g, n[S].length);
        }
        g = g + l;
        let y = typeof r.symbols < "u" ? r.symbols : i;
        let _ = typeof r.format < "u" ? r.format : function (S) {
          return (c + S.toFixed(2)).slice(-c.length);
        };
        let b = Array(h + 1);
        for (let S = 0; S <= h; S++) {
          b[S] = Array(g);
          for (let E = 0; E < g; E++) {
            b[S][E] = " ";
          }
        }
        for (let S = m; S <= f; ++S) {
          let E = _(h > 0 ? s - (S - m) * a / h : S, S - m);
          b[S - m][Math.max(l - E.length, 0)] = E;
          b[S - m][l - 1] = S == 0 ? y[0] : y[1];
        }
        for (let S = 0; S < n.length; S++) {
          let E = d[S % d.length];
          let C = Math.round(n[S][0] * p) - m;
          b[h - C][l - 1] = t(y[0], E);
          for (let x = 0; x < n[S].length - 1; x++) {
            let A = Math.round(n[S][x + 0] * p) - m;
            let k = Math.round(n[S][x + 1] * p) - m;
            if (A == k) {
              b[h - A][x + l] = t(y[4], E);
            } else {
              b[h - k][x + l] = t(A > k ? y[5] : y[6], E);
              b[h - A][x + l] = t(A > k ? y[7] : y[8], E);
              let I = Math.min(A, k);
              let O = Math.max(A, k);
              for (let M = I + 1; M < O; M++) {
                b[h - M][x + l] = t(y[9], E);
              }
            }
          }
        }
        return b.map(function (S) {
          return S.join("");
        }).join(`
`);
      };
    })(typeof mir > "u" ? mir.asciichart = {} : mir);
  });