  __export(t0l, {
    TEAMMATE_SYSTEM_PROMPT_ADDENDUM: () => TEAMMATE_SYSTEM_PROMPT_ADDENDUM
  });
  var TEAMMATE_SYSTEM_PROMPT_ADDENDUM = `
# Agent Teammate Communication

IMPORTANT: You are running as an agent in a team. To communicate with anyone on your team, use the SendMessage tool with \`to: "<name>"\` to send messages to specific teammates.

Just writing a response in text is not visible to others on your team - you MUST use the SendMessage tool.

The user interacts primarily with the team lead. Your work is coordinated through the task system and teammate messaging.
`;
  function UIm(e, t, n, r) {
    return async (o, s, i, a, l, c) => {
      let u = c ?? (await hasPermissionsToUseToolWithSink(o, s, i, a, l, undefined, r));
      if (u.behavior !== "ask") {
        return u;
      }
      let d = u.updatedInput ?? s;
      if (t.signal.aborted) {
        return {
          behavior: "ask",
          message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
        };
      }
      let p = getToolPermissionContext(i);
      let m = () => o.description(d, {
        isNonInteractiveSession: i.options.isNonInteractiveSession,
        toolPermissionContext: p,
        tools: i.options.tools
      });
      if (i.requestDialog !== undefined) {
        let h = ZAl();
        let y = Fer(o, s, i, a, l, E => {
          h?.(E, {
            preserveMode: true
          });
        }, r);
        let _ = await CXn({
          ctx: y,
          updatedInput: u.updatedInput,
          suggestions: u.suggestions,
          permissionMode: p.mode
        });
        if (_) {
          return _;
        }
        if (t.signal.aborted) {
          return {
            behavior: "ask",
            message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
          };
        }
        let b = await m();
        if (t.signal.aborted) {
          return {
            behavior: "ask",
            message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
          };
        }
        let S = Date.now();
        try {
          return await new Promise((E, C) => {
            Ttr({
              ctx: y,
              description: b,
              result: u,
              awaitAutomatedChecksBeforeDialog: true
            }, E).catch(C);
          });
        } finally {
          n(Date.now() - S);
        }
      }
      let f = await m();
      if (t.signal.aborted) {
        return {
          behavior: "ask",
          message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
        };
      }
      return new Promise(h => {
        let g = ftr({
          toolName: o.name,
          toolUseId: l,
          input: d,
          description: f,
          permissionSuggestions: u.suggestions,
          workerId: e.agentId,
          workerName: e.agentName,
          workerColor: e.color,
          teamName: e.teamName
        });
        Rtr({
          requestId: g.id,
          toolUseId: l,
          onAllow(S, E, C, x) {
            b();
            zV(E);
            let A = S && Object.keys(S).length > 0 ? S : d;
            h({
              behavior: "allow",
              updatedInput: A,
              userModified: false,
              ...(x && x.length > 0 && {
                contentBlocks: x
              })
            });
          },
          onReject(S, E) {
            b();
            let C = S ? `${Uer}${S}` : "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task.";
            h({
              behavior: "ask",
              message: C,
              contentBlocks: E
            });
          }
        });
        htr(g);
        let y = setInterval(async (S, E, C, x, A) => {
          if (S.signal.aborted) {
            E();
            C({
              behavior: "ask",
              message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
            });
            return;
          }
          let k = await readMailbox(x.agentName, x.teamName);
          for (let I of k) {
            if (I && !I.read) {
              let O = isPermissionResponse(I.text);
              if (O && O.request_id === A.id) {
                if (await markSingleMessageAsRead(x.agentName, x.teamName, I), I.from !== "team-lead") {
                  logForDebugging(`[InProcessRunner] Ignoring permission response from non-team-lead: ${I.from}`, {
                    level: "warn"
                  });
                  continue;
                }
                if (O.subtype === "success") {
                  JTt({
                    requestId: O.request_id,
                    decision: "approved",
                    updatedInput: O.response?.updated_input,
                    permissionUpdates: O.response?.permission_updates
                  });
                } else {
                  JTt({
                    requestId: O.request_id,
                    decision: "rejected",
                    feedback: O.error
                  });
                }
                return;
              }
            }
          }
        }, 500, t, b, h, e, g);
        let _ = () => {
          b();
          h({
            behavior: "ask",
            message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
          });
        };
        t.signal.addEventListener("abort", _, {
          once: true
        });
        function b() {
          clearInterval(y);
          VAl(g.id);
          t.signal.removeEventListener("abort", _);
        }
      });
    };
  }
  function nfe(e, t, n) {
    n.update(e, r => r.type === "in_process_teammate" ? t(r) : r);
  }
  async function BIm(e, t, n, r) {
    await writeToMailbox("team-lead", {
      from: e,
      text: t,
      timestamp: new Date().toISOString(),
      color: n
    }, r);
  }
  async function n0l(e, t, n, r) {
    let o = createIdleNotification(e, r);
    await BIm(e, De(o), t, n);
  }
  function $Im(e) {
    let t = new Set(e.filter(n => n.status !== "completed").map(n => n.id));
    return e.find(n => {
      if (n.status !== "pending") {
        return false;
      }
      if (n.owner) {
        return false;
      }
      return n.blockedBy.every(r => !t.vZc(r));
    });
  }
  function HIm(e) {
    let t = `Complete all open tasks. Start with task #${e.id}: 

 ${e.subject}`;
    if (e.description) {
      t += `

${e.description}`;
    }
    return t;
  }
  async function r0l(e, t) {
    try {
      let n = await y3(e);
      let r = $Im(n);
      if (!r) {
        return;
      }
      let o = await t6a(e, r.id, t);
      if (!o.success) {
        logForDebugging(`[inProcessRunner] Failed to claim task #${r.id}: ${o.reason}`);
        return;
      }
      await FEe(e, r.id, {
        status: "in_progress"
      });
      logForDebugging(`[inProcessRunner] Claimed task #${r.id}: ${r.subject}`);
      return HIm(r);
    } catch (n) {
      logForDebugging(`[inProcessRunner] Error checking task list: ${n}`);
      return;
    }
  }
  async function o0l(e, t, n) {
    let r = await readMailbox(e.agentName, e.teamName);
    let o = -1;
    let s = null;
    for (let c = 0; c < r.length; c++) {
      let u = r[c];
      if (u && !u.read) {
        let d = isShutdownRequest(u.text);
        if (d) {
          o = c;
          s = d;
          break;
        }
      }
    }
    if (o !== -1) {
      let c = r[o];
      let u = Bn(r.slice(0, o), d => !d.read);
      logForDebugging(`[inProcessRunner] ${e.agentName} received shutdown request from ${s?.from} (prioritized over ${u} unread messages)`);
      await markSingleMessageAsRead(e.agentName, e.teamName, c);
      return {
        type: "shutdown_request",
        request: s,
        originalMessage: c.text
      };
    }
    let i = [];
    let a = [];
    for (let c of r) {
      if (!c || c.read) {
        continue;
      }
      if (isStructuredProtocolMessage(c.text)) {
        i.push(c);
      } else {
        a.push(c);
      }
    }
    let l = null;
    if (i.length > 0) {
      for (let c of i) {
        let u = isPlanApprovalResponse(c.text);
        if (u && c.from === "team-lead") {
          if (jgl(t, u, n)) {
            logForDebugging(`[inProcessRunner] ${e.agentName} applied lead plan_approval_response: approved=${u.approved}`);
            l = planApprovalResumeText(u);
          } else {
            logForDebugging(`[inProcessRunner] ${e.agentName} ignoring stale plan_approval_response (not awaiting approval)`);
          }
          continue;
        }
        let d = isModeSetRequest(c.text);
        if (d && c.from === "team-lead") {
          let p = JOo(d.mode);
          logForDebugging(`[inProcessRunner] ${e.agentName} applying lead mode_set_request: ${p}`);
          nfe(t, m => m.permissionMode === p ? m : {
            ...m,
            permissionMode: p
          }, n);
          await setMemberMode(e.teamName, e.agentName, p);
        } else {
          logForDebugging(`[inProcessRunner] ${e.agentName} dropping protocol frame from ${c.from}: ${c.text.substring(0, 80)}`, {
            level: "warn"
          });
        }
      }
      await markMessagesAsRead(e.agentName, e.teamName, i);
    }
    if (l) {
      return {
        type: "new_message",
        message: l,
        from: "team-lead"
      };
    }
    if (a.length > 0) {
      logForDebugging(`[inProcessRunner] ${e.agentName} draining ${a.length} message(s) from ${Ro(a.map(c => c.from)).join(", ")}`);
      await markMessagesAsRead(e.agentName, e.teamName, a);
      return {
        type: "new_messages",
        messages: a
      };
    }
    return null;
  }
  async function jIm(e, t, n, r, o, s, i) {
    logForDebugging(`[inProcessRunner] ${e.agentName} starting poll loop (abort=${t.signal.aborted})`);
    let l = Date.now();
    let c = 0;
    while (!t.signal.aborted) {
      if (c > 0) {
        await sleep(500);
      }
      c++;
      let u = r();
      let d = u.tasks[n];
      if (d && d.type === "in_process_teammate" && d.pendingUserMessages.length > 0) {
        let f = d.pendingUserMessages[0];
        nfe(n, h => ({
          ...h,
          pendingUserMessages: h.pendingUserMessages.slice(1)
        }), o);
        logForDebugging(`[inProcessRunner] ${e.agentName} found pending user message (poll #${c})`);
        return {
          type: "new_message",
          message: f.text,
          origin: f.origin,
          from: "user"
        };
      }
      if (d && d.type === "in_process_teammate" && d.shutdownRequested && i) {
        return {
          type: "aborted"
        };
      }
      if (d?.type === "in_process_teammate" && d.awaitingPlanApproval || u.viewingAgentTaskId === n) {
        l = Date.now();
      }
      if (t.signal.aborted) {
        logForDebugging(`[inProcessRunner] ${e.agentName} aborted while waiting (poll #${c})`);
        return {
          type: "aborted"
        };
      }
      if (i) {
        continue;
      }
      logForDebugging(`[inProcessRunner] ${e.agentName} poll #${c}: checking mailbox`);
      try {
        let f = await o0l(e, n, o);
        if (f) {
          return f;
        }
      } catch (f) {
        logForDebugging(`[inProcessRunner] ${e.agentName} poll error: ${f}`);
      }
      let m = await r0l(s, e.agentName);
      if (m) {
        return {
          type: "new_message",
          message: m,
          from: "task-list"
        };
      }
    }
    logForDebugging(`[inProcessRunner] ${e.agentName} exiting poll loop (abort=${t.signal.aborted}, polls=${c})`);
    return {
      type: "aborted"
    };
  }
  async function qIm(e) {
    let {
      identity: t,
      taskId: n,
      prompt: r,
      description: o,
      agentDefinition: s,
      teammateContext: i,
      toolUseContext: a,
      abortController: l,
      model: c,
      systemPrompt: u,
      systemPromptMode: d,
      allowedTools: p,
      allowPermissionPrompts: m,
      invokingRequestId: f,
      standalone: h = false,
      resumeMessages: g,
      resumeReplacementState: y,
      initialFrom: _
    } = e;
    let {
      setAppState: b,
      taskRegistry: S
    } = a;
    let E = Epe(n);
    logForDebugging(`[inProcessRunner] Starting agent loop for ${t.agentId}`);
    let C = {
      agentId: t.agentId,
      parentAgentId: a.agentId,
      depth: PW(a.agentContext),
      parentSessionId: t.parentSessionId,
      agentName: t.agentName,
      teamName: t.teamName,
      agentColor: t.color,
      planModeRequired: t.planModeRequired,
      isTeamLead: false,
      agentType: "teammate",
      invokingRequestId: f,
      invocationKind: "spawn",
      invocationEmitted: false
    };
    let {
      tools: x,
      mainLoopModel: A
    } = a.rootToolSurface;
    let k;
    if (d === "replace" && u) {
      k = u;
    } else {
      let z = [...(await GO(x, A)), TEAMMATE_SYSTEM_PROMPT_ADDENDUM];
      if (s) {
        let V = s.getSystemPrompt();
        if (V) {
          z.push(`
# Custom Agent Instructions
${V}`);
        }
        if (s.memory) {
          logEvent("tengu_agent_memory_loaded", {
            ...false,
            scope: s.memory,
            source: "in-process-teammate"
          });
        }
      }
      if (d === "append" && u) {
        z.push(u);
      }
      k = z.join(`
`);
    }
    let I = {
      agentType: t.agentName,
      whenToUse: `In-process teammate: ${t.agentName}`,
      getSystemPrompt: () => k,
      tools: s?.tools ? Ro([...s.tools, "SendMessage", "TaskCreate", "TaskGet", "TaskList", "TaskUpdate"]) : ["*"],
      source: "projectSettings",
      permissionMode: "default",
      ...(s?.model && {
        model: s.model
      })
    };
    let O = g ? [...g] : [];
    let M = new Set(g?.map(j => j.uuid));
    let L = {
      taskKind: "in_process_teammate",
      teamName: t.teamName,
      color: t.color,
      planModeRequired: t.planModeRequired,
      ...(s && {
        customAgentType: s.agentType
      }),
      ...(c && {
        model: c
      })
    };
    let P = formatTeammateMessage({
      from: _ ?? "team-lead",
      text: r,
      summary: o
    });
    let F = P;
    let H = undefined;
    let U = false;
    let N = false;
    let W = j => {
      switch (j.type) {
        case "shutdown_request":
          logForDebugging(`[inProcessRunner] ${t.agentId} received shutdown request - passing to model`);
          F = formatTeammateMessage({
            from: j.request?.from || "team-lead",
            text: j.originalMessage
          });
          H = undefined;
          yXn(n, In({
            content: F
          }), S);
          break;
        case "new_message":
          if (logForDebugging(`[inProcessRunner] ${t.agentId} received new message from ${j.from}`), j.from === "user") {
            F = j.message;
            H = j.origin;
          } else {
            F = formatTeammateMessage({
              from: j.from,
              text: j.message,
              color: j.color,
              summary: j.summary
            });
            H = undefined;
            yXn(n, In({
              content: F
            }), S);
          }
          break;
        case "new_messages":
          logForDebugging(`[inProcessRunner] ${t.agentId} received ${j.messages.length} drained message(s)`);
          F = formatTeammateMessages(j.messages, {
            recipientIsLead: false
          });
          H = undefined;
          yXn(n, In({
            content: F
          }), S);
          break;
        case "aborted":
          logForDebugging(`[inProcessRunner] ${t.agentId} aborted while waiting`);
          U = true;
          break;
        case "idle_timeout":
          if (logForDebugging(`[inProcessRunner] ${t.agentId} idle timeout \u2014 exiting loop`), !h) {
            a.agentLifecycle.setTeammate(t.agentId, undefined);
            removeMemberByAgentId(t.teamName, t.agentId);
          }
          U = true;
          break;
      }
    };
    if (!h) {
      await r0l(t.parentSessionId, t.agentName);
    }
    try {
      S.updateTranscript(n, Q => {
        let Z = Q.messages;
        if (g) {
          for (let ne of g.slice(-50)) {
            Z = Y1e(Z, ne);
          }
        }
        return {
          ...Q,
          messages: Y1e(Z, In({
            content: P
          }))
        };
      });
      let j = a.contentReplacementState ? y ?? EGt() : undefined;
      let z = Cae();
      let V = Si();
      while (!l.signal.aborted && !U) {
        logForDebugging(`[inProcessRunner] ${t.agentId} processing prompt: ${F.substring(0, 50)}...`);
        let Q = createAbortController();
        nfe(n, ke => ({
          ...ke,
          currentWorkAbortController: Q,
          retryWake: V
        }), S);
        let Z = In({
          content: F,
          origin: H
        });
        let ne = [Z];
        let oe = O;
        let ee = Ob(O, bytesPerTokenForModel(A));
        if (ee > S4t(A, a.options.autoCompactWindow)) {
          logForDebugging(`[inProcessRunner] ${t.agentId} compacting history (${ee} tokens)`);
          let ke = {
            ...a,
            abortController: l,
            agentId: t.agentId,
            readFileState: hTe(a.readFileState),
            memorySelector: xDe(),
            loadedNestedMemoryPaths: {},
            onCompactEvent: undefined
          };
          try {
            let Ie = await ktr(O, ke, {
              systemPrompt: [],
              userContext: {},
              systemContext: {},
              toolUseContext: ke,
              forkContextMessages: O
            }, true, undefined, true);
            if (oe = ATe(Ie), j) {
              j = EGt();
            }
            O.length = 0;
            O.push(...oe);
            M.clear();
            S.updateTranscript(n, Ue => ({
              ...Ue,
              messages: [...oe, Z]
            }));
          } catch (Ie) {
            if (Ie instanceof Error && Ie.message.startsWith("Compaction blocked by PreCompact hook")) {
              logForDebugging(`[inProcessRunner] ${t.agentId} compaction blocked by PreCompact hook; continuing uncompacted`);
              N = true;
            } else if (l.signal.aborted || Ie instanceof Error && Ie.message === "API Error: Request was aborted.") {
              logForDebugging(`[inProcessRunner] ${t.agentId} aborted during compaction`);
              U = true;
              break;
            } else {
              throw Ie;
            }
          }
        }
        let re = oe.length > 0 ? [...oe] : undefined;
        O.push(Z);
        let se = i5n();
        let ae = c5n(x);
        let de = [];
        let fe = a.getAppState().tasks[n];
        let me = fe && fe.type === "in_process_teammate" ? fe.permissionMode : "default";
        let Te = {
          ...I,
          permissionMode: me
        };
        let ue = false;
        let ce = null;
        if (await runWithTeammateContext(i, async () => p8(C, async () => {
          nfe(n, ke => ({
            ...ke,
            status: "running",
            isIdle: false,
            evictAfter: undefined
          }), S);
          S.updateTranscript(n, ke => ({
            ...ke,
            turnStartTime: Date.now()
          }));
          E.setMode("responding");
          for await (let ke of I3({
            agentDefinition: Te,
            promptMessages: ne,
            toolUseContext: a,
            canUseTool: UIm(t, Q, Ie => {
              nfe(n, Ue => ({
                ...Ue,
                totalPausedMs: (Ue.totalPausedMs ?? 0) + Ie
              }), S);
            }, NDe(b)),
            isAsync: true,
            canShowPermissionPrompts: m ?? true,
            forkContextMessages: re,
            querySource: "agent:custom",
            override: {
              abortController: Q,
              agentContext: C,
              onRetryStatus: E.setRetryStatus,
              subscribeRetryWake: V.subscribe,
              ...(t.resumableAgentId && {
                agentId: t.resumableAgentId
              })
            },
            ...(t.resumableAgentId && {
              recordedUuids: M,
              name: t.agentName,
              description: o,
              extraMetadata: {
                ...L,
                permissionMode: me
              }
            }),
            model: c,
            preserveToolUseResults: true,
            availableTools: x,
            allowedTools: p,
            contentReplacementState: j,
            stickyBetas: z,
            isTeammate: true,
            teammateContext: i
          })) {
            if (l.signal.aborted) {
              logForDebugging(`[inProcessRunner] ${t.agentId} lifecycle aborted`);
              break;
            }
            if (Q.signal.aborted) {
              if (logForDebugging(`[inProcessRunner] ${t.agentId} current work aborted (Escape pressed)`), ke.type === "assistant" || ke.type === "user") {
                de.push(ke);
                O.push(ke);
                ce = Hde(O, ke, ce);
              }
              ue = true;
              break;
            }
            if (ke.type === "spinner_mode") {
              E.setMode(ke.mode);
              continue;
            }
            if (ke.type === "api_metrics") {
              continue;
            }
            if (ke.type === "set_in_progress_tool_use_ids") {
              if (ke.op.action !== "remove") {
                continue;
              }
              let Ue = ke.op.ids;
              S.updateTranscript(n, Ge => {
                let Be = new Set(Ge.inProgressToolUseIDs);
                let We = false;
                for (let Ze of Ue) {
                  if (Be.delete(Ze)) {
                    We = true;
                  }
                }
                return We ? {
                  ...Ge,
                  inProgressToolUseIDs: Be
                } : Ge;
              });
              continue;
            }
            de.push(ke);
            O.push(ke);
            ce = Hde(O, ke, ce);
            l5n(se, ke, ae, x);
            let Ie = N6t(se);
            nfe(n, Ue => ({
              ...Ue,
              progress: Ie
            }), S);
            S.updateTranscript(n, Ue => {
              let Ge = Ue.inProgressToolUseIDs;
              if (ke.type === "assistant") {
                for (let Be of ke.message.content) {
                  if (Be.type === "tool_use") {
                    Ge = new Set([...Ge, Be.id]);
                  }
                }
              } else if (ke.type === "user") {
                let Be = ke.message.content;
                if (Array.isArray(Be)) {
                  for (let We of Be) {
                    if (typeof We === "object" && "type" in We && We.type === "tool_result") {
                      Ge = new Set(Ge);
                      Ge.delete(We.tool_use_id);
                    }
                  }
                }
              }
              return {
                ...Ue,
                messages: lml(Ue.messages, ke),
                inProgressToolUseIDs: Ge
              };
            });
          }
          return {
            success: true,
            messages: de
          };
        })).finally(() => {
          if (ce) {
            O.push(...ce.preserved);
            ce = null;
          }
        }), nfe(n, ke => ({
          ...ke,
          currentWorkAbortController: undefined
        }), S), l.signal.aborted) {
          break;
        }
        if (ue) {
          logForDebugging(`[inProcessRunner] ${t.agentId} work interrupted, returning to idle`);
          let ke = Ml({
            content: "API Error: Request was aborted."
          });
          S.updateTranscript(n, Ie => ({
            ...Ie,
            messages: Y1e(Ie.messages, ke)
          }));
        }
        if (!h && !ue) {
          let ke = null;
          try {
            ke = await o0l(t, n, S);
          } catch (Ie) {
            logForDebugging(`[inProcessRunner] ${t.agentName} turn-end mailbox check failed: ${Ie}`);
          }
          if (ke) {
            W(ke);
            continue;
          }
        }
        let pe = a.getAppState().tasks[n];
        let ve = pe?.type === "in_process_teammate" && pe.isIdle;
        nfe(n, ke => (ke.onIdleCallbacks?.forEach(Ie => Ie()), {
          ...ke,
          isIdle: true,
          evictAfter: Date.now() + 30000,
          onIdleCallbacks: []
        }), S);
        let _e = !ue && !Q.signal.aborted ? Atr(de) : undefined;
        if (!ve && !h) {
          await n0l(t.agentName, t.color, t.teamName, {
            idleReason: ue ? "interrupted" : _e !== undefined ? "failed" : "available",
            summary: getLastPeerDmSummary(O),
            failureReason: _e
          });
        } else {
          logForDebugging(`[inProcessRunner] Skipping duplicate idle notification for ${t.agentName}`);
        }
        logForDebugging(`[inProcessRunner] ${t.agentId} finished prompt, waiting for next`);
        let xe = await jIm(t, l, n, a.getAppState, S, t.parentSessionId, h);
        W(xe);
      }
      let K = false;
      let J;
      if (nfe(n, Q => {
        if (Q.status !== "running") {
          K = true;
          return Q;
        }
        J = Q.toolUseId;
        Q.onIdleCallbacks?.forEach(Z => Z());
        return {
          ...Q,
          status: "completed",
          notified: true,
          endTime: Date.now(),
          pendingUserMessages: [],
          abortController: undefined,
          currentWorkAbortController: undefined,
          retryWake: undefined,
          onIdleCallbacks: []
        };
      }, S), !K) {
        S.updateTranscript(n, Q => ({
          ...Q,
          messages: Q.messages.length ? [Q.messages.at(-1)] : [],
          inProgressToolUseIDs: new Set()
        }));
      }
      if (evictTaskOutput(n), S.evictTerminal(n), !K) {
        zu(n, "completed", {
          toolUseId: J,
          summary: t.agentId
        });
      }
      if (R5e(t.agentId), N) {
        Et("swarm_in_process_run", "compact_blocked_by_hook");
      } else {
        Pe("swarm_in_process_run");
      }
      return {
        success: true,
        messages: O
      };
    } catch (j) {
      let z = j instanceof Error ? j.message : "Unknown error";
      logForDebugging(`[inProcessRunner] Agent ${t.agentId} failed: ${z}`);
      let V = false;
      let K;
      if (nfe(n, J => {
        if (J.status !== "running") {
          V = true;
          return J;
        }
        K = J.toolUseId;
        J.onIdleCallbacks?.forEach(Q => Q());
        return {
          ...J,
          status: "failed",
          notified: true,
          error: z,
          isIdle: true,
          endTime: Date.now(),
          onIdleCallbacks: [],
          pendingUserMessages: [],
          abortController: undefined,
          currentWorkAbortController: undefined,
          retryWake: undefined
        };
      }, S), !V) {
        S.updateTranscript(n, J => ({
          ...J,
          messages: J.messages.length ? [J.messages.at(-1)] : [],
          inProgressToolUseIDs: new Set()
        }));
      }
      if (evictTaskOutput(n), S.evictTerminal(n), !V) {
        zu(n, "failed", {
          toolUseId: K,
          summary: t.agentId
        });
      }
      if (!h) {
        await n0l(t.agentName, t.color, t.teamName, {
          idleReason: "failed",
          completedStatus: "failed",
          failureReason: z
        });
      }
      R5e(t.agentId);
      Ae("swarm_in_process_run", "agent_loop_failed");
      return {
        success: false,
        error: z,
        messages: O
      };
    }
  }
  function QTt(e) {
    let t = e.identity.agentId;
    qIm(e).catch(n => {
      logForDebugging(`[inProcessRunner] Unhandled error in ${t}: ${n}`);
    });
  }
  var xtr = __lazy(() => {
    vpe();
    dz();
    POo();
    Etr();
    NYt();
    XTt();
    ln();
    Ot();
    d$();
    Dde();
    IWt();
    lLe();
    ry();
    Uve();
    D_();
    XOo();
    ro();
    cE();
    U$();
    TO();
    Kp();
    _h();
    Sl();
    je();
    qI();
    Cde();
    ro();
    Eo();
    Zk();
    oy();
    ph();
    YI();
    Uj();
    uA();
    Smt();
    zI();
    eL();
    WTt();
    UM();
  });
  class s0l {
    type = "in-process";
    context = null;
    setContext(e) {
      this.context = e;
    }
    async isAvailable() {
      return true;
    }
    async spawn(e) {
      if (!this.context) {
        logForDebugging(`[InProcessBackend] spawn() called without context for ${e.name}`);
        return {
          success: false,
          agentId: `${e.name}@${e.teamName}`,
          error: "InProcessBackend not initialized. Call setContext() before spawn()."
        };
      }
      logForDebugging(`[InProcessBackend] spawn() called for ${e.name}`);
      let t = await Vbt({
        name: e.name,
        teamName: e.teamName,
        prompt: e.prompt,
        color: e.color,
        planModeRequired: e.planModeRequired ?? false
      }, this.context);
      if (!t.ok) {
        return {
          success: false,
          agentId: t.agentId,
          error: t.error
        };
      }
      QTt({
        identity: t.identity,
        taskId: t.taskId,
        prompt: e.prompt,
        teammateContext: t.teammateContext,
        toolUseContext: {
          ...this.context,
          messages: []
        },
        abortController: t.abortController,
        model: e.model,
        systemPrompt: e.systemPrompt,
        systemPromptMode: e.systemPromptMode,
        allowedTools: e.permissions,
        allowPermissionPrompts: e.allowPermissionPrompts
      });
      logForDebugging(`[InProcessBackend] Started agent execution for ${t.agentId}`);
      return {
        success: true,
        agentId: t.agentId,
        taskId: t.taskId,
        abortController: t.abortController
      };
    }
    async sendMessage(e, t) {
      logForDebugging(`[InProcessBackend] sendMessage() to ${e}: ${t.text.substring(0, 50)}...`);
      let n = NLt(e);
      if (!n) {
        throw logForDebugging(`[InProcessBackend] Invalid agentId format: ${e}`), Error(`Invalid agentId format: ${e}. Expected format: agentName@teamName`);
      }
      let {
        agentName: r,
        teamName: o
      } = n;
      await writeToMailbox(r, {
        text: t.text,
        from: t.from,
        color: t.color,
        timestamp: t.timestamp ?? new Date().toISOString()
      }, o);
      logForDebugging(`[InProcessBackend] sendMessage() completed for ${e}`);
    }
    async terminate(e, t) {
      if (logForDebugging(`[InProcessBackend] terminate() called for ${e}: ${t}`), !this.context) {
        logForDebugging(`[InProcessBackend] terminate() failed: no context set for ${e}`);
        return false;
      }
      let n = this.context.getAppState();
      let r = Uz(e, n.tasks);
      if (!r) {
        logForDebugging(`[InProcessBackend] terminate() failed: task not found for ${e}`);
        return false;
      }
      if (r.shutdownRequested) {
        logForDebugging(`[InProcessBackend] terminate(): shutdown already requested for ${e}`);
        return true;
      }
      let o = `shutdown-${e}-${Date.now()}`;
      let s = createShutdownRequestMessage({
        requestId: o,
        from: "team-lead",
        reason: t
      });
      let i = r.identity.agentName;
      await writeToMailbox(i, {
        from: "team-lead",
        text: De(s),
        timestamp: new Date().toISOString()
      }, r.identity.teamName);
      ugl(r.id, this.context.taskRegistry);
      logForDebugging(`[InProcessBackend] terminate() sent shutdown request to ${e}`);
      return true;
    }
    async kill(e) {
      if (logForDebugging(`[InProcessBackend] kill() called for ${e}`), !this.context) {
        logForDebugging(`[InProcessBackend] kill() failed: no context set for ${e}`);
        return false;
      }
      let t = this.context.getAppState();
      let n = Uz(e, t.tasks);
      if (!n) {
        logForDebugging(`[InProcessBackend] kill() failed: task not found for ${e}`);
        return false;
      }
      let r = Uze(n.id, this.context.taskRegistry, this.context.setAppState);
      logForDebugging(`[InProcessBackend] kill() ${r ? "succeeded" : "failed"} for ${e}`);
      return r;
    }
    async isActive(e) {
      if (logForDebugging(`[InProcessBackend] isActive() called for ${e}`), !this.context) {
        logForDebugging(`[InProcessBackend] isActive() failed: no context set for ${e}`);
        return false;
      }
      let t = this.context.getAppState();
      let n = Uz(e, t.tasks);
      if (!n) {
        logForDebugging(`[InProcessBackend] isActive(): task not found for ${e}`);
        return false;
      }
      let r = n.status === "running";
      let o = n.abortController?.signal.aborted ?? true;
      let s = r && !o;
      logForDebugging(`[InProcessBackend] isActive() for ${e}: ${s} (running=${r}, aborted=${o})`);
      return s;
    }
  }
  function i0l() {
    return new s0l();
  }
  var a0l = __lazy(() => {
    lLe();
    je();
    uA();
    xtr();
    aLe();
  });
  async function l0l() {
    if ((await execFileNoThrow("which", ["uv"])).code === 0) {
      logForDebugging("[it2Setup] Found uv (will use uv tool install)");
      return "uvx";
    }
    if ((await execFileNoThrow("which", ["pipx"])).code === 0) {
      logForDebugging("[it2Setup] Found pipx package manager");
      return "pipx";
    }
    if ((await execFileNoThrow("which", ["pip"])).code === 0) {
      logForDebugging("[it2Setup] Found pip package manager");
      return "pip";
    }
    if ((await execFileNoThrow("which", ["pip3"])).code === 0) {
      logForDebugging("[it2Setup] Found pip3 package manager");
      return "pip";
    }
    logForDebugging("[it2Setup] No Python package manager found");
    return null;
  }
  async function WIm() {
    return (await execFileNoThrow("which", ["it2"])).code === 0;
  }
  async function c0l(e) {
    logForDebugging(`[it2Setup] Installing it2 using ${e}`);
    let t;
    switch (e) {
      case "uvx":
        t = await execFileNoThrowWithCwd("uv", ["tool", "install", "it2"], {
          cwd: YYt.homedir()
        });
        break;
      case "pipx":
        t = await execFileNoThrowWithCwd("pipx", ["install", "it2"], {
          cwd: YYt.homedir()
        });
        break;
      case "pip":
        if (t = await execFileNoThrowWithCwd("pip", ["install", "--user", "it2"], {
          cwd: YYt.homedir()
        }), t.code !== 0) {
          t = await execFileNoThrowWithCwd("pip3", ["install", "--user", "it2"], {
            cwd: YYt.homedir()
          });
        }
        break;
    }
    if (t.code !== 0) {
      let n = t.stderr || "Unknown installation error";
      logForDebugging(`[it2Setup] Failed to install it2: ${n}`, {
        level: "error"
      });
      Ae("swarm_iterm2_it2_install", `${e}_install_failed`);
      return {
        success: false,
        error: n,
        packageManager: e
      };
    }
    logForDebugging("[it2Setup] it2 installed successfully");
    Pe("swarm_iterm2_it2_install");
    return {
      success: true,
      packageManager: e
    };
  }
  async function u0l() {
    if (logForDebugging("[it2Setup] Verifying it2 setup..."), !(await WIm())) {
      Ae("swarm_iterm2_it2_verify", "not_installed");
      return {
        success: false,
        error: "it2 CLI is not installed or not in PATH"
      };
    }
    let t = await execFileNoThrow("it2", ["session", "list"]);
    if (t.code !== 0) {
      let n = t.stderr.toLowerCase();
      if (n.includes("api") || n.includes("python") || n.includes("connection refused") || n.includes("not enabled")) {
        logForDebugging("[it2Setup] Python API not enabled in iTerm2");
        Et("swarm_iterm2_it2_verify", "python_api_not_enabled");
        return {
          success: false,
          error: "Python API not enabled in iTerm2 preferences",
          needsPythonApiEnabled: true
        };
      }
      Ae("swarm_iterm2_it2_verify", "communication_failed");
      return {
        success: false,
        error: t.stderr || "Failed to communicate with iTerm2"
      };
    }
    logForDebugging("[it2Setup] it2 setup verified successfully");
    Pe("swarm_iterm2_it2_verify");
    return {
      success: true
    };
  }
  function d0l() {
    return ["Almost done! Enable the Python API in iTerm2:", "", "  iTerm2 \u2192 Settings \u2192 General \u2192 Magic \u2192 Enable Python API", "", "After enabling, you may need to restart iTerm2."];
  }
  function p0l() {
    if (getGlobalConfig().iterm2It2SetupComplete !== true) {
      saveGlobalConfig(t => ({
        ...t,
        iterm2It2SetupComplete: true
      }));
      logForDebugging("[it2Setup] Marked it2 setup as complete");
    }
  }
  function m0l(e) {
    if (getGlobalConfig().preferTmuxOverIterm2 !== e) {
      saveGlobalConfig(n => ({
        ...n,
        preferTmuxOverIterm2: e
      }));
      logForDebugging(`[it2Setup] Set preferTmuxOverIterm2 = ${e}`);
    }
  }
  function f0l() {
    return getGlobalConfig().preferTmuxOverIterm2 === true;
  }
  var YYt;
  var bFo = __lazy(() => {
    ln();
    je();
    ji();
    YYt = require("os");
  });
  var JYt;
  var XYt;
  var QYt;
  var YKe;
  var Itr = __lazy(() => {
    JYt = ["SSL_CERT_FILE", "NODE_EXTRA_CA_CERTS", "REQUESTS_CA_BUNDLE", "CURL_CA_BUNDLE", "CLOUDSDK_CORE_CUSTOM_CA_CERTS_FILE", "HTTPLIB2_CA_CERTS"];
    XYt = ["AWS_CA_BUNDLE", "DENO_CERT", "CARGO_HTTP_CAINFO", "PIP_CERT", "GIT_SSL_CAINFO", "GRPC_DEFAULT_SSL_ROOTS_FILE_PATH", "NIX_SSL_CERT_FILE", "HEX_CACERTS_PATH"];
    QYt = [...JYt, ...XYt];
    YKe = {
      UV_NATIVE_TLS: "true",
      DENO_TLS_CA_STORE: "system,mozilla"
    };
  });
  function h0l() {
    if (process.env["CLAUDE_CODE_TEAMMATE_COMMAND"]) {
      return process.env["CLAUDE_CODE_TEAMMATE_COMMAND"];
    }
    return rm() ? process.execPath : process.argv[1];
  }
  function g0l(e) {
    let t = [];
    let {
      planModeRequired: n,
      permissionMode: r,
      skipModel: o,
      effortValue: s
    } = e || {};
    if (n) {
      ;
    } else if (r === "bypassPermissions") {
      t.push("--dangerously-skip-permissions");
    } else if (r === "acceptEdits") {
      t.push("--permission-mode acceptEdits");
    } else if (r === "auto") {
      t.push("--permission-mode auto");
    }
    if (!o) {
      let u = process.env.CLAUDE_CODE_SUBAGENT_MODEL;
      if (u && u !== "inherit") {
        t.push(`--model ${Ja([u])}`);
      } else {
        let d = getMainLoopModelOverride();
        if (d) {
          t.push(`--model ${Ja([d])}`);
        }
      }
    }
    if (typeof s === "string" && jIe()) {
      t.push(`--effort ${s}`);
    }
    let i = getFlagSettingsExpectedContent() ?? getFlagSettingsPath();
    if (i) {
      t.push(`--settings ${Ja([i])}`);
    }
    let a = getInlinePlugins();
    for (let u of a) {
      t.push(`--plugin-dir ${Ja([u])}`);
    }
    for (let u of getInlinePluginsNoMcp()) {
      t.push(`--plugin-dir-no-mcp ${Ja([u])}`);
    }
    for (let u of getInlinePluginUrls()) {
      t.push(`--plugin-url ${Ja([u])}`);
    }
    let l = getTeammateModeFromSnapshot();
    t.push(`--teammate-mode ${l}`);
    let c = getChromeFlagOverride();
    if (c === true) {
      t.push("--chrome");
    } else if (c === false) {
      t.push("--no-chrome");
    }
    return t.join(" ");
  }
  function ZYt() {
    let e = ["CLAUDECODE=1", "CLAUDE_CODE_EXPERIMENTAL_AGENT_TEAMS=1"];
    let t = new Set(tyn(process.env));
    t.delete("CLAUDE_CODE_HOST_CREDS_FILE");
    for (let r of GIm) {
      if (t.vZc(r)) {
        continue;
      }
      let o = process.env[r];
      if (o !== undefined && o !== "") {
        e.push(`${r}=${Ja([o])}`);
      }
    }
    let n = process.env.CLAUDE_SECURESTORAGE_CONFIG_DIR;
    if (n !== undefined) {
      e.push(`CLAUDE_SECURESTORAGE_CONFIG_DIR=${Ja([n])}`);
    }
    return e.join(" ");
  }
  var GIm;
  var SFo = __lazy(() => {
    Itr();
    at();
    Fp();
    lW();
    YNe();
    eL();
    GIm = ["CLAUDE_CODE_USE_BEDROCK", "CLAUDE_CODE_USE_VERTEX", "CLAUDE_CODE_USE_FOUNDRY", "CLAUDE_CODE_USE_ANTHROPIC_AWS", "CLAUDE_CODE_USE_MANTLE", "ANTHROPIC_AWS_WORKSPACE_ID", "ANTHROPIC_AWS_BASE_URL", "ANTHROPIC_AWS_API_KEY", "CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH", "AWS_BEARER_TOKEN_BEDROCK", "ANTHROPIC_BEDROCK_MANTLE_BASE_URL", "CLAUDE_CODE_SKIP_MANTLE_AUTH", "AWS_REGION", "AWS_DEFAULT_REGION", "AWS_PROFILE", "AWS_CONFIG_FILE", "AWS_SHARED_CREDENTIALS_FILE", "ANTHROPIC_BEDROCK_SERVICE_TIER", "CLAUDE_CODE_SUBAGENT_MODEL", "ANTHROPIC_BASE_URL", "CLAUDE_CONFIG_DIR", "CLAUDE_CODE_REMOTE", "CLAUDE_CODE_REMOTE_MEMORY_DIR", "HTTPS_PROXY", "https_proxy", "HTTP_PROXY", "http_proxy", "NO_PROXY", "no_proxy", ...QYt, ...Object.keys(YKe), "CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC", "CLAUDE_CODE_HOST_CREDS_FILE", "CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST", "DISABLE_ERROR_REPORTING", "DISABLE_GROWTHBOOK", "DISABLE_TELEMETRY", "DO_NOT_TRACK"];
  });
  class y0l {
    type;
    backend;
    context = null;
    spawnedTeammates;
    cleanupRegistered = false;
    constructor(e) {
      this.backend = e;
      this.type = e.type;
      this.spawnedTeammates = new Map();
    }
    setContext(e) {
      this.context = e;
    }
    async isAvailable() {
      return this.backend.isAvailable();
    }
    async spawn(e) {
      let t = m8(e.name, e.teamName);
      if (isStructuredProtocolMessage(e.prompt)) {
        Ae("swarm_pane_spawn", "protocol_frame_prompt");
        return {
          success: false,
          agentId: t,
          error: "Teammate prompt must not be a mailbox protocol frame (permission/mode/plan/shutdown JSON) \u2014 pass plain-text instructions"
        };
      }
      if (!this.context) {
        logForDebugging(`[PaneBackendExecutor] spawn() called without context for ${e.name}`);
        Ae("swarm_pane_spawn", "no_context");
        return {
          success: false,
          agentId: t,
          error: "PaneBackendExecutor not initialized. Call setContext() before spawn()."
        };
      }
      let n = "pane_create";
      try {
        let r = e.color ?? this.context.teammateColors.assign(t);
        let {
          paneId: o,
          isFirstTeammate: s
        } = await this.backend.createTeammatePaneInSwarmView(e.name, r);
        let i = await isInsideTmux();
        if (s && i) {
          await this.backend.enablePaneBorderStatus();
        }
        let a = h0l();
        let l = [`--agent-id ${Ja([t])}`, `--agent-name ${Ja([e.name])}`, `--team-name ${Ja([e.teamName])}`, `--agent-color ${Ja([r])}`, `--parent-session-id ${Ja([e.parentSessionId || getSessionId()])}`, e.planModeRequired ? "--plan-mode-required" : ""].filter(Boolean).join(" ");
        let c = g0l({
          planModeRequired: e.planModeRequired,
          permissionMode: getToolPermissionContext(this.context).mode,
          effortValue: this.context.getAppState().effortValue,
          skipModel: !!e.model
        });
        if (e.model) {
          c = c ? `${c} --model ${Ja([e.model])}` : `--model ${Ja([e.model])}`;
        }
        let u = c ? ` ${c}` : "";
        let d = e.cwd;
        let p = ZYt();
        let m = `cd ${Ja([d])} && env ${p} ${Ja([a])} ${l}${u}`;
        if (n = "send_command", await this.backend.sendCommandToPane(o, m, !i), this.spawnedTeammates.set(t, {
          paneId: o,
          insideTmux: i
        }), !this.cleanupRegistered) {
          this.cleanupRegistered = true;
          Ti(async () => {
            for (let [f, h] of this.spawnedTeammates) {
              logForDebugging(`[PaneBackendExecutor] Cleanup: killing pane for ${f}`);
              await this.backend.killPane(h.paneId, !h.insideTmux);
            }
            this.spawnedTeammates.clear();
          });
        }
        await writeToMailbox(e.name, {
          from: "team-lead",
          text: e.prompt,
          timestamp: new Date().toISOString()
        }, e.teamName);
        logForDebugging(`[PaneBackendExecutor] Spawned teammate ${t} in pane ${o}`);
        Pe("swarm_pane_spawn");
        return {
          success: true,
          agentId: t,
          paneId: o
        };
      } catch (r) {
        let o = r instanceof Error ? r.message : String(r);
        logForDebugging(`[PaneBackendExecutor] Failed to spawn ${t}: ${o}`);
        Ae("swarm_pane_spawn", n === "pane_create" ? "pane_create_failed" : "send_command_failed");
        return {
          success: false,
          agentId: t,
          error: o
        };
      }
    }
    async sendMessage(e, t) {
      logForDebugging(`[PaneBackendExecutor] sendMessage() to ${e}: ${t.text.substring(0, 50)}...`);
      let n = NLt(e);
      if (!n) {
        throw Error(`Invalid agentId format: ${e}. Expected format: agentName@teamName`);
      }
      let {
        agentName: r,
        teamName: o
      } = n;
      await writeToMailbox(r, {
        text: t.text,
        from: t.from,
        color: t.color,
        timestamp: t.timestamp ?? new Date().toISOString()
      }, o);
      logForDebugging(`[PaneBackendExecutor] sendMessage() completed for ${e}`);
    }
    async terminate(e, t) {
      logForDebugging(`[PaneBackendExecutor] terminate() called for ${e}: ${t}`);
      let n = NLt(e);
      if (!n) {
        logForDebugging("[PaneBackendExecutor] terminate() failed: invalid agentId format");
        return false;
      }
      let {
        agentName: r,
        teamName: o
      } = n;
      let s = {
        type: "shutdown_request",
        requestId: `shutdown-${e}-${Date.now()}`,
        from: "team-lead",
        reason: t
      };
      await writeToMailbox(r, {
        from: "team-lead",
        text: De(s),
        timestamp: new Date().toISOString()
      }, o);
      logForDebugging(`[PaneBackendExecutor] terminate() sent shutdown request to ${e}`);
      return true;
    }
    async kill(e) {
      logForDebugging(`[PaneBackendExecutor] kill() called for ${e}`);
      let t = this.spawnedTeammates.get(e);
      if (!t) {
        logForDebugging(`[PaneBackendExecutor] kill() failed: teammate ${e} not found in spawned map`);
        return false;
      }
      let {
        paneId: n,
        insideTmux: r
      } = t;
      let o = await this.backend.killPane(n, !r);
      if (o) {
        this.spawnedTeammates.delete(e);
        logForDebugging(`[PaneBackendExecutor] kill() succeeded for ${e}`);
      } else {
        logForDebugging(`[PaneBackendExecutor] kill() failed for ${e}`);
      }
      return o;
    }
    async isActive(e) {
      if (logForDebugging(`[PaneBackendExecutor] isActive() called for ${e}`), !this.spawnedTeammates.get(e)) {
        logForDebugging(`[PaneBackendExecutor] isActive(): teammate ${e} not found`);
        return false;
      }
      return true;
    }
  }
  function _0l(e) {
    return new y0l(e);
  }
  var b0l = __lazy(() => {
    at();
    ln();
    hd();
    je();
    uA();
    Sl();
    SFo();
  });
  var v0l = {};
  __export(v0l, {
    respawnPaneWithCommand: () => respawnPaneWithCommand,
    TmuxBackend: () => TmuxBackend
  });
  function T0l(e) {
    let t = `Failed to create teammate pane: ${e}`;
    let n = e.toLowerCase();
    return n.includes("no space") || n.includes("too small") ? `${t} \u2014 no room for another tmux split. Spawn fewer concurrent teammates, enlarge your terminal if running inside tmux, or switch to in-process teammates via /config.` : t;
  }
  function VIm() {
    let e;
    let t = new Promise(r => {
      e = r;
    });
    let n = S0l;
    S0l = t;
    return n.then(() => e);
  }
  function E0l(e) {
    return {
      red: "red",
      blue: "blue",
      green: "green",
      yellow: "yellow",
      purple: "magenta",
      orange: "colour208",
      pink: "colour205",
      cyan: "cyan"
    }[e];
  }
  function P3(e) {
    let t = getUserTmuxSocket();
    let n = t ? ["-S", t, ...e] : e;
    return execFileNoThrow("tmux", n);
  }
  function pH(e) {
    return execFileNoThrow("tmux", ["-L", tKt(), ...e]);
  }
  async function respawnPaneWithCommand(e, t, n) {
    await execFileNoThrow("tmux", [...e, "set-option", "-p", "-t", t, "remain-on-exit", "failed"]);
    let r = await execFileNoThrow("tmux", [...e, "respawn-pane", "-k", "-t", t, "--", n]);
    if (r.code !== 0) {
      throw new nH(`Failed to send command to pane ${t}: ${r.stderr}`);
    }
  }
  class TmuxBackend {
    type = "tmux";
    displayName = "tmux";
    supportsHideShow = true;
    cachedLeaderWindowTarget = null;
    firstPaneUsedForExternal = false;
    async isAvailable() {
      return isTmuxAvailable();
    }
    async isRunningInside() {
      return isInsideTmux();
    }
    async createTeammatePaneInSwarmView(e, t) {
      let n = await VIm();
      try {
        if (await this.isRunningInside()) {
          return await this.createTeammatePaneWithLeader(e, t);
        }
        return await this.createTeammatePaneExternal(e, t);
      } finally {
        n();
      }
    }
    async sendCommandToPane(e, t, n = false) {
      try {
        Hbt(t);
      } catch (s) {
        throw Ae("swarm_pane_spawn", "swarm_pane_command_control_chars"), s;
      }
      let r = getUserTmuxSocket();
      let o = n ? ["-L", tKt()] : r ? ["-S", r] : [];
      await respawnPaneWithCommand(o, e, t);
    }
    async setPaneBorderColor(e, t, n = false) {
      let r = E0l(t);
      let o = n ? pH : P3;
      await o(["set-option", "-p", "-t", e, "window-style", `bg=default,fg=${r}`]);
      await o(["set-option", "-p", "-t", e, "pane-border-style", `fg=${r}`]);
      await o(["set-option", "-p", "-t", e, "pane-active-border-style", `fg=${r}`]);
    }
    async setPaneTitle(e, t, n, r = false) {
      let o = E0l(n);
      let s = r ? pH : P3;
      await s(["select-pane", "-t", e, "-T", t]);
      await s(["set-option", "-p", "-t", e, "pane-border-format", `#[fg=${o},bold] #{pane_title} #[default]`]);
    }
    async enablePaneBorderStatus(e, t = false) {
      let n = e || (await this.getCurrentWindowTarget());
      if (!n) {
        return;
      }
      await (t ? pH : P3)(["set-option", "-w", "-t", n, "pane-border-status", "top"]);
    }
    async rebalancePanes(e, t) {
      if (t) {
        await this.rebalancePanesWithLeader(e);
      } else {
        await this.rebalancePanesTiled(e);
      }
    }
    async killPane(e, t = false) {
      return (await (t ? pH : P3)(["kill-pane", "-t", e])).code === 0;
    }
    async hidePane(e, t = false) {
      let n = t ? pH : P3;
      await n(["new-session", "-d", "-s", "claude-hidden"]);
      let r = await n(["break-pane", "-d", "-s", e, "-t", `${"claude-hidden"}:`]);
      if (r.code === 0) {
        logForDebugging(`[TmuxBackend] Hidden pane ${e}`);
      } else {
        logForDebugging(`[TmuxBackend] Failed to hide pane ${e}: ${r.stderr}`);
      }
      return r.code === 0;
    }
    async showPane(e, t, n = false) {
      let r = n ? pH : P3;
      let o = await r(["join-pane", "-h", "-s", e, "-t", t]);
      if (o.code !== 0) {
        logForDebugging(`[TmuxBackend] Failed to show pane ${e}: ${o.stderr}`);
        return false;
      }
      logForDebugging(`[TmuxBackend] Showed pane ${e} in ${t}`);
      await r(["select-layout", "-t", t, "main-vertical"]);
      let i = (await r(["list-panes", "-t", t, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean);
      if (i[0]) {
        await r(["resize-pane", "-t", i[0], "-x", "30%"]);
      }
      return true;
    }
    async getCurrentPaneId() {
      let e = getLeaderPaneId();
      if (e) {
        return e;
      }
      let t = await P3(["display-message", "-p", "#{pane_id}"]);
      if (t.code !== 0) {
        logForDebugging(`[TmuxBackend] Failed to get current pane ID (exit ${t.code}): ${t.stderr}`);
        return null;
      }
      return t.stdout.trim();
    }
    async getCurrentWindowTarget() {
      if (this.cachedLeaderWindowTarget) {
        return this.cachedLeaderWindowTarget;
      }
      let e = getLeaderPaneId();
      let t = ["display-message"];
      if (e) {
        t.push("-t", e);
      }
      t.push("-p", "#{window_id}");
      let n = await P3(t);
      if (n.code !== 0) {
        logForDebugging(`[TmuxBackend] Failed to get current window target (exit ${n.code}): ${n.stderr}`);
        return null;
      }
      this.cachedLeaderWindowTarget = n.stdout.trim();
      return this.cachedLeaderWindowTarget;
    }
    async getCurrentWindowPaneCount(e, t = false) {
      let n = e || (await this.getCurrentWindowTarget());
      if (!n) {
        return null;
      }
      let r = ["list-panes", "-t", n, "-F", "#{pane_id}"];
      let o = t ? await pH(r) : await P3(r);
      if (o.code !== 0) {
        logForDebugging(`[TmuxBackend] Failed to get pane count for ${n} (exit ${o.code}): ${o.stderr}`, {
          level: "error"
        });
        return null;
      }
      return Bn(o.stdout.trim().split(`
`), Boolean);
    }
    async hasSessionInSwarm(e) {
      return (await pH(["has-session", "-t", e])).code === 0;
    }
    async createExternalSwarmSession() {
      if (!(await this.hasSessionInSwarm("claude-swarm"))) {
        let s = await pH(["new-session", "-d", "-s", "claude-swarm", "-n", "swarm-view", "-P", "-F", "#{pane_id}", "--", "cat"]);
        if (s.code !== 0) {
          throw new nH(`Failed to create swarm session: ${s.stderr || "Unknown error"}`);
        }
        let i = s.stdout.trim();
        let a = `${"claude-swarm"}:${"swarm-view"}`;
        logForDebugging(`[TmuxBackend] Created external swarm session with window ${a}, pane ${i}`);
        return {
          windowTarget: a,
          paneId: i
        };
      }
      let n = (await pH(["list-windows", "-t", "claude-swarm", "-F", "#{window_name}"])).stdout.trim().split(`
`).filter(Boolean);
      let r = `${"claude-swarm"}:${"swarm-view"}`;
      if (n.includes("swarm-view")) {
        let i = (await pH(["list-panes", "-t", r, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean);
        return {
          windowTarget: r,
          paneId: i[0] || ""
        };
      }
      let o = await pH(["new-window", "-t", "claude-swarm", "-n", "swarm-view", "-P", "-F", "#{pane_id}", "--", "cat"]);
      if (o.code !== 0) {
        throw new nH(`Failed to create swarm-view window: ${o.stderr || "Unknown error"}`);
      }
      return {
        windowTarget: r,
        paneId: o.stdout.trim()
      };
    }
    async createTeammatePaneWithLeader(e, t) {
      let n = await this.getCurrentPaneId();
      let r = await this.getCurrentWindowTarget();
      if (!n || !r) {
        throw new nH("Could not determine current tmux pane/window");
      }
      let o = await this.getCurrentWindowPaneCount(r);
      if (o === null) {
        throw new nH("Could not determine pane count for current window");
      }
      let s = o === 1;
      let i;
      if (s) {
        i = await P3(["split-window", "-d", "-t", n, "-h", "-l", "70%", "-P", "-F", "#{pane_id}", "--", "cat"]);
      } else {
        let u = (await P3(["list-panes", "-t", r, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean).slice(1);
        let d = u.length;
        let p = d % 2 === 1;
        let m = Math.floor((d - 1) / 2);
        let f = u[m] || u.at(-1);
        i = await P3(["split-window", "-d", "-t", f, p ? "-v" : "-h", "-P", "-F", "#{pane_id}", "--", "cat"]);
      }
      if (i.code !== 0) {
        throw new nH(T0l(i.stderr));
      }
      let a = i.stdout.trim();
      logForDebugging(`[TmuxBackend] Created teammate pane for ${e}: ${a}`);
      await this.setPaneBorderColor(a, t);
      await this.setPaneTitle(a, e, t);
      await this.rebalancePanesWithLeader(r);
      return {
        paneId: a,
        isFirstTeammate: s
      };
    }
    async createTeammatePaneExternal(e, t) {
      let {
        windowTarget: n,
        paneId: r
      } = await this.createExternalSwarmSession();
      let o = await this.getCurrentWindowPaneCount(n, true);
      if (o === null) {
        throw new nH("Could not determine pane count for swarm window");
      }
      let s = !this.firstPaneUsedForExternal && o === 1;
      let i;
      if (s) {
        i = r;
        this.firstPaneUsedForExternal = true;
        logForDebugging(`[TmuxBackend] Using initial pane for first teammate ${e}: ${i}`);
        await this.enablePaneBorderStatus(n, true);
      } else {
        let l = (await pH(["list-panes", "-t", n, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean);
        let c = l.length;
        let u = c % 2 === 1;
        let d = Math.floor((c - 1) / 2);
        let p = l[d] || l.at(-1);
        let m = await pH(["split-window", "-d", "-t", p, u ? "-v" : "-h", "-P", "-F", "#{pane_id}", "--", "cat"]);
        if (m.code !== 0) {
          throw new nH(T0l(m.stderr));
        }
        i = m.stdout.trim();
        logForDebugging(`[TmuxBackend] Created teammate pane for ${e}: ${i}`);
      }
      await this.setPaneBorderColor(i, t, true);
      await this.setPaneTitle(i, e, t, true);
      await this.rebalancePanesTiled(n);
      return {
        paneId: i,
        isFirstTeammate: s
      };
    }
    async rebalancePanesWithLeader(e) {
      let n = (await P3(["list-panes", "-t", e, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean);
      if (n.length <= 2) {
        return;
      }
      await P3(["select-layout", "-t", e, "main-vertical"]);
      let r = n[0];
      await P3(["resize-pane", "-t", r, "-x", "30%"]);
      logForDebugging(`[TmuxBackend] Rebalanced ${n.length - 1} teammate panes with leader`);
    }
    async rebalancePanesTiled(e) {
      let n = (await pH(["list-panes", "-t", e, "-F", "#{pane_id}"])).stdout.trim().split(`
`).filter(Boolean);
      if (n.length <= 1) {
        return;
      }
      await pH(["select-layout", "-t", e, "tiled"]);
      logForDebugging(`[TmuxBackend] Rebalanced ${n.length} teammate panes with tiled layout`);
    }
  }
  var S0l;
  var EFo = __lazy(() => {
    ln();
    je();
    ji();
    eL();
    Ive();
    FKt();
    S0l = Promise.resolve();
    registerTmuxBackend(TmuxBackend);
  });
  var C0l = {};
  __export(C0l, {
    ITermBackend: () => ITermBackend
  });
  function zIm() {
    let e;
    let t = new Promise(r => {
      e = r;
    });
    let n = w0l;
    w0l = t;
    return n.then(() => e);
  }
  function eJt(e) {
    return execFileNoThrow(getIt2Command(), e);
  }
  function KIm(e) {
    let t = e.match(/Created new pane:\s*(.+)/);
    if (t && t[1]) {
      return t[1].trim();
    }
    return "";
  }
  function YIm() {
    let e = process.env.ITERM_SESSION_ID;
    if (!e) {
      return null;
    }
    let t = e.indexOf(":");
    if (t === -1) {
      return null;
    }
    return e.slice(t + 1);
  }
  class ITermBackend {
    type = "iterm2";
    displayName = "iTerm2";
    supportsHideShow = false;
    async isAvailable() {
      let e = isInITerm2();
      if (logForDebugging(`[ITermBackend] isAvailable check: inITerm2=${e}`), !e) {
        logForDebugging("[ITermBackend] isAvailable: false (not in iTerm2)");
        return false;
      }
      let t = await isIt2CliAvailable();
      logForDebugging(`[ITermBackend] isAvailable: ${t} (it2 CLI ${t ? "found" : "not found"})`);
      return t;
    }
    async isRunningInside() {
      let e = isInITerm2();
      logForDebugging(`[ITermBackend] isRunningInside: ${e}`);
      return e;
    }
    async createTeammatePaneInSwarmView(e, t) {
      logForDebugging(`[ITermBackend] createTeammatePaneInSwarmView called for ${e} with color ${t}`);
      let n = await zIm();
      try {
        while (true) {
          let r = !Otr;
          logForDebugging(`[ITermBackend] Creating pane: isFirstTeammate=${r}, existingPanes=${iwe.length}`);
          let o;
          let s;
          if (r) {
            let l = YIm();
            if (l) {
              o = ["session", "split", "-v", "-s", l];
              logForDebugging(`[ITermBackend] First split from leader session: ${l}`);
            } else {
              o = ["session", "split", "-v"];
              logForDebugging("[ITermBackend] First split from active session (no leader ID)");
            }
          } else if (s = iwe.at(-1), s) {
            o = ["session", "split", "-s", s];
            logForDebugging(`[ITermBackend] Subsequent split from teammate session: ${s}`);
          } else {
            o = ["session", "split"];
            logForDebugging("[ITermBackend] Subsequent split from active session (no teammate ID)");
          }
          let i = await eJt(o);
          if (i.code !== 0) {
            if (s) {
              let l = await eJt(["session", "list"]);
              if (l.code === 0 && !l.stdout.includes(s)) {
                logForDebugging(`[ITermBackend] Split failed targeting dead session ${s}, pruning and retrying: ${i.stderr}`);
                let c = iwe.indexOf(s);
                if (c !== -1) {
                  iwe.splice(c, 1);
                }
                if (iwe.length === 0) {
                  Otr = false;
                }
                continue;
              }
            }
            throw new nH(`Failed to create iTerm2 split pane: ${i.stderr}`);
          }
          if (r) {
            Otr = true;
          }
          let a = KIm(i.stdout);
          if (!a) {
            throw Error(`Failed to parse session ID from split output: ${i.stdout}`);
          }
          logForDebugging(`[ITermBackend] Created teammate pane for ${e}: ${a}`);
          iwe.push(a);
          return {
            paneId: a,
            isFirstTeammate: r
          };
        }
      } finally {
        n();
      }
    }
    async sendCommandToPane(e, t, n) {
      try {
        Hbt(t);
      } catch (s) {
        throw Ae("swarm_pane_spawn", "swarm_pane_command_control_chars"), s;
      }
      let r = e ? ["-s", e] : [];
      await eJt(["session", "send", ...r, "\x15"]);
      let o = await eJt(["session", "run", ...r, t]);
      if (o.code !== 0) {
        throw new nH(`Failed to send command to iTerm2 pane ${e}: ${o.stderr}`);
      }
    }
    async setPaneBorderColor(e, t, n) {}
    async setPaneTitle(e, t, n, r) {}
    async enablePaneBorderStatus(e, t) {}
    async rebalancePanes(e, t) {
      logForDebugging("[ITermBackend] Pane rebalancing not implemented for iTerm2");
    }
    async killPane(e, t) {
      let n = await eJt(["session", "close", "-f", "-s", e]);
      let r = iwe.indexOf(e);
      if (r !== -1) {
        iwe.splice(r, 1);
      }
      if (iwe.length === 0) {
        Otr = false;
      }
      return n.code === 0;
    }
    async hidePane(e, t) {
      logForDebugging("[ITermBackend] hidePane not supported in iTerm2");
      return false;
    }
    async showPane(e, t, n) {
      logForDebugging("[ITermBackend] showPane not supported in iTerm2");
      return false;
    }
  }
  var iwe;
  var Otr = false;
  var w0l;
  var R0l = __lazy(() => {
    ln();
    je();
    ji();
    Ive();
    FKt();
    iwe = [];
    w0l = Promise.resolve();
    registerITermBackend(ITermBackend);
  });
  var cgl = {};
  __export(cgl, {
    resetBackendDetection: () => resetBackendDetection,
    registerTmuxBackend: () => registerTmuxBackend,
    registerITermBackend: () => registerITermBackend,
    markInProcessFallback: () => markInProcessFallback,
    isInProcessEnabled: () => isInProcessEnabled,
    globalBackendRegistry: () => globalBackendRegistry,
    getTeammateExecutor: () => getTeammateExecutor,
    getResolvedTeammateMode: () => getResolvedTeammateMode,
    getInProcessBackend: () => getInProcessBackend,
    getCachedDetectionResult: () => getCachedDetectionResult,
    getCachedBackend: () => getCachedBackend,
    getBackendByType: () => getBackendByType,
    ensureBackendsRegistered: () => ensureBackendsRegistered,
    detectAndGetBackend: () => detectAndGetBackend,
    createBackendRegistry: () => createBackendRegistry
  });
  function createBackendRegistry() {
    return {
      cachedBackend: null,
      cachedDetectionResult: null,
      backendsRegistered: false,
      cachedInProcessBackend: null,
      cachedPaneBackendExecutor: null,
      inProcessFallbackActive: false,
      TmuxBackendClass: null,
      ITermBackendClass: null
    };
  }
  async function ensureBackendsRegistered(e = globalBackendRegistry) {
    if (e.backendsRegistered) {
      return;
    }
    await Promise.resolve().then(() => (EFo(), v0l));
    await Promise.resolve().then(() => (R0l(), C0l));
    e.TmuxBackendClass = k0l ?? null;
    e.ITermBackendClass = A0l ?? null;
    e.backendsRegistered = true;
  }
  function registerTmuxBackend(e, t) {
    if (t) {
      t.TmuxBackendClass = e;
      return;
    }
    k0l = e;
  }
  function registerITermBackend(e, t) {
    if (logForDebugging(`[registry] registerITermBackend called, class=${e?.name || "undefined"}`), t) {
      t.ITermBackendClass = e;
      return;
    }
    A0l = e;
  }
  function Dtr(e) {
    if (!e.TmuxBackendClass) {
      throw Error("TmuxBackend not registered. Import TmuxBackend.ts before using the registry.");
    }
    return new e.TmuxBackendClass();
  }
  function RFo(e) {
    if (!e.ITermBackendClass) {
      throw Error("ITermBackend not registered. Import ITermBackend.ts before using the registry.");
    }
    return new e.ITermBackendClass();
  }
  async function detectAndGetBackend(e = globalBackendRegistry) {
    if (await ensureBackendsRegistered(e), e.cachedDetectionResult) {
      logForDebugging(`[BackendRegistry] Using cached backend: ${e.cachedDetectionResult.backend.type}`);
      return e.cachedDetectionResult;
    }
    if (logForDebugging("[BackendRegistry] Starting backend detection..."), getTeammateModeFromSnapshot() === "iterm2") {
      if (!isInITerm2()) {
        throw Ae("swarm_backend_detect", "iterm2_explicit_not_in_iterm2"), Error('teammateMode is set to "iterm2" but this session is not running inside iTerm2. Launch Claude from iTerm2, or change teammateMode in settings.');
      }
      if (!(await isIt2CliAvailable())) {
        throw Ae("swarm_backend_detect", "iterm2_explicit_no_it2"), Error('teammateMode is set to "iterm2" but the it2 CLI is not reachable. Install it with `pip install it2` and enable the Python API in iTerm2 (Preferences > General > Magic > Enable Python API).');
      }
      logForDebugging("[BackendRegistry] Selected: iterm2 (explicit teammateMode)");
      let o = RFo(e);
      e.cachedBackend = o;
      e.cachedDetectionResult = {
        backend: o,
        isNative: true,
        needsIt2Setup: false
      };
      Pe("swarm_backend_detect");
      return e.cachedDetectionResult;
    }
    let t = await isInsideTmux();
    let n = isInITerm2();
    if (logForDebugging(`[BackendRegistry] Environment: insideTmux=${t}, inITerm2=${n}`), t) {
      logForDebugging("[BackendRegistry] Selected: tmux (running inside tmux session)");
      let o = Dtr(e);
      e.cachedBackend = o;
      e.cachedDetectionResult = {
        backend: o,
        isNative: true,
        needsIt2Setup: false
      };
      Pe("swarm_backend_detect");
      return e.cachedDetectionResult;
    }
    if (n) {
      let o = f0l();
      if (o) {
        logForDebugging("[BackendRegistry] User prefers tmux over iTerm2, skipping iTerm2 detection");
      } else {
        let i = await isIt2CliAvailable();
        if (logForDebugging(`[BackendRegistry] iTerm2 detected, it2 CLI available: ${i}`), i) {
          logForDebugging("[BackendRegistry] Selected: iterm2 (native iTerm2 with it2 CLI)");
          let a = RFo(e);
          e.cachedBackend = a;
          e.cachedDetectionResult = {
            backend: a,
            isNative: true,
            needsIt2Setup: false
          };
          Pe("swarm_backend_detect");
          return e.cachedDetectionResult;
        }
      }
      let s = await isTmuxAvailable();
      if (logForDebugging(`[BackendRegistry] it2 not available, tmux available: ${s}`), s) {
        logForDebugging("[BackendRegistry] Selected: tmux (fallback in iTerm2, it2 setup recommended)");
        let i = Dtr(e);
        e.cachedBackend = i;
        e.cachedDetectionResult = {
          backend: i,
          isNative: false,
          needsIt2Setup: !o
        };
        Et("swarm_backend_detect", o ? "fallback_to_tmux" : "needs_it2_setup");
        return e.cachedDetectionResult;
      }
      throw logForDebugging("[BackendRegistry] ERROR: iTerm2 detected but no it2 CLI and no tmux"), Ae("swarm_backend_detect", "iterm2_no_it2_no_tmux"), Error("iTerm2 detected but it2 CLI not installed. Install it2 with: pip install it2");
    }
    let r = await isTmuxAvailable();
    if (logForDebugging(`[BackendRegistry] Not in tmux or iTerm2, tmux available: ${r}`), r) {
      logForDebugging("[BackendRegistry] Selected: tmux (external session mode)");
      let o = Dtr(e);
      e.cachedBackend = o;
      e.cachedDetectionResult = {
        backend: o,
        isNative: false,
        needsIt2Setup: false
      };
      Pe("swarm_backend_detect");
      return e.cachedDetectionResult;
    }
    throw logForDebugging("[BackendRegistry] ERROR: No pane backend available"), Ae("swarm_backend_detect", "no_backend_available"), Error(JIm());
  }
  function JIm() {
    switch (Wt()) {
      case "macos":
        return `To use agent swarms, install tmux:
  brew install tmux
Then start a tmux session with: tmux new-session -s claude`;
      case "linux":
      case "wsl":
        return `To use agent swarms, install tmux:
  sudo apt install tmux    # Ubuntu/Debian
  sudo dnf install tmux    # Fedora/RHEL
Then start a tmux session with: tmux new-session -s claude`;
      case "windows":
        return `To use agent swarms, you need tmux which requires WSL (Windows Subsystem for Linux).
Install WSL first, then inside WSL run:
  sudo apt install tmux
Then start a tmux session with: tmux new-session -s claude`;
      default:
        return `To use agent swarms, install tmux using your system's package manager.
Then start a tmux session with: tmux new-session -s claude`;
    }
  }
  function getBackendByType(e, t = globalBackendRegistry) {
    switch (e) {
      case "tmux":
        return Dtr(t);
      case "iterm2":
        return RFo(t);
    }
  }
  function getCachedBackend(e = globalBackendRegistry) {
    return e.cachedBackend;
  }
  function getCachedDetectionResult(e = globalBackendRegistry) {
    return e.cachedDetectionResult;
  }
  function markInProcessFallback(e = globalBackendRegistry) {
    logForDebugging("[BackendRegistry] Marking in-process fallback as active");
    e.inProcessFallbackActive = true;
  }
  function QIm() {
    return getTeammateModeFromSnapshot();
  }
  function isInProcessEnabled(e = globalBackendRegistry) {
    if (getIsNonInteractiveSession()) {
      logForDebugging("[BackendRegistry] isInProcessEnabled: true (non-interactive session)");
      return true;
    }
    let t = QIm();
    let n;
    if (t === "in-process") {
      n = true;
    } else if (t === "tmux" || t === "iterm2") {
      n = false;
    } else {
      if (e.inProcessFallbackActive) {
        logForDebugging("[BackendRegistry] isInProcessEnabled: true (fallback after pane backend unavailable)");
        return true;
      }
      let r = isInsideTmuxSync();
      let o = isInITerm2();
      n = !r && !o;
    }
    logForDebugging(`[BackendRegistry] isInProcessEnabled: ${n} (mode=${t}, insideTmux=${isInsideTmuxSync()}, inITerm2=${isInITerm2()})`);
    return n;
  }
  function getResolvedTeammateMode(e = globalBackendRegistry) {
    return isInProcessEnabled(e) ? "in-process" : "tmux";
  }
  function getInProcessBackend(e = globalBackendRegistry) {
    if (!e.cachedInProcessBackend) {
      e.cachedInProcessBackend = i0l();
    }
    return e.cachedInProcessBackend;
  }
  async function getTeammateExecutor(e = false, t = globalBackendRegistry) {
    if (e && isInProcessEnabled(t)) {
      logForDebugging("[BackendRegistry] Using in-process executor");
      return getInProcessBackend(t);
    }
    logForDebugging("[BackendRegistry] Using pane backend executor");
    return tPm(t);
  }
  async function tPm(e) {
    if (!e.cachedPaneBackendExecutor) {
      let t = await detectAndGetBackend(e);
      e.cachedPaneBackendExecutor = _0l(t.backend);
      logForDebugging(`[BackendRegistry] Created PaneBackendExecutor wrapping ${t.backend.type}`);
    }
    return e.cachedPaneBackendExecutor;
  }
  function resetBackendDetection(e = globalBackendRegistry) {
    e.cachedBackend = null;
    e.cachedDetectionResult = null;
    e.cachedInProcessBackend = null;
    e.cachedPaneBackendExecutor = null;
    e.backendsRegistered = false;
    e.inProcessFallbackActive = false;
  }
  var globalBackendRegistry;
  var k0l;
  var A0l;
  var Ive = __lazy(() => {
    at();
    ln();
    je();
    Cs();
    a0l();
    bFo();
    b0l();
    YNe();
    globalBackendRegistry = createBackendRegistry();
  });
  async function AFo() {
    return (await detectAndGetBackend()).backend;
  }
  async function P0l() {
    let {
      isInsideTmux: e
    } = await Promise.resolve().then(() => (JQ(), YIo));
    return e();
  }
  async function O0l(e, t) {
    return (await AFo()).createTeammatePaneInSwarmView(e, t);
  }
  async function D0l(e, t = false) {
    return (await AFo()).enablePaneBorderStatus(e, t);
  }
  async function M0l(e, t, n = false) {
    return (await AFo()).sendCommandToPane(e, t, n);
  }
  var N0l = __lazy(() => {
    Ive();
  });
  function rJt() {
    if (getAPIProvider() === "firstParty") {
      return rp().opus48;
    }
    return rp().opus47;
  }
  var IFo = __lazy(() => {
    sne();
    Ds();
  });
  function Ntr(e) {
    let t = getGlobalConfig().teammateDefaultModel;
    if (t === null) {
      return e ?? rJt();
    }
    if (t !== undefined) {
      let n = parseUserSpecifiedModel(t);
      if (isModelAllowed(n)) {
        return n;
      }
      PFo(t);
    }
    return rJt();
  }
  function OFo(e, t) {
    let n = process.env.CLAUDE_CODE_SUBAGENT_MODEL;
    if (n && n !== "inherit") {
      let r = parseUserSpecifiedModel(n);
      if (isModelAllowed(r)) {
        return r;
      }
      PFo(n);
      return Ntr(t);
    }
    if (e === "inherit") {
      return t ?? Ntr(t);
    }
    if (e !== undefined && !isModelAllowed(e)) {
      PFo(e);
      return Ntr(t);
    }
    return e ?? Ntr(t);
  }
  function PFo(e) {
    logForDebugging(`Teammate model "${e}" is not in the availableModels allowlist; using the default teammate model instead`, {
      level: "warn"
    });
  }
  async function nPm(e) {
    return (await execFileNoThrow("tmux", ["has-session", "-t", e])).code === 0;
  }
  async function rPm(e) {
    if (!(await nPm(e))) {
      let n = await execFileNoThrow("tmux", ["new-session", "-d", "-s", e]);
      if (n.code !== 0) {
        throw Ae("subagent_launch", "subagent_teammate_tmux_session_failed"), Error(`Failed to create tmux session '${e}': ${n.stderr || "Unknown error"}`);
      }
    }
  }
  function U0l() {
    if (process.env["CLAUDE_CODE_TEAMMATE_COMMAND"]) {
      return process.env["CLAUDE_CODE_TEAMMATE_COMMAND"];
    }
    return rm() ? process.execPath : process.argv[1];
  }
  function B0l(e) {
    let t = [];
    let {
      planModeRequired: n,
      permissionMode: r,
      skipModel: o,
      effortValue: s
    } = e || {};
    if (n) {
      ;
    } else if (r === "bypassPermissions") {
      t.push("--dangerously-skip-permissions");
    } else if (r === "acceptEdits") {
      t.push("--permission-mode acceptEdits");
    } else if (r === "auto") {
      t.push("--permission-mode auto");
    }
    if (!o) {
      let c = getMainLoopModelOverride();
      if (c) {
        t.push(`--model ${Ja([c])}`);
      }
    }
    if (typeof s === "string" && jIe()) {
      t.push(`--effort ${s}`);
    }
    let i = getFlagSettingsExpectedContent() ?? getFlagSettingsPath();
    if (i) {
      t.push(`--settings ${Ja([i])}`);
    }
    let a = getInlinePlugins();
    for (let c of a) {
      t.push(`--plugin-dir ${Ja([c])}`);
    }
    for (let c of getInlinePluginsNoMcp()) {
      t.push(`--plugin-dir-no-mcp ${Ja([c])}`);
    }
    for (let c of getInlinePluginUrls()) {
      t.push(`--plugin-url ${Ja([c])}`);
    }
    let l = getChromeFlagOverride();
    if (l === true) {
      t.push("--chrome");
    } else if (l === false) {
      t.push("--no-chrome");
    }
    return t.join(" ");
  }
  async function DFo(e, t, n, r, o) {
    for (let [l, c] of [["name", e], ["team_name", t]]) {
      if (sgl(c)) {
        throw Ae("subagent_launch", "subagent_teammate_control_chars"), Error(l === "name" ? "Invalid name: control characters are not allowed in agent or team names" : "Invalid team_name: control characters are not allowed in agent or team names");
      }
    }
    let s = await updateTeamFile(t, l => {
      let c = oPm(e, l);
      let u = m8(c, t);
      let d = r.assign(u);
      l.members.push({
        agentId: u,
        name: c,
        color: d,
        joinedAt: Date.now(),
        tmuxPaneId: "",
        subscriptions: [],
        ...n
      });
      return {
        sanitizedName: c,
        teammateId: u,
        teammateColor: d
      };
    });
    if (!s) {
      throw Ae("subagent_launch", "subagent_teammate_internal_invariant"), Error("reserveTeammateIdentity: updateTeamFile returned undefined");
    }
    let i = false;
    let a;
    try {
      return await o(s, () => {
        i = true;
      }, l => {
        a = l;
      });
    } catch (l) {
      if (!i) {
        if (a) {
          try {
            await a();
          } catch (c) {
            logForDebugging(`[spawnTeammate] pane cleanup failed for ${s.teammateId}: ${he(c)}`);
          }
        }
        await removeTeamMember(t, s.teammateId);
      } else {
        logForDebugging(`[spawnTeammate] post-commit failure for ${s.teammateId}; entry kept (agent already running): ${he(l)}`);
      }
      throw l;
    }
  }
  async function MFo(e, t, n) {
    await updateTeamFile(e, r => {
      let o = r.members.find(s => s.agentId === t);
      if (!o) {
        return false;
      }
      o.tmuxPaneId = n.tmuxPaneId;
      o.backendType = n.backendType;
    });
  }
  function oPm(e, t) {
    let n = sanitizeAgentName(e);
    if (n === "main") {
      throw Error('"main" is a reserved recipient name (SendMessage routes it to the main conversation) \u2014 choose another teammate name.');
    }
    let r = new Set(t.members.map(s => s.name.toLowerCase()));
    if (!r.vZc(n.toLowerCase())) {
      return n;
    }
    let o = 2;
    while (r.vZc(`${n}-${o}`.toLowerCase())) {
      o++;
    }
    return `${n}-${o}`;
  }
  async function sPm(e, t) {
    let {
      setAppState: n,
      getAppState: r
    } = t;
    let {
      name: o,
      prompt: s,
      agent_type: i,
      cwd: a,
      plan_mode_required: l
    } = e;
    let c = OFo(e.model, r().mainLoopModel);
    if (!o || !s) {
      throw Ae("subagent_launch", "subagent_teammate_missing_params"), Error("name and prompt are required for spawn operation");
    }
    let u = r();
    let d = u.teamContext?.teamName;
    if (!d) {
      throw Ae("subagent_launch", "subagent_teammate_no_team_name"), Error("Internal error: session team not initialized. This should have happened at startup when agent swarms are enabled.");
    }
    let p = a || Nt();
    return DFo(o, d, {
      agentType: i,
      model: c,
      prompt: s,
      planModeRequired: l,
      cwd: p
    }, t.teammateColors, async ({
      sanitizedName: m,
      teammateId: f,
      teammateColor: h
    }, g, y) => {
      let _ = await detectAndGetBackend();
      if (_.needsIt2Setup && t.requestDialog) {
        let P = await isTmuxAvailable();
        let F = await t.requestDialog(dXn, {
          tmuxAvailable: P
        });
        if (F === "cancelled") {
          throw Ae("subagent_launch", "subagent_teammate_iterm_cancelled"), new nH("Teammate spawn cancelled - iTerm2 setup required");
        }
        if (F === "installed" || F === "use-tmux") {
          resetBackendDetection();
          _ = await detectAndGetBackend();
        }
      }
      let b = await P0l();
      let {
        paneId: S,
        isFirstTeammate: E
      } = await O0l(m, h);
      if (y(() => _.backend.killPane(S, !b)), await MFo(d, f, {
        tmuxPaneId: S,
        backendType: _.backend.type
      }), E && b) {
        await D0l();
      }
      let C = U0l();
      let x = [`--agent-id ${Ja([f])}`, `--agent-name ${Ja([m])}`, `--team-name ${Ja([d])}`, `--agent-color ${Ja([h])}`, `--parent-session-id ${Ja([getSessionId()])}`, l ? "--plan-mode-required" : "", i ? `--agent-type ${Ja([i])}` : ""].filter(Boolean).join(" ");
      let A = B0l({
        planModeRequired: l,
        permissionMode: u.toolPermissionContext.mode,
        effortValue: u.effortValue,
        skipModel: !!c
      });
      if (c) {
        A = A ? `${A} --model ${Ja([c])}` : `--model ${Ja([c])}`;
      }
      let k = A ? ` ${A}` : "";
      let I = ZYt();
      let O = `cd ${Ja([p])} && env ${I} ${Ja([C])} ${x}${k}`;
      await clearMailbox(m, d);
      await writeToMailbox(m, {
        from: "team-lead",
        text: s,
        timestamp: new Date().toISOString()
      }, d);
      await M0l(S, O, !b);
      g();
      let M = b ? "current" : "claude-swarm";
      let L = b ? "current" : "swarm-view";
      n(P => ({
        ...P,
        teamContext: {
          ...P.teamContext,
          teamName: d ?? P.teamContext?.teamName ?? "default",
          teamFilePath: P.teamContext?.teamFilePath ?? "",
          leadAgentId: P.teamContext?.leadAgentId ?? "",
          teammates: {
            ...(P.teamContext?.teammates || {}),
            [f]: {
              name: m,
              agentType: i,
              color: h,
              tmuxSessionName: M,
              tmuxPaneId: S,
              cwd: p,
              spawnedAt: Date.now()
            }
          }
        }
      }));
      $0l(t.taskRegistry, {
        teammateId: f,
        sanitizedName: m,
        teamName: d,
        teammateColor: h,
        prompt: s,
        plan_mode_required: l,
        paneId: S,
        insideTmux: b,
        backendType: _.backend.type,
        toolUseId: t.toolUseId,
        cwd: p
      });
      return {
        data: {
          teammate_id: f,
          agent_id: f,
          agent_type: i,
          model: c,
          name: m,
          color: h,
          tmux_session_name: M,
          tmux_window_name: L,
          tmux_pane_id: S,
          team_name: d,
          is_splitpane: true,
          plan_mode_required: l
        }
      };
    });
  }
  async function iPm(e, t) {
    let {
      setAppState: n,
      getAppState: r
    } = t;
    let {
      name: o,
      prompt: s,
      agent_type: i,
      cwd: a,
      plan_mode_required: l
    } = e;
    let c = OFo(e.model, r().mainLoopModel);
    if (!o || !s) {
      throw Ae("subagent_launch", "subagent_teammate_missing_params"), Error("name and prompt are required for spawn operation");
    }
    let u = r();
    let d = u.teamContext?.teamName;
    if (!d) {
      throw Ae("subagent_launch", "subagent_teammate_no_team_name"), Error("Internal error: session team not initialized. This should have happened at startup when agent swarms are enabled.");
    }
    let p = a || Nt();
    return DFo(o, d, {
      agentType: i,
      model: c,
      prompt: s,
      planModeRequired: l,
      cwd: p
    }, t.teammateColors, async ({
      sanitizedName: m,
      teammateId: f,
      teammateColor: h
    }, g, y) => {
      let _ = `teammate-${sanitizeName(m)}`;
      await rPm("claude-swarm");
      let b = await execFileNoThrow("tmux", ["new-window", "-t", "claude-swarm", "-n", _, "-P", "-F", "#{pane_id}", "--", "cat"]);
      if (b.code !== 0) {
        throw Ae("subagent_launch", "subagent_teammate_tmux_window_failed"), Error(`Failed to create tmux window: ${b.stderr}`);
      }
      let S = b.stdout.trim();
      y(() => execFileNoThrow("tmux", ["kill-pane", "-t", S]));
      await MFo(d, f, {
        tmuxPaneId: S,
        backendType: "tmux"
      });
      let E = U0l();
      let C = [`--agent-id ${Ja([f])}`, `--agent-name ${Ja([m])}`, `--team-name ${Ja([d])}`, `--agent-color ${Ja([h])}`, `--parent-session-id ${Ja([getSessionId()])}`, l ? "--plan-mode-required" : "", i ? `--agent-type ${Ja([i])}` : ""].filter(Boolean).join(" ");
      let x = B0l({
        planModeRequired: l,
        permissionMode: u.toolPermissionContext.mode,
        effortValue: u.effortValue,
        skipModel: !!c
      });
      if (c) {
        x = x ? `${x} --model ${Ja([c])}` : `--model ${Ja([c])}`;
      }
      let A = x ? ` ${x}` : "";
      let k = ZYt();
      let I = `cd ${Ja([p])} && env ${k} ${Ja([E])} ${C}${A}`;
      await clearMailbox(m, d);
      await writeToMailbox(m, {
        from: "team-lead",
        text: s,
        timestamp: new Date().toISOString()
      }, d);
      try {
        Hbt(I);
      } catch (O) {
        throw Ae("subagent_launch", "subagent_teammate_control_chars"), O;
      }
      try {
        await respawnPaneWithCommand([], S, I);
      } catch (O) {
        throw Ae("subagent_launch", "subagent_teammate_tmux_respawn_failed"), O;
      }
      g();
      n(O => ({
        ...O,
        teamContext: {
          ...O.teamContext,
          teamName: d ?? O.teamContext?.teamName ?? "default",
          teamFilePath: O.teamContext?.teamFilePath ?? "",
          leadAgentId: O.teamContext?.leadAgentId ?? "",
          teammates: {
            ...(O.teamContext?.teammates || {}),
            [f]: {
              name: m,
              agentType: i,
              color: h,
              tmuxSessionName: Oz,
              tmuxPaneId: S,
              cwd: p,
              spawnedAt: Date.now()
            }
          }
        }
      }));
      $0l(t.taskRegistry, {
        teammateId: f,
        sanitizedName: m,
        teamName: d,
        teammateColor: h,
        prompt: s,
        plan_mode_required: l,
        paneId: S,
        insideTmux: false,
        backendType: "tmux",
        toolUseId: t.toolUseId,
        cwd: p
      });
      return {
        data: {
          teammate_id: f,
          agent_id: f,
          agent_type: i,
          model: c,
          name: m,
          color: h,
          tmux_session_name: "claude-swarm",
          tmux_window_name: _,
          tmux_pane_id: S,
          team_name: d,
          is_splitpane: false,
          plan_mode_required: l
        }
      };
    });
  }
  function $0l(e, {
    teammateId: t,
    sanitizedName: n,
    teamName: r,
    teammateColor: o,
    prompt: s,
    plan_mode_required: i,
    paneId: a,
    insideTmux: l,
    backendType: c,
    toolUseId: u,
    cwd: d
  }) {
    let p = TU("in_process_teammate");
    let m = `${s.substring(0, 50)}${s.length > 50 ? "..." : ""}`;
    let f = new AbortController();
    let h = {
      ...ww(p, "in_process_teammate", m, u),
      type: "in_process_teammate",
      status: "running",
      cwd: d,
      identity: {
        agentId: t,
        agentName: n,
        teamName: r,
        color: o,
        planModeRequired: i ?? false,
        parentSessionId: getSessionId()
      },
      prompt: s,
      abortController: f,
      awaitingPlanApproval: false,
      permissionMode: i ? "plan" : "default",
      isIdle: false,
      shutdownRequested: false,
      lastReportedToolCount: 0,
      lastReportedTokenCount: 0,
      pendingUserMessages: []
    };
    e.register(h);
    f.signal.addEventListener("abort", () => {
      if (LKt(c)) {
        getBackendByType(c).killPane(a, !l);
      }
    }, {
      once: true
    });
  }
  async function L0l(e, t) {
    let {
      setAppState: n,
      getAppState: r
    } = t;
    let {
      name: o,
      prompt: s,
      agent_type: i,
      plan_mode_required: a
    } = e;
    let l = OFo(e.model, r().mainLoopModel);
    if (!o || !s) {
      throw Ae("subagent_launch", "subagent_teammate_missing_params"), Error("name and prompt are required for spawn operation");
    }
    let u = r().teamContext?.teamName;
    if (!u) {
      throw Ae("subagent_launch", "subagent_teammate_no_team_name"), Error("Internal error: session team not initialized. This should have happened at startup when agent swarms are enabled.");
    }
    return DFo(o, u, {
      agentType: i,
      model: l,
      prompt: s,
      planModeRequired: a,
      cwd: Nt()
    }, t.teammateColors, async ({
      sanitizedName: d,
      teammateId: p,
      teammateColor: m
    }, f) => {
      await MFo(u, p, {
        tmuxPaneId: "in-process",
        backendType: "in-process"
      });
      let h;
      if (i) {
        let x = t.options.agentDefinitions.activeAgents.find(A => A.agentType === i);
        if (x && isCustomAgent(x)) {
          h = x;
        }
        logForDebugging(`[handleSpawnInProcess] agent_type=${i}, found=${!!h}`);
      }
      let g = {
        name: d,
        teamName: u,
        prompt: s,
        color: m,
        planModeRequired: a ?? false,
        model: l
      };
      await clearMailbox(d, u);
      let y = await Vbt(g, t);
      if (!y.ok) {
        throw Ae("subagent_launch", "subagent_teammate_inprocess_failed"), logForDebugging(`[handleSpawnInProcess] spawn failed: ${y.error}`), Error("Failed to spawn in-process teammate");
      }
      f();
      QTt({
        identity: y.identity,
        taskId: y.taskId,
        prompt: s,
        description: e.description,
        model: l,
        agentDefinition: h,
        teammateContext: y.teammateContext,
        toolUseContext: {
          ...t,
          messages: []
        },
        abortController: y.abortController,
        invokingRequestId: e.invokingRequestId
      });
      logForDebugging(`[handleSpawnInProcess] Started agent execution for ${p}`);
      let _ = r().teamContext?.leadAgentId;
      let b = !_;
      let S = _ ?? m8("team-lead", u);
      let E = b ? t.teammateColors.assign(S) : undefined;
      n(C => {
        let x = C.teamContext?.teammates || {};
        let A = b ? {
          [S]: {
            name: "team-lead",
            agentType: "team-lead",
            color: E,
            tmuxSessionName: "in-process",
            tmuxPaneId: "leader",
            cwd: Nt(),
            spawnedAt: Date.now()
          }
        } : {};
        return {
          ...C,
          teamContext: {
            ...C.teamContext,
            teamName: u ?? C.teamContext?.teamName ?? "default",
            teamFilePath: C.teamContext?.teamFilePath ?? "",
            leadAgentId: S,
            teammates: {
              ...x,
              ...A,
              [p]: {
                name: d,
                agentType: i,
                color: m,
                tmuxSessionName: "in-process",
                tmuxPaneId: "in-process",
                cwd: Nt(),
                spawnedAt: Date.now()
              }
            }
          }
        };
      });
      return {
        data: {
          teammate_id: p,
          agent_id: p,
          agent_type: i,
          model: l,
          name: d,
          color: m,
          tmux_session_name: "in-process",
          tmux_window_name: "in-process",
          tmux_pane_id: "in-process",
          team_name: u,
          is_splitpane: false,
          plan_mode_required: a
        }
      };
    });
  }
  async function aPm(e, t, n) {
    if (e.prompt && isStructuredProtocolMessage(e.prompt)) {
      throw Ae("subagent_launch", "subagent_teammate_protocol_frame_prompt"), Error("Teammate prompt must not be a mailbox protocol frame (permission/mode/plan/shutdown JSON) \u2014 pass plain-text instructions");
    }
    if (isInProcessEnabled()) {
      return L0l(e, t);
    }
    try {
      await detectAndGetBackend();
    } catch (o) {
      if (getTeammateModeFromSnapshot() !== "auto") {
        throw Ae("subagent_launch", "subagent_teammate_pane_unavailable"), o;
      }
      logForDebugging(`[handleSpawn] No pane backend available, falling back to in-process: ${he(o)}`);
      markInProcessFallback();
      lPm(n);
      return L0l(e, t);
    }
    if (e.use_splitpane !== false) {
      return sPm(e, t);
    }
    return iPm(e, t);
  }
  function lPm(e) {
    if (F0l) {
      return;
    }
    F0l = true;
    let t = isInITerm2() ? 'To force iTerm2 panes, set teammateMode: "iterm2" in settings and enable the iTerm2 Python API (Preferences > General > Magic).' : 'To use terminal panes, set teammateMode: "tmux" in settings.';
    e?.({
      type: "notification",
      notification: {
        key: "teammate-auto-fallback",
        text: `Couldn't open a teammate pane \u2014 running in-process instead. ${t}`,
        color: "warning",
        priority: "high"
      }
    });
  }
  async function H0l(e, t, n) {
    return aPm(e, t, n);
  }
  var F0l = false;
  var j0l = __lazy(() => {
    at();
    pOo();
    ln();
    Cx();
    Dze();
    vo();
    je();
    Fp();
    dt();
    ji();
    Eo();
    YN();
    Ive();
    EFo();
    YNe();
    FKt();
    eL();
    xtr();
    aLe();
    SFo();
    UM();
    N0l();
    IFo();
    uA();
    kS();
  });
  function sJt() {
    if (!isFirstPartyProvider()) {
      return false;
    }
    if (Me.CLAUDE_CODE_REMOTE) {
      return false;
    }
    if (!hasStoredOAuthToken()) {
      return false;
    }
    if (!getCurrentProjectConfig().hasUsedRemoteSession || !getGlobalConfig().hasRemoteEnvironment) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_neapolitan", false);
  }
  function q0l() {
    return hasWorktreeCreateHook() || findCanonicalGitRoot(Nt()) !== null;
  }
  async function W0l() {
    let e = Nt();
    let t = await getBranch(e);
    if (t === "HEAD") {
      return;
    }
    if (await isBranchOnOrigin(t, e)) {
      return t;
    }
    logForDebugging(`[remote agent] local branch '${t}' is not pushed to origin; remote agent will run against the repository's default branch`);
    return;
  }
  function G0l(e) {
    if (e === "bubble") {
      return;
    }
    if (e === "bypassPermissions") {
      return "auto";
    }
    return e;
  }
  var NFo = __lazy(() => {
    $n();
    no();
    vo();
    je();
    pr();
    na();
    lWe();
    Ds();
  });
  function cPm(e) {
    let {
      tools: t,
      disallowedTools: n
    } = e;
    let r = t && t.length > 0;
    let o = n && n.length > 0;
    if (r && o) {
      let s = new Set(n);
      let i = t.filter(a => !s.vZc(a));
      if (i.length === 0) {
        return "None";
      }
      return i.join(", ");
    } else if (r) {
      return t.join(", ");
    } else if (o) {
      return `All tools except ${n.join(", ")}`;
    }
    return "All tools";
  }
  function V0l(e, t) {
    let n = cPm(e);
    let r = t && e.whenToUseLean || e.whenToUse;
    return `- ${e.agentType}: ${r} (Tools: ${n})`;
  }
  async function z0l(e, t, n) {
    let r = isForkSubagentEnabled();
    let o = r && (n ?? true);
    let s = o ? `

## When to fork

Fork yourself (pass \`subagent_type: "fork"\`) when the intermediate tool output isn't worth keeping in your context. The criterion is qualitative \u2014 "will I need this output again" \u2014 not task size. Fork open-ended questions. If research can be broken into independent questions, launch parallel forks in one message. A fork beats a fresh subagent for this \u2014 it inherits context and shares your cache.

Forks are cheap because they share your prompt cache.

**Don't peek.** The tool result includes an \`output_file\` path \u2014 do not Read or tail it. You get a completion notification; trust it. Reading the transcript mid-flight pulls the fork's tool noise into your context, which defeats the point of forking.

**Don't race.** After launching, you know nothing about what the fork found. Never fabricate or predict fork results in any format \u2014 not as prose, summary, or structured output. The notification arrives as a user-role message in a later turn; it is never something you write yourself. If the user asks a follow-up before the notification lands, tell them the fork is still running \u2014 give status, not a guess.

**Writing a fork prompt.** Since the fork inherits your context, the prompt is a *directive* \u2014 what to do, not what the situation is. Be specific about scope: what's in, what's out, what another agent is handling. Don't re-explain background.
` : "";
    let i = `

## Writing the prompt

${o ? "Any agent other than a fork starts with zero context. " : ""}Brief the agent like a smart colleague who just walked into the room \u2014 it hasn't seen this conversation, doesn't know what you've tried, doesn't understand why this task matters.
- Explain what you're trying to accomplish and why.
- Describe what you've already learned or ruled out.
- Give enough context about the surrounding problem that the agent can make judgment calls rather than just following a narrow instruction.
- If you need a short response, say so ("report in under 200 words").
- Lookups: hand over the exact command. Investigations: hand over the question \u2014 prescribed steps become dead weight when the premise is wrong.

${o ? "For fresh agents, terse" : "Terse"} command-style prompts produce shallow, generic work.

**Never delegate understanding.** Don't write "based on your findings, fix the bug" or "based on the research, implement it." Those phrases push synthesis onto the agent instead of doing it yourself. Write prompts that prove you understood: include file paths, line numbers, what specifically to change.`;
    let a = `Example usage:

<example>
user: "What's left on this branch before we can ship?"
assistant: <thinking>Forking this \u2014 it's a survey question. I want the punch list, not the git output in my context.</thinking>
${"Agent"}({
  subagent_type: "fork",
  name: "ship-audit",
  description: "Branch ship-readiness audit",
  prompt: "Audit what's left before this branch can ship. Check: uncommitted changes, commits ahead of main, whether tests exist, whether the GrowthBook gate is wired up, whether CI-relevant files changed. Report a punch list \u2014 done vs. missing. Under 200 words."
})
assistant: Ship-readiness audit running.
<commentary>
Turn ends here. The coordinator knows nothing about the findings yet. What follows is a SEPARATE turn \u2014 the notification arrives from outside, as a user-role message. It is not something the coordinator writes.
</commentary>
[later turn \u2014 notification arrives as user message]
assistant: Audit's back. Three blockers: no tests for the new prompt path, GrowthBook gate wired but not in build_flags.yaml, and one uncommitted file.
</example>

<example>
user: "so is the gate wired up or not"
<commentary>
User asks mid-wait. The audit fork was launched to answer exactly this, and it hasn't returned. The coordinator does not have this answer. Give status, not a fabricated result.
</commentary>
assistant: Still waiting on the audit \u2014 that's one of the things it's checking. Should land shortly.
</example>

<example>
user: "Can you get a second opinion on whether this migration is safe?"
assistant: <thinking>I'll ask the code-reviewer agent \u2014 it won't see my analysis, so it can give an independent read.</thinking>
<commentary>
A non-fork subagent_type is specified, so the agent starts fresh. It needs full context in the prompt. The briefing explains what to assess and why.
</commentary>
${"Agent"}({
  name: "migration-review",
  description: "Independent migration review",
  subagent_type: "code-reviewer",
  prompt: "Review migration 0042_user_schema.sql for safety. Context: we're adding a NOT NULL column to a 50M-row table. Existing rows get a backfill default. I want a second opinion on whether the backfill approach is safe under concurrent writes \u2014 I've checked locking behavior but want independent verification. Report: is this safe, and if not, what specifically breaks?"
})
</example>
`;
    let l = `Example usage:

<example>
user: "What's left on this branch before we can ship?"
assistant: <thinking>A survey question across git state, tests, and config. I'll delegate it and ask for a short report so the raw command output stays out of my context.</thinking>
${"Agent"}({
  description: "Branch ship-readiness audit",
  prompt: "Audit what's left before this branch can ship. Check: uncommitted changes, commits ahead of main, whether tests exist, whether the GrowthBook gate is wired up, whether CI-relevant files changed. Report a punch list \u2014 done vs. missing. Under 200 words."
})
<commentary>
The prompt is self-contained: it states the goal, lists what to check, and caps the response length. The agent's report comes back as the tool result; relay the findings to the user.
</commentary>
</example>

<example>
user: "Can you get a second opinion on whether this migration is safe?"
assistant: <thinking>I'll ask the code-reviewer agent \u2014 it won't see my analysis, so it can give an independent read.</thinking>
${"Agent"}({
  description: "Independent migration review",
  subagent_type: "code-reviewer",
  prompt: "Review migration 0042_user_schema.sql for safety. Context: we're adding a NOT NULL column to a 50M-row table. Existing rows get a backfill default. I want a second opinion on whether the backfill approach is safe under concurrent writes \u2014 I've checked locking behavior but want independent verification. Report: is this safe, and if not, what specifically breaks?"
})
<commentary>
The agent starts with no context from this conversation, so the prompt briefs it: what to assess, the relevant background, and what form the answer should take.
</commentary>
</example>
`;
    let c = _g(e);
    let u = "Available agent types are listed in <system-reminder> messages in the conversation.";
    let d = getSubscriptionType() === "pro" ? `

**Do not spawn agents unless the user asks.** Each spawn starts cold and re-derives context you already have \u2014 it's the expensive path on this plan. A task with "multiple angles," "thorough," or several parts is not a request to spawn; handle it inline with your own tools. Only use this tool when the user explicitly says to use a subagent, or names one of the available agent types.` : "";
    let p = `Launch a new agent to handle complex, multi-step tasks. Each agent type has specific capabilities and tools available to it.

Available agent types are listed in <system-reminder> messages in the conversation.${d}

${o ? `When using the ${"Agent"} tool, specify a subagent_type to select an agent: \`"fork"\` forks yourself (the fork inherits your full conversation context and always runs on your model \u2014 a \`model\` override is ignored); any other type \u2014 or omitting it \u2014 starts a fresh agent (general-purpose by default).` : `When using the ${"Agent"} tool, specify a subagent_type parameter to select which agent type to use. If omitted, the general-purpose agent is used.`}`;
    if (t) {
      return p;
    }
    let m = Rx() && Pu() ? "`grep` via the Bash tool" : `the ${"Grep"} tool`;
    let f = o ? "" : `
## When not to use

If the target is already known, use the direct tool: ${"Read"} for a known path, ${m} for a specific symbol or string. Reserve this tool for open-ended questions that span the codebase, or tasks that match an available agent type.
`;
    if (c) {
      let h = !Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS && !isInProcessTeammate() && !r ? "\n- Subagents run in the background by default; you'll be notified when one completes. Pass `run_in_background: false` for a synchronous run when you need the result before continuing." : "";
      let g = isInProcessTeammate() ? "\n- `run_in_background`, `name`, and `mode` are unavailable here \u2014 only synchronous subagents." : isTeammate() ? "\n- `name` and `mode` are unavailable here \u2014 teammates cannot spawn teammates." : "";
      let y = sJt() ? '\n- `isolation: "remote"` runs the agent in a remote CCR sandbox (always background).' : "";
      return `${p}${d ? "" : `

## When to use

Reach for this when the task matches an available agent type, when you have independent work to run in parallel, or when answering would mean reading across several files \u2014 delegate it and you keep the conclusion, not the file dumps. For a single-fact lookup where you already know the file, symbol, or value, search directly. Once you've delegated a search, don't also run it yourself \u2014 wait for the result.`}${o ? `

A fork runs in the background and keeps its tool output out of your context. If you are the fork, execute directly \u2014 don't re-delegate.` : ""}

- The agent's final message is returned to you as the tool result; it is not shown to the user \u2014 relay what matters.
- Use ${"SendMessage"} with the agent's ID or name to continue a previously spawned agent with its context intact; a new ${"Agent"} call starts fresh${o ? ' (except subagent_type: "fork", which inherits your context)' : ""}.
- Each agent type's model, reasoning effort, and tools come from its definition (\`.claude/agents/*.md\` frontmatter or SDK \`agents\`).
- \`isolation: "worktree"\` gives the agent its own git worktree (auto-cleaned if unchanged).${y}${h}${g}`;
    }
    return `${p}
${f}
## Usage notes

- Always include a short description summarizing what the agent will do
- When the agent is done, it will return a single message back to you. The result returned by the agent is not visible to the user. To show the user the result, you should send a text message back to the user with a concise summary of the result.
- Trust but verify: an agent's summary describes what it intended to do, not necessarily what it did. When an agent writes or edits code, check the actual changes before reporting the work as done.${!Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS && !isInProcessTeammate() && !r ? "\n- Agents run in the background by default. When an agent runs in the background, you will be automatically notified when it completes \u2014 do NOT sleep, poll, or proactively check on its progress. Continue with other work or respond to the user instead.\n- **Foreground vs background**: Pass `run_in_background: false` to run an agent in the foreground when you need its results before you can proceed \u2014 e.g., research agents whose findings inform your next steps. Otherwise let it run in the background (the default) so you can keep working in parallel." : ""}
- To continue a previously spawned agent, use ${"SendMessage"} with the agent's ID or name as the \`to\` field \u2014 that resumes it with full context. A new ${"Agent"} call starts a fresh agent with no memory of prior runs${o ? ' (except subagent_type: "fork")' : ""}, so the prompt must be self-contained.
- Each agent type's model, reasoning effort, and tool access are set in its definition (\`.claude/agents/*.md\` frontmatter, or the SDK \`agents\` option); the \`model\` parameter here overrides the definition for this one call.
- Clearly tell the agent whether you expect it to write code or just to do research (search, file reads, web fetches, etc.), since a fresh agent is not aware of the user's intent
- If the agent description mentions that it should be used proactively, then you should try your best to use it without the user having to ask for it first.
- If the user specifies that they want you to run agents "in parallel", you MUST send a single message with multiple ${"Agent"} tool use content blocks. For example, if you need to launch both a build-validator agent and a test-runner agent in parallel, send a single message with both tool calls.
- With \`isolation: "worktree"\`, the worktree is automatically cleaned up if the agent makes no changes; otherwise the path and branch are returned in the result.${sJt() ? '\n- You can set `isolation: "remote"` to run the agent in a remote CCR environment. This is always a background task; you\'ll be notified when it completes. Use for long-running tasks that need a fresh sandbox.' : ""}${isInProcessTeammate() ? `
- The run_in_background, name, and mode parameters are not available in this context. Only synchronous subagents are supported.` : isTeammate() ? `
- The name and mode parameters are not available in this context \u2014 teammates cannot spawn other teammates. Omit them to spawn a subagent.` : ""}${s}${i}

${o ? a : l}`;
  }
  var LFo = __lazy(() => {
    no();
    jV();
    pr();
    AI();
    Jf();
    qp();
    Uj();
    Tm();
    _x();
    Sh();
    iDe();
    NFo();
  });
  function dPm() {
    if (st(process.env.CLAUDE_AUTO_BACKGROUND_TASKS)) {
      return 120000;
    }
    return 0;
  }
  function Y0l(e, t, {
    toolPermissionContext: n
  }) {
    if (!isForkSubagentEnabled() || e.some(o => normalizeAgentType(o.agentType) === "fork") || !(t?.includes("fork") ?? true)) {
      return {
        available: false,
        denyRule: null
      };
    }
    let r = getDenyRuleForAgent(n, "Agent", "fork");
    return {
      available: r === null,
      denyRule: r
    };
  }
  var J0l;
  var XKe;
  var FFo;
  var nFe;
  var iJt;
  var pPm;
  var mPm;
  var fNo;
  var fPm;
  var Ltr;
  var hNo = __lazy(() => {
    ci();
    lmt();
    at();
    dz();
    x9e();
    RV();
    N1();
    ln();
    Ot();
    ry();
    tZ();
    jM();
    D_();
    Kp();
    _h();
    Dze();
    mE();
    Ubt();
    vo();
    je();
    pr();
    gn();
    dt();
    ro();
    Bbt();
    HT();
    oy();
    Kf();
    Zn();
    dV();
    eL();
    Nze();
    cE();
    qp();
    Wk();
    FM();
    TO();
    GL();
    iP();
    s6t();
    Tm();
    ZC();
    j0l();
    $U();
    $ve();
    jve();
    j7t();
    Sh();
    iDe();
    kS();
    LFo();
    NFo();
    Uve();
    W7t();
    Sl();
    J0l = __toESM(ie(), 1);
    XKe = class XKe extends Error {
      constructor(e) {
        super(e);
        this.name = "AgentTypeError";
      }
    };
    FFo = class FFo extends Error {
      constructor(e) {
        super(e);
        this.name = "RemoteAgentPreconditionError";
      }
    };
    nFe = class nFe extends Error {
      constructor(e) {
        super(e);
        this.name = "AgentPreconditionError";
      }
    };
    iJt = Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS;
    pPm = we(() => v.object({
      description: v.string().describe("A short (3-5 word) description of the task"),
      prompt: v.string().describe("The task for the agent to perform"),
      subagent_type: v.string().optional().describe("The type of specialized agent to use for this task"),
      model: v.enum(["sonnet", "opus", "haiku", "fable"]).optional().describe(`Optional model override for this agent. Takes precedence over the agent definition's model frontmatter. If omitted, uses the agent definition's model, or inherits from the parent. Ignored for subagent_type: "fork" \u2014 forks always inherit the parent model.`),
      run_in_background: v.boolean().optional().describe("Agents run in the background by default; you will be notified when one completes. Set to false to run this agent synchronously when you need its result before continuing.")
    }));
    mPm = we(() => {
      let e = v.object({
        name: v.string().regex(Opl, {
          message: "name must start with a letter or digit and contain only letters, digits, underscores, or hyphens (max 64 chars)"
        }).refine(t => t !== "main", {
          message: `"${"main"}" is reserved \u2014 SendMessage routes it to the main conversation`
        }).optional().describe("Name for the spawned agent. Makes it addressable via SendMessage({to: name}) while running."),
        team_name: v.string().optional().describe("Deprecated; ignored. The session has a single implicit team."),
        mode: JPs().optional().describe('Permission mode for spawned teammate (e.g., "plan" to require plan approval).')
      });
      return pPm().merge(e).extend({
        isolation: v.enum(["worktree", "remote"]).optional().describe('Isolation mode. "worktree" creates a temporary git worktree so the agent works on an isolated copy of the repo. "remote" launches the agent in a remote cloud environment (always runs in background; availability is gated).'),
        cwd: v.string().optional().describe('Absolute path to run the agent in. Overrides the working directory for all filesystem and shell operations within this agent. Mutually exclusive with isolation: "worktree".')
      });
    });
    fNo = we(() => {
      let e = mPm().omit({
        cwd: true
      });
      return iJt || isForkSubagentEnabled() ? e.omit({
        run_in_background: true
      }) : e;
    });
    fPm = we(() => {
      let e = L_l().extend({
        status: v.literal("completed"),
        prompt: v.string()
      });
      let t = v.object({
        status: v.literal("async_launched"),
        agentId: v.string().describe("The ID of the async agent"),
        description: v.string().describe("The description of the task"),
        resolvedModel: v.string().optional().describe("Model the spawn resolved (may differ from the requested one)"),
        prompt: v.string().describe("The prompt for the agent"),
        outputFile: v.string().describe("Path to the output file for checking agent progress"),
        canReadOutputFile: v.boolean().optional().describe("Whether the calling agent has Read/Bash tools to check progress")
      });
      let n = v.object({
        status: v.literal("remote_launched"),
        taskId: v.string().describe("The ID of the remote agent task"),
        sessionUrl: v.string().describe("The URL of the cloud session"),
        description: v.string().describe("The description of the task"),
        prompt: v.string().describe("The prompt for the agent"),
        outputFile: v.string().describe("Path to the output file for checking agent progress")
      });
      return v.union([e, t, n]);
    });
    Ltr = Xs({
      async prompt({
        agents: e,
        getToolPermissionContext: t,
        allowedAgentTypes: n,
        model: r
      }) {
        let o = await t();
        let s = eR();
        let {
          available: i
        } = Y0l(e, n, {
          toolPermissionContext: o
        });
        return await z0l(r, s, i);
      },
      name: "Agent",
      searchHint: "delegate work to a subagent",
      aliases: ["Task"],
      maxResultSizeChars: 1e5,
      async description() {
        return "Launch a new agent";
      },
      get inputSchema() {
        return fNo();
      },
      get outputSchema() {
        return fPm();
      },
      async call({
        prompt: e,
        subagent_type: t,
        description: n,
        model: r,
        run_in_background: o,
        name: s,
        mode: i,
        isolation: a,
        cwd: l
      }, c, u, d, p) {
        let m = Date.now();
        let f = isCoordinatorMode() ? undefined : r;
        let h = PW(c.agentContext);
        if (h >= 5) {
          throw Ae("subagent_launch", "subagent_depth_cap"), new nFe(`Subagent nesting limit reached (depth ${h} of ${5}). Complete this task directly using your tools instead of spawning another agent.`);
        }
        n = n.replace(/\s+/g, " ").trim();
        let g = c.getAppState();
        let y = getToolPermissionContext(c);
        let _ = y.mode;
        let b = myn(i, _);
        let {
          taskRegistry: S
        } = c;
        let E = isAgentSwarmsEnabled() ? g.teamContext : undefined;
        let C = !!c.teammateContext;
        if ((C || !!getDynamicTeamContext()) && s) {
          throw Ae("subagent_launch", "subagent_nested_teammate"), new nFe("Teammates cannot spawn other teammates \u2014 the team roster is flat. To spawn a subagent instead, omit the `name` parameter.");
        }
        if (C && o === true) {
          throw Ae("subagent_launch", "subagent_teammate_background_denied"), new nFe("In-process teammates cannot spawn background agents. Use run_in_background=false for synchronous subagents.");
        }
        let {
          activeAgents: A,
          allowedAgentTypes: k
        } = c.options.agentDefinitions;
        let I = t !== undefined && normalizeAgentType(t) === "fork";
        let {
          available: O,
          denyRule: M
        } = Y0l(A, k, {
          toolPermissionContext: y
        });
        if (I && M) {
          throw Ae("subagent_launch", "subagent_type_denied"), new XKe(`Agent type '${"fork"}' has been denied by permission rule '${"Agent"}(${"fork"})' from ${M.source}.`);
        }
        let L = I && O;
        if (t !== undefined && !I) {
          let ve = getDenyRuleForAgent(y, "Agent", t);
          if (ve) {
            throw Ae("subagent_launch", "subagent_type_denied"), new XKe(`Agent type '${t}' has been denied by permission rule '${"Agent"}(${t})' from ${ve.source}.`);
          }
          if (k && !k.includes(t)) {
            Ae("subagent_launch", "subagent_type_not_found");
            let _e = filterDeniedAgents(A.filter(xe => k.includes(xe.agentType)), y, "Agent").map(xe => xe.agentType);
            throw new XKe(`Agent type '${t}' not found. Available agents: ${_e.join(", ")}`);
          }
        }
        if (E && s && !L && !a && !l) {
          let ve = t ? c.options.agentDefinitions.activeAgents.find(ke => ke.agentType === t) : undefined;
          if (ve?.color) {
            xbt(t, ve.color);
          }
          let _e = await H0l({
            name: s,
            prompt: e,
            description: n,
            use_splitpane: true,
            plan_mode_required: b === "plan",
            model: f ?? (ve ? Hve(ve, c.options.mainLoopModel) : undefined),
            agent_type: t,
            invokingRequestId: d?.requestId
          }, c, p);
          let xe = {
            status: "teammate_spawned",
            prompt: e,
            ..._e.data
          };
          Pe("subagent_launch");
          return {
            data: xe
          };
        }
        let P;
        if (L) {
          if (a === "remote") {
            throw Ae("subagent_launch", "subagent_fork_remote_isolation"), new nFe('Fork cannot use isolation: "remote" \u2014 a remote session cannot inherit the conversation context. Omit isolation (or use "worktree"), or spawn a named agent type for remote work.');
          }
          if (c.options.querySource === `agent:builtin:${FORK_AGENT.agentType}` || isInForkChild(c.messages)) {
            throw Ae("subagent_launch", "subagent_recursive_fork"), new nFe("Fork is not available inside a forked worker. Complete your task directly using your tools.");
          }
          P = FORK_AGENT;
        } else {
          let ve = t ?? Kve.agentType;
          let _e = filterDeniedAgents(k ? A.filter(ke => k.includes(ke.agentType)) : A, y, "Agent");
          let xe = _e.find(ke => ke.agentType === ve);
          if (!xe) {
            let ke = normalizeAgentType(ve);
            let Ie = wxe(ke, 60);
            let Ue = _e.map(We => We.agentType);
            let Ge = new Set(Ue);
            let Be = ke ? A.filter(We => normalizeAgentType(We.agentType) === ke) : [];
            if (Be.length > 1) {
              logEvent("tengu_subagent_type_miss", {
                requestedNormalized: Ie,
                availableCount: _e.length,
                ambiguousCount: Be.length
              });
              Ae("subagent_launch", "subagent_type_ambiguous");
              let We = Be.map(Ze => Ze.agentType).filter(Ze => Ge.vZc(Ze));
              throw new XKe(`Agent type '${ve}' is ambiguous \u2014 matches ${Be.map(Ze => Ge.vZc(Ze.agentType) ? Ze.agentType : `${Ze.agentType} (unavailable)`).join(", ")}. ${We.length > 0 ? `Use the exact name: ${We.join(" or ")}` : `None of these are available. Available agents: ${Ue.join(", ")}`}`);
            }
            if (Be.length === 1) {
              let We = Be[0];
              if (Ge.vZc(We.agentType)) {
                if (xe = We, xe.color) {
                  xbt(ve, xe.color);
                }
                logEvent("tengu_subagent_type_normalized", {
                  requestedNormalized: Ie,
                  matched: xe.agentType
                });
              } else {
                let Ze = We.agentType;
                let Tt = getDenyRuleForAgent(y, "Agent", Ze);
                if (Tt) {
                  throw Ae("subagent_launch", "subagent_type_denied"), new XKe(`Agent type '${Ze}' has been denied by permission rule '${"Agent"}(${Ze})' from ${Tt.source}.`);
                }
              }
            }
            if (!xe) {
              throw logEvent("tengu_subagent_type_miss", {
                requestedNormalized: Ie,
                availableCount: _e.length
              }), Ae("subagent_launch", "subagent_type_not_found"), new XKe(`Agent type '${ve}' not found. Available agents: ${Ue.join(", ")}`);
            }
          }
          P = xe;
        }
        if (C && P.background === true) {
          throw Ae("subagent_launch", "subagent_teammate_background_denied"), new nFe(`In-process teammates cannot spawn background agents. Agent '${P.agentType}' has background: true in its definition.`);
        }
        let F = P.requiredMcpServers;
        let H = c.options.tools.filter(bM);
        if (F?.length) {
          let ve = g.mcp.clients.some(ke => ke.type === "pending" && F.some(Ie => ke.name.toLowerCase().includes(Ie.toLowerCase())));
          let _e = g;
          if (ve) {
            let Ue = Date.now() + 30000;
            while (Date.now() < Ue) {
              if (await sleep(500), _e = c.getAppState(), _e.mcp.clients.some(We => We.type === "failed" && F.some(Ze => We.name.toLowerCase().includes(Ze.toLowerCase())))) {
                break;
              }
              if (!_e.mcp.clients.some(We => We.type === "pending" && F.some(Ze => We.name.toLowerCase().includes(Ze.toLowerCase())))) {
                break;
              }
            }
          }
          let xe = [];
          for (let ke of _e.mcp.tools.concat(H)) {
            let Ie = cmt(ke);
            if (Ie && !xe.includes(Ie)) {
              xe.push(Ie);
            }
          }
          if (!hasRequiredMcpServers(P, xe)) {
            let ke = F.filter(Ie => !xe.some(Ue => Ue.toLowerCase().includes(Ie.toLowerCase())));
            throw Ae("subagent_launch", "subagent_mcp_required_missing"), new nFe(`Agent '${P.agentType}' requires MCP servers matching: ${ke.join(", ")}. MCP servers with tools: ${xe.length > 0 ? xe.join(", ") : "none"}. Use /mcp to configure and authenticate the required MCP servers.`);
          }
        }
        if (P.color) {
          xbt(P.agentType, P.color);
        }
        let U = getMainLoopModel_export(c);
        let N = vse(Hve(P, U), U, L ? undefined : f, _);
        c.agentLifecycle.markTypeInvoked(P.agentType);
        let W = P.getSystemPrompt({
          toolUseContext: c
        });
        let j = isPluginAgent(P) ? Yo(P.plugin) : undefined;
        if (isPluginAgent(P)) {
          Tq(P.plugin);
        }
        let z = eR();
        let V = isForkSubagentEnabled();
        let K = a ?? P.isolation;
        if (K === "remote" && !sJt()) {
          K = Me.CLAUDE_CODE_REMOTE || !q0l() ? undefined : "worktree";
          logForDebugging("[remote agent] isolation:'remote' is unavailable " + (Me.CLAUDE_CODE_REMOTE ? "(already inside a CCR session); running as a local agent" : K === "worktree" ? "(no claude.ai login or feature gate off); falling back to isolation:'worktree'" : "(no claude.ai login or feature gate off) and no git root; running as a local agent"));
        }
        let J = K === "remote";
        let Q = J || (o === true || P.background === true || z || V || !C && o !== false) && !iJt;
        let Z = PW(c.agentContext) + 1;
        if (logEvent("tengu_agent_tool_selected", {
          agent_type: P.agentType,
          model: N,
          source: P.source,
          color: P.color == null ? undefined : P.color,
          is_built_in_agent: isBuiltInAgent(P),
          is_resume: false,
          is_async: Q,
          is_fork: L,
          agent_depth: Z,
          agent_system_prompt_chars: W.length,
          ...(j && pV(j.name, j.marketplace))
        }), J) {
          let ve = await Dme();
          if (!ve.eligible) {
            let Ge = ve.errors.map(Ese).join(`
`);
            throw Ae("subagent_launch", "subagent_remote_ineligible"), new FFo(`Cannot launch cloud agent:
${Ge}`);
          }
          let _e;
          let xe = await teleportToRemote({
            initialMessage: e,
            source: "remote_agent",
            description: n,
            model: N,
            permissionMode: G0l(b ?? P.permissionMode ?? "acceptEdits"),
            branchName: await W0l(),
            signal: c.abortController.signal,
            onBundleFail: Ge => {
              _e = Ge;
            },
            onCreateFail: Ge => {
              _e = Ge;
            }
          });
          if (!xe) {
            throw Ae("subagent_launch", "subagent_remote_session_failed"), new FFo(_e ?? "Failed to create cloud session");
          }
          let {
            taskId: ke,
            sessionId: Ie
          } = Ave({
            remoteTaskType: "remote-agent",
            session: {
              id: xe.id,
              title: xe.title || n
            },
            command: e,
            context: c,
            toolUseId: c.toolUseId
          });
          logEvent("tengu_agent_tool_remote_launched", {
            agent_type: P.agentType
          });
          Pe("subagent_launch");
          return {
            data: {
              status: "remote_launched",
              taskId: ke,
              sessionUrl: Mme(Ie),
              description: n,
              prompt: e,
              outputFile: getTaskOutputPath(ke)
            }
          };
        }
        let ne;
        let oe;
        let ee;
        if (L) {
          if (c.renderedSystemPrompt) {
            oe = c.renderedSystemPrompt;
          } else {
            let ve = g.agent ? g.agentDefinitions.activeAgents.find(ke => ke.agentType === g.agent) : undefined;
            let _e = Array.from(y.additionalWorkingDirectories.keys());
            let xe = await GO(c.options.tools, c.options.mainLoopModel, _e);
            oe = J9({
              mainThreadAgentDefinition: ve,
              toolUseContext: c,
              customSystemPrompt: c.options.customSystemPrompt,
              defaultSystemPrompt: xe,
              appendSystemPrompt: c.options.appendSystemPrompt
            });
          }
          ee = buildForkedMessages(e, d);
        } else {
          try {
            let ve = Array.from(y.additionalWorkingDirectories.keys());
            if (P.memory) {
              logEvent("tengu_agent_memory_loaded", {
                ...false,
                scope: P.memory,
                source: "subagent"
              });
            }
            ne = await Z7t([W], N, ve);
          } catch (ve) {
            logForDebugging(`Failed to get system prompt for agent ${P.agentType}: ${he(ve)}`);
          }
          ee = [In({
            content: e
          })];
        }
        let re = {
          prompt: e,
          resolvedAgentModel: N,
          isBuiltInAgent: isBuiltInAgent(P),
          startTime: m,
          agentType: P.agentType,
          isAsync: Q,
          agentDepth: Z,
          source: P.source,
          pluginId: j
        };
        let se = {
          ...y,
          mode: b ?? P.permissionMode ?? "acceptEdits"
        };
        let ae = c.getAppState();
        let de = EZ(se, excludeCoordinatorCommsMcpTools(ae.mcp.tools.concat(H)), {
          skipReplFilter: true,
          skillTools: ae.skillTools
        });
        let be = vN();
        let fe = c.agentId;
        let me = u5n(fe, S) ?? mainAgentId();
        let Te = null;
        if (K === "worktree") {
          Te = await createAgentWorktree(agentWorktreeSlug(be));
        }
        if (L && Te) {
          ee.push(In({
            content: buildWorktreeNotice(Nt(), Te.worktreePath)
          }));
        }
        let ue = {
          agentDefinition: P,
          promptMessages: ee,
          toolUseContext: c,
          canUseTool: u,
          name: s,
          isAsync: Q,
          querySource: c.options.querySource ?? zDe(P.agentType, isBuiltInAgent(P)),
          spawnedBySkill: c.options.spawnedBySkill ?? c.options.activeSkill,
          model: L ? undefined : f,
          override: L ? {
            systemPrompt: oe,
            replHydration: {
              kind: "fork",
              log: [...(c.getReplContexts()[c.agentId ?? "main"]?.replayLog ?? [])]
            }
          } : ne && !Te && !l ? {
            systemPrompt: ne
          } : undefined,
          availableTools: L ? c.options.tools : de,
          forkContextMessages: L ? c.messages : undefined,
          ...(L && {
            useExactTools: true
          }),
          worktreePath: Te?.worktreePath,
          worktreeBranch: Te?.worktreeBranch,
          cwd: l,
          spawnMode: b,
          description: n,
          preserveToolUseResults: !getIsNonInteractiveSession(),
          toolUseId: c.toolUseId,
          onMcpServersBlocked: (ve, _e) => p?.({
            type: "notification",
            notification: {
              key: `agent-mcp-blocked-${be}`,
              text: `${P.agentType} agent MCP ${un(ve.length, "server")} blocked by ${_e}: ${ve.join(", ")}`,
              priority: "medium",
              color: "warning",
              timeoutMs: 1e4
            }
          }),
          onModelRestricted: (ve, _e) => p?.({
            type: "notification",
            notification: {
              key: `agent-model-restricted-${P.agentType}-${$bt(ve)}`,
              text: `${P.agentType} agent: ${wse(ve, _e)}`,
              priority: "medium",
              color: "warning",
              timeoutMs: 1e4
            }
          })
        };
        let ce = l ?? Te?.worktreePath;
        let le = async () => {
          if (!Te) {
            return {};
          }
          let {
            worktreePath: ve,
            worktreeBranch: _e,
            headCommit: xe,
            gitRoot: ke,
            hookBased: Ie
          } = Te;
          if (Te = null, Ie) {
            logForDebugging(`Hook-based agent worktree kept at: ${ve}`);
            return {
              worktreePath: ve
            };
          }
          if (xe) {
            if (!(await hasWorktreeChanges(ve, xe)) && (await removeAgentWorktree(ve, _e, ke, false, "agent_tool"))) {
              fvl({
                agentId: be,
                removedWorktreePath: ve,
                spawnMetadata: {
                  agentType: P.agentType,
                  ...(P.agentType === "fork" && {
                    isFork: isBuiltInAgent(P)
                  }),
                  ...(l && {
                    cwd: l
                  }),
                  description: n,
                  ...(s && {
                    name: s
                  }),
                  ...(b && {
                    spawnMode: b
                  }),
                  ...(c.toolUseId && {
                    toolUseId: c.toolUseId
                  }),
                  spawnDepth: Z
                }
              }).catch(Ge => logForDebugging(`Failed to clear worktree metadata: ${Ge}`));
              return {};
            }
          }
          if (ke) {
            await unlockAgentWorktree(ve, ke);
          }
          logForDebugging(`Agent worktree kept at: ${ve}`);
          return {
            worktreePath: ve,
            worktreeBranch: _e
          };
        };
        if (s && s !== "main") {
          c.agentLifecycle.registerName(s, be);
        }
        let pe = s && s !== "main" ? s : undefined;
        if (Q) {
          let ve = be;
          let _e = bgt({
            agentId: ve,
            ownerAgentId: me,
            parentAgentId: fe,
            spawnDepth: Z,
            description: n,
            prompt: e,
            selectedAgent: P,
            taskRegistry: S,
            toolUseId: c.toolUseId,
            cwd: ce
          });
          if (!getIsNonInteractiveSession()) {
            _oe(me, `agent:${ve}`, S);
          }
          let xe = {
            agentId: ve,
            parentAgentId: fe,
            depth: Z,
            parentSessionId: getParentSessionId_export(),
            agentType: "subagent",
            subagentName: P.agentType,
            displayName: pe,
            isAsync: true,
            isBuiltIn: isBuiltInAgent(P),
            invokingRequestId: d?.requestId,
            invocationKind: "spawn",
            invocationEmitted: false
          };
          p8(xe, () => Sye(ce, () => dKe({
            taskId: _e.agentId,
            abortController: _e.abortController,
            makeStream: (Ie, Ue) => I3({
              ...ue,
              override: {
                ...ue.override,
                agentId: _e.agentId,
                agentContext: xe,
                abortController: _e.abortController
              },
              onCacheSafeParams: Ie,
              onQueryProgress: Ue
            }),
            metadata: re,
            description: n,
            toolUseContext: c,
            taskRegistry: S,
            agentIdForCleanup: ve,
            enableSummarization: z || V || getSdkAgentProgressSummariesEnabled(),
            getWorktreeResult: le
          })));
          let ke = c.options.tools.some(Ie => bl(Ie, "Read") || bl(Ie, "Bash"));
          Pe("subagent_launch");
          return {
            data: {
              isAsync: true,
              status: "async_launched",
              agentId: _e.agentId,
              description: n,
              resolvedModel: N,
              prompt: e,
              outputFile: getTaskOutputPath(_e.agentId),
              canReadOutputFile: ke
            }
          };
        } else {
          let ve = be;
          let _e = {
            agentId: ve,
            parentAgentId: fe,
            depth: Z,
            parentSessionId: getParentSessionId_export(),
            agentType: "subagent",
            subagentName: P.agentType,
            displayName: pe,
            isAsync: false,
            isBuiltIn: isBuiltInAgent(P),
            invokingRequestId: d?.requestId,
            invocationKind: "spawn",
            invocationEmitted: false
          };
          return p8(_e, () => Sye(ce, async () => {
            let xe = Date.now();
            if (ee.length > 0) {
              let yt = xS(ee).find(gt => gt.type === "user");
              if (yt && yt.type === "user" && p) {
                p({
                  type: "progress",
                  toolUseID: `agent_${d.message.id}`,
                  data: {
                    message: yt,
                    type: "agent_progress",
                    prompt: e,
                    agentId: ve,
                    agentType: P.agentType,
                    description: n,
                    resolvedModel: N
                  }
                });
              }
            }
            let ke = S8a({
              agentId: ve,
              ownerAgentId: me,
              parentAgentId: fe,
              spawnDepth: Z,
              description: n,
              prompt: e,
              selectedAgent: P,
              taskRegistry: S,
              toolUseId: c.toolUseId,
              autoBackgroundMs: iJt ? undefined : dPm() || undefined,
              cwd: ce
            });
            let Ie = ke.taskId;
            let Ue = ke.cancelAutoBackground;
            let Ge = ke.abortController;
            let Be = attachDetachableAbortRelay(c.abortController, Ge);
            let We = false;
            Pe("subagent_launch");
            let Ze = [];
            let Tt = c.options.forwardSubagentText;
            let kt = vt => {
              if (We) {
                return;
              }
              if (vt.type === "spinner_mode") {
                return;
              }
              if (vt.type !== "api_metrics" && vt.type !== "set_in_progress_tool_use_ids") {
                Ze.push(vt);
              }
              if (!p) {
                return;
              }
              if (vt.type === "api_metrics") {
                p(vt);
                return;
              }
              if (vt.type === "set_in_progress_tool_use_ids") {
                return;
              }
              if (vt.type === "progress" && (vt.data.type === "bash_progress" || vt.data.type === "powershell_progress")) {
                p({
                  type: "progress",
                  toolUseID: vt.toolUseID,
                  data: vt.data
                });
              }
              if (vt.type !== "assistant" && vt.type !== "user") {
                return;
              }
              if (vt.type === "assistant") {
                let yt = l$n(vt);
                if (yt > 0) {
                  p({
                    type: "response_length",
                    op: "add",
                    delta: yt
                  });
                }
              }
              for (let yt of xS([vt])) {
                let gt = yt.message.content[0];
                if (!Tt && gt.type !== "tool_use" && gt.type !== "tool_result") {
                  continue;
                }
                p({
                  type: "progress",
                  toolUseID: `agent_${d.message.id}`,
                  data: {
                    message: yt,
                    type: "agent_progress",
                    prompt: "",
                    agentId: ve,
                    agentType: P.agentType,
                    description: n,
                    resolvedModel: N
                  }
                });
              }
            };
            let Ye = iJt ? undefined : setTimeout(vt => {
              if (vt.setToolJSX?.({
                jsx: J0l.jsx(xNe, {}),
                shouldHidePromptInput: false,
                shouldContinueAnimation: true,
                showSpinner: true
              }), vt.toolUseId) {
                vt.emitToolProgress?.({
                  kind: "background_hint",
                  toolUseId: vt.toolUseId
                });
              }
            }, 2000, c);
            let ht = {};
            let It = async () => (ht = await le(), ht);
            let Rt = dKe({
              taskId: Ie,
              abortController: Ge,
              makeStream: (vt, yt) => I3({
                ...ue,
                override: {
                  ...ue.override,
                  agentId: ve,
                  agentContext: _e,
                  abortController: Ge
                },
                onCacheSafeParams: vt,
                onQueryProgress: yt
              }),
              metadata: re,
              description: n,
              toolUseContext: c,
              taskRegistry: S,
              agentIdForCleanup: ve,
              enableSummarization: getSdkAgentProgressSummariesEnabled(),
              getWorktreeResult: It,
              onMessage: kt,
              shouldNotifyOwner: () => We
            });
            let wt;
            try {
              let vt;
              try {
                vt = iJt ? await Rt.then(() => "done") : await Promise.race([Rt.then(() => "done"), ke.backgroundSignal.then(() => "backgrounded")]);
              } catch (jn) {
                if (vt = "done", jn instanceof xc) {
                  if (logEvent("tengu_agent_tool_terminated", {
                    agent_type: re.agentType,
                    model: re.resolvedAgentModel,
                    duration_ms: Date.now() - re.startTime,
                    is_async: false,
                    is_built_in_agent: re.isBuiltInAgent,
                    agent_depth: re.agentDepth,
                    reason: "user_cancel_sync"
                  }), !(Ge.signal.aborted && !c.abortController.signal.aborted)) {
                    throw jn;
                  }
                  wt = sr(jn);
                } else {
                  logForDebugging(`Sync agent error: ${he(jn)}`, {
                    level: "error"
                  });
                  Ae("subagent_complete", "subagent_sync_errored");
                  wt = sr(jn);
                }
              }
              let yt = vt === "done" && !wt && ygt(Ie, S);
              if (yt) {
                LWt(Ie, S);
              }
              let gt = S.get(Ie)?.status;
              let Ft = vt === "backgrounded" && !yt && gt !== undefined && gt !== "running" && !ygt(Ie, S);
              if (vt === "backgrounded" && !Ft || yt) {
                if (We = true, Be(), !getIsNonInteractiveSession()) {
                  _oe(me, `agent:${Ie}`, S);
                }
                let jn = c.options.tools.some(Xr => bl(Xr, "Read") || bl(Xr, "Bash"));
                return {
                  data: {
                    isAsync: true,
                    status: "async_launched",
                    agentId: Ie,
                    description: n,
                    resolvedModel: N,
                    prompt: e,
                    outputFile: getTaskOutputPath(Ie),
                    canReadOutputFile: jn
                  }
                };
              }
              let on = Ze.findLast(jn => jn.type !== "system" && jn.type !== "progress");
              if (on && Hse(on)) {
                throw logEvent("tengu_agent_tool_terminated", {
                  agent_type: re.agentType,
                  model: re.resolvedAgentModel,
                  duration_ms: Date.now() - re.startTime,
                  is_async: false,
                  is_built_in_agent: re.isBuiltInAgent,
                  agent_depth: re.agentDepth,
                  reason: "user_cancel_sync"
                }), new xc();
              }
              if (wt) {
                if (!Ze.some(jn => jn.type === "assistant")) {
                  throw wt;
                }
                logForDebugging(`Sync agent recovering from error with ${Ze.length} messages`);
              }
              let rn = MDo(Ze, ve, re, {
                suppressTelemetry: !wt
              });
              let Sn = await E7t({
                agentMessages: Ze,
                tools: c.options.tools,
                toolPermissionContext: getToolPermissionContext(c),
                abortSignal: c.abortController.signal,
                subagentType: P.agentType,
                totalToolUseCount: rn.totalToolUseCount
              });
              if (Sn) {
                rn.content = [{
                  type: "text",
                  text: Sn
                }, ...rn.content];
              }
              return {
                data: {
                  status: "completed",
                  prompt: e,
                  ...rn,
                  ...ht
                }
              };
            } finally {
              if (Ye) {
                clearTimeout(Ye);
              }
              if (c.setToolJSX?.(null), c.toolUseId) {
                c.emitToolProgress?.({
                  kind: "clear",
                  toolUseId: c.toolUseId
                });
              }
              if (Ue?.(), Be(), !We) {
                let vt = S.get(Ie);
                let yt = za(vt) ? vt.progress : undefined;
                T8a(Ie, S);
                zu(Ie, vt?.status === "failed" ? "failed" : vt?.status === "killed" ? "stopped" : "completed", {
                  toolUseId: c.toolUseId,
                  summary: n,
                  usage: {
                    total_tokens: yt?.tokenCount ?? 0,
                    tool_uses: yt?.toolUseCount ?? 0,
                    duration_ms: Date.now() - xe
                  }
                });
              }
            }
          }));
        }
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        let t = e;
        let n = [t.subagent_type, t.mode ? `mode=${t.mode}` : undefined].filter(o => o !== undefined);
        return `${n.length > 0 ? `(${n.join(", ")}): ` : ": "}${t.prompt}`;
      },
      isConcurrencySafe() {
        return true;
      },
      userFacingName: pNo,
      userFacingNameBackgroundColor: mNo,
      getActivityDescription(e) {
        return e?.description?.replace(/\s+/g, " ").trim() || "Running task";
      },
      async checkPermissions(e, t) {
        if (getToolPermissionContext(t).mode === "auto") {
          return {
            behavior: "passthrough",
            message: "Agent tool requires permission to spawn subagents."
          };
        }
        return {
          behavior: "allow",
          updatedInput: e
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let n = e;
        if (typeof n === "object" && n !== null && "status" in n && n.status === "teammate_spawned") {
          let r = n;
          return {
            tool_use_id: t,
            type: "tool_result",
            content: [{
              type: "text",
              text: `Spawned successfully. (This tool result is internal metadata \u2014 never quote or paste any part of it, including the ID below, into a user-facing reply.)
agent_id: ${r.teammate_id}
name: ${r.name}
The agent is now running and will receive instructions via mailbox.`
            }]
          };
        }
        if (e.status === "remote_launched") {
          let r = e;
          return {
            tool_use_id: t,
            type: "tool_result",
            content: [{
              type: "text",
              text: `Cloud agent launched. (This tool result is internal metadata \u2014 never quote or paste any part of it, including the ID below, into a user-facing reply.)
taskId: ${r.taskId}
session_url: ${r.sessionUrl}
output_file: ${r.outputFile}
The agent is running in the cloud. You will be notified automatically when it completes.
In your own words, briefly tell the user what you launched \u2014 do not echo this tool result \u2014 and end your response.`
            }]
          };
        }
        if (e.status === "async_launched") {
          let r = `Async agent launched successfully. (This tool result is internal metadata \u2014 never quote or paste any part of it, including the agentId below, into a user-facing reply.)
agentId: ${e.agentId} (internal ID - do not mention to user. Use SendMessage with to: '${e.agentId}', summary: '<5-10 word recap>' to continue this agent.)
The agent is working in the background. You will be notified automatically when it completes.`;
          let o = e.canReadOutputFile ? `Do not duplicate this agent's work \u2014 avoid working with the same files or topics it is using.
output_file: ${e.outputFile}
Do NOT ${"Read"} or tail this file via the shell tool \u2014 it is the full subagent JSONL transcript and reading it will overflow your context. If the user asks for progress, say the agent is still running; you'll get a completion notification.` : "In your own words, briefly tell the user what you launched \u2014 do not echo this tool result. Agent results will arrive in a subsequent message.";
          let s = `${r}
${o}`;
          return {
            tool_use_id: t,
            type: "tool_result",
            content: [{
              type: "text",
              text: s
            }]
          };
        }
        if (e.status === "completed") {
          let r = e;
          let o = r.worktreePath ? `
worktreePath: ${r.worktreePath}
worktreeBranch: ${r.worktreeBranch}` : "";
          let s = e.content.length > 0 ? e.content : [{
            type: "text",
            text: "(Subagent completed but returned no output.)"
          }];
          if (e.agentType && x3i.vZc(e.agentType) && !o) {
            return {
              tool_use_id: t,
              type: "tool_result",
              content: s
            };
          }
          return {
            tool_use_id: t,
            type: "tool_result",
            content: [...s, {
              type: "text",
              text: `agentId: ${e.agentId} (use SendMessage with to: '${e.agentId}', summary: '<5-10 word recap>' to continue this agent)${o}
<usage>subagent_tokens: ${e.totalTokens}
tool_uses: ${e.totalToolUseCount}
duration_ms: ${e.totalDurationMs}</usage>`
            }]
          };
        }
        throw Ae("subagent_launch", "subagent_unexpected_result_status"), Error(`Unexpected agent tool result status: ${e.status}`);
      },
      renderToolResultMessage: AEl,
      renderToolUseMessage: IEl,
      renderToolUseTag: PEl,
      renderToolUseProgressMessage: kLe,
      renderToolUseRejectedMessage: OEl,
      renderToolUseErrorMessage: DEl,
      renderGroupedToolUse: MEl
    });
  });
  var Q0l = `Render a clickable role-picker chip row during Cowork onboarding. Call this when asking the user what kind of work they do so they can pick their role and get a matching plugin installed. The role list is hardcoded in the frontend \u2014 call with no args.

The call blocks until the user responds. Three resolution paths all land in the tool result: chip click or free-form typed answer \u2192 {"role": "Legal"} or {"role": "paralegal"}; X button \u2192 {"dismissed": true}. An empty object {} means the user approved without picking a role \u2014 treat it like a dismissal. Free-form roles may not match the chip list \u2014 search the marketplace with whatever string you get.

Do NOT call this in normal conversation. Only call this when explicitly helping the user set up Cowork for their role/job function.`;
  function yPm() {
    return Me.CLAUDE_CODE_REMOTE;
  }
  var BFo;
  var hPm;
  var gPm;
  var Z0l;
  var eIl = __lazy(() => {
    Wl();
    et();
    ci();
    pr();
    BFo = __toESM(ie(), 1);
    hPm = we(() => v.strictObject({}));
    gPm = we(() => v.object({
      role: v.string().optional(),
      dismissed: v.boolean().optional()
    }));
    Z0l = Xs({
      name: "ShowOnboardingRolePicker",
      searchHint: "show the Cowork onboarding role picker",
      maxResultSizeChars: 1e4,
      get inputSchema() {
        return hPm();
      },
      get outputSchema() {
        return gPm();
      },
      isEnabled: yPm,
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      requiresUserInteraction() {
        return true;
      },
      async description() {
        return "Render a clickable role-picker chip row during Cowork onboarding so the user can pick their role and get a matching plugin installed.";
      },
      async prompt() {
        return Q0l;
      },
      toAutoClassifierInput() {
        return "show onboarding role picker";
      },
      async checkPermissions(e, t) {
        return {
          behavior: "ask",
          message: "Pick your role?",
          updatedInput: {}
        };
      },
      async call(e, t) {
        let {
          role: n,
          dismissed: r
        } = e;
        return {
          data: {
            ...(typeof n === "string" && n.trim() !== "" && {
              role: n
            }),
            ...(typeof r === "boolean" && {
              dismissed: r
            })
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: De(e)
        };
      },
      renderToolUseMessage() {
        return null;
      },
      renderToolResultMessage(e) {
        return BFo.jsx(Vn, {
          children: BFo.jsx(Text, {
            children: e.role !== undefined ? `Role: ${e.role}` : "Role picker dismissed"
          })
        });
      }
    });
  });
  function oEt(e, t, n) {
    let {
      head: r,
      tail: o,
      mtime: s,
      size: i
    } = t;
    let a = r.indexOf(`
`);
    let l = a >= 0 ? r.slice(0, a) : r;
    if (l.includes('"isSidechain":true') || l.includes('"isSidechain": true')) {
      return null;
    }
    let c = rS(o, "customTitle") || rS(r, "customTitle") || rS(o, "aiTitle") || rS(r, "aiTitle") || undefined;
    let u = ogn(r) || undefined;
    let d = rW(r, "timestamp");
    let p;
    if (d) {
      let _ = Date.parse(d);
      if (!Number.isNaN(_)) {
        p = _;
      }
    }
    let m = c || rS(o, "lastPrompt") || rS(o, "summary") || u;
    if (!m) {
      return null;
    }
    let f = rS(o, "gitBranch") || rW(r, "gitBranch") || undefined;
    let h = BDt(o, "relocated", "relocatedCwd") || rW(r, "cwd") || n || undefined;
    let g = o.split(`
`).findLast(_ => _.includes('"type":"tag"') && _.includes('"tag":"'));
    let y = g ? rS(g, "tag") || undefined : undefined;
    return {
      sessionId: e,
      summary: m,
      lastModified: s,
      fileSize: i,
      customTitle: c,
      firstPrompt: u,
      gitBranch: f,
      cwd: h,
      tag: y,
      createdAt: p
    };
  }
  async function ZKe(e, t, n) {
    let r;
    try {
      r = await nEt.readdir(e);
    } catch {
      return [];
    }
    return (await Promise.all(r.map(async s => {
      if (!s.endsWith(".jsonl")) {
        return null;
      }
      let i = QS(s.slice(0, -6));
      if (!i) {
        return null;
      }
      let a = rEt.join(e, s);
      if (!t) {
        return {
          sessionId: i,
          filePath: a,
          mtime: 0,
          projectPath: n
        };
      }
      try {
        let l = await nEt.stat(a);
        return {
          sessionId: i,
          filePath: a,
          mtime: l.mtime.getTime(),
          projectPath: n
        };
      } catch {
        return null;
      }
    }))).filter(s => s !== null);
  }
  async function tIl(e, t) {
    let n = await sgn(e.filePath);
    if (!n) {
      return null;
    }
    if (!t && Nks(n.head, n.tail)) {
      return null;
    }
    let r = oEt(e.sessionId, n, e.projectPath);
    if (!r) {
      return null;
    }
    if (e.mtime) {
      r.lastModified = e.mtime;
    }
    return r;
  }
  function bPm(e, t) {
    if (t.mtime !== e.mtime) {
      return t.mtime - e.mtime;
    }
    return t.sessionId < e.sessionId ? -1 : t.sessionId > e.sessionId ? 1 : 0;
  }
  async function SPm(e, t, n, r) {
    e.sort(bPm);
    let o = [];
    let s = t && t > 0 ? t : 1 / 0;
    let i = 0;
    let a = new Set();
    for (let l = 0; l < e.length && o.length < s;) {
      let c = Math.min(l + 32, e.length);
      let u = e.slice(l, c);
      let d = await Promise.all(u.map(p => tIl(p, r)));
      for (let p = 0; p < d.length && o.length < s; p++) {
        l++;
        let m = d[p];
        if (!m) {
          continue;
        }
        if (a.vZc(m.sessionId)) {
          continue;
        }
        if (a.add(m.sessionId), i < n) {
          i++;
          continue;
        }
        o.push(m);
      }
    }
    return o;
  }
  async function TPm(e, t) {
    let n = await Promise.all(e.map(s => tIl(s, t)));
    let r = new Map();
    for (let s of n) {
      if (!s) {
        continue;
      }
      let i = r.get(s.sessionId);
      if (!i || s.lastModified > i.lastModified) {
        r.set(s.sessionId, s);
      }
    }
    let o = [...r.values()];
    o.sort((s, i) => i.lastModified !== s.lastModified ? i.lastModified - s.lastModified : i.sessionId < s.sessionId ? -1 : i.sessionId > s.sessionId ? 1 : 0);
    return o;
  }
  async function EPm(e, t, n) {
    let r = await YE(e);
    let o;
    if (t) {
      try {
        o = await B6(r);
      } catch {
        o = [];
      }
    } else {
      o = [];
    }
    if (o.length <= 1) {
      let d = [];
      for (let p of await jA(r)) {
        d.push(...(await ZKe(p, n, r)));
      }
      return d;
    }
    let s = nF();
    let i = false;
    let a = o.map(d => {
      let p = $T(d);
      return {
        path: d,
        prefix: i ? p.toLowerCase() : p
      };
    });
    a.sort((d, p) => p.prefix.length - d.prefix.length);
    let l;
    try {
      l = await nEt.readdir(s, {
        withFileTypes: true
      });
    } catch {
      let d = [];
      for (let p of await jA(r)) {
        d.push(...(await ZKe(p, n, r)));
      }
      return d;
    }
    let c = [];
    let u = new Set();
    for (let d of await jA(r)) {
      let p = rEt.basename(d);
      u.add(i ? p.toLowerCase() : p);
      c.push(...(await ZKe(d, n, r)));
    }
    for (let d of l) {
      if (!d.isDirectory()) {
        continue;
      }
      let p = i ? d.name.toLowerCase() : d.name;
      if (u.vZc(p)) {
        continue;
      }
      for (let {
        path: m,
        prefix: f
      } of a) {
        if (p === f || f.length >= 200 && p.startsWith(f + "-")) {
          u.add(p);
          c.push(...(await ZKe(rEt.join(s, d.name), n, m)));
          break;
        }
      }
    }
    return c;
  }
  async function vPm(e) {
    let t = nF();
    let n;
    try {
      n = await nEt.readdir(t, {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    return (await Promise.all(n.filter(o => o.isDirectory()).map(o => ZKe(rEt.join(t, o.name), e)))).flat();
  }
  async function nIl(e) {
    let {
      dir: t,
      limit: n,
      offset: r,
      includeWorktrees: o,
      includeProgrammatic: s
    } = e ?? {};
    let i = r ?? 0;
    let a = s ?? true;
    let l = n !== undefined && n > 0 || i > 0;
    let c = t ? await EPm(t, o ?? true, l) : await vPm(l);
    if (!l) {
      return TPm(c, a);
    }
    return SPm(c, n, i, a);
  }
  var nEt;
  var rEt;
  var Btr = __lazy(() => {
    oje();
    ZS();
    nEt = require("fs/promises");
    rEt = require("path");
  });
  function $Fo() {
    return rIl.join(vf(), ".consolidate-lock");
  }
  async function $tr() {
    try {
      return (await O3.stat($Fo())).mtimeMs;
    } catch {
      return 0;
    }
  }
  async function oIl() {
    let e = $Fo();
    let t;
    let n;
    try {
      let [o, s] = await Promise.all([O3.stat(e), O3.readFile(e, "utf8")]);
      t = o.mtimeMs;
      let i = parseInt(s.trim(), 10);
      n = Number.isFinite(i) ? i : undefined;
    } catch {}
    if (t !== undefined && Date.now() - t < 3600000) {
      if (n !== undefined && isProcessRunning(n)) {
        logForDebugging(`[autoDream] lock held by live PID ${n} (mtime ${Math.round((Date.now() - t) / 1000)}s ago)`);
        return null;
      }
    }
    await O3.mkdir(vf(), {
      recursive: true
    });
    await O3.writeFile(e, String(process.pid));
    let r;
    try {
      r = await O3.readFile(e, "utf8");
    } catch {
      return null;
    }
    if (parseInt(r.trim(), 10) !== process.pid) {
      return null;
    }
    return t ?? 0;
  }
  async function Htr(e) {
    let t = $Fo();
    try {
      if (e === 0) {
        await O3.unlink(t);
        return;
      }
      await O3.writeFile(t, "");
      let n = e / 1000;
      await O3.utimes(t, n, n);
    } catch (n) {
      logForDebugging(`[autoDream] rollback failed: ${he(n)} \u2014 next trigger delayed to minHours`);
    }
  }
  async function sIl(e) {
    let t = ty(getOriginalCwd());
    return (await ZKe(t, true)).filter(r => r.mtime > e).map(r => r.sessionId);
  }
  var O3;
  var rIl;
  var jtr = __lazy(() => {
    at();
    Eb();
    je();
    dt();
    Tb();
    Btr();
    Fy();
    O3 = require("fs/promises");
    rIl = require("path");
  });
  function HFo(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "dream";
  }
  function iIl(e, t) {
    let n = TU("dream");
    let r = {
      ...ww(n, "dream", "dreaming"),
      type: "dream",
      status: "running",
      skipTranscript: true,
      phase: "starting",
      sessionsReviewing: t.sessionsReviewing,
      filesTouched: [],
      turns: [],
      abortController: t.abortController,
      priorMtime: t.priorMtime
    };
    e.register(r);
    return n;
  }
  function aIl(e, t, n, r) {
    r.update(e, o => {
      let s = new Set(o.filesTouched);
      let i = n.filter(a => !s.vZc(a) && s.add(a));
      if (t.text === "" && t.toolUseCount === 0 && i.length === 0) {
        return o;
      }
      return {
        ...o,
        phase: i.length > 0 ? "updating" : o.phase,
        filesTouched: i.length > 0 ? [...o.filesTouched, ...i] : o.filesTouched,
        turns: o.turns.slice(-(30 - 1)).concat(t)
      };
    });
  }
  function lIl(e, t) {
    t.update(e, n => ({
      ...n,
      status: "completed",
      endTime: Date.now(),
      notified: true,
      abortController: undefined
    }));
    Pe("task_dream");
    zu(e, "completed", {
      skipTranscript: true
    });
  }
  function cIl(e, t) {
    t.update(e, n => ({
      ...n,
      status: "failed",
      endTime: Date.now(),
      notified: true,
      abortController: undefined
    }));
    Ae("task_dream", "task_dream_failed");
    zu(e, "failed", {
      skipTranscript: true
    });
  }
  var qtr;
  var Wtr = __lazy(() => {
    ln();
    jtr();
    Cx();
    qtr = {
      name: "DreamTask",
      type: "dream",
      async kill(e, t) {
        let n;
        if (t.update(e, r => {
          if (r.status !== "running") {
            return r;
          }
          r.abortController?.abort();
          n = r.priorMtime;
          return {
            ...r,
            status: "killed",
            endTime: Date.now(),
            notified: true,
            abortController: undefined
          };
        }), n !== undefined) {
          zu(e, "stopped", {
            skipTranscript: true
          });
          await Htr(n);
        }
      }
    };
  });
  function xPm() {
    let e = [Pjn, h5n, Oze, qtr, qyl];
    e.push((Dpe(), __toCommonJS(Kwo)).LocalWorkflowTask);
    e.push(...rgl());
    return e;
  }
  function qFo(e) {
    return xPm().find(t => t.type === e);
  }
  var uIl = __lazy(() => {
    Wtr();
    ry();
    zX();
    S7t();
    tZ();
    hOo();
  });
  function sEt(e) {
    return e.type === "local_agent" && e.status === "completed" && "keepaliveReasons" in e && e.keepaliveReasons instanceof Set && e.keepaliveReasons.size > 0 && !getIsNonInteractiveSession();
  }
  function kPm(e, t, n) {
    let r = new Set();
    let o = "parentAgentId" in e && typeof e.parentAgentId === "string" ? e.parentAgentId : undefined;
    while (o && !r.vZc(o)) {
      if (o === t) {
        return true;
      }
      r.add(o);
      let s = n[o];
      o = s && s.type === "local_agent" && "parentAgentId" in s && typeof s.parentAgentId === "string" ? s.parentAgentId : undefined;
    }
    return false;
  }
  function APm(e, t) {
    let n = t?.().agentNameRegistry?.entries();
    if (!n) {
      return [];
    }
    let r = [];
    for (let [o, s] of n) {
      let i = e.get(s);
      if (i?.type === "local_agent" && (i.status === "running" || sEt(i))) {
        r.push(o);
      }
    }
    return r;
  }
  function WFo(e, t, n) {
    let r = fOo(t.all());
    let o = APm(t, n);
    let s = `No task found with ID: ${e}`;
    if (r.length > 0) {
      s += `. Running teammates: ${r.join(", ")}`;
    }
    if (o.length > 0) {
      s += `. Running named agents: ${o.join(", ")}`;
    }
    return s;
  }
  function IPm(e, t) {
    return `Multiple teammates match "${e}": ${t.join(", ")}. Use the full agent ID (name@team).`;
  }
  function PPm(e, t, n) {
    let r = n?.().agentNameRegistry?.get(e);
    if (!r) {
      return;
    }
    let o = t.get(r);
    return o?.type === "local_agent" ? o : undefined;
  }
  function GFo(e, t, n) {
    let r = mOo(e, t.all());
    let o = PPm(e, t, n);
    if (r.status !== "not_found" && o) {
      let s = r.status === "found" ? [r.task.identity.agentId] : r.candidates;
      return {
        status: "ambiguous",
        message: `"${e}" matches both teammate ${s.join(", ")} and background agent ${o.id}. Use the full agent ID (name@team) for the teammate or the task ID for the background agent.`
      };
    }
    if (r.status === "ambiguous") {
      return {
        status: "ambiguous",
        message: IPm(e, r.candidates)
      };
    }
    if (r.status === "found") {
      return {
        status: "found",
        task: r.task
      };
    }
    if (o) {
      return {
        status: "found",
        task: o
      };
    }
    return {
      status: "not_found"
    };
  }
  async function iEt(e, t) {
    let {
      taskRegistry: n,
      setAppState: r,
      getAppState: o,
      callerAgentId: s,
      killedBy: i = "user"
    } = t;
    let a = e;
    let l = n.get(a);
    if (!l) {
      let m = GFo(e, n, o);
      if (m.status === "ambiguous") {
        throw new rFe(m.message, "not_found");
      }
      if (m.status === "found") {
        l = m.task;
        a = m.task.id;
      }
    }
    if (!l) {
      throw new rFe(WFo(e, n, o), "not_found");
    }
    let c = a === e ? a : `${e} (${a})`;
    if (l.status !== "running" && !sEt(l)) {
      throw new rFe(`Task ${c} is not running (status: ${l.status})`, "not_running");
    }
    if (!Uyl(s, l.agentId)) {
      throw new rFe(`Task ${c} is owned by ${KXn(l.agentId)}; agent ${s} cannot stop it.`, "not_owner");
    }
    let u = qFo(l.type);
    if (!u) {
      throw new rFe(`Unsupported task type: ${l.type}`, "unsupported_type");
    }
    if (t.source === "user") {
      rfe(a, n);
    }
    let d = sEt(l);
    if (await u.kill(a, n, r, i), d) {
      let m = n.all();
      for (let f of Object.values(m)) {
        if (f.type === "local_agent" && f.id !== a && (f.status === "running" || sEt(f)) && kPm(f, l.agentId ?? a, m)) {
          if (n.update(f.id, h => h.notified && h.quietlyParked !== true ? h : {
            ...h,
            notified: true,
            quietlyParked: false
          }), zu(f.id, "stopped", {
            toolUseId: f.toolUseId,
            summary: f.description
          }), t.source === "user") {
            rfe(f.id, n);
          }
          await u.kill(f.id, n, r, i);
        }
      }
    }
    if (Cw(l)) {
      let m = false;
      if (n.update(a, f => {
        if (f.notified) {
          return f;
        }
        m = true;
        return {
          ...f,
          notified: true
        };
      }), m) {
        zu(a, "stopped", {
          toolUseId: l.toolUseId,
          summary: l.description
        });
      }
    }
    if (Cw(l) && l.agentId !== undefined && s !== l.agentId) {
      Hyl({
        taskId: a,
        toolUseId: l.toolUseId,
        description: l.description,
        ownerAgentId: l.agentId
      });
    }
    let p = Cw(l) ? l.command : l.description;
    return {
      taskId: a,
      taskType: l.type,
      command: p
    };
  }
  function aJt(e) {
    let {
      taskRegistry: t,
      setAppState: n
    } = e;
    for (let r of Object.values(t.all())) {
      if (r.status !== "running" || !kv(r) || !RQ(r)) {
        continue;
      }
      if (rfe(r.id, t), qFo(r.type)?.kill(r.id, t, n, "system"), r.type === "local_agent") {
        t.update(r.id, o => o.notified && o.quietlyParked !== true ? o : {
          ...o,
          notified: true,
          quietlyParked: false
        });
        zu(r.id, "stopped", {
          toolUseId: r.toolUseId,
          summary: r.description
        });
      }
    }
  }
  function rfe(e, t) {
    t.update(e, r => r.stoppedByUser ? r : {
      ...r,
      stoppedByUser: true
    });
    let n = t.get(e);
    if (n?.type === "local_agent") {
      let r = "agentType" in n && typeof n.agentType === "string" ? n.agentType : "general-purpose";
      OPm(e, r);
    }
  }
  async function OPm(e, t) {
    try {
      let n = await readAgentMetadata(e);
      if (n?.stoppedByUser) {
        return;
      }
      await writeAgentMetadata(e, {
        ...(n ?? {
          agentType: t
        }),
        stoppedByUser: true
      });
    } catch (n) {
      if (Io(n)) {
        logForDebugging(`failed to persist stop marker for ${e}: ${he(n)}`, {
          level: "warn"
        });
        return;
      }
      Oe(n);
    }
  }
  var rFe;
  var e7e = __lazy(() => {
    at();
    uIl();
    gSt();
    D_();
    je();
    dt();
    Rn();
    hSt();
    fa();
    pXn();
    rFe = class rFe extends Error {
      code;
      telemetryMessage;
      constructor(e, t) {
        super(e);
        this.code = t;
        this.name = "StopTaskError";
        this.telemetryMessage = `StopTask: ${t}`;
      }
    };
  });
  function mIl() {
    return "";
  }
  function DPm(e) {
    let t = e.split(`
`);
    let n = e;
    if (t.length > 2) {
      n = t.slice(0, 2).join(`
`);
    }
    if (an(n) > 160) {
      n = truncateToWidthNoEllipsis(n, 160);
    }
    return n.trim();
  }
  function fIl(e, t, {
    verbose: n
  }) {
    let r = e.command ?? "";
    let o = n ? r : DPm(r);
    return Gtr.jsx(Vn, {
      children: Gtr.jsxs(Text, {
        children: [o, o !== r ? "\u2026 \xB7 stopped" : " \xB7 stopped"]
      })
    });
  }
  var Gtr;
  var hIl = __lazy(() => {
    Wl();
    bc();
    et();
    cs();
    Gtr = __toESM(ie(), 1);
  });
  var MPm;
  var NPm;
  var Vtr;
  var gIl = __lazy(() => {
    ci();
    e7e();
    hSt();
    hIl();
    MPm = we(() => v.strictObject({
      task_id: v.string().optional().describe("The ID of the background task to stop. Agent-team teammates and named background agents are also accepted by agent ID or name."),
      shell_id: v.string().optional().describe("Deprecated: use task_id instead")
    }));
    NPm = we(() => v.object({
      message: v.string().describe("Status message about the operation"),
      task_id: v.string().describe("The ID of the task that was stopped"),
      task_type: v.string().describe("The type of the task that was stopped"),
      command: v.string().optional().describe("The command or description of the stopped task")
    }));
    Vtr = Xs({
      name: "TaskStop",
      searchHint: "kill a running background task",
      aliases: ["KillShell", "KillBash"],
      maxResultSizeChars: 1e5,
      userFacingName: () => "Stop Task",
      get inputSchema() {
        return MPm();
      },
      get outputSchema() {
        return NPm();
      },
      shouldDefer: true,
      isConcurrencySafe() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.task_id ?? e.shell_id ?? "";
      },
      async validateInput({
        task_id: e,
        shell_id: t
      }, {
        taskRegistry: n,
        getAppState: r
      }) {
        let o = e ?? t;
        if (!o) {
          return {
            result: false,
            message: "Missing required parameter: task_id",
            errorCode: 1
          };
        }
        let s = n.get(o);
        if (!s) {
          let i = GFo(o, n, r);
          if (i.status === "ambiguous") {
            return {
              result: false,
              message: i.message,
              errorCode: 1
            };
          }
          if (i.status === "found") {
            s = i.task;
          }
        }
        if (!s) {
          return {
            result: false,
            message: WFo(o, n, r),
            errorCode: 1
          };
        }
        if (s.status !== "running" && !sEt(s)) {
          return {
            result: false,
            message: `Task ${o} is not running (status: ${s.status})`,
            errorCode: 3
          };
        }
        return {
          result: true
        };
      },
      async description() {
        return "Stop a running background task by ID";
      },
      async prompt() {
        return Uda;
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: De(e)
        };
      },
      renderToolUseMessage: mIl,
      renderToolResultMessage: fIl,
      async call({
        task_id: e,
        shell_id: t
      }, n) {
        let {
          taskRegistry: r,
          setAppState: o,
          getAppState: s
        } = n;
        let i = e ?? t;
        if (!i) {
          throw Error("Missing required parameter: task_id");
        }
        let a = await iEt(i, {
          taskRegistry: r,
          setAppState: o,
          getAppState: s,
          callerAgentId: fSt(n),
          killedBy: "parent"
        });
        return {
          data: {
            message: `Successfully stopped task: ${a.taskId} (${a.command})`,
            task_id: a.taskId,
            task_type: a.taskType,
            command: a.command
          }
        };
      }
    });
  });
  var VFo = {};
  __export(VFo, {
    sanitizeSessionNamePrefix: () => sanitizeSessionNamePrefix,
    getBridgeTokenOverride: () => getBridgeTokenOverride,
    getBridgeSessionNamePrefix: () => getBridgeSessionNamePrefix,
    getBridgeBaseUrlOverride: () => getBridgeBaseUrlOverride,
    getBridgeBaseUrl: () => getBridgeBaseUrl,
    getBridgeAccessToken: () => getBridgeAccessToken
  });
  function getBridgeTokenOverride() {
    return;
  }
  function getBridgeBaseUrlOverride() {
    return;
  }
  function getBridgeAccessToken() {
    let e = getBridgeTokenOverride();
    if (e !== undefined) {
      return e;
    }
    if (!isFirstPartyProvider() || !isClaudeAISubscriber()) {
      return;
    }
    return getClaudeAIOAuthTokens()?.accessToken;
  }
  function getBridgeBaseUrl() {
    return getBridgeBaseUrlOverride() ?? getOauthConfig().BASE_API_URL;
  }
  function getBridgeSessionNamePrefix() {
    let e = process.env.CLAUDE_REMOTE_CONTROL_SESSION_NAME_PREFIX || yIl.hostname();
    return sanitizeSessionNamePrefix(e) || "remote-control";
  }
  function sanitizeSessionNamePrefix(e) {
    return e.toLowerCase().replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "");
  }
  var yIl;
  var wZ = __lazy(() => {
    Uc();
    no();
    Ds();
    yIl = require("os");
  });
  var vIl = {};