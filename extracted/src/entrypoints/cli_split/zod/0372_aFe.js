    if (p?.behavior === "deny") {
      logForDebugging(`Hook returned '${c}' for ${t.name}, but deny rule overrides: ${p.message}`);
      return {
        decision: p,
        input: u
      };
    }
    if (p?.behavior === "ask") {
      logForDebugging(`Hook returned '${c}' for ${t.name}, but ask rule/safety check requires full permission pipeline`);
      return {
        decision: await o(t, u, r, s, i),
        input: u
      };
    }
    if (c === "allow") {
      logForDebugging(d ? `Hook satisfied user interaction for ${t.name} via updatedInput` : `Hook approved tool use for ${t.name}, bypassing permission prompt`);
      return {
        decision: e,
        input: u
      };
    }
    return {
      decision: await o(t, u, r, s, i, e),
      input: u
    };
  }
  async function* yJt(e, t, n, r, o, s, i, a) {
    if (isNonDeniableTool(t)) {
      return;
    }
    if (e.options.bareFork) {
      return;
    }
    let l = Date.now();
    let c;
    let u = false;
    try {
      for await (let d of executePreToolHooks(t.name, r, n, e, getToolPermissionContext(e).mode, e.abortController.signal)) {
        try {
          if (d.message && !(d.message.type === "attachment" && d.message.attachment.type === "hook_blocking_error")) {
            yield {
              type: "message",
              message: {
                message: d.message
              }
            };
          }
          if (d.blockingError) {
            u = true;
            let p = getPreToolHookBlockingMessage(`PreToolUse:${t.name}`, d.blockingError);
            yield {
              type: "hookPermissionResult",
              hookPermissionResult: {
                behavior: "deny",
                message: p,
                decisionReason: {
                  type: "hook",
                  hookName: `PreToolUse:${t.name}`,
                  reason: p
                }
              }
            };
          }
          if (d.updatedInput !== undefined) {
            let p = t.inputSchema.safeParse(d.updatedInput);
            let m = p.success ? [] : p.error.issues.filter(f => f.code !== "unrecognized_keys");
            if (!p.success && m.length > 0) {
              let f = new Ghs.ZodError(m);
              let h = `PreToolUse hook for ${t.name} returned updatedInput that failed schema validation: ${o7e(t.name, f)}`;
              logForDebugging(h, {
                level: "warn"
              });
              u = true;
              yield {
                type: "hookPermissionResult",
                hookPermissionResult: {
                  behavior: "deny",
                  message: h,
                  decisionReason: {
                    type: "hook",
                    hookName: `PreToolUse:${t.name}`,
                    hookSource: d.hookSource,
                    reason: h
                  }
                }
              };
              continue;
            }
          }
          if (d.preventContinuation) {
            if (yield {
              type: "preventContinuation",
              shouldPreventContinuation: true
            }, d.stopReason) {
              yield {
                type: "stopReason",
                stopReason: d.stopReason
              };
            }
          }
          if (d.permissionBehavior !== undefined) {
            if (logForDebugging(`Hook result has permissionBehavior=${d.permissionBehavior}`), d.permissionBehavior === "defer") {
              c = d.hookSource || `PreToolUse:${t.name}`;
              continue;
            }
            if (d.permissionBehavior === "deny") {
              u = true;
            }
            let p = {
              type: "hook",
              hookName: `PreToolUse:${t.name}`,
              hookSource: d.hookSource,
              reason: d.hookPermissionDecisionReason
            };
            if (d.permissionBehavior === "allow") {
              yield {
                type: "hookPermissionResult",
                hookPermissionResult: {
                  behavior: "allow",
                  updatedInput: d.updatedInput,
                  decisionReason: p
                }
              };
            } else if (d.permissionBehavior === "ask") {
              yield {
                type: "hookPermissionResult",
                hookPermissionResult: {
                  behavior: "ask",
                  updatedInput: d.updatedInput,
                  message: d.hookPermissionDecisionReason || `Hook PreToolUse:${t.name} ${ZFo(d.permissionBehavior)} this tool`,
                  decisionReason: p
                }
              };
            } else {
              yield {
                type: "hookPermissionResult",
                hookPermissionResult: {
                  behavior: d.permissionBehavior,
                  message: d.hookPermissionDecisionReason || `Hook PreToolUse:${t.name} ${ZFo(d.permissionBehavior)} this tool`,
                  decisionReason: p
                }
              };
            }
          }
          if (d.updatedInput && d.permissionBehavior === undefined) {
            yield {
              type: "hookUpdatedInput",
              updatedInput: d.updatedInput
            };
          }
          if (d.additionalContexts && d.additionalContexts.length > 0) {
            yield {
              type: "additionalContext",
              message: {
                message: createAttachmentMessage({
                  type: "hook_additional_context",
                  content: d.additionalContexts,
                  hookName: `PreToolUse:${t.name}`,
                  toolUseID: r,
                  hookEvent: "PreToolUse"
                })
              }
            };
          }
          if (e.abortController.signal.aborted) {
            logEvent("tengu_pre_tool_hooks_cancelled", {
              toolName: qi(t.name),
              queryChainId: br(e.queryTracking?.chainId),
              queryDepth: e.queryTracking?.depth
            });
            yield {
              type: "message",
              message: {
                message: createAttachmentMessage({
                  type: "hook_cancelled",
                  hookName: `PreToolUse:${t.name}`,
                  toolUseID: r,
                  hookEvent: "PreToolUse"
                })
              }
            };
            yield {
              type: "stop"
            };
            return;
          }
        } catch (p) {
          Oe(p);
          let m = Date.now() - l;
          logEvent("tengu_pre_tool_hook_error", {
            messageID: br(o),
            toolName: qi(t.name),
            isMcp: t.isMcp ?? false,
            duration: m,
            queryChainId: br(e.queryTracking?.chainId),
            queryDepth: e.queryTracking?.depth,
            ...(i && {
              mcpServerType: i
            }),
            ...(s && {
              requestId: br(s)
            })
          });
          yield {
            type: "message",
            message: {
              message: createAttachmentMessage({
                type: "hook_error_during_execution",
                content: awe(p),
                hookName: `PreToolUse:${t.name}`,
                toolUseID: r,
                hookEvent: "PreToolUse"
              })
            }
          };
          yield {
            type: "stop"
          };
        }
      }
    } catch (d) {
      if (mg(d)) {
        if (e.abortController.signal.aborted) {
          logForDebugging("PreToolUse hook cancelled (parent abort)");
        } else {
          logForDebugging("PreToolUse hook timed out (per-hook abort)");
          logEvent("tengu_sdk_hook_callback_timeout", {
            hookEvent: "PreToolUse",
            toolName: qi(t.name)
          });
        }
      } else {
        Oe($o(sr(d), "PreToolUse hook dispatch failed"));
      }
      yield {
        type: "stop"
      };
      return;
    }
    if (c && !u) {
      yield {
        type: "defer",
        hookName: c
      };
    }
  }
  var tnr = __lazy(() => {
    Ot();
    Gu();
    rR();
    Sl();
    je();
    dt();
    Sp();
    Rn();
    oy();
    mJt();
  });
  function aFe(e = null, t) {
    if (e) {
      t?.(e);
    }
    return {
      current: e,
      onLatch: t
    };
  }
  function lOm() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_doorbell_agave", false) && isPolicyEnforced("enforce_web_search_mcp_isolation");
  }
  function GIl(e, t) {
    if (t.length === 0) {
      return;
    }
    let n = [...(e.exemptServers ?? nUo)];
    for (let r of t) {
      let o = Bl(r);
      if (!n.includes(o)) {
        n.push(o);
      }
    }
    e.exemptServers = n;
  }
  function VIl(e, t, n) {
    if (e === "WebSearch" || e === "WebFetch") {
      return "web";
    }
    if (e === "ReadMcpResourceTool" || e === "ReadMcpResourceDirTool" || e === "ListMcpResourcesTool") {
      return "connectors";
    }
    if (t) {
      let r = n.includes(Bl(t));
      if (uOm.test(Bl(t))) {
        return "web";
      }
      let o = TI(e)?.toolName ?? e;
      if (r && cOm.vZc(o)) {
        return "web";
      }
      if (!r) {
        return "connectors";
      }
    }
    return null;
  }
  function zIl(e, t = nUo) {
    return VIl(e.name, cmt(e), t);
  }
  function TJt(e, t, n = nUo) {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_doorbell_agave", false)) {
      return null;
    }
    let r = new Map(t.map(o => [o.name, o]));
    for (let o of e) {
      if (o.type !== "assistant") {
        continue;
      }
      let s = o.message.content;
      if (!Array.isArray(s)) {
        continue;
      }
      for (let i of s) {
        if (i.type !== "tool_use") {
          continue;
        }
        let a = r.get(i.name);
        let l = a ? zIl(a, n) : VIl(i.name, i.name.startsWith("mcp__") ? i.name.split("__")[1] : undefined, n);
        if (l !== null) {
          return l;
        }
      }
    }
    return null;
  }
  function dOm(e) {
    return e === "web" ? "Connectors are unavailable in this session under your organization's web search / connector isolation policy. Start a new session to use connectors." : "Web search, web fetch, and browser tools are unavailable in this session under your organization's web search / connector isolation policy. Do not attempt to reach any external URL via another tool (curl, bash, the browser, or otherwise) \u2014 this policy blocks all outbound web access while connector data is in context. Start a new session to use web tools.";
  }
  function EJt(e, t) {
    let n = t.isolationLatch;
    if (!n || !lOm()) {
      return qIl;
    }
    let r = zIl(e, n.exemptServers);
    if (!r) {
      return qIl;
    }
    let o = n.current;
    if (o && o !== r) {
      return {
        denyMessage: dOm(o),
        classifiedAs: r,
        activeLatch: o
      };
    }
    if (!o) {
      n.current = r;
      n.onLatch?.(r);
    }
    return {
      denyMessage: null,
      classifiedAs: r,
      activeLatch: r
    };
  }
  var nUo;
  var cOm;
  var uOm;
  var qIl;
  var s7e = __lazy(() => {
    N6e();
    EX();
    Hdt();
    $n();
    EI();
    Kc();
    nUo = ["cowork", "workspace", "session-info", "mcp-registry", "plugins", "scheduled-tasks", "dispatch", "ide"];
    cOm = new Set(["web_fetch", "web_search"]);
    uOm = /^(?:claude[-_](?:for|in)[-_]chrome|claude[-_]preview)$/i;
    qIl = {
      denyMessage: null,
      classifiedAs: null,
      activeLatch: null
    };
  });
  function KIl(e, t) {
    let n = e.timeout;
    return typeof n === "number" && n > 0 ? n : t;
  }
  function YIl(e, t) {
    if (e.name === "Bash" || e.name === "PowerShell") {
      return KIl(t, fMe());
    }
    if (e.name === "TaskOutput") {
      return KIl(t, 30000);
    }
    if (pOm.vZc(e.name)) {
      return 1e4;
    }
    return;
  }
  var pOm;
  var JIl = __lazy(() => {
    pOm = new Set(["Read", "Write", "Edit", "Glob", "Grep", "NotebookEdit", "TodoWrite", "TaskCreate", "TaskGet", "TaskList", "TaskStop", "TaskUpdate"]);
  });
  function XIl(e, t) {
    return {
      error: t
    };
  }
  function rUo(e, t, n, r, o) {
    let s = {};
    let i = [];
    let a = [...t.options.tools, ...e];
    for (let l of e) {
      s[l.name] = mOm(l, t, n, r, i, a, o);
    }
    return s;
  }
  function mOm(e, t, n, r, o, s, i) {
    let a = async (l, c) => {
      let u = c?.toolUseID ?? `repl_${QIl.randomUUID()}`;
      let d = h => (o.push({
        id: u,
        name: e.name,
        input: l
      }), i?.({
        type: "progress",
        toolUseID: u,
        data: {
          type: "repl_tool_call",
          toolName: e.name,
          toolInput: l,
          toolUseId: u,
          phase: "error",
          error: h
        }
      }), XIl(e.name, h));
      let p = (h, g) => i?.({
        type: "progress",
        toolUseID: u,
        data: {
          type: "repl_tool_call",
          toolName: e.name,
          toolInput: h,
          toolUseId: u,
          phase: "executing",
          nativeTimeoutMs: g
        }
      });
      i?.({
        type: "progress",
        toolUseID: u,
        data: {
          type: "repl_tool_call",
          toolName: e.name,
          toolInput: l,
          toolUseId: u,
          phase: "start"
        }
      });
      let m = l;
      let f;
      try {
        let h = e.inputSchema.safeParse(l);
        if (!h.success) {
          return d(o7e(e.name, h.error));
        }
        let g = h.data;
        let y = EJt(e, t);
        if (y.denyMessage) {
          logEvent("tengu_tool_use_isolation_latch_denied", {
            toolName: qi(e.name),
            toolUseID: u,
            isMcp: e.isMcp ?? false,
            isolationLatch: y.activeLatch == null ? undefined : y.activeLatch,
            isolationClassifiedAs: y.classifiedAs == null ? undefined : y.classifiedAs,
            replInnerCall: true
          });
          return d(y.denyMessage);
        }
        let _ = g;
        let b;
        let S;
        for await (let P of yJt(t, e, g, u, r.message.id, r.requestId, undefined, undefined)) {
          if (P.type === "hookPermissionResult") {
            b = P.hookPermissionResult;
          }
          if (P.type === "hookUpdatedInput") {
            _ = P.updatedInput;
          }
          if (P.type === "stopReason") {
            S = P.stopReason;
          }
          if (P.type === "stop") {
            return d(S ?? "Blocked by PreToolUse hook");
          }
        }
        let E = {
          ...t,
          options: {
            ...t.options,
            tools: s
          },
          messages: [...t.messages, ...o.map(P => ST({
            content: [{
              type: "tool_use",
              id: P.id,
              name: P.name,
              input: P.input
            }],
            isVirtual: true
          }))]
        };
        let C = await gJt(b, e, _, E, n, r, u);
        let x = C.decision;
        if (_ = C.input, x.behavior !== "allow") {
          t.onPermissionDenial?.(e, u, _);
          let P = x.behavior === "deny" ? x.message ?? "Permission denied" : "Permission denied";
          return d(`Permission denied for ${e.name}: ${P}`);
        }
        if (m = x.updatedInput ?? _, e.name === "Bash" && m && typeof m === "object" && "_simulatedSedEdit" in m) {
          let {
            _simulatedSedEdit: P,
            ...F
          } = m;
          m = F;
        }
        let A = YIl(e, m);
        p(m, A);
        logEvent("tengu_repl_inner_executing", {
          toolName: qi(e.name),
          nativeTimeoutMs: A,
          isMcp: e.isMcp ?? false
        });
        f = Date.now();
        let k = await e.call(m, {
          ...t,
          toolUseId: u,
          userModified: x.userModified ?? false,
          fileReadingLimits: {
            maxTokens: 1 / 0,
            maxSizeBytes: 268435456
          },
          globLimits: {
            maxResults: 25000
          }
        }, n, r);
        let I = Date.now() - f;
        p(m, undefined);
        let O = false;
        for await (let P of fJt(t, e, u, r.message.id, m, k.data, r.requestId, undefined, undefined, I)) {
          if (O = true, "updatedToolOutput" in P && e.outputSchema?.safeParse(P.updatedToolOutput)?.success !== false) {
            k.data = P.updatedToolOutput;
          }
        }
        if (O) {
          enr(e.name, u, m, t.readFileState);
        }
        let M = k.data;
        if (e.isMcp && Array.isArray(k.data)) {
          let P = k.data.filter(F => F != null && typeof F === "object" && "type" in F && F.type === "text" && "text" in F && typeof F.text === "string").map(F => F.text);
          if (P.length === k.data.length && P.length > 0) {
            let F = P.join(`
`);
            try {
              M = qt(F);
            } catch {
              M = F;
            }
          }
        }
        o.push({
          id: u,
          name: e.name,
          input: m
        });
        i?.({
          type: "progress",
          toolUseID: u,
          data: {
            type: "repl_tool_call",
            toolName: e.name,
            toolInput: m,
            toolUseId: u,
            phase: "complete",
            result: M
          }
        });
        let L = M;
        if (L != null && typeof L === "object" && L.file != null && typeof L.file === "object" && typeof L.file.base64 === "string" && L.file.base64.length > 0) {
          let P = L.file.base64.length;
          if (L.type === "image" && typeof L.file.type === "string") {
            return {
              ...L,
              file: {
                ...L.file,
                base64: `[${P} base64 chars \u2014 rendered as image in REPL result]`
              }
            };
          }
          if (L.type === "pdf") {
            return {
              ...L,
              file: {
                ...L.file,
                base64: `[${P} base64 chars \u2014 rendered as document in REPL result]`
              }
            };
          }
        }
        return M;
      } catch (h) {
        let g = awe(h);
        let y = mg(h);
        if (f !== undefined) {
          p(m, undefined);
        }
        for await (let _ of hJt(t, e, u, r.message.id, m, g, y, r.requestId, undefined, undefined, f !== undefined ? Date.now() - f : undefined)) {
          ;
        }
        if (i?.({
          type: "progress",
          toolUseID: u,
          data: {
            type: "repl_tool_call",
            toolName: e.name,
            toolInput: m,
            toolUseId: u,
            phase: "error",
            error: g
          }
        }), e.name === "Bash" && h instanceof RN && h.hadSandboxViolation && l?.dangerouslyDisableSandbox !== true && SandboxManager.isSandboxingEnabled() && SandboxManager.areUnsandboxedCommandsAllowed()) {
          logForDebugging("REPL Bash sandbox violation \u2014 auto-retrying unsandboxed");
          return a({
            ...l,
            dangerouslyDisableSandbox: true,
            ...false
          }, {
            toolUseID: u
          });
        }
        o.push({
          id: u,
          name: e.name,
          input: m
        });
        return XIl(e.name, g);
      }
    };
    return a;
  }
  var QIl;
  var ZIl = __lazy(() => {
    Ot();
    Gu();
    QFo();
    tnr();
    s7e();
    je();
    dt();
    ro();
    Th();
    mJt();
    JIl();
    QIl = require("crypto");
  });
  function hOm(e) {
    let t = [];
    let n = [];
    let r = 0;
    function o(i, a) {
      if (r >= 52428800) {
        return;
      }
      if (r += a.length, i.push(a), r >= 52428800) {
        i.push("[console output truncated at 50MB]");
      }
    }
    function s(i) {
      return i.map(a => {
        if (typeof a === "string") {
          return a;
        }
        try {
          return e.stringify(a, null, 2);
        } catch {
          return e.toStr(a);
        }
      }).join(" ");
    }
    return {
      log: (...i) => o(t, s(i)),
      info: (...i) => o(t, s(i)),
      debug: (...i) => o(t, s(i)),
      error: (...i) => o(n, s(i)),
      warn: (...i) => o(n, s(i)),
      getStdout: () => t.join(`
`),
      getStderr: () => n.join(`
`),
      clear: () => {
        t.length = 0;
        n.length = 0;
        r = 0;
      }
    };
  }
  function CJt(e) {
    return typeof e === "object" && e !== null && rPl.vZc(e);
  }
  function PS(e, t, n) {
    try {
      Object.defineProperty(e, t, {
        value: n,
        writable: true,
        enumerable: true,
        configurable: true
      });
    } catch {
      throw new wJt(t);
    }
  }
  function oPl(e) {
    let t = new Set([...gOm, ...nPl, ...e.toolWrapperNames]);
    for (let n of t) {
      let r = Object.getOwnPropertyDescriptor(e.vmContext, n);
      if (r && !r.configurable) {
        return n;
      }
    }
    return null;
  }
  function vJt(e) {
    Object.setPrototypeOf(e, null);
    try {
      delete e.constructor;
      delete e.prototype;
    } catch {}
    return e;
  }
  function yOm(e) {
    let t = i7e.runInContext(`(() => {
      // Capture intrinsics in closure NOW (literal-eval time, pre-user-code).
      // Global identifiers inside these function bodies resolve at CALL time
      // via globalThis \u2014 hardenVMIntrinsics freezes the String/Object
      // constructor OBJECTS but the globalThis bindings stay writable, so VM
      // code can reassign globalThis.String and a call-time lookup would use
      // it (same convention as createVMClone in vmHardening.ts). The
      // value-captured members below (Err/stringify/parse/toStr/exotics) are
      // immune by construction.
      const _String = String, _keys = Object.keys,
            _defineProperty = Object.defineProperty, _isArray = Array.isArray
      // Single error-message extractor for EVERY catch in this literal
      // (also exported as errMsg). Read .message ONCE \u2014 a stateful accessor
      // can return a string to a typeof check and a hostile VM value to a
      // re-read, smuggling a non-string into {error} objects that cross to
      // the host. String() fallback via the captured intrinsic; never
      // throws ('<unprintable thrown value>' for poison getters), so a
      // throwing getter can't turn an {error} return into a raw rejection.
      const _errStr = (e) => {
        try {
          const m = e?.message
          return typeof m === 'string' ? m : _String(e)
        } catch {
          return '<unprintable thrown value>'
        }
      }
      return {
      arr: () => [],
      obj: () => ({}),
      wrap: (hostFn, cloneFn) => (input) => {
        const p = (async () => {
          try { return cloneFn(await hostFn(input)) }
          catch (e) {
            if (e?.name === 'ReplayCacheExhausted') throw e
            return { error: _errStr(e) }
          }
        })()
        p.catch(() => {})
        return p
      },
      wrapN: (hostFn, cloneFn) => (...args) => {
        const p = (async () => {
          try { return cloneFn(await hostFn(...args)) }
          catch (e) {
            if (e?.name === 'ReplayCacheExhausted') throw e
            return { error: _errStr(e) }
          }
        })()
        p.catch(() => {})
        return p
      },
      wrapPropagate: (hostFn, cloneFn, Err) => (input) => {
        const p = (async () => {
          try { return cloneFn(await hostFn(input)) }
          catch (e) {
            const err = new Err(_errStr(e))
            // Read .name once for the same stateful-accessor reason.
            const n = e?.name
            if (typeof n === 'string') {
              _defineProperty(err, 'name', { value: n, configurable: true, writable: true })
            }
            throw err
          }
        })()
        p.catch(() => {})
        return p
      },
      callVM: (vmFn, cloneFn) => async (input) => ({__proto__: null, v: cloneFn(await vmFn(input))}),
      resolveDeep: async (v, cloneFn) => {
        // This catch's return is the one resolveDeep exit that bypasses
        // cloneFn, so the {error} value MUST be a primitive \u2014 _errStr
        // guarantees a string, keeping raw VM objects from crossing the
        // boundary by identity.
        try { v = await v } catch (e) { return {__proto__: null, v: { error: _errStr(e) }} }
        if (v !== null && typeof v === 'object' && !_isArray(v)) {
          try {
            for (const k of _keys(v)) {
              try {
                const val = v[k]
                if (val === null || typeof val !== 'object' || typeof val.then !== 'function') continue
                _defineProperty(v, k, { value: await val, writable: true, enumerable: true, configurable: true })
              } catch (e) {
                _defineProperty(v, k, { value: { error: _errStr(e) }, writable: true, enumerable: true, configurable: true })
              }
            }
          } catch {}
        }
        try { return {__proto__: null, v: cloneFn(v)} } catch { return {__proto__: null, v: undefined} }
      },
      awaitVM: async (v) => v,
      exotics: new Set([
        Date, Map, Set, WeakMap, WeakSet, RegExp, Promise,
        Error, EvalError, RangeError, ReferenceError, SyntaxError, TypeError, URIError, AggregateError,
        ArrayBuffer, SharedArrayBuffer, DataView,
        Int8Array, Uint8Array, Uint8ClampedArray, Int16Array, Uint16Array,
        Int32Array, Uint32Array, Float32Array, Float64Array, BigInt64Array, BigUint64Array,
        ...(typeof URL !== 'undefined' ? [URL] : []),
      ].map(C => C.prototype)),
      Err: Error,
      stringify: JSON.stringify,
      parse: JSON.parse,
      toStr: String,
      errMsg: _errStr,
      }
    })()`, e);
    function n(a) {
      let l;
      try {
        l = t.errMsg(a);
      } catch {
        return "<unprintable thrown value>";
      }
      return typeof l === "string" ? l : "<unprintable thrown value>";
    }
    function r(a, l = new WeakMap(), c = true) {
      if (typeof a === "function") {
        return;
      }
      if (a === null || typeof a !== "object") {
        return a;
      }
      if (oUo.types.isProxy(a)) {
        return;
      }
      let u = l.get(a);
      if (u !== undefined) {
        return u;
      }
      if (!Object.hasOwn(a, "then") && !Object.hasOwn(a, "toJSON") && !Object.hasOwn(a, "toString") && !Object.hasOwn(a, "valueOf") && !Object.hasOwn(a, Symbol.toPrimitive) && t.exotics.vZc(Object.getPrototypeOf(a))) {
        if (c) {
          try {
            Object.preventExtensions(a);
          } catch {
            return;
          }
        }
        return a;
      }
      if (Array.isArray(a)) {
        let p = t.arr();
        l.set(a, p);
        let m = Number.isSafeInteger(a.length) ? a.length : 0;
        let f = Math.min(m, 4096);
        for (let h = 0; h < f; h++) {
          let g = Object.getOwnPropertyDescriptor(a, h);
          p[h] = r(g && "value" in g ? g.value : undefined, l, c);
        }
        p.length = m;
        return p;
      }
      let d = t.obj();
      l.set(a, d);
      for (let p of Object.keys(a)) {
        let m = Object.getOwnPropertyDescriptor(a, p);
        Object.defineProperty(d, p, {
          value: r(m && "value" in m ? m.value : undefined, l, c),
          writable: true,
          enumerable: true,
          configurable: true
        });
      }
      return d;
    }
    let o = new WeakSet();
    function s(a) {
      o.add(a);
      return a;
    }
    function i(a) {
      throw new t.Err(n(a));
    }
    return {
      fn: a => vJt((...l) => {
        try {
          return a(...l);
        } catch (c) {
          i(c);
        }
      }),
      clone: r,
      throwVM: a => {
        throw new t.Err(a);
      },
      stringify: t.stringify,
      parse: t.parse,
      toStr: t.toStr,
      errMsg: n,
      asyncData: a => {
        let l = vJt(c => a(c));
        return s(t.wrap(l, r));
      },
      asyncDataN: a => {
        let l = vJt((...c) => a(...c));
        return s(t.wrapN(l, r));
      },
      asyncDataPropagate: a => {
        let l = vJt(c => a(c));
        return s(t.wrapPropagate(l, r, t.Err));
      },
      asyncDataVM: a => {
        let l = u => r(u, undefined, false);
        let c = t.wrap(a, r);
        return s(vJt(u => {
          try {
            return c(l(u));
          } catch (d) {
            i(d);
          }
        }));
      },
      hostCallVM: a => {
        let l = t.callVM(a, r);
        return c => l(r(c));
      },
      resolveDeep: a => t.resolveDeep(a, r),
      awaitVM: t.awaitVM,
      isSealedAsync: a => typeof a === "function" && o.vZc(a)
    };
  }
  function rnr(e, t) {
    let n = Object.getOwnPropertyDescriptor(e, t);
    return n && "value" in n ? n.value : undefined;
  }
  function sPl(e, t, n, r, o, s, i, a, l) {
    let c = {
      __proto__: null,
      log: t.fn(n.log),
      info: t.fn(n.info),
      debug: t.fn(n.debug),
      error: t.fn(n.error),
      warn: t.fn(n.warn)
    };
    PS(e, "console", c);
    for (let [p, m] of Object.entries(r)) {
      PS(e, p, t.asyncData(m));
    }
    for (let [p, m] of Object.entries(o)) {
      PS(e, p, t.asyncDataN(m));
    }
    let u = i7e.runInContext('(f) => { try { if (typeof f === "function") f() } catch {} }', e);
    PS(e, "setTimeout", t.fn((p, m) => {
      if (typeof p !== "function") {
        return 0;
      }
      let f = Number(setTimeout(() => u(p), typeof m === "number" ? m : undefined));
      a.add(f);
      return f;
    }));
    PS(e, "clearTimeout", t.fn(p => {
      if (typeof p !== "number") {
        return;
      }
      clearTimeout(p);
      a.delete(p);
    }));
    PS(e, "setInterval", t.fn((p, m) => {
      if (typeof p !== "function") {
        return 0;
      }
      let f = Number(setInterval(() => u(p), typeof m === "number" ? m : undefined));
      a.add(f);
      return f;
    }));
    PS(e, "clearInterval", t.fn(p => {
      if (typeof p !== "number") {
        return;
      }
      clearInterval(p);
      a.delete(p);
    }));
    PS(e, "atob", t.fn(p => atob(t.toStr(p))));
    PS(e, "btoa", t.fn(p => btoa(t.toStr(p))));
    PS(e, "shQuote", t.fn(p => `'${t.toStr(p).replaceAll("'", "'\\''")}'`));
    let d = t.fn((p, m, f, h, g) => {
      if (typeof p !== "string" || !fOm.test(p)) {
        t.throwVM(`registerTool: name must match ^[a-zA-Z0-9_-]{1,111}$ (wire name is prefixed with 'eval_registered__'), got ${typeof p}: ${t.toStr(p).slice(0, 50)}`);
      }
      if (i.vZc(p) && !s.vZc(p)) {
        t.throwVM(`registerTool: '${p}' collides with a built-in global; choose a different name`);
      }
      let y = t.parse(t.stringify(f) ?? "null");
      if (y === null || typeof y !== "object" || Array.isArray(y)) {
        t.throwVM(`registerTool: schema must be a JSON-serializable object, got ${y === null ? "null" : Array.isArray(y) ? "array" : typeof y}`);
      }
      let {
        displayName: _
      } = iPl(g, ["displayName"]);
      let b = t.toStr(m);
      let S = _ == null ? undefined : t.toStr(_);
      PS(e, p, t.asyncDataVM(h));
      s.set(p, {
        name: p,
        description: b,
        schema: y,
        handler: t.hostCallVM(h),
        displayName: S
      });
    });
    PS(e, "registerTool", d);
    PS(e, "unregisterTool", t.fn(p => {
      if (!s.vZc(p)) {
        return false;
      }
      s.delete(p);
      try {
        delete e[p];
      } catch {
        throw new wJt(p);
      }
      return true;
    }));
    PS(e, "listTools", t.fn(() => t.clone([...s.keys()])));
    vOm(e, t, l, c.log);
    PS(e, "getTool", t.fn(p => {
      let m = s.get(p);
      return m ? t.clone({
        name: m.name,
        description: m.description,
        schema: m.schema,
        displayName: m.displayName
      }) : undefined;
    }));
  }
  function iPl(e, t) {
    let n = {};
    if (e === null || typeof e !== "object" || oUo.types.isProxy(e)) {
      return n;
    }
    for (let r of t) {
      let o = Object.getOwnPropertyDescriptor(e, r);
      if (!o || !("value" in o)) {
        continue;
      }
      let s = o.value;
      if (typeof s === "string" || typeof s === "number" || typeof s === "boolean") {
        n[r] = s;
      }
    }
    return n;
  }
  function vOm(e, t, n, r) {
    function o(u) {
      let d = t.toStr(u);
      return nnr.isAbsolute(d) ? d : nnr.resolve(n.cwd, d);
    }
    function s(u, d) {
      let p = rnr(e, u);
      if (typeof p !== "function" || !t.isSealedAsync(p)) {
        t.throwVM(`${u} tool is not available in this REPL context`);
      }
      return p(d);
    }
    function i(u) {
      return u !== null && typeof u === "object" ? u : {};
    }
    function a(u, d) {
      return typeof u[d] === "string" ? u[d] : "";
    }
    function l(u) {
      if (u !== undefined) {
        return {
          path: o(u)
        };
      }
      return n.cwd !== Nt() ? {
        path: n.cwd
      } : {};
    }
    async function c(u, d) {
      let p = Pu();
      let m = n.cwd === Nt() ? "" : p ? `cd ${wOm(n.cwd)} && ` : `Set-Location -LiteralPath ${Xct(n.cwd, "the REPL working directory")}; `;
      let f = i(await s(p ? "Bash" : "PowerShell", {
        command: m + u,
        ...(typeof d === "number" && {
          timeout: d
        })
      }));
      let h = a(f, "stdout");
      let g = a(f, "stderr");
      let y = a(f, "error");
      return [h, g && `[stderr]
${g}`, y && `[error] ${y}`].filter(Boolean).join(`
`);
    }
    PS(e, "sh", t.asyncDataN((u, d) => c(t.toStr(u), d)));
    PS(e, "gh", t.asyncDataN(u => {
      let d = t.toStr(u).trim();
      let p = n.repo;
      if (p && !EOm.test(d)) {
        if (TOm.test(d)) {
          d = `${d} -R ${p}`;
        }
        d = d.replaceAll("repos/:owner/:repo", `repos/${p}`);
      }
      return c(`gh ${d}`);
    }));
    PS(e, "cat", t.asyncDataN(async (u, d, p) => {
      let m = i(await s("Read", {
        file_path: o(u),
        ...(typeof d === "number" && {
          offset: d
        }),
        ...(typeof p === "number" && {
          limit: p
        })
      }));
      let f = i(m.file);
      return a(f, "content") || a(m, "error");
    }));
    PS(e, "rg", t.asyncDataN(async (u, d, p) => {
      let m = iPl(p, SOm);
      let f = i(await s("Grep", {
        pattern: t.toStr(u),
        output_mode: "content",
        "-n": true,
        ...l(d),
        ...(m.A !== undefined && {
          "-A": m.A
        }),
        ...(m.B !== undefined && {
          "-B": m.B
        }),
        ...(m.C !== undefined && {
          "-C": m.C
        }),
        ...(m.glob !== undefined && {
          glob: m.glob
        }),
        ...(m.head !== undefined && {
          head_limit: m.head
        }),
        ...(m.type !== undefined && {
          type: m.type
        }),
        ...(m.i !== undefined && {
          "-i": m.i
        })
      }));
      return a(f, "content") || a(f, "error");
    }));
    PS(e, "rgf", t.asyncDataN(async (u, d, p) => {
      let m = i(await s("Grep", {
        pattern: t.toStr(u),
        output_mode: "files_with_matches",
        ...l(d),
        ...(typeof p === "string" && {
          glob: p
        })
      }));
      return Array.isArray(m.filenames) ? m.filenames : [];
    }));
    PS(e, "gl", t.asyncDataN(async (u, d) => {
      let p = i(await s("Glob", {
        pattern: t.toStr(u),
        ...l(d)
      }));
      return Array.isArray(p.filenames) ? p.filenames : [];
    }));
    PS(e, "put", t.asyncDataN(async (u, d) => {
      let p = i(await s("Write", {
        file_path: o(u),
        content: t.toStr(d)
      }));
      let m = a(p, "error");
      return m ? `[error] ${m}` : "";
    }));
    PS(e, "chdir", t.fn(u => {
      n.cwd = o(u);
    }));
    PS(e, "log", r);
    PS(e, "str", t.fn((u, d, p) => {
      if (typeof d === "function") {
        t.throwVM("str: function replacer not supported");
      }
      return t.stringify(u, d, p);
    }));
  }
  function wOm(e) {
    return `'${e.replaceAll("'", "'\\''")}'`;
  }
  function onr(e, t) {
    if (e.helperState.cwd = Nt(), t !== undefined) {
      e.helperState.repo = t;
    }
    PS(e.vmContext, "REPO", e.helperState.repo ?? "");
    PS(e.vmContext, "o", e.sealers.clone({}));
  }
  function snr(e, t) {
    let n = t === undefined ? rnr(e.vmContext, "o") : t;
    return e.sealers.resolveDeep(n);
  }
  function inr(e, t, n, r, o) {
    let s = new Map();
    let i = new Set();
    let a = new Set();
    let l = {
      cwd: Nt(),
      repo: undefined
    };
    let c = i7e.createContext({
      __proto__: null
    }, {
      codeGeneration: {
        strings: true,
        wasm: false
      }
    });
    let u = yOm(c);
    let d = hOm(u);
    i7e.runInContext(`Promise.prototype.toString = function () {
      throw new TypeError(
        "REPL: unawaited Promise coerced to string. Shorthand results used " +
        "inline need 'await' \u2014 e.g. const c = await cat(f); put(f, c + s). " +
        "Auto-await applies only to o.* keys at return time.",
      )
    }`, c);
    WKe(c);
    let p = rUo(e.filter(f => !bl(f, "REPL")), t, n, r, o);
    let m = XFo(u.stringify, t, o);
    sPl(c, u, d, p, m, s, i, a, l);
    Object.keys(c).forEach(f => i.add(f));
    nPl.forEach(f => i.add(f));
    try {
      i7e.runInContext("Object.getOwnPropertyNames(globalThis)", c).forEach(h => i.add(h));
    } catch {
      ["JSON", "Array", "Object", "Promise", "globalThis"].forEach(f => i.add(f));
    }
    i.add("__proto__");
    return {
      vmContext: c,
      registeredTools: s,
      reservedGlobals: i,
      toolWrapperNames: new Set([...Object.keys(p), ...Object.keys(m)]),
      boundaryUuid: null,
      console: d,
      sealers: u,
      activeTimers: a,
      clearAllTimers: () => {
        for (let f of a) {
          clearTimeout(f);
        }
        a.clear();
      },
      replayLog: [],
      helperState: l
    };
  }
  function aPl(e, t, n, r, o, s) {
    let i = rUo(t.filter(l => !bl(l, "REPL")), n, r, o, s);
    let a = XFo(e.sealers.stringify, n, s);
    sPl(e.vmContext, e.sealers, e.console, i, a, e.registeredTools, e.reservedGlobals, e.activeTimers, e.helperState);
    for (let l of Object.keys(i)) {
      e.toolWrapperNames.add(l);
    }
    for (let l of Object.keys(a)) {
      e.toolWrapperNames.add(l);
    }
  }
  var nnr;
  var oUo;
  var i7e;
  var fOm;
  var nPl;
  var rPl;
  var wJt;
  var gOm;
  var SOm;
  var TOm;
  var EOm;
  var sUo = __lazy(() => {
    ci();
    vo();
    dt();
    _jt();
    Jf();
    swe();
    Fk();
    ZC();
    HIl();
    ZIl();
    nnr = require("path");
    oUo = require("util");
    i7e = __toESM(require("vm"));
    fOm = /^[a-zA-Z0-9_-]{1,111}$/;
    nPl = ["sh", "cat", "rg", "rgf", "gl", "put", "gh", "chdir", "log", "str", "o", "REPO"];
    rPl = new WeakSet();
    wJt = class wJt extends Po {
      key;
      constructor(e) {
        super(`REPL sandbox code made the global '${e}' non-configurable; the host cannot restore it`, "REPL sandbox pinned a managed global non-configurable");
        this.name = "VMContextPoisonedError";
        this.key = e;
        rPl.add(this);
      }
    };
    gOm = ["console", "setTimeout", "clearTimeout", "setInterval", "clearInterval", "atob", "btoa", "shQuote", "registerTool", "unregisterTool", "listTools", "getTool"];
    SOm = ["A", "B", "C", "glob", "head", "type", "i"];
    TOm = /^(pr|issue|run|workflow|release|label|cache)\b/;
    EOm = /(^|\s)(-R|--repo\b)/;
  });
  function aUo(e) {
    return Array.from(e.values()).filter(t => t.phase === "complete" || t.phase === "error").map(t => t.phase === "error" ? {
      kind: "err",
      toolName: t.toolName,
      error: t.error ?? ""
    } : {
      kind: "ok",
      toolName: t.toolName,
      result: t.result
    });
  }
  function cPl(e, t) {
    if (e === null || typeof e !== "object") {
      return "";
    }
    let n = e[t];
    return typeof n === "string" ? n : "";
  }
  function COm(e) {
    if (e.type !== "assistant" || e.isVirtual) {
      return [];
    }
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return [];
    }
    return t.filter(n => n.type === "tool_use" && n.name === "REPL").map(n => ({
      id: n.id,
      code: cPl(n.input, "code")
    }));
  }
  function ROm(e) {
    if (e.type !== "assistant" || !e.isVirtual) {
      return;
    }
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return;
    }
    let n = t[0];
    return n?.type === "tool_use" ? n.name : undefined;
  }
  function xOm(e, t) {
    if (e.type !== "user" || !e.isVirtual) {
      return;
    }
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return;
    }
    let r = n[0];
    if (r?.type !== "tool_result") {
      return;
    }
    return r.is_error ? {
      kind: "err",
      toolName: t,
      error: typeof r.content === "string" ? r.content : ""
    } : {
      kind: "ok",
      toolName: t,
      result: e.toolUseResult
    };
  }
  function kOm(e, t) {
    if (e.type !== "user" || e.isVirtual) {
      return;
    }
    let n = e.message.content;
    if (!Array.isArray(n)) {
      return;
    }
    if (!n.some(o => o.type === "tool_result" && o.tool_use_id === t)) {
      return;
    }
    return cPl(e.toolUseResult, "error").length > 0;
  }
  function anr(e) {
    let t = [];
    let n;
    let r = () => {
      if (!n) {
        return;
      }
      t.push({
        code: n.code,
        calls: n.calls,
        threw: n.threw
      });
      n = undefined;
    };
    for (let o of e) {
      if (o.type !== "assistant" && o.type !== "user") {
        continue;
      }
      if (o.isVirtual) {
        if (!n) {
          continue;
        }
        let i = ROm(o);
        if (i !== undefined) {
          n.pendingName = i;
          continue;
        }
        let a = n.pendingName;
        if (a === undefined) {
          continue;
        }
        let l = xOm(o, a);
        if (!l) {
          continue;
        }
        n.calls.push(l);
        n.pendingName = undefined;
        continue;
      }
      let s = COm(o);
      if (s.length > 0) {
        for (let i of s) {
          r();
          n = {
            replId: i.id,
            code: i.code,
            calls: [],
            threw: false,
            pendingName: undefined
          };
        }
        continue;
      }
      if (n) {
        let i = kOm(o, n.replId);
        if (i !== undefined) {
          n.threw = i;
        }
      }
    }
    r();
    return t;
  }
  function AOm(e) {
    return {
      error: e
    };
  }
  function POm(e, t) {
    let n = 0;
    let r = [];
    let o = l => {
      if (r.length < 100) {
        r.push(l);
      }
    };
    let s = l => {
      let c = e[n];
      if (!c) {
        throw new uPl(l, e.length);
      }
      if (n++, c.toolName !== l) {
        o(`position ${n - 1}: expected ${c.toolName}, invoked ${l}`);
      }
      return c;
    };
    let i = l => async function () {
      await new Promise(d => setImmediate(d));
      let u = s(l);
      return u.kind === "ok" ? u.result : AOm(u.error);
    };
    return {
      wrappers: Object.fromEntries(t.map(l => [l, i(l)])),
      diagnostics: () => ({
        consumed: n,
        total: e.length,
        drift: r
      })
    };
  }
  async function OOm(e, t) {
    let n = [...e.toolWrapperNames];
    let {
      wrappers: r,
      diagnostics: o
    } = POm(t.calls, n);
    let s = n.map(i => [i, rnr(e.vmContext, i)]);
    try {
      n.forEach(u => {
        PS(e.vmContext, u, e.sealers.asyncDataPropagate(r[u]));
      });
      onr(e);
      let i = Qtr(t.code);
      let l = new lPl.Script(i, {
        filename: "repl-replay.js",
        importModuleDynamically: () => {
          throw efe("import() is not available in REPL code.");
        }
      }).runInContext(e.vmContext, {
        timeout: 30000
      });
      await withTimeout(e.sealers.awaitVM(l).then(u => snr(e, Ztr(u))), 30000, `REPL replay timed out after ${30000}ms`);
      let c = o();
      if (t.threw) {
        return {
          kind: "drift",
          reason: "original threw, replay succeeded",
          consumed: c.consumed,
          total: c.total
        };
      }
      if (c.drift.length > 0 || c.consumed !== c.total) {
        return {
          kind: "drift",
          reason: c.drift[0] ?? `consumed ${c.consumed}/${c.total} cached calls`,
          consumed: c.consumed,
          total: c.total
        };
      }
      return {
        kind: "ok",
        consumed: c.consumed,
        total: c.total
      };
    } catch (i) {
      if (CJt(i)) {
        throw i;
      }
      let a = o();
      let l = e.sealers.errMsg(i);
      if (t.threw) {
        if (a.drift.length > 0 || a.consumed !== a.total) {
          return {
            kind: "drift",
            reason: a.drift[0] ?? `consumed ${a.consumed}/${a.total} before expected throw`,
            consumed: a.consumed,
            total: a.total
          };
        }
        return {
          kind: "ok",
          consumed: a.consumed,
          total: a.total
        };
      }
      return {
        kind: "threw",
        error: l
      };
    } finally {
      s.forEach(([i, a]) => {
        try {
          PS(e.vmContext, i, a);
        } catch {}
      });
      e.console.clear();
    }
  }
  async function dPl(e, t) {
    let n = [];
    for (let o of t) {
      let s = await OOm(e, o);
      if (n.push(s), s.kind !== "ok") {
        logForDebugging(`REPL replay ${s.kind} at block ${n.length}/${t.length}: ${"error" in s ? s.error : s.reason}`, {
          level: "warn"
        });
      }
    }
    let r = oPl(e);
    if (r !== null) {
      throw new wJt(r);
    }
    return n;
  }
  function pPl(e) {
    let t = Bn(e, s => s.kind === "ok");
    let n = Bn(e, s => s.kind === "drift");
    let r = Bn(e, s => s.kind === "threw");
    let o = r > 0 || n > 0 ? `${t}/${e.length} blocks replayed cleanly (${n} drifted, ${r} threw)` : `${t} blocks replayed`;
    return {
      ok: t,
      drifted: n,
      threw: r,
      summary: o
    };
  }
  var lPl;
  var uPl;
  var lUo = __lazy(() => {
    je();
    swe();
    ZC();
    YFo();
    sUo();
    lPl = __toESM(require("vm"));
    uPl = class uPl extends Error {
      constructor(e, t) {
        super(`REPL replay: ${e} invoked but only ${t} calls were cached. ` + "The replayed code is making more tool calls than the original \u2014 " + "likely nondeterminism (Date.now, Math.random) took a different branch.");
        this.name = "ReplayCacheExhausted";
      }
    };
  });
  function fPl(e, t) {
    return "";
  }
  function hPl(e, t) {
    let n = e.at(-1)?.data;
    return lFe.jsx(Vn, {
      children: lFe.jsx(Text, {
        dimColor: true,
        children: n ? `Running ${n.toolName}\u2026` : "Working\u2026"
      })
    });
  }
  function gPl() {
    return lFe.jsx(Vn, {
      children: lFe.jsx(Text, {
        color: "warning",
        children: "Rejected"
      })
    });
  }
  function yPl(e, t) {
    if (kpe()) {
      return lFe.jsx(mPl.Fragment, {});
    }
    return lFe.jsx(Vn, {
      children: lFe.jsx(Text, {
        color: "error",
        children: typeof e === "string" ? e : "Error"
      })
    });
  }
  var mPl;
  var lFe;
  var _Pl = __lazy(() => {
    Wl();
    et();
    mgt();
    mPl = __toESM(ot(), 1);
    lFe = __toESM(ie(), 1);
  });
  function DOm(e, t) {
    let n = jse(BEe(), t);
    let r = new Set(e.map(s => s.name));
    let o = e.filter(s => !bl(s, "Agent") && !bl(s, "REPL"));
    for (let s of n) {
      if (!r.vZc(s.name)) {
        o.push(s);
      }
    }
    return o;
  }
  function bPl(e, t) {
    if (typeof e === "string" && e.trim() !== "") {
      return e;
    }
    let n = UOm(e);
    if (n !== undefined) {
      return n;
    }
    try {
      return vPl.inspect(e, {
        colors: false,
        depth: t,
        customInspect: false
      });
    } catch {
      return "[non-serializable value]";
    }
  }
  function UOm(e) {
    try {
      if (e === null || typeof e !== "object" || Array.isArray(e) || e.constructor?.name !== "Object") {
        return;
      }
      let t = Object.entries(e);
      if (t.length === 0 || t.some(([n, r]) => typeof r !== "string" || FOm.vZc(n))) {
        return;
      }
      return t.map(([n, r]) => `${n}:
${r}`).join(`

`);
    } catch {
      return;
    }
  }
  function SPl(e) {
    let t = [];
    for (let n of e.values()) {
      if (n.phase === "start" || n.phase === "executing") {
        continue;
      }
      t.push(ST({
        content: [{
          type: "tool_use",
          id: n.toolUseId,
          name: n.toolName,
          input: n.toolInput
        }],
        isVirtual: true
      }));
      t.push(In({
        content: [{
          type: "tool_result",
          tool_use_id: n.toolUseId,
          content: n.phase === "error" ? n.error ?? "" : "",
          is_error: n.phase === "error"
        }],
        toolUseResult: n.result,
        isVirtual: true
      }));
    }
    return t;
  }
  function BOm(e, t) {
    let n = e.get(t.toolUseId);
    if (n) {
      n.phase = t.phase;
      n.result = t.result;
      n.error = t.error;
    } else {
      e.set(t.toolUseId, {
        toolUseId: t.toolUseId,
        toolName: t.toolName,
        toolInput: t.toolInput,
        phase: t.phase,
        result: t.result,
        error: t.error
      });
    }
  }
  function $Om(e) {
    let t = [];
    for (let n of e.values()) {
      if (n.phase !== "complete") {
        continue;
      }
      let r = n.result;
      if (r != null && typeof r === "object" && r.type === "image" && r.file != null && typeof r.file === "object" && typeof r.file.base64 === "string" && r.file.base64.length > 0 && typeof r.file.type === "string") {
        t.push({
          base64: r.file.base64,
          mediaType: r.file.type
        });
      }
    }
    return t.slice(0, 8);
  }
  function jOm(e) {
    let t = [];
    for (let n of e.values()) {
      if (n.phase !== "complete") {
        continue;
      }
      let r = n.result;
      if (r != null && typeof r === "object" && r.type === "pdf" && r.file != null && typeof r.file === "object" && typeof r.file.base64 === "string" && r.file.base64.length > 0) {
        t.push({
          base64: r.file.base64
        });
      }
    }
    return t.slice(0, 4);
  }
  function TPl() {
    let e = lpa()?.match(/trim(\d+)k/);
    return e ? parseInt(e[1], 10) * 1000 : 1e5;
  }
  function EPl(e, t, n, r, o) {
    if (CJt(e)) {
      throw t.clearAllTimers(), t.console.clear(), n.setReplContext(r, o()), new Po(`${e.message}. The REPL context was reset \u2014 rerun your code; ` + "global state (variables, registered tools) starts fresh.", "REPL context poisoned by non-configurable global; context reset");
    }
    throw e;
  }
  function WOm() {
    let e;
    return {
      promise: new Promise((n, r) => {
        e = r;
      }),
      reject: e
    };
  }
  function GOm(e, t) {
    let n = 0;
    let r = e;
    let o = 0;
    let s;
    let i = false;
    function a() {
      if (i || s !== undefined || n > 0) {
        return;
      }
      if (r <= 0) {
        i = true;
        t();
        return;
      }
      o = Date.now();
      s = setTimeout(() => {
        i = true;
        t();
      }, r);
      s.unref?.();
    }
    function l() {
      if (s === undefined) {
        return;
      }
      clearTimeout(s);
      s = undefined;
      r -= Date.now() - o;
    }
    return {
      start: a,
      onToolStart: () => {
        if (n++ === 0) {
          l();
        }
      },
      onToolEnd: () => {
        if (--n === 0) {
          a();
        }
      },
      cancel: () => {
        i = true;
        l();
      }
    };
  }
  function KOm(e) {
    let t = new Map();
    let n = (r, o) => {
      t.delete(r.toolUseId);
      e(r, o);
    };
    return {
      arm: r => {
        let o = t.get(r.toolUseId);
        if (o !== undefined) {
          clearTimeout(o);
          t.delete(r.toolUseId);
        }
        if (r.nativeTimeoutMs === undefined) {
          return;
        }
        let s = Math.ceil(r.nativeTimeoutMs * 1.5) + 5000;
        if (s >= 600000) {
          return;
        }
        let i = setTimeout(n, s, r, s);
        i.unref?.();
        t.set(r.toolUseId, i);
      },
      clear: r => {
        let o = t.get(r);
        if (o !== undefined) {
          clearTimeout(o);
          t.delete(r);
        }
      },
      cancel: () => {
        for (let r of t.values()) {
          clearTimeout(r);
        }
        t.clear();
      }
    };
  }
  function YOm(e) {
    return;
  }
  var vPl;
  var wPl;
  var MOm;
  var NOm;
  var FOm;
  var cUo;
  var CPl = __lazy(() => {
    Ot();
    Gu();
    ci();
    jM();
    Kp();
    Sl();
    je();
    dt();
    na();
    ro();
    Zn();
    swe();
    Sh();
    ZC();
    D6t();
    LIl();
    UIl();
    lUo();
    YFo();
    _Pl();
    sUo();
    vPl = require("util");
    wPl = __toESM(require("vm"));
    MOm = we(() => v.strictObject({
      code: v.string().describe("JavaScript code to execute. Supports top-level await. State persists across calls."),
      description: v.string().optional().describe('Clear, concise description of what this script does in active voice (5-10 words). E.g. "Trace upgrade message to its GrowthBook flag"'),
      timeout: v.number().optional().describe("Optional timeout in milliseconds (default 30000, max 600000)")
    }));
    NOm = we(() => v.object({
      code: v.string().describe("The code that was executed"),
      result: v.unknown().describe("Return value from the code execution"),
      stdout: v.string().describe("Captured console.log output"),
      stderr: v.string().describe("Captured console.error output"),
      error: v.string().optional().describe("Error message if execution failed"),
      registeredTools: v.array(v.string()).optional().describe("Names of tools registered during this execution"),
      images: v.array(v.object({
        base64: v.string(),
        mediaType: v.string()
      })).optional().describe("Images returned by inner Read calls \u2014 surfaced as image content blocks"),
      documents: v.array(v.object({
        base64: v.string()
      })).optional().describe("PDFs returned by inner Read calls \u2014 surfaced as document content blocks")
    }));
    FOm = new Set(["stdout", "stderr", "error", "result"]);
    cUo = Xs({
      name: "REPL",
      searchHint: "execute JavaScript with programmatic tool access",
      get maxResultSizeChars() {
        return TPl();
      },
      async prompt() {
        return MIl();
      },
      async description() {
        return NIl();
      },
      get inputSchema() {
        return MOm();
      },
      get outputSchema() {
        return NOm();
      },
      isEnabled() {
        return zk();
      },
      isConcurrencySafe() {
        return false;
      },
      isReadOnly() {
        return false;
      },
      toAutoClassifierInput(e) {
        return e.code;
      },
      async checkPermissions() {
        return {
          behavior: "allow"
        };
      },
      async call(e, t, n, r, o) {
        let s = t.agentId ?? "main";
        let i = t.getReplContexts()[s];
        let {
          code: a,
          timeout: l
        } = e;
        YOm(a);
        let c = Math.min(l ?? 30000, 600000);
        let u = createChildAbortController(t.abortController);
        let d = {
          ...t,
          abortController: u
        };
        let p = new Map();
        let m = WOm();
        let f = GOm(c, () => m.reject(Error(`REPL execution timed out after ${c}ms of script time (inner tool calls excluded). Script may still be running \u2014 avoid unbounded awaits.`)));
        let h = KOm((I, O) => {
          logEvent("tengu_repl_inner_watchdog_fired", {
            toolName: qi(I.toolName),
            watchdogMs: O,
            nativeTimeoutMs: I.nativeTimeoutMs
          });
          u.abort();
          m.reject(Error(`REPL inner tool call ${I.toolName} exceeded ${O}ms watchdog (native timeout ${I.nativeTimeoutMs ?? "unset"}). The call may be hung \u2014 try a shorter timeout on the tool itself.`));
        });
        let g = I => {
          if (I.type !== "progress") {
            o?.(I);
            return;
          }
          let O = I.data;
          switch (BOm(p, O), O.phase) {
            case "start":
              f.onToolStart();
              break;
            case "executing":
              h.arm(O);
              break;
            case "complete":
            case "error":
              h.clear(O.toolUseId);
              f.onToolEnd();
              break;
          }
          o?.(O.result === undefined ? I : {
            ...I,
            data: {
              ...O,
              result: undefined
            }
          });
        };
        let y;
        let _ = t.messages[0];
        let b = _ !== undefined && SS(_) ? _.uuid : null;
        let S = DOm(t.options.tools, getToolPermissionContext(t));
        let E = () => {
          let I = inr(S, d, n, r, g);
          I.boundaryUuid = b;
          I.helperState.repo = y?.helperState.repo;
          return I;
        };
        if (i && i.boundaryUuid === b) {
          y = i;
          y.console.clear();
          y.clearAllTimers();
          try {
            aPl(y, S, d, n, r, g);
          } catch (I) {
            EPl(I, y, t, s, E);
          }
        } else {
          i?.clearAllTimers();
          i?.console.clear();
          y = inr(S, d, n, r, g);
          y.boundaryUuid = b;
          y.helperState.repo = await getGithubRepo().catch(() => null);
          let I = t.replHydration ?? {
            kind: "fresh"
          };
          let O = I.kind === "fork" && i ? {
            kind: "fresh"
          } : I;
          try {
            let M = O.kind === "fork" ? O.log : O.kind === "resume" ? anr(t.messages) : [];
            if (M.length > 0) {
              let L = performance.now();
              let P = await dPl(y, M);
              let F = Math.round(performance.now() - L);
              let {
                summary: H
              } = pPl(P);
              if (logForDebugging(`REPL state hydrated from ${O.kind} in ${F}ms: ${H}`, {
                level: "info"
              }), O.kind === "resume") {
                y.replayLog = [...M];
              }
            }
          } catch (M) {
            if (CJt(M)) {
              y.clearAllTimers();
              y.console.clear();
              let L = y.helperState.repo;
              y = inr(S, d, n, r, g);
              y.boundaryUuid = b;
              y.helperState.repo = L;
              logForDebugging(`REPL hydration hit a poisoned context (global '${M.key}' pinned non-configurable by replayed code); starting fresh without hydration`, {
                level: "warn"
              });
            } else {
              logForDebugging(`REPL state hydration failed: ${y.sealers.errMsg(M)}`, {
                level: "warn"
              });
            }
          }
          y.clearAllTimers();
          t.setReplContext(s, y);
        }
        let {
          vmContext: C,
          registeredTools: x,
          console: A
        } = y;
        let k = new Set(x.keys());
        try {
          onr(y);
        } catch (I) {
          EPl(I, y, t, s, E);
        }
        try {
          let I = Qtr(a);
          let M = new wPl.Script(I, {
            filename: "repl-tool-code.js",
            importModuleDynamically: () => {
              throw efe("import() is not available in REPL code.");
            }
          }).runInContext(C, {
            timeout: c
          });
          let L = t.abortController.signal;
          let P = () => m.reject(Error("REPL execution interrupted"));
          if (L.aborted) {
            P();
          } else {
            L.addEventListener("abort", P, {
              once: true
            });
          }
          f.start();
          let F = setTimeout(Q => Q(Error(`REPL execution exceeded hard wall-clock limit of ${600000}ms. An inner tool call may be hung \u2014 try a shorter timeout on the tool itself, or split the work.`)), 600000, m.reject);
          F.unref?.();
          let {
            v: H
          } = await Promise.race([y.sealers.awaitVM(M).then(Q => snr(y, Ztr(Q))), m.promise]).finally(() => {
            clearTimeout(F);
            L.removeEventListener("abort", P);
          });
          let U = [...x.keys()].filter(Q => !k.vZc(Q));
          let N = $Om(p);
          let W = jOm(p);
          let j = Array.from(p.values()).filter(Q => Q.phase === "start" || Q.phase === "executing");
          let z = A.getStderr();
          let V = j.length ? (z ? z + `
` : "") + `\u26A0 ${j.length} tool call(s) still pending at script end \u2014 ` + `results discarded: ${j.map(Q => Q.toolName).join(", ")}. Add 'await'.` : z;
          let K = {
            code: a,
            result: H,
            stdout: A.getStdout(),
            stderr: V,
            ...(U.length > 0 && {
              registeredTools: U
            }),
            ...(N.length > 0 && {
              images: N
            }),
            ...(W.length > 0 && {
              documents: W
            })
          };
          let J = U.length > 0 ? FIl(x, y.sealers) : undefined;
          y.replayLog.push({
            code: a,
            calls: aUo(p),
            threw: false
          });
          return {
            data: K,
            newMessages: SPl(p),
            ...(J && {
              newTools: J
            })
          };
        } catch (I) {
          if (I instanceof Error && I.stack) {
            logForDebugging(`REPL error stack trace:
${I.stack}`, {
              level: "error"
            });
          }
          let O = Array.from(p.values()).filter(F => F.phase === "error");
          let M = I instanceof Error ? Mds(I) : y.sealers.toStr(I);
          let L = O.length ? M + `

Inner tool errors (likely root cause):
` + O.map(F => `- ${F.toolName}: ${F.error}`).join(`
`) : M;
          let P = {
            code: a,
            result: null,
            stdout: A.getStdout(),
            stderr: A.getStderr(),
            error: L
          };
          y.replayLog.push({
            code: a,
            calls: aUo(p),
            threw: true
          });
          return {
            data: P,
            newMessages: SPl(p)
          };
        } finally {
          u.abort();
          f.cancel();
          h.cancel();
          y.clearAllTimers();
        }
      },
      userFacingName() {
        return "REPL";
      },
      isTransparentWrapper() {
        return true;
      },
      getToolUseSummary(e) {
        if (!e?.code) {
          return null;
        }
        let t = Ad(e.code);
        if (t && t.length > 50) {
          return t.slice(0, 49) + "\u2026";
        }
        return t ?? null;
      },
      renderToolUseMessage: fPl,
      renderToolUseRejectedMessage: gPl,
      renderToolUseErrorMessage: yPl,
      renderToolUseProgressMessage: hPl,
      mapToolResultToToolResultBlockParam(e, t) {
        let n = "";
        if (!e.stdout && !e.stderr && !e.error && e.result !== undefined && !e.registeredTools?.length) {
          n = bPl(e.result, 10);
        } else {
          let r = [];
          if (e.stdout) {
            r.push(`stdout:
${e.stdout}`);
          }
          if (e.stderr) {
            r.push(`stderr:
${e.stderr}`);
          }
          if (e.error) {
            r.push(`error: ${e.error}`);
          }
          if (e.result !== undefined) {
            r.push(`result: ${bPl(e.result, 10)}`);
          }
          if (e.registeredTools?.length) {
            r.push(`Registered tools: ${e.registeredTools.join(", ")}`);
          }
          n = r.join(`

`) || "";
        }
        if (e.images?.length || e.documents?.length) {
          let r = TPl();
          let o = n.length > r ? n.slice(0, r) + `
[\u2026 ${n.length - r} more chars truncated \u2014 block-bearing REPL results are capped at ${r} chars of text]` : n || "(no text output)";
          return {
            tool_use_id: t,
            type: "tool_result",
            content: [{
              type: "text",
              text: o
            }, ...(e.images ?? []).map(s => ({
              type: "image",
              source: {
                type: "base64",
                media_type: s.mediaType,
                data: s.base64
              }
            })), ...(e.documents ?? []).map(s => ({
              type: "document",
              source: {
                type: "base64",
                media_type: "application/pdf",
                data: s.base64
              }
            }))]
          };
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: n,
          is_error: !!e.error
        };
      }
    });
  });
  var RPl;
  var JOm;
  var xPl;
  var kPl = __lazy(() => {
    bde();
    ci();
    Sl();
    Cmt();
    ioe();
    RPl = we(() => v.strictObject({
      delaySeconds: v$(v.number()).describe("Seconds from now to wake up. Clamped to [60, 3600] by the runtime."),
      reason: v.string().describe("One short sentence explaining the chosen delay. Goes to telemetry and is shown to the user. Be specific."),
      prompt: v.string().describe(`The /loop input to fire on wake-up. Pass the same /loop input verbatim each turn so the next firing re-enters the skill and continues the loop. For autonomous /loop (no user prompt), pass the literal sentinel \`${"<<autonomous-loop-dynamic>>"}\` instead (the dynamic-pacing variant, not the CronCreate-mode \`${"<<autonomous-loop>>"}\`).`),
      ...(W3t() && {
        noop: v.boolean().describe("true = nothing changed (you checked and there is nothing to report). false = something happened worth keeping (edited a file, posted a message, advanced state, surfaced a finding). Consecutive noop:true ticks fold into one context entry.")
      })
    }));
    JOm = we(() => v.object({
      scheduledFor: v.number().describe("Epoch ms timestamp when the next wakeup will fire"),
      clampedDelaySeconds: v.number().describe("Actual delay used after clamping to runtime bounds"),
      wasClamped: v.boolean().describe("True if the requested delaySeconds was outside [60, 3600]")
    }));
    xPl = Xs({
      name: "ScheduleWakeup",
      searchHint: "self-pace next iteration: pick a delay before resuming work or running the next /loop tick",
      maxResultSizeChars: 1000,
      async description() {
        return "Schedule when to resume work in /loop dynamic mode (always pass the `prompt` arg). Call before ending the turn to keep the loop alive; omit the call to end it.";
      },
      async prompt() {
        return Lda("noop" in RPl().shape);
      },
      get inputSchema() {
        return RPl();
      },
      get outputSchema() {
        return JOm();
      },
      userFacingName() {
        return "";
      },
      shouldDefer: true,
      toAutoClassifierInput(e) {
        return `wake in ${e.delaySeconds}s: ${e.prompt}`;
      },
      async checkPermissions(e, t) {
        if (getToolPermissionContext(t).mode === "auto") {
          return {
            behavior: "passthrough",
            message: "Scheduling a /loop wakeup requires classifier review."
          };
        }
        return {
          behavior: "allow",
          updatedInput: e
        };
      },
      renderToolUseMessage() {
        return null;
      },
      async call({
        delaySeconds: e,
        reason: t,
        prompt: n
      }) {
        if (!pTe()) {
          Bdt("gate_off");
          return {
            data: {
              scheduledFor: 0,
              clampedDelaySeconds: 0,
              wasClamped: false
            }
          };
        }
        let r = Kda(e, n, t);
        if (r === null) {
          return {
            data: {
              scheduledFor: 0,
              clampedDelaySeconds: 0,
              wasClamped: false
            }
          };
        }
        return {
          data: {
            scheduledFor: r.scheduledFor,
            clampedDelaySeconds: r.clampedDelaySeconds,
            wasClamped: r.wasClamped
          }
        };
      },
      mapToolResultToToolResultBlockParam({
        scheduledFor: e,
        clampedDelaySeconds: t,
        wasClamped: n
      }, r) {
        if (e === 0) {
          return {
            tool_use_id: r,
            type: "tool_result",
            content: "Wakeup not scheduled. Either the /loop dynamic runtime gate is off or the loop reached its maximum duration \u2014 the loop has ended; do not re-issue."
          };
        }
        let o = new Date(e).toTimeString().slice(0, 8);
        let s = Math.max(0, Math.round((e - Date.now()) / 1000));
        let i = n ? ` (clamped to ${t}s from your requested value)` : "";
        return {
          tool_use_id: r,
          type: "tool_result",
          content: `Next wakeup scheduled for ${o} (in ${s}s)${i}. Nothing more to do this turn \u2014 the harness re-invokes you when the wakeup fires or a task-notification arrives.`
        };
      }
    });
  });
  function XOm() {
    return wde("TASK_MAX_OUTPUT_LENGTH", process.env.TASK_MAX_OUTPUT_LENGTH, 32000, 160000).effective;
  }
  function APl(e, t) {
    let n = XOm();
    if (e.length <= n) {
      return {
        content: e,
        wasTruncated: false
      };
    }
    let o = `[Truncated. Full output: ${getTaskOutputPath(t)}]

`;
    let s = n - o.length;
    let i = e.slice(-s);
    return {
      content: o + i,
      wasTruncated: true
    };
  }
  var pUo = __lazy(() => {
    Xdt();
    cE();
  });
  async function cnr(e) {
    let t;
    if (e.type === "local_bash") {
      let o = e.shellCommand?.taskOutput;
      if (o) {
        let s = await o.getStdout();
        let i = o.getStderr();
        t = [s, i].filter(Boolean).join(`
`);
      } else {
        t = await getTaskOutput(e.id);
      }
    } else {
      t = await getTaskOutput(e.id);
    }
    let n = {
      task_id: e.id,
      task_type: e.type,
      status: e.status,
      description: e.description,
      output: t
    };
    if (e.type === "local_bash") {
      return {
        ...n,
        exitCode: e.result?.code ?? null
      };
    }
    if (e.type === "local_agent") {
      let r = e;
      let o = r.result ? Tl(r.result.content, `
`) : undefined;
      return {
        ...n,
        prompt: r.prompt,
        result: o || t,
        output: o || t,
        error: r.error
      };
    }
    if (e.type === "remote_agent") {
      return {
        ...n,
        prompt: e.command
      };
    }
    return n;
  }
  async function ZOm(e, t, n, r) {
    let o = Date.now();
    while (Date.now() - o < n) {
      if (r?.signal.aborted) {
        throw new xc();
      }
      let a = t().tasks?.[e];
      if (!a) {
        return null;
      }
      if (a.status !== "running" && a.status !== "pending") {
        return a;
      }
      await sleep(100);
    }
    return t().tasks?.[e] ?? null;
  }
  function eDm(e) {
    let t = IPl.c(54);
    let {
      content: n,
      verbose: r,
      theme: o
    } = e;
    let s = r === undefined ? false : r;
    let i = Zu("app:toggleTranscript", "Global", "ctrl+o");
    let a;
    if (t[0] !== n) {
      a = typeof n === "string" ? qt(n) : n;
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    if (!l.task) {
      let m;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        m = ff.jsx(Vn, {
          children: ff.jsx(sc, {
            children: "No task output available"
          })
        });
        t[2] = m;
      } else {
        m = t[2];
      }
      return m;
    }
    let {
      task: c
    } = l;
    if (c.task_type === "local_bash") {
      let m;
      if (t[3] !== c.error || t[4] !== c.output) {
        m = {
          stdout: c.output,
          stderr: "",
          isImage: false,
          dangerouslyDisableSandbox: true,
          returnCodeInterpretation: c.error
        };
        t[3] = c.error;
        t[4] = c.output;
        t[5] = m;
      } else {
        m = t[5];
      }
      let f = m;
      let h;
      if (t[6] !== f || t[7] !== s) {
        h = ff.jsx(e8e, {
          content: f,
          verbose: s
        });
        t[6] = f;
        t[7] = s;
        t[8] = h;
      } else {
        h = t[8];
      }
      return h;
    }
    if (c.task_type === "local_agent") {
      let m = c.result ? Ru(c.result, `
`) + 1 : 0;
      if (l.retrieval_status === "success") {
        if (s) {
          let g;
          if (t[9] !== m || t[10] !== c.description) {
            g = ff.jsxs(Text, {
              children: [c.description, " (", m, " lines)"]
            });
            t[9] = m;
            t[10] = c.description;
            t[11] = g;
          } else {
            g = t[11];
          }
          let y;
          if (t[12] !== c.prompt || t[13] !== o) {
            y = c.prompt && ff.jsx(q7t, {
              prompt: c.prompt,
              theme: o,
              dim: true
            });
            t[12] = c.prompt;
            t[13] = o;
            t[14] = y;
          } else {
            y = t[14];
          }
          let _;
          if (t[15] !== c.result || t[16] !== o) {
            _ = c.result && ff.jsx(gXd, {
              marginTop: 1,
              children: ff.jsx(dNo, {
                content: [{
                  type: "text",
                  text: c.result
                }],
                theme: o
              })
            });
            t[15] = c.result;
            t[16] = o;
            t[17] = _;
          } else {
            _ = t[17];
          }
          let b;
          if (t[18] !== c.error) {
            b = c.error && ff.jsxs(gXd, {
              flexDirection: "column",
              marginTop: 1,
              children: [ff.jsx(Text, {
                color: "error",
                bold: true,
                children: "Error:"
              }), ff.jsx(gXd, {
                paddingLeft: 2,
                children: ff.jsx(Text, {
                  color: "error",
                  children: c.error
                })
              })]
            });
            t[18] = c.error;
            t[19] = b;
          } else {
            b = t[19];
          }
          let S;
          if (t[20] !== y || t[21] !== _ || t[22] !== b) {
            S = ff.jsxs(gXd, {
              flexDirection: "column",
              paddingLeft: 2,
              marginTop: 1,
              children: [y, _, b]
            });
            t[20] = y;
            t[21] = _;
            t[22] = b;
            t[23] = S;
          } else {
            S = t[23];
          }
          let E;
          if (t[24] !== g || t[25] !== S) {
            E = ff.jsxs(gXd, {
              flexDirection: "column",
              children: [g, S]
            });
            t[24] = g;
            t[25] = S;
            t[26] = E;
          } else {
            E = t[26];
          }
          return E;
        }
        let h;
        if (t[27] !== i) {
          h = ff.jsx(Vn, {
            children: ff.jsxs(Text, {
              dimColor: true,
              children: ["Read output (", i, " to expand)"]
            })
          });
          t[27] = i;
          t[28] = h;
        } else {
          h = t[28];
        }
        return h;
      }
      if (l.retrieval_status === "timeout" || c.status === "running") {
        let h;
        if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
          h = ff.jsx(Vn, {
            children: ff.jsx(Text, {
              dimColor: true,
              children: "Task is still running\u2026"
            })
          });
          t[29] = h;
        } else {
          h = t[29];
        }
        return h;
      }
      if (l.retrieval_status === "not_ready") {
        let h;
        if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
          h = ff.jsx(Vn, {
            children: ff.jsx(Text, {
              dimColor: true,
              children: "Task is still running\u2026"
            })
          });
          t[30] = h;
        } else {
          h = t[30];
        }
        return h;
      }
      let f;
      if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
        f = ff.jsx(Vn, {
          children: ff.jsx(Text, {
            dimColor: true,
            children: "Task not ready"
          })
        });
        t[31] = f;
      } else {
        f = t[31];
      }
      return f;
    }
    if (c.task_type === "remote_agent") {
      let m;
      if (t[32] !== c.description || t[33] !== c.status) {
        m = ff.jsxs(Text, {
          children: ["\xA0\xA0", c.description, " [", c.status, "]"]
        });
        t[32] = c.description;
        t[33] = c.status;
        t[34] = m;
      } else {
        m = t[34];
      }
      let f;
      if (t[35] !== c.output || t[36] !== s) {
        f = c.output && s && ff.jsx(gXd, {
          paddingLeft: 4,
          marginTop: 1,
          children: ff.jsx(Text, {
            children: c.output
          })
        });
        t[35] = c.output;
        t[36] = s;
        t[37] = f;
      } else {
        f = t[37];
      }
      let h;
      if (t[38] !== i || t[39] !== c.output || t[40] !== s) {
        h = !s && c.output && ff.jsxs(Text, {
          dimColor: true,
          children: ["     ", "(", i, " to expand)"]
        });
        t[38] = i;
        t[39] = c.output;
        t[40] = s;
        t[41] = h;
      } else {
        h = t[41];
      }
      let g;
      if (t[42] !== m || t[43] !== f || t[44] !== h) {
        g = ff.jsxs(gXd, {
          flexDirection: "column",
          children: [m, f, h]
        });
        t[42] = m;
        t[43] = f;
        t[44] = h;
        t[45] = g;
      } else {
        g = t[45];
      }
      return g;
    }
    let u;
    if (t[46] !== c.description || t[47] !== c.status) {
      u = ff.jsxs(Text, {
        children: ["\xA0\xA0", c.description, " [", c.status, "]"]
      });
      t[46] = c.description;
      t[47] = c.status;
      t[48] = u;
    } else {
      u = t[48];
    }
    let d;
    if (t[49] !== c.output) {
      d = c.output && ff.jsx(gXd, {
        paddingLeft: 4,
        children: ff.jsx(Text, {
          children: c.output.slice(0, 500)
        })
      });
      t[49] = c.output;
      t[50] = d;
    } else {
      d = t[50];
    }
    let p;
    if (t[51] !== u || t[52] !== d) {
      p = ff.jsxs(gXd, {
        flexDirection: "column",
        children: [u, d]
      });
      t[51] = u;
      t[52] = d;
      t[53] = p;
    } else {
      p = t[53];
    }
    return p;
  }
  var IPl;
  var ff;
  var QOm;
  var PPl;
  var OPl = __lazy(() => {
    xb();
    bs();
    KG();
    R7t();
    Wl();
    et();
    c0();
    ci();
    dt();
    ro();
    uMe();
    Zn();
    cE();
    pUo();
    W7t();
    p9n();
    IPl = __toESM(pt(), 1);
    ff = __toESM(ie(), 1);
    QOm = we(() => v.strictObject({
      task_id: v.string().describe("The task ID to get output from"),
      block: VI(v.boolean().default(true)).describe("Whether to wait for completion"),
      timeout: v.number().min(0).max(600000).default(30000).describe("Max wait time in ms")
    }));
    PPl = Xs({
      name: "TaskOutput",
      searchHint: "read output/logs from a background task",
      maxResultSizeChars: 1e5,
      shouldDefer: true,
      aliases: ["AgentOutputTool", "BashOutputTool", "AgentOutput", "BashOutput"],
      userFacingName() {
        return "Task Output";
      },
      get inputSchema() {
        return QOm();
      },
      async description() {
        return "[Deprecated] \u2014 for bash and remote_agent tasks, prefer Read on the output file path; for local_agent tasks, use the Agent tool result directly";
      },
      isConcurrencySafe(e) {
        return this.isReadOnly?.(e) ?? false;
      },
      isEnabled() {
        return true;
      },
      isReadOnly(e) {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.task_id;
      },
      async prompt() {
        return `DEPRECATED: Background tasks return their output file path in the tool result, and you receive a <task-notification> with the same path when the task completes.
- For bash tasks: prefer using the Read tool on that output file path \u2014 it contains stdout/stderr.
- For local_agent tasks: use the Agent tool result directly. Do NOT Read the .output file \u2014 it is a symlink to the full subagent conversation transcript (JSONL) and will overflow your context window.
- For remote_agent tasks: prefer using the Read tool on the output file path \u2014 it contains the streamed remote session output (same as bash).

- Retrieves output from a running or completed task (background shell, agent, or remote session)
- Takes a task_id parameter identifying the task
- Returns the task output along with status information
- Use block=true (default) to wait for task completion
- Use block=false for non-blocking check of current status
- Task IDs can be found using the /tasks command
- Works with all task types: background shells, async agents, and remote sessions`;
      },
      async validateInput({
        task_id: e
      }, {
        getAppState: t
      }) {
        if (!e) {
          return {
            result: false,
            message: "Task ID is required",
            errorCode: 1
          };
        }
        if (!t().tasks?.[e]) {
          return {
            result: false,
            message: `No task found with ID: ${e}`,
            errorCode: 2
          };
        }
        return {
          result: true
        };
      },
      async call(e, t, n, r, o) {
        let {
          task_id: s,
          block: i,
          timeout: a
        } = e;
        let c = t.getAppState().tasks?.[s];
        if (!c) {
          throw Error(`No task found with ID: ${s}`);
        }
        if (!i) {
          if (c.status !== "running" && c.status !== "pending") {
            t.taskRegistry.update(s, d => ({
              ...d,
              notified: true
            }));
            return {
              data: {
                retrieval_status: "success",
                task: await cnr(c)
              }
            };
          }
          return {
            data: {
              retrieval_status: "not_ready",
              task: await cnr(c)
            }
          };
        }
        if (o) {
          o({
            type: "progress",
            toolUseID: `task-output-waiting-${Date.now()}`,
            data: {
              type: "waiting_for_task",
              taskDescription: c.description,
              taskType: c.type
            }
          });
        }
        let u = await ZOm(s, t.getAppState, a, t.abortController);
        if (!u) {
          return {
            data: {
              retrieval_status: "timeout",
              task: null
            }
          };
        }
        if (u.status === "running" || u.status === "pending") {
          return {
            data: {
              retrieval_status: "timeout",
              task: await cnr(u)
            }
          };
        }
        t.taskRegistry.update(s, d => ({
          ...d,
          notified: true
        }));
        return {
          data: {
            retrieval_status: "success",
            task: await cnr(u)
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let n = [];
        if (n.push(`<retrieval_status>${e.retrieval_status}</retrieval_status>`), e.task) {
          if (n.push(`<task_id>${e.task.task_id}</task_id>`), n.push(`<task_type>${e.task.task_type}</task_type>`), n.push(`<status>${e.task.status}</status>`), e.task.exitCode !== undefined && e.task.exitCode !== null) {
            n.push(`<exit_code>${e.task.exitCode}</exit_code>`);
          }
          if (e.task.output?.trim()) {
            let {
              content: r
            } = APl(e.task.output, e.task.task_id);
            n.push(`<output>
${r.trimEnd()}
</output>`);
          }
          if (e.task.error) {
            n.push(`<error>${e.task.error}</error>`);
          }
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: n.join(`

`)
        };
      },
      renderToolUseMessage(e) {
        let {
          block: t = true
        } = e;
        if (!t) {
          return "non-blocking";
        }
        return "";
      },
      renderToolUseTag(e) {
        if (!e.task_id) {
          return null;
        }
        return ff.jsxs(Text, {
          dimColor: true,
          children: [" ", e.task_id]
        });
      },
      renderToolUseProgressMessage(e) {
        let n = e.at(-1)?.data;
        return ff.jsxs(gXd, {
          flexDirection: "column",
          children: [n?.taskDescription && ff.jsxs(Text, {
            children: ["\xA0\xA0", n.taskDescription]
          }), ff.jsxs(Text, {
            children: ["\xA0\xA0\xA0\xA0\xA0Waiting for task", " ", ff.jsx(Text, {
              dimColor: true,
              children: ff.jsx(xt, {
                chord: "escape",
                action: "give additional instructions",
                parens: true,
                format: {
                  keyCase: "lower"
                }
              })
            })]
          })]
        });
      },
      renderToolResultMessage(e, t, {
        verbose: n,
        theme: r
      }) {
        return ff.jsx(eDm, {
          content: e,
          verbose: n,
          theme: r
        });
      },
      renderToolUseRejectedMessage() {
        return ff.jsx(jme, {});
      },
      renderToolUseErrorMessage(e, {
        verbose: t
      }) {
        return ff.jsx(Rw, {
          result: e,
          verbose: t
        });
      }
    });
  });
  function DPl() {
    if (getAPIProvider() !== "firstParty") {
      return false;
    }
    if (!Me.CLAUDE_CODE_WEBSEARCH_USE_CCR_PROXY) {
      return false;
    }
    return !!rYt();
  }
  function nDm() {
    return `${(Me.ANTHROPIC_BASE_URL || "https://api.anthropic.com").replace(/\/+$/, "")}/v1/code/sessions/${encodeURIComponent(rYt())}/worker/web-search`;
  }
  async function MPl(e, t, n) {
    let r = CIe();
    let o;
    try {
      o = await NP.post(nDm(), {
        query: e,
        ...(n?.allowed_domains?.length && {
          allowed_domains: n.allowed_domains
        }),
        ...(n?.blocked_domains?.length && {
          blocked_domains: n.blocked_domains
        })
      }, {
        signal: t,
        timeout: 40000,
        maxContentLength: 12582912,
        headers: {
          ...r,
          "Content-Type": "application/json",
          "anthropic-version": "2023-06-01"
        },
        validateStatus: () => true
      });
    } catch (i) {
      if (isCancel(i)) {
        throw new xc();
      }
      let a = i instanceof Error && "code" in i ? String(i.code) : undefined;
      logForDebugging(`ccr websearch-proxy transport error: ${a}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: 502,
        errorType: "PROXY_TRANSPORT",
        errorMessage: `Request to the WebSearch proxy failed (${a ?? "transport error"}).`
      };
    }
    if (o.status !== 200) {
      let i = typeof o.data?.message === "string" ? o.data.message.slice(0, 200) : undefined;
      logForDebugging(`ccr websearch-proxy returned HTTP ${o.status}${i ? `: ${i}` : ""}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: o.status,
        errorType: "PROXY_REJECTED",
        errorMessage: `The WebSearch proxy rejected the request (HTTP ${o.status}${i ? `: ${i}` : ""}).`
      };
    }
    let s = tDm().safeParse(o.data);
    if (!s.success) {
      logForDebugging(`ccr websearch-proxy returned unparseable body: ${s.error.message}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "proxy",
        statusCode: 502,
        errorType: "PROXY_BAD_RESPONSE",
        errorMessage: "The WebSearch proxy returned a malformed response."
      };
    }
    if (s.data.error) {
      logForDebugging(`ccr websearch-proxy search error: ${s.data.error.error_type}`, {
        level: "warn"
      });
      return {
        ok: false,
        source: "target",
        statusCode: 502,
        errorType: s.data.error.error_type,
        errorMessage: s.data.error.error_message
      };
    }
    return {
      ok: true,
      results: s.data.results.filter(i => i.url).map(i => ({
        title: i.title,
        url: i.url
      }))
    };
  }
  var tDm;
  var NPl = __lazy(() => {
    Dp();
    qg();
    je();
    d_();
    dt();
    Ds();
    e1();
    DNo();
    tDm = we(() => Ke.object({
      results: Ke.array(Ke.object({
        title: Ke.string().optional().default(""),
        url: Ke.string().optional().default(""),
        snippet: Ke.string().optional().default("")
      })).optional().default([]),
      error: Ke.object({
        error_type: Ke.string(),
        error_message: Ke.string()
      }).nullable().optional()
    }));
  });
  function rDm(e) {
    let t = 0;
    for (let n of e) {
      if (n != null && typeof n !== "string") {
        t++;
      }
    }
    return t;
  }
  function LPl({
    query: e,
    allowed_domains: t,
    blocked_domains: n
  }, {
    verbose: r
  }) {
    if (!e) {
      return null;
    }
    let o = "";
    if (e) {
      o += `"${e}"`;
    }
    if (r) {
      if (t && t.length > 0) {
        o += `, only allowing domains: ${t.join(", ")}`;
      }
      if (n && n.length > 0) {
        o += `, blocking domains: ${n.join(", ")}`;
      }
    }
    return o;
  }
  function FPl(e) {
    if (e.length === 0) {
      return null;
    }
    let t = e.at(-1);
    if (!t?.data) {
      return null;
    }
    let n = t.data;
    switch (n.type) {
      case "query_update":
        return lwe.jsx(Vn, {
          children: lwe.jsxs(Text, {
            dimColor: true,
            children: ["Searching: ", n.query]
          })
        });
      case "search_results_received":
        return lwe.jsx(Vn, {
          children: lwe.jsxs(Text, {
            dimColor: true,
            children: ["Found ", n.resultCount, ' results for "', n.query, '"']
          })
        });
      default:
        return null;
    }
  }
  function UPl(e) {
    let t = e.searchCount ?? rDm(e.results ?? []);
    let n = e.durationSeconds >= 1 ? `${Math.round(e.durationSeconds)}s` : `${Math.round(e.durationSeconds * 1000)}ms`;
    return lwe.jsx(gXd, {
      justifyContent: "space-between",
      width: "100%",
      children: lwe.jsx(Vn, {
        height: 1,
        children: lwe.jsxs(Text, {
          children: ["Did ", t, " search", t !== 1 ? "es" : "", " in ", n]
        })
      })
    });
  }
  function mUo(e) {
    if (!e?.query) {
      return null;
    }
    return truncate(e.query, 50);
  }
  var lwe;
  var BPl = __lazy(() => {
    Wl();
    et();
    cs();
    lwe = __toESM(ie(), 1);
  });
  function aDm(e) {
    return {
      type: "web_search_20250305",
      name: "web_search",
      allowed_domains: e.allowed_domains,
      blocked_domains: e.blocked_domains,
      max_uses: 8
    };
  }
  function lDm(e, t, n) {
    let r = [];
    let o = "";
    let s = true;
    let i = 0;
    let a = 0;
    for (let l of e) {
      if (l.type === "server_tool_use") {
        if (i++, s) {
          if (s = false, o.trim().length > 0) {
            r.push(o.trim());
          }
          o = "";
        }
        continue;
      }
      if (l.type === "web_search_tool_result") {
        if (a++, !Array.isArray(l.content)) {
          let u = `Web search error: ${l.content.error_code}`;
          logForDebugging(u, {
            level: "error"
          });
          r.push(u);
          continue;
        }
        let c = l.content.map(u => ({
          title: u.title,
          url: u.url
        }));
        r.push({
          tool_use_id: l.tool_use_id,
          content: c
        });
      }
      if (l.type === "text") {
        if (s) {
          o += l.text;
        } else {
          s = true;
          o = l.text;
        }
      }
    }
    if (o.length) {
      r.push(o.trim());
    }
    return {
      query: t,
      results: r,
      durationSeconds: n,
      searchCount: Math.max(i, a)
    };
  }
  var oDm;
  var sDm;
  var iDm;
  var $Pl;
  var HPl = __lazy(() => {
    Ds();
    at();
    $n();
    aE();
    Tst();
    ci();
    je();
    dt();
    ro();
    Eo();
    NPl();
    Hdt();
    BPl();
    Sl();
    oDm = we(() => v.strictObject({
      query: v.string().min(2).describe("The search query to use"),
      allowed_domains: v.array(v.string()).optional().describe("Only include search results from these domains"),
      blocked_domains: v.array(v.string()).optional().describe("Never include search results from these domains")
    }));
    sDm = we(() => {
      let e = v.object({
        title: v.string().describe("The title of the search result"),
        url: v.string().describe("The URL of the search result")
      });
      return v.object({
        tool_use_id: v.string().describe("ID of the tool use"),
        content: v.array(e).describe("Array of search hits")
      });
    });
    iDm = we(() => v.object({
      query: v.string().describe("The search query that was executed"),
      results: v.array(v.union([sDm(), v.string()])).describe("Search results and/or text commentary from the model"),
      durationSeconds: v.number().describe("Time taken to complete the search operation"),
      searchCount: v.number().optional().describe("Number of web searches performed")
    }));
    $Pl = Xs({
      name: "WebSearch",
      searchHint: "search the web for current information",
      maxResultSizeChars: 1e5,
      shouldDefer: true,
      async description(e) {
        return `Claude wants to search the web for: ${e.query}`;
      },
      userFacingName() {
        return "Web Search";
      },
      getToolUseSummary: mUo,
      getActivityDescription(e) {
        let t = mUo(e);
        return t ? `Searching for ${t}` : "Searching the web";
      },
      isEnabled() {
        let e = getAPIProvider();
        if (e === "firstParty" || e === "anthropicAws") {
          return true;
        }
        if (e === "gateway") {
          return false;
        }
        if (e === "vertex") {
          let t = getMainLoopModel();
          return t.includes("claude-fable-5") || t.includes("claude-opus-4") || t.includes("claude-sonnet-5") || t.includes("claude-sonnet-4") || t.includes("claude-haiku-4");
        }
        if (e === "foundry") {
          return true;
        }
        return false;
      },
      get inputSchema() {
        return oDm();
      },
      get outputSchema() {
        return iDm();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.query;
      },
      async checkPermissions(e) {
        return {
          behavior: "passthrough",
          message: "WebSearchTool requires permission.",
          suggestions: [{
            type: "addRules",
            rules: [{
              toolName: "WebSearch"
            }],
            behavior: "allow",
            destination: "localSettings"
          }]
        };
      },
      async prompt({
        model: e
      }) {
        return rpa(e);
      },
      renderToolUseMessage: LPl,
      renderToolUseProgressMessage: FPl,
      renderToolResultMessage: UPl,
      extractSearchText() {
        return "";
      },
      async validateInput(e) {
        let {
          query: t,
          allowed_domains: n,
          blocked_domains: r
        } = e;
        if (!t.length) {
          return {
            result: false,
            message: "Error: Missing query",
            errorCode: 1
          };
        }
        if (n?.length && r?.length) {
          return {
            result: false,
            message: "Error: Cannot specify both allowed_domains and blocked_domains in the same request",
            errorCode: 2
          };
        }
        return {
          result: true
        };
      },
      async call(e, t, n, r, o) {
        let s = performance.now();
        let {
          query: i
        } = e;
        if (DPl()) {
          let S = await MPl(i, t.abortController.signal, {
            allowed_domains: e.allowed_domains,
            blocked_domains: e.blocked_domains
          });
          let E = (performance.now() - s) / 1000;
          if (!S.ok) {
            throw new Po(De({
              error_type: S.errorType,
              source: S.source,
              message: S.errorMessage
            }), "web-search-ccr-proxy");
          }
          if (o) {
            o({
              type: "progress",
              toolUseID: "ccr-proxy-search-1",
              data: {
                type: "search_results_received",
                resultCount: S.results.length,
                query: i
              }
            });
          }
          return {
            data: {
              query: i,
              results: [{
                tool_use_id: "ccr-proxy-search-1",
                content: S.results
              }],
              durationSeconds: E,
              searchCount: 1
            }
          };
        }
        let a = In({
          content: "Perform a web search for the query: " + i
        });
        let l = aDm(e);
        let u = getFeatureValue_CACHED_MAY_BE_STALE("tengu_plum_vx3", false) ? getSmallFastModel() : t.options.mainLoopModel;
        if (getAPIProvider() === "foundry" && !Zle(u, "web_search")) {
          throw Error("Web search is not available on this Foundry deployment.");
        }
        let d = aEt({
          messages: [a],
          systemPrompt: ["You are an assistant for performing a web search tool use"],
          thinkingConfig: {
            type: "disabled"
          },
          tools: [],
          signal: t.abortController.signal,
          options: {
            getToolPermissionContext: async () => getToolPermissionContext(t),
            model: u,
            toolChoice: {
              type: "tool",
              name: "web_search"
            },
            isNonInteractiveSession: t.options.isNonInteractiveSession,
            hasAppendSystemPrompt: !!t.options.appendSystemPrompt,
            extraToolSchemas: [l],
            querySource: "web_search_tool",
            enablePromptCaching: false,
            agents: t.options.agentDefinitions.activeAgents,
            mcpTools: [],
            agentId: t.agentId,
            agentContext: t.agentContext,
            stickyBetas: wN(getStickyBetas()),
            effortValue: getEffortValue(t)
          }
        });
        let p = [];
        let m = null;
        let f = "";
        let h = 0;
        let g = new Map();
        for await (let S of d) {
          if (S.type === "assistant") {
            p.push(...S.message.content);
            continue;
          }
          if (S.type === "stream_event" && S.event?.type === "content_block_start") {
            let E = S.event.content_block;
            if (E && E.type === "server_tool_use") {
              m = E.id;
              f = "";
              continue;
            }
          }
          if (m && S.type === "stream_event" && S.event?.type === "content_block_delta") {
            let E = S.event.delta;
            if (E?.type === "input_json_delta" && E.partial_json) {
              f += E.partial_json;
              try {
                let C = f.match(/"query"\s*:\s*"((?:[^"\\]|\\.)*)"/);
                if (C && C[1]) {
                  let x = qt('"' + C[1] + '"');
                  if (!g.vZc(m) || g.get(m) !== x) {
                    if (g.set(m, x), h++, o) {
                      o({
                        type: "progress",
                        toolUseID: `search-progress-${h}`,
                        data: {
                          type: "query_update",
                          query: x
                        }
                      });
                    }
                  }
                }
              } catch {}
            }
          }
          if (S.type === "stream_event" && S.event?.type === "content_block_start") {
            let E = S.event.content_block;
            if (E && E.type === "web_search_tool_result") {
              let C = E.tool_use_id;
              let x = g.get(C) || i;
              let A = E.content;
              if (h++, o) {
                o({
                  type: "progress",
                  toolUseID: C || `search-progress-${h}`,
                  data: {
                    type: "search_results_received",
                    resultCount: Array.isArray(A) ? A.length : 0,
                    query: x
                  }
                });
              }
            }
          }
        }
        if (getAPIProvider() === "foundry" && !Zle(u, "web_search")) {
          throw Error("Web search is not available on this Foundry deployment.");
        }
        let _ = (performance.now() - s) / 1000;
        return {
          data: lDm(p, i, _)
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          query: n,
          results: r
        } = e;
        let o = `Web search results for query: "${n}"

`;
        (r ?? []).forEach(s => {
          if (s == null) {
            return;
          }
          if (typeof s === "string") {
            o += s + `

`;
          } else if (s.content?.length > 0) {
            o += `Links: ${De(s.content)}

`;
          } else {
            o += `No links found.

`;
          }
        });
        o += `
REMINDER: You MUST include the sources above in your response to the user using markdown hyperlinks.`;
        return {
          tool_use_id: t,
          type: "tool_result",
          content: o.trim()
        };
      }
    });
  });
  var hUo;
  var jPl;
  var qPl = __lazy(() => {
    hUo = we(() => v.object({
      file: v.string().describe("Repo-relative path of the file the finding is in"),
      line: v.number().int().optional().describe("1-indexed line the finding anchors to"),
      summary: v.string().describe("One-sentence statement of the defect"),
      failure_scenario: v.string().describe("Concrete inputs/state \u2192 wrong output/crash"),
      verdict: v.enum(["CONFIRMED", "PLAUSIBLE"]).optional().describe("Set when a verify pass ran; absent on inline-only reviews"),
      outcome: v.enum(["fixed", "skipped", "no_change_needed"]).optional().describe("Set ONLY when re-reporting after applying fixes: what happened to this finding")
    }));
    jPl = we(() => v.strictObject({
      level: v.enum(["low", "medium", "high", "xhigh", "max"]).optional().describe("Effort level the review ran at"),
      findings: v.array(hUo()).max(32).describe("Verified findings, most-severe first; empty if none survived")
    }));
  });
  function WPl() {
    return "Code review";
  }
  function GPl(e) {
    let t = e.findings?.length ?? 0;
    return `${e.level ?? "review"} \xB7 ${t} ${un(t, "finding")}`;
  }
  function VPl(e, t, {
    verbose: n
  }) {
    let r = e?.findings ?? [];
    if (r.length === 0) {
      return null;
    }
    return RZ.jsx(Vn, {
      children: RZ.jsx(gXd, {
        flexDirection: "column",
        children: r.map((o, s) => {
          let i = o.line === undefined ? o.file : `${o.file}:${o.line}`;
          return RZ.jsxs(gXd, {
            flexDirection: "column",
            children: [RZ.jsxs(gXd, {
              columnGap: 1,
              children: [RZ.jsx(Text, {
                color: o.outcome === "fixed" ? "success" : o.verdict ? cDm[o.verdict] : undefined,
                children: o.outcome === "fixed" ? "\u2713" : "\u25CF"
              }), RZ.jsx(Text, {
                color: "suggestion",
                children: i
              }), RZ.jsxs(Text, {
                children: ["\u2014 ", o.summary]
              }), o.outcome && o.outcome !== "fixed" ? RZ.jsxs(Text, {
                dimColor: true,
                children: ["[", o.outcome === "skipped" ? "skipped" : "no change needed", "]"]
              }) : null]
            }), n && RZ.jsx(gXd, {
              paddingLeft: 2,
              children: RZ.jsx(Text, {
                dimColor: true,
                wrap: "wrap",
                children: o.failure_scenario
              })
            })]
          }, s);
        })
      })
    });
  }
  var RZ;
  var cDm;
  var zPl = __lazy(() => {
    Wl();
    et();
    Zn();
    RZ = __toESM(ie(), 1);
    cDm = {
      CONFIRMED: "error",
      PLAUSIBLE: "warning"
    };
  });
  var uDm;
  var KPl;
  var YPl = __lazy(() => {
    ci();
    Zn();
    qPl();
    zPl();
    uDm = we(() => v.object({
      count: v.number().describe("Number of findings reported"),
      level: v.enum(["low", "medium", "high", "xhigh", "max"]).optional().describe("Effort level the review ran at"),
      findings: v.array(hUo()).describe("Echoed for the result body")
    }));
    KPl = Xs({
      name: "ReportFindings",
      searchHint: "report code-review findings as a structured list",
      maxResultSizeChars: 256,
      strict: true,
      async description() {
        return "Report code-review findings as a typed list so the host UI can render them. Use this only when the active code-review instructions tell you to report findings with this tool; otherwise follow whatever output format those instructions specify. When reporting a review's results, call it once with the verified findings ranked most-severe first (empty array if nothing survived verification) and do not also print the findings as text. When re-reporting after applying fixes (only if the apply instructions ask for it), set `outcome` on each finding to what actually happened.";
      },
      async prompt() {
        return "Report code-review findings as a typed list so the host UI can render them. Use this only when the active code-review instructions tell you to report findings with this tool; otherwise follow whatever output format those instructions specify. When reporting a review's results, call it once with the verified findings ranked most-severe first (empty array if nothing survived verification) and do not also print the findings as text. When re-reporting after applying fixes (only if the apply instructions ask for it), set `outcome` on each finding to what actually happened.";
      },
      get inputSchema() {
        return jPl();
      },
      get outputSchema() {
        return uDm();
      },
      isReadOnly() {
        return true;
      },
      isConcurrencySafe() {
        return true;
      },
      toAutoClassifierInput(e) {
        return `${e.findings.length} findings`;
      },
      userFacingName: WPl,
      renderToolUseMessage: GPl,
      renderToolResultMessage: VPl,
      async call({
        findings: e,
        level: t
      }) {
        return {
          data: {
            count: e.length,
            level: t,
            findings: e
          }
        };
      },
      mapToolResultToToolResultBlockParam({
        count: e
      }, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: e === 0 ? "No findings reported." : `${e} ${un(e, "finding")} reported.`
        };
      }
    });
  });
  function JPl(e) {
    return _g(e) ? 'Create and update a task list for the current session. The list is rendered to the user as your working plan.\n\n- Each todo has `content`, `status` ("pending" | "in_progress" | "completed"), and `activeForm` (present-tense label shown while in progress).\n- Send the full list each call; it replaces the previous one.\n- Keep one item `in_progress` at a time and mark it `completed` when done.' : pDm;
  }
  var pDm;
  var QPl = __lazy(() => {
    AI();
    Ay();
    pDm = `Use this tool to create and manage a structured task list for your current coding session. This helps you track progress, organize complex tasks, and demonstrate thoroughness to the user.
It also helps the user understand the progress of the task and overall progress of their requests.

## When to Use This Tool
Use this tool proactively in these scenarios:

1. Complex multi-step tasks - When a task requires 3 or more distinct steps or actions
2. Non-trivial and complex tasks - Tasks that require careful planning or multiple operations
3. User explicitly requests todo list - When the user directly asks you to use the todo list
4. User provides multiple tasks - When users provide a list of things to be done (numbered or comma-separated)
5. After receiving new instructions - Immediately capture user requirements as todos
6. When you start working on a task - Mark it as in_progress BEFORE beginning work. Ideally you should only have one todo as in_progress at a time
7. After completing a task - Mark it as completed and add any new follow-up tasks discovered during implementation

## When NOT to Use This Tool

Skip using this tool when:
1. There is only a single, straightforward task
2. The task is trivial and tracking it provides no organizational benefit
3. The task can be completed in less than 3 trivial steps
4. The task is purely conversational or informational

NOTE that you should not use this tool if there is only one trivial task to do. In this case you are better off just doing the task directly.

## Examples of When to Use the Todo List

<example>
User: I want to add a dark mode toggle to the application settings. Make sure you run the tests and build when you're done!
Assistant: *Creates todo list with the following items:*
1. Creating dark mode toggle component in Settings page
2. Adding dark mode state management (context/store)
3. Implementing CSS-in-JS styles for dark theme
4. Updating existing components to support theme switching
5. Running tests and build process, addressing any failures or errors that occur
*Begins working on the first task*

<reasoning>
The assistant used the todo list because:
1. Adding dark mode is a multi-step feature requiring UI, state management, and styling changes
2. The user explicitly requested tests and build be run afterward
3. The assistant inferred that tests and build need to pass by adding "Ensure tests and build succeed" as the final task
</reasoning>
</example>

<example>
User: Help me rename the function getCwd to getCurrentWorkingDirectory across my project
Assistant: *Uses grep or search tools to locate all instances of getCwd in the codebase*
I've found 15 instances of 'getCwd' across 8 different files.
*Creates todo list with specific items for each file that needs updating*

<reasoning>
The assistant used the todo list because:
1. First, the assistant searched to understand the scope of the task
2. Upon finding multiple occurrences across different files, it determined this was a complex task with multiple steps
3. The todo list helps ensure every instance is tracked and updated systematically
4. This approach prevents missing any occurrences and maintains code consistency
</reasoning>
</example>

<example>
User: I need to implement these features for my e-commerce site: user registration, product catalog, shopping cart, and checkout flow.
Assistant: *Creates a todo list breaking down each feature into specific tasks based on the project architecture*
Let's start with user registration. This will involve creating database models, API endpoints, and frontend forms that integrate with your existing authentication system.

<reasoning>
The assistant used the todo list because:
1. The user provided multiple complex features to implement in a comma separated list
2. The todo list helps organize these large features into manageable tasks
3. This approach allows for tracking progress across the entire implementation
</reasoning>
</example>

<example>
User: Can you help optimize my React application? It's rendering slowly and has performance issues.
Assistant: *Reviews component structure, render patterns, state management, and data fetching*
After analyzing your codebase, I've identified several performance issues.
*Creates todo list with items like: 1) Implementing memoization for expensive calculations in ProductList, 2) Adding virtualization for long lists in Dashboard, 3) Optimizing image loading in Gallery component, 4) Fixing state update loops in ShoppingCart, 5) Reviewing bundle size and implementing code splitting*
Let's start by implementing memoization for the expensive calculations in your ProductList component.

