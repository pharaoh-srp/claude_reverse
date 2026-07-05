  __export(_ga, {
    outputSchema: () => outputSchema,
    inputSchema: () => inputSchema,
    clearToolSearchDescriptionCache: () => clearToolSearchDescriptionCache,
    ToolSearchTool: () => ToolSearchTool
  });
  function ASp(e) {
    return e.map(t => t.name).sort().join(",");
  }
  function mga(e) {
    let t = ASp(e);
    if (ppo !== t) {
      logForDebugging("ToolSearchTool: cache invalidated - deferred tools changed");
      z$n.cache.clear?.();
      ppo = t;
    }
  }
  function clearToolSearchDescriptionCache() {
    z$n.cache.clear?.();
    ppo = null;
  }
  function bpt(e, t, n, r) {
    return {
      data: {
        matches: e,
        query: t,
        total_deferred_tools: n,
        ...(r.length > 0 && {
          pending_mcp_servers: r
        })
      }
    };
  }
  function fga(e) {
    let t = e.name;
    let n = e.mcpInfo ?? TI(t);
    if (n) {
      let o = [n.serverName, n.toolName].filter(i => Boolean(i)).map(i => i.toLowerCase());
      let s = o.flatMap(i => i.split(/[\s_.]+/)).filter(Boolean);
      return {
        parts: s,
        coarseParts: o,
        full: s.join(" "),
        isMcp: true
      };
    }
    let r = t.replace(/([a-z])([A-Z])/g, "$1 $2").replaceAll("_", " ").toLowerCase().split(/\s+/).filter(Boolean);
    return {
      parts: r,
      coarseParts: [t.toLowerCase()],
      full: r.join(" "),
      isMcp: false
    };
  }
  function PSp(e) {
    let t = new Map();
    for (let n of e) {
      if (!t.vZc(n)) {
        t.set(n, new RegExp(`\\b${FA(n)}\\b`));
      }
    }
    return t;
  }
  async function hga(e, t, n, r) {
    let o = e.toLowerCase().trim();
    let s = t.find(m => m.name.toLowerCase() === o) ?? n.find(m => m.name.toLowerCase() === o);
    if (s) {
      return [s.name];
    }
    if (o.startsWith("mcp__") && o.length > 5) {
      let m = t.filter(f => f.name.toLowerCase().startsWith(o)).slice(0, r).map(f => f.name);
      if (m.length > 0) {
        return m;
      }
    }
    let i = o.split(/\s+/).filter(m => m.length > 0);
    let a = [];
    let l = [];
    for (let m of i) {
      if (m.startsWith("+") && m.length > 1) {
        a.push(m.slice(1));
      } else {
        l.push(m);
      }
    }
    let c = a.length > 0 ? [...a, ...l] : i;
    let u = PSp(c);
    let d = t;
    if (a.length > 0) {
      d = (await Promise.all(t.map(async f => {
        let h = fga(f);
        let y = (await z$n(f.name, n)).toLowerCase();
        let _ = f.searchHint?.toLowerCase() ?? "";
        return a.every(S => {
          let E = u.get(S);
          return h.parts.includes(S) || h.parts.some(C => C.includes(S)) || h.coarseParts.includes(S) || h.coarseParts.some(C => C.includes(S)) || E.test(y) || _ && E.test(_);
        }) ? f : null;
      }))).filter(f => f !== null);
    }
    return (await Promise.all(d.map(async m => {
      let f = fga(m);
      let g = (await z$n(m.name, n)).toLowerCase();
      let y = m.searchHint?.toLowerCase() ?? "";
      let _ = 0;
      for (let b of c) {
        let S = u.get(b);
        if (f.parts.includes(b)) {
          _ += f.isMcp ? 12 : 10;
        } else if (f.parts.some(E => E.includes(b))) {
          _ += f.isMcp ? 6 : 5;
        }
        if (f.coarseParts.includes(b)) {
          _ += f.isMcp ? 12 : 10;
        } else if (f.coarseParts.some(E => E.includes(b))) {
          _ += f.isMcp ? 4 : 3;
        }
        if (f.full.includes(b) && _ === 0) {
          _ += 3;
        }
        if (y && S.test(y)) {
          _ += 4;
        }
        if (S.test(g)) {
          _ += 2;
        }
      }
      return {
        name: m.name,
        score: _
      };
    }))).filter(m => m.score > 0).sort((m, f) => f.score - m.score).slice(0, r).map(m => m.name);
  }
  var inputSchema;
  var outputSchema;
  var ppo = null;
  var z$n;
  var ToolSearchTool;
  var K$n = __lazy(() => {
    Ot();
    EI();
    ci();
    je();
    Zn();
    foe();
    RX();
    _pt();
    kX();
    inputSchema = we(() => v.object({
      query: v.string().describe('Query to find deferred tools. Use "select:<tool_name>" for direct selection, or keywords to search.'),
      max_results: v.number().optional().default(5).describe("Maximum number of results to return (default: 5)")
    }));
    outputSchema = we(() => v.object({
      matches: v.array(v.string()),
      query: v.string(),
      total_deferred_tools: v.number(),
      pending_mcp_servers: v.array(v.string()).optional()
    }));
    z$n = TEr(async (e, t) => {
      let n = Cl(t, e);
      if (!n) {
        return "";
      }
      return n.prompt({
        getToolPermissionContext: async () => ({
          mode: "default",
          additionalWorkingDirectories: new Map(),
          alwaysAllowRules: {},
          alwaysDenyRules: {},
          alwaysAskRules: {},
          isBypassPermissionsModeAvailable: false,
          mcpPermissionModeOverrides: {}
        }),
        tools: t,
        agents: []
      });
    }, e => e);
    ToolSearchTool = Xs({
      isEnabled() {
        return P1();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      name: "ToolSearch",
      maxResultSizeChars: 1e5,
      async description() {
        return getPrompt_export();
      },
      async prompt() {
        return getPrompt_export();
      },
      get inputSchema() {
        return inputSchema();
      },
      get outputSchema() {
        return outputSchema();
      },
      async call(e, {
        options: {
          tools: t,
          refreshTools: n,
          mcpClients: r,
          refreshMcpClients: o
        },
        abortController: s
      }) {
        let {
          query: i,
          max_results: a = 5
        } = e;
        let l = n?.() ?? t;
        let c = l.filter(isDeferredTool);
        mga(c);
        let u = () => o?.() ?? r;
        function d() {
          return u().filter(C => C.type === "pending").map(C => C.name);
        }
        function p(C, x) {
          let A = Array.isArray(C) ? C.join(" ") : C;
          let k = new Set();
          for (let O of A.matchAll(/mcp__([a-zA-Z0-9._-]+)/g)) {
            let M = O[1];
            let L = M.indexOf("__");
            k.add(L >= 0 ? M.slice(0, L) : M);
          }
          let I = A.toLowerCase();
          for (let O of x) {
            if (new RegExp(`\\b${FA(O)}\\b`, "i").test(I)) {
              k.add(O);
            }
          }
          return [...k];
        }
        function m() {
          let C = n?.() ?? l;
          let x = new Set(l.map(I => I.name));
          let A = Bn(C, I => !x.vZc(I.name));
          let k = C.filter(isDeferredTool);
          mga(k);
          return {
            freshTools: C,
            freshDeferred: k,
            newCount: A
          };
        }
        async function f(C) {
          let x = Date.now();
          let A = x + 5000;
          while (Date.now() < A && !s.signal.aborted) {
            let k = u().filter(I => I.type === "pending");
            if (k.length === 0) {
              break;
            }
            if (C.length > 0 && !k.some(I => C.includes(I.name) || C.includes(Bl(I.name)))) {
              break;
            }
            await sleep(50, s.signal);
          }
          return Date.now() - x;
        }
        async function h(C, x, A) {
          let k = m();
          let I = d();
          let O = I.length;
          if (!n || k.newCount === 0 && O === 0) {
            return null;
          }
          let M = k.newCount > 0 ? await C(k.freshDeferred, k.freshTools) : [];
          let L = 0;
          let P = true;
          let F = p(A, u().map(N => N.name));
          let H = I.map(Bl);
          let U = F.length === 0 || F.some(N => I.includes(N) || H.includes(N));
          if (M.length === 0 && O > 0 && U) {
            P = false;
            L = await f(F);
            k = m();
            M = await C(k.freshDeferred, k.freshTools);
          }
          logEvent("tengu_tool_search_mcp_wait", {
            queryType: x,
            refreshOnly: P,
            waitedMs: L,
            pendingBefore: O,
            pendingAfter: d().length,
            matchesAfterWait: M.length,
            targetServerCount: F.length,
            skippedPollNoTargetPending: O > 0 && !U && M.length === 0
          });
          return {
            matches: M,
            freshDeferred: k.freshDeferred,
            freshTools: k.freshTools
          };
        }
        function g(C, x, A) {
          if (A.length === 0 || x.length === 0) {
            return;
          }
          let k = new Set(x.map(O => O.split("__")[1]).filter(Boolean));
          let I = Bn(A, O => k.vZc(Bl(O)));
          logEvent("tengu_sdk_mcp_false_unavailable", {
            queryType: C,
            pendingServers: A.length,
            targetedPendingServers: I
          });
        }
        function y(C, x, A) {
          let k = u();
          let I = A?.freshDeferred ?? c;
          let O = A?.freshTools ?? l;
          logEvent("tengu_tool_search_outcome", {
            queryLength: i.length,
            querySelectCount: x === "select" ? Ru(i, ",") + 1 : undefined,
            queryType: x,
            matchCount: C.length,
            totalDeferredTools: I.length,
            maxResults: a,
            hasMatches: C.length > 0,
            mcpServersConfigured: k.length,
            mcpServersConnected: Bn(k, M => M.type === "connected"),
            mcpServersPending: Bn(k, M => M.type === "pending"),
            mcpToolsInPool: Bn(O, M => !!M.mcpInfo),
            ...{}
          });
        }
        let _ = i.match(/^select:(.+)$/i);
        if (_) {
          let C = _[1].split(",").map(I => I.trim()).filter(Boolean);
          let x = [];
          let A = [];
          for (let I of C) {
            let O = Cl(c, I) ?? Cl(l, I);
            if (O) {
              if (!x.includes(O.name)) {
                x.push(O.name);
              }
            } else {
              A.push(I);
            }
          }
          let k;
          if (A.length > 0) {
            let I = await h(async (O, M) => {
              let L = [];
              for (let P of A) {
                let F = Cl(O, P) ?? Cl(M, P);
                if (F && !L.includes(F.name)) {
                  L.push(F.name);
                }
              }
              return L;
            }, "select", A);
            if (I) {
              if (k = I, I.matches.length > 0) {
                let O = [...x, ...I.matches];
                let M = A.filter(L => !I.matches.includes(L));
                if (M.length > 0) {
                  logForDebugging(`ToolSearchTool: partial select after MCP refresh \u2014 found: ${O.join(", ")}, missing: ${M.join(", ")}`);
                } else {
                  logForDebugging(`ToolSearchTool: selected ${O.join(", ")} after MCP refresh`);
                }
                y(O, "select", I);
                return bpt(O, i, I.freshDeferred.length, []);
              }
            }
          }
          if (x.length === 0) {
            logForDebugging(`ToolSearchTool: select failed \u2014 none found: ${A.join(", ")}`);
            y([], "select", k);
            let I = d();
            g("select", A.filter(O => O.startsWith("mcp__")), I);
            return bpt([], i, k?.freshDeferred.length ?? c.length, I);
          }
          if (A.length > 0) {
            logForDebugging(`ToolSearchTool: partial select \u2014 found: ${x.join(", ")}, missing: ${A.join(", ")}`);
          } else {
            logForDebugging(`ToolSearchTool: selected ${x.join(", ")}`);
          }
          y(x, "select", k);
          return bpt(x, i, k?.freshDeferred.length ?? c.length, []);
        }
        let b = await hga(i, c, l, a);
        logForDebugging(`ToolSearchTool: keyword search for "${i}", found ${b.length} matches`);
        let S;
        if (b.length === 0) {
          let C = await h((x, A) => hga(i, x, A, a), "keyword", i);
          if (C) {
            if (S = C, C.matches.length > 0) {
              b = C.matches;
              logForDebugging(`ToolSearchTool: keyword search for "${i}" found ${b.length} matches after MCP refresh`);
              y(b, "keyword", C);
              return bpt(b, i, C.freshDeferred.length, []);
            }
          }
        }
        y(b, "keyword", S);
        let E = S?.freshDeferred.length ?? c.length;
        if (b.length === 0) {
          let C = d();
          g("keyword", i.match(/mcp__[A-Za-z0-9_-]+/g) ?? [], C);
          return bpt(b, i, E, C);
        }
        return bpt(b, i, E, []);
      },
      renderToolUseMessage() {
        return null;
      },
      userFacingName: () => "",
      mapToolResultToToolResultBlockParam(e, t) {
        if (e.matches.length === 0) {
          let n = "No matching deferred tools found";
          if (e.pending_mcp_servers && e.pending_mcp_servers.length > 0) {
            let r = e.pending_mcp_servers;
            let o = r.length > 30 ? `${r.slice(0, 30).join(", ")}, \u2026and ${r.length - 30} more` : r.join(", ");
            n += `. Some MCP servers are still connecting: ${o}. Their tools will become available shortly \u2014 try searching again. If you're looking for a capability rather than a specific tool name, try keywords that might match the server's purpose (e.g., 'slack message', 'calendar event'). Once you find a matching tool, call it directly \u2014 do not stop after searching.`;
          }
          return {
            type: "tool_result",
            tool_use_id: t,
            content: n
          };
        }
        return {
          type: "tool_result",
          tool_use_id: t,
          content: e.matches.map(n => ({
            type: "tool_reference",
            tool_name: n
          }))
        };
      }
    });
  });
  function Y$n(e) {
    let t = {
      toolRequests: new Map(),
      toolResults: new Map(),
      humanMessages: 0,
      assistantMessages: 0,
      localCommandOutputs: 0,
      other: 0,
      attachments: new Map(),
      duplicateFileReads: new Map(),
      total: 0
    };
    let n = new Map();
    let r = new Map();
    let o = new Map();
    e.forEach(i => {
      if (i.type === "attachment") {
        let a = i.attachment.type || "unknown";
        t.attachments.set(a, (t.attachments.get(a) || 0) + 1);
      }
    });
    EO(e).forEach(i => {
      let {
        content: a
      } = i.message;
      if (typeof a === "string") {
        let l = xm(a);
        if (t.total += l, i.type === "user" && a.includes("local-command-stdout")) {
          t.localCommandOutputs += l;
        } else {
          t[i.type === "user" ? "humanMessages" : "assistantMessages"] += l;
        }
      } else {
        a.forEach(l => OSp(l, i, t, n, r, o));
      }
    });
    o.forEach((i, a) => {
      if (i.count > 1) {
        let c = Math.floor(i.totalTokens / i.count) * (i.count - 1);
        t.duplicateFileReads.set(a, {
          count: i.count,
          tokens: c
        });
      }
    });
    return t;
  }
  function OSp(e, t, n, r, o, s) {
    let i = xm(De(e));
    switch (n.total += i, e.type) {
      case "text":
        if (t.type === "user" && "text" in e && e.text.includes("local-command-stdout")) {
          n.localCommandOutputs += i;
        } else {
          n[t.type === "user" ? "humanMessages" : "assistantMessages"] += i;
        }
        break;
      case "tool_use":
        {
          if ("name" in e && "id" in e) {
            let a = e.name || "unknown";
            if (bga(n.toolRequests, a, i), r.set(e.id, a), a === "Read" && "input" in e && e.input && typeof e.input === "object" && "file_path" in e.input) {
              let l = String(e.input.file_path);
              o.set(e.id, l);
            }
          }
          break;
        }
      case "tool_result":
        {
          if ("tool_use_id" in e) {
            let a = r.get(e.tool_use_id) || "unknown";
            if (bga(n.toolResults, a, i), a === "Read") {
              let l = o.get(e.tool_use_id);
              if (l) {
                let c = s.get(l) || {
                  count: 0,
                  totalTokens: 0
                };
                s.set(l, {
                  count: c.count + 1,
                  totalTokens: c.totalTokens + i
                });
              }
            }
          }
          break;
        }
      case "image":
      case "server_tool_use":
      case "web_search_tool_result":
      case "search_result":
      case "document":
      case "thinking":
      case "redacted_thinking":
      case "code_execution_tool_result":
      case "mcp_tool_use":
      case "mcp_tool_result":
      case "container_upload":
      case "web_fetch_tool_result":
      case "bash_code_execution_tool_result":
      case "text_editor_code_execution_tool_result":
      case "tool_search_tool_result":
      case "advisor_tool_result":
      case "compaction":
        n.other += i;
        break;
    }
  }
  function bga(e, t, n) {
    e.set(t, (e.get(t) || 0) + n);
  }
  function J$n(e) {
    let t = {
      total_tokens: e.total,
      human_message_tokens: e.humanMessages,
      assistant_message_tokens: e.assistantMessages,
      local_command_output_tokens: e.localCommandOutputs,
      other_tokens: e.other
    };
    e.attachments.forEach((r, o) => {
      t[`attachment_${o}_count`] = r;
    });
    e.toolRequests.forEach((r, o) => {
      t[`tool_request_${o}_tokens`] = r;
    });
    e.toolResults.forEach((r, o) => {
      t[`tool_result_${o}_tokens`] = r;
    });
    let n = [...e.duplicateFileReads.values()].reduce((r, o) => r + o.tokens, 0);
    if (t.duplicate_read_tokens = n, t.duplicate_read_file_count = e.duplicateFileReads.size, e.total > 0) {
      t.human_message_percent = Math.round(e.humanMessages / e.total * 100);
      t.assistant_message_percent = Math.round(e.assistantMessages / e.total * 100);
      t.local_command_output_percent = Math.round(e.localCommandOutputs / e.total * 100);
      t.duplicate_read_percent = Math.round(n / e.total * 100);
      let r = [...e.toolRequests.values()].reduce((s, i) => s + i, 0);
      let o = [...e.toolResults.values()].reduce((s, i) => s + i, 0);
      t.tool_request_percent = Math.round(r / e.total * 100);
      t.tool_result_percent = Math.round(o / e.total * 100);
      e.toolRequests.forEach((s, i) => {
        t[`tool_request_${i}_percent`] = Math.round(s / e.total * 100);
      });
      e.toolResults.forEach((s, i) => {
        t[`tool_result_${i}_percent`] = Math.round(s / e.total * 100);
      });
    }
    return t;
  }
  var mpo = __lazy(() => {
    aU();
    ro();
  });
  function Spt() {
    U4t.setState(() => true);
  }
  function Sga() {
    U4t.setState(() => false);
  }
  var U4t;
  var Tpt = __lazy(() => {
    tre();
    U4t = dO(false);
  });
  class RTe {
    diff(e, t, n = {}) {
      let r;
      if (typeof n === "function") {
        r = n;
        n = {};
      } else if ("callback" in n) {
        r = n.callback;
      }
      let o = this.castInput(e, n);
      let s = this.castInput(t, n);
      let i = this.removeEmpty(this.tokenize(o, n));
      let a = this.removeEmpty(this.tokenize(s, n));
      return this.diffWithOptionsObj(i, a, n, r);
    }
    diffWithOptionsObj(e, t, n, r) {
      var o;
      let s = y => {
        if (y = this.postProcess(y, n), r) {
          setTimeout(function () {
            r(y);
          }, 0);
          return;
        } else {
          return y;
        }
      };
      let i = t.length;
      let a = e.length;
      let l = 1;
      let c = i + a;
      if (n.maxEditLength != null) {
        c = Math.min(c, n.maxEditLength);
      }
      let u = (o = n.timeout) !== null && o !== undefined ? o : 1 / 0;
      let d = Date.now() + u;
      let p = [{
        oldPos: -1,
        lastComponent: undefined
      }];
      let m = this.extractCommon(p[0], t, e, 0, n);
      if (p[0].oldPos + 1 >= a && m + 1 >= i) {
        return s(this.buildValues(p[0].lastComponent, t, e));
      }
      let f = -1 / 0;
      let h = 1 / 0;
      let g = () => {
        for (let y = Math.max(f, -l); y <= Math.min(h, l); y += 2) {
          let _;
          let b = p[y - 1];
          let S = p[y + 1];
          if (b) {
            p[y - 1] = undefined;
          }
          let E = false;
          if (S) {
            let x = S.oldPos - y;
            E = S && 0 <= x && x < i;
          }
          let C = b && b.oldPos + 1 < a;
          if (!E && !C) {
            p[y] = undefined;
            continue;
          }
          if (!C || E && b.oldPos < S.oldPos) {
            _ = this.addToPath(S, true, false, 0, n);
          } else {
            _ = this.addToPath(b, false, true, 1, n);
          }
          if (m = this.extractCommon(_, t, e, y, n), _.oldPos + 1 >= a && m + 1 >= i) {
            return s(this.buildValues(_.lastComponent, t, e)) || true;
          } else {
            if (p[y] = _, _.oldPos + 1 >= a) {
              h = Math.min(h, y - 1);
            }
            if (m + 1 >= i) {
              f = Math.max(f, y + 1);
            }
          }
        }
        l++;
      };
      if (r) {
        (function y() {
          setTimeout(function () {
            if (l > c || Date.now() > d) {
              return r(undefined);
            }
            if (!g()) {
              y();
            }
          }, 0);
        })();
      } else {
        while (l <= c && Date.now() <= d) {
          let y = g();
          if (y) {
            return y;
          }
        }
      }
    }
    addToPath(e, t, n, r, o) {
      let s = e.lastComponent;
      if (s && !o.oneChangePerToken && s.added === t && s.removed === n) {
        return {
          oldPos: e.oldPos + r,
          lastComponent: {
            count: s.count + 1,
            added: t,
            removed: n,
            previousComponent: s.previousComponent
          }
        };
      } else {
        return {
          oldPos: e.oldPos + r,
          lastComponent: {
            count: 1,
            added: t,
            removed: n,
            previousComponent: s
          }
        };
      }
    }
    extractCommon(e, t, n, r, o) {
      let s = t.length;
      let i = n.length;
      let a = e.oldPos;
      let l = a - r;
      let c = 0;
      while (l + 1 < s && a + 1 < i && this.equals(n[a + 1], t[l + 1], o)) {
        if (l++, a++, c++, o.oneChangePerToken) {
          e.lastComponent = {
            count: 1,
            previousComponent: e.lastComponent,
            added: false,
            removed: false
          };
        }
      }
      if (c && !o.oneChangePerToken) {
        e.lastComponent = {
          count: c,
          previousComponent: e.lastComponent,
          added: false,
          removed: false
        };
      }
      e.oldPos = a;
      return l;
    }
    equals(e, t, n) {
      if (n.comparator) {
        return n.comparator(e, t);
      } else {
        return e === t || !!n.ignoreCase && e.toLowerCase() === t.toLowerCase();
      }
    }
    removeEmpty(e) {
      let t = [];
      for (let n = 0; n < e.length; n++) {
        if (e[n]) {
          t.push(e[n]);
        }
      }
      return t;
    }
    castInput(e, t) {
      return e;
    }
    tokenize(e, t) {
      return Array.from(e);
    }
    join(e) {
      return e.join("");
    }
    postProcess(e, t) {
      return e;
    }
    get useLongestToken() {
      return false;
    }
    buildValues(e, t, n) {
      let r = [];
      let o;
      while (e) {
        r.push(e);
        o = e.previousComponent;
        delete e.previousComponent;
        e = o;
      }
      r.reverse();
      let s = r.length;
      let i = 0;
      let a = 0;
      let l = 0;
      for (; i < s; i++) {
        let c = r[i];
        if (!c.removed) {
          if (!c.added && this.useLongestToken) {
            let u = t.slice(a, a + c.count);
            u = u.map(function (d, p) {
              let m = n[l + p];
              return m.length > d.length ? m : d;
            });
            c.value = this.join(u);
          } else {
            c.value = this.join(t.slice(a, a + c.count));
          }
          if (a += c.count, !c.added) {
            l += c.count;
          }
        } else {
          c.value = this.join(n.slice(l, l + c.count));
          l += c.count;
        }
      }
      return r;
    }
  }
  function fpo(e, t) {
    let n;
    for (n = 0; n < e.length && n < t.length; n++) {
      if (e[n] != t[n]) {
        return e.slice(0, n);
      }
    }
    return e.slice(0, n);
  }
  function hpo(e, t) {
    let n;
    if (!e || !t || e[e.length - 1] != t[t.length - 1]) {
      return "";
    }
    for (n = 0; n < e.length && n < t.length; n++) {
      if (e[e.length - (n + 1)] != t[t.length - (n + 1)]) {
        return e.slice(-n);
      }
    }
    return e.slice(-n);
  }
  function X$n(e, t, n) {
    if (e.slice(0, t.length) != t) {
      throw Error(`string ${JSON.stringify(e)} doesn't start with prefix ${JSON.stringify(t)}; this is a bug`);
    }
    return n + e.slice(t.length);
  }
  function Q$n(e, t, n) {
    if (!t) {
      return e + n;
    }
    if (e.slice(-t.length) != t) {
      throw Error(`string ${JSON.stringify(e)} doesn't end with suffix ${JSON.stringify(t)}; this is a bug`);
    }
    return e.slice(0, -t.length) + n;
  }
  function Ept(e, t) {
    return X$n(e, t, "");
  }
  function B4t(e, t) {
    return Q$n(e, t, "");
  }
  function gpo(e, t) {
    return t.slice(0, DSp(e, t));
  }
  function DSp(e, t) {
    let n = 0;
    if (e.length > t.length) {
      n = e.length - t.length;
    }
    let r = t.length;
    if (e.length < t.length) {
      r = e.length;
    }
    let o = Array(r);
    let s = 0;
    o[0] = 0;
    for (let i = 1; i < r; i++) {
      if (t[i] == t[s]) {
        o[i] = o[s];
      } else {
        o[i] = s;
      }
      while (s > 0 && t[i] != t[s]) {
        s = o[s];
      }
      if (t[i] == t[s]) {
        s++;
      }
    }
    s = 0;
    for (let i = n; i < e.length; i++) {
      while (s > 0 && e[i] != t[s]) {
        s = o[s];
      }
      if (e[i] == t[s]) {
        s++;
      }
    }
    return s;
  }
  function ypo(e, t) {
    let n = [];
    for (let r of Array.from(t.segment(e))) {
      let o = r.segment;
      if (n.length && /\s/.test(n[n.length - 1]) && /\s/.test(o)) {
        n[n.length - 1] += o;
      } else {
        n.push(o);
      }
    }
    return n;
  }
  function Z$n(e, t) {
    if (t) {
      return vpt(e, t)[1];
    }
    let n;
    for (n = e.length - 1; n >= 0; n--) {
      if (!e[n].match(/\s/)) {
        break;
      }
    }
    return e.substring(n + 1);
  }
  function G9e(e, t) {
    if (t) {
      return vpt(e, t)[0];
    }
    let n = e.match(/^\s*/);
    return n ? n[0] : "";
  }
  function vpt(e, t) {
    if (!t) {
      return [G9e(e), Z$n(e)];
    }
    if (t.resolvedOptions().granularity != "word") {
      throw Error('The segmenter passed must have a granularity of "word"');
    }
    let n = ypo(e, t);
    let r = n[0];
    let o = n[n.length - 1];
    let s = /\s/.test(r) ? r : "";
    let i = /\s/.test(o) ? o : "";
    return [s, i];
  }
  function Tga(e, t, n, r, o) {
    if (t && n) {
      let [s, i] = vpt(t.value, o);
      let [a, l] = vpt(n.value, o);
      if (e) {
        let c = fpo(s, a);
        e.value = Q$n(e.value, a, c);
        t.value = Ept(t.value, c);
        n.value = Ept(n.value, c);
      }
      if (r) {
        let c = hpo(i, l);
        r.value = X$n(r.value, l, c);
        t.value = B4t(t.value, c);
        n.value = B4t(n.value, c);
      }
    } else if (n) {
      if (e) {
        let s = G9e(n.value, o);
        n.value = n.value.substring(s.length);
      }
      if (r) {
        let s = G9e(r.value, o);
        r.value = r.value.substring(s.length);
      }
    } else if (e && r) {
      let s = G9e(r.value, o);
      let [i, a] = vpt(t.value, o);
      let l = fpo(s, i);
      t.value = Ept(t.value, l);
      let c = hpo(Ept(s, l), a);
      t.value = B4t(t.value, c);
      r.value = X$n(r.value, s, c);
      e.value = Q$n(e.value, s, s.slice(0, s.length - c.length));
    } else if (r) {
      let s = G9e(r.value, o);
      let i = Z$n(t.value, o);
      let a = gpo(i, s);
      t.value = B4t(t.value, a);
    } else if (e) {
      let s = Z$n(e.value, o);
      let i = G9e(t.value, o);
      let a = gpo(s, i);
      t.value = Ept(t.value, a);
    }
  }
  function _po(e, t, n) {
    return wga.diff(e, t, n);
  }
  var MSp;
  var Ega;
  var NSp;
  var vga;
  var wga;
  var Cga = __lazy(() => {
    MSp = new RegExp(`[${"a-zA-Z0-9_\\u{AD}\\u{C0}-\\u{D6}\\u{D8}-\\u{F6}\\u{F8}-\\u{2C6}\\u{2C8}-\\u{2D7}\\u{2DE}-\\u{2FF}\\u{1E00}-\\u{1EFF}"}]+|\\s+|[^${"a-zA-Z0-9_\\u{AD}\\u{C0}-\\u{D6}\\u{D8}-\\u{F6}\\u{F8}-\\u{2C6}\\u{2C8}-\\u{2D7}\\u{2DE}-\\u{2FF}\\u{1E00}-\\u{1EFF}"}]`, "ug");
    Ega = class Ega extends RTe {
      equals(e, t, n) {
        if (n.ignoreCase) {
          e = e.toLowerCase();
          t = t.toLowerCase();
        }
        return e.trim() === t.trim();
      }
      tokenize(e, t = {}) {
        let n;
        if (t.intlSegmenter) {
          let s = t.intlSegmenter;
          if (s.resolvedOptions().granularity != "word") {
            throw Error('The segmenter passed must have a granularity of "word"');
          }
          n = ypo(e, s);
        } else {
          n = e.match(MSp) || [];
        }
        let r = [];
        let o = null;
        n.forEach(s => {
          if (/\s/.test(s)) {
            if (o == null) {
              r.push(s);
            } else {
              r.push(r.pop() + s);
            }
          } else if (o != null && /\s/.test(o)) {
            if (r[r.length - 1] == o) {
              r.push(r.pop() + s);
            } else {
              r.push(o + s);
            }
          } else {
            r.push(s);
          }
          o = s;
        });
        return r;
      }
      join(e) {
        return e.map((t, n) => {
          if (n == 0) {
            return t;
          } else {
            return t.replace(/^\s+/, "");
          }
        }).join("");
      }
      postProcess(e, t) {
        if (!e || t.oneChangePerToken) {
          return e;
        }
        let n = null;
        let r = null;
        let o = null;
        if (e.forEach(s => {
          if (s.added) {
            r = s;
          } else if (s.removed) {
            o = s;
          } else {
            if (r || o) {
              Tga(n, o, r, s, t.intlSegmenter);
            }
            n = s;
            r = null;
            o = null;
          }
        }), r || o) {
          Tga(n, o, r, null, t.intlSegmenter);
        }
        return e;
      }
    };
    NSp = new Ega();
    vga = class vga extends RTe {
      tokenize(e) {
        let t = new RegExp(`(\\r?\\n)|[${"a-zA-Z0-9_\\u{AD}\\u{C0}-\\u{D6}\\u{D8}-\\u{F6}\\u{F8}-\\u{2C6}\\u{2C8}-\\u{2D7}\\u{2DE}-\\u{2FF}\\u{1E00}-\\u{1EFF}"}]+|[^\\S\\n\\r]+|[^${"a-zA-Z0-9_\\u{AD}\\u{C0}-\\u{D6}\\u{D8}-\\u{F6}\\u{F8}-\\u{2C6}\\u{2C8}-\\u{2D7}\\u{2DE}-\\u{2FF}\\u{1E00}-\\u{1EFF}"}]`, "ug");
        return e.match(t) || [];
      }
    };
    wga = new vga();
  });
  function kDe(e, t, n) {
    return xga.diff(e, t, n);
  }
  function LSp(e, t) {
    if (t.stripTrailingCr) {
      e = e.replace(/\r\n/g, `
`);
    }
    let n = [];
    let r = e.split(/(\n|\r\n)/);
    if (!r[r.length - 1]) {
      r.pop();
    }
    for (let o = 0; o < r.length; o++) {
      let s = r[o];
      if (o % 2 && !t.newlineIsToken) {
        n[n.length - 1] += s;
      } else {
        n.push(s);
      }
    }
    return n;
  }
  var Rga;
  var xga;
  var bpo = __lazy(() => {
    Rga = class Rga extends RTe {
      constructor() {
        super(...arguments);
        this.tokenize = LSp;
      }
      equals(e, t, n) {
        if (n.ignoreWhitespace) {
          if (!n.newlineIsToken || !e.includes(`
`)) {
            e = e.trim();
          }
          if (!n.newlineIsToken || !t.includes(`
`)) {
            t = t.trim();
          }
        } else if (n.ignoreNewlineAtEof && !n.newlineIsToken) {
          if (e.endsWith(`
`)) {
            e = e.slice(0, -1);
          }
          if (t.endsWith(`
`)) {
            t = t.slice(0, -1);
          }
        }
        return super.equals(e, t, n);
      }
    };
    xga = new Rga();
  });
  function Spo(e, t, n) {
    return Aga.diff(e, t, n);
  }
  var kga;
  var Aga;
  var Iga = __lazy(() => {
    kga = class kga extends RTe {
      tokenize(e) {
        return e.slice();
      }
      join(e) {
        return e;
      }
      removeEmpty(e) {
        return e;
      }
    };
    Aga = new kga();
  });
  function wpt(e, t, n, r, o, s, i) {
    let a;
    if (!i) {
      a = {};
    } else if (typeof i === "function") {
      a = {
        callback: i
      };
    } else {
      a = i;
    }
    if (typeof a.context > "u") {
      a.context = 4;
    }
    let l = a.context;
    if (a.newlineIsToken) {
      throw Error("newlineIsToken may not be used with patch-generation functions, only with diffing functions");
    }
    if (!a.callback) {
      return c(kDe(n, r, a));
    } else {
      let {
        callback: u
      } = a;
      kDe(n, r, Object.assign(Object.assign({}, a), {
        callback: d => {
          let p = c(d);
          u(p);
        }
      }));
    }
    function c(u) {
      if (!u) {
        return;
      }
      u.push({
        value: "",
        lines: []
      });
      function d(_) {
        return _.map(function (b) {
          return " " + b;
        });
      }
      let p = [];
      let m = 0;
      let f = 0;
      let h = [];
      let g = 1;
      let y = 1;
      for (let _ = 0; _ < u.length; _++) {
        let b = u[_];
        let S = b.lines || FSp(b.value);
        if (b.lines = S, b.added || b.removed) {
          if (!m) {
            let E = u[_ - 1];
            if (m = g, f = y, E) {
              h = l > 0 ? d(E.lines.slice(-l)) : [];
              m -= h.length;
              f -= h.length;
            }
          }
          for (let E of S) {
            h.push((b.added ? "+" : "-") + E);
          }
          if (b.added) {
            y += S.length;
          } else {
            g += S.length;
          }
        } else {
          if (m) {
            if (S.length <= l * 2 && _ < u.length - 2) {
              for (let E of d(S)) {
                h.push(E);
              }
            } else {
              let E = Math.min(S.length, l);
              for (let x of d(S.slice(0, E))) {
                h.push(x);
              }
              let C = {
                oldStart: m,
                oldLines: g - m + E,
                newStart: f,
                newLines: y - f + E,
                lines: h
              };
              p.push(C);
              m = 0;
              f = 0;
              h = [];
            }
          }
          g += S.length;
          y += S.length;
        }
      }
      for (let _ of p) {
        for (let b = 0; b < _.lines.length; b++) {
          if (_.lines[b].endsWith(`
`)) {
            _.lines[b] = _.lines[b].slice(0, -1);
          } else {
            _.lines.splice(b + 1, 0, "\\ No newline at end of file");
            b++;
          }
        }
      }
      return {
        oldFileName: e,
        newFileName: t,
        oldHeader: o,
        newHeader: s,
        hunks: p
      };
    }
  }
  function FSp(e) {
    let t = e.endsWith(`
`);
    let n = e.split(`
`).map(r => r + `
`);
    if (t) {
      n.pop();
    } else {
      n.push(n.pop().slice(0, -1));
    }
    return n;
  }
  var Pga = __lazy(() => {
    bpo();
  });
  var V9e = __lazy(() => {
    Cga();
    bpo();
    Iga();
    Pga();
  });
  function Hga() {
    return process.env.CLAUDE_CODE_ENTRYPOINT === "claude-desktop";
  }
  function BX() {
    if (Me.CLAUDE_CODE_IS_COWORK) {
      return true;
    }
    return Hga();
  }
  function jga() {
    return Me.CLAUDE_CODE_IS_COWORK;
  }
  function qga() {
    return $ga.join(getClaudeTempDir(), `cache-break-state-${getSessionId()}.json`);
  }
  function WSp() {
    if (vpo || !jga()) {
      return;
    }
    vpo = true;
    try {
      let e = Bga.readFileSync(qga(), "utf8");
      let t = qSp().safeParse(qt(e));
      if (!t.success) {
        return;
      }
      for (let [n, r] of Object.entries(t.data)) {
        if (DV.vZc(n)) {
          continue;
        }
        DV.set(n, {
          ...r,
          pendingChanges: null,
          buildDiffContent: () => ""
        });
      }
    } catch {}
  }
  function z9e() {
    if (!jga()) {
      return;
    }
    try {
      let e = {};
      for (let [r, o] of DV) {
        let {
          buildDiffContent: s,
          pendingChanges: i,
          ...a
        } = o;
        e[r] = a;
      }
      let t = qga();
      let n = De(e);
      Lga = Lga.then(() => tHn.mkdir(getClaudeTempDir(), {
        recursive: true,
        mode: 448
      })).then(() => tHn.writeFile(t, n)).catch(() => {});
    } catch {}
  }
  function YSp(e) {
    return e.includes("haiku");
  }
  function nHn(e, t) {
    if (e === "compact") {
      return "repl_main_thread";
    }
    for (let n of VSp) {
      if (e.startsWith(n)) {
        return t || e;
      }
    }
    return null;
  }
  function Fga(e) {
    return e.map(t => {
      if (!("cache_control" in t)) {
        return t;
      }
      let {
        cache_control: n,
        ...r
      } = t;
      return r;
    });
  }
  function Rpo(e) {
    let t = e.text;
    return typeof t === "string" ? t : undefined;
  }
  function Uga(e) {
    return Rpo(e)?.startsWith("x-anthropic-billing-header:") ?? false;
  }
  function Cpt(e) {
    let t = Bun.hash(De(e));
    return typeof t === "bigint" ? Number(t & 0xffffffffn) : t;
  }
  function Epo(e) {
    if (!e.startsWith("mcp__")) {
      return e;
    }
    let t = e.split("__")[1];
    if (!t) {
      return "mcp";
    }
    if (process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent" || RXr.vZc(t)) {
      return `mcp__${t}`;
    }
    return "mcp";
  }
  function wpo(e, t) {
    if (typeof e === "string") {
      t.push("s", String(e.length), e.slice(0, 32), e.slice(-32));
      return;
    }
    switch (e.type) {
      case "text":
      case "image":
      case "document":
      case "search_result":
      case "thinking":
      case "redacted_thinking":
      case "tool_use":
      case "tool_result":
      case "tool_reference":
      case "server_tool_use":
      case "web_search_tool_result":
      case "web_fetch_tool_result":
      case "advisor_tool_result":
      case "code_execution_tool_result":
      case "bash_code_execution_tool_result":
      case "text_editor_code_execution_tool_result":
      case "tool_search_tool_result":
      case "mcp_tool_use":
      case "mcp_tool_result":
      case "container_upload":
      case "compaction":
        break;
      default:
        {
          let r = e;
          break;
        }
    }
    if (t.push(e.type), "text" in e && typeof e.text === "string") {
      t.push("t", String(e.text.length), e.text.slice(0, 32), e.text.slice(-32));
    }
    if ("thinking" in e && typeof e.thinking === "string") {
      t.push("k", String(e.thinking.length));
    }
    if ("id" in e && typeof e.id === "string") {
      t.push("i", e.id);
    }
    if ("tool_use_id" in e && typeof e.tool_use_id === "string") {
      t.push("u", e.tool_use_id);
    }
    if ("name" in e && typeof e.name === "string") {
      t.push("n", e.name);
    }
    if ("input" in e && e.input !== undefined) {
      t.push("p", De(e.input));
    }
    if ("source" in e && e.source && typeof e.source === "object") {
      let r = e.source;
      if (t.push("m", String(r.type ?? ""), String(r.media_type ?? "")), typeof r.data === "string") {
        t.push(String(r.data.length));
      }
    }
    let n = "content" in e ? e.content : undefined;
    if (Array.isArray(n)) {
      t.push("[", String(n.length));
      for (let r of n) {
        wpo(r, t);
      }
      t.push("]");
    } else if (typeof n === "string") {
      t.push("c", String(n.length), n.slice(0, 32), n.slice(-32));
    }
    for (let [r, o] of Object.entries(e)) {
      if (XSp.vZc(r) || o === undefined) {
        continue;
      }
      let s = typeof o === "string" ? o : De(o);
      t.push(r, s.length > 256 ? `len:${s.length}` : s);
    }
  }
  function QSp(e) {
    return e.map(t => {
      let n = [t.message.role];
      let r = t.message.content;
      if (Array.isArray(r)) {
        n.push(String(r.length));
        for (let s of r) {
          wpo(s, n);
        }
      } else {
        wpo(r, n);
      }
      let o = Bun.hash(n.join("|"));
      return typeof o === "bigint" ? Number(o & 0xffffffffn) : o;
    });
  }
  function ZSp(e, t) {
    let n = {};
    for (let r = 0; r < e.length; r++) {
      n[t[r] ?? `__idx_${r}`] = Cpt(e[r]);
    }
    return n;
  }
  function eTp(e) {
    let t = 0;
    for (let n of e) {
      t += Rpo(n)?.length ?? 0;
    }
    return t;
  }
  function tTp(e, t, n) {
    let r = e.map(s => s.text).join(`

`);
    let o = t.map(s => {
      if (!("name" in s)) {
        return "unknown";
      }
      let i = "description" in s ? s.description : "";
      let a = "input_schema" in s ? De(s.input_schema) : "";
      return `${s.name}
  description: ${i}
  input_schema: ${a}`;
    }).sort().join(`

`);
    return `Model: ${n}

=== System Prompt ===

${r}

=== Tools (${t.length}) ===

${o}
`;
  }
  function Wga(e) {
    try {
      let {
        system: t,
        toolSchemas: n,
        querySource: r,
        model: o,
        agentId: s,
        fastMode: i,
        globalCacheStrategy: a = "",
        betas: l = [],
        autoModeActive: c = false,
        isUsingOverage: u = false,
        is1hCacheTTL: d = false,
        queryDepth: p,
        cacheDiagnosis: m = false,
        effortValue: f,
        extraBodyParams: h,
        messagesForAPI: g
      } = e;
      let y = nHn(r, s);
      if (!y) {
        return;
      }
      let _ = Fga(t).filter(de => !Uga(de));
      let b = Fga(n);
      let S = Cpt(_);
      let E = Cpt(b);
      let C = Cpt(t.filter(de => !Uga(de)).map(de => "cache_control" in de ? de.cache_control : null));
      let x = n.map(de => "name" in de ? de.name : "unknown");
      let A = () => ZSp(b, x);
      let k = () => _.map(de => Cpt(de));
      let I = () => _.map(de => Rpo(de)?.length ?? 0);
      let O = eTp(_);
      let M = () => tTp(t, n, o);
      let L = i ?? false;
      let P = [...l].sort();
      let F = f === undefined ? "" : String(f);
      let H = h === undefined ? 0 : Cpt(h);
      let U = g ? QSp(g) : [];
      WSp();
      let N = DV.get(y);
      if (!N) {
        while (DV.size >= 10) {
          let de = DV.keys().next().value;
          if (de !== undefined) {
            DV.delete(de);
          }
        }
        DV.set(y, {
          systemHash: S,
          toolsHash: E,
          cacheControlHash: C,
          toolNames: x,
          systemCharCount: O,
          model: o,
          fastMode: L,
          globalCacheStrategy: a,
          betas: P,
          autoModeActive: c,
          isUsingOverage: u,
          is1hCacheTTL: d,
          queryDepth: p,
          cacheDiagnosis: m,
          effortValue: F,
          extraBodyHash: H,
          callCount: 1,
          pendingChanges: null,
          prevCacheReadTokens: null,
          cacheDeletionsPending: false,
          messageHashes: U,
          buildDiffContent: M,
          perToolHashes: A(),
          perBlockHashes: k(),
          perBlockLengths: I()
        });
        z9e();
        return;
      }
      N.callCount++;
      let W = S !== N.systemHash;
      let j = E !== N.toolsHash;
      let z = o !== N.model;
      let V = L !== N.fastMode;
      let K = C !== N.cacheControlHash;
      let J = a !== N.globalCacheStrategy;
      let Q = P.length !== N.betas.length || P.some((de, be) => de !== N.betas[be]);
      let Z = c !== N.autoModeActive;
      let ne = u !== N.isUsingOverage;
      let oe = m !== N.cacheDiagnosis;
      let ee = F !== N.effortValue;
      let re = H !== N.extraBodyHash;
      let se = N.messageHashes.findIndex((de, be) => U[be] !== de);
      let ae = se !== -1;
      if (W || j || z || V || K || J || Q || Z || ne || oe || ee || re || ae) {
        let de = new Set(N.toolNames);
        let be = new Set(x);
        let fe = new Set(N.betas);
        let me = new Set(P);
        let Te = x.filter(xe => !de.vZc(xe));
        let ue = N.toolNames.filter(xe => !be.vZc(xe));
        let ce = [];
        if (j) {
          let xe = A();
          for (let ke of x) {
            if (!de.vZc(ke)) {
              continue;
            }
            if (xe[ke] !== N.perToolHashes[ke]) {
              ce.push(ke);
            }
          }
          N.perToolHashes = xe;
        }
        let le = N.perBlockHashes.length;
        let pe = _.length;
        let ve = [];
        let _e = [];
        if (W) {
          let xe = k();
          let ke = I();
          if (pe === le) {
            for (let Ie = 0; Ie < pe; Ie++) {
              if (xe[Ie] !== N.perBlockHashes[Ie]) {
                ve.push(Ie);
                _e.push(ke[Ie] - N.perBlockLengths[Ie]);
              }
            }
          }
          N.perBlockHashes = xe;
          N.perBlockLengths = ke;
        }
        N.pendingChanges = {
          systemPromptChanged: W,
          toolSchemasChanged: j,
          modelChanged: z,
          fastModeChanged: V,
          cacheControlChanged: K,
          globalCacheStrategyChanged: J,
          betasChanged: Q,
          autoModeChanged: Z,
          overageChanged: ne,
          cacheDiagnosisChanged: oe,
          effortChanged: ee,
          extraBodyChanged: re,
          messagesHistoryChanged: ae,
          firstChangedMessageIndex: se,
          prevMessageCount: N.messageHashes.length,
          addedToolCount: Te.length,
          removedToolCount: ue.length,
          addedTools: Te,
          removedTools: ue,
          changedToolSchemas: ce,
          prevBlockCount: le,
          newBlockCount: pe,
          changedBlockIndices: ve,
          changedBlockLengthDeltas: _e,
          systemCharDelta: O - N.systemCharCount,
          previousModel: N.model,
          newModel: o,
          prevGlobalCacheStrategy: N.globalCacheStrategy,
          newGlobalCacheStrategy: a,
          addedBetas: P.filter(xe => !fe.vZc(xe)),
          removedBetas: N.betas.filter(xe => !me.vZc(xe)),
          prevEffortValue: N.effortValue,
          newEffortValue: F,
          buildPrevDiffContent: N.buildDiffContent
        };
      } else {
        N.pendingChanges = null;
      }
      N.systemHash = S;
      N.toolsHash = E;
      N.cacheControlHash = C;
      N.toolNames = x;
      N.systemCharCount = O;
      N.model = o;
      N.fastMode = L;
      N.globalCacheStrategy = a;
      N.betas = P;
      N.autoModeActive = c;
      N.isUsingOverage = u;
      N.is1hCacheTTL = d;
      N.queryDepth = p;
      N.cacheDiagnosis = m;
      N.effortValue = F;
      N.extraBodyHash = H;
      N.messageHashes = U;
      N.buildDiffContent = M;
      z9e();
    } catch (t) {
      Oe(t);
    }
  }
  async function Gga(e, t, n, r, o, s, i) {
    let a = nHn(e, o);
    if (!a) {
      return;
    }
    let l = DV.get(a);
    if (!l) {
      return;
    }
    if (YSp(l.model)) {
      return;
    }
    try {
      let c = l.prevCacheReadTokens;
      l.prevCacheReadTokens = t;
      let u = r.findLast(E => E.type === "assistant");
      let d = u ? Date.now() - new Date(u.timestamp).getTime() : null;
      if (c === null) {
        return;
      }
      let p = l.pendingChanges;
      if (l.cacheDeletionsPending) {
        l.cacheDeletionsPending = false;
        logForDebugging(`[PROMPT CACHE] cache deletion applied, cache read: ${c} \u2192 ${t} (expected drop)`);
        l.pendingChanges = null;
        return;
      }
      let m = c - t;
      if (t >= c * 0.95 || m < 2000) {
        l.pendingChanges = null;
        return;
      }
      let f = [];
      if (p) {
        if (p.modelChanged) {
          f.push(`model changed (${p.previousModel} \u2192 ${p.newModel})`);
        }
        if (p.systemPromptChanged) {
          let E = p.systemCharDelta;
          let C = E === 0 ? "" : E > 0 ? ` (+${E} chars)` : ` (${E} chars)`;
          f.push(`system prompt changed${C}`);
        }
        if (p.toolSchemasChanged) {
          let E = p.addedToolCount > 0 || p.removedToolCount > 0 ? ` (+${p.addedToolCount}/-${p.removedToolCount} tools)` : " (tool prompt/schema changed, same tool set)";
          f.push(`tools changed${E}`);
        }
        if (p.fastModeChanged) {
          f.push("fast mode toggled");
        }
        if (p.globalCacheStrategyChanged) {
          f.push(`global cache strategy changed (${p.prevGlobalCacheStrategy || "none"} \u2192 ${p.newGlobalCacheStrategy || "none"})`);
        }
        if (p.cacheControlChanged && !p.globalCacheStrategyChanged && !p.systemPromptChanged) {
          f.push("cache_control changed (scope or TTL)");
        }
        if (p.betasChanged) {
          let E = p.addedBetas.length ? `+${p.addedBetas.join(",")}` : "";
          let C = p.removedBetas.length ? `-${p.removedBetas.join(",")}` : "";
          let x = [E, C].filter(Boolean).join(" ");
          f.push(`betas changed${x ? ` (${x})` : ""}`);
        }
        if (p.autoModeChanged) {
          f.push("auto mode toggled");
        }
        if (p.overageChanged) {
          f.push("overage state changed (TTL flip expected)");
        }
        if (p.cacheDiagnosisChanged) {
          f.push("cache diagnosis toggled");
        }
        if (p.effortChanged) {
          f.push(`effort changed (${p.prevEffortValue || "default"} \u2192 ${p.newEffortValue || "default"})`);
        }
        if (p.extraBodyChanged) {
          f.push("extra body params changed");
        }
        if (p.messagesHistoryChanged) {
          f.push(`message history mutated at index ${p.firstChangedMessageIndex}/${p.prevMessageCount}`);
        }
      }
      let h = d !== null && d > 300000;
      let g = d !== null && d > 3600000;
      let y;
      if (f.length > 0) {
        y = f.join(", ");
      } else if (g) {
        y = "possible 1h TTL expiry (prompt unchanged)";
      } else if (h) {
        y = "possible 5min TTL expiry (prompt unchanged)";
      } else if (d !== null) {
        y = "likely server-side (prompt unchanged, <5min gap)";
      } else {
        y = "unknown cause";
      }
      logEvent("tengu_prompt_cache_break", {
        systemPromptChanged: p?.systemPromptChanged ?? false,
        toolSchemasChanged: p?.toolSchemasChanged ?? false,
        modelChanged: p?.modelChanged ?? false,
        fastModeChanged: p?.fastModeChanged ?? false,
        cacheControlChanged: p?.cacheControlChanged ?? false,
        globalCacheStrategyChanged: p?.globalCacheStrategyChanged ?? false,
        betasChanged: p?.betasChanged ?? false,
        autoModeChanged: p?.autoModeChanged ?? false,
        overageChanged: p?.overageChanged ?? false,
        cacheDiagnosisChanged: p?.cacheDiagnosisChanged ?? false,
        effortChanged: p?.effortChanged ?? false,
        extraBodyChanged: p?.extraBodyChanged ?? false,
        messagesHistoryChanged: p?.messagesHistoryChanged ?? false,
        firstChangedMessageIndex: p?.firstChangedMessageIndex ?? -1,
        addedToolCount: p?.addedToolCount ?? 0,
        removedToolCount: p?.removedToolCount ?? 0,
        systemCharDelta: p?.systemCharDelta ?? 0,
        prevBlockCount: p?.prevBlockCount ?? 0,
        newBlockCount: p?.newBlockCount ?? 0,
        changedBlockIndices: (p?.changedBlockIndices ?? []).join(","),
        changedBlockLengthDeltas: (p?.changedBlockLengthDeltas ?? []).join(","),
        addedTools: (p?.addedTools ?? []).map(Epo).join(","),
        removedTools: (p?.removedTools ?? []).map(Epo).join(","),
        changedToolSchemas: (p?.changedToolSchemas ?? []).map(Epo).join(","),
        addedBetas: (p?.addedBetas ?? []).join(","),
        removedBetas: (p?.removedBetas ?? []).join(","),
        prevGlobalCacheStrategy: p?.prevGlobalCacheStrategy ?? "",
        newGlobalCacheStrategy: p?.newGlobalCacheStrategy ?? "",
        systemHash: l.systemHash,
        toolsHash: l.toolsHash,
        is1hCacheTTL: l.is1hCacheTTL,
        queryDepth: l.queryDepth,
        querySource: Vg(e),
        model: l.model,
        globalCacheStrategy: l.globalCacheStrategy,
        callNumber: l.callCount,
        prevCacheReadTokens: c,
        cacheReadTokens: t,
        cacheCreationTokens: n,
        timeSinceLastAssistantMsg: d ?? -1,
        lastAssistantMsgOver5minAgo: h,
        lastAssistantMsgOver1hAgo: g,
        isCowork: Me.CLAUDE_CODE_IS_COWORK,
        isDesktop: Hga(),
        requestId: s ?? "",
        previousMessageId: i ?? ""
      });
      let _;
      let b = _ ? `, diff: ${_}` : "";
      let S = `[PROMPT CACHE BREAK] ${y} [source=${e}, call #${l.callCount}, cache read: ${c} \u2192 ${t}, creation: ${n}${b}]`;
      logForDebugging(S, {
        level: "warn"
      });
      l.pendingChanges = null;
    } catch (c) {
      Oe(c);
    } finally {
      z9e();
    }
  }
  function Vga(e, t) {
    try {
      logEvent("tengu_prompt_cache_diagnosis_received", {
        diagnosisType: e.type,
        tokensMissed: e.cache_missed_input_tokens ?? -1,
        requestId: t.requestId ?? "",
        previousMessageId: t.previousMessageId ?? "",
        model: t.model,
        isCowork: Me.CLAUDE_CODE_IS_COWORK,
        is1hCacheTTL: t.is1hCacheTTL,
        querySource: Vg(t.querySource),
        queryDepth: t.queryDepth
      });
    } catch (n) {
      Oe(n);
    }
  }
  function zga(e, t) {
    let n = nHn(e, t);
    let r = n ? DV.get(n) : undefined;
    if (r) {
      r.cacheDeletionsPending = true;
      z9e();
    }
  }
  function $4t(e, t) {
    let n = t ?? nHn(e);
    let r = n ? DV.get(n) : undefined;
    if (r) {
      r.prevCacheReadTokens = null;
      z9e();
    }
  }
  function Kga(e) {
    DV.delete(e);
    z9e();
  }
  function Yga() {
    DV.clear();
    vpo = false;
    z9e();
  }
  var Bga;
  var tHn;
  var $ga;
  var DV;
  var qSp;
  var vpo = false;
  var Lga;
  var VSp;
  var XSp;
  var ADe = __lazy(() => {
    at();
    je();
    pr();
    Rn();
    wm();
    qg();
    Ot();
    Gu();
    Bga = require("fs");
    tHn = require("fs/promises");
    $ga = require("path");
    DV = new Map();
    qSp = we(() => Ke.record(Ke.string(), Ke.object({
      systemHash: Ke.number(),
      toolsHash: Ke.number(),
      cacheControlHash: Ke.number(),
      toolNames: Ke.array(Ke.string()),
      perToolHashes: Ke.record(Ke.string(), Ke.number()),
      perBlockHashes: Ke.array(Ke.number()),
      perBlockLengths: Ke.array(Ke.number()),
      systemCharCount: Ke.number(),
      model: Ke.string(),
      fastMode: Ke.boolean(),
      globalCacheStrategy: Ke.string(),
      betas: Ke.array(Ke.string()),
      autoModeActive: Ke.boolean(),
      isUsingOverage: Ke.boolean(),
      is1hCacheTTL: Ke.boolean().default(false),
      queryDepth: Ke.number().optional(),
      cacheDiagnosis: Ke.boolean().default(false),
      effortValue: Ke.string(),
      extraBodyHash: Ke.number(),
      callCount: Ke.number(),
      prevCacheReadTokens: Ke.number().nullable(),
      cacheDeletionsPending: Ke.boolean(),
      messageHashes: Ke.array(Ke.number())
    })));
    Lga = Promise.resolve();
    VSp = ["repl_main_thread", "sdk", "agent:custom", "agent:default", "agent:builtin"];
    XSp = new Set(["type", "text", "thinking", "id", "tool_use_id", "name", "input", "source", "content", "cache_control"]);
  });
  function sTp(e) {
    if (!e.content) {
      return 0;
    }
    if (typeof e.content === "string") {
      return xm(e.content);
    }
    return e.content.reduce((t, n) => {
      if (n.type === "text") {
        return t + xm(n.text);
      } else if (n.type === "image" || n.type === "document") {
        return t + 2000;
      }
      return t;
    }, 0);
  }
  function iTp(e) {
    let t = [];
    for (let n of e) {
      if (n.type === "assistant" && Array.isArray(n.message.content)) {
        for (let r of n.message.content) {
          if (r.type === "tool_use" && oTp.vZc(r.name)) {
            t.push(r.id);
          }
        }
      }
    }
    return t;
  }
  function Jga(e, t) {
    let n = [];
    for (let r of e) {
      if (r.type !== "assistant" || !Array.isArray(r.message.content)) {
        continue;
      }
      for (let o of r.message.content) {
        if (o.type === "tool_use" && o.name === "Read" && t.vZc(o.id)) {
          let s = o.input.file_path;
          if (typeof s === "string") {
            n.push(s);
          }
        }
      }
    }
    return n;
  }
  function aTp(e) {
    return typeof e === "string" && (e === "[Old tool result content cleared]" || e.startsWith("<persisted-output>"));
  }
  function kpo(e, t) {
    let n = iTp(e);
    let r = Math.max(1, t);
    let o = new Set(n.slice(-r));
    let s = new Set(n.filter(l => !o.vZc(l)));
    let i = 0;
    let a = [];
    if (s.size > 0) {
      for (let l of e) {
        if (l.type !== "user" || !Array.isArray(l.message.content)) {
          continue;
        }
        for (let c of l.message.content) {
          if (c.type === "tool_result" && s.vZc(c.tool_use_id) && !aTp(c.content)) {
            i += sTp(c);
            a.push(c);
          }
        }
      }
    }
    return {
      clearSet: s,
      keepSet: o,
      tokensSaved: i,
      candidates: a
    };
  }
  function H4t(e, t, n) {
    if (t.size === 0) {
      return [...e];
    }
    return e.map(r => {
      if (r.type !== "user" || !Array.isArray(r.message.content)) {
        return r;
      }
      let o = false;
      let s = r.message.content.map(i => {
        if (i.type !== "tool_result" || !t.vZc(i.tool_use_id)) {
          return i;
        }
        let l = Array.isArray(i.content) && i.content.some(c => c.type === "image" || c.type === "document") ? "[Old tool result content cleared]" : n?.get(i.tool_use_id) ?? "[Old tool result content cleared]";
        if (i.content === l) {
          return i;
        }
        o = true;
        return {
          ...i,
          content: l
        };
      });
      return o ? {
        ...r,
        message: {
          ...r.message,
          content: s
        }
      } : r;
    });
  }
  async function Xga(e, t, n) {
    let {
      keepSet: r,
      tokensSaved: o,
      candidates: s
    } = kpo(e, n.keepRecent);
    if (o < 20000) {
      return null;
    }
    let i = new Set(s.map(c => c.tool_use_id));
    let a = new Map();
    for (let c of s) {
      let u = c.content ? await n.persist?.(c.content, c.tool_use_id) : null;
      a.set(c.tool_use_id, u ?? "[Old tool result content cleared]");
    }
    let l = H4t(e, i, a);
    if (logEvent("tengu_time_based_microcompact", {
      toolsCleared: i.size,
      toolsKept: r.size,
      keepRecent: n.keepRecent,
      tokensSaved: o,
      trigger: "context_hint"
    }), Pe("compact_micro_keep_recent"), logForDebugging(`[KEEP-RECENT MC] context_hint trigger, cleared ${i.size} tool results (~${o} tokens), kept last ${r.size}`), Spt(), BX() && t) {
      zga(t);
    }
    return {
      messages: l,
      tokensSaved: o,
      clearedIds: i,
      clearedContent: a
    };
  }
  var oTp;
  var oHn = __lazy(() => {
    Ay();
    Tm();
    mx();
    Fk();
    _x();
    EX();
    Hdt();
    je();
    Jf();
    ln();
    Ot();
    ADe();
    aU();
    Tpt();
    oTp = new Set(["Read", ...Nq, "Grep", "Glob", "WebSearch", "WebFetch", "Edit", "Write"]);
  });
  async function Apo() {
    let e = j4t.join(er(), "session-env", getSessionId());
    await zt().mkdir(e);
    return e;
  }
  async function Zga(e, t) {
    let n = e.toLowerCase();
    return j4t.join(await Apo(), `${n}-hook-${t}.sh`);
  }
  async function eya() {
    try {
      let e = await Apo();
      let t = await PDe.readdir(e);
      await Promise.all(t.filter(n => (n.startsWith("filechanged-hook-") || n.startsWith("cwdchanged-hook-")) && iHn.test(n)).map(n => PDe.writeFile(j4t.join(e, n), "")));
    } catch (e) {
      if (en(e) !== "ENOENT") {
        logForDebugging(`Failed to clear cwd env files: ${he(e)}`);
      }
    }
  }
  function Rpt() {
    logForDebugging("Invalidating session environment cache");
    IDe = undefined;
    sHn = undefined;
  }
  async function tya() {
    let e = getSessionId();
    if (IDe !== undefined && sHn === e) {
      return IDe;
    }
    let t = [];
    let n = process.env.CLAUDE_ENV_FILE;
    if (n) {
      try {
        let o = (await PDe.readFile(n, "utf8")).trim();
        if (o) {
          t.push(o);
          logForDebugging(`Session environment loaded from CLAUDE_ENV_FILE: ${n} (${o.length} chars)`);
        }
      } catch (o) {
        if (en(o) !== "ENOENT") {
          logForDebugging(`Failed to read CLAUDE_ENV_FILE: ${he(o)}`);
        }
      }
    }
    let r = await Apo();
    try {
      let s = (await PDe.readdir(r)).filter(i => iHn.test(i)).sort(lTp);
      for (let i of s) {
        let a = j4t.join(r, i);
        try {
          let l = (await PDe.readFile(a, "utf8")).trim();
          if (l) {
            t.push(l);
          }
        } catch (l) {
          if (en(l) !== "ENOENT") {
            logForDebugging(`Failed to read hook file ${a}: ${he(l)}`);
          }
        }
      }
      if (s.length > 0) {
        logForDebugging(`Session environment loaded from ${s.length} hook file(s)`);
      }
    } catch (o) {
      if (en(o) !== "ENOENT") {
        logForDebugging(`Failed to load session environment from hooks: ${he(o)}`);
      }
    }
    if (t.length === 0) {
      logForDebugging("No session environment scripts found");
      IDe = null;
      sHn = e;
      return IDe;
    }
    IDe = t.join(`
`);
    sHn = e;
    logForDebugging(`Session environment script ready (${IDe.length} chars total)`);
    return IDe;
  }
  function lTp(e, t) {
    let n = e.match(iHn);
    let r = t.match(iHn);
    let o = n?.[1] || "";
    let s = r?.[1] || "";
    if (o !== s) {
      return (Qga[o] ?? 99) - (Qga[s] ?? 99);
    }
    let i = parseInt(n?.[2] || "0", 10);
    let a = parseInt(r?.[2] || "0", 10);
    return i - a;
  }
  var PDe;
  var j4t;
  var IDe = undefined;
  var sHn = undefined;
  var Qga;
  var iHn;
  var K9e = __lazy(() => {
    at();
    je();
    gn();
    dt();
    PDe = require("fs/promises");
    j4t = require("path");
    Qga = {
      setup: 0,
      sessionstart: 1,
      cwdchanged: 2,
      filechanged: 3
    };
    iHn = /^(setup|sessionstart|cwdchanged|filechanged)-hook-(\d+)\.sh$/;
  });
  function cTp() {
    let e = null;
    let t;
    let n = [];
    let r = [];
    let o = false;
    let s = false;
    let i = null;
    let a = null;
    function l(y) {
      i = y;
    }
    function c(y) {
      if (o) {
        return;
      }
      o = true;
      t = y;
      let _ = U2();
      if (s = (_?.CwdChanged?.length ?? 0) > 0 || (_?.FileChanged?.length ?? 0) > 0, s) {
        a = Ti(g);
      }
      let b = u(_);
      if (b.length === 0) {
        return;
      }
      d(b);
    }
    function u(y) {
      let _ = (y ?? U2())?.FileChanged ?? [];
      let b = $_() ? [] : getMainThreadAgentHooks()?.FileChanged ?? [];
      let S = [..._, ...b];
      let E = [];
      for (let A of S) {
        if (!A.matcher) {
          continue;
        }
        for (let k of A.matcher.split("|").map(I => I.trim())) {
          if (!k) {
            continue;
          }
          E.push(aHn.isAbsolute(k) ? k : aHn.join(t, k));
        }
      }
      let C = Ro([...E, ...n]);
      let x = C.filter(A => !ate(A));
      if (x.length !== C.length) {
        logForDebugging("FileChanged: dropped remote UNC watch path(s)", {
          level: "warn"
        });
      }
      return x;
    }
    function d(y) {
      logForDebugging(`FileChanged: watching ${y.length} paths`);
      e = jF.watch(y, {
        persistent: true,
        ignoreInitial: true,
        awaitWriteFinish: {
          stabilityThreshold: 500,
          pollInterval: 200
        },
        ignorePermissionErrors: true
      });
      e.on("change", b => p(b, "change"));
      e.on("add", b => p(b, "add"));
      e.on("unlink", b => p(b, "unlink"));
      let _ = false;
      e.on("error", b => {
        if (!_) {
          _ = true;
          Ae("file_watcher_start", "fs_error");
        }
        logForDebugging(`FileChanged: watcher error: ${he(b)}`, {
          level: "warn"
        });
      });
      e.on("ready", () => {
        if (!_) {
          _ = true;
          Pe("file_watcher_start");
        }
      });
    }
    function p(y, _) {
      logForDebugging(`FileChanged: ${_} ${y}`);
      executeFileChangedHooks(y, _).then(({
        results: b,
        watchPaths: S,
        systemMessages: E
      }) => {
        if (Pe("file_watcher_change_detected"), S.length > 0) {
          m(S);
        }
        for (let C of E) {
          i?.(C, false);
        }
        for (let C of b) {
          if (!C.succeeded && C.output) {
            i?.(C.output, true);
          }
        }
      }).catch(b => {
        Ae("file_watcher_change_detected", "hook_exec_failed");
        let S = he(b);
        logForDebugging(`FileChanged hook failed: ${S}`, {
          level: "error"
        });
        i?.(S, true);
      });
    }
    function m(y) {
      if (!o) {
        return;
      }
      let _ = y.slice().sort();
      if (_.length === r.length && _.every((b, S) => b === r[S])) {
        return;
      }
      n = y;
      r = _;
      f();
    }
    function f() {
      if (e) {
        e.close();
        e = null;
      }
      let y = u();
      if (y.length > 0) {
        d(y);
      }
    }
    async function h(y, _) {
      if (y === _) {
        return;
      }
      let b = U2();
      let S = $_() ? undefined : getMainThreadAgentHooks();
      if (!((b?.CwdChanged?.length ?? 0) > 0 || (b?.FileChanged?.length ?? 0) > 0 || (S?.CwdChanged?.length ?? 0) > 0 || (S?.FileChanged?.length ?? 0) > 0)) {
        return;
      }
      t = _;
      await eya();
      let C = await executeCwdChangedHooks(y, _).catch(x => {
        let A = he(x);
        logForDebugging(`CwdChanged hook failed: ${A}`, {
          level: "error"
        });
        i?.(A, true);
        return {
          results: [],
          watchPaths: [],
          systemMessages: []
        };
      });
      n = C.watchPaths;
      r = C.watchPaths.slice().sort();
      for (let x of C.systemMessages) {
        i?.(x, false);
      }
      for (let x of C.results) {
        if (!x.succeeded && x.output) {
          i?.(x.output, true);
        }
      }
      if (o) {
        f();
      }
    }
    function g() {
      if (a) {
        a();
        a = null;
      }
      if (e) {
        e.close();
        e = null;
      }
      n = [];
      r = [];
      o = false;
      s = false;
      i = null;
    }
    return {
      initialize: c,
      setEnvHookNotifier: l,
      updateWatchPaths: m,
      onCwdChanged: h,
      dispose: g,
      [Symbol.dispose]: g
    };
  }
  var aHn;
  var lHn;
  var nya;
  var Ipo;
  var rya;
  var oya;
  var q4t = __lazy(() => {
    oue();
    at();
    ln();
    mm();
    hd();
    je();
    dt();
    Sp();
    K9e();
    i1();
    aHn = require("path");
    lHn = cTp();
    nya = lHn.initialize;
    Ipo = lHn.setEnvHookNotifier;
    rya = lHn.updateWatchPaths;
    oya = lHn.onCwdChanged;
  });
  var Mpo = {};
  __export(Mpo, {
    setupPluginHookHotReload: () => setupPluginHookHotReload,
    resetHotReloadState: () => resetHotReloadState,
    pruneRemovedPluginHooks: () => pruneRemovedPluginHooks,
    loadPluginHooks: () => loadPluginHooks,
    getPluginAffectingSettingsSnapshot: () => getPluginAffectingSettingsSnapshot,
    clearPluginHookCache: () => clearPluginHookCache
  });
  function uTp(e) {
    let t = {
      PreToolUse: [],
      PostToolUse: [],
      PostToolUseFailure: [],
      PostToolBatch: [],
      PermissionDenied: [],
      Notification: [],
      UserPromptSubmit: [],
      UserPromptExpansion: [],
      SessionStart: [],
      SessionEnd: [],
      Stop: [],
      StopFailure: [],
      SubagentStart: [],
      SubagentStop: [],
      PreCompact: [],
      PostCompact: [],
      PermissionRequest: [],
      Setup: [],
      TeammateIdle: [],
      TaskCreated: [],
      TaskCompleted: [],
      Elicitation: [],
      ElicitationResult: [],
      ConfigChange: [],
      WorktreeCreate: [],
      WorktreeRemove: [],
      InstructionsLoaded: [],
      CwdChanged: [],
      FileChanged: [],
      MessageDisplay: []
    };
    if (!e.hooksConfig) {
      return t;
    }
    for (let [n, r] of Object.entries(e.hooksConfig)) {
      let o = n;
      if (!t[o]) {
        continue;
      }
      for (let s of r) {
        if (s.hooks.length > 0) {
          t[o].push({
            matcher: s.matcher,
            hooks: s.hooks,
            pluginRoot: e.path,
            pluginName: e.name,
            pluginId: e.source
          });
        }
      }
    }
    return t;
  }
  async function loadPluginHooks() {
    if (Ql()) {
      logForDebugging("Safe mode: skipping plugin hook registration");
      return;
    }
    await sya();
  }
  function clearPluginHookCache() {
    sya.cache?.clear?.();
  }
  async function pruneRemovedPluginHooks() {
    if (!getRegisteredHooks()) {
      return;
    }
    let {
      enabled: e
    } = await loadAllPluginsCacheOnly();
    let t = new Set(e.map(o => o.path));
    let n = getRegisteredHooks();
    if (!n) {
      return;
    }
    let r = {};
    for (let [o, s] of Object.entries(n)) {
      let i = s.filter(a => "pluginRoot" in a && t.vZc(a.pluginRoot));
      if (i.length > 0) {
        r[o] = i;
      }
    }
    clearRegisteredPluginHooks();
    registerHookCallbacks(r);
  }
  function resetHotReloadState() {
    Ppo = false;
    cHn = undefined;
  }
  function getPluginAffectingSettingsSnapshot() {
    let e = getInitialSettings();
    let t = getSettingsForSource("policySettings");
    let n = r => r ? Object.fromEntries(Object.entries(r).sort()) : {};
    return De({
      enabledPlugins: n(e.enabledPlugins),
      extraKnownMarketplaces: n(e.extraKnownMarketplaces),
      strictKnownMarketplaces: t?.strictKnownMarketplaces ?? [],
      blockedMarketplaces: t?.blockedMarketplaces ?? [],
      disableSideloadFlags: t?.disableSideloadFlags === true
    });
  }
  function setupPluginHookHotReload() {
    if (Ppo) {
      return;
    }
    Ppo = true;
    cHn = getPluginAffectingSettingsSnapshot();
    fM.subscribe(e => {
      if (e === "policySettings") {
        let t = getPluginAffectingSettingsSnapshot();
        if (t === cHn) {
          logForDebugging("Plugin hooks: skipping reload, plugin-affecting settings unchanged");
          return;
        }
        cHn = t;
        logForDebugging("Plugin hooks: reloading due to plugin-affecting settings change");
        clearPluginCache("loadPluginHooks: plugin-affecting settings changed");
        clearPluginHookCache();
        loadPluginHooks();
      }
    });
  }
  var Ppo = false;
  var cHn;
  var sya;
  var Y9e = __lazy(() => {
    at();
    ln();
    je();
    gn();
    ode();
    H8();
    xg();
    sya = TEr(async () => {
      let {
        enabled: e
      } = await loadAllPluginsCacheOnly();
      let t = {
        PreToolUse: [],
        PostToolUse: [],
        PostToolUseFailure: [],
        PostToolBatch: [],
        PermissionDenied: [],
        Notification: [],
        UserPromptSubmit: [],
        UserPromptExpansion: [],
        SessionStart: [],
        SessionEnd: [],
        Stop: [],
        StopFailure: [],
        SubagentStart: [],
        SubagentStop: [],
        PreCompact: [],
        PostCompact: [],
        PermissionRequest: [],
        Setup: [],
        TeammateIdle: [],
        TaskCreated: [],
        TaskCompleted: [],
        Elicitation: [],
        ElicitationResult: [],
        ConfigChange: [],
        WorktreeCreate: [],
        WorktreeRemove: [],
        InstructionsLoaded: [],
        CwdChanged: [],
        FileChanged: [],
        MessageDisplay: []
      };
      let n = AJ();
      let r = n === null ? e : [...e.filter(i => n.vZc(i.source)), ...e.filter(i => !n.vZc(i.source))];
      let o = new Set();
      for (let i of r) {
        if (!i.hooksConfig) {
          continue;
        }
        if (o.vZc(i.name)) {
          logForDebugging(`Skipping duplicate hook registration for plugin "${i.name}" from ${i.source} - already registered from another source`);
          continue;
        }
        o.add(i.name);
        logForDebugging(`Loading hooks from plugin: ${i.name}`);
        let a = uTp(i);
        for (let l of Object.keys(a)) {
          t[l].push(...a[l]);
        }
      }
      clearRegisteredPluginHooks();
      registerHookCallbacks(t);
      let s = Object.values(t).reduce((i, a) => i + a.reduce((l, c) => l + c.hooks.length, 0), 0);
      logForDebugging(`Registered ${s} hooks from ${e.length} plugins`);
      Pe("plugin_load_hooks");
    });
  });
  var g$;
  var ODe = __lazy(() => {
    ph();
    g$ = Si();
  });
  function iya() {
    let e = Npo;
    Npo = undefined;
    return e;
  }
  function xpt() {
    let e = Lpo;
    Lpo = undefined;
    return e;
  }
  async function MV(e, {
    sessionId: t,
    sessionTitle: n,
    agentType: r,
    model: o,
    forceSyncExecution: s
  } = {}) {
    if (Pc("hooks")) {
      return [];
    }
    let i = [];
    let a = [];
    let l = [];
    let c;
    let u = false;
    if ($_() && (Ql() || AJ() === null)) {
      logForDebugging(Ql() ? "Skipping plugin hooks - safe mode disables plugins (managed settings-file hooks still run)" : "Skipping plugin hooks - allowManagedHooksOnly is enabled and no managed plugins");
    } else {
      try {
        await bnt("load_plugin_hooks", () => loadPluginHooks());
      } catch (p) {
        let m = p instanceof Error ? p.message : String(p);
        let f = "";
        if (m.includes("Failed to clone") || m.includes("network") || m.includes("ETIMEDOUT") || m.includes("ENOTFOUND")) {
          f = "This appears to be a network issue. Check your internet connection and try again.";
        } else if (m.includes("Permission denied") || m.includes("EACCES") || m.includes("EPERM")) {
          f = "This appears to be a permissions issue. Check file permissions on ~/.claude/plugins/";
        } else if (m.includes("Invalid") || m.includes("parse") || m.includes("JSON") || m.includes("schema")) {
          f = "This appears to be a configuration issue. Check your plugin settings in .claude/settings.json";
        } else {
          f = "Please fix the plugin configuration or remove problematic plugins from your settings.";
        }
        logForDebugging(`Warning: Failed to load plugin hooks. SessionStart hooks from plugins will not execute. Error: ${m}. ${f}`, {
          level: "error"
        });
      }
    }
    let d = r ?? getMainThreadAgentType();
    for await (let p of executeSessionStartHooks(e, t, n, d, o, undefined, undefined, s)) {
      if (p.message) {
        i.push(p.message);
      }
      if (p.additionalContexts && p.additionalContexts.length > 0) {
        a.push(...p.additionalContexts);
      }
      if (p.initialUserMessage) {
        Npo = p.initialUserMessage;
      }
      if (p.sessionTitle) {
        c = p.sessionTitle;
      }
      if (p.watchPaths && p.watchPaths.length > 0) {
        l.push(...p.watchPaths);
      }
      if (p.reloadSkills) {
        u = true;
      }
    }
    if (u) {
      clearCommandsCache();
      resetSentSkillNames();
      g$.emit();
      Pe("hook_session_start_reload_skills");
    }
    if (Lpo = e === "startup" || e === "resume" ? c : undefined, l.length > 0) {
      rya(l);
    }
    if (a.length > 0) {
      let p = createAttachmentMessage({
        type: "hook_additional_context",
        content: a,
        hookName: "SessionStart",
        toolUseID: "SessionStart",
        hookEvent: "SessionStart"
      });
      i.push(p);
    }
    return i;
  }
  async function aya(e, {
    forceSyncExecution: t
  } = {}) {
    if (Pc("hooks")) {
      return [];
    }
    let n = [];
    let r = [];
    if ($_() && (Ql() || AJ() === null)) {
      logForDebugging(Ql() ? "Skipping plugin hooks - safe mode disables plugins (managed settings-file hooks still run)" : "Skipping plugin hooks - allowManagedHooksOnly is enabled and no managed plugins");
    } else {
      try {
        await loadPluginHooks();
      } catch (o) {
        let s = o instanceof Error ? o.message : String(o);
        logForDebugging(`Warning: Failed to load plugin hooks. Setup hooks from plugins will not execute. Error: ${s}`, {
          level: "warn"
        });
      }
    }
    for await (let o of executeSetupHooks(e, undefined, undefined, t)) {
      if (o.message) {
        n.push(o.message);
      }
      if (o.additionalContexts && o.additionalContexts.length > 0) {
        r.push(...o.additionalContexts);
      }
    }
    if (r.length > 0) {
      let o = createAttachmentMessage({
        type: "hook_additional_context",
        content: r,
        hookName: "Setup",
        toolUseID: "Setup",
        hookEvent: "Setup"
      });
      n.push(o);
    }
    return n;
  }
  var Npo;
  var Lpo;
  var DDe = __lazy(() => {
    at();
    Bm();
    ln();
    rR();
    wb();
    je();
    Zm();
    gn();
    q4t();
    i1();
    Sp();
    Y9e();
    H8();
    ODe();
  });
  function mTp(e) {
    let t = e;
    let n = "";
    try {
      n = cya.homedir();
    } catch {}
    if (n) {
      t = t.replaceAll(n + "/", "~/").replaceAll(n + "\\", "~\\");
    }
    let r = (o, s) => /https?:\/\/[^\s'",;|()]*$/i.test(o.slice(0, s));
    t = t.replace(/([/\\](?:Users|home)[/\\])[^/\\\n]+/gi, (o, s, i, a) => r(a, i) ? o : `${s}<user>`).replace(/(\/(?:Volumes|mnt|media)\/)[^/\n]+/g, (o, s, i, a) => r(a, i) ? o : `${s}<vol>`).replace(/\b([A-Za-z]):[\\/]/g, "<drv>:\\").replace(/\\\\[^\\]+\\[^\\\s'",:()]+/g, "<unc>");
    return t;
  }
  function hTp(e) {
    return e.replace(fTp, "<email>");
  }
  function bTp(e) {
    return e.replace(gTp, "<ip>").replace(yTp, t => _Tp.test(t) ? t : "<ip>");
  }
  function vTp(e) {
    return e.replace(STp, (t, n, r) => r.replace(/\D/g, "").length >= 7 && !TTp.test(r) ? `${n}<phone>` : `${n}${r}`).replace(ETp, "<phone>");
  }
  function CTp(e) {
    let t = e;
    for (let [n, r] of wTp) {
      t = t.replace(n, r);
    }
    return t;
  }
  function RTp(e) {
    return e.replace(/https?:\/\/\S+/gi, "<url>").replace(/\b(?:ssh|git|gs|s3|file|s?ftp|wss?|postgres(?:ql)?|mysql|mongodb(?:\+srv)?|rediss?|amqps?):\/\/\S+/gi, "<url>").replace(/\b[\w.-]+\.(?:ant\.dev|anthropic\.com)\b[^\s"')\]]*/gi, "<url>");
  }
  function MTp(e) {
    return e.replace(/\b(E[A-Z0-9]+: [^,'\n]{1,80}, [a-z]\w{0,31} ')[^]*/g, "$1<path>'").replace(xTp, "~/<path>").replace(kTp, "<path>").replace(ATp, "<path>").replace(ITp, "<path>").replace(PTp, "<path>").replace(OTp, "<path>").replace(DTp, "<path>");
  }
  function LTp(e) {
    return e.replace(NTp, "<api-error-body>");
  }
  function FTp(e) {
    return e.replace(/\bmcp__[A-Za-z0-9_-]+__([A-Za-z0-9_-]+)/g, "mcp__<server>__$1").replace(/\bmcp__[A-Za-z0-9_-]+/g, "mcp__<server>").replace(/\bplugin:[^\s:"')\],]+:[^\s"')\],]*/g, "plugin:<server>");
  }
  function BTp(e) {
    try {
      return e.replace(UTp, (t, n) => `${n}<http-body.${t.length - n.length}>`);
    } catch {
      return e;
    }
  }
  function uya(e, t) {
    let n = e;
    return [n?.path, n?.dest].filter(r => typeof r === "string" && r.length > 0).sort((r, o) => o.length - r.length).reduce((r, o) => r.split(o).join("<path>"), t);
  }
  function Gq(e) {
    let t = e.length > 4000 ? e.slice(0, 4000) + "\u2026<truncated>" : e;
    let r = BTp(t).replace(/:\/\/[^\s/]*@(?=[^@\s]*(?:[/:\s]|$))/g, "://<userinfo>@").replace(/\b[\w][\w.+-]*@[\w.-]+:[^\s"')\]]*(?:\/[^\s"')\]]*|\.git\b)/gi, "<url>");
    let o = FTp(vTp(CTp(bTp(hTp(mTp(r))))));
    return MTp(RTp(LTp(o)));
  }
  var cya;
  var fTp;
  var gTp;
  var yTp;
  var _Tp;
  var STp;
  var TTp;
  var ETp;
  var wTp;
  var J9e;
  var xTp;
  var kTp;
  var ATp;
  var ITp;
  var PTp;
  var OTp;
  var DTp;
  var NTp;
  var UTp;
  var X9e = __lazy(() => {
    cya = require("os");
    fTp = /[\w.+-]{1,64}@[\w-]{1,63}(?:\.[\w-]{1,63}){0,7}\.[A-Za-z][\w-]{0,62}/g;
    gTp = /\b(?:\d{1,3}\.){3}\d{1,3}\b/g;
    yTp = /\b(?:[A-Fa-f0-9]{1,4}:){2,7}(?::?[A-Fa-f0-9]{1,4}){1,7}\b/g;
    _Tp = /^\d{1,2}:\d{2}:\d{2}$/;
    STp = /(^|[^\w/.-])((?:\+\d{1,3}[ \t.-]?)?\(?\d{2,4}\)?[ \t.-]\d{2,4}[ \t.-]\d{2,4}(?:[ \t.-]\d{2,4}(?![ \t.-]\d))?)(?!\w)/g;
    TTp = /^\s*\d{4}[-.]\d{2}[-.]\d{2}(?:[ T]\d{1,2})?\s*$/;
    ETp = /\+\d{7,15}\b/g;
    wTp = [[/\bBearer\s+[A-Za-z0-9._~+/=-]{8,}/gi, "Bearer <token>"], [/(:\s*)Basic\s+[A-Za-z0-9+/=]{8,}/gi, "$1Basic <token>"], [/\bsk-ant-[A-Za-z0-9_-]{8,}/g, "<token>"], [/\bsk-[A-Za-z0-9_-]{20,}/g, "<token>"], [/\bAKIA[0-9A-Z]{16}\b/g, "<token>"], [/\bASIA[0-9A-Z]{16}\b/g, "<token>"], [/\barn:(aws[\w-]*):([\w-]*):([\w-]*):\d*:[^\s"')\],]*/g, "arn:$1:$2:$3:<redacted>"], [/\bgh[opusr]_[A-Za-z0-9]{36,}/g, "<token>"], [/\bxox[baprs]-[A-Za-z0-9-]{10,}/g, "<token>"], [/\bey[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}/g, "<jwt>"], [/(?<![A-Za-z0-9+_-])(?!mcp__)(?=[a-z_]*[A-Z0-9+-])[A-Za-z0-9+_-]{40,}={0,2}\b/g, "<blob>"]];
    J9e = /[^"'\n]*(?:['"](?=[^\s"',;:)\]}])[^"'\n]*)*/.source;
    xTp = new RegExp(String.raw`~[\\/]` + J9e, "g");
    kTp = new RegExp(String.raw`<drv>:\\` + J9e, "g");
    ATp = new RegExp(String.raw`[A-Za-z]:\\` + J9e, "g");
    ITp = new RegExp(String.raw`<unc>[\\/]?` + J9e, "g");
    PTp = new RegExp(String.raw`\\\\(?=[^"'\n])` + J9e, "g");
    OTp = new RegExp(String.raw`(?:[^\s"'\\]+\\){2,}` + J9e, "g");
    DTp = new RegExp(String.raw`(?:\/[^\s"':]+){2,}` + J9e, "g");
    NTp = /\{\s*\\?["'](?:type\\?["']\s*:\s*\\?["']error|request_id\\?["']\s*:\s*\\?["']req_|error\\?["']\s*:\s*\{)[^]*/g;
    UTp = /(Error POSTing to endpoint(?: \(HTTP \d+\))?:\s*)[^]*/;
  });
  async function kpt(e, t) {
    return;
  }
  var Fpo;
  var $Tp;
  var HTp;
  var dHn = __lazy(() => {
    Ot();
    Fpo = require("fs/promises");
    $Tp = TEr(async () => null);
    HTp = TEr(async () => null);
  });
  function y$() {
    return MDe.join(er(), "projects");
  }
  function wh() {
    let e = getSessionProjectDir() ?? ty(getOriginalCwd());
    return MDe.join(e, `${getSessionId()}.jsonl`);
  }
  function pya(e, t) {
    Upo.set(e, t);
  }
  function mya(e) {
    Upo.delete(e);
  }
  function Ew(e) {
    let t = getSessionProjectDir() ?? ty(getOriginalCwd());
    let n = getSessionId();
    let r = Upo.get(e);
    let o = r ? MDe.join(t, n, "subagents", r) : MDe.join(t, n, "subagents");
    return MDe.join(o, `agent-${e}.jsonl`);
  }
  async function pHn() {
    let e = MDe.join(getSessionProjectDir() ?? ty(getOriginalCwd()), getSessionId(), "subagents");
    let t;
    try {
      t = await dya.readdir(e, {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    return t.filter(n => n.isFile() && n.name.startsWith("agent-") && n.name.endsWith(".jsonl")).map(n => n.name.slice(6, -6));
  }
  function fya(e, t) {
    let n = {};
    for (let r of Object.values(e)) {
      let o = t[r.id]?.messages;
      if (r.type === "in_process_teammate" && r.identity?.agentId && o && o.length > 0) {
        n[r.identity.agentId] = o;
      }
    }
    return n;
  }
  var dya;
  var MDe;
  var ty;
  var Upo;
  var Fy = __lazy(() => {
    at();
    gn();
    ZS();
    dya = require("fs/promises");
    MDe = require("path");
    ty = TEr(e => MDe.join(y$(), $T(e)));
    Upo = new Map();
  });
  function Apt(e) {
    let t = [];
    let n = [];
    let r;
    for (let o of e) {
      if (o.type === "assistant" && o.message.id !== r && n.length > 0) {
        t.push(n);
        n = [o];
      } else {
        n.push(o);
      }
      if (o.type === "assistant") {
        r = o.message.id;
      }
    }
    if (n.length > 0) {
      t.push(n);
    }
    return t;
  }
  function K4t(e) {
    let t = kg(e).filter(n => n.type !== "progress");
    return Apt(t);
  }
  function hya(e) {
    return K4t(e).length < 2;
  }
  var Bpo = __lazy(() => {
    ro();
  });
  function mHn(e) {
    let t = r => r.type === "assistant" && !r.isApiErrorMessage && r.message.content.some(o => o.type === "text");
    return e.findLast(r => t(r) && r.message.content.some(o => o.type === "text" && o.text.includes("<summary>"))) ?? e.findLast(t);
  }
  function fHn(e) {
    return mHn(e)?.message.content.find(r => r.type === "text")?.text.trim() || null;
  }
  function yya(e, t = "from") {
    let r = `CRITICAL: Respond with TEXT ONLY. Do NOT call any tools.

- Do NOT use Read, Bash, Grep, Glob, Edit, Write, or ANY other tool.
- You already have all the context you need in the conversation above.
- Tool calls will be REJECTED and will waste your only turn \u2014 you will fail the task.
- Your entire response must be plain text: an <analysis> block followed by a <summary> block.

` + (t === "up_to" ? `Your task is to create a detailed summary of this conversation. This summary will be placed at the start of a continuing session; newer messages that build on this context will follow after your summary (you do not see them here). Summarize thoroughly so that someone reading only your summary and then the newer messages can fully understand what happened and continue the work.

Before providing your final summary, wrap your analysis in <analysis> tags to organize your thoughts and ensure you've covered all necessary points. In your analysis process:

1. Chronologically analyze each message and section of the conversation. For each section thoroughly identify:
   - The user's explicit requests and intents
   - Your approach to addressing the user's requests
   - Key decisions, technical concepts and code patterns
   - Specific details like:
     - file names
     - full code snippets
     - function signatures
     - file edits
   - Errors that you ran into and how you fixed them
   - Pay special attention to specific user feedback that you received, especially if the user told you to do something differently.
   - Note any security-relevant instructions or constraints the user stated (e.g., sensitive files or data to avoid, operations that must not be performed, credential or secret handling rules). These MUST be preserved verbatim in the summary so they continue to apply after compaction.
2. Double-check for technical accuracy and completeness, addressing each required element thoroughly.

Your summary should include the following sections:

1. Primary Request and Intent: Capture the user's explicit requests and intents in detail
2. Key Technical Concepts: List important technical concepts, technologies, and frameworks discussed.
3. Files and Code Sections: Enumerate specific files and code sections examined, modified, or created. Include full code snippets where applicable and include a summary of why this file read or edit is important.
4. Errors and fixes: List errors encountered and how they were fixed.
5. Problem Solving: Document problems solved and any ongoing troubleshooting efforts.
6. All user messages: List ALL user messages that are not tool results. Preserve any security-relevant instructions or constraints verbatim so they remain in effect after compaction.
7. Pending Tasks: Outline any pending tasks.
8. Work Completed: Describe what was accomplished by the end of this portion.
9. Context for Continuing Work: Summarize any context, decisions, or state that would be needed to understand and continue the work in subsequent messages.

Here's an example of how your output should be structured:

<example>
<analysis>
[Your thought process, ensuring all points are covered thoroughly and accurately]
</analysis>

<summary>
1. Primary Request and Intent:
   [Detailed description]

2. Key Technical Concepts:
   - [Concept 1]
   - [Concept 2]

3. Files and Code Sections:
   - [File Name 1]
      - [Summary of why this file is important]
      - [Important Code Snippet]

4. Errors and fixes:
    - [Error description]:
      - [How you fixed it]

5. Problem Solving:
   [Description]

6. All user messages:
    - [Detailed non tool use user message]

7. Pending Tasks:
   - [Task 1]

8. Work Completed:
   [Description of what was accomplished]

9. Context for Continuing Work:
   [Key context, decisions, or state needed to continue the work]

</summary>
</example>

Please provide your summary following this structure, ensuring precision and thoroughness in your response.
` : jTp);
    if (e && e.trim() !== "") {
      r += `

Additional Instructions:
${e}`;
    }
    r += gya;
    return r;
  }
  function hHn(e) {
    let t = `CRITICAL: Respond with TEXT ONLY. Do NOT call any tools.

- Do NOT use Read, Bash, Grep, Glob, Edit, Write, or ANY other tool.
- You already have all the context you need in the conversation above.
- Tool calls will be REJECTED and will waste your only turn \u2014 you will fail the task.
- Your entire response must be plain text: an <analysis> block followed by a <summary> block.

` + `Your task is to create a detailed summary of the conversation so far, paying close attention to the user's explicit requests and your previous actions.
This summary should be thorough in capturing technical details, code patterns, and architectural decisions that would be essential for continuing development work without losing context.

Before providing your final summary, wrap your analysis in <analysis> tags to organize your thoughts and ensure you've covered all necessary points. In your analysis process:

1. Chronologically analyze each message and section of the conversation. For each section thoroughly identify:
   - The user's explicit requests and intents
   - Your approach to addressing the user's requests
   - Key decisions, technical concepts and code patterns
   - Specific details like:
     - file names
     - full code snippets
     - function signatures
     - file edits
   - Errors that you ran into and how you fixed them
   - Pay special attention to specific user feedback that you received, especially if the user told you to do something differently.
   - Note any security-relevant instructions or constraints the user stated (e.g., sensitive files or data to avoid, operations that must not be performed, credential or secret handling rules). These MUST be preserved verbatim in the summary so they continue to apply after compaction.
2. Double-check for technical accuracy and completeness, addressing each required element thoroughly.

Your summary should include the following sections:

1. Primary Request and Intent: Capture all of the user's explicit requests and intents in detail
2. Key Technical Concepts: List all important technical concepts, technologies, and frameworks discussed.
3. Files and Code Sections: Enumerate specific files and code sections examined, modified, or created. Pay special attention to the most recent messages and include full code snippets where applicable and include a summary of why this file read or edit is important.
4. Errors and fixes: List all errors that you ran into, and how you fixed them. Pay special attention to specific user feedback that you received, especially if the user told you to do something differently.
5. Problem Solving: Document problems solved and any ongoing troubleshooting efforts.
6. All user messages: List ALL user messages that are not tool results. These are critical for understanding the users' feedback and changing intent. Preserve any security-relevant instructions or constraints verbatim so they remain in effect after compaction.
7. Pending Tasks: Outline any pending tasks that you have explicitly been asked to work on.
8. Current Work: Describe in detail precisely what was being worked on immediately before this summary request, paying special attention to the most recent messages from both user and assistant. Include file names and code snippets where applicable.
9. Optional Next Step: List the next step that you will take that is related to the most recent work you were doing. IMPORTANT: ensure that this step is DIRECTLY in line with the user's most recent explicit requests, and the task you were working on immediately before this summary request. If your last task was concluded, then only list next steps if they are explicitly in line with the users request. Do not start on tangential requests or really old requests that were already completed without confirming with the user first.
                       If there is a next step, include direct quotes from the most recent conversation showing exactly what task you were working on and where you left off. This should be verbatim to ensure there's no drift in task interpretation.

Here's an example of how your output should be structured:

<example>
<analysis>
[Your thought process, ensuring all points are covered thoroughly and accurately]
</analysis>

<summary>
1. Primary Request and Intent:
   [Detailed description]

2. Key Technical Concepts:
   - [Concept 1]
   - [Concept 2]
   - [...]

3. Files and Code Sections:
   - [File Name 1]
      - [Summary of why this file is important]
      - [Summary of the changes made to this file, if any]
      - [Important Code Snippet]
   - [File Name 2]
      - [Important Code Snippet]
   - [...]

4. Errors and fixes:
    - [Detailed description of error 1]:
      - [How you fixed the error]
      - [User feedback on the error if any]
    - [...]

5. Problem Solving:
   [Description of solved problems and ongoing troubleshooting]

6. All user messages: 
    - [Detailed non tool use user message]
    - [...]

7. Pending Tasks:
   - [Task 1]
   - [Task 2]
   - [...]

8. Current Work:
   [Precise description of current work]

9. Optional Next Step:
   [Optional Next step to take]

</summary>
</example>

Please provide your summary based on the conversation so far, following this structure and ensuring precision and thoroughness in your response. 

There may be additional summarization instructions provided in the included context. If so, remember to follow these instructions when creating the above summary. Examples of instructions include:
<example>
## Compact Instructions
When summarizing the conversation focus on typescript code changes and also remember the mistakes you made and how you fixed them.
</example>

<example>
# Summary instructions
When you are using compact - please focus on test output and code changes. Include file reads verbatim.
</example>
`;
    if (e && e.trim() !== "") {
      t += `

Additional Instructions:
${e}`;
    }
    t += gya;
    return t;
  }
  function qTp(e) {
    let t = e;
    t = t.replace(/<analysis>[\s\S]*?<\/analysis>/, "");
    let n = t.match(/<summary>([\s\S]*?)<\/summary>/);
    if (n) {
      let r = n[1] || "";
      t = t.replace(/<summary>[\s\S]*?<\/summary>/, `Summary:
${r.trim()}`);
    }
    t = t.replace(/\n\n+/g, `

`);
    return t.trim();
  }
  function Y4t(e, t, n, r, o) {
    let i = `This session is being continued from a previous conversation that ran out of context. The summary below covers the earlier portion of the conversation.

${qTp(e)}`;
    if (n) {
      i += `

If you need specific details from before compaction (like exact code snippets, error messages, or content you generated), read the full transcript at: ${n}`;
    }
    if (r) {
      i += `

Recent messages are preserved verbatim.`;
    }
    if (o) {
      i += `

Your REPL VM state has been cleared as part of this compaction. Variables defined in REPL calls before this point are no longer accessible \u2014 redefine any you still need.`;
    }
    if (t) {
      return `${i}
Continue the conversation from where it left off without asking the user any further questions. Resume directly \u2014 do not acknowledge the summary, do not recap what was happening, do not preface with "I'll continue" or similar. Pick up the last task as if the break never happened.`;
    }
    return i;
  }
  var jTp;
  var gya;
  var $po = __lazy(() => {
    jTp = `Your task is to create a detailed summary of the RECENT portion of the conversation \u2014 the messages that follow earlier retained context. The earlier messages are being kept intact and do NOT need to be summarized. Focus your summary on what was discussed, learned, and accomplished in the recent messages only.

${`Before providing your final summary, wrap your analysis in <analysis> tags to organize your thoughts and ensure you've covered all necessary points. In your analysis process:

1. Analyze the recent messages chronologically. For each section thoroughly identify:
   - The user's explicit requests and intents
   - Your approach to addressing the user's requests
   - Key decisions, technical concepts and code patterns
   - Specific details like:
     - file names
     - full code snippets
     - function signatures
     - file edits
   - Errors that you ran into and how you fixed them
   - Pay special attention to specific user feedback that you received, especially if the user told you to do something differently.
   - Note any security-relevant instructions or constraints the user stated (e.g., sensitive files or data to avoid, operations that must not be performed, credential or secret handling rules). These MUST be preserved verbatim in the summary so they continue to apply after compaction.
2. Double-check for technical accuracy and completeness, addressing each required element thoroughly.`}

Your summary should include the following sections:

1. Primary Request and Intent: Capture the user's explicit requests and intents from the recent messages
2. Key Technical Concepts: List important technical concepts, technologies, and frameworks discussed recently.
3. Files and Code Sections: Enumerate specific files and code sections examined, modified, or created. Include full code snippets where applicable and include a summary of why this file read or edit is important.
4. Errors and fixes: List errors encountered and how they were fixed.
5. Problem Solving: Document problems solved and any ongoing troubleshooting efforts.
6. All user messages: List ALL user messages from the recent portion that are not tool results. Preserve any security-relevant instructions or constraints verbatim so they remain in effect after compaction.
7. Pending Tasks: Outline any pending tasks from the recent messages.
8. Current Work: Describe precisely what was being worked on immediately before this summary request.
9. Optional Next Step: List the next step related to the most recent work. Include direct quotes from the most recent conversation.

Here's an example of how your output should be structured:

<example>
<analysis>
[Your thought process, ensuring all points are covered thoroughly and accurately]
</analysis>

<summary>
1. Primary Request and Intent:
   [Detailed description]

2. Key Technical Concepts:
   - [Concept 1]
   - [Concept 2]

3. Files and Code Sections:
   - [File Name 1]
      - [Summary of why this file is important]
      - [Important Code Snippet]

4. Errors and fixes:
    - [Error description]:
      - [How you fixed it]

5. Problem Solving:
   [Description]

6. All user messages:
    - [Detailed non tool use user message]

7. Pending Tasks:
   - [Task 1]

8. Current Work:
   [Precise description of current work]

9. Optional Next Step:
   [Optional Next step to take]

</summary>
</example>

Please provide your summary based on the RECENT messages only (after the retained earlier context), following this structure and ensuring precision and thoroughness in your response.
`;
    gya = `

REMINDER: Do NOT call any tools. Respond with plain text only \u2014 ` + "an <analysis> block followed by a <summary> block. Tool calls will be rejected and you will fail the task.";
  });
  async function WTp(e, t, n, r) {
    let o = hHn(n);
    let s = In({
      content: o
    });
    let i;
    try {
      i = await runForkedAgent({
        promptMessages: [s],
        cacheSafeParams: {
          ...t,
          forkContextMessages: r ? jpo(e) : e
        },
        canUseTool: qpo(),
        querySource: "compact",
        forkLabel: "reactive-compact",
        maxTurns: 1,
        fallbackModel: yHn(t.toolUseContext.options.mainLoopModel, t.toolUseContext.options.fallbackModel),
        skipTranscript: true,
        skipCacheWrite: true
      });
    } catch (d) {
      let p = he(d);
      if (mU(p)) {
        logForDebugging(`Reactive compact API call failed: ${p}`, {
          level: "error"
        });
      } else {
        Oe(d);
      }
      return {
        ok: false,
        reason: "error",
        detail: p,
        status: undefined,
        isTimeout: false
      };
    }
    if (t.toolUseContext.abortController.signal.aborted) {
      return {
        ok: false,
        reason: "aborted"
      };
    }
    let a = Yk(i.messages);
    if (!a) {
      Oe(Error(`Reactive compact: no assistant message in summarization response (${i.messages.length} messages, types: ${i.messages.map(d => d.type).join(", ")})`));
      return {
        ok: false,
        reason: "error",
        detail: "no assistant message in summarization response",
        status: undefined,
        isTimeout: false
      };
    }
    if (wTe(a)) {
      return {
        ok: false,
        reason: "prompt_too_long",
        tokenGap: dpt(a)
      };
    }
    if (Jha(a)) {
      let d = nR(e) - 200000;
      return {
        ok: false,
        reason: "prompt_too_long",
        tokenGap: d > 0 ? d : undefined,
        viaCreditsBoundary: true
      };
    }
    if (P$n(a)) {
      return {
        ok: false,
        reason: "media_too_large"
      };
    }
    if (a.isApiErrorMessage) {
      let d = UG(a) ?? "API error";
      logForDebugging(`Reactive compact: summarization returned API error: ${d}`, {
        level: "error"
      });
      return {
        ok: false,
        reason: "error",
        detail: d,
        status: a.apiErrorStatus,
        isTimeout: d === "Request timed out"
      };
    }
    let l = fHn(i.messages);
    if (!l) {
      Oe(Error("Reactive compact: empty summary text in summarization response"));
      return {
        ok: false,
        reason: "error",
        detail: "summarization produced empty response",
        status: undefined,
        isTimeout: false
      };
    }
    let c = wh();
    let u = zk() && z3t(t.toolUseContext.getReplContexts(), t.toolUseContext.agentId);
    return {
      ok: true,
      summaryText: l,
      forkAssistantMessageCount: Bn(i.messages, d => d.type === "assistant" && !d.isApiErrorMessage),
      totalUsage: i.totalUsage,
      messages: [In({
        content: Y4t(l, true, c, undefined, u),
        isCompactSummary: true,
        isVisibleInTranscriptOnly: true
      })]
    };
  }
  function _ya(e, t, n) {
    let r = 0;
    let o = 0;
    for (let s = t - 1; s >= 0; s--) {
      if (r += e[s], o++, r >= n) {
        break;
      }
    }
    if (o >= t - 1) {
      return Math.max(1, Math.floor(t / 2));
    }
    return o;
  }
  function GTp(e, t, n) {
    if (e === undefined) {
      return {
        mode: "gap_unparseable",
        step: 1
      };
    }
    return {
      mode: "gap_guided",
      step: _ya(t, n, e)
    };
  }
  async function gHn(e, t, n) {
    let r = K4t(e);
    let o = r.length;
    if (o < 2) {
      logForDebugging("Reactive compact: fewer than 2 groups, nothing to compact", {
        level: "info"
      });
      return {
        ok: false,
        reason: "too_few_groups",
        attempts: 0,
        totalGroups: o
      };
    }
    let s = t.toolUseContext.abortController.signal;
    let i = 1;
    let a = 0;
    let l = undefined;
    let c;
    let u = false;
    let d = false;
    if (n?.initialTokenGap !== undefined && o > 3) {
      c = r.map(m => nR(m));
      let p = n.initialTokenGap - (c[o - 1] ?? 0);
      if (p > 0) {
        let m = _ya(c, o - 1, p);
        i = 1 + m;
        l = {
          mode: "seeded",
          step: m,
          tokenGap: n.initialTokenGap
        };
      }
    }
    while (i < o) {
      if (s.aborted) {
        return {
          ok: false,
          reason: "aborted",
          attempts: a,
          totalGroups: o
        };
      }
      a++;
      let p = o - i;
      let m = r.slice(0, p);
      let f = r.slice(p);
      let h = m.flat();
      if (!h.some(_ => _.type === "assistant")) {
        if (logForDebugging("Reactive compact: no assistant messages in summarize set, bailing", {
          level: "info"
        }), d) {
          logEvent("tengu_compact_credits_clamp_rescue", {
            outcome: "failed",
            attempts: a - 1
          });
        }
        return {
          ok: false,
          reason: a > 1 ? "exhausted" : "too_few_groups",
          attempts: a - 1,
          totalGroups: o
        };
      }
      logEvent("tengu_reactive_compact_attempt", {
        attempt: a,
        groupsToSummarize: m.length,
        groupsToPreserve: f.length,
        messagesToSummarize: h.length,
        strippedMedia: u,
        stepMode: l?.mode == null ? undefined : l?.mode,
        stepSize: l?.step,
        tokenGap: l?.tokenGap
      });
      let g = await WTp(h, t, n?.customInstructions, u);
      if (g.ok) {
        if (d) {
          logEvent("tengu_compact_credits_clamp_rescue", {
            outcome: "ok",
            attempts: a
          });
        }
        return {
          ok: true,
          result: {
            summaryMessages: g.messages,
            summaryText: g.summaryText,
            messagesToPreserve: f.flat(),
            attempt: a,
            totalUsage: g.totalUsage,
            forkAssistantMessageCount: g.forkAssistantMessageCount,
            groupsPreserved: i,
            totalGroups: o
          }
        };
      }
      switch (g.reason) {
        case "aborted":
          return {
            ok: false,
            reason: "aborted",
            attempts: a,
            totalGroups: o
          };
        case "error":
          if (d) {
            logEvent("tengu_compact_credits_clamp_rescue", {
              outcome: "failed",
              attempts: a
            });
          }
          return {
            ok: false,
            reason: "error",
            attempts: a,
            totalGroups: o,
            detail: g.detail,
            status: g.status,
            isTimeout: g.isTimeout
          };
        case "media_too_large":
          if (!u) {
            u = true;
            a--;
            logForDebugging("Reactive compact: summarize hit media-size error, retrying stripped", {
              level: "info"
            });
            continue;
          }
          return {
            ok: false,
            reason: "media_unstrippable",
            attempts: a,
            totalGroups: o
          };
        case "prompt_too_long":
          break;
      }
      if (g.viaCreditsBoundary) {
        d = true;
      }
      c ??= r.map(_ => nR(_));
      let y = GTp(g.tokenGap, c, p);
      l = {
        ...y,
        tokenGap: g.tokenGap
      };
      i += y.step;
      logForDebugging(`Reactive compact: attempt ${a} hit prompt-too-long (gap=${g.tokenGap ?? "?"} \u2192 ${y.mode} step ${y.step}), next preserves ${i}/${o}`, {
        level: "info"
      });
    }
    if (d) {
      logEvent("tengu_compact_credits_clamp_rescue", {
        outcome: "failed",
        attempts: a
      });
    }
    return {
      ok: false,
      reason: "exhausted",
      attempts: a,
      totalGroups: o
    };
  }
  var Hpo = __lazy(() => {
    ZC();
    VT();
    je();
    dt();
    CO();
    Rn();
    ro();
    Fy();
    Ot();
    vO();
    IV();
    Dde();
    Bpo();
    $po();
  });
  function NDe(e) {
    return t => e(n => {
      let r = t(n.classifierApprovals);
      if (r === n.classifierApprovals) {
        return n;
      }
      return {
        ...n,
        classifierApprovals: r
      };
    });
  }
  function bya(e, t) {
    return;
  }
  function Sya(e, t, n) {
    if (!e) {
      return;
    }
    e(r => {
      let o = r.approvals.get(t);
      if (o?.classifier === "auto-mode" && o.reason === n) {
        return r;
      }
      let s = new Map(r.approvals);
      s.set(t, {
        classifier: "auto-mode",
        reason: n
      });
      return {
        ...r,
        approvals: s
      };
    });
  }
  function Tya(e, t) {
    let n = e.classifierApprovals.approvals.get(t);
    if (!n || n.classifier !== "auto-mode") {
      return;
    }
    return n.reason;
  }
  function Eya(e, t) {
    if (!e) {
      return;
    }
    e(n => {
      if (n.checking.vZc(t)) {
        return n;
      }
      let r = new Set(n.checking);
      r.add(t);
      return {
        ...n,
        checking: r
      };
    });
  }
  function LDe(e, t) {
    if (!e) {
      return;
    }
    e(n => {
      if (!n.checking.vZc(t)) {
        return n;
      }
      let r = new Set(n.checking);
      r.delete(t);
      return {
        ...n,
        checking: r
      };
    });
  }
  function vya(e, t) {
    if (!e) {
      return;
    }
    e(n => {
      if (!n.approvals.vZc(t)) {
        return n;
      }
      let r = new Map(n.approvals);
      r.delete(t);
      return {
        ...n,
        approvals: r
      };
    });
  }
  function wya(e) {
    if (!e) {
      return;
    }
    e(t => {
      if (t.approvals.size === 0 && t.checking.size === 0) {
        return t;
      }
      return {
        approvals: new Map(),
        checking: new Set()
      };
    });
  }
  function Ppt() {
    return st(process.env.OTEL_LOG_USER_PROMPTS);
  }
  function kya() {
    J4t.clear();
    Gpo.clear();
  }
  function Tx() {
    if (!(st(process.env.ENABLE_BETA_TRACING_DETAILED) && Boolean(process.env.BETA_TRACING_ENDPOINT))) {
      return false;
    }
    return getIsNonInteractiveSession() || getFeatureValue_CACHED_MAY_BE_STALE("tengu_trace_lantern", false);
  }
  function yM(e, t = 61440) {
    if (e.length <= t) {
      return {
        content: e,
        truncated: false
      };
    }
    return {
      content: e.slice(0, t) + `

[TRUNCATED - Content exceeds 60KB limit]`,
      truncated: true
    };
  }
  function Vpo(e) {
    return xya.createHash("sha256").update(e).digest("hex").slice(0, 12);
  }
  function zTp(e) {
    return `sp_${Vpo(e)}`;
  }
  function Rya(e) {
    let t = De(e.message.content);
    return `msg_${Vpo(t)}`;
  }
  function Wpo(e) {
    return /^<system-reminder>\n?([\s\S]*?)\n?<\/system-reminder>$/.exec(e.trim())?.[1]?.trim() || null;
  }
  function KTp(e, t) {
    let n = [];
    let r = [];
    for (let o of e) {
      if (o.type === "api_system") {
        r.push(o.message.content);
        continue;
      }
      let s = o.message.content;
      if (typeof s === "string") {
        let i = Wpo(s);
        if (i) {
          r.push(i);
        } else if (t) {
          n.push(`[USER]
${s}`);
        }
      } else if (Array.isArray(s)) {
        for (let i of s) {
          if (i.type === "text") {
            let a = Wpo(i.text);
            if (a) {
              r.push(a);
            } else if (t) {
              n.push(`[USER]
${i.text}`);
            }
          } else if (i.type === "tool_result") {
            if (typeof i.content === "string") {
              let a = Wpo(i.content);
              if (a) {
                r.push(a);
              } else if (t) {
                n.push(`[TOOL RESULT: ${i.tool_use_id}]
${i.content}`);
              }
            } else if (t) {
              n.push(`[TOOL RESULT: ${i.tool_use_id}]
${De(i.content)}`);
            }
          }
        }
      }
    }
    return {
      contextParts: n,
      systemReminders: r
    };
  }
  function Aya(e, t) {
    if (!Tx() || !Ppt()) {
      return;
    }
    let {
      content: n,
      truncated: r
    } = yM(`[USER PROMPT]
${t}`);
    e.setAttributes({
      new_context: n,
      ...(r && {
        new_context_truncated: true,
        new_context_original_length: t.length
      })
    });
  }
  function Iya(e, t, n) {
    if (!Tx()) {
      return;
    }
    if (t?.systemPrompt) {
      let r = zTp(t.systemPrompt);
      let o = t.systemPrompt.slice(0, 500);
      if (e.setAttribute("system_prompt_hash", r), Ppt()) {
        e.setAttribute("system_prompt_preview", o);
      }
      if (e.setAttribute("system_prompt_length", t.systemPrompt.length), Ppt() && !J4t.vZc(r)) {
        J4t.add(r);
        let {
          content: s,
          truncated: i
        } = yM(t.systemPrompt);
        su("system_prompt", {
          system_prompt_hash: r,
          system_prompt: s,
          system_prompt_length: String(t.systemPrompt.length),
          ...(i && {
            system_prompt_truncated: "true"
          })
        });
      }
    }
    if (t?.userSystemPrompt && Ppt()) {
      let r = getSessionId();
      if (Cya !== r) {
        Cya = r;
        let {
          content: o,
          truncated: s
        } = yM(t.userSystemPrompt);
        e.setAttributes({
          user_system_prompt: o,
          ...(s && {
            user_system_prompt_truncated: true,
            user_system_prompt_original_length: t.userSystemPrompt.length
          })
        });
      }
    }
    if (t?.tools) {
      try {
        let o = qt(t.tools).map(s => {
          let i = De(s);
          let a = Vpo(i);
          return {
            name: typeof s.name === "string" ? s.name : "unknown",
            hash: a,
            json: i
          };
        });
        e.setAttribute("tools", De(o.map(({
          name: s,
          hash: i
        }) => ({
          name: s,
          hash: i
        }))));
        e.setAttribute("tools_count", o.length);
        for (let {
          name: s,
          hash: i,
          json: a
        } of o) {
          if (!J4t.vZc(`tool_${i}`)) {
            J4t.add(`tool_${i}`);
            let {
              content: l,
              truncated: c
            } = yM(a);
            su("tool", {
              tool_name: qi(s),
              tool_hash: i,
              tool: l,
              ...(c && {
                tool_truncated: "true"
              })
            });
          }
        }
      } catch {
        e.setAttribute("tools_parse_error", true);
      }
    }
    if (n && n.length > 0 && t?.querySource) {
      let r = t.querySource;
      let o = Gpo.get(r);
      let s = 0;
      if (o) {
        let c = n[o.index];
        if (c && Rya(c) === o.hash) {
          s = o.index + 1;
        }
      }
      let i = n.slice(s).filter(c => c.type === "user" || c.type === "api_system");
      if (i.length > 0) {
        let c = Ppt();
        let {
          contextParts: u,
          systemReminders: d
        } = KTp(i, c);
        if (e.setAttribute("new_context_message_count", i.length), d.length > 0) {
          e.setAttribute("system_reminders_count", d.length);
        }
        if (u.length > 0 && c) {
          let p = u.join(`

---

`);
          let {
            content: m,
            truncated: f
          } = yM(p);
          e.setAttributes({
            new_context: m,
            ...(f && {
              new_context_truncated: true,
              new_context_original_length: p.length
            })
          });
        }
        if (d.length > 0 && c) {
          let p = d.join(`

---

`);
          let {
            content: m,
            truncated: f
          } = yM(p);
          e.setAttributes({
            system_reminders: m,
            ...(f && {
              system_reminders_truncated: true,
              system_reminders_original_length: p.length
            })
          });
        }
      }
      let a = n.length - 1;
      let l = n[a];
      if (l) {
        Gpo.set(r, {
          index: a,
          hash: Rya(l)
        });
      }
    }
  }
  function Pya(e, t) {
    if (!Tx() || !Ppt() || !t) {
      return;
    }
    if (t.modelOutput !== undefined) {
      let {
        content: n,
        truncated: r
      } = yM(t.modelOutput);
      if (e["response.model_output"] = n, r) {
        e["response.model_output_truncated"] = true;
        e["response.model_output_original_length"] = t.modelOutput.length;
      }
    }
  }
  function Oya(e, t, n) {
    if (!Tx() || !bh()) {
      return;
    }
    let {
      content: r,
      truncated: o
    } = yM(`[TOOL INPUT: ${t}]
${n}`);
    e.setAttributes({
      tool_input: r,
      ...(o && {
        tool_input_truncated: true,
        tool_input_original_length: n.length
      })
    });
  }
  function Dya(e, t, n) {
    if (!Tx() || !$at()) {
      return;
    }
    let {
      content: r,
      truncated: o
    } = yM(`[TOOL RESULT: ${t}]
${n}`);
    if (e.new_context = r, o) {
      e.new_context_truncated = true;
      e.new_context_original_length = n.length;
    }
  }
  var xya;
  var J4t;
  var Gpo;
  var Cya;
  var kTe = __lazy(() => {
    at();
    $n();
    Gu();
    gn();
    yS();
    xya = require("crypto");
    J4t = new Set();
    Gpo = new Map();
  });
  function Opt(e) {
    let t = getTranscriptPathForSession(e);
    return t.endsWith(".jsonl") ? t.slice(0, -6) + ".precompact.json" : t + ".precompact.json";
  }
  async function Lya(e, t = Opt(e.sessionId)) {
    let n = De(e);
    let r = Buffer.byteLength(n, "utf8");
    if (r > 8000000) {
      return {
        ok: false,
        reason: "too_large",
        bytes: r
      };
    }
    try {
      await Fm(t, n, 384);
      return {
        ok: true,
        bytes: r
      };
    } catch (o) {
      return {
        ok: false,
        reason: "write_error",
        bytes: r,
        detail: he(o)
      };
    }
  }
  function Fya(e) {
    let t = Opt(e);
    try {
      if (_Hn.statSync(t).size > 8000000) {
        return {
          ok: false,
          reason: "too_large"
        };
      }
    } catch {
      return {
        ok: false,
        reason: "absent"
      };
    }
    let n;
    try {
      n = _Hn.readFileSync(t, "utf8");
    } catch {
      return {
        ok: false,
        reason: "absent"
      };
    }
    if (Buffer.byteLength(n, "utf8") > 8000000) {
      return {
        ok: false,
        reason: "too_large"
      };
    }
    let r;
    try {
      r = qt(n);
    } catch {
      return {
        ok: false,
        reason: "parse_error"
      };
    }
    if (typeof r !== "object" || r === null) {
      return {
        ok: false,
        reason: "parse_error"
      };
    }
    if (r.version !== 1) {
      return {
        ok: false,
        reason: "version"
      };
    }
    let o = JTp(r);
    return o === null ? {
      ok: false,
      reason: "parse_error"
    } : {
      ok: true,
      payload: o
    };
  }
  function bHn(e) {
    return Nya.unlink(Opt(e)).catch(() => {});
  }
  function Uya(e, t) {
    return {
      summaryMessages: e.summaryMessages,
      summaryText: e.summaryText,
      messagesToPreserve: t,
      attempt: e.attempt,
      groupsPreserved: e.groupsPreserved,
      totalGroups: e.totalGroups,
      forkAssistantMessageCount: e.forkAssistantMessageCount,
      totalUsage: e.totalUsage
    };
  }
  function JTp(e) {
    if (typeof e !== "object" || e === null) {
      return null;
    }
    let t = e;
    return Q9e(t.version) && FDe(t.sessionId) && t.agentKey === "main" && FDe(t.model) && FDe(t.cliVersion) && FDe(t.createdAt) && FDe(t.precomputedAtUuid) && Q9e(t.preCompactTokens) && Q9e(t.readyDurationMs) && (t.preCompactHookDisplay === undefined || FDe(t.preCompactHookDisplay)) && FDe(t.summaryText) && Array.isArray(t.summaryMessages) && t.summaryMessages.length > 0 && t.summaryMessages.every(YTp) && Array.isArray(t.preserveUuids) && t.preserveUuids.every(FDe) && Q9e(t.attempt) && Q9e(t.groupsPreserved) && Q9e(t.totalGroups) && Q9e(t.forkAssistantMessageCount) && typeof t.totalUsage === "object" && t.totalUsage !== null ? e : null;
  }
  var _Hn;
  var Nya;
  var FDe = e => typeof e === "string";
  var YTp = e => typeof e === "object" && e !== null && "message" in e && "uuid" in e;
  var Q9e = e => typeof e === "number" && Number.isFinite(e);
  var Bya = __lazy(() => {
    BT();
    dt();
    fa();
    _Hn = require("fs");
    Nya = require("fs/promises");
  });
  function XTp(e, t) {
    let n = e.reason === "error" ? e.isTimeout ? "timeout" : "api_error" : e.reason;
    return {
      reason: e.reason,
      cause: n,
      attempts: e.attempts,
      status: e.status,
      detail: e.detail,
      durationMs: t
    };
  }
  function Qpo(e, t, n) {
    let r = Dpt(e);
    let o = `${r}:${t}`;
    if (Z9e.vZc(o)) {
      return;
    }
    Z9e.add(o);
    logEvent("tengu_precomputed_compact_arm_gated", {
      reason: t,
      querySource: n
    });
    logForDebugging(`precomputed compact: arm gated (${r}, ${t})`);
  }
  function Dpt(e) {
    return e ?? "main";
  }
  function Q4t() {
    if (!Sx()) {
      return false;
    }
    if (!DX()) {
      return false;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_sepia_moth", false)) {
      return false;
    }
    return uc("precomputeCompactionEnabled", true).value;
  }
  function Z4t(e) {
    return Jdt(e);
  }
  function Zpo() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_packet", false) && !isTranscriptPersistenceDisabled();
  }
  function THn(e) {
    Ypo = Ypo.then(e, e).catch(Oe);
    return Ypo;
  }
  function Wya(e, t, n, r) {
    if (e !== "main" || Z4t(t) || !Zpo() || !Q4t()) {
      return;
    }
    let o = getSessionId();
    if (Xpo.vZc(o)) {
      return;
    }
    if (fU.vZc(e)) {
      return;
    }
    Xpo.add(o);
    let s = Fya(o);
    if (!s.ok) {
      if (s.reason !== "absent") {
        Hya(o, s.reason, undefined);
      }
      return;
    }
    let {
      payload: i
    } = s;
    let a = Math.max(0, Date.now() - Date.parse(i.createdAt));
    let l = p => Hya(o, p, a);
    if (i.sessionId !== o) {
      return l("session_mismatch");
    }
    if (i.model !== r) {
      return l("model_mismatch");
    }
    if (!Number.isFinite(a)) {
      return l("bad_timestamp");
    }
    if (a > 604800000) {
      return l("too_old");
    }
    if (n.every(p => p.uuid !== i.precomputedAtUuid)) {
      return l("boundary_missing");
    }
    let c = Ob(n) - i.preCompactTokens;
    if (c > 150000) {
      return l("grew_too_much");
    }
    if (c < -(i.preCompactTokens / 2)) {
      return l("shrank_too_much");
    }
    let u = new Map(n.map(p => [p.uuid, p]));
    let d = i.preserveUuids.flatMap(p => {
      let m = u.get(p);
      return m === undefined ? [] : [m];
    });
    if (d.length !== i.preserveUuids.length) {
      return l("preserve_uuid_missing");
    }
    fU.set(e, {
      status: "ready",
      result: Uya(i, d),
      precomputedAtUuid: i.precomputedAtUuid,
      preCompactTokens: i.preCompactTokens,
      startedAt: performance.now() - a,
      readyDurationMs: i.readyDurationMs,
      abortController: new AbortController(),
      preCompactHookDisplay: i.preCompactHookDisplay,
      settled: Promise.resolve(),
      rehydrated: true,
      sidecarSessionId: o
    });
    logEvent("tengu_precomputed_compact_rehydrated", {
      ageMs: Math.round(a),
      preCompactTokens: i.preCompactTokens,
      growthTokens: c,
      summaryBytes: Buffer.byteLength(i.summaryText, "utf8"),
      cliVersionMatch: i.cliVersion === qya
    });
    logForDebugging(`precomputed compact: rehydrated (${e}, age ${Math.round(a)}ms, growth ~${c} tok)`);
  }
  function Hya(e, t, n) {
    THn(() => bHn(e));
    logEvent("tengu_precomputed_compact_rehydrate_rejected", {
      reason: t,
      ...(n !== undefined && Number.isFinite(n) && {
        ageMs: Math.round(n)
      })
    });
    logForDebugging(`precomputed compact: rehydrate rejected (${t})`);
  }
  async function eEp(e, t, n, r, o) {
    let s = await Lya({
      version: 1,
      sessionId: e,
      agentKey: "main",
      model: r,
      cliVersion: qya,
      createdAt: new Date().toISOString(),
      precomputedAtUuid: n.precomputedAtUuid,
      preCompactTokens: n.preCompactTokens,
      readyDurationMs: n.readyDurationMs,
      preCompactHookDisplay: n.preCompactHookDisplay,
      summaryText: n.result.summaryText,
      summaryMessages: n.result.summaryMessages,
      preserveUuids: n.result.messagesToPreserve.map(i => i.uuid),
      attempt: n.result.attempt,
      groupsPreserved: n.result.groupsPreserved,
      totalGroups: n.result.totalGroups,
      forkAssistantMessageCount: n.result.forkAssistantMessageCount,
      totalUsage: n.result.totalUsage
    }, t);
    logEvent("tengu_precomputed_compact_persisted", {
      ok: s.ok,
      bytes: s.bytes,
      ...(s.ok === false && {
        reason: s.reason
      }),
      querySource: o
    });
    logForDebugging(`precomputed compact: persisted (${s.ok ? `${s.bytes} bytes` : `${s.reason}${s.detail === undefined ? "" : `: ${s.detail}`}`})`);
  }
  function Gya(e) {
    let t = e?.status === "ready" ? e.sidecarSessionId : undefined;
    if (t !== undefined && t === getSessionId()) {
      THn(() => bHn(t));
    }
  }
  function tEp(e, t) {
    return {
      ...e,
      abortController: t,
      onCompactEvent: undefined
    };
  }
  function emo(e) {
    if (e.autocompactRan) {
      return false;
    }
    if (e.isPreFirstCompactFork) {
      return false;
    }
    if (e.hasAttemptedReactiveCompact) {
      return false;
    }
    if (e.lastTransitionReason === "precomputed_compact_swap") {
      return false;
    }
    if (!Q4t()) {
      return false;
    }
    return pfa(e.contextTokens, e.model, e.autoCompactWindow, e.querySource);
  }
  function tmo(e) {
    let {
      querySource: t,
      messages: n,
      cacheSafeParams: r,
      armTrigger: o = "estimate",
      estimateGapTokens: s
    } = e;
    let {
      toolUseContext: i
    } = r;
    let a = Dpt(i.agentId);
    if (!Q4t()) {
      return false;
    }
    if (Z4t(t)) {
      return false;
    }
    if (Wya(a, t, n, i.options.mainLoopModel), (X4t.get(a) ?? 0) >= 3) {
      return false;
    }
    let l = fU.get(a);
    if (l !== undefined && l.status !== "failed") {
      return false;
    }
    let c = n.at(-1)?.uuid;
    if (c === undefined) {
      return false;
    }
    let u = t === "sdk" ? e.promptScan : undefined;
    if (u !== undefined) {
      let {
        userPromptCount: x,
        historyRewritten: A
      } = u;
      let k = x <= 1 && !A ? "sdk_single_prompt_gate" : undefined;
      if (k !== undefined) {
        let I = `${a}:${k}`;
        if (!Z9e.vZc(I)) {
          Z9e.add(I);
          logEvent("tengu_precomputed_compact_arm_gated", {
            reason: k,
            querySource: "sdk",
            userPromptCount: x,
            preCompactTokens: Ob(n)
          });
          logForDebugging(`precomputed compact: arm gated (${a}, ${k}, userPrompts ${x})`);
        }
        return false;
      }
    }
    let d = new AbortController();
    let p = performance.now();
    let m = getSessionId();
    let f = Opt(m);
    let h = Ob(n);
    let g = tEp(i, d);
    let y = {
      ...r,
      toolUseContext: g
    };
    let _ = Vg(t);
    let b = (Jpo.get(a) ?? 0) + 1;
    Jpo.set(a, b);
    let S = ido(i.options.mainLoopModel, i.options.autoCompactWindow, t);
    logEvent("tengu_precomputed_compact_started", {
      armFraction: S.fraction,
      armFractionSource: S.source,
      ...(S.matchedWindowKey !== undefined && {
        armWindowKey: S.matchedWindowKey
      }),
      preCompactTokens: h,
      messageCount: n.length,
      querySource: _,
      precomputeAttemptNumber: b,
      ...(u !== undefined && {
        userPromptCount: u.userPromptCount,
        historyRewritten: u.historyRewritten
      }),
      armTrigger: o,
      ...(s !== undefined && {
        estimateGapTokens: s
      }),
      windowSource: n$n(i.options.mainLoopModel, i.options.autoCompactWindow) == null ? undefined : n$n(i.options.mainLoopModel, i.options.autoCompactWindow)
    });
    logForDebugging(`precomputed compact: started (${a}, ${n.length} msgs, ~${h} tok, attempt ${b}, trigger ${o})`);
    let E = (async () => {
      let x = await executePreCompactHooks({
        trigger: "auto",
        customInstructions: null
      }, d.signal).catch(M => (Oe(M), {}));
      if (x.blockedBy) {
        logForDebugging(`Precomputed compact blocked by PreCompact hook: ${x.blockedBy}`);
        SHn(a, d, null);
        return;
      }
      if (d.signal.aborted) {
        SHn(a, d, null);
        return;
      }
      let A = await gHn(n, y, {
        customInstructions: x.newCustomInstructions
      }).catch(M => ({
        ok: false,
        reason: "error",
        attempts: 0,
        totalGroups: 0,
        detail: he(M),
        status: undefined,
        isTimeout: false
      }));
      let k = Math.round(performance.now() - p);
      if (logForDebugging(`precomputed compact: ${A.ok ? "ready" : `failed (${A.reason})`} (${a}, ${k}ms)`), !A.ok) {
        let M = unwrapAbortReason(d.signal.reason);
        let L = A.reason === "aborted" && typeof M === "string" ? M : undefined;
        let P = XTp(A, k);
        if (logEvent("tengu_precomputed_compact_failed", {
          reason: A.reason,
          cause: P.cause,
          status: P.status,
          durationMs: k,
          querySource: _,
          preCompactTokens: h,
          precomputeAttemptNumber: b,
          ...(L !== undefined && {
            clearReason: L
          })
        }), A.reason === "aborted") {
          Et("compact_precomputed", "compact_precomputed_aborted");
        } else {
          Ae("compact_precomputed", `compact_precomputed_${A.reason}`);
        }
        if (A.reason !== "aborted" && P.cause !== "too_few_groups" && !d.signal.aborted) {
          let F = (X4t.get(a) ?? 0) + 1;
          if (X4t.set(a, F), F === 3) {
            logEvent("tengu_precomputed_compact_rearm_capped", {
              cause: P.cause,
              status: P.status,
              querySource: _,
              preCompactTokens: h,
              precomputeAttemptNumber: b
            });
            logForDebugging(`precomputed compact: re-arm capped (${a}, ${F} consecutive ${P.cause} failures)`);
          }
        }
        SHn(a, d, F => ({
          ...F,
          status: "failed",
          failure: P
        }));
        return;
      }
      if (logEvent("tengu_precomputed_compact_ready", {
        durationMs: k,
        attempts: A.result.attempt,
        groupsPreserved: A.result.groupsPreserved,
        totalGroups: A.result.totalGroups,
        querySource: _,
        preCompactTokens: h,
        precomputeAttemptNumber: b
      }), Pe("compact_precomputed"), !d.signal.aborted) {
        X4t.delete(a);
      }
      let I = a === "main" && Zpo() ? m : undefined;
      SHn(a, d, M => ({
        ...M,
        status: "ready",
        result: A.result,
        readyDurationMs: k,
        preCompactHookDisplay: x.userDisplayMessage,
        ...(I !== undefined && {
          sidecarSessionId: I
        })
      }));
      let O = fU.get(a);
      if (I !== undefined && O?.status === "ready" && O.abortController === d) {
        let M = m === getSessionId() ? Opt(m) : f;
        THn(() => eEp(I, M, O, i.options.mainLoopModel, _));
      }
    })();
    let C = {
      status: "pending",
      precomputedAtUuid: c,
      preCompactTokens: h,
      startedAt: p,
      abortController: d,
      preCompactHookDisplay: undefined,
      settled: E
    };
    fU.set(a, C);
    return true;
  }
  function SHn(e, t, n) {
    let r = fU.get(e);
    if (r?.status !== "pending" || r.abortController !== t) {
      return;
    }
    if (n === null) {
      fU.delete(e);
      return;
    }
    fU.set(e, n(r));
  }
  function jya(e) {
    return fU.get(Dpt(e));
  }
  async function nEp(e, t) {
    let n = fU.get(e);
    if (n === undefined || t.aborted) {
      return null;
    }
    let r = n.status;
    if (n.status === "pending") {
      if (logForDebugging(`precomputed compact: awaiting borrowed in-flight (${e})`), await Promise.race([n.settled.then(() => false), new Promise(i => {
        t.addEventListener("abort", () => i(true), {
          once: true
        });
      })])) {
        logForDebugging(`precomputed compact: turn aborted while borrowing (${e}) \u2014 leaving entry`);
        return {
          kind: "turn_aborted",
          statusAtPTL: r
        };
      }
    }
    let o = fU.get(e);
    logForDebugging(`precomputed compact: borrowed (${e}, ${o?.status ?? "gone"})`);
    return o?.status === "ready" ? {
      kind: "ready",
      ready: o,
      statusAtPTL: r
    } : null;
  }
  async function nmo(e, t) {
    let n = Dpt(e);
    let r = fU.get(n);
    if (r === undefined || t.aborted) {
      return null;
    }
    let o = r.status;
    if (r.status === "pending") {
      if (logForDebugging(`precomputed compact: awaiting in-flight (${n})`), await Promise.race([r.settled.then(() => false), new Promise(a => {
        t.addEventListener("abort", () => a(true), {
          once: true
        });
      })])) {
        logForDebugging(`precomputed compact: turn aborted while awaiting (${n}) \u2014 leaving entry`);
        return {
          kind: "turn_aborted",
          statusAtPTL: o
        };
      }
    }
    let s = fU.get(n);
    switch (fU.delete(n), Gya(s), logForDebugging(`precomputed compact: consumed (${n}, ${s?.status ?? "gone"})`), s?.status) {
      case "ready":
        return {
          kind: "ready",
          ready: s,
          statusAtPTL: o
        };
      case "failed":
        return {
          kind: "failed",
          failure: s.failure,
          statusAtPTL: o
        };
      case "pending":
      case undefined:
        return null;
    }
  }
  async function rmo(e) {
    let {
      toolUseContext: t,
      messages: n,
      detectedAt: r,
      borrowFrom: o,
      querySource: s
    } = e;
    let i = Vg(s);
    let a = (h, g) => {
      let y = Math.round(performance.now() - r);
      rEp(h, i, y, e.trigger);
      return {
        outcome: h,
        swap: h.kind === "applied" ? h.swap : undefined,
        emittedEarlyCompactStart: g
      };
    };
    let l = !Z4t(s) && Q4t() && (e.trigger === "threshold" || e.isWithheld413 === true && !e.hasAttemptedReactiveCompact);
    if (l) {
      Wya(Dpt(t.agentId), s, n, t.options.mainLoopModel);
    }
    if (!l || e.trigger === "threshold" && jya(t.agentId) === undefined) {
      return {
        outcome: {
          kind: "none"
        },
        swap: undefined,
        emittedEarlyCompactStart: false
      };
    }
    let c = t.abortController.signal;
    let u = (o !== undefined ? fU.get(o) : jya(t.agentId))?.status === "pending";
    if (u) {
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_start"
        }
      });
      t.onCompactEvent?.({
        type: "sdk_status",
        status: "compacting"
      });
    }
    let d = null;
    let p = false;
    if (o !== undefined) {
      d = await nEp(o, c);
      p = d !== null;
    }
    if (d ??= await nmo(t.agentId, c), d === null) {
      return a({
        kind: "none"
      }, u);
    }
    if (d.kind === "turn_aborted") {
      return a({
        kind: "aborted"
      }, u);
    }
    if (d.kind === "failed") {
      return a({
        kind: "failed",
        failure: d.failure,
        statusAtPTL: d.statusAtPTL
      }, u);
    }
    let m = omo(n, d.ready.precomputedAtUuid);
    if (m === null) {
      if (p) {
        logEvent("tengu_precompute_borrow_boundary_miss", {
          querySource: i
        });
      } else {
        EHn(d.ready, "boundary_uuid_missing", s);
      }
      return a({
        kind: "none"
      }, u);
    }
    let f = d.statusAtPTL === "pending" ? "pending" : "ready";
    return a({
      kind: "applied",
      swap: {
        compactResult: d.ready.result,
        preCompactHookDisplay: d.ready.preCompactHookDisplay,
        messagesSince: m,
        statusAtPTL: f,
        leadMs: r - d.ready.startedAt,
        totalMs: d.ready.readyDurationMs,
        borrowed: p,
        rehydrated: d.ready.rehydrated === true
      }
    }, u);
  }
  function rEp(e, t, n, r) {
    let o = e.kind === "applied" ? e.swap.statusAtPTL : e.kind === "failed" ? e.statusAtPTL : undefined;
    logEvent("tengu_precomputed_compact_consumed", {
      kind: e.kind,
      querySource: t,
      waitedMs: n,
      statusAtPTL: o == null ? undefined : o,
      trigger: r,
      ...(e.kind === "applied" && {
        borrowed: e.swap.borrowed,
        rehydrated: e.swap.rehydrated,
        precomputeTotalMs: Math.round(e.swap.totalMs)
      }),
      ...(e.kind === "failed" && {
        failureReason: e.failure.reason,
        failureCause: e.failure.cause,
        failureStatus: e.failure.status,
        failureAttempts: e.failure.attempts,
        failureDurationMs: e.failure.durationMs
      })
    });
  }
  function Mpt(e, t, n) {
    if (!Q4t()) {
      return;
    }
    logEvent("tengu_precomputed_compact_consumed", {
      kind: e,
      trigger: "manual",
      querySource: Vg(undefined),
      waitedMs: Math.round(n),
      statusAtPTL: (e === "applied" || e === "failed" ? t?.statusAtPTL : undefined) == null ? undefined : e === "applied" || e === "failed" ? t?.statusAtPTL : undefined,
      ...(e === "applied" && t?.kind === "ready" && {
        borrowed: false,
        rehydrated: t.ready.rehydrated === true,
        precomputeTotalMs: t.ready.readyDurationMs
      }),
      ...(e === "failed" && t?.kind === "failed" && {
        failureReason: t.failure.reason,
        failureCause: t.failure.cause,
        failureStatus: t.failure.status,
        failureAttempts: t.failure.attempts,
        failureDurationMs: t.failure.durationMs
      })
    });
  }
  function omo(e, t) {
    let n = e.findIndex(r => r.uuid === t);
    if (n === -1) {
      return null;
    }
    return e.slice(n + 1).filter(r => r.type !== "progress");
  }
  function EHn(e, t, n) {
    logEvent("tengu_precomputed_compact_discarded", {
      reason: t,
      ageMs: Math.round(performance.now() - e.startedAt),
      readyDurationMs: e.readyDurationMs,
      rehydrated: e.rehydrated === true,
      preCompactTokens: e.preCompactTokens,
      querySource: Vg(n)
    });
    logForDebugging(`precomputed compact: discarded (${t}, age ${Math.round(performance.now() - e.startedAt)}ms)`);
  }
  function vHn(e, t, n) {
    let r = Dpt(e);
    let o = fU.get(r);
    if (o?.status === "ready") {
      EHn(o, t, n);
    }
    o?.abortController.abort(new DOMException(t, "AbortError"));
    fU.delete(r);
    Gya(o);
    let s = r === "main" ? getSessionId() : undefined;
    if (s !== undefined && Xpo.vZc(s) && Zpo()) {
      THn(() => bHn(s));
    }
    if (t === "subagent_exit") {
      Jpo.delete(r);
      X4t.delete(r);
      Z9e.delete(`${r}:sdk_single_prompt_gate`);
      Z9e.delete(`${r}:subagent_estimate`);
      Z9e.delete(`${r}:subagent_final_turn`);
    }
  }
  var fU;
  var Jpo;
  var X4t;
  var Z9e;
  var Ypo;
  var qya;
  var Xpo;
  var wHn = __lazy(() => {
    at();
    Kp();
    je();
    dt();
    Sp();
    Rn();
    fa();
    zg();
    TO();
    ln();
    $n();
    Ot();
    d$();
    Hpo();
    Bya();
    fU = new Map();
    Jpo = new Map();
    X4t = new Map();
    Z9e = new Set();
    Ypo = Promise.resolve();
    qya = {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
    Xpo = new Set();
  });
  function Mde(e, t, n, r) {
    let o = $4e(e);
    if (vHn(n, "post_compact_cleanup", e), o) {
      if (iE.cache.clear?.(), resetGetMemoryFilesCache("compact"), clearSystemPromptSectionState(), r === undefined) {
        clearBetaHeaderLatches();
      }
      kya();
      wya(t ? NDe(t) : undefined);
    }
    if (o) {
      oEp.resetAutonomousLoopDelivered();
    }
    if (o && t) {
      let s = getTotalOutputTokens();
      t(i => {
        if (i.cacheMissAckedAtOutputTokens === s) {
          return i;
        }
        return {
          ...i,
          cacheMissAckedAtOutputTokens: s
        };
      });
    }
    clearSessionMessagesCache();
  }
  var oEp;
  var Npt = __lazy(() => {
    at();
    LG();
    bx();
    fa();
    kTe();
    wHn();
    oEp = (E9e(), __toCommonJS(T9e));
  });
  function Vya(e) {
    return e?.type === "assistant" && wTe(e);
  }
  function amo(e) {
    return e?.type === "assistant" && P$n(e);
  }
  function lmo(e) {
    return !e.hasAttempted && !Jdt(e.querySource) && (e.hasPrecomputedSwap === true || !gDe(e.querySource)) && Sx() && DX() && !e.aborted;
  }
  async function CHn(e) {
    let {
      hasAttempted: t,
      querySource: n,
      aborted: r,
      messages: o,
      cacheSafeParams: s,
      precomputed: i,
      precomputeOutcome: a,
      initialTokenGap: l,
      thresholdSource: c,
      spinnerHintText: u
    } = e;
    let d = a?.kind;
    let p = a?.kind === "failed" ? a.failure.cause : undefined;
    if (!lmo({
      hasAttempted: t,
      querySource: n,
      aborted: r,
      hasPrecomputedSwap: i !== undefined
    })) {
      return {
        result: null,
        hookBlocked: false
      };
    }
    let {
      toolUseContext: f
    } = s;
    let h = aO(f.options.mainLoopModel, getEffortValue(f));
    logEvent("tengu_reactive_compact_triggered", {
      ...(h && {
        effort_level: h
      }),
      querySource: Vg(n),
      precomputed: i !== undefined,
      precomputedKind: d == null ? undefined : d,
      precomputedFailureCause: p == null ? undefined : p,
      thresholdSource: c == null ? undefined : c
    });
    kpt(getToolPermissionContext(f), "summary");
    let g = e.userWaitStartedAt ?? performance.now();
    let {
      hookResult: y,
      summarize: _
    } = i ? {
      hookResult: {
        userDisplayMessage: i.preCompactHookDisplay,
        blockedBy: undefined
      },
      summarize: () => (f.onCompactEvent?.({
        type: "sdk_status",
        status: "compacting"
      }), RHn({
        compactResult: i.compactResult,
        messagesToPreserve: [...i.compactResult.messagesToPreserve, ...i.messagesSince],
        preCompactMessages: o,
        preCompactTokens: Ob(o),
        startTime: g,
        cacheSafeParams: s,
        querySource: n,
        trigger: "auto",
        thresholdSource: c,
        precomputed: true,
        precomputeTelemetry: {
          statusAtPTL: i.statusAtPTL,
          leadMs: i.leadMs,
          totalMs: i.totalMs,
          borrowed: i.borrowed,
          messagesSinceTokens: nR(i.messagesSince)
        }
      }))
    } : await (async () => {
      f.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "pre_compact"
        }
      });
      f.onCompactEvent?.({
        type: "sdk_status",
        status: "compacting"
      });
      let x = await executePreCompactHooks({
        trigger: "auto",
        customInstructions: null
      }, f.abortController.signal).catch(A => (Oe(A), {}));
      return {
        hookResult: x,
        summarize: () => cmo(o, s, {
          customInstructions: x.newCustomInstructions,
          userWaitStartedAt: g,
          querySource: n,
          initialTokenGap: l,
          precomputedKind: d,
          precomputedFailureCause: p,
          thresholdSource: c
        })
      };
    })();
    if (y.blockedBy) {
      logForDebugging(`Reactive compact blocked by PreCompact hook: ${y.blockedBy}`);
      f.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_end"
        }
      });
      f.onCompactEvent?.({
        type: "sdk_status",
        status: null
      });
      return {
        result: null,
        hookBlocked: true
      };
    }
    f.onCompactEvent?.({
      type: "compact_progress",
      event: {
        type: "compact_start",
        hintText: u
      }
    });
    let b = await _().catch(x => {
      let A = he(x);
      if (mU(A)) {
        logForDebugging(`Reactive compact API call failed: ${A}`, {
          level: "error"
        });
      } else {
        Oe(x);
      }
      return {
        ok: false,
        reason: "error",
        detail: A
      };
    });
    f.onCompactEvent?.({
      type: "compact_progress",
      event: {
        type: "compact_end"
      }
    });
    let S = Ob(o);
    if (!b.ok) {
      let x = b.reason === "error" ? b.detail ?? b.reason : b.reason;
      fOe({
        trigger: "auto",
        success: false,
        durationMs: performance.now() - g,
        preTokens: S,
        error: x
      });
      f.onCompactEvent?.({
        type: "sdk_status",
        status: null,
        metadata: {
          compactResult: "failed",
          compactError: x
        }
      });
      return {
        result: null,
        hookBlocked: false
      };
    }
    let E = b.result.boundaryMarker;
    if (fOe({
      trigger: "auto",
      success: true,
      durationMs: performance.now() - g,
      preTokens: S,
      postTokens: SS(E) ? E.compactMetadata.postTokens : undefined
    }), f.onCompactEvent?.({
      type: "sdk_status",
      status: null,
      metadata: {
        compactResult: "success"
      }
    }), Mde(n, f.setAppState, f.agentId, s.stickyBetas), $4e(n)) {
      Spt();
    }
    let C = [y.userDisplayMessage, b.result.userDisplayMessage].filter(Boolean).join(`
`) || undefined;
    return {
      result: {
        ...b.result,
        userDisplayMessage: C
      },
      hookBlocked: false
    };
  }
  async function cmo(e, t, n) {
    let r = Ob(e);
    let o = n?.userWaitStartedAt ?? performance.now();
    let s = n?.querySource;
    let i = n?.trigger ?? "auto";
    let a = await gHn(e, t, {
      customInstructions: n?.customInstructions,
      initialTokenGap: n?.initialTokenGap
    });
    if (!a.ok) {
      let l = aO(t.toolUseContext.options.mainLoopModel, getEffortValue(t.toolUseContext));
      let c = a.reason === "aborted" ? classifyAbortReasonForTelemetry(t.toolUseContext.abortController.signal.reason) : undefined;
      if (logEvent("tengu_reactive_compact_failed", {
        ...(l && {
          effort_level: l
        }),
        querySource: Vg(s),
        reason: a.reason,
        abortKind: c == null ? undefined : c,
        detail: a.detail ? Gq(a.detail).slice(0, 80) : undefined,
        trigger: i,
        preCompactTokens: r,
        attempts: a.attempts,
        totalGroups: a.totalGroups,
        durationMs: Math.round(performance.now() - o),
        precomputedKind: n?.precomputedKind == null ? undefined : n?.precomputedKind,
        precomputedFailureCause: n?.precomputedFailureCause,
        thresholdSource: n?.thresholdSource == null ? undefined : n?.thresholdSource,
        manualPrecomputeReuse: n?.manualPrecomputeReuse == null ? undefined : n?.manualPrecomputeReuse
      }), c !== undefined) {
        if (isUserAttributableAbortKind(c)) {
          Et("compact_reactive", "compact_reactive_aborted");
        } else {
          Ae("compact_reactive", `compact_reactive_aborted_${c}`);
        }
      } else {
        Ae("compact_reactive", `compact_reactive_${a.reason}`);
      }
      return {
        ok: false,
        reason: a.reason,
        detail: a.detail
      };
    }
    return RHn({
      compactResult: a.result,
      messagesToPreserve: a.result.messagesToPreserve,
      preCompactMessages: e,
      preCompactTokens: r,
      startTime: o,
      cacheSafeParams: t,
      querySource: s,
      trigger: i,
      thresholdSource: n?.thresholdSource,
      precomputed: false,
      manualPrecomputeReuse: n?.manualPrecomputeReuse
    });
  }
  async function RHn(e) {
    let {
      compactResult: t,
      preCompactMessages: n,
      startTime: r,
      cacheSafeParams: o,
      querySource: s,
      trigger: i,
      thresholdSource: a,
      precomputed: l,
      manualPrecomputeReuse: c,
      precomputeTelemetry: u
    } = e;
    let {
      toolUseContext: d
    } = o;
    let p = $4e(s);
    let m = e.preCompactTokens ?? Ob(n);
    let f = p4t(d.readFileState);
    if (d.readFileState.clear(), d.loadedNestedMemoryPaths) {
      for (let M of Object.keys(d.loadedNestedMemoryPaths)) {
        delete d.loadedNestedMemoryPaths[M];
      }
    }
    if (W9e(d.memorySelector), BX()) {
      $4t(s ?? "compact", d.agentId);
    }
    if (p) {
      markPostCompaction();
      await flushAppendEntryQueues();
      reAppendSessionMetadata();
    }
    let h = n.at(-1)?.uuid;
    let g = eWt(i, m, h);
    if (g.compactMetadata.durationMs = Math.round(performance.now() - r), l) {
      g.compactMetadata.precomputed = true;
    }
    let y = extractDiscoveredToolNames(n);
    if (y.size > 0) {
      g.compactMetadata.preCompactDiscoveredTools = [...y].sort();
    }
    let _ = e.messagesToPreserve.map(e5e);
    let b = await sEp(f, d, _).catch(M => (Oe(M), {
      attachments: [],
      hookResults: []
    }));
    d.onCompactEvent?.({
      type: "compact_progress",
      event: {
        type: "hooks_start",
        hookType: "post_compact"
      }
    });
    let S = await executePostCompactHooks({
      trigger: i,
      compactSummary: t.summaryText
    }, d.abortController.signal);
    let E = umo(g, t.summaryMessages.at(-1).uuid, _, n);
    let C = {
      boundaryMarker: E,
      summaryMessages: t.summaryMessages,
      messagesToKeep: _,
      attachments: b.attachments,
      hookResults: b.hookResults,
      userDisplayMessage: S.userDisplayMessage,
      preCompactTokenCount: m
    };
    let x = nR(ATe(C));
    E.compactMetadata.postTokens = x;
    E4t(E, n);
    let A = (() => {
      try {
        return J$n(Y$n(n));
      } catch (M) {
        Oe(M);
        return {};
      }
    })();
    let k = t.totalUsage;
    let I = k.input_tokens + k.cache_creation_input_tokens + k.cache_read_input_tokens;
    let O = aO(d.options.mainLoopModel, getEffortValue(d));
    Pe("compact_reactive");
    logEvent("tengu_reactive_compact_succeeded", {
      ...(O && {
        effort_level: O
      }),
      querySource: Vg(s),
      attempts: t.attempt,
      groupsPreserved: t.groupsPreserved,
      totalGroups: t.totalGroups,
      preservedUuidCount: E.compactMetadata.preservedMessages?.uuids.length ?? 0,
      preservedMessageCount: _.length,
      forkAssistantMessageCount: t.forkAssistantMessageCount,
      trigger: i,
      thresholdSource: a == null ? undefined : a,
      preCompactTokens: m,
      postCompactTokens: x,
      restoredAttachmentCount: b.attachments.length + b.hookResults.length,
      durationMs: Math.round(performance.now() - r),
      userWaitMs: Math.round(performance.now() - r),
      precomputed: l,
      manualPrecomputeReuse: c == null ? undefined : c,
      precomputeBorrowed: u?.borrowed,
      precomputeStatusAtPTL: u?.statusAtPTL == null ? undefined : u?.statusAtPTL,
      precomputeLeadMs: u ? Math.round(u.leadMs) : undefined,
      precomputeTotalMs: u ? Math.round(u.totalMs) : undefined,
      messagesSincePrecompute: l ? _.length - t.messagesToPreserve.length : undefined,
      messagesSinceTokens: u?.messagesSinceTokens,
      compactionInputTokens: k.input_tokens,
      compactionOutputTokens: k.output_tokens,
      compactionCacheReadTokens: k.cache_read_input_tokens,
      compactionCacheCreationTokens: k.cache_creation_input_tokens,
      compactionTotalTokens: I + k.output_tokens,
      cacheHitRate: I > 0 ? k.cache_read_input_tokens / I : 0,
      ...A
    });
    return {
      ok: true,
      result: C
    };
  }
  function e5e(e) {
    if (e.type !== "assistant") {
      return e;
    }
    return {
      ...e,
      message: {
        ...e.message,
        usage: {
          ...e.message.usage,
          input_tokens: 0,
          output_tokens: 0,
          cache_creation_input_tokens: 0,
          cache_read_input_tokens: 0
        }
      }
    };
  }
  async function sEp(e, t, n) {
    let [r, o] = await Promise.all([kHn(e, t, 5, n), OHn(t)]);
    let s = t.agentId;
    let i = AHn(s);
    let a = await PHn(t);
    let l = IHn(s);
    let c = [...getDeferredToolsDeltaAttachment(t.options.tools, t.options.mainLoopModel, n, {
      callSite: "reactive_compact"
    }), ...getAgentListingDeltaAttachment(t, n), ...getMcpInstructionsDeltaAttachment(t.options.mcpClients, t.options.tools, t.options.mainLoopModel, n)].map(d => createAttachmentMessage(d));
    t.onCompactEvent?.({
      type: "compact_progress",
      event: {
        type: "hooks_start",
        hookType: "session_start"
      }
    });
    let u = await MV("compact", {
      model: t.options.mainLoopModel
    });
    return {
      attachments: [...r, ...o, ...(i ? [i] : []), ...(a ? [a] : []), ...(l ? [l] : []), ...c],
      hookResults: u
    };
  }
  var t5e = __lazy(() => {
    at();
    Kp();
    rR();
    mpo();
    Sl();
    je();
    Fp();
    dt();
    qI();
    Sp();
    Rn();
    ro();
    DDe();
    fa();
    yS();
    TO();
    foe();
    ln();
    Ot();
    vO();
    ADe();
    X9e();
    dHn();
    IV();
    d$();
    Dde();
    Hpo();
    Tpt();
    Npt();
  });
  var zya = {};
  __export(zya, {
    asSystemPrompt: () => asSystemPrompt
  });
  async function Yya({
    tools: e,
    signal: t,
    isNonInteractiveSession: n,
    lastAssistantText: r,
    agentContext: o
  }) {
    if (e.length === 0) {
      return null;
    }
    try {
      let s = e.map(c => {
        let u = Kya(c.input, 300);
        let d = Kya(c.output, 300);
        return `Tool: ${c.name}
Input: ${u}
Output: ${d}`;
      }).join(`

`);
      let i = r ? `User's intent (from assistant's last message): ${r.slice(0, 200)}

` : "";
      let l = (await RO({
        systemPrompt: [iEp],
        userPrompt: `${i}Tools completed:

${s}

Label:`,
        signal: t,
        options: {
          querySource: "tool_use_summary_generation",
          enablePromptCaching: false,
          agents: [],
          isNonInteractiveSession: n,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          agentContext: o
        }
      })).message.content.filter(c => c.type === "text").map(c => c.type === "text" ? c.text : "").join("").trim();
      if (!l) {
        Et("summary_tool_use_generate", "empty_response");
        return null;
      }
      Pe("summary_tool_use_generate");
      return l;
    } catch (s) {
      if (t.aborted) {
        return null;
      }
      let i = sr(s);
      i.cause = {
        errorId: "tool_use_summary_generation_failed"
      };
      Oe(i);
      Ae("summary_tool_use_generate", "api_failed");
      return null;
    }
  }
  function Kya(e, t) {
    try {
      let n = De(e);
      if (n.length <= t) {
        return n;
      }
      return n.slice(0, t - 3) + "...";
    } catch {
      return "[unable to serialize]";
    }
  }
  var iEp = `Write a short summary label describing what these tool calls accomplished. It appears as a single-line row in a mobile app and truncates around 30 characters, so think git-commit-subject, not sentence.

Keep the verb in past tense and the most distinctive noun. Drop articles, connectors, and long location context first.

Examples:
- Searched in auth/
- Fixed NPE in UserService
- Created signup endpoint
- Read config.json
- Ran failing tests`;
  var Jya = __lazy(() => {
    dt();
    Rn();
    ln();
    aE();
  });
  function lEp(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    return "sessionId" in e && typeof e.sessionId === "string" && "pid" in e && typeof e.pid === "number";
  }
  function Fpt() {
    return Qya.join(er(), "computer-use.lock");
  }
  async function tWt() {
    try {
      let e = await PTe.readFile(Fpt(), "utf8");
      let t = qt(e);
      return lEp(t) ? t : undefined;
    } catch {
      return;
    }
  }
  function Zya(e) {
    try {
      process.kill(e, 0);
      return true;
    } catch {
      return false;
    }
  }
  async function pmo(e) {
    try {
      await PTe.writeFile(Fpt(), De(e), {
        flag: "wx"
      });
      return true;
    } catch (t) {
      if (en(t) === "EEXIST") {
        return false;
      }
      throw t;
    }
  }
  function mmo() {
    nWt?.();
    nWt = Ti(async () => {
      await cEp();
    });
  }
  async function e_a() {
    let e = await tWt();
    if (!e) {
      return {
        kind: "free"
      };
    }
    if (fmo()) {
      return {
        kind: "held_by_self"
      };
    }
    if (e.sessionId === getSessionId()) {
      return {
        kind: "held_by_self"
      };
    }
    if (Zya(e.pid)) {
      return {
        kind: "blocked",
        by: e.sessionId
      };
    }
    logForDebugging(`Recovering stale computer-use lock from session ${e.sessionId} (PID ${e.pid})`);
    await PTe.unlink(Fpt()).catch(() => {});
    return {
      kind: "free"
    };
  }
  function fmo() {
    return nWt !== undefined;
  }
  async function t_a() {
    let e = getSessionId();
    let t = {
      sessionId: e,
      pid: process.pid,
      acquiredAt: Date.now()
    };
    if (await Ys().mkdir(er()), await pmo(t)) {
      mmo();
      Pe("computeruse_lock_acquire");
      return dmo;
    }
    let n = await tWt();
    if (!n) {
      if (await PTe.unlink(Fpt()).catch(() => {}), await pmo(t)) {
        mmo();
        Et("computeruse_lock_acquire", "stale_recovered");
        return dmo;
      }
      Ae("computeruse_lock_acquire", "lock_held");
      return {
        kind: "blocked",
        by: (await tWt())?.sessionId ?? "unknown"
      };
    }
    if (fmo()) {
      Pe("computeruse_lock_acquire");
      return Xya;
    }
    if (n.sessionId === e) {
      Pe("computeruse_lock_acquire");
      return Xya;
    }
    if (Zya(n.pid)) {
      Ae("computeruse_lock_acquire", "lock_held");
      return {
        kind: "blocked",
        by: n.sessionId
      };
    }
    if (logForDebugging(`Recovering stale computer-use lock from session ${n.sessionId} (PID ${n.pid})`), await PTe.unlink(Fpt()).catch(() => {}), await pmo(t)) {
      mmo();
      Et("computeruse_lock_acquire", "stale_recovered");
      return dmo;
    }
    Ae("computeruse_lock_acquire", "lock_held");
    return {
      kind: "blocked",
      by: (await tWt())?.sessionId ?? "unknown"
    };
  }
  async function cEp() {
    let e = fmo();
    nWt?.();
    nWt = undefined;
    let t = await tWt();
    if (!t || !e && t.sessionId !== getSessionId()) {
      return false;
    }
    try {
      await PTe.unlink(Fpt());
      logForDebugging("Released computer-use lock");
      return true;
    } catch {
      return false;
    }
  }
  function MHn() {
    return DHn;
  }
  function n_a() {
    if (DHn) {
      return false;
    }
    DHn = true;
    return true;
  }
  function NHn() {
    DHn = false;
  }
  var PTe;
  var Qya;
  var nWt;
  var dmo;
  var Xya;
  var DHn = false;
  var hmo = __lazy(() => {
    at();
    ln();
    _b();
    hd();
    je();
    gn();
    dt();
    PTe = require("fs/promises");
    Qya = require("path");
    dmo = {
      kind: "acquired",
      fresh: true
    };
    Xya = {
      kind: "acquired",
      fresh: false
    };
  });