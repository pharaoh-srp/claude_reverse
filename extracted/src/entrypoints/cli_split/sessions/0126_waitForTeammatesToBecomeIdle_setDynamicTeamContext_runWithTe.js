  __export(UWr, {
    waitForTeammatesToBecomeIdle: () => waitForTeammatesToBecomeIdle,
    setDynamicTeamContext: () => setDynamicTeamContext,
    runWithTeammateContext: () => runWithTeammateContext,
    isTeammate: () => isTeammate,
    isTeamLead: () => isTeamLead,
    isPlanModeRequired: () => isPlanModeRequired,
    isNestedInteractiveClaudeSession: () => isNestedInteractiveClaudeSession,
    isModelDrivenSession: () => isModelDrivenSession,
    isInProcessTeammate: () => isInProcessTeammate,
    hasWorkingInProcessTeammates: () => hasWorkingInProcessTeammates,
    hasNonLeadTeammate: () => hasNonLeadTeammate,
    hasActiveInProcessTeammates: () => hasActiveInProcessTeammates,
    getTeammateContext: () => getTeammateContext,
    getTeammateColor: () => getTeammateColor,
    getTeamName: () => getTeamName,
    getParentSessionId: () => getParentSessionId_export,
    getDynamicTeamContext: () => getDynamicTeamContext,
    getAgentName: () => getAgentName,
    getAgentId: () => getAgentId,
    createTeammateContext: () => createTeammateContext,
    clearDynamicTeamContext: () => clearDynamicTeamContext,
    _tmuxGlobalEnvOutputHasMarker: () => _tmuxGlobalEnvOutputHasMarker,
    _setAmbientMarkerProbeForTesting: () => _setAmbientMarkerProbeForTesting
  });
  function getParentSessionId_export() {
    let e = getTeammateContext();
    if (e) {
      return e.parentSessionId;
    }
    return f8?.parentSessionId;
  }
  function setDynamicTeamContext(e) {
    f8 = e;
  }
  function clearDynamicTeamContext() {
    f8 = null;
  }
  function getDynamicTeamContext() {
    return f8;
  }
  function getAgentId() {
    let e = getTeammateContext();
    if (e) {
      return e.agentId;
    }
    return f8?.agentId;
  }
  function getAgentName() {
    let e = getTeammateContext();
    if (e) {
      return e.agentName;
    }
    return f8?.agentName;
  }
  function getTeamName(e) {
    let t = getTeammateContext();
    if (t) {
      return t.teamName;
    }
    if (f8?.teamName) {
      return f8.teamName;
    }
    return e?.teamName;
  }
  function isTeammate() {
    if (getTeammateContext()) {
      return true;
    }
    return !!(f8?.agentId && f8?.teamName);
  }
  function isModelDrivenSession(e) {
    return e !== undefined || isTeammate() || Me.CLAUDE_CODE_CHILD_SESSION;
  }
  function isNestedInteractiveClaudeSession() {
    if (Me.CLAUDE_CODE_FORCE_SESSION_PERSISTENCE) {
      return false;
    }
    if (!(Me.CLAUDE_CODE_CHILD_SESSION && getIsInteractive() && !isTeammate())) {
      return false;
    }
    return !owd();
  }
  function _setAmbientMarkerProbeForTesting(e) {
    NWr = e;
    iRn = null;
  }
  function owd() {
    if (iRn === null) {
      iRn = swd();
    }
    return iRn;
  }
  function swd() {
    if (NWr) {
      try {
        return NWr();
      } catch {
        return false;
      }
    }
    if (!Me.TMUX) {
      return false;
    }
    let e;
    try {
      e = _pi.spawnSync("tmux", ["show-environment", "-g", "CLAUDE_CODE_CHILD_SESSION"], {
        encoding: "utf8",
        timeout: 250,
        stdio: ["ignore", "pipe", "ignore"],
        windowsHide: true
      });
    } catch {
      return false;
    }
    if (e.status !== 0) {
      return false;
    }
    return _tmuxGlobalEnvOutputHasMarker(e.stdout);
  }
  function _tmuxGlobalEnvOutputHasMarker(e) {
    return e.split(`
`).some(t => t.startsWith("CLAUDE_CODE_CHILD_SESSION="));
  }
  function getTeammateColor() {
    let e = getTeammateContext();
    if (e) {
      return e.color;
    }
    return f8?.color;
  }
  function isPlanModeRequired() {
    let e = getTeammateContext();
    if (e) {
      return e.planModeRequired;
    }
    if (f8 !== null) {
      return f8.planModeRequired;
    }
    return Me.CLAUDE_CODE_PLAN_MODE_REQUIRED;
  }
  function hasNonLeadTeammate(e) {
    if (!e) {
      return false;
    }
    let {
      leadAgentId: t,
      teammates: n
    } = e;
    return Object.keys(n).some(r => r !== t);
  }
  function isTeamLead(e) {
    if (!e?.leadAgentId) {
      return false;
    }
    let t = getAgentId();
    let n = e.leadAgentId;
    if (t === n) {
      return true;
    }
    if (!t) {
      return true;
    }
    return false;
  }
  function hasActiveInProcessTeammates(e) {
    for (let t of Object.values(e.tasks)) {
      if (t.type === "in_process_teammate" && t.status === "running") {
        return true;
      }
    }
    return false;
  }
  function hasWorkingInProcessTeammates(e) {
    for (let t of Object.values(e.tasks)) {
      if (t.type === "in_process_teammate" && t.status === "running" && !t.isIdle) {
        return true;
      }
    }
    return false;
  }
  function waitForTeammatesToBecomeIdle(e, t) {
    let n = [];
    for (let [r, o] of Object.entries(t.tasks)) {
      if (o.type === "in_process_teammate" && o.status === "running" && !o.isIdle) {
        n.push(r);
      }
    }
    if (n.length === 0) {
      return Promise.resolve();
    }
    return new Promise(r => {
      let o = n.length;
      let s = () => {
        if (o--, o === 0) {
          r();
        }
      };
      e(i => {
        let a = {
          ...i.tasks
        };
        for (let l of n) {
          let c = a[l];
          if (c && c.type === "in_process_teammate") {
            if (c.isIdle) {
              s();
            } else {
              a[l] = {
                ...c,
                onIdleCallbacks: [...(c.onIdleCallbacks ?? []), s]
              };
            }
          }
        }
        return {
          ...i,
          tasks: a
        };
      });
    });
  }
  var _pi;
  var f8 = null;
  var iRn = null;
  var NWr = null;
  var qp = __lazy(() => {
    Uj();
    at();
    pr();
    Uj();
    _pi = require("child_process");
  });
  function getCurrentWorktreeSession() {
    return jLt;
  }
  function dst(e) {
    if (jLt = e, e && !e.enteredExisting) {
      BWr = e.worktreeName;
    }
  }
  function Spi() {
    if (jLt) {
      return jLt.enteredExisting ? null : jLt.worktreeName;
    }
    return BWr;
  }
  function R_e() {
    BWr = null;
  }
  function WY() {
    return null;
  }
  var jLt = null;
  var BWr = null;
  function WLt() {
    return x_e.join(er(), "sessions");
  }
  function h0e() {
    let e = process.env.CLAUDE_CODE_SESSION_KIND;
    if (e === "bg" || e === "daemon" || e === "daemon-worker") {
      return e;
    }
    return;
  }
  function li() {
    return h0e() === "bg";
  }
  function Bj() {
    return li() || WY() !== null;
  }
  function pst() {
    return WY()?.jobDir ?? Me.CLAUDE_JOB_DIR;
  }
  function uRn() {
    return process.env.CLAUDE_BG_BACKEND === "daemon";
  }
  async function vpi() {
    try {
      await h2.unlink(x_e.join(WLt(), ".fleetview-heartbeat"));
    } catch {}
  }
  function dRn() {
    let e = Date.now();
    if (aRn && e - aRn.at < 1000) {
      return aRn.value;
    }
    let t = false;
    try {
      let {
        mtimeMs: n
      } = cRn.statSync(x_e.join(WLt(), ".fleetview-heartbeat"));
      t = e - n < 5000;
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`[concurrentSessions] heartbeat stat failed: ${he(n)}`);
      }
    }
    aRn = {
      at: e,
      value: t
    };
    return t;
  }
  async function wpi() {
    if (getAgentId() != null || isNestedInteractiveClaudeSession()) {
      return false;
    }
    let e = Promise.withResolvers();
    HWr = e.promise;
    let t = h0e() ?? "interactive";
    let n = process.env.CLAUDE_CODE_SESSION_NAME;
    let r = WLt();
    let o = x_e.join(r, `${process.pid}.json`);
    process.on("exit", () => {
      try {
        cRn.unlinkSync(o);
      } catch {}
    });
    Ti(async () => {
      try {
        await h2.unlink(o);
      } catch {}
    });
    try {
      await h2.mkdir(r, {
        recursive: true,
        mode: 448
      });
      await h2.chmod(r, 448);
      await h2.writeFile(o, De({
        pid: process.pid,
        sessionId: getSessionId(),
        cwd: getOriginalCwd(),
        startedAt: Date.now(),
        procStart: await getProcessStartTimeAsync(process.pid),
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        peerProtocol: 1,
        kind: t,
        entrypoint: process.env.CLAUDE_CODE_ENTRYPOINT,
        ...undefined,
        ...{},
        ...{
          ...(n || t !== "interactive" ? {
            name: n
          } : {
            name: hpi(getOriginalCwd()),
            nameSource: "derived"
          }),
          logPath: process.env.CLAUDE_CODE_SESSION_LOG,
          agent: process.env.CLAUDE_CODE_AGENT,
          jobId: t === "bg" && process.env.CLAUDE_JOB_DIR ? x_e.basename(process.env.CLAUDE_JOB_DIR) : undefined
        }
      }));
      onSessionSwitch(i => {
        qLt({
          sessionId: i
        });
      });
      onOriginalCwdChange(i => {
        qLt({
          cwd: i
        });
      });
      return true;
    } catch (s) {
      logForDebugging(`[concurrentSessions] register failed: ${he(s)}`);
      return false;
    } finally {
      e.resolve();
    }
  }
  async function qLt(e) {
    let t = x_e.join(WLt(), `${process.pid}.json`);
    let n = HWr.then(async () => {
      try {
        let r = qt(await h2.readFile(t, "utf8"));
        await h2.writeFile(t, De({
          ...r,
          ...e
        }));
      } catch (r) {
        logForDebugging(`[concurrentSessions] updatePidFile failed: ${he(r)}`);
      }
    });
    HWr = n;
    await n;
  }
  async function GY(e) {
    if (!e) {
      return;
    }
    await qLt({
      name: e,
      nameSource: undefined,
      updatedAt: Date.now()
    });
  }
  async function Cpi(e) {
    await qLt({
      bridgeSessionId: e
    });
  }
  async function pRn(e) {
    let t = Date.now();
    await qLt({
      ...e,
      updatedAt: t,
      ...(e.status !== undefined && {
        statusUpdatedAt: t
      })
    });
  }
  async function GLt() {
    let e = WLt();
    let t;
    try {
      t = await h2.readdir(e);
    } catch (r) {
      if (!Io(r)) {
        logForDebugging(`[concurrentSessions] readdir failed: ${he(r)}`);
      }
      return 0;
    }
    let n = 0;
    for (let r of t) {
      if (!/^\d+\.json$/.test(r)) {
        continue;
      }
      let o = parseInt(r.slice(0, -5), 10);
      if (o === process.pid) {
        n++;
        continue;
      }
      if (isProcessRunning(o)) {
        n++;
      } else if (Wt() !== "wsl") {
        let s = x_e.join(e, r);
        let i = $Wr ? null : await h2.readFile(s, "utf8").then(l => lwd().safeParse(qt(l))).catch(() => null);
        if ((await h2.unlink(s).then(() => true, () => false)) && i?.success && i.data.kind === "interactive") {
          Tpi.push(i.data);
          logForDebugging(`Prior session exited uncleanly: ${i.data.sessionId} (v${i.data.version ?? "?"})`);
          logEvent("tengu_unclean_exit", {
            session_age_sec: Math.round((Date.now() - i.data.startedAt) / 1000),
            prior_version: i.data.version ?? "unknown",
            on_current_version: i.data.version === {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION,
            prior_session_id: br(i.data.sessionId)
          });
        }
      }
    }
    if (!$Wr) {
      Tpi.sort((r, o) => o.startedAt - r.startedAt);
      $Wr = true;
    }
    return n;
  }
  var cRn;
  var h2;
  var x_e;
  var lwd;
  var Tpi;
  var $Wr = false;
  var aRn;
  var HWr;
  var yd = __lazy(() => {
    qg();
    at();
    Ot();
    B_();
    hd();
    je();
    gpi();
    pr();
    gn();
    dt();
    ji();
    Tb();
    Cs();
    qp();
    cRn = require("fs");
    h2 = require("fs/promises");
    x_e = require("path");
    lwd = we(() => Ke.object({
      pid: Ke.number(),
      sessionId: Ke.string(),
      cwd: Ke.string().optional(),
      startedAt: Ke.number(),
      version: Ke.string().optional(),
      kind: Ke.enum(["interactive", "bg", "daemon", "daemon-worker"])
    }));
    Tpi = [];
    HWr = Promise.resolve();
  });
  var mRn;
  var fRn = __lazy(() => {
    mRn = Symbol("secureStorage.READ_FAILED");
  });