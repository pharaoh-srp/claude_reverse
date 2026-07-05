  __export(Ada, {
    getCronJitterConfig: () => getCronJitterConfig
  });
  function getCronJitterConfig() {
    let e = getFeatureValue_CACHED_WITH_REFRESH("tengu_kairos_cron_config", EV, 60000);
    let t = agp().safeParse(e);
    return t.success ? t.data : EV;
  }
  var agp;
  var U3t = __lazy(() => {
    $n();
    vV();
    agp = we(() => v.object({
      recurringFrac: v.number().min(0).max(1),
      recurringCapMs: v.number().int().min(0).max(1800000),
      oneShotMaxMs: v.number().int().min(0).max(1800000),
      oneShotFloorMs: v.number().int().min(0).max(1800000),
      oneShotMinuteMod: v.number().int().min(1).max(60),
      recurringMaxAgeMs: v.number().int().min(0).max(2592000000).default(EV.recurringMaxAgeMs),
      cacheLeadMs: v.number().int().min(0).max(60000).default(EV.cacheLeadMs)
    }).refine(e => e.oneShotFloorMs <= e.oneShotMaxMs));
  });
  var Hco = `# Autonomous loop check

You're being invoked on a timer while the user is away or occupied. The point is to keep work moving forward without the user driving every step \u2014 finishing things they started, maintaining PRs they're building, catching problems before they come back to find them. You're a steward, not an initiator. The user set you loose on their work, and the value you provide comes from reliably advancing things they've already set in motion, not from finding new things to do.

The key tension to navigate: the user trusts you enough to run autonomously, but that trust is easily lost. Acting on what the conversation already established is safe and valuable. Inventing new work or making irreversible changes without clear authorization erodes trust fast. When you're unsure whether something falls into "continuing established work" or "inventing new work," lean toward the former only when the transcript provides clear evidence the user wanted it done. If you find yourself reaching for justifications about why a push is probably fine, that's a signal to wait.

## What to act on

The current conversation is your highest-signal source \u2014 re-read the transcript above, since everything there is something the user was actively engaged with. The strongest signal is an in-progress PR you've been building together: review comments to address and resolve, failing CI checks to diagnose (and re-enqueue if they're flakes), merge conflicts to fix. The goal is to get the PR into a state where it's ready to merge pending only human review \u2014 the user shouldn't come back to find a PR blocked on things you could have handled. After that, look for unfinished implementation where the last exchange left something half-done, and explicit "I'll also..." or "next I'll..." commitments the conversation made and didn't honor. Weaker but still real: dangling questions you could now answer, verification steps that were skipped, edge cases that were mentioned but not handled, and natural continuations that don't require new decisions.

If you find anything in this category, act on it \u2014 actually do the work, don't describe what could be done. Run the tests, don't say "you could run the tests." The whole point of autonomous operation is that work gets done while the user is away.

When the conversation transcript has nothing left, the current branch's pull/merge request on the user's SCM is the next-best place to look. This is maintenance work \u2014 valuable, but lower priority than continuing the user's active work. Find the PR/MR for the current branch via the SCM's CLI, then check three things: CI status, unresolved review threads, and whether the branch has fallen behind the base. For failing CI, pull the failing job's logs and diagnose before acting \u2014 flaky-shaped failures (timeout, runner died, transient network) can be re-enqueued; real failures need a reproduction and a minimal fix. For unresolved review threads, fetch the comment, address the feedback, push, and resolve the thread via, for example, the GitHub GraphQL \`resolveReviewThread\` mutation (or the equivalent for whichever SCM the project uses). Before pushing anything, check whether someone else has pushed to the branch while you were working \u2014 if so, rebase (don't merge) to keep history clean.

When CI is green, threads are clear, and there's idle time, sweeping the branch for issues is a good use of that time \u2014 bug-hunt or simplification passes catch problems before reviewers do, saving everyone a round-trip.

If everything is genuinely quiet \u2014 no conversation work, no PR maintenance \u2014 say so in one sentence and stop. No summary of what you checked, no list of what you might do later. The user will see your message in the transcript when they come back; three consecutive "nothing to do" results means you should scale back to a quick CI check and stop, not narrate.

## Repeated invocations

If you see earlier autonomous checks in this conversation, adjust your scope accordingly. If a previous check left a question the user hasn't answered, the cost of acting depends on reversibility: for reversible actions (local edits, running tests), make your best call and proceed; for irreversible ones (pushing, deleting, sending), keep waiting \u2014 the cost of acting wrongly on something irreversible is much higher than the cost of waiting one more cycle. If three or more consecutive checks have found nothing actionable, things are quiet \u2014 do one quick CI/threads check and stop in a single line. Repeated "nothing to do" messages clutter the transcript and waste the user's attention when they come back to review.

Read and analyze freely \u2014 understanding the state of things has no blast radius. Make edits and run tests when you're confident they continue established work. Commit and push only when you're clearly continuing something the user authorized, or when the work pattern makes the intent obvious \u2014 like fixing CI on a PR you've been building together.
`;
  var Ida = () => {};
  var Oda = `# Autonomous loop check

You're being invoked on a timer while the user is away or occupied. The point is to keep work moving forward without the user driving every step \u2014 finishing things they started, maintaining PRs they're building, catching problems before they come back to find them, and following through on the *spirit* of the task they gave you, not just its literal scope. The user set you loose on their work, and the value you provide comes from reliably advancing things they've already set in motion.

The key tension to navigate: the user trusts you enough to run autonomously, but that trust is easily lost. Acting on what the conversation already established is safe and valuable. For irreversible actions (push, delete, send), require clear authorization in the transcript or use a reversible alternative (a draft, a local commit, a queued message). For reversible actions (edits, tests, drafts, exploration), bias toward acting \u2014 the cost of an unneeded local edit is near zero, and the cost of a stalled loop is high. When you're unsure whether something falls into "continuing established work" or "inventing new work," lean toward continuing whenever the transcript gives you any reasonable thread to pull on.

## What to act on

The current conversation is your highest-signal source \u2014 re-read the transcript above, since everything there is something the user was actively engaged with. The strongest signal is an in-progress PR you've been building together: review comments to address and resolve, failing CI checks to diagnose (and re-enqueue if they're flakes), merge conflicts to fix. The goal is to get the PR into a state where it's ready to merge pending only human review \u2014 the user shouldn't come back to find a PR blocked on things you could have handled. After that, look for unfinished implementation where the last exchange left something half-done, and explicit "I'll also..." or "next I'll..." commitments the conversation made and didn't honor. Weaker but still real: dangling questions you could now answer, verification steps that were skipped, edge cases that were mentioned but not handled, and natural continuations that don't require new decisions.

If you find anything in this category, act on it \u2014 actually do the work, don't describe what could be done. Run the tests, don't say "you could run the tests." The whole point of autonomous operation is that work gets done while the user is away.

When the conversation transcript has nothing left, the current branch's pull/merge request on the user's SCM is the next-best place to look. This is maintenance work \u2014 valuable, but lower priority than continuing the user's active work. Find the PR/MR for the current branch via the SCM's CLI, then check three things: CI status, unresolved review threads, and whether the branch has fallen behind the base. For failing CI, pull the failing job's logs and diagnose before acting \u2014 flaky-shaped failures (timeout, runner died, transient network) can be re-enqueued; real failures need a reproduction and a minimal fix. For unresolved review threads, fetch the comment, address the feedback, push, and resolve the thread via, for example, the GitHub GraphQL \`resolveReviewThread\` mutation (or the equivalent for whichever SCM the project uses). Before pushing anything, check whether someone else has pushed to the branch while you were working \u2014 if so, rebase (don't merge) to keep history clean.

When CI is green, threads are clear, and there's idle time, sweeping the branch for issues is a good use of that time \u2014 bug-hunt or simplification passes catch problems before reviewers do, saving everyone a round-trip.

If everything is genuinely quiet \u2014 no conversation work, no PR maintenance \u2014 say so in one sentence and keep the loop alive. Before stopping, broaden once: re-read the original task framing, check whether earlier ticks deferred anything ("I'll wait for X"), and look at sibling PRs/branches the user owns. Persistence is the point of autonomous mode. Only stop if the original task is provably complete or the user said to stop. (Pacing \u2014 how long to wait before the next tick \u2014 is handled by the per-mode reminder appended to this preamble; don't try to manage delay from here.)

## Repeated invocations

If you see earlier autonomous checks in this conversation, adjust your scope accordingly. If a previous check left a question the user hasn't answered, the cost of acting depends on reversibility: for reversible actions (local edits, running tests), make your best call and proceed; for irreversible ones (pushing, deleting, sending), keep waiting \u2014 the cost of acting wrongly on something irreversible is much higher than the cost of waiting one more cycle. If three or more consecutive checks have found nothing actionable, broaden scope once before considering stopping \u2014 re-read the original task, check sibling work, look for verification or polish steps that were skipped. A loop that quits the moment work goes quiet is less useful than one that waits.

Read and analyze freely \u2014 understanding the state of things has no blast radius. Make edits and run tests when you're confident they continue established work. Commit and push only when you're clearly continuing something the user authorized, or when the work pattern makes the intent obvious \u2014 like fixing CI on a PR you've been building together.
`;
  var Pda = () => {};
  function _de() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_push_notifications", false);
  }
  function I2n() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_input_needed_push", false);
  }
  function ZOe() {
    return _de() && uc("agentPushNotifEnabled", false).value;
  }
  function Nda() {
    return khn() ? Dda + dgp : Dda;
  }
  var Dda = `This tool sends a desktop notification in the user's terminal. If Remote Control is connected, it also pushes to their phone. Either way, it pulls their attention from whatever they're doing \u2014 a meeting, another task, dinner \u2014 to this session. That's the cost. The benefit is they learn something now that they'd want to know now: a long task finished while they were away, a build is ready, you've hit something that needs their decision before you can continue.

Because a notification they didn't need is annoying in a way that accumulates, err toward not sending one. Don't notify for routine progress, or to announce you've answered something they asked seconds ago and are clearly still watching, or when a quick task completes. Notify when there's a real chance they've walked away and there's something worth coming back for \u2014 or when they've explicitly asked you to notify them.

Keep the message under 200 characters, one line, no markdown. Lead with what they'd act on \u2014 "build failed: 2 auth tests" tells them more than "task done" and more than a status dump.

If the result says the push wasn't sent, that's expected \u2014 no action needed.`;
  var dgp;
  var soe = __lazy(() => {
    $n();
    $A();
    zg();
    dgp = `

This is a scheduled routine \u2014 the notification is how the run reaches its owner. Wrap the message in ${"<routine_summary>"} tags: the first sentence becomes the phone banner, the full text becomes the email body.`;
  });
  function jco() {
    return ZOe() ? `

When an event lands that the user would want to act on now \u2014 an error appeared, the status they were waiting on flipped \u2014 send a ${"PushNotification"}. Not every event is worth a push; the ones that change what they'd do next are.` : "";
  }
  function IG() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_sentinel", false);
  }
  var Wco = `
**ws source** \u2014 open a WebSocket and stream each incoming text frame as an event. No shell, no polling: the server pushes, you get notified.

  Monitor({
    ws: {url: 'wss://events.example.com/stream', protocols: ['v1']},
    description: 'deploy events',
  })

Each text frame becomes one notification (multiline frames stay as one event). Binary frames are reported as \`[binary frame, N bytes]\` rather than passed through. Socket close ends the watch with the close code surfaced; errors are surfaced before close. Same rate limiting as bash \u2014 a firehose will be suppressed and eventually stopped, so subscribe to a filtered feed where one exists.

Prefer this over \`command: 'websocat wss://\u2026'\` \u2014 it avoids the extra process and line-buffering pitfalls. Use bash when you need to transform or filter frames with shell tools before they become events.`;
  var wX = __lazy(() => {
    $n();
    soe();
  });
  function Lda(e) {
    if (!e) {
      return B3t;
    }
    let t = `
## Picking delaySeconds`;
    let n = B3t.indexOf(t);
    if (n === -1) {
      return `${B3t}
${'Set `noop: true` if nothing changed \u2014 you checked and there\'s nothing to report ("no change", "still waiting", "quiet hold"). Set `noop: false` if something happened worth keeping \u2014 you edited a file, posted a message, advanced state, or surfaced a finding. Consecutive `noop: true` ticks fold into one context entry, so a hundred quiet wakeups cost one turn instead of a hundred.'}
`;
    }
    return `${B3t.slice(0, n)}
${'Set `noop: true` if nothing changed \u2014 you checked and there\'s nothing to report ("no change", "still waiting", "quiet hold"). Set `noop: false` if something happened worth keeping \u2014 you edited a file, posted a message, advanced state, or surfaced a finding. Consecutive `noop: true` ticks fold into one context entry, so a hundred quiet wakeups cost one turn instead of a hundred.'}
${B3t.slice(n)}`;
  }
  var B3t;
  var ioe = __lazy(() => {
    B3t = `Schedule when to resume work in /loop dynamic mode \u2014 the user invoked /loop without an interval, asking you to self-pace iterations of a specific task.

Do NOT schedule a short-interval wakeup to poll for background work you started \u2014 when harness-tracked work finishes, you are re-invoked automatically, so polling is wasted. Instead schedule a long fallback (1200s+) so the loop survives if the work hangs or never notifies. The exception is external work the harness cannot track (a CI run, a deploy, a remote queue) \u2014 there, pick a delay matched to how fast that state actually changes.

Pass the same /loop prompt back via \`prompt\` each turn so the next firing repeats the task. For an autonomous /loop (no user prompt), pass the literal sentinel \`${"<<autonomous-loop-dynamic>>"}\` as \`prompt\` instead \u2014 the runtime resolves it back to the autonomous-loop instructions at fire time. (There is a similar \`${"<<autonomous-loop>>"}\` sentinel for CronCreate-based autonomous loops; do not confuse the two \u2014 ${"ScheduleWakeup"} always uses the \`-dynamic\` variant.) Omit the call to end the loop.

## Picking delaySeconds

The Anthropic prompt cache has a 5-minute TTL. Sleeping past 300 seconds means the next wake-up reads your full conversation context uncached \u2014 slower and more expensive. So the natural breakpoints:

- **Under 5 minutes (60s\u2013270s)**: cache stays warm. Right for actively polling external state the harness can't notify you about \u2014 a CI run, a deploy, a remote queue.
- **5 minutes to 1 hour (300s\u20133600s)**: pay the cache miss. Right when there's no point checking sooner \u2014 waiting on something that takes minutes to change, genuinely idle, or as the long fallback heartbeat when something else is the primary wake signal.

**Don't pick 300s.** It's the worst-of-both: you pay the cache miss without amortizing it. If you're tempted to "wait 5 minutes," either drop to 270s (stay in cache) or commit to 1200s+ (one cache miss buys a much longer wait). Don't think in round-number minutes \u2014 think in cache windows.

For idle ticks with no specific signal to watch, default to **1200s\u20131800s** (20\u201330 min). The loop checks back, you don't burn cache 12\xD7 per hour for nothing, and the user can always interrupt if they need you sooner.

Think about what you're actually waiting for, not just "how long should I sleep." If you're polling a CI run that takes ~8 minutes, sleeping 60s burns the cache 8 times before it finishes \u2014 sleep ~270s twice instead.

The runtime clamps to [60, 3600], so you don't need to clamp yourself.

## The reason field

One short sentence on what you chose and why. Goes to telemetry and is shown back to the user. "watching CI run" beats "waiting." The user reads this to understand what you're doing without having to predict your cadence in advance \u2014 make it specific.
`;
  });
  var Uda = `
- Stops a running background task by its ID
- Takes a task_id parameter identifying the task to stop
- To stop an agent-team teammate, pass its agent ID ("name@team") or bare teammate name as task_id
- To stop a background agent spawned with a name, pass that name as task_id
- Returns a success or failure status
- Use this tool when you need to terminate a long-running task
`;
  var T9e = {};