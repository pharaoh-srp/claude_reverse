  __export(Y3l, {
    glyphFor: () => glyphFor,
    encodePng: () => encodePng,
    blitGlyph: () => blitGlyph,
    ansiToPng: () => ansiToPng,
    GLYPH_W: () => 24,
    GLYPH_H: () => 48
  });
  function glyphFor(e) {
    return V3l.get(e) ?? G3l;
  }
  function I3m() {
    let e = new Uint8Array(sqo);
    for (let t = 2; t < 48 - 4; t++) {
      for (let n = 1; n < 24 - 1; n++) {
        if ((t === 2 || t === 48 - 5 || n === 1 || n === 24 - 2) && (n + t) % 2 === 0) {
          e[t * 24 + n] = 255;
        }
      }
    }
    return e;
  }
  function P3m() {
    let e = hir.inflateRawSync(Buffer.from("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", "base64"));
    let t = e.readUInt16LE(0);
    let n = new Map();
    let r = 2;
    for (let o = 0; o < t; o++) {
      let s = e.readUInt32LE(r);
      r += 4;
      n.set(s, e.subarray(r, r + sqo));
      r += sqo;
    }
    return n;
  }
  function ansiToPng(e, t = {}) {
    let {
      scale: n = 1,
      paddingX: r = 48,
      paddingY: o = 48,
      borderRadius: s = 16,
      background: i = j3l
    } = t;
    let a = q3l(e);
    while (a.length > 0 && a.at(-1).every(h => h.text.trim() === "")) {
      a.pop();
    }
    if (a.length === 0) {
      a.push([{
        text: "",
        color: i,
        bold: false
      }]);
    }
    let l = Math.max(1, ...a.map(D3m));
    let c = a.length;
    let u = (l * 24 + r * 2) * n;
    let d = (c * 48 + o * 2) * n;
    let p = new Uint8Array(u * d * 4);
    if (M3m(p, i), s > 0) {
      F3m(p, u, d, s * n);
    }
    let m = r * n;
    let f = o * n;
    for (let h = 0; h < c; h++) {
      let g = 0;
      for (let y of a[h]) {
        for (let _ of y.text) {
          let b = _.codePointAt(0);
          let S = an(_);
          if (S === 0) {
            continue;
          }
          let E = m + g * 24 * n;
          let C = f + h * 48 * n;
          let x = N3m[b];
          if (x !== undefined) {
            L3m(p, u, E, C, y.color, i, x, n);
          } else {
            let A = V3l.get(b) ?? G3l;
            blitGlyph(p, u, E, C, A, y.color, y.bold, n);
          }
          g += S;
        }
      }
    }
    return encodePng(p, u, d);
  }
  function D3m(e) {
    let t = 0;
    for (let n of e) {
      t += an(n.text);
    }
    return t;
  }
  function M3m(e, t) {
    for (let n = 0; n < e.length; n += 4) {
      e[n] = t.r;
      e[n + 1] = t.g;
      e[n + 2] = t.b;
      e[n + 3] = 255;
    }
  }
  function L3m(e, t, n, r, o, s, i, a) {
    let l = Math.round(o.r * i + s.r * (1 - i));
    let c = Math.round(o.g * i + s.g * (1 - i));
    let u = Math.round(o.b * i + s.b * (1 - i));
    let d = 24 * a;
    let p = 48 * a;
    for (let m = 0; m < p; m++) {
      let f = ((r + m) * t + n) * 4;
      for (let h = 0; h < d; h++) {
        let g = f + h * 4;
        e[g] = l;
        e[g + 1] = c;
        e[g + 2] = u;
      }
    }
  }
  function blitGlyph(e, t, n, r, o, s, i, a) {
    for (let l = 0; l < 48; l++) {
      for (let c = 0; c < 24; c++) {
        let u = o[l * 24 + c];
        if (u === 0) {
          continue;
        }
        if (i) {
          u = Math.min(255, u * 1.4);
        }
        let d = 255 - u;
        for (let p = 0; p < a; p++) {
          let m = ((r + l * a + p) * t + n + c * a) * 4;
          for (let f = 0; f < a; f++) {
            let h = m + f * 4;
            e[h] = s.r * u + e[h] * d >> 8;
            e[h + 1] = s.g * u + e[h + 1] * d >> 8;
            e[h + 2] = s.b * u + e[h + 2] * d >> 8;
          }
        }
      }
    }
  }
  function F3m(e, t, n, r) {
    let o = r * r;
    for (let s = 0; s < r; s++) {
      for (let i = 0; i < r; i++) {
        let a = r - i - 0.5;
        let l = r - s - 0.5;
        if (a * a + l * l <= o) {
          continue;
        }
        e[(s * t + i) * 4 + 3] = 0;
        e[(s * t + (t - 1 - i)) * 4 + 3] = 0;
        e[((n - 1 - s) * t + i) * 4 + 3] = 0;
        e[((n - 1 - s) * t + (t - 1 - i)) * 4 + 3] = 0;
      }
    }
  }
  function $3m() {
    let e = new Uint32Array(256);
    for (let t = 0; t < 256; t++) {
      let n = t;
      for (let r = 0; r < 8; r++) {
        n = n & 1 ? 3988292384 ^ n >>> 1 : n >>> 1;
      }
      e[t] = n >>> 0;
    }
    return e;
  }
  function H3m(e) {
    let t = 4294967295;
    for (let n = 0; n < e.length; n++) {
      t = B3m[(t ^ e[n]) & 255] ^ t >>> 8;
    }
    return (t ^ 4294967295) >>> 0;
  }
  function oqo(e, t) {
    let n = Buffer.alloc(4 + t.length);
    n.write(e, 0, "ascii");
    n.set(t, 4);
    let r = Buffer.alloc(12 + t.length);
    r.writeUInt32BE(t.length, 0);
    n.copy(r, 4);
    r.writeUInt32BE(H3m(n), 8 + t.length);
    return r;
  }
  function encodePng(e, t, n) {
    let r = Buffer.alloc(13);
    r.writeUInt32BE(t, 0);
    r.writeUInt32BE(n, 4);
    r[8] = 8;
    r[9] = 6;
    r[10] = 0;
    r[11] = 0;
    r[12] = 0;
    let o = t * 4;
    let s = Buffer.alloc(n * (o + 1));
    for (let a = 0; a < n; a++) {
      let l = a * (o + 1);
      s[l] = 0;
      s.set(e.subarray(a * o, (a + 1) * o), l + 1);
    }
    let i = hir.deflateSync(s);
    return Buffer.concat([U3m, oqo("IHDR", r), oqo("IDAT", i), oqo("IEND", new Uint8Array(0))]);
  }
  var hir;
  var sqo;
  var G3l;
  var V3l;
  var N3m;
  var U3m;
  var B3m;
  var J3l = __lazy(() => {
    bc();
    W3l();
    hir = require("zlib");
    sqo = 24 * 48;
    G3l = I3m();
    V3l = P3m();
    N3m = {
      9617: 0.25,
      9618: 0.5,
      9619: 0.75,
      9608: 1
    };
    U3m = Buffer.from([137, 80, 78, 71, 13, 10, 26, 10]);
    B3m = $3m();
  });
  async function Q3l(e, t) {
    try {
      let n = iqo.join(pT(), "screenshots");
      await Ovt.mkdir(n, {
        recursive: true,
        mode: 448
      });
      let r = iqo.join(n, `screenshot-${Date.now()}.png`);
      let {
        ansiToPng: o
      } = await Promise.resolve().then(() => (J3l(), Y3l));
      let s = o(e, t);
      await Ovt.writeFile(r, s);
      let i;
      try {
        i = await j3m(r);
      } catch (a) {
        Oe(a);
        Ae("clipboard_write", "copy_failed");
        return {
          success: false,
          message: `Failed to copy screenshot: ${a instanceof Error ? a.message : "Unknown error"}`
        };
      } finally {
        await Ovt.unlink(r).catch(() => {});
      }
      if (i.success) {
        Pe("clipboard_write");
      } else {
        Ae("clipboard_write", "copy_failed");
      }
      return i;
    } catch (n) {
      Oe(n);
      Ae("clipboard_write", "render_failed");
      return {
        success: false,
        message: `Failed to copy screenshot: ${n instanceof Error ? n.message : "Unknown error"}`
      };
    }
  }
  async function j3m(e) {
    let t = Wt();
    if (t === "macos") {
      let r = `set the clipboard to (read (POSIX file "${e.replaceAll("\\", "\\\\").replaceAll('"', "\\\"")}") as \xABclass PNGf\xBB)`;
      let o = await execFileNoThrowWithCwd("osascript", ["-e", r], {
        timeout: 5000
      });
      if (o.code === 0) {
        return {
          success: true,
          message: "Screenshot copied to clipboard"
        };
      }
      return {
        success: false,
        message: `Failed to copy to clipboard: ${o.stderr}`
      };
    }
    if (t === "linux") {
      if ((await q3m("xclip", ["-selection", "clipboard", "-t", "image/png", "-i", e])) === 0) {
        return {
          success: true,
          message: "Screenshot copied to clipboard"
        };
      }
      return {
        success: false,
        message: "Failed to copy to clipboard. Please install xclip: sudo apt install xclip"
      };
    }
    if (t === "windows") {
      let n = `Add-Type -AssemblyName System.Windows.Forms; [System.Windows.Forms.Clipboard]::SetImage([System.Drawing.Image]::FromFile(${Xct(e, "the screenshot temp path (override with CLAUDE_CODE_TMPDIR)")}))`;
      let r = await execFileNoThrowWithCwd("powershell", ["-NoProfile", "-Command", n], {
        timeout: 5000
      });
      if (r.code === 0) {
        return {
          success: true,
          message: "Screenshot copied to clipboard"
        };
      }
      return {
        success: false,
        message: `Failed to copy to clipboard: ${r.stderr}`
      };
    }
    return {
      success: false,
      message: `Screenshot to clipboard is not supported on ${t}`
    };
  }
  function q3m(e, t, n = 5000) {
    return new Promise(r => {
      let o;
      try {
        o = X3l.spawn(e, t, {
          cwd: undefined,
          detached: true,
          stdio: "ignore",
          windowsHide: true
        });
      } catch {
        r(null);
        return;
      }
      let s = false;
      function i(l) {
        if (s) {
          return;
        }
        s = true;
        clearTimeout(a);
        r(l);
      }
      let a = setTimeout(() => {
        o.kill("SIGKILL");
        i(null);
      }, n);
      o.once("exit", l => i(l));
      o.once("error", () => i(null));
      o.unref();
    });
  }
  var X3l;
  var Ovt;
  var iqo;
  var Z3l = __lazy(() => {
    ln();
    ji();
    Rn();
    Cs();
    _jt();
    BC();
    X3l = require("child_process");
    Ovt = require("fs/promises");
    iqo = require("path");
  });
  async function yir(e, t = {}) {
    let {
      fromDate: n,
      toDate: r
    } = t;
    let o = zt();
    let s = new Map();
    let i = new Map();
    let a = [];
    let l = new Map();
    let c = 0;
    let u = {};
    let d = undefined;
    let p = new Set();
    let m = 20;
    for (let f = 0; f < e.length; f += m) {
      let h = e.slice(f, f + m);
      let g = await Promise.all(h.map(async y => {
        try {
          if (n) {
            try {
              let b = await o.stat(y);
              let S = iie(b.mtime);
              if (dYe(S, n)) {
                return {
                  sessionFile: y,
                  entries: null,
                  error: null,
                  skipped: true
                };
              }
            } catch {}
          }
          let _ = await knt(y);
          return {
            sessionFile: y,
            entries: _,
            error: null,
            skipped: false
          };
        } catch (_) {
          return {
            sessionFile: y,
            entries: null,
            error: _,
            skipped: false
          };
        }
      }));
      for (let {
        sessionFile: y,
        entries: _,
        error: b,
        skipped: S
      } of g) {
        if (S) {
          continue;
        }
        if (b || !_) {
          logForDebugging(`Failed to read session file ${y}: ${he(b)}`);
          continue;
        }
        let E = xfe.basename(y, ".jsonl");
        let C = [];
        for (let F of _) {
          if (isTranscriptMessage(F)) {
            C.push(F);
          }
        }
        if (C.length === 0) {
          continue;
        }
        let x = y.includes(`${xfe.sep}subagents${xfe.sep}`);
        let A = x ? C : C.filter(F => !F.isSidechain);
        if (A.length === 0) {
          continue;
        }
        let k = A[0];
        let I = A.at(-1);
        let O = new Date(k.timestamp);
        let M = new Date(I.timestamp);
        if (isNaN(O.getTime()) || isNaN(M.getTime())) {
          logForDebugging(`Skipping session with invalid timestamp: ${y}`);
          continue;
        }
        let L = iie(O);
        if (r && dYe(r, L)) {
          continue;
        }
        let P = !n || !dYe(L, n);
        if (!x && P) {
          let F = M.getTime() - O.getTime();
          a.push({
            sessionId: E,
            duration: F,
            messageCount: A.length,
            timestamp: k.timestamp
          });
          let H = s.get(L);
          if (!H) {
            H = {
              date: L,
              messageCount: 0,
              sessionCount: 0,
              toolCallCount: 0
            };
            s.set(L, H);
          }
          H.sessionCount++;
          let U = O.getHours();
          l.set(U, (l.get(U) || 0) + 1);
        }
        for (let F of A) {
          let H = new Date(F.timestamp);
          if (isNaN(H.getTime())) {
            continue;
          }
          let U = iie(H);
          if (n && dYe(U, n)) {
            continue;
          }
          if (r && dYe(r, U)) {
            continue;
          }
          let N = s.get(U);
          if (!N && !x) {
            N = {
              date: U,
              messageCount: 0,
              sessionCount: 0,
              toolCallCount: 0
            };
            s.set(U, N);
          }
          if (!x) {
            if (c++, N) {
              N.messageCount++;
            }
          }
          if (F.type === "assistant") {
            let W = F.message?.content;
            if (Array.isArray(W)) {
              for (let j of W) {
                if (j.type === "tool_use" && N) {
                  N.toolCallCount++;
                }
              }
            }
            if (F.message?.usage) {
              let j = F.message.usage;
              let z = F.message.model || "unknown";
              if (z === "<synthetic>") {
                continue;
              }
              if (!u[z]) {
                u[z] = {
                  inputTokens: 0,
                  outputTokens: 0,
                  cacheReadInputTokens: 0,
                  cacheCreationInputTokens: 0,
                  webSearchRequests: 0,
                  costUSD: 0,
                  contextWindow: 0,
                  maxOutputTokens: 0
                };
              }
              u[z].inputTokens += j.input_tokens || 0;
              u[z].outputTokens += j.output_tokens || 0;
              u[z].cacheReadInputTokens += j.cache_read_input_tokens || 0;
              u[z].cacheCreationInputTokens += j.cache_creation_input_tokens || 0;
              let V = (j.input_tokens || 0) + (j.output_tokens || 0);
              if (V > 0) {
                let K = i.get(U) || {};
                K[z] = (K[z] || 0) + V;
                i.set(U, K);
              }
            }
          }
        }
      }
    }
    return {
      dailyActivity: Array.from(s.values()).sort((f, h) => f.date.localeCompare(h.date)),
      dailyModelTokens: Array.from(i.entries()).map(([f, h]) => ({
        date: f,
        tokensByModel: h
      })).sort((f, h) => f.date.localeCompare(h.date)),
      modelUsage: u,
      sessionStats: a,
      hourCounts: Object.fromEntries(l),
      totalMessages: c,
      ...{}
    };
  }
  async function e4l() {
    let e = y$();
    let t = zt();
    let n;
    try {
      n = await t.readdir(e);
    } catch (s) {
      if (fn(s)) {
        return [];
      }
      throw s;
    }
    let r = n.filter(s => s.isDirectory()).map(s => xfe.join(e, s.name));
    return (await Promise.all(r.map(async s => {
      try {
        let i = await t.readdir(s);
        let a = i.filter(u => u.isFile() && u.name.endsWith(".jsonl")).map(u => xfe.join(s, u.name));
        let l = i.filter(u => u.isDirectory());
        let c = await Promise.all(l.map(async u => {
          let d = xfe.join(s, u.name, "subagents");
          try {
            return (await t.readdir(d)).filter(m => m.isFile() && m.name.endsWith(".jsonl") && m.name.startsWith("agent-")).map(m => xfe.join(d, m.name));
          } catch {
            return [];
          }
        }));
        return [...a, ...c.flat()];
      } catch (i) {
        logForDebugging(`Failed to read project directory ${s}: ${he(i)}`);
        return [];
      }
    }))).flat();
  }
  function W3m(e, t) {
    let n = new Map();
    for (let _ of e.dailyActivity) {
      n.set(_.date, {
        ..._
      });
    }
    if (t) {
      for (let _ of t.dailyActivity) {
        let b = n.get(_.date);
        if (b) {
          b.messageCount += _.messageCount;
          b.sessionCount += _.sessionCount;
          b.toolCallCount += _.toolCallCount;
        } else {
          n.set(_.date, {
            ..._
          });
        }
      }
    }
    let r = new Map();
    for (let _ of e.dailyModelTokens) {
      r.set(_.date, {
        ..._.tokensByModel
      });
    }
    if (t) {
      for (let _ of t.dailyModelTokens) {
        let b = r.get(_.date);
        if (b) {
          for (let [S, E] of Object.entries(_.tokensByModel)) {
            b[S] = (b[S] || 0) + E;
          }
        } else {
          r.set(_.date, {
            ..._.tokensByModel
          });
        }
      }
    }
    let o = {
      ...e.modelUsage
    };
    if (t) {
      for (let [_, b] of Object.entries(t.modelUsage)) {
        if (o[_]) {
          o[_] = {
            inputTokens: o[_].inputTokens + b.inputTokens,
            outputTokens: o[_].outputTokens + b.outputTokens,
            cacheReadInputTokens: o[_].cacheReadInputTokens + b.cacheReadInputTokens,
            cacheCreationInputTokens: o[_].cacheCreationInputTokens + b.cacheCreationInputTokens,
            webSearchRequests: o[_].webSearchRequests + b.webSearchRequests,
            costUSD: o[_].costUSD + b.costUSD,
            contextWindow: Math.max(o[_].contextWindow, b.contextWindow),
            maxOutputTokens: Math.max(o[_].maxOutputTokens, b.maxOutputTokens)
          };
        } else {
          o[_] = {
            ...b
          };
        }
      }
    }
    let s = new Map();
    for (let [_, b] of Object.entries(e.hourCounts)) {
      s.set(parseInt(_, 10), b);
    }
    if (t) {
      for (let [_, b] of Object.entries(t.hourCounts)) {
        let S = parseInt(_, 10);
        s.set(S, (s.get(S) || 0) + b);
      }
    }
    let i = Array.from(n.values()).sort((_, b) => _.date.localeCompare(b.date));
    let a = t4l(i);
    let l = Array.from(r.entries()).map(([_, b]) => ({
      date: _,
      tokensByModel: b
    })).sort((_, b) => _.date.localeCompare(b.date));
    let c = e.totalSessions + (t?.sessionStats.length || 0);
    let u = e.totalMessages + (t?.totalMessages || 0);
    let d = e.longestSession;
    if (t) {
      for (let _ of t.sessionStats) {
        if (!d || _.duration > d.duration) {
          d = _;
        }
      }
    }
    let p = e.firstSessionDate;
    let m = null;
    if (t) {
      for (let _ of t.sessionStats) {
        if (!p || _.timestamp < p) {
          p = _.timestamp;
        }
        if (!m || _.timestamp > m) {
          m = _.timestamp;
        }
      }
    }
    if (!m && i.length > 0) {
      m = i.at(-1).date;
    }
    let f = i.length > 0 ? i.reduce((_, b) => b.messageCount > _.messageCount ? b : _).date : null;
    let h = s.size > 0 ? Array.from(s.entries()).reduce((_, [b, S]) => S > _[1] ? [b, S] : _)[0] : null;
    let g = p && m ? Math.ceil((new Date(m).getTime() - new Date(p).getTime()) / 86400000) + 1 : 0;
    return {
      totalSessions: c,
      totalMessages: u,
      totalDays: g,
      activeDays: n.size,
      streaks: a,
      dailyActivity: i,
      dailyModelTokens: l,
      longestSession: d,
      modelUsage: o,
      firstSessionDate: p,
      lastSessionDate: m,
      peakActivityDay: f,
      peakActivityHour: h
    };
  }
  async function G3m() {
    let e = await e4l();
    if (e.length === 0) {
      return n4l();
    }
    let t = await L3l(async () => {
      let o = await U3l();
      let s = B3l();
      let i = o;
      if (!o.lastComputedDate) {
        logForDebugging("Stats cache empty, processing all historical data");
        let a = await yir(e, {
          toDate: s
        });
        if (a.sessionStats.length > 0 || a.dailyActivity.length > 0) {
          i = eqo(o, a, s);
          await qQt(i);
        }
      } else if (dYe(o.lastComputedDate, s)) {
        let a = z3m(o.lastComputedDate);
        logForDebugging(`Stats cache stale (${o.lastComputedDate}), processing ${a} to ${s}`);
        let l = await yir(e, {
          fromDate: a,
          toDate: s
        });
        if (l.sessionStats.length > 0 || l.dailyActivity.length > 0) {
          i = eqo(o, l, s);
          await qQt(i);
        } else {
          i = {
            ...o,
            lastComputedDate: s
          };
          await qQt(i);
        }
      }
      return i;
    });
    let n = tqo();
    let r = await yir(e, {
      fromDate: n,
      toDate: n
    });
    return W3m(t, r);
  }
  async function aqo(e) {
    if (e === "all") {
      return G3m();
    }
    let t = await e4l();
    if (t.length === 0) {
      return n4l();
    }
    let n = new Date();
    let r = e === "7d" ? 7 : 30;
    let o = new Date(n);
    o.setDate(n.getDate() - r + 1);
    let s = iie(o);
    let i = await yir(t, {
      fromDate: s
    });
    return V3m(i);
  }
  function V3m(e) {
    let t = e.dailyActivity.slice().sort((p, m) => p.date.localeCompare(m.date));
    let n = e.dailyModelTokens.slice().sort((p, m) => p.date.localeCompare(m.date));
    let r = t4l(t);
    let o = null;
    for (let p of e.sessionStats) {
      if (!o || p.duration > o.duration) {
        o = p;
      }
    }
    let s = null;
    let i = null;
    for (let p of e.sessionStats) {
      if (!s || p.timestamp < s) {
        s = p.timestamp;
      }
      if (!i || p.timestamp > i) {
        i = p.timestamp;
      }
    }
    let a = t.length > 0 ? t.reduce((p, m) => m.messageCount > p.messageCount ? m : p).date : null;
    let l = Object.entries(e.hourCounts);
    let c = l.length > 0 ? parseInt(l.reduce((p, [m, f]) => f > parseInt(p[1].toString()) ? [m, f] : p)[0], 10) : null;
    let u = s && i ? Math.ceil((new Date(i).getTime() - new Date(s).getTime()) / 86400000) + 1 : 0;
    return {
      totalSessions: e.sessionStats.length,
      totalMessages: e.totalMessages,
      totalDays: u,
      activeDays: e.dailyActivity.length,
      streaks: r,
      dailyActivity: t,
      dailyModelTokens: n,
      longestSession: o,
      modelUsage: e.modelUsage,
      firstSessionDate: s,
      lastSessionDate: i,
      peakActivityDay: a,
      peakActivityHour: c
    };
  }
  function z3m(e) {
    let t = new Date(e);
    t.setUTCDate(t.getUTCDate() + 1);
    return iie(t);
  }
  function K3m(e) {
    let t = new Date(e);
    t.setUTCDate(t.getUTCDate() - 1);
    return iie(t);
  }
  function t4l(e) {
    if (e.length === 0) {
      return {
        currentStreak: 0,
        longestStreak: 0,
        currentStreakStart: null,
        longestStreakStart: null,
        longestStreakEnd: null
      };
    }
    let t = 0;
    let n = null;
    let r = tqo();
    let o = new Set(e.map(c => c.date));
    while (o.vZc(r)) {
      t++;
      n = r;
      r = K3m(r);
    }
    let s = 0;
    let i = null;
    let a = null;
    let l = Array.from(o).sort();
    if (l.length > 0) {
      let c = 1;
      let u = l[0];
      for (let d = 1; d < l.length; d++) {
        let p = new Date(l[d - 1]);
        let m = new Date(l[d]);
        if (Math.round((m.getTime() - p.getTime()) / 86400000) === 1) {
          c++;
        } else {
          if (c > s) {
            s = c;
            i = u;
            a = l[d - 1];
          }
          c = 1;
          u = l[d];
        }
      }
      if (c > s) {
        s = c;
        i = u;
        a = l.at(-1);
      }
    }
    return {
      currentStreak: t,
      longestStreak: s,
      currentStreakStart: n,
      longestStreakStart: i,
      longestStreakEnd: a
    };
  }
  function n4l() {
    return {
      totalSessions: 0,
      totalMessages: 0,
      totalDays: 0,
      activeDays: 0,
      streaks: {
        currentStreak: 0,
        longestStreak: 0,
        currentStreakStart: null,
        longestStreakStart: null,
        longestStreakEnd: null
      },
      dailyActivity: [],
      dailyModelTokens: [],
      longestSession: null,
      modelUsage: {},
      firstSessionDate: null,
      lastSessionDate: null,
      peakActivityDay: null,
      peakActivityHour: null
    };
  }
  var xfe;
  var r4l = __lazy(() => {
    je();
    dt();
    Gd();
    Fy();
    fa();
    Jf();
    nqo();
    xfe = require("path");
  });
  function a4l(e) {
    return new Date(`${e}T00:00:00`).toLocaleDateString("en-US", {
      month: "short",
      day: "numeric"
    });
  }
  function Y3m(e) {
    let t = _ir.indexOf(e);
    return _ir[(t + 1) % _ir.length];
  }
  function J3m() {
    return aqo("all").then(e => {
      if (!e || e.totalSessions === 0) {
        return {
          type: "empty"
        };
      }
      return {
        type: "success",
        data: e
      };
    }).catch(e => ({
      type: "error",
      message: e instanceof Error ? e.message : "Failed to load stats"
    }));
  }
  function Q3m() {
    return Promise.resolve(X3m);
  }
  function l4l(e) {
    let t = Dvt.c(8);
    let {
      onClose: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = J3m();
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = r;
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = Q3m();
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let {
      rows: a
    } = h_(Sr());
    let l = Math.max(8, Math.min(a - 4, 30));
    let c;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      c = Ts.jsxs(gXd, {
        marginTop: 1,
        children: [Ts.jsx(Ed, {}), Ts.jsx(Text, {
          children: " Loading your Claude Code stats\u2026"
        })]
      });
      t[2] = c;
    } else {
      c = t[2];
    }
    let u;
    if (t[3] !== n) {
      u = Ts.jsx(_H.Suspense, {
        fallback: c,
        children: Ts.jsx(Z3m, {
          allTimePromise: o,
          activeTimePromise: i,
          onClose: n
        })
      });
      t[3] = n;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d;
    if (t[5] !== l || t[6] !== u) {
      d = Ts.jsx(gXd, {
        flexDirection: "column",
        minHeight: l,
        children: u
      });
      t[5] = l;
      t[6] = u;
      t[7] = d;
    } else {
      d = t[7];
    }
    return d;
  }
  function Z3m(e) {
    let t = Dvt.c(50);
    let {
      allTimePromise: n,
      activeTimePromise: r,
      onClose: o
    } = e;
    let s = _H.use(n);
    let i = _H.use(r);
    let [a, l] = _H.useState("all");
    let c;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      c = {};
      t[0] = c;
    } else {
      c = t[0];
    }
    let [u, d] = _H.useState(c);
    let [p, m] = _H.useState(false);
    let [f, h] = _H.useState("Overview");
    let [g, y] = _H.useState(null);
    let _ = useClock();
    let b;
    let S;
    if (t[1] !== a || t[2] !== u) {
      b = () => {
        if (a === "all") {
          return;
        }
        if (u[a]) {
          return;
        }
        let V = false;
        m(true);
        aqo(a).then(K => {
          if (!V) {
            d(J => ({
              ...J,
              [a]: K
            }));
            m(false);
          }
        }).catch(() => {
          if (!V) {
            m(false);
          }
        });
        return () => {
          V = true;
        };
      };
      S = [a, u];
      t[1] = a;
      t[2] = u;
      t[3] = b;
      t[4] = S;
    } else {
      b = t[3];
      S = t[4];
    }
    _H.useEffect(b, S);
    let E = a === "all" ? s.type === "success" ? s.data : null : u[a] ?? (s.type === "success" ? s.data : null);
    let C = s.type === "success" ? s.data : null;
    let x;
    if (t[5] !== o) {
      x = () => {
        o("Stats dialog dismissed", {
          display: "system"
        });
      };
      t[5] = o;
      t[6] = x;
    } else {
      x = t[6];
    }
    let A = x;
    let k;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      k = {
        context: "Settings"
      };
      t[7] = k;
    } else {
      k = t[7];
    }
    uo("confirm:no", A, k);
    let {
      headerFocused: I,
      focusHeader: O
    } = zM();
    let M;
    if (t[8] !== f || t[9] !== i || t[10] !== _ || t[11] !== a || t[12] !== E || t[13] !== O) {
      M = function (K) {
        if (K.key === "up") {
          K.preventDefault();
          O();
          return;
        }
        if (K.key === "r" && !K.ctrl && !K.meta) {
          K.preventDefault();
          l(Y3m(a));
          return;
        }
        if (K.ctrl && K.key === "s" && E) {
          K.preventDefault();
          u4m(E, i, f, y, _);
        }
      };
      t[8] = f;
      t[9] = i;
      t[10] = _;
      t[11] = a;
      t[12] = E;
      t[13] = O;
      t[14] = M;
    } else {
      M = t[14];
    }
    let L = M;
    if (s.type === "error") {
      let V;
      if (t[15] !== s.message) {
        V = Ts.jsxs(Text, {
          color: "error",
          children: ["Failed to load stats: ", s.message]
        });
        t[15] = s.message;
        t[16] = V;
      } else {
        V = t[16];
      }
      let K;
      if (t[17] !== L || t[18] !== V) {
        K = Ts.jsx(gXd, {
          marginTop: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: L,
          children: V
        });
        t[17] = L;
        t[18] = V;
        t[19] = K;
      } else {
        K = t[19];
      }
      return K;
    }
    if (s.type === "empty") {
      let V;
      if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
        V = Ts.jsx(Text, {
          color: "warning",
          children: "No stats available yet. Start using Claude Code!"
        });
        t[20] = V;
      } else {
        V = t[20];
      }
      let K;
      if (t[21] !== L) {
        K = Ts.jsx(gXd, {
          marginTop: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: L,
          children: V
        });
        t[21] = L;
        t[22] = K;
      } else {
        K = t[22];
      }
      return K;
    }
    if (!E || !C) {
      let V;
      let K;
      if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
        V = Ts.jsx(Ed, {});
        K = Ts.jsx(Text, {
          children: " Loading stats\u2026"
        });
        t[23] = V;
        t[24] = K;
      } else {
        V = t[23];
        K = t[24];
      }
      let J;
      if (t[25] !== L) {
        J = Ts.jsxs(gXd, {
          marginTop: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: L,
          children: [V, K]
        });
        t[25] = L;
        t[26] = J;
      } else {
        J = t[26];
      }
      return J;
    }
    let P;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      P = V => h(V);
      t[27] = P;
    } else {
      P = t[27];
    }
    let F;
    if (t[28] !== i || t[29] !== C || t[30] !== a || t[31] !== E || t[32] !== p) {
      F = Ts.jsx(kh, {
        title: "Overview",
        children: Ts.jsx(e4m, {
          stats: E,
          allTimeStats: C,
          activeTimeStats: i,
          dateRange: a,
          isLoading: p
        })
      });
      t[28] = i;
      t[29] = C;
      t[30] = a;
      t[31] = E;
      t[32] = p;
      t[33] = F;
    } else {
      F = t[33];
    }
    let H;
    if (t[34] !== a || t[35] !== E || t[36] !== p) {
      H = Ts.jsx(kh, {
        title: "Models",
        children: Ts.jsx(r4m, {
          stats: E,
          dateRange: a,
          isLoading: p
        })
      });
      t[34] = a;
      t[35] = E;
      t[36] = p;
      t[37] = H;
    } else {
      H = t[37];
    }
    let U;
    if (t[38] !== f || t[39] !== I || t[40] !== F || t[41] !== H) {
      U = Ts.jsx(gXd, {
        flexDirection: "row",
        gap: 1,
        marginBottom: 1,
        children: Ts.jsxs(VM, {
          initialHeaderFocused: true,
          title: null,
          color: "claude",
          selectedTab: f,
          onTabChange: P,
          disableNavigation: I,
          children: [F, H]
        })
      });
      t[38] = f;
      t[39] = I;
      t[40] = F;
      t[41] = H;
      t[42] = U;
    } else {
      U = t[42];
    }
    let N = I ? "\u2193 stats" : "\u2191 tabs";
    let W = g ? ` \xB7 ${g}` : "";
    let j;
    if (t[43] !== N || t[44] !== W) {
      j = Ts.jsx(gXd, {
        paddingLeft: 2,
        children: Ts.jsxs(Text, {
          dimColor: true,
          children: [N, " \xB7 r to cycle dates \xB7 ctrl+s to copy", W]
        })
      });
      t[43] = N;
      t[44] = W;
      t[45] = j;
    } else {
      j = t[45];
    }
    let z;
    if (t[46] !== L || t[47] !== U || t[48] !== j) {
      z = Ts.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: L,
        children: [U, j]
      });
      t[46] = L;
      t[47] = U;
      t[48] = j;
      t[49] = z;
    } else {
      z = t[49];
    }
    return z;
  }
  function c4l(e) {
    let t = Dvt.c(9);
    let {
      dateRange: n,
      isLoading: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = _ir.map((l, c) => Ts.jsxs(Text, {
        children: [c > 0 && Ts.jsx(Text, {
          dimColor: true,
          children: " \xB7 "
        }), l === n ? Ts.jsx(Text, {
          bold: true,
          color: "claude",
          children: o4l[l]
        }) : Ts.jsx(Text, {
          dimColor: true,
          children: o4l[l]
        })]
      }, l));
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== o) {
      s = Ts.jsx(gXd, {
        children: o
      });
      t[2] = o;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== r) {
      i = r && Ts.jsx(Ed, {});
      t[4] = r;
      t[5] = i;
    } else {
      i = t[5];
    }
    let a;
    if (t[6] !== s || t[7] !== i) {
      a = Ts.jsxs(gXd, {
        marginBottom: 1,
        gap: 1,
        children: [s, i]
      });
      t[6] = s;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  function e4m({
    stats: e,
    allTimeStats: t,
    activeTimeStats: n,
    dateRange: r,
    isLoading: o
  }) {
    let {
      columns: s
    } = Sr();
    let i = Object.entries(e.modelUsage).sort(([, p], [, m]) => m.inputTokens + m.outputTokens - (p.inputTokens + p.outputTokens));
    let a = i[0];
    let l = i.reduce((p, [, m]) => p + m.inputTokens + m.outputTokens, 0);
    let c = _H.useMemo(() => u4l(e, l), [e, l]);
    let u = r === "7d" ? 7 : r === "30d" ? 30 : e.totalDays;
    let d = null;
    return Ts.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      children: [t.dailyActivity.length > 0 && Ts.jsx(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: Ts.jsx(Ansi, {
          children: rqo(t.dailyActivity, {
            terminalWidth: s
          })
        })
      }), Ts.jsx(c4l, {
        dateRange: r,
        isLoading: o
      }), Ts.jsxs(gXd, {
        flexDirection: "row",
        gap: 4,
        marginBottom: 1,
        children: [Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: a && Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Favorite model:", " ", Ts.jsx(Text, {
              color: "claude",
              bold: true,
              children: renderModelName(a[0])
            })]
          })
        }), Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Total tokens:", " ", Ts.jsx(Text, {
              color: "claude",
              children: formatNumber(l)
            })]
          })
        })]
      }), Ts.jsxs(gXd, {
        flexDirection: "row",
        gap: 4,
        children: [Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Sessions:", " ", Ts.jsx(Text, {
              color: "claude",
              children: formatNumber(e.totalSessions)
            })]
          })
        }), Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: e.longestSession && Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Longest session:", " ", Ts.jsx(Text, {
              color: "claude",
              children: formatDuration(e.longestSession.duration)
            })]
          })
        })]
      }), Ts.jsxs(gXd, {
        flexDirection: "row",
        gap: 4,
        children: [Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Active days: ", Ts.jsx(Text, {
              color: "claude",
              children: e.activeDays
            }), Ts.jsxs(Text, {
              color: "subtle",
              children: ["/", u]
            })]
          })
        }), Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Longest streak:", " ", Ts.jsx(Text, {
              color: "claude",
              bold: true,
              children: e.streaks.longestStreak
            }), " ", e.streaks.longestStreak === 1 ? "day" : "days"]
          })
        })]
      }), Ts.jsxs(gXd, {
        flexDirection: "row",
        gap: 4,
        children: [Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: e.peakActivityDay && Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Most active day:", " ", Ts.jsx(Text, {
              color: "claude",
              children: a4l(e.peakActivityDay)
            })]
          })
        }), Ts.jsx(gXd, {
          flexDirection: "column",
          width: 28,
          children: Ts.jsxs(Text, {
            wrap: "truncate",
            children: ["Current streak:", " ", Ts.jsx(Text, {
              color: "claude",
              bold: true,
              children: t.streaks.currentStreak
            }), " ", t.streaks.currentStreak === 1 ? "day" : "days"]
          })
        })]
      }), null, d && Ts.jsxs(Ts.Fragment, {
        children: [Ts.jsx(gXd, {
          marginTop: 1,
          children: Ts.jsx(Text, {
            children: "Shot distribution"
          })
        }), Ts.jsxs(gXd, {
          flexDirection: "row",
          gap: 4,
          children: [Ts.jsx(gXd, {
            flexDirection: "column",
            width: 28,
            children: Ts.jsxs(Text, {
              wrap: "truncate",
              children: [d.buckets[0].label, ":", " ", Ts.jsx(Text, {
                color: "claude",
                children: d.buckets[0].count
              }), Ts.jsxs(Text, {
                color: "subtle",
                children: [" (", d.buckets[0].pct, "%)"]
              })]
            })
          }), Ts.jsx(gXd, {
            flexDirection: "column",
            width: 28,
            children: Ts.jsxs(Text, {
              wrap: "truncate",
              children: [d.buckets[1].label, ":", " ", Ts.jsx(Text, {
                color: "claude",
                children: d.buckets[1].count
              }), Ts.jsxs(Text, {
                color: "subtle",
                children: [" (", d.buckets[1].pct, "%)"]
              })]
            })
          })]
        }), Ts.jsxs(gXd, {
          flexDirection: "row",
          gap: 4,
          children: [Ts.jsx(gXd, {
            flexDirection: "column",
            width: 28,
            children: Ts.jsxs(Text, {
              wrap: "truncate",
              children: [d.buckets[2].label, ":", " ", Ts.jsx(Text, {
                color: "claude",
                children: d.buckets[2].count
              }), Ts.jsxs(Text, {
                color: "subtle",
                children: [" (", d.buckets[2].pct, "%)"]
              })]
            })
          }), Ts.jsx(gXd, {
            flexDirection: "column",
            width: 28,
            children: Ts.jsxs(Text, {
              wrap: "truncate",
              children: [d.buckets[3].label, ":", " ", Ts.jsx(Text, {
                color: "claude",
                children: d.buckets[3].count
              }), Ts.jsxs(Text, {
                color: "subtle",
                children: [" (", d.buckets[3].pct, "%)"]
              })]
            })
          })]
        }), Ts.jsx(gXd, {
          flexDirection: "row",
          gap: 4,
          children: Ts.jsx(gXd, {
            flexDirection: "column",
            width: 28,
            children: Ts.jsxs(Text, {
              wrap: "truncate",
              children: ["Avg/session:", " ", Ts.jsx(Text, {
                color: "claude",
                children: d.avgShots
              })]
            })
          })
        })]
      }), c && Ts.jsx(gXd, {
        marginTop: 1,
        children: Ts.jsx(Text, {
          color: "suggestion",
          children: c
        })
      })]
    });
  }
  function u4l(e, t) {
    let n = [];
    if (t > 0) {
      let o = t4m.filter(s => t >= s.tokens);
      for (let s of o) {
        let i = t / s.tokens;
        if (i >= 2) {
          n.push(`You've used ~${Math.floor(i)}x more tokens than ${s.name}`);
        } else {
          n.push(`You've used the same number of tokens as ${s.name}`);
        }
      }
    }
    if (e.longestSession) {
      let o = e.longestSession.duration / 60000;
      for (let s of n4m) {
        let i = o / s.minutes;
        if (i >= 2) {
          n.push(`Your longest session is ~${Math.floor(i)}x longer than ${s.name}`);
        }
      }
    }
    if (n.length === 0) {
      return "";
    }
    let r = Math.floor(Math.random() * n.length);
    return n[r];
  }
  function r4m(e) {
    let t = Dvt.c(61);
    let {
      stats: n,
      dateRange: r,
      isLoading: o
    } = e;
    let {
      headerFocused: s,
      focusHeader: i
    } = zM();
    let [a, l] = _H.useState(0);
    let {
      columns: c
    } = Sr();
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    let C;
    let x;
    let A;
    let k;
    let I;
    let O;
    let M;
    let L;
    let P;
    if (t[0] !== r || t[1] !== i || t[2] !== s || t[3] !== o || t[4] !== a || t[5] !== n.dailyModelTokens || t[6] !== n.modelUsage || t[7] !== c) {
      C = Symbol.for("react.early_return_sentinel");
      e: {
        h = Object.entries(n.modelUsage).sort(l4m);
        let W = function (ne) {
          if (s) {
            return;
          }
          if (ne.key === "down" && a < h.length - 4) {
            ne.preventDefault();
            l(oe => Math.min(oe + 2, h.length - 4));
            return;
          }
          if (ne.key === "up") {
            if (ne.preventDefault(), a > 0) {
              l(a4m);
            } else {
              i();
            }
          }
        };
        if (h.length === 0) {
          let Z;
          if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
            Z = Ts.jsx(gXd, {
              children: Ts.jsx(Text, {
                color: "subtle",
                children: "No model usage data available"
              })
            });
            t[29] = Z;
          } else {
            Z = t[29];
          }
          C = Z;
          break e;
        }
        let j = h.reduce(i4m, 0);
        let z = d4l(n.dailyModelTokens, h.map(s4m), c);
        let V = h.slice(a, a + 4);
        let K = Math.ceil(V.length / 2);
        let J = V.slice(0, K);
        let Q = V.slice(K);
        if (f = a > 0, m = a < h.length - 4, g = h.length > 4, p = gXd, M = "column", L = 1, P = 0, _ = true, b = W, S = z && Ts.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [Ts.jsx(Text, {
            bold: true,
            children: "Tokens per Day"
          }), Ts.jsx(Ansi, {
            children: z.chart
          }), Ts.jsx(Text, {
            color: "subtle",
            children: z.xAxisLabels
          }), Ts.jsx(gXd, {
            children: z.legend.map(o4m)
          })]
        }), t[30] !== r || t[31] !== o) {
          E = Ts.jsx(c4l, {
            dateRange: r,
            isLoading: o
          });
          t[30] = r;
          t[31] = o;
          t[32] = E;
        } else {
          E = t[32];
        }
        d = gXd;
        k = "row";
        I = 4;
        O = Ts.jsx(gXd, {
          flexDirection: "column",
          width: 36,
          children: J.map(Z => {
            let [ne, oe] = Z;
            return Ts.jsx(s4l, {
              model: ne,
              usage: oe,
              totalTokens: j
            }, ne);
          })
        });
        u = gXd;
        y = "column";
        x = 36;
        A = Q.map(Z => {
          let [ne, oe] = Z;
          return Ts.jsx(s4l, {
            model: ne,
            usage: oe,
            totalTokens: j
          }, ne);
        });
      }
      t[0] = r;
      t[1] = i;
      t[2] = s;
      t[3] = o;
      t[4] = a;
      t[5] = n.dailyModelTokens;
      t[6] = n.modelUsage;
      t[7] = c;
      t[8] = u;
      t[9] = d;
      t[10] = p;
      t[11] = m;
      t[12] = f;
      t[13] = h;
      t[14] = g;
      t[15] = y;
      t[16] = _;
      t[17] = b;
      t[18] = S;
      t[19] = E;
      t[20] = C;
      t[21] = x;
      t[22] = A;
      t[23] = k;
      t[24] = I;
      t[25] = O;
      t[26] = M;
      t[27] = L;
      t[28] = P;
    } else {
      u = t[8];
      d = t[9];
      p = t[10];
      m = t[11];
      f = t[12];
      h = t[13];
      g = t[14];
      y = t[15];
      _ = t[16];
      b = t[17];
      S = t[18];
      E = t[19];
      C = t[20];
      x = t[21];
      A = t[22];
      k = t[23];
      I = t[24];
      O = t[25];
      M = t[26];
      L = t[27];
      P = t[28];
    }
    if (C !== Symbol.for("react.early_return_sentinel")) {
      return C;
    }
    let F;
    if (t[33] !== u || t[34] !== y || t[35] !== x || t[36] !== A) {
      F = Ts.jsx(u, {
        flexDirection: y,
        width: x,
        children: A
      });
      t[33] = u;
      t[34] = y;
      t[35] = x;
      t[36] = A;
      t[37] = F;
    } else {
      F = t[37];
    }
    let H;
    if (t[38] !== d || t[39] !== F || t[40] !== k || t[41] !== I || t[42] !== O) {
      H = Ts.jsxs(d, {
        flexDirection: k,
        gap: I,
        children: [O, F]
      });
      t[38] = d;
      t[39] = F;
      t[40] = k;
      t[41] = I;
      t[42] = O;
      t[43] = H;
    } else {
      H = t[43];
    }
    let U;
    if (t[44] !== m || t[45] !== f || t[46] !== h || t[47] !== a || t[48] !== g) {
      U = g && Ts.jsx(gXd, {
        marginTop: 1,
        children: Ts.jsxs(Text, {
          color: "subtle",
          children: [f ? vGd.arrowUp : " ", " ", m ? vGd.arrowDown : " ", " ", a + 1, "-", Math.min(a + 4, h.length), " of", " ", h.length, " models", " ", Ts.jsx(xt, {
            chord: ["up", "down"],
            action: "scroll",
            parens: true
          })]
        })
      });
      t[44] = m;
      t[45] = f;
      t[46] = h;
      t[47] = a;
      t[48] = g;
      t[49] = U;
    } else {
      U = t[49];
    }
    let N;
    if (t[50] !== p || t[51] !== _ || t[52] !== b || t[53] !== S || t[54] !== E || t[55] !== H || t[56] !== U || t[57] !== M || t[58] !== L || t[59] !== P) {
      N = Ts.jsxs(p, {
        flexDirection: M,
        marginTop: L,
        tabIndex: P,
        autoFocus: _,
        onKeyDown: b,
        children: [S, E, H, U]
      });
      t[50] = p;
      t[51] = _;
      t[52] = b;
      t[53] = S;
      t[54] = E;
      t[55] = H;
      t[56] = U;
      t[57] = M;
      t[58] = L;
      t[59] = P;
      t[60] = N;
    } else {
      N = t[60];
    }
    return N;
  }
  function o4m(e, t) {
    return Ts.jsxs(Text, {
      children: [t > 0 ? " \xB7 " : "", Ts.jsx(Ansi, {
        children: e.coloredBullet
      }), " ", e.model]
    }, e.model);
  }
  function s4m(e) {
    let [t] = e;
    return t;
  }
  function i4m(e, t) {
    let [, n] = t;
    return e + n.inputTokens + n.outputTokens;
  }
  function a4m(e) {
    return Math.max(e - 2, 0);
  }
  function l4m(e, t) {
    let [, n] = e;
    let [, r] = t;
    return r.inputTokens + r.outputTokens - (n.inputTokens + n.outputTokens);
  }
  function s4l(e) {
    let t = Dvt.c(21);
    let {
      model: n,
      usage: r,
      totalTokens: o
    } = e;
    let i = (r.inputTokens + r.outputTokens) / o * 100;
    let a;
    if (t[0] !== i) {
      a = i.toFixed(1);
      t[0] = i;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c;
    if (t[2] !== n) {
      c = renderModelName(n);
      t[2] = n;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== c) {
      u = Ts.jsx(Text, {
        bold: true,
        children: c
      });
      t[4] = c;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== l) {
      d = Ts.jsxs(Text, {
        color: "subtle",
        children: ["(", l, "%)"]
      });
      t[6] = l;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== u || t[9] !== d) {
      p = Ts.jsxs(Pw, {
        children: [u, " ", d]
      });
      t[8] = u;
      t[9] = d;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== r.inputTokens) {
      m = formatNumber(r.inputTokens);
      t[11] = r.inputTokens;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== r.outputTokens) {
      f = formatNumber(r.outputTokens);
      t[13] = r.outputTokens;
      t[14] = f;
    } else {
      f = t[14];
    }
    let h;
    if (t[15] !== m || t[16] !== f) {
      h = Ts.jsxs(Text, {
        color: "subtle",
        children: ["  ", "In: ", m, " \xB7 Out:", " ", f]
      });
      t[15] = m;
      t[16] = f;
      t[17] = h;
    } else {
      h = t[17];
    }
    let g;
    if (t[18] !== p || t[19] !== h) {
      g = Ts.jsxs(gXd, {
        flexDirection: "column",
        children: [p, h]
      });
      t[18] = p;
      t[19] = h;
      t[20] = g;
    } else {
      g = t[20];
    }
    return g;
  }
  function d4l(e, t, n) {
    if (e.length < 2 || t.length === 0) {
      return null;
    }
    let r = 7;
    let o = n - r;
    let s = Math.min(52, Math.max(20, o));
    let i;
    if (e.length >= s) {
      i = e.slice(-s);
    } else {
      let f = Math.floor(s / e.length);
      i = [];
      for (let h of e) {
        for (let g = 0; g < f; g++) {
          i.push(h);
        }
      }
    }
    let a = MJ(B2(uc("theme", "dark").value));
    let l = [bMn(a.suggestion), bMn(a.success), bMn(a.warning)];
    let c = [];
    let u = [];
    let d = t.slice(0, 3);
    for (let f = 0; f < d.length; f++) {
      let h = d[f];
      let g = i.map(y => y.tokensByModel[h] || 0);
      if (g.some(y => y > 0)) {
        c.push(g);
        let y = [a.suggestion, a.success, a.warning];
        u.push({
          model: renderModelName(h),
          coloredBullet: nSe(vGd.bullet, y[f % y.length])
        });
      }
    }
    if (c.length === 0) {
      return null;
    }
    let p = i4l.plot(c, {
      height: 8,
      colors: l.slice(0, c.length),
      format: f => {
        let h;
        if (f >= 1e6) {
          h = (f / 1e6).toFixed(1) + "M";
        } else if (f >= 1000) {
          h = (f / 1000).toFixed(0) + "k";
        } else {
          h = f.toFixed(0);
        }
        return h.padStart(6);
      }
    });
    let m = c4m(i, i.length, r);
    return {
      chart: p,
      legend: u,
      xAxisLabels: m
    };
  }
  function c4m(e, t, n) {
    if (e.length === 0) {
      return "";
    }
    let r = Math.min(4, Math.max(2, Math.floor(e.length / 8)));
    let o = e.length - 6;
    let s = Math.floor(o / (r - 1)) || 1;
    let i = [];
    for (let c = 0; c < r; c++) {
      let u = Math.min(c * s, e.length - 1);
      let d = a4l(e[u].date);
      i.push({
        pos: u,
        label: d
      });
    }
    let a = " ".repeat(n);
    let l = 0;
    for (let {
      pos: c,
      label: u
    } of i) {
      let d = Math.max(1, c - l);
      a += " ".repeat(d) + u;
      l = c + u.length;
    }
    return a;
  }
  async function u4m(e, t, n, r, o) {
    r("copying\u2026");
    let s = d4m(e, t, n);
    let i = await Q3l(s);
    r(i.success ? "copied!" : "copy failed");
    o.setTimeout(() => r(null), 2000);
  }
  function d4m(e, t, n) {
    let r = [];
    if (n === "Overview") {
      r.push(...p4m(e, t));
    } else {
      r.push(...m4m(e));
    }
    while (r.length > 0 && Li(r.at(-1)).trim() === "") {
      r.pop();
    }
    if (r.length > 0) {
      let o = r.at(-1);
      let s = an(o);
      let i = n === "Overview" ? 70 : 80;
      let a = "/stats";
      let l = Math.max(2, i - s - 6);
      r[r.length - 1] = o + " ".repeat(l) + _$u.gray("/stats");
    }
    return r.join(`
`);
  }
  function p4m(e, t) {
    let n = [];
    let r = MJ(B2(uc("theme", "dark").value));
    let o = y => nSe(y, r.claude);
    let s = 18;
    let i = 40;
    let a = 18;
    let l = (y, _, b, S) => {
      let E = (y + ":").padEnd(18);
      let C = E.length + _.length;
      let x = Math.max(2, 40 - C);
      let A = (b + ":").padEnd(18);
      return E + o(_) + " ".repeat(x) + A + o(S);
    };
    if (e.dailyActivity.length > 0) {
      n.push(rqo(e.dailyActivity, {
        terminalWidth: 56
      }));
      n.push("");
    }
    let c = Object.entries(e.modelUsage).sort(([, y], [, _]) => _.inputTokens + _.outputTokens - (y.inputTokens + y.outputTokens));
    let u = c[0];
    let d = c.reduce((y, [, _]) => y + _.inputTokens + _.outputTokens, 0);
    if (u) {
      n.push(l("Favorite model", renderModelName(u[0]), "Total tokens", formatNumber(d)));
    }
    n.push("");
    n.push(l("Sessions", formatNumber(e.totalSessions), "Longest session", e.longestSession ? formatDuration(e.longestSession.duration) : "N/A"));
    let p = `${e.streaks.currentStreak} ${e.streaks.currentStreak === 1 ? "day" : "days"}`;
    let m = `${e.streaks.longestStreak} ${e.streaks.longestStreak === 1 ? "day" : "days"}`;
    n.push(l("Current streak", p, "Longest streak", m));
    let f = `${e.activeDays}/${e.totalDays}`;
    let h = e.peakActivityHour !== null ? `${e.peakActivityHour}:00-${e.peakActivityHour + 1}:00` : "N/A";
    n.push(l("Active days", f, "Peak hour", h));
    n.push("");
    let g = u4l(e, d);
    n.push(o(g));
    n.push(_$u.gray(`Stats from the last ${e.totalDays} days`));
    return n;
  }
  function m4m(e) {
    let t = [];
    let n = Object.entries(e.modelUsage).sort(([, a], [, l]) => l.inputTokens + l.outputTokens - (a.inputTokens + a.outputTokens));
    if (n.length === 0) {
      t.push(_$u.gray("No model usage data available"));
      return t;
    }
    let r = n[0];
    let o = n.reduce((a, [, l]) => a + l.inputTokens + l.outputTokens, 0);
    let s = d4l(e.dailyModelTokens, n.map(([a]) => a), 80);
    if (s) {
      t.push(_$u.bold("Tokens per Day"));
      t.push(s.chart);
      t.push(_$u.gray(s.xAxisLabels));
      let a = s.legend.map(l => `${l.coloredBullet} ${l.model}`).join(" \xB7 ");
      t.push(a);
      t.push("");
    }
    t.push(`${vGd.star} Favorite: ${_$u.magenta.bold(renderModelName(r?.[0] || ""))} \xB7 ${vGd.circle} Total: ${_$u.magenta(formatNumber(o))} tokens`);
    t.push("");
    let i = n.slice(0, 3);
    for (let [a, l] of i) {
      let u = ((l.inputTokens + l.outputTokens) / o * 100).toFixed(1);
      t.push(`${vGd.bullet} ${_$u.bold(renderModelName(a))} ${_$u.gray(`(${u}%)`)}`);
      t.push(_$u.dim(`  In: ${formatNumber(l.inputTokens)} \xB7 Out: ${formatNumber(l.outputTokens)}`));
    }
    return t;
  }
  var Dvt;
  var i4l;
  var _H;
  var Ts;
  var o4l;
  var _ir;
  var X3m;
  var t4m;
  var n4m;
  var p4l = __lazy(() => {
    rE();
    ki();
    J8();
    bc();
    et();
    Bs();
    cKt();
    cs();
    $3l();
    Eo();
    Z3l();
    zg();
    r4l();
    NJ();
    Xbe();
    Loe();
    bs();
    yH();
    cA();
    Dvt = __toESM(pt(), 1);
    i4l = __toESM(D3l(), 1);
    _H = __toESM(ot(), 1);
    Ts = __toESM(ie(), 1);
    o4l = {
      "7d": "Last 7 days",
      "30d": "Last 30 days",
      all: "All time"
    };
    _ir = ["all", "7d", "30d"];
    X3m = {
      todaySeconds: 0,
      weekSeconds: 0,
      longestStretchMs: 0,
      lastWeekSessions: {
        count: 0,
        medianMs: 0,
        averageMs: 0,
        longestMs: 0
      }
    };
    t4m = [{
      name: "The Little Prince",
      tokens: 22000
    }, {
      name: "The Old Man and the Sea",
      tokens: 35000
    }, {
      name: "A Christmas Carol",
      tokens: 37000
    }, {
      name: "Animal Farm",
      tokens: 39000
    }, {
      name: "Fahrenheit 451",
      tokens: 60000
    }, {
      name: "The Great Gatsby",
      tokens: 62000
    }, {
      name: "Slaughterhouse-Five",
      tokens: 64000
    }, {
      name: "Brave New World",
      tokens: 83000
    }, {
      name: "The Catcher in the Rye",
      tokens: 95000
    }, {
      name: "Harry Potter and the Philosopher's Stone",
      tokens: 103000
    }, {
      name: "The Hobbit",
      tokens: 123000
    }, {
      name: "1984",
      tokens: 123000
    }, {
      name: "To Kill a Mockingbird",
      tokens: 130000
    }, {
      name: "Pride and Prejudice",
      tokens: 156000
    }, {
      name: "Dune",
      tokens: 244000
    }, {
      name: "Moby-Dick",
      tokens: 268000
    }, {
      name: "Crime and Punishment",
      tokens: 274000
    }, {
      name: "A Game of Thrones",
      tokens: 381000
    }, {
      name: "Anna Karenina",
      tokens: 468000
    }, {
      name: "Don Quixote",
      tokens: 520000
    }, {
      name: "The Lord of the Rings",
      tokens: 576000
    }, {
      name: "The Count of Monte Cristo",
      tokens: 603000
    }, {
      name: "Les Mis\xE9rables",
      tokens: 689000
    }, {
      name: "War and Peace",
      tokens: 730000
    }];
    n4m = [{
      name: "a TED talk",
      minutes: 18
    }, {
      name: "an episode of The Office",
      minutes: 22
    }, {
      name: "listening to Abbey Road",
      minutes: 47
    }, {
      name: "a yoga class",
      minutes: 60
    }, {
      name: "a World Cup soccer match",
      minutes: 90
    }, {
      name: "a half marathon (average time)",
      minutes: 120
    }, {
      name: "the movie Inception",
      minutes: 148
    }, {
      name: "watching Titanic",
      minutes: 195
    }, {
      name: "a transatlantic flight",
      minutes: 420
    }, {
      name: "a full night of sleep",
      minutes: 480
    }];
  });
  function uUe(e) {
    let t = m4l.c(27);
    let {
      onClose: n,
      context: r,
      defaultTab: o
    } = e;
    let [s, i] = cUe.useState(o);
    let [a, l] = cUe.useState(false);
    let [c, u] = cUe.useState(false);
    let [d, p] = cUe.useState(false);
    let m = nE();
    let {
      rows: f
    } = h_(Sr());
    let h = m ? f + 1 : Math.max(15, Math.min(Math.floor(f * 0.8), 30));
    let [g] = cUe.useState(f4m);
    Eg();
    let y;
    if (t[0] !== n || t[1] !== a) {
      y = () => {
        if (a) {
          return;
        }
        n("Settings dialog dismissed", {
          display: "system"
        });
      };
      t[0] = n;
      t[1] = a;
      t[2] = y;
    } else {
      y = t[2];
    }
    let _ = y;
    let b = !a && !(s === "Config" && c) && !(s === "Gates" && d) && s !== "Stats";
    let S;
    if (t[3] !== b) {
      S = {
        context: "Settings",
        isActive: b
      };
      t[3] = b;
      t[4] = S;
    } else {
      S = t[4];
    }
    uo("confirm:no", _, S);
    let E;
    if (t[5] !== r || t[6] !== g) {
      E = $Z.jsx(kh, {
        title: "Status",
        children: $Z.jsx(Fjl, {
          context: r,
          diagnosticsPromise: g
        })
      }, "status");
      t[5] = r;
      t[6] = g;
      t[7] = E;
    } else {
      E = t[7];
    }
    let C;
    if (t[8] !== h || t[9] !== r || t[10] !== n) {
      C = $Z.jsx(kh, {
        title: "Config",
        children: $Z.jsx(cUe.Suspense, {
          fallback: null,
          children: $Z.jsx(l3l, {
            context: r,
            onClose: n,
            setTabsHidden: l,
            onIsSearchModeChange: u,
            contentHeight: h
          })
        })
      }, "config");
      t[8] = h;
      t[9] = r;
      t[10] = n;
      t[11] = C;
    } else {
      C = t[11];
    }
    let x;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      x = $Z.jsx(kh, {
        title: "Usage",
        children: $Z.jsx(P3l, {})
      }, "usage");
      t[12] = x;
    } else {
      x = t[12];
    }
    let A;
    if (t[13] !== n) {
      A = $Z.jsx(kh, {
        title: "Stats",
        children: $Z.jsx(l4l, {
          onClose: n
        })
      }, "stats");
      t[13] = n;
      t[14] = A;
    } else {
      A = t[14];
    }
    let k;
    if (t[15] !== h) {
      k = [];
      t[15] = h;
      t[16] = k;
    } else {
      k = t[16];
    }
    let I;
    if (t[17] !== E || t[18] !== C || t[19] !== A || t[20] !== k) {
      I = [E, C, x, A, ...k];
      t[17] = E;
      t[18] = C;
      t[19] = A;
      t[20] = k;
      t[21] = I;
    } else {
      I = t[21];
    }
    let O = I;
    let M = o !== "Config" && o !== "Gates";
    let L;
    if (t[22] !== s || t[23] !== M || t[24] !== O || t[25] !== a) {
      L = $Z.jsx(Td, {
        color: "permission",
        children: $Z.jsx(VM, {
          title: "Settings",
          color: "permission",
          selectedTab: s,
          onTabChange: i,
          hidden: a,
          initialHeaderFocused: M,
          children: O
        })
      });
      t[22] = s;
      t[23] = M;
      t[24] = O;
      t[25] = a;
      t[26] = L;
    } else {
      L = t[26];
    }
    return L;
  }
  function f4m() {
    return Ljl().catch(h4m);
  }
  function h4m() {
    return [];
  }
  var m4l;
  var cUe;
  var $Z;
  var WQt = __lazy(() => {
    Bs();
    mO();
    ki();
    rE();
    oE();
    yH();
    Ujl();
    d3l();
    O3l();
    p4l();
    m4l = __toESM(pt(), 1);
    cUe = __toESM(ot(), 1);
    $Z = __toESM(ie(), 1);
  });
  var h4l = {};
  __export(h4l, {
    call: () => call_export20
  });
  function y4m(e) {
    let t = f4l.c(6);
    let {
      pairs: n,
      context: r,
      onDone: o
    } = e;
    let [, s] = useTheme();
    let i = bir.useRef(false);
    let a;
    let l;
    if (t[0] !== r || t[1] !== o || t[2] !== n || t[3] !== s) {
      a = () => {
        if (i.current) {
          return;
        }
        i.current = true;
        let c = applyConfigShorthand(n, r, {
          setTheme: s
        });
        o(c.map(_4m).join(`
`), {
          display: "system"
        });
      };
      l = [n, r, o, s];
      t[0] = r;
      t[1] = o;
      t[2] = n;
      t[3] = s;
      t[4] = a;
      t[5] = l;
    } else {
      a = t[4];
      l = t[5];
    }
    bir.useEffect(a, l);
    return null;
  }
  function _4m(e) {
    return e.message;
  }
  var f4l;
  var bir;
  var lqo;
  var call_export20 = async (e, t, n) => {
    let r = n?.trim() || "";
    if (!r) {
      return lqo.jsx(uUe, {
        onClose: e,
        context: t,
        defaultTab: "Config"
      });
    }
    let o = r.toLowerCase();
    if (Q4.includes(o) || ule.includes(o)) {
      e(`Run /config to open settings, or /config key=value to set one directly.
${listConfigKeys(t)}`, {
        display: "system"
      });
      return;
    }
    let s = parseConfigShorthand(r);
    if (!s) {
      e(`Expected key=value, got "${r}". Run /config to open settings.`, {
        display: "system"
      });
      return;
    }
    return lqo.jsx(y4m, {
      pairs: s,
      context: t,
      onDone: e
    });
  };
  var g4l = __lazy(() => {
    WQt();
    np();
    et();
    Asr();
    f4l = __toESM(pt(), 1);
    bir = __toESM(ot(), 1);
    lqo = __toESM(ie(), 1);
  });
  var y4l = {};
  __export(y4l, {
    call: () => call_export21
  });
  async function call_export21(e, t) {
    let n = e.trim();
    let r = n.toLowerCase();
    if (!r || Q4.includes(r) || ule.includes(r)) {
      return {
        type: "text",
        value: `Usage: /config key=value [key=value ...]
${listConfigKeys(t)}`
      };
    }
    let o = parseConfigShorthand(n);
    if (!o) {
      return {
        type: "text",
        value: `Expected key=value, got "${n}". Run /config to see what's available.`
      };
    }
    return {
      type: "text",
      value: applyConfigShorthand(o, t).map(i => i.message).join(`
`)
    };
  }
  var _4l = __lazy(() => {
    np();
    Asr();
  });
  var S4m;
  var cqo;
  var v4l = {};
  __export(v4l, {
    redirectMessageFor: () => redirectMessageFor,
    call: () => call_export22
  });
  function redirectMessageFor(e) {
    let t = e && T4l[e] ? e : "vim";
    return `/${t} moved \u2192 ${T4l[t]} in /config`;
  }
  var GQt;
  var T4l;
  var call_export22 = async (e, t, n, r) => {
    let o = redirectMessageFor(r);
    return GQt.jsxs(gXd, {
      flexDirection: "column",
      children: [GQt.jsx(Text, {
        color: "suggestion",
        children: o
      }), GQt.jsx(uUe, {
        onClose: () => e(o),
        context: t,
        defaultTab: "Config"
      })]
    });
  };
  var w4l = __lazy(() => {
    WQt();
    et();
    GQt = __toESM(ie(), 1);
    T4l = {
      vim: "Editor mode",
      "output-style": "Output style"
    };
  });
  function C4l(e, t) {
    return {
      type: "local-jsx",
      name: e,
      description: `${t} moved to /config`,
      isHidden: true,
      isEnabled: () => YFe(),
      load: () => Promise.resolve().then(() => (w4l(), v4l))
    };
  }
  var R4l;
  var x4l;
  var k4l = __lazy(() => {
    xsr();
    R4l = C4l("vim", "Editor mode");
    x4l = C4l("output-style", "Output style");
  });
  function P4l(e) {
    let t = [];
    C4m(e, t);
    R4m(e, t);
    k4m(e, t);
    A4m(e, t);
    I4m(e, t);
    t.sort((n, r) => {
      if (n.severity !== r.severity) {
        return n.severity === "warning" ? -1 : 1;
      }
      return (r.savingsTokens ?? 0) - (n.savingsTokens ?? 0);
    });
    return t;
  }
  function C4m(e, t) {
    if (e.percentage >= 80) {
      t.push({
        severity: "warning",
        title: `Context is ${e.percentage}% full`,
        detail: e.isAutoCompactEnabled ? "Autocompact will trigger soon, which discards older messages. Use /compact now to control what gets kept." : Me.DISABLE_COMPACT ? "Compaction is disabled." : "Autocompact is disabled. Use /compact to free space, or enable autocompact in /config."
      });
    }
  }
  function R4m(e, t) {
    if (!e.messageBreakdown) {
      return;
    }
    for (let n of e.messageBreakdown.toolCallsByType) {
      let r = n.callTokens + n.resultTokens;
      let o = r / e.rawMaxTokens * 100;
      if (o < 15 || r < 1e4) {
        continue;
      }
      let s = x4m(n.name, r, o);
      if (s) {
        t.push(s);
      }
    }
  }
  function x4m(e, t, n) {
    let r = formatTokens(t);
    switch (e) {
      case "Bash":
      case "PowerShell":
        return {
          severity: "warning",
          title: `${e} results using ${r} tokens (${n.toFixed(0)}%)`,
          detail: e === "PowerShell" ? "Pipe output through Select-Object -First/-Last or Select-String to reduce result size. Avoid Get-Content on large files \u2014 use Read with offset/limit instead." : "Pipe output through head, tail, or grep to reduce result size. Avoid cat on large files \u2014 use Read with offset/limit instead.",
          savingsTokens: Math.floor(t * 0.5)
        };
      case "Read":
        return {
          severity: "info",
          title: `Read results using ${r} tokens (${n.toFixed(0)}%)`,
          detail: "Use offset and limit parameters to read only the sections you need. Avoid re-reading entire files when you only need a few lines.",
          savingsTokens: Math.floor(t * 0.3)
        };
      case "Grep":
        return {
          severity: "info",
          title: `Grep results using ${r} tokens (${n.toFixed(0)}%)`,
          detail: "Add more specific patterns or use the glob or type parameter to narrow file types. Consider Glob for file discovery instead of Grep.",
          savingsTokens: Math.floor(t * 0.3)
        };
      case "WebFetch":
        return {
          severity: "info",
          title: `WebFetch results using ${r} tokens (${n.toFixed(0)}%)`,
          detail: "Web page content can be very large. Consider extracting only the specific information needed.",
          savingsTokens: Math.floor(t * 0.4)
        };
      default:
        if (n >= 20) {
          return {
            severity: "info",
            title: `${e} using ${r} tokens (${n.toFixed(0)}%)`,
            detail: "This tool is consuming a significant portion of context.",
            savingsTokens: Math.floor(t * 0.2)
          };
        }
        return null;
    }
  }
  function k4m(e, t) {
    if (!e.messageBreakdown) {
      return;
    }
    let r = e.messageBreakdown.toolCallsByType.find(a => a.name === "Read");
    if (!r) {
      return;
    }
    let o = r.callTokens + r.resultTokens;
    let s = o / e.rawMaxTokens * 100;
    let i = r.resultTokens / e.rawMaxTokens * 100;
    if (s >= 15 && o >= 1e4) {
      return;
    }
    if (i >= 5 && r.resultTokens >= 1e4) {
      t.push({
        severity: "info",
        title: `File reads using ${formatTokens(r.resultTokens)} tokens (${i.toFixed(0)}%)`,
        detail: "If you are re-reading files, consider referencing earlier reads. Use offset/limit for large files.",
        savingsTokens: Math.floor(r.resultTokens * 0.3)
      });
    }
  }
  function A4m(e, t) {
    let n = e.memoryFiles.reduce((o, s) => o + s.tokens, 0);
    let r = n / e.rawMaxTokens * 100;
    if (r >= 5 && n >= 5000) {
      let o = [...e.memoryFiles].sort((s, i) => i.tokens - s.tokens).slice(0, 3).map(s => `${Pd(s.path)} (${formatTokens(s.tokens)})`).join(", ");
      t.push({
        severity: "info",
        title: `Memory files using ${formatTokens(n)} tokens (${r.toFixed(0)}%)`,
        detail: `Largest: ${o}. Use /memory to review and prune stale entries.`,
        savingsTokens: Math.floor(n * 0.3)
      });
    }
  }
  function I4m(e, t) {
    if (!e.isAutoCompactEnabled && !Me.DISABLE_COMPACT && e.percentage >= 50 && e.percentage < 80) {
      t.push({
        severity: "info",
        title: "Autocompact is disabled",
        detail: "Without autocompact, you will hit context limits and lose the conversation. Enable it in /config or use /compact manually."
      });
    }
  }
  var O4l = __lazy(() => {
    Tm();
    _x();
    EX();
    pr();
    Zl();
    cs();
  });
  function M4l(e) {
    let t = D4l.c(5);
    let {
      suggestions: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = aie.jsx(Text, {
        bold: true,
        children: "Suggestions"
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = n.map(P4m);
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== o) {
      s = aie.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [r, o]
      });
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function P4m(e, t) {
    return aie.jsxs(gXd, {
      flexDirection: "column",
      marginTop: t === 0 ? 0 : 1,
      children: [aie.jsxs(gXd, {
        children: [aie.jsx(Ps, {
          status: e.severity,
          withSpace: true
        }), aie.jsx(Text, {
          bold: true,
          children: e.title
        }), e.savingsTokens ? aie.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowRight, " save ~", formatTokens(e.savingsTokens)]
        }) : null]
      }), aie.jsx(gXd, {
        marginLeft: 2,
        children: aie.jsx(Text, {
          dimColor: true,
          children: e.detail
        })
      })]
    }, t);
  }
  var D4l;
  var aie;
  var N4l = __lazy(() => {
    et();
    cs();
    Vf();
    D4l = __toESM(pt(), 1);
    aie = __toESM(ie(), 1);
  });
  function O4m() {
    let e = Tir.c(2);
    return null;
  }
  function L4l(e) {
    let t = new Map();
    for (let r of e) {
      let o = _je(r.source) + (r.pluginName ? ` (${r.pluginName})` : "");
      let s = t.get(o) || [];
      s.push(r);
      t.set(o, s);
    }
    for (let [r, o] of t.entries()) {
      t.set(r, o.sort((s, i) => i.tokens - s.tokens));
    }
    let n = new Map();
    for (let r of D4m) {
      let o = t.get(r);
      if (o) {
        n.set(r, o);
      }
      let s = [...t.keys()].filter(i => i.startsWith(r + " (")).sort();
      for (let i of s) {
        n.set(i, t.get(i));
      }
    }
    for (let [r, o] of t) {
      if (!n.vZc(r)) {
        n.set(r, o);
      }
    }
    return n;
  }
  function Sir(e) {
    let t = Tir.c(9);
    let {
      count: n,
      noun: r,
      tokens: o
    } = e;
    let s;
    if (t[0] !== n || t[1] !== r) {
      s = un(n, r);
      t[0] = n;
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== o) {
      i = formatTokens(o);
      t[3] = o;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] !== n || t[6] !== s || t[7] !== i) {
      a = Hi.jsx(ms, {
        variant: "tree",
        children: Hi.jsxs(ms.Node, {
          dimColor: true,
          children: [n, " ", s, " \xB7 ", i, " tokens"]
        })
      });
      t[5] = n;
      t[6] = s;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  function dqo(e) {
    let t = Tir.c(116);
    let {
      data: n,
      isRemote: r,
      collapseDetailSections: o
    } = e;
    let s = r === undefined ? false : r;
    let i = o === undefined ? false : o;
    let {
      categories: a,
      totalTokens: l,
      rawMaxTokens: c,
      autocompactSource: u,
      percentage: d,
      gridRows: p,
      model: m,
      memoryFiles: f,
      mcpTools: h,
      deferredBuiltinTools: g,
      systemTools: y,
      systemPromptSections: _,
      agents: b,
      skills: S,
      messageBreakdown: E
    } = n;
    let C;
    let x;
    let A;
    let k;
    let I;
    let O;
    let M;
    let L;
    let P;
    let F;
    let H;
    let U;
    if (t[0] !== b.length || t[1] !== u || t[2] !== a || t[3] !== i || t[4] !== p || t[5] !== s || t[6] !== h || t[7] !== f.length || t[8] !== m || t[9] !== d || t[10] !== c || t[11] !== S?.tokens || t[12] !== _?.length || t[13] !== y || t[14] !== g || t[15] !== l) {
      let oe = g === undefined ? [] : g;
      let ee = a.filter(nWm);
      let re;
      if (t[28] !== a) {
        re = a.some(tWm);
        t[28] = a;
        t[29] = re;
      } else {
        re = t[29];
      }
      let se = re;
      let ae = oe.length > 0;
      let de = a.find(eWm);
      if (A = h.length > 0 || b.length > 0 || f.length > 0 || (S?.tokens ?? 0) > 0 || false, x = gXd, U = "column", k = 1, t[30] === Symbol.for("react.memo_cache_sentinel")) {
        I = Hi.jsx(Text, {
          bold: true,
          children: "Context Usage"
        });
        t[30] = I;
      } else {
        I = t[30];
      }
      let be;
      if (t[31] !== p) {
        be = p.map(Q4m);
        t[31] = p;
        t[32] = be;
      } else {
        be = t[32];
      }
      let fe;
      if (t[33] !== be) {
        fe = Hi.jsx(gXd, {
          flexDirection: "column",
          flexShrink: 0,
          children: be
        });
        t[33] = be;
        t[34] = fe;
      } else {
        fe = t[34];
      }
      let me;
      if (t[35] !== m) {
        me = getPublicModelDisplayName(m) && Hi.jsx(Text, {
          children: getPublicModelDisplayName(m)
        });
        t[35] = m;
        t[36] = me;
      } else {
        me = t[36];
      }
      let Te;
      if (t[37] !== m) {
        Te = Hi.jsx(Text, {
          dimColor: true,
          children: m
        });
        t[37] = m;
        t[38] = Te;
      } else {
        Te = t[38];
      }
      let ue;
      if (t[39] !== l) {
        ue = formatTokens(l);
        t[39] = l;
        t[40] = ue;
      } else {
        ue = t[40];
      }
      let ce;
      if (t[41] !== c) {
        ce = formatTokens(c);
        t[41] = c;
        t[42] = ce;
      } else {
        ce = t[42];
      }
      let le;
      if (t[43] !== d || t[44] !== ue || t[45] !== ce) {
        le = Hi.jsxs(Text, {
          dimColor: true,
          children: [ue, "/", ce, " tokens (", d, "%)"]
        });
        t[43] = d;
        t[44] = ue;
        t[45] = ce;
        t[46] = le;
      } else {
        le = t[46];
      }
      let pe;
      if (t[47] !== s) {
        pe = !s && Hi.jsx(O4m, {});
        t[47] = s;
        t[48] = pe;
      } else {
        pe = t[48];
      }
      let ve;
      let _e;
      if (t[49] === Symbol.for("react.memo_cache_sentinel")) {
        ve = Hi.jsx(Text, {
          children: " "
        });
        _e = Hi.jsx(Text, {
          dimColor: true,
          italic: true,
          children: "Estimated usage by category"
        });
        t[49] = ve;
        t[50] = _e;
      } else {
        ve = t[49];
        _e = t[50];
      }
      let xe;
      if (t[51] !== c) {
        xe = (Be, We) => {
          let Ze = formatTokens(Be.tokens);
          let Tt = Be.isDeferred ? "N/A" : `${(Be.tokens / c * 100).toFixed(1)}%`;
          let kt = Be.name === "Autocompact buffer";
          let Ye = Be.name;
          let ht = Be.isDeferred ? " " : kt ? "\u26DD" : "\u26C1";
          return Hi.jsxs(gXd, {
            children: [Hi.jsx(Text, {
              color: Be.color,
              children: ht
            }), Hi.jsxs(Text, {
              children: [" ", Ye, ": "]
            }), Hi.jsxs(Text, {
              dimColor: true,
              children: [Ze, " tokens (", Tt, ")"]
            })]
          }, We);
        };
        t[51] = c;
        t[52] = xe;
      } else {
        xe = t[52];
      }
      let ke = ee.map(xe);
      let Ie;
      if (t[53] !== a || t[54] !== c) {
        Ie = (a.find(X4m)?.tokens ?? 0) > 0 && Hi.jsxs(gXd, {
          children: [Hi.jsx(Text, {
            dimColor: true,
            children: "\u26F6"
          }), Hi.jsx(Text, {
            children: " Free space: "
          }), Hi.jsxs(Text, {
            dimColor: true,
            children: [formatTokens(a.find(J4m)?.tokens || 0), " ", "(", ((a.find(Y4m)?.tokens || 0) / c * 100).toFixed(1), "%)"]
          })]
        });
        t[53] = a;
        t[54] = c;
        t[55] = Ie;
      } else {
        Ie = t[55];
      }
      let Ue = de && de.tokens > 0 && Hi.jsxs(gXd, {
        children: [Hi.jsx(Text, {
          color: de.color,
          children: "\u26DD"
        }), Hi.jsxs(Text, {
          dimColor: true,
          children: [" ", de.name, ": "]
        }), Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokens(de.tokens), " tokens (", (de.tokens / c * 100).toFixed(1), "%)"]
        })]
      });
      let Ge;
      if (t[56] !== me || t[57] !== Te || t[58] !== le || t[59] !== pe || t[60] !== ke || t[61] !== Ie || t[62] !== Ue) {
        Ge = Hi.jsxs(gXd, {
          flexDirection: "column",
          gap: 0,
          flexShrink: 0,
          children: [me, Te, le, pe, ve, _e, ke, Ie, Ue]
        });
        t[56] = me;
        t[57] = Te;
        t[58] = le;
        t[59] = pe;
        t[60] = ke;
        t[61] = Ie;
        t[62] = Ue;
        t[63] = Ge;
      } else {
        Ge = t[63];
      }
      if (t[64] !== fe || t[65] !== Ge) {
        O = Hi.jsxs(gXd, {
          flexDirection: "row",
          gap: 2,
          children: [fe, Ge]
        });
        t[64] = fe;
        t[65] = Ge;
        t[66] = O;
      } else {
        O = t[66];
      }
      if (C = gXd, M = "column", L = -1, t[67] !== u || t[68] !== c) {
        P = u !== "auto" && Hi.jsxs(gXd, {
          marginTop: 1,
          children: [Hi.jsx(Text, {
            bold: true,
            children: "Auto-compact window: "
          }), Hi.jsx(Text, {
            dimColor: true,
            children: u === "experiment" || u === "clientdata" ? `auto (${formatTokens(c)} tokens)` : `${formatTokens(c)} tokens`
          })]
        });
        t[67] = u;
        t[68] = c;
        t[69] = P;
      } else {
        P = t[69];
      }
      if (t[70] !== i || t[71] !== se || t[72] !== h) {
        F = h.length > 0 && Hi.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [Hi.jsxs(gXd, {
            children: [Hi.jsx(Text, {
              bold: true,
              children: "MCP tools"
            }), Hi.jsxs(Text, {
              dimColor: true,
              children: [" ", "\xB7 /mcp", se ? " (loaded on-demand)" : ""]
            })]
          }), i ? Hi.jsx(Sir, {
            count: h.length,
            noun: "tool",
            tokens: h.filter(Be => !se || Be.isLoaded).reduce(K4m, 0)
          }) : Hi.jsxs(Hi.Fragment, {
            children: [h.some(z4m) && Hi.jsxs(gXd, {
              flexDirection: "column",
              marginTop: 1,
              children: [Hi.jsx(Text, {
                dimColor: true,
                children: "Loaded"
              }), Hi.jsx(ms, {
                variant: "tree",
                children: h.filter(V4m).map(G4m)
              })]
            }), se && h.some(W4m) && Hi.jsxs(gXd, {
              flexDirection: "column",
              marginTop: 1,
              children: [Hi.jsx(Text, {
                dimColor: true,
                children: "Available"
              }), Hi.jsx(ms, {
                variant: "tree",
                children: h.filter(q4m).map(j4m)
              })]
            }), !se && Hi.jsx(ms, {
              variant: "tree",
              children: h.map(H4m)
            })]
          })]
        });
        t[70] = i;
        t[71] = se;
        t[72] = h;
        t[73] = F;
      } else {
        F = t[73];
      }
      H = (y && y.length > 0 || ae) && false;
      t[0] = b.length;
      t[1] = u;
      t[2] = a;
      t[3] = i;
      t[4] = p;
      t[5] = s;
      t[6] = h;
      t[7] = f.length;
      t[8] = m;
      t[9] = d;
      t[10] = c;
      t[11] = S?.tokens;
      t[12] = _?.length;
      t[13] = y;
      t[14] = g;
      t[15] = l;
      t[16] = C;
      t[17] = x;
      t[18] = A;
      t[19] = k;
      t[20] = I;
      t[21] = O;
      t[22] = M;
      t[23] = L;
      t[24] = P;
      t[25] = F;
      t[26] = H;
      t[27] = U;
    } else {
      C = t[16];
      x = t[17];
      A = t[18];
      k = t[19];
      I = t[20];
      O = t[21];
      M = t[22];
      L = t[23];
      P = t[24];
      F = t[25];
      H = t[26];
      U = t[27];
    }
    let N;
    if (t[74] !== i || t[75] !== _) {
      N = _ && _.length > 0 && false;
      t[74] = i;
      t[75] = _;
      t[76] = N;
    } else {
      N = t[76];
    }
    let W;
    if (t[77] !== b || t[78] !== i) {
      W = b.length > 0 && Hi.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Hi.jsxs(gXd, {
          children: [Hi.jsx(Text, {
            bold: true,
            children: "Custom agents"
          }), Hi.jsx(Text, {
            dimColor: true,
            children: " \xB7 .claude/agents/"
          })]
        }), i ? Hi.jsx(Sir, {
          count: b.length,
          noun: "agent",
          tokens: b.reduce($4m, 0)
        }) : Array.from(L4l(b).entries()).map(U4m)]
      });
      t[77] = b;
      t[78] = i;
      t[79] = W;
    } else {
      W = t[79];
    }
    let j;
    if (t[80] !== i || t[81] !== f) {
      j = f.length > 0 && Hi.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Hi.jsxs(gXd, {
          children: [Hi.jsx(Text, {
            bold: true,
            children: "Memory files"
          }), Hi.jsx(Text, {
            dimColor: true,
            children: " \xB7 /memory"
          })]
        }), i ? Hi.jsx(Sir, {
          count: f.length,
          noun: "file",
          tokens: f.reduce(F4m, 0)
        }) : Hi.jsx(ms, {
          variant: "tree",
          children: f.map(L4m)
        })]
      });
      t[80] = i;
      t[81] = f;
      t[82] = j;
    } else {
      j = t[82];
    }
    let z;
    if (t[83] !== i || t[84] !== S) {
      z = S && S.tokens > 0 && Hi.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Hi.jsxs(gXd, {
          children: [Hi.jsx(Text, {
            bold: true,
            children: "Skills"
          }), Hi.jsx(Text, {
            dimColor: true,
            children: " \xB7 /skills"
          })]
        }), i ? Hi.jsx(Sir, {
          count: S.skillFrontmatter.length,
          noun: "skill",
          tokens: S.tokens
        }) : Array.from(L4l(S.skillFrontmatter).entries()).map(M4m)]
      });
      t[83] = i;
      t[84] = S;
      t[85] = z;
    } else {
      z = t[85];
    }
    let V;
    if (t[86] !== E) {
      V = E && false;
      t[86] = E;
      t[87] = V;
    } else {
      V = t[87];
    }
    let K;
    if (t[88] !== i || t[89] !== A) {
      K = i && A && Hi.jsx(gXd, {
        marginTop: 1,
        children: Hi.jsx(Text, {
          dimColor: true,
          children: "/context all to expand"
        })
      });
      t[88] = i;
      t[89] = A;
      t[90] = K;
    } else {
      K = t[90];
    }
    let J;
    if (t[91] !== C || t[92] !== N || t[93] !== W || t[94] !== j || t[95] !== z || t[96] !== V || t[97] !== K || t[98] !== M || t[99] !== L || t[100] !== P || t[101] !== F || t[102] !== H) {
      J = Hi.jsxs(C, {
        flexDirection: M,
        marginLeft: L,
        children: [P, F, H, N, W, j, z, V, K]
      });
      t[91] = C;
      t[92] = N;
      t[93] = W;
      t[94] = j;
      t[95] = z;
      t[96] = V;
      t[97] = K;
      t[98] = M;
      t[99] = L;
      t[100] = P;
      t[101] = F;
      t[102] = H;
      t[103] = J;
    } else {
      J = t[103];
    }
    let Q;
    if (t[104] !== n) {
      Q = P4l(n);
      t[104] = n;
      t[105] = Q;
    } else {
      Q = t[105];
    }
    let Z;
    if (t[106] !== Q) {
      Z = Hi.jsx(M4l, {
        suggestions: Q
      });
      t[106] = Q;
      t[107] = Z;
    } else {
      Z = t[107];
    }
    let ne;
    if (t[108] !== x || t[109] !== k || t[110] !== I || t[111] !== O || t[112] !== J || t[113] !== Z || t[114] !== U) {
      ne = Hi.jsxs(x, {
        flexDirection: U,
        paddingLeft: k,
        children: [I, O, J, Z]
      });
      t[108] = x;
      t[109] = k;
      t[110] = I;
      t[111] = O;
      t[112] = J;
      t[113] = Z;
      t[114] = U;
      t[115] = ne;
    } else {
      ne = t[115];
    }
    return ne;
  }
  function M4m(e) {
    let [t, n] = e;
    return Hi.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      children: [Hi.jsx(Text, {
        dimColor: true,
        children: t
      }), Hi.jsx(ms, {
        variant: "tree",
        children: n.map(N4m)
      })]
    }, t);
  }
  function N4m(e, t) {
    return Hi.jsx(ms.Node, {
      children: Hi.jsxs(Text, {
        children: [e.name, ":", " ", Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokenEstimate(e.tokens), " tokens"]
        })]
      })
    }, t);
  }
  function L4m(e, t) {
    return Hi.jsx(ms.Node, {
      children: Hi.jsxs(Text, {
        children: [Pd(e.path), ":", " ", Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokens(e.tokens), " tokens"]
        })]
      })
    }, t);
  }
  function F4m(e, t) {
    return e + t.tokens;
  }
  function U4m(e) {
    let [t, n] = e;
    return Hi.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      children: [Hi.jsx(Text, {
        dimColor: true,
        children: t
      }), Hi.jsx(ms, {
        variant: "tree",
        children: n.map(B4m)
      })]
    }, t);
  }
  function B4m(e, t) {
    return Hi.jsx(ms.Node, {
      children: Hi.jsxs(Text, {
        children: [e.agentType, ":", " ", Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokens(e.tokens), " tokens"]
        })]
      })
    }, t);
  }
  function $4m(e, t) {
    return e + t.tokens;
  }
  function H4m(e, t) {
    return Hi.jsx(ms.Node, {
      children: Hi.jsxs(Text, {
        children: [e.name, ":", " ", Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokens(e.tokens), " tokens"]
        })]
      })
    }, t);
  }
  function j4m(e, t) {
    return Hi.jsx(ms.Node, {
      dimColor: true,
      children: e.name
    }, t);
  }
  function q4m(e) {
    return !e.isLoaded;
  }
  function W4m(e) {
    return !e.isLoaded;
  }
  function G4m(e, t) {
    return Hi.jsx(ms.Node, {
      children: Hi.jsxs(Text, {
        children: [e.name, ":", " ", Hi.jsxs(Text, {
          dimColor: true,
          children: [formatTokens(e.tokens), " tokens"]
        })]
      })
    }, t);
  }
  function V4m(e) {
    return e.isLoaded;
  }
  function z4m(e) {
    return e.isLoaded;
  }
  function K4m(e, t) {
    return e + t.tokens;
  }
  function Y4m(e) {
    return e.name === "Free space";
  }
  function J4m(e) {
    return e.name === "Free space";
  }
  function X4m(e) {
    return e.name === "Free space";
  }
  function Q4m(e, t) {
    return Hi.jsx(gXd, {
      flexDirection: "row",
      marginLeft: -1,
      children: e.map(Z4m)
    }, t);
  }
  function Z4m(e, t) {
    if (e.categoryName === "Free space") {
      return Hi.jsx(Text, {
        dimColor: true,
        children: "\u26F6 "
      }, t);
    }
    if (e.categoryName === "Autocompact buffer") {
      return Hi.jsx(Text, {
        color: e.color,
        children: "\u26DD "
      }, t);
    }
    return Hi.jsx(Text, {
      color: e.color,
      children: e.squareFullness >= 0.7 ? "\u26C1 " : "\u26C0 "
    }, t);
  }
  function eWm(e) {
    return e.name === "Autocompact buffer";
  }
  function tWm(e) {
    return e.isDeferred && e.name.includes("MCP");
  }
  function nWm(e) {
    return e.tokens > 0 && e.name !== "Free space" && e.name !== "Autocompact buffer" && !e.isDeferred;
  }
  var Tir;
  var Hi;
  var D4m;
  var F4l = __lazy(() => {
    et();
    O4l();
    Zl();
    cs();
    Eo();
    nf();
    Zn();
    N4l();
    Pse();
    Tir = __toESM(pt(), 1);
    Hi = __toESM(ie(), 1);
    D4m = ["Project", "User", "Managed", "Plugin", "MCP", "Built-in"];
  });
  function VQt(e, t) {
    let {
      categories: n,
      totalTokens: r,
      rawMaxTokens: o,
      percentage: s,
      model: i,
      memoryFiles: a,
      mcpTools: l,
      agents: c,
      skills: u,
      messageBreakdown: d,
      systemTools: p,
      systemPromptSections: m
    } = e;
    let f = `## Context Usage

`;
    f += `**Model:** ${i}  
`;
    f += `**Tokens:** ${formatTokens(r)} / ${formatTokens(o)} (${s}%)
`;
    f += `
`;
    let h = n.filter(g => g.tokens > 0 && g.name !== "Free space" && g.name !== "Autocompact buffer");
    if (h.length > 0) {
      f += `### Estimated usage by category

`;
      f += `| Category | Tokens | Percentage |
`;
      f += `|----------|--------|------------|
`;
      for (let _ of h) {
        let b = (_.tokens / o * 100).toFixed(1);
        f += `| ${_.name} | ${formatTokens(_.tokens)} | ${b}% |
`;
      }
      let g = n.find(_ => _.name === "Free space");
      if (g && g.tokens > 0) {
        let _ = (g.tokens / o * 100).toFixed(1);
        f += `| Free space | ${formatTokens(g.tokens)} | ${_}% |
`;
      }
      let y = n.find(_ => _.name === "Autocompact buffer");
      if (y && y.tokens > 0) {
        let _ = (y.tokens / o * 100).toFixed(1);
        f += `| Autocompact buffer | ${formatTokens(y.tokens)} | ${_}% |
`;
      }
      f += `
`;
    }
    if (l.length > 0) {
      f += `### MCP Tools

`;
      f += `| Tool | Server | Tokens |
`;
      f += `|------|--------|--------|
`;
      for (let g of l) {
        f += `| ${g.name} | ${g.serverName} | ${formatTokens(g.tokens)} |
`;
      }
      f += `
`;
    }
    if (p && p.length > 0, m && m.length > 0, c.length > 0) {
      f += `### Custom Agents

`;
      f += `| Agent Type | Source | Tokens |
`;
      f += `|------------|--------|--------|
`;
      for (let g of c) {
        let y;
        switch (g.source) {
          case "projectSettings":
            y = "Project";
            break;
          case "userSettings":
            y = "User";
            break;
          case "localSettings":
            y = "Local";
            break;
          case "flagSettings":
            y = "Flag";
            break;
          case "policySettings":
            y = "Policy";
            break;
          case "plugin":
            y = "Plugin";
            break;
          case "built-in":
            y = "Built-in";
            break;
          default:
            y = String(g.source);
        }
        f += `| ${g.agentType} | ${y} | ${formatTokens(g.tokens)} |
`;
      }
      f += `
`;
    }
    if (a.length > 0) {
      f += `### Memory Files

`;
      f += `| Type | Path | Tokens |
`;
      f += `|------|------|--------|
`;
      for (let g of a) {
        f += `| ${g.type} | ${g.path} | ${formatTokens(g.tokens)} |
`;
      }
      f += `
`;
    }
    if (u && u.tokens > 0 && u.skillFrontmatter.length > 0) {
      f += `### Skills

`;
      f += `| Skill | Source | Tokens |
`;
      f += `|-------|--------|--------|
`;
      for (let g of u.skillFrontmatter) {
        let y = _je(g.source) + (g.pluginName ? ` (${g.pluginName})` : "");
        f += `| ${g.name} | ${y} | ${formatTokenEstimate(g.tokens)} |
`;
      }
      f += `
`;
    }
    return f;
  }
  var pqo = __lazy(() => {
    cs();
    nf();
    Zn();
  });
  var U4l = {};
  __export(U4l, {
    call: () => call_export23
  });
  function rWm(e) {
    return kg(e);
  }
  async function call_export23(e, t, n) {
    let r = qs() && n.trim().toLowerCase() !== "all";
    let o = Ul();
    if (o) {
      if (!LD("controlChannel")) {
        e("Context usage isn't available over this remote connection");
        return null;
      }
      try {
        let f = await o.sendControlRequest({
          subtype: "get_context_usage"
        });
        let h = await A_t(mqo.jsx(dqo, {
          data: f,
          isRemote: true,
          collapseDetailSections: r
        }));
        e(h, {
          display: "system",
          metaMessages: [VQt(f, {
            skipCollapseStatus: true
          })]
        });
      } catch (f) {
        e(`Couldn't fetch context from remote: ${he(f)}`);
      }
      return null;
    }
    let {
      messages: s,
      getAppState: i,
      options: {
        mainLoopModel: a,
        tools: l
      }
    } = t;
    let c = rWm(s);
    let u = process.stdout.columns || 80;
    let d = i();
    let p = await Lrr(c, a, async () => d.toolPermissionContext, l, d.agentDefinitions, u, t, undefined, c, d.autoCompactWindow);
    let m = await A_t(mqo.jsx(dqo, {
      data: p,
      collapseDetailSections: r
    }));
    e(m, {
      display: "system",
      metaMessages: [VQt(p)]
    });
    return null;
  }
  var mqo;
  var B4l = __lazy(() => {
    F4l();
    ru();
    Frr();
    dt();
    zp();
    ro();
    I1e();
    pqo();
    mqo = __toESM(ie(), 1);
  });
  var fqo = {};
  __export(fqo, {
    collectContextData: () => collectContextData,
    call: () => call_export24
  });
  async function collectContextData(e) {
    let {
      messages: t,
      getAppState: n,
      options: {
        mainLoopModel: r,
        tools: o,
        agentDefinitions: s,
        customSystemPrompt: i,
        appendSystemPrompt: a,
        excludeDynamicSections: l
      }
    } = e;
    let c = kg(t);
    let u = n();
    return Lrr(c, r, async () => u.toolPermissionContext, o, s, undefined, {
      options: {
        customSystemPrompt: i,
        appendSystemPrompt: a
      },
      getMcp: e.getMcp
    }, undefined, c, u.autoCompactWindow, l);
  }
  async function call_export24(e, t) {
    let n = await collectContextData(t);
    return {
      type: "text",
      value: VQt(n)
    };
  }
  var zQt = __lazy(() => {
    Frr();
    ro();
    pqo();
  });
  var hqo;
  var gqo;
  var $4l = __lazy(() => {
    at();
    hqo = {
      name: "context",
      description: "Visualize current context usage as a colored grid",
      argumentHint: "[all]",
      isEnabled: () => !getIsNonInteractiveSession(),
      type: "local-jsx",
      thinClientDispatch: "control-request",
      load: () => Promise.resolve().then(() => (B4l(), U4l))
    };
    gqo = {
      type: "local",
      name: "context",
      supportsNonInteractive: true,
      description: "Show current context usage",
      get isHidden() {
        return !getIsNonInteractiveSession();
      },
      isEnabled() {
        return getIsNonInteractiveSession();
      },
      load: () => Promise.resolve().then(() => (zQt(), fqo))
    };
  });
  function Nvt(e) {
    if (e instanceof xc) {
      return "aborted";
    }
    if (e instanceof Lwe) {
      return "timeout";
    }
    if (e instanceof Error && (e.message.endsWith("Disconnected") || e.message.endsWith("Connection to remote lost"))) {
      return "disconnected";
    }
    if (e instanceof Error && (e.message.endsWith("not connected") || e.message.includes("Cannot send:"))) {
      return "not_connected";
    }
    return "server_error";
  }
  var Lwe;
  var KQt = __lazy(() => {
    dt();
    Lwe = class Lwe extends Error {
      subtype;
      constructor(e, t) {
        super(`[RemoteSessionManager] control_request '${e}' got no response after ${t / 1000}s \u2014 the worker may still apply it`);
        this.subtype = e;
      }
    };
  });
  function j4l(e = 0, t = true) {
    let r = bH.useContext(aG)?.setTimeout ?? uct;
    let [o, s] = bH.useState(null);
    let [i, a] = bH.useState(yqo);
    let [l, c] = bH.useState(true);
    let u = bH.useRef(false);
    let [d, p] = bH.useState(0);
    bH.useEffect(() => onWatchedGitStateChange(() => p(m => m + 1)), []);
    bH.useEffect(() => {
      if (!t) {
        return;
      }
      let m = false;
      let f = new AbortController();
      async function h() {
        try {
          let y = await j9n(f.signal);
          if (m) {
            return;
          }
          let _ = y?.source.kind === "branch" ? y.source.baseRef : "HEAD";
          let b = await q9n(f.signal, _);
          if (m) {
            return;
          }
          if (y !== null) {
            s(y);
          } else if (!u.current) {
            s(null);
          }
          if (b !== null) {
            a(b);
          } else if (!u.current) {
            a(yqo);
          }
          u.current = true;
          c(false);
        } catch (y) {
          if (m) {
            return;
          }
          if (!u.current) {
            s(null);
            a(yqo);
          }
          u.current = true;
          c(false);
        }
      }
      let g = r(h, u.current ? 150 : 0);
      return () => {
        m = true;
        g();
        f.abort();
      };
    }, [e, t, d]);
    return bH.useMemo(() => {
      if (!o) {
        return {
          stats: null,
          files: [],
          hunks: new Map(),
          loading: t && l,
          source: {
            kind: "working-tree"
          }
        };
      }
      let {
        stats: m,
        perFileStats: f,
        source: h
      } = o;
      let g = [];
      for (let [y, _] of f) {
        let b = _.isUntracked;
        let S = i.skippedLarge.vZc(y);
        let E = _.added + _.removed;
        let C = !S && !_.isBinary && E > 400;
        g.push({
          path: y,
          linesAdded: _.added,
          linesRemoved: _.removed,
          isBinary: _.isBinary,
          isLargeFile: S,
          isTruncated: C,
          isUntracked: b
        });
      }
      g.sort((y, _) => y.path.localeCompare(_.path));
      return {
        stats: m,
        files: g,
        hunks: i.hunks,
        loading: false,
        source: h
      };
    }, [o, i, l, t]);
  }
  function vir(e) {
    return {
      stats: null,
      files: [],
      hunks: new Map(),
      loading: e,
      source: {
        kind: "working-tree"
      }
    };
  }
  function aWm(e) {
    let t = new Set(e.skippedLarge);
    let n = new Set(e.restricted);
    let r = e.perFileStats.map(o => {
      let s = t.vZc(o.path);
      return {
        path: o.path,
        linesAdded: o.added,
        linesRemoved: o.removed,
        isBinary: o.isBinary,
        isLargeFile: s,
        isTruncated: !s && !o.isBinary && o.added + o.removed > 400,
        isUntracked: o.isUntracked,
        isRestricted: n.vZc(o.path)
      };
    }).sort((o, s) => o.path.localeCompare(s.path));
    return {
      stats: e.stats,
      files: r,
      hunks: new Map(e.hunks.map(o => [o.path, o.hunks])),
      loading: false,
      source: e.source
    };
  }
  function lWm(e) {
    let [t, n] = bH.useState(() => ({
      data: vir(e),
      notice: null
    }));
    bH.useEffect(() => {
      if (!e) {
        return;
      }
      let r = Ul();
      if (!r || !LD("controlChannel")) {
        Et("remote_workspace_diff_fetch", "no_channel");
        n({
          data: vir(false),
          notice: "Workspace changes aren't available over this connection \u2014 showing per-turn changes only"
        });
        return;
      }
      let o = false;
      r.sendControlRequest({
        subtype: "get_workspace_diff"
      }).then(s => {
        if (o) {
          return;
        }
        Pe("remote_workspace_diff_fetch");
        n({
          data: s.diff ? aWm(s.diff) : vir(false),
          notice: null
        });
      }).catch(s => {
        if (o) {
          return;
        }
        let i = he(s);
        let a = i.includes("Unsupported control request subtype") ? "unsupported_subtype" : Nvt(s);
        Et("remote_workspace_diff_fetch", a);
        n({
          data: vir(false),
          notice: a === "unsupported_subtype" ? "The remote workspace is running an older Claude Code version that cannot report workspace changes \u2014 showing per-turn changes only" : s instanceof Lwe ? "Timed out fetching workspace changes \u2014 showing per-turn changes only" : a === "disconnected" || a === "not_connected" ? "Lost the connection to the cloud session \u2014 showing per-turn changes only" : `Couldn't fetch workspace changes: ${i}`
        });
      });
      return () => {
        o = true;
      };
    }, [e]);
    return t;
  }
  function q4l(e) {
    let t = j4l(0, !e);
    let n = lWm(e);
    return e ? n : {
      data: t,
      notice: null
    };
  }
  var bH;
  var yqo;
  var _qo = __lazy(() => {
    wPe();
    KQt();
    ru();
    ln();
    dt();
    FP();
    Qht();
    bH = __toESM(ot(), 1);
    yqo = {
      hunks: new Map(),
      skippedLarge: new Set()
    };
  });
  function cWm(e) {
    if (!e || typeof e !== "object") {
      return false;
    }
    let t = e;
    let n = typeof t.filePath === "string";
    let r = Array.isArray(t.structuredPatch) && t.structuredPatch.length > 0;
    let o = t.type === "create" && typeof t.content === "string";
    return n && (r || o);
  }
  function uWm(e) {
    return "type" in e && (e.type === "create" || e.type === "update");
  }
  function dWm(e) {
    let t = 0;
    let n = 0;
    for (let r of e) {
      for (let o of r.lines) {
        if (o.startsWith("+")) {
          t++;
        } else if (o.startsWith("-")) {
          n++;
        }
      }
    }
    return {
      added: t,
      removed: n
    };
  }
  function pWm(e) {
    if (e.type !== "user") {
      return "";
    }
    let t = e.message.content;
    let n = typeof t === "string" ? t : "";
    if (n.length <= 30) {
      return n;
    }
    return n.slice(0, 29) + "\u2026";
  }
  function W4l(e) {
    let t = 0;
    let n = 0;
    for (let r of e.files.values()) {
      t += r.linesAdded;
      n += r.linesRemoved;
    }
    e.stats = {
      filesChanged: e.files.size,
      linesAdded: t,
      linesRemoved: n
    };
  }
  function G4l(e) {
    let t = wir.useRef({
      completedTurns: [],
      currentTurn: null,
      lastProcessedIndex: 0,
      lastTurnIndex: 0
    });
    return wir.useMemo(() => {
      let n = t.current;
      if (e.length < n.lastProcessedIndex) {
        n.completedTurns = [];
        n.currentTurn = null;
        n.lastProcessedIndex = 0;
        n.lastTurnIndex = 0;
      }
      for (let o = n.lastProcessedIndex; o < e.length; o++) {
        let s = e[o];
        if (!s || s.type !== "user") {
          continue;
        }
        if (!(s.toolUseResult || Array.isArray(s.message.content) && s.message.content[0]?.type === "tool_result") && !s.isMeta) {
          if (n.currentTurn && n.currentTurn.files.size > 0) {
            W4l(n.currentTurn);
            n.completedTurns.push(n.currentTurn);
          }
          n.lastTurnIndex++;
          n.currentTurn = {
            turnIndex: n.lastTurnIndex,
            userPromptPreview: pWm(s),
            timestamp: s.timestamp,
            files: new Map(),
            stats: {
              filesChanged: 0,
              linesAdded: 0,
              linesRemoved: 0
            }
          };
        } else if (n.currentTurn && s.toolUseResult) {
          let a = s.toolUseResult;
          if (cWm(a)) {
            let {
              filePath: l,
              structuredPatch: c
            } = a;
            let u = "type" in a && a.type === "create";
            let d = n.currentTurn.files.get(l);
            if (!d) {
              d = {
                filePath: l,
                hunks: [],
                isNewFile: u,
                linesAdded: 0,
                linesRemoved: 0
              };
              n.currentTurn.files.set(l, d);
            }
            if (u && c.length === 0 && uWm(a)) {
              let m = a.content.split(`
`);
              let f = {
                oldStart: 0,
                oldLines: 0,
                newStart: 1,
                newLines: m.length,
                lines: m.map(h => "+" + h)
              };
              d.hunks.push(f);
              d.linesAdded += m.length;
            } else {
              d.hunks.push(...c);
              let {
                added: p,
                removed: m
              } = dWm(c);
              d.linesAdded += p;
              d.linesRemoved += m;
            }
            if (u) {
              d.isNewFile = true;
            }
          }
        }
      }
      n.lastProcessedIndex = e.length;
      let r = [...n.completedTurns];
      if (n.currentTurn && n.currentTurn.files.size > 0) {
        W4l(n.currentTurn);
        r.push(n.currentTurn);
      }
      return r.reverse();
    }, [e]);
  }
  var wir;
  var V4l = __lazy(() => {
    wir = __toESM(ot(), 1);
  });
  function z4l(e) {
    if (e.wheelUp || e.wheelDown) {
      return false;
    }
    if (e.pageUp || e.pageDown) {
      return false;
    }
    if ((e.home || e.end) && e.ctrl) {
      return false;
    }
    if ((e.leftArrow || e.rightArrow || e.upArrow || e.downArrow || e.home || e.end) && (e.shift || e.meta || e.super)) {
      return false;
    }
    return true;
  }
  function mWm(e) {
    if (e.name === "pageup" || e.name === "pagedown") {
      return false;
    }
    if ((e.name === "home" || e.name === "end") && e.ctrl) {
      return false;
    }
    if ((e.name === "left" || e.name === "right" || e.name === "up" || e.name === "down" || e.name === "home" || e.name === "end") && (e.shift || e.meta || e.superKey)) {
      return false;
    }
    return true;
  }
  function K4l(e, t) {
    return n => {
      if (!e.hasSelection()) {
        return;
      }
      if (n.name === "escape") {
        e.clearSelection();
        n.consume();
        return;
      }
      if (n.ctrl && !n.shift && !n.meta && n.key === "c") {
        if (t) {
          e.clearSelection();
        } else {
          e.copySelection();
        }
        n.consume();
        return;
      }
      if (mWm(n)) {
        e.clearSelection();
      }
    };
  }
  function Cir(e) {
    let t = Y$t();
    let n = $$e(e);
    let r = n === 1 ? "char" : "chars";
    let o;
    switch (t) {
      case "native":
        o = `copied ${n} ${r} to clipboard`;
        break;
      case "tmux-buffer":
        o = `copied ${n} ${r} to tmux buffer \xB7 paste with prefix + ]`;
        break;
      case "osc52":
        o = `sent ${n} ${r} via OSC 52 \xB7 if paste fails, hold ${xMn()} while selecting for native copy`;
        break;
    }
    let s = kMn(e);
    if (s) {
      o = `\u26A0 ${s} \xB7 ${o}`;
    }
    return {
      key: "selection-copied",
      kind: "feedback",
      text: o,
      color: "suggestion",
      priority: "immediate",
      timeoutMs: s ? 6000 : t === "native" ? 2000 : 4000
    };
  }
  function Rir(e, t, n, r) {
    let o = Lvt.useRef(false);
    let s = Lvt.useRef(n);
    s.current = n;
    Lvt.useEffect(() => {
      if (!t) {
        return;
      }
      BZr();
      return e.subscribe(() => {
        let a = e.getState();
        let l = e.hasSelection();
        if (a?.isDragging) {
          if (o.current = false, r) {
            r.current = null;
          }
          return;
        }
        if (!l) {
          if (o.current = false, r) {
            r.current = null;
          }
          return;
        }
        if (o.current) {
          if (r) {
            r.current = null;
          }
          return;
        }
        if (!(getGlobalConfig().copyOnSelect ?? true)) {
          return;
        }
        let u = e.copySelectionNoClear();
        if (!u || !u.trim()) {
          o.current = true;
          return;
        }
        if (o.current = true, r) {
          r.current = u;
        }
        Pe("clipboard_write");
        s.current?.(u);
      });
    }, [t, e, r]);
  }
  function xir(e) {
    let t = useResolvedTheme();
    Lvt.useEffect(() => {
      e.setSelectionBgColor(t.selectionBg);
    }, [e, t.selectionBg]);
  }
  var Lvt;
  var bqo = __lazy(() => {
    FJ();
    Tg();
    ln();
    PP();
    Lvt = __toESM(ot(), 1);
  });
  function Sqo(e, t, n, r, o) {
    let s = useClock();
    let i = dUe.useRef(null);
    let a = dUe.useRef(0);
    let l = dUe.useRef(0);
    let c = dUe.useRef(0);
    let u = dUe.useRef(r);
    u.current = r;
    let d = o?.requireScope ?? false;
    dUe.useEffect(() => {
      if (!n) {
        return;
      }
      function p() {
        a.current = 0;
        i.current?.();
        i.current = null;
      }
      function m() {
        let y = t.getState();
        let _ = e.current;
        let b = a.current;
        if (!y?.isDragging || !y.focus || !_ || b === 0 || ++c.current > 200) {
          p();
          return;
        }
        if (_.getPendingDelta() !== 0) {
          return;
        }
        if (b < 0) {
          if (_.getScrollTop() <= 0) {
            p();
            return;
          }
          _.scrollBy(-2);
        } else {
          let S = Math.max(0, _.getScrollHeight() - _.getViewportHeight());
          if (_.getScrollTop() >= S) {
            p();
            return;
          }
          _.scrollBy(2);
        }
        u.current?.(false, _);
      }
      function f(y) {
        if (l.current = y, a.current === y) {
          return;
        }
        if (p(), a.current = y, c.current = 0, m(), a.current === y) {
          let _ = () => {
            if (m(), a.current !== 0) {
              i.current = s.setTimeout(_, 50);
            }
          };
          i.current = s.setTimeout(_, 50);
        }
      }
      function h() {
        let y = e.current;
        if (!y) {
          p();
          return;
        }
        let _ = t.getState();
        if (!Tqo(_, y) || d && !_?.scope?.node) {
          l.current = 0;
          p();
          return;
        }
        let b = y.getViewportTop();
        let S = b + y.getViewportHeight() - 1;
        if (!_?.isDragging || _.scrolledOffAbove.length === 0 && _.scrolledOffBelow.length === 0) {
          l.current = 0;
        }
        let E = hWm(_, b, S, l.current);
        if (E === 0) {
          if (l.current !== 0 && _?.focus) {
            let C = _.focus.row < b ? -1 : _.focus.row > S ? 1 : 0;
            if (C !== 0 && C !== l.current) {
              _.scrolledOffAbove = [];
              _.scrolledOffBelow = [];
              _.scrolledOffAboveSW = [];
              _.scrolledOffBelowSW = [];
              l.current = 0;
            }
          }
          p();
        } else {
          f(E);
        }
      }
      let g = t.subscribe(h);
      return () => {
        g();
        p();
        l.current = 0;
      };
    }, [s, n, d, e, t]);
  }
  function Tqo(e, t) {
    let n = e?.scope?.node;
    return !n || n === t?.getDomElement();
  }
  function hWm(e, t, n, r = 0) {
    if (!e?.isDragging || !e.anchor || !e.focus) {
      return 0;
    }
    let o = e.focus.row;
    let s = o < t ? -1 : o > n ? 1 : 0;
    if (r !== 0) {
      return s === r ? s : 0;
    }
    if (e.anchor.row < t || e.anchor.row > n) {
      return 0;
    }
    return s;
  }
  var dUe;
  var Eqo = __lazy(() => {
    et();
    dUe = __toESM(ot(), 1);
  });
  function Z4l(e) {
    let t = X4l.c(3);
    let {
      children: n
    } = e;
    let r = Fvt.useRef(null);
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        setHandler: a => {
          r.current = a;
        },
        tryDelete: a => r.current?.(a) ?? false
      };
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] !== n) {
      i = eWl.jsx(Q4l.Provider, {
        value: s,
        children: n
      });
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    return i;
  }
  function kir() {
    return Fvt.useContext(Q4l);
  }
  var X4l;
  var Fvt;
  var eWl;
  var Q4l;
  var Air = __lazy(() => {
    X4l = __toESM(pt(), 1);
    Fvt = __toESM(ot(), 1);
    eWl = __toESM(ie(), 1);
    Q4l = Fvt.createContext({
      setHandler: () => {},
      tryDelete: () => false
    });
  });
  function AWm(e, t) {
    if (t.upArrow || t.downArrow || t.home || t.end) {
      return true;
    }
    if (e.length !== 1) {
      return false;
    }
    if (t.ctrl) {
      return "udbfnp".includes(e);
    }
    return "jkgGb {}".includes(e);
  }
  function oWl(e, t, n) {
    if (z6i()) {
      let a = n - e.time;
      if (!e.jbBypass || a > 200) {
        e.jbBypass = true;
        e.frac = 0;
        e.mult = 1;
      } else if (t !== e.dir) {
        e.frac = 0;
      }
      e.dir = t;
      e.time = n;
      let l = V6i();
      if (e.accelEnabled) {
        e.mult = Math.min(4, e.mult + 0.008 + l * 0.4);
      }
      e.frac += 0.35 * e.mult;
      let c = Math.floor(e.frac);
      e.frac -= c;
      return c;
    }
    if (e.jbBypass) {
      e.jbBypass = false;
      e.pendingFlip = false;
      e.wheelMode = false;
      e.burstCount = 0;
      e.frac = 0;
      e.dir = 0;
    }
    if (!e.useDecayCurve) {
      if (e.wheelFlood) {
        let l = n - e.time;
        e.time = n;
        e.dir = t;
        e.mult = l > 40 ? e.base * 3 : e.base;
        return Math.max(1, Math.floor(e.mult));
      }
      if (e.wheelMode && n - e.time > 1500) {
        e.wheelMode = false;
        e.burstCount = 0;
        e.mult = e.base;
      }
      if (e.pendingFlip) {
        if (e.pendingFlip = false, t !== e.dir || n - e.time > 200) {
          e.dir = t;
          e.time = n;
          e.mult = e.base;
          return Math.max(1, Math.floor(e.mult));
        }
        e.wheelMode = true;
      }
      let a = n - e.time;
      if (t !== e.dir && e.dir !== 0) {
        e.pendingFlip = true;
        e.time = n;
        return 0;
      }
      if (e.dir = t, e.time = n, e.wheelMode) {
        if (a < 5) {
          if (++e.burstCount >= 5) {
            e.wheelMode = false;
            e.burstCount = 0;
            e.mult = e.base;
          } else {
            return 1;
          }
        } else {
          e.burstCount = 0;
        }
      }
      if (e.wheelMode && e.accelEnabled) {
        let l = Math.pow(0.5, a / 150);
        let c = Math.max(15 * Math.min(e.base, 1), e.base * 2);
        let u = 1 + (e.mult - 1) * l + 15 * l;
        e.mult = Math.min(c, u, e.mult + 3);
        return Math.max(1, Math.floor(e.mult));
      }
      if (a > 40 || !e.accelEnabled) {
        e.mult = e.base;
      } else {
        let l = Math.max(6 * Math.min(e.base, 1), e.base * 2);
        e.mult = Math.min(l, e.mult + 0.3);
      }
      return Math.max(1, Math.floor(e.mult));
    }
    let r = n - e.time;
    let o = t === e.dir;
    if (e.time = n, e.dir = t, o && r < 5) {
      return 1;
    }
    if (!e.accelEnabled) {
      return Math.max(1, Math.floor(e.base));
    }
    if (!o || r > 500) {
      e.mult = Math.max(2, e.base);
      e.frac = 0;
    } else {
      let a = Math.pow(0.5, r / 150);
      let l = r >= 80 ? 3 : 36;
      e.mult = Math.min(l, 1 + (e.mult - 1) * a + 7 * a);
    }
    let s = e.mult + e.frac;
    let i = Math.floor(s);
    e.frac = s - i;
    return i;
  }
  function MWm(e = false, t = 1, n = false, r = true) {
    return {
      time: 0,
      mult: t,
      dir: 0,
      useDecayCurve: e,
      frac: 0,
      base: t,
      pendingFlip: false,
      wheelMode: false,
      burstCount: 0,
      jbBypass: false,
      wheelFlood: n,
      accelEnabled: r
    };
  }
  function sWl() {
    let e = VF();
    let t = uc("wheelScrollAccelerationEnabled", true).value;
    logForDebugging(`wheel accel: ${e.useDecayCurve ? "decay" : "window (native)"} \xB7 base=${e.base} \xB7 platform=${e.platform} \xB7 TERM_PROGRAM=${e.termProgram}${e.wheelFlood ? " \xB7 wheelFlood" : ""}${e.jediTerm ? " \xB7 jediTerm" : ""}${bNn() ? " \xB7 jbBugConfirmed" : ""}${t ? "" : " \xB7 accelDisabled"}`);
    return MWm(e.useDecayCurve, e.base, e.wheelFlood, t);
  }
  function vqo({
    scrollRef: e,
    isActive: t,
    onScroll: n,
    isModal: r = false
  }) {
    let o = useSelection();
    let s = kir();
    let {
      addNotification: i
    } = Fi();
    let a = nFn();
    let l = t && !a;
    let c = pUe.useRef(null);
    let u = pUe.useRef(null);
    let d = pUe.useRef(-1);
    let p = pUe.useRef(null);
    BWm(i);
    function m(_, b = false) {
      let S = Cir(_);
      if (b && Y$t() === "native" && getGlobalConfig().copyOnSelect === undefined) {
        if (d.current === -1) {
          if (Rme("auto-copy-config-hint") >= 10) {
            Ebt("auto-copy-config-hint");
            d.current = 0;
          } else {
            d.current = 5;
          }
        }
        if (d.current < 5) {
          d.current++;
          i({
            ...S,
            text: `${S.text} \xB7 disable auto-copy in /config`,
            timeoutMs: Math.max(S.timeoutMs, 4000)
          });
          return;
        }
      }
      i(S);
    }
    function f() {
      let _ = o.copySelection();
      if (_) {
        m(_);
      }
    }
    let h = n != null;
    jo({
      "scroll:pageUp": () => {
        let _ = e.current;
        if (!_) {
          return;
        }
        if (h) {
          Wqn();
        }
        let b = -Math.max(1, Math.floor(_.getViewportHeight() / 2));
        let S = kfe(_, b, h);
        n?.(S, _);
      },
      "scroll:pageDown": () => {
        let _ = e.current;
        if (!_) {
          return;
        }
        if (h) {
          Wqn();
        }
        let b = Math.max(1, Math.floor(_.getViewportHeight() / 2));
        let S = kfe(_, b, h);
        n?.(S, _);
      },
      "scroll:lineUp": () => {
        let _ = e.current;
        if (!_ || _.getScrollHeight() <= _.getViewportHeight()) {
          return false;
        }
        if (VF() !== u.current) {
          u.current = VF();
          c.current = null;
        }
        if (h) {
          qqn();
        }
        c.current ??= sWl();
        c.current.base = VF().base;
        let b = performance.now();
        let S = oWl(c.current, -1, b);
        xno(_);
        Rno(-1, S, c.current, b);
        FWm(_, S, h);
        n?.(false, _);
      },
      "scroll:lineDown": () => {
        let _ = e.current;
        if (!_ || _.getScrollHeight() <= _.getViewportHeight()) {
          return false;
        }
        if (VF() !== u.current) {
          u.current = VF();
          c.current = null;
        }
        if (h) {
          qqn();
        }
        c.current ??= sWl();
        c.current.base = VF().base;
        let b = performance.now();
        let S = oWl(c.current, 1, b);
        xno(_);
        Rno(1, S, c.current, b);
        let E = LWm(_, S);
        n?.(E, _);
      },
      "scroll:top": () => {
        let _ = e.current;
        if (!_) {
          return;
        }
        if (h) {
          IGt();
        }
        _.scrollTo(0);
        n?.(false, _);
      },
      "scroll:bottom": () => {
        let _ = e.current;
        if (!_) {
          return;
        }
        _.scrollToBottom();
        n?.(true, _);
      },
      "selection:copy": f
    }, {
      context: "Scroll",
      isActive: l
    });
    function g(_) {
      let b = e.current;
      if (!b) {
        return;
      }
      if (h) {
        if (_ === "lineUp" || _ === "lineDown") {
          qqn();
        } else if (_ === "top") {
          IGt();
        } else if (_ !== "bottom") {
          Wqn();
        }
      }
      let S = UWm(b, _, h);
      if (S === null) {
        return;
      }
      n?.(S, b);
    }
    jo({
      "scroll:halfPageUp": () => g("halfPageUp"),
      "scroll:halfPageDown": () => g("halfPageDown"),
      "scroll:fullPageUp": () => g("fullPageUp"),
      "scroll:fullPageDown": () => g("fullPageDown")
    }, {
      context: "Scroll",
      isActive: l
    });
    jo({
      "scroll:lineUp": () => g("lineUp"),
      "scroll:lineDown": () => g("lineDown"),
      "scroll:halfPageUp": () => g("halfPageUp"),
      "scroll:halfPageDown": () => g("halfPageDown"),
      "scroll:fullPageUp": () => g("fullPageUp"),
      "scroll:fullPageDown": () => g("fullPageDown"),
      "scroll:top": () => g("top"),
      "scroll:bottom": () => g("bottom")
    }, {
      context: "Transcript",
      isActive: l && r
    });
    function y(_) {
      if (!o.hasSelection()) {
        return false;
      }
      let b = o.getState();
      if (b && EPe(b)) {
        return;
      }
      if (_ === "up" || _ === "down") {
        let S = e.current;
        if (S && Tqo(b, S) && b?.anchor && b.focus) {
          let E = S.getViewportTop();
          let C = E + S.getViewportHeight() - 1;
          let x = b.anchor.row >= E && b.anchor.row <= C;
          let A = x && _ === "up" && b.focus.row <= E;
          let k = x && _ === "down" && b.focus.row >= C;
          if (A || k) {
            let I = Math.max(0, S.getScrollHeight() - S.getViewportHeight());
            let O = A ? S.getScrollTop() > 0 : S.getScrollTop() < I;
            if (S.getPendingDelta() === 0 && O) {
              p.current = null;
              b.focus = {
                col: b.focus.col,
                row: A ? E : C
              };
              b.virtualFocusRow = A ? E - 1 : C + 1;
              b.virtualFocusCol = undefined;
              S.scrollBy(A ? -1 : 1);
              n?.(false, S);
            }
            return;
          }
        }
      }
      o.moveFocus(_);
    }
    jo({
      "selection:extendLeft": () => y("left"),
      "selection:extendRight": () => y("right"),
      "selection:extendUp": () => y("up"),
      "selection:extendDown": () => y("down"),
      "selection:extendLineStart": () => y("lineStart"),
      "selection:extendLineEnd": () => y("lineEnd")
    }, {
      context: "Scroll",
      isActive: l
    });
    cut((_, b) => {
      if (!o.hasSelection()) {
        return;
      }
      if (b.escape) {
        o.clearSelection();
        return true;
      }
      if (b.ctrl && !b.shift && !b.meta && _ === "c") {
        let S = p.current;
        if (S !== null) {
          o.clearSelection();
          m(S);
        } else {
          f();
        }
        return true;
      }
      if (r && AWm(_, b)) {
        return;
      }
      if (!r && (b.backspace || b.delete) && !b.ctrl && !b.meta && !b.shift && !b.super) {
        let S = o.getState();
        if (S && s.tryDelete(S)) {
          o.clearSelection();
          return true;
        }
      }
      if (z4l(b)) {
        o.clearSelection();
      }
    }, {
      isActive: l
    });
    Sqo(e, o, l, n);
    Rir(o, l, _ => m(_, true), p);
    xir(o);
    return null;
  }
  function cWl(e) {
    if (uc("autoScrollEnabled", true).value) {
      e.scrollToBottom();
    } else {
      e.scrollTo(Math.max(0, e.getScrollHeight() - e.getViewportHeight()));
    }
    return true;
  }
  function kfe(e, t, n = true) {
    let r = Math.max(0, e.getScrollHeight() - e.getViewportHeight());
    let o = e.getScrollTop() + e.getPendingDelta() + t;
    if (o >= r) {
      return cWl(e);
    }
    if (o <= 0 && n) {
      IGt();
    }
    e.scrollTo(Math.max(0, o));
    return false;
  }
  function LWm(e, t) {
    let n = Math.max(0, e.getScrollHeight() - e.getViewportHeight());
    if (e.getScrollTop() + e.getPendingDelta() + t >= n) {
      return cWl(e);
    }
    e.scrollBy(t);
    return false;
  }
  function FWm(e, t, n = true) {
    if (e.getScrollTop() + e.getPendingDelta() - t <= 0) {
      if (n) {
        IGt();
      }
      e.scrollTo(0);
      return;
    }
    e.scrollBy(-t);
  }
  function UWm(e, t, n = true) {
    switch (t) {
      case null:
        return null;
      case "lineUp":
      case "lineDown":
        return kfe(e, t === "lineDown" ? 1 : -1, n);
      case "halfPageUp":
      case "halfPageDown":
        {
          let r = Math.max(1, Math.floor(e.getViewportHeight() / 2));
          return kfe(e, t === "halfPageDown" ? r : -r, n);
        }
      case "fullPageUp":
      case "fullPageDown":
        {
          let r = Math.max(1, e.getViewportHeight());
          return kfe(e, t === "fullPageDown" ? r : -r, n);
        }
      case "top":
        e.scrollTo(0);
        return false;
      case "bottom":
        e.scrollToBottom();
        return true;
    }
  }
  function BWm(e) {
    let t = lWl.c(5);
    let {
      internal_eventEmitter: n
    } = F5d();
    let r = useClock();
    let o = pUe.useRef(false);
    let s;
    let i;
    if (t[0] !== e || t[1] !== r || t[2] !== n) {
      s = () => {
        let a = function (u) {
          if (!o.current) {
            o.current = true;
            logEvent("tengu_scroll_arrows_detected", {
              count: u.count,
              up: u.direction === "up"
            });
          }
          r.setTimeout(() => e({
            key: "scroll-as-arrows",
            kind: "contextual",
            priority: "immediate",
            text: "Scroll wheel is sending arrow keys \xB7 use PgUp/PgDn to scroll",
            color: "warning",
            timeoutMs: 12000
          }), 200);
        };
        let l = function () {
          logEvent("tengu_jediterm_scroll_bug_detected", {});
          e({
            key: "jediterm-scroll-bug",
            kind: "contextual",
            priority: "immediate",
            text: "Scroll support in JetBrains IDE 2025.2 terminals is experimental \xB7 upgrade to 2025.3+ for the best experience",
            color: "suggestion",
            timeoutMs: 15000
          });
        };
        n.on("arrow-burst", a);
        n.on("jediterm-scroll-bug", l);
        return () => {
          n.off("arrow-burst", a);
          n.off("jediterm-scroll-bug", l);
        };
      };
      i = [n, e, r];
      t[0] = e;
      t[1] = r;
      t[2] = n;
      t[3] = s;
      t[4] = i;
    } else {
      s = t[3];
      i = t[4];
    }
    pUe.useEffect(s, i);
  }
  var lWl;
  var pUe;
  var wqo = __lazy(() => {
    Nd();
    px();
    bqo();
    JWe();
    SNn();
    jWe();
    pPe();
    UHt();
    Tg();
    et();
    Bs();
    Ot();
    vbt();
    je();
    PGt();
    zg();
    Eqo();
    Air();
    lWl = __toESM(pt(), 1);
    pUe = __toESM(ot(), 1);
  });
  function lie(e) {
    let t = uWl.c(2);
    let {
      children: n,
      when: r
    } = e;
    if (!(r === undefined ? true : r)) {
      return null;
    }
    let s;
    if (t[0] !== n) {
      s = dWl.jsxs(Text, {
        dimColor: true,
        children: [" (", n, ")"]
      });
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    return s;
  }
  var uWl;
  var dWl;
  var Uvt = __lazy(() => {
    et();
    uWl = __toESM(pt(), 1);
    dWl = __toESM(ie(), 1);
  });
  function Cqo(e) {
    let t = pWl.c(72);
    let {
      filePath: n,
      hunks: r,
      isLargeFile: o,
      isBinary: s,
      isTruncated: i,
      isUntracked: a,
      isRestricted: l,
      width: c
    } = e;
    let {
      columns: u
    } = Sr();
    let d = c ?? u - 4;
    let p;
    if (t[0] !== n || t[1] !== s || t[2] !== o || t[3] !== l || t[4] !== a) {
      e: {
        if (!n || s || o || a || l || va()) {
          let k;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            k = {
              firstLine: null,
              fileContent: undefined
            };
            t[6] = k;
          } else {
            k = t[6];
          }
          p = k;
          break e;
        }
        let A;
        try {
          A = pnt(mWl.resolve(Nt(), n), {
            maxBytes: 1e6
          });
        } catch {
          let k;
          if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
            k = {
              firstLine: null,
              fileContent: undefined
            };
            t[7] = k;
          } else {
            k = t[7];
          }
          p = k;
          break e;
        }
        p = {
          firstLine: Ad(A),
          fileContent: A
        };
      }
      t[0] = n;
      t[1] = s;
      t[2] = o;
      t[3] = l;
      t[4] = a;
      t[5] = p;
    } else {
      p = t[5];
    }
    let {
      firstLine: m,
      fileContent: f
    } = p;
    if (l) {
      let A;
      if (t[8] !== n) {
        A = og.jsx(gXd, {
          children: og.jsx(Text, {
            bold: true,
            children: n
          })
        });
        t[8] = n;
        t[9] = A;
      } else {
        A = t[9];
      }
      let k;
      if (t[10] !== d) {
        k = og.jsx(mS, {
          width: d
        });
        t[10] = d;
        t[11] = k;
      } else {
        k = t[11];
      }
      let I;
      if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
        I = og.jsx(gXd, {
          flexDirection: "column",
          children: og.jsx(Text, {
            dimColor: true,
            italic: true,
            children: "Content restricted by read-permission rules"
          })
        });
        t[12] = I;
      } else {
        I = t[12];
      }
      let O;
      if (t[13] !== A || t[14] !== k) {
        O = og.jsxs(gXd, {
          flexDirection: "column",
          width: "100%",
          children: [A, k, I]
        });
        t[13] = A;
        t[14] = k;
        t[15] = O;
      } else {
        O = t[15];
      }
      return O;
    }
    if (a) {
      let A;
      if (t[16] !== n) {
        A = og.jsx(Text, {
          bold: true,
          children: n
        });
        t[16] = n;
        t[17] = A;
      } else {
        A = t[17];
      }
      let k;
      if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
        k = og.jsx(lie, {
          children: "untracked"
        });
        t[18] = k;
      } else {
        k = t[18];
      }
      let I;
      if (t[19] !== A) {
        I = og.jsxs(gXd, {
          children: [A, k]
        });
        t[19] = A;
        t[20] = I;
      } else {
        I = t[20];
      }
      let O;
      if (t[21] !== d) {
        O = og.jsx(mS, {
          width: d
        });
        t[21] = d;
        t[22] = O;
      } else {
        O = t[22];
      }
      let M;
      if (t[23] === Symbol.for("react.memo_cache_sentinel")) {
        M = og.jsx(Text, {
          dimColor: true,
          italic: true,
          children: "New file not yet staged."
        });
        t[23] = M;
      } else {
        M = t[23];
      }
      let L;
      if (t[24] !== n) {
        L = !va() && og.jsxs(Text, {
          dimColor: true,
          italic: true,
          children: ["Run `git add :/", n, "` to see line counts."]
        });
        t[24] = n;
        t[25] = L;
      } else {
        L = t[25];
      }
      let P;
      if (t[26] !== L) {
        P = og.jsxs(gXd, {
          flexDirection: "column",
          children: [M, L]
        });
        t[26] = L;
        t[27] = P;
      } else {
        P = t[27];
      }
      let F;
      if (t[28] !== I || t[29] !== O || t[30] !== P) {
        F = og.jsxs(gXd, {
          flexDirection: "column",
          width: "100%",
          children: [I, O, P]
        });
        t[28] = I;
        t[29] = O;
        t[30] = P;
        t[31] = F;
      } else {
        F = t[31];
      }
      return F;
    }
    if (s) {
      let A;
      if (t[32] !== n) {
        A = og.jsx(gXd, {
          children: og.jsx(Text, {
            bold: true,
            children: n
          })
        });
        t[32] = n;
        t[33] = A;
      } else {
        A = t[33];
      }
      let k;
      if (t[34] !== d) {
        k = og.jsx(mS, {
          width: d
        });
        t[34] = d;
        t[35] = k;
      } else {
        k = t[35];
      }
      let I;
      if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
        I = og.jsx(gXd, {
          flexDirection: "column",
          children: og.jsx(Text, {
            dimColor: true,
            italic: true,
            children: "Binary file - cannot display diff"
          })
        });
        t[36] = I;
      } else {
        I = t[36];
      }
      let O;
      if (t[37] !== A || t[38] !== k) {
        O = og.jsxs(gXd, {
          flexDirection: "column",
          width: "100%",
          children: [A, k, I]
        });
        t[37] = A;
        t[38] = k;
        t[39] = O;
      } else {
        O = t[39];
      }
      return O;
    }
    if (o) {
      let A;
      if (t[40] !== n) {
        A = og.jsx(gXd, {
          children: og.jsx(Text, {
            bold: true,
            children: n
          })
        });
        t[40] = n;
        t[41] = A;
      } else {
        A = t[41];
      }
      let k;
      if (t[42] !== d) {
        k = og.jsx(mS, {
          width: d
        });
        t[42] = d;
        t[43] = k;
      } else {
        k = t[43];
      }
      let I;
      if (t[44] === Symbol.for("react.memo_cache_sentinel")) {
        I = og.jsx(gXd, {
          flexDirection: "column",
          children: og.jsx(Text, {
            dimColor: true,
            italic: true,
            children: va() ? "Diff too large to display." : "Large file - diff exceeds 1 MB limit"
          })
        });
        t[44] = I;
      } else {
        I = t[44];
      }
      let O;
      if (t[45] !== A || t[46] !== k) {
        O = og.jsxs(gXd, {
          flexDirection: "column",
          width: "100%",
          children: [A, k, I]
        });
        t[45] = A;
        t[46] = k;
        t[47] = O;
      } else {
        O = t[47];
      }
      return O;
    }
    let h;
    if (t[48] !== n) {
      h = og.jsx(Text, {
        bold: true,
        children: n
      });
      t[48] = n;
      t[49] = h;
    } else {
      h = t[49];
    }
    let g = i ?? false;
    let y;
    if (t[50] !== g) {
      y = og.jsx(lie, {
        when: g,
        children: "truncated"
      });
      t[50] = g;
      t[51] = y;
    } else {
      y = t[51];
    }
    let _;
    if (t[52] !== h || t[53] !== y) {
      _ = og.jsxs(gXd, {
        children: [h, y]
      });
      t[52] = h;
      t[53] = y;
      t[54] = _;
    } else {
      _ = t[54];
    }
    let b;
    if (t[55] !== d) {
      b = og.jsx(mS, {
        width: d
      });
      t[55] = d;
      t[56] = b;
    } else {
      b = t[56];
    }
    let S;
    if (t[57] !== d || t[58] !== f || t[59] !== n || t[60] !== m || t[61] !== r) {
      S = r.length === 0 ? og.jsx(sc, {
        children: "No diff content"
      }) : r.map((A, k) => og.jsx(Xde, {
        patch: A,
        filePath: n,
        firstLine: m,
        fileContent: f,
        dim: false,
        width: d
      }, k));
      t[57] = d;
      t[58] = f;
      t[59] = n;
      t[60] = m;
      t[61] = r;
      t[62] = S;
    } else {
      S = t[62];
    }
    let E;
    if (t[63] !== S) {
      E = og.jsx(gXd, {
        flexDirection: "column",
        children: S
      });
      t[63] = S;
      t[64] = E;
    } else {
      E = t[64];
    }
    let C;
    if (t[65] !== i) {
      C = i && og.jsx(Text, {
        dimColor: true,
        italic: true,
        children: "\u2026 diff truncated (exceeded 400 line limit)"
      });
      t[65] = i;
      t[66] = C;
    } else {
      C = t[66];
    }
    let x;
    if (t[67] !== _ || t[68] !== b || t[69] !== E || t[70] !== C) {
      x = og.jsxs(gXd, {
        flexDirection: "column",
        width: "100%",
        children: [_, b, E, C]
      });
      t[67] = _;
      t[68] = b;
      t[69] = E;
      t[70] = C;
      t[71] = x;
    } else {
      x = t[71];
    }
    return x;
  }
  var pWl;
  var mWl;
  var og;
  var Rqo = __lazy(() => {
    ki();
    et();
    ru();
    vo();
    Zl();
    Zn();
    Uvt();
    oX();
    xb();
    Amt();
    pWl = __toESM(pt(), 1);
    mWl = require("path");
    og = __toESM(ie(), 1);
  });
  function fWl(e) {
    let t = Iir.c(36);
    let {
      files: n,
      selectedIndex: r
    } = e;
    let {
      columns: o
    } = Sr();
    let s;
    e: {
      if (n.length === 0 || n.length <= 5) {
        let b;
        if (t[0] !== n.length) {
          b = {
            startIndex: 0,
            endIndex: n.length
          };
          t[0] = n.length;
          t[1] = b;
        } else {
          b = t[1];
        }
        s = b;
        break e;
      }
      let g = Math.max(0, r - Math.floor(5 / 2));
      let y = g + 5;
      if (y > n.length) {
        y = n.length;
        g = Math.max(0, y - 5);
      }
      let _;
      if (t[2] !== y || t[3] !== g) {
        _ = {
          startIndex: g,
          endIndex: y
        };
        t[2] = y;
        t[3] = g;
        t[4] = _;
      } else {
        _ = t[4];
      }
      s = _;
    }
    let {
      startIndex: i,
      endIndex: a
    } = s;
    if (n.length === 0) {
      let g;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        g = rB.jsx(sc, {
          children: "No changed files"
        });
        t[5] = g;
      } else {
        g = t[5];
      }
      return g;
    }
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    if (t[6] !== o || t[7] !== a || t[8] !== n || t[9] !== r || t[10] !== i) {
      let g = n.slice(i, a);
      let y = i > 0;
      c = a < n.length;
      u = n.length > 5;
      let _ = Math.max(20, o - 16 - 3 - 4);
      if (l = gXd, d = "column", t[17] !== y || t[18] !== u || t[19] !== i) {
        p = u && rB.jsx(Text, {
          dimColor: true,
          children: y ? ` \u2191 ${i} more ${un(i, "file")}` : " "
        });
        t[17] = y;
        t[18] = u;
        t[19] = i;
        t[20] = p;
      } else {
        p = t[20];
      }
      let b;
      if (t[21] !== _ || t[22] !== r || t[23] !== i) {
        b = (S, E) => rB.jsx(HWm, {
          file: S,
          isSelected: i + E === r,
          maxPathWidth: _
        }, S.path);
        t[21] = _;
        t[22] = r;
        t[23] = i;
        t[24] = b;
      } else {
        b = t[24];
      }
      m = g.map(b);
      t[6] = o;
      t[7] = a;
      t[8] = n;
      t[9] = r;
      t[10] = i;
      t[11] = l;
      t[12] = c;
      t[13] = u;
      t[14] = d;
      t[15] = p;
      t[16] = m;
    } else {
      l = t[11];
      c = t[12];
      u = t[13];
      d = t[14];
      p = t[15];
      m = t[16];
    }
    let f;
    if (t[25] !== a || t[26] !== n.length || t[27] !== c || t[28] !== u) {
      f = u && rB.jsx(Text, {
        dimColor: true,
        children: c ? ` \u2193 ${n.length - a} more ${un(n.length - a, "file")}` : " "
      });
      t[25] = a;
      t[26] = n.length;
      t[27] = c;
      t[28] = u;
      t[29] = f;
    } else {
      f = t[29];
    }
    let h;
    if (t[30] !== l || t[31] !== d || t[32] !== p || t[33] !== m || t[34] !== f) {
      h = rB.jsxs(l, {
        flexDirection: d,
        children: [p, m, f]
      });
      t[30] = l;
      t[31] = d;
      t[32] = p;
      t[33] = m;
      t[34] = f;
      t[35] = h;
    } else {
      h = t[35];
    }
    return h;
  }
  function HWm(e) {
    let t = Iir.c(14);
    let {
      file: n,
      isSelected: r,
      maxPathWidth: o
    } = e;
    let s;
    if (t[0] !== n.path || t[1] !== o) {
      s = truncateStartToWidth(n.path, o);
      t[0] = n.path;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let l = `${r ? vGd.pointer + " " : "  "}${i}`;
    let c = r ? "background" : undefined;
    let u;
    if (t[3] !== r || t[4] !== l || t[5] !== c) {
      u = rB.jsx(Text, {
        bold: r,
        color: c,
        inverse: r,
        children: l
      });
      t[3] = r;
      t[4] = l;
      t[5] = c;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      d = rB.jsx(gXd, {
        flexGrow: 1
      });
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== n || t[9] !== r) {
      p = rB.jsx(jWm, {
        file: n,
        isSelected: r
      });
      t[8] = n;
      t[9] = r;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== u || t[12] !== p) {
      m = rB.jsxs(gXd, {
        flexDirection: "row",
        children: [u, d, p]
      });
      t[11] = u;
      t[12] = p;
      t[13] = m;
    } else {
      m = t[13];
    }
    return m;
  }
  function jWm(e) {
    let t = Iir.c(16);
    let {
      file: n,
      isSelected: r
    } = e;
    if (n.isUntracked) {
      let a = !r;
      let l;
      if (t[0] !== a) {
        l = rB.jsx(Text, {
          dimColor: a,
          italic: true,
          children: "untracked"
        });
        t[0] = a;
        t[1] = l;
      } else {
        l = t[1];
      }
      return l;
    }
    if (n.isBinary) {
      let a = !r;
      let l;
      if (t[2] !== a) {
        l = rB.jsx(Text, {
          dimColor: a,
          italic: true,
          children: "Binary file"
        });
        t[2] = a;
        t[3] = l;
      } else {
        l = t[3];
      }
      return l;
    }
    if (n.isLargeFile) {
      let a = !r;
      let l;
      if (t[4] !== a) {
        l = rB.jsx(Text, {
          dimColor: a,
          italic: true,
          children: "Large file modified"
        });
        t[4] = a;
        t[5] = l;
      } else {
        l = t[5];
      }
      return l;
    }
    let o;
    if (t[6] !== n.linesAdded || t[7] !== n.linesRemoved || t[8] !== r) {
      o = rB.jsx(d9, {
        added: n.linesAdded,
        removed: n.linesRemoved,
        bold: r
      });
      t[6] = n.linesAdded;
      t[7] = n.linesRemoved;
      t[8] = r;
      t[9] = o;
    } else {
      o = t[9];
    }
    let s;
    if (t[10] !== n.isTruncated || t[11] !== r) {
      s = n.isTruncated && rB.jsx(Text, {
        dimColor: !r,
        children: " (truncated)"
      });
      t[10] = n.isTruncated;
      t[11] = r;
      t[12] = s;
    } else {
      s = t[12];
    }
    let i;
    if (t[13] !== o || t[14] !== s) {
      i = rB.jsxs(Text, {
        children: [o, s]
      });
      t[13] = o;
      t[14] = s;
      t[15] = i;
    } else {
      i = t[15];
    }
    return i;
  }
  var Iir;
  var rB;
  var hWl = __lazy(() => {
    ki();
    et();
    cs();
    Zn();
    pNe();
    xb();
    Iir = __toESM(pt(), 1);
    rB = __toESM(ie(), 1);
  });
  var yWl = {};
  __export(yWl, {
    DiffDialog: () => DiffDialog
  });
  function qWm(e) {
    let t = Array.from(e.files.values()).map(r => ({
      path: r.filePath,
      linesAdded: r.linesAdded,
      linesRemoved: r.linesRemoved,
      isBinary: false,
      isLargeFile: false,
      isTruncated: false,
      isNewFile: r.isNewFile
    })).sort((r, o) => r.path.localeCompare(o.path));
    let n = new Map();
    for (let r of e.files.values()) {
      n.set(r.filePath, r.hunks);
    }
    return {
      stats: {
        filesCount: e.stats.filesChanged,
        linesAdded: e.stats.linesAdded,
        linesRemoved: e.stats.linesRemoved
      },
      files: t,
      hunks: n,
      loading: false,
      source: {
        kind: "working-tree"
      }
    };
  }
  function DiffDialog(e) {
    let t = gWl.c(100);
    let {
      messages: n,
      onDone: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = va();
      t[0] = o;
    } else {
      o = t[0];
    }
    let {
      data: s,
      notice: i
    } = q4l(o);
    let a = G4l(n);
    let [l, c] = Fwe.useState("list");
    let [u, d] = Fwe.useState(0);
    let [p, m] = Fwe.useState(0);
    let f;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      f = {
        type: "current"
      };
      t[1] = f;
    } else {
      f = t[1];
    }
    let h;
    if (t[2] !== a) {
      h = [f, ...a.map(VWm)];
      t[2] = a;
      t[3] = h;
    } else {
      h = t[3];
    }
    let g = h;
    let y = g[p];
    let _ = y?.type === "turn" ? y.turn : null;
    let b;
    if (t[4] !== _ || t[5] !== s) {
      b = _ ? qWm(_) : s;
      t[4] = _;
      t[5] = s;
      t[6] = b;
    } else {
      b = t[6];
    }
    let S = b;
    let E = S.files[u];
    let C;
    if (t[7] !== S.hunks || t[8] !== E) {
      C = E ? S.hunks.get(E.path) || [] : [];
      t[7] = S.hunks;
      t[8] = E;
      t[9] = C;
    } else {
      C = t[9];
    }
    let x = C;
    let A;
    let k;
    if (t[10] !== p || t[11] !== g.length) {
      A = () => {
        if (p >= g.length) {
          m(Math.max(0, g.length - 1));
        }
      };
      k = [g.length, p];
      t[10] = p;
      t[11] = g.length;
      t[12] = A;
      t[13] = k;
    } else {
      A = t[12];
      k = t[13];
    }
    Fwe.useEffect(A, k);
    let I = Fwe.useRef(p);
    let O;
    let M;
    if (t[14] !== p) {
      O = () => {
        if (I.current !== p) {
          d(0);
          I.current = p;
        }
      };
      M = [p];
      t[14] = p;
      t[15] = O;
      t[16] = M;
    } else {
      O = t[15];
      M = t[16];
    }
    Fwe.useEffect(O, M);
    Jg("diff-dialog");
    let L = uut();
    let P;
    if (t[17] !== L || t[18] !== l) {
      P = function (Ye) {
        let ht = L?.current;
        if (l !== "detail" || !ht) {
          return false;
        }
        let It = Math.max(1, Math.floor(ht.getViewportHeight() / 2));
        let Rt = Math.max(1, ht.getViewportHeight());
        e: switch (Ye) {
          case "up":
            {
              ht.scrollBy(-1);
              break e;
            }
          case "down":
            {
              ht.scrollBy(1);
              break e;
            }
          case "pageUp":
            {
              kfe(ht, -It, false);
              break e;
            }
          case "pageDown":
            {
              kfe(ht, It, false);
              break e;
            }
          case "fullPageUp":
            {
              kfe(ht, -Rt, false);
              break e;
            }
          case "fullPageDown":
            {
              kfe(ht, Rt, false);
              break e;
            }
          case "top":
            {
              ht.scrollTo(0);
              break e;
            }
          case "bottom":
            ht.scrollToBottom();
        }
      };
      t[17] = L;
      t[18] = l;
      t[19] = P;
    } else {
      P = t[19];
    }
    let F = P;
    let H;
    let U;
    if (t[20] !== g.length || t[21] !== l) {
      H = () => {
        if (l === "detail") {
          c("list");
        } else if (g.length > 1) {
          m(kt => (kt - 1 + g.length) % g.length);
        }
      };
      U = () => {
        if (l === "list" && g.length > 1) {
          m(kt => (kt + 1) % g.length);
        }
      };
      t[20] = g.length;
      t[21] = l;
      t[22] = H;
      t[23] = U;
    } else {
      H = t[22];
      U = t[23];
    }
    let N;
    if (t[24] !== l) {
      N = () => {
        if (l === "detail") {
          c("list");
        }
      };
      t[24] = l;
      t[25] = N;
    } else {
      N = t[25];
    }
    let W;
    if (t[26] !== E || t[27] !== l) {
      W = () => {
        if (l === "list" && E) {
          c("detail");
        }
      };
      t[26] = E;
      t[27] = l;
      t[28] = W;
    } else {
      W = t[28];
    }
    let j;
    if (t[29] !== F || t[30] !== l) {
      j = () => {
        if (l === "detail") {
          return F("up");
        }
        d(GWm);
      };
      t[29] = F;
      t[30] = l;
      t[31] = j;
    } else {
      j = t[31];
    }
    let z;
    if (t[32] !== S.files.length || t[33] !== F || t[34] !== l) {
      z = () => {
        if (l === "detail") {
          return F("down");
        }
        d(kt => Math.min(S.files.length - 1, kt + 1));
      };
      t[32] = S.files.length;
      t[33] = F;
      t[34] = l;
      t[35] = z;
    } else {
      z = t[35];
    }
    let V;
    let K;
    let J;
    let Q;
    let Z;
    let ne;
    if (t[36] !== F) {
      V = () => F("pageUp");
      K = () => F("pageDown");
      J = () => F("fullPageUp");
      Q = () => F("fullPageDown");
      Z = () => F("top");
      ne = () => F("bottom");
      t[36] = F;
      t[37] = V;
      t[38] = K;
      t[39] = J;
      t[40] = Q;
      t[41] = Z;
      t[42] = ne;
    } else {
      V = t[37];
      K = t[38];
      J = t[39];
      Q = t[40];
      Z = t[41];
      ne = t[42];
    }
    let oe;
    if (t[43] !== H || t[44] !== U || t[45] !== N || t[46] !== W || t[47] !== j || t[48] !== z || t[49] !== V || t[50] !== K || t[51] !== J || t[52] !== Q || t[53] !== Z || t[54] !== ne) {
      oe = {
        "diff:previousSource": H,
        "diff:nextSource": U,
        "diff:back": N,
        "diff:viewDetails": W,
        "diff:previousFile": j,
        "diff:nextFile": z,
        "scroll:pageUp": V,
        "scroll:pageDown": K,
        "scroll:fullPageUp": J,
        "scroll:fullPageDown": Q,
        "scroll:top": Z,
        "scroll:bottom": ne
      };
      t[43] = H;
      t[44] = U;
      t[45] = N;
      t[46] = W;
      t[47] = j;
      t[48] = z;
      t[49] = V;
      t[50] = K;
      t[51] = J;
      t[52] = Q;
      t[53] = Z;
      t[54] = ne;
      t[55] = oe;
    } else {
      oe = t[55];
    }
    let ee;
    if (t[56] === Symbol.for("react.memo_cache_sentinel")) {
      ee = {
        context: "DiffDialog"
      };
      t[56] = ee;
    } else {
      ee = t[56];
    }
    jo(oe, ee);
    let re;
    if (t[57] !== S.stats) {
      re = S.stats ? yR.jsxs(Text, {
        dimColor: true,
        children: [S.stats.filesCount, " ", un(S.stats.filesCount, "file"), " ", "changed", " ", yR.jsx(d9, {
          added: S.stats.linesAdded,
          removed: S.stats.linesRemoved
        })]
      }) : null;
      t[57] = S.stats;
      t[58] = re;
    } else {
      re = t[58];
    }
    let se = re;
    let ae = !_ && S.source.kind === "branch";
    let de = _ ? `Turn ${_.turnIndex}` : ae ? "Branch changes" : "Uncommitted changes";
    let be = _ ? _.userPromptPreview ? `"${_.userPromptPreview}"` : "" : S.source.kind === "branch" ? `(vs ${S.source.baseBranch})` : "(git diff HEAD)";
    let fe;
    e: {
      if (_) {
        fe = "No file changes in this turn";
        break e;
      }
      if (i) {
        fe = i;
        break e;
      }
      if (S.stats && S.stats.filesCount > 0 && S.files.length === 0) {
        fe = "Too many files to display details";
        break e;
      }
      fe = "No changes yet";
    }
    let me = fe;
    let Te;
    if (t[59] !== be) {
      Te = be && yR.jsxs(Text, {
        dimColor: true,
        children: [" ", be]
      });
      t[59] = be;
      t[60] = Te;
    } else {
      Te = t[60];
    }
    let ue;
    if (t[61] !== de || t[62] !== Te) {
      ue = yR.jsxs(Text, {
        children: [de, Te]
      });
      t[61] = de;
      t[62] = Te;
      t[63] = ue;
    } else {
      ue = t[63];
    }
    let ce = ue;
    let le;
    if (t[64] !== r || t[65] !== l) {
      le = function () {
        if (l === "detail") {
          c("list");
        } else {
          r("Diff dialog dismissed", {
            display: "system"
          });
        }
      };
      t[64] = r;
      t[65] = l;
      t[66] = le;
    } else {
      le = t[66];
    }
    let pe = le;
    let ve;
    if (t[67] !== S.files || t[68] !== S.loading || t[69] !== me || t[70] !== E?.isBinary || t[71] !== E?.isLargeFile || t[72] !== E?.isRestricted || t[73] !== E?.isTruncated || t[74] !== E?.isUntracked || t[75] !== E?.path || t[76] !== x || t[77] !== u || t[78] !== l) {
      ve = S.files.length === 0 ? S.loading ? yR.jsx(Xc, {
        message: "Loading diff\u2026",
        dimColor: true
      }) : yR.jsx(Text, {
        dimColor: true,
        children: me
      }) : l === "list" ? yR.jsx(gXd, {
        flexDirection: "column",
        children: yR.jsx(fWl, {
          files: S.files,
          selectedIndex: u
        })
      }) : yR.jsx(gXd, {
        flexDirection: "column",
        children: yR.jsx(Cqo, {
          filePath: E?.path || "",
          hunks: x,
          isLargeFile: E?.isLargeFile,
          isBinary: E?.isBinary,
          isTruncated: E?.isTruncated,
          isUntracked: E?.isUntracked,
          isRestricted: E?.isRestricted
        })
      });
      t[67] = S.files;
      t[68] = S.loading;
      t[69] = me;
      t[70] = E?.isBinary;
      t[71] = E?.isLargeFile;
      t[72] = E?.isRestricted;
      t[73] = E?.isTruncated;
      t[74] = E?.isUntracked;
      t[75] = E?.path;
      t[76] = x;
      t[77] = u;
      t[78] = l;
      t[79] = ve;
    } else {
      ve = t[79];
    }
    let _e;
    if (t[80] !== se || t[81] !== ve) {
      _e = yR.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [se, ve]
      });
      t[80] = se;
      t[81] = ve;
      t[82] = _e;
    } else {
      _e = t[82];
    }
    let xe = _e;
    let ke;
    if (t[83] !== g.length || t[84] !== l) {
      ke = l === "list" ? yR.jsxs(Hn, {
        children: [g.length > 1 && yR.jsx(xt, {
          chord: ["left", "right"],
          action: "switch source"
        }), yR.jsx(xt, {
          chord: ["up", "down"],
          action: "select"
        }), yR.jsx(xt, {
          chord: "enter",
          action: "view"
        }), yR.jsx(Wr, {
          action: "diff:dismiss",
          context: "DiffDialog",
          fallback: "Esc",
          description: "close"
        })]
      }) : yR.jsxs(Hn, {
        children: [yR.jsx(xt, {
          chord: ["up", "down"],
          action: "scroll"
        }), yR.jsx(xt, {
          chord: "left",
          action: "back"
        }), yR.jsx(Wr, {
          action: "diff:dismiss",
          context: "DiffDialog",
          fallback: "Esc",
          description: "back"
        })]
      });
      t[83] = g.length;
      t[84] = l;
      t[85] = ke;
    } else {
      ke = t[85];
    }
    let Ie = g.length <= 1;
    let Ue = String(p);
    let Ge;
    if (t[86] === Symbol.for("react.memo_cache_sentinel")) {
      Ge = kt => m(Number(kt));
      t[86] = Ge;
    } else {
      Ge = t[86];
    }
    let Be = l === "detail";
    let We;
    if (t[87] !== xe || t[88] !== g) {
      We = g.map((kt, Ye) => yR.jsx(kh, {
        id: String(Ye),
        title: kt.type === "current" ? "Current" : `T${kt.turn.turnIndex}`,
        children: xe
      }, Ye));
      t[87] = xe;
      t[88] = g;
      t[89] = We;
    } else {
      We = t[89];
    }
    let Ze;
    if (t[90] !== Ie || t[91] !== Ue || t[92] !== Be || t[93] !== We) {
      Ze = yR.jsx(VM, {
        title: null,
        hidden: Ie,
        selectedTab: Ue,
        onTabChange: Ge,
        disableNavigation: Be,
        children: We
      });
      t[90] = Ie;
      t[91] = Ue;
      t[92] = Be;
      t[93] = We;
      t[94] = Ze;
    } else {
      Ze = t[94];
    }
    let Tt;
    if (t[95] !== pe || t[96] !== ke || t[97] !== Ze || t[98] !== ce) {
      Tt = yR.jsx(or, {
        title: ce,
        onCancel: pe,
        color: "background",
        inputGuide: ke,
        children: Ze
      });
      t[95] = pe;
      t[96] = ke;
      t[97] = Ze;
      t[98] = ce;
      t[99] = Tt;
    } else {
      Tt = t[99];
    }
    return Tt;
  }
  function GWm(e) {
    return Math.max(0, e - 1);
  }
  function VWm(e) {
    return {
      type: "turn",
      turn: e
    };
  }
  var gWl;
  var Fwe;
  var yR;
  var _Wl = __lazy(() => {
    rE();
    px();
    _qo();
    V4l();
    et();
    Bs();
    ru();
    Zn();
    Sd();
    Ai();
    Ii();
    pNe();
    bs();
    Pv();
    yH();
    wqo();
    Rqo();
    hWl();
    gWl = __toESM(pt(), 1);
    Fwe = __toESM(ot(), 1);
    yR = __toESM(ie(), 1);
  });
  var SWl = {};
  __export(SWl, {
    call: () => call_export25
  });
  var zWm;
  var bWl;
  var TWl;
  var call_export25 = async (e, t) => {
    va();
    let {
      DiffDialog: n
    } = await Promise.resolve().then(() => (_Wl(), yWl));
    return TWl.jsx(n, {
      messages: t.messages,
      onDone: e
    });
  };
  var EWl = __lazy(() => {
    ru();
    ho();
    zp();
    zWm = __toESM(pt(), 1);
    bWl = __toESM(ot(), 1);
    TWl = __toESM(ie(), 1);
  });
  var xqo;
  var vWl = __lazy(() => {
    ru();
    zp();
    xqo = {
      type: "local-jsx",
      name: "diff",
      description: "View uncommitted changes and per-turn diffs",
      immediate: () => {
        if (va()) {
          return false;
        }
        return false;
      },
      thinClientDispatch: "control-request",
      load: () => Promise.resolve().then(() => (EWl(), SWl))
    };
  });
  function Bx(e) {
    let t = wWl.c(10);
    let {
      title: n,
      status: r,
      detail: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = Bvt.jsx(Text, {
        bold: true,
        children: n
      });
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== r) {
      i = Bvt.jsx(Ps, {
        status: r
      });
      t[2] = r;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== o) {
      a = o ? Bvt.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", o]
      }) : null;
      t[4] = o;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== s || t[7] !== i || t[8] !== a) {
      l = Bvt.jsxs(Text, {
        children: [s, " ", i, a]
      });
      t[6] = s;
      t[7] = i;
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    return l;
  }
  var wWl;
  var Bvt;
  var $vt = __lazy(() => {
    et();
    Vf();
    wWl = __toESM(pt(), 1);
    Bvt = __toESM(ie(), 1);
  });
  function RWl() {
    let e = CWl.c(1);
    if (!oV()) {
      return null;
    }
    let t = pq.warnings;
    if (t.length === 0) {
      return null;
    }
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      let r = [...t].sort(XWm);
      let o = r[0]?.severity === "error";
      n = mUe.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [mUe.jsx(Bx, {
          title: "Keybinding configuration issues",
          status: o ? "error" : "warning",
          detail: pSe()
        }), mUe.jsx(ms, {
          variant: "tree",
          children: r.map(JWm)
        })]
      });
      e[0] = n;
    } else {
      n = e[0];
    }
    return n;
  }
  function JWm(e, t) {
    return mUe.jsxs(ms.Group, {
      children: [mUe.jsx(ms.Node, {
        color: e.severity === "error" ? "error" : "warning",
        children: e.message
      }), e.suggestion && mUe.jsx(ms.Node, {
        dimColor: true,
        children: e.suggestion
      })]
    }, t);
  }
  function XWm(e, t) {
    return e.severity === t.severity ? 0 : e.severity === "error" ? -1 : 1;
  }
  var CWl;
  var mUe;
  var xWl = __lazy(() => {
    et();
    xre();
    $vt();
    Pse();
    CWl = __toESM(pt(), 1);
    mUe = __toESM(ie(), 1);
  });
  function QWm(e) {
    let t = kqo.c(38);
    let {
      scope: n,
      parsingErrors: r,
      warnings: o
    } = e;
    let s = r.length > 0;
    let i = o.length > 0;
    if (!s && !i) {
      return null;
    }
    let a;
    if (t[0] !== n) {
      a = D$(n);
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c;
    if (t[2] !== r || t[3] !== o) {
      c = new Set([...r, ...o].map(ZWm).filter(Boolean));
      t[2] = r;
      t[3] = o;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u = c;
    let d;
    if (t[5] !== l || t[6] !== u) {
      d = u.size === 1 ? [...u][0] : l;
      t[5] = l;
      t[6] = u;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p = d;
    let m;
    if (t[8] !== s || t[9] !== i) {
      m = (s || i) && jb.jsxs(Text, {
        color: s ? "error" : "warning",
        children: ["[", s ? "Failed to parse" : "Contains warnings", "]", " "]
      });
      t[8] = s;
      t[9] = i;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f;
    if (t[11] !== n) {
      f = s5t(n);
      t[11] = n;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h;
    if (t[13] !== f) {
      h = jb.jsx(Text, {
        children: f
      });
      t[13] = f;
      t[14] = h;
    } else {
      h = t[14];
    }
    let g;
    if (t[15] !== m || t[16] !== h) {
      g = jb.jsxs(gXd, {
        children: [m, h]
      });
      t[15] = m;
      t[16] = h;
      t[17] = g;
    } else {
      g = t[17];
    }
    let y;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      y = jb.jsx(Text, {
        dimColor: true,
        children: "Location: "
      });
      t[18] = y;
    } else {
      y = t[18];
    }
    let _;
    if (t[19] !== p) {
      _ = jb.jsxs(gXd, {
        children: [y, jb.jsx(Text, {
          dimColor: true,
          children: p
        })]
      });
      t[19] = p;
      t[20] = _;
    } else {
      _ = t[20];
    }
    let b;
    if (t[21] !== p || t[22] !== r) {
      let x;
      if (t[24] !== p) {
        x = (A, k) => {
          let I = A.mcpErrorMetadata?.serverName;
          let O = A.file && A.file !== p;
          return jb.jsx(ms.Node, {
            children: jb.jsxs(Text, {
              children: [jb.jsx(Text, {
                color: "error",
                children: "[Error]"
              }), jb.jsxs(Text, {
                dimColor: true,
                children: [" ", O && `(${A.file}) `, I && `[${I}] `, A.path && A.path !== "" ? `${A.path}: ` : "", A.message]
              })]
            })
          }, `error-${k}`);
        };
        t[24] = p;
        t[25] = x;
      } else {
        x = t[25];
      }
      b = r.map(x);
      t[21] = p;
      t[22] = r;
      t[23] = b;
    } else {
      b = t[23];
    }
    let S;
    if (t[26] !== p || t[27] !== o) {
      let x;
      if (t[29] !== p) {
        x = (A, k) => {
          let I = A.mcpErrorMetadata?.serverName;
          let O = A.file && A.file !== p;
          return jb.jsx(ms.Node, {
            children: jb.jsxs(Text, {
              children: [jb.jsx(Text, {
                color: "warning",
                children: "[Warning]"
              }), jb.jsxs(Text, {
                dimColor: true,
                children: [" ", O && `(${A.file}) `, I && `[${I}] `, A.path && A.path !== "" ? `${A.path}: ` : "", A.message]
              })]
            })
          }, `warning-${k}`);
        };
        t[29] = p;
        t[30] = x;
      } else {
        x = t[30];
      }
      S = o.map(x);
      t[26] = p;
      t[27] = o;
      t[28] = S;
    } else {
      S = t[28];
    }
    let E;
    if (t[31] !== b || t[32] !== S) {
      E = jb.jsx(gXd, {
        marginLeft: 1,
        children: jb.jsxs(ms, {
          variant: "tree",
          children: [b, S]
        })
      });
      t[31] = b;
      t[32] = S;
      t[33] = E;
    } else {
      E = t[33];
    }
    let C;
    if (t[34] !== E || t[35] !== g || t[36] !== _) {
      C = jb.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [g, _, E]
      });
      t[34] = E;
      t[35] = g;
      t[36] = _;
      t[37] = C;
    } else {
      C = t[37];
    }
    return C;
  }
  function ZWm(e) {
    return e.file;
  }
  function Hvt() {
    let e = kqo.c(3);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      let l = [{
        scope: "user",
        config: getMcpConfigsByScope("user")
      }, {
        scope: "project",
        config: getMcpConfigsByScope("project")
      }, {
        scope: "local",
        config: getMcpConfigsByScope("local")
      }, {
        scope: "enterprise",
        config: getMcpConfigsByScope("enterprise")
      }];
      let c = getMcpScopeConflicts(l.filter(iGm).map(sGm));
      t = {
        scopes: aGm(l, {
          enterpriseActive: doesEnterpriseMcpConfigExist(),
          mcpLocked: ZT("mcp"),
          isProjectServerApproved: oGm
        }),
        conflicts: c
      };
      e[0] = t;
    } else {
      t = e[0];
    }
    let {
      scopes: n,
      conflicts: r
    } = t;
    let o = n.some(rGm);
    let s = r.length > 0 || n.some(nGm);
    if (!o && !s) {
      return null;
    }
    let i;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = jb.jsx(Bx, {
        title: "MCP config diagnostics",
        status: o ? "error" : "warning"
      });
      e[1] = i;
    } else {
      i = e[1];
    }
    let a;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = jb.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        marginBottom: 1,
        children: [i, jb.jsx(gXd, {
          marginTop: 1,
          children: jb.jsxs(Text, {
            dimColor: true,
            children: ["For help configuring MCP servers, see:", " ", jb.jsx(Link, {
              url: "https://code.claude.com/docs/en/mcp",
              children: "https://code.claude.com/docs/en/mcp"
            })]
          })
        }), n.map(tGm), r.length > 0 && jb.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [jb.jsx(Text, {
            color: "warning",
            children: "[Conflicting scopes]"
          }), jb.jsx(ms, {
            variant: "tree",
            children: r.map(eGm)
          })]
        })]
      });
      e[2] = a;
    } else {
      a = e[2];
    }
    return a;
  }
  function eGm(e, t) {
    return jb.jsxs(ms.Group, {
      children: [jb.jsx(ms.Node, {
        color: "warning",
        children: e.message
      }), e.suggestion && jb.jsx(ms.Node, {
        dimColor: true,
        children: e.suggestion
      })]
    }, `conflict-${t}`);
  }
  function tGm(e) {
    let {
      scope: t,
      config: n
    } = e;
    return jb.jsx(QWm, {
      scope: t,
      parsingErrors: Pir(n.errors, "fatal"),
      warnings: Pir(n.errors, "warning")
    }, t);
  }
  function nGm(e) {
    let {
      config: t
    } = e;
    return Pir(t.errors, "warning").length > 0;
  }
  function rGm(e) {
    let {
      config: t
    } = e;
    return Pir(t.errors, "fatal").length > 0;
  }
  function oGm(e) {
    return P6e(e) === "approved";
  }
  function sGm(e) {
    return {
      scope: e.scope,
      servers: e.config.servers
    };
  }
  function iGm(e) {
    return e.scope !== "enterprise";
  }
  function Pir(e, t) {
    return e.filter(n => n.mcpErrorMetadata?.severity === t);
  }
  function aGm(e, t) {
    let n = (r, o) => {
      if (!(o in r.config.servers)) {
        return false;
      }
      if (r.scope === "project") {
        return t.isProjectServerApproved(o);
      }
      return true;
    };
    return e.map((r, o) => {
      let s = r.scope !== "enterprise" && (t.enterpriseActive || t.mcpLocked);
      let i = e.slice(o + 1);
      let a = l => i.some(c => n(c, l));
      return {
        ...r,
        config: {
          ...r.config,
          errors: r.config.errors.filter(l => {
            if (l.mcpErrorMetadata?.severity !== "warning") {
              return true;
            }
            if (s) {
              return false;
            }
            let c = l.mcpErrorMetadata.serverName;
            return !c || !a(c);
          })
        }
      };
    });
  }
  var kqo;
  var jb;
  var Oir = __lazy(() => {
    Iw();
    G1();
    IJ();
    et();
    $vt();
    Pse();
    kqo = __toESM(pt(), 1);
    jb = __toESM(ie(), 1);
  });
  async function jvt(e, t = {}) {
    try {
      process.kill(e, "SIGTERM");
    } catch (r) {
      if (en(r) === "EPERM") {
        return "eperm";
      }
      return "exited";
    }
    let n = Date.now() + (t.gracefulMs ?? 2000);
    while (Date.now() < n) {
      try {
        process.kill(e, 0);
      } catch {
        return "exited";
      }
      await sleep(50);
    }
    return "timed-out";
  }
  var Aqo = __lazy(() => {
    dt();
  });
  function Afe() {
    return Iqo.join(er(), "daemon.lock");
  }
  function lGm(e) {
    return Iqo.join(er(), `${"daemon.lock"}.tmp.${e.pid}.${e.startedAt}`);
  }
  async function AWl(e) {
    try {
      await fL.writeFile(Afe(), De(e, null, 2), {
        flag: "wx"
      });
      return true;
    } catch (t) {
      if (en(t) === "EEXIST") {
        return false;
      }
      throw t;
    }
  }
  async function IWl(e) {
    let t = await HZ();
    if (!t || t.pid !== e.pid || t.startedAt !== e.startedAt) {
      return;
    }
    await Dir({
      ...t,
      bgDisabled: true
    });
  }
  async function HZ() {
    let e;
    try {
      let n = await fL.lstat(Afe());
      if (!n.isFile() || n.size > 65536) {
        await fL.rm(Afe(), {
          recursive: true,
          force: true
        }).catch(() => {});
        return null;
      }
      e = await fL.readFile(Afe(), "utf8");
    } catch (n) {
      if (fn(n)) {
        return null;
      }
      throw n;
    }
    let t = Ba(e, false);
    if (t && typeof t === "object") {
      let n = t;
      if (typeof n.pid === "number" && typeof n.version === "string") {
        return t;
      }
    }
    return null;
  }
  async function Dir(e) {
    let t = lGm(e);
    await fL.writeFile(t, De(e, null, 2), {
      flag: "wx"
    });
    try {
      await fL.rename(t, Afe());
    } catch (r) {
      let o = en(r);
      if (o === "EEXIST" || o === "EPERM") {
        await fL.unlink(Afe()).catch(() => {});
        try {
          await fL.rename(t, Afe());
        } catch (s) {
          await fL.unlink(t).catch(() => {});
          let i = en(s);
          if (i === "EEXIST" || i === "EPERM") {
            return false;
          }
          throw s;
        }
      } else {
        throw await fL.unlink(t).catch(() => {}), r;
      }
    }
    let n = await HZ();
    return n?.pid === e.pid && n?.startedAt === e.startedAt;
  }
  async function PWl() {
    try {
      await fL.unlink(Afe());
    } catch (e) {
      if (!fn(e)) {
        throw e;
      }
    }
  }
  async function Pqo(e) {
    let t;
    try {
      t = await fL.readFile(`/proc/${e}/cmdline`, "utf8");
    } catch {
      return true;
    }
    let n = t.split("\x00");
    return n[0] === "claude daemon" || n.slice(1, 4).includes("daemon");
  }
  async function lP() {
    let e = await HZ();
    if (!e) {
      return null;
    }
    try {
      process.kill(e.pid, 0);
    } catch {
      return null;
    }
    if (!(await Pqo(e.pid))) {
      return null;
    }
    if (!(await isSameProcessAsync(e.pid, e.procStart))) {
      return null;
    }
    return e;
  }
  async function JQt() {
    let e = await lP().catch(() => null);
    if (!e) {
      return null;
    }
    await jvt(e.pid);
    return e.pid;
  }
  async function OWl(e) {
    let t = await lP().catch(() => null);
    return !!t && t.version !== e;
  }
  var fL;
  var Iqo;
  var jZ = __lazy(() => {
    gn();
    dt();
    Tb();
    Gd();
    Aqo();
    fL = require("fs/promises");
    Iqo = require("path");
  });
  function S5() {
    return Oqo.join(er(), "daemon.json");
  }
  function fUe() {
    return Oqo.join(er(), "daemon.log");
  }
  var Oqo;
  var hUe = __lazy(() => {
    gn();
    Oqo = require("path");
  });
  function gUe() {
    let e = process.env.XDG_RUNTIME_DIR || `/run/user/${process.getuid()}`;
    try {
      return DWl.statSync(mYe.join(e, "systemd")).isDirectory();
    } catch {
      return false;
    }
  }
  function Nqo() {
    if (!rm()) {
      return process.argv[1];
    }
    return mYe.join(zde(), "claude");
  }
  function Mir(e) {
    return e.replace(/[\r\n]/g, " ").replaceAll("%", "%%");
  }
  function Dqo(e) {
    let t = Mir(e);
    return t.includes(" ") ? `"${t}"` : t;
  }
  function Lqo() {
    let e = process.env.XDG_CONFIG_HOME || mYe.join(Mqo.homedir(), ".config");
    return mYe.join(e, "systemd", "user", `${"com.anthropic.claude-daemon"}.service`);
  }
  async function XQt(e) {
    let {
      jsonPath: t,
      logPath: n
    } = e;
    let r = Nqo();
    let o = process.env.PATH || "/usr/local/bin:/usr/bin:/bin";
    {
      let s = Lqo();
      let i = `${"com.anthropic.claude-daemon"}.service`;
      try {
        let u = process.env.XDG_CONFIG_HOME || mYe.join(Mqo.homedir(), ".config");
        await qZ.mkdir(mYe.join(u, "systemd", "user"), {
          recursive: true
        });
        await qZ.writeFile(s, `[Unit]
Description=Claude Daemon
After=network-online.target
StartLimitIntervalSec=60
StartLimitBurst=10

[Service]
Type=simple
Environment="PATH=${Mir(o)}"
ExecStart=${Dqo(r)} daemon --json-path ${Dqo(t)} --log-file ${Dqo(n)} --origin service
Restart=always
RestartSec=1
StandardOutput=append:${Mir(n)}
StandardError=append:${Mir(n)}

[Install]
WantedBy=default.target
`, "utf8");
      } catch (u) {
        return {
          ok: false,
          error: he(u),
          serviceId: "com.anthropic.claude-daemon",
          servicePath: s
        };
      }
      await execFileNoThrow("systemctl", ["--user", "daemon-reload"], {
        useCwd: false
      });
      let {
        code: a,
        stderr: l,
        error: c
      } = await execFileNoThrow("systemctl", ["--user", "enable", "--now", i], {
        useCwd: false
      });
      if (a !== 0) {
        return {
          ok: false,
          error: l || c || "systemctl enable failed",
          serviceId: "com.anthropic.claude-daemon",
          servicePath: s
        };
      }
      await execFileNoThrow("systemctl", ["--user", "restart", i], {
        useCwd: false
      });
      return {
        ok: true,
        serviceId: "com.anthropic.claude-daemon",
        servicePath: s
      };
    }
    return {
      ok: false,
      error: `service install not available on ${"linux"} \u2014 the daemon runs on demand instead`,
      serviceId: "com.anthropic.claude-daemon",
      servicePath: ""
    };
  }
  async function qvt() {
    {
      let e = Lqo();
      let t = `${"com.anthropic.claude-daemon"}.service`;
      await execFileNoThrow("systemctl", ["--user", "disable", "--now", t], {
        useCwd: false
      });
      try {
        await qZ.unlink(e);
      } catch (n) {
        if (!fn(n)) {
          return {
            ok: false,
            error: he(n)
          };
        }
      }
      await execFileNoThrow("systemctl", ["--user", "daemon-reload"], {
        useCwd: false
      });
      return {
        ok: true
      };
    }
    return {
      ok: false,
      error: "service uninstall not available on linux"
    };
  }
  async function Nir() {
    return Fqo("start");
  }
  async function QQt() {
    return Fqo("stop");
  }
  async function MWl() {
    return Fqo("restart");
  }
  async function Fqo(e) {
    if (false) {
      switch (e) {
        case "start":
        case "stop":
        case "restart":
      }
    }
    {
      let {
        code: t,
        stderr: n,
        error: r
      } = await execFileNoThrow("systemctl", ["--user", e, `${"com.anthropic.claude-daemon"}.service`], {
        useCwd: false
      });
      if (t !== 0) {
        return {
          ok: false,
          error: n || r || `systemctl ${e} failed`
        };
      }
      return {
        ok: true
      };
    }
    return {
      ok: false,
      error: `service ${e} not available on ${"linux"} \u2014 the daemon runs on demand instead`
    };
  }
  async function Lir() {
    let e = Lqo();
    if (!e) {
      return false;
    }
    let t;
    try {
      let s = await qZ.stat(e);
      if (!s.isFile() || s.size > 1048576) {
        return false;
      }
      t = await qZ.readFile(e, "utf8");
    } catch {
      return false;
    }
    let n = t.match(/^ExecStart=(?:"([^"]+)"|(\S+))/m);
    let r = n?.[1] ?? n?.[2];
    if (!r) {
      return false;
    }
    let o = r.replaceAll("%%", "%");
    try {
      await qZ.access(o);
      return false;
    } catch {
      return true;
    }
  }
  async function WZ() {
    {
      let {
        code: e,
        stderr: t,
        error: n
      } = await execFileNoThrow("systemctl", ["--user", "status", `${"com.anthropic.claude-daemon"}.service`], {
        useCwd: false
      });
      if (n || t.includes("Failed to connect to bus")) {
        return false;
      }
      return e === 0 || e === 3;
    }
    return false;
  }
  var DWl;
  var qZ;
  var Mqo;
  var mYe;
  var yUe = __lazy(() => {
    dt();
    ji();
    zTe();
    wx();
    DWl = require("fs");
    qZ = require("fs/promises");
    Mqo = require("os");
    mYe = require("path");
  });
  function Fir(e, t) {
    let n = new NWl.StringDecoder("utf8");
    let r = "";
    let o = false;
    let s = a => {
      if (o) {
        return;
      }
      r += typeof a === "string" ? a : n.write(a);
      let l;
      while ((l = r.indexOf(`
`)) >= 0) {
        let c = r.slice(0, l);
        if (r = r.slice(l + 1), c) {
          t(c);
        }
      }
      if (r.length > 1048576) {
        if (o = true, r = "", "destroy" in e) {
          e.destroy();
        }
      }
    };
    let i = () => {
      if (o) {
        return;
      }
      if (r += n.end(), r) {
        t(r);
        r = "";
      }
    };
    e.on("data", s);
    e.on("end", i);
    e.on("close", i);
    return () => {
      e.off("data", s);
      e.off("end", i);
      e.off("close", i);
    };
  }
  var NWl;
  var Uqo = __lazy(() => {
    NWl = require("string_decoder");
  });
  function cie() {
    return ah.join(er(), "daemon");
  }
  function $qo(e) {
    return `\\\\.\\pipe\\cc-daemon-${pGm()}-${e}`;
  }
  function B0(e) {
    return e.replace(/cc-daemon-[0-9a-f]{16}/g, "cc-daemon-*");
  }
  function Gvt(e) {
    if (e instanceof Error) {
      if (e.message = B0(e.message), typeof e.stack === "string") {
        e.stack = B0(e.stack);
      }
    }
    return e;
  }
  function Bqo() {
    return ah.join(cie(), "control.key");
  }
  async function FWl() {
    let e = Bqo();
    try {
      let n = await wE.lstat(e);
      if (n.isFile() && n.size <= 4096) {
        let r = (await wE.readFile(e, "utf8")).trim();
        if (r) {
          return r;
        }
      } else {
        await wE.rm(e, {
          recursive: true,
          force: true
        }).catch(() => {});
      }
    } catch (n) {
      if (!fn(n)) {
        throw n;
      }
    }
    let t = Wvt.randomBytes(16).toString("hex");
    await wE.mkdir(cie(), {
      recursive: true,
      mode: 448
    });
    await Fm(e, t, 384);
    return t;
  }
  async function Ofe() {
    try {
      let e = await wE.lstat(Bqo());
      if (!e.isFile() || e.size > 4096) {
        return;
      }
      return (await wE.readFile(Bqo(), "utf8")).trim() || undefined;
    } catch {
      return;
    }
  }
  async function UWl() {
    let e = cie();
    if (Wt() === "windows") {
      await wE.mkdir(e, {
        recursive: true
      });
      await wE.chmod(e, 448).catch(() => {});
      return;
    }
    await wE.mkdir(e, {
      recursive: true,
      mode: 448
    });
    let t = process.getuid?.();
    let n = await wE.lstat(e);
    if (t !== undefined && n.uid !== t) {
      throw Error(`refusing to use daemon dir: ${e} is owned by uid ${n.uid}`);
    }
    if ((n.mode & 511) !== 448) {
      await wE.chmod(e, 448);
    }
  }
  async function Uir() {
    if (Wt() === "windows") {
      return;
    }
    let e = Pfe();
    await wE.mkdir(e, {
      recursive: true,
      mode: 448
    });
    let t = new Date();
    await wE.utimes(e, t, t).catch(() => {});
    let n = process.getuid?.();
    for (let r of [ah.dirname(e), e]) {
      let o = await wE.lstat(r);
      if (n !== undefined && o.uid !== n) {
        throw Error(`refusing to bind: ${r} is owned by uid ${o.uid}`);
      }
      if ((o.mode & 511) !== 448) {
        await wE.chmod(r, 448);
      }
    }
  }
  function BWl() {
    if (Wt() === "windows") {
      return;
    }
    let e = Pfe();
    let t = ah.dirname(e);
    let n = ah.basename(e);
    wE.readdir(t, {
      withFileTypes: true
    }).then(async r => {
      for (let o of r) {
        if (!o.isDirectory() || o.name === n) {
          continue;
        }
        let s = ah.join(t, o.name);
        if (!(await mGm(ah.join(s, "control.sock")))) {
          continue;
        }
        let i = await wE.lstat(s).catch(() => null);
        if (!i || Date.now() - i.mtimeMs < 1e4) {
          continue;
        }
        let a = await wE.readdir(ah.join(s, "rv")).catch(() => []);
        let l = await wE.readdir(ah.join(s, "pty")).catch(() => []);
        let c = await wE.readdir(ah.join(s, "spare")).catch(() => []);
        if (a.length || l.length || c.length) {
          continue;
        }
        await wE.rm(s, {
          recursive: true,
          force: true
        }).catch(() => {});
      }
    }).catch(() => {});
  }
  function mGm(e) {
    let t;
    let n = new Promise(o => {
      t = o;
    });
    let r = LWl.connect(e);
    r.setTimeout(1000, () => {
      r.destroy();
      t(false);
    });
    r.on("error", o => {
      let s = en(o);
      t(s === "ENOENT" || s === "ECONNREFUSED" || s === "ENOTSOCK");
    });
    r.once("connect", () => {
      r.end(`{"op":"ping"}
`);
      t(false);
    });
    return n;
  }
  function fYe() {
    return ah.join(cie(), "dispatch");
  }
  function Hqo() {
    return ah.join(cie(), "dispatch", "rejected");
  }
  function uie() {
    return ah.join(cie(), "roster.json");
  }
  function jqo() {
    return ah.join(Pfe(), "rv");
  }
  function ZQt() {
    return ah.join(cie(), "auth");
  }
  function eZt(e) {
    return ah.join(ZQt(), `${e}.json`);
  }
  function tZt() {
    return ah.join(cie(), "host-managed");
  }
  function Dfe(e) {
    return ah.join(tZt(), e);
  }
  function nZt(e) {
    return ah.join(ZQt(), `${e}.tokens.json`);
  }
  function Vvt(e) {
    if (Wt() === "windows") {
      return $qo(`rv-${e}`);
    }
    return ah.join(jqo(), `${e}.sock`);
  }
  function zvt() {
    return ah.join(Pfe(), "pty");
  }
  function cP(e) {
    if (Wt() === "windows") {
      return $qo(`pty-${e}`);
    }
    return ah.join(zvt(), `${e}.sock`);
  }
  function GZ() {
    return ah.join(Pfe(), "spare");
  }
  function $Wl(e) {
    return ah.join(GZ(), `${e}.pty.sock`);
  }
  function HWl(e) {
    return ah.join(GZ(), `${e}.claim.sock`);
  }
  function _Ue() {
    return ah.join(cie(), "pty-pids");
  }
  function Bwe(e) {
    return ah.join(_Ue(), `${e}.pid`);
  }
  function ZO(e) {
    return jWl(e, "err");
  }
  function JM(e) {
    return jWl(e, "late");
  }
  function jWl(e, t) {
    if (Wt() === "windows") {
      return ah.join(_Ue(), `${e.split("\\").pop()}.${t}`);
    }
    return `${e}.${t}`;
  }
  function VZ(e) {
    if (Wt() === "windows") {
      return ah.join(_Ue(), `${e.split("\\").pop()}.exec-exit`);
    }
    return `${e}.exec-exit`;
  }
  function T5() {
    if (Wt() === "windows") {
      return $qo("control");
    }
    return ah.join(Pfe(), "control.sock");
  }
  var Wvt;
  var Ife;
  var wE;
  var LWl;
  var ah;
  var uGm;
  var Pfe;
  var dGm;
  var pGm;
  var uP = __lazy(() => {
    zf();
    BT();
    gn();
    dt();
    Cs();
    Wvt = require("crypto");
    Ife = require("fs");
    wE = require("fs/promises");
    LWl = require("net");
    ah = require("path");
    uGm = TEr(() => Wvt.createHash("sha256").update(ah.resolve(er())).digest("hex").slice(0, 8), () => ah.resolve(er()));
    Pfe = TEr(() => {
      let e = process.getuid?.() ?? 0;
      let t = process.env.TERMUX_VERSION && process.env.PREFIX ? ah.join(process.env.PREFIX, "tmp") : "/tmp";
      return ah.join(t, `cc-daemon-${e}`, uGm());
    }, () => er());
    dGm = /^[a-f0-9]{16}$/;
    pGm = TEr(() => {
      let e = ah.join(cie(), "pipe.key");
      for (let t = 0; t < 8; t++) {
        let n;
        try {
          let o = Ife.lstatSync(e);
          if (!o.isFile() || o.size > 4096) {
            try {
              Ife.rmSync(e, {
                recursive: true,
                force: true
              });
            } catch {}
            n = "invalid";
          } else {
            n = Ife.readFileSync(e, "utf8").trim();
          }
        } catch (o) {
          if (!fn(o)) {
            throw o;
          }
        }
        if (n !== undefined) {
          if (dGm.test(n)) {
            return n;
          }
          if (n === "" && t < 3) {
            continue;
          }
          let o = Wvt.randomBytes(8).toString("hex");
          vj(e, o, 384);
          return o;
        }
        let r = Wvt.randomBytes(8).toString("hex");
        Ife.mkdirSync(cie(), {
          recursive: true,
          mode: 448
        });
        try {
          Ife.writeFileSync(e, r, {
            flag: "wx",
            mode: 384
          });
          return r;
        } catch (o) {
          if (en(o) !== "EEXIST") {
            throw o;
          }
        }
      }
      throw Error("daemon pipe.key is not a valid nonce");
    }, () => er());
  });
  async function CT(e, t) {
    let n;
    try {
      n = Bir.connect(T5());
    } catch (u) {
      return {
        ok: false,
        code: "ENOCONN",
        error: B0(he(u))
      };
    }
    let r = t?.timeoutMs ?? 5000;
    let o;
    let s = new Promise(u => {
      o = u;
    });
    let i = false;
    let a = u => {
      if (i) {
        return;
      }
      i = true;
      n.destroy();
      o(u);
    };
    n.setTimeout(r, () => a({
      ok: false,
      code: "ETIMEOUT",
      error: "control socket timeout"
    }));
    n.on("error", u => a({
      ok: false,
      code: "ENOCONN",
      error: B0(he(u))
    }));
    n.once("connect", () => {
      n.write(De(e) + `
`);
    });
    let l = new qWl.StringDecoder("utf8");
    let c = "";
    n.on("data", u => {
      c += l.write(u);
      let d = c.indexOf(`
`);
      if (d < 0) {
        return;
      }
      let p = c.slice(0, d);
      try {
        a(qt(p));
      } catch (m) {
        a({
          ok: false,
          code: "ENOCONN",
          error: B0(he(m))
        });
      }
    });
    n.once("close", () => {
      if (!i) {
        a({
          ok: false,
          code: "ENOCONN",
          error: "connection dropped mid-request \u2014 it may have restarted; retry"
        });
      }
    });
    return s;
  }
  function $ir(e) {
    let t = {
      label: e,
      cwd: Nt(),
      pid: process.pid
    };
    let n = false;
    let r = null;
    let o = null;
    let s = () => {
      if (n) {
        return;
      }
      try {
        r = Bir.connect(T5());
      } catch {
        r = null;
        o = setTimeout(s, 1000);
        o.unref();
        return;
      }
      r.on("error", () => r?.destroy());
      r.once("connect", () => r?.write(De({
        proto: 1,
        op: "lease",
        client: t
      }) + `
`));
      r.on("data", () => {});
      r.once("close", () => {
        if (r = null, n) {
          return;
        }
        o = setTimeout(s, 1000);
        o.unref();
      });
      r.unref();
    };
    s();
    return () => {
      if (n = true, o) {
        clearTimeout(o);
      }
      r?.destroy();
    };
  }
  function WWl(e, t, n, r) {
    let o;
    try {
      o = Bir.connect(T5());
    } catch (c) {
      queueMicrotask(() => r(B0(he(c))));
      return () => {};
    }
    let s = false;
    let i = false;
    let a = c => {
      if (s) {
        return;
      }
      s = true;
      r(c);
    };
    o.setTimeout(1e4, () => {
      if (!i) {
        a(`${bgSupervisorNoun()} did not respond \u2014 it may be stalled${daemonHint("restart")}`);
        o.destroy();
      }
    });
    o.on("error", c => a(B0(he(c))));
    o.on("close", () => a("control socket closed"));
    o.on("connect", () => o.write(De({
      proto: 1,
      op: "subscribe",
      short: e,
      tail: t
    }) + `
`));
    let l = Fir(o, c => {
      if (!i) {
        i = true;
        o.setTimeout(0);
      }
      try {
        let u = qt(c);
        if ("ok" in u && u.ok === false) {
          a(u.error);
        } else {
          n(u);
        }
      } catch {}
    });
    return () => {
      s = true;
      l();
      o.destroy();
    };
  }
  var Bir;
  var qWl;
  var Mfe = __lazy(() => {
    uT();
    vo();
    dt();
    Uqo();
    uP();
    pL();
    Bir = require("net");
    qWl = require("string_decoder");
  });
  function rZt() {
    return {
      proto: 1,
      supervisorPid: process.pid,
      updatedAt: Date.now(),
      workers: {}
    };
  }
  async function j3(e) {
    let t;
    try {
      let r = await Nfe.lstat(uie());
      if (!r.isFile() || r.size > 8388608) {
        if (!e?.silent) {
          if (Oe(Error(`roster.json ${r.isFile() ? `too large (${r.size} bytes) \u2014 quarantining` : "is not a regular file \u2014 removing"}`)), logEvent("tengu_bg_roster_parse_failed", {
            orphaned: -1,
            quarantined: 1,
            errCode: r.isFile() ? "E2BIG" : "EFTYPE"
          }), r.isFile()) {
            await Hir();
          } else {
            await Nfe.rm(uie(), {
              recursive: true,
              force: true
            }).catch(o => Oe(o));
          }
        }
        return {
          ...rZt(),
          parseFailed: true
        };
      }
      t = qt(await Nfe.readFile(uie(), "utf8"));
    } catch (r) {
      if (fn(r)) {
        return rZt();
      }
      if (!e?.silent) {
        Oe($o(sr(r), "bg roster.json read/parse failed"));
        logEvent("tengu_bg_roster_parse_failed", {
          orphaned: -1,
          quarantined: 1,
          errCode: gd(r) ?? U4(r)
        });
        await Hir();
      }
      return {
        ...rZt(),
        parseFailed: true
      };
    }
    let n;
    try {
      n = GHl().safeParse(t);
    } catch (r) {
      if (!e?.silent) {
        Oe(r);
        logEvent("tengu_bg_roster_parse_failed", {
          orphaned: GWl(t),
          quarantined: 1,
          errCode: WZe(r)
        });
        await Hir();
      }
      return {
        ...rZt(),
        parseFailed: true
      };
    }
    if (n.success) {
      return n.data;
    }
    if (!e?.silent) {
      let r = GWl(t);
      let o = n.error.issues[0];
      Oe(Error(`roster.json parse failed (orphaning ${r} worker(s)): ${o?.message}`));
      logEvent("tengu_bg_roster_parse_failed", {
        orphaned: r,
        quarantined: 1,
        issuePath: o?.path.map(s => typeof s === "string" && !fGm.vZc(s) ? "*" : String(s)).join("."),
        issueCode: o?.code == null ? undefined : o?.code
      });
      await Hir();
    }
    return {
      ...rZt(),
      parseFailed: true
    };
  }
  async function Hir() {
    await Nfe.rename(uie(), `${uie()}.corrupt.${Date.now()}`).catch(e => Oe(e));
  }
  function GWl(e) {
    let t = e !== null && typeof e === "object" ? e.workers : undefined;
    return t !== null && typeof t === "object" && !Array.isArray(t) ? Object.keys(t).length : 0;
  }
  async function gGm(e) {
    let t = uie();
    await Nfe.mkdir(zWl.dirname(t), {
      recursive: true,
      mode: 448
    }).catch(() => {});
    await Fm(t, De(e, null, 2), 384).catch(n => {
      let r = en(n);
      if (r && v6.vZc(r)) {
        logForDebugging(`[daemon] roster write failed: ${r}`, {
          level: "error"
        });
        return;
      }
      throw n;
    });
  }
  function Kvt(e) {
    let t = VWl.then(async () => {
      let n = await j3();
      let r = e(n) ?? n;
      r.supervisorPid = process.pid;
      r.updatedAt = Date.now();
      await gGm(r);
    });
    VWl = t.catch(() => {});
    return t;
  }
  var Nfe;
  var zWl;
  var fGm;
  var VWl;
  var hYe = __lazy(() => {
    Ot();
    BT();
    je();
    dt();
    Rn();
    uP();
    pL();
    Nfe = require("fs/promises");
    zWl = require("path");
    fGm = new Set(["proto", "supervisorPid", "updatedAt", "workers", "pid", "procStart", "sessionId", "rendezvousSock", "ptySock", "messagingSock", "rvAuth", "ptyAuth", "cliVersion", "startedAt", "attempt", "cwd", "worktreePath", "dispatch", "pendingRespawn", "decModes", "short", "nonce", "createdAt", "cols", "rows", "source", "launch", "mode", "args", "fork", "flagArgs", "cmd", "env", "reattachEnv", "worktree", "path", "ownershipToken", "isolation", "respawnFlags", "seed", "intent", "name", "agent", "routine", "attachStallRespawns"]);
    VWl = Promise.resolve();
  });
  var Wqo = {};
  __export(Wqo, {
    getBgDaemonStatus: () => getBgDaemonStatus,
    formatBgDaemonStatus: () => formatBgDaemonStatus
  });
  async function getBgDaemonStatus() {
    let e = await lP().catch(() => null);
    let t = e?.logPath ?? fUe();
    let [n, r, o, s, i, a] = await Promise.all([CT({
      op: "ping",
      proto: 1
    }, {
      timeoutMs: 1000
    }).catch(p => ({
      ok: false,
      code: "ENOCONN",
      error: String(p)
    })), j3({
      silent: true
    }), Yvt.stat(uie()).catch(() => null), Yvt.stat(t).catch(() => null), WZ().catch(() => false), yGm(S5())]);
    let l;
    try {
      l = T5();
    } catch {
      l = Wt() === "windows" ? "\\\\.\\pipe\\cc-daemon-*" : "<unavailable>";
    }
    let c = null;
    let u = null;
    let d = [];
    if (n.ok) {
      let p = {
        ok: false
      };
      let [m, f] = await Promise.all([CT({
        op: "list",
        proto: 1
      }, {
        timeoutMs: 1000
      }).catch(() => p), CT({
        op: "leases",
        proto: 1
      }, {
        timeoutMs: 1000
      }).catch(() => p)]);
      if (m.ok && "jobs" in m) {
        c = Bn(m.jobs, g => !g.outcome);
        let h = e?.version ?? {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION;
        u = Bn(m.jobs, g => !g.outcome && g.cliVersion !== undefined && g.cliVersion !== h);
      }
      if (f.ok && "clients" in f) {
        d = f.clients;
      }
    }
    return {
      supervisor: e ? {
        pid: e.pid,
        version: e.version,
        uptimeSec: Math.floor((Date.now() - e.startedAt) / 1000)
      } : null,
      sockDir: Wt() === "windows" ? "\\\\.\\pipe\\cc-daemon-*" : Pfe(),
      controlSock: l,
      controlReachable: n.ok,
      controlError: n.ok ? undefined : B0(n.error),
      workersLive: c,
      workersSkewed: u,
      workersRoster: Object.keys(r.workers).length,
      rosterAgeSec: o ? Math.floor((Date.now() - o.mtimeMs) / 1000) : null,
      bgDisabled: e?.bgDisabled === true,
      logPath: t,
      logSizeBytes: s?.size ?? null,
      serviceInstalled: i,
      configuredWorkers: a,
      leaseClients: d
    };
  }
  async function yGm(e) {
    let t;
    try {
      let o = await Yvt.stat(e);
      if (!o.isFile() || o.size > 1048576) {
        return 0;
      }
      t = await Yvt.readFile(e, "utf8");
    } catch {
      return 0;
    }
    let n = Ba(t, false);
    if (n === null || typeof n !== "object") {
      return 0;
    }
    let r = 0;
    for (let [o, s] of Object.entries(n)) {
      if (o === "$schema") {
        continue;
      }
      r += Array.isArray(s) ? s.length : 1;
    }
    return r;
  }
  function formatBgDaemonStatus(e) {
    let t = ["", "bg sessions:"];
    if (t.push(`  sock dir:     ${e.sockDir}`), t.push(`  control.sock: ${e.controlReachable ? "reachable" : `unreachable (${e.controlError ?? "unknown"})`}`), e.bgDisabled) {
      t.push("  bg sessions:  disabled (start failure \u2014 see daemon.log; restart the service after fixing)");
    }
    if (e.workersLive !== null) {
      if (t.push(`  bg workers:   ${e.workersLive} running (control.sock), ${e.workersRoster} in roster.json`), e.workersSkewed && e.workersSkewed > 0) {
        t.push(`                ${e.workersSkewed} from a different CLI version (most stay attachable and upgrade automatically once idle \u2014 exec runs never respawn)`);
      }
    } else {
      t.push(`  bg workers:   ${e.workersRoster} in roster.json (${e.controlReachable ? "live count unavailable" : "control unreachable"})`);
    }
    if (t.push(`  roster.json:  ${e.rosterAgeSec === null ? "absent" : `updated ${e.rosterAgeSec}s ago`}`), t.push(`  daemon.log:   ${e.logSizeBytes === null ? "absent" : `${bGm(e.logSizeBytes)} at ${e.logPath}`}`), !e.supervisor && !e.controlReachable && e.workersRoster > 0) {
      t.push(`  warning:      supervisor not running but ${e.workersRoster} ${un(e.workersRoster, "worker")} in roster \u2014 running \`claude agents\` restarts the daemon and re-adopts still-running sessions; run \`claude daemon stop --any\` to reap them instead`);
    }
    return t.join(`
`);
  }
  function bGm(e) {
    if (e < 1024) {
      return `${e}B`;
    }
    if (e < 1048576) {
      return `${(e / 1024).toFixed(1)}KB`;
    }
    return `${(e / 1024 / 1024).toFixed(1)}MB`;
  }
  var Yvt;
  var jir = __lazy(() => {
    Gd();
    Cs();
    Zn();
    jZ();
    hUe();
    yUe();
    Mfe();
    uP();
    pL();
    hYe();
    Yvt = require("fs/promises");
  });
  function SGm(e) {
    let t = qir.c(19);
    let {
      promise: n
    } = e;
    let r = Jvt.use(n);
    let o = r.supervisor;
    let s = r.workersLive ?? r.workersRoster;
    let i;
    if (t[0] !== s || t[1] !== r.controlReachable || t[2] !== o) {
      i = o !== null ? $0.jsxs(ms.Node, {
        children: ["pid ", o.pid, " \xB7 v", o.version, " \xB7 ", s, " bg", " ", un(s, "worker"), r.controlReachable ? "" : " \xB7 control.sock unreachable"]
      }) : null;
      t[0] = s;
      t[1] = r.controlReachable;
      t[2] = o;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = r.serviceInstalled ? "service-managed" : "ephemeral";
    let l;
    if (t[4] !== a) {
      l = $0.jsxs(ms.Node, {
        children: ["Mode: ", a]
      });
      t[4] = a;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== o) {
      c = o !== null && o.version !== {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION ? $0.jsxs(ms.Node, {
        color: "warning",
        children: ["Server version v", o.version, " differs from this CLI (v", {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, "). It will restart on next use."]
      }) : null;
      t[6] = o;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== r.serviceInstalled) {
      u = r.serviceInstalled ? $0.jsxs(ms.Node, {
        color: "warning",
        children: ["A persistent launchd/systemd unit is installed. The next server start will remove it; run", " ", $0.jsx(Text, {
          color: "suggestion",
          children: "claude daemon uninstall"
        }), " to remove it now."]
      }) : null;
      t[8] = r.serviceInstalled;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== r.configuredWorkers) {
      d = r.configuredWorkers > 0 ? $0.jsxs(ms.Node, {
        color: "warning",
        children: [r.configuredWorkers, " configured background", " ", un(r.configuredWorkers, "worker"), " (daemon.json) only run while a foreground client or background job keeps the server alive. They will not start after reboot."]
      }) : null;
      t[10] = r.configuredWorkers;
      t[11] = d;
    } else {
      d = t[11];
    }
    let p;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      p = $0.jsxs(ms.Node, {
        dimColor: true,
        children: ["See ", $0.jsx(Text, {
          color: "suggestion",
          children: "claude daemon status"
        }), " for details"]
      });
      t[12] = p;
    } else {
      p = t[12];
    }
    let m;
    if (t[13] !== i || t[14] !== l || t[15] !== c || t[16] !== u || t[17] !== d) {
      m = $0.jsxs(ms.Group, {
        children: [i, l, c, u, d, p]
      });
      t[13] = i;
      t[14] = l;
      t[15] = c;
      t[16] = u;
      t[17] = d;
      t[18] = m;
    } else {
      m = t[18];
    }
    return m;
  }
  function KWl() {
    let e = qir.c(4);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = getBgDaemonStatus();
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let r;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = $0.jsx(Text, {
        bold: true,
        children: "Background server"
      });
      e[1] = r;
    } else {
      r = e[1];
    }
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = $0.jsxs(gXd, {
        children: [r, $0.jsx(Jvt.Suspense, {
          fallback: null,
          children: $0.jsx(TGm, {
            promise: n
          })
        })]
      });
      e[2] = o;
    } else {
      o = e[2];
    }
    let s;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      s = $0.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [o, $0.jsx(ms, {
          variant: "tree",
          children: $0.jsx(Jvt.Suspense, {
            fallback: $0.jsx(ms.Node, {
              dimColor: true,
              children: "Probing background server\u2026"
            }),
            children: $0.jsx(SGm, {
              promise: n
            })
          })
        })]
      });
      e[3] = s;
    } else {
      s = e[3];
    }
    return s;
  }
  function TGm(e) {
    let t = qir.c(2);
    let {
      promise: n
    } = e;
    let r = Jvt.use(n);
    let s = r.supervisor !== null && r.supervisor.version !== {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION || r.supervisor !== null && !r.controlReachable || r.serviceInstalled || r.configuredWorkers > 0 ? "warning" : r.supervisor === null ? "pending" : "success";
    let i;
    if (t[0] !== s) {
      i = $0.jsxs(Text, {
        children: [" ", $0.jsx(Ps, {
          status: s
        })]
      });
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    return i;
  }
  var qir;
  var Jvt;
  var $0;
  var YWl = __lazy(() => {
    jir();
    et();
    Zn();
    Vf();
    Pse();
    qir = __toESM(pt(), 1);
    Jvt = __toESM(ot(), 1);
    $0 = __toESM(ie(), 1);
  });
  function Wir(e) {
    let t = JWl.c(12);
    let {
      children: n,
      color: r,
      dimColor: o
    } = e;
    let s;
    let i;
    let a;
    let l;
    if (t[0] !== n || t[1] !== r || t[2] !== o) {
      let u = n.split("`");
      s = Text;
      i = r;
      a = o;
      l = u.map(EGm);
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
      t[4] = i;
      t[5] = a;
      t[6] = l;
    } else {
      s = t[3];
      i = t[4];
      a = t[5];
      l = t[6];
    }
    let c;
    if (t[7] !== s || t[8] !== i || t[9] !== a || t[10] !== l) {
      c = Gqo.jsx(s, {
        color: i,
        dimColor: a,
        children: l
      });
      t[7] = s;
      t[8] = i;
      t[9] = a;
      t[10] = l;
      t[11] = c;
    } else {
      c = t[11];
    }
    return c;
  }
  function EGm(e, t) {
    return t % 2 === 1 ? Gqo.jsx(Text, {
      color: "suggestion",
      children: e
    }, t) : e;
  }
  var JWl;
  var Gqo;
  var Vqo = __lazy(() => {
    et();
    JWl = __toESM(pt(), 1);
    Gqo = __toESM(ie(), 1);
  });
  function Kqo(e) {
    let t = e.slice(0, 3).join(", ");
    return e.length > 3 ? `${t}, +${e.length - 3} more` : t;
  }
  function Yqo(e) {
    return e >= 1000 ? `${Math.round(e / 1000)}k` : String(e);
  }
  function Jqo(e) {
    let t = Math.round(e * 1000) / 10;
    return t === 0 && e > 0 ? "<0.1%" : `${t}%`;
  }
  function QWl() {
    let e = XWl.c(57);
    let t = bt(vGm);
    if (!t) {
      return null;
    }
    let n = t.cappedSkills.length;
    let r = t.budgetMode !== "fits";
    if (n === 0 && !r) {
      return null;
    }
    let o = t.budgetTruncatedSkills.length;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    if (e[0] !== o || e[1] !== n || e[2] !== r || e[3] !== t.budget || e[4] !== t.budgetFromEnv || e[5] !== t.budgetMode || e[6] !== t.budgetTruncatedSkills || e[7] !== t.bytesPerToken || e[8] !== t.cappedSkills || e[9] !== t.maxDescLen || e[10] !== t.rawTotalChars || e[11] !== t.totalChars) {
      let b = Math.round(t.rawTotalChars / t.bytesPerToken);
      if (e[23] !== o || e[24] !== n || e[25] !== r || e[26] !== t.budget || e[27] !== t.budgetFromEnv || e[28] !== t.budgetMode || e[29] !== t.budgetTruncatedSkills || e[30] !== t.cappedSkills || e[31] !== t.maxDescLen || e[32] !== t.totalChars) {
        let S = Pco();
        let E = t.budgetFromEnv ? `${Yqo(t.totalChars)}/${Yqo(t.budget)} chars` : `${Jqo(t.totalChars / t.budget * S)}/${Jqo(S)} of context`;
        if (a = gXd, m = "column", f = 1, e[40] === Symbol.for("react.memo_cache_sentinel")) {
          h = SH.jsx(Bx, {
            title: "Skills",
            status: "warning"
          });
          e[40] = h;
        } else {
          h = e[40];
        }
        i = ms;
        d = "tree";
        p = r ? SH.jsxs(ms.Group, {
          children: [SH.jsx(ms.Node, {
            color: "warning",
            children: `${o} skill ${un(o, "description")} will be ${t.budgetMode === "truncate" ? `shortened to ~${t.maxDescLen} chars` : t.budgetMode === "priority" ? "dropped (full descriptions kept for most-used skills)" : "dropped entirely"} (${E}): ${Kqo(t.budgetTruncatedSkills)}`
          }), SH.jsxs(ms.Node, {
            dimColor: true,
            children: ["run ", SH.jsx(Text, {
              color: "suggestion",
              children: "/skills"
            }), " to disable some, or raise ", SH.jsx(Text, {
              color: "suggestion",
              children: "skillListingBudgetFraction"
            }), " ", "(currently ", Jqo(S), ") in settings.json"]
          }), n > 0 && SH.jsx(ms.Node, {
            dimColor: true,
            children: `${n} ${un(n, "description exceeds", "descriptions exceed")} the per-entry cap: ${Kqo(t.cappedSkills)}`
          })]
        }) : SH.jsxs(ms.Group, {
          children: [SH.jsx(ms.Node, {
            color: "warning",
            children: `${n} skill ${un(n, "description exceeds", "descriptions exceed")} the per-entry cap and will be shortened: ${Kqo(t.cappedSkills)}`
          }), SH.jsxs(ms.Node, {
            dimColor: true,
            children: ["raise ", SH.jsx(Text, {
              color: "suggestion",
              children: "skillListingMaxDescChars"
            }), " ", "(currently ", cTe(), ") in settings.json"]
          })]
        });
        e[23] = o;
        e[24] = n;
        e[25] = r;
        e[26] = t.budget;
        e[27] = t.budgetFromEnv;
        e[28] = t.budgetMode;
        e[29] = t.budgetTruncatedSkills;
        e[30] = t.cappedSkills;
        e[31] = t.maxDescLen;
        e[32] = t.totalChars;
        e[33] = i;
        e[34] = a;
        e[35] = d;
        e[36] = p;
        e[37] = m;
        e[38] = f;
        e[39] = h;
      } else {
        i = e[33];
        a = e[34];
        d = e[35];
        p = e[36];
        m = e[37];
        f = e[38];
        h = e[39];
      }
      s = ms.Node;
      l = true;
      c = "Opting in would cost ~";
      u = Yqo(b);
      e[0] = o;
      e[1] = n;
      e[2] = r;
      e[3] = t.budget;
      e[4] = t.budgetFromEnv;
      e[5] = t.budgetMode;
      e[6] = t.budgetTruncatedSkills;
      e[7] = t.bytesPerToken;
      e[8] = t.cappedSkills;
      e[9] = t.maxDescLen;
      e[10] = t.rawTotalChars;
      e[11] = t.totalChars;
      e[12] = s;
      e[13] = i;
      e[14] = a;
      e[15] = l;
      e[16] = c;
      e[17] = u;
      e[18] = d;
      e[19] = p;
      e[20] = m;
      e[21] = f;
      e[22] = h;
    } else {
      s = e[12];
      i = e[13];
      a = e[14];
      l = e[15];
      c = e[16];
      u = e[17];
      d = e[18];
      p = e[19];
      m = e[20];
      f = e[21];
      h = e[22];
    }
    let g;
    if (e[41] !== s || e[42] !== l || e[43] !== c || e[44] !== u) {
      g = SH.jsxs(s, {
        dimColor: l,
        children: [c, u, " tokens for skills every session and uses rate limits faster"]
      });
      e[41] = s;
      e[42] = l;
      e[43] = c;
      e[44] = u;
      e[45] = g;
    } else {
      g = e[45];
    }
    let y;
    if (e[46] !== i || e[47] !== d || e[48] !== p || e[49] !== g) {
      y = SH.jsxs(i, {
        variant: d,
        children: [p, g]
      });
      e[46] = i;
      e[47] = d;
      e[48] = p;
      e[49] = g;
      e[50] = y;
    } else {
      y = e[50];
    }
    let _;
    if (e[51] !== a || e[52] !== m || e[53] !== f || e[54] !== h || e[55] !== y) {
      _ = SH.jsxs(a, {
        flexDirection: m,
        marginTop: f,
        children: [h, y]
      });
      e[51] = a;
      e[52] = m;
      e[53] = f;
      e[54] = h;
      e[55] = y;
      e[56] = _;
    } else {
      _ = e[56];
    }
    return _;
  }
  function vGm(e) {
    return e.skillTruncationStats;
  }
  var XWl;
  var SH;
  var ZWl = __lazy(() => {
    et();
    ho();
    S9e();
    Zn();
    $vt();
    Pse();
    XWl = __toESM(pt(), 1);
    SH = __toESM(ie(), 1);
  });
  function wGm(e) {
    let t = Gir.c(8);
    let {
      promise: n
    } = e;
    let r = Xvt.use(n);
    if (r.inRemoteSession) {
      let a;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        a = dP.jsx(ms.Node, {
          dimColor: true,
          children: "Inside a cloud session \u2014 Remote Control is unavailable here. Use it from the local session instead."
        });
        t[0] = a;
      } else {
        a = t[0];
      }
      return a;
    }
    let o = r.checks;
    let s;
    let i;
    if (t[1] !== r.checks || t[2] !== r.disabledReason) {
      i = Symbol.for("react.early_return_sentinel");
      e: {
        let a = o.filter(xGm);
        if (r.disabledReason !== null) {
          let c;
          if (t[5] !== r.disabledReason) {
            c = dP.jsx(ms.Node, {
              label: dP.jsx(Wir, {
                color: "warning",
                children: r.disabledReason
              })
            });
            t[5] = r.disabledReason;
            t[6] = c;
          } else {
            c = t[6];
          }
          i = dP.jsxs(ms.Group, {
            children: [c, a.map(RGm)]
          });
          break e;
        }
        let l;
        if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
          l = dP.jsx(ms.Node, {
            dimColor: true,
            children: "Control this session from claude.ai/code or the Claude mobile app"
          });
          t[7] = l;
        } else {
          l = t[7];
        }
        s = dP.jsxs(ms.Group, {
          children: [l, a.map(CGm)]
        });
      }
      t[1] = r.checks;
      t[2] = r.disabledReason;
      t[3] = s;
      t[4] = i;
    } else {
      s = t[3];
      i = t[4];
    }
    if (i !== Symbol.for("react.early_return_sentinel")) {
      return i;
    }
    return s;
  }
  function CGm(e) {
    return dP.jsxs(ms.Node, {
      color: "warning",
      children: [e.label, e.detail ? ` (${e.detail})` : ""]
    }, e.label);
  }
  function RGm(e) {
    return dP.jsxs(ms.Node, {
      dimColor: true,
      children: [e.label, e.detail ? ` (${e.detail})` : ""]
    }, e.label);
  }
  function xGm(e) {
    return !e.ok;
  }
  function eGl() {
    let e = Gir.c(4);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = getBridgeDoctorInfo();
      e[0] = t;
    } else {
      t = e[0];
    }
    let n = t;
    let r;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = dP.jsx(Text, {
        bold: true,
        children: "Remote Control"
      });
      e[1] = r;
    } else {
      r = e[1];
    }
    let o;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = dP.jsxs(gXd, {
        children: [r, dP.jsx(Xvt.Suspense, {
          fallback: null,
          children: dP.jsx(kGm, {
            promise: n
          })
        })]
      });
      e[2] = o;
    } else {
      o = e[2];
    }
    let s;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      s = dP.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [o, dP.jsx(ms, {
          variant: "tree",
          children: dP.jsx(Xvt.Suspense, {
            fallback: dP.jsx(ms.Node, {
              dimColor: true,
              children: "Checking Remote Control eligibility\u2026"
            }),
            children: dP.jsx(wGm, {
              promise: n
            })
          })
        })]
      });
      e[3] = s;
    } else {
      s = e[3];
    }
    return s;
  }
  function kGm(e) {
    let t = Gir.c(2);
    let {
      promise: n
    } = e;
    let r = Xvt.use(n);
    let o = r.inRemoteSession ? "info" : r.disabledReason === null && r.checks.every(AGm) ? "success" : "warning";
    let s;
    if (t[0] !== o) {
      s = dP.jsxs(Text, {
        children: [" ", dP.jsx(Ps, {
          status: o
        })]
      });
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    return s;
  }
  function AGm(e) {
    return e.ok;
  }
  var Gir;
  var Xvt;
  var dP;
  var tGl = __lazy(() => {
    Ox();
    et();
    Vf();
    Pse();
    Vqo();
    Gir = __toESM(pt(), 1);
    Xvt = __toESM(ot(), 1);
    dP = __toESM(ie(), 1);
  });
  function rGl() {
    let e = nGl.c(2);
    if (!SandboxManager.isSupportedPlatform()) {
      return null;
    }
    if (!SandboxManager.isSandboxEnabledInSettings()) {
      return null;
    }
    if (!SandboxManager.isPlatformInEnabledList()) {
      return null;
    }
    let t;
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = Symbol.for("react.early_return_sentinel");
      e: {
        let r = SandboxManager.checkDependencies();
        let o = r.errors.length > 0;
        let s = r.warnings.length > 0;
        if (!o && !s) {
          n = null;
          break e;
        }
        t = $we.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [$we.jsx(Bx, {
            title: "Sandbox",
            status: o ? "error" : "warning"
          }), $we.jsxs(ms, {
            variant: "tree",
            children: [r.errors.map(PGm), r.warnings.map(IGm), o && $we.jsxs(ms.Node, {
              dimColor: true,
              children: ["Run ", $we.jsx(Text, {
                color: "suggestion",
                children: "/sandbox"
              }), " for install instructions"]
            })]
          })]
        });
      }
      e[0] = t;
      e[1] = n;
    } else {
      t = e[0];
      n = e[1];
    }
    if (n !== Symbol.for("react.early_return_sentinel")) {
      return n;
    }
    return t;
  }
  function IGm(e, t) {
    return $we.jsx(ms.Node, {
      color: "warning",
      children: e
    }, t);
  }
  function PGm(e, t) {
    return $we.jsx(ms.Node, {
      color: "error",
      children: e
    }, t);
  }
  var nGl;
  var $we;
  var oGl = __lazy(() => {
    et();
    Th();
    $vt();
    Pse();
    nGl = __toESM(pt(), 1);
    $we = __toESM(ie(), 1);
  });
  function eD(e) {
    let t = sGl.c(2);
    let {
      url: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = Vir.jsxs(Text, {
        dimColor: true,
        children: ["Learn more: ", Vir.jsx(Link, {
          url: n
        })]
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  var sGl;
  var Vir;
  var die = __lazy(() => {
    et();
    sGl = __toESM(pt(), 1);
    Vir = __toESM(ie(), 1);
  });
  function zir(e) {
    let t = iGl.c(8);
    let {
      errors: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r;
    let o;
    let s;
    if (t[0] !== n) {
      let a = n.reduce(NGm, {});
      let l = Object.keys(a).sort();
      r = gXd;
      o = "column";
      s = l.map(c => {
        let u = a[c] || [];
        u.sort(MGm);
        let d = new Map();
        u.forEach(p => {
          if (p.suggestion || p.docLink) {
            let m = `${p.suggestion || ""}|${p.docLink || ""}`;
            if (!d.vZc(m)) {
              d.set(m, {
                suggestion: p.suggestion,
                docLink: p.docLink
              });
            }
          }
        });
        return E5.jsxs(gXd, {
          flexDirection: "column",
          children: [E5.jsx(Text, {
            children: c
          }), E5.jsx(ms, {
            variant: "tree",
            children: u.map(DGm)
          }), d.size > 0 && E5.jsx(gXd, {
            flexDirection: "column",
            marginTop: 1,
            children: Array.from(d.values()).map(OGm)
          })]
        }, c);
      });
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
    } else {
      r = t[1];
      o = t[2];
      s = t[3];
    }
    let i;
    if (t[4] !== r || t[5] !== o || t[6] !== s) {
      i = E5.jsx(r, {
        flexDirection: o,
        children: s
      });
      t[4] = r;
      t[5] = o;
      t[6] = s;
      t[7] = i;
    } else {
      i = t[7];
    }
    return i;
  }
  function OGm(e, t) {
    return E5.jsxs(gXd, {
      flexDirection: "column",
      marginBottom: 1,
      children: [e.suggestion && E5.jsx(Text, {
        dimColor: true,
        wrap: "wrap",
        children: e.suggestion
      }), e.docLink && E5.jsx(eD, {
        url: e.docLink
      })]
    }, `suggestion-pair-${t}`);
  }
  function DGm(e, t) {
    let n = LGm(e);
    return E5.jsx(ms.Node, {
      children: n ? E5.jsxs(Text, {
        children: [n, ": ", E5.jsx(Text, {
          dimColor: true,
          children: e.message
        })]
      }) : E5.jsx(Text, {
        dimColor: true,
        children: e.message
      })
    }, t);
  }
  function MGm(e, t) {
    if (!e.path && t.path) {
      return -1;
    }
    if (e.path && !t.path) {
      return 1;
    }
    return (e.path || "").localeCompare(t.path || "");
  }
  function NGm(e, t) {
    let n = t.file || "(file not specified)";
    if (!e[n]) {
      e[n] = [];
    }
    e[n].push(t);
    return e;
  }
  function LGm(e) {
    if (!e.path) {
      return null;
    }
    let t = e.path.split(".");
    let n = t[t.length - 1];
    if (e.invalidValue !== null && e.invalidValue !== undefined && n !== undefined && !isNaN(parseInt(n, 10))) {
      let r = typeof e.invalidValue === "string" ? `"${e.invalidValue}"` : String(e.invalidValue);
      return [...t.slice(0, -1), r].join(".");
    }
    return e.path;
  }
  var iGl;
  var E5;
  var Qqo = __lazy(() => {
    et();
    die();
    Pse();
    iGl = __toESM(pt(), 1);
    E5 = __toESM(ie(), 1);
  });
  function tD(e, t) {
    if (t <= 0) {
      return;
    }
    logForDebugging(`${t} setup ${un(t, "issue")}: ${e} (run /doctor for details)`, {
      level: "info"
    });