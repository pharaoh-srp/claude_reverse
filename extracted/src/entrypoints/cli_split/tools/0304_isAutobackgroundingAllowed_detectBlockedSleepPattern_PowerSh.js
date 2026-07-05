  __export(f6t, {
    isAutobackgroundingAllowed: () => isAutobackgroundingAllowed,
    detectBlockedSleepPattern: () => detectBlockedSleepPattern,
    PowerShellTool: () => PowerShellTool
  });
  function v9p(e) {
    let t = e.trim();
    if (!t) {
      return {
        isSearch: false,
        isRead: false
      };
    }
    let n = t.split(/\s*[;|]\s*/).filter(Boolean);
    if (n.length === 0) {
      return {
        isSearch: false,
        isRead: false
      };
    }
    let r = false;
    let o = false;
    let s = false;
    for (let i of n) {
      let a = i.trim().split(/\s+/)[0];
      if (!a) {
        continue;
      }
      let l = eh(a);
      if (E9p.vZc(l)) {
        continue;
      }
      s = true;
      let c = S9p.vZc(l);
      let u = T9p.vZc(l);
      if (!c && !u) {
        return {
          isSearch: false,
          isRead: false
        };
      }
      if (c) {
        r = true;
      }
      if (u) {
        o = true;
      }
    }
    if (!s) {
      return {
        isSearch: false,
        isRead: false
      };
    }
    return {
      isSearch: r,
      isRead: o
    };
  }
  async function isAutobackgroundingAllowed(e) {
    if (await x9a(e)) {
      return false;
    }
    let t = e.trim().split(/\s+/)[0];
    if (!t) {
      return true;
    }
    let n = eh(t);
    return !C9p.includes(n);
  }
  function detectBlockedSleepPattern(e) {
    let t = e.trim().split(/[;|&\r\n]/)[0]?.trim() ?? "";
    let n = /^(?:start-sleep|sleep)(?:\s+-s(?:econds)?)?\s+(\d+(?:\.\d*)?)\s*$/i.exec(t);
    if (!n) {
      return null;
    }
    let r = parseFloat(n[1]);
    if (r < 25) {
      return null;
    }
    let o = e.trim().slice(t.length).replace(/^[\s;|&]+/, "");
    return o ? `Start-Sleep ${r} followed by: ${o}` : `standalone Start-Sleep ${r}`;
  }
  function j9a() {
    return Wt() === "windows" && SandboxManager.isSandboxEnabledInSettings() && SandboxManager.isPlatformInEnabledList() && !SandboxManager.areUnsandboxedCommandsAllowed();
  }
  async function* I9p({
    input: e,
    abortController: t,
    taskRegistry: n,
    setToolJSX: r,
    emitToolProgress: o,
    preventCwdChanges: s,
    isMainThread: i,
    toolUseId: a,
    agentId: l,
    sessionEnvVars: c
  }) {
    let {
      command: u,
      description: d,
      timeout: p,
      run_in_background: m,
      dangerouslyDisableSandbox: f
    } = e;
    let h = Math.min(p || F9n(), p6t());
    let g = "";
    let y = "";
    let _ = 0;
    let b = 0;
    let S = undefined;
    let E = false;
    let C = null;
    function x() {
      return new Promise(W => {
        C = () => W(null);
      });
    }
    let A = !m6t && (await isAutobackgroundingAllowed(u));
    let k = Cqn({
      requestedTimeoutMs: h,
      isMainAgent: i === true,
      canAutoBackground: A
    });
    if (!(await qV())) {
      return {
        stdout: "",
        stderr: "PowerShell is not available on this system.",
        code: 0,
        interrupted: false
      };
    }
    let O;
    try {
      O = await Kde(u, t.signal, "powershell", {
        timeout: k,
        onProgress(W, j, z, V, K) {
          y = W;
          g = j;
          _ = z;
          b = K ? V : 0;
        },
        preventCwdChanges: s,
        shouldUseSandbox: Wt() === "windows" ? false : $1({
          command: u,
          dangerouslyDisableSandbox: f
        }),
        shouldAutoBackground: A,
        sessionEnvVars: c
      });
    } catch (W) {
      if (mg(W)) {
        return {
          stdout: "",
          stderr: "Command aborted before execution",
          code: 145,
          interrupted: true
        };
      }
      if (Zd(W)) {
        logForDebugging(`PowerShellTool: exec spawn failed: ${W}`);
        return {
          stdout: "",
          stderr: `Failed to execute PowerShell command: ${he(W)}`,
          code: 0,
          interrupted: false
        };
      }
      Oe($o(sr(W), "PowerShell exec() pre-spawn setup failed"));
      return {
        stdout: "",
        stderr: `Failed to execute PowerShell command: ${he(W)}`,
        code: 0,
        interrupted: false
      };
    }
    let M = O.result;
    async function L() {
      return (await XDe({
        command: u,
        description: d || u,
        shellCommand: O,
        toolUseId: a,
        agentId: l
      }, {
        abortController: t,
        taskRegistry: n
      })).taskId;
    }
    function P(W, j) {
      if (U) {
        if (!Mjn(U, O, d || u, n, a)) {
          return;
        }
        S = U;
        logEvent(W, {
          command_type: $ht(u)
        });
        j?.(U);
        return;
      }
      L().then(z => {
        S = z;
        let V = C;
        if (V) {
          C = null;
          V();
        }
        if (logEvent(W, {
          command_type: $ht(u)
        }), j) {
          j(z);
        }
      });
    }
    if (O.onTimeout && A) {
      O.onTimeout(W => {
        P("tengu_powershell_command_timeout_backgrounded", W);
      });
    }
    if (m === true && !m6t) {
      let W = await L();
      logEvent("tengu_powershell_command_explicitly_backgrounded", {
        command_type: $ht(u)
      });
      return {
        stdout: "",
        stderr: "",
        code: 0,
        interrupted: false,
        backgroundTaskId: W
      };
    }
    Db.startPolling(O.taskOutput.taskId);
    let F = Date.now();
    let H = F + 2000;
    let U = undefined;
    let N = null;
    try {
      while (true) {
        let W = Date.now();
        let j = Math.max(0, H - W);
        let z = x();
        let V = await Promise.race([M, new Promise(Q => setTimeout(Z => Z(null), j, Q).unref()), z]);
        if (V !== null) {
          if (N = V, V.backgroundTaskId !== undefined) {
            if (Njn(V.backgroundTaskId, V, n)) {
              zu(V.backgroundTaskId, dmt(V), {
                toolUseId: a,
                summary: d || u
              });
            }
            let Q = {
              ...V,
              backgroundTaskId: undefined
            };
            let {
              taskOutput: Z
            } = O;
            if (Z.stdoutToFile && !Z.outputFileRedundant) {
              Q.outputFilePath = Z.path;
              Q.outputFileSize = Z.outputFileSize;
              Q.outputTaskId = Z.taskId;
            }
            return Q;
          }
          return V;
        }
        if (S) {
          return {
            stdout: E ? g : "",
            stderr: "",
            code: 0,
            interrupted: false,
            backgroundTaskId: S
          };
        }
        if (t.signal.aborted && unwrapAbortReason(t.signal.reason) === "interrupt" && !E) {
          if (E = true, A) {
            P("tengu_powershell_command_interrupt_backgrounded");
            continue;
          }
          O.kill();
        }
        if (U) {
          if (O.status === "backgrounded") {
            return {
              stdout: "",
              stderr: "",
              code: 0,
              interrupted: false,
              backgroundTaskId: U,
              backgroundedByUser: true
            };
          }
        }
        let K = Date.now() - F;
        let J = Math.floor(K / 1000);
        if (!m6t && S === undefined && J >= 2000 / 1000) {
          if (!U) {
            U = Ojn({
              command: u,
              description: d || u,
              shellCommand: O,
              agentId: l
            }, n, a);
          }
          if (r?.({
            jsx: V9a.jsx(xNe, {}),
            shouldHidePromptInput: false,
            shouldContinueAnimation: true,
            showSpinner: true
          }), a) {
            o?.({
              kind: "background_hint",
              toolUseId: a
            });
          }
        }
        yield {
          type: "progress",
          fullOutput: g,
          output: y,
          elapsedTimeSeconds: J,
          totalLines: _,
          totalBytes: b,
          taskId: O.taskOutput.taskId,
          ...(p ? {
            timeoutMs: k
          } : undefined)
        };
        H = Date.now() + 1000;
      }
    } finally {
      if (Db.stopPolling(O.taskOutput.taskId), !S && O.status !== "backgrounded") {
        if (U) {
          Ljn(U, N ? dmt(N) : "stopped", n);
        }
        O.cleanup();
      }
    }
  }
  var ANe;
  var V9a;
  var B9a = `
`;
  var S9p;
  var T9p;
  var E9p;
  var C9p;
  var m6t;
  var q9a;
  var x9p;
  var k9p;
  var PowerShellTool;
  var h6t = __lazy(() => {
    Ot();
    ci();
    zX();
    Kp();
    pmt();
    vo();
    je();
    pr();
    dt();
    cs();
    Kjn();
    Rn();
    JF();
    V5e();
    Cs();
    Qjn();
    U1();
    Th();
    uMe();
    Cmt();
    cMe();
    Jf();
    Zn();
    cE();
    w5e();
    mMe();
    zI();
    iWe();
    X5e();
    s6t();
    S9n();
    Tm();
    wX();
    amt();
    LGa();
    Kpt();
    A9a();
    P9a();
    qht();
    U9a();
    Sl();
    ANe = require("fs/promises");
    V9a = __toESM(ie(), 1);
    S9p = new Set(["select-string", "get-childitem", "findstr", "where.exe"]);
    T9p = new Set(["get-content", "get-item", "test-path", "resolve-path", "get-process", "get-service", "get-childitem", "get-location", "get-filehash", "get-acl", "format-hex"]);
    E9p = new Set(["write-output", "write-host"]);
    C9p = ["start-sleep", "sleep"];
    m6t = Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS;
    q9a = we(() => v.strictObject({
      command: v.string().refine(HTe, "command contains control characters that would be hidden in the approval dialog").describe("The PowerShell command to execute"),
      timeout: v$(v.number().optional()).describe(`Optional timeout in milliseconds (max ${p6t()})`),
      description: v.string().optional().describe("Clear, concise description of what this command does in active voice."),
      run_in_background: VI(v.boolean().optional()).describe("Set to true to run this command in the background."),
      dangerouslyDisableSandbox: VI(v.boolean().optional()).describe("Set this to true to dangerously override sandbox mode and run commands without sandboxing.")
    }));
    x9p = we(() => m6t ? q9a().omit({
      run_in_background: true
    }) : q9a());
    k9p = we(() => v.object({
      stdout: v.string().describe("The standard output of the command"),
      stderr: v.string().describe("The standard error output of the command"),
      interrupted: v.boolean().describe("Whether the command was interrupted"),
      returnCodeInterpretation: v.string().optional().describe("Semantic interpretation for non-error exit codes with special meaning"),
      isImage: v.boolean().optional().describe("Flag to indicate if stdout contains image data"),
      persistedOutputPath: v.string().optional().describe("Path to persisted full output when too large for inline"),
      persistedOutputSize: v.number().optional().describe("Total output size in bytes when persisted"),
      backgroundTaskId: v.string().optional().describe("ID of the background task if command is running in background"),
      backgroundedByUser: v.boolean().optional().describe("True if the user manually backgrounded the command with Ctrl+B"),
      gitOperation: wjn().optional().describe("@internal Structured classification of git/gh operations detected in this command (commit/push/merge/rebase/PR). Client-facing \u2014 lets clients render git activity without re-parsing stdout; not surfaced to the model.")
    }));
    PowerShellTool = Xs({
      name: "PowerShell",
      ruleContentField: "command",
      searchHint: "execute Windows PowerShell commands",
      maxResultSizeChars: 30000,
      strict: true,
      async description({
        description: e
      }) {
        return e || "Run PowerShell command";
      },
      async prompt() {
        return I9a();
      },
      isConcurrencySafe(e) {
        return this.isReadOnly?.(e) ?? false;
      },
      isSearchOrReadCommand(e) {
        if (!e?.command) {
          return {
            isSearch: false,
            isRead: false
          };
        }
        return v9p(e.command);
      },
      isReadOnly(e) {
        if (n9a(e.command)) {
          return false;
        }
        return C9n(e.command);
      },
      toAutoClassifierInput(e) {
        let t = e.dangerouslyDisableSandbox;
        return e.command;
      },
      async preparePermissionMatcher({
        command: e
      }) {
        let t = await REe(e);
        if (!t.valid) {
          return () => true;
        }
        let n = PO(t).flatMap(r => {
          let o = [r.name, ...r.args].join(" ");
          let s = [eh(r.name), ...r.args].join(" ");
          return o.toLowerCase() === s ? [o] : [o, s];
        });
        return r => {
          let o = WGt(r);
          return n.some(s => {
            if (o !== null) {
              let i = o.toLowerCase();
              let a = s.toLowerCase();
              return a === i || a.startsWith(`${i} `);
            }
            return KV(r, s, true, true);
          });
        };
      },
      get inputSchema() {
        return x9p();
      },
      get outputSchema() {
        return k9p();
      },
      userFacingName() {
        return "PowerShell";
      },
      getToolUseSummary(e) {
        if (!e?.command) {
          return null;
        }
        let {
          command: t,
          description: n
        } = e;
        if (n) {
          return n;
        }
        return truncate(t, 50);
      },
      getActivityDescription(e) {
        if (!e?.command) {
          return "Running command";
        }
        return `Running ${e.description ?? truncate(e.command, 50)}`;
      },
      isEnabled() {
        return true;
      },
      async validateInput(e) {
        if (j9a()) {
          return {
            result: false,
            message: "Enterprise policy requires sandboxing, but sandboxing is not available on native Windows. Shell command execution is blocked on this platform by policy.",
            errorCode: 11
          };
        }
        if (IG() && Pu() && !m6t && !e.run_in_background) {
          let t = detectBlockedSleepPattern(e.command);
          if (t !== null) {
            return {
              result: false,
              message: `Blocked: ${t}. To wait for a condition, use Monitor with an until-loop (e.g. \`until <check>; do sleep 2; done\` \u2014 Monitor runs bash). To wait for a command you started, use run_in_background: true. Do not chain shorter sleeps to work around this block.`,
              errorCode: 10
            };
          }
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        return await k9a(e, t);
      },
      renderToolUseMessage: D9a,
      renderToolUseProgressMessage: M9a,
      renderToolUseQueuedMessage: N9a,
      renderToolResultMessage: L9a,
      renderToolUseErrorMessage: F9a,
      mapToolResultToToolResultBlockParam({
        interrupted: e,
        stdout: t,
        stderr: n,
        isImage: r,
        persistedOutputPath: o,
        persistedOutputSize: s,
        backgroundTaskId: i,
        backgroundedByUser: a
      }, l) {
        if (r) {
          let p = g9n(t, l);
          if (p) {
            return p;
          }
        }
        let c = t;
        if (o) {
          let p = t ? t.replace(/^(\s*\n)+/, "").trimEnd() : "";
          let m = TGt(p, 2000);
          c = yMe({
            filepath: o,
            originalSize: s ?? 0,
            isJson: false,
            preview: m.preview,
            hasMore: m.hasMore
          });
        } else if (t) {
          c = t.replace(/^(\s*\n)+/, "");
          c = c.trimEnd();
        }
        let u = n.trim();
        if (e) {
          if (n) {
            u += B9a;
          }
          u += "<error>Command was aborted before completion</error>";
        }
        let d = "";
        if (i) {
          let p = getTaskOutputPath(i);
          if (a) {
            d = `Command was manually backgrounded by user with ID: ${i}. Output is being written to: ${p}`;
          } else {
            d = `Command running in background with ID: ${i}. Output is being written to: ${p}. You will be notified when it completes. To check interim output, use ${"Read"} on that file path.`;
          }
        }
        return {
          tool_use_id: l,
          type: "tool_result",
          content: [c, u, d].filter(Boolean).join(`
`),
          is_error: e
        };
      },
      async call(e, t, n, r, o) {
        if (j9a()) {
          throw Error("Enterprise policy requires sandboxing, but sandboxing is not available on native Windows. Shell command execution is blocked on this platform by policy.");
        }
        let {
          abortController: s,
          setToolJSX: i,
          emitToolProgress: a
        } = t;
        let l = !t.agentId;
        let c = 0;
        try {
          let u = I9p({
            input: e,
            abortController: s,
            taskRegistry: t.taskRegistry,
            setToolJSX: i,
            emitToolProgress: a,
            preventCwdChanges: !l,
            isMainThread: l,
            toolUseId: t.toolUseId,
            agentId: t.agentId,
            sessionEnvVars: t.sessionEnvVars
          });
          let d;
          do {
            if (d = await u.next(), !d.done && o) {
              let F = d.value;
              o({
                type: "progress",
                toolUseID: `ps-progress-${c++}`,
                data: {
                  type: "powershell_progress",
                  output: F.output,
                  fullOutput: F.fullOutput,
                  elapsedTimeSeconds: F.elapsedTimeSeconds,
                  totalLines: F.totalLines,
                  totalBytes: F.totalBytes,
                  timeoutMs: F.timeoutMs,
                  taskId: F.taskId
                }
              });
            }
          } while (!d.done);
          let p = d.value;
          let m = p.code === 0 && !p.stdout && p.stderr && !p.backgroundTaskId;
          if (!m) {
            xjn(e.command, p.code, p.stdout);
          }
          let f = c5e(e.command);
          let h = unwrapAbortReason(s.signal.reason);
          let g = p.interrupted && h === "interrupt";
          let y = p.interrupted && (h === "interrupt" || h === "user-cancel" || h === "remote-cancel");
          let _ = "";
          if (l) {
            if (b9n(getToolPermissionContext(t))) {
              _ = _9n("");
            }
          }
          if (zjn(t.toolUseId), p.backgroundTaskId) {
            let F = FWt(p.stdout || "", e.command);
            if (l && F.hints.length > 0) {
              for (let H of F.hints) {
                JWt(H);
              }
            }
            return {
              data: {
                stdout: F.stripped,
                stderr: [p.stderr || "", _].filter(Boolean).join(`
`),
                interrupted: false,
                backgroundTaskId: p.backgroundTaskId,
                backgroundedByUser: p.backgroundedByUser
              }
            };
          }
          let b = new vIt();
          let S = (p.stdout || "").trimEnd();
          b.append(S + B9a);
          let E = NGa(e.command, p.code, S, p.stderr || "");
          let C = h9n(b.toString());
          let x = FWt(C, e.command);
          if (C = x.stripped, l && x.hints.length > 0) {
            for (let F of x.hints) {
              JWt(F);
            }
          }
          if (p.preSpawnError) {
            throw new Po(p.preSpawnError, "PowerShell: pre-spawn error (cwd/argv redacted)");
          }
          if (E.isError && !g) {
            let F = S.length <= 8192 ? S : S.slice(0, 4096) + S.slice(-4096);
            let H = DGa(F);
            throw logEvent("tengu_powershell_tool_command_failed", {
              command_type: $ht(e.command),
              exit_code: p.code,
              stdout_length: S.length,
              error_class: H,
              not_recognized_kind: H === "not_recognized" || H === "command_not_found" ? MGa(F) ?? "unextracted" : undefined,
              powershell_edition: (await hGt()) ?? "unknown",
              destructive_category: f ?? "none",
              destructive_target_scope: Xce(e.command, Nt(), f),
              permission_mode: getToolPermissionContext(t).mode
            }), new RN(C, p.stderr || "", p.code, y);
          }
          let A = 67108864;
          let k;
          let I;
          if (p.outputFilePath && p.outputTaskId) {
            try {
              let F = await ANe.stat(p.outputFilePath);
              I = F.size;
              await YTe();
              let H = SGt(p.outputTaskId, false);
              if (F.size > A) {
                await ANe.truncate(p.outputFilePath, A);
              }
              try {
                await ANe.link(p.outputFilePath, H);
              } catch {
                await ANe.copyFile(p.outputFilePath, H);
              }
              k = H;
            } catch {}
          }
          let O = i6t(C);
          let M = C;
          if (O) {
            let F = await y9n(C, p.outputFilePath, I, Yg(t.options.mainLoopModel));
            if (F) {
              M = F;
            } else {
              O = false;
            }
          }
          let L = [p.stderr || "", _].filter(Boolean).join(`
`);
          let P;
          if (!m) {
            let F = imt(e.command, p.stdout || "");
            if (Object.keys(F).length > 0) {
              P = F;
            }
          }
          logEvent("tengu_powershell_tool_command_executed", {
            command_type: $ht(e.command),
            stdout_length: M.length,
            stderr_length: L.length,
            exit_code: p.code,
            interrupted: p.interrupted,
            powershell_edition: (await hGt()) ?? "unknown",
            destructive_category: f ?? "none",
            destructive_target_scope: Xce(e.command, Nt(), f),
            permission_mode: getToolPermissionContext(t).mode
          });
          return {
            data: {
              stdout: M,
              stderr: L,
              interrupted: p.interrupted,
              returnCodeInterpretation: E.message,
              isImage: O,
              persistedOutputPath: k,
              persistedOutputSize: I,
              gitOperation: P
            }
          };
        } finally {
          if (i) {
            i(null);
          }
          if (t.toolUseId) {
            a?.({
              kind: "clear",
              toolUseId: t.toolUseId
            });
          }
        }
      },
      isResultTruncated(e, {
        columns: t
      }) {
        if (e.isImage) {
          return false;
        }
        return EU(e.stdout, t) || EU(e.stderr, t);
      }
    });
  });
  async function Cpe(e, t, n, r) {
    let o = e;
    if (r === "bash" && !Pu()) {
      throw Error(`Skill ${n} requires bash (\`shell: bash\` in frontmatter) but Git Bash was not found. Install Git for Windows (https://git-scm.com/downloads/win), or change the skill's frontmatter to \`shell: powershell\`.`);
    }
    let s = r === "powershell" && uU() ? z9a() : Pu() ? xl : z9a();
    let i = e.matchAll(P9p);
    let a = e.includes("!`") ? e9n(e).matchAll(O9p) : [];
    await Promise.all([...i, ...a].map(async l => {
      let c = l[1]?.trim();
      if (c) {
        try {
          let u = await hasPermissionsToUseTool(s, {
            command: c
          }, t, ST({
            content: []
          }), "");
          if (u.behavior !== "allow") {
            throw logForDebugging(`Shell command permission check failed for command in ${n}: ${c}. Error: ${u.message}`), new O7(`Shell command permission check failed for pattern "${l[0]}": ${u.message || "Permission denied"}`);
          }
          let {
            data: d
          } = await s.call({
            command: c
          }, t);
          let p = await xmt(s, d, K9a.randomUUID());
          let m = typeof p.content === "string" ? p.content : Y9a(d.stdout, d.stderr);
          o = o.replace(l[0], () => m);
        } catch (u) {
          if (u instanceof O7) {
            throw u;
          }
          D9p(u, l[0]);
        }
      }
    }));
    return o;
  }
  function Y9a(e, t, n = false) {
    let r = [];
    if (e.trim()) {
      r.push(e.trim());
    }
    if (t.trim()) {
      if (n) {
        r.push(`[stderr: ${t.trim()}]`);
      } else {
        r.push(`[stderr]
${t.trim()}`);
      }
    }
    return r.join(n ? " " : `
`);
  }
  function D9p(e, t, n = false) {
    if (e instanceof RN) {
      if (e.interrupted) {
        throw new O7(`Shell command interrupted for pattern "${t}": [Command interrupted]`);
      }
      let s = Y9a(e.stdout, e.stderr, n);
      throw new O7(`Shell command failed for pattern "${t}": ${s}`);
    }
    let r = he(e);
    let o = n ? `[Error: ${r}]` : `[Error]
${r}`;
    throw new O7(o);
  }
  var K9a;
  var z9a;
  var P9p;
  var O9p;
  var l8e = __lazy(() => {
    R$();
    je();
    dt();
    ro();
    oy();
    Q6e();
    zI();
    Jf();
    K9a = require("crypto");
    z9a = (() => {
      let e;
      return () => {
        if (!e) {
          e = (h6t(), __toCommonJS(f6t)).PowerShellTool;
        }
        return e;
      };
    })();
    P9p = /```!\s*\n?([\s\S]*?)\n?```/g;
    O9p = /(?<=^|\s)!`([^`]+)`/gm;
  });
  function U9n() {
    if (Me.CLAUDE_CODE_IS_COWORK) {
      return true;
    }
    if (getSettingsForSource("policySettings")?.disableSkillShellExecution === true) {
      return true;
    }
    return getInitialSettings().disableSkillShellExecution === true;
  }
  function B9n(e) {
    let t = e.replace(M9p, "[shell command execution disabled by policy]");
    if (t.includes("!`")) {
      let n = e9n(t);
      for (let r of [...n.matchAll(N9p)].reverse()) {
        t = t.slice(0, r.index) + "[shell command execution disabled by policy]" + t.slice(r.index + r[0].length);
      }
    }
    return t;
  }
  var M9p;
  var N9p;
  var Tvo = __lazy(() => {
    pr();
    Q6e();
    M9p = /```!\s*\n?[\s\S]*?\n?```/g;
    N9p = /(?<=^|\s)!`[^`]+`/gm;
  });
  function PEe(e, t) {
    let n = X9a.get(e);
    if (n !== undefined && n === t) {
      return n;
    }
    X9a.set(e, t);
    return t;
  }
  var X9a;
  var Evo = __lazy(() => {
    X9a = new Map();
  });
  var vvo = __lazy(() => {
    je();
    dt();
  });
  function F9p(e, t) {
    if (t === "policySettings") {
      return false;
    }
    return e === "skills" || e === "commands_DEPRECATED" || e === "plugin";
  }
  function u8e(e, t) {
    switch (e) {
      case "policySettings":
        return pf.join(SI(), ".claude", t);
      case "userSettings":
        return pf.join(er(), t);
      case "projectSettings":
        return `.claude/${t}`;
      case "plugin":
        return "plugin";
      default:
        return "";
    }
  }
  function Cvo(e) {
    return [e.name, e.description, e.whenToUse].filter(Boolean).join(" ");
  }
  function Rvo(e, t) {
    return xm(Cvo(e), t);
  }
  async function U9p(e) {
    try {
      return await wvo.realpath(e);
    } catch {
      return null;
    }
  }
  function B9p(e, t) {
    if (!e.hooks) {
      return;
    }
    let n = cW().safeParse(e.hooks);
    if (!n.success) {
      logForDebugging(`Invalid hooks in skill '${t}': ${n.error.message}`);
      return;
    }
    return n.data;
  }
  function $9p(e) {
    if (!e.paths) {
      return;
    }
    let t = y$t(e.paths).map(n => n.endsWith("/**") ? n.slice(0, -3) : n).filter(n => n.length > 0);
    if (t.length === 0 || t.every(n => n === "**")) {
      return;
    }
    return t;
  }
  function xvo(e, t, n, r = "Skill") {
    let o = M2(e.description, n);
    let s = o ?? Rpe(t, r);
    let i = e["user-invocable"] === undefined ? true : Qat(e["user-invocable"]);
    let a = e.model;
    let l;
    if (typeof a === "string" && a.trim().length > 0) {
      let d = a.trim();
      l = d === "inherit" ? undefined : parseUserSpecifiedModel(d);
    }
    let c = e.effort;
    let u = c !== undefined ? L2(c) : undefined;
    if (c !== undefined && u === undefined) {
      logForDebugging(`Skill ${n} has invalid effort '${c}'. Valid options: ${UC.join(", ")} or an integer`);
    }
    return {
      displayName: e.name != null ? String(e.name) : undefined,
      description: s,
      hasUserSpecifiedDescription: o !== null,
      allowedTools: bQ(e["allowed-tools"]),
      disallowedTools: bQ(e["disallowed-tools"] ?? e.disallowedTools),
      argumentHint: e["argument-hint"] != null ? String(e["argument-hint"]) : undefined,
      argumentNames: t9n(e.arguments),
      whenToUse: e.when_to_use != null ? String(e.when_to_use) : undefined,
      version: e.version != null ? String(e.version) : undefined,
      model: l,
      disableModelInvocation: Qat(e["disable-model-invocation"]),
      userInvocable: i,
      hooks: B9p(e, n),
      executionContext: e.context === "fork" ? "fork" : undefined,
      agent: e.agent != null ? String(e.agent) : undefined,
      effort: u,
      shell: TDn(e.shell, n),
      createdBy: e.created_by === "dream-proposal" || e.improved_by === "dream-proposal" ? "dream-proposal" : undefined,
      declaredFields: SDn(e),
      fallback: eWe(e.fallback)
    };
  }
  function H9p(e) {
    let t = e.directoryRead ? ` Call ${"ReadMcpResourceDirTool"} on "${e.uri}" or a subdirectory URI to list its contents.` : "";
    return `This skill is served by MCP server "${e.server}" at ${e.uri}. ` + `To read a supporting file this skill references by a relative path \u2014 for example "templates/invoice.md" \u2014 call ${"ReadMcpResourceTool"} with server "${e.server}" and uri "${e.uri}/templates/invoice.md".${t}`;
  }
  function g6t({
    skillName: e,
    displayName: t,
    description: n,
    hasUserSpecifiedDescription: r,
    markdownContent: o,
    contentHash: s,
    allowedTools: i,
    disallowedTools: a,
    argumentHint: l,
    argumentNames: c,
    whenToUse: u,
    version: d,
    model: p,
    disableModelInvocation: m,
    userInvocable: f,
    source: h,
    baseDir: g,
    mcpResourceRoot: y,
    loadedFrom: _,
    hooks: b,
    executionContext: S,
    agent: E,
    paths: C,
    effort: x,
    shell: A,
    createdBy: k,
    declaredFields: I,
    fallback: O
  }) {
    if (g && i.length > 0) {
      let M = g;
      i = i.map(L => L.replace(/\$\{CLAUDE_SKILL_DIR\}/g, () => M));
    }
    if (i.length > 0) {
      let L = getProjectRoot();
      i = i.map(P => P.replace(/\$\{CLAUDE_PROJECT_DIR\}/g, () => L));
    }
    return {
      type: "prompt",
      name: e,
      description: n,
      hasUserSpecifiedDescription: r,
      allowedTools: i,
      disallowedTools: a?.length ? a : undefined,
      argumentHint: l,
      argNames: c.length > 0 ? c : undefined,
      whenToUse: u,
      version: d,
      model: p,
      disableModelInvocation: m,
      userInvocable: f,
      context: S,
      agent: E,
      effort: x,
      paths: C,
      declaredFields: I,
      contentLength: o.length,
      contentHash: s ?? Bun.hash(o).toString(36),
      isHidden: !f,
      progressMessage: "running",
      userFacingName() {
        return t || e;
      },
      source: h,
      loadedFrom: _,
      createdBy: k,
      fallback: O,
      hooks: b,
      skillRoot: g,
      async getPromptForCommand(M, L) {
        let P = g ? `Base directory for this skill: ${g}

${o}` : y ? `${H9p(y)}

${o}` : o;
        if (P = Pht(P, M, true, c, oz), g) {
          let F = g;
          P = P.replaceAll("${CLAUDE_SKILL_DIR}", F);
        }
        {
          let H = getProjectRoot();
          P = P.replace(/\$\{CLAUDE_PROJECT_DIR\}/g, () => H);
        }
        if (P = P.replace(/\$\{CLAUDE_SESSION_ID\}/g, getSessionId()), P = P.replaceAll("${CLAUDE_EFFORT}", r1(p ?? L.options.mainLoopModel, x ?? getEffortValue(L))), F9p(_, h) && U9n()) {
          P = B9n(P);
        } else if (_ !== "mcp") {
          P = await Cpe(P, {
            ...L,
            getAppState() {
              let F = L.getAppState();
              return {
                ...F,
                toolPermissionContext: {
                  ...F.toolPermissionContext,
                  alwaysAllowRules: {
                    ...F.toolPermissionContext.alwaysAllowRules,
                    command: i
                  }
                }
              };
            }
          }, `/${e}`, A);
        }
        return [{
          type: "text",
          text: P
        }];
      }
    };
  }
  async function Ght(e, t) {
    let n = zt();
    let r;
    try {
      r = await n.readdir(e);
    } catch (a) {
      if (!Io(a)) {
        logForDebugging(`Failed to read skills directory ${e}: ${a}`, {
          level: "error"
        });
        Et("skill_load_dir", "skill_load_readdir_failed");
      }
      return [];
    }
    if (r.length === 0 && e.startsWith("/mnt/")) {
      await sleep(250);
      try {
        let a = await n.readdir(e);
        if (a.length > 0) {
          logForDebugging(`Skills directory ${e}: first readdir was empty, retry returned ${a.length} entries (transient mount race)`, {
            level: "warn"
          });
          Et("skill_load_dir", "skill_load_mnt_transient_empty");
          r = a;
        } else {
          Et("skill_load_dir", "skill_load_mnt_persistent_empty");
        }
      } catch (a) {
        let l = gd(a);
        if (Et("skill_load_dir", `skill_load_mnt_retry_${(l ?? "unknown").toLowerCase()}`), !Io(a)) {
          logForDebugging(`Skills directory ${e}: retry readdir failed: ${a}`, {
            level: "error"
          });
        }
      }
    }
    let o = null;
    let s = new Set();
    {
      let a = `@${"skills-dir"}`;
      if (t === "userSettings" && e === pf.join(er(), "skills") || t === "projectSettings" && e === pf.join(getOriginalCwd(), ".claude", "skills")) {
        let c = getInitialSettings().enabledPlugins;
        for (let u in c) {
          if (c[u] === false && u.endsWith(a)) {
            s.add(u.slice(0, -a.length));
          }
        }
      }
    }
    let i = await Promise.all(r.map(async a => {
      try {
        if (!a.isDirectory() && !a.isSymbolicLink()) {
          return null;
        }
        let l = pf.join(e, a.name);
        let c = pf.join(l, "SKILL.md");
        if (s.size > 0) {
          let S = a.name;
          try {
            let E = await $F(n, pf.join(l, ".claude-plugin", "plugin.json"), 1e6);
            if (E === null) {
              logForDebugging(`[skills] skipping ${l}: .claude-plugin/plugin.json is not a regular file or exceeds ${1e6} byte limit`, {
                level: "warn"
              });
              o = "skill_load_read_failed";
              return null;
            }
            let C = JSON.parse(E);
            if (C !== null && typeof C === "object" && "name" in C && typeof C.name === "string" && C.name) {
              S = C.name;
            }
          } catch (E) {
            if (!fn(E)) {
              ;
            } else {
              S = null;
            }
          }
          if (S !== null && s.vZc(S)) {
            return null;
          }
        }
        let u = null;
        try {
          u = await n.stat(c);
        } catch {}
        if (u !== null && !u.isFile()) {
          logForDebugging(`[skills] skipping ${c}: not a regular file`, {
            level: "warn"
          });
          o = "skill_load_read_failed";
          return null;
        }
        let d = u?.size ?? 0;
        if (d > 1e6) {
          logForDebugging(`[skills] skipping ${c}: ${d} bytes exceeds ${1e6} byte limit`, {
            level: "warn"
          });
          o = "skill_load_too_large";
          return null;
        }
        let p;
        try {
          p = await n.readFile(c, {
            encoding: "utf-8"
          });
        } catch (S) {
          if (!fn(S)) {
            logForDebugging(`[skills] failed to read ${c}: ${S}`, {
              level: "warn"
            });
            o = "skill_load_read_failed";
          }
          return null;
        }
        let {
          frontmatter: m,
          content: f,
          parseError: h
        } = sf(p, c, {
          normalizeKeys: true
        });
        if (h) {
          logForDebugging(`[skills] YAML frontmatter in ${c} failed to parse and was ignored: ${h}`, {
            level: "error"
          });
          Et("skill_load_dir", "skill_load_yaml_failed");
        }
        let g = PEe(c, f);
        let y = a.name;
        Z4e("skill", m);
        let _ = xvo(m, g, y);
        let b = $9p(m);
        return {
          skill: g6t({
            ..._,
            skillName: y,
            markdownContent: g,
            contentHash: Bun.hash(p).toString(36),
            source: t,
            baseDir: l,
            loadedFrom: "skills",
            paths: b
          }),
          filePath: c
        };
      } catch (l) {
        logForDebugging(`[skills] failed to parse ${pf.join(e, a.name, "SKILL.md")}: ${l}`, {
          level: "error"
        });
        o = "skill_load_parse_failed";
        return null;
      }
    }));
    if (o) {
      Ae("skill_load_dir", o);
    } else {
      Pe("skill_load_dir");
    }
    return i.filter(a => a !== null).sort((a, l) => a.skill.name.localeCompare(l.skill.name));
  }
  function kvo(e) {
    return /^skill\.md$/i.test(pf.basename(e));
  }
  function j9p(e) {
    let t = new Map();
    for (let r of e) {
      let o = pf.dirname(r.filePath);
      let s = t.get(o) ?? [];
      s.push(r);
      t.set(o, s);
    }
    let n = [];
    for (let [r, o] of t) {
      let s = o.filter(i => kvo(i.filePath));
      if (s.length > 0) {
        let i = s[0];
        if (s.length > 1) {
          logForDebugging(`Multiple skill files found in ${r}, using ${pf.basename(i.filePath)}`);
        }
        n.push(i);
      } else {
        n.push(...o);
      }
    }
    return n;
  }
  function Z9a(e, t) {
    let n = t.endsWith(pf.sep) ? t.slice(0, -1) : t;
    if (!e.startsWith(n + pf.sep)) {
      return "";
    }
    let r = e.slice(n.length + 1);
    return r ? r.split(pf.sep).join(":") : "";
  }
  function q9p(e, t) {
    let n = pf.dirname(e);
    let r = pf.dirname(n);
    let o = pf.basename(n);
    let s = Z9a(r, t);
    return s ? `${s}:${o}` : o;
  }
  function W9p(e, t) {
    let n = pf.basename(e);
    let r = pf.dirname(e);
    let o = n.replace(/\.md$/, "");
    let s = Z9a(r, t);
    return s ? `${s}:${o}` : o;
  }
  function G9p(e) {
    return kvo(e.filePath) ? q9p(e.filePath, e.baseDir) : W9p(e.filePath, e.baseDir);
  }
  async function V9p(e, t) {
    try {
      let [n, r] = await Promise.all([E9("commands", e), Promise.all(t.map(l => {
        let c = pf.join(l, ".claude", "commands");
        return Kht(c).then(u => u.map(d => ({
          ...d,
          baseDir: c,
          source: "projectSettings"
        })));
      }))]);
      let o = [...n, ...r.flat()];
      let s = j9p(o);
      let i = [];
      let a = false;
      for (let {
        baseDir: l,
        filePath: c,
        frontmatter: u,
        content: d,
        source: p
      } of s) {
        try {
          let f = kvo(c) ? pf.dirname(c) : undefined;
          let h = G9p({
            baseDir: l,
            filePath: c,
            frontmatter: u,
            content: d,
            source: p
          });
          Z4e("skill", u);
          let g = xvo(u, d, h, "Custom command");
          i.push({
            skill: g6t({
              ...g,
              skillName: h,
              displayName: undefined,
              markdownContent: PEe(c, d),
              source: p,
              baseDir: f,
              loadedFrom: "commands_DEPRECATED",
              paths: undefined
            }),
            filePath: c
          });
        } catch (m) {
          logForDebugging(`[skills] failed to load command from ${c}: ${m}`, {
            level: "error"
          });
          a = true;
        }
      }
      if (a) {
        Ae("skill_load_commands_dir", "skill_load_commands_parse_failed");
      } else {
        Pe("skill_load_commands_dir");
      }
      return i.sort((l, c) => l.skill.name.localeCompare(c.skill.name));
    } catch (n) {
      if (Zd(n)) {
        logForDebugging(`[skills] commands-dir load failed: ${n.code}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
      Et("skill_load_commands_dir", "skill_load_commands_dir_failed");
      return [];
    }
  }
  async function e5a() {
    if (ZT("skills") || !qf("userSettings") || kd() || Pc("skills")) {
      return null;
    }
    let e = pf.join(er(), "skills");
    let t;
    try {
      t = await zt().readdir(e);
    } catch {
      return null;
    }
    let n = `@${"skills-dir"}`;
    let r = getInitialSettings().enabledPlugins;
    let o = new Set();
    for (let i in r) {
      if (r[i] === false && i.endsWith(n)) {
        o.add(i.slice(0, -n.length));
      }
    }
    let s = await Promise.all(t.map(async i => {
      if (!i.isDirectory() && !i.isSymbolicLink()) {
        return null;
      }
      if (o.vZc(i.name)) {
        return null;
      }
      try {
        return await wvo.realpath(pf.join(e, i.name, "SKILL.md"));
      } catch {
        return null;
      }
    }));
    return new Set(s.filter(i => i !== null));
  }
  function d8e() {
    c8e.cache?.clear?.();
    E9.cache?.clear?.();
    let e = b6t();
    if (e) {
      e.conditionalSkills.clear();
      e.activatedConditionalSkillNames.clear();
    }
  }
  function Avo() {
    return {
      dynamicSkillDirs: new Set(),
      dynamicSkills: new Map(),
      conditionalSkills: new Map(),
      activatedConditionalSkillNames: new Set()
    };
  }
  function getDynamicSkillStateKey() {
    return y6t();
  }
  function S9() {
    let e = y6t();
    let t = $9n.get(e);
    if (!t) {
      t = Avo();
      $9n.set(e, t);
    }
    return t;
  }
  function b6t() {
    return $9n.get(y6t()) ?? null;
  }
  function t5a(e) {
    $9n.set(y6t(), e);
  }
  function n5a(e) {
    return Ivo.subscribe(() => {
      try {
        e();
      } catch (t) {
        Oe(t);
      }
    });
  }
  async function Vht(e, t) {
    if (Pc("skills")) {
      return [];
    }
    let n = zt();
    let r = t.endsWith(pf.sep) ? t.slice(0, -1) : t;
    let o = [];
    for (let s of e) {
      let i = pf.dirname(s);
      while (i.startsWith(r + pf.sep)) {
        let a = pf.join(i, ".claude", "skills");
        if (!S9().dynamicSkillDirs.vZc(a)) {
          S9().dynamicSkillDirs.add(a);
          try {
            if (await n.stat(a), await Ugn(i, r)) {
              logForDebugging(`[skills] Skipped gitignored skills dir: ${a}`);
              continue;
            }
            o.push(a);
          } catch {}
        }
        let l = pf.dirname(i);
        if (l === i) {
          break;
        }
        i = l;
      }
    }
    return o;
  }
  function r5a(e) {
    return `${e.type === "prompt" ? e.skillRoot ?? "" : ""}\x00${e.name}`;
  }
  async function INe(e) {
    if (Pc("skills") || !qf("projectSettings") || ZT("skills")) {
      logForDebugging("[skills] Dynamic skill discovery skipped: projectSettings disabled or plugin-only policy");
      return;
    }
    if (e.length === 0) {
      return;
    }
    let t = await Promise.all(e.map(o => Ght(o, "projectSettings")));
    let n = new Set(S9().dynamicSkills.keys());
    for (let o of t) {
      for (let {
        skill: s
      } of o) {
        if (s.type === "prompt") {
          S9().dynamicSkills.set(r5a(s), s);
        }
      }
    }
    let r = t.flat().length;
    if (r > 0) {
      let o = [...S9().dynamicSkills.keys()].filter(s => !n.vZc(s));
      if (logForDebugging(`[skills] Dynamically discovered ${r} skills from ${e.length} directories`), o.length > 0) {
        logEvent("tengu_dynamic_skills_changed", {
          source: "file_operation",
          previousCount: n.size,
          newCount: S9().dynamicSkills.size,
          addedCount: o.length,
          directoryCount: e.length
        });
      }
    }
    Ivo.emit();
  }
  function o5a() {
    return Array.from(b6t()?.dynamicSkills.entries() ?? []).sort(([e, t], [n, r]) => t.name === r.name ? e.localeCompare(n) : t.name.localeCompare(r.name)).map(([, e]) => e);
  }
  function zht(e, t) {
    if ((b6t()?.conditionalSkills.size ?? 0) === 0) {
      return [];
    }
    let n = [];
    for (let [r, o] of S9().conditionalSkills) {
      if (o.type !== "prompt" || !o.paths || o.paths.length === 0) {
        continue;
      }
      let s = Q9a.default().add(o.paths);
      for (let i of e) {
        let a = pf.isAbsolute(i) ? pf.relative(t, i) : i;
        if (!a || a.startsWith("..") || pf.isAbsolute(a)) {
          continue;
        }
        if (s.ignores(a)) {
          S9().dynamicSkills.set(r5a(o), o);
          S9().conditionalSkills.delete(r);
          S9().activatedConditionalSkillNames.add(r);
          n.push(r);
          logForDebugging(`[skills] Activated conditional skill '${r}' (matched path: ${a})`);
          break;
        }
      }
    }
    if (n.length > 0) {
      logEvent("tengu_dynamic_skills_changed", {
        source: "conditional_paths",
        previousCount: S9().dynamicSkills.size - n.length,
        newCount: S9().dynamicSkills.size,
        addedCount: n.length,
        directoryCount: 0
      });
      Ivo.emit();
    }
    return n;
  }
  function s5a() {
    return Array.from(b6t()?.conditionalSkills.values() ?? []);
  }
  function i5a() {
    let e = b6t();
    if (!e) {
      return;
    }
    e.dynamicSkillDirs.clear();
    e.dynamicSkills.clear();
    e.conditionalSkills.clear();
    e.activatedConditionalSkillNames.clear();
  }
  var wvo;
  var Q9a;
  var pf;
  var c8e;
  var y6t = () => "cli";
  var $9n;
  var Ivo;
  var T9 = __lazy(() => {
    at();
    ln();
    Ot();
    aU();
    N6e();
    J5t();
    Sl();
    wb();
    vo();
    je();
    Fp();
    gn();
    dt();
    fv();
    n1();
    $gn();
    Rn();
    v9();
    Eo();
    Kf();
    FEo();
    l8e();
    nf();
    Bte();
    IJ();
    Rj();
    ph();
    Tvo();
    Wk();
    Evo();
    vvo();
    wvo = require("fs/promises");
    Q9a = __toESM(aWe(), 1);
    pf = require("path");
    c8e = TEr(async e => {
      let t = pf.join(er(), "skills");
      let n = pf.join(SI(), ".claude", "skills");
      let r = p8e("skills", e);
      logForDebugging(`Loading skills from: managed=${n}, user=${t}, project=[${r.join(", ")}]`);
      let o = getAdditionalDirectoriesForClaudeMd();
      let s = ZT("skills");
      let i = qf("projectSettings") && !s;
      if (Pc("skills", {
        explicitlyRequested: o.length > 0 && i
      })) {
        logForDebugging("[reduced mode] Skipping skill dir discovery");
        return [];
      }
      if (kd()) {
        return (await Promise.all(o.map(S => Ght(pf.join(S, ".claude", "skills"), "projectSettings")))).flat().map(S => S.skill);
      }
      let [a, l, c, u, d] = await Promise.all([st(process.env.CLAUDE_CODE_DISABLE_POLICY_SKILLS) ? Promise.resolve([]) : Ght(n, "policySettings"), qf("userSettings") && !s ? Ght(t, "userSettings") : Promise.resolve([]), i ? Promise.all(r.map(b => Ght(b, "projectSettings"))) : Promise.resolve([]), i ? Promise.all(o.map(b => Ght(pf.join(b, ".claude", "skills"), "projectSettings"))) : Promise.resolve([]), s ? Promise.resolve([]) : V9p(e, i ? o : [])]);
      let p = [...a, ...l, ...c.flat(), ...u.flat(), ...d];
      let m = await Promise.all(p.map(({
        skill: b,
        filePath: S
      }) => b.type === "prompt" ? U9p(S) : Promise.resolve(null)));
      let f = new Map();
      let h = [];
      for (let b = 0; b < p.length; b++) {
        let S = p[b];
        if (S === undefined || S.skill.type !== "prompt") {
          continue;
        }
        let {
          skill: E
        } = S;
        let C = m[b];
        if (C === null || C === undefined) {
          h.push(E);
          continue;
        }
        let x = f.get(C);
        if (x !== undefined) {
          logForDebugging(`Skipping duplicate skill '${E.name}' from ${E.source} (same file already loaded from ${x})`);
          continue;
        }
        f.set(C, E.source);
        h.push(E);
      }
      gOe("skill", h.map(b => ({
        name: b.name,
        source: b.source
      })), {
        resolves: false
      });
      let g = p.length - h.length;
      if (g > 0) {
        logForDebugging(`Deduplicated ${g} skills (same file)`);
      }
      let y = [];
      let _ = [];
      for (let b of h) {
        if (b.type === "prompt" && b.paths && b.paths.length > 0 && !S9().activatedConditionalSkillNames.vZc(b.name)) {
          _.push(b);
        } else {
          y.push(b);
        }
      }
      for (let b of _) {
        S9().conditionalSkills.set(b.name, b);
      }
      if (_.length > 0) {
        logForDebugging(`[skills] ${_.length} conditional skills stored (activated when matching files are touched)`);
      }
      logForDebugging(`Loaded ${h.length} unique skills (${y.length} unconditional, ${_.length} conditional, managed: ${a.length}, user: ${l.length}, project: ${c.flat().length}, additional: ${u.flat().length}, legacy commands: ${d.length})`);
      return y;
    }, e => `${y6t()}:${e}`);
    if (!(c8e.cache instanceof Map)) {
      c8e.cache = new Map();
    }
    $9n = new Map();
    Ivo = Si();
    DNa({
      createSkillCommand: g6t,
      parseSkillFrontmatterFields: xvo
    });
  });
  function Pvo() {
    let e = process.env.CLAUDE_BG_ISOLATION;
    if (e === "worktree" || e === "none") {
      return e;
    }
    let t = WY();
    if (t) {
      return t.bgIsolation;
    }
    return getInitialSettings().worktree?.bgIsolation;
  }
  function Jht(e, t) {
    {
      if (t.agentWorktree) {
        let o = getOriginalCwd();
        return e.startsWith(o + Yht.sep) && !e.startsWith(t.agentWorktree + Yht.sep) ? `This agent is isolated in the worktree ${t.agentWorktree}. Edit the worktree copy of this file instead of the shared-checkout path.` : null;
      }
      if (process.env.CLAUDE_CODE_SESSION_KIND !== "bg" && !WY()) {
        return null;
      }
      let n = getCurrentWorktreeSession();
      if (n) {
        return e.startsWith(n.originalCwd + Yht.sep) && !e.startsWith(n.worktreePath + Yht.sep) ? `This session is now isolated in ${n.worktreePath}. Edit the worktree copy of this file instead of the shared-checkout path.` : null;
      }
      if (Pvo() === "none") {
        return null;
      }
      let r = t.agentId ? getOriginalCwd() : Nt();
      if (!e.startsWith(r + Yht.sep)) {
        return null;
      }
      if (!findGitRoot(r) && !hasWorktreeCreateHook()) {
        return null;
      }
      if (isLinkedWorktree(r)) {
        return null;
      }
      if (t.agentId) {
        return `This subagent's parent bg session hasn't isolated yet, so writes to the shared checkout are blocked. Re-spawn this agent with \`isolation: "worktree"\`, or have the parent call ${"EnterWorktree"} before spawning. (To disable this guard for this repo, set \`"worktree": {"bgIsolation": "none"}\` in .claude/settings.json.)`;
      }
      return `This background session hasn't isolated its changes yet. Call ${"EnterWorktree"} first so edits land in a worktree instead of the shared checkout, then retry this edit using the worktree path. (To disable this guard for this repo, set \`"worktree": {"bgIsolation": "none"}\` in .claude/settings.json.)`;
    }
    return null;
  }
  var Yht;
  var S6t = __lazy(() => {
    at();
    vo();
    na();
    lWe();
    Yht = require("path");
  });
  function Goe(e) {
    let t = {
      operation: e.operation,
      tool: e.tool,
      filePathHash: Ovo.createHash("sha256").update(e.filePath).digest("hex").slice(0, 16)
    };
    if (e.content !== undefined && e.content.length <= 102400) {
      t.contentHash = Ovo.createHash("sha256").update(e.content).digest("hex");
    }
    if (e.type !== undefined) {
      t.type = e.type;
    }
    logEvent("tengu_file_operation", t);
  }
  var Ovo;
  var H9n = __lazy(() => {
    Ot();
    Ovo = require("crypto");
  });
  async function j9n(e) {
    if (!(await getIsGit())) {
      return null;
    }
    if (await c5a()) {
      return null;
    }
    let n = await a5a("HEAD", e);
    if (n === null) {
      return null;
    }
    if (n.stats.filesCount > 500) {
      return {
        ...n,
        hunks: new Map(),
        source: {
          kind: "working-tree"
        }
      };
    }
    let r = 50 - n.perFileStats.size;
    if (r > 0) {
      let i = await n5p(r, e);
      if (i) {
        n.stats.filesCount += i.size;
        for (let [a, l] of i) {
          n.perFileStats.set(a, l);
        }
      }
    }
    if (n.stats.filesCount > 0) {
      return {
        ...n,
        hunks: new Map(),
        source: {
          kind: "working-tree"
        }
      };
    }
    let o = await t5p(e);
    if (o === null) {
      return {
        ...n,
        hunks: new Map(),
        source: {
          kind: "working-tree"
        }
      };
    }
    let s = await a5a(o.mergeBase, e);
    if (s === null || s.stats.filesCount === 0) {
      return {
        ...n,
        hunks: new Map(),
        source: {
          kind: "working-tree"
        }
      };
    }
    return {
      ...s,
      hunks: new Map(),
      source: {
        kind: "branch",
        baseBranch: o.baseBranch,
        baseRef: o.mergeBase
      }
    };
  }
  async function a5a(e, t) {
    let {
      stdout: n,
      code: r
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "diff", e, "--shortstat"], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: t
    });
    if (r === 0) {
      let i = W9n(n);
      if (i && i.filesCount > 500) {
        return {
          stats: i,
          perFileStats: new Map()
        };
      }
    }
    let {
      stdout: o,
      code: s
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "diff", e, "--numstat"], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: t
    });
    if (s !== 0) {
      return null;
    }
    return Z9p(o);
  }
  async function q9n(e, t = "HEAD") {
    if (!(await getIsGit())) {
      return null;
    }
    if (await c5a()) {
      return null;
    }
    let {
      stdout: r,
      code: o
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "diff", t, "--shortstat"], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: e
    });
    if (o === 0) {
      let a = W9n(r);
      if (a && a.filesCount > 500) {
        return {
          hunks: new Map(),
          skippedLarge: new Set()
        };
      }
    }
    let {
      stdout: s,
      code: i
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "diff", t], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: e
    });
    if (i !== 0) {
      return null;
    }
    return e5p(s);
  }
  async function Lvo(e) {
    let {
      stdout: t,
      code: n
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "rev-parse", "--show-toplevel"], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: e
    });
    if (n !== 0 || t.trim() === "") {
      return null;
    }
    return t.trim();
  }
  function Z9p(e) {
    let t = e.trim().split(`
`).filter(Boolean);
    let n = 0;
    let r = 0;
    let o = 0;
    let s = new Map();
    for (let i of t) {
      let a = i.split("\t");
      if (a.length < 3) {
        continue;
      }
      o++;
      let l = a[0];
      let c = a[1];
      let u = a.slice(2).join("\t");
      let d = l === "-" || c === "-";
      let p = d ? 0 : parseInt(l ?? "0", 10) || 0;
      let m = d ? 0 : parseInt(c ?? "0", 10) || 0;
      if (n += p, r += m, s.size < 50) {
        s.set(u, {
          added: p,
          removed: m,
          isBinary: d,
          isUntracked: false
        });
      }
    }
    return {
      stats: {
        filesCount: o,
        linesAdded: n,
        linesRemoved: r
      },
      perFileStats: s
    };
  }
  function e5p(e) {
    let t = new Map();
    let n = new Set();
    if (!e.trim()) {
      return {
        hunks: t,
        skippedLarge: n
      };
    }
    let r = e.split(/^diff --git /m).filter(Boolean);
    for (let o of r) {
      if (t.size + n.size >= 50) {
        break;
      }
      let s = o.indexOf(`
`);
      let a = (s === -1 ? o : o.slice(0, s)).match(/^a\/(.+?) b\/(.+)$/);
      if (!a) {
        continue;
      }
      let l = a[2] ?? a[1] ?? "";
      if (o.length > 1e6) {
        n.add(l);
        continue;
      }
      let c = o.split(`
`);
      let u = [];
      let d = null;
      let p = 0;
      for (let m = 1; m < c.length; m++) {
        let f = c[m] ?? "";
        let h = f.match(/^@@ -(\d+)(?:,(\d+))? \+(\d+)(?:,(\d+))? @@/);
        if (h) {
          if (d) {
            u.push(d);
          }
          d = {
            oldStart: parseInt(h[1] ?? "0", 10),
            oldLines: parseInt(h[2] ?? "1", 10),
            newStart: parseInt(h[3] ?? "0", 10),
            newLines: parseInt(h[4] ?? "1", 10),
            lines: []
          };
          continue;
        }
        if (f.startsWith("index ") || f.startsWith("---") || f.startsWith("+++") || f.startsWith("new file") || f.startsWith("deleted file") || f.startsWith("old mode") || f.startsWith("new mode") || f.startsWith("Binary files")) {
          continue;
        }
        if (d && (f.startsWith("+") || f.startsWith("-") || f.startsWith(" ") || f === "")) {
          if (p >= 400) {
            continue;
          }
          d.lines.push("" + f);
          p++;
        }
      }
      if (d) {
        u.push(d);
      }
      if (u.length > 0) {
        t.set(l, u);
      }
    }
    return {
      hunks: t,
      skippedLarge: n
    };
  }
  async function c5a() {
    let e = await getGitDir(Nt());
    if (!e) {
      return false;
    }
    return (await Promise.all(["MERGE_HEAD", "REBASE_HEAD", "CHERRY_PICK_HEAD", "REVERT_HEAD"].map(r => Xht.access(OEe.join(e, r)).then(() => true).catch(() => false)))).some(Boolean);
  }
  async function t5p(e) {
    let [t, n] = await Promise.all([getBranch(), getDefaultBranch()]);
    if (!t || t === "HEAD" || t === n) {
      return null;
    }
    if (n.startsWith("-")) {
      return null;
    }
    let r = {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: e
    };
    let o = await u5a(n, i => execFileNoThrow(gitExe(), i, r));
    if (!o) {
      return null;
    }
    let s = await execFileNoThrow(gitExe(), ["--no-optional-locks", "rev-parse", "HEAD"], r);
    if (s.code !== 0 || s.stdout.trim() === o) {
      return null;
    }
    return {
      mergeBase: o,
      baseBranch: n
    };
  }
  async function n5p(e, t) {
    let {
      stdout: n,
      code: r
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "ls-files", "--others", "--exclude-standard", "--full-name"], {
      timeout: 5000,
      preserveOutputOnError: false,
      abortSignal: t
    });
    if (r !== 0 || !n.trim()) {
      return null;
    }
    let o = n.trim().split(`
`).filter(Boolean);
    if (o.length === 0) {
      return null;
    }
    let s = findGitRoot(Nt()) ?? Nt();
    let i = getSessionStartTime();
    let a = (await Promise.all(o.slice(0, 500).map(async c => {
      try {
        let u = await Xht.lstat(OEe.join(s, c));
        return Math.max(u.mtimeMs, u.ctimeMs) >= i ? c : null;
      } catch {
        return c;
      }
    }))).filter(c => c !== null);
    if (a.length === 0) {
      return null;
    }
    let l = new Map();
    for (let c of a.slice(0, e)) {
      l.set(c, {
        added: 0,
        removed: 0,
        isBinary: false,
        isUntracked: true
      });
    }
    return l;
  }
  function W9n(e) {
    let t = e.match(/(\d+)\s+files?\s+changed(?:,\s+(\d+)\s+insertions?\(\+\))?(?:,\s+(\d+)\s+deletions?\(-\))?/);
    if (!t) {
      return null;
    }
    return {
      filesCount: parseInt(t[1] ?? "0", 10),
      linesAdded: parseInt(t[2] ?? "0", 10),
      linesRemoved: parseInt(t[3] ?? "0", 10)
    };
  }
  async function G9n(e) {
    let t = findGitRoot(OEe.dirname(e));
    if (!t) {
      return null;
    }
    let n = OEe.relative(t, e).split(OEe.sep).join("/");
    let r = getCachedRepository();
    let {
      code: o
    } = await execFileNoThrowWithCwd(gitExe(), ["--no-optional-locks", "ls-files", "--error-unmatch", "--", n], {
      cwd: t,
      timeout: 3000
    });
    if (o === 0) {
      let i = await o5p(t);
      let {
        stdout: a,
        code: l
      } = await execFileNoThrowWithCwd(gitExe(), ["--no-optional-locks", "diff", i, "--", n], {
        cwd: t,
        timeout: 3000
      });
      if (l !== 0) {
        return null;
      }
      if (!a) {
        return null;
      }
      return {
        ...r5p(n, a, "modified"),
        repository: r
      };
    }
    let s = await s5p(n, e);
    if (!s) {
      return null;
    }
    return {
      ...s,
      repository: r
    };
  }
  function r5p(e, t, n) {
    let r = t.split(`
`);
    let o = [];
    let s = false;
    let i = 0;
    let a = 0;
    for (let l of r) {
      if (l.startsWith("@@")) {
        s = true;
      }
      if (s) {
        if (o.push(l), l.startsWith("+") && !l.startsWith("+++")) {
          i++;
        } else if (l.startsWith("-") && !l.startsWith("---")) {
          a++;
        }
      }
    }
    return {
      filename: e,
      status: n,
      additions: i,
      deletions: a,
      changes: i + a,
      patch: o.join(`
`)
    };
  }
  async function u5a(e, t) {
    let n = [];
    for (let i of [`origin/${e}`, e]) {
      let {
        stdout: a,
        code: l
      } = await t(["--no-optional-locks", "merge-base", "HEAD", i]);
      if (l === 0 && a.trim()) {
        n.push(a.trim());
      }
    }
    let [r, o] = n;
    if (!r) {
      return null;
    }
    if (!o || r === o) {
      return r;
    }
    let {
      code: s
    } = await t(["--no-optional-locks", "merge-base", "--is-ancestor", r, o]);
    return s === 0 ? o : r;
  }
  async function o5p(e) {
    let t = U4i(e);
    let n = (t !== undefined ? F4i().get(t) : undefined) || process.env.CLAUDE_CODE_BASE_REF;
    function r(a) {
      return execFileNoThrowWithCwd(gitExe(), a, {
        cwd: e,
        timeout: 3000
      });
    }
    if (!n) {
      let a = await getDefaultBranch();
      if (a.startsWith("-")) {
        return "HEAD";
      }
      return (await u5a(a, r)) ?? "HEAD";
    }
    let o = n.startsWith("-") ? "HEAD" : n;
    let {
      stdout: s,
      code: i
    } = await r(["--no-optional-locks", "merge-base", "HEAD", o]);
    if (i === 0 && s.trim()) {
      return s.trim();
    }
    return "HEAD";
  }
  async function s5p(e, t) {
    try {
      if (!dgn(t, 1e6)) {
        return null;
      }
      let r = (await Xht.readFile(t, "utf-8")).split(`
`);
      if (r.length > 0 && r.at(-1) === "") {
        r.pop();
      }
      let o = r.length;
      let s = r.map(a => `+${a}`).join(`
`);
      let i = `@@ -0,0 +1,${o} @@
${s}`;
      return {
        filename: e,
        status: "added",
        additions: o,
        deletions: 0,
        changes: o,
        patch: i
      };
    } catch {
      return null;
    }
  }
  var Xht;
  var OEe;
  var Qht = __lazy(() => {
    at();
    sMn();
    vo();
    bI();
    ji();
    Zl();
    na();
    Xht = require("fs/promises");
    OEe = require("path");
  });
  function i5p(e, t, n = 1 / 0) {
    let r = t <= 0 || !Number.isFinite(t);
    let o = 0;
    let s = 0;
    while (s <= e.length) {
      let i = e.indexOf(`
`, s);
      let a = i === -1 ? e.substring(s) : e.substring(s, i);
      if (r) {
        o++;
      } else {
        let l = Glt(a);
        o += l === 0 ? 1 : Math.ceil(l / t);
      }
      if (o > n) {
        return o;
      }
      if (i === -1) {
        break;
      }
      s = i + 1;
    }
    return o;
  }
  function d5a(e, t, n) {
    return i5p(e, t, n) > n;
  }
  var p5a = __lazy(() => {
    xNn();
  });
  function Fvo(e) {
    let t = e.split(egt);
    return e.endsWith(egt) ? t.length - 1 : t.length;
  }
  function a5p(e, t) {
    let n = D7d(e, t).height;
    return e.endsWith(egt) ? n - 1 : n;
  }
  function l5p(e) {
    let t = V9n.c(34);
    let {
      filePath: n,
      content: r,
      verbose: o
    } = e;
    let {
      columns: s
    } = Sr();
    let i = Math.max(1, s - 12);
    let a = r || "(No content)";
    let l;
    if (t[0] !== r) {
      l = Fvo(r);
      t[0] = r;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    let u;
    if (t[2] !== a || t[3] !== i || t[4] !== o) {
      u = o ? a : a.split(egt).slice(0, 10).join(egt).slice(0, 10 * (i + 1));
      t[2] = a;
      t[3] = i;
      t[4] = o;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d = u;
    let p = o ? 0 : a5p(a, i) - 10;
    let m;
    if (t[6] !== c) {
      m = Y_.jsx(Text, {
        bold: true,
        children: c
      });
      t[6] = c;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] !== c) {
      f = un(c, "line");
      t[8] = c;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h;
    if (t[10] !== n || t[11] !== o) {
      h = o ? n : f8e.relative(Nt(), n);
      t[10] = n;
      t[11] = o;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g;
    if (t[13] !== h) {
      g = Y_.jsx(Text, {
        bold: true,
        children: h
      });
      t[13] = h;
      t[14] = g;
    } else {
      g = t[14];
    }
    let y;
    if (t[15] !== m || t[16] !== f || t[17] !== g) {
      y = Y_.jsxs(Text, {
        children: ["Wrote ", m, " ", f, " to", " ", g]
      });
      t[15] = m;
      t[16] = f;
      t[17] = g;
      t[18] = y;
    } else {
      y = t[18];
    }
    let _ = o ? undefined : "hidden";
    let b = o ? undefined : 10;
    let S;
    if (t[19] !== d || t[20] !== n || t[21] !== i) {
      S = Y_.jsx(w$, {
        code: d,
        filePath: n,
        width: i
      });
      t[19] = d;
      t[20] = n;
      t[21] = i;
      t[22] = S;
    } else {
      S = t[22];
    }
    let E;
    if (t[23] !== S || t[24] !== _ || t[25] !== b) {
      E = Y_.jsx(gXd, {
        flexDirection: "column",
        overflowY: _,
        maxHeight: b,
        children: S
      });
      t[23] = S;
      t[24] = _;
      t[25] = b;
      t[26] = E;
    } else {
      E = t[26];
    }
    let C;
    if (t[27] !== p || t[28] !== o) {
      C = !o && Y_.jsx(B1, {
        count: p,
        expandable: true
      });
      t[27] = p;
      t[28] = o;
      t[29] = C;
    } else {
      C = t[29];
    }
    let x;
    if (t[30] !== E || t[31] !== C || t[32] !== y) {
      x = Y_.jsx(Vn, {
        children: Y_.jsxs(gXd, {
          flexDirection: "column",
          children: [y, E, C]
        })
      });
      t[30] = E;
      t[31] = C;
      t[32] = y;
      t[33] = x;
    } else {
      x = t[33];
    }
    return x;
  }
  function m5a(e) {
    if (e?.file_path?.startsWith(getPlansDirectory())) {
      return "Updated plan";
    }
    return "Write";
  }
  function f5a({
    type: e,
    content: t
  }, {
    columns: n
  }) {
    if (e !== "create") {
      return false;
    }
    if (typeof t !== "string") {
      return false;
    }
    let r = t.endsWith(egt) ? 10 + 1 : 10;
    return d5a(t, Math.max(1, n - 12), r);
  }
  function Uvo(e) {
    if (!e?.file_path) {
      return null;
    }
    return Pd(e.file_path);
  }
  function h5a(e, {
    verbose: t
  }) {
    if (!e.file_path) {
      return null;
    }
    if (e.file_path.startsWith(getPlansDirectory())) {
      return "";
    }
    return Y_.jsx(vM, {
      filePath: e.file_path,
      children: t ? e.file_path : Pd(e.file_path)
    });
  }
  function g5a({
    file_path: e,
    content: t
  }, {
    style: n,
    verbose: r
  }) {
    return Y_.jsx(c5p, {
      filePath: e,
      content: t,
      style: n,
      verbose: r
    });
  }
  function c5p(e) {
    let t = V9n.c(20);
    let {
      filePath: n,
      content: r,
      style: o,
      verbose: s
    } = e;
    let i;
    if (t[0] !== r || t[1] !== n) {
      i = () => d5p(n, r);
      t[0] = r;
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let [a] = tgt.useState(i);
    let l;
    if (t[3] !== r) {
      l = Ad(r);
      t[3] = r;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] !== r || t[6] !== n || t[7] !== c || t[8] !== s) {
      u = Y_.jsx(TMe, {
        file_path: n,
        operation: "write",
        content: r,
        firstLine: c,
        verbose: s
      });
      t[5] = r;
      t[6] = n;
      t[7] = c;
      t[8] = s;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d = u;
    let p;
    if (t[10] !== d || t[11] !== a || t[12] !== n || t[13] !== c || t[14] !== o || t[15] !== s) {
      p = Y_.jsx(u5p, {
        promise: a,
        filePath: n,
        firstLine: c,
        createFallback: d,
        style: o,
        verbose: s
      });
      t[10] = d;
      t[11] = a;
      t[12] = n;
      t[13] = c;
      t[14] = o;
      t[15] = s;
      t[16] = p;
    } else {
      p = t[16];
    }
    let m;
    if (t[17] !== d || t[18] !== p) {
      m = Y_.jsx(tgt.Suspense, {
        fallback: d,
        children: p
      });
      t[17] = d;
      t[18] = p;
      t[19] = m;
    } else {
      m = t[19];
    }
    return m;
  }
  function u5p(e) {
    let t = V9n.c(8);
    let {
      promise: n,
      filePath: r,
      firstLine: o,
      createFallback: s,
      style: i,
      verbose: a
    } = e;
    let l = tgt.use(n);
    if (l.type === "create") {
      return s;
    }
    if (l.type === "error") {
      let u;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        u = Y_.jsx(Vn, {
          children: Y_.jsx(Text, {
            children: "(No changes)"
          })
        });
        t[0] = u;
      } else {
        u = t[0];
      }
      return u;
    }
    let c;
    if (t[1] !== l.oldContent || t[2] !== l.patch || t[3] !== r || t[4] !== o || t[5] !== i || t[6] !== a) {
      c = Y_.jsx(TMe, {
        file_path: r,
        operation: "update",
        patch: l.patch,
        firstLine: o,
        fileContent: l.oldContent,
        style: i,
        verbose: a
      });
      t[1] = l.oldContent;
      t[2] = l.patch;
      t[3] = r;
      t[4] = o;
      t[5] = i;
      t[6] = a;
      t[7] = c;
    } else {
      c = t[7];
    }
    return c;
  }
  async function d5p(e, t) {
    try {
      let n = f8e.isAbsolute(e) ? e : f8e.resolve(Nt(), e);
      let r = await $Gt(n);
      if (r === null) {
        return {
          type: "create"
        };
      }
      let o;
      try {
        o = await t3n(r);
      } finally {
        await r.close();
      }
      if (o === null) {
        return {
          type: "create"
        };
      }
      return {
        type: "update",
        patch: GV({
          filePath: e,
          fileContents: o,
          edits: [{
            old_string: o,
            new_string: t,
            replace_all: false
          }]
        }),
        oldContent: o
      };
    } catch (n) {
      if (Zd(n)) {
        logForDebugging(`Failed to load rejection diff for ${e}: ${n.message}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
      return {
        type: "error"
      };
    }
  }
  function y5a(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string" && Nl(e, "tool_use_error")) {
      return Y_.jsx(Vn, {
        children: Y_.jsx(Text, {
          color: "error",
          children: "Error writing file"
        })
      });
    }
    return Y_.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function _5a({
    filePath: e = "",
    content: t,
    structuredPatch: n,
    type: r,
    originalFile: o
  }, s, {
    style: i,
    verbose: a
  }) {
    if (!e) {
      return null;
    }
    switch (r) {
      case "create":
        {
          if (e.startsWith(getPlansDirectory()) && !a) {
            if (i !== "condensed") {
              return Y_.jsx(Vn, {
                children: Y_.jsx(Text, {
                  dimColor: true,
                  children: "/plan to preview"
                })
              });
            }
          } else if (i === "condensed" && !a) {
            let c = Fvo(t);
            return Y_.jsxs(Text, {
              children: ["Wrote ", Y_.jsx(Text, {
                bold: true,
                children: c
              }), " ", un(c, "line"), " to", " ", Y_.jsx(Text, {
                bold: true,
                children: f8e.relative(Nt(), e)
              })]
            });
          } else if (!a && isScratchpadDisplayPath(e)) {
            let c = Fvo(t);
            return Y_.jsx(Vn, {
              children: Y_.jsxs(Text, {
                children: ["Wrote ", Y_.jsx(Text, {
                  bold: true,
                  children: c
                }), " ", un(c, "line"), " ", Y_.jsx(wv, {})]
              })
            });
          }
          return Y_.jsx(l5p, {
            filePath: e,
            content: t,
            verbose: a
          });
        }
      case "update":
        {
          let l = e.startsWith(getPlansDirectory());
          return Y_.jsx(Lqn, {
            filePath: e,
            structuredPatch: n,
            firstLine: Ad(t),
            fileContent: o ?? undefined,
            style: i,
            verbose: a,
            previewHint: l ? "/plan to preview" : undefined,
            collapsed: !l && isScratchpadDisplayPath(e)
          });
        }
    }
  }
  var V9n;
  var f8e;
  var tgt;
  var Y_;
  var egt = `
`;
  var b5a = __lazy(() => {
    Wl();
    ro();
    Xq();
    YX();
    KG();
    igo();
    rgo();
    XTe();
    SMe();
    ki();
    p5a();
    et();
    vo();
    je();
    Qde();
    dt();
    Zl();
    Rn();
    wm();
    xx();
    n3n();
    Zn();
    V9n = __toESM(pt(), 1);
    f8e = require("path");
    tgt = __toESM(ot(), 1);
    Y_ = __toESM(ie(), 1);
  });
  var PNe;
  var p5p;
  var m5p;
  var Nw;
  var DEe = __lazy(() => {
    Ot();
    $yo();
    $n();
    cJ();
    K6e();
    _ht();
    Tpe();
    _5e();
    MEo();
    T9();
    ci();
    S6t();
    Sl();
    vo();
    je();
    Qde();
    gn();
    dt();
    Zl();
    Jq();
    H9n();
    KB();
    qI();
    Qht();
    AI();
    Eo();
    ku();
    wm();
    Ay();
    i9t();
    Tm();
    mx();
    b5a();
    PNe = require("path");
    p5p = we(() => v.strictObject({
      file_path: v.string().describe("The absolute path to the file to write (must be absolute, not relative)"),
      content: v.string().describe("The content to write to the file")
    }));
    m5p = we(() => v.object({
      type: v.enum(["create", "update"]).describe("Whether a new file was created or an existing file was updated"),
      filePath: v.string().describe("The path to the file that was written"),
      content: v.string().describe("The content that was written to the file"),
      structuredPatch: v.array(Fyo()).describe("Diff patch showing the changes"),
      originalFile: v.string().nullable().describe("The original file content before the write (null for new files)"),
      gitDiff: Uyo().optional(),
      userModified: v.boolean().optional().describe("True when the user edited the proposed content in the permission dialog before accepting")
    }));
    Nw = Xs({
      name: "Write",
      ruleContentField: "file_path",
      searchHint: "create or overwrite files",
      maxResultSizeChars: 1e5,
      strict: true,
      async description() {
        return "Write a file to the local filesystem.";
      },
      userFacingName: m5a,
      getToolUseSummary: Uvo,
      getActivityDescription(e) {
        let t = Uvo(e);
        return t ? `Writing ${t}` : "Writing file";
      },
      async prompt({
        model: e
      }) {
        return qea(e);
      },
      renderToolUseMessage: h5a,
      isResultTruncated: f5a,
      get inputSchema() {
        return p5p();
      },
      get outputSchema() {
        return m5p();
      },
      stripForStorage(e) {
        if (typeof e !== "object" || e === null) {
          return e;
        }
        if (e.type !== "update") {
          return e;
        }
        if (e.content === "" && (e.originalFile ?? "") === "") {
          return e;
        }
        return {
          ...e,
          content: "",
          originalFile: null
        };
      },
      toAutoClassifierInput(e) {
        return `${e.file_path}: ${e.content}`;
      },
      getPath(e) {
        return e.file_path;
      },
      inputsEquivalent(e, t) {
        if (e.file_path !== t.file_path) {
          return false;
        }
        if (e.content === t.content) {
          return true;
        }
        return e.content.replace(/\n+$/, "") === t.content.replace(/\n+$/, "");
      },
      backfillObservableInput(e) {
        if (typeof e.file_path === "string") {
          e.file_path = us(e.file_path);
        }
      },
      async preparePermissionMatcher({
        file_path: e
      }) {
        return t => matchesPathRule(t, e);
      },
      async checkPermissions(e, t) {
        let n = us(e.file_path);
        unt(t.toolUseId, n, fg(n));
        return checkWritePermissionForTool(Nw, e, getToolPermissionContext(t));
      },
      renderToolUseRejectedMessage: g5a,
      renderToolUseErrorMessage: y5a,
      renderToolResultMessage: _5a,
      extractSearchText() {
        return "";
      },
      async validateInput({
        file_path: e,
        content: t
      }, n) {
        let r = us(e);
        let o = Jht(r, n);
        if (o) {
          return {
            result: false,
            message: o,
            errorCode: 7
          };
        }
        if (n.agentId && /^(REPORT|SUMMARY|FINDINGS|ANALYSIS).*\.md$/i.test(PNe.basename(r))) {
          logEvent("tengu_subagent_md_report_blocked", {
            contentBytes: Buffer.byteLength(t)
          });
          return {
            result: false,
            message: "Subagents should return findings as text, not write report files. Include this content in your final response instead.",
            errorCode: 5
          };
        }
        let s = ZGn(r, t);
        if (s) {
          return {
            result: false,
            message: s,
            errorCode: 0
          };
        }
        if (matchingRuleForInput(r, getToolPermissionContext(n), "edit", "deny") !== null) {
          return {
            result: false,
            message: "File is in a directory that is denied by your permission settings.",
            errorCode: 1
          };
        }
        if (r.startsWith("\\\\") || r.startsWith("//")) {
          return {
            result: true
          };
        }
        let a = zt();
        let l;
        try {
          let d = await a.stat(r);
          if (l = d.mtimeMs, fnt(d.mode)) {
            return {
              result: false,
              message: "File is read-only \u2014 it has not been opened for edit in Perforce. Run `p4 edit <file>` to check it out, then retry. Do not chmod the file writable; that bypasses Perforce tracking.",
              errorCode: 6
            };
          }
        } catch (d) {
          if (fn(d)) {
            return {
              result: true
            };
          }
          throw d;
        }
        let c = n.readFileState.get(r);
        if (!c || c.isPartialView) {
          let d = getCanonicalName(getMainLoopModel_export(n));
          let p = Git(d);
          let m = !c && getFeatureValue_CACHED_MAY_BE_STALE(Vit("tengu_velvet_mallet", d), false);
          if (logEvent("tengu_write_tool_not_read_hypothetical", {
            wouldHaveResult: c && Math.floor(l) > c.timestamp ? "errorCode3" : "success",
            isPartialView: c?.isPartialView === true,
            isFilePathAbsolute: PNe.isAbsolute(e),
            guardSkipped: m,
            modelBucket: p
          }), !m) {
            return {
              result: false,
              message: "File has not been read yet. Read it first before writing to it.",
              errorCode: 2
            };
          }
          return {
            result: true
          };
        }
        if (Math.floor(l) > c.timestamp) {
          let d = (c.offset ?? 1) <= 1 && c.limit === undefined;
          let p = false;
          if (d) {
            let f = (await a.readFileBytes(r)).toString("utf8").replaceAll(`\r
`, `
`);
            p = vde(c, f);
          }
          if (!p) {
            return {
              result: false,
              message: "File has been modified since read, either by the user or by a linter. Read it again before attempting to write it.",
              errorCode: 3
            };
          }
        }
        return {
          result: true
        };
      },
      async call({
        file_path: e,
        content: t
      }, n, r, o) {
        let {
          options: s,
          permissionLayers: i,
          readFileState: a,
          userModified: l,
          getFileHistoryState: c,
          applyFileHistoryOp: u,
          dynamicSkillDirTriggers: d
        } = n;
        let p = us(e);
        let m = PNe.dirname(p);
        let f = dnt(n, p);
        let h = Nt();
        let g = await Vht([p], h);
        if (g.length > 0) {
          if (d) {
            for (let E of g) {
              if (!d.includes(E)) {
                d.push(E);
              }
            }
          }
          INe(g).catch(() => {});
        }
        if (zht([p], h), await vEe.beforeFileEdited(p), fileHistoryEnabled()) {
          await fileHistoryTrackEdit(c, u, p, o.uuid);
        }
        let y = await Tke(p, async () => {
          let E;
          try {
            E = Eye(p);
          } catch (k) {
            if (fn(k)) {
              E = null;
            } else {
              throw k;
            }
          }
          if (E !== null) {
            let k = a.get(p);
            if (!k) {
              if (!getFeatureValue_CACHED_MAY_BE_STALE(Vit("tengu_velvet_mallet", getCanonicalName(getMainLoopModel_export({
                options: s,
                permissionLayers: i
              }))), false)) {
                throw new Rbe("File has not been read yet. Read it first before writing to it.");
              }
            } else if (Fte(p) > k.timestamp) {
              if (!((k.offset ?? 1) <= 1 && k.limit === undefined && vde(k, E.content))) {
                throw new Rbe("File content has changed since it was last read. This commonly happens when a linter or formatter run via Bash rewrites the file. Call Read on this file to refresh, then retry the edit.");
              }
            }
          }
          let C = E?.encoding ?? "utf8";
          let x = E?.content ?? null;
          t = K3n(p, t);
          Ske(p, f);
          await zt().mkdir(m);
          let A = await Eke(p, t, C, "LF");
          a.set(p, {
            content: t,
            timestamp: A,
            offset: undefined,
            limit: undefined
          });
          return x;
        });
        let _ = vNe();
        if (_) {
          MGn(p);
          NGn(p);
          _.changeFile(p, t).catch(E => {
            logForDebugging(`LSP: Failed to notify server of file change for ${p}: ${E.message}`, {
              level: "error"
            });
          });
          _.saveFile(p).catch(E => {
            logForDebugging(`LSP: Failed to notify server of file save for ${p}: ${E.message}`, {
              level: "error"
            });
          });
        }
        if (KDe(p, y, t), p.endsWith(`${PNe.sep}CLAUDE.md`)) {
          logEvent("tengu_write_claudemd", {});
        }
        let b;
        if (st(process.env.CLAUDE_CODE_REMOTE)) {
          let E = Date.now();
          let C = await G9n(p);
          if (C) {
            b = C;
          }
          logEvent("tengu_tool_use_diff_computed", {
            isWriteTool: true,
            durationMs: Date.now() - E,
            hasDiff: !!C
          });
        }
        if (y) {
          let E = xMe({
            filePath: e,
            oldContent: y,
            newContent: t,
            convertTabs: true
          });
          let C = {
            type: "update",
            filePath: e,
            content: t,
            structuredPatch: E,
            originalFile: y,
            userModified: l ?? false,
            ...(b && {
              gitDiff: b
            })
          };
          BGt(E, o.message.model);
          Goe({
            operation: "write",
            tool: "FileWriteTool",
            filePath: p,
            type: "update"
          });
          return {
            data: C
          };
        }
        let S = {
          type: "create",
          filePath: e,
          content: t,
          structuredPatch: [],
          originalFile: null,
          userModified: l ?? false,
          ...(b && {
            gitDiff: b
          })
        };
        BGt([], o.message.model, t);
        Goe({
          operation: "write",
          tool: "FileWriteTool",
          filePath: p,
          type: "create"
        });
        return {
          data: S
        };
      },
      mapToolResultToToolResultBlockParam({
        filePath: e,
        type: t,
        userModified: n
      }, r) {
        let o = n ? " The user modified your proposed content before accepting it." : "";
        let s = n ? "" : " (file state is current in your context \u2014 no need to Read it back)";
        switch (t) {
          case "create":
            return {
              tool_use_id: r,
              type: "tool_result",
              content: `File created successfully at: ${e}${o}${s}`
            };
          case "update":
            return {
              tool_use_id: r,
              type: "tool_result",
              content: `The file ${e} has been updated successfully.${o}${s}`
            };
        }
      }
    });
  });
  function h5p() {
    return {
      cachedExclusions: null
    };
  }
  async function ngt(e) {
    let t = T5a;
    let n = B$.normalize(B$.join(XC(), "cache"));
    if (e && !g5p(e, n)) {
      return [];
    }
    if (t.cachedExclusions !== null) {
      return t.cachedExclusions;
    }
    try {
      let r = await sde(["--files", "--hidden", "--no-ignore", "--max-depth", "4", "--glob", ".orphaned_at"], n, new AbortController().signal);
      t.cachedExclusions = r.map(o => {
        let s = B$.dirname(o);
        return `!**/${(B$.isAbsolute(s) ? B$.relative(n, s) : s).replaceAll("\\", "/")}/**`;
      });
      return t.cachedExclusions;
    } catch {
      t.cachedExclusions = [];
      return t.cachedExclusions;
    }
  }
  function E5a() {
    T5a.cachedExclusions = null;
  }
  function g5p(e, t) {
    let n = S5a(e);
    let r = S5a(t);
    return n === r || n === B$.sep || r === B$.sep || n.startsWith(r + B$.sep) || r.startsWith(n + B$.sep);
  }
  function S5a(e) {
    return B$.normalize(e);
  }
  var B$;
  var T5a;
  var T6t = __lazy(() => {
    eoe();
    k1();
    B$ = require("path");
    T5a = h5p();
  });
  function _5p(e) {
    let t = /[*?[{]/;
    let n = e.match(t);
    if (!n || n.index === undefined) {
      let a = SQ.dirname(e);
      let l = SQ.basename(e);
      return {
        baseDir: a,
        relativePattern: l
      };
    }
    let r = e.slice(0, n.index);
    let o = Math.max(r.lastIndexOf("/"), r.lastIndexOf(SQ.sep));
    if (o === -1) {
      return {
        baseDir: "",
        relativePattern: e
      };
    }
    let s = r.slice(0, o);
    let i = e.slice(o + 1);
    if (s === "" && o === 0) {
      s = "/";
    }
    if (Wt() === "windows" && /^[A-Za-z]:$/.test(s)) {
      s = s + SQ.sep;
    }
    return {
      baseDir: s,
      relativePattern: i
    };
  }
  async function v5a(e, t, {
    limit: n,
    offset: r
  }, o, s) {
    let i = t;
    let a = e;
    if (SQ.isAbsolute(e)) {
      let {
        baseDir: _,
        relativePattern: b
      } = _5p(e);
      if (_) {
        i = _;
        a = b;
      }
    }
    let l = normalizePatternsToPath(getFileReadIgnorePatterns(s), i);
    let c = st(process.env.CLAUDE_CODE_GLOB_NO_IGNORE || "true");
    let u = st(process.env.CLAUDE_CODE_GLOB_HIDDEN || "true");
    let d = ["--files", "--glob", a, "--sort=modified", ...(c ? ["--no-ignore"] : []), ...(u ? ["--hidden"] : [])];
    for (let _ of l) {
      d.push("--glob", `!${_}`);
    }
    for (let _ of await ngt(i)) {
      d.push("--glob", _);
    }
    let p = null;
    let m;
    let f = false;
    m = await sde(d, i, o);
    let h = m.map(_ => SQ.isAbsolute(_) ? _ : SQ.join(i, _));
    let g = f || h.length > r + n;
    return {
      files: h.slice(r, r + n),
      truncated: g,
      totalMatches: h.length,
      countIsComplete: !f
    };
  }
  var SQ;
  var w5a = __lazy(() => {
    gn();
    wm();
    Cs();
    T6t();
    eoe();
    SQ = require("path");
  });
  function Bvo(e) {
    let t = C5a.c(26);
    let {
      count: n,
      countLabel: r,
      secondaryCount: o,
      secondaryLabel: s,
      content: i,
      verbose: a
    } = e;
    let l;
    if (t[0] !== n) {
      l = sA.jsxs(Text, {
        bold: true,
        children: [n, " "]
      });
      t[0] = n;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c;
    if (t[2] !== n || t[3] !== r) {
      c = n === 0 || n > 1 ? r : r.slice(0, -1);
      t[2] = n;
      t[3] = r;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== l || t[6] !== c) {
      u = sA.jsxs(Text, {
        children: ["Found ", l, c]
      });
      t[5] = l;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = u;
    let p;
    if (t[8] !== o || t[9] !== s) {
      p = o !== undefined && s ? sA.jsxs(Text, {
        children: [" ", "across ", sA.jsxs(Text, {
          bold: true,
          children: [o, " "]
        }), o === 0 || o > 1 ? s : s.slice(0, -1)]
      }) : null;
      t[8] = o;
      t[9] = s;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m = p;
    if (a) {
      let g;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        g = sA.jsx(Text, {
          dimColor: true,
          children: "\xA0\xA0\u23BF \xA0"
        });
        t[11] = g;
      } else {
        g = t[11];
      }
      let y;
      if (t[12] !== d || t[13] !== m) {
        y = sA.jsx(gXd, {
          flexDirection: "row",
          children: sA.jsxs(Text, {
            children: [g, d, m]
          })
        });
        t[12] = d;
        t[13] = m;
        t[14] = y;
      } else {
        y = t[14];
      }
      let _;
      if (t[15] !== i) {
        _ = sA.jsx(gXd, {
          marginLeft: 5,
          children: sA.jsx(Text, {
            children: i
          })
        });
        t[15] = i;
        t[16] = _;
      } else {
        _ = t[16];
      }
      let b;
      if (t[17] !== y || t[18] !== _) {
        b = sA.jsxs(gXd, {
          flexDirection: "column",
          children: [y, _]
        });
        t[17] = y;
        t[18] = _;
        t[19] = b;
      } else {
        b = t[19];
      }
      return b;
    }
    let f;
    if (t[20] !== n) {
      f = n > 0 && sA.jsx(wv, {});
      t[20] = n;
      t[21] = f;
    } else {
      f = t[21];
    }
    let h;
    if (t[22] !== d || t[23] !== m || t[24] !== f) {
      h = sA.jsx(Vn, {
        height: 1,
        children: sA.jsxs(Text, {
          children: [d, m, " ", f]
        })
      });
      t[22] = d;
      t[23] = m;
      t[24] = f;
      t[25] = h;
    } else {
      h = t[25];
    }
    return h;
  }
  function R5a({
    pattern: e,
    path: t
  }, {
    verbose: n
  }) {
    if (!e) {
      return null;
    }
    let r = [`pattern: "${e}"`];
    if (t) {
      r.push(`path: "${n ? t : Pd(t)}"`);
    }
    return r.join(", ");
  }
  function x5a(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string" && Nl(e, "tool_use_error")) {
      if (Nl(e, "tool_use_error")?.includes("Note: your current working directory is")) {
        return sA.jsx(Vn, {
          children: sA.jsx(Text, {
            color: "error",
            children: "File not found"
          })
        });
      }
      return sA.jsx(Vn, {
        children: sA.jsx(Text, {
          color: "error",
          children: "Error searching files"
        })
      });
    }
    return sA.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function k5a({
    mode: e = "files_with_matches",
    filenames: t,
    numFiles: n,
    content: r,
    numLines: o,
    numMatches: s
  }, i, {
    verbose: a
  }) {
    if (e === "content") {
      return sA.jsx(Bvo, {
        count: o ?? 0,
        countLabel: "lines",
        content: r,
        verbose: a
      });
    }
    if (e === "count") {
      return sA.jsx(Bvo, {
        count: s ?? 0,
        countLabel: "matches",
        secondaryCount: n,
        secondaryLabel: "files",
        content: r,
        verbose: a
      });
    }
    let l = t.map(c => c).join(`
`);
    return sA.jsx(Bvo, {
      count: n,
      countLabel: "files",
      content: l,
      verbose: a
    });
  }
  function $vo(e) {
    if (!e?.pattern) {
      return null;
    }
    return truncate(e.pattern, 50);
  }
  var C5a;
  var sA;
  var A5a = __lazy(() => {
    Xq();
    KG();
    Wl();
    et();
    Zl();
    cs();
    ro();
    C5a = __toESM(pt(), 1);
    sA = __toESM(ie(), 1);
  });
  function Hvo(e, t, n = 0) {
    if (t === 0) {
      return {
        items: e.slice(n),
        appliedLimit: undefined
      };
    }
    let r = t ?? 250;
    let o = e.slice(n, n + r);
    let s = e.length - n > r;
    return {
      items: o,
      appliedLimit: s ? r : undefined
    };
  }
  function jvo(e, t) {
    let n = [];
    if (e !== undefined) {
      n.push(`limit: ${e}`);
    }
    if (t) {
      n.push(`offset: ${t}`);
    }
    return n.join(", ");
  }
  var S5p;
  var T5p;
  var v5p;
  var $$;
  var DNe = __lazy(() => {
    ci();
    vo();
    dt();
    Zl();
    ku();
    wm();
    V5e();
    T6t();
    eoe();
    uMe();
    Cmt();
    Zn();
    _x();
    Sl();
    A5a();
    S5p = we(() => v.strictObject({
      pattern: v.string().describe("The regular expression pattern to search for in file contents"),
      path: v.string().optional().describe("File or directory to search in (rg PATH). Defaults to current working directory."),
      glob: v.string().optional().describe('Glob pattern to filter files (e.g. "*.js", "*.{ts,tsx}") - maps to rg --glob'),
      output_mode: v.enum(["content", "files_with_matches", "count"]).optional().describe('Output mode: "content" shows matching lines (supports -A/-B/-C context, -n line numbers, head_limit), "files_with_matches" shows file paths (supports head_limit), "count" shows match counts (supports head_limit). Defaults to "files_with_matches".'),
      "-B": v$(v.number().optional()).describe('Number of lines to show before each match (rg -B). Requires output_mode: "content", ignored otherwise.'),
      "-A": v$(v.number().optional()).describe('Number of lines to show after each match (rg -A). Requires output_mode: "content", ignored otherwise.'),
      "-C": v$(v.number().optional()).describe("Alias for context."),
      context: v$(v.number().optional()).describe('Number of lines to show before and after each match (rg -C). Requires output_mode: "content", ignored otherwise.'),
      "-n": VI(v.boolean().optional()).describe('Show line numbers in output (rg -n). Requires output_mode: "content", ignored otherwise. Defaults to true.'),
      "-i": VI(v.boolean().optional()).describe("Case insensitive search (rg -i)"),
      "-o": VI(v.boolean().optional()).describe('Print only the matched (non-empty) parts of each matching line, one match per output line (rg -o / --only-matching). Requires output_mode: "content", ignored otherwise. Defaults to false.'),
      type: v.string().optional().describe("File type to search (rg --type). Common types: js, py, rust, go, java, etc. More efficient than include for standard file types."),
      head_limit: v$(v.number().optional()).describe('Limit output to first N lines/entries, equivalent to "| head -N". Works across all output modes: content (limits output lines), files_with_matches (limits file paths), count (limits count entries). Defaults to 250 when unspecified. Pass 0 for unlimited (use sparingly \u2014 large result sets waste context).'),
      offset: v$(v.number().optional()).describe('Skip first N lines/entries before applying head_limit, equivalent to "| tail -n +N | head -N". Works across all output modes. Defaults to 0.'),
      multiline: VI(v.boolean().optional()).describe("Enable multiline mode where . matches newlines and patterns can span lines (rg -U --multiline-dotall). Default: false.")
    }));
    T5p = [".git", ".svn", ".hg", ".bzr", ".jj", ".sl"];
    v5p = we(() => v.object({
      mode: v.enum(["content", "files_with_matches", "count"]).optional(),
      numFiles: v.number(),
      filenames: v.array(v.string()),
      content: v.string().optional(),
      numLines: v.number().optional(),
      numMatches: v.number().optional(),
      appliedLimit: v.number().optional(),
      appliedOffset: v.number().optional()
    }));
    $$ = Xs({
      name: "Grep",
      searchHint: "search file contents with regex (ripgrep)",
      maxResultSizeChars: 20000,
      strict: true,
      async description() {
        return tuo(undefined);
      },
      userFacingName() {
        return "Search";
      },
      getToolUseSummary: $vo,
      getActivityDescription(e) {
        let t = $vo(e);
        return t ? `Searching for ${t}` : "Searching";
      },
      get inputSchema() {
        return S5p();
      },
      get outputSchema() {
        return v5p();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.path ? `${e.pattern} in ${e.path}` : e.pattern;
      },
      isSearchOrReadCommand() {
        return {
          isSearch: true,
          isRead: false
        };
      },
      ruleContentField: "path",
      getPath({
        path: e
      }) {
        return e || Nt();
      },
      async preparePermissionMatcher({
        pattern: e
      }) {
        return t => KV(t, e);
      },
      async validateInput({
        pattern: e,
        path: t,
        glob: n,
        type: r
      }) {
        let o = [["pattern", e], ["path", t], ["glob", n], ["type", r]].find(([, s]) => s?.includes("\x00"));
        if (o) {
          return {
            result: false,
            message: `${"Grep"} ${o[0]} cannot contain null bytes (\\0). Remove the null byte and try again.`,
            errorCode: 2
          };
        }
        if (t) {
          let s = zt();
          let i = us(t);
          if (i.startsWith("\\\\") || i.startsWith("//")) {
            return {
              result: true
            };
          }
          try {
            await s.stat(i);
          } catch (a) {
            if (fn(a)) {
              let l = await oY(i);
              let c = `Path does not exist: ${t}. ${"Note: your current working directory is"} ${Nt()}.`;
              if (l) {
                c += ` Did you mean ${l}?`;
              }
              return {
                result: false,
                message: c,
                errorCode: 1
              };
            }
            throw a;
          }
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        return checkReadPermissionForTool($$, e, getToolPermissionContext(t));
      },
      async prompt({
        model: e
      }) {
        return tuo(e);
      },
      renderToolUseMessage: R5a,
      renderToolUseErrorMessage: x5a,
      renderToolResultMessage: k5a,
      extractSearchText({
        mode: e,
        content: t,
        filenames: n
      }) {
        if (e === "content" && t) {
          return t;
        }
        return n.join(`
`);
      },
      mapToolResultToToolResultBlockParam({
        mode: e = "files_with_matches",
        numFiles: t,
        filenames: n,
        content: r,
        numLines: o,
        numMatches: s,
        appliedLimit: i,
        appliedOffset: a
      }, l) {
        if (e === "content") {
          let d = jvo(i, a);
          let p = r || "No matches found";
          let m = d ? `${p}

[Showing results with pagination = ${d}]` : p;
          return {
            tool_use_id: l,
            type: "tool_result",
            content: m
          };
        }
        if (e === "count") {
          let d = jvo(i, a);
          let p = r || "No matches found";
          let m = s ?? 0;
          let f = t ?? 0;
          let h = `

Found ${m} total ${m === 1 ? "occurrence" : "occurrences"} across ${f} ${f === 1 ? "file" : "files"}.${d ? ` with pagination = ${d}` : ""}`;
          return {
            tool_use_id: l,
            type: "tool_result",
            content: p + h
          };
        }
        let c = jvo(i, a);
        if (t === 0) {
          return {
            tool_use_id: l,
            type: "tool_result",
            content: "No files found"
          };
        }
        let u = `Found ${t} ${un(t, "file")}${c ? ` ${c}` : ""}
${n.join(`
`)}`;
        return {
          tool_use_id: l,
          type: "tool_result",
          content: u
        };
      },
      async call({
        pattern: e,
        path: t,
        glob: n,
        type: r,
        output_mode: o = "files_with_matches",
        "-B": s,
        "-A": i,
        "-C": a,
        context: l,
        "-n": c = true,
        "-i": u = false,
        "-o": d = false,
        head_limit: p,
        offset: m = 0,
        multiline: f = false
      }, h) {
        let {
          abortController: g
        } = h;
        let y = t ? us(t) : Nt();
        let _ = ["--hidden"];
        for (let M of T5p) {
          _.push("--glob", `!${M}`);
        }
        if (_.push("--max-columns", "500"), f) {
          _.push("-U", "--multiline-dotall");
        }
        if (u) {
          _.push("-i");
        }
        if (o === "files_with_matches") {
          _.push("-l");
        } else if (o === "count") {
          _.push("-c", "-H");
        }
        if (c && o === "content") {
          _.push("-n");
        }
        if (d && o === "content") {
          _.push("-o");
        }
        if (o === "content") {
          if (l !== undefined) {
            _.push("-C", l.toString());
          } else if (a !== undefined) {
            _.push("-C", a.toString());
          } else {
            if (s !== undefined) {
              _.push("-B", s.toString());
            }
            if (i !== undefined) {
              _.push("-A", i.toString());
            }
          }
        }
        if (e.startsWith("-")) {
          _.push("-e", e);
        } else {
          _.push(e);
        }
        if (r) {
          _.push("--type", r);
        }
        if (n) {
          let M = [];
          let L = n.split(/\s+/);
          for (let P of L) {
            if (P.includes("{") && P.includes("}")) {
              M.push(P);
            } else {
              M.push(...P.split(",").filter(Boolean));
            }
          }
          for (let P of M.filter(Boolean)) {
            _.push("--glob", P);
          }
        }
        let b = normalizePatternsToPath(getFileReadIgnorePatterns(getToolPermissionContext(h)), Nt());
        for (let M of b) {
          let L = M.startsWith("/") ? `!${M}` : `!**/${M}`;
          _.push("--glob", L);
        }
        for (let M of await ngt(y)) {
          _.push("--glob", M);
        }
        let S;
        let E = null;
        if (S = await sde(_, y, g.signal), o === "content") {
          let {
            items: M,
            appliedLimit: L
          } = Hvo(S, p, m);
          let P = M.map(H => {
            let U = /^[A-Za-z]:/.test(H) ? 2 : 0;
            let N = H.indexOf(":", U);
            if (N > 0) {
              let W = H.substring(0, N);
              let j = H.substring(N);
              return lnt(W) + j;
            }
            return H;
          });
          return {
            data: {
              mode: "content",
              numFiles: 0,
              filenames: [],
              content: P.join(`
`),
              numLines: P.length,
              ...(L !== undefined && {
                appliedLimit: L
              }),
              ...(m > 0 && {
                appliedOffset: m
              })
            }
          };
        }
        if (o === "count") {
          let {
            items: M,
            appliedLimit: L
          } = Hvo(S, p, m);
          let P = M.map(N => {
            let W = N.lastIndexOf(":");
            if (W > 0) {
              let j = N.substring(0, W);
              let z = N.substring(W);
              return lnt(j) + z;
            }
            return N;
          });
          let F = 0;
          let H = 0;
          for (let N of P) {
            let W = N.lastIndexOf(":");
            if (W > 0) {
              let j = N.substring(W + 1);
              let z = parseInt(j, 10);
              if (!isNaN(z)) {
                F += z;
                H += 1;
              }
            }
          }
          return {
            data: {
              mode: "count",
              numFiles: H,
              filenames: [],
              content: P.join(`
`),
              numMatches: F,
              ...(L !== undefined && {
                appliedLimit: L
              }),
              ...(m > 0 && {
                appliedOffset: m
              })
            }
          };
        }
        let C = await Promise.allSettled(S.map(M => zt().stat(M)));
        let x = S.map((M, L) => {
          let P = C[L];
          return [M, P.status === "fulfilled" ? P.value.mtimeMs ?? 0 : 0];
        }).sort((M, L) => {
          let P = L[1] - M[1];
          if (P === 0) {
            return M[0].localeCompare(L[0]);
          }
          return P;
        }).map(M => M[0]);
        let {
          items: A,
          appliedLimit: k
        } = Hvo(x, p, m);
        let I = A.map(lnt);
        return {
          data: {
            mode: "files_with_matches",
            filenames: I,
            numFiles: I.length,
            ...(k !== undefined && {
              appliedLimit: k
            }),
            ...(m > 0 && {
              appliedOffset: m
            })
          }
        };
      }
    });
  });
  function I5a() {
    return "Search";
  }
  function P5a({
    pattern: e,
    path: t
  }, {
    verbose: n
  }) {
    if (!e) {
      return null;
    }
    if (!t) {
      return `pattern: "${e}"`;
    }
    return `pattern: "${e}", path: "${n ? t : Pd(t)}"`;
  }
  function O5a(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string" && Nl(e, "tool_use_error")) {
      if (Nl(e, "tool_use_error")?.includes("Note: your current working directory is")) {
        return rgt.jsx(Vn, {
          children: rgt.jsx(Text, {
            color: "error",
            children: "File not found"
          })
        });
      }
      return rgt.jsx(Vn, {
        children: rgt.jsx(Text, {
          color: "error",
          children: "Error searching files"
        })
      });
    }
    return rgt.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function qvo(e) {
    if (!e?.pattern) {
      return null;
    }
    return truncate(e.pattern, 50);
  }
  var rgt;
  var D5a;
  var M5a = __lazy(() => {
    Wl();
    ro();
    KG();
    et();
    Zl();
    cs();
    DNe();
    rgt = __toESM(ie(), 1);
    D5a = $$.renderToolResultMessage;
  });
  function R5p(e) {
    let t = e.filenames.length;
    if (e.totalMatches === undefined) {
      return "(Results are truncated. Consider using a more specific path or pattern.)";
    }
    if (e.countIsComplete) {
      let n = e.totalMatches - t;
      return `(Showing ${t} of ${e.totalMatches} matching files; ${n} more are not listed. Narrow the pattern or path to see the rest.)`;
    }
    return `(Showing the first ${t} files; there are more than ${e.totalMatches} matches. Narrow the pattern or path to see the rest.)`;
  }
  var w5p;
  var C5p;
  var cz;
  var ogt = __lazy(() => {
    ci();
    Sl();
    vo();
    dt();
    Zl();
    w5a();
    ku();
    wm();
    V5e();
    Fk();
    M5a();
    w5p = we(() => v.strictObject({
      pattern: v.string().describe("The glob pattern to match files against"),
      path: v.string().optional().describe('The directory to search in. If not specified, the current working directory will be used. IMPORTANT: Omit this field to use the default directory. DO NOT enter "undefined" or "null" - simply omit it for the default behavior. Must be a valid directory path if provided.')
    }));
    C5p = we(() => v.object({
      durationMs: v.number().describe("Time taken to execute the search in milliseconds"),
      numFiles: v.number().describe("Number of file paths returned (after any truncation)"),
      filenames: v.array(v.string()).describe("Array of file paths that match the pattern"),
      truncated: v.boolean().describe("Whether results were truncated (limited to 100 files)"),
      totalMatches: v.number().optional().describe("Total number of matching files before truncation. A lower bound when countIsComplete is false. Absent on results persisted by CLI versions predating this field."),
      countIsComplete: v.boolean().optional().describe("Whether totalMatches is the exact total (true) or a floor because the underlying search truncated its own output (false). Absent on results persisted by CLI versions predating this field.")
    }));
    cz = Xs({
      name: "Glob",
      searchHint: "find files by name pattern or wildcard",
      maxResultSizeChars: 1e5,
      async description() {
        return rZr;
      },
      userFacingName: I5a,
      getToolUseSummary: qvo,
      getActivityDescription(e) {
        let t = qvo(e);
        return t ? `Finding ${t}` : "Finding files";
      },
      get inputSchema() {
        return w5p();
      },
      get outputSchema() {
        return C5p();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.pattern;
      },
      isSearchOrReadCommand() {
        return {
          isSearch: true,
          isRead: false
        };
      },
      ruleContentField: "path",
      getPath({
        path: e
      }) {
        return e ? us(e) : Nt();
      },
      async preparePermissionMatcher({
        pattern: e
      }) {
        return t => KV(t, e);
      },
      async validateInput({
        path: e
      }) {
        if (e) {
          let t = zt();
          let n = us(e);
          if (n.startsWith("\\\\") || n.startsWith("//")) {
            return {
              result: true
            };
          }
          let r;
          try {
            r = await t.stat(n);
          } catch (o) {
            if (fn(o)) {
              let s = await oY(n);
              let i = `Directory does not exist: ${e}. ${"Note: your current working directory is"} ${Nt()}.`;
              if (s) {
                i += ` Did you mean ${s}?`;
              }
              return {
                result: false,
                message: i,
                errorCode: 1
              };
            }
            throw o;
          }
          if (!r.isDirectory()) {
            return {
              result: false,
              message: `Path is not a directory: ${e}`,
              errorCode: 2
            };
          }
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        return checkReadPermissionForTool(cz, e, getToolPermissionContext(t));
      },
      async prompt({
        model: e
      }) {
        return D4i(e);
      },
      renderToolUseMessage: P5a,
      renderToolUseErrorMessage: O5a,
      renderToolResultMessage: D5a,
      extractSearchText({
        filenames: e
      }) {
        return e.join(`
`);
      },
      async call(e, t) {
        let {
          abortController: n,
          globLimits: r
        } = t;
        let o = Date.now();
        let s = r?.maxResults ?? 100;
        let {
          files: i,
          truncated: a,
          totalMatches: l,
          countIsComplete: c
        } = await v5a(e.pattern, cz.getPath(e), {
          limit: s,
          offset: 0
        }, n.signal, getToolPermissionContext(t));
        let u = i.map(lnt);
        return {
          data: {
            filenames: u,
            durationMs: Date.now() - o,
            numFiles: u.length,
            truncated: a,
            totalMatches: l,
            countIsComplete: c
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        if (e.filenames.length === 0) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: "No files found"
          };
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: [...e.filenames, ...(e.truncated ? [R5p(e)] : [])].join(`
`)
        };
      }
    });
  });
  function x5p(e) {
    return e.split(MNe.win32.sep).join(MNe.posix.sep);
  }
  function NEe(e) {
    let t = x5p(e);
    return false ? t.toLowerCase() : t;
  }
  function E6t(e) {
    let t = er();
    let n = NEe(e);
    let r = NEe(t);
    if (!n.startsWith(r)) {
      return null;
    }
    if (n.includes("/projects/") && n.endsWith(".jsonl")) {
      return "session_transcript";
    }
    return null;
  }
  function z9n(e) {
    let t = e.split(MNe.win32.sep).join(MNe.posix.sep);
    if (t.includes(".jsonl") || t.includes("projects") && t.includes("*.jsonl")) {
      return "session_transcript";
    }
    return null;
  }
  function y8e(e) {
    if (Vd()) {
      return wJ(e);
    }
    return false;
  }
  function N5a(e) {
    if (OJ(e)) {
      return "team";
    }
    if (y8e(e)) {
      return "personal";
    }
    return null;
  }
  function k5p(e) {
    if (Vd()) {
      return mWe(e);
    }
    return false;
  }
  function _8e(e) {
    if (y8e(e)) {
      return true;
    }
    if (OJ(e)) {
      return true;
    }
    if (E6t(e) !== null) {
      return true;
    }
    if (k5p(e)) {
      return true;
    }
    return false;
  }
  function Gvo(e) {
    let t = MNe.normalize(e);
    let n = NEe(t);
    if (Vd() && (n.includes("/agent-memory/") || n.includes("/agent-memory-local/"))) {
      return true;
    }
    if (uO() && Gbe(t)) {
      return true;
    }
    if (Vd()) {
      let a = vf();
      let l = NEe(a.replace(/[/\\]+$/, ""));
      let c = NEe(a);
      if (n === l || n.startsWith(c)) {
        return true;
      }
    }
    let r = NEe(er());
    let o = NEe(Pbe());
    let s = n.startsWith(r);
    let i = n.startsWith(o);
    if (!s && !i) {
      return false;
    }
    if (s && n.includes("/projects/")) {
      return true;
    }
    if (Vd() && n.includes("/memory/")) {
      return true;
    }
    return false;
  }
  function L5a(e) {
    let t = er();
    let n = Pbe();
    let r = Vd() ? vf().replace(/[/\\]+$/, "") : "";
    let o = NEe(e);
    if (![t, n, r].filter(Boolean).some(l => {
      if (o.includes(NEe(l))) {
        return true;
      }
      if (false) {
        return o.includes(UD(l).toLowerCase());
      }
      return false;
    })) {
      return false;
    }
    let a = e.match(/(?:[A-Za-z]:[/\\]|\/)[^\s'"]+/g);
    if (!a) {
      return false;
    }
    for (let l of a) {
      let c = l.replace(/[,;|&>]+$/, "");
      let u = false ? nje(c) : c;
      if (_8e(u) || Gvo(u)) {
        return true;
      }
    }
    return false;
  }
  function F5a(e) {
    if (z9n(e) !== null) {
      return true;
    }
    if (Vd() && (e.replaceAll("\\", "/").includes("agent-memory/") || e.replaceAll("\\", "/").includes("agent-memory-local/"))) {
      return true;
    }
    return false;
  }
  var MNe;
  var sgt = __lazy(() => {
    Eb();
    a1();
    Vbe();
    gn();
    wj();
    MNe = require("path");
  });
  var B5a = {};