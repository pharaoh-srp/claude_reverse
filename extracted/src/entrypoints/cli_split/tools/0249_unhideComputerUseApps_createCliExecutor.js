  __export(tba, {
    unhideComputerUseApps: () => unhideComputerUseApps,
    createCliExecutor: () => createCliExecutor
  });
  function Imo(e, t, n) {
    let r = Math.round(e * n);
    let o = Math.round(t * n);
    return $Hn(r, o, ymo);
  }
  async function Pmo() {
    let {
      stdout: e,
      code: t
    } = await execFileNoThrow("pbpaste", [], {
      useCwd: false
    });
    if (t !== 0) {
      throw Error(`pbpaste exited with code ${t}`);
    }
    return e;
  }
  async function Omo(e) {
    let {
      code: t
    } = await execFileNoThrow("pbcopy", [], {
      input: e,
      useCwd: false
    });
    if (t !== 0) {
      throw Error(`pbcopy exited with code ${t}`);
    }
  }
  function Z_a(e) {
    if (e.length !== 1) {
      return false;
    }
    let t = e[0].toLowerCase();
    return t === "escape" || t === "esc";
  }
  async function jpt(e, t, n) {
    await e.moveMouse(t, n, false);
    await sleep(50);
  }
  async function eba(e, t) {
    let n;
    while ((n = t.pop()) !== undefined) {
      try {
        await e.key(n, "release");
      } catch {}
    }
  }
  async function uvp(e, t, n) {
    let r = [];
    try {
      for (let o of t) {
        await e.key(o, "press");
        r.push(o);
      }
      return await n();
    } finally {
      await eba(e, r);
    }
  }
  async function dvp(e, t) {
    let n;
    try {
      n = await Pmo();
    } catch {
      logForDebugging("[computer-use] pbpaste before paste failed; proceeding without restore");
    }
    try {
      if (await Omo(t), (await Pmo()) !== t) {
        throw Error("Clipboard write did not round-trip.");
      }
      await e.keys(["command", "v"]);
      await sleep(100);
    } finally {
      if (typeof n === "string") {
        try {
          await Omo(n);
        } catch {
          logForDebugging("[computer-use] clipboard restore after paste failed");
        }
      }
    }
  }
  async function pvp(e, t, n, r) {
    if (!r) {
      await jpt(e, t, n);
      return;
    }
    let o = await e.mouseLocation();
    let s = t - o.x;
    let i = n - o.y;
    let a = Math.hypot(s, i);
    if (a < 1) {
      return;
    }
    let l = Math.min(a / 2000, 0.5);
    if (l < 0.03) {
      await jpt(e, t, n);
      return;
    }
    let c = 60;
    let u = 1000 / c;
    let d = Math.floor(l * c);
    for (let p = 1; p <= d; p++) {
      let m = p / d;
      let f = 1 - Math.pow(1 - m, 3);
      if (await e.moveMouse(Math.round(o.x + s * f), Math.round(o.y + i * f), false), p < d) {
        await sleep(u);
      }
    }
    await sleep(50);
  }
  function createCliExecutor(e) {
    throw Error("createCliExecutor called on linux. Computer control is macOS-only.");
  }
  async function unhideComputerUseApps(e) {
    if (e.length === 0) {
      return;
    }
    await Vq().apps.unhide([...e]);
  }
  var Nmo = __lazy(() => {
    Hpt();
    je();
    dt();
    ji();
    Cbe();
    UHn();
  });
  async function* $De(e) {
    let n = e.getAppState().computerUseMcpState?.hiddenDuringTurn;
    let r = !!(n && n.size > 0);
    let o = MHn();
    if (!r && !o) {
      return;
    }
    let s = false;
    if (r) {
      let {
        unhideComputerUseApps: i
      } = await Promise.resolve().then(() => (Nmo(), tba));
      let a = false;
      let l = i([...n]).then(() => {
        a = true;
      }, d => {
        a = true;
        logForDebugging(`[Computer Use MCP] auto-unhide failed: ${he(d)}`);
      });
      let c = Promise.withResolvers();
      let u = setTimeout(c.resolve, 5000);
      if (await Promise.race([l, c.promise]).finally(() => clearTimeout(u)), !a) {
        s = true;
      }
      OTe(e.setAppState, d => d?.hiddenDuringTurn === undefined ? d : {
        ...d,
        hiddenDuringTurn: undefined
      });
    }
    if (o) {
      try {
        d_a();
      } catch (i) {
        logForDebugging(`[Computer Use MCP] unregisterEscHotkey failed: ${he(i)}`);
      }
      NHn();
      yield {
        type: "os_notification",
        message: "Claude is done using your computer",
        notificationType: "computer_use_exit"
      };
    }
    if (s) {
      Ae("computeruse_turn_cleanup", "unhide_timeout");
    } else {
      Pe("computeruse_turn_cleanup");
    }
  }
  var Lmo = __lazy(() => {
    ln();
    je();
    dt();
    hmo();
    UHn();
  });
  function nba(e) {
    return e?.kind === "human";
  }
  function BG(e) {
    return e === undefined || e.kind === "human";
  }
  function yU(e) {
    return e === undefined || e.kind === "human" || e.kind === "auto-continuation";
  }
  function MTe(e) {
    return e.type === "user" && !e.isMeta && e.toolUseResult === undefined;
  }
  function rba(e) {
    return MTe(e) || e.type === "attachment" && e.attachment.type === "queued_command" && e.attachment.origin?.kind === "human";
  }
  function qpt(e) {
    return e.type === "user" && !e.isMeta && e.toolUseResult === undefined && !e.isCompactSummary && BG(e.origin);
  }
  function oba(e, t) {
    if (t === 0) {
      return;
    }
    logEvent("tengu_human_origin_presumed", {
      consumer: e,
      count_bucket: t === 1 ? "1" : t <= 5 ? "2-5" : "6+"
    });
  }
  var S$ = __lazy(() => {
    Ot();
  });
  function Fmo(e, t) {
    let n = Object.create(null);
    let r = 0;
    for (let o of e) {
      let s = t(o, r++);
      if (n[s] === undefined) {
        n[s] = [];
      }
      n[s].push(o);
    }
    return n;
  }
  function GI(e) {
    return e.agentId === mainAgentId();
  }
  var Wpt = __lazy(() => {
    at();
  });
  function iba(e) {
    sba = e;
  }
  function aba() {
    return sba;
  }
  var sba = null;
  function NTe(e, t) {
    let n = getSessionId();
    let r = {
      type: "queue-operation",
      operation: e,
      timestamp: new Date().toISOString(),
      sessionId: n,
      ...(t !== undefined && {
        content: t
      })
    };
    recordQueueOperation(r);
  }
  function gvp(e) {
    return !hvp.vZc(e);
  }
  function $G(e) {
    return gvp(e.mode) && !e.isMeta && yU(e.origin);
  }
  function uba(e, t) {
    let n = typeof t === "boolean" ? t : false;
    if (e.origin?.kind === "channel") {
      return true;
    }
    if (e.origin?.kind === "task-notification") {
      return true;
    }
    if (e.origin?.kind === "auto-continuation") {
      return true;
    }
    if (e.origin?.kind === "peer") {
      if (e.origin.senderTaskId !== undefined) {
        return true;
      }
      if (n) {
        return true;
      }
    }
    return $G(e);
  }
  function dba(e) {
    return typeof e.value === "string" && e.value.trim().startsWith("/") && !e.skipSlashCommands;
  }
  function lba(e) {
    return typeof e === "string" ? e : Tl(e, `
`);
  }
  function cba(e, t) {
    if (typeof e === "string") {
      return [];
    }
    let n = [];
    let r = 0;
    for (let o of e) {
      if (o.type === "image" && o.source.type === "base64") {
        n.push({
          id: t + r,
          type: "image",
          content: o.source.data,
          mediaType: o.source.media_type,
          filename: `image${r + 1}`
        });
        r++;
      }
    }
    return n;
  }
  function yvp() {
    let e = [];
    let t = Object.freeze([]);
    let n = Si();
    let r = new Set();
    function o() {
      t = Object.freeze([...e]);
      n.emit();
    }
    function s(P) {
      r.add(P);
    }
    function i(P) {
      return r.delete(P);
    }
    let a = null;
    function l(P) {
      a = P;
    }
    function c(P) {
      if (P === undefined || a === P) {
        a = null;
      }
    }
    function u(P) {
      return a !== null && a.some(P);
    }
    function d() {
      return t;
    }
    function p() {
      return [...e];
    }
    function m() {
      return e.length;
    }
    function f() {
      return Bn(e, GI);
    }
    function h() {
      return e.length > 0;
    }
    function g() {
      if (e.length > 0) {
        o();
      }
    }
    function y(P) {
      e.push({
        ...P,
        priority: P.priority ?? "next",
        timestamp: P.timestamp ?? new Date().toISOString()
      });
      o();
      NTe("enqueue", typeof P.value === "string" ? P.value : undefined);
    }
    function _(P) {
      e.push({
        ...P,
        priority: P.priority ?? "later",
        timestamp: P.timestamp ?? new Date().toISOString()
      });
      o();
      NTe("enqueue", typeof P.value === "string" ? P.value : undefined);
    }
    function b(P) {
      if (e.length === 0) {
        return;
      }
      let F = -1;
      let H = 1 / 0;
      for (let N = 0; N < e.length; N++) {
        let W = e[N];
        if (P && !P(W)) {
          continue;
        }
        let j = KHn[W.priority ?? "next"];
        if (j < H) {
          F = N;
          H = j;
        }
      }
      if (F === -1) {
        return;
      }
      let [U] = e.splice(F, 1);
      o();
      NTe("dequeue");
      return U;
    }
    function S() {
      if (e.length === 0) {
        return [];
      }
      let P = [...e];
      e.length = 0;
      o();
      for (let F of P) {
        NTe("dequeue");
      }
      return P;
    }
    function E(P) {
      if (e.length === 0) {
        return;
      }
      let F = -1;
      let H = 1 / 0;
      for (let U = 0; U < e.length; U++) {
        let N = e[U];
        if (P && !P(N)) {
          continue;
        }
        let W = KHn[N.priority ?? "next"];
        if (W < H) {
          F = U;
          H = W;
        }
      }
      if (F === -1) {
        return;
      }
      return e[F];
    }
    function C(P) {
      let F = [];
      let H = [];
      for (let U of e) {
        if (P(U)) {
          F.push(U);
        } else {
          H.push(U);
        }
      }
      if (F.length === 0) {
        return [];
      }
      e.length = 0;
      e.push(...H);
      o();
      for (let U of F) {
        NTe("dequeue");
      }
      return F;
    }
    function x(P) {
      if (P.length === 0) {
        return;
      }
      let F = e.length;
      for (let H = e.length - 1; H >= 0; H--) {
        if (P.includes(e[H])) {
          e.splice(H, 1);
        }
      }
      if (e.length !== F) {
        o();
      }
      for (let H of P) {
        NTe("remove");
      }
    }
    function A(P) {
      let F = [];
      for (let H = e.length - 1; H >= 0; H--) {
        if (P(e[H])) {
          F.unshift(e.splice(H, 1)[0]);
        }
      }
      if (F.length > 0) {
        o();
        for (let H of F) {
          NTe("remove");
        }
      }
      return F;
    }
    function k() {
      if (e.length === 0) {
        return;
      }
      let P = Fmo(e, F => F.mode);
      logForDebugging(`[clearCommandQueue] dropping ${e.length} queued command(s): ${Object.entries(P).map(([F, H]) => `${F}=${H.length}`).join(" ")}`, {
        level: "warn"
      });
      e.length = 0;
      o();
    }
    function I() {
      e.length = 0;
      t = Object.freeze([]);
      r.clear();
      c();
    }
    function O(P, F) {
      if (e.length === 0) {
        return;
      }
      let {
        editable: H = [],
        nonEditable: U = []
      } = Fmo([...e], K => $G(K) ? "editable" : "nonEditable");
      if (H.length === 0) {
        return;
      }
      let N = H.map(K => lba(K.value));
      let W = [...N, P].filter(Boolean).join(`
`);
      let j = N.join(`
`).length + 1 + F;
      let z = [];
      let V = Date.now();
      for (let K of H) {
        if (K.pastedContents) {
          for (let Q of Object.values(K.pastedContents)) {
            if (Q.type === "image") {
              z.push(Q);
            }
          }
        }
        let J = cba(K.value, V);
        z.push(...J);
        V += J.length;
      }
      for (let K of H) {
        NTe("popAll", typeof K.value === "string" ? K.value : undefined);
      }
      e.length = 0;
      e.push(...U);
      o();
      return {
        text: W,
        cursorOffset: j,
        images: z
      };
    }
    function M(P, F, H) {
      let N = e.filter($G)[P];
      if (!N) {
        return;
      }
      let W = lba(N.value);
      let j = [W, F].filter(Boolean).join(`
`);
      let z = W.length + 1 + H;
      let V = [];
      if (N.pastedContents) {
        for (let J of Object.values(N.pastedContents)) {
          if (J.type === "image") {
            V.push(J);
          }
        }
      }
      V.push(...cba(N.value, Date.now()));
      NTe("popOne", typeof N.value === "string" ? N.value : undefined);
      let K = e.indexOf(N);
      if (K !== -1) {
        e.splice(K, 1);
        o();
      }
      return {
        text: j,
        cursorOffset: z,
        images: V
      };
    }
    function L(P) {
      let F = KHn[P];
      return e.filter(H => KHn[H.priority ?? "next"] <= F);
    }
    return {
      subscribe: n.subscribe,
      getCommandQueueSnapshot: d,
      getCommandQueue: p,
      getCommandQueueLength: m,
      getMainThreadQueueLength: f,
      hasCommandsInQueue: h,
      recheckCommandQueue: g,
      enqueue: y,
      enqueuePendingNotification: _,
      dequeue: b,
      dequeueAll: S,
      peek: E,
      dequeueAllMatching: C,
      remove: x,
      removeByFilter: A,
      clearCommandQueue: k,
      resetCommandQueue: I,
      popAllEditable: O,
      popEditableAt: M,
      getCommandsByMaxPriority: L,
      markCancelPending: s,
      consumeCancelPending: i,
      setInFlightDrainBatch: l,
      clearInFlightDrainBatch: c,
      someInFlightDrainCommand: u
    };
  }
  function fba() {
    return Yh.getCommandQueue().some(e => GI(e) && $G(e));
  }
  var KHn;
  var hvp;
  var Yh;
  var pba;
  var mba;
  var LTe;
  var Gpt;
  var NV;
  var Umo;
  var Bmo;
  var Ude;
  var g7y;
  var __;
  var ud;
  var i5e;
  var y7y;
  var LV;
  var HDe;
  var hba;
  var gba;
  var yba;
  var _7y;
  var cWt;
  var _ba;
  var bba;
  var $mo;
  var Hmo;
  var jmo;
  var Rf = __lazy(() => {
    at();
    at();
    je();
    S$();
    ro();
    Wpt();
    fa();
    ph();
    KHn = {
      now: 0,
      next: 1,
      later: 2
    };
    hvp = new Set(["task-notification"]);
    Yh = yvp();
    pba = Yh.markCancelPending;
    mba = Yh.consumeCancelPending;
    LTe = Yh.subscribe;
    Gpt = Yh.getCommandQueueSnapshot;
    NV = Yh.getCommandQueue;
    Umo = Yh.getCommandQueueLength;
    Bmo = Yh.getMainThreadQueueLength;
    Ude = Yh.hasCommandsInQueue;
    g7y = Yh.recheckCommandQueue;
    __ = Yh.enqueue;
    ud = Yh.enqueuePendingNotification;
    i5e = Yh.dequeue;
    y7y = Yh.dequeueAll;
    LV = Yh.peek;
    HDe = Yh.dequeueAllMatching;
    hba = Yh.remove;
    gba = Yh.removeByFilter;
    yba = Yh.clearCommandQueue;
    _7y = Yh.resetCommandQueue;
    cWt = Yh.popAllEditable;
    _ba = Yh.popEditableAt;
    bba = Yh.getCommandsByMaxPriority;
    $mo = Yh.setInFlightDrainBatch;
    Hmo = Yh.clearInFlightDrainBatch;
    jmo = Yh.someInFlightDrainCommand;
    iba(e => __({
      agentId: mainAgentId(),
      mode: "prompt",
      value: `/${e}`
    }));
  });
  function bvp() {
    let e = $4();
    let t = e.getEntriesByType("mark");
    for (let n of t) {
      if (n.name.startsWith("headless_")) {
        e.clearMarks(n.name);
      }
    }
  }
  function Gmo() {
    if (!getIsNonInteractiveSession()) {
      return;
    }
    if (!Wmo) {
      return;
    }
    if (Vpt++, bvp(), $4().mark(`${"headless_"}turn_start`), YHn) {
      logForDebugging(`[headlessProfiler] Started turn ${Vpt}`);
    }
  }
  function vx(e) {
    if (!getIsNonInteractiveSession()) {
      return;
    }
    if (!Wmo) {
      return;
    }
    let t = $4();
    if (t.mark(`${"headless_"}${e}`), YHn) {
      logForDebugging(`[headlessProfiler] Checkpoint: ${e} at ${t.now().toFixed(1)}ms`);
    }
  }
  function Vmo() {
    if (!getIsNonInteractiveSession()) {
      return;
    }
    if (!Wmo) {
      return;
    }
    let n = $4().getEntriesByType("mark").filter(u => u.name.startsWith("headless_"));
    if (n.length === 0) {
      return;
    }
    let r = new Map();
    for (let u of n) {
      let d = u.name.slice(("headless_").length);
      r.set(d, u.startTime);
    }
    let o = r.get("turn_start");
    if (o === undefined) {
      return;
    }
    let s = {
      turn_number: Vpt
    };
    if (Vpt === 0) {
      for (let [u, [d, p]] of Object.entries({
        load_initial_messages_ms: ["before_loadInitialMessages", "after_loadInitialMessages"],
        system_prompt_ms: ["before_getSystemPrompt", "after_getSystemPrompt"],
        streaming_setup_ms: ["before_runHeadlessStreaming", "stdin_listen_started"],
        stdin_wait_ms: ["stdin_listen_started", "run_entry"]
      })) {
        let m = r.get(d);
        let f = r.get(p);
        if (m !== undefined && f !== undefined && f > m) {
          s[u] = Math.round(f - m);
        }
      }
    }
    let i = r.get("system_message_yielded");
    if (i !== undefined && Vpt === 0) {
      s.time_to_system_message_ms = Math.round(i);
    }
    let a = r.get("query_started");
    if (a !== undefined) {
      s.time_to_query_start_ms = Math.round(a - o);
    }
    let l = r.get("first_chunk");
    if (l !== undefined) {
      s.time_to_first_response_ms = Math.round(l - o);
    }
    let c = r.get("api_request_sent");
    if (a !== undefined && c !== undefined) {
      s.query_overhead_ms = Math.round(c - a);
    }
    if (s.checkpoint_count = n.length, process.env.CLAUDE_CODE_ENTRYPOINT) {
      s.entrypoint = process.env.CLAUDE_CODE_ENTRYPOINT;
    }
    if (Sba) {
      logEvent("tengu_headless_latency", s);
    }
    if (YHn) {
      logForDebugging(`[headlessProfiler] Turn ${Vpt} metrics: ${De(s)}`);
    }
  }
  var YHn;
  var Sba;
  var Wmo;
  var Vpt = -1;
  var dWt = __lazy(() => {
    at();
    Ot();
    je();
    gn();
    dun();
    YHn = st(process.env.CLAUDE_CODE_PROFILE_STARTUP);
    Sba = Math.random() < 0.05;
    Wmo = YHn || Sba;
  });
  function a5e(e) {
    return e.type === "advisor_tool_result" || e.type === "server_tool_use" && e.name === "advisor";
  }
  function FV() {
    if (st(process.env.CLAUDE_CODE_DISABLE_ADVISOR_TOOL)) {
      return false;
    }
    if (getAPIProvider() !== "firstParty" || !eO()) {
      return false;
    }
    if (st(process.env.CLAUDE_CODE_ENABLE_EXPERIMENTAL_ADVISOR_TOOL)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_sage_compass2", {}).enabled ?? false;
  }
  function zmo() {
    return Me.CLAUDE_CODE_ENABLE_EXPERIMENTAL_ADVISOR_TOOL;
  }
  function Kmo(e) {
    return Eba[getCanonicalName(parseUserSpecifiedModel(e))];
  }
  function Ymo(e) {
    let t = getCanonicalName(parseUserSpecifiedModel(e));
    if (!getIsNonInteractiveSession()) {
      if (isFableModelValue(t) && !isFableAvailable()) {
        return;
      }
      if (isMythosModelValue(t) && !isMythosAvailable()) {
        return;
      }
    }
    return Eba[t];
  }
  function jDe(e) {
    if (zmo()) {
      return true;
    }
    return Kmo(e) !== undefined;
  }
  function JHn(e) {
    return qDe(normalizeModelStringForAPI(parseUserSpecifiedModel(e)));
  }
  function zpt() {
    return Tvp.filter(e => JHn(e));
  }
  function qDe(e) {
    if (!isModelAllowed(e)) {
      return false;
    }
    if (zmo()) {
      return true;
    }
    let t = getCanonicalName(e);
    let n = Ymo(t);
    return n !== undefined && n >= 2;
  }
  function l5e(e, t) {
    if (zmo()) {
      return true;
    }
    let n = Kmo(e);
    let r = Ymo(t);
    if (n === undefined || r === undefined) {
      return true;
    }
    return n <= r;
  }
  function vba(e, t) {
    let n = Kmo(e);
    let r = Ymo(t);
    if (n === undefined || r === undefined) {
      return true;
    }
    return n <= r;
  }
  function XHn(e, t) {
    if (!FV() || !e) {
      return;
    }
    let n = normalizeModelStringForAPI(parseUserSpecifiedModel(e));
    if (!jDe(t)) {
      if (logForDebugging(`[AdvisorTool] Skipping advisor - base model ${t} does not support advisor`), !Tba) {
        Tba = true;
        console.warn(`Warning: Advisor disabled \u2014 base model '${t}' isn't in the advisor capability table. Switch to a public model alias (opus, sonnet, fable) or set CLAUDE_CODE_ENABLE_EXPERIMENTAL_ADVISOR_TOOL=1.`);
      }
      return;
    }
    if (!qDe(n)) {
      logForDebugging(`[AdvisorTool] Skipping advisor - ${n} is not a valid advisor model`);
      return;
    }
    if (!l5e(t, n)) {
      logForDebugging(`[AdvisorTool] Skipping advisor - ${n} cannot advise ${t} (advisor must be at least as capable as the base model)`);
      return;
    }
    logForDebugging(`[AdvisorTool] Server-side tool enabled with ${n} as the advisor model`);
    return n;
  }
  function QHn() {
    if (!FV()) {
      return;
    }
    return Jmo(getInitialSettings());
  }
  function Jmo(e) {
    return typeof e.advisorModel === "string" ? e.advisorModel : undefined;
  }
  function wba(e) {
    let t = e.iterations;
    if (!t) {
      return [];
    }
    return t.filter(n => n.type === "advisor_message");
  }
  var Eba;
  var Tvp;
  var Tba = false;
  var Cba = `# Advisor Tool

You have access to an \`advisor\` tool backed by a stronger reviewer model. It takes NO parameters -- when you call advisor(), your entire conversation history is automatically forwarded. They see the task, every tool call you've made, every result you've seen.

Call advisor BEFORE substantive work -- before writing, before committing to an interpretation, before building on an assumption. If the task requires orientation first (finding files, fetching a source, seeing what's there), do that, then call advisor. Orientation is not substantive work. Writing, editing, and declaring an answer are.

Also call advisor:
- When you believe the task is complete. BEFORE this call, make your deliverable durable: write the file, save the result, commit the change. The advisor call takes time; if the session ends during it, a durable result persists and an unwritten one doesn't.
- When stuck -- errors recurring, approach not converging, results that don't fit.
- When considering a change of approach.

On tasks longer than a few steps, call advisor at least once before committing to an approach and once before declaring done. On short reactive tasks where the next action is dictated by tool output you just read, you don't need to keep calling -- the advisor adds most of its value on the first call, before the approach crystallizes.

Give the advice serious weight. If you follow a step and it fails empirically, or you have primary-source evidence that contradicts a specific claim (the file says X, the paper states Y), adapt. A passing self-test is not evidence the advice is wrong -- it's evidence your test doesn't check what the advice is checking.

If you've already retrieved data pointing one way and the advisor points another: don't silently switch. Surface the conflict in one more advisor call -- "I found X, you suggest Y, which constraint breaks the tie?" The advisor saw your evidence but may have underweighted it; a reconcile call is cheaper than committing to the wrong branch.`;
  var UV = __lazy(() => {
    at();
    $n();
    DC();
    je();
    d_();
    gn();
    Eo();
    YN();
    Ds();
    Eba = {
      "claude-haiku-4-5": 1,
      "claude-sonnet-4-6": 2,
      "claude-sonnet-5": 3,
      "claude-opus-4-6": 3,
      "claude-opus-4-7": 4,
      "claude-opus-4-8": 4,
      "claude-mythos-5": 5,
      "claude-fable-5": 5
    };
    Tvp = ["fable", "opus", "sonnet"];
  });
  function tjn(e) {
    return e === "refusal" || e === "sticky";
  }
  function Evp(e) {
    return e === "refusal" || e === "sticky" ? e : "other";
  }
  function Rba(e, t, n, r) {
    let o = e !== undefined && t === e.forModel && isFirstPartyApiBackend() && !o$e(r, RF);
    if (o) {
      _ge(r, RF);
    }
    if (txe(r, RF) && !n.includes(RF)) {
      n.push(RF);
    }
    return o ? {
      fallbacks: [{
        model: e.model
      }]
    } : {};
  }
  function xba(e) {
    return e.message.content.some(t => t.type !== "text");
  }
  function kba(e, t, n, r) {
    if (e && !o$e(n, xF)) {
      _ge(n, xF);
    }
    if (txe(n, xF) && !t.includes(xF)) {
      t.push(xF);
    }
    if (r && t.includes(xF)) {
      let o = r.anthropic_beta;
      if (Array.isArray(o) && o.length > 0 && !o.includes(xF.header)) {
        r.anthropic_beta = [...o, xF.header];
      }
    }
  }
  function Xmo(e) {
    if (typeof e !== "object" || e === null) {
      return;
    }
    let t = e.fallback_credit_token;
    return typeof t === "string" && t.length > 0 && t.length <= 2048 ? t : undefined;
  }
  function Qmo(e) {
    return {
      type: "fallback",
      from: {
        model: e.fromModel
      },
      to: {
        model: e.model
      }
    };
  }
  function ejn(e) {
    if (typeof e !== "object" || e === null) {
      return;
    }
    let t = e.model;
    return typeof t === "string" && t.length > 0 ? t : undefined;
  }
  function Aba(e) {
    if (typeof e !== "object" || e === null) {
      return null;
    }
    let t = e;
    if (t.type !== "refusal") {
      return null;
    }
    let n = t.category;
    return typeof n === "string" && n.length > 0 && n.length <= 64 ? n : null;
  }
  function Zmo(e) {
    if (typeof e !== "object" || e === null) {
      return;
    }
    let t = e;
    if (t.type !== "content_block_start" || typeof t.index !== "number") {
      return;
    }
    let n = t.content_block;
    if (typeof n !== "object" || n === null) {
      return;
    }
    let r = n;
    if (r.type !== "fallback") {
      return;
    }
    let o = ejn(r.from);
    let s = ejn(r.to);
    return o !== undefined && s !== undefined ? {
      index: t.index,
      fromModel: o,
      model: s,
      reason: "refusal",
      category: Aba(r.trigger)
    } : undefined;
  }
  function Iba(e) {
    if (!njn(e)) {
      return;
    }
    let t = e;
    let n = ejn(t.from);
    let r = ejn(t.to);
    return n !== undefined && r !== undefined ? {
      fromModel: n,
      model: r,
      reason: "refusal",
      category: Aba(t.trigger)
    } : undefined;
  }
  function njn(e) {
    return typeof e === "object" && e !== null && e.type === "fallback";
  }
  function Pba(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    let t = e;
    if (t.type !== "content_block_start" || typeof t.index !== "number") {
      return false;
    }
    let n = t.content_block;
    if (typeof n !== "object" || n === null) {
      return false;
    }
    return n.type === "fallback" && Zmo(e) === undefined;
  }
  function efo(e, t, n) {
    let r = e.reduce((c, u, d) => u.type === "fallback_message" ? d : c, -1);
    let o = n === "refusal" ? r : -1;
    let s = e.reduce((c, u, d) => u.type === "fallback_message" && u.model !== undefined && d !== o ? c + wqe(u.model, u, {
      speed: t.speed
    }) : c, 0);
    let i = e.find(c => c.type === "fallback_message" && c.model !== undefined)?.model;
    let a = i !== undefined ? wqe(i, {
      inputTokens: 0,
      outputTokens: 0,
      cacheReadInputTokens: 0,
      cacheCreationInputTokens: 0
    }, {
      speed: t.speed,
      serverToolUse: t.serverToolUse
    }) : 0;
    let l = s + a;
    return Number.isFinite(l) ? l : 0;
  }
  function pWt(e) {
    let t = {
      servedFallbackModel: undefined,
      entries: []
    };
    if (typeof e !== "object" || e === null) {
      return t;
    }
    let n = e.iterations;
    if (!Array.isArray(n)) {
      return t;
    }
    let r = [];
    let o;
    for (let s of n) {
      if (typeof s !== "object" || s === null) {
        continue;
      }
      let i = s;
      if (typeof i.type !== "string") {
        continue;
      }
      let a = {
        type: i.type,
        model: typeof i.model === "string" ? i.model : undefined,
        inputTokens: ZHn(i.input_tokens),
        outputTokens: ZHn(i.output_tokens),
        cacheReadInputTokens: ZHn(i.cache_read_input_tokens),
        cacheCreationInputTokens: ZHn(i.cache_creation_input_tokens)
      };
      if (r.push(a), i.type === "fallback_message" && a.model !== undefined) {
        o = a.model;
      }
    }
    return {
      servedFallbackModel: o,
      entries: r
    };
  }
  function Oba(e) {
    let t = NX();
    let n = gha({
      requestDialog: e.requestDialog,
      isMainThread: e.isMainThread,
      consumerLacksDialogCapability: e.consumerLacksDialogCapability
    });
    let r = oha(e.currentModel);
    let o = !e.alreadyUsed && !e.declined && t && !n ? r : undefined;
    let s = o !== undefined && rha() && !o$e(e.sticky, RF) ? {
      forModel: e.currentModel,
      model: o
    } : undefined;
    return {
      visibleModel: o,
      serverLane: s,
      shouldLogSuppression: !e.suppressionAlreadyLogged && t && n && r !== undefined
    };
  }
  function Dba(e, t) {
    let n = e.discardedMessages.some(s => s.message.content.some(i => i.type === "tool_use"));
    let r = tjn(e.reason);
    let o = r && t.isMainThread;
    return {
      telemetry: {
        reason: Evp(e.reason),
        midStream: e.midStream,
        discardedBlockCount: e.discardedMessages.length,
        tombstonedHadToolUse: n,
        requestId: e.requestId,
        originalModelScope: TTe(e.fromModel),
        finalStopReason: e.finalStopReason,
        apiRefusalCategory: e.apiRefusalCategory != null ? spt(e.apiRefusalCategory) : undefined
      },
      userVisible: r,
      tombstonedToolUse: n,
      swapSession: o,
      showBanner: o
    };
  }
  function Mba(e, t) {
    return {
      type: "system",
      subtype: "model_refusal_fallback",
      direction: "retry",
      content: e.reason === "refusal" ? E$n(e.fromModel, e.toModel, e.apiRefusalCategory) : dha(e.fromModel, e.toModel, e.apiRefusalCategory),
      level: "warning",
      trigger: "refusal",
      originalModel: e.fromModel,
      fallbackModel: e.toModel,
      requestId: e.requestId,
      apiRefusalCategory: e.apiRefusalCategory,
      apiRefusalExplanation: null,
      isMeta: false,
      timestamp: t.timestamp,
      uuid: t.uuid
    };
  }
  var ZHn = e => typeof e === "number" && Number.isFinite(e) && e >= 0 ? e : 0;
  var q7y;
  var rjn = __lazy(() => {
    KN();
    Ds();
    LX();
    q7y = Object.freeze({
      visibleModel: undefined,
      serverLane: undefined,
      shouldLogSuppression: false
    });
  });
  var WX;
  var mWt = __lazy(() => {
    WX = {
      kind: "refusal_fallback_prompt",
      payload: we(() => v.object({
        originalModel: v.string(),
        fallbackModel: v.string(),
        apiRefusalCategory: v.string().nullable().optional(),
        guidanceText: v.string().optional(),
        retractedMessageUuids: v.array(v.string()).optional().describe("Wire uuids of the already-streamed messages this refusal concerns. Evict on RESOLUTION (your own response \u2014 any choice \u2014 or control_cancel_request retirement), never on receipt; a turn torn down mid-dialog keeps the partials. Eviction is idempotent.")
      })),
      result: we(() => v.enum(["retry_fallback", "edit_prompt", "cancelled"])),
      default: "cancelled"
    };
  });
  function fWt(e, t) {
    nfo.set(e, (nfo.get(e) ?? 0) + t);
  }
  function Fba(e, t) {
    let n = (nfo.get(e) ?? 0) + t;
    let r = Lba.get(e) ?? 0;
    let o = Math.max(r, n);
    Lba.set(e, o);
    return o;
  }
  function tfo(e) {
    return e !== undefined && vvp.includes(e);
  }
  function sjn(e, t) {
    return `<total_tokens>${e === "infinite" ? "Infinite" : e === "fixed" ? 5000000 : Math.max(0, t)} tokens left</total_tokens>`;
  }
  var vvp;
  var nfo;
  var Lba;
  var FTe;
  var ojn;
  var hWt = __lazy(() => {
    $n();
    pr();
    vvp = ["off", "infinite", "fixed", "countdown", "padded-countdown"];
    nfo = new Map();
    Lba = new Map();
    FTe = TEr(() => {
      let e = Me.CLAUDE_CODE_TOTAL_TOKENS_REMINDER;
      if (tfo(e)) {
        return e;
      }
      let t = getInitialSettings().totalTokensReminder;
      if (tfo(t)) {
        return t;
      }
      let n = getFeatureValue_CACHED_MAY_BE_STALE("tengu_lapis_anchor", "off");
      return tfo(n) ? n : "off";
    });
    ojn = TEr(() => {
      let e = Me.CLAUDE_CODE_TOTAL_TOKENS_REMINDER_BUDGET;
      if (Number.isFinite(e) && e > 0) {
        return e;
      }
      let t = getInitialSettings().totalTokensReminderBudget;
      if (Number.isFinite(t) && t > 0) {
        return t;
      }
      let n = getFeatureValue_CACHED_MAY_BE_STALE("tengu_lapis_anchor_budget", 15000000);
      return Number.isFinite(n) && n > 0 ? n : 15000000;
    });
  });
  async function Uba(e, t, n, r, o, s) {
    let i = {
      messages: e,
      systemPrompt: t,
      userContext: n,
      systemContext: r,
      toolUseContext: o,
      querySource: s
    };
    for (let a of Cvp) {
      try {
        await a(i);
      } catch (l) {
        Oe(sr(l));
      }
    }
  }
  var Cvp;
  var Bba = __lazy(() => {
    dt();
    Rn();
    Cvp = [];
  });
  function Rvp(e) {
    return $ba.createHash("sha256").update(e).digest("hex");
  }
  function Hba(e) {
    ijn.delete(e);
  }
  function jba() {
    ijn.clear();
  }
  function Avp(e) {
    return;
  }
  function Ivp(e) {
    return ajn.join(er(), "dump-prompts", `${e ?? getSessionId()}.jsonl`);
  }
  function Pvp(e, t) {
    ofo.promises.mkdir(ajn.dirname(e), {
      recursive: true
    }).then(() => ofo.promises.appendFile(e, t + `
`)).catch(() => {});
  }
  function Ovp(e, t, n, r) {
    try {
      return;
    } catch {} finally {
      n.dumpInFlight = false;
    }
  }
  function qba(e) {
    let t = Ivp(e);
    return async (n, r) => {
      let o = ijn.get(e) ?? {
        initialized: false,
        lastInitDataHash: "",
        dumpInFlight: false
      };
      if (ijn.set(e, o), r?.method === "POST" && r.body && !o.dumpInFlight) {
        o.dumpInFlight = true;
        let s = new Date().toISOString();
        setImmediate(Ovp, r.body, s, o, t);
      }
      return globalThis.fetch(n, r);
    };
  }
  var $ba;
  var ofo;
  var ajn;
  var xvp;
  var rfo;
  var ijn;
  var gWt = __lazy(() => {
    at();
    gn();
    $ba = require("crypto");
    ofo = require("fs");
    ajn = require("path");
    xvp = ["model", "system", "tools", "max_tokens", "thinking", "output_config", "context_management", "metadata"];
    rfo = [];
    ijn = new Map();
  });
  function Wba(e) {
    return e?._meta?.["claude/endTurn"] === true;
  }
  function sfo(e) {
    if (e.type !== "user") {
      return false;
    }
    let t = e.toolEndsTurn ? "tool" : Wba(e.mcpMeta) ? "mcp_meta" : false;
    if (!t) {
      return false;
    }
    let n = e.message.content;
    if (Array.isArray(n) && n.some(r => r.type === "tool_result" && r.is_error === true)) {
      return false;
    }
    return t;
  }
  function ifo(e, t) {
    if (!e) {
      return t;
    }
    return Wba(t) ? Dvp : undefined;
  }
  var Dvp;
  var afo = __lazy(() => {
    Dvp = Object.freeze({
      _meta: Object.freeze({
        ["claude/endTurn"]: true
      })
    });
  });
  function lfo() {
    return new Set((process.env.CLAUDE_CODE_TERMINAL_MCP_TOOLS ?? "").split(",").map(e => e.trim()).filter(Boolean));
  }
  function Gba(e) {
    let t = lfo();
    if (t.size === 0) {
      return false;
    }
    let n = new Set();
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (o.type === "user") {
        if (o.isMeta) {
          continue;
        }
        let s = o.message.content;
        if (!Array.isArray(s)) {
          return false;
        }
        let i = false;
        for (let a of s) {
          if (a.type === "tool_result") {
            if (i = true, !a.is_error) {
              n.add(a.tool_use_id);
            }
          }
        }
        if (!i) {
          return false;
        }
      } else if (o.type === "assistant") {
        for (let s of o.message.content) {
          if (s.type === "tool_use" && n.vZc(s.id) && t.vZc(s.name)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  function yWt(e, t) {
    let n = e.discardAndAbortInFlight(serverFallbackTombstoneAbortReason());
    if (logEvent("tengu_fallback_sweep_tools", {
      lane: t,
      aborted: n.aborted,
      completed_before_event: n.completedBeforeEvent,
      queued_never_started: n.queuedNeverStarted,
      compensated_removes: n.toolUseIds.length
    }), n.toolUseIds.length === 0) {
      return;
    }
    return {
      type: "set_in_progress_tool_use_ids",
      op: {
        action: "remove",
        ids: n.toolUseIds
      },
      reason: "fallback_sweep"
    };
  }
  var Vba = __lazy(() => {
    Kp();
    Ot();
  });
  function zba(e) {
    let t = e.length > 1e4 ? e.slice(0, 1e4) : e;
    for (let n of Mvp) {
      if (n.pattern.test(t)) {
        return n;
      }
    }
    return null;
  }
  function Kba(e) {
    return zba(e)?.warning ?? null;
  }
  function c5e(e) {
    return zba(e)?.category ?? null;
  }
  var Mvp;
  var Kpt = __lazy(() => {
    Mvp = [{
      pattern: /(?:^|[|;&\n({])[ \t]*(Remove-Item|rm|del|rd|rmdir|ri)\b[^|;&\n}]*-Recurse\b[^|;&\n}]*-Force\b/i,
      category: "remove_item_recursive_force",
      warning: "Note: may recursively force-remove files"
    }, {
      pattern: /(?:^|[|;&\n({])[ \t]*(Remove-Item|rm|del|rd|rmdir|ri)\b[^|;&\n}]*-Force\b[^|;&\n}]*-Recurse\b/i,
      category: "remove_item_recursive_force",
      warning: "Note: may recursively force-remove files"
    }, {
      pattern: /(?:^|[|;&\n({])[ \t]*(Remove-Item|rm|del|rd|rmdir|ri)\b[^|;&\n}]*-Recurse\b/i,
      category: "remove_item_recursive",
      warning: "Note: may recursively remove files"
    }, {
      pattern: /(?:^|[|;&\n({])[ \t]*(Remove-Item|rm|del|rd|rmdir|ri)\b[^|;&\n}]*-Force\b/i,
      category: "remove_item_force",
      warning: "Note: may force-remove files"
    }, {
      pattern: /\bClear-Content\b[^|;&\n]*\*/i,
      category: "clear_content_glob",
      warning: "Note: may clear content of multiple files"
    }, {
      pattern: /\bFormat-Volume\b/i,
      category: "format_volume",
      warning: "Note: may format a disk volume"
    }, {
      pattern: /\bClear-Disk\b/i,
      category: "clear_disk",
      warning: "Note: may clear a disk"
    }, {
      pattern: /\bgit\s+reset\s+--hard\b/i,
      category: "git_reset_hard",
      warning: "Note: may discard uncommitted changes"
    }, {
      pattern: /\bgit\s+push\b[^|;&\n]*\s+(--force|--force-with-lease|-f)\b/i,
      category: "git_force_push",
      warning: "Note: may overwrite remote history"
    }, {
      pattern: /\bgit\s+clean\b(?![^|;&\n]*(?:-[a-zA-Z]*n|--dry-run))[^|;&\n]*-[a-zA-Z]*f/i,
      category: "git_clean_force",
      warning: "Note: may permanently delete untracked files"
    }, {
      pattern: /\bgit\s+stash\s+(drop|clear)\b/i,
      category: "git_stash_drop",
      warning: "Note: may permanently remove stashed changes"
    }, {
      pattern: /\b(DROP|TRUNCATE)\s+(TABLE|DATABASE|SCHEMA)\b/i,
      category: "sql_drop_truncate",
      warning: "Note: may drop or truncate database objects"
    }, {
      pattern: /\bStop-Computer\b/i,
      category: "stop_computer",
      warning: "Note: will shut down the computer"
    }, {
      pattern: /\bRestart-Computer\b/i,
      category: "restart_computer",
      warning: "Note: will restart the computer"
    }, {
      pattern: /\bClear-RecycleBin\b/i,
      category: "clear_recycle_bin",
      warning: "Note: permanently deletes recycled files"
    }];
  });
  var Nvp = e => ({
    name: "Cedar",
    aliases: ["cedarpolicy"],
    keywords: {
      keyword: "permit forbid when unless if then else in has like is",
      built_in: "principal action resource context decimal ip contains containsAll containsAny",
      literal: "true false"
    },
    contains: [e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, e.C_LINE_COMMENT_MODE, {
      className: "meta",
      begin: /@\w+/
    }, {
      className: "type",
      begin: /\b[A-Z]\w*(::[A-Z]\w*)*/
    }]
  });