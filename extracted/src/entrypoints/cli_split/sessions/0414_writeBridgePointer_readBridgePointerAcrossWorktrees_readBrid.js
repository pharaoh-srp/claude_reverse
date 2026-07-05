  __export(uBe, {
    writeBridgePointer: () => writeBridgePointer,
    readBridgePointerAcrossWorktrees: () => readBridgePointerAcrossWorktrees,
    readBridgePointer: () => readBridgePointer,
    getBridgePointerPath: () => getBridgePointerPath,
    clearBridgePointer: () => clearBridgePointer,
    BRIDGE_POINTER_TTL_MS: () => 14400000
  });
  function getBridgePointerPath(e) {
    return Ddr.join(nF(), $T(e), "bridge-pointer.json");
  }
  async function writeBridgePointer(e, t) {
    let n = getBridgePointerPath(e);
    try {
      await cBe.mkdir(Ddr.dirname(n), {
        recursive: true
      });
      await Fm(n, De(t));
      logForDebugging(`[bridge:pointer] wrote ${n}`);
      return true;
    } catch (r) {
      logForDebugging(`[bridge:pointer] write failed: ${r}`, {
        level: "warn"
      });
      return false;
    }
  }
  async function readBridgePointer(e, t) {
    let n = getBridgePointerPath(e);
    let r;
    let o;
    try {
      o = (await cBe.stat(n)).mtimeMs;
      r = await cBe.readFile(n, "utf8");
    } catch {
      return null;
    }
    let s = dlf().safeParse(flf(r));
    if (!s.success) {
      if (!t?.noClear) {
        logForDebugging(`[bridge:pointer] invalid schema, clearing: ${n}`);
        await clearBridgePointer(e);
      }
      return null;
    }
    let i = Math.max(0, Date.now() - o);
    if (i > 14400000) {
      if (!t?.noClear) {
        logForDebugging(`[bridge:pointer] stale (>4h mtime), clearing: ${n}`);
        await clearBridgePointer(e);
      }
      return null;
    }
    return {
      ...s.data,
      ageMs: i
    };
  }
  async function readBridgePointerAcrossWorktrees(e) {
    let t = await readBridgePointer(e);
    if (t) {
      return {
        pointer: t,
        dir: e
      };
    }
    let n = await B6(e);
    if (n.length <= 1) {
      return null;
    }
    if (n.length > 50) {
      logForDebugging(`[bridge:pointer] ${n.length} worktrees exceeds fanout cap ${50}, skipping`);
      return null;
    }
    let r = $T(e);
    let o = n.filter(a => $T(a) !== r);
    let s = await Promise.all(o.map(async a => {
      let l = await readBridgePointer(a);
      return l ? {
        pointer: l,
        dir: a
      } : null;
    }));
    let i = null;
    for (let a of s) {
      if (a && (!i || a.pointer.ageMs < i.pointer.ageMs)) {
        i = a;
      }
    }
    if (i) {
      logForDebugging(`[bridge:pointer] fanout found pointer in worktree ${i.dir} (ageMs=${i.pointer.ageMs})`);
    }
    return i;
  }
  async function clearBridgePointer(e) {
    let t = getBridgePointerPath(e);
    try {
      await cBe.unlink(t);
      logForDebugging(`[bridge:pointer] cleared ${t}`);
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`[bridge:pointer] clear failed: ${n}`, {
          level: "warn"
        });
      }
    }
  }
  function flf(e) {
    try {
      return qt(e);
    } catch {
      return null;
    }
  }
  var cBe;
  var Ddr;
  var dlf;
  var dBe = __lazy(() => {
    BT();
    je();
    dt();
    oje();
    ZS();
    cBe = require("fs/promises");
    Ddr = require("path");
    dlf = we(() => v.object({
      sessionId: v.string(),
      environmentId: v.string(),
      source: v.enum(["standalone", "repl"]),
      pid: v.number().optional(),
      procStart: v.string().optional()
    }));
  });
  var KCt = {};