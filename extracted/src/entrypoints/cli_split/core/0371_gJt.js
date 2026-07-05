  async function* fJt(e, t, n, r, o, s, i, a, l, c) {
    if (isNonDeniableTool(t)) {
      return;
    }
    if (e.options.bareFork) {
      return;
    }
    let u = Date.now();
    try {
      let d = getToolPermissionContext(e).mode;
      for await (let p of executePostToolHooks(t.name, n, o, s, e, d, e.abortController.signal, undefined, c)) {
        try {
          if (p.message?.type === "attachment" && p.message.attachment.type === "hook_cancelled") {
            logEvent("tengu_post_tool_hooks_cancelled", {
              toolName: qi(t.name),
              queryChainId: br(e.queryTracking?.chainId),
              queryDepth: e.queryTracking?.depth
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: `PostToolUse:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUse"
              })
            };
            continue;
          }
          if (p.message && !(p.message.type === "attachment" && p.message.attachment.type === "hook_blocking_error")) {
            yield {
              message: p.message
            };
          }
          if (p.blockingError) {
            yield {
              message: createAttachmentMessage({
                type: "hook_blocking_error",
                hookName: `PostToolUse:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUse",
                blockingError: p.blockingError
              })
            };
          }
          if (p.updatedToolOutput !== undefined) {
            yield {
              updatedToolOutput: p.updatedToolOutput
            };
          }
          if (p.updatedMCPToolOutput !== undefined && bM(t)) {
            yield {
              updatedToolOutput: p.updatedMCPToolOutput
            };
          }
          if (p.preventContinuation) {
            yield {
              message: createAttachmentMessage({
                type: "hook_stopped_continuation",
                message: p.stopReason || "Execution stopped by PostToolUse hook",
                hookName: `PostToolUse:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUse"
              })
            };
            return;
          }
          if (p.additionalContexts && p.additionalContexts.length > 0) {
            yield {
              message: createAttachmentMessage({
                type: "hook_additional_context",
                content: p.additionalContexts,
                hookName: `PostToolUse:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUse"
              })
            };
          }
        } catch (m) {
          let f = Date.now() - u;
          logEvent("tengu_post_tool_hook_error", {
            messageID: br(r),
            toolName: qi(t.name),
            isMcp: t.isMcp ?? false,
            duration: f,
            queryChainId: br(e.queryTracking?.chainId),
            queryDepth: e.queryTracking?.depth,
            ...(a && {
              mcpServerType: a
            }),
            ...(i && {
              requestId: br(i)
            })
          });
          yield {
            message: createAttachmentMessage({
              type: "hook_error_during_execution",
              content: awe(m),
              hookName: `PostToolUse:${t.name}`,
              toolUseID: n,
              hookEvent: "PostToolUse"
            })
          };
        }
      }
    } catch (d) {
      if (mg(d)) {
        if (e.abortController.signal.aborted) {
          throw d;
        }
        logForDebugging("PostToolUse hook timed out (per-hook abort)");
        logEvent("tengu_sdk_hook_callback_timeout", {
          hookEvent: "PostToolUse",
          toolName: qi(t.name)
        });
        return;
      }
      Oe($o(sr(d), "PostToolUse hook dispatch failed"));
    }
  }
  async function* hJt(e, t, n, r, o, s, i, a, l, c, u) {
    if (isNonDeniableTool(t)) {
      return;
    }
    if (e.options.bareFork) {
      return;
    }
    let d = Date.now();
    try {
      let p = getToolPermissionContext(e).mode;
      for await (let m of executePostToolUseFailureHooks(t.name, n, o, s, e, i, p, e.abortController.signal, undefined, u)) {
        try {
          if (m.message?.type === "attachment" && m.message.attachment.type === "hook_cancelled") {
            logEvent("tengu_post_tool_failure_hooks_cancelled", {
              toolName: qi(t.name),
              queryChainId: br(e.queryTracking?.chainId),
              queryDepth: e.queryTracking?.depth
            });
            yield {
              message: createAttachmentMessage({
                type: "hook_cancelled",
                hookName: `PostToolUseFailure:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUseFailure"
              })
            };
            continue;
          }
          if (m.message && !(m.message.type === "attachment" && m.message.attachment.type === "hook_blocking_error")) {
            yield {
              message: m.message
            };
          }
          if (m.blockingError) {
            yield {
              message: createAttachmentMessage({
                type: "hook_blocking_error",
                hookName: `PostToolUseFailure:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUseFailure",
                blockingError: m.blockingError
              })
            };
          }
          if (m.additionalContexts && m.additionalContexts.length > 0) {
            yield {
              message: createAttachmentMessage({
                type: "hook_additional_context",
                content: m.additionalContexts,
                hookName: `PostToolUseFailure:${t.name}`,
                toolUseID: n,
                hookEvent: "PostToolUseFailure"
              })
            };
          }
        } catch (f) {
          let h = Date.now() - d;
          logEvent("tengu_post_tool_failure_hook_error", {
            messageID: br(r),
            toolName: qi(t.name),
            isMcp: t.isMcp ?? false,
            duration: h,
            queryChainId: br(e.queryTracking?.chainId),
            queryDepth: e.queryTracking?.depth,
            ...(l && {
              mcpServerType: l
            }),
            ...(a && {
              requestId: br(a)
            })
          });
          yield {
            message: createAttachmentMessage({
              type: "hook_error_during_execution",
              content: awe(f),
              hookName: `PostToolUseFailure:${t.name}`,
              toolUseID: n,
              hookEvent: "PostToolUseFailure"
            })
          };
        }
      }
    } catch (p) {
      if (mg(p)) {
        if (e.abortController.signal.aborted) {
          logForDebugging("PostToolUseFailure hook cancelled (parent abort)");
        } else {
          logForDebugging("PostToolUseFailure hook timed out (per-hook abort)");
          logEvent("tengu_sdk_hook_callback_timeout", {
            hookEvent: "PostToolUseFailure",
            toolName: qi(t.name)
          });
        }
        return;
      }
      Oe($o(sr(p), "PostToolUseFailure hook dispatch failed"));
    }
  }
  async function gJt(e, t, n, r, o, s, i) {
    if (isNonDeniableTool(t)) {
      return {
        decision: {
          behavior: "allow",
          updatedInput: n
        },
        input: n
      };
    }
    let a = t.requiresUserInteraction?.();
    let l = r.requireCanUseTool;
    if (e?.behavior === "deny") {
      logForDebugging(`Hook denied tool use for ${t.name}`);
      return {
        decision: e,
        input: n
      };
    }
    if (e?.behavior !== "allow" && e?.behavior !== "ask") {
      return {
        decision: await o(t, n, r, s, i),
        input: n
      };
    }
    let c = e.behavior;
    let u = e.updatedInput ?? n;
    let d = a && e.updatedInput !== undefined;
    if (c === "allow" && (a && !d || l)) {
      logForDebugging(`Hook approved tool use for ${t.name}, but canUseTool is required`);
      return {
        decision: await o(t, u, r, s, i),
        input: u
      };
    }
    let p = await checkRuleBasedPermissions(t, u, {
      ...r,
      toolUseId: i
    });