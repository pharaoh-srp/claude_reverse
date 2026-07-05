  __export(KPa, {
    shutdownErrorTracking: () => shutdownErrorTracking,
    isErrorTrackingCapReached: () => isErrorTrackingCapReached,
    flushErrorTracking: () => flushErrorTracking,
    enqueueErrorLog: () => enqueueErrorLog,
    _resetForTesting: () => _resetForTesting,
    DD_BROWSER_INTAKE: () => "https://browser-intake-us5-datadoghq.com/api/v2/logs"
  });
  function vOp() {
    return parseInt(process.env.CLAUDE_CODE_DD_ERROR_TRACKING_FLUSH_INTERVAL_MS || "", 10) || 30000;
  }
  async function wOp(e) {
    let t = De(e);
    let n = new URLSearchParams({
      ddsource: "browser",
      "dd-api-key": "pubea5604404508cdd34afb69e6f42a05bc",
      "dd-evp-origin": "browser",
      "dd-evp-origin-version": {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      "dd-request-id": VPa.randomUUID()
    });
    try {
      await externalHttp.post(`${"https://browser-intake-us5-datadoghq.com/api/v2/logs"}?${n}`, t, {
        headers: {
          "Content-Type": "application/json"
        },
        timeout: 1e4
      });
    } catch (r) {
      if (isAxiosError(r) && r.response) {
        logForDebugging(`dd-error-tracking: intake responded ${r.response.status} (batch=${e.length})`, {
          level: "warn"
        });
      } else {
        logForDebugging(`dd-error-tracking: intake failed: ${he(r)}`, {
          level: "warn"
        });
      }
    }
  }
  async function flushErrorTracking() {
    if (wMe.length === 0) {
      return;
    }
    let e = wMe;
    wMe = [];
    await wOp(e);
  }
  function COp() {
    if (JX) {
      return;
    }
    JX = setTimeout(() => {
      JX = null;
      flushErrorTracking();
    }, vOp()).unref();
  }
  function isErrorTrackingCapReached() {
    return xGt >= 100;
  }
  function ROp(e) {
    return {
      ...e,
      message: `ErrorTrackingCapReached: per-process cap of ${100} hit, dropping further reports`,
      error: {
        kind: "ErrorTrackingCapReached",
        message: `per-process cap of ${100} hit`,
        stack: `ErrorTrackingCapReached
    at enqueueErrorLog (src/services/errorTracking/client.ts)`,
        fingerprint: "cap-reached-sentinel",
        handling: "handled"
      },
      error_frames: undefined
    };
  }
  function enqueueErrorLog(e) {
    if (xGt >= 100) {
      return;
    }
    if (xGt++, xGt === 100 && !cgo) {
      cgo = true;
      logForDebugging(`dd-error-tracking: per-process report cap reached (${100}); dropping further reports`, {
        level: "warn"
      });
      wMe.push(ROp(e));
    } else {
      wMe.push(e);
    }
    if (wMe.length >= 25) {
      if (JX) {
        clearTimeout(JX);
        JX = null;
      }
      flushErrorTracking();
    } else {
      COp();
    }
  }
  async function shutdownErrorTracking() {
    if (JX) {
      clearTimeout(JX);
      JX = null;
    }
    await flushErrorTracking();
  }
  function _resetForTesting() {
    if (JX) {
      clearTimeout(JX);
      JX = null;
    }
    let e = wMe;
    wMe = [];
    xGt = 0;
    cgo = false;
    return e;
  }
  var VPa;
  var wMe;
  var JX = null;
  var xGt = 0;
  var cgo = false;
  var pgo = __lazy(() => {
    je();
    dt();
    xJ();
    pk();
    VPa = require("crypto");
    wMe = [];
  });
  function POp() {
    try {
      return getFeatureValue_CACHED_MAY_BE_STALE("tengu_orford_ness", false);
    } catch {
      return false;
    }
  }
  function mgo() {
    let e = getResponseFromCache();
    if (!isPolicyAllowed("allow_error_reporting")) {
      if (e === null) {
        return "blocked_cache_miss";
      }
      return e.restrictions.allow_error_reporting?.allowed === false ? "blocked_restriction" : "blocked_tainted";
    }
    if (e !== null) {
      return "allowed_taints_clean";
    }
    if (hasStoredOAuthToken() && !hasOAuthScope("user:inference")) {
      return "blocked_scopeless_oauth";
    }
    if (getAuthTokenSource().source === "ANTHROPIC_AUTH_TOKEN") {
      return "blocked_auth_token_env";
    }
    if (getConfiguredApiKeyHelper()) {
      return "blocked_api_key_helper";
    }
    return "allowed_untaintable";
  }
  function YPa() {
    if (process.env.DISABLE_ERROR_REPORTING) {
      return false;
    }
    if (yye()) {
      return false;
    }
    if (getAPIProvider() !== "firstParty" || !isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    if (!Hqn.gte(Hqn.coerce({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION)?.version ?? {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, "2.1.193")) {
      return false;
    }
    if (!mgo().startsWith("allowed")) {
      return false;
    }
    return POp();
  }
  var Hqn;
  var fgo = __lazy(() => {
    Uc();
    no();
    Ds();
    Wd();
    $n();
    Kc();
    Hqn = __toESM(lq(), 1);
  });
  function OOp() {
    try {
      return JPa.homedir();
    } catch {
      return "";
    }
  }
  function DOp(e) {
    let t = e;
    if (t.startsWith("file://")) {
      t = t.slice(7);
    }
    if (t.includes("$bunfs") || t.includes("~BUN")) {
      return eOa(t);
    }
    if (t.startsWith("/snapshot/")) {
      t = t.slice(10);
    }
    let n = OOp();
    if (n && t.startsWith(n + XPa.sep)) {
      t = "~" + t.slice(n.length);
    }
    return t;
  }
  function MOp(e) {
    let t = e;
    if (!t.startsWith("../") && !t.startsWith("..\\")) {
      return null;
    }
    while (t.startsWith("../") || t.startsWith("..\\")) {
      t = t.slice(3);
    }
    let n = t.replaceAll("\\", "/");
    for (let r of ZPa) {
      if (n.startsWith(r)) {
        return n;
      }
    }
    return null;
  }
  function eOa(e) {
    let t = Math.max(e.lastIndexOf("/"), e.lastIndexOf("\\"));
    return t === -1 ? e : e.slice(t + 1);
  }
  function tOa(e) {
    return e.file[0] === "/" && QPa.vZc(e.file.slice(1)) || ZPa.some(t => e.file.startsWith(t));
  }
  function NOp(e) {
    let t = e.split(/[/\\]/);
    let n = -1;
    for (let i = t.length - 1; i >= 0; i--) {
      if (t[i] === "node_modules") {
        n = i;
        break;
      }
    }
    if (n === -1 || n >= t.length - 1) {
      return null;
    }
    let r = t[n + 1];
    let o;
    if (r.startsWith("@")) {
      if (n + 2 >= t.length) {
        return null;
      }
      o = `${r}/${t[n + 2]}`;
    } else {
      o = r;
    }
    let s = t.at(-1);
    if (!s) {
      return null;
    }
    return `node_modules/${o}/${s}`;
  }
  function LOp(e) {
    let t = DOp(e);
    let n = eOa(t);
    if (QPa.vZc(n)) {
      return "/" + n;
    }
    let r = MOp(t);
    if (r) {
      return r;
    }
    if (t.startsWith("node:")) {
      return t;
    }
    if (t === "native") {
      return t;
    }
    let o = NOp(t);
    if (o) {
      return o;
    }
    return "<user-code>";
  }
  function FOp(e) {
    let t = e.trim();
    if (!t.startsWith("at ")) {
      return null;
    }
    let n = t.slice(3);
    let r = n.indexOf(" (");
    let o;
    let s;
    if (r !== -1 && n.endsWith(")")) {
      o = n.slice(0, r).trim();
      s = n.slice(r + 2, -1);
    } else {
      s = n.trim();
    }
    if (o) {
      if (o = o.replace(/^async\s+/, "").replace(/^new\s+/, ""), o = o.replace(/\s*\[as\s+[^\]]+\]$/, ""), !o) {
        o = undefined;
      }
    }
    let i = s.match(/^(.*):(\d+):(\d+)$/);
    if (!i) {
      return null;
    }
    let [, a, l, c] = i;
    let u = LOp(a);
    return {
      file: u,
      line: Number(l),
      column: Number(c),
      function: u === "<user-code>" && o ? "<user-code>" : o
    };
  }
  function ggo(e, t = {}) {
    let n = t.maxFrames ?? 50;
    let o = (e.stack ?? "").split(`
`);
    let s = [];
    for (let c of o) {
      let u = FOp(c);
      if (u) {
        if (s.push(u), s.length >= n) {
          break;
        }
      }
    }
    let i = t.redactedMessage ?? "";
    return {
      formatted: [`${e.name || "Error"}: ${i}`, ...s.map(c => {
        let u = `${c.file}${c.line ? `:${c.line}` : ""}${c.column ? `:${c.column}` : ""}`;
        return c.function ? `    at ${c.function} (${u})` : `    at ${u}`;
      })].join(`
`),
      frames: s
    };
  }
  var JPa;
  var XPa;
  var QPa;
  var ZPa;
  var nOa = __lazy(() => {
    JPa = require("os");
    XPa = require("path");
    QPa = new Set(["cli.js", "cli", "sdk.mjs", "browser-sdk.js", "agentSdk.js"]);
    ZPa = ["src/", "packages/"];
  });
  function UOp(e) {
    return e ? {
      version: `${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}_${e}`,
      sourcemapGroup: e
    } : {
      version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      sourcemapGroup: "none"
    };
  }
  function $Op() {
    if (jqn !== undefined) {
      return jqn;
    }
    let e = getOrCreateUserID();
    let t = ygo.createHash("sha256").update(e).digest("hex");
    jqn = parseInt(t.slice(0, 8), 16) % 30;
    return jqn;
  }
  function HOp(e, t) {
    let n = t.slice(0, 3).map(r => `${r.function ?? "?"}@${r.file}`).join("|");
    return ygo.createHash("sha256").update(`${e}
${n}`).digest("hex").slice(0, 16);
  }
  function qOp() {
    try {
      let e = getMainLoopModel();
      if (!e) {
        return;
      }
      let t = getCanonicalName(ca(e));
      return jOp.vZc(t) ? t : "other";
    } catch {
      return;
    }
  }
  function GOp() {
    try {
      let e = getAllGrowthBookFeatures();
      let t = getNonDefaultFeatureKeys();
      let n = {};
      let r = 0;
      for (let [o, s] of Object.entries(e)) {
        if (typeof s === "boolean" && t.vZc(o)) {
          if (n[o] = s, ++r >= 50) {
            break;
          }
        }
      }
      return n;
    } catch {
      return {};
    }
  }
  function VOp(e) {
    let t = e.issues;
    if (!Array.isArray(t) || t.length === 0) {
      return;
    }
    let n = t.map(r => r?.code).filter(r => typeof r === "string" && /^[a-z_]{1,40}$/.test(r));
    return `${t.length} issue(s): ${n.join(",")}`;
  }
  function zOp(e, t) {
    let n = (e.name && e.name !== "Error" ? e.name : e.constructor?.name) || "Error";
    let r = N$e(n.replace(/_I_VERIFIED_THIS_IS_NOT_CODE_OR_FILEPATHS$/, "")) ?? "Error";
    let o = e.telemetryMessage;
    let s = uya(e, typeof o === "string" ? o : VOp(e) ?? e.message ?? String(e));
    let i = Gq(s);
    let a = ggo(e, {
      redactedMessage: i
    });
    let {
      version: l,
      sourcemapGroup: c
    } = UOp({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.DD_SOURCEMAP_GROUP);
    let u = HOp(r, a.frames);
    let d = $Op();
    let p = qOp();
    let m = typeof Bun < "u" && true;
    let f = gd(e);
    let h = process.env.CLAUDE_CODE_ENTRYPOINT ?? "cli";
    let g = /^[A-Za-z0-9_.-]{1,63}$/.test(h) ? h : "unknown";
    let y = h0e();
    let _ = getRendererModeForAnalytics();
    let b = ZOp(oOa.release());
    return {
      ddtags: [`service:${"claude-code-error-tracking"}`, "team:claude-code", `version:${l}`, "env:external", `origin:${t}`, `platform:${Wt()}`, `os_release:${b}`, `user_bucket:${d}`, `entrypoint:${g}`, `node_version:${process.versions.node}`, "bun_version:1.4.0", `is_native_runtime:${m}`, ...(p ? [`model:${p}`] : []), ...(f ? [`error_code:${f}`] : []), ...(y ? [`session_kind:${y}`] : []), ...(y ? [`has_attacher:${getAttacherCaps() !== null ? "1" : "0"}`] : []), ...(_ ? [`renderer_mode:${_}`] : [])].join(","),
      service: "claude-code-error-tracking",
      hostname: "claude-code",
      status: "error",
      message: `${r}: ${i}`.slice(0, 4000),
      timestamp: new Date().toISOString(),
      error: {
        kind: r,
        message: i.slice(0, 4000),
        stack: a.formatted.slice(0, 16000),
        fingerprint: u,
        handling: t === "logError" ? "handled" : "unhandled"
      },
      version: l,
      sourcemap_group: c,
      env: "external",
      user_bucket: d,
      origin: t,
      host_platform: Wt(),
      host_os_release: b,
      host_name_redacted: getOrCreateMachineID().slice(0, 12),
      entrypoint: g,
      node_version: process.versions.node,
      bun_version: "1.4.0",
      ...(p && {
        model: p
      }),
      error_frames: a.frames.slice(0, 20),
      feature_flags: GOp()
    };
  }
  function XOp(e) {
    let {
      frames: t
    } = ggo(e, {
      maxFrames: 20
    });
    let n = t[0];
    if (!n || t.some(tOa)) {
      return false;
    }
    return JOp.some(r => n.file === r.topFile && n.function === r.topFunction);
  }
  function QOp(e) {
    let t = e.constructor?.name || e.name || "";
    if (KOp.vZc(t)) {
      return true;
    }
    let n = e.message ?? "";
    return YOp.some(r => n.startsWith(r.messagePrefix) && (e.stack?.split(`
`).find(o => o.trim().startsWith("at ")) ?? "").includes(r.topFrameIncludes));
  }
  function ZOp(e) {
    let t = /^(\d+)\.(\d+)/.exec(e);
    return t ? `${t[1]}.${t[2]}` : "unknown";
  }
  function kGt(e, t = "logError") {
    if (!YPa()) {
      return;
    }
    try {
      let n = sr(e);
      if (t === "logError" && QOp(n)) {
        return;
      }
      if ((t === "unhandled_rejection" || t === "uncaught_exception") && XOp(n)) {
        return;
      }
      if (isErrorTrackingCapReached()) {
        return;
      }
      let r = zOp(n, t);
      enqueueErrorLog(r);
    } catch {}
  }
  var ygo;
  var oOa;
  var jqn;
  var jOp;
  var KOp;
  var YOp;
  var JOp;
  var _go = __lazy(() => {
    at();
    yd();
    dt();
    Tk();
    Eo();
    Cs();
    $n();
    pgo();
    fgo();
    X9e();
    nOa();
    ygo = require("crypto");
    oOa = require("os");
    jOp = new Set(["claude-fable-5", "claude-mythos-5", "claude-opus-4-8", "claude-opus-4-7", "claude-opus-4-6", "claude-opus-4-5", "claude-opus-4-1", "claude-opus-4-0", "claude-sonnet-5", "claude-sonnet-4-6", "claude-sonnet-4-5", "claude-sonnet-4-0", "claude-haiku-4-5", "claude-3-7-sonnet", "claude-3-5-sonnet", "claude-3-5-haiku", "claude-3-opus", "claude-3-sonnet", "claude-3-haiku"]);
    KOp = new Set(["APIUserAbortError", "AuthenticationError", "McpSessionExpiredError"]);
    YOp = [{
      messagePrefix: "File does not exist",
      topFrameIncludes: "FileReadTool.ts"
    }];
    JOp = [{
      topFile: "node:net",
      topFunction: "internalConnectMultipleTimeout"
    }, {
      topFile: "node:_http_server",
      topFunction: "#onClose"
    }];
  });
  function sOa() {
    return {
      scrolls: 0,
      pageJumps: 0,
      jumpToBottomClicks: 0,
      reachedScrollbackCap: false,
      scrolledUpMs: 0,
      unpinnedSince: null
    };
  }
  function qqn(e = F5e) {
    e.scrolls++;
  }
  function Wqn(e = F5e) {
    e.pageJumps++;
  }
  function iOa(e = F5e) {
    e.jumpToBottomClicks++;
  }
  function IGt(e = F5e) {
    e.reachedScrollbackCap = true;
  }
  function bgo(e, t = Date.now(), n = F5e) {
    if (e) {
      if (n.unpinnedSince !== null) {
        n.scrolledUpMs += Math.max(0, t - n.unpinnedSince);
        n.unpinnedSince = null;
      }
    } else if (n.unpinnedSince === null) {
      n.unpinnedSince = t;
    }
  }
  function aOa(e = Date.now(), t = F5e) {
    let n = t.scrolledUpMs;
    if (t.unpinnedSince !== null) {
      n += Math.max(0, e - t.unpinnedSince);
    }
    let r = {
      scrolls: t.scrolls,
      scroll_up_seconds: Math.round(n / 1000),
      jump_to_bottom_clicks: t.jumpToBottomClicks,
      page_jumps: t.pageJumps,
      reached_scrollback_cap: t.reachedScrollbackCap
    };
    Object.assign(t, sOa());
    return r;
  }
  function lOa(e = F5e) {
    return e.scrolls > 0 || e.pageJumps > 0 || e.jumpToBottomClicks > 0 || e.reachedScrollbackCap || e.scrolledUpMs > 0 || e.unpinnedSince !== null;
  }
  var F5e;
  var PGt = __lazy(() => {
    F5e = sOa();
  });
  var cOa = {};
  __export(cOa, {
    flushAnalyticsSinks: () => flushAnalyticsSinks
  });
  async function flushAnalyticsSinks() {
    try {
      let [{
        shutdown1PEventLogging: e
      }, {
        shutdownDatadog: t
      }, {
        shutdownErrorTracking: n
      }] = await Promise.all([Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => (xJ(), OGt)), Promise.resolve().then(() => (pgo(), KPa))]);
      let r = [e(), t(), n()];
      await Promise.race([Promise.all(r), sleep(500)]);
    } catch {}
  }
  var Gqn = () => {};
  var NGt = {};
  __export(NGt, {
    setupGracefulShutdown: () => setupGracefulShutdown,
    resetShutdownState: () => resetShutdownState,
    releaseShutdownClaim: () => releaseShutdownClaim,
    recordUncaughtAndCheckBreaker: () => recordUncaughtAndCheckBreaker,
    protoDataString: () => protoDataString,
    ownDataString: () => ownDataString,
    markStartupActionStarted: () => markStartupActionStarted,
    isShuttingDown: () => isShuttingDown,
    hasProxyInChain: () => hasProxyInChain,
    gracefulShutdownSync: () => gracefulShutdownSync,
    gracefulShutdown: () => gracefulShutdown,
    getPendingShutdownForTesting: () => getPendingShutdownForTesting,
    flushAnalyticsSinks: () => flushAnalyticsSinks_export,
    exitIfStartupNeverMounted: () => exitIfStartupNeverMounted,
    emitScrollTelemetrySummary: () => emitScrollTelemetrySummary,
    disarmOrphanCheck: () => disarmOrphanCheck,
    cleanupTerminalModes: () => cleanupTerminalModes,
    claimShutdown: () => claimShutdown,
    STARTUP_MOUNT_GRACE_MS: () => 1e4
  });
  function cleanupTerminalModes() {
    if (!process.stdout.isTTY) {
      return;
    }
    try {
      QTe.writeSync(1, mue);
      let e = rVd.get(process.stdout);
      if (e?.isAltScreenActive) {
        try {
          e.unmount();
        } catch {
          QTe.writeSync(1, GF());
        }
      }
      if (e?.drainStdin(), e?.detachForShutdown(), a1n(), !Me.CLAUDE_CODE_DISABLE_TERMINAL_TITLE) {
        QTe.writeSync(1, pGi);
      }
    } catch {}
  }
  function Sgo() {
    if (zqn) {
      return;
    }
    if (process.stdout.isTTY && getIsInteractive() && !isSessionPersistenceDisabled()) {
      try {
        let e = getSessionId();
        if (!sessionIdExists(e)) {
          return;
        }
        let t = getCurrentSessionTitle(e);
        let n;
        if (t) {
          n = `"${t.replaceAll("\\", "\\\\").replaceAll('"', "\\\"")}"`;
        } else {
          n = e;
        }
        let r = Spi();
        let o = r ? `--worktree ${r} ` : "";
        QTe.writeSync(1, _$u.dim(`
Resume this session with:
claude ${o}--resume ${n}
`));
        zqn = true;
      } catch {}
    }
  }
  function Tgo(e) {
    if (CMe !== undefined) {
      clearTimeout(CMe);
      CMe = undefined;
    }
    try {
      rVd.get(process.stdout)?.drainStdin();
    } catch {}
    try {
      process.exit(e);
    } catch (t) {
      process.kill(process.pid, "SIGKILL");
    }
    throw Error("unreachable");
  }
  function gracefulShutdownSync(e = 0, t = "other", n) {
    process.exitCode = e;
    kgo = gracefulShutdown(e, t, n).catch(r => {
      logForDebugging(`Graceful shutdown failed: ${r}`, {
        level: "error"
      });
      cleanupTerminalModes();
      Sgo();
      Tgo(e);
    }).catch(() => {});
  }
  function recordUncaughtAndCheckBreaker(e) {
    if (B5e) {
      return false;
    }
    if (e - vgo > 5000) {
      Omt = 0;
      vgo = e;
      DGt = [];
    }
    if (Omt++, Omt >= 10) {
      B5e = true;
      return true;
    }
    return false;
  }
  function markStartupActionStarted(e) {
    Cgo = true;
    Rgo = e;
  }
  function fOa() {
    return Cgo && !Rgo;
  }
  function exitIfStartupNeverMounted(e) {
    if (rVd.everMounted || fOa() || isShuttingDown()) {
      return;
    }
    try {
      QTe.writeSync(2, `Claude Code could not start: ${e ?? "<unknown>"}
`);
    } catch {}
    gracefulShutdown(1);
  }
  function uOa(e) {
    if (!getIsInteractive() || rVd.everMounted || fOa() || isShuttingDown()) {
      return;
    }
    setTimeout(exitIfStartupNeverMounted, 1e4, e).unref();
  }
  function hasProxyInChain(e) {
    if (e === null || typeof e !== "object" && typeof e !== "function") {
      return false;
    }
    let t = e;
    for (let n = 0; n < 128; n++) {
      if (t === null) {
        return false;
      }
      if (Kqn.types.isProxy(t)) {
        return true;
      }
      t = Object.getPrototypeOf(t);
    }
    return true;
  }
  function ownDataString(e, t) {
    if (e === null || typeof e !== "object") {
      return;
    }
    if (Kqn.types.isProxy(e)) {
      return;
    }
    let n = Object.getOwnPropertyDescriptor(e, t);
    return n && "value" in n && typeof n.value === "string" ? n.value : undefined;
  }
  function protoDataString(e, t) {
    if (e === null || typeof e !== "object") {
      return;
    }
    let n = e;
    for (let r = 0; r < 128; r++) {
      if (n === null) {
        return;
      }
      if (Kqn.types.isProxy(n)) {
        return;
      }
      let o = Object.getOwnPropertyDescriptor(n, t);
      if (o) {
        return "value" in o && typeof o.value === "string" ? o.value : undefined;
      }
      n = Object.getPrototypeOf(n);
    }
    return;
  }
  function nDp(e) {
    try {
      return e instanceof Error && e.name === "McpError" && e.code === -32000;
    } catch {
      return false;
    }
  }
  function isShuttingDown() {
    return j5e;
  }
  function _Oa() {
    if ($5e !== undefined || !process.stdin.isTTY) {
      return;
    }
    $5e = setInterval(() => {
      if (getIsScrollDraining()) {
        return;
      }
      if (!process.stdout.writable || !process.stdin.readable) {
        clearInterval($5e);
        wn("info", "shutdown_signal", {
          signal: "orphan_detected"
        });
        gracefulShutdown(129);
      }
    }, 30000);
    $5e.unref();
  }
  function disarmOrphanCheck() {
    if ($5e !== undefined) {
      clearInterval($5e);
      $5e = undefined;
    }
  }
  function claimShutdown() {
    j5e = true;
    disarmOrphanCheck();
  }
  function releaseShutdownClaim() {
    j5e = false;
    _Oa();
  }
  function emitScrollTelemetrySummary() {
    try {
      if (getIsInteractive() && lOa()) {
        logEvent("tengu_scroll_summary", {
          ...aOa(),
          fullscreen: qs()
        });
      }
    } catch {}
  }
  async function flushAnalyticsSinks_export() {
    try {
      let {
        flushAnalyticsSinks: e
      } = await Promise.resolve().then(() => (Gqn(), cOa));
      await e();
    } catch {}
  }
  function resetShutdownState() {
    if (j5e = false, zqn = false, Omt = 0, vgo = 0, B5e = false, DGt = [], Cgo = false, Rgo = false, CMe !== undefined) {
      clearTimeout(CMe);
      CMe = undefined;
    }
    disarmOrphanCheck();
    kgo = undefined;
  }
  function getPendingShutdownForTesting() {
    return kgo;
  }
  async function gracefulShutdown(e = 0, t = "other", n) {
    if (j5e) {
      return;
    }
    if (j5e = true, n?.suppressResumeHint) {
      zqn = true;
    }
    let {
      executeSessionEndHooks: r,
      getSessionEndHookTimeoutMs: o
    } = await Promise.resolve().then(() => (Sp(), TOa));
    let s = o();
    CMe = setTimeout(l => {
      cleanupTerminalModes();
      Sgo();
      Tgo(l);
    }, Math.max(5000, s + 3500), e);
    CMe.unref();
    process.exitCode = e;
    cleanupTerminalModes();
    Sgo();
    let i;
    try {
      let l = (async () => {
        try {
          await RZe();
        } catch {}
      })();
      await Promise.race([l, new Promise((c, u) => {
        i = setTimeout(d => d(new bOa()), 2000, u);
      })]);
      clearTimeout(i);
    } catch {
      clearTimeout(i);
    }
    try {
      await GPa();
    } catch {}
    try {
      await SOa();
    } catch {}
    try {
      await r(t, {
        ...n,
        signal: AbortSignal.timeout(s)
      });
    } catch {}
    try {
      profileReport();
    } catch {}
    emitScrollTelemetrySummary();
    let a = getLastMainRequestId();
    if (a) {
      logEvent("tengu_cache_eviction_hint", {
        scope: "session_end",
        last_request_id: br(a)
      });
    }
    if (await flushAnalyticsSinks_export(), n?.finalMessage) {
      try {
        QTe.writeSync(2, n.finalMessage + `
`);
      } catch {}
    }
    try {
      await JDt();
    } catch {}
    try {
      await flushDebugLogs();
    } catch {}
    try {
      await Jln();
    } catch {}
    Tgo(e);
  }
  function dOa(e) {
    if (!e.error_message) {
      return {};
    }
    return {
      error_message_hash: i3i.createHash("sha256").update(e.error_message).digest("hex").slice(0, 12)
    };
  }
  var Kqn;
  var QTe;
  var zqn = false;
  var setupGracefulShutdown;
  var Omt = 0;
  var vgo = 0;
  var B5e = false;
  var DGt;
  var Cgo = false;
  var Rgo = false;
  var j5e = false;
  var CMe;
  var $5e;
  var kgo;
  var bOa;
  var lm = __lazy(() => {
    at();
    lgo();
    M7();
    Ono();
    mT();
    qJ();
    Tg();
    Ot();
    B_();
    _go();
    hd();
    yd();
    je();
    Zm();
    pr();
    gn();
    dt();
    dw();
    zp();
    OD();
    Kv();
    Eqn();
    PGt();
    fa();
    H4();
    Kqn = require("util");
    QTe = require("fs");
    setupGracefulShutdown = TEr(() => {
      Ute(() => {});
      let e = process.ppid;
      if (process.on("SIGINT", () => {
        if (process.argv.includes("-p") || process.argv.includes("--print")) {
          return;
        }
        wn("info", "shutdown_signal", {
          signal: "SIGINT"
        });
        gracefulShutdown(0);
      }), process.on("SIGTERM", () => {
        let n = {
          uptime_s: Math.round(process.uptime()),
          ppid_changed: process.ppid !== e,
          stdin_at_eof: process.stdin.readableEnded,
          stdin_destroyed: process.stdin.destroyed,
          is_tty: process.stdin.isTTY ?? false
        };
        wn("info", "shutdown_signal", {
          signal: "SIGTERM",
          ...n
        });
        logEvent("tengu_shutdown_signal", {
          signal: "SIGTERM",
          ...n
        });
        gracefulShutdown(143);
      }), process.env.CLAUDE_BG_BACKEND === "daemon") {
        process.on("SIGHUP", () => {
          wn("info", "shutdown_signal", {
            signal: "SIGHUP_ignored_bg"
          });
        });
      } else {
        process.on("SIGHUP", () => {
          wn("info", "shutdown_signal", {
            signal: "SIGHUP"
          });
          gracefulShutdown(129);
        });
        _Oa();
      }
      registerProcessIOErrorHandlers((n, r) => {
        if (!getIsInteractive()) {
          return;
        }
        wn("info", "shutdown_signal", {
          signal: `${n}_${r}`
        });
        gracefulShutdown(0);
      });
      let t = n => {
        let r = hasProxyInChain(n);
        if (!(!r && n instanceof Error)) {
          if (typeof n === "string") {
            return {
              error_name: "string",
              error_message: Lc(n).slice(0, 2000),
              isHostError: false
            };
          }
          let c = r ? ownDataString(n, "name") : protoDataString(n, "name");
          let u = ownDataString(n, "message");
          let d = [];
          if (c !== undefined) {
            d.push(c);
          }
          if (u !== undefined) {
            d.push(u);
          }
          let p = d.length > 0 ? Lc(d.join(": ")).slice(0, 2000) : undefined;
          let m = ownDataString(n, "stack");
          return {
            error_name: "non-error",
            error_message: p,
            error_stack: m !== undefined ? Lc(m).slice(0, 4000) : undefined,
            isHostError: false
          };
        }
        let s = n;
        let i;
        let a;
        let l;
        try {
          i = s.name;
        } catch {}
        try {
          a = s.message;
        } catch {}
        try {
          l = s.stack;
        } catch {}
        return {
          error_name: typeof i === "string" ? i : "Error",
          error_message: typeof a === "string" ? Lc(a).slice(0, 2000) : undefined,
          error_stack: typeof l === "string" ? Lc(l).slice(0, 4000) : undefined,
          isHostError: true
        };
      };
      process.on("uncaughtException", n => {
        if (B5e) {
          return;
        }
        let r = t(n);
        wn("error", "uncaught_exception", r);
        let o = r.isHostError ? o1(n) : dOa(r);
        if (logEvent("tengu_uncaught_exception", {
          error_name: r.error_name,
          ...o
        }), r.isHostError) {
          kGt(n, "uncaught_exception");
        }
        if (rCr()) {
          if (B5e = true, logForDebugging(`Uncaught exception under CLAUDE_CODE_SUPERVISED \u2014 exiting ${70}: ${r.error_name}`, {
            level: "error"
          }), li() && !isShuttingDown()) {
            setBgExitCause("uncaught:" + r.error_name);
          }
          gracefulShutdown(70);
          return;
        }
        let s = recordUncaughtAndCheckBreaker(Date.now());
        if (DGt.length < 3 || s) {
          DGt.push({
            name: r.error_name,
            message: (r.error_message ?? "").slice(0, 200),
            topFrame: o.error_top_frame
          });
        }
        if (s) {
          logEvent("tengu_uncaught_exception_loop", {
            count: Omt,
            window_ms: 5000,
            error_name: r.error_name,
            error_message_hash: o.error_message_hash
          });
          cleanupTerminalModes();
          try {
            for (let i of DGt) {
              QTe.writeSync(2, `Uncaught exception (loop): ${i.name}: ${i.message}${i.topFrame ? ` at ${i.topFrame}` : ""}
`);
            }
            QTe.writeSync(2, `Uncaught exception loop detected (${Omt} in ${5000}ms) \u2014 forcing shutdown
`);
          } catch {}
          gracefulShutdown(1);
          return;
        }
        if (li() && !isShuttingDown()) {
          setBgExitCause("uncaught:" + r.error_name);
          gracefulShutdown(1);
          return;
        }
        uOa(r.error_message ?? r.error_name);
      });
      process.on("unhandledRejection", n => {
        if (B5e) {
          return;
        }
        let r = t(n);
        if (j5e && r.isHostError && nDp(n)) {
          logForDebugging(`Swallowed MCP ConnectionClosed during shutdown: ${he(n)}`);
          return;
        }
        if (wn("error", "unhandled_rejection", r), logEvent("tengu_unhandled_rejection", {
          error_name: r.error_name,
          ...(r.isHostError ? o1(n) : dOa(r))
        }), r.isHostError) {
          kGt(n, "unhandled_rejection");
        }
        if (r.isHostError && mg(n)) {
          logForDebugging("Swallowed unhandled AbortError rejection (not exiting bg/supervised worker)");
          return;
        }
        if (rCr()) {
          if (B5e = true, logForDebugging(`Unhandled rejection under CLAUDE_CODE_SUPERVISED \u2014 exiting ${70}: ${r.error_name}`, {
            level: "error"
          }), li() && !isShuttingDown()) {
            setBgExitCause("unhandled:" + r.error_name);
          }
          gracefulShutdown(70);
          return;
        }
        if (li() && !isShuttingDown()) {
          setBgExitCause("unhandled:" + r.error_name);
          gracefulShutdown(1);
          return;
        }
        uOa(r.error_message ?? r.error_name);
      });
    });
    DGt = [];
    bOa = class bOa extends Error {
      constructor() {
        super("Cleanup timeout");
      }
    };
  });
  function Pgo(e) {
    let t = getCurrentProjectConfig();
    if (t.lastSessionId !== e) {
      return;
    }
    let n;
    if (t.lastModelUsage) {
      n = Sbu(t.lastModelUsage, (r, o) => ({
        ...r,
        contextWindow: iT(o, getSdkBetas()),
        maxOutputTokens: dIe(o).default
      }));
    }
    return {
      totalCostUSD: t.lastCost ?? 0,
      totalAPIDuration: t.lastAPIDuration ?? 0,
      totalAPIDurationWithoutRetries: t.lastAPIDurationWithoutRetries ?? 0,
      totalToolDuration: t.lastToolDuration ?? 0,
      totalLinesAdded: t.lastLinesAdded ?? 0,
      totalLinesRemoved: t.lastLinesRemoved ?? 0,
      lastDuration: t.lastDuration,
      startTime: t.lastStartTime,
      modelUsage: n
    };
  }
  function Jqn(e) {
    let t = Pgo(e);
    if (!t) {
      return false;
    }
    setCostStateForRestore(t);
    return true;
  }
  function FGt(e) {
    saveCurrentProjectConfig(t => ({
      ...t,
      lastCost: getTotalCostUSD(),
      lastAPIDuration: getTotalAPIDuration(),
      lastAPIDurationWithoutRetries: getTotalAPIDurationWithoutRetries(),
      lastToolDuration: getTotalToolDuration(),
      lastDuration: getTotalDuration(),
      lastStartTime: getSessionStartTime(),
      lastLinesAdded: getTotalLinesAdded(),
      lastLinesRemoved: getTotalLinesRemoved(),
      lastTotalInputTokens: getTotalInputTokens(),
      lastTotalOutputTokens: getTotalOutputTokens(),
      lastTotalCacheCreationInputTokens: getTotalCacheCreationInputTokens(),
      lastTotalCacheReadInputTokens: getTotalCacheReadInputTokens(),
      lastTotalWebSearchRequests: getTotalWebSearchRequests(),
      lastFpsAverage: e?.averageFps,
      lastFpsLow1Pct: e?.low1PctFps,
      lastGracefulShutdown: isShuttingDown(),
      lastVersionBase: X2t(),
      lastModelUsage: Sbu(getModelUsage(), n => ({
        inputTokens: n.inputTokens,
        outputTokens: n.outputTokens,
        cacheReadInputTokens: n.cacheReadInputTokens,
        cacheCreationInputTokens: n.cacheCreationInputTokens,
        webSearchRequests: n.webSearchRequests,
        costUSD: n.costUSD
      })),
      lastSessionId: getSessionId()
    }));
  }
  function EOa(e, t = 4) {
    return `$${e > 0.5 ? aDp(e, 100).toFixed(2) : e.toFixed(t)}`;
  }
  function sDp() {
    let e = getModelUsage();
    if (Object.keys(e).length === 0) {
      return "Usage:                 0 input, 0 output, 0 cache read, 0 cache write";
    }
    let t = new Map();
    for (let [r, o] of Object.entries(e)) {
      let s = getCanonicalName(r);
      let i = t.get(s);
      if (!i) {
        i = {
          inputTokens: 0,
          outputTokens: 0,
          cacheReadInputTokens: 0,
          cacheCreationInputTokens: 0,
          webSearchRequests: 0,
          costUSD: 0,
          contextWindow: 0,
          maxOutputTokens: 0
        };
        t.set(s, i);
      }
      i.inputTokens += o.inputTokens;
      i.outputTokens += o.outputTokens;
      i.cacheReadInputTokens += o.cacheReadInputTokens;
      i.cacheCreationInputTokens += o.cacheCreationInputTokens;
      i.webSearchRequests += o.webSearchRequests;
      i.costUSD += o.costUSD;
    }
    let n = "Usage by model:";
    for (let [r, o] of t) {
      let s = `  ${formatNumber(o.inputTokens)} input, ${formatNumber(o.outputTokens)} output, ${formatNumber(o.cacheReadInputTokens)} cache read, ${formatNumber(o.cacheCreationInputTokens)} cache write` + (o.webSearchRequests > 0 ? `, ${formatNumber(o.webSearchRequests)} web search` : "") + ` (${EOa(o.costUSD)})`;
      n += `
` + `${r}:`.padStart(21) + s;
    }
    return n;
  }
  function iDp(e) {
    if (e.includes("fable")) {
      return "fable";
    }
    if (e.includes("opus")) {
      return "opus";
    }
    if (e.includes("sonnet")) {
      return "sonnet";
    }
    if (e.includes("haiku")) {
      return "haiku";
    }
    return e;
  }
  function vOa() {
    let e = getModelUsage();
    let t = Object.entries(e);
    if (t.length === 0) {
      return null;
    }
    let n = {};
    let r = 0;
    let o = 0;
    let s = 0;
    let i = 0;
    for (let [c, u] of t) {
      let d = iDp(getCanonicalName(c));
      n[d] = (n[d] ?? 0) + u.costUSD;
      r += u.costUSD;
      o += u.inputTokens;
      s += u.cacheReadInputTokens;
      i += u.cacheCreationInputTokens;
    }
    let a = [];
    if (r > 0) {
      for (let [c, u] of Object.entries(n).sort((d, p) => p[1] - d[1])) {
        a.push(`${c}: ${Math.round(u / r * 100)}%`);
      }
    }
    let l = o + s + i;
    if (l > 0) {
      a.push(`cache hit: ${Math.round(s / l * 100)}%`);
    }
    return a.length > 0 ? `breakdown \xB7 ${a.join(" \xB7 ")}` : null;
  }
  function RMe() {
    let e = EOa(getTotalCostUSD()) + (hasUnknownModelCost() ? " (costs may be inaccurate due to usage of unknown models)" : "");
    let t = sDp();
    return _$u.dim(`Total cost:            ${e}
Total duration (API):  ${formatDuration(getTotalAPIDuration())}
Total duration (wall): ${formatDuration(getTotalDuration())}
Total code changes:    ${getTotalLinesAdded()} ${getTotalLinesAdded() === 1 ? "line" : "lines"} added, ${getTotalLinesRemoved()} ${getTotalLinesRemoved() === 1 ? "line" : "lines"} removed
${t}`);
  }
  function aDp(e, t) {
    return Math.round(e * t) / t;
  }
  function lDp(e, t, n) {
    let r = getUsageForModel(n) ?? {
      inputTokens: 0,
      outputTokens: 0,
      cacheReadInputTokens: 0,
      cacheCreationInputTokens: 0,
      webSearchRequests: 0,
      costUSD: 0,
      contextWindow: 0,
      maxOutputTokens: 0
    };
    r.inputTokens += t.input_tokens;
    r.outputTokens += t.output_tokens;
    r.cacheReadInputTokens += t.cache_read_input_tokens ?? 0;
    r.cacheCreationInputTokens += t.cache_creation_input_tokens ?? 0;
    r.webSearchRequests += t.server_tool_use?.web_search_requests ?? 0;
    r.costUSD += e;
    r.contextWindow = iT(n, getSdkBetas());
    r.maxOutputTokens = dIe(n).default;
    return r;
  }
  function XX(e, t, n, r, o, s, i, a, l) {
    let c = lDp(e, t, n);
    addToTotalCostState(e, c, n);
    let u = ZN(r);
    let d = {
      model: n,
      ...(lc() && t.speed === "fast" && {
        speed: "fast"
      }),
      ...(u && {
        query_source: u
      }),
      ...(o && {
        effort: o
      }),
      ...Rut(r, o$(r, s, i, a, l))
    };
    getCostCounter()?.add(e, d);
    getTokenCounter()?.add(t.input_tokens, {
      ...d,
      type: "input"
    });
    getTokenCounter()?.add(t.output_tokens, {
      ...d,
      type: "output"
    });
    getTokenCounter()?.add(t.cache_read_input_tokens ?? 0, {
      ...d,
      type: "cacheRead"
    });
    getTokenCounter()?.add(t.cache_creation_input_tokens ?? 0, {
      ...d,
      type: "cacheCreation"
    });
    let p = e;
    for (let m of wba(t)) {
      let f = c8(m.model, m);
      logEvent("tengu_advisor_tool_token_usage", {
        advisor_model: m.model,
        input_tokens: m.input_tokens,
        output_tokens: m.output_tokens,
        cache_read_input_tokens: m.cache_read_input_tokens ?? 0,
        cache_creation_input_tokens: m.cache_creation_input_tokens ?? 0,
        cost_usd_micros: Math.round(f * 1e6)
      });
      p += XX(f, m, m.model, r, undefined, s, i, a, l);
    }
    return p;
  }
  var C$ = __lazy(() => {
    ZL();
    at();
    Ot();
    Gu();
    UV();
    VT();
    GT();
    cs();
    lm();
    ASe();
    Eo();
  });
  function Qqn(e, t) {
    if (t === 0) {
      return e;
    }
    return e.map(n => ({
      ...n,
      oldStart: n.oldStart + t,
      newStart: n.newStart + t
    }));
  }
  function UGt(e) {
    return e.replaceAll("&", "<<:AMPERSAND_TOKEN:>>").replaceAll("$", "<<:DOLLAR_TOKEN:>>");
  }
  function ROa(e) {
    return e.replaceAll("<<:AMPERSAND_TOKEN:>>", "&").replaceAll("<<:DOLLAR_TOKEN:>>", "$");
  }
  function BGt(e, t, n) {
    let r = 0;
    let o = 0;
    if (e.length === 0 && n) {
      r = (n.match(/\n/g)?.length ?? 0) + 1;
    } else {
      r = e.reduce((s, i) => s + Bn(i.lines, a => a.startsWith("+")), 0);
      o = e.reduce((s, i) => s + Bn(i.lines, a => a.startsWith("-")), 0);
    }
    addToTotalLinesChanged(r, o);
    getLocCounter()?.add(r, {
      type: "added",
      model: t
    });
    getLocCounter()?.add(o, {
      type: "removed",
      model: t
    });
    logEvent("tengu_file_changed", {
      lines_added: r,
      lines_removed: o
    });
  }
  function xMe({
    filePath: e,
    oldContent: t,
    newContent: n,
    ignoreWhitespace: r = false,
    singleHunk: o = false,
    convertTabs: s = false
  }) {
    let i = s ? l => UGt(rY(l)) : UGt;
    let a = wpt(e, e, i(t), i(n), undefined, undefined, {
      ignoreWhitespace: r,
      context: o ? 1e5 : 3,
      timeout: 5000
    });
    if (!a) {
      return [];
    }
    return a.hunks.map(l => ({
      ...l,
      lines: l.lines.map(ROa)
    }));
  }
  function GV({
    filePath: e,
    fileContents: t,
    edits: n,
    ignoreWhitespace: r = false
  }) {
    let o = UGt(rY(t));
    let s = wpt(e, e, o, n.reduce((i, a) => {
      let {
        old_string: l,
        new_string: c
      } = a;
      let u = "replace_all" in a ? a.replace_all : false;
      let d = UGt(rY(l));
      let p = UGt(rY(c));
      if (u) {
        return i.replaceAll(d, () => p);
      } else {
        return i.replace(d, () => p);
      }
    }, o), undefined, undefined, {
      context: 3,
      ignoreWhitespace: r,
      timeout: 5000
    });
    if (!s) {
      return [];
    }
    return s.hunks.map(i => ({
      ...i,
      lines: i.lines.map(ROa)
    }));
  }
  var Qde = __lazy(() => {
    V9e();
    Ot();
    at();
    C$();
    Zl();
  });
  async function AOa(e, t, n = 3) {
    let r = await $Gt(e);
    if (r === null) {
      return null;
    }
    try {
      return await Dgo(r, t, n);
    } finally {
      await r.close();
    }
  }
  async function $Gt(e) {
    if (Rc(e) && !Pp(e)) {
      return null;
    }
    try {
      return await kOa.open(e, "r");
    } catch (t) {
      if (fn(t)) {
        return null;
      }
      throw t;
    }
  }
  async function Dgo(e, t, n) {
    if (t === "") {
      return {
        content: "",
        lineOffset: 1,
        truncated: false
      };
    }
    let r = Buffer.from(t, "utf8");
    let o = 0;
    for (let d = 0; d < r.length; d++) {
      if (r[d] === 10) {
        o++;
      }
    }
    let s;
    let i = r.length + o - 1;
    let a = Buffer.allocUnsafe(8192 + i);
    let l = 0;
    let c = 0;
    let u = 0;
    while (l < 10485760) {
      let {
        bytesRead: d
      } = await e.read(a, u, 8192, l);
      if (d === 0) {
        break;
      }
      let p = u + d;
      let m = xOa(a, r, p);
      let f = r.length;
      if (m === -1 && o > 0) {
        s ??= Buffer.from(t.replaceAll(`
`, `\r
`), "utf8");
        m = xOa(a, s, p);
        f = s.length;
      }
      if (m !== -1) {
        let g = l - u + m;
        return await cDp(e, a, g, f, n, c + Ogo(a, 0, m));
      }
      l += d;
      let h = Math.min(i, p);
      c += Ogo(a, 0, p - h);
      u = h;
      a.copyWithin(0, p - u, p);
    }
    return {
      content: "",
      lineOffset: 1,
      truncated: l >= 10485760
    };
  }
  async function t3n(e) {
    let t = Buffer.allocUnsafe(8192);
    let n = 0;
    for (;;) {
      if (n === t.length) {
        let o = Buffer.allocUnsafe(Math.min(t.length * 2, 10485760 + 8192));
        t.copy(o, 0, 0, n);
        t = o;
      }
      let {
        bytesRead: r
      } = await e.read(t, n, t.length - n, n);
      if (r === 0) {
        break;
      }
      if (n += r, n > 10485760) {
        return null;
      }
    }
    return IOa(t, n);
  }
  function xOa(e, t, n) {
    let r = e.indexOf(t);
    return r === -1 || r + t.length > n ? -1 : r;
  }
  function Ogo(e, t, n) {
    let r = 0;
    for (let o = t; o < n; o++) {
      if (e[o] === 10) {
        r++;
      }
    }
    return r;
  }
  function IOa(e, t) {
    let n = e.toString("utf8", 0, t);
    return n.includes("\r") ? n.replaceAll(`\r
`, `
`) : n;
  }
  async function cDp(e, t, n, r, o, s) {
    let i = Math.min(n, 8192);
    let {
      bytesRead: a
    } = await e.read(t, 0, i, n - i);
    let l = n;
    let c = 0;
    for (let _ = a - 1; _ >= 0 && c <= o; _--) {
      if (t[_] === 10) {
        if (c++, c > o) {
          break;
        }
      }
      l--;
    }
    let u = n - l;
    let d = s - Ogo(t, a - u, a) + 1;
    let p = n + r;
    let {
      bytesRead: m
    } = await e.read(t, 0, 8192, p);
    let f = p;
    c = 0;
    for (let _ = 0; _ < m; _++) {
      if (f++, t[_] === 10) {
        if (c++, c >= o + 1) {
          break;
        }
      }
    }
    let h = f - l;
    let g = h <= t.length ? t : Buffer.allocUnsafe(h);
    let {
      bytesRead: y
    } = await e.read(g, 0, h, l);
    return {
      content: IOa(g, y),
      lineOffset: d,
      truncated: false
    };
  }
  var kOa;
  var n3n = __lazy(() => {
    mm();
    dt();
    kOa = require("fs/promises");
  });
  class POa {
    cache = new Map();
    maxCacheSize = 1000;
    readFile(e) {
      let t = zt();
      let n;
      try {
        n = t.statSync(e);
      } catch (a) {
        throw this.cache.delete(e), a;
      }
      let r = e;
      let o = this.cache.get(r);
      if (o && o.mtime === n.mtimeMs) {
        return {
          content: o.content,
          encoding: o.encoding
        };
      }
      let s = cgn(e);
      let i = t.readFileSync(e, {
        encoding: s
      }).replaceAll(`\r
`, `
`);
      if (this.cache.set(r, {
        content: i,
        encoding: s,
        mtime: n.mtimeMs
      }), this.cache.size > this.maxCacheSize) {
        let a = this.cache.keys().next().value;
        if (a) {
          this.cache.delete(a);
        }
      }
      return {
        content: i,
        encoding: s
      };
    }
    clear() {
      this.cache.clear();
    }
    invalidate(e) {
      this.cache.delete(e);
    }
    getStats() {
      return {
        size: this.cache.size,
        entries: Array.from(this.cache.keys())
      };
    }
  }
  function Mgo(e) {
    let {
      content: t
    } = uDp.readFile(e);
    return t;
  }
  var uDp;
  var OOa = __lazy(() => {
    Zl();
    uDp = new POa();
  });
  function DOa(e) {
    return e.replaceAll("\u2018", "'").replaceAll("\u2019", "'").replaceAll("\u201C", '"').replaceAll("\u201D", '"');
  }
  function Hgo(e) {
    let t = e.split(/(\r\n|\n|\r)/);
    let n = "";
    for (let r = 0; r < t.length; r++) {
      let o = t[r];
      if (o !== undefined) {
        if (r % 2 === 0) {
          n += o.replace(/\s+$/, "");
        } else {
          n += o;
        }
      }
    }
    return n;
  }
  function Lgo(e) {
    return e.replace(/(\\\\)|\\u([0-9a-fA-F]{4})/g, (t, n, r) => n !== undefined ? t : String.fromCharCode(parseInt(r, 16)));
  }
  function MOa(e) {
    let t = "";
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      if (r >= 128) {
        t += "\\\\u";
        for (let o of r.toString(16).padStart(4, "0")) {
          t += o >= "a" ? `[${o}${o.toUpperCase()}]` : o;
        }
      } else {
        t += FA(e[n]);
      }
    }
    return t;
  }
  function NOa(e) {
    return jgo.test(e) || qgo.test(e);
  }
  function LOa(e, t, n) {
    if (e === t) {
      return n;
    }
    if (qgo.test(e) && new RegExp(`^${MOa(e)}$`).test(t)) {
      let r = new Map();
      let o = 0;
      let s = 0;
      for (let i = 0, a = 0; i < e.length; i++) {
        let l = e.charCodeAt(i);
        if (l >= 128) {
          let c = t.slice(a + 2, a + 6);
          r.set(l, c);
          for (let u of c) {
            if (u >= "a" && u <= "f") {
              s++;
            } else if (u >= "A" && u <= "F") {
              o++;
            }
          }
          a += 6;
        } else {
          a += 1;
        }
      }
      return n.replace(/[\u0080-\uffff]/g, i => {
        let a = i.charCodeAt(0);
        let l = r.get(a);
        if (l !== undefined) {
          return "\\u" + l;
        }
        let c = a.toString(16).padStart(4, "0");
        return "\\u" + (o > s ? c.toUpperCase() : c);
      });
    }
    if (jgo.test(e) && Lgo(e) === t) {
      return Lgo(n);
    }
    return n;
  }
  function AMe(e, t) {
    if (e.includes(t)) {
      return t;
    }
    let n = DOa(t);
    let o = DOa(e).indexOf(n);
    if (o !== -1) {
      return e.substring(o, o + t.length);
    }
    if (jgo.test(t)) {
      let s = Lgo(t);
      if (s !== t && e.includes(s)) {
        return s;
      }
    }
    if (qgo.test(t)) {
      let s = e.match(new RegExp(MOa(t)));
      if (s) {
        return s[0];
      }
    }
    return null;
  }
  function Mmt(e, t, n) {
    if (e === t) {
      return n;
    }
    let r = t.includes("\u201C") || t.includes("\u201D");
    let o = t.includes("\u2018") || t.includes("\u2019");
    if (!r && !o) {
      return n;
    }
    let s = n;
    if (r) {
      s = dDp(s);
    }
    if (o) {
      s = pDp(s);
    }
    return s;
  }
  function FOa(e, t) {
    if (t === 0) {
      return true;
    }
    let n = e[t - 1];
    return n === " " || n === "\t" || n === `
` || n === "\r" || n === "(" || n === "[" || n === "{" || n === "\u2014" || n === "\u2013";
  }
  function dDp(e) {
    let t = [...e];
    let n = [];
    for (let r = 0; r < t.length; r++) {
      if (t[r] === '"') {
        n.push(FOa(t, r) ? "\u201C" : "\u201D");
      } else {
        n.push(t[r]);
      }
    }
    return n.join("");
  }
  function pDp(e) {
    let t = [...e];
    let n = [];
    for (let r = 0; r < t.length; r++) {
      if (t[r] === "'") {
        let o = r > 0 ? t[r - 1] : undefined;
        let s = r < t.length - 1 ? t[r + 1] : undefined;
        let i = o !== undefined && /\p{L}/u.test(o);
        let a = s !== undefined && /\p{L}/u.test(s);
        if (i && a) {
          n.push("\u2019");
        } else {
          n.push(FOa(t, r) ? "\u2018" : "\u2019");
        }
      } else {
        n.push(t[r]);
      }
    }
    return n.join("");
  }
  function UOa(e, t, n, r = false) {
    let o = r ? (i, a, l) => i.replaceAll(a, () => l) : (i, a, l) => i.replace(a, () => l);
    if (n !== "") {
      return o(e, t, n);
    }
    return !t.endsWith(`
`) && e.includes(t + `
`) ? o(e, t + `
`, n) : o(e, t, n);
  }
  function HGt({
    filePath: e,
    fileContents: t,
    oldString: n,
    newString: r,
    replaceAll: o = false
  }) {
    return Wgo({
      filePath: e,
      fileContents: t,
      edits: [{
        old_string: n,
        new_string: r,
        replace_all: o
      }]
    });
  }
  function Wgo({
    filePath: e,
    fileContents: t,
    edits: n
  }) {
    if (BOa(t, n)) {
      return {
        patch: GV({
          filePath: e,
          fileContents: t,
          edits: [{
            old_string: t,
            new_string: t,
            replace_all: false
          }]
        }),
        updatedFile: ""
      };
    }
    let r = Fgo(t, n);
    return {
      patch: xMe({
        filePath: e,
        oldContent: rY(t),
        newContent: rY(r)
      }),
      updatedFile: r
    };
  }
  function BOa(e, t) {
    return !e && t.length === 1 && t[0] !== undefined && t[0].old_string === "" && t[0].new_string === "";
  }
  function Fgo(e, t) {
    if (BOa(e, t)) {
      return "";
    }
    let n = e;
    let r = [];
    for (let o of t) {
      let s = o.old_string.replace(/\n+$/, "");
      for (let a of r) {
        if (s !== "" && a.includes(s)) {
          throw Error("Cannot edit file: old_string is a substring of a new_string from a previous edit.");
        }
      }
      let i = n;
      if (n = o.old_string === "" ? o.new_string : UOa(n, o.old_string, o.new_string, o.replace_all), n === i) {
        throw new Rbe("String not found in file. Failed to apply edit.");
      }
      r.push(o.new_string);
    }
    if (n === e) {
      throw Error("Original and edited file match exactly. Failed to apply edit.");
    }
    return n;
  }
  function $Oa(e, t) {
    let n = wpt("file.txt", "file.txt", e, t, undefined, undefined, {
      context: 8,
      timeout: 5000
    });
    if (!n) {
      return "";
    }
    let r = h5e();
    let o = n.hunks.map(d => ({
      startLine: d.oldStart,
      content: d.lines.filter(p => !p.startsWith("-") && !p.startsWith("\\")).map(p => p.slice(1)).join(`
`),
      tabAwareSeparator: r
    })).map(ugn).join(`
...
`);
    if (o.length <= 8192) {
      return o;
    }
    let s = o.lastIndexOf(`
`, 8192);
    let i = s > 0 ? o.slice(0, s) : o.slice(0, 8192);
    let a = 1;
    let l = 1;
    let u = Ru(o, `
`, i.length + a) + l;
    return `${i}

... [${u} lines truncated] ...`;
  }
  function HOa(e) {
    return e.map(t => {
      let n = [];
      let r = [];
      let o = [];
      for (let s of t.lines) {
        if (s.startsWith(" ")) {
          n.push(s.slice(1));
          r.push(s.slice(1));
          o.push(s.slice(1));
        } else if (s.startsWith("-")) {
          r.push(s.slice(1));
        } else if (s.startsWith("+")) {
          o.push(s.slice(1));
        }
      }
      return {
        old_string: r.join(`
`),
        new_string: o.join(`
`),
        replace_all: false
      };
    });
  }
  function fDp(e) {
    let t = e;
    let n = [];
    for (let [r, o] of Object.entries(mDp)) {
      let s = t;
      if (t = t.replaceAll(r, o), s !== t) {
        n.push({
          from: r,
          to: o
        });
      }
    }
    return {
      result: t,
      appliedReplacements: n
    };
  }
  function jOa({
    file_path: e,
    edits: t
  }) {
    if (t.length === 0) {
      return {
        file_path: e,
        edits: t
      };
    }
    let n = /\.(md|mdx)$/i.test(e);
    try {
      let r = us(e);
      if ((Rc(e) || Rc(r)) && !(Pp(e) || Pp(r))) {
        return {
          file_path: e,
          edits: t
        };
      }
      let o = Mgo(r);
      return {
        file_path: e,
        edits: t.map(({
          old_string: s,
          new_string: i,
          replace_all: a
        }) => {
          let l = n ? i : Hgo(i);
          if (o.includes(s)) {
            return {
              old_string: s,
              new_string: l,
              replace_all: a
            };
          }
          let {
            result: c,
            appliedReplacements: u
          } = fDp(s);
          if (o.includes(c)) {
            let d = l;
            for (let {
              from: p,
              to: m
            } of u) {
              d = d.replaceAll(p, m);
            }
            return {
              old_string: c,
              new_string: d,
              replace_all: a
            };
          }
          return {
            old_string: s,
            new_string: l,
            replace_all: a
          };
        })
      };
    } catch (r) {
      if (!fn(r)) {
        logForDebugging(`Failed to read ${e} for edit normalization: ${r instanceof Error ? r.message : String(r)}`, {
          level: "error"
        });
      }
    }
    return {
      file_path: e,
      edits: t
    };
  }
  function hDp(e, t, n) {
    if (e.length === t.length && e.every((a, l) => {
      let c = t[l];
      return c !== undefined && a.old_string === c.old_string && a.new_string === c.new_string && a.replace_all === c.replace_all;
    })) {
      return true;
    }
    let r = null;
    let o = null;
    let s = null;
    let i = null;
    try {
      r = Fgo(n, e);
    } catch (a) {
      o = he(a);
    }
    try {
      s = Fgo(n, t);
    } catch (a) {
      i = he(a);
    }
    if (o !== null && i !== null) {
      return o === i;
    }
    if (o !== null || i !== null) {
      return false;
    }
    return r === s;
  }
  function qOa(e, t) {
    if (e.file_path !== t.file_path) {
      return false;
    }
    if (e.edits.length === t.edits.length && e.edits.every((r, o) => {
      let s = t.edits[o];
      return s !== undefined && r.old_string === s.old_string && r.new_string === s.new_string && r.replace_all === s.replace_all;
    })) {
      return true;
    }
    let n = "";
    if (!Rc(e.file_path) || Pp(e.file_path)) {
      try {
        n = Mgo(e.file_path);
      } catch (r) {
        if (!fn(r)) {
          throw r;
        }
      }
    }
    return hDp(e.edits, t.edits, n);
  }
  var jgo;
  var qgo;
  var mDp;
  var IMe = __lazy(() => {
    V9e();
    ku();
    Zn();
    mm();
    je();
    Qde();
    dt();
    Zl();
    OOa();
    VDe();
    Ay();
    jgo = /\\u[0-9a-fA-F]{4}/;
    qgo = /[\u0080-\uffff]/;
    mDp = {
      "<fnr>": "<function_results>",
      "<n>": "<name>",
      "</n>": "</name>",
      "<o>": "<output>",
      "</o>": "</output>",
      "<e>": "<error>",
      "</e>": "</error>",
      "<s>": "<system>",
      "</s>": "</system>",
      "<r>": "<result>",
      "</r>": "</result>",
      "< META_START >": "<META_START>",
      "< META_END >": "<META_END>",
      "< EOT >": "<EOT>",
      "< META >": "<META>",
      "< SOS >": "<SOS>",
      "\n\nH:": `

Human:`,
      "\n\nA:": `

Assistant:`
    };
  });
  function o3n(e) {
    if (!e) {
      return "Update";
    }
    if (e.file_path?.startsWith(getPlansDirectory())) {
      return "Updated plan";
    }
    if (e.edits != null) {
      return "Update";
    }
    if (e.old_string === "") {
      return "Create";
    }
    return "Update";
  }
  function Vgo(e) {
    if (!e?.file_path) {
      return null;
    }
    return Pd(e.file_path);
  }
  function WOa({
    file_path: e
  }, {
    verbose: t
  }) {
    if (!e) {
      return null;
    }
    if (e.startsWith(getPlansDirectory())) {
      return "";
    }
    return wU.jsx(vM, {
      filePath: e,
      children: t ? e : Pd(e)
    });
  }
  function GOa({
    filePath: e = "",
    structuredPatch: t,
    originalFile: n
  }, r, {
    style: o,
    verbose: s
  }) {
    if (!e) {
      return null;
    }
    let i = e.startsWith(getPlansDirectory());
    return wU.jsx(Lqn, {
      filePath: e,
      structuredPatch: t,
      firstLine: n ? Ad(n) : null,
      fileContent: n || undefined,
      style: o,
      verbose: s,
      previewHint: i ? "/plan to preview" : undefined,
      collapsed: !i && isScratchpadDisplayPath(e)
    });
  }
  function VOa(e, t) {
    let {
      style: n,
      verbose: r
    } = t;
    let o = e.file_path;
    let s = e.old_string ?? "";
    let i = e.new_string ?? "";
    let a = e.replace_all ?? false;
    if ("edits" in e && e.edits != null) {
      return wU.jsx(TMe, {
        file_path: o,
        operation: "update",
        firstLine: null,
        verbose: r
      });
    }
    if (s === "") {
      return wU.jsx(TMe, {
        file_path: o,
        operation: "write",
        content: i,
        firstLine: Ad(i),
        verbose: r
      });
    }
    return wU.jsx(gDp, {
      filePath: o,
      oldString: s,
      newString: i,
      replaceAll: a,
      style: n,
      verbose: r
    });
  }
  function zOa(e, t) {
    let {
      verbose: n
    } = t;
    if (!n && typeof e === "string" && Nl(e, "tool_use_error")) {
      let r = Nl(e, "tool_use_error");
      if (r?.includes("File has not been read yet")) {
        return wU.jsx(Vn, {
          children: wU.jsx(Text, {
            dimColor: true,
            children: "File must be read first"
          })
        });
      }
      if (r?.includes("Note: your current working directory is")) {
        return wU.jsx(Vn, {
          children: wU.jsx(Text, {
            color: "error",
            children: "File not found"
          })
        });
      }
      return wU.jsx(Vn, {
        children: wU.jsx(Text, {
          color: "error",
          children: "Error editing file"
        })
      });
    }
    return wU.jsx(Rw, {
      result: e,
      verbose: n
    });
  }
  function gDp(e) {
    let t = Ggo.c(16);
    let {
      filePath: n,
      oldString: r,
      newString: o,
      replaceAll: s,
      style: i,
      verbose: a
    } = e;
    let l;
    if (t[0] !== n || t[1] !== o || t[2] !== r || t[3] !== s) {
      l = () => _Dp(n, r, o, s);
      t[0] = n;
      t[1] = o;
      t[2] = r;
      t[3] = s;
      t[4] = l;
    } else {
      l = t[4];
    }
    let [c] = Nmt.useState(l);
    let u;
    if (t[5] !== n || t[6] !== a) {
      u = wU.jsx(TMe, {
        file_path: n,
        operation: "update",
        firstLine: null,
        verbose: a
      });
      t[5] = n;
      t[6] = a;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== c || t[9] !== n || t[10] !== i || t[11] !== a) {
      d = wU.jsx(yDp, {
        promise: c,
        filePath: n,
        style: i,
        verbose: a
      });
      t[8] = c;
      t[9] = n;
      t[10] = i;
      t[11] = a;
      t[12] = d;
    } else {
      d = t[12];
    }
    let p;
    if (t[13] !== u || t[14] !== d) {
      p = wU.jsx(Nmt.Suspense, {
        fallback: u,
        children: d
      });
      t[13] = u;
      t[14] = d;
      t[15] = p;
    } else {
      p = t[15];
    }
    return p;
  }
  function yDp(e) {
    let t = Ggo.c(7);
    let {
      promise: n,
      filePath: r,
      style: o,
      verbose: s
    } = e;
    let {
      patch: i,
      firstLine: a,
      fileContent: l
    } = Nmt.use(n);
    let c;
    if (t[0] !== l || t[1] !== r || t[2] !== a || t[3] !== i || t[4] !== o || t[5] !== s) {
      c = wU.jsx(TMe, {
        file_path: r,
        operation: "update",
        patch: i,
        firstLine: a,
        fileContent: l,
        style: o,
        verbose: s
      });
      t[0] = l;
      t[1] = r;
      t[2] = a;
      t[3] = i;
      t[4] = o;
      t[5] = s;
      t[6] = c;
    } else {
      c = t[6];
    }
    return c;
  }
  async function _Dp(e, t, n, r) {
    try {
      let o = await AOa(e, t, 3);
      if (o === null || o.truncated || o.content === "") {
        let {
          patch: l
        } = HGt({
          filePath: e,
          fileContents: t,
          oldString: t,
          newString: n
        });
        return {
          patch: l,
          firstLine: null,
          fileContent: undefined
        };
      }
      let s = AMe(o.content, t) || t;
      let i = Mmt(t, s, n);
      let {
        patch: a
      } = HGt({
        filePath: e,
        fileContents: o.content,
        oldString: s,
        newString: i,
        replaceAll: r
      });
      return {
        patch: Qqn(a, o.lineOffset - 1),
        firstLine: o.lineOffset === 1 ? Ad(o.content) : null,
        fileContent: o.content
      };
    } catch (o) {
      if (Io(o)) {
        logForDebugging(`Failed to load rejection diff for ${e}: ${o.message}`, {
          level: "error"
        });
      } else {
        Oe(o);
      }
      return {
        patch: [],
        firstLine: null,
        fileContent: undefined
      };
    }
  }
  var Ggo;
  var Nmt;
  var wU;
  var zgo = __lazy(() => {
    rgo();
    Wl();
    ro();
    KG();
    igo();
    XTe();
    et();
    je();
    Qde();
    dt();
    Zl();
    Rn();
    wm();
    xx();
    n3n();
    Zn();
    IMe();
    Ggo = __toESM(pt(), 1);
    Nmt = __toESM(ot(), 1);
    wU = __toESM(ie(), 1);
  });
  var s3n;
  var Kgo = __lazy(() => {
    s3n = ["npm", "yarn", "pnpm", "node", "python", "python3", "go", "cargo", "make", "docker", "terraform", "webpack", "vite", "jest", "pytest", "curl", "git", "gh", "dotnet", "msbuild", "nuget", "bun", "bunx", "npx", "deno", "pwsh", "pip", "uv", "poetry", "gradle", "mvn", "nx", "turbo", "tsc", "eslint", "prettier", "build", "test", "serve", "watch", "dev"];
  });
  function KOa(e) {
    return `prompt: ${e.trim()}`;
  }
  function jGt() {
    return false;
  }
  function YOa(e) {
    return [];
  }
  function JOa(e) {
    return [];
  }
  function XOa(e) {
    return [];
  }
  async function Ygo(e, t, n, r, o, s) {
    return {
      matches: false,
      confidence: "high",
      reason: "This feature is disabled"
    };
  }
  async function QOa(e, t, n) {
    return t || null;
  }
  function W5e() {
    return getSettingsForSource("policySettings")?.allowManagedPermissionRulesOnly === true;
  }
  function Umt() {
    return !W5e();
  }
  function SDp(e) {
    let t = getSettingsFilePathForSource(e);
    if (!t) {
      return null;
    }
    try {
      let {
        resolvedPath: n
      } = qd(zt(), t);
      let r = LP(n);
      if (r.trim() === "") {
        return {};
      }
      let o = Ba(r, false);
      return o && typeof o === "object" ? o : null;
    } catch {
      return null;
    }
  }
  function TDp(e, t) {
    if (!e || !e.permissions) {
      return [];
    }
    let {
      permissions: n
    } = e;
    let r = [];
    for (let o of bDp) {
      let s = n[o];
      if (s) {
        for (let i of s) {
          r.push({
            source: t,
            ruleBehavior: o,
            ruleValue: Nh(i)
          });
        }
      }
    }
    return r;
  }
  function Bmt() {
    if (W5e()) {
      return Fmt("policySettings");
    }
    let e = [];
    for (let t of ew()) {
      e.push(...Fmt(t));
    }
    if (!isWorkspacePersistedTrusted()) {
      let t = !projectSettingsAliasesUserSettings();
      let n = isLocalSettingsGitTracked();
      let r = new Set();
      let o = e.filter(s => {
        if (s.ruleBehavior !== "allow") {
          return true;
        }
        if (s.source === "projectSettings" && t) {
          r.add(".claude/settings.json");
          return false;
        }
        if (s.source === "localSettings" && n) {
          r.add(".claude/settings.local.json");
          return false;
        }
        return true;
      });
      if (o.length !== e.length) {
        ZOa("permissions.allow", e.length - o.length, [...r]);
      }
      return o;
    }
    return e;
  }
  function $mt() {
    let e = isWorkspacePersistedTrusted();
    let t = !e && !projectSettingsAliasesUserSettings();
    let n = !e && isLocalSettingsGitTracked();
    let r = [];
    let o = 0;
    let s = new Set();
    for (let i of ew()) {
      let a = getSettingsForSource(i)?.permissions?.additionalDirectories ?? [];
      if (t && i === "projectSettings" && a.length > 0) {
        o += a.length;
        s.add(".claude/settings.json");
        continue;
      }
      if (n && i === "localSettings" && a.length > 0) {
        o += a.length;
        s.add(".claude/settings.local.json");
        continue;
      }
      r.push(...a);
    }
    if (o > 0) {
      ZOa("permissions.additionalDirectories", o, [...s]);
    }
    return r;
  }
  function ZOa(e, t, n) {
    if (Jgo ??= new Set(), Jgo.vZc(e)) {
      return;
    }
    if (Jgo.add(e), logForDebugging(`Dropped ${t} project-scoped ${e} entr${t === 1 ? "y" : "ies"} \u2014 workspace not yet trusted`), !getIsNonInteractiveSession() && !checkHasTrustDialogAccepted()) {
      return;
    }
    let r = getWorkspacePersistedTrustKey();
    let o = n.length > 0 ? n.join(" and ") : ".claude/ settings";
    console.error(`Ignoring ${t} ${e} ${t === 1 ? "entry" : "entries"} from ${o}: this workspace has not been trusted. Run Claude Code interactively here once and accept the trust dialog, or set projects[${De(r)}].hasTrustDialogAccepted: true in ${hI()}.`);
  }
  function Fmt(e) {
    let t = getSettingsForSource(e);
    return TDp(t, e);
  }
  function eDa(e) {
    if (!sF.includes(e.source)) {
      return false;
    }
    let t = jp(e.ruleValue);
    let n = getSettingsForSource(e.source);
    if (!n || !n.permissions) {
      return false;
    }
    let r = n.permissions[e.ruleBehavior];
    if (!r) {
      return false;
    }
    let o = s => jp(Nh(s));
    if (!r.some(s => o(s) === t)) {
      return false;
    }
    try {
      let s = {
        ...n,
        permissions: {
          ...n.permissions,
          [e.ruleBehavior]: r.filter(a => o(a) !== t)
        }
      };
      let {
        error: i
      } = updateSettingsForSource(e.source, s);
      if (i) {
        return false;
      }
      return true;
    } catch (s) {
      Oe(s);
      return false;
    }
  }
  function vDp() {
    return {
      permissions: {}
    };
  }
  function tDa({
    ruleValues: e,
    ruleBehavior: t
  }, n) {
    if (W5e()) {
      return false;
    }
    if (e.length < 1) {
      return true;
    }
    let r = e.map(jp);
    let o = getSettingsForSource(n) || SDp(n) || vDp();
    try {
      let s = o.permissions || {};
      let i = s[t] || [];
      let a = new Set(i.map(d => jp(Nh(d))));
      let l = r.filter(d => !a.vZc(d));
      if (l.length === 0) {
        return true;
      }
      let c = {
        ...o,
        permissions: {
          ...s,
          [t]: [...i, ...l]
        }
      };
      let u = updateSettingsForSource(n, c);
      if (u.error) {
        throw u.error;
      }
      return true;
    } catch (s) {
      logForDebugging(`Failed to add permission rules to ${n} settings: ${s instanceof Error ? s.message : String(s)}`, {
        level: "error"
      });
      return false;
    }
  }
  var bDp;
  var Jgo;
  function qGt(e) {
    if (!e) {
      return [];
    }
    return e.flatMap(t => {
      switch (t.type) {
        case "addRules":
          return t.rules;
        default:
          return [];
      }
    });
  }
  function $y(e, t) {
    switch (t.type) {
      case "setMode":
        if (t.mode === "bypassPermissions" && !e.isBypassPermissionsModeAvailable) {
          logForDebugging("Ignoring permission update: setMode 'bypassPermissions' rejected \u2014 mode is not available (disableBypassPermissionsMode set, or session not launched in bypassPermissions mode)");
          return e;
        }
        logForDebugging(`Applying permission update: Setting mode to '${t.mode}'`);
        return {
          ...e,
          mode: t.mode
        };
      case "addRules":
        {
          let n = t.rules.map(o => jp(o));
          logForDebugging(`Applying permission update: Adding ${t.rules.length} ${t.behavior} rule(s) to destination '${t.destination}': ${De(n)}`);
          let r = t.behavior === "allow" ? "alwaysAllowRules" : t.behavior === "deny" ? "alwaysDenyRules" : "alwaysAskRules";
          return {
            ...e,
            [r]: {
              ...e[r],
              [t.destination]: [...(e[r][t.destination] || []), ...n]
            }
          };
        }
      case "replaceRules":
        {
          let n = t.rules.map(o => jp(o));
          logForDebugging(`Replacing all ${t.behavior} rules for destination '${t.destination}' with ${t.rules.length} rule(s): ${De(n)}`);
          let r = t.behavior === "allow" ? "alwaysAllowRules" : t.behavior === "deny" ? "alwaysDenyRules" : "alwaysAskRules";
          return {
            ...e,
            [r]: {
              ...e[r],
              [t.destination]: n
            }
          };
        }
      case "addDirectories":
        {
          logForDebugging(`Applying permission update: Adding ${t.directories.length} director${t.directories.length === 1 ? "y" : "ies"} with destination '${t.destination}': ${De(t.directories)}`);
          let n = new Map(e.additionalWorkingDirectories);
          for (let r of t.directories) {
            n.set(r, {
              path: r,
              source: t.destination
            });
          }
          return {
            ...e,
            additionalWorkingDirectories: n
          };
        }
      case "removeRules":
        {
          let n = t.rules.map(a => jp(a));
          logForDebugging(`Applying permission update: Removing ${t.rules.length} ${t.behavior} rule(s) from source '${t.destination}': ${De(n)}`);
          let r = t.behavior === "allow" ? "alwaysAllowRules" : t.behavior === "deny" ? "alwaysDenyRules" : "alwaysAskRules";
          let o = e[r][t.destination] || [];
          let s = new Set(n);
          let i = o.filter(a => !s.vZc(a));
          return {
            ...e,
            [r]: {
              ...e[r],
              [t.destination]: i
            }
          };
        }
      case "removeDirectories":
        {
          logForDebugging(`Applying permission update: Removing ${t.directories.length} director${t.directories.length === 1 ? "y" : "ies"}: ${De(t.directories)}`);
          let n = new Map(e.additionalWorkingDirectories);
          for (let r of t.directories) {
            n.delete(r);
          }
          return {
            ...e,
            additionalWorkingDirectories: n
          };
        }
      default:
        return e;
    }
  }
  function Zq(e, t) {
    let n = e;
    for (let r of t) {
      n = $y(n, r);
    }
    return n;
  }
  function Xgo(e) {
    return e === "localSettings" || e === "userSettings" || e === "projectSettings";
  }
  function Zde(e) {
    if (!Xgo(e.destination)) {
      return;
    }
    if (e.type === "setMode" && e.mode === "bypassPermissions") {
      logForDebugging(`setMode:'bypassPermissions' is session-scoped; not persisting as defaultMode to ${e.destination}`);
      return;
    }
    switch (logForDebugging(`Persisting permission update: ${e.type} to source '${e.destination}'`), e.type) {
      case "addRules":
        {
          logForDebugging(`Persisting ${e.rules.length} ${e.behavior} rule(s) to ${e.destination}`);
          tDa({
            ruleValues: e.rules,
            ruleBehavior: e.behavior
          }, e.destination);
          break;
        }
      case "addDirectories":
        {
          logForDebugging(`Persisting ${e.directories.length} director${e.directories.length === 1 ? "y" : "ies"} to ${e.destination}`);
          let n = getSettingsForSource(e.destination)?.permissions?.additionalDirectories || [];
          let r = e.directories.filter(o => !n.includes(o));
          if (r.length > 0) {
            let o = [...n, ...r];
            updateSettingsForSource(e.destination, {
              permissions: {
                additionalDirectories: o
              }
            });
          }
          break;
        }
      case "removeRules":
        {
          logForDebugging(`Removing ${e.rules.length} ${e.behavior} rule(s) from ${e.destination}`);
          let r = (getSettingsForSource(e.destination)?.permissions || {})[e.behavior] || [];
          let o = new Set(e.rules.map(jp));
          let s = r.filter(i => {
            let a = jp(Nh(i));
            return !o.vZc(a);
          });
          updateSettingsForSource(e.destination, {
            permissions: {
              [e.behavior]: s
            }
          });
          break;
        }
      case "removeDirectories":
        {
          logForDebugging(`Removing ${e.directories.length} director${e.directories.length === 1 ? "y" : "ies"} from ${e.destination}`);
          let n = getSettingsForSource(e.destination)?.permissions?.additionalDirectories || [];
          let r = new Set(e.directories);
          let o = n.filter(s => !r.vZc(s));
          updateSettingsForSource(e.destination, {
            permissions: {
              additionalDirectories: o
            }
          });
          break;
        }
      case "setMode":
        {
          logForDebugging(`Persisting mode '${e.mode}' to ${e.destination}`);
          updateSettingsForSource(e.destination, {
            permissions: {
              defaultMode: e.mode
            }
          });
          break;
        }
      case "replaceRules":
        {
          logForDebugging(`Replacing all ${e.behavior} rules in ${e.destination} with ${e.rules.length} rule(s)`);
          let t = e.rules.map(jp);
          updateSettingsForSource(e.destination, {
            permissions: {
              [e.behavior]: t
            }
          });
          break;
        }
    }
  }
  function zV(e) {
    for (let t of e) {
      Zde(t);
    }
  }
  function G5e(e, t = "session") {
    let n = toPosixPath(e);
    if (n === "/") {
      return;
    }
    return {
      type: "addRules",
      rules: [{
        toolName: "Read",
        ruleContent: nDa.posix.isAbsolute(n) ? `/${n}/**` : `${n}/**`
      }],
      behavior: "allow",
      destination: t
    };
  }
  var nDa;
  var Zk = __lazy(() => {
    je();
    wm();
    EC();
    nDa = require("path");
  });
  function WGt(e) {
    return e.match(/^(.+):\*$/)?.[1] ?? null;
  }
  function Qgo(e) {
    if (e.endsWith(":*")) {
      return false;
    }
    for (let t = 0; t < e.length; t++) {
      if (e[t] === "*") {
        let n = 0;
        let r = t - 1;
        while (r >= 0 && e[r] === "\\") {
          n++;
          r--;
        }
        if (n % 2 === 0) {
          return true;
        }
      }
    }
    return false;
  }
  function rDa(e) {
    let t = e.trimEnd();
    if (!t.endsWith("*")) {
      return false;
    }
    let n = 0;
    let r = t.length - 2;
    while (r >= 0 && t[r] === "\\") {
      n++;
      r--;
    }
    return n % 2 === 0;
  }
  function KV(e, t, n = false, r = false) {
    let o = e.trim();
    let s = r ? o.replace(/[ \t]+/g, " ") : o;
    let i = r ? t.replace(/[ \t]+/g, " ") : t;
    let a = "";
    let l = 0;
    while (l < s.length) {
      let g = s[l];
      if (g === "\\" && l + 1 < s.length) {
        let y = s[l + 1];
        if (y === "*") {
          a += "\x00ESCAPED_STAR\x00";
          l += 2;
          continue;
        } else if (y === "\\") {
          a += "\x00ESCAPED_BACKSLASH\x00";
          l += 2;
          continue;
        }
      }
      a += g;
      l++;
    }
    let p = a.replace(/[.+?^${}()|[\]\\'"]/g, "\\$&").replace(RDp, "\x00GLOBSTAR\x00").replaceAll("*", ".*").replace(xDp, "/(?:.*/)?").replace(wDp, "\\*").replace(CDp, "\\\\");
    let m = (a.match(/\*/g) || []).length;
    if (p.endsWith(" .*") && m === 1) {
      p = p.slice(0, -3) + "( .*)?";
    }
    let f = "s" + (n ? "i" : "");
    return new RegExp(`^${p}$`, f).test(i);
  }
  function l3n(e) {
    let t = WGt(e);
    if (t !== null) {
      return {
        type: "prefix",
        prefix: t
      };
    }
    if (Qgo(e)) {
      return {
        type: "wildcard",
        pattern: e
      };
    }
    return {
      type: "exact",
      command: e
    };
  }
  function c3n(e, t) {
    return [{
      type: "addRules",
      rules: [{
        toolName: e,
        ruleContent: t
      }],
      behavior: "allow",
      destination: "localSettings"
    }];
  }
  function GGt(e, t) {
    return [{
      type: "addRules",
      rules: [{
        toolName: e,
        ruleContent: `${t} *`
      }],
      behavior: "allow",
      destination: "localSettings"
    }];
  }
  var wDp;
  var CDp;
  var RDp;
  var xDp;
  var V5e = __lazy(() => {
    wDp = new RegExp("\x00ESCAPED_STAR\x00", "g");
    CDp = new RegExp("\x00ESCAPED_BACKSLASH\x00", "g");
    RDp = /\/(?:\*\*\/)+/g;
    xDp = new RegExp("\x00GLOBSTAR\x00", "g");
  });
  function Zgo(e, t, n) {
    switch (e.type) {
      case "raw_string":
        t.raw.push([e.startIndex, e.endIndex]);
        return;
      case "ansi_c_string":
        t.ansiC.push([e.startIndex, e.endIndex]);
        return;
      case "string":
        if (!n) {
          t.double.push([e.startIndex, e.endIndex]);
        }
        for (let r of e.children) {
          if (r) {
            Zgo(r, t, true);
          }
        }
        return;
      case "heredoc_redirect":
        {
          let r = false;
          for (let o of e.children) {
            if (o && o.type === "heredoc_start") {
              let s = o.text[0];
              r = s === "'" || s === '"' || s === "\\";
              break;
            }
          }
          if (r) {
            t.heredoc.push([e.startIndex, e.endIndex]);
            return;
          }
          break;
        }
    }
    for (let r of e.children) {
      if (r) {
        Zgo(r, t, n);
      }
    }
  }
  function kDp(e) {
    let t = new Set();
    for (let [n, r] of e) {
      for (let o = n; o < r; o++) {
        t.add(o);
      }
    }
    return t;
  }
  function oDa(e) {
    return e.filter((t, n) => !e.some((r, o) => o !== n && r[0] <= t[0] && r[1] >= t[1] && (r[0] < t[0] || r[1] > t[1])));
  }
  function ADp(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = oDa(t).sort((o, s) => s[0] - o[0]);
    let r = e;
    for (let [o, s] of n) {
      r = r.slice(0, o) + r.slice(s);
    }
    return r;
  }
  function IDp(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = oDa(t).sort((o, s) => s[0] - o[0]);
    let r = e;
    for (let [o, s, i, a] of n) {
      r = r.slice(0, o) + i + a + r.slice(s);
    }
    return r;
  }
  function PDp(e, t) {
    let n = {
      raw: [],
      ansiC: [],
      double: [],
      heredoc: []
    };
    Zgo(e, n, false);
    let {
      raw: r,
      ansiC: o,
      double: s,
      heredoc: i
    } = n;
    let a = [...r, ...o, ...s, ...i];
    let l = kDp([...r, ...o, ...i]);
    let c = new Set();
    for (let [f, h] of s) {
      c.add(f);
      c.add(h - 1);
    }
    let u = "";
    for (let f = 0; f < t.length; f++) {
      if (l.vZc(f)) {
        continue;
      }
      if (c.vZc(f)) {
        continue;
      }
      u += t[f];
    }
    let d = ADp(t, a);
    let p = [];
    for (let [f, h] of r) {
      p.push([f, h, "'", "'"]);
    }
    for (let [f, h] of o) {
      p.push([f, h, "$'", "'"]);
    }
    for (let [f, h] of s) {
      p.push([f, h, '"', '"']);
    }
    for (let [f, h] of i) {
      p.push([f, h, "", ""]);
    }
    let m = IDp(t, p);
    return {
      withDoubleQuotes: u,
      fullyUnquoted: d,
      unquotedKeepQuoteChars: m
    };
  }
  function ODp(e, t) {
    let n = e;
    let r = [];
    let o = [];
    let s = false;
    let i = false;
    let a = false;
    let l = new Set(["if_statement", "while_statement", "for_statement", "c_style_for_statement", "case_statement", "function_definition", "do_group", "elif_clause", "else_clause"]);
    function c(u) {
      for (let d of u.children) {
        if (!d) {
          continue;
        }
        if (d.type === "list") {
          for (let p of d.children) {
            if (!p) {
              continue;
            }
            if (p.type === "&&" || p.type === "||") {
              r.push(p.type);
            } else if (p.type === "list" || p.type === "redirected_statement" || p.type === "pipeline" || p.type === "negated_command" || l.vZc(p.type)) {
              c({
                ...u,
                children: [p]
              });
            } else if (p.type === "subshell") {
              s = true;
              o.push(p.text);
            } else if (p.type === "compound_statement") {
              i = true;
              o.push(p.text);
            } else {
              o.push(p.text);
            }
          }
        } else if (d.type === ";") {
          r.push(";");
        } else if (d.type === "pipeline") {
          a = true;
          o.push(d.text);
          c(d);
        } else if (d.type === "subshell") {
          s = true;
          o.push(d.text);
        } else if (d.type === "compound_statement") {
          i = true;
          o.push(d.text);
        } else if (d.type === "command" || d.type === "declaration_command" || d.type === "variable_assignment") {
          o.push(d.text);
        } else if (d.type === "redirected_statement") {
          let p = false;
          for (let m of d.children) {
            if (!m || m.type === "file_redirect") {
              continue;
            }
            p = true;
            c({
              ...d,
              children: [m]
            });
          }
          if (!p) {
            o.push(d.text);
          }
        } else if (d.type === "negated_command") {
          o.push(d.text);
          c(d);
        } else if (l.vZc(d.type)) {
          if (d.type !== "do_group" && d.type !== "elif_clause" && d.type !== "else_clause") {
            o.push(d.text);
          }
          c(d);
        } else if (d.children.length > 0) {
          c(d);
        }
      }
    }
    if (c(n), o.length === 0) {
      o.push(t);
    }
    return {
      hasCompoundOperators: r.length > 0,
      hasPipeline: a,
      hasSubshell: s,
      hasCommandGroup: i,
      operators: r,
      segments: o
    };
  }
  function DDp(e) {
    let t = e;
    function n(r) {
      if (r.type === ";" || r.type === "&&" || r.type === "||") {
        return true;
      }
      if (r.type === "list") {
        return true;
      }
      for (let o of r.children) {
        if (o && n(o)) {
          return true;
        }
      }
      return false;
    }
    return n(t);
  }
  function MDp(e) {
    let t = e;
    let n = false;
    let r = false;
    let o = false;
    let s = false;
    let i = false;
    function a(l) {
      switch (l.type) {
        case "command_substitution":
          n = true;
          break;
        case "process_substitution":
          r = true;
          break;
        case "expansion":
          o = true;
          break;
        case "heredoc_redirect":
          s = true;
          break;
        case "comment":
          i = true;
          break;
      }
      for (let c of l.children) {
        if (c) {
          a(c);
        }
      }
    }
    a(t);
    return {
      hasCommandSubstitution: n,
      hasProcessSubstitution: r,
      hasParameterExpansion: o,
      hasHeredoc: s,
      hasComment: i
    };
  }
  function sDa(e, t) {
    return {
      quoteContext: PDp(e, t),
      compoundStructure: ODp(e, t),
      hasActualOperatorNodes: DDp(e),
      dangerousPatterns: MDp(e)
    };
  }
  function eyo(e, t) {
    t(e);
    for (let n of e.children) {
      eyo(n, t);
    }
  }
  function NDp(e) {
    let t = [];
    eyo(e, n => {
      if (n.type === "pipeline") {
        for (let r of n.children) {
          if (r.type === "|" || r.type === "|&") {
            t.push([r.startIndex, r.endIndex]);
          }
        }
      }
    });
    return t.sort((n, r) => n[0] - r[0]);
  }
  function LDp(e) {
    let t = [];
    eyo(e, n => {
      if (n.type === "file_redirect") {
        let r = n.children;
        let o = r.findIndex(a => a.type === ">" || a.type === ">>");
        let s = r[o];
        let i = o >= 0 ? r[o + 1] : undefined;
        if (s && i) {
          t.push({
            startIndex: n.startIndex,
            endIndex: i.endIndex,
            target: i.text,
            operator: s.type
          });
        }
      }
    });
    return t;
  }
  class aDa {
    originalCommand;
    commandBytes;
    pipePositions;
    redirectionNodes;
    treeSitterAnalysis;
    constructor(e, t, n, r) {
      this.originalCommand = e;
      this.commandBytes = Buffer.from(e, "utf8");
      this.pipePositions = t;
      this.redirectionNodes = n;
      this.treeSitterAnalysis = r;
    }
    toString() {
      return this.originalCommand;
    }
    getPipeSegments() {
      if (this.pipePositions.length === 0) {
        return [this.originalCommand];
      }
      let e = [];
      let t = 0;
      for (let [r, o] of this.pipePositions) {
        let s = this.commandBytes.subarray(t, r).toString("utf8").trim();
        if (s) {
          e.push(s);
        }
        t = o;
      }
      let n = this.commandBytes.subarray(t).toString("utf8").trim();
      if (n) {
        e.push(n);
      }
      return e;
    }
    withoutOutputRedirections() {
      if (this.redirectionNodes.length === 0) {
        return this.originalCommand;
      }
      let e = [...this.redirectionNodes].sort((n, r) => r.startIndex - n.startIndex);
      let t = this.commandBytes;
      for (let n of e) {
        t = Buffer.concat([t.subarray(0, n.startIndex), t.subarray(n.endIndex)]);
      }
      return t.toString("utf8").replace(/[ \t]+/g, " ").replace(/[ \t]*\n[ \t]*/g, `
`).trim();
    }
    getOutputRedirections() {
      return this.redirectionNodes.map(({
        target: e,
        operator: t
      }) => ({
        target: e,
        operator: t
      }));
    }
    getTreeSitterAnalysis() {
      return this.treeSitterAnalysis;
    }
  }
  function tyo(e, t) {
    let n = NDp(t);
    let r = LDp(t);
    let o = sDa(t, e);
    return new aDa(e, n, r, o);
  }
  async function FDp(e) {
    if (!e) {
      return null;
    }
    try {
      let {
        parseCommand: t
      } = await Promise.resolve().then(() => (VOe(), Fua));
      let n = await t(e);
      if (n) {
        return tyo(e, n.rootNode);
      }
    } catch {}
    return null;
  }
  var iDa;
  var u3n;
  var d3n;
  var lDa = __lazy(() => {
    d3n = {
      parse(e) {
        if (e === iDa && u3n !== undefined) {
          return u3n;
        }
        iDa = e;
        u3n = FDp(e);
        return u3n;
      }
    };
  });
  function mDa(e, t) {
    for (let n of e) {
      if (n.startsWith("-") && !n.startsWith("--") && n.length > 2) {
        for (let r = 1; r < n.length; r++) {
          let o = "-" + n[r];
          if (!t.includes(o)) {
            return false;
          }
        }
      } else if (!t.includes(n)) {
        return false;
      }
    }
    return true;
  }
  function cDa(e, t) {
    let n = uE(e);
    if (n[0] !== "sed") {
      return false;
    }
    let o = n.slice(1).filter(a => a.startsWith("-") && a !== "--");
    if (!mDa(o, ["-n", "--quiet", "--silent", "-E", "--regexp-extended", "-r", "-z", "--zero-terminated", "--posix"])) {
      return false;
    }
    let i = false;
    for (let a of o) {
      if (a === "-n" || a === "--quiet" || a === "--silent") {
        i = true;
        break;
      }
      if (a.startsWith("-") && !a.startsWith("--") && a.includes("n")) {
        i = true;
        break;
      }
    }
    if (!i) {
      return false;
    }
    if (t.length === 0) {
      return false;
    }
    for (let a of t) {
      let l = a.split(";");
      for (let c of l) {
        if (!UDp(c.trim())) {
          return false;
        }
      }
    }
    return true;
  }
  function UDp(e) {
    if (!e) {
      return false;
    }
    return /^(?:\d+|\d+,\d+)?p$/.test(e);
  }
  function uDa(e, t, n, r) {
    let o = r?.allowFileWrites ?? false;
    if (!o && n) {
      return false;
    }
    let s = uE(e);
    if (s[0] !== "sed") {
      return false;
    }
    let a = s.slice(1).filter(y => y.startsWith("-") && y !== "--");
    let l = ["-E", "--regexp-extended", "-r", "--posix"];
    if (o) {
      l.push("-i", "--in-place");
    }
    if (!mDa(a, l)) {
      return false;
    }
    if (t.length !== 1) {
      return false;
    }
    let c = t[0].trim();
    if (!c.startsWith("s")) {
      return false;
    }
    let u = c.match(/^s\/(.*?)$/);
    if (!u) {
      return false;
    }
    let d = u[1];
    let p = 0;
    let m = -1;
    let f = 0;
    while (f < d.length) {
      if (d[f] === "\\") {
        f += 2;
        continue;
      }
      if (d[f] === "/") {
        p++;
        m = f;
      }
      f++;
    }
    if (p !== 2) {
      return false;
    }
    let h = d.slice(m + 1);
    if (!/^[gpimIM]*[1-9]?[gpimIM]*$/.test(h)) {
      return false;
    }
    return true;
  }
  function jmt(e, t) {
    let n = t?.allowFileWrites ?? false;
    if (m3n(e) || Up(e)) {
      return false;
    }
    let r;
    try {
      r = HDp(e);
    } catch (l) {
      return false;
    }
    let o = BDp(e);
    let s = false;
    let i = false;
    if (n) {
      s = cDa(e, r);
      i = uDa(e, r, o, {
        allowFileWrites: true
      });
    } else {
      s = cDa(e, r);
      i = uDa(e, r, o);
    }
    if (!s && !i) {
      return false;
    }
    for (let l of r) {
      if (i && l.includes(";")) {
        return false;
      }
    }
    for (let l of r) {
      if (dDa(l)) {
        return false;
      }
    }
    let a = $Dp(e);
    if (a !== null) {
      if (a === "__SED_MULTIPLE_I_FLAGS__") {
        return false;
      }
      if (dDa(a)) {
        return false;
      }
      let l = a.trimStart();
      if (/^[sy][^a-zA-Z0-9]/.test(l)) {
        return false;
      }
      if (/^[\\$:={]/.test(l)) {
        return false;
      }
      if (/^\d+[ \t]*[,!~=aAcCdDegGhHiIlnNpPqQrRsStTwWxyz]/.test(l)) {
        return false;
      }
      if (/^[aAcCdDgGhHiIlnNpPqQtTwWxz=]([\s\\;]|$)/.test(l)) {
        return false;
      }
      if (/^[rR]([\s\\;/]|\.{1,2}\/|$)/.test(l)) {
        return false;
      }
      if (/^\/(?:[^/\\]|\\.)*\/[IMim]*[ \t]*([aAcCdDgGhHiIlnNpPqQtTwWxz=]([\s\\;]|$)|[rR]([\s\\;/]|\.{1,2}\/|$)|[sy][^a-zA-Z0-9]|[,!~])/.test(l)) {
        return false;
      }
      let c = l.replace(/^(\.{1,2}\/)+/, "");
      if (l.includes(";") || l.includes("[") || l.includes("\\") || c.includes("..")) {
        return false;
      }
    }
    return true;
  }
  function BDp(e) {
    let t = uE(e);
    if (t[0] !== "sed") {
      return false;
    }
    let n = t.slice(1);
    let r = 0;
    let o = false;
    for (let s = 0; s < n.length; s++) {
      let i = n[s];
      if ((i === "-e" || i === "--expression") && s + 1 < n.length) {
        o = true;
        s++;
        continue;
      }
      if (i.startsWith("--expression=")) {
        o = true;
        continue;
      }
      if (i.startsWith("-e=")) {
        o = true;
        continue;
      }
      if (i.startsWith("-")) {
        continue;
      }
      if (r++, o) {
        return true;
      }
      if (r > 1) {
        return true;
      }
    }
    return false;
  }
  function $Dp(e) {
    let t = uE(e);
    if (t[0] !== "sed") {
      return null;
    }
    let n = t.slice(1);
    let r = [];
    for (let i = 0; i < n.length; i++) {
      let a = n[i];
      if (a === "-i" || /^-[Er]+i$/.test(a)) {
        r.push(i);
      }
    }
    if (r.length === 0) {
      return null;
    }
    if (r.length > 1) {
      return "__SED_MULTIPLE_I_FLAGS__";
    }
    let o = r[0];
    let s = n[o + 1];
    if (s === undefined) {
      return null;
    }
    if (s === "" || s.startsWith(".") || s.startsWith("-")) {
      return null;
    }
    for (let i = o + 2; i < n.length; i++) {
      let a = n[i];
      if (a === "-e" || a === "--expression") {
        return n[i + 1] ?? null;
      }
      if (a.startsWith("--expression=")) {
        return a.slice(13);
      }
      if (a.startsWith("-")) {
        continue;
      }
      return a;
    }
    return null;
  }
  function HDp(e) {
    let t = [];
    let n = uE(e);
    if (n[0] !== "sed") {
      return t;
    }
    let r = n.slice(1);
    if (r.some(o => /^-e[wWe]/.test(o) || /^-w[eE]/.test(o))) {
      throw Error("Dangerous flag combination detected");
    }
    if (r.length === 0) {
      throw Error("No sed arguments");
    }
    try {
      let o = false;
      let s = false;
      for (let i = 0; i < r.length; i++) {
        let a = r[i];
        if (typeof a !== "string") {
          continue;
        }
        if ((a === "-e" || a === "--expression") && i + 1 < r.length) {
          o = true;
          let l = r[i + 1];
          if (typeof l === "string") {
            t.push(l);
            i++;
          }
          continue;
        }
        if (a.startsWith("--expression=")) {
          o = true;
          t.push(a.slice(13));
          continue;
        }
        if (a.startsWith("-e=")) {
          o = true;
          t.push(a.slice(3));
          continue;
        }
        if (a.startsWith("-")) {
          continue;
        }
        if (!o && !s) {
          t.push(a);
          s = true;
          continue;
        }
        break;
      }
    } catch (o) {
      throw Error(`Failed to parse sed command: ${o instanceof Error ? o.message : "Unknown error"}`);
    }
    return t;
  }
  function dDa(e) {
    let t = e.trim();
    if (!t) {
      return false;
    }
    if (/[^\x01-\x7F]/.test(t)) {
      return true;
    }
    if (t.includes("{") || t.includes("}")) {
      return true;
    }
    if (t.includes(`
`) || t.includes("\r")) {
      return true;
    }
    let n = t.indexOf("#");
    if (n !== -1 && !(n > 0 && t[n - 1] === "s")) {
      return true;
    }
    if (/^!/.test(t) || /[/\d$]!/.test(t)) {
      return true;
    }
    if (/\d\s*~\s*\d|,\s*~\s*\d|\$\s*~\s*\d/.test(t)) {
      return true;
    }
    if (/^,/.test(t)) {
      return true;
    }
    if (/,\s*[+-]/.test(t)) {
      return true;
    }
    if (/s\\/.test(t) || /\\[|#%@]/.test(t)) {
      return true;
    }
    if (/\\\/.*[wW]/.test(t)) {
      return true;
    }
    if (/\/[^/]*\s+[wWeE]/.test(t)) {
      return true;
    }
    if (/^s\//.test(t) && !/^s\/[^/]*\/[^/]*\/[^/]*$/.test(t)) {
      return true;
    }
    if (/^s./.test(t) && /[wWeE]$/.test(t)) {
      if (!/^s([^\\\n]).*?\1.*?\1[^wWeE]*$/.test(t)) {
        return true;
      }
    }
    if (/^[wW]\s*\S+/.test(t) || /^\d+\s*[wW]\s*\S+/.test(t) || /^\$\s*[wW]\s*\S+/.test(t) || /^\/[^/]*\/[IMim]*\s*[wW]\s*\S+/.test(t) || /^\d+,\d+\s*[wW]\s*\S+/.test(t) || /^\d+,\$\s*[wW]\s*\S+/.test(t) || /^\/[^/]*\/[IMim]*,\/[^/]*\/[IMim]*\s*[wW]\s*\S+/.test(t)) {
      return true;
    }
    if (/^e/.test(t) || /^\d+\s*e/.test(t) || /^\$\s*e/.test(t) || /^\/[^/]*\/[IMim]*\s*e/.test(t) || /^\d+,\d+\s*e/.test(t) || /^\d+,\$\s*e/.test(t) || /^\/[^/]*\/[IMim]*,\/[^/]*\/[IMim]*\s*e/.test(t)) {
      return true;
    }
    let r = t.match(/s([^\\\n]).*?\1.*?\1(.*?)$/);
    if (r) {
      let s = r[2] || "";
      if (s.includes("w") || s.includes("W")) {
        return true;
      }
      if (s.includes("e") || s.includes("E")) {
        return true;
      }
    }
    if (t.match(/y([^\\\n])/)) {
      if (/[wWeE]/.test(t)) {
        return true;
      }
    }
    return false;
  }
  function hDa(e, t) {
    let n = Uy(e.command);
    let r;
    for (let o of n) {
      let s = gDa(o);
      if (s === null) {
        continue;
      }
      let i = t.mode === "acceptEdits";
      if (r ??= ryo(e, t), r.behavior === "ask") {
        return r;
      }
      if (!jmt(s, {
        allowFileWrites: i
      })) {
        return {
          behavior: "ask",
          message: "sed command requires approval (contains potentially dangerous operations)",
          decisionReason: {
            type: "other",
            reason: "sed command contains operations that require explicit approval (e.g., write commands, execute commands)",
            bashMissKind: "sed-dangerous"
          }
        };
      }
    }
    return {
      behavior: "passthrough",
      message: "No dangerous sed operations detected"
    };
  }
  function nyo(e) {
    return gDa(e) !== null;
  }
  function gDa(e) {
    let t = e.trim();
    if (!t) {
      return null;
    }
    let n = jDp(t);
    if (n !== null) {
      return n;
    }
    if (YG(t).split(/\s+/)[0] === "sed") {
      return Hmt(t);
    }
    return null;
  }
  function jDp(e) {
    let t = a => a.split(/\s+/)[0] === "sed" ? a : null;
    if (e.length > 1e4) {
      return t(Hmt(e));
    }
    if (VGt(e)) {
      return t(Hmt(e));
    }
    let n = _O().parse(e);
    if (!n || zGt(n)) {
      return t(Hmt(e));
    }
    let r = n.children.filter(a => a.type !== "comment");
    if (r.length !== 1 || r[0].type !== "command" && !(r[0].type === "redirected_statement" && r[0].children.some(a => a.type === "command"))) {
      return t(Hmt(e));
    }
    let o = findCommandNode(n, null);
    if (!o) {
      return null;
    }
    let s = o.children.find(a => a.type === "command_name");
    if (!s) {
      return null;
    }
    let i = Buffer.from(e, "utf8").subarray(s.startIndex).toString("utf8");
    return t(Hmt(i));
  }
  function Hmt(e) {
    let t = e.trim();
    for (;;) {
      let n = qDp(YG(t));
      if (n === t) {
        break;
      }
      t = n;
    }
    return t;
  }
  function qDp(e) {
    let t = e;
    for (;;) {
      if (t.startsWith("<<<") && t[3] !== "<" && t[3] !== "(") {
        let i = t.slice(3);
        let a = i.startsWith(" ") || i.startsWith("\t") ? i.trimStart() : i;
        if (!a) {
          return t;
        }
        let l = pDa(a);
        if (l === null) {
          return t;
        }
        t = a.slice(l).trimStart();
        continue;
      }
      let n = /^(?:\d*|&)(?:>>(?!\()|>\|(?!\()|>&(?!\()|<&(?!\()|<>(?!\()|>(?![>|&(])|<(?![<>&(]))/.exec(t);
      if (!n) {
        return t;
      }
      let r = t.slice(n[0].length);
      let o = r.startsWith(" ") || r.startsWith("\t") ? r.trimStart() : r;
      if (!o) {
        return t;
      }
      let s = pDa(o);
      if (s === null) {
        return t;
      }
      t = o.slice(s).trimStart();
    }
  }
  function pDa(e) {
    let t = 0;
    while (t < e.length) {
      let n = e[t];
      if (n === " " || n === "\t") {
        break;
      }
      if (n === "\\" && t + 1 < e.length) {
        t += 2;
        continue;
      }
      if (n === "'") {
        let r = e.indexOf("'", t + 1);
        if (r === -1) {
          return null;
        }
        t = r + 1;
        continue;
      }
      if (n === '"') {
        let r = t + 1;
        for (;;) {
          if (r >= e.length) {
            return null;
          }
          if (e[r] === "\\" && r + 1 < e.length) {
            r += 2;
            continue;
          }
          if (e[r] === '"') {
            break;
          }
          r++;
        }
        t = r + 1;
        continue;
      }
      t++;
    }
    return t;
  }
  function ryo(e, t, n) {
    let r = o => nyo(o) && !(n?.vZc(o.trim()) ?? false);
    if (e.command.length > 1e4 || VGt(e.command)) {
      return {
        behavior: "ask",
        message: "sed command requires approval (contains potentially dangerous operations)",
        decisionReason: {
          type: "other",
          reason: "sed command could not be statically validated (command is over-length or contains characters bash and the analyzer tokenize differently)",
          bashMissKind: "sed-dangerous"
        }
      };
    }
    if (yDa(e.command, r)) {
      return {
        behavior: "ask",
        message: "sed command requires approval (contains potentially dangerous operations)",
        decisionReason: {
          type: "other",
          reason: "sed command carries redirect-borne content that cannot be statically validated (swallowed arguments, unanalyzable heredoc, or expansion in a redirect target)",
          bashMissKind: "sed-dangerous"
        }
      };
    }
    return {
      behavior: "passthrough",
      message: "No redirect-borne sed risk detected"
    };
  }
  var p3n = __lazy(() => {
    noe();
    iTe();
    bU();
    VOe();
  });
  function z5e(e, t, n) {
    return {
      behavior: "ask",
      message: t,
      decisionReason: {
        type: "safetyCheck",
        reason: `Dangerous ${e} operation ${n}`,
        classifierApprovable: false
      },
      suggestions: []
    };
  }
  function f3n(e, t, n, r, o) {
    let s = qmt[e];
    let i = s(t);
    let {
      resolvedPath: a
    } = qd(zt(), n);
    let l = a === n ? [n] : [n, a];
    let c = Ro([...l, ...(r ? allWorkingDirectories(r) : [])].flatMap(u => {
      let {
        resolvedPath: d
      } = qd(zt(), u);
      return d === u ? [u] : [u, d];
    }));
    for (let u of i) {
      let d = AP(u);
      let p = JG.isAbsolute(d) ? d : JG.resolve(n, d);
      let m = p;
      for (let g = ""; g !== m;) {
        g = m;
        let y = m.replace(/([\\/]\*+)+[\\/]*$/, "") || "/";
        if (y !== m) {
          m = /[\\/]/.test(y) ? JG.normalize(y) : y;
        }
      }
      let f = m !== p;
      if (o && f && !JG.isAbsolute(d) && /[\\/]\*$/.test(p)) {
        return z5e(e, `Dangerous ${e} operation detected: '${p}'

This command changes directories before the removal, so the relative glob target cannot be statically resolved. This requires explicit approval and cannot be auto-allowed by permission rules.`, `on statically-unresolvable target: ${p}`);
      }
      let h = m;
      if (!JG.isAbsolute(d)) {
        let g = /[\\/]$/.test(n) ? n : n + JG.sep;
        if (m.startsWith(g)) {
          h = m.slice(g.length);
        } else if (m === n) {
          h = "";
        }
      }
      if (f && (I3t(d) || Up(p) || d.startsWith("~") || /^[\\/]{2}/.test(d) || !JG.isAbsolute(d) && /(^|[\\/])\.\.([\\/]|$)/.test(d) && /[\\/]\*$/.test(p) || e === "rmdir" && /[\\/]\*$/.test(p) && t.some(g => /^--p/.test(g) || /^-[a-z]*p/.test(g)) || !JG.isAbsolute(d) && /\*[\\/]+$/.test(d) && /[\\/]\*$/.test(p))) {
        return z5e(e, `Dangerous ${e} operation detected: '${p}'

This command's removal target cannot be statically resolved to a directory. This requires explicit approval and cannot be auto-allowed by permission rules.`, `on statically-unresolvable target: ${p}`);
      }
      if (!f || !/[*?[]/.test(h)) {
        let g = [m];
        if (m !== p) {
          let {
            resolvedPath: y
          } = qd(zt(), m);
          if (y !== m) {
            g.push(y);
          }
        }
        for (let y of g) {
          if (kdt(y)) {
            return z5e(e, `Dangerous ${e} operation detected: '${p}'

This command would remove a critical system directory. This requires explicit approval and cannot be auto-allowed by permission rules.`, `on critical path: ${p}`);
          }
          if ((f ? c : l).some(b => pathInWorkingPath(b, y))) {
            return z5e(e, `Dangerous ${e} operation detected: '${p}'

This command would remove a workspace directory (the working directory, an additional working directory, or one of their parent directories). This requires explicit approval and cannot be auto-allowed by permission rules.`, `on working directory or its ancestor: ${p}`);
          }
        }
      }
      if (f && /[\\/]\*$/.test(p)) {
        let g = Bn(p.split(/[\\/]+/), _ => _ && _ !== ".") - Bn(m.split(/[\\/]+/), _ => _ && _ !== ".");
        let y = Bn(h.split(/[\\/]+/), _ => /[*?[]/.test(_));
        if (g + y > 1) {
          return z5e(e, `Dangerous ${e} operation detected: '${p}'

This command's glob pattern traverses directories that cannot be statically enumerated. This requires explicit approval and cannot be auto-allowed by permission rules.`, `on statically-unresolvable target: ${p}`);
        }
      }
    }
    return {
      behavior: "passthrough",
      message: `No dangerous removals detected for ${e} command`
    };
  }
  function TDa(e) {
    if (!e.includes("$") || !/\brm(?:dir)?\b/.test(e)) {
      return null;
    }
    for (let t of Uy(e)) {
      let n = t.replace(/\\\r?\n/g, " ").replace(/`[^`]*`/g, " ").trimStart();
      while (n.startsWith("(") || n.startsWith("{")) {
        n = n.slice(1).trimStart();
      }
      for (let r = ""; r !== n;) {
        r = n;
        n = n.replace(/\$\([^()]*\)/g, " ").replace(/(?<!\$)\([^()]*\)/g, " ");
      }
      n = n.replace(/(?<![<>&])&(?![<>&])/g, ";");
      for (let r of n.split(/[;|\n\r]|&&/)) {
        let o = r.trimStart();
        let s = o.match(GDp);
        if (s === null) {
          continue;
        }
        let i = s[1] === "rmdir" ? "rmdir" : "rm";
        let a = o.slice(s[0].length).split(/\s+/);
        for (let l = 0; l < a.length; l++) {
          let c = a[l].replace(/[)\]}]+$/, "");
          if (c === "" || c.startsWith("-") || c.startsWith("'")) {
            continue;
          }
          if (/^[\d&]*[<>]/.test(c)) {
            if (/^(?:[0-9]+|&)?(?:>>?[|&]?|<<?<?|<>)$/.test(c)) {
              l++;
            }
            continue;
          }
          if (WDp.test(c)) {
            return {
              command: i,
              target: c
            };
          }
        }
      }
    }
    return null;
  }
  function Cv(e) {
    let t = [];
    let n = false;
    let r = false;
    for (let o of e) {
      if (n || r) {
        t.push(o);
      } else if (o === "--") {
        n = true;
      } else if (o === "-" || !o?.startsWith("-")) {
        t.push(o);
        r = true;
      }
    }
    return t;
  }
  function oyo(e) {
    return t => {
      let n = [];
      let r = false;
      let o = false;
      for (let s = 0; s < t.length; s++) {
        let i = t[s];
        if (i === undefined || i === null) {
          continue;
        }
        if (r || o) {
          n.push(i);
        } else if (i === "--") {
          r = true;
        } else if (i !== "-" && i.startsWith("-")) {
          if (e.vZc(i)) {
            s++;
          }
        } else {
          n.push(i);
          o = true;
        }
      }
      return n;
    };
  }
  function _Da(e, t, n = []) {
    let r = [];
    let o = false;
    let s = false;
    let i = false;
    for (let a = 0; a < e.length; a++) {
      let l = e[a];
      if (l === undefined || l === null) {
        continue;
      }
      if (!s && !i && l === "--") {
        s = true;
        continue;
      }
      if (!s && !i && l !== "-" && l.startsWith("-")) {
        let c = l.indexOf("=");
        let u = c >= 0 ? l.slice(0, c) : l;
        if (["-e", "--regexp", "-f", "--file"].includes(u)) {
          if (o = true, u === "-f" || u === "--file") {
            let d = c >= 0 ? l.slice(c + 1) : e[a + 1];
            if (d) {
              r.push(d);
            }
          }
        }
        if (t.vZc(u) && c < 0) {
          a++;
        }
        continue;
      }
      if (i && !s) {
        let c = EDa(l, ["-f", "--file"]);
        if (c !== undefined) {
          r.push(c);
        }
      }
      if (i = true, !o) {
        o = true;
        continue;
      }
      r.push(l);
    }
    return r.length > 0 ? r : n;
  }
  function EDa(e, t) {
    if (!e.startsWith("-")) {
      return;
    }
    let n = e.indexOf("=");
    if (n >= 0) {
      if (t.includes(e.slice(0, n))) {
        return e.slice(n + 1);
      }
      return;
    }
    for (let r of t) {
      if (r.length === 2 && r[0] === "-" && e.startsWith(r) && e !== r) {
        return e.slice(2);
      }
    }
    return;
  }
  function KDp(e, t, n, r, o, s) {
    let i = qmt[e];
    let a = i(t);
    let l = s ?? K5e[e];
    if (l !== "read" && a.some(d => Up(d))) {
      return {
        behavior: "ask",
        message: `${e} target contains command-substitution or untracked-variable output \u2014 the path is runtime-determined and cannot be validated`,
        decisionReason: {
          type: "other",
          reason: `${e} path argument is runtime-determined`,
          bashMissKind: "shell-expansion"
        }
      };
    }
    let c = zDp[e];
    if (c && !c(t)) {
      if (e === "cd") {
        return {
          behavior: "ask",
          message: `cd with two or more directory arguments requires manual approval. zsh's "cd OLD NEW" form substitutes OLD\u2192NEW in $PWD, producing a target path that cannot be statically validated.`,
          decisionReason: {
            type: "other",
            reason: "cd with two or more directory arguments",
            bashMissKind: "cd-multi-positional"
          }
        };
      }
      return {
        behavior: "ask",
        message: `${e} with flags requires manual approval to ensure path safety. For security, Claude Code cannot automatically validate ${e} commands that use flags, as some flags like --target-directory=PATH can bypass path validation.`,
        decisionReason: {
          type: "other",
          reason: `${e} command with flags requires manual approval`,
          bashMissKind: "flag-validation"
        }
      };
    }
    if (o && l !== "read") {
      return {
        behavior: "ask",
        message: "Commands that change directories and perform write operations require explicit approval to ensure paths are evaluated correctly. For security, Claude Code cannot automatically determine the final working directory when 'cd' is used in compound commands.",
        decisionReason: {
          type: "other",
          reason: "Compound command contains cd with write operation - manual approval required to prevent path resolution bypass",
          bashMissKind: "cd-compound-write"
        }
      };
    }
    let u;
    for (let d of a) {
      let {
        allowed: p,
        resolvedPath: m,
        decisionReason: f,
        isInWorkingDir: h
      } = P3t(d, n, r, l);
      if (!p) {
        let g = Array.from(allWorkingDirectories(r));
        let y = Aco(g);
        let _ = f?.type === "other" || f?.type === "safetyCheck" ? f.reason : `${e} in '${m}' was blocked. For security, Claude Code may only ${VDp[e]} the allowed working directories for this session: ${y}.`;
        if (f?.type === "rule") {
          return {
            behavior: "deny",
            message: _,
            decisionReason: f
          };
        }
        let b = h === true && f === undefined;
        let S = {
          behavior: "ask",
          message: _,
          blockedPath: m,
          decisionReason: f,
          bashAllowRuleOverridable: b
        };
        if (b) {
          u ??= S;
          continue;
        }
        return S;
      }
    }
    if (u) {
      return u;
    }
    return {
      behavior: "passthrough",
      message: `Path validation passed for ${e} command`
    };
  }
  function wDa(e, t) {
    return (n, r, o, s) => {
      let i = KDp(e, n, r, o, s, t);
      if (i.behavior === "deny") {
        return i;
      }
      if (e === "rm" || e === "rmdir") {
        let a = f3n(e, n, r, o, s);
        if (a.behavior !== "passthrough") {
          return a;
        }
      }
      if (i.behavior === "passthrough") {
        return i;
      }
      if (i.behavior === "ask") {
        let a = t ?? K5e[e];
        let l = [];
        if (i.blockedPath) {
          if (a === "read") {
            let u = YB(i.blockedPath);
            let d = G5e(u, "session");
            if (d) {
              l.push(d);
            }
          } else {
            l.push({
              type: "addDirectories",
              directories: [YB(i.blockedPath)],
              destination: "session"
            });
          }
        }
        let c = o.mode === "plan" && (o.prePlanMode === "auto" || o.prePlanMode === "bypassPermissions" || o.prePlanMode === "acceptEdits" || o.prePlanMode === "dontAsk");
        if ((a === "write" || a === "create") && (o.mode === "default" || o.mode === "plan") && !c) {
          l.push({
            type: "setMode",
            mode: "acceptEdits",
            destination: "session"
          });
        }
        i.suggestions = l;
      }
      return i;
    };
  }
  function YDp(e) {
    return uE(e);
  }
  function JDp(e, t, n, r) {
    let o = YG(e);
    let s = YDp(o);
    if (s.length === 0) {
      return {
        behavior: "passthrough",
        message: "Empty command - no paths to validate"
      };
    }
    let [i, ...a] = s;
    let l = CDa(i);
    if (!l || !vDa.includes(l)) {
      return {
        behavior: "passthrough",
        message: `Command '${l}' is not a path-restricted command`
      };
    }
    let c = l === "sed" && jmt(o) ? "read" : undefined;
    return wDa(l, c)(a, t, n, r);
  }
  function XDp(e, t, n, r) {
    let o = eEe(e.argv);
    if (o.length === 0) {
      return {
        behavior: "passthrough",
        message: "Empty command - no paths to validate"
      };
    }
    let [s, ...i] = o;
    let a = CDa(s);
    if (!a || !vDa.includes(a)) {
      return {
        behavior: "passthrough",
        message: `Command '${a}' is not a path-restricted command`
      };
    }
    let l = a === "sed" && jmt(YG(e.text)) ? "read" : undefined;
    return wDa(a, l)(i, t, n, r);
  }
  function CDa(e) {
    if (!e) {
      return e;
    }
    let t = e.replace(/^.*[\\/]/, "");
    return t === "rm" || t === "rmdir" ? t : e;
  }
  function QDp(e, t, n, r) {
    if (r && e.length > 0) {
      return {
        behavior: "ask",
        message: "Commands that change directories and write via output redirection require explicit approval to ensure paths are evaluated correctly. For security, Claude Code cannot automatically determine the final working directory when 'cd' is used in compound commands.",
        decisionReason: {
          type: "other",
          reason: "Compound command contains cd with output redirection - manual approval required to prevent path resolution bypass",
          bashMissKind: "cd-compound-redirect"
        }
      };
    }
    for (let {
      target: o
    } of e) {
      if (o === "/dev/null") {
        continue;
      }
      let {
        allowed: s,
        resolvedPath: i,
        decisionReason: a
      } = P3t(o, t, n, "create");
      if (!s) {
        let l = Array.from(allWorkingDirectories(n));
        let c = Aco(l);
        let u = a?.type === "other" || a?.type === "safetyCheck" ? a.reason : a?.type === "rule" ? `Output redirection to '${i}' was blocked by a deny rule.` : `Output redirection to '${i}' was blocked. For security, Claude Code may only write to files in the allowed working directories for this session: ${c}.`;
        if (a?.type === "rule") {
          return {
            behavior: "deny",
            message: u,
            decisionReason: a
          };
        }
        return {
          behavior: "ask",
          message: u,
          blockedPath: i,
          decisionReason: a,
          suggestions: [{
            type: "addDirectories",
            directories: [YB(i)],
            destination: "session"
          }]
        };
      }
    }
    return {
      behavior: "passthrough",
      message: "No unsafe redirections found"
    };
  }
  function h3n(e, t, n, r, o, s) {
    if (!s && />>\s*>\s*\(|>\s*>\s*\(|<\s*\(/.test(e.command)) {
      return {
        behavior: "ask",
        message: "Process substitution (>(...) or <(...)) can execute arbitrary commands and requires manual approval",
        decisionReason: {
          type: "other",
          reason: "Process substitution requires manual approval",
          bashMissKind: "process-substitution"
        }
      };
    }
    let i = o ? ZDp(o) : undefined;
    let {
      redirections: a,
      hasDangerousRedirection: l,
      dangerousRedirectionReason: c
    } = i ?? tpe(e.command);
    if (l) {
      let f;
      if (i !== undefined) {
        let g = [...i.denyCheckOutputRedirections, ...a];
        for (let y of g) {
          let _ = [];
          let b = AP(y.target);
          if (b !== y.target) {
            _.push({
              path: b,
              cwdIndependent: true
            });
          }
          if (!y.target.startsWith("~")) {
            _.push({
              path: JG.resolve(t, y.target),
              cwdIndependent: JG.isAbsolute(y.target)
            });
          }
          for (let S of _) {
            let E = fg(S.path);
            for (let C of E) {
              let x = matchingRuleForInput(C, n, "edit", "deny");
              if (x !== null) {
                if (S.cwdIndependent || !r) {
                  return {
                    behavior: "deny",
                    message: `Output redirection to '${C}' was blocked by a deny rule.`,
                    decisionReason: {
                      type: "rule",
                      rule: x
                    }
                  };
                }
              }
            }
            if (f === undefined || f.decisionReason?.type === "safetyCheck" && f.decisionReason.classifierApprovable) {
              let C = checkPathSafetyForAutoEdit(S.path, E);
              if (!C.safe && (f === undefined || !C.classifierApprovable)) {
                f = {
                  behavior: "ask",
                  message: C.message,
                  decisionReason: {
                    type: "safetyCheck",
                    reason: C.message,
                    classifierApprovable: C.classifierApprovable
                  }
                };
              }
            }
          }
        }
      }
      if (f !== undefined) {
        return f;
      }
      let h = c === "network_device" ? "Redirect involving /dev/tcp or /dev/udp opens a network connection" : c === "unc_path" ? "Redirect target is a Windows UNC path \u2014 opening it triggers an SMB connection" : "Shell expansion syntax in paths requires manual approval";
      return {
        behavior: "ask",
        message: h,
        decisionReason: {
          type: "other",
          reason: h,
          bashMissKind: c === "network_device" || c === "unc_path" ? "net-redirect" : "shell-expansion"
        }
      };
    }
    let u;
    function d(f) {
      if (f.behavior === "deny") {
        return f;
      }
      if (f.behavior === "ask") {
        if (f.bashAllowRuleOverridable) {
          u ??= f;
          return;
        }
        return f;
      }
      return;
    }
    let p = QDp(a, t, n, r);
    let m = d(p);
    if (m) {
      return m;
    }
    if (s) {
      for (let f of s) {
        let h = d(XDp(f, t, n, r));
        if (h) {
          return h;
        }
      }
    } else {
      let f = Uy(e.command);
      for (let h of f) {
        let g = d(JDp(h, t, n, r));
        if (g) {
          return g;
        }
      }
    }
    if (u) {
      return u;
    }
    return {
      behavior: "passthrough",
      message: "All path commands validated successfully"
    };
  }
  function ZDp(e) {
    let t = [];
    let n = [];
    let r = false;
    let o;
    for (let s of e) {
      if (/^\/dev\/(tcp|udp)\//.test(s.target)) {
        r = true;
        o = "network_device";
        continue;
      }
      if (HI(s.target.replace(/\\/g, "/"), true)) {
        if (r = true, o !== "network_device") {
          o = "unc_path";
        }
        continue;
      }
      if ((s.op === ">" || s.op === ">|" || s.op === "&>" || s.op === ">>" || s.op === "&>>" || s.op === ">&") && (s.target.startsWith("~") || Oae(s.target) !== -1)) {
        if (r = true, o !== "network_device" && o !== "unc_path") {
          o = "shell_expansion";
        }
        n.push({
          target: s.target,
          operator: s.op === ">>" || s.op === "&>>" ? ">>" : ">"
        });
        continue;
      }
      switch (s.op) {
        case ">":
        case ">|":
        case "&>":
          t.push({
            target: s.target,
            operator: ">"
          });
          break;
        case ">>":
        case "&>>":
          t.push({
            target: s.target,
            operator: ">>"
          });
          break;
        case ">&":
          if (!/^\d+$/.test(s.target)) {
            t.push({
              target: s.target,
              operator: ">"
            });
          }
          break;
        case "<":
        case "<&":
        case "<<":
        case "<<<":
          break;
      }
    }
    return {
      redirections: t,
      hasDangerousRedirection: r,
      dangerousRedirectionReason: o,
      denyCheckOutputRedirections: n
    };
  }
  function eMp(e) {
    let t = 1;
    while (t < e.length) {
      let n = e[t];
      let r = e[t + 1];
      if (n === "--foreground" || n === "--preserve-status" || n === "--verbose") {
        t++;
      } else if (/^--(?:kill-after|signal)=[A-Za-z0-9_.+-]+$/.test(n)) {
        t++;
      } else if ((n === "--kill-after" || n === "--signal") && r && bDa.test(r)) {
        t += 2;
      } else if (n === "--") {
        t++;
        break;
      } else if (n.startsWith("--")) {
        return -1;
      } else if (n === "-v") {
        t++;
      } else if ((n === "-k" || n === "-s") && r && bDa.test(r)) {
        t += 2;
      } else if (/^-[ks][A-Za-z0-9_.+-]+$/.test(n)) {
        t++;
      } else if (n.startsWith("-")) {
        return -1;
      } else {
        break;
      }
    }
    return t;
  }
  function tMp(e) {
    let t = 1;
    while (t < e.length) {
      let n = e[t];
      if (/^-[ioe]$/.test(n) && e[t + 1]) {
        t += 2;
      } else if (/^-[ioe]./.test(n)) {
        t++;
      } else if (/^--(input|output|error)=/.test(n)) {
        t++;
      } else if (n.startsWith("-")) {
        return -1;
      } else {
        break;
      }
    }
    return t > 1 && t < e.length ? t : -1;
  }
  function nMp(e) {
    let t = 1;
    while (t < e.length) {
      let n = e[t];
      if (n.includes("=") && !n.startsWith("-")) {
        t++;
      } else if (n === "-i" || n === "-0" || n === "-v") {
        t++;
      } else if (n === "-u" && e[t + 1]) {
        t += 2;
      } else if (n.startsWith("-")) {
        return -1;
      } else {
        break;
      }
    }
    return t < e.length ? t : -1;
  }
  function eEe(e) {
    let t = e;
    for (;;) {
      let n = t[0]?.replace(/^.*[\\/]/, "");
      let r = n === "time" || n === "nohup" || n === "timeout" || n === "nice" || n === "stdbuf" || n === "env" || n === "command" ? n : t[0];
      if (r === "time" || r === "nohup") {
        t = t.slice(t[1] === "--" ? 2 : 1);
      } else if (r === "timeout") {
        let o = eMp(t);
        if (o < 0 || !t[o] || !/^\d+(?:\.\d+)?[smhd]?$/.test(t[o])) {
          return t;
        }
        t = t.slice(o + 1);
      } else if (r === "nice") {
        if (t[1] === "-n" && t[2] && /^-?\d+$/.test(t[2])) {
          t = t.slice(t[3] === "--" ? 4 : 3);
        } else if (t[1] && /^-\d+$/.test(t[1])) {
          t = t.slice(t[2] === "--" ? 3 : 2);
        } else {
          t = t.slice(t[1] === "--" ? 2 : 1);
        }
      } else if (r === "stdbuf") {
        let o = tMp(t);
        if (o < 0) {
          return t;
        }
        t = t.slice(o);
      } else if (r === "env") {
        let o = nMp(t);
        if (o < 0) {
          return t;
        }
        t = t.slice(o);
      } else if (r === "command") {
        let o = 1;
        while (t[o] !== undefined && /^-p+$/.test(t[o])) {
          o++;
        }
        if (t[o] === "--") {
          o++;
        }
        if (o >= t.length || t[o].startsWith("-")) {
          return t;
        }
        t = t.slice(o);
      } else if (t[0] === "builtin") {
        let o = t[1] === "--" ? 2 : 1;
        if (o >= t.length) {
          return t;
        }
        t = t.slice(o);
      } else if (t[0] === "noglob") {
        if (t.length <= 1) {
          return t;
        }
        t = t.slice(1);
      } else {
        return t;
      }
    }
  }
  var SDa;
  var JG;
  var WDp;
  var GDp;
  var qmt;
  var vDa;
  var VDp;
  var K5e;
  var zDp;
  var bDa;
  var syo = __lazy(() => {
    noe();
    bU();
    ku();
    wm();
    Zk();
    mde();
    pde();
    p3n();
    SDa = require("os");
    JG = require("path");
    WDp = /^"?\$(?:\{[A-Za-z_][A-Za-z0-9_]*\}|[A-Za-z_][A-Za-z0-9_]*)"?\/(?:\*|\$|\/|["']|$)/;
    GDp = /^(?:[A-Za-z_][A-Za-z0-9_]*\+?=[^\s]*\s+)*\\?(?:[^\s=]*\/)?(rm|rmdir)(?:\s|$)/;
    qmt = {
      cd: e => {
        let t = Cv(e);
        if (t.length === 0) {
          return e.at(-1) === "-" ? ["-"] : [SDa.homedir()];
        }
        return [t[0]];
      },
      ls: e => {
        let t = Cv(e);
        return t.length > 0 ? t : ["."];
      },
      find: e => {
        let t = [];
        let n = new Set(["-newer", "-anewer", "-cnewer", "-mnewer", "-samefile", "-path", "-wholename", "-ilname", "-lname", "-ipath", "-iwholename"]);
        let r = /^-newer[acmBt][acmtB]$/;
        let o = false;
        let s = false;
        for (let i = 0; i < e.length; i++) {
          let a = e[i];
          if (!a) {
            continue;
          }
          if (s) {
            t.push(a);
            continue;
          }
          if (a === "--") {
            s = true;
            continue;
          }
          if (a.startsWith("-")) {
            if (["-H", "-L", "-P"].includes(a)) {
              continue;
            }
            if (o = true, n.vZc(a) || r.test(a)) {
              let l = e[i + 1];
              if (l) {
                t.push(l);
                i++;
              }
            }
            continue;
          }
          if (!o) {
            t.push(a);
          }
        }
        return t.length > 0 ? t : ["."];
      },
      mkdir: Cv,
      touch: Cv,
      rm: Cv,
      rmdir: Cv,
      mv: Cv,
      cp: Cv,
      cat: Cv,
      head: Cv,
      tail: Cv,
      sort: Cv,
      uniq: Cv,
      wc: Cv,
      cut: oyo(new Set(["-d", "--delimiter", "-f", "--fields", "-b", "--bytes", "-c", "--characters", "--output-delimiter"])),
      paste: oyo(new Set(["-d", "--delimiters"])),
      column: oyo(new Set(["-s", "--separator", "-o", "--output-separator", "-c", "--output-width"])),
      file: Cv,
      stat: Cv,
      diff: Cv,
      awk: e => {
        let t = new Set(["-F", "--field-separator", "-v", "--assign", "-e", "--source"]);
        let n = new Set(["-f", "--file", "-E", "--exec"]);
        let r = [];
        let o = false;
        let s = false;
        let i = false;
        for (let a = 0; a < e.length; a++) {
          let l = e[a];
          if (l === undefined || l === null) {
            continue;
          }
          if (!o && !i && l === "--") {
            o = true;
            continue;
          }
          if (!o && !i && l !== "-" && l.startsWith("-")) {
            let c = l.indexOf("=");
            let u = c >= 0 ? l.slice(0, c) : l;
            if (t.vZc(u)) {
              if (u === "-e" || u === "--source") {
                s = true;
              }
              if (c < 0) {
                a++;
              }
              continue;
            }
            if (n.vZc(u)) {
              if (s = true, c >= 0) {
                r.push(l.slice(c + 1));
              } else {
                let d = e[a + 1];
                if (d !== undefined) {
                  r.push(d);
                  a++;
                }
              }
              continue;
            }
            continue;
          }
          if (i && !o) {
            let c = EDa(l, ["-f", "--file", "-E", "--exec"]);
            if (c !== undefined) {
              r.push(c);
            }
          }
          if (i = true, !s) {
            s = true;
            continue;
          }
          r.push(l);
        }
        return r;
      },
      strings: Cv,
      hexdump: Cv,
      od: Cv,
      base64: Cv,
      nl: Cv,
      sha256sum: Cv,
      sha1sum: Cv,
      md5sum: Cv,
      tr: e => {
        let t = e.some(r => r === "-d" || r === "--delete" || r.startsWith("-") && r.includes("d"));
        return Cv(e).slice(t ? 1 : 2);
      },
      grep: e => {
        let n = _Da(e, new Set(["-e", "--regexp", "-f", "--file", "--exclude", "--include", "--exclude-dir", "--include-dir", "-m", "--max-count", "-A", "--after-context", "-B", "--before-context", "-C", "--context"]));
        if (n.length === 0 && e.some(r => ["-r", "-R", "--recursive"].includes(r))) {
          return ["."];
        }
        return n;
      },
      rg: e => _Da(e, new Set(["-e", "--regexp", "-f", "--file", "-t", "--type", "-T", "--type-not", "-g", "--glob", "-m", "--max-count", "--max-depth", "-r", "--replace", "-A", "--after-context", "-B", "--before-context", "-C", "--context"]), ["."]),
      sed: e => {
        let t = [];
        let n = false;
        let r = false;
        let o = false;
        let s = false;
        for (let i = 0; i < e.length; i++) {
          if (n) {
            n = false;
            continue;
          }
          let a = e[i];
          if (!a) {
            continue;
          }
          if (!o && !s && a === "--") {
            o = true;
            continue;
          }
          if (!o && !s && a !== "-" && a.startsWith("-")) {
            if (["-f", "--file"].includes(a)) {
              let l = e[i + 1];
              if (l) {
                t.push(l);
                n = true;
              }
              r = true;
            } else if (["-e", "--expression"].includes(a)) {
              n = true;
              r = true;
            } else if (a.includes("e") || a.includes("f")) {
              r = true;
            }
            continue;
          }
          if (s = true, !r) {
            r = true;
            continue;
          }
          t.push(a);
        }
        return t;
      },
      jq: e => {
        let t = [];
        let n = new Set(["-e", "--expression", "--arg", "--argjson", "--args", "--jsonargs", "-L", "--library-path", "--indent", "--tab"]);
        let r = false;
        let o = false;
        for (let s = 0; s < e.length; s++) {
          let i = e[s];
          if (i === undefined || i === null) {
            continue;
          }
          if (!o && i === "--") {
            o = true;
            continue;
          }
          if (!o && i.startsWith("-")) {
            let a = i.indexOf("=");
            let l = a >= 0 ? i.slice(0, a) : i;
            if (["-e", "--expression"].includes(l)) {
              r = true;
            }
            if (["-f", "--from-file"].includes(l)) {
              if (r = true, a >= 0) {
                t.push(i.slice(a + 1));
              } else {
                let c = e[s + 1];
                if (c !== undefined) {
                  t.push(c);
                  s++;
                }
              }
              continue;
            }
            if (["--slurpfile", "--rawfile"].includes(l)) {
              let c = e[s + 2];
              if (c !== undefined) {
                t.push(c);
              }
              s += 2;
              continue;
            }
            if (n.vZc(l) && a < 0) {
              s++;
            }
            continue;
          }
          if (!r) {
            r = true;
            continue;
          }
          t.push(i);
        }
        return t;
      },
      git: e => {
        if (e.length >= 1 && e[0] === "diff") {
          if (e.includes("--no-index")) {
            return Cv(e.slice(1));
          }
        }
        return [];
      }
    };
    vDa = Object.keys(qmt);
    VDp = {
      cd: "change directories to",
      ls: "list files in",
      find: "search files in",
      mkdir: "create directories in",
      touch: "create or modify files in",
      rm: "remove files from",
      rmdir: "remove directories from",
      mv: "move files to/from",
      cp: "copy files to/from",
      cat: "concatenate files from",
      head: "read the beginning of files from",
      tail: "read the end of files from",
      sort: "sort contents of files from",
      uniq: "filter duplicate lines from files in",
      wc: "count lines/words/bytes in files from",
      cut: "extract columns from files in",
      paste: "merge files from",
      column: "format files from",
      tr: "transform text from files in",
      file: "examine file types in",
      stat: "read file stats from",
      diff: "compare files from",
      awk: "process text from files in",
      strings: "extract strings from files in",
      hexdump: "display hex dump of files from",
      od: "display octal dump of files from",
      base64: "encode/decode files from",
      nl: "number lines in files from",
      grep: "search for patterns in files from",
      rg: "search for patterns in files from",
      sed: "edit files in",
      git: "access files with git from",
      jq: "process JSON from files in",
      sha256sum: "compute SHA-256 checksums for files in",
      sha1sum: "compute SHA-1 checksums for files in",
      md5sum: "compute MD5 checksums for files in"
    };
    K5e = {
      cd: "read",
      ls: "read",
      find: "read",
      mkdir: "create",
      touch: "create",
      rm: "write",
      rmdir: "write",
      mv: "write",
      cp: "write",
      cat: "read",
      head: "read",
      tail: "read",
      sort: "read",
      uniq: "read",
      wc: "read",
      cut: "read",
      paste: "read",
      column: "read",
      tr: "read",
      file: "read",
      stat: "read",
      diff: "read",
      awk: "read",
      strings: "read",
      hexdump: "read",
      od: "read",
      base64: "read",
      nl: "read",
      grep: "read",
      rg: "read",
      sed: "write",
      git: "read",
      jq: "read",
      sha256sum: "read",
      sha1sum: "read",
      md5sum: "read"
    };
    zDp = {
      mv: e => !e.some(t => t?.startsWith("-")),
      cp: e => !e.some(t => t?.startsWith("-")),
      cd: e => {
        let t = false;
        let n = 0;
        for (let r of e) {
          if (!t) {
            if (r === "--") {
              t = true;
              continue;
            }
            if (r.startsWith("-") && r !== "-") {
              continue;
            }
            t = true;
          }
          n++;
        }
        return n <= 1;
      }
    };
    bDa = /^[A-Za-z0-9_.+-]+$/;
  });
  function oMp() {
    let e = rMp;
    if (Wt() === "windows") {
      let {
        xargs: t,
        ...n
      } = e;
      e = n;
    }
    return e;
  }
  function iMp(e) {
    let t = uE(e);
    if (t.length === 0) {
      return false;
    }
    let n;
    let r = 0;
    let o = oMp();
    for (let [s] of Object.entries(o)) {
      let i = s.split(" ");
      if (t.length >= i.length) {
        let a = true;
        for (let l = 0; l < i.length; l++) {
          if (t[l] !== i[l]) {
            a = false;
            break;
          }
        }
        if (a) {
          n = o[s];
          r = i.length;
          break;
        }
      }
    }
    if (!n) {
      return false;
    }
    if (t[0] === "git" && t[1] === "ls-remote") {
      if (t.some(i => i === "-o" || i === "--server-option" || i.startsWith("--server-option="))) {
        return false;
      }
      let s = false;
      for (let i = 2; i < t.length; i++) {
        let a = t[i];
        if (!a) {
          continue;
        }
        if (!s && a === "--") {
          s = true;
          continue;
        }
        if (s || a === "-" || !a.startsWith("-")) {
          return false;
        }
      }
    }
    for (let s = r; s < t.length; s++) {
      let i = t[s];
      if (!i) {
        continue;
      }
      if (i.includes("$")) {
        return false;
      }
      if (i.includes("{") && (i.includes(",") || i.includes(".."))) {
        return false;
      }
    }
    if (!Rdt(t, r, n, {
      commandName: t[0],
      rawCommand: e,
      xargsTargetCommands: t[0] === "xargs" ? sMp : undefined
    })) {
      return false;
    }
    if (n.regex && !n.regex.test(e)) {
      return false;
    }
    if (!n.regex && /`/.test(e)) {
      return false;
    }
    if (!n.regex && (t[0] === "rg" || t[0] === "grep" || t[0] === "egrep" || t[0] === "fgrep") && /[\n\r]/.test(e)) {
      return false;
    }
    if (n.additionalCommandIsDangerousCallback && n.additionalCommandIsDangerousCallback(e, t.slice(r))) {
      return false;
    }
    return true;
  }
  function aMp(e) {
    return new RegExp(`^${e}(?:\\s|$)[^<>()$\`|{}&;\\n\\r]*$`);
  }
  function fMp(e) {
    if (e.length === 0) {
      return false;
    }
    let t = e[0];
    if (pMp.vZc(t)) {
      return e.length === 1;
    }
    for (let r of mMp) {
      if (e.length === r.length && e.every((o, s) => o === r[s])) {
        return true;
      }
    }
    if (lMp.vZc(t)) {
      return true;
    }
    for (let r of cMp) {
      let o = r.split(" ");
      if (e.length >= o.length && o.every((s, i) => e[i] === s)) {
        if (o[0] === "docker" && (T2n(e) || e.slice(o.length).some(Up))) {
          return false;
        }
        return true;
      }
    }
    if (t === "echo") {
      return true;
    }
    let n = /^[-+]?(0[xX][0-9a-fA-F]+|[0-9]+#[0-9a-zA-Z]+|[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?)$/;
    if (t === "printf") {
      if (e[1]?.startsWith("-") && e[1] !== "--") {
        return false;
      }
      let r = e[1] === "--" ? 2 : 1;
      let o = e[r] ?? "";
      if (Up(o)) {
        return false;
      }
      if (o.includes("$")) {
        return false;
      }
      let s = o.replace(/%%/g, "");
      if (/%[^%a-zA-Z]*(?:hh|ll|[lLhqjzZt])?\\[0-7xX]/.test(s) || /\\[uU]/.test(s)) {
        return false;
      }
      if (/%[-+ 0#']*[0-9.*]*(?:hh|ll|[lLhqjzZt])?[diouxXeEfFgGaAn]/.test(s) || /%[^%a-zA-Z]*\*/.test(s)) {
        for (let i = r + 1; i < e.length; i++) {
          let a = e[i];
          if (a.includes("[") || a.includes("`") || a.includes("$(") || Up(a) || !n.test(a)) {
            return false;
          }
        }
      }
      return true;
    }
    if (t === "[[") {
      for (let r = 1; r < e.length; r++) {
        let o = e[r];
        let s = e[r + 1];
        if ((o === "-v" || o === "-R" || o === "-t") && s !== undefined && (s.includes("[") || Up(s))) {
          return false;
        }
        if (o === "-t" && s !== undefined && !m9e.test(s)) {
          return false;
        }
        if (Cdt.vZc(o)) {
          for (let i of [e[r - 1], e[r + 1]]) {
            if (i !== undefined && (i.includes("[") || !m9e.test(i))) {
              return false;
            }
          }
        }
      }
      return true;
    }
    if (t === "ls") {
      return true;
    }
    if (t === "cd") {
      return e.length <= 2;
    }
    if (t === "find") {
      for (let r = 1; r < e.length; r++) {
        let o = e[r];
        if (uMp.vZc(o)) {
          return false;
        }
        if (v3t.vZc(o) || w3t.test(o)) {
          r++;
          continue;
        }
        if (Up(o)) {
          return false;
        }
      }
      return true;
    }
    if (t === "history") {
      return e.length === 1 || e.length === 2 && /^\d+$/.test(e[1]);
    }
    if (t === "arch") {
      return e.length === 1 || e.length === 2 && (e[1] === "-h" || e[1] === "--help");
    }
    if (t === "ifconfig") {
      return e.length === 1 || e.length === 2 && /^[a-zA-Z]/.test(e[1]);
    }
    return null;
  }
  function lyo(e) {
    let t = false;
    let n = false;
    let r = false;
    let o = false;
    let s = false;
    let i = false;
    let a = true;
    for (let l = 0; l < e.length; l++) {
      let c = e[l];
      if (o) {
        o = false;
        a = false;
        continue;
      }
      if (c === "\\" && !t) {
        if (e[l + 1] === `
`) {
          l++;
          continue;
        }
        o = true;
        continue;
      }
      if (r) {
        if (c === "`") {
          r = false;
          a = false;
        }
        continue;
      }
      if (c === "`" && !t) {
        r = true;
        a = false;
        continue;
      }
      if (c === "#" && a && !t && !n) {
        while (l < e.length && e[l] !== `
`) {
          l++;
        }
        a = true;
        continue;
      }
      if (c === "'" && !n) {
        t = !t;
        a = false;
        continue;
      }
      if (c === '"' && !t) {
        n = !n;
        a = false;
        continue;
      }
      if (t) {
        continue;
      }
      if (c === "$") {
        let u = e[l + 1];
        if (u && /[A-Za-z_@*#?!$0-9-]/.test(u)) {
          return "variable";
        }
      }
      if (n) {
        continue;
      }
      if (c === " " || c === "\t" || c === `
` || c === "|" || c === "&" || c === ";" || c === "(" || c === ")" || c === "<" || c === ">") {
        i = false;
        a = true;
        continue;
      }
      if (a = false, c === "?" || c === "*") {
        s = true;
        continue;
      }
      if (c === "[") {
        i = true;
        continue;
      }
      if (c === "]" && i) {
        s = true;
      }
    }
    return s ? "glob" : false;
  }
  function yMp(e) {
    let t = e.trim();
    if (t.endsWith(" 2>&1")) {
      t = t.slice(0, -5).trim();
    }
    if (HI(t)) {
      return false;
    }
    if (lyo(t) === "variable") {
      return false;
    }
    if (iMp(t)) {
      return true;
    }
    for (let n of hMp) {
      if (n.test(t)) {
        if (t.startsWith("find")) {
          let r = t.replace(/['"\\]/g, "");
          if (/-delete\b|-exec\b|-execdir\b|-ok\b|-okdir\b|-fprint0?\b|-fls\b|-fprintf\b|-files0-from\b/.test(r)) {
            return false;
          }
        }
        if (t.includes("git") && /\s-c[\s=]/.test(t)) {
          return false;
        }
        if (t.includes("git") && /\s--exec-path[\s=]/.test(t)) {
          return false;
        }
        if (t.includes("git") && /\s--config-env[\s=]/.test(t)) {
          return false;
        }
        return true;
      }
    }
    return false;
  }
  function ayo(e) {
    let t = Rh.posix.normalize(e.replace(/\/+/g, "/"));
    t = t.replace(/^\.?\//, "").toLowerCase().replace(/\u0131/g, "i").replace(/\u017f/g, "s");
    return kDa.some(n => n.test(t));
  }
  function _Mp(e) {
    let t = eEe(uE(e));
    if (t.length === 0) {
      return [];
    }
    let n = t[0]?.replace(/[\\'"]/g, "");
    if (!n) {
      return [];
    }
    if (!(n in K5e)) {
      return [];
    }
    let r = K5e[n];
    if (r !== "write" && r !== "create" || ADa.vZc(n)) {
      return [];
    }
    let o = qmt[n];
    if (!o) {
      return [];
    }
    return o(t.slice(1));
  }
  function KGt(e) {
    let t = Uy(e);
    for (let r of t) {
      let o = r.trim();
      let s = _Mp(o);
      let a = eEe(uE(o))[0]?.replace(/[\\'"]/g, "");
      let l = a === "cp" || a === "mv";
      let c = s.at(-1);
      let u = c !== undefined && (c === "." || c === "./" || c === "" || /^(?:\.\.\/)*\.\.\/?$/.test(c));
      for (let d of s) {
        if (ayo(d)) {
          return true;
        }
        if (l && u && d !== c) {
          let p = d.replace(/\/+$/, "").split("/").pop() ?? "";
          if (ayo(p)) {
            return true;
          }
        }
      }
    }
    let {
      redirections: n
    } = tpe(e);
    for (let {
      target: r
    } of n) {
      if (ayo(r)) {
        return true;
      }
    }
    return false;
  }
  function IDa(e, t) {
    return Qwr(t) ? t : Fae(e, t) ?? t;
  }
  function g3n(e, t) {
    if (e === "") {
      return false;
    }
    if (e.startsWith("~")) {
      let n = AP(e);
      if (n.startsWith("~")) {
        return true;
      }
      return Wmt(n, t) || Wmt(e, t);
    }
    return Wmt(e, t);
  }
  function Wmt(e, t) {
    let n = zt();
    if ((!Qwr(e) || true) && !zS(e) && /(^|[/\\])\.\.(?:[/\\]|$)/.test(e)) {
      let p = /\/+/;
      let m = Rh.isAbsolute(e) ? Rh.parse(e).root : "";
      let f = m ? Rh.parse(Rh.resolve(t, e)).root : t;
      let h = (m ? e.slice(m.length) : e).split(p);
      let g = f;
      for (let y = 0; y < h.length; y++) {
        let _ = h[y];
        if (_ === "" || _ === ".") {
          continue;
        }
        if (_ === "..") {
          g = Rh.dirname(g);
          continue;
        }
        if (g = g.endsWith(Rh.sep) ? g + _ : g + Rh.sep + _, zS(g)) {
          break;
        }
        try {
          if (n.lstatSync(g).isSymbolicLink() && h.slice(y + 1).includes("..")) {
            return true;
          }
        } catch {}
      }
    }
    let r = Rh.resolve(t, e);
    let o = IDa(n, r).normalize("NFC");
    let s = (Fae(n, t) ?? t).normalize("NFC");
    function i(p) {
      let m = Rh.relative(p, o);
      if (m === "" || m.startsWith(".." + Rh.sep) || Rh.isAbsolute(m)) {
        return false;
      }
      let f = m.split(Rh.sep).join("/").toLowerCase().replace(/\u0131/g, "i").replace(/\u017f/g, "s");
      return kDa.some(h => h.test(f));
    }
    if (i(s)) {
      return true;
    }
    if (!Rh.relative(s, o).startsWith(".." + Rh.sep)) {
      return false;
    }
    let l = getOriginalCwd();
    let c = (Fae(n, l) ?? l).normalize("NFC");
    let u = Rh.relative(c, o);
    if (u === "" || u.startsWith(".." + Rh.sep) || Rh.isAbsolute(u)) {
      return false;
    }
    let d = s;
    do {
      if (d = Rh.dirname(d), i(d)) {
        return true;
      }
    } while (d !== c && d !== Rh.dirname(d));
    return false;
  }
  function SMp(e, t) {
    if (g3n(e, t)) {
      return true;
    }
    for (let n = 1; n < e.length; n++) {
      let r = e[n];
      let o = e[n - 1];
      if ((r === "/" || r === Rh.sep) && o !== "/" && o !== Rh.sep) {
        if (g3n(e.slice(0, n), t)) {
          return true;
        }
      }
    }
    return false;
  }
  function TMp(e, t) {
    let n = e.toLowerCase();
    if (n === t.toLowerCase()) {
      return true;
    }
    let r = zt();
    let o = (Fae(r, getOriginalCwd()) ?? getOriginalCwd()).normalize("NFC");
    let s = Rh.relative(o, t);
    if (s === ".." || s.startsWith(".." + Rh.sep) || Rh.isAbsolute(s)) {
      return false;
    }
    let i = t;
    for (;;) {
      if (i.toLowerCase() === n) {
        return true;
      }
      if (i === o || i === Rh.dirname(i)) {
        return false;
      }
      i = Rh.dirname(i);
    }
  }
  function y3n(e, t) {
    for (let n of e) {
      if (!n) {
        continue;
      }
      for (let l of n.redirects) {
        if (bMp.vZc(l.op)) {
          continue;
        }
        if (Up(l.target)) {
          return true;
        }
        if (g3n(l.target, t)) {
          return true;
        }
      }
      let r = eEe(n.argv);
      let o = r[0];
      if (o !== undefined && Up(o)) {
        return true;
      }
      if (!o || !(o in K5e)) {
        continue;
      }
      let s = K5e[o];
      if (s !== "write" && s !== "create" || ADa.vZc(o)) {
        continue;
      }
      let i = qmt[o](r.slice(1));
      let a = o === "mkdir" && r.slice(1).some(l => /^-[^-]*p/.test(l) || l.startsWith("--p") && "--parents".startsWith(l));
      for (let l of i) {
        if (Up(l)) {
          return true;
        }
        if (a ? SMp(l, t) : g3n(l, t)) {
          return true;
        }
      }
      if ((o === "cp" || o === "mv") && i.length >= 1) {
        let l = r.slice(1);
        let c = l.some(p => {
          if (/^-[^-]*t/.test(p)) {
            return true;
          }
          let m = p.indexOf("=");
          let f = m >= 0 ? p.slice(0, m) : p;
          return f.startsWith("--t") && "--target-directory".startsWith(f);
        });
        let u = l.some(p => /^-[^-]*T/.test(p) || p.startsWith("--n") && "--no-target-directory".startsWith(p));
        let d = false;
        if (!c && i.length >= 2) {
          let p = i.at(-1);
          let m = [p];
          if (p.startsWith("~")) {
            let f = AP(p);
            if (f.startsWith("~")) {
              d = true;
            } else {
              m.push(f);
            }
          }
          if (!d) {
            let f = zt();
            let h = (Fae(f, t) ?? t).normalize("NFC");
            for (let g of m) {
              let y = Rh.resolve(t, g);
              let _ = IDa(f, y).normalize("NFC");
              if (TMp(_, h)) {
                d = true;
                break;
              }
            }
          }
        }
        if (c || d) {
          let p = c ? i : i.slice(0, -1);
          if (u) {
            return true;
          }
          for (let m of p) {
            if (Oae(m) !== -1 || Up(m)) {
              return true;
            }
            let f = Rh.basename(m);
            if (f === "." || f === "..") {
              return true;
            }
            if (m.startsWith("~")) {
              let h = AP(m);
              if (h.startsWith("~")) {
                return true;
              }
              if (Wmt(Rh.basename(h), t) || Wmt(f, t)) {
                return true;
              }
            } else if (Wmt(f, t)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  function vMp(e) {
    let t = e.slice();
    for (;;) {
      if (t[0] === "command") {
        let n = 1;
        while (t[n] !== undefined && /^-p+$/.test(t[n])) {
          n++;
        }
        if (t[n] === "--") {
          n++;
        }
        if (n >= t.length || t[n].startsWith("-")) {
          return t;
        }
        t = t.slice(n);
      } else if (t[0] === "builtin") {
        let n = t[1] === "--" ? 2 : 1;
        if (n >= t.length) {
          return t;
        }
        t = t.slice(n);
      } else if (t[0] === "noglob") {
        if (t.length <= 1) {
          return t;
        }
        t = t.slice(1);
      } else {
        return t;
      }
    }
  }
  function wMp(e) {
    let t = e;
    while (xDa.test(t)) {
      t = t.replace(xDa, "");
    }
    return t;
  }
  function PDa(e) {
    if (e.type === "subshell" || e.type === "compound_statement") {
      return true;
    }
    for (let t of e.children) {
      if (t && PDa(t)) {
        return true;
      }
    }
    return false;
  }
  function ODa(e) {
    if (!CMp.vZc(e.type)) {
      return false;
    }
    for (let t of e.children) {
      if (!t) {
        continue;
      }
      if (t.type === "&") {
        return true;
      }
      if (ODa(t)) {
        return true;
      }
    }
    return false;
  }
  function DDa(e, t) {
    let {
      command: n
    } = e;
    let r = _O().parse(n);
    let o = r ? f9e(n, r) : {
      kind: "simple",
      commands: [],
      bareAssignmentNames: []
    };
    if (o.kind === "too-complex") {
      return {
        behavior: "passthrough",
        message: `Not a simple read-only command: ${o.reason}`
      };
    }
    if (r && PDa(r)) {
      return {
        behavior: "passthrough",
        message: "Not a simple read-only command: contains a subshell"
      };
    }
    if (r && ODa(r)) {
      return {
        behavior: "passthrough",
        message: "Not a simple read-only command: `&` defers execution past approval-time checks"
      };
    }
    let s = uGt();
    if (o.bareAssignmentNames.some(d => !tEe(d) && (s === null || s.vZc(d)))) {
      return {
        behavior: "passthrough",
        message: "Bare assignment to a non-allowlisted environment variable can alter behavior of subsequent commands"
      };
    }
    let i = lyo(n);
    if (i === "variable") {
      return {
        behavior: "passthrough",
        message: "Command contains unquoted variable expansion"
      };
    }
    if (HI(n)) {
      return {
        behavior: "ask",
        message: "Command contains Windows UNC path that could be vulnerable to WebDAV attacks"
      };
    }
    let a = o.commands.some(d => Y5e(d.text));
    if ((t || o.commands.some(d => npe(d.text))) && a) {
      return {
        behavior: "passthrough",
        message: "Compound commands with cd and git require permission checks for enhanced security"
      };
    }
    let c = a && isCurrentDirectoryBareGitRepo();
    if (c) {
      return {
        behavior: "passthrough",
        message: c === "bare-indicators" ? "The current directory has bare-repo indicators (HEAD/objects/refs outside a .git/ directory). Git may treat it as a git dir and run config/hooks from here, so git commands need approval." : "The .git file or symlink here redirects to a location Claude cannot verify is safe (it may have been planted by an untrusted archive). Git commands need approval."
      };
    }
    if (a && KGt(n)) {
      return {
        behavior: "passthrough",
        message: "Compound commands that create git internal files and run git require permission checks for enhanced security"
      };
    }
    if (a && SandboxManager.isSandboxingEnabled() && Nt() !== getOriginalCwd()) {
      return {
        behavior: "passthrough",
        message: "Git commands outside the original working directory require permission checks when sandbox is enabled"
      };
    }
    if (o.commands.length > 0 && o.commands.every(d => {
      if (d.redirects.some(f => !EMp.vZc(f.op) && f.target !== "/dev/null" && !(f.op === ">&" && /^\d+$/.test(f.target)))) {
        return false;
      }
      if (d.redirects.some(f => /^\/dev\/(tcp|udp)\//.test(f.target))) {
        return false;
      }
      if (d.redirects.some(f => f.op === "<" && HI(f.target, true))) {
        return false;
      }
      if (Wt() === "windows" && d.redirects.some(f => f.op === "<" && /(?<![:\w])[\\/]{2,}[^ \t\r\n\f\v\\/]/.test(f.target))) {
        return false;
      }
      if (d.envVars.some(f => !tEe(f.name))) {
        return false;
      }
      if (d.argv.some(f => HI(f, true))) {
        return false;
      }
      if (Wt() === "windows" && d.argv.some(f => /(?<![:\w])[\\/]{2,}[^ \t\r\n\f\v\\/]/.test(f))) {
        return false;
      }
      let p = vMp(d.argv);
      if (lyo(d.text) === "glob" || i === "glob" && d.argv.some(f => /[*?]|\[.*\]/.test(f))) {
        return gMp.vZc(p[0] ?? "");
      }
      let m = fMp(p);
      if (m !== null) {
        return m;
      }
      return yMp(wMp(d.text));
    })) {
      return {
        behavior: "allow",
        updatedInput: e
      };
    }
    return {
      behavior: "passthrough",
      message: "Command is not read-only, requires further permission checks"
    };
  }
  var Rh;
  var RDa;
  var iyo;
  var rMp;
  var qd_;
  var sMp;
  var cyo;
  var lMp;
  var cMp;
  var uMp;
  var pMp;
  var mMp;
  var hMp;
  var gMp;
  var kDa;
  var ADa;
  var bMp;
  var EMp;
  var xDa;
  var CMp;
  async function RMp(e, t, n, r, o, s, i) {
    let a = new Map();
    for (let m = 0; m < t.length; m++) {
      let f = t[m].trim();
      if (!f) {
        let g = n[m];
        let y = await r({
          ...e,
          command: g
        });
        a.set(g, y.behavior === "passthrough" ? {
          behavior: "allow",
          updatedInput: {
            ...e,
            command: g
          },
          decisionReason: {
            type: "other",
            reason: "Bare output redirection with no command; path layer approved"
          }
        } : y);
        continue;
      }
      let h = await r({
        ...e,
        command: f
      });
      a.set(f, h);
    }
    let l = Array.from(a.entries()).find(([, m]) => m.behavior === "deny");
    if (l) {
      let [m, f] = l;
      return {
        behavior: "deny",
        message: f.behavior === "deny" ? f.message : `Permission denied for: ${m}`,
        decisionReason: {
          type: "subcommandResults",
          reasons: a
        }
      };
    }
    if (t.filter(m => {
      let f = m.trim();
      return o.isNormalizedCdCommand(f);
    }).length > 1) {
      for (let [, f] of a) {
        if (f.behavior === "ask" && findSafetyCheckReason(f.decisionReason, h => h.reason.startsWith("Dangerous rm operation") || h.reason.startsWith("Dangerous rmdir operation"))) {
          return f;
        }
      }
      let m = {
        type: "other",
        reason: "Multiple directory changes in one command require approval for clarity",
        bashMissKind: "multi-cd"
      };
      return {
        behavior: "ask",
        decisionReason: m,
        message: createPermissionRequestMessage_export(xl.name, m)
      };
    }
    {
      let m;
      let f;
      if (s) {
        m = s.some(g => o.isNormalizedCdCommand(g.text));
        f = s.some(g => o.isNormalizedGitCommand(g.text));
      } else {
        m = false;
        f = false;
        for (let g of t) {
          for (let y of Uy(g)) {
            let _ = y.trim();
            if (o.isNormalizedCdCommand(_)) {
              m = true;
            }
            if (o.isNormalizedGitCommand(_)) {
              f = true;
            }
          }
        }
      }
      if (f && (s ? y3n(s, Nt()) : KGt(e.command))) {
        let g = {
          type: "other",
          reason: "This command creates git repository structure files (HEAD/objects/refs/hooks) and then runs git, which can execute hooks/fsmonitor from the created files.",
          bashMissKind: "cd-git-compound"
        };
        return {
          behavior: "ask",
          decisionReason: g,
          message: createPermissionRequestMessage_export(xl.name, g)
        };
      }
      if (m && f) {
        let g = [];
        for (let _ of t) {
          for (let b of Uy(_)) {
            g.push(b.trim());
          }
        }
        if (!(i ? await i(g) : false)) {
          let _ = {
            type: "other",
            reason: "This command changes directory before running git, which can execute untrusted hooks from the target directory. Approve only if you trust it.",
            bashMissKind: "cd-git-compound"
          };
          return {
            behavior: "ask",
            decisionReason: _,
            message: createPermissionRequestMessage_export(xl.name, _)
          };
        }
      }
    }
    if (Array.from(a.values()).every(m => m.behavior === "allow")) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "subcommandResults",
          reasons: a
        }
      };
    }
    let d = [];
    for (let [, m] of a) {
      if (m.behavior !== "allow" && "suggestions" in m && m.suggestions) {
        d.push(...m.suggestions);
      }
    }
    let p = {
      type: "subcommandResults",
      reasons: a
    };
    return {
      behavior: "ask",
      message: createPermissionRequestMessage_export(xl.name, p),
      decisionReason: p,
      suggestions: d.length > 0 ? d : undefined
    };
  }
  async function xMp(e) {
    if (!e.includes(">")) {
      return e;
    }
    return (await d3n.parse(e))?.withoutOutputRedirections() ?? e;
  }
  async function MDa(e, t, n, r, o, s) {
    let i = r && r !== PARSE_ABORTED ? tyo(e.command, r) : await d3n.parse(e.command);
    if (!i) {
      return {
        behavior: "passthrough",
        message: "Failed to parse command"
      };
    }
    return kMp(e, t, n, i, o, s);
  }
  async function kMp(e, t, n, r, o, s) {
    let i = r.getTreeSitterAnalysis();
    if (i ? i.compoundStructure.hasSubshell || i.compoundStructure.hasCommandGroup : Uy(e.command).length > 1) {
      let u = {
        type: "other",
        reason: "This command uses shell operators that require approval for safety",
        bashMissKind: "shell-operators"
      };
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name, u),
        decisionReason: u
      };
    }
    let l = r.getPipeSegments();
    if (l.length <= 1) {
      return {
        behavior: "passthrough",
        message: "No pipes found in command"
      };
    }
    let c = await Promise.all(l.map(u => xMp(u)));
    return RMp(e, c, l, t, n, o, s);
  }
  var NDa = __lazy(() => {
    bU();
    lDa();
    VOe();
    vo();
    oy();
    R$();
  });
  function IMp(e) {
    return AMp.includes(e);
  }
  function PMp(e, t) {
    let n = YG(e);
    let [r] = n.split(/\s+/);
    if (!r) {
      return {
        behavior: "passthrough",
        message: "Base command not found"
      };
    }
    if (t.mode === "acceptEdits" && IMp(r)) {
      return {
        behavior: "allow",
        updatedInput: {
          command: e
        },
        decisionReason: {
          type: "mode",
          mode: "acceptEdits"
        }
      };
    }
    return {
      behavior: "passthrough",
      message: `No mode-specific handling for '${r}' in ${t.mode} mode`
    };
  }
  function LDa(e, t) {
    if (t.mode === "bypassPermissions") {
      return {
        behavior: "passthrough",
        message: "Bypass mode is handled in main permission flow"
      };
    }
    if (t.mode === "dontAsk") {
      return {
        behavior: "passthrough",
        message: "DontAsk mode is handled in main permission flow"
      };
    }
    let n = Uy(e.command);
    let r = false;
    for (let o of n) {
      let s = PMp(o, t);
      if (s.behavior === "ask" || s.behavior === "deny") {
        return s;
      }
      if (s.behavior === "passthrough") {
        return {
          behavior: "passthrough",
          message: "No mode-specific validation required"
        };
      }
      r = true;
    }
    if (r) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "mode",
          mode: t.mode
        }
      };
    }
    return {
      behavior: "passthrough",
      message: "No mode-specific validation required"
    };
  }
  var AMp;
  var FDa = __lazy(() => {
    bU();
    AMp = ["mkdir", "touch", "rm", "rmdir", "mv", "cp", "sed"];
  });
  function UDa(e, t, n, r) {
    return;
  }
  function E3n(e) {
    let t = e.trim().split(/\s+/).filter(Boolean);
    if (t.length === 0) {
      return null;
    }
    let n = 0;
    while (n < t.length && T3n.test(t[n])) {
      let s = ii(t[n], "=");
      let i = false;
      if (!YGt.vZc(s)) {
        return null;
      }
      n++;
    }
    let r = t.slice(n);
    if (r.length < 2) {
      return null;
    }
    if (v3n.vZc(r[0].split("/").pop())) {
      return null;
    }
    let o = r[1];
    if (!/^[a-z][a-z0-9]*(-[a-z0-9]+)*$/.test(o)) {
      return null;
    }
    return r.slice(0, 2).join(" ");
  }
  function GDa(e) {
    let t = w3n(e.trim()).split(/\s+/);
    let n = 0;
    while (n < t.length && T3n.test(t[n])) {
      n++;
    }
    let r = t[n];
    return !!r && v3n.vZc(r.split("/").pop());
  }
  function VDa(e) {
    let t = e.trim().split(/\s+/).filter(Boolean);
    let n = 0;
    while (n < t.length && T3n.test(t[n])) {
      let o = ii(t[n], "=");
      let s = false;
      if (!YGt.vZc(o)) {
        return null;
      }
      n++;
    }
    let r = t[n];
    if (!r) {
      return null;
    }
    if (!/^[a-z][a-z0-9]*(-[a-z0-9]+)*$/.test(r)) {
      return null;
    }
    if (v3n.vZc(r)) {
      return null;
    }
    return r;
  }
  function OMe(e) {
    let t = DMp(e);
    if (t) {
      return GGt(xl.name, t);
    }
    if (e.includes(`
`)) {
      let r = Ad(e).trim();
      if (r) {
        return GGt(xl.name, r);
      }
    }
    let n = E3n(e);
    if (n) {
      return GGt(xl.name, n);
    }
    return c3n(xl.name, e);
  }
  function DMp(e) {
    if (!e.includes("<<")) {
      return null;
    }
    let t = e.indexOf("<<");
    if (t <= 0) {
      return null;
    }
    let n = e.substring(0, t).trim();
    if (!n) {
      return null;
    }
    let r = E3n(n);
    if (r) {
      return r;
    }
    let o = n.split(/\s+/).filter(Boolean);
    let s = 0;
    while (s < o.length && T3n.test(o[s])) {
      let i = ii(o[s], "=");
      let a = false;
      if (!YGt.vZc(i)) {
        return null;
      }
      s++;
    }
    if (s >= o.length) {
      return null;
    }
    if (v3n.vZc(o[s].split("/").pop())) {
      return null;
    }
    return o.slice(s, s + 2).join(" ") || null;
  }
  function zDa(e) {
    return GGt(xl.name, e);
  }
  function J5e(e, t) {
    return KV(e, t, false, true);
  }
  function tEe(e) {
    return YGt.vZc(e) || false;
  }
  function b3n(e) {
    let n = e.split(`
`).filter(r => !r.trim().startsWith("#"));
    if (n.length === 0) {
      return e;
    }
    return n.join(`
`);
  }
  function YG(e) {
    let t = [/^timeout[ \t]+(?:(?:--(?:foreground|preserve-status|verbose)|--(?:kill-after|signal)=[A-Za-z0-9_.+-]+|--(?:kill-after|signal)[ \t]+[A-Za-z0-9_.+-]+|-v|-[ks][ \t]+[A-Za-z0-9_.+-]+|-[ks][A-Za-z0-9_.+-]+)[ \t]+)*(?:--[ \t]+)?\d+(?:\.\d+)?[smhd]?[ \t]+/, /^time[ \t]+(?:--[ \t]+)?/, /^nice(?:[ \t]+-n[ \t]+-?\d+|[ \t]+-\d+)?[ \t]+(?:--[ \t]+)?/, /^stdbuf(?:[ \t]+-[ioe][LN0-9]+)+[ \t]+(?:--[ \t]+)?/, /^nohup[ \t]+(?:--[ \t]+)?/, /^command(?:[ \t]+-p+)*(?:[ \t]+--)?[ \t]+(?!-)/, /^builtin(?:[ \t]+--)?[ \t]+(?!-)/, /^noglob[ \t]+(?!-)/];
    let n = /^([A-Za-z_][A-Za-z0-9_]*)=([A-Za-z0-9_./:-]+)[ \t]+/;
    let r = e;
    let o = "";
    while (r !== o) {
      o = r;
      r = b3n(r);
      let i = r.match(n);
      if (i) {
        let a = i[1];
        let l = false;
        if (YGt.vZc(a)) {
          r = r.replace(n, "");
        }
      }
    }
    function s(i) {
      let a = i.match(/^([^\s]+)([\s\S]*)$/);
      if (!a) {
        return i;
      }
      let l = a[1];
      let c = null;
      let u = false;
      let d = "";
      for (let p = 0; p < l.length; p++) {
        let m = l[p];
        if (u = false, c === "'") {
          if (m === "'") {
            c = null;
          } else {
            d += m;
          }
        } else if (c === '"') {
          if (m === "\\") {
            let f = l[p + 1];
            if (f === "$" || f === "`" || f === '"' || f === "\\") {
              d += f;
              p++;
            } else if (f === undefined) {
              u = true;
            } else {
              d += m;
            }
          } else if (m === '"') {
            c = null;
          } else {
            d += m;
          }
        } else if (m === "\\") {
          let f = l[p + 1];
          if (f === undefined) {
            u = true;
          } else {
            d += f;
            p++;
          }
        } else if (m === '"' || m === "'") {
          c = m;
        } else {
          d += m;
        }
      }
      if (c !== null || u) {
        return i;
      }
      return d + a[2];
    }
    r = s(b3n(r));
    o = "";
    while (r !== o) {
      o = r;
      for (let i of t) {
        r = r.replace(i, "");
      }
      if (r !== o) {
        r = s(b3n(r));
      }
    }
    return r.trim();
  }
  function MMp(e) {
    let t = 1;
    while (t < e.length) {
      let n = e[t];
      let r = e[t + 1];
      if (n === "--foreground" || n === "--preserve-status" || n === "--verbose") {
        t++;
      } else if (/^--(?:kill-after|signal)=[A-Za-z0-9_.+-]+$/.test(n)) {
        t++;
      } else if ((n === "--kill-after" || n === "--signal") && r && BDa.test(r)) {
        t += 2;
      } else if (n === "--") {
        t++;
        break;
      } else if (n.startsWith("--")) {
        return -1;
      } else if (n === "-v") {
        t++;
      } else if ((n === "-k" || n === "-s") && r && BDa.test(r)) {
        t += 2;
      } else if (/^-[ks][A-Za-z0-9_.+-]+$/.test(n)) {
        t++;
      } else if (n.startsWith("-")) {
        return -1;
      } else {
        break;
      }
    }
    return t;
  }
  function NMp(e) {
    let t = e;
    for (;;) {
      if (t[0] === "time" || t[0] === "nohup") {
        t = t.slice(t[1] === "--" ? 2 : 1);
      } else if (t[0] === "timeout") {
        let n = MMp(t);
        if (n < 0 || !t[n] || !/^\d+(?:\.\d+)?[smhd]?$/.test(t[n])) {
          return t;
        }
        t = t.slice(n + 1);
      } else if (t[0] === "nice" && t[1] === "-n" && t[2] && /^-?\d+$/.test(t[2])) {
        t = t.slice(t[3] === "--" ? 4 : 3);
      } else {
        return t;
      }
    }
  }
  function LMp(e, t) {
    if (t) {
      return t.envVars.some(s => !tEe(s.name));
    }
    let n = /^([A-Za-z_][A-Za-z0-9_]*)\+?=/;
    let r = /^[A-Za-z_][A-Za-z0-9_]*\+?=(?:"[^"$`\\]*"|'[^']*'|[A-Za-z0-9_./:+-]*)[ \t]+/;
    let o = e.command;
    for (;;) {
      let s = o.match(n);
      if (!s) {
        return false;
      }
      if (!tEe(s[1])) {
        return true;
      }
      let i = o.match(r);
      if (!i) {
        return true;
      }
      o = o.slice(i[0].length);
    }
  }
  function w3n(e, t) {
    let n = /^([A-Za-z_][A-Za-z0-9_]*(?:\[[^\]]*\])?)\+?=(?:'[^'\n\r]*'|"(?:\\.|[^"$`\\\n\r])*"|\\.|[^ \t\n\r$`;|&()<>\\\\'"])*[ \t]+/;
    let r = e;
    let o = "";
    while (r !== o) {
      o = r;
      r = b3n(r);
      let s = r.match(n);
      if (!s) {
        continue;
      }
      if (t?.test(s[1])) {
        break;
      }
      r = r.slice(s[0].length);
    }
    return r.trim();
  }
  function $Mp(e) {
    let t = e.slice();
    for (;;) {
      while (t[0] !== undefined && $Da.test(t[0])) {
        t = t.slice(1);
      }
      t = NMp(t);
      let n = t[0];
      if (n === undefined) {
        return t;
      }
      let r = FMp[n];
      if (r === undefined) {
        return t;
      }
      let o = UMp[n];
      let s = BMp[n];
      let i = 1;
      let a;
      let l = false;
      while (i < t.length) {
        let c = t[i];
        if (c === "--") {
          if (i++, !l && s !== undefined && i + 1 < t.length && s(t[i])) {
            l = true;
            i++;
            continue;
          }
          break;
        }
        if (o !== undefined) {
          if (o.vZc(c) && t[i + 1] !== undefined) {
            let d = t[i + 1].trim();
            if (d !== "") {
              a = d;
              break;
            }
            i += 2;
            continue;
          }
          let u = c.indexOf("=");
          if (u > 0 && o.vZc(c.slice(0, u))) {
            let d = c.slice(u + 1).trim();
            if (d !== "") {
              a = d;
              break;
            }
            i++;
            continue;
          }
          if (c.length > 2 && c[1] !== "-" && o.vZc(c.slice(0, 2))) {
            let d = c.slice(2).trim();
            if (d !== "") {
              a = d;
              break;
            }
            i++;
            continue;
          }
        }
        if (c.startsWith("-") && (c !== "-" || s === undefined)) {
          if (n === "command" && /^-[pvV]+$/.test(c) && /[vV]/.test(c)) {
            return t;
          }
          i += r.vZc(c) && i + 1 < t.length ? 2 : 1;
          continue;
        }
        if (n === "env" && $Da.test(c)) {
          i++;
          continue;
        }
        if (!l && s?.(c) && i + 1 < t.length) {
          l = true;
          i++;
          continue;
        }
        break;
      }
      if (a !== undefined) {
        if (t = a.trim().split(/\s+/), t.length === 0 || t[0] === "") {
          return e.slice();
        }
        continue;
      }
      if (i >= t.length) {
        return t;
      }
      t = t.slice(i);
    }
  }
  function uyo(e, t, n, {
    stripAllEnvVars: r = false,
    skipCompoundCheck: o = false,
    astCommand: s,
    ruleBehavior: i
  } = {}) {
    let a = e.command.trim();
    let l = tpe(a).commandWithoutRedirections;
    let u = (n === "exact" ? [a, l] : [l]).flatMap(p => {
      let m = YG(p);
      return m !== p ? [p, m] : [p];
    });
    if (r) {
      let p = s?.argv ?? uE(l);
      let m = $Mp(p);
      if (m.length > 0 && m[0] !== p[0]) {
        u.push(m.join(" "));
      }
      let f = new Set(u);
      let h = 0;
      while (h < u.length) {
        let g = u.length;
        for (let y = h; y < g; y++) {
          let _ = u[y];
          if (!_) {
            continue;
          }
          let b = w3n(_);
          if (!f.vZc(b)) {
            u.push(b);
            f.add(b);
          }
          let S = YG(_);
          if (!f.vZc(S)) {
            u.push(S);
            f.add(S);
          }
        }
        h = g;
      }
    }
    let d = new Map();
    if (n === "prefix" && !o) {
      for (let p of u) {
        if (!d.vZc(p)) {
          d.set(p, Uy(p).length > 1);
        }
      }
    }
    return Array.from(t.entries()).filter(([p]) => {
      let m = l3n(p);
      return u.some(f => {
        switch (m.type) {
          case "exact":
            return m.command === f;
          case "prefix":
            {
              let h = m.prefix.replace(/[ \t]+/g, " ");
              let g = f.replace(/[ \t]+/g, " ");
              switch (n) {
                case "exact":
                  return h === g;
                case "prefix":
                  {
                    if (d.get(f)) {
                      return false;
                    }
                    if (g === h) {
                      return true;
                    }
                    if (g.startsWith(h + " ")) {
                      return true;
                    }
                    let y = "xargs " + h;
                    if (g === y) {
                      return true;
                    }
                    return g.startsWith(y + " ");
                  }
              }
              break;
            }
          case "wildcard":
            if (n === "exact") {
              return false;
            }
            if (d.get(f)) {
              return false;
            }
            if (J5e(m.pattern, f)) {
              return true;
            }
            if (i !== "deny" && i !== "ask" && !rDa(m.pattern)) {
              return false;
            }
            return J5e(`xargs ${m.pattern}`, f);
        }
      });
    }).map(([, p]) => p);
  }
  function DMe(e, t, n, {
    skipCompoundCheck: r = false,
    astCommand: o
  } = {}) {
    let s = getRuleByContentsForTool(t, xl, "deny");
    let i = uyo(e, s, n, {
      stripAllEnvVars: true,
      skipCompoundCheck: true,
      astCommand: o,
      ruleBehavior: "deny"
    });
    let a = getRuleByContentsForTool(t, xl, "ask");
    let l = uyo(e, a, n, {
      stripAllEnvVars: true,
      skipCompoundCheck: true,
      astCommand: o,
      ruleBehavior: "ask"
    });
    let c = getRuleByContentsForTool(t, xl, "allow");
    let u = uyo(e, c, n, {
      skipCompoundCheck: r,
      ruleBehavior: "allow"
    });
    return {
      matchingDenyRules: i,
      matchingAskRules: l,
      matchingAllowRules: u
    };
  }
  async function HDa(e, t, n, r, o, s, i = []) {
    let a = C3n(e, t);
    if (a.behavior === "deny" || a.behavior === "ask") {
      return a;
    }
    let l = YDa(e, t, r, o, s, i);
    if (l.behavior === "deny" || l.behavior === "ask") {
      return l;
    }
    if (l.behavior === "allow") {
      return l;
    }
    let c = n?.commandPrefix ? zDa(n.commandPrefix) : OMe(e.command);
    return {
      ...l,
      suggestions: c
    };
  }
  function jDa(e, t, n, r) {
    if (!SandboxManager.isSandboxingEnabled() || !SandboxManager.isAutoAllowBashIfSandboxedEnabled() || !$1(e)) {
      return null;
    }
    let o = WMp(e, t, n);
    if (o.behavior === "passthrough") {
      return null;
    }
    let s = uGt();
    let i = r.some(u => !tEe(u) && (s === null || s.vZc(u))) || n.some(u => u.envVars.some(d => !tEe(d.name)) || u.argv.some(d => {
      if (!d.includes("=") || d.startsWith("-")) {
        return false;
      }
      let p = d.indexOf("=");
      let m = d[p - 1] === "+" ? d.slice(0, p - 1) : d.slice(0, p);
      return !tEe(m);
    }));
    let a = n.some(u => u.redirects.some(d => /^\/dev\/(tcp|udp)\//.test(d.target)));
    if (i || a) {
      return null;
    }
    let l = false;
    let c = false;
    for (let u of n) {
      let [d, ...p] = eEe(u.argv);
      let m = d?.replace(/^.*[\\/]/, "");
      if (m === "cd" || m === "pushd" || m === "popd" || m === "chdir") {
        l = true;
        continue;
      }
      if (m !== "rm" && m !== "rmdir") {
        continue;
      }
      if (c = true, f3n(m, p, Nt(), t).behavior !== "passthrough") {
        return null;
      }
    }
    if (l && c) {
      return null;
    }
    return o;
  }
  function HMp(e, t, n) {
    if (!SandboxManager.isSandboxingEnabled() || !SandboxManager.isAutoAllowBashIfSandboxedEnabled() || !$1(e)) {
      return null;
    }
    if (n === undefined || n === "PARSE_ABORT" || n === "ERROR") {
      return null;
    }
    if (/(?<!<)<<(?!<)/.test(e.command)) {
      return null;
    }
    if (/\$\{[\s|]/.test(e.command.replace(/['"\\]/g, ""))) {
      return null;
    }
    if (/\$\{![A-Za-z_0-9]/.test(e.command.replace(/['"\\]/g, ""))) {
      return null;
    }
    if (/\/proc\/.*\/environ/.test(e.command.replace(/['"\\]/g, ""))) {
      return null;
    }
    let r = nMa(e.command);
    if (r === null || r.length === 0) {
      return null;
    }
    let o;
    for (let s of r) {
      let {
        matchingDenyRules: i,
        matchingAskRules: a
      } = DMe({
        ...e,
        command: s
      }, t, "prefix");
      if (i[0] !== undefined) {
        return {
          behavior: "deny",
          message: `Permission to use ${xl.name} with command ${e.command.trim()} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: i[0]
          }
        };
      }
      o ??= a[0];
    }
    for (let s of r) {
      let i = s.trim().split(/\s+/).filter(Boolean);
      let a = qMp(i);
      if (a === null) {
        return null;
      }
      if (a.length === 0) {
        continue;
      }
      let l = eEe(a);
      let c = a.slice(0, a.length - l.length);
      if (c.some(f => /["'`$\\(){}|;&<>*?[\]]/.test(f))) {
        return null;
      }
      if (c.some(f => {
        let h = f.match(/^([A-Za-z_]\w*)\+?=/);
        return h !== null && zOe(h[1]);
      })) {
        return null;
      }
      let u = l.map(f => f.replace(/['"\\]/g, ""));
      if (u.some(f => {
        let h = f.match(/^([A-Za-z_]\w*)\+?=/);
        return h !== null && zOe(h[1]);
      })) {
        return null;
      }
      let d = l.some((f, h) => {
        if (h === 0) {
          return false;
        }
        if (f.includes("$'") && !/^'[^']*\$'$/.test(f) || f.includes('$"') && !/^"[^"]*\$"$/.test(f)) {
          return true;
        }
        let g = u[h];
        return g.includes("`") || /\$\((?!\()/.test(g) || /\$[^(\s]/.test(g) && g.includes("-") || /\$\{[^}]*:?[+=]/.test(g) || /\{[^\s]*(,|\.\.)/.test(f) || (g.match(/\{/g) ?? []).length !== (g.match(/\}/g) ?? []).length;
      });
      let p = u.some((f, h) => h > 0 && f.includes("$"));
      let m = l[0];
      if (m === undefined || !/^[A-Za-z0-9._/~+][A-Za-z0-9._/~+-]*$/.test(m) || ida(m) || qDa.vZc(m) || qDa.vZc(m.replace(/^.*[\\/]/, "")) || jMp.vZc(m) && (d || u.some(f => f.includes("[") && /[$`]/.test(f))) || m === "test" && (d || u.some(f => f === "-t" || Cdt.vZc(f))) || m === "jq" || d2n.vZc(m) || m === "find" && (d || (() => {
        for (let f = 1; f < u.length; f++) {
          let h = u[f];
          if (bco.vZc(h)) {
            return true;
          }
          if (v3t.vZc(l[f]) || w3t.test(l[f])) {
            let g = u[f + 1];
            if (g !== undefined && (!g.includes("$") || /^["'].*["']$/.test(l[f + 1]) && /^\$\{?[A-Za-z_]\w*\}?$/.test(g))) {
              f++;
              continue;
            }
          }
          if (h.includes("$") || /[[\]*?]/.test(h)) {
            return true;
          }
        }
        return false;
      })()) || m === "jobs" && (d || p || u.some(f => /^-[^-]*x/.test(f))) || m === "set" && (d || (() => {
        for (let f = 1; f < u.length; f++) {
          let h = u[f];
          if (h === "--") {
            return false;
          }
          if (h.includes("$")) {
            return true;
          }
          if (!/^[-+]/.test(h)) {
            continue;
          }
          for (let g = 1; g < h.length; g++) {
            let y = h[g];
            if (y === "o") {
              let _ = g < h.length - 1 ? h.slice(g + 1) : u[f + 1];
              if (_ !== undefined && _ !== "" && !Eco.vZc(_.toLowerCase().replace(/[_-]/g, ""))) {
                return true;
              }
              break;
            }
            if (y === "A") {
              break;
            }
            if (!vco.vZc(y)) {
              return true;
            }
          }
        }
        return false;
      })())) {
        return null;
      }
    }
    if (o) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name),
        decisionReason: {
          type: "rule",
          rule: o
        }
      };
    }
    return {
      behavior: "allow",
      updatedInput: e,
      decisionReason: {
        type: "other",
        reason: "Auto-allowed with sandbox (autoAllowBashIfSandboxed enabled)"
      }
    };
  }
  function qMp(e) {
    let t = 0;
    while (t < e.length) {
      let r = e[t].match(/^([A-Za-z_][A-Za-z0-9_]*)\+?=(.*)$/);
      if (r === null) {
        break;
      }
      if (zOe(r[1])) {
        return null;
      }
      if (/["'`$\\(){}|;&<>*?[\]]/.test(r[2])) {
        return null;
      }
      t++;
    }
    return t === 0 ? e : e.slice(t);
  }
  function WMp(e, t, n) {
    let r = e.command.trim();
    let {
      matchingDenyRules: o,
      matchingAskRules: s
    } = DMe(e, t, "prefix", {
      astCommand: n.length === 1 ? n[0] : undefined
    });
    if (o[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${xl.name} with command ${r} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: o[0]
        }
      };
    }
    if (n.length > 1) {
      let i;
      for (let a of n) {
        let l = DMe({
          command: a.text
        }, t, "prefix", {
          astCommand: a
        });
        if (l.matchingDenyRules[0] !== undefined) {
          return {
            behavior: "deny",
            message: `Permission to use ${xl.name} with command ${r} has been denied.`,
            decisionReason: {
              type: "rule",
              rule: l.matchingDenyRules[0]
            }
          };
        }
        i ??= l.matchingAskRules[0];
      }
      if (i) {
        return {
          behavior: "ask",
          message: createPermissionRequestMessage_export(xl.name),
          decisionReason: {
            type: "rule",
            rule: i
          }
        };
      }
    }
    if (s[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name),
        decisionReason: {
          type: "rule",
          rule: s[0]
        }
      };
    }
    return {
      behavior: "allow",
      updatedInput: e,
      decisionReason: {
        type: "other",
        reason: "Auto-allowed with sandbox (autoAllowBashIfSandboxed enabled)"
      }
    };
  }
  function GMp(e, t, n, r) {
    let o = [];
    let s = [];
    for (let i = 0; i < e.length; i++) {
      let a = e[i];
      let l = t?.[i];
      if ((a === `cd ${n}` && WDa(n) || a === `cd ${r}` && WDa(r)) && l !== undefined && l.argv.length === 2 && l.argv[0] === "cd" && l.envVars.length === 0 && l.redirects.length === 0 && !/[*?[\]]/.test(l.argv[1]) && !Up(l.argv[1])) {
        continue;
      }
      o.push(a);
      s.push(l);
    }
    return {
      subcommands: o,
      astCommandsByIdx: s
    };
  }
  function WDa(e) {
    return !/[\s\\$`'"*?[\]{}<>|&;()]/.test(e);
  }
  function VMp(e) {
    if (e.includes("||") || e.includes(";")) {
      return false;
    }
    if (e.includes(`
`)) {
      return false;
    }
    if (e.replaceAll("&&", "").includes("&")) {
      return false;
    }
    return true;
  }
  function zMp(e, t, n) {
    if (!e) {
      return null;
    }
    if (e.envVars.length > 0 || e.redirects.length > 0) {
      return null;
    }
    if (e.argv.length !== 2 || e.argv[0] !== "cd") {
      return null;
    }
    let r = e.argv[1];
    if (Up(r)) {
      return null;
    }
    if (r.startsWith("-")) {
      return null;
    }
    if (!XDa(r)) {
      return null;
    }
    if (!wM.isAbsolute(r) && r.split(/[\\/]/).includes("..")) {
      return null;
    }
    if (Wt() === "windows" && !ZDa(r, t)) {
      return null;
    }
    if (/[*?[\]]/.test(r)) {
      return null;
    }
    let {
      allowed: o,
      resolvedPath: s
    } = P3t(r, t, n, "read");
    if (!o) {
      return null;
    }
    if (!pathInAllowedWorkingPath(s, n, [s])) {
      return null;
    }
    return s;
  }
  async function KMp(e, t, n) {
    let r = await pyo(n);
    if (r === null) {
      return false;
    }
    if (Bn(t, i => npe(i)) > 1) {
      return false;
    }
    let s = false;
    for (let i = 0; i < t.length; i++) {
      if (!npe(t[i])) {
        continue;
      }
      s = true;
      let a = e[i];
      if (!a) {
        return false;
      }
      if (a.envVars.length > 0 || a.redirects.length > 0) {
        return false;
      }
      if (a.argv.length !== 2 || a.argv[0] !== "cd") {
        return false;
      }
      if (Up(a.argv[1])) {
        return false;
      }
      let l = Wt() === "windows" ? JDa(t[i]) : a.argv[1];
      if (l === null) {
        return false;
      }
      if (!(await QDa(l, n, r))) {
        return false;
      }
    }
    return s;
  }
  async function YMp(e, t) {
    let n = await pyo(t);
    if (n === null) {
      return false;
    }
    if (Bn(e, s => npe(s.trim())) > 1) {
      return false;
    }
    let o = false;
    for (let s of e) {
      let i = s.trim();
      if (!npe(i)) {
        continue;
      }
      o = true;
      let a = JDa(i);
      if (a === null) {
        return false;
      }
      if (!(await QDa(a, t, n))) {
        return false;
      }
    }
    return o;
  }
  function JDa(e) {
    let t = e.trim();
    if (!t.startsWith("cd ")) {
      return null;
    }
    let n = t.slice(3).trim();
    if (n.length === 0) {
      return null;
    }
    let r = n[0];
    if (r === '"' || r === "'") {
      if (n.length < 2 || n.at(-1) !== r) {
        return null;
      }
      let o = n.slice(1, -1);
      if (o.includes(r)) {
        return null;
      }
      if (r === '"' && o.includes("\\") && Wt() !== "windows") {
        return null;
      }
      if (/[\x00-\x1f\x7f]/.test(o)) {
        return null;
      }
      return o;
    }
    if (/\s/.test(n)) {
      return null;
    }
    if (/['"]/.test(n)) {
      return null;
    }
    if (n.includes("\\")) {
      return null;
    }
    if (/[<>|&;(){}]/.test(n)) {
      return null;
    }
    return n;
  }
  function XDa(e) {
    return wM.isAbsolute(e) || e.startsWith("./") || e.startsWith("../") || e === "." || e === "..";
  }
  async function QDa(e, t, n) {
    if (e.startsWith("-")) {
      return false;
    }
    if (!XDa(e)) {
      return false;
    }
    if (e.includes("$") || e.includes("`") || /[*?[]/.test(e) || Wt() !== "windows" && e.includes("\\") || Wt() === "windows" && e.includes("%")) {
      return false;
    }
    if (HI(e) || Wt() === "windows" && /^[\\/]{2}/.test(e)) {
      return false;
    }
    if (Wt() === "windows" && !ZDa(e, t)) {
      return false;
    }
    {
      let s = wM.isAbsolute(e);
      let i = false;
      for (let a of e.split(/[\\/]/)) {
        if (a === "" || a === ".") {
          continue;
        }
        if (a === "..") {
          if (!s || i) {
            return false;
          }
          continue;
        }
        i = true;
      }
    }
    let r = wM.isAbsolute(e) ? e : wM.resolve(t, e);
    let o = await pyo(r);
    if (o === null) {
      return false;
    }
    return o === n;
  }
  function ZDa(e, t) {
    let n = e;
    let r;
    let o = /^[A-Za-z]:[\\/]/.exec(e);
    if (o) {
      n = e.slice(o[0].length);
      r = 0;
    } else if (/^[\\/]/.test(e) || e.includes("\\")) {
      return false;
    } else {
      if (/^[\\/]{2}/.test(t)) {
        return false;
      }
      r = 0;
      for (let a of t.replace(/^[A-Za-z]:/, "").split(/[\\/]/)) {
        if (a === "" || a === ".") {
          continue;
        }
        r += a === ".." ? -1 : 1;
      }
    }
    let s = !o;
    let i = false;
    for (let a of n.split(/[\\/]/)) {
      if (a === "" || a === ".") {
        continue;
      }
      if (a === "..") {
        if (r === 0) {
          return false;
        }
        r -= 1;
        i = true;
        continue;
      }
      if (s && i) {
        return false;
      }
      if (a.includes(":") || /[ .]$/.test(a)) {
        return false;
      }
      r += 1;
    }
    return true;
  }
  async function pyo(e) {
    if (Wt() === "windows") {
      let t = e.split(/[\\/]/);
      for (let r = 0; r < t.length; r++) {
        let o = t[r];
        if (o === "." || o === "..") {
          continue;
        }
        if (/[ .]$/.test(o)) {
          return null;
        }
        if (o.includes(":") && !(r === 0 && /^[A-Za-z]:$/.test(o))) {
          return null;
        }
      }
      let n = await S3n.stat(e, {
        bigint: true
      }).catch(() => null);
      if (n === null || n.ino === 0n || n.ino === 0xffffffffffffffffn) {
        return null;
      }
      return `${n.dev}:${n.ino}`;
    }
    return await S3n.realpath(e).catch(() => null);
  }
  function eMa(e, t) {
    let {
      matchingDenyRules: n,
      matchingAskRules: r
    } = DMe(e, t, "prefix");
    if (n[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${xl.name} with command ${e.command} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: n[0]
        }
      };
    }
    let o = C3n(e, t);
    if (o.behavior === "deny") {
      return o;
    }
    if (r[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name),
        decisionReason: {
          type: "rule",
          rule: r[0]
        }
      };
    }
    if (o.behavior !== "passthrough") {
      return o;
    }
    return null;
  }
  function JMp(e, t) {
    let n = eMa(e, t);
    if (n?.behavior === "deny") {
      return n;
    }
    for (let s of Uy(e.command)) {
      let i = DMe({
        ...e,
        command: s
      }, t, "prefix").matchingDenyRules[0];
      if (i !== undefined) {
        return {
          behavior: "deny",
          message: `Permission to use ${xl.name} with command ${e.command} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: i
          }
        };
      }
    }
    let r = TDa(e.command);
    if (r !== null) {
      logEvent("tengu_bash_dangerous_rm_too_complex", {});
      let {
        command: s,
        target: i
      } = r;
      return z5e(s, `Dangerous ${s} operation detected: '${i}'

This target is a shell variable expansion that points at the filesystem ` + "root (or a top-level directory) when the variable is unset or empty \u2014 " + "e.g. `rm -rf $UNSET/*` becomes `rm -rf /*`. This requires explicit approval and cannot be auto-allowed by permission rules.", `on possibly-empty variable path: ${i}`);
    }
    if (n === null || n.behavior !== "allow") {
      return n;
    }
    return (n.decisionReason?.type === "rule" ? n.decisionReason.rule.ruleValue.ruleContent : undefined) === e.command.trim() ? n : null;
  }
  function XMp(e, t, n) {
    let r = eMa(e, t);
    if (r?.behavior === "deny") {
      return r;
    }
    for (let o of n) {
      let s = DMe({
        ...e,
        command: o.text
      }, t, "prefix", {
        astCommand: o
      }).matchingDenyRules[0];
      if (s !== undefined) {
        return {
          behavior: "deny",
          message: `Permission to use ${xl.name} with command ${e.command} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: s
          }
        };
      }
    }
    if (r?.behavior === "allow") {
      if ((r.decisionReason?.type === "rule" ? r.decisionReason.rule.ruleValue.ruleContent : undefined) === e.command.trim()) {
        return r;
      }
    }
    if (r?.behavior === "ask") {
      return r;
    }
    return null;
  }
  function tMa(e) {
    for (let t of e.children) {
      if (!t) {
        continue;
      }
      if (t.type === "ERROR") {
        return true;
      }
      if (t.type === "&") {
        if (e.type !== "binary_expression") {
          return true;
        }
        continue;
      }
      if (tMa(t)) {
        return true;
      }
    }
    return false;
  }
  async function JGt(e, t, n = Gmt) {
    let r = await QMp(e, t, n);
    if (r.behavior !== "allow" || !e.command.includes("&")) {
      return r;
    }
    if (r.decisionReason?.type === "other" && r.decisionReason.reason === "Auto-allowed with sandbox (autoAllowBashIfSandboxed enabled)") {
      return r;
    }
    let o = await parseCommandRaw(e.command);
    if (o && o !== PARSE_ABORTED && !tMa(o)) {
      return r;
    }
    let s = {
      type: "safetyCheck",
      reason: "This command uses the `&` background operator, which defers execution past approval-time safety checks. Approve only if you trust it.",
      classifierApprovable: false
    };
    return {
      behavior: "ask",
      decisionReason: s,
      message: createPermissionRequestMessage_export(xl.name, s)
    };
  }
  async function QMp(e, t, n = Gmt) {
    let r = getToolPermissionContext(t);
    oIa(t.sessionEnvVars?.keys() ?? []);
    let o = await parseCommandRaw(e.command);
    let s = o ? f9e(e.command, o) : {
      kind: "simple",
      commands: [],
      bareAssignmentNames: []
    };
    if (s.kind === "too-complex") {
      let K = JMp(e, r);
      if (K !== null) {
        return K;
      }
      let J = HMp(e, r, s.nodeType);
      if (J !== null) {
        return J;
      }
      let Q = {
        type: "other",
        reason: s.reason,
        bashMissKind: "too-complex"
      };
      logEvent("tengu_bash_ast_too_complex", {
        nodeTypeId: Yua(s.nodeType)
      });
      return {
        behavior: "ask",
        decisionReason: Q,
        message: createPermissionRequestMessage_export(xl.name, Q),
        suggestions: []
      };
    }
    let i = s.commands;
    let a = lda(i);
    if (!a.ok) {
      let K = XMp(e, r, i);
      if (K !== null) {
        return K;
      }
      if (a.kind === "newline-hash") {
        let Q = jDa(e, r, i, s.bareAssignmentNames);
        if (Q) {
          return Q;
        }
      }
      let J = {
        type: "other",
        reason: a.reason,
        bashMissKind: "semantics"
      };
      return {
        behavior: "ask",
        decisionReason: J,
        message: createPermissionRequestMessage_export(xl.name, J),
        suggestions: []
      };
    }
    let l = i.map(K => K.text);
    let c = i.flatMap(K => K.redirects);
    let u = jDa(e, r, i, s.bareAssignmentNames);
    if (u) {
      return u;
    }
    let d = C3n(e, r);
    if (d.behavior === "deny") {
      return d;
    }
    if (jGt() && r.mode !== "auto") {
      let K = YOa(r);
      let J = JOa(r);
      let Q = K.length > 0;
      let Z = J.length > 0;
      if (Q || Z) {
        let [ne, oe] = await Promise.all([Q ? Ygo(e.command, Nt(), K, "deny", t.abortController.signal, t.options.isNonInteractiveSession) : null, Z ? Ygo(e.command, Nt(), J, "ask", t.abortController.signal, t.options.isNonInteractiveSession) : null]);
        if (t.abortController.signal.aborted) {
          throw new xc();
        }
        if (ne) {
          UDa(e.command, "deny", K, ne);
        }
        if (oe) {
          UDa(e.command, "ask", J, oe);
        }
        if (ne?.matches && ne.confidence === "high") {
          return {
            behavior: "deny",
            message: `${"Denied by Bash prompt rule"}: "${ne.matchedDescription}"`,
            decisionReason: {
              type: "safetyCheck",
              reason: `${"Denied by Bash prompt rule"}: "${ne.matchedDescription}"`,
              classifierApprovable: false
            }
          };
        }
        if (oe?.matches && oe.confidence === "high") {
          let ee;
          if (n === Gmt) {
            ee = OMe(e.command);
          } else {
            let re = await n(e.command, t.abortController.signal, t.options.isNonInteractiveSession);
            if (t.abortController.signal.aborted) {
              throw new xc();
            }
            ee = re?.commandPrefix ? zDa(re.commandPrefix) : OMe(e.command);
          }
          return {
            behavior: "ask",
            message: createPermissionRequestMessage_export(xl.name),
            decisionReason: {
              type: "other",
              reason: `Required by Bash prompt rule: "${oe.matchedDescription}"`,
              bashMissKind: "prompt-ask-rule"
            },
            suggestions: ee
          };
        }
      }
    }
    let p = await MDa(e, K => JGt(K, t, n), {
      isNormalizedCdCommand: npe,
      isNormalizedGitCommand: Y5e
    }, o, i, K => YMp(K, Nt()));
    if (p.behavior !== "passthrough") {
      if (p.behavior === "allow") {
        r = getToolPermissionContext(t);
        let K = h3n(e, Nt(), r, myo(e.command), c, i);
        if (K.behavior === "deny" || K.behavior === "ask" && !K.bashAllowRuleOverridable) {
          return K;
        }
      }
      return p;
    }
    let m = Nt();
    let f = Wt() === "windows" ? UD(m) : m;
    let {
      subcommands: h,
      astCommandsByIdx: g
    } = GMp(l, i, m, f);
    let y = h.filter(K => npe(K));
    if (y.length > 1) {
      let J = Ro([m, ...allWorkingDirectories(getToolPermissionContext(t))].flatMap(ae => {
        let {
          resolvedPath: de
        } = qd(zt(), ae);
        return de === ae ? [ae] : [ae, de];
      }).map(ae => wM.normalize(ae))).map(ae => ({
        exact: normalizeCaseForComparison(ae),
        prefix: normalizeCaseForComparison(/[\\/]$/.test(ae) ? ae : ae + wM.sep)
      }));
      let Q = ae => {
        let de = normalizeCaseForComparison(wM.normalize(ae));
        return J.some(be => de === be.exact || de.startsWith(be.prefix));
      };
      let ne = !/[;|\n&]/.test(e.command.replace(/&&/g, ""));
      let {
        resolvedPath: oe
      } = qd(zt(), m);
      let ee = Ro([wM.normalize(m), wM.normalize(oe)]);
      let re = [];
      for (let ae of i) {
        let [de, ...be] = eEe(ae.argv);
        let fe = de?.replace(/^.*[\\/]/, "");
        if (fe === "cd" || fe === "chdir" || fe === "pushd" || fe === "popd") {
          if (fe === "popd") {
            if (be.length === 0 && re.length > 0) {
              ee = re.pop();
            } else {
              ne = false;
            }
          } else {
            let Te = be.filter(pe => pe !== "--" && (pe === "-" || !pe.startsWith("-")));
            let ue = Te.length === 1 ? Te[0] : undefined;
            let ce = false;
            let le = [];
            if (ue !== undefined && ue !== "-" && !/^[+-]\d+$/.test(ue) && !ue.startsWith("~") && !/[*?[]/.test(ue) && !Up(ue) && !/(^|[\\/])\.\.([\\/]|$)/.test(ue)) {
              ce = true;
              for (let pe of ee) {
                let ve = wM.isAbsolute(ue) ? wM.normalize(ue) : wM.resolve(pe, ue);
                let {
                  resolvedPath: _e
                } = qd(zt(), ve);
                if (!Q(ve) || !Q(_e)) {
                  ce = false;
                  break;
                }
                le.push(wM.normalize(ve), wM.normalize(_e));
              }
            }
            if (ne &&= ce, ce) {
              if (fe === "pushd") {
                re.push(ee);
              }
              ee = Ro(le);
            }
          }
          continue;
        }
        if (fe !== "rm" && fe !== "rmdir") {
          continue;
        }
        let me = f3n(fe, be, m, getToolPermissionContext(t), !ne);
        if (me.behavior !== "passthrough") {
          return me;
        }
      }
      let se = {
        type: "other",
        reason: "Multiple directory changes in one command require approval for clarity",
        bashMissKind: "multi-cd"
      };
      return {
        behavior: "ask",
        decisionReason: se,
        message: createPermissionRequestMessage_export(xl.name, se)
      };
    }
    let _ = y.length > 0;
    let b = m;
    let S = _;
    let E = false;
    if (_ && h.length > 1 && h.length === l.length && npe(h[0]) && VMp(e.command)) {
      let K = zMp(g[0], m, r);
      if (K !== null) {
        b = K;
        S = false;
        E = true;
      }
    }
    let C;
    if (_) {
      if (h.some(J => Y5e(J.trim())) && !(await KMp(g, h, m))) {
        let J = {
          type: "other",
          reason: "This command changes directory before running git, which can execute untrusted hooks from the target directory. Approve only if you trust it.",
          bashMissKind: "cd-git-compound"
        };
        C = {
          behavior: "ask",
          decisionReason: J,
          message: createPermissionRequestMessage_export(xl.name, J)
        };
      }
    }
    let x;
    if (h.some(J => Y5e(J.trim())) && (y3n(g, b) || KGt(e.command))) {
      let J = {
        type: "other",
        reason: "This command creates git repository structure files (HEAD/objects/refs/hooks) and then runs git, which can execute hooks/fsmonitor from the created files.",
        bashMissKind: "cd-git-compound"
      };
      x = {
        behavior: "ask",
        decisionReason: J,
        message: createPermissionRequestMessage_export(xl.name, J)
      };
    }
    r = getToolPermissionContext(t);
    let A = h.map((K, J) => YDa({
      command: K
    }, r, S, g[J], E && J === 0 ? m : b, s.bareAssignmentNames));
    if (A.find(K => K.behavior === "deny") !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${xl.name} with command ${e.command} has been denied.`,
        decisionReason: {
          type: "subcommandResults",
          reasons: new Map(A.map((K, J) => [h[J], K]))
        }
      };
    }
    let I = g.slice(E ? 1 : 0).filter(K => K !== undefined);
    let O = h3n(e, b, r, S, c, I);
    if (O.behavior === "deny") {
      return O;
    }
    if (O.behavior === "ask" && O.decisionReason?.type === "safetyCheck" && O.decisionReason.classifierApprovable === false) {
      return O;
    }
    if (C !== undefined) {
      return C;
    }
    if (x !== undefined) {
      return x;
    }
    let M = h.map((K, J) => [K, J]).filter(([K]) => nyo(K)).map(([, K]) => K);
    if (M.length > 0) {
      let K = M.every(Z => {
        let ne = A[Z];
        return ne?.behavior === "allow" && ne.decisionReason?.type === "rule";
      });
      let J = A.some(Z => Z.behavior !== "allow");
      let Q = O.behavior === "ask" && !O.bashAllowRuleOverridable;
      if (!K && !J && !Q && d.behavior !== "allow") {
        let Z = new Set(M.filter(oe => {
          let ee = A[oe];
          return ee?.behavior === "allow" && ee.decisionReason?.type === "rule";
        }).map(oe => h[oe].trim()));
        let ne = ryo(e, r, Z);
        if (ne.behavior === "ask") {
          return ne;
        }
      }
    }
    let L = A.find(K => K.behavior === "ask");
    let P = Bn(A, K => K.behavior !== "allow");
    if (O.behavior === "ask" && L === undefined && !O.bashAllowRuleOverridable) {
      return O;
    }
    if (L !== undefined && P === 1) {
      return L;
    }
    if (d.behavior === "allow") {
      return d;
    }
    if (A.every(K => K.behavior === "allow")) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "subcommandResults",
          reasons: new Map(A.map((K, J) => [h[J], K]))
        }
      };
    }
    let F = null;
    if (n !== Gmt) {
      if (F = await n(e.command, t.abortController.signal, t.options.isNonInteractiveSession), t.abortController.signal.aborted) {
        throw new xc();
      }
    }
    if (r = getToolPermissionContext(t), h.length === 1) {
      return await HDa({
        command: h[0]
      }, r, F, S, g[0], b, s.bareAssignmentNames);
    }
    let H = [];
    for (let K = 0; K < h.length; K++) {
      let J = h[K];
      H.push(await HDa({
        ...e,
        command: J
      }, r, F?.subcommandPrefixes.get(J), S, g[K], E && K === 0 ? m : b, s.bareAssignmentNames));
    }
    let U = {
      deny: 3,
      ask: 2,
      passthrough: 1,
      allow: 0
    };
    let N = new Map();
    for (let K = 0; K < h.length; K++) {
      let J = h[K];
      let Q = H[K];
      let Z = N.get(J);
      let ne = U[Q.behavior];
      let oe = Z ? U[Z.behavior] : -1;
      if (!Z || ne > oe || ne === oe && findSafetyCheckReason(Q.decisionReason) !== undefined && findSafetyCheckReason(Z.decisionReason) === undefined) {
        N.set(J, Q);
      }
    }
    if (H.every(K => K.behavior === "allow")) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "subcommandResults",
          reasons: N
        }
      };
    }
    let W = new Map();
    for (let K = 0; K < H.length; K++) {
      let J = h[K];
      let Q = H[K];
      if (Q.behavior === "ask" || Q.behavior === "passthrough") {
        let Z = "suggestions" in Q ? Q.suggestions : undefined;
        let ne = qGt(Z);
        for (let oe of ne) {
          let ee = jp(oe);
          W.set(ee, oe);
        }
        if (Q.behavior === "ask" && ne.length === 0 && Q.decisionReason?.type !== "rule") {
          for (let oe of qGt(OMe(J))) {
            let ee = jp(oe);
            W.set(ee, oe);
          }
        }
      }
    }
    let j = {
      type: "subcommandResults",
      reasons: N
    };
    let z = Array.from(W.values()).slice(0, 5);
    let V = z.length > 0 ? [{
      type: "addRules",
      rules: z,
      behavior: "allow",
      destination: "localSettings"
    }] : undefined;
    return {
      behavior: L !== undefined ? "ask" : "passthrough",
      message: createPermissionRequestMessage_export(xl.name, j),
      decisionReason: j,
      suggestions: V
    };
  }
  function Y5e(e) {
    if (e.startsWith("git ") || e === "git") {
      return true;
    }
    let t = YG(e);
    let n = uE(t);
    if (n[0] === "git") {
      return true;
    }
    if (n[0] === "xargs" && n.includes("git")) {
      return true;
    }
    return false;
  }
  function npe(e) {
    let t = uE(YG(e))[0];
    return t === "cd" || t === "pushd" || t === "popd" || t === "chdir";
  }
  function myo(e) {
    return Uy(e).some(t => npe(t.trim()));
  }
  var S3n;
  var wM;
  var T3n;
  var v3n;
  var YGt;
  var BDa;
  var FMp;
  var UMp;
  var BMp;
  var $Da;
  var C3n = (e, t) => {
    let n = e.command.trim();
    let {
      matchingDenyRules: r,
      matchingAskRules: o,
      matchingAllowRules: s
    } = DMe(e, t, "exact");
    if (r[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${xl.name} with command ${n} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: r[0]
        }
      };
    }
    if (o[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name),
        decisionReason: {
          type: "rule",
          rule: o[0]
        }
      };
    }
    if (s[0] !== undefined) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "rule",
          rule: s[0]
        }
      };
    }
    let i = {
      type: "other",
      reason: "This command requires approval",
      bashMissKind: "no-rule-match"
    };
    return {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export(xl.name, i),
      decisionReason: i,
      suggestions: OMe(n)
    };
  };
  var YDa = (e, t, n, r, o = Nt(), s = []) => {
    let i = e.command.trim();
    let a = C3n(e, t);
    if (a.behavior === "deny" || a.behavior === "ask") {
      return a;
    }
    let {
      matchingDenyRules: l,
      matchingAskRules: c,
      matchingAllowRules: u
    } = DMe(e, t, "prefix", {
      skipCompoundCheck: r !== undefined,
      astCommand: r
    });
    if (l[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${xl.name} with command ${i} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: l[0]
        }
      };
    }
    if (c[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export(xl.name),
        decisionReason: {
          type: "rule",
          rule: c[0]
        }
      };
    }
    let d = h3n(e, o, t, n, r?.redirects, r ? [r] : undefined);
    if (d.behavior === "deny" || d.behavior === "ask" && !d.bashAllowRuleOverridable) {
      return d;
    }
    if (a.behavior === "allow") {
      return a;
    }
    if (u[0] !== undefined) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "rule",
          rule: u[0]
        }
      };
    }
    if (d.behavior === "ask") {
      return d;
    }
    let p = hDa(e, t);
    if (p.behavior !== "passthrough") {
      return p;
    }
    let m = LDa(e, t);
    if (m.behavior !== "passthrough") {
      return m;
    }
    let f = uGt();
    if (xl.isReadOnly(e) && !LMp(e, r) && !s.some(g => !tEe(g) && (f === null || f.vZc(g)))) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "other",
          reason: "Read-only command is allowed"
        }
      };
    }
    let h = {
      type: "other",
      reason: "This command requires approval",
      bashMissKind: "no-rule-match"
    };
    return {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export(xl.name, h),
      decisionReason: h,
      suggestions: OMe(i)
    };
  };
  var jMp;
  var qDa;
  function ZMp(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function rMa(e) {
    if (!ZMp(e)) {
      return null;
    }
    let t = {
      ...e
    };
    let n = [];
    if ("timeout_ms" in t && !("timeout" in t)) {
      let r = t.timeout_ms;
      if (typeof r === "number" || typeof r === "string" && /^\d+$/.test(r)) {
        t.timeout = r;
        n.push("timeout_ms");
      }
      delete t.timeout_ms;
    }
    return n.length ? {
      input: t,
      shapeClass: n.join(",")
    } : null;
  }
  function nNp(e) {
    let t = sNp(e);
    if (t === "git") {
      let r = rNp(e);
      if (r === "diff" || r === "grep") {
        return (o, s, i) => ({
          isError: o >= 2,
          message: o === 1 ? r === "grep" ? "No matches found" : "Files differ" : undefined
        });
      }
    }
    let n = tNp.get(t);
    return n !== undefined ? n : eNp;
  }
  function rNp(e) {
    let r = (Uy(e).at(-1) || e).trim().split(/\s+/);
    if (r[0] !== "git") {
      return;
    }
    for (let o = 1; o < r.length; o++) {
      let s = r[o];
      if (s.startsWith("-")) {
        if (s === "-C" || s === "-c") {
          o++;
        }
        continue;
      }
      return s;
    }
    return;
  }
  function oNp(e) {
    return e.trim().split(/\s+/)[0] || "";
  }
  function sNp(e) {
    let n = Uy(e).at(-1) || e;
    return oNp(n);
  }
  function oMa(e, t, n, r) {
    let s = nNp(e)(t, n, r);
    return {
      isError: s.isError,
      message: s.message
    };
  }
  var eNp = (e, t, n) => ({
    isError: e !== 0,
    message: e !== 0 ? `Command failed with exit code ${e}` : undefined
  });
  var tNp;
  var sMa = __lazy(() => {
    bU();
    tNp = new Map([["grep", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "No matches found" : undefined
    })], ["rg", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "No matches found" : undefined
    })], ["egrep", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "No matches found" : undefined
    })], ["fgrep", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "No matches found" : undefined
    })], ["find", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "Some directories were inaccessible" : undefined
    })], ["diff", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "Files differ" : undefined
    })], ["test", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "Condition is false" : undefined
    })], ["[", (e, t, n) => ({
      isError: e >= 2,
      message: e === 1 ? "Condition is false" : undefined
    })]]);
  });
  function dNp(e) {
    if (/[|<>]/.test(e)) {
      return [];
    }
    let t;
    try {
      t = Uy(e);
    } catch {
      return [];
    }
    if (t.length === 0) {
      return [];
    }
    let n = [];
    for (let r of t) {
      let o = pNp(r) ?? fNp(r) ?? hNp(r) ?? gNp(r) ?? (t.length === 1 ? TNp(r) ?? RNp(r) : null);
      if (o) {
        n.push(o);
      } else if (t.length > 1 && !uNp.test(r)) {
        return [];
      }
    }
    return n;
  }
  function pNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    if (t[0] !== "sed") {
      return null;
    }
    let n = false;
    let r = null;
    let o = null;
    for (let a = 1; a < t.length; a++) {
      let l = t[a];
      if (l.startsWith("-")) {
        if (l.startsWith("--")) {
          if (l === "--in-place" || l.startsWith("--in-place=")) {
            return null;
          }
          if (l === "--expression") {
            return null;
          }
          if (l === "--quiet" || l === "--silent") {
            n = true;
          }
        } else {
          if (l.includes("i")) {
            return null;
          }
          if (l === "-e") {
            return null;
          }
          if (l.includes("n")) {
            n = true;
          }
        }
        continue;
      }
      if (r === null) {
        r = l;
      } else if (o === null) {
        o = l;
      } else {
        return null;
      }
    }
    if (!n || r === null || o === null) {
      return null;
    }
    let s = lNp.exec(r);
    if (s) {
      return {
        filePath: o,
        startLine: Number(s[1]),
        endLine: Number(s[2])
      };
    }
    let i = cNp.exec(r);
    if (i) {
      let a = Number(i[1]);
      return {
        filePath: o,
        startLine: a,
        endLine: a
      };
    }
    return null;
  }
  function fNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    let n = mNp.get(t[0] ?? "");
    if (n === undefined) {
      return null;
    }
    let r = null;
    for (let o = 1; o < t.length; o++) {
      let s = t[o];
      if (s.startsWith("-") && s !== "-") {
        if (!n.vZc(s)) {
          return null;
        }
        continue;
      }
      if (r !== null) {
        return null;
      }
      r = s;
    }
    if (r === null || r === "-") {
      return null;
    }
    return {
      filePath: r,
      startLine: undefined,
      endLine: undefined
    };
  }
  function iMa(e, t) {
    let n = null;
    let r = null;
    for (let o = 1; o < e.length; o++) {
      let s = e[o];
      if (s === "-n" || s === "--lines") {
        let i = e[++o];
        if (i === undefined) {
          return null;
        }
        if (!/^\d+$/.test(i)) {
          return null;
        }
        n = Number(i);
        continue;
      }
      if (s.startsWith("--lines=")) {
        let i = s.slice(8);
        if (!/^\d+$/.test(i)) {
          return null;
        }
        n = Number(i);
        continue;
      }
      if (/^-n\d+$/.test(s)) {
        n = Number(s.slice(2));
        continue;
      }
      if (/^-\d+$/.test(s)) {
        n = Number(s.slice(1));
        continue;
      }
      if (s.startsWith("-")) {
        return null;
      }
      if (r !== null) {
        return null;
      }
      r = s;
    }
    if (r === null || r === "-") {
      return null;
    }
    if (n === 0) {
      return null;
    }
    return {
      count: n ?? t,
      filePath: r
    };
  }
  function hNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    if (t[0] !== "head") {
      return null;
    }
    let n = iMa(t, 10);
    if (n === null) {
      return null;
    }
    return {
      filePath: n.filePath,
      startLine: 1,
      endLine: n.count
    };
  }
  function gNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    if (t[0] !== "tail") {
      return null;
    }
    let n = iMa(t, 10);
    if (n === null) {
      return null;
    }
    return {
      filePath: n.filePath,
      startLine: undefined,
      endLine: undefined,
      tailLines: n.count
    };
  }
  function TNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    if (t[0] !== "grep" && t[0] !== "egrep" && t[0] !== "fgrep") {
      return null;
    }
    let n = null;
    let r = null;
    for (let o = 1; o < t.length; o++) {
      let s = t[o];
      if (s.startsWith("-") && s !== "-") {
        if (s === "-A" || s === "-B" || s === "-C") {
          let i = t[++o];
          if (i === undefined || !/^\d+$/.test(i)) {
            return null;
          }
          continue;
        }
        if (_Np.test(s) || bNp.test(s) || yNp.test(s) || SNp.vZc(s)) {
          continue;
        }
        return null;
      }
      if (n === null) {
        n = s;
      } else if (r === null) {
        r = s;
      } else {
        return null;
      }
    }
    if (n === null || r === null || r === "-") {
      return null;
    }
    if (/[*?[{]/.test(r)) {
      return null;
    }
    return {
      filePath: r,
      startLine: undefined,
      endLine: undefined,
      requiresExitZero: true
    };
  }
  function RNp(e) {
    let t;
    try {
      t = uE(e);
    } catch {
      return null;
    }
    if (t[0] !== "rg") {
      return null;
    }
    let n = null;
    let r = null;
    for (let o = 1; o < t.length; o++) {
      let s = t[o];
      if (s.startsWith("-") && s !== "-") {
        if (s === "-A" || s === "-B" || s === "-C") {
          let i = t[++o];
          if (i === undefined || !/^\d+$/.test(i)) {
            return null;
          }
          continue;
        }
        if (s === "--after-context" || s === "--before-context" || s === "--context") {
          let i = t[++o];
          if (i === undefined || !/^\d+$/.test(i)) {
            return null;
          }
          continue;
        }
        if (vNp.test(s) || wNp.test(s) || ENp.test(s) || CNp.vZc(s)) {
          continue;
        }
        return null;
      }
      if (n === null) {
        n = s;
      } else if (r === null) {
        r = s;
      } else {
        return null;
      }
    }
    if (n === null || r === null || r === "-") {
      return null;
    }
    if (/[*?[{]/.test(r)) {
      return null;
    }
    return {
      filePath: r,
      startLine: undefined,
      endLine: undefined,
      requiresExitZero: true
    };
  }
  async function aMa(e, t, n, r) {
    let o = dNp(e).filter(i => !i.requiresExitZero || r === 0);
    if (o.length === 0) {
      return;
    }
    let s = zt();
    await Promise.all(o.map(async i => {
      let a = us(i.filePath);
      if (t.get(a)) {
        return;
      }
      try {
        let l = await s.stat(a);
        if (l.size > 10485760) {
          return;
        }
        if (n.aborted) {
          return;
        }
        let c = await s.readFile(a, {
          encoding: "utf8"
        });
        let u;
        let d;
        let p;
        if (i.tailLines !== undefined) {
          let m = c.split(`
`);
          if (m.length > 0 && m.at(-1) === "") {
            m.pop();
          }
          if (m.length === 0) {
            return;
          }
          let f = Math.min(i.tailLines, m.length);
          let h = m.length - f + 1;
          u = m.slice(h - 1).join(`
`);
          d = h;
          p = f;
        } else if (i.startLine === undefined) {
          u = c;
        } else {
          let m = c.split(`
`);
          let f = Math.max(1, i.startLine);
          let h = Math.max(f, i.endLine ?? f);
          if (f > m.length) {
            return;
          }
          u = m.slice(f - 1, h).join(`
`);
          d = f;
          p = h - f + 1;
        }
        t.set(a, {
          content: u,
          timestamp: Math.floor(l.mtimeMs),
          offset: d,
          limit: p
        });
      } catch {}
    }));
  }
  var lNp;
  var cNp;
  var uNp;
  var mNp;
  var yNp;
  var _Np;
  var bNp;
  var SNp;
  var ENp;
  var vNp;
  var wNp;
  var CNp;
  var lMa = __lazy(() => {
    bU();
    ku();
    lNp = /^(\d+),(\d+)p$/;
    cNp = /^(\d+)p$/;
    uNp = /^\s*(echo|printf|true|:)\b/;
    mNp = new Map([["cat", new Set(["-n", "--number"])], ["nl", new Set()], ["bat", new Set(["-n", "--number", "-p", "--plain"])], ["batcat", new Set(["-n", "--number", "-p", "--plain"])]]);
    yNp = /^-[niwxEFGPHh]+$/;
    _Np = /^-[ABC]\d+$/;
    bNp = /^--(?:after-context|before-context|context)=\d+$/;
    SNp = new Set(["--line-number", "--ignore-case", "--word-regexp", "--line-regexp", "--extended-regexp", "--fixed-strings", "--basic-regexp", "--perl-regexp", "--with-filename", "--no-filename", "--color=never", "--color=auto"]);
    ENp = /^-[iSswxFnNHUP]+$/;
    vNp = /^-[ABC]\d+$/;
    wNp = /^--(?:after-context|before-context|context)=\d+$/;
    CNp = new Set(["--ignore-case", "--smart-case", "--case-sensitive", "--word-regexp", "--line-regexp", "--fixed-strings", "--line-number", "--no-line-number", "--with-filename", "--no-filename", "--multiline", "--pcre2"]);
  });
  var cMa = {};