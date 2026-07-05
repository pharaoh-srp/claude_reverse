  __export(UCe, {
    runFastPathPolicyHelper: () => runFastPathPolicyHelper,
    resetFastPathPolicyForTesting: () => resetFastPathPolicyForTesting,
    loadFastPathPolicy: () => loadFastPathPolicy,
    ensureFastPathSettingsLoaded: () => ensureFastPathSettingsLoaded
  });
  async function ensureFastPathSettingsLoaded() {
    if ($7o) {
      return;
    }
    $7o = true;
    enableConfigs();
    await Vnt();
    applySafeConfigEnvironmentVariables();
    let e = g_c();
    if (e) {
      process.stderr.write(`${e}
`);
      process.exit(1);
    }
  }
  async function runFastPathPolicyHelper() {
    if (wRt) {
      return wRt.error;
    }
    if (wRt = {
      error: null
    }, wRt.error = await Wyn(getBasePolicySettings(), getBasePolicySettingsOrigin()), Rle()) {
      applySafeConfigEnvironmentVariables();
    }
    return wRt.error;
  }
  async function loadFastPathPolicy() {
    await ensureFastPathSettingsLoaded();
    return runFastPathPolicyHelper();
  }
  function resetFastPathPolicyForTesting() {
    $7o = false;
    wRt = null;
  }
  var $7o = false;
  var wRt = null;
  var bhe = __lazy(() => {
    qEe();
    B7o();
    _st();
    Kke();
    xje();
  });
  async function m_f() {
    let e = CBe.join(boe(), "claude");
    if (!process.execPath.startsWith(CBe.join(e, "versions") + CBe.sep)) {
      return null;
    }
    let t = CBe.join(e, "ClaudeCode.app", "Contents", "MacOS");
    let n = CBe.join(t, "claude");
    try {
      let r = (await Die.stat(process.execPath)).ino;
      await Die.mkdir(t, {
        recursive: true
      });
      await Die.writeFile(CBe.join(t, "..", "Info.plist"), `<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0"><dict><key>CFBundleIdentifier</key><string>com.anthropic.claude-code</string><key>CFBundleName</key><string>Claude Code</string><key>CFBundleDisplayName</key><string>Claude Code</string><key>CFBundleExecutable</key><string>claude</string><key>CFBundlePackageType</key><string>APPL</string><key>LSUIElement</key><true/><key>NSMicrophoneUsageDescription</key><string>Claude Code uses the microphone for voice dictation.</string><key>NSAppleEventsUsageDescription</key><string>Claude Code needs to send Apple Events to open URLs and control applications you authorize.</string><key>NSLocalNetworkUsageDescription</key><string>Claude Code connects to servers and devices on your local network when commands you run need to reach them.</string></dict></plist>
`);
      try {
        if ((await Die.stat(n)).ino === r) {
          return n;
        }
        await Die.unlink(n);
      } catch {}
      await Die.link(process.execPath, n);
      return n;
    } catch {
      return null;
    }
  }
  async function __c() {
    if (Wt() !== "macos") {
      return;
    }
    if (process.env.CLAUDE_BG_TCC_DISCLAIMED) {
      delete process.env.CLAUDE_BG_TCC_DISCLAIMED;
      return;
    }
    let e = (await m_f()) ?? process.execPath;
    try {
      let t = require("bun:ffi");
      let {
        symbols: n
      } = t.dlopen("/usr/lib/libSystem.B.dylib", {
        posix_spawnattr_init: {
          args: ["ptr"],
          returns: "int"
        },
        posix_spawnattr_setflags: {
          args: ["ptr", "i16"],
          returns: "int"
        },
        posix_spawnattr_destroy: {
          args: ["ptr"],
          returns: "int"
        },
        responsibility_spawnattrs_setdisclaim: {
          args: ["ptr", "int"],
          returns: "int"
        },
        posix_spawn: {
          args: ["ptr", "ptr", "ptr", "ptr", "ptr", "ptr"],
          returns: "int"
        }
      });
      let r = new BigUint64Array(1);
      if (n.posix_spawnattr_init(r) !== 0) {
        return;
      }
      try {
        if (n.posix_spawnattr_setflags(r, 64) !== 0 || n.responsibility_spawnattrs_setdisclaim(r, 1) !== 0) {
          return;
        }
        let s = [];
        let i = p => {
          let m = Buffer.from(p + "\x00", "utf8");
          s.push(m);
          return BigInt(t.ptr(m));
        };
        let a = p => {
          let m = new BigUint64Array(p.length + 1);
          p.forEach((f, h) => m[h] = i(f));
          return m;
        };
        let l = rm() ? [e] : [e, process.argv[1]];
        let c = Buffer.from(e + "\x00", "utf8");
        let u = a([...l, ...process.argv.slice(2)]);
        let d = a(Object.entries({
          ...process.env,
          CLAUDE_BG_TCC_DISCLAIMED: "1"
        }).flatMap(([p, m]) => m === undefined ? [] : [`${p}=${m}`]));
        n.posix_spawn(null, c, null, r, u, d);
      } finally {
        n.posix_spawnattr_destroy(r);
      }
    } catch {}
  }
  var Die;
  var CBe;
  var b_c = __lazy(() => {
    Cs();
    zTe();
    Die = require("fs/promises");
    CBe = require("path");
  });
  var w_c = {};