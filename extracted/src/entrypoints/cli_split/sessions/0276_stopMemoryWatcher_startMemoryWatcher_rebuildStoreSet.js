  __export(cMa, {
    toInfraSessionId: () => toInfraSessionId,
    toCompatSessionId: () => toCompatSessionId,
    setCseShimGate: () => setCseShimGate,
    remoteRowId: () => remoteRowId
  });
  function setCseShimGate(e) {
    fyo = e;
  }
  function toCompatSessionId(e) {
    if (!e.startsWith("cse_")) {
      return e;
    }
    if (fyo && !fyo()) {
      return e;
    }
    return "session_" + e.slice(4);
  }
  function remoteRowId(e) {
    return `remote-${e.slice(-8)}`;
  }
  function toInfraSessionId(e) {
    if (!e.startsWith("session_")) {
      return e;
    }
    return "cse_" + e.slice(8);
  }
  var fyo;
  function yyo(e) {
    let t = gyo;
    gyo = e;
    Cpi(xNp() ?? null).catch(() => {});
    let n = t !== null && !t.outboundOnly;
    let r = e !== null && !e.outboundOnly;
    if (n !== r || n && r && t?.bridgeSessionId !== e?.bridgeSessionId) {
      Une();
    }
  }
  function vS() {
    return gyo;
  }
  function xNp() {
    let e = vS();
    return e ? toCompatSessionId(e.bridgeSessionId) : undefined;
  }
  var gyo = null;
  var x$ = __lazy(() => {
    yd();
    Xit();
  });
  function kNp(e, t) {
    return e?.includes("_staging_") === true || t?.includes("staging") === true;
  }
  function QGt(e, t) {
    return e?.includes("_local_") === true || t?.includes("localhost") === true;
  }
  function ZGt(e, t) {
    if (QGt(e, t)) {
      return "http://localhost:4000";
    }
    if (kNp(e, t)) {
      return "https://claude-ai.staging.ant.dev";
    }
    return "https://claude.ai";
  }
  function wS(e, t, n) {
    let {
      toCompatSessionId: r
    } = __toCommonJS(cMa);
    let o = r(e);
    let i = `${ZGt(o, t)}/code/${o}`;
    return n ? `${i}?${new URLSearchParams(n)}` : i;
  }
  function R3n(e) {
    let t = [{
      frac: e.sizeBytes / e.byteCap,
      over: e.sizeBytes >= e.byteCap,
      sizeDesc: formatFileSize(e.sizeBytes),
      capDesc: formatFileSize(e.byteCap),
      targetDesc: formatFileSize(Math.floor(e.byteCap * 0.7))
    }];
    if (e.lineCap !== undefined && e.lineCount !== undefined) {
      t.push({
        frac: e.lineCount / e.lineCap,
        over: e.lineCount >= e.lineCap,
        sizeDesc: `${e.lineCount} lines`,
        capDesc: `${e.lineCap}-line`,
        targetDesc: `${Math.floor(e.lineCap * 0.7)} lines`
      });
    }
    let n = t.reduce((o, s) => s.frac > o.frac ? s : o);
    if (n.frac < 0.8) {
      return null;
    }
    let r = n.over ? `over the ${n.capDesc} read limit \u2014 content beyond that is dropped when this index is loaded` : `approaching the ${n.capDesc} read limit`;
    return `The ${e.label} at ${e.displayPath} is ${n.sizeDesc}, ${r}. Compact it to under ${n.targetDesc} now: keep one line per entry, move detail into topic files, and merge or drop stale entries.`;
  }
  var _yo = __lazy(() => {
    cs();
  });
  async function pMa(e) {
    if (!Vd()) {
      return null;
    }
    if (!(e9t.resolve(e) === e9t.resolve(Obe()) || e9t.basename(e) === "MEMORY.md" && mWe(e))) {
      return null;
    }
    let n;
    try {
      n = await dMa.readFile(e, "utf8");
    } catch {
      return null;
    }
    let r = n.trim();
    return R3n({
      label: "memory index",
      displayPath: "MEMORY.md",
      sizeBytes: r.length,
      byteCap: 25000,
      lineCount: Ru(r, `
`) + 1,
      lineCap: 200
    });
  }
  var dMa;
  var e9t;
  var mMa = __lazy(() => {
    Eb();
    Vbe();
    Zn();
    _yo();
    dMa = require("fs/promises");
    e9t = require("path");
  });
  async function hMa(e, t) {
    let n;
    try {
      n = eue();
    } catch {
      return null;
    }
    if (n === null) {
      return null;
    }
    let r = t9t.resolve(e);
    let o = n.find(a => a.scope === "team" && a.promptIndex !== undefined && t9t.resolve(t9t.join(t, a.mount, ...a.promptIndex.split("/"))) === r);
    if (o === undefined || o.promptIndex === undefined) {
      return null;
    }
    let s;
    try {
      s = (await fMa.stat(e)).size;
    } catch {
      return null;
    }
    let i = o.promptIndexMaxBytes ?? 25000;
    return R3n({
      label: "memory index",
      displayPath: `team/${o.mount}/${o.promptIndex}`,
      sizeBytes: s,
      byteCap: i
    });
  }
  var fMa;
  var t9t;
  var gMa = __lazy(() => {
    dlt();
    _yo();
    fMa = require("fs/promises");
    t9t = require("path");
  });
  function e6e() {
    if (!Vd()) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_marble_lark", false);
  }
  function x3n() {
    return vf();
  }
  function k3n(e) {
    return e.normalize("NFC").replace(/[. ]+$/, "").toLowerCase();
  }
  function nEe(e) {
    let t = e.split("/");
    if (t.length === 0) {
      return true;
    }
    if (t.some(n => n.startsWith("."))) {
      return true;
    }
    return byo.includes(k3n(t[0]));
  }
  async function PNp(e) {
    let t;
    try {
      t = await JQr();
    } catch (n) {
      let r = en(n);
      if (r === "ENOENT" || r === "ENOTDIR") {
        return true;
      }
      return false;
    }
    if (e === t) {
      return true;
    }
    return e.startsWith(t + eQ.sep);
  }
  async function A3n(e) {
    if (YQr(e), nEe(e)) {
      throw new ix(`Key targets an excluded personal-memory subtree: "${e}"`);
    }
    let t = x3n();
    let n = eQ.join(t, e);
    let r = eQ.resolve(n);
    if (!r.startsWith(t)) {
      throw new ix(`Key escapes personal memory directory: "${e}"`);
    }
    let o = await QQr(r);
    if (!(await PNp(o))) {
      throw new ix(`Key escapes personal memory directory via symlink: "${e}"`);
    }
    for (let s of await ONp()) {
      if (o === s || o.startsWith(s + eQ.sep)) {
        throw new ix(`Key resolves into an excluded subtree (${byo.join("/, ")}/): "${e}"`);
      }
    }
    return r;
  }
  async function ONp() {
    let e = byo.map(n => n === "team" ? pw().replace(/[/\\]+$/, "") : eQ.join(vf(), n));
    let t = [];
    for (let n of e) {
      try {
        t.push(await yMa.realpath(n));
      } catch {}
    }
    return t;
  }
  function _Ma(e) {
    let t = eQ.resolve(e).normalize("NFC").toLowerCase();
    let n = x3n().normalize("NFC").toLowerCase();
    if (t + eQ.sep !== n && !t.startsWith(n)) {
      return false;
    }
    if (t + eQ.sep === n) {
      return false;
    }
    let r = t.slice(n.length).replaceAll(eQ.sep, "/");
    return !nEe(r);
  }
  var yMa;
  var eQ;
  var byo;
  var n9t = __lazy(() => {
    $n();
    dt();
    Eb();
    a1();
    yMa = require("fs/promises");
    eQ = require("path");
    byo = ["team", "logs", "sessions", "proposals"];
  });
  function EMa() {
    TMa = true;
    for (let e of Syo) {
      e();
    }
    Syo = [];
  }
  async function vMa(e) {
    if (TMa || SMa) {
      return;
    }
    if (!process.env.CLAUDE_MEMORY_STORES?.trim()) {
      return;
    }
    if (!I3n) {
      I3n = Promise.race([new Promise(t => Syo.push(t)), sleep(2500)]);
      I3n.then(() => {
        SMa = true;
      });
    }
    await Promise.race([I3n, sleep(2500, e)]);
  }
  var TMa = false;
  var I3n = null;
  var SMa = false;
  var Syo;
  var Tyo = __lazy(() => {
    Syo = [];
  });
  var DNp;
  var wMa;
  var CMa;
  var RMa;
  var xMa;
  var kMa = __lazy(() => {
    DNp = we(() => v.object({
      entries: v.record(v.string(), v.string()),
      entryChecksums: v.record(v.string(), v.string()).optional(),
      deletedEntries: v.record(v.string(), v.number()).optional()
    }));
    wMa = we(() => v.object({
      organizationId: v.string().optional(),
      repo: v.string(),
      version: v.number().optional(),
      lastModified: v.string(),
      checksum: v.string(),
      content: DNp()
    }));
    CMa = we(() => v.object({
      checksum: v.string().optional(),
      version: v.number().optional(),
      entryChecksums: v.record(v.string(), v.string()).optional(),
      deletedEntries: v.record(v.string(), v.number()).optional()
    }));
    RMa = we(() => v.object({
      error: v.object({
        details: v.object({
          error_code: v.literal("team_memory_too_many_entries"),
          max_entries: v.number().int().positive(),
          received_entries: v.number().int().positive()
        })
      })
    }));
    xMa = we(() => v.object({
      error: v.object({
        type: v.string().optional(),
        message: v.string().optional(),
        details: v.object({
          error_code: v.string().optional()
        }).optional()
      }).optional()
    }));
  });
  function Cyo(e, t, n) {
    let r = n ? `&view=${n}` : "";
    if (e === "team") {
      return `/api/claude_code/team_memory?repo=${encodeURIComponent(t)}${r}`;
    }
    return `/api/claude_code/memory?scope=user&repo=${encodeURIComponent(t)}${r}`;
  }
  function OMa(e) {
    return e === "team" ? pw() : x3n();
  }
  async function DMa(e, t, n) {
    if ((await Wbe(t, ...(e === "team" ? ["team"] : []))) === "escape") {
      logForDebugging(`${n}: memory root escapes its canonical location \u2014 skipping sync (fail closed)`, {
        level: "error"
      });
      return true;
    }
    return false;
  }
  function MMa(e, t) {
    return e === "team" ? JDn(t) : A3n(t);
  }
  function AMa(e, t) {
    if (e === "user" && nEe(t)) {
      return true;
    }
    return false;
  }
  function MMe(e) {
    return e === "team" ? "team-memory-sync" : "personal-memory-sync";
  }
  function Ryo(e, t) {
    return {
      scope: e,
      repoSlug: t,
      lastKnownChecksum: null,
      serverChecksums: new Map(),
      serverMaxEntries: null,
      pulled: false,
      tombstonedKeys: new Set(),
      tombstonedPriorHashes: new Map(),
      keptDivergentHashes: new Map(),
      keptUnreadable: new Set(),
      pullPromise: null,
      aborted: false
    };
  }
  function O3n(e) {
    return "sha256:" + PMa.createHash("sha256").update(e, "utf8").digest("hex");
  }
  function D3n() {
    if (!isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    if (!isClaudeAISubscriber()) {
      return false;
    }
    return hasStoredOAuthToken() && hasOAuthScope("user:inference") && hasOAuthScope("user:profile");
  }
  function vyo(e) {
    return e.length > 256 ? e.slice(0, 256) : e;
  }
  function xyo(e) {
    if (!isAxiosError(e)) {
      return {};
    }
    return NMa(e.response?.data);
  }
  function NMa(e) {
    if (e === undefined || e === null) {
      return {};
    }
    let t = xMa().safeParse(e);
    if (!t.success) {
      return {};
    }
    let n = t.data.error;
    if (!n) {
      return {};
    }
    return {
      ...(n.message !== undefined && {
        serverMessage: vyo(n.message)
      }),
      ...(n.type !== undefined && {
        serverErrorType: vyo(n.type)
      }),
      ...(n.details?.error_code !== undefined && {
        serverErrorCode: vyo(n.details.error_code)
      })
    };
  }
  async function NNp(e, t) {
    let n = MMe(e.scope);
    try {
      let r = {};
      if (t) {
        r["If-None-Match"] = `"${t.replaceAll('"', "")}"`;
      }
      let o = await _s.get(Cyo(e.scope, e.repoSlug), {
        refreshOAuth: true,
        headers: r,
        timeout: 30000,
        validateStatus: l => l === 200 || l === 304 || l === 404
      });
      if (!o.ok) {
        return {
          success: false,
          error: o.reason === "no-auth" ? o.detail : o.reason,
          skipRetry: true,
          errorType: "auth"
        };
      }
      let s = o.response;
      if (s.status === 304) {
        logForDebugging(`${n}: not modified (304)`, {
          level: "debug"
        });
        return {
          success: true,
          notModified: true,
          checksum: t ?? undefined
        };
      }
      if (s.status === 404) {
        let {
          serverErrorCode: l,
          serverMessage: c
        } = NMa(s.data);
        logForDebugging(`${n}: 404 (code=${l ?? "none"}): ${c ?? "no remote data"}`, {
          level: "debug"
        });
        e.lastKnownChecksum = null;
        return {
          success: true,
          isEmpty: true,
          serverErrorCode: l,
          serverMessage: c
        };
      }
      let i = wMa().safeParse(s.data);
      if (!i.success) {
        logForDebugging(`${n}: invalid response format`, {
          level: "warn"
        });
        return {
          success: false,
          error: "Invalid memory response format",
          skipRetry: true,
          errorType: "parse"
        };
      }
      let a = i.data.checksum || s.headers.etag?.replace(/^"|"$/g, "") || undefined;
      if (a) {
        e.lastKnownChecksum = a;
      }
      logForDebugging(`${n}: fetched successfully (checksum: ${a ?? "none"})`, {
        level: "debug"
      });
      return {
        success: true,
        data: i.data,
        isEmpty: false,
        checksum: a
      };
    } catch (r) {
      let {
        kind: o,
        status: s,
        message: i
      } = YS(r);
      let a = isAxiosError(r) ? De(r.response?.data ?? "") : "";
      if (o !== "other") {
        logForDebugging(`${n}: fetch error ${s}: ${a}`, {
          level: "warn"
        });
      }
      let l = xyo(r);
      switch (o) {
        case "auth":
          return {
            success: false,
            error: s === 403 ? `Forbidden by server policy: ${a}` : `Not authorized for memory sync: ${a}`,
            skipRetry: true,
            errorType: s === 403 ? "forbidden" : "auth",
            httpStatus: s,
            ...l
          };
        case "timeout":
          return {
            success: false,
            error: "Memory sync request timeout",
            errorType: "timeout"
          };
        case "network":
          return {
            success: false,
            error: "Cannot connect to server",
            errorType: "network"
          };
        default:
          return {
            success: false,
            error: i,
            errorType: "unknown",
            httpStatus: s,
            ...l
          };
      }
    }
  }
  async function LNp(e) {
    try {
      let t = await _s.get(Cyo(e.scope, e.repoSlug, "hashes"), {
        refreshOAuth: true,
        timeout: 30000,
        validateStatus: i => i === 200 || i === 404
      });
      if (!t.ok) {
        return {
          success: false,
          error: t.reason === "no-auth" ? t.detail : t.reason,
          errorType: "auth"
        };
      }
      let n = t.response;
      if (n.status === 404) {
        e.lastKnownChecksum = null;
        return {
          success: true,
          entryChecksums: {}
        };
      }
      let r = CMa().safeParse(n.data);
      let o = (r.success ? r.data.checksum : undefined) || n.headers.etag?.replace(/^"|"$/g, "");
      let s = r.success ? r.data.entryChecksums : undefined;
      if (!s) {
        return {
          success: false,
          error: "Server did not return entryChecksums (?view=hashes unsupported)",
          errorType: "parse"
        };
      }
      if (o) {
        e.lastKnownChecksum = o;
      }
      return {
        success: true,
        version: r.success ? r.data.version : undefined,
        checksum: o,
        entryChecksums: s,
        deletedEntries: r.success ? r.data.deletedEntries : undefined
      };
    } catch (t) {
      let {
        kind: n,
        status: r,
        message: o
      } = YS(t);
      let s = xyo(t);
      switch (n) {
        case "auth":
          return {
            success: false,
            error: r === 403 ? "Forbidden by server policy" : "Not authorized",
            errorType: r === 403 ? "forbidden" : "auth",
            httpStatus: r,
            ...s
          };
        case "timeout":
          return {
            success: false,
            error: "Timeout",
            errorType: "timeout"
          };
        case "network":
          return {
            success: false,
            error: "Network error",
            errorType: "network"
          };
        default:
          return {
            success: false,
            error: o,
            errorType: "unknown",
            httpStatus: r,
            ...s
          };
      }
    }
  }
  async function FNp(e, t) {
    let n = null;
    for (let r = 1; r <= 3 + 1; r++) {
      if (n = await NNp(e, t), n.success || n.skipRetry) {
        return n;
      }
      if (r > 3) {
        return n;
      }
      let o = YV(r);
      logForDebugging(`${MMe(e.scope)}: retry ${r}/${3}`, {
        level: "debug"
      });
      await sleep(o);
    }
    return n;
  }
  function UNp(e) {
    let t = Object.keys(e).sort();
    if (t.length === 0) {
      return [];
    }
    let n = Buffer.byteLength('{"entries":{}}', "utf8");
    let r = (a, l) => Buffer.byteLength(De(a), "utf8") + Buffer.byteLength(De(l), "utf8") + 2;
    let o = [];
    let s = {};
    let i = n;
    for (let a of t) {
      let l = r(a, e[a]);
      if (i + l > 200000 && Object.keys(s).length > 0) {
        o.push(s);
        s = {};
        i = n;
      }
      s[a] = e[a];
      i += l;
    }
    o.push(s);
    return o;
  }
  async function BNp(e, t, n, r) {
    let o = MMe(e.scope);
    try {
      let s = {
        "Content-Type": "application/json"
      };
      if (n) {
        s["If-Match"] = `"${n.replaceAll('"', "")}"`;
      }
      let i = {
        entries: t
      };
      if (r.length > 0) {
        i.soft_delete_keys = [...r];
      }
      let a = await _s.put(Cyo(e.scope, e.repoSlug), i, {
        refreshOAuth: true,
        headers: s,
        timeout: 30000,
        validateStatus: d => d === 200 || d === 412
      });
      if (!a.ok) {
        return {
          success: false,
          error: a.reason === "no-auth" ? a.detail : a.reason,
          errorType: "auth"
        };
      }
      let l = a.response;
      if (l.status === 412) {
        logForDebugging(`${o}: conflict (412 Precondition Failed)`, {
          level: "info"
        });
        return {
          success: false,
          conflict: true,
          error: "ETag mismatch"
        };
      }
      let c = l.data?.checksum;
      if (c) {
        e.lastKnownChecksum = c;
      }
      let u = r.length > 0 ? `, soft-deleted ${r.length}` : "";
      logForDebugging(`${o}: uploaded ${Object.keys(t).length} entries${u} (checksum: ${c ?? "none"})`, {
        level: "debug"
      });
      return {
        success: true,
        checksum: c,
        lastModified: l.data?.lastModified
      };
    } catch (s) {
      let i = isAxiosError(s) ? De(s.response?.data ?? "") : "";
      logForDebugging(`${o}: upload failed: ${s instanceof Error ? s.message : ""} ${i}`, {
        level: "warn"
      });
      let {
        kind: a,
        status: l,
        message: c
      } = YS(s);
      let u = l === 403 ? "forbidden" : a === "http" || a === "other" ? "unknown" : a;
      let d = xyo(s);
      let p;
      let m;
      if (l === 413 && isAxiosError(s)) {
        let f = RMa().safeParse(s.response?.data);
        if (f.success) {
          p = f.data.error.details.max_entries;
          m = f.data.error.details.received_entries;
        }
      }
      return {
        success: false,
        error: c,
        errorType: u,
        httpStatus: l,
        ...d,
        ...(p !== undefined && {
          serverMaxEntries: p
        }),
        ...(m !== undefined && {
          serverReceivedEntries: m
        })
      };
    }
  }
  async function $Np(e, t) {
    let n = MMe(e);
    let r = OMa(e);
    let o = {};
    let s = new Set();
    let i = [];
    let a = true;
    async function l(u) {
      try {
        let d = await k$.readdir(u, {
          withFileTypes: true
        });
        await Promise.all(d.map(async p => {
          let m = n6e.join(u, p.name);
          if (p.isDirectory()) {
            let f = n6e.relative(r, m).replaceAll("\\", "/");
            if (AMa(e, f)) {
              return;
            }
            await l(m);
          } else if (p.isFile()) {
            if (p.name.startsWith(".") || !(p.name.endsWith(".md") || p.name.endsWith(".txt"))) {
              return;
            }
            let f = n6e.relative(r, m).replaceAll("\\", "/");
            if (AMa(e, f)) {
              return;
            }
            s.add(f);
            try {
              let h = await k$.stat(m);
              if (h.size > 250000) {
                logForDebugging(`${n}: skipping oversized file ${p.name} (${h.size} > ${250000} bytes)`, {
                  level: "info"
                });
                return;
              }
              let g = await k$.readFile(m, "utf8");
              let y = ZZe(g);
              if (y.length > 0) {
                let _ = y[0];
                i.push({
                  path: f,
                  ruleId: _.ruleId,
                  label: _.label
                });
                logForDebugging(`${n}: skipping "${f}" \u2014 detected ${_.label}`, {
                  level: "warn"
                });
                return;
              }
              o[f] = g;
            } catch {}
          }
        }));
      } catch (d) {
        let p = en(d);
        if (p === "EACCES" || p === "EPERM") {
          a = false;
        }
        if (p !== "ENOENT" && p !== "EACCES" && p !== "EPERM") {
          throw d;
        }
      }
    }
    if (await DMa(e, r, n)) {
      return {
        entries: {},
        diskKeys: new Set(),
        diskTrusted: false,
        skippedSecrets: i
      };
    }
    await l(r);
    let c = Object.keys(o).sort();
    if (t !== null && c.length > t) {
      let u = c.slice(t);
      if (logForDebugging(`${n}: ${c.length} local entries exceeds server cap of ${t}; ${u.length} file(s) will NOT sync: ${u.join(", ")}. Consider consolidating or removing some memory files.`, {
        level: "warn"
      }), e === "team") {
        logEvent("tengu_team_mem_entries_capped", {
          total_entries: c.length,
          dropped_count: u.length,
          max_entries: t
        });
      }
      let d = {};
      for (let p of c.slice(0, t)) {
        d[p] = o[p];
      }
      return {
        entries: d,
        diskKeys: s,
        diskTrusted: a,
        skippedSecrets: i
      };
    }
    return {
      entries: o,
      diskKeys: s,
      diskTrusted: a,
      skippedSecrets: i
    };
  }
  async function HNp(e, t, n) {
    let r = MMe(e);
    let o = await Promise.all(Object.entries(t).map(async ([c, u]) => {
      let d;
      try {
        d = await MMa(e, c);
      } catch (m) {
        if (m instanceof ix) {
          logForDebugging(`${r}: ${m.message}`, {
            level: "warn"
          });
          return {
            relPath: c,
            outcome: "failed"
          };
        }
        throw m;
      }
      if (Buffer.byteLength(u, "utf8") > 250000) {
        logForDebugging(`${r}: skipping oversized remote entry "${c}"`, {
          level: "info"
        });
        return {
          relPath: c,
          outcome: "failed"
        };
      }
      try {
        let m = await k$.stat(d);
        if (m.size > 250000) {
          if (e === "user") {
            logForDebugging(`${r}: keeping oversized local "${c}" (${m.size} > ${250000} bytes) \u2014 pinned out of push delta this session (fail safe)`, {
              level: "warn"
            });
            return {
              relPath: c,
              outcome: "kept_divergent",
              unreadable: true
            };
          }
        } else {
          let f = await k$.readFile(d, "utf8");
          if (f === u) {
            return {
              relPath: c,
              outcome: "matched"
            };
          }
          if (e === "user") {
            let h = n.get(c);
            if (!(h !== undefined && O3n(f) === h)) {
              logForDebugging(`${r}: keeping local "${c}" \u2014 not overwriting with server copy (unproven stale mirror; pinned out of push delta until locally edited)`, {
                level: "warn"
              });
              return {
                relPath: c,
                outcome: "kept_divergent",
                hashAtPull: O3n(f)
              };
            }
          }
        }
      } catch (m) {
        let f = en(m);
        if (e === "user" && f !== undefined && f !== "ENOENT" && f !== "ENOTDIR") {
          logForDebugging(`${r}: keeping unreadable local "${c}" (${f}) \u2014 pinned out of push delta this session (fail safe)`, {
            level: "warn"
          });
          return {
            relPath: c,
            outcome: "kept_divergent",
            unreadable: true
          };
        }
        if (f !== undefined && f !== "ENOENT" && f !== "ENOTDIR") {
          logForDebugging(`${r}: unexpected read error for "${c}": ${f}`, {
            level: "debug"
          });
        }
      }
      try {
        let m = d.substring(0, d.lastIndexOf(n6e.sep));
        await k$.mkdir(m, {
          recursive: true
        });
        await k$.writeFile(d, u, "utf8");
        return {
          relPath: c,
          outcome: "written"
        };
      } catch (m) {
        logForDebugging(`${r}: failed to write "${c}": ${m}`, {
          level: "warn"
        });
        return {
          relPath: c,
          outcome: "failed"
        };
      }
    }));
    let s = Bn(o, c => c.outcome === "written");
    let i = new Set(o.filter(c => c.outcome === "failed").map(c => c.relPath));
    let a = new Map();
    let l = new Set();
    for (let c of o) {
      if (c.outcome !== "kept_divergent") {
        continue;
      }
      if (c.unreadable) {
        l.add(c.relPath);
      } else if (c.hashAtPull !== undefined) {
        a.set(c.relPath, c.hashAtPull);
      }
    }
    return {
      filesWritten: s,
      unwrittenKeys: i,
      keptDivergentHashes: a,
      keptUnreadable: l
    };
  }
  async function jNp(e, t) {
    let n = e.scope;
    let r = MMe(n);
    let o = Object.keys(t);
    if (o.length === 0) {
      return 0;
    }
    let s = await Promise.all(o.map(async i => {
      let a;
      try {
        a = await MMa(n, i);
      } catch {
        return false;
      }
      if (n === "user") {
        let l;
        try {
          l = (await k$.stat(a)).size;
        } catch (d) {
          if (en(d) !== "ENOENT") {
            logForDebugging(`${r}: cannot stat tombstoned "${i}" before reap: ${en(d)}`, {
              level: "warn"
            });
          }
          return false;
        }
        let c = e.tombstonedPriorHashes.get(i);
        if (c === undefined) {
          logForDebugging(`${r}: keeping unverifiable tombstoned "${i}" (no prior server hash) \u2014 not reaping`, {
            level: "debug"
          });
          Et(ope[n].conflict, "unverified_tombstone_skip");
          return false;
        }
        if (l > 250000) {
          logForDebugging(`${r}: keeping oversized tombstoned "${i}" (${l} > ${250000} bytes) \u2014 not reaping`, {
            level: "warn"
          });
          return false;
        }
        let u;
        try {
          u = await k$.readFile(a, "utf8");
        } catch (d) {
          if (en(d) !== "ENOENT") {
            logForDebugging(`${r}: cannot read tombstoned "${i}" to verify before reap: ${en(d)}`, {
              level: "warn"
            });
          }
          return false;
        }
        if (O3n(u) !== c) {
          logForDebugging(`${r}: keeping locally-modified tombstoned "${i}" (diverged from server mirror) \u2014 not reaping`, {
            level: "warn"
          });
          Pe(ope[n].conflict);
          return false;
        }
      }
      try {
        await k$.unlink(a);
        return true;
      } catch (l) {
        let c = en(l);
        if (c !== "ENOENT") {
          logForDebugging(`${r}: failed to reap tombstoned "${i}": ${c}`, {
            level: "warn"
          });
        }
        return false;
      }
    }));
    return Bn(s, Boolean);
  }
  function kyo(e) {
    if (Vi()) {
      return false;
    }
    if (!isPolicyAllowed("allow_memory_sync")) {
      return false;
    }
    return D3n();
  }
  function r9t() {
    if (!Vd()) {
      return false;
    }
    if (Vi()) {
      return false;
    }
    if (!isPolicyAllowed("allow_memory_sync")) {
      return false;
    }
    return cT() !== null || D3n();
  }
  async function Ayo(e, t) {
    if (e.pullPromise) {
      return e.pullPromise;
    }
    let n = qNp(e, t);
    e.pullPromise = n;
    try {
      return await n;
    } finally {
      e.pullPromise = null;
    }
  }
  async function qNp(e, t) {
    let n = t?.skipEtagCache ?? false;
    let r = Date.now();
    let o = MMe(e.scope);
    if (!D3n()) {
      Vmt(e.scope, r, {
        success: false,
        errorType: "no_oauth"
      });
      return {
        success: false,
        filesWritten: 0,
        filesReaped: 0,
        entryCount: 0,
        error: "OAuth not available"
      };
    }
    if (await DMa(e.scope, OMa(e.scope), o)) {
      Vmt(e.scope, r, {
        success: false,
        errorType: "aborted"
      });
      return {
        success: false,
        filesWritten: 0,
        filesReaped: 0,
        entryCount: 0,
        errorType: "aborted",
        error: "memory root escapes its canonical location \u2014 pull skipped (fail closed)"
      };
    }
    let s = n ? null : e.lastKnownChecksum;
    let i = await FNp(e, s);
    if (!i.success) {
      if (e.scope === "team" && i.errorType === "forbidden") {
        setTeamMemoryServerStatus("not-available");
      }
      Vmt(e.scope, r, {
        success: false,
        errorType: i.errorType,
        status: i.httpStatus,
        serverMessage: i.serverMessage,
        serverErrorCode: i.serverErrorCode,
        serverErrorType: i.serverErrorType
      });
      return {
        success: false,
        filesWritten: 0,
        filesReaped: 0,
        entryCount: 0,
        error: i.error,
        errorType: i.errorType,
        ...(i.httpStatus !== undefined && {
          httpStatus: i.httpStatus
        })
      };
    }
    if (i.notModified) {
      e.pulled = true;
      Vmt(e.scope, r, {
        success: true,
        notModified: true
      });
      return {
        success: true,
        filesWritten: 0,
        filesReaped: 0,
        entryCount: 0,
        notModified: true
      };
    }
    if (i.isEmpty) {
      if (e.serverChecksums.clear(), e.tombstonedKeys.clear(), e.keptDivergentHashes.clear(), e.keptUnreadable.clear(), e.pulled = true, e.scope === "team") {
        setTeamMemoryServerStatus(i.serverErrorCode === "team_memory_feature_unavailable" ? "not-available" : "empty");
      }
      Vmt(e.scope, r, {
        success: true,
        serverErrorCode: i.serverErrorCode,
        serverMessage: i.serverMessage
      });
      return {
        success: true,
        filesWritten: 0,
        filesReaped: 0,
        entryCount: 0
      };
    }
    let a = i.data.content.entries;
    let l = i.data.content.entryChecksums;
    let c = i.data.content.deletedEntries ?? {};
    e.tombstonedKeys = new Set(Object.keys(c));
    let u = new Map(e.serverChecksums);
    e.tombstonedPriorHashes = new Map();
    for (let y of e.tombstonedKeys) {
      let _ = u.get(y);
      if (_ !== undefined) {
        e.tombstonedPriorHashes.set(y, _);
      }
    }
    if (e.serverChecksums.clear(), l) {
      for (let [y, _] of Object.entries(l)) {
        e.serverChecksums.set(y, _);
      }
    } else {
      logForDebugging(`${o}: server response missing entryChecksums (pre-#283027 deploy) \u2014 next push will be full, not delta`, {
        level: "debug"
      });
    }
    let {
      filesWritten: d,
      unwrittenKeys: p,
      keptDivergentHashes: m,
      keptUnreadable: f
    } = await HNp(e.scope, a, u);
    e.keptDivergentHashes = m;
    e.keptUnreadable = f;
    let h = await jNp(e, c);
    if (d > 0 || h > 0) {
      let {
        clearMemoryFileCaches: y
      } = await Promise.resolve().then(() => (bx(), Mma));
      y();
    }
    for (let y of p) {
      e.serverChecksums.delete(y);
    }
    e.pulled = true;
    let g = Object.keys(a).length;
    if (e.scope === "team") {
      setTeamMemoryServerStatus(g > 0 ? "has-content" : "empty");
    }
    logForDebugging(`${o}: pulled ${d} files` + (h > 0 ? `, reaped ${h} tombstoned` : "") + (p.size > 0 ? ` (${p.size} entries skipped)` : ""), {
      level: "info"
    });
    Vmt(e.scope, r, {
      success: true,
      filesWritten: d,
      filesReaped: h
    });
    return {
      success: true,
      filesWritten: d,
      filesReaped: h,
      entryCount: g
    };
  }
  async function Iyo(e) {
    let t = Date.now();
    let n = MMe(e.scope);
    let r = 0;
    if (!D3n()) {
      rpe(e.scope, t, {
        success: false,
        errorType: "no_oauth"
      });
      return {
        success: false,
        filesUploaded: 0,
        error: "OAuth not available",
        errorType: "no_oauth"
      };
    }
    if (e.scope === "team" && getTeamMemoryServerStatus() === "not-available") {
      logForDebugging(`${n}: push skipped: server marked not-available`, {
        level: "debug"
      });
      rpe(e.scope, t, {
        success: false,
        errorType: "server_unavailable"
      });
      return {
        success: false,
        filesUploaded: 0,
        error: "Team memory server marked not-available",
        errorType: "server_unavailable"
      };
    }
    if (e.scope === "user" && !e.pulled) {
      let f = await Ayo(e, {
        skipEtagCache: true
      });
      if (!f.success) {
        let h = f.errorType === "parse" ? "unknown" : f.errorType ?? "network";
        logForDebugging(`${n}: deferring push \u2014 no pull basis yet (initial pull not completed: ${f.error}, type=${h})`, {
          level: "warn"
        });
        rpe(e.scope, t, {
          success: false,
          errorType: h,
          status: f.httpStatus
        });
        return {
          success: false,
          filesUploaded: 0,
          error: "initial pull not completed \u2014 deferring push to avoid blind overwrite",
          errorType: h,
          ...(f.httpStatus !== undefined && {
            httpStatus: f.httpStatus
          })
        };
      }
    }
    let o = await $Np(e.scope, e.serverMaxEntries);
    let s = o.entries;
    let i = o.diskKeys;
    let a = o.diskTrusted;
    let l = o.skippedSecrets;
    let c = [];
    if (e.pulled && a) {
      for (let f of e.serverChecksums.keys()) {
        if (!i.vZc(f) && !e.keptUnreadable.vZc(f) && !e.keptDivergentHashes.vZc(f)) {
          c.push(f);
        }
      }
    } else if (e.pulled && !a) {
      logForDebugging(`${n}: dir inaccessible \u2014 suppressing soft-delete`, {
        level: "warn"
      });
    }
    if (l.length > 0) {
      let f = l.map(h => `"${h.path}" (${h.label})`).join(", ");
      if (logForDebugging(`${n}: ${l.length} file(s) skipped due to detected secrets: ${f}. Remove the secret(s) to enable sync for these files.`, {
        level: "warn"
      }), e.scope === "team") {
        logEvent("tengu_team_mem_secret_skipped", {
          file_count: l.length,
          rule_ids: l.map(h => h.ruleId).join(",")
        });
      } else {
        Et(ope[e.scope].conflict, "personal_memory_secret_skipped");
      }
    }
    let u = new Map();
    for (let [f, h] of Object.entries(s)) {
      let g = O3n(h);
      if (e.tombstonedKeys.vZc(f)) {
        let y = e.tombstonedPriorHashes.get(f);
        if (e.scope !== "user" || y === undefined || y === g) {
          if (e.scope === "user" && y === undefined) {
            Et(ope[e.scope].conflict, "unverified_tombstone_drop");
          }
          continue;
        }
      }
      u.set(f, g);
    }
    let d = false;
    let p = 0;
    let m = 0;
    for (let f = 0; f <= 2; f++) {
      let h = {};
      for (let [C, x] of u) {
        if (e.keptDivergentHashes.get(C) === x) {
          continue;
        }
        if (e.keptUnreadable.vZc(C)) {
          continue;
        }
        if (e.serverChecksums.get(C) !== x) {
          h[C] = s[C];
        }
      }
      if (Object.keys(h).length === 0 && c.length === 0) {
        if (!a) {
          Et(ope[e.scope].conflict, "root_escape");
        }
        rpe(e.scope, t, {
          success: true,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: d,
          conflictRetries: r
        });
        return {
          success: true,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          ...(l.length > 0 && {
            skippedSecrets: l
          })
        };
      }
      let y = UNp(h);
      if (y.length === 0) {
        y.push({});
      }
      let _;
      for (let C = 0; C < y.length; C++) {
        if (e.aborted || e.scope === "user" && !e6e()) {
          logForDebugging(`${n}: push aborted mid-flight (personal sync disabled) after ${C}/${y.length} batch(es)`, {
            level: "warn"
          });
          rpe(e.scope, t, {
            success: false,
            filesUploaded: p,
            errorType: "aborted"
          });
          return {
            success: false,
            filesUploaded: p,
            error: "push aborted \u2014 personal sync disabled mid-flight",
            errorType: "aborted"
          };
        }
        let x = y[C];
        let A = C === 0 ? c : [];
        if (_ = await BNp(e, x, e.lastKnownChecksum, A), !_.success) {
          break;
        }
        for (let k of Object.keys(x)) {
          e.serverChecksums.set(k, u.get(k));
          e.keptDivergentHashes.delete(k);
          e.keptUnreadable.delete(k);
        }
        if (p += Object.keys(x).length, A.length > 0) {
          for (let k of A) {
            e.serverChecksums.delete(k);
          }
          m += A.length;
          c.length = 0;
        }
      }
      if (_ = _, _.success) {
        if (e.scope === "team" && u.size > 0) {
          setTeamMemoryServerStatus("has-content");
        }
        let C = m > 0 ? `${p} of ${u.size} files, soft-deleted ${m}` : `${p} of ${u.size} files`;
        logForDebugging(y.length > 1 ? `${n}: pushed ${C} in ${y.length} batches` : `${n}: pushed ${C} (delta)`, {
          level: "info"
        });
        rpe(e.scope, t, {
          success: true,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: d,
          conflictRetries: r,
          putBatches: y.length > 1 ? y.length : undefined
        });
        return {
          success: true,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          checksum: _.checksum,
          ...(l.length > 0 && {
            skippedSecrets: l
          })
        };
      }
      if (!_.conflict) {
        if (_.serverMaxEntries !== undefined) {
          e.serverMaxEntries = _.serverMaxEntries;
          logForDebugging(`${n}: learned server max_entries=${_.serverMaxEntries} from 413; next push will truncate to this`, {
            level: "warn"
          });
        }
        rpe(e.scope, t, {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflictRetries: r,
          putBatches: y.length > 1 ? y.length : undefined,
          errorType: _.errorType,
          status: _.httpStatus,
          errorCode: _.serverErrorCode,
          serverMaxEntries: _.serverMaxEntries,
          serverReceivedEntries: _.serverReceivedEntries,
          serverMessage: _.serverMessage,
          serverErrorCode: _.serverErrorCode,
          serverErrorType: _.serverErrorType
        });
        return {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          error: _.error,
          errorType: _.errorType,
          httpStatus: _.httpStatus,
          serverMessage: _.serverMessage,
          serverErrorCode: _.serverErrorCode,
          serverErrorType: _.serverErrorType
        };
      }
      if (d = true, f >= 2) {
        logForDebugging(`${n}: giving up after ${2} conflict retries`, {
          level: "warn"
        });
        rpe(e.scope, t, {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: true,
          conflictRetries: r,
          errorType: "conflict"
        });
        return {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: true,
          error: "Conflict resolution failed after retries"
        };
      }
      r++;
      logForDebugging(`${n}: conflict (412), probing server hashes (attempt ${f + 1}/${2})`, {
        level: "info"
      });
      let b = await LNp(e);
      if (!b.success) {
        let C = b.errorType === "parse" ? undefined : b.errorType;
        rpe(e.scope, t, {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: true,
          conflictRetries: r,
          errorType: C ?? "conflict",
          status: b.httpStatus,
          serverMessage: b.serverMessage,
          serverErrorCode: b.serverErrorCode,
          serverErrorType: b.serverErrorType
        });
        return {
          success: false,
          filesUploaded: p,
          ...(m > 0 && {
            filesSoftDeleted: m
          }),
          conflict: true,
          error: `Conflict resolution hashes probe failed: ${b.error}`,
          ...(C !== undefined && {
            errorType: C
          }),
          ...(b.httpStatus !== undefined && {
            httpStatus: b.httpStatus
          }),
          ...(b.serverMessage !== undefined && {
            serverMessage: b.serverMessage
          }),
          ...(b.serverErrorCode !== undefined && {
            serverErrorCode: b.serverErrorCode
          }),
          ...(b.serverErrorType !== undefined && {
            serverErrorType: b.serverErrorType
          })
        };
      }
      let S = new Set(e.serverChecksums.keys());
      let E = new Map(e.serverChecksums);
      e.serverChecksums.clear();
      for (let [C, x] of Object.entries(b.entryChecksums)) {
        if (S.vZc(C) || i.vZc(C)) {
          e.serverChecksums.set(C, x);
        }
      }
      if (e.scope === "user") {
        let C = 0;
        for (let [x, A] of u) {
          let k = E.get(x);
          if (k === undefined) {
            continue;
          }
          if (b.entryChecksums[x] !== k && A === k) {
            e.keptDivergentHashes.set(x, A);
            C++;
          }
        }
        if (C > 0) {
          Et(ope[e.scope].conflict, "conflict_probe_kept_divergent");
        }
      }
      if (c.length > 0) {
        let C = c.filter(x => {
          let A = b.entryChecksums[x];
          if (A === undefined) {
            return true;
          }
          return A === E.get(x);
        });
        if (C.length !== c.length) {
          let x = new Set(C);
          let A = c.filter(k => !x.vZc(k));
          logForDebugging(`${n}: dropping ${A.length} stale soft-delete(s) \u2014 concurrently re-created/modified server-side`, {
            level: "warn"
          });
          for (let k of A) {
            e.serverChecksums.delete(k);
          }
        }
        c.length = 0;
        c.push(...C);
      }
      for (let C of Object.keys(b.deletedEntries ?? {})) {
        e.tombstonedKeys.add(C);
        let x = E.get(C);
        if (x !== undefined) {
          e.tombstonedPriorHashes.set(C, x);
        }
        if (e.scope !== "user") {
          u.delete(C);
          continue;
        }
        let A = u.get(C);
        if (A === undefined) {
          continue;
        }
        if (x !== undefined && A === x) {
          u.delete(C);
        } else if (x !== undefined) {
          ;
        } else {
          u.delete(C);
          Et(ope[e.scope].conflict, "unverified_tombstone_drop");
        }
      }
    }
    rpe(e.scope, t, {
      success: false,
      filesUploaded: p,
      ...(m > 0 && {
        filesSoftDeleted: m
      }),
      conflictRetries: r
    });
    return {
      success: false,
      filesUploaded: p,
      ...(m > 0 && {
        filesSoftDeleted: m
      }),
      error: "Unexpected end of conflict resolution loop"
    };
  }
  function Vmt(e, t, n) {
    let r = ope[e].pull;
    let o = e === "team" ? "team_memory" : "personal_memory";
    if (n.success) {
      Pe(r);
    } else {
      switch (n.errorType) {
        case "no_oauth":
        case "auth":
        case "forbidden":
        case "timeout":
        case "network":
        case "aborted":
          Et(r, `${o}_pull_${n.errorType}`);
          break;
        case "parse":
          Ae(r, `${o}_pull_parse`);
          break;
        default:
          Ae(r, `${o}_pull_unknown`);
      }
    }
    if (e !== "team") {
      return;
    }
    logEvent("tengu_team_mem_sync_pull", {
      success: n.success,
      files_written: n.filesWritten ?? 0,
      not_modified: n.notModified ?? false,
      duration_ms: Date.now() - t,
      ...(n.filesReaped && {
        files_reaped: n.filesReaped
      }),
      ...(n.errorType && {
        errorType: n.errorType
      }),
      ...(n.status && {
        status: n.status
      }),
      ...(n.serverMessage !== undefined && {
        server_message: n.serverMessage
      }),
      ...(n.serverErrorCode !== undefined && {
        server_error_code: n.serverErrorCode
      }),
      ...(n.serverErrorType !== undefined && {
        server_error_type: n.serverErrorType
      })
    });
  }
  function rpe(e, t, n) {
    let r = ope[e].push;
    let o = ope[e].conflict;
    let s = e === "team" ? "team_memory" : "personal_memory";
    if (n.success) {
      if (Pe(r), n.conflict) {
        Pe(o);
      }
    } else {
      switch (n.errorType) {
        case "no_oauth":
          Et(r, `${s}_push_no_oauth`);
          break;
        case "auth":
          Ae(r, `${s}_push_auth`);
          break;
        case "forbidden":
          Et(r, `${s}_push_forbidden`);
          break;
        case "timeout":
          Ae(r, `${s}_push_timeout`);
          break;
        case "network":
          Ae(r, `${s}_push_network`);
          break;
        case "aborted":
          Et(r, `${s}_push_aborted`);
          break;
        case "server_unavailable":
          Et(r, `${s}_push_server_unavailable`);
          break;
        case "conflict":
          Ae(r, `${s}_push_conflict_exhausted`);
          Ae(o, `${s}_conflict_exhausted`);
          break;
        default:
          Ae(r, `${s}_push_unknown`);
      }
    }
    if (e !== "team") {
      return;
    }
    logEvent("tengu_team_mem_sync_push", {
      success: n.success,
      files_uploaded: n.filesUploaded ?? 0,
      conflict: n.conflict ?? false,
      conflict_retries: n.conflictRetries ?? 0,
      duration_ms: Date.now() - t,
      ...(n.filesSoftDeleted && {
        files_soft_deleted: n.filesSoftDeleted
      }),
      ...(n.errorType && {
        errorType: n.errorType
      }),
      ...(n.status && {
        status: n.status
      }),
      ...(n.putBatches && {
        put_batches: n.putBatches
      }),
      ...(n.errorCode && {
        error_code: n.errorCode
      }),
      ...(n.serverMaxEntries !== undefined && {
        server_max_entries: n.serverMaxEntries
      }),
      ...(n.serverReceivedEntries !== undefined && {
        server_received_entries: n.serverReceivedEntries
      }),
      ...(n.serverErrorCode !== undefined && {
        server_error_code: n.serverErrorCode
      }),
      ...(n.serverMessage !== undefined && {
        server_message: n.serverMessage
      }),
      ...(n.serverErrorType !== undefined && {
        server_error_type: n.serverErrorType
      })
    });
  }
  var PMa;
  var k$;
  var n6e;
  var ope;
  var LMa = __lazy(() => {
    at();
    Uc();
    Eb();
    n9t();
    a1();
    no();
    je();
    dt();
    Ds();
    Wd();
    Kv();
    e1();
    ln();
    Ot();
    r6e();
    pk();
    bg();
    Kc();
    kMa();
    PMa = require("crypto");
    k$ = require("fs/promises");
    n6e = require("path");
    ope = {
      team: {
        pull: "team_memory_sync_pull",
        push: "team_memory_sync_push",
        conflict: "team_memory_sync_conflict"
      },
      user: {
        pull: "personal_memory_sync_pull",
        push: "personal_memory_sync_push",
        conflict: "personal_memory_sync_conflict"
      }
    };
  });
  async function* KNp(e, t, n = 60000) {
    let r = new FMa.StringDecoder("utf8");
    let o = "";
    let s = e.stream[Symbol.asyncIterator]();
    try {
      while (true) {
        let i = await withTimeout(s.next(), n, "export stream stalled");
        if (i.done) {
          break;
        }
        let a = i.value;
        o += typeof a === "string" ? a : r.write(a);
        let l;
        while ((l = o.indexOf(`
`)) >= 0) {
          let c = o.slice(0, l);
          if (o = o.slice(l + 1), c.endsWith("\r")) {
            c = c.slice(0, -1);
          }
          if (c.length > t) {
            throw new M3n(t);
          }
          if (c !== "") {
            yield c;
          }
        }
        if (o.length > t) {
          throw new M3n(t);
        }
      }
      if (o += r.end(), o !== "" && o !== "\r") {
        yield o.endsWith("\r") ? o.slice(0, -1) : o;
      }
    } finally {
      e.destroy();
      s.return?.().catch(() => {
        return;
      });
    }
  }
  async function BMa({
    source: e,
    handleMemory: t,
    maxConcurrentWrites: n,
    maxLineLength: r,
    stallTimeoutMs: o = UMa
  }) {
    let s = new Set();
    let i;
    let a = 0;
    let l = 0;
    let c = null;
    async function u() {
      await Promise.all(s);
    }
    async function d(p) {
      await u();
      return {
        ok: false,
        reason: p
      };
    }
    try {
      for await (let p of KNp(e, r, o)) {
        if (c !== null) {
          return await d("parse_failed");
        }
        let m;
        try {
          m = jge(p);
        } catch {
          return await d("parse_failed");
        }
        let f = GNp().safeParse(m);
        if (!f.success) {
          return await d("parse_failed");
        }
        switch (f.data.type) {
          case "store":
            break;
          case "memory":
            {
              let h = VNp().safeParse(m);
              if (!h.success) {
                return await d("parse_failed");
              }
              a++;
              while (s.size >= n) {
                await Promise.race(s);
              }
              if (i !== undefined) {
                return await d("write_failed");
              }
              let g = {
                path: h.data.path,
                content: h.data.content,
                contentSha256: h.data.content_sha256,
                memoryId: h.data.id
              };
              let y = t(g).catch(_ => {
                i ??= _;
              }).finally(() => {
                s.delete(y);
              });
              s.add(y);
              break;
            }
          case "memory_error":
            l++;
            break;
          case "complete":
            {
              let h = zNp().safeParse(m);
              if (!h.success) {
                return await d("parse_failed");
              }
              c = {
                memoryCount: h.data.memory_count,
                errorCount: h.data.error_count ?? 0
              };
              break;
            }
          default:
            break;
        }
      }
    } catch (p) {
      if (await u(), p instanceof M3n) {
        return {
          ok: false,
          reason: "oversized_line"
        };
      }
      return {
        ok: false,
        reason: "stream_error"
      };
    }
    if (await u(), i !== undefined) {
      return {
        ok: false,
        reason: "write_failed"
      };
    }
    if (c === null) {
      return {
        ok: false,
        reason: "stream_truncated"
      };
    }
    if (c.memoryCount !== a) {
      return {
        ok: false,
        reason: "count_mismatch"
      };
    }
    if (c.errorCount > 0 || l > 0) {
      return {
        ok: false,
        reason: "decrypt_errors"
      };
    }
    return {
      ok: true,
      memoryLines: a
    };
  }
  var FMa;
  var GNp;
  var VNp;
  var zNp;
  var M3n;
  var $Ma = __lazy(() => {
    FMa = require("string_decoder");
    GNp = we(() => v.looseObject({
      type: v.string()
    }));
    VNp = we(() => v.looseObject({
      type: v.literal("memory"),
      id: v.string(),
      path: v.string(),
      content: v.string(),
      content_sha256: v.string()
    }));
    zNp = we(() => v.looseObject({
      type: v.literal("complete"),
      memory_count: v.number().int().nonnegative(),
      error_count: v.number().int().nonnegative().optional()
    }));
    M3n = class M3n extends Error {
      constructor(e) {
        super(`NDJSON line exceeds ${e} bytes`);
        this.name = "LineTooLongError";
      }
    };
  });
  function JNp(e) {
    return HMa.createHash("sha256").update(e, "utf8").digest("hex");
  }
  function L3n(e, t) {
    if (e.length !== t.length) {
      throw Error("createMultiStoreState: length mismatch");
    }
    let n = pw();
    let r = vf();
    return {
      stores: e.map((o, s) => {
        let i = t[s];
        let a = typeof i === "string" ? {
          mount: i,
          scope: "team"
        } : i;
        let l = a.scope === "user";
        return {
          backend: o,
          mountName: a.mount,
          scope: a.scope,
          mountDir: l ? r : (A$.join(n, a.mount) + A$.sep).normalize("NFC"),
          excludeKey: l ? nEe : null,
          remoteHashes: new Map(),
          createdAtMs: Date.now(),
          pullWrittenMtimes: new Map(),
          pulled: false,
          suppressedReason: null,
          invalidatedBasis: null
        };
      }),
      inFlight: null
    };
  }
  function s9t() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_silk_almanac", false);
  }
  async function GMa(e, t) {
    if ((await F3n(e.mountDir))?.partition === e.backend.partitionId) {
      return;
    }
    if (t?.expectPresent) {
      Et("team_memory_multistore_conflict", "manifest_changed_mid_pull");
      return;
    }
    let r = De({
      v: 1,
      partition: e.backend.partitionId
    });
    await H1.mkdir(e.mountDir, {
      recursive: true
    });
    await H1.writeFile(A$.join(e.mountDir, ".memory-sync"), r, "utf8");
  }
  async function F3n(e) {
    try {
      let t = await H1.readFile(A$.join(e, ".memory-sync"), "utf8");
      let n = qt(t);
      if (n === null || typeof n !== "object" || n.v !== 1 || typeof n.partition !== "string") {
        return null;
      }
      return n;
    } catch {
      return null;
    }
  }
  function VMa(e) {
    if (e.startsWith(".")) {
      return false;
    }
    return XNp.some(t => e.endsWith(t));
  }
  function zMa(e) {
    let t = e.replace(/^\/+/, "").split("/");
    return t.every(n => !n.startsWith(".")) && VMa(t.at(-1));
  }
  async function KMa(e, t) {
    let n = new Map();
    let r = new Set();
    let o = [];
    let s = true;
    async function i(a) {
      let l;
      try {
        l = await H1.readdir(a, {
          withFileTypes: true
        });
      } catch (c) {
        let u = en(c);
        if (u === "ENOENT") {
          return;
        }
        if (u === "EACCES" || u === "EPERM") {
          s = false;
          return;
        }
        throw c;
      }
      await Promise.all(l.map(async c => {
        let u = A$.join(a, c.name);
        if (c.isDirectory()) {
          if (c.name.startsWith(".")) {
            return;
          }
          if (t) {
            let p = A$.relative(e, u).split(A$.sep).join("/");
            if (t(p)) {
              return;
            }
          }
          await i(u);
          return;
        }
        if (!c.isFile() || !VMa(c.name)) {
          return;
        }
        let d = "/" + A$.relative(e, u).split(A$.sep).join("/");
        r.add(d);
        try {
          let p = await H1.stat(u);
          if (p.size > 102400) {
            logForDebugging(`multi-store-sync: skipping oversized ${d} (${p.size}B)`, {
              level: "info"
            });
            return;
          }
          let m = await H1.readFile(u, "utf8");
          if (ZZe(m).length > 0) {
            o.push(d);
            logForDebugging(`multi-store-sync: skipping ${d} (secret detected)`, {
              level: "warn"
            });
            return;
          }
          n.set(d, {
            content: m,
            sha256: JNp(m)
          });
        } catch (p) {
          let m = en(p);
          if (m === "ENOENT") {
            return;
          }
          if (m === "EACCES" || m === "EPERM") {
            s = false;
            return;
          }
          throw p;
        }
      }));
    }
    await i(e);
    return {
      entries: n,
      diskPaths: r,
      diskTrusted: s,
      skippedSecretPaths: o
    };
  }
  async function U3n(e, t) {
    let n = t.replace(/^\/+/, "");
    let r = e.scope === "user" ? await A3n(n) : await JDn(A$.join(e.mountName, n).split(A$.sep).join("/"));
    if (!r.normalize("NFC").startsWith(e.mountDir)) {
      throw new ix(`path escapes mount ${e.mountName}: ${t}`);
    }
    return r;
  }
  async function YMa(e, t, n) {
    let r = await U3n(e, t);
    await H1.mkdir(A$.dirname(r), {
      recursive: true
    });
    await H1.writeFile(r, n, "utf8");
  }
  async function JMa(e, t) {
    if (e.pulled) {
      return false;
    }
    try {
      let n = await U3n(e, t);
      let r = await H1.stat(n);
      let o = e.pullWrittenMtimes.get(t);
      if (o !== undefined) {
        return r.mtimeMs > o;
      }
      return r.mtimeMs >= e.createdAtMs - 1000;
    } catch {
      return false;
    }
  }
  async function XMa(e, t) {
    try {
      let n = await U3n(e, t);
      let r = await H1.stat(n);
      e.pullWrittenMtimes.set(t, r.mtimeMs);
    } catch {}
  }
  async function QMa(e, t) {
    try {
      let n = await U3n(e, t);
      await H1.unlink(n);
    } catch (n) {
      if (n instanceof ix) {
        logForDebugging(`multi-store-sync[${e.mountName}]: refusing to delete escaping path ${t}`, {
          level: "warn"
        });
        return;
      }
      if (en(n) === "ENOENT") {
        return;
      }
      throw n;
    }
  }
  async function Pyo(e, t, n) {
    let r = 0;
    let o = Array.from({
      length: Math.min(t, e.length)
    }, async () => {
      while (r < e.length) {
        let s = r++;
        await n(e[s]);
      }
    });
    await Promise.all(o);
  }
  async function ZMa(e) {
    if (!s9t()) {
      return false;
    }
    let t = await F3n(e.mountDir);
    let n = t?.partition === e.backend.partitionId;
    if (!e.pulled) {
      return n;
    }
    if (n) {
      return true;
    }
    if (t !== null && e.scope !== "user") {
      eNa(e, "midSession");
      return false;
    }
    if (e.remoteHashes.size === 0) {
      return false;
    }
    logForDebugging(`multi-store-sync[${e.mountName}]: .memory-sync manifest ${t === null ? "absent" : "partition mismatch"} \u2014 invalidating basis`, {
      level: "warn"
    });
    Et("team_memory_multistore_conflict", t === null ? "manifest_absent" : "manifest_mismatch");
    logEvent("tengu_team_mem_push_manifest_gate", {
      absent: t === null,
      remote_entries: e.remoteHashes.size
    });
    e.invalidatedBasis = e.remoteHashes;
    e.remoteHashes = new Map();
    e.pulled = false;
    return false;
  }
  function eNa(e, t) {
    e.suppressedReason = "mount_dir_foreign_partition";
    e.remoteHashes = new Map();
    e.pulled = false;
    logForDebugging(`multi-store-sync[${e.mountName}]: mount dir holds a different partition's .memory-sync \u2014 suppressing sync (remove the dir to re-mount)`, {
      level: "warn"
    });
    Et("team_memory_multistore_conflict", "foreign_partition_dir");
    logEvent("tengu_team_mem_foreign_partition_suppressed", {
      trigger: t
    });
  }
  async function QNp(e) {
    if (await tNa(e)) {
      return {
        success: false,
        entriesListed: 0,
        filesWritten: 0,
        filesDeleted: 0,
        error: "mount dir canonicity check failed (fail closed)"
      };
    }
    let t = await ZMa(e);
    if (e.suppressedReason !== null) {
      return nNa;
    }
    let n = await ZNp(e, t);
    if (n !== "not-attempted" && n !== "fell-back") {
      return n;
    }
    let r = n === "fell-back";
    let o;
    try {
      o = await e.backend.list();
    } catch (g) {
      if (r) {
        Ae("team_memory_multistore_bulk_inflate", "fallback_failed");
      }
      return {
        success: false,
        entriesListed: 0,
        filesWritten: 0,
        filesDeleted: 0,
        permanent: g instanceof oq ? g.reason : undefined,
        error: he(g)
      };
    }
    o = o.filter(g => zMa(g.path) && !(e.excludeKey && e.excludeKey(g.path.replace(/^\/+/, ""))));
    let s = new Map();
    for (let g of o) {
      s.set(g.path, {
        id: g.id,
        sha256: g.sha256
      });
    }
    let i = await KMa(e.mountDir, e.excludeKey);
    let a = e.invalidatedBasis ?? null;
    let l = a ?? e.remoteHashes;
    let c = o.filter(g => {
      if (i.entries.get(g.path)?.sha256 === g.sha256) {
        return false;
      }
      if (a !== null && !i.diskPaths.vZc(g.path)) {
        return true;
      }
      return l.get(g.path)?.sha256 !== g.sha256;
    });
    let u = i.diskTrusted ? [...i.diskPaths].filter(g => !s.vZc(g) && l.vZc(g)) : [];
    let d = 0;
    let p = 0;
    let m = 0;
    let f;
    let h;
    await Pyo(c, 6, async g => {
      try {
        let y = await e.backend.read(g.id);
        if (!(a !== null && i.diskPaths.vZc(g.path)) && (await JMa(e, g.path))) {
          m++;
          return;
        }
        await YMa(e, g.path, y.content);
        await XMa(e, g.path);
        d++;
      } catch (y) {
        if (y instanceof tue) {
          s.delete(g.path);
          return;
        }
        if (y instanceof ix) {
          logForDebugging(`multi-store-sync[${e.mountName}]: refusing to write escaping path ${g.path}`, {
            level: "warn"
          });
          s.delete(g.path);
          return;
        }
        if (y instanceof oq) {
          h ??= y.reason;
        }
        f ??= he(y);
      }
    });
    for (let g of u) {
      try {
        await QMa(e, g);
        p++;
      } catch (y) {
        f ??= he(y);
      }
    }
    if (f) {
      if (r) {
        Ae("team_memory_multistore_bulk_inflate", "fallback_failed");
      }
      return {
        success: false,
        entriesListed: o.length,
        filesWritten: d,
        filesDeleted: p,
        permanent: h,
        error: f
      };
    }
    if (e.remoteHashes = s, e.pulled = true, e.invalidatedBasis = null, await GMa(e, {
      expectPresent: t
    }).catch(g => logForDebugging(`multi-store-sync[${e.mountName}]: manifest write failed: ${he(g)}`, {
      level: "warn"
    })), m > 0) {
      Pe("team_memory_multistore_concurrent_write_preserved");
      logForDebugging(`multi-store-sync[${e.mountName}]: preserved ${m} concurrent local write(s) during first pull`, {
        level: "info"
      });
    }
    return {
      success: true,
      entriesListed: o.length,
      filesWritten: d,
      filesDeleted: p,
      filesSkippedConcurrent: m
    };
  }
  async function ZNp(e, t) {
    if (e.pulled || e.remoteHashes.size > 0 || (e.invalidatedBasis ?? null) !== null) {
      return "not-attempted";
    }
    let n = e.backend;
    if (!n.exportAll) {
      return "not-attempted";
    }
    if (Me.CLAUDE_CODE_DISABLE_MEMORY_BULK_INFLATE) {
      return "not-attempted";
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_memory_bulk_inflate", true)) {
      return "not-attempted";
    }
    let r = `multi-store-sync[${e.mountName}]`;
    let o;
    try {
      o = await n.exportAll();
    } catch (p) {
      let m = p instanceof tue ? "not_found" : "http_error";
      Et("team_memory_multistore_bulk_inflate", m);
      logForDebugging(`${r}: bulk inflate unavailable (${he(p)}) \u2014 using per-file pull`, {
        level: "debug"
      });
      return "fell-back";
    }
    let s = new Map();
    let i = new Map();
    let a = 0;
    let l = await BMa({
      source: o,
      maxConcurrentWrites: 6,
      maxLineLength: YNp,
      handleMemory: async p => {
        let m = uWe(p.path);
        let f = zMa(m) && !(e.excludeKey && e.excludeKey(m.replace(/^\/+/, "")));
        if (i.set(p.memoryId, f ? m : null), !f) {
          return;
        }
        try {
          if (await JMa(e, m)) {
            a++;
          } else {
            await YMa(e, m, p.content);
            await XMa(e, m);
          }
        } catch (h) {
          if (h instanceof ix) {
            logForDebugging(`${r}: refusing to write escaping path ${m}`, {
              level: "warn"
            });
            return;
          }
          throw h;
        }
        s.set(m, {
          id: p.memoryId,
          sha256: p.contentSha256
        });
      }
    });
    let c = false;
    for (let [p, m] of s) {
      if (i.get(m.id) !== p) {
        s.delete(p);
        try {
          await QMa(e, p);
        } catch (f) {
          logForDebugging(`${r}: failed to remove superseded ${p} (${he(f)})`, {
            level: "warn"
          });
          c = true;
        }
      }
    }
    let u = s.size - a;
    if (!l.ok || c) {
      let p = l.ok ? "dedupe_unlink_failed" : l.reason;
      Et("team_memory_multistore_bulk_inflate", p);
      logForDebugging(`${r}: bulk inflate incomplete (${p}) after ${u} file(s) \u2014 using per-file pull`, {
        level: "warn"
      });
      return "fell-back";
    }
    let d = Bn([...i.values()], p => p !== null);
    if (e.remoteHashes = s, e.pulled = true, await GMa(e, {
      expectPresent: t
    }).catch(p => logForDebugging(`${r}: manifest write failed: ${he(p)}`, {
      level: "warn"
    })), Pe("team_memory_multistore_bulk_inflate"), a > 0) {
      Pe("team_memory_multistore_concurrent_write_preserved");
    }
    logForDebugging(`${r}: bulk inflated ${u} file(s) from ${l.memoryLines} exported memory line(s)`, {
      level: "info"
    });
    return {
      success: true,
      entriesListed: d,
      filesWritten: u,
      filesDeleted: 0,
      filesSkippedConcurrent: a
    };
  }
  async function tNa(e) {
    let t = e.scope === "user" ? [] : ["team", e.mountName];
    if (e.scope === "team" && (await Wbe(pw(), "team")) === "escape") {
      logForDebugging(`multi-store-sync[${e.mountName}]: team memory root escapes its canonical location \u2014 failing closed`, {
        level: "error"
      });
      return true;
    }
    if ((await Wbe(e.mountDir, ...t)) === "escape") {
      logForDebugging(`multi-store-sync[${e.mountName}]: mount dir escapes its canonical location \u2014 failing closed`, {
        level: "error"
      });
      return true;
    }
    return false;
  }
  async function B3n(e) {
    if (e.backend.mode === "ro") {
      return o9t;
    }
    if (await tNa(e)) {
      Et("team_memory_multistore_conflict", "root_escape");
      return o9t;
    }
    if (await ZMa(e), !e.pulled) {
      return o9t;
    }
    let t = await KMa(e.mountDir, e.excludeKey);
    let n = [];
    for (let [p, m] of t.entries) {
      let f = e.remoteHashes.get(p);
      if (f?.sha256 === m.sha256) {
        continue;
      }
      n.push({
        path: p,
        content: m.content,
        known: f
      });
    }
    let r = true;
    let o = false;
    if (s9t()) {
      let p = await F3n(e.mountDir);
      r = p?.partition === e.backend.partitionId;
      o = p !== null && !r;
    }
    let s = [];
    if (t.diskTrusted && r) {
      for (let [p, m] of e.remoteHashes) {
        if (!t.diskPaths.vZc(p)) {
          s.push({
            path: p,
            ref: m
          });
        }
      }
    }
    let i = 0;
    let a = 0;
    let l = 0;
    let c;
    let u;
    function d(p) {
      if (p instanceof oq) {
        u ??= p.reason;
        c ??= p.message;
        return;
      }
      if (p instanceof cWe) {
        c ??= p.message;
        return;
      }
      c ??= he(p);
    }
    await Pyo(o ? [] : n, 6, async p => {
      try {
        let m;
        if (p.known) {
          m = await e.backend.update(p.known.id, p.content, p.known.sha256);
        } else {
          try {
            m = await e.backend.create(p.path, p.content);
          } catch (f) {
            if (f instanceof jbe && f.existingId) {
              m = await e.backend.update(f.existingId, p.content, null);
            } else {
              throw f;
            }
          }
        }
        e.remoteHashes.set(p.path, m);
        i++;
      } catch (m) {
        if (m instanceof jbe) {
          if (m.actual && p.known) {
            e.remoteHashes.set(p.path, {
              id: p.known.id,
              sha256: m.actual
            });
          }
          l++;
          return;
        }
        d(m);
      }
    });
    await Pyo(s, 6, async p => {
      try {
        await e.backend.delete(p.ref.id, p.ref.sha256);
        e.remoteHashes.delete(p.path);
        a++;
      } catch (m) {
        if (m instanceof jbe) {
          if (m.actual) {
            e.remoteHashes.set(p.path, {
              id: p.ref.id,
              sha256: m.actual
            });
          }
          l++;
          return;
        }
        if (m instanceof tue) {
          e.remoteHashes.delete(p.path);
          return;
        }
        d(m);
      }
    });
    return {
      success: !c,
      filesWritten: i,
      filesDeleted: a,
      conflicts: l,
      secretsSkipped: t.skippedSecretPaths.length,
      diskTrusted: t.diskTrusted,
      permanent: u,
      error: c
    };
  }
  function Oyo() {
    if (Me.CLAUDE_CODE_DISABLE_MEMORY_PERIODIC_RESYNC) {
      return 0;
    }
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_memory_store_resync_interval_minutes", 60);
    if (!Number.isFinite(e) || e <= 0) {
      return 0;
    }
    return Math.max(e, 1) * 60000;
  }
  async function $3n(e, t = "watch") {
    if (e.inFlight) {
      return e.inFlight;
    }
    let n = n1p(e, t);
    e.inFlight = n;
    try {
      return await n;
    } finally {
      e.inFlight = null;
    }
  }
  async function n1p(e, t) {
    let n = {};
    let r = {};
    let s = (await Wbe(pw(), "team")) === "escape";
    if (s) {
      logForDebugging("multi-store-sync: team memory root escapes its canonical location \u2014 failing all stores closed", {
        level: "error"
      });
    }
    await Promise.all(e.stores.map(async a => {
      if (s9t() && a.suppressedReason === null && !a.pulled && a.scope !== "user") {
        let c = await F3n(a.mountDir);
        if (c !== null && c.partition !== a.backend.partitionId) {
          eNa(a, "firstPull");
        }
      }
      if (a.suppressedReason !== null) {
        n[a.mountName] = nNa;
        return;
      }
      let l = c => {
        n[a.mountName] = {
          success: false,
          entriesListed: 0,
          filesWritten: 0,
          filesDeleted: 0,
          error: c
        };
      };
      if (s && a.scope === "team") {
        l("team memory root canonicity check failed (fail closed)");
        return;
      }
      try {
        await H1.mkdir(a.mountDir, {
          recursive: true
        });
        let c = a.scope === "user" ? [] : ["team", a.mountName];
        if ((await Wbe(a.mountDir, ...c)) === "escape") {
          logForDebugging(`multi-store-sync[${a.mountName}]: mount dir escapes its canonical location \u2014 skipping pull+push (fail closed)`, {
            level: "error"
          });
          l("mount dir canonicity check failed (fail closed)");
          return;
        }
        n[a.mountName] = await QNp(a);
      } catch (c) {
        n[a.mountName] = {
          success: false,
          entriesListed: 0,
          filesWritten: 0,
          filesDeleted: 0,
          error: he(c)
        };
      }
    }));
    await Promise.all(e.stores.map(async a => {
      if (a.suppressedReason !== null) {
        r[a.mountName] = o9t;
        return;
      }
      try {
        r[a.mountName] = await B3n(a);
      } catch (l) {
        r[a.mountName] = {
          ...o9t,
          success: false,
          error: he(l)
        };
      }
    }));
    for (let a of e.stores) {
      if (a.suppressedReason !== null) {
        continue;
      }
      let l = n[a.mountName]?.permanent ?? r[a.mountName]?.permanent;
      if (l) {
        a.suppressedReason = l;
        logForDebugging(`multi-store-sync[${a.mountName}]: suppressing further sync (${l})`, {
          level: "warn"
        });
      }
    }
    let i = {
      stores: e.stores.length,
      stores_suppressed: Bn(e.stores, a => a.suppressedReason !== null),
      pull_written: Object.values(n).reduce((a, l) => a + l.filesWritten, 0),
      pull_deleted: Object.values(n).reduce((a, l) => a + l.filesDeleted, 0),
      push_written: Object.values(r).reduce((a, l) => a + l.filesWritten, 0),
      push_deleted: Object.values(r).reduce((a, l) => a + l.filesDeleted, 0),
      conflicts: Object.values(r).reduce((a, l) => a + l.conflicts, 0),
      secrets_skipped: Object.values(r).reduce((a, l) => a + l.secretsSkipped, 0),
      pull_failures: Bn(Object.values(n), a => !a.success),
      push_failures: Bn(Object.values(r), a => !a.success)
    };
    if (logEvent("tengu_team_mem_multistore_sync", {
      ...i,
      trigger: t
    }), i.pull_failures === 0) {
      Pe("team_memory_multistore_pull");
    } else {
      Ae("team_memory_multistore_pull", "multistore_pull_failed");
    }
    if (i.push_failures === 0) {
      Pe("team_memory_multistore_push");
    } else {
      Ae("team_memory_multistore_push", "multistore_push_failed");
    }
    if (i.conflicts > 0) {
      Pe("team_memory_multistore_conflict");
    }
    logForDebugging(`multi-store-sync: ${i.stores} store(s) \u2014 ` + `pull \u2193${i.pull_written}/\u2212${i.pull_deleted}, ` + `push \u2191${i.push_written}/\u2212${i.push_deleted}` + (i.conflicts ? `, ${i.conflicts} conflict(s)` : "") + (i.pull_failures || i.push_failures ? `, failures pull=${i.pull_failures} push=${i.push_failures}` : ""), {
      level: "info"
    });
    return {
      pulls: n,
      pushes: r
    };
  }
  var HMa;
  var H1;
  var A$;
  var YNp;
  var XNp;
  var o9t;
  var nNa;
  var rNa = __lazy(() => {
    Eb();
    n9t();
    a1();
    je();
    pr();
    dt();
    Kv();
    ln();
    $n();
    Ot();
    HQr();
    $Ma();
    HMa = require("crypto");
    H1 = require("fs/promises");
    A$ = require("path");
    YNp = 102400 * 6 + 16384;
    XNp = [".md", ".txt", ".json", ".jsonl"];
    o9t = {
      success: true,
      filesWritten: 0,
      filesDeleted: 0,
      conflicts: 0,
      secretsSkipped: 0
    };
    nNa = {
      success: true,
      entriesListed: 0,
      filesWritten: 0,
      filesDeleted: 0
    };
  });
  var G3n = {};
  __export(G3n, {
    stopMemoryWatcher: () => stopMemoryWatcher,
    startMemoryWatcher: () => startMemoryWatcher,
    rebuildStoreSet: () => rebuildStoreSet,
    notifyMemoryWrite: () => notifyMemoryWrite,
    maybeResyncStaleStores: () => maybeResyncStaleStores,
    isPermanentFailure: () => isPermanentFailure,
    _startFileWatcherForTesting: () => _startFileWatcherForTesting,
    _resyncTimerForTesting: () => _resyncTimerForTesting,
    _resetWatcherStateForTesting: () => _resetWatcherStateForTesting,
    _multiStoreStateForTesting: () => _multiStoreStateForTesting,
    _lastSyncCompletedAtForTesting: () => _lastSyncCompletedAtForTesting,
    _armResyncTimerForTesting: () => _armResyncTimerForTesting,
    UNLINK_RECOVERABLE_REASONS_BY_SCOPE: () => UNLINK_RECOVERABLE_REASONS_BY_SCOPE
  });
  function H3n() {
    return {
      syncState: null,
      debounceTimer: null,
      pushInProgress: false,
      hasPendingChanges: false,
      changeSeq: 0,
      currentPushPromise: null,
      pushSuppressedReason: null,
      lastSyncCompletedAt: null
    };
  }
  function aNa(e, t) {
    return UNLINK_RECOVERABLE_REASONS_BY_SCOPE[e].vZc(t);
  }
  function isPermanentFailure(e) {
    if (e.errorType === "no_oauth" || e.errorType === "server_unavailable") {
      return true;
    }
    if (e.httpStatus !== undefined && e.httpStatus >= 400 && e.httpStatus < 500 && e.httpStatus !== 409 && e.httpStatus !== 429) {
      return true;
    }
    return false;
  }
  function Dyo(e) {
    let t = vf();
    let n = Kmt.relative(t, e).replaceAll(Kmt.sep, "/");
    if (n === "" || n.startsWith("..")) {
      return null;
    }
    let r = n.split("/");
    if (k3n(r[0]) === "team") {
      return "team";
    }
    if (nEe(n)) {
      return null;
    }
    return "user";
  }
  function oNa(e, t, n) {
    let r = Nb[e];
    if (r.pushSuppressedReason !== null) {
      return;
    }
    r.pushSuppressedReason = t;
    let o = aNa(e, t) ? " (recoverable via file deletion)" : "";
    if (logForDebugging(`memory-watcher[${e}]: suppressing retry for the rest of this session (${t})${o}`, {
      level: "warn"
    }), e === "team") {
      logEvent("tengu_team_mem_push_suppressed", {
        reason: t,
        ...n
      });
    }
  }
  async function cNa(e, t = "watch") {
    let n = Nb[e];
    let r = e === "team" ? t3 : e === "user" ? QG : null;
    if (r) {
      n.pushInProgress = true;
      let s = n.changeSeq;
      try {
        let i = r.stores;
        let a = new Set(i.filter(d => d.suppressedReason !== null).map(d => d.mountName));
        let l = await $3n(r, t);
        if (!Object.values(l.pushes).some(d => !d.success) && n.changeSeq === s) {
          n.hasPendingChanges = false;
        }
        if (e === "team") {
          for (let d of i) {
            if (d.suppressedReason !== null && !a.vZc(d.mountName)) {
              logEvent("tengu_team_mem_push_suppressed", {
                reason: d.suppressedReason,
                multistore: true,
                mount: d.mountName
              });
            }
          }
        }
        if (i.length > 0 && i.every(d => d.suppressedReason !== null)) {
          oNa(e, i[0].suppressedReason, {
            multistore: true,
            stores: i.length
          });
        }
      } catch (i) {
        logForDebugging(`memory-watcher[${e}]: multi-store sync error: ${he(i)}`, {
          level: "warn"
        });
      } finally {
        n.lastSyncCompletedAt = Date.now();
        n.pushInProgress = false;
        n.currentPushPromise = null;
        Ymt();
      }
      return;
    }
    if (!n.syncState) {
      return;
    }
    n.pushInProgress = true;
    let o = n.changeSeq;
    try {
      let s = await Iyo(n.syncState);
      if (s.success) {
        if (e !== "user" || n.changeSeq === o) {
          n.hasPendingChanges = false;
        }
      }
      if (s.success && s.filesUploaded > 0) {
        logForDebugging(`memory-watcher[${e}]: pushed ${s.filesUploaded} files`, {
          level: "info"
        });
      } else if (!s.success) {
        if (logForDebugging(`memory-watcher[${e}]: push failed: ${s.error}`, {
          level: "warn"
        }), isPermanentFailure(s)) {
          if (s.serverErrorCode === "team_memory_group_acl_denied" || s.serverErrorCode === "team_memory_group_acl_unconfigured") {
            logForDebugging(`memory-watcher[${e}]: ${s.serverMessage || "Team memory is restricted to specific groups for your organization."} Contact your administrator for access.`, {
              level: "warn"
            });
          }
          oNa(e, s.serverErrorCode ?? (s.httpStatus !== undefined ? `http_${s.httpStatus}` : s.errorType ?? "unknown"), {
            ...(s.httpStatus && {
              status: s.httpStatus
            }),
            ...(s.serverMessage !== undefined && {
              server_message: s.serverMessage
            }),
            ...(s.serverErrorCode !== undefined && {
              server_error_code: s.serverErrorCode
            }),
            ...(s.serverErrorType !== undefined && {
              server_error_type: s.serverErrorType
            })
          });
        }
      }
    } catch (s) {
      logForDebugging(`memory-watcher[${e}]: push error: ${he(s)}`, {
        level: "warn"
      });
    } finally {
      n.pushInProgress = false;
      n.currentPushPromise = null;
    }
  }
  function j3n(e) {
    let t = Nb[e];
    if (t.pushSuppressedReason !== null) {
      return;
    }
    if (t.hasPendingChanges = true, t.changeSeq++, t.debounceTimer) {
      clearTimeout(t.debounceTimer);
    }
    t.debounceTimer = setTimeout(a1p, 2000, e);
  }
  function Lyo() {
    return QG ? r9t() : e6e();
  }
  function uNa(e) {
    return e === "user" ? Lyo() : r9t();
  }
  function a1p(e) {
    let t = Nb[e];
    if (e === "user" && !Lyo()) {
      if (t.debounceTimer) {
        clearTimeout(t.debounceTimer);
        t.debounceTimer = null;
      }
      if (t.syncState) {
        t.syncState.aborted = true;
      }
      logForDebugging("memory-watcher[user]: personal sync disabled mid-session \u2014 pausing (reversible)", {
        level: "info"
      });
      return;
    }
    if (e === "user" && !t.pushInProgress && t.syncState?.aborted) {
      t.syncState.aborted = false;
    }
    if (t.pushInProgress) {
      j3n(e);
      return;
    }
    if (t.pushSuppressedReason !== null) {
      return;
    }
    if (!t.hasPendingChanges) {
      return;
    }
    t.currentPushPromise = cNa(e);
  }
  function maybeResyncStaleStores() {
    try {
      if (!zmt) {
        return;
      }
      let e = Oyo();
      if (e <= 0) {
        return;
      }
      let t = Date.now();
      for (let n of ["team", "user"]) {
        if (!(n === "team" ? t3 : QG)) {
          continue;
        }
        let o = Nb[n];
        if (o.pushSuppressedReason !== null || o.pushInProgress) {
          continue;
        }
        if (o.lastSyncCompletedAt === null || t - o.lastSyncCompletedAt <= e) {
          continue;
        }
        if (!uNa(n)) {
          continue;
        }
        o.currentPushPromise = cNa(n, "periodic");
      }
    } catch (e) {
      logForDebugging(`memory-watcher: stale-store check failed: ${he(e)}`, {
        level: "warn"
      });
    }
  }
  function Ymt() {
    if (e3) {
      clearTimeout(e3);
      e3 = null;
    }
    if (!zmt) {
      return;
    }
    let e = Oyo();
    if (e <= 0) {
      return;
    }
    let t = Date.now();
    let n = null;
    for (let s of ["team", "user"]) {
      if (!(s === "team" ? t3 : QG)) {
        continue;
      }
      let a = Nb[s];
      if (a.pushSuppressedReason !== null || a.pushInProgress || a.lastSyncCompletedAt === null) {
        continue;
      }
      let l = uNa(s) ? a.lastSyncCompletedAt + e : t + e;
      if (n === null || l < n) {
        n = l;
      }
    }
    if (n === null) {
      return;
    }
    let r = Math.max(n - t, 1000);
    let o = setTimeout(() => {
      e3 = null;
      maybeResyncStaleStores();
      Ymt();
    }, r);
    o.unref?.();
    e3 = o;
  }
  function Myo(e) {
    if (e === "team" && t3) {
      return true;
    }
    if (e === "user" && QG) {
      return true;
    }
    return Nb[e].syncState !== null;
  }
  async function Nyo(e) {
    if (zmt) {
      return;
    }
    zmt = true;
    await q3n.mkdir(e, {
      recursive: true
    }).catch(r => logForDebugging(`memory-watcher: mkdir ${e} failed: ${he(r)}`, {
      level: "warn"
    }));
    let t = r => {
      let o = Dyo(r);
      if (o === null || !Myo(o)) {
        return;
      }
      j3n(o);
    };
    let n = r => {
      let o = Dyo(r);
      if (o === null || !Myo(o)) {
        return;
      }
      let s = Nb[o];
      if (s.pushSuppressedReason !== null && aNa(o, s.pushSuppressedReason)) {
        logForDebugging(`memory-watcher[${o}]: unlink cleared suppression (was: ${s.pushSuppressedReason})`, {
          level: "info"
        });
        s.pushSuppressedReason = null;
      }
      j3n(o);
    };
    rEe = jF.watch(e, {
      persistent: true,
      ignoreInitial: true,
      usePolling: o1p,
      interval: 2000,
      ignorePermissionErrors: true,
      ignored: r => {
        let o = Kmt.relative(vf(), r).replaceAll(Kmt.sep, "/");
        if (o === "" || o.startsWith("..")) {
          return false;
        }
        let s = o.split("/");
        if (k3n(s[0]) === "team") {
          return s.at(-1) === ".memory-sync";
        }
        return nEe(o);
      }
    });
    rEe.on("add", t);
    rEe.on("change", t);
    rEe.on("unlink", n);
    rEe.on("error", r => {
      logForDebugging(`memory-watcher: watcher error: ${he(r)}`, {
        level: "warn"
      });
    });
    logForDebugging(`memory-watcher: watching ${e}`, {
      level: "debug"
    });
    Ymt();
  }
  async function startMemoryWatcher() {
    try {
      await c1p();
    } finally {
      EMa();
    }
  }
  async function c1p() {
    if (!checkHasTrustDialogAccepted()) {
      return;
    }
    let e = process.env.CLAUDE_MEMORY_STORES?.trim() ? r9t() : uO() && kyo("team");
    let t = e6e() && kyo("user");
    if (!e && !t) {
      return;
    }
    Ti(async () => stopMemoryWatcher());
    let n = null;
    let r = false;
    if (e) {
      try {
        n = eue();
      } catch (s) {
        logForDebugging(`memory-watcher: CLAUDE_MEMORY_STORES invalid, disabling team sync: ${he(s)}`, {
          level: "error"
        });
        logEvent("tengu_team_mem_multistore_config_invalid", {
          error: he(s)
        });
        Ae("team_memory_sync_watcher_start", "config_invalid");
        n = null;
        r = true;
      }
    }
    let o = await getGithubRepo();
    if (t && o) {
      Nb.user.syncState = Ryo("user", o);
    }
    if (n !== null) {
      let s = n.filter(l => l.scope === "team");
      let i = n.filter(l => l.scope === "user");
      if (s.length > 0) {
        t3 = L3n(WDn(s), s.map(l => ({
          mount: l.mount,
          scope: l.scope
        })));
      }
      if (i.length > 0) {
        QG = L3n(WDn(i), i.map(l => ({
          mount: l.mount,
          scope: l.scope
        })));
        Nb.user.syncState = null;
      }
      let a = async (l, c) => {
        if (!c) {
          return;
        }
        let u = Nb[l];
        u.pushInProgress = true;
        let d = $3n(c, "startup");
        u.currentPushPromise = d.then(() => {
          return;
        }).catch(() => {
          return;
        });
        try {
          await d;
        } catch (p) {
          logForDebugging(`memory-watcher[${l}]: multi-store initial sync failed: ${he(p)}`, {
            level: "warn"
          });
        } finally {
          u.lastSyncCompletedAt = Date.now();
          u.pushInProgress = false;
          u.currentPushPromise = null;
          Ymt();
        }
      };
      if (await a("team", t3), await a("user", QG), t3) {
        Pe("team_memory_sync_watcher_start");
        logEvent("tengu_team_mem_sync_started", {
          multistore: true,
          stores: t3.stores.length,
          watcher_started: true
        });
      }
      if (QG) {
        Pe("personal_memory_sync_watcher_start");
        logEvent("tengu_personal_mem_sync_started", {
          multistore: true,
          watcher_started: true
        });
      }
    }
    if (!o) {
      if (logForDebugging("memory-watcher: no github.com remote, skipping sync", {
        level: "debug"
      }), t3 || QG) {
        await Nyo(QG ? vf() : pw());
      }
      return;
    }
    if (e && n === null && !r) {
      Nb.team.syncState = Ryo("team", o);
    }
    if (Nb.team.syncState) {
      await sNa("team");
    }
    if (Nb.user.syncState) {
      await sNa("user");
    }
    if (Nb.team.syncState || Nb.user.syncState || t3 || QG) {
      let s = Nb.user.syncState || QG;
      await Nyo(s ? vf() : pw());
    }
  }
  async function sNa(e) {
    let t = Nb[e];
    if (!t.syncState) {
      return;
    }
    if (t.syncState.pulled) {
      if (logForDebugging(`memory-watcher[${e}]: initial pull skipped \u2014 basis already established by lazy pull-on-first-push`, {
        level: "debug"
      }), e === "team") {
        Pe("team_memory_sync_watcher_start");
        logEvent("tengu_team_mem_sync_started", {
          initial_pull_success: true,
          initial_files_pulled: 0,
          initial_files_reaped: 0,
          watcher_started: true,
          server_has_content: t.syncState.serverChecksums.size > 0
        });
      } else {
        Pe("personal_memory_sync_watcher_start");
      }
      return;
    }
    let n = false;
    let r = 0;
    let o = 0;
    let s = false;
    try {
      let i = await Ayo(t.syncState, {
        skipEtagCache: true
      });
      if (n = i.success, s = i.entryCount > 0, i.success && (i.filesWritten > 0 || i.filesReaped > 0)) {
        r = i.filesWritten;
        o = i.filesReaped;
        logForDebugging(`memory-watcher[${e}]: initial pull got ${i.filesWritten} files` + (i.filesReaped > 0 ? `, reaped ${i.filesReaped} tombstoned` : ""), {
          level: "info"
        });
      }
    } catch (i) {
      logForDebugging(`memory-watcher[${e}]: initial pull failed: ${he(i)}`, {
        level: "warn"
      });
    }
    if (e === "team") {
      Pe("team_memory_sync_watcher_start");
      logEvent("tengu_team_mem_sync_started", {
        initial_pull_success: n,
        initial_files_pulled: r,
        initial_files_reaped: o,
        watcher_started: true,
        server_has_content: s
      });
    } else {
      Pe("personal_memory_sync_watcher_start");
    }
  }
  async function notifyMemoryWrite(e) {
    let t = Dyo(e);
    if (t === null || !Myo(t)) {
      return;
    }
    j3n(t);
  }
  async function stopMemoryWatcher() {
    if (e3) {
      clearTimeout(e3);
      e3 = null;
    }
    for (let e of ["team", "user"]) {
      let t = Nb[e];
      if (t.debounceTimer) {
        clearTimeout(t.debounceTimer);
        t.debounceTimer = null;
      }
    }
    if (rEe) {
      await rEe.close().catch(() => {});
      rEe = null;
    }
    if (await Promise.all(["team", "user"].map(async e => {
      let t = Nb[e];
      if (t.currentPushPromise) {
        try {
          await t.currentPushPromise;
        } catch {}
      }
    })), e3) {
      clearTimeout(e3);
      e3 = null;
    }
    await Promise.all(["team", "user"].map(async e => {
      let t = Nb[e];
      if (!t.hasPendingChanges || t.pushSuppressedReason !== null) {
        return;
      }
      if (e === "user" && !Lyo()) {
        if (t.hasPendingChanges = false, t.syncState) {
          t.syncState.aborted = true;
        }
        logForDebugging("memory-watcher[user]: personal sync disabled \u2014 skipping shutdown flush", {
          level: "info"
        });
        return;
      }
      try {
        let n = e === "team" ? t3 : e === "user" ? QG : null;
        if (n) {
          await Promise.all(n.stores.filter(r => r.suppressedReason === null).map(r => B3n(r)));
        } else if (t.syncState) {
          if (e === "user") {
            t.syncState.aborted = false;
          }
          await Iyo(t.syncState);
        }
      } catch {}
    }));
  }
  async function rebuildStoreSet(e) {
    if (!zmt) {
      return;
    }
    if (!r9t() || !s9t()) {
      return;
    }
    let t = Nb.team;
    if (t.syncState !== null) {
      return;
    }
    let n = false;
    while (t.currentPushPromise) {
      n = true;
      let a = t.currentPushPromise;
      if (await a.catch(() => {}), t.currentPushPromise === a) {
        t.currentPushPromise = null;
      }
    }
    if (t.pushInProgress) {
      return;
    }
    if (t.pushInProgress = true, t.debounceTimer) {
      clearTimeout(t.debounceTimer);
      t.debounceTimer = null;
    }
    let r = t3;
    let o = t.hasPendingChanges;
    let s = t.changeSeq;
    let i = (async () => {
      let a = new Set((r?.stores ?? []).filter(m => m.suppressedReason !== null || !m.pulled || m.backend.mode === "ro").map(m => m.mountName));
      if (r) {
        await Promise.all(r.stores.filter(m => !a.vZc(m.mountName)).map(async m => {
          let f = await B3n(m).catch(() => null);
          if (f === null || !f.success || !m.pulled || f.secretsSkipped > 0 || f.conflicts > 0 || f.diskTrusted === false) {
            a.add(m.mountName);
          }
        }));
      }
      let l = (e ?? []).filter(m => m.scope !== "user");
      let c = l.length > 0 ? L3n(WDn(l), l.map(m => ({
        mount: m.mount,
        scope: m.scope
      }))) : null;
      let u = new Set();
      if (c && r) {
        let m = new Map(r.stores.map(f => [f.mountDir, f]));
        c.stores = c.stores.map(f => {
          let h = m.get(f.mountDir);
          if (h?.backend.partitionId !== f.backend.partitionId) {
            return f;
          }
          u.add(f.mountDir);
          return {
            ...f,
            remoteHashes: h.remoteHashes,
            pulled: h.pulled,
            createdAtMs: h.createdAtMs,
            pullWrittenMtimes: h.pullWrittenMtimes,
            suppressedReason: h.suppressedReason,
            invalidatedBasis: h.invalidatedBasis
          };
        });
      }
      if (t.changeSeq !== s) {
        for (let m of r?.stores ?? []) {
          a.add(m.mountName);
        }
      }
      if (t3 = c, t.changeSeq === s) {
        t.hasPendingChanges = false;
      }
      t.pushSuppressedReason = null;
      t.lastSyncCompletedAt = null;
      let d = (r?.stores ?? []).filter(m => m.scope !== "user" && /^[A-Za-z0-9_-]+$/.test(m.mountName) && !u.vZc(m.mountDir) && !a.vZc(m.mountName));
      let p = [];
      for (let m of d) {
        if ((await Wbe(m.mountDir, "team", m.mountName)) === "ok") {
          p.push(m);
        }
      }
      if (await Promise.all(p.map(m => q3n.rm(m.mountDir, {
        recursive: true,
        force: true
      }).catch(f => logForDebugging(`memory-watcher: reap ${m.mountName} failed: ${he(f)}`, {
        level: "warn"
      })))), logEvent("tengu_team_mem_store_set_rebuilt", {
        old_stores: r?.stores.length ?? 0,
        new_stores: c?.stores.length ?? 0,
        dirs_reaped: p.length,
        flush_failed_stores: a.size,
        had_in_flight: n,
        had_pending_flush: o
      }), c) {
        try {
          await $3n(c, "rebuild");
        } catch (m) {
          logForDebugging(`memory-watcher: rebuild initial sync failed: ${he(m)}`, {
            level: "warn"
          });
        }
        t.lastSyncCompletedAt = Date.now();
      }
    })();
    t.currentPushPromise = i.catch(() => {});
    try {
      await i;
    } finally {
      t.pushInProgress = false;
      t.currentPushPromise = null;
      Ymt();
    }
  }
  function _resetWatcherStateForTesting(e) {
    if (rEe = null, e3) {
      clearTimeout(e3);
      e3 = null;
    }
    zmt = e?.skipWatcher ?? false;
    t3 = e?.multiStoreState ?? null;
    QG = e?.userMultiStoreState ?? null;
    Nb.team = H3n();
    Nb.team.syncState = e?.teamSyncState ?? null;
    Nb.team.pushSuppressedReason = e?.teamPushSuppressedReason ?? null;
    Nb.team.lastSyncCompletedAt = e?.teamLastSyncCompletedAt ?? null;
    Nb.user = H3n();
    Nb.user.syncState = e?.userSyncState ?? null;
    Nb.user.pushSuppressedReason = e?.userPushSuppressedReason ?? null;
    Nb.user.lastSyncCompletedAt = e?.userLastSyncCompletedAt ?? null;
  }
  function _startFileWatcherForTesting(e) {
    return Nyo(e);
  }
  function _lastSyncCompletedAtForTesting(e) {
    return Nb[e].lastSyncCompletedAt;
  }
  function _resyncTimerForTesting() {
    return e3;
  }
  function _multiStoreStateForTesting() {
    return t3;
  }
  function _armResyncTimerForTesting() {
    Ymt();
  }
  var q3n;
  var Kmt;
  var o1p;
  var rEe = null;
  var zmt = false;
  var e3 = null;
  var Nb;
  var t3 = null;
  var QG = null;
  var UNLINK_RECOVERABLE_REASONS_BY_SCOPE;
  var V3n = __lazy(() => {
    oue();
    Eb();
    n9t();
    a1();
    hd();
    je();
    dt();
    na();
    ln();
    Ot();
    dlt();
    Tyo();
    LMa();
    rNa();
    q3n = require("fs/promises");
    Kmt = require("path");
    o1p = typeof Bun < "u";
    Nb = {
      team: H3n(),
      user: H3n()
    };
    UNLINK_RECOVERABLE_REASONS_BY_SCOPE = {
      team: new Set(["team_memory_too_many_entries", "http_413"]),
      user: new Set()
    };
  });
  var z3n;
  var Fyo;
  var Uyo;
  var Byo;
  var i9t = __lazy(() => {
    uMe();
    z3n = we(() => v.strictObject({
      file_path: v.string().describe("The absolute path to the file to modify"),
      old_string: v.string().describe("The text to replace"),
      new_string: v.string().describe("The text to replace it with (must be different from old_string)"),
      replace_all: VI(v.boolean().default(false).optional()).describe("Replace all occurrences of old_string (default false)")
    }));
    Fyo = we(() => v.object({
      oldStart: v.number(),
      oldLines: v.number(),
      newStart: v.number(),
      newLines: v.number(),
      lines: v.array(v.string())
    }));
    Uyo = we(() => v.object({
      filename: v.string(),
      status: v.enum(["modified", "added"]),
      additions: v.number(),
      deletions: v.number(),
      changes: v.number(),
      patch: v.string(),
      repository: v.string().nullable().optional().describe("GitHub owner/repo when available")
    }));
    Byo = we(() => v.object({
      filePath: v.string().describe("The file path that was edited"),
      oldString: v.string().describe("The original string that was replaced"),
      newString: v.string().describe("The new string that replaced it"),
      originalFile: v.string().nullable().describe("The original file contents before editing"),
      structuredPatch: v.array(Fyo()).describe("Diff patch showing the changes"),
      userModified: v.boolean().describe("Whether the user modified the proposed changes"),
      replaceAll: v.boolean().describe("Whether all occurrences were replaced"),
      gitDiff: Uyo().optional()
    }));
  });
  function y1p(e) {
    if (!e.endsWith(".md")) {
      return false;
    }
    if (Gbe(e)) {
      return false;
    }
    return wJ(e);
  }
  function K3n(e, t) {
    if (!y1p(e) || !Kne.test(t)) {
      return t;
    }
    let {
      frontmatter: n,
      body: r
    } = zDn(t);
    if (KDn(n, "originSessionId") !== null) {
      return t;
    }
    return l4i(a4i(n, {
      originSessionId: getSessionId()
    }), r);
  }
  var $yo = __lazy(() => {
    at();
    fv();
    A$t();
    Eb();
    a1();
  });
  class Hyo {
    constructor(e) {
      this._client = e;
    }
    async *callToolStream(e, t = hj, n) {
      let r = this._client;
      let o = {
        ...n,
        task: n?.task ?? (r.isToolTask(e.name) ? {} : undefined)
      };
      let s = r.requestStream({
        method: "tools/call",
        params: e
      }, t, o);
      let i = r.getToolOutputValidator(e.name);
      for await (let a of s) {
        if (a.type === "result" && i) {
          let l = a.result;
          if (!l.structuredContent && !l.isError) {
            yield {
              type: "error",
              error: new yi(Ei.InvalidRequest, `Tool ${e.name} has an output schema but did not return structured content`)
            };
            return;
          }
          if (l.structuredContent) {
            try {
              let c = i(l.structuredContent);
              if (!c.valid) {
                yield {
                  type: "error",
                  error: new yi(Ei.InvalidParams, `Structured content does not match the tool's output schema: ${c.errorMessage}`)
                };
                return;
              }
            } catch (c) {
              if (c instanceof yi) {
                yield {
                  type: "error",
                  error: c
                };
                return;
              }
              yield {
                type: "error",
                error: new yi(Ei.InvalidParams, `Failed to validate structured content: ${c instanceof Error ? c.message : String(c)}`)
              };
              return;
            }
          }
        }
        yield a;
      }
    }
    async getTask(e, t) {
      return this._client.getTask({
        taskId: e
      }, t);
    }
    async getTaskResult(e, t, n) {
      return this._client.getTaskResult({
        taskId: e
      }, t, n);
    }
    async listTasks(e, t) {
      return this._client.listTasks(e ? {
        cursor: e
      } : undefined, t);
    }
    async cancelTask(e, t) {
      return this._client.cancelTask({
        taskId: e
      }, t);
    }
    requestStream(e, t, n) {
      return this._client.requestStream(e, t, n);
    }
  }
  var mNa = __lazy(() => {});
  function Y3n(e, t) {
    if (!e || t === null || typeof t !== "object") {
      return;
    }
    if (e.type === "object" && e.properties && typeof e.properties === "object") {
      let n = t;
      let r = e.properties;
      for (let o of Object.keys(r)) {
        let s = r[o];
        if (n[o] === undefined && Object.prototype.hasOwnProperty.call(s, "default")) {
          n[o] = s.default;
        }
        if (n[o] !== undefined) {
          Y3n(s, n[o]);
        }
      }
    }
    if (Array.isArray(e.anyOf)) {
      for (let n of e.anyOf) {
        if (typeof n !== "boolean") {
          Y3n(n, t);
        }
      }
    }
    if (Array.isArray(e.oneOf)) {
      for (let n of e.oneOf) {
        if (typeof n !== "boolean") {
          Y3n(n, t);
        }
      }
    }
  }
  function _1p(e) {
    if (!e) {
      return {
        supportsFormMode: false,
        supportsUrlMode: false
      };
    }
    let t = e.form !== undefined;
    let n = e.url !== undefined;
    return {
      supportsFormMode: t || !t && !n,
      supportsUrlMode: n
    };
  }
  var J3n;
  var fNa = __lazy(() => {
    dIr();
    KPr();
    qet();
    mNa();
    J3n = class J3n extends pOt {
      constructor(e, t) {
        super(t);
        if (this._clientInfo = e, this._cachedToolOutputValidators = new Map(), this._cachedKnownTaskTools = new Set(), this._cachedRequiredTaskTools = new Set(), this._listChangedDebounceTimers = new Map(), this._capabilities = t?.capabilities ?? {}, this._jsonSchemaValidator = t?.jsonSchemaValidator ?? new UOt(), t?.listChanged) {
          this._pendingListChangedConfig = t.listChanged;
        }
      }
      _setupListChangedHandlers(e) {
        if (e.tools && this._serverCapabilities?.tools?.listChanged) {
          this._setupListChangedHandler("tools", uHe, e.tools, async () => (await this.listTools()).tools);
        }
        if (e.prompts && this._serverCapabilities?.prompts?.listChanged) {
          this._setupListChangedHandler("prompts", iOt, e.prompts, async () => (await this.listPrompts()).prompts);
        }
        if (e.resources && this._serverCapabilities?.resources?.listChanged) {
          this._setupListChangedHandler("resources", oOt, e.resources, async () => (await this.listResources()).resources);
        }
      }
      get experimental() {
        if (!this._experimental) {
          this._experimental = {
            tasks: new Hyo(this)
          };
        }
        return this._experimental;
      }
      registerCapabilities(e) {
        if (this.transport) {
          throw Error("Cannot register capabilities after connecting to transport");
        }
        this._capabilities = umn(this._capabilities, e);
      }
      setRequestHandler(e, t) {
        let r = Kae(e)?.method;
        if (!r) {
          throw Error("Schema is missing a method literal");
        }
        let o;
        if (V4(r)) {
          let i = r;
          o = i._zod?.def?.value ?? i.value;
        } else {
          let i = r;
          o = i._def?.value ?? i.value;
        }
        if (typeof o !== "string") {
          throw Error("Schema method literal must be a string");
        }
        let s = o;
        if (s === "elicitation/create") {
          let i = async (a, l) => {
            let c = mj(lye, a);
            if (!c.success) {
              let y = c.error instanceof Error ? c.error.message : String(c.error);
              throw new yi(Ei.InvalidParams, `Invalid elicitation request: ${y}`);
            }
            let {
              params: u
            } = c.data;
            u.mode = u.mode ?? "form";
            let {
              supportsFormMode: d,
              supportsUrlMode: p
            } = _1p(this._capabilities.elicitation);
            if (u.mode === "form" && !d) {
              throw new yi(Ei.InvalidParams, "Client does not support form-mode elicitation requests");
            }
            if (u.mode === "url" && !p) {
              throw new yi(Ei.InvalidParams, "Client does not support URL-mode elicitation requests");
            }
            let m = await Promise.resolve(t(a, l));
            if (u.task) {
              let y = mj(aye, m);
              if (!y.success) {
                let _ = y.error instanceof Error ? y.error.message : String(y.error);
                throw new yi(Ei.InvalidParams, `Invalid task creation result: ${_}`);
              }
              return y.data;
            }
            let f = mj(Bxe, m);
            if (!f.success) {
              let y = f.error instanceof Error ? f.error.message : String(f.error);
              throw new yi(Ei.InvalidParams, `Invalid elicitation result: ${y}`);
            }
            let h = f.data;
            let g = u.mode === "form" ? u.requestedSchema : undefined;
            if (u.mode === "form" && h.action === "accept" && h.content && g) {
              if (this._capabilities.elicitation?.form?.applyDefaults) {
                try {
                  Y3n(g, h.content);
                } catch {}
              }
            }
            return h;
          };
          return super.setRequestHandler(e, i);
        }
        if (s === "sampling/createMessage") {
          let i = async (a, l) => {
            let c = mj(k0r, a);
            if (!c.success) {
              let h = c.error instanceof Error ? c.error.message : String(c.error);
              throw new yi(Ei.InvalidParams, `Invalid sampling request: ${h}`);
            }
            let {
              params: u
            } = c.data;
            let d = await Promise.resolve(t(a, l));
            if (u.task) {
              let h = mj(aye, d);
              if (!h.success) {
                let g = h.error instanceof Error ? h.error.message : String(h.error);
                throw new yi(Ei.InvalidParams, `Invalid task creation result: ${g}`);
              }
              return h.data;
            }
            let m = u.tools || u.toolChoice ? cOt : dHe;
            let f = mj(m, d);
            if (!f.success) {
              let h = f.error instanceof Error ? f.error.message : String(f.error);
              throw new yi(Ei.InvalidParams, `Invalid sampling result: ${h}`);
            }
            return f.data;
          };
          return super.setRequestHandler(e, i);
        }
        return super.setRequestHandler(e, t);
      }
      assertCapability(e, t) {
        if (!this._serverCapabilities?.[e]) {
          throw Error(`Server does not support ${e} (required for ${t})`);
        }
      }
      async connect(e, t) {
        if (await super.connect(e), e.sessionId !== undefined) {
          return;
        }
        try {
          let n = await this.request({
            method: "initialize",
            params: {
              protocolVersion: "2025-11-25",
              capabilities: this._capabilities,
              clientInfo: this._clientInfo
            }
          }, QPt, t);
          if (n === undefined) {
            throw Error(`Server sent invalid initialize result: ${n}`);
          }
          if (!Npn.includes(n.protocolVersion)) {
            throw Error(`Server's protocol version is not supported: ${n.protocolVersion}`);
          }
          if (this._serverCapabilities = n.capabilities, this._serverVersion = n.serverInfo, e.setProtocolVersion) {
            e.setProtocolVersion(n.protocolVersion);
          }
          if (this._instructions = n.instructions, await this.notification({
            method: "notifications/initialized"
          }), this._pendingListChangedConfig) {
            this._setupListChangedHandlers(this._pendingListChangedConfig);
            this._pendingListChangedConfig = undefined;
          }
        } catch (n) {
          throw this.close(), n;
        }
      }
      getServerCapabilities() {
        return this._serverCapabilities;
      }
      getServerVersion() {
        return this._serverVersion;
      }
      getInstructions() {
        return this._instructions;
      }
      assertCapabilityForMethod(e) {
        switch (e) {
          case "logging/setLevel":
            if (!this._serverCapabilities?.logging) {
              throw Error(`Server does not support logging (required for ${e})`);
            }
            break;
          case "prompts/get":
          case "prompts/list":
            if (!this._serverCapabilities?.prompts) {
              throw Error(`Server does not support prompts (required for ${e})`);
            }
            break;
          case "resources/list":
          case "resources/templates/list":
          case "resources/read":
          case "resources/subscribe":
          case "resources/unsubscribe":
            if (!this._serverCapabilities?.resources) {
              throw Error(`Server does not support resources (required for ${e})`);
            }
            if (e === "resources/subscribe" && !this._serverCapabilities.resources.subscribe) {
              throw Error(`Server does not support resource subscriptions (required for ${e})`);
            }
            break;
          case "tools/call":
          case "tools/list":
            if (!this._serverCapabilities?.tools) {
              throw Error(`Server does not support tools (required for ${e})`);
            }
            break;
          case "completion/complete":
            if (!this._serverCapabilities?.completions) {
              throw Error(`Server does not support completions (required for ${e})`);
            }
            break;
          case "initialize":
            break;
          case "ping":
            break;
        }
      }
      assertNotificationCapability(e) {
        switch (e) {
          case "notifications/roots/list_changed":
            if (!this._capabilities.roots?.listChanged) {
              throw Error(`Client does not support roots list changed notifications (required for ${e})`);
            }
            break;
          case "notifications/initialized":
            break;
          case "notifications/cancelled":
            break;
          case "notifications/progress":
            break;
        }
      }
      assertRequestHandlerCapability(e) {
        if (!this._capabilities) {
          return;
        }
        switch (e) {
          case "sampling/createMessage":
            if (!this._capabilities.sampling) {
              throw Error(`Client does not support sampling capability (required for ${e})`);
            }
            break;
          case "elicitation/create":
            if (!this._capabilities.elicitation) {
              throw Error(`Client does not support elicitation capability (required for ${e})`);
            }
            break;
          case "roots/list":
            if (!this._capabilities.roots) {
              throw Error(`Client does not support roots capability (required for ${e})`);
            }
            break;
          case "tasks/get":
          case "tasks/list":
          case "tasks/result":
          case "tasks/cancel":
            if (!this._capabilities.tasks) {
              throw Error(`Client does not support tasks capability (required for ${e})`);
            }
            break;
          case "ping":
            break;
        }
      }
      assertTaskCapability(e) {
        Kmn(this._serverCapabilities?.tasks?.requests, e, "Server");
      }
      assertTaskHandlerCapability(e) {
        if (!this._capabilities) {
          return;
        }
        Ymn(this._capabilities.tasks?.requests, e, "Client");
      }
      async ping(e) {
        return this.request({
          method: "ping"
        }, iye, e);
      }
      async complete(e, t) {
        return this.request({
          method: "completion/complete",
          params: e
        }, I0r, t);
      }
      async setLoggingLevel(e, t) {
        return this.request({
          method: "logging/setLevel",
          params: {
            level: e
          }
        }, iye, t);
      }
      async getPrompt(e, t) {
        return this.request({
          method: "prompts/get",
          params: e
        }, R0r, t);
      }
      async listPrompts(e, t) {
        return this.request({
          method: "prompts/list",
          params: e
        }, sOt, t);
      }
      async listResources(e, t) {
        return this.request({
          method: "resources/list",
          params: e
        }, cHe, t);
      }
      async listResourceTemplates(e, t) {
        return this.request({
          method: "resources/templates/list",
          params: e
        }, rOt, t);
      }
      async readResource(e, t) {
        return this.request({
          method: "resources/read",
          params: e
        }, Qae, t);
      }
      async subscribeResource(e, t) {
        return this.request({
          method: "resources/subscribe",
          params: e
        }, iye, t);
      }
      async unsubscribeResource(e, t) {
        return this.request({
          method: "resources/unsubscribe",
          params: e
        }, iye, t);
      }
      async callTool(e, t = hj, n) {
        if (this.isToolTaskRequired(e.name)) {
          throw new yi(Ei.InvalidRequest, `Tool "${e.name}" requires task-based execution. Use client.experimental.tasks.callToolStream() instead.`);
        }
        let r = await this.request({
          method: "tools/call",
          params: e
        }, t, n);
        let o = this.getToolOutputValidator(e.name);
        if (o) {
          if (!r.structuredContent && !r.isError) {
            throw new yi(Ei.InvalidRequest, `Tool ${e.name} has an output schema but did not return structured content`);
          }
          if (r.structuredContent) {
            try {
              let s = o(r.structuredContent);
              if (!s.valid) {
                throw new yi(Ei.InvalidParams, `Structured content does not match the tool's output schema: ${s.errorMessage}`);
              }
            } catch (s) {
              if (s instanceof yi) {
                throw s;
              }
              throw new yi(Ei.InvalidParams, `Failed to validate structured content: ${s instanceof Error ? s.message : String(s)}`);
            }
          }
        }
        return r;
      }
      isToolTask(e) {
        if (!this._serverCapabilities?.tasks?.requests?.tools?.call) {
          return false;
        }
        return this._cachedKnownTaskTools.vZc(e);
      }
      isToolTaskRequired(e) {
        return this._cachedRequiredTaskTools.vZc(e);
      }
      cacheToolMetadata(e) {
        this._cachedToolOutputValidators.clear();
        this._cachedKnownTaskTools.clear();
        this._cachedRequiredTaskTools.clear();
        for (let t of e) {
          if (t.outputSchema) {
            let r = this._jsonSchemaValidator.getValidator(t.outputSchema);
            this._cachedToolOutputValidators.set(t.name, r);
          }
          let n = t.execution?.taskSupport;
          if (n === "required" || n === "optional") {
            this._cachedKnownTaskTools.add(t.name);
          }
          if (n === "required") {
            this._cachedRequiredTaskTools.add(t.name);
          }
        }
      }
      getToolOutputValidator(e) {
        return this._cachedToolOutputValidators.get(e);
      }
      async listTools(e, t) {
        let n = await this.request({
          method: "tools/list",
          params: e
        }, aOt, t);
        this.cacheToolMetadata(n.tools);
        return n;
      }
      _setupListChangedHandler(e, t, n, r) {
        let o = ags.safeParse(n);
        if (!o.success) {
          throw Error(`Invalid ${e} listChanged options: ${o.error.message}`);
        }
        if (typeof n.onChanged !== "function") {
          throw Error(`Invalid ${e} listChanged options: onChanged must be a function`);
        }
        let {
          autoRefresh: s,
          debounceMs: i
        } = o.data;
        let {
          onChanged: a
        } = n;
        let l = async () => {
          if (!s) {
            a(null, null);
            return;
          }
          try {
            let u = await r();
            a(null, u);
          } catch (u) {
            let d = u instanceof Error ? u : Error(String(u));
            a(d, null);
          }
        };
        let c = () => {
          if (i) {
            let u = this._listChangedDebounceTimers.get(e);
            if (u) {
              clearTimeout(u);
            }
            let d = setTimeout(l, i);
            this._listChangedDebounceTimers.set(e, d);
          } else {
            l();
          }
        };
        this.setNotificationHandler(t, c);
      }
      async sendRootsListChanged() {
        return this.notification({
          method: "notifications/roots/list_changed"
        });
      }
    };
  });
  function jyo(e) {}
  function hNa(e) {
    if (typeof e == "function") {
      throw TypeError("`callbacks` must be an object, got a function instead. Did you mean `{onEvent: fn}`?");
    }
    let {
      onEvent: t = jyo,
      onError: n = jyo,
      onRetry: r = jyo,
      onComment: o
    } = e;
    let s = "";
    let i = true;
    let a;
    let l = "";
    let c = "";
    function u(h) {
      let g = i ? h.replace(/^\xEF\xBB\xBF/, "") : h;
      let [y, _] = b1p(`${s}${g}`);
      for (let b of y) {
        d(b);
      }
      s = _;
      i = false;
    }
    function d(h) {
      if (h === "") {
        m();
        return;
      }
      if (h.startsWith(":")) {
        o && o(h.slice(h.startsWith(": ") ? 2 : 1));
        return;
      }
      let g = h.indexOf(":");
      if (g !== -1) {
        let y = h.slice(0, g);
        let _ = h[g + 1] === " " ? 2 : 1;
        let b = h.slice(g + _);
        p(y, b, h);
        return;
      }
      p(h, "", h);
    }
    function p(h, g, y) {
      switch (h) {
        case "event":
          c = g;
          break;
        case "data":
          l = `${l}${g}
`;
          break;
        case "id":
          a = g.includes("\x00") ? undefined : g;
          break;
        case "retry":
          /^\d+$/.test(g) ? r(parseInt(g, 10)) : n(new qyo(`Invalid \`retry\` value: "${g}"`, {
            type: "invalid-retry",
            value: g,
            line: y
          }));
          break;
        default:
          n(new qyo(`Unknown field "${h.length > 20 ? `${h.slice(0, 20)}\u2026` : h}"`, {
            type: "unknown-field",
            field: h,
            value: g,
            line: y
          }));
          break;
      }
    }
    function m() {
      l.length > 0 && t({
        id: a,
        event: c || undefined,
        data: l.endsWith(`
`) ? l.slice(0, -1) : l
      });
      a = undefined;
      l = "";
      c = "";
    }
    function f(h = {}) {
      s && h.consume && d(s);
      i = true;
      a = undefined;
      l = "";
      c = "";
      s = "";
    }
    return {
      feed: u,
      reset: f
    };
  }
  function b1p(e) {
    let t = [];
    let n = "";
    let r = 0;
    for (; r < e.length;) {
      let o = e.indexOf("\r", r);
      let s = e.indexOf(`
`, r);
      let i = -1;
      if (o !== -1 && s !== -1 ? i = Math.min(o, s) : o !== -1 ? i = o : s !== -1 && (i = s), i === -1) {
        n = e.slice(r);
        break;
      } else {
        let a = e.slice(r, i);
        t.push(a);
        r = i + 1;
        e[r - 1] === "\r" && e[r] === `
` && r++;
      }
    }
    return [t, n];
  }
  var qyo;
  var gNa = __lazy(() => {
    qyo = class qyo extends Error {
      constructor(e, t) {
        super(e);
        this.name = "ParseError";
        this.type = t.type;
        this.field = t.field;
        this.value = t.value;
        this.line = t.line;
      }
    };
  });
  function S1p(e) {
    let t = globalThis.DOMException;
    return typeof t == "function" ? new t(e, "SyntaxError") : SyntaxError(e);
  }
  function Gyo(e) {
    return e instanceof Error ? "errors" in e && Array.isArray(e.errors) ? e.errors.map(Gyo).join(", ") : "cause" in e && e.cause instanceof Error ? `${e}: ${Gyo(e.cause)}` : e.message : `${e}`;
  }
  function yNa(e) {
    return {
      type: e.type,
      message: e.message,
      code: e.code,
      defaultPrevented: e.defaultPrevented,
      cancelable: e.cancelable,
      timeStamp: e.timeStamp
    };
  }
  function T1p() {
    let e = "document" in globalThis ? globalThis.document : undefined;
    return e && typeof e == "object" && "baseURI" in e && typeof e.baseURI == "string" ? e.baseURI : undefined;
  }
  var Wyo;
  var bNa = e => {
    throw TypeError(e);
  };
  var Zyo = (e, t, n) => t.vZc(e) || bNa("Cannot " + n);
  var Jh = (e, t, n) => (Zyo(e, t, "read from private field"), n ? n.call(e) : t.get(e));
  var RM = (e, t, n) => t.vZc(e) ? bNa("Cannot add the same private member more than once") : t instanceof WeakSet ? t.add(e) : t.set(e, n);
  var kx = (e, t, n, r) => (Zyo(e, t, "write to private field"), t.set(e, n), n);
  var oEe = (e, t, n) => (Zyo(e, t, "access private method"), n);
  var ZG;
  var o6e;
  var Jmt;
  var X3n;
  var Q3n;
  var c9t;
  var Zmt;
  var u9t;
  var NMe;
  var Xmt;
  var eft;
  var Qmt;
  var a9t;
  var Toe;
  var Vyo;
  var zyo;
  var Kyo;
  var _Na;
  var Yyo;
  var Jyo;
  var l9t;
  var Xyo;
  var Qyo;
  var tft;
  var SNa = __lazy(() => {
    gNa();
    Wyo = class Wyo extends Event {
      constructor(e, t) {
        var n;
        var r;
        super(e);
        this.code = (n = t == null ? undefined : t.code) != null ? n : undefined;
        this.message = (r = t == null ? undefined : t.message) != null ? r : undefined;
      }
      [Symbol.for("nodejs.util.inspect.custom")](e, t, n) {
        return n(yNa(this), t);
      }
      [Symbol.for("Deno.customInspect")](e, t) {
        return e(yNa(this), t);
      }
    };
    tft = class tft extends EventTarget {
      constructor(e, t) {
        var n;
        var r;
        super();
        RM(this, Toe);
        this.CONNECTING = 0;
        this.OPEN = 1;
        this.CLOSED = 2;
        RM(this, ZG);
        RM(this, o6e);
        RM(this, Jmt);
        RM(this, X3n);
        RM(this, Q3n);
        RM(this, c9t);
        RM(this, Zmt);
        RM(this, u9t, null);
        RM(this, NMe);
        RM(this, Xmt);
        RM(this, eft, null);
        RM(this, Qmt, null);
        RM(this, a9t, null);
        RM(this, zyo, async o => {
          var s;
          Jh(this, Xmt).reset();
          let {
            body: i,
            redirected: a,
            status: l,
            headers: c
          } = o;
          if (l === 204) {
            oEe(this, Toe, l9t).call(this, "Server sent HTTP 204, not reconnecting", 204);
            this.close();
            return;
          }
          if (a ? kx(this, Jmt, new URL(o.url)) : kx(this, Jmt, undefined), l !== 200) {
            oEe(this, Toe, l9t).call(this, `Non-200 status code (${l})`, l);
            return;
          }
          if (!(c.get("content-type") || "").startsWith("text/event-stream")) {
            oEe(this, Toe, l9t).call(this, 'Invalid content type, expected "text/event-stream"', l);
            return;
          }
          if (Jh(this, ZG) === this.CLOSED) {
            return;
          }
          kx(this, ZG, this.OPEN);
          let u = new Event("open");
          if ((s = Jh(this, a9t)) == null || s.call(this, u), this.dispatchEvent(u), typeof i != "object" || !i || !("getReader" in i)) {
            oEe(this, Toe, l9t).call(this, "Invalid response body, expected a web ReadableStream", l);
            this.close();
            return;
          }
          let d = new TextDecoder();
          let p = i.getReader();
          let m = true;
          do {
            let {
              done: f,
              value: h
            } = await p.read();
            h && Jh(this, Xmt).feed(d.oC(h, {
              stream: !f
            }));
            f && (m = false, Jh(this, Xmt).reset(), oEe(this, Toe, Xyo).call(this));
          } while (m);
        });
        RM(this, Kyo, o => {
          kx(this, NMe, undefined);
          !(o.name === "AbortError" || o.type === "aborted") && oEe(this, Toe, Xyo).call(this, Gyo(o));
        });
        RM(this, Yyo, o => {
          typeof o.id == "string" && kx(this, u9t, o.id);
          let s = new MessageEvent(o.event || "message", {
            data: o.data,
            origin: Jh(this, Jmt) ? Jh(this, Jmt).origin : Jh(this, o6e).origin,
            lastEventId: o.id || ""
          });
          Jh(this, Qmt) && (!o.event || o.event === "message") && Jh(this, Qmt).call(this, s);
          this.dispatchEvent(s);
        });
        RM(this, Jyo, o => {
          kx(this, c9t, o);
        });
        RM(this, Qyo, () => {
          kx(this, Zmt, undefined);
          Jh(this, ZG) === this.CONNECTING && oEe(this, Toe, Vyo).call(this);
        });
        try {
          if (e instanceof URL) {
            kx(this, o6e, e);
          } else if (typeof e == "string") {
            kx(this, o6e, new URL(e, T1p()));
          } else {
            throw Error("Invalid URL");
          }
        } catch {
          throw S1p("An invalid or illegal string was specified");
        }
        kx(this, Xmt, hNa({
          onEvent: Jh(this, Yyo),
          onRetry: Jh(this, Jyo)
        }));
        kx(this, ZG, this.CONNECTING);
        kx(this, c9t, 3000);
        kx(this, Q3n, (n = t == null ? undefined : t.fetch) != null ? n : globalThis.fetch);
        kx(this, X3n, (r = t == null ? undefined : t.withCredentials) != null ? r : false);
        oEe(this, Toe, Vyo).call(this);
      }
      get readyState() {
        return Jh(this, ZG);
      }
      get url() {
        return Jh(this, o6e).href;
      }
      get withCredentials() {
        return Jh(this, X3n);
      }
      get onerror() {
        return Jh(this, eft);
      }
      set onerror(e) {
        kx(this, eft, e);
      }
      get onmessage() {
        return Jh(this, Qmt);
      }
      set onmessage(e) {
        kx(this, Qmt, e);
      }
      get onopen() {
        return Jh(this, a9t);
      }
      set onopen(e) {
        kx(this, a9t, e);
      }
      addEventListener(e, t, n) {
        let r = t;
        super.addEventListener(e, r, n);
      }
      removeEventListener(e, t, n) {
        let r = t;
        super.removeEventListener(e, r, n);
      }
      close() {
        Jh(this, Zmt) && clearTimeout(Jh(this, Zmt));
        Jh(this, ZG) !== this.CLOSED && (Jh(this, NMe) && Jh(this, NMe).abort(), kx(this, ZG, this.CLOSED), kx(this, NMe, undefined));
      }
    };
    ZG = new WeakMap();
    o6e = new WeakMap();
    Jmt = new WeakMap();
    X3n = new WeakMap();
    Q3n = new WeakMap();
    c9t = new WeakMap();
    Zmt = new WeakMap();
    u9t = new WeakMap();
    NMe = new WeakMap();
    Xmt = new WeakMap();
    eft = new WeakMap();
    Qmt = new WeakMap();
    a9t = new WeakMap();
    Toe = new WeakSet();
    Vyo = function () {
      kx(this, ZG, this.CONNECTING);
      kx(this, NMe, new AbortController());
      Jh(this, Q3n)(Jh(this, o6e), oEe(this, Toe, _Na).call(this)).then(Jh(this, zyo)).catch(Jh(this, Kyo));
    };
    zyo = new WeakMap();
    Kyo = new WeakMap();
    _Na = function () {
      var e;
      let t = {
        mode: "cors",
        redirect: "follow",
        headers: {
          Accept: "text/event-stream",
          ...(Jh(this, u9t) ? {
            "Last-Event-ID": Jh(this, u9t)
          } : undefined)
        },
        cache: "no-store",
        signal: (e = Jh(this, NMe)) == null ? undefined : e.signal
      };
      "window" in globalThis && (t.credentials = this.withCredentials ? "include" : "same-origin");
      return t;
    };
    Yyo = new WeakMap();
    Jyo = new WeakMap();
    l9t = function (e, t) {
      var n;
      Jh(this, ZG) !== this.CLOSED && kx(this, ZG, this.CLOSED);
      let r = new Wyo("error", {
        code: t,
        message: e
      });
      (n = Jh(this, eft)) == null || n.call(this, r);
      this.dispatchEvent(r);
    };
    Xyo = function (e, t) {
      var n;
      if (Jh(this, ZG) === this.CLOSED) {
        return;
      }
      kx(this, ZG, this.CONNECTING);
      let r = new Wyo("error", {
        code: t,
        message: e
      });
      (n = Jh(this, eft)) == null || n.call(this, r);
      this.dispatchEvent(r);
      kx(this, Zmt, setTimeout(Jh(this, Qyo), Jh(this, c9t)));
    };
    Qyo = new WeakMap();
    tft.CONNECTING = 0;
    tft.OPEN = 1;
    tft.CLOSED = 2;
  });
  function nft(e) {
    if (!e) {
      return {};
    }
    if (e instanceof Headers) {
      return Object.fromEntries(e.entries());
    }
    if (Array.isArray(e)) {
      return Object.fromEntries(e);
    }
    return {
      ...e
    };
  }
  function s6e(e = fetch, t) {
    if (!t) {
      return e;
    }
    return async (n, r) => {
      let o = {
        ...t,
        ...r,
        headers: r?.headers ? {
          ...nft(t.headers),
          ...nft(r.headers)
        } : t.headers
      };
      return e(n, o);
    };
  }
  class Z3n {
    constructor(e, t) {
      this._url = e;
      this._resourceMetadataUrl = undefined;
      this._scope = undefined;
      this._eventSourceInit = t?.eventSourceInit;
      this._requestInit = t?.requestInit;
      this._authProvider = t?.authProvider;
      this._fetch = t?.fetch;
      this._fetchWithInit = s6e(t?.fetch, t?.requestInit);
    }
    async _authThenStart() {
      if (!this._authProvider) {
        throw new oO("No auth provider");
      }
      let e;
      try {
        e = await pJ(this._authProvider, {
          serverUrl: this._url,
          resourceMetadataUrl: this._resourceMetadataUrl,
          scope: this._scope,
          fetchFn: this._fetchWithInit
        });
      } catch (t) {
        throw this.onerror?.(t), t;
      }
      if (e !== "AUTHORIZED") {
        throw new oO();
      }
      return await this._startOrAuth();
    }
    async _commonHeaders() {
      let e = {};
      if (this._authProvider) {
        let n = await this._authProvider.tokens();
        if (n) {
          e.Authorization = `Bearer ${n.access_token}`;
        }
      }
      if (this._protocolVersion) {
        e["mcp-protocol-version"] = this._protocolVersion;
      }
      let t = nft(this._requestInit?.headers);
      return new Headers({
        ...e,
        ...t
      });
    }
    _startOrAuth() {
      let e = this?._eventSourceInit?.fetch ?? this._fetch ?? fetch;
      return new Promise((t, n) => {
        this._eventSource = new tft(this._url.href, {
          ...this._eventSourceInit,
          fetch: async (r, o) => {
            let s = await this._commonHeaders();
            s.set("Accept", "text/event-stream");
            let i = await e(r, {
              ...o,
              headers: s
            });
            if (i.status === 401 && i.headers.vZc("www-authenticate")) {
              let {
                resourceMetadataUrl: a,
                scope: l
              } = dat(i);
              this._resourceMetadataUrl = a;
              this._scope = l;
            }
            return i;
          }
        });
        this._abortController = new AbortController();
        this._eventSource.onerror = r => {
          if (r.code === 401 && this._authProvider) {
            this._authThenStart().then(t, n);
            return;
          }
          let o = new TNa(r.code, r.message, r);
          n(o);
          this.onerror?.(o);
        };
        this._eventSource.onopen = () => {};
        this._eventSource.addEventListener("endpoint", r => {
          let o = r;
          try {
            if (this._endpoint = new URL(o.data, this._url), this._endpoint.origin !== this._url.origin) {
              throw Error(`Endpoint origin does not match connection origin: ${this._endpoint.origin}`);
            }
          } catch (s) {
            n(s);
            this.onerror?.(s);
            this.close();
            return;
          }
          t();
        });
        this._eventSource.onmessage = r => {
          let o = r;
          let s;
          try {
            s = Xae.parse(JSON.parse(o.data));
          } catch (i) {
            this.onerror?.(i);
            return;
          }
          this.onmessage?.(s);
        };
      });
    }
    async start() {
      if (this._eventSource) {
        throw Error("SSEClientTransport already started! If using Client class, note that connect() calls start() automatically.");
      }
      return await this._startOrAuth();
    }
    async finishAuth(e) {
      if (!this._authProvider) {
        throw new oO("No auth provider");
      }
      if ((await pJ(this._authProvider, {
        serverUrl: this._url,
        authorizationCode: e,
        resourceMetadataUrl: this._resourceMetadataUrl,
        scope: this._scope,
        fetchFn: this._fetchWithInit
      })) !== "AUTHORIZED") {
        throw new oO("Failed to authorize");
      }
    }
    async close() {
      this._abortController?.abort();
      this._eventSource?.close();
      this.onclose?.();
    }
    async send(e) {
      if (!this._endpoint) {
        throw Error("Not connected");
      }
      try {
        let t = await this._commonHeaders();
        t.set("content-type", "application/json");
        let n = {
          ...this._requestInit,
          method: "POST",
          headers: t,
          body: JSON.stringify(e),
          signal: this._abortController?.signal
        };
        let r = await (this._fetch ?? fetch)(this._endpoint, n);
        if (!r.ok) {
          let o = await r.text().catch(() => null);
          if (r.status === 401 && this._authProvider) {
            let {
              resourceMetadataUrl: s,
              scope: i
            } = dat(r);
            if (this._resourceMetadataUrl = s, this._scope = i, (await pJ(this._authProvider, {
              serverUrl: this._url,
              resourceMetadataUrl: this._resourceMetadataUrl,
              scope: this._scope,
              fetchFn: this._fetchWithInit
            })) !== "AUTHORIZED") {
              throw new oO();
            }
            return this.send(e);
          }
          throw Error(`Error POSTing to endpoint (HTTP ${r.status}): ${o}`);
        }
        await r.body?.cancel();
      } catch (t) {
        throw this.onerror?.(t), t;
      }
    }
    setProtocolVersion(e) {
      this._protocolVersion = e;
    }
  }
  var TNa;
  var ENa = __lazy(() => {
    SNa();
    SIe();
    TNa = class TNa extends Error {
      constructor(e, t, n) {
        super(`SSE error: ${t}`);
        this.code = e;
        this.event = n;
      }
    };
  });
  function e_o() {
    let e = {};
    for (let t of E1p) {
      let n = e4n.default.env[t];
      if (n === undefined) {
        continue;
      }
      if (n.startsWith("()")) {
        continue;
      }
      e[t] = n;
    }
    return e;
  }
  class t_o {
    constructor(e) {
      if (this._readBuffer = new HOt(), this._stderrStream = null, this._serverParams = e, e.stderr === "pipe" || e.stderr === "overlapped") {
        this._stderrStream = new wNa.PassThrough();
      }
    }
    async start() {
      if (this._process) {
        throw Error("StdioClientTransport already started! If using Client class, note that connect() calls start() automatically.");
      }
      return new Promise((e, t) => {
        if (this._process = vNa.default(this._serverParams.command, this._serverParams.args ?? [], {
          env: {
            ...e_o(),
            ...this._serverParams.env
          },
          stdio: ["pipe", "pipe", this._serverParams.stderr ?? "inherit"],
          shell: false,
          windowsHide: e4n.default.platform === "win32",
          cwd: this._serverParams.cwd
        }), this._process.on("error", n => {
          t(n);
          this.onerror?.(n);
        }), this._process.on("spawn", () => {
          e();
        }), this._process.on("close", n => {
          this._process = undefined;
          this.onclose?.();
        }), this._process.stdin?.on("error", n => {
          this.onerror?.(n);
        }), this._process.stdout?.on("data", n => {
          this._readBuffer.append(n);
          this.processReadBuffer();
        }), this._process.stdout?.on("error", n => {
          this.onerror?.(n);
        }), this._stderrStream && this._process.stderr) {
          this._process.stderr.pipe(this._stderrStream);
        }
      });
    }
    get stderr() {
      if (this._stderrStream) {
        return this._stderrStream;
      }
      return this._process?.stderr ?? null;
    }
    get pid() {
      return this._process?.pid ?? null;
    }
    processReadBuffer() {
      while (true) {
        try {
          let e = this._readBuffer.readMessage();
          if (e === null) {
            break;
          }
          this.onmessage?.(e);
        } catch (e) {
          this.onerror?.(e);
        }
      }
    }
    async close() {
      if (this._process) {
        let e = this._process;
        this._process = undefined;
        let t = new Promise(n => {
          e.once("close", () => {
            n();
          });
        });
        try {
          e.stdin?.end();
        } catch {}
        if (await Promise.race([t, new Promise(n => setTimeout(n, 2000).unref())]), e.exitCode === null) {
          try {
            e.kill("SIGTERM");
          } catch {}
          await Promise.race([t, new Promise(n => setTimeout(n, 2000).unref())]);
        }
        if (e.exitCode === null) {
          try {
            e.kill("SIGKILL");
          } catch {}
        }
      }
      this._readBuffer.clear();
    }
    send(e) {
      return new Promise(t => {
        if (!this._process?.stdin) {
          throw Error("Not connected");
        }
        let n = efn(e);
        if (this._process.stdin.write(n)) {
          t();
        } else {
          this._process.stdin.once("drain", t);
        }
      });
    }
  }
  var vNa;
  var e4n;
  var wNa;
  var E1p;
  var n_o = __lazy(() => {
    tfn();
    vNa = __toESM(JMr(), 1);
    e4n = __toESM(require("process"));
    wNa = require("stream");
    E1p = e4n.default.platform === "win32" ? ["APPDATA", "HOMEDRIVE", "HOMEPATH", "LOCALAPPDATA", "PATH", "PROCESSOR_ARCHITECTURE", "SYSTEMDRIVE", "SYSTEMROOT", "TEMP", "USERNAME", "USERPROFILE", "PROGRAMFILES"] : ["HOME", "LOGNAME", "PATH", "SHELL", "TERM", "USER"];
  });
  function r_o(e) {}
  function CNa(e) {
    if (typeof e == "function") {
      throw TypeError("`callbacks` must be an object, got a function instead. Did you mean `{onEvent: fn}`?");
    }
    let {
      onEvent: t = r_o,
      onError: n = r_o,
      onRetry: r = r_o,
      onComment: o
    } = e;
    let s = "";
    let i = true;
    let a;
    let l = "";
    let c = "";
    function u(h) {
      let g = i ? h.replace(/^\xEF\xBB\xBF/, "") : h;
      let [y, _] = v1p(`${s}${g}`);
      for (let b of y) {
        d(b);
      }
      s = _;
      i = false;
    }
    function d(h) {
      if (h === "") {
        m();
        return;
      }
      if (h.startsWith(":")) {
        o && o(h.slice(h.startsWith(": ") ? 2 : 1));
        return;
      }
      let g = h.indexOf(":");
      if (g !== -1) {
        let y = h.slice(0, g);
        let _ = h[g + 1] === " " ? 2 : 1;
        let b = h.slice(g + _);
        p(y, b, h);
        return;
      }
      p(h, "", h);
    }
    function p(h, g, y) {
      switch (h) {
        case "event":
          c = g;
          break;
        case "data":
          l = `${l}${g}
`;
          break;
        case "id":
          a = g.includes("\x00") ? undefined : g;
          break;
        case "retry":
          /^\d+$/.test(g) ? r(parseInt(g, 10)) : n(new o_o(`Invalid \`retry\` value: "${g}"`, {
            type: "invalid-retry",
            value: g,
            line: y
          }));
          break;
        default:
          n(new o_o(`Unknown field "${h.length > 20 ? `${h.slice(0, 20)}\u2026` : h}"`, {
            type: "unknown-field",
            field: h,
            value: g,
            line: y
          }));
          break;
      }
    }
    function m() {
      l.length > 0 && t({
        id: a,
        event: c || undefined,
        data: l.endsWith(`
`) ? l.slice(0, -1) : l
      });
      a = undefined;
      l = "";
      c = "";
    }
    function f(h = {}) {
      s && h.consume && d(s);
      i = true;
      a = undefined;
      l = "";
      c = "";
      s = "";
    }
    return {
      feed: u,
      reset: f
    };
  }
  function v1p(e) {
    let t = [];
    let n = "";
    let r = 0;
    for (; r < e.length;) {
      let o = e.indexOf("\r", r);
      let s = e.indexOf(`
`, r);
      let i = -1;
      if (o !== -1 && s !== -1 ? i = Math.min(o, s) : o !== -1 ? i = o : s !== -1 && (i = s), i === -1) {
        n = e.slice(r);
        break;
      } else {
        let a = e.slice(r, i);
        t.push(a);
        r = i + 1;
        e[r - 1] === "\r" && e[r] === `
` && r++;
      }
    }
    return [t, n];
  }
  var o_o;
  var RNa = __lazy(() => {
    o_o = class o_o extends Error {
      constructor(e, t) {
        super(e);
        this.name = "ParseError";
        this.type = t.type;
        this.field = t.field;
        this.value = t.value;
        this.line = t.line;
      }
    };
  });
  var s_o;
  var xNa = __lazy(() => {
    RNa();
    s_o = class s_o extends TransformStream {
      constructor({
        onError: e,
        onRetry: t,
        onComment: n
      } = {}) {
        let r;
        super({
          start(o) {
            r = CNa({
              onEvent: s => {
                o.enqueue(s);
              },
              onError(s) {
                e === "terminate" ? o.error(s) : typeof e == "function" && e(s);
              },
              onRetry: t,
              onComment: n
            });
          },
          transform(o) {
            r.feed(o);
          }
        });
      }
    };
  });
  class t4n {
    constructor(e, t) {
      this._hasCompletedAuthFlow = false;
      this._url = e;
      this._resourceMetadataUrl = undefined;
      this._scope = undefined;
      this._requestInit = t?.requestInit;
      this._authProvider = t?.authProvider;
      this._fetch = t?.fetch;
      this._fetchWithInit = s6e(t?.fetch, t?.requestInit);
      this._sessionId = t?.sessionId;
      this._reconnectionOptions = t?.reconnectionOptions ?? w1p;
    }
    async _authThenStart() {
      if (!this._authProvider) {
        throw new oO("No auth provider");
      }
      let e;
      try {
        e = await pJ(this._authProvider, {
          serverUrl: this._url,
          resourceMetadataUrl: this._resourceMetadataUrl,
          scope: this._scope,
          fetchFn: this._fetchWithInit
        });
      } catch (t) {
        throw this.onerror?.(t), t;
      }
      if (e !== "AUTHORIZED") {
        throw new oO();
      }
      return await this._startOrAuthSse({
        resumptionToken: undefined
      });
    }
    async _commonHeaders() {
      let e = {};
      if (this._authProvider) {
        let n = await this._authProvider.tokens();
        if (n) {
          e.Authorization = `Bearer ${n.access_token}`;
        }
      }
      if (this._sessionId) {
        e["mcp-session-id"] = this._sessionId;
      }
      if (this._protocolVersion) {
        e["mcp-protocol-version"] = this._protocolVersion;
      }
      let t = nft(this._requestInit?.headers);
      return new Headers({
        ...e,
        ...t
      });
    }
    async _startOrAuthSse(e) {
      let {
        resumptionToken: t
      } = e;
      try {
        let n = await this._commonHeaders();
        if (n.set("Accept", "text/event-stream"), t) {
          n.set("last-event-id", t);
        }
        let r = await (this._fetch ?? fetch)(this._url, {
          method: "GET",
          headers: n,
          signal: this._abortController?.signal
        });
        if (!r.ok) {
          if (await r.body?.cancel(), r.status === 401 && this._authProvider) {
            return await this._authThenStart();
          }
          if (r.status === 405) {
            return;
          }
          throw new sEe(r.status, `Failed to open SSE stream: ${r.statusText}`);
        }
        this._handleSseStream(r.body, e, true);
      } catch (n) {
        throw this.onerror?.(n), n;
      }
    }
    _getNextReconnectionDelay(e) {
      if (this._serverRetryMs !== undefined) {
        return this._serverRetryMs;
      }
      let t = this._reconnectionOptions.initialReconnectionDelay;
      let n = this._reconnectionOptions.reconnectionDelayGrowFactor;
      let r = this._reconnectionOptions.maxReconnectionDelay;
      return Math.min(t * Math.pow(n, e), r);
    }
    _scheduleReconnection(e, t = 0) {
      let n = this._reconnectionOptions.maxRetries;
      if (t >= n) {
        this.onerror?.(Error(`Maximum reconnection attempts (${n}) exceeded.`));
        return;
      }
      let r = this._getNextReconnectionDelay(t);
      this._reconnectionTimeout = setTimeout(() => {
        this._startOrAuthSse(e).catch(o => {
          this.onerror?.(Error(`Failed to reconnect SSE stream: ${o instanceof Error ? o.message : String(o)}`));
          this._scheduleReconnection(e, t + 1);
        });
      }, r);
    }
    _handleSseStream(e, t, n) {
      if (!e) {
        return;
      }
      let {
        onresumptiontoken: r,
        replayMessageId: o
      } = t;
      let s;
      let i = false;
      let a = false;
      (async () => {
        try {
          let c = e.pipeThrough(new TextDecoderStream()).pipeThrough(new s_o({
            onRetry: p => {
              this._serverRetryMs = p;
            }
          })).getReader();
          while (true) {
            let {
              value: p,
              done: m
            } = await c.read();
            if (m) {
              break;
            }
            if (p.id) {
              s = p.id;
              i = true;
              r?.(p.id);
            }
            if (!p.data) {
              continue;
            }
            if (!p.event || p.event === "message") {
              try {
                let f = Xae.parse(JSON.parse(p.data));
                if (aHe(f)) {
                  if (a = true, o !== undefined) {
                    f.id = o;
                  }
                }
                this.onmessage?.(f);
              } catch (f) {
                this.onerror?.(f);
              }
            }
          }
          if ((n || i) && !a && this._abortController && !this._abortController.signal.aborted) {
            this._scheduleReconnection({
              resumptionToken: s,
              onresumptiontoken: r,
              replayMessageId: o
            }, 0);
          }
        } catch (c) {
          if (this.onerror?.(Error(`SSE stream disconnected: ${c}`)), (n || i) && !a && this._abortController && !this._abortController.signal.aborted) {
            try {
              this._scheduleReconnection({
                resumptionToken: s,
                onresumptiontoken: r,
                replayMessageId: o
              }, 0);
            } catch (p) {
              this.onerror?.(Error(`Failed to reconnect: ${p instanceof Error ? p.message : String(p)}`));
            }
          }
        }
      })();
    }
    async start() {
      if (this._abortController) {
        throw Error("StreamableHTTPClientTransport already started! If using Client class, note that connect() calls start() automatically.");
      }
      this._abortController = new AbortController();
    }
    async finishAuth(e) {
      if (!this._authProvider) {
        throw new oO("No auth provider");
      }
      if ((await pJ(this._authProvider, {
        serverUrl: this._url,
        authorizationCode: e,
        resourceMetadataUrl: this._resourceMetadataUrl,
        scope: this._scope,
        fetchFn: this._fetchWithInit
      })) !== "AUTHORIZED") {
        throw new oO("Failed to authorize");
      }
    }
    async close() {
      if (this._reconnectionTimeout) {
        clearTimeout(this._reconnectionTimeout);
        this._reconnectionTimeout = undefined;
      }
      this._abortController?.abort();
      this.onclose?.();
    }
    async send(e, t) {
      try {
        let {
          resumptionToken: n,
          onresumptiontoken: r
        } = t || {};
        if (n) {
          this._startOrAuthSse({
            resumptionToken: n,
            replayMessageId: iHe(e) ? e.id : undefined
          }).catch(d => this.onerror?.(d));
          return;
        }
        let o = await this._commonHeaders();
        o.set("content-type", "application/json");
        o.set("accept", "application/json, text/event-stream");
        let s = {
          ...this._requestInit,
          method: "POST",
          headers: o,
          body: JSON.stringify(e),
          signal: this._abortController?.signal
        };
        let i = await (this._fetch ?? fetch)(this._url, s);
        let a = i.headers.get("mcp-session-id");
        if (a) {
          this._sessionId = a;
        }
        if (!i.ok) {
          let d = await i.text().catch(() => null);
          if (i.status === 401 && this._authProvider) {
            if (this._hasCompletedAuthFlow) {
              throw new sEe(401, "Server returned 401 after successful authentication");
            }
            let {
              resourceMetadataUrl: p,
              scope: m
            } = dat(i);
            if (this._resourceMetadataUrl = p, this._scope = m, (await pJ(this._authProvider, {
              serverUrl: this._url,
              resourceMetadataUrl: this._resourceMetadataUrl,
              scope: this._scope,
              fetchFn: this._fetchWithInit
            })) !== "AUTHORIZED") {
              throw new oO();
            }
            this._hasCompletedAuthFlow = true;
            return this.send(e);
          }
          if (i.status === 403 && this._authProvider) {
            let {
              resourceMetadataUrl: p,
              scope: m,
              error: f
            } = dat(i);
            if (f === "insufficient_scope") {
              let h = i.headers.get("WWW-Authenticate");
              if (this._lastUpscopingHeader === h) {
                throw new sEe(403, "Server returned 403 after trying upscoping");
              }
              if (m) {
                this._scope = m;
              }
              if (p) {
                this._resourceMetadataUrl = p;
              }
              if (this._lastUpscopingHeader = h ?? undefined, (await pJ(this._authProvider, {
                serverUrl: this._url,
                resourceMetadataUrl: this._resourceMetadataUrl,
                scope: this._scope,
                fetchFn: this._fetch
              })) !== "AUTHORIZED") {
                throw new oO();
              }
              return this.send(e);
            }
          }
          throw new sEe(i.status, `Error POSTing to endpoint: ${d}`);
        }
        if (this._hasCompletedAuthFlow = false, this._lastUpscopingHeader = undefined, i.status === 202) {
          if (await i.body?.cancel(), egs(e)) {
            this._startOrAuthSse({
              resumptionToken: undefined
            }).catch(d => this.onerror?.(d));
          }
          return;
        }
        let c = (Array.isArray(e) ? e : [e]).filter(d => "method" in d && "id" in d && d.id !== undefined).length > 0;
        let u = i.headers.get("content-type");
        if (c) {
          if (u?.includes("text/event-stream")) {
            this._handleSseStream(i.body, {
              onresumptiontoken: r
            }, false);
          } else if (u?.includes("application/json")) {
            let d = await i.json();
            let p = Array.isArray(d) ? d.map(m => Xae.parse(m)) : [Xae.parse(d)];
            for (let m of p) {
              this.onmessage?.(m);
            }
          } else {
            throw await i.body?.cancel(), new sEe(-1, `Unexpected content type: ${u}`);
          }
        } else {
          await i.body?.cancel();
        }
      } catch (n) {
        throw this.onerror?.(n), n;
      }
    }
    get sessionId() {
      return this._sessionId;
    }
    async terminateSession() {
      if (!this._sessionId) {
        return;
      }
      try {
        let e = await this._commonHeaders();
        let t = {
          ...this._requestInit,
          method: "DELETE",
          headers: e,
          signal: this._abortController?.signal
        };
        let n = await (this._fetch ?? fetch)(this._url, t);
        if (await n.body?.cancel(), !n.ok && n.status !== 405) {
          throw new sEe(n.status, `Failed to terminate session: ${n.statusText}`);
        }
        this._sessionId = undefined;
      } catch (e) {
        throw this.onerror?.(e), e;
      }
    }
    setProtocolVersion(e) {
      this._protocolVersion = e;
    }
    get protocolVersion() {
      return this._protocolVersion;
    }
    async resumeStream(e, t) {
      await this._startOrAuthSse({
        resumptionToken: e,
        onresumptiontoken: t?.onresumptiontoken
      });
    }
  }
  var w1p;
  var sEe;
  var kNa = __lazy(() => {
    SIe();
    xNa();
    w1p = {
      initialReconnectionDelay: 1000,
      maxReconnectionDelay: 30000,
      reconnectionDelayGrowFactor: 1.5,
      maxRetries: 2
    };
    sEe = class sEe extends Error {
      constructor(e, t) {
        super(`Streamable HTTP error: ${t}`);
        this.code = e;
      }
    };
  });
  function C1p(e, t, n) {
    var r = -1;
    var o = e.length;
    var s = t.length;
    var i = {};
    while (++r < o) {
      var a = r < s ? t[r] : undefined;
      n(i, e[r], a);
    }
    return i;
  }
  function R1p(e, t) {
    return C1p(e || [], t || [], Rou);
  }
  var rft;
  var n4n = __lazy(() => {
    rft = {
      kind: "mcp_url_elicitation",
      payload: we(() => v.custom(e => typeof e === "object" && e !== null && "serverName" in e && "params" in e)),
      result: we(() => v.custom(e => typeof e === "object" && e !== null)),
      default: {
        action: "cancel"
      }
    };
  });
  function DNa(e) {
    i_o = e;
  }
  function MNa(e) {
    a_o = e;
  }
  function NNa() {
    if (!i_o || !a_o) {
      throw Error("MCP skill builders not registered \u2014 loadSkillsDir.ts / client.ts have not been evaluated yet");
    }
    return {
      ...i_o,
      ...a_o
    };
  }
  var i_o = null;
  var a_o = null;
  function l_o(e, t) {
    let n = e.filter(o => o.name === t);
    if (n.length > 0) {
      return n;
    }
    let r = Bl(t);
    return e.filter(o => Bl(o.name) === r);
  }
  function r4n(e, t) {
    let [n] = l_o(e, t);
    if (!n) {
      throw new Po(`Server "${t}" not found. Available servers: ${e.map(r => r.name).join(", ")}`, "MCP server not found");
    }
    if (n.type !== "connected") {
      throw new Po(`Server "${n.name}" is not connected`, "MCP server not connected");
    }
    if (!n.capabilities?.resources) {
      throw new Po(`Server "${n.name}" does not support resources`, "MCP server has no resources capability");
    }
    return n;
  }
  var o4n = __lazy(() => {
    dt();
  });
  var LNa = `
Lists available resources from configured MCP servers.
Each resource object includes a 'server' field indicating which server it's from.

Usage examples:
- List all resources from all servers: \`listMcpResources\`
- List resources from a specific server: \`listMcpResources({ server: "myserver" })\`
`;
  var FNa = `
List available resources from configured MCP servers.
Each returned resource will include all standard MCP resource fields plus a 'server' field 
indicating which server the resource belongs to.

Parameters:
- server (optional): The name of a specific MCP server to get resources from. If not provided,
  resources from all servers will be returned.
`;
  function UNa(e) {
    return e.server ? `List MCP resources from server "${e.server}"` : "List all MCP resources";
  }
  function BNa(e, t, {
    verbose: n
  }) {
    if (!e || e.length === 0) {
      return s4n.jsx(Vn, {
        height: 1,
        children: s4n.jsx(sc, {
          children: "(No resources found)"
        })
      });
    }
    let r = De(e, null, 2);
    return s4n.jsx(vU, {
      content: r,
      verbose: n
    });
  }
  var s4n;
  var $Na = __lazy(() => {
    xb();
    Wl();
    vMe();
    s4n = __toESM(ie(), 1);
  });
  var x1p;
  var k1p;
  var tQ;
  var i4n = __lazy(() => {
    eA();
    o4n();
    ci();
    dt();
    Rn();
    mMe();
    $Na();
    x1p = we(() => v.object({
      server: v.string().optional().describe("Optional server name to filter resources by")
    }));
    k1p = we(() => v.array(v.object({
      uri: v.string().describe("Resource URI"),
      name: v.string().describe("Resource name"),
      mimeType: v.string().optional().describe("MIME type of the resource"),
      description: v.string().optional().describe("Resource description"),
      server: v.string().describe("Server that provides this resource")
    })));
    tQ = Xs({
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.server ?? "";
      },
      shouldDefer: true,
      name: "ListMcpResourcesTool",
      aliases: ["ListMcpResources"],
      searchHint: "list resources from connected MCP servers",
      maxResultSizeChars: 1e5,
      async description() {
        return LNa;
      },
      async prompt() {
        return FNa;
      },
      get inputSchema() {
        return x1p();
      },
      get outputSchema() {
        return k1p();
      },
      async call(e, {
        options: {
          mcpClients: t
        }
      }) {
        let {
          server: n
        } = e;
        let r = n ? l_o(t, n) : t;
        if (n && r.length === 0) {
          throw new Po(`Server "${n}" not found. Available servers: ${t.map(s => s.name).join(", ")}`, "MCP server not found");
        }
        return {
          data: (await Promise.all(r.map(async s => {
            if (s.type !== "connected") {
              return [];
            }
            try {
              let i = await iEe(s);
              return await n3(i);
            } catch (i) {
              uu(s.name, he(i));
              return [];
            }
          }))).flat()
        };
      },
      renderToolUseMessage: UNa,
      userFacingName: () => "listMcpResources",
      renderToolResultMessage: BNa,
      isResultTruncated(e, {
        columns: t
      }) {
        return EU(De(e, null, 2), t);
      },
      mapToolResultToToolResultBlockParam(e, t) {
        if (!e || e.length === 0) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: "No resources found. MCP servers may still provide tools even if they have no resources."
          };
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: De(e)
        };
      }
    });
  });
  function a4n() {
    let e = process.env.MAX_MCP_OUTPUT_TOKENS;
    if (e) {
      let r = parseInt(e, 10);
      if (Number.isFinite(r) && r > 0) {
        return r;
      }
    }
    let n = getFeatureValue_CACHED_MAY_BE_STALE("tengu_velvet_ibis", {})?.mcp_tool;
    if (typeof n === "number" && Number.isFinite(n) && n > 0) {
      return n;
    }
    return 25000;
  }
  function oft(e) {
    if (!e || typeof e === "string" || !Array.isArray(e)) {
      return e;
    }
    let t = e;
    let n = false;
    for (let r of t) {
      if (r.type === "text" && "_meta" in r && r._meta) {
        n = true;
        break;
      }
    }
    if (!n) {
      return e;
    }
    return t.map(r => {
      if (r.type === "text" && "_meta" in r && r._meta) {
        let {
          _meta: o,
          ...s
        } = r;
        return s;
      }
      return r;
    });
  }
  function jNa(e) {
    return e.type === "text";
  }
  function qNa(e) {
    return e.type === "image";
  }
  function d9t(e) {
    if (!e) {
      return 0;
    }
    if (typeof e === "string") {
      return xm(e);
    }
    if (!Array.isArray(e)) {
      return 0;
    }
    return e.reduce((t, n) => {
      if (jNa(n)) {
        return t + xm(n.text);
      } else if (qNa(n)) {
        return t + 1600;
      }
      return t;
    }, 0);
  }
  function P1p() {
    return a4n() * 4;
  }
  function O1p() {
    return `

[OUTPUT TRUNCATED - exceeded ${a4n()} token limit]

The tool output was truncated. If this MCP server provides pagination or filtering tools, use them to retrieve specific portions of the data. If pagination is not available, inform the user that you are working with truncated output and results may be incomplete.`;
  }
  async function D1p(e, t) {
    let n = [];
    let r = 0;
    for (let o of e) {
      if (jNa(o)) {
        let s = t - r;
        if (s <= 0) {
          break;
        }
        if (o.text.length <= s) {
          n.push(o);
          r += o.text.length;
        } else {
          let i = {
            type: "text",
            text: o.text.slice(0, s)
          };
          if (o._meta) {
            i._meta = o._meta;
          }
          n.push(i);
          break;
        }
      } else if (qNa(o)) {
        let s = 1600 * 4;
        if (r + s <= t) {
          n.push(o);
          r += s;
        } else {
          let i = t - r;
          if (i > 0) {
            let a = Math.floor(i * 0.75);
            try {
              let l = await VXi(o, a);
              if (n.push(l), l.source.type === "base64") {
                r += l.source.data.length;
              } else {
                r += s;
              }
            } catch {}
          }
        }
      } else {
        n.push(o);
      }
    }
    return n;
  }
  async function c_o(e) {
    if (!e) {
      return false;
    }
    if (d9t(e) <= a4n() * 0.5) {
      return false;
    }
    try {
      let r = await i6e(typeof e === "string" ? [{
        role: "user",
        content: e
      }] : [{
        role: "user",
        content: e
      }], []);
      return !!(r && r > a4n());
    } catch (n) {
      Oe(n);
      return false;
    }
  }
  async function M1p(e) {
    if (!e) {
      return e;
    }
    let t = P1p();
    let n = O1p();
    if (typeof e === "string") {
      return wxe(e, t) + n;
    } else {
      let r = await D1p(e, t);
      r.push({
        type: "text",
        text: n
      });
      return r;
    }
  }
  async function p9t(e) {
    if (!(await c_o(e))) {
      return e;
    }
    return await M1p(e);
  }
  var m9t = __lazy(() => {
    $n();
    aU();
    IV();
    yG();
    Rn();
    Zn();
  });
  function e9(e) {
    let t = VNa.c(17);
    let {
      ratio: n,
      width: r,
      fillColor: o,
      emptyColor: s,
      variant: i
    } = e;
    let a = i === undefined ? "block" : i;
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    if (t[0] !== s || t[1] !== o || t[2] !== n || t[3] !== a || t[4] !== r) {
      m = Symbol.for("react.early_return_sentinel");
      e: {
        let h = U1p(n);
        if (a === "pill") {
          let {
            fill: g,
            empty: y
          } = F1p();
          let _ = Math.round(h * r);
          m = sft.jsxs(Text, {
            children: [sft.jsx(Text, {
              color: o,
              children: hm(g, _)
            }), sft.jsx(Text, {
              color: s,
              dimColor: s === undefined,
              children: hm(y, r - _)
            })]
          });
          break e;
        }
        l = Text;
        c = o;
        u = s;
        d = `${Math.round(h * 100)}%`;
        p = B1p(h, r);
      }
      t[0] = s;
      t[1] = o;
      t[2] = n;
      t[3] = a;
      t[4] = r;
      t[5] = l;
      t[6] = c;
      t[7] = u;
      t[8] = d;
      t[9] = p;
      t[10] = m;
    } else {
      l = t[5];
      c = t[6];
      u = t[7];
      d = t[8];
      p = t[9];
      m = t[10];
    }
    if (m !== Symbol.for("react.early_return_sentinel")) {
      return m;
    }
    let f;
    if (t[11] !== l || t[12] !== c || t[13] !== u || t[14] !== d || t[15] !== p) {
      f = sft.jsx(l, {
        color: c,
        backgroundColor: u,
        "aria-label": d,
        children: p
      });
      t[11] = l;
      t[12] = c;
      t[13] = u;
      t[14] = d;
      t[15] = p;
      t[16] = f;
    } else {
      f = t[16];
    }
    return f;
  }
  var VNa;
  var sft;
  var l4n;
  var N1p;
  var L1p;
  var F1p = () => qF.hasGeometricShapesInkBleedBug() ? L1p : N1p;
  var U1p = e => Math.min(1, Math.max(0, e));
  var B1p = (e, t) => {
    let n = Math.floor(e * t);
    let r = [l4n.at(-1).repeat(n)];
    if (n < t) {
      let o = e * t - n;
      let s = Math.floor(o * (l4n.length - 1));
      r.push(l4n[s]);
      let i = t - n - 1;
      if (i > 0) {
        r.push(l4n[0].repeat(i));
      }
    }
    return r.join("");
  };
  var LMe = __lazy(() => {
    ePe();
    et();
    Zn();
    VNa = __toESM(pt(), 1);
    sft = __toESM(ie(), 1);
    l4n = [" ", "\u258F", "\u258E", "\u258D", "\u258C", "\u258B", "\u258A", "\u2589", "\u2588"];
    N1p = {
      fill: "\u25B0",
      empty: "\u25B1"
    };
    L1p = {
      fill: "\u2588",
      empty: "\u2591"
    };
  });
  var $1p;
  var zNa;
  var KNa = __lazy(() => {
    ki();
    et();
    Wl();
    CGt();
    $1p = __toESM(pt(), 1);
    zNa = __toESM(ie(), 1);
  });
  function JNa(e, {
    verbose: t
  }) {
    if (Object.keys(e).length === 0) {
      return "";
    }
    let n = yle(e);
    if (n !== null) {
      return n;
    }
    return Object.entries(e).map(([r, o]) => {
      let s = De(o);
      return `${r}: ${s}`;
    }).join(", ");
  }
  function XNa(e) {
    let t = e.at(-1);
    if (!t?.data) {
      return CS.jsx(Vn, {
        height: 1,
        children: CS.jsx(Text, {
          dimColor: true,
          children: "Running\u2026"
        })
      });
    }
    let {
      progress: n,
      total: r,
      progressMessage: o
    } = t.data;
    if (n === undefined) {
      return CS.jsx(Vn, {
        height: 1,
        children: CS.jsx(Text, {
          dimColor: true,
          children: "Running\u2026"
        })
      });
    }
    if (r !== undefined && r > 0) {
      let s = Math.min(1, Math.max(0, n / r));
      let i = Math.round(s * 100);
      return CS.jsx(Vn, {
        children: CS.jsxs(gXd, {
          flexDirection: "column",
          children: [o && CS.jsx(Text, {
            dimColor: true,
            children: o
          }), CS.jsxs(gXd, {
            flexDirection: "row",
            gap: 1,
            children: [CS.jsx(e9, {
              ratio: s,
              width: 20
            }), CS.jsxs(Text, {
              dimColor: true,
              children: [i, "%"]
            })]
          })]
        })
      });
    }
    return CS.jsx(Vn, {
      height: 1,
      children: CS.jsx(Text, {
        dimColor: true,
        children: o ?? `Processing\u2026 ${n}`
      })
    });
  }
  function c4n(e, t, {
    verbose: n,
    input: r
  }) {
    let o = e;
    if (!n) {
      let c = G1p(o, r);
      if (c !== null) {
        return CS.jsx(Vn, {
          height: 1,
          children: CS.jsxs(Text, {
            children: ["Sent a message to", " ", CS.jsx(Ansi, {
              children: TM(c.url, c.channel)
            })]
          })
        });
      }
    }
    let s = d9t(o);
    let a = s > 1e4 ? `${vGd.warning} Large MCP response (~${formatNumber(s)} tokens), this can fill up context quickly` : null;
    let l;
    if (Array.isArray(o)) {
      let c = o.map((u, d) => {
        if (u.type === "image") {
          return CS.jsx(gXd, {
            justifyContent: "space-between",
            overflowX: "hidden",
            width: "100%",
            children: CS.jsx(Vn, {
              height: 1,
              children: CS.jsx(Text, {
                children: "[Image]"
              })
            })
          }, d);
        }
        return CS.jsx(j1p, {
          item: u,
          verbose: n
        }, d);
      });
      l = CS.jsx(gXd, {
        flexDirection: "column",
        width: "100%",
        children: c
      });
    } else if (!o) {
      l = CS.jsx(gXd, {
        justifyContent: "space-between",
        overflowX: "hidden",
        width: "100%",
        children: CS.jsx(Vn, {
          height: 1,
          children: CS.jsx(Text, {
            dimColor: true,
            children: "(No content)"
          })
        })
      });
    } else {
      l = CS.jsx(vU, {
        content: o,
        verbose: n
      });
    }
    if (a) {
      return CS.jsxs(gXd, {
        flexDirection: "column",
        children: [CS.jsx(Vn, {
          height: 1,
          children: CS.jsx(Text, {
            color: "warning",
            children: a
          })
        }), l]
      });
    }
    return l;
  }
  function j1p(e) {
    let t = YNa.c(7);
    let {
      item: n,
      verbose: r
    } = e;
    let o = n.type === "text" && "text" in n && n.text !== null && n.text !== undefined ? String(n.text) : "";
    let s;
    if (t[4] !== o || t[5] !== r) {
      s = CS.jsx(vU, {
        content: o,
        verbose: r
      });
      t[4] = o;
      t[5] = r;
      t[6] = s;
    } else {
      s = t[6];
    }
    return s;
  }
  function q1p(e, {
    maxChars: t,
    maxKeys: n
  }) {
    let r = e.trim();
    if (r.length === 0 || r.length > t || r[0] !== "{") {
      return null;
    }
    let o;
    try {
      o = qt(r);
    } catch {
      return null;
    }
    if (o === null || typeof o !== "object" || Array.isArray(o)) {
      return null;
    }
    let s = Object.entries(o);
    if (s.length === 0 || s.length > n) {
      return null;
    }
    return s;
  }
  function G1p(e, t) {
    let n = e;
    if (Array.isArray(e)) {
      let c = e.find(u => u.type === "text");
      n = c && "text" in c ? c.text : undefined;
    }
    if (typeof n !== "string" || !n.includes('"message_link"')) {
      return null;
    }
    let o = q1p(n, {
      maxChars: 2000,
      maxKeys: 6
    })?.find(([c]) => c === "message_link")?.[1];
    if (typeof o !== "string") {
      return null;
    }
    let s = W1p.exec(o);
    if (!s) {
      return null;
    }
    let i = t;
    let a = i?.channel_id ?? i?.channel ?? s[1];
    let l = typeof a === "string" && a ? a : "slack";
    return {
      channel: l.startsWith("#") ? l : `#${l}`,
      url: o
    };
  }
  var YNa;
  var CS;
  var W1p;
  var d_o = __lazy(() => {
    LMe();
    FJ();
    KNa();
    Wl();
    vMe();
    bc();
    et();
    cs();
    EMe();
    Gd();
    m9t();
    YNa = __toESM(pt(), 1);
    CS = __toESM(ie(), 1);
    W1p = /^https:\/\/[a-z0-9-]+\.slack\.com\/archives\/([A-Z0-9]+)\/p\d+$/;
  });
  var V1p;
  var z1p;
  var p_o;
  var QNa = __lazy(() => {
    ci();
    m9t();
    mMe();
    d_o();
    V1p = we(() => v.object({}).passthrough());
    z1p = we(() => v.union([v.string(), v.array(v.object({
      type: v.string()
    }).passthrough()), v.undefined()]).describe("MCP tool execution result"));
    p_o = Xs({
      isMcp: true,
      isOpenWorld() {
        return false;
      },
      name: "mcp",
      maxResultSizeChars: 1e5,
      async description() {
        return "";
      },
      async prompt() {
        return "";
      },
      get inputSchema() {
        return V1p();
      },
      get outputSchema() {
        return z1p();
      },
      async call() {
        return {
          data: ""
        };
      },
      async checkPermissions() {
        return {
          behavior: "passthrough",
          message: "MCPTool requires permission."
        };
      },
      renderToolUseMessage: JNa,
      userFacingName: () => "mcp",
      renderToolUseProgressMessage: XNa,
      renderToolResultMessage: c4n,
      isResultTruncated(e, t) {
        let n = t?.columns;
        if (typeof e === "string") {
          return EU(e, n);
        }
        if (Array.isArray(e)) {
          return e.some(r => r.type === "text" && EU(r.text, n));
        }
        return false;
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: oft(e)
        };
      }
    });
  });
  function K1p(e, t) {
    var n = [];
    Rbu(e, function (r, o, s) {
      if (t(r, o, s)) {
        n.push(r);
      }
    });
    return n;
  }
  function Y1p(e, t) {
    var n = Peu(e) ? Deu : K1p;
    return n(e, Ebu(Hnu(t, 3)));
  }
  var f9t;
  var m_o = __lazy(() => {
    ph();
    f9t = Si();
  });
  function Eoe(e) {
    let t = [];
    return {
      expanded: e.replace(/\$\{([A-Za-z_][A-Za-z0-9_]*(?::-[^}]*)?)\}/g, (r, o) => {
        let s = o.indexOf(":-");
        let i = s === -1 ? o : o.slice(0, s);
        let a = s === -1 ? undefined : o.slice(s + 2);
        let l = process.env[i];
        if (l !== undefined) {
          return l;
        }
        if (a !== undefined) {
          return a;
        }
        t.push(i);
        return r;
      }),
      missingVars: t
    };
  }
  function X1p(e, t) {
    let n = t?.baseURL;
    let r = J1p.test(e);
    if ((r && !WHe(e) ? e : n != null && !WHe(n) ? n : !r && n == null ? e : null) !== null) {
      throw Error(`downloads: request (url="${e}"` + (n != null ? `, baseURL="${n}"` : "") + ") does not resolve to the public CDN (downloads.claude.ai). Use firstPartyApi for api.anthropic.com (residency-gated) or externalHttp for non-Anthropic hosts.");
    }
  }
  var J1p;
  var aEe;
  var h9t = __lazy(() => {
    Dp();
    qtt();
    Dp();
    J1p = /^([a-z][a-z\d+\-.]*:)?\/\//i;
    aEe = {
      get(e, t) {
        X1p(e, t);
        return NP.get(e, t);
      }
    };
  });
  var d4n = e => e.name === "up" || e.name === "k" || e.ctrl && e.name === "p";
  var f_o = e => e.name === "down" || e.name === "j" || e.ctrl && e.name === "n";
  var p4n = e => e.name === "backspace";
  var t1a = e => "123456789".includes(e.name);
  var ift = e => e.name === "enter" || e.name === "return";
  var h_o;
  var g_o;
  var y_o;
  var __o;
  var g9t;
  var m4n = __lazy(() => {
    h_o = class h_o extends Error {
      name = "AbortPromptError";
      message = "Prompt was aborted";
      constructor(e) {
        super();
        this.cause = e?.cause;
      }
    };
    g_o = class g_o extends Error {
      name = "CancelPromptError";
      message = "Prompt was canceled";
    };
    y_o = class y_o extends Error {
      name = "ExitPromptError";
    };
    __o = class __o extends Error {
      name = "HookError";
    };
    g9t = class g9t extends Error {
      name = "ValidationError";
    };
  });
  function Q1p(e) {
    return {
      rl: e,
      hooks: [],
      hooksCleanup: [],
      hooksEffect: [],
      index: 0,
      handleChange() {}
    };
  }
  function r1a(e, t) {
    let n = Q1p(e);
    return n1a.run(n, () => {
      function r(o) {
        n.handleChange = () => {
          n.index = 0;
          o();
        };
        n.handleChange();
      }
      return t(r);
    });
  }
  function a6e() {
    let e = n1a.getStore();
    if (!e) {
      throw new __o("[Inquirer] Hook functions can only be called from within a prompt");
    }
    return e;
  }
  function b_o() {
    return a6e().rl;
  }
  function S_o(e) {
    let t = (...n) => {
      let r = a6e();
      let o = false;
      let s = r.handleChange;
      r.handleChange = () => {
        o = true;
      };
      let i = e(...n);
      if (o) {
        s();
      }
      r.handleChange = s;
      return i;
    };
    return f4n.AsyncResource.bind(t);
  }
  function aft(e) {
    let t = a6e();
    let {
      index: n
    } = t;
    let r = {
      get() {
        return t.hooks[n];
      },
      set(s) {
        t.hooks[n] = s;
      },
      initialized: n in t.hooks
    };
    let o = e(r);
    t.index++;
    return o;
  }
  function o1a() {
    a6e().handleChange();
  }
  var f4n;
  var n1a;
  var l6e;
  var c6e = __lazy(() => {
    m4n();
    f4n = require("async_hooks");
    n1a = new f4n.AsyncLocalStorage();
    l6e = {
      queue(e) {
        let t = a6e();
        let {
          index: n
        } = t;
        t.hooksEffect.push(() => {
          t.hooksCleanup[n]?.();
          let r = e(b_o());
          if (r != null && typeof r !== "function") {
            throw new g9t("useEffect return value must be a cleanup function or nothing.");
          }
          t.hooksCleanup[n] = r;
        });
      },
      run() {
        let e = a6e();
        S_o(() => {
          e.hooksEffect.forEach(t => {
            t();
          });
          e.hooksEffect.length = 0;
        })();
      },
      clearAll() {
        let e = a6e();
        e.hooksCleanup.forEach(t => {
          t?.();
        });
        e.hooksEffect.length = 0;
        e.hooksCleanup.length = 0;
      }
    };
  });
  function CU(e) {
    return aft(t => {
      let n = o => {
        if (t.get() !== o) {
          t.set(o);
          o1a();
        }
      };
      if (t.initialized) {
        return [t.get(), n];
      }
      let r = typeof e === "function" ? e() : e;
      t.set(r);
      return [r, n];
    });
  }
  var h4n = __lazy(() => {
    c6e();
  });
  function u6e(e, t) {
    aft(n => {
      let r = n.get();
      if (!Array.isArray(r) || t.some((s, i) => !Object.is(s, r[i]))) {
        l6e.queue(e);
      }
      n.set(t);
    });
  }
  var g4n = __lazy(() => {
    c6e();
  });