<reasoning>
The assistant used the todo list because:
1. First, the assistant examined the codebase to identify specific performance issues
2. Based on this analysis, it identified multiple optimization opportunities
3. Performance optimization is a non-trivial task requiring multiple steps
4. The todo list helps methodically track improvements across different components
5. This systematic approach ensures all performance bottlenecks are addressed
</reasoning>
</example>

## Examples of When NOT to Use the Todo List

<example>
User: How do I print 'Hello World' in Python?
Assistant: In Python, you can print "Hello World" with this simple code:

python
print("Hello World")

This will output the text "Hello World" to the console when executed.

<reasoning>
The assistant did not use the todo list because this is a single, trivial task that can be completed in one step. There's no need to track multiple tasks or steps for such a straightforward request.
</reasoning>
</example>

<example>
User: What does the git status command do?
Assistant: The git status command shows the current state of your working directory and staging area. It displays which changes have been staged, which haven't, and which files aren't being tracked by Git. This is a fundamental command for understanding the current state of your repository before making commits.

<reasoning>
The assistant did not use the todo list because this is an informational request with no actual coding task to complete. The user is simply asking for an explanation, not for the assistant to perform multiple steps or tasks.
</reasoning>
</example>

<example>
User: Can you add a comment to the calculateTotal function to explain what it does?
Assistant: Sure, let me add a comment to the calculateTotal function to explain what it does.
* Uses the ${"Edit"} tool to add a comment to the calculateTotal function *

<reasoning>
The assistant did not use the todo list because this is a single, straightforward task confined to one location in the code. Adding a comment doesn't require tracking multiple steps or systematic organization.
</reasoning>
</example>

<example>
User: Run npm install for me and tell me what happens.
Assistant: I'll run the npm install command for you.

*Executes: npm install*

The command completed successfully. Here's the output:
[Output of npm install command]

All dependencies have been installed according to your package.json file.

<reasoning>
The assistant did not use the todo list because this is a single command execution with immediate results. There are no multiple steps to track or organize, making the todo list unnecessary for this straightforward task.
</reasoning>
</example>

## Task States and Management

1. **Task States**: Use these states to track progress:
   - pending: Task not yet started
   - in_progress: Currently working on (limit to ONE task at a time)
   - completed: Task finished successfully

   **IMPORTANT**: Task descriptions must have two forms:
   - content: The imperative form describing what needs to be done (e.g., "Run tests", "Build the project")
   - activeForm: The present continuous form shown during execution (e.g., "Running tests", "Building the project")

2. **Task Management**:
   - Update task status in real-time as you work
   - Mark tasks complete IMMEDIATELY after finishing (don't batch completions)
   - Exactly ONE task must be in_progress at any time (not less, not more)
   - Complete current tasks before starting new ones
   - Remove tasks that are no longer relevant from the list entirely

3. **Task Completion Requirements**:
   - ONLY mark a task as completed when you have FULLY accomplished it
   - If you encounter errors, blockers, or cannot finish, keep the task as in_progress
   - When blocked, create a new task describing what needs to be resolved
   - Never mark a task as completed if:
     - Tests are failing
     - Implementation is partial
     - You encountered unresolved errors
     - You couldn't find necessary files or dependencies

4. **Task Breakdown**:
   - Create specific, actionable items
   - Break complex tasks into smaller, manageable steps
   - Use clear, descriptive task names
   - Always provide both forms:
     - content: "Fix authentication bug"
     - activeForm: "Fixing authentication bug"

When in doubt, use this tool. Being proactive with task management demonstrates attentiveness and ensures you complete all requirements successfully.
`;
  });
  var mDm;
  var fDm;
  var ZPl;
  var eOl = __lazy(() => {
    at();
    ci();
    YI();
    cXn();
    QPl();
    mDm = we(() => v.strictObject({
      todos: iLe().describe("The updated todo list")
    }));
    fDm = we(() => v.object({
      oldTodos: iLe().describe("The todo list before the update"),
      newTodos: iLe().describe("The todo list after the update")
    }));
    ZPl = Xs({
      name: "TodoWrite",
      searchHint: "manage the session task checklist",
      maxResultSizeChars: 1e5,
      strict: true,
      async description() {
        return "Update the todo list for the current session. To be used proactively and often to track progress and pending tasks. Make sure that at least one task is in_progress at all times. Always provide both content (imperative) and activeForm (present continuous) for each task.";
      },
      async prompt({
        model: e
      }) {
        return JPl(e);
      },
      get inputSchema() {
        return mDm();
      },
      get outputSchema() {
        return fDm();
      },
      userFacingName() {
        return "";
      },
      shouldDefer: true,
      isEnabled() {
        return !sR();
      },
      toAutoClassifierInput(e) {
        return `${e.todos.length} items`;
      },
      async checkPermissions(e) {
        return {
          behavior: "allow",
          updatedInput: e
        };
      },
      renderToolUseMessage() {
        return null;
      },
      async call({
        todos: e
      }, t) {
        let n = t.getAppState();
        let r = t.agentId ?? getSessionId();
        let o = n.todos[r] ?? [];
        let i = e.every(a => a.status === "completed") ? [] : e;
        t.setAppState(a => ({
          ...a,
          todos: {
            ...a.todos,
            [r]: i
          }
        }));
        return {
          data: {
            oldTodos: o,
            newTodos: e
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: "Todos have been modified successfully. Ensure that you continue to use the todo list to track your progress. Please proceed with the current tasks if applicable"
        };
      }
    });
  });
  var hDm;
  var XnS;
  var nOl = __lazy(() => {
    ci();
    hDm = we(() => v.strictObject({}));
    XnS = Xs({
      name: "TestingPermission",
      maxResultSizeChars: 1e5,
      async description() {
        return "Test tool that always asks for permission";
      },
      async prompt() {
        return "Test tool that always asks for permission before executing. Used for end-to-end testing.";
      },
      get inputSchema() {
        return hDm();
      },
      userFacingName() {
        return "TestingPermission";
      },
      isEnabled() {
        return false;
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      async checkPermissions() {
        return {
          behavior: "ask",
          message: "Run test?"
        };
      },
      renderToolUseMessage() {
        return null;
      },
      renderToolUseProgressMessage() {
        return null;
      },
      renderToolUseQueuedMessage() {
        return null;
      },
      renderToolUseRejectedMessage() {
        return null;
      },
      renderToolResultMessage() {
        return null;
      },
      renderToolUseErrorMessage() {
        return null;
      },
      async call() {
        return {
          data: `${"TestingPermission"} executed successfully`
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          type: "tool_result",
          content: String(e),
          tool_use_id: t
        };
      }
    });
  });
  function RJt(e, t) {
    if (!e) {
      logForDebugging("formatUri called with undefined URI - indicates malformed LSP server response", {
        level: "warn"
      });
      return "<unknown location>";
    }
    let n = e.replace(/^file:\/\//, "");
    if (/^\/[A-Za-z]:/.test(n)) {
      n = n.slice(1);
    }
    try {
      n = decodeURIComponent(n);
    } catch (r) {
      let o = he(r);
      logForDebugging(`Failed to decode LSP URI '${e}': ${o}. Using un-decoded path: ${n}`, {
        level: "warn"
      });
    }
    if (t) {
      let r = iOl.relative(t, n).replaceAll("\\", "/");
      if (r.length < n.length && !r.startsWith("../../")) {
        return r;
      }
    }
    return n.replaceAll("\\", "/");
  }
  function aOl(e, t) {
    let n = new Map();
    for (let r of e) {
      let o = "uri" in r ? r.uri : r.location.uri;
      let s = RJt(o, t);
      let i = n.get(s);
      if (i) {
        i.push(r);
      } else {
        n.set(s, [r]);
      }
    }
    return n;
  }
  function dnr(e, t) {
    let n = RJt(e.uri, t);
    let r = e.range.start.line + 1;
    let o = e.range.start.character + 1;
    return `${n}:${r}:${o}`;
  }
  function rOl(e) {
    return {
      uri: e.targetUri,
      range: e.targetSelectionRange || e.targetRange
    };
  }
  function oOl(e) {
    return "targetUri" in e;
  }
  function gUo(e, t) {
    if (!e) {
      return "No definition found. This may occur if the cursor is not on a symbol, or if the definition is in an external library not indexed by the LSP server.";
    }
    if (Array.isArray(e)) {
      let r = e.map(a => oOl(a) ? rOl(a) : a);
      let o = r.filter(a => !a || !a.uri);
      if (o.length > 0) {
        logForDebugging(`formatGoToDefinitionResult: Filtering out ${o.length} invalid location(s) - this should have been caught earlier`, {
          level: "warn"
        });
      }
      let s = r.filter(a => a && a.uri);
      if (s.length === 0) {
        return "No definition found. This may occur if the cursor is not on a symbol, or if the definition is in an external library not indexed by the LSP server.";
      }
      if (s.length === 1) {
        return `Defined in ${dnr(s[0], t)}`;
      }
      let i = s.map(a => `  ${dnr(a, t)}`).join(`
`);
      return `Found ${s.length} definitions:
${i}`;
    }
    let n = oOl(e) ? rOl(e) : e;
    return `Defined in ${dnr(n, t)}`;
  }
  function lOl(e, t) {
    if (!e || e.length === 0) {
      return "No references found. This may occur if the symbol has no usages, or if the LSP server has not fully indexed the workspace.";
    }
    let n = e.filter(i => !i || !i.uri);
    if (n.length > 0) {
      logForDebugging(`formatFindReferencesResult: Filtering out ${n.length} invalid location(s) - this should have been caught earlier`, {
        level: "warn"
      });
    }
    let r = e.filter(i => i && i.uri);
    if (r.length === 0) {
      return "No references found. This may occur if the symbol has no usages, or if the LSP server has not fully indexed the workspace.";
    }
    if (r.length === 1) {
      return `Found 1 reference:
  ${dnr(r[0], t)}`;
    }
    let o = aOl(r, t);
    let s = [`Found ${r.length} references across ${o.size} files:`];
    for (let [i, a] of o) {
      s.push(`
${i}:`);
      for (let l of a) {
        let c = l.range.start.line + 1;
        let u = l.range.start.character + 1;
        s.push(`  Line ${c}:${u}`);
      }
    }
    return s.join(`
`);
  }
  function gDm(e) {
    if (Array.isArray(e)) {
      return e.map(t => {
        if (typeof t === "string") {
          return t;
        }
        return t.value;
      }).join(`

`);
    }
    if (typeof e === "string") {
      return e;
    }
    if ("kind" in e) {
      return e.value;
    }
    return e.value;
  }
  function cOl(e, t) {
    if (!e) {
      return "No hover information available. This may occur if the cursor is not on a symbol, or if the LSP server has not fully indexed the file.";
    }
    let n = gDm(e.contents);
    if (e.range) {
      let r = e.range.start.line + 1;
      let o = e.range.start.character + 1;
      return `Hover info at ${r}:${o}:

${n}`;
    }
    return n;
  }
  function lEt(e) {
    return {
      [1]: "File",
      [2]: "Module",
      [3]: "Namespace",
      [4]: "Package",
      [5]: "Class",
      [6]: "Method",
      [7]: "Property",
      [8]: "Field",
      [9]: "Constructor",
      [10]: "Enum",
      [11]: "Interface",
      [12]: "Function",
      [13]: "Variable",
      [14]: "Constant",
      [15]: "String",
      [16]: "Number",
      [17]: "Boolean",
      [18]: "Array",
      [19]: "Object",
      [20]: "Key",
      [21]: "Null",
      [22]: "EnumMember",
      [23]: "Struct",
      [24]: "Event",
      [25]: "Operator",
      [26]: "TypeParameter"
    }[e] || "Unknown";
  }
  function uOl(e, t = 0) {
    let n = [];
    let r = "  ".repeat(t);
    let o = lEt(e.kind);
    let s = `${r}${e.name} (${o})`;
    if (e.detail) {
      s += ` ${e.detail}`;
    }
    let i = e.range.start.line + 1;
    if (s += ` - Line ${i}`, n.push(s), e.children && e.children.length > 0) {
      for (let a of e.children) {
        n.push(...uOl(a, t + 1));
      }
    }
    return n;
  }
  function dOl(e, t) {
    if (!e || e.length === 0) {
      return "No symbols found in document. This may occur if the file is empty, not supported by the LSP server, or if the server has not fully indexed the file.";
    }
    let n = e[0];
    if (n && "location" in n) {
      return yUo(e, t);
    }
    let o = ["Document symbols:"];
    for (let s of e) {
      o.push(...uOl(s));
    }
    return o.join(`
`);
  }
  function yUo(e, t) {
    if (!e || e.length === 0) {
      return "No symbols found in workspace. This may occur if the workspace is empty, or if the LSP server has not finished indexing the project.";
    }
    let n = e.filter(i => !i || !i.location || !i.location.uri);
    if (n.length > 0) {
      logForDebugging(`formatWorkspaceSymbolResult: Filtering out ${n.length} invalid symbol(s) - this should have been caught earlier`, {
        level: "warn"
      });
    }
    let r = e.filter(i => i && i.location && i.location.uri);
    if (r.length === 0) {
      return "No symbols found in workspace. This may occur if the workspace is empty, or if the LSP server has not finished indexing the project.";
    }
    let o = [`Found ${r.length} ${un(r.length, "symbol")} in workspace:`];
    let s = aOl(r, t);
    for (let [i, a] of s) {
      o.push(`
${i}:`);
      for (let l of a) {
        let c = lEt(l.kind);
        let u = l.location.range.start.line + 1;
        let d = `  ${l.name} (${c}) - Line ${u}`;
        if (l.containerName) {
          d += ` in ${l.containerName}`;
        }
        o.push(d);
      }
    }
    return o.join(`
`);
  }
  function sOl(e, t) {
    if (!e.uri) {
      logForDebugging("formatCallHierarchyItem: CallHierarchyItem has undefined URI", {
        level: "warn"
      });
      return `${e.name} (${lEt(e.kind)}) - <unknown location>`;
    }
    let n = RJt(e.uri, t);
    let r = e.range.start.line + 1;
    let o = lEt(e.kind);
    let s = `${e.name} (${o}) - ${n}:${r}`;
    if (e.detail) {
      s += ` [${e.detail}]`;
    }
    return s;
  }
  function pOl(e, t) {
    if (!e || e.length === 0) {
      return "No call hierarchy item found at this position";
    }
    if (e.length === 1) {
      return `Call hierarchy item: ${sOl(e[0], t)}`;
    }
    let n = [`Found ${e.length} call hierarchy items:`];
    for (let r of e) {
      n.push(`  ${sOl(r, t)}`);
    }
    return n.join(`
`);
  }
  function mOl(e, t) {
    if (!e || e.length === 0) {
      return "No incoming calls found (nothing calls this function)";
    }
    let n = [`Found ${e.length} incoming ${un(e.length, "call")}:`];
    let r = new Map();
    for (let o of e) {
      if (!o.from) {
        logForDebugging("formatIncomingCallsResult: CallHierarchyIncomingCall has undefined from field", {
          level: "warn"
        });
        continue;
      }
      let s = RJt(o.from.uri, t);
      let i = r.get(s);
      if (i) {
        i.push(o);
      } else {
        r.set(s, [o]);
      }
    }
    for (let [o, s] of r) {
      n.push(`
${o}:`);
      for (let i of s) {
        if (!i.from) {
          continue;
        }
        let a = lEt(i.from.kind);
        let l = i.from.range.start.line + 1;
        let c = `  ${i.from.name} (${a}) - Line ${l}`;
        if (i.fromRanges && i.fromRanges.length > 0) {
          let u = i.fromRanges.map(d => `${d.start.line + 1}:${d.start.character + 1}`).join(", ");
          c += ` [calls at: ${u}]`;
        }
        n.push(c);
      }
    }
    return n.join(`
`);
  }
  function fOl(e, t) {
    if (!e || e.length === 0) {
      return "No outgoing calls found (this function calls nothing)";
    }
    let n = [`Found ${e.length} outgoing ${un(e.length, "call")}:`];
    let r = new Map();
    for (let o of e) {
      if (!o.to) {
        logForDebugging("formatOutgoingCallsResult: CallHierarchyOutgoingCall has undefined to field", {
          level: "warn"
        });
        continue;
      }
      let s = RJt(o.to.uri, t);
      let i = r.get(s);
      if (i) {
        i.push(o);
      } else {
        r.set(s, [o]);
      }
    }
    for (let [o, s] of r) {
      n.push(`
${o}:`);
      for (let i of s) {
        if (!i.to) {
          continue;
        }
        let a = lEt(i.to.kind);
        let l = i.to.range.start.line + 1;
        let c = `  ${i.to.name} (${a}) - Line ${l}`;
        if (i.fromRanges && i.fromRanges.length > 0) {
          let u = i.fromRanges.map(d => `${d.start.line + 1}:${d.start.character + 1}`).join(", ");
          c += ` [called from: ${u}]`;
        }
        n.push(c);
      }
    }
    return n.join(`
`);
  }
  var iOl;
  var hOl = __lazy(() => {
    je();
    dt();
    Zn();
    iOl = require("path");
  });
  var gOl;
  var yOl = __lazy(() => {
    gOl = we(() => {
      let e = v.strictObject({
        operation: v.literal("goToDefinition"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let t = v.strictObject({
        operation: v.literal("findReferences"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let n = v.strictObject({
        operation: v.literal("hover"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let r = v.strictObject({
        operation: v.literal("documentSymbol"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let o = v.strictObject({
        operation: v.literal("workspaceSymbol"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional().describe("The symbol name or partial name to search for. Most language servers return no results for an empty query.")
      });
      let s = v.strictObject({
        operation: v.literal("goToImplementation"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let i = v.strictObject({
        operation: v.literal("prepareCallHierarchy"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let a = v.strictObject({
        operation: v.literal("incomingCalls"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      let l = v.strictObject({
        operation: v.literal("outgoingCalls"),
        filePath: v.string().describe("The absolute or relative path to the file"),
        line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
        character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
        query: v.string().optional()
      });
      return v.discriminatedUnion("operation", [e, t, n, r, o, s, i, a, l]);
    });
  });
  function bOl(e, t, n) {
    try {
      let r = zt();
      let o = us(e);
      let {
        buffer: s,
        bytesRead: i
      } = r.readSync(o, {
        length: 65536
      });
      let l = s.toString("utf-8", 0, i).split(`
`);
      if (t < 0 || t >= l.length) {
        return null;
      }
      if (i === 65536 && t === l.length - 1) {
        return null;
      }
      let c = l[t];
      if (!c || n < 0 || n >= c.length) {
        return null;
      }
      let u = /[\w$'!]+|[+\-*/%&|^~<>=]+/g;
      let d;
      while ((d = u.exec(c)) !== null) {
        let p = d.index;
        let m = p + d[0].length;
        if (n >= p && n < m) {
          let f = d[0];
          return truncate(f, 30);
        }
      }
      return null;
    } catch (r) {
      if (r instanceof Error) {
        logForDebugging(`Symbol extraction failed for ${e}:${t}:${n}: ${r.message}`, {
          level: "warn"
        });
      }
      return null;
    }
  }
  var SOl = __lazy(() => {
    je();
    cs();
    ku();
  });
  function _Dm(e) {
    let t = TOl.c(24);
    let {
      operation: n,
      resultCount: r,
      fileCount: o,
      content: s,
      verbose: i
    } = e;
    let a;
    if (t[0] !== n) {
      a = yDm[n] || {
        singular: "result",
        plural: "results"
      };
      t[0] = n;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c = r === 1 ? l.singular : l.plural;
    let u;
    if (t[2] !== c || t[3] !== l.special || t[4] !== n || t[5] !== r) {
      u = n === "hover" && r > 0 && l.special ? M0.jsxs(Text, {
        children: ["Hover info ", l.special]
      }) : M0.jsxs(Text, {
        children: ["Found ", M0.jsxs(Text, {
          bold: true,
          children: [r, " "]
        }), c]
      });
      t[2] = c;
      t[3] = l.special;
      t[4] = n;
      t[5] = r;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d = u;
    let p;
    if (t[7] !== o) {
      p = o > 1 ? M0.jsxs(Text, {
        children: [" ", "across ", M0.jsxs(Text, {
          bold: true,
          children: [o, " "]
        }), "files"]
      }) : null;
      t[7] = o;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m = p;
    if (i) {
      let g;
      if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
        g = M0.jsx(Text, {
          dimColor: true,
          children: "\xA0\xA0\u23BF \xA0"
        });
        t[9] = g;
      } else {
        g = t[9];
      }
      let y;
      if (t[10] !== d || t[11] !== m) {
        y = M0.jsx(gXd, {
          flexDirection: "row",
          children: M0.jsxs(Text, {
            children: [g, d, m]
          })
        });
        t[10] = d;
        t[11] = m;
        t[12] = y;
      } else {
        y = t[12];
      }
      let _;
      if (t[13] !== s) {
        _ = M0.jsx(gXd, {
          marginLeft: 5,
          children: M0.jsx(Text, {
            children: s
          })
        });
        t[13] = s;
        t[14] = _;
      } else {
        _ = t[14];
      }
      let b;
      if (t[15] !== y || t[16] !== _) {
        b = M0.jsxs(gXd, {
          flexDirection: "column",
          children: [y, _]
        });
        t[15] = y;
        t[16] = _;
        t[17] = b;
      } else {
        b = t[17];
      }
      return b;
    }
    let f;
    if (t[18] !== r) {
      f = r > 0 && M0.jsx(wv, {});
      t[18] = r;
      t[19] = f;
    } else {
      f = t[19];
    }
    let h;
    if (t[20] !== d || t[21] !== m || t[22] !== f) {
      h = M0.jsx(Vn, {
        height: 1,
        children: M0.jsxs(Text, {
          children: [d, m, " ", f]
        })
      });
      t[20] = d;
      t[21] = m;
      t[22] = f;
      t[23] = h;
    } else {
      h = t[23];
    }
    return h;
  }
  function EOl() {
    return "LSP";
  }
  function vOl(e, {
    verbose: t
  }) {
    if (!e.operation) {
      return null;
    }
    let n = [];
    if ((e.operation === "goToDefinition" || e.operation === "findReferences" || e.operation === "hover" || e.operation === "goToImplementation") && e.filePath && e.line !== undefined && e.character !== undefined) {
      let r = bOl(e.filePath, e.line - 1, e.character - 1);
      let o = t ? e.filePath : Pd(e.filePath);
      if (r) {
        n.push(`operation: "${e.operation}"`);
        n.push(`symbol: "${r}"`);
        n.push(`in: "${o}"`);
      } else {
        n.push(`operation: "${e.operation}"`);
        n.push(`file: "${o}"`);
        n.push(`position: ${e.line}:${e.character}`);
      }
      return n.join(", ");
    }
    if (n.push(`operation: "${e.operation}"`), e.filePath) {
      let r = t ? e.filePath : Pd(e.filePath);
      n.push(`file: "${r}"`);
    }
    return n.join(", ");
  }
  function wOl(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string" && Nl(e, "tool_use_error")) {
      return M0.jsx(Vn, {
        children: M0.jsx(Text, {
          color: "error",
          children: "LSP operation failed"
        })
      });
    }
    return M0.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function COl(e, t, {
    verbose: n
  }) {
    if (e.resultCount !== undefined && e.fileCount !== undefined) {
      return M0.jsx(_Dm, {
        operation: e.operation,
        resultCount: e.resultCount,
        fileCount: e.fileCount,
        content: e.result,
        verbose: n
      });
    }
    return M0.jsx(Vn, {
      children: M0.jsx(Text, {
        children: e.result
      })
    });
  }
  var TOl;
  var M0;
  var yDm;
  var ROl = __lazy(() => {
    Xq();
    KG();
    Wl();
    et();
    Zl();
    ro();
    SOl();
    TOl = __toESM(pt(), 1);
    M0 = __toESM(ie(), 1);
    yDm = {
      goToDefinition: {
        singular: "definition",
        plural: "definitions"
      },
      findReferences: {
        singular: "reference",
        plural: "references"
      },
      documentSymbol: {
        singular: "symbol",
        plural: "symbols"
      },
      workspaceSymbol: {
        singular: "symbol",
        plural: "symbols"
      },
      hover: {
        singular: "hover info",
        plural: "hover info",
        special: "available"
      },
      goToImplementation: {
        singular: "implementation",
        plural: "implementations"
      },
      prepareCallHierarchy: {
        singular: "call item",
        plural: "call items"
      },
      incomingCalls: {
        singular: "caller",
        plural: "callers"
      },
      outgoingCalls: {
        singular: "callee",
        plural: "callees"
      }
    };
  });
  function EDm(e, t) {
    let n = AOl.pathToFileURL(t).href;
    let r = {
      line: e.line - 1,
      character: e.character - 1
    };
    switch (e.operation) {
      case "goToDefinition":
        return {
          method: "textDocument/definition",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
      case "findReferences":
        return {
          method: "textDocument/references",
          params: {
            textDocument: {
              uri: n
            },
            position: r,
            context: {
              includeDeclaration: true
            }
          }
        };
      case "hover":
        return {
          method: "textDocument/hover",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
      case "documentSymbol":
        return {
          method: "textDocument/documentSymbol",
          params: {
            textDocument: {
              uri: n
            }
          }
        };
      case "workspaceSymbol":
        return {
          method: "workspace/symbol",
          params: {
            query: e.query ?? ""
          }
        };
      case "goToImplementation":
        return {
          method: "textDocument/implementation",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
      case "prepareCallHierarchy":
        return {
          method: "textDocument/prepareCallHierarchy",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
      case "incomingCalls":
        return {
          method: "textDocument/prepareCallHierarchy",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
      case "outgoingCalls":
        return {
          method: "textDocument/prepareCallHierarchy",
          params: {
            textDocument: {
              uri: n
            },
            position: r
          }
        };
    }
  }
  function IOl(e) {
    let t = e.length;
    for (let n of e) {
      if (n.children && n.children.length > 0) {
        t += IOl(n.children);
      }
    }
    return t;
  }
  function pnr(e) {
    return new Set(e.map(t => t.uri)).size;
  }
  function vDm(e) {
    let t = e.replace(/^file:\/\//, "");
    if (/^\/[A-Za-z]:/.test(t)) {
      t = t.slice(1);
    }
    try {
      t = decodeURIComponent(t);
    } catch {}
    return t;
  }
  async function xOl(e, t) {
    if (e.length === 0) {
      return e;
    }
    let n = new Map();
    for (let i of e) {
      if (i.uri && !n.vZc(i.uri)) {
        n.set(i.uri, vDm(i.uri));
      }
    }
    let r = Ro(n.values());
    if (r.length === 0) {
      return e;
    }
    let o = new Set();
    let s = 50;
    for (let i = 0; i < r.length; i += s) {
      let a = r.slice(i, i + s);
      let l = await execFileNoThrowWithCwd("git", ["check-ignore", ...a], {
        cwd: t,
        preserveOutputOnError: false,
        timeout: 5000
      });
      if (l.code === 0 && l.stdout) {
        for (let c of l.stdout.split(`
`)) {
          let u = c.trim();
          if (u) {
            o.add(u);
          }
        }
      }
    }
    if (o.size === 0) {
      return e;
    }
    return e.filter(i => {
      let a = n.get(i.uri);
      return !a || !o.vZc(a);
    });
  }
  function wDm(e) {
    return "targetUri" in e;
  }
  function mnr(e) {
    if (wDm(e)) {
      return {
        uri: e.targetUri,
        range: e.targetSelectionRange || e.targetRange
      };
    }
    return e;
  }
  function CDm(e, t, n) {
    switch (e) {
      case "goToDefinition":
        {
          let o = (Array.isArray(t) ? t : t ? [t] : []).map(mnr);
          let s = o.filter(a => !a || !a.uri);
          if (s.length > 0) {
            logForDebugging(`LSP server returned ${s.length} location(s) with undefined URI for goToDefinition on ${n}. This indicates malformed data from the LSP server.`, {
              level: "error"
            });
          }
          let i = o.filter(a => a && a.uri);
          return {
            formatted: gUo(t, n),
            resultCount: i.length,
            fileCount: pnr(i)
          };
        }
      case "findReferences":
        {
          let r = t || [];
          let o = r.filter(i => !i || !i.uri);
          if (o.length > 0) {
            logForDebugging(`LSP server returned ${o.length} location(s) with undefined URI for findReferences on ${n}. This indicates malformed data from the LSP server.`, {
              level: "error"
            });
          }
          let s = r.filter(i => i && i.uri);
          return {
            formatted: lOl(t, n),
            resultCount: s.length,
            fileCount: pnr(s)
          };
        }
      case "hover":
        return {
          formatted: cOl(t, n),
          resultCount: t ? 1 : 0,
          fileCount: t ? 1 : 0
        };
      case "documentSymbol":
        {
          let r = t || [];
          let s = r.length > 0 && r[0] && "range" in r[0] ? IOl(r) : r.length;
          return {
            formatted: dOl(t, n),
            resultCount: s,
            fileCount: r.length > 0 ? 1 : 0
          };
        }
      case "workspaceSymbol":
        {
          let r = t || [];
          let o = r.filter(a => !a || !a.location || !a.location.uri);
          if (o.length > 0) {
            logForDebugging(`LSP server returned ${o.length} symbol(s) with undefined location URI for workspaceSymbol on ${n}. This indicates malformed data from the LSP server.`, {
              level: "error"
            });
          }
          let s = r.filter(a => a && a.location && a.location.uri);
          let i = s.map(a => a.location);
          return {
            formatted: yUo(t, n),
            resultCount: s.length,
            fileCount: pnr(i)
          };
        }
      case "goToImplementation":
        {
          let o = (Array.isArray(t) ? t : t ? [t] : []).map(mnr);
          let s = o.filter(a => !a || !a.uri);
          if (s.length > 0) {
            logForDebugging(`LSP server returned ${s.length} location(s) with undefined URI for goToImplementation on ${n}. This indicates malformed data from the LSP server.`, {
              level: "error"
            });
          }
          let i = o.filter(a => a && a.uri);
          return {
            formatted: gUo(t, n),
            resultCount: i.length,
            fileCount: pnr(i)
          };
        }
      case "prepareCallHierarchy":
        {
          let r = t || [];
          return {
            formatted: pOl(t, n),
            resultCount: r.length,
            fileCount: r.length > 0 ? RDm(r) : 0
          };
        }
      case "incomingCalls":
        {
          let r = t || [];
          return {
            formatted: mOl(t, n),
            resultCount: r.length,
            fileCount: r.length > 0 ? xDm(r) : 0
          };
        }
      case "outgoingCalls":
        {
          let r = t || [];
          return {
            formatted: fOl(t, n),
            resultCount: r.length,
            fileCount: r.length > 0 ? kDm(r) : 0
          };
        }
    }
  }
  function RDm(e) {
    let t = e.map(n => n.uri).filter(n => n);
    return new Set(t).size;
  }
  function xDm(e) {
    let t = e.map(n => n.from?.uri).filter(n => n);
    return new Set(t).size;
  }
  function kDm(e) {
    let t = e.map(n => n.to?.uri).filter(n => n);
    return new Set(t).size;
  }
  var kOl;
  var _Uo;
  var AOl;
  var SDm;
  var TDm;
  var bUo;
  var POl = __lazy(() => {
    Tpe();
    ci();
    Sl();
    vo();
    je();
    dt();
    ji();
    Rn();
    ku();
    wm();
    hOl();
    yOl();
    ROl();
    kOl = require("fs/promises");
    _Uo = __toESM(require("path"));
    AOl = require("url");
    SDm = we(() => v.strictObject({
      operation: v.enum(["goToDefinition", "findReferences", "hover", "documentSymbol", "workspaceSymbol", "goToImplementation", "prepareCallHierarchy", "incomingCalls", "outgoingCalls"]).describe("The LSP operation to perform"),
      filePath: v.string().describe("The absolute or relative path to the file"),
      line: v.number().int().positive().describe("The line number (1-based, as shown in editors)"),
      character: v.number().int().positive().describe("The character offset (1-based, as shown in editors)"),
      query: v.string().optional().describe("The symbol name or partial name to search for (workspaceSymbol only). Most language servers return no results for an empty query, so always provide it when using workspaceSymbol.")
    }));
    TDm = we(() => v.object({
      operation: v.enum(["goToDefinition", "findReferences", "hover", "documentSymbol", "workspaceSymbol", "goToImplementation", "prepareCallHierarchy", "incomingCalls", "outgoingCalls"]).describe("The LSP operation that was performed"),
      result: v.string().describe("The formatted result of the LSP operation"),
      filePath: v.string().describe("The file path the operation was performed on"),
      resultCount: v.number().int().nonnegative().optional().describe("Number of results (definitions, references, symbols)"),
      fileCount: v.number().int().nonnegative().optional().describe("Number of files containing results")
    }));
    bUo = Xs({
      name: "LSP",
      searchHint: "code intelligence (definitions, references, symbols, hover)",
      maxResultSizeChars: 1e5,
      isLsp: true,
      async description() {
        return yDo;
      },
      userFacingName: EOl,
      shouldDefer: true,
      isEnabled() {
        return DWa();
      },
      get inputSchema() {
        return SDm();
      },
      get outputSchema() {
        return TDm();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      ruleContentField: "filePath",
      getPath({
        filePath: e
      }) {
        return us(e);
      },
      async validateInput(e) {
        let t = gOl().safeParse(e);
        if (!t.success) {
          return {
            result: false,
            message: `Invalid input: ${t.error.message}`,
            errorCode: 3
          };
        }
        let n = zt();
        let r = us(e.filePath);
        if (r.startsWith("\\\\") || r.startsWith("//")) {
          return {
            result: true
          };
        }
        let o;
        try {
          o = await n.stat(r);
        } catch (s) {
          if (fn(s)) {
            return {
              result: false,
              message: `File does not exist: ${e.filePath}`,
              errorCode: 1
            };
          }
          let i = sr(s);
          logForDebugging(`Failed to access file stats for LSP operation on ${e.filePath}: ${i.message}`, {
            level: "error"
          });
          return {
            result: false,
            message: `Cannot access file: ${e.filePath}. ${i.message}`,
            errorCode: 4
          };
        }
        if (!o.isFile()) {
          return {
            result: false,
            message: `Path is not a file: ${e.filePath}`,
            errorCode: 2
          };
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        return checkReadPermissionForTool(bUo, e, getToolPermissionContext(t));
      },
      async prompt() {
        return yDo;
      },
      renderToolUseMessage: vOl,
      renderToolUseErrorMessage: wOl,
      renderToolResultMessage: COl,
      async call(e, t) {
        let n = us(e.filePath);
        let r = Nt();
        if (Iht().status === "pending") {
          await MWa();
        }
        let s = vNe();
        if (!s) {
          Oe(Error("LSP server manager not initialized when tool was called"));
          return {
            data: {
              operation: e.operation,
              result: "LSP server manager not initialized. This may indicate a startup issue.",
              filePath: e.filePath
            }
          };
        }
        let {
          method: i,
          params: a
        } = EDm(e, n);
        try {
          if (!s.isFileOpen(n)) {
            let m = await kOl.open(n, "r");
            try {
              let f = await m.stat();
              if (f.size > 1e7) {
                return {
                  data: {
                    operation: e.operation,
                    result: `File too large for LSP analysis (${Math.ceil(f.size / 1e6)}MB exceeds 10MB limit)`,
                    filePath: e.filePath
                  }
                };
              }
              let h = await m.readFile({
                encoding: "utf-8"
              });
              await s.openFile(n, h);
            } finally {
              await m.close();
            }
          }
          let l = await s.sendRequest(n, i, a);
          if (l === undefined) {
            logForDebugging(`No LSP server available for file type ${_Uo.extname(n)} for operation ${e.operation} on file ${e.filePath}`);
            return {
              data: {
                operation: e.operation,
                result: `No LSP server available for file type: ${_Uo.extname(n)}`,
                filePath: e.filePath
              }
            };
          }
          if (e.operation === "incomingCalls" || e.operation === "outgoingCalls") {
            let m = l;
            if (!m || m.length === 0) {
              return {
                data: {
                  operation: e.operation,
                  result: "No call hierarchy item found at this position",
                  filePath: e.filePath,
                  resultCount: 0,
                  fileCount: 0
                }
              };
            }
            let f = e.operation === "incomingCalls" ? "callHierarchy/incomingCalls" : "callHierarchy/outgoingCalls";
            if (l = await s.sendRequest(n, f, {
              item: m[0]
            }), l === undefined) {
              logForDebugging(`LSP server returned undefined for ${f} on ${e.filePath}`);
            }
          }
          if (l && Array.isArray(l) && (e.operation === "findReferences" || e.operation === "goToDefinition" || e.operation === "goToImplementation" || e.operation === "workspaceSymbol")) {
            if (e.operation === "workspaceSymbol") {
              let m = l;
              let f = m.filter(y => y?.location?.uri).map(y => y.location);
              let h = await xOl(f, r);
              let g = new Set(h.map(y => y.uri));
              l = m.filter(y => !y?.location?.uri || g.vZc(y.location.uri));
            } else {
              let m = l.map(mnr);
              let f = await xOl(m, r);
              let h = new Set(f.map(g => g.uri));
              l = l.filter(g => {
                let y = mnr(g);
                return !y.uri || h.vZc(y.uri);
              });
            }
          }
          let {
            formatted: c,
            resultCount: u,
            fileCount: d
          } = CDm(e.operation, l, r);
          return {
            data: {
              operation: e.operation,
              result: c,
              filePath: e.filePath,
              resultCount: u,
              fileCount: d
            }
          };
        } catch (l) {
          let u = sr(l).message;
          logForDebugging(`LSP tool request failed for ${e.operation} on ${e.filePath}: ${u}`, {
            level: "error"
          });
          return {
            data: {
              operation: e.operation,
              result: `Error performing ${e.operation}: ${u}`,
              filePath: e.filePath
            }
          };
        }
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: e.result
        };
      }
    });
  });
  function N0(e, t) {
    return {
      name: e,
      compute: t,
      cacheBreak: false
    };
  }
  async function OOl(e) {
    let t = getSystemPromptSectionCache();
    return Promise.all(e.map(async n => {
      if (!n.cacheBreak && t.vZc(n.name)) {
        return t.get(n.name) ?? null;
      }
      let r = await n.compute();
      setSystemPromptSectionCacheEntry(n.name, r);
      return r;
    }));
  }
  function cFe() {
    clearSystemPromptSectionState();
    clearBetaHeaderLatches();
  }
  var xJt = __lazy(() => {
    at();
  });
  function DOl() {
    return `Use this tool ONLY when explicitly instructed to work in a worktree \u2014 either by the user directly, or by project instructions (CLAUDE.md / memory). This tool creates an isolated git worktree and switches the current session into it.

## When to Use

- The user explicitly says "worktree" (e.g., "start a worktree", "work in a worktree", "create a worktree", "use a worktree")
- CLAUDE.md or memory instructions direct you to work in a worktree for the current task

## When NOT to Use

- The user asks to create a branch, switch branches, or work on a different branch \u2014 use git commands instead
- The user asks to fix a bug or work on a feature \u2014 use normal git workflow unless worktrees are explicitly requested by the user or project instructions
- Never use this tool unless "worktree" is explicitly mentioned by the user or in CLAUDE.md / memory instructions

## Requirements

- Must be in a git repository, OR have WorktreeCreate/WorktreeRemove hooks configured in settings.json
- Must not already be in a worktree session when creating a new worktree (\`name\`); switching into another existing worktree via \`path\` is allowed

## Behavior

- In a git repository: creates a new git worktree inside \`.claude/worktrees/\` on a new branch. The base ref is governed by the \`worktree.baseRef\` setting: \`fresh\` (default) branches from origin/<default-branch>; \`head\` branches from your current local HEAD
- Outside a git repository: delegates to WorktreeCreate/WorktreeRemove hooks for VCS-agnostic isolation
- Switches the session's working directory to the new worktree
- Use ExitWorktree to leave the worktree mid-session (keep or remove). On session exit, if still in the worktree, the user will be prompted to keep or remove it

## Entering an existing worktree

Pass \`path\` instead of \`name\` to switch the session into a worktree that already exists (e.g., one you just created with \`git worktree add\`). The path must appear in \`git worktree list\` for the current repository \u2014 paths that are not registered worktrees of this repo are rejected. ExitWorktree will not remove a worktree entered this way; use \`action: "keep"\` to return to the original directory.

Switching with \`path\` also works when the session is already in a worktree (the previous worktree is left on disk, untouched, and only the new one is tracked for exit-time cleanup), and from agents whose working directory was pinned at launch (subagent isolation or explicit cwd). In both cases the target must be a worktree under \`.claude/worktrees/\` of the same repository, and from a pinned agent the switch only affects this agent, not the parent session. After a further switch, previously-visited worktrees are no longer writable \u2014 re-issue EnterWorktree with \`path\` to return to one.

## Parameters

- \`name\` (optional): A name for a new worktree. If neither \`name\` nor \`path\` is provided, a random name is generated.
- \`path\` (optional): Path to an existing worktree of the current repository to enter instead of creating one. Mutually exclusive with \`name\`.
`;
  }
  function MOl({
    name: e,
    path: t
  }) {
    return t ?? e ?? "";
  }
  function NOl(e, t, n) {
    return uFe.jsx(Vn, {
      children: uFe.jsxs(gXd, {
        flexDirection: "column",
        children: [uFe.jsxs(Text, {
          children: ["Switched to worktree", e.worktreeBranch ? uFe.jsxs(Text, {
            children: [" ", "on branch ", uFe.jsx(Text, {
              bold: true,
              children: e.worktreeBranch
            })]
          }) : null]
        }), uFe.jsx(Text, {
          dimColor: true,
          children: e.worktreePath
        })]
      })
    });
  }
  var uFe;
  var LOl = __lazy(() => {
    Wl();
    et();
    uFe = __toESM(ie(), 1);
  });
  var FOl;
  var ADm;
  var IDm;
  var UOl;
  var BOl = __lazy(() => {
    at();
    x$();
    xJt();
    Ot();
    ci();
    bx();
    vo();
    je();
    dt();
    FP();
    na();
    Rn();
    xx();
    U1();
    fa();
    iP();
    LOl();
    FOl = require("path");
    ADm = we(() => v.strictObject({
      name: v.string().superRefine((e, t) => {
        try {
          validateWorktreeSlug(e);
        } catch (n) {
          t.addIssue({
            code: "custom",
            message: he(n)
          });
        }
      }).optional().describe('Optional name for a new worktree. Each "/"-separated segment may contain only letters, digits, dots, underscores, and dashes; max 64 chars total. A random name is generated if not provided. Mutually exclusive with `path`.'),
      path: v.string().optional().describe("Path to an existing worktree of the current repository to switch into instead of creating a new one. Must appear in `git worktree list` for the current repo. Mutually exclusive with `name`.")
    }).refine(e => !(e.name && e.path), {
      message: "Provide at most one of `name` or `path`, not both."
    }));
    IDm = we(() => v.object({
      worktreePath: v.string(),
      worktreeBranch: v.string().optional(),
      message: v.string()
    }));
    UOl = Xs({
      name: "EnterWorktree",
      searchHint: "create an isolated git worktree and switch into it",
      maxResultSizeChars: 1e5,
      async description() {
        return "Creates an isolated worktree (via git or configured hooks) and switches the session into it";
      },
      async prompt() {
        return DOl();
      },
      get inputSchema() {
        return ADm();
      },
      get outputSchema() {
        return IDm();
      },
      userFacingName(e) {
        return e?.path ? "Entering worktree" : "Creating worktree";
      },
      shouldDefer: true,
      toAutoClassifierInput(e) {
        return e.path ?? e.name ?? "";
      },
      async validateInput(e) {
        if (XHe()) {
          if (e.path) {
            return {
              result: true
            };
          }
          let t = Nt();
          let n = findCanonicalGitRoot(t);
          return {
            result: false,
            message: `EnterWorktree cannot create a worktree from a subagent with a cwd override (isolation: "worktree" or explicit cwd) \u2014 it would mutate the parent session's process-wide working directory. ` + (n != null && t !== n && t.startsWith(n + FOl.sep) ? "To switch this agent into an existing worktree managed by Claude Code (under .claude/worktrees/ of this repository), call EnterWorktree with `path`. To work in any other directory, spawn an Agent with `cwd` set to it." : "To work in a different directory (including a worktree), spawn an Agent with `cwd` set to it."),
            errorCode: 1
          };
        }
        if (getCurrentWorktreeSession() && !e.path) {
          return {
            result: false,
            message: "Already in a worktree session. Pass `path` to switch into another existing worktree, or use ExitWorktree to leave this one before creating a new worktree.",
            errorCode: 2
          };
        }
        return {
          result: true
        };
      },
      renderToolUseMessage: MOl,
      renderToolResultMessage: NOl,
      async call(e, t) {
        if (XHe()) {
          if (!e.path) {
            throw new WorktreeIsolationError("EnterWorktree from a session with a pinned working directory requires `path`.");
          }
          let s = await resolveExistingWorktreeTarget(e.path, {
            requireManagedLocation: true,
            requireCwdInsideRepo: true
          });
          if (By(s.worktreePath), Gho(s.worktreePath, t.agentId ?? getSessionId()), t.agentId) {
            try {
              let a = await readAgentMetadata(t.agentId);
              if (a) {
                await writeAgentMetadata(t.agentId, {
                  ...a,
                  cwd: s.worktreePath
                });
              }
            } catch (a) {
              logForDebugging(`Failed to update agent metadata cwd after worktree switch: ${he(a)}`);
            }
          }
          logEvent("tengu_worktree_entered_existing", {
            mid_session: true,
            cwd_override: true
          });
          let i = s.worktreeBranch ? ` on branch ${s.worktreeBranch}` : "";
          return {
            data: {
              worktreePath: s.worktreePath,
              worktreeBranch: s.worktreeBranch,
              message: `Entered worktree at ${s.worktreePath}${i}. This agent's working directory and write access now point at the worktree; the previous directory was left untouched.`
            },
            contextLayers: [{
              kind: "working_directory",
              directory: s.worktreePath
            }]
          };
        }
        if (getCurrentWorktreeSession() && !e.path) {
          throw Error("Already in a worktree session");
        }
        let n;
        if (e.path) {
          n = await enterExistingWorktreeForSession(getSessionId(), e.path);
        } else {
          let s = Nt();
          let i = findCanonicalGitRoot(s);
          let a = false;
          if (i && i !== s) {
            process.chdir(i);
            By(i);
            a = true;
          }
          try {
            n = await createWorktreeForSession(getSessionId(), e.name ?? getPlanSlug(), undefined, {
              fromCwd: s
            });
          } catch (l) {
            if (a) {
              try {
                process.chdir(s);
                By(s);
              } catch {
                reanchorGitFileWatcher();
                vS()?.refreshGitBranch?.();
              }
            }
            throw l;
          }
        }
        if (process.chdir(n.worktreePath), By(n.worktreePath), setOriginalCwd(Nt()), !n.hookBased) {
          try {
            await relocateSessionTranscript();
          } catch (s) {
            Oe(s);
          }
        }
        Gho(n.worktreePath, getSessionId());
        saveWorktreeState(n);
        cFe();
        clearMemoryFileCaches();
        getPlansDirectory.cache.clear?.();
        reanchorGitFileWatcher();
        vS()?.refreshGitBranch?.();
        logEvent(e.path ? "tengu_worktree_entered_existing" : "tengu_worktree_created", {
          mid_session: true
        });
        let r = n.worktreeBranch ? ` on branch ${n.worktreeBranch}` : "";
        let o = e.path ? "Entered" : "Created";
        return {
          data: {
            worktreePath: n.worktreePath,
            worktreeBranch: n.worktreeBranch,
            message: `${o} worktree at ${n.worktreePath}${r}. The session is now working in the worktree. Use ExitWorktree to leave mid-session, or exit the session to be prompted.`
          }
        };
      },
      mapToolResultToToolResultBlockParam({
        message: e
      }, t) {
        return {
          type: "tool_result",
          content: e,
          tool_use_id: t
        };
      }
    });
  });
  function $Ol() {
    return `Exit a worktree session created by EnterWorktree and return the session to the original working directory.

## Scope

This tool ONLY operates on worktrees created by EnterWorktree in this session. It will NOT touch:
- Worktrees you created manually with \`git worktree add\`
- Worktrees from a previous session (even if created by EnterWorktree then)
- The directory you're in if EnterWorktree was never called

If called outside an EnterWorktree session, the tool is a **no-op**: it reports that no worktree session is active and takes no action. Filesystem state is unchanged.

## When to Use

- The user explicitly asks to "exit the worktree", "leave the worktree", "go back", or otherwise end the worktree session
- Do NOT call this proactively \u2014 only when the user asks

## Parameters

- \`action\` (required): \`"keep"\` or \`"remove"\`
  - \`"keep"\` \u2014 leave the worktree directory and branch intact on disk. Use this if the user wants to come back to the work later, or if there are changes to preserve.
  - \`"remove"\` \u2014 delete the worktree directory and its branch. Use this for a clean exit when the work is done or abandoned.
- \`discard_changes\` (optional, default false): only meaningful with \`action: "remove"\`. If the worktree has uncommitted files or commits not on the original branch, the tool will REFUSE to remove it unless this is set to \`true\`. If the tool returns an error listing changes, confirm with the user before re-invoking with \`discard_changes: true\`.

## Behavior

- Restores the session's working directory to where it was before EnterWorktree
- Clears CWD-dependent caches (system prompt sections, memory files, plans directory) so the session state reflects the original directory
- If a tmux session was attached to the worktree: killed on \`remove\`, left running on \`keep\` (its name is returned so the user can reattach)
- Once exited, EnterWorktree can be called again to create a fresh worktree
`;
  }
  function HOl(e) {
    return "";
  }
  function jOl(e, t, n) {
    let r = e.action === "keep" ? "Kept worktree" : "Removed worktree";
    return ife.jsx(Vn, {
      children: ife.jsxs(gXd, {
        flexDirection: "column",
        children: [ife.jsxs(Text, {
          children: [r, e.worktreeBranch ? ife.jsxs(ife.Fragment, {
            children: [" ", "(branch ", ife.jsx(Text, {
              bold: true,
              children: e.worktreeBranch
            }), ")"]
          }) : null]
        }), ife.jsxs(Text, {
          dimColor: true,
          children: ["Returned to ", e.originalCwd]
        })]
      })
    });
  }
  var ife;
  var qOl = __lazy(() => {
    Wl();
    et();
    ife = __toESM(ie(), 1);
  });
  async function WOl(e, t) {
    let n = await execFileNoThrow(gitExe(), ["-C", e, "status", "--porcelain"]);
    if (n.code !== 0) {
      return null;
    }
    let r = Bn(n.stdout.split(`
`), i => i.trim() !== "");
    if (!t) {
      return null;
    }
    let o = await execFileNoThrow(gitExe(), ["-C", e, "rev-list", "--count", `${t}..HEAD`]);
    if (o.code !== 0) {
      return null;
    }
    let s = parseInt(o.stdout.trim(), 10) || 0;
    return {
      changedFiles: r,
      commits: s
    };
  }
  async function GOl(e, t, n, r) {
    let o = e;
    let s = false;
    try {
      By(e);
    } catch (a) {
      let l = false;
      try {
        await VOl.realpath(e);
      } catch (c) {
        l = fn(c);
      }
      if (!l) {
        throw a;
      }
      s = true;
      o = "";
      for (let c of [r, zOl.homedir(), F2()]) {
        try {
          By(c);
          o = c;
          break;
        } catch {}
      }
      if (!o) {
        throw a;
      }
      logForDebugging(`ExitWorktree: original directory "${e}" no longer exists; session cwd recovered to "${o}"`);
    }
    let i = s && o === r;
    if (!s || i) {
      setOriginalCwd(s ? o : t ?? o);
      try {
        await relocateSessionTranscript();
      } catch (a) {
        Oe(a);
      }
      if (n) {
        setProjectRoot(o);
        zIe();
      }
    }
    saveWorktreeState(null);
    cFe();
    clearMemoryFileCaches();
    getPlansDirectory.cache.clear?.();
    reanchorGitFileWatcher();
    vS()?.refreshGitBranch?.();
    return {
      restoredCwd: o,
      originalCwdMissing: s,
      fellBackToWorktree: i
    };
  }
  function TUo(e, t) {
    if (!t.originalCwdMissing) {
      return `Session is now back in ${e}.`;
    }
    let n = `The original directory ${e} no longer exists, so the session is now in ${t.restoredCwd}.`;
    return t.fellBackToWorktree ? n : `${n} Consider restarting Claude from an existing directory.`;
  }
  var VOl;
  var zOl;
  var PDm;
  var ODm;
  var KOl;
  var YOl = __lazy(() => {
    at();
    x$();
    xJt();
    Ot();
    ci();
    bx();
    vo();
    je();
    dt();
    ji();
    FP();
    na();
    i1();
    Rn();
    xx();
    U1();
    fa();
    BC();
    iP();
    qOl();
    VOl = require("fs/promises");
    zOl = require("os");
    PDm = we(() => v.strictObject({
      action: v.enum(["keep", "remove"]).describe('"keep" leaves the worktree and branch on disk; "remove" deletes both.'),
      discard_changes: v.boolean().optional().describe('Required true when action is "remove" and the worktree has uncommitted files or unmerged commits. The tool will refuse and list them otherwise.')
    }));
    ODm = we(() => v.object({
      action: v.enum(["keep", "remove"]),
      originalCwd: v.string(),
      worktreePath: v.string(),
      worktreeBranch: v.string().optional(),
      tmuxSessionName: v.string().optional(),
      discardedFiles: v.number().optional(),
      discardedCommits: v.number().optional(),
      message: v.string()
    }));
    KOl = Xs({
      name: "ExitWorktree",
      searchHint: "exit a worktree session and return to the original directory",
      maxResultSizeChars: 1e5,
      async description() {
        return "Exits a worktree session created by EnterWorktree and restores the original working directory";
      },
      async prompt() {
        return $Ol();
      },
      get inputSchema() {
        return PDm();
      },
      get outputSchema() {
        return ODm();
      },
      userFacingName(e) {
        return e?.action === "remove" ? "Cleaning up worktree" : "Exiting worktree";
      },
      shouldDefer: true,
      isDestructive(e) {
        return e.action === "remove";
      },
      toAutoClassifierInput(e) {
        return e.action;
      },
      async validateInput(e) {
        if (XHe()) {
          return {
            result: false,
            message: 'ExitWorktree cannot be called from a subagent with a cwd override (isolation: "worktree" or explicit cwd) \u2014 it would mutate the parent session\'s process-wide working directory. This agent is already isolated; use Bash with `cd` for directory changes within it.',
            errorCode: 5
          };
        }
        let t = getCurrentWorktreeSession();
        if (!t) {
          return {
            result: false,
            message: "No-op: there is no active EnterWorktree session to exit. This tool only operates on worktrees created by EnterWorktree in the current session \u2014 it will not touch worktrees created manually or in a previous session. No filesystem changes were made.",
            errorCode: 1
          };
        }
        if (e.action === "remove" && t.enteredExisting) {
          return {
            result: false,
            message: `This session entered an existing worktree (${t.worktreePath}); it was not created by EnterWorktree, so this tool will not remove it. Use action: "keep" to return to ${t.originalCwd}, then remove the worktree manually with \`git worktree remove\` if desired.`,
            errorCode: 4
          };
        }
        if (e.action === "remove" && !e.discard_changes) {
          let n = await WOl(t.worktreePath, t.originalHeadCommit);
          if (n === null) {
            return {
              result: false,
              message: `Could not verify worktree state at ${t.worktreePath}. Refusing to remove without explicit confirmation. Re-invoke with discard_changes: true to proceed \u2014 or use action: "keep" to preserve the worktree.`,
              errorCode: 3
            };
          }
          let {
            changedFiles: r,
            commits: o
          } = n;
          if (r > 0 || o > 0) {
            let s = [];
            if (r > 0) {
              s.push(`${r} uncommitted ${r === 1 ? "file" : "files"}`);
            }
            if (o > 0) {
              s.push(`${o} ${o === 1 ? "commit" : "commits"} on ${t.worktreeBranch ?? "the worktree branch"}`);
            }
            return {
              result: false,
              message: `Worktree has ${s.join(" and ")}. Removing will discard this work permanently. Confirm with the user, then re-invoke with discard_changes: true \u2014 or use action: "keep" to preserve the worktree.`,
              errorCode: 2
            };
          }
        }
        return {
          result: true
        };
      },
      renderToolUseMessage: HOl,
      renderToolResultMessage: jOl,
      async call(e) {
        let t = getCurrentWorktreeSession();
        if (!t) {
          throw Error("Not in a worktree session");
        }
        let {
          originalCwd: n,
          preEnterOriginalCwd: r,
          worktreePath: o,
          worktreeBranch: s,
          tmuxSessionName: i,
          originalHeadCommit: a
        } = t;
        let l = getProjectRoot() === getOriginalCwd();
        let {
          changedFiles: c,
          commits: u
        } = (await WOl(o, a)) ?? {
          changedFiles: 0,
          commits: 0
        };
        if (e.action === "keep") {
          await keepWorktree();
          let h = await GOl(n, r, l, o);
          logEvent("tengu_worktree_kept", {
            mid_session: true,
            commits: u,
            changed_files: c
          });
          let g = i ? ` Tmux session ${i} is still running; reattach with: tmux attach -t ${i}` : "";
          return {
            data: {
              action: "keep",
              originalCwd: n,
              worktreePath: o,
              worktreeBranch: s,
              tmuxSessionName: i,
              message: `Exited worktree. Your work is preserved at ${o}${s ? ` on branch ${s}` : ""}. ${TUo(n, h)}${g}`
            }
          };
        }
        if (i) {
          await killTmuxSession(i);
        }
        let d = await cleanupWorktree();
        let p = await GOl(n, r, l, o);
        if (!d) {
          return {
            data: {
              action: "remove",
              originalCwd: n,
              worktreePath: o,
              worktreeBranch: s,
              discardedFiles: 0,
              discardedCommits: 0,
              message: `Exited worktree but could not remove it \u2014 kept at ${o}. ${TUo(n, p)}`
            }
          };
        }
        logEvent("tengu_worktree_removed", {
          source: "exit_tool",
          mid_session: true,
          commits: u,
          changed_files: c
        });
        let m = [];
        if (u > 0) {
          m.push(`${u} ${u === 1 ? "commit" : "commits"}`);
        }
        if (c > 0) {
          m.push(`${c} uncommitted ${c === 1 ? "file" : "files"}`);
        }
        let f = m.length > 0 ? ` Discarded ${m.join(" and ")}.` : "";
        return {
          data: {
            action: "remove",
            originalCwd: n,
            worktreePath: o,
            worktreeBranch: s,
            discardedFiles: c,
            discardedCommits: u,
            message: `Exited and removed worktree at ${o}.${f} ${TUo(n, p)}`
          }
        };
      },
      mapToolResultToToolResultBlockParam({
        message: e
      }, t) {
        return {
          type: "tool_result",
          content: e,
          tool_use_id: t
        };
      }
    });
  });
  function AJt(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function xZ(e) {
    return typeof e === "string" && e.trim() !== "";
  }
  function hnr(e) {
    return "tasks" in e || "todos" in e;
  }
  function gnr(e) {
    return "prompt" in e || "subagent_type" in e;
  }
  function UDm(e) {
    let t = Ad(e).trim();
    let n = Array.from(t);
    if (n.length <= 80) {
      return t;
    }
    let r = n.slice(0, 80).join("");
    let o = r.lastIndexOf(" ");
    return (o > 40 ? r.slice(0, o) : r).trim();
  }
  function JOl(e) {
    if (!AJt(e)) {
      return null;
    }
    if (hnr(e)) {
      return null;
    }
    let t = [];
    let n = {
      ...e
    };
    if (gnr(n) && !(xZ(n.subject) && xZ(n.description))) {
      return null;
    }
    if (!("subject" in n) && !("description" in n) && "task" in n) {
      let o = n.task;
      if (xZ(o)) {
        delete n.task;
        n.description = o;
        t.push("task_wrapper_string");
      } else if (AJt(o)) {
        if (hnr(o)) {
          return null;
        }
        if (gnr(o) && !(xZ(o.subject) && xZ(o.description))) {
          return null;
        }
        delete n.task;
        Object.assign(n, o);
        t.push("task_wrapper_object");
      } else {
        return null;
      }
    }
    let r = [[MDm, "subject"], [NDm, "description"], [LDm, "activeForm"]];
    for (let [o, s] of r) {
      for (let i of o) {
        if (i in n && !(s in n) && xZ(n[i])) {
          n[s] = n[i];
          delete n[i];
          t.push(`alias_${i}`);
        }
      }
    }
    if (xZ(n.subject) && !("description" in n)) {
      n.description = n.subject;
      t.push("backfill_description");
    } else if (xZ(n.description) && !("subject" in n)) {
      n.subject = UDm(n.description);
      t.push("backfill_subject");
    }
    if (xZ(n.subject) && xZ(n.description)) {
      for (let o of Object.keys(n)) {
        if (!DDm.vZc(o)) {
          delete n[o];
          t.push(`strip_${FDm.vZc(o) ? o : "other"}`);
        }
      }
      if ("activeForm" in n && typeof n.activeForm !== "string") {
        delete n.activeForm;
        t.push("drop_invalid_activeForm");
      }
      if ("metadata" in n && !AJt(n.metadata)) {
        delete n.metadata;
        t.push("drop_invalid_metadata");
      }
    }
    if (t.length === 0) {
      return null;
    }
    return {
      input: n,
      shapeClass: t.join("+")
    };
  }
  function XOl(e) {
    if (!AJt(e)) {
      return null;
    }
    let t = AJt(e.task) ? e.task : null;
    if (hnr(e) || t !== null && hnr(t)) {
      return "TaskCreate creates ONE task per call and has no `tasks` or `todos` parameter. Call TaskCreate once per task, passing `subject` (a brief title) and `description` (what needs to be done) as top-level string parameters.";
    }
    if ((gnr(e) || t !== null && gnr(t)) && !(xZ(e.subject) && xZ(e.description))) {
      return "This call used Agent-tool parameters (`prompt`/`subagent_type`). TaskCreate adds an item to the task list and takes `subject` and `description` string parameters. To delegate work to a subagent, use the Agent tool instead.";
    }
    return null;
  }
  var DDm;
  var MDm;
  var NDm;
  var LDm;
  var FDm;
  var QOl = __lazy(() => {
    Zn();
    DDm = new Set(["subject", "description", "activeForm", "metadata"]);
    MDm = ["title", "name"];
    NDm = ["content"];
    LDm = ["active_form"];
    FDm = new Set(["status", "state", "priority", "prompt", "subagent_type", "id", "type", "owner", "blocks", "blockedBy", "addBlocks", "addBlockedBy"]);
  });
  function eDl() {
    let e = isAgentSwarmsEnabled() ? " and potentially assigned to teammates" : "";
    let t = isAgentSwarmsEnabled() ? "- Include enough detail in the description for another agent to understand and complete the task\n- New tasks are created with status 'pending' and no owner - use TaskUpdate with the `owner` parameter to assign them\n" : "";
    return `Use this tool to create a structured task list for your current coding session. This helps you track progress, organize complex tasks, and demonstrate thoroughness to the user.
It also helps the user understand the progress of the task and overall progress of their requests.

## When to Use This Tool

Use this tool proactively in these scenarios:

- Complex multi-step tasks - When a task requires 3 or more distinct steps or actions
- Non-trivial and complex tasks - Tasks that require careful planning or multiple operations${e}
- Plan mode - When using plan mode, create a task list to track the work
- User explicitly requests todo list - When the user directly asks you to use the todo list
- User provides multiple tasks - When users provide a list of things to be done (numbered or comma-separated)
- After receiving new instructions - Immediately capture user requirements as tasks
- When you start working on a task - Mark it as in_progress BEFORE beginning work
- After completing a task - Mark it as completed and add any new follow-up tasks discovered during implementation

## When NOT to Use This Tool

Skip using this tool when:
- There is only a single, straightforward task
- The task is trivial and tracking it provides no organizational benefit
- The task can be completed in less than 3 trivial steps
- The task is purely conversational or informational

NOTE that you should not use this tool if there is only one trivial task to do. In this case you are better off just doing the task directly.

## Task Fields

- **subject**: A brief, actionable title in imperative form (e.g., "Fix authentication bug in login flow")
- **description**: What needs to be done
- **activeForm** (optional): Present continuous form shown in the spinner when the task is in_progress (e.g., "Fixing authentication bug"). If omitted, the spinner shows the subject instead.

All tasks are created with status \`pending\`.

## Tips

- Create tasks with clear, specific subjects that describe the outcome
- After creating tasks, use TaskUpdate to set up dependencies (blocks/blockedBy) if needed
${t}- Check TaskList first to avoid creating duplicate tasks
`;
  }
  var tDl = __lazy(() => {
    mE();
  });
  var BDm;
  var $Dm;
  var nDl;
  var rDl = __lazy(() => {
    ci();
    Sp();
    YI();
    qp();
    QOl();
    tDl();
    BDm = we(() => v.strictObject({
      subject: v.string().describe("A brief title for the task"),
      description: v.string().describe("What needs to be done"),
      activeForm: v.string().optional().describe('Present continuous form shown in spinner when in_progress (e.g., "Running tests")'),
      metadata: v.record(v.string(), v.unknown()).optional().describe("Arbitrary metadata to attach to the task")
    }));
    $Dm = we(() => v.object({
      task: v.object({
        id: v.string(),
        subject: v.string()
      })
    }));
    nDl = Xs({
      name: "TaskCreate",
      searchHint: "create a task in the task list",
      maxResultSizeChars: 1e5,
      async description() {
        return "Create a new task in the task list";
      },
      async prompt() {
        return eDl();
      },
      get inputSchema() {
        return BDm();
      },
      get outputSchema() {
        return $Dm();
      },
      userFacingName() {
        return "TaskCreate";
      },
      shouldDefer: true,
      coerceInput: JOl,
      validationErrorSteer: XOl,
      isEnabled() {
        return sR();
      },
      isConcurrencySafe() {
        return false;
      },
      toAutoClassifierInput(e) {
        return e.subject;
      },
      renderToolUseMessage() {
        return null;
      },
      async call({
        subject: e,
        description: t,
        activeForm: n,
        metadata: r
      }, o, s, i, a) {
        let l = await Z5a(H$(), {
          subject: e,
          description: t,
          activeForm: n,
          status: "pending",
          owner: undefined,
          blocks: [],
          blockedBy: [],
          metadata: r
        });
        let c = [];
        let u = executeTaskCreatedHooks(l, e, t, getAgentName(), getTeamName(), undefined, o?.abortController?.signal, undefined, o);
        for await (let d of u) {
          if (d.blockingError) {
            c.push(getTaskCreatedHookMessage(d.blockingError));
          }
        }
        if (c.length > 0) {
          throw await K9n(H$(), l), Error(c.join(`
`));
        }
        a?.({
          type: "set_expanded_view",
          expandedView: "tasks"
        });
        return {
          data: {
            task: {
              id: l,
              subject: e
            }
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          task: n
        } = e;
        return {
          tool_use_id: t,
          type: "tool_result",
          content: `Task #${n.id} created successfully: ${n.subject}`
        };
      }
    });
  });
  var sDl = `Use this tool to retrieve a task by its ID from the task list.

## When to Use This Tool

- When you need the full description and context before starting work on a task
- To understand task dependencies (what it blocks, what blocks it)
- After being assigned a task, to get complete requirements

## Output

Returns full task details:
- **subject**: Task title
- **description**: Detailed requirements and context
- **status**: 'pending', 'in_progress', or 'completed'
- **blocks**: Tasks waiting on this one to complete
- **blockedBy**: Tasks that must complete before this one can start

## Tips

- After fetching a task, verify its blockedBy list is empty before beginning work.
- Use TaskList to see all tasks in summary form.
`;
  var HDm;
  var jDm;
  var iDl;
  var aDl = __lazy(() => {
    ci();
    YI();
    HDm = we(() => v.strictObject({
      taskId: v.string().describe("The ID of the task to retrieve")
    }));
    jDm = we(() => v.object({
      task: v.object({
        id: v.string(),
        subject: v.string(),
        description: v.string(),
        status: S8e(),
        blocks: v.array(v.string()),
        blockedBy: v.array(v.string())
      }).nullable()
    }));
    iDl = Xs({
      name: "TaskGet",
      searchHint: "retrieve a task by ID",
      maxResultSizeChars: 1e5,
      async description() {
        return "Get a task by ID from the task list";
      },
      async prompt() {
        return sDl;
      },
      get inputSchema() {
        return HDm();
      },
      get outputSchema() {
        return jDm();
      },
      userFacingName() {
        return "TaskGet";
      },
      shouldDefer: true,
      isEnabled() {
        return sR();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.taskId;
      },
      renderToolUseMessage() {
        return null;
      },
      async call({
        taskId: e
      }) {
        let t = H$();
        let n = await Voe(t, e);
        if (!n) {
          return {
            data: {
              task: null
            }
          };
        }
        return {
          data: {
            task: {
              id: n.id,
              subject: n.subject,
              description: n.description,
              status: n.status,
              blocks: n.blocks,
              blockedBy: n.blockedBy
            }
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          task: n
        } = e;
        if (!n) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: "Task not found"
          };
        }
        let r = [`Task #${n.id}: ${n.subject}`, `Status: ${n.status}`, `Description: ${n.description}`];
        if (n.blockedBy.length > 0) {
          r.push(`Blocked by: ${n.blockedBy.map(o => `#${o}`).join(", ")}`);
        }
        if (n.blocks.length > 0) {
          r.push(`Blocks: ${n.blocks.map(o => `#${o}`).join(", ")}`);
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: r.join(`
`)
        };
      }
    });
  });
  var cDl = `Use this tool to update a task in the task list.

## When to Use This Tool

**Mark tasks as resolved:**
- When you have completed the work described in a task
- When a task is no longer needed or has been superseded
- IMPORTANT: Always mark your assigned tasks as resolved when you finish them
- After resolving, call TaskList to find your next task

- ONLY mark a task as completed when you have FULLY accomplished it
- If you encounter errors, blockers, or cannot finish, keep the task as in_progress
- When blocked, create a new task describing what needs to be resolved
- Never mark a task as completed if:
  - Tests are failing
  - Implementation is partial
  - You encountered unresolved errors
  - You couldn't find necessary files or dependencies

**Delete tasks:**
- When a task is no longer relevant or was created in error
- Setting status to \`deleted\` permanently removes the task

**Update task details:**
- When requirements change or become clearer
- When establishing dependencies between tasks

## Fields You Can Update

- **status**: The task status (see Status Workflow below)
- **subject**: Change the task title (imperative form, e.g., "Run tests")
- **description**: Change the task description
- **activeForm**: Present continuous form shown in spinner when in_progress (e.g., "Running tests")
- **owner**: Change the task owner (agent name)
- **metadata**: Merge metadata keys into the task (set a key to null to delete it)
- **addBlocks**: Mark tasks that cannot start until this one completes
- **addBlockedBy**: Mark tasks that must complete before this one can start

## Status Workflow

Status progresses: \`pending\` \u2192 \`in_progress\` \u2192 \`completed\`

Use \`deleted\` to permanently remove a task.

## Staleness

Make sure to read a task's latest state using \`TaskGet\` before updating it.

## Examples

Mark task as in progress when starting work:
\`\`\`json
{"taskId": "1", "status": "in_progress"}
\`\`\`

Mark task as completed after finishing work:
\`\`\`json
{"taskId": "1", "status": "completed"}
\`\`\`

Delete a task:
\`\`\`json
{"taskId": "1", "status": "deleted"}
\`\`\`

Claim a task by setting owner:
\`\`\`json
{"taskId": "1", "owner": "my-name"}
\`\`\`

Set up task dependencies:
\`\`\`json
{"taskId": "2", "addBlockedBy": ["1"]}
\`\`\`
`;
  var qDm;
  var WDm;
  var uDl;
  var dDl = __lazy(() => {
    ci();
    mE();
    Sp();
    YI();
    qp();
    uA();
    oOo();
    qDm = we(() => {
      let e = S8e().or(v.literal("deleted"));
      return v.strictObject({
        taskId: v.string().describe("The ID of the task to update"),
        subject: v.string().optional().describe("New subject for the task"),
        description: v.string().optional().describe("New description for the task"),
        activeForm: v.string().optional().describe('Present continuous form shown in spinner when in_progress (e.g., "Running tests")'),
        status: e.optional().describe("New status for the task"),
        addBlocks: v.array(v.string()).optional().describe("Task IDs that this task blocks"),
        addBlockedBy: v.array(v.string()).optional().describe("Task IDs that block this task"),
        owner: v.string().optional().describe("New owner for the task"),
        metadata: v.record(v.string(), v.unknown()).optional().describe("Metadata keys to merge into the task. Set a key to null to delete it.")
      });
    });
    WDm = we(() => v.object({
      success: v.boolean(),
      taskId: v.string(),
      updatedFields: v.array(v.string()),
      error: v.string().optional(),
      statusChange: v.object({
        from: v.string(),
        to: v.string()
      }).optional()
    }));
    uDl = Xs({
      name: "TaskUpdate",
      searchHint: "update a task",
      maxResultSizeChars: 1e5,
      async description() {
        return "Update a task in the task list";
      },
      async prompt() {
        return cDl;
      },
      get inputSchema() {
        return qDm();
      },
      get outputSchema() {
        return WDm();
      },
      userFacingName() {
        return "TaskUpdate";
      },
      coerceInput: PKt,
      shouldDefer: true,
      isEnabled() {
        return sR();
      },
      isConcurrencySafe() {
        return true;
      },
      toAutoClassifierInput(e) {
        let t = PKt(e)?.input ?? e;
        let n = [t.taskId];
        if (t.status) {
          n.push(t.status);
        }
        if (t.subject) {
          n.push(t.subject);
        }
        return n.join(" ");
      },
      renderToolUseMessage() {
        return null;
      },
      async call({
        taskId: e,
        subject: t,
        description: n,
        activeForm: r,
        status: o,
        owner: s,
        addBlocks: i,
        addBlockedBy: a,
        metadata: l
      }, c, u, d, p) {
        let m = H$();
        p?.({
          type: "set_expanded_view",
          expandedView: "tasks"
        });
        let f = await Voe(m, e);
        if (!f) {
          return {
            data: {
              success: false,
              taskId: e,
              updatedFields: [],
              error: "Task not found"
            }
          };
        }
        let h = [];
        let g = {};
        if (t !== undefined && t !== f.subject) {
          g.subject = t;
          h.push("subject");
        }
        if (n !== undefined && n !== f.description) {
          g.description = n;
          h.push("description");
        }
        if (r !== undefined && r !== f.activeForm) {
          g.activeForm = r;
          h.push("activeForm");
        }
        if (s !== undefined && s !== f.owner) {
          g.owner = s;
          h.push("owner");
        }
        if (isAgentSwarmsEnabled() && o === "in_progress" && s === undefined && !f.owner) {
          let y = getAgentName();
          if (y) {
            g.owner = y;
            h.push("owner");
          }
        }
        if (l !== undefined) {
          let y = {
            ...(f.metadata ?? {})
          };
          for (let [_, b] of Object.entries(l)) {
            if (b === null) {
              delete y[_];
            } else {
              y[_] = b;
            }
          }
          g.metadata = y;
          h.push("metadata");
        }
        if (o !== undefined) {
          if (o === "deleted") {
            let y = await K9n(m, e);
            return {
              data: {
                success: y,
                taskId: e,
                updatedFields: y ? ["deleted"] : [],
                error: y ? undefined : "Failed to delete task",
                statusChange: y ? {
                  from: f.status,
                  to: "deleted"
                } : undefined
              }
            };
          }
          if (o !== f.status) {
            if (o === "completed") {
              let y = [];
              let _ = executeTaskCompletedHooks(e, f.subject, f.description, getAgentName(), getTeamName(), undefined, c?.abortController?.signal, undefined, c);
              for await (let b of _) {
                if (b.blockingError) {
                  y.push(getTaskCompletedHookMessage(b.blockingError));
                }
              }
              if (y.length > 0) {
                return {
                  data: {
                    success: false,
                    taskId: e,
                    updatedFields: [],
                    error: y.join(`
`)
                  }
                };
              }
            }
            g.status = o;
            h.push("status");
          }
        }
        if (Object.keys(g).length > 0) {
          await FEe(m, e, g);
        }
        if (g.owner && isAgentSwarmsEnabled()) {
          let y = getAgentName() || "team-lead";
          let _ = getTeammateColor();
          let b = De({
            type: "task_assignment",
            taskId: e,
            subject: f.subject,
            description: f.description,
            assignedBy: y,
            timestamp: new Date().toISOString()
          });
          await writeToMailbox(g.owner, {
            from: y,
            text: b,
            timestamp: new Date().toISOString(),
            color: _
          }, m);
        }
        if (i && i.length > 0) {
          let y = i.filter(_ => !f.blocks.includes(_));
          for (let _ of y) {
            await Xvo(m, e, _);
          }
          if (y.length > 0) {
            h.push("blocks");
          }
        }
        if (a && a.length > 0) {
          let y = a.filter(_ => !f.blockedBy.includes(_));
          for (let _ of y) {
            await Xvo(m, _, e);
          }
          if (y.length > 0) {
            h.push("blockedBy");
          }
        }
        return {
          data: {
            success: true,
            taskId: e,
            updatedFields: h,
            statusChange: g.status !== undefined ? {
              from: f.status,
              to: g.status
            } : undefined
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          success: n,
          taskId: r,
          updatedFields: o,
          error: s,
          statusChange: i
        } = e;
        if (!n) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: s || `Task #${r} not found`
          };
        }
        let a = `Updated task #${r} ${o.join(", ")}`;
        if (i?.to === "completed" && getAgentId() && isAgentSwarmsEnabled()) {
          a += `

Task completed. Call TaskList now to find your next available task or see if your work unblocked others.`;
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: a
        };
      }
    });
  });
  function mDl() {
    let e = isAgentSwarmsEnabled() ? `- Before assigning tasks to teammates, to see what's available
` : "";
    let t = isAgentSwarmsEnabled() ? "- **id**: Task identifier (use with TaskGet, TaskUpdate)" : "- **id**: Task identifier (use with TaskGet, TaskUpdate)";
    let n = isAgentSwarmsEnabled() ? `
## Teammate Workflow

When working as a teammate:
1. After completing your current task, call TaskList to find available work
2. Look for tasks with status 'pending', no owner, and empty blockedBy
3. **Prefer tasks in ID order** (lowest ID first) when multiple tasks are available, as earlier tasks often set up context for later ones
4. Claim an available task using TaskUpdate (set \`owner\` to your name), or wait for leader assignment
5. If blocked, focus on unblocking tasks or notify the team lead
` : "";
    return `Use this tool to list all tasks in the task list.

## When to Use This Tool

- To see what tasks are available to work on (status: 'pending', no owner, not blocked)
- To check overall progress on the project
- To find tasks that are blocked and need dependencies resolved
${e}- After completing a task, to check for newly unblocked work or claim the next available task
- **Prefer working on tasks in ID order** (lowest ID first) when multiple tasks are available, as earlier tasks often set up context for later ones

## Output

Returns a summary of each task:
${t}
- **subject**: Brief description of the task
- **status**: 'pending', 'in_progress', or 'completed'
- **owner**: Agent ID if assigned, empty if available
- **blockedBy**: List of open task IDs that must be resolved first (tasks with blockedBy cannot be claimed until dependencies resolve)

Use TaskGet with a specific task ID to view full details including description and comments.
${n}`;
  }
  var fDl = __lazy(() => {
    mE();
  });
  var GDm;
  var VDm;
  var hDl;
  var gDl = __lazy(() => {
    ci();
    YI();
    fDl();
    GDm = we(() => v.strictObject({}));
    VDm = we(() => v.object({
      tasks: v.array(v.object({
        id: v.string(),
        subject: v.string(),
        status: S8e(),
        owner: v.string().optional(),
        blockedBy: v.array(v.string())
      }))
    }));
    hDl = Xs({
      name: "TaskList",
      searchHint: "list all tasks",
      maxResultSizeChars: 1e5,
      async description() {
        return "List all tasks in the task list";
      },
      async prompt() {
        return mDl();
      },
      get inputSchema() {
        return GDm();
      },
      get outputSchema() {
        return VDm();
      },
      userFacingName() {
        return "TaskList";
      },
      shouldDefer: true,
      isEnabled() {
        return sR();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      renderToolUseMessage() {
        return null;
      },
      async call() {
        let e = H$();
        let t = (await y3(e)).filter(o => !o.metadata?._internal);
        let n = new Set(t.filter(o => o.status === "completed").map(o => o.id));
        return {
          data: {
            tasks: t.map(o => ({
              id: o.id,
              subject: o.subject,
              status: o.status,
              owner: o.owner,
              blockedBy: o.blockedBy.filter(s => !n.vZc(s))
            }))
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          tasks: n
        } = e;
        if (n.length === 0) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: "No tasks found"
          };
        }
        let r = n.map(o => {
          let s = o.owner ? ` (${o.owner})` : "";
          let i = o.blockedBy.length > 0 ? ` [blocked by ${o.blockedBy.map(a => `#${a}`).join(", ")}]` : "";
          return `#${o.id} [${o.status}] ${o.subject}${s}${i}`;
        });
        return {
          tool_use_id: t,
          type: "tool_result",
          content: r.join(`
`)
        };
      }
    });
  });
  var yDl = {};