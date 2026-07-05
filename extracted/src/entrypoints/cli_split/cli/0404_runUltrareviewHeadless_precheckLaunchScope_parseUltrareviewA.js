  __export(hQl, {
    call: () => call_export44
  });
  async function call_export44(e) {
    logEvent("tengu_bedrock_setup_started", {});
    return HUe.jsx(GXm, {
      onDone: e
    });
  }
  function GXm({
    onDone: e
  }) {
    let t = MXd();
    let [n, r] = fQl.useState(null);
    if (uo("confirm:yes", () => {
      t.exit();
      Promise.resolve().then(() => (bze(), _ze)).then(o => o.execRelaunch());
    }, {
      context: "Confirmation",
      isActive: n !== null
    }), n !== null) {
      return HUe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        marginTop: 1,
        children: [HUe.jsx(Text, {
          color: "success",
          children: n
        }), HUe.jsxs(Text, {
          dimColor: true,
          children: ["Press ", HUe.jsx(Text, {
            bold: true,
            children: "Enter"
          }), " to restart Claude Code."]
        })]
      });
    }
    return HUe.jsx(NJn, {
      onComplete: o => r(o),
      onCancel: () => {
        logEvent("tengu_bedrock_setup_cancelled", {});
        e();
      }
    });
  }
  var fQl;
  var HUe;
  var gQl = __lazy(() => {
    SPo();
    et();
    Bs();
    Ot();
    fQl = __toESM(ot(), 1);
    HUe = __toESM(ie(), 1);
  });
  var yQl;
  var _Ql = __lazy(() => {
    gn();
    yQl = {
      type: "local-jsx",
      name: "setup-bedrock",
      description: "Reconfigure Amazon Bedrock authentication, region, or model pins",
      get isHidden() {
        return !st(process.env.CLAUDE_CODE_USE_BEDROCK);
      },
      load: () => Promise.resolve().then(() => (gQl(), hQl))
    };
  });
  var SQl = {};
  __export(SQl, {
    call: () => call_export45
  });
  async function call_export45(e) {
    logEvent("tengu_vertex_setup_started", {});
    return jUe.jsx(zXm, {
      onDone: e
    });
  }
  function zXm({
    onDone: e
  }) {
    let t = MXd();
    let [n, r] = bQl.useState(null);
    if (uo("confirm:yes", () => {
      t.exit();
      Promise.resolve().then(() => (bze(), _ze)).then(o => o.execRelaunch());
    }, {
      context: "Confirmation",
      isActive: n !== null
    }), n !== null) {
      return jUe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        marginTop: 1,
        children: [jUe.jsx(Text, {
          color: "success",
          children: n
        }), jUe.jsxs(Text, {
          dimColor: true,
          children: ["Press ", jUe.jsx(Text, {
            bold: true,
            children: "Enter"
          }), " to restart Claude Code."]
        })]
      });
    }
    return jUe.jsx(jJn, {
      onComplete: o => r(o),
      onCancel: () => {
        logEvent("tengu_vertex_setup_cancelled", {});
        e();
      }
    });
  }
  var bQl;
  var jUe;
  var TQl = __lazy(() => {
    kPo();
    et();
    Bs();
    Ot();
    bQl = __toESM(ot(), 1);
    jUe = __toESM(ie(), 1);
  });
  var EQl;
  var vQl = __lazy(() => {
    gn();
    EQl = {
      type: "local-jsx",
      name: "setup-vertex",
      description: "Reconfigure Google Vertex AI authentication, project, region, or model pins",
      get isHidden() {
        return !st(process.env.CLAUDE_CODE_USE_VERTEX);
      },
      load: () => Promise.resolve().then(() => (TQl(), SQl))
    };
  });
  function GGo(e, t) {
    return {
      action: "blocked",
      blocked: {
        message: e,
        action_url: null,
        reason: t
      }
    };
  }
  async function CQl() {
    let e = process.env.CLAUDE_CODE_ULTRAREVIEW_PREFLIGHT_FIXTURE;
    if (e) {
      let t = wQl().safeParse(qt(e));
      return t.success ? t.data : null;
    }
    try {
      let t = await _s.get("/v1/ultrareview/preflight", {
        auth: "teleport-org",
        timeout: 5000
      });
      if (!t.ok) {
        switch (t.reason) {
          case "essential-traffic-only":
            return GGo("Ultrareview runs in Claude Code on the web and is unavailable when essential-traffic-only mode is active.", "zdr");
          case "data-residency":
            return GGo("Ultrareview runs in Claude Code on the web and is unavailable on third-party providers.", "data_residency");
          case "no-auth":
            return GGo("Ultrareview requires a Claude.ai account. Run /login to authenticate.", "no_oauth_token");
        }
      }
      let n = wQl().safeParse(t.data);
      if (!n.success) {
        logForDebugging(`fetchUltrareviewPreflight schema mismatch: ${n.error.message}`);
        Et("api_ultrareview_preflight", "schema_mismatch");
        return null;
      }
      Pe("api_ultrareview_preflight");
      return n.data;
    } catch (t) {
      logForDebugging(`fetchUltrareviewPreflight failed: ${t}`);
      Et("api_ultrareview_preflight", "request_failed");
      return null;
    }
  }
  var wQl;
  var RQl = __lazy(() => {
    qg();
    je();
    ln();
    bg();
    wQl = we(() => Ke.object({
      action: Ke.enum(["proceed", "confirm", "blocked"]),
      billing_note: Ke.string().nullable().optional(),
      confirm: Ke.object({
        title: Ke.string().optional(),
        body: Ke.string()
      }).nullable().optional(),
      blocked: Ke.object({
        message: Ke.string(),
        action_url: Ke.string().nullable(),
        reason: Ke.string().optional()
      }).nullable().optional()
    }));
  });
  function Ecr(e, t) {
    let n = e.trim();
    let r = n.split(/\s+/, 1)[0] ?? "";
    let o = new Set();
    let s = n;
    for (let i of t) {
      let a = s.replace(new RegExp(`(?:^|\\s)--${FA(i)}(?=\\s|$)`, "g"), "");
      if (a !== s) {
        o.add(i);
        s = a.trim();
      }
    }
    return {
      rawFirstToken: r,
      flags: o,
      rest: s
    };
  }
  var VGo = __lazy(() => {
    Zn();
  });
  var xQl = {};
  __export(xQl, {
    runUltrareviewHeadless: () => runUltrareviewHeadless,
    precheckLaunchScope: () => precheckLaunchScope,
    parseUltrareviewArgs: () => parseUltrareviewArgs,
    launchRemoteReview: () => launchRemoteReview,
    getReviewDurationNote: () => getReviewDurationNote,
    getReviewCostNote: () => getReviewCostNote,
    confirmOverage: () => confirmOverage,
    checkOverageGate: () => checkOverageGate,
    _resetOverageConfirmedForTests: () => _resetOverageConfirmedForTests
  });
  function confirmOverage() {
    zGo = true;
  }
  function _resetOverageConfirmedForTests() {
    zGo = false;
  }
  function parseUltrareviewArgs(e) {
    let {
      flags: t,
      rest: n
    } = Ecr(e, ["fix", "comment"]);
    return {
      scopeArgs: n,
      applyFixes: t.vZc("fix")
    };
  }
  async function precheckLaunchScope(e, t = "/code-review ultra") {
    if (!(await Egt())) {
      logEvent("tengu_review_remote_precondition_failed", {
        reason: "not_git_repo"
      });
      return {
        ok: false,
        error: `${t} needs a git repository so it can clone your code into a cloud sandbox, but ${Nt()} is not inside one. Run "git init" here to create a repository, or cd into an existing one.`
      };
    }
    let n = e.trim();
    if (/^\d+$/.test(n)) {
      let m = await detectCurrentRepositoryWithHost();
      if (!m) {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "no_github_remote"
        });
        return {
          ok: false,
          error: `${t} <PR#> needs a GitHub remote so it knows which repository the PR is in. If this project is not on GitHub yet, run "gh repo create --source=. --push" to create one; if a GitHub repo already exists, run "git remote add origin REPO_URL". Or run ${t} with no argument to review your current branch instead.`
        };
      }
      if (ef(m.host) && m.owner.toLowerCase() === "anthropics" && m.name.toLowerCase() === "anthropic") {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "monorepo_blocked"
        });
        return {
          ok: false,
          error: `${t} doesn't support the Anthropic monorepo \u2014 monorepo PRs are reviewed automatically by bughunter. Re-trigger it from the PR checks page, or run /bughunter here for a local hunt.`
        };
      }
      let {
        stdout: f,
        code: h
      } = await execFileNoThrow("gh", ["pr", "view", n, "--repo", `${m.host}/${m.owner}/${m.name}`, "--json", "additions,deletions,changedFiles"], {
        timeout: 5000,
        preserveOutputOnError: false
      });
      if (h === 0 && f.trim()) {
        try {
          let g = qt(f);
          let {
            maxFiles: y,
            maxLines: _
          } = LDo();
          let b = g.additions + g.deletions;
          if (g.changedFiles > y || b > _) {
            logEvent("tengu_review_remote_precondition_failed", {
              reason: "pr_diff_too_large",
              files: g.changedFiles,
              lines: b,
              max_files: y,
              max_lines: _
            });
            return {
              ok: false,
              error: `PR #${n} is too large for ultrareview (${g.changedFiles} files, ${b.toLocaleString()} lines). Split it into smaller PRs, or run \`${t}\` on a narrower local diff.`
            };
          }
        } catch {}
      }
      return {
        ok: true,
        scope: {
          mode: "pr",
          prNumber: n,
          repo: `${m.owner}/${m.name}`
        }
      };
    }
    let r = await $hl();
    if (r.tooLarge) {
      logEvent("tengu_review_remote_precondition_failed", {
        reason: "repo_too_large_to_bundle",
        pack_bytes: r.sizeBytes ?? undefined,
        pack_objects: r.inPackCount ?? undefined
      });
      return {
        ok: false,
        error: `Repo is too large to bundle. Push a PR and use \`${t} <PR#>\` instead.`
      };
    }
    if (n) {
      let m = async f => (await execFileNoThrow(gitExe(), ["rev-parse", "--verify", "--quiet", f], {
        preserveOutputOnError: false
      })).code === 0;
      if (!(await m(`origin/${n}`)) && !(await m(n))) {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "base_ref_not_found"
        });
        return {
          ok: false,
          error: `"${n}" is not a branch in this repo. ${t} takes a PR number, a branch name, or no argument (reviews your current branch). Try ${t} by itself.`
        };
      }
    }
    let o = n || (await getDefaultBranch()) || "main";
    let s = (await getBranch()) || "HEAD";
    let i = async m => execFileNoThrow(gitExe(), ["merge-base", m, "HEAD"], {
      preserveOutputOnError: false
    });
    let {
      stdout: a,
      code: l
    } = await i(`origin/${o}`);
    if (l !== 0) {
      ({
        stdout: a,
        code: l
      } = await i(o));
    }
    let c = a.trim();
    if (l !== 0 || !c) {
      logEvent("tengu_review_remote_precondition_failed", {
        reason: "no_merge_base"
      });
      let m = n ? `Make sure ${o} exists locally or on origin (try \`git fetch origin ${o}\`).` : `Pass the base branch explicitly (e.g. \`${t} develop\`) or make sure you're in a git repo with a ${o} branch.`;
      return {
        ok: false,
        error: `Could not find merge-base with ${o}. ${m}`
      };
    }
    let {
      stdout: u,
      code: d
    } = await execFileNoThrow(gitExe(), ["diff", "--shortstat", c], {
      preserveOutputOnError: false,
      env: {
        ...process.env,
        LC_ALL: "C"
      }
    });
    if (d === 0 && !u.trim()) {
      logEvent("tengu_review_remote_precondition_failed", {
        reason: "empty_diff"
      });
      return {
        ok: false,
        error: `It doesn't look like you have any new commits or changes to review against your ${o} branch. Stage or commit them first?`
      };
    }
    let p = W9n(u);
    if (p) {
      let {
        maxFiles: m,
        maxLines: f
      } = LDo();
      let h = p.linesAdded + p.linesRemoved;
      if (p.filesCount > m || h > f) {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "local_diff_too_large",
          files: p.filesCount,
          lines: h,
          max_files: m,
          max_lines: f
        });
        return {
          ok: false,
          error: `Diff is too large for ultrareview: ${u.trim()}. Pass a closer base branch (\`${t} <branch>\`) to narrow the scope, or split the change.`
        };
      }
    }
    return {
      ok: true,
      scope: {
        mode: "branch",
        headBranch: s,
        baseBranch: o,
        mergeBaseSha: c,
        diffStat: u.trim()
      }
    };
  }
  async function checkOverageGate() {
    let e = await CQl();
    if (!e) {
      return {
        kind: "proceed",
        billingNote: ""
      };
    }
    let t = e.billing_note ?? "";
    switch (e.action) {
      case "proceed":
        return {
          kind: "proceed",
          billingNote: t
        };
      case "blocked":
        return {
          kind: "blocked",
          reason: e.blocked?.reason ?? "server",
          message: e.blocked?.message ?? "Ultrareview is unavailable for your organization.",
          actionUrl: e.blocked?.action_url ?? null
        };
      case "confirm":
        {
          if (zGo) {
            return {
              kind: "proceed",
              billingNote: t
            };
          }
          return {
            kind: "needs-confirm",
            body: `This review bills as usage credits (${getReviewCostNote()}).`,
            billingNote: t
          };
        }
    }
  }
  async function launchRemoteReview(e, t, n, r) {
    let o = r?.invocation ?? "/code-review ultra";
    let s = k => ({
      launched: false,
      blocks: [{
        type: "text",
        text: k
      }]
    });
    let i = await Dme({
      allowBundle: true
    });
    if (!i.eligible) {
      let k = i.errors;
      if (k.length > 0) {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "remote_agent_ineligible",
          precondition_errors: k.map(O => O.type).join(",")
        });
        let I = k.map(O => {
          if (O.type === "not_in_git_repo") {
            return `${o} needs a git repository so it can clone your code into a cloud sandbox, but ${Nt()} is not inside one. Run "git init" here to create a repository, or cd into an existing one.`;
          }
          if (O.type === "no_git_remote") {
            return `${o} needs a GitHub remote so it can clone this repository into the cloud. If this project is not on GitHub yet, run "gh repo create --source=. --push" to create one; if a GitHub repo already exists, run "git remote add origin REPO_URL && git push -u origin HEAD".`;
          }
          return Ese(O);
        }).join(`
`);
        return s(`Ultrareview cannot launch:
${I}`);
      }
    }
    let a = "env_011111111111111111111113";
    let l = pKe();
    let c = (k, I, O) => {
      if (typeof k !== "number" || !Number.isFinite(k)) {
        return I;
      }
      let M = Math.floor(k);
      if (M <= 0) {
        return I;
      }
      return M > O ? I : M;
    };
    let u = H_l();
    let d = {
      BUGHUNTER_DRY_RUN: "1",
      BUGHUNTER_FLEET_SIZE: String(c(l?.fleet_size, 5, 20)),
      BUGHUNTER_MAX_DURATION: String(c(l?.max_duration_minutes, 10, 25)),
      BUGHUNTER_AGENT_TIMEOUT: String(c(l?.agent_timeout_seconds, 600, 1800)),
      BUGHUNTER_TOTAL_WALLCLOCK: String(c(l?.total_wallclock_minutes, 22, 27)),
      ...(u && {
        BUGHUNTER_MODEL: u
      }),
      ...(process.env.BUGHUNTER_DEV_BUNDLE_B64 && {
        BUGHUNTER_DEV_BUNDLE_B64: process.env.BUGHUNTER_DEV_BUNDLE_B64
      })
    };
    let p;
    let m;
    let f;
    let h = "";
    let g;
    let y;
    let _;
    let b;
    let S;
    if (e.mode === "pr") {
      let k = await detectCurrentRepositoryWithHost();
      if (!k) {
        logEvent("tengu_review_remote_precondition_failed", {
          reason: "no_github_remote_post_confirm"
        });
        return null;
      }
      p = await teleportToRemote({
        initialMessage: null,
        source: "ultrareview",
        description: `ultrareview: ${k.owner}/${k.name}#${e.prNumber}`,
        signal: t.abortController.signal,
        branchName: `refs/pull/${e.prNumber}/head`,
        environmentId: a,
        tags: ["ultrareview"],
        environmentVariables: {
          BUGHUNTER_PR_NUMBER: e.prNumber,
          BUGHUNTER_REPOSITORY: `${k.owner}/${k.name}`,
          ...d
        },
        onCreateFail: (I, O, M) => {
          g = I;
          y = O;
          _ = M?.status;
          b = M?.serverType == null ? undefined : M?.serverType;
          S = M?.serverReason == null ? undefined : M?.serverReason;
        }
      });
      m = `/ultrareview ${e.prNumber}`;
      f = `${k.owner}/${k.name}#${e.prNumber}`;
    } else {
      let {
        headBranch: k,
        baseBranch: I,
        mergeBaseSha: O,
        diffStat: M
      } = e;
      h = M;
      let L;
      let P;
      if (p = await teleportToRemote({
        initialMessage: null,
        source: "ultrareview",
        description: `ultrareview: ${k}`,
        signal: t.abortController.signal,
        useBundle: true,
        bundleBaseRef: O,
        environmentId: a,
        tags: ["ultrareview"],
        environmentVariables: {
          BUGHUNTER_BASE_BRANCH: O,
          ...d
        },
        onBundleFail: (F, H) => {
          L = F;
          P = H;
        },
        onCreateFail: (F, H, U) => {
          g = F;
          y = H;
          _ = U?.status;
          b = U?.serverType == null ? undefined : U?.serverType;
          S = U?.serverReason == null ? undefined : U?.serverReason;
        }
      }), !p) {
        logEvent("tengu_review_remote_teleport_failed", {
          mode: "branch",
          reason: y,
          bundle_fail_kind: P,
          status_code: _,
          server_type: b,
          server_reason: S
        });
        return s(L ?? (g ? `Ultrareview could not start the cloud session: ${g}` : `Repo is too large. Push a PR and use \`${o} <PR#>\` instead.`));
      }
      m = "/ultrareview";
      f = k === I ? k : `${k} \u2192 ${I}`;
    }
    if (!p) {
      if (logEvent("tengu_review_remote_teleport_failed", {
        mode: "pr",
        reason: y,
        status_code: _,
        server_type: b,
        server_reason: S
      }), g) {
        return s(`Ultrareview could not start the cloud session: ${g}`);
      }
      return null;
    }
    let E;
    if (!r?.skipTaskRegistration) {
      E = Ave({
        remoteTaskType: "ultrareview",
        session: p,
        command: m,
        context: t,
        isRemoteReview: true,
        applyFixesOnComplete: r?.applyFixesOnComplete
      }).taskId;
    }
    logEvent("tengu_review_remote_launched", {});
    let C = Mme(p.id);
    let x = n.trim() ? `${n.trim()}
` : "";
    let A = h ? `
Scope: ${h}` : "";
    return {
      launched: true,
      sessionId: p.id,
      sessionUrl: C,
      taskId: E,
      title: p.title,
      blocks: [{
        type: "text",
        text: `${x}Ultrareview launched for ${f} (${getReviewDurationNote()}, runs in the cloud). Track: ${C}${A}`
      }]
    };
  }
  async function runUltrareviewHeadless(e, t) {
    if (!qz()) {
      return {
        status: "error",
        message: "Ultrareview is currently unavailable."
      };
    }
    let n = await precheckLaunchScope(e, t.invocation);
    if (!n.ok) {
      return {
        status: "error",
        message: n.error
      };
    }
    let r = await checkOverageGate();
    if (r.kind === "blocked") {
      logEvent("tengu_review_overage_blocked", {
        reason: r.reason
      });
      return {
        status: "blocked",
        message: r.message,
        actionUrl: r.actionUrl
      };
    }
    if (r.kind === "needs-confirm") {
      if (logEvent("tengu_review_overage_dialog_shown", {}), !t.confirm) {
        return {
          status: "needs-confirm",
          body: r.body,
          billingNote: r.billingNote
        };
      }
      confirmOverage();
    }
    if (!t.confirm) {
      return {
        status: "needs-confirm",
        body: `${n.scope.mode === "pr" ? `Reviewing PR ${n.scope.repo}#${n.scope.prNumber}` : `Reviewing current branch against ${n.scope.baseBranch}
Scope: ${n.scope.diffStat}`}
${getReviewDurationNote()} \xB7 Est. cost ${getReviewCostNote()} USD`,
        billingNote: r.billingNote
      };
    }
    let o = await launchRemoteReview(n.scope, t.context, r.billingNote, {
      skipTaskRegistration: t.skipTaskRegistration,
      invocation: t.invocation
    });
    if (!o?.launched) {
      return {
        status: "error",
        message: o?.blocks.map(s => s.type === "text" ? s.text : "").join("").trim() || "Failed to launch cloud review session."
      };
    }
    return {
      status: "launched",
      sessionId: o.sessionId,
      sessionUrl: o.sessionUrl,
      taskId: o.taskId,
      title: o.title,
      message: o.blocks.map(s => s.type === "text" ? s.text : "").join("").trim(),
      billingNote: r.billingNote
    };
  }
  var zGo = false;
  var Jwt = __lazy(() => {
    Ot();
    RQl();
    VGo();
    tZ();
    UNe();
    vo();
    bI();
    ji();
    na();
    Qht();
    fk();
    XPo();
    FM();
    bLe();
  });
  async function Xwt() {
    let [e, t] = await Promise.all([detectCurrentRepositoryWithHost(), checkGate_CACHED_OR_BLOCKING("tengu_ccr_bundle_seed_enabled")]);
    let n = findGitRoot(Nt()) !== null && (st(process.env.CCR_ENABLE_BUNDLE) || t);
    if (!n) {
      return {
        cloneViable: false,
        bundleSeedEnabled: n
      };
    }
    return {
      cloneViable: e !== null && (!ef(e.host) || (await x8e(e.owner, e.name))),
      bundleSeedEnabled: n
    };
  }
  var xcr = __lazy(() => {
    $n();
    vo();
    bI();
    gn();
    na();
    fk();
    UNe();
  });
  class AQl {
    exitPlanCalls = [];
    results = new Map();
    rejectedIds = new Set();
    terminated = null;
    rescanAfterRejection = false;
    everSeenPending = false;
    get rejectCount() {
      return this.rejectedIds.size;
    }
    get hasPendingPlan() {
      let e = this.exitPlanCalls.findLast(t => !this.rejectedIds.vZc(t));
      return e !== undefined && !this.results.vZc(e);
    }
    ingest(e) {
      for (let r of e) {
        if (r.type === "assistant") {
          for (let o of r.message.content) {
            if (o.type !== "tool_use") {
              continue;
            }
            let s = o;
            if (s.name === "ExitPlanMode") {
              this.exitPlanCalls.push(s.id);
            }
          }
        } else if (r.type === "user") {
          let o = r.message.content;
          if (!Array.isArray(o)) {
            continue;
          }
          for (let s of o) {
            if (s.type === "tool_result") {
              this.results.set(s.tool_use_id, s);
            }
          }
        } else if (r.type === "result" && r.subtype !== "success") {
          this.terminated = {
            subtype: r.subtype
          };
        }
      }
      let t = e.length > 0 || this.rescanAfterRejection;
      this.rescanAfterRejection = false;
      let n = null;
      if (t) {
        for (let r = this.exitPlanCalls.length - 1; r >= 0; r--) {
          let o = this.exitPlanCalls[r];
          if (this.rejectedIds.vZc(o)) {
            continue;
          }
          let s = this.results.get(o);
          if (!s) {
            n = {
              kind: "pending"
            };
          } else if (s.is_error === true) {
            let i = XXm(s.content);
            n = i !== null ? {
              kind: "teleport",
              plan: i
            } : {
              kind: "rejected",
              id: o
            };
          } else {
            n = {
              kind: "approved",
              plan: QXm(s.content)
            };
          }
          break;
        }
        if (n?.kind === "approved" || n?.kind === "teleport") {
          return n;
        }
      }
      if (n?.kind === "rejected") {
        this.rejectedIds.add(n.id);
        this.rescanAfterRejection = true;
      }
      if (this.terminated) {
        return {
          kind: "terminated",
          subtype: this.terminated.subtype
        };
      }
      if (n?.kind === "rejected") {
        return n;
      }
      if (n?.kind === "pending") {
        this.everSeenPending = true;
        return n;
      }
      return {
        kind: "unchanged"
      };
    }
  }
  async function IQl(e, t, n, r) {
    let o = Date.now() + t;
    let s = new AQl();
    let i = {
      eventsReceived: 0,
      firstEventAt: undefined,
      lastEventAt: undefined
    };
    let a = null;
    let l = 0;
    let c = "running";
    while (Date.now() < o) {
      if (r()) {
        throw Error("poll stopped by caller");
      }
      let p;
      let m;
      try {
        let y = await pollRemoteSessionEvents(e, a);
        if (p = y.newEvents, a = y.lastEventId, m = y.sessionStatus, l = 0, p.length > 0) {
          let _ = Date.now();
          i.eventsReceived += p.length;
          i.firstEventAt ??= _;
          i.lastEventAt = _;
        }
      } catch (y) {
        if (!isTransientNetworkError(y)) {
          throw new Vfe(y instanceof Error ? y.message : String(y), "network_or_unknown", s.rejectCount, i, {
            cause: y
          });
        }
        if (++l >= 5) {
          throw new Vfe("Lost connection to the cloud session after repeated retries \u2014 the session may still be running", "network_or_unknown", s.rejectCount, i, {
            cause: y
          });
        }
        await sleep(3000);
        continue;
      }
      let f;
      try {
        f = s.ingest(p);
      } catch (y) {
        throw new Vfe(y instanceof Error ? y.message : String(y), "extract_marker_missing", s.rejectCount, i);
      }
      if (f.kind === "approved") {
        return {
          plan: f.plan,
          rejectCount: s.rejectCount,
          executionTarget: "remote"
        };
      }
      if (f.kind === "teleport") {
        return {
          plan: f.plan,
          rejectCount: s.rejectCount,
          executionTarget: "local"
        };
      }
      if (f.kind === "terminated") {
        throw new Vfe(`cloud session ended (${f.subtype}) before plan approval`, "terminated", s.rejectCount, i);
      }
      let h = (m === "idle" || m === "requires_action") && p.length === 0;
      let g = s.hasPendingPlan ? "plan_ready" : h ? "needs_input" : "running";
      if (g !== c) {
        logForDebugging(`[ultraplan] phase ${c} \u2192 ${g}`);
        c = g;
        n(g);
      }
      await sleep(3000);
    }
    let u = Math.round(t / 60000);
    let d = u === 1 ? "minute" : "minutes";
    throw new Vfe(s.everSeenPending ? `no approval after ${u} ${d}` : `ExitPlanMode never reached after ${u} ${d} (the remote container failed to start, or session ID mismatch?)`, s.everSeenPending ? "timeout_pending" : "timeout_no_plan", s.rejectCount, i);
  }
  function PQl(e) {
    return typeof e === "string" ? e : Array.isArray(e) ? e.map(t => "text" in t ? t.text : "").join("") : "";
  }
  function XXm(e) {
    let t = PQl(e);
    let n = `${"__ULTRAPLAN_TELEPORT_LOCAL__"}
`;
    let r = t.indexOf(n);
    if (r === -1) {
      return null;
    }
    return t.slice(r + n.length).trimEnd();
  }
  function QXm(e) {
    let t = PQl(e);
    let n = [`## Approved Plan (edited by user):
`, `## Approved Plan:
`];
    for (let r of n) {
      let o = t.indexOf(r);
      if (o !== -1) {
        return t.slice(o + r.length).trimEnd();
      }
    }
    throw Error(`ExitPlanMode approved but tool_result has no "## Approved Plan:" marker \u2014 remote may have hit the empty-plan or isAgent branch. Content preview: ${t.slice(0, 200)}`);
  }
  var Vfe;
  var OQl = __lazy(() => {
    je();
    NC();
    FM();
    Vfe = class Vfe extends Error {
      reason;
      rejectCount;
      eventStats;
      constructor(e, t, n, r, o) {
        super(e, o);
        this.reason = t;
        this.rejectCount = n;
        this.eventStats = r;
        this.name = "UltraplanPollError";
      }
    };
  });
  function zfe() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ultraplan_config", null)?.enabled === true && hasBridgeEntitlement() && !getIsRemoteMode();
  }
  var _en = __lazy(() => {
    at();
    Ox();
    $n();
  });