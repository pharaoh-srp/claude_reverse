  __export(Aks, {
    resolveExecutableSafely: () => resolveExecutableSafely,
    isCommandAvailableSafely: () => isCommandAvailableSafely,
    findExecutableWindows: () => findExecutableWindows
  });
  function Equ() {
    return false;
  }
  function Cks(e) {
    try {
      return xks.lstatSync(e, {
        throwIfNoEntry: false
      }) === undefined;
    } catch {
      return false;
    }
  }
  function Cqu(e) {
    let t = e.toLowerCase().replace(/.*[\\/]/, "").replace(/[. ]+$/, "");
    let n = t.lastIndexOf(".");
    return n > 0 && wqu.vZc(t.slice(n));
  }
  function findExecutableWindows(e, t = false) {
    let n = int.get(e);
    if (n !== undefined) {
      if (n !== null) {
        if (!Cks(n)) {
          return n;
        }
        int.delete(e);
      } else {
        if (!t) {
          return n;
        }
        int.delete(e);
      }
    }
    let r = process.env.SYSTEMROOT || "C:\\Windows";
    let o = kks.join(r, "System32", "where.exe");
    try {
      let i = Rks.execFileSync(o, [e], {
        stdio: "pipe",
        encoding: "utf8",
        timeout: 5000,
        windowsHide: true,
        env: process.env
      }).trim().split(/\r?\n/).filter(Boolean);
      let a = process.cwd();
      let l = false;
      for (let c of i) {
        if (Cks(c)) {
          continue;
        }
        if (Yln(c, a)) {
          l = true;
          continue;
        }
        if (!Cqu(c)) {
          continue;
        }
        int.set(e, c);
        return c;
      }
      if (i.length > 0 && !l) {
        int.set(e, null);
      }
      return null;
    } catch (s) {
      if (Rqu(s)) {
        int.set(e, null);
      }
      return null;
    }
  }
  function Rqu(e) {
    if (e === null || typeof e !== "object") {
      return false;
    }
    let t = "status" in e ? e.status : undefined;
    let n = "signal" in e ? e.signal : undefined;
    let r = "code" in e ? e.code : undefined;
    return t === 1 && !n && !r;
  }
  function resolveExecutableSafely(e, t = false) {
    if (!Equ()) {
      return e;
    }
    if (e.includes("/") || e.includes("\\")) {
      return e;
    }
    return findExecutableWindows(e, t);
  }
  function isCommandAvailableSafely(e) {
    return resolveExecutableSafely(e) !== null;
  }
  var Rks;
  var xks;
  var kks;
  var int;
  var wqu;
  var tje = __lazy(() => {
    mm();
    Rks = require("child_process");
    xks = require("fs");
    kks = require("path");
    int = new Map();
    wqu = new Set([".com", ".exe", ".bat", ".cmd"]);
  });
  function Xhn() {
    if (Wt() === "windows") {
      let e = Cye();
      if (e) {
        process.env.SHELL = e;
        logForDebugging(`Using bash path: "${e}"`);
      } else {
        logForDebugging("Git Bash not found; BashTool will be unavailable");
      }
    }
  }
  function Qhn(e, t) {
    if (!hke.isAbsolute(t)) {
      return;
    }
    let n = hke.dirname(t);
    let r = Object.keys(e).find(s => s.toUpperCase() === "PATH") ?? "PATH";
    let o = e[r];
    e[r] = o ? n + hke.delimiter + o : n;
  }
  function Zhn(e) {
    let t = e.trim();
    let n = "";
    let r = 0;
    while (r < t.length) {
      let o = t[r];
      if (o === '"' || o === "'") {
        let s = t.indexOf(o, r + 1);
        if (s === -1) {
          n += t.slice(r + 1);
          r = t.length;
          break;
        }
        n += t.slice(r + 1, s);
        r = s + 1;
      } else if (o === "\\" && r + 1 < t.length) {
        n += t[r + 1];
        r += 2;
      } else if (/\s/.test(o)) {
        break;
      } else {
        n += o;
        r++;
      }
    }
    return n.endsWith(".sh") ? `bash ${e}` : e;
  }
  var hke;
  var Cye;
  var UD;
  var nje;
  var wj = __lazy(() => {
    je();
    nW();
    Cs();
    tje();
    hke = __toESM(require("path/win32"));
    Cye = TEr(() => {
      let {
        existsSync: e
      } = zt();
      if (process.env.CLAUDE_CODE_GIT_BASH_PATH) {
        if (e(process.env.CLAUDE_CODE_GIT_BASH_PATH)) {
          return process.env.CLAUDE_CODE_GIT_BASH_PATH;
        }
        console.error(`Claude Code was unable to find CLAUDE_CODE_GIT_BASH_PATH path "${process.env.CLAUDE_CODE_GIT_BASH_PATH}"`);
        process.exit(1);
      }
      let t = ["C:\\Program Files\\Git\\bin\\bash.exe", "C:\\Program Files (x86)\\Git\\bin\\bash.exe"];
      for (let r of t) {
        if (e(r)) {
          return r;
        }
      }
      let n = findExecutableWindows("git");
      if (n) {
        let r = hke.join(n, "..", "..", "bin", "bash.exe");
        if (e(r)) {
          return r;
        }
      }
      return null;
    });
    UD = mk(e => {
      if (e.startsWith("\\\\")) {
        return e.replaceAll("\\", "/");
      }
      let t = e.match(/^([A-Za-z]):[/\\]/);
      if (t) {
        return "/" + t[1].toLowerCase() + e.slice(2).replaceAll("\\", "/");
      }
      return e.replaceAll("\\", "/");
    }, e => e, 500);
    nje = mk(e => {
      if (e.startsWith("//")) {
        return e.replaceAll("/", "\\");
      }
      let t = e.match(/^\/cygdrive\/([A-Za-z])(\/|$)/);
      if (t) {
        let r = t[1].toUpperCase();
        let o = e.slice(("/cygdrive/" + t[1]).length);
        return r + ":" + (o || "\\").replaceAll("/", "\\");
      }
      let n = e.match(/^\/([A-Za-z])(\/|$)/);
      if (n) {
        let r = n[1].toUpperCase();
        let o = e.slice(2);
        return r + ":" + (o || "\\").replaceAll("/", "\\");
      }
      return e.replaceAll("/", "\\");
    }, e => e, 500);
  });
  function rje(e, t) {
    if (e.type !== "user") {
      return;
    }
    if (e.isMeta === true || e.isCompactSummary === true) {
      return;
    }
    let n = e.message;
    if (!n) {
      return;
    }
    let r = n.content;
    let o = [];
    if (typeof r === "string") {
      o.push(r);
    } else if (Array.isArray(r)) {
      for (let s of r) {
        if (!s || typeof s !== "object") {
          continue;
        }
        if (s.type === "tool_result") {
          return;
        }
        if (s.type === "text" && typeof s.text === "string") {
          o.push(s.text);
        }
      }
    }
    for (let s of o) {
      let i = s.replaceAll(`
`, " ").trim();
      if (!i) {
        continue;
      }
      let a = Aqu.exec(i);
      if (a) {
        if (!t.commandFallback) {
          t.commandFallback = a[1];
        }
        continue;
      }
      let l = /<bash-input>([\s\S]*?)<\/bash-input>/.exec(i);
      if (l) {
        return `! ${l[1].trim()}`;
      }
      if (kqu.test(i)) {
        continue;
      }
      if (i.length > 200) {
        i = i.slice(0, 200).trim() + "\u2026";
      }
      return i;
    }
    return;
  }
  var kqu;
  var Aqu;
  var egn = __lazy(() => {
    kqu = /^(?:\s*<[a-z][\w-]*[\s>]|\[Request interrupted by user[^\]]*\])/;
    Aqu = /<command-name>(.*?)<\/command-name>/;
  });
  async function B6(e) {
    let t = resolveExecutableSafely("git");
    if (t === null) {
      return [];
    }
    try {
      let {
        stdout: n
      } = await Iqu(t, ["worktree", "list", "--porcelain"], {
        cwd: e,
        timeout: 5000,
        windowsHide: true
      });
      if (!n) {
        return [];
      }
      return n.split(`
`).filter(r => r.startsWith("worktree ")).map(r => r.slice(9));
    } catch {
      return [];
    }
  }
  var Iks;
  var Pks;
  var Iqu;
  var oje = __lazy(() => {
    mm();
    tje();
    Iks = require("child_process");
    Pks = require("util");
    Iqu = Pks.promisify(Iks.execFile);
  });
  function Nks(e, t) {
    let n = rW(e, "entrypoint") ?? rS(t, "entrypoint");
    if (n && rgn.vZc(n)) {
      return true;
    }
    let r = e.split(`
`).find(s => s.includes('"parentUuid":')) ?? e;
    let o = rW(r, "sessionKind");
    return o === "daemon" || o === "daemon-worker";
  }
  function QS(e) {
    if (typeof e !== "string") {
      return null;
    }
    return Pqu.test(e) ? e : null;
  }
  function Lks(e) {
    if (!e.includes("\\")) {
      return e;
    }
    try {
      return JSON.parse(`"${e}"`);
    } catch {
      return e;
    }
  }
  function rW(e, t) {
    let n = [`"${t}":"`, `"${t}": "`];
    for (let r of n) {
      let o = e.indexOf(r);
      if (o < 0) {
        continue;
      }
      let s = o + r.length;
      let i = s;
      while (i < e.length) {
        if (e[i] === "\\") {
          i += 2;
          continue;
        }
        if (e[i] === '"') {
          return Lks(e.slice(s, i));
        }
        i++;
      }
    }
    return;
  }
  function rS(e, t) {
    let n = [`"${t}":"`, `"${t}": "`];
    let r;
    let o = -1;
    for (let s of n) {
      let i = 0;
      while (true) {
        let a = e.indexOf(s, i);
        if (a < 0) {
          break;
        }
        let l = a + s.length;
        let c = l;
        while (c < e.length) {
          if (e[c] === "\\") {
            c += 2;
            continue;
          }
          if (e[c] === '"') {
            if (a > o) {
              r = Lks(e.slice(l, c));
              o = a;
            }
            break;
          }
          c++;
        }
        i = c + 1;
      }
    }
    return r;
  }
  function BDt(e, t, n) {
    let r = `"type":"${t}"`;
    let o = `"${n}":`;
    let s = e.length;
    while (s > 0) {
      let i = e.lastIndexOf(`
`, s - 1);
      let a = e.slice(i + 1, s);
      if (s = i, a.includes(r) && a.includes(o)) {
        try {
          let l = JSON.parse(a);
          if (typeof l === "object" && l !== null && l.type === t) {
            let c = l[n];
            if (typeof c === "string") {
              return c;
            }
          }
        } catch {}
      }
      if (i < 0) {
        break;
      }
    }
    return;
  }
  async function Rye(e, t) {
    return Uks(e, t, "w");
  }
  async function Fks(e, t) {
    return Uks(e, t, "a");
  }
  async function Uks(e, t, n) {
    let r = Dks.createWriteStream(e, {
      mode: 384,
      flags: n
    });
    try {
      for (let o of t) {
        if (!r.write(JSON.stringify(o) + `
`)) {
          await FMr.once(r, "drain");
        }
      }
      r.end();
      await FMr.once(r, "finish");
    } catch (o) {
      throw r.destroy(), o;
    }
  }
  function ogn(e) {
    let t = 0;
    let n = {
      commandFallback: ""
    };
    while (t < e.length) {
      let r = e.indexOf(`
`, t);
      let o = r >= 0 ? e.slice(t, r) : e.slice(t);
      if (t = r >= 0 ? r + 1 : e.length, !o.includes('"type":"user"') && !o.includes('"type": "user"')) {
        continue;
      }
      if (o.includes('"tool_result"')) {
        continue;
      }
      if (o.includes('"isMeta":true') || o.includes('"isMeta": true')) {
        continue;
      }
      if (o.includes('"isCompactSummary":true') || o.includes('"isCompactSummary": true')) {
        continue;
      }
      try {
        let s = JSON.parse(o);
        let i = rje(s, n);
        if (i !== undefined) {
          return i;
        }
      } catch {
        continue;
      }
    }
    return n.commandFallback;
  }
  function Bks(e) {
    let t = {
      commandFallback: ""
    };
    for (let n of e) {
      if (typeof n !== "object" || n === null) {
        continue;
      }
      let r = rje(n, t);
      if (r !== undefined) {
        return r;
      }
    }
    return t.commandFallback;
  }
  async function $ks(e, t, n) {
    try {
      let r = await tF.open(e, "r");
      try {
        let o = await r.read(n, 0, 65536, 0);
        if (o.bytesRead === 0) {
          return {
            head: "",
            tail: ""
          };
        }
        let s = n.toString("utf8", 0, o.bytesRead);
        let i = Math.max(0, t - 65536);
        let a = s;
        if (i > 0) {
          let l = await r.read(n, 0, 65536, i);
          a = n.toString("utf8", 0, l.bytesRead);
        }
        return {
          head: s,
          tail: a
        };
      } finally {
        await r.close();
      }
    } catch {
      return {
        head: "",
        tail: ""
      };
    }
  }
  async function Oqu(e) {
    try {
      if (!(await tF.lstat(e)).isFile()) {
        return false;
      }
    } catch (n) {
      return !(n && typeof n === "object" && "code" in n && n.code === "ENOENT");
    }
    let t;
    try {
      t = await tF.open(e, "r");
    } catch (n) {
      return !(n && typeof n === "object" && "code" in n && n.code === "ENOENT");
    }
    try {
      let n = Mks.createInterface({
        input: t.createReadStream()
      });
      for await (let r of n) {
        if (r.includes('"type":"user"') || r.includes('"type":"assistant"')) {
          n.close();
          return true;
        }
      }
      return false;
    } catch {
      return true;
    } finally {
      await t.close().catch(() => {});
    }
  }
  async function ije(e) {
    let t = `${e.endsWith(".jsonl") ? e.slice(0, -6) : e}.orphaned-${Date.now()}-${Oks.randomUUID().slice(0, 8)}.jsonl`;
    try {
      await tF.rename(e, t);
      return true;
    } catch {
      return false;
    }
  }
  async function mle(e, t, n) {
    let r = await YE(t);
    if (QS(e) === null) {
      return {
        path: tY.join(Cj(r), "invalid-resume-id.jsonl"),
        hasMessages: false,
        via: "computed"
      };
    }
    let o = tY.join(Cj(r), `${e}.jsonl`);
    let s = [];
    if (n !== undefined) {
      s.push(n.endsWith(`${e}.jsonl`) ? {
        path: n,
        via: "linkScanPath"
      } : {
        path: tY.join(tY.dirname(n), `${e}.jsonl`),
        via: "linkScanDir"
      });
    }
    for (let a of await jA(r)) {
      s.push({
        path: tY.join(a, `${e}.jsonl`),
        via: "projectDir"
      });
    }
    s.push({
      path: o,
      via: "computed"
    });
    let i = new Set();
    for (let a of s) {
      if (i.vZc(a.path)) {
        continue;
      }
      if (i.add(a.path), await Oqu(a.path)) {
        return {
          ...a,
          hasMessages: true
        };
      }
    }
    return {
      ...s[0],
      hasMessages: false
    };
  }
  async function sgn(e) {
    try {
      let t = await tF.open(e, "r");
      try {
        let n = await t.stat();
        let r = Buffer.allocUnsafe(65536);
        let o = await t.read(r, 0, 65536, 0);
        if (o.bytesRead === 0) {
          return null;
        }
        let s = r.toString("utf8", 0, o.bytesRead);
        let i = Math.max(0, n.size - 65536);
        let a = s;
        if (i > 0) {
          let l = await t.read(r, 0, 65536, i);
          a = r.toString("utf8", 0, l.bytesRead);
        }
        return {
          mtime: n.mtime.getTime(),
          size: n.size,
          head: s,
          tail: a
        };
      } finally {
        await t.close();
      }
    } catch {
      return null;
    }
  }
  function Dqu(e) {
    return Math.abs(ike(e)).toString(36);
  }
  function $T(e) {
    let t = e.replace(/[^a-zA-Z0-9]/g, "-");
    if (t.length <= 200) {
      return t;
    }
    return `${t.slice(0, 200)}-${Dqu(e)}`;
  }
  function nF() {
    return tY.join(er(), "projects");
  }
  function Cj(e) {
    return tY.join(nF(), $T(e));
  }
  async function YE(e) {
    try {
      return await tF.realpath(e);
    } catch {
      return e;
    }
  }
  async function jA(e) {
    let t = Cj(e);
    let n = [];
    try {
      await tF.readdir(t);
      n.push(t);
    } catch {}
    let r = $T(e);
    if (r.length <= 200) {
      return n;
    }
    let o = r.slice(0, 200) + "-";
    let s = nF();
    try {
      for (let i of await tF.readdir(s, {
        withFileTypes: true
      })) {
        if (!i.isDirectory() || !i.name.startsWith(o)) {
          continue;
        }
        let a = tY.join(s, i.name);
        if (a !== t) {
          n.push(a);
        }
      }
    } catch {}
    return n;
  }
  async function Hks(e) {
    return (await jA(e))[0];
  }
  async function gke(e, t) {
    let n = `${e}.jsonl`;
    async function r(i, a) {
      let l = tY.join(i, n);
      try {
        let c = await tF.stat(l);
        if (c.size > 0) {
          return {
            filePath: l,
            projectPath: a,
            fileSize: c.size
          };
        }
      } catch {}
      return;
    }
    if (t) {
      let i = await YE(t);
      for (let l of await jA(i)) {
        let c = await r(l, i);
        if (c) {
          return c;
        }
      }
      let a;
      try {
        a = await B6(i);
      } catch {
        a = [];
      }
      for (let l of a) {
        if (l === i) {
          continue;
        }
        for (let c of await jA(l)) {
          let u = await r(c, l);
          if (u) {
            return u;
          }
        }
      }
      return;
    }
    let o = nF();
    let s;
    try {
      s = await tF.readdir(o);
    } catch {
      return;
    }
    for (let i of s) {
      let a = await r(tY.join(o, i), undefined);
      if (a) {
        return a;
      }
    }
    return;
  }
  function Lqu() {
    return Nqu ??= Buffer.from('"compact_boundary"');
  }
  function jks(e) {
    try {
      let t = JSON.parse(e);
      if (t.type !== "system" || t.subtype !== "compact_boundary") {
        return null;
      }
      return {
        hasPreservedSegment: Boolean(t.compactMetadata?.preservedSegment || t.compactMetadata?.preservedMessages)
      };
    } catch {
      return null;
    }
  }
  function sje(e, t, n, r) {
    let o = r - n;
    if (o <= 0) {
      return;
    }
    if (e.len + o > e.buf.length) {
      let s = Buffer.allocUnsafe(Math.min(Math.max(e.buf.length * 2, e.len + o), e.cap));
      e.buf.copy(s, 0, 0, e.len);
      e.buf = s;
    }
    t.copy(e.buf, e.len, n, r);
    e.len += o;
  }
  function tgn(e, t, n, r) {
    return r - n >= t.length && e.compare(t, 0, t.length, n, n + t.length) === 0;
  }
  function $qu(e, t, n) {
    if (e.straddleSnapCarryLen = 0, e.straddleSnapTailEnd = 0, e.carryLen === 0) {
      return 0;
    }
    let r = e.carryBuf;
    let o = t.indexOf(10);
    if (o === -1 || o >= n) {
      return 0;
    }
    let s = o + 1;
    if (tgn(r, ngn, 0, e.carryLen)) {
      e.straddleSnapCarryLen = e.carryLen;
      e.straddleSnapTailEnd = s;
      e.lastSnapSrc = null;
    } else if (e.carryLen < ngn.length) {
      return 0;
    } else {
      if (tgn(r, Fqu, 0, e.carryLen)) {
        let i = jks(r.toString("utf-8", 0, e.carryLen) + t.toString("utf-8", 0, o));
        if (i?.hasPreservedSegment) {
          e.hasPreservedSegment = true;
        } else if (i) {
          e.out.len = 0;
          e.boundaryStartOffset = e.bufFileOff;
          e.hasPreservedSegment = false;
          e.lastSnapSrc = null;
        }
      }
      sje(e.out, r, 0, e.carryLen);
      sje(e.out, t, 0, s);
    }
    e.bufFileOff += e.carryLen + s;
    e.carryLen = 0;
    return s;
  }
  function Hqu(e, t, n) {
    let r = t.indexOf(n);
    let o = 0;
    let s = 0;
    let i = -1;
    let a = -1;
    let l = t.indexOf(10);
    while (l !== -1) {
      let c = l + 1;
      if (r !== -1 && r < s) {
        r = t.indexOf(n, s);
      }
      if (tgn(t, ngn, s, c)) {
        sje(e.out, t, o, s);
        i = s;
        a = c;
        o = c;
      } else if (r >= s && r < Math.min(s + 256, c)) {
        let u = jks(t.toString("utf-8", s, l));
        if (u?.hasPreservedSegment) {
          e.hasPreservedSegment = true;
        } else if (u) {
          e.out.len = 0;
          e.boundaryStartOffset = e.bufFileOff + s;
          e.hasPreservedSegment = false;
          e.lastSnapSrc = null;
          i = -1;
          e.straddleSnapCarryLen = 0;
          o = s;
        }
        r = t.indexOf(n, r + n.length);
      }
      s = c;
      l = t.indexOf(10, s);
    }
    sje(e.out, t, o, s);
    return {
      lastSnapStart: i,
      lastSnapEnd: a,
      trailStart: s
    };
  }
  function jqu(e, t, n, r, o) {
    if (r !== -1) {
      if (e.lastSnapLen = o - r, e.lastSnapBuf === undefined || e.lastSnapLen > e.lastSnapBuf.length) {
        e.lastSnapBuf = Buffer.allocUnsafe(e.lastSnapLen);
      }
      t.copy(e.lastSnapBuf, 0, r, o);
      e.lastSnapSrc = e.lastSnapBuf;
    } else if (e.straddleSnapCarryLen > 0) {
      if (e.lastSnapLen = e.straddleSnapCarryLen + e.straddleSnapTailEnd, e.lastSnapBuf === undefined || e.lastSnapLen > e.lastSnapBuf.length) {
        e.lastSnapBuf = Buffer.allocUnsafe(e.lastSnapLen);
      }
      e.carryBuf.copy(e.lastSnapBuf, 0, 0, e.straddleSnapCarryLen);
      n.copy(e.lastSnapBuf, e.straddleSnapCarryLen, 0, e.straddleSnapTailEnd);
      e.lastSnapSrc = e.lastSnapBuf;
    }
  }
  function qqu(e, t, n) {
    if (e.carryLen = t.length - n, e.carryLen > 0) {
      if (e.carryBuf === undefined || e.carryLen > e.carryBuf.length) {
        e.carryBuf = Buffer.allocUnsafe(e.carryLen);
      }
      t.copy(e.carryBuf, 0, n, t.length);
    }
  }
  function Wqu(e) {
    if (e.carryLen > 0) {
      let t = e.carryBuf;
      if (tgn(t, ngn, 0, e.carryLen)) {
        e.lastSnapSrc = t;
        e.lastSnapLen = e.carryLen;
      } else {
        sje(e.out, t, 0, e.carryLen);
      }
    }
    if (e.lastSnapSrc) {
      if (e.out.len > 0 && e.out.buf[e.out.len - 1] !== 10) {
        sje(e.out, Uqu, 0, 1);
      }
      sje(e.out, e.lastSnapSrc, 0, e.lastSnapLen);
    }
  }
  async function ign(e, t) {
    let n = Lqu();
    let r = 1048576;
    let o = {
      out: {
        buf: Buffer.allocUnsafe(Math.min(t, 8388608)),
        len: 0,
        cap: t + 1
      },
      boundaryStartOffset: 0,
      hasPreservedSegment: false,
      lastSnapSrc: null,
      lastSnapLen: 0,
      lastSnapBuf: undefined,
      bufFileOff: 0,
      carryLen: 0,
      carryBuf: undefined,
      straddleSnapCarryLen: 0,
      straddleSnapTailEnd: 0
    };
    let s = Buffer.allocUnsafe(r);
    let i = await tF.open(e, "r");
    try {
      let a = 0;
      while (a < t) {
        let {
          bytesRead: l
        } = await i.read(s, 0, Math.min(r, t - a), a);
        if (l === 0) {
          break;
        }
        a += l;
        let c = $qu(o, s, l);
        let u;
        if (o.carryLen > 0) {
          let p = o.carryLen + (l - c);
          u = Buffer.allocUnsafe(p);
          o.carryBuf.copy(u, 0, 0, o.carryLen);
          s.copy(u, o.carryLen, c, l);
        } else {
          u = s.subarray(c, l);
        }
        let d = Hqu(o, u, n);
        jqu(o, u, s, d.lastSnapStart, d.lastSnapEnd);
        qqu(o, u, d.trailStart);
        o.bufFileOff += d.trailStart;
      }
      Wqu(o);
    } finally {
      await i.close();
    }
    return {
      boundaryStartOffset: o.boundaryStartOffset,
      postBoundaryBuf: o.out.buf.subarray(0, o.out.len),
      hasPreservedSegment: o.hasPreservedSegment
    };
  }
  var Oks;
  var FMr;
  var Dks;
  var tF;
  var tY;
  var Mks;
  var rgn;
  var Pqu;
  var Nqu;
  var ngn;
  var Fqu;
  var Uqu;
  var ZS = __lazy(() => {
    mm();
    gn();
    egn();
    oje();
    Oks = require("crypto");
    FMr = require("events");
    Dks = require("fs");
    tF = require("fs/promises");
    tY = require("path");
    Mks = require("readline");
    rgn = new Set(["sdk-cli", "sdk-ts", "sdk-py"]);
    Pqu = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$/i;
    ngn = Buffer.from('{"type":"attribution-snapshot"');
    Fqu = Buffer.from('{"type":"system"');
    Uqu = Buffer.from([10]);
  });
  function us(e, t) {
    let n = t ?? Nt() ?? zt().cwd();
    if (typeof e !== "string") {
      throw TypeError(`Path must be a string, received ${typeof e}`);
    }
    if (typeof n !== "string") {
      throw TypeError(`Base directory must be a string, received ${typeof n}`);
    }
    if (e.includes("\x00") || n.includes("\x00")) {
      throw Error("Path contains null bytes");
    }
    let r = e.trim();
    if (!r) {
      return rF.normalize(n);
    }
    if (r === "~") {
      return agn.homedir();
    }
    if (r.startsWith("~/")) {
      return rF.join(agn.homedir(), r.slice(2));
    }
    let o = r;
    if (Wt() === "windows" && r.match(/^\/[a-z]\//i)) {
      try {
        o = nje(r);
      } catch {
        o = r;
      }
    }
    if (rF.isAbsolute(o)) {
      return rF.normalize(o);
    }
    return rF.resolve(n, o);
  }
  function lnt(e) {
    let t = rF.relative(Nt(), e);
    return t.startsWith("..") ? e : t;
  }
  function YB(e) {
    let t = us(e);
    if (t.startsWith("\\\\") || t.startsWith("//")) {
      return rF.dirname(t);
    }
    try {
      if (zt().statSync(t).isDirectory()) {
        return t;
      }
    } catch {}
    return rF.dirname(t);
  }
  function fle(e) {
    return /(?:^|[\\/])\.\.(?:[\\/]|$)/.test(e);
  }
  function LN(e) {
    let t = agn.homedir();
    if (e === t) {
      return "~";
    }
    if (e.startsWith(t + rF.sep)) {
      return "~" + e.slice(t.length);
    }
    return e;
  }
  function $6(e) {
    let t = rF.normalize(e);
    if (Wt() === "windows") {
      return t.replaceAll("\\", "/");
    }
    return t;
  }
  var agn;
  var rF;
  var ku = __lazy(() => {
    mm();
    vo();
    Cs();
    wj();
    ZS();
    agn = require("os");
    rF = require("path");
  });