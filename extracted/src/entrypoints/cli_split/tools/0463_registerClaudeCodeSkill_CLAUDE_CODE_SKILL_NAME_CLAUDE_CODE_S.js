  __export(PNc, {
    lxl: () => xNc,
    SKILL_FILES: () => SKILL_FILES_export4
  });
  var INc = e => typeof e === "string" ? e : e.default;
  var uNf;
  var dNf;
  var SKILL_FILES_export4;
  var MNc = {};
  __export(MNc, {
    registerDatavizSkill: () => registerDatavizSkill
  });
  function DNc() {
    return fNf ??= Promise.resolve().then(() => (ONc(), PNc));
  }
  function registerDatavizSkill() {
    Qc({
      name: "dataviz",
      menuDescription: "Chart and dashboard design guidance",
      description: 'Use this skill whenever you are about to create ANY chart, graph, plot, dashboard, or data visualization, in ANY output medium \u2014 an HTML or React artifact, inline SVG, plotting code in any library (matplotlib, plotly, d3, Recharts, \u2026), an image/PNG you will render and upload, or a chart shared into Slack. Read it BEFORE writing the first line of chart code, choosing chart colors, building a stat tile / meter / KPI row, or laying out a dashboard. Produces visualizations that read as one system \u2014 elegant, accessible, consistent in light and dark \u2014 using a brand-neutral placeholder palette you swap for your own. Teaches a design-system-agnostic method: a form heuristic, a color formula with a runnable validator, mark specs, and interaction rules. A validated default palette is documented in `references/palette.md` \u2014 swap that file\'s values for your brand\'s. Triggers on: "chart", "graph", "plot", "data viz", "visualization", "dashboard", "analytics", "visualize data", "categorical colors", "sequential / diverging palette", "stat tile", "sparkline", "heatmap", "legend", "axis", "tooltip", "chart colors", "color by series".',
      userInvocable: true,
      files: () => DNc().then(t => t.SKILL_FILES),
      async getPromptForCommand(t) {
        let {
          lxl: n
        } = await DNc();
        let r = [sf(n).content.trimStart()];
        if (t) {
          r.push(`## User Request

${t}`);
        }
        return [{
          type: "text",
          text: r.join(`

`)
        }];
      }
    });
  }
  var fNf;
  var NNc = __lazy(() => {
    fv();
    x_();
  });
  var $Nc = {};
  __export($Nc, {
    registerLoopSkill: () => registerLoopSkill
  });
  function FNc() {
    return ZOe() ? ` Before you stop, send a one-line outcome via ${"PushNotification"} \u2014 the user may be away and waiting to hear it's done. Skip this if you're stopping because the user just told you to; they're already here.` : "";
  }
  function bNf(e) {
    let t = e[1];
    let n = e[2].toLowerCase();
    if (n.startsWith("s")) {
      return `${t}s`;
    }
    if (n.startsWith("h")) {
      return `${t}h`;
    }
    if (n.startsWith("d")) {
      return `${t}d`;
    }
    return `${t}m`;
  }
  function UNc() {
    if (!st(process.env.CLAUDE_CODE_REMOTE) && !li() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_surreal_dali", false) && isPolicyAllowed("allow_remote_sessions") && getAllowedChannels().length === 0) {
      return `
## Offer cloud first

Before any scheduling step, check whether EITHER is true:
- the parsed interval (rule 1 or 2) is **\u226560 minutes**, or
- regardless of which rule matched, the original input uses daily phrasing ("every morning", "daily", "every day", "each night", "every weekday")

If either is true, call ${"AskUserQuestion"} first:
- \`question\`: "This loop stops when you close this session. Set it up as a cloud schedule instead so it keeps running?"
- \`header\`: "Schedule"
- \`options\`: \`[{label: "Cloud schedule (recommended)", description: "Runs in Anthropic's cloud even after you close this session"}, {label: "This session only", description: "Runs in this terminal until you exit"}]\`

If they pick **Cloud schedule**: do NOT call ${"CronCreate"}. Invoke the \`schedule\` skill directly via the ${"Skill"} tool with \`args\` set to their original input verbatim (e.g. \`${"Skill"}({skill: "schedule", args: "every morning tell me a joke"})\`), then follow that skill's instructions to completion. Do NOT tell the user to run /schedule themselves. **Then stop \u2014 do not continue to any section below** (no ${"CronCreate"}, no ${"ScheduleWakeup"}, no "execute the prompt now").
If they pick **This session only**:
- If the trigger was a parsed \u226560-minute interval (rule 1 or 2): continue below with that interval.
- If the trigger was daily phrasing only (rule 3, no parsed interval): do NOT call ${"CronCreate"}. Explain that a daily-cadence loop won't fire before this session closes, so there's nothing useful to schedule locally \u2014 suggest they either pick Cloud schedule, or re-run \`/loop\` with an explicit shorter interval (e.g. \`/loop 1h <prompt>\`) if they want a session loop. Then stop.
If neither trigger condition was met: continue below.
`;
    }
    return "";
  }
  function BNc() {
    if (!st(process.env.CLAUDE_CODE_REMOTE) && !li() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_surreal_dali", false) && isPolicyAllowed("allow_remote_sessions")) {
      if (getAllowedChannels().length > 0) {
        return ` End the confirmation with this exact line on its own, italicized: ${"`_Runs until you close this session \xB7 For durable cloud-based loops, use /schedule_`"}`;
      }
      return ` Only if you did NOT show the cloud-offer ${"AskUserQuestion"} above (i.e., neither trigger condition applied), end the confirmation with this exact line on its own, italicized: ${"`_Runs until you close this session \xB7 For durable cloud-based loops, use /schedule_`"}. If the user already answered that question, omit this line.`;
    }
    return "";
  }
  function ENf() {
    return `1. Call ${"CronCreate"} with: \`cron\` (the expression above), \`prompt\` (the parsed prompt verbatim), \`recurring: true\`.
2. Briefly confirm: what's scheduled, the cron expression, the human-readable cadence, that recurring tasks auto-expire after ${DEFAULT_MAX_AGE_DAYS} days, and that the user can cancel sooner with ${"CronDelete"} (include the job ID).${BNc()}
3. **Then immediately execute the parsed prompt now** \u2014 don't wait for the first cron fire. If it's a slash command, invoke it via the Skill tool; otherwise act on it directly.`;
  }
  function vNf(e) {
    return `# /loop \u2014 schedule a recurring prompt

Parse the input below into \`[interval] <prompt\u2026>\` and schedule it with ${"CronCreate"}.

## Parsing (in priority order)

1. **Leading token**: if the first whitespace-delimited token matches \`^\\d+[smhd]$\` (e.g. \`5m\`, \`2h\`), that's the interval; the rest is the prompt.
2. **Trailing "every" clause**: otherwise, if the input ends with \`every <N><unit>\` or \`every <N> <unit-word>\` (e.g. \`every 20m\`, \`every 5 minutes\`, \`every 2 hours\`), extract that as the interval and strip it from the prompt. Only match when what follows "every" is a time expression \u2014 \`check every PR\` has no interval.
3. **Default**: otherwise, interval is \`${"10m"}\` and the entire input is the prompt.

If the resulting prompt is empty, show usage \`/loop [interval] <prompt>\` and stop \u2014 do not call ${"CronCreate"}.

Examples:
- \`5m /babysit-prs\` \u2192 interval \`5m\`, prompt \`/babysit-prs\` (rule 1)
- \`check the deploy every 20m\` \u2192 interval \`20m\`, prompt \`check the deploy\` (rule 2)
- \`run tests every 5 minutes\` \u2192 interval \`5m\`, prompt \`run tests\` (rule 2)
- \`check the deploy\` \u2192 interval \`${"10m"}\`, prompt \`check the deploy\` (rule 3)
- \`check every PR\` \u2192 interval \`${"10m"}\`, prompt \`check every PR\` (rule 3 \u2014 "every" not followed by time)
- \`5m\` \u2192 empty prompt \u2192 show usage
${UNc()}
## Interval \u2192 cron

Supported suffixes: \`s\` (seconds, rounded up to nearest minute, min 1), \`m\` (minutes), \`h\` (hours), \`d\` (days). Convert:

| Interval pattern      | Cron expression     | Notes                                    |
|-----------------------|---------------------|------------------------------------------|
| \`Nm\` where N \u2264 59   | \`*/N * * * *\`     | every N minutes                          |
| \`Nm\` where N \u2265 60   | \`0 */H * * *\`     | round to hours (H = N/60, must divide 24)|
| \`Nh\` where N \u2264 23   | \`0 */N * * *\`     | every N hours                            |
| \`Nd\`                | \`0 0 */N * *\`     | every N days at midnight local           |
| \`Ns\`                | treat as \`ceil(N/60)m\` | cron minimum granularity is 1 minute  |

**If the interval doesn't cleanly divide its unit** (e.g. \`7m\` \u2192 \`*/7 * * * *\` gives uneven gaps at :56\u2192:00; \`90m\` \u2192 1.5h which cron can't express), pick the nearest clean interval and tell the user what you rounded to before scheduling.

## Action

1. Call ${"CronCreate"} with:
   - \`cron\`: the expression from the table above
   - \`prompt\`: the parsed prompt from above, verbatim (slash commands are passed through unchanged)
   - \`recurring\`: \`true\`
2. Briefly confirm: what's scheduled, the cron expression, the human-readable cadence, that recurring tasks auto-expire after ${DEFAULT_MAX_AGE_DAYS} days, and that they can cancel sooner with ${"CronDelete"} (include the job ID).${BNc()}
3. **Then immediately execute the parsed prompt now** \u2014 don't wait for the first cron fire. If it's a slash command, invoke it via the Skill tool; otherwise act on it directly.

## Input

${e}`;
  }
  function wNf() {
    return `Usage: /loop [interval] <prompt>

Run a prompt or slash command on a recurring interval \u2014 or with no interval, let the model self-pace based on the task.

Intervals: Ns, Nm, Nh, Nd (e.g. 5m, 30m, 2h, 1d). Minimum granularity is 1 minute.
If no interval is specified, the model picks a delay between iterations based on what it's doing.

Examples:
  /loop 5m /babysit-prs
  /loop 30m check the deploy
  /loop 1h /standup 1
  /loop check the deploy          (dynamic \u2014 model picks delays)
  /loop check the deploy every 20m`;
  }
  function CNf(e) {
    let t = `The user wants you to self-pace. Decide what makes the next iteration worth running \u2014 a passage of time, or an observable event.

1. **Run the parsed prompt now.** If it's a slash command, invoke it via the Skill tool; otherwise act on it directly.
2. **If the next run is gated on an event** (CI finishing, a log line matching, a file changing, a PR comment) and no ${"Monitor"} is already running for it: arm one now with \`persistent: true\`. Its events arrive as \`<task-notification>\` messages and wake this loop immediately \u2014 you do not wait for the ${"ScheduleWakeup"} deadline. Arm once; on later iterations call ${"TaskList"} first and skip this step if a monitor is already running.
3. **Briefly confirm**: that you're self-pacing, whether a ${"Monitor"} is the primary wake signal, that you ran the task now, and what fallback delay you're about to pick. Write this as text *before* calling ${"ScheduleWakeup"} \u2014 the turn ends as soon as that tool returns.
4. **Then, as the last action of this turn, call ${"ScheduleWakeup"}** with:
   - \`delaySeconds\`: with a ${"Monitor"} armed this is the **fallback heartbeat** \u2014 how long to wait if no event fires (lean 1200\u20131800s; idle ticks past the 5-minute cache window are pure overhead). Without a ${"Monitor"} this is the cadence \u2014 pick based on what you observed. Read the tool's own description for cache-aware delay guidance.
   - \`reason\`: one short sentence on why you picked that delay.
   - \`prompt\`: the full original /loop input verbatim, prefixed with \`/loop \` so the next firing re-enters this skill and continues the loop. For example, if the user typed \`/loop check the deploy\`, pass \`/loop check the deploy\` as the prompt.
5. **If you were woken by a \`<task-notification>\`** rather than this prompt: handle the event in the context of the loop task, then call ${"ScheduleWakeup"} again with the same \`prompt\` and the same 1200\u20131800s \`delaySeconds\` from step 4 \u2014 the ${"Monitor"} remains the wake signal; this only resets the safety net.
6. **To stop the loop**, omit the ${"ScheduleWakeup"} call and ${"TaskStop"} any ${"Monitor"} you armed (use ${"TaskList"} to find the task ID if it is no longer in context).${FNc()}`;
    return `# /loop \u2014 schedule a recurring or self-paced prompt

Parse the input below into \`[interval] <prompt\u2026>\` and schedule it.

## Parsing (in priority order)

1. **Leading token**: if the first whitespace-delimited token matches \`^\\d+[smhd]$\` (e.g. \`5m\`, \`2h\`), that's the interval; the rest is the prompt.
2. **Trailing "every" clause**: otherwise, if the input ends with \`every <N><unit>\` or \`every <N> <unit-word>\` (e.g. \`every 20m\`, \`every 5 minutes\`, \`every 2 hours\`), extract that as the interval and strip it from the prompt. Only match when what follows "every" is a time expression \u2014 \`check every PR\` has no interval.
3. **No interval**: otherwise, the entire input is the prompt and you'll self-pace dynamically (see "Dynamic mode" below).

If the resulting prompt is empty, show usage \`/loop [interval] <prompt>\` and stop.

Examples:
- \`5m /babysit-prs\` \u2192 interval \`5m\`, prompt \`/babysit-prs\` (rule 1)
- \`check the deploy every 20m\` \u2192 interval \`20m\`, prompt \`check the deploy\` (rule 2)
- \`run tests every 5 minutes\` \u2192 interval \`5m\`, prompt \`run tests\` (rule 2)
- \`check the deploy\` \u2192 no interval \u2192 dynamic mode, prompt \`check the deploy\` (rule 3)
- \`check every PR\` \u2192 no interval \u2192 dynamic mode, prompt \`check every PR\` (rule 3 \u2014 "every" not followed by time)
- \`5m\` \u2192 empty prompt \u2192 show usage
${UNc()}
## Fixed-interval mode (rules 1 and 2)

Convert the interval to a cron expression:

${"| Interval pattern      | Cron expression     | Notes                                    |\n|-----------------------|---------------------|------------------------------------------|\n| `Nm` where N \u2264 59   | `*/N * * * *`     | every N minutes                          |\n| `Nm` where N \u2265 60   | `0 */H * * *`     | round to hours (H = N/60, must divide 24)|\n| `Nh` where N \u2264 23   | `0 */N * * *`     | every N hours                            |\n| `Nd`                | `0 0 */N * *`     | every N days at midnight local           |\n| `Ns`                | treat as `ceil(N/60)m` | cron minimum granularity is 1 minute  |\n\n**If the interval doesn't cleanly divide its unit** (e.g. `7m` \u2192 `*/7 * * * *` gives uneven gaps at :56\u2192:00; `90m` \u2192 1.5h which cron can't express), pick the nearest clean interval and tell the user what you rounded to before scheduling."}

Then:
${ENf()}

## Dynamic mode (rule 3 \u2014 no interval)

${t}

## Input

${e}`;
  }
  function registerLoopSkill() {
    Qc({
      name: "loop",
      menuDescription: "Repeat a prompt or command on an interval (e.g. /loop 5m /foo)",
      aliases: ["proactive"],
      get description() {
        if (pTe()) {
          return "Run a prompt or slash command on a recurring interval (e.g. /loop 5m /foo). Omit the interval to let the model self-pace.";
        }
        return "Run a prompt or slash command on a recurring interval (e.g. /loop 5m /foo, defaults to 10m)";
      },
      whenToUse: 'When the user wants to set up a recurring task, poll for status, or run something repeatedly on an interval (e.g. "check the deploy every 5 minutes", "keep running /babysit-prs"). Do NOT invoke for one-off tasks.',
      get argumentHint() {
        if (CXe.isLoopDefaultPromptEnabled()) {
          return "[interval] [prompt]";
        }
        return "[interval] <prompt>";
      },
      userInvocable: true,
      isEnabled: isKairosCronEnabled,
      async getPromptForCommand(e, t) {
        let n = e.trim();
        {
          let r = n.match(_Nf);
          let o = !n;
          let s = yNf.test(n) || r !== null;
          if (o || s) {
            if (CXe.isLoopDefaultPromptEnabled()) {
              let i = r ? bNf(r) : n || "10m";
              let a = (c, u) => {
                let d = c ? `## Loop tasks (from ${c.path})` : "## Autonomous-loop instructions (for the immediate execution and every fire)";
                let p;
                if (c) {
                  p = c.content;
                } else {
                  CXe.logAutonomousLoopActivation();
                  p = CXe.getAutonomousLoopPreamble();
                }
                let m = c ? "the loop.md tasks" : "the autonomous check";
                if (u) {
                  let _ = c ? CXe.LOOP_FILE_DYNAMIC_SENTINEL : "<<autonomous-loop-dynamic>>";
                  let b = c ? `# /loop \u2014 loop.md tasks with dynamic pacing

The user invoked \`/loop\` with no prompt and no interval and has a loop-tasks file at \`${c.path}\`. Run those tasks now, then self-pace the next iteration via ${"ScheduleWakeup"} \u2014 no cron.` : `# /loop \u2014 autonomous default with dynamic pacing

The user invoked \`/loop\` with no prompt and no interval. Run the autonomous check now, then self-pace the next iteration via ${"ScheduleWakeup"} \u2014 no cron.`;
                  let S = c ? `that you're running tasks from \`${c.path}\` in dynamic-pacing mode, that you ran the first tick now` : "that this is the autonomous default in dynamic-pacing mode, that you ran the check now";
                  let E = `1. **Run ${m} now**, following the instructions inlined below.
2. **If the next tick is gated on an event** (CI finishing, a PR comment, a log line) and no ${"Monitor"} is already running for it: arm one now with \`persistent: true\`. Its events wake this loop immediately \u2014 you do not wait for the ${"ScheduleWakeup"} deadline. Arm once; on later ticks call ${"TaskList"} first and skip if a monitor is already running.
3. **Briefly confirm**: ${S}, whether a ${"Monitor"} is the primary wake signal, and what fallback delay you're about to pick. Write this as text *before* calling ${"ScheduleWakeup"} \u2014 the turn ends as soon as that tool returns.
4. **Then, as the last action of this turn, call ${"ScheduleWakeup"}** with:
   - \`delaySeconds\`: with a ${"Monitor"} armed this is the fallback heartbeat (lean 1200\u20131800s). Without one, pick based on what you observed this turn \u2014 quiet branch? wait longer. Lots in flight? wait shorter. Read the tool's own description for cache-aware delay guidance.
   - \`reason\`: one short sentence on why you picked that delay.
   - \`prompt\`: the literal string \`${_}\` \u2014 the dynamic-mode sentinel expands at fire time to the full instructions (first fire / first fire post-compact / loop.md edited) or a dynamic-pacing-specific short reminder (subsequent fires). Do not pass the full instructions; that is handled automatically.
5. **If woken by a \`<task-notification>\`** rather than this prompt: handle the event, then call ${"ScheduleWakeup"} again with \`${_}\` and the same 1200\u20131800s \`delaySeconds\` \u2014 the ${"Monitor"} remains the wake signal; this only resets the safety net.
6. **To stop the loop**, omit the ${"ScheduleWakeup"} call and ${"TaskStop"} any ${"Monitor"} you armed (use ${"TaskList"} to find the task ID if it is no longer in context).${FNc()}`;
                  return `${b}

## Action

${E}

${d}

${p}`;
                }
                let f = c ? CXe.LOOP_FILE_SENTINEL : "<<autonomous-loop>>";
                let h = c ? `# /loop \u2014 schedule loop.md tasks

The user invoked \`/loop\` with no prompt (input was empty or just the interval \`${i}\`) and has a loop-tasks file at \`${c.path}\`. Schedule a recurring cron that runs those tasks each tick, then run the first tick immediately.` : `# /loop \u2014 schedule the autonomous default

The user invoked \`/loop\` with no prompt (input was empty or just the interval \`${i}\`). Schedule the autonomous-loop default and then run the first autonomous check immediately.`;
                let g = c ? "it expands at fire time to the full loop.md contents on first delivery (and whenever loop.md has been edited since last fire), and to a short reminder on subsequent unchanged fires. The long instructions stay in the cached message-prefix." : "it expands at fire time to the full autonomous-loop instructions on first delivery, and to a short reminder on subsequent fires (the long instructions stay in the cached message-prefix).";
                let y = c ? `what's scheduled, the cron expression, the human-readable cadence, that it's running tasks from \`${c.path}\`, that recurring tasks auto-expire after ${DEFAULT_MAX_AGE_DAYS} days, and that the user can cancel sooner with ${"CronDelete"} (include the job ID).` : `what's scheduled, the cron expression, the human-readable cadence, that recurring tasks auto-expire after ${DEFAULT_MAX_AGE_DAYS} days, and that they can cancel sooner with ${"CronDelete"} (include the job ID). Mention this is the autonomous default and that the autonomous-loop instructions are baked in.`;
                return `${h}

## Action

1. Convert \`${i}\` to a 5-field cron expression. Supported suffixes: \`s\` \u2192 ceil to nearest minute, \`m\` (minutes), \`h\` (hours), \`d\` (days). Examples: \`5m\` \u2192 \`*/5 * * * *\`, \`1h\` \u2192 \`0 * * * *\`, \`1d\` \u2192 \`0 0 * * *\`. If the interval doesn't cleanly divide its unit, round to the nearest clean interval and tell the user what you rounded to.
2. Call ${"CronCreate"} with:
   - \`cron\`: the expression from step 1
   - \`prompt\`: the literal string \`${f}\` \u2014 ${g}
   - \`recurring\`: \`true\`
3. Briefly confirm: ${y}
4. **Then immediately run ${m} now**, following the instructions inlined below. Don't wait for the first cron fire.

${d}

${p}`;
              };
              let l = CXe.readLoopFile();
              if (o && pTe()) {
                return [{
                  type: "text",
                  text: a(l, true)
                }];
              }
              return [{
                type: "text",
                text: a(l, false)
              }];
            }
          }
        }
        if (pTe()) {
          if (!n) {
            return [{
              type: "text",
              text: wNf()
            }];
          }
          return [{
            type: "text",
            text: CNf(n)
          }];
        }
        if (!n) {
          return [{
            type: "text",
            text: SNf
          }];
        }
        return [{
          type: "text",
          text: vNf(n)
        }];
      }
    });
  }
  var CXe;
  var yNf;
  var _Nf;
  var SNf;
  var HNc = __lazy(() => {
    at();
    bde();
    $n();
    Kc();
    cU();
    wX();
    soe();
    OG();
    ioe();
    yd();
    gn();
    x_();
    CXe = (E9e(), __toCommonJS(T9e));
    yNf = /^\d+[smhd]$/;
    _Nf = /^every\s+(\d+)\s*(s|sec|secs|second|seconds|m|min|mins|minute|minutes|h|hr|hrs|hour|hours|d|day|days)\s*$/i;
    SNf = `Usage: /loop [interval] <prompt>

Run a prompt or slash command on a recurring interval.

Intervals: Ns, Nm, Nh, Nd (e.g. 5m, 30m, 2h, 1d). Minimum granularity is 1 minute.
If no interval is specified, defaults to ${"10m"}.

Examples:
  /loop 5m /babysit-prs
  /loop 30m check the deploy
  /loop 1h /standup 1
  /loop check the deploy          (defaults to ${"10m"})
  /loop check the deploy every 20m`;
  });
  var WNc = {};
  __export(WNc, {
    registerScheduleRemoteAgentsSkill: () => registerScheduleRemoteAgentsSkill
  });
  function kNf(e) {
    if (!e.startsWith("mcpsrv_")) {
      return null;
    }
    let r = e.slice(7).slice(2);
    let o = 0n;
    for (let i of r) {
      let a = ("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz").indexOf(i);
      if (a === -1) {
        return null;
      }
      o = o * 58n + BigInt(a);
    }
    let s = o.toString(16).padStart(32, "0");
    return `${s.slice(0, 8)}-${s.slice(8, 12)}-${s.slice(12, 16)}-${s.slice(16, 20)}-${s.slice(20, 32)}`;
  }
  function ANf(e) {
    let t = [];
    for (let n of e) {
      if (n.type !== "connected") {
        continue;
      }
      if (n.config.type !== "claudeai-proxy") {
        continue;
      }
      let r = kNf(n.config.id);
      if (!r) {
        continue;
      }
      t.push({
        uuid: r,
        name: n.name,
        url: n.config.url
      });
    }
    return t;
  }
  function INf(e) {
    return e.replace(/^claude[.\s-]ai[.\s-]/i, "").replace(/[^a-zA-Z0-9_-]/g, "-").replace(/-+/g, "-").replace(/^-|-$/g, "");
  }
  function PNf(e) {
    if (e.length === 0) {
      return "No connected MCP connectors found. The user may need to connect servers at https://claude.ai/customize/connectors";
    }
    let t = ["Connected connectors (available for routines):"];
    for (let n of e) {
      let r = INf(n.name);
      t.push(`- ${n.name} (connector_uuid: ${n.uuid}, name: ${r}, url: ${n.url})`);
    }
    return t.join(`
`);
  }
  function qNc(e) {
    return `\u26A0 Heads-up:
${e.map(n => `- ${n}`).join(`
`)}`;
  }
  async function ONf() {
    let e = await getRemoteUrl();
    if (!e) {
      return null;
    }
    let t = parseGitRemote(e);
    if (!t) {
      return null;
    }
    return `https://${t.host}/${t.owner}/${t.name}`;
  }
  function DNf(e) {
    let {
      userTimezone: t,
      nowUtcIso: n,
      nowLocal: r,
      oneOffEnabled: o,
      connectorsInfo: s,
      gitRepoUrl: i,
      environmentsInfo: a,
      createdEnvironment: l,
      setupNotes: c,
      needsGitHubAccessReminder: u,
      userArgs: d
    } = e;
    let p = d && c.length > 0 ? `
## Setup Notes

${qNc(c)}
` : "";
    let m = c.length > 0 ? `${qNc(c)}

${"What would you like to do with scheduled cloud agents?"}` : "What would you like to do with scheduled cloud agents?";
    let f = d ? "The user has already told you what they want (see User Request at the bottom). Skip the initial question and go directly to the matching workflow." : `Your FIRST action must be a single ${"AskUserQuestion"} tool call (no preamble). Use this EXACT string for the \`question\` field \u2014 do not paraphrase or shorten it:

${De(m)}

Set \`header: "Action"\` and offer the four actions (create/list/update/run) as options. After the user picks, follow the matching workflow below.`;
    return `# Schedule Cloud Agents

You are helping the user schedule, update, list, or run **cloud** Claude Code agents. These are NOT local cron jobs \u2014 each routine spawns a fully isolated cloud session (CCR) in Anthropic's cloud infrastructure${o ? ", either on a recurring cron schedule or once at a specific time" : " on a recurring cron schedule"}. The agent runs in a sandboxed environment with its own git checkout, tools, and optional MCP connections.

## First Step

${f}
${p}

## What You Can Do

Use the \`${"RemoteTrigger"}\` tool (load it first with \`ToolSearch select:${"RemoteTrigger"}\`; auth is handled in-process \u2014 do not use curl):

- \`{action: "list"}\` \u2014 list all routines
- \`{action: "get", trigger_id: "..."}\` \u2014 fetch one routine
- \`{action: "create", body: {...}}\` \u2014 create a routine
- \`{action: "update", trigger_id: "...", body: {...}}\` \u2014 partial update
- \`{action: "run", trigger_id: "..."}\` \u2014 run a routine now

(Note: the API uses \`trigger_id\` as the parameter name, but the user-facing term is "routine".)

You CANNOT delete routines. If the user asks to delete, direct them to: https://claude.ai/code/routines

## Create body shape

For a recurring schedule:

\`\`\`json
{
  "name": "AGENT_NAME",
  "cron_expression": "CRON_EXPR",
  "enabled": true,
  "job_config": {
    "ccr": {
      "environment_id": "ENVIRONMENT_ID",
      "session_context": {
        "model": "claude-sonnet-5",
        "sources": [
          {"git_repository": {"url": "${i || "https://github.com/ORG/REPO"}"}}
        ],
        "allowed_tools": ["Bash", "Read", "Write", "Edit", "Glob", "Grep"]
      },
      "events": [
        {"data": {
          "uuid": "<lowercase v4 uuid>",
          "session_id": "",
          "type": "user",
          "parent_tool_use_id": null,
          "message": {"content": "PROMPT_HERE", "role": "user"}
        }}
      ]
    }
  }
}
\`\`\`

${o ? 'For a one-time run, replace `"cron_expression": "CRON_EXPR"` with `"run_once_at": "YYYY-MM-DDTHH:MM:SSZ"` (RFC3339 UTC, must be in the future). Everything else is identical.\n\n' : ""}Generate a fresh lowercase UUID for \`events[].data.uuid\` yourself.

## Available MCP Connectors

These are the user's currently connected claude.ai MCP connectors:

${s}

When attaching connectors to a routine, use the \`connector_uuid\` and \`name\` shown above (the name is already sanitized to only contain letters, numbers, hyphens, and underscores), and the connector's URL. The \`name\` field in \`mcp_connections\` must only contain \`[a-zA-Z0-9_-]\` \u2014 dots and spaces are NOT allowed.

**Important:** Infer what services the agent needs from the user's description. For example, if they say "check Datadog and Slack me errors," the agent needs both Datadog and Slack connectors. Cross-reference against the list above and warn if any required service isn't connected. If a needed connector is missing, direct the user to https://claude.ai/customize/connectors to connect it first.

## Environments

Every routine requires an \`environment_id\` in the job config. This determines where the cloud agent runs. Ask the user which environment to use.

${a}

Use the \`id\` value as the \`environment_id\` in \`job_config.ccr.environment_id\`.
${l ? `
**Note:** A new environment \`${l.name}\` (id: \`${l.environment_id}\`) was just created for the user because they had none. Use this id for \`job_config.ccr.environment_id\` and mention the creation when you confirm the routine config.
` : ""}

## API Field Reference

### Create Routine \u2014 Required Fields
- \`name\` (string) \u2014 A descriptive name
${o ? "- Exactly ONE of:\n  - `cron_expression` (string) \u2014 5-field cron in UTC. **Minimum interval is 1 hour.**\n  - `run_once_at` (string) \u2014 RFC3339 UTC timestamp. Must be in the future. Fires once, then auto-disables." : "- `cron_expression` (string) \u2014 5-field cron in UTC. **Minimum interval is 1 hour.**"}
- \`job_config\` (object) \u2014 Session configuration (see structure above)

### Create Routine \u2014 Optional Fields
- \`enabled\` (boolean, default: true)
- \`mcp_connections\` (array) \u2014 MCP servers to attach:
  \`\`\`json
  [{"connector_uuid": "uuid", "name": "server-name", "url": "https://..."}]
  \`\`\`

### Update Routine \u2014 Optional Fields
All fields optional (partial update):
- \`name\`, \`cron_expression\`${o ? ", `run_once_at`" : ""}, \`enabled\`, \`job_config\`
- \`mcp_connections\` \u2014 Replace MCP connections
- \`clear_mcp_connections\` (boolean) \u2014 Remove all MCP connections

### Cron Expression Examples

The user's local timezone is **${t}**. Cron expressions${o ? " and `run_once_at` timestamps" : ""} are always in UTC. When the user says a local time, convert it to UTC but confirm with them: "9am ${t} = Xam UTC, so the cron would be \`0 X * * 1-5\`."${o ? ' For one-time runs, the same conversion applies \u2014 "run this at 3pm" \u2192 `"run_once_at": "YYYY-MM-DDTHH:00:00Z"` with their 3pm converted to UTC.' : ""}

- \`0 9 * * 1-5\` \u2014 Every weekday at 9am **UTC**
- \`0 */2 * * *\` \u2014 Every 2 hours
- \`0 0 * * *\` \u2014 Daily at midnight **UTC**
- \`30 14 * * 1\` \u2014 Every Monday at 2:30pm **UTC**
- \`0 8 1 * *\` \u2014 First of every month at 8am **UTC**

Minimum interval is 1 hour. \`*/30 * * * *\` will be rejected.
${o ? `
### Current Time (for one-off runs)

When /schedule was invoked it was **${r}** (${t}) / **${n}** UTC. Treat this as an approximate anchor only \u2014 the conversation may have been running for a while since then.

**Before computing any \`run_once_at\` value, you MUST re-check the current time** by running \`date -u +%Y-%m-%dT%H:%M:%SZ\` via the Bash tool. Do not guess or infer today's date from conversation context. Resolve relative requests ("tomorrow at 9am", "in 3 hours", "next Monday") against the freshly fetched time, then echo the resolved local time AND the UTC timestamp back to the user for confirmation before creating the routine. If the resolved time is already in the past, ask the user to clarify rather than silently rolling forward.
` : ""}
## Workflow

### CREATE a new routine:

1. **Understand the goal** \u2014 Ask what they want the cloud agent to do. What repo(s)? What task? Remind them that the agent runs in the cloud \u2014 it won't have access to their local machine, local files, or local environment variables.
2. **Craft the prompt** \u2014 Help them write an effective agent prompt. Good prompts are:
   - Specific about what to do and what success looks like
   - Clear about which files/areas to focus on
   - Explicit about what actions to take (open PRs, commit, just analyze, etc.)
3. **Set the schedule** \u2014 Ask when and how often. The user's timezone is ${t}. When they say a time (e.g., "every morning at 9am"), assume they mean their local time and convert to UTC for the cron expression. Always confirm the conversion: "9am ${t} = Xam UTC."${o ? ' If they want a one-time run (e.g., "once at 3pm", "tomorrow morning", "remind me to check X later"), use `run_once_at` instead of `cron_expression` \u2014 same timezone conversion applies. **First re-check the current time with `date -u` via Bash** (the reference time above may be stale in a long conversation), resolve the relative phrase against that fresh value, and confirm the resulting absolute timestamp with the user.' : ""}
4. **Choose the model** \u2014 Default to \`claude-sonnet-5\`. Tell the user which model you're defaulting to and ask if they want a different one.
5. **Validate connections** \u2014 Infer what services the agent will need from the user's description. For example, if they say "check Datadog and Slack me errors," the agent needs both Datadog and Slack MCP connectors. Cross-reference with the connectors list above. If any are missing, warn the user and link them to https://claude.ai/customize/connectors to connect first.${i ? ` The default git repo is already set to \`${i}\`. Ask the user if this is the right repo or if they need a different one.` : " Ask which git repos the cloud agent needs cloned into its environment."}
6. **Review and confirm** \u2014 Show the full configuration before creating. Let them adjust.
7. **Create it** \u2014 Call \`${"RemoteTrigger"}\` with \`action: "create"\` and show the result. The response includes the routine ID. Always output a link at the end: \`https://claude.ai/code/routines/{ROUTINE_ID}\`

### UPDATE a routine:

1. List routines first so they can pick one
2. Ask what they want to change
3. Show current vs proposed value
4. Confirm and update

### LIST routines:

1. Fetch and display in a readable format
2. Show: name, schedule (human-readable), enabled/disabled, next run, repo(s)

### RUN NOW:

1. List routines if they haven't specified which one
2. Confirm which routine
3. Execute and confirm

## Important Notes

- These are CLOUD agents \u2014 they run in Anthropic's cloud, not on the user's machine. They cannot access local files, local services, or local environment variables.
- Always convert cron to human-readable when displaying
${o ? '- When listing routines, `ended_reason: "run_once_fired"` means a one-shot already ran (shows as "Ran" in the web UI). The user can re-arm it by updating with a new `run_once_at`.\n' : ""}- Default to \`enabled: true\` unless user says otherwise
- Accept GitHub URLs in any format (https://github.com/org/repo, org/repo, etc.) and normalize to the full HTTPS URL (without .git suffix)
- The prompt is the most important part \u2014 spend time getting it right. The cloud agent starts with zero context, so the prompt must be self-contained.
- To delete a routine, direct users to https://claude.ai/code/routines
${u ? `- If the user's request seems to require GitHub repo access (e.g. cloning a repo, opening PRs, reading code), remind them that ${getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_lantern", false) && isPolicyAllowed("allow_quick_web_setup") ? "they should run /web-setup to connect their GitHub account (or install the Claude GitHub App on the repo as an alternative) \u2014 otherwise the cloud agent won't be able to access it" : "they need the Claude GitHub App installed on the repo \u2014 otherwise the cloud agent won't be able to access it"}.` : ""}
${d ? `
## User Request

The user said: "${d}"

Start by understanding their intent and working through the appropriate workflow above.` : ""}`;
  }
  function registerScheduleRemoteAgentsSkill() {
    Qc({
      name: "schedule",
      menuDescription: "Create and manage routines: cloud agents on a schedule",
      aliases: ["routines"],
      description: "Create, update, list, or run scheduled cloud agents (routines) that execute on a cron schedule.",
      whenToUse: () => {
        if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_orchid_mantis", false)) {
          return 'When the user wants to schedule a recurring or one-time cloud agent ("run this every Monday", "open a cleanup PR for X in 2 weeks"), or to manage existing routines.';
        }
        return `When the user wants to schedule a recurring cloud agent, set up automated tasks, create a cron job for Claude Code, or manage their scheduled agents/routines.${getFeatureValue_CACHED_MAY_BE_STALE("tengu_mocha_barista", false) ? ' Also use when the user wants a one-time scheduled run ("run this once at 3pm", "remind me to check X tomorrow").' : ""}`;
      },
      userInvocable: true,
      isEnabled: () => isFirstPartyProvider() && isClaudeAISubscriber() && !st(process.env.CLAUDE_CODE_REMOTE) && getFeatureValue_CACHED_MAY_BE_STALE("tengu_surreal_dali", false) && isPolicyAllowed("allow_remote_sessions"),
      allowedTools: ["RemoteTrigger", "AskUserQuestion", "Bash(date *)"],
      async getPromptForCommand(e, t) {
        if (!hasStoredOAuthToken()) {
          return [{
            type: "text",
            text: "You need to authenticate with a claude.ai account first. API accounts are not supported. Run /login, then try /schedule again."
          }];
        }
        let n;
        try {
          n = await Koe();
        } catch (_) {
          logForDebugging(`[schedule] Failed to fetch environments: ${_}`, {
            level: "warn"
          });
          return [{
            type: "text",
            text: "We're having trouble connecting with your remote claude.ai account to set up a scheduled task. Please try /schedule again in a few minutes."
          }];
        }
        let r = null;
        if (n.length === 0) {
          try {
            r = await Tgt();
            n = [r];
          } catch (_) {
            logForDebugging(`[schedule] Failed to create environment: ${_}`, {
              level: "warn"
            });
            return [{
              type: "text",
              text: "No remote environments found, and we could not create one automatically. Visit https://claude.ai/code to set one up, then run /schedule again."
            }];
          }
        }
        let o = [];
        let s = false;
        let i = await detectCurrentRepositoryWithHost();
        if (i === null) {
          o.push("Not in a git repo \u2014 you'll need to specify a repo URL manually (or skip repos entirely).");
        } else if (ef(i.host)) {
          let {
            hasAccess: _
          } = await R8a(i.owner, i.name);
          if (!_) {
            s = true;
            let S = getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_lantern", false) && isPolicyAllowed("allow_quick_web_setup") ? `GitHub not connected for ${i.owner}/${i.name} \u2014 run /web-setup to sync your GitHub credentials, or install the Claude GitHub App at https://claude.ai/code/onboarding?magic=github-app-setup.` : `Claude GitHub App not installed on ${i.owner}/${i.name} \u2014 install at https://claude.ai/code/onboarding?magic=github-app-setup if your routine needs this repo.`;
            o.push(S);
          }
        }
        let a = ANf(t.options.mcpClients);
        if (a.length === 0) {
          o.push("No MCP connectors \u2014 connect at https://claude.ai/customize/connectors if needed.");
        }
        let l = Intl.DateTimeFormat().resolvedOptions().timeZone;
        let c = new Date();
        let u = c.toISOString();
        let d = c.toLocaleString("en-US", {
          timeZone: l,
          weekday: "short",
          year: "numeric",
          month: "short",
          day: "numeric",
          hour: "2-digit",
          minute: "2-digit"
        });
        let p = getFeatureValue_CACHED_MAY_BE_STALE("tengu_mocha_barista", false);
        let m = PNf(a);
        let f = await ONf();
        let h = ["Available environments:"];
        for (let _ of n) {
          h.push(`- ${_.name} (id: ${_.environment_id}, kind: ${_.kind})`);
        }
        let g = h.join(`
`);
        return [{
          type: "text",
          text: DNf({
            userTimezone: l,
            nowUtcIso: u,
            nowLocal: d,
            oneOffEnabled: p,
            connectorsInfo: m,
            gitRepoUrl: f,
            environmentsInfo: g,
            createdEnvironment: r,
            setupNotes: o,
            needsGitHubAccessReminder: s,
            userArgs: e
          })
        }];
      }
    });
  }
  var GNc = __lazy(() => {
    $n();
    Kc();
    cU();
    no();
    UNe();
    je();
    bI();
    gn();
    na();
    fk();
    Ds();
    Ppe();
    x_();
  });
  var zNc = `# Message Batches \u2014 C#

## Message Batches API

\`\`\`csharp
var batch = await client.Messages.Batches.Create(new() {
    Requests = [
        new() { CustomID = "req-1", Params = new() { Model = "{{OPUS_ID}}", MaxTokens = 1024, Messages = [...] } },
    ],
});
// Poll client.Messages.Batches.Retrieve(batch.ID) until ProcessingStatus == "ended",
// then iterate client.Messages.Batches.Results(batch.ID).
\`\`\`

`;
  var VNc = () => {};
  var YNc = `# Files API \u2014 C#

## Files API (Beta)

Files live under \`client.Beta.Files\` (namespace \`Anthropic.Models.Beta.Files\`). \`BinaryContent\` implicit-converts from \`Stream\` and \`byte[]\`.

\`\`\`csharp
using Anthropic.Models.Beta.Files;
using Anthropic.Models.Beta.Messages;

FileMetadata meta = await client.Beta.Files.Upload(
    new FileUploadParams { File = File.OpenRead("doc.pdf") });

// Referencing the uploaded file requires Beta message types:
new BetaRequestDocumentBlock {
    Source = new BetaFileDocumentSource { FileID = meta.ID },
}
\`\`\`

The non-beta \`DocumentBlockParamSource\` union has no file-ID variant \u2014 file references need \`client.Beta.Messages.Create()\`.

---

`;
  var KNc = () => {};
  var JNc = () => {};
  var QNc = () => {};
  var t1c = `# Tool Use \u2014 C#

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Use

### Defining a tool

\`Tool\` (NOT \`ToolParam\`) with an \`InputSchema\` record. \`InputSchema.Type\` is auto-set to \`"object"\` by the constructor \u2014 don't set it. \`ToolUnion\` has an implicit conversion from \`Tool\`, triggered by the collection expression \`[...]\`.

\`\`\`csharp
using System.Text.Json;
using Anthropic.Models.Messages;

var parameters = new MessageCreateParams
{
    Model = Model.ClaudeSonnet4_6,
    MaxTokens = 16000,
    Tools = [
        new Tool {
            Name = "get_weather",
            Description = "Get the current weather in a given location",
            InputSchema = new() {
                Properties = new Dictionary<string, JsonElement> {
                    ["location"] = JsonSerializer.SerializeToElement(
                        new { type = "string", description = "City name" }),
                },
                Required = ["location"],
            },
        },
    ],
    Messages = [new() { Role = Role.User, Content = "Weather in Paris?" }],
};
\`\`\`

Derived from \`anthropic-sdk-csharp/src/Anthropic/Models/Messages/Tool.cs\` and \`ToolUnion.cs:799\` (implicit conversion).

See [shared tool use concepts](../../shared/tool-use-concepts.md) for the loop pattern.
### Converting response content to the follow-up assistant message

When echoing Claude's response back in the assistant turn, **there is no \`.ToParam()\` helper** \u2014 manually reconstruct each \`ContentBlock\` variant as its \`*Param\` counterpart. Do NOT use \`new ContentBlockParam(block.Json)\`: it compiles and serializes, but \`.Value\` stays \`null\` so \`TryPick*\`/\`Validate()\` fail (degraded JSON pass-through, not the typed path).

\`\`\`csharp
using Anthropic.Models.Messages;

Message response = await client.Messages.Create(parameters);

// No .ToParam() \u2014 reconstruct per variant. Implicit conversions from each
// *Param type to ContentBlockParam mean no explicit wrapper.
List<ContentBlockParam> assistantContent = [];
List<ContentBlockParam> toolResults = [];
foreach (ContentBlock block in response.Content)
{
    if (block.TryPickText(out TextBlock? text))
    {
        assistantContent.Add(new TextBlockParam { Text = text.Text });
    }
    else if (block.TryPickThinking(out ThinkingBlock? thinking))
    {
        // Signature MUST be preserved \u2014 the API rejects tampering
        assistantContent.Add(new ThinkingBlockParam
        {
            Thinking = thinking.Thinking,
            Signature = thinking.Signature,
        });
    }
    else if (block.TryPickRedactedThinking(out RedactedThinkingBlock? redacted))
    {
        assistantContent.Add(new RedactedThinkingBlockParam { Data = redacted.Data });
    }
    else if (block.TryPickToolUse(out ToolUseBlock? toolUse))
    {
        // ToolUseBlock has required Caller; ToolUseBlockParam.Caller is optional \u2014 don't copy it
        assistantContent.Add(new ToolUseBlockParam
        {
            ID = toolUse.ID,
            Name = toolUse.Name,
            Input = toolUse.Input,
        });
        // Execute the tool; collect ONE result per tool_use block \u2014 the API
        // rejects the follow-up if any tool_use ID lacks a matching tool_result.
        string result = ExecuteYourTool(toolUse.Name, toolUse.Input);
        toolResults.Add(new ToolResultBlockParam
        {
            ToolUseID = toolUse.ID,
            Content = result,
        });
    }
}

// Follow-up: prior messages + assistant echo + user tool_result(s)
List<MessageParam> followUpMessages =
[
    .. parameters.Messages,
    new() { Role = Role.Assistant, Content = assistantContent },
    new() { Role = Role.User, Content = toolResults },
];
\`\`\`

\`ToolResultBlockParam\` has no tuple constructor \u2014 use the object initializer. \`Content\` is a string-or-list union; a plain \`string\` implicitly converts.

---

## Structured Output

\`\`\`csharp
OutputConfig = new OutputConfig {
    Format = new JsonOutputFormat {
        Schema = new Dictionary<string, JsonElement> {
            ["type"] = JsonSerializer.SerializeToElement("object"),
            ["properties"] = JsonSerializer.SerializeToElement(
                new { name = new { type = "string" } }),
            ["required"] = JsonSerializer.SerializeToElement(new[] { "name" }),
        },
    },
},
\`\`\`

\`JsonOutputFormat.Type\` is auto-set to \`"json_schema"\` by the constructor. \`Schema\` is \`required\`.

---

## Anthropic-Defined Tools

Web search, bash, text editor, and code execution are Anthropic-defined tools with built-in schemas. Web search and code execution are server-executed; bash and text editor are client-executed (you handle the \`tool_use\` locally \u2014 see \`shared/tool-use-concepts.md\`). Type names are version-suffixed; constructors auto-set \`name\`/\`type\`. **Wrap each in \`new ToolUnion(...)\` explicitly.**

\`\`\`csharp
Tools = [
    new ToolUnion(new WebSearchTool20260209()),
    new ToolUnion(new ToolBash20250124()),
    new ToolUnion(new ToolTextEditor20250728()),
    new ToolUnion(new CodeExecutionTool20260120()),
],
\`\`\`

Also available: \`new ToolUnion(new WebFetchTool20260209())\`, \`new ToolUnion(new MemoryTool20250818())\`. \`WebSearchTool20260209\` optionals: \`AllowedDomains\`, \`BlockedDomains\`, \`MaxUses\`, \`UserLocation\`.

---

## Tool Runner (Beta)

The C# SDK provides a \`BetaToolRunner\` for automatic tool execution loops. Define tools with raw JSON schemas, and the runner handles the API call \u2192 tool execution \u2192 result feedback loop.

\`\`\`csharp
using Anthropic.Models.Beta.Messages;

// Define tools and create params as shown in the Tool Use section above,
// but using the beta namespace types (BetaToolUnion, etc.)
var runner = client.Beta.Messages.ToolRunner(betaParams);

await foreach (BetaMessage message in runner)
{
    foreach (var block in message.Content)
    {
        if (block.TryPickText(out var text))
        {
            Console.WriteLine(text.Text);
        }
    }
}
\`\`\`

---

`;
  var e1c = () => {};
  var r1c = `# Claude API \u2014 cURL / Raw HTTP

Use these examples when the user needs raw HTTP requests or is working in a language without an official SDK.

## Setup

\`\`\`bash
export ANTHROPIC_API_KEY="your-api-key"
\`\`\`

---

## Basic Message Request

\`\`\`bash
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 16000,
    "messages": [
      {"role": "user", "content": "What is the capital of France?"}
    ]
  }'
\`\`\`

### Parsing the response

Use \`jq\` to extract fields from the JSON response. Do not use \`grep\`/\`sed\` \u2014
JSON strings can contain any character and regex parsing will break on quotes,
escapes, or multi-line content.

\`\`\`bash
# Capture the response, then extract fields
response=$(curl -s https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{"model":"{{OPUS_ID}}","max_tokens":16000,"messages":[{"role":"user","content":"Hello"}]}')

# Print the first text block (-r strips the JSON quotes)
echo "$response" | jq -r '.content[0].text'

# Read usage fields
input_tokens=$(echo "$response" | jq -r '.usage.input_tokens')
output_tokens=$(echo "$response" | jq -r '.usage.output_tokens')

# Read stop reason (for tool-use loops)
stop_reason=$(echo "$response" | jq -r '.stop_reason')

# Extract all text blocks (content is an array; filter to type=="text")
echo "$response" | jq -r '.content[] | select(.type == "text") | .text'
\`\`\`

---

## Streaming (SSE)

\`\`\`bash
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 64000,
    "stream": true,
    "messages": [{"role": "user", "content": "Write a haiku"}]
  }'
\`\`\`

The response is a stream of Server-Sent Events:

\`\`\`
event: message_start
data: {"type":"message_start","message":{"id":"msg_...","type":"message",...}}

event: content_block_start
data: {"type":"content_block_start","index":0,"content_block":{"type":"text","text":""}}

event: content_block_delta
data: {"type":"content_block_delta","index":0,"delta":{"type":"text_delta","text":"Hello"}}

event: content_block_stop
data: {"type":"content_block_stop","index":0}

event: message_delta
data: {"type":"message_delta","delta":{"stop_reason":"end_turn"},"usage":{"output_tokens":12}}

event: message_stop
data: {"type":"message_stop"}
\`\`\`

---

## Tool Use

\`\`\`bash
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 16000,
    "tools": [{
      "name": "get_weather",
      "description": "Get current weather for a location",
      "input_schema": {
        "type": "object",
        "properties": {
          "location": {"type": "string", "description": "City name"}
        },
        "required": ["location"]
      }
    }],
    "messages": [{"role": "user", "content": "What is the weather in Paris?"}]
  }'
\`\`\`

When Claude responds with a \`tool_use\` block, send the result back:

\`\`\`bash
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 16000,
    "tools": [{
      "name": "get_weather",
      "description": "Get current weather for a location",
      "input_schema": {
        "type": "object",
        "properties": {
          "location": {"type": "string", "description": "City name"}
        },
        "required": ["location"]
      }
    }],
    "messages": [
      {"role": "user", "content": "What is the weather in Paris?"},
      {"role": "assistant", "content": [
        {"type": "text", "text": "Let me check the weather."},
        {"type": "tool_use", "id": "toolu_abc123", "name": "get_weather", "input": {"location": "Paris"}}
      ]},
      {"role": "user", "content": [
        {"type": "tool_result", "tool_use_id": "toolu_abc123", "content": "72\xB0F and sunny"}
      ]}
    ]
  }'
\`\`\`

---

## Prompt Caching

Put \`cache_control\` on the last block of the stable prefix. See \`shared/prompt-caching.md\` for placement patterns and the silent-invalidator audit checklist.

\`\`\`bash
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 16000,
    "system": [
      {"type": "text", "text": "<large shared prompt...>", "cache_control": {"type": "ephemeral"}}
    ],
    "messages": [{"role": "user", "content": "Summarize the key points"}]
  }'
\`\`\`

For 1-hour TTL: \`"cache_control": {"type": "ephemeral", "ttl": "1h"}\`. Top-level \`"cache_control"\` on the request body auto-places on the last cacheable block. Verify hits via the response \`usage.cache_creation_input_tokens\` / \`usage.cache_read_input_tokens\` fields.

---

## Extended Thinking

> **Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6:** Use adaptive thinking. \`budget_tokens\` is removed on Fable 5, Opus 4.8, and 4.7 (400 if sent); deprecated on Opus 4.6 and Sonnet 4.6.
> **Older models:** Use \`"type": "enabled"\` with \`"budget_tokens": N\` (must be < \`max_tokens\`, min 1024).

\`\`\`bash
# Fable 5 / Opus 4.8 / 4.7 / 4.6: adaptive thinking (recommended)
curl https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -d '{
    "model": "{{OPUS_ID}}",
    "max_tokens": 16000,
    "thinking": {
      "type": "adaptive",
      "display": "summarized"
    },
    "output_config": {
      "effort": "high"
    },
    "messages": [{"role": "user", "content": "Solve this step by step..."}]
  }'
\`\`\`

---

## Refusal Fallbacks ({{FABLE_NAME}}) \u2014 opt in by default

On \`{{FABLE_ID}}\`, safety classifiers may decline a request (HTTP 200 with \`stop_reason: "refusal"\`). Fallbacks are **opt-in**: without them the request simply stops. Include the \`fallbacks\` parameter and its beta header by default \u2014 on a policy decline the API re-runs the same request on the fallback model inside the same call. A decline before any output isn't billed (a mid-stream decline bills the streamed partial); the rescue bills at the fallback model's own rates.

\`\`\`bash
response=$(curl -s https://api.anthropic.com/v1/messages \\
  -H "Content-Type: application/json" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -H "anthropic-beta: server-side-fallback-2026-06-01" \\
  -d '{
    "model": "{{FABLE_ID}}",
    "max_tokens": 16000,
    "fallbacks": [{"model": "{{OPUS_ID}}"}],
    "messages": [{"role": "user", "content": "Hello"}]
  }')

# Which model produced the message
echo "$response" | jq -r '.model'

# Refusal on the final response means the whole chain refused
echo "$response" | jq -r '.stop_reason'

# Switch points: one fallback block per model that ran and declined this turn
echo "$response" | jq -r '.content[] | select(.type == "fallback") | "\\(.from.model) declined; \\(.to.model) continued"'

# Served-by signal \u2014 covers sticky turns, which carry no fallback block.
# Pair with stop_reason: the fallback model can itself refuse.
if [ "$(echo "$response" | jq -r '.stop_reason')" != "refusal" ] && \\
   echo "$response" | jq -e '[.usage.iterations[]? | select(.type == "fallback_message")] | length > 0' > /dev/null; then
  echo "fallback model served this turn"
fi
\`\`\`

The header must be exactly \`server-side-fallback-2026-06-01\`. The parameter is rejected on the Batches API and unavailable on Amazon Bedrock, Vertex AI, and Microsoft Foundry. Full semantics (sticky routing, billing, streaming, echoing fallback turns back): \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}} \u2192 \`refusal\` stop reason.

---

## Required Headers

| Header              | Value              | Description                |
| ------------------- | ------------------ | -------------------------- |
| \`Content-Type\`      | \`application/json\` | Required                   |
| \`x-api-key\`         | Your API key       | Authentication             |
| \`anthropic-version\` | \`2023-06-01\`       | API version                |
| \`anthropic-beta\`    | Beta feature IDs   | Required for beta features |
`;
  var n1c = () => {};
  var s1c = `# Managed Agents \u2014 cURL / Raw HTTP

Use these examples when the user needs raw HTTP requests or is working without an SDK.

## Setup

\`\`\`bash
export ANTHROPIC_API_KEY="your-api-key"

# Common headers
HEADERS=(
  -H "Content-Type: application/json"
  -H "x-api-key: $ANTHROPIC_API_KEY"
  -H "anthropic-version: 2023-06-01"
  -H "anthropic-beta: managed-agents-2026-04-01"
)
\`\`\`

---

## Create an Environment

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/environments \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "my-dev-env",
    "config": {
      "type": "cloud",
      "networking": { "type": "unrestricted" }
    }
  }'
\`\`\`

### With restricted networking

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/environments \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "restricted-env",
    "config": {
      "type": "cloud",
      "networking": {
        "type": "limited",
        "allow_package_managers": true,
        "allow_mcp_servers": true,
        "allowed_hosts": ["api.example.com"]
      }
    }
  }'
\`\`\`

---

## Create an Agent (required first step)

> \u26A0\uFE0F **There is no inline agent config.** Under \`managed-agents-2026-04-01\`, \`model\`/\`system\`/\`tools\` are top-level fields on \`POST /v1/agents\`, not on the session. Always create the agent first \u2014 the session only takes \`"agent": {"type": "agent", "id": "..."}\`.

### Minimal

\`\`\`bash
# 1. Create the agent
curl -X POST https://api.anthropic.com/v1/agents \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "Coding Assistant",
    "model": "{{OPUS_ID}}",
    "tools": [{ "type": "agent_toolset_20260401" }]
  }'
# \u2192 { "id": "agent_abc123", ... }

# 2. Start a session
curl -X POST https://api.anthropic.com/v1/sessions \\
  "\${HEADERS[@]}" \\
  -d '{
    "agent": { "type": "agent", "id": "agent_abc123", "version": "1772585501101368014" },
    "environment_id": "env_abc123"
  }'
# \u2192 { "id": "sesn_abc123", ... }
# Trace: https://platform.claude.com/workspaces/default/sessions/sesn_abc123
\`\`\`

### With system prompt, custom tools, and GitHub repo

\`\`\`bash
# 1. Create the agent
curl -X POST https://api.anthropic.com/v1/agents \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "Code Reviewer",
    "model": "{{OPUS_ID}}",
    "system": "You are a senior code reviewer. Be thorough and constructive.",
    "tools": [
      { "type": "agent_toolset_20260401" },
      {
        "type": "custom",
        "name": "run_linter",
        "description": "Run the project linter on a file",
        "input_schema": {
          "type": "object",
          "properties": {
            "file_path": { "type": "string", "description": "Path to lint" }
          },
          "required": ["file_path"]
        }
      }
    ]
  }'

# 2. Start a session with the repo mounted
curl -X POST https://api.anthropic.com/v1/sessions \\
  "\${HEADERS[@]}" \\
  -d '{
    "agent": { "type": "agent", "id": "agent_abc123", "version": "1772585501101368014" },
    "environment_id": "env_abc123",
    "title": "Code review session",
    "resources": [
      {
        "type": "github_repository",
        "url": "https://github.com/owner/repo",
        "mount_path": "/workspace/repo",
        "authorization_token": "ghp_...",
        "branch": "feature-branch"
      }
    ]
  }'
\`\`\`

---

## Send a User Message

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/sessions/$SESSION_ID/events \\
  "\${HEADERS[@]}" \\
  -d '{
    "events": [
      {
        "type": "user.message",
        "content": [{ "type": "text", "text": "Review the auth module for security issues" }]
      }
    ]
  }'
\`\`\`

---

## Stream Events (SSE)

\`\`\`bash
curl -N https://api.anthropic.com/v1/sessions/$SESSION_ID/events/stream \\
  "\${HEADERS[@]}"
\`\`\`

Response format:

\`\`\`
event: session.status_running
data: {"type":"session.status_running","id":"sevt_...","processed_at":"..."}

event: agent.message
data: {"type":"agent.message","id":"sevt_...","content":[{"type":"text","text":"I'll review..."}],"processed_at":"..."}

event: session.status_idle
data: {"type":"session.status_idle","id":"sevt_...","processed_at":"..."}
\`\`\`

---

## Poll Events

\`\`\`bash
# Get all events
curl https://api.anthropic.com/v1/sessions/$SESSION_ID/events \\
  "\${HEADERS[@]}"

# Paginated \u2014 get next page of events
curl "https://api.anthropic.com/v1/sessions/$SESSION_ID/events?page=page_abc123" \\
  "\${HEADERS[@]}"
\`\`\`

---

## Provide Custom Tool Result

When the agent calls a custom tool, send the result back:

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/sessions/$SESSION_ID/events \\
  "\${HEADERS[@]}" \\
  -d '{
    "events": [
      {
        "type": "user.custom_tool_result",
        "custom_tool_use_id": "sevt_abc123",
        "content": [{ "type": "text", "text": "No linting errors found." }]
      }
    ]
  }'
\`\`\`

---

## Interrupt a Running Session

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/sessions/$SESSION_ID/events \\
  "\${HEADERS[@]}" \\
  -d '{
    "events": [
      {
        "type": "interrupt"
      }
    ]
  }'
\`\`\`

---

## Get Session Details

\`\`\`bash
curl https://api.anthropic.com/v1/sessions/$SESSION_ID \\
  "\${HEADERS[@]}"
\`\`\`

---

## List Sessions

\`\`\`bash
curl https://api.anthropic.com/v1/sessions \\
  "\${HEADERS[@]}"
\`\`\`

---

## Delete a Session

\`\`\`bash
curl -X DELETE https://api.anthropic.com/v1/sessions/$SESSION_ID \\
  "\${HEADERS[@]}"
\`\`\`

---

## Upload a File

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/files \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -H "anthropic-beta: files-api-2025-04-14" \\
  -F "file=@path/to/file.txt" \\
  -F "purpose=agent"
\`\`\`

---

## List and Download Session Files

List files the agent wrote to \`/mnt/session/outputs/\` during a session, then download them.

\`\`\`bash
# List files associated with a session
curl "https://api.anthropic.com/v1/files?scope_id=$SESSION_ID" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -H "anthropic-beta: files-api-2025-04-14,managed-agents-2026-04-01"

# Download a specific file
curl "https://api.anthropic.com/v1/files/$FILE_ID/content" \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01" \\
  -H "anthropic-beta: files-api-2025-04-14,managed-agents-2026-04-01" \\
  -o downloaded_file.txt
\`\`\`

---

## List Agents

\`\`\`bash
curl https://api.anthropic.com/v1/agents \\
  "\${HEADERS[@]}"
\`\`\`

---

## MCP Server Integration

\`\`\`bash
# 1. Agent declares MCP server (no auth here \u2014 auth goes in a vault)
curl -X POST https://api.anthropic.com/v1/agents \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "MCP Agent",
    "model": "{{OPUS_ID}}",
    "mcp_servers": [
      { "type": "url", "name": "my-tools", "url": "https://my-mcp-server.example.com/sse" }
    ],
    "tools": [
      { "type": "agent_toolset_20260401" },
      { "type": "mcp_toolset", "mcp_server_name": "my-tools" }
    ]
  }'

# 2. Session attaches vault containing credentials for that MCP server URL
curl -X POST https://api.anthropic.com/v1/sessions \\
  "\${HEADERS[@]}" \\
  -d '{
    "agent": "agent_abc123",
    "environment_id": "env_abc123",
    "vault_ids": ["vlt_abc123"]
  }'
\`\`\`

See \`shared/managed-agents-tools.md\` \xA7Vaults for creating vaults and adding credentials.

---

## Tool Configuration

\`\`\`bash
curl -X POST https://api.anthropic.com/v1/agents \\
  "\${HEADERS[@]}" \\
  -d '{
    "name": "Restricted Agent",
    "model": "{{OPUS_ID}}",
    "tools": [
      {
        "type": "agent_toolset_20260401",
        "default_config": { "enabled": true },
        "configs": [
          { "name": "bash", "enabled": false }
        ]
      }
    ]
  }'
\`\`\`
`;
  var o1c = () => {};
  var i1c = () => {};
  var c1c = `# Claude API \u2014 Go

> **Note:** The Go SDK supports the Claude API and beta tool use with \`BetaToolRunner\`. Agent SDK is not yet available for Go.

## Installation

\`\`\`bash
go get github.com/anthropics/anthropic-sdk-go
\`\`\`

## Client Initialization

\`\`\`go
import (
    "github.com/anthropics/anthropic-sdk-go"
    "github.com/anthropics/anthropic-sdk-go/option"
)

// Default (uses ANTHROPIC_API_KEY env var)
client := anthropic.NewClient()

// Explicit API key
client := anthropic.NewClient(
    option.WithAPIKey("your-api-key"),
)
\`\`\`

---

## Model Constants

The Go SDK provides typed model constants: \`anthropic.ModelClaudeFable5\`, \`anthropic.ModelClaudeOpus4_8\`, \`anthropic.ModelClaudeOpus4_7\`, \`anthropic.ModelClaudeSonnet4_6\`, \`anthropic.ModelClaudeHaiku4_5_20251001\`. Use \`ModelClaudeOpus4_8\` unless the user specifies otherwise; if they ask for Fable or the most powerful model, use \`anthropic.ModelClaudeFable5\` (see \`shared/models.md\` for the full resolution table).

---

## Basic Message Request

\`\`\`go
response, err := client.Messages.New(context.Background(), anthropic.MessageNewParams{
    Model:     anthropic.ModelClaudeOpus4_8,
    MaxTokens: 16000,
    Messages: []anthropic.MessageParam{
        anthropic.NewUserMessage(anthropic.NewTextBlock("What is the capital of France?")),
    },
})
if err != nil {
    log.Fatal(err)
}
for _, block := range response.Content {
    switch variant := block.AsAny().(type) {
    case anthropic.TextBlock:
        fmt.Println(variant.Text)
    }
}
\`\`\`

---

## Thinking

Enable Claude's internal reasoning by setting \`Thinking\` in \`MessageNewParams\`. The response will contain \`ThinkingBlock\` content before the final \`TextBlock\`.

**Adaptive thinking is the recommended mode for Claude 4.6+ models.** Claude decides dynamically when and how much to think. Combine with the \`effort\` parameter for cost-quality control.

Derived from \`anthropic-sdk-go/message.go\` (\`ThinkingConfigParamUnion\`, \`ThinkingConfigAdaptiveParam\`).

\`\`\`go
// There is no ThinkingConfigParamOfAdaptive helper \u2014 construct the union
// struct-literal directly and take the address of the variant.
adaptive := anthropic.ThinkingConfigAdaptiveParam{}
params := anthropic.MessageNewParams{
    Model:     anthropic.ModelClaudeSonnet4_6,
    MaxTokens: 16000,
    Thinking:  anthropic.ThinkingConfigParamUnion{OfAdaptive: &adaptive},
    Messages: []anthropic.MessageParam{
        anthropic.NewUserMessage(anthropic.NewTextBlock("How many r's in strawberry?")),
    },
}

resp, err := client.Messages.New(context.Background(), params)
if err != nil {
    log.Fatal(err)
}

// ThinkingBlock(s) precede TextBlock in content
for _, block := range resp.Content {
    switch b := block.AsAny().(type) {
    case anthropic.ThinkingBlock:
        fmt.Println("[thinking]", b.Thinking)
    case anthropic.TextBlock:
        fmt.Println(b.Text)
    }
}
\`\`\`

> **Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6:** Use adaptive thinking (above). \`ThinkingConfigParamOfEnabled(budgetTokens)\` is removed on Fable 5, Opus 4.8, and 4.7 (400 if sent); deprecated on Opus 4.6 and Sonnet 4.6.
> **Older models:** Use \`anthropic.ThinkingConfigParamOfEnabled(N)\` (budget must be < \`MaxTokens\`, min 1024).

To disable: \`anthropic.ThinkingConfigParamUnion{OfDisabled: &anthropic.ThinkingConfigDisabledParam{}}\`.

---

## Prompt Caching

\`System\` is \`[]TextBlockParam\`; set \`CacheControl\` on the last block to cache tools + system together. For placement patterns and the silent-invalidator audit checklist, see \`shared/prompt-caching.md\`.

\`\`\`go
System: []anthropic.TextBlockParam{{
    Text:         longSystemPrompt,
    CacheControl: anthropic.NewCacheControlEphemeralParam(), // default 5m TTL
}},
\`\`\`

For 1-hour TTL: \`anthropic.CacheControlEphemeralParam{TTL: anthropic.CacheControlEphemeralTTLTTL1h}\`. There's also a top-level \`CacheControl\` on \`MessageNewParams\` that auto-places on the last cacheable block.

Verify hits via \`resp.Usage.CacheCreationInputTokens\` / \`resp.Usage.CacheReadInputTokens\`.

---

## Stop Details

When \`StopReason\` is \`anthropic.StopReasonRefusal\`, the response includes structured \`StopDetails\`:

\`\`\`go
if resp.StopReason == anthropic.StopReasonRefusal {
    fmt.Println("Category:", resp.StopDetails.Category)     // e.g. "cyber", "bio", "reasoning_extraction", "frontier_llm", or "" \u2014 see docs for the full set
    fmt.Println("Explanation:", resp.StopDetails.Explanation)
}
\`\`\`

**Refusal fallbacks ({{FABLE_NAME}}) \u2014 opt in by default.** Fallbacks are opt-in: without them a refused request simply stops. In \`{{FABLE_ID}}\` code, include \`Fallbacks: []anthropic.BetaFallbackParam{{Model: "{{OPUS_ID}}"}}\` plus the \`anthropic.AnthropicBetaServerSideFallback2026_06_01\` beta on \`client.Beta.Messages.New\` by default \u2014 a policy decline is re-served by the fallback model inside the same call. Not available on Amazon Bedrock, Vertex AI, or Microsoft Foundry \u2014 register the client-side middleware there: \`option.WithMiddleware(betafallback.BetaRefusalFallbackMiddleware(...))\` from \`lib/betafallback\`, with per-conversation state via \`betafallback.WithBetaFallbackState(&betafallback.BetaFallbackState{})\`. Full semantics (billing, sticky routing, streaming) and a runnable example: \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}} \u2192 \`refusal\` stop reason, and the Go SDK repo's \`examples/\` (WebFetch via \`shared/live-sources.md\`).

---

## PDF / Document Input

\`NewDocumentBlock\` generic helper accepts any source type. \`MediaType\`/\`Type\` are auto-set.

\`\`\`go
b64 := base64.StdEncoding.EncodeToString(pdfBytes)

msg := anthropic.NewUserMessage(
    anthropic.NewDocumentBlock(anthropic.Base64PDFSourceParam{Data: b64}),
    anthropic.NewTextBlock("Summarize this document"),
)
\`\`\`

Other sources: \`URLPDFSourceParam{URL: "https://..."}\`, \`PlainTextSourceParam{Data: "..."}\`.

---

## Context Editing / Compaction (Beta)

Use \`Beta.Messages.New\` with \`ContextManagement\` on \`BetaMessageNewParams\`. There is no \`NewBetaAssistantMessage\` \u2014 use \`.ToParam()\` for the round-trip.

\`\`\`go
params := anthropic.BetaMessageNewParams{
    Model:     anthropic.ModelClaudeOpus4_8,  // also supported: ModelClaudeSonnet4_6
    MaxTokens: 16000,
    Betas:     []anthropic.AnthropicBeta{"compact-2026-01-12"},
    ContextManagement: anthropic.BetaContextManagementConfigParam{
        Edits: []anthropic.BetaContextManagementConfigEditUnionParam{
            {OfCompact20260112: &anthropic.BetaCompact20260112EditParam{}},
        },
    },
    Messages: []anthropic.BetaMessageParam{ /* ... */ },
}

resp, err := client.Beta.Messages.New(ctx, params)
if err != nil {
    log.Fatal(err)
}

// Round-trip: append response to history via .ToParam()
params.Messages = append(params.Messages, resp.ToParam())

// Read compaction blocks from the response
for _, block := range resp.Content {
    if c, ok := block.AsAny().(anthropic.BetaCompactionBlock); ok {
        fmt.Println("compaction summary:", c.Content)
    }
}
\`\`\`

Other edit types: \`BetaClearToolUses20250919EditParam\`, \`BetaClearThinking20251015EditParam\` \u2014 these need \`Betas: []anthropic.AnthropicBeta{"context-management-2025-06-27"}\`, not \`compact-2026-01-12\`.
`;
  var l1c = () => {};
  var d1c = `# Streaming \u2014 Go

## Streaming

\`\`\`go
stream := client.Messages.NewStreaming(context.Background(), anthropic.MessageNewParams{
    Model:     anthropic.ModelClaudeOpus4_8,
    MaxTokens: 64000,
    Messages: []anthropic.MessageParam{
        anthropic.NewUserMessage(anthropic.NewTextBlock("Write a haiku")),
    },
})

for stream.Next() {
    event := stream.Current()
    switch eventVariant := event.AsAny().(type) {
    case anthropic.ContentBlockDeltaEvent:
        switch deltaVariant := eventVariant.Delta.AsAny().(type) {
        case anthropic.TextDelta:
            fmt.Print(deltaVariant.Text)
        }
    }
}
if err := stream.Err(); err != nil {
    log.Fatal(err)
}
\`\`\`

**Accumulating the final message** (there is no \`GetFinalMessage()\` on the stream):

\`\`\`go
stream := client.Messages.NewStreaming(ctx, params)
message := anthropic.Message{}
for stream.Next() {
    message.Accumulate(stream.Current())
}
if err := stream.Err(); err != nil { log.Fatal(err) }
// message.Content now has the complete response
\`\`\`

---

`;
  var u1c = () => {};
  var m1c = `# Tool Use \u2014 Go

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Use

### Tool Runner (Beta \u2014 Recommended)

**Beta:** The Go SDK provides \`BetaToolRunner\` for automatic tool use loops via the \`toolrunner\` package.

\`\`\`go
import (
    "context"
    "fmt"
    "log"

    "github.com/anthropics/anthropic-sdk-go"
    "github.com/anthropics/anthropic-sdk-go/toolrunner"
)

// Define tool input with jsonschema tags for automatic schema generation
type GetWeatherInput struct {
    City string \`json:"city" jsonschema:"required,description=The city name"\`
}

// Create a tool with automatic schema generation from struct tags
weatherTool, err := toolrunner.NewBetaToolFromJSONSchema(
    "get_weather",
    "Get current weather for a city",
    func(ctx context.Context, input GetWeatherInput) (anthropic.BetaToolResultBlockParamContentUnion, error) {
        return anthropic.BetaToolResultBlockParamContentUnion{
            OfText: &anthropic.BetaTextBlockParam{
                Text: fmt.Sprintf("The weather in %s is sunny, 72\xB0F", input.City),
            },
        }, nil
    },
)
if err != nil {
    log.Fatal(err)
}

// Create a tool runner that handles the conversation loop automatically
runner := client.Beta.Messages.NewToolRunner(
    []anthropic.BetaTool{weatherTool},
    anthropic.BetaToolRunnerParams{
        BetaMessageNewParams: anthropic.BetaMessageNewParams{
            Model:     anthropic.ModelClaudeOpus4_8,
            MaxTokens: 16000,
            Messages: []anthropic.BetaMessageParam{
                anthropic.NewBetaUserMessage(anthropic.NewBetaTextBlock("What's the weather in Paris?")),
            },
        },
        MaxIterations: 5,
    },
)

// Run until Claude produces a final response
message, err := runner.RunToCompletion(context.Background())
if err != nil {
    log.Fatal(err)
}

// RunToCompletion returns *BetaMessage; content is []BetaContentBlockUnion.
// Narrow via AsAny() switch \u2014 note the Beta-namespace types (BetaTextBlock,
// not TextBlock):
for _, block := range message.Content {
    switch block := block.AsAny().(type) {
    case anthropic.BetaTextBlock:
        fmt.Println(block.Text)
    }
}
\`\`\`

**Key features of the Go tool runner:**

- Automatic schema generation from Go structs via \`jsonschema\` tags
- \`RunToCompletion()\` for simple one-shot usage
- \`All()\` iterator for processing each message in the conversation
- \`NextMessage()\` for step-by-step iteration
- Streaming variant via \`NewToolRunnerStreaming()\` with \`AllStreaming()\`

### Manual Loop

For fine-grained control over the agentic loop, define tools with \`ToolParam\`, check \`StopReason\`, execute tools yourself, and feed \`tool_result\` blocks back. This is the pattern when you need to intercept, validate, or log tool calls.

Derived from \`anthropic-sdk-go/examples/tools/main.go\`.

\`\`\`go
package main

import (
    "context"
    "encoding/json"
    "fmt"
    "log"

    "github.com/anthropics/anthropic-sdk-go"
)

func main() {
    client := anthropic.NewClient()

    // 1. Define tools. ToolParam.InputSchema uses a map, no struct tags needed.
    addTool := anthropic.ToolParam{
        Name:        "add",
        Description: anthropic.String("Add two integers"),
        InputSchema: anthropic.ToolInputSchemaParam{
            Properties: map[string]any{
                "a": map[string]any{"type": "integer"},
                "b": map[string]any{"type": "integer"},
            },
        },
    }
    // ToolParam must be wrapped in ToolUnionParam for the Tools slice
    tools := []anthropic.ToolUnionParam{{OfTool: &addTool}}

    messages := []anthropic.MessageParam{
        anthropic.NewUserMessage(anthropic.NewTextBlock("What is 2 + 3?")),
    }

    for {
        resp, err := client.Messages.New(context.Background(), anthropic.MessageNewParams{
            Model:     anthropic.ModelClaudeSonnet4_6,
            MaxTokens: 16000,
            Messages:  messages,
            Tools:     tools,
        })
        if err != nil {
            log.Fatal(err)
        }

        // 2. Append the assistant response to history BEFORE processing tool calls.
        //    resp.ToParam() converts Message \u2192 MessageParam in one call.
        messages = append(messages, resp.ToParam())

        // 3. Walk content blocks. ContentBlockUnion is a flattened struct;
        //    use block.AsAny().(type) to switch on the actual variant.
        toolResults := []anthropic.ContentBlockParamUnion{}
        for _, block := range resp.Content {
            switch variant := block.AsAny().(type) {
            case anthropic.TextBlock:
                fmt.Println(variant.Text)
            case anthropic.ToolUseBlock:
                // 4. Parse the tool input. Use variant.JSON.Input.Raw() to get the
                //    raw JSON \u2014 block.Input is json.RawMessage, not the parsed value.
                var in struct {
                    A int \`json:"a"\`
                    B int \`json:"b"\`
                }
                if err := json.Unmarshal([]byte(variant.JSON.Input.Raw()), &in); err != nil {
                    log.Fatal(err)
                }
                result := fmt.Sprintf("%d", in.A+in.B)
                // 5. NewToolResultBlock(toolUseID, content, isError) builds the
                //    ContentBlockParamUnion for you. block.ID is the tool_use_id.
                toolResults = append(toolResults,
                    anthropic.NewToolResultBlock(block.ID, result, false))
            }
        }

        // 6. Exit when Claude stops asking for tools
        if resp.StopReason != anthropic.StopReasonToolUse {
            break
        }

        // 7. Tool results go in a user message (variadic: all results in one turn)
        messages = append(messages, anthropic.NewUserMessage(toolResults...))
    }
}
\`\`\`

**Key API surface:**

| Symbol | Purpose |
|---|---|
| \`resp.ToParam()\` | Convert \`Message\` response \u2192 \`MessageParam\` for history |
| \`block.AsAny().(type)\` | Type-switch on \`ContentBlockUnion\` variants |
| \`variant.JSON.Input.Raw()\` | Raw JSON string of tool input (for \`json.Unmarshal\`) |
| \`anthropic.NewToolResultBlock(id, content, isError)\` | Build \`tool_result\` block |
| \`anthropic.NewUserMessage(blocks...)\` | Wrap tool results as a user turn |
| \`anthropic.StopReasonToolUse\` | \`StopReason\` constant to check loop termination |
| \`anthropic.ToolUnionParam{OfTool: &t}\` | Wrap \`ToolParam\` in the union for \`Tools:\` |

---

## Anthropic-Defined Tools

Version-suffixed struct names with \`Param\` suffix. \`Name\`/\`Type\` are \`constant.*\` types \u2014 zero value marshals correctly, so \`{}\` works. Wrap in \`ToolUnionParam\` with the matching \`Of*\` field. Web search and code execution are server-executed; bash and text editor are client-executed (you handle the \`tool_use\` locally \u2014 see \`shared/tool-use-concepts.md\`).

\`\`\`go
Tools: []anthropic.ToolUnionParam{
    {OfWebSearchTool20260209: &anthropic.WebSearchTool20260209Param{}},
    {OfBashTool20250124: &anthropic.ToolBash20250124Param{}},
    {OfTextEditor20250728: &anthropic.ToolTextEditor20250728Param{}},
    {OfCodeExecutionTool20260120: &anthropic.CodeExecutionTool20260120Param{}},
},
\`\`\`

Also available: \`WebFetchTool20260209Param\`, \`ToolSearchToolBm25_20251119Param\`, \`ToolSearchToolRegex20251119Param\`. For the advisor and memory tools, use \`BetaAdvisorTool20260301Param\` / \`BetaMemoryTool20250818Param\` in the beta namespace on \`client.Beta.Messages.New\`.

### Advisor tool (beta)

Server-side \u2014 no tool_result round-trip. The advisor model must be \u2265 the executor (top-level) model; invalid pairs return 400.

\`\`\`go
response, err := client.Beta.Messages.New(ctx, anthropic.BetaMessageNewParams{
    Model:     anthropic.ModelClaudeSonnet4_6,
    MaxTokens: 4096,
    Tools: []anthropic.BetaToolUnionParam{
        {OfAdvisorTool20260301: &anthropic.BetaAdvisorTool20260301Param{
            Model: anthropic.ModelClaudeOpus4_8,
        }},
    },
    Messages: []anthropic.BetaMessageParam{ /* ... */ },
    Betas:    []anthropic.AnthropicBeta{anthropic.AnthropicBetaAdvisorTool2026_03_01},
})
\`\`\`

---

`;
  var p1c = () => {};
  var h1c = `# Managed Agents \u2014 Go

> **Bindings not shown here:** This README covers the most common managed-agents flows for Go. If you need a class, method, namespace, field, or behavior that isn't shown, WebFetch the Go SDK repo **or the relevant docs page** from \`shared/live-sources.md\` rather than guess. Do not extrapolate from cURL shapes or another language's SDK.

> **Agents are persistent \u2014 create once, reference by ID.** Store the agent ID returned by \`agents.New\` and pass it to every subsequent \`sessions.New\`; do not call \`agents.New\` in the request path. The Anthropic CLI is one convenient way to create agents and environments from version-controlled YAML \u2014 its URL is in \`shared/live-sources.md\`. The examples below show in-code creation for completeness; in production the create call belongs in setup, not in the request path.

## Installation

\`\`\`bash
go get github.com/anthropics/anthropic-sdk-go
\`\`\`

## Client Initialization

\`\`\`go
import (
    "context"

    "github.com/anthropics/anthropic-sdk-go"
    "github.com/anthropics/anthropic-sdk-go/option"
)

// Default (uses ANTHROPIC_API_KEY env var)
client := anthropic.NewClient()

// Explicit API key
client := anthropic.NewClient(
    option.WithAPIKey("your-api-key"),
)

ctx := context.Background()
\`\`\`

---

## Create an Environment

\`\`\`go
environment, err := client.Beta.Environments.New(ctx, anthropic.BetaEnvironmentNewParams{
    Name: "my-dev-env",
    Config: anthropic.BetaEnvironmentNewParamsConfigUnion{
        OfCloud: &anthropic.BetaCloudConfigParams{
            Networking: anthropic.BetaCloudConfigParamsNetworkingUnion{
                OfUnrestricted: &anthropic.BetaUnrestrictedNetworkParam{},
            },
        },
    },
})
if err != nil {
    panic(err)
}
fmt.Println(environment.ID) // env_...
\`\`\`

---

## Create an Agent (required first step)

> \u26A0\uFE0F **There is no inline agent config.** \`Model\`/\`System\`/\`Tools\` live on the agent object, not the session. Always start with \`Beta.Agents.New()\` \u2014 the session only takes \`Agent: anthropic.BetaSessionNewParamsAgentUnion{OfString: anthropic.String(agent.ID)}\` (or the typed \`OfBetaManagedAgentsAgents\` variant when you need a specific version).

### Minimal

\`\`\`go
// 1. Create the agent (reusable, versioned)
agent, err := client.Beta.Agents.New(ctx, anthropic.BetaAgentNewParams{
    Name: "Coding Assistant",
    Model: anthropic.BetaManagedAgentsModelConfigParams{
        ID:   "{{OPUS_ID}}",
        Type: anthropic.BetaManagedAgentsModelConfigParamsTypeModelConfig,
    },
    System: anthropic.String("You are a helpful coding assistant."),
    Tools: []anthropic.BetaAgentNewParamsToolUnion{{
        OfAgentToolset20260401: &anthropic.BetaManagedAgentsAgentToolset20260401Params{
            Type: anthropic.BetaManagedAgentsAgentToolset20260401ParamsTypeAgentToolset20260401,
        },
    }},
})
if err != nil {
    panic(err)
}

// 2. Start a session
session, err := client.Beta.Sessions.New(ctx, anthropic.BetaSessionNewParams{
    Agent: anthropic.BetaSessionNewParamsAgentUnion{
        OfBetaManagedAgentsAgents: &anthropic.BetaManagedAgentsAgentParams{
            Type:    anthropic.BetaManagedAgentsAgentParamsTypeAgent,
            ID:      agent.ID,
            Version: anthropic.Int(agent.Version),
        },
    },
    EnvironmentID: environment.ID,
    Title:         anthropic.String("Quickstart session"),
})
if err != nil {
    panic(err)
}
fmt.Printf("Session ID: %s, status: %s\\n", session.ID, session.Status)
fmt.Printf("Trace: https://platform.claude.com/workspaces/default/sessions/%s\\n", session.ID)
\`\`\`

### Updating an Agent

Updates create new versions; the agent object is immutable per version.

\`\`\`go
updatedAgent, err := client.Beta.Agents.Update(ctx, agent.ID, anthropic.BetaAgentUpdateParams{
    Version: agent.Version,
    System:  anthropic.String("You are a helpful coding agent. Always write tests."),
})
if err != nil {
    panic(err)
}
fmt.Printf("New version: %d\\n", updatedAgent.Version)

// List all versions
iter := client.Beta.Agents.Versions.ListAutoPaging(ctx, agent.ID, anthropic.BetaAgentVersionListParams{})
for iter.Next() {
    version := iter.Current()
    fmt.Printf("Version %d: %s\\n", version.Version, version.UpdatedAt.Format(time.RFC3339))
}
if err := iter.Err(); err != nil {
    panic(err)
}

// Archive the agent
_, err = client.Beta.Agents.Archive(ctx, agent.ID, anthropic.BetaAgentArchiveParams{})
if err != nil {
    panic(err)
}
\`\`\`

---

## Send a User Message

\`\`\`go
_, err = client.Beta.Sessions.Events.Send(ctx, session.ID, anthropic.BetaSessionEventSendParams{
    Events: []anthropic.BetaManagedAgentsEventParamsUnion{{
        OfUserMessage: &anthropic.BetaManagedAgentsUserMessageEventParams{
            Type: anthropic.BetaManagedAgentsUserMessageEventParamsTypeUserMessage,
            Content: []anthropic.BetaManagedAgentsUserMessageEventParamsContentUnion{{
                OfText: &anthropic.BetaManagedAgentsTextBlockParam{
                    Type: anthropic.BetaManagedAgentsTextBlockTypeText,
                    Text: "Review the auth module",
                },
            }},
        },
    }},
})
if err != nil {
    panic(err)
}
\`\`\`

> \uD83D\uDCA1 **Stream-first:** Open the stream *before* (or concurrently with) sending the message. The stream only delivers events that occur after it opens \u2014 stream-after-send means early events arrive buffered in one batch. See [Steering Patterns](../../shared/managed-agents-events.md#steering-patterns).

---

## Stream Events (SSE)

\`\`\`go
// Open the stream first, then send the user message
stream := client.Beta.Sessions.Events.StreamEvents(ctx, session.ID, anthropic.BetaSessionEventStreamParams{})
defer stream.Close()

if _, err := client.Beta.Sessions.Events.Send(ctx, session.ID, anthropic.BetaSessionEventSendParams{
    Events: []anthropic.BetaManagedAgentsEventParamsUnion{{
        OfUserMessage: &anthropic.BetaManagedAgentsUserMessageEventParams{
            Type: anthropic.BetaManagedAgentsUserMessageEventParamsTypeUserMessage,
            Content: []anthropic.BetaManagedAgentsUserMessageEventParamsContentUnion{{
                OfText: &anthropic.BetaManagedAgentsTextBlockParam{
                    Type: anthropic.BetaManagedAgentsTextBlockTypeText,
                    Text: "Summarize the repo README",
                },
            }},
        },
    }},
}); err != nil {
    panic(err)
}

events:
for stream.Next() {
    switch event := stream.Current().AsAny().(type) {
    case anthropic.BetaManagedAgentsAgentMessageEvent:
        for _, block := range event.Content {
            fmt.Print(block.Text)
        }
    case anthropic.BetaManagedAgentsAgentToolUseEvent:
        fmt.Printf("\\n[Using tool: %s]\\n", event.Name)
    case anthropic.BetaManagedAgentsSessionStatusIdleEvent:
        break events
    case anthropic.BetaManagedAgentsSessionErrorEvent:
        fmt.Printf("\\n[Error: %s]\\n", event.Error.Message)
        break events
    }
}
if err := stream.Err(); err != nil {
    panic(err)
}
\`\`\`

### Reconnecting and Tailing

When reconnecting mid-session, list past events first to dedupe, then tail live events:

\`\`\`go
stream := client.Beta.Sessions.Events.StreamEvents(ctx, session.ID, anthropic.BetaSessionEventStreamParams{})
defer stream.Close()

// Stream is open and buffering. List history before tailing live.
seenEventIDs := map[string]struct{}{}
history := client.Beta.Sessions.Events.ListAutoPaging(ctx, session.ID, anthropic.BetaSessionEventListParams{})
for history.Next() {
    seenEventIDs[history.Current().ID] = struct{}{}
}
if err := history.Err(); err != nil {
    panic(err)
}

// Tail live events, skipping anything already seen
tail:
for stream.Next() {
    event := stream.Current()
    if _, seen := seenEventIDs[event.ID]; seen {
        continue
    }
    seenEventIDs[event.ID] = struct{}{}
    switch event := event.AsAny().(type) {
    case anthropic.BetaManagedAgentsAgentMessageEvent:
        for _, block := range event.Content {
            fmt.Print(block.Text)
        }
    case anthropic.BetaManagedAgentsSessionStatusIdleEvent:
        break tail
    }
}
if err := stream.Err(); err != nil {
    panic(err)
}
\`\`\`

---

## Provide Custom Tool Result

> \u2139\uFE0F The Go managed-agents bindings for \`user.custom_tool_result\` are not yet documented in this skill or in the apps source examples. Refer to \`shared/managed-agents-events.md\` for the wire format and the \`github.com/anthropics/anthropic-sdk-go\` repository for the corresponding Go params types.

---

## Poll Events

\`\`\`go
// Auto-paginating iterator
iter := client.Beta.Sessions.Events.ListAutoPaging(ctx, session.ID, anthropic.BetaSessionEventListParams{})
for iter.Next() {
    event := iter.Current()
    fmt.Printf("%s: %s\\n", event.Type, event.ID)
}
if err := iter.Err(); err != nil {
    panic(err)
}
\`\`\`

---

## Upload a File

\`\`\`go
csvFile, err := os.Open("data.csv")
if err != nil {
    panic(err)
}
defer csvFile.Close()

file, err := client.Beta.Files.Upload(ctx, anthropic.BetaFileUploadParams{
    File: csvFile,
})
if err != nil {
    panic(err)
}
fmt.Printf("File ID: %s\\n", file.ID)

// Mount in a session
session, err := client.Beta.Sessions.New(ctx, anthropic.BetaSessionNewParams{
    Agent: anthropic.BetaSessionNewParamsAgentUnion{
        OfString: anthropic.String(agent.ID),
    },
    EnvironmentID: environment.ID,
    Resources: []anthropic.BetaSessionNewParamsResourceUnion{{
        OfFile: &anthropic.BetaManagedAgentsFileResourceParams{
            Type:      anthropic.BetaManagedAgentsFileResourceParamsTypeFile,
            FileID:    file.ID,
            MountPath: anthropic.String("/workspace/data.csv"),
        },
    }},
})
if err != nil {
    panic(err)
}
\`\`\`

### Add and Manage Resources on an Existing Session

\`\`\`go
// Attach an additional file to an open session
resource, err := client.Beta.Sessions.Resources.Add(ctx, session.ID, anthropic.BetaSessionResourceAddParams{
    BetaManagedAgentsFileResourceParams: anthropic.BetaManagedAgentsFileResourceParams{
        Type:   anthropic.BetaManagedAgentsFileResourceParamsTypeFile,
        FileID: file.ID,
    },
})
if err != nil {
    panic(err)
}
fmt.Println(resource.ID) // "sesrsc_01ABC..."

// List resources on the session
listed, err := client.Beta.Sessions.Resources.List(ctx, session.ID, anthropic.BetaSessionResourceListParams{})
if err != nil {
    panic(err)
}
for _, entry := range listed.Data {
    fmt.Println(entry.ID, entry.Type)
}

// Detach a resource
if _, err := client.Beta.Sessions.Resources.Delete(ctx, resource.ID, anthropic.BetaSessionResourceDeleteParams{
    SessionID: session.ID,
}); err != nil {
    panic(err)
}
\`\`\`

---

## List and Download Session Files

> \u2139\uFE0F Listing and downloading files an agent wrote during a session is not yet documented for Go in this skill or in the apps source examples. See \`shared/managed-agents-events.md\` and the \`github.com/anthropics/anthropic-sdk-go\` repository for the \`Beta.Files.List\` and \`Beta.Files.Download\` Go params types.

---

## Session Management

\`\`\`go
// List environments
environments, err := client.Beta.Environments.List(ctx, anthropic.BetaEnvironmentListParams{})
if err != nil {
    panic(err)
}

// Retrieve a specific environment
env, err := client.Beta.Environments.Get(ctx, environment.ID, anthropic.BetaEnvironmentGetParams{})
if err != nil {
    panic(err)
}

// Archive an environment (read-only, existing sessions continue)
_, err = client.Beta.Environments.Archive(ctx, environment.ID, anthropic.BetaEnvironmentArchiveParams{})
if err != nil {
    panic(err)
}

// Delete an environment (only if no sessions reference it)
_, err = client.Beta.Environments.Delete(ctx, environment.ID, anthropic.BetaEnvironmentDeleteParams{})
if err != nil {
    panic(err)
}

// Delete a session
_, err = client.Beta.Sessions.Delete(ctx, session.ID, anthropic.BetaSessionDeleteParams{})
if err != nil {
    panic(err)
}
\`\`\`

---

## MCP Server Integration

\`\`\`go
// Agent declares MCP server (no auth here \u2014 auth goes in a vault)
agent, err := client.Beta.Agents.New(ctx, anthropic.BetaAgentNewParams{
    Name: "GitHub Assistant",
    Model: anthropic.BetaManagedAgentsModelConfigParams{
        ID:   "{{OPUS_ID}}",
        Type: anthropic.BetaManagedAgentsModelConfigParamsTypeModelConfig,
    },
    MCPServers: []anthropic.BetaManagedAgentsURLMCPServerParams{{
        Type: anthropic.BetaManagedAgentsURLMCPServerParamsTypeURL,
        Name: "github",
        URL:  "https://api.githubcopilot.com/mcp/",
    }},
    Tools: []anthropic.BetaAgentNewParamsToolUnion{
        {
            OfAgentToolset20260401: &anthropic.BetaManagedAgentsAgentToolset20260401Params{
                Type: anthropic.BetaManagedAgentsAgentToolset20260401ParamsTypeAgentToolset20260401,
            },
        },
        {
            OfMCPToolset: &anthropic.BetaManagedAgentsMCPToolsetParams{
                Type:          anthropic.BetaManagedAgentsMCPToolsetParamsTypeMCPToolset,
                MCPServerName: "github",
            },
        },
    },
})
if err != nil {
    panic(err)
}

// Session attaches vault(s) containing credentials for those MCP server URLs
session, err := client.Beta.Sessions.New(ctx, anthropic.BetaSessionNewParams{
    Agent: anthropic.BetaSessionNewParamsAgentUnion{
        OfBetaManagedAgentsAgents: &anthropic.BetaManagedAgentsAgentParams{
            Type:    anthropic.BetaManagedAgentsAgentParamsTypeAgent,
            ID:      agent.ID,
            Version: anthropic.Int(agent.Version),
        },
    },
    EnvironmentID: environment.ID,
    VaultIDs:      []string{vault.ID},
})
if err != nil {
    panic(err)
}
\`\`\`

See \`shared/managed-agents-tools.md\` \xA7Vaults for creating vaults and adding credentials.

---

## Vaults

\`\`\`go
// Create a vault
vault, err := client.Beta.Vaults.New(ctx, anthropic.BetaVaultNewParams{
    DisplayName: "Alice",
    Metadata:    map[string]string{"external_user_id": "usr_abc123"},
})
if err != nil {
    panic(err)
}

// Add an OAuth credential
credential, err := client.Beta.Vaults.Credentials.New(ctx, vault.ID, anthropic.BetaVaultCredentialNewParams{
    DisplayName: anthropic.String("Alice's Slack"),
    Auth: anthropic.BetaVaultCredentialNewParamsAuthUnion{
        OfMCPOAuth: &anthropic.BetaManagedAgentsMCPOAuthCreateParams{
            Type:         anthropic.BetaManagedAgentsMCPOAuthCreateParamsTypeMCPOAuth,
            MCPServerURL: "https://mcp.slack.com/mcp",
            AccessToken:  "xoxp-...",
            ExpiresAt:    anthropic.Time(time.Date(2026, time.April, 15, 0, 0, 0, 0, time.UTC)),
            Refresh: anthropic.BetaManagedAgentsMCPOAuthRefreshParams{
                TokenEndpoint: "https://slack.com/api/oauth.v2.access",
                ClientID:      "1234567890.0987654321",
                Scope:         anthropic.String("channels:read chat:write"),
                RefreshToken:  "xoxe-1-...",
                TokenEndpointAuth: anthropic.BetaManagedAgentsMCPOAuthRefreshParamsTokenEndpointAuthUnion{
                    OfClientSecretPost: &anthropic.BetaManagedAgentsTokenEndpointAuthPostParam{
                        Type:         anthropic.BetaManagedAgentsTokenEndpointAuthPostParamTypeClientSecretPost,
                        ClientSecret: "abc123...",
                    },
                },
            },
        },
    },
})
if err != nil {
    panic(err)
}

// Rotate the credential (e.g., after a token refresh)
_, err = client.Beta.Vaults.Credentials.Update(ctx, credential.ID, anthropic.BetaVaultCredentialUpdateParams{
    VaultID: vault.ID,
    Auth: anthropic.BetaVaultCredentialUpdateParamsAuthUnion{
        OfMCPOAuth: &anthropic.BetaManagedAgentsMCPOAuthUpdateParams{
            Type:        anthropic.BetaManagedAgentsMCPOAuthUpdateParamsTypeMCPOAuth,
            AccessToken: anthropic.String("xoxp-new-..."),
            ExpiresAt:   anthropic.Time(time.Date(2026, time.May, 15, 0, 0, 0, 0, time.UTC)),
            Refresh: anthropic.BetaManagedAgentsMCPOAuthRefreshUpdateParams{
                RefreshToken: anthropic.String("xoxe-1-new-..."),
            },
        },
    },
})
if err != nil {
    panic(err)
}

// Archive a vault
_, err = client.Beta.Vaults.Archive(ctx, vault.ID, anthropic.BetaVaultArchiveParams{})
if err != nil {
    panic(err)
}
\`\`\`

---

## GitHub Repository Integration

Mount a GitHub repository as a session resource (a vault holds the GitHub MCP credential):

\`\`\`go
session, err := client.Beta.Sessions.New(ctx, anthropic.BetaSessionNewParams{
    Agent:         anthropic.BetaSessionNewParamsAgentUnion{OfString: anthropic.String(agent.ID)},
    EnvironmentID: environment.ID,
    VaultIDs:      []string{vault.ID},
    Resources: []anthropic.BetaSessionNewParamsResourceUnion{
        {
            OfGitHubRepository: &anthropic.BetaManagedAgentsGitHubRepositoryResourceParams{
                Type:               anthropic.BetaManagedAgentsGitHubRepositoryResourceParamsTypeGitHubRepository,
                URL:                "https://github.com/org/repo",
                MountPath:          anthropic.String("/workspace/repo"),
                AuthorizationToken: "ghp_your_github_token",
            },
        },
    },
})
if err != nil {
    panic(err)
}
\`\`\`

Multiple repositories on the same session:

\`\`\`go
resources := []anthropic.BetaSessionNewParamsResourceUnion{
    {
        OfGitHubRepository: &anthropic.BetaManagedAgentsGitHubRepositoryResourceParams{
            Type:               anthropic.BetaManagedAgentsGitHubRepositoryResourceParamsTypeGitHubRepository,
            URL:                "https://github.com/org/frontend",
            MountPath:          anthropic.String("/workspace/frontend"),
            AuthorizationToken: "ghp_your_github_token",
        },
    },
    {
        OfGitHubRepository: &anthropic.BetaManagedAgentsGitHubRepositoryResourceParams{
            Type:               anthropic.BetaManagedAgentsGitHubRepositoryResourceParamsTypeGitHubRepository,
            URL:                "https://github.com/org/backend",
            MountPath:          anthropic.String("/workspace/backend"),
            AuthorizationToken: "ghp_your_github_token",
        },
    },
}
\`\`\`

Rotating a repository's authorization token:

\`\`\`go
listed, err := client.Beta.Sessions.Resources.List(ctx, session.ID, anthropic.BetaSessionResourceListParams{})
if err != nil {
    panic(err)
}
repoResourceID := listed.Data[0].ID

_, err = client.Beta.Sessions.Resources.Update(ctx, repoResourceID, anthropic.BetaSessionResourceUpdateParams{
    SessionID:          session.ID,
    AuthorizationToken: "ghp_your_new_github_token",
})
if err != nil {
    panic(err)
}
\`\`\`
`;
  var f1c = () => {};
  var y1c = `# Files API \u2014 Java

## Files API (Beta)

Under \`client.beta().files()\`. File references in messages need the beta message types (non-beta \`DocumentBlockParam.Source\` has no file-ID variant).

\`\`\`java
import com.anthropic.models.beta.files.FileUploadParams;
import com.anthropic.models.beta.files.FileMetadata;
import com.anthropic.models.beta.messages.BetaRequestDocumentBlock;
import com.anthropic.models.beta.messages.BetaFileDocumentSource;
import java.nio.file.Paths;

FileMetadata meta = client.beta().files().upload(
    FileUploadParams.builder()
        .file(Paths.get("/path/to/doc.pdf"))  // or .file(InputStream) or .file(byte[])
        .build());

// Reference in a beta message:
BetaRequestDocumentBlock doc = BetaRequestDocumentBlock.builder()
    .source(BetaFileDocumentSource.builder().fileId(meta.id()).build())
    .build();
\`\`\`

Other methods: \`.list()\`, \`.delete(String fileId)\`, \`.download(String fileId)\`, \`.retrieveMetadata(String fileId)\`.
`;
  var g1c = () => {};
  var _1c = () => {};
  var T1c = `# Streaming \u2014 Java

## Streaming

\`\`\`java
import com.anthropic.core.http.StreamResponse;
import com.anthropic.models.messages.RawMessageStreamEvent;

MessageCreateParams params = MessageCreateParams.builder()
    .model(Model.CLAUDE_OPUS_4_8)
    .maxTokens(64000L)
    .addUserMessage("Write a haiku")
    .build();

try (StreamResponse<RawMessageStreamEvent> streamResponse = client.messages().createStreaming(params)) {
    streamResponse.stream()
        .flatMap(event -> event.contentBlockDelta().stream())
        .flatMap(deltaEvent -> deltaEvent.delta().text().stream())
        .forEach(textDelta -> System.out.print(textDelta.text()));
}
\`\`\`

---

`;
  var S1c = () => {};
  var v1c = `# Tool Use \u2014 Java

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Use (Beta)

The Java SDK supports beta tool use with annotated classes. Tool classes implement \`Supplier<String>\` for automatic execution via \`BetaToolRunner\`.

### Tool Runner (automatic loop)

\`\`\`java
import com.anthropic.models.beta.messages.MessageCreateParams;
import com.anthropic.models.beta.messages.BetaMessage;
import com.anthropic.helpers.BetaToolRunner;
import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import java.util.function.Supplier;

@JsonClassDescription("Get the weather in a given location")
static class GetWeather implements Supplier<String> {
    @JsonPropertyDescription("The city and state, e.g. San Francisco, CA")
    public String location;

    @Override
    public String get() {
        return "The weather in " + location + " is sunny and 72\xB0F";
    }
}

BetaToolRunner toolRunner = client.beta().messages().toolRunner(
    MessageCreateParams.builder()
        .model("{{OPUS_ID}}")
        .maxTokens(16000L)
        .putAdditionalHeader("anthropic-beta", "structured-outputs-2025-11-13")
        .addTool(GetWeather.class)
        .addUserMessage("What's the weather in San Francisco?")
        .build());

for (BetaMessage message : toolRunner) {
    System.out.println(message);
}
\`\`\`

### Memory Tool

The Java SDK provides \`BetaMemoryToolHandler\` for implementing the memory tool backend. You supply a handler that manages file storage, and the \`BetaToolRunner\` handles memory tool calls automatically.

\`\`\`java
import com.anthropic.helpers.BetaMemoryToolHandler;
import com.anthropic.helpers.BetaToolRunner;
import com.anthropic.models.beta.messages.BetaMemoryTool20250818;
import com.anthropic.models.beta.messages.BetaMessage;
import com.anthropic.models.beta.messages.MessageCreateParams;
import com.anthropic.models.beta.messages.ToolRunnerCreateParams;

// Implement BetaMemoryToolHandler with your storage backend (e.g., filesystem)
BetaMemoryToolHandler memoryHandler = new FileSystemMemoryToolHandler(sandboxRoot);

MessageCreateParams createParams = MessageCreateParams.builder()
    .model("{{OPUS_ID}}")
    .maxTokens(4096L)
    .addTool(BetaMemoryTool20250818.builder().build())
    .addUserMessage("Remember that my favorite color is blue")
    .build();

BetaToolRunner toolRunner = client.beta().messages().toolRunner(
    ToolRunnerCreateParams.builder()
        .betaMemoryToolHandler(memoryHandler)
        .initialMessageParams(createParams)
        .build());

for (BetaMessage message : toolRunner) {
    System.out.println(message);
}
\`\`\`

See the [shared memory tool concepts](../../shared/tool-use-concepts.md) for more details on the memory tool.

### Non-Beta Tool Declaration (manual JSON schema)

\`Tool.InputSchema.Properties\` is a freeform \`Map<String, JsonValue>\` wrapper \u2014 build property schemas via \`putAdditionalProperty\`. \`type: "object"\` is the default. The builder has a direct \`.addTool(Tool)\` overload that wraps in \`ToolUnion\` automatically.

\`\`\`java
import com.anthropic.core.JsonValue;
import com.anthropic.models.messages.Tool;

Tool tool = Tool.builder()
    .name("get_weather")
    .description("Get the current weather in a given location")
    .inputSchema(Tool.InputSchema.builder()
        .properties(Tool.InputSchema.Properties.builder()
            .putAdditionalProperty("location", JsonValue.from(Map.of("type", "string")))
            .build())
        .required(List.of("location"))
        .build())
    .build();

MessageCreateParams params = MessageCreateParams.builder()
    .model(Model.CLAUDE_SONNET_4_6)
    .maxTokens(16000L)
    .addTool(tool)
    .addUserMessage("Weather in Paris?")
    .build();
\`\`\`

For manual tool loops, handle \`tool_use\` blocks in the response, send \`tool_result\` back, loop until \`stop_reason\` is \`"end_turn"\`. See [shared tool use concepts](../../shared/tool-use-concepts.md).

### Building \`MessageParam\` with Content Blocks (Tool Result Round-Trip)

\`MessageParam.Content\` is an inner union class (string | list). Use the builder's \`.contentOfBlockParams(List<ContentBlockParam>)\` alias \u2014 there is NO separate \`MessageParamContent\` class with a static \`ofBlockParams\`:

\`\`\`java
import com.anthropic.models.messages.MessageParam;
import com.anthropic.models.messages.ContentBlockParam;
import com.anthropic.models.messages.ToolResultBlockParam;

List<ContentBlockParam> results = List.of(
    ContentBlockParam.ofToolResult(ToolResultBlockParam.builder()
        .toolUseId(toolUseBlock.id())
        .content(yourResultString)
        .build())
);

MessageParam toolResultMsg = MessageParam.builder()
    .role(MessageParam.Role.USER)
    .contentOfBlockParams(results)   // builder alias for Content.ofBlockParams(...)
    .build();
\`\`\`

---

## Structured Output

The class-based overload auto-derives the JSON schema from your POJO and gives you a typed \`.text()\` return \u2014 no manual schema, no manual parsing.

\`\`\`java
import com.anthropic.models.messages.StructuredMessageCreateParams;

record Book(String title, String author) {}
record BookList(List<Book> books) {}

StructuredMessageCreateParams<BookList> params = MessageCreateParams.builder()
    .model(Model.CLAUDE_SONNET_4_6)
    .maxTokens(16000L)
    .outputConfig(BookList.class)  // returns a typed builder
    .addUserMessage("List 3 classic novels")
    .build();

client.messages().create(params).content().stream()
    .flatMap(cb -> cb.text().stream())
    .forEach(typed -> {
        // typed.text() returns BookList, not String
        for (Book b : typed.text().books()) System.out.println(b.title());
    });
\`\`\`

Supports Jackson annotations: \`@JsonPropertyDescription\`, \`@JsonIgnore\`, \`@ArraySchema(minItems=...)\`. Manual schema path: \`OutputConfig.builder().format(JsonOutputFormat.builder().schema(...).build())\`.

---

## Anthropic-Defined Tools

Version-suffixed types; \`name\`/\`type\` auto-set by builder. Direct \`.addTool()\` overloads exist for most tool types; where one is missing (newer or less-common tools \u2014 see the advisor note below), wrap via the union type's static factory: \`.addTool(BetaToolUnion.of<ToolName>(builder\u2026build()))\`. Web search and code execution are server-executed; bash and text editor are client-executed (you handle the \`tool_use\` locally \u2014 see \`shared/tool-use-concepts.md\`).

\`\`\`java
import com.anthropic.models.messages.WebSearchTool20260209;
import com.anthropic.models.messages.ToolBash20250124;
import com.anthropic.models.messages.ToolTextEditor20250728;
import com.anthropic.models.messages.CodeExecutionTool20260120;

.addTool(WebSearchTool20260209.builder()
    .maxUses(5L)                              // optional
    .allowedDomains(List.of("example.com"))   // optional
    .build())
.addTool(ToolBash20250124.builder().build())
.addTool(ToolTextEditor20250728.builder().build())
.addTool(CodeExecutionTool20260120.builder().build())
\`\`\`

Also available: \`WebFetchTool20260209\`, \`MemoryTool20250818\`, \`ToolSearchToolBm25_20251119\`. For the advisor tool, use \`BetaAdvisorTool20260301\` in the beta namespace with \`.addBeta("advisor-tool-2026-03-01")\` (server-side; advisor model \u2265 executor model). There is no direct \`.addTool(BetaAdvisorTool20260301)\` overload on the beta builder \u2014 wrap it via the \`BetaToolUnion\` static factory for the advisor type; if \`javac\` rejects the specific factory method name, \`javap com.anthropic.models.beta.messages.BetaToolUnion | grep -i advisor\` shows the exact one.

### Beta namespace (MCP, compaction)

For beta-only features use \`com.anthropic.models.beta.messages.*\` \u2014 class names have a \`Beta\` prefix AND live in the beta package. The beta \`MessageCreateParams.Builder\` has direct \`.addTool(BetaToolBash20250124)\` overloads AND \`.addMcpServer()\`:

\`\`\`java
import com.anthropic.models.beta.messages.MessageCreateParams;
import com.anthropic.models.beta.messages.BetaToolBash20250124;
import com.anthropic.models.beta.messages.BetaCodeExecutionTool20260120;
import com.anthropic.models.beta.messages.BetaRequestMcpServerUrlDefinition;

MessageCreateParams params = MessageCreateParams.builder()
    .model(Model.CLAUDE_OPUS_4_8)
    .maxTokens(16000L)
    .addBeta("mcp-client-2025-11-20")
    .addTool(BetaToolBash20250124.builder().build())
    .addTool(BetaCodeExecutionTool20260120.builder().build())
    .addMcpServer(BetaRequestMcpServerUrlDefinition.builder()
        .name("my-server")
        .url("https://example.com/mcp")
        .build())
    .addUserMessage("...")
    .build();

client.beta().messages().create(params);
\`\`\`

\`BetaTool*\` types are NOT interchangeable with non-beta \`Tool*\` \u2014 pick one namespace per request.

**Reading server-tool blocks in the response:** \`ServerToolUseBlock\` has \`.id()\`, \`.name()\` (enum), and \`._input()\` returning raw \`JsonValue\` \u2014 there is NO typed \`.input()\`. For code execution results, unwrap two levels:

\`\`\`java
for (ContentBlock block : response.content()) {
    block.serverToolUse().ifPresent(stu -> {
        System.out.println("tool: " + stu.name() + " input: " + stu._input());
    });
    block.codeExecutionToolResult().ifPresent(r -> {
        r.content().resultBlock().ifPresent(result -> {
            System.out.println("stdout: " + result.stdout());
            System.out.println("stderr: " + result.stderr());
            System.out.println("exit: " + result.returnCode());
        });
    });
}
\`\`\`

---

`;
  var E1c = () => {};
  var w1c = () => {};
  var x1c = `# Message Batches \u2014 PHP

## Message Batches API

\`\`\`php
$batch = $client->messages->batches->create(requests: [
    ['customId' => 'req-1', 'params' => ['model' => '{{OPUS_ID}}', 'maxTokens' => 1024, 'messages' => [...]]],
    ['customId' => 'req-2', 'params' => [...]],
]);
// Poll $client->messages->batches->retrieve($batch->id) until processingStatus === 'ended',
// then iterate $client->messages->batches->results($batch->id).
\`\`\`

---

`;
  var R1c = () => {};
  var A1c = `# Files API \u2014 PHP

## Files API

\`\`\`php
$file = $client->beta->files->upload(
    file: fopen('upload_me.txt', 'r'),
    betas: ['files-api-2025-04-14'],
);
// Reference $file->id as a file content block on ->beta->messages->create().
\`\`\`
`;
  var k1c = () => {};
  var P1c = `# Claude API \u2014 PHP

> **Note:** The PHP SDK is the official Anthropic SDK for PHP. A beta tool runner is available via \`$client->beta->messages->toolRunner()\`. Structured output helpers are supported via \`StructuredOutputModel\` classes. Agent SDK is not available. Bedrock, Vertex AI, and Foundry clients are supported.

## Installation

\`\`\`bash
composer require "anthropic-ai/sdk"
\`\`\`

## Client Initialization

\`\`\`php
use Anthropic\\Client;

// Using API key from environment variable
$client = new Client(apiKey: getenv("ANTHROPIC_API_KEY"));
\`\`\`

### Amazon Bedrock

\`\`\`php
use Anthropic\\Bedrock\\MantleClient;

// Messages-API Bedrock endpoint. Reads AWS credentials from env.
$client = new MantleClient(awsRegion: 'us-east-1');
\`\`\`

Model IDs on Bedrock take an \`anthropic.\` prefix \u2014 e.g. \`model: 'anthropic.{{OPUS_ID}}'\`.

### Google Vertex AI

\`\`\`php
use Anthropic\\Vertex;

// Constructor is private. Parameter is \`location\`, not \`region\`.
$client = Vertex\\Client::fromEnvironment(
    location: 'us-east5',
    projectId: 'my-project-id',
);
\`\`\`

### Anthropic Foundry

\`\`\`php
use Anthropic\\Foundry;

// Constructor is private. baseUrl or resource is required.
$client = Foundry\\Client::withCredentials(
    apiKey: getenv('ANTHROPIC_FOUNDRY_API_KEY'),
    baseUrl: 'https://<resource>.services.ai.azure.com/anthropic/v1',
);
\`\`\`

---

## Basic Message Request

\`\`\`php
$message = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    messages: [
        ['role' => 'user', 'content' => 'What is the capital of France?'],
    ],
);

// content is an array of polymorphic blocks (TextBlock, ToolUseBlock,
// ThinkingBlock). Accessing ->text on content[0] without checking the block
// type will throw if the first block is not a TextBlock (e.g., when extended
// thinking is enabled and a ThinkingBlock comes first). Always guard:
foreach ($message->content as $block) {
    if ($block->type === 'text') {
        echo $block->text;
    }
}
\`\`\`

If you only want the first text block:

\`\`\`php
foreach ($message->content as $block) {
    if ($block->type === 'text') {
        echo $block->text;
        break;
    }
}
\`\`\`

---

## Extended Thinking

**Adaptive thinking is the recommended mode for Claude 4.6+ models.** Claude decides dynamically when and how much to think.

\`\`\`php
use Anthropic\\Messages\\ThinkingBlock;

$message = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    thinking: ['type' => 'adaptive', 'display' => 'summarized'], // display opt-in: default is omitted (empty thinking text) on Fable 5 / Mythos 5 / Opus 4.8 / 4.7
    messages: [
        ['role' => 'user', 'content' => 'Solve: 27 * 453'],
    ],
);

// ThinkingBlock(s) precede TextBlock in content
foreach ($message->content as $block) {
    if ($block instanceof ThinkingBlock) {
        echo "Thinking:\\n{$block->thinking}\\n\\n";
        // $block->signature is an opaque string \u2014 preserve verbatim if
        // passing thinking blocks back in multi-turn conversations
    } elseif ($block->type === 'text') {
        echo "Answer: {$block->text}\\n";
    }
}
\`\`\`

> **Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6:** Use adaptive thinking (above). \`['type' => 'enabled', 'budgetTokens' => N]\` is removed on Fable 5, Opus 4.8, and 4.7 (400 if sent); deprecated on Opus 4.6 and Sonnet 4.6.
> **Older models:** Use \`thinking: ['type' => 'enabled', 'budgetTokens' => N]\` (budget must be < \`maxTokens\`, min 1024).

\`$block->type === 'thinking'\` also works for the check; \`instanceof\` narrows for PHPStan.

---

## Prompt Caching

\`system:\` takes an array of text blocks; set \`cacheControl\` on the last block. Array-shape syntax (camelCase keys) is idiomatic. For placement patterns and the silent-invalidator audit checklist, see \`shared/prompt-caching.md\`.

\`\`\`php
$message = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    system: [
        ['type' => 'text', 'text' => $longSystemPrompt, 'cacheControl' => ['type' => 'ephemeral']],
    ],
    messages: [['role' => 'user', 'content' => 'Summarize the key points']],
);
\`\`\`

For 1-hour TTL: \`'cacheControl' => ['type' => 'ephemeral', 'ttl' => '1h']\`. There's also a top-level \`cacheControl:\` on \`messages->create(...)\` that auto-places on the last cacheable block.

Verify hits via \`$message->usage->cacheCreationInputTokens\` / \`$message->usage->cacheReadInputTokens\`.

---

## Stop Details

When \`stopReason\` is \`'refusal'\`, the response includes structured \`stopDetails\`:

\`\`\`php
if ($message->stopReason === 'refusal' && $message->stopDetails !== null) {
    echo "Category: " . $message->stopDetails->category . "\\n";     // e.g. "cyber", "bio", "reasoning_extraction", "frontier_llm", or null \u2014 see docs for the full set
    echo "Explanation: " . $message->stopDetails->explanation . "\\n";
}
\`\`\`

**Refusal fallbacks ({{FABLE_NAME}}) \u2014 opt in by default.** Fallbacks are opt-in: without them a refused request simply stops. New \`{{FABLE_ID}}\` code should include the server-side \`fallbacks\` parameter (beta header \`server-side-fallback-2026-06-01\`, fallback model \`{{OPUS_ID}}\`, on the beta messages call) by default. The exact PHP binding (and the client-side middleware for providers without server-side support) is not documented here \u2014 WebFetch the PHP SDK repo's \`examples/\` from \`shared/live-sources.md\`; full semantics in \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}} \u2192 \`refusal\` stop reason.

---

## Error Type

\`APIStatusException\` exposes a \`->type\` property for programmatic error classification:

\`\`\`php
try {
    $client->messages->create(...);
} catch (\\Anthropic\\Core\\Exceptions\\APIStatusException $e) {
    echo $e->type?->value;  // "rate_limit_error", "overloaded_error", etc.
}
\`\`\`
`;
  var I1c = () => {};
  var D1c = `# Streaming \u2014 PHP

## Streaming

> **Requires SDK v0.5.0+.** v0.4.0 and earlier used a single \`$params\` array; calling with named parameters throws \`Unknown named parameter $model\`. Upgrade: \`composer require "anthropic-ai/sdk:^0.7"\`

\`\`\`php
use Anthropic\\Messages\\RawContentBlockDeltaEvent;
use Anthropic\\Messages\\TextDelta;

$stream = $client->messages->createStream(
    model: '{{OPUS_ID}}',
    maxTokens: 64000,
    messages: [
        ['role' => 'user', 'content' => 'Write a haiku'],
    ],
);

foreach ($stream as $event) {
    if ($event instanceof RawContentBlockDeltaEvent && $event->delta instanceof TextDelta) {
        echo $event->delta->text;
    }
}
\`\`\`

---

`;
  var O1c = () => {};
  var N1c = `# Tool Use \u2014 PHP

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Use

### Tool Runner (Beta)

**Beta:** The PHP SDK provides a tool runner via \`$client->beta->messages->toolRunner()\`. Define tools with \`BetaRunnableTool\` \u2014 a definition array plus a \`run\` closure:

\`\`\`php
use Anthropic\\Lib\\Tools\\BetaRunnableTool;

$weatherTool = new BetaRunnableTool(
    definition: [
        'name' => 'get_weather',
        'description' => 'Get the current weather for a location.',
        'inputSchema' => [
            'type' => 'object',
            'properties' => [
                'location' => ['type' => 'string', 'description' => 'City and state'],
            ],
            'required' => ['location'],
        ],
    ],
    run: function (array $input): string {
        return "The weather in {$input['location']} is sunny and 72\xB0F.";
    },
);

$runner = $client->beta->messages->toolRunner(
    maxTokens: 16000,
    messages: [['role' => 'user', 'content' => 'What is the weather in Paris?']],
    model: '{{OPUS_ID}}',
    tools: [$weatherTool],
);

foreach ($runner as $message) {
    foreach ($message->content as $block) {
        if ($block->type === 'text') {
            echo $block->text;
        }
    }
}
\`\`\`

### Manual Loop

Tools are passed as arrays. **The SDK uses camelCase keys** (\`inputSchema\`, \`toolUseID\`, \`stopReason\`) and auto-maps to the API's snake_case on the wire \u2014 since v0.5.0. See [shared tool use concepts](../../shared/tool-use-concepts.md) for the loop pattern.

\`\`\`php
use Anthropic\\Messages\\ToolUseBlock;

$tools = [
    [
        'name' => 'get_weather',
        'description' => 'Get the current weather in a given location',
        'inputSchema' => [  // camelCase, not input_schema
            'type' => 'object',
            'properties' => [
                'location' => ['type' => 'string', 'description' => 'City and state'],
            ],
            'required' => ['location'],
        ],
    ],
];

$messages = [['role' => 'user', 'content' => 'What is the weather in SF?']];

$response = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    tools: $tools,
    messages: $messages,
);

while ($response->stopReason === 'tool_use') {  // camelCase property
    $toolResults = [];
    foreach ($response->content as $block) {
        if ($block instanceof ToolUseBlock) {
            // $block->name  : string               \u2014 tool name to dispatch on
            // $block->input : array<string,mixed>  \u2014 parsed JSON input
            // $block->id    : string               \u2014 pass back as toolUseID
            $result = executeYourTool($block->name, $block->input);
            $toolResults[] = [
                'type' => 'tool_result',
                'toolUseID' => $block->id,  // camelCase, not tool_use_id
                'content' => $result,
            ];
        }
    }

    // Append assistant turn + user turn with tool results
    $messages[] = ['role' => 'assistant', 'content' => $response->content];
    $messages[] = ['role' => 'user', 'content' => $toolResults];

    $response = $client->messages->create(
        model: '{{OPUS_ID}}',
        maxTokens: 16000,
        tools: $tools,
        messages: $messages,
    );
}

// Final text response
foreach ($response->content as $block) {
    if ($block->type === 'text') {
        echo $block->text;
    }
}
\`\`\`

\`$block->type === 'tool_use'\` also works; \`instanceof ToolUseBlock\` narrows for PHPStan.

---

## Structured Outputs

### Using StructuredOutputModel (Recommended)

Define a PHP class implementing \`StructuredOutputModel\` and pass it as \`outputConfig\`:

\`\`\`php
use Anthropic\\Lib\\Contracts\\StructuredOutputModel;
use Anthropic\\Lib\\Concerns\\StructuredOutputModelTrait;
use Anthropic\\Lib\\Attributes\\Constrained;

class Person implements StructuredOutputModel
{
    use StructuredOutputModelTrait;

    #[Constrained(description: 'Full name')]
    public string $name;

    public int $age;

    public ?string $email = null;  // nullable = optional field
}

$message = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    messages: [['role' => 'user', 'content' => 'Generate a profile for Alice, age 30']],
    outputConfig: ['format' => Person::class],
);

$person = $message->parsedOutput();  // Person instance
echo $person->name;
\`\`\`

Types are inferred from PHP type hints. Use \`#[Constrained(description: '...')]\` to add descriptions. Nullable properties (\`?string\`) become optional fields.

### Raw Schema

\`\`\`php
$message = $client->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    messages: [['role' => 'user', 'content' => 'Extract: John (john@co.com), Enterprise plan']],
    outputConfig: [
        'format' => [
            'type' => 'json_schema',
            'schema' => [
                'type' => 'object',
                'properties' => [
                    'name' => ['type' => 'string'],
                    'email' => ['type' => 'string'],
                    'plan' => ['type' => 'string'],
                ],
                'required' => ['name', 'email', 'plan'],
                'additionalProperties' => false,
            ],
        ],
    ],
);

// First text block contains valid JSON
foreach ($message->content as $block) {
    if ($block->type === 'text') {
        $data = json_decode($block->text, true);
        break;
    }
}
\`\`\`

---

## Beta Features & Anthropic-Defined Tools

**\`betas:\` is NOT a param on \`$client->messages->create()\`** \u2014 it only exists on the beta namespace. Use it for features that need an explicit opt-in header:

\`\`\`php
use Anthropic\\Beta\\Messages\\BetaRequestMCPServerURLDefinition;

$response = $client->beta->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    mcpServers: [
        BetaRequestMCPServerURLDefinition::with(
            name: 'my-server',
            url: 'https://example.com/mcp',
        ),
    ],
    betas: ['mcp-client-2025-11-20'],  // only valid on ->beta->messages
    messages: [['role' => 'user', 'content' => 'Use the MCP tools']],
);
\`\`\`

### Task budgets

\`\`\`php
$response = $client->beta->messages->create(
    model: '{{OPUS_ID}}',
    maxTokens: 16000,
    outputConfig: ['taskBudget' => ['type' => 'tokens', 'total' => 64000]],
    tools: [...],
    messages: [...],
    betas: ['task-budgets-2026-03-13'],
);
\`\`\`

### Cache diagnostics

Pass the previous response's \`id\` on the next request; print the \`diagnostics\` object on the response:

\`\`\`php
$r2 = $client->beta->messages->create(
    model: '{{OPUS_ID}}', maxTokens: 1024,
    diagnostics: ['previousMessageId' => $r1->id],
    betas: ['cache-diagnosis-2026-04-07'],
    messages: [...],
);
\`\`\`

**Anthropic-defined tools** (bash, web_search, text_editor, code_execution) are GA and work on both paths. Of these, web_search and code_execution are server-executed; bash and text_editor are client-executed (you handle the \`tool_use\` locally) \u2014 \`Anthropic\\Messages\\ToolBash20250124\` / \`WebSearchTool20260209\` / \`ToolTextEditor20250728\` / \`CodeExecutionTool20260120\` for non-beta, \`Anthropic\\Beta\\Messages\\BetaToolBash20250124\` / \`BetaWebSearchTool20260209\` / \`BetaToolTextEditor20250728\` / \`BetaCodeExecutionTool20260120\` for beta. No \`betas:\` header needed for these.

### Tool search (non-beta, server-side)

\`\`\`php
tools: [
    ['type' => 'tool_search_tool_regex_20251119', 'name' => 'tool_search_tool_regex'],
    ['name' => 'get_weather', 'description' => '...', 'inputSchema' => [...], 'deferLoading' => true],
    // ... other user tools with 'deferLoading' => true
],
\`\`\`

### Memory tool (non-beta, client-executed)

Declare \`['type' => 'memory_20250818', 'name' => 'memory']\`. Handle the \`tool_use\` by reading/writing files under a fixed \`/memories\` directory. **Validate every model-supplied path**: resolve to its canonical form and verify it remains within the memory directory; reject traversal (\`..\`, symlinks) \u2014 see \`shared/tool-use-concepts.md\` \xA7 Client-Side Tools.

---

`;
  var M1c = () => {};
  var L1c = () => {};
  var B1c = `# Message Batches API \u2014 Python

The Batches API (\`POST /v1/messages/batches\`) processes Messages API requests asynchronously at 50% of standard prices.

## Key Facts

- Up to 100,000 requests or 256 MB per batch
- Most batches complete within 1 hour; maximum 24 hours
- Results available for 29 days after creation
- 50% cost reduction on all token usage
- All Messages API features supported (vision, tools, caching, etc.)

---

## Create a Batch

\`\`\`python
import anthropic
from anthropic.types.message_create_params import MessageCreateParamsNonStreaming
from anthropic.types.messages.batch_create_params import Request

client = anthropic.Anthropic()

message_batch = client.messages.batches.create(
    requests=[
        Request(
            custom_id="request-1",
            params=MessageCreateParamsNonStreaming(
                model="{{OPUS_ID}}",
                max_tokens=16000,
                messages=[{"role": "user", "content": "Summarize climate change impacts"}]
            )
        ),
        Request(
            custom_id="request-2",
            params=MessageCreateParamsNonStreaming(
                model="{{OPUS_ID}}",
                max_tokens=16000,
                messages=[{"role": "user", "content": "Explain quantum computing basics"}]
            )
        ),
    ]
)

print(f"Batch ID: {message_batch.id}")
print(f"Status: {message_batch.processing_status}")
\`\`\`

---

## Poll for Completion

\`\`\`python
import time

while True:
    batch = client.messages.batches.retrieve(message_batch.id)
    if batch.processing_status == "ended":
        break
    print(f"Status: {batch.processing_status}, processing: {batch.request_counts.processing}")
    time.sleep(60)

print("Batch complete!")
print(f"Succeeded: {batch.request_counts.succeeded}")
print(f"Errored: {batch.request_counts.errored}")
\`\`\`

---

## Retrieve Results

> **Note:** Examples below use \`match/case\` syntax, requiring Python 3.10+. For earlier versions, use \`if/elif\` chains instead.

\`\`\`python
for result in client.messages.batches.results(message_batch.id):
    match result.result.type:
        case "succeeded":
            msg = result.result.message
            text = next((b.text for b in msg.content if b.type == "text"), "")
            print(f"[{result.custom_id}] {text[:100]}")
        case "errored":
            if result.result.error.type == "invalid_request":
                print(f"[{result.custom_id}] Validation error - fix request and retry")
            else:
                print(f"[{result.custom_id}] Server error - safe to retry")
        case "canceled":
            print(f"[{result.custom_id}] Canceled")
        case "expired":
            print(f"[{result.custom_id}] Expired - resubmit")
\`\`\`

---

## Cancel a Batch

\`\`\`python
cancelled = client.messages.batches.cancel(message_batch.id)
print(f"Status: {cancelled.processing_status}")  # "canceling"
\`\`\`

---

## List Batches (auto-pagination)

Iterating the return value of any \`list()\` call auto-paginates across all pages \u2014 do not index into \`.data\` if you want the full set:

\`\`\`python
for batch in client.messages.batches.list(limit=20):
    print(batch.id, batch.processing_status)
\`\`\`

For manual control, use \`first_page.has_next_page()\` / \`first_page.get_next_page()\` / \`first_page.next_page_info()\`; \`first_page.data\` holds the current page's items and \`first_page.last_id\` is the cursor.

---

## Batch with Prompt Caching

\`\`\`python
shared_system = [
    {"type": "text", "text": "You are a literary analyst."},
    {
        "type": "text",
        "text": large_document_text,  # Shared across all requests
        "cache_control": {"type": "ephemeral"}
    }
]

message_batch = client.messages.batches.create(
    requests=[
        Request(
            custom_id=f"analysis-{i}",
            params=MessageCreateParamsNonStreaming(
                model="{{OPUS_ID}}",
                max_tokens=16000,
                system=shared_system,
                messages=[{"role": "user", "content": question}]
            )
        )
        for i, question in enumerate(questions)
    ]
)
\`\`\`

---

## Full End-to-End Example

\`\`\`python
import anthropic
import time
from anthropic.types.message_create_params import MessageCreateParamsNonStreaming
from anthropic.types.messages.batch_create_params import Request

client = anthropic.Anthropic()

# 1. Prepare requests
items_to_classify = [
    "The product quality is excellent!",
    "Terrible customer service, never again.",
    "It's okay, nothing special.",
]

requests = [
    Request(
        custom_id=f"classify-{i}",
        params=MessageCreateParamsNonStreaming(
            model="{{HAIKU_ID}}",
            max_tokens=50,
            messages=[{
                "role": "user",
                "content": f"Classify as positive/negative/neutral (one word): {text}"
            }]
        )
    )
    for i, text in enumerate(items_to_classify)
]

# 2. Create batch
batch = client.messages.batches.create(requests=requests)
print(f"Created batch: {batch.id}")

# 3. Wait for completion
while True:
    batch = client.messages.batches.retrieve(batch.id)
    if batch.processing_status == "ended":
        break
    time.sleep(10)

# 4. Collect results
results = {}
for result in client.messages.batches.results(batch.id):
    if result.result.type == "succeeded":
        msg = result.result.message
        results[result.custom_id] = next((b.text for b in msg.content if b.type == "text"), "")

for custom_id, classification in sorted(results.items()):
    print(f"{custom_id}: {classification}")
\`\`\`
`;
  var U1c = () => {};
  var H1c = `# Files API \u2014 Python

The Files API uploads files for use in Messages API requests. Reference files via \`file_id\` in content blocks, avoiding re-uploads across multiple API calls.

**Beta:** Pass \`betas=["files-api-2025-04-14"]\` in your API calls (the SDK sets the required header automatically).

## Key Facts

- Maximum file size: 500 MB
- Total storage: 100 GB per organization
- Files persist until deleted
- File operations (upload, list, delete) are free; content used in messages is billed as input tokens
- Not available on Amazon Bedrock or Google Vertex AI

---

## Upload a File

The \`file\` argument accepts a \`(filename, content, content_type)\` tuple, a \`pathlib.Path\` (or any \`PathLike\` \u2014 read for you, async-safe with \`AsyncAnthropic\`), or an open binary file object.

\`\`\`python
import anthropic
from pathlib import Path

client = anthropic.Anthropic()

uploaded = client.beta.files.upload(
    file=("report.pdf", open("report.pdf", "rb"), "application/pdf"),
)
# or: client.beta.files.upload(file=Path("report.pdf"))
print(f"File ID: {uploaded.id}")
print(f"Size: {uploaded.size_bytes} bytes")
\`\`\`

---

## Use a File in Messages

### PDF / Text Document

\`\`\`python
response = client.beta.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": [
            {"type": "text", "text": "Summarize the key findings in this report."},
            {
                "type": "document",
                "source": {"type": "file", "file_id": uploaded.id},
                "title": "Q4 Report",           # optional
                "citations": {"enabled": True}   # optional, enables citations
            }
        ]
    }],
    betas=["files-api-2025-04-14"],
)
for block in response.content:
    if block.type == "text":
        print(block.text)
\`\`\`

### Image

\`\`\`python
image_file = client.beta.files.upload(
    file=("photo.png", open("photo.png", "rb"), "image/png"),
)

response = client.beta.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": [
            {"type": "text", "text": "What's in this image?"},
            {
                "type": "image",
                "source": {"type": "file", "file_id": image_file.id}
            }
        ]
    }],
    betas=["files-api-2025-04-14"],
)
\`\`\`

---

## Manage Files

### List Files

Iterate the list result directly \u2014 the SDK auto-paginates across all pages. Only use \`.data\` if you want the first page only.

\`\`\`python
for f in client.beta.files.list():
    print(f"{f.id}: {f.filename} ({f.size_bytes} bytes)")
\`\`\`

### Get File Metadata

\`\`\`python
file_info = client.beta.files.retrieve_metadata("file_011CNha8iCJcU1wXNR6q4V8w")
print(f"Filename: {file_info.filename}")
print(f"MIME type: {file_info.mime_type}")
\`\`\`

### Delete a File

\`\`\`python
client.beta.files.delete("file_011CNha8iCJcU1wXNR6q4V8w")
\`\`\`

### Download a File

Only files created by the code execution tool or skills can be downloaded (not user-uploaded files).

\`\`\`python
file_content = client.beta.files.download("file_011CNha8iCJcU1wXNR6q4V8w")
file_content.write_to_file("output.txt")
\`\`\`

---

## Full End-to-End Example

Upload a document once, ask multiple questions about it:

\`\`\`python
import anthropic

client = anthropic.Anthropic()

# 1. Upload once
uploaded = client.beta.files.upload(
    file=("contract.pdf", open("contract.pdf", "rb"), "application/pdf"),
)
print(f"Uploaded: {uploaded.id}")

# 2. Ask multiple questions using the same file_id
questions = [
    "What are the key terms and conditions?",
    "What is the termination clause?",
    "Summarize the payment schedule.",
]

for question in questions:
    response = client.beta.messages.create(
        model="{{OPUS_ID}}",
        max_tokens=16000,
        messages=[{
            "role": "user",
            "content": [
                {"type": "text", "text": question},
                {
                    "type": "document",
                    "source": {"type": "file", "file_id": uploaded.id}
                }
            ]
        }],
        betas=["files-api-2025-04-14"],
    )
    print(f"\\nQ: {question}")
    text = next((b.text for b in response.content if b.type == "text"), "")
    print(f"A: {text[:200]}")

# 3. Clean up when done
client.beta.files.delete(uploaded.id)
\`\`\`
`;
  var $1c = () => {};
  var q1c = `# Claude API \u2014 Python

## Installation

\`\`\`bash
pip install anthropic
\`\`\`

## Client Initialization

\`\`\`python
import anthropic

# Default \u2014 resolves credentials from the environment:
# ANTHROPIC_API_KEY, or ANTHROPIC_AUTH_TOKEN, or an \`ant auth login\` profile.
# Prefer this for local dev; don't hardcode a key.
client = anthropic.Anthropic()

# Explicit API key (only when you must inject a specific key)
client = anthropic.Anthropic(api_key="your-api-key")

# Async client
async_client = anthropic.AsyncAnthropic()
\`\`\`

---

## Client Configuration

### Per-request overrides

Use \`with_options()\` to override client settings for a single call without mutating the client:

\`\`\`python
client.with_options(timeout=5.0, max_retries=5).messages.create(
    model="{{OPUS_ID}}",
    max_tokens=1024,
    messages=[{"role": "user", "content": "Hello"}],
)
\`\`\`

### Timeouts

Default request timeout is 10 minutes. Pass a float (seconds) or an \`httpx.Timeout\` for granular control. On timeout the SDK raises \`anthropic.APITimeoutError\` (and retries per \`max_retries\`).

\`\`\`python
import httpx

client = anthropic.Anthropic(timeout=20.0)
client = anthropic.Anthropic(
    timeout=httpx.Timeout(60.0, read=5.0, write=10.0, connect=2.0),
)
\`\`\`

### Retries

The SDK auto-retries connection errors, 408, 409, 429, and \u2265500 with exponential backoff (default 2 retries). Set \`max_retries\` on the client or via \`with_options()\`; \`max_retries=0\` disables.

### Async performance (aiohttp backend)

For high-concurrency async workloads, install \`anthropic[aiohttp]\` and pass \`DefaultAioHttpClient\` instead of the default httpx backend:

\`\`\`python
from anthropic import AsyncAnthropic, DefaultAioHttpClient

async with AsyncAnthropic(http_client=DefaultAioHttpClient()) as client:
    ...
\`\`\`

### Custom HTTP client (proxy, base URL)

Use \`DefaultHttpxClient\` / \`DefaultAsyncHttpxClient\` \u2014 not raw \`httpx.Client\` \u2014 so the SDK's default timeouts and connection limits are preserved:

\`\`\`python
from anthropic import Anthropic, DefaultHttpxClient

client = Anthropic(
    base_url="http://my.test.server.example.com:8083",  # or ANTHROPIC_BASE_URL env var
    http_client=DefaultHttpxClient(proxy="http://my.test.proxy.example.com"),
)
\`\`\`

### Logging

Set \`ANTHROPIC_LOG=debug\` (or \`info\`) to enable SDK logging via the standard \`logging\` module.

---

## Basic Message Request

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[
        {"role": "user", "content": "What is the capital of France?"}
    ]
)
# response.content is a list of content block objects (TextBlock, ThinkingBlock,
# ToolUseBlock, ...). Check .type before accessing .text.
for block in response.content:
    if block.type == "text":
        print(block.text)
\`\`\`

---

## System Prompts

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    system="You are a helpful coding assistant. Always provide examples in Python.",
    messages=[{"role": "user", "content": "How do I read a JSON file?"}]
)
\`\`\`

### Mid-conversation system messages (model-gated)

For operator instructions that arrive mid-conversation (mode switches, injected state), append \`{"role": "system", ...}\` to \`messages\` instead of editing top-level \`system\` \u2014 this preserves the cached prefix and carries operator authority. Must follow a user message (or an \`assistant\` message ending in server-tool use), and must be either the last entry in \`messages\` or be followed by an \`assistant\` turn; cannot be \`messages[0]\`. Unsupported models return a 400 (\`role 'system' is not supported on this model\`). See \`shared/prompt-caching.md\` for when to use this vs. top-level \`system\`.

\`\`\`python
response = client.messages.create(
    model=MODEL_ID,  # must support mid-conversation system messages
    max_tokens=16000,
    system=[{"type": "text", "text": STABLE_SYSTEM, "cache_control": {"type": "ephemeral"}}],
    messages=history + [
        {"role": "user", "content": user_message},
        {"role": "system", "content": "Terse mode enabled \u2014 keep responses under 40 words."},
    ],
)  # No beta header needed \u2014 use regular client.messages.create
\`\`\`

---

## Vision (Images)

### Base64

\`\`\`python
import base64

with open("image.png", "rb") as f:
    image_data = base64.standard_b64encode(f.read()).decode("utf-8")

response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": [
            {
                "type": "image",
                "source": {
                    "type": "base64",
                    "media_type": "image/png",
                    "data": image_data
                }
            },
            {"type": "text", "text": "What's in this image?"}
        ]
    }]
)
\`\`\`

### URL

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": [
            {
                "type": "image",
                "source": {
                    "type": "url",
                    "url": "https://example.com/image.png"
                }
            },
            {"type": "text", "text": "Describe this image"}
        ]
    }]
)
\`\`\`

---

## Prompt Caching

Cache large context to reduce costs (up to 90% savings). **Caching is a prefix match** \u2014 any byte change anywhere in the prefix invalidates everything after it. For placement patterns, architectural guidance (frozen system prompt, deterministic tool order, where to put volatile content), and the silent-invalidator audit checklist, read \`shared/prompt-caching.md\`.

### Automatic Caching (Recommended)

Use top-level \`cache_control\` to automatically cache the last cacheable block in the request \u2014 no need to annotate individual content blocks:

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    cache_control={"type": "ephemeral"},  # auto-caches the last cacheable block
    system="You are an expert on this large document...",
    messages=[{"role": "user", "content": "Summarize the key points"}]
)
\`\`\`

### Manual Cache Control

For fine-grained control, add \`cache_control\` to specific content blocks:

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    system=[{
        "type": "text",
        "text": "You are an expert on this large document...",
        "cache_control": {"type": "ephemeral"}  # default TTL is 5 minutes
    }],
    messages=[{"role": "user", "content": "Summarize the key points"}]
)

# With explicit TTL (time-to-live)
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    system=[{
        "type": "text",
        "text": "You are an expert on this large document...",
        "cache_control": {"type": "ephemeral", "ttl": "1h"}  # 1 hour TTL
    }],
    messages=[{"role": "user", "content": "Summarize the key points"}]
)
\`\`\`

### Verifying Cache Hits

\`\`\`python
print(response.usage.cache_creation_input_tokens)  # tokens written to cache (~1.25x cost)
print(response.usage.cache_read_input_tokens)      # tokens served from cache (~0.1x cost)
print(response.usage.input_tokens)                 # uncached tokens (full cost)
\`\`\`

If \`cache_read_input_tokens\` is zero across repeated identical-prefix requests, a silent invalidator is at work \u2014 \`datetime.now()\` or a UUID in the system prompt, unsorted \`json.dumps()\`, or a varying tool set. See \`shared/prompt-caching.md\` for the full audit table.

---

## Extended Thinking

> **Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6:** Use adaptive thinking. \`budget_tokens\` is removed on Fable 5, Opus 4.8, and 4.7 (400 if sent); deprecated on Opus 4.6 and Sonnet 4.6.
> **Older models:** Use \`thinking: {type: "enabled", budget_tokens: N}\` (must be < \`max_tokens\`, min 1024).

\`\`\`python
# Fable 5 / Opus 4.8 / 4.7 / 4.6: adaptive thinking (recommended)
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    thinking={"type": "adaptive", "display": "summarized"},  # display opt-in: default is omitted (empty thinking text) on Fable 5 / Mythos 5 / Opus 4.8 / 4.7
    output_config={"effort": "high"},  # low | medium | high | max
    messages=[{"role": "user", "content": "Solve this step by step..."}]
)

# Access thinking and response
for block in response.content:
    if block.type == "thinking":
        print(f"Thinking: {block.thinking}")
    elif block.type == "text":
        print(f"Response: {block.text}")
\`\`\`

---

## Error Handling

\`\`\`python
import anthropic

try:
    response = client.messages.create(...)
except anthropic.BadRequestError as e:
    print(f"Bad request: {e.message}")
except anthropic.AuthenticationError:
    print("Invalid API key")
except anthropic.PermissionDeniedError:
    print("API key lacks required permissions")
except anthropic.NotFoundError:
    print("Invalid model or endpoint")
except anthropic.RateLimitError as e:
    retry_after = int(e.response.headers.get("retry-after", "60"))
    print(f"Rate limited. Retry after {retry_after}s.")
except anthropic.APIStatusError as e:
    if e.status_code >= 500:
        print(f"Server error ({e.status_code}). Retry later.")
    else:
        print(f"API error: {e.message}")
except anthropic.APIConnectionError:
    print("Network error. Check internet connection.")
\`\`\`

---

## Response Helpers

Every response object exposes \`_request_id\` (populated from the \`request-id\` header) \u2014 log it when reporting failures to Anthropic. Despite the underscore prefix, this property is public.

\`\`\`python
message = client.messages.create(...)
print(message._request_id)       # req_018EeWyXxfu5pfWkrYcMdjWG
print(message.to_json())          # serialize the Pydantic model
print(message.to_dict())          # plain dict
\`\`\`

To access raw headers or other response metadata, use \`.with_raw_response\`:

\`\`\`python
raw = client.messages.with_raw_response.create(
    model="{{OPUS_ID}}",
    max_tokens=1024,
    messages=[{"role": "user", "content": "Hello"}],
)
print(raw.headers.get("request-id"))
message = raw.parse()  # the Message object messages.create() would have returned
\`\`\`

---

## Multi-Turn Conversations

The API is stateless \u2014 send the full conversation history each time.

\`\`\`python
class ConversationManager:
    """Manage multi-turn conversations with the Claude API."""

    def __init__(self, client: anthropic.Anthropic, model: str, system: str = None):
        self.client = client
        self.model = model
        self.system = system
        self.messages = []

    def send(self, user_message: str, **kwargs) -> str:
        """Send a message and get a response."""
        self.messages.append({"role": "user", "content": user_message})

        response = self.client.messages.create(
            model=self.model,
            max_tokens=kwargs.get("max_tokens", 16000),
            system=self.system,
            messages=self.messages,
            **kwargs
        )

        assistant_message = next(
            (b.text for b in response.content if b.type == "text"), ""
        )
        self.messages.append({"role": "assistant", "content": assistant_message})

        return assistant_message

# Usage
conversation = ConversationManager(
    client=anthropic.Anthropic(),
    model="{{OPUS_ID}}",
    system="You are a helpful assistant."
)

response1 = conversation.send("My name is Alice.")
response2 = conversation.send("What's my name?")  # Claude remembers "Alice"
\`\`\`

**Rules:**

- Consecutive same-role messages are allowed \u2014 the API combines them into a single turn
- First message must be \`user\`
- \`role: "system"\` messages are allowed mid-conversation on supporting models (no beta header needed) \u2014 see \xA7 Mid-conversation system messages above

---

### Compaction (long conversations)

> **Beta, Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6.** When conversations approach the 200K context window, compaction automatically summarizes earlier context server-side. The API returns a \`compaction\` block; you must pass it back on subsequent requests \u2014 append \`response.content\`, not just the text.

\`\`\`python
import anthropic

client = anthropic.Anthropic()
messages = []

def chat(user_message: str) -> str:
    messages.append({"role": "user", "content": user_message})

    response = client.beta.messages.create(
        betas=["compact-2026-01-12"],
        model="{{OPUS_ID}}",
        max_tokens=16000,
        messages=messages,
        context_management={
            "edits": [{"type": "compact_20260112"}]
        }
    )

    # Append full content \u2014 compaction blocks must be preserved
    messages.append({"role": "assistant", "content": response.content})

    return next(block.text for block in response.content if block.type == "text")

# Compaction triggers automatically when context grows large
print(chat("Help me build a Python web scraper"))
print(chat("Add support for JavaScript-rendered pages"))
print(chat("Now add rate limiting and error handling"))
\`\`\`

---

## Stop Reasons

The \`stop_reason\` field in the response indicates why the model stopped generating:

| Value | Meaning |
|-------|---------|
| \`end_turn\` | Claude finished its response naturally |
| \`max_tokens\` | Hit the \`max_tokens\` limit \u2014 increase it or use streaming |
| \`stop_sequence\` | Hit a custom stop sequence |
| \`tool_use\` | Claude wants to call a tool \u2014 execute it and continue |
| \`pause_turn\` | Model paused and can be resumed (agentic flows) |
| \`refusal\` | Claude refused for safety reasons \u2014 check \`stop_details\` |

### Structured Stop Details

When \`stop_reason\` is \`"refusal"\`, the response includes a \`stop_details\` object with structured information about the refusal:

\`\`\`python
if response.stop_reason == "refusal" and response.stop_details:
    print(f"Category: {response.stop_details.category}")   # e.g. "cyber", "bio", "reasoning_extraction", "frontier_llm", or None \u2014 see docs for the full set
    print(f"Explanation: {response.stop_details.explanation}")
\`\`\`

### Refusal Fallbacks ({{FABLE_NAME}}) \u2014 opt in by default

Fallbacks are **opt-in**: without them a refused request simply stops. Include the server-side \`fallbacks\` parameter in \`{{FABLE_ID}}\` code by default \u2014 on a policy decline the API re-runs the same request on the fallback model inside the same call. A decline before any output isn't billed (a mid-stream decline bills the streamed partial); the rescue bills at the fallback model's own rates, with cache repricing applied automatically.

\`\`\`python
response = client.beta.messages.create(
    model="{{FABLE_ID}}",
    max_tokens=16000,
    betas=["server-side-fallback-2026-06-01"],
    fallbacks=[{"model": "{{OPUS_ID}}"}],
    messages=[{"role": "user", "content": "..."}],
)

# Switch points: one fallback block per model that ran and declined this turn
for block in response.content:
    if block.type == "fallback":
        print(f"{block.from_.model} declined; {block.to.model} continued")

# Served-by signal \u2014 covers sticky turns, which carry no fallback block.
# Pair with stop_reason: the fallback model can itself refuse.
fallback_ran = any(
    entry.type == "fallback_message" for entry in response.usage.iterations or []
)
if fallback_ran and response.stop_reason != "refusal":
    print(f"Served by {response.model}")
\`\`\`

A \`stop_reason: "refusal"\` on the final response means the whole chain refused. The header must be exactly \`server-side-fallback-2026-06-01\`; the parameter is rejected on the Batches API and unavailable on Amazon Bedrock, Vertex AI, and Microsoft Foundry \u2014 register the client-side \`BetaRefusalFallbackMiddleware\` on the client there instead. Full semantics (sticky routing, billing, streaming, echoing fallback turns back): \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}} \u2192 \`refusal\` stop reason.

---

## Cost Optimization Strategies

### 1. Use Prompt Caching for Repeated Context

\`\`\`python
# Automatic caching (simplest \u2014 caches the last cacheable block)
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    cache_control={"type": "ephemeral"},
    system=large_document_text,  # e.g., 50KB of context
    messages=[{"role": "user", "content": "Summarize the key points"}]
)

# First request: full cost
# Subsequent requests: ~90% cheaper for cached portion
\`\`\`

### 2. Choose the Right Model

\`\`\`python
# Default to Opus for most tasks
response = client.messages.create(
    model="{{OPUS_ID}}",  # $5.00/$25.00 per 1M tokens
    max_tokens=16000,
    messages=[{"role": "user", "content": "Explain quantum computing"}]
)

# Use Sonnet for high-volume production workloads
standard_response = client.messages.create(
    model="{{SONNET_ID}}",  # $3.00/$15.00 per 1M tokens
    max_tokens=16000,
    messages=[{"role": "user", "content": "Summarize this document"}]
)

# Use Haiku only for simple, speed-critical tasks
simple_response = client.messages.create(
    model="{{HAIKU_ID}}",  # $1.00/$5.00 per 1M tokens
    max_tokens=256,
    messages=[{"role": "user", "content": "Classify this as positive or negative"}]
)
\`\`\`

### 3. Use Token Counting Before Requests

\`\`\`python
count_response = client.messages.count_tokens(
    model="{{OPUS_ID}}",
    messages=messages,
    system=system
)

estimated_input_cost = count_response.input_tokens * 0.000005  # $5/1M tokens
print(f"Estimated input cost: \${estimated_input_cost:.4f}")
\`\`\`

---

## Retry with Exponential Backoff

> **Note:** The Anthropic SDK automatically retries rate limit (429) and server errors (5xx) with exponential backoff. You can configure this with \`max_retries\` (default: 2). Only implement custom retry logic if you need behavior beyond what the SDK provides.

\`\`\`python
import time
import random
import anthropic

def call_with_retry(
    client: anthropic.Anthropic,
    max_retries: int = 5,
    base_delay: float = 1.0,
    max_delay: float = 60.0,
    **kwargs
):
    """Call the API with exponential backoff retry."""
    last_exception = None

    for attempt in range(max_retries):
        try:
            return client.messages.create(**kwargs)
        except anthropic.RateLimitError as e:
            last_exception = e
        except anthropic.APIStatusError as e:
            if e.status_code >= 500:
                last_exception = e
            else:
                raise  # Client errors (4xx except 429) should not be retried

        delay = min(base_delay * (2 ** attempt) + random.uniform(0, 1), max_delay)
        print(f"Retry {attempt + 1}/{max_retries} after {delay:.1f}s")
        time.sleep(delay)

    raise last_exception
\`\`\`
`;
  var j1c = () => {};
  var G1c = `# Streaming \u2014 Python

## Quick Start

\`\`\`python
with client.messages.stream(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    messages=[{"role": "user", "content": "Write a story"}]
) as stream:
    for text in stream.text_stream:
        print(text, end="", flush=True)
\`\`\`

### Async

\`\`\`python
async with async_client.messages.stream(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    messages=[{"role": "user", "content": "Write a story"}]
) as stream:
    async for text in stream.text_stream:
        print(text, end="", flush=True)
\`\`\`

### Low-level: \`stream=True\`

\`messages.stream()\` (above) is the recommended helper \u2014 it accumulates state and exposes \`text_stream\` / \`get_final_message()\`. If you only need the raw event iterator and want lower memory use, pass \`stream=True\` to \`messages.create()\` instead:

\`\`\`python
for event in client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    messages=[{"role": "user", "content": "Write a story"}],
    stream=True,
):
    print(event.type)
\`\`\`

No final-message accumulation is done for you in this form.

---

## Handling Different Content Types

Claude may return text, thinking blocks, or tool use. Handle each appropriately:

> **Fable 5 / Opus 4.8 / Opus 4.7 / Opus 4.6:** Use \`thinking: {type: "adaptive"}\`. On older models, use \`thinking: {type: "enabled", budget_tokens: N}\` instead.

\`\`\`python
with client.messages.stream(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    thinking={"type": "adaptive", "display": "summarized"},  # display opt-in: default is omitted (empty thinking text) on Fable 5 / Mythos 5 / Opus 4.8 / 4.7
    messages=[{"role": "user", "content": "Analyze this problem"}]
) as stream:
    for event in stream:
        if event.type == "content_block_start":
            if event.content_block.type == "thinking":
                print("\\n[Thinking...]")
            elif event.content_block.type == "text":
                print("\\n[Response:]")

        elif event.type == "content_block_delta":
            if event.delta.type == "thinking_delta":
                print(event.delta.thinking, end="", flush=True)
            elif event.delta.type == "text_delta":
                print(event.delta.text, end="", flush=True)
\`\`\`

---

## Streaming with Tool Use

The Python tool runner currently returns complete messages. Use streaming for individual API calls within a manual loop if you need per-token streaming with tools:

\`\`\`python
with client.messages.stream(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    tools=tools,
    messages=messages
) as stream:
    for text in stream.text_stream:
        print(text, end="", flush=True)

    response = stream.get_final_message()
    # Continue with tool execution if response.stop_reason == "tool_use"
\`\`\`

---

## Getting the Final Message

\`\`\`python
with client.messages.stream(
    model="{{OPUS_ID}}",
    max_tokens=64000,
    messages=[{"role": "user", "content": "Hello"}]
) as stream:
    for text in stream.text_stream:
        print(text, end="", flush=True)

    # Get full message after streaming
    final_message = stream.get_final_message()
    print(f"\\n\\nTokens used: {final_message.usage.output_tokens}")
\`\`\`

---

## Streaming with Progress Updates

\`\`\`python
def stream_with_progress(client, **kwargs):
    """Stream a response with progress updates."""
    total_tokens = 0
    content_parts = []

    with client.messages.stream(**kwargs) as stream:
        for event in stream:
            if event.type == "content_block_delta":
                if event.delta.type == "text_delta":
                    text = event.delta.text
                    content_parts.append(text)
                    print(text, end="", flush=True)

            elif event.type == "message_delta":
                if event.usage and event.usage.output_tokens is not None:
                    total_tokens = event.usage.output_tokens

        final_message = stream.get_final_message()

    print(f"\\n\\n[Tokens used: {total_tokens}]")
    return "".join(content_parts)
\`\`\`

---

## Error Handling in Streams

\`\`\`python
try:
    with client.messages.stream(
        model="{{OPUS_ID}}",
        max_tokens=64000,
        messages=[{"role": "user", "content": "Write a story"}]
    ) as stream:
        for text in stream.text_stream:
            print(text, end="", flush=True)
except anthropic.APIConnectionError:
    print("\\nConnection lost. Please retry.")
except anthropic.RateLimitError:
    print("\\nRate limited. Please wait and retry.")
except anthropic.APIStatusError as e:
    print(f"\\nAPI error: {e.status_code}")
\`\`\`

---

## Stream Event Types

| Event Type            | Description                 | When it fires                     |
| --------------------- | --------------------------- | --------------------------------- |
| \`message_start\`       | Contains message metadata   | Once at the beginning             |
| \`content_block_start\` | New content block beginning | When a text/tool_use block starts |
| \`content_block_delta\` | Incremental content update  | For each token/chunk              |
| \`content_block_stop\`  | Content block complete      | When a block finishes             |
| \`message_delta\`       | Message-level updates       | Contains \`stop_reason\`, usage     |
| \`message_stop\`        | Message complete            | Once at the end                   |

## Best Practices

1. **Always flush output** \u2014 Use \`flush=True\` to show tokens immediately
2. **Handle partial responses** \u2014 If the stream is interrupted, you may have incomplete content
3. **Track token usage** \u2014 The \`message_delta\` event contains usage information
4. **Use timeouts** \u2014 Set appropriate timeouts for your application
5. **Default to streaming** \u2014 Use \`.get_final_message()\` to get the complete response even when streaming, giving you timeout protection without needing to handle individual events
6. **Large \`max_tokens\` without streaming raises \`ValueError\`** \u2014 The SDK refuses non-streaming requests it estimates will exceed ~10 minutes (idle connections drop). Pass \`stream=True\` / use \`messages.stream()\`, or explicitly override \`timeout\`, to suppress the guard.
`;
  var W1c = () => {};
  var z1c = `# Tool Use \u2014 Python

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Runner (Recommended)

**Beta:** The tool runner is in beta in the Python SDK.

Use the \`@beta_tool\` decorator to define tools as typed functions, then pass them to \`client.beta.messages.tool_runner()\`:

\`\`\`python
import anthropic
from anthropic import beta_tool

client = anthropic.Anthropic()

@beta_tool
def get_weather(location: str, unit: str = "celsius") -> str:
    """Get current weather for a location.

    Args:
        location: City and state, e.g., San Francisco, CA.
        unit: Temperature unit, either "celsius" or "fahrenheit".
    """
    # Your implementation here
    return f"72\xB0F and sunny in {location}"

# The tool runner handles the agentic loop automatically
runner = client.beta.messages.tool_runner(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    tools=[get_weather],
    messages=[{"role": "user", "content": "What's the weather in Paris?"}],
)

# Each iteration yields a BetaMessage; iteration stops when Claude is done
for message in runner:
    print(message)
\`\`\`

For async usage, use \`@beta_async_tool\` with \`async def\` functions.

**Key benefits of the tool runner:**

- No manual loop \u2014 the SDK handles calling tools and feeding results back
- Type-safe tool inputs via decorators
- Tool schemas are generated automatically from function signatures
- Iteration stops automatically when Claude has no more tool calls

---

## MCP Tool Conversion Helpers

**Beta.** Convert [MCP (Model Context Protocol)](https://modelcontextprotocol.io/) tools, prompts, and resources to Anthropic API types for use with the tool runner. Requires \`pip install anthropic[mcp]\` (Python 3.10+).

> **Note:** The Claude API also supports an \`mcp_servers\` parameter that lets Claude connect directly to remote MCP servers. Use these helpers instead when you need local MCP servers, prompts, resources, or more control over the MCP connection.

### MCP Tools with Tool Runner

\`\`\`python
from anthropic import AsyncAnthropic
from anthropic.lib.tools.mcp import async_mcp_tool
from mcp import ClientSession
from mcp.client.stdio import stdio_client, StdioServerParameters

client = AsyncAnthropic()

async with stdio_client(StdioServerParameters(command="mcp-server")) as (read, write):
    async with ClientSession(read, write) as mcp_client:
        await mcp_client.initialize()

        tools_result = await mcp_client.list_tools()
        # tool_runner is sync \u2014 returns the runner, not a coroutine
        runner = client.beta.messages.tool_runner(
            model="{{OPUS_ID}}",
            max_tokens=16000,
            messages=[{"role": "user", "content": "Use the available tools"}],
            tools=[async_mcp_tool(t, mcp_client) for t in tools_result.tools],
        )
        async for message in runner:
            print(message)
\`\`\`

For sync usage, use \`mcp_tool\` instead of \`async_mcp_tool\`.

### MCP Prompts

\`\`\`python
from anthropic.lib.tools.mcp import mcp_message

prompt = await mcp_client.get_prompt(name="my-prompt")
response = await client.beta.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[mcp_message(m) for m in prompt.messages],
)
\`\`\`

### MCP Resources as Content

\`\`\`python
from anthropic.lib.tools.mcp import mcp_resource_to_content

resource = await mcp_client.read_resource(uri="file:///path/to/doc.txt")
response = await client.beta.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": [
            mcp_resource_to_content(resource),
            {"type": "text", "text": "Summarize this document"},
        ],
    }],
)
\`\`\`

### Upload MCP Resources as Files

\`\`\`python
from anthropic.lib.tools.mcp import mcp_resource_to_file

resource = await mcp_client.read_resource(uri="file:///path/to/data.json")
uploaded = await client.beta.files.upload(file=mcp_resource_to_file(resource))
\`\`\`

Conversion functions raise \`UnsupportedMCPValueError\` if an MCP value cannot be converted (e.g., unsupported content types like audio, unsupported MIME types).

---

## Manual Agentic Loop

Use this when you need fine-grained control over the loop (e.g., custom logging, conditional tool execution, human-in-the-loop approval):

\`\`\`python
import anthropic

client = anthropic.Anthropic()
tools = [...]  # Your tool definitions
messages = [{"role": "user", "content": user_input}]

# Agentic loop: keep going until Claude stops calling tools
while True:
    response = client.messages.create(
        model="{{OPUS_ID}}",
        max_tokens=16000,
        tools=tools,
        messages=messages
    )

    # If Claude is done (no more tool calls), break
    if response.stop_reason == "end_turn":
        break

    # Server-side tool hit iteration limit; re-send to continue
    if response.stop_reason == "pause_turn":
        messages = [
            {"role": "user", "content": user_input},
            {"role": "assistant", "content": response.content},
        ]
        continue

    # Extract tool use blocks from the response
    tool_use_blocks = [b for b in response.content if b.type == "tool_use"]

    # Append assistant's response (including tool_use blocks)
    messages.append({"role": "assistant", "content": response.content})

    # Execute each tool and collect results
    tool_results = []
    for tool in tool_use_blocks:
        result = execute_tool(tool.name, tool.input)  # Your implementation
        tool_results.append({
            "type": "tool_result",
            "tool_use_id": tool.id,  # Must match the tool_use block's id
            "content": result
        })

    # Append tool results as a user message
    messages.append({"role": "user", "content": tool_results})

# Final response text
final_text = next(b.text for b in response.content if b.type == "text")
\`\`\`

---

## Handling Tool Results

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    tools=tools,
    messages=[{"role": "user", "content": "What's the weather in Paris?"}]
)

for block in response.content:
    if block.type == "tool_use":
        tool_name = block.name
        tool_input = block.input
        tool_use_id = block.id

        result = execute_tool(tool_name, tool_input)

        followup = client.messages.create(
            model="{{OPUS_ID}}",
            max_tokens=16000,
            tools=tools,
            messages=[
                {"role": "user", "content": "What's the weather in Paris?"},
                {"role": "assistant", "content": response.content},
                {
                    "role": "user",
                    "content": [{
                        "type": "tool_result",
                        "tool_use_id": tool_use_id,
                        "content": result
                    }]
                }
            ]
        )
\`\`\`

---

## Multiple Tool Calls

\`\`\`python
tool_results = []

for block in response.content:
    if block.type == "tool_use":
        result = execute_tool(block.name, block.input)
        tool_results.append({
            "type": "tool_result",
            "tool_use_id": block.id,
            "content": result
        })

# Send all results back at once
if tool_results:
    followup = client.messages.create(
        model="{{OPUS_ID}}",
        max_tokens=16000,
        tools=tools,
        messages=[
            *previous_messages,
            {"role": "assistant", "content": response.content},
            {"role": "user", "content": tool_results}
        ]
    )
\`\`\`

---

## Error Handling in Tool Results

\`\`\`python
tool_result = {
    "type": "tool_result",
    "tool_use_id": tool_use_id,
    "content": "Error: Location 'xyz' not found. Please provide a valid city name.",
    "is_error": True
}
\`\`\`

---

## Tool Choice

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    tools=tools,
    tool_choice={"type": "tool", "name": "get_weather"},  # Force specific tool
    messages=[{"role": "user", "content": "What's the weather in Paris?"}]
)
\`\`\`

---

## Code Execution

### Basic Usage

\`\`\`python
import anthropic

client = anthropic.Anthropic()

response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": "Calculate the mean and standard deviation of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"
    }],
    tools=[{
        "type": "code_execution_20260120",
        "name": "code_execution"
    }]
)

for block in response.content:
    if block.type == "text":
        print(block.text)
    elif block.type == "bash_code_execution_tool_result":
        print(f"stdout: {block.content.stdout}")
\`\`\`

### Upload Files for Analysis

\`\`\`python
# 1. Upload a file
uploaded = client.beta.files.upload(file=open("sales_data.csv", "rb"))

# 2. Pass to code execution via container_upload block
# Code execution is GA; Files API is still beta (pass via extra_headers)
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    extra_headers={"anthropic-beta": "files-api-2025-04-14"},
    messages=[{
        "role": "user",
        "content": [
            {"type": "text", "text": "Analyze this sales data. Show trends and create a visualization."},
            {"type": "container_upload", "file_id": uploaded.id}
        ]
    }],
    tools=[{"type": "code_execution_20260120", "name": "code_execution"}]
)
\`\`\`

### Retrieve Generated Files

\`\`\`python
import os

OUTPUT_DIR = "./claude_outputs"
os.makedirs(OUTPUT_DIR, exist_ok=True)

for block in response.content:
    if block.type == "bash_code_execution_tool_result":
        result = block.content
        if result.type == "bash_code_execution_result" and result.content:
            for file_ref in result.content:
                if file_ref.type == "bash_code_execution_output":
                    metadata = client.beta.files.retrieve_metadata(file_ref.file_id)
                    file_content = client.beta.files.download(file_ref.file_id)
                    # Use basename to prevent path traversal; validate result
                    safe_name = os.path.basename(metadata.filename)
                    if not safe_name or safe_name in (".", ".."):
                        print(f"Skipping invalid filename: {metadata.filename}")
                        continue
                    output_path = os.path.join(OUTPUT_DIR, safe_name)
                    file_content.write_to_file(output_path)
                    print(f"Saved: {output_path}")
\`\`\`

### Container Reuse

\`\`\`python
# First request: set up environment
response1 = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{"role": "user", "content": "Install tabulate and create data.json with sample data"}],
    tools=[{"type": "code_execution_20260120", "name": "code_execution"}]
)

# Get container ID from response
container_id = response1.container.id

# Second request: reuse the same container
response2 = client.messages.create(
    container=container_id,
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{"role": "user", "content": "Read data.json and display as a formatted table"}],
    tools=[{"type": "code_execution_20260120", "name": "code_execution"}]
)
\`\`\`

### Response Structure

\`\`\`python
for block in response.content:
    if block.type == "text":
        print(block.text)  # Claude's explanation
    elif block.type == "server_tool_use":
        print(f"Running: {block.name} - {block.input}")  # What Claude is doing
    elif block.type == "bash_code_execution_tool_result":
        result = block.content
        if result.type == "bash_code_execution_result":
            if result.return_code == 0:
                print(f"Output: {result.stdout}")
            else:
                print(f"Error: {result.stderr}")
        else:
            print(f"Tool error: {result.error_code}")
    elif block.type == "text_editor_code_execution_tool_result":
        print(f"File operation: {block.content}")
\`\`\`

---

## Memory Tool

### Basic Usage

\`\`\`python
import anthropic

client = anthropic.Anthropic()

response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{"role": "user", "content": "Remember that my preferred language is Python."}],
    tools=[{"type": "memory_20250818", "name": "memory"}],
)
\`\`\`

### SDK Memory Helper

Subclass \`BetaAbstractMemoryTool\`:

\`\`\`python
from anthropic.lib.tools import BetaAbstractMemoryTool

class MyMemoryTool(BetaAbstractMemoryTool):
    def view(self, command): ...
    def create(self, command): ...
    def str_replace(self, command): ...
    def insert(self, command): ...
    def delete(self, command): ...
    def rename(self, command): ...

memory = MyMemoryTool()

# Use with tool runner
runner = client.beta.messages.tool_runner(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    tools=[memory],
    messages=[{"role": "user", "content": "Remember my preferences"}],
)

for message in runner:
    print(message)
\`\`\`

For full implementation examples, use WebFetch:

- \`https://github.com/anthropics/anthropic-sdk-python/blob/main/examples/memory/basic.py\`

---

## Structured Outputs

### JSON Outputs (Pydantic \u2014 Recommended)

\`\`\`python
from pydantic import BaseModel
from typing import List
import anthropic

class ContactInfo(BaseModel):
    name: str
    email: str
    plan: str
    interests: List[str]
    demo_requested: bool

client = anthropic.Anthropic()

response = client.messages.parse(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": "Extract: Jane Doe (jane@co.com) wants Enterprise, interested in API and SDKs, wants a demo."
    }],
    output_format=ContactInfo,
)

# response.parsed_output is a validated ContactInfo instance
contact = response.parsed_output
print(contact.name)           # "Jane Doe"
print(contact.interests)      # ["API", "SDKs"]
\`\`\`

### Raw Schema

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{
        "role": "user",
        "content": "Extract info: John Smith (john@example.com) wants the Enterprise plan."
    }],
    output_config={
        "format": {
            "type": "json_schema",
            "schema": {
                "type": "object",
                "properties": {
                    "name": {"type": "string"},
                    "email": {"type": "string"},
                    "plan": {"type": "string"},
                    "demo_requested": {"type": "boolean"}
                },
                "required": ["name", "email", "plan", "demo_requested"],
                "additionalProperties": False
            }
        }
    }
)

import json
# output_config.format guarantees the first block is text with valid JSON
text = next(b.text for b in response.content if b.type == "text")
data = json.loads(text)
\`\`\`

### Strict Tool Use

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{"role": "user", "content": "Book a flight to Tokyo for 2 passengers on March 15"}],
    tools=[{
        "name": "book_flight",
        "description": "Book a flight to a destination",
        "strict": True,
        "input_schema": {
            "type": "object",
            "properties": {
                "destination": {"type": "string"},
                "date": {"type": "string", "format": "date"},
                "passengers": {"type": "integer", "enum": [1, 2, 3, 4, 5, 6, 7, 8]}
            },
            "required": ["destination", "date", "passengers"],
            "additionalProperties": False
        }
    }]
)
\`\`\`

### Using Both Together

\`\`\`python
response = client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=16000,
    messages=[{"role": "user", "content": "Plan a trip to Paris next month"}],
    output_config={
        "format": {
            "type": "json_schema",
            "schema": {
                "type": "object",
                "properties": {
                    "summary": {"type": "string"},
                    "next_steps": {"type": "array", "items": {"type": "string"}}
                },
                "required": ["summary", "next_steps"],
                "additionalProperties": False
            }
        }
    },
    tools=[{
        "name": "search_flights",
        "description": "Search for available flights",
        "strict": True,
        "input_schema": {
            "type": "object",
            "properties": {
                "destination": {"type": "string"},
                "date": {"type": "string", "format": "date"}
            },
            "required": ["destination", "date"],
            "additionalProperties": False
        }
    }]
)
\`\`\`
`;
  var V1c = () => {};
  var K1c = () => {};
  var X1c = `# Claude API \u2014 Ruby

> **Note:** The Ruby SDK supports the Claude API. A tool runner is available in beta via \`client.beta.messages.tool_runner()\`. Agent SDK is not yet available for Ruby.

## Installation

\`\`\`bash
gem install anthropic
\`\`\`

## Client Initialization

\`\`\`ruby
require "anthropic"

# Default (uses ANTHROPIC_API_KEY env var)
client = Anthropic::Client.new

# Explicit API key
client = Anthropic::Client.new(api_key: "your-api-key")
\`\`\`

---

## Basic Message Request

\`\`\`ruby
message = client.messages.create(
  model: :"{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    { role: "user", content: "What is the capital of France?" }
  ]
)
# content is an array of polymorphic block objects (TextBlock, ThinkingBlock,
# ToolUseBlock, ...). .type is a Symbol \u2014 compare with :text, not "text".
# .text raises NoMethodError on non-TextBlock entries.
message.content.each do |block|
  puts block.text if block.type == :text
end
\`\`\`

---

## Extended Thinking

> **Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, and Sonnet 4.6:** Use adaptive thinking. \`budget_tokens\` is removed on Fable 5, Opus 4.8, and 4.7 (400 if sent); deprecated on Opus 4.6 and Sonnet 4.6.
> **Older models:** Use \`thinking: { type: "enabled", budget_tokens: N }\` (must be < \`max_tokens\`, min 1024).

\`\`\`ruby
message = client.messages.create(
  model: :"{{OPUS_ID}}",
  max_tokens: 16000,
  thinking: { type: "adaptive" },
  messages: [{ role: "user", content: "Solve: 27 * 453" }]
)

message.content.each do |block|
  case block.type
  when :thinking then puts "Thinking: #{block.thinking}"
  when :text then puts "Response: #{block.text}"
  end
end
\`\`\`

---

## Prompt Caching

\`system_:\` (trailing underscore \u2014 avoids shadowing \`Kernel#system\`) takes an array of text blocks; set \`cache_control\` on the last block. Plain hashes work via the \`OrHash\` type alias. For placement patterns and the silent-invalidator audit checklist, see \`shared/prompt-caching.md\`.

\`\`\`ruby
message = client.messages.create(
  model: :"{{OPUS_ID}}",
  max_tokens: 16000,
  system_: [
    { type: "text", text: long_system_prompt, cache_control: { type: "ephemeral" } }
  ],
  messages: [{ role: "user", content: "Summarize the key points" }]
)
\`\`\`

For 1-hour TTL: \`cache_control: { type: "ephemeral", ttl: "1h" }\`. There's also a top-level \`cache_control:\` on \`messages.create\` that auto-places on the last cacheable block.

Verify hits via \`message.usage.cache_creation_input_tokens\` / \`message.usage.cache_read_input_tokens\`.

---

## Stop Details

When \`stop_reason\` is \`:refusal\`, the response includes structured \`stop_details\`:

\`\`\`ruby
if message.stop_reason == :refusal && message.stop_details
  puts "Category: #{message.stop_details.category}"     # e.g. :cyber, :bio, :reasoning_extraction, :frontier_llm, or nil \u2014 see docs for the full set
  puts "Explanation: #{message.stop_details.explanation}"
end
\`\`\`

**Refusal fallbacks ({{FABLE_NAME}}) \u2014 opt in by default.** Fallbacks are opt-in: without them a refused request simply stops. New \`{{FABLE_ID}}\` code should include the server-side \`fallbacks\` parameter (beta header \`server-side-fallback-2026-06-01\`, \`fallbacks: [{model: "{{OPUS_ID}}"}]\` on the beta messages call) by default. The exact Ruby binding (and the client-side middleware for providers without server-side support) is not documented here \u2014 WebFetch the Ruby SDK repo's \`examples/\` from \`shared/live-sources.md\`; full semantics in \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}} \u2192 \`refusal\` stop reason.

---

## Beta Features

\`betas:\` is only valid on \`client.beta.messages.create\`, not the non-beta path.

### Task budgets

\`\`\`ruby
response = client.beta.messages.create(
  model: :"{{OPUS_ID}}",
  max_tokens: 16000,
  output_config: { task_budget: { type: :tokens, total: 64_000 } },
  tools: [...],
  messages: [...],
  betas: ["task-budgets-2026-03-13"]
)
\`\`\`

---

## Error Type

\`APIStatusError\` exposes a \`.type\` field for programmatic error classification:

\`\`\`ruby
begin
  client.messages.create(...)
rescue Anthropic::Errors::APIStatusError => e
  puts e.type  # :rate_limit_error, :overloaded_error, etc.
end
\`\`\`
`;
  var J1c = () => {};
  var Z1c = `# Streaming \u2014 Ruby

## Streaming

\`\`\`ruby
stream = client.messages.stream(
  model: :"{{OPUS_ID}}",
  max_tokens: 64000,
  messages: [{ role: "user", content: "Write a haiku" }]
)

stream.text.each { |text| print(text) }
\`\`\`

---

`;
  var Q1c = () => {};
  var tLc = `# Tool Use \u2014 Ruby

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Use

The Ruby SDK supports tool use via raw JSON schema definitions and also provides a beta tool runner for automatic tool execution.

### Tool Runner (Beta)

\`\`\`ruby
class GetWeatherInput < Anthropic::BaseModel
  required :location, String, doc: "City and state, e.g. San Francisco, CA"
end

class GetWeather < Anthropic::BaseTool
  doc "Get the current weather for a location"

  input_schema GetWeatherInput

  def call(input)
    "The weather in #{input.location} is sunny and 72\xB0F."
  end
end

client.beta.messages.tool_runner(
  model: :"{{OPUS_ID}}",
  max_tokens: 16000,
  tools: [GetWeather.new],
  messages: [{ role: "user", content: "What's the weather in San Francisco?" }]
).each_message do |message|
  puts message.content
end
\`\`\`

### Manual Loop

See the [shared tool use concepts](../../shared/tool-use-concepts.md) for the tool definition format and agentic loop pattern.

---

`;
  var eLc = () => {};
  var nLc = () => {};
  var oLc = () => {};
  var aLc = `# Agent Design Patterns

This file covers decision heuristics for building agents on the Claude API: which primitives to reach for, how to design your tool surface, and how to manage context and cost over long runs. For per-tool mechanics and code examples, see \`tool-use-concepts.md\` and the language-specific folders.

---

## Model Parameters

| Parameter | When to use it | What to expect |
| --- | --- | --- |
| **Adaptive thinking** (\`thinking: {type: "adaptive"}\`) | When you want Claude to control when and how much to think. | Claude determines thinking depth per request and automatically interleaves thinking between tool calls. No token budget to tune. |
| **Effort** (\`output_config: {effort: ...}\`) | When adjusting the tradeoff between thoroughness and token efficiency. | Lower effort \u2192 fewer and more-consolidated tool calls, less preamble, terser confirmations. \`medium\` is often a favorable balance. Use \`max\` when correctness matters more than cost. |

See \`SKILL.md\` \xA7Thinking & Effort for model support and parameter details.

---

## Designing Your Tool Surface

### Bash vs. dedicated tools

Claude doesn't know your application's security boundary, approval policy, or UX surface. Claude emits tool calls; your harness handles them. The shape of those tool calls determines what the harness can do.

A **bash tool** gives Claude broad programmatic leverage \u2014 it can perform almost any action. But it gives the harness only an opaque command string, the same shape for every action. Promoting an action to a **dedicated tool** gives the harness an action-specific hook with typed arguments it can intercept, gate, render, or audit.

**When to promote an action to a dedicated tool:**

- **Security boundary.** Actions that require gating are natural candidates. Reversibility is a useful criterion: hard-to-reverse actions (external API calls, sending messages, deleting data) can be gated behind user confirmation. A \`send_email\` tool is easy to gate; \`bash -c "curl -X POST ..."\` is not.
- **Staleness checks.** A dedicated \`edit\` tool can reject writes if the file changed since Claude last read it. Bash can't enforce that invariant.
- **Rendering.** Some actions benefit from custom UI. Claude Code promotes question-asking to a tool so it can render as a modal, present options, and block the agent loop until answered.
- **Scheduling.** Read-only tools like \`glob\` and \`grep\` can be marked parallel-safe. When the same actions run through bash, the harness can't tell a parallel-safe \`grep\` from a parallel-unsafe \`git push\`, so it must serialize.

**Rule of thumb:** Start with bash for breadth. Promote to dedicated tools when you need to gate, render, audit, or parallelize the action.

---

## Anthropic-Provided Tools

| Tool | Side | When to use it | What to expect |
| --- | --- | --- | --- |
| **Bash** | Client | Claude needs to execute shell commands. | Claude emits commands; your harness executes them. Reference implementation provided. |
| **Text editor** | Client | Claude needs to read or edit files. | Claude views, creates, and edits files via your implementation. Reference implementation provided. |
| **Computer use** | Client or Server | Claude needs to interact with GUIs, web apps, or visual interfaces. | Claude takes screenshots and issues mouse/keyboard commands. Can be self-hosted (you run the environment) or Anthropic-hosted. |
| **Code execution** | Server | Claude needs to run code in a sandbox you don't want to manage. | Anthropic-hosted container with built-in file and bash sub-tools. No client-side execution. |
| **Web search / fetch** | Server | Claude needs information past its training cutoff (news, current events, recent docs) or the content of a specific URL. | Claude issues a query or URL; Anthropic executes it and returns results with citations. |
| **Memory** | Client | Claude needs to save context across sessions. | Claude reads/writes a \`/memories\` directory. You implement the storage backend. |

**Client-side** tools are defined by Anthropic (name, schema, Claude's usage pattern) but executed by your harness. Anthropic provides reference implementations. **Server-side** tools run entirely on Anthropic infrastructure \u2014 declare them in \`tools\` and Claude handles the rest.

---

## Composing Tool Calls: Programmatic Tool Calling

With standard tool use, each tool call is a round trip: Claude calls the tool, the result lands in Claude's context, Claude reasons about it, then calls the next tool. Three sequential actions (read profile \u2192 look up orders \u2192 check inventory) means three round trips. Each adds latency and tokens, and most of the intermediate data is never needed again.

**Programmatic tool calling (PTC)** lets Claude compose those calls into a script instead. The script runs in the code execution container. When the script calls a tool, the container pauses, the call is executed (client-side or server-side), and the result returns to the running code \u2014 not to Claude's context. The script processes it with normal control flow (loops, filters, branches). Only the script's final output returns to Claude.

| When to use it | What to expect |
| --- | --- |
| Many sequential tool calls, or large intermediate results you want filtered before they hit the context window. | Claude writes code that invokes tools as functions. Runs in the code execution container. Token cost scales with final output, not intermediate results. |

---

## Scaling the Tool and Instruction Set

| Feature | When to use it | What to expect |
| --- | --- | --- |
| **Tool search** | Many tools available, but only a few relevant per request. Don't want all schemas in context upfront. | Claude searches the tool set and loads only relevant schemas. Tool definitions are appended, not swapped \u2014 preserves cache (see Caching below). |
| **Skills** | Task-specific instructions Claude should load only when relevant. | Each skill is a folder with a \`SKILL.md\`. The skill's description sits in context by default; Claude reads the full file when the task calls for it. |

Both patterns keep the fixed context small and load detail on demand.

---

## Long-Running Agents: Managing Context

| Pattern | When to use it | What to expect |
| --- | --- | --- |
| **Context editing** | Context grows stale over many turns (old tool results, completed thinking). | Tool results and thinking blocks are cleared based on configurable thresholds. Keeps the transcript lean without summarizing. |
| **Compaction** | Conversation likely to reach or exceed the context window limit. | Earlier context is summarized into a compaction block server-side. See \`SKILL.md\` \xA7Compaction for the critical \`response.content\` handling. |
| **Memory** | State must persist across sessions (not just within one conversation). | Claude reads/writes files in a memory directory. Survives process restarts. |

**Choosing between them:** Context editing and compaction operate within a session \u2014 editing prunes stale turns, compaction summarizes when you're near the limit. Memory is for cross-session persistence. Many long-running agents use all three.

---

## Caching for Agents

**Read \`prompt-caching.md\` first.** It covers the prefix-match invariant, breakpoint placement, the silent-invalidator audit, and why changing tools or models mid-session breaks the cache. This section covers only the agent-specific workarounds for those constraints.

| Constraint (from \`prompt-caching.md\`) | Agent-specific workaround |
| --- | --- |
| Editing the system prompt mid-session invalidates the cache. | Append a \`{"role": "system", ...}\` message to \`messages[]\` instead (no beta header; on supporting models \u2014 see \`prompt-caching.md\` \xA7 Mid-conversation system messages). The cached prefix stays intact, and the model treats it as an operator-authority instruction rather than user text. On models that don't support it, fall back to a \`<system-reminder>\` text block in the user turn. |
| Switching models mid-session invalidates the cache. | Spawn a **subagent** with the cheaper model for the sub-task; keep the main loop on one model. |
| Adding/removing tools mid-session invalidates the cache. | Use **tool search** for dynamic discovery \u2014 it appends tool schemas rather than swapping them, so the existing prefix is preserved. |

For multi-turn breakpoint placement, use top-level auto-caching \u2014 see \`prompt-caching.md\` \xA7Placement patterns.

---

For live documentation on any of these features, see \`live-sources.md\`.
`;
  var iLc = () => {};
  var lLc = () => {};
  var dLc = `# Claude Platform on AWS

**Anthropic-operated** access to the Claude Developer Platform through AWS infrastructure \u2014 SigV4 authentication, AWS IAM access control, and AWS Marketplace billing. Because Anthropic operates it, **the API surface matches first-party with same-day parity** \u2014 for per-feature exceptions, see \`shared/platform-availability.md\` (the single source of truth; do not rely on an inline exception list here). Model IDs are the bare first-party strings (\`{{OPUS_ID}}\`, \`{{SONNET_ID}}\`) \u2014 **no provider prefix**.

> **Not the same as Amazon Bedrock.** Bedrock is partner-operated (AWS runs the service; release schedules vary, feature subset, \`anthropic.\`-prefixed model IDs). Claude Platform on AWS and Bedrock coexist; pick by whether you need AWS-native IAM/billing with full Anthropic API parity (this page) vs. Bedrock's own ecosystem.

---

## Client & install

| Language | Install | Client |
|---|---|---|
| Python | \`pip install -U "anthropic[aws]"\` | \`from anthropic import AnthropicAWS\` \u2192 \`AnthropicAWS()\` |
| TypeScript | \`npm install @anthropic-ai/aws-sdk\` | \`import AnthropicAws from "@anthropic-ai/aws-sdk"\` \u2192 \`new AnthropicAws()\` |
| Go | \`go get github.com/anthropics/anthropic-sdk-go\` | \`import anthropicaws "github.com/anthropics/anthropic-sdk-go/aws"\` \u2192 \`anthropicaws.NewClient(ctx, anthropicaws.ClientConfig{})\` |
| C# | \`dotnet add package Anthropic.Aws\` | \`new AnthropicAwsClient()\` |
| Java | See SDK repo in \`shared/live-sources.md\` | See SDK repo in \`shared/live-sources.md\` |
| Ruby | \`gem install anthropic aws-sdk-core\` | See SDK repo in \`shared/live-sources.md\` |
| PHP | \`composer require anthropic-ai/sdk aws/aws-sdk-php\` | See SDK repo in \`shared/live-sources.md\` |

After construction, **use the client exactly as you would \`Anthropic()\`** \u2014 \`client.messages.create(...)\`, \`client.beta.sessions.*\`, etc., with bare model IDs.

\`\`\`python
from anthropic import AnthropicAWS

client = AnthropicAWS()  # region + workspace_id from env; see below
client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=1024,
    messages=[{"role": "user", "content": "Hello"}],
)
\`\`\`

---

## Required configuration

Two values must be available (constructor args or environment) \u2014 **there is no default fallback** for either:

| Value | Env var | Notes |
|---|---|---|
| AWS region | \`AWS_REGION\` | Required. Unlike \`AnthropicBedrock\`, there is no \`us-east-1\` fallback. |
| Workspace ID | \`ANTHROPIC_AWS_WORKSPACE_ID\` | Required. Routes requests to your Claude workspace. |

Endpoint pattern: \`https://aws-external-anthropic.{region}.api.aws/v1/...\`. Requests are SigV4-signed with service name \`aws-external-anthropic\`.

## Authentication

The client resolves AWS credentials via the standard precedence chain: explicit constructor args \u2192 environment (\`AWS_ACCESS_KEY_ID\`/\`AWS_SECRET_ACCESS_KEY\`/\`AWS_SESSION_TOKEN\`) \u2192 shared profile \u2192 assumed role / instance metadata.

**Short-term API keys** are also supported for cases where SigV4 isn't practical (e.g., browser, simple scripts). Mint one with the per-language token-generator package; pass it as \`api_key\` on the client. Lifetime is the **lesser of** the requested duration, the underlying credential's expiry, and **12 hours**. For package names and IAM details, WebFetch the Claude Platform on AWS page in \`shared/live-sources.md\`.

---

## What to tell users

- Treat it as first-party: every section of this skill applies unchanged. Do **not** apply Bedrock's feature-availability mask.
- Model IDs are bare (\`{{OPUS_ID}}\`). Do **not** add an \`anthropic.\` prefix.
- A missing region or \`workspace_id\` throws at client-construction time (no request is sent). A **403** means the request reached the server \u2014 check for a **wrong** \`workspace_id\` or a missing IAM action on the principal. See the IAM actions reference in \`shared/live-sources.md\`.
`;
  var uLc = () => {};
  var pLc = () => {};
  var hLc = `# Live Documentation Sources

This file contains WebFetch URLs for fetching current information from platform.claude.com and Agent SDK repositories. Use these when users need the latest data that may have changed since the cached content was last updated.

## When to Use WebFetch

- User explicitly asks for "latest" or "current" information
- Cached data seems incorrect
- User asks about features not covered in cached content
- User needs specific API details or examples

## Claude API Documentation URLs

### Models & Pricing

| Topic           | URL                                                                          | Extraction Prompt                                                               |
| --------------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| Models Overview | \`https://platform.claude.com/docs/en/about-claude/models/overview.md\`        | "Extract current model IDs, context windows, and pricing for all Claude models" |
| Migration Guide | \`https://platform.claude.com/docs/en/about-claude/models/migration-guide.md\` | "Extract breaking changes, deprecated parameters, and per-model migration steps when moving to a newer Claude model" |
| Introducing Claude Fable 5 | \`https://platform.claude.com/docs/en/about-claude/models/introducing-claude-fable-5.md\` | "Extract capabilities, API changes, and availability stages for Claude Fable 5 and Claude Mythos 5" |
| Pricing         | \`https://platform.claude.com/docs/en/pricing.md\`                             | "Extract current pricing per million tokens for input and output"               |

### Core Features

| Topic             | URL                                                                          | Extraction Prompt                                                                      |
| ----------------- | ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Extended Thinking | \`https://platform.claude.com/docs/en/build-with-claude/extended-thinking.md\` | "Extract extended thinking parameters, budget_tokens requirements, and usage examples" |
| Adaptive Thinking | \`https://platform.claude.com/docs/en/build-with-claude/adaptive-thinking.md\` | "Extract adaptive thinking setup, effort levels, and {{OPUS_NAME}} usage examples"         |
| Effort Parameter  | \`https://platform.claude.com/docs/en/build-with-claude/effort.md\`            | "Extract effort levels, cost-quality tradeoffs, and interaction with thinking"        |
| Tool Use          | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/overview.md\`  | "Extract tool definition schema, tool_choice options, and handling tool results"       |
| Streaming         | \`https://platform.claude.com/docs/en/build-with-claude/streaming.md\`         | "Extract streaming event types, SDK examples, and best practices"                      |
| Prompt Caching    | \`https://platform.claude.com/docs/en/build-with-claude/prompt-caching.md\`    | "Extract cache_control usage, pricing benefits, and implementation examples"           |

### Media & Files

| Topic       | URL                                                                    | Extraction Prompt                                                 |
| ----------- | ---------------------------------------------------------------------- | ----------------------------------------------------------------- |
| Vision      | \`https://platform.claude.com/docs/en/build-with-claude/vision.md\`      | "Extract supported image formats, size limits, and code examples" |
| PDF Support | \`https://platform.claude.com/docs/en/build-with-claude/pdf-support.md\` | "Extract PDF handling capabilities, limits, and examples"         |

### API Operations

| Topic            | URL                                                                         | Extraction Prompt                                                                                       |
| ---------------- | --------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| Batch Processing | \`https://platform.claude.com/docs/en/build-with-claude/batch-processing.md\` | "Extract batch API endpoints, request format, and polling for results"                                  |
| Files API        | \`https://platform.claude.com/docs/en/build-with-claude/files.md\`            | "Extract file upload, download, and referencing in messages, including supported types and beta header" |
| Token Counting   | \`https://platform.claude.com/docs/en/build-with-claude/token-counting.md\`   | "Extract token counting API usage and examples"                                                         |
| Rate Limits      | \`https://platform.claude.com/docs/en/api/rate-limits.md\`                    | "Extract current rate limits by tier and model"                                                         |
| Errors           | \`https://platform.claude.com/docs/en/api/errors.md\`                         | "Extract HTTP error codes, meanings, and retry guidance"                                                |
| Amazon Bedrock   | \`https://platform.claude.com/docs/en/build-with-claude/claude-on-amazon-bedrock.md\` | "Extract the AnthropicBedrockMantle client per language, \`anthropic.\`-prefixed model IDs, auth paths, feature availability, and regions" |
| Claude Platform on AWS | \`https://platform.claude.com/docs/en/build-with-claude/claude-platform-on-aws.md\` | "Extract the AnthropicAWS client per language, SigV4 auth, credential precedence, short-term API keys, workspace_id, and region requirements" |
| Claude Platform on AWS \u2014 IAM actions | \`https://platform.claude.com/docs/en/api/claude-platform-on-aws-iam-actions.md\` | "Extract the IAM action names, resource ARNs, and policy examples required for each API capability" |

### Tools

| Topic          | URL                                                                                    | Extraction Prompt                                                                        |
| -------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| Code Execution | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/code-execution-tool.md\` | "Extract code execution tool setup, file upload, container reuse, and response handling" |
| Computer Use   | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/computer-use.md\`        | "Extract computer use tool setup, capabilities, and implementation examples"             |
| Bash Tool      | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/bash-tool.md\`           | "Extract bash tool schema, reference implementation, and security considerations"        |
| Text Editor    | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/text-editor-tool.md\`    | "Extract text editor tool commands, schema, and reference implementation"                |
| Memory Tool    | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/memory-tool.md\`         | "Extract memory tool commands, directory structure, and implementation patterns"         |
| Tool Search    | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/tool-search-tool.md\`    | "Extract tool search setup, when to use, and cache interaction"                          |
| Programmatic Tool Calling | \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/programmatic-tool-calling.md\` | "Extract PTC setup, script execution model, and tool invocation from code"    |
| Skills         | \`https://platform.claude.com/docs/en/agents-and-tools/skills.md\`                       | "Extract skill folder structure, SKILL.md format, and loading behavior"                  |

### Advanced Features

| Topic              | URL                                                                           | Extraction Prompt                                   |
| ------------------ | ----------------------------------------------------------------------------- | --------------------------------------------------- |
| Structured Outputs | \`https://platform.claude.com/docs/en/build-with-claude/structured-outputs.md\` | "Extract output_config.format usage and schema enforcement"                           |
| Compaction         | \`https://platform.claude.com/docs/en/build-with-claude/compaction.md\`         | "Extract compaction setup, trigger config, and streaming with compaction"             |
| Context Editing    | \`https://platform.claude.com/docs/en/build-with-claude/context-editing.md\`    | "Extract context editing thresholds, what gets cleared, and configuration"            |
| Citations          | \`https://platform.claude.com/docs/en/build-with-claude/citations.md\`          | "Extract citation format and implementation"        |
| Context Windows    | \`https://platform.claude.com/docs/en/build-with-claude/context-windows.md\`    | "Extract context window sizes and token management" |

### Managed Agents

Use these when a managed-agents binding, behavior, or wire-level detail isn't covered in the cached \`shared/managed-agents-*.md\` concept files or in \`{lang}/managed-agents/README.md\`.

| Topic                 | URL                                                                              | Extraction Prompt                                                                               |
| --------------------- | -------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| Overview              | \`https://platform.claude.com/docs/en/managed-agents/overview.md\`                 | "Extract the high-level architecture and how agents/sessions/environments/vaults fit together" |
| Quickstart            | \`https://platform.claude.com/docs/en/managed-agents/quickstart.md\`               | "Extract the minimal end-to-end agent \u2192 environment \u2192 session \u2192 stream code path"              |
| Agent Setup           | \`https://platform.claude.com/docs/en/managed-agents/agent-setup.md\`              | "Extract agent create/update/list-versions/archive lifecycle and parameters"                   |
| Define Outcomes       | \`https://platform.claude.com/docs/en/managed-agents/define-outcomes.md\`          | "Extract outcome definitions, evaluation hooks, and success criteria configuration"             |
| Sessions              | \`https://platform.claude.com/docs/en/managed-agents/sessions.md\`                 | "Extract session lifecycle, status transitions, idle/terminated semantics, and resume rules"    |
| Environments          | \`https://platform.claude.com/docs/en/managed-agents/environments.md\`             | "Extract environment config (cloud/networking), management endpoints, and reuse model"          |
| Self-Hosted Sandboxes | \`https://platform.claude.com/docs/en/managed-agents/self-hosted-sandboxes.md\`    | "Extract config:{type:self_hosted}, ANTHROPIC_ENVIRONMENT_KEY, EnvironmentWorker.run/run_one, beta_agent_toolset, ant beta:worker poll/run, webhook-driven wake" |
| Self-Hosted Sandboxes \u2014 Security | \`https://platform.claude.com/docs/en/managed-agents/self-hosted-sandboxes-security.md\` | "Extract what the customer owns (hardening, egress, key custody, trust boundaries) vs what Anthropic cannot do" |
| Events and Streaming  | \`https://platform.claude.com/docs/en/managed-agents/events-and-streaming.md\`     | "Extract event stream types, stream-first ordering, reconnect/dedupe, and steering patterns"    |
| Tools                 | \`https://platform.claude.com/docs/en/managed-agents/tools.md\`                    | "Extract built-in toolset, custom tool definitions, and tool result wire format"                |
| Files                 | \`https://platform.claude.com/docs/en/managed-agents/files.md\`                    | "Extract file upload, mount paths, session resources, and listing/downloading session outputs"  |
| Permission Policies   | \`https://platform.claude.com/docs/en/managed-agents/permission-policies.md\`      | "Extract permission policy types (allow/deny/confirm) and per-tool config"                     |
| Multi-Agent           | \`https://platform.claude.com/docs/en/managed-agents/multi-agent.md\`              | "Extract multi-agent composition patterns, sub-agent invocation, and result handoff"            |
| Observability         | \`https://platform.claude.com/docs/en/managed-agents/observability.md\`            | "Extract logging, tracing, and usage telemetry exposed by managed agents"                       |
| Webhooks              | \`https://platform.claude.com/docs/en/managed-agents/webhooks.md\`                 | "Extract webhook endpoint registration, HMAC signature verification, supported event types, and delivery semantics" |
| GitHub                | \`https://platform.claude.com/docs/en/managed-agents/github.md\`                   | "Extract github_repository resource shape, multi-repo mounting, and token rotation"             |
| MCP Connector         | \`https://platform.claude.com/docs/en/managed-agents/mcp-connector.md\`            | "Extract MCP server declaration on agents and vault-based credential injection at session"     |
| Vaults                | \`https://platform.claude.com/docs/en/managed-agents/vaults.md\`                   | "Extract vault create, credential add/rotate, OAuth refresh shape, and archive"                 |
| Skills                | \`https://platform.claude.com/docs/en/managed-agents/skills.md\`                   | "Extract skill packaging and loading model for managed agents"                                  |
| Memory                | \`https://platform.claude.com/docs/en/managed-agents/memory.md\`                   | "Extract memory resource shape, scoping, and lifecycle"                                         |
| Onboarding            | \`https://platform.claude.com/docs/en/managed-agents/onboarding.md\`               | "Extract first-run setup, prerequisites, and account/region requirements"                      |
| Cloud Containers      | \`https://platform.claude.com/docs/en/managed-agents/cloud-containers.md\`         | "Extract cloud container runtime, image config, and network/storage knobs"                     |
| Migration             | \`https://platform.claude.com/docs/en/managed-agents/migration.md\`                | "Extract migration paths from earlier APIs/preview shapes to GA managed agents"                 |

### Anthropic CLI

The \`ant\` CLI provides terminal access to the Claude API. Every API resource is exposed as a subcommand. It is one convenient way to create agents, environments, sessions, and other resources from version-controlled YAML, and to inspect responses interactively.

| Topic         | URL                                                     | Extraction Prompt                                                                                  |
| ------------- | ------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| Anthropic CLI | \`https://platform.claude.com/docs/en/api/sdks/cli.md\`   | "Extract CLI install, authentication, command structure, and the beta:agents/environments/sessions commands" |
| Authentication overview | \`https://platform.claude.com/docs/en/manage-claude/authentication.md\` | "Extract the credential options (API keys, interactive OAuth login, Workload Identity Federation) and when to use each" |
| WIF reference | \`https://platform.claude.com/docs/en/manage-claude/wif-reference.md\`  | "Extract credential precedence order, the profile configuration file schema, and the configuration directory layout" |

---

## Claude API SDK Repositories

WebFetch these when a binding (class, method, namespace, field) isn't covered in the cached \`{lang}/\` skill files or in the managed-agents docs above. The SDKs include beta managed-agents support for \`/v1/agents\`, \`/v1/sessions\`, \`/v1/environments\`, and related resources \u2014 search the repo for \`BetaManagedAgents\`, \`beta.agents\`, \`beta.sessions\`, or the equivalent namespace for that language.

| SDK        | URL                                                      | Extraction Prompt                                                                                                       |
| ---------- | -------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| Python     | \`https://github.com/anthropics/anthropic-sdk-python\`     | "Extract beta managed-agents namespaces, classes, and method signatures (\`client.beta.agents\`, \`client.beta.sessions\`)" |
| TypeScript | \`https://github.com/anthropics/anthropic-sdk-typescript\` | "Extract beta managed-agents namespaces, classes, and method signatures (\`client.beta.agents\`, \`client.beta.sessions\`)" |
| Java       | \`https://github.com/anthropics/anthropic-sdk-java\`       | "Extract beta managed-agents classes, builders, and method signatures (\`client.beta().agents()\`, \`BetaManagedAgents*\`)" |
| Go         | \`https://github.com/anthropics/anthropic-sdk-go\`         | "Extract beta managed-agents types and method signatures (\`client.Beta.Agents\`, \`BetaManagedAgents*\` event types)"      |
| Ruby       | \`https://github.com/anthropics/anthropic-sdk-ruby\`       | "Extract beta managed-agents methods and parameter shapes (\`client.beta.agents\`, \`client.beta.sessions\`)"               |
| C#         | \`https://github.com/anthropics/anthropic-sdk-csharp\`     | "Extract beta managed-agents classes and method signatures (NuGet package, \`BetaManagedAgents*\` types)"                 |
| PHP        | \`https://github.com/anthropics/anthropic-sdk-php\`        | "Extract beta managed-agents classes and method signatures (\`$client->beta->agents\`, \`BetaManagedAgents*\` params)"      |

Each SDK repo also ships runnable programs under \`examples/\` \u2014 including the refusal-fallback / \`fallbacks\` examples (client-side middleware registration, fallback state, server-side \`fallbacks\` param). Fetch those for exact per-language syntax instead of translating another language's example.

---

## Fallback Strategy

If WebFetch fails (network issues, URL changed):

1. Use cached content from the language-specific files (note the cache date)
2. Inform user the data may be outdated
3. Suggest they check platform.claude.com or the GitHub repos directly
`;
  var fLc = () => {};
  var gLc = () => {};
  var bLc = `# Managed Agents \u2014 Common Client Patterns

Patterns you'll write on the client side when driving a Managed Agent session, grounded in working SDK examples.

Code samples are TypeScript \u2014 other languages follow the same shape; see \`{lang}/managed-agents/README.md\` (cURL and C#: \`curl/managed-agents.md\`) for equivalents.

---

## 1. Lossless stream reconnect

**Problem:** SSE has no replay. If the connection drops mid-session, a naive reconnect re-opens the stream from "now" and you silently miss every event emitted in between.

**Solution:** on reconnect, fetch the full event history via \`events.list()\` *before* consuming the live stream, and dedupe on event ID as the live stream catches up.

\`\`\`ts
const seenEventIds = new Set<string>()
const stream = await client.beta.sessions.events.stream(session.id)

// Stream is now open and buffering server-side. Read history first.
for await (const event of client.beta.sessions.events.list(session.id)) {
  seenEventIds.add(event.id)
  handle(event)
}

// Tail the live stream. Dedupe only gates handle() \u2014 terminal checks must run
// even for already-seen events, or a terminal event that was in the history
// response gets skipped by \`continue\` and the loop never exits.
for await (const event of stream) {
  if (!seenEventIds.has(event.id)) {
    seenEventIds.add(event.id)
    handle(event)
  }
  if (event.type === 'session.status_terminated') break
  if (event.type === 'session.status_idle' && event.stop_reason.type !== 'requires_action') break
}
\`\`\`

---

## 2. \`processed_at\` \u2014 queued vs processed

Every event on the stream carries \`processed_at\` (ISO 8601). For client-sent events (\`user.message\`, \`user.interrupt\`, \`user.tool_confirmation\`, \`user.custom_tool_result\`) it's \`null\` when the event has been queued but not yet picked up by the agent, and populated once the agent processes it. The same event appears on the stream twice \u2014 once with \`processed_at: null\`, once with a timestamp.

\`\`\`ts
for await (const event of stream) {
  if (event.type === 'user.message') {
    if (event.processed_at == null) onQueued(event.id)
    else onProcessed(event.id, event.processed_at)
  }
}
\`\`\`

Use this to drive pending \u2192 acknowledged UI state for anything you send. How you map a locally-rendered optimistic message to the server-assigned \`event.id\` is application-specific (typically via the return value of \`events.send()\` or FIFO ordering).

---

## 3. Interrupt a running session

Send \`user.interrupt\` as a normal event. The session keeps running until it reaches a safe boundary, then goes idle.

\`\`\`ts
await client.beta.sessions.events.send(session.id, {
  events: [{ type: 'user.interrupt' }],
})

// Drain until the session is truly done \u2014 see Pattern 5 for the full gate.
for await (const event of stream) {
  if (event.type === 'session.status_terminated') break
  if (
    event.type === 'session.status_idle' &&
    event.stop_reason.type !== 'requires_action'
  ) break
}
\`\`\`

Reference: \`interrupt.ts\` \u2014 sends the interrupt the moment it sees \`span.model_request_start\`, drains to idle, then verifies via \`sessions.retrieve()\`.

---

## 4. \`tool_confirmation\` round-trip

When the agent has \`permission_policy: { type: 'always_ask' }\`, any call to that tool fires an \`agent.tool_use\` event with \`evaluated_permission === 'ask'\` and the session goes idle waiting for a decision. Respond with \`user.tool_confirmation\`.

\`\`\`ts
for await (const event of stream) {
  if (event.type === 'agent.tool_use' && event.evaluated_permission === 'ask') {
    await client.beta.sessions.events.send(session.id, {
      events: [{
        type: 'user.tool_confirmation',
        tool_use_id: event.id,         // not a toolu_ id \u2014 use event.id
        result: 'allow',               // or 'deny'
        // deny_message: '...',        // optional, only with result: 'deny'
      }],
    })
  }
}
\`\`\`

Key points:
- \`tool_use_id\` is \`event.id\` (typically \`sevt_...\`), **not** a \`toolu_...\` ID.
- \`result\` is \`'allow' | 'deny'\`. Use \`deny_message\` to tell the model *why* you denied \u2014 it gets surfaced back to the agent.
- Multiple pending tools: respond once per \`agent.tool_use\` event with \`evaluated_permission === 'ask'\`.

Reference: \`tool-permissions.ts\`.

---

## 5. Correct idle-break gate

Do not break on \`session.status_idle\` alone. The session goes idle transiently \u2014 e.g. between parallel tool executions, while waiting for a \`user.tool_confirmation\`, or while awaiting a \`user.custom_tool_result\`. Break when idle with a terminal \`stop_reason\`, or on \`session.status_terminated\`.

\`\`\`ts
for await (const event of stream) {
  handle(event)
  if (event.type === 'session.status_terminated') break
  if (event.type === 'session.status_idle') {
    if (event.stop_reason.type === 'requires_action') continue // waiting on you \u2014 handle it
    break // end_turn or retries_exhausted \u2014 both terminal
  }
}
\`\`\`

\`stop_reason.type\` values on \`session.status_idle\`:
- \`requires_action\` \u2014 agent is waiting on a client-side event (tool confirmation, custom tool result). Handle it, don't break.
- \`retries_exhausted\` \u2014 terminal failure. Break, then check \`sessions.retrieve()\` for the error state.
- \`end_turn\` \u2014 normal completion.

---

## 6. Post-idle status-write race

The SSE stream emits \`session.status_idle\` slightly before the session's queryable status reflects it. Clients that break on idle and immediately call \`sessions.delete()\` or \`sessions.archive()\` will intermittently 400 with "cannot delete/archive while running."

Poll before cleanup:

\`\`\`ts
let s
for (let i = 0; i < 10; i++) {
  s = await client.beta.sessions.retrieve(session.id)
  if (s.status !== 'running') break
  await new Promise(r => setTimeout(r, 200))
}
if (s?.status !== 'running') {
  await client.beta.sessions.archive(session.id)
} // else: still running after 2s \u2014 don't archive, let it settle or escalate
\`\`\`

---

## 7. Stream-first, then send

Always open the stream **before** sending the kickoff event. Otherwise the agent may process the event and emit the first events before your consumer is attached, and you'll miss them.

\`\`\`ts
const stream = await client.beta.sessions.events.stream(session.id)
await client.beta.sessions.events.send(session.id, {
  events: [{ type: 'user.message', content: [{ type: 'text', text: 'Hello' }] }],
})
for await (const event of stream) { /* ... */ }
\`\`\`

The \`Promise.all([stream, send])\` shape works too, but stream-first is simpler and has the same effect \u2014 the stream starts buffering the moment it's opened.

---

## 8. File-mount gotchas

**The mounted resource has a different \`file_id\` than the file you uploaded.** Session creation makes a session-scoped copy.

\`\`\`ts
const uploaded = await client.beta.files.upload({ file, purpose: 'agent_resource' })
// uploaded.id         \u2192 the original file
const session = await client.beta.sessions.create({
  /* ... */
  resources: [{ type: 'file', file_id: uploaded.id, mount_path: '/workspace/data.csv' }],
})
// session.resources[0].file_id !== uploaded.id  \u2190 different IDs
\`\`\`

Delete the original via \`files.delete(uploaded.id)\`; the session-scoped copy is garbage-collected with the session. \`mount_path\` must be absolute \u2014 see \`shared/managed-agents-environments.md\`.

---

## 9. Secrets for non-MCP APIs and CLIs \u2014 keep them host-side via custom tools

**Problem:** you want the agent to call a third-party API or run a CLI that needs a secret (API key, token, service-account credential), but you can't or don't want to hand the secret to a vault.

**First check:** for cloud environments, the first-class answer is now a vault \`environment_variable\` credential \u2014 the agent's shell sees an opaque placeholder and the real secret is substituted at egress. See \`shared/managed-agents-tools.md\` \u2192 Vaults. Use this pattern instead when that doesn't fit: **self-hosted sandboxes** (env-var credentials not yet supported there), clients that reject the placeholder via local format validation, secrets that must never leave your infrastructure, or calls that need host-side binaries.

**Solution:** move the authenticated call to your side. Declare a custom tool on the agent; when the agent emits \`agent.custom_tool_use\`, your orchestrator (the process reading the SSE stream) executes the call with its own credentials and responds with \`user.custom_tool_result\`. The container never sees the key.

\`\`\`ts
// Agent template: declare the tool, no credentials
tools: [{ type: 'custom', name: 'linear_graphql', input_schema: { /* query, vars */ } }]

// Orchestrator: handle the call with host-side creds
for await (const event of stream) {
  if (event.type === 'agent.custom_tool_use' && event.name === 'linear_graphql') {
    const result = await linear.request(event.input.query, event.input.vars) // host's key
    await client.beta.sessions.events.send(session.id, {
      events: [{ type: 'user.custom_tool_result', tool_use_id: event.id, result }],
    })
  }
}
\`\`\`

Same shape works for \`gh\` CLI, local eval scripts, or anything else that needs host-side auth or binaries.

**Security note:** this does not expose a public endpoint. \`agent.custom_tool_use\` arrives on the SSE stream your orchestrator already holds open with your Anthropic API key, and \`user.custom_tool_result\` goes back via \`events.send()\` under the same key. Your orchestrator is a client, not a server \u2014 nothing unauthenticated is listening.

**Do not embed API keys in the system prompt or user messages as a workaround.** Prompts and messages are stored in the session's event history, returned by \`events.list()\`, and included in compaction summaries \u2014 a secret placed there is durably persisted and readable via the API for the life of the session.
`;
  var _Lc = () => {};
  var TLc = `# Managed Agents \u2014 Core Concepts

## Architecture

Managed Agents is built around four core concepts:

| Concept | Endpoint | What it is |
|---|---|---|
| **Agent** | \`/v1/agents\` | A persisted, versioned object defining the agent's capabilities and persona: model, system prompt, tools, MCP servers, skills. **Must be created before starting a session.** See the Agents section below. |
| **Session** | \`/v1/sessions\` | A stateful interaction with an agent. References a pre-created agent by ID + an environment + initial instructions. Produces an event stream. |
| **Environment** | \`/v1/environments\` | A template defining the configuration for container provisioning. |
| **Container** | N/A | An isolated compute instance where the agent's **tools** execute (bash, file ops, code). The agent loop does not run here \u2014 it runs on Anthropic's orchestration layer and acts on the container via tool calls. |

\`\`\`
                       \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510
                       \u2502  Anthropic orchestration layer      \u2502
Agent (config) \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u25B6\u2502  (agent loop: Claude + tool calls)  \u2502
                       \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518
                                      \u2502 tool calls
                                      \u25BC
Environment (template) \u2500\u2500\u25B6 Container (tool execution workspace)
                                 \u2502
                         Session \u2500\u2524
                                 \u251C\u2500\u2500 Resources (files, repos, memory stores \u2014 attached at startup)
                                 \u251C\u2500\u2500 Vault IDs (MCP credential references)
                                 \u2514\u2500\u2500 Conversation (event stream in/out)
\`\`\`

> **Agent creation is a prerequisite.** Sessions reference a pre-created agent by ID \u2014 \`model\`/\`system\`/\`tools\` live on the agent object, never on the session. Every flow starts with \`POST /v1/agents\`.

---

## Session Lifecycle

\`\`\`
rescheduling \u2192 running \u2194 idle \u2192 terminated
\`\`\`

| Status         | Description                                                        |
| -------------- | ------------------------------------------------------------------ |
| \`idle\` | Agent has finished the current task, and is awaiting input. It's either waiting for input to continue working via a \`user.message\` or blocked awaiting a \`user.custom_tool_result\` or \`user.tool_confirmation\`. The \`stop_reason\` attached contains more information about why the Agent has stopped working. |
| \`running\` | Session has starting running, and the Agent is actively doing work. |
| \`rescheduling\` | Session is (re)scheduling after a retryable error has occurred, ready to be picked up by the orchestration system. |
| \`terminated\` | Session has terminated, entering an irreversible and unusable state.  |

- Events can be sent when the session is \`running\` or \`idle\`. Messages are queued and processed in order.
- The agent transitions \`idle \u2192 running\` when it receives a new event, then back to \`idle\` when done.
- Errors surface as \`session.error\` events in the stream, not as a status value.

Every session has a live trace view in the Anthropic Console at \`https://platform.claude.com/workspaces/default/sessions/{session_id}\`. Print this URL immediately after creating a session so the user can watch tool calls and messages stream in real time. The \`default\` workspace segment auto-resolves to the session's actual workspace on load, so you don't need the workspace id.

### Built-in session features

- **Context compaction** \u2014 if you approach max context, the API automatically condenses session history to keep the interaction going
- **Prompt caching** \u2014 historical repeated tokens are cached, reducing processing time and cost
- **Extended thinking** \u2014 on by default, returned as \`agent.thinking\` events

### Session operations

| Operation | Notes |
|---|---|
| List / fetch | Paginated list or single resource by ID |
| Update | Only \`title\` is updatable |
| Archive | Session becomes **read-only**. Not reversible. |
| Delete | Permanently deletes session, event history, container, and checkpoints. |

These are ops/inspection calls \u2014 typically made from a terminal, not application code. From the shell (see \`shared/anthropic-cli.md\`):

\`\`\`sh
ant beta:sessions list --transform '{id,title,status,created_at}' --format jsonl
ant beta:sessions retrieve --session-id "$SID"
ant beta:sessions:events stream --session-id "$SID"   # watch events live
ant beta:sessions archive  --session-id "$SID"
ant beta:sessions delete   --session-id "$SID"
\`\`\`

---

## Sessions

A session is a running agent instance inside an environment.

### Session Object

Key fields returned by the API:

| Field           | Type     | Description                                         |
| --------------- | -------- | --------------------------------------------------- |
| \`type\` | string | Always \`"session"\` |
| \`id\` | string | Unique session ID |
| \`title\` | string | Human-readable title |
| \`status\` | string | \`idle\`, \`running\`, \`rescheduling\`, \`terminated\` |
| \`created_at\` | string | ISO 8601 timestamp |
| \`updated_at\` | string | ISO 8601 timestamp |
| \`archived_at\` | string | ISO 8601 timestamp (nullable) |
| \`environment_id\` | string | Environment ID |
| \`agent\` | object | Agent configuration |
| \`resources\` | array | Attached files, repos, and memory stores |
| \`metadata\` | object | User-provided key-value pairs (max 8 keys) |
| \`usage\` | object | Token usage statistics |

### Creating a session

**A session is meaningless without an agent.** Sessions reference a pre-created agent by ID. Create the agent first via \`agents.create()\`, then reference it:

\`\`\`ts
// 1. Create the agent (reusable, versioned)
const agent = await client.beta.agents.create(
  {
    name: "Coding Assistant",
    model: "{{OPUS_ID}}",
    system: "You are a helpful coding agent.",
    tools: [{ type: "agent_toolset_20260401"}],
  },
);

// 2. Start a session that references it
const session = await client.beta.sessions.create(
  {
    agent: agent.id,  // string shorthand \u2192 latest version. Or: { type: "agent", id: agent.id, version: agent.version }
    environment_id: environmentId,
    title: "Hello World Session",
  },
);
\`\`\`

> \uD83D\uDCA1 **Watch it live in Console.** While developing, print a link so you can click through to the session UI instead of parsing the event stream: \`https://platform.claude.com/workspaces/default/sessions/{session.id}\`. The \`default\` workspace segment auto-resolves to the session's actual workspace on load, so you don't need to know the workspace id. Include this \`print\`/\`console.log\` in code you generate for users who are iterating locally.

**Session creation parameters:**

| Field           | Type     | Required | Description                                    |
| --------------- | -------- | -------- | ---------------------------------------------- |
| \`agent\`         | string or object | **Yes** | Three forms: string shorthand \`"agent_abc123"\` (latest version); pinned \`{type: "agent", id, version}\`; or \`{type: "agent_with_overrides", id, version?, ...}\` to override \`model\`/\`system\`/\`tools\`/\`mcp_servers\`/\`skills\` for this session only \u2014 see \xA7 Override agent configuration for a session |
| \`environment_id\`| string   | **Yes**  | Environment ID                                 |
| \`title\`         | string   | No       | Human-readable name (appears in logs/dashboards) |
| \`resources\`     | array    | No       | Files, GitHub repos, or memory stores, attached to the container at startup. Memory stores are session-create-only (not addable via \`resources.add()\`). |
| \`vault_ids\`     | array    | No       | Vault IDs (\`vlt_*\`) \u2014 MCP credentials with auto-refresh + \`environment_variable\` secrets substituted at egress. See \`shared/managed-agents-tools.md\` \u2192 Vaults. |
| \`metadata\`      | object   | No       | User-provided key-value pairs                  |

**Agent configuration fields** (passed to \`agents.create()\`, not \`sessions.create()\`):

| Field         | Type     | Required | Description                                    |
| ------------- | -------- | -------- | ---------------------------------------------- |
| \`name\`        | string   | **Yes**  | Human-readable name (1-256 chars)              |
| \`model\`       | string or object | **Yes** | Claude model ID (bare string, or \`{id, speed}\` object). All Claude 4.5+ models supported. |
| \`system\`      | string   | No       | System prompt \u2014 defines the agent's behavior (up to 100K chars) |
| \`tools\`       | array    | No       | Encompasses three kinds: (1) pre-built Claude Agent tools (\`agent_toolset_20260401\`), (2) MCP tools (\`mcp_toolset\`), and (3) custom client-side tools. Max 128. |
| \`mcp_servers\` | array    | No       | MCP server connections \u2014 standardized third-party capabilities (e.g. GitHub, Asana). Max 20, unique names. See \`shared/managed-agents-tools.md\` \u2192 MCP Servers. |
| \`skills\`      | array    | No       | Customized "best-practices" context with progressive disclosure. Max 20. See \`shared/managed-agents-tools.md\` \u2192 Skills. |
| \`description\` | string   | No       | Description of the agent (up to 2048 chars)    |
| \`multiagent\`  | object   | No       | \`{type: "coordinator", agents: [...]}\` \u2014 roster this agent may delegate to. See \`shared/managed-agents-multiagent.md\`. |
| \`metadata\`    | object   | No       | Arbitrary key-value pairs (max 16, keys \u226464 chars, values \u2264512 chars) |

---

## Agents

**This is where every Managed Agents flow begins.** The agent object is a persisted, versioned configuration \u2014 you create it once, then reference it by ID every time you start a session. No agent \u2192 no session.

### Agent Object

The API is **flat** \u2014 \`model\`, \`system\`, \`tools\` etc. are top-level fields, not wrapped in an \`agent:{}\` sub-object.

| Field              | Type     | Required | Description                                        |
| ------------------ | -------- | -------- | -------------------------------------------------- |
| \`name\`             | string   | Yes      | Human-readable name                                |
| \`model\`            | string   | Yes      | Claude model ID                                    |
| \`system\`           | string   | No       | System prompt                                      |
| \`tools\`            | array    | No       | Agent toolset / MCP toolset / custom tools         |
| \`mcp_servers\`      | array    | No       | MCP server connections                             |
| \`skills\`           | array    | No       | Skill references (max 20)                          |
| \`description\`      | string   | No       | Description of the agent                           |
| \`multiagent\`       | object   | No       | Coordinator roster \u2014 see \`shared/managed-agents-multiagent.md\` |
| \`metadata\`         | object   | No       | Arbitrary key-value pairs                          |

### Lifecycle: create once, run many, update in place

The agent is a **persistent resource**, not a per-run parameter. The intended pattern:

\`\`\`
\u250C\u2500 setup (once) \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510     \u250C\u2500 runtime (every invocation) \u2500\u2510
\u2502 agents.create()        \u2502     \u2502 sessions.create(             \u2502
\u2502   \u2192 store agent_id     \u2502 \u2500\u2500\u2192 \u2502   agent={type:..., id: ID}   \u2502
\u2502     in config/env/db   \u2502     \u2502 )                            \u2502
\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518     \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518
\`\`\`

**Anti-pattern:** calling \`agents.create()\` at the top of every script run. This accumulates orphaned agent objects, pays create latency on every invocation, and defeats the versioning model. If you see \`agents.create()\` in a function that's called per-request or per-cron-tick, that's wrong \u2014 hoist it to one-time setup and persist the ID.

> **Recommended \u2014 define agents and environments as YAML + apply via the \`ant\` CLI.** The split is **CLI for the control plane, SDK for the data plane**: agents and environments are relatively static resources you manage with \`ant\` (version-controlled YAML, applied from CI); sessions are dynamic and driven by your application through the SDK. See \`shared/anthropic-cli.md\` \u2192 *Version-controlled Managed Agents resources* for the \`ant beta:agents create < agent.yaml\` / \`update --version N\` flow. The SDK \`agents.create()\` call shown elsewhere in this doc is the in-code equivalent \u2014 use it when you need to provision programmatically, but prefer the YAML flow for anything a human maintains.

### Versioning

Each \`POST /v1/agents/{id}\` (update) creates a new immutable version (numeric timestamp, e.g. \`1772585501101368014\`). The agent's history is append-only \u2014 you can't edit a past version.

**Why version:**
- **Reproducibility** \u2014 pin a session to a known-good config: \`{type: "agent", id, version: 3}\`
- **Safe iteration** \u2014 update the agent without breaking sessions already running on the old version
- **Rollback** \u2014 if a new system prompt regresses, pin new sessions back to the prior version while you debug

**\`version\` is optional.** Omit it (or use the string shorthand \`agent="agent_abc123"\`) to get the latest version at session-creation time. Pass it explicitly (\`{type: "agent", id, version: N}\`) to pin for reproducibility.

**Getting the version to pin:** \`agents.create()\` and \`agents.update()\` both return \`version\` in the response. Store it alongside \`agent_id\`. To fetch the current latest for an existing agent: \`GET /v1/agents/{id}\` \u2192 \`.version\`.

**When to update vs create new:** Update (\`POST /v1/agents/{id}\`) when it's conceptually the same agent with tweaked behavior (better prompt, extra tool). Create a new agent when it's a different persona/purpose. Rule of thumb: if you'd give it the same \`name\`, update.

### Agent Endpoints

| Operation        | Method   | Path                                  |
| ---------------- | -------- | ------------------------------------- |
| Create           | \`POST\`   | \`/v1/agents\`                          |
| List             | \`GET\`    | \`/v1/agents\`                          |
| Get              | \`GET\`    | \`/v1/agents/{id}\`                     |
| Update           | \`POST\`   | \`/v1/agents/{id}\`                     |
| Archive          | \`POST\`   | \`/v1/agents/{id}/archive\`             |

> \u26A0\uFE0F **Archive is permanent.** Archiving makes the agent read-only: existing sessions continue to run, but **new sessions cannot reference it**, and there is no unarchive. Since agents have no \`delete\`, this is the terminal lifecycle state. Never archive a production agent as routine cleanup \u2014 confirm with the user first.

### Using an Agent in a Session

Reference the agent by string ID (latest version) or by object with an explicit version:

\`\`\`python
# String shorthand \u2014 uses the agent's latest version
session = client.beta.sessions.create(
    agent=agent.id,
    environment_id=environment_id,
)

# Or pin to a specific version (int)
session = client.beta.sessions.create(
    agent={"type": "agent", "id": agent.id, "version": agent.version},
    environment_id=environment_id,
)
\`\`\`

### Override agent configuration for a session

The third \`agent\` form, \`agent_with_overrides\`, replaces parts of the agent's configuration for **a single session** \u2014 try a different model or grant an extra tool without versioning the agent. Pass \`id\` (and optionally \`version\`; omitted = latest, same default as the other two forms) plus any of \`model\`, \`system\`, \`tools\`, \`mcp_servers\`, \`skills\`:

\`\`\`python
session = client.beta.sessions.create(
    agent={
        "type": "agent_with_overrides",
        "id": agent.id,
        "model": "{{OPUS_ID}}",   # replace the agent's model for this session
        "system": None,           # clear the system prompt for this session
    },
    environment_id=environment_id,
)
\`\`\`

Each overridable field follows tri-state rules:
- **Omit** \u2192 the session inherits the value from the referenced agent version.
- **\`null\` (or \`[]\` for list fields)** \u2192 the session runs with that field cleared. Applies in full to \`system\`, \`mcp_servers\`, \`skills\`. Two exceptions: \`model\` is never clearable (\`model: null\` \u2192 400 \`agent_model_required\`); clearing \`tools\` returns 400 when the session's effective \`skills\` is non-empty (skills require the \`read\` tool), otherwise \`tools: null\` / \`tools: []\` clears.
- **A value** \u2192 replaces the agent's value **in full**. Overrides never merge \u2014 a \`tools\` override must list every tool the session should have.

Overrides are session-local: they do **not** modify the agent resource or create a new agent version. The response's \`agent\` object reflects the post-override configuration, while its \`id\` and \`version\` still identify the base agent \u2014 so you can trace a session back to its base. In multiagent sessions, overrides apply to the coordinator and its \`{type: "self"}\` copies; roster agents referenced by ID always use their own as-created configuration (see \`shared/managed-agents-multiagent.md\`).

### Updating the agent configuration mid-session

\`sessions.update()\` can change \`agent.tools\`, \`agent.mcp_servers\` (including permission policies), and \`vault_ids\` on an **existing** session. This is a **session-local override** \u2014 it does not create a new agent version and does not propagate back to the agent object. The provided arrays are **full replacements**; to append one tool, \`GET\` the session, modify, and \`POST\` back. The session must be \`idle\` \u2014 interrupt first if running.

Only \`tools\` and \`mcp_servers\` can change after a session is created \u2014 to run with a \`model\`, \`system\`, or \`skills\` other than the agent's values, use \`agent_with_overrides\` at create time (above). The agent's configured \`system\` field is fixed for the session's lifetime; you can still **replace the effective system prompt between turns** by sending a \`system.message\` event (see \`shared/managed-agents-events.md\` \xA7 Updating the system prompt mid-session).

\`\`\`python
client.beta.sessions.update(
    session.id,
    agent={
        "tools": [
            {"type": "agent_toolset_20260401"},
            {"type": "mcp_toolset", "mcp_server_name": "linear"},
        ],
        "mcp_servers": [{"type": "url", "name": "linear", "url": "https://mcp.linear.app/sse"}],
    },
    vault_ids=["vlt_..."],
)
\`\`\`

`;
  var SLc = () => {};
  var vLc = `# Managed Agents \u2014 Environments & Resources

## Environments

Creating a session requires an \`environment_id\`. Environments are **reusable configuration templates** for spinning up containers in Anthropic's infrastructure \u2014 you might create different environments for different use cases (e.g. data visualization vs web development, with different package sets). Anthropic handles scaling, container lifecycle, and work orchestration.

**Environment names must be unique.** Creating an environment with an existing name returns 409.

### Networking

| Network Policy   | Description                                                   |
| ---------------- | ------------------------------------------------------------- |
| \`unrestricted\`   | Full egress (except legal blocklist)                          |
| \`limited\`        | Deny-by-default; opt in via \`allowed_hosts\` / \`allow_package_managers\` / \`allow_mcp_servers\` |

\`\`\`json
{
  "networking": {
    "type": "limited",
    "allow_package_managers": true,
    "allow_mcp_servers": true,
    "allowed_hosts": ["api.example.com"]
  }
}
\`\`\`

All three \`limited\` fields are optional. \`allow_package_managers\` (default \`false\`) permits PyPI/npm/etc.; \`allow_mcp_servers\` (default \`false\`) permits the agent's configured MCP server endpoints without listing them in \`allowed_hosts\`.

**MCP caveat:** Under \`limited\` networking, either set \`allow_mcp_servers: true\` or add each MCP server domain to \`allowed_hosts\`. Otherwise the container can't reach them and tools silently fail.

### Creating an environment

The SDK adds \`managed-agents-2026-04-01\` automatically. TypeScript:

\`\`\`ts
const env = await client.beta.environments.create({
  name: "my_env",
  config: {
    type: "cloud",
    networking: { type: "unrestricted" },
  },
});
\`\`\`

### Self-hosted sandboxes

To run tool execution in **your own infrastructure** instead of Anthropic's, set \`config: {type: "self_hosted"}\` \u2014 the agent loop stays on Anthropic's side, but \`bash\` / file ops / code execute in a container you control via an outbound-polling worker. The \`networking\` block does not apply (you control egress). Resource mounting (\`file\`, \`github_repository\`) and memory stores behave differently \u2014 see \`shared/managed-agents-self-hosted-sandboxes.md\` for the worker, credentials, and cloud-vs-self-hosted comparison.

### Environment CRUD

| Operation        | Method   | Path                                       | Notes |
| ---------------- | -------- | ------------------------------------------ | ----- |
| Create           | \`POST\`   | \`/v1/environments\`                         | |
| List             | \`GET\`    | \`/v1/environments\`                         | Paginated (\`limit\`, \`after_id\`, \`before_id\`) |
| Get              | \`GET\`    | \`/v1/environments/{id}\`                    | |
| Update           | \`POST\`   | \`/v1/environments/{id}\`                    | Changes apply only to **new** containers; existing sessions keep their original config |
| Delete           | \`DELETE\` | \`/v1/environments/{id}\`                    | Returns 204. |
| Archive          | \`POST\`   | \`/v1/environments/{id}/archive\`            | Makes it **read-only**; existing sessions continue, new sessions cannot reference it. No unarchive \u2014 terminal state. |

---

## Resources

Attach files, GitHub repositories, and memory stores to a session. **Session creation blocks until all resources are mounted** \u2014 the container won't go \`running\` until every file and repo is in place. Max **999 file resources** per session. Multiple GitHub repositories per session are supported. For \`type: "memory_store"\` resources (persistent cross-session memory \u2014 max 8 per session), see \`shared/managed-agents-memory.md\`.

### File Uploads (input \u2014 host \u2192 agent)

Upload a file first via the Files API, then reference by \`file_id\` + \`mount_path\`:

\`\`\`ts
// 1. Upload
const file = await client.beta.files.upload({
  file: fs.createReadStream("data.csv"),
  purpose: "agent",
});

// 2. Attach as a session resource
const session = await client.beta.sessions.create({
  agent: agent.id,
  environment_id: envId,
  resources: [
    { type: "file", file_id: file.id, mount_path: "/workspace/data.csv" }
  ],
});
\`\`\`

**\`mount_path\` is required** and must be absolute. Parent directories are created automatically. Agent working directory defaults to \`/workspace\`. Files are mounted read-only \u2014 the agent writes modified versions to new paths.

### Session outputs (output \u2014 agent \u2192 host)

The agent can write files to \`/mnt/session/outputs/\` during a session. These are automatically captured by the Files API and can be listed and downloaded afterwards:

\`\`\`ts
// After the turn completes, list output files scoped to this session:
for await (const f of client.beta.files.list({
  scope_id: session.id,
  betas: ["managed-agents-2026-04-01"],
})) {
  console.log(f.filename, f.size_bytes);
  const resp = await client.beta.files.download(f.id);
  const text = await resp.text();
}
\`\`\`

**Requirements:**
- The \`write\` tool (or \`bash\`) must be enabled for the agent to create output files.
- Session-scoped \`files.list\` / \`files.download\` captures outputs written to \`/mnt/session/outputs/\`.
- The filter parameter is **\`scope_id\`** (REST query param \`?scope_id=<session_id>\`). The SDK's files resource auto-adds only the \`files-api-2025-04-14\` header, so pass \`betas: ["managed-agents-2026-04-01"]\` explicitly (or both headers on raw HTTP) \u2014 without it the API may reject \`scope_id\` as an unknown field. Requires \`@anthropic-ai/sdk\` \u2265 0.88.0 / \`anthropic\` (Python) \u2265 0.92.0 \u2014 older versions don't type \`scope_id\`. The \`ant\` CLI does **not** expose this flag yet; use the SDK or curl.
- Pass the session ID returned by \`sessions.create()\` verbatim (e.g. \`sesn_011CZx...\`) \u2014 the API validates the prefix.
- There's a brief indexing lag (~1\u20133s) between \`session.status_idle\` and output files appearing in \`files.list\`. Retry once or twice if empty.

> **Fallback when \`scope_id\` filtering is unavailable** (older SDK, or endpoint returns an error): send a follow-up \`user.message\` asking the agent to \`read\` each file under \`/mnt/session/outputs/\` and return the contents. The agent streams the file bodies back as \`agent.message\` text. This works for text files only and costs output tokens \u2014 use it to unblock, not as the primary path.

This gives you a bidirectional file bridge: upload reference data in, download agent artifacts out.

### GitHub Repositories

Clones a GitHub repository into the session container during initialization, before the agent begins execution. The agent can read, edit, commit, and push via \`bash\` (\`git\`). Multiple repositories per session are supported \u2014 add one \`resources\` entry per repo. Repositories are cached, so future sessions that use the same repository start faster.

Repositories are attached for the lifetime of the session \u2014 to change which repositories are mounted, create a new session. You **can** rotate a repository's \`authorization_token\` on a running session via \`client.beta.sessions.resources.update(resource_id, {session_id, authorization_token})\`; the resource \`id\` is returned at session creation and by \`resources.list()\`.

**Fields:**

| Field | Required | Notes |
|---|---|---|
| \`type\` | \u2705 | \`"github_repository"\` |
| \`url\` | \u2705 | The GitHub repository URL |
| \`authorization_token\` | \u2705 | GitHub Personal Access Token with repository access. **Never echoed in API responses.** |
| \`mount_path\` | \u274C | Path where the repository will be cloned. Defaults to \`/workspace/<repo-name>\`. |
| \`checkout\` | \u274C | \`{type: "branch", name: "..."}\` or \`{type: "commit", sha: "..."}\`. Defaults to the repo's default branch. |

**Token permission levels** (fine-grained PATs):
- \`Contents: Read\` \u2014 clone only
- \`Contents: Read and write\` \u2014 push changes and create pull requests

**How auth works:** \`authorization_token\` is never placed inside the container. \`git pull\` / \`git push\` and GitHub REST calls against the attached repository are routed through an Anthropic-side git proxy that injects the token after the request leaves the sandbox. Code running in the container \u2014 including anything the agent writes \u2014 cannot read or exfiltrate it.

> \u203C\uFE0F **To generate pull requests** you also need GitHub **MCP server** access \u2014 the \`github_repository\` resource gives filesystem + git access only. See \`shared/managed-agents-tools.md\` \u2192 MCP Servers. The PR workflow is: edit files in the mounted repo \u2192 push branch via \`bash\` (authenticated via the git proxy using \`authorization_token\`) \u2192 create PR via the MCP \`create_pull_request\` tool (authenticated via the vault).

**TypeScript:**

\`\`\`ts
// 1. Create the agent \u2014 declare GitHub MCP (no auth here)
const agent = await client.beta.agents.create(
  {
    name: 'GitHub Agent',
    model: '{{OPUS_ID}}',
    mcp_servers: [
      { type: 'url', name: 'github', url: 'https://api.githubcopilot.com/mcp/' },
    ],
    tools: [
      { type: 'agent_toolset_20260401', default_config: { enabled: true } },
      { type: 'mcp_toolset', mcp_server_name: 'github' },
    ],
  },
);

// 2. Start a session \u2014 attach vault for MCP auth + mount the repo
const session = await client.beta.sessions.create({
  agent: agent.id,
  environment_id: envId,
  vault_ids: [vaultId],  // vault contains the GitHub MCP OAuth credential
  resources: [
    {
      type: 'github_repository',
      url: 'https://github.com/owner/repo',
      authorization_token: process.env.GITHUB_TOKEN,  // repo clone token (\u2260 MCP auth)
      checkout: { type: 'branch', name: 'main' },
    },
  ],
});
\`\`\`

**Python:**

\`\`\`python
import os

agent = client.beta.agents.create(
    name="GitHub Agent",
    model="{{OPUS_ID}}",
    mcp_servers=[{
        "type": "url",
        "name": "github",
        "url": "https://api.githubcopilot.com/mcp/",
    }],
    tools=[
        {"type": "agent_toolset_20260401", "default_config": {"enabled": True}},
        {"type": "mcp_toolset", "mcp_server_name": "github"},
    ],
)

session = client.beta.sessions.create(
    agent=agent.id,
    environment_id=env_id,
    vault_ids=[vault_id],  # vault contains the GitHub MCP OAuth credential
    resources=[{
        "type": "github_repository",
        "url": "https://github.com/owner/repo",
        "authorization_token": os.environ["GITHUB_TOKEN"],  # repo clone token (\u2260 MCP auth)
        "checkout": {"type": "branch", "name": "main"},
    }],
)
\`\`\`

---

## Files API

Upload and manage files for use as session resources, and download files the agent wrote to \`/mnt/session/outputs/\`.

| Operation        | Method   | Path                                  | SDK |
| ---------------- | -------- | ------------------------------------- | --- |
| Upload           | \`POST\`   | \`/v1/files\`                           | \`client.beta.files.upload({ file })\` |
| List             | \`GET\`    | \`/v1/files?scope_id=...\`              | \`client.beta.files.list({ scope_id, betas: ["managed-agents-2026-04-01"] })\` |
| Get Metadata     | \`GET\`    | \`/v1/files/{id}\`                      | \`client.beta.files.retrieveMetadata(id)\` |
| Download         | \`GET\`    | \`/v1/files/{id}/content\`              | \`client.beta.files.download(id)\` \u2192 \`Response\` |
| Delete           | \`DELETE\` | \`/v1/files/{id}\`                      | \`client.beta.files.delete(id)\` |

The \`scope_id\` filter on List scopes the results to files written to \`/mnt/session/outputs/\` by that session. Without the filter, you get all files uploaded to your account.
`;
  var ELc = () => {};
  var wLc = () => {};
  var RLc = () => {};
  var kLc = () => {};
  var ILc = () => {};
  var DLc = `# Managed Agents \u2014 Outcomes

An **outcome** elevates a session from *conversation* to *work*: you state what "done" looks like, and the harness runs an iterate \u2192 grade \u2192 revise loop until the artifact meets the rubric, hits \`max_iterations\`, or is interrupted. A separate **grader** (independent context window) scores each iteration against your rubric and feeds per-criterion gaps back to the agent.

The SDK sets the \`managed-agents-2026-04-01\` beta header automatically on all \`client.beta.sessions.*\` calls; no additional header is required for outcomes.

---

## The \`user.define_outcome\` event

Outcomes are not a field on \`sessions.create()\`. You create a normal session, then send a \`user.define_outcome\` event. The agent starts working on receipt \u2014 **do not also send a \`user.message\`** to kick it off.

\`\`\`python
session = client.beta.sessions.create(
    agent=AGENT_ID,
    environment_id=ENVIRONMENT_ID,
    title="Financial analysis on Costco",
)

client.beta.sessions.events.send(
    session_id=session.id,
    events=[
        {
            "type": "user.define_outcome",
            "description": "Build a DCF model for Costco in .xlsx",
            "rubric": {"type": "text", "content": RUBRIC_MD},
            # or: "rubric": {"type": "file", "file_id": rubric.id}
            "max_iterations": 5,  # optional; default 3, max 20
        }
    ],
)
\`\`\`

| Field | Type | Notes |
|---|---|---|
| \`type\` | \`"user.define_outcome"\` | |
| \`description\` | string | The task. This is what the agent works toward \u2014 no separate \`user.message\` needed. |
| \`rubric\` | \`{type: "text", content}\` \\| \`{type: "file", file_id}\` | **Required.** Markdown with explicit, independently gradeable criteria. Upload once via \`client.beta.files.upload(...)\` (beta \`files-api-2025-04-14\`) to reuse across sessions. |
| \`max_iterations\` | int | Optional. Default **3**, max **20**. |

The event is echoed back on the stream with a server-assigned \`outcome_id\` and \`processed_at\`.

> **Writing rubrics.** Use explicit, gradeable criteria ("CSV has a numeric \`price\` column"), not vibes ("data looks good") \u2014 the grader scores each criterion independently, so vague criteria produce noisy loops. If you don't have a rubric, have Claude analyze a known-good artifact and turn that analysis into one.

---

## Outcome-specific events

These appear on the standard event stream (\`sessions.events.stream\` / \`.list\`) alongside the usual \`agent.*\` / \`session.*\` events.

| Event | Payload highlights | Meaning |
|---|---|---|
| \`span.outcome_evaluation_start\` | \`outcome_id\`, \`iteration\` (0-indexed) | Grader began scoring iteration *N*. |
| \`span.outcome_evaluation_ongoing\` | \`outcome_id\` | Heartbeat while the grader runs. Grader reasoning is opaque \u2014 you see *that* it's working, not *what* it's thinking. |
| \`span.outcome_evaluation_end\` | \`outcome_evaluation_start_id\`, \`outcome_id\`, \`iteration\`, \`result\`, \`explanation\`, \`usage\` | Grader finished one iteration. \`result\` drives what happens next (table below). |

### \`span.outcome_evaluation_end.result\`

| \`result\` | Next |
|---|---|
| \`satisfied\` | Session \u2192 \`idle\`. Terminal for this outcome. |
| \`needs_revision\` | Agent starts another iteration. |
| \`max_iterations_reached\` | No further grader cycles. Agent may run one final revision, then session \u2192 \`idle\`. |
| \`failed\` | Session \u2192 \`idle\`. Rubric fundamentally doesn't match the task (e.g. description and rubric contradict). |
| \`interrupted\` | Only emitted if \`_start\` had already fired before a \`user.interrupt\` arrived. |

\`\`\`json
{
  "type": "span.outcome_evaluation_end",
  "id": "sevt_01jkl...",
  "outcome_evaluation_start_id": "sevt_01def...",
  "outcome_id": "outc_01a...",
  "result": "satisfied",
  "explanation": "All 12 criteria met: revenue projections use 5 years of historical data, ...",
  "iteration": 0,
  "usage": { "input_tokens": 2400, "output_tokens": 350, "cache_creation_input_tokens": 0, "cache_read_input_tokens": 1800 },
  "processed_at": "2026-03-25T14:03:00Z"
}
\`\`\`

---

## Checking status & retrieving deliverables

**Status** \u2014 either watch the stream for \`span.outcome_evaluation_end\`, or poll the session and read \`outcome_evaluations\`:

\`\`\`python
session = client.beta.sessions.retrieve(session.id)
for ev in session.outcome_evaluations:
    print(f"{ev.outcome_id}: {ev.result}")  # outc_01a...: satisfied
\`\`\`

**Deliverables** \u2014 the agent writes to \`/mnt/session/outputs/\`. Once idle, fetch via the Files API with \`scope_id=session.id\`. This is the same session-outputs mechanism documented in \`shared/managed-agents-environments.md\` \u2192 Session outputs (including the dual-beta-header requirement on \`files.list\`).

---

## Interaction rules & pitfalls

- **One outcome at a time.** Chain by sending the next \`user.define_outcome\` only after the previous one's terminal \`span.outcome_evaluation_end\` (\`satisfied\` / \`max_iterations_reached\` / \`failed\` / \`interrupted\`). The session retains history across chained outcomes.
- **Steering is allowed but optional.** You *may* send \`user.message\` events mid-outcome to nudge direction, but the agent already knows to keep working until terminal \u2014 don't send "keep going" prompts.
- **\`user.interrupt\` pauses the current outcome** \u2014 it marks \`result: "interrupted"\` and leaves the session \`idle\`, ready for a new outcome or conversational turn.
- **After terminal, the session is reusable** \u2014 continue conversationally or define a new outcome.
- **Outcome \u2260 session-create field.** Don't put \`outcome\`, \`rubric\`, or \`description\` on \`sessions.create()\` \u2014 outcomes are always sent as a \`user.define_outcome\` event.
- **Idle-break gate is unchanged.** In your drain loop, keep using \`event.type === 'session.status_idle' && event.stop_reason?.type !== 'requires_action'\` \u2014 do **not** gate on \`span.outcome_evaluation_end\` alone (on \`needs_revision\` the session keeps running). See \`shared/managed-agents-client-patterns.md\` Pattern 5.

For the raw HTTP shapes and per-language SDK bindings beyond Python, WebFetch \`https://platform.claude.com/docs/en/managed-agents/define-outcomes.md\` (see \`shared/live-sources.md\`).
`;
  var OLc = () => {};
  var NLc = `# Managed Agents \u2014 Overview

Managed Agents provisions a container per session as the agent's workspace. The agent loop runs on Anthropic's orchestration layer; the container is where the agent's *tools* execute \u2014 bash commands, file operations, code. You create a persisted **Agent** config (model, system prompt, tools, MCP servers, skills), then start **Sessions** that reference it. The session streams events back to you; you send user messages and tool results in.

## \u26A0\uFE0F THE MANDATORY FLOW: Agent (once) \u2192 Session (every run)

**Why agents are separate objects: versioning.** An agent is a persisted, versioned config \u2014 every update creates a new immutable version, and sessions pin to a version at creation time. This lets you iterate on the agent (tweak the prompt, add a tool) without breaking sessions already running, roll back if a change regresses, and A/B test versions side-by-side. None of that works if you \`agents.create()\` fresh on every run.

Every session references a pre-created \`/v1/agents\` object. Create the agent once, store the ID, and reuse it across runs.

| Step | Call | Frequency |
|---|---|---|
| 1 | \`POST /v1/agents\` \u2014 \`model\`, \`system\`, \`tools\`, \`mcp_servers\`, \`skills\` live here | **ONCE.** Store \`agent.id\` **and** \`agent.version\`. |
| 2 | \`POST /v1/sessions\` \u2014 \`agent: "agent_abc123"\` or \`{type: "agent", id, version}\` | **Every run.** String shorthand uses latest version. |

If you're about to write \`sessions.create()\` with \`model\`, \`system\`, or \`tools\` on the session body \u2014 **stop**. Those fields live on \`agents.create()\`. The session takes a *pointer* only.

**When generating code, separate setup from runtime.** \`agents.create()\` belongs in a setup script (or a guarded \`if agent_id is None:\` block), not at the top of the hot path. If the user's code calls \`agents.create()\` on every invocation, they're accumulating orphaned agents and paying the create latency for nothing. The correct shape is: create once \u2192 persist the ID (config file, env var, secrets manager) \u2192 every run loads the ID and calls \`sessions.create()\`.

**To change the agent's behavior, use \`POST /v1/agents/{id}\` \u2014 don't create a new one.** Each update bumps the version; running sessions keep their pinned version, new sessions get the latest (or pin explicitly via \`{type: "agent", id, version}\`). See \`shared/managed-agents-core.md\` \u2192 Agents \u2192 Versioning. To change \`tools\`/\`mcp_servers\`/\`vault_ids\` on **one running session** without touching the agent object, use \`sessions.update()\` \u2014 see \`shared/managed-agents-core.md\` \u2192 Updating the agent configuration mid-session.

## Beta Headers

Managed Agents is in beta. The SDK sets required beta headers automatically:

| Beta Header                    | What it enables                                      |
| ------------------------------ | ---------------------------------------------------- |
| \`managed-agents-2026-04-01\`    | Agents, Environments, Sessions, Events, Session Resources, Session Threads, Outcomes, Multiagent, Vaults, Credentials, Memory Stores, Deployments |
| \`skills-2025-10-02\`            | Skills API (for managing custom skill definitions)   |
| \`files-api-2025-04-14\`         | Files API for file uploads                           |

**Which beta header goes where:** The SDK sets \`managed-agents-2026-04-01\` automatically on \`client.beta.{agents,environments,sessions,vaults,memory_stores,deployments,deployment_runs}.*\` calls, and \`files-api-2025-04-14\` / \`skills-2025-10-02\` automatically on \`client.beta.files.*\` / \`client.beta.skills.*\` calls. You do NOT need to add the Skills or Files beta header when calling Managed Agents endpoints. **Exception \u2014 session-scoped file listing:** \`client.beta.files.list({scope_id: session.id})\` is a Files endpoint that takes a Managed Agents parameter, so it needs **both** headers. Pass \`betas: ["managed-agents-2026-04-01"]\` explicitly on that call (the SDK adds the Files header; you add the Managed Agents one). See \`shared/managed-agents-environments.md\` \u2192 Session outputs.

## Reading Guide

| User wants to...                       | Read these files                                        |
| -------------------------------------- | ------------------------------------------------------- |
| **Get started from scratch / "help me set up an agent"** | \`shared/managed-agents-onboarding.md\` \u2014 guided interview (WHERE\u2192WHO\u2192WHAT\u2192WATCH), then emit code |
| Understand how the API works           | \`shared/managed-agents-core.md\`                         |
| See the full endpoint reference        | \`shared/managed-agents-api-reference.md\`                |
| **Create an agent** (required first step) | \`shared/managed-agents-core.md\` (Agents section) + language file |
| Update/version an agent                | \`shared/managed-agents-core.md\` (Agents \u2192 Versioning) \u2014 update, don't re-create |
| Create a session                       | \`shared/managed-agents-core.md\` + \`{lang}/managed-agents/README.md\` (cURL/C#: \`curl/managed-agents.md\`) |
| Configure tools and permissions        | \`shared/managed-agents-tools.md\`                        |
| Set up MCP servers                     | \`shared/managed-agents-tools.md\` (MCP Servers section)  |
| Stream events / handle tool_use        | \`shared/managed-agents-events.md\` + language file       |
| Get notified of session state changes via webhook (no polling) | \`shared/managed-agents-webhooks.md\` \u2014 Console-registered endpoint, HMAC verify, thin payload + fetch |
| Define an outcome / rubric-graded iterate loop | \`shared/managed-agents-outcomes.md\` \u2014 \`user.define_outcome\` event, grader, \`span.outcome_evaluation_*\` events |
| Coordinate multiple agents / subagents / threads | \`shared/managed-agents-multiagent.md\` \u2014 \`multiagent: {type: "coordinator", agents: [...]}\` on the agent, session threads, cross-posted tool confirmations |
| Set up environments                    | \`shared/managed-agents-environments.md\` + language file |
| Run tool execution in your own infra / VPC (self-hosted sandbox) | \`shared/managed-agents-self-hosted-sandboxes.md\` \u2014 \`config:{type:"self_hosted"}\`, \`ANTHROPIC_ENVIRONMENT_KEY\`, \`EnvironmentWorker.run()\` / \`ant beta:worker poll\` |
| Upload files / attach repos            | \`shared/managed-agents-environments.md\` (Resources)     |
| Give agents persistent memory across sessions | \`shared/managed-agents-memory.md\` \u2014 memory stores, \`memory_store\` session resource, preconditions, versions/redact |
| Define agents/environments as version-controlled YAML; drive the API from the shell | \`shared/anthropic-cli.md\` \u2014 \`ant beta:agents create < agent.yaml\`, \`--transform\`, \`@file\` inlining |
| Store credentials (MCP auth, API keys for CLIs/SDKs) | \`shared/managed-agents-tools.md\` (Vaults section) \u2014 \`mcp_oauth\` / \`static_bearer\` / \`environment_variable\` |
| Call a non-MCP API / CLI that needs a secret | \`shared/managed-agents-tools.md\` (Vaults section) \u2014 \`environment_variable\` credential, substituted at egress. If that doesn't fit (e.g. self-hosted sandboxes), \`shared/managed-agents-client-patterns.md\` Pattern 9 keeps the secret host-side via a custom tool |
| Run an agent on a recurring cron schedule | \`shared/managed-agents-scheduled-deployments.md\` \u2014 deployments, deployment runs, pause/auto-pause |

## Common Pitfalls

- **Agent FIRST, then session \u2014 NO EXCEPTIONS** \u2014 the session's \`agent\` field accepts **only** a string ID or \`{type: "agent", id, version}\`. \`model\`, \`system\`, \`tools\`, \`mcp_servers\`, \`skills\` are **top-level fields on \`POST /v1/agents\`**, never on \`sessions.create()\`. If the user hasn't created an agent, that is step zero of every example.
- **Agent ONCE, not every run** \u2014 \`agents.create()\` is a setup step. Store the returned \`agent_id\` and reuse it; don't call \`agents.create()\` at the top of your hot path. If the agent's config needs to change, \`POST /v1/agents/{id}\` \u2014 each update creates a new version, and sessions can pin to a specific version for reproducibility.
- **MCP auth goes through vaults** \u2014 the agent's \`mcp_servers\` array declares \`{type, name, url}\` only (no auth). Credentials live in vaults (\`client.beta.vaults.credentials.create\`) and attach to sessions via \`vault_ids\`. Anthropic auto-refreshes OAuth tokens using the stored refresh token. Vaults also hold \`environment_variable\` credentials for non-MCP services (CLIs, SDKs, direct API calls) \u2014 substituted at egress, never visible in the sandbox.
- **Reconcile resources before the first run** \u2014 a session with a clear ask but a missing tool, credential, data mount, or context will discover the gap mid-run, then flail and give up. Before creating the session, check that every action in the task maps to a configured tool/MCP server, every MCP server has a vault credential, and every referenced file/host is mounted/reachable. When helping a user set one up, run the reconciliation in \`shared/managed-agents-onboarding.md\` \u2192 \xA73 Pre-flight viability check.
- **Stream to get events** \u2014 \`GET /v1/sessions/{id}/events/stream\` is the primary way to receive agent output in real-time.
- **SSE stream has no replay \u2014 reconnect with consolidation** \u2014 if the stream drops while a \`agent.tool_use\`, \`agent.mcp_tool_use\`, or \`agent.custom_tool_use\` is pending resolution (\`user.tool_confirmation\` for the first two, \`user.custom_tool_result\` for the last one), the session deadlocks (client disconnects \u2192 session idles \u2192 reconnect happens \u2192 no client resolution happens). On every (re)connect: open stream with \`GET /v1/sessions/{id}/events/stream\` , fetch \`GET /v1/sessions/{id}/events\`, dedupe by event ID, then proceed. See \`shared/managed-agents-events.md\` \u2192 Reconnecting after a dropped stream.
- **Don't trust HTTP-library timeouts as wall-clock caps** \u2014 \`requests\` \`timeout=(c, r)\` and \`httpx.Timeout(n)\` are *per-chunk* read timeouts; they reset every byte, so a trickling connection can block indefinitely. For a hard deadline on raw-HTTP polling, track \`time.monotonic()\` at the loop level and bail explicitly. Prefer the SDK's \`sessions.events.stream()\` / \`session.events.list()\` over hand-rolled HTTP. See \`shared/managed-agents-events.md\` \u2192 Receiving Events.
- **Messages queue** \u2014 you can send events while the session is \`running\` or \`idle\`; they're processed in order. No need to wait for a response before sending the next message.
- **Environment \`config.type\` is \`"cloud"\` or \`"self_hosted"\`** \u2014 \`cloud\` runs the container on Anthropic's infrastructure; \`self_hosted\` moves tool execution to your own (see \`shared/managed-agents-self-hosted-sandboxes.md\`).
- **Archive is permanent on every resource** \u2014 archiving an agent, environment, session, vault, credential, or memory store makes it read-only with no unarchive. For agents, environments, and memory stores specifically, archived resources cannot be referenced by new sessions (existing sessions continue). Do not call \`.archive()\` on a production agent, environment, or memory store as cleanup \u2014 **always confirm with the user before archiving**.
`;
  var MLc = () => {};
  var LLc = () => {};
  var BLc = `# Managed Agents \u2014 Self-Hosted Sandboxes

With \`config.type: "self_hosted"\`, the **agent loop stays on Anthropic's orchestration layer** but **tool execution moves to infrastructure you control** \u2014 bash, file ops, and code run inside your container, so filesystem contents and network egress never leave your environment. Contrast with \`config.type: "cloud"\`, where Anthropic runs the container. Connectivity is **outbound-only**: your worker long-polls Anthropic's work queue; Anthropic never dials into your network.

## Flow

\`\`\`
1. Create environment:      config: {type: "self_hosted"}        \u2192 env_...
2. Generate environment key (Console, on the environment page)   \u2192 sk-ant-oat01-...  as ANTHROPIC_ENVIRONMENT_KEY
3. Run a worker:            EnvironmentWorker.run()  or  ant beta:worker poll
4. Sessions reference       environment_id=env_... exactly as for cloud
\`\`\`

## Create the environment

\`\`\`python
client = anthropic.Anthropic()

environment = client.beta.environments.create(
    name="self-hosted", config={"type": "self_hosted"}
)
\`\`\`

\`{"type": "self_hosted"}\` is the entire config \u2014 there are no pool, capacity, or networking sub-fields; you control those on your side.

## Run a worker \u2014 SDK (primary path)

\`EnvironmentWorker\` wraps the poll \u2192 dispatch \u2192 tool-execute loop. \`.run()\` is the always-on loop; \`.run_one()\` / \`.runOne()\` handles one work item (for webhook-driven wake).

**Python \u2014 always-on:**

\`\`\`python
import asyncio
import os
from anthropic import AsyncAnthropic
from anthropic.lib.environments import EnvironmentWorker

async def main() -> None:
    environment_key = os.environ["ANTHROPIC_ENVIRONMENT_KEY"]
    environment_id = os.environ["ANTHROPIC_ENVIRONMENT_ID"]
    async with AsyncAnthropic(auth_token=environment_key) as client:
        await EnvironmentWorker(
            client,
            environment_id=environment_id,
            environment_key=environment_key,
            workdir="/workspace",
        ).run()

asyncio.run(main())
\`\`\`

**TypeScript \u2014 always-on:**

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";
import { EnvironmentWorker } from "@anthropic-ai/sdk/helpers/beta/environments";

const environmentKey = process.env.ANTHROPIC_ENVIRONMENT_KEY!;
const environmentId = process.env.ANTHROPIC_ENVIRONMENT_ID!;
const client = new Anthropic({ authToken: environmentKey });
const ctrl = new AbortController();
process.once("SIGTERM", () => ctrl.abort());

await new EnvironmentWorker({
  client,
  environmentId,
  environmentKey,
  workdir: "/workspace",
  signal: ctrl.signal
}).run();
\`\`\`

**Customizing tools.** \`EnvironmentWorker\` runs the built-in toolset by default. To add or replace tools, use \`AgentToolContext(workdir=, client=, session_id=)\` with \`beta_agent_toolset(env)\` / \`betaAgentToolset(env)\` and pass the resulting tools to the lower-level \`tool_runner()\`. Skills attached to the agent are downloaded into \`{workdir}/skills/<name>/\` before tool calls begin (\`AgentToolContext\` handles this when given \`client\` and \`session_id\`). Downloaded skill files are marked executable automatically by the CLI and SDK; if you implement skills download yourself, you set permissions.

> **Runtime deps:** the SDK helpers require \`/bin/bash\` at that exact path. The TypeScript SDK additionally requires \`unzip\`, \`tar\`, and Node.js 22+. These are resolved at fixed paths and do **not** respect \`PATH\` overrides.

## Run a worker \u2014 \`ant\` CLI (fixed tools)

The \`ant\` CLI ships a worker with the fixed built-in toolset (\`bash\`, \`read\`, \`write\`, \`edit\`, \`glob\`, \`grep\`). Install per \`shared/anthropic-cli.md\`, then:

\`\`\`sh
export ANTHROPIC_ENVIRONMENT_KEY=sk-ant-oat01-...
ant beta:worker poll --environment-id env_... --workdir /workspace
\`\`\`

- \`--workdir\` is the directory tools operate in (default \`.\`); tool calls are sandboxed to it.
- \`--environment-key\` overrides the env var.
- \`--on-work <script>\` runs your script per work item (e.g. to spin a fresh container per session \u2014 see Container orchestration below).
- \`--unrestricted-paths\`, \`--max-idle\` (default \`60s\`), \`--log-format\` \u2014 see \`ant beta:worker poll --help\`.
- Flags fall back to env vars (\`ANTHROPIC_ENVIRONMENT_ID\`, \`ANTHROPIC_ENVIRONMENT_KEY\`).
- Exits cleanly on SIGTERM/SIGINT after draining in-flight work.
- **Fixed toolset** \u2014 for custom tools, use the SDK worker above.

Inside an \`--on-work\` container, run \`ant beta:worker run --workdir <dir>\` as the entrypoint.

## Webhook-driven wake (instead of always-on)

Register a webhook for \`session.status_run_started\` (see \`shared/managed-agents-webhooks.md\`), verify the delivery, then drain one work item with \`.run_one()\`:

\`\`\`python
import os
import anthropic
from anthropic.lib.environments import EnvironmentWorker

environment_key = os.environ["ANTHROPIC_ENVIRONMENT_KEY"]
environment_id = os.environ["ANTHROPIC_ENVIRONMENT_ID"]
client = anthropic.AsyncAnthropic(
    auth_token=environment_key,
)  # reads ANTHROPIC_WEBHOOK_SIGNING_KEY from env for webhooks.unwrap()

async def handle(raw: bytes, headers: dict[str, str]) -> dict:
    event = client.beta.webhooks.unwrap(raw.decode(), headers=headers)
    if event.data.type != "session.status_run_started":
        return {"status": "ignored"}
    await EnvironmentWorker(
        client,
        environment_id=environment_id,
        environment_key=environment_key,
        workdir="/workspace",
    ).run_one()
    return {"status": "ok"}
\`\`\`

TypeScript: same shape with \`client.beta.webhooks.unwrap(body, {headers})\` and \`new EnvironmentWorker({...}).runOne()\`.

## Container orchestration (mid-level)

\`EnvironmentWorker.run()\` polls and executes tools in the same process. To run each session in its **own** container, use the mid-level poller in a thin orchestrator \u2014 Python \`client.beta.environments.work.poller(environment_id=, environment_key=, drain=, block_ms=, reclaim_older_than_ms=, auto_stop=)\`; TypeScript \`new WorkPoller({client, environmentId, environmentKey, autoStop})\` from \`@anthropic-ai/sdk/helpers/beta/environments\` \u2014 and, for each yielded \`work\` item, start a fresh container with these env vars injected, whose entrypoint runs \`ant beta:worker run\` or an \`EnvironmentWorker(...).run_one()\`. \`block_ms\` is 1\u2013999 (or \`None\` for non-blocking); \`reclaim_older_than_ms\` re-claims items leased to a dead worker; \`drain\` stops once the queue is empty; \`auto_stop\` posts a stop signal after the iterator exits (set \`False\` when the launched container owns the stop call). **Go's poller has no \`auto_stop\` opt-out** \u2014 it calls \`work.Stop\` when the handler returns, so block in the handler until the session completes rather than detaching.

| Env var | Value |
|---|---|
| \`ANTHROPIC_SESSION_ID\` | \`work.data.id\` |
| \`ANTHROPIC_WORK_ID\` | \`work.id\` |
| \`ANTHROPIC_ENVIRONMENT_ID\` | \`work.environment_id\` |
| \`ANTHROPIC_ENVIRONMENT_KEY\` | pass through |
| \`ANTHROPIC_BASE_URL\` | pass through |

Skip items where \`work.data.type != "session"\`.

## Monitoring & control

These are **control-plane** calls \u2014 authenticate with \`x-api-key\` (not the environment key); \`managed-agents-2026-04-01\` beta header. **Call them from outside the worker host** \u2014 setting \`ANTHROPIC_API_KEY\` on the worker host exposes an organization-scoped credential to agent tool calls.

| SDK (\`client.beta.environments.work.*\`) | REST | CLI | Returns |
|---|---|---|---|
| \`stats(environment_id)\` | \`GET /v1/environments/{id}/work/stats\` | \`ant beta:environments:work stats\` | \`{type:"work_queue_stats", depth, pending, oldest_queued_at, workers_polling}\` |
| \`stop(work_id, environment_id=)\` | \`POST /v1/environments/{id}/work/{work_id}/stop\` | \`ant beta:environments:work stop\` | \`work.state\` |

## What changes vs \`cloud\`

| Concern | \`cloud\` | \`self_hosted\` |
|---|---|---|
| Container lifecycle, hardening, networking | Anthropic | **You** \u2014 run non-root, read-only rootfs, drop caps; egress is whatever your VPC/firewall allows |
| \`file\` / \`github_repository\` resource mounting | Anthropic mounts into the container | **You** \u2014 pass pointers via \`sessions.create(metadata={...})\` and have your orchestrator fetch/clone before dispatch |
| \`memory_store\` resources | Supported | **Not yet supported** |
| Vault \`environment_variable\` credentials | Supported (substituted at Anthropic-managed egress) | **Not yet supported** \u2014 egress is yours, so there's nowhere to substitute the secret. Use MCP credentials or a host-side custom tool (\`shared/managed-agents-client-patterns.md\` Pattern 9) |
| Built-in tools | Via \`agent_toolset_20260401\` | Supplied by your worker (\`EnvironmentWorker\` default / \`beta_agent_toolset(env)\` / \`ant\` CLI fixed set) |
| Skills download | Automatic | \`EnvironmentWorker\` / \`AgentToolContext\` fetch into \`{workdir}/skills/\` (needs \`client\` + \`session_id\`) |
| Claude Platform on AWS | Supported | **Not available** |
| SDK worker helpers | All SDKs | **Python, TypeScript, Go only** (\`EnvironmentWorker\` / poller not in Java, Ruby, PHP, or C#) \u2014 use one of those three or the \`ant\` CLI |

## Credentials

| Credential | Format | Scope |
|---|---|---|
| \`ANTHROPIC_ENVIRONMENT_KEY\` | \`sk-ant-oat01-...\` | One environment's work queue. Generate in Console ("Generate environment key"). Pass as \`auth_token=\` / \`authToken\` on the client **and** as \`environment_key=\` / \`environmentKey\` on \`EnvironmentWorker\`. Store in a secrets manager; rotate on exposure. |
| \`ANTHROPIC_WEBHOOK_SIGNING_KEY\` | \`whsec_...\` | Webhook signature verification (if using webhook-driven wake). The SDK reads this env var automatically for \`client.beta.webhooks.unwrap()\`. |

## Security \u2014 what you own

Container hardening; egress restriction (there is no default); \`ANTHROPIC_ENVIRONMENT_KEY\` custody and rotation; one workspace + environment per trust boundary when running untrusted code; least-privilege for the tool process; log retention and redaction. **Anthropic cannot**: fast-revoke a leaked environment key, verify your image or supply chain, sandbox tool execution inside your container, or enforce retention after tool output reaches your infrastructure. See the Self-Hosted Sandboxes Security page in \`shared/live-sources.md\` for the full checklist.
`;
  var ULc = () => {};
  var $Lc = () => {};
  var qLc = `# Managed Agents \u2014 Webhooks

Anthropic can POST to your HTTPS endpoint when a Managed Agents resource changes state \u2014 an alternative to holding an SSE stream or polling. Payloads are **thin** (event type + resource IDs only); on receipt, fetch the resource for current state. Every delivery is HMAC-signed.

> **Direction matters.** This page covers *Anthropic \u2192 you* notifications about session/vault state. It does **not** cover *third-party \u2192 you* webhooks that *trigger* a session (e.g. a GitHub push handler that calls \`sessions.create()\`) \u2014 that's ordinary application code on your side with no Anthropic-specific wire format.

---

## Register an endpoint (Console only)

Console \u2192 **Manage \u2192 Webhooks**. There is no programmatic endpoint-management API yet. Secret rotation is supported from the same page.

| Field | Constraint |
|---|---|
| URL | HTTPS on port 443, publicly resolvable hostname |
| Event types | Subscribe per \`data.type\` \u2014 you only receive subscribed types (plus test events) |
| Signing secret | \`whsec_\`-prefixed, 32 bytes, **shown once at creation** \u2014 store it |

---

## Verify the signature

Every delivery is HMAC-signed. **Use the SDK's \`client.beta.webhooks.unwrap()\`** \u2014 it verifies the signature, rejects payloads more than ~5 minutes old, and returns the parsed event. It reads the \`whsec_\` secret from \`ANTHROPIC_WEBHOOK_SIGNING_KEY\`.

\`\`\`python
import anthropic
from flask import Flask, request

client = anthropic.Anthropic()  # reads ANTHROPIC_WEBHOOK_SIGNING_KEY from env
app = Flask(__name__)

@app.route("/webhook", methods=["POST"])
def webhook():
    try:
        event = client.beta.webhooks.unwrap(
            request.get_data(as_text=True),
            headers=dict(request.headers),
        )
    except Exception:
        return "invalid signature", 400

    if event.id in seen_event_ids:  # dedupe retries \u2014 id is per-event, not per-delivery
        return "", 204
    seen_event_ids.add(event.id)

    match event.data.type:
        case "session.status_idled":
            session = client.beta.sessions.retrieve(event.data.id)
            notify_user(session)
        case "vault_credential.refresh_failed":
            alert_oncall(event.data.id)

    return "", 204
\`\`\`

Pass the **raw request body** to \`unwrap()\` \u2014 frameworks that re-serialize JSON (Express \`.json()\`, Flask \`.get_json()\`) change the bytes and break the MAC. For other languages, look up the \`beta.webhooks.unwrap\` binding in the SDK repo (\`shared/live-sources.md\`); don't hand-roll verification.

---

## Payload envelope

\`\`\`json
{
  "type": "event",
  "id": "event_01ABC...",
  "created_at": "2026-03-18T14:05:22Z",
  "data": {
    "type": "session.status_idled",
    "id": "session_01XYZ...",
    "organization_id": "8a3d2f1e-...",
    "workspace_id": "c7b0e4d9-..."
  }
}
\`\`\`

Switch on \`data.type\`, fetch the resource by \`data.id\`, return any **2xx** to acknowledge. \`created_at\` is when the *state transition* happened, not when the webhook fired.

---

## Supported \`data.type\` values

| \`data.type\` | Fires when |
|---|---|
| \`session.status_scheduled\` | Session created and ready to accept events |
| \`session.status_run_started\` | Agent execution kicked off (every transition to \`running\`) |
| \`session.status_idled\` | Agent awaiting input (tool approval, custom tool result, or next message) |
| \`session.status_terminated\` | Session hit a terminal error |
| \`session.thread_created\` | Multiagent: coordinator opened a new subagent thread |
| \`session.thread_idled\` | Multiagent: a subagent thread is waiting for input |
| \`session.outcome_evaluation_ended\` | Outcome grader finished one iteration |
| \`vault.archived\` | Vault was archived |
| \`vault.created\` | Vault was created |
| \`vault.deleted\` | Vault was deleted |
| \`vault_credential.archived\` | Vault credential was archived |
| \`vault_credential.created\` | Vault credential was created |
| \`vault_credential.deleted\` | Vault credential was deleted |
| \`vault_credential.refresh_failed\` | MCP OAuth vault credential failed to refresh |
| \`agent.created\` | Agent created |
| \`agent.updated\` | A new agent version was published. Updates that do not create a new version do **not** fire this. |
| \`agent.archived\` | Agent archived |
| \`agent.deleted\` | Agent permanently deleted \u2014 no object left to fetch; treat the event itself as final |
| \`deployment.created\` | Scheduled deployment created |
| \`deployment.updated\` | Deployment properties changed (e.g. schedule edited) |
| \`deployment.paused\` | Deployment paused \u2014 by request, or automatically when a scheduled run fails with a **non-recoverable** error (archived agent, missing environment). Recoverable failures, including rate limits, do **not** auto-pause. |
| \`deployment.unpaused\` | Deployment unpaused; schedule resumes |
| \`deployment.archived\` | Deployment archived \u2014 directly, or as a result of agent archival/deletion |
| \`deployment.deleted\` | Deployment permanently deleted \u2014 no object left to fetch; treat the event itself as final |
| \`deployment_run.started\` | A **scheduled** run started. Manual runs do **not** emit \`deployment_run.*\` events. |
| \`deployment_run.succeeded\` | Scheduled run created its session. Same \`data.id\` (the run ID) as the run's \`.started\` event \u2014 fetch the deployment run for its \`session_id\`, then subscribe to the session events to follow the work. |
| \`deployment_run.failed\` | Scheduled run did not create a session. Same \`data.id\` as the run's \`.started\` event \u2014 fetch the deployment run for \`error.type\` / \`error.message\`. |

> These are **webhook** \`data.type\` values \u2014 a separate namespace from SSE event types (\`session.status_idle\`, \`span.outcome_evaluation_end\`, etc. in \`shared/managed-agents-events.md\`). Don't reuse SSE constants in webhook handlers.

---

## Delivery behavior & pitfalls

- **No ordering guarantee.** \`session.status_idled\` may arrive before \`session.outcome_evaluation_ended\` even if the evaluation finished first. Sort by envelope \`created_at\` if order matters.
- **Retries carry the same \`event.id\`.** At least one retry on non-2xx. Dedupe on \`event.id\`.
- **3xx is failure.** Redirects are not followed \u2014 update the URL in Console if your endpoint moves.
- **Auto-disable** after ~20 consecutive failed deliveries, or immediately if the hostname resolves to a private IP or returns a redirect. Re-enable manually in Console.
- **Thin payload is intentional.** Don't expect \`stop_reason\`, \`outcome_evaluations\`, credential secrets, etc. on the webhook body \u2014 fetch the resource.
`;
  var jLc = () => {};
  var GLc = `# Model Migration Guide

> **If you arrived via \`/claude-api migrate\`:** this is the right file. Execute the steps below in order \u2014 do not summarize them back to the user. Start with Step 0 (confirm scope) before touching any file.

How to move existing code to newer Claude models. Covers breaking changes, deprecated parameters, and drop-in replacements for retired models.

For the latest, authoritative version (with code samples in every supported language), WebFetch the **Migration Guide** URL from \`shared/live-sources.md\`. Use this file for the consolidated, skill-resident reference; fall back to the live docs whenever a model launch or breaking change may have shifted the picture.

**This file is large.** Use the section names below to jump (or \`Grep\` this file for the heading text). Read Step 0 and Step 1 first \u2014 they apply to every migration. Then read only the per-target section for the model you are migrating to.

| Section | When you need it |
|---|---|
| Step 0: Confirm the migration scope | Always \u2014 before any edits |
| Step 1: Classify each file | Always \u2014 decides whether to swap, add-alongside, or skip |
| Per-SDK Syntax Reference | Translate the Python examples in this guide to TypeScript / Go / Ruby / Java / C# / PHP |
| Destination Models / Retired Model Replacements | Picking a target model |
| Breaking Changes by Source Model | Migrating to Opus 4.6 / Sonnet 4.6 |
| Migrating to Opus 4.7 | Migrating to Opus 4.7 (breaking changes, silent defaults, behavioral shifts) |
| Opus 4.7 Migration Checklist | The required vs optional items for 4.7, tagged \`[BLOCKS]\` / \`[TUNE]\` |
| Migrating to Opus 4.8 | Migrating to Opus 4.8 (no new breaking changes; mid-session system prompts; behavioral re-tuning) |
| Opus 4.8 Migration Checklist | The required vs optional items for 4.8, tagged \`[BLOCKS]\` / \`[TUNE]\` |
| Migrating to {{SONNET_NEXT_NAME}} | Migrating Sonnet 4.6 \u2192 {{SONNET_NEXT_NAME}} (adaptive thinking on by default; non-default sampling params 400; new tokenizer; \`xhigh\` effort for coding/agentic; high-res vision; behavioral re-tuning) |
| {{SONNET_NEXT_NAME}} Migration Checklist | The required vs optional items, tagged \`[BLOCKS]\` / \`[TUNE]\` |
| Migrating to {{FABLE_NAME}} | Migrating to {{FABLE_NAME}} or {{MYTHOS_NAME}} (always-on thinking, raw chain of thought never returned, refusal handling, data retention, behavioral shifts + prompting guidance) |
| {{FABLE_NAME}} Migration Checklist | The required vs optional items for {{FABLE_NAME}}, tagged \`[BLOCKS]\` / \`[TUNE]\` |
| Verify the Migration | After edits \u2014 runtime spot-check |

**TL;DR:** Change the model ID string. If you were using \`budget_tokens\`, switch to \`thinking: {type: "adaptive"}\`. If you were using assistant prefills, they 400 on both Opus 4.6 and Sonnet 4.6 \u2014 switch to one of the prefill replacements (most often \`output_config.format\`; see the table in Breaking Changes by Source Model). If you're moving from Sonnet 4.5 to Sonnet 4.6, set \`effort\` explicitly \u2014 4.6 defaults to \`high\`. Remove the \`effort-2025-11-24\` and \`fine-grained-tool-streaming-2025-05-14\` beta headers (GA on 4.6); remove \`interleaved-thinking-2025-05-14\` once you're on adaptive thinking (keep it only while using the transitional \`budget_tokens\` escape hatch). Then drop back from \`client.beta.messages.create\` to \`client.messages.create\`. Dial back any aggressive "CRITICAL: YOU MUST" tool instructions; 4.6 follows the system prompt much more closely.

---

## Step 0: Confirm the migration scope

**Before any Write, Edit, or MultiEdit call, confirm the scope.** If the user's request does not explicitly name a single file, a specific directory, or an explicit file list, **ask first \u2014 do not start editing**. This is non-negotiable: even imperative-sounding requests like "migrate my codebase", "move my project to X", "upgrade to Sonnet 4.6", or bare "migrate to Opus 4.7" leave the scope ambiguous and require a clarifying question. Phrases like "my project", "my code", "my codebase", "the whole thing", "everywhere", or "across the repo" are **ambiguous, not directive** \u2014 they tell you *what* to do but not *where*. Ask before doing.

Offer the common scopes explicitly and wait for the answer before touching any file:

1. The entire working directory
2. A specific subdirectory (e.g. \`src/\`, \`app/\`, \`services/billing/\`)
3. A specific file or a list of files

Surface this as a single clarifying question so the user can answer in one turn. **Proceed without asking only when the scope is already unambiguous** \u2014 the user named an exact file ("migrate \`extract.py\` to Sonnet 4.6"), pointed at a specific directory ("migrate everything under \`services/billing/\` to Opus 4.6"), listed specific files ("update \`a.py\` and \`b.py\`"), or already answered the scope question in an earlier turn. If you can answer the question "which files is this change going to touch?" with a precise list from the prompt alone, proceed. If not, ask.

**Worked example.** If the user says *"Move my project to Opus 4.6. I want adaptive thinking everywhere it makes sense."* you do not know whether "my project" means the whole working directory, just \`src/\`, just the production code, or something else \u2014 the \`everywhere\` makes the intent clear (update every call site *within scope*) but the scope itself is still not defined. Do not start editing. Respond with:

> Before I start editing, can you confirm the scope? I can migrate:
> 1. Every \`.py\` file in the working directory
> 2. Just the files under \`src/\` (production code)
> 3. A specific subdirectory or list of files you name
>
> Which one?

Then wait for the answer. The same applies to *"Migrate to Opus 4.7"* and bare *"Help me upgrade to Sonnet 4.6"* \u2014 ask before editing.

**Sizing the scope question (large repos).** Before asking, get a per-directory count so the user can pick concretely:

\`\`\`sh
rg -l "<old-model-id>" --type-not md | cut -d/ -f1 | sort | uniq -c | sort -rn
\`\`\`

Present the breakdown in your scope question (e.g. *"Found 217 references across 3 directories: api/ (130), api-go/ (62), routing/ (25). Which to migrate?"*). Also confirm \`git status\` is clean before surveying \u2014 unexpected modifications mean a concurrent process; stop and investigate before proceeding.

---

## Step 1: Classify each file

Not every file that contains the old model ID is a **caller** of the API. Before editing, classify each file into one of these buckets \u2014 the right action differs:

| # | Bucket | What it looks like | Action |
|---|---|---|---|
| 1 | **Calls the API/SDK** | \`client.messages.create(model=\u2026)\`, \`anthropic.Anthropic()\`, request payloads | Swap the model ID **and** apply the breaking-change checklist for the target version (below). |
| 2 | **Defines or serves the model** | Model registries, OpenAPI specs, routing/queue configs, model-policy enums, generated catalogs | The old entry **stays** (the model is still served). Ask whether to (a) add the new model alongside, (b) leave alone, or (c) retire the old model \u2014 never blind-replace. **If you can't ask, default to (a): add the new model alongside and flag it** \u2014 replacing would de-register a model that's still in production. |
| 3 | **References the ID as an opaque string** | UI fallback constants, capability-gate substring checks, generic test fixtures, label parsers, env defaults | Usually swap the string and verify any parser/regex/substring match handles the new ID \u2014 but check the sub-cases below first. |
| 4 | **Suffixed variant ID** | \`claude-<model>-<suffix>\` like \`-fast\`, \`-1024k\`, \`-200k\`, \`[1m]\`, dated snapshots | These are deployment/routing identifiers, not the public model ID. **Do not assume a new-model equivalent exists.** Verify in the registry first; if absent, leave the string alone and flag it. **Exception: \`-fast\` strings (e.g. \`claude-opus-4-6-fast\`) are handled by the Fast Mode section below**, which rewrites them to Opus 4.8 plus \`speed="fast"\` and the \`fast-mode-2026-02-01\` beta rather than leaving them in place. |

**Bucket 3 sub-cases \u2014 before swapping a string reference, check:**

- **Capability gate** (e.g. \`if 'opus-4-6' in model_id:\` enables a feature) \u2192 **add the new ID alongside**, don't replace. The old model is still served and still has the capability, so replacing would silently disable the feature for any old-model traffic that still flows through. If you know no old-model traffic will hit this gate (single-caller codebase fully migrating), replacing is fine; if unsure, add alongside.
- **Registry-assert test** (e.g. \`assert "claude-X" in supported_models\`, \`test_X_has_N_clusters\`) \u2192 **add an assertion for the new model alongside; keep the old one.** The old model is still served, so its assertion stays valid \u2014 but the registry should also include the new model, so assert that too. Heuristic: if the test references multiple model versions in a list, it's a registry test; if one model in a struct compared only to itself, it's a generic fixture.
- **Frozen / generated snapshot** \u2192 **regenerate**, don't hand-edit.
- **Coupled to a definer** (e.g. an integration test that passes model authorization via a shared \`conftest\` seed list, or asserts on a billing-tier / rate-limit-group enum or a generated SKU/pricing catalog) \u2192 **verify the definer has a new-model entry first.** If not, add a seed entry (reusing the nearest existing tier as a placeholder); if you can't confidently do that, ask the user how to populate the definer. **Do not skip the test.** Swapping without populating the definer will make the test fail at runtime.

When migrating tests specifically: breaking parameters (\`temperature\`, \`top_p\`, \`budget_tokens\`) are usually absent \u2014 test fixtures rarely set sampling params on placeholder models. The breaking-change scan is still required, but expect mostly clean results.

**Find intentionally-flagged sync points first.** Many codebases tag spots that must change at every model launch with comment markers like \`MODEL LAUNCH\`, \`KEEP IN SYNC\`, \`@model-update\`, or similar. Grep for whatever convention the repo uses *before* the broad model-ID grep \u2014 those markers point at the load-bearing changes.

---

## Per-SDK Syntax Reference

Code examples in this guide are Python. **The same fields exist in every official Anthropic SDK** \u2014 Stainless generates all 7 from the same OpenAPI spec, so JSON field names map 1:1 with only case-convention differences. Use the rows below to translate the Python examples to the SDK you are migrating.

> **Verify type and method names against the SDK source before writing them into customer code.** WebFetch the relevant repository from the SDK source-code table in \`shared/live-sources.md\` (one row per SDK) and confirm the exact symbol \u2014 particularly for typed SDKs (Go, Java, C#) where union/builder names can differ from the JSON shape. Do not guess type names that aren't in the table below or in \`<lang>/claude-api/README.md\`.

<!-- The rows below were verified against each SDK's \`synced/model-launch-april\` branch. -->

### \`thinking\` \u2014 \`budget_tokens\` \u2192 adaptive

| SDK | Before | After |
|---|---|---|
| Python | \`thinking={"type": "enabled", "budget_tokens": N}\` | \`thinking={"type": "adaptive"}\` |
| TypeScript | \`thinking: { type: 'enabled', budget_tokens: N }\` | \`thinking: { type: 'adaptive' }\` |
| Go | \`Thinking: anthropic.ThinkingConfigParamOfEnabled(N)\` | \`Thinking: anthropic.ThinkingConfigParamUnion{OfAdaptive: &anthropic.ThinkingConfigAdaptiveParam{}}\` |
| Ruby | \`thinking: { type: "enabled", budget_tokens: N }\` | \`thinking: { type: "adaptive" }\` |
| Java | \`.thinking(ThinkingConfigEnabled.builder().budgetTokens(N).build())\` | \`.thinking(ThinkingConfigAdaptive.builder().build())\` |
| C# | \`Thinking = new ThinkingConfigEnabled { BudgetTokens = N }\` | \`Thinking = new ThinkingConfigAdaptive()\` |
| PHP | \`thinking: ['type' => 'enabled', 'budget_tokens' => N]\` | \`thinking: ['type' => 'adaptive']\` |

### Sampling parameters \u2014 \`temperature\` / \`top_p\` / \`top_k\`

(Remove the field entirely on Opus 4.7; on Claude 4.x keep at most one of \`temperature\` or \`top_p\`.)

| SDK | Field(s) to remove |
|---|---|
| Python | \`temperature=\u2026\`, \`top_p=\u2026\`, \`top_k=\u2026\` |
| TypeScript | \`temperature: \u2026\`, \`top_p: \u2026\`, \`top_k: \u2026\` |
| Go | \`Temperature: anthropic.Float(\u2026)\`, \`TopP: anthropic.Float(\u2026)\`, \`TopK: anthropic.Int(\u2026)\` |
| Ruby | \`temperature: \u2026\`, \`top_p: \u2026\`, \`top_k: \u2026\` |
| Java | \`.temperature(\u2026)\`, \`.topP(\u2026)\`, \`.topK(\u2026)\` |
| C# | \`Temperature = \u2026\`, \`TopP = \u2026\`, \`TopK = \u2026\` |
| PHP | \`temperature: \u2026\`, \`topP: \u2026\`, \`topK: \u2026\` |

### Prefill replacement \u2014 structured outputs via \`output_config.format\`

| SDK | Remove (last assistant turn) | Add |
|---|---|---|
| Python | \`{"role": "assistant", "content": "\u2026"}\` | \`output_config={"format": {"type": "json_schema", "schema": SCHEMA}}\` |
| TypeScript | \`{ role: 'assistant', content: '\u2026' }\` | \`output_config: { format: { type: 'json_schema', schema: SCHEMA } }\` |
| Go | trailing \`anthropic.MessageParam{Role: "assistant", \u2026}\` | \`OutputConfig: anthropic.OutputConfigParam{Format: anthropic.JSONOutputFormatParam{\u2026}}\` |
| Ruby | \`{ role: "assistant", content: "\u2026" }\` | \`output_config: { format: { type: "json_schema", schema: SCHEMA } }\` |
| Java | trailing \`Message.builder().role(ASSISTANT)\u2026\` | \`.outputConfig(OutputConfig.builder().format(JsonOutputFormat.builder()\u2026build()).build())\` |
| C# | trailing \`new Message { Role = "assistant", \u2026 }\` | \`OutputConfig = new OutputConfig { Format = new JsonOutputFormat { \u2026 } }\` |
| PHP | trailing \`['role' => 'assistant', 'content' => '\u2026']\` | \`outputConfig: ['format' => ['type' => 'json_schema', 'schema' => $SCHEMA]]\` |

### \`thinking.display\` \u2014 opt back into summarized reasoning (Opus 4.7)

| SDK | Add |
|---|---|
| Python | \`thinking={"type": "adaptive", "display": "summarized"}\` |
| TypeScript | \`thinking: { type: 'adaptive', display: 'summarized' }\` |
| Go | \`Thinking: anthropic.ThinkingConfigParamUnion{OfAdaptive: &anthropic.ThinkingConfigAdaptiveParam{Display: anthropic.ThinkingConfigAdaptiveDisplaySummarized}}\` |
| Ruby | \`thinking: { type: "adaptive", display: "summarized" }\` (or \`display_:\` when constructing the model class directly) |
| Java | \`.thinking(ThinkingConfigAdaptive.builder().display(ThinkingConfigAdaptive.Display.SUMMARIZED).build())\` |
| C# | \`Thinking = new ThinkingConfigAdaptive { Display = Display.Summarized }\` |
| PHP | \`thinking: ['type' => 'adaptive', 'display' => 'summarized']\` |

For any field not in these tables, the JSON key in the Python example translates directly: \`snake_case\` for Python/TypeScript/Ruby, \`camelCase\` named args for PHP, \`PascalCase\` struct fields for Go/C#, \`camelCase\` builder methods for Java.

---

## Explain every change you make

Migration edits often look arbitrary to a user who hasn't read the release notes \u2014 a removed \`temperature\`, a deleted prefill, a rewritten system-prompt sentence. **For each edit, tell the user what you changed and why**, tied to the specific API or behavioral change that motivates it. Do this in your summary as you work, not just at the end.

Be especially explicit about **system-prompt edits**. Users are rightly protective of their prompts, and prompt-tuning changes are judgment calls (not hard API requirements). For any prompt edit:

- Quote the before and after text.
- State the behavioral shift that motivates it (e.g. *"Opus 4.7 calibrates response length to task complexity, so I added an explicit length instruction"*, or *"4.6 follows instructions more literally, so 'CRITICAL: YOU MUST use the search tool' will now overtrigger \u2014 softened to 'Use the search tool when\u2026'"*).
- Make clear which prompt edits are **optional tuning** (tone, length, subagent guidance) versus which code edits are **required to avoid a 400** (sampling params, \`budget_tokens\`, prefills). Never present an optional prompt change as mandatory.

If you're applying several prompt-tuning edits at once, offer them as a short list the user can accept or decline item-by-item rather than silently rewriting their system prompt.

---

## Before You Migrate

1. **Confirm the target model ID.** Use only the exact strings from \`shared/models.md\` \u2014 do not append date suffixes to aliases (\`claude-opus-4-6\`, not \`claude-opus-4-6-20251101\`). Guessing an ID will 404.
2. **Check which features your code uses** with this checklist:
   - \`thinking: {type: "enabled", budget_tokens: N}\` \u2192 migrate to adaptive thinking on Opus 4.6 / Sonnet 4.6 (still functional but deprecated)
   - Assistant-turn prefills (\`messages\` ending with \`role: "assistant"\`) \u2192 must change on Opus 4.6 / Sonnet 4.6 (returns 400)
   - \`output_format\` parameter on \`messages.create()\` \u2192 must change on all models (deprecated API-wide)
   - \`max_tokens > ~16000\` \u2192 must stream on any model (above ~16K risks SDK HTTP timeouts). When streaming, every current model reaches 128K except Haiku 4.5, which caps at 64K
   - Beta headers \`effort-2025-11-24\`, \`fine-grained-tool-streaming-2025-05-14\`, \`interleaved-thinking-2025-05-14\` \u2192 GA on 4.6, remove them and switch from \`client.beta.messages.create\` to \`client.messages.create\`
   - Moving Sonnet 4.5 \u2192 Sonnet 4.6 with no \`effort\` set \u2192 4.6 defaults to \`high\`, which may change your latency/cost profile
   - System prompts with \`CRITICAL\`, \`MUST\`, \`If in doubt, use X\` language \u2192 likely to overtrigger on 4.6 (see Prompt-Behavior Changes)
   - Coming from 3.x / 4.0 / 4.1: also check sampling params (\`temperature\` + \`top_p\`), tool versions (\`text_editor_20250728\`), \`refusal\` + \`model_context_window_exceeded\` stop reasons, trailing-newline tool-param handling
3. **Test on a single request first.** Run one call against the new model, inspect the response, then roll out.

---

## Destination Models (recommended targets)

| If you're on\u2026                         | Migrate to         | Why                                               |
| ------------------------------------- | ------------------ | ------------------------------------------------- |
| Claude Mythos Preview (\`claude-mythos-preview\`) | \`{{MYTHOS_ID}}\` (Project Glasswing successor) or \`{{FABLE_ID}}\` (GA) | Same tokenizer family \u2014 mostly a model-ID swap; remove \`thinking\` config and prefill; see Migrating to {{FABLE_NAME}} |
| Opus 4.7                              | \`claude-opus-4-8\`  | Most capable Opus-tier model; same API surface as 4.7 (no new breaking changes) \u2014 mostly prompt re-tuning; see Migrating to Opus 4.8 |
| Opus 4.6                              | \`claude-opus-4-8\`  | Apply the Opus 4.7 breaking changes, then the 4.8 re-tuning |
| Opus 4.0 / 4.1 / 4.5 / Opus 3         | \`claude-opus-4-8\`  | Apply 4.6 \u2192 4.7 \u2192 4.8 in order (adaptive thinking, drop sampling params, then re-tune) |
| Sonnet 4.6                            | \`{{SONNET_NEXT_ID}}\` | Near-Opus quality on agentic and coding work at Sonnet cost; adaptive thinking on by default; see Migrating to {{SONNET_NEXT_NAME}} |
| Sonnet 4.0 / 4.5 / 3.7 / 3.5          | \`{{SONNET_NEXT_ID}}\` | Apply the Sonnet 4.6 changes first, then the {{SONNET_NEXT_NAME}} section |
| Haiku 3 / 3.5                         | \`claude-haiku-4-5\` | Fastest and most cost-effective                   |

Default to the latest Opus for the caller's tier unless they explicitly chose otherwise. The Opus migrations layer: if you're on Opus 4.6 or older, apply each version's section in order up to your target (e.g. 4.5 \u2192 4.8 means the 4.6, 4.7, and 4.8 sections in sequence). A 4.7 \u2192 4.8 move has no new breaking changes \u2014 see Migrating to Opus 4.8 below.

---

## Retired Model Replacements

These models return 404 \u2014 update immediately:

| Retired model                 | Retired       | Drop-in replacement  |
| ----------------------------- | ------------- | -------------------- |
| \`claude-3-7-sonnet-20250219\`  | Feb 19, 2026  | \`{{SONNET_NEXT_ID}}\` |
| \`claude-3-5-haiku-20241022\`   | Feb 19, 2026  | \`claude-haiku-4-5\`   |
| \`claude-3-opus-20240229\`      | Jan 5, 2026   | \`claude-opus-4-8\`    |
| \`claude-3-5-sonnet-20241022\`  | Oct 28, 2025  | \`{{SONNET_NEXT_ID}}\` |
| \`claude-3-5-sonnet-20240620\`  | Oct 28, 2025  | \`{{SONNET_NEXT_ID}}\` |
| \`claude-3-sonnet-20240229\`    | Jul 21, 2025  | \`{{SONNET_NEXT_ID}}\` |
| \`claude-2.1\`, \`claude-2.0\`    | Jul 21, 2025  | \`{{SONNET_NEXT_ID}}\` |

## Deprecated Models (retiring soon)

| Model                         | Retires       | Replacement          |
| ----------------------------- | ------------- | -------------------- |
| \`claude-3-haiku-20240307\`     | Apr 19, 2026  | \`claude-haiku-4-5\`   |
| \`claude-opus-4-20250514\`      | June 15, 2026 | \`claude-opus-4-8\`    |
| \`claude-sonnet-4-20250514\`    | June 15, 2026 | \`{{SONNET_NEXT_ID}}\` |

---

## Breaking Changes by Source Model

### Migrating from Sonnet 4.5 to Sonnet 4.6 (effort default change)

Sonnet 4.5 had no \`effort\` parameter; Sonnet 4.6 defaults to \`high\`. If you just switch the model string and do nothing else, you may see noticeably higher latency and token usage. Set \`effort\` explicitly.

**Recommended starting points:**

| Workload                                          | Start at       | Notes                                                                                                    |
| ------------------------------------------------- | -------------- | -------------------------------------------------------------------------------------------------------- |
| Chat, classification, content generation          | \`low\`          | With \`thinking: {"type": "disabled"}\` you'll see similar or better performance vs. Sonnet 4.5 no-thinking |
| Most applications (balanced)                      | \`medium\`       | The default sweet spot for quality vs. cost                                                              |
| Agentic coding, tool-heavy workflows              | \`medium\`       | Pair with adaptive thinking and a generous \`max_tokens\` (up to 128K with streaming \u2014 Sonnet 4.6's ceiling) |
| Autonomous multi-step agents, long-horizon loops  | \`high\`         | Scale down to \`medium\` if latency/tokens become a concern                                                 |
| Computer-use agents                               | \`high\` + adaptive | Sonnet 4.6's best computer-use accuracy is on adaptive + high                                          |

For non-thinking chat workloads specifically:

\`\`\`python
client.messages.create(
    model="claude-sonnet-4-6",
    max_tokens=8192,
    thinking={"type": "disabled"},
    output_config={"effort": "low"},
    messages=[{"role": "user", "content": "..."}],
)
\`\`\`

**When to use Opus 4.6 instead:** hardest and longest-horizon problems \u2014 large code migrations, deep research, extended autonomous work. Sonnet 4.6 wins on fast turnaround and cost efficiency.

### Migrating to Opus 4.6 / Sonnet 4.6 (from any older model)

**1. Manual extended thinking is deprecated \u2014 use adaptive thinking.**

\`thinking: {type: "enabled", budget_tokens: N}\` (manual extended thinking with a fixed token budget) is deprecated on Opus 4.6 and Sonnet 4.6. Replace it with \`thinking: {type: "adaptive"}\`, which lets Claude decide when and how much to think. Adaptive thinking also enables interleaved thinking automatically (no beta header needed).

\`\`\`python
# Old (still works on older models, deprecated on 4.6)
response = client.messages.create(
    model="claude-sonnet-4-5",
    max_tokens=16000,
    thinking={"type": "enabled", "budget_tokens": 8000},
    messages=[...]
)

# New (Opus 4.6 / Sonnet 4.6)
response = client.messages.create(
    model="claude-opus-4-6",  # or "claude-sonnet-4-6"
    max_tokens=16000,
    thinking={"type": "adaptive"},
    output_config={"effort": "high"},  # optional: low | medium | high | max
    messages=[...]
)
\`\`\`

Adaptive thinking is the long-term target, and on internal evaluations it outperforms manual extended thinking. Move when you can.

**Transitional escape hatch:** manual extended thinking is still *functional* on Opus 4.6 and Sonnet 4.6 (deprecated, will be removed in a future release). If you need a hard ceiling while migrating \u2014 for example, to bound token spend on a runaway workload before you've tuned \`effort\` \u2014 you can keep \`budget_tokens\` around alongside an explicit \`effort\` value, then remove it in a follow-up. \`budget_tokens\` must be strictly less than \`max_tokens\`:

\`\`\`python
# Transitional only \u2014 deprecated, plan to remove
client.messages.create(
    model="claude-sonnet-4-6",
    max_tokens=16384,
    thinking={"type": "enabled", "budget_tokens": 8192},  # must be < max_tokens
    output_config={"effort": "medium"},
    messages=[...],
)
\`\`\`

If the user asks for a "thinking budget" on 4.6, the preferred answer is \`effort\` \u2014 use \`low\`, \`medium\`, \`high\`, or \`max\` rather than a token count.

**2. Effort parameter (Opus 4.5, Opus 4.6, Sonnet 4.6 only).**

Controls thinking depth and overall token spend. Goes inside \`output_config\`, not top-level. Default is \`high\`. \`max\` is supported on Fable 5, Opus 4.6 and later, Sonnet 5, and Sonnet 4.6 \u2014 it errors on Sonnet 4.5 and Haiku 4.5.

\`\`\`python
output_config={"effort": "medium"}  # often the best cost / quality balance
\`\`\`

### Migrating to the 4.6 family (Opus 4.6 and Sonnet 4.6)

**3. Assistant-turn prefills return 400 (Opus 4.6 and Sonnet 4.6).**

Prefilled responses on the final assistant turn are no longer supported on either Opus 4.6 or Sonnet 4.6 \u2014 both return a 400. Adding assistant messages *elsewhere* in the conversation (e.g., for few-shot examples) still works. Pick the replacement that matches what the prefill was doing:

| Prefill was used for                               | Replacement                                                                                                                               |
| -------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| Forcing JSON / YAML / schema output                | \`output_config.format\` with a \`json_schema\` \u2014 see example below                                                                           |
| Forcing a classification label                     | Tool with an enum field containing valid labels, or structured outputs                                                                    |
| Skipping preambles (\`Here is the summary:\\n\`)      | System prompt instruction: *"Respond directly without preamble. Do not start with phrases like 'Here is...' or 'Based on...'."*           |
| Steering around bad refusals                       | Usually no longer needed \u2014 4.6 refuses far more appropriately. Plain user-turn prompting is sufficient.                                   |
| Continuing an interrupted response                 | Move continuation into the user turn: *"Your previous response was interrupted and ended with \`[last text]\`. Continue from there."*     |
| Injecting reminders / context hydration            | Inject into the user turn instead. For complex agent harnesses, expose context via a tool call or during compaction.                      |

\`\`\`python
# Old (fails on Opus 4.6 / Sonnet 4.6) \u2014 prefill forcing JSON shape
messages=[
    {"role": "user", "content": "Extract the name."},
    {"role": "assistant", "content": "{\\"name\\": \\""},
]

# New \u2014 structured outputs replace the prefill
response = client.messages.create(
    model="claude-opus-4-6",
    max_tokens=1024,
    output_config={"format": {"type": "json_schema", "schema": {...}}},
    messages=[{"role": "user", "content": "Extract the name."}],
)
\`\`\`

**4. Stream for \`max_tokens > ~16K\` (all models); only Haiku 4.5 caps lower, at 64K.**

Non-streaming requests hit SDK HTTP timeouts at high \`max_tokens\`, regardless of model \u2014 stream for anything above ~16K output. The streamable ceiling is 128K for every current model except Haiku 4.5, which caps at 64K.

\`\`\`python
with client.messages.stream(model="claude-opus-4-6", max_tokens=64000, ...) as stream:
    message = stream.get_final_message()
\`\`\`

**5. Tool-call JSON escaping may differ (Opus 4.6 and Sonnet 4.6).**

Both 4.6 models can produce tool call \`input\` fields with Unicode or forward-slash escaping. Always parse with \`json.loads()\` / \`JSON.parse()\` \u2014 never raw-string-match the serialized input.

### All models

**6. \`output_format\` \u2192 \`output_config.format\` (API-wide).**

The old top-level \`output_format\` parameter on \`messages.create()\` is deprecated. Use \`output_config.format\` instead. This is not 4.6-specific \u2014 applies to every model.

---

## Beta Headers to Remove on 4.6

Several beta headers that were required on 4.5 are now GA on 4.6 and should be removed. Leaving them in is harmless but misleading; removing them also lets you move from \`client.beta.messages.create(...)\` back to \`client.messages.create(...)\`.

| Header                                    | Status on 4.6                                              | Action                                                  |
| ----------------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------- |
| \`effort-2025-11-24\`                       | Effort parameter is GA                                     | Remove                                                  |
| \`fine-grained-tool-streaming-2025-05-14\`  | GA                                                         | Remove                                                  |
| \`interleaved-thinking-2025-05-14\`         | Adaptive thinking enables interleaved thinking automatically | Remove when using adaptive thinking; still functional on Sonnet 4.6 *with* manual extended thinking, but that path is deprecated |
| \`token-efficient-tools-2025-02-19\`        | Built in to all Claude 4+ models                           | Remove (no effect)                                      |
| \`output-128k-2025-02-19\`                  | Built in to Claude 4+ models                               | Remove (no effect)                                      |

Once you remove all of these and finish moving to adaptive thinking, you can switch the SDK call site from the beta namespace back to the regular one:

\`\`\`python
# Before
response = client.beta.messages.create(
    model="claude-opus-4-5",
    betas=["interleaved-thinking-2025-05-14", "effort-2025-11-24"],
    ...
)

# After
response = client.messages.create(
    model="claude-opus-4-6",
    thinking={"type": "adaptive"},
    output_config={"effort": "high"},
    ...
)
\`\`\`

---

## Additional Changes When Coming from 3.x / 4.0 / 4.1 \u2192 4.6

If you're jumping from Opus 4.1, Sonnet 4, Sonnet 3.7, or an older Claude 3.x model directly to 4.6, apply everything above *plus* the items in this section. Users already on Opus 4.5 / Sonnet 4.5 can skip this.

**1. Sampling parameters: \`temperature\` OR \`top_p\`, not both.**

Passing both will error on every Claude 4+ model:

\`\`\`python
# Old (3.x only \u2014 errors on 4+)
client.messages.create(temperature=0.7, top_p=0.9, ...)

# New
client.messages.create(temperature=0.7, ...)  # or top_p, not both
\`\`\`

**2. Update tool versions.**

Legacy tool versions are not supported on 4+. **Both the \`type\` and the \`name\` field change** \u2014 \`text_editor_20250728\` and \`str_replace_based_edit_tool\` are a pair; updating one without the other 400s. Also remove the \`undo_edit\` command from your text-editor integration:

| Old                                               | New                                                     |
| ------------------------------------------------- | ------------------------------------------------------- |
| \`text_editor_20250124\` + \`str_replace_editor\`     | \`text_editor_20250728\` + \`str_replace_based_edit_tool\`  |
| \`code_execution_*\` (earlier versions)             | \`code_execution_20260521\`                               |
| \`undo_edit\` command                               | *(no longer supported \u2014 delete call sites)*             |

\`\`\`python
# Before
tools = [{"type": "text_editor_20250124", "name": "str_replace_editor"}]

# After \u2014 BOTH fields change
tools = [{"type": "text_editor_20250728", "name": "str_replace_based_edit_tool"}]
\`\`\`

**3. Handle the \`refusal\` stop reason.**

Claude 4+ can return \`stop_reason: "refusal"\` on the response. If your code only handles \`end_turn\` / \`tool_use\` / \`max_tokens\`, add a branch:

\`\`\`python
if response.stop_reason == "refusal":
    # Surface the refusal to the user; do not retry with the same prompt
    ...
\`\`\`

**4. Handle the \`model_context_window_exceeded\` stop reason (4.5+).**

Distinct from \`max_tokens\`: it means the model hit the *context window* limit, not the requested output cap. Handle both:

\`\`\`python
if response.stop_reason == "model_context_window_exceeded":
    # Context window exhausted \u2014 compact or split the conversation
    ...
elif response.stop_reason == "max_tokens":
    # Requested output cap hit \u2014 retry with higher max_tokens or stream
    ...
\`\`\`

**5. Trailing newlines preserved in tool call string parameters (4.5+).**

4.5 and 4.6 preserve trailing newlines that older models stripped. If your tool implementations do exact string matching against tool-call \`input\` values (e.g., \`if name == "foo"\`), verify they still match when the model sends \`"foo\\n"\`. Normalizing with \`.rstrip()\` on the receiving side is usually the simplest fix.

**6. Haiku: rate limits reset between generations.**

Haiku 4.5 has its own rate-limit pool separate from Haiku 3 / 3.5. If you're ramping traffic as you migrate, check your tier's Haiku 4.5 limits at [API rate limits](https://platform.claude.com/docs/en/api/rate-limits) \u2014 a quota that comfortably served Haiku 3.5 traffic may need a tier bump for the same volume on 4.5.

---

## Prompt-Behavior Changes (Opus 4.5 / 4.6, Sonnet 4.6)

These don't break your code, but prompts that worked on 4.5-and-earlier may over- or under-trigger on 4.6. Tune as needed.

**1. Aggressive instructions cause overtriggering.** Opus 4.5 and 4.6 follow the system prompt much more closely than earlier models. Prompts written to *overcome* the old reluctance are now too aggressive:

| Before (worked on 4.0 / 4.5)                | After (use on 4.6)                        |
| ------------------------------------------- | ----------------------------------------- |
| \`CRITICAL: You MUST use this tool when...\`  | \`Use this tool when...\`                   |
| \`Default to using [tool]\`                   | \`Use [tool] when it would improve X\`      |
| \`If in doubt, use [tool]\`                   | *(delete \u2014 no longer needed)*             |

If the model is now overtriggering a tool or skill, the fix is almost always to dial back the language, not to add more guardrails.

**2. Overthinking and excessive exploration (Opus 4.6).** At higher \`effort\` settings, Opus 4.6 explores more before answering. If that burns too many thinking tokens, lower \`effort\` first (\`medium\` is often the sweet spot) before adding prose instructions to constrain reasoning.

**3. Overeager subagent spawning (Opus 4.6).** Opus 4.6 has a strong preference for delegating to subagents. If you see it spawning a subagent for something a direct \`grep\` or \`read\` would solve, add guidance: *"Use subagents only for parallel or independent workstreams. For single-file reads or sequential operations, work directly."*

**4. Overengineering (Opus 4.5 / 4.6).** Both models may add extra files, abstractions, or defensive error handling beyond what was asked. If you want minimal changes, prompt for it explicitly: *"Only make changes directly requested. Don't add helpers, abstractions, or error handling for scenarios that can't happen."*

**5. LaTeX math output (Opus 4.6).** Opus 4.6 defaults to LaTeX (\`\\frac{}{}\`, \`$...$\`) for math and technical content. If you need plain text, instruct it explicitly: *"Format all math as plain text \u2014 no LaTeX, no \`$\`, no \`\\frac{}{}\`. Use \`/\` for division and \`^\` for exponents."*

**6. Skipped verbal summaries (4.6 family).** The 4.6 models are more concise and may skip the summary paragraph after a tool call, jumping straight to the next action. If you rely on those summaries for visibility, add: *"After completing a task that involves tool use, provide a brief summary of what you did."*

**7. "Think" as a trigger word (Opus 4.5 with thinking disabled).** When \`thinking\` is off, Opus 4.5 is particularly sensitive to the word *think* and may reason more than you want. Use \`consider\`, \`evaluate\`, or \`reason through\` instead.

---

## Model-ID Rename Quick Reference

| Old string (migration source)  | New string         |
| ------------------------------ | ------------------ |
| \`claude-opus-4-7\`              | \`claude-opus-4-8\`  |
| \`claude-opus-4-6\`              | \`claude-opus-4-8\`  |
| \`claude-opus-4-5\`              | \`claude-opus-4-8\`  |
| \`claude-opus-4-1\`              | \`claude-opus-4-8\`  |
| \`claude-opus-4-0\`              | \`claude-opus-4-8\`  |
| \`claude-mythos-preview\`        | \`{{MYTHOS_ID}}\` (Project Glasswing) or \`{{FABLE_ID}}\` |
| \`claude-sonnet-4-6\`            | \`{{SONNET_NEXT_ID}}\`|
| \`claude-sonnet-4-5\`            | \`{{SONNET_NEXT_ID}}\`|
| \`claude-sonnet-4-0\`            | \`{{SONNET_NEXT_ID}}\`|

Older aliases (\`claude-opus-4-7\`, \`claude-opus-4-6\`, \`claude-opus-4-5\`, \`claude-sonnet-4-6\`, \`claude-sonnet-4-5\`, etc.) are still active and can be pinned if you need time before upgrading \u2014 see \`shared/models.md\` for the full legacy list.

### Amazon Bedrock model IDs

If the code uses the \`AnthropicBedrockMantle\` client (Python \`anthropic[bedrock]\`, TypeScript \`@anthropic-ai/bedrock-sdk\`, Java \`BedrockMantleBackend\`, Go \`bedrock.NewMantleClient\`, etc.) or targets \`https://bedrock-mantle.{region}.api.aws/anthropic\`, it is running on **Claude in Amazon Bedrock**. All breaking changes in this guide apply unchanged there \u2014 it serves the same Messages API shape \u2014 but model IDs carry an \`anthropic.\` provider prefix:

| First-party ID | Bedrock ID |
|---|---|
| \`claude-opus-4-8\` | \`anthropic.claude-opus-4-8\` |
| \`claude-opus-4-7\` | \`anthropic.claude-opus-4-7\` |
| \`{{SONNET_NEXT_ID}}\` | \`anthropic.{{SONNET_NEXT_ID}}\` |
| \`claude-haiku-4-5\` | \`anthropic.claude-haiku-4-5\` |

When migrating a Bedrock file, apply the same rename-table row as first-party, then keep/add the \`anthropic.\` prefix. Do **not** generate a first-party \`claude-*\` ID for a Bedrock client \u2014 it will 400.

**Skip for Bedrock:** the \`code_execution_*\` tool-version checklist item and the **Task Budgets** section \u2014 neither is available on Bedrock (see \`shared/platform-availability.md\` for the per-feature table). Everything else in this guide \u2014 \`effort\`, adaptive/extended thinking, \`output_config.format\`, \`thinking.display\`, fine-grained tool streaming, token counting \u2014 is available on Bedrock.

> **Out of scope:** the legacy Amazon Bedrock integration (\`InvokeModel\` / \`Converse\` APIs with ARN-versioned IDs like \`anthropic.claude-3-5-sonnet-20241022-v2:0\`) uses a different request shape and model-ID format. This guide does not cover it; WebFetch the Bedrock page in \`shared/live-sources.md\` if the user is migrating between the two Bedrock integrations.

### Claude Platform on AWS

If the code uses \`AnthropicAWS\` / \`AnthropicAws\` / \`anthropicaws.NewClient\` / \`AnthropicAwsClient\` (or targets \`https://aws-external-anthropic.{region}.api.aws\`), it is running on **Claude Platform on AWS** \u2014 Anthropic-operated, same-day API parity. Model IDs are **bare first-party** strings; apply the rename table above **verbatim** and every breaking-change section in this guide unchanged. There is nothing to skip. Do **not** add an \`anthropic.\` prefix (that's Amazon Bedrock, a separate offering). See \`shared/claude-platform-on-aws.md\` for client/auth details.

---

## Migration Checklist

Every item is tagged: **\`[BLOCKS]\`** items cause a 400 error, infinite loop, silent timeout, or wrong tool selection if missed \u2014 apply these as code edits, not as suggestions. **\`[TUNE]\`** items are quality/cost adjustments.

For each file that calls \`messages.create()\` / equivalent SDK method:

- [ ] **[BLOCKS]** Update the \`model=\` string to the new alias
- [ ] **[BLOCKS]** Replace \`budget_tokens\` with \`thinking={"type": "adaptive"}\` (deprecated on Opus 4.6 / Sonnet 4.6)
- [ ] **[BLOCKS]** Move \`format\` from top-level \`output_format\` into \`output_config.format\`
- [ ] **[BLOCKS]** Remove any assistant-turn prefills if targeting Opus 4.6 or Sonnet 4.6 (see the prefill replacement table)
- [ ] **[BLOCKS]** Switch to streaming if \`max_tokens > ~16000\` (otherwise SDK HTTP timeout)
- [ ] **[TUNE]** Verify tool-input handling parses JSON rather than raw-string-matching the serialized input (4.6 may escape Unicode / forward slashes differently; most SDKs already expose \`block.input\` as a parsed object)
- [ ] **[TUNE]** Set \`output_config={"effort": "..."}\` explicitly \u2014 especially when moving Sonnet 4.5 \u2192 Sonnet 4.6 (4.6 defaults to \`high\`)
- [ ] **[TUNE]** Remove GA beta headers: \`effort-2025-11-24\`, \`fine-grained-tool-streaming-2025-05-14\`, \`token-efficient-tools-2025-02-19\`, \`output-128k-2025-02-19\`; remove \`interleaved-thinking-2025-05-14\` once on adaptive thinking
- [ ] **[TUNE]** Switch \`client.beta.messages.create(...)\` \u2192 \`client.messages.create(...)\` once all betas are removed
- [ ] **[TUNE]** Review system prompt for aggressive tool language (\`CRITICAL:\`, \`MUST\`, \`If in doubt\`) and dial it back

**Extra items when coming from 3.x / 4.0 / 4.1:**
- [ ] **[BLOCKS]** Remove either \`temperature\` or \`top_p\` (passing both 400s on Claude 4+)
- [ ] **[BLOCKS]** Update text-editor tool \`type\` to \`text_editor_20250728\`
- [ ] **[BLOCKS]** Update text-editor tool \`name\` to \`str_replace_based_edit_tool\` \u2014 **changing only the \`type\` and keeping \`name: "str_replace_editor"\` returns a 400**
- [ ] **[BLOCKS]** Update code-execution tool to \`code_execution_20260521\`
- [ ] **[BLOCKS]** Delete any \`undo_edit\` command call sites
- [ ] **[TUNE]** Add handling for \`stop_reason == "refusal"\`
- [ ] **[TUNE]** Add handling for \`stop_reason == "model_context_window_exceeded"\` (4.5+)
- [ ] **[TUNE]** Verify tool-param string matching tolerates trailing newlines (preserved on 4.5+)
- [ ] **[TUNE]** If moving to Haiku 4.5: review rate-limit tier (separate pool from Haiku 3.x)

**Verification:**
- [ ] Run one test request and inspect \`response.stop_reason\`, \`response.usage\`, and whether tool-use / thinking behavior matches expectations

For cached prompts: the render order and hash inputs did not change, so existing \`cache_control\` breakpoints keep working. However, **changing the model string invalidates the existing cache** \u2014 the first request on the new model will write the cache fresh.

---

## Migrating to Opus 4.7

> **Model ID \`claude-opus-4-7\` is authoritative as written here.** When the user asks to migrate to Opus 4.7, write \`model="claude-opus-4-7"\` exactly. Do **not** WebFetch to verify \u2014 this guide is the source of truth for migration target IDs. The corresponding entry exists in \`shared/models.md\`.

Claude Opus 4.7 was Anthropic's most capable model at its launch and is now the previous-generation Opus (Opus 4.8 is current \u2014 see Migrating to Opus 4.8 below). It is highly autonomous and performs exceptionally well on long-horizon agentic work, knowledge work, vision tasks, and memory tasks. This section summarizes everything that was new at the 4.7 launch and remains the layered breaking-change path for callers coming from Opus 4.6 or older. It is layered on top of the 4.6 migration above \u2014 if the caller is jumping from Opus 4.5 or older, apply the 4.6 changes first, then this section, then the 4.8 section.

**TL;DR for someone already on Opus 4.6:** update the model ID to \`claude-opus-4-7\`, strip any remaining \`budget_tokens\` and sampling parameters (both 400 on Opus 4.7), give \`max_tokens\` extra headroom and re-baseline with \`count_tokens()\` against the new model, opt back into \`thinking.display: "summarized"\` if reasoning is surfaced to users, and re-tune \`effort\` \u2014 it matters more on 4.7 than on any prior Opus.

### Breaking changes (will 400 on Opus 4.7)

**Extended thinking removed.**

\`thinking: {type: "enabled", budget_tokens: N}\` is no longer supported on Claude Opus 4.7 or later models and returns a 400 error. Switch to adaptive thinking (\`thinking: {type: "adaptive"}\`) and use the effort parameter to control thinking depth. Adaptive thinking is **off by default** on Claude Opus 4.7: requests with no \`thinking\` field run without thinking, matching Opus 4.6 behavior. Set \`thinking: {type: "adaptive"}\` explicitly to enable it.

\`\`\`python
# Before (Opus 4.6)
client.messages.create(
    model="claude-opus-4-6",
    max_tokens=64000,
    thinking={"type": "enabled", "budget_tokens": 32000},
    messages=[{"role": "user", "content": "..."}],
)

# After (Opus 4.7)
client.messages.create(
    model="claude-opus-4-7",
    max_tokens=64000,
    thinking={"type": "adaptive"},
    output_config={"effort": "high"},  # or "max", "xhigh", "medium", "low"
    messages=[{"role": "user", "content": "..."}],
)
\`\`\`

If the caller wasn't using extended thinking, no change is required \u2014 thinking is off by default, or can be set explicitly with \`thinking={"type": "disabled"}\`.

Delete \`budget_tokens\` plumbing entirely. For the replacement \`effort\` value, see **Choosing an effort level on Opus 4.7** below \u2014 there is no exact 1:1 mapping from \`budget_tokens\`.

**Sampling parameters removed.**

The \`temperature\`, \`top_p\`, and \`top_k\` parameters are no longer accepted on Claude Opus 4.7. Requests that include them return a 400 error. Remove these fields from your request payloads. Prompting is the recommended way to guide model behavior on Claude Opus 4.7. If you were using \`temperature = 0\` for determinism, note that it never guaranteed identical outputs on prior models.

\`\`\`python
# Before \u2014 errors on Opus 4.7
client.messages.create(temperature=0.7, top_p=0.9, ...)

# After
client.messages.create(...)  # no sampling params
\`\`\`

- **If the intent was determinism** \u2014 use \`effort: "low"\` with a tighter prompt.
- **If the intent was creative variance** \u2014 the prompt replacement depends on the use case; **ask the user** how they want variance elicited. If you can't ask, add a use-case-appropriate instruction along the lines of *"choose something off-distribution and interesting"* \u2014 e.g. for text generation, *"Vary your phrasing and structure across responses"*; for frontend/design, use the propose-4-directions approach under **Design and frontend coding** below.

### Choosing an effort level on Opus 4.7

\`budget_tokens\` controlled how much to *think*; \`effort\` controls how much to think *and* act, so there is no exact 1:1 mapping. **Use \`xhigh\` for best results in coding and agentic use cases, and a minimum of \`high\` for most intelligence-sensitive use cases.** Experiment with other levels to further tune token usage and intelligence:

| Level | Use when | Notes |
| --- | --- | --- |
| \`max\` | Intelligence-demanding tasks worth testing at the ceiling | Can deliver gains in some use cases but may show diminishing returns from increased token usage; can be prone to overthinking |
| \`xhigh\` | **Most coding and agentic use cases** | The best setting for these; used as the default in Claude Code |
| \`high\` | Intelligence-sensitive use cases generally | Balances token usage and intelligence; recommended minimum for most intelligence-sensitive work |
| \`medium\` | Cost-sensitive use cases that need to reduce token usage while trading off intelligence | |
| \`low\` | Short, scoped tasks and latency-sensitive workloads that are not intelligence-sensitive | |

### Silent default changes (no error, but behavior differs)

**Thinking content omitted by default.**

Thinking blocks still appear in the response stream on Claude Opus 4.7, but their \`thinking\` field is empty unless you explicitly opt in. This is a silent change from Claude Opus 4.6, where the default was to return summarized thinking text. To restore summarized thinking content on Claude Opus 4.7, set \`thinking.display\` to \`"summarized"\`. **The block-field name is unchanged** \u2014 it is still \`block.thinking\` on a \`thinking\`-type block; do not rename it.

**Detect this:** any code that reads \`block.thinking\` (or equivalent) from a \`thinking\`-type block and renders it in a UI, log, or trace. **The fix is the request parameter, not the response handling** \u2014 add \`display: "summarized"\` to the \`thinking\` parameter:

\`\`\`python
thinking={"type": "adaptive", "display": "summarized"}  # "display" is new on Opus 4.7; values: "omitted" (default) | "summarized"
\`\`\`

The default is \`"omitted"\` on Claude Opus 4.7. If thinking content was never surfaced anywhere, no change needed. If your product streams reasoning to users, the new default appears as a long pause before output begins; set \`display: "summarized"\` to restore visible progress during thinking.

**Updated token counting.**

Claude Opus 4.7 and Claude Opus 4.6 count tokens differently. The same input text produces a higher token count on Claude Opus 4.7 than on Claude Opus 4.6, and \`/v1/messages/count_tokens\` will return a different number of tokens for Claude Opus 4.7 than it did for Claude Opus 4.6. The token efficiency of Claude Opus 4.7 can vary by workload shape. Prompting interventions, \`task_budget\`, and \`effort\` can help control costs and ensure appropriate token usage. Keep in mind that these controls may trade off model intelligence. **Update your \`max_tokens\` parameters to give additional headroom, including compaction triggers.** Claude Opus 4.7 provides a 1M context window at standard API pricing with no long-context premium.

What else to check:

- Client-side token estimators (tiktoken-style approximations) calibrated against 4.6
- Cost calculators that multiply tokens by a fixed per-token rate
- Rate-limit retry thresholds keyed to measured token counts

Re-baseline by re-running \`client.messages.count_tokens()\` against \`claude-opus-4-7\` on a representative sample of the caller's prompts. Do not apply a blanket multiplier. For cost-sensitive workloads, consider reducing \`effort\` by one level (e.g. \`high\` \u2192 \`medium\`). For agentic loops, consider adopting Task Budgets (below).

### New feature: Task Budgets (beta)

Opus 4.7 introduces **task budgets** \u2014 tell Claude how many tokens it has for a full agentic loop (thinking + tool calls + final output). The model sees a running countdown and uses it to prioritize work and wrap up gracefully as the budget is consumed.

This is a **suggestion the model is aware of**, not a hard cap. It is distinct from \`max_tokens\`, which remains the enforced per-response limit and is *not* surfaced to the model. Use \`task_budget\` when you want the model to self-moderate; use \`max_tokens\` as a hard ceiling to cap usage.

Requires beta header \`task-budgets-2026-03-13\`:

\`\`\`python
client.beta.messages.create(
    betas=["task-budgets-2026-03-13"],
    model="claude-opus-4-7",
    max_tokens=64000,
    thinking={"type": "adaptive"},
    output_config={
        "effort": "high",
        "task_budget": {"type": "tokens", "total": 128000},
    },
    messages=[...],
)
\`\`\`

Set a generous budget for open-ended agentic tasks and tighten it for latency-sensitive ones. **Minimum \`task_budget.total\` is 20,000 tokens.** If the budget is too restrictive for the task, the model may complete it less thoroughly, referencing its budget as the constraint. **Do not add \`task_budget\` during a migration unless you are sure the budget value is right** \u2014 if you can run the workload and measure, do so; otherwise ask the user for the value rather than guessing. This is the primary lever for offsetting the token-counting shift on agentic workloads.

### Capability improvements

**High-resolution vision.** Opus 4.7 is the first Claude model with high-resolution image support. Maximum image resolution is **2576 pixels on the long edge** (up from 1568px on Opus 4.6 and prior). This unlocks gains on vision-heavy workloads, especially computer use and screenshot/artifact/document understanding. Coordinates returned by the model now map 1:1 to actual image pixels, so no scale-factor math is needed.

High-res support is **automatic on Opus 4.7** \u2014 no beta header, no client-side opt-in required. The model accepts larger inputs and returns pixel-accurate coordinates out of the box.

**Token cost.** Full-resolution images on Opus 4.7 can use up to ~3\xD7 more image tokens than on prior models (up to ~4784 tokens per image, vs. the previous ~1,600-token cap). If the extra fidelity isn't needed, downsample client-side before sending to control cost \u2014 but **do not add downsampling by default during a migration**. If you're not sure whether the pipeline needs the fidelity, ask the user rather than guessing. Use \`count_tokens()\` on representative images on Opus 4.7 to re-baseline before reacting to any measured cost shift.

Beyond resolution, Opus 4.7 also improves on low-level perception (pointing, measuring, counting) and natural-image bounding-box localization and detection.

**Knowledge work.** Meaningful gains on tasks where the model visually verifies its own output \u2014 \`.docx\` redlining, \`.pptx\` editing, and programmatic chart/figure analysis (e.g. pixel-level data transcription via image-processing libraries). If prompts have scaffolding like *"double-check the slide layout before returning"*, try removing it and re-baselining.

**Memory.** Opus 4.7 is better at writing and using file-system-based memory. If an agent maintains a scratchpad, notes file, or structured memory store across turns, that agent should improve at jotting down notes to itself and leveraging its notes in future tasks.

**User-facing progress updates.** Opus 4.7 provides more regular, higher-quality interim updates during long agentic traces. If the system prompt has scaffolding like *"After every 3 tool calls, summarize progress"*, try removing it to avoid excessive user-facing text. If the length or contents of Opus 4.7's updates are not well-calibrated to your use case, explicitly describe what these updates should look like in the prompt and provide examples.

### Real-time cybersecurity safeguards

Requests that involve prohibited or high-risk topics may lead to refusals.

### Fast Mode: Opus 4.8 / 4.7 only

Fast mode is available on Opus 4.8 and Opus 4.7. Only surface this if the caller's code actually uses fast mode (e.g. \`model="claude-opus-4-6-fast"\`, or \`speed="fast"\` on an unsupported model); if the word "fast" does not appear in the code, say nothing about Fast Mode.

When you see \`model="claude-opus-4-6-fast"\` (or any retired \`-fast\` model string), **the migration edit is** to move the fast-mode traffic onto Opus 4.8, the durable fast-capable tier:

\`\`\`python
# Request fast mode on Opus 4.8.
client.beta.messages.create(
    model="claude-opus-4-8", max_tokens=4096,
    speed="fast", betas=["fast-mode-2026-02-01"],
    messages=[...],
)
\`\`\`

That is: switch the model to Opus 4.8 and request fast mode the supported way, using the beta \`client.beta.messages.\u2026\` endpoint, the \`fast-mode-2026-02-01\` beta flag, and \`speed="fast"\` as a top-level request parameter (per-language form in SKILL.md \xA7 Fast Mode). Opus 4.7 also supports fast mode today, but it is itself being sunset (fast mode removed by default around Jul 25, 2026), so target Opus 4.8 as the durable choice rather than landing on a tier that is about to lose fast mode. Do **not** leave the code on a retired \`-fast\` model string \u2014 the failure mode differs by version: \`claude-opus-4-6-fast\` is already retired and the API **silently falls back** to standard Opus 4.6 (no error \u2014 the caller loses fast-mode speed without noticing); \`claude-opus-4-7-fast\`, once removed, will instead return an **API error** (hard failure \u2014 requests break outright rather than degrading). Either way, migrate to Opus 4.8 fast mode now.

### Behavioral shifts (prompt-tunable)

These don't break anything, but prompts tuned for Opus 4.6 may land differently. Opus 4.7 is more steerable than 4.6, so small prompt nudges usually close the gap.

**More literal instruction following.** Claude Opus 4.7 interprets prompts more literally and explicitly than Claude Opus 4.6, particularly at lower effort levels. It will not silently generalize an instruction from one item to another, and it will not infer requests you didn't make. The upside of this literalism is precision and less thrash. It generally performs better for API use cases with carefully tuned prompts, structured extraction, and pipelines where you want predictable behavior. A prompt and harness review may be especially helpful for migration to Claude Opus 4.7.

**Verbosity calibrates to task complexity.** Opus 4.7 scales response length to how complex it judges the task to be, rather than defaulting to a fixed verbosity \u2014 shorter answers on simple lookups, much longer on open-ended analysis. If the product depends on a particular length or style, tune the prompt explicitly. To reduce verbosity:

> *"Provide concise, focused responses. Skip non-essential context, and keep examples minimal."*

If you see specific kinds of over-verbosity (e.g. over-explaining), add instructions targeting those. Positive examples showing the desired level of concision tend to be more effective than negative examples or instructions telling the model what not to do. Do **not** assume existing "be concise" instructions should be removed \u2014 test first.

**Tone and writing style.** Opus 4.7 is more direct and opinionated, with less validation-forward phrasing and fewer emoji than Opus 4.6's warmer style. As with any new model, prose style on long-form writing may shift. If the product relies on a specific voice, re-evaluate style prompts against the new baseline. If a warmer or more conversational voice is wanted, specify it:

> *"Use a warm, collaborative tone. Acknowledge the user's framing before answering."*

**\`effort\` matters more than on any prior Opus.** Opus 4.7 respects \`effort\` levels more strictly, especially at the low end. At \`low\` and \`medium\` it scopes work to what was asked rather than going above and beyond \u2014 good for latency and cost, but on moderate tasks at \`low\` there is some risk of under-thinking.

- If shallow reasoning shows up on complex problems, raise \`effort\` to \`high\` or \`xhigh\` rather than prompting around it.
- If \`effort\` must stay \`low\` for latency, add targeted guidance: *"This task involves multi-step reasoning. Think carefully through the problem before responding."*
- **At \`xhigh\` or \`max\`, set a large \`max_tokens\`** so the model has room to think and act across tool calls and subagents. Start at 64K and tune from there. (\`xhigh\` is a new effort level on Opus 4.7, between \`high\` and \`max\`.)

Adaptive-thinking triggering is also steerable. If the model thinks more often than wanted \u2014 which can happen with large or complex system prompts \u2014 add: *"Thinking adds latency and should only be used when it will meaningfully improve answer quality \u2014 typically for problems that require multi-step reasoning. When in doubt, respond directly."*

**Uses tools less often by default.** Opus 4.7 tends to use tools less often than 4.6 and to use reasoning more. This produces better results in most cases, but for products that rely on tools (search/retrieval, function-calling, computer-use steps), it can drop tool-use rate. Two levers:

- **Raise \`effort\`** \u2014 \`high\` or \`xhigh\` show substantially more tool usage in agentic search and coding, and are especially useful for knowledge work.
- **Prompt for it** \u2014 be explicit in tool descriptions or the system prompt about when and how to use the tool, and encourage the model to err on the side of using it more often:

> *"When the answer depends on information not present in the conversation, you MUST call the \`search\` tool before answering \u2014 do not answer from prior knowledge."*

**Fewer subagents by default.** Opus 4.7 tends to spawn fewer subagents than 4.6. This is steerable \u2014 give explicit guidance on when delegation is desirable. For a coding agent, for example:

> *"Do NOT spawn a subagent for work you can complete directly in a single response (e.g. refactoring a function you can already see). Spawn multiple subagents in the same turn when fanning out across items or reading multiple files."*

**Design and frontend coding.** Opus 4.7 has stronger design instincts than 4.6, with a consistent default house style: warm cream/off-white backgrounds (around \`#F4F1EA\`), serif display type (Georgia, Fraunces, Playfair), italic word-accents, and a terracotta/amber accent. This reads well for editorial, hospitality, and portfolio briefs, but will feel off for dashboards, dev tools, fintech, healthcare, or enterprise apps \u2014 and it appears in slide decks as well as web UIs.

The default is persistent. Generic instructions ("don't use cream," "make it clean and minimal") tend to shift the model to a different fixed palette rather than producing variety. Two approaches work reliably:

1. **Specify a concrete alternative.** The model follows explicit specs precisely \u2014 give exact hex values, typefaces, and layout constraints.
2. **Have the model propose options before building.** This breaks the default and gives the user control:

   > *"Before building, propose 4 distinct visual directions tailored to this brief (each as: bg hex / accent hex / typeface \u2014 one-line rationale). Ask the user to pick one, then implement only that direction."*

If the caller previously relied on \`temperature\` for design variety, use approach (2) \u2014 it produces meaningfully different directions across runs.

Opus 4.7 also requires less frontend-design prompting than previous models to avoid generic "AI slop" aesthetics. Where earlier models needed a lengthy anti-slop snippet, Opus 4.7 generates distinctive, creative frontends with a much shorter nudge. This snippet works well alongside the variety approaches above:

> *"NEVER use generic AI-generated aesthetics like overused font families (Inter, Roboto, Arial, system fonts), cliched color schemes (particularly purple gradients on white or dark backgrounds), predictable layouts and component patterns, and cookie-cutter design that lacks context-specific character. Use unique fonts, cohesive colors and themes, and animations for effects and micro-interactions."*

**Interactive coding products.** Opus 4.7's token usage and behavior can differ between autonomous, asynchronous coding agents with a single user turn and interactive, synchronous coding agents with multiple user turns. Specifically, it tends to use more tokens in interactive settings, primarily because it reasons more after user turns. This can improve long-horizon coherence, instruction following, and coding capabilities in long interactive coding sessions, but also comes with more token usage. To maximize both performance and token efficiency in coding products, use \`effort: "xhigh"\` or \`"high"\`, add autonomous features (like an auto mode), and reduce the number of human interactions required from users.

When limiting required user interactions, specify the task, intent, and relevant constraints upfront in the first human turn. Well-specified, clear, and accurate task descriptions upfront help maximize autonomy and intelligence while minimizing extra token usage after user turns \u2014 because Opus 4.7 is more autonomous than prior models, this usage pattern helps to maximize performance. In contrast, ambiguous or underspecified prompts conveyed progressively over multiple user turns tend to reduce token efficiency and sometimes performance.

**Code review.** Opus 4.7 is meaningfully better at finding bugs than prior models, with both higher recall and precision. However, if a code-review harness was tuned for an earlier model, it may initially show *lower* recall \u2014 this is likely a harness effect, not a capability regression. When a review prompt says "only report high-severity issues," "be conservative," or "don't nitpick," Opus 4.7 follows that instruction more faithfully than earlier models did: it investigates just as thoroughly, identifies the bugs, and then declines to report findings it judges to be below the stated bar. Precision rises, but measured recall can fall even though underlying bug-finding has improved.

Recommended prompt language:

> *"Report every issue you find, including ones you are uncertain about or consider low-severity. Do not filter for importance or confidence at this stage \u2014 a separate verification step will do that. Your goal here is coverage: it is better to surface a finding that later gets filtered out than to silently drop a bug. For each finding, include your confidence level and an estimated severity so a downstream filter can rank them."*

This can be used without an actual second step, but moving confidence filtering out of the finding step often helps. If the harness has a separate verification/dedup/ranking stage, tell the model explicitly that its job at the finding stage is coverage, not filtering. If single-pass self-filtering is wanted, be concrete about the bar rather than using qualitative terms like "important" \u2014 e.g. *"report any bugs that could cause incorrect behavior, a test failure, or a misleading result; only omit nits like pure style or naming preferences."* Iterate on prompts against a subset of evals to validate recall or F1 gains.

**Computer use.** Computer use works across resolutions up to the new 2576px / 3.75MP maximum. Sending images at **1080p** provides a good balance of performance and cost. For particularly cost-sensitive workloads, **720p** or **1366\xD7768** are lower-cost options with strong performance. Test to find the ideal settings for the use case; experimenting with \`effort\` can also help tune behavior.

---

## Opus 4.7 Migration Checklist

Every item is tagged: **\`[BLOCKS]\`** items cause a 400 error, infinite loop, silent truncation, or empty output if missed \u2014 apply these as code edits, not as suggestions. **\`[TUNE]\`** items are quality/cost adjustments \u2014 surface them to the user as recommendations.

\`[BLOCKS]\` items prefixed with **"If\u2026"** or **"At\u2026"** are conditional. Before working through the list, **scan the file** for the conditions: does it surface thinking text to a UI/log? Does it set \`output_config.effort\` to \`"x-high"\` or \`"max"\`? Is it a security workload? Is it a multi-turn agentic loop? Apply only the items whose condition matches.

- [ ] **[BLOCKS]** Replace \`thinking: {type: "enabled", budget_tokens: N}\` with \`thinking: {type: "adaptive"}\` + \`output_config.effort\`; delete \`budget_tokens\` plumbing entirely
- [ ] **[BLOCKS]** Strip \`temperature\`, \`top_p\`, \`top_k\` from request construction
- [ ] **[BLOCKS]** If thinking content is surfaced to users or stored in logs: add \`thinking.display: "summarized"\` (otherwise the rendered text is empty)
- [ ] **[BLOCKS]** At \`output_config.effort\` of \`xhigh\` or \`max\`: set \`max_tokens\` \u2265 64000 (otherwise output truncates mid-thought)
- [ ] **[TUNE]** Give \`max_tokens\` and compaction triggers extra headroom; re-run \`count_tokens()\` against \`claude-opus-4-7\` on representative prompts to re-baseline (no blanket multiplier)
- [ ] **[TUNE]** Re-baseline cost and rate-limit dashboards *before* reacting to measured shifts
- [ ] **[TUNE]** Re-evaluate \`effort\` per route \u2014 use \`xhigh\` for coding/agentic and a minimum of \`high\` for most intelligence-sensitive work; it matters more on 4.7 than any prior Opus
- [ ] **[TUNE]** Multi-turn agentic loops: adopt the API-native Task Budgets (\`output_config.task_budget\`, beta \`task-budgets-2026-03-13\`, minimum 20k tokens) \u2014 this is for capping *cumulative* spend across a loop; per-turn depth is \`effort\`
- [ ] **[TUNE]** Check for ambiguous or underspecified instructions that relied on 4.6 generalizing intent, and update them to be clearer or more precise \u2014 4.7 follows them literally
- [ ] **[TUNE]** Tool-use workloads: add explicit when/how-to-use guidance to tool descriptions (4.7 reaches for tools less often)
- [ ] **[TUNE]** Verbosity: test existing length instructions before changing them \u2014 4.7 calibrates length to task complexity, so tune for the desired output rather than assuming a direction
- [ ] **[TUNE]** Remove forced-progress-update scaffolding (*"after every N tool calls\u2026"*)
- [ ] **[TUNE]** Remove knowledge-work verification scaffolding (*"double-check the slide layout\u2026"*) and re-baseline
- [ ] **[TUNE]** Add tone instruction if a warmer / more conversational voice is needed; re-evaluate style prompts on writing-heavy routes
- [ ] **[TUNE]** Subagent tool present: add explicit spawn / don't-spawn guidance
- [ ] **[TUNE]** Frontend/design output: specify a concrete palette/typeface, or have the model propose 4 visual directions before building (the default cream/serif house style is persistent)
- [ ] **[TUNE]** Interactive coding products: use \`effort: "xhigh"\` or \`"high"\`, add autonomous features (e.g. an auto mode) to reduce human interactions, and specify task/intent/constraints upfront in the first turn
- [ ] **[TUNE]** Code-review harnesses: remove or loosen "only report high-severity" / "be conservative" filters and have the model report every finding with confidence + severity; move filtering to a downstream step (4.7 follows severity filters more literally, which can depress measured recall)
- [ ] **[TUNE]** Vision-heavy pipelines (screenshots, charts, document understanding): leave images at native resolution up to 2576px long edge for the accuracy gain; remove any scale-factor math from coordinate handling (coords are now 1:1 with pixels). No beta header / opt-in needed \u2014 high-res is automatic on Opus 4.7.
- [ ] **[TUNE]** Computer-use pipelines: send screenshots at 1080p for a good performance/cost balance (720p or 1366\xD7768 for cost-sensitive workloads); experiment with \`effort\` to tune behavior
- [ ] **[TUNE]** Cost-sensitive image pipelines: full-res images on 4.7 use up to ~4784 tokens vs ~1,600 on prior models (~3\xD7). Downsampling client-side before upload avoids the increase, but **do not downsample by default** \u2014 if you're unsure whether fidelity is needed, ask the user. Re-baseline with \`count_tokens()\` on representative images before reacting to cost shifts.

---

## Migrating to Opus 4.8

> **Model ID \`claude-opus-4-8\` is authoritative as written here.** When the user asks to migrate to Opus 4.8, write \`model="claude-opus-4-8"\` exactly. Do **not** WebFetch to verify \u2014 this guide is the source of truth for migration target IDs. The corresponding entry exists in \`shared/models.md\`.

Claude Opus 4.8 is our most capable Opus-tier model \u2014 highly autonomous, with state-of-the-art long-horizon agentic execution, knowledge work, and memory. It is layered on top of the Opus 4.7 migration above. If the caller is jumping from Opus 4.6 or older, apply the 4.6 and 4.7 sections first, then this one.

**No new breaking changes.** Opus 4.8 keeps the same request surface as Opus 4.7. The same calls that already work on 4.7 work unchanged on 4.8 \u2014 adaptive thinking only (\`thinking: {type: "enabled", budget_tokens: N}\` still 400s; use \`{type: "adaptive"}\`), sampling parameters (\`temperature\`, \`top_p\`, \`top_k\`) still rejected, last-assistant-turn prefills still 400, \`thinking.display\` still defaults to \`"omitted"\`, and the \`low\`/\`medium\`/\`high\`/\`xhigh\`/\`max\` effort levels, Task Budgets (beta), and high-resolution vision all behave as on 4.7. A 4.7 \u2192 4.8 migration is therefore **the model-ID swap plus prompt re-tuning** \u2014 there is no required code edit beyond the model string.

**TL;DR for someone already on Opus 4.7:** swap the model ID to \`claude-opus-4-8\`. Nothing else is required to avoid an error. Then re-tune prompts for the behavioral shifts: 4.8 narrates *more* than 4.7 (add a silence-default if you want 4.7-like terseness), writes in a warmer, less hedged voice, is more deliberate and asks more often (add autonomy guidance to claw back ask-rate), and is more conservative about reaching for search, subagents, file-based memory, and custom tools (add explicit "when to use this" triggering). For long-horizon agentic work, give the full task specification up front in one well-specified turn and run at high effort.

### No new API breaking changes (inherited from 4.7)

These all carry over from Opus 4.7 unchanged \u2014 apply them only if the caller is coming from Opus 4.6 or earlier (see the **Migrating to Opus 4.7** section above for the before/after and the SDK-specific syntax):

- \`thinking: {type: "enabled", budget_tokens: N}\` \u2192 400. Use \`thinking: {type: "adaptive"}\` + \`output_config.effort\`.
- \`temperature\`, \`top_p\`, \`top_k\` \u2192 400. Remove them; steer with prompting.
- Last-assistant-turn prefills \u2192 400. Use \`output_config.format\` (structured outputs) or a system-prompt instruction.
- \`thinking.display\` defaults to \`"omitted"\`; set \`"summarized"\` if you surface reasoning to users.

If the caller is already on Opus 4.7 and these are clean, there is nothing to change here.

### New API feature: mid-session system prompts

You can deliver trusted instructions partway through a session by placing \`{"role": "system", ...}\` entries directly in the \`messages\` array \u2014 without editing the top-level system prompt and invalidating your prompt cache. Use it for things the application learns mid-session: the user delivered async context, a mode toggled (auto-approve enabled), files changed on disk, the remaining token budget dropped.

\`\`\`python
messages=[
    {"role": "user", "content": [{"type": "tool_result", "tool_use_id": "...", "content": "..."}]},
    {"role": "system", "content": "This project's codebase is Go. Write code in Go."},
]
\`\`\`

Phrase these as **context, not commands**. State the fact and let Claude act on it; avoid override-style language ("ignore what the user said", "regardless of the user's request", "disregard the previous instruction"). Claude is trained to protect users from instructions that appear to work against them, and that protection applies to the system role too. No beta header is required; available on {{OPUS_NAME}}. For cache-placement details and the older-model \`<system-reminder>\` fallback, see \`shared/prompt-caching.md\` and \`shared/agent-design.md\`.

### Capability improvements

**Long-horizon agentic execution.** Opus 4.8 is state-of-the-art at long, autonomous agentic work \u2014 complex refactors and overnight coding runs that complete without human correction. To get the most out of it, **give the full task specification up front in a single well-specified initial turn and run at high effort** (\`effort: "high"\` or \`"xhigh"\`). Its long-horizon coherence comes partly from reasoning more at each step; combined with a clear up-front goal, that more-intelligent planning often produces more efficient *and* more accurate output than prior frontier models. The "clear goal up front" principle maps to two product surfaces: in Claude Code, \`/goal\` sets direction for the run; with **Managed Agents (CMA)**, state what "done" looks like via an **Outcome** (\`user.define_outcome\` with a gradeable rubric \u2014 the harness runs an iterate \u2192 grade \u2192 revise loop), see \`shared/managed-agents-outcomes.md\`.

**Effort is a dimension to test, not a fixed setting.** On prior models many reached for \`xhigh\` reflexively to maximize intelligence. Opus 4.8 has a higher intelligence ceiling, so **start at \`high\` as the default and iterate** rather than defaulting to \`xhigh\`. Sweep \`medium\`, \`high\`, and \`xhigh\` on your own eval set and weigh the intelligence \u2194 latency \u2194 cost tradeoff per route \u2014 the relationship isn't monotonic: higher effort up front often *reduces* turn count and total cost on agentic work, while for some tasks \`medium\` delivers equally good results in less time. Reserve \`max\` for extremely hard, latency-insensitive cases. The per-level effort table in the **Migrating to Opus 4.7** section above applies unchanged on 4.8.

**Writing voice and clarity.** Testers consistently describe 4.8's prose as clearer, warmer, and less hedged than prior models, with fewer measurable AI vocal tics \u2014 especially at higher effort, where it approaches expert-level prose and structure. This is roughly the **opposite** direction from the 4.7 shift (4.7 was more clipped, direct, and less validation-forward). If you added style prompts to counter 4.7's terseness or to inject warmth, re-evaluate them against the new baseline before keeping them \u2014 they may now overcorrect. 4.8 is also a stronger thought partner: more thoughtful, more willing to push back, and more likely to infer the right answer from context.

**Code review and debugging.** Stronger real-bug finding and clearer explanations than 4.7 \u2014 one-shot fixes where 4.7 needed more, and correctly identifying intermittent flakes rather than declaring "fixed" after one clean run. The 4.7 caveat still applies: if a review harness says "only report high-severity issues" or "be conservative", 4.8 follows it literally and measured recall can drop even though underlying bug-finding improved. Tell the model to report everything and filter downstream (or review a second time) \u2014 see the **Code review** guidance in the 4.7 section for the recommended prompt.

### Behavioral shifts (prompt-tunable)

None of these break code, but prompts tuned for Opus 4.7 may land differently. 4.8 follows instructions well, so small, explicit nudges close the gap.

**Tool triggering is surface-dependent (search & knowledge).** 4.8's tool-triggering is more surface-dependent than in prior models: with a system prompt present it is high-precision / low-recall \u2014 web search triggers slightly more often but runs fewer rounds per trigger, while knowledge-retrieval tools (Drive, project knowledge, connected files) trigger *less* often. It searches when it's confident search is needed and otherwise answers from context, which can lower research depth on tasks that need it. Recover should-search rate with an explicit search-first instruction:

> \`\`\`
> <search_first>
> For questions where current information would change the answer (recent events, current roles or prices, version-specific behavior, or anything the user flags as time-sensitive) search before answering rather than answering from memory. For open-ended research requests, begin searching immediately; do not ask a scoping question first unless the request is genuinely ambiguous about what to research.
> </search_first>
> \`\`\`

**Under-utilization of subagents, memory, and custom tools.** Separately from search, 4.8 is conservative about reaching for capabilities that need an explicit "decide to use this" step \u2014 file-based memory, subagent delegation, custom tools. It won't reach for complex or expensive capabilities unless reasonably sure they're needed. This is steerable since 4.8 follows instructions well \u2014 say *when* each capability applies, not just that it exists:

> *"Before any task longer than a few turns, check your memory file for relevant prior context and write new findings to it as you go. When a task fans out across independent items (many files to read, many tests to run, many candidates to check), delegate to subagents rather than iterating serially."*

The same lever works at the **tool-description** level, not just the system prompt: prescriptive descriptions that state *when* to call a tool (e.g. "Call this when the user asks about current prices or recent events") give meaningful lift on 4.8 over descriptions that only state what the tool does. Make the trigger condition part of each capability's own \`description\`.

**More user-facing narration.** 4.8 narrates more than 4.7 \u2014 more text between tool calls in long tool-calling sessions, and longer, more detailed end-of-task wrap-ups by default. If you previously added scaffolding to force interim status ("after every 3 tool calls, summarize progress"), **remove it** \u2014 4.8 does this on its own. If the narration is too verbose for a coding agent, an explicit silence-default makes it behave like 4.7 with no loss of quality:

> *"Default to silence between tool calls. Only write text when you find something, change direction, or hit a blocker \u2014 one sentence each. Do not narrate routine actions ('Now I'll...', 'Let me check...', 'Looking at...'). When done: one or two sentences on the outcome. Do not recap every file or test \u2014 the user has been following along."*

For knowledge-work deliverables (reports, analysis readouts), verbosity responds very well to instructions in user preferences or the user turn \u2014 expose a verbosity preference rather than hard-coding a length.

**More deliberate \u2014 asks more often.** 4.8 is more deliberate than prior Opus models. On minor decisions it would previously just make (a variable name, a default value, which of two equivalent approaches), it tends to pause and ask, and it often closes a completed task with "Want me to also\u2026?" rather than doing the obvious next step or stopping cleanly. This is preferred for high-stakes or unfamiliar codebases, but bugs users when uncalibrated. Grant autonomy on the small stuff while keeping caution where it matters (in Claude Code testing this cut ask-rate by ~12 percentage points with no increase in over-reach):

> *"For minor choices (naming, formatting, default values, which approach among equivalents), pick a reasonable option and note it rather than asking. For scope changes or destructive actions, still ask first."*

**Verbose reasoning when thinking is disabled.** With \`thinking: {type: "disabled"}\`, 4.8 occasionally writes longer explanations of its reasoning into the visible response, which reads as verbose when the user wants a fast, quick answer. The simplest fix is to leave adaptive thinking on \u2014 set \`thinking: {type: "adaptive"}\` (the recommended setting; it adjusts how much to think per task). Note adaptive is **not** on when the field is omitted \u2014 like Opus 4.7, a request with no \`thinking\` field runs without thinking, so set it explicitly. If you need thinking off for latency or cost, scope it in the system prompt:

> *"Respond only with your final answer. Do not include exploratory reasoning, intermediate drafts, diffs you considered but rejected, or meta-commentary about your process."*

### Opus 4.8 Migration Checklist

Every item is tagged: **\`[BLOCKS]\`** items cause a 400 error if missed; **\`[TUNE]\`** items are quality/cost adjustments \u2014 surface them to the user as recommendations.

For a caller **already on Opus 4.7**, only the first item is required; everything else is \`[TUNE]\`. The conditional \`[BLOCKS]\` item applies only when coming from Opus 4.6 or earlier.

- [ ] **[BLOCKS]** Update the \`model=\` string to \`claude-opus-4-8\`
- [ ] **[BLOCKS]** *(only if coming from Opus 4.6 or earlier)* Apply the **Migrating to Opus 4.7** breaking changes first \u2014 \`budget_tokens\` \u2192 adaptive thinking, strip \`temperature\`/\`top_p\`/\`top_k\`, remove last-assistant-turn prefills. These already 400 on 4.7 and continue to 400 on 4.8.
- [ ] **[TUNE]** Long-horizon / agentic work: put the full task spec in one well-specified first turn and run at \`high\` or \`xhigh\` effort (Claude Code: \`/goal\`; Managed Agents: an Outcome with a gradeable rubric)
- [ ] **[TUNE]** Effort: sweep \`medium\` / \`high\` / \`xhigh\` on your eval set and pick per route by the intelligence \u2194 latency \u2194 cost tradeoff (default \`high\`, \`xhigh\` for coding/agentic)
- [ ] **[TUNE]** Research depth & tool use: add a search-first instruction; add explicit triggering guidance for subagents, file-based memory, and custom tools (4.8 under-reaches for these by default) \u2014 in the system prompt *and* in each tool's own \`description\` (prescriptive "call this when\u2026" descriptions give measurable lift)
- [ ] **[TUNE]** Narration: remove forced-progress scaffolding (*"after every N tool calls\u2026"*); add a silence-default if a coding agent is too chatty
- [ ] **[TUNE]** Autonomy: add small-decisions-don't-ask guidance to cut ask-rate, while keeping caution on scope changes / destructive actions
- [ ] **[TUNE]** Writing voice: re-evaluate style prompts added to counter 4.7's directness \u2014 4.8 is warmer and less hedged by default; re-baseline before keeping them
- [ ] **[TUNE]** Code-review harnesses: keep the report-everything-filter-downstream pattern (4.8 follows "only high-severity" / "be conservative" filters literally, which can depress measured recall)
- [ ] **[TUNE]** Thinking-disabled paths: add a final-answer-only instruction if reasoning leaks into the visible response
- [ ] **[TUNE]** Consider mid-session system messages (\`role:"system"\` in \`messages\`; no beta header) for context the app learns mid-session, instead of rebuilding the top-level system prompt and invalidating the cache

---

## Migrating to {{SONNET_NEXT_NAME}}

> **Model ID \`{{SONNET_NEXT_ID}}\` is authoritative as written here.** When the user asks to migrate to {{SONNET_NEXT_NAME}}, write \`model="{{SONNET_NEXT_ID}}"\` exactly. Do **not** WebFetch to verify \u2014 this guide is the source of truth for migration target IDs. The corresponding entry exists in \`shared/models.md\`.

{{SONNET_NEXT_NAME}} substantially improves on Sonnet 4.6 for coding and agentic work, reaching what was previously Opus-tier quality on many tasks. Its API surface aligns with Opus 4.7/4.8: manual extended thinking is removed (adaptive or disabled only, adaptive is the default), and non-default sampling parameters are rejected. This section is layered on top of the Sonnet 4.6 migration above \u2014 if the caller is jumping from Sonnet 4.5 or older, apply the 4.6 changes first, then this one.

**TL;DR for someone already on Sonnet 4.6:** swap the model ID to \`{{SONNET_NEXT_ID}}\`. Replace any remaining \`thinking: {type: "enabled", budget_tokens: N}\` with \`thinking: {type: "adaptive"}\` (the transitional escape hatch is gone \u2014 it now 400s), and note that omitting \`thinking\` now runs adaptive (4.6 ran thinking-off). Strip non-default \`temperature\`/\`top_p\`/\`top_k\`. Re-run \`count_tokens()\` against \`{{SONNET_NEXT_ID}}\` \u2014 the new tokenizer produces ~30% more tokens for the same text, so token-budgeted limits and cost baselines shift even though per-token pricing is unchanged. \`effort\` defaults to \`high\`, the same as Sonnet 4.6 \u2014 raise to \`xhigh\` for the hardest coding and agentic tasks ({{SONNET_NEXT_NAME}} supports the full \`low\`/\`medium\`/\`high\`/\`xhigh\`/\`max\` range), and give \`max_tokens\` headroom at \`xhigh\`/\`max\` (the new tokenizer means a Sonnet-4.6-tuned \`max_tokens\` may truncate equivalent output). Then re-tune prompts: {{SONNET_NEXT_NAME}} interprets instructions more literally than 4.6 \u2014 holdover style/tone directives now apply at face value; it is more agentic by default and reaches for tools and self-verification loops more readily (with thinking disabled it is less tool-eager \u2014 add an explicit nudge); it gives better in-progress updates by default (drop forced "summarize every N tool calls" scaffolding); and code-review harnesses with conservative-reporting instructions may see lower recall (tell it to report everything and filter downstream).

### Breaking changes (will 400 on {{SONNET_NEXT_NAME}})

These bring the Sonnet line onto the same request surface as Opus 4.7/4.8. See the **Per-SDK Syntax Reference** above for the language-specific spelling of each.

**1. Extended thinking removed \u2014 adaptive only.** \`thinking: {type: "enabled", budget_tokens: N}\` returns a 400. The transitional escape hatch that still worked on Sonnet 4.6 is gone. Use adaptive thinking with an effort hint:

\`\`\`python
# Before \u2014 deprecated on Sonnet 4.6, now errors on {{SONNET_NEXT_NAME}}
thinking={"type": "enabled", "budget_tokens": 10000}

# After
thinking={"type": "adaptive"},
output_config={"effort": "high"},  # or "xhigh" for the hardest coding/agentic tasks
\`\`\`

To turn thinking off entirely, set \`thinking: {type: "disabled"}\` \u2014 but see *Adaptive vs. disabled* below before doing so.

**2. Sampling parameters rejected.** Setting \`temperature\`, \`top_p\`, or \`top_k\` to a non-default value returns a 400; omitting the parameter, or passing its default, is still accepted. The safest migration is to omit them entirely and steer with prompting. If the caller was relying on \`temperature=0\` for determinism, note in the migration comment that it never guaranteed identical outputs.

\`\`\`python
# Before
client.messages.create(model="claude-sonnet-4-6", temperature=0.2, ...)

# After \u2014 omit entirely
client.messages.create(model="{{SONNET_NEXT_ID}}", ...)
\`\`\`

**3. Bedrock only: forced \`tool_choice\` requires \`thinking: {type: "disabled"}\`.** On Amazon Bedrock, pass \`thinking: {type: "disabled"}\` alongside \`tool_choice: {type: "tool", name: ...}\` or \`tool_choice: {type: "any"}\`. The Claude API and Vertex AI do not require this.

**Not a request-shape error, but handle it: cybersecurity safeguards.** {{SONNET_NEXT_NAME}} is substantially more cyber-capable than Sonnet 4.6, so \u2014 like Opus 4.7/4.8 \u2014 requests touching prohibited or high-risk topics may be refused. Handle it as a content outcome (see the \`refusal\` stop-reason guidance in the {{FABLE_NAME}} section if the caller needs a fallback path).

**Unchanged from Sonnet 4.6:** assistant-turn prefills still return a 400 (use \`output_config.format\` or a system-prompt instruction); the 1M-token context window, the 128k max-output ceiling, prompt caching, batch processing, the Files API, PDF support, vision, and the full server- and client-side tool set all carry over.

### Silent default change: adaptive thinking on when \`thinking\` is omitted

On Sonnet 4.6, a request with no \`thinking\` field runs **without** thinking. On {{SONNET_NEXT_NAME}}, the same request runs with **adaptive thinking**. This is not an error \u2014 but callers who never set \`thinking\` will now see thinking output (and spend thinking tokens) where they didn't before. \`max_tokens\` is a hard limit on total output (thinking + response text), so a workload that ran thinking-off on Sonnet 4.6 by omission may now truncate. Either set \`thinking: {type: "disabled"}\` explicitly to keep the old behavior, or revisit \`max_tokens\` to leave room for thinking.

### Silent default change: \`thinking.display\` defaults to \`"omitted"\`

\`thinking.display\` defaults to \`"omitted"\` on {{SONNET_NEXT_NAME}} (matching Opus 4.7/4.8 and {{FABLE_NAME}}); on Sonnet 4.6 it defaulted to \`"summarized"\`. With the default, \`thinking\` blocks stream with empty text \u2014 to a streaming UI this looks like a long pause before output. Combined with the adaptive-on-by-default change above, a Sonnet 4.6 caller who omits \`thinking\` entirely now gets adaptive thinking *and* empty-text thinking blocks. If you stream reasoning to users, set \`thinking: {type: "adaptive", display: "summarized"}\` explicitly. \`display\` controls visibility only \u2014 thinking happens and is billed the same under every setting.

### New tokenizer (~30% more tokens)

{{SONNET_NEXT_NAME}} uses the same new tokenizer as Opus 4.7/4.8. The same input text produces approximately 30% more tokens than on Sonnet 4.6. No request/response shape changes and no code edits are required, but **everything measured or budgeted in tokens shifts**: \`usage\` fields and \`count_tokens()\` results for the same text are higher, the 1M context window holds less text, and a \`max_tokens\` limit tuned for Sonnet 4.6 may truncate equivalent output. Per-token pricing is unchanged at the $3/$15 sticker (introductory $2/$10 per MTok applies through 2026-08-31), so the cost of an equivalent request can differ. Re-run \`count_tokens()\` against \`{{SONNET_NEXT_ID}}\` rather than reusing counts measured against earlier models, and re-baseline cost dashboards before reacting to measured shifts.

### Choosing an effort level on {{SONNET_NEXT_NAME}}

\`effort\` defaults to \`high\` when not set (same as Sonnet 4.6 and Opus 4.8). {{SONNET_NEXT_NAME}} supports the full \`low\`/\`medium\`/\`high\`/\`xhigh\`/\`max\` range \u2014 the first Sonnet-tier model with \`xhigh\`. **Keep the \`high\` default for most work and raise to \`xhigh\` for the hardest coding and agentic tasks**:

| Level    | When to use on {{SONNET_NEXT_NAME}} |
| -------- | ----- |
| \`max\`    | Tasks needing the absolute highest capability with no token constraint. Can deliver gains in some use cases but may show diminishing returns and is sometimes prone to overthinking \u2014 test before committing |
| \`xhigh\`  | The hardest coding and agentic use cases \u2014 the recommended setting for those |
| \`high\`   | The default; balances token usage and intelligence for most use cases |
| \`medium\` | Cost-saving step-down from the default \u2014 comparable to Sonnet 4.6 at \`high\` |
| \`low\`    | Short, scoped tasks and latency-sensitive workloads that aren't intelligence-sensitive (chat, simple lookups) |

As a rough cross-model mapping when migrating: {{SONNET_NEXT_NAME}} at \`medium\` is comparable in intelligence to Sonnet 4.6 at \`high\`, and {{SONNET_NEXT_NAME}} at \`high\` is comparable to Sonnet 4.6 at \`max\`. When benchmarking, match by observed thinking length rather than effort name.

{{SONNET_NEXT_NAME}} **respects effort levels strictly, especially at the low end**. At \`low\` and \`medium\` it scopes its work to what was asked rather than going above and beyond \u2014 good for latency and cost, but on moderately complex tasks at \`low\` there is some risk of under-thinking. If you observe shallow reasoning on complex problems, **raise effort to \`high\` or \`xhigh\` rather than prompting around it**. If you must keep effort at \`low\` for latency, add targeted guidance:

> *"This task involves multi-step reasoning. Think carefully through the problem before responding."*

**Leave \`max_tokens\` headroom at \`xhigh\`/\`max\`.** Set a large output token budget (up to the 128k cap, unchanged from Sonnet 4.6) so the model has room for thinking and tool calls. On long tasks, adaptive thinking can use a large share of the budget; if the budget is tight you may see a response that is almost entirely thinking followed by a truncated answer and \`stop_reason: "max_tokens"\` \u2014 raise \`max_tokens\` or drop to \`medium\`. Because {{SONNET_NEXT_NAME}} uses the new tokenizer (~30% more tokens for the same text), \`max_tokens\` limits tuned for Sonnet 4.6 may truncate equivalent output.

### Adaptive vs. disabled thinking

Leave adaptive thinking on. {{SONNET_NEXT_NAME}} calibrates thinking spend to task complexity; the small added latency is usually worth the quality gain. If the caller was running Sonnet 4.6 with thinking off, **try adaptive + \`effort: "low"\` first** rather than \`thinking: {type: "disabled"}\`.

The triggering behavior for adaptive thinking is steerable. If the model emits thinking blocks more often than wanted (which can happen with large or complex system prompts), prompt it directly \u2014 and measure the effect on quality:

> *"Thinking adds latency and should only be used when it will meaningfully improve answer quality, typically for problems that require multi-step reasoning. When in doubt, respond directly."*

Conversely, if you're running hard workloads at \`medium\` and seeing under-thinking, the first lever is to raise effort; if you need finer control, prompt for it directly.

### Capability improvements

**Coding and agentic tasks.** The largest gains over Sonnet 4.6 are in coding and agentic tasks. {{SONNET_NEXT_NAME}} performs well out of the box on existing Sonnet 4.6 prompts.

**High-resolution vision.** {{SONNET_NEXT_NAME}} is the first Sonnet-tier model with high-resolution image support: maximum **2576 pixels on the long edge** (up from 1568px on Sonnet 4.6). High-res images can use up to ~3\xD7 more image tokens than on Sonnet 4.6 (4784 vs 1568 tokens per image at the limit) \u2014 if the added fidelity isn't needed, downsample before sending to control token costs. No beta header or opt-in required.

**Computer use.** Supports the \`computer_20251124\` tool version (beta header \`computer-use-2025-11-24\`). Capability works across resolutions up to the 2576px / 3.75MP maximum; sending screenshots at **1080p** provides a good balance of performance and cost. For particularly cost-sensitive workloads, **720p** or **1366\xD7768** are lower-cost options with strong performance. Test to find the ideal settings for the use case; experimenting with \`effort\` can also help tune behavior.

### Behavioral shifts (prompt-tunable)

None of these break code, but prompts tuned for Sonnet 4.6 may land differently. {{SONNET_NEXT_NAME}} follows instructions closely, so small explicit directives close the gap.

**Response length and verbosity.** {{SONNET_NEXT_NAME}} calibrates response length to task complexity rather than defaulting to a fixed verbosity \u2014 usually shorter on simple lookups, longer on open-ended analysis. If a product depends on a particular verbosity, tune the prompt. To decrease verbosity:

> *"Provide concise, focused responses. Skip non-essential context, and keep examples minimal."*

If you see specific kinds of verbosity (e.g. over-explaining), add targeted instructions to prevent them. Positive examples showing the desired concision tend to be more effective than telling the model what not to do.

**Tool use triggering.** {{SONNET_NEXT_NAME}} is more agentic than Sonnet 4.6 by default and will reach for tools and run self-verification loops more readily. **With thinking disabled**, the model is less likely to reach for tools or consider searching \u2014 if the harness relies on tool calls with thinking off, add an explicit nudge in the system prompt. \`effort\` is also a lever: \`high\` and \`xhigh\` show substantially more tool usage in agentic search and coding. For scenarios where you want more tool use, also explicitly instruct when and how to use the tools (e.g. if web-search is under-used, describe in the prompt why and how it should be called).

**User-facing progress updates.** {{SONNET_NEXT_NAME}} provides regular, higher-quality updates to the user throughout long agentic traces by default. If the harness has scaffolding to force interim status messages ("After every 3 tool calls, summarize progress"), **try removing it**. If the length or content of the updates isn't well-calibrated to the use case, describe what they should look like in the prompt and provide an example.

**More literal instruction following.** {{SONNET_NEXT_NAME}} interprets prompts literally and explicitly, particularly at lower effort levels. It does not silently generalize an instruction from one item to another, and it does not infer requests that weren't made. The upside is precision \u2014 better for carefully tuned prompts, structured extraction, and pipelines that need predictable behavior. If an instruction should apply broadly, **state the scope explicitly** ("Apply this formatting to every section, not just the first one"). The same literalism means style/tone directives carried over from Sonnet 4.6 may now over-apply \u2014 re-baseline holdover lines like "be concise" before keeping them.

**Tone and writing style.** Prose style on long-form writing may shift. If a product relies on a specific voice, re-evaluate style prompts against the new baseline. For a warmer or more conversational voice:

> *"Use a warm, collaborative tone. Acknowledge the user's framing before answering."*

Because \`temperature\`/\`top_p\`/\`top_k\` are not accepted on {{SONNET_NEXT_NAME}}, callers who previously relied on \`temperature\` for stylistic variety must use system-prompt instructions instead.

**Code review harnesses.** A review harness tuned for an earlier model may initially see lower recall on {{SONNET_NEXT_NAME}}. This is likely a harness effect, not a capability regression: when a review prompt says "only report high-severity issues" / "be conservative" / "don't nitpick," {{SONNET_NEXT_NAME}} follows that instruction more faithfully than earlier models did \u2014 it investigates just as thoroughly, identifies the bugs, and then doesn't report findings it judges below the stated bar. Precision typically rises, but measured recall can fall even though underlying bug-finding ability has improved. Recommended prompt language:

> *"Report every issue you find, including ones you are uncertain about or consider low-severity. Do not filter for importance or confidence at this stage \u2014 a separate verification step will do that. Your goal here is coverage: it is better to surface a finding that later gets filtered out than to silently drop a real bug. For each finding, include your confidence level and an estimated severity so a downstream filter can rank them."*

This works even without an actual second step, but moving confidence filtering out of the finding stage often helps. If you do want single-pass self-filtering, be concrete about where the bar is rather than using qualitative terms like "important" \u2014 e.g. "report any bugs that could cause incorrect behavior, a test failure, or a misleading result; only omit nits like pure style or naming preferences." Iterate against a subset of evals to validate recall/F1 gains.

**Design and frontend defaults.** {{SONNET_NEXT_NAME}} may settle into a consistent default visual style on open-ended frontend and design briefs. Generic instructions ("don't use that color," "make it clean and minimal") tend to shift it to a different fixed palette rather than producing variety. Two approaches work reliably: **specify a concrete alternative** (the model follows explicit specs precisely \u2014 give the palette, typography, layout, and spacing), or **have the model propose options before building** (e.g. "Before building, propose 4 distinct visual directions tailored to this brief \u2014 bg hex / accent hex / typeface plus a one-line rationale \u2014 ask the user to pick one, then implement only that direction"). Because \`temperature\` isn't accepted on {{SONNET_NEXT_NAME}}, the propose-then-pick approach is the recommended way to get meaningfully different design directions across runs. To steer away from generic AI-aesthetic patterns, a short directive in the system prompt also helps:

> *"NEVER use generic AI-generated aesthetics like overused font families (Inter, Roboto, Arial, system fonts), cliched color schemes (particularly purple gradients on white or dark backgrounds), predictable layouts and component patterns, and cookie-cutter design that lacks context-specific character. Use unique fonts, cohesive colors and themes, and animations for effects and micro-interactions."*

**Interactive coding products.** Token usage and behavior can differ between autonomous, asynchronous coding agents (single user turn) and interactive, synchronous coding agents (multiple user turns). To maximize both performance and token efficiency, use \`effort: "xhigh"\` or \`"high"\`, add autonomous features like an auto mode, and reduce the number of human interactions required. Specify task, intent, and constraints upfront in the first turn \u2014 well-specified initial prompts maximize autonomy and intelligence while minimizing extra token usage after user turns; ambiguous or progressively-revealed prompts tend to reduce token efficiency and sometimes performance.

### {{SONNET_NEXT_NAME}} Migration Checklist

Every item is tagged: **\`[BLOCKS]\`** items cause a 400 error or truncated output if missed; **\`[TUNE]\`** items are quality/cost adjustments \u2014 surface them to the user as recommendations.

- [ ] **[BLOCKS]** Update the \`model=\` string to \`{{SONNET_NEXT_ID}}\`
- [ ] **[BLOCKS]** Replace \`thinking: {type: "enabled", budget_tokens: N}\` with \`thinking: {type: "adaptive"}\` + \`output_config.effort\` \u2014 the Sonnet 4.6 transitional escape hatch is gone
- [ ] **[BLOCKS]** Strip \`temperature\`, \`top_p\`, \`top_k\` from request construction (use system-prompt instructions for tone/variety instead)
- [ ] **[BLOCKS]** Bedrock only: pass \`thinking: {type: "disabled"}\` alongside forced \`tool_choice\` (\`{type: "tool"}\` / \`{type: "any"}\`) \u2014 not required on the Claude API or Vertex AI
- [ ] **[BLOCKS]** At \`effort: "xhigh"\` or \`"max"\`: set a large \`max_tokens\` (up to 128k, unchanged from Sonnet 4.6) so the model has room for thinking and tool calls \u2014 Sonnet-4.6-tuned limits may truncate equivalent output under the new tokenizer (symptom: \`stop_reason: "max_tokens"\`)
- [ ] **[TUNE]** Thinking-field omitted: adaptive is now the default (4.6 ran thinking-off) \u2014 either set \`thinking: {type: "disabled"}\` to preserve the old behavior, or revisit \`max_tokens\` for the added thinking spend
- [ ] **[TUNE]** \`thinking.display\` defaults to \`"omitted"\` (4.6 defaulted to \`"summarized"\`): if you stream reasoning to users, set \`thinking: {type: "adaptive", display: "summarized"}\` explicitly \u2014 the default streams empty-text thinking blocks (long pause before output)
- [ ] **[TUNE]** New tokenizer: re-run \`count_tokens()\` against \`{{SONNET_NEXT_ID}}\` (~30% more tokens for the same text); revisit \`max_tokens\` and compaction triggers sized close to expected output length; re-baseline cost dashboards before reacting (per-token pricing unchanged)
- [ ] **[TUNE]** Effort: keep the \`high\` default; raise to \`xhigh\` for the hardest coding/agentic tasks; \`medium\` is a cost-saving step-down (\u2248 Sonnet 4.6 at \`high\`); reserve \`low\` for short, latency-sensitive, non-intelligence-sensitive tasks. If shallow reasoning shows up at \`low\`/\`medium\`, raise effort rather than prompting around it
- [ ] **[TUNE]** Thinking-off callers: try \`thinking: {type: "adaptive"}\` + \`effort: "low"\` instead of \`disabled\`; if \`disabled\` must stay, add an explicit tool-triggering nudge (the model is less tool-eager with thinking off)
- [ ] **[TUNE]** Tool usage: more agentic than 4.6 by default (reaches for tools and self-verification more readily) \u2014 \`effort\` is a lever (\`high\`/\`xhigh\` for more tool use); add explicit when/how triggering instructions for under-used tools
- [ ] **[TUNE]** Drop forced progress-update scaffolding ("after every N tool calls, summarize") \u2014 the default updates are higher quality; describe the desired update shape if it still needs tuning
- [ ] **[TUNE]** Re-baseline holdover style/tone/scope directives \u2014 instructions are followed literally; state the scope explicitly when one should apply broadly
- [ ] **[TUNE]** Verbosity-sensitive routes: tune response length via prompt (positive examples > "don't" instructions)
- [ ] **[TUNE]** Code-review harnesses with conservative-reporting instructions ("only high-severity", "don't nitpick"): switch to a coverage-first prompt (report everything with confidence + severity) and filter downstream \u2014 measured recall can otherwise fall even though bug-finding improved
- [ ] **[TUNE]** Open-ended frontend/design briefs: specify a concrete spec, or have the model propose 3\u20134 visual directions and pick one (the recommended substitute for \`temperature\`-driven variety)
- [ ] **[TUNE]** Interactive coding products: use \`effort: "xhigh"\`/\`"high"\`, add autonomous features (e.g. auto mode), and put task/intent/constraints in the first turn
- [ ] **[TUNE]** Vision-heavy / computer-use pipelines: leave images at native resolution up to 2576px long edge for the accuracy gain (downsample to control image-token cost if fidelity isn't needed); for computer use, 1080p screenshots are a good performance/cost balance with \`computer_20251124\`
- [ ] **[TUNE]** Security workloads: add handling for safeguard refusals (cyber-capable topics may now be declined where Sonnet 4.6 answered)

---

## Migrating to {{FABLE_NAME}}

> **Model IDs \`{{FABLE_ID}}\` and \`{{MYTHOS_ID}}\` are authoritative as written here.** When the user asks to migrate to {{FABLE_NAME}}, write \`model="{{FABLE_ID}}"\` exactly; a Mythos Preview migrator in Project Glasswing writes \`model="{{MYTHOS_ID}}"\` (everyone else: \`{{FABLE_ID}}\`). Do **not** WebFetch to verify \u2014 this guide is the source of truth for migration target IDs. The corresponding entries exist in \`shared/models.md\`.

{{FABLE_NAME}} is Anthropic's most capable widely released model \u2014 for the most demanding reasoning and long-horizon agentic work. **{{MYTHOS_NAME}}** (\`{{MYTHOS_ID}}\`) offers the same capabilities, pricing, and API behavior through Project Glasswing (participation is the only way to access it), and succeeds the invitation-only **Claude Mythos Preview** (\`claude-mythos-preview\`). Everything in this section applies to both models \u2014 only the ID differs. Mythos Preview migrators in Project Glasswing target \`{{MYTHOS_ID}}\`; everyone else targets \`{{FABLE_ID}}\`. 1M token context window by default (the maximum is also the default), up to 128K output tokens per request.

**Migrate to {{FABLE_NAME}} only when the user explicitly chose it.** It is not the default Opus upgrade path \u2014 pricing is above Opus-tier. For "upgrade to the latest model" requests, the target remains \`claude-opus-4-8\`.

### Breaking changes (vs Opus-tier and Mythos Preview)

1. **Thinking is always on \u2014 remove all \`thinking\` configuration.** Adaptive thinking applies automatically whenever the \`thinking\` parameter is unset (an explicit \`{type: "adaptive"}\` is also accepted). Any other configuration is rejected: \`thinking: {type: "disabled"}\` and \`{type: "enabled", budget_tokens: N}\` both return a 400. \`budget_tokens\` has no replacement \u2014 the \`output_config.effort\` parameter is a separate output-level control, not a thinking budget.

   \`\`\`python
   # Before (Mythos Preview / older models)
   client.messages.create(
       model="claude-mythos-preview",
       max_tokens=16000,
       thinking={"type": "enabled", "budget_tokens": 10000},
       messages=[...],
   )

   # After ({{FABLE_NAME}}) \u2014 no thinking field at all
   client.messages.create(
       model="{{FABLE_ID}}",
       max_tokens=16000,
       output_config={"effort": "high"},
       messages=[...],
   )
   \`\`\`

2. **Assistant prefill is not supported.** Replace last-assistant-turn prefills with structured outputs (\`output_config.format\`) or system prompt instructions \u2014 same replacement patterns as the 4.6-family prefill removal above. (One exception: the fallback-credit prefill claim \u2014 the server accepts the echoed assistant message when redeeming a credit; see the refusal section below.)

3. **Interleaved scratchpad is not supported** (Mythos Preview migrators only). Inter-tool reasoning is returned in thinking blocks instead, which adaptive thinking produces automatically between tool calls.

### Thinking output on {{FABLE_NAME}} and {{MYTHOS_NAME}}

On {{FABLE_NAME}} and {{MYTHOS_NAME}}, the raw chain of thought is never returned. What you receive are **regular \`thinking\` blocks**, not encrypted blobs or \`redacted_thinking\`: \`display: "summarized"\` returns a readable summary of the reasoning, and with \`"omitted"\` \u2014 the default, same as Opus 4.8/4.7 \u2014 responses still include \`thinking\` blocks but the \`thinking\` field is an empty string. \`display\` controls visibility only; thinking happens and is billed the same under every setting. When continuing a conversation on the same model, pass thinking blocks back to the API **unchanged** (the standard multi-turn pattern; dropping or editing them breaks the turn).

When continuing on the same model, pass each thinking block back **exactly as received \u2014 including blocks whose \`thinking\` text is empty**. The API rejects blocks whose content has been *modified*, not blocks you have read; displaying the summary is fine, editing or reconstructing blocks is not.

Regular thinking blocks aren't origin-locked \u2014 they replay across models fine (the server renders them into the target model's prompt). {{FABLE_NAME}}/{{MYTHOS_NAME}} thinking is the exception: a thinking block from these models replayed to a different model is **dropped from the prompt** rather than rendered \u2014 typically silently (early-access builds hard-rejected with \`invalid_request_error\`; that broke workflows and was reverted before launch, but the new behavior is still rolling out, so don't build logic that depends on either outcome). The drop happens before the prompt is priced, so a dropped block **lowers \`usage.input_tokens\`** \u2014 you aren't billed for it, and there's nothing to strip for cost. Don't strip *regular* thinking blocks either: removing them can trigger ordering/signature 400s. Two rules for replay bodies stand regardless: fallback-credit retries must echo the refused body **unchanged**, and \`fallback\` blocks from a mid-output fallback stay where they appeared.

Related: a request that tries to elicit the model's internal reasoning *in the response text* can be refused with \`stop_details.category: "reasoning_extraction"\` \u2014 applications needing reasoning visibility should read the summarized \`thinking\` blocks instead of prompting for reasoning.

### Tokenizer \u2014 unchanged from Opus 4.8

{{FABLE_NAME}} uses the **same tokenizer as Claude Opus 4.8** (the tokenizer introduced with Opus 4.7). Token counts are roughly unchanged when migrating from Opus 4.7/4.8 or from \`claude-mythos-preview\`; per-token pricing differs.

- Coming **from Opus 4.7/4.8 or \`claude-mythos-preview\`**: token counts are roughly unchanged. Re-baseline cost and latency on your own workloads for the per-token price difference.
- Coming **from Opus 4.6, Sonnet, Haiku, or older**: the Opus 4.7 tokenizer tokenizes the same content to roughly 1\xD7\u20131.35\xD7 as many tokens (varies by content and workload shape). Do not reuse token counts, context-window budgets, or \`max_tokens\` settings measured on the old model; re-baseline with \`count_tokens\`.

To measure the difference on your own prompts, call \`count_tokens\` once with your current model and once with \`model: "{{FABLE_ID}}"\`, and compare the two \`input_tokens\` values.

### \`refusal\` stop reason \u2014 handle before reading content

{{FABLE_NAME}} runs safety classifiers on incoming requests, targeting research biology and most cybersecurity content ({{FABLE_NAME}} is not intended for those domains); benign adjacent work \u2014 security tooling, life-sciences tasks \u2014 can occasionally trigger false positives, which is why the fallback patterns below matter even for legitimate workloads. (Most Claude consumer surfaces ship with built-in Opus 4.8 fallbacks; API callers configure their own.) A declined request returns a **successful HTTP 200** with \`stop_reason: "refusal"\`, plus a \`stop_details\` object with the policy category (values such as \`"cyber"\`, \`"bio"\`, \`"reasoning_extraction"\`, \`"frontier_llm"\`, or \`null\` \u2014 treat \`null\` as a permanent valid state; see the refusal category table in the public docs for the full set). **Branch on \`stop_reason\`, never on \`stop_details\`** \u2014 \`stop_details\` is informational and can be \`null\` even on a refusal, and \`explanation\` is not guaranteed present. Note that classifier blocks and ordinary model refusals (the model itself declining) both surface as \`stop_reason: "refusal"\`; \`stop_details.category\` tells you which class you're handling, and therefore whether retrying on a fallback model is the right response. The classifier can fire **before any output** (empty \`content\` array; not billed at all \u2014 no input or output tokens, no rate-limit consumption) or **mid-stream** after partial output (already-streamed output is billed at normal rates \u2014 discard the partial output rather than treating it as complete). Code that reads \`response.content[0]\` unconditionally will break \u2014 check \`stop_reason\` first:

\`\`\`python
response = client.messages.create(model="{{FABLE_ID}}", max_tokens=1024, messages=[...])
if response.stop_reason == "refusal":
    # classifiers declined; content is empty (pre-output) or partial (mid-stream)
    handle_refusal()
else:
    print(response.content[0].text)
\`\`\`

**Default to opting in.** Fallbacks are not automatic on the API \u2014 a request without them simply stops on a refusal. Migrated and new {{FABLE_NAME}} code should ship with pattern 1 below (pattern 2 on providers without server-side support) from day one, not as a later hardening step: emit the opt-in in the code, tell the user it's there, and remove it only if they decline.

Three ways to retry a refused request on another model, in order of preference:

**1. Server-side \`fallbacks\` parameter (beta: Claude API and Claude Platform on AWS) \u2014 preferred.** One round trip, a plain client, no client-side logic. Name substitute models (the only supported fallback target at launch is \`claude-opus-4-8\`, expansion expected); on a policy decline the API runs the next model on the same request and returns its answer, with credit-style repricing applied automatically. A \`stop_reason: "refusal"\` on the final response means the whole chain refused.

\`\`\`python
response = client.beta.messages.create(
    model="{{FABLE_ID}}",
    max_tokens=1024,
    betas=["server-side-fallback-2026-06-01"],
    fallbacks=[{"model": "claude-opus-4-8"}],
    messages=[{"role": "user", "content": "Hello, Claude"}],
)

# Switch points: one fallback block per model that ran and declined this turn
for block in response.content:
    if block.type == "fallback":
        print(f"{block.from_.model} declined; {block.to.model} continued")

# Served-by signal: a fallback_message in usage.iterations means a fallback model
# ran; pair it with stop_reason to confirm the fallback served the response
# (a fallback model can also refuse). Covers sticky turns too.
fallback_ran = any(
    entry.type == "fallback_message" for entry in response.usage.iterations or []
)
if fallback_ran and response.stop_reason != "refusal":
    print(f"Served by {response.model}")
\`\`\`

Key semantics:

- **Header must be exactly \`server-side-fallback-2026-06-01\`** \u2014 other \`server-side-fallback-*\` values reject the \`fallbacks\` param with a 400. The current header carries the *earliest* date of the series (\`-2026-06-09\` and \`-2026-06-02\` were earlier previews) \u2014 do not "correct" it to a newer-looking date. Rejected on the Batches API; not available on Amazon Bedrock, Vertex AI, or Microsoft Foundry (use pattern 2 there \u2014 the SDK middleware). Entries may override \`max_tokens\` per hop (bounding that attempt's own output independently of the top-level \`max_tokens\`); \`thinking\`, \`output_config\`, and \`speed\` overrides are rolling out (\`speed\` additionally requires its beta) \u2014 until your requests accept them, include only \`model\` and \`max_tokens\` in each entry. Entries must be distinct and must be in the requested model's \`allowed_fallback_models\` (published on \`/v1/models\` when the \`server-side-fallback-2026-06-01\` beta header is set \u2014 not yet visible under the \`fallback-credit-*\` header alone, and not exposed on Amazon Bedrock, Vertex AI, or Microsoft Foundry). The request *with an entry's overrides merged in* must be valid as a direct request to that entry's model.
- **Triggers on policy declines only** \u2014 rate limits, overloads, and server errors on the requested model are returned as-is, never falling back.
- **Reading the response:** a \`fallback\` content block (\`{"type": "fallback", "from": {"model": ...}, "to": {"model": ...}}\`) marks each switch point in \`content\`; the served-by signal is a \`fallback_message\` entry in \`usage.iterations\` (don't rely on the block \u2014 sticky-served turns have none). Top-level \`model\` names the model that produced the message.
- **Billing:** \`usage.iterations\` is the per-attempt source of truth; top-level \`usage\` covers only the attempt that produced the returned message. Declined-before-output attempts are reported but not billed; fallback attempts bill at the fallback model's rates. Each attempt claims the rate limits of the model that ran it \u2014 if the fallback model is rate-limited or overloaded, the fallback attempt is not made and the preceding refusal is returned instead with \`stop_details.recommended_model\` naming a model to retry directly (the recommendation is a hint, not a guarantee, and is \`null\` when no recommendation is available) \u2014 size fallback-model limits for expected refusal volume.
- **Sticky routing:** once a conversation falls back, later non-streaming requests with \`fallbacks\` are served directly by the fallback model for ~1 hour (best-effort; org-scoped content-hash record, not message content; not recorded for ZDR orgs). Handle the requested model being tried again at any time.
- **Echoing fallback turns back:** after a mid-output fallback, omit \`thinking\`, \`redacted_thinking\`, and \`tool_use\` blocks \u2014 plus any \`server_tool_use\` block without its matching \`server_tool_result\`, and any other unrecognized model-internal block type \u2014 that appear *before* the final \`fallback\` block; text blocks, paired server-tool blocks, and everything after the boundary echo normally. The \`fallback\` block itself is an ignored audit marker (keep or drop). Streaming: the retry happens on the same stream and already-received content is never invalidated \u2014 a pre-output block is seamless (\`message_start\` names the fallback model; the \`fallback\` block arrives as an ordinary \`content_block_start\`, first in \`content\` \u2014 there is no special SSE event type; note \`message_start\` arrives only after the declined attempt, so time-to-first-byte includes it), and a mid-stream block keeps the partial, marks the boundary with the block, and continues \u2014 only the partial's \`text\` blocks are passed to the fallback model as continuation context (other block types stay in \`content\` but aren't part of it). Sticky routing is **not consulted on streaming requests** in the initial release, so on streams the \`fallback\` block check is the complete signal; non-streaming mid-output declines omit the declined partial entirely.

**2. SDK client-side middleware \u2014 for providers without server-side fallbacks (Amazon Bedrock, Vertex AI, Microsoft Foundry).** Register it on the client and every \`client.beta.messages\` request (streaming included) retries refusals automatically, splicing the fallback model's events onto the open stream in the same wire shape as pattern 1 (a \`fallback\` content block at each boundary, per-hop \`usage.iterations\`). It is also a beta surface: the middleware sends the \`fallback-credit-2026-06-01\` header by default so retries are repriced via credit tokens (override with its \`betas\` option). \`BetaFallbackState\` pins follow-up turns to the model that accepted (the client-side analog of sticky routing) \u2014 reuse one state object per conversation:

\`\`\`python
from anthropic import Anthropic, BetaFallbackState, BetaRefusalFallbackMiddleware

client = Anthropic(middleware=[BetaRefusalFallbackMiddleware([{"model": "claude-opus-4-8"}])])
state = BetaFallbackState()  # pins follow-ups to the model that accepted
with state:
    response = client.beta.messages.create(model="{{FABLE_ID}}", max_tokens=1024, messages=messages)
\`\`\`

Create **one state per conversation** \u2014 it is the pinning scope; sharing one across conversations pins unrelated threads together, and a conversation without a state is never pinned. Per-language naming (from the GA SDK examples \u2014 don't improvise):

- **TypeScript**: \`betaRefusalFallbackMiddleware([...])\` in the client's \`middleware\` array; pass \`{ fallbackState: state }\` (a \`BetaFallbackState\`) as a request option.
- **Go**: \`option.WithMiddleware(betafallback.BetaRefusalFallbackMiddleware([]anthropic.BetaFallbackParam{{Model: ...}}))\` (package \`lib/betafallback\`); state via \`betafallback.WithBetaFallbackState(&betafallback.BetaFallbackState{})\` passed as a request option. Server-side equivalents: \`Fallbacks: []anthropic.BetaFallbackParam{...}\` + \`anthropic.AnthropicBetaServerSideFallback2026_06_01\`.
- **C#**: it's a *handler* \u2014 \`new AnthropicClient { Handlers = [new BetaRefusalFallbackHandler { Fallbacks = [new(Model.ClaudeOpus4_8)] }] }\` (namespace \`Anthropic.Helpers\`); state via \`BetaFallbackState.Create()\` scoped per call with \`using (fallbackState.Use()) { ... }\`. Server-side equivalents: \`Fallbacks = [new(Model.ClaudeOpus4_8)]\` + \`AnthropicBeta.ServerSideFallback2026_06_01\`.

For languages not listed (Java, Ruby, PHP) \u2014 or for a full runnable program in any language \u2014 each public SDK repo ships a fallbacks example under \`examples/\` (e.g. \`examples/fallbacks.py\`, \`examples/refusal-fallback/\`): WebFetch the repo from \`shared/live-sources.md\` \xA7 SDK Repositories rather than improvising the binding.

**3. Hand-rolled retry + fallback credit (raw HTTP, or SDKs without the middleware).** Detect the refusal via \`stop_reason\` and re-send the conversation as-is on a model with broader availability such as \`claude-opus-4-8\` ({{FABLE_NAME}}'s thinking blocks are silently ignored by other models \u2014 no stripping required); keep using the fallback model for subsequent turns. **Fallback credit** (beta: Claude API, Claude Platform on AWS, Amazon Bedrock, Vertex AI, and Microsoft Foundry) makes those retries cheaper. Prompt caches are per-model, so a plain retry pays cold cache-writes on the new model. With the \`fallback-credit-2026-06-01\` beta header (send it on both the original request and the retry), a refusal's \`stop_details\` carries \`fallback_credit_token\` (opaque; \`null\` when unavailable) and \`fallback_has_prefill_claim\`. Echo the token as the top-level \`fallback_credit_token\` request parameter on the retry (typed in the GA SDKs; on a pre-GA SDK pass it via \`extra_body\`) and the previously-cached span bills at cache-read rates \u2014 the retry costs what it would have if the conversation had been on that model all along. Rules: the retry body must match the refused request **exactly** in every prompt-shaping field (\`system\`, \`messages\`, \`tools\`, \`tool_choice\`, \`thinking\` \u2014 do **not** strip thinking blocks when redeeming a credit \u2014 the server handles them); the retry model must be in the refused model's \`allowed_fallback_models\`; the token expires in 5 minutes; Batches results carry no tokens. If \`fallback_has_prefill_claim\` is \`true\`, append one assistant message echoing the refused response's \`content\` \u2014 the retry model continues from where the refused model stopped (and completed server-tool work isn't re-run). When echoing, strip trailing whitespace from a final \`text\` block (the prefill validator rejects it; the credit match tolerates that edit), after omitting any unpaired \`tool_use\` blocks. On a 400, fall back to the unchanged body with the token; on a 400 naming \`fallback_credit_token\`, retry without it (credit forfeited).

**Migrating code built on the v1 preview.** If the code you're editing carries any of these markers, it targets the discontinued early-access surface \u2014 migrate it to the v2 shapes above, and ship the header and parameter changes together (the v1 parameter shape under the v2 header is a 400):

| v1 marker (replace) | v2 |
|---|---|
| \`server-side-fallback-2026-06-09\` / \`-2026-06-02\` header | \`server-side-fallback-2026-06-01\` |
| \`fallback: {model, on_partial}\` single object | \`fallbacks: [{model, ...}]\` array (1\u20133); \`on_partial\` no longer exists \u2014 partial-output behavior is fixed (streams keep the partial; non-streaming omits it). Unknown keys in an entry are a 400 |
| Top-level \`response.fallback\` object (\`from_model\`, \`reason\`) | Never emitted \u2014 read \`fallback\` content blocks (switch points, no \`reason\` field) and \`usage.iterations\` (served-by) |
| \`event: fallback\` SSE with discard indices | No dedicated event; streamed content is never invalidated \u2014 the switch arrives as an ordinary \`content_block_start\`/\`stop\` pair of type \`fallback\` |
| \`fallback_primary\` / \`fallback_retry\` iteration types | Blocked attempts are plain \`message\` entries; the serving attempt is \`fallback_message\` |
| \`reason: "sticky"\` | No reason field \u2014 sticky turns carry no block; detect via \`fallback_message\` in \`usage.iterations\` + \`response.model\` |
| \`recommended_model\` meaning "primary served the refusal" | Now populated only when the fallback attempt *couldn't run* (rate-limited/overloaded) \u2014 its presence means a direct retry on that model may succeed, not that it refused too |

### Data retention requirement

{{FABLE_NAME}} requires **30-day data retention** and is not available under zero data retention. Requests from an organization whose data-retention configuration doesn't meet the requirement return \`400 invalid_request_error\` \u2014 if a migration suddenly 400s with no obvious request problem, check the org's retention configuration before debugging the payload. On Amazon Bedrock, Google Vertex AI, and Microsoft Foundry, data-retention requirements are set by each platform.

### What carries over unchanged

Same Messages API and tool-use patterns as Opus-tier and Mythos Preview. Supported at launch: \`output_config.effort\` (\`low\`/\`medium\`/\`high\`/\`xhigh\`/\`max\`), Task Budgets (beta, \`task-budgets-2026-03-13\` header), compaction (beta, \`compact-2026-01-12\` header), the memory tool, tool-call clearing via context editing, and high-resolution vision (no downscaling cap, as on Opus 4.7+).

### Behavioral shifts (prompt-tunable)

None of these are API-breaking, but they're where migrated workloads feel different. {{FABLE_NAME}}'s biggest gains are on work *above* what prior models could do (long-horizon autonomous runs, first-shot implementations of well-specified systems, end-to-end enterprise deliverables \u2014 financial analysis, spreadsheets, slides, docs \u2014 code review/debugging and repository-history search, vision on dense or degraded images \u2014 it's explicitly trained to use bash and crop tools on flipped/blurry/noisy inputs \u2014 navigating ambiguity, parallel sub-agent delegation and collaboration \u2014 it reliably sustains ongoing communications with long-running sub-agents and peer agents; note bug-finding gains exclude security-focused analysis, where the cyber classifiers apply) \u2014 don't evaluate it only on workloads older models already handled.

**Longer turns by default \u2014 the biggest structural shift.** Individual requests on hard tasks can run many minutes at higher effort (a 15-minute single request is normal when the task involves gathering context, building, and self-verifying). Before migrating, plan timeouts, streaming, and user-facing progress indicators; structure work so callers check in on runs asynchronously rather than blocking inside one request. On ambiguous tasks {{FABLE_NAME}} may need a small nudge to avoid overplanning:

> When you have enough information to act, act. Do not re-derive facts already established in the conversation, re-litigate a decision the user has already made, or narrate options you will not pursue in user-facing messages. If you are weighing a choice, give a recommendation, not an exhaustive survey. This does not apply to thinking blocks.

**Consider all effort levels.** \`output_config.effort\` is the primary intelligence/latency/cost control. Recommended defaults: \`high\` for most tasks, \`xhigh\` for the most capability-sensitive workloads, \`medium\`/\`low\` for routine work. Lower effort settings \u2014 including \`low\` \u2014 still perform very well on {{FABLE_NAME}}, often exceeding the \`xhigh\` or even \`max\` performance of previous models. Reduce effort if a task completes correctly but takes longer than necessary, or for a quicker interactive working style. At higher effort on routine work, {{FABLE_NAME}} can gather context and deliberate beyond what the task needs (the flip side: higher effort buys excellent verification behavior and the most rigorous outputs). To prevent unrequested tidying or refactoring at higher effort:

> Don't add features, refactor, or introduce abstractions beyond what the task requires. A bug fix doesn't need surrounding cleanup and a one-shot operation usually doesn't need a helper. Don't design for hypothetical future requirements - do the simplest thing that works well. Avoid premature abstraction. Avoid half-finished implementations either. Don't add error handling, fallbacks, or validation for scenarios that cannot happen. Trust internal code and framework guarantees. Only validate at system boundaries (user input, external APIs). Don't use feature flags or backwards-compatibility shims when you can just change the code.

**Instruction following is strong \u2014 use it.** {{FABLE_NAME}} is very responsive to explicit communication-style sections in system prompts; invest in them rather than fighting output style downstream. Un-steered \u2014 especially at higher effort \u2014 it can elaborate beyond what the task needs: heavily-structured PR descriptions, sections on alternatives that weren't chosen, comments narrating what the next line does. You don't need to enumerate these behaviors by name; a brief instruction is just as effective:

> Lead with the outcome. Your first sentence after finishing should answer "what happened" or "what did you find" \u2014 the thing the user would ask for if they said "just give me the TLDR." Supporting detail and reasoning come after. Being readable and being concise are different things, and readability matters more. The way to keep output short is to be selective about what you include (drop details that don't change what the reader would do next), not to compress the writing into fragments, abbreviations, arrow chains like A \u2192 B \u2192 fails, or jargon.

**Ground progress claims on long runs.** Require progress claims to be audited against tool results \u2014 in testing this nearly eliminated fabricated status reports on tasks designed to elicit them:

> Before reporting progress, audit each claim against a tool result from this session. Only report work you can point to evidence for; if something is not yet verified, say so explicitly. Report outcomes faithfully: if tests fail, say so with the output; if a step was skipped, say that; when something is done and verified, state it plainly without hedging.

**State boundaries explicitly.** {{FABLE_NAME}} sometimes takes unrequested-but-adjacent actions (e.g. composing an email straight to drafts, creating backup git branches). Define what it should *not* do:

> When the user is describing a problem, asking a question, or thinking out loud rather than requesting a change, the deliverable is your assessment. Report your findings and stop. Don't apply a fix until they ask for one. Before running a command that changes system state \u2014 restarts, deletes, config edits \u2014 check that the evidence actually supports that specific action. A signal that pattern-matches to a known failure may have a different cause.

**Let it delegate \u2014 asynchronously.** Parallel sub-agents are dependable on {{FABLE_NAME}} \u2014 instead of suppressing delegation (a common prior-model guardrail), use sub-agents frequently and give explicit guidance on *when* delegation is desirable. Sub-agents that communicate **asynchronously** with the orchestrator outperform spawn-and-block: long-lived agents keep their context instead of re-establishing it per subtask (cache-read savings), the orchestrator isn't bottlenecked on the slowest sub-agent, and context persists across subtasks.

> Delegate independent subtasks to sub-agents and keep working while they run. Intervene if a sub-agent goes off track or is missing relevant context.

**Give it a memory surface.** {{FABLE_NAME}} performs notably better when it can write learnings somewhere for future reference \u2014 even a plain \`.md\` file. Tell it where, tell it to consult that file in future sessions, and give it a format:

> Store one lesson per file with a one-line summary at the top. Record corrections and confirmed approaches alike, including why they mattered. Don't save what the repo or chat history already records; update an existing note rather than creating a duplicate; delete notes that turn out to be wrong.

**Rare: early stopping.** Deep into long sessions it can occasionally end a turn with a text-only statement of intent ("I'll now run X") without the tool call, or ask permission it doesn't need. A "continue" recovers it interactively; for autonomous pipelines add a system reminder:

> You are operating autonomously. The user is not watching in real time and cannot answer questions mid-task, so asking 'Want me to\u2026?' or 'Shall I\u2026?' will block the work. For reversible actions that follow from the original request, proceed without asking. Offering follow-ups after the task is done is fine; asking permission after already discussing with the user before doing the work is not. Before ending your turn, check your last paragraph. If it is a plan, an analysis, a question, a list of next steps, or a promise about work you have not done ('I'll\u2026', 'let me know when\u2026'), do that work now with tool calls. End your turn only when the task is complete or you are blocked on input only the user can provide.

**Rare: context anxiety.** In very long sessions it can worry about running out of context \u2014 suggesting a new session or trimming its own work \u2014 most often when the harness surfaces a remaining-token countdown. Avoid showing explicit context-budget counts; if you must:

> You have ample context remaining. Do not stop, summarize, or suggest a new session on account of context limits \u2013 continue the work.

**Give the reason, not just the request.** {{FABLE_NAME}} performs better when it understands the intent behind a request \u2014 it connects the task to relevant information rather than inferring intent on its own. This matters most for long-running agents juggling context from disparate workstreams:

> I'm working on [the larger task] for [who it's for]. They need [what the output enables]. With that in mind: [request].

**Readability in long agentic sessions.** Deep into extended conversations (many tool calls, large working context) {{FABLE_NAME}} can produce text users find hard to follow \u2014 dense arrow-chain shorthand, implementation-level detail, references to thinking the user never saw. A communication-style addendum strongly mitigates this; adapt:

> Terse shorthand is fine between tool calls (that's you thinking out loud, and brevity there is good). Your final summary is different: it's for a reader who didn't see any of that. If you've been working for a while without the user watching - overnight, across many tool calls, since they last spoke - your final message is their first look at any of it. Write it as a re-grounding, not a continuation of your working thread: the outcome first, then the one or two things you need from them, each explained as if new. The vocabulary you built up while working is yours, not theirs; leave it behind unless you re-introduce it. When you write the summary at the end, drop the working shorthand. Write complete sentences. Spell out terms instead of abbreviating them. Don't use arrow chains, hyphen-stacked compounds, or labels you made up earlier \u2014 the reader doesn't have the context to decode them. When you mention files, commits, flags, or other identifiers, give each one its own plain-language clause saying what it is or what changed \u2014 never pack several into one parenthesized run or slash-separated list. Open with the outcome: one sentence on what happened or what you found. Then the supporting detail. If you have to choose between short and clear, choose clear.

### Long-running agent recommendations

- **Make self-verification explicit.** For long-running builds, instruct it to establish and run its own checking harness on a cadence ("Establish a method for checking your own work as you build; run it every [interval], verifying against the specification with sub-agents"). Separate fresh-context verifier sub-agents tend to outperform self-critique.
- **De-prescribe migrated prompts and skills.** Prompts and skills written for prior models are often too prescriptive for {{FABLE_NAME}} and *reduce* output quality. After migrating, A/B the workload with older step-by-step scaffolding removed \u2014 prefer stating the goal and constraints over enumerating the steps. {{FABLE_NAME}} is also good at updating skills on the fly from what it learns mid-task \u2014 let it.
- **Start at the top of your difficulty range.** The teams with the best early-access outcomes gave it their hardest unsolved problems first \u2014 have it scope the problem, ask questions, then execute.
- **Add a \`send_to_user\` tool for verbatim mid-task delivery.** When an asynchronous agent must deliver something the user sees *exactly as written* mid-run (a deliverable, a progress update with specific numbers, a direct answer), give it a client-side tool whose input you render directly in the UI \u2014 tool inputs are never summarized, so content arrives intact. Return a simple acknowledgement as the tool result:

\`\`\`json
{
  "name": "send_to_user",
  "description": "Display a message directly to the user. Use this for progress updates, partial results, or content the user must see exactly as written before the task finishes.",
  "input_schema": {
    "type": "object",
    "properties": {
      "message": { "type": "string", "description": "The content to display to the user." }
    },
    "required": ["message"]
  }
}
\`\`\`

For agents that only narrate routine progress, the model's default progress narration is typically adequate without this tool.

### {{FABLE_NAME}} Migration Checklist

- [ ] **[BLOCKS]** Update the \`model=\` string to \`{{FABLE_ID}}\` (\`{{MYTHOS_ID}}\` for Mythos Preview migrators in Project Glasswing)
- [ ] **[BLOCKS]** Remove \`thinking: {type: "disabled"}\` (errors on {{FABLE_NAME}})
- [ ] **[BLOCKS]** Replace assistant prefill with structured outputs or system prompt instructions
- [ ] **[BLOCKS]** Confirm the org meets the 30-day data-retention requirement (ZDR orgs get \`400 invalid_request_error\` on every request)
- [ ] **[BLOCKS]** Remove all other \`thinking\` configuration (\`{type: "enabled", budget_tokens: N}\` returns a 400, same as on Opus 4.7/4.8); control depth with \`output_config.effort\` instead
- [ ] **[BLOCKS]** If thinking content is surfaced to users or stored in logs: add \`thinking: {type: "adaptive", display: "summarized"}\` (the default is \`"omitted"\` \u2014 otherwise the rendered text is empty)
- [ ] **[TUNE]** Re-baseline cost and latency on your own workloads \u2014 token counts are roughly unchanged from Opus 4.7/4.8 and Mythos Preview (same tokenizer); per-token pricing differs. Coming from Opus 4.6, Sonnet, Haiku, or older, token counts differ \u2014 use \`count_tokens\` with each model to compare
- [ ] **[TUNE]** Add \`stop_reason == "refusal"\` handling before reading \`response.content\` (pre-output: empty + unbilled; mid-stream: partial output billed \u2014 discard); opt into a fallback by default \u2014 server-side \`fallbacks\` (\`server-side-fallback-2026-06-01\`, Claude API and Claude Platform on AWS) where available, otherwise the SDK middleware or fallback credit (\`fallback-credit-2026-06-01\`, exact body); a bare client-side replay (history as-is; other models drop Fable's thinking blocks) is the floor, not the recommendation
- [ ] **[TUNE]** If you surfaced thinking text to users, plan for the thinking output change \u2014 the raw chain of thought is never returned; render the \`display: "summarized"\` summary (per the [BLOCKS] item above); pass blocks back unchanged on the same model; other models drop them from the prompt (unbilled)
- [ ] **[TUNE]** Plan for minutes-long turns: timeouts, streaming, async check-ins, progress UX (see Behavior changes above)
- [ ] **[TUNE]** Run an effort sweep including low/medium for routine workloads; add the no-tidying instruction if higher effort produces unrequested refactors
- [ ] **[TUNE]** A/B with prior-model scaffolding removed \u2014 over-prescriptive prompts/skills reduce {{FABLE_NAME}} output quality

---

## Verify the Migration

After updating, spot-check that the new model is actually being used. Replace \`YOUR_TARGET_MODEL\` with the model string you migrated to (e.g. \`{{FABLE_ID}}\`, \`claude-opus-4-8\`, \`claude-opus-4-7\`, \`{{SONNET_NEXT_ID}}\`, \`claude-sonnet-4-6\`, \`claude-haiku-4-5\`) and keep the assertion prefix in sync:

\`\`\`python
YOUR_TARGET_MODEL = "{{OPUS_ID}}"  # or "claude-opus-4-7", "{{SONNET_NEXT_ID}}", "claude-sonnet-4-6", "claude-haiku-4-5"
response = client.messages.create(model=YOUR_TARGET_MODEL, max_tokens=64, messages=[...])
assert response.model.startswith(YOUR_TARGET_MODEL), response.model
\`\`\`

For rate-limit headroom changes, pricing, or capability deltas (vision, structured outputs, effort support), query the Models API:

\`\`\`python
m = client.models.retrieve(YOUR_TARGET_MODEL)
m.max_input_tokens, m.max_tokens
m.capabilities["effort"]["max"]["supported"]
\`\`\`

See \`shared/models.md\` for the full capability lookup pattern.
`;
  var WLc = () => {};
  var zLc = `# Claude Model Catalog

**Only use exact model IDs listed in this file.** Never guess or construct model IDs \u2014 incorrect IDs will cause API errors. Use aliases wherever available. For the latest information, WebFetch the Models Overview URL in \`shared/live-sources.md\`, or query the Models API directly (see Programmatic Model Discovery below).

## Programmatic Model Discovery

For **live** capability data \u2014 context window, max output tokens, feature support (thinking, vision, effort, structured outputs, etc.) \u2014 query the Models API instead of relying on the cached tables below. Use this when the user asks "what's the context window for X", "does model X support vision/thinking/effort", "which models support feature Y", or wants to select a model by capability at runtime.

\`\`\`python
m = client.models.retrieve("claude-opus-4-8")
m.id                 # "claude-opus-4-8"
m.display_name       # "Claude Opus 4.8"
m.max_input_tokens   # context window (int)
m.max_tokens         # max output tokens (int)

# capabilities is an untyped nested dict \u2014 bracket access, check ["supported"] at the leaf
caps = m.capabilities
caps["image_input"]["supported"]                       # vision
caps["thinking"]["types"]["adaptive"]["supported"]     # adaptive thinking
caps["effort"]["max"]["supported"]                     # effort: max (also low/medium/high)
caps["structured_outputs"]["supported"]
caps["context_management"]["compact_20260112"]["supported"]

# filter across all models \u2014 iterate the page object directly (auto-paginates); do NOT use .data
[m for m in client.models.list()
 if m.capabilities["thinking"]["types"]["adaptive"]["supported"]
 and m.max_input_tokens >= 200_000]
\`\`\`

Top-level fields (\`id\`, \`display_name\`, \`max_input_tokens\`, \`max_tokens\`) are typed attributes. \`capabilities\` is a dict \u2014 use bracket access, not attribute access. The API returns the full capability tree for every model with \`supported: true/false\` at each leaf, so bracket chains are safe without \`.get()\` guards. TypeScript SDK: same method names, also auto-paginates on iteration.

### Raw HTTP

\`\`\`bash
curl https://api.anthropic.com/v1/models/claude-opus-4-8 \\
  -H "x-api-key: $ANTHROPIC_API_KEY" \\
  -H "anthropic-version: 2023-06-01"
\`\`\`

\`\`\`json
{
  "id": "claude-opus-4-8",
  "display_name": "Claude Opus 4.8",
  "max_input_tokens": 1000000,
  "max_tokens": 128000,
  "capabilities": {
    "image_input": {"supported": true},
    "structured_outputs": {"supported": true},
    "thinking": {"supported": true, "types": {"enabled": {"supported": false}, "adaptive": {"supported": true}}},
    "effort": {"supported": true, "low": {"supported": true}, \u2026, "max": {"supported": true}},
    \u2026
  }
}
\`\`\`

## Current Models (recommended)

| Friendly Name     | Alias (use this)    | Full ID                       | Context        | Max Output | Status |
|-------------------|---------------------|-------------------------------|----------------|------------|--------|
| {{FABLE_NAME}}    | \`{{FABLE_ID}}\`      | \u2014                             | 1M             | 128K       | Active |
| {{MYTHOS_NAME}}   | \`{{MYTHOS_ID}}\`     | \u2014                             | 1M             | 128K       | Active (Project Glasswing only) |
| Claude Opus 4.8   | \`claude-opus-4-8\`   | \u2014                             | 1M             | 128K       | Active |
| Claude Opus 4.7   | \`claude-opus-4-7\`   | \u2014                             | 1M             | 128K       | Active |
| Claude Opus 4.6   | \`claude-opus-4-6\`   | \u2014                             | 1M             | 128K       | Active |
| {{SONNET_NEXT_NAME}} | \`{{SONNET_NEXT_ID}}\` | \u2014                         | 1M             | 128K       | Active |
| Claude Sonnet 4.6 | \`claude-sonnet-4-6\` | -                             | 1M             | 128K       | Active |
| Claude Haiku 4.5  | \`claude-haiku-4-5\`  | \`claude-haiku-4-5-20251001\`   | 200K           | 64K        | Active |

### Model Descriptions
- **{{FABLE_NAME}}** \u2014 Anthropic's most capable widely released model, for the most demanding reasoning and long-horizon agentic work. Same API surface as Opus 4.7/4.8 with one new breaking change: an explicit \`thinking: {type: "disabled"}\` returns a 400 \u2014 omit the \`thinking\` parameter instead (thinking is always on; the raw chain of thought is never returned \u2014 summaries via \`display: "summarized"\`). Same tokenizer as Opus 4.8 (token counts roughly unchanged vs Opus 4.7/4.8). Safety classifiers may return \`stop_reason: "refusal"\`. No assistant prefill. Requires 30-day data retention (not available under ZDR). $10/$50 per MTok; 1M context window (default), 128K max output. See \`shared/model-migration.md\` \u2192 Migrating to {{FABLE_NAME}}.
- **{{MYTHOS_NAME}}** \u2014 Same capabilities, pricing, limits, and API behavior as {{FABLE_NAME}}; only the model ID differs. Available exclusively through Project Glasswing, where it joins (and succeeds) the invitation-only Claude Mythos Preview (\`claude-mythos-preview\`). Use it only when the org participates in Project Glasswing; otherwise use {{FABLE_ID}}.
- **Claude Opus 4.8** \u2014 The most capable Opus-tier model \u2014 highly autonomous, state-of-the-art on long-horizon agentic work, knowledge work, and memory; clearer, warmer writing. Same API surface as Opus 4.7 (adaptive thinking only; sampling parameters and \`budget_tokens\` removed). 1M context window at standard API pricing (no long-context premium). See \`shared/model-migration.md\` \u2192 Migrating to Opus 4.8 \u2014 a 4.7 \u2192 4.8 move is a model-ID swap plus prompt re-tuning, no new breaking changes.
- **Claude Opus 4.7** \u2014 Previous-generation Opus. Highly autonomous; strong on long-horizon agentic work, knowledge work, vision, and memory. Adaptive thinking only; sampling parameters and \`budget_tokens\` removed. 1M context window. See \`shared/model-migration.md\` \u2192 Migrating to Opus 4.7.
- **Claude Opus 4.6** \u2014 Older Opus. Supports adaptive thinking (recommended), 128K max output tokens (requires streaming for large outputs). 1M context window.
- **{{SONNET_NEXT_NAME}}** \u2014 The best combination of speed and intelligence in the Sonnet tier; near-Opus quality on coding and agentic work. Adaptive thinking on by default (omitting \`thinking\` runs adaptive); manual \`budget_tokens\` removed; non-default sampling parameters rejected. \`effort\` supports \`low\`/\`medium\`/\`high\`/\`xhigh\`/\`max\`. New tokenizer (~30% more tokens for the same text vs Sonnet 4.6). High-resolution vision (2576px). 1M context window, 128K max output. See \`shared/model-migration.md\` \u2192 Migrating to {{SONNET_NEXT_NAME}}.
- **Claude Sonnet 4.6** \u2014 Previous-generation Sonnet. Supports adaptive thinking (recommended). 1M context window. 128K max output tokens.
- **Claude Haiku 4.5** \u2014 Fastest and most cost-effective model for simple tasks.

## Legacy Models (still active)

| Friendly Name     | Alias (use this)    | Full ID                       | Status |
|-------------------|---------------------|-------------------------------|--------|
| Claude Opus 4.5   | \`claude-opus-4-5\`   | \`claude-opus-4-5-20251101\`    | Active |
| Claude Opus 4.1   | \`claude-opus-4-1\`   | \`claude-opus-4-1-20250805\`    | Deprecated (retires 2026-08-05 \u2014 migrate to \`claude-opus-4-8\`) |
| Claude Sonnet 4.5 | \`claude-sonnet-4-5\` | \`claude-sonnet-4-5-20250929\`  | Active |

## Deprecated Models (retiring soon)

| Friendly Name     | Alias (use this)    | Full ID                       | Status     | Retires      |
|-------------------|---------------------|-------------------------------|------------|--------------|
| Claude Sonnet 4   | \`claude-sonnet-4-0\` | \`claude-sonnet-4-20250514\`    | Deprecated | TBD          |
| Claude Opus 4     | \`claude-opus-4-0\`   | \`claude-opus-4-20250514\`      | Deprecated | TBD          |
| Claude Haiku 3    | \u2014                   | \`claude-3-haiku-20240307\`     | Deprecated | Apr 19, 2026 |

## Retired Models (no longer available)

| Friendly Name     | Full ID                       | Retired     |
|-------------------|-------------------------------|-------------|
| Claude Sonnet 3.7 | \`claude-3-7-sonnet-20250219\`  | Feb 19, 2026 |
| Claude Haiku 3.5  | \`claude-3-5-haiku-20241022\`   | Feb 19, 2026 |
| Claude Opus 3     | \`claude-3-opus-20240229\`      | Jan 5, 2026 |
| Claude Sonnet 3.5 | \`claude-3-5-sonnet-20241022\`  | Oct 28, 2025 |
| Claude Sonnet 3.5 | \`claude-3-5-sonnet-20240620\`  | Oct 28, 2025 |
| Claude Sonnet 3   | \`claude-3-sonnet-20240229\`    | Jul 21, 2025 |
| Claude 2.1        | \`claude-2.1\`                  | Jul 21, 2025 |
| Claude 2.0        | \`claude-2.0\`                  | Jul 21, 2025 |

## Resolving User Requests

When a user asks for a model by name, use this table to find the correct model ID:

| User says...                              | Use this model ID              |
|-------------------------------------------|--------------------------------|
| "fable", "most capable model"             | \`{{FABLE_ID}}\`                 |
| "most powerful"                           | \`{{FABLE_ID}}\`                 |
| "mythos", "mythos 5"                      | \`{{MYTHOS_ID}}\` (Project Glasswing participants only; otherwise use \`{{FABLE_ID}}\`) |
| "mythos preview"                          | \`{{MYTHOS_ID}}\` (successor to \`claude-mythos-preview\` \u2014 see migration guide) |
| "opus"                                    | \`claude-opus-4-8\`              |
| "opus 4.8"                                | \`claude-opus-4-8\`              |
| "opus 4.7"                                | \`claude-opus-4-7\`              |
| "opus 4.6"                                | \`claude-opus-4-6\`              |
| "opus 4.5"                                | \`claude-opus-4-5\`              |
| "opus 4.1"                                | \`claude-opus-4-1\` (deprecated, retires 2026-08-05 \u2014 suggest \`claude-opus-4-8\`) |
| "opus 4", "opus 4.0"                      | \`claude-opus-4-0\` (deprecated \u2014 suggest \`claude-opus-4-8\`) |
| "sonnet", "balanced"                      | \`{{SONNET_NEXT_ID}}\`           |
| "sonnet 5"                                | \`{{SONNET_NEXT_ID}}\`           |
| "sonnet 4.6"                              | \`claude-sonnet-4-6\`            |
| "sonnet 4.5"                              | \`claude-sonnet-4-5\`            |
| "sonnet 4", "sonnet 4.0"                  | \`claude-sonnet-4-0\` (deprecated \u2014 suggest \`{{SONNET_NEXT_ID}}\`) |
| "sonnet 3.7"                              | Retired \u2014 suggest \`{{SONNET_NEXT_ID}}\` |
| "sonnet 3.5"                              | Retired \u2014 suggest \`{{SONNET_NEXT_ID}}\` |
| "haiku", "fast", "cheap"                  | \`claude-haiku-4-5\`             |
| "haiku 4.5"                               | \`claude-haiku-4-5\`             |
| "haiku 3.5"                               | Retired \u2014 suggest \`claude-haiku-4-5\` |
| "haiku 3"                                 | Deprecated \u2014 suggest \`claude-haiku-4-5\` |
`;
  var VLc = () => {};
  var YLc = `# Platform Availability

Which features work on which provider platform. **This table is the single source of truth in this skill** \u2014 per-feature sections elsewhere point here instead of restating availability. When writing code for a third-party platform (Bedrock, Vertex, Foundry) or Claude Platform on AWS, check this table first; a feature not supported there means use the first-party Claude API surface or a different approach.

Columns: **1P** = first-party Claude API, **P-AWS** = Claude Platform on AWS (Anthropic-operated, same-day parity), **Bedrock** = Amazon Bedrock, **Vertex** = Google Cloud Vertex AI, **Foundry** = Microsoft Foundry. \u2705 = GA, \u03B2 = beta, \u274C = not supported.

| Feature | 1P | P-AWS | Bedrock | Vertex | Foundry | Notes |
|---|---|---|---|---|---|---|
| Messages, streaming, tool use | \u2705 | \u2705 | \u2705 | \u2705 | \u2705 | Core API |
| PDF input | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Structured outputs / strict tool use | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Adaptive thinking / effort | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Extended thinking | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Prompt caching (5m, 1h) | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Automatic prompt caching | \u2705 | \u2705 | \u274C | \u274C | \u03B2 | |
| Token counting | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Citations | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Search results content blocks | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| Fine-grained tool streaming | \u2705 | \u2705 | \u2705 | \u2705 | \u2705 | |
| Compaction | \u03B2 | \u03B2 | \u03B2 | \u03B2 | \u03B2 | |
| Context editing | \u03B2 | \u03B2 | \u03B2 | \u03B2 | \u03B2 | |
| Context windows (1M) | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| \`inference_geo\` (data residency) | \u2705 | \u2705 | \u274C | \u274C | \u274C | |
| **Server-side tools** | | | | | | |
| &nbsp;&nbsp;Web search | \u2705 | \u2705 | \u274C | \u2705 | \u03B2 | Vertex: basic \`web_search_20250305\` only (no \`_20260209\` dynamic filtering) |
| &nbsp;&nbsp;Web fetch | \u2705 | \u2705 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;Code execution | \u2705 | \u2705 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;Tool search | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | Bedrock: InvokeModel API only, not Converse |
| &nbsp;&nbsp;Advisor tool | \u03B2 | \u03B2 | \u274C | \u274C | \u274C | |
| **Client-implemented tools** | | | | | | |
| &nbsp;&nbsp;Bash, text editor, memory | \u2705 | \u2705 | \u2705 | \u2705 | \u03B2 | |
| &nbsp;&nbsp;Computer use | \u03B2 | \u03B2 | \u03B2 | \u03B2 | \u03B2 | |
| **Agentic / orchestration** | | | | | | |
| &nbsp;&nbsp;Agent Skills (Messages API) | \u03B2 | \u03B2 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;Programmatic tool calling | \u2705 | \u2705 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;MCP connector | \u03B2 | \u03B2 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;Managed Agents | \u03B2 | \u03B2 | \u274C | \u274C | \u274C | Foundry \u274C inferred (not in Foundry docs either way) |
| &nbsp;&nbsp;Self-hosted sandboxes | \u03B2 | \u03B2 | \u274C | \u274C | \u274C | P-AWS: \`GET /v1/environments/{id}/work\` list endpoint not supported; other work endpoints OK |
| **API endpoints** | | | | | | |
| &nbsp;&nbsp;Message Batches | \u2705 | \u2705 | \u274C | \u274C | \u274C | |
| &nbsp;&nbsp;Files API | \u03B2 | \u03B2 | \u274C | \u274C | \u03B2 | |
| &nbsp;&nbsp;Models API | \u2705 | \u2705 | \u274C | \u274C | \u274C | |
| **Other** | | | | | | |
| &nbsp;&nbsp;Mid-conversation system messages | \u2705 | \u2705 | \u274C | \u274C | \u274C | {{OPUS_NAME}} only |
| &nbsp;&nbsp;Fast mode | \u03B2 | \u274C | \u274C | \u274C | \u274C | Research preview, beta \`fast-mode-2026-02-01\`, first-party API only |
| &nbsp;&nbsp;Cache diagnostics | \u03B2 | \u274C | \u274C | \u274C | \u274C | First-party API only |
| &nbsp;&nbsp;Task budgets | \u03B2 | \u03B2 | \u274C | \u274C | \u274C | Beta header \`task-budgets-2026-03-13\`; 3P availability not documented \u2014 assume unsupported |

<!--
GROUNDING (reviewer-only; stripped at runtime by processSkillMarkdown).
All paths are under docker_eval/resources/cdp-skill/public-docs/.

Primary source: build-with-claude/overview.mdx <PlatformAvailability> props
(claudeApi\u21921P, claudePlatformAws\u2192P-AWS, bedrock\u2192Bedrock, vertexAi\u2192Vertex,
azureAi\u2192Foundry; *Beta suffix\u2192\u03B2; prop absent\u2192\u274C). Per-row citations:

  Context windows          ov:44
  Adaptive thinking        ov:45
  Batch / Message Batches  ov:46; bed:360; vtx:381; fdy:507
  Citations                ov:47
  inference_geo            ov:48
  Effort                   ov:49
  Extended thinking        ov:50
  PDF input                ov:51
  Search results           ov:52
  Structured outputs       ov:53
  Advisor tool             ov:63
  Code execution           ov:64
  Web fetch                ov:65
  Web search               ov:66; agents-and-tools/tool-use/web-search-tool.mdx:41
  Bash/text-editor/memory  ov:72,75,74
  Computer use             ov:73
  Agent Skills             ov:83
  Fine-grained streaming   ov:84
  MCP connector            ov:85; agents-and-tools/mcp-connector.mdx:36
  Programmatic tool call   ov:86
  Tool search              ov:87; agents-and-tools/tool-use/tool-search-tool.mdx:24-30
  Compaction               ov:95
  Context editing          ov:96
  Automatic caching        ov:97
  Prompt caching 5m/1h     ov:98,99
  Token counting           ov:100
  Files API                ov:108; build-with-claude/files.mdx:17
  Managed Agents           managed-agents/overview.mdx:11,70-72; bed:360; vtx:381
  Self-hosted sandboxes    build-with-claude/claude-platform-on-aws.mdx:525,547
  Mid-convo system msgs    build-with-claude/mid-conversation-system-messages.mdx:15
  Fast mode                build-with-claude/fast-mode.mdx:23
  Cache diagnostics        build-with-claude/cache-diagnostics.mdx:15,1379
  Task budgets             build-with-claude/task-budgets.mdx:15
  Models API               bed:360; vtx:381; fdy:506

  ov  = build-with-claude/overview.mdx
  bed = build-with-claude/claude-in-amazon-bedrock.mdx
  vtx = build-with-claude/claude-on-vertex-ai.mdx
  fdy = build-with-claude/claude-in-microsoft-foundry.mdx
-->
`;
  var KLc = () => {};
  var XLc = `# Prompt Caching \u2014 Design & Optimization

This file covers how to design prompt-building code for effective caching. For language-specific syntax, see the \`## Prompt Caching\` section in each language's README or single-file doc.

## The one invariant everything follows from

**Prompt caching is a prefix match. Any change anywhere in the prefix invalidates everything after it.**

The cache key is derived from the exact bytes of the rendered prompt up to each \`cache_control\` breakpoint. A single byte difference at position N \u2014 a timestamp, a reordered JSON key, a different tool in the list \u2014 invalidates the cache for all breakpoints at positions \u2265 N.

Render order is: \`tools\` \u2192 \`system\` \u2192 \`messages\`. A breakpoint on the last system block caches both tools and system together.

Design the prompt-building path around this constraint. Get the ordering right and most caching works for free. Get it wrong and no amount of \`cache_control\` markers will help.

---

## Workflow for optimizing existing code

When asked to add or optimize caching:

1. **Trace the prompt assembly path.** Find where \`system\`, \`tools\`, and \`messages\` are constructed. Identify every input that flows into them.
2. **Classify each input by stability:**
   - Never changes \u2192 belongs early in the prompt, before any breakpoint
   - Changes per-session \u2192 belongs after the global prefix, cache per-session
   - Changes per-turn \u2192 belongs at the end, after the last breakpoint
   - Changes per-request (timestamps, UUIDs, random IDs) \u2192 **eliminate or move to the very end**
3. **Check rendered order matches stability order.** Stable content must physically precede volatile content. If a timestamp is interpolated into the system prompt header, everything after it is uncacheable regardless of markers.
4. **Place breakpoints at stability boundaries.** See placement patterns below.
5. **Audit for silent invalidators.** See anti-patterns table.

---

## Placement patterns

### Large system prompt shared across many requests

Put a breakpoint on the last system text block. If there are tools, they render before system \u2014 the marker on the last system block caches tools + system together.

\`\`\`json
"system": [
  {"type": "text", "text": "<large shared prompt>", "cache_control": {"type": "ephemeral"}}
]
\`\`\`

### Multi-turn conversations

Put a breakpoint on the last content block of the most-recently-appended turn. Each subsequent request reuses the entire prior conversation prefix. Earlier breakpoints remain valid read points, so hits accrue incrementally as the conversation grows.

\`\`\`json
// Last content block of the last user turn
messages[-1].content[-1].cache_control = {"type": "ephemeral"}
\`\`\`

### Shared prefix, varying suffix

Many requests share a large fixed preamble (few-shot examples, retrieved docs, instructions) but differ in the final question. Put the breakpoint at the end of the **shared** portion, not at the end of the whole prompt \u2014 otherwise every request writes a distinct cache entry and nothing is ever read.

\`\`\`json
"messages": [{"role": "user", "content": [
  {"type": "text", "text": "<shared context>", "cache_control": {"type": "ephemeral"}},
  {"type": "text", "text": "<varying question>"}  // no marker \u2014 differs every time
]}]
\`\`\`

### Mid-conversation system messages

**{{OPUS_NAME}} only; no beta header.** When an operator instruction arrives mid-conversation \u2014 a mode switch, updated context, dynamically injected state \u2014 send it as \`{"role": "system", "content": "..."}\` appended to \`messages[]\`, rather than editing top-level \`system\`. Editing top-level \`system\` changes the prefix ahead of the entire conversation history, so every cached turn is re-processed uncached; a \`role: "system"\` message sits after the history and leaves the cached prefix intact.

\`\`\`json
// Top-level system stays byte-identical; new instruction goes after the cached history
"system": [{"type": "text", "text": "<stable core>", "cache_control": {"type": "ephemeral"}}],
"messages": [
  ...history,
  {"role": "user", "content": "..."},
  {"role": "system", "content": "Terse mode enabled \u2014 keep responses under 40 words."}
]
\`\`\`

This is also the prompt-injection-safe replacement for embedding operator instructions as text inside a user turn (the \`<system-reminder>\` pattern): both have the same caching profile, but \`role: "system"\` is the non-spoofable operator channel, whereas text inside user/tool content can be forged by anything that writes to user-visible input.

Available on {{OPUS_NAME}}; no beta header is required. Must follow a \`role: "user"\` message (or an \`assistant\` message ending in server-tool use), and must be either the last entry in \`messages\` or be followed by an \`assistant\` turn; cannot be \`messages[0]\` \u2014 use top-level \`system\` for the initial prompt. Content is text-only. Unsupported models return a 400 (\`BadRequestError\`: \`role 'system' is not supported on this model\`); catch that error and fall back to putting the instruction in a user-turn \`<system-reminder>\` block.

### Prompts that change from the beginning every time

Don't cache. If the first 1K tokens differ per request, there is no reusable prefix. Adding \`cache_control\` only pays the cache-write premium with zero reads. Leave it off.

---

## Architectural guidance

These are the decisions that matter more than marker placement. Fix these first.

**Keep the system prompt frozen.** Don't interpolate "current date: X", "mode: Y", "user name: Z" into the system prompt \u2014 those sit at the front of the prefix and invalidate everything downstream. Inject dynamic context later in \`messages\` instead \u2014 as a \`{"role": "system", ...}\` message where supported (see \xA7 Mid-conversation system messages above), or as text in a user message otherwise. A message at turn 5 invalidates nothing before turn 5.

**Don't change tools or model mid-conversation.** Tools render at position 0; adding, removing, or reordering a tool invalidates the entire cache. Same for switching models (caches are model-scoped). If you need "modes", don't swap the tool set \u2014 give Claude a tool that records the mode transition, or pass the mode as message content. Serialize tools deterministically (sort by name).

**Fork operations must reuse the parent's exact prefix.** Side computations (summarization, compaction, sub-agents) often spin up a separate API call. If the fork rebuilds \`system\` / \`tools\` / \`model\` with any difference, it misses the parent's cache entirely. Copy the parent's \`system\`, \`tools\`, and \`model\` verbatim, then append fork-specific content at the end.

---

## Silent invalidators

When reviewing code, grep for these inside anything that feeds the prompt prefix:

| Pattern | Why it breaks caching |
|---|---|
| \`datetime.now()\` / \`Date.now()\` / \`time.time()\` in system prompt | Prefix changes every request |
| \`uuid4()\` / \`crypto.randomUUID()\` / request IDs early in content | Same \u2014 every request is unique |
| \`json.dumps(d)\` without \`sort_keys=True\` / iterating a \`set\` | Non-deterministic serialization \u2192 prefix bytes differ |
| f-string interpolating session/user ID into system prompt | Per-user prefix; no cross-user sharing |
| Conditional system sections (\`if flag: system += ...\`) | Every flag combination is a distinct prefix |
| \`tools=build_tools(user)\` where set varies per user | Tools render at position 0; nothing caches across users |

Fix by moving the dynamic piece after the last breakpoint, making it deterministic, or deleting it if it's not load-bearing.

---

## API reference

\`\`\`json
"cache_control": {"type": "ephemeral"}              // 5-minute TTL (default)
"cache_control": {"type": "ephemeral", "ttl": "1h"} // 1-hour TTL
\`\`\`

- Max **4** \`cache_control\` breakpoints per request.
- Goes on any content block: system text blocks, tool definitions, message content blocks (\`text\`, \`image\`, \`tool_use\`, \`tool_result\`, \`document\`).
- Top-level \`cache_control\` on \`messages.create()\` auto-places on the last cacheable block \u2014 simplest option when you don't need fine-grained placement.
- Minimum cacheable prefix is model-dependent. Shorter prefixes silently won't cache even with a marker \u2014 no error, just \`cache_creation_input_tokens: 0\`:

| Model | Minimum |
|---|---:|
| Opus 4.8, Opus 4.7, Opus 4.6, Opus 4.5, Haiku 4.5 | 4096 tokens |
| Fable 5, Sonnet 4.6, Haiku 3.5, Haiku 3 | 2048 tokens |
| Sonnet 4.5, Sonnet 4.1, Sonnet 4, Sonnet 3.7 | 1024 tokens |

A 3K-token prompt caches on Sonnet 4.5 and Fable 5 but silently won't on Opus 4.8.

**Economics:** Cache reads cost ~0.1\xD7 base input price. Cache writes cost **1.25\xD7 for 5-minute TTL, 2\xD7 for 1-hour TTL**. Break-even depends on TTL: with 5-minute TTL, two requests break even (1.25\xD7 + 0.1\xD7 = 1.35\xD7 vs 2\xD7 uncached); with 1-hour TTL, you need at least three requests (2\xD7 + 0.2\xD7 = 2.2\xD7 vs 3\xD7 uncached). The 1-hour TTL keeps entries alive across gaps in bursty traffic, but the doubled write cost means it needs more reads to pay off.

---

## Verifying cache hits

The response \`usage\` object reports cache activity:

| Field | Meaning |
|---|---|
| \`cache_creation_input_tokens\` | Tokens written to cache this request (you paid the ~1.25\xD7 write premium) |
| \`cache_read_input_tokens\` | Tokens served from cache this request (you paid ~0.1\xD7) |
| \`input_tokens\` | Tokens processed at full price (not cached) |

If \`cache_read_input_tokens\` is zero across repeated requests with identical prefixes, a silent invalidator is at work \u2014 diff the rendered prompt bytes between two requests to find it.

**\`input_tokens\` is the uncached remainder only.** Total prompt size = \`input_tokens + cache_creation_input_tokens + cache_read_input_tokens\`. If your agent ran for hours but \`input_tokens\` shows 4K, the rest was served from cache \u2014 check the sum, not the single field.

Language-specific access: \`response.usage.cache_read_input_tokens\` (Python/TS/Ruby), \`$message->usage->cacheReadInputTokens\` (PHP), \`resp.Usage.CacheReadInputTokens\` (Go/C#), \`.usage().cacheReadInputTokens()\` (Java).

---

## Invalidation hierarchy

Not every parameter change invalidates everything. The API has three cache tiers, and changes only invalidate their own tier and below:

| Change | Tools cache | System cache | Messages cache |
|---|:---:|:---:|:---:|
| Tool definitions (add/remove/reorder) | \u274C | \u274C | \u274C |
| Model switch | \u274C | \u274C | \u274C |
| \`speed\`, web-search, citations toggle | \u2705 | \u274C | \u274C |
| System prompt content | \u2705 | \u274C | \u274C |
| \`tool_choice\`, images, \`thinking\` enable/disable | \u2705 | \u2705 | \u274C |
| Message content | \u2705 | \u2705 | \u274C |

Implication: you can change \`tool_choice\` per-request or toggle \`thinking\` without losing the tools+system cache. Don't over-worry about these \u2014 only tool-definition and model changes force a full rebuild.

---

## 20-block lookback window

Each breakpoint walks backward **at most 20 content blocks** to find a prior cache entry. If a single turn adds more than 20 blocks (common in agentic loops with many tool_use/tool_result pairs), the next request's breakpoint won't find the previous cache and silently misses.

Fix: place an intermediate breakpoint every ~15 blocks in long turns, or put the marker on a block that's within 20 of the previous turn's last cached block.

---

## Concurrent-request timing

A cache entry becomes readable only after the first response **begins streaming**. N parallel requests with identical prefixes all pay full price \u2014 none can read what the others are still writing.

For fan-out patterns: send 1 request, await the first streamed token (not the full response), then fire the remaining N\u22121. They'll read the cache the first one just wrote.

## Pre-warming the cache

To eliminate the cache-miss latency on the *first* real request, send a **\`max_tokens: 0\`** request at startup (or on an interval). The API runs prefill \u2014 writing the cache at your \`cache_control\` breakpoint \u2014 and returns immediately with \`content: []\`, \`stop_reason: "max_tokens"\`, and a populated \`usage\` block (zero output tokens billed; normal cache-write charge on \`cache_creation_input_tokens\`).

**When to pre-warm** \u2014 pre-warming trades a cache-write charge *now* for lower TTFT on the *next* real request. It's worth it when all three hold: (a) first-request latency is user-visible (chat/voice/interactive \u2014 not background jobs), (b) the shared prefix is large enough that a cold write is noticeably slow, and (c) there's a moment *before* traffic to fire it \u2014 app startup, worker boot, post-deploy, start of a scheduled window.

| Skip pre-warming when\u2026 | Because |
|---|---|
| Traffic is continuous (requests \u2264 TTL apart) | The first real request warms the cache and every subsequent one hits it; a separate warm call is a pure extra write |
| The prefix is small or below the cacheable minimum | The cold-write penalty is negligible |
| The prefix varies per request/user | Nothing shared to pre-warm |
| You'd pre-warm many distinct prefixes speculatively | Each is a ~1.25\xD7 write; cost can exceed the latency you save |

**Scheduled re-warms:** only needed when traffic has gaps longer than the TTL. If real requests arrive more often than every 5 minutes, they keep the cache warm on their own \u2014 don't add an interval re-warm. For bursty traffic with long idle gaps, either re-warm just under the TTL or switch to \`ttl: "1h"\` and re-warm less often.

\`\`\`python
client.messages.create(
    model="{{OPUS_ID}}",
    max_tokens=0,
    system=[{
        "type": "text",
        "text": SYSTEM_PROMPT,
        "cache_control": {"type": "ephemeral"},
    }],
    messages=[{"role": "user", "content": "warmup"}],
)
\`\`\`

**Breakpoint placement:** put \`cache_control\` on the **last block shared with the real request** (the system prompt or tool definitions) \u2014 **not** on the placeholder user message, and **not** via top-level automatic caching (which would key the cache to the placeholder). The placeholder can be any non-whitespace string; it's read during prefill but never answered.

**Rejected combinations:** \`max_tokens: 0\` is an \`invalid_request_error\` with \`stream: true\`, \`thinking.type: "enabled"\`, \`output_config.format\`, \`tool_choice\` of \`{"type":"tool"}\` or \`{"type":"any"}\`, or inside a Message Batches request.

**TTL still applies** \u2014 re-warm at least every 5 minutes for the default cache, or use the 1-hour TTL. This replaces the older \`max_tokens: 1\` workaround (no single-token reply to discard, no output tokens billed, intent is unambiguous).
`;
  var JLc = () => {};
  var ZLc = `# Token Counting

Use the \`count_tokens\` endpoint (\`POST /v1/messages/count_tokens\`) for accurate
token counts against Claude models. Token counts are **model-specific** \u2014 pass
the same model ID you'll use for inference.

**Do not use \`tiktoken\`.** It's OpenAI's tokenizer. It undercounts Claude
tokens by ~15\u201320% on typical text, and by much more on code or non-English
input. Any estimate from \`tiktoken\`, \`gpt-tokenizer\`, or similar is wrong for
Claude.

## Count a file or string

\`\`\`python
from anthropic import Anthropic

client = Anthropic()
resp = client.messages.count_tokens(
    model="{{OPUS_ID}}",
    messages=[{"role": "user", "content": open("CLAUDE.md").read()}],
)
print(resp.input_tokens)
\`\`\`

TypeScript: \`await client.messages.countTokens({model, messages})\` \u2192
\`.input_tokens\`. See \`{lang}/claude-api/README.md\` for other SDKs.

## CLI

\`\`\`sh
ant messages count-tokens --model {{OPUS_ID}} \\
  --message '{role: user, content: "@./CLAUDE.md"}' \\
  --transform input_tokens -r
\`\`\`

## Diffing a file across two versions

The endpoint is stateless \u2014 count each version separately and subtract:

\`\`\`python
from anthropic import Anthropic
import subprocess

client = Anthropic()
def count(text: str) -> int:
    return client.messages.count_tokens(
        model="{{OPUS_ID}}",
        messages=[{"role": "user", "content": text}],
    ).input_tokens

before = subprocess.check_output(["git", "show", "HEAD:CLAUDE.md"], text=True)
after = open("CLAUDE.md").read()
print(count(after) - count(before))
\`\`\`

Full docs: see the Token Counting entry in \`shared/live-sources.md\`.
`;
  var QLc = () => {};
  var tFc = `# Tool Use Concepts

This file covers the conceptual foundations of tool use with the Claude API. For language-specific code examples, see the \`python/\`, \`typescript/\`, or other language folders. For decision heuristics on which tools to expose, how to manage context in long-running agents, and caching strategy, see \`agent-design.md\`.

## User-Defined Tools

### Tool Definition Structure

> **Note:** When using the Tool Runner (beta), tool schemas are generated automatically from your function signatures (Python), Zod schemas (TypeScript), annotated classes (Java), \`jsonschema\` struct tags (Go), or \`BaseTool\` subclasses (Ruby). The raw JSON schema format below is for the manual approach \u2014 including PHP's \`BetaRunnableTool\`, which wraps a run closure around a hand-written schema \u2014 or SDKs without tool runner support.

Each tool requires a name, description, and JSON Schema for its inputs:

\`\`\`json
{
  "name": "get_weather",
  "description": "Get current weather for a location",
  "input_schema": {
    "type": "object",
    "properties": {
      "location": {
        "type": "string",
        "description": "City and state, e.g., San Francisco, CA"
      },
      "unit": {
        "type": "string",
        "enum": ["celsius", "fahrenheit"],
        "description": "Temperature unit"
      }
    },
    "required": ["location"]
  }
}
\`\`\`

**Best practices for tool definitions:**

- Use clear, descriptive names (e.g., \`get_weather\`, \`search_database\`, \`send_email\`)
- Write detailed descriptions \u2014 Claude uses these to decide when to use the tool. Be **prescriptive about *when* to call it**, not just what it does (e.g. "Call this when the user asks about current prices or recent events"). On recent Opus models, which reach for tools more conservatively, trigger conditions in the description give measurable lift in should-call rate.
- Include descriptions for each property
- Use \`enum\` for parameters with a fixed set of values
- Mark truly required parameters in \`required\`; make others optional with defaults

---

### Tool Choice Options

Control when Claude uses tools:

| Value                             | Behavior                                      |
| --------------------------------- | --------------------------------------------- |
| \`{"type": "auto"}\`                | Claude decides whether to use tools (default) |
| \`{"type": "any"}\`                 | Claude must use at least one tool             |
| \`{"type": "tool", "name": "..."}\` | Claude must use the specified tool            |
| \`{"type": "none"}\`                | Claude cannot use tools                       |

Any \`tool_choice\` value can also include \`"disable_parallel_tool_use": true\` to force Claude to use at most one tool per response. By default, Claude may request multiple tool calls in a single response.

---

### Tool Runner vs Manual Loop

**Tool Runner (Recommended):** The SDK's tool runner handles the agentic loop automatically \u2014 it calls the API, detects tool use requests, executes your tool functions, feeds results back to Claude, and repeats until Claude stops calling tools. Available in Python, TypeScript, Java, Go, Ruby, and PHP SDKs (beta). The Python SDK also provides MCP conversion helpers (\`anthropic.lib.tools.mcp\`) to convert MCP tools, prompts, and resources for use with the tool runner \u2014 see \`python/claude-api/tool-use.md\` for details.

**Manual Agentic Loop:** Use when you need fine-grained control over the loop (e.g., custom logging, conditional tool execution, human-in-the-loop approval). Loop until \`stop_reason == "end_turn"\`, always append the full \`response.content\` to preserve tool_use blocks, and ensure each \`tool_result\` includes the matching \`tool_use_id\`.

**Stop reasons for server-side tools:** When using server-side tools (code execution, web search, etc.), the API runs a server-side sampling loop. If this loop reaches its default limit of 10 iterations, the response will have \`stop_reason: "pause_turn"\`. To continue, re-send the user message and assistant response and make another API request \u2014 the server will resume where it left off. Do NOT add an extra user message like "Continue." \u2014 the API detects the trailing \`server_tool_use\` block and knows to resume automatically.

\`\`\`python
# Handle pause_turn in your agentic loop
if response.stop_reason == "pause_turn":
    messages = [
        {"role": "user", "content": user_query},
        {"role": "assistant", "content": response.content},
    ]
    # Make another API request \u2014 server resumes automatically
    response = client.messages.create(
        model="{{OPUS_ID}}", messages=messages, tools=tools
    )
\`\`\`

Set a \`max_continuations\` limit (e.g., 5) to prevent infinite loops. For the full guide, see: \`https://platform.claude.com/docs/en/build-with-claude/handling-stop-reasons\`

> **Security:** The tool runner executes your tool functions automatically whenever Claude requests them. For tools with side effects (sending emails, modifying databases, financial transactions), validate inputs within your tool functions and consider requiring confirmation for destructive operations. Use the manual agentic loop if you need human-in-the-loop approval before each tool execution.

---

### Handling Tool Results

When Claude uses a tool, the response contains a \`tool_use\` block. You must:

1. Execute the tool with the provided input
2. Send the result back in a \`tool_result\` message
3. Continue the conversation

**Error handling in tool results:** When a tool execution fails, set \`"is_error": true\` and provide an informative error message. Claude will typically acknowledge the error and either try a different approach or ask for clarification.

**Multiple tool calls:** Claude can request multiple tools in a single response. Handle them all before continuing \u2014 send all results back in a single \`user\` message.

---

## Server-Side Tools: Code Execution

The code execution tool lets Claude run code in a secure, sandboxed container. Unlike user-defined tools, server-side tools run on Anthropic's infrastructure \u2014 you don't execute anything client-side. Just include the tool definition and Claude handles the rest.

### Key Facts

- Runs in an isolated container (1 CPU, 5 GiB RAM, 5 GiB disk)
- No internet access (fully sandboxed)
- Python 3.11 with data science libraries pre-installed
- Containers persist for 30 days and can be reused across requests
- Free when used with web search/web fetch tools; otherwise $0.05/hour after 1,550 free hours/month per organization

### Tool Definition

The tool requires no schema \u2014 just declare it in the \`tools\` array:

\`\`\`json
{
  "type": "code_execution_20260120",
  "name": "code_execution"
}
\`\`\`

Claude automatically gains access to \`bash_code_execution\` (run shell commands) and \`text_editor_code_execution\` (create/view/edit files).

### Pre-installed Python Libraries

- **Data science**: pandas, numpy, scipy, scikit-learn, statsmodels
- **Visualization**: matplotlib, seaborn
- **File processing**: openpyxl, xlsxwriter, pillow, pypdf, pdfplumber, python-docx, python-pptx
- **Math**: sympy, mpmath
- **Utilities**: tqdm, python-dateutil, pytz, sqlite3

Additional packages can be installed at runtime via \`pip install\`.

### Supported File Types for Upload

| Type   | Extensions                         |
| ------ | ---------------------------------- |
| Data   | CSV, Excel (.xlsx/.xls), JSON, XML |
| Images | JPEG, PNG, GIF, WebP               |
| Text   | .txt, .md, .py, .js, etc.          |

### Container Reuse

Reuse containers across requests to maintain state (files, installed packages, variables). Extract the \`container_id\` from the first response and pass it to subsequent requests.

### Response Structure

The response contains interleaved text and tool result blocks:

- \`text\` \u2014 Claude's explanation
- \`server_tool_use\` \u2014 What Claude is doing
- \`bash_code_execution_tool_result\` \u2014 Code execution output (check \`return_code\` for success/failure)
- \`text_editor_code_execution_tool_result\` \u2014 File operation results

> **Security:** Always sanitize filenames with \`os.path.basename()\` / \`path.basename()\` before writing downloaded files to disk to prevent path traversal attacks. Write files to a dedicated output directory.

---

## Server-Side Tools: Web Search and Web Fetch

Web search and web fetch let Claude search the web and retrieve page content. They run server-side \u2014 just include the tool definitions and Claude handles queries, fetching, and result processing automatically.

### Tool Definitions

\`\`\`json
[
  { "type": "web_search_20260209", "name": "web_search" },
  { "type": "web_fetch_20260209", "name": "web_fetch" }
]
\`\`\`

### Dynamic Filtering (Fable 5 / Opus 4.8 / Opus 4.7 / Opus 4.6 / Sonnet 4.6)

The \`web_search_20260209\` and \`web_fetch_20260209\` versions support **dynamic filtering** \u2014 Claude writes and executes code to filter search results before they reach the context window, improving accuracy and token efficiency. Dynamic filtering is built into these tool versions and activates automatically; you do not need to separately declare the \`code_execution\` tool or pass any beta header.

\`\`\`json
{
  "tools": [
    { "type": "web_search_20260209", "name": "web_search" },
    { "type": "web_fetch_20260209", "name": "web_fetch" }
  ]
}
\`\`\`

Without dynamic filtering, the previous \`web_search_20250305\` version is also available.

> **Note:** Only include the standalone \`code_execution\` tool when your application needs code execution for its own purposes (data analysis, file processing, visualization) independent of web search. Including it alongside \`_20260209\` web tools creates a second execution environment that can confuse the model.

---

## Server-Side Tools: Programmatic Tool Calling

With standard tool use, each tool call is a round trip: Claude calls, the result enters Claude's context, Claude reasons, then calls the next tool. Chained calls accumulate latency and tokens \u2014 most of that intermediate data is never needed again.

Programmatic tool calling lets Claude compose those calls into a script. The script runs in the code execution container; when it invokes a tool, the container pauses, the call executes, and the result returns to the running code (not to Claude's context). The script processes it with normal control flow. Only the final output returns to Claude. Use it when chaining many tool calls or when intermediate results are large and should be filtered before reaching the context window.

For full documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/programmatic-tool-calling\`

---

## Server-Side Tools: Tool Search

The tool search tool lets Claude dynamically discover tools from large libraries without loading all definitions into the context window. Use it when you have many tools but only a few are relevant to any given request. Discovered tool schemas are appended to the request, not swapped in \u2014 this preserves the prompt cache (see \`agent-design.md\` \xA7Caching for Agents).

For full documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/tool-search-tool\`

---

## Agent Skills (Messages API)

Agent Skills package task-specific instructions and files that Claude loads when relevant (e.g., the Anthropic pre-built \`pptx\`, \`xlsx\`, \`pdf\`, \`docx\` skills). On the **Messages API**, skills are enabled via the \`container\` parameter alongside the code-execution tool \u2014 this is **not** the Managed Agents surface and does **not** use \`client.beta.agents\` / \`sessions\` / \`environments\`. Availability: see \`shared/platform-availability.md\`.

Required on each request:

1. \`client.beta.messages.create(...)\` with **both** beta flags: \`code-execution-2025-08-25\` **and** \`skills-2025-10-02\`.
2. \`container={"skills": [{"type": "anthropic", "skill_id": "<id>", "version": "latest"}]}\` \u2014 the skills list selects which skills are available inside the execution container.
3. \`tools=[{"type": "code_execution_20260521", "name": "code_execution"}]\` \u2014 skills execute via code execution in the container.

\`\`\`python
response = client.beta.messages.create(
    model="{{OPUS_ID}}", max_tokens=16000,
    betas=["code-execution-2025-08-25", "skills-2025-10-02"],
    container={"skills": [{"type": "anthropic", "skill_id": "pptx", "version": "latest"}]},
    tools=[{"type": "code_execution_20260521", "name": "code_execution"}],
    messages=[{"role": "user", "content": "Create a 3-slide presentation on X"}],
)
\`\`\`

Generated files (\`.pptx\`, \`.xlsx\`, \u2026) are written inside the container; the response carries a file ID for each. Download by passing that ID to the Files API (\`client.beta.files.download(file_id)\` / \`GET /v1/files/{id}/content\` with \`anthropic-beta: files-api-2025-04-14\`).

List available skills via \`GET /v1/skills\` (requires \`anthropic-beta: skills-2025-10-02\`).

---

## MCP Connector (Beta)

The MCP connector lets Claude call tools hosted on a remote MCP server directly from the Messages API \u2014 Anthropic makes the MCP connection server-side. Requires beta flag \`mcp-client-2025-11-20\` on \`client.beta.messages.create(...)\`. Availability: see \`shared/platform-availability.md\`.

**Two parameters are required together:**

- \`mcp_servers\` \u2014 array of server connection definitions: \`[{"type": "url", "url": "<server URL>", "name": "<server-name>", "authorization_token": "<optional>"}]\`
- \`tools\` \u2014 must include an \`mcp_toolset\` entry that references the server by name: \`[{"type": "mcp_toolset", "mcp_server_name": "<server-name>"}]\`

The \`mcp_server_name\` in the toolset must match a \`name\` in \`mcp_servers\`. Omitting the \`mcp_toolset\` entry is rejected as a validation error \u2014 every server in \`mcp_servers\` must be referenced by exactly one toolset.

\`\`\`python
client.beta.messages.create(
    model="{{OPUS_ID}}", max_tokens=1024,
    betas=["mcp-client-2025-11-20"],
    mcp_servers=[{"type": "url", "url": "https://example/sse", "name": "example-mcp"}],
    tools=[{"type": "mcp_toolset", "mcp_server_name": "example-mcp"}],
    messages=[...],
)
\`\`\`

Go uses the typed constant \`anthropic.AnthropicBetaMCPClient2025_11_20\`; the older \`\u20262025_04_04\` constant is deprecated.

Optional toolset fields: \`default_config\` (defaults for all tools, e.g. \`{"enabled": false}\` for allowlist mode) and \`configs\` (per-tool overrides keyed by tool name).

---

## Tool Use Examples

You can provide sample tool calls directly in your tool definitions to demonstrate usage patterns and reduce parameter errors. This helps Claude understand how to correctly format tool inputs, especially for tools with complex schemas.

For full documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/implement-tool-use\`

---

## Client-Side Tools: Computer Use

Computer use lets Claude interact with a desktop environment (screenshots, mouse, keyboard). It is a client-side tool \u2014 your application provides the environment and executes the actions Claude requests; Anthropic processes the screenshots and action requests in real time but does not host the environment or retain the data.

For full documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/agents-and-tools/computer-use/overview\`

---

## Context Editing

Context editing clears stale tool results and thinking blocks from the transcript as a long-running agent accumulates turns. Unlike compaction (which summarizes), context editing prunes \u2014 the cleared content is removed, not replaced. Use it when old tool outputs are no longer relevant and you want to keep the transcript lean without losing the conversation structure.

**Beta.** Use \`client.beta.messages.*\` with beta \`context-management-2025-06-27\`. Configure via \`context_management.edits\` with a strategy type of \`clear_tool_uses_20250919\` (clear old tool results; optional \`clear_tool_inputs: true\` also clears the tool_use params) or \`clear_thinking_20251015\` (clear thinking blocks). These are **not** the compaction types \u2014 \`compact_20260112\` with beta \`compact-2026-01-12\` is the separate compaction feature.

For full documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/build-with-claude/context-editing\`

---

## Server-Side Tools: Advisor (Beta)

The advisor tool pairs a faster, lower-cost **executor** model (the top-level \`model\` on the request) with a higher-intelligence **advisor** model (the \`model\` field inside the tool definition) that provides strategic guidance mid-generation. The executor does most of the token generation; the advisor is consulted for planning. Availability: see \`shared/platform-availability.md\`.

### Tool Definition

\`\`\`json
{
  "type": "advisor_20260301",
  "name": "advisor",
  "model": "claude-opus-4-8"
}
\`\`\`

**The advisor model must be at least as capable as the executor.** An invalid pairing returns \`400 invalid_request_error\`. Valid pairs:

| Executor (request \`model\`) | Valid advisor (tool \`model\`) |
|---|---|
| \`claude-haiku-4-5\` / \`claude-sonnet-4-6\` / \`claude-sonnet-5\` / \`claude-opus-4-6\` / \`claude-opus-4-7\` | \`claude-opus-4-8\` or \`claude-opus-4-7\` |
| \`claude-opus-4-8\` | \`claude-opus-4-8\` only |

Call via \`client.beta.messages.create(...)\` with \`betas=["advisor-tool-2026-03-01"]\` (or the \`anthropic-beta: advisor-tool-2026-03-01\` header). In multi-turn conversations, append the full \`response.content\` \u2014 including any \`advisor_tool_result\` blocks \u2014 back to \`messages\` on the next turn. If you remove the advisor tool from \`tools\` on a later turn while the history still contains \`advisor_tool_result\` blocks, the API returns a 400.

---

## Client-Side Tools: Memory

The memory tool enables Claude to store and retrieve information across conversations through a memory file directory. Claude can create, read, update, and delete files that persist between sessions.

### Key Facts

- Client-side tool \u2014 you control storage via your implementation
- Supports commands: \`view\`, \`create\`, \`str_replace\`, \`insert\`, \`delete\`, \`rename\`
- Operates on files in a \`/memories\` directory
- The Python, TypeScript, and Java SDKs provide helper classes/functions for implementing the memory backend

> **Security:** Never store API keys, passwords, tokens, or other secrets in memory files. Be cautious with personally identifiable information (PII) \u2014 check data privacy regulations (GDPR, CCPA) before persisting user data. The reference implementations have no built-in access control; in multi-user systems, implement per-user memory directories and authentication in your tool handlers.

For full implementation examples, use WebFetch:

- Docs: \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/memory-tool.md\`

---

## Client-Side Tools: Bash and Text Editor

The bash and text editor tools are **Anthropic-defined, schema-less** tools. Declare them by \`type\` and \`name\` only \u2014 the input schema is built into the model and cannot be modified. **Do not pass an \`input_schema\`**, and do not define a custom tool that happens to be named \`"bash"\` \u2014 that creates a user-defined tool without the built-in behavior.

Both are **client-executed**: Claude returns a \`tool_use\` block, your code performs the action locally, and you send back a \`tool_result\`. The API is stateless; your application maintains the shell session or filesystem between turns.

### Bash tool declaration

\`\`\`json
{"type": "bash_20250124", "name": "bash"}
\`\`\`

| Language | Declaration |
|---|---|
| Python / TypeScript / Ruby / cURL | plain object \`{"type": "bash_20250124", "name": "bash"}\` |
| Go | \`anthropic.ToolUnionParam{OfBashTool20250124: &anthropic.ToolBash20250124Param{}}\` |
| Java | \`.addTool(ToolBash20250124.builder().build())\` from \`com.anthropic.models.messages\` |
| C# | \`Tools = [new ToolBash20250124()]\` from \`Anthropic.Models.Messages\` |
| PHP | \`tools: [new \\Anthropic\\Messages\\ToolBash20250124()]\` |

Claude's \`tool_use.input\` contains either \`{"command": "<string>"}\` or \`{"restart": true}\`. Check for \`restart\` first (reset the session, return a confirmation string); otherwise run \`command\` and return combined stdout + stderr.

> **Security \u2014 commands are untrusted model output.** Run in an isolated environment (container, VM, or restricted user); apply an **allowlist** of permitted executables and reject shell operators (\`&&\`, \`|\`, \`;\`, \`\` \` \`\`, \`$()\`); set timeouts and resource limits; log every command. A blocklist is not sufficient.

### Text editor tool declaration

\`\`\`json
{"type": "text_editor_20250728", "name": "str_replace_based_edit_tool"}
\`\`\`

Optional field: \`max_characters\` to cap \`view\` output. Java exposes a typed \`ToolTextEditor20250728\` builder (\`com.anthropic.models.messages\`); other statically-typed SDKs follow the same naming pattern \u2014 see the Anthropic-Defined Tools section in \`{lang}/claude-api/tool-use.md\` for the exact class.

> **Security \u2014 \`path\` is untrusted model output. Confine every file operation to a fixed project root.** Before executing any command, resolve the model-supplied \`path\` to its canonical form and verify it remains within your project root; reject the request if it escapes (\`..\`, symlinks, absolute paths outside the root, URL-encoded traversal like \`%2e%2e%2f\`). Use your language's built-in path utilities (e.g., Python \`pathlib.Path.resolve()\` then check \`.is_relative_to(root)\`). Never call \`open()\` / \`writeFile\` / \`unlink\` directly on the raw \`path\` value.

\`tool_use.input.command\` is one of:

| \`command\` | Other inputs | Action |
|---|---|---|
| \`view\` | \`path\`, optional \`view_range\` | Return file contents or directory listing |
| \`create\` | \`path\`, \`file_text\` | Create/overwrite file with \`file_text\`. Create a backup if the file already exists. |
| \`str_replace\` | \`path\`, \`old_str\`, \`new_str\` | Replace exactly one occurrence; error if 0 or >1 matches |
| \`insert\` | \`path\`, \`insert_line\`, \`insert_text\` | Insert \`insert_text\` after line \`insert_line\` (0 = beginning of file) |

For both tools, on error return \`{"type": "tool_result", "tool_use_id": "\u2026", "content": "<error text>", "is_error": true}\` so Claude can recover.

---

## Structured Outputs

Structured outputs constrain Claude's responses to follow a specific JSON schema, guaranteeing valid, parseable output. This is not a separate tool \u2014 it enhances the Messages API response format and/or tool parameter validation.

Two features are available:

- **JSON outputs** (\`output_config.format\`): Control Claude's response format
- **Strict tool use** (\`strict: true\`): Guarantee valid tool parameter schemas

**Supported models:** {{FABLE_NAME}}, {{OPUS_NAME}}, {{SONNET_NAME}}, and {{HAIKU_NAME}}. Legacy models (Claude Opus 4.5, Claude Opus 4.1) also support structured outputs.

> **Recommended:** Use \`client.messages.parse()\` which automatically validates responses against your schema. When using \`messages.create()\` directly, use \`output_config: {format: {...}}\`. The \`output_format\` convenience parameter is also accepted by some SDK methods (e.g., \`.parse()\`), but \`output_config.format\` is the canonical API-level parameter.

### JSON Schema Limitations

**Supported:**

- Basic types: object, array, string, integer, number, boolean, null
- \`enum\`, \`const\`, \`anyOf\`, \`allOf\`, \`$ref\`/\`$def\`
- String formats: \`date-time\`, \`time\`, \`date\`, \`duration\`, \`email\`, \`hostname\`, \`uri\`, \`ipv4\`, \`ipv6\`, \`uuid\`
- \`additionalProperties: false\` (required for all objects)

**Not supported:**

- Recursive schemas
- Numerical constraints (\`minimum\`, \`maximum\`, \`multipleOf\`)
- String constraints (\`minLength\`, \`maxLength\`)
- Complex array constraints
- \`additionalProperties\` set to anything other than \`false\`

The Python and TypeScript SDKs automatically handle unsupported constraints by removing them from the schema sent to the API and validating them client-side.

### Important Notes

- **First request latency**: New schemas incur a one-time compilation cost. Subsequent requests with the same schema use a 24-hour cache.
- **Refusals**: If Claude refuses for safety reasons (\`stop_reason: "refusal"\`), the output may not match your schema.
- **Token limits**: If \`stop_reason: "max_tokens"\`, output may be incomplete. Increase \`max_tokens\`.
- **Incompatible with**: Citations (returns 400 error), message prefilling.
- **Works with**: Batches API, streaming, token counting, extended thinking.

---

## Tips for Effective Tool Use

1. **Provide detailed descriptions**: Claude relies heavily on descriptions to understand when and how to use tools
2. **Use specific tool names**: \`get_current_weather\` is better than \`weather\`
3. **Validate inputs**: Always validate tool inputs before execution
4. **Handle errors gracefully**: Return informative error messages so Claude can adapt
5. **Limit tool count**: Too many tools can confuse the model \u2014 keep the set focused
6. **Test tool interactions**: Verify Claude uses tools correctly in various scenarios

For detailed tool use documentation, use WebFetch:

- URL: \`https://platform.claude.com/docs/en/agents-and-tools/tool-use/overview\`
`;
  var eFc = () => {};
  var rFc = `# Message Batches API \u2014 TypeScript

The Batches API (\`POST /v1/messages/batches\`) processes Messages API requests asynchronously at 50% of standard prices.

## Key Facts

- Up to 100,000 requests or 256 MB per batch
- Most batches complete within 1 hour; maximum 24 hours
- Results available for 29 days after creation
- 50% cost reduction on all token usage
- All Messages API features supported (vision, tools, caching, etc.)

---

## Create a Batch

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";

const client = new Anthropic();

const messageBatch = await client.messages.batches.create({
  requests: [
    {
      custom_id: "request-1",
      params: {
        model: "{{OPUS_ID}}",
        max_tokens: 16000,
        messages: [
          { role: "user", content: "Summarize climate change impacts" },
        ],
      },
    },
    {
      custom_id: "request-2",
      params: {
        model: "{{OPUS_ID}}",
        max_tokens: 16000,
        messages: [
          { role: "user", content: "Explain quantum computing basics" },
        ],
      },
    },
  ],
});

console.log(\`Batch ID: \${messageBatch.id}\`);
console.log(\`Status: \${messageBatch.processing_status}\`);
\`\`\`

---

## Poll for Completion

\`\`\`typescript
let batch;
while (true) {
  batch = await client.messages.batches.retrieve(messageBatch.id);
  if (batch.processing_status === "ended") break;
  console.log(
    \`Status: \${batch.processing_status}, processing: \${batch.request_counts.processing}\`,
  );
  await new Promise((resolve) => setTimeout(resolve, 60_000));
}

console.log("Batch complete!");
console.log(\`Succeeded: \${batch.request_counts.succeeded}\`);
console.log(\`Errored: \${batch.request_counts.errored}\`);
\`\`\`

---

## Retrieve Results

\`\`\`typescript
for await (const result of await client.messages.batches.results(
  messageBatch.id,
)) {
  switch (result.result.type) {
    case "succeeded":
      console.log(
        \`[\${result.custom_id}] \${result.result.message.content[0].text.slice(0, 100)}\`,
      );
      break;
    case "errored":
      if (result.result.error.type === "invalid_request") {
        console.log(\`[\${result.custom_id}] Validation error - fix and retry\`);
      } else {
        console.log(\`[\${result.custom_id}] Server error - safe to retry\`);
      }
      break;
    case "expired":
      console.log(\`[\${result.custom_id}] Expired - resubmit\`);
      break;
  }
}
\`\`\`

---

## Cancel a Batch

\`\`\`typescript
const cancelled = await client.messages.batches.cancel(messageBatch.id);
console.log(\`Status: \${cancelled.processing_status}\`); // "canceling"
\`\`\`
`;
  var nFc = () => {};
  var sFc = `# Files API \u2014 TypeScript

The Files API uploads files for use in Messages API requests. Reference files via \`file_id\` in content blocks, avoiding re-uploads across multiple API calls.

**Beta:** Pass \`betas: ["files-api-2025-04-14"]\` in your API calls (the SDK sets the required header automatically).

## Key Facts

- Maximum file size: 500 MB
- Total storage: 100 GB per organization
- Files persist until deleted
- File operations (upload, list, delete) are free; content used in messages is billed as input tokens
- Not available on Amazon Bedrock or Google Vertex AI

---

## Upload a File

\`\`\`typescript
import Anthropic, { toFile } from "@anthropic-ai/sdk";
import fs from "fs";

const client = new Anthropic();

const uploaded = await client.beta.files.upload({
  file: await toFile(fs.createReadStream("report.pdf"), undefined, {
    type: "application/pdf",
  }),
  betas: ["files-api-2025-04-14"],
});

console.log(\`File ID: \${uploaded.id}\`);
console.log(\`Size: \${uploaded.size_bytes} bytes\`);
\`\`\`

---

## Use a File in Messages

### PDF / Text Document

\`\`\`typescript
const response = await client.beta.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content: [
        { type: "text", text: "Summarize the key findings in this report." },
        {
          type: "document",
          source: { type: "file", file_id: uploaded.id },
          title: "Q4 Report",
          citations: { enabled: true },
        },
      ],
    },
  ],
  betas: ["files-api-2025-04-14"],
});

console.log(response.content[0].text);
\`\`\`

---

## Manage Files

### List Files

\`\`\`typescript
const files = await client.beta.files.list({
  betas: ["files-api-2025-04-14"],
});
for (const f of files.data) {
  console.log(\`\${f.id}: \${f.filename} (\${f.size_bytes} bytes)\`);
}
\`\`\`

### Delete a File

\`\`\`typescript
await client.beta.files.delete("file_011CNha8iCJcU1wXNR6q4V8w", {
  betas: ["files-api-2025-04-14"],
});
\`\`\`

### Download a File

\`\`\`typescript
const response = await client.beta.files.download(
  "file_011CNha8iCJcU1wXNR6q4V8w",
  { betas: ["files-api-2025-04-14"] },
);
const content = Buffer.from(await response.arrayBuffer());
await fs.promises.writeFile("output.txt", content);
\`\`\`
`;
  var oFc = () => {};
  var iFc = () => {};
  var cFc = `# Streaming \u2014 TypeScript

## Quick Start

\`\`\`typescript
const stream = client.messages.stream({
  model: "{{OPUS_ID}}",
  max_tokens: 64000,
  messages: [{ role: "user", content: "Write a story" }],
});

for await (const event of stream) {
  if (
    event.type === "content_block_delta" &&
    event.delta.type === "text_delta"
  ) {
    process.stdout.write(event.delta.text);
  }
}
\`\`\`

---

## Handling Different Content Types

> **Fable 5 / Opus 4.8 / Opus 4.7 / Opus 4.6:** Use \`thinking: {type: "adaptive"}\`. On older models, use \`thinking: {type: "enabled", budget_tokens: N}\` instead.

\`\`\`typescript
const stream = client.messages.stream({
  model: "{{OPUS_ID}}",
  max_tokens: 64000,
  thinking: { type: "adaptive", display: "summarized" }, // display opt-in: default is omitted (empty thinking text) on Fable 5 / Mythos 5 / Opus 4.8 / 4.7
  messages: [{ role: "user", content: "Analyze this problem" }],
});

for await (const event of stream) {
  switch (event.type) {
    case "content_block_start":
      switch (event.content_block.type) {
        case "thinking":
          console.log("\\n[Thinking...]");
          break;
        case "text":
          console.log("\\n[Response:]");
          break;
      }
      break;
    case "content_block_delta":
      switch (event.delta.type) {
        case "thinking_delta":
          process.stdout.write(event.delta.thinking);
          break;
        case "text_delta":
          process.stdout.write(event.delta.text);
          break;
      }
      break;
  }
}
\`\`\`

---

## Streaming with Tool Use (Tool Runner)

Use the tool runner with \`stream: true\`. The outer loop iterates over tool runner iterations (messages), the inner loop processes stream events:

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";
import { betaZodTool } from "@anthropic-ai/sdk/helpers/beta/zod";
import { z } from "zod";

const client = new Anthropic();

const getWeather = betaZodTool({
  name: "get_weather",
  description: "Get current weather for a location",
  inputSchema: z.object({
    location: z.string().describe("City and state, e.g., San Francisco, CA"),
  }),
  run: async ({ location }) => \`72\xB0F and sunny in \${location}\`,
});

const runner = client.beta.messages.toolRunner({
  model: "{{OPUS_ID}}",
  max_tokens: 64000,
  tools: [getWeather],
  messages: [
    { role: "user", content: "What's the weather in Paris and London?" },
  ],
  stream: true,
});

// Outer loop: each tool runner iteration
for await (const messageStream of runner) {
  // Inner loop: stream events for this iteration
  for await (const event of messageStream) {
    switch (event.type) {
      case "content_block_delta":
        switch (event.delta.type) {
          case "text_delta":
            process.stdout.write(event.delta.text);
            break;
          case "input_json_delta":
            // Tool input being streamed
            break;
        }
        break;
    }
  }
}
\`\`\`

---

## Getting the Final Message

\`\`\`typescript
const stream = client.messages.stream({
  model: "{{OPUS_ID}}",
  max_tokens: 64000,
  messages: [{ role: "user", content: "Hello" }],
});

for await (const event of stream) {
  // Process events...
}

const finalMessage = await stream.finalMessage();
console.log(\`Tokens used: \${finalMessage.usage.output_tokens}\`);
\`\`\`

---

## Stream Event Types

| Event Type            | Description                 | When it fires                     |
| --------------------- | --------------------------- | --------------------------------- |
| \`message_start\`       | Contains message metadata   | Once at the beginning             |
| \`content_block_start\` | New content block beginning | When a text/tool_use block starts |
| \`content_block_delta\` | Incremental content update  | For each token/chunk              |
| \`content_block_stop\`  | Content block complete      | When a block finishes             |
| \`message_delta\`       | Message-level updates       | Contains \`stop_reason\`, usage     |
| \`message_stop\`        | Message complete            | Once at the end                   |

## Best Practices

1. **Always flush output** \u2014 Use \`process.stdout.write()\` for immediate display
2. **Handle partial responses** \u2014 If the stream is interrupted, you may have incomplete content
3. **Track token usage** \u2014 The \`message_delta\` event contains usage information
4. **Use \`finalMessage()\`** \u2014 Get the complete \`Anthropic.Message\` object even when streaming. Don't wrap \`.on()\` events in \`new Promise()\` \u2014 \`finalMessage()\` handles all completion/error/abort states internally
5. **Buffer for web UIs** \u2014 Consider buffering a few tokens before rendering to avoid excessive DOM updates
6. **Use \`stream.on("text", ...)\` for deltas** \u2014 The \`text\` event provides just the delta string, simpler than manually filtering \`content_block_delta\` events
7. **For agentic loops with streaming** \u2014 See the [Streaming Manual Loop](./tool-use.md#streaming-manual-loop) section in tool-use.md for combining \`stream()\` + \`finalMessage()\` with a tool-use loop

## Raw SSE Format

If using raw HTTP (not SDKs), the stream returns Server-Sent Events:

\`\`\`
event: message_start
data: {"type":"message_start","message":{"id":"msg_...","type":"message",...}}

event: content_block_start
data: {"type":"content_block_start","index":0,"content_block":{"type":"text","text":""}}

event: content_block_delta
data: {"type":"content_block_delta","index":0,"delta":{"type":"text_delta","text":"Hello"}}

event: content_block_stop
data: {"type":"content_block_stop","index":0}

event: message_delta
data: {"type":"message_delta","delta":{"stop_reason":"end_turn"},"usage":{"output_tokens":12}}

event: message_stop
data: {"type":"message_stop"}
\`\`\`
`;
  var lFc = () => {};
  var dFc = `# Tool Use \u2014 TypeScript

For conceptual overview (tool definitions, tool choice, tips), see [shared/tool-use-concepts.md](../../shared/tool-use-concepts.md).

## Tool Runner (Recommended)

**Beta:** The tool runner is in beta in the TypeScript SDK.

Use \`betaZodTool\` with Zod schemas to define tools with a \`run\` function, then pass them to \`client.beta.messages.toolRunner()\`:

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";
import { betaZodTool } from "@anthropic-ai/sdk/helpers/beta/zod";
import { z } from "zod";

const client = new Anthropic();

const getWeather = betaZodTool({
  name: "get_weather",
  description: "Get current weather for a location",
  inputSchema: z.object({
    location: z.string().describe("City and state, e.g., San Francisco, CA"),
    unit: z.enum(["celsius", "fahrenheit"]).optional(),
  }),
  run: async (input) => {
    // Your implementation here
    return \`72\xB0F and sunny in \${input.location}\`;
  },
});

// The tool runner handles the agentic loop and returns the final message
const finalMessage = await client.beta.messages.toolRunner({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  tools: [getWeather],
  messages: [{ role: "user", content: "What's the weather in Paris?" }],
});

console.log(finalMessage.content);
\`\`\`

**Key benefits of the tool runner:**

- No manual loop \u2014 the SDK handles calling tools and feeding results back
- Type-safe tool inputs via Zod schemas
- Tool schemas are generated automatically from Zod definitions
- Iteration stops automatically when Claude has no more tool calls

---

## Manual Agentic Loop

Use this when you need fine-grained control (custom logging, conditional tool execution, streaming individual iterations, human-in-the-loop approval):

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";

const client = new Anthropic();
const tools: Anthropic.Tool[] = [...]; // Your tool definitions
let messages: Anthropic.MessageParam[] = [{ role: "user", content: userInput }];

while (true) {
  const response = await client.messages.create({
    model: "{{OPUS_ID}}",
    max_tokens: 16000,
    tools: tools,
    messages: messages,
  });

  if (response.stop_reason === "end_turn") break;

  // Server-side tool hit iteration limit; append assistant turn and re-send to continue
  if (response.stop_reason === "pause_turn") {
    messages.push({ role: "assistant", content: response.content });
    continue;
  }

  const toolUseBlocks = response.content.filter(
    (b): b is Anthropic.ToolUseBlock => b.type === "tool_use",
  );

  messages.push({ role: "assistant", content: response.content });

  const toolResults: Anthropic.ToolResultBlockParam[] = [];
  for (const tool of toolUseBlocks) {
    const result = await executeTool(tool.name, tool.input);
    toolResults.push({
      type: "tool_result",
      tool_use_id: tool.id,
      content: result,
    });
  }

  messages.push({ role: "user", content: toolResults });
}
\`\`\`

### Streaming Manual Loop

Use \`client.messages.stream()\` + \`finalMessage()\` instead of \`.create()\` when you need streaming within a manual loop. Text deltas are streamed on each iteration; \`finalMessage()\` collects the complete \`Message\` so you can inspect \`stop_reason\` and extract tool-use blocks:

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";

const client = new Anthropic();
const tools: Anthropic.Tool[] = [...];
let messages: Anthropic.MessageParam[] = [{ role: "user", content: userInput }];

while (true) {
  const stream = client.messages.stream({
    model: "{{OPUS_ID}}",
    max_tokens: 64000,
    tools,
    messages,
  });

  // Stream text deltas on each iteration
  stream.on("text", (delta) => {
    process.stdout.write(delta);
  });

  // finalMessage() resolves with the complete Message \u2014 no need to
  // manually wire up .on("message") / .on("error") / .on("abort")
  const message = await stream.finalMessage();

  if (message.stop_reason === "end_turn") break;

  // Server-side tool hit iteration limit; append assistant turn and re-send to continue
  if (message.stop_reason === "pause_turn") {
    messages.push({ role: "assistant", content: message.content });
    continue;
  }

  const toolUseBlocks = message.content.filter(
    (b): b is Anthropic.ToolUseBlock => b.type === "tool_use",
  );

  messages.push({ role: "assistant", content: message.content });

  const toolResults: Anthropic.ToolResultBlockParam[] = [];
  for (const tool of toolUseBlocks) {
    const result = await executeTool(tool.name, tool.input);
    toolResults.push({
      type: "tool_result",
      tool_use_id: tool.id,
      content: result,
    });
  }

  messages.push({ role: "user", content: toolResults });
}
\`\`\`

> **Important:** Don't wrap \`.on()\` events in \`new Promise()\` to collect the final message \u2014 use \`stream.finalMessage()\` instead. The SDK handles all error/abort/completion states internally.

> **Error handling in the loop:** Use the SDK's typed exceptions (e.g., \`Anthropic.RateLimitError\`, \`Anthropic.APIError\`) \u2014 see [Error Handling](./README.md#error-handling) for examples. Don't check error messages with string matching.

> **SDK types:** Use \`Anthropic.MessageParam\`, \`Anthropic.Tool\`, \`Anthropic.ToolUseBlock\`, \`Anthropic.ToolResultBlockParam\`, \`Anthropic.Message\`, etc. for all API-related data structures. Don't redefine equivalent interfaces.

---

## Handling Tool Results

\`\`\`typescript
const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  tools: tools,
  messages: [{ role: "user", content: "What's the weather in Paris?" }],
});

for (const block of response.content) {
  if (block.type === "tool_use") {
    const result = await executeTool(block.name, block.input);

    const followup = await client.messages.create({
      model: "{{OPUS_ID}}",
      max_tokens: 16000,
      tools: tools,
      messages: [
        { role: "user", content: "What's the weather in Paris?" },
        { role: "assistant", content: response.content },
        {
          role: "user",
          content: [
            { type: "tool_result", tool_use_id: block.id, content: result },
          ],
        },
      ],
    });
  }
}
\`\`\`

---

## Tool Choice

\`\`\`typescript
const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  tools: tools,
  tool_choice: { type: "tool", name: "get_weather" },
  messages: [{ role: "user", content: "What's the weather in Paris?" }],
});
\`\`\`

---

## Anthropic-Defined Tools

Version-suffixed \`type\` literals; \`name\` is fixed per interface. Web search and code execution are server-executed; bash and text editor are client-executed (you handle the \`tool_use\` locally \u2014 see \`shared/tool-use-concepts.md\`). Pass plain object literals \u2014 the \`ToolUnion\` type is satisfied structurally. **The \`name\`/\`type\` pair must match the interface**: mixing \`str_replace_based_edit_tool\` (20250728 name) with \`text_editor_20250124\` (which expects \`str_replace_editor\`) is a TS2322.

**Don't type-annotate as \`Tool[]\`** \u2014 \`Tool\` is just the custom-tool variant. Let structural typing infer from the \`tools\` param, or annotate as \`Anthropic.Messages.ToolUnion[]\` if you must:

\`\`\`typescript
// \u2713 let inference work \u2014 no annotation
const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  tools: [
    { type: "text_editor_20250728", name: "str_replace_based_edit_tool" },
    { type: "bash_20250124", name: "bash" },
    { type: "web_search_20260209", name: "web_search" },
    { type: "code_execution_20260120", name: "code_execution" },
  ],
  messages: [{ role: "user", content: "..." }],
});

// \u2717 this is a TS2352 \u2014 Tool is the CUSTOM tool variant only
// const tools: Anthropic.Tool[] = [{ type: "text_editor_20250728", ... }]
\`\`\`

| Interface | \`name\` | \`type\` |
|---|---|---|
| \`ToolTextEditor20250124\` | \`str_replace_editor\` | \`text_editor_20250124\` |
| \`ToolTextEditor20250429\` | \`str_replace_based_edit_tool\` | \`text_editor_20250429\` |
| \`ToolTextEditor20250728\` | \`str_replace_based_edit_tool\` | \`text_editor_20250728\` |
| \`ToolBash20250124\` | \`bash\` | \`bash_20250124\` |
| \`WebSearchTool20260209\` | \`web_search\` | \`web_search_20260209\` |
| \`WebFetchTool20260209\` | \`web_fetch\` | \`web_fetch_20260209\` |
| \`CodeExecutionTool20260120\` | \`code_execution\` | \`code_execution_20260120\` |

**Don't mix beta and non-beta types**: if you call \`client.beta.messages.create()\`, the response \`content\` is \`BetaContentBlock[]\` \u2014 you cannot pass that to a non-beta \`ContentBlockParam[]\` without narrowing each element.

---

## Code Execution

### Basic Usage

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";

const client = new Anthropic();

const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content:
        "Calculate the mean and standard deviation of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]",
    },
  ],
  tools: [{ type: "code_execution_20260120", name: "code_execution" }],
});
\`\`\`

### Reading Local Files (ESM note)

\`__dirname\` doesn't exist in ES modules. For script-relative paths use \`import.meta.url\`:

\`\`\`typescript
import { readFileSync } from "fs";
import { fileURLToPath } from "url";
import { dirname, join } from "path";

const __dirname = dirname(fileURLToPath(import.meta.url));
const pdfBytes = readFileSync(join(__dirname, "sample.pdf"));
\`\`\`

Or use a CWD-relative path if the script runs from a known directory: \`readFileSync("./sample.pdf")\`.

### Upload Files for Analysis

\`\`\`typescript
import Anthropic, { toFile } from "@anthropic-ai/sdk";
import { createReadStream } from "fs";

const client = new Anthropic();

// 1. Upload a file
const uploaded = await client.beta.files.upload({
  file: await toFile(createReadStream("sales_data.csv"), undefined, {
    type: "text/csv",
  }),
  betas: ["files-api-2025-04-14"],
});

// 2. Pass to code execution
// Code execution is GA; Files API is still beta (pass via RequestOptions)
const response = await client.messages.create(
  {
    model: "{{OPUS_ID}}",
    max_tokens: 16000,
    messages: [
      {
        role: "user",
        content: [
          {
            type: "text",
            text: "Analyze this sales data. Show trends and create a visualization.",
          },
          { type: "container_upload", file_id: uploaded.id },
        ],
      },
    ],
    tools: [{ type: "code_execution_20260120", name: "code_execution" }],
  },
  { headers: { "anthropic-beta": "files-api-2025-04-14" } },
);
\`\`\`

### Retrieve Generated Files

\`\`\`typescript
import path from "path";
import fs from "fs";

const OUTPUT_DIR = "./claude_outputs";
await fs.promises.mkdir(OUTPUT_DIR, { recursive: true });

for (const block of response.content) {
  if (block.type === "bash_code_execution_tool_result") {
    const result = block.content;
    if (result.type === "bash_code_execution_result" && result.content) {
      for (const fileRef of result.content) {
        if (fileRef.type === "bash_code_execution_output") {
          const metadata = await client.beta.files.retrieveMetadata(
            fileRef.file_id,
          );
          const downloadResponse = await client.beta.files.download(fileRef.file_id);
          const fileBytes = Buffer.from(await downloadResponse.arrayBuffer());
          const safeName = path.basename(metadata.filename);
          if (!safeName || safeName === "." || safeName === "..") {
            console.warn(\`Skipping invalid filename: \${metadata.filename}\`);
            continue;
          }
          const outputPath = path.join(OUTPUT_DIR, safeName);
          await fs.promises.writeFile(outputPath, fileBytes);
          console.log(\`Saved: \${outputPath}\`);
        }
      }
    }
  }
}
\`\`\`

### Container Reuse

\`\`\`typescript
// First request: set up environment
const response1 = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content: "Install tabulate and create data.json with sample user data",
    },
  ],
  tools: [{ type: "code_execution_20260120", name: "code_execution" }],
});

// Reuse container
// container is nullable \u2014 set only when using server-side code execution
const containerId = response1.container!.id;

const response2 = await client.messages.create({
  container: containerId,
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content: "Read data.json and display as a formatted table",
    },
  ],
  tools: [{ type: "code_execution_20260120", name: "code_execution" }],
});
\`\`\`

---

## Memory Tool

### Basic Usage

\`\`\`typescript
const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content: "Remember that my preferred language is TypeScript.",
    },
  ],
  tools: [{ type: "memory_20250818", name: "memory" }],
});
\`\`\`

### SDK Memory Helper

Use \`betaMemoryTool\` with a \`MemoryToolHandlers\` implementation:

\`\`\`typescript
import {
  betaMemoryTool,
  type MemoryToolHandlers,
} from "@anthropic-ai/sdk/helpers/beta/memory";

const handlers: MemoryToolHandlers = {
  async view(command) { ... },
  async create(command) { ... },
  async str_replace(command) { ... },
  async insert(command) { ... },
  async delete(command) { ... },
  async rename(command) { ... },
};

const memory = betaMemoryTool(handlers);

const runner = client.beta.messages.toolRunner({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  tools: [memory],
  messages: [{ role: "user", content: "Remember my preferences" }],
});

for await (const message of runner) {
  console.log(message);
}
\`\`\`

For full implementation examples, use WebFetch:

- \`https://github.com/anthropics/anthropic-sdk-typescript/blob/main/examples/tools-helpers-memory.ts\`

---

## Structured Outputs

### JSON Outputs (Zod \u2014 Recommended)

\`\`\`typescript
import Anthropic from "@anthropic-ai/sdk";
import { z } from "zod";
import { zodOutputFormat } from "@anthropic-ai/sdk/helpers/zod";

const ContactInfoSchema = z.object({
  name: z.string(),
  email: z.string(),
  plan: z.string(),
  interests: z.array(z.string()),
  demo_requested: z.boolean(),
});

const client = new Anthropic();

const response = await client.messages.parse({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content:
        "Extract: Jane Doe (jane@co.com) wants Enterprise, interested in API and SDKs, wants a demo.",
    },
  ],
  output_config: {
    format: zodOutputFormat(ContactInfoSchema),
  },
});

// parsed_output is null if parsing failed \u2014 assert or guard
console.log(response.parsed_output!.name); // "Jane Doe"
\`\`\`

### Strict Tool Use

\`\`\`typescript
const response = await client.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  messages: [
    {
      role: "user",
      content: "Book a flight to Tokyo for 2 passengers on March 15",
    },
  ],
  tools: [
    {
      name: "book_flight",
      description: "Book a flight to a destination",
      strict: true,
      input_schema: {
        type: "object",
        properties: {
          destination: { type: "string" },
          date: { type: "string", format: "date" },
          passengers: {
            type: "integer",
            enum: [1, 2, 3, 4, 5, 6, 7, 8],
          },
        },
        required: ["destination", "date", "passengers"],
        additionalProperties: false,
      },
    },
  ],
});
\`\`\`

---

## Agent Skills

Enable an Anthropic-managed skill (e.g., \`pptx\`) via \`container.skills\` + the \`code_execution\` tool on the beta path. Both beta headers are required. Outputs land as files in the response content \u2014 download by file ID via the Files API.

\`\`\`typescript
const response = await client.beta.messages.create({
  model: "{{OPUS_ID}}",
  max_tokens: 16000,
  container: {
    skills: [{ type: "anthropic", skill_id: "pptx", version: "latest" }],
  },
  tools: [{ type: "code_execution_20260521", name: "code_execution" }],
  betas: ["code-execution-2025-08-25", "skills-2025-10-02"],
  messages: [{ role: "user", content: "Create a 3-slide deck about X." }],
});
// Find the file_id in response.content, then:
// await client.beta.files.download(fileId)
\`\`\`
`;
  var uFc = () => {};
  var pFc = () => {};
  var fFc = {};
  __export(fFc, {
    sLc: () => "# Building LLM-Powered Applications with Claude\n\nThis skill helps you build LLM-powered applications with Claude. Choose the right surface based on your needs, detect the project language, then read the relevant language-specific documentation.\n\n## Before You Start\n\nScan the target file (or, if no target file, the prompt and project) for non-Anthropic provider markers \u2014 `import openai`, `from openai`, `langchain_openai`, `OpenAI(`, `gpt-4`, `gpt-5`, file names like `agent-openai.py` or `*-generic.py`, or any explicit instruction to keep the code provider-neutral. If you find any, stop and tell the user that this skill produces Claude/Anthropic SDK code; ask whether they want to switch the file to Claude or want a non-Claude implementation. Do not edit a non-Anthropic file with Anthropic SDK calls.\n\n## Output Requirement\n\nWhen the user asks you to add, modify, or implement a Claude feature, your code must call Claude through one of:\n\n1. **The official Anthropic SDK** for the project's language (`anthropic`, `@anthropic-ai/sdk`, `com.anthropic.*`, etc.). This is the default whenever a supported SDK exists for the project.\n2. **Raw HTTP** (`curl`, `requests`, `fetch`, `httpx`, etc.) \u2014 only when the user explicitly asks for cURL/REST/raw HTTP, the project is a shell/cURL project, or the language has no official SDK.\n\nNever mix the two \u2014 don't reach for `requests`/`fetch` in a Python or TypeScript project just because it feels lighter. Never fall back to OpenAI-compatible shims.\n\n**Never guess SDK usage.** Function names, class names, namespaces, method signatures, and import paths must come from explicit documentation \u2014 either the `{lang}/` files in this skill or the official SDK repositories or documentation links listed in `shared/live-sources.md`. If the binding you need is not explicitly documented in the skill files, WebFetch the relevant SDK repo from `shared/live-sources.md` before writing code. Do not infer Ruby/Java/Go/PHP/C# APIs from cURL shapes or from another language's SDK.\n\n**If WebFetch or repository access fails** (network restricted, timeouts, clone blocked): do not keep retrying \u2014 write code from the patterns and namespace/package tables in the `{lang}/` file, run the compiler or interpreter on it, and iterate on the error output. For statically-typed SDKs (C#, Java, Go) a compile-fix loop against local errors reaches working code faster than blocked network research.\n\n## Defaults\n\nUnless the user requests otherwise:\n\nFor the Claude model version, please use {{OPUS_NAME}}, which you can access via the exact model string `{{OPUS_ID}}`. Please default to using adaptive thinking (`thinking: {type: \"adaptive\"}`) for anything remotely complicated. And finally, please default to streaming for any request that may involve long input, long output, or high `max_tokens` \u2014 it prevents hitting request timeouts. Use the SDK's `.get_final_message()` / `.finalMessage()` helper to get the complete response if you don't need to handle individual stream events\n\n## \u26A0\uFE0F API Drift \u2014 Your Training Prior May Be Stale\n\nSeveral common Claude API shapes changed in 2025\u20132026. If you recall a pattern from training, verify it against the `{lang}/` files in this skill before writing \u2014 the rows below are the most frequent drift points:\n\n| Area | Stale prior | Current API |\n|---|---|---|\n| Extended thinking | `thinking: {type: \"enabled\", budget_tokens: N}` | On Claude 4.6+ models: `thinking: {type: \"adaptive\"}`. `budget_tokens` is deprecated on Opus 4.6 / Sonnet 4.6 and **rejected with a 400** on Fable 5 / Sonnet 5 / Opus 4.8 / 4.7. Pre-4.6 models still use `budget_tokens`. |\n| Web search / web fetch tool type | `web_search_20250305`, `web_fetch_20250910` | `web_search_20260209`, `web_fetch_20260209` (dynamic filtering) on Opus 4.8/4.7/4.6, Sonnet 5, and Sonnet 4.6. Older models keep the basic variants; on Vertex AI only basic `web_search_20250305` is available (web fetch is not on Vertex) \u2014 see the Server Tools QR below. |\n| PHP parameter names | snake_case wire names as named args (`max_tokens`) | Top-level named args are camelCase (`maxTokens`). Nested array keys vary by feature (e.g. `'taskBudget'`, `'skillID'`, `'mcp_server_name'`) \u2014 copy the exact key from the documented example; do not bulk-convert. |\n\nThe `{lang}/` files in this skill are authoritative over recalled patterns.\n\n---\n\n## Subcommands\n\nIf the User Request at the bottom of this prompt is a bare subcommand string (no prose), search every **Subcommands** table in this document \u2014 including any in sections appended below \u2014 and follow the matching Action column directly. This lets users invoke specific flows via `/claude-api <subcommand>`. If no table in the document matches, treat the request as normal prose.\n\n| Subcommand | Action |\n|---|---|\n| `migrate` | Migrate existing Claude API code to a newer model. **Read `shared/model-migration.md` immediately** and follow it in order: Step 0 (confirm scope \u2014 ask which files/directories before any edit), Step 1 (classify each file), then the per-target breaking-changes section. Do not summarize the guide \u2014 execute it. If the user did not name a target model, ask which model to migrate to in the same turn as the scope question. |\n\n---\n\n## Language Detection\n\nBefore reading code examples, determine which language the user is working in:\n\n1. **Look at project files** to infer the language:\n\n   - `*.py`, `requirements.txt`, `pyproject.toml`, `setup.py`, `Pipfile` \u2192 **Python** \u2014 read from `python/`\n   - `*.ts`, `*.tsx`, `package.json`, `tsconfig.json` \u2192 **TypeScript** \u2014 read from `typescript/`\n   - `*.js`, `*.jsx` (no `.ts` files present) \u2192 **TypeScript** \u2014 JS uses the same SDK, read from `typescript/`\n   - `*.java`, `pom.xml`, `build.gradle` \u2192 **Java** \u2014 read from `java/`\n   - `*.kt`, `*.kts`, `build.gradle.kts` \u2192 **Java** \u2014 Kotlin uses the Java SDK, read from `java/`\n   - `*.scala`, `build.sbt` \u2192 **Java** \u2014 Scala uses the Java SDK, read from `java/`\n   - `*.go`, `go.mod` \u2192 **Go** \u2014 read from `go/`\n   - `*.rb`, `Gemfile` \u2192 **Ruby** \u2014 read from `ruby/`\n   - `*.cs`, `*.csproj` \u2192 **C#** \u2014 read from `csharp/`\n   - `*.php`, `composer.json` \u2192 **PHP** \u2014 read from `php/`\n\n2. **If multiple languages detected** (e.g., both Python and TypeScript files):\n\n   - Check which language the user's current file or question relates to\n   - If still ambiguous, ask: \"I detected both Python and TypeScript files. Which language are you using for the Claude API integration?\"\n\n3. **If language can't be inferred** (empty project, no source files, or unsupported language):\n\n   - Use AskUserQuestion with options: Python, TypeScript, Java, Go, Ruby, cURL/raw HTTP, C#, PHP\n   - If AskUserQuestion is unavailable, default to Python examples and note: \"Showing Python examples. Let me know if you need a different language.\"\n\n4. **If unsupported language detected** (Rust, Swift, C++, Elixir, etc.):\n\n   - Suggest cURL/raw HTTP examples from `curl/` and note that community SDKs may exist\n   - Offer to show Python or TypeScript examples as reference implementations\n\n5. **If user needs cURL/raw HTTP examples**, read from `curl/`.\n\n### Language-Specific Feature Support\n\n| Language   | Tool Runner | Managed Agents | Notes                                 |\n| ---------- | ----------- | -------------- | ------------------------------------- |\n| Python     | Yes (beta)  | Yes (beta)     | Full support \u2014 `@beta_tool` decorator |\n| TypeScript | Yes (beta)  | Yes (beta)     | Full support \u2014 `betaZodTool` + Zod    |\n| Java       | Yes (beta)  | Yes (beta)     | Beta tool use with annotated classes  |\n| Go         | Yes (beta)  | Yes (beta)     | `BetaToolRunner` in `toolrunner` pkg  |\n| Ruby       | Yes (beta)  | Yes (beta)     | `BaseTool` + `tool_runner` in beta    |\n| C#         | Yes (beta)  | Yes (beta)     | `BetaToolRunner` + raw JSON schema    |\n| PHP        | Yes (beta)  | Yes (beta)     | `BetaRunnableTool` + `toolRunner()`   |\n| cURL       | N/A         | Yes (beta)     | Raw HTTP, no SDK features             |\n\n> **Managed Agents code examples**: dedicated language-specific READMEs are provided for Python, TypeScript, Go, Ruby, PHP, Java, and cURL (`{lang}/managed-agents/README.md`, `curl/managed-agents.md`). Read your language's README plus the language-agnostic `shared/managed-agents-*.md` concept files. **Agents are persistent \u2014 create once, reference by ID.** Store the agent ID returned by `agents.create` and pass it to every subsequent `sessions.create`; do not call `agents.create` in the request path. The Anthropic CLI (`ant`) is one convenient way to create agents and environments from version-controlled YAML \u2014 see `shared/anthropic-cli.md`. If a binding you need isn't shown in the README, WebFetch the relevant entry from `shared/live-sources.md` rather than guess. C# has beta Managed Agents support via `client.Beta.Agents` and related namespaces.\n\n---\n\n## Which Surface Should I Use?\n\n> **Start simple.** Default to the simplest tier that meets your needs. Single API calls and workflows handle most use cases \u2014 only reach for agents when the task genuinely requires open-ended, model-driven exploration.\n\n| Use Case                                        | Tier            | Recommended Surface       | Why                                                          |\n| ----------------------------------------------- | --------------- | ------------------------- | ------------------------------------------------------------ |\n| Classification, summarization, extraction, Q&A  | Single LLM call | **Claude API**            | One request, one response                                    |\n| Batch processing or embeddings                  | Single LLM call | **Claude API**            | Specialized endpoints                                        |\n| Multi-step pipelines with code-controlled logic | Workflow        | **Claude API + tool use** | You orchestrate the loop                                     |\n| Custom agent with your own tools                | Agent           | **Claude API + tool use** | Maximum flexibility                                          |\n| Server-managed stateful agent with workspace    | Agent           | **Managed Agents**        | Anthropic runs the loop and hosts the tool-execution sandbox |\n| Persisted, versioned agent configs              | Agent           | **Managed Agents**        | Agents are stored objects; sessions pin to a version         |\n| Long-running multi-turn agent with file mounts  | Agent           | **Managed Agents**        | Per-session containers, SSE event stream, Skills + MCP       |\n\n> **Note:** Managed Agents is the right choice when you want Anthropic to run the agent loop *and* host the container where tools execute \u2014 file ops, bash, code execution all run in the per-session workspace. If you want to host the compute yourself or run your own custom tool runtime, Claude API + tool use is the right choice \u2014 use the tool runner for automatic loop handling, or the manual loop for fine-grained control (approval gates, custom logging, conditional execution).\n\n> **Cloud-provider access.** **Claude Platform on AWS** is Anthropic-operated with same-day API parity \u2014 see `shared/claude-platform-on-aws.md` for client setup. For per-feature availability on **Claude Platform on AWS**, **Amazon Bedrock**, **Google Vertex AI**, and **Microsoft Foundry**, see `shared/platform-availability.md` \u2014 that table is the single source of truth in this skill; do not infer availability from anywhere else.\n\n### Decision Tree\n\n```\nWhat does your application need?\n\n0. Which provider?\n   \u251C\u2500\u2500 First-party API or Claude Platform on AWS \u2192 continue (full surface available; per-feature exceptions in shared/platform-availability.md).\n   \u2514\u2500\u2500 Amazon Bedrock, Google Vertex AI, or Microsoft Foundry \u2192 Claude API (+ tool use for agents); see shared/platform-availability.md for per-feature support.\n\n1. Single LLM call (classification, summarization, extraction, Q&A)\n   \u2514\u2500\u2500 Claude API \u2014 one request, one response\n\n2. Do you want Anthropic to run the agent loop and host a per-session\n   container where Claude executes tools (bash, file ops, code)?\n   \u2514\u2500\u2500 Yes \u2192 Managed Agents \u2014 server-managed sessions, persisted agent configs,\n       SSE event stream, Skills + MCP, file mounts.\n       Examples: \"stateful coding agent with a workspace per task\",\n                 \"long-running research agent that streams events to a UI\",\n                 \"agent with persisted, versioned config used across many sessions\"\n\n3. Workflow (multi-step, code-orchestrated, with your own tools)\n   \u2514\u2500\u2500 Claude API with tool use \u2014 you control the loop\n\n4. Open-ended agent (model decides its own trajectory, your own tools, you host the compute)\n   \u2514\u2500\u2500 Claude API agentic loop (maximum flexibility)\n```\n\n### Should I Build an Agent?\n\nBefore choosing the agent tier, check all four criteria:\n\n- **Complexity** \u2014 Is the task multi-step and hard to fully specify in advance? (e.g., \"turn this design doc into a PR\" vs. \"extract the title from this PDF\")\n- **Value** \u2014 Does the outcome justify higher cost and latency?\n- **Viability** \u2014 Is Claude capable at this task type?\n- **Cost of error** \u2014 Can errors be caught and recovered from? (tests, review, rollback)\n\nIf the answer is \"no\" to any of these, stay at a simpler tier (single call or workflow).\n\n---\n\n## Architecture\n\nEverything goes through `POST /v1/messages`. Tools and output constraints are features of this single endpoint \u2014 not separate APIs.\n\n**User-defined tools** \u2014 You define tools (via decorators, Zod schemas, or raw JSON), and the SDK's tool runner handles calling the API, executing your functions, and looping until Claude is done. For full control, you can write the loop manually.\n\n**Server-side tools** \u2014 Anthropic-hosted tools that run on Anthropic's infrastructure. Code execution is fully server-side (declare it in `tools`, Claude runs code automatically). Computer use can be server-hosted or self-hosted.\n\n**Structured outputs** \u2014 Constrains the Messages API response format (`output_config.format`) and/or tool parameter validation (`strict: true`). The recommended approach is `client.messages.parse()` which validates responses against your schema automatically. Note: the old `output_format` parameter is deprecated; use `output_config: {format: {...}}` on `messages.create()`.\n\n**Supporting endpoints** \u2014 Batches (`POST /v1/messages/batches`), Files (`POST /v1/files`), Token Counting (`POST /v1/messages/count_tokens` \u2014 see `shared/token-counting.md`), and Models (`GET /v1/models`, `GET /v1/models/{id}` \u2014 live capability/context-window discovery) feed into or support Messages API requests.\n\n---\n\n## Current Models (cached: 2026-06-24)\n\n| Model             | Model ID            | Context        | Input $/1M | Output $/1M |\n| ----------------- | ------------------- | -------------- | ---------- | ----------- |\n| {{FABLE_NAME}}    | `{{FABLE_ID}}`      | 1M             | $10.00     | $50.00      |\n| {{MYTHOS_NAME}} (Project Glasswing only) | `{{MYTHOS_ID}}` | 1M | $10.00     | $50.00      |\n| Claude Opus 4.8   | `claude-opus-4-8`   | 1M             | $5.00      | $25.00      |\n| Claude Opus 4.7   | `claude-opus-4-7`   | 1M             | $5.00      | $25.00      |\n| Claude Opus 4.6   | `claude-opus-4-6`   | 1M             | $5.00      | $25.00      |\n| Claude Sonnet 5   | `claude-sonnet-5`   | 1M             | $3.00 ($2.00 intro through 2026-08-31) | $15.00 ($10.00 intro) |\n| Claude Sonnet 4.6 | `claude-sonnet-4-6` | 1M             | $3.00      | $15.00      |\n| Claude Haiku 4.5  | `claude-haiku-4-5`  | 200K           | $1.00      | $5.00       |\n\n**ALWAYS use `{{OPUS_ID}}` unless the user explicitly names a different model.** This is non-negotiable. Do not use `{{SONNET_ID}}`, `{{PREV_SONNET_ID}}`, or any other model unless the user literally says \"use sonnet\" or \"use haiku\". Never downgrade for cost \u2014 that's the user's decision, not yours. Use `{{FABLE_ID}}` only when the user explicitly asks for {{FABLE_NAME}}, \"fable\", or Anthropic's most capable model \u2014 it has different API behavior than the Opus family (see below) and pricing that exceeds Opus-tier.\n\n### {{FABLE_NAME}} (`{{FABLE_ID}}`) \u2014 most capable widely released model\n\n{{FABLE_NAME}} is Anthropic's most capable widely released model, for the most demanding reasoning and long-horizon agentic work. **{{MYTHOS_NAME}}** (`{{MYTHOS_ID}}`) offers the same capabilities, pricing, and API surface through Project Glasswing (participation is the only way to access it), succeeding the invitation-only Claude Mythos Preview (`claude-mythos-preview`) \u2014 everything below applies to both models. 1M context window (the maximum is also the default), 128K max output. Key API differences from Opus-tier \u2014 see `shared/model-migration.md` \u2192 Migrating to {{FABLE_NAME}} for details:\n\n- **Thinking is always on** \u2014 omit the `thinking` parameter entirely (or send `{type: \"adaptive\"}`). Any other explicit configuration is rejected: `{type: \"disabled\"}` and `{type: \"enabled\", budget_tokens: N}` both return a 400. Control depth with `output_config.effort` (supports `low` through `xhigh` and `max`).\n- **The raw chain of thought is never returned** \u2014 responses carry regular `thinking` blocks (not `redacted_thinking`): `display: \"summarized\"` returns a readable summary, `\"omitted\"` (the default) leaves the `thinking` field as an empty string. Replay rules: pass thinking blocks back exactly as received on the same model (including empty-text blocks \u2014 the API rejects *modified* blocks, not read ones); a **different** model **drops** them from the prompt (typically silently \u2014 not an error; the drop happens before pricing, so dropped blocks aren't billed and there's nothing to strip). Regular thinking blocks from other models replay across models freely.\n- **Tokenizer** \u2014 same tokenizer as Opus 4.8 (introduced with Opus 4.7). Token counts are roughly unchanged when migrating from Opus 4.7/4.8; per-token pricing differs. Coming from Opus 4.6, Sonnet, Haiku, or older, re-baseline with `count_tokens`.\n- **`refusal` stop reason \u2014 handle it, and opt into fallbacks by default** \u2014 safety classifiers may decline a request (HTTP 200, `stop_reason: \"refusal\"`, with a `stop_details` category). A pre-output refusal has an empty `content` array and is not billed at all; a mid-stream refusal bills the already-streamed output \u2014 discard the partial output. Always check `stop_reason` before reading `content`. Recovery is **opt-in on the API**: most Claude consumer surfaces ship with built-in {{OPUS_NAME}} fallbacks, but an API request that doesn't opt in simply stops on a refusal \u2014 and false positives on benign adjacent work (security tooling, life-sciences tasks) do happen. **When you write `{{FABLE_ID}}` code, include the server-side `fallbacks` parameter by default** (`betas: [\"server-side-fallback-2026-06-01\"]` + `fallbacks: [{\"model\": \"{{OPUS_ID}}\"}]`; Claude API and Claude Platform on AWS): a declined request is transparently re-served by the fallback model inside the same call, with credit-style repricing applied automatically (a decline before any output isn't billed; the rescue bills at the fallback model's own rates). Tell the user you've enabled it; drop it only if they decline. The GA SDKs' client-side `BetaRefusalFallbackMiddleware` + `BetaFallbackState` handle retry everywhere server-side fallbacks aren't supported (incl. Amazon Bedrock, Vertex AI, Microsoft Foundry); fallback credit refunds the cache-switch cost of client-side retries. Code examples: the Refusal Fallbacks section of your language's claude-api doc; full semantics in the migration guide's refusal section.\n- **No assistant prefill** \u2014 same as the rest of the 4.6+ family.\n- **30-day data retention required** \u2014 {{FABLE_NAME}} is not available under zero data retention; requests from an org whose retention configuration doesn't meet the requirement return `400 invalid_request_error`.\n- **Longer turns, different prompting** \u2014 single requests on hard tasks can run many minutes (plan timeouts/streaming/progress UX); effort sweeps should include low/medium for routine work; prompts written for prior models are often too prescriptive and reduce output quality. See `shared/model-migration.md` \u2192 Migrating to {{FABLE_NAME}} \u2192 Behavioral shifts (prompt-tunable) for the recommended prompt snippets (anti-overplanning, no-tidying, grounded progress claims, boundaries, async sub-agents, memory, `send_to_user`).\n\n**CRITICAL: Use only the exact model ID strings from the table above \u2014 they are complete as-is. Do not append date suffixes.** For example, use `claude-sonnet-4-6`, never `claude-sonnet-4-6-20251114` or any other date-suffixed variant you might recall from training data. If the user requests an older model not in the table (e.g., \"opus 4.5\", \"sonnet 3.7\"), read `shared/models.md` for the exact ID \u2014 do not construct one yourself.\n\nA note: if any of the model strings above look unfamiliar to you, that's to be expected \u2014 that just means they were released after your training data cutoff. Rest assured they are real models; we wouldn't mess with you like that.\n\n**Live capability lookup:** The table above is cached. When the user asks \"what's the context window for X\", \"does X support vision/thinking/effort\", or \"which models support Y\", query the Models API (`client.models.retrieve(id)` / `client.models.list()`) \u2014 see `shared/models.md` for the field reference and capability-filter examples.\n\n---\n\n## Authentication (Quick Reference)\n\n**An unset `ANTHROPIC_API_KEY` does NOT mean there are no credentials.** The SDKs and the `ant` CLI resolve credentials in this order (first match wins): `ANTHROPIC_API_KEY` \u2192 `ANTHROPIC_AUTH_TOKEN` \u2192 the `ANTHROPIC_PROFILE`-selected or active OAuth profile from `ant auth login` \u2192 Workload Identity Federation env vars \u2192 the default profile on disk. A bare `Anthropic()` / `new Anthropic()` / `anthropic.NewClient()` works after `ant auth login` with no env var set.\n\n**When you need to call the API and `ANTHROPIC_API_KEY` is unset, don't ask the user for a key.** First run `ant auth status` \u2014 it shows which credential source and profile is active. If it reports an active profile:\n\n- **SDK code or `ant` CLI:** just run it. The zero-arg client constructor and every `ant \u2026` subcommand pick up the profile automatically \u2014 no env var needed.\n- **Raw `curl` / HTTP:** get a short-lived token with `ant auth print-credentials --access-token` and send it as `Authorization: Bearer <token>` **plus** the header `anthropic-beta: oauth-2025-04-20` (OAuth tokens go on `Authorization: Bearer`, not `x-api-key:` \u2014 converting a curl from an API key is a header change, not a key swap). Always pass `--access-token`; the no-flag form prints JSON, not a bare token.\n\nOnly ask the user for a key if `ant auth status` reports no active credential source (or `ant` itself isn't installed). Suggest `ant auth login` as the first option \u2014 it stores a profile under `~/.config/anthropic/` that the SDKs read automatically \u2014 and an exported `ANTHROPIC_API_KEY` as the alternative.\n\nFull auth details (named profiles, scopes, the API-key-shadows-profile trap, refresh-token expiry): `shared/anthropic-cli.md`.\n\n---\n\n## Thinking & Effort (Quick Reference)\n\n**Fable 5 / Opus 4.8 / 4.7 / Sonnet 5 \u2014 Adaptive thinking only:** Use `thinking: {type: \"adaptive\"}`. `thinking: {type: \"enabled\", budget_tokens: N}` returns a 400 \u2014 adaptive is the only on-mode. On Opus 4.8, Opus 4.7, and Sonnet 5, `{type: \"disabled\"}` and omitting `thinking` both work (on Sonnet 5, omitting runs adaptive; on Opus 4.7/4.8, omitting runs without thinking \u2014 set `{type: \"adaptive\"}` explicitly); on Fable 5, an explicit `{type: \"disabled\"}` returns a 400 \u2014 omit the `thinking` param entirely instead. Sampling parameters (`temperature`, `top_p`, `top_k`) are also removed and will 400. Opus 4.8 keeps the same request surface as 4.7 (no new breaking changes) \u2014 see `shared/model-migration.md` \u2192 Migrating to Opus 4.8 for the behavioral re-tuning, and \u2192 Migrating to Opus 4.7 for the full breaking-change list when coming from 4.6 or earlier. Note: with `thinking` disabled, Opus 4.8 may write longer reasoning into the visible response \u2014 leave adaptive thinking on, or add a final-answer-only instruction (see the migration guide).\n**Opus 4.6 \u2014 Adaptive thinking (recommended):** Use `thinking: {type: \"adaptive\"}`. Claude dynamically decides when and how much to think. No `budget_tokens` needed \u2014 `budget_tokens` is deprecated on Opus 4.6 and Sonnet 4.6 and should not be used for new code. Adaptive thinking also automatically enables interleaved thinking (no beta header needed). **When the user asks for \"extended thinking\", a \"thinking budget\", or `budget_tokens`: always use Fable 5, Opus 4.8, 4.7, or 4.6 with `thinking: {type: \"adaptive\"}`. The concept of a fixed token budget for thinking is deprecated \u2014 adaptive thinking replaces it. Do NOT use `budget_tokens` for new 4.6/4.7/4.8 code and do NOT switch to an older model.** *Gradual-migration carve-out:* `budget_tokens` is still functional on Opus 4.6 and Sonnet 4.6 as a transitional escape hatch \u2014 if you're migrating existing code and need a hard token ceiling before you've tuned `effort`, see `shared/model-migration.md` \u2192 Transitional escape hatch. Note: this carve-out does **not** apply to Fable 5, Opus 4.7 or 4.8 \u2014 `budget_tokens` is fully removed there.\n**Effort parameter (GA, no beta header):** Controls thinking depth and overall token spend via `output_config: {effort: \"low\"|\"medium\"|\"high\"|\"max\"}` (inside `output_config`, not top-level). Default is `high` (equivalent to omitting it). `max` is supported on Fable 5, Opus 4.6 and later, Sonnet 5, and Sonnet 4.6 (not Haiku or earlier Sonnets). Opus 4.7 added `\"xhigh\"` (between `high` and `max`) \u2014 the best setting for most coding and agentic use cases on Fable 5 / Opus 4.7/4.8 / Sonnet 5, and the default in Claude Code; use a minimum of `high` for most intelligence-sensitive work. Works on Fable 5, Opus 4.5, Opus 4.6, Opus 4.7, Opus 4.8, Sonnet 5, and Sonnet 4.6. Will error on Sonnet 4.5 / Haiku 4.5. On Fable 5, Opus 4.7/4.8, and Sonnet 5, effort matters more than on any prior model in their tier \u2014 re-tune it when migrating, and run long-horizon/agentic tasks at `high`/`xhigh` with the full task spec given up front. Combine with adaptive thinking for the best cost-quality tradeoffs. Lower effort means fewer and more-consolidated tool calls, less preamble, and terser confirmations \u2014 `high` is often the sweet spot balancing quality and token efficiency; use `max` when correctness matters more than cost; use `low` for subagents or simple tasks.\n\n**Thinking display \u2014 `\"omitted\"` by default on Fable 5 / Mythos 5 / Opus 4.8 / 4.7 / Sonnet 5:** `display: \"summarized\"` returns a readable summary of the reasoning; `\"omitted\"` (the default on all five \u2014 a silent change from Opus 4.6 and Sonnet 4.6, where it was `\"summarized\"`) streams `thinking` blocks with empty text. `display` controls visibility only \u2014 thinking happens and is billed the same under every setting; the raw chain of thought is never exposed on any model. If you stream reasoning to users, the default looks like a long pause before output \u2014 set `thinking: {type: \"adaptive\", display: \"summarized\"}` explicitly. (Independent of display, echo thinking blocks back unchanged when continuing on the same model; other models silently ignore them \u2014 see the migration guide.)\n\n**Task Budgets (beta, Fable 5 / Opus 4.7 / 4.8 / Sonnet 5):** `output_config: {task_budget: {type: \"tokens\", total: N}}` tells the model how many tokens it has for a full agentic loop \u2014 it sees a running countdown and self-moderates (minimum 20,000; beta header `task-budgets-2026-03-13`). Distinct from `max_tokens`, which is an enforced per-response ceiling the model is not aware of. See `shared/model-migration.md` \u2192 Task Budgets.\n\n**Sonnet 4.6:** Supports adaptive thinking (`thinking: {type: \"adaptive\"}`). `budget_tokens` is deprecated on Sonnet 4.6 \u2014 use adaptive thinking instead.\n\n**Older models (only if explicitly requested):** If the user specifically asks for Sonnet 4.5 or another older model, use `thinking: {type: \"enabled\", budget_tokens: N}`. `budget_tokens` must be less than `max_tokens` (minimum 1024). Never choose an older model just because the user mentions `budget_tokens` \u2014 use Opus 4.8 with adaptive thinking instead.\n\n---\n\n## Compaction (Quick Reference)\n\n**Beta, Fable 5, Opus 4.8, Opus 4.7, Opus 4.6, Sonnet 5, and Sonnet 4.6.** For long-running conversations that may exceed the 1M context window, enable server-side compaction. The API automatically summarizes earlier context when it approaches the trigger threshold (default: 150K tokens). Requires beta header `compact-2026-01-12`.\n\n**Critical:** Append `response.content` (not just the text) back to your messages on every turn. Compaction blocks in the response must be preserved \u2014 the API uses them to replace the compacted history on the next request. Extracting only the text string and appending that will silently lose the compaction state.\n\nSee `{lang}/claude-api/README.md` (Compaction section) for code examples. Full docs via WebFetch in `shared/live-sources.md`.\n\n---\n\n## Prompt Caching (Quick Reference)\n\n**Prefix match.** Any byte change anywhere in the prefix invalidates everything after it. Render order is `tools` \u2192 `system` \u2192 `messages`. Keep stable content first (frozen system prompt, deterministic tool list), put volatile content (timestamps, per-request IDs, varying questions) after the last `cache_control` breakpoint.\n\n**Mid-conversation operator instructions** ({{OPUS_NAME}} only; no beta header): append `{\"role\": \"system\", ...}` to `messages[]` instead of editing top-level `system`. Preserves the cached history prefix and is the prompt-injection-safe operator channel. See `shared/prompt-caching.md` \xA7 Mid-conversation system messages.\n\n**Top-level auto-caching** (`cache_control: {type: \"ephemeral\"}` on `messages.create()`) is the simplest option when you don't need fine-grained placement. Max 4 breakpoints per request. Minimum cacheable prefix is ~1024 tokens \u2014 shorter prefixes silently won't cache.\n\n**Verify with `usage.cache_read_input_tokens`** \u2014 if it's zero across repeated requests, a silent invalidator is at work (`datetime.now()` in system prompt, unsorted JSON, varying tool set).\n\nFor placement patterns, architectural guidance, and the silent-invalidator audit checklist: read `shared/prompt-caching.md`. Language-specific syntax: `{lang}/claude-api/README.md` (Prompt Caching section).\n\n---\n\n## Fast Mode (Quick Reference)\n\n**Research preview, Opus 4.8 / 4.7 only.** Opus 4.7 fast mode is deprecated \u2014 after removal, `speed: \"fast\"` on 4.7 returns an error. Opus 4.8 is the durable fast-capable tier. Fast mode runs the same model at up to 2.5x higher output tokens per second, at premium pricing. Three things are required on every request: use the **beta** messages endpoint (`client.beta.messages.\u2026`), pass the beta flag `fast-mode-2026-02-01`, and set `speed: \"fast\"` as a top-level request parameter (not a header, not in `extra_body`).\n\n```python\nclient.beta.messages.create(\n    model=\"claude-opus-4-8\", max_tokens=4096,\n    speed=\"fast\", betas=[\"fast-mode-2026-02-01\"],\n    messages=[...],\n)\n```\n\n| Language | Beta flag | Speed parameter |\n|---|---|---|\n| Python | `betas=[\"fast-mode-2026-02-01\"]` | `speed=\"fast\"` |\n| TypeScript / Ruby | `betas: [\"fast-mode-2026-02-01\"]` | `speed: \"fast\"` |\n| Go | `[]anthropic.AnthropicBeta{anthropic.AnthropicBetaFastMode2026_02_01}` | `Speed: anthropic.BetaMessageNewParamsSpeedFast` |\n| Java | `.addBeta(AnthropicBeta.FAST_MODE_2026_02_01)` | `.speed(MessageCreateParams.Speed.FAST)` |\n| C# | `Betas = [\"fast-mode-2026-02-01\"]` | `Speed = Speed.Fast` (`Anthropic.Models.Beta.Messages`) |\n| PHP | `betas: ['fast-mode-2026-02-01']` | `speed: 'fast'` |\n| cURL | `anthropic-beta: fast-mode-2026-02-01` header | `\"speed\": \"fast\"` in body |\n\n`response.usage.speed` reports which speed was used. Fast mode has its own rate limit separate from standard Opus; on 429, either retry after the `retry-after` delay or drop `speed` and fall back to standard (note: switching speed invalidates prompt cache). Not available with Batch API, Priority Tier, Claude Platform on AWS, or third-party platforms.\n\n---\n\n## Task Budgets (Quick Reference)\n\n**Beta, Fable 5 / Sonnet 5 / Opus 4.8 / 4.7.** A task budget gives Claude a token ceiling for an agentic loop so it paces itself and finishes gracefully instead of being cut off. Set `task_budget` inside `output_config` on `client.beta.messages.stream(...)` with beta flag `task-budgets-2026-03-13` \u2014 use streaming so the large `max_tokens` doesn't hit HTTP timeouts:\n\n```python\nwith client.beta.messages.stream(\n    model=\"claude-opus-4-8\", max_tokens=128000,\n    output_config={\"effort\": \"high\", \"task_budget\": {\"type\": \"tokens\", \"total\": 64000}},\n    betas=[\"task-budgets-2026-03-13\"],\n    messages=[...], tools=[...],\n) as stream:\n    response = stream.get_final_message()\n```\n\n`task_budget` fields: `type` (always `\"tokens\"`), `total`, and optional `remaining` (defaults to `total`). The server injects a countdown marker Claude sees during generation; the budget counts what Claude generates and the tool results it reads this turn \u2014 **not** the full history you resend each request.\n\n**Observing spend:** accumulate `response.usage.output_tokens` (plus the token count of the tool-result blocks you append) across loop iterations if you want to display progress. Leave `remaining` unset in the normal loop \u2014 the server tracks the countdown itself, and passing a client-computed `remaining` while also resending full history under-reports the budget. **Only pass `remaining`** when you compact or rewrite history between requests and the server can no longer derive prior spend.\n\n---\n\n## Provider Clients (Quick Reference)\n\nWhen targeting Claude on a third-party platform, use that platform's dedicated client class \u2014 not the first-party `Anthropic()` client with a `base_url` override. After construction the client exposes the same `messages.create` / `.stream` surface as the first-party SDK.\n\n### Amazon Bedrock\n\nUse the **Mantle** client (Messages-API Bedrock endpoint). Bedrock model IDs take an `anthropic.` prefix (e.g. `\"anthropic.{{OPUS_ID}}\"`). Region is required.\n\n| Language | Client |\n|---|---|\n| Python | `from anthropic import AnthropicBedrockMantle` \u2192 `AnthropicBedrockMantle(aws_region=\"\u2026\")` |\n| TypeScript | `import { AnthropicBedrockMantle } from \"@anthropic-ai/bedrock-sdk\"` \u2192 `new AnthropicBedrockMantle({ awsRegion: \"\u2026\" })` |\n| Go | `bedrock.NewMantleClient(ctx, bedrock.MantleClientConfig{ AWSRegion: \"\u2026\" })` |\n| Java | `AnthropicOkHttpClient.builder().backend(BedrockMantleBackend.fromEnv()).build()` (from `com.anthropic.bedrock.backends`) |\n| C# | `new AnthropicBedrockMantleClient(new() { AwsRegion = \"\u2026\" })` (package `Anthropic.Bedrock`) |\n| PHP | `use Anthropic\\Bedrock\\MantleClient;` \u2192 `new MantleClient(awsRegion: '\u2026')` |\n| Ruby | `Anthropic::BedrockMantleClient.new(aws_region: \"\u2026\")` |\n\n`AnthropicBedrock` / `BedrockClient` / `BedrockBackend` (without `Mantle`) are the legacy `bedrock-runtime` InvokeModel path \u2014 prefer the Mantle client for new code.\n\n### Microsoft Foundry\n\n| Language | Client |\n|---|---|\n| Python | `from anthropic import AnthropicFoundry` \u2192 `AnthropicFoundry(api_key=\u2026, resource=\"\u2026\")` |\n| TypeScript | `import AnthropicFoundry from \"@anthropic-ai/foundry-sdk\"` \u2192 `new AnthropicFoundry({ \u2026 })` |\n| Java | `AnthropicOkHttpClient.builder().backend(FoundryBackend.fromEnv()).build()` (from `com.anthropic.foundry.backends`) |\n| C# | `new AnthropicFoundryClient(new AnthropicFoundryApiKeyCredentials(\u2026))` (package `Anthropic.Foundry`) |\n| PHP | `Foundry\\Client::withCredentials(\u2026)` |\n\nThe Go and Ruby SDKs do not currently support Foundry. For Ruby, use the standard `Anthropic::Client.new(base_url: \"<foundry endpoint>\")` as a fallback (Entra ID auth is not built in). For Claude Platform on AWS, see `shared/claude-platform-on-aws.md`.\n\n### Google Cloud Vertex AI\n\nTwo required constructor args: GCP `project_id` and `region`. Vertex model IDs take **no prefix** \u2014 current-generation models (Opus 4.8/4.7/4.6, Sonnet 5, Sonnet 4.6) use the bare first-party ID (e.g. `\"{{OPUS_ID}}\"`); dated-snapshot models use an `@` version separator (e.g. `claude-opus-4-5@20251101`, **not** `claude-opus-4-5-20251101`). Auth is GCP ADC (`gcloud auth application-default login`); no Anthropic API key. `region` can be `\"global\"` (recommended), a multi-region (`\"us\"`/`\"eu\"`), or a specific region. After construction, use the same `messages.create` / `.stream` surface.\n\n| Language | Client |\n|---|---|\n| Python | `from anthropic import AnthropicVertex` \u2192 `AnthropicVertex(project_id=\"\u2026\", region=\"\u2026\")` (install `\"anthropic[vertex]\"`) |\n| TypeScript | `import { AnthropicVertex } from \"@anthropic-ai/vertex-sdk\"` \u2192 `new AnthropicVertex({ projectId, region })` |\n| Go | `import \"github.com/anthropics/anthropic-sdk-go/vertex\"` \u2192 `anthropic.NewClient(vertex.WithGoogleAuth(ctx, region, projectID))` |\n| Java | `AnthropicOkHttpClient.builder().backend(VertexBackend.builder().region(\"\u2026\").project(\"\u2026\").build()).build()` (from `com.anthropic.vertex.backends`) |\n| C# | `new AnthropicClient { Backend = new VertexBackend(projectId, region) }` (package `Anthropic.Vertex`) |\n| PHP | `use Anthropic\\Vertex;` \u2192 `Vertex\\Client::fromEnvironment(location: '\u2026', projectId: '\u2026')` \u2014 note `location`, not `region` |\n| Ruby | `Anthropic::VertexClient.new(region: \"\u2026\", project_id: \"\u2026\")` |\n\n---\n\n## Context Editing (Quick Reference)\n\n**Beta.** Context editing **clears** old tool results or thinking blocks from the conversation before the model sees it; it is **not compaction** (which summarizes). On `client.beta.messages.*` with beta `context-management-2025-06-27`, pass `context_management.edits` with a strategy type:\n\n```python\nclient.beta.messages.create(\n    model=\"{{OPUS_ID}}\", max_tokens=4096,\n    betas=[\"context-management-2025-06-27\"],\n    context_management={\"edits\": [{\"type\": \"clear_tool_uses_20250919\"}]},\n    tools=[...], messages=[...],\n)\n```\n\nStrategy types: `clear_tool_uses_20250919` (clears old tool results; optional `clear_tool_inputs: true` also clears the tool_use params) and `clear_thinking_20251015` (clears thinking blocks). Do **not** use `compact_20260112` or beta `compact-2026-01-12` \u2014 those are the separate compaction feature.\n\n---\n\n## Mid-Conversation System Messages (Quick Reference)\n\n**{{OPUS_NAME}} only; no beta header.** Append `{\"role\": \"system\", \"content\": \"\u2026\"}` to the `messages` array (not the top-level `system` field) to add an operator instruction mid-conversation without invalidating the cached prefix. Use the regular `client.messages.create` \u2014 there is no beta. A mid-conversation system message must follow a `user` message (or an `assistant` message ending in server-tool use), and must be either the last entry in `messages` or be followed by an `assistant` turn \u2014 it cannot be `messages[0]`. Availability: `shared/platform-availability.md`. See `shared/prompt-caching.md` \xA7 Mid-conversation system messages.\n\n---\n\n## Managed Agents (Beta)\n\n**Managed Agents** is a third surface: server-managed stateful agents with Anthropic-hosted tool execution. You create a persisted, versioned Agent config (`POST /v1/agents`), then start Sessions that reference it. Each session provisions a container as the agent's workspace \u2014 bash, file ops, and code execution run there; the agent loop itself runs on Anthropic's orchestration layer and acts on the container via tools. The session streams events; you send messages and tool results back.\n\nAvailability: `shared/platform-availability.md`. For agents on Bedrock / Vertex / Foundry (where Managed Agents is unsupported), use Claude API + tool use.\n\n**Mandatory flow:** Agent (once) \u2192 Session (every run). `model`/`system`/`tools` live on the agent, never the session. See `shared/managed-agents-overview.md` for the full reading guide, beta headers, and pitfalls.\n\n**Beta headers:** `managed-agents-2026-04-01` \u2014 the SDK sets this automatically for all `client.beta.{agents,environments,sessions,vaults,memory_stores,deployments,deployment_runs}.*` calls. Skills API uses `skills-2025-10-02` and Files API uses `files-api-2025-04-14`, but you don't need to explicitly pass those in for endpoints other than `/v1/skills` and `/v1/files`.\n\n**Subcommands** \u2014 invoke directly with `/claude-api <subcommand>`:\n\n| Subcommand | Action |\n|---|---|\n| `managed-agents-onboard` | Walk the user through setting up a Managed Agent from scratch. **Read `shared/managed-agents-onboarding.md` immediately** and follow its interview script: **describe \u2192 configure the agent (propose, don't interrogate) \u2192 environment \u2192 session** (same arc as the Console quickstart, auth deferred to the session step) \u2014 defaults and inline suggestions do the work, with a silent viability gate (job vs tools/credentials/data) before any code is emitted. Do not summarize \u2014 run the interview. |\n\n**Reading guide:** Start with `shared/managed-agents-overview.md`, then the topical `shared/managed-agents-*.md` files (core, environments, tools, events, outcomes, multiagent, webhooks, memory, scheduled-deployments, client-patterns, onboarding, api-reference). For Python, TypeScript, Go, Ruby, PHP, and Java, read `{lang}/managed-agents/README.md` for code examples. For cURL, read `curl/managed-agents.md`. **Agents are persistent \u2014 create once, reference by ID.** Store the agent ID returned by `agents.create` and pass it to every subsequent `sessions.create`; do not call `agents.create` in the request path. The Anthropic CLI (`ant`) is one convenient way to create agents and environments from version-controlled YAML \u2014 see `shared/anthropic-cli.md`. If a binding you need isn't shown in the language README, WebFetch the relevant entry from `shared/live-sources.md` rather than guess. C# has beta Managed Agents support via `client.Beta.Agents` and related namespaces.\n\n**When the user wants to set up a Managed Agent from scratch** (e.g. \"how do I get started\", \"walk me through creating one\", \"set up a new agent\"): read `shared/managed-agents-onboarding.md` and run its interview \u2014 same flow as the `managed-agents-onboard` subcommand.\n\n**When the user asks \"how do I write the client code for X\":** reach for `shared/managed-agents-client-patterns.md` \u2014 covers lossless stream reconnect, `processed_at` queued/processed gate, interrupt, `tool_confirmation` round-trip, the correct idle/terminated break gate, post-idle status race, stream-first ordering, file-mount gotchas, keeping credentials host-side via custom tools, etc.\n\n**When the user wants the agent to run on a schedule** (cron, \"every night\", \"weekly report\"): read `shared/managed-agents-scheduled-deployments.md` \u2014 deployments fire sessions autonomously on a cron cadence, with per-firing run records and lifecycle controls (pause/unpause/archive).\n\n---\n\n## Server Tools (Quick Reference)\n\nServer-side tools run on Anthropic's infrastructure \u2014 no client-side execution loop. Declare in `tools`; results arrive as content blocks in the same response. **No beta header** unless noted. **Prefer the latest type variant your model supports.** The `_20260209` web search / web fetch variants below (dynamic filtering) require Opus 4.8/4.7/4.6, Sonnet 5, or Sonnet 4.6; the basic variants for older models are listed after the table.\n\n| Tool | `type` | `name` | Key optional params | Result block type |\n|---|---|---|---|---|\n| Web search | `web_search_20260209` | `web_search` | `max_uses`, `allowed_domains`/`blocked_domains`, `user_location` | `web_search_tool_result` \u2192 `.content` is a list of `web_search_result` |\n| Web fetch | `web_fetch_20260209` | `web_fetch` | `max_uses`, `allowed_domains`/`blocked_domains`, `citations`, `max_content_tokens` | `web_fetch_tool_result` \u2192 `.content` is a `web_fetch_result` with a `document` block |\n| Code execution | `code_execution_20260521` | `code_execution` | none | `bash_code_execution_tool_result` \u2192 `.content.stdout` / `.stderr` / `.return_code` |\n| Tool search (regex) | `tool_search_tool_regex_20251119` | `tool_search_tool_regex` | mark other tools `defer_loading: true` | `tool_search_tool_result` |\n| Tool search (BM25) | `tool_search_tool_bm25_20251119` | `tool_search_tool_bm25` | mark other tools `defer_loading: true` | `tool_search_tool_result` |\n\n`web_search_20260209` / `web_fetch_20260209` have built-in dynamic filtering \u2014 code execution runs under the hood, so do **not** separately declare `code_execution` in `tools` (a second execution environment confuses the model). For models older than Opus 4.6 / Sonnet 4.6, use the basic variants `web_search_20250305` / `web_fetch_20250910` instead; on Vertex AI only basic `web_search_20250305` is available. `code_execution_20260120` (REPL persistence + programmatic tool calling) runs on Opus 4.5+ / Sonnet 4.5+. **Go SDK only**: `code_execution_20260521` lives under `client.Beta.Messages.New` with `Betas: []anthropic.AnthropicBeta{\"code-execution-2025-08-25\"}` (other languages use plain `client.messages.create`); `code_execution_20260120` uses the non-beta `client.Messages.New` in Go like everywhere else. Web fetch only fetches URLs already present in the conversation. Provider availability varies by tool \u2014 see `shared/platform-availability.md`. See `shared/tool-use-concepts.md` for `pause_turn` handling.\n\n## Document & File Input (Quick Reference)\n\n**PDF (base64, no beta):** `{\"type\": \"document\", \"source\": {\"type\": \"base64\", \"media_type\": \"application/pdf\", \"data\": <b64 string>}}` in user content, placed before the text block. Base64 string must have no newlines. Limits: 32 MB request, 600 pages (100 for 200k-context models). Java: `ContentBlockParam.ofDocument(DocumentBlockParam... Base64PdfSource.builder().data(...))`.\n\n**Files API (beta `files-api-2025-04-14`):** upload via `client.beta.files.upload(...)` \u2192 response `id` is the `file_id`. Reference it as `{\"type\": \"document\", \"source\": {\"type\": \"file\", \"file_id\": \"...\"}}` for PDF/text, or `{\"type\": \"image\", ...}` for images \u2014 the content-block type must match the file's MIME type. The beta header is required on **both** the upload and the `messages.create` that references the file. Availability: `shared/platform-availability.md`.\n\n**Citations (no beta):** set `citations: {enabled: true}` on each `document` content block (all or none). Response splits into multiple `text` blocks; cited blocks carry a `citations` array. Each citation has `cited_text`, `document_index`, `document_title`, and a location by `type`: `char_location` (`start_char_index`/`end_char_index`) for plain text, `page_location` (`start_page_number`/`end_page_number`, 1-indexed) for PDF, `content_block_location` for custom content. Incompatible with `output_config.format`.\n\n## Tool Use Patterns (Quick Reference)\n\n**Strict tool use (no beta):** set `strict: true` as a top-level field on the tool definition (alongside `name`/`description`/`input_schema`), **not** on `tool_choice`. Schema must have `additionalProperties: false` + `required`. Guarantees `tool_use.input` validates exactly. Go: `Strict: anthropic.Bool(true)` + `additionalProperties` via `InputSchema.ExtraFields`; Java: `.strict(true)` + `.putAdditionalProperty(\"additionalProperties\", JsonValue.from(false))`.\n\n**Parallel tool use (default on):** one assistant message may contain multiple `tool_use` blocks. Execute them concurrently, then return **all** `tool_result` blocks in a **single** user message (don't split across multiple messages). For a failed tool, return `tool_result` with `is_error: true` \u2014 don't drop it.\n\n**Tool Runner (SDK beta helper):** drives the tool-call loop for you via `client.beta.messages.*`. Python: `@beta_tool` decorator + `client.beta.messages.tool_runner(...)` \u2192 `runner.until_done()`. TypeScript: `betaZodTool({...})` from `@anthropic-ai/sdk/helpers/beta/zod` + `client.beta.messages.toolRunner(...)` \u2192 `await runner`. Go: `toolrunner.NewBetaToolFromJSONSchema(...)` + `client.Beta.Messages.NewToolRunner(...)` \u2192 `.RunToCompletion(ctx)`. Java requires `.addBeta(\"structured-outputs-2025-11-13\")`. Ruby: `Anthropic::BaseTool` subclass + `client.beta.messages.tool_runner(...)`. PHP: `BetaRunnableTool` + `->toolRunner(...)`. C#: raw JSON-schema tools + `BetaToolRunner` via `client.Beta.Messages.ToolRunner(...)`.\n\n**Programmatic tool calling (no beta header):** Claude calls your custom tool from inside code execution. Add `{\"type\": \"code_execution_20260120\", \"name\": \"code_execution\"}` **and** set `\"allowed_callers\": [\"code_execution_20260120\"]` on your custom tool. Opus 4.5+ / Sonnet 4.5+ (availability: `shared/platform-availability.md`). When responding to a pending programmatic call, the user message must contain **only** `tool_result` blocks (no text). Not compatible with `strict: true`, `disable_parallel_tool_use`, forced `tool_choice`, or MCP tools.\n\n## Other API Surfaces (Quick Reference)\n\n**Message Batches (no beta; availability: `shared/platform-availability.md`):** `client.messages.batches.create(requests=[{custom_id, params}, ...])` \u2192 poll `client.messages.batches.retrieve(id).processing_status` until `\"ended\"` \u2192 stream `client.messages.batches.results(id)`. Each result has `.custom_id` + `.result.type` (`succeeded`/`errored`/`canceled`/`expired`); on success read `.result.message.content`. Python wraps requests as `Request(custom_id=..., params=MessageCreateParamsNonStreaming(...))`. Results arrive in **any order** \u2014 key by `custom_id`, never by position.\n\n**Models API (no beta; availability: `shared/platform-availability.md`):** `client.models.list()` (auto-paginates) and `client.models.retrieve(\"{{OPUS_ID}}\")`. Each model object has `id`, `display_name`, `created_at`, and \u2014 since Mar 2026 \u2014 `max_input_tokens` (the context window), `max_tokens` (the output cap), and `capabilities`. There is no `context_window` field.\n\n**Stop details (GA, Opus 4.7+):** `response.stop_details` is populated **only when `stop_reason == \"refusal\"`** (fields: `type: \"refusal\"`, `category: \"cyber\"|\"bio\"|null`, `explanation`). It is `null` for every other `stop_reason` (`end_turn`, `max_tokens`, `tool_use`, `pause_turn`, \u2026) \u2014 always guard before reading.\n\n**Client config (no beta):** `timeout` default 10 min; **units differ by SDK** \u2014 Python/Ruby: seconds; TypeScript: **milliseconds**; Go `option.WithRequestTimeout(time.Duration)`; Java `Duration`; C# `TimeSpan`. TS scales the default up to 60 min for large `max_tokens` on non-streaming requests; Java does so for streaming requests (Java non-streaming scales 30s\u201310 min). `max_retries`/`maxRetries` default 2 (retries 408/409/429/5xx + connection errors). `base_url` (or `ANTHROPIC_BASE_URL` env). Per-request override: Python `client.with_options(timeout=5.0).messages.create(...)`; TS `client.messages.create({...}, {timeout: 5_000})`; Ruby `request_options: {timeout: 5}`. Timeouts are retried \u2014 wall-clock can reach `timeout \xD7 (max_retries+1)`.\n\n## Workload Identity Federation (Quick Reference)\n\n**GA, no beta header.** Construct the normal zero-arg client (`Anthropic()` / `new Anthropic()` / `anthropic.NewClient()` / `AnthropicOkHttpClient.fromEnv()`); the SDK auto-detects WIF when **all** of `ANTHROPIC_FEDERATION_RULE_ID`, `ANTHROPIC_ORGANIZATION_ID`, `ANTHROPIC_SERVICE_ACCOUNT_ID`, and `ANTHROPIC_IDENTITY_TOKEN_FILE` (or `ANTHROPIC_IDENTITY_TOKEN`) are set, exchanges the JWT at `/v1/oauth/token`, and auto-refreshes. `ANTHROPIC_WORKSPACE_ID` does not gate activation \u2014 required only when the federation rule spans multiple workspaces (else 400 `workspace_id_required`), optional for single-workspace rules. `ANTHROPIC_API_KEY` or `ANTHROPIC_AUTH_TOKEN` (even empty) outrank WIF, and a set `ANTHROPIC_PROFILE` also wins over the federation env vars (a missing named profile is an error, not a fall-through) \u2014 unset all three.\n\n---\n\n## Reading Guide\n\nAfter detecting the language, read the relevant files based on what the user needs.\n\n**All SDK languages use the same multi-file layout** \u2014 directory `{lang}/claude-api/` containing `README.md` (install, client init, basic request, thinking, caching, stop details, misc), `tool-use.md` (tool definitions, agentic loop, Anthropic-defined tools, structured outputs), `streaming.md`, `batches.md`, `files-api.md`. Not every language has every file (e.g., Ruby has no `batches.md`); if a file is absent, that feature's example is not yet documented for that language \u2014 fall back to the cURL shape or WebFetch the SDK repo from `shared/live-sources.md`. **cURL** \u2192 `curl/examples.md`.\n\nThe Quick Task Reference below uses the `{lang}/claude-api/FILE.md` path notation for all languages.\n\n### Quick Task Reference\n\n**Single text classification/summarization/extraction/Q&A:**\n\u2192 Read only `{lang}/claude-api/README.md`\n\n**Chat UI or real-time response display:**\n\u2192 Read `{lang}/claude-api/README.md` + `{lang}/claude-api/streaming.md`\n\n**Long-running conversations (may exceed context window):**\n\u2192 Read `{lang}/claude-api/README.md` \u2014 see Compaction section\n**Migrating to a newer model (Fable 5 / Opus 4.8 / Opus 4.7 / Opus 4.6 / Sonnet 5 / Sonnet 4.6) or replacing a retired model:**\n\u2192 Read `shared/model-migration.md`\n**Prompting or tuning Fable 5 (long turns, effort, verbosity, autonomous runs, sub-agents):**\n\u2192 Read `shared/model-migration.md` \u2192 Migrating to Fable 5 \u2192 Behavioral shifts (prompt-tunable) + Long-running agent recommendations\n**Prompt caching / optimize caching / \"why is my cache hit rate low\":**\n\u2192 Read `shared/prompt-caching.md` + `{lang}/claude-api/README.md` (Prompt Caching section)\n**Count tokens in a file / prompt / diff (\"how many tokens is X\"):**\n\u2192 Read `shared/token-counting.md` \u2014 use `messages.count_tokens`, never `tiktoken`\n\n**Function calling / tool use / agents:**\n\u2192 Read `{lang}/claude-api/README.md` + `shared/tool-use-concepts.md` + `{lang}/claude-api/tool-use.md`\n\n**Agent design (tool surface, context management, caching strategy):**\n\u2192 Read `shared/agent-design.md`\n\n**Batch processing (non-latency-sensitive):**\n\u2192 Read `{lang}/claude-api/README.md` + `{lang}/claude-api/batches.md`\n\n**File uploads across multiple requests:**\n\u2192 Read `{lang}/claude-api/README.md` + `{lang}/claude-api/files-api.md`\n\n**Managed Agents (server-managed stateful agents with workspace):**\n\u2192 Read `shared/managed-agents-overview.md` + the rest of the `shared/managed-agents-*.md` files. For Python, TypeScript, Go, Ruby, PHP, and Java, read `{lang}/managed-agents/README.md` for code examples. For cURL, read `curl/managed-agents.md`. **Agents are persistent \u2014 create once, reference by ID.** Store the agent ID returned by `agents.create` and pass it to every subsequent `sessions.create`; do not call `agents.create` in the request path. The Anthropic CLI (`ant`) is one convenient way to create agents and environments from version-controlled YAML \u2014 see `shared/anthropic-cli.md`. If a binding you need isn't shown in the language README, WebFetch the relevant entry from `shared/live-sources.md` rather than guess. C# has beta Managed Agents support \u2014 see `csharp/claude-api/README.md` for details, or `curl/managed-agents.md` for raw HTTP reference.\n\n### Claude API (Full File Reference)\n\nRead the **language-specific Claude API source** \u2014 `{language}/claude-api/` for every SDK language, `curl/examples.md` for cURL:\n\n1. **`{language}/claude-api/README.md`** \u2014 **Read this first.** Installation, quick start, common patterns, error handling.\n2. **`shared/tool-use-concepts.md`** \u2014 Read when the user needs function calling, code execution, memory, or structured outputs. Covers conceptual foundations.\n3. **`shared/agent-design.md`** \u2014 Read when designing an agent: bash vs. dedicated tools, programmatic tool calling, tool search/skills, context editing vs. compaction vs. memory, caching principles.\n4. **`{language}/claude-api/tool-use.md`** \u2014 Read for language-specific tool use code examples (tool runner, manual loop, code execution, memory, structured outputs).\n5. **`{language}/claude-api/streaming.md`** \u2014 Read when building chat UIs or interfaces that display responses incrementally.\n6. **`{language}/claude-api/batches.md`** \u2014 Read when processing many requests offline (not latency-sensitive). Runs asynchronously at 50% cost.\n7. **`{language}/claude-api/files-api.md`** \u2014 Read when sending the same file across multiple requests without re-uploading.\n8. **`shared/prompt-caching.md`** \u2014 Read when adding or optimizing prompt caching. Covers prefix-stability design, breakpoint placement, and anti-patterns that silently invalidate cache.\n9. **`shared/error-codes.md`** \u2014 Read when debugging HTTP errors or implementing error handling. Includes the per-SDK typed exception class table and the Go `errors.As` pattern.\n10. **`shared/model-migration.md`** \u2014 Read when upgrading to newer models, replacing retired models, or translating `budget_tokens` / prefill patterns to the current API.\n11. **`shared/live-sources.md`** \u2014 WebFetch URLs for fetching the latest official documentation.\n\nNot every language has every file (e.g., Ruby has no `batches.md`); if a file is absent, that feature's example is not yet documented for that language.\n\n> **Note:** For the Managed Agents file reference, see the `## Managed Agents (Beta)` section above \u2014 it lists every `shared/managed-agents-*.md` file and the language-specific READMEs.\n\n---\n\n## When to Use WebFetch\n\nUse WebFetch to get the latest documentation when:\n\n- User asks for \"latest\" or \"current\" information\n- Cached data seems incorrect\n- User asks about features not covered here\n\nLive documentation URLs are in `shared/live-sources.md`.\n\n## Common Pitfalls\n\n- **No `ANTHROPIC_API_KEY` \u2260 no credentials.** Don't bail or ask the user for a key just because the env var is unset \u2014 run `ant auth status` first. After `ant auth login`, a bare `Anthropic()` client and `ant \u2026` work with no env var; for raw curl, use `Authorization: Bearer $(ant auth print-credentials --access-token)` plus header `anthropic-beta: oauth-2025-04-20`. See the Authentication quick reference above and `shared/anthropic-cli.md`.\n- Don't truncate inputs when passing files or content to the API. If the content is too long to fit in the context window, notify the user and discuss options (chunking, summarization, etc.) rather than silently truncating.\n- **Fable 5 / Sonnet 5 / Opus 4.8 / 4.7 thinking:** Adaptive only. `thinking: {type: \"enabled\", budget_tokens: N}` returns 400 \u2014 `budget_tokens` is fully removed (along with `temperature`, `top_p`, `top_k`). Use `thinking: {type: \"adaptive\"}`. Opus 4.8 inherits this surface from 4.7 with no new breaking changes; Fable 5 adds one \u2014 an explicit `thinking: {type: \"disabled\"}` returns a 400 (accepted on Sonnet 5 / 4.7 / 4.8); omit the param instead.\n- **Opus 4.6 / Sonnet 4.6 thinking:** Use `thinking: {type: \"adaptive\"}` \u2014 do NOT use `budget_tokens` for new 4.6 code (deprecated on both Opus 4.6 and Sonnet 4.6; for gradual migration of existing code, see the transitional escape hatch in `shared/model-migration.md` \u2014 note this carve-out does not apply to Fable 5, Opus 4.7 or 4.8). For older models, `budget_tokens` must be less than `max_tokens` (minimum 1024). This will throw an error if you get it wrong.\n- **Prefill removed (Fable 5 and the 4.6/4.7/4.8 family):** Assistant message prefills (last-assistant-turn prefills) return a 400 error on Fable 5, Opus 4.6, Opus 4.7, Opus 4.8, and Sonnet 4.6. Use structured outputs (`output_config.format`) or system prompt instructions to control response format instead. (One exception: the fallback-credit prefill claim \u2014 when redeeming a credit with `fallback_has_prefill_claim: true`, the server accepts the echoed assistant message; see the migration guide's refusal section.)\n- **Fable 5 `refusal` stop reason:** Safety classifiers may decline a request \u2014 a successful HTTP 200 with `stop_reason: \"refusal\"` (pre-output: empty `content`, nothing billed; mid-stream: partial output billed \u2014 discard it). Check `stop_reason` before reading `response.content[0]`, or you'll hit index errors on refused requests. To retry on another model, replay the history as-is \u2014 other models drop the refused model's thinking blocks from the prompt, unbilled; no stripping needed (and a fallback-credit redemption must echo the refused body exactly anyway, thinking blocks included). Fallbacks are **opt-in** \u2014 new `{{FABLE_ID}}` code should include the server-side `fallbacks` parameter by default so a refusal doesn't fail the request outright; see the {{FABLE_NAME}} section above.\n- **Fable 5 tokenizer:** Same tokenizer as Opus 4.8 \u2014 token counts are roughly unchanged when migrating from Opus 4.7/4.8. Coming from Opus 4.6, Sonnet, Haiku, or older, token counts differ (the Opus 4.7 tokenizer uses ~1\xD7\u20131.35\xD7 as many tokens) \u2014 re-measure by calling `count_tokens` once with each model and comparing `input_tokens`.\n- **Confirm migration scope before editing:** When a user asks to migrate code to a newer Claude model without naming a specific file, directory, or file list, **ask which scope to apply first** \u2014 the entire working directory, a specific subdirectory, or a specific set of files. Do not start editing until the user confirms. Imperative phrasings like \"migrate my codebase\", \"move my project to X\", \"upgrade to Sonnet 4.6\", or bare \"migrate to Opus 4.8\" are **still ambiguous** \u2014 they tell you what to do but not where, so ask. Proceed without asking only when the prompt names an exact file, a specific directory, or an explicit file list (\"migrate `app.py`\", \"migrate everything under `services/`\", \"update `a.py` and `b.py`\"). See `shared/model-migration.md` Step 0.\n- **`max_tokens` defaults:** Don't lowball `max_tokens` \u2014 hitting the cap truncates output mid-thought and requires a retry. For non-streaming requests, default to `~16000` (keeps responses under SDK HTTP timeouts). For streaming requests, default to `~64000` (timeouts aren't a concern, so give the model room). Only go lower when you have a hard reason: classification (`~256`), cost caps, deliberately short outputs, or **`max_tokens: 0`** for cache pre-warming (see `shared/prompt-caching.md` \u2192 Pre-warming).\n- **128K output tokens:** Fable 5, Opus 4.6, Opus 4.7, Opus 4.8, Sonnet 5, and Sonnet 4.6 support up to 128K `max_tokens`, but the SDKs require streaming for values that large to avoid HTTP timeouts. Use `.stream()` with `.get_final_message()` / `.finalMessage()`.\n- **Tool call JSON parsing (Fable 5 and the 4.6/4.7/4.8 family):** Fable 5, Opus 4.6, Opus 4.7, Opus 4.8, and Sonnet 4.6 may produce different JSON string escaping in tool call `input` fields (e.g., Unicode or forward-slash escaping). Always parse tool inputs with `json.loads()` / `JSON.parse()` \u2014 never do raw string matching on the serialized input.\n- **Structured outputs (all models):** Use `output_config: {format: {...}}` instead of the deprecated `output_format` parameter on `messages.create()`. This is a general API change, not 4.6-specific.\n- **Don't reimplement SDK functionality:** The SDK provides high-level helpers \u2014 use them instead of building from scratch. Specifically: use `stream.finalMessage()` instead of wrapping `.on()` events in `new Promise()`; use typed exception classes (`Anthropic.RateLimitError`, etc.) instead of string-matching error messages; use SDK types (`Anthropic.MessageParam`, `Anthropic.Tool`, `Anthropic.Message`, etc.) instead of redefining equivalent interfaces.\n- **Error handling \u2014 catch a chain, not one broad class.** A single `except APIStatusError` / `catch (AnthropicServiceException)` / `rescue APIError` loses the distinction between retryable (429, \u2265500, network) and non-retryable (400/404) failures. Write a most-specific-first chain \u2014 e.g. `NotFoundError` \u2192 `RateLimitError` \u2192 `APIStatusError` \u2192 `APIConnectionError` (or the Go equivalent: `errors.As` into `*anthropic.Error` then `switch apierr.StatusCode { case 404: \u2026; case 429: \u2026; default: \u2026 }`). Per-language class names and namespaces are in `shared/error-codes.md`.\n- **Don't research SDK types \u2014 write first.** If a type name isn't shown in the documentation included in this skill, write the code file from the namespace/package tables in the language-specific doc and let the compiler's error point you to the right name. Do not spend turns on WebFetch, SDK-repo clones, or compiling-and-running a separate reflection program to discover type names before writing \u2014 produce the source file first, then fix what the compiler reports. A quick `strings` / `jar tf` / `javap` against the installed SDK is acceptable for locating names (it returns in seconds), but don't escalate beyond that. A file with a wrong type name is recoverable; a session spent on discovery with no file written is not.\n- **Bash and text editor tools are Anthropic-defined, schema-less.** Declare `{\"type\": \"bash_20250124\", \"name\": \"bash\"}` / `{\"type\": \"text_editor_20250728\", \"name\": \"str_replace_based_edit_tool\"}` \u2014 no `input_schema`. A custom tool with your own schema named `\"bash\"` is a different tool. Handler paths and security checks are in `shared/tool-use-concepts.md` \xA7 Client-Side Tools.\n- **Advisor tool model pairing.** The advisor tool's `model` must be at least as capable as the request's top-level `model` \u2014 e.g. executor `claude-sonnet-5` \u2192 advisor `claude-opus-4-8` or `claude-opus-4-7`. An invalid pair returns 400. Pairing table in `shared/tool-use-concepts.md` \xA7 Advisor. Availability: `shared/platform-availability.md`.\n- **Agent Skills \u2260 Managed Agents.** To have Claude generate a `.pptx`/`.xlsx`/etc. via Agent Skills, call `client.beta.messages.create` with `container={\"skills\": [...]}`, the `code_execution_20260521` tool, and both `code-execution-2025-08-25` + `skills-2025-10-02` betas. Do not use `client.beta.agents` / `sessions` / `environments` here \u2014 those are the Managed Agents surface, not Agent Skills.\n- **MCP connector needs both halves.** `mcp_servers=[{type:\"url\", url, name}]` alone is rejected as a validation error \u2014 also add `tools=[{type:\"mcp_toolset\", mcp_server_name:<same name>}]` with beta `mcp-client-2025-11-20`. Availability: `shared/platform-availability.md`.\n- **Context editing \u2260 compaction.** Context editing *clears* tool results and thinking blocks; compaction *summarizes* history. For context editing, use `context_management.edits` with type `clear_tool_uses_20250919` (or `clear_thinking_20251015`) on `client.beta.messages.*` with beta `context-management-2025-06-27` \u2014 not the `compact_20260112` type or `compact-2026-01-12` beta, which are compaction.\n- **`inference_geo` is a direct top-level request parameter** \u2014 `client.messages.create(..., inference_geo=\"us\")` / `.inferenceGeo(\"us\")`. Do not put it in `extra_body` / `putAdditionalBodyProperty`. Supported on Opus 4.6 / Sonnet 4.6 and later; availability: `shared/platform-availability.md`. `response.usage.inference_geo` reports where inference ran.\n- **Fine-grained tool streaming is not a beta feature.** Set `eager_input_streaming: true` on the tool definition and call the regular `client.messages.stream(...)`. There is no beta header and no `client.beta.*` path.\n- **Cache diagnostics is beta.** Use `client.beta.messages.*` with beta `cache-diagnosis-2026-04-07`. Pass `diagnostics: {previous_message_id: null}` on the first turn and `diagnostics: {previous_message_id: <previous response id>}` on subsequent turns; the result is on `response.diagnostics`. Availability: `shared/platform-availability.md`.\n- **Memory tool type is `memory_20250818`.** Declare `{\"type\": \"memory_20250818\", \"name\": \"memory\"}`. Go uses the beta-namespace type `{OfMemoryTool20250818: &anthropic.BetaMemoryTool20250818Param{}}` on `client.Beta.Messages.New`; Python/TypeScript/Ruby/PHP/C# use the non-beta `client.messages.create`; Java has both a non-beta `MemoryTool20250818` and a beta tool-runner path. Python/TypeScript provide `BetaAbstractMemoryTool` / `betaMemoryTool` helpers for implementing the backend.\n- **Use a model the feature actually supports.** Some features are restricted to specific model tiers \u2014 fast mode is Opus 4.8 / 4.7 only, task budgets are Fable 5 / Sonnet 5 / Opus 4.8 / 4.7 only, and the advisor tool requires a valid executor\u2194advisor pair. If the user's prompt names a model that the feature doesn't support, use a supported model instead and note the substitution in the output.\n- **Bedrock / Foundry: use the platform client class.** For Bedrock use the `\u2026BedrockMantle\u2026` client (e.g. Python `AnthropicBedrockMantle`, Java `BedrockMantleBackend`) with `anthropic.`-prefixed model IDs; `AnthropicBedrock`/`BedrockBackend` without `Mantle` is the legacy path. For Foundry use `AnthropicFoundry` / `FoundryBackend` / `AnthropicFoundryClient` where the SDK supports it (C#, Java, PHP, Python, TypeScript); Go and Ruby have no Foundry client \u2014 Ruby's documented fallback is the first-party client with a custom `base_url`. Per-language table above.\n- **Don't define custom types for SDK data structures:** The SDK exports types for all API objects. Use `Anthropic.MessageParam` for messages, `Anthropic.Tool` for tool definitions, `Anthropic.ToolUseBlock` / `Anthropic.ToolResultBlockParam` for tool results, `Anthropic.Message` for responses. Defining your own `interface ChatMessage { role: string; content: unknown }` duplicates what the SDK already provides and loses type safety.\n- **Report and document output:** For tasks that produce reports, documents, or visualizations, the code execution sandbox has `python-docx`, `python-pptx`, `matplotlib`, `pillow`, and `pypdf` pre-installed. Claude can generate formatted files (DOCX, PDF, charts) and return them via the Files API \u2014 consider this for \"report\" or \"document\" type requests instead of plain stdout text.\n- **Server-tool errors don't raise.** Web search and web fetch errors return HTTP 200 with a `web_search_tool_result` / `web_fetch_tool_result` block whose `content` is a single error object (e.g. `{error_code: \"max_uses_exceeded\"}`) \u2014 not a raised exception. For web search, a success `content` is a *list*; an error `content` is an *object* \u2014 branch on that before indexing.\n- **Code execution output block type:** `code_execution_20260521` returns `bash_code_execution_tool_result` (with `.content.stdout`), **not** the legacy bare `code_execution_tool_result`. Iterate `response.content` and match on the correct type.\n- **Tool search: never defer everything.** The search tool itself must not have `defer_loading: true`, and at least one tool in `tools` must be non-deferred, or the API returns 400 `All tools have defer_loading set`.\n- **`strict: true` goes on the tool, not `tool_choice`.** Putting `strict` on `tool_choice` does nothing; it's a sibling of `name`/`description`/`input_schema` on the tool definition itself.\n- **Parallel tool results go in ONE user message.** Splitting `tool_result` blocks across multiple user messages silently trains Claude to stop making parallel calls. One assistant message of `tool_use` blocks \u2192 one user message of `tool_result` blocks.\n- **Citations + structured outputs are incompatible.** Enabling `citations: {enabled: true}` on a document while also setting `output_config.format` returns a 400.\n- **Batch results are unordered.** Match by `custom_id`, never by position in the results stream.\n- **Vertex model IDs have no prefix.** Unlike Bedrock's `anthropic.`-prefixed IDs, Vertex takes the bare first-party ID for current-generation models (e.g. `\"{{OPUS_ID}}\"`); dated-snapshot models use an `@` separator (e.g. `claude-haiku-4-5@20251001`).\n- **`stop_details` is `null` unless `stop_reason == \"refusal\"`.** For `max_tokens`, `end_turn`, etc., `stop_details` is `null` \u2014 guard before reading `.category`.\n- **WIF auth: unset `ANTHROPIC_API_KEY`, `ANTHROPIC_AUTH_TOKEN`, and `ANTHROPIC_PROFILE`.** `ANTHROPIC_API_KEY` and `ANTHROPIC_AUTH_TOKEN` (even set to `\"\"`) outrank Workload Identity Federation in the SDK's precedence chain and silently win; a set `ANTHROPIC_PROFILE` also wins (a missing named profile is an error, not a fall-through). `unset` them, don't blank them.\n",
    SKILL_MODEL_VARS: () => SKILL_MODEL_VARS,
    SKILL_FILES: () => SKILL_FILES_export5
  });
  var SKILL_MODEL_VARS;
  var SKILL_FILES_export5;
  var EFc = {};
  __export(EFc, {
    registerClaudeApiSkill: () => registerClaudeApiSkill,
    processSkillMarkdown: () => processSkillMarkdown,
    matchSubcommand: () => matchSubcommand,
    CLAUDE_API_SKILL_DESCRIPTION: () => CLAUDE_API_SKILL_DESCRIPTION
  });
  function gFc() {
    return Y1f ??= Promise.resolve().then(() => (hFc(), fFc));
  }
  function J1f(e) {
    let t = {};
    for (let [n, r] of Object.entries(e.SKILL_FILES)) {
      t[n] = processSkillMarkdown(r, e.SKILL_MODEL_VARS);
    }
    return t;
  }
  async function Q1f() {
    let e = Nt();
    let t;
    try {
      t = await _Fc.readdir(e);
    } catch {
      return null;
    }
    for (let [n, r] of Object.entries(X1f)) {
      if (r.length === 0) {
        continue;
      }
      for (let o of r) {
        if (o.startsWith(".")) {
          if (t.some(s => s.endsWith(o))) {
            return n;
          }
        } else if (t.includes(o)) {
          return n;
        }
      }
    }
    return null;
  }
  function Z1f(e, t) {
    return Object.keys(t).filter(n => {
      if (n.startsWith(`${e}/`)) {
        return true;
      }
      return n.startsWith("shared/");
    });
  }
  function processSkillMarkdown(e, t) {
    let n = e;
    let r;
    do {
      r = n;
      n = n.replace(/<!--[\s\S]*?-->\n?/g, "");
    } while (n !== r);
    n = n.replace(/\{\{(\w+)\}\}/g, (o, s) => t[s] ?? o);
    return n;
  }
  function bFc(e, t) {
    return processSkillMarkdown(e, t.SKILL_MODEL_VARS);
  }
  function yFc(e, t, n) {
    let r = [];
    for (let o of e.sort()) {
      let s = t[o];
      if (!s) {
        continue;
      }
      r.push(`<doc path="${o}">
${bFc(s, n).trim()}
</doc>`);
    }
    return r.join(`

`);
  }
  function tLf(e, t, n) {
    let r = bFc(n.sLc, n);
    let o = r.indexOf("## Reading Guide");
    let i = [o !== -1 ? r.slice(0, o).trimEnd() : r];
    let a = eLf.replace(/\{lang\}/g, e ?? "unknown");
    if (e) {
      let c = Z1f(e, n.SKILL_FILES);
      i.push(a);
      i.push(`---

## Included Documentation

` + yFc(c, n.SKILL_FILES, n));
    } else {
      i.push(a);
      i.push("No project language was auto-detected. Ask the user which language they are using, then refer to the matching docs below.");
      i.push(`---

## Included Documentation

` + yFc(Object.keys(n.SKILL_FILES), n.SKILL_FILES, n));
    }
    let l = r.indexOf("## When to Use WebFetch");
    if (l !== -1) {
      i.push(r.slice(l).trimEnd());
    }
    if (t) {
      i.push(`## User Request

${t}`);
    }
    return i.join(`

`);
  }
  function matchSubcommand(e) {
    let t = e.trim().toLowerCase().split(/\s+/)[0] ?? "";
    return nLf.find(n => n === t) ?? "none";
  }
  function registerClaudeApiSkill() {
    Qc({
      name: "claude-api",
      menuDescription: "Build and debug apps that use the Claude API",
      description: CLAUDE_API_SKILL_DESCRIPTION,
      allowedTools: ["Read", "Grep", "Glob", "WebFetch"],
      userInvocable: true,
      files: () => gFc().then(J1f),
      async getPromptForCommand(e) {
        let [t, n] = await Promise.all([Q1f(), gFc()]);
        logEvent("tengu_claude_api_skill_loaded", {
          detected_lang: t ?? "none",
          subcommand: matchSubcommand(e),
          has_args: e.trim().length > 0
        });
        return [{
          type: "text",
          text: tLf(t, e, n)
        }];
      }
    });
  }
  var _Fc;
  var Y1f;
  var X1f;
  var eLf = `## Reference Documentation

The relevant documentation for your detected language is included below in \`<doc>\` tags. Each tag has a \`path\` attribute showing its original file path. Use this to find the right section:

### Quick Task Reference

> All SDK languages use the same per-language \`claude-api/\` directory layout (cURL: \`curl/examples.md\`). Not every language has every file \u2014 if a file is absent, that feature's example is not yet documented for that language; fall back to the cURL shape or WebFetch the SDK repo.

**Single text classification/summarization/extraction/Q&A:**
\u2192 Refer to \`{lang}/claude-api/README.md\`

**Chat UI or real-time response display:**
\u2192 Refer to \`{lang}/claude-api/README.md\` + \`{lang}/claude-api/streaming.md\`

**Long-running conversations (may exceed context window):**
\u2192 Refer to \`{lang}/claude-api/README.md\` \u2014 see Compaction section

**Migrating to a newer model or replacing a retired model:**
\u2192 Refer to \`shared/model-migration.md\`

**Prompt caching / optimize caching / "why is my cache hit rate low":**
\u2192 Refer to \`shared/prompt-caching.md\` + \`{lang}/claude-api/README.md\` (Prompt Caching section)

**Count tokens in a file / prompt / diff ("how many tokens is X"):**
\u2192 Refer to \`shared/token-counting.md\` \u2014 use \`messages.count_tokens\`, never \`tiktoken\`

**Function calling / tool use / agents:**
\u2192 Refer to \`{lang}/claude-api/README.md\` + \`shared/tool-use-concepts.md\` + \`{lang}/claude-api/tool-use.md\`

**Batch processing (non-latency-sensitive):**
\u2192 Refer to \`{lang}/claude-api/README.md\` + \`{lang}/claude-api/batches.md\`

**File uploads across multiple requests:**
\u2192 Refer to \`{lang}/claude-api/README.md\` + \`{lang}/claude-api/files-api.md\`

**Agent design (tool surface, context management, caching strategy):**
\u2192 Refer to \`shared/agent-design.md\`

**Anthropic CLI (\`ant\`) \u2014 terminal access, version-controlled agent/environment YAML, scripting:**
\u2192 Refer to \`shared/anthropic-cli.md\`

**Managed Agents (server-managed stateful agents):**
\u2192 Refer to \`shared/managed-agents-overview.md\` and the rest of the \`shared/managed-agents-*.md\` files. For Python, TypeScript, Go, Ruby, PHP, and Java, read the \`managed-agents/README.md\` in the language folder for code examples. For cURL, read \`curl/managed-agents.md\`. C# has beta Managed Agents support \u2014 use \`curl/managed-agents.md\` as the wire-level reference (the C# SDK mirrors it via \`client.Beta.Agents\`; see \`csharp/claude-api/README.md\`).

**Error handling:**
\u2192 Refer to \`shared/error-codes.md\`

**Latest docs via WebFetch:**
\u2192 Refer to \`shared/live-sources.md\` for URLs`;
  var CLAUDE_API_SKILL_DESCRIPTION;
  var nLf;
  var vFc = __lazy(() => {
    Ot();
    vo();
    x_();
    _Fc = require("fs/promises");
    X1f = {
      python: [".py", "requirements.txt", "pyproject.toml", "setup.py", "Pipfile"],
      typescript: [".ts", ".tsx", "tsconfig.json", "package.json"],
      java: [".java", "pom.xml", "build.gradle"],
      go: [".go", "go.mod"],
      ruby: [".rb", "Gemfile"],
      csharp: [".cs", ".csproj"],
      php: [".php", "composer.json"],
      curl: []
    };
    CLAUDE_API_SKILL_DESCRIPTION = ["Reference for the Claude API / Anthropic SDK \u2014 model ids, pricing, params, streaming, tool use, MCP, agents, caching, token counting, model migration.", 'TRIGGER \u2014 read BEFORE opening the target file; don\'t skip because it "looks like a one-liner" \u2014 whenever: the prompt names Claude/Anthropic in any form (Claude, Anthropic, Fable, Opus, Sonnet, Haiku, `anthropic`, `@anthropic-ai`, `claude-*`, `us.anthropic.*`, `[1m]`); the user asks about an LLM (pricing/model choice/limits/caching) \u2014 never answer from memory; OR the task is LLM-shaped with provider unstated (agent/MCP/tool-definition/multi-agent/RAG/LLM-judge/computer-use; generate/summarize/extract/classify/rewrite/converse over NL; debugging refusals/cutoffs/streaming/tool-calls/tokens).', "SKIP only when another provider is being worked on (overrides all triggers): OpenAI/GPT/Gemini/Llama/Mistral/Cohere/Ollama named in the query; OR `grep -rE 'openai|langchain_openai|google.generativeai|genai|mistralai|cohere|ollama'` over the project hits (run this grep FIRST if no provider named \u2014 don't Read the file)."].join(`
`);
    nLf = ["migrate", "managed-agents-onboard"];
  });
  var CFc = `# Live Documentation Sources

WebFetch URLs for fetching current Claude Code documentation. Use these when the bundled references and the live build configuration in your prompt don't answer the question, or when the user asks about behavior, internals, or topics not covered by the live build snapshot.

Mintlify serves both \`.md\` and \`.mdx\` for every page; prefer \`.md\` for clean fetches.

## Start here

| Topic | URL | Extraction prompt |
|---|---|---|
| Page index (all pages + headings) | \`https://code.claude.com/docs/en/claude_code_docs_map.md\` | "Find the page that covers <topic> and return its URL" |
| Changelog | \`https://code.claude.com/docs/en/changelog.md\` | "Extract changes since version <X.Y.Z>" |

## Configuration

| Topic | URL | Extraction prompt |
|---|---|---|
| Settings reference | \`https://code.claude.com/docs/en/settings.md\` | "Extract the settings key, type, scope, and default for <setting>" |
| CLI reference (flags) | \`https://code.claude.com/docs/en/cli-reference.md\` | "Extract the flag, its arguments, and what it does for <flag>" |
| Permissions and rules | \`https://code.claude.com/docs/en/permissions.md\` | "Extract the permission rule syntax and examples for <tool>" |
| Memory (CLAUDE.md) | \`https://code.claude.com/docs/en/memory.md\` | "Extract how to use and structure CLAUDE.md" |
| \`.claude/\` directory layout | \`https://code.claude.com/docs/en/claude-directory.md\` | "Extract what goes where in the .claude directory" |
| Environment variables | \`https://code.claude.com/docs/en/env-vars.md\` | "Extract the environment variable name, type, and effect for <variable>" |

## Extensibility

| Topic | URL | Extraction prompt |
|---|---|---|
| Hooks | \`https://code.claude.com/docs/en/hooks.md\` | "Extract the hook event names, JSON schema, and configuration for <hook event>" |
| Skills | \`https://code.claude.com/docs/en/skills.md\` | "Extract how to create and structure a skill" |
| Subagents | \`https://code.claude.com/docs/en/sub-agents.md\` | "Extract how to define and configure subagents" |
| MCP servers | \`https://code.claude.com/docs/en/mcp.md\` | "Extract how to add, configure, and authenticate MCP servers" |
| Plugins | \`https://code.claude.com/docs/en/plugins.md\` | "Extract how to install and develop plugins" |
| Output styles | \`https://code.claude.com/docs/en/output-styles.md\` | "Extract how to create and apply output styles" |

## Workflows and surfaces

| Topic | URL | Extraction prompt |
|---|---|---|
| Commands reference | \`https://code.claude.com/docs/en/commands.md\` | "Extract the command name, syntax, and description for /<command>" |
| Interactive mode (keybindings) | \`https://code.claude.com/docs/en/interactive-mode.md\` | "Extract the keyboard shortcut for <action>" |
| Common workflows | \`https://code.claude.com/docs/en/common-workflows.md\` | "Extract the workflow steps for <task>" |
| GitHub Actions | \`https://code.claude.com/docs/en/github-actions.md\` | "Extract how to set up Claude Code in GitHub Actions" |
| Claude Code on the web | \`https://code.claude.com/docs/en/claude-code-on-the-web.md\` | "Extract how remote sessions work and what's configurable" |
| VS Code integration | \`https://code.claude.com/docs/en/vs-code.md\` | "Extract how to set up and use the VS Code extension" |
| JetBrains integration | \`https://code.claude.com/docs/en/jetbrains.md\` | "Extract how to set up and use the JetBrains plugin" |

## Deployment and security

| Topic | URL | Extraction prompt |
|---|---|---|
| Amazon Bedrock | \`https://code.claude.com/docs/en/amazon-bedrock.md\` | "Extract setup, auth, and capability differences on Bedrock" |
| Google Vertex AI | \`https://code.claude.com/docs/en/google-vertex-ai.md\` | "Extract setup, auth, and capability differences on Vertex" |
| Microsoft Foundry | \`https://code.claude.com/docs/en/microsoft-foundry.md\` | "Extract setup, auth, and capability differences on Foundry" |
| Sandboxing | \`https://code.claude.com/docs/en/sandboxing.md\` | "Extract how sandboxing works and how to configure it" |
| Security | \`https://code.claude.com/docs/en/security.md\` | "Extract the security model and trust boundaries" |
| Network configuration | \`https://code.claude.com/docs/en/network-config.md\` | "Extract proxy, firewall, and offline configuration" |
| Costs and tracking | \`https://code.claude.com/docs/en/costs.md\` | "Extract how costs are calculated and how to track them" |

## Agent SDK

For building custom agents with the Claude Agent SDK (Python or TypeScript), the docs are part of the Claude API documentation. Fetch \`https://platform.claude.com/llms.txt\` to find the right page, or use the \`/claude-api\` skill which covers the SDK in depth.
`;
  var wFc = () => {};
  var xFc = `# Recently changed surfaces

Your training data may describe Claude Code commands, flags, and terms that have since been renamed or removed. The "Available commands" list in your prompt is the authoritative list for *this build*. Use this file to translate stale terms when the user uses one or you're tempted to recommend one.

If a surface is in your training data but not in this file and not in the live build, it may have been removed since this file was last updated. WebFetch the changelog or the relevant docs page before telling the user it exists.

## Removed slash commands

| Removed | Replacement |
|---|---|
| \`/output-style\` | Open \`/config\` \u2192 Output style. Output styles still exist as a feature; only the dedicated command was removed |
| \`/pr-comments\` | Ask Claude in plain English to view pull request comments |
| \`/vim\` | Open \`/config\` \u2192 Editor mode |
| \`/extra-usage\` | Renamed to \`/usage-credits\`. The feature is unchanged |

## Removed CLI flags

| Removed | Replacement |
|---|---|
| \`--enable-auto-mode\` | \`--permission-mode auto\`. Auto mode is also in the Shift+Tab cycle by default |

## Renamed terms

| Old term | Current term |
|---|---|
| Anthropic API | Claude API |
| Headless mode | Non-interactive mode (\`-p\` / \`--print\` flag). In Agent SDK contexts, just "Agent SDK" |
| Slash command (when referring to \`/config\`, \`/login\`, etc.) | Command |
| Extra usage | Usage credits |
| Custom commands | Skills (\`.claude/skills/\`). Custom commands as \`.claude/commands/*.md\` still work but skills are the documented surface |

## Notes for stale advice

- Output styles are configured via \`/config\`, not \`/output-style\`.
- Auto mode is available via Shift+Tab or \`--permission-mode auto\`. On Bedrock, Vertex, and Foundry, auto mode availability may differ from first-party \u2014 check the provider's docs page.
- WebSearch is unavailable on Bedrock and gateway deployments. Don't tell a Bedrock user to "ask Claude to search the web."
- The \`gh\` CLI is recommended for GitHub operations, not WebFetch on api.github.com.
`;
  var RFc = () => {};
  var AFc = `# Claude Code Configuration Guide

You are answering a question about Claude Code itself: its commands, flags, settings, hooks, skills, MCP servers, subagents, IDE integrations, sandboxing, or any other part of how Claude Code works or is configured.

## Your knowledge of Claude Code is stale by default

Claude Code changes frequently. Commands are added, renamed, and removed. Flags change. Settings keys move. The information in your training data about Claude Code is from a snapshot and may be wrong about what exists *right now*.

Before you tell the user about a slash command, CLI flag, settings key, hook event, or any other Claude Code surface:

1. **Check the live configuration in this prompt first.** The "Current Build" section below is generated from the running binary at the moment you were invoked. It is ground truth. If a slash command isn't in that list, it doesn't exist in this build, no matter what you remember.
2. **Check the bundled references.** \`references/recent-changes.md\` lists features that were renamed or removed since common training cutoffs. \`references/live-sources.md\` maps topics to documentation URLs.
3. **Fetch the documentation if you can.** Use WebFetch with a URL from \`references/live-sources.md\`. If the user is asking about something not in the live config and not in the bundled references, fetch the docs map at \`https://code.claude.com/docs/en/claude_code_docs_map.md\` to find the right page, then fetch that page.
4. **If you cannot reach the network, say so.** Do not silently answer from training data. Say something like: "I can't reach the documentation right now. Based on my training data, [answer], but this may be out of date \u2014 check https://code.claude.com/docs for the current behavior."

When your training data disagrees with the live configuration or the bundled references, the live configuration and bundled references win. When it disagrees with fetched documentation, the documentation wins.

## How to find the answer

| The user is asking about\u2026 | Check |
|---|---|
| A slash command | The "Available commands" list in Current Build below |
| A CLI flag | \`references/live-sources.md\` \u2192 CLI reference URL, or \`claude --help\` |
| A settings key | The "Settings keys configured" list in Current Build below, then the Settings docs |
| A hook event or hook config | \`references/live-sources.md\` \u2192 Hooks URL |
| An MCP server | The "Configured MCP servers" list in Current Build below, then the MCP docs |
| A custom skill or subagent | The "Custom skills/agents" lists in Current Build below |
| A keyboard shortcut | \`references/live-sources.md\` \u2192 Interactive mode URL |
| What changed recently | The "Recent releases" section in Current Build below, then \`references/recent-changes.md\` for removals/renames |
| Anything else about Claude Code | The docs map URL, then the specific page |

## When you can't reach the network

If WebFetch fails or you have no network:
- Answer what you can from the Current Build section and bundled references.
- For anything you're answering from training data, say so explicitly and include the caveat that it may be out of date.
- Direct the user to \`https://code.claude.com/docs\` for the authoritative answer.
- If the feature appears to not exist or you can't find a way to do something, suggest the user run \`/feedback\` to report it (or, if they're on Bedrock, Vertex, or Foundry, point them to https://github.com/anthropics/claude-code/issues).

## Answering style

- Be concrete. Show the exact command, flag, or settings JSON, not a paraphrase.
- Show where the setting goes (\`~/.claude/settings.json\` vs \`.claude/settings.json\` vs \`.mcp.json\` vs \`--flag\`).
- Link to the specific docs page so the user can read more.
- If the user's existing configuration conflicts with what they're trying to do, point that out.
- Proactively mention related features they may not know about, but only when relevant to the question.
`;
  var kFc = () => {};
  var IFc = {};
  __export(IFc, {
    sLc: () => AFc,
    SKILL_FILES: () => SKILL_FILES_export6
  });
  var SKILL_FILES_export6;
  var NFc = {};
  __export(NFc, {
    registerClaudeCodeSkill: () => registerClaudeCodeSkill,
    CLAUDE_CODE_SKILL_NAME: () => "claude-code-docs",
    CLAUDE_CODE_SKILL_DESCRIPTION: () => CLAUDE_CODE_SKILL_DESCRIPTION
  });
  function OFc() {
    return cLf ??= Promise.resolve().then(() => (PFc(), IFc));
  }
  function dLf(e, t) {
    let n = [];
    let o = e.options.commands.filter(m => !m.isHidden);
    let s = m => m.type !== "prompt" || m.source === "builtin" || m.source === "bundled";
    let i = o.filter(s);
    if (i.length > 0) {
      let m = i.map(f => {
        let h = f.aliases?.length ? ` (aliases: ${f.aliases.map(g => `/${g}`).join(", ")})` : "";
        return `- /${f.name}${h}: ${f.description}`;
      }).sort();
      n.push(`**Available commands (${i.length} in this build):**
${m.join(`
`)}`);
    }
    let a = o.filter(m => !s(m));
    if (a.length > 0) {
      let m = a.map(f => `- /${f.name}: ${f.description}`).sort();
      n.push(`**Custom skills configured:**
${m.join(`
`)}`);
    }
    let l = e.options.agentDefinitions.activeAgents.filter(m => m.source !== "built-in");
    if (l.length > 0) {
      let m = l.map(f => `- ${f.agentType}: ${f.whenToUse}`).sort();
      n.push(`**Custom agents configured:**
${m.join(`
`)}`);
    }
    let c = e.options.mcpClients;
    if (c && c.length > 0) {
      let m = c.map(f => `- ${f.name}`).sort();
      n.push(`**Configured MCP servers:**
${m.join(`
`)}`);
    }
    let u = Object.keys(getInitialSettings()).sort();
    if (u.length > 0) {
      n.push(`**Settings keys configured (values omitted):** ${u.join(", ")}. To see values, the user can run \`claude config list\` or open \`~/.claude/settings.json\`.`);
    }
    let d = ii({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, "-");
    let p = Rlr(t).filter(([m]) => Yat(m, d)).slice(-10).reverse();
    if (p.length > 0) {
      let m = p.map(([f, h]) => `### ${f}
` + h.map(g => `- ${g}`).join(`
`));
      n.push(`**Recent releases (you are running v${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}):**
${m.join(`

`)}`);
    }
    if (isUsing3PServices()) {
      n.push("**Provider context:** This session is not using Anthropic's first-party API. WebSearch may be unavailable, `/feedback` is unavailable, and some features behave differently \u2014 check the docs page for the user's specific provider. Direct issues to https://github.com/anthropics/claude-code/issues.");
    }
    return n.join(`

`);
  }
  function pLf(e, t, n, r) {
    let o = [e];
    let s = dLf(n, r);
    if (s) {
      o.push(`---

# Current Build

Generated from the running Claude Code binary at invocation time. This is ground truth \u2014 it overrides your training data and any documentation when they disagree about what exists in this build.

${s}`);
    }
    if (t.trim()) {
      o.push(`---

## User Request

${t}`);
    }
    return o.join(`

`);
  }
  function registerClaudeCodeSkill() {
    Qc({
      name: "claude-code-docs",
      menuDescription: "Answer questions about Claude Code features and settings",
      description: CLAUDE_CODE_SKILL_DESCRIPTION,
      allowedTools: ["Read", "Grep", "Glob", "WebFetch"],
      argumentHint: "[question]",
      userInvocable: true,
      files: () => OFc().then(e => e.SKILL_FILES),
      isEnabled() {
        return getFeatureValue_CACHED_MAY_BE_STALE("tengu_birch_kettle", false);
      },
      async getPromptForCommand(e, t) {
        logEvent("tengu_claude_code_skill_loaded", {
          has_args: e.trim().length > 0
        });
        let [n, {
          sLc: r
        }] = await Promise.all([YZt(), OFc()]);
        return [{
          type: "text",
          text: pLf(r, e, t, n)
        }];
      }
    });
  }
  var cLf;
  var uLf = `Answer questions about Claude Code itself: commands, flags, settings, hooks, skills, MCP servers, subagents, IDE integrations, sandboxing, deployment. Verifies against the running build before recommending any command, flag, or setting.
`;
  var CLAUDE_CODE_SKILL_DESCRIPTION;
  var LFc = __lazy(() => {
    $n();
    Ot();
    no();
    LYe();
    Zn();
    x_();
    CLAUDE_CODE_SKILL_DESCRIPTION = uLf + `TRIGGER when: user asks how Claude Code works ("Can Claude\u2026", "Does Claude\u2026", "How do I\u2026", "Is there a way to\u2026"); user asks about a slash command, CLI flag, settings key, hook, skill, MCP server, subagent, keybinding, or .claude/ directory; user wants to configure, customize, or troubleshoot Claude Code; YOU are about to recommend a Claude Code slash command, flag, or setting and have not verified it exists in this build.
` + "SKIP: questions about building applications with the Claude API or Anthropic SDK (use /claude-api), general programming questions, questions about the user's own codebase.";
  });
  var UFc = `# Example: CLI tool

CLIs are the simplest case \u2014 there's usually no background process to
manage, no ports, no lifecycle. The skill focuses on **installation**,
**representative invocations**, and **testing**.

## What matters

- **How to get the binary on \`PATH\`.** Installed globally? Run via
  \`npx\`/\`uv run\`? Built to \`./target/release/foo\`? Be explicit.
- **Two or three example invocations** that cover the main use cases.
  Include expected output so a reader can tell it worked.
- **Exit codes** if they're meaningful (e.g. linter returns 1 on findings).
- **Stdin behavior** if the tool reads from stdin.

## Example snippet

> ---
> name: run-mytool
> description: Build, install, and run mytool. Use when asked to run mytool, test it, or verify it's installed correctly.
> ---
>
> ## Setup
>
> \`\`\`bash
> pip install -e .
> \`\`\`
>
> This puts \`mytool\` on PATH. Verify:
>
> \`\`\`bash
> mytool --version
> # \u2192 mytool 0.3.1
> \`\`\`
>
> ## Run
>
> Process a single file:
>
> \`\`\`bash
> mytool process input.json
> # \u2192 Processed 42 records, wrote output.json
> \`\`\`
>
> Read from stdin, write to stdout:
>
> \`\`\`bash
> cat input.json | mytool process -
> \`\`\`
>
> Lint a directory (exits non-zero on problems):
>
> \`\`\`bash
> mytool lint ./src
> echo $?  # 0 if clean, 1 if issues found
> \`\`\`
>
> ## Test
>
> \`\`\`bash
> pytest
> \`\`\`

## Keep it short

A CLI's run skill can be very compact. Don't pad it with every flag \u2014
the \`--help\` output covers that. Just show enough that an agent can
(a) build it, (b) confirm it works, (c) run the tests.
`;
  var FFc = () => {};
  var $Fc = `# Example: Electron / desktop GUI app

Electron apps have a window. A future agent in a headless container
can't see a window. So your deliverable here is not a markdown file
that says "\`npm start\` opens a window" \u2014 it's a **driver script** that
launches the app under xvfb, exposes a REPL of commands (click, type,
screenshot), and lets an agent poke the UI by sending lines of text.

The skill's \`SKILL.md\` then becomes a short manual for that driver.

## What you're building

\`\`\`
apps/desktop/
  .claude/skills/run-desktop/
    SKILL.md               \u2190 short. "run the driver, here are the commands"
    driver.mjs             \u2190 REPL: stdin commands \u2192 Playwright actions
\`\`\`

The driver IS the product. Without it, the skill describes a GUI an
agent can never touch.

**Graduation path:** if the driver grows launch helpers the project's
real e2e suite wants to share, move it to \`e2e-playwright/driver.mjs\`
(or \`scripts/drive.mjs\`) and update the skill's paths. The skill stays
at \`.claude/skills/run-desktop/\`; the driver finds a better home.

## Step 1 \u2014 get the app to launch AT ALL under xvfb

This is usually the hardest part and produces most of the Gotchas. The
README will say "macOS/Windows only." Ignore that. Install xvfb + the
Chromium shared libs, find the Electron binary, and launch it:

\`\`\`bash
apt-get install -y xvfb libnss3 libgbm1 libasound2t64 libgtk-3-0 \\
  libxss1 libxkbcommon0 libatk-bridge2.0-0 libcups2 libdrm2

# Build the app first. Often the "dev" script is electron-forge which
# does a Vite/webpack build THEN launches. You want just the build:
npm install
npx electron-forge start &   # builds .vite/build/ or dist/
sleep 20 && kill %1          # kill it once built \u2014 you'll launch yourself

# Now try the raw launch
xvfb-run -a node -e "
  const { _electron } = require('playwright-core');
  _electron.launch({
    executablePath: './node_modules/electron/dist/electron',
    args: ['--no-sandbox', '.'],
    timeout: 30000,
  }).then(app => {
    console.log('launched, windows:', app.windows().map(w => w.url()));
    return app.close();
  });
"
\`\`\`

Iterate until it launches. Each missing \`.so\` \u2192 one more \`apt-get\`
package \u2192 one more line in Prerequisites. Each launch timeout \u2192 check
the \`nodeCliInspect\` fuse isn't disabled, check the build output exists.

**\`--no-sandbox\` is almost always needed in containers.** Electron's
sandbox needs CAP_SYS_ADMIN or user namespaces. Neither by default.

## Step 2 \u2014 build the REPL driver

Once you can launch it, turn that throwaway script into a REPL. Start
minimal \u2014 you will add commands as you need them. **The REPL is the
right shape** because an agent can run it inside tmux and iterate
without relaunching the (slow) app on every interaction.

\`\`\`javascript
// .claude/skills/run-<unit>/driver.mjs
// REPL driver for <app>. Run under xvfb on headless Linux.
// Designed for agents: wrap in tmux, send-keys commands, capture-pane output.
import { _electron as electron } from 'playwright-core';
import * as readline from 'node:readline';
import * as fs from 'node:fs';
import * as path from 'node:path';

const APP_DIR = path.resolve(import.meta.dirname, '../../..');
const SHOT_DIR = process.env.SCREENSHOT_DIR || '/tmp/shots';
fs.mkdirSync(SHOT_DIR, { recursive: true });

let app = null;
let page = null;   // the window/page you actually interact with

const electronBin = process.platform === 'darwin'
  ? path.join(APP_DIR, 'node_modules/electron/dist/Electron.app/Contents/MacOS/Electron')
  : path.join(APP_DIR, 'node_modules/electron/dist/electron');

const COMMANDS = {
  async launch() {
    if (app) return console.log('already launched');
    app = await electron.launch({
      executablePath: electronBin,
      args: ['--no-sandbox', APP_DIR],
      env: { ...process.env, DISPLAY: process.env.DISPLAY || ':99' },
      timeout: 30_000,
    });
    // Electron has no clean "loaded" signal \u2014 this sleep is a blind guess.
    // Replace with a poll once you know what ready looks like for this app:
    // wait until windows() includes the expected URL, or waitForSelector on firstWindow().
    await new Promise(r => setTimeout(r, 8_000));
    // Find the real UI page. Often NOT firstWindow() \u2014 may be a
    // splash screen, or the real content is in a BrowserView overlay.
    page = app.windows().find(w => !w.url().startsWith('devtools://'))
        ?? await app.firstWindow();
    console.log('launched.', app.windows().length, 'windows:');
    for (const w of app.windows()) console.log(' ', w.url());
  },

  async ss(name) {
    if (!page) return console.log('ERROR: launch first');
    const f = path.join(SHOT_DIR, (name || \`ss-\${Date.now()}\`) + '.png');
    await page.screenshot({ path: f });
    console.log('screenshot:', f);
  },

  // Click via evaluate(), NOT locator.click(). If the content lives in a
  // BrowserView layered over the main window, Playwright's coordinate
  // math hits the wrong layer. DOM .click() always works.
  async click(sel) {
    if (!page) return console.log('ERROR: launch first');
    const r = await page.evaluate(s => {
      const el = document.querySelector(s);
      if (!el) return 'NOT_FOUND';
      el.click(); return 'OK';
    }, sel);
    console.log('click', sel, '\u2192', r);
  },

  async 'click-text'(text) {
    if (!page) return console.log('ERROR: launch first');
    const r = await page.evaluate(t => {
      const els = [...document.querySelectorAll('button, a, [role="button"]')];
      const el = els.find(e => e.textContent?.trim() === t)
              ?? els.find(e => e.textContent?.includes(t));
      if (!el) return 'NOT_FOUND';
      el.click(); return 'OK: ' + el.tagName;
    }, text);
    console.log('click-text', JSON.stringify(text), '\u2192', r);
  },

  async type(text)  { if (page) await page.keyboard.type(text, { delay: 30 }); },
  async press(key)  { if (page) await page.keyboard.press(key); },

  async wait(sel) {
    if (!page) return console.log('ERROR: launch first');
    try { await page.waitForSelector(sel, { timeout: 10_000 }); console.log('found:', sel); }
    catch { console.log('TIMEOUT:', sel); }
  },

  async eval(expr) {
    if (!page) return console.log('ERROR: launch first');
    try { console.log(JSON.stringify(await page.evaluate(expr))); }
    catch (e) { console.log('ERROR:', e.message); }
  },

  async text(sel) {
    if (!page) return console.log('ERROR: launch first');
    console.log(await page.evaluate(
      s => (s ? document.querySelector(s) : document.body)?.innerText ?? '(null)',
      sel || null));
  },

  // Introspection: essential for figuring out which window/webContents
  // actually has the UI. Electron apps often spawn several.
  async windows() {
    if (!app) return console.log('ERROR: launch first');
    for (const w of app.windows()) console.log(' ', w.url());
    const wcs = await app.evaluate(({ webContents }) =>
      webContents.getAllWebContents().map(w => ({ id: w.id, type: w.getType(), url: w.getURL() })));
    console.log('webContents:');
    for (const w of wcs) console.log(\` [\${w.id}] \${w.type}: \${w.url}\`);
  },

  async quit() { if (app) await app.close().catch(()=>{}); app = null; page = null; },
  help() { console.log('commands:', Object.keys(COMMANDS).join(', ')); },
};

// Stop Electron from stealing stdin \u2014 use the raw fd.
const stdin = fs.createReadStream(null, { fd: fs.openSync('/dev/stdin', 'r') });
const rl = readline.createInterface({ input: stdin, output: process.stdout, prompt: 'driver> ' });

rl.on('line', async line => {
  const [cmd, ...rest] = line.trim().split(/\\s+/);
  if (!cmd) return rl.prompt();
  const fn = COMMANDS[cmd];
  if (!fn) { console.log('unknown:', cmd, '\u2014 try: help'); return rl.prompt(); }
  try { await fn(rest.join(' ')); } catch (e) { console.log('ERROR:', e.message); }
  if (cmd === 'quit') { rl.close(); process.exit(0); }
  rl.prompt();
});
rl.on('close', async () => { await COMMANDS.quit(); process.exit(0); });

console.log('<app> driver \u2014 "help" for commands, "launch" to start');
rl.prompt();
\`\`\`

**This is a starting skeleton.** As you try to reach interesting parts
of the app you'll add app-specific commands: navigate to a particular
view, focus a weird input type, bypass an auth gate, whatever. Those
commands encode hard-won knowledge \u2014 keep them.

## Step 3 \u2014 use it yourself, via tmux

Run the driver the same way the next agent will:

\`\`\`bash
tmux new-session -d -s app -x 200 -y 50
tmux send-keys -t app 'cd /workspace/apps/desktop && xvfb-run -a node .claude/skills/run-desktop/driver.mjs' Enter
timeout 20 bash -c 'until tmux capture-pane -t app -p | grep -q "driver>"; do sleep 0.2; done'
tmux send-keys -t app 'launch' Enter
timeout 60 bash -c 'until tmux capture-pane -t app -p | grep -q "launched"; do sleep 0.2; done'
tmux send-keys -t app 'ss 01-landing' Enter
timeout 10 bash -c 'until tmux capture-pane -t app -p | grep -q "screenshot:"; do sleep 0.2; done'
tmux send-keys -t app 'windows' Enter    # which page has the real UI?
tmux capture-pane -t app -p
\`\`\`

Then actually open \`/tmp/shots/01-landing.png\`. Is it the app? Is it
blank? Is it a login screen? Each of these tells you what to do next.

Keep going \u2014 click into the main feature, fill a form, see the result
show up, screenshot it. The driver grows whatever commands you need
(\`focus-input\`, \`goto-settings\`, \`login-as-test-user\`\u2026). When one real
flow works end-to-end, you're done building and ready to write.

## Step 4 \u2014 write SKILL.md

Keep it short. The driver is the meat; \`SKILL.md\` is the manual.
Structure that works:

> ---
> name: run-desktop
> description: Build, run, and drive the <app> Electron desktop app. Use when asked to start the desktop app, take a screenshot of it, build it, or interact with its UI.
> ---
>
> <App> is an Electron desktop app. For agent/automated use, drive it
> via the Playwright REPL at \`.claude/skills/run-desktop/driver.mjs\`
> under xvfb. Launch is slow (~10s) and the interesting UI lives in a
> BrowserView, not the main window \u2014 the driver handles both.
>
> All paths are relative to \`apps/desktop/\`.
>
> ## Prerequisites
>
> \`\`\`bash
> apt-get install -y xvfb libnss3 libgbm1 libasound2t64 libgtk-3-0 \\
>   libxss1 libxkbcommon0 libatk-bridge2.0-0 libcups2 libdrm2
> \`\`\`
>
> ## Build
>
> \`\`\`bash
> npm install
> npx electron-forge start   # builds .vite/build/ \u2014 Ctrl-C once built
> # <any patch you had to apply: sed a feature gate, etc.>
> \`\`\`
>
> ## Run (agent path)
>
> \`\`\`bash
> cd apps/desktop
> xvfb-run -a node .claude/skills/run-desktop/driver.mjs
> \`\`\`
>
> Wrap in tmux for interactive use:
>
> \`\`\`bash
> tmux new-session -d -s app -x 200 -y 50
> tmux send-keys -t app 'cd apps/desktop && xvfb-run -a node .claude/skills/run-desktop/driver.mjs' Enter
> timeout 20 bash -c 'until tmux capture-pane -t app -p | grep -q "driver>"; do sleep 0.2; done'
> tmux send-keys -t app 'launch' Enter
> timeout 60 bash -c 'until tmux capture-pane -t app -p | grep -q "launched"; do sleep 0.2; done'
> tmux send-keys -t app 'ss landing' Enter
> tmux capture-pane -t app -p
> \`\`\`
>
> Screenshots land in \`/tmp/shots/\` (override: \`SCREENSHOT_DIR\`).
>
> ### Commands
>
> | command | what it does |
> |---|---|
> | \`launch\` | launch the app, wait for windows |
> | \`ss [name]\` | screenshot \u2192 \`/tmp/shots/<name>.png\` |
> | \`click <css-sel>\` | click element (via DOM, not coords \u2014 see Gotchas) |
> | \`click-text <text>\` | click button/link containing text |
> | \`type <text>\` / \`press <key>\` | keyboard input |
> | \`wait <css-sel>\` | wait for element, 10s timeout |
> | \`eval <js>\` | evaluate in the page, print JSON |
> | \`text [css-sel]\` | print innerText |
> | \`windows\` | list all windows + webContents (find the real UI) |
> | \`quit\` | close app, exit |
>
> Plus any app-specific commands you built: \`<your-command>\` \u2014 <what it does>.
>
> ## Run (human path)
>
> \`\`\`bash
> npm start   # opens a window; useless headless. Ctrl-C to quit.
> \`\`\`
>
> ## Gotchas
>
> - **<the specific weird thing you hit>** \u2014 <why> \u2192 <fix/workaround>
> - <etc. \u2014 only things you actually hit, not generic advice>
>
> ## Troubleshooting
>
> - **Launch timeout (30s):** build output missing? \u2192 re-run the build
>   step. \`nodeCliInspect\` fuse disabled? \u2192 Playwright can't attach;
>   don't disable that fuse in dev builds.
> - **"Missing X server":** forgot \`xvfb-run\`. Headless Linux needs it.
> - **Stale Xvfb locks:** \`rm -f /tmp/.X*-lock; pkill Xvfb\`
> - <anything else you actually hit>

## Obstacles you will hit (and they go in Gotchas)

These are real patterns from real Electron apps. You'll hit some subset:

- **\`firstWindow()\` gives you a splash/loading screen,** not the app.
  Wait longer, or find the right page by URL, or wait for a specific
  selector that only appears when the app is actually ready.

- **The real UI is in a BrowserView, not a BrowserWindow.** Playwright
  sees it as a separate "window" with a different URL. The \`windows\`
  command exists exactly for figuring this out. \`getBrowserViews()\`
  may also return empty on newer Electron \u2014 use
  \`webContents.getAllWebContents()\` instead.

- **\`locator.click()\` clicks the wrong thing.** Playwright computes
  click coordinates relative to the main window. If your content is in
  a BrowserView overlay, those coordinates hit the window behind it.
  The driver skeleton uses \`page.evaluate(el => el.click())\` for this
  reason \u2014 DOM click bypasses coordinates entirely.

- **Feature gates block the thing you need to test.** The app checks a
  plan tier, or an env flag, or a feature flag baked into SSR HTML.
  Find where the check happens (grep the built output for the gate
  name) and patch it for your local run \u2014 a \`sed\` on the build output,
  an env var override, or (for SSR-embedded flags) intercept the
  response via CDP \`Fetch.enable\` and rewrite it in-flight. Document
  exactly what you patched and why.

- **contentEditable inputs** (ProseMirror, Tiptap, Slate) aren't
  \`<textarea>\`. \`fill()\` won't work. Focus the element, then use
  \`keyboard.type()\`. Add a \`focus <sel>\` command if the app has these.

- **Electron steals stdin.** The \`fs.openSync('/dev/stdin', 'r')\` +
  \`createReadStream\` trick in the skeleton protects your REPL's input.

- **Native modules fail to load** (keychain, notifications, etc.).
  Usually non-fatal \u2014 the core app runs, those features no-op. Note it
  and move on.
`;
  var BFc = () => {};
  var jFc = `# Example: Library / SDK

Libraries don't have a "run" step in the process sense \u2014 there's no
server to start, no CLI to invoke. For libraries, the run skill is about:

1. **Building** the library from source
2. **Running the test suite**
3. **A minimal working example** that exercises the library and proves
   it's installed correctly

Keep it brief. The template's Build and Test sections do most of the work.

## The smoke-test example

The main library-specific addition is a tiny program (or REPL snippet)
that imports the library and does one real thing. This is how an agent
confirms "yes, the library is usable":

> ## Verify
>
> \`\`\`bash
> python -c '
> from mylib import Client
> c = Client()
> print(c.ping())
> '
> # \u2192 pong
> \`\`\`

Or for a compiled language:

> \`\`\`bash
> cat > /tmp/smoke.go <<GO
> package main
> import "example.com/mylib"
> func main() { println(mylib.Version()) }
> GO
> go run /tmp/smoke.go
> # \u2192 v1.2.3
> \`\`\`

## Example snippet

> ---
> name: run-mylib
> description: Build, install, and test mylib from source. Use when asked to verify mylib works, run its tests, or build a distribution.
> ---
>
> \`mylib\` is a Python library \u2014 "running" it means building from source
> and executing the test suite.
>
> ## Setup
>
> \`\`\`bash
> pip install -e '.[dev]'
> \`\`\`
>
> ## Verify
>
> \`\`\`bash
> python -c 'import mylib; print(mylib.__version__)'
> # \u2192 2.1.0
> \`\`\`
>
> ## Test
>
> \`\`\`bash
> pytest
> \`\`\`
>
> Subset of tests: \`pytest tests/unit/\`. With coverage: \`pytest --cov=mylib\`.
>
> ## Build (distribution)
>
> \`\`\`bash
> pip install build
> python -m build
> # \u2192 dist/mylib-2.1.0-py3-none-any.whl
> \`\`\`

## Things to consider documenting

- **Development mode vs installed mode.** \`pip install -e .\` vs
  \`pip install .\` \u2014 if behavior differs, say which to use for what.
- **Optional dependencies.** \`[dev]\`, \`[test]\`, \`[docs]\` extras and when
  each is needed.
- **Generated code.** If there's a codegen step (protobuf, OpenAPI clients),
  document it \u2014 it's almost always missing from READMEs.
`;
  var HFc = () => {};
  var WFc = `# Example: Browser-driven web app

You have a dev server that serves HTML to a browser. An agent in a
headless container can't open a browser window \u2014 so "run the app" means
launching the dev server, driving a headless Chromium against it, and
producing a screenshot that proves the page rendered.

Don't write a browser driver. Use \`chromium-cli\`.

## Dev server

Find the dev command (\`package.json\` \`scripts.dev\`, \`Makefile\`,
README), start it in the background, and wait for it to actually serve:

\`\`\`bash
npm run dev &   # or yarn dev, pnpm dev, make serve, ./dev.sh
echo $! > /tmp/dev.pid
timeout 30 bash -c 'until curl -sf http://localhost:3000 >/dev/null; do sleep 1; done'
\`\`\`

Don't \`sleep 5\` \u2014 poll the port. Stop with
\`kill $(cat /tmp/dev.pid)\` (or \`pkill -f 'npm run dev'\`) before
relaunching, or the next run hits \`EADDRINUSE\`.

## Drive

\`chromium-cli\` is a headless-Chromium REPL. Pipe a script to stdin:

\`\`\`bash
chromium-cli --session app <<'EOF'
nav http://localhost:3000
wait-for text=Dashboard
screenshot
click button:has-text("New item")
fill input[name="title"] Smoke test
press Enter
wait-for text=Smoke test
screenshot
console --errors
EOF
\`\`\`

Screenshots land in \`chromium_cli/sessions/app/screenshots/\` (latest
symlinked as \`screenshot.png\`). That's the whole loop: \`nav\` \u2192
\`wait-for\` the element you need \u2192 act (\`click\` / \`fill\` / \`type\` /
\`press\`) \u2192 \`screenshot\` \u2192 \`console --errors\` to check nothing threw.
Full command reference: \`chromium-cli\` skill, or \`help\` at the prompt.

For iterative debugging, run it under tmux and \`send-keys\` one command
at a time \u2014 same commands, same session.

**If \`chromium-cli\` isn't available:** adapt
[electron.md](electron.md)'s REPL driver \u2014 the structure and commands
transfer, but it's \`_electron\`-specific:
import \`{ chromium }\` instead, launch with
\`chromium.launch({ args: ['--no-sandbox'] })\`, acquire the page via
\`(await app.newContext()).newPage()\` then \`goto()\` your dev URL, and
drop the Electron-only window introspection
(\`.windows()\`/\`.firstWindow()\`/the \`windows\` command).

## What to put in the skill

The project-specific bits only. \`chromium-cli\` handles the mechanics.

- **Dev command + port + stop.** The exact start line, any env vars it
  needs, and the \`kill\`/\`pkill\` to stop it.
- **Auth.** Whatever gets a logged-in session \u2014 a \`set-cookie\` line, a
  \`fill\`/\`click\` login sequence, or a helper script that does the API
  dance and emits the cookie.
- **One representative interaction.** Not the whole app \u2014 one path that
  proves it's running, ending in a screenshot.
- **App-specific gotchas.** Only the ones you actually hit.

## Gotchas that recur

- **React controlled inputs.** \`eval el.value = '\u2026'\` doesn't fire
  React's onChange. Use \`fill\` / \`type\` \u2014 they go through Playwright's
  input pipeline.
- **Websockets / long-poll.** \`wait-idle\` never settles. \`wait-for\` the
  element you actually need.
- **Slow first paint.** Vite/Next compile routes on demand; the first
  \`nav\` can take 10s+. \`wait-for\` handles it; raw \`sleep\` doesn't.
- **\`screenshot-element <sel>\`** crops to one element \u2014 use it when the
  diff is in a specific component, not the whole page.
- **Check \`console --errors\` before declaring success.** A page can
  render its shell while every data fetch 500s.
`;
  var qFc = () => {};
  var VFc = `# Example: Web server / API

The distinguishing concern for servers is **lifecycle**: an agent needs to
start the server in the background, verify it's up, interact with it, then
cleanly shut it down. A foreground \`npm start\` that blocks the shell is
useless to an agent.

## Structure to follow

A good server run skill has:

1. **Prerequisites & setup** \u2014 same as any project.
2. **Run** \u2014 the background-launch pattern (below), not a blocking command.
3. **Verify** \u2014 a \`curl\` or similar that confirms the server is actually up.
4. **Stop** \u2014 how to cleanly terminate the background process.

If the background-launch + readiness-poll + smoke-curl sequence is more
than a couple of lines, put it in a \`smoke.sh\` inside the skill directory
and have \`SKILL.md\` say "run the smoke script." One command, exit code
tells you if the server is healthy.

## Background-launch pattern

Don't write:

> \`\`\`bash
> npm start
> \`\`\`

That blocks. Instead, show how to launch in the background, wait for
readiness, and find the PID later:

> \`\`\`bash
> npm start &> /tmp/server.log &
> SERVER_PID=$!
>
> # Wait for the server to come up (adjust timeout/port as needed)
> for i in {1..30}; do
>   curl -sf http://localhost:3000/health > /dev/null && break
>   sleep 1
> done
> \`\`\`

Then the verification step:

> \`\`\`bash
> curl http://localhost:3000/health
> # \u2192 {"status":"ok"}
> \`\`\`

And stopping:

> \`\`\`bash
> kill $SERVER_PID
> # or, if you've lost the PID:
> pkill -f "node.*server.js"
> \`\`\`

## Details worth documenting

- **Which port.** Make it explicit and say how to override it (\`PORT=4000 npm start\`).
- **What "ready" looks like.** A specific log line or a health endpoint to hit.
- **Required env vars.** Database URL, API keys, etc. \u2014 with a template \`.env\`
  if the list is long.
- **Hot reload vs production mode.** If they differ meaningfully, say which
  to use and when.
- **Dependent services.** If the server needs Redis/Postgres/etc., either
  point at a docker-compose that brings them up, or include the \`docker run\`
  command directly.

## Example snippet

Here's what a Run section for a typical Node API might look like:

> ## Run
>
> Start the dev server in the background:
>
> \`\`\`bash
> npm run dev &> /tmp/api.log &
> \`\`\`
>
> The server listens on port 3000. Wait for it to be ready, then verify:
>
> \`\`\`bash
> for i in {1..20}; do
>   curl -sf http://localhost:3000/health && break
>   sleep 0.5
> done
> curl http://localhost:3000/health
> # \u2192 {"status":"ok","version":"1.2.3"}
> \`\`\`
>
> Logs are at \`/tmp/api.log\`. Stop with:
>
> \`\`\`bash
> pkill -f "tsx watch src/index.ts"
> \`\`\`
>
> ### Environment
>
> | Variable | Required | Default | Notes |
> |---|---|---|---|
> | \`DATABASE_URL\` | Yes | \u2014 | Postgres connection string |
> | \`PORT\` | No | \`3000\` | |
> | \`LOG_LEVEL\` | No | \`info\` | \`debug\` / \`info\` / \`warn\` / \`error\` |
`;
  var GFc = () => {};
  var KFc = `# Example: TUI / interactive terminal app

Interactive terminal apps (text editors, REPLs, curses-based UIs) can't
be driven directly by an agent's bash tool \u2014 they take over the terminal.
The skill must show how to wrap them in \`tmux\` so the agent can send
input, capture output, and take screenshots.

## The tmux pattern

This is the standard approach:

1. Start the TUI inside a detached tmux session
2. Send keystrokes with \`tmux send-keys\`
3. Read screen contents with \`tmux capture-pane\`
4. Clean up with \`tmux kill-session\`

The skill's \`SKILL.md\` should present this as the primary way to drive
the app. A small \`driver.sh\` that wraps the launch+attach sequence can
live in the skill directory, but for most TUIs the raw tmux commands in
the skill body are enough.

## Example snippet

> ## Run (interactive, for agents)
>
> Start the TUI inside tmux:
>
> \`\`\`bash
> tmux new-session -d -s app -x 120 -y 40 './myapp'
> \`\`\`
>
> Poll until the ready marker appears (faster + more reliable than a fixed sleep \u2014
> returns the instant the app is up, fails loudly if it isn't):
>
> \`\`\`bash
> timeout 10 bash -c 'until tmux capture-pane -t app -p | grep -q "Ready"; do sleep 0.2; done'
> tmux capture-pane -t app -p
> \`\`\`
>
> Send input (this example navigates to the Settings screen and toggles
> an option):
>
> \`\`\`bash
> tmux send-keys -t app 's'
> timeout 5 bash -c 'until tmux capture-pane -t app -p | grep -q "Settings"; do sleep 0.2; done'
> tmux send-keys -t app 'Down' 'Down' 'Space'  # navigate + toggle
> timeout 5 bash -c 'until tmux capture-pane -t app -p | grep -qF "[x]"; do sleep 0.2; done'
> tmux capture-pane -t app -p
> \`\`\`
>
> If you find yourself writing more than a couple of these poll lines, pull
> them into a \`wait_for()\` helper in a \`driver.sh\` next to the skill.
>
> Quit:
>
> \`\`\`bash
> tmux send-keys -t app 'q'
> tmux kill-session -t app 2>/dev/null || true
> \`\`\`
>
> ### Key reference
>
> | Key | Action |
> |---|---|
> | \`j\` / \`k\` or \`Down\` / \`Up\` | Navigate list |
> | \`Enter\` | Select |
> | \`s\` | Settings |
> | \`q\` | Quit |

## Details worth documenting

- **Terminal size.** Some TUIs break or hide content at small widths.
  Specify a known-good size in the \`tmux new-session -x -y\` args.
- **Startup time.** Poll for a ready marker (\`until tmux capture-pane | grep -q X\`)
  rather than a fixed \`sleep N\` \u2014 returns the instant the app is up, and fails
  usefully when it never does. Say what string means ready.
- **Keybinding reference.** A table of the main keys. This is the "API"
  of a TUI \u2014 an agent needs it to drive the app.
- **Exit cleanly.** Show the quit keystroke *and* \`tmux kill-session\` as
  a fallback.
- **Color/unicode quirks.** If \`capture-pane\` output is hard to read,
  note flags that help (\`-e\` for escape sequences, \`-J\` to join wrapped
  lines).

## Also document the direct invocation

For a human running the app interactively, tmux is overkill. Include
the one-liner too:

> ## Run (direct, for humans)
>
> \`\`\`bash
> ./myapp
> \`\`\`
>
> Press \`q\` to quit.
`;
  var zFc = () => {};
  var JFc = `---
name: run
description: Launch and drive this project's app to see a change working. Use when asked to run, start, or screenshot the app, or to confirm a change works in the real app (not just tests). First looks for a project skill that already covers launching the app; otherwise falls back to built-in patterns per project type (CLI, server, TUI, Electron, browser-driven, library).
---

**Running means launching the actual app and interacting with it** \u2014
not the test suite, not an \`import\` of an internal function and a
\`console.log\`. The app as a user (human or programmatic) would meet
it: the CLI at its command, the server at its socket, the GUI at its
window.

## First: does a project skill already cover this?

A project skill that launches this app is the repo's verified path \u2014
its author already cold-started from a Linux container and committed
what worked: the exact \`apt-get\` line, the env vars, the patches, the
driver. Use it instead of rediscovering.

\`\`\`bash
d=$PWD; while :; do
  grep -Hm1 '^description:' "$d"/.claude/skills/*/SKILL.md 2>/dev/null
  [ -e "$d/.git" ] || [ "$d" = / ] && break
  d=$(dirname "$d")
done
\`\`\`

- **One describes launching/driving this app** \u2192 read that SKILL.md
  and follow it verbatim. Don't paraphrase; don't skip the patches.
- **Mega-repo, several plausible, no clear match** \u2192 ask the user
  which unit to run.
- **Stale** (fails on mechanics unrelated to your task) \u2192 tell the
  user; offer to refresh it via \`/run-skill-generator\`.
- **Nothing about running** \u2192 fall back to the patterns below.

## Otherwise: match the shape, use the pattern

Pick the row closest to your project. Each example walks through
launch + first interaction; ignore any trailing "write the skill"
section \u2014 you're using the recipe, not authoring one.

| Project type | Handle | Example |
|---|---|---|
| CLI tool | direct invocation, exit code, stdin/stdout | [examples/cli.md](examples/cli.md) |
| Web server / API | background launch + \`curl\` smoke | [examples/server.md](examples/server.md) |
| TUI / interactive terminal | tmux \`send-keys\` / \`capture-pane\` | [examples/tui.md](examples/tui.md) |
| Electron / desktop GUI | Playwright \`_electron\` REPL under xvfb | [examples/electron.md](examples/electron.md) |
| Browser-driven | dev server + \`chromium-cli\` script | [examples/playwright.md](examples/playwright.md) |
| Library / SDK | import-and-call smoke script at the package boundary | [examples/library.md](examples/library.md) |

If nothing fits, start from the closest match and adapt. For a web
app, [examples/playwright.md](examples/playwright.md) \u2014 drive it with
\`chromium-cli\`, no custom driver needed. For a desktop app,
[examples/electron.md](examples/electron.md) \u2014 it has the \`_electron\`
REPL driver skeleton and the tmux wrapping.

## Drive it, don't just launch it

Launching with no interaction proves the entrypoint resolves. That's
not running the app \u2014 it's typechecking with extra steps. Drive it to
a point where a user would see something:

- CLI \u2192 type a representative command, check the exit code and output.
- Server \u2192 hit the route the diff touches with \`curl\`, read the body.
- TUI \u2192 \`send-keys\` a navigation, \`capture-pane\` the result.
- GUI \u2192 click the button, screenshot the window. **Look at the
  screenshot.** A blank frame is a failure to launch.

If the fallback pattern didn't work out of the box \u2014 you had to
install packages, set env vars, patch config, or write a driver \u2014
recommend \`/run-skill-generator\` in your report so that work gets
captured as a project skill. If it just worked, don't.
`;
  var YFc = () => {};
  var kZo = {};