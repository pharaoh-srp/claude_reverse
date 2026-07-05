  async function L3l(e) {
    while (fir) {
      await fir;
    }
    let t;
    fir = new Promise(n => {
      t = n;
    });
    try {
      return await e();
    } finally {
      fir = null;
      t?.();
    }
  }
  function F3l() {
    return N3l.join(er(), "stats-cache.json");
  }
  function Zjo() {
    return {
      version: 4,
      lastComputedDate: null,
      dailyActivity: [],
      dailyModelTokens: [],
      modelUsage: {},
      totalSessions: 0,
      totalMessages: 0,
      longestSession: null,
      firstSessionDate: null,
      hourCounts: {},
      shotDistribution: {}
    };
  }
  function v3m(e) {
    if (typeof e.version !== "number" || e.version < 1 || e.version > 4) {
      return null;
    }
    if (!Array.isArray(e.dailyActivity) || !Array.isArray(e.dailyModelTokens) || typeof e.totalSessions !== "number" || typeof e.totalMessages !== "number") {
      return null;
    }
    return {
      version: 4,
      lastComputedDate: e.lastComputedDate ?? null,
      dailyActivity: e.dailyActivity,
      dailyModelTokens: e.dailyModelTokens,
      modelUsage: e.modelUsage ?? {},
      totalSessions: e.totalSessions,
      totalMessages: e.totalMessages,
      longestSession: e.longestSession ?? null,
      firstSessionDate: e.firstSessionDate ?? null,
      hourCounts: e.hourCounts ?? {},
      shotDistribution: e.shotDistribution
    };
  }
  async function U3l() {
    let e = F3l();
    try {
      let t = await Ys().read(e);
      let n = qt(t);
      if (n.version !== 4) {
        let r = v3m(n);
        if (!r) {
          logForDebugging(`Stats cache version ${n.version} not migratable (expected ${4}), returning empty cache`);
          return Zjo();
        }
        logForDebugging(`Migrated stats cache from v${n.version} to v${4}`);
        await qQt(r);
        return r;
      }
      if (!Array.isArray(n.dailyActivity) || !Array.isArray(n.dailyModelTokens) || typeof n.totalSessions !== "number" || typeof n.totalMessages !== "number") {
        logForDebugging("Stats cache has invalid structure, returning empty cache");
        return Zjo();
      }
      return n;
    } catch (t) {
      logForDebugging(`Failed to load stats cache: ${he(t)}`);
      return Zjo();
    }
  }
  async function qQt(e) {
    let t = F3l();
    try {
      let n = er();
      await Ys().mkdir(n);
      let r = De(e, null, 2);
      await Ys().atomicWrite(t, r, 384);
      logForDebugging(`Stats cache saved successfully (lastComputedDate: ${e.lastComputedDate})`);
    } catch (n) {
      logForDebugging(`Failed to save stats cache: ${he(n)}`, {
        level: "error"
      });
    }
  }
  function eqo(e, t, n) {
    let r = new Map();
    for (let p of e.dailyActivity) {
      r.set(p.date, {
        ...p
      });
    }
    for (let p of t.dailyActivity) {
      let m = r.get(p.date);
      if (m) {
        m.messageCount += p.messageCount;
        m.sessionCount += p.sessionCount;
        m.toolCallCount += p.toolCallCount;
      } else {
        r.set(p.date, {
          ...p
        });
      }
    }
    let o = new Map();
    for (let p of e.dailyModelTokens) {
      o.set(p.date, {
        ...p.tokensByModel
      });
    }
    for (let p of t.dailyModelTokens) {
      let m = o.get(p.date);
      if (m) {
        for (let [f, h] of Object.entries(p.tokensByModel)) {
          m[f] = (m[f] || 0) + h;
        }
      } else {
        o.set(p.date, {
          ...p.tokensByModel
        });
      }
    }
    let s = {
      ...e.modelUsage
    };
    for (let [p, m] of Object.entries(t.modelUsage)) {
      if (s[p]) {
        s[p] = {
          inputTokens: s[p].inputTokens + m.inputTokens,
          outputTokens: s[p].outputTokens + m.outputTokens,
          cacheReadInputTokens: s[p].cacheReadInputTokens + m.cacheReadInputTokens,
          cacheCreationInputTokens: s[p].cacheCreationInputTokens + m.cacheCreationInputTokens,
          webSearchRequests: s[p].webSearchRequests + m.webSearchRequests,
          costUSD: s[p].costUSD + m.costUSD,
          contextWindow: Math.max(s[p].contextWindow, m.contextWindow),
          maxOutputTokens: Math.max(s[p].maxOutputTokens, m.maxOutputTokens)
        };
      } else {
        s[p] = {
          ...m
        };
      }
    }
    let i = {
      ...e.hourCounts
    };
    for (let [p, m] of Object.entries(t.hourCounts)) {
      let f = parseInt(p, 10);
      i[f] = (i[f] || 0) + m;
    }
    let a = e.totalSessions + t.sessionStats.length;
    let l = e.totalMessages + t.totalMessages;
    let c = e.longestSession;
    for (let p of t.sessionStats) {
      if (!c || p.duration > c.duration) {
        c = p;
      }
    }
    let u = e.firstSessionDate;
    for (let p of t.sessionStats) {
      if (!u || p.timestamp < u) {
        u = p.timestamp;
      }
    }
    return {
      version: 4,
      lastComputedDate: n,
      dailyActivity: Array.from(r.values()).sort((p, m) => p.date.localeCompare(m.date)),
      dailyModelTokens: Array.from(o.entries()).map(([p, m]) => ({
        date: p,
        tokensByModel: m
      })).sort((p, m) => p.date.localeCompare(m.date)),
      modelUsage: s,
      totalSessions: a,
      totalMessages: l,
      longestSession: c,
      firstSessionDate: u,
      hourCounts: i
    };
  }
  function iie(e) {
    let n = e.toISOString().split("T")[0];
    if (!n) {
      throw Error("Invalid ISO date string");
    }
    return n;
  }
  function tqo() {
    return iie(new Date());
  }
  function B3l() {
    let e = new Date();
    e.setDate(e.getDate() - 1);
    return iie(e);
  }
  function dYe(e, t) {
    return e < t;
  }
  var N3l;
  var fir = null;
  var nqo = __lazy(() => {
    _b();
    je();
    gn();
    dt();
    N3l = require("path");
  });
  function w3m(e) {
    let t = e.map(n => n.messageCount).filter(n => n > 0).sort((n, r) => n - r);
    if (t.length === 0) {
      return null;
    }
    return {
      p25: t[Math.floor(t.length * 0.25)],
      p50: t[Math.floor(t.length * 0.5)],
      p75: t[Math.floor(t.length * 0.75)]
    };
  }
  function rqo(e, t = {}) {
    let {
      terminalWidth: n = 80,
      showMonthLabels: r = true
    } = t;
    let o = 4;
    let s = n - 4;
    let i = Math.min(52, Math.max(10, s));
    let a = new Map();
    for (let _ of e) {
      a.set(_.date, _);
    }
    let l = w3m(e);
    let c = new Date();
    c.setHours(0, 0, 0, 0);
    let u = new Date(c);
    u.setDate(c.getDate() - c.getDay());
    let d = new Date(u);
    d.setDate(d.getDate() - (i - 1) * 7);
    let p = Array.from({
      length: 7
    }, () => Array(i).fill(""));
    let m = [];
    let f = -1;
    let h = new Date(d);
    for (let _ = 0; _ < i; _++) {
      for (let b = 0; b < 7; b++) {
        if (h > c) {
          p[b][_] = " ";
          h.setDate(h.getDate() + 1);
          continue;
        }
        let S = iie(h);
        let E = a.get(S);
        if (b === 0) {
          let x = h.getMonth();
          if (x !== f) {
            m.push({
              month: x,
              week: _
            });
            f = x;
          }
        }
        let C = C3m(E?.messageCount || 0, l);
        p[b][_] = R3m(C);
        h.setDate(h.getDate() + 1);
      }
    }
    let g = [];
    if (r) {
      let _ = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
      let b = m.map(C => C.month);
      let S = Math.floor(i / Math.max(b.length, 1));
      let E = b.map(C => _[C].padEnd(S)).join("");
      g.push("    " + E);
    }
    let y = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    for (let _ = 0; _ < 7; _++) {
      let S = ([1, 3, 5].includes(_) ? y[_].padEnd(3) : "   ") + " " + p[_].join("");
      g.push(S);
    }
    g.push("");
    g.push("    Less " + [aUe("\u2591"), aUe("\u2592"), aUe("\u2593"), aUe("\u2588")].join(" ") + " More");
    return g.join(`
`);
  }
  function C3m(e, t) {
    if (e === 0 || !t) {
      return 0;
    }
    if (e >= t.p75) {
      return 4;
    }
    if (e >= t.p50) {
      return 3;
    }
    if (e >= t.p25) {
      return 2;
    }
    return 1;
  }
  function R3m(e) {
    switch (e) {
      case 0:
        return _$u.gray("\xB7");
      case 1:
        return aUe("\u2591");
      case 2:
        return aUe("\u2592");
      case 3:
        return aUe("\u2593");
      case 4:
        return aUe("\u2588");
      default:
        return _$u.gray("\xB7");
    }
  }
  var aUe;
  var $3l = __lazy(() => {
    nqo();
    aUe = _$u.hex("#da7756");
  });
  function q3l(e) {
    let t = [];
    let n = e.split(`
`);
    for (let r of n) {
      let o = [];
      let s = pYe;
      let i = false;
      let a = 0;
      while (a < r.length) {
        if (r[a] === "\x1B" && r[a + 1] === "[") {
          let u = a + 2;
          while (u < r.length && !/[A-Za-z]/.test(r[u])) {
            u++;
          }
          if (r[u] === "m") {
            let d = r.slice(a + 2, u).split(";").map(Number);
            let p = 0;
            while (p < d.length) {
              let m = d[p];
              if (m === 0) {
                s = pYe;
                i = false;
              } else if (m === 1) {
                i = true;
              } else if (m >= 30 && m <= 37) {
                s = H3l[m] || pYe;
              } else if (m >= 90 && m <= 97) {
                s = H3l[m] || pYe;
              } else if (m === 39) {
                s = pYe;
              } else if (m === 38) {
                if (d[p + 1] === 5 && d[p + 2] !== undefined) {
                  let f = d[p + 2];
                  s = x3m(f);
                  p += 2;
                } else if (d[p + 1] === 2 && d[p + 2] !== undefined && d[p + 3] !== undefined && d[p + 4] !== undefined) {
                  s = {
                    r: d[p + 2],
                    g: d[p + 3],
                    b: d[p + 4]
                  };
                  p += 4;
                }
              }
              p++;
            }
          }
          a = u + 1;
          continue;
        }
        if (r[a] === "\x1B") {
          if (r[a + 1] === "]") {
            let u = a + 2;
            while (u < r.length && r[u] !== "\x07" && !(r[u] === "\x1B" && r[u + 1] === "\\")) {
              u++;
            }
            a = r[u] === "\x1B" ? u + 2 : u + 1;
          } else {
            a++;
          }
          continue;
        }
        let l = a;
        while (a < r.length && r[a] !== "\x1B") {
          a++;
        }
        let c = r.slice(l, a);
        if (c) {
          o.push({
            text: c,
            color: s,
            bold: i
          });
        }
      }
      if (o.length === 0) {
        o.push({
          text: "",
          color: pYe,
          bold: false
        });
      }
      t.push(o);
    }
    return t;
  }
  function x3m(e) {
    if (e < 16) {
      return [{
        r: 0,
        g: 0,
        b: 0
      }, {
        r: 128,
        g: 0,
        b: 0
      }, {
        r: 0,
        g: 128,
        b: 0
      }, {
        r: 128,
        g: 128,
        b: 0
      }, {
        r: 0,
        g: 0,
        b: 128
      }, {
        r: 128,
        g: 0,
        b: 128
      }, {
        r: 0,
        g: 128,
        b: 128
      }, {
        r: 192,
        g: 192,
        b: 192
      }, {
        r: 128,
        g: 128,
        b: 128
      }, {
        r: 255,
        g: 0,
        b: 0
      }, {
        r: 0,
        g: 255,
        b: 0
      }, {
        r: 255,
        g: 255,
        b: 0
      }, {
        r: 0,
        g: 0,
        b: 255
      }, {
        r: 255,
        g: 0,
        b: 255
      }, {
        r: 0,
        g: 255,
        b: 255
      }, {
        r: 255,
        g: 255,
        b: 255
      }][e] || pYe;
    }
    if (e < 232) {
      let n = e - 16;
      let r = Math.floor(n / 36);
      let o = Math.floor(n % 36 / 6);
      let s = n % 6;
      return {
        r: r === 0 ? 0 : 55 + r * 40,
        g: o === 0 ? 0 : 55 + o * 40,
        b: s === 0 ? 0 : 55 + s * 40
      };
    }
    let t = (e - 232) * 10 + 8;
    return {
      r: t,
      g: t,
      b: t
    };
  }
  var H3l;
  var pYe;
  var j3l;
  var W3l = __lazy(() => {
    wx();
    H3l = {
      30: {
        r: 0,
        g: 0,
        b: 0
      },
      31: {
        r: 205,
        g: 49,
        b: 49
      },
      32: {
        r: 13,
        g: 188,
        b: 121
      },
      33: {
        r: 229,
        g: 229,
        b: 16
      },
      34: {
        r: 36,
        g: 114,
        b: 200
      },
      35: {
        r: 188,
        g: 63,
        b: 188
      },
      36: {
        r: 17,
        g: 168,
        b: 205
      },
      37: {
        r: 229,
        g: 229,
        b: 229
      },
      90: {
        r: 102,
        g: 102,
        b: 102
      },
      91: {
        r: 241,
        g: 76,
        b: 76
      },
      92: {
        r: 35,
        g: 209,
        b: 139
      },
      93: {
        r: 245,
        g: 245,
        b: 67
      },
      94: {
        r: 59,
        g: 142,
        b: 234
      },
      95: {
        r: 214,
        g: 112,
        b: 214
      },
      96: {
        r: 41,
        g: 184,
        b: 219
      },
      97: {
        r: 255,
        g: 255,
        b: 255
      }
    };
    pYe = {
      r: 229,
      g: 229,
      b: 229
    };
    j3l = {
      r: 30,
      g: 30,
      b: 30
    };
  });
  var Y3l = {};