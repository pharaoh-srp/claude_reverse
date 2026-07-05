  __export(Wuc, {
    startParentWatchdog: () => startParentWatchdog,
    runDaemonWorker: () => runDaemonWorker,
    registerShutdownHandlers: () => registerShutdownHandlers,
    isShutdownSentinel: () => isShutdownSentinel,
    httpStatusOf: () => httpStatusOf,
    heartbeatWorkerSchema: () => heartbeatWorkerSchema,
    WORKER_KINDS: () => WORKER_KINDS
  });
  async function Ilf(e, t, n, r) {
    let {
      intervalSeconds: o
    } = heartbeatWorkerSchema().parse(e);
    n(`heartbeat worker started (interval=${o}s)`);
    while (!t.aborted) {
      if (await sleep(o * 1000, t), !t.aborted) {
        n("heartbeat");
      }
    }
  }
  function isShutdownSentinel(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "shutdown";
  }
  function registerShutdownHandlers(e, t) {
    let n = () => t.abort();
    e.on("SIGTERM", n);
    e.on("SIGINT", n);
    e.on("message", r => {
      if (isShutdownSentinel(r)) {
        t.abort();
      }
    });
  }
  async function runDaemonWorker(e) {
    if (!e || !(e in WORKER_KINDS)) {
      process.stderr.write(`unknown worker kind: ${e}
`);
      process.exit(2);
    }
    if (e !== "heartbeat" && !isDaemonWorkerRegistryEnabled()) {
      process.stderr.write(`worker kind '${e}' is not available.
`);
      process.exit(2);
    }
    let t = WORKER_KINDS[e];
    let n = [];
    for await (let a of process.stdin) {
      n.push(a);
    }
    let r;
    try {
      r = qt(Buffer.concat(n).toString("utf8"));
    } catch (a) {
      process.stderr.write(`invalid config JSON on stdin: ${he(a)}
`);
      process.exit(2);
    }
    let o = t.schema().safeParse(r.config);
    if (!o.success) {
      process.stderr.write(`config validation failed: ${o.error.message}
`);
      process.exit(2);
    }
    let s = new AbortController();
    registerShutdownHandlers(process, s);
    startParentWatchdog(s);
    let i = duc(r.initialAccessToken);
    try {
      await t.run(o.data, s.signal, a => process.stdout.write(a + `
`), i);
    } catch (a) {
      if (httpStatusOf(a) === 429) {
        process.stdout.write(`rate limited (429): ${he(a)}
`);
        process.exit(75);
      }
      throw a;
    }
  }
  function httpStatusOf(e) {
    let t = e;
    for (let n = 0; t != null && n < 8; n++) {
      let r = t.status;
      if (typeof r === "number") {
        return r;
      }
      let o = t.response?.status;
      if (typeof o === "number") {
        return o;
      }
      t = t.cause;
    }
    return;
  }
  function Dlf(e) {
    try {
      process.kill(e, 0);
      return true;
    } catch {
      return false;
    }
  }
  function startParentWatchdog(e, t) {
    let n = {
      ppid: () => process.ppid,
      isAlive: Dlf,
      log: i => process.stdout.write(i + `
`),
      onGone: () => process.exit(0),
      intervalMs: 30000,
      exitGraceMs: 2000,
      ...t
    };
    let r = n.ppid();
    if (r <= 1) {
      return;
    }
    let o = false;
    let s = setInterval(() => {
      if (o) {
        return;
      }
      if (!(!n.isAlive(r) || Wt() !== "windows" && n.ppid() !== r)) {
        return;
      }
      o = true;
      clearInterval(s);
      n.log("parent supervisor gone \u2014 exiting");
      e.abort();
      setTimeout(n.onGone, n.exitGraceMs).unref();
    }, n.intervalMs);
    s.unref();
    return s;
  }
  var heartbeatWorkerSchema;
  var WORKER_KINDS;
  var Itn = __lazy(() => {
    uT();
    dt();
    Cs();
    P8o();
    Bdr();
    vtn();
    heartbeatWorkerSchema = we(() => v.object({
      intervalSeconds: v.number().positive().default(30)
    }).strict());
    WORKER_KINDS = {
      heartbeat: {
        schema: heartbeatWorkerSchema,
        run: Ilf,
        needsOAuth: false
      },
      scheduled: {
        schema: k8o,
        run: auc,
        needsOAuth: true
      },
      remoteControl: {
        schema: z8o,
        run: Buc,
        needsOAuth: true
      }
    };
  });
  function Mlf(e) {
    return v.union([e, v.array(e)]).optional().transform(t => t === undefined ? [] : Array.isArray(t) ? t : [t]);
  }
  function J8o() {
    return Y8o().parse({});
  }
  async function vJe(e) {
    let t;
    try {
      let i = await Guc.stat(e).catch(a => en(a) === "ENOENT" ? null : Promise.reject(a));
      if (i && (!i.isFile() || i.size > 1048576)) {
        return {
          ok: false,
          error: `${e} is not a regular file (or exceeds 1MiB)`
        };
      }
      t = await Ys().read(e);
    } catch (i) {
      if (en(i) === "ENOENT") {
        return {
          ok: true,
          config: J8o(),
          unknownKeys: []
        };
      }
      return {
        ok: false,
        error: `failed to read ${e}: ${he(i)}`
      };
    }
    let n = Ba(t, false);
    if (n === null) {
      return {
        ok: false,
        error: `failed to parse ${e} as JSON`
      };
    }
    let r = Y8o().safeParse(n);
    if (!r.success) {
      return {
        ok: false,
        error: `config validation failed: ${r.error.message}`
      };
    }
    let o = new Set(Object.keys(Y8o().shape));
    let s = typeof n === "object" && n !== null ? Object.keys(n).filter(i => !o.vZc(i)) : [];
    return {
      ok: true,
      config: r.data,
      unknownKeys: s
    };
  }
  function $dr(e, t) {
    let n = mBe.dirname(e);
    let r = mBe.normalize(n);
    let o = mBe.basename(e);
    let s = jF.watch(n, {
      persistent: true,
      ignoreInitial: true,
      depth: 0,
      usePolling: Wt() === "macos",
      interval: 100,
      ignored: i => {
        let a = mBe.normalize(i);
        return a !== r && mBe.basename(a) !== o;
      },
      awaitWriteFinish: {
        stabilityThreshold: 300,
        pollInterval: 100
      },
      atomic: true,
      ignorePermissionErrors: true
    });
    s.on("add", t);
    s.on("change", t);
    s.on("unlink", t);
    s.on("error", i => logForDebugging(`[daemon-config] watcher error: ${he(i)}`, {
      level: "warn"
    }));
    return () => void s.close().catch(() => {});
  }
  function Vuc(e, t) {
    let n = {
      stop: [],
      start: [],
      restart: []
    };
    for (let r of Object.keys(WORKER_KINDS)) {
      let o = e[r] ?? [];
      let s = t[r] ?? [];
      let i = Math.max(o.length, s.length);
      for (let a = 0; a < i; a++) {
        let l = `${r}:${a}`;
        let c = o[a];
        let u = s[a];
        if (c !== undefined && u === undefined) {
          n.stop.push(l);
        } else if (c === undefined && u !== undefined) {
          n.start.push({
            id: l,
            kind: r,
            config: u
          });
        } else if (!gbu(c, u)) {
          n.restart.push({
            id: l,
            kind: r,
            config: u
          });
        }
      }
    }
    return n;
  }
  var Guc;
  var mBe;
  var Y8o;
  var Ptn = __lazy(() => {
    oue();
    _b();
    je();
    dt();
    Gd();
    Cs();
    Itn();
    Guc = require("fs/promises");
    mBe = require("path");
    Y8o = we(() => {
      let e = Sbu(WORKER_KINDS, t => Mlf(t.schema()));
      return v.object({
        $schema: v.string().optional(),
        ...e
      });
    });
  });
  async function zuc() {
    let e = await vJe(S5());
    if (!e.ok) {
      return [];
    }
    let t = e.config.remoteControl ?? [];
    let n = (await lP()) !== null;
    return t.map(r => ({
      dir: r.dir,
      name: r.name ?? wCe.basename(r.dir),
      spawnMode: r.spawnMode ?? "same-dir",
      isRunning: n
    }));
  }
  function Kuc(e) {
    let t = X8o.c(41);
    let {
      server: n,
      onBack: r,
      onDone: o,
      refresh: s
    } = e;
    let [i, a] = wJe.useState(false);
    let [l, c] = wJe.useState(false);
    let u;
    if (t[0] !== i || t[1] !== o || t[2] !== s || t[3] !== n.dir) {
      u = async function (k) {
        if (i) {
          return;
        }
        a(true);
        try {
          if (k === "remove") {
            await Udr(n.dir);
            await s();
            o(`Removed remote-control server for ${n.dir}.`, {
              display: "system"
            });
          } else {
            o("The background server picks up config changes automatically \u2014 no restart needed.", {
              display: "system"
            });
          }
        } catch (I) {
          let O = I;
          Oe(O);
          o(`Action failed: ${he(O)}`, {
            display: "system"
          });
        }
      };
      t[0] = i;
      t[1] = o;
      t[2] = s;
      t[3] = n.dir;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d = u;
    if (l) {
      let A = n.dir;
      let k;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        k = bgSupervisorNoun();
        t[5] = k;
      } else {
        k = t[5];
      }
      let I = `Stop serving ${A} to claude.ai. The ${k} will stop the worker on its next reconcile.`;
      let O;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        O = () => c(false);
        t[6] = O;
      } else {
        O = t[6];
      }
      let M;
      if (t[7] !== d) {
        M = () => void d("remove");
        t[7] = d;
        t[8] = M;
      } else {
        M = t[8];
      }
      let L;
      if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
        L = () => c(false);
        t[9] = L;
      } else {
        L = t[9];
      }
      let P;
      if (t[10] !== M) {
        P = j5.jsx(mc, {
          cancelFirst: true,
          focus: "cancel",
          confirmLabel: "Yes, remove",
          cancelLabel: "No, cancel",
          onConfirm: M,
          onCancel: L
        });
        t[10] = M;
        t[11] = P;
      } else {
        P = t[11];
      }
      let F;
      if (t[12] !== I || t[13] !== P) {
        F = j5.jsx(or, {
          title: "Remove server?",
          subtitle: I,
          onCancel: O,
          color: "error",
          children: P
        });
        t[12] = I;
        t[13] = P;
        t[14] = F;
      } else {
        F = t[14];
      }
      return F;
    }
    let p;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      p = [{
        label: `Restart ${bgSupervisorNoun()}`,
        value: "restart"
      }, {
        label: "Remove",
        value: "remove"
      }, {
        label: "Back",
        value: "back"
      }];
      t[15] = p;
    } else {
      p = t[15];
    }
    let m = p;
    let f;
    if (t[16] !== n.dir) {
      f = j5.jsxs(Text, {
        dimColor: true,
        children: ["Directory ", n.dir]
      });
      t[16] = n.dir;
      t[17] = f;
    } else {
      f = t[17];
    }
    let h;
    if (t[18] !== n.spawnMode) {
      h = j5.jsxs(Text, {
        dimColor: true,
        children: ["Spawn mode ", n.spawnMode]
      });
      t[18] = n.spawnMode;
      t[19] = h;
    } else {
      h = t[19];
    }
    let g = n.isRunning ? "success" : "pending";
    let y;
    if (t[20] !== g) {
      y = j5.jsx(Ps, {
        status: g,
        withSpace: true
      });
      t[20] = g;
      t[21] = y;
    } else {
      y = t[21];
    }
    let _ = n.isRunning ? "running" : "not running";
    let b;
    if (t[22] !== y || t[23] !== _) {
      b = j5.jsxs(Text, {
        dimColor: true,
        children: ["Status", "     ", y, _]
      });
      t[22] = y;
      t[23] = _;
      t[24] = b;
    } else {
      b = t[24];
    }
    let S;
    if (t[25] !== f || t[26] !== h || t[27] !== b) {
      S = j5.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [f, h, b]
      });
      t[25] = f;
      t[26] = h;
      t[27] = b;
      t[28] = S;
    } else {
      S = t[28];
    }
    let E;
    if (t[29] !== r || t[30] !== d) {
      E = A => {
        if (A === "back") {
          return r();
        }
        if (A === "remove") {
          return c(true);
        }
        d(A);
      };
      t[29] = r;
      t[30] = d;
      t[31] = E;
    } else {
      E = t[31];
    }
    let C;
    if (t[32] !== i || t[33] !== r || t[34] !== E) {
      C = j5.jsx(xr, {
        options: m,
        isDisabled: i,
        onChange: E,
        onCancel: r
      });
      t[32] = i;
      t[33] = r;
      t[34] = E;
      t[35] = C;
    } else {
      C = t[35];
    }
    let x;
    if (t[36] !== r || t[37] !== n.name || t[38] !== C || t[39] !== S) {
      x = j5.jsxs(or, {
        title: n.name,
        onCancel: r,
        children: [S, C]
      });
      t[36] = r;
      t[37] = n.name;
      t[38] = C;
      t[39] = S;
      t[40] = x;
    } else {
      x = t[40];
    }
    return x;
  }
  function Yuc(e) {
    let t = X8o.c(48);
    let {
      defaultDir: n,
      onCancel: r,
      onAdded: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = wCe.basename(n);
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n || t[3] !== s) {
      i = {
        dir: n,
        name: s,
        spawnMode: "same-dir"
      };
      t[2] = n;
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    let [a, l] = wJe.useState(i);
    let [c, u] = wJe.useState(false);
    let [d, p] = wJe.useState(null);
    let [m, f] = wJe.useState(false);
    let h;
    if (t[5] !== n || t[6] !== c) {
      h = function (H, U) {
        if (H === "name") {
          u(true);
        }
        l(N => {
          if (N[H] === U) {
            return N;
          }
          let W = {
            ...N,
            [H]: U
          };
          if (H === "dir" && !c) {
            W.name = wCe.basename(wCe.resolve(AP(U.trim() || n)));
          }
          return W;
        });
      };
      t[5] = n;
      t[6] = c;
      t[7] = h;
    } else {
      h = t[7];
    }
    let g = h;
    let y;
    if (t[8] !== n || t[9] !== a.dir) {
      y = wCe.resolve(AP(a.dir?.trim() || n));
      t[8] = n;
      t[9] = a.dir;
      t[10] = y;
    } else {
      y = t[10];
    }
    let _ = y;
    let b;
    if (t[11] !== n) {
      b = F => {
        let H = wCe.resolve(AP(F.trim() || n));
        return isPathTrusted(H) ? "Available on claude.ai/code and the Claude mobile app." : `${H} is not yet trusted \u2014 you'll be asked to trust it on submit.`;
      };
      t[11] = n;
      t[12] = b;
    } else {
      b = t[12];
    }
    let S;
    if (t[13] !== n || t[14] !== b) {
      S = {
        type: "text",
        key: "dir",
        label: "Directory",
        placeholder: n,
        required: true,
        hint: b
      };
      t[13] = n;
      t[14] = b;
      t[15] = S;
    } else {
      S = t[15];
    }
    let E;
    if (t[16] !== c) {
      E = {
        type: "text",
        key: "name",
        label: "Name",
        hint: () => c ? "Shown in the claude.ai session picker." : "Auto-generated from the directory name."
      };
      t[16] = c;
      t[17] = E;
    } else {
      E = t[17];
    }
    let C;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      C = {
        type: "select",
        key: "spawnMode",
        label: "Spawn mode",
        options: [{
          label: "same-dir",
          value: "same-dir"
        }, {
          label: "worktree",
          value: "worktree"
        }],
        hint: Nlf
      };
      t[18] = C;
    } else {
      C = t[18];
    }
    let x;
    if (t[19] !== S || t[20] !== E) {
      x = [S, E, C];
      t[19] = S;
      t[20] = E;
      t[21] = x;
    } else {
      x = t[21];
    }
    let A = x;
    let k;
    if (t[22] !== o || t[23] !== r || t[24] !== a.name || t[25] !== a.spawnMode) {
      k = async function (H) {
        f(true);
        let U = a.name?.trim() || wCe.basename(H);
        let N = a.spawnMode ?? "same-dir";
        try {
          await Fdr({
            dir: H,
            name: U,
            spawnMode: N
          });
          o(H, undefined);
        } catch (W) {
          Oe(W);
          f(false);
          r();
        }
      };
      t[22] = o;
      t[23] = r;
      t[24] = a.name;
      t[25] = a.spawnMode;
      t[26] = k;
    } else {
      k = t[26];
    }
    let I = k;
    let O;
    if (t[27] !== m || t[28] !== I || t[29] !== _) {
      O = function () {
        if (m) {
          return;
        }
        if (!isPathTrusted(_)) {
          p(_);
          return;
        }
        I(_);
      };
      t[27] = m;
      t[28] = I;
      t[29] = _;
      t[30] = O;
    } else {
      O = t[30];
    }
    let M = O;
    if (d !== null) {
      let F = `${d} hasn't been trusted yet. Trusting allows Claude to read and execute files there.`;
      let H;
      if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
        H = () => p(null);
        t[31] = H;
      } else {
        H = t[31];
      }
      let U;
      if (t[32] !== I || t[33] !== d) {
        U = () => {
          setPathTrusted(d);
          p(null);
          I(d);
        };
        t[32] = I;
        t[33] = d;
        t[34] = U;
      } else {
        U = t[34];
      }
      let N;
      if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
        N = () => p(null);
        t[35] = N;
      } else {
        N = t[35];
      }
      let W;
      if (t[36] !== U) {
        W = j5.jsx(mc, {
          cancelFirst: true,
          focus: "cancel",
          confirmLabel: "Yes, trust and add server",
          cancelLabel: "No, go back",
          onConfirm: U,
          onCancel: N
        });
        t[36] = U;
        t[37] = W;
      } else {
        W = t[37];
      }
      let j;
      if (t[38] !== F || t[39] !== W) {
        j = j5.jsx(or, {
          title: "Trust this directory?",
          subtitle: F,
          onCancel: H,
          children: W
        });
        t[38] = F;
        t[39] = W;
        t[40] = j;
      } else {
        j = t[40];
      }
      return j;
    }
    let L = m ? "Adding\u2026" : "Add server";
    let P;
    if (t[41] !== A || t[42] !== M || t[43] !== r || t[44] !== g || t[45] !== L || t[46] !== a) {
      P = j5.jsx(q1e, {
        title: "New Remote Control server",
        subtitle: "Make a directory available on claude.ai/code and the Claude mobile app",
        fields: A,
        values: a,
        onChange: g,
        onSubmit: M,
        onCancel: r,
        submitLabel: L
      });
      t[41] = A;
      t[42] = M;
      t[43] = r;
      t[44] = g;
      t[45] = L;
      t[46] = a;
      t[47] = P;
    } else {
      P = t[47];
    }
    return P;
  }
  function Nlf(e) {
    return e === "worktree" ? "Each session gets its own git worktree (requires a git repo)." : "All sessions share the directory.";
  }
  var X8o;
  var wCe;
  var wJe;
  var j5;
  var Juc = __lazy(() => {
    at();
    uT();
    $c();
    b_();
    Ii();
    Zzt();
    Vf();
    Ptn();
    jZ();
    hUe();
    Bdr();
    et();
    dt();
    Rn();
    mde();
    X8o = __toESM(pt(), 1);
    wCe = require("path");
    wJe = __toESM(ot(), 1);
    j5 = __toESM(ie(), 1);
  });
  function Xuc(e) {
    if (e === "~" || e.startsWith("~/")) {
      return Zuc.homedir() + e.slice(1);
    }
    return e;
  }
  async function edc() {
    let [e, t] = await Promise.all([GCt().catch(n => (Oe(n), [])), lP().then(n => n !== null).catch(() => false)]);
    return {
      tasks: e,
      daemonAlive: t
    };
  }
  function tdc({
    task: e,
    onBack: t,
    onEdit: n,
    onDone: r,
    refresh: o
  }) {
    let [s, i] = YCt.useState(false);
    let [a, l] = YCt.useState(false);
    async function c() {
      if (s) {
        return;
      }
      i(true);
      try {
        await Ttn(Flf({
          ...e,
          enabled: !e.enabled
        }));
        await o();
        r(`${e.enabled ? "Disabled" : "Enabled"} scheduled task '${e.id}'.`, {
          display: "system"
        });
      } catch (p) {
        Oe(p);
        r(`Toggle failed: ${he(p)}`, {
          display: "system"
        });
      }
    }
    async function u() {
      if (s) {
        return;
      }
      i(true);
      try {
        await Etn(e.id);
        await o();
        r(`Removed scheduled task '${e.id}'.`, {
          display: "system"
        });
      } catch (p) {
        logForDebugging(`Failed to remove scheduled task '${e.id}' from daemon.json: ${he(p)}`, {
          level: "error"
        });
        r(`Remove failed: ${he(p)}`, {
          display: "system"
        });
      }
    }
    if (a) {
      return cB.jsx(or, {
        title: "Remove task?",
        subtitle: `Delete '${e.id}' from daemon.json. The daemon will stop firing it on its next reconcile.`,
        onCancel: () => l(false),
        color: "error",
        children: cB.jsx(mc, {
          cancelFirst: true,
          focus: "cancel",
          confirmLabel: "Yes, remove",
          cancelLabel: "No, cancel",
          onConfirm: () => void u(),
          onCancel: () => l(false)
        })
      });
    }
    let d = [{
      label: e.enabled ? "Disable" : "Enable",
      value: "toggle"
    }, {
      label: "Edit",
      value: "edit"
    }, {
      label: "Remove",
      value: "remove"
    }, {
      label: "Back",
      value: "back"
    }];
    return cB.jsxs(or, {
      title: e.id,
      onCancel: t,
      children: [cB.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [cB.jsxs(Text, {
          dimColor: true,
          children: ["Cron ", e.cron, " (", A1(e.cron), ")"]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Directory ", e.directory]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Prompt ", e.prompt]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Status", " ", cB.jsx(Ps, {
            status: e.enabled ? "success" : "pending",
            withSpace: true
          }), e.enabled ? "enabled" : "disabled"]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Mode ", e.permissionMode]
        }), e.model && cB.jsxs(Text, {
          dimColor: true,
          children: ["Model ", e.model]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Timeout ", e.runTimeoutMinutes, "m"]
        }), cB.jsxs(Text, {
          dimColor: true,
          children: ["Max queue ", e.maxQueued]
        })]
      }), cB.jsx(xr, {
        options: d,
        isDisabled: s,
        onChange: p => {
          if (p === "back") {
            return t();
          }
          if (p === "edit") {
            return n(e);
          }
          if (p === "remove") {
            return l(true);
          }
          if (p === "toggle") {
            return void c();
          }
        },
        onCancel: t
      })]
    });
  }
  function ndc({
    defaultDir: e,
    existingIds: t,
    prefill: n,
    modelOptions: r = [{
      label: "default",
      value: ""
    }],
    onCancel: o,
    onDone: s,
    onSaved: i
  }) {
    let a = n !== undefined;
    let l = a ? t.filter(b => b !== n.id) : t;
    let [c, u] = YCt.useState({
      prompt: n?.prompt ?? "",
      schedule: n?.cron ?? "",
      dir: n?.directory ?? e,
      id: n?.id ?? "",
      permissionMode: n?.permissionMode ?? "dontAsk",
      model: n?.model ?? ""
    });
    let [d, p] = YCt.useState(a);
    let [m, f] = YCt.useState(false);
    function h(b, S) {
      if (b === "id") {
        p(true);
      }
      u(E => {
        if (E[b] === S) {
          return E;
        }
        let C = {
          ...E,
          [b]: S
        };
        if (b !== "id" && !d && (b === "prompt" || b === "dir")) {
          C.id = Quc(Otn.resolve(Xuc(C.dir?.trim() || e)), C.prompt ?? "");
        }
        return C;
      });
    }
    let g = n?.model && !r.some(b => b.value === n.model) ? [...r, {
      label: n.model,
      value: n.model
    }] : r;
    let y = [{
      type: "text",
      key: "prompt",
      label: "Prompt",
      placeholder: "/babysit-prs",
      required: true,
      hint: () => "Sent to Claude on each fire. Slash commands work."
    }, {
      type: "text",
      key: "schedule",
      label: "Schedule",
      placeholder: "5m, 2h, 1d  or  */15 * * * *",
      required: true,
      validate: b => b.trim() === "" ? null : Ddt(b).error ?? null,
      hint: b => {
        if (b.trim() === "") {
          return;
        }
        let S = Ddt(b);
        return S.error ? undefined : `${S.human} \xB7 ${S.cron}`;
      }
    }, {
      type: "text",
      key: "dir",
      label: "Directory",
      placeholder: e
    }, {
      type: "text",
      key: "id",
      label: "Id",
      validate: b => {
        let S = b.trim();
        if (S !== "" && l.includes(S)) {
          return `id '${S}' is already in use`;
        }
        return null;
      },
      hint: () => d ? undefined : "Auto-generated from prompt and directory."
    }, {
      type: "select",
      key: "permissionMode",
      label: "Permission mode",
      options: WCt.map(b => ({
        label: b,
        value: b
      }))
    }, {
      type: "select",
      key: "model",
      label: "Model",
      options: g,
      hint: b => g.find(S => S.value === b)?.description ?? (b === "" ? "Uses your configured default model." : undefined)
    }];
    async function _() {
      if (m) {
        return;
      }
      f(true);
      let b = Otn.resolve(Xuc(c.dir?.trim() || e));
      let S = Ddt(c.schedule ?? "");
      if (S.cron === undefined) {
        f(false);
        return;
      }
      let E = c.id?.trim() || Quc(b, c.prompt?.trim() ?? "");
      let C = c.permissionMode ?? "dontAsk";
      let x = c.model?.trim() || undefined;
      let A = {
        id: E,
        cron: S.cron,
        prompt: c.prompt.trim(),
        directory: b,
        enabled: n?.enabled ?? true,
        permissionMode: C,
        runTimeoutMinutes: n?.runTimeoutMinutes ?? 30,
        maxQueued: n?.maxQueued ?? 1,
        ...(x && {
          model: x
        })
      };
      try {
        if (a && n.id !== E) {
          await Etn(n.id);
        }
        await Ttn(A);
        await i(E, a);
      } catch (k) {
        Oe(k);
        s(`Save failed: ${he(k)}`, {
          display: "system"
        });
      }
    }
    return cB.jsx(q1e, {
      title: a ? `Edit '${n.id}'` : "New scheduled task",
      subtitle: "Fire a prompt on a recurring schedule",
      fields: y,
      values: c,
      onChange: h,
      onSubmit: () => void _(),
      onCancel: o,
      submitLabel: a ? "Save changes" : "Create task"
    });
  }
  function Dtn(e) {
    return e.toLowerCase().replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "").slice(0, 40);
  }
  function Quc(e, t) {
    let n = Dtn(Otn.basename(e));
    let r = Dtn(t.split(/\s+/).slice(0, 4).join(" "));
    return [n, r].filter(Boolean).join("-") || "task";
  }
  function Flf(e) {
    return {
      id: e.id,
      cron: e.cron,
      prompt: e.prompt,
      directory: e.directory,
      enabled: e.enabled,
      permissionMode: e.permissionMode,
      runTimeoutMinutes: e.runTimeoutMinutes,
      maxQueued: e.maxQueued,
      ...(e.model && {
        model: e.model
      })
    };
  }
  var Llf;
  var Zuc;
  var Otn;
  var YCt;
  var cB;
  var Q8o = __lazy(() => {
    at();
    $c();
    b_();
    Ii();
    Zzt();
    Vf();
    jZ();
    vtn();
    et();
    vX();
    je();
    dt();
    Rn();
    Llf = __toESM(pt(), 1);
    Zuc = require("os");
    Otn = require("path");
    YCt = __toESM(ot(), 1);
    cB = __toESM(ie(), 1);
  });
  var tVo = {};