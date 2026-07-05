  __export(skt, {
    startSyncedFileSyncer: () => startSyncedFileSyncer,
    stageSyncedFile: () => stageSyncedFile,
    shouldIgnore: () => shouldIgnore,
    sha256Hex: () => sha256Hex,
    relUnderSyncDir: () => relUnderSyncDir,
    recordSeenState: () => recordSeenState,
    pushSyncedFile: () => pushSyncedFile,
    lastSeenMtimeHasForTest: () => lastSeenMtimeHasForTest,
    isRetryableTransport: () => isRetryableTransport,
    getSeenState: () => getSeenState,
    flushSyncedFiles: () => flushSyncedFiles,
    escapesSyncRoot: () => escapesSyncRoot,
    drainSyncedFiles: () => drainSyncedFiles,
    clearSeenStateForTest: () => clearSeenStateForTest,
    clearInFlightForTest: () => clearInFlightForTest,
    WORKING_FILESTORE_PREFIX: () => "/working",
    SYNCED_FILE_ROOT: () => "/mnt/user-data/working",
    POLL_MS: () => 5000,
    POLL_BACKOFF_MAX_MS: () => 120000,
    MAX_WORKING_FILE_BYTES: () => 26214400,
    MAX_SCAN_ENTRIES: () => 4096
  });
  function recordSeenState(e, t, n) {
    $Xe.set(e, {
      etag: t,
      localHash: n
    });
    fRe.delete(e);
  }
  function getSeenState(e) {
    return $Xe.get(e);
  }
  function T4f(e, t) {
    if (t === undefined) {
      return;
    }
    if (fRe.delete(e), fRe.set(e, t), fRe.size > 4096) {
      let n = fRe.keys().next().value;
      if (n !== undefined) {
        fRe.delete(n);
      }
    }
  }
  function clearSeenStateForTest() {
    $Xe.clear();
    okt.clear();
    fRe.clear();
  }
  function lastSeenMtimeHasForTest(e) {
    return okt.vZc(e);
  }
  function S6c(e, t) {
    let r = (c2e.get(e) ?? Promise.resolve()).then(t, t);
    c2e.set(e, r);
    r.finally(() => {
      if (c2e.get(e) === r) {
        c2e.delete(e);
      }
    }).catch(() => {});
    return r;
  }
  function clearInFlightForTest() {
    c2e.clear();
  }
  function sha256Hex(e) {
    return g6c.createHash("sha256").update(e).digest("hex");
  }
  function relUnderSyncDir(e, t) {
    if (!Lns(e)) {
      throw Error("syncDir must be absolute");
    }
    if (t.includes("\x00")) {
      throw Error("path contains null bytes");
    }
    if (!Lns(t)) {
      throw Error("path must be absolute");
    }
    let n = xsn(e, y4f(t));
    if (n === "" || n === "." || escapesSyncRoot(n)) {
      throw Error("path must be under the working sync dir");
    }
    return n;
  }
  function escapesSyncRoot(e) {
    return Lns(e) || e.split(mbr).includes("..");
  }
  function shouldIgnore(e) {
    for (let t of e.split(mbr)) {
      if (t.startsWith(".") || t.endsWith("~") || t.endsWith(".swp") || t.endsWith(".tmp")) {
        return true;
      }
    }
    return false;
  }
  function isRetryableTransport(e, t) {
    if (e === "timeout" || e === "network") {
      return true;
    }
    if (e === "auth" || e === "other") {
      return false;
    }
    if (t === undefined) {
      return true;
    }
    return t === 408 || t === 429 || t >= 500;
  }
  function v6c(e, t) {
    let {
      kind: n,
      status: r
    } = YS(t);
    let o = isRetryableTransport(n, r);
    if (o) {
      Uns++;
    }
    return {
      kind: "error",
      message: `${e} failed: ${n}${r ? ` ${r}` : ""}`,
      retryable: o
    };
  }
  async function Bns(e, t, n) {
    try {
      let r = await _s.put("/worker/synced_file", {
        path: `${"/working"}/${e}`,
        content: t.toString("base64"),
        ...(n && {
          if_match_sha256: n
        }),
        worker_epoch: Me.CLAUDE_CODE_WORKER_EPOCH ?? 0
      }, {
        auth: "session-jwt",
        host: "ccr-session",
        headers: {
          "anthropic-version": "2023-06-01"
        },
        timeout: 30000,
        validateStatus: o => o >= 200 && o < 300 || o === 409,
        maxBodyLength: Math.ceil(26214400 * 4 / 3) + 1024
      });
      if (!r.ok) {
        return {
          kind: "error",
          message: `put gated: ${r.reason}`,
          retryable: false
        };
      }
      if (r.status === 409) {
        return {
          kind: "conflict"
        };
      }
      return {
        kind: "ok",
        content_sha256: r.data.content_sha256
      };
    } catch (r) {
      return v6c("put", r);
    }
  }
  async function fbr(e) {
    try {
      let t = await _s.get(`/worker/synced_file?path=${encodeURIComponent(`${"/working"}/${e}`)}`, {
        auth: "session-jwt",
        host: "ccr-session",
        headers: {
          "anthropic-version": "2023-06-01"
        },
        timeout: 30000,
        maxContentLength: Math.ceil(26214400 * 4 / 3) + 1024,
        validateStatus: n => n >= 200 && n < 300 || n === 404
      });
      if (!t.ok) {
        return {
          kind: "error",
          message: `get gated: ${t.reason}`,
          retryable: false
        };
      }
      if (t.status === 404) {
        return {
          kind: "not_found"
        };
      }
      return {
        kind: "ok",
        buf: Buffer.from(t.data.content, "base64"),
        content_sha256: t.data.content_sha256
      };
    } catch (t) {
      return v6c("get", t);
    }
  }
  async function w6c(e, t) {
    let n = await kR.realpath(e);
    let r = await kR.realpath(wsn(t));
    let o = xsn(n, r);
    if (escapesSyncRoot(o)) {
      let s = Error("dest parent escaped working sync dir");
      throw s.code = "WORKING_PARENT_ESCAPE", s;
    }
    try {
      if ((await kR.lstat(t)).isSymbolicLink()) {
        let i = Error("dest is a symlink");
        throw i.code = "WORKING_DEST_SYMLINK", i;
      }
    } catch (s) {
      if (!fn(s)) {
        throw s;
      }
    }
  }
  async function $ns(e, t, n) {
    await kR.mkdir(e).catch(i => {
      if (en(i) !== "EEXIST") {
        throw i;
      }
    });
    let r = await kR.realpath(e);
    let o = wsn(t);
    for (;;) {
      try {
        let i = await kR.realpath(o);
        let a = xsn(r, i);
        if (escapesSyncRoot(a)) {
          let l = Error("dest ancestor escaped working sync dir");
          throw l.code = "WORKING_PARENT_ESCAPE", l;
        }
        break;
      } catch (i) {
        if (!fn(i)) {
          throw i;
        }
        let a = wsn(o);
        if (a === o) {
          break;
        }
        o = a;
      }
    }
    await kR.mkdir(wsn(t), {
      recursive: true
    });
    await w6c(e, t);
    let s = `${t}.${process.hrtime.bigint().toString(36)}.tmp`;
    try {
      await kR.writeFile(s, n, {
        mode: 384
      });
      await kR.rename(s, t);
    } catch (i) {
      throw await kR.unlink(s).catch(() => {}), i;
    }
  }
  async function stageSyncedFile(e, t, n) {
    let r;
    try {
      r = relUnderSyncDir(n, e.mount_path);
    } catch (s) {
      Ae("ccr_synced_file_stage", "bad_mount_path");
      return {
        ok: false,
        error: s instanceof Error ? s.message : String(s)
      };
    }
    if (shouldIgnore(r)) {
      Ae("ccr_synced_file_stage", "ignored_path");
      return {
        ok: false,
        error: "mount_path is an ignored path"
      };
    }
    let o = Csn(n, r);
    return S6c(r, async () => {
      let s;
      let i;
      try {
        try {
          await w6c(n, o);
        } catch (m) {
          if (!fn(m)) {
            Ae("ccr_synced_file_stage", "containment_failed");
            return {
              ok: false,
              error: `mount_path failed containment: ${en(m) ?? "unknown"}`
            };
          }
        }
        let a = null;
        try {
          let m = await kR.open(o, Q5.constants.O_RDONLY | Q5.constants.O_NOFOLLOW | Q5.constants.O_NONBLOCK);
          try {
            let f = await m.stat();
            if (f.isFile()) {
              if (f.size > 26214400) {
                Ae("ccr_synced_file_stage", "too_large");
                return {
                  ok: false,
                  error: "local file too large to reconcile"
                };
              }
              a = await m.readFile();
            }
          } finally {
            await m.close();
          }
        } catch (m) {
          let f = en(m);
          if (f !== "ENOENT" && f !== "ELOOP" && f !== "EMLINK") {
            throw m;
          }
        }
        let l = a ? sha256Hex(a) : undefined;
        let c = getSeenState(o);
        if (l && c && c.localHash === l && e.content_sha256 !== undefined && c.etag === e.content_sha256) {
          Pe("ccr_synced_file_stage");
          return {
            ok: true,
            noop: "already_present"
          };
        }
        let u = e.expected_local_sha256 || undefined;
        let d = c && c.localHash === l && (u === undefined || c.etag === u);
        if (a && !d) {
          let m = await Bns(r, a, u);
          if (m.kind === "error") {
            Ae("ccr_synced_file_stage", "push_failed");
            return {
              ok: false,
              error: m.message
            };
          }
          let f = await fbr(r);
          if (f.kind !== "ok") {
            Ae("ccr_synced_file_stage", "reget_failed");
            return {
              ok: false,
              error: f.kind === "error" ? f.message : "get not_found after put"
            };
          }
          s = f.buf;
          i = f.content_sha256;
          wn("info", "working_stage_reconciled", {
            conflict: m.kind === "conflict"
          });
        } else {
          let m = await t(e.filestore_path);
          if (!m.ok) {
            Ae("ccr_synced_file_stage", "fetch_failed");
            return {
              ok: false,
              error: m.error
            };
          }
          if (m.buf.length > 26214400) {
            Ae("ccr_synced_file_stage", "too_large");
            return {
              ok: false,
              error: "staged content too large"
            };
          }
          s = m.buf;
          i = e.content_sha256;
        }
        let p = null;
        try {
          let m = await kR.open(o, Q5.constants.O_RDONLY | Q5.constants.O_NOFOLLOW | Q5.constants.O_NONBLOCK);
          try {
            let f = await m.stat();
            if (f.isFile()) {
              if (f.size > 26214400) {
                Ae("ccr_synced_file_stage", "too_large");
                return {
                  ok: false,
                  error: "local file too large to reconcile"
                };
              }
              p = await m.readFile();
            }
          } finally {
            await m.close();
          }
        } catch (m) {
          let f = en(m);
          if (f !== "ENOENT" && f !== "ELOOP" && f !== "EMLINK") {
            throw m;
          }
        }
        if (p && sha256Hex(p) !== l) {
          let m = await Bns(r, p, i);
          if (m.kind === "error") {
            Ae("ccr_synced_file_stage", "push_failed");
            return {
              ok: false,
              error: m.message
            };
          }
          let f = await fbr(r);
          if (f.kind !== "ok") {
            Ae("ccr_synced_file_stage", "reget_failed");
            return {
              ok: false,
              error: f.kind === "error" ? f.message : "get not_found after put"
            };
          }
          s = f.buf;
          i = f.content_sha256;
          wn("info", "working_stage_reconciled", {
            conflict: m.kind === "conflict",
            mid_window: true
          });
        }
      } catch (a) {
        Ae("ccr_synced_file_stage", "reconcile_threw");
        return {
          ok: false,
          error: `reconcile failed: ${en(a) ?? "unknown"}`
        };
      }
      try {
        await $ns(n, o, s);
      } catch (a) {
        Ae("ccr_synced_file_stage", "write_failed");
        return {
          ok: false,
          error: `write failed: ${en(a) ?? "unknown"}`
        };
      }
      recordSeenState(o, i, sha256Hex(s));
      Pe("ccr_synced_file_stage");
      wn("info", "working_stage_ok", {
        bytes: s.length
      });
      return {
        ok: true
      };
    });
  }
  async function pushSyncedFile(e, t) {
    let n = Csn(e, t);
    let r;
    try {
      r = await kR.realpath(n);
    } catch (p) {
      if (fn(p)) {
        return true;
      }
      throw p;
    }
    let o;
    try {
      o = await kR.realpath(e);
    } catch {
      return false;
    }
    let s = xsn(o, r);
    if (s !== t && (s === "" || escapesSyncRoot(s))) {
      Et("ccr_synced_file_push", "symlink_escape");
      return true;
    }
    let i;
    try {
      let p = await kR.open(n, Q5.constants.O_RDONLY | Q5.constants.O_NOFOLLOW | Q5.constants.O_NONBLOCK);
      try {
        let m = await p.stat();
        if (!m.isFile()) {
          return true;
        }
        if (m.size > 26214400) {
          Et("ccr_synced_file_push", "too_large");
          return true;
        }
        i = await p.readFile();
      } finally {
        await p.close();
      }
    } catch (p) {
      let m = en(p);
      if (m === "ELOOP" || m === "EMLINK") {
        Et("ccr_synced_file_push", "symlink_escape");
        return true;
      }
      Ae("ccr_synced_file_push", "read_failed");
      return false;
    }
    let a = sha256Hex(i);
    let l = getSeenState(n);
    if (a === l?.localHash) {
      return true;
    }
    let c = l === undefined ? fRe.get(n) : undefined;
    if (l === undefined && c === undefined) {
      let p = await fbr(t);
      if (p.kind === "error") {
        Ae("ccr_synced_file_push", "seed_get_failed");
        return !p.retryable;
      }
      if (p.kind === "ok") {
        let m = sha256Hex(p.buf);
        if (m === a) {
          recordSeenState(n, p.content_sha256, a);
          return true;
        }
        try {
          await $ns(e, n, p.buf);
        } catch {
          Ae("ccr_synced_file_push", "write_failed");
          return false;
        }
        recordSeenState(n, p.content_sha256, m);
        Et("ccr_synced_file_push", "cold_renderer_wins");
        return true;
      }
    }
    let u = await Bns(t, i, l?.etag ?? c);
    if (u.kind === "ok") {
      recordSeenState(n, u.content_sha256, a);
      Pe("ccr_synced_file_push");
      return true;
    }
    if (u.kind === "error") {
      Ae("ccr_synced_file_push", u.retryable ? "put_failed" : "put_rejected");
      wn("warn", "working_push_failed", {
        reason: u.message,
        retryable: u.retryable
      });
      return !u.retryable;
    }
    let d = await fbr(t);
    if (d.kind === "error") {
      Ae("ccr_synced_file_push", "reget_failed");
      return !d.retryable;
    }
    if (d.kind === "not_found") {
      $Xe.delete(n);
      fRe.delete(n);
      Ae("ccr_synced_file_push", "reget_failed");
      return false;
    }
    try {
      await $ns(e, n, d.buf);
    } catch {
      Ae("ccr_synced_file_push", "write_failed");
      return false;
    }
    recordSeenState(n, d.content_sha256, sha256Hex(d.buf));
    Et("ccr_synced_file_push", "conflict_overwritten");
    return true;
  }
  function flushSyncedFiles() {
    return Rsn?.flush() ?? Promise.resolve();
  }
  async function drainSyncedFiles() {
    await flushSyncedFiles();
    for (;;) {
      if (c2e.size === 0 && (Rsn?.pendingCount() ?? 0) === 0) {
        return;
      }
      await Promise.allSettled([...c2e.values()]);
      await new Promise(e => setImmediate(e));
    }
  }
  function startSyncedFileSyncer(e) {
    try {
      if (!Q5.existsSync(wsn(e))) {
        wn("info", "working_sync_parent_absent", {});
        return null;
      }
      Q5.mkdirSync(e, {
        recursive: true
      });
    } catch (g) {
      Et("ccr_synced_file_push", "sync_start_failed");
      wn("warn", "working_sync_start_failed", {
        code: en(g) ?? "unknown"
      });
      return null;
    }
    let t = 0;
    let n = [];
    let r = () => t < 4 ? (t++, Promise.resolve()) : new Promise(g => n.push(g));
    let o = () => {
      let g = n.shift();
      if (g) {
        g();
      } else {
        t--;
      }
    };
    let s = new Set();
    let i = false;
    let a = false;
    let l = 0;
    let c = 0;
    let u = async () => {
      let g = [];
      let y = [""];
      let _ = new Set();
      let b = [...$Xe.keys()];
      let S = Uns;
      let E = 0;
      let C = false;
      let x = false;
      e: while (y.length && !i) {
        let A = y.shift();
        let k;
        try {
          k = await kR.readdir(Csn(e, A), {
            withFileTypes: true
          });
        } catch (I) {
          wn("warn", "working_scan_readdir_failed", {
            code: en(I) ?? "unknown"
          });
          x = true;
          continue;
        }
        for (let I of k) {
          if (++E > 4096) {
            if (C = true, !a) {
              Et("ccr_synced_file_push", "scan_cap_reached");
              a = true;
            }
            break e;
          }
          let O = A ? Csn(A, I.name) : I.name;
          if (_.add(O), shouldIgnore(O)) {
            continue;
          }
          if (I.isDirectory()) {
            y.push(O);
            continue;
          }
          if (!I.isFile()) {
            continue;
          }
          let M;
          try {
            M = (await kR.lstat(Csn(e, O))).mtimeMs;
          } catch {
            continue;
          }
          if (M === okt.get(O)) {
            continue;
          }
          if (s.vZc(O) || c2e.vZc(O)) {
            continue;
          }
          s.add(O);
          g.push((async () => {
            await r();
            try {
              if (await S6c(O, () => pushSyncedFile(e, O))) {
                okt.set(O, M);
              }
            } finally {
              s.delete(O);
              o();
            }
          })().catch(L => wn("warn", "working_push_threw", {
            code: en(L) ?? "unknown"
          })));
        }
      }
      if (!C && !x && !i) {
        for (let k of okt.keys()) {
          if (!_.vZc(k)) {
            okt.delete(k);
          }
        }
        let A = e.endsWith(mbr) ? e : e + mbr;
        for (let k of b) {
          if (k.startsWith(A) && !_.vZc(xsn(e, k))) {
            T4f(k, $Xe.get(k)?.etag);
            $Xe.delete(k);
          }
        }
      }
      if (await Promise.allSettled(g), Uns > S) {
        l = l === 0 ? 2 * 5000 : Math.min(l * 2, 120000);
        c = Date.now() + l;
      } else if (s.size === 0) {
        l = 0;
        c = 0;
      }
    };
    let d = 0;
    let p = async () => {
      d++;
      try {
        await u();
      } finally {
        d--;
      }
    };
    let m = p();
    let f = setInterval(() => {
      if (d > 0 || Date.now() < c) {
        return;
      }
      p().catch(g => wn("warn", "working_push_threw", {
        code: en(g) ?? "unknown"
      }));
    }, 5000);
    f.unref?.();
    wn("info", "working_sync_started", {});
    let h = {
      initialReconcile: m,
      flush: p,
      pendingCount: () => s.size,
      pollBackoffUntilForTest: () => c,
      stop() {
        if (i = true, clearInterval(f), Rsn === h) {
          Rsn = null;
        }
      }
    };
    Rsn = h;
    return h;
  }
  var g6c;
  var Q5;
  var kR;
  var y6c;
  var wsn;
  var Lns;
  var Csn;
  var y4f;
  var xsn;
  var mbr;
  var $Xe;
  var fRe;
  var okt;
  var c2e;
  var Uns = 0;
  var Rsn = null;
  var Kns = {};
  __export(Kns, {
    stageFile: () => stageFile,
    resolveStageFileRoot: () => resolveStageFileRoot,
    fetchFilestoreBytes: () => fetchFilestoreBytes,
    destFromMountPath: () => destFromMountPath,
    STAGE_FILE_ROOT: () => STAGE_FILE_ROOT,
    STAGE_FILE_MOUNT_PREFIX: () => "/uploads",
    DEFAULT_STAGE_FILE_ROOT: () => "/mnt/user-data/uploads"
  });
  function resolveStageFileRoot(e) {
    if (!e) {
      return "/mnt/user-data/uploads";
    }
    if (!hbr(e)) {
      throw Error("CLAUDE_STAGE_FILE_ROOT must be an absolute path");
    }
    return P6c(e);
  }
  function destFromMountPath(e) {
    if (e.includes("\x00")) {
      throw Error("mount_path contains null bytes");
    }
    if (!hbr(e)) {
      throw Error("mount_path must be absolute");
    }
    let t = P6c(e);
    let n = O6c("/uploads", t);
    if (n === "" || n === "." || n.split(D6c).includes("..") || hbr(n)) {
      throw Error(`mount_path must be under ${"/uploads"}/`);
    }
    return k4f(STAGE_FILE_ROOT, n);
  }
  function I4f(e, t) {
    let n = O6c(e, t);
    if (n === ".." || n.startsWith(".." + D6c) || hbr(n)) {
      let r = Error("dest parent escaped stage root");
      throw r.code = "STAGE_PARENT_ESCAPE", r;
    }
  }
  function P4f(e) {
    return typeof e === "object" && e !== null && e.code === "EROFS";
  }
  function A6c(e, t) {
    let {
      kind: n,
      status: r
    } = YS(t);
    return {
      kind: n,
      status: r,
      message: `${e} failed: ${n}${r ? ` ${r}` : ""}`
    };
  }
  async function stageFile(e) {
    if (!Me.CLAUDE_CODE_REMOTE_SESSION_ID) {
      return {
        ok: false,
        error: "CLAUDE_CODE_REMOTE_SESSION_ID unset"
      };
    }
    if (e.filestore_path) {
      if (Me.CLAUDE_CODE_ENVIRONMENT_KIND !== undefined) {
        Ae("ccr_synced_file_stage", "unsupported_runner_kind");
        logEvent("tengu_stage_file_completed", {
          ok: false,
          synced_unsupported_runner_kind: true,
          duration_ms: 0
        });
        return {
          ok: false,
          error: "synced-file staging not supported on this runner kind"
        };
      }
      let {
        stageSyncedFile: u,
        SYNCED_FILE_ROOT: d
      } = await Promise.resolve().then(() => (ikt(), skt));
      return u({
        mount_path: e.mount_path,
        filestore_path: e.filestore_path,
        content_sha256: e.content_sha256,
        expected_local_sha256: e.expected_local_sha256
      }, fetchFilestoreBytes, d);
    }
    let n;
    try {
      n = destFromMountPath(e.mount_path);
    } catch (c) {
      return {
        ok: false,
        error: c instanceof Error ? c.message : String(c)
      };
    }
    if (!e.force) {
      try {
        if ((await l4.stat(n)).isFile()) {
          wn("debug", "stage_file_noop_already_present", {});
          logEvent("tengu_stage_file_completed", {
            ok: true,
            noop_already_present: true,
            duration_ms: 0
          });
          return {
            ok: true,
            noop: "already_present"
          };
        }
      } catch {}
    }
    let r = performance.now();
    let o = () => Math.round(performance.now() - r);
    let s = await fetchFilestoreBytes(e.mount_path);
    if (!s.ok) {
      logEvent("tengu_stage_file_completed", {
        ok: false,
        gated: s.gated,
        duration_ms: o()
      });
      return s;
    }
    let i = s.buf;
    let a = o();
    let l = `${n}.tmp.${Date.now()}.${Math.random().toString(36).slice(2)}`;
    try {
      await l4.mkdir(x6c(n), {
        recursive: true
      });
      let c = await l4.realpath(STAGE_FILE_ROOT);
      let u = await l4.realpath(x6c(n));
      I4f(c, u);
      await l4.writeFile(l, i);
      await l4.chmod(l, 292);
      await l4.rename(l, n);
    } catch (c) {
      if (await l4.unlink(l).catch(() => {}), P4f(c) && !Me.CLAUDE_STAGE_FILE_ROOT) {
        logEvent("tengu_stage_file_completed", {
          ok: true,
          noop: true,
          fetch_ms: a,
          duration_ms: o(),
          bytes: 0
        });
        wn("debug", "stage_file_noop_readonly_mount", {
          duration_ms: o()
        });
        return {
          ok: true,
          noop: "readonly_mount"
        };
      }
      let u = typeof c === "object" && c !== null && "code" in c ? String(c.code) : "unknown";
      logEvent("tengu_stage_file_completed", {
        ok: false,
        fetch_ms: a,
        duration_ms: o(),
        bytes: i.length
      });
      wn("warn", "stage_file_write_failed", {
        code: u,
        duration_ms: o()
      });
      return {
        ok: false,
        error: `write failed: ${u}`
      };
    }
    logEvent("tengu_stage_file_completed", {
      ok: true,
      fetch_ms: a,
      duration_ms: o(),
      bytes: i.length
    });
    wn("info", "stage_file_ok", {
      bytes: i.length,
      fetch_ms: a,
      duration_ms: o()
    });
    return {
      ok: true
    };
  }
  async function fetchFilestoreBytes(e) {
    let t = performance.now();
    let n = () => Math.round(performance.now() - t);
    let r;
    let o;
    try {
      let s = await _s.get("/worker/files", {
        auth: "session-jwt",
        host: "ccr-session",
        headers: {
          "anthropic-version": "2023-06-01"
        },
        timeout: 30000
      });
      if (!s.ok) {
        wn("warn", "stage_file_list_gated", {
          reason: s.reason,
          duration_ms: n()
        });
        return {
          ok: false,
          error: `list gated: ${s.reason}`,
          gated: true
        };
      }
      if (s.status < 200 || s.status >= 300) {
        wn("warn", "stage_file_list_failed", {
          kind: "http",
          status: s.status,
          duration_ms: n()
        });
        return {
          ok: false,
          error: `list failed: http ${s.status}`
        };
      }
      if (r = s.data.filestore_jwt, o = s.data.filesystem_id, !r || !o) {
        return {
          ok: false,
          error: "list returned incomplete credential"
        };
      }
    } catch (s) {
      let {
        kind: i,
        status: a,
        message: l
      } = A6c("list", s);
      wn("warn", "stage_file_list_failed", {
        kind: i,
        status: a,
        duration_ms: n()
      });
      return {
        ok: false,
        error: l
      };
    }
    try {
      let s = await _s.post("/v1/filestore/fs/readFile", {
        filesystem_id: o,
        path: e
      }, {
        auth: "none",
        host: "api",
        headers: {
          Authorization: `Bearer ${r}`
        },
        responseType: "arraybuffer",
        timeout: 30000,
        maxContentLength: 67108864
      });
      if (!s.ok) {
        wn("warn", "stage_file_read_gated", {
          reason: s.reason,
          duration_ms: n()
        });
        return {
          ok: false,
          error: `read gated: ${s.reason}`,
          gated: true
        };
      }
      if (s.status < 200 || s.status >= 300) {
        wn("warn", "stage_file_read_failed", {
          kind: "http",
          status: s.status,
          duration_ms: n()
        });
        return {
          ok: false,
          error: `read failed: http ${s.status}`
        };
      }
      return {
        ok: true,
        buf: Buffer.from(s.data)
      };
    } catch (s) {
      let {
        kind: i,
        status: a,
        message: l
      } = A6c("read", s);
      wn("warn", "stage_file_read_failed", {
        kind: i,
        status: a,
        duration_ms: n()
      });
      return {
        ok: false,
        error: l
      };
    }
  }
  var l4;
  var I6c;
  var x6c;
  var hbr;
  var k4f;
  var P6c;
  var O6c;
  var D6c;
  var STAGE_FILE_ROOT;
  var Yns = __lazy(() => {
    Zm();
    pr();
    dt();
    ln();
    Ot();
    bg();
    l4 = require("fs/promises");
    I6c = require("path");
    ({
      dirname: x6c,
      isAbsolute: hbr,
      join: k4f,
      normalize: P6c,
      relative: O6c,
      sep: D6c
    } = I6c.posix);
    STAGE_FILE_ROOT = resolveStageFileRoot(Me.CLAUDE_STAGE_FILE_ROOT);
  });
  var U6c = {};
  __export(U6c, {
    buildWorkspaceDiffResponse: () => buildWorkspaceDiffResponse
  });
  async function buildWorkspaceDiffResponse(e) {
    let t = await Lvo();
    if (t === null) {
      return {
        diff: null
      };
    }
    let n = await j9n();
    if (n === null) {
      return {
        diff: null
      };
    }
    let r = n.source.kind === "branch" ? n.source.baseRef : "HEAD";
    let o = await q9n(undefined, r);
    let s = await Lvo();
    if (s === null || s !== t) {
      return {
        diff: null
      };
    }
    let i = o ? Array.from(o.skippedLarge) : [];
    let a = [];
    let l = [];
    let c = 2000000;
    if (o) {
      for (let [u, d] of o.hunks) {
        if (!n.perFileStats.vZc(u) || u.includes(" b/")) {
          continue;
        }
        if (!fg(F6c.join(s, u)).every(f => xdt(f, e, "read").allowed)) {
          a.push(u);
          continue;
        }
        let m = d.reduce((f, h) => f + h.lines.reduce((g, y) => g + y.length + 1, 0), 0);
        if (m > c) {
          i.push(u);
          continue;
        }
        c -= m;
        l.push({
          path: u,
          hunks: d
        });
      }
    }
    return {
      diff: {
        stats: n.stats,
        perFileStats: Array.from(n.perFileStats, ([u, d]) => ({
          path: u,
          ...d
        })),
        hunks: l,
        skippedLarge: i,
        restricted: a,
        source: n.source
      }
    };
  }
  var F6c;
  var B6c = __lazy(() => {
    Qht();
    mde();
    F6c = require("path");
  });
  var H6c = {};