  __export(Sda, {
    isSkillDescReframeEnabled: () => isSkillDescReframeEnabled,
    getSkillToolInfo: () => getSkillToolInfo,
    getSkillInfo: () => getSkillInfo,
    getPrompt: () => getPrompt,
    getLimitedSkillToolCommands: () => getLimitedSkillToolCommands,
    formatCommandsWithinBudget: () => formatCommandsWithinBudget,
    clearPromptCache: () => clearPromptCache
  });
  function Mco(e) {
    let t = b9e(e);
    let n = cTe();
    return t.length > n ? t.slice(0, n - 1) + "\u2026" : t;
  }
  function Vhp(e) {
    let t = getCommandName(e);
    if (e.name !== t && e.type === "prompt" && e.source === "plugin") {
      logForDebugging(`Skill prompt: showing "${e.name}" (userFacingName="${t}")`);
    }
    return `- ${e.name}: ${Mco(e)}`;
  }
  function formatCommandsWithinBudget(e, t, n, r) {
    if (e.length === 0) {
      return "";
    }
    let o = _9e(t, r);
    let s = new Set();
    let i = e.map((g, y) => {
      if (getSkillOverride(g) === "name-only") {
        s.add(y);
        return {
          cmd: g,
          full: `- ${g.name}`
        };
      }
      return {
        cmd: g,
        full: Vhp(g)
      };
    });
    let a = i.reduce((g, y) => g + an(y.full), 0) + (i.length - 1);
    if (a <= o) {
      return i.map(g => g.full).join(`
`);
    }
    logForDebugging(`Skill listing over budget: ${e.length} skills, ${a} chars > ${o} budget \u2014 descriptions will be truncated. Run /doctor for details.`, {
      level: "warn"
    });
    let l = new Set(s);
    let c = [];
    for (let g = 0; g < e.length; g++) {
      let y = e[g];
      if (y.type === "prompt" && y.source === "bundled") {
        l.add(g);
      } else if (!s.vZc(g)) {
        c.push(y);
      }
    }
    let u = i.reduce((g, y, _) => l.vZc(_) ? g + an(y.full) + 1 : g, 0);
    let d = o - u;
    if (c.length === 0) {
      return i.map(g => g.full).join(`
`);
    }
    if (n) {
      let g = e.map((x, A) => A).filter(x => !l.vZc(x));
      let y = x => an(e[x].name) + 2;
      let _ = x => an(i[x].full);
      let b = e.reduce((x, A, k) => x + (l.vZc(k) ? _(k) : y(k)), 0) + (e.length - 1);
      let S = o - b;
      let E = new Set();
      let C = g.slice().sort((x, A) => n(e[A]) - n(e[x]));
      for (let x of C) {
        let A = _(x) - y(x);
        if (A <= S) {
          E.add(x);
          S -= A;
        }
      }
      return e.map((x, A) => l.vZc(A) || E.vZc(A) ? i[A].full : `- ${x.name}`).join(`
`);
    }
    let p = c.reduce((g, y) => g + an(y.name) + 4, 0) + (c.length - 1);
    let m = d - p;
    let f = Math.floor(m / c.length);
    if (f < 20) {
      return e.map((g, y) => l.vZc(y) ? i[y].full : `- ${g.name}`).join(`
`);
    }
    let h = Bn(c, g => an(Mco(g)) > f);
    return e.map((g, y) => {
      if (l.vZc(y)) {
        return i[y].full;
      }
      let _ = Mco(g);
      return `- ${g.name}: ${truncate(_, f)}`;
    }).join(`
`);
  }
  async function getSkillToolInfo(e) {
    let t = await getSkillToolCommands(e);
    let n = filterSkillCommandsByAllowlist(t, getSessionSkillAllowlist());
    return {
      totalCommands: t.length,
      includedCommands: n.length
    };
  }
  async function getLimitedSkillToolCommands(e) {
    return filterSkillCommandsByAllowlist(await getSkillToolCommands(e), getSessionSkillAllowlist());
  }
  function clearPromptCache() {
    getPrompt.cache?.clear?.();
  }
  async function getSkillInfo(e) {
    try {
      let t = await getSlashCommandToolSkills(e);
      return {
        totalSkills: t.length,
        includedSkills: t.length
      };
    } catch (t) {
      Oe(sr(t));
      return {
        totalSkills: 0,
        includedSkills: 0
      };
    }
  }
  var isSkillDescReframeEnabled;
  var zhp;
  var Khp;
  var getPrompt;
  var uTe = __lazy(() => {
    ZL();
    Bm();
    at();
    np();
    bc();
    $n();
    Ot();
    je();
    pr();
    dt();
    cs();
    Rn();
    S9e();
    isSkillDescReframeEnabled = TEr(() => {
      let e = Me.CLAUDE_CODE_SKILL_DESC_REFRAME;
      let t = e || getFeatureValue_CACHED_MAY_BE_STALE("tengu_russet_linnet", false);
      if (t) {
        logForDebugging(`skill_desc_reframe_arm_active source=${e ? "env" : "growthbook"}`);
      }
      return t;
    });
    zhp = `Execute a skill within the main conversation

When users ask you to perform tasks, check if any of the available skills match. Skills provide specialized capabilities and domain knowledge.

When users reference a "slash command" or "/<something>", they are referring to a skill. Use this tool to invoke it.

How to invoke:
- Set \`skill\` to the exact name of an available skill (no leading slash). For plugin-namespaced skills use the fully qualified \`plugin:skill\` form.
- Set \`args\` to pass optional arguments.
- Some skills are scoped to a directory: their name is prefixed with the directory (e.g. \`apps/web:deploy\`) and their description says which directory they apply to. When a skill name has both a scoped and an unscoped variant, pick by the files you are working on: if the files are under a variant's directory, invoke that variant (most specific directory wins); otherwise invoke the unscoped one.

Important:
- Available skills are listed in system-reminder messages in the conversation
- Only invoke a skill that appears in that list, or one the user explicitly typed as \`/<name>\` in their message. Never guess or invent a skill name from training data; otherwise do not call this tool
- When a skill matches the user's request, this is a BLOCKING REQUIREMENT: invoke the relevant Skill tool BEFORE generating any other response about the task
- NEVER mention a skill without actually calling this tool
- Do not invoke a skill that is already running
- Do not use this tool for built-in CLI commands (like /help, /clear, etc.)
- If you see a <${"command-name"}> tag in the current conversation turn, the skill has ALREADY been loaded - follow the instructions directly instead of calling this tool again
`;
    Khp = `Invoke a skill.

A skill is a packaged set of instructions the user or project has set up for a particular kind of task (deploy steps, a review checklist, a repo-specific workflow). Available skills appear in a system-reminder listing with one-line descriptions. When the task at hand is one a listed skill covers, call this tool first \u2014 the skill's instructions load into the turn for you to follow in place of your default approach; some skills instead run in a subagent and return the finished result. Users may also ask for one by name (\`/<name>\`, or "slash command"); that's a request to invoke it.

- \`skill\`: exact name from the listing, no leading slash. Plugin skills use \`plugin:skill\`. Directory-scoped skills are listed with a path prefix (\`apps/web:deploy\`); when both scoped and unscoped variants of a name exist, pick the one whose directory contains the files you're working on (most specific wins; unscoped otherwise).
- \`args\`: optional arguments to pass through.

Only names from the listing (or that the user typed explicitly) are valid. Built-in CLI commands (\`/help\`, \`/clear\`, \u2026) aren't skills. If a \`<${"command-name"}>\` block is already present this turn, the skill is loaded \u2014 follow it directly rather than calling again.
`;
    getPrompt = TEr(async e => isSkillDescReframeEnabled() ? Khp : zhp);
  });
  function Jhp(e) {
    return Math.max(0, Math.floor((Date.now() - e) / 86400000));
  }
  function Uco(e) {
    let t = Jhp(e);
    if (t <= 1) {
      return "";
    }
    return `This memory is ${t} days old. ` + "Memories are point-in-time observations, not live state \u2014 " + "claims about code behavior or file:line citations may be outdated. Verify against current code before asserting as fact.";
  }
  function Tda(e) {
    let t = Uco(e);
    if (!t) {
      return "";
    }
    return `<system-reminder>${t}</system-reminder>
`;
  }
  function xm(e, t = 4) {
    if (typeof e !== "string") {
      return 0;
    }
    return Math.round(e.length / t);
  }
  function Xhp(e) {
    switch (e) {
      case "json":
      case "jsonl":
      case "jsonc":
        return 2;
      default:
        return 4;
    }
  }
  function Eda(e, t) {
    return xm(e, Xhp(t));
  }
  function XOe(e, t) {
    if (!e) {
      return 0;
    }
    if (typeof e === "string") {
      return xm(e, t);
    }
    let n = 0;
    for (let r of e) {
      n += Qhp(r, t);
    }
    return n;
  }
  function Qhp(e, t) {
    if (typeof e === "string") {
      return xm(e, t);
    }
    if (e.type === "text") {
      return xm(e.text, t);
    }
    if (e.type === "image" || e.type === "document") {
      return 2000;
    }
    if (e.type === "tool_result") {
      return XOe(e.content, t);
    }
    if (e.type === "tool_use") {
      return xm(e.name + De(e.input ?? {}), t);
    }
    if (e.type === "thinking") {
      return xm(e.thinking, t);
    }
    if (e.type === "redacted_thinking") {
      return xm(e.data, t);
    }
    return xm(De(e), t);
  }
  var aU = __lazy(() => {});
  var M3t;
  var Bco = __lazy(() => {
    M3t = new Set(["Frame", "FrameRead", "TeamCreate", "TeamDelete", "SuggestBackgroundPR"]);
  });
  function egp(e, t) {
    let {
      min: n,
      max: r
    } = t;
    let o = new Set();
    for (let s of e.split(",")) {
      let i = s.match(/^\*(?:\/(\d+))?$/);
      if (i) {
        let c = i[1] ? parseInt(i[1], 10) : 1;
        if (c < 1) {
          return null;
        }
        for (let u = n; u <= r; u += c) {
          o.add(u);
        }
        continue;
      }
      let a = s.match(/^(\d+)-(\d+)(?:\/(\d+))?$/);
      if (a) {
        let c = parseInt(a[1], 10);
        let u = parseInt(a[2], 10);
        let d = a[3] ? parseInt(a[3], 10) : 1;
        let p = n === 0 && r === 6;
        let m = p ? 7 : r;
        if (c > u || d < 1 || c < n || u > m) {
          return null;
        }
        for (let f = c; f <= u; f += d) {
          o.add(p && f === 7 ? 0 : f);
        }
        continue;
      }
      if (s.match(/^\d+$/)) {
        let c = parseInt(s, 10);
        if (n === 0 && r === 6 && c === 7) {
          c = 0;
        }
        if (c < n || c > r) {
          return null;
        }
        o.add(c);
        continue;
      }
      return null;
    }
    if (o.size === 0) {
      return null;
    }
    return Array.from(o).sort((s, i) => s - i);
  }
  function lU(e) {
    let t = e.trim().split(/\s+/);
    if (t.length !== 5) {
      return null;
    }
    let n = [];
    for (let r = 0; r < 5; r++) {
      let o = egp(t[r], Zhp[r]);
      if (!o) {
        return null;
      }
      n.push(o);
    }
    return {
      minute: n[0],
      hour: n[1],
      dayOfMonth: n[2],
      month: n[3],
      dayOfWeek: n[4]
    };
  }
  function Odt(e, t) {
    let n = new Set(e.minute);
    let r = new Set(e.hour);
    let o = new Set(e.dayOfMonth);
    let s = new Set(e.month);
    let i = new Set(e.dayOfWeek);
    let a = e.dayOfMonth.length === 31;
    let l = e.dayOfWeek.length === 7;
    let c = new Date(t.getTime());
    c.setSeconds(0, 0);
    c.setMinutes(c.getMinutes() + 1);
    let u = 527040;
    for (let d = 0; d < u; d++) {
      let p = c.getMonth() + 1;
      if (!s.vZc(p)) {
        c.setMonth(c.getMonth() + 1, 1);
        c.setHours(0, 0, 0, 0);
        continue;
      }
      let m = c.getDate();
      let f = c.getDay();
      if (!(a && l ? true : a ? i.vZc(f) : l ? o.vZc(m) : o.vZc(m) || i.vZc(f))) {
        c.setDate(c.getDate() + 1);
        c.setHours(0, 0, 0, 0);
        continue;
      }
      if (!r.vZc(c.getHours())) {
        c.setHours(c.getHours() + 1, 0, 0, 0);
        continue;
      }
      if (!n.vZc(c.getMinutes())) {
        c.setMinutes(c.getMinutes() + 1);
        continue;
      }
      return c;
    }
    return null;
  }
  function tgp(e, t) {
    return new Date(2000, 0, 1, t, e).toLocaleTimeString("en-US", {
      hour: "numeric",
      minute: "2-digit"
    });
  }
  function ngp(e, t) {
    let n = new Date();
    n.setUTCHours(t, e, 0, 0);
    return n.toLocaleTimeString("en-US", {
      hour: "numeric",
      minute: "2-digit",
      timeZoneName: "short"
    });
  }
  function A1(e, t) {
    let n = t?.utc ?? false;
    let r = e.trim().split(/\s+/);
    if (r.length !== 5) {
      return e;
    }
    let [o, s, i, a, l] = r;
    if (s === "*" && i === "*" && a === "*" && l === "*") {
      if (o === "*") {
        return "Every minute";
      }
      let m = o.match(/^\*\/(\d+)$/);
      if (m) {
        let f = parseInt(m[1], 10);
        return f === 1 ? "Every minute" : `Every ${f} minutes`;
      }
    }
    if (o.match(/^\d+$/) && s === "*" && i === "*" && a === "*" && l === "*") {
      let m = parseInt(o, 10);
      if (m === 0) {
        return "Every hour";
      }
      return `Every hour at :${m.toString().padStart(2, "0")}`;
    }
    let c = s.match(/^\*\/(\d+)$/);
    if (o.match(/^\d+$/) && c && i === "*" && a === "*" && l === "*") {
      let m = parseInt(c[1], 10);
      let f = parseInt(o, 10);
      let h = f === 0 ? "" : ` at :${f.toString().padStart(2, "0")}`;
      return m === 1 ? `Every hour${h}` : `Every ${m} hours${h}`;
    }
    if (!o.match(/^\d+$/) || !s.match(/^\d+$/)) {
      return e;
    }
    let u = parseInt(o, 10);
    let d = parseInt(s, 10);
    let p = n ? ngp : tgp;
    if (i === "*" && a === "*" && l === "*") {
      return `Every day at ${p(u, d)}`;
    }
    if (i === "*" && a === "*" && l.match(/^\d$/)) {
      let m = parseInt(l, 10) % 7;
      let f;
      if (n) {
        let h = new Date();
        let g = (m - h.getUTCDay() + 7) % 7;
        h.setUTCDate(h.getUTCDate() + g);
        h.setUTCHours(d, u, 0, 0);
        f = vda[h.getDay()];
      } else {
        f = vda[m];
      }
      if (f) {
        return `Every ${f} at ${p(u, d)}`;
      }
    }
    if (i === "*" && a === "*" && l === "1-5") {
      return `Weekdays at ${p(u, d)}`;
    }
    return e;
  }
  function Ddt(e) {
    let t = e.trim();
    if (t === "") {
      return {
        error: "required"
      };
    }
    let n = t.match(/^(\d+)\s*([smhd])$/i);
    if (n) {
      let r = parseInt(n[1], 10);
      let o = n[2].toLowerCase();
      if (r < 1) {
        return {
          error: "interval must be at least 1"
        };
      }
      let s;
      switch (o) {
        case "s":
          return {
            error: "minimum interval is 1 minute"
          };
        case "m":
          if (r > 59) {
            return {
              error: "minute interval must be 1\u201359 (use hours instead)"
            };
          }
          s = r === 1 ? "* * * * *" : `*/${r} * * * *`;
          break;
        case "h":
          if (r > 23) {
            return {
              error: "hour interval must be 1\u201323 (use days instead)"
            };
          }
          s = r === 1 ? "0 * * * *" : `0 */${r} * * *`;
          break;
        case "d":
          if (r === 1) {
            s = "0 0 * * *";
            break;
          }
          if (r > 28) {
            return {
              error: "day interval must be 1\u201328 (use a cron expression)"
            };
          }
          s = `0 0 */${r} * *`;
          break;
        default:
          return {
            error: "unknown interval unit"
          };
      }
      return {
        cron: s,
        human: A1(s)
      };
    }
    if (lU(t) !== null) {
      return {
        cron: t,
        human: A1(t)
      };
    }
    return {
      error: "use an interval (5m, 2h, 1d) or 5-field cron (*/5 * * * *)"
    };
  }
  var Zhp;
  var vda;
  var vX = __lazy(() => {
    Zhp = [{
      min: 0,
      max: 59
    }, {
      min: 0,
      max: 23
    }, {
      min: 1,
      max: 31
    }, {
      min: 1,
      max: 12
    }, {
      min: 0,
      max: 6
    }];
    vda = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
  });
  function dTe(e) {
    return x2n.join(e ?? getProjectRoot(), ogp);
  }
  async function Ndt(e) {
    let t = zt();
    let n;
    try {
      n = await t.readFile(dTe(e), {
        encoding: "utf-8"
      });
    } catch (i) {
      if (Io(i)) {
        return [];
      }
      Oe(i);
      return [];
    }
    let r = Ba(n, false);
    if (!r || typeof r !== "object") {
      return [];
    }
    let o = r;
    if (!Array.isArray(o.tasks)) {
      return [];
    }
    let s = [];
    for (let i of o.tasks) {
      if (!i || typeof i.id !== "string" || typeof i.cron !== "string" || typeof i.prompt !== "string" || typeof i.createdAt !== "number") {
        logForDebugging(`[ScheduledTasks] skipping malformed task: ${De(i)}`);
        continue;
      }
      if (!lU(i.cron)) {
        logForDebugging(`[ScheduledTasks] skipping task ${i.id} with invalid cron '${i.cron}'`);
        continue;
      }
      s.push({
        id: i.id,
        cron: i.cron,
        prompt: i.prompt,
        createdAt: i.createdAt,
        ...(typeof i.lastFiredAt === "number" && {
          lastFiredAt: i.lastFiredAt
        }),
        ...(i.recurring && {
          recurring: true
        }),
        ...(i.permanent && {
          permanent: true
        }),
        ...(typeof i.createdBySessionId === "string" && {
          createdBySessionId: i.createdBySessionId
        }),
        ...(typeof i.createdByPid === "number" && {
          createdByPid: i.createdByPid
        }),
        ...(typeof i.createdByProcStart === "string" && {
          createdByProcStart: i.createdByProcStart
        })
      });
    }
    return s;
  }
  function k2n(e) {
    let t;
    try {
      t = Cda.readFileSync(dTe(e), "utf-8");
    } catch {
      return false;
    }
    let n = Ba(t, false);
    if (!n || typeof n !== "object") {
      return false;
    }
    let r = n.tasks;
    return Array.isArray(r) && r.length > 0;
  }
  async function L3t(e, t) {
    let n = t ?? getProjectRoot();
    await R2n.mkdir(x2n.join(n, ".claude"), {
      recursive: true
    });
    let r = {
      tasks: e.map(({
        durable: o,
        ...s
      }) => s)
    };
    await R2n.writeFile(dTe(n), De(r, null, 2) + `
`, "utf-8");
  }
  async function Ldt(e, t, n, r, o) {
    let s = wda.randomUUID().slice(0, 8);
    let i = {
      id: s,
      cron: e,
      prompt: t,
      createdAt: Date.now(),
      ...(n && {
        recurring: true
      })
    };
    if (!r) {
      addSessionCronTask({
        ...i,
        ...(o && {
          agentId: o
        })
      });
      return s;
    }
    let a = await Ndt();
    a.push({
      ...i,
      createdBySessionId: getSessionId(),
      createdByPid: process.pid,
      createdByProcStart: ownProcStart()
    });
    await L3t(a);
    return s;
  }
  async function gde(e, t) {
    if (e.length === 0) {
      return;
    }
    if (t === undefined && removeSessionCronTasks(e) === e.length) {
      return;
    }
    let n = new Set(e);
    let r = await Ndt(t);
    let o = r.filter(s => !n.vZc(s.id));
    if (o.length === r.length) {
      return;
    }
    await L3t(o, t);
  }
  async function Rda(e, t, n) {
    if (e.length === 0) {
      return;
    }
    let r = new Set(e);
    let o = await Ndt(n);
    let s = false;
    for (let i of o) {
      if (r.vZc(i.id)) {
        i.lastFiredAt = t;
        s = true;
      }
    }
    if (!s) {
      return;
    }
    await L3t(o, n);
  }
  async function yde(e) {
    let t = await Ndt(e);
    if (e !== undefined) {
      return t;
    }
    let n = getSessionCronTasks().map(r => ({
      ...r,
      durable: false
    }));
    return [...t, ...n];
  }
  function Mdt(e, t) {
    let n = lU(e);
    if (!n) {
      return null;
    }
    let r = Odt(n, new Date(t));
    return r ? r.getTime() : null;
  }
  function xda(e) {
    let t = parseInt(e.slice(0, 8), 16) / 4294967296;
    return Number.isFinite(t) ? t : 0;
  }
  function F3t(e, t, n, r = EV) {
    let o = Mdt(e, t);
    if (o === null) {
      return null;
    }
    let s = Mdt(e, o);
    if (s === null) {
      return o;
    }
    let i = s - o;
    if (rgp.test(e) && r.cacheLeadMs > 0 && r.cacheLeadMs < i && i >= 300000 && i - r.cacheLeadMs < 300000) {
      return t + i - r.cacheLeadMs;
    }
    let a = Math.min(xda(n) * r.recurringFrac * i, r.recurringCapMs);
    return o + a;
  }
  function A2n(e, t, n, r = EV) {
    let o = Mdt(e, t);
    if (o === null) {
      return null;
    }
    if (new Date(o).getMinutes() % r.oneShotMinuteMod !== 0) {
      return o;
    }
    let s = r.oneShotFloorMs + xda(n) * (r.oneShotMaxMs - r.oneShotFloorMs);
    return Math.max(o - s, t);
  }
  function kda(e, t) {
    return e.filter(n => {
      let r = Mdt(n.cron, n.createdAt);
      return r !== null && r < t;
    });
  }
  var wda;
  var Cda;
  var R2n;
  var x2n;
  var rgp;
  var ogp;
  var EV;
  var vV = __lazy(() => {
    at();
    vX();
    je();
    dt();
    Tb();
    Gd();
    Rn();
    wda = require("crypto");
    Cda = require("fs");
    R2n = require("fs/promises");
    x2n = require("path");
    rgp = /^\*\/\d+ \* \* \* \*$/;
    ogp = x2n.join(".claude", "scheduled_tasks.json");
    EV = {
      recurringFrac: 0.5,
      recurringCapMs: 1800000,
      oneShotMaxMs: 90000,
      oneShotFloorMs: 0,
      oneShotMinuteMod: 30,
      recurringMaxAgeMs: 604800000,
      cacheLeadMs: 15000
    };
  });
  var Ada = {};