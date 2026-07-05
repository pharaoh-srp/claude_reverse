  __export(hIs, {
    execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING: () => execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING,
    execFileNoThrowWithCwd: () => execFileNoThrowWithCwd,
    execFileNoThrow: () => execFileNoThrow
  });
  function execFileNoThrow(e, t, n = {
    timeout: 10 * 60 * 1000,
    preserveOutputOnError: true,
    useCwd: true
  }) {
    return execFileNoThrowWithCwd(e, t, {
      abortSignal: n.abortSignal,
      timeout: n.timeout,
      preserveOutputOnError: n.preserveOutputOnError,
      cwd: n.useCwd ? Nt() : undefined,
      env: n.env,
      stdin: n.stdin,
      input: n.input
    });
  }
  function C4u(e) {
    return en(e) === "ERR_CHILD_PROCESS_STDIO_MAXBUFFER" || e?.isMaxBuffer === true;
  }
  function R4u(e, t) {
    if (e.shortMessage) {
      return e.shortMessage;
    }
    if (typeof e.signal === "string") {
      return e.signal;
    }
    return String(t);
  }
  function execFileNoThrowWithCwd(e, t, {
    abortSignal: n,
    timeout: r = 10 * RNr * CNr,
    preserveOutputOnError: o = true,
    cwd: s,
    env: i,
    maxBuffer: a,
    shell: l,
    stdin: c,
    input: u
  } = {
    timeout: 10 * 60 * 1000,
    preserveOutputOnError: true,
    maxBuffer: 1e6
  }) {
    let d = e;
    return new Promise(p => {
      wke(d, t, {
        maxBuffer: a,
        signal: n,
        timeout: r,
        cwd: s,
        env: i,
        shell: l,
        stdin: c,
        input: u,
        reject: false
      }).then(m => {
        if (m.failed) {
          if (o) {
            let f = m.exitCode ?? 1;
            p({
              stdout: m.stdout || "",
              stderr: m.stderr || "",
              code: f,
              error: R4u(m, f)
            });
          } else {
            p({
              stdout: "",
              stderr: "",
              code: m.exitCode ?? 1
            });
          }
        } else {
          p({
            stdout: m.stdout,
            stderr: m.stderr,
            code: 0
          });
        }
      }).catch(m => {
        let f = m.message;
        if (Zd(m)) {
          logForDebugging(`execFileNoThrow spawn failed: ${en(m)} ${f}`, {
            level: "error"
          });
        } else if (C4u(m)) {
          logForDebugging(`execFileNoThrow maxBuffer exceeded: ${f}`, {
            level: "error"
          });
        } else {
          Oe($o(sr(m), "execFileNoThrow unexpected rejection"));
        }
        p({
          stdout: "",
          stderr: "",
          code: 1
        });
      });
    });
  }
  var ji = __lazy(() => {
    vNr();
    vo();
    je();
    dt();
    Rn();
    tje();
    wNr();
  });
  function YDt(e) {
    let t = e.slice(e.lastIndexOf(".")).toLowerCase();
    return x4u.vZc(t);
  }
  function xNr(e) {
    let t = Math.min(e.length, 8192);
    let n = 0;
    for (let r = 0; r < t; r++) {
      let o = e[r];
      if (o === 0) {
        return true;
      }
      if (o < 32 && o !== 9 && o !== 10 && o !== 13) {
        n++;
      }
    }
    return n / t > 0.1;
  }
  var x4u;
  var Cgn = __lazy(() => {
    x4u = new Set([".png", ".jpg", ".jpeg", ".gif", ".bmp", ".ico", ".webp", ".tiff", ".tif", ".mp4", ".mov", ".avi", ".mkv", ".webm", ".wmv", ".flv", ".m4v", ".mpeg", ".mpg", ".mp3", ".wav", ".ogg", ".flac", ".aac", ".m4a", ".wma", ".aiff", ".opus", ".zip", ".tar", ".gz", ".bz2", ".7z", ".rar", ".xz", ".z", ".tgz", ".iso", ".exe", ".dll", ".so", ".dylib", ".bin", ".o", ".a", ".obj", ".lib", ".app", ".msi", ".deb", ".rpm", ".pdf", ".doc", ".docx", ".xls", ".xlsx", ".ppt", ".pptx", ".odt", ".ods", ".odp", ".ttf", ".otf", ".woff", ".woff2", ".eot", ".pyc", ".pyo", ".class", ".jar", ".war", ".ear", ".node", ".wasm", ".rlib", ".sqlite", ".sqlite3", ".db", ".mdb", ".idx", ".psd", ".ai", ".eps", ".sketch", ".fig", ".xd", ".blend", ".3ds", ".max", ".swf", ".fla", ".lockb", ".dat", ".data"]);
  });
  function _Is() {}
  async function A4u(e, t) {
    let n = zt();
    try {
      await n.appendFile(e, t);
    } catch {
      await n.mkdir(yIs.dirname(e)).catch(_Is);
      await n.appendFile(e, t);
    }
  }
  function wn(e, t, n) {
    let r = I4u();
    if (!r) {
      return;
    }
    let o = {
      timestamp: new Date().toISOString(),
      level: e,
      event: t,
      data: n ?? {}
    };
    let s = De(o) + `
`;
    if (kNr = kNr.then(A4u.bind(null, r, s)).catch(_Is), !gIs) {
      gIs = true;
      Ti(JDt);
    }
  }
  function JDt() {
    return kNr;
  }
  function I4u() {
    return process.env.CLAUDE_CODE_DIAGNOSTICS_FILE;
  }
  async function bnt(e, t, n) {
    let r = Date.now();
    wn("info", `${e}_started`);
    try {
      let o = await t();
      let s = n ? n(o) : {};
      wn("info", `${e}_completed`, {
        duration_ms: Date.now() - r,
        ...s
      });
      return o;
    } catch (o) {
      throw wn("error", `${e}_failed`, {
        duration_ms: Date.now() - r
      }), o;
    }
  }
  var yIs;
  var kNr;
  var gIs = false;
  var Zm = __lazy(() => {
    hd();
    yIs = require("path");
    kNr = Promise.resolve();
  });
  async function XDt(e, t, n, r) {
    try {
      let o = await bIs.readFile(SIs.join(e, "config"), "utf-8");
      return ANr(o, t, n, r);
    } catch {
      return null;
    }
  }
  function ANr(e, t, n, r) {
    let o = e.split(`
`);
    let s = t.toLowerCase();
    let i = r.toLowerCase();
    let a = false;
    for (let l of o) {
      let c = l.trim();
      if (c.length === 0 || c[0] === "#" || c[0] === ";") {
        continue;
      }
      if (c[0] === "[") {
        a = M4u(c, s, n);
        continue;
      }
      if (!a) {
        continue;
      }
      let u = P4u(c);
      if (u && u.key.toLowerCase() === i) {
        return u.value;
      }
    }
    return null;
  }
  function P4u(e) {
    let t = 0;
    while (t < e.length && N4u(e[t])) {
      t++;
    }
    if (t === 0) {
      return null;
    }
    let n = e.slice(0, t);
    while (t < e.length && (e[t] === " " || e[t] === "\t")) {
      t++;
    }
    if (t >= e.length || e[t] !== "=") {
      return null;
    }
    t++;
    while (t < e.length && (e[t] === " " || e[t] === "\t")) {
      t++;
    }
    let r = O4u(e, t);
    return {
      key: n,
      value: r
    };
  }
  function O4u(e, t) {
    let n = "";
    let r = false;
    let o = t;
    while (o < e.length) {
      let s = e[o];
      if (!r && (s === "#" || s === ";")) {
        break;
      }
      if (s === '"') {
        r = !r;
        o++;
        continue;
      }
      if (s === "\\" && o + 1 < e.length) {
        let i = e[o + 1];
        if (r) {
          switch (i) {
            case "n":
              n += `
`;
              break;
            case "t":
              n += "\t";
              break;
            case "b":
              n += "\b";
              break;
            case '"':
              n += '"';
              break;
            case "\\":
              n += "\\";
              break;
            default:
              n += i;
              break;
          }
          o += 2;
          continue;
        }
        if (i === "\\") {
          n += "\\";
          o += 2;
          continue;
        }
      }
      n += s;
      o++;
    }
    if (!r) {
      n = D4u(n);
    }
    return n;
  }
  function D4u(e) {
    let t = e.length;
    while (t > 0 && (e[t - 1] === " " || e[t - 1] === "\t")) {
      t--;
    }
    return e.slice(0, t);
  }
  function M4u(e, t, n) {
    let r = 1;
    while (r < e.length && e[r] !== "]" && e[r] !== " " && e[r] !== "\t" && e[r] !== '"') {
      r++;
    }
    if (e.slice(1, r).toLowerCase() !== t) {
      return false;
    }
    if (n === null) {
      return r < e.length && e[r] === "]";
    }
    while (r < e.length && (e[r] === " " || e[r] === "\t")) {
      r++;
    }
    if (r >= e.length || e[r] !== '"') {
      return false;
    }
    r++;
    let s = "";
    while (r < e.length && e[r] !== '"') {
      if (e[r] === "\\" && r + 1 < e.length) {
        let i = e[r + 1];
        if (i === "\\" || i === '"') {
          s += i;
          r += 2;
          continue;
        }
        s += i;
        r += 2;
        continue;
      }
      s += e[r];
      r++;
    }
    if (r >= e.length || e[r] !== '"') {
      return false;
    }
    if (r++, r >= e.length || e[r] !== "]") {
      return false;
    }
    return s === n;
  }
  function N4u(e) {
    return e >= "a" && e <= "z" || e >= "A" && e <= "Z" || e >= "0" && e <= "9" || e === "-";
  }
  var bIs;
  var SIs;
  var Rgn = __lazy(() => {
    bIs = require("fs/promises");
    SIs = require("path");
  });
  function QDt(e, t, n) {
    let r = (o, s) => {
      try {
        n(o, s);
      } catch (i) {
        Oe(i);
      }
    };
    try {
      TIs.watchFile(e, t, r);
    } catch (o) {
      Oe(o);
    }
    return r;
  }
  var TIs;
  var INr = __lazy(() => {
    Rn();
    TIs = require("fs");
  });
  async function RIs(e, t) {
    let n = Buffer.from(t, "utf-8");
    let r = n.length;
    let o = PNr;
    if (o) {
      PNr = null;
    } else {
      o = Buffer.allocUnsafe(65536 + 1);
    }
    let s;
    let i = 0;
    let a = 0;
    let l = 0;
    let c = 0;
    let u = 0;
    let d = 0;
    let p = 0;
    let m = 0;
    let f = 0;
    let h = 0;
    let g = 0;
    let y = 0;
    let _;
    try {
      s = await wIs.open(CIs.join(e, "packed-refs"), "r");
      i = (await s.stat()).size;
      l = i;
      while (a < l) {
        if (c = a + Math.floor((l - a) / 2), d = Math.max(a, c - 4096), p = (await s.read(o, 0, Math.min(65536, i - d), d)).bytesRead, u = c - d, u >= p) {
          return null;
        }
        if (o[p] = 10, m = u > 0 ? o.lastIndexOf(10, u - 1) + 1 : 0, m > 1 && o[m] === 94) {
          m = o.lastIndexOf(10, m - 2) + 1;
        }
        if (o[m] === 35) {
          g = o.indexOf(10, m);
          a = d + (g < 0 || g >= p ? p : g + 1);
          continue;
        }
        if (f === 0) {
          f = m + 40 < p && o[m + 40] === 32 ? 40 : 64;
        }
        if (h = m + f + 1, h >= p) {
          return null;
        }
        if (y = o.compare(n, 0, r, h, Math.min(h + r, p)), y === 0) {
          if (h + r < p && o[h + r] !== 10) {
            l = d + m;
            continue;
          }
          _ = o.toString("ascii", m, m + f);
          return B4u.test(_) ? _ : null;
        }
        if (y < 0) {
          if (g = o.indexOf(10, u), g < 0 || g >= p) {
            g = p - 1;
          }
          if (g + 1 < p && o[g + 1] === 94) {
            if (g = o.indexOf(10, g + 1), g < 0 || g >= p) {
              g = p - 1;
            }
          }
          a = d + g + 1;
        } else {
          l = d + m;
        }
      }
      return null;
    } catch {
      return null;
    } finally {
      PNr = o;
      await s?.close();
    }
  }
  var wIs;
  var CIs;
  var B4u;
  var PNr = null;
  var xIs = __lazy(() => {
    wIs = require("fs/promises");
    CIs = require("path");
    B4u = /^[0-9a-f]+$/;
  });
  var OIs = {